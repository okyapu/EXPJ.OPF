package com.nec.jp.orteus.expj.mstappr;

/**
 * マスタ系承認用のキークラス
 * @author xing-qianying
 *
 */
public class MstApprKeyStruct {

	/** 承認ＩＤ */
	private String APPR_ID=null;
	/** テーブル名 */
	private String TABLE_NAME = null;
    /** キー名 */
	private String KEY_NAME=null;
	/** キー値 */
	private String KEY_VALUE=null;
	
	/** 作成日 */
	private String CREATED_DATE = null;

	/** 作成者 */
	private String CREATED_BY = null;

	/** 作成プログラム名称 */
	private String CREATED_PRG_NM = null;

	/** 更新日 */
	private String UPDATED_DATE = null;

	/** 更新者 */
	private String UPDATED_BY = null;

	/** 更新プログラム名称 */
	private String UPDATED_PRG_NM = null;

	/** 更新数 */
	private String MODIFY_COUNT = null;

	/**
	 * @return Returns the aPPR_ID.
	 */
	public String getAPPR_ID() {
		return APPR_ID;
	}
	/**
	 * @return Returns the kEY_NAME.
	 */
	public String getKEY_NAME() {
		return KEY_NAME;
	}
	/**
	 * @return Returns the kEY_VALUE.
	 */
	public String getKEY_VALUE() {
		return KEY_VALUE;
	}
	/**
	 * @return Returns the tABLE_NAME.
	 */
	public String getTABLE_NAME() {
		return TABLE_NAME;
	}
	/**
	 * @param appr_id The aPPR_ID to set.
	 */
	public void setAPPR_ID(String appr_id) {
		APPR_ID = appr_id;
	}
	/**
	 * @param key_name The kEY_NAME to set.
	 */
	public void setKEY_NAME(String key_name) {
		KEY_NAME = key_name;
	}
	/**
	 * @param key_value The kEY_VALUE to set.
	 */
	public void setKEY_VALUE(String key_value) {
		KEY_VALUE = key_value;
	}
	/**
	 * @param table_name The tABLE_NAME to set.
	 */
	public void setTABLE_NAME(String table_name) {
		TABLE_NAME = table_name;
	}
	/**
	 * @return Returns the cREATED_BY.
	 */
	public String getCREATED_BY() {
		return CREATED_BY;
	}
	/**
	 * @return Returns the cREATED_DATE.
	 */
	public String getCREATED_DATE() {
		return CREATED_DATE;
	}
	/**
	 * @return Returns the cREATED_PRG_NM.
	 */
	public String getCREATED_PRG_NM() {
		return CREATED_PRG_NM;
	}
	/**
	 * @return Returns the mODIFY_COUNT.
	 */
	public String getMODIFY_COUNT() {
		return MODIFY_COUNT;
	}
	/**
	 * @return Returns the uPDATED_BY.
	 */
	public String getUPDATED_BY() {
		return UPDATED_BY;
	}
	/**
	 * @return Returns the uPDATED_DATE.
	 */
	public String getUPDATED_DATE() {
		return UPDATED_DATE;
	}
	/**
	 * @return Returns the uPDATED_PRG_NM.
	 */
	public String getUPDATED_PRG_NM() {
		return UPDATED_PRG_NM;
	}
	/**
	 * @param created_by The cREATED_BY to set.
	 */
	public void setCREATED_BY(String created_by) {
		CREATED_BY = created_by;
	}
	/**
	 * @param created_date The cREATED_DATE to set.
	 */
	public void setCREATED_DATE(String created_date) {
		CREATED_DATE = created_date;
	}
	/**
	 * @param created_prg_nm The cREATED_PRG_NM to set.
	 */
	public void setCREATED_PRG_NM(String created_prg_nm) {
		CREATED_PRG_NM = created_prg_nm;
	}
	/**
	 * @param modify_count The mODIFY_COUNT to set.
	 */
	public void setMODIFY_COUNT(String modify_count) {
		MODIFY_COUNT = modify_count;
	}
	/**
	 * @param updated_by The uPDATED_BY to set.
	 */
	public void setUPDATED_BY(String updated_by) {
		UPDATED_BY = updated_by;
	}
	/**
	 * @param updated_date The uPDATED_DATE to set.
	 */
	public void setUPDATED_DATE(String updated_date) {
		UPDATED_DATE = updated_date;
	}
	/**
	 * @param updated_prg_nm The uPDATED_PRG_NM to set.
	 */
	public void setUPDATED_PRG_NM(String updated_prg_nm) {
		UPDATED_PRG_NM = updated_prg_nm;
	}
	
	

}
