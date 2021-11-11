/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/metamorBaselib/src/com/nec/jp/orteus/metamorBase/common04/sysdata/MyCompanyStruct.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 */
package com.nec.jp.orteus.metamorBase.common04.sysdata;

/**
 * 自社情報データクラス
 * @author $Author: wang-derui $
 * @version $Revision: 1.5 $ $Date: 2008/03/26 07:28:38 $
 */
public class MyCompanyStruct {

	/** SYSコントロールコード */
	private String CTRL_CD;
	/** 会社コード */
	private String COMPANY_CD;
	/** 開始曜日 */
	private String START_DAY;

	/**
	 * 会社コードを返します。
	 * @return 会社コード
	 */
	public String getCOMPANY_CD() {
		return COMPANY_CD;
	}

	/**
	 * SYSコントロールコードを返します。
	 * @return SYSコントロールコード
	 */
	public String getCTRL_CD() {
		return CTRL_CD;
	}

	/**
	 * 開始曜日を返します。
	 * @return 開始曜日
	 */
	public String getSTART_DAY() {
		return START_DAY;
	}

	/**
	 * 会社コードを設定します。
	 * @param string 会社コード
	 */
	public void setCOMPANY_CD(String string) {
		COMPANY_CD = string;
	}

	/**
	 * SYSコントロールコードを設定します。
	 * @param string SYSコントロールコード
	 */
	public void setCTRL_CD(String string) {
		CTRL_CD = string;
	}

	/**
	 * 開始曜日を設定します。
	 * @param string 開始曜日
	 */
	public void setSTART_DAY(String string) {
		START_DAY = string;
	}

}
