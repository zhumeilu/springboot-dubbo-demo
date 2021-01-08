package com.lmhd.common.util;

import org.apache.commons.lang3.StringUtils;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * String 工具类
 * Created LMHD.TEC on 2016/12/07.
 */
public class StringUtil extends StringUtils {

	private static Pattern linePattern = Pattern.compile("_(\\w)");
	private static Pattern humpPattern = Pattern.compile("[A-Z]");

	/**
	 * 下划线转驼峰
	 *
	 * @param str
	 * @return
	 */
	public static String lineToHump(String str) {
		if (null == str || "".equals(str)) {
			return str;
		}
		str = str.toLowerCase();
		Matcher matcher = linePattern.matcher(str);
		StringBuffer sb = new StringBuffer();
		while (matcher.find()) {
			matcher.appendReplacement(sb, matcher.group(1).toUpperCase());
		}
		matcher.appendTail(sb);
		str = sb.toString();
		str = str.substring(0, 1).toUpperCase() + str.substring(1);
		return str;
	}

	/**
	 * 驼峰转下划线(简单写法，效率低于{@link #humpToLine2(String)})
	 *
	 * @param str
	 * @return
	 */
	public static String humpToLine(String str) {
		return str.replaceAll("[A-Z]", "_$0").toLowerCase();
	}

	/**
	 * 驼峰转下划线,效率比上面高
	 *
	 * @param str
	 * @return
	 */
	public static String humpToLine2(String str) {
		Matcher matcher = humpPattern.matcher(str);
		StringBuffer sb = new StringBuffer();
		while (matcher.find()) {
			matcher.appendReplacement(sb, "_" + matcher.group(0).toLowerCase());
		}
		matcher.appendTail(sb);
		return sb.toString();
	}

	/**
	 * 首字母转小写
	 *
	 * @param s
	 * @return
	 */
	public static String toLowerCaseFirstOne(String s) {
		if (StringUtils.isBlank(s)) {
			return s;
		}
		if (Character.isLowerCase(s.charAt(0))) {
			return s;
		} else {
			return (new StringBuilder()).append(Character.toLowerCase(s.charAt(0))).append(s.substring(1)).toString();
		}
	}

	/**
	 * 首字母转大写
	 *
	 * @param s
	 * @return
	 */
	public static String toUpperCaseFirstOne(String s) {
		if (StringUtils.isBlank(s)) {
			return s;
		}
		if (Character.isUpperCase(s.charAt(0))) {
			return s;
		} else {
			return (new StringBuffer()).append(Character.toUpperCase(s.charAt(0))).append(s.substring(1)).toString();
		}
	}

	/**
	 * object转String
	 *
	 * @param object
	 * @return
	 */
	public static String getString(Object object) {
		return getString(object, "");
	}

	public static String getString(Object object, String defaultValue) {
		if (null == object) {
			return defaultValue;
		}
		try {
			return object.toString();
		} catch (Exception e) {
			return defaultValue;
		}
	}

	/**
	 * object转Integer
	 *
	 * @param object
	 * @return
	 */
	public static int getInt(Object object) {
		return getInt(object, -1);
	}

	public static int getInt(Object object, Integer defaultValue) {
		if (null == object) {
			return defaultValue;
		}
		try {
			return Integer.parseInt(object.toString());
		} catch (Exception e) {
			return defaultValue;
		}
	}

	/**
	 * object转Boolean
	 *
	 * @param object
	 * @return
	 */
	public static boolean getBoolean(Object object) {
		return getBoolean(object, false);
	}

	public static boolean getBoolean(Object object, Boolean defaultValue) {
		if (null == object) {
			return defaultValue;
		}
		try {
			return Boolean.parseBoolean(object.toString());
		} catch (Exception e) {
			return defaultValue;
		}
	}

	public static int str2int(String str) {
		if ("".equals(stringBlank(str)))
			return 0;
		return Integer.parseInt(str);
	}

	/**
	 * obj2BigDecimal
	 *
	 * @param value
	 * @return
	 */
	public static BigDecimal obj2big(Object value) {
		BigDecimal ret = null;
		if (value != null) {
			if (org.apache.commons.lang3.StringUtils.isEmpty(value.toString()))
				return BigDecimal.ZERO;
			if (value instanceof BigDecimal) {
				ret = (BigDecimal) value;
			} else if (value instanceof String) {
				ret = new BigDecimal((String) value);
			} else if (value instanceof BigInteger) {
				ret = new BigDecimal((BigInteger) value);
			} else if (value instanceof Number) {
				ret = new BigDecimal(((Number) value).doubleValue());
			} else {
				throw new ClassCastException("Not possible to coerce [" + value
						+ "] from class " + value.getClass()
						+ " into a BigDecimal.");
			}
		} else {
			return BigDecimal.ZERO;
		}
		return ret;
	}

	public static String obj2String(Object value) {
		if (value != null) {
			return value.toString();
		} else {
			return "";
		}
	}

	//验证身份证
	public static boolean checkIdCardNo(String idCardNo) throws Exception {
		try {
			if (org.apache.commons.lang3.StringUtils.isBlank(idCardNo)) {
				return false;
			}
			int length = idCardNo.length();
			if (length == 15) {
				Pattern p = Pattern.compile("^[0-9]*$");
				Matcher m = p.matcher(idCardNo);
				return m.matches();
			} else if (length == 18) {
				String front_17 = idCardNo.substring(0, idCardNo.length() - 1);//号码前17位
				String verify = idCardNo.substring(17, 18);//校验位(最后一位)
				Pattern p = Pattern.compile("^[0-9]*$");
				Matcher m = p.matcher(front_17);
				if (!m.matches()) {
					return false;
				} else {
					checkVerify(front_17, verify);
				}
			}
			return false;
		} catch (Exception e) {
			throw e;
		}
	}

	/**
	 * 校验验证位合法性
	 *
	 * @param front_17
	 * @param verify
	 * @return
	 * @throws Exception
	 */
	public static boolean checkVerify(String front_17, String verify) throws Exception {
		try {
			int[] wi = { 7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2, 1 };
			String[] vi = { "1", "0", "X", "9", "8", "7", "6", "5", "4", "3", "2" };
			int s = 0;
			for (int i = 0; i < front_17.length(); i++) {
				int ai = Integer.parseInt(front_17.charAt(i) + "");
				s += wi[i] * ai;
			}
			int y = s % 11;
			String v = vi[y];
			if (!(verify.toUpperCase().equals(v))) {
				return false;
			}
			return true;
		} catch (Exception e) {
			throw e;
		}
	}

	/**
	 * Object转int 类型不全 要转哪个 自己加
	 *
	 * @param o
	 * @return
	 */
	public static int obj2int(Object o) {
		if (o == null)
			return 0;
		else if (o instanceof String)
			return str2int(o.toString());
		else if (o instanceof Number)
			return ((Number) o).intValue();
		else
			return 0;
	}

	public static long obj2long(Object o) {
		if (o == null)
			return 0;
		else if (o instanceof String)
			return str2long(o.toString());
		else if (o instanceof Number)
			return ((Number) o).longValue();
		else
			return 0;
	}

	public static long str2long(String string) {
		if ("".equals(stringBlank(string)))
			return 0L;
		return Integer.parseInt(string);
	}

	public static String obj2str(Object o) {
		if (o == null)
			return "";
		else if ("".equals(o) || "".equals(o.toString().trim()))
			return "";
		else
			return o.toString();
	}

	/**
	 * 转换去空格
	 *
	 * @param o
	 * @return
	 */
	public static String obj2strTrim(Object o) {
		if (o == null)
			return "";
		else if ("".equals(o) || "".equals(o.toString().trim()))
			return "";
		else
			return o.toString().trim();
	}

	public static boolean obj2boolean(Object o) {
		if (o == null)
			return false;
		if (o instanceof Boolean)
			return (boolean) o;
		else if (o instanceof String && "true".equals(obj2str(o)))
			return true;
		else
			return false;
	}

	/**
	 * null "" 格式化为""
	 *
	 * @param value
	 * @return ""
	 */
	public static String stringBlank(String value) {
		if (value == null || value.equals("")) {
			value = "";
		}
		return value.replaceAll("\r|\n", "");
	}

	/**
	 * int转str
	 *
	 * @param value
	 * @return
	 */
	public static String int2str(int value) {
		return String.valueOf(value);
	}


	/**
	 * 功能描述：人民币转成大写
	 *
	 * @param str
	 *            数字字符串
	 * @return String 人民币转换成大写后的字符串
	 */
	public static String hangeToBig(String str) {
		double value;
		try {
			value = Double.parseDouble(str.trim());
		} catch (Exception e) {
			return null;
		}
		char[] hunit = { '拾', '佰', '仟' }; // 段内位置表示
		char[] vunit = { '万', '亿' }; // 段名表示
		char[] digit = { '零', '壹', '贰', '叁', '肆', '伍', '陆', '柒', '捌', '玖' }; // 数字表示
		long midVal = (long) (value * 100); // 转化成整形
		String valStr = String.valueOf(midVal); // 转化成字符串
		String head = valStr.substring(0, valStr.length() - 2); // 取整数部分
		String rail = valStr.substring(valStr.length() - 2); // 取小数部分
		String prefix = ""; // 整数部分转化的结果
		String suffix = ""; // 小数部分转化的结果
		// 处理小数点后面的数
		if (rail.equals("00")) { // 如果小数部分为0
			suffix = "整";
		} else {
			suffix = digit[rail.charAt(0) - '0'] + "角"
					+ digit[rail.charAt(1) - '0'] + "分"; // 否则把角分转化出来
		}
		// 处理小数点前面的数
		char[] chDig = head.toCharArray(); // 把整数部分转化成字符数组
		char zero = '0'; // 标志'0'表示出现过0
		byte zeroSerNum = 0; // 连续出现0的次数
		for (int i = 0; i < chDig.length; i++) { // 循环处理每个数字
			int idx = (chDig.length - i - 1) % 4; // 取段内位置
			int vidx = (chDig.length - i - 1) / 4; // 取段位置
			if (chDig[i] == '0') { // 如果当前字符是0
				zeroSerNum++; // 连续0次数递增
				if (zero == '0') { // 标志
					zero = digit[0];
				} else if (idx == 0 && vidx > 0 && zeroSerNum < 4) {
					prefix += vunit[vidx - 1];
					zero = '0';
				}
				continue;
			}
			zeroSerNum = 0; // 连续0次数清零
			if (zero != '0') { // 如果标志不为0,则加上,例如万,亿什么的
				prefix += zero;
				zero = '0';
			}
			prefix += digit[chDig[i] - '0']; // 转化该数字表示
			if (idx > 0)
				prefix += hunit[idx - 1];
			if (idx == 0 && vidx > 0) {
				prefix += vunit[vidx - 1]; // 段结束位置应该加上段名如万,亿
			}
		}
		if (prefix.length() > 0)
			prefix += '圆'; // 如果整数部分存在,则有圆的字样
		return prefix + suffix; // 返回正确表示
	}
}
