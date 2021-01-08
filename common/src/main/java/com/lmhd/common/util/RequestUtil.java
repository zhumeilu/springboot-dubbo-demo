package com.lmhd.common.util;

import com.alibaba.fastjson.JSONObject;
import com.lmhd.common.constant.CharsetConstants;
import com.lmhd.common.constant.HttpMethodConstants;
import com.lmhd.common.exception.LmhdException;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.zip.GZIPInputStream;

/**
 * request工具类
 * Created by LMHD.TECGROUP on 2016/12/12.
 */
public class RequestUtil {

	protected static final Logger _log = LoggerFactory.getLogger(RequestUtil.class);

	/**
	 * 移除request指定参数
	 *
	 * @param request
	 * @param paramName
	 * @return
	 */
	public String removeParam(HttpServletRequest request, String paramName) {
		String queryString = "";
		Enumeration keys = request.getParameterNames();
		while (keys.hasMoreElements()) {
			String key = (String) keys.nextElement();
			if (key.equals(paramName)) {
				continue;
			}
			if (queryString.equals("")) {
				queryString = key + "=" + request.getParameter(key);
			} else {
				queryString += "&" + key + "=" + request.getParameter(key);
			}
		}
		return queryString;
	}

	/**
	 * 获取请求basePath
	 *
	 * @param request
	 * @return
	 */
	public static String getBasePath(HttpServletRequest request) {
		StringBuffer basePath = new StringBuffer();
		String scheme = request.getScheme();
		String domain = request.getServerName();
		int port = request.getServerPort();
		basePath.append(scheme);
		basePath.append("://");
		basePath.append(domain);
		if ("http".equalsIgnoreCase(scheme) && 80 != port) {
			basePath.append(":").append(String.valueOf(port));
		} else if ("https".equalsIgnoreCase(scheme) && port != 443) {
			basePath.append(":").append(String.valueOf(port));
		}
		return basePath.toString();
	}

	/**
	 * 获取ip工具类，除了getRemoteAddr，其他ip均可伪造
	 *
	 * @param request
	 * @return
	 */
	public static String getIpAddr(HttpServletRequest request) {
		String ip = request.getHeader("Cdn-Src-Ip");    // 网宿cdn的真实ip
		if (ip == null || ip.length() == 0 || " unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("HTTP_CLIENT_IP");   // 蓝讯cdn的真实ip
		}
		if (ip == null || ip.length() == 0 || " unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("X-Forwarded-For");  // 获取代理ip
		}
		if (ip == null || ip.length() == 0 || " unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("Proxy-Client-IP"); // 获取代理ip
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("WL-Proxy-Client-IP"); // 获取代理ip
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getRemoteAddr(); // 获取真实ip
		}
		return ip;
	}

	/**
	 * 获取QueryString的参数，并使用URLDecoder以UTF-8格式转码。如果请求是以post方法提交的，
	 * 那么将通过HttpServletRequest#getParameter获取。
	 *
	 * @param request web请求
	 * @param name    参数名称
	 * @return
	 */
	public static String getQueryParam(HttpServletRequest request, String name) {
		if (StringUtils.isBlank(name)) {
			return null;
		}
		if (request.getMethod().equalsIgnoreCase(HttpMethodConstants.POST)) {
			return request.getParameter(name);
		}
		String s = request.getQueryString();
		if (StringUtils.isBlank(s)) {
			return null;
		}
		try {
			s = URLDecoder.decode(s, CharsetConstants.UTF_8);
		} catch (UnsupportedEncodingException e) {
			_log.error("encoding " + CharsetConstants.UTF_8 + " not support?", e);
		}
		String[] values = parseQueryString(s).get(name);
		if (values != null && values.length > 0) {
			return values[values.length - 1];
		} else {
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	public static Map<String,Object> getQueryParams(HttpServletRequest request) {
		Map<String,String[]> map;
		if (request.getMethod().equalsIgnoreCase(HttpMethodConstants.POST)) {
			map = request.getParameterMap();
		} else {
			String s = request.getQueryString();
			if (StringUtils.isBlank(s)) {
				return new HashMap<String,Object>();
			}
			try {
				s = URLDecoder.decode(s, CharsetConstants.UTF_8);
			} catch (UnsupportedEncodingException e) {
				_log.error("encoding " + CharsetConstants.UTF_8 + " not support?", e);
			}
			map = parseQueryString(s);
		}
		Map<String,Object> params = new HashMap<String,Object>(map.size());
		int len;
		for (Map.Entry<String,String[]> entry : map.entrySet()) {
			len = entry.getValue().length;
			if (len == 1) {
				params.put(entry.getKey(), entry.getValue()[0]);
			} else if (len > 1) {
				params.put(entry.getKey(), entry.getValue());
			}
		}
		return params;
	}

	/**
	 * Parses a query string passed from the client to the server and builds a
	 * <code>HashTable</code> object with key-value pairs. The query string
	 * should be in the form of a string packaged by the GET or HttpMethodConstants.POST method,
	 * that is, it should have key-value pairs in the form <i>key=value</i>,
	 * with each pair separated from the next by a &amp; character.
	 * A key can appear more than once in the query string with different
	 * values. However, the key appears only once in the hashtable, with its
	 * value being an array of strings containing the multiple values sent by
	 * the query string.
	 * The keys and values in the hashtable are stored in their decoded form, so
	 * any + characters are converted to spaces, and characters sent in
	 * hexadecimal notation (like <i>%xx</i>) are converted to ASCII characters.
	 *
	 * @param s a string containing the query to be parsed
	 * @return a <code>HashTable</code> object built from the parsed key-value
	 * pairs
	 * @throws IllegalArgumentException if the query string is invalid
	 */
	public static Map<String,String[]> parseQueryString(String s) {
		String valArray[] = null;
		if (s == null) {
			throw new IllegalArgumentException();
		}
		Map<String,String[]> ht = new HashMap<String,String[]>();
		StringTokenizer st = new StringTokenizer(s, "&");
		while (st.hasMoreTokens()) {
			String pair = (String) st.nextToken();
			int pos = pair.indexOf('=');
			if (pos == -1) {
				continue;
			}
			String key = pair.substring(0, pos);
			String val = pair.substring(pos + 1, pair.length());
			if (ht.containsKey(key)) {
				String oldVals[] = (String[]) ht.get(key);
				valArray = new String[oldVals.length + 1];
				for (int i = 0; i < oldVals.length; i++) {
					valArray[i] = oldVals[i];
				}
				valArray[oldVals.length] = val;
			} else {
				valArray = new String[1];
				valArray[0] = val;
			}
			ht.put(key, valArray);
		}
		return ht;
	}

	public static Map<String,String> getRequestMap(HttpServletRequest request,
			String prefix) {
		return getRequestMap(request, prefix, false);
	}

	public static Map<String,String> getRequestMapWithPrefix(
            HttpServletRequest request, String prefix) {
		return getRequestMap(request, prefix, true);
	}

	@SuppressWarnings("unchecked")
	private static Map<String,String> getRequestMap(
            HttpServletRequest request, String prefix, boolean nameWithPrefix) {
		Map<String,String> map = new HashMap<String,String>();
		Enumeration<String> names = request.getParameterNames();
		String name, key, value;
		while (names.hasMoreElements()) {
			name = names.nextElement();
			if (name.startsWith(prefix)) {
				key = nameWithPrefix ? name : name.substring(prefix.length());
				value = StringUtils.join(request.getParameterValues(name), ',');
				map.put(key, value);
			}
		}
		return map;
	}

	public static HttpServletRequest getRequest() {
		return ((ServletRequestAttributes) RequestContextHolder
				.getRequestAttributes()).getRequest();
	}

	public static HttpServletResponse getResponse() {
		return ((ServletRequestAttributes) RequestContextHolder
				.getRequestAttributes()).getResponse();
	}

	public static ServletContext getServletContext() {
		return ContextLoader.getCurrentWebApplicationContext()
				.getServletContext();
	}

	/**
	 * 获取请求报文
	 *
	 * @return
	 * @throws UnsupportedEncodingException
	 */
	public static Map<String, String> getRequestParameterMap() {
		HttpServletRequest request = RequestUtil.getRequest();
		Map<String, String> parameters = new HashMap<>();
		for (Enumeration<String> keys = request.getParameterNames(); keys.hasMoreElements(); ) {
			String key = (String) keys.nextElement();
			String[] values = request.getParameterValues(key);
			String value = ((values == null) ? null : values[0]);
			//            // 根据UTF-8解码
			//            value = URLDecoder.decode(value, charset);
			parameters.put(key, value);
		}
		return parameters;
	}


	/**
	 * @return
	 * @throws Exception
	 * @discription 读取接口post数据
	 * @author hanhuaiwei
	 * @created 2016年12月19日 下午3:17:23
	 */
	public static JSONObject readPost() throws Exception {
		HttpServletRequest request = RequestUtil.getRequest();
		String acceptEncoding = request.getHeader("Content-Encoding");
		String str;
		try {
			if ("gzip".equalsIgnoreCase(acceptEncoding)) {
				// 解压缩
				ByteArrayOutputStream outs = new ByteArrayOutputStream(4096);
				GZIPInputStream gunzip = new GZIPInputStream(
						request.getInputStream());
				byte[] buffer = new byte[1024];
				int n;
				while ((n = gunzip.read(buffer)) >= 0) {
					outs.write(buffer, 0, n);
				}
				str = org.springframework.util.StringUtils.trimLeadingWhitespace(org.apache.commons.io.IOUtils.toString(
						outs.toByteArray(), "utf-8"));
			} else {
				str = org.springframework.util.StringUtils.trimLeadingWhitespace(org.apache.commons.io.IOUtils.toString(
						request.getInputStream(), "utf-8"));
			}
		} catch (Exception e) {
			_log.info("------读取post数据异常:------", e);
			throw new LmhdException("读取post数据异常");
		}
		if (org.springframework.util.StringUtils.isEmpty(str) || !str.startsWith("{") || !str.endsWith("}")) {
			throw new LmhdException("请求数据不符合json规范");
		}
		return JSONObject.parseObject(str);
	}

	/**
	 * @return
	 * @throws Exception
	 * @discription 读取接口post数据
	 * @author hanhuaiwei
	 * @created 2016年12月19日 下午3:17:23
	 */
	public static String readPostString() throws Exception {
		HttpServletRequest request = RequestUtil.getRequest();
		String acceptEncoding = request.getHeader("Content-Encoding");
		String str;
		try {
			if ("gzip".equalsIgnoreCase(acceptEncoding)) {
				// 解压缩
				ByteArrayOutputStream outs = new ByteArrayOutputStream(4096);
				GZIPInputStream gunzip = new GZIPInputStream(
						request.getInputStream());
				byte[] buffer = new byte[1024];
				int n;
				while ((n = gunzip.read(buffer)) >= 0) {
					outs.write(buffer, 0, n);
				}
				str = org.springframework.util.StringUtils.trimLeadingWhitespace(org.apache.commons.io.IOUtils.toString(
						outs.toByteArray(), "utf-8"));
			} else {
				str = org.springframework.util.StringUtils.trimLeadingWhitespace(org.apache.commons.io.IOUtils.toString(
						request.getInputStream(), "utf-8"));
			}
		} catch (Exception e) {
			_log.info("------读取post数据异常:------", e);
			throw new LmhdException("读取post数据异常");
		}
		if (org.springframework.util.StringUtils.isEmpty(str) || !str.startsWith("{") || !str.endsWith("}")) {
			throw new LmhdException("请求数据不符合json规范");
		}
		return str;
	}
}
