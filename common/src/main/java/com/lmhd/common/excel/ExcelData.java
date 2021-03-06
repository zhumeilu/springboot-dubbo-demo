package com.lmhd.common.excel;

import java.io.Serializable;
import java.util.List;

/**
 * @DESCRIPTION：
 * @author：DDCAO
 * @createDate：2018-10-18 11:41
 **/
public class ExcelData implements Serializable {

	private static final long serialVersionUID = 4444017239100620999L;

	// 表头
	private List<String>       titles;

	// 数据
	private List<List<Object>> rows;

	// 页签名称
	private String             name;

	public List<String> getTitles() {
		return titles;
	}

	public void setTitles(List<String> titles) {
		this.titles = titles;
	}

	public List<List<Object>> getRows() {
		return rows;
	}

	public void setRows(List<List<Object>> rows) {
		this.rows = rows;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
