/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/metamorBaselib/src/com/nec/jp/orteus/metamorBase/common04/amount/SbcntUnitCostStruct.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 */
package com.nec.jp.orteus.metamorBase.common04.amount;

/**
 * 外注単価情報データクラス
 * @author $Author: wang-derui $
 * @version $Revision: 1.5 $ $Date: 2008/03/26 07:28:36 $
 */
public class SbcntUnitCostStruct {
	/** 外注単価有効開始日 */
	private String EFF_PHASE_IN_DATE;
	/** サイズ */
	private String SBCNT_SIZE;
	/** 外注単価区分 */
	private String UNIT_COST_TYP;
	/** 外注単価 */
	private String UNIT_COST;
	/** 外注加工費 */
	private String PROCESSING_COST;
	/** 外注材料費 */
	private String MATERIAL_COST;
	/** 外注その他経費 */
	private String OTHER_OVERHEADS;
	/** 受注金額 */
	private String PUCH_ODR_AMOUNT;
	/** 値引金額 */
	private String DISC_AMOUNT;
	/** 値引後金額 */
	private String AFTER_DISC_AMOUNT;
	/** 仮邦貨金額 */
	private String PROVISIONAL_HOME_CUR_AMOUNT;
	/** 発注金額まるめ区分 */
	private String ROUND_TYP;
	/**	為替種別 */
	private String EXCH_TYP;
	/** 通貨コード */
	private String CUR_CD;
	/** 通貨名 */
	private String CUR_NAME;
	/** 通貨記号 */
	private String CUR_SYMBOL;
	/** 通貨単位 */
	private String CUR_UNIT;
	/** 小数桁数 */
	private String DECIMAL_FIG;
	/** 為替予約コード */
	private String EXCH_RESERVE_CD;
	/** 為替開始日付 */
	private String EXCH_START_DATE;
	/** 為替終了日付 */
	private String EXCH_END_DATE;
	/** 為替レート */
	private String EXCH_RATE;

	/**
	 * 通貨コードを返します。
	 * @return 通貨コード
	 */
	public String getCUR_CD() {
		return CUR_CD;
	}

	/**
	 * 通貨名を返します。
	 * @return 通貨名
	 */
	public String getCUR_NAME() {
		return CUR_NAME;
	}

	/**
	 * 通貨記号を返します。
	 * @return 通貨記号
	 */
	public String getCUR_SYMBOL() {
		return CUR_SYMBOL;
	}

	/**
	 * 通貨単位を返します。
	 * @return 通貨単位
	 */
	public String getCUR_UNIT() {
		return CUR_UNIT;
	}

	/**
	 * 小数桁数を返します。
	 * @return 小数桁数
	 */
	public String getDECIMAL_FIG() {
		return DECIMAL_FIG;
	}

	/**
	 * 外注単価有効開始日を返します。
	 * @return 外注単価有効開始日
	 */
	public String getEFF_PHASE_IN_DATE() {
		return EFF_PHASE_IN_DATE;
	}

	/**
	 * 為替種別を返します。
	 * @return 為替種別
	 */
	public String getEXCH_TYP() {
		return EXCH_TYP;
	}

	/**
	 * 外注材料費を返します。
	 * @return 外注材料費
	 */
	public String getMATERIAL_COST() {
		return MATERIAL_COST;
	}

	/**
	 * 外注その他経費を返します。
	 * @return 外注その他経費
	 */
	public String getOTHER_OVERHEADS() {
		return OTHER_OVERHEADS;
	}

	/**
	 * 外注加工費を返します。
	 * @return 外注加工費
	 */
	public String getPROCESSING_COST() {
		return PROCESSING_COST;
	}

	/**
	 * 受注金額を返します。
	 * @return 受注金額
	 */
	public String getPUCH_ODR_AMOUNT() {
		return PUCH_ODR_AMOUNT;
	}

	/**
	 * 発注金額まるめ区分を返します。
	 * @return 発注金額まるめ区分
	 */
	public String getROUND_TYP() {
		return ROUND_TYP;
	}

	/**
	 * サイズを返します。
	 * @return サイズ
	 */
	public String getSBCNT_SIZE() {
		return SBCNT_SIZE;
	}

	/**
	 * 外注単価を返します。
	 * @return 外注単価
	 */
	public String getUNIT_COST() {
		return UNIT_COST;
	}

	/**
	 * 外注単価区分を返します。
	 * @return 外注単価区分
	 */
	public String getUNIT_COST_TYP() {
		return UNIT_COST_TYP;
	}

	/**
	 * 通貨コードを設定します。
	 * @param string 通貨コード
	 */
	public void setCUR_CD(String string) {
		CUR_CD = string;
	}

	/**
	 * 通貨名を設定します。
	 * @param string 通貨名
	 */
	public void setCUR_NAME(String string) {
		CUR_NAME = string;
	}

	/**
	 * 通貨記号を設定します。
	 * @param string 通貨記号
	 */
	public void setCUR_SYMBOL(String string) {
		CUR_SYMBOL = string;
	}

	/**
	 * 通貨単位を設定します。
	 * @param string 通貨単位
	 */
	public void setCUR_UNIT(String string) {
		CUR_UNIT = string;
	}

	/**
	 * 小数桁数を設定します。
	 * @param string 小数桁数
	 */
	public void setDECIMAL_FIG(String string) {
		DECIMAL_FIG = string;
	}

	/**
	 * 外注単価有効開始日を設定します。
	 * @param string 外注単価有効開始日
	 */
	public void setEFF_PHASE_IN_DATE(String string) {
		EFF_PHASE_IN_DATE = string;
	}

	/**
	 * 為替種別を設定します。
	 * @param string 為替種別 
	 */
	public void setEXCH_TYP(String string) {
		EXCH_TYP = string;
	}

	/**
	 * 外注材料費を設定します。
	 * @param string 外注材料費
	 */
	public void setMATERIAL_COST(String string) {
		MATERIAL_COST = string;
	}

	/**
	 * 外注その他経費を設定します。
	 * @param string 外注その他経費
	 */
	public void setOTHER_OVERHEADS(String string) {
		OTHER_OVERHEADS = string;
	}

	/**
	 * 外注加工費を設定します。
	 * @param string 外注加工費
	 */
	public void setPROCESSING_COST(String string) {
		PROCESSING_COST = string;
	}

	/**
	 * 受注金額を設定します。
	 * @param string 受注金額
	 */
	public void setPUCH_ODR_AMOUNT(String string) {
		PUCH_ODR_AMOUNT = string;
	}

	/**
	 * 発注金額まるめ区分を設定します。
	 * @param string 発注金額まるめ区分
	 */
	public void setROUND_TYP(String string) {
		ROUND_TYP = string;
	}

	/**
	 * サイズを設定します。
	 * @param string サイズ
	 */
	public void setSBCNT_SIZE(String string) {
		SBCNT_SIZE = string;
	}

	/**
	 * 外注単価を設定します。
	 * @param string 外注単価
	 */
	public void setUNIT_COST(String string) {
		UNIT_COST = string;
	}

	/**
	 * 外注単価区分を設定します。
	 * @param string 外注単価区分
	 */
	public void setUNIT_COST_TYP(String string) {
		UNIT_COST_TYP = string;
	}

	/**
	 * 値引後金額を返します。
	 * @return 値引後金額
	 */
	public String getAFTER_DISC_AMOUNT() {
		return AFTER_DISC_AMOUNT;
	}

	/**
	 * 値引金額を返します。
	 * @return 値引金額
	 */
	public String getDISC_AMOUNT() {
		return DISC_AMOUNT;
	}

	/**
	 * 為替終了日付を返します。
	 * @return 為替終了日付
	 */
	public String getEXCH_END_DATE() {
		return EXCH_END_DATE;
	}

	/**
	 * 為替レートを返します。
	 * @return 為替レート
	 */
	public String getEXCH_RATE() {
		return EXCH_RATE;
	}

	/**
	 * 為替予約コードを返します。
	 * @return 為替予約コード
	 */
	public String getEXCH_RESERVE_CD() {
		return EXCH_RESERVE_CD;
	}

	/**
	 * 為替開始日付を返します。
	 * @return 為替開始日付
	 */
	public String getEXCH_START_DATE() {
		return EXCH_START_DATE;
	}

	/**
	 * 仮邦貨金額を返します。
	 * @return 仮邦貨金額
	 */
	public String getPROVISIONAL_HOME_CUR_AMOUNT() {
		return PROVISIONAL_HOME_CUR_AMOUNT;
	}

	/**
	 * 値引後金額を設定します。
	 * @param string 値引後金額
	 */
	public void setAFTER_DISC_AMOUNT(String string) {
		AFTER_DISC_AMOUNT = string;
	}

	/**
	 * 値引金額を設定します。
	 * @param string 値引金額
	 */
	public void setDISC_AMOUNT(String string) {
		DISC_AMOUNT = string;
	}

	/**
	 * 為替終了日付を設定します。
	 * @param string 為替終了日付
	 */
	public void setEXCH_END_DATE(String string) {
		EXCH_END_DATE = string;
	}

	/**
	 * 為替レートを設定します。
	 * @param string 為替レート
	 */
	public void setEXCH_RATE(String string) {
		EXCH_RATE = string;
	}

	/**
	 * 為替予約コードを設定します。
	 * @param string 為替予約コード
	 */
	public void setEXCH_RESERVE_CD(String string) {
		EXCH_RESERVE_CD = string;
	}

	/**
	 * 為替開始日付を設定します。
	 * @param string 為替開始日付
	 */
	public void setEXCH_START_DATE(String string) {
		EXCH_START_DATE = string;
	}

	/**
	 * 仮邦貨金額を設定します。
	 * @param string 仮邦貨金額
	 */
	public void setPROVISIONAL_HOME_CUR_AMOUNT(String string) {
		PROVISIONAL_HOME_CUR_AMOUNT = string;
	}

}
