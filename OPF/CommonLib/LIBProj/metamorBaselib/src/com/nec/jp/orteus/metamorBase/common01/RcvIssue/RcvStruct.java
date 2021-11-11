//------------------------------------------------------------------------------
// (#)RcvStruct.java
//
// Copyright (c) 2003 NEC Informatec Systems,Ltd.
//
// 2003/08/21 新規作成 M.Hotokebuchi
// 2003/08/26 M.Hotokebuchi
//            ・getISSUE_INST_CD()の戻り値が不正だったため修正
//            ・数量をInteger → Double (int → double) に変換
// 2003/08/27 M.Hotokebuchi
//           ・update時に追加する更新日,更新者,更新プログラム用の記述を追加
// 2003/09/01 M.Hotokebuchi
//           ・Double→String 対応
// 2003/10/20 M.Hotokebuchi
//           ・業務運用日を計上日に変更
// 2003/12/05 M.Hotokebuchi
//           ・計上日判定処理の削除に伴い、関連項目を削除
//
//------------------------------------------------------------------------------

package com.nec.jp.orteus.metamorBase.common01.RcvIssue;

/**
 * <B>RcvStruct</B><BR>
 * 入庫処理用のデータクラス<BR>
 * <BR>
 * @author  M.Hotokebuchi
 * @version 1.00
 */
public class RcvStruct
{

	/**
	 * 値格納用メンバ変数
	 */
	public String  m_RCV_ISSUE_CTRL_CD = null;			// 入出庫管理番号
	public Integer m_RCV_ISSUE_TYP = null;				// 入出庫区分
	public String  m_ITEM_CD = null;					// 品目番号
	public String  m_PLANT_CD = null;					// 工場コード
	public String  m_WH_CD = null;						// 保管区コード
	public String  m_JOB_ODR_CD = null;					// 製番
	public String  m_PUCH_ODR_CD = null;				// 発注番号
	public String  m_WORK_ODR_CD = null;				// 作業計画番号
	public String  m_ISSUE_INST_CD = null;				// 作業指示番号
	public String  m_RCV_ISSUE_QTY = null;				// 入出庫数
	public String  m_RCV_ISSUE_DATE = null;				// 入出庫年月日
	public Integer m_STOCK_UPD_TYP = null;				// 在庫更新区分
	public Integer m_RCV_ISSUE_GNR_TYP = null;			// 入出庫発生区分
	public Integer m_RCV_ISSUE_CMPLT_FLG = null;		// 入出庫完了フラグ
	public String  m_OD_NO = null;						// オーダデマンド番号
	public String  m_ITEM_STOCK_ON_HAND_QTY = null;		// 品目在庫 手持在庫数
	public String  m_JOB_STOCK_ON_HAND_QTY = null;		// 製番在庫 手持在庫数
	public String  m_DEFECT_QTY = null;					// 不良数
	public String  m_UPDATED_BY = null;					// 更新者
	public String  m_UPDATED_PRG_NM = null;				// 更新プログラム名
	public String  m_SYSDATE = null;					// システム時刻

	/**
	 * 要素取得関数
	 */
	public String  getRCV_ISSUE_CTRL_CD() { return m_RCV_ISSUE_CTRL_CD; }
	public Integer getRCV_ISSUE_TYP() { return m_RCV_ISSUE_TYP; }
	public String  getITEM_CD() { return m_ITEM_CD; }
	public String  getPLANT_CD() { return m_PLANT_CD; }
	public String  getWH_CD() { return m_WH_CD; }
	public String  getJOB_ODR_CD() { return m_JOB_ODR_CD; }
	public String  getPUCH_ODR_CD() { return m_PUCH_ODR_CD; }
	public String  getWORK_ODR_CD() { return m_WORK_ODR_CD; }
	public String  getISSUE_INST_CD() { return m_ISSUE_INST_CD; }
	public String  getRCV_ISSUE_QTY() { return m_RCV_ISSUE_QTY; }
	public String  getRCV_ISSUE_DATE() { return m_RCV_ISSUE_DATE; }
	public Integer getSTOCK_UPD_TYP() { return m_STOCK_UPD_TYP; }
	public Integer getRCV_ISSUE_GNR_TYP() { return m_RCV_ISSUE_GNR_TYP; }
	public Integer getRCV_ISSUE_CMPLT_FLG() { return m_RCV_ISSUE_CMPLT_FLG; }
	public String  getOD_NO() { return m_OD_NO; }
	public String  getITEM_STOCK_ON_HAND_QTY() { return m_ITEM_STOCK_ON_HAND_QTY; }
	public String  getJOB_STOCK_ON_HAND_QTY() { return m_JOB_STOCK_ON_HAND_QTY; }
	public String  getDEFECT_QTY() { return m_DEFECT_QTY; }
	public String  getUPDATED_BY() { return m_UPDATED_BY; }
	public String  getUPDATED_PRG_NM() { return m_UPDATED_PRG_NM; }
	public String  getSYSDATE() { return m_SYSDATE; }

	/**
	 * 要素設定関数
	 */
	public void setRCV_ISSUE_CTRL_CD(String val) { m_RCV_ISSUE_CTRL_CD = val; }
	public void setRCV_ISSUE_TYP(Integer val) { m_RCV_ISSUE_TYP = val; }
	public void setITEM_CD(String val) { m_ITEM_CD = val; }
	public void setPLANT_CD(String val) { m_PLANT_CD = val; }
	public void setWH_CD(String val) { m_WH_CD = val; }
	public void setJOB_ODR_CD(String val) { m_JOB_ODR_CD = val; }
	public void setPUCH_ODR_CD(String val) { m_PUCH_ODR_CD = val; }
	public void setWORK_ODR_CD(String val) { m_WORK_ODR_CD = val; }
	public void setISSUE_INST_CD(String val) { m_ISSUE_INST_CD = val; }
	public void setRCV_ISSUE_QTY(String val) { m_RCV_ISSUE_QTY = val; }
	public void setRCV_ISSUE_DATE(String val) { m_RCV_ISSUE_DATE = val; }
	public void setSTOCK_UPD_TYP(Integer val) { m_STOCK_UPD_TYP = val; }
	public void setRCV_ISSUE_GNR_TYP(Integer val) { m_RCV_ISSUE_GNR_TYP = val; }
	public void setRCV_ISSUE_CMPLT_FLG(Integer val) { m_RCV_ISSUE_CMPLT_FLG = val; }
	public void setOD_NO(String val) { m_OD_NO = val; }
	public void setITEM_STOCK_ON_HAND_QTY(String val) { m_ITEM_STOCK_ON_HAND_QTY = val; }
	public void setJOB_STOCK_ON_HAND_QTY(String val) { m_JOB_STOCK_ON_HAND_QTY = val; }
	public void setDEFECT_QTY(String val) { m_DEFECT_QTY = val; }
	public void setUPDATED_BY(String val) { m_UPDATED_BY = val; }
	public void setUPDATED_PRG_NM(String val) { m_UPDATED_PRG_NM = val; }
	public void setSYSDATE(String val) { m_SYSDATE = val; }

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
		m_ITEM_STOCK_ON_HAND_QTY = null;
		m_JOB_STOCK_ON_HAND_QTY = null;
		m_DEFECT_QTY = null;
		m_UPDATED_BY = null;
		m_UPDATED_PRG_NM = null;
		m_SYSDATE = null;

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
		m_ITEM_STOCK_ON_HAND_QTY = "0";
		m_JOB_STOCK_ON_HAND_QTY = "0";
		m_DEFECT_QTY = "0";
		m_UPDATED_BY = null;
		m_UPDATED_PRG_NM = null;
		m_SYSDATE = null;

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

	/** 在庫更新区分 更新済*/
	public static final int UPD_TYP_COMPLETED		= 2;

}
