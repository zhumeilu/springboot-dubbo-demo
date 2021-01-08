package com.lmhd.common.util;

import org.apache.http.*;
import org.apache.http.client.config.CookieSpecs;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.socket.LayeredConnectionSocketFactory;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import java.net.URI;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.*;
import java.util.Map.Entry;

/**
 * Title: HttpsPoolClientUtils.java Description: 通用的http请求工具类
 *
 * @author
 * @created 2017年5月2日
 */
public class HttpsPoolClientUtils {

	protected static     Logger                             logger             = LoggerFactory.getLogger(HttpsPoolClientUtils.class);
	// 读取超时
	private final static int                                SOCKET_TIMEOUT     = 20000;
	// 连接超时
	private final static int                                CONNECTION_TIMEOUT = 20000;
	// 每个HOST的最大连接数量
	private final static int                                MAX_CONN_PRE_HOST  = 32;
	// 连接池的最大连接数
	private final static int                                MAX_CONN           = 60;
	// 连接池
	private final static PoolingHttpClientConnectionManager httpConnectionManager;
	// 参数
	private final static RequestConfig                      config;
	// 单例的httpclient
	private static       CloseableHttpClient                httpclient;

	static {
		// 设置http请求的基础参数
		config = RequestConfig.custom()
				.setCookieSpec(CookieSpecs.STANDARD_STRICT)
				.setSocketTimeout(SOCKET_TIMEOUT)
				.setConnectTimeout(CONNECTION_TIMEOUT)
				.setConnectionRequestTimeout(CONNECTION_TIMEOUT).build();
		try {
			SSLContext ctx = SSLContext.getInstance("TLS");
			X509TrustManager tm = new X509TrustManager() {

				public X509Certificate[] getAcceptedIssuers() {
					return null;
				}

				public void checkClientTrusted(X509Certificate[] arg0,
						String arg1) throws CertificateException {
				}

				public void checkServerTrusted(X509Certificate[] arg0,
						String arg1) throws CertificateException {
				}
			};
			ctx.init(null, new TrustManager[] { tm }, null);
			LayeredConnectionSocketFactory sslsf = new SSLConnectionSocketFactory(
					ctx);
			// 设置访问协议
			Registry<ConnectionSocketFactory> socketFactoryRegistry = RegistryBuilder
					.<ConnectionSocketFactory>create()
					.register("https", sslsf)
					.register("http", new PlainConnectionSocketFactory())
					.build();
			// 多连接的线程安全的管理器
			httpConnectionManager = new PoolingHttpClientConnectionManager(
					socketFactoryRegistry);
			httpConnectionManager.setDefaultMaxPerRoute(MAX_CONN_PRE_HOST); // 每个主机的最大并行链接数
			httpConnectionManager.setMaxTotal(MAX_CONN); // 客户端总并行链接最大数
		} catch (Exception ex) {
			throw new RuntimeException();
		}
	}

	private HttpsPoolClientUtils() {
	}

	;

	/**
	 * @return
	 * @discription 获取单例的httpclient
	 * @author
	 * @created 2017年5月2日
	 */
	public static CloseableHttpClient getHttpsClient() {
		if (null == httpclient) {
			httpclient = HttpClients.custom()
					.setConnectionManager(httpConnectionManager)
					.setDefaultRequestConfig(config)
					.setRetryHandler((exception, executionCount, context) -> {
						if (executionCount > 2) {
							logger.warn("Maximum tries reached for client http pool ");
							return false;
						}
						if (exception instanceof NoHttpResponseException     //NoHttpResponseException 重试
							//              || exception instanceof SocketTimeoutException    //响应超时不重试，避免造成业务数据不一致
						) {
							logger.warn("NoHttpResponseException on " + executionCount + " call");
							return true;
						}
						return false;
					}).build();
		}
		return httpclient;
	}

	/**
	 * @param url
	 * @param headers
	 * @param body
	 * @param charset
	 * @return
	 * @throws Exception
	 * @discription http/https发送get请求
	 * @author
	 * @created 2016-1-25
	 */
	public static String httpGet(String url, Map<String,Object> headers,
			Map<String,Object> body, String mimeType, String charset) throws Exception {
		httpclient = getHttpsClient();
		HttpGet get = new HttpGet();
		CloseableHttpResponse response = null;
		try {
			setHeaders(get, headers);
			UrlEncodedFormEntity entity = setParams(body, mimeType, charset);
			if (entity != null) {
				get.setURI(new URI(url + "?" + EntityUtils.toString(entity)));
			} else {
				get.setURI(new URI(url));
			}
			response = execute(get);
			String result = getResult(response, charset);
			return result;
		} finally {
			get.releaseConnection();
			if (response != null) {
				response.close();
			}
		}
	}

	/**
	 * @param url      请求地址
	 * @param headers  请求头文件
	 * @param body     请求数据
	 * @param mimeType 请求的数据格式
	 * @param charset  请求的字符编码格式
	 * @return
	 * @throws Exception
	 * @discription 发送httppost请求
	 * @author
	 * @created 2017年5月2日
	 */
	public static String httpPost(String url, Map<String,Object> headers,
			String body, String mimeType, String charset) throws Exception {
		httpclient = getHttpsClient();
		HttpPost post = new HttpPost(url);
		CloseableHttpResponse response = null;
		try {
			setHeaders(post, headers);
			post.setEntity(new StringEntity(body, ContentType.create(mimeType, charset)));
			logger.info("URl：\n" + url);
			logger.info("Header数据：\n" + headers);
			logger.info("post请求的数据：\n" + body);
			response = execute(post);
			String result = getResult(response, charset);
			return result;
		} finally {
			post.releaseConnection();
			if (response != null) {
				response.close();
			}
		}
	}

	/**
	 * @param url  请求地址
	 * @param body 请求数据
	 * @return
	 * @throws Exception
	 * @discription 发送httppost请求
	 * @author
	 * @created 2017年5月2日
	 */
	public static String httpPost(String body, String url) throws Exception {
		return httpPost(url, new HashMap<String,Object>(), body, "application/json", "utf-8");
	}

	/**
	 * @param url  请求地址
	 * @param body 请求数据
	 * @return
	 * @throws Exception
	 * @discription 发送httppost请求
	 * @author
	 * @created 2017年5月2日
	 */
	public static String httpPost(String body, String url, Integer connTimeout, Integer readTimeout) throws Exception {
		return httpPost(url, new HashMap<String,Object>(), body, "application/json", "utf-8", connTimeout, readTimeout);
	}

	/**
	 * @param url      请求地址
	 * @param headers  请求头文件
	 * @param body     请求数据
	 * @param mimeType 请求的数据格式
	 * @param charset  请求的字符编码格式
	 * @return
	 * @throws Exception
	 * @discription 发送httppost请求
	 * @author
	 * @created 2017年5月2日
	 */
	public static String httpPost(String url, Map<String,Object> headers,
			String body, String mimeType, String charset, Integer connTimeout, Integer readTimeout) throws Exception {
		httpclient = getHttpsClient();
		HttpPost post = new HttpPost(url);
		CloseableHttpResponse response = null;
		try {
			setHeaders(post, headers);
			post.setEntity(new StringEntity(body, ContentType.create(mimeType, charset)));
			// 设置参数
			RequestConfig.Builder customReqConf = RequestConfig.custom();
			if (connTimeout != null) {
				customReqConf.setConnectTimeout(connTimeout);
			}
			if (readTimeout != null) {
				customReqConf.setSocketTimeout(readTimeout);
			}
			post.setConfig(customReqConf.build());
			logger.info("URl：" + url);
			logger.info("Header数据：" + headers);
			logger.info("post请求的数据：" + body);
			response = execute(post);
			String result = getResult(response, charset);
			return result;
		} finally {
			post.releaseConnection();
			if (response != null) {
				response.close();
			}
		}
	}

	/**
	 * @param url      请求地址
	 * @param headers  请求头文件
	 * @param body     请求数据
	 * @param mimeType 请求的数据格式
	 * @param charset  请求的字符编码格式
	 * @return
	 * @throws Exception
	 * @discription 发送httppost请求
	 * @author
	 * @created 2017年5月2日
	 */
	public static String httpPost(String url, Map<String,Object> headers,
			Map<String,Object> body, String mimeType, String charset)
			throws Exception {
		httpclient = getHttpsClient();
		HttpPost post = new HttpPost(url);
		CloseableHttpResponse response = null;
		try {
			setHeaders(post, headers);
			UrlEncodedFormEntity entity = setParams(body, mimeType, charset);
			if (entity != null) {
				post.setEntity(entity);
			}
			logger.info("Header数据：" + headers);
			logger.info("post请求的数据：" + body);
			response = execute(post);
			String result = getResult(response, charset);
			return result;
		} finally {
			post.releaseConnection();
			if (response != null) {
				response.close();
			}
		}
	}

	/**
	 * 设置请求参数
	 *
	 * @param body
	 * @param mimeType
	 * @param charset
	 * @throws Exception
	 */
	private static UrlEncodedFormEntity setParams(Map<String,Object> body, String mimeType, String charset) throws Exception {
		if (body != null && body.size() > 0) {
			Set<Entry<String,Object>> entrySet = body.entrySet();
			Iterator<Entry<String,Object>> iterator = entrySet.iterator();
			List<NameValuePair> params = new ArrayList<NameValuePair>();
			while (iterator.hasNext()) {
				Entry<String,Object> entry = iterator.next();
				params.add(new BasicNameValuePair(entry.getKey(),
						String.valueOf(entry.getValue())));
			}
			UrlEncodedFormEntity uefEntity = new UrlEncodedFormEntity(
					params, charset);
			uefEntity.setContentType(mimeType);
			return uefEntity;
		}
		return null;
	}

	/**
	 * 设置请求头信息
	 *
	 * @param headers
	 * @param request
	 * @return
	 */
	private static void setHeaders(HttpRequest request, Map<String,Object> headers) {
		if (headers != null && headers.size() > 0) {
			for (Entry<String,Object> entry : headers.entrySet()) {
				if (!entry.getKey().equals("Cookie")) {
					request.addHeader(entry.getKey(), entry.getValue().toString());
				} else {
					@SuppressWarnings("unchecked")
					Map<String,Object> Cookies = (Map<String,Object>) entry
							.getValue();
					for (Entry<String,Object> entry1 : Cookies.entrySet()) {
						request.addHeader(new BasicHeader("Cookie", (String) entry1
								.getValue()));
					}
				}
			}
		}
	}

	/**
	 * 发送http请求
	 *
	 * @param request
	 * @return
	 * @throws Exception
	 */
	private static CloseableHttpResponse execute(HttpUriRequest request) throws Exception {
		logger.info("post请求的访问地址：" + request.getURI());
		Long startTime = System.currentTimeMillis();
		CloseableHttpResponse response = httpclient.execute(request);
		Long endTime = System.currentTimeMillis();
		logger.info("调用API 花费时间(单位：毫秒)：" + (endTime - startTime));
		return response;
	}

	/**
	 * 从结果中获取出String数据
	 *
	 * @param httpResponse http结果对象
	 * @param charset      编码信息
	 * @return String
	 * @throws Exception
	 */
	private static String getResult(CloseableHttpResponse httpResponse, String charset) throws Exception {
		String result = null;
		if (httpResponse == null) {
			return result;
		}
		//获取请求状态
		int status = httpResponse.getStatusLine().getStatusCode();
		if (status == HttpStatus.SC_OK) {
			HttpEntity entity = httpResponse.getEntity();
			if (entity == null) {
				return result;
			}
			result = EntityUtils.toString(entity, charset);
			logger.info("post请求的结果：\n" + result);
			EntityUtils.consume(entity);// 关闭应该关闭的资源，适当的释放资源 ;也可以把底层的流给关闭了
			return result;
		} else {
			throw new RuntimeException("HTTP ERROR Status: " + status + ";");
		}
	}

	public static void main(String[] args) throws Exception {
	}
}
