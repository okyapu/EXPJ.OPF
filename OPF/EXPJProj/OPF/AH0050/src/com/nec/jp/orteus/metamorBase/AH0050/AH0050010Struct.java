/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AH0050/src/com/nec/jp/orteus/metamorBase/AH0050/AH0050010Struct.java,v $
 *
 * Copyright (c) 2003-2005 NEC Corporation.
 * Copyright (c) 2003-2005 NEC Informatec Systems,Ltd.
 *
 * ALL RIGHTS RESERVED  BY   NEC INFORMATEC SYSTEMS, LTD.
 * THIS PROGRAM MUST BE USED SOLELY  FOR  THE PURPOSE FOR
 * WHICH IT WAS FURNISHED BY NEC INFORMATEC SYSTEMS, LTD,
 * NO PART OF THIS PROGRAM MAY BE REPRODUCED OR DISCLOSED
 * TO  OTHERS,  IN ANY FORM  WITHOUT  THE  PRIOR  WRITTEN
 * PERMISSION OF NEC INFORMATEC SYSTEMS, LTD.
 * USE OF COPYRIGHT NOTICE  DOES NOT EVIDENCE PUBLICATION
 * OF THE PROGRAM
 *
 * NEC INFORMATEC SYSTEMS  CONFIDENTIAL  AND  PROPRIETARY
 *
 * テンプレート履歴：
 * EXPJ    (2005/01/19),SRCGEN対応
 * EXPJ    (2004/04/05),メソッドコメントの「* @param なし」をすべて削除
 * EXPJ    (2004/04/01),setStructメソッドの個別メンバのみ版setStructMと、リストメンバのみ版setStructLを追加。
 *                      initializeでのデータセットは、clearを呼んでから行うように修正。
 * EXPJ    (2004/03/31),初期値のコメントアウトのバグを修正。
 * EXPJ    (2004/03/20),レビュー結果を反映。
 * EXPJ    (2004/03/02),EXPLANNER/J用に改造（ソースヘッダ・クラスヘッダ変更）
 *                      初期生成時に初期値をnullで作成。
 *                      初期化メソッドinitialize、データセットメソッドsetStruct追加。
 *                      コンストラクタのユーザ記述部にinitializeメソッド呼出追加。
 *                      initialize()メソッド、setStruct()メソッド追加。
 * 4.1.0.0 (2003/07/16),setL2L_xxxメソッド追加
 * 4.0.0.1 (2003/06/05),javadocコメントエラー修正
 * 4.0.0.0 (2003/04/23),クラス名標準化対応
 * 3.0.0.0 (2003/03/19),Time,Timestamp型対応
 * 2.1.0.0 (2002/12/17),Logging package修正
 * 2.0.0.0 (2002/05/27),new foundation対応
 *
 */

package com.nec.jp.orteus.metamorBase.AH0050;

import com.nec.jp.orteus.xaf.wa.*;

import com.nec.jp.orteus.util.logging.*;

import java.lang.Number.*;
import java.lang.Float;
import java.util.*;
import java.sql.*;
import java.io.*;

//{{user_implement_code_import
import java.math.BigDecimal;
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AH0050010Struct extends DataStruct
{

	//////////////////////////////

	/** 第 1 変数： m_w_INV_status */
	public String m_w_INV_status = null;
	/** 第 2 変数： m_w_ITEM_CD */
	public String m_w_ITEM_CD = null;
	/** 第 3 変数： m_h_JOB_ODR_CD_STOCK_flg */
	public String m_h_JOB_ODR_CD_STOCK_flg = null;
	/** 第 4 変数： m_ERR_MSG */
	public String m_ERR_MSG = null;
	/** 第 5 変数： m_ERR_ADR */
	public String m_ERR_ADR = null;
	/** 第 6 変数： m_c_JOB_ODR_CD_STOCK_flg */
	public String m_c_JOB_ODR_CD_STOCK_flg = null;
	/** 第 7 変数： m_h_change_flg */
	public String m_h_change_flg = null;
	/** 第 8 変数： m_FileName */
	public String m_FileName = null;
	/** 第 9 変数： m_h_lotCtrl */
	public String m_h_lotCtrl = null;
	/** 第 10 変数： m_LOT_NO_form */
	public String m_LOT_NO_form = null;
	/** 第 11 変数： m_h_APR_INV_CTRL */
	public String m_h_APR_INV_CTRL = null;
	/** 第 12 変数： m_MODIFY_COUNT */
	public String m_MODIFY_COUNT = null;
	/** 第 13 変数： m_w_COLUMN_FLG */
	public String m_w_COLUMN_FLG = null;
	/** 第 14 変数： m_INV_DATE */
	public String m_INV_DATE = null;
	/** 第 15 変数： m_REGULAR_INV_FLG */
	public String m_REGULAR_INV_FLG = null;
	/** 第 16 変数： m_CYCLE_INV_FLG */
	public String m_CYCLE_INV_FLG = null;
	/** 第 17 変数： m_TEMP_INV_FLG */
	public String m_TEMP_INV_FLG = null;
	/** 第 18 変数： m_INV_STS_TYP */
	public String m_INV_STS_TYP = null;
	/** 第 19 変数： m_INV_START_DATE */
	public String m_INV_START_DATE = null;
	/** 第 20 変数： m_STOCK_SAVE_DATE */
	public String m_STOCK_SAVE_DATE = null;
	/** 第 21 変数： m_INV_UPDATED_DATE */
	public String m_INV_UPDATED_DATE = null;
	/** 第 22 変数： m_INV_COMMENT */
	public String m_INV_COMMENT = null;
	/** 第 23 変数： m_PLANT_CD */
	public String m_PLANT_CD = null;
	/** 第 24 変数： m_WH_CD */
	public String m_WH_CD = null;
	/** 第 25 変数： m_WH_NAME */
	public String m_WH_NAME = null;
	/** 第 26 変数： m_ITEM_CD */
	public String m_ITEM_CD = null;
	/** 第 27 変数： m_ITEM_NAME */
	public String m_ITEM_NAME = null;
	/** 第 28 変数： m_FINAL_BOOK_STOCK_QTY */
	public String m_FINAL_BOOK_STOCK_QTY = null;
	/** 第 29 変数： m_ACTUAL_STOCK_QTY */
	public String m_ACTUAL_STOCK_QTY = null;
	/** 第 30 変数： m_STOCK_UNIT */
	public String m_STOCK_UNIT = null;
	/** 第 31 変数： m_UNIT_QTY_TYP */
	public String m_UNIT_QTY_TYP = null;
	/** 第 32 変数： m_w_JOB_ODR_CD */
	public String m_w_JOB_ODR_CD = null;
	/** 第 33 変数： m_JOB_ODR_CD */
	public String m_JOB_ODR_CD = null;
	/** 第 34 変数： m_MRP_ODR_TYP */
	public String m_MRP_ODR_TYP = null;
	/** 第 35 変数： m_ABC_TYP */
	public String m_ABC_TYP = null;
	/** 第 36 変数： m_LOT_CTRL_FLG */
	public String m_LOT_CTRL_FLG = null;
	/** 第 37 変数： m_LOT_NUMBERING_TYP */
	public String m_LOT_NUMBERING_TYP = null;
	/** 第 38 変数： m_INV_FLG_JAN */
	public String m_INV_FLG_JAN = null;
	/** 第 39 変数： m_INV_FLG_FEB */
	public String m_INV_FLG_FEB = null;
	/** 第 40 変数： m_INV_FLG_MAR */
	public String m_INV_FLG_MAR = null;
	/** 第 41 変数： m_INV_FLG_APR */
	public String m_INV_FLG_APR = null;
	/** 第 42 変数： m_INV_FLG_MAY */
	public String m_INV_FLG_MAY = null;
	/** 第 43 変数： m_INV_FLG_JUN */
	public String m_INV_FLG_JUN = null;
	/** 第 44 変数： m_INV_FLG_JUL */
	public String m_INV_FLG_JUL = null;
	/** 第 45 変数： m_INV_FLG_AUG */
	public String m_INV_FLG_AUG = null;
	/** 第 46 変数： m_INV_FLG_SEP */
	public String m_INV_FLG_SEP = null;
	/** 第 47 変数： m_INV_FLG_OCT */
	public String m_INV_FLG_OCT = null;
	/** 第 48 変数： m_INV_FLG_NOV */
	public String m_INV_FLG_NOV = null;
	/** 第 49 変数： m_INV_FLG_DEC */
	public String m_INV_FLG_DEC = null;
	/** 第 50 変数： m_PAST_RESULT_ENTRY_TYP */
	public String m_PAST_RESULT_ENTRY_TYP = null;
	/** 第 51 変数： m_PROC_EXEC_DATE */
	public BigDecimal m_PROC_EXEC_DATE = null;
	/** 第 52 変数： m_LOT_NO */
	public String m_LOT_NO = null;
	/** 第 53 変数： m_MODIFY_COUNT_1 */
	public String m_MODIFY_COUNT_1 = null;
	/** 第 54 変数： m_TItemInvACTUALSTOCKQTY */
	public String m_TItemInvACTUALSTOCKQTY = null;
	/** 第 55 変数： m_ACTUAL_STOCK_QTY_1 */
	public String m_ACTUAL_STOCK_QTY_1 = null;
	/** 第 56 変数： m_lotNoitemcd */
	public String m_lotNoitemcd = null;
	/** 第 57 変数： m_lotNoitemname */
	public String m_lotNoitemname = null;
	/** 第 58 変数： m_lotNowhcd */
	public String m_lotNowhcd = null;
	/** 第 59 変数： m_lotNoqty */
	public String m_lotNoqty = null;
	/** 第 60 変数： m_lotNoactual */
	public String m_lotNoactual = null;
	/** 第 61 変数： m_lotNostockunit */
	public String m_lotNostockunit = null;
	/** 第 62 変数： m_lotNounitqty */
	public String m_lotNounitqty = null;
	/** 第 63 変数： m_lotNomodify */
	public String m_lotNomodify = null;
	/** 第 64 変数： m_lotNolotno */
	public String m_lotNolotno = null;
	/** 第 65 変数： m_BEST_BEFORE_DATE */
	public String m_BEST_BEFORE_DATE = null;
	/** 第 66 変数： m_LOT_DEL_FLG */
	public String m_LOT_DEL_FLG = null;
	/** 第 67 変数： m_BUSINESS_OPR_DATE */
	public String m_BUSINESS_OPR_DATE = null;
	/** 第 68 変数： m_ACTUAL_STOCK_QTY_2 */
	public String m_ACTUAL_STOCK_QTY_2 = null;
	/** 第 69 変数： m_h_APRR_FLG */
	public String m_h_APRR_FLG = null;
	/** 第 70 変数： m_l_COUNT */
	public String m_l_COUNT = null;
	/** 第 71 変数： m_ROW_COUNT */
	public String m_ROW_COUNT = null;

	// List型メンバ変数定義

	/** 第 1 List変数： l_w_INV_status */
	public List l_w_INV_status = null;

	/** 第 2 List変数： l_w_ITEM_CD */
	public List l_w_ITEM_CD = null;

	/** 第 3 List変数： l_h_JOB_ODR_CD_STOCK_flg */
	public List l_h_JOB_ODR_CD_STOCK_flg = null;

	/** 第 4 List変数： l_ERR_MSG */
	public List l_ERR_MSG = null;

	/** 第 5 List変数： l_ERR_ADR */
	public List l_ERR_ADR = null;

	/** 第 6 List変数： l_c_JOB_ODR_CD_STOCK_flg */
	public List l_c_JOB_ODR_CD_STOCK_flg = null;

	/** 第 7 List変数： l_h_change_flg */
	public List l_h_change_flg = null;

	/** 第 8 List変数： l_FileName */
	public List l_FileName = null;

	/** 第 9 List変数： l_h_lotCtrl */
	public List l_h_lotCtrl = null;

	/** 第 10 List変数： l_LOT_NO_form */
	public List l_LOT_NO_form = null;

	/** 第 11 List変数： l_h_APR_INV_CTRL */
	public List l_h_APR_INV_CTRL = null;

	/** 第 12 List変数： l_MODIFY_COUNT */
	public List l_MODIFY_COUNT = null;

	/** 第 13 List変数： l_w_COLUMN_FLG */
	public List l_w_COLUMN_FLG = null;

	/** 第 14 List変数： l_INV_DATE */
	public List l_INV_DATE = null;

	/** 第 15 List変数： l_REGULAR_INV_FLG */
	public List l_REGULAR_INV_FLG = null;

	/** 第 16 List変数： l_CYCLE_INV_FLG */
	public List l_CYCLE_INV_FLG = null;

	/** 第 17 List変数： l_TEMP_INV_FLG */
	public List l_TEMP_INV_FLG = null;

	/** 第 18 List変数： l_INV_STS_TYP */
	public List l_INV_STS_TYP = null;

	/** 第 19 List変数： l_INV_START_DATE */
	public List l_INV_START_DATE = null;

	/** 第 20 List変数： l_STOCK_SAVE_DATE */
	public List l_STOCK_SAVE_DATE = null;

	/** 第 21 List変数： l_INV_UPDATED_DATE */
	public List l_INV_UPDATED_DATE = null;

	/** 第 22 List変数： l_INV_COMMENT */
	public List l_INV_COMMENT = null;

	/** 第 23 List変数： l_PLANT_CD */
	public List l_PLANT_CD = null;

	/** 第 24 List変数： l_WH_CD */
	public List l_WH_CD = null;

	/** 第 25 List変数： l_WH_NAME */
	public List l_WH_NAME = null;

	/** 第 26 List変数： l_ITEM_CD */
	public List l_ITEM_CD = null;

	/** 第 27 List変数： l_ITEM_NAME */
	public List l_ITEM_NAME = null;

	/** 第 28 List変数： l_FINAL_BOOK_STOCK_QTY */
	public List l_FINAL_BOOK_STOCK_QTY = null;

	/** 第 29 List変数： l_ACTUAL_STOCK_QTY */
	public List l_ACTUAL_STOCK_QTY = null;

	/** 第 30 List変数： l_STOCK_UNIT */
	public List l_STOCK_UNIT = null;

	/** 第 31 List変数： l_UNIT_QTY_TYP */
	public List l_UNIT_QTY_TYP = null;

	/** 第 32 List変数： l_w_JOB_ODR_CD */
	public List l_w_JOB_ODR_CD = null;

	/** 第 33 List変数： l_JOB_ODR_CD */
	public List l_JOB_ODR_CD = null;

	/** 第 34 List変数： l_MRP_ODR_TYP */
	public List l_MRP_ODR_TYP = null;

	/** 第 35 List変数： l_ABC_TYP */
	public List l_ABC_TYP = null;

	/** 第 36 List変数： l_LOT_CTRL_FLG */
	public List l_LOT_CTRL_FLG = null;

	/** 第 37 List変数： l_LOT_NUMBERING_TYP */
	public List l_LOT_NUMBERING_TYP = null;

	/** 第 38 List変数： l_INV_FLG_JAN */
	public List l_INV_FLG_JAN = null;

	/** 第 39 List変数： l_INV_FLG_FEB */
	public List l_INV_FLG_FEB = null;

	/** 第 40 List変数： l_INV_FLG_MAR */
	public List l_INV_FLG_MAR = null;

	/** 第 41 List変数： l_INV_FLG_APR */
	public List l_INV_FLG_APR = null;

	/** 第 42 List変数： l_INV_FLG_MAY */
	public List l_INV_FLG_MAY = null;

	/** 第 43 List変数： l_INV_FLG_JUN */
	public List l_INV_FLG_JUN = null;

	/** 第 44 List変数： l_INV_FLG_JUL */
	public List l_INV_FLG_JUL = null;

	/** 第 45 List変数： l_INV_FLG_AUG */
	public List l_INV_FLG_AUG = null;

	/** 第 46 List変数： l_INV_FLG_SEP */
	public List l_INV_FLG_SEP = null;

	/** 第 47 List変数： l_INV_FLG_OCT */
	public List l_INV_FLG_OCT = null;

	/** 第 48 List変数： l_INV_FLG_NOV */
	public List l_INV_FLG_NOV = null;

	/** 第 49 List変数： l_INV_FLG_DEC */
	public List l_INV_FLG_DEC = null;

	/** 第 50 List変数： l_PAST_RESULT_ENTRY_TYP */
	public List l_PAST_RESULT_ENTRY_TYP = null;

	/** 第 51 List変数： l_PROC_EXEC_DATE */
	public List l_PROC_EXEC_DATE = null;

	/** 第 52 List変数： l_LOT_NO */
	public List l_LOT_NO = null;

	/** 第 53 List変数： l_MODIFY_COUNT_1 */
	public List l_MODIFY_COUNT_1 = null;

	/** 第 54 List変数： l_TItemInvACTUALSTOCKQTY */
	public List l_TItemInvACTUALSTOCKQTY = null;

	/** 第 55 List変数： l_ACTUAL_STOCK_QTY_1 */
	public List l_ACTUAL_STOCK_QTY_1 = null;

	/** 第 56 List変数： l_lotNoitemcd */
	public List l_lotNoitemcd = null;

	/** 第 57 List変数： l_lotNoitemname */
	public List l_lotNoitemname = null;

	/** 第 58 List変数： l_lotNowhcd */
	public List l_lotNowhcd = null;

	/** 第 59 List変数： l_lotNoqty */
	public List l_lotNoqty = null;

	/** 第 60 List変数： l_lotNoactual */
	public List l_lotNoactual = null;

	/** 第 61 List変数： l_lotNostockunit */
	public List l_lotNostockunit = null;

	/** 第 62 List変数： l_lotNounitqty */
	public List l_lotNounitqty = null;

	/** 第 63 List変数： l_lotNomodify */
	public List l_lotNomodify = null;

	/** 第 64 List変数： l_lotNolotno */
	public List l_lotNolotno = null;

	/** 第 65 List変数： l_BEST_BEFORE_DATE */
	public List l_BEST_BEFORE_DATE = null;

	/** 第 66 List変数： l_LOT_DEL_FLG */
	public List l_LOT_DEL_FLG = null;

	/** 第 67 List変数： l_BUSINESS_OPR_DATE */
	public List l_BUSINESS_OPR_DATE = null;

	/** 第 68 List変数： l_ACTUAL_STOCK_QTY_2 */
	public List l_ACTUAL_STOCK_QTY_2 = null;

	/** 第 69 List変数： l_h_APRR_FLG */
	public List l_h_APRR_FLG = null;

	/** 第 70 List変数： l_l_COUNT */
	public List l_l_COUNT = null;

	/** 第 71 List変数： l_ROW_COUNT */
	public List l_ROW_COUNT = null;


	//////////////////////////////

	// mediator変数用(get|set)メソッド

	public String getw_INV_status() { return m_w_INV_status; }
	public String getw_ITEM_CD() { return m_w_ITEM_CD; }
	public String geth_JOB_ODR_CD_STOCK_flg() { return m_h_JOB_ODR_CD_STOCK_flg; }
	public String getERR_MSG() { return m_ERR_MSG; }
	public String getERR_ADR() { return m_ERR_ADR; }
	public String getc_JOB_ODR_CD_STOCK_flg() { return m_c_JOB_ODR_CD_STOCK_flg; }
	public String geth_change_flg() { return m_h_change_flg; }
	public String getFileName() { return m_FileName; }
	public String geth_lotCtrl() { return m_h_lotCtrl; }
	public String getLOT_NO_form() { return m_LOT_NO_form; }
	public String geth_APR_INV_CTRL() { return m_h_APR_INV_CTRL; }
	public String getMODIFY_COUNT() { return m_MODIFY_COUNT; }
	public String getw_COLUMN_FLG() { return m_w_COLUMN_FLG; }
	public String getINV_DATE() { return m_INV_DATE; }
	public String getREGULAR_INV_FLG() { return m_REGULAR_INV_FLG; }
	public String getCYCLE_INV_FLG() { return m_CYCLE_INV_FLG; }
	public String getTEMP_INV_FLG() { return m_TEMP_INV_FLG; }
	public String getINV_STS_TYP() { return m_INV_STS_TYP; }
	public String getINV_START_DATE() { return m_INV_START_DATE; }
	public String getSTOCK_SAVE_DATE() { return m_STOCK_SAVE_DATE; }
	public String getINV_UPDATED_DATE() { return m_INV_UPDATED_DATE; }
	public String getINV_COMMENT() { return m_INV_COMMENT; }
	public String getPLANT_CD() { return m_PLANT_CD; }
	public String getWH_CD() { return m_WH_CD; }
	public String getWH_NAME() { return m_WH_NAME; }
	public String getITEM_CD() { return m_ITEM_CD; }
	public String getITEM_NAME() { return m_ITEM_NAME; }
	public String getFINAL_BOOK_STOCK_QTY() { return m_FINAL_BOOK_STOCK_QTY; }
	public String getACTUAL_STOCK_QTY() { return m_ACTUAL_STOCK_QTY; }
	public String getSTOCK_UNIT() { return m_STOCK_UNIT; }
	public String getUNIT_QTY_TYP() { return m_UNIT_QTY_TYP; }
	public String getw_JOB_ODR_CD() { return m_w_JOB_ODR_CD; }
	public String getJOB_ODR_CD() { return m_JOB_ODR_CD; }
	public String getMRP_ODR_TYP() { return m_MRP_ODR_TYP; }
	public String getABC_TYP() { return m_ABC_TYP; }
	public String getLOT_CTRL_FLG() { return m_LOT_CTRL_FLG; }
	public String getLOT_NUMBERING_TYP() { return m_LOT_NUMBERING_TYP; }
	public String getINV_FLG_JAN() { return m_INV_FLG_JAN; }
	public String getINV_FLG_FEB() { return m_INV_FLG_FEB; }
	public String getINV_FLG_MAR() { return m_INV_FLG_MAR; }
	public String getINV_FLG_APR() { return m_INV_FLG_APR; }
	public String getINV_FLG_MAY() { return m_INV_FLG_MAY; }
	public String getINV_FLG_JUN() { return m_INV_FLG_JUN; }
	public String getINV_FLG_JUL() { return m_INV_FLG_JUL; }
	public String getINV_FLG_AUG() { return m_INV_FLG_AUG; }
	public String getINV_FLG_SEP() { return m_INV_FLG_SEP; }
	public String getINV_FLG_OCT() { return m_INV_FLG_OCT; }
	public String getINV_FLG_NOV() { return m_INV_FLG_NOV; }
	public String getINV_FLG_DEC() { return m_INV_FLG_DEC; }
	public String getPAST_RESULT_ENTRY_TYP() { return m_PAST_RESULT_ENTRY_TYP; }
	public BigDecimal getPROC_EXEC_DATE() { return m_PROC_EXEC_DATE; }
	public String getLOT_NO() { return m_LOT_NO; }
	public String getMODIFY_COUNT_1() { return m_MODIFY_COUNT_1; }
	public String getTItemInvACTUALSTOCKQTY() { return m_TItemInvACTUALSTOCKQTY; }
	public String getACTUAL_STOCK_QTY_1() { return m_ACTUAL_STOCK_QTY_1; }
	public String getlotNoitemcd() { return m_lotNoitemcd; }
	public String getlotNoitemname() { return m_lotNoitemname; }
	public String getlotNowhcd() { return m_lotNowhcd; }
	public String getlotNoqty() { return m_lotNoqty; }
	public String getlotNoactual() { return m_lotNoactual; }
	public String getlotNostockunit() { return m_lotNostockunit; }
	public String getlotNounitqty() { return m_lotNounitqty; }
	public String getlotNomodify() { return m_lotNomodify; }
	public String getlotNolotno() { return m_lotNolotno; }
	public String getBEST_BEFORE_DATE() { return m_BEST_BEFORE_DATE; }
	public String getLOT_DEL_FLG() { return m_LOT_DEL_FLG; }
	public String getBUSINESS_OPR_DATE() { return m_BUSINESS_OPR_DATE; }
	public String getACTUAL_STOCK_QTY_2() { return m_ACTUAL_STOCK_QTY_2; }
	public String geth_APRR_FLG() { return m_h_APRR_FLG; }
	public String getl_COUNT() { return m_l_COUNT; }
	public String getROW_COUNT() { return m_ROW_COUNT; }

	public List getList_w_INV_status() { return l_w_INV_status; }
	public List getList_w_ITEM_CD() { return l_w_ITEM_CD; }
	public List getList_h_JOB_ODR_CD_STOCK_flg() { return l_h_JOB_ODR_CD_STOCK_flg; }
	public List getList_ERR_MSG() { return l_ERR_MSG; }
	public List getList_ERR_ADR() { return l_ERR_ADR; }
	public List getList_c_JOB_ODR_CD_STOCK_flg() { return l_c_JOB_ODR_CD_STOCK_flg; }
	public List getList_h_change_flg() { return l_h_change_flg; }
	public List getList_FileName() { return l_FileName; }
	public List getList_h_lotCtrl() { return l_h_lotCtrl; }
	public List getList_LOT_NO_form() { return l_LOT_NO_form; }
	public List getList_h_APR_INV_CTRL() { return l_h_APR_INV_CTRL; }
	public List getList_MODIFY_COUNT() { return l_MODIFY_COUNT; }
	public List getList_w_COLUMN_FLG() { return l_w_COLUMN_FLG; }
	public List getList_INV_DATE() { return l_INV_DATE; }
	public List getList_REGULAR_INV_FLG() { return l_REGULAR_INV_FLG; }
	public List getList_CYCLE_INV_FLG() { return l_CYCLE_INV_FLG; }
	public List getList_TEMP_INV_FLG() { return l_TEMP_INV_FLG; }
	public List getList_INV_STS_TYP() { return l_INV_STS_TYP; }
	public List getList_INV_START_DATE() { return l_INV_START_DATE; }
	public List getList_STOCK_SAVE_DATE() { return l_STOCK_SAVE_DATE; }
	public List getList_INV_UPDATED_DATE() { return l_INV_UPDATED_DATE; }
	public List getList_INV_COMMENT() { return l_INV_COMMENT; }
	public List getList_PLANT_CD() { return l_PLANT_CD; }
	public List getList_WH_CD() { return l_WH_CD; }
	public List getList_WH_NAME() { return l_WH_NAME; }
	public List getList_ITEM_CD() { return l_ITEM_CD; }
	public List getList_ITEM_NAME() { return l_ITEM_NAME; }
	public List getList_FINAL_BOOK_STOCK_QTY() { return l_FINAL_BOOK_STOCK_QTY; }
	public List getList_ACTUAL_STOCK_QTY() { return l_ACTUAL_STOCK_QTY; }
	public List getList_STOCK_UNIT() { return l_STOCK_UNIT; }
	public List getList_UNIT_QTY_TYP() { return l_UNIT_QTY_TYP; }
	public List getList_w_JOB_ODR_CD() { return l_w_JOB_ODR_CD; }
	public List getList_JOB_ODR_CD() { return l_JOB_ODR_CD; }
	public List getList_MRP_ODR_TYP() { return l_MRP_ODR_TYP; }
	public List getList_ABC_TYP() { return l_ABC_TYP; }
	public List getList_LOT_CTRL_FLG() { return l_LOT_CTRL_FLG; }
	public List getList_LOT_NUMBERING_TYP() { return l_LOT_NUMBERING_TYP; }
	public List getList_INV_FLG_JAN() { return l_INV_FLG_JAN; }
	public List getList_INV_FLG_FEB() { return l_INV_FLG_FEB; }
	public List getList_INV_FLG_MAR() { return l_INV_FLG_MAR; }
	public List getList_INV_FLG_APR() { return l_INV_FLG_APR; }
	public List getList_INV_FLG_MAY() { return l_INV_FLG_MAY; }
	public List getList_INV_FLG_JUN() { return l_INV_FLG_JUN; }
	public List getList_INV_FLG_JUL() { return l_INV_FLG_JUL; }
	public List getList_INV_FLG_AUG() { return l_INV_FLG_AUG; }
	public List getList_INV_FLG_SEP() { return l_INV_FLG_SEP; }
	public List getList_INV_FLG_OCT() { return l_INV_FLG_OCT; }
	public List getList_INV_FLG_NOV() { return l_INV_FLG_NOV; }
	public List getList_INV_FLG_DEC() { return l_INV_FLG_DEC; }
	public List getList_PAST_RESULT_ENTRY_TYP() { return l_PAST_RESULT_ENTRY_TYP; }
	public List getList_PROC_EXEC_DATE() { return l_PROC_EXEC_DATE; }
	public List getList_LOT_NO() { return l_LOT_NO; }
	public List getList_MODIFY_COUNT_1() { return l_MODIFY_COUNT_1; }
	public List getList_TItemInvACTUALSTOCKQTY() { return l_TItemInvACTUALSTOCKQTY; }
	public List getList_ACTUAL_STOCK_QTY_1() { return l_ACTUAL_STOCK_QTY_1; }
	public List getList_lotNoitemcd() { return l_lotNoitemcd; }
	public List getList_lotNoitemname() { return l_lotNoitemname; }
	public List getList_lotNowhcd() { return l_lotNowhcd; }
	public List getList_lotNoqty() { return l_lotNoqty; }
	public List getList_lotNoactual() { return l_lotNoactual; }
	public List getList_lotNostockunit() { return l_lotNostockunit; }
	public List getList_lotNounitqty() { return l_lotNounitqty; }
	public List getList_lotNomodify() { return l_lotNomodify; }
	public List getList_lotNolotno() { return l_lotNolotno; }
	public List getList_BEST_BEFORE_DATE() { return l_BEST_BEFORE_DATE; }
	public List getList_LOT_DEL_FLG() { return l_LOT_DEL_FLG; }
	public List getList_BUSINESS_OPR_DATE() { return l_BUSINESS_OPR_DATE; }
	public List getList_ACTUAL_STOCK_QTY_2() { return l_ACTUAL_STOCK_QTY_2; }
	public List getList_h_APRR_FLG() { return l_h_APRR_FLG; }
	public List getList_l_COUNT() { return l_l_COUNT; }
	public List getList_ROW_COUNT() { return l_ROW_COUNT; }

	public void setw_INV_status(String val) { m_w_INV_status = val; }
	public void setw_ITEM_CD(String val) { m_w_ITEM_CD = val; }
	public void seth_JOB_ODR_CD_STOCK_flg(String val) { m_h_JOB_ODR_CD_STOCK_flg = val; }
	public void setERR_MSG(String val) { m_ERR_MSG = val; }
	public void setERR_ADR(String val) { m_ERR_ADR = val; }
	public void setc_JOB_ODR_CD_STOCK_flg(String val) { m_c_JOB_ODR_CD_STOCK_flg = val; }
	public void seth_change_flg(String val) { m_h_change_flg = val; }
	public void setFileName(String val) { m_FileName = val; }
	public void seth_lotCtrl(String val) { m_h_lotCtrl = val; }
	public void setLOT_NO_form(String val) { m_LOT_NO_form = val; }
	public void seth_APR_INV_CTRL(String val) { m_h_APR_INV_CTRL = val; }
	public void setMODIFY_COUNT(String val) { m_MODIFY_COUNT = val; }
	public void setw_COLUMN_FLG(String val) { m_w_COLUMN_FLG = val; }
	public void setINV_DATE(String val) { m_INV_DATE = val; }
	public void setREGULAR_INV_FLG(String val) { m_REGULAR_INV_FLG = val; }
	public void setCYCLE_INV_FLG(String val) { m_CYCLE_INV_FLG = val; }
	public void setTEMP_INV_FLG(String val) { m_TEMP_INV_FLG = val; }
	public void setINV_STS_TYP(String val) { m_INV_STS_TYP = val; }
	public void setINV_START_DATE(String val) { m_INV_START_DATE = val; }
	public void setSTOCK_SAVE_DATE(String val) { m_STOCK_SAVE_DATE = val; }
	public void setINV_UPDATED_DATE(String val) { m_INV_UPDATED_DATE = val; }
	public void setINV_COMMENT(String val) { m_INV_COMMENT = val; }
	public void setPLANT_CD(String val) { m_PLANT_CD = val; }
	public void setWH_CD(String val) { m_WH_CD = val; }
	public void setWH_NAME(String val) { m_WH_NAME = val; }
	public void setITEM_CD(String val) { m_ITEM_CD = val; }
	public void setITEM_NAME(String val) { m_ITEM_NAME = val; }
	public void setFINAL_BOOK_STOCK_QTY(String val) { m_FINAL_BOOK_STOCK_QTY = val; }
	public void setACTUAL_STOCK_QTY(String val) { m_ACTUAL_STOCK_QTY = val; }
	public void setSTOCK_UNIT(String val) { m_STOCK_UNIT = val; }
	public void setUNIT_QTY_TYP(String val) { m_UNIT_QTY_TYP = val; }
	public void setw_JOB_ODR_CD(String val) { m_w_JOB_ODR_CD = val; }
	public void setJOB_ODR_CD(String val) { m_JOB_ODR_CD = val; }
	public void setMRP_ODR_TYP(String val) { m_MRP_ODR_TYP = val; }
	public void setABC_TYP(String val) { m_ABC_TYP = val; }
	public void setLOT_CTRL_FLG(String val) { m_LOT_CTRL_FLG = val; }
	public void setLOT_NUMBERING_TYP(String val) { m_LOT_NUMBERING_TYP = val; }
	public void setINV_FLG_JAN(String val) { m_INV_FLG_JAN = val; }
	public void setINV_FLG_FEB(String val) { m_INV_FLG_FEB = val; }
	public void setINV_FLG_MAR(String val) { m_INV_FLG_MAR = val; }
	public void setINV_FLG_APR(String val) { m_INV_FLG_APR = val; }
	public void setINV_FLG_MAY(String val) { m_INV_FLG_MAY = val; }
	public void setINV_FLG_JUN(String val) { m_INV_FLG_JUN = val; }
	public void setINV_FLG_JUL(String val) { m_INV_FLG_JUL = val; }
	public void setINV_FLG_AUG(String val) { m_INV_FLG_AUG = val; }
	public void setINV_FLG_SEP(String val) { m_INV_FLG_SEP = val; }
	public void setINV_FLG_OCT(String val) { m_INV_FLG_OCT = val; }
	public void setINV_FLG_NOV(String val) { m_INV_FLG_NOV = val; }
	public void setINV_FLG_DEC(String val) { m_INV_FLG_DEC = val; }
	public void setPAST_RESULT_ENTRY_TYP(String val) { m_PAST_RESULT_ENTRY_TYP = val; }
	public void setPROC_EXEC_DATE(BigDecimal val) { m_PROC_EXEC_DATE = val; }
	public void setLOT_NO(String val) { m_LOT_NO = val; }
	public void setMODIFY_COUNT_1(String val) { m_MODIFY_COUNT_1 = val; }
	public void setTItemInvACTUALSTOCKQTY(String val) { m_TItemInvACTUALSTOCKQTY = val; }
	public void setACTUAL_STOCK_QTY_1(String val) { m_ACTUAL_STOCK_QTY_1 = val; }
	public void setlotNoitemcd(String val) { m_lotNoitemcd = val; }
	public void setlotNoitemname(String val) { m_lotNoitemname = val; }
	public void setlotNowhcd(String val) { m_lotNowhcd = val; }
	public void setlotNoqty(String val) { m_lotNoqty = val; }
	public void setlotNoactual(String val) { m_lotNoactual = val; }
	public void setlotNostockunit(String val) { m_lotNostockunit = val; }
	public void setlotNounitqty(String val) { m_lotNounitqty = val; }
	public void setlotNomodify(String val) { m_lotNomodify = val; }
	public void setlotNolotno(String val) { m_lotNolotno = val; }
	public void setBEST_BEFORE_DATE(String val) { m_BEST_BEFORE_DATE = val; }
	public void setLOT_DEL_FLG(String val) { m_LOT_DEL_FLG = val; }
	public void setBUSINESS_OPR_DATE(String val) { m_BUSINESS_OPR_DATE = val; }
	public void setACTUAL_STOCK_QTY_2(String val) { m_ACTUAL_STOCK_QTY_2 = val; }
	public void seth_APRR_FLG(String val) { m_h_APRR_FLG = val; }
	public void setl_COUNT(String val) { m_l_COUNT = val; }
	public void setROW_COUNT(String val) { m_ROW_COUNT = val; }


	public void setList_w_INV_status(List list) { l_w_INV_status = list; }
	public void setList_w_ITEM_CD(List list) { l_w_ITEM_CD = list; }
	public void setList_h_JOB_ODR_CD_STOCK_flg(List list) { l_h_JOB_ODR_CD_STOCK_flg = list; }
	public void setList_ERR_MSG(List list) { l_ERR_MSG = list; }
	public void setList_ERR_ADR(List list) { l_ERR_ADR = list; }
	public void setList_c_JOB_ODR_CD_STOCK_flg(List list) { l_c_JOB_ODR_CD_STOCK_flg = list; }
	public void setList_h_change_flg(List list) { l_h_change_flg = list; }
	public void setList_FileName(List list) { l_FileName = list; }
	public void setList_h_lotCtrl(List list) { l_h_lotCtrl = list; }
	public void setList_LOT_NO_form(List list) { l_LOT_NO_form = list; }
	public void setList_h_APR_INV_CTRL(List list) { l_h_APR_INV_CTRL = list; }
	public void setList_MODIFY_COUNT(List list) { l_MODIFY_COUNT = list; }
	public void setList_w_COLUMN_FLG(List list) { l_w_COLUMN_FLG = list; }
	public void setList_INV_DATE(List list) { l_INV_DATE = list; }
	public void setList_REGULAR_INV_FLG(List list) { l_REGULAR_INV_FLG = list; }
	public void setList_CYCLE_INV_FLG(List list) { l_CYCLE_INV_FLG = list; }
	public void setList_TEMP_INV_FLG(List list) { l_TEMP_INV_FLG = list; }
	public void setList_INV_STS_TYP(List list) { l_INV_STS_TYP = list; }
	public void setList_INV_START_DATE(List list) { l_INV_START_DATE = list; }
	public void setList_STOCK_SAVE_DATE(List list) { l_STOCK_SAVE_DATE = list; }
	public void setList_INV_UPDATED_DATE(List list) { l_INV_UPDATED_DATE = list; }
	public void setList_INV_COMMENT(List list) { l_INV_COMMENT = list; }
	public void setList_PLANT_CD(List list) { l_PLANT_CD = list; }
	public void setList_WH_CD(List list) { l_WH_CD = list; }
	public void setList_WH_NAME(List list) { l_WH_NAME = list; }
	public void setList_ITEM_CD(List list) { l_ITEM_CD = list; }
	public void setList_ITEM_NAME(List list) { l_ITEM_NAME = list; }
	public void setList_FINAL_BOOK_STOCK_QTY(List list) { l_FINAL_BOOK_STOCK_QTY = list; }
	public void setList_ACTUAL_STOCK_QTY(List list) { l_ACTUAL_STOCK_QTY = list; }
	public void setList_STOCK_UNIT(List list) { l_STOCK_UNIT = list; }
	public void setList_UNIT_QTY_TYP(List list) { l_UNIT_QTY_TYP = list; }
	public void setList_w_JOB_ODR_CD(List list) { l_w_JOB_ODR_CD = list; }
	public void setList_JOB_ODR_CD(List list) { l_JOB_ODR_CD = list; }
	public void setList_MRP_ODR_TYP(List list) { l_MRP_ODR_TYP = list; }
	public void setList_ABC_TYP(List list) { l_ABC_TYP = list; }
	public void setList_LOT_CTRL_FLG(List list) { l_LOT_CTRL_FLG = list; }
	public void setList_LOT_NUMBERING_TYP(List list) { l_LOT_NUMBERING_TYP = list; }
	public void setList_INV_FLG_JAN(List list) { l_INV_FLG_JAN = list; }
	public void setList_INV_FLG_FEB(List list) { l_INV_FLG_FEB = list; }
	public void setList_INV_FLG_MAR(List list) { l_INV_FLG_MAR = list; }
	public void setList_INV_FLG_APR(List list) { l_INV_FLG_APR = list; }
	public void setList_INV_FLG_MAY(List list) { l_INV_FLG_MAY = list; }
	public void setList_INV_FLG_JUN(List list) { l_INV_FLG_JUN = list; }
	public void setList_INV_FLG_JUL(List list) { l_INV_FLG_JUL = list; }
	public void setList_INV_FLG_AUG(List list) { l_INV_FLG_AUG = list; }
	public void setList_INV_FLG_SEP(List list) { l_INV_FLG_SEP = list; }
	public void setList_INV_FLG_OCT(List list) { l_INV_FLG_OCT = list; }
	public void setList_INV_FLG_NOV(List list) { l_INV_FLG_NOV = list; }
	public void setList_INV_FLG_DEC(List list) { l_INV_FLG_DEC = list; }
	public void setList_PAST_RESULT_ENTRY_TYP(List list) { l_PAST_RESULT_ENTRY_TYP = list; }
	public void setList_PROC_EXEC_DATE(List list) { l_PROC_EXEC_DATE = list; }
	public void setList_LOT_NO(List list) { l_LOT_NO = list; }
	public void setList_MODIFY_COUNT_1(List list) { l_MODIFY_COUNT_1 = list; }
	public void setList_TItemInvACTUALSTOCKQTY(List list) { l_TItemInvACTUALSTOCKQTY = list; }
	public void setList_ACTUAL_STOCK_QTY_1(List list) { l_ACTUAL_STOCK_QTY_1 = list; }
	public void setList_lotNoitemcd(List list) { l_lotNoitemcd = list; }
	public void setList_lotNoitemname(List list) { l_lotNoitemname = list; }
	public void setList_lotNowhcd(List list) { l_lotNowhcd = list; }
	public void setList_lotNoqty(List list) { l_lotNoqty = list; }
	public void setList_lotNoactual(List list) { l_lotNoactual = list; }
	public void setList_lotNostockunit(List list) { l_lotNostockunit = list; }
	public void setList_lotNounitqty(List list) { l_lotNounitqty = list; }
	public void setList_lotNomodify(List list) { l_lotNomodify = list; }
	public void setList_lotNolotno(List list) { l_lotNolotno = list; }
	public void setList_BEST_BEFORE_DATE(List list) { l_BEST_BEFORE_DATE = list; }
	public void setList_LOT_DEL_FLG(List list) { l_LOT_DEL_FLG = list; }
	public void setList_BUSINESS_OPR_DATE(List list) { l_BUSINESS_OPR_DATE = list; }
	public void setList_ACTUAL_STOCK_QTY_2(List list) { l_ACTUAL_STOCK_QTY_2 = list; }
	public void setList_h_APRR_FLG(List list) { l_h_APRR_FLG = list; }
	public void setList_l_COUNT(List list) { l_l_COUNT = list; }
	public void setList_ROW_COUNT(List list) { l_ROW_COUNT = list; }

	public int setL2L_w_INV_status(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_INV_status == null) {
			l_w_INV_status = new ArrayList();
		} else {
			l_w_INV_status.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_INV_status.add(((AH0050010Struct) list.get(i)).getw_INV_status());
		}
		return size;
	}
	public int setL2L_w_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_ITEM_CD == null) {
			l_w_ITEM_CD = new ArrayList();
		} else {
			l_w_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_ITEM_CD.add(((AH0050010Struct) list.get(i)).getw_ITEM_CD());
		}
		return size;
	}
	public int setL2L_h_JOB_ODR_CD_STOCK_flg(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_JOB_ODR_CD_STOCK_flg == null) {
			l_h_JOB_ODR_CD_STOCK_flg = new ArrayList();
		} else {
			l_h_JOB_ODR_CD_STOCK_flg.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_JOB_ODR_CD_STOCK_flg.add(((AH0050010Struct) list.get(i)).geth_JOB_ODR_CD_STOCK_flg());
		}
		return size;
	}
	public int setL2L_ERR_MSG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ERR_MSG == null) {
			l_ERR_MSG = new ArrayList();
		} else {
			l_ERR_MSG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ERR_MSG.add(((AH0050010Struct) list.get(i)).getERR_MSG());
		}
		return size;
	}
	public int setL2L_ERR_ADR(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ERR_ADR == null) {
			l_ERR_ADR = new ArrayList();
		} else {
			l_ERR_ADR.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ERR_ADR.add(((AH0050010Struct) list.get(i)).getERR_ADR());
		}
		return size;
	}
	public int setL2L_c_JOB_ODR_CD_STOCK_flg(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c_JOB_ODR_CD_STOCK_flg == null) {
			l_c_JOB_ODR_CD_STOCK_flg = new ArrayList();
		} else {
			l_c_JOB_ODR_CD_STOCK_flg.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c_JOB_ODR_CD_STOCK_flg.add(((AH0050010Struct) list.get(i)).getc_JOB_ODR_CD_STOCK_flg());
		}
		return size;
	}
	public int setL2L_h_change_flg(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_change_flg == null) {
			l_h_change_flg = new ArrayList();
		} else {
			l_h_change_flg.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_change_flg.add(((AH0050010Struct) list.get(i)).geth_change_flg());
		}
		return size;
	}
	public int setL2L_FileName(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FileName == null) {
			l_FileName = new ArrayList();
		} else {
			l_FileName.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FileName.add(((AH0050010Struct) list.get(i)).getFileName());
		}
		return size;
	}
	public int setL2L_h_lotCtrl(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_lotCtrl == null) {
			l_h_lotCtrl = new ArrayList();
		} else {
			l_h_lotCtrl.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_lotCtrl.add(((AH0050010Struct) list.get(i)).geth_lotCtrl());
		}
		return size;
	}
	public int setL2L_LOT_NO_form(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOT_NO_form == null) {
			l_LOT_NO_form = new ArrayList();
		} else {
			l_LOT_NO_form.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOT_NO_form.add(((AH0050010Struct) list.get(i)).getLOT_NO_form());
		}
		return size;
	}
	public int setL2L_h_APR_INV_CTRL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_APR_INV_CTRL == null) {
			l_h_APR_INV_CTRL = new ArrayList();
		} else {
			l_h_APR_INV_CTRL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_APR_INV_CTRL.add(((AH0050010Struct) list.get(i)).geth_APR_INV_CTRL());
		}
		return size;
	}
	public int setL2L_MODIFY_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MODIFY_COUNT == null) {
			l_MODIFY_COUNT = new ArrayList();
		} else {
			l_MODIFY_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MODIFY_COUNT.add(((AH0050010Struct) list.get(i)).getMODIFY_COUNT());
		}
		return size;
	}
	public int setL2L_w_COLUMN_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_COLUMN_FLG == null) {
			l_w_COLUMN_FLG = new ArrayList();
		} else {
			l_w_COLUMN_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_COLUMN_FLG.add(((AH0050010Struct) list.get(i)).getw_COLUMN_FLG());
		}
		return size;
	}
	public int setL2L_INV_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INV_DATE == null) {
			l_INV_DATE = new ArrayList();
		} else {
			l_INV_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INV_DATE.add(((AH0050010Struct) list.get(i)).getINV_DATE());
		}
		return size;
	}
	public int setL2L_REGULAR_INV_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_REGULAR_INV_FLG == null) {
			l_REGULAR_INV_FLG = new ArrayList();
		} else {
			l_REGULAR_INV_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_REGULAR_INV_FLG.add(((AH0050010Struct) list.get(i)).getREGULAR_INV_FLG());
		}
		return size;
	}
	public int setL2L_CYCLE_INV_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CYCLE_INV_FLG == null) {
			l_CYCLE_INV_FLG = new ArrayList();
		} else {
			l_CYCLE_INV_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CYCLE_INV_FLG.add(((AH0050010Struct) list.get(i)).getCYCLE_INV_FLG());
		}
		return size;
	}
	public int setL2L_TEMP_INV_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TEMP_INV_FLG == null) {
			l_TEMP_INV_FLG = new ArrayList();
		} else {
			l_TEMP_INV_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TEMP_INV_FLG.add(((AH0050010Struct) list.get(i)).getTEMP_INV_FLG());
		}
		return size;
	}
	public int setL2L_INV_STS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INV_STS_TYP == null) {
			l_INV_STS_TYP = new ArrayList();
		} else {
			l_INV_STS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INV_STS_TYP.add(((AH0050010Struct) list.get(i)).getINV_STS_TYP());
		}
		return size;
	}
	public int setL2L_INV_START_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INV_START_DATE == null) {
			l_INV_START_DATE = new ArrayList();
		} else {
			l_INV_START_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INV_START_DATE.add(((AH0050010Struct) list.get(i)).getINV_START_DATE());
		}
		return size;
	}
	public int setL2L_STOCK_SAVE_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_STOCK_SAVE_DATE == null) {
			l_STOCK_SAVE_DATE = new ArrayList();
		} else {
			l_STOCK_SAVE_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_STOCK_SAVE_DATE.add(((AH0050010Struct) list.get(i)).getSTOCK_SAVE_DATE());
		}
		return size;
	}
	public int setL2L_INV_UPDATED_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INV_UPDATED_DATE == null) {
			l_INV_UPDATED_DATE = new ArrayList();
		} else {
			l_INV_UPDATED_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INV_UPDATED_DATE.add(((AH0050010Struct) list.get(i)).getINV_UPDATED_DATE());
		}
		return size;
	}
	public int setL2L_INV_COMMENT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INV_COMMENT == null) {
			l_INV_COMMENT = new ArrayList();
		} else {
			l_INV_COMMENT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INV_COMMENT.add(((AH0050010Struct) list.get(i)).getINV_COMMENT());
		}
		return size;
	}
	public int setL2L_PLANT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PLANT_CD == null) {
			l_PLANT_CD = new ArrayList();
		} else {
			l_PLANT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PLANT_CD.add(((AH0050010Struct) list.get(i)).getPLANT_CD());
		}
		return size;
	}
	public int setL2L_WH_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_WH_CD == null) {
			l_WH_CD = new ArrayList();
		} else {
			l_WH_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_WH_CD.add(((AH0050010Struct) list.get(i)).getWH_CD());
		}
		return size;
	}
	public int setL2L_WH_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_WH_NAME == null) {
			l_WH_NAME = new ArrayList();
		} else {
			l_WH_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_WH_NAME.add(((AH0050010Struct) list.get(i)).getWH_NAME());
		}
		return size;
	}
	public int setL2L_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ITEM_CD == null) {
			l_ITEM_CD = new ArrayList();
		} else {
			l_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ITEM_CD.add(((AH0050010Struct) list.get(i)).getITEM_CD());
		}
		return size;
	}
	public int setL2L_ITEM_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ITEM_NAME == null) {
			l_ITEM_NAME = new ArrayList();
		} else {
			l_ITEM_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ITEM_NAME.add(((AH0050010Struct) list.get(i)).getITEM_NAME());
		}
		return size;
	}
	public int setL2L_FINAL_BOOK_STOCK_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FINAL_BOOK_STOCK_QTY == null) {
			l_FINAL_BOOK_STOCK_QTY = new ArrayList();
		} else {
			l_FINAL_BOOK_STOCK_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FINAL_BOOK_STOCK_QTY.add(((AH0050010Struct) list.get(i)).getFINAL_BOOK_STOCK_QTY());
		}
		return size;
	}
	public int setL2L_ACTUAL_STOCK_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ACTUAL_STOCK_QTY == null) {
			l_ACTUAL_STOCK_QTY = new ArrayList();
		} else {
			l_ACTUAL_STOCK_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ACTUAL_STOCK_QTY.add(((AH0050010Struct) list.get(i)).getACTUAL_STOCK_QTY());
		}
		return size;
	}
	public int setL2L_STOCK_UNIT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_STOCK_UNIT == null) {
			l_STOCK_UNIT = new ArrayList();
		} else {
			l_STOCK_UNIT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_STOCK_UNIT.add(((AH0050010Struct) list.get(i)).getSTOCK_UNIT());
		}
		return size;
	}
	public int setL2L_UNIT_QTY_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UNIT_QTY_TYP == null) {
			l_UNIT_QTY_TYP = new ArrayList();
		} else {
			l_UNIT_QTY_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UNIT_QTY_TYP.add(((AH0050010Struct) list.get(i)).getUNIT_QTY_TYP());
		}
		return size;
	}
	public int setL2L_w_JOB_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_JOB_ODR_CD == null) {
			l_w_JOB_ODR_CD = new ArrayList();
		} else {
			l_w_JOB_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_JOB_ODR_CD.add(((AH0050010Struct) list.get(i)).getw_JOB_ODR_CD());
		}
		return size;
	}
	public int setL2L_JOB_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_JOB_ODR_CD == null) {
			l_JOB_ODR_CD = new ArrayList();
		} else {
			l_JOB_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_JOB_ODR_CD.add(((AH0050010Struct) list.get(i)).getJOB_ODR_CD());
		}
		return size;
	}
	public int setL2L_MRP_ODR_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MRP_ODR_TYP == null) {
			l_MRP_ODR_TYP = new ArrayList();
		} else {
			l_MRP_ODR_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MRP_ODR_TYP.add(((AH0050010Struct) list.get(i)).getMRP_ODR_TYP());
		}
		return size;
	}
	public int setL2L_ABC_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ABC_TYP == null) {
			l_ABC_TYP = new ArrayList();
		} else {
			l_ABC_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ABC_TYP.add(((AH0050010Struct) list.get(i)).getABC_TYP());
		}
		return size;
	}
	public int setL2L_LOT_CTRL_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOT_CTRL_FLG == null) {
			l_LOT_CTRL_FLG = new ArrayList();
		} else {
			l_LOT_CTRL_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOT_CTRL_FLG.add(((AH0050010Struct) list.get(i)).getLOT_CTRL_FLG());
		}
		return size;
	}
	public int setL2L_LOT_NUMBERING_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOT_NUMBERING_TYP == null) {
			l_LOT_NUMBERING_TYP = new ArrayList();
		} else {
			l_LOT_NUMBERING_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOT_NUMBERING_TYP.add(((AH0050010Struct) list.get(i)).getLOT_NUMBERING_TYP());
		}
		return size;
	}
	public int setL2L_INV_FLG_JAN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INV_FLG_JAN == null) {
			l_INV_FLG_JAN = new ArrayList();
		} else {
			l_INV_FLG_JAN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INV_FLG_JAN.add(((AH0050010Struct) list.get(i)).getINV_FLG_JAN());
		}
		return size;
	}
	public int setL2L_INV_FLG_FEB(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INV_FLG_FEB == null) {
			l_INV_FLG_FEB = new ArrayList();
		} else {
			l_INV_FLG_FEB.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INV_FLG_FEB.add(((AH0050010Struct) list.get(i)).getINV_FLG_FEB());
		}
		return size;
	}
	public int setL2L_INV_FLG_MAR(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INV_FLG_MAR == null) {
			l_INV_FLG_MAR = new ArrayList();
		} else {
			l_INV_FLG_MAR.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INV_FLG_MAR.add(((AH0050010Struct) list.get(i)).getINV_FLG_MAR());
		}
		return size;
	}
	public int setL2L_INV_FLG_APR(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INV_FLG_APR == null) {
			l_INV_FLG_APR = new ArrayList();
		} else {
			l_INV_FLG_APR.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INV_FLG_APR.add(((AH0050010Struct) list.get(i)).getINV_FLG_APR());
		}
		return size;
	}
	public int setL2L_INV_FLG_MAY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INV_FLG_MAY == null) {
			l_INV_FLG_MAY = new ArrayList();
		} else {
			l_INV_FLG_MAY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INV_FLG_MAY.add(((AH0050010Struct) list.get(i)).getINV_FLG_MAY());
		}
		return size;
	}
	public int setL2L_INV_FLG_JUN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INV_FLG_JUN == null) {
			l_INV_FLG_JUN = new ArrayList();
		} else {
			l_INV_FLG_JUN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INV_FLG_JUN.add(((AH0050010Struct) list.get(i)).getINV_FLG_JUN());
		}
		return size;
	}
	public int setL2L_INV_FLG_JUL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INV_FLG_JUL == null) {
			l_INV_FLG_JUL = new ArrayList();
		} else {
			l_INV_FLG_JUL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INV_FLG_JUL.add(((AH0050010Struct) list.get(i)).getINV_FLG_JUL());
		}
		return size;
	}
	public int setL2L_INV_FLG_AUG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INV_FLG_AUG == null) {
			l_INV_FLG_AUG = new ArrayList();
		} else {
			l_INV_FLG_AUG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INV_FLG_AUG.add(((AH0050010Struct) list.get(i)).getINV_FLG_AUG());
		}
		return size;
	}
	public int setL2L_INV_FLG_SEP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INV_FLG_SEP == null) {
			l_INV_FLG_SEP = new ArrayList();
		} else {
			l_INV_FLG_SEP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INV_FLG_SEP.add(((AH0050010Struct) list.get(i)).getINV_FLG_SEP());
		}
		return size;
	}
	public int setL2L_INV_FLG_OCT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INV_FLG_OCT == null) {
			l_INV_FLG_OCT = new ArrayList();
		} else {
			l_INV_FLG_OCT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INV_FLG_OCT.add(((AH0050010Struct) list.get(i)).getINV_FLG_OCT());
		}
		return size;
	}
	public int setL2L_INV_FLG_NOV(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INV_FLG_NOV == null) {
			l_INV_FLG_NOV = new ArrayList();
		} else {
			l_INV_FLG_NOV.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INV_FLG_NOV.add(((AH0050010Struct) list.get(i)).getINV_FLG_NOV());
		}
		return size;
	}
	public int setL2L_INV_FLG_DEC(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INV_FLG_DEC == null) {
			l_INV_FLG_DEC = new ArrayList();
		} else {
			l_INV_FLG_DEC.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INV_FLG_DEC.add(((AH0050010Struct) list.get(i)).getINV_FLG_DEC());
		}
		return size;
	}
	public int setL2L_PAST_RESULT_ENTRY_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PAST_RESULT_ENTRY_TYP == null) {
			l_PAST_RESULT_ENTRY_TYP = new ArrayList();
		} else {
			l_PAST_RESULT_ENTRY_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PAST_RESULT_ENTRY_TYP.add(((AH0050010Struct) list.get(i)).getPAST_RESULT_ENTRY_TYP());
		}
		return size;
	}
	public int setL2L_PROC_EXEC_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_EXEC_DATE == null) {
			l_PROC_EXEC_DATE = new ArrayList();
		} else {
			l_PROC_EXEC_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_EXEC_DATE.add(((AH0050010Struct) list.get(i)).getPROC_EXEC_DATE());
		}
		return size;
	}
	public int setL2L_LOT_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOT_NO == null) {
			l_LOT_NO = new ArrayList();
		} else {
			l_LOT_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOT_NO.add(((AH0050010Struct) list.get(i)).getLOT_NO());
		}
		return size;
	}
	public int setL2L_MODIFY_COUNT_1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MODIFY_COUNT_1 == null) {
			l_MODIFY_COUNT_1 = new ArrayList();
		} else {
			l_MODIFY_COUNT_1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MODIFY_COUNT_1.add(((AH0050010Struct) list.get(i)).getMODIFY_COUNT_1());
		}
		return size;
	}
	public int setL2L_TItemInvACTUALSTOCKQTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TItemInvACTUALSTOCKQTY == null) {
			l_TItemInvACTUALSTOCKQTY = new ArrayList();
		} else {
			l_TItemInvACTUALSTOCKQTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TItemInvACTUALSTOCKQTY.add(((AH0050010Struct) list.get(i)).getTItemInvACTUALSTOCKQTY());
		}
		return size;
	}
	public int setL2L_ACTUAL_STOCK_QTY_1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ACTUAL_STOCK_QTY_1 == null) {
			l_ACTUAL_STOCK_QTY_1 = new ArrayList();
		} else {
			l_ACTUAL_STOCK_QTY_1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ACTUAL_STOCK_QTY_1.add(((AH0050010Struct) list.get(i)).getACTUAL_STOCK_QTY_1());
		}
		return size;
	}
	public int setL2L_lotNoitemcd(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_lotNoitemcd == null) {
			l_lotNoitemcd = new ArrayList();
		} else {
			l_lotNoitemcd.clear();
		}
		for (int i = 0; i < size; i++) {
			l_lotNoitemcd.add(((AH0050010Struct) list.get(i)).getlotNoitemcd());
		}
		return size;
	}
	public int setL2L_lotNoitemname(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_lotNoitemname == null) {
			l_lotNoitemname = new ArrayList();
		} else {
			l_lotNoitemname.clear();
		}
		for (int i = 0; i < size; i++) {
			l_lotNoitemname.add(((AH0050010Struct) list.get(i)).getlotNoitemname());
		}
		return size;
	}
	public int setL2L_lotNowhcd(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_lotNowhcd == null) {
			l_lotNowhcd = new ArrayList();
		} else {
			l_lotNowhcd.clear();
		}
		for (int i = 0; i < size; i++) {
			l_lotNowhcd.add(((AH0050010Struct) list.get(i)).getlotNowhcd());
		}
		return size;
	}
	public int setL2L_lotNoqty(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_lotNoqty == null) {
			l_lotNoqty = new ArrayList();
		} else {
			l_lotNoqty.clear();
		}
		for (int i = 0; i < size; i++) {
			l_lotNoqty.add(((AH0050010Struct) list.get(i)).getlotNoqty());
		}
		return size;
	}
	public int setL2L_lotNoactual(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_lotNoactual == null) {
			l_lotNoactual = new ArrayList();
		} else {
			l_lotNoactual.clear();
		}
		for (int i = 0; i < size; i++) {
			l_lotNoactual.add(((AH0050010Struct) list.get(i)).getlotNoactual());
		}
		return size;
	}
	public int setL2L_lotNostockunit(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_lotNostockunit == null) {
			l_lotNostockunit = new ArrayList();
		} else {
			l_lotNostockunit.clear();
		}
		for (int i = 0; i < size; i++) {
			l_lotNostockunit.add(((AH0050010Struct) list.get(i)).getlotNostockunit());
		}
		return size;
	}
	public int setL2L_lotNounitqty(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_lotNounitqty == null) {
			l_lotNounitqty = new ArrayList();
		} else {
			l_lotNounitqty.clear();
		}
		for (int i = 0; i < size; i++) {
			l_lotNounitqty.add(((AH0050010Struct) list.get(i)).getlotNounitqty());
		}
		return size;
	}
	public int setL2L_lotNomodify(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_lotNomodify == null) {
			l_lotNomodify = new ArrayList();
		} else {
			l_lotNomodify.clear();
		}
		for (int i = 0; i < size; i++) {
			l_lotNomodify.add(((AH0050010Struct) list.get(i)).getlotNomodify());
		}
		return size;
	}
	public int setL2L_lotNolotno(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_lotNolotno == null) {
			l_lotNolotno = new ArrayList();
		} else {
			l_lotNolotno.clear();
		}
		for (int i = 0; i < size; i++) {
			l_lotNolotno.add(((AH0050010Struct) list.get(i)).getlotNolotno());
		}
		return size;
	}
	public int setL2L_BEST_BEFORE_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_BEST_BEFORE_DATE == null) {
			l_BEST_BEFORE_DATE = new ArrayList();
		} else {
			l_BEST_BEFORE_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_BEST_BEFORE_DATE.add(((AH0050010Struct) list.get(i)).getBEST_BEFORE_DATE());
		}
		return size;
	}
	public int setL2L_LOT_DEL_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOT_DEL_FLG == null) {
			l_LOT_DEL_FLG = new ArrayList();
		} else {
			l_LOT_DEL_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOT_DEL_FLG.add(((AH0050010Struct) list.get(i)).getLOT_DEL_FLG());
		}
		return size;
	}
	public int setL2L_BUSINESS_OPR_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_BUSINESS_OPR_DATE == null) {
			l_BUSINESS_OPR_DATE = new ArrayList();
		} else {
			l_BUSINESS_OPR_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_BUSINESS_OPR_DATE.add(((AH0050010Struct) list.get(i)).getBUSINESS_OPR_DATE());
		}
		return size;
	}
	public int setL2L_ACTUAL_STOCK_QTY_2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ACTUAL_STOCK_QTY_2 == null) {
			l_ACTUAL_STOCK_QTY_2 = new ArrayList();
		} else {
			l_ACTUAL_STOCK_QTY_2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ACTUAL_STOCK_QTY_2.add(((AH0050010Struct) list.get(i)).getACTUAL_STOCK_QTY_2());
		}
		return size;
	}
	public int setL2L_h_APRR_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_APRR_FLG == null) {
			l_h_APRR_FLG = new ArrayList();
		} else {
			l_h_APRR_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_APRR_FLG.add(((AH0050010Struct) list.get(i)).geth_APRR_FLG());
		}
		return size;
	}
	public int setL2L_l_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_COUNT == null) {
			l_l_COUNT = new ArrayList();
		} else {
			l_l_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_COUNT.add(((AH0050010Struct) list.get(i)).getl_COUNT());
		}
		return size;
	}
	public int setL2L_ROW_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ROW_COUNT == null) {
			l_ROW_COUNT = new ArrayList();
		} else {
			l_ROW_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ROW_COUNT.add(((AH0050010Struct) list.get(i)).getROW_COUNT());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_w_INV_status = null;
		m_w_ITEM_CD = null;
		m_h_JOB_ODR_CD_STOCK_flg = null;
		m_ERR_MSG = null;
		m_ERR_ADR = null;
		m_c_JOB_ODR_CD_STOCK_flg = null;
		m_h_change_flg = null;
		m_FileName = null;
		m_h_lotCtrl = null;
		m_LOT_NO_form = null;
		m_h_APR_INV_CTRL = null;
		m_MODIFY_COUNT = null;
		m_w_COLUMN_FLG = null;
		m_INV_DATE = null;
		m_REGULAR_INV_FLG = null;
		m_CYCLE_INV_FLG = null;
		m_TEMP_INV_FLG = null;
		m_INV_STS_TYP = null;
		m_INV_START_DATE = null;
		m_STOCK_SAVE_DATE = null;
		m_INV_UPDATED_DATE = null;
		m_INV_COMMENT = null;
		m_PLANT_CD = null;
		m_WH_CD = null;
		m_WH_NAME = null;
		m_ITEM_CD = null;
		m_ITEM_NAME = null;
		m_FINAL_BOOK_STOCK_QTY = null;
		m_ACTUAL_STOCK_QTY = null;
		m_STOCK_UNIT = null;
		m_UNIT_QTY_TYP = null;
		m_w_JOB_ODR_CD = null;
		m_JOB_ODR_CD = null;
		m_MRP_ODR_TYP = null;
		m_ABC_TYP = null;
		m_LOT_CTRL_FLG = null;
		m_LOT_NUMBERING_TYP = null;
		m_INV_FLG_JAN = null;
		m_INV_FLG_FEB = null;
		m_INV_FLG_MAR = null;
		m_INV_FLG_APR = null;
		m_INV_FLG_MAY = null;
		m_INV_FLG_JUN = null;
		m_INV_FLG_JUL = null;
		m_INV_FLG_AUG = null;
		m_INV_FLG_SEP = null;
		m_INV_FLG_OCT = null;
		m_INV_FLG_NOV = null;
		m_INV_FLG_DEC = null;
		m_PAST_RESULT_ENTRY_TYP = null;
		m_PROC_EXEC_DATE = null;
		m_LOT_NO = null;
		m_MODIFY_COUNT_1 = null;
		m_TItemInvACTUALSTOCKQTY = null;
		m_ACTUAL_STOCK_QTY_1 = null;
		m_lotNoitemcd = null;
		m_lotNoitemname = null;
		m_lotNowhcd = null;
		m_lotNoqty = null;
		m_lotNoactual = null;
		m_lotNostockunit = null;
		m_lotNounitqty = null;
		m_lotNomodify = null;
		m_lotNolotno = null;
		m_BEST_BEFORE_DATE = null;
		m_LOT_DEL_FLG = null;
		m_BUSINESS_OPR_DATE = null;
		m_ACTUAL_STOCK_QTY_2 = null;
		m_h_APRR_FLG = null;
		m_l_COUNT = null;
		m_ROW_COUNT = null;

		l_w_INV_status = null;
		l_w_ITEM_CD = null;
		l_h_JOB_ODR_CD_STOCK_flg = null;
		l_ERR_MSG = null;
		l_ERR_ADR = null;
		l_c_JOB_ODR_CD_STOCK_flg = null;
		l_h_change_flg = null;
		l_FileName = null;
		l_h_lotCtrl = null;
		l_LOT_NO_form = null;
		l_h_APR_INV_CTRL = null;
		l_MODIFY_COUNT = null;
		l_w_COLUMN_FLG = null;
		l_INV_DATE = null;
		l_REGULAR_INV_FLG = null;
		l_CYCLE_INV_FLG = null;
		l_TEMP_INV_FLG = null;
		l_INV_STS_TYP = null;
		l_INV_START_DATE = null;
		l_STOCK_SAVE_DATE = null;
		l_INV_UPDATED_DATE = null;
		l_INV_COMMENT = null;
		l_PLANT_CD = null;
		l_WH_CD = null;
		l_WH_NAME = null;
		l_ITEM_CD = null;
		l_ITEM_NAME = null;
		l_FINAL_BOOK_STOCK_QTY = null;
		l_ACTUAL_STOCK_QTY = null;
		l_STOCK_UNIT = null;
		l_UNIT_QTY_TYP = null;
		l_w_JOB_ODR_CD = null;
		l_JOB_ODR_CD = null;
		l_MRP_ODR_TYP = null;
		l_ABC_TYP = null;
		l_LOT_CTRL_FLG = null;
		l_LOT_NUMBERING_TYP = null;
		l_INV_FLG_JAN = null;
		l_INV_FLG_FEB = null;
		l_INV_FLG_MAR = null;
		l_INV_FLG_APR = null;
		l_INV_FLG_MAY = null;
		l_INV_FLG_JUN = null;
		l_INV_FLG_JUL = null;
		l_INV_FLG_AUG = null;
		l_INV_FLG_SEP = null;
		l_INV_FLG_OCT = null;
		l_INV_FLG_NOV = null;
		l_INV_FLG_DEC = null;
		l_PAST_RESULT_ENTRY_TYP = null;
		l_PROC_EXEC_DATE = null;
		l_LOT_NO = null;
		l_MODIFY_COUNT_1 = null;
		l_TItemInvACTUALSTOCKQTY = null;
		l_ACTUAL_STOCK_QTY_1 = null;
		l_lotNoitemcd = null;
		l_lotNoitemname = null;
		l_lotNowhcd = null;
		l_lotNoqty = null;
		l_lotNoactual = null;
		l_lotNostockunit = null;
		l_lotNounitqty = null;
		l_lotNomodify = null;
		l_lotNolotno = null;
		l_BEST_BEFORE_DATE = null;
		l_LOT_DEL_FLG = null;
		l_BUSINESS_OPR_DATE = null;
		l_ACTUAL_STOCK_QTY_2 = null;
		l_h_APRR_FLG = null;
		l_l_COUNT = null;
		l_ROW_COUNT = null;

		return;
	}

	//////////////////////////////
	// Orteus標準Struct
	// ユーザコード
	public String sUser_ID = null;
	// set/getメソッド
	public String getsUser_ID() { return sUser_ID; }
	public void setsUser_ID(String val) { sUser_ID = val; }

	// 組織コード
	public String sOrganization_CD = null;
	// set/getメソッド
	public String getsOrganization_CD() { return sOrganization_CD; }
	public void setsOraganization_CD(String val) { sOrganization_CD = val; }

	// 処理日付
	public String sSysdate = null;
	// set/getメソッド
	public String getsSysdate() { return sSysdate; }
	public void setsSysdate(String val) { sSysdate = val; }
	//////////////////////////////

	/**
	 * medAH0050010クラスの標準コンストラクタ
	 */
	public AH0050010Struct()
	{
		//{{user_implement_code_constractor
                //}}user_implement_code_constractor

		return;
	}

	/**
	 * インスタンス破壊時に行う処理
	 *
	 */
	protected void finalize()
	{
		clear();
		return;
	}

	/**
	 * データのセット(個別メンバ・リストメンバ両方)
	 *
	 * @param struct セットする元のStruct
	 */
	public void setStruct(AH0050010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setStructM(struct);
			this.setStructL(struct);
		}
	}

	/**
	 * データのセット(個別メンバのみ)
	 *
	 * @param struct セットする元のStruct
	 */
	public void setStructM(AH0050010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setw_INV_status(struct.getw_INV_status());
			this.setw_ITEM_CD(struct.getw_ITEM_CD());
			this.seth_JOB_ODR_CD_STOCK_flg(struct.geth_JOB_ODR_CD_STOCK_flg());
			this.setERR_MSG(struct.getERR_MSG());
			this.setERR_ADR(struct.getERR_ADR());
			this.setc_JOB_ODR_CD_STOCK_flg(struct.getc_JOB_ODR_CD_STOCK_flg());
			this.seth_change_flg(struct.geth_change_flg());
			this.setFileName(struct.getFileName());
			this.seth_lotCtrl(struct.geth_lotCtrl());
			this.setLOT_NO_form(struct.getLOT_NO_form());
			this.seth_APR_INV_CTRL(struct.geth_APR_INV_CTRL());
			this.setMODIFY_COUNT(struct.getMODIFY_COUNT());
			this.setw_COLUMN_FLG(struct.getw_COLUMN_FLG());
			this.setINV_DATE(struct.getINV_DATE());
			this.setREGULAR_INV_FLG(struct.getREGULAR_INV_FLG());
			this.setCYCLE_INV_FLG(struct.getCYCLE_INV_FLG());
			this.setTEMP_INV_FLG(struct.getTEMP_INV_FLG());
			this.setINV_STS_TYP(struct.getINV_STS_TYP());
			this.setINV_START_DATE(struct.getINV_START_DATE());
			this.setSTOCK_SAVE_DATE(struct.getSTOCK_SAVE_DATE());
			this.setINV_UPDATED_DATE(struct.getINV_UPDATED_DATE());
			this.setINV_COMMENT(struct.getINV_COMMENT());
			this.setPLANT_CD(struct.getPLANT_CD());
			this.setWH_CD(struct.getWH_CD());
			this.setWH_NAME(struct.getWH_NAME());
			this.setITEM_CD(struct.getITEM_CD());
			this.setITEM_NAME(struct.getITEM_NAME());
			this.setFINAL_BOOK_STOCK_QTY(struct.getFINAL_BOOK_STOCK_QTY());
			this.setACTUAL_STOCK_QTY(struct.getACTUAL_STOCK_QTY());
			this.setSTOCK_UNIT(struct.getSTOCK_UNIT());
			this.setUNIT_QTY_TYP(struct.getUNIT_QTY_TYP());
			this.setw_JOB_ODR_CD(struct.getw_JOB_ODR_CD());
			this.setJOB_ODR_CD(struct.getJOB_ODR_CD());
			this.setMRP_ODR_TYP(struct.getMRP_ODR_TYP());
			this.setABC_TYP(struct.getABC_TYP());
			this.setLOT_CTRL_FLG(struct.getLOT_CTRL_FLG());
			this.setLOT_NUMBERING_TYP(struct.getLOT_NUMBERING_TYP());
			this.setINV_FLG_JAN(struct.getINV_FLG_JAN());
			this.setINV_FLG_FEB(struct.getINV_FLG_FEB());
			this.setINV_FLG_MAR(struct.getINV_FLG_MAR());
			this.setINV_FLG_APR(struct.getINV_FLG_APR());
			this.setINV_FLG_MAY(struct.getINV_FLG_MAY());
			this.setINV_FLG_JUN(struct.getINV_FLG_JUN());
			this.setINV_FLG_JUL(struct.getINV_FLG_JUL());
			this.setINV_FLG_AUG(struct.getINV_FLG_AUG());
			this.setINV_FLG_SEP(struct.getINV_FLG_SEP());
			this.setINV_FLG_OCT(struct.getINV_FLG_OCT());
			this.setINV_FLG_NOV(struct.getINV_FLG_NOV());
			this.setINV_FLG_DEC(struct.getINV_FLG_DEC());
			this.setPAST_RESULT_ENTRY_TYP(struct.getPAST_RESULT_ENTRY_TYP());
			this.setPROC_EXEC_DATE(struct.getPROC_EXEC_DATE());
			this.setLOT_NO(struct.getLOT_NO());
			this.setMODIFY_COUNT_1(struct.getMODIFY_COUNT_1());
			this.setTItemInvACTUALSTOCKQTY(struct.getTItemInvACTUALSTOCKQTY());
			this.setACTUAL_STOCK_QTY_1(struct.getACTUAL_STOCK_QTY_1());
			this.setlotNoitemcd(struct.getlotNoitemcd());
			this.setlotNoitemname(struct.getlotNoitemname());
			this.setlotNowhcd(struct.getlotNowhcd());
			this.setlotNoqty(struct.getlotNoqty());
			this.setlotNoactual(struct.getlotNoactual());
			this.setlotNostockunit(struct.getlotNostockunit());
			this.setlotNounitqty(struct.getlotNounitqty());
			this.setlotNomodify(struct.getlotNomodify());
			this.setlotNolotno(struct.getlotNolotno());
			this.setBEST_BEFORE_DATE(struct.getBEST_BEFORE_DATE());
			this.setLOT_DEL_FLG(struct.getLOT_DEL_FLG());
			this.setBUSINESS_OPR_DATE(struct.getBUSINESS_OPR_DATE());
			this.setACTUAL_STOCK_QTY_2(struct.getACTUAL_STOCK_QTY_2());
			this.seth_APRR_FLG(struct.geth_APRR_FLG());
			this.setl_COUNT(struct.getl_COUNT());
			this.setROW_COUNT(struct.getROW_COUNT());
		}
	}

	/**
	 * データのセット(リストメンバのみ)
	 *
	 * @param struct セットする元のStruct
	 */
	public void setStructL(AH0050010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_w_INV_status(struct.getList_w_INV_status());
			this.setList_w_ITEM_CD(struct.getList_w_ITEM_CD());
			this.setList_h_JOB_ODR_CD_STOCK_flg(struct.getList_h_JOB_ODR_CD_STOCK_flg());
			this.setList_ERR_MSG(struct.getList_ERR_MSG());
			this.setList_ERR_ADR(struct.getList_ERR_ADR());
			this.setList_c_JOB_ODR_CD_STOCK_flg(struct.getList_c_JOB_ODR_CD_STOCK_flg());
			this.setList_h_change_flg(struct.getList_h_change_flg());
			this.setList_FileName(struct.getList_FileName());
			this.setList_h_lotCtrl(struct.getList_h_lotCtrl());
			this.setList_LOT_NO_form(struct.getList_LOT_NO_form());
			this.setList_h_APR_INV_CTRL(struct.getList_h_APR_INV_CTRL());
			this.setList_MODIFY_COUNT(struct.getList_MODIFY_COUNT());
			this.setList_w_COLUMN_FLG(struct.getList_w_COLUMN_FLG());
			this.setList_INV_DATE(struct.getList_INV_DATE());
			this.setList_REGULAR_INV_FLG(struct.getList_REGULAR_INV_FLG());
			this.setList_CYCLE_INV_FLG(struct.getList_CYCLE_INV_FLG());
			this.setList_TEMP_INV_FLG(struct.getList_TEMP_INV_FLG());
			this.setList_INV_STS_TYP(struct.getList_INV_STS_TYP());
			this.setList_INV_START_DATE(struct.getList_INV_START_DATE());
			this.setList_STOCK_SAVE_DATE(struct.getList_STOCK_SAVE_DATE());
			this.setList_INV_UPDATED_DATE(struct.getList_INV_UPDATED_DATE());
			this.setList_INV_COMMENT(struct.getList_INV_COMMENT());
			this.setList_PLANT_CD(struct.getList_PLANT_CD());
			this.setList_WH_CD(struct.getList_WH_CD());
			this.setList_WH_NAME(struct.getList_WH_NAME());
			this.setList_ITEM_CD(struct.getList_ITEM_CD());
			this.setList_ITEM_NAME(struct.getList_ITEM_NAME());
			this.setList_FINAL_BOOK_STOCK_QTY(struct.getList_FINAL_BOOK_STOCK_QTY());
			this.setList_ACTUAL_STOCK_QTY(struct.getList_ACTUAL_STOCK_QTY());
			this.setList_STOCK_UNIT(struct.getList_STOCK_UNIT());
			this.setList_UNIT_QTY_TYP(struct.getList_UNIT_QTY_TYP());
			this.setList_w_JOB_ODR_CD(struct.getList_w_JOB_ODR_CD());
			this.setList_JOB_ODR_CD(struct.getList_JOB_ODR_CD());
			this.setList_MRP_ODR_TYP(struct.getList_MRP_ODR_TYP());
			this.setList_ABC_TYP(struct.getList_ABC_TYP());
			this.setList_LOT_CTRL_FLG(struct.getList_LOT_CTRL_FLG());
			this.setList_LOT_NUMBERING_TYP(struct.getList_LOT_NUMBERING_TYP());
			this.setList_INV_FLG_JAN(struct.getList_INV_FLG_JAN());
			this.setList_INV_FLG_FEB(struct.getList_INV_FLG_FEB());
			this.setList_INV_FLG_MAR(struct.getList_INV_FLG_MAR());
			this.setList_INV_FLG_APR(struct.getList_INV_FLG_APR());
			this.setList_INV_FLG_MAY(struct.getList_INV_FLG_MAY());
			this.setList_INV_FLG_JUN(struct.getList_INV_FLG_JUN());
			this.setList_INV_FLG_JUL(struct.getList_INV_FLG_JUL());
			this.setList_INV_FLG_AUG(struct.getList_INV_FLG_AUG());
			this.setList_INV_FLG_SEP(struct.getList_INV_FLG_SEP());
			this.setList_INV_FLG_OCT(struct.getList_INV_FLG_OCT());
			this.setList_INV_FLG_NOV(struct.getList_INV_FLG_NOV());
			this.setList_INV_FLG_DEC(struct.getList_INV_FLG_DEC());
			this.setList_PAST_RESULT_ENTRY_TYP(struct.getList_PAST_RESULT_ENTRY_TYP());
			this.setList_PROC_EXEC_DATE(struct.getList_PROC_EXEC_DATE());
			this.setList_LOT_NO(struct.getList_LOT_NO());
			this.setList_MODIFY_COUNT_1(struct.getList_MODIFY_COUNT_1());
			this.setList_TItemInvACTUALSTOCKQTY(struct.getList_TItemInvACTUALSTOCKQTY());
			this.setList_ACTUAL_STOCK_QTY_1(struct.getList_ACTUAL_STOCK_QTY_1());
			this.setList_lotNoitemcd(struct.getList_lotNoitemcd());
			this.setList_lotNoitemname(struct.getList_lotNoitemname());
			this.setList_lotNowhcd(struct.getList_lotNowhcd());
			this.setList_lotNoqty(struct.getList_lotNoqty());
			this.setList_lotNoactual(struct.getList_lotNoactual());
			this.setList_lotNostockunit(struct.getList_lotNostockunit());
			this.setList_lotNounitqty(struct.getList_lotNounitqty());
			this.setList_lotNomodify(struct.getList_lotNomodify());
			this.setList_lotNolotno(struct.getList_lotNolotno());
			this.setList_BEST_BEFORE_DATE(struct.getList_BEST_BEFORE_DATE());
			this.setList_LOT_DEL_FLG(struct.getList_LOT_DEL_FLG());
			this.setList_BUSINESS_OPR_DATE(struct.getList_BUSINESS_OPR_DATE());
			this.setList_ACTUAL_STOCK_QTY_2(struct.getList_ACTUAL_STOCK_QTY_2());
			this.setList_h_APRR_FLG(struct.getList_h_APRR_FLG());
			this.setList_l_COUNT(struct.getList_l_COUNT());
			this.setList_ROW_COUNT(struct.getList_ROW_COUNT());
		}
	}

	/**
	 * オブジェクトの文字列表現を返します。
	 * ここでは、getXXXXで取得できるこのクラスの属性値（リストは除く）を返します。
	 * @return オブジェクトの文字列表現
	 */
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		java.lang.reflect.Method[] method = getClass().getDeclaredMethods();
		for (int i = 0; i < method.length; i++) {
			String name = method[i].getName();
			if (name.startsWith("get") && !name.startsWith("getList")) {
				try {
					buffer.append(name.substring(3));
					buffer.append("=[");
					buffer.append(method[i].invoke(this, new Object[]{}));
					buffer.append("], ");
				} catch (IllegalAccessException e) {
					buffer.append(name);
					buffer.append("is IllegalAccessException!! , ");
				} catch (java.lang.reflect.InvocationTargetException e) {
					buffer.append(name);
					buffer.append("is InvocationTargetException!! , ");
				}
			}
		}
		if (buffer.length() < 2) {
			return super.toString();
		}
		return buffer.substring(0, buffer.length() - 2);
	}

	//////////////////////////////
	// 初期値定義
	// 以下に初期化に使う定数の参考として再生成のたびに自動的に全メンバーのサンプルをコメントアウトして出力しています。
/*
	// 第 1 変数初期値： i_w_INV_status


	final static String i_w_INV_status = null;

	// 第 2 変数初期値： i_w_ITEM_CD


	final static String i_w_ITEM_CD = null;

	// 第 3 変数初期値： i_h_JOB_ODR_CD_STOCK_flg


	final static String i_h_JOB_ODR_CD_STOCK_flg = null;

	// 第 4 変数初期値： i_ERR_MSG


	final static String i_ERR_MSG = null;

	// 第 5 変数初期値： i_ERR_ADR


	final static String i_ERR_ADR = null;

	// 第 6 変数初期値： i_c_JOB_ODR_CD_STOCK_flg


	final static String i_c_JOB_ODR_CD_STOCK_flg = null;

	// 第 7 変数初期値： i_h_change_flg


	final static String i_h_change_flg = null;

	// 第 8 変数初期値： i_FileName


	final static String i_FileName = null;

	// 第 9 変数初期値： i_h_lotCtrl


	final static String i_h_lotCtrl = null;

	// 第 10 変数初期値： i_LOT_NO_form


	final static String i_LOT_NO_form = null;

	// 第 11 変数初期値： i_h_APR_INV_CTRL


	final static String i_h_APR_INV_CTRL = null;

	// 第 12 変数初期値： i_MODIFY_COUNT


	final static String i_MODIFY_COUNT = null;

	// 第 13 変数初期値： i_w_COLUMN_FLG


	final static String i_w_COLUMN_FLG = null;

	// 第 14 変数初期値： i_INV_DATE


	final static String i_INV_DATE = null;

	// 第 15 変数初期値： i_REGULAR_INV_FLG


	final static String i_REGULAR_INV_FLG = null;

	// 第 16 変数初期値： i_CYCLE_INV_FLG


	final static String i_CYCLE_INV_FLG = null;

	// 第 17 変数初期値： i_TEMP_INV_FLG


	final static String i_TEMP_INV_FLG = null;

	// 第 18 変数初期値： i_INV_STS_TYP


	final static String i_INV_STS_TYP = null;

	// 第 19 変数初期値： i_INV_START_DATE


	final static String i_INV_START_DATE = null;

	// 第 20 変数初期値： i_STOCK_SAVE_DATE


	final static String i_STOCK_SAVE_DATE = null;

	// 第 21 変数初期値： i_INV_UPDATED_DATE


	final static String i_INV_UPDATED_DATE = null;

	// 第 22 変数初期値： i_INV_COMMENT


	final static String i_INV_COMMENT = null;

	// 第 23 変数初期値： i_PLANT_CD


	final static String i_PLANT_CD = null;

	// 第 24 変数初期値： i_WH_CD


	final static String i_WH_CD = null;

	// 第 25 変数初期値： i_WH_NAME


	final static String i_WH_NAME = null;

	// 第 26 変数初期値： i_ITEM_CD


	final static String i_ITEM_CD = null;

	// 第 27 変数初期値： i_ITEM_NAME


	final static String i_ITEM_NAME = null;

	// 第 28 変数初期値： i_FINAL_BOOK_STOCK_QTY


	final static String i_FINAL_BOOK_STOCK_QTY = null;

	// 第 29 変数初期値： i_ACTUAL_STOCK_QTY


	final static String i_ACTUAL_STOCK_QTY = null;

	// 第 30 変数初期値： i_STOCK_UNIT


	final static String i_STOCK_UNIT = null;

	// 第 31 変数初期値： i_UNIT_QTY_TYP


	final static String i_UNIT_QTY_TYP = null;

	// 第 32 変数初期値： i_w_JOB_ODR_CD


	final static String i_w_JOB_ODR_CD = null;

	// 第 33 変数初期値： i_JOB_ODR_CD


	final static String i_JOB_ODR_CD = null;

	// 第 34 変数初期値： i_MRP_ODR_TYP


	final static String i_MRP_ODR_TYP = null;

	// 第 35 変数初期値： i_ABC_TYP


	final static String i_ABC_TYP = null;

	// 第 36 変数初期値： i_LOT_CTRL_FLG


	final static String i_LOT_CTRL_FLG = null;

	// 第 37 変数初期値： i_LOT_NUMBERING_TYP


	final static String i_LOT_NUMBERING_TYP = null;

	// 第 38 変数初期値： i_INV_FLG_JAN


	final static String i_INV_FLG_JAN = null;

	// 第 39 変数初期値： i_INV_FLG_FEB


	final static String i_INV_FLG_FEB = null;

	// 第 40 変数初期値： i_INV_FLG_MAR


	final static String i_INV_FLG_MAR = null;

	// 第 41 変数初期値： i_INV_FLG_APR


	final static String i_INV_FLG_APR = null;

	// 第 42 変数初期値： i_INV_FLG_MAY


	final static String i_INV_FLG_MAY = null;

	// 第 43 変数初期値： i_INV_FLG_JUN


	final static String i_INV_FLG_JUN = null;

	// 第 44 変数初期値： i_INV_FLG_JUL


	final static String i_INV_FLG_JUL = null;

	// 第 45 変数初期値： i_INV_FLG_AUG


	final static String i_INV_FLG_AUG = null;

	// 第 46 変数初期値： i_INV_FLG_SEP


	final static String i_INV_FLG_SEP = null;

	// 第 47 変数初期値： i_INV_FLG_OCT


	final static String i_INV_FLG_OCT = null;

	// 第 48 変数初期値： i_INV_FLG_NOV


	final static String i_INV_FLG_NOV = null;

	// 第 49 変数初期値： i_INV_FLG_DEC


	final static String i_INV_FLG_DEC = null;

	// 第 50 変数初期値： i_PAST_RESULT_ENTRY_TYP


	final static String i_PAST_RESULT_ENTRY_TYP = null;

	// 第 51 変数初期値： i_PROC_EXEC_DATE


	final static BigDecimal i_PROC_EXEC_DATE = null;

	// 第 52 変数初期値： i_LOT_NO


	final static String i_LOT_NO = null;

	// 第 53 変数初期値： i_MODIFY_COUNT_1


	final static String i_MODIFY_COUNT_1 = null;

	// 第 54 変数初期値： i_TItemInvACTUALSTOCKQTY


	final static String i_TItemInvACTUALSTOCKQTY = null;

	// 第 55 変数初期値： i_ACTUAL_STOCK_QTY_1


	final static String i_ACTUAL_STOCK_QTY_1 = null;

	// 第 56 変数初期値： i_lotNoitemcd


	final static String i_lotNoitemcd = null;

	// 第 57 変数初期値： i_lotNoitemname


	final static String i_lotNoitemname = null;

	// 第 58 変数初期値： i_lotNowhcd


	final static String i_lotNowhcd = null;

	// 第 59 変数初期値： i_lotNoqty


	final static String i_lotNoqty = null;

	// 第 60 変数初期値： i_lotNoactual


	final static String i_lotNoactual = null;

	// 第 61 変数初期値： i_lotNostockunit


	final static String i_lotNostockunit = null;

	// 第 62 変数初期値： i_lotNounitqty


	final static String i_lotNounitqty = null;

	// 第 63 変数初期値： i_lotNomodify


	final static String i_lotNomodify = null;

	// 第 64 変数初期値： i_lotNolotno


	final static String i_lotNolotno = null;

	// 第 65 変数初期値： i_BEST_BEFORE_DATE


	final static String i_BEST_BEFORE_DATE = null;

	// 第 66 変数初期値： i_LOT_DEL_FLG


	final static String i_LOT_DEL_FLG = null;

	// 第 67 変数初期値： i_BUSINESS_OPR_DATE


	final static String i_BUSINESS_OPR_DATE = null;

	// 第 68 変数初期値： i_ACTUAL_STOCK_QTY_2


	final static String i_ACTUAL_STOCK_QTY_2 = null;

	// 第 69 変数初期値： i_h_APRR_FLG


	final static String i_h_APRR_FLG = null;

	// 第 70 変数初期値： i_l_COUNT


	final static String i_l_COUNT = null;

	// 第 71 変数初期値： i_ROW_COUNT


	final static String i_ROW_COUNT = null;

*/

	//{{user_implement_code
        //------------------------------------------------------------------
        /**
         * 親画面初期値設定
         *
         * @param なし
         */
        public void initializeParent()
        {
         m_h_JOB_ODR_CD_STOCK_flg = "0";	// チェック初期選択値（製番在庫指定）
         resetChangeFlag();				// 一覧実棚数変更フラグリセット
        }
        /**
         * 一覧実棚数変更フラグリセット
         *
         * @param なし
         */
        public void resetChangeFlag()
        {
         m_h_change_flg = "0";
        }
       
        /**
         * サブ1画面初期値設定
         *
         * @param なし
         */
        public void initializeSub1()
        {
         clear();
         m_ACTUAL_STOCK_QTY = "0.0";	// 実棚数
        }
       
        /**
         * 直持ち変数のコピー
         * @param s コピー元
         */
        public void copy(AH0050010Struct s)
        {
         clear();
         if(s.sUser_ID != null) sUser_ID = new String(s.sUser_ID);
         if(s.sSysdate != null) sSysdate = new String(s.sSysdate);
         if(s.m_INV_DATE != null) m_INV_DATE = new String(s.m_INV_DATE);
         if(s.m_REGULAR_INV_FLG != null) m_REGULAR_INV_FLG = new String(s.m_REGULAR_INV_FLG);
         if(s.m_CYCLE_INV_FLG != null) m_CYCLE_INV_FLG = new String(s.m_CYCLE_INV_FLG);
         if(s.m_TEMP_INV_FLG != null) m_TEMP_INV_FLG = new String(s.m_TEMP_INV_FLG);
         if(s.m_INV_STS_TYP != null) m_INV_STS_TYP = new String(s.m_INV_STS_TYP);
         if(s.m_INV_START_DATE != null) m_INV_START_DATE = new String(s.m_INV_START_DATE);
         if(s.m_STOCK_SAVE_DATE != null) m_STOCK_SAVE_DATE = new String(s.m_STOCK_SAVE_DATE);
         if(s.m_INV_UPDATED_DATE != null) m_INV_UPDATED_DATE = new String(s.m_INV_UPDATED_DATE);
         if(s.m_INV_COMMENT != null) m_INV_COMMENT = new String(s.m_INV_COMMENT);
         if(s.m_MODIFY_COUNT != null) m_MODIFY_COUNT = new String(s.m_MODIFY_COUNT);
         if(s.m_PLANT_CD != null) m_PLANT_CD = new String(s.m_PLANT_CD);
         if(s.m_WH_CD != null) m_WH_CD = new String(s.m_WH_CD);
         if(s.m_WH_NAME != null) m_WH_NAME = new String(s.m_WH_NAME);
         if(s.m_ITEM_CD != null) m_ITEM_CD = new String(s.m_ITEM_CD);
         if(s.m_ITEM_NAME != null) m_ITEM_NAME = new String(s.m_ITEM_NAME);
         if(s.m_FINAL_BOOK_STOCK_QTY != null) m_FINAL_BOOK_STOCK_QTY = new String(s.m_FINAL_BOOK_STOCK_QTY);
         if(s.m_ACTUAL_STOCK_QTY != null) m_ACTUAL_STOCK_QTY = new String(s.m_ACTUAL_STOCK_QTY);
         if(s.m_STOCK_UNIT != null) m_STOCK_UNIT = new String(s.m_STOCK_UNIT);
         if(s.m_UNIT_QTY_TYP != null) m_UNIT_QTY_TYP = new String(s.m_UNIT_QTY_TYP);
         if(s.m_w_JOB_ODR_CD != null) m_w_JOB_ODR_CD = new String(s.m_w_JOB_ODR_CD);
         if(s.m_JOB_ODR_CD != null) m_JOB_ODR_CD = new String(s.m_JOB_ODR_CD);
         if(s.m_MRP_ODR_TYP != null) m_MRP_ODR_TYP = new String(s.m_MRP_ODR_TYP);
         if(s.m_ABC_TYP != null) m_ABC_TYP = new String(s.m_ABC_TYP);
         if(s.m_INV_FLG_JAN != null) m_INV_FLG_JAN = new String(s.m_INV_FLG_JAN);
         if(s.m_INV_FLG_FEB != null) m_INV_FLG_FEB = new String(s.m_INV_FLG_FEB);
         if(s.m_INV_FLG_MAR != null) m_INV_FLG_MAR = new String(s.m_INV_FLG_MAR);
         if(s.m_INV_FLG_APR != null) m_INV_FLG_APR = new String(s.m_INV_FLG_APR);
         if(s.m_INV_FLG_MAY != null) m_INV_FLG_MAY = new String(s.m_INV_FLG_MAY);
         if(s.m_INV_FLG_JUN != null) m_INV_FLG_JUN = new String(s.m_INV_FLG_JUN);
         if(s.m_INV_FLG_JUL != null) m_INV_FLG_JUL = new String(s.m_INV_FLG_JUL);
         if(s.m_INV_FLG_AUG != null) m_INV_FLG_AUG = new String(s.m_INV_FLG_AUG);
         if(s.m_INV_FLG_SEP != null) m_INV_FLG_SEP = new String(s.m_INV_FLG_SEP);
         if(s.m_INV_FLG_OCT != null) m_INV_FLG_OCT = new String(s.m_INV_FLG_OCT);
         if(s.m_INV_FLG_NOV != null) m_INV_FLG_NOV = new String(s.m_INV_FLG_NOV);
         if(s.m_INV_FLG_DEC != null) m_INV_FLG_DEC = new String(s.m_INV_FLG_DEC);
         if(s.m_w_INV_status != null) m_w_INV_status = new String(s.m_w_INV_status);
         if(s.m_w_ITEM_CD != null) m_w_ITEM_CD = new String(s.m_w_ITEM_CD);
         if(s.m_h_JOB_ODR_CD_STOCK_flg != null) m_h_JOB_ODR_CD_STOCK_flg = new String(s.m_h_JOB_ODR_CD_STOCK_flg);
         if(s.m_ERR_MSG != null) m_ERR_MSG = new String(s.m_ERR_MSG);
         if(s.m_ERR_ADR != null) m_ERR_ADR = new String(s.m_ERR_ADR);
         if(s.m_c_JOB_ODR_CD_STOCK_flg != null) m_c_JOB_ODR_CD_STOCK_flg = new String(s.m_c_JOB_ODR_CD_STOCK_flg);
         if(s.m_h_change_flg != null) m_h_change_flg = new String(s.m_h_change_flg);
         if(s.m_FileName != null) m_FileName = new String(s.m_FileName);
         if(s.m_w_COLUMN_FLG != null) m_w_COLUMN_FLG = new String(s.m_w_COLUMN_FLG);
         if(s.m_LOT_NO != null) m_LOT_NO = new String(s.m_LOT_NO);
         if(s.m_LOT_NO_form != null) m_LOT_NO_form = new String(s.m_LOT_NO_form);
         if(s.m_MODIFY_COUNT_1 != null) m_MODIFY_COUNT_1 = new String(s.m_MODIFY_COUNT_1);
         if(s.m_h_APR_INV_CTRL != null) m_h_APR_INV_CTRL = new String(s.m_h_APR_INV_CTRL);
         if(s.m_h_APRR_FLG != null) m_h_APRR_FLG = new String(s.m_h_APRR_FLG);
        }
       
        /**	
         * 引数の情報の保持するリストの変数から指定の順のデータを取得	
         * @param in リスト保持の情報	
         * @param index 順番	
         */	
        public void importData(AH0050010Struct in, int index)	
        {	
         clear();
         if(in.l_INV_DATE != null && in.l_INV_DATE.size() > index)  m_INV_DATE = (String)(in.l_INV_DATE.get(index));
         if(in.l_REGULAR_INV_FLG != null && in.l_REGULAR_INV_FLG.size() > index)  m_REGULAR_INV_FLG = (String)(in.l_REGULAR_INV_FLG.get(index));
         if(in.l_CYCLE_INV_FLG != null && in.l_CYCLE_INV_FLG.size() > index)  m_CYCLE_INV_FLG = (String)(in.l_CYCLE_INV_FLG.get(index));
         if(in.l_TEMP_INV_FLG != null && in.l_TEMP_INV_FLG.size() > index)  m_TEMP_INV_FLG = (String)(in.l_TEMP_INV_FLG.get(index));
         if(in.l_INV_STS_TYP != null && in.l_INV_STS_TYP.size() > index)  m_INV_STS_TYP = (String)(in.l_INV_STS_TYP.get(index));
         if(in.l_INV_START_DATE != null && in.l_INV_START_DATE.size() > index)  m_INV_START_DATE = (String)(in.l_INV_START_DATE.get(index));
         if(in.l_STOCK_SAVE_DATE != null && in.l_STOCK_SAVE_DATE.size() > index)  m_STOCK_SAVE_DATE = (String)(in.l_STOCK_SAVE_DATE.get(index));
         if(in.l_INV_UPDATED_DATE != null && in.l_INV_UPDATED_DATE.size() > index)  m_INV_UPDATED_DATE = (String)(in.l_INV_UPDATED_DATE.get(index));
         if(in.l_INV_COMMENT != null && in.l_INV_COMMENT.size() > index)  m_INV_COMMENT = (String)(in.l_INV_COMMENT.get(index));
         if(in.l_MODIFY_COUNT != null && in.l_MODIFY_COUNT.size() > index)  m_MODIFY_COUNT = (String)(in.l_MODIFY_COUNT.get(index));
         if(in.l_MODIFY_COUNT_1 != null && in.l_MODIFY_COUNT_1.size() > index)  m_MODIFY_COUNT_1 = (String)(in.l_MODIFY_COUNT_1.get(index));
         if(in.l_LOT_NO != null && in.l_LOT_NO.size() > index)  m_LOT_NO = (String)(in.l_LOT_NO.get(index));
         if(in.l_PLANT_CD != null && in.l_PLANT_CD.size() > index)  m_PLANT_CD = (String)(in.l_PLANT_CD.get(index));
         if(in.l_WH_CD != null && in.l_WH_CD.size() > index)  m_WH_CD = (String)(in.l_WH_CD.get(index));
         if(in.l_WH_NAME != null && in.l_WH_NAME.size() > index)  m_WH_NAME = (String)(in.l_WH_NAME.get(index));
         if(in.l_ITEM_CD != null && in.l_ITEM_CD.size() > index)  m_ITEM_CD = (String)(in.l_ITEM_CD.get(index));
         if(in.l_ITEM_NAME != null && in.l_ITEM_NAME.size() > index)  m_ITEM_NAME = (String)(in.l_ITEM_NAME.get(index));
         if(in.l_FINAL_BOOK_STOCK_QTY != null && in.l_FINAL_BOOK_STOCK_QTY.size() > index)  m_FINAL_BOOK_STOCK_QTY = (String)(in.l_FINAL_BOOK_STOCK_QTY.get(index));
         if(in.l_ACTUAL_STOCK_QTY != null && in.l_ACTUAL_STOCK_QTY.size() > index)  m_ACTUAL_STOCK_QTY = (String)(in.l_ACTUAL_STOCK_QTY.get(index));
         if(in.l_STOCK_UNIT != null && in.l_STOCK_UNIT.size() > index)  m_STOCK_UNIT = (String)(in.l_STOCK_UNIT.get(index));
         if(in.l_UNIT_QTY_TYP != null && in.l_UNIT_QTY_TYP.size() > index)  m_UNIT_QTY_TYP = (String)(in.l_UNIT_QTY_TYP.get(index));
         if(in.l_JOB_ODR_CD != null && in.l_JOB_ODR_CD.size() > index)  m_JOB_ODR_CD = (String)(in.l_JOB_ODR_CD.get(index));
         if(in.l_w_JOB_ODR_CD != null && in.l_w_JOB_ODR_CD.size() > index)  m_w_JOB_ODR_CD = (String)(in.l_w_JOB_ODR_CD.get(index));
         if(in.l_MRP_ODR_TYP != null && in.l_MRP_ODR_TYP.size() > index)  m_MRP_ODR_TYP = (String)(in.l_MRP_ODR_TYP.get(index));
         if(in.l_ABC_TYP != null && in.l_ABC_TYP.size() > index)  m_ABC_TYP = (String)(in.l_ABC_TYP.get(index));
         if(in.l_INV_FLG_JAN != null && in.l_INV_FLG_JAN.size() > index)  m_INV_FLG_JAN = (String)(in.l_INV_FLG_JAN.get(index));
         if(in.l_INV_FLG_FEB != null && in.l_INV_FLG_FEB.size() > index)  m_INV_FLG_FEB = (String)(in.l_INV_FLG_FEB.get(index));
         if(in.l_INV_FLG_MAR != null && in.l_INV_FLG_MAR.size() > index)  m_INV_FLG_MAR = (String)(in.l_INV_FLG_MAR.get(index));
         if(in.l_INV_FLG_APR != null && in.l_INV_FLG_APR.size() > index)  m_INV_FLG_APR = (String)(in.l_INV_FLG_APR.get(index));
         if(in.l_INV_FLG_MAY != null && in.l_INV_FLG_MAY.size() > index)  m_INV_FLG_MAY = (String)(in.l_INV_FLG_MAY.get(index));
         if(in.l_INV_FLG_JUN != null && in.l_INV_FLG_JUN.size() > index)  m_INV_FLG_JUN = (String)(in.l_INV_FLG_JUN.get(index));
         if(in.l_INV_FLG_JUL != null && in.l_INV_FLG_JUL.size() > index)  m_INV_FLG_JUL = (String)(in.l_INV_FLG_JUL.get(index));
         if(in.l_INV_FLG_AUG != null && in.l_INV_FLG_AUG.size() > index)  m_INV_FLG_AUG = (String)(in.l_INV_FLG_AUG.get(index));
         if(in.l_INV_FLG_SEP != null && in.l_INV_FLG_SEP.size() > index)  m_INV_FLG_SEP = (String)(in.l_INV_FLG_SEP.get(index));
         if(in.l_INV_FLG_OCT != null && in.l_INV_FLG_OCT.size() > index)  m_INV_FLG_OCT = (String)(in.l_INV_FLG_OCT.get(index));
         if(in.l_INV_FLG_NOV != null && in.l_INV_FLG_NOV.size() > index)  m_INV_FLG_NOV = (String)(in.l_INV_FLG_NOV.get(index));
         if(in.l_INV_FLG_DEC != null && in.l_INV_FLG_DEC.size() > index)  m_INV_FLG_DEC = (String)(in.l_INV_FLG_DEC.get(index));
         if(in.l_w_INV_status != null && in.l_w_INV_status.size() > index)  m_w_INV_status = (String)(in.l_w_INV_status.get(index));
         if(in.l_w_ITEM_CD != null && in.l_w_ITEM_CD.size() > index)  m_w_ITEM_CD = (String)(in.l_w_ITEM_CD.get(index));
         if(in.l_h_JOB_ODR_CD_STOCK_flg != null && in.l_h_JOB_ODR_CD_STOCK_flg.size() > index)  m_h_JOB_ODR_CD_STOCK_flg = (String)(in.l_h_JOB_ODR_CD_STOCK_flg.get(index));
         if(in.l_ERR_MSG != null && in.l_ERR_MSG.size() > index)  m_ERR_MSG = (String)(in.l_ERR_MSG.get(index));
         if(in.l_ERR_ADR != null && in.l_ERR_ADR.size() > index)  m_ERR_ADR = (String)(in.l_ERR_ADR.get(index));
         if(in.l_c_JOB_ODR_CD_STOCK_flg != null && in.l_c_JOB_ODR_CD_STOCK_flg.size() > index)  m_c_JOB_ODR_CD_STOCK_flg = (String)(in.l_c_JOB_ODR_CD_STOCK_flg.get(index));
         if(in.l_h_change_flg != null && in.l_h_change_flg.size() > index)  m_h_change_flg = (String)(in.l_h_change_flg.get(index));
         if(in.l_FileName != null && in.l_FileName.size() > index)  m_FileName = (String)(in.l_FileName.get(index));
         if(in.l_w_COLUMN_FLG != null && in.l_w_COLUMN_FLG.size() > index)  m_w_COLUMN_FLG = (String)(in.l_w_COLUMN_FLG.get(index));
         return;
        }	
        //------------------------------------------------------------------
        //}}user_implement_code

	//////////////////////////////

}
