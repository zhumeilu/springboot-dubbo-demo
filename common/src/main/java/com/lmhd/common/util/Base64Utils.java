package com.lmhd.common.util;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.lang3.StringUtils;

/**
 * Base64编解码
 */
public class Base64Utils {
    //编码
    private static final String CHARSET_UTF8 = "UTF-8";
    //空值
    private static final String ENPTY_STR = "";
    /**
     * 字符串二进制数据Base64编码
     */
    public static byte[] encode(byte[] bytes) {
         return Base64.encodeBase64(bytes);
    }

    /**
     * BASE64字符串二进制数据解码
     */
    public static byte[] decode(byte[] bytes) {
        return Base64.decodeBase64(bytes);
    }

    /**
     *  字符串编码为Base64字符串
     */
    public static String encodeStr(String inputStr) {
        if(StringUtils.isEmpty(inputStr)) {
            return ENPTY_STR;
        }
        try{
            return new String(Base64.encodeBase64(inputStr.getBytes(CHARSET_UTF8)), CHARSET_UTF8);
        } catch (Exception e) {
            return ENPTY_STR;
        }
    }

    /**
     * BASE64字符串数据解码为字符串
     */
    public static String decodeStr(String inputStr) {
        if(StringUtils.isEmpty(inputStr)) {
            return ENPTY_STR;
        }
        try{
            return new String(Base64.decodeBase64(inputStr.getBytes(CHARSET_UTF8)), CHARSET_UTF8);
        } catch (Exception e) {
            return ENPTY_STR;
        }
    }

    /*public static void main(String[] args) {
        System.out.println(Base64Utils.encodeStr("哦哦哦啊666"));
        System.out.println(Base64Utils.decodeStr(Base64Utils.encodeStr("哦哦哦啊666")));
    }*/
}
