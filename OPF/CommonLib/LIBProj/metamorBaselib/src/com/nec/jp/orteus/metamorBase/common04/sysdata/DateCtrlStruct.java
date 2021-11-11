/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/metamorBaselib/src/com/nec/jp/orteus/metamorBase/common04/sysdata/DateCtrlStruct.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 */
package com.nec.jp.orteus.metamorBase.common04.sysdata;

/**
 * 日付制御情報データクラス
 * @author $Author: wang-derui $
 * @version $Revision: 1.5 $ $Date: 2008/03/26 07:28:38 $
 */
public class DateCtrlStruct {

	/** 工場コード */
	private String PLANT_CD;
	/** 業務運用日 */
	private String BUSINESS_OPR_DATE;
	/** 計上日 */
	private String STOCK_CRITERION_DATE;

	/**
	 * 業務運用日を返します。
	 * @return 業務運用日
	 */
	public String getBUSINESS_OPR_DATE() {
		return BUSINESS_OPR_DATE;
	}

	/**
	 * 工場コードを返します。
	 * @return 工場コード
	 */
	public String getPLANT_CD() {
		return PLANT_CD;
	}

	/**
	 * 計上日を返します。
	 * @return 計上日
	 */
	public String getSTOCK_CRITERION_DATE() {
		return STOCK_CRITERION_DATE;
	}

	/**
	 * 業務運用日を設定します。
	 * @param string 業務運用日
	 */
	public void setBUSINESS_OPR_DATE(String string) {
		BUSINESS_OPR_DATE = string;
	}

	/**
	 * 工場コードを設定します。
	 * @param string 工場コード
	 */
	public void setPLANT_CD(String string) {
		PLANT_CD = string;
	}

	/**
	 * 計上日を設定します。
	 * @param string 計上日
	 */
	public void setSTOCK_CRITERION_DATE(String string) {
		STOCK_CRITERION_DATE = string;
	}

}
