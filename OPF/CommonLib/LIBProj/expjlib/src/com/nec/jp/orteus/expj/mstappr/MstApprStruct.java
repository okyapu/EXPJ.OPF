package com.nec.jp.orteus.expj.mstappr;

/**
 * 承認情報クラス
 * @author xing-qianying
 *
 */
public class MstApprStruct {

	/** 承認ID */
	private String APPR_ID = null;

	/** 画面URL */
	private String SCREEN_URL = null;

	/** 工場コード */
	private String PLANT_CD = null;

	/** 処理区分 */
	private String PROC_TYP = null;

	/** 承認備考 */
	private String APPR_REMARKS = null;

	/** 状態区分 */
	private String STATUS = null;

	/** 保留理由 */
	private String RESERVE_CAUSE = null;

	/** 依頼者 */
	private String REQUEST_BY = null;

	/** 承認者 */
	private String APPR_BY = null;

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

	/** 画面名 */
	private String SCREEN_NAME = null;

	/** 依頼数 */
	private String REQUEST_COUNT = null;

	/** 承認待ち数 */
	private String APPRING_COUNT = null;

	/** 保留数 */
	private String RESERVE_COUNT = null;

	/** 依頼日付 */
	private String REQUEST_DATE = null;
	
	/** テーブル名**/
	private String TABLE_NAEM = null;

	/** 項目1 */
	private String ITEM_COL1 = null;

	/** 項目2 */
	private String ITEM_COL2 = null;

	/** 項目3 */
	private String ITEM_COL3 = null;

	/** 項目4 */
	private String ITEM_COL4 = null;

	/** 項目5 */
	private String ITEM_COL5 = null;

	/** 依頼者名前*/
	private String REQUEST_BY_NAME = null;
	
	/** キー1名*/
	private String key1=null;
	/** キー1値 */
	private String value1=null;
	/** キー2名*/
	private String key2=null;
	/** キー2値 */
	private String value2=null;
	/** キー3名*/
	private String key3=null;
	/** キー3値 */
	private String value3=null;
	/** キー4名*/
	private String key4=null;
	/** キー4値 */
	private String value4=null;
	/** キー5名*/
	private String key5=null;
	/** キー5値 */
	private String value5=null;
	/** キー5名*/
	private String key6=null;
	/** キー5値 */
	private String value6=null;
	/** キー5名*/
	private String key7=null;
	/** キー5値 */
	private String value7=null;

	/**
	 * 承認者を返します。
	 * 
	 * @return 承認者
	 */
	public String getAPPR_BY() {
		return APPR_BY;
	}

	/**
	 * 業務ＩＤを返します。
	 * 
	 * @return 業務ＩＤ
	 */
	public String getAPPR_ID() {
		return APPR_ID;
	}

	/**
	 * 承認備考を返します。
	 * 
	 * @return 承認備考
	 */
	public String getAPPR_REMARKS() {
		return APPR_REMARKS;
	}

	/**
	 * 作成者を返します。
	 * 
	 * @return 作成者
	 */
	public String getCREATED_BY() {
		return CREATED_BY;
	}

	/**
	 * 作成日を返します。
	 * 
	 * @return 作成日
	 */
	public String getCREATED_DATE() {
		return CREATED_DATE;
	}

	/**
	 * 作成プログラム名称を返します。
	 * 
	 * @return 作成プログラム名称
	 */
	public String getCREATED_PRG_NM() {
		return CREATED_PRG_NM;
	}

	/**
	 * 更新数を返します。
	 * 
	 * @return 更新数
	 */
	public String getMODIFY_COUNT() {
		return MODIFY_COUNT;
	}

	/**
	 * 処理区分を返します。
	 * 
	 * @return 処理区分
	 */
	public String getPROC_TYP() {
		return PROC_TYP;
	}

	/**
	 * 依頼者を返します。
	 * 
	 * @return 依頼者
	 */
	public String getREQUEST_BY() {
		return REQUEST_BY;
	}

	/**
	 * 保留理由を返します。
	 * 
	 * @return 保留理由
	 */
	public String getRESERVE_CAUSE() {
		return RESERVE_CAUSE;
	}

	/**
	 * 状態区分を返します。
	 * 
	 * @return 状態区分
	 */
	public String getSTATUS() {
		return STATUS;
	}

	/**
	 * 更新者を返します。
	 * 
	 * @return 更新者
	 */
	public String getUPDATED_BY() {
		return UPDATED_BY;
	}

	/**
	 * 更新日を返します。
	 * 
	 * @return 更新日
	 */
	public String getUPDATED_DATE() {
		return UPDATED_DATE;
	}

	/**
	 * 更新プログラム名称を返します。
	 * 
	 * @return 更新プログラム名称
	 */
	public String getUPDATED_PRG_NM() {
		return UPDATED_PRG_NM;
	}

	/**
	 * 承認者を設定します。
	 * 
	 * @param 承認者
	 */
	public void setAPPR_BY(String appr_by) {
		APPR_BY = appr_by;
	}

	/**
	 * 承認IDを設定します。
	 * 
	 * @param 承認ID
	 */
	public void setAPPR_ID(String appr_id) {
		APPR_ID = appr_id;
	}

	/**
	 * 承認備考を設定します。
	 * 
	 * @param 承認備考
	 */
	public void setAPPR_REMARKS(String appr_remarks) {
		APPR_REMARKS = appr_remarks;
	}

	/**
	 * 工場コードを返します。
	 * 
	 * @return 工場コード
	 */
	public String getPLANT_CD() {
		return PLANT_CD;
	}

	/**
	 * 画面URLを返します。
	 * 
	 * @return 画面URL
	 */
	public String getSCREEN_URL() {
		return SCREEN_URL;
	}

	/**
	 * 工場コードを設定します。
	 * 
	 * @param 工場コード
	 */
	public void setPLANT_CD(String plant_cd) {
		PLANT_CD = plant_cd;
	}

	/**
	 * 画面URLを設定します。
	 * 
	 * @param 画面URL
	 */
	public void setSCREEN_URL(String screen_url) {
		SCREEN_URL = screen_url;
	}

	/**
	 * 作成者を設定します。
	 * 
	 * @param 作成者
	 */
	public void setCREATED_BY(String created_by) {
		CREATED_BY = created_by;
	}

	/**
	 * 作成日を設定します。
	 * 
	 * @param 作成日
	 */
	public void setCREATED_DATE(String created_date) {
		CREATED_DATE = created_date;
	}

	/**
	 * 作成プログラム名称を設定します。
	 * 
	 * @param 作成プログラム名称
	 */
	public void setCREATED_PRG_NM(String created_prg_nm) {
		CREATED_PRG_NM = created_prg_nm;
	}

	/**
	 * 更新数を設定します。
	 * 
	 * @param 更新数
	 */
	public void setMODIFY_COUNT(String modify_count) {
		MODIFY_COUNT = modify_count;
	}

	/**
	 * 処理区分を設定します。
	 * 
	 * @param 処理区分
	 */
	public void setPROC_TYP(String proc_typ) {
		PROC_TYP = proc_typ;
	}

	/**
	 * 依頼者を設定します。
	 * 
	 * @param 依頼者
	 */
	public void setREQUEST_BY(String request_by) {
		REQUEST_BY = request_by;
	}

	/**
	 * 保留理由を設定します。
	 * 
	 * @param 保留理由
	 */
	public void setRESERVE_CAUSE(String reserve_cause) {
		RESERVE_CAUSE = reserve_cause;
	}

	/**
	 * 状態区分を設定します。
	 * 
	 * @param 状態区分
	 */
	public void setSTATUS(String status) {
		STATUS = status;
	}

	/**
	 * 更新者を設定します。
	 * 
	 * @param 更新者
	 */
	public void setUPDATED_BY(String updated_by) {
		UPDATED_BY = updated_by;
	}

	/**
	 * 更新日を設定します。
	 * 
	 * @param 更新日
	 */
	public void setUPDATED_DATE(String updated_date) {
		UPDATED_DATE = updated_date;
	}

	/**
	 * 更新プログラム名称を設定します。
	 * 
	 * @param 更新プログラム名称
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
