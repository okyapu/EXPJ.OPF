/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/metamorBaselib/src/com/nec/jp/orteus/metamorBase/common04/sysdata/TaxNameStruct.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 */
package com.nec.jp.orteus.metamorBase.common04.sysdata;

/**
 * 税名情報データクラス
 * @author $Author: wang-derui $
 * @version $Revision: 1.5 $ $Date: 2008/03/26 07:28:38 $
 */
public class TaxNameStruct {

	/** SYSコントロールコード */
	private String CTRL_CD;
	/** 税名1 */
	private String TAX_NAME_1;
	/** 税名2 */
	private String TAX_NAME_2;
	/** 税名3 */
	private String TAX_NAME_3;

	/**
	 * SYSコントロールコードを返します。
	 * @return SYSコントロールコード
	 */
	public String getCTRL_CD() {
		return CTRL_CD;
	}

	/**
	 * 税名1を返します。
	 * @return 税名1
	 */
	public String getTAX_NAME_1() {
		return TAX_NAME_1;
	}

	/**
	 * 税名2を返します。
	 * @return 税名2
	 */
	public String getTAX_NAME_2() {
		return TAX_NAME_2;
	}

	/**
	 * 税名3を返します。
	 * @return 税名3
	 */
	public String getTAX_NAME_3() {
		return TAX_NAME_3;
	}

	/**
	 * SYSコントロールコードを設定します。
	 * @param string SYSコントロールコード
	 */
	public void setCTRL_CD(String string) {
		CTRL_CD = string;
	}

	/**
	 * 税名1を設定します。
	 * @param string 税名1
	 */
	public void setTAX_NAME_1(String string) {
		TAX_NAME_1 = string;
	}

	/**
	 * 税名2を設定します。
	 * @param string 税名2
	 */
	public void setTAX_NAME_2(String string) {
		TAX_NAME_2 = string;
	}

	/**
	 * 税名3を設定します。
	 * @param string 税名3
	 */
	public void setTAX_NAME_3(String string) {
		TAX_NAME_3 = string;
	}

}
