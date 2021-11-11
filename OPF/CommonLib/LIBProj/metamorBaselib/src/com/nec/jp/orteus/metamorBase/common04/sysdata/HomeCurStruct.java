/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/metamorBaselib/src/com/nec/jp/orteus/metamorBase/common04/sysdata/HomeCurStruct.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 */
package com.nec.jp.orteus.metamorBase.common04.sysdata;

/**
 * 邦貨情報データクラス
 * @author $Author: wang-derui $
 * @version $Revision: 1.5 $ $Date: 2008/03/26 07:28:38 $
 */
public class HomeCurStruct {

	/** SYSコントロールコード */
	private String CTRL_CD;
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
	 * SYSコントロールコードを返します。
	 * @return SYSコントロールコード
	 */
	public String getCTRL_CD() {
		return CTRL_CD;
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
	 * SYSコントロールコードを設定します。
	 * @param string SYSコントロールコード
	 */
	public void setCTRL_CD(String string) {
		CTRL_CD = string;
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

}
