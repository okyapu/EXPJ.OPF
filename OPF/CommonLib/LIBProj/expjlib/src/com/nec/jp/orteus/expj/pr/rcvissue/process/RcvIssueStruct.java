/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/pr/rcvissue/process/RcvIssueStruct.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 *
 */

package com.nec.jp.orteus.expj.pr.rcvissue.process;

import java.math.BigDecimal;
import java.util.Date;


/**
 * <pre>
 * 一括出庫の共通処理を行います。
 * このクラスは、以下の業務処理から呼び出されます。
 * 　１．キット出庫(一括更新)
 * 　２．マニュアル出庫（一括更新時）
 *
 * このクラス内部からは、SQLExceptionが発生する可能性があります。
 * </pre>
 *
 * @author $Author: wang-derui $
 * @version $Revision: 1.3 $ $Date: 2008/03/26 07:28:03 $
 */

/**
 * 保管区別入出庫ファイル　データ保持クラス
 * 
 */
public class RcvIssueStruct {
    /** 入出庫管理番号 */
	public String	m_RCV_ISSUE_CTRL_CD = null;
    /** 入出庫区分 */
	public int		m_RCV_ISSUE_TYP = 0;
    /** 品目番号 */
	public String  m_ITEM_CD = null;
    /** 工場コード */
	public String  m_PLANT_CD = null;
    /** 保管区コード */
	public String  m_WH_CD = null;	
    /** 製番 */
	public String  m_JOB_ODR_CD = null;
    /** 製番枝番 */
	public int		m_JOB_ODR_DETAIL_NO = 0;	
    /** 発注番号 */
	public String	m_PUCH_ODR_CD = null;
    /** 受入回数 */
	public int		m_ACPT_NO = 0;
    /** 受入実績訂正回数 */
	public int		m_ACPT_RSLT_CRCT_NO = 0;
    /** 検査実績訂正回数 */
	public int		m_INSPEC_RSLT_CRCT_NO = 0;	
    /** 作業計画番号 */
	public String	m_WORK_ODR_CD = null;	
    /** 仕掛作業コード */
	public String	m_WORK_IN_PROC_CD = null;	
    /** 分作回数 */
	public int		m_PARTIAL_PRD_NO = 0;	
    /** 作業実績訂正回数 */
	public int		m_OPR_RSLT_CRCT_NO = 0;	
    /** 出庫指示番号 */
	public String	m_ISSUE_INST_CD = null;	
    /** 入出庫数 */
	public BigDecimal  m_RCV_ISSUE_QTY = null;	
    /** 入出庫金額 */
	public BigDecimal  m_RCV_ISSUE_AMOUNT = null;	
    /** 入出庫年月日 */
	public Date		m_RCV_ISSUE_DATE = null;	
    /** 入出庫発生区分 */
	public int		m_RCV_ISSUE_GNR_TYP = 0;	
    /** 入出庫端数 */
	public BigDecimal  m_RCV_ISSUE_ODD_QTY = null;	
    /** 入出庫不良理由コード */
	public String  m_DEFECT_CAUSE_CD = null;	
    /** 在庫更新区分 */
	public int  	m_STOCK_UPD_TYP = 0;	
    /** 入出庫完了フラグ */
	public int  	m_RCV_ISSUE_CMPLT_FLG = 0;	
    /** オーダデマンド番号 */
	public String  m_OD_NO = null;	
	/** ロット番号 */
	public String  m_LOT_NO = null;	
    /** メーカロット番号 */
	public String  m_VEND_LOT_NO = null;	
    /** 入出庫備考 */
	public String  m_RCV_ISSUE_COMMENT = null;	
    /** 会社コード */
	public String  m_COMPANY_CD = null;
    /** 取引先コード */
	public String  m_VEND_CD = null;	
    /** 支給区分 */
	public int		m_CONS_TYP = 0;	
    /** 有償支給実績抽出日 */
	public Date		m_CONS_EXEC_DATE = null;	
}
