package com.lmhd.common.excel;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.xssf.streaming.SXSSFSheet;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFColor;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.extensions.XSSFCellBorder.BorderSide;

import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.Color;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.util.List;

/**
 * @DESCRIPTION：
 * @author：DDCAO
 * @createDate：2018-10-18 11:42
 **/
public class ExportExcelUtils {

	static final int FLUSHSIZE = 500;

	public static void writeToHttpResponse(HttpServletResponse response, String fileName, ExcelData data) throws Exception {
		// 告诉浏览器用什么软件可以打开此文件
		response.setHeader("application/x-excel", "application/vnd.ms-excel");
		// 下载文件的默认名称
		response.setHeader("Content-Disposition", "attachment;filename=" + URLEncoder.encode(fileName, "utf-8"));
		writeToOutputStream(data, response.getOutputStream());
	}

	public static String exportExcelToFile(String filePath, ExcelData data) throws Exception {
		File file = new File(filePath);
		if (!file.exists()) {   //文件不存在则创建文件，先创建目录
			File dir = new File(file.getParent());
			dir.mkdirs();
			file.createNewFile();
		}
		FileOutputStream out2 = new FileOutputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook();
		SXSSFWorkbook wb2 = new SXSSFWorkbook(wb, FLUSHSIZE);
		try {
			String sheetName = data.getName();
			if (null == sheetName) {
				sheetName = "Sheet1";
			}
			SXSSFSheet sheet2 = wb2.createSheet(sheetName);
			sheet2.trackAllColumnsForAutoSizing();
			writeExcel2(wb2, sheet2, data);
			wb2.write(out2);
		} finally {
			out2.close();
			wb2.close();
		}
		return "ok";
	}

	public static void writeToOutputStream(ExcelData data, OutputStream out) throws Exception {
		XSSFWorkbook wb = new XSSFWorkbook();
		SXSSFWorkbook wb2 = new SXSSFWorkbook(wb, 100);
		try {
			String sheetName = data.getName();
			if (null == sheetName) {
				sheetName = "Sheet1";
			}
			SXSSFSheet sheet2 = wb2.createSheet(sheetName);
			sheet2.trackAllColumnsForAutoSizing();
			writeExcel2(wb2, sheet2, data);
			//			XSSFSheet sheet = wb.createSheet(sheetName);
			//			writeExcel(wb, sheet, data);
			out.flush();
			wb2.write(out);
		} finally {
			wb2.close();
		}
	}

	private static void writeExcel(XSSFWorkbook wb, Sheet sheet, ExcelData data) {
		int rowIndex = 0;
		rowIndex = writeTitlesToExcel(wb, sheet, data.getTitles());
		writeRowsToExcel(wb, sheet, data.getRows(), rowIndex);
		autoSizeColumns(sheet, data.getTitles().size() + 1);
	}

	private static void writeExcel2(SXSSFWorkbook wb, SXSSFSheet sheet, ExcelData data) throws IOException {
		int rowIndex = 0;
		rowIndex = writeTitlesToExcel2(wb, sheet, data.getTitles());
		writeRowsToExcel2(wb, sheet, data.getRows(), rowIndex);
		autoSizeColumns2(sheet, data.getTitles().size() + 1);
	}

	private static int writeTitlesToExcel(XSSFWorkbook wb, Sheet sheet, List<String> titles) {
		int rowIndex = 0;
		int colIndex = 0;
		Font titleFont = wb.createFont();
		titleFont.setFontName("simsun");
		titleFont.setBold(true);
		// titleFont.setFontHeightInPoints((short) 14);
		titleFont.setColor(IndexedColors.BLACK.index);
		XSSFCellStyle titleStyle = wb.createCellStyle();
		titleStyle.setAlignment(XSSFCellStyle.ALIGN_CENTER);
		titleStyle.setVerticalAlignment(XSSFCellStyle.VERTICAL_CENTER);
		titleStyle.setFillForegroundColor(new XSSFColor(new Color(182, 184, 192)));
		titleStyle.setFillPattern(XSSFCellStyle.SOLID_FOREGROUND);
		titleStyle.setFont(titleFont);
		setBorder(titleStyle, BorderStyle.THIN, new XSSFColor(new Color(0, 0, 0)));
		Row titleRow = sheet.createRow(rowIndex);
		// titleRow.setHeightInPoints(25);
		colIndex = 0;
		for (String field : titles) {
			Cell cell = titleRow.createCell(colIndex);
			cell.setCellValue(field);
			cell.setCellStyle(titleStyle);
			colIndex++;
		}
		rowIndex++;
		return rowIndex;
	}

	private static int writeTitlesToExcel2(SXSSFWorkbook wb, SXSSFSheet sheet, List<String> titles) {
		int rowIndex = 0;
		int colIndex = 0;
		Font titleFont = wb.createFont();
		titleFont.setFontName("simsun");
		titleFont.setBold(true);
		// titleFont.setFontHeightInPoints((short) 14);
		titleFont.setColor(IndexedColors.BLACK.index);
		CellStyle titleStyle = wb.createCellStyle();
		titleStyle.setAlignment(XSSFCellStyle.ALIGN_CENTER);
		titleStyle.setVerticalAlignment(XSSFCellStyle.VERTICAL_CENTER);
		titleStyle.setFillPattern(XSSFCellStyle.SOLID_FOREGROUND);
		titleStyle.setFont(titleFont);
		titleStyle.setFillForegroundColor(IndexedColors.AQUA.getIndex());
		setBorder2(titleStyle, BorderStyle.THIN);
		Row titleRow = sheet.createRow(rowIndex);
		// titleRow.setHeightInPoints(25);
		colIndex = 0;
		for (String field : titles) {
			Cell cell = titleRow.createCell(colIndex);
			cell.setCellValue(field);
			cell.setCellStyle(titleStyle);
			colIndex++;
		}
		rowIndex++;
		return rowIndex;
	}

	private static int writeRowsToExcel(XSSFWorkbook wb, Sheet sheet, List<List<Object>> rows, int rowIndex) {
		int colIndex = 0;
		Font dataFont = wb.createFont();
		dataFont.setFontName("simsun");
		// dataFont.setFontHeightInPoints((short) 14);
		dataFont.setColor(IndexedColors.BLACK.index);
		XSSFCellStyle dataStyle = wb.createCellStyle();
		dataStyle.setAlignment(XSSFCellStyle.ALIGN_CENTER);
		dataStyle.setVerticalAlignment(XSSFCellStyle.VERTICAL_CENTER);
		dataStyle.setFont(dataFont);
		setBorder(dataStyle, BorderStyle.THIN, new XSSFColor(new Color(0, 0, 0)));
		for (List<Object> rowData : rows) {
			Row dataRow = sheet.createRow(rowIndex);
			// dataRow.setHeightInPoints(25);
			colIndex = 0;
			for (Object cellData : rowData) {
				Cell cell = dataRow.createCell(colIndex);
				if (cellData != null) {
					cell.setCellValue(cellData.toString());
				} else {
					cell.setCellValue("");
				}
				cell.setCellStyle(dataStyle);
				colIndex++;
			}
			rowIndex++;
		}
		return rowIndex;
	}

	private static int writeRowsToExcel2(SXSSFWorkbook wb, SXSSFSheet sheet, List<List<Object>> rows, int rowIndex) throws IOException {
		int colIndex = 0;
		Font dataFont = wb.createFont();
		dataFont.setFontName("simsun");
		// dataFont.setFontHeightInPoints((short) 14);
		dataFont.setColor(IndexedColors.BLACK.index);
		CellStyle dataStyle = wb.createCellStyle();
		dataStyle.setAlignment(XSSFCellStyle.ALIGN_CENTER);
		dataStyle.setVerticalAlignment(XSSFCellStyle.VERTICAL_CENTER);
		dataStyle.setFont(dataFont);
		setBorder2(dataStyle, BorderStyle.THIN);
		for (List<Object> rowData : rows) {
			Row dataRow = sheet.createRow(rowIndex);
			// dataRow.setHeightInPoints(25);
			colIndex = 0;
			for (Object cellData : rowData) {
				Cell cell = dataRow.createCell(colIndex);
				if (cellData != null) {
					cell.setCellValue(cellData.toString());
				} else {
					cell.setCellValue("");
				}
				cell.setCellStyle(dataStyle);
				colIndex++;
			}
			rowIndex++;
			if (rowIndex % FLUSHSIZE == 0) {
				sheet.flushRows();
			}
		}
		return rowIndex;
	}

	private static void autoSizeColumns(Sheet sheet, int columnNumber) {
		for (int i = 0; i < columnNumber; i++) {
			int orgWidth = sheet.getColumnWidth(i);
			sheet.autoSizeColumn(i, true);
			int newWidth = (int) (sheet.getColumnWidth(i) + 150);
			if (newWidth > orgWidth) {
				sheet.setColumnWidth(i, newWidth);
			} else {
				sheet.setColumnWidth(i, orgWidth);
			}
		}
	}

	private static void autoSizeColumns2(SXSSFSheet sheet, int columnNumber) {
		for (int i = 0; i < columnNumber; i++) {
			int orgWidth = sheet.getColumnWidth(i);
			sheet.autoSizeColumn(i, true);
			int newWidth = (int) (sheet.getColumnWidth(i) + 150);
			if (newWidth > orgWidth) {
				sheet.setColumnWidth(i, newWidth);
			} else {
				sheet.setColumnWidth(i, orgWidth);
			}
		}
	}

	private static void setBorder(XSSFCellStyle style, BorderStyle border, XSSFColor color) {
		style.setBorderTop(border);
		style.setBorderLeft(border);
		style.setBorderRight(border);
		style.setBorderBottom(border);
		style.setBorderColor(BorderSide.TOP, color);
		style.setBorderColor(BorderSide.LEFT, color);
		style.setBorderColor(BorderSide.RIGHT, color);
		style.setBorderColor(BorderSide.BOTTOM, color);
	}

	private static void setBorder2(CellStyle style, BorderStyle border) {
		style.setBorderTop(border);
		style.setBorderLeft(border);
		style.setBorderRight(border);
		style.setBorderBottom(border);
	}
}
