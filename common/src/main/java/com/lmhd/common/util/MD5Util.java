package com.lmhd.common.util;

import org.apache.commons.codec.digest.DigestUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;

public class MD5Util {

	private static final String encodingCharset = "UTF-8";
	private static Logger logger          = LoggerFactory.getLogger(MD5Util.class);

	public static void main(String[] args) {
		SortedMap<String,String> parmMap = new TreeMap<>();
		parmMap.put("TaskID", "3435940");
		parmMap.put("Mobile", "18800038086");
		parmMap.put("Status", "4");
		parmMap.put("ReportTime", "2017-12-20T11:56:54.73");//2016-08-03T20:58:51.603
		parmMap.put("ReportCode", "S:终止");
		parmMap.put("OutTradeNo", "P5641605944171220141959532");
		String sign=createSign(parmMap,"611eecf078764316b8dd9b6ea28f2d00").toLowerCase();
		System.out.println(sign);
	}

	/**
	 * 创建md5摘要,规则是:按参数名称a-z排序。
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static String createSign(SortedMap<String,String> params, String secretKey) {
		StringBuffer sb = new StringBuffer();
		Set<Map.Entry<String,String>> es = params.entrySet();
		Iterator it = es.iterator();
		while (it.hasNext()) {
			Map.Entry<String,String> entry = (Map.Entry<String,String>) it.next();
			String k = (String) entry.getKey();
			String v = (String) entry.getValue();
			//if (null != v && !"".equals(v) && !"sign".equals(k) && !"key".equals(k)) {
			sb.append(k + "=" + v + "&");
			//}
		}
		sb.append("key=" + secretKey);
		logger.info("md5 sb:" + sb);
		String sign = MD5Util.MD5Encode(sb.toString(), encodingCharset).toUpperCase();
		logger.info("sign:" + sign);
		return sign;
	}

	private static String byteArrayToHexString(byte b[]) {
		StringBuffer resultSb = new StringBuffer();
		for (int i = 0; i < b.length; i++)
			resultSb.append(byteToHexString(b[i]));
		return resultSb.toString();
	}

	private static String byteToHexString(byte b) {
		int n = b;
		if (n < 0)
			n += 256;
		int d1 = n / 16;
		int d2 = n % 16;
		return hexDigits[d1] + hexDigits[d2];
	}

	public static String MD5Encode(String origin, String charsetname) {
		String resultString = null;
		try {
			resultString = new String(origin);
			MessageDigest md = MessageDigest.getInstance("MD5");
			if (charsetname == null || "".equals(charsetname))
				resultString = byteArrayToHexString(md.digest(resultString
						.getBytes()));
			else
				resultString = byteArrayToHexString(md.digest(resultString
						.getBytes(charsetname)));
		} catch (Exception exception) {
		}
		return resultString;
	}

	/**
	 * 辽宁联通请求发送报文专用
	 *
	 * @param origin
	 * @return
	 */
	public static String MD5Encode(String origin) {
		String resultString = null;
		try {
			resultString = new String(origin);
			MessageDigest md = MessageDigest.getInstance("MD5");
			resultString = byteArrayToHexString(md.digest(resultString.getBytes()));
		} catch (Exception ex) {
		}
		return resultString;
	}

	/**
	 * 北京云融 md5加密
	 *
	 * @param plainText
	 * @return
	 * @throws NoSuchAlgorithmException
	 */
	public static String md5(String plainText) throws NoSuchAlgorithmException {
		MessageDigest md = MessageDigest.getInstance("MD5");
		md.update(plainText.getBytes());
		byte b[] = md.digest();
		int i;
		StringBuffer buf = new StringBuffer("");
		for (int offset = 0; offset < b.length; offset++) {
			i = b[offset];
			if (i < 0)
				i += 256;
			if (i < 16)
				buf.append("0");
			buf.append(Integer.toHexString(i));
		}
		return buf.toString();
	}

	/**
	 * 鼎信MD5加密
	 *
	 * @param plainText 需要加密的字符串
	 * @param md5Format true
	 * @param charset   字符集格式 utf-8
	 * @return
	 */
	public static String getDingXinMd5(String plainText, boolean md5Format, String charset) {
		String str = "";
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update(plainText.trim().getBytes(charset));
			byte b[] = md.digest();
			int i;
			StringBuffer buf = new StringBuffer(32);
			for (int offset = 0; offset < b.length; offset++) {
				i = b[offset];
				if (i < 0)
					i += 256;
				if (i < 16)
					buf.append("0");
				buf.append(Integer.toHexString(i));
			}
			if (md5Format) {
				str = buf.toString().toUpperCase();
			} else {
				str = buf.toString().substring(8, 24).toUpperCase();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return str;
	}

	public static String MD5Encode16(String origin, String charsetname) {
		String resultString = null;
		try {
			resultString = new String(origin);
			MessageDigest md = MessageDigest.getInstance("MD5");
			if (charsetname == null || "".equals(charsetname))
				resultString = byteArrayToHexString(md.digest(resultString.getBytes("UTF-8")));
			else
				resultString = byteArrayToHexString(md.digest(resultString
						.getBytes(charsetname)));
			return resultString.substring(8, 24);
		} catch (Exception exception) {
			exception.printStackTrace();
			return null;
		}
	}

	private static final String hexDigits[] = { "0", "1", "2", "3", "4", "5",
			"6", "7", "8", "9", "a", "b", "c", "d", "e", "f" };

	public static String createSecurekey(String str) {
		String skey = DigestUtils.md5Hex("fhhrdes");
		return skey;
	}

	/**
	 * 按照字典序逆序拼接参数
	 *
	 * @param params
	 * @return
	 */
	public static String getSign(String... params) {
		List<String> srcList = new ArrayList<String>();
		for (String param : params) {
			srcList.add(param);
		}
		// 按照字典序逆序拼接参数
		Arrays.sort(params);
		Collections.sort(srcList, String.CASE_INSENSITIVE_ORDER);
		Collections.reverse(srcList);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < srcList.size(); i++) {
			sb.append(srcList.get(i));
		}
		return sb.toString();
	}

	/***
	 * MD5 加密调用
	 */
	public static String getSignAndMD5(String... params) {
		String sign = getSign(params);
		return MD5Util.MD5Encode(sign, "utf-8");
	}

	/**
	 * 获取md5签名
	 * 烽火万家专用签名
	 *
	 * @param params
	 * @param secretKey
	 * @return
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static String fengHuocreateSign(SortedMap<String,String> params, String secretKey) {
		StringBuffer sb = new StringBuffer();
		Set<Map.Entry<String,String>> es = params.entrySet();
		Iterator it = es.iterator();
		while (it.hasNext()) {
			Map.Entry<String,String> entry = (Map.Entry<String,String>) it.next();
			String v = (String) entry.getValue();
			sb.append(v);
		}
		sb.append(secretKey);
		String sign = MD5Util.MD5Encode(sb.toString(), "UTF-8").toLowerCase();
		return sign;
	}

	/**
	 * 获取MD5签名
	 *
	 * @param map
	 * @param sercertkey
	 * @return
	 */
	public static String getSigntoLow(Map<String,Object> map, String sercertkey) {
		Set<String> keySet = map.keySet();
		List<String> keyList = new ArrayList<String>(keySet);
		Collections.sort(keyList);
		Iterator<String> iterator = keyList.iterator();
		StringBuffer sb = new StringBuffer();
		while (iterator.hasNext()) {
			String key = iterator.next();
			Object obj = map.get(key);
			String value = obj != null ? obj.toString() : null;
			if (!"md5value".equals(key) && value != null) {
				sb.append(value);
			}
		}
		sb.append(sercertkey);
		System.out.println(sb.toString());
		logger.info("外接待签名串：{}", sb.toString());
		String sign = MD5Util.MD5Encode(sb.toString(), "UTF-8");
		return sign.toLowerCase();
	}

	/**
	 * 唯诚md5
	 *
	 * @param s
	 * @return
	 */
	public final static String MD5(String s) {
		return MD5(s.getBytes());
	}

	public final static String MD5(byte[] btInput) {
		char hexDigits[] =
				{ '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
		try {
			MessageDigest mdInst = MessageDigest.getInstance("MD5");
			mdInst.update(btInput);
			byte[] md = mdInst.digest();
			int j = md.length;
			char str[] = new char[j * 2];
			int k = 0;
			for (int i = 0; i < j; i++) {
				byte byte0 = md[i];
				str[k++] = hexDigits[byte0 >>> 4 & 0xf];
				str[k++] = hexDigits[byte0 & 0xf];
			}
			return new String(str);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * 获取MD5签名
	 *
	 * @param map
	 * @param sercertkey
	 * @return
	 */
	public static String getSign(Map<String,Object> map, String sercertkey) {
		Set<String> keySet = map.keySet();
		List<String> keyList = new ArrayList<String>(keySet);
		Collections.sort(keyList);
		Iterator<String> iterator = keyList.iterator();
		StringBuffer sb = new StringBuffer();
		while (iterator.hasNext()) {
			String key = iterator.next();
			Object obj = map.get(key);
			String value = obj != null ? obj.toString() : null;
			if (!"md5value".equals(key) && value != null) {
				sb.append(value);
			}
		}
		sb.append(sercertkey);
		logger.info("外接待签名串：{}", sb.toString());
		String sign = MD5Util.MD5Encode(sb.toString(), "UTF-8");
		return sign.toUpperCase();
	}
}
