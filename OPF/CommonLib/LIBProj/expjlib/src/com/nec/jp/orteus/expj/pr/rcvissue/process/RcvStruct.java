/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/pr/rcvissue/process/RcvStruct.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 */

package com.nec.jp.orteus.expj.pr.rcvissue.process;

/**
 * <B>RcvStruct</B><BR>
 * 入庫処理用のデータクラス<BR>
 * <BR>
 * @author $Author: wang-derui $
 * @version $Revision: 1.4 $
 */
public class RcvStruct
{

	//-------------------------------------------------------------------------
	// 値格納用メンバ変数
	//-------------------------------------------------------------------------
	/** 入出庫管理番号 */
	private String  m_RCV_ISSUE_CTRL_CD = null;
	/** 入出庫区分 */
	private Integer m_RCV_ISSUE_TYP = null;
	/** 品目番号 */
	private String  m_ITEM_CD = null;
	/** 工場コード */
	private String  m_PLANT_CD = null;
	/** 保管区コード */
	private String  m_WH_CD = null;
	/** 製番 */
	private String  m_JOB_ODR_CD = null;
	/** 発注番号 */
	private String  m_PUCH_ODR_CD = null;
	/** 作業計画番号 */
	private String  m_WORK_ODR_CD = null;
	/** 作業指示番号 */
	private String  m_ISSUE_INST_CD = null;
	/** 入出庫数 */
	private String  m_RCV_ISSUE_QTY = null;
	/** 入出庫年月日 */
	private String  m_RCV_ISSUE_DATE = null;
	/** 在庫更新区分 */
	private Integer m_STOCK_UPD_TYP = null;
	/** 入出庫発生区分 */
	private Integer m_RCV_ISSUE_GNR_TYP = null;
	/** 入出庫完了フラグ */
	private Integer m_RCV_ISSUE_CMPLT_FLG = null;
	/** オーダデマンド番号 */
	private String  m_OD_NO = null;
	/** 在庫ロット番号 */
	private String  m_LOT_NO = null;
	/** 品目在庫．手持在庫数 */
	private String  m_ITEM_STOCK_ON_HAND_QTY = null;
	/** 製番在庫．手持在庫数 */
	private String  m_JOB_STOCK_ON_HAND_QTY = null;
	/** 不良数 */
	private String  m_DEFECT_QTY = null;
	/** 更新者 */
	private String  m_UPDATED_BY = null;
	/** 更新プログラム名 */
	private String  m_UPDATED_PRG_NM = null;
	/* システム時刻 */
	private String  m_SYSDATE = null;
	/** 退避用在庫数 */
	private String  m_SAVE_STOCK_QTY = null;
	/** ロット管理フラグ */
	private Integer m_LOT_CTRL_FLG = null;
	
	//-------------------------------------------------------------------------
	// 要素取得関数
	//-------------------------------------------------------------------------
	/** 入出庫管理番号の取得 */
	public String  getRCV_ISSUE_CTRL_CD() { return m_RCV_ISSUE_CTRL_CD; }
	/** 入出庫区分の取得 */
	public Integer getRCV_ISSUE_TYP() { return m_RCV_ISSUE_TYP; }
	/** 品目番号の取得 */
	public String  getITEM_CD() { return m_ITEM_CD; }
	/** 工場コードの取得 */
	public String  getPLANT_CD() { return m_PLANT_CD; }
	/** 保管区コードの取得 */
	public String  getWH_CD() { return m_WH_CD; }
	/** 製番の取得 */
	public String  getJOB_ODR_CD() { return m_JOB_ODR_CD; }
	/** 発注番号の取得 */
	public String  getPUCH_ODR_CD() { return m_PUCH_ODR_CD; }
	/** 作業計画番号の取得 */
	public String  getWORK_ODR_CD() { return m_WORK_ODR_CD; }
	/** 作業指示番号の取得 */
	public String  getISSUE_INST_CD() { return m_ISSUE_INST_CD; }
	/** 入出庫数の取得 */
	public String  getRCV_ISSUE_QTY() { return m_RCV_ISSUE_QTY; }
	/** 入出庫年月日の取得 */
	public String  getRCV_ISSUE_DATE() { return m_RCV_ISSUE_DATE; }
	/** 在庫更新区分の取得 */
	public Integer getSTOCK_UPD_TYP() { return m_STOCK_UPD_TYP; }
	/** 入出庫発生区分の取得 */
	public Integer getRCV_ISSUE_GNR_TYP() { return m_RCV_ISSUE_GNR_TYP; }
	/** 入出庫完了フラグの取得 */
	public Integer getRCV_ISSUE_CMPLT_FLG() { return m_RCV_ISSUE_CMPLT_FLG; }
	/** オーダデマンド番号の取得 */
	public String  getOD_NO() { return m_OD_NO; }
	/** 在庫ロット番号の取得 */
	public String  getLOT_NO() { return m_LOT_NO; }
	/** 品目在庫．手持在庫数の取得 */
	public String  getITEM_STOCK_ON_HAND_QTY() { return m_ITEM_STOCK_ON_HAND_QTY; }
	/** 製番在庫．手持在庫数の取得 */
	public String  getJOB_STOCK_ON_HAND_QTY() { return m_JOB_STOCK_ON_HAND_QTY; }
	/** 不良数の取得 */
	public String  getDEFECT_QTY() { return m_DEFECT_QTY; }
	/** 更新者の取得 */
	public String  getUPDATED_BY() { return m_UPDATED_BY; }
	/** 更新プログラム名の取得 */
	public String  getUPDATED_PRG_NM() { return m_UPDATED_PRG_NM; }
	/** システム時刻の取得 */
	public String  getSYSDATE() { return m_SYSDATE; }
	/** 退避用在庫数取得 */
	public String getSAVE_STOCK_QTY() { return m_SAVE_STOCK_QTY; }
	/** ロット管理フラグ取得 */
	public Integer getLOT_CTRL_FLG() { return m_LOT_CTRL_FLG; }
	
	//-------------------------------------------------------------------------
	// 要素設定関数
	//-------------------------------------------------------------------------
	/** 入出庫管理番号の設定 */
	public void setRCV_ISSUE_CTRL_CD(String val) { m_RCV_ISSUE_CTRL_CD = val; }
	/** 入出庫区分の設定 */
	public void setRCV_ISSUE_TYP(Integer val) { m_RCV_ISSUE_TYP = val; }
	/** 品目番号の設定 */
	public void setITEM_CD(String val) { m_ITEM_CD = val; }
	/** 工場コードの設定 */
	public void setPLANT_CD(String val) { m_PLANT_CD = val; }
	/** 保管区コードの設定 */
	public void setWH_CD(String val) { m_WH_CD = val; }
	/** 製番の設定 */
	public void setJOB_ODR_CD(String val) { m_JOB_ODR_CD = val; }
	/** 発注番号の設定 */
	public void setPUCH_ODR_CD(String val) { m_PUCH_ODR_CD = val; }
	/** 作業計画番号の設定 */
	public void setWORK_ODR_CD(String val) { m_WORK_ODR_CD = val; }
	/** 作業指示番号の設定 */
	public void setISSUE_INST_CD(String val) { m_ISSUE_INST_CD = val; }
	/** 入出庫数の設定 */
	public void setRCV_ISSUE_QTY(String val) { m_RCV_ISSUE_QTY = val; }
	/** 入出庫年月日の設定 */
	public void setRCV_ISSUE_DATE(String val) { m_RCV_ISSUE_DATE = val; }
	/** 在庫更新区分の設定 */
	public void setSTOCK_UPD_TYP(Integer val) { m_STOCK_UPD_TYP = val; }
	/** 入出庫発生区分の設定 */
	public void setRCV_ISSUE_GNR_TYP(Integer val) { m_RCV_ISSUE_GNR_TYP = val; }
	/** 入出庫完了フラグの設定 */
	public void setRCV_ISSUE_CMPLT_FLG(Integer val) { m_RCV_ISSUE_CMPLT_FLG = val; }
	/** オーダデマンド番号の設定 */
	public void setOD_NO(String val) { m_OD_NO = val; }
	/** 在庫ロット番号の設定 */
	public void setLOT_NO(String val) { m_LOT_NO = val; }
	/** 品目在庫．手持在庫数の設定 */
	public void setITEM_STOCK_ON_HAND_QTY(String val) { m_ITEM_STOCK_ON_HAND_QTY = val; }
	/** 製番在庫．手持在庫数の設定 */
	public void setJOB_STOCK_ON_HAND_QTY(String val) { m_JOB_STOCK_ON_HAND_QTY = val; }
	/** 不良数の設定 */
	public void setDEFECT_QTY(String val) { m_DEFECT_QTY = val; }
	/** 更新者の設定 */
	public void setUPDATED_BY(String val) { m_UPDATED_BY = val; }
	/** 更新プログラム名の設定 */
	public void setUPDATED_PRG_NM(String val) { m_UPDATED_PRG_NM = val; }
	/** システム日付の設定 */
	public void setSYSDATE(String val) { m_SYSDATE = val; }
	/** 退避用在庫数設定 */
	public void setSAVE_STOCK_QTY(String val) { m_SAVE_STOCK_QTY = val; }
	/** ロット管理フラグ設定 */
	public void setLOT_CTRL_FLG(Integer val) { m_LOT_CTRL_FLG = val; }
	
	/**
	 * コンストラクタ
	 *
	 * @param なし
	 */
	public RcvStruct()
	{
		// 初期化
		initialize();
		return;
	}

	/**
	 * メンバ変数のクリア
	 *
	 * @param なし
	 */
	public void clear()
	{
		m_RCV_ISSUE_CTRL_CD = null;
		m_RCV_ISSUE_TYP = null;
		m_ITEM_CD = null;
		m_PLANT_CD = null;
		m_WH_CD = null;
		m_JOB_ODR_CD = null;
		m_PUCH_ODR_CD = null;
		m_WORK_ODR_CD = null;
		m_ISSUE_INST_CD = null;
		m_RCV_ISSUE_QTY = null;
		m_RCV_ISSUE_DATE = null;
		m_STOCK_UPD_TYP = null;
		m_RCV_ISSUE_GNR_TYP = null;
		m_RCV_ISSUE_CMPLT_FLG = null;
		m_OD_NO = null;
		m_LOT_NO = null;
		m_ITEM_STOCK_ON_HAND_QTY = null;
		m_JOB_STOCK_ON_HAND_QTY = null;
		m_DEFECT_QTY = null;
		m_UPDATED_BY = null;
		m_UPDATED_PRG_NM = null;
		m_SYSDATE = null;
		m_SAVE_STOCK_QTY = null;
		m_LOT_CTRL_FLG = null;

		return;
	}

	/**
	 * インスタンス破壊時に行う処理
	 *
	 * @param なし
	 */
	public void finalize()
	{
		// クリア
		clear();
		return;
	}

	/**
	 * 初期化
	 */
	public void initialize()
	{
		m_RCV_ISSUE_CTRL_CD = null;
		m_RCV_ISSUE_TYP = new Integer(0);
		m_ITEM_CD = null;
		m_PLANT_CD = null;
		m_WH_CD = null;
		m_JOB_ODR_CD = null;
		m_PUCH_ODR_CD = null;
		m_WORK_ODR_CD = null;
		m_ISSUE_INST_CD = null;
		m_RCV_ISSUE_QTY = "0";
		m_RCV_ISSUE_DATE = null;
		m_STOCK_UPD_TYP = new Integer(0);
		m_RCV_ISSUE_GNR_TYP = new Integer(0);
		m_RCV_ISSUE_CMPLT_FLG = new Integer(0);
		m_OD_NO = null;
		m_LOT_NO = null;
		m_ITEM_STOCK_ON_HAND_QTY = "0";
		m_JOB_STOCK_ON_HAND_QTY = "0";
		m_DEFECT_QTY = "0";
		m_UPDATED_BY = null;
		m_UPDATED_PRG_NM = null;
		m_SYSDATE = null;
		m_SAVE_STOCK_QTY = "0";
		m_LOT_CTRL_FLG = new Integer(0);

	}

	/**
	 * コピー
	 */
	public void copy(RcvStruct struct)
	{
		clear();
		if(struct.m_RCV_ISSUE_CTRL_CD != null)
			 m_RCV_ISSUE_CTRL_CD = new String(struct.getRCV_ISSUE_CTRL_CD());
		if(struct.m_RCV_ISSUE_TYP != null)
			 m_RCV_ISSUE_TYP = new Integer(struct.getRCV_ISSUE_TYP().intValue());
		if(struct.m_ITEM_CD != null)
			 m_ITEM_CD = new String(struct.getITEM_CD());
		if(struct.m_PLANT_CD != null)
			 m_PLANT_CD = new String(struct.getPLANT_CD());
		if(struct.m_WH_CD != null)
			 m_WH_CD = new String(struct.getWH_CD());
		if(struct.m_JOB_ODR_CD != null)
			 m_JOB_ODR_CD = new String(struct.getJOB_ODR_CD());
		if(struct.m_PUCH_ODR_CD != null)
			 m_PUCH_ODR_CD = new String(struct.getPUCH_ODR_CD());
		if(struct.m_WORK_ODR_CD != null)
			 m_WORK_ODR_CD = new String(struct.getWORK_ODR_CD());
		if(struct.m_ISSUE_INST_CD != null)
			 m_ISSUE_INST_CD = new String(struct.getISSUE_INST_CD());
		if(struct.m_RCV_ISSUE_QTY != null)
			 m_RCV_ISSUE_QTY = new String(struct.getRCV_ISSUE_QTY());
		if(struct.m_RCV_ISSUE_DATE != null)
			 m_RCV_ISSUE_DATE = new String(struct.getRCV_ISSUE_DATE());
		if(struct.m_STOCK_UPD_TYP != null)
			 m_STOCK_UPD_TYP = new Integer(struct.getSTOCK_UPD_TYP().intValue());
		if(struct.m_RCV_ISSUE_GNR_TYP != null)
			 m_RCV_ISSUE_GNR_TYP = new Integer(struct.getRCV_ISSUE_GNR_TYP().intValue());
		if(struct.m_RCV_ISSUE_CMPLT_FLG != null)
			 m_RCV_ISSUE_CMPLT_FLG = new Integer(struct.getRCV_ISSUE_CMPLT_FLG().intValue());
		if(struct.m_OD_NO != null)
			 m_OD_NO = new String(struct.getOD_NO());
		if(struct.m_LOT_NO != null)
			 m_LOT_NO = struct.getLOT_NO();
		if(struct.m_ITEM_STOCK_ON_HAND_QTY != null)
			 m_ITEM_STOCK_ON_HAND_QTY = new String(struct.getITEM_STOCK_ON_HAND_QTY());
		if(struct.m_JOB_STOCK_ON_HAND_QTY != null)
			 m_JOB_STOCK_ON_HAND_QTY = new String(struct.getJOB_STOCK_ON_HAND_QTY());
		if(struct.m_DEFECT_QTY != null)
			 m_DEFECT_QTY = new String(struct.getDEFECT_QTY());
		if(struct.m_UPDATED_BY != null)
			 m_UPDATED_BY = new String(struct.getUPDATED_BY());
		if(struct.m_UPDATED_PRG_NM != null)
			 m_UPDATED_PRG_NM = new String(struct.getUPDATED_PRG_NM());
		if(struct.m_SYSDATE != null)
			 m_SYSDATE = new String(struct.getSYSDATE());
		if(struct.m_SAVE_STOCK_QTY != null)
			 m_SAVE_STOCK_QTY = struct.getSAVE_STOCK_QTY();
		if(struct.m_LOT_CTRL_FLG != null)
			m_LOT_CTRL_FLG = struct.getLOT_CTRL_FLG();
	}


	/**
	 * コピーコンストラクタ
	 */
	 public RcvStruct(RcvStruct struct)
	 {
	 	copy(struct);
	 }

	/** 入出庫区分 入庫*/
	public static final int ISSUE_RCV_TYP_RCV		= 1;

	/** 入出庫区分 出庫*/
	public static final int ISSUE_RCV_TYP_ISSUE		= 2;

	/** 入出庫区分 不良入庫*/
	public static final int ISSUE_RCV_TYP_DEF_RCV	= 3;

	/** 入出庫区分 不良出庫*/
	public static final int ISSUE_RCV_TYP_DEF_ISSUE	= 4;

	/** 入出庫発生区分 通常入庫*/
	public static final int GNR_TYP_DEFAULT			= 11;

	/** 入出庫発生区分 計画外入庫*/
	public static final int GNR_TYP_OUTSIDE_OF_PLAN	= 12;

	/** 入出庫発生区分 移動入庫*/
	public static final int GNR_TYP_MOVE			= 13;

	/** 入出庫発生区分 振替入庫*/
	public static final int GNR_TYP_TRANSFER		= 14;

	/** 入出庫発生区分 入庫取消*/
	public static final int GNR_TYP_CANCEL			= 19;

	/** 入出庫発生区分 工程在庫入庫*/
	public static final int GNR_TYP_PROC_STOCK			= 61;
	
	/** 入出庫発生区分 工程在庫入庫取消*/
	public static final int GNR_TYP_PROC_STOCK_CANCEL			= 69;
	
	/** 入出庫発生区分 取引先在庫入庫*/
	public static final int GNR_TYP_VEND_STOCK			= 81;
	
	/** 入出庫発生区分 取引先在庫入庫取消*/
	public static final int GNR_TYP_VEND_STOCK_CANCEL			= 89;
	
	/** 在庫更新区分 更新済*/
	public static final int UPD_TYP_COMPLETED		= 2;
	
	/** ロット管理フラグ ロット管理*/
	public static final int LOT_CTRL_LOT           = 1;

}
