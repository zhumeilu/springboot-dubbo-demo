package com.lmhd.common.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NetCheckUtil {

	protected static final Logger _log = LoggerFactory.getLogger(NetCheckUtil.class);

	public static boolean ping(String ipAddress) throws Exception {
		int timeOut = 3000;  //超时应该在3钞以上
		boolean status = InetAddress.getByName(ipAddress).isReachable(timeOut);     // 当返回值是true时，说明host是可用的，false则不可。
		return status;
	}

	public static void ping02(String ipAddress) throws Exception {
		String line = null;
		try {
			Process pro = Runtime.getRuntime().exec("ping " + ipAddress);
			BufferedReader buf = new BufferedReader(new InputStreamReader(pro.getInputStream(), Charset.forName("GBK")));
			while ((line = buf.readLine()) != null)
				System.out.println(line);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	public static boolean ping(String ipAddress, int pingTimes, int timeOut) {
		BufferedReader in = null;
		Runtime r = Runtime.getRuntime();  // 将要执行的ping命令,此命令是windows格式的命令
		String pingCommand = "ping " + ipAddress + " -n " + pingTimes + " -w " + timeOut;
		try {   // 执行命令并获取输出
			System.out.println(pingCommand);
			Process p = r.exec(pingCommand);
			if (p == null) {
				return false;
			}
			in = new BufferedReader(new InputStreamReader(p.getInputStream(), Charset.forName("GBK")));   // 逐行检查输出,计算类似出现=23ms TTL=62字样的次数
			int connectedCount = 0;
			String line = null;
			while ((line = in.readLine()) != null) {
				System.out.println(line);
				connectedCount += getCheckResult(line);
			}   // 如果出现类似=23ms TTL=62这样的字样,出现的次数=测试次数则返回真
			return connectedCount == pingTimes;
		} catch (Exception ex) {
			ex.printStackTrace();   // 出现异常则返回假
			return false;
		} finally {
			try {
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	//若line含有=18ms TTL=16字样,说明已经ping通,返回1,否則返回0.
	private static int getCheckResult(String line) {  // System.out.println("控制台输出的结果为:"+line);
		Pattern pattern = Pattern.compile("(\\d+ms)(\\s+)(TTL=\\d+)", Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(line);
		while (matcher.find()) {
			return 1;
		}
		return 0;
	}

	public static String telnet(String ip, int port, int timeout) {
		try {
			Socket server = new Socket();
			InetSocketAddress address = new InetSocketAddress(ip, port);
			server.connect(address, timeout);
			server.close();
			return "success";
		} catch (UnknownHostException e) {
			_log.error("UnknownHostException",e);
			return "fail";
		} catch (IOException e) {
			_log.error("IOException",e);
			return "fail";
		}
	}

	public static void main(String[] args) throws Exception {
		String ipAddress = "39.105.133.245";
		int port = 9002;
		int timeout = 5000;
		//		//		System.out.println(ping(ipAddress));
		//		//		ping02(ipAddress);
		//		System.out.println(ping(ipAddress, 5, 5000));
		System.out.println(telnet(ipAddress, port, timeout));
	}
}