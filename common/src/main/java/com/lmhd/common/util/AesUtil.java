package com.lmhd.common.util;

import org.apache.commons.codec.binary.Base64;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.security.SecureRandom;

/**
 * 功能：
 * Charles on 2018/2/27.
 */
public class AesUtil {

	private static Logger log = LoggerFactory.getLogger(AesUtil.class);

	/**
	 * @param @param  content
	 * @param @param  password
	 * @param @return
	 * @param @throws Exception    设定文件
	 * @return String    返回类型
	 * @Title: aesDecrypt
	 * @Description: TODO 解密
	 */
	public static String aesDecrypt(String content, String password) throws Exception {
		KeyGenerator kgen = KeyGenerator.getInstance("AES");
		SecureRandom random = SecureRandom.getInstance("SHA1PRNG");
		random.setSeed(password.getBytes());
		kgen.init(128, random);
		SecretKey secretKey = kgen.generateKey();
		byte[] enCodeFormat = secretKey.getEncoded();
		SecretKeySpec key = new SecretKeySpec(enCodeFormat, "AES");
		Cipher cipher = Cipher.getInstance("AES / ECB / PKCS5Padding");
		cipher.init(Cipher.DECRYPT_MODE, key);
		byte[] result = cipher.doFinal(Base64.decodeBase64(content));
		if ((result != null) && (result.length > 0)) {
			log.debug("[AESUtils][decrypt][result.length]:" + result.length);
			log.debug("[AESUtils][decrypt][result]:"
					+ new String(result, "utf-8"));
			return new String(result, "utf-8");
		} else {
			log.debug("[AESUtils][decrypt][result] is null");
		}
		return null;
	}

	public static void main(String[] args) throws Exception {
		try {
			String data = AesUtil.aesEncrypt("M18800001111:18800038086", "7394c159^4e06^4ad5%911d%f023d593cc17");
			//KWjOY6T894ZBqI3ij9tYirxNMgTcTCxJJfXIO3hZuFM    M18800001111:18800038086
			System.out.println(data);
			//uBAc4LSm5_Wyj7sEsV4FJff0m7bKWM8hfpYw1q2SrZk
			String decode = AesUtil.aesDecrypt("uBAc4LSm5_Wyj7sEsV4FJff0m7bKWM8hfpYw1q2SrZk", "7394c159^4e06^4ad5%911d%f023d593cc17");
			System.out.println(decode);
		} catch (Exception e) {
		}
	}

	/**
	 * @param @param  content
	 * @param @param  password
	 * @param @return
	 * @param @throws Exception    设定文件
	 * @return String    返回类型
	 * @Title: aesEncrypt
	 * @Description: TODO 加密
	 */
	public static String aesEncrypt(String content, String password) throws Exception {
		KeyGenerator kgen = KeyGenerator.getInstance("AES");
		SecureRandom random = SecureRandom.getInstance("SHA1PRNG");
		random.setSeed(password.getBytes());
		kgen.init(128, random);
		SecretKey secretKey = kgen.generateKey();
		byte[] enCodeFormat = secretKey.getEncoded();
		SecretKeySpec key = new SecretKeySpec(enCodeFormat, "AES");
		Cipher cipher = Cipher.getInstance("AES / ECB / PKCS5Padding");
		byte[] byteContent = content.getBytes("utf-8");
		cipher.init(Cipher.ENCRYPT_MODE, key);
		byte[] result = cipher.doFinal(byteContent);
		if ((result != null) && (result.length > 0)) {
			return Base64.encodeBase64URLSafeString(result);
		}
		return null;
	}

	// 加密
	public static String encrypt(String sSrc, String sKey) throws Exception {
		if (sKey == null) {
			System.out.print("Key为空null");
			return null;
		}
		// 判断Key是否为16位
		if (sKey.length() != 16) {
			System.out.print("Key长度不是16位");
			return null;
		}
		byte[] raw = sKey.getBytes("utf-8");
		SecretKeySpec skeySpec = new SecretKeySpec(raw, "AES");
		Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");//"算法/模式/补码方式"
		cipher.init(Cipher.ENCRYPT_MODE, skeySpec);
		byte[] encrypted = cipher.doFinal(sSrc.getBytes("utf-8"));
		return new Base64().encodeToString(encrypted);//此处使用BASE64做转码功能，同时能起到2次加密的作用。
	}

	// 解密
	public static String decrypt(String sSrc, String sKey) throws Exception {
		try {
			// 判断Key是否正确
			if (sKey == null) {
				System.out.print("Key为空null");
				return null;
			}
			// 判断Key是否为16位
			if (sKey.length() != 16) {
				System.out.print("Key长度不是16位");
				return null;
			}
			byte[] raw = sKey.getBytes("utf-8");
			SecretKeySpec skeySpec = new SecretKeySpec(raw, "AES");
			Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
			cipher.init(Cipher.DECRYPT_MODE, skeySpec);
			byte[] encrypted1 = new Base64().decode(sSrc);//先用base64解密
			try {
				byte[] original = cipher.doFinal(encrypted1);
				String originalString = new String(original, "utf-8");
				return originalString;
			} catch (Exception e) {
				System.out.println(e.toString());
				return null;
			}
		} catch (Exception ex) {
			System.out.println(ex.toString());
			return null;
		}
	}
}

