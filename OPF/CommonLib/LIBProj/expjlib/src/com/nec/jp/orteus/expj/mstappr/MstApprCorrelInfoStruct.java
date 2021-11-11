package com.nec.jp.orteus.expj.mstappr;

import java.util.List;

public class MstApprCorrelInfoStruct {
	/** ���FID */
	private String APPR_ID = null;

	/** ���F�}�� */
	private String APP_DETAIL_NO = null;

	/** ��� */
	private List INFO_COL = null;
	
	/** �폜�t���O */
	private String DEL_FLG = null;

	/** �쐬�� */
	private String CREATED_DATE = null;

	/** �쐬�� */
	private String CREATED_BY = null;

	/** �쐬�v���O�������� */
	private String CREATED_PRG_NM = null;

	/** �X�V�� */
	private String UPDATED_DATE = null;

	/** �X�V�� */
	private String UPDATED_BY = null;

	/** �X�V�v���O�������� */
	private String UPDATED_PRG_NM = null;

	/** �X�V�� */
	private String MODIFY_COUNT = null;

	public String getAPPR_ID() {
		return APPR_ID;
	}

	public void setAPPR_ID(String appr_id) {
		APPR_ID = appr_id;
	}

	public String getAPP_DETAIL_NO() {
		return APP_DETAIL_NO;
	}

	public void setAPP_DETAIL_NO(String app_detail_no) {
		APP_DETAIL_NO = app_detail_no;
	}

	public List getINFO_COL() {
		return INFO_COL;
	}

	public void setINFO_COL(List info_col) {
		INFO_COL = info_col;
	}

	public String getDEL_FLG() {
		return 	DEL_FLG;
	}

	public void setDEL_FLG(String del_flg) {
			DEL_FLG = del_flg;
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
