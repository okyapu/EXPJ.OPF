package com.nec.jp.orteus.expj.mstappr;

public class MstApprCorrelStruct {
	/** 承認ID */
	private String APPR_ID = null;

	/** 承認関連ID */
	private String APPR_CORREL_ID = null;

	/** テーブル名 */
	private String TABLE_NAME = null;

	/** 処理区分 */
	private String PROC_TYP = null;

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

	public String getAPPR_CORREL_ID() {
		return APPR_CORREL_ID;
	}

	public void setAPPR_CORREL_ID(String appr_correl_id) {
		APPR_CORREL_ID = appr_correl_id;
	}

	public String getAPPR_ID() {
		return APPR_ID;
	}

	public void setAPPR_ID(String appr_id) {
		APPR_ID = appr_id;
	}

	public String getPROC_TYP() {
		return PROC_TYP;
	}

	public void setPROC_TYP(String proc_typ) {
		PROC_TYP = proc_typ;
	}

	public String getTABLE_NAME() {
		return TABLE_NAME;
	}

	public void setTABLE_NAME(String table_name) {
		TABLE_NAME = table_name;
	}

	public String getCREATED_BY() {
		return CREATED_BY;
	}

	public void setCREATED_BY(String created_by) {
		CREATED_BY = created_by;
	}

	public String getCREATED_DATE() {
		return CREATED_DATE;
	}

	public void setCREATED_DATE(String created_date) {
		CREATED_DATE = created_date;
	}

	public String getCREATED_PRG_NM() {
		return CREATED_PRG_NM;
	}

	public void setCREATED_PRG_NM(String created_prg_nm) {
		CREATED_PRG_NM = created_prg_nm;
	}

	public String getMODIFY_COUNT() {
		return MODIFY_COUNT;
	}

	public void setMODIFY_COUNT(String modify_count) {
		MODIFY_COUNT = modify_count;
	}

	public String getUPDATED_BY() {
		return UPDATED_BY;
	}

	public void setUPDATED_BY(String updated_by) {
		UPDATED_BY = updated_by;
	}

	public String getUPDATED_DATE() {
		return UPDATED_DATE;
	}

	public void setUPDATED_DATE(String updated_date) {
		UPDATED_DATE = updated_date;
	}

	public String getUPDATED_PRG_NM() {
		return UPDATED_PRG_NM;
	}

	public void setUPDATED_PRG_NM(String updated_prg_nm) {
		UPDATED_PRG_NM = updated_prg_nm;
	}

}
