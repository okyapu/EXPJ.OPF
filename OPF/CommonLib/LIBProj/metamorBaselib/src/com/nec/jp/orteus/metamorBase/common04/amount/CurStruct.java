/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/metamorBaselib/src/com/nec/jp/orteus/metamorBase/common04/amount/CurStruct.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 */
package com.nec.jp.orteus.metamorBase.common04.amount;

/**
 * 通貨情報データクラス
 * @author $Author: wang-derui $
 * @version $Revision: 1.5 $ $Date: 2008/03/26 07:28:35 $
 */
public class CurStruct {

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
	 * 為替種別を返します。
	 * @return 為替種別
	 */
	public String getEXCH_TYP() {
		return EXCH_TYP;
	}

	/**
	 * 発注金額まるめ区分を返します。
	 * @return 発注金額まるめ区分
	 */
	public String getROUND_TYP() {
		return ROUND_TYP;
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
	 * 為替種別を設定します。
	 * @param string 為替種別
	 */
	public void setEXCH_TYP(String string) {
		EXCH_TYP = string;
	}

	/**
	 * 発注金額まるめ区分を設定します。
	 * @param string 発注金額まるめ区分
	 */
	public void setROUND_TYP(String string) {
		ROUND_TYP = string;
	}
}
