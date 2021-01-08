package com.lmhd.common.util;

import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @DESCRIPTION：
 * @author：DDCAO
 * @createDate：2018-10-16 14:57
 **/
public class BankCardUtil {

	private static Map<String,String> bankCardMap;

	static {
		bankCardMap = new HashMap();
		bankCardMap.put("DC", "借记卡");
		bankCardMap.put("CC", "贷记卡");
		bankCardMap.put("SCC", "准贷记卡");
		bankCardMap.put("PC", "预付费卡");
	}

	public static String getCardType(String bankNo) throws Exception {
		String result = HttpsPoolClientUtils.httpGet("https://ccdcapi.alipay.com/validateAndCacheCardInfo.json?_input_charset=utf-8&cardBinCheck=true&cardNo=" + bankNo, new HashMap(), new HashMap(), "", "utf-8");
		JSONObject json = JSONObject.parseObject(result);
		String bankType = json.getString("cardType");
		System.out.println(bankNo + ":" + bankType);
		if ("CC".equals(bankType)) {
			System.out.println(bankNo + ":贷记卡");
		}
		if (StringUtils.isNotBlank(bankType)) {
			return bankCardMap.get(bankType);
		}
		return "无法识别,检查卡号有效位";
	}

	public static String getCardCode(String bankNo) throws Exception {
		String result = HttpsPoolClientUtils.httpGet("https://ccdcapi.alipay.com/validateAndCacheCardInfo.json?_input_charset=utf-8&cardBinCheck=true&cardNo=" + bankNo, new HashMap(), new HashMap(), "", "utf-8");
		JSONObject json = JSONObject.parseObject(result);
		String bankCode = json.getString("bank");
		if (StringUtils.isNotBlank(bankCode)) {
			return bankCode;
		}
		return "无法识别,检查卡号有效位";
	}

	public static void main(String[] args) throws Exception {
//				FileReader reader = new FileReader("D:\\user\\user.txt");
//				BufferedReader br = new BufferedReader(reader);
//				String line = "";
//				while ((line = br.readLine()) != null) {
//					try {
//						Thread.sleep(100);
//					} catch (InterruptedException e) {
//						e.printStackTrace();
//					}
//					if (line != null && line.length() > 0) {
//						getCardType(line);
//					}
//				}
		System.out.println(getCardType("6227001882850547905"));

	}
}
