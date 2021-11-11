package com.nec.jp.orteus.expj.mstappr;

public class MstApprCorrelDetailStruct {
	/** 承認関連ID */
	private String APPR_CORREL_ID = null;

	/** 枝番 */
	private String DETAIL_NO = null;

	/** 項目名 */
	private String FIELD_NAME = null;

	/** 項目値 */
	private String FIELD_VALUE = null;

	/** 主キーフラグ */
	private String KEY_FLG = null;

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

	public String getAPPR_CORREL_ID() {
		return APPR_CORREL_ID;
	}

	public void setAPPR_CORREL_ID(String appr_correl_id) {
		APPR_CORREL_ID = appr_correl_id;
	}

	public String getDETAIL_NO() {
		return DETAIL_NO;
	}

	public void setDETAIL_NO(String detail_no) {
		DETAIL_NO = detail_no;
	}

	public String getFIELD_NAME() {
		return FIELD_NAME;
	}

	public void setFIELD_NAME(String field_name) {
		FIELD_NAME = field_name;
	}

	public String getFIELD_VALUE() {
		return FIELD_VALUE;
	}

	public void setFIELD_VALUE(String field_value) {
		FIELD_VALUE = field_value;
	}

	public String getKEY_FLG() {
		return KEY_FLG;
	}

	public void setKEY_FLG(String key_flg) {
		KEY_FLG = key_flg;
	}

}
