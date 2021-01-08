package com.lmhd.common.base;

import com.lmhd.common.util.Utils;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.zip.GZIPInputStream;

/**
 * 控制器基类
 * Created by LMHD.TECGROUP on 2017/2/4.
 */
public abstract class BaseController {

	private final static Logger              _log = LoggerFactory.getLogger(BaseController.class);
	@Autowired
	protected            HttpServletRequest  request;
	@Autowired
	protected            HttpServletResponse response;

	protected String readPost() throws Exception {
		String acceptEncoding = request.getHeader("Content-Encoding");
		String str = "";
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
				str = StringUtils.trimLeadingWhitespace(IOUtils.toString(
						outs.toByteArray(), "utf-8"));
			} else {
				str = StringUtils.trimLeadingWhitespace(IOUtils.toString(
						request.getInputStream(), "utf-8"));
			}
		} catch (Exception e) {
			_log.info("------读取post数据异常:------", e);
			throw new RuntimeException("读取post数据异常");
		}
		_log.info("json:" + str);
		if (StringUtils.isEmpty(str)) {
			throw new RuntimeException("读取post数据为空");
		}
		return str;
	}

	protected Map readForm() {
		//获取支付宝POST过来反馈信息
		Map<String,Object> params = new HashMap<>();
		Map requestParams = request.getParameterMap();
		for (Iterator iter = requestParams.keySet().iterator(); iter.hasNext(); ) {
			String name = (String) iter.next();
			String[] values = (String[]) requestParams.get(name);
			String valueStr = "";
			for (int i = 0; i < values.length; i++) {
				valueStr = (i == values.length - 1) ? valueStr + values[i]
						: valueStr + values[i] + ",";
			}
			params.put(name, valueStr);
		}
		return params;
	}
	/**
	 * 统一异常处理
	 *
	 * @param request
	 * @param response
	 * @param exception
	 */
	//	@ExceptionHandler
	//	public String exceptionHandler(HttpServletRequest request, HttpServletResponse response, Exception exception) {
	//		_log.error("统一异常处理：", exception);
	//		request.setAttribute("ex", exception);
	//		if (null != request.getHeader("X-Requested-With") && request.getHeader("X-Requested-With").equalsIgnoreCase("XMLHttpRequest")) {
	//			request.setAttribute("requestHeader", "ajax");
	//		}
	//		if (exception instanceof RuntimeException) {
	//			return "/error/500.jsp";
	//		}
	//		return "/error/error.jsp";
	//	}

	/**
	 * 返回jsp视图
	 *
	 * @param path
	 * @return
	 */
	public static String jsp(String path) {
		return path.concat(".jsp");
	}

	/**
	 * 获取请求IP
	 */
	public String getIpAddr() {
		return Utils.getRemortIP(request);
	}
}
