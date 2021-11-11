/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/metamorBaselib/src/com/nec/jp/orteus/metamorBase/common04/amount/ExchRateStruct.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 */
package com.nec.jp.orteus.metamorBase.common04.amount;

/**
 * 為替レート情報データクラス
 * @author $Author: wang-derui $
 * @version $Revision: 1.5 $ $Date: 2008/03/26 07:28:35 $
 */
public class ExchRateStruct {

	/** 会社コード */
	private String COMPANY_CD;
	/** 通貨コード */
	private String CUR_CD;
	/** 為替種別 */
	private String EXCH_TYP;
	/** 為替予約コード */
	private String EXCH_RESERVE_CD;
	/** 為替開始日付 */
	private String EXCH_START_DATE;
	/** 為替終了日付 */
	private String EXCH_END_DATE;
	/** 為替レート */
	private String EXCH_RATE;

	/**
	 * 会社コードを返します。
	 * @return 会社コード
	 */
	public String getCOMPANY_CD() {
		return COMPANY_CD;
	}

	/**
	 * 通貨コードを返します。
	 * @return 通貨コード
	 */
	public String getCUR_CD() {
		return CUR_CD;
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
	 * 為替種別を返します。
	 * @return 為替種別
	 */
	public String getEXCH_TYP() {
		return EXCH_TYP;
	}

	/**
	 * 会社コードを設定します。
	 * @param string 会社コード
	 */
	public void setCOMPANY_CD(String string) {
		COMPANY_CD = string;
	}

	/**
	 * 通貨コードを設定します。
	 * @param string 通貨コード
	 */
	public void setCUR_CD(String string) {
		CUR_CD = string;
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
	 * 為替種別を設定します。
	 * @param string 為替種別
	 */
	public void setEXCH_TYP(String string) {
		EXCH_TYP = string;
	}

}