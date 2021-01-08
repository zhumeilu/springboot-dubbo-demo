package com.lmhd.common.util;

import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.*;

/**
 * Title: FormDataReportConvertor.java Description: 表达数据转换器
 *
 * @author hanhuaiwei
 * @created 2016-2-19
 */
public class FormDataReportConvertor {

	/**
	 * 将数据映射表拼接成表单数据POST样式的字符串 key1=value1&key2=value2
	 *
	 * @param dataMap
	 * @return
	 */
	public static String postFormLinkReportObject(Map<String,Object> dataMap) {
		if (dataMap == null)
			return "";
		StringBuilder reportBuilder = new StringBuilder();
		List<String> keyList = new ArrayList<String>(dataMap.keySet());
		Collections.sort(keyList);
		for (String key : keyList) {
			reportBuilder.append(key + "=" + dataMap.get(key).toString() + "&");
		}
		reportBuilder.deleteCharAt(reportBuilder.lastIndexOf("&"));
		return reportBuilder.toString();
	}

	/**
	 * 将数据映射表拼接成表单数据POST样式的字符串 key1=value1&key2=value2
	 * 并且对value进行URLEncoder编码
	 *
	 * @param dataMap
	 * @return
	 */
	public static String postFormLinkReportWithURLEncodeObject(
			Map<String,Object> dataMap, String charset) {
		if (dataMap == null)
			return "";
		StringBuilder reportBuilder = new StringBuilder();
		List<String> keyList = new ArrayList<String>(dataMap.keySet());
		Collections.sort(keyList);
		for (String key : keyList) {
			try {
				reportBuilder.append(key
						+ "="
						+ URLEncoder.encode(dataMap.get(key).toString(),
						charset) + "&");
			} catch (Exception ex) {
				// ignore to continue
				continue;
			}
		}
		reportBuilder.deleteCharAt(reportBuilder.lastIndexOf("&"));
		return reportBuilder.toString();
	}

	/**
	 * 将数据映射表拼接成表单数据POST样式的字符串 key1=value1&key2=value2
	 *
	 * @param dataMap
	 * @return
	 */
	public static String postFormLinkReport(Map<String,String> dataMap) {
		if (dataMap == null)
			return "";
		StringBuilder reportBuilder = new StringBuilder();
		List<String> keyList = new ArrayList<String>(dataMap.keySet());
		Collections.sort(keyList);
		for (String key : keyList) {
			reportBuilder.append(key + "=" + dataMap.get(key) + "&");
		}
		reportBuilder.deleteCharAt(reportBuilder.lastIndexOf("&"));
		return reportBuilder.toString();
	}

	/**
	 * 将数据映射表拼接成表单数据POST样式的字符串 key1=value1&key2=value2
	 * 并且对value进行URLEncoder编码
	 *
	 * @param dataMap
	 * @return
	 */
	public static String postFormLinkReportWithURLEncode(
			Map<String,String> dataMap, String charset) {
		if (dataMap == null)
			return "";
		StringBuilder reportBuilder = new StringBuilder();
		List<String> keyList = new ArrayList<String>(dataMap.keySet());
		Collections.sort(keyList);
		for (String key : keyList) {
			try {
				reportBuilder.append(key + "="
						+ URLEncoder.encode(dataMap.get(key), charset) + "&");
			} catch (Exception ex) {
				// ignore to continue
				continue;
			}
		}
		reportBuilder.deleteCharAt(reportBuilder.lastIndexOf("&"));
		return reportBuilder.toString();
	}

	/**
	 * 将数据映射表拼接成表单数据POST样式的字符串 key1="value1"&key2="value2"
	 *
	 * @param dataMap
	 * @return
	 */
	public static String postBraceFormLinkReport(Map<String,String> dataMap) {
		if (dataMap == null)
			return "";
		StringBuilder reportBuilder = new StringBuilder();
		List<String> keyList = new ArrayList<String>(dataMap.keySet());
		Collections.sort(keyList);
		for (String key : keyList) {
			reportBuilder.append(key + "=\"" + dataMap.get(key) + "\"&");
		}
		reportBuilder.deleteCharAt(reportBuilder.lastIndexOf("&"));
		return reportBuilder.toString();
	}

	/**
	 * 将数据映射表拼接成表单数据POST样式的字符串 key1="value1"&key2="value2"
	 * 并且对value进行URLEncoder编码
	 *
	 * @param dataMap
	 * @return
	 */
	public static String postBraceFormLinkReportWithURLEncode(
			Map<String,String> dataMap, String charset) {
		if (dataMap == null)
			return "";
		StringBuilder reportBuilder = new StringBuilder();
		List<String> keyList = new ArrayList<String>(dataMap.keySet());
		Collections.sort(keyList);
		for (String key : keyList) {
			try {
				reportBuilder.append(key + "=\""
						+ URLEncoder.encode(dataMap.get(key), charset) + "\"&");
			} catch (Exception ex) {
				// ignore to continue
				continue;
			}
		}
		reportBuilder.deleteCharAt(reportBuilder.lastIndexOf("&"));
		return reportBuilder.toString();
	}

	/**
	 * 表单类型报文解析成数据映射表
	 *
	 * @param reportContent
	 * @param reportCharset --报文本身字符集
	 * @param targetCharset --目标字符集
	 * @return
	 */
	public static Map<String,String> parseFormDataPatternReportWithDecode(
			String reportContent, String reportCharset, String targetCharset) {
		if (reportContent == null || reportContent.length() == 0)
			return null;
		String[] domainArray = reportContent.split("&");
		Map<String,String> key_value_map = new HashMap<String,String>();
		for (String domain : domainArray) {
			String[] kvArray = domain.split("=");
			if (kvArray.length == 2) {
				try {
					String decodeString = URLDecoder.decode(kvArray[1],
							reportCharset);
					String lastInnerValue = new String(
							decodeString.getBytes(reportCharset), targetCharset);
					key_value_map.put(kvArray[0], lastInnerValue);
				} catch (Exception ex) {
					// ignore
				}
			}
		}
		return key_value_map;
	}

	/**
	 * 表单类型报文解析成数据映射表
	 *
	 * @param reportContent
	 * @return
	 */
	public static Map<String,String> parseFormDataPatternReport(
			String reportContent) {
		if (reportContent == null || reportContent.length() == 0)
			return null;
		String[] domainArray = reportContent.split("&");
		Map<String,String> key_value_map = new HashMap<String,String>();
		for (String domain : domainArray) {
			String[] kvArray = domain.split("=");
			if (kvArray.length == 2) {
				key_value_map.put(kvArray[0], kvArray[1]);
			}
		}
		return key_value_map;
	}
}
