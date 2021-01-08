package com.lmhd.common.util;

import java.util.Random;

public class RandomUtil {

	/**
	 * 获取六位随机的邀请码，包括数字和字母
	 * @return
	 */
	public static String getRandomCode(){
		String val = "";
		Random random = new Random();
			for (int i = 0; i < 10; i++) {
			// 输出字母还是数字
			String charOrNum = random.nextInt(2) % 2 == 0 ? "char" : "num";
			// 字符串
			if ("char".equalsIgnoreCase(charOrNum)) {
				// 取得大写字母还是小写字母
				int choice = random.nextInt(2) % 2 == 0 ? 65 : 97;
				val += (char) (choice + random.nextInt(26));
			} else if ("num".equalsIgnoreCase(charOrNum)) { // 数字
				val += String.valueOf(random.nextInt(10));
			}
		}
		return val;
	}

	public static String getRandomCode(int len){
		String val = "";
		Random random = new Random();
		for (int i = 0; i < len; i++) {
			// 输出字母还是数字
			String charOrNum = random.nextInt(2) % 2 == 0 ? "char" : "num";
			// 字符串
			if ("char".equalsIgnoreCase(charOrNum)) {
				// 取得大写字母还是小写字母
				int choice = random.nextInt(2) % 2 == 0 ? 65 : 97;
				val += (char) (choice + random.nextInt(26));
			} else if ("num".equalsIgnoreCase(charOrNum)) { // 数字
				val += String.valueOf(random.nextInt(10));
			}
		}
		return val;
	}

	/**
	 * 获取六位随机的验证码，由数字构成
	 * @return
	 */
	public static String getRandomNumber(){
		return getRandomNumber(6);
	}

	/**
	 * 获取指定位数的随机数字
	 * @param len
	 * @return
	 */
	public static String getRandomNumber(int len){
		String str="";
		Random random=new Random();
		for(int i=0;i<len;i++){
			str+=random.nextInt(10);
		}
		return str;
	}
	
	public static void main(String[] args) {
		
		System.out.println(getRandomCode());
		System.out.println(getRandomNumber());
	}
}
