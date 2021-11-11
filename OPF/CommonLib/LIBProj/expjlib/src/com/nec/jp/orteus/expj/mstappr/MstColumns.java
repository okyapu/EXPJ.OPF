package com.nec.jp.orteus.expj.mstappr;

/**
 * マスタ系承認用の表フィールド情報クラス
 * @author xing-qianying
 *
 */
public class MstColumns {

	private String columnname = null;
	private String columnID = null;
	private String data_typ = null;
	private String columnvalue = null;
	
	/**
	 * @return Returns the columnID.
	 */
	public String getColumnID() {
		return columnID;
	}
	/**
	 * @return Returns the columnname.
	 */
	public String getColumnname() {
		return columnname;
	}
	/**
	 * @param columnID The columnID to set.
	 */
	public void setColumnID(String columnID) {
		this.columnID = columnID;
	}
	/**
	 * @param columnname The columnname to set.
	 */
	public void setColumnname(String columnname) {
		this.columnname = columnname;
	}
	/**
	 * @return Returns the data_typ.
	 */
	public String getData_typ() {
		return data_typ;
	}
	/**
	 * @param data_typ The data_typ to set.
	 */
	public void setData_typ(String data_typ) {
		this.data_typ = data_typ;
	}
	/**
	 * @return Returns the columnvalue.
	 */
	public String getColumnvalue() {
		return columnvalue;
	}
	/**
	 * @param columnvalue The columnvalue to set.
	 */
	public void setColumnvalue(String columnvalue) {
		this.columnvalue = columnvalue;
	}
	

}
