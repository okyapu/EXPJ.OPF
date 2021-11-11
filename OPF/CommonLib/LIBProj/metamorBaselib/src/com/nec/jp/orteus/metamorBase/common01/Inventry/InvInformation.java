//------------------------------------------------------------------------------
// (#)InvInformation.java
//
// Copyright (c) 2003 NEC Informatec Systems,Ltd.
//
// 2003/12/15 新規作成  M.Isoda
//------------------------------------------------------------------------------

package com.nec.jp.orteus.metamorBase.common01.Inventry;

/**
 * 棚卸情報クラス<br>
 *
 * @author  M.Isoda
 * @version 1.00
*/
public class InvInformation
{
	//--------------------------------------------------------------------------
	// 構築

	/** コンストラクタ */
	public InvInformation(){ clear(); }

	/**
	 * コンストラクタ
	 * @param コピー元
	 */
	public InvInformation(InvInformation p)
	{
		copy(p);
	}

	//--------------------------------------------------------------------------
	// 変数

	private String m_INV_DATE = null;
	private String m_REGULAR_INV_FLG = null;
	private String m_CYCLE_INV_FLG = null;
	private String m_TEMP_INV_FLG = null;
	private String m_INV_STS_TYP = null;
	private String m_PLANT_CD = null;
	private String m_PLANT_NAME = null;
	private String m_WH_CD = null;
	private String m_WH_NAME = null;
	private String m_ITEM_CD = null;
	private String m_ITEM_NAME = null;
	private String m_STOCK_ON_HAND_QTY = null;
	private String m_DEFECT_QTY = null;
	private String m_STOCK_UNIT = null;
	private String m_JOB_ODR_CD = null;
	private String m_ISSUE_PLANT_CD = null;
	private String m_ISSUE_PLANT_NAME = null;
	private String m_ISSUE_WH_CD = null;
	private String m_ISSUE_WH_NAME = null;
	private String m_RCV_PLANT_CD = null;
	private String m_RCV_PLANT_NAME = null;
	private String m_RCV_WH_CD = null;
	private String m_RCV_WH_NAME = null;
	private String m_w_TRANSPORT_QTY = null;
	private String m_SYSTEM_DATETIME = null;
	private String m_w_SUM_RCV_ISSUE_QTY = null;
	private String m_RCV_ISSUE_QTY = null;
	private String m_RCV_ISSUE_CTRL_CD = null;
	private String m_RCV_ISSUE_TYP = null;
	private String m_RCV_ISSUE_DATE = null;
	private String m_RCV_ISSUE_GNR_TYP = null;
	private String m_STOCK_UPD_TYP = null;
	private String m_RCV_ISSUE_CMPLT_FLG = null;
	private String m_INV_UPD_FLG = null;
	private String m_ACTUAL_STOCK_QTY = null;
	private String m_FINAL_BOOK_STOCK_QTY = null;
	private String m_FINAL_BOOK_DEFECT_QTY = null;
	private String m_MNT_DATA_TYP = null;
	private String m_PERIOD_DATE = null;
	private String m_TODAY = null;
	private String m_MNT_PERIOD = null;
	private String m_ABC_TYP = null;
	private String m_SAVE_STOCK_HAND_QTY = null;
	private String m_LOT_NO = null;
	private String m_LOT_NO_P = null;	
	private String m_EXTERNAL_LOT_NO = null;
	private String m_LOT_CTRL_FLG = null;
    private String m_COMPANY_CD = null;

	//--------------------------------------------------------------------------
	// (get|set)メソッド

	public String getINV_DATE() { return m_INV_DATE; }
	public String getREGULAR_INV_FLG() { return m_REGULAR_INV_FLG; }
	public String getCYCLE_INV_FLG() { return m_CYCLE_INV_FLG; }
	public String getTEMP_INV_FLG() { return m_TEMP_INV_FLG; }
	public String getINV_STS_TYP() { return m_INV_STS_TYP; }
	public String getPLANT_CD() { return m_PLANT_CD; }
	public String getPLANT_NAME() { return m_PLANT_NAME; }
	public String getWH_CD() { return m_WH_CD; }
	public String getWH_NAME() { return m_WH_NAME; }
	public String getITEM_CD() { return m_ITEM_CD; }
	public String getITEM_NAME() { return m_ITEM_NAME; }
	public String getSTOCK_ON_HAND_QTY() { return m_STOCK_ON_HAND_QTY; }
	public String getDEFECT_QTY() { return m_DEFECT_QTY; }
	public String getSTOCK_UNIT() { return m_STOCK_UNIT; }
	public String getJOB_ODR_CD() { return m_JOB_ODR_CD; }
	public String getISSUE_PLANT_CD() { return m_ISSUE_PLANT_CD; }
	public String getISSUE_PLANT_NAME() { return m_ISSUE_PLANT_NAME; }
	public String getISSUE_WH_CD() { return m_ISSUE_WH_CD; }
	public String getISSUE_WH_NAME() { return m_ISSUE_WH_NAME; }
	public String getRCV_PLANT_CD() { return m_RCV_PLANT_CD; }
	public String getRCV_PLANT_NAME() { return m_RCV_PLANT_NAME; }
	public String getRCV_WH_CD() { return m_RCV_WH_CD; }
	public String getRCV_WH_NAME() { return m_RCV_WH_NAME; }
	public String getw_TRANSPORT_QTY() { return m_w_TRANSPORT_QTY; }
	public String getSYSTEM_DATETIME() { return m_SYSTEM_DATETIME; }
	public String getw_SUM_RCV_ISSUE_QTY() { return m_w_SUM_RCV_ISSUE_QTY; }
	public String getRCV_ISSUE_QTY() { return m_RCV_ISSUE_QTY; }
	public String getRCV_ISSUE_CTRL_CD() { return m_RCV_ISSUE_CTRL_CD; }
	public String getRCV_ISSUE_TYP() { return m_RCV_ISSUE_TYP; }
	public String getRCV_ISSUE_DATE() { return m_RCV_ISSUE_DATE; }
	public String getRCV_ISSUE_GNR_TYP() { return m_RCV_ISSUE_GNR_TYP; }
	public String getSTOCK_UPD_TYP() { return m_STOCK_UPD_TYP; }
	public String getRCV_ISSUE_CMPLT_FLG() { return m_RCV_ISSUE_CMPLT_FLG; }
	public String getINV_UPD_FLG() { return m_INV_UPD_FLG; }
	public String getACTUAL_STOCK_QTY() { return m_ACTUAL_STOCK_QTY; }
	public String getFINAL_BOOK_STOCK_QTY() { return m_FINAL_BOOK_STOCK_QTY; }
	public String getFINAL_BOOK_DEFECT_QTY() { return m_FINAL_BOOK_DEFECT_QTY; }
	public String getMNT_DATA_TYP() { return m_MNT_DATA_TYP; }
	public String getPERIOD_DATE() { return m_PERIOD_DATE; }
	public String getTODAY() { return m_TODAY; }
	public String getMNT_PERIOD() { return m_MNT_PERIOD; }
	public String getABC_TYP() { return m_ABC_TYP; }
	public String getSAVE_STOCK_HAND_QTY() { return m_SAVE_STOCK_HAND_QTY; }
	public String getLOT_NO() { return m_LOT_NO; }
	public String getLOT_NO_P() { return m_LOT_NO_P; }
	public String getEXTERNAL_LOT_NO() { return m_EXTERNAL_LOT_NO; }
	public String getLOT_CTRL_FLG() {return m_LOT_CTRL_FLG; }
    public String getCOMPANY_CD() {return m_COMPANY_CD; }

	public void setINV_DATE(String val) { m_INV_DATE = val; }
	public void setREGULAR_INV_FLG(String val) { m_REGULAR_INV_FLG = val; }
	public void setCYCLE_INV_FLG(String val) { m_CYCLE_INV_FLG = val; }
	public void setTEMP_INV_FLG(String val) { m_TEMP_INV_FLG = val; }
	public void setINV_STS_TYP(String val) { m_INV_STS_TYP = val; }
	public void setPLANT_CD(String val) { m_PLANT_CD = val; }
	public void setPLANT_NAME(String val) { m_PLANT_NAME = val; }
	public void setWH_CD(String val) { m_WH_CD = val; }
	public void setWH_NAME(String val) { m_WH_NAME = val; }
	public void setITEM_CD(String val) { m_ITEM_CD = val; }
	public void setITEM_NAME(String val) { m_ITEM_NAME = val; }
	public void setSTOCK_ON_HAND_QTY(String val) { m_STOCK_ON_HAND_QTY = val; }
	public void setDEFECT_QTY(String val) { m_DEFECT_QTY = val; }
	public void setSTOCK_UNIT(String val) { m_STOCK_UNIT = val; }
	public void setJOB_ODR_CD(String val) { m_JOB_ODR_CD = val; }
	public void setISSUE_PLANT_CD(String val) { m_ISSUE_PLANT_CD = val; }
	public void setISSUE_PLANT_NAME(String val) { m_ISSUE_PLANT_NAME = val; }
	public void setISSUE_WH_CD(String val) { m_ISSUE_WH_CD = val; }
	public void setISSUE_WH_NAME(String val) { m_ISSUE_WH_NAME = val; }
	public void setRCV_PLANT_CD(String val) { m_RCV_PLANT_CD = val; }
	public void setRCV_PLANT_NAME(String val) { m_RCV_PLANT_NAME = val; }
	public void setRCV_WH_CD(String val) { m_RCV_WH_CD = val; }
	public void setRCV_WH_NAME(String val) { m_RCV_WH_NAME = val; }
	public void setw_TRANSPORT_QTY(String val) { m_w_TRANSPORT_QTY = val; }
	public void setSYSTEM_DATETIME(String val) { m_SYSTEM_DATETIME = val; }
	public void setw_SUM_RCV_ISSUE_QTY(String val) { m_w_SUM_RCV_ISSUE_QTY = val; }
	public void setRCV_ISSUE_QTY(String val) { m_RCV_ISSUE_QTY = val; }
	public void setRCV_ISSUE_CTRL_CD(String val) { m_RCV_ISSUE_CTRL_CD = val; }
	public void setRCV_ISSUE_TYP(String val) { m_RCV_ISSUE_TYP = val; }
	public void setRCV_ISSUE_DATE(String val) { m_RCV_ISSUE_DATE = val; }
	public void setRCV_ISSUE_GNR_TYP(String val) { m_RCV_ISSUE_GNR_TYP = val; }
	public void setSTOCK_UPD_TYP(String val) { m_STOCK_UPD_TYP = val; }
	public void setRCV_ISSUE_CMPLT_FLG(String val) { m_RCV_ISSUE_CMPLT_FLG = val; }
	public void setINV_UPD_FLG(String val) { m_INV_UPD_FLG = val; }
	public void setACTUAL_STOCK_QTY(String val) { m_ACTUAL_STOCK_QTY = val; }
	public void setFINAL_BOOK_STOCK_QTY(String val) { m_FINAL_BOOK_STOCK_QTY = val; }
	public void setFINAL_BOOK_DEFECT_QTY(String val) { m_FINAL_BOOK_DEFECT_QTY = val; }
	public void setMNT_DATA_TYP(String val) { m_MNT_DATA_TYP = val; }
	public void setPERIOD_DATE(String val) { m_PERIOD_DATE = val; }
	public void setTODAY(String val) { m_TODAY = val; }
	public void setMNT_PERIOD(String val) { m_MNT_PERIOD = val; }
	public void setABC_TYP(String val) { m_ABC_TYP = val; }
	public void setSAVE_STOCK_HAND_QTY(String val) { m_SAVE_STOCK_HAND_QTY = val; }
	public void setLOT_NO(String val) { m_LOT_NO = val; }
	public void setLOT_NO_P(String val) { m_LOT_NO_P = val; }
	public void setEXTERNAL_LOT_NO(String val) { m_EXTERNAL_LOT_NO = val; }
	public void setLOT_CTRL_FLG(String val) {m_LOT_CTRL_FLG = val; }
	public void setCOMPANY_CD(String val) {m_COMPANY_CD = val; }

	//--------------------------------------------------------------------------
	// その他メソッド

	/**
	 * クリア
	 */
	public void clear()
	{
		m_INV_DATE = null;
		m_REGULAR_INV_FLG = null;
		m_CYCLE_INV_FLG = null;
		m_TEMP_INV_FLG = null;
		m_INV_STS_TYP = null;
		m_PLANT_CD = null;
		m_PLANT_NAME = null;
		m_WH_CD = null;
		m_WH_NAME = null;
		m_ITEM_CD = null;
		m_ITEM_NAME = null;
		m_STOCK_ON_HAND_QTY = null;
		m_DEFECT_QTY = null;
		m_STOCK_UNIT = null;
		m_JOB_ODR_CD = null;
		m_ISSUE_PLANT_CD = null;
		m_ISSUE_PLANT_NAME = null;
		m_ISSUE_WH_CD = null;
		m_ISSUE_WH_NAME = null;
		m_RCV_PLANT_CD = null;
		m_RCV_PLANT_NAME = null;
		m_RCV_WH_CD = null;
		m_RCV_WH_NAME = null;
		m_w_TRANSPORT_QTY = null;
		m_SYSTEM_DATETIME = null;
		m_w_SUM_RCV_ISSUE_QTY = null;
		m_RCV_ISSUE_QTY = null;
		m_RCV_ISSUE_CTRL_CD = null;
		m_RCV_ISSUE_TYP = null;
		m_RCV_ISSUE_DATE = null;
		m_RCV_ISSUE_GNR_TYP = null;
		m_STOCK_UPD_TYP = null;
		m_RCV_ISSUE_CMPLT_FLG = null;
		m_INV_UPD_FLG = null;
		m_ACTUAL_STOCK_QTY = null;
		m_FINAL_BOOK_STOCK_QTY = null;
		m_FINAL_BOOK_DEFECT_QTY = null;
		m_MNT_DATA_TYP = null;
		m_PERIOD_DATE = null;
		m_TODAY = null;
		m_MNT_PERIOD = null;
		m_ABC_TYP = null;
		m_SAVE_STOCK_HAND_QTY = null;
		m_LOT_NO = null ;
		m_LOT_NO_P = null;
		m_EXTERNAL_LOT_NO = null;
		m_LOT_CTRL_FLG = null;
        m_COMPANY_CD = null;
		return;
	}

	//--------------------------------------------------------------------------
	/**
	 * 直持ち変数のコピー
	 * @param s コピー元
	 */
	public void copy(InvInformation s)
	{
		clear();
		if(s.m_INV_DATE != null) m_INV_DATE = new String(s.m_INV_DATE);
		if(s.m_REGULAR_INV_FLG != null) m_REGULAR_INV_FLG = new String(s.m_REGULAR_INV_FLG);
		if(s.m_CYCLE_INV_FLG != null) m_CYCLE_INV_FLG = new String(s.m_CYCLE_INV_FLG);
		if(s.m_TEMP_INV_FLG != null) m_TEMP_INV_FLG = new String(s.m_TEMP_INV_FLG);
		if(s.m_INV_STS_TYP != null) m_INV_STS_TYP = new String(s.m_INV_STS_TYP);
		if(s.m_PLANT_CD != null) m_PLANT_CD = new String(s.m_PLANT_CD);
		if(s.m_PLANT_NAME != null) m_PLANT_NAME = new String(s.m_PLANT_NAME);
		if(s.m_WH_CD != null) m_WH_CD = new String(s.m_WH_CD);
		if(s.m_WH_NAME != null) m_WH_NAME = new String(s.m_WH_NAME);
		if(s.m_ITEM_CD != null) m_ITEM_CD = new String(s.m_ITEM_CD);
		if(s.m_ITEM_NAME != null) m_ITEM_NAME = new String(s.m_ITEM_NAME);
		if(s.m_STOCK_ON_HAND_QTY != null) m_STOCK_ON_HAND_QTY = new String(s.m_STOCK_ON_HAND_QTY);
		if(s.m_DEFECT_QTY != null) m_DEFECT_QTY = new String(s.m_DEFECT_QTY);
		if(s.m_STOCK_UNIT != null) m_STOCK_UNIT = new String(s.m_STOCK_UNIT);
		if(s.m_JOB_ODR_CD != null) m_JOB_ODR_CD = new String(s.m_JOB_ODR_CD);
		if(s.m_ISSUE_PLANT_CD != null) m_ISSUE_PLANT_CD = new String(s.m_ISSUE_PLANT_CD);
		if(s.m_ISSUE_PLANT_NAME != null) m_ISSUE_PLANT_NAME = new String(s.m_ISSUE_PLANT_NAME);
		if(s.m_ISSUE_WH_CD != null) m_ISSUE_WH_CD = new String(s.m_ISSUE_WH_CD);
		if(s.m_ISSUE_WH_NAME != null) m_ISSUE_WH_NAME = new String(s.m_ISSUE_WH_NAME);
		if(s.m_RCV_PLANT_CD != null) m_RCV_PLANT_CD = new String(s.m_RCV_PLANT_CD);
		if(s.m_RCV_PLANT_NAME != null) m_RCV_PLANT_NAME = new String(s.m_RCV_PLANT_NAME);
		if(s.m_RCV_WH_CD != null) m_RCV_WH_CD = new String(s.m_RCV_WH_CD);
		if(s.m_RCV_WH_NAME != null) m_RCV_WH_NAME = new String(s.m_RCV_WH_NAME);
		if(s.m_w_TRANSPORT_QTY != null) m_w_TRANSPORT_QTY = new String(s.m_w_TRANSPORT_QTY);
		if(s.m_SYSTEM_DATETIME != null) m_SYSTEM_DATETIME = new String(s.m_SYSTEM_DATETIME);
		if(s.m_w_SUM_RCV_ISSUE_QTY != null) m_w_SUM_RCV_ISSUE_QTY = new String(s.m_w_SUM_RCV_ISSUE_QTY);
		if(s.m_RCV_ISSUE_QTY != null) m_RCV_ISSUE_QTY = new String(s.m_RCV_ISSUE_QTY);
		if(s.m_RCV_ISSUE_CTRL_CD != null) m_RCV_ISSUE_CTRL_CD = new String(s.m_RCV_ISSUE_CTRL_CD);
		if(s.m_RCV_ISSUE_TYP != null) m_RCV_ISSUE_TYP = new String(s.m_RCV_ISSUE_TYP);
		if(s.m_RCV_ISSUE_DATE != null) m_RCV_ISSUE_DATE = new String(s.m_RCV_ISSUE_DATE);
		if(s.m_RCV_ISSUE_GNR_TYP != null) m_RCV_ISSUE_GNR_TYP = new String(s.m_RCV_ISSUE_GNR_TYP);
		if(s.m_STOCK_UPD_TYP != null) m_STOCK_UPD_TYP = new String(s.m_STOCK_UPD_TYP);
		if(s.m_RCV_ISSUE_CMPLT_FLG != null) m_RCV_ISSUE_CMPLT_FLG = new String(s.m_RCV_ISSUE_CMPLT_FLG);
		if(s.m_INV_UPD_FLG != null) m_INV_UPD_FLG = new String(s.m_INV_UPD_FLG);
		if(s.m_ACTUAL_STOCK_QTY != null) m_ACTUAL_STOCK_QTY = new String(s.m_ACTUAL_STOCK_QTY);
		if(s.m_FINAL_BOOK_STOCK_QTY != null) m_FINAL_BOOK_STOCK_QTY = new String(s.m_FINAL_BOOK_STOCK_QTY);
		if(s.m_FINAL_BOOK_DEFECT_QTY != null) m_FINAL_BOOK_DEFECT_QTY = new String(s.m_FINAL_BOOK_DEFECT_QTY);
		if(s.m_MNT_DATA_TYP != null) m_MNT_DATA_TYP = new String(s.m_MNT_DATA_TYP);
		if(s.m_PERIOD_DATE != null) m_PERIOD_DATE = new String(s.m_PERIOD_DATE);
		if(s.m_TODAY != null) m_TODAY = new String(s.m_TODAY);
		if(s.m_MNT_PERIOD != null) m_MNT_PERIOD = new String(s.m_MNT_PERIOD);
		if(s.m_SAVE_STOCK_HAND_QTY != null) m_SAVE_STOCK_HAND_QTY = new String(s.m_SAVE_STOCK_HAND_QTY);
		if(s.m_LOT_NO!= null) m_LOT_NO = new String(s.m_LOT_NO);
		if(s.m_LOT_NO_P!= null) m_LOT_NO_P = new String(s.m_LOT_NO_P);
		if(s.m_EXTERNAL_LOT_NO != null) m_EXTERNAL_LOT_NO = new String(s.m_EXTERNAL_LOT_NO);
		if(s.m_LOT_CTRL_FLG != null) m_LOT_CTRL_FLG = new String(s.m_LOT_CTRL_FLG);
		if(s.m_COMPANY_CD != null) m_COMPANY_CD = new String(s.m_COMPANY_CD);

	}
}
