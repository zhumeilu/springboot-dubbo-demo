package com.lmhd.common.excel;

import java.io.Serializable;

public class DataSet implements Serializable {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 7808818844752216106L;
	private DataSetRow[]		rows;
	private int					rowLength;
	private int					colLength;

	public DataSet(int rowLength, int colLength) {
		this.rowLength = rowLength;
		this.colLength = colLength;
		rows = new DataSetRow[rowLength];
	}

	/**
	 * @Description: 行对象
	 * @author CJH
	 * @date 2016-1-25 上午10:59:02
	 * @version V1.0
	 * @类全名：com.lemeng.api.bean.DataSetRow
	 */
	public class DataSetRow {

		private int				rowIdx;
		private DataSetColum[]	colums	= new DataSetColum[colLength];

		public int getRowIdx() {
			return rowIdx;
		}

		public void setRowIdx(int rowIdx) {
			this.rowIdx = rowIdx;
		}

		public DataSetColum newColums() {
			return new DataSetColum();
		}

		public DataSetColum[] getColums() {
			return colums;
		}

		public void setColums(DataSetColum[] colums) {
			this.colums = colums;
		}

		public void addColums(int colIdx, DataSetColum colums) {
			getColums()[colIdx] = colums;
		}

		/**
		 * 根据列名获取某行的列对象
		 * 
		 * @param colName
		 * @return
		 */
		public DataSetColum getDataSetColum(String colName) {
			for (DataSetColum colum : colums) {
				String cName = colum.getColName();
				if (colName.equals(cName)) {
					return colum;
				}
			}
			return null;
		}

		/**
		 * 根据列id获取某行的列对象
		 * 
		 * @param colIdx
		 * @return
		 */
		public DataSetColum getDataSetColum(int colIdx) {
			for (DataSetColum colum : colums) {
				int idx = colum.getColIdx();
				if (idx == colIdx) {
					return colum;
				}
			}
			return null;
		}
	}

	/**
	 * @Description: 列对象
	 * @author CJH
	 * @date 2016-1-25 上午10:59:14
	 * @version V1.0
	 * @类全名：com.lemeng.api.bean.DataSetColum
	 */
	public class DataSetColum {

		private int		colIdx;
		private String	colName;
		private Object	colValue;

		public String getColName() {
			return colName;
		}

		public void setColName(String colName) {
			this.colName = colName;
		}

		public Object getColValue() {
			return colValue;
		}

		public void setColValue(Object colValue) {
			this.colValue = colValue;
		}

		public int getColIdx() {
			return colIdx;
		}

		public void setColIdx(int colIdx) {
			this.colIdx = colIdx;
		}
	}

	public DataSetRow newRows() {
		return new DataSetRow();
	}

	public DataSetRow[] getRows() {
		return rows;
	}

	public void addRows(int rowIdx, DataSetRow rows) {
		getRows()[rowIdx] = rows;
	}

	public int getRowLength() {
		return rowLength;
	}

	public void setRowLength(int rowLength) {
		this.rowLength = rowLength;
	}

	public int getColLength() {
		return colLength;
	}

	public void setColLength(int colLength) {
		this.colLength = colLength;
	}

	/**
	 * 根据行id以及列名获取某元素的值
	 * 
	 * @param rowIdx
	 *            行下表
	 * @param colName
	 *            列名
	 * @return
	 */
	public Object getValue(int rowIdx, String colName) {
		DataSetRow dataSetRow = rows[rowIdx];
		DataSetColum dataSetColum = dataSetRow.getDataSetColum(colName);
		return dataSetColum.getColValue();
	}

	/**
	 * 根据行id以及列id获取某元素的值
	 * 
	 * @param rowIdx
	 *            行下表
	 * @param colIdx
	 *            列id
	 * @return
	 */
	public Object getValue(int rowIdx, int colIdx) {
		DataSetRow dataSetRow = rows[rowIdx];
		DataSetColum dataSetColum = dataSetRow.getDataSetColum(colIdx);
		return dataSetColum.getColValue();
	}
}
