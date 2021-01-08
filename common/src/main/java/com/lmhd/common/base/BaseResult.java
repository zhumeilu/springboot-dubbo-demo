package com.lmhd.common.base;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 统一返回结果类
 * Created LMHD.TEC on 2017/2/18.
 */
public class BaseResult {

	private static Logger _log = LoggerFactory.getLogger(BaseResult.class);
	// 状态码：1成功，其他为失败
	public         int    code;
	// 成功为success，其他为失败原因
	public         String message;
	// 数据结果集
	public         Object data;

	public BaseResult() {
	}

	public BaseResult(int code, String message, Object data) {
		this.code = code;
		this.message = message;
		this.data = data;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
}
