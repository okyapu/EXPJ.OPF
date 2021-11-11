package com.nec.jp.orteus.expj.mstappr;

/**
 * ���F���N���X
 * @author xing-qianying
 *
 */
public class MstApprStruct {

	/** ���FID */
	private String APPR_ID = null;

	/** ���URL */
	private String SCREEN_URL = null;

	/** �H��R�[�h */
	private String PLANT_CD = null;

	/** �����敪 */
	private String PROC_TYP = null;

	/** ���F���l */
	private String APPR_REMARKS = null;

	/** ��ԋ敪 */
	private String STATUS = null;

	/** �ۗ����R */
	private String RESERVE_CAUSE = null;

	/** �˗��� */
	private String REQUEST_BY = null;

	/** ���F�� */
	private String APPR_BY = null;

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

	/** ��ʖ� */
	private String SCREEN_NAME = null;

	/** �˗��� */
	private String REQUEST_COUNT = null;

	/** ���F�҂��� */
	private String APPRING_COUNT = null;

	/** �ۗ��� */
	private String RESERVE_COUNT = null;

	/** �˗����t */
	private String REQUEST_DATE = null;
	
	/** �e�[�u����**/
	private String TABLE_NAEM = null;

	/** ����1 */
	private String ITEM_COL1 = null;

	/** ����2 */
	private String ITEM_COL2 = null;

	/** ����3 */
	private String ITEM_COL3 = null;

	/** ����4 */
	private String ITEM_COL4 = null;

	/** ����5 */
	private String ITEM_COL5 = null;

	/** �˗��Җ��O*/
	private String REQUEST_BY_NAME = null;
	
	/** �L�[1��*/
	private String key1=null;
	/** �L�[1�l */
	private String value1=null;
	/** �L�[2��*/
	private String key2=null;
	/** �L�[2�l */
	private String value2=null;
	/** �L�[3��*/
	private String key3=null;
	/** �L�[3�l */
	private String value3=null;
	/** �L�[4��*/
	private String key4=null;
	/** �L�[4�l */
	private String value4=null;
	/** �L�[5��*/
	private String key5=null;
	/** �L�[5�l */
	private String value5=null;
	/** �L�[5��*/
	private String key6=null;
	/** �L�[5�l */
	private String value6=null;
	/** �L�[5��*/
	private String key7=null;
	/** �L�[5�l */
	private String value7=null;

	/**
	 * ���F�҂�Ԃ��܂��B
	 * 
	 * @return ���F��
	 */
	public String getAPPR_BY() {
		return APPR_BY;
	}

	/**
	 * �Ɩ��h�c��Ԃ��܂��B
	 * 
	 * @return �Ɩ��h�c
	 */
	public String getAPPR_ID() {
		return APPR_ID;
	}

	/**
	 * ���F���l��Ԃ��܂��B
	 * 
	 * @return ���F���l
	 */
	public String getAPPR_REMARKS() {
		return APPR_REMARKS;
	}

	/**
	 * �쐬�҂�Ԃ��܂��B
	 * 
	 * @return �쐬��
	 */
	public String getCREATED_BY() {
		return CREATED_BY;
	}

	/**
	 * �쐬����Ԃ��܂��B
	 * 
	 * @return �쐬��
	 */
	public String getCREATED_DATE() {
		return CREATED_DATE;
	}

	/**
	 * �쐬�v���O�������̂�Ԃ��܂��B
	 * 
	 * @return �쐬�v���O��������
	 */
	public String getCREATED_PRG_NM() {
		return CREATED_PRG_NM;
	}

	/**
	 * �X�V����Ԃ��܂��B
	 * 
	 * @return �X�V��
	 */
	public String getMODIFY_COUNT() {
		return MODIFY_COUNT;
	}

	/**
	 * �����敪��Ԃ��܂��B
	 * 
	 * @return �����敪
	 */
	public String getPROC_TYP() {
		return PROC_TYP;
	}

	/**
	 * �˗��҂�Ԃ��܂��B
	 * 
	 * @return �˗���
	 */
	public String getREQUEST_BY() {
		return REQUEST_BY;
	}

	/**
	 * �ۗ����R��Ԃ��܂��B
	 * 
	 * @return �ۗ����R
	 */
	public String getRESERVE_CAUSE() {
		return RESERVE_CAUSE;
	}

	/**
	 * ��ԋ敪��Ԃ��܂��B
	 * 
	 * @return ��ԋ敪
	 */
	public String getSTATUS() {
		return STATUS;
	}

	/**
	 * �X�V�҂�Ԃ��܂��B
	 * 
	 * @return �X�V��
	 */
	public String getUPDATED_BY() {
		return UPDATED_BY;
	}

	/**
	 * �X�V����Ԃ��܂��B
	 * 
	 * @return �X�V��
	 */
	public String getUPDATED_DATE() {
		return UPDATED_DATE;
	}

	/**
	 * �X�V�v���O�������̂�Ԃ��܂��B
	 * 
	 * @return �X�V�v���O��������
	 */
	public String getUPDATED_PRG_NM() {
		return UPDATED_PRG_NM;
	}

	/**
	 * ���F�҂�ݒ肵�܂��B
	 * 
	 * @param ���F��
	 */
	public void setAPPR_BY(String appr_by) {
		APPR_BY = appr_by;
	}

	/**
	 * ���FID��ݒ肵�܂��B
	 * 
	 * @param ���FID
	 */
	public void setAPPR_ID(String appr_id) {
		APPR_ID = appr_id;
	}

	/**
	 * ���F���l��ݒ肵�܂��B
	 * 
	 * @param ���F���l
	 */
	public void setAPPR_REMARKS(String appr_remarks) {
		APPR_REMARKS = appr_remarks;
	}

	/**
	 * �H��R�[�h��Ԃ��܂��B
	 * 
	 * @return �H��R�[�h
	 */
	public String getPLANT_CD() {
		return PLANT_CD;
	}

	/**
	 * ���URL��Ԃ��܂��B
	 * 
	 * @return ���URL
	 */
	public String getSCREEN_URL() {
		return SCREEN_URL;
	}

	/**
	 * �H��R�[�h��ݒ肵�܂��B
	 * 
	 * @param �H��R�[�h
	 */
	public void setPLANT_CD(String plant_cd) {
		PLANT_CD = plant_cd;
	}

	/**
	 * ���URL��ݒ肵�܂��B
	 * 
	 * @param ���URL
	 */
	public void setSCREEN_URL(String screen_url) {
		SCREEN_URL = screen_url;
	}

	/**
	 * �쐬�҂�ݒ肵�܂��B
	 * 
	 * @param �쐬��
	 */
	public void setCREATED_BY(String created_by) {
		CREATED_BY = created_by;
	}

	/**
	 * �쐬����ݒ肵�܂��B
	 * 
	 * @param �쐬��
	 */
	public void setCREATED_DATE(String created_date) {
		CREATED_DATE = created_date;
	}

	/**
	 * �쐬�v���O�������̂�ݒ肵�܂��B
	 * 
	 * @param �쐬�v���O��������
	 */
	public void setCREATED_PRG_NM(String created_prg_nm) {
		CREATED_PRG_NM = created_prg_nm;
	}

	/**
	 * �X�V����ݒ肵�܂��B
	 * 
	 * @param �X�V��
	 */
	public void setMODIFY_COUNT(String modify_count) {
		MODIFY_COUNT = modify_count;
	}

	/**
	 * �����敪��ݒ肵�܂��B
	 * 
	 * @param �����敪
	 */
	public void setPROC_TYP(String proc_typ) {
		PROC_TYP = proc_typ;
	}

	/**
	 * �˗��҂�ݒ肵�܂��B
	 * 
	 * @param �˗���
	 */
	public void setREQUEST_BY(String request_by) {
		REQUEST_BY = request_by;
	}

	/**
	 * �ۗ����R��ݒ肵�܂��B
	 * 
	 * @param �ۗ����R
	 */
	public void setRESERVE_CAUSE(String reserve_cause) {
		RESERVE_CAUSE = reserve_cause;
	}

	/**
	 * ��ԋ敪��ݒ肵�܂��B
	 * 
	 * @param ��ԋ敪
	 */
	public void setSTATUS(String status) {
		STATUS = status;
	}

	/**
	 * �X�V�҂�ݒ肵�܂��B
	 * 
	 * @param �X�V��
	 */
	public void setUPDATED_BY(String updated_by) {
		UPDATED_BY = updated_by;
	}

	/**
	 * �X�V����ݒ肵�܂��B
	 * 
	 * @param �X�V��
	 */
	public void setUPDATED_DATE(String updated_date) {
		UPDATED_DATE = updated_date;
	}

	/**
	 * �X�V�v���O�������̂�ݒ肵�܂��B
	 * 
	 * @param �X�V�v���O��������
	 */
	public void setUPDATED_PRG_NM(String updated_prg_nm) {
		UPDATED_PRG_NM = updated_prg_nm;
	}

	/**
	 * @return Returns the aPPRING_COUNT.
	 */
	public String getAPPRING_COUNT() {
		return APPRING_COUNT;
	}

	/**
	 * @return Returns the rEQUEST_COUNT.
	 */
	public String getREQUEST_COUNT() {
		return REQUEST_COUNT;
	}

	/**
	 * @return Returns the rESERVE_COUNT.
	 */
	public String getRESERVE_COUNT() {
		return RESERVE_COUNT;
	}

	/**
	 * @return Returns the sCREEN_NAME.
	 */
	public String getSCREEN_NAME() {
		return SCREEN_NAME;
	}

	/**
	 * @param appring_count
	 *            The aPPRING_COUNT to set.
	 */
	public void setAPPRING_COUNT(String appring_count) {
		APPRING_COUNT = appring_count;
	}

	/**
	 * @param request_count
	 *            The rEQUEST_COUNT to set.
	 */
	public void setREQUEST_COUNT(String request_count) {
		REQUEST_COUNT = request_count;
	}

	/**
	 * @param reserve_count
	 *            The rESERVE_COUNT to set.
	 */
	public void setRESERVE_COUNT(String reserve_count) {
		RESERVE_COUNT = reserve_count;
	}

	/**
	 * @param screen_name
	 *            The sCREEN_NAME to set.
	 */
	public void setSCREEN_NAME(String screen_name) {
		SCREEN_NAME = screen_name;
	}

	/**
	 * @return Returns the iTEM_COL1.
	 */
	public String getITEM_COL1() {
		return ITEM_COL1;
	}

	/**
	 * @return Returns the iTEM_COL2.
	 */
	public String getITEM_COL2() {
		return ITEM_COL2;
	}

	/**
	 * @return Returns the iTEM_COL3.
	 */
	public String getITEM_COL3() {
		return ITEM_COL3;
	}

	/**
	 * @return Returns the iTEM_COL4.
	 */
	public String getITEM_COL4() {
		return ITEM_COL4;
	}

	/**
	 * @return Returns the iTEM_COL5.
	 */
	public String getITEM_COL5() {
		return ITEM_COL5;
	}

	/**
	 * @return Returns the rEQUEST_DATE.
	 */
	public String getREQUEST_DATE() {
		return REQUEST_DATE;
	}

	/**
	 * @param item_col1
	 *            The iTEM_COL1 to set.
	 */
	public void setITEM_COL1(String item_col1) {
		ITEM_COL1 = item_col1;
	}

	/**
	 * @param item_col2
	 *            The iTEM_COL2 to set.
	 */
	public void setITEM_COL2(String item_col2) {
		ITEM_COL2 = item_col2;
	}

	/**
	 * @param item_col3
	 *            The iTEM_COL3 to set.
	 */
	public void setITEM_COL3(String item_col3) {
		ITEM_COL3 = item_col3;
	}

	/**
	 * @param item_col4
	 *            The iTEM_COL4 to set.
	 */
	public void setITEM_COL4(String item_col4) {
		ITEM_COL4 = item_col4;
	}

	/**
	 * @param item_col5
	 *            The iTEM_COL5 to set.
	 */
	public void setITEM_COL5(String item_col5) {
		ITEM_COL5 = item_col5;
	}

	/**
	 * @param request_date
	 *            The rEQUEST_DATE to set.
	 */
	public void setREQUEST_DATE(String request_date) {
		REQUEST_DATE = request_date;
	}

	/**
	 * @return Returns the rEQUEST_BY_NAME.
	 */
	public String getREQUEST_BY_NAME() {
		return REQUEST_BY_NAME;
	}

	/**
	 * @param request_by_name
	 *            The rEQUEST_BY_NAME to set.
	 */
	public void setREQUEST_BY_NAME(String request_by_name) {
		REQUEST_BY_NAME = request_by_name;
	}

	/**
	 * @return Returns the key1.
	 */
	public String getKey1() {
		return key1;
	}

	/**
	 * @return Returns the key2.
	 */
	public String getKey2() {
		return key2;
	}

	/**
	 * @return Returns the key3.
	 */
	public String getKey3() {
		return key3;
	}

	/**
	 * @return Returns the key4.
	 */
	public String getKey4() {
		return key4;
	}

	/**
	 * @return Returns the key5.
	 */
	public String getKey5() {
		return key5;
	}

	/**
	 * @return Returns the value1.
	 */
	public String getValue1() {
		return value1;
	}

	/**
	 * @return Returns the value2.
	 */
	public String getValue2() {
		return value2;
	}

	/**
	 * @return Returns the value3.
	 */
	public String getValue3() {
		return value3;
	}

	/**
	 * @return Returns the value4.
	 */
	public String getValue4() {
		return value4;
	}

	/**
	 * @return Returns the value5.
	 */
	public String getValue5() {
		return value5;
	}

	/**
	 * @param key1 The key1 to set.
	 */
	public void setKey1(String key1) {
		this.key1 = key1;
	}

	/**
	 * @param key2 The key2 to set.
	 */
	public void setKey2(String key2) {
		this.key2 = key2;
	}

	/**
	 * @param key3 The key3 to set.
	 */
	public void setKey3(String key3) {
		this.key3 = key3;
	}

	/**
	 * @param key4 The key4 to set.
	 */
	public void setKey4(String key4) {
		this.key4 = key4;
	}

	/**
	 * @param key5 The key5 to set.
	 */
	public void setKey5(String key5) {
		this.key5 = key5;
	}

	/**
	 * @param value1 The value1 to set.
	 */
	public void setValue1(String value1) {
		this.value1 = value1;
	}

	/**
	 * @param value2 The value2 to set.
	 */
	public void setValue2(String value2) {
		this.value2 = value2;
	}

	/**
	 * @param value3 The value3 to set.
	 */
	public void setValue3(String value3) {
		this.value3 = value3;
	}

	/**
	 * @param value4 The value4 to set.
	 */
	public void setValue4(String value4) {
		this.value4 = value4;
	}

	/**
	 * @param value5 The value5 to set.
	 */
	public void setValue5(String value5) {
		this.value5 = value5;
	}

	/**
	 * @return Returns the key6.
	 */
	public String getKey6() {
		return key6;
	}

	/**
	 * @return Returns the key7.
	 */
	public String getKey7() {
		return key7;
	}

	/**
	 * @return Returns the value6.
	 */
	public String getValue6() {
		return value6;
	}

	/**
	 * @return Returns the value7.
	 */
	public String getValue7() {
		return value7;
	}

	/**
	 * @param key6 The key6 to set.
	 */
	public void setKey6(String key6) {
		this.key6 = key6;
	}

	/**
	 * @param key7 The key7 to set.
	 */
	public void setKey7(String key7) {
		this.key7 = key7;
	}

	/**
	 * @param value6 The value6 to set.
	 */
	public void setValue6(String value6) {
		this.value6 = value6;
	}

	/**
	 * @param value7 The value7 to set.
	 */
	public void setValue7(String value7) {
		this.value7 = value7;
	}

	/**
	 * @return Returns the tABLE_NAEM.
	 */
	public String getTABLE_NAEM() {
		return TABLE_NAEM;
	}

	/**
	 * @param table_naem The tABLE_NAEM to set.
	 */
	public void setTABLE_NAEM(String table_naem) {
		TABLE_NAEM = table_naem;
	}

}
