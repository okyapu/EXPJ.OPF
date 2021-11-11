/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AE0060/src/com/nec/jp/orteus/metamorBase/AE0060/UnitCostStruct.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 */
package com.nec.jp.orteus.metamorBase.AE0060;

/**
 * 単価情報データクラス
 * @author $Author: kong-haijing $
 * @version $Revision: 1.6 $ $Date: 2008/03/26 08:13:37 $
 */
public class UnitCostStruct {

	/** 単価区分 */
	private String UNIT_COST_TYP;
	/** 単価 */
	private String UNIT_COST;
	/** 加工費 */
	private String PROCESSING_COST;
	/** 材料費 */
	private String MATERIAL_COST;
	/** その他経費 */
	private String OTHER_OVERHEADS;
	/** 値引金額 */
	private String DISC_AMOUNT;
	/** 発注金額 */
	private String PUCH_ODR_AMOUNT;
	/** 税率1 */
	private String TAX_RATE_1;
	/** 税率2 */
	private String TAX_RATE_2;
	/** 税率3 */
	private String TAX_RATE_3;
	/** 本体金額 */
	private String NET_AMOUNT;
	/** 税額1 */
	private String TAX_AMOUNT_1;
	/** 税額2 */
	private String TAX_AMOUNT_2;
	/** 税額3 */
	private String TAX_AMOUNT_3;
	/** 税込金額 */
	private String AMOUNT_INCLUDE_TAX;
	/** 邦貨金額 */
	private String HOME_CUR_AMOUNT;
	/** 税コード */
	private String TAX_CD;
	/** 消費税適用区分 */
	private String TAX_APPLY_TYP;
	/** 税端数区分 */
	private String TAX_ROUND_TYP;
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

	/**
	 * 税込金額を返します。
	 * @return 税込金額 
	 */
	public String getAMOUNT_INCLUDE_TAX() {
		return AMOUNT_INCLUDE_TAX;
	}

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
	 * 値引金額を返します。
	 * @return 値引金額
	 */
	public String getDISC_AMOUNT() {
		return DISC_AMOUNT;
	}

	/**
	 * 為替種別を返します。
	 * @return 為替種別
	 */
	public String getEXCH_TYP() {
		return EXCH_TYP;
	}

	/**
	 * 邦貨金額を返します。
	 * @return 邦貨金額
	 */
	public String getHOME_CUR_AMOUNT() {
		return HOME_CUR_AMOUNT;
	}

	/**
	 * 材料費を返します。
	 * @return 材料費
	 */
	public String getMATERIAL_COST() {
		return MATERIAL_COST;
	}

	/**
	 * 本体金額を返します。
	 * @return 本体金額
	 */
	public String getNET_AMOUNT() {
		return NET_AMOUNT;
	}

	/**
	 * その他経費を返します。
	 * @return その他経費
	 */
	public String getOTHER_OVERHEADS() {
		return OTHER_OVERHEADS;
	}

	/**
	 * 加工費を返します。
	 * @return 加工費
	 */
	public String getPROCESSING_COST() {
		return PROCESSING_COST;
	}

	/**
	 * 発注金額を返します。
	 * @return 発注金額
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
	 * 税額1を返します。
	 * @return 税額1
	 */
	public String getTAX_AMOUNT_1() {
		return TAX_AMOUNT_1;
	}

	/**
	 * 税額2を返します。
	 * @return 税額2
	 */
	public String getTAX_AMOUNT_2() {
		return TAX_AMOUNT_2;
	}

	/**
	 * 税額3を返します。
	 * @return 税額3
	 */
	public String getTAX_AMOUNT_3() {
		return TAX_AMOUNT_3;
	}

	/**
	 * 消費税コードを返します。
	 * @return 消費税コード
	 */
	public String getTAX_CD() {
		return TAX_CD;
	}

	/**
	 * 消費税適用区分を返します。
	 * @return 消費税適用区分
	 */
	public String getTAX_APPLY_TYP() {
		return TAX_APPLY_TYP;
	}

	/**
	 * 税率1を返します。
	 * @return 税率1
	 */
	public String getTAX_RATE_1() {
		return TAX_RATE_1;
	}

	/**
	 * 税率2を返します。
	 * @return 税率2
	 */
	public String getTAX_RATE_2() {
		return TAX_RATE_2;
	}

	/**
	 * 税率3を返します。
	 * @return 税率3
	 */
	public String getTAX_RATE_3() {
		return TAX_RATE_3;
	}

	/**
	 * 税端数区分を返します。
	 * @return 税端数区分
	 */
	public String getTAX_ROUND_TYP() {
		return TAX_ROUND_TYP;
	}

	/**
	 * 単価を返します。
	 * @return 単価
	 */
	public String getUNIT_COST() {
		return UNIT_COST;
	}

	/**
	 * 単価区分を返します。
	 * @return 単価区分
	 */
	public String getUNIT_COST_TYP() {
		return UNIT_COST_TYP;
	}

	/**
	 * 税込金額を設定します。
	 * @param string 税込金額 
	 */
	public void setAMOUNT_INCLUDE_TAX(String string) {
		AMOUNT_INCLUDE_TAX = string;
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
	 * 値引金額を設定します。
	 * @param string 値引金額
	 */
	public void setDISC_AMOUNT(String string) {
		DISC_AMOUNT = string;
	}

	/**
	 * 為替種別を設定します。
	 * @param string 為替種別
	 */
	public void setEXCH_TYP(String string) {
		EXCH_TYP = string;
	}

	/**
	 * 邦貨金額を設定します。
	 * @param string 邦貨金額
	 */
	public void setHOME_CUR_AMOUNT(String string) {
		HOME_CUR_AMOUNT = string;
	}

	/**
	 * 材料費を設定します。
	 * @param string 材料費
	 */
	public void setMATERIAL_COST(String string) {
		MATERIAL_COST = string;
	}

	/**
	 * 本体金額を設定します。
	 * @param string 本体金額
	 */
	public void setNET_AMOUNT(String string) {
		NET_AMOUNT = string;
	}

	/**
	 * その他経費を設定します。
	 * @param string その他経費
	 */
	public void setOTHER_OVERHEADS(String string) {
		OTHER_OVERHEADS = string;
	}

	/**
	 * 加工費を設定します。
	 * @param string 加工費
	 */
	public void setPROCESSING_COST(String string) {
		PROCESSING_COST = string;
	}

	/**
	 * 発注金額を設定します。
	 * @param string 発注金額 
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
	 * 税額1を設定します。
	 * @param string 税額1
	 */
	public void setTAX_AMOUNT_1(String string) {
		TAX_AMOUNT_1 = string;
	}

	/**
	 * 税額2を設定します。
	 * @param string 税額2
	 */
	public void setTAX_AMOUNT_2(String string) {
		TAX_AMOUNT_2 = string;
	}

	/**
	 * 税額3を設定します。
	 * @param string 税額3
	 */
	public void setTAX_AMOUNT_3(String string) {
		TAX_AMOUNT_3 = string;
	}

	/**
	 * 消費税コードを設定します。
	 * @param string 消費税コード
	 */
	public void setTAX_CD(String string) {
		TAX_CD = string;
	}

	/**
	 * 消費税適用区分を設定します。
	 * @param string 消費税適用区分
	 */
	public void setTAX_APPLY_TYP(String string) {
		TAX_APPLY_TYP = string;
	}

	/**
	 * 税率1を設定します。
	 * @param string 税率1
	 */
	public void setTAX_RATE_1(String string) {
		TAX_RATE_1 = string;
	}

	/**
	 * 税率2を設定します。
	 * @param string 税率2
	 */
	public void setTAX_RATE_2(String string) {
		TAX_RATE_2 = string;
	}

	/**
	 * 税率3を設定します。
	 * @param string 税率3
	 */
	public void setTAX_RATE_3(String string) {
		TAX_RATE_3 = string;
	}

	/**
	 * 税端数区分を設定します。
	 * @param string 税端数区分
	 */
	public void setTAX_ROUND_TYP(String string) {
		TAX_ROUND_TYP = string;
	}
	/**
	 * 単価を設定します。
	 * @param string 単価
	 */
	public void setUNIT_COST(String string) {
		UNIT_COST = string;
	}

	/**
	 * 単価区分を設定します。
	 * @param string 単価区分
	 */
	public void setUNIT_COST_TYP(String string) {
		UNIT_COST_TYP = string;
	}
}
