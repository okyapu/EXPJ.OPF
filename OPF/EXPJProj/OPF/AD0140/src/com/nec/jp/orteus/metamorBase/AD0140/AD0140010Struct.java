/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AD0140/src/com/nec/jp/orteus/metamorBase/AD0140/AD0140010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AD0140;

import com.nec.jp.orteus.xaf.wa.*;

import com.nec.jp.orteus.util.logging.*;

import java.lang.Number.*;
import java.lang.Float;
import java.util.*;
import java.sql.*;
import java.io.*;

//{{user_implement_code_import
	// TODO: ここにimportパッケージを記述してください
//}}user_implement_code_import

//{{user_implement_code_header
/**
 * CLASS     : AD0140010Control クラス
 * ファイル・クラス説明
 * @author $Author: geng-jia $
 * @version $Revision: 1.5 $ $Date: 2015/12/21 03:06:25 $
 *
 */
//}}user_implement_code_header

public class AD0140010Struct extends DataStruct
{

	//////////////////////////////

	/** 第 1 変数： m_FileName */
	public String m_FileName = null;
	/** 第 2 変数： m_DOWNLOAD_FILE */
	public String m_DOWNLOAD_FILE = null;
	/** 第 3 変数： m_l_ERROR_IN */
	public String m_l_ERROR_IN = null;
	/** 第 4 変数： m_l_ERR_INFO */
	public String m_l_ERR_INFO = null;
	/** 第 5 変数： m_l_ERR_CTR_NM */
	public String m_l_ERR_CTR_NM = null;
	/** 第 6 変数： m_l_ERR_PLANT_NO */
	public String m_l_ERR_PLANT_NO = null;
	/** 第 7 変数： m_l_ERR_DAILY_WORK_REPORT_TYP */
	public String m_l_ERR_DAILY_WORK_REPORT_TYP = null;
	/** 第 8 変数： m_l_ERR_USER_CD */
	public String m_l_ERR_USER_CD = null;
	/** 第 9 変数： m_l_ERR_OPR_DATE */
	public String m_l_ERR_OPR_DATE = null;
	/** 第 10 変数： m_l_ERR_WORK_SHIFT_CODE */
	public String m_l_ERR_WORK_SHIFT_CODE = null;
	/** 第 11 変数： m_l_ERR_WS_CD */
	public String m_l_ERR_WS_CD = null;
	/** 第 12 変数： m_l_ERR_TYP */
	public String m_l_ERR_TYP = null;
	/** 第 13 変数： m_WORK_SHIFT_CODE2 */
	public String m_WORK_SHIFT_CODE2 = null;
	/** 第 14 変数： m_WS_CD1 */
	public String m_WS_CD1 = null;
	/** 第 15 変数： m_START_TIME1 */
	public String m_START_TIME1 = null;
	/** 第 16 変数： m_END_TIME1 */
	public String m_END_TIME1 = null;
	/** 第 17 変数： m_OPR_TYP1 */
	public String m_OPR_TYP1 = null;
	/** 第 18 変数： m_UN_OPR_CAUSE_TYP1 */
	public String m_UN_OPR_CAUSE_TYP1 = null;
	/** 第 19 変数： m_UN_OPR_TIME1 */
	public String m_UN_OPR_TIME1 = null;
	/** 第 20 変数： m_REMARKS1 */
	public String m_REMARKS1 = null;
	/** 第 21 変数： m_WS_CD2 */
	public String m_WS_CD2 = null;
	/** 第 22 変数： m_START_TIME2 */
	public String m_START_TIME2 = null;
	/** 第 23 変数： m_END_TIME2 */
	public String m_END_TIME2 = null;
	/** 第 24 変数： m_OPR_TYP2 */
	public String m_OPR_TYP2 = null;
	/** 第 25 変数： m_UN_OPR_CAUSE_TYP2 */
	public String m_UN_OPR_CAUSE_TYP2 = null;
	/** 第 26 変数： m_UN_OPR_TIME2 */
	public String m_UN_OPR_TIME2 = null;
	/** 第 27 変数： m_REMARKS2 */
	public String m_REMARKS2 = null;
	/** 第 28 変数： m_WS_CD3 */
	public String m_WS_CD3 = null;
	/** 第 29 変数： m_START_TIME3 */
	public String m_START_TIME3 = null;
	/** 第 30 変数： m_END_TIME3 */
	public String m_END_TIME3 = null;
	/** 第 31 変数： m_OPR_TYP3 */
	public String m_OPR_TYP3 = null;
	/** 第 32 変数： m_UN_OPR_CAUSE_TYP3 */
	public String m_UN_OPR_CAUSE_TYP3 = null;
	/** 第 33 変数： m_UN_OPR_TIME3 */
	public String m_UN_OPR_TIME3 = null;
	/** 第 34 変数： m_REMARKS3 */
	public String m_REMARKS3 = null;
	/** 第 35 変数： m_WS_CD4 */
	public String m_WS_CD4 = null;
	/** 第 36 変数： m_START_TIME4 */
	public String m_START_TIME4 = null;
	/** 第 37 変数： m_END_TIME4 */
	public String m_END_TIME4 = null;
	/** 第 38 変数： m_OPR_TYP4 */
	public String m_OPR_TYP4 = null;
	/** 第 39 変数： m_UN_OPR_CAUSE_TYP4 */
	public String m_UN_OPR_CAUSE_TYP4 = null;
	/** 第 40 変数： m_UN_OPR_TIME4 */
	public String m_UN_OPR_TIME4 = null;
	/** 第 41 変数： m_REMARKS4 */
	public String m_REMARKS4 = null;
	/** 第 42 変数： m_WS_CD5 */
	public String m_WS_CD5 = null;
	/** 第 43 変数： m_START_TIME5 */
	public String m_START_TIME5 = null;
	/** 第 44 変数： m_END_TIME5 */
	public String m_END_TIME5 = null;
	/** 第 45 変数： m_OPR_TYP5 */
	public String m_OPR_TYP5 = null;
	/** 第 46 変数： m_UN_OPR_CAUSE_TYP5 */
	public String m_UN_OPR_CAUSE_TYP5 = null;
	/** 第 47 変数： m_UN_OPR_TIME5 */
	public String m_UN_OPR_TIME5 = null;
	/** 第 48 変数： m_REMARKS5 */
	public String m_REMARKS5 = null;
	/** 第 49 変数： m_w_COLUMN_FLG */
	public String m_w_COLUMN_FLG = null;
	/** 第 50 変数： m_OPR_TYP6 */
	public String m_OPR_TYP6 = null;
	/** 第 51 変数： m_UN_OPR_CAUSE_TYP6 */
	public String m_UN_OPR_CAUSE_TYP6 = null;
	/** 第 52 変数： m_UN_OPR_TIME6 */
	public String m_UN_OPR_TIME6 = null;
	/** 第 53 変数： m_REMARKS6 */
	public String m_REMARKS6 = null;
	/** 第 54 変数： m_DAILY_WORK_REPORT_DATA_TYP_NULL */
	public String m_DAILY_WORK_REPORT_DATA_TYP_NULL = null;
	/** 第 55 変数： m_OPR_TIME2 */
	public String m_OPR_TIME2 = null;
	/** 第 56 変数： m_OPR_TIME3 */
	public String m_OPR_TIME3 = null;
	/** 第 57 変数： m_OPR_TIME4 */
	public String m_OPR_TIME4 = null;
	/** 第 58 変数： m_OPR_TIME5 */
	public String m_OPR_TIME5 = null;
	/** 第 59 変数： m_DAILY_WORK_REPORT_CTL_NO */
	public String m_DAILY_WORK_REPORT_CTL_NO = null;
	/** 第 60 変数： m_SEQ_NO */
	public String m_SEQ_NO = null;
	/** 第 61 変数： m_PLANT_CD */
	public String m_PLANT_CD = null;
	/** 第 62 変数： m_DAILY_WORK_REPORT_TYP */
	public String m_DAILY_WORK_REPORT_TYP = null;
	/** 第 63 変数： m_USER_CD */
	public String m_USER_CD = null;
	/** 第 64 変数： m_OPR_DATE */
	public String m_OPR_DATE = null;
	/** 第 65 変数： m_WORK_SHIFT_CODE */
	public String m_WORK_SHIFT_CODE = null;
	/** 第 66 変数： m_WS_CD */
	public String m_WS_CD = null;
	/** 第 67 変数： m_START_TIME */
	public String m_START_TIME = null;
	/** 第 68 変数： m_END_TIME */
	public String m_END_TIME = null;
	/** 第 69 変数： m_OPR_TIME */
	public String m_OPR_TIME = null;
	/** 第 70 変数： m_OPR_TYP */
	public String m_OPR_TYP = null;
	/** 第 71 変数： m_UN_OPR_CAUSE_TYP */
	public String m_UN_OPR_CAUSE_TYP = null;
	/** 第 72 変数： m_UN_OPR_TIME */
	public String m_UN_OPR_TIME = null;
	/** 第 73 変数： m_REMARKS */
	public String m_REMARKS = null;
	/** 第 74 変数： m_COUNT */
	public String m_COUNT = null;
	/** 第 75 変数： m_TIME_FLG1 */
	public String m_TIME_FLG1 = null;
	/** 第 76 変数： m_USER_CD2 */
	public String m_USER_CD2 = null;
	/** 第 77 変数： m_OPR_DATE2 */
	public String m_OPR_DATE2 = null;
	/** 第 78 変数： m_TIME_FLG2 */
	public String m_TIME_FLG2 = null;
	/** 第 79 変数： m_START_TIME6 */
	public String m_START_TIME6 = null;
	/** 第 80 変数： m_END_TIME6 */
	public String m_END_TIME6 = null;
	/** 第 81 変数： m_HOLIDAY_FLG */
	public String m_HOLIDAY_FLG = null;
	/** 第 82 変数： m_OPR_DATE3 */
	public String m_OPR_DATE3 = null;
	/** 第 83 変数： m_PLANT_CD2 */
	public String m_PLANT_CD2 = null;
	/** 第 84 変数： m_WORK_SHIFT_CODE3 */
	public String m_WORK_SHIFT_CODE3 = null;
	/** 第 85 変数： m_OPR_INST_CD */
	public String m_OPR_INST_CD = null;
	/** 第 86 変数： m_WS_CD6 */
	public String m_WS_CD6 = null;
	/** 第 87 変数： m_TARGET_PLANT_CD */
	public String m_TARGET_PLANT_CD = null;
	/** 第 88 変数： m_TARGET_ITEM_NO */
	public String m_TARGET_ITEM_NO = null;
	/** 第 89 変数： m_TOTAL_OPR_TIME */
	public String m_TOTAL_OPR_TIME = null;
	/** 第 90 変数： m_PVC2LOGMODE */
	public String m_PVC2LOGMODE = null;
	/** 第 91 変数： m_PVC2OUTPUTMODE */
	public String m_PVC2OUTPUTMODE = null;
	/** 第 92 変数： m_PVC2OUTPUTPATH */
	public String m_PVC2OUTPUTPATH = null;
	/** 第 93 変数： m_PVC2OUTPUTNAME */
	public String m_PVC2OUTPUTNAME = null;
	/** 第 94 変数： m_PVC2USERID */
	public String m_PVC2USERID = null;
	/** 第 95 変数： m_PVC2BUSINESSNAME */
	public String m_PVC2BUSINESSNAME = null;
	/** 第 96 変数： m_PVC2PLANTCD */
	public String m_PVC2PLANTCD = null;
	/** 第 97 変数： m_RETURN_MESSAGE */
	public String m_RETURN_MESSAGE = null;
	/** 第 98 変数： m_RETURN_STATUS */
	public String m_RETURN_STATUS = null;

	// List型メンバ変数定義

	/** 第 1 List変数： l_FileName */
	public List l_FileName = null;

	/** 第 2 List変数： l_DOWNLOAD_FILE */
	public List l_DOWNLOAD_FILE = null;

	/** 第 3 List変数： l_l_ERROR_IN */
	public List l_l_ERROR_IN = null;

	/** 第 4 List変数： l_l_ERR_INFO */
	public List l_l_ERR_INFO = null;

	/** 第 5 List変数： l_l_ERR_CTR_NM */
	public List l_l_ERR_CTR_NM = null;

	/** 第 6 List変数： l_l_ERR_PLANT_NO */
	public List l_l_ERR_PLANT_NO = null;

	/** 第 7 List変数： l_l_ERR_DAILY_WORK_REPORT_TYP */
	public List l_l_ERR_DAILY_WORK_REPORT_TYP = null;

	/** 第 8 List変数： l_l_ERR_USER_CD */
	public List l_l_ERR_USER_CD = null;

	/** 第 9 List変数： l_l_ERR_OPR_DATE */
	public List l_l_ERR_OPR_DATE = null;

	/** 第 10 List変数： l_l_ERR_WORK_SHIFT_CODE */
	public List l_l_ERR_WORK_SHIFT_CODE = null;

	/** 第 11 List変数： l_l_ERR_WS_CD */
	public List l_l_ERR_WS_CD = null;

	/** 第 12 List変数： l_l_ERR_TYP */
	public List l_l_ERR_TYP = null;

	/** 第 13 List変数： l_WORK_SHIFT_CODE2 */
	public List l_WORK_SHIFT_CODE2 = null;

	/** 第 14 List変数： l_WS_CD1 */
	public List l_WS_CD1 = null;

	/** 第 15 List変数： l_START_TIME1 */
	public List l_START_TIME1 = null;

	/** 第 16 List変数： l_END_TIME1 */
	public List l_END_TIME1 = null;

	/** 第 17 List変数： l_OPR_TYP1 */
	public List l_OPR_TYP1 = null;

	/** 第 18 List変数： l_UN_OPR_CAUSE_TYP1 */
	public List l_UN_OPR_CAUSE_TYP1 = null;

	/** 第 19 List変数： l_UN_OPR_TIME1 */
	public List l_UN_OPR_TIME1 = null;

	/** 第 20 List変数： l_REMARKS1 */
	public List l_REMARKS1 = null;

	/** 第 21 List変数： l_WS_CD2 */
	public List l_WS_CD2 = null;

	/** 第 22 List変数： l_START_TIME2 */
	public List l_START_TIME2 = null;

	/** 第 23 List変数： l_END_TIME2 */
	public List l_END_TIME2 = null;

	/** 第 24 List変数： l_OPR_TYP2 */
	public List l_OPR_TYP2 = null;

	/** 第 25 List変数： l_UN_OPR_CAUSE_TYP2 */
	public List l_UN_OPR_CAUSE_TYP2 = null;

	/** 第 26 List変数： l_UN_OPR_TIME2 */
	public List l_UN_OPR_TIME2 = null;

	/** 第 27 List変数： l_REMARKS2 */
	public List l_REMARKS2 = null;

	/** 第 28 List変数： l_WS_CD3 */
	public List l_WS_CD3 = null;

	/** 第 29 List変数： l_START_TIME3 */
	public List l_START_TIME3 = null;

	/** 第 30 List変数： l_END_TIME3 */
	public List l_END_TIME3 = null;

	/** 第 31 List変数： l_OPR_TYP3 */
	public List l_OPR_TYP3 = null;

	/** 第 32 List変数： l_UN_OPR_CAUSE_TYP3 */
	public List l_UN_OPR_CAUSE_TYP3 = null;

	/** 第 33 List変数： l_UN_OPR_TIME3 */
	public List l_UN_OPR_TIME3 = null;

	/** 第 34 List変数： l_REMARKS3 */
	public List l_REMARKS3 = null;

	/** 第 35 List変数： l_WS_CD4 */
	public List l_WS_CD4 = null;

	/** 第 36 List変数： l_START_TIME4 */
	public List l_START_TIME4 = null;

	/** 第 37 List変数： l_END_TIME4 */
	public List l_END_TIME4 = null;

	/** 第 38 List変数： l_OPR_TYP4 */
	public List l_OPR_TYP4 = null;

	/** 第 39 List変数： l_UN_OPR_CAUSE_TYP4 */
	public List l_UN_OPR_CAUSE_TYP4 = null;

	/** 第 40 List変数： l_UN_OPR_TIME4 */
	public List l_UN_OPR_TIME4 = null;

	/** 第 41 List変数： l_REMARKS4 */
	public List l_REMARKS4 = null;

	/** 第 42 List変数： l_WS_CD5 */
	public List l_WS_CD5 = null;

	/** 第 43 List変数： l_START_TIME5 */
	public List l_START_TIME5 = null;

	/** 第 44 List変数： l_END_TIME5 */
	public List l_END_TIME5 = null;

	/** 第 45 List変数： l_OPR_TYP5 */
	public List l_OPR_TYP5 = null;

	/** 第 46 List変数： l_UN_OPR_CAUSE_TYP5 */
	public List l_UN_OPR_CAUSE_TYP5 = null;

	/** 第 47 List変数： l_UN_OPR_TIME5 */
	public List l_UN_OPR_TIME5 = null;

	/** 第 48 List変数： l_REMARKS5 */
	public List l_REMARKS5 = null;

	/** 第 49 List変数： l_w_COLUMN_FLG */
	public List l_w_COLUMN_FLG = null;

	/** 第 50 List変数： l_OPR_TYP6 */
	public List l_OPR_TYP6 = null;

	/** 第 51 List変数： l_UN_OPR_CAUSE_TYP6 */
	public List l_UN_OPR_CAUSE_TYP6 = null;

	/** 第 52 List変数： l_UN_OPR_TIME6 */
	public List l_UN_OPR_TIME6 = null;

	/** 第 53 List変数： l_REMARKS6 */
	public List l_REMARKS6 = null;

	/** 第 54 List変数： l_DAILY_WORK_REPORT_DATA_TYP_NULL */
	public List l_DAILY_WORK_REPORT_DATA_TYP_NULL = null;

	/** 第 55 List変数： l_OPR_TIME2 */
	public List l_OPR_TIME2 = null;

	/** 第 56 List変数： l_OPR_TIME3 */
	public List l_OPR_TIME3 = null;

	/** 第 57 List変数： l_OPR_TIME4 */
	public List l_OPR_TIME4 = null;

	/** 第 58 List変数： l_OPR_TIME5 */
	public List l_OPR_TIME5 = null;

	/** 第 59 List変数： l_DAILY_WORK_REPORT_CTL_NO */
	public List l_DAILY_WORK_REPORT_CTL_NO = null;

	/** 第 60 List変数： l_SEQ_NO */
	public List l_SEQ_NO = null;

	/** 第 61 List変数： l_PLANT_CD */
	public List l_PLANT_CD = null;

	/** 第 62 List変数： l_DAILY_WORK_REPORT_TYP */
	public List l_DAILY_WORK_REPORT_TYP = null;

	/** 第 63 List変数： l_USER_CD */
	public List l_USER_CD = null;

	/** 第 64 List変数： l_OPR_DATE */
	public List l_OPR_DATE = null;

	/** 第 65 List変数： l_WORK_SHIFT_CODE */
	public List l_WORK_SHIFT_CODE = null;

	/** 第 66 List変数： l_WS_CD */
	public List l_WS_CD = null;

	/** 第 67 List変数： l_START_TIME */
	public List l_START_TIME = null;

	/** 第 68 List変数： l_END_TIME */
	public List l_END_TIME = null;

	/** 第 69 List変数： l_OPR_TIME */
	public List l_OPR_TIME = null;

	/** 第 70 List変数： l_OPR_TYP */
	public List l_OPR_TYP = null;

	/** 第 71 List変数： l_UN_OPR_CAUSE_TYP */
	public List l_UN_OPR_CAUSE_TYP = null;

	/** 第 72 List変数： l_UN_OPR_TIME */
	public List l_UN_OPR_TIME = null;

	/** 第 73 List変数： l_REMARKS */
	public List l_REMARKS = null;

	/** 第 74 List変数： l_COUNT */
	public List l_COUNT = null;

	/** 第 75 List変数： l_TIME_FLG1 */
	public List l_TIME_FLG1 = null;

	/** 第 76 List変数： l_USER_CD2 */
	public List l_USER_CD2 = null;

	/** 第 77 List変数： l_OPR_DATE2 */
	public List l_OPR_DATE2 = null;

	/** 第 78 List変数： l_TIME_FLG2 */
	public List l_TIME_FLG2 = null;

	/** 第 79 List変数： l_START_TIME6 */
	public List l_START_TIME6 = null;

	/** 第 80 List変数： l_END_TIME6 */
	public List l_END_TIME6 = null;

	/** 第 81 List変数： l_HOLIDAY_FLG */
	public List l_HOLIDAY_FLG = null;

	/** 第 82 List変数： l_OPR_DATE3 */
	public List l_OPR_DATE3 = null;

	/** 第 83 List変数： l_PLANT_CD2 */
	public List l_PLANT_CD2 = null;

	/** 第 84 List変数： l_WORK_SHIFT_CODE3 */
	public List l_WORK_SHIFT_CODE3 = null;

	/** 第 85 List変数： l_OPR_INST_CD */
	public List l_OPR_INST_CD = null;

	/** 第 86 List変数： l_WS_CD6 */
	public List l_WS_CD6 = null;

	/** 第 87 List変数： l_TARGET_PLANT_CD */
	public List l_TARGET_PLANT_CD = null;

	/** 第 88 List変数： l_TARGET_ITEM_NO */
	public List l_TARGET_ITEM_NO = null;

	/** 第 89 List変数： l_TOTAL_OPR_TIME */
	public List l_TOTAL_OPR_TIME = null;

	/** 第 90 List変数： l_PVC2LOGMODE */
	public List l_PVC2LOGMODE = null;

	/** 第 91 List変数： l_PVC2OUTPUTMODE */
	public List l_PVC2OUTPUTMODE = null;

	/** 第 92 List変数： l_PVC2OUTPUTPATH */
	public List l_PVC2OUTPUTPATH = null;

	/** 第 93 List変数： l_PVC2OUTPUTNAME */
	public List l_PVC2OUTPUTNAME = null;

	/** 第 94 List変数： l_PVC2USERID */
	public List l_PVC2USERID = null;

	/** 第 95 List変数： l_PVC2BUSINESSNAME */
	public List l_PVC2BUSINESSNAME = null;

	/** 第 96 List変数： l_PVC2PLANTCD */
	public List l_PVC2PLANTCD = null;

	/** 第 97 List変数： l_RETURN_MESSAGE */
	public List l_RETURN_MESSAGE = null;

	/** 第 98 List変数： l_RETURN_STATUS */
	public List l_RETURN_STATUS = null;


	//////////////////////////////

	// mediator変数用(get|set)メソッド

	public String getFileName() { return m_FileName; }
	public String getDOWNLOAD_FILE() { return m_DOWNLOAD_FILE; }
	public String getl_ERROR_IN() { return m_l_ERROR_IN; }
	public String getl_ERR_INFO() { return m_l_ERR_INFO; }
	public String getl_ERR_CTR_NM() { return m_l_ERR_CTR_NM; }
	public String getl_ERR_PLANT_NO() { return m_l_ERR_PLANT_NO; }
	public String getl_ERR_DAILY_WORK_REPORT_TYP() { return m_l_ERR_DAILY_WORK_REPORT_TYP; }
	public String getl_ERR_USER_CD() { return m_l_ERR_USER_CD; }
	public String getl_ERR_OPR_DATE() { return m_l_ERR_OPR_DATE; }
	public String getl_ERR_WORK_SHIFT_CODE() { return m_l_ERR_WORK_SHIFT_CODE; }
	public String getl_ERR_WS_CD() { return m_l_ERR_WS_CD; }
	public String getl_ERR_TYP() { return m_l_ERR_TYP; }
	public String getWORK_SHIFT_CODE2() { return m_WORK_SHIFT_CODE2; }
	public String getWS_CD1() { return m_WS_CD1; }
	public String getSTART_TIME1() { return m_START_TIME1; }
	public String getEND_TIME1() { return m_END_TIME1; }
	public String getOPR_TYP1() { return m_OPR_TYP1; }
	public String getUN_OPR_CAUSE_TYP1() { return m_UN_OPR_CAUSE_TYP1; }
	public String getUN_OPR_TIME1() { return m_UN_OPR_TIME1; }
	public String getREMARKS1() { return m_REMARKS1; }
	public String getWS_CD2() { return m_WS_CD2; }
	public String getSTART_TIME2() { return m_START_TIME2; }
	public String getEND_TIME2() { return m_END_TIME2; }
	public String getOPR_TYP2() { return m_OPR_TYP2; }
	public String getUN_OPR_CAUSE_TYP2() { return m_UN_OPR_CAUSE_TYP2; }
	public String getUN_OPR_TIME2() { return m_UN_OPR_TIME2; }
	public String getREMARKS2() { return m_REMARKS2; }
	public String getWS_CD3() { return m_WS_CD3; }
	public String getSTART_TIME3() { return m_START_TIME3; }
	public String getEND_TIME3() { return m_END_TIME3; }
	public String getOPR_TYP3() { return m_OPR_TYP3; }
	public String getUN_OPR_CAUSE_TYP3() { return m_UN_OPR_CAUSE_TYP3; }
	public String getUN_OPR_TIME3() { return m_UN_OPR_TIME3; }
	public String getREMARKS3() { return m_REMARKS3; }
	public String getWS_CD4() { return m_WS_CD4; }
	public String getSTART_TIME4() { return m_START_TIME4; }
	public String getEND_TIME4() { return m_END_TIME4; }
	public String getOPR_TYP4() { return m_OPR_TYP4; }
	public String getUN_OPR_CAUSE_TYP4() { return m_UN_OPR_CAUSE_TYP4; }
	public String getUN_OPR_TIME4() { return m_UN_OPR_TIME4; }
	public String getREMARKS4() { return m_REMARKS4; }
	public String getWS_CD5() { return m_WS_CD5; }
	public String getSTART_TIME5() { return m_START_TIME5; }
	public String getEND_TIME5() { return m_END_TIME5; }
	public String getOPR_TYP5() { return m_OPR_TYP5; }
	public String getUN_OPR_CAUSE_TYP5() { return m_UN_OPR_CAUSE_TYP5; }
	public String getUN_OPR_TIME5() { return m_UN_OPR_TIME5; }
	public String getREMARKS5() { return m_REMARKS5; }
	public String getw_COLUMN_FLG() { return m_w_COLUMN_FLG; }
	public String getOPR_TYP6() { return m_OPR_TYP6; }
	public String getUN_OPR_CAUSE_TYP6() { return m_UN_OPR_CAUSE_TYP6; }
	public String getUN_OPR_TIME6() { return m_UN_OPR_TIME6; }
	public String getREMARKS6() { return m_REMARKS6; }
	public String getDAILY_WORK_REPORT_DATA_TYP_NULL() { return m_DAILY_WORK_REPORT_DATA_TYP_NULL; }
	public String getOPR_TIME2() { return m_OPR_TIME2; }
	public String getOPR_TIME3() { return m_OPR_TIME3; }
	public String getOPR_TIME4() { return m_OPR_TIME4; }
	public String getOPR_TIME5() { return m_OPR_TIME5; }
	public String getDAILY_WORK_REPORT_CTL_NO() { return m_DAILY_WORK_REPORT_CTL_NO; }
	public String getSEQ_NO() { return m_SEQ_NO; }
	public String getPLANT_CD() { return m_PLANT_CD; }
	public String getDAILY_WORK_REPORT_TYP() { return m_DAILY_WORK_REPORT_TYP; }
	public String getUSER_CD() { return m_USER_CD; }
	public String getOPR_DATE() { return m_OPR_DATE; }
	public String getWORK_SHIFT_CODE() { return m_WORK_SHIFT_CODE; }
	public String getWS_CD() { return m_WS_CD; }
	public String getSTART_TIME() { return m_START_TIME; }
	public String getEND_TIME() { return m_END_TIME; }
	public String getOPR_TIME() { return m_OPR_TIME; }
	public String getOPR_TYP() { return m_OPR_TYP; }
	public String getUN_OPR_CAUSE_TYP() { return m_UN_OPR_CAUSE_TYP; }
	public String getUN_OPR_TIME() { return m_UN_OPR_TIME; }
	public String getREMARKS() { return m_REMARKS; }
	public String getCOUNT() { return m_COUNT; }
	public String getTIME_FLG1() { return m_TIME_FLG1; }
	public String getUSER_CD2() { return m_USER_CD2; }
	public String getOPR_DATE2() { return m_OPR_DATE2; }
	public String getTIME_FLG2() { return m_TIME_FLG2; }
	public String getSTART_TIME6() { return m_START_TIME6; }
	public String getEND_TIME6() { return m_END_TIME6; }
	public String getHOLIDAY_FLG() { return m_HOLIDAY_FLG; }
	public String getOPR_DATE3() { return m_OPR_DATE3; }
	public String getPLANT_CD2() { return m_PLANT_CD2; }
	public String getWORK_SHIFT_CODE3() { return m_WORK_SHIFT_CODE3; }
	public String getOPR_INST_CD() { return m_OPR_INST_CD; }
	public String getWS_CD6() { return m_WS_CD6; }
	public String getTARGET_PLANT_CD() { return m_TARGET_PLANT_CD; }
	public String getTARGET_ITEM_NO() { return m_TARGET_ITEM_NO; }
	public String getTOTAL_OPR_TIME() { return m_TOTAL_OPR_TIME; }
	public String getPVC2LOGMODE() { return m_PVC2LOGMODE; }
	public String getPVC2OUTPUTMODE() { return m_PVC2OUTPUTMODE; }
	public String getPVC2OUTPUTPATH() { return m_PVC2OUTPUTPATH; }
	public String getPVC2OUTPUTNAME() { return m_PVC2OUTPUTNAME; }
	public String getPVC2USERID() { return m_PVC2USERID; }
	public String getPVC2BUSINESSNAME() { return m_PVC2BUSINESSNAME; }
	public String getPVC2PLANTCD() { return m_PVC2PLANTCD; }
	public String getRETURN_MESSAGE() { return m_RETURN_MESSAGE; }
	public String getRETURN_STATUS() { return m_RETURN_STATUS; }

	public List getList_FileName() { return l_FileName; }
	public List getList_DOWNLOAD_FILE() { return l_DOWNLOAD_FILE; }
	public List getList_l_ERROR_IN() { return l_l_ERROR_IN; }
	public List getList_l_ERR_INFO() { return l_l_ERR_INFO; }
	public List getList_l_ERR_CTR_NM() { return l_l_ERR_CTR_NM; }
	public List getList_l_ERR_PLANT_NO() { return l_l_ERR_PLANT_NO; }
	public List getList_l_ERR_DAILY_WORK_REPORT_TYP() { return l_l_ERR_DAILY_WORK_REPORT_TYP; }
	public List getList_l_ERR_USER_CD() { return l_l_ERR_USER_CD; }
	public List getList_l_ERR_OPR_DATE() { return l_l_ERR_OPR_DATE; }
	public List getList_l_ERR_WORK_SHIFT_CODE() { return l_l_ERR_WORK_SHIFT_CODE; }
	public List getList_l_ERR_WS_CD() { return l_l_ERR_WS_CD; }
	public List getList_l_ERR_TYP() { return l_l_ERR_TYP; }
	public List getList_WORK_SHIFT_CODE2() { return l_WORK_SHIFT_CODE2; }
	public List getList_WS_CD1() { return l_WS_CD1; }
	public List getList_START_TIME1() { return l_START_TIME1; }
	public List getList_END_TIME1() { return l_END_TIME1; }
	public List getList_OPR_TYP1() { return l_OPR_TYP1; }
	public List getList_UN_OPR_CAUSE_TYP1() { return l_UN_OPR_CAUSE_TYP1; }
	public List getList_UN_OPR_TIME1() { return l_UN_OPR_TIME1; }
	public List getList_REMARKS1() { return l_REMARKS1; }
	public List getList_WS_CD2() { return l_WS_CD2; }
	public List getList_START_TIME2() { return l_START_TIME2; }
	public List getList_END_TIME2() { return l_END_TIME2; }
	public List getList_OPR_TYP2() { return l_OPR_TYP2; }
	public List getList_UN_OPR_CAUSE_TYP2() { return l_UN_OPR_CAUSE_TYP2; }
	public List getList_UN_OPR_TIME2() { return l_UN_OPR_TIME2; }
	public List getList_REMARKS2() { return l_REMARKS2; }
	public List getList_WS_CD3() { return l_WS_CD3; }
	public List getList_START_TIME3() { return l_START_TIME3; }
	public List getList_END_TIME3() { return l_END_TIME3; }
	public List getList_OPR_TYP3() { return l_OPR_TYP3; }
	public List getList_UN_OPR_CAUSE_TYP3() { return l_UN_OPR_CAUSE_TYP3; }
	public List getList_UN_OPR_TIME3() { return l_UN_OPR_TIME3; }
	public List getList_REMARKS3() { return l_REMARKS3; }
	public List getList_WS_CD4() { return l_WS_CD4; }
	public List getList_START_TIME4() { return l_START_TIME4; }
	public List getList_END_TIME4() { return l_END_TIME4; }
	public List getList_OPR_TYP4() { return l_OPR_TYP4; }
	public List getList_UN_OPR_CAUSE_TYP4() { return l_UN_OPR_CAUSE_TYP4; }
	public List getList_UN_OPR_TIME4() { return l_UN_OPR_TIME4; }
	public List getList_REMARKS4() { return l_REMARKS4; }
	public List getList_WS_CD5() { return l_WS_CD5; }
	public List getList_START_TIME5() { return l_START_TIME5; }
	public List getList_END_TIME5() { return l_END_TIME5; }
	public List getList_OPR_TYP5() { return l_OPR_TYP5; }
	public List getList_UN_OPR_CAUSE_TYP5() { return l_UN_OPR_CAUSE_TYP5; }
	public List getList_UN_OPR_TIME5() { return l_UN_OPR_TIME5; }
	public List getList_REMARKS5() { return l_REMARKS5; }
	public List getList_w_COLUMN_FLG() { return l_w_COLUMN_FLG; }
	public List getList_OPR_TYP6() { return l_OPR_TYP6; }
	public List getList_UN_OPR_CAUSE_TYP6() { return l_UN_OPR_CAUSE_TYP6; }
	public List getList_UN_OPR_TIME6() { return l_UN_OPR_TIME6; }
	public List getList_REMARKS6() { return l_REMARKS6; }
	public List getList_DAILY_WORK_REPORT_DATA_TYP_NULL() { return l_DAILY_WORK_REPORT_DATA_TYP_NULL; }
	public List getList_OPR_TIME2() { return l_OPR_TIME2; }
	public List getList_OPR_TIME3() { return l_OPR_TIME3; }
	public List getList_OPR_TIME4() { return l_OPR_TIME4; }
	public List getList_OPR_TIME5() { return l_OPR_TIME5; }
	public List getList_DAILY_WORK_REPORT_CTL_NO() { return l_DAILY_WORK_REPORT_CTL_NO; }
	public List getList_SEQ_NO() { return l_SEQ_NO; }
	public List getList_PLANT_CD() { return l_PLANT_CD; }
	public List getList_DAILY_WORK_REPORT_TYP() { return l_DAILY_WORK_REPORT_TYP; }
	public List getList_USER_CD() { return l_USER_CD; }
	public List getList_OPR_DATE() { return l_OPR_DATE; }
	public List getList_WORK_SHIFT_CODE() { return l_WORK_SHIFT_CODE; }
	public List getList_WS_CD() { return l_WS_CD; }
	public List getList_START_TIME() { return l_START_TIME; }
	public List getList_END_TIME() { return l_END_TIME; }
	public List getList_OPR_TIME() { return l_OPR_TIME; }
	public List getList_OPR_TYP() { return l_OPR_TYP; }
	public List getList_UN_OPR_CAUSE_TYP() { return l_UN_OPR_CAUSE_TYP; }
	public List getList_UN_OPR_TIME() { return l_UN_OPR_TIME; }
	public List getList_REMARKS() { return l_REMARKS; }
	public List getList_COUNT() { return l_COUNT; }
	public List getList_TIME_FLG1() { return l_TIME_FLG1; }
	public List getList_USER_CD2() { return l_USER_CD2; }
	public List getList_OPR_DATE2() { return l_OPR_DATE2; }
	public List getList_TIME_FLG2() { return l_TIME_FLG2; }
	public List getList_START_TIME6() { return l_START_TIME6; }
	public List getList_END_TIME6() { return l_END_TIME6; }
	public List getList_HOLIDAY_FLG() { return l_HOLIDAY_FLG; }
	public List getList_OPR_DATE3() { return l_OPR_DATE3; }
	public List getList_PLANT_CD2() { return l_PLANT_CD2; }
	public List getList_WORK_SHIFT_CODE3() { return l_WORK_SHIFT_CODE3; }
	public List getList_OPR_INST_CD() { return l_OPR_INST_CD; }
	public List getList_WS_CD6() { return l_WS_CD6; }
	public List getList_TARGET_PLANT_CD() { return l_TARGET_PLANT_CD; }
	public List getList_TARGET_ITEM_NO() { return l_TARGET_ITEM_NO; }
	public List getList_TOTAL_OPR_TIME() { return l_TOTAL_OPR_TIME; }
	public List getList_PVC2LOGMODE() { return l_PVC2LOGMODE; }
	public List getList_PVC2OUTPUTMODE() { return l_PVC2OUTPUTMODE; }
	public List getList_PVC2OUTPUTPATH() { return l_PVC2OUTPUTPATH; }
	public List getList_PVC2OUTPUTNAME() { return l_PVC2OUTPUTNAME; }
	public List getList_PVC2USERID() { return l_PVC2USERID; }
	public List getList_PVC2BUSINESSNAME() { return l_PVC2BUSINESSNAME; }
	public List getList_PVC2PLANTCD() { return l_PVC2PLANTCD; }
	public List getList_RETURN_MESSAGE() { return l_RETURN_MESSAGE; }
	public List getList_RETURN_STATUS() { return l_RETURN_STATUS; }

	public void setFileName(String val) { m_FileName = val; }
	public void setDOWNLOAD_FILE(String val) { m_DOWNLOAD_FILE = val; }
	public void setl_ERROR_IN(String val) { m_l_ERROR_IN = val; }
	public void setl_ERR_INFO(String val) { m_l_ERR_INFO = val; }
	public void setl_ERR_CTR_NM(String val) { m_l_ERR_CTR_NM = val; }
	public void setl_ERR_PLANT_NO(String val) { m_l_ERR_PLANT_NO = val; }
	public void setl_ERR_DAILY_WORK_REPORT_TYP(String val) { m_l_ERR_DAILY_WORK_REPORT_TYP = val; }
	public void setl_ERR_USER_CD(String val) { m_l_ERR_USER_CD = val; }
	public void setl_ERR_OPR_DATE(String val) { m_l_ERR_OPR_DATE = val; }
	public void setl_ERR_WORK_SHIFT_CODE(String val) { m_l_ERR_WORK_SHIFT_CODE = val; }
	public void setl_ERR_WS_CD(String val) { m_l_ERR_WS_CD = val; }
	public void setl_ERR_TYP(String val) { m_l_ERR_TYP = val; }
	public void setWORK_SHIFT_CODE2(String val) { m_WORK_SHIFT_CODE2 = val; }
	public void setWS_CD1(String val) { m_WS_CD1 = val; }
	public void setSTART_TIME1(String val) { m_START_TIME1 = val; }
	public void setEND_TIME1(String val) { m_END_TIME1 = val; }
	public void setOPR_TYP1(String val) { m_OPR_TYP1 = val; }
	public void setUN_OPR_CAUSE_TYP1(String val) { m_UN_OPR_CAUSE_TYP1 = val; }
	public void setUN_OPR_TIME1(String val) { m_UN_OPR_TIME1 = val; }
	public void setREMARKS1(String val) { m_REMARKS1 = val; }
	public void setWS_CD2(String val) { m_WS_CD2 = val; }
	public void setSTART_TIME2(String val) { m_START_TIME2 = val; }
	public void setEND_TIME2(String val) { m_END_TIME2 = val; }
	public void setOPR_TYP2(String val) { m_OPR_TYP2 = val; }
	public void setUN_OPR_CAUSE_TYP2(String val) { m_UN_OPR_CAUSE_TYP2 = val; }
	public void setUN_OPR_TIME2(String val) { m_UN_OPR_TIME2 = val; }
	public void setREMARKS2(String val) { m_REMARKS2 = val; }
	public void setWS_CD3(String val) { m_WS_CD3 = val; }
	public void setSTART_TIME3(String val) { m_START_TIME3 = val; }
	public void setEND_TIME3(String val) { m_END_TIME3 = val; }
	public void setOPR_TYP3(String val) { m_OPR_TYP3 = val; }
	public void setUN_OPR_CAUSE_TYP3(String val) { m_UN_OPR_CAUSE_TYP3 = val; }
	public void setUN_OPR_TIME3(String val) { m_UN_OPR_TIME3 = val; }
	public void setREMARKS3(String val) { m_REMARKS3 = val; }
	public void setWS_CD4(String val) { m_WS_CD4 = val; }
	public void setSTART_TIME4(String val) { m_START_TIME4 = val; }
	public void setEND_TIME4(String val) { m_END_TIME4 = val; }
	public void setOPR_TYP4(String val) { m_OPR_TYP4 = val; }
	public void setUN_OPR_CAUSE_TYP4(String val) { m_UN_OPR_CAUSE_TYP4 = val; }
	public void setUN_OPR_TIME4(String val) { m_UN_OPR_TIME4 = val; }
	public void setREMARKS4(String val) { m_REMARKS4 = val; }
	public void setWS_CD5(String val) { m_WS_CD5 = val; }
	public void setSTART_TIME5(String val) { m_START_TIME5 = val; }
	public void setEND_TIME5(String val) { m_END_TIME5 = val; }
	public void setOPR_TYP5(String val) { m_OPR_TYP5 = val; }
	public void setUN_OPR_CAUSE_TYP5(String val) { m_UN_OPR_CAUSE_TYP5 = val; }
	public void setUN_OPR_TIME5(String val) { m_UN_OPR_TIME5 = val; }
	public void setREMARKS5(String val) { m_REMARKS5 = val; }
	public void setw_COLUMN_FLG(String val) { m_w_COLUMN_FLG = val; }
	public void setOPR_TYP6(String val) { m_OPR_TYP6 = val; }
	public void setUN_OPR_CAUSE_TYP6(String val) { m_UN_OPR_CAUSE_TYP6 = val; }
	public void setUN_OPR_TIME6(String val) { m_UN_OPR_TIME6 = val; }
	public void setREMARKS6(String val) { m_REMARKS6 = val; }
	public void setDAILY_WORK_REPORT_DATA_TYP_NULL(String val) { m_DAILY_WORK_REPORT_DATA_TYP_NULL = val; }
	public void setOPR_TIME2(String val) { m_OPR_TIME2 = val; }
	public void setOPR_TIME3(String val) { m_OPR_TIME3 = val; }
	public void setOPR_TIME4(String val) { m_OPR_TIME4 = val; }
	public void setOPR_TIME5(String val) { m_OPR_TIME5 = val; }
	public void setDAILY_WORK_REPORT_CTL_NO(String val) { m_DAILY_WORK_REPORT_CTL_NO = val; }
	public void setSEQ_NO(String val) { m_SEQ_NO = val; }
	public void setPLANT_CD(String val) { m_PLANT_CD = val; }
	public void setDAILY_WORK_REPORT_TYP(String val) { m_DAILY_WORK_REPORT_TYP = val; }
	public void setUSER_CD(String val) { m_USER_CD = val; }
	public void setOPR_DATE(String val) { m_OPR_DATE = val; }
	public void setWORK_SHIFT_CODE(String val) { m_WORK_SHIFT_CODE = val; }
	public void setWS_CD(String val) { m_WS_CD = val; }
	public void setSTART_TIME(String val) { m_START_TIME = val; }
	public void setEND_TIME(String val) { m_END_TIME = val; }
	public void setOPR_TIME(String val) { m_OPR_TIME = val; }
	public void setOPR_TYP(String val) { m_OPR_TYP = val; }
	public void setUN_OPR_CAUSE_TYP(String val) { m_UN_OPR_CAUSE_TYP = val; }
	public void setUN_OPR_TIME(String val) { m_UN_OPR_TIME = val; }
	public void setREMARKS(String val) { m_REMARKS = val; }
	public void setCOUNT(String val) { m_COUNT = val; }
	public void setTIME_FLG1(String val) { m_TIME_FLG1 = val; }
	public void setUSER_CD2(String val) { m_USER_CD2 = val; }
	public void setOPR_DATE2(String val) { m_OPR_DATE2 = val; }
	public void setTIME_FLG2(String val) { m_TIME_FLG2 = val; }
	public void setSTART_TIME6(String val) { m_START_TIME6 = val; }
	public void setEND_TIME6(String val) { m_END_TIME6 = val; }
	public void setHOLIDAY_FLG(String val) { m_HOLIDAY_FLG = val; }
	public void setOPR_DATE3(String val) { m_OPR_DATE3 = val; }
	public void setPLANT_CD2(String val) { m_PLANT_CD2 = val; }
	public void setWORK_SHIFT_CODE3(String val) { m_WORK_SHIFT_CODE3 = val; }
	public void setOPR_INST_CD(String val) { m_OPR_INST_CD = val; }
	public void setWS_CD6(String val) { m_WS_CD6 = val; }
	public void setTARGET_PLANT_CD(String val) { m_TARGET_PLANT_CD = val; }
	public void setTARGET_ITEM_NO(String val) { m_TARGET_ITEM_NO = val; }
	public void setTOTAL_OPR_TIME(String val) { m_TOTAL_OPR_TIME = val; }
	public void setPVC2LOGMODE(String val) { m_PVC2LOGMODE = val; }
	public void setPVC2OUTPUTMODE(String val) { m_PVC2OUTPUTMODE = val; }
	public void setPVC2OUTPUTPATH(String val) { m_PVC2OUTPUTPATH = val; }
	public void setPVC2OUTPUTNAME(String val) { m_PVC2OUTPUTNAME = val; }
	public void setPVC2USERID(String val) { m_PVC2USERID = val; }
	public void setPVC2BUSINESSNAME(String val) { m_PVC2BUSINESSNAME = val; }
	public void setPVC2PLANTCD(String val) { m_PVC2PLANTCD = val; }
	public void setRETURN_MESSAGE(String val) { m_RETURN_MESSAGE = val; }
	public void setRETURN_STATUS(String val) { m_RETURN_STATUS = val; }


	public void setList_FileName(List list) { l_FileName = list; }
	public void setList_DOWNLOAD_FILE(List list) { l_DOWNLOAD_FILE = list; }
	public void setList_l_ERROR_IN(List list) { l_l_ERROR_IN = list; }
	public void setList_l_ERR_INFO(List list) { l_l_ERR_INFO = list; }
	public void setList_l_ERR_CTR_NM(List list) { l_l_ERR_CTR_NM = list; }
	public void setList_l_ERR_PLANT_NO(List list) { l_l_ERR_PLANT_NO = list; }
	public void setList_l_ERR_DAILY_WORK_REPORT_TYP(List list) { l_l_ERR_DAILY_WORK_REPORT_TYP = list; }
	public void setList_l_ERR_USER_CD(List list) { l_l_ERR_USER_CD = list; }
	public void setList_l_ERR_OPR_DATE(List list) { l_l_ERR_OPR_DATE = list; }
	public void setList_l_ERR_WORK_SHIFT_CODE(List list) { l_l_ERR_WORK_SHIFT_CODE = list; }
	public void setList_l_ERR_WS_CD(List list) { l_l_ERR_WS_CD = list; }
	public void setList_l_ERR_TYP(List list) { l_l_ERR_TYP = list; }
	public void setList_WORK_SHIFT_CODE2(List list) { l_WORK_SHIFT_CODE2 = list; }
	public void setList_WS_CD1(List list) { l_WS_CD1 = list; }
	public void setList_START_TIME1(List list) { l_START_TIME1 = list; }
	public void setList_END_TIME1(List list) { l_END_TIME1 = list; }
	public void setList_OPR_TYP1(List list) { l_OPR_TYP1 = list; }
	public void setList_UN_OPR_CAUSE_TYP1(List list) { l_UN_OPR_CAUSE_TYP1 = list; }
	public void setList_UN_OPR_TIME1(List list) { l_UN_OPR_TIME1 = list; }
	public void setList_REMARKS1(List list) { l_REMARKS1 = list; }
	public void setList_WS_CD2(List list) { l_WS_CD2 = list; }
	public void setList_START_TIME2(List list) { l_START_TIME2 = list; }
	public void setList_END_TIME2(List list) { l_END_TIME2 = list; }
	public void setList_OPR_TYP2(List list) { l_OPR_TYP2 = list; }
	public void setList_UN_OPR_CAUSE_TYP2(List list) { l_UN_OPR_CAUSE_TYP2 = list; }
	public void setList_UN_OPR_TIME2(List list) { l_UN_OPR_TIME2 = list; }
	public void setList_REMARKS2(List list) { l_REMARKS2 = list; }
	public void setList_WS_CD3(List list) { l_WS_CD3 = list; }
	public void setList_START_TIME3(List list) { l_START_TIME3 = list; }
	public void setList_END_TIME3(List list) { l_END_TIME3 = list; }
	public void setList_OPR_TYP3(List list) { l_OPR_TYP3 = list; }
	public void setList_UN_OPR_CAUSE_TYP3(List list) { l_UN_OPR_CAUSE_TYP3 = list; }
	public void setList_UN_OPR_TIME3(List list) { l_UN_OPR_TIME3 = list; }
	public void setList_REMARKS3(List list) { l_REMARKS3 = list; }
	public void setList_WS_CD4(List list) { l_WS_CD4 = list; }
	public void setList_START_TIME4(List list) { l_START_TIME4 = list; }
	public void setList_END_TIME4(List list) { l_END_TIME4 = list; }
	public void setList_OPR_TYP4(List list) { l_OPR_TYP4 = list; }
	public void setList_UN_OPR_CAUSE_TYP4(List list) { l_UN_OPR_CAUSE_TYP4 = list; }
	public void setList_UN_OPR_TIME4(List list) { l_UN_OPR_TIME4 = list; }
	public void setList_REMARKS4(List list) { l_REMARKS4 = list; }
	public void setList_WS_CD5(List list) { l_WS_CD5 = list; }
	public void setList_START_TIME5(List list) { l_START_TIME5 = list; }
	public void setList_END_TIME5(List list) { l_END_TIME5 = list; }
	public void setList_OPR_TYP5(List list) { l_OPR_TYP5 = list; }
	public void setList_UN_OPR_CAUSE_TYP5(List list) { l_UN_OPR_CAUSE_TYP5 = list; }
	public void setList_UN_OPR_TIME5(List list) { l_UN_OPR_TIME5 = list; }
	public void setList_REMARKS5(List list) { l_REMARKS5 = list; }
	public void setList_w_COLUMN_FLG(List list) { l_w_COLUMN_FLG = list; }
	public void setList_OPR_TYP6(List list) { l_OPR_TYP6 = list; }
	public void setList_UN_OPR_CAUSE_TYP6(List list) { l_UN_OPR_CAUSE_TYP6 = list; }
	public void setList_UN_OPR_TIME6(List list) { l_UN_OPR_TIME6 = list; }
	public void setList_REMARKS6(List list) { l_REMARKS6 = list; }
	public void setList_DAILY_WORK_REPORT_DATA_TYP_NULL(List list) { l_DAILY_WORK_REPORT_DATA_TYP_NULL = list; }
	public void setList_OPR_TIME2(List list) { l_OPR_TIME2 = list; }
	public void setList_OPR_TIME3(List list) { l_OPR_TIME3 = list; }
	public void setList_OPR_TIME4(List list) { l_OPR_TIME4 = list; }
	public void setList_OPR_TIME5(List list) { l_OPR_TIME5 = list; }
	public void setList_DAILY_WORK_REPORT_CTL_NO(List list) { l_DAILY_WORK_REPORT_CTL_NO = list; }
	public void setList_SEQ_NO(List list) { l_SEQ_NO = list; }
	public void setList_PLANT_CD(List list) { l_PLANT_CD = list; }
	public void setList_DAILY_WORK_REPORT_TYP(List list) { l_DAILY_WORK_REPORT_TYP = list; }
	public void setList_USER_CD(List list) { l_USER_CD = list; }
	public void setList_OPR_DATE(List list) { l_OPR_DATE = list; }
	public void setList_WORK_SHIFT_CODE(List list) { l_WORK_SHIFT_CODE = list; }
	public void setList_WS_CD(List list) { l_WS_CD = list; }
	public void setList_START_TIME(List list) { l_START_TIME = list; }
	public void setList_END_TIME(List list) { l_END_TIME = list; }
	public void setList_OPR_TIME(List list) { l_OPR_TIME = list; }
	public void setList_OPR_TYP(List list) { l_OPR_TYP = list; }
	public void setList_UN_OPR_CAUSE_TYP(List list) { l_UN_OPR_CAUSE_TYP = list; }
	public void setList_UN_OPR_TIME(List list) { l_UN_OPR_TIME = list; }
	public void setList_REMARKS(List list) { l_REMARKS = list; }
	public void setList_COUNT(List list) { l_COUNT = list; }
	public void setList_TIME_FLG1(List list) { l_TIME_FLG1 = list; }
	public void setList_USER_CD2(List list) { l_USER_CD2 = list; }
	public void setList_OPR_DATE2(List list) { l_OPR_DATE2 = list; }
	public void setList_TIME_FLG2(List list) { l_TIME_FLG2 = list; }
	public void setList_START_TIME6(List list) { l_START_TIME6 = list; }
	public void setList_END_TIME6(List list) { l_END_TIME6 = list; }
	public void setList_HOLIDAY_FLG(List list) { l_HOLIDAY_FLG = list; }
	public void setList_OPR_DATE3(List list) { l_OPR_DATE3 = list; }
	public void setList_PLANT_CD2(List list) { l_PLANT_CD2 = list; }
	public void setList_WORK_SHIFT_CODE3(List list) { l_WORK_SHIFT_CODE3 = list; }
	public void setList_OPR_INST_CD(List list) { l_OPR_INST_CD = list; }
	public void setList_WS_CD6(List list) { l_WS_CD6 = list; }
	public void setList_TARGET_PLANT_CD(List list) { l_TARGET_PLANT_CD = list; }
	public void setList_TARGET_ITEM_NO(List list) { l_TARGET_ITEM_NO = list; }
	public void setList_TOTAL_OPR_TIME(List list) { l_TOTAL_OPR_TIME = list; }
	public void setList_PVC2LOGMODE(List list) { l_PVC2LOGMODE = list; }
	public void setList_PVC2OUTPUTMODE(List list) { l_PVC2OUTPUTMODE = list; }
	public void setList_PVC2OUTPUTPATH(List list) { l_PVC2OUTPUTPATH = list; }
	public void setList_PVC2OUTPUTNAME(List list) { l_PVC2OUTPUTNAME = list; }
	public void setList_PVC2USERID(List list) { l_PVC2USERID = list; }
	public void setList_PVC2BUSINESSNAME(List list) { l_PVC2BUSINESSNAME = list; }
	public void setList_PVC2PLANTCD(List list) { l_PVC2PLANTCD = list; }
	public void setList_RETURN_MESSAGE(List list) { l_RETURN_MESSAGE = list; }
	public void setList_RETURN_STATUS(List list) { l_RETURN_STATUS = list; }

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
			l_FileName.add(((AD0140010Struct) list.get(i)).getFileName());
		}
		return size;
	}
	public int setL2L_DOWNLOAD_FILE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DOWNLOAD_FILE == null) {
			l_DOWNLOAD_FILE = new ArrayList();
		} else {
			l_DOWNLOAD_FILE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DOWNLOAD_FILE.add(((AD0140010Struct) list.get(i)).getDOWNLOAD_FILE());
		}
		return size;
	}
	public int setL2L_l_ERROR_IN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ERROR_IN == null) {
			l_l_ERROR_IN = new ArrayList();
		} else {
			l_l_ERROR_IN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ERROR_IN.add(((AD0140010Struct) list.get(i)).getl_ERROR_IN());
		}
		return size;
	}
	public int setL2L_l_ERR_INFO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ERR_INFO == null) {
			l_l_ERR_INFO = new ArrayList();
		} else {
			l_l_ERR_INFO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ERR_INFO.add(((AD0140010Struct) list.get(i)).getl_ERR_INFO());
		}
		return size;
	}
	public int setL2L_l_ERR_CTR_NM(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ERR_CTR_NM == null) {
			l_l_ERR_CTR_NM = new ArrayList();
		} else {
			l_l_ERR_CTR_NM.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ERR_CTR_NM.add(((AD0140010Struct) list.get(i)).getl_ERR_CTR_NM());
		}
		return size;
	}
	public int setL2L_l_ERR_PLANT_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ERR_PLANT_NO == null) {
			l_l_ERR_PLANT_NO = new ArrayList();
		} else {
			l_l_ERR_PLANT_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ERR_PLANT_NO.add(((AD0140010Struct) list.get(i)).getl_ERR_PLANT_NO());
		}
		return size;
	}
	public int setL2L_l_ERR_DAILY_WORK_REPORT_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ERR_DAILY_WORK_REPORT_TYP == null) {
			l_l_ERR_DAILY_WORK_REPORT_TYP = new ArrayList();
		} else {
			l_l_ERR_DAILY_WORK_REPORT_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ERR_DAILY_WORK_REPORT_TYP.add(((AD0140010Struct) list.get(i)).getl_ERR_DAILY_WORK_REPORT_TYP());
		}
		return size;
	}
	public int setL2L_l_ERR_USER_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ERR_USER_CD == null) {
			l_l_ERR_USER_CD = new ArrayList();
		} else {
			l_l_ERR_USER_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ERR_USER_CD.add(((AD0140010Struct) list.get(i)).getl_ERR_USER_CD());
		}
		return size;
	}
	public int setL2L_l_ERR_OPR_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ERR_OPR_DATE == null) {
			l_l_ERR_OPR_DATE = new ArrayList();
		} else {
			l_l_ERR_OPR_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ERR_OPR_DATE.add(((AD0140010Struct) list.get(i)).getl_ERR_OPR_DATE());
		}
		return size;
	}
	public int setL2L_l_ERR_WORK_SHIFT_CODE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ERR_WORK_SHIFT_CODE == null) {
			l_l_ERR_WORK_SHIFT_CODE = new ArrayList();
		} else {
			l_l_ERR_WORK_SHIFT_CODE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ERR_WORK_SHIFT_CODE.add(((AD0140010Struct) list.get(i)).getl_ERR_WORK_SHIFT_CODE());
		}
		return size;
	}
	public int setL2L_l_ERR_WS_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ERR_WS_CD == null) {
			l_l_ERR_WS_CD = new ArrayList();
		} else {
			l_l_ERR_WS_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ERR_WS_CD.add(((AD0140010Struct) list.get(i)).getl_ERR_WS_CD());
		}
		return size;
	}
	public int setL2L_l_ERR_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ERR_TYP == null) {
			l_l_ERR_TYP = new ArrayList();
		} else {
			l_l_ERR_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ERR_TYP.add(((AD0140010Struct) list.get(i)).getl_ERR_TYP());
		}
		return size;
	}
	public int setL2L_WORK_SHIFT_CODE2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_WORK_SHIFT_CODE2 == null) {
			l_WORK_SHIFT_CODE2 = new ArrayList();
		} else {
			l_WORK_SHIFT_CODE2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_WORK_SHIFT_CODE2.add(((AD0140010Struct) list.get(i)).getWORK_SHIFT_CODE2());
		}
		return size;
	}
	public int setL2L_WS_CD1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_WS_CD1 == null) {
			l_WS_CD1 = new ArrayList();
		} else {
			l_WS_CD1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_WS_CD1.add(((AD0140010Struct) list.get(i)).getWS_CD1());
		}
		return size;
	}
	public int setL2L_START_TIME1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_START_TIME1 == null) {
			l_START_TIME1 = new ArrayList();
		} else {
			l_START_TIME1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_START_TIME1.add(((AD0140010Struct) list.get(i)).getSTART_TIME1());
		}
		return size;
	}
	public int setL2L_END_TIME1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_END_TIME1 == null) {
			l_END_TIME1 = new ArrayList();
		} else {
			l_END_TIME1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_END_TIME1.add(((AD0140010Struct) list.get(i)).getEND_TIME1());
		}
		return size;
	}
	public int setL2L_OPR_TYP1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OPR_TYP1 == null) {
			l_OPR_TYP1 = new ArrayList();
		} else {
			l_OPR_TYP1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OPR_TYP1.add(((AD0140010Struct) list.get(i)).getOPR_TYP1());
		}
		return size;
	}
	public int setL2L_UN_OPR_CAUSE_TYP1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UN_OPR_CAUSE_TYP1 == null) {
			l_UN_OPR_CAUSE_TYP1 = new ArrayList();
		} else {
			l_UN_OPR_CAUSE_TYP1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UN_OPR_CAUSE_TYP1.add(((AD0140010Struct) list.get(i)).getUN_OPR_CAUSE_TYP1());
		}
		return size;
	}
	public int setL2L_UN_OPR_TIME1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UN_OPR_TIME1 == null) {
			l_UN_OPR_TIME1 = new ArrayList();
		} else {
			l_UN_OPR_TIME1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UN_OPR_TIME1.add(((AD0140010Struct) list.get(i)).getUN_OPR_TIME1());
		}
		return size;
	}
	public int setL2L_REMARKS1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_REMARKS1 == null) {
			l_REMARKS1 = new ArrayList();
		} else {
			l_REMARKS1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_REMARKS1.add(((AD0140010Struct) list.get(i)).getREMARKS1());
		}
		return size;
	}
	public int setL2L_WS_CD2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_WS_CD2 == null) {
			l_WS_CD2 = new ArrayList();
		} else {
			l_WS_CD2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_WS_CD2.add(((AD0140010Struct) list.get(i)).getWS_CD2());
		}
		return size;
	}
	public int setL2L_START_TIME2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_START_TIME2 == null) {
			l_START_TIME2 = new ArrayList();
		} else {
			l_START_TIME2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_START_TIME2.add(((AD0140010Struct) list.get(i)).getSTART_TIME2());
		}
		return size;
	}
	public int setL2L_END_TIME2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_END_TIME2 == null) {
			l_END_TIME2 = new ArrayList();
		} else {
			l_END_TIME2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_END_TIME2.add(((AD0140010Struct) list.get(i)).getEND_TIME2());
		}
		return size;
	}
	public int setL2L_OPR_TYP2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OPR_TYP2 == null) {
			l_OPR_TYP2 = new ArrayList();
		} else {
			l_OPR_TYP2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OPR_TYP2.add(((AD0140010Struct) list.get(i)).getOPR_TYP2());
		}
		return size;
	}
	public int setL2L_UN_OPR_CAUSE_TYP2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UN_OPR_CAUSE_TYP2 == null) {
			l_UN_OPR_CAUSE_TYP2 = new ArrayList();
		} else {
			l_UN_OPR_CAUSE_TYP2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UN_OPR_CAUSE_TYP2.add(((AD0140010Struct) list.get(i)).getUN_OPR_CAUSE_TYP2());
		}
		return size;
	}
	public int setL2L_UN_OPR_TIME2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UN_OPR_TIME2 == null) {
			l_UN_OPR_TIME2 = new ArrayList();
		} else {
			l_UN_OPR_TIME2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UN_OPR_TIME2.add(((AD0140010Struct) list.get(i)).getUN_OPR_TIME2());
		}
		return size;
	}
	public int setL2L_REMARKS2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_REMARKS2 == null) {
			l_REMARKS2 = new ArrayList();
		} else {
			l_REMARKS2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_REMARKS2.add(((AD0140010Struct) list.get(i)).getREMARKS2());
		}
		return size;
	}
	public int setL2L_WS_CD3(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_WS_CD3 == null) {
			l_WS_CD3 = new ArrayList();
		} else {
			l_WS_CD3.clear();
		}
		for (int i = 0; i < size; i++) {
			l_WS_CD3.add(((AD0140010Struct) list.get(i)).getWS_CD3());
		}
		return size;
	}
	public int setL2L_START_TIME3(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_START_TIME3 == null) {
			l_START_TIME3 = new ArrayList();
		} else {
			l_START_TIME3.clear();
		}
		for (int i = 0; i < size; i++) {
			l_START_TIME3.add(((AD0140010Struct) list.get(i)).getSTART_TIME3());
		}
		return size;
	}
	public int setL2L_END_TIME3(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_END_TIME3 == null) {
			l_END_TIME3 = new ArrayList();
		} else {
			l_END_TIME3.clear();
		}
		for (int i = 0; i < size; i++) {
			l_END_TIME3.add(((AD0140010Struct) list.get(i)).getEND_TIME3());
		}
		return size;
	}
	public int setL2L_OPR_TYP3(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OPR_TYP3 == null) {
			l_OPR_TYP3 = new ArrayList();
		} else {
			l_OPR_TYP3.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OPR_TYP3.add(((AD0140010Struct) list.get(i)).getOPR_TYP3());
		}
		return size;
	}
	public int setL2L_UN_OPR_CAUSE_TYP3(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UN_OPR_CAUSE_TYP3 == null) {
			l_UN_OPR_CAUSE_TYP3 = new ArrayList();
		} else {
			l_UN_OPR_CAUSE_TYP3.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UN_OPR_CAUSE_TYP3.add(((AD0140010Struct) list.get(i)).getUN_OPR_CAUSE_TYP3());
		}
		return size;
	}
	public int setL2L_UN_OPR_TIME3(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UN_OPR_TIME3 == null) {
			l_UN_OPR_TIME3 = new ArrayList();
		} else {
			l_UN_OPR_TIME3.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UN_OPR_TIME3.add(((AD0140010Struct) list.get(i)).getUN_OPR_TIME3());
		}
		return size;
	}
	public int setL2L_REMARKS3(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_REMARKS3 == null) {
			l_REMARKS3 = new ArrayList();
		} else {
			l_REMARKS3.clear();
		}
		for (int i = 0; i < size; i++) {
			l_REMARKS3.add(((AD0140010Struct) list.get(i)).getREMARKS3());
		}
		return size;
	}
	public int setL2L_WS_CD4(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_WS_CD4 == null) {
			l_WS_CD4 = new ArrayList();
		} else {
			l_WS_CD4.clear();
		}
		for (int i = 0; i < size; i++) {
			l_WS_CD4.add(((AD0140010Struct) list.get(i)).getWS_CD4());
		}
		return size;
	}
	public int setL2L_START_TIME4(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_START_TIME4 == null) {
			l_START_TIME4 = new ArrayList();
		} else {
			l_START_TIME4.clear();
		}
		for (int i = 0; i < size; i++) {
			l_START_TIME4.add(((AD0140010Struct) list.get(i)).getSTART_TIME4());
		}
		return size;
	}
	public int setL2L_END_TIME4(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_END_TIME4 == null) {
			l_END_TIME4 = new ArrayList();
		} else {
			l_END_TIME4.clear();
		}
		for (int i = 0; i < size; i++) {
			l_END_TIME4.add(((AD0140010Struct) list.get(i)).getEND_TIME4());
		}
		return size;
	}
	public int setL2L_OPR_TYP4(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OPR_TYP4 == null) {
			l_OPR_TYP4 = new ArrayList();
		} else {
			l_OPR_TYP4.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OPR_TYP4.add(((AD0140010Struct) list.get(i)).getOPR_TYP4());
		}
		return size;
	}
	public int setL2L_UN_OPR_CAUSE_TYP4(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UN_OPR_CAUSE_TYP4 == null) {
			l_UN_OPR_CAUSE_TYP4 = new ArrayList();
		} else {
			l_UN_OPR_CAUSE_TYP4.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UN_OPR_CAUSE_TYP4.add(((AD0140010Struct) list.get(i)).getUN_OPR_CAUSE_TYP4());
		}
		return size;
	}
	public int setL2L_UN_OPR_TIME4(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UN_OPR_TIME4 == null) {
			l_UN_OPR_TIME4 = new ArrayList();
		} else {
			l_UN_OPR_TIME4.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UN_OPR_TIME4.add(((AD0140010Struct) list.get(i)).getUN_OPR_TIME4());
		}
		return size;
	}
	public int setL2L_REMARKS4(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_REMARKS4 == null) {
			l_REMARKS4 = new ArrayList();
		} else {
			l_REMARKS4.clear();
		}
		for (int i = 0; i < size; i++) {
			l_REMARKS4.add(((AD0140010Struct) list.get(i)).getREMARKS4());
		}
		return size;
	}
	public int setL2L_WS_CD5(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_WS_CD5 == null) {
			l_WS_CD5 = new ArrayList();
		} else {
			l_WS_CD5.clear();
		}
		for (int i = 0; i < size; i++) {
			l_WS_CD5.add(((AD0140010Struct) list.get(i)).getWS_CD5());
		}
		return size;
	}
	public int setL2L_START_TIME5(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_START_TIME5 == null) {
			l_START_TIME5 = new ArrayList();
		} else {
			l_START_TIME5.clear();
		}
		for (int i = 0; i < size; i++) {
			l_START_TIME5.add(((AD0140010Struct) list.get(i)).getSTART_TIME5());
		}
		return size;
	}
	public int setL2L_END_TIME5(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_END_TIME5 == null) {
			l_END_TIME5 = new ArrayList();
		} else {
			l_END_TIME5.clear();
		}
		for (int i = 0; i < size; i++) {
			l_END_TIME5.add(((AD0140010Struct) list.get(i)).getEND_TIME5());
		}
		return size;
	}
	public int setL2L_OPR_TYP5(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OPR_TYP5 == null) {
			l_OPR_TYP5 = new ArrayList();
		} else {
			l_OPR_TYP5.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OPR_TYP5.add(((AD0140010Struct) list.get(i)).getOPR_TYP5());
		}
		return size;
	}
	public int setL2L_UN_OPR_CAUSE_TYP5(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UN_OPR_CAUSE_TYP5 == null) {
			l_UN_OPR_CAUSE_TYP5 = new ArrayList();
		} else {
			l_UN_OPR_CAUSE_TYP5.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UN_OPR_CAUSE_TYP5.add(((AD0140010Struct) list.get(i)).getUN_OPR_CAUSE_TYP5());
		}
		return size;
	}
	public int setL2L_UN_OPR_TIME5(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UN_OPR_TIME5 == null) {
			l_UN_OPR_TIME5 = new ArrayList();
		} else {
			l_UN_OPR_TIME5.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UN_OPR_TIME5.add(((AD0140010Struct) list.get(i)).getUN_OPR_TIME5());
		}
		return size;
	}
	public int setL2L_REMARKS5(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_REMARKS5 == null) {
			l_REMARKS5 = new ArrayList();
		} else {
			l_REMARKS5.clear();
		}
		for (int i = 0; i < size; i++) {
			l_REMARKS5.add(((AD0140010Struct) list.get(i)).getREMARKS5());
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
			l_w_COLUMN_FLG.add(((AD0140010Struct) list.get(i)).getw_COLUMN_FLG());
		}
		return size;
	}
	public int setL2L_OPR_TYP6(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OPR_TYP6 == null) {
			l_OPR_TYP6 = new ArrayList();
		} else {
			l_OPR_TYP6.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OPR_TYP6.add(((AD0140010Struct) list.get(i)).getOPR_TYP6());
		}
		return size;
	}
	public int setL2L_UN_OPR_CAUSE_TYP6(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UN_OPR_CAUSE_TYP6 == null) {
			l_UN_OPR_CAUSE_TYP6 = new ArrayList();
		} else {
			l_UN_OPR_CAUSE_TYP6.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UN_OPR_CAUSE_TYP6.add(((AD0140010Struct) list.get(i)).getUN_OPR_CAUSE_TYP6());
		}
		return size;
	}
	public int setL2L_UN_OPR_TIME6(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UN_OPR_TIME6 == null) {
			l_UN_OPR_TIME6 = new ArrayList();
		} else {
			l_UN_OPR_TIME6.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UN_OPR_TIME6.add(((AD0140010Struct) list.get(i)).getUN_OPR_TIME6());
		}
		return size;
	}
	public int setL2L_REMARKS6(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_REMARKS6 == null) {
			l_REMARKS6 = new ArrayList();
		} else {
			l_REMARKS6.clear();
		}
		for (int i = 0; i < size; i++) {
			l_REMARKS6.add(((AD0140010Struct) list.get(i)).getREMARKS6());
		}
		return size;
	}
	public int setL2L_DAILY_WORK_REPORT_DATA_TYP_NULL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DAILY_WORK_REPORT_DATA_TYP_NULL == null) {
			l_DAILY_WORK_REPORT_DATA_TYP_NULL = new ArrayList();
		} else {
			l_DAILY_WORK_REPORT_DATA_TYP_NULL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DAILY_WORK_REPORT_DATA_TYP_NULL.add(((AD0140010Struct) list.get(i)).getDAILY_WORK_REPORT_DATA_TYP_NULL());
		}
		return size;
	}
	public int setL2L_OPR_TIME2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OPR_TIME2 == null) {
			l_OPR_TIME2 = new ArrayList();
		} else {
			l_OPR_TIME2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OPR_TIME2.add(((AD0140010Struct) list.get(i)).getOPR_TIME2());
		}
		return size;
	}
	public int setL2L_OPR_TIME3(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OPR_TIME3 == null) {
			l_OPR_TIME3 = new ArrayList();
		} else {
			l_OPR_TIME3.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OPR_TIME3.add(((AD0140010Struct) list.get(i)).getOPR_TIME3());
		}
		return size;
	}
	public int setL2L_OPR_TIME4(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OPR_TIME4 == null) {
			l_OPR_TIME4 = new ArrayList();
		} else {
			l_OPR_TIME4.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OPR_TIME4.add(((AD0140010Struct) list.get(i)).getOPR_TIME4());
		}
		return size;
	}
	public int setL2L_OPR_TIME5(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OPR_TIME5 == null) {
			l_OPR_TIME5 = new ArrayList();
		} else {
			l_OPR_TIME5.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OPR_TIME5.add(((AD0140010Struct) list.get(i)).getOPR_TIME5());
		}
		return size;
	}
	public int setL2L_DAILY_WORK_REPORT_CTL_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DAILY_WORK_REPORT_CTL_NO == null) {
			l_DAILY_WORK_REPORT_CTL_NO = new ArrayList();
		} else {
			l_DAILY_WORK_REPORT_CTL_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DAILY_WORK_REPORT_CTL_NO.add(((AD0140010Struct) list.get(i)).getDAILY_WORK_REPORT_CTL_NO());
		}
		return size;
	}
	public int setL2L_SEQ_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SEQ_NO == null) {
			l_SEQ_NO = new ArrayList();
		} else {
			l_SEQ_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SEQ_NO.add(((AD0140010Struct) list.get(i)).getSEQ_NO());
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
			l_PLANT_CD.add(((AD0140010Struct) list.get(i)).getPLANT_CD());
		}
		return size;
	}
	public int setL2L_DAILY_WORK_REPORT_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DAILY_WORK_REPORT_TYP == null) {
			l_DAILY_WORK_REPORT_TYP = new ArrayList();
		} else {
			l_DAILY_WORK_REPORT_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DAILY_WORK_REPORT_TYP.add(((AD0140010Struct) list.get(i)).getDAILY_WORK_REPORT_TYP());
		}
		return size;
	}
	public int setL2L_USER_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_USER_CD == null) {
			l_USER_CD = new ArrayList();
		} else {
			l_USER_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_USER_CD.add(((AD0140010Struct) list.get(i)).getUSER_CD());
		}
		return size;
	}
	public int setL2L_OPR_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OPR_DATE == null) {
			l_OPR_DATE = new ArrayList();
		} else {
			l_OPR_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OPR_DATE.add(((AD0140010Struct) list.get(i)).getOPR_DATE());
		}
		return size;
	}
	public int setL2L_WORK_SHIFT_CODE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_WORK_SHIFT_CODE == null) {
			l_WORK_SHIFT_CODE = new ArrayList();
		} else {
			l_WORK_SHIFT_CODE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_WORK_SHIFT_CODE.add(((AD0140010Struct) list.get(i)).getWORK_SHIFT_CODE());
		}
		return size;
	}
	public int setL2L_WS_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_WS_CD == null) {
			l_WS_CD = new ArrayList();
		} else {
			l_WS_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_WS_CD.add(((AD0140010Struct) list.get(i)).getWS_CD());
		}
		return size;
	}
	public int setL2L_START_TIME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_START_TIME == null) {
			l_START_TIME = new ArrayList();
		} else {
			l_START_TIME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_START_TIME.add(((AD0140010Struct) list.get(i)).getSTART_TIME());
		}
		return size;
	}
	public int setL2L_END_TIME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_END_TIME == null) {
			l_END_TIME = new ArrayList();
		} else {
			l_END_TIME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_END_TIME.add(((AD0140010Struct) list.get(i)).getEND_TIME());
		}
		return size;
	}
	public int setL2L_OPR_TIME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OPR_TIME == null) {
			l_OPR_TIME = new ArrayList();
		} else {
			l_OPR_TIME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OPR_TIME.add(((AD0140010Struct) list.get(i)).getOPR_TIME());
		}
		return size;
	}
	public int setL2L_OPR_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OPR_TYP == null) {
			l_OPR_TYP = new ArrayList();
		} else {
			l_OPR_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OPR_TYP.add(((AD0140010Struct) list.get(i)).getOPR_TYP());
		}
		return size;
	}
	public int setL2L_UN_OPR_CAUSE_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UN_OPR_CAUSE_TYP == null) {
			l_UN_OPR_CAUSE_TYP = new ArrayList();
		} else {
			l_UN_OPR_CAUSE_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UN_OPR_CAUSE_TYP.add(((AD0140010Struct) list.get(i)).getUN_OPR_CAUSE_TYP());
		}
		return size;
	}
	public int setL2L_UN_OPR_TIME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UN_OPR_TIME == null) {
			l_UN_OPR_TIME = new ArrayList();
		} else {
			l_UN_OPR_TIME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UN_OPR_TIME.add(((AD0140010Struct) list.get(i)).getUN_OPR_TIME());
		}
		return size;
	}
	public int setL2L_REMARKS(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_REMARKS == null) {
			l_REMARKS = new ArrayList();
		} else {
			l_REMARKS.clear();
		}
		for (int i = 0; i < size; i++) {
			l_REMARKS.add(((AD0140010Struct) list.get(i)).getREMARKS());
		}
		return size;
	}
	public int setL2L_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_COUNT == null) {
			l_COUNT = new ArrayList();
		} else {
			l_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_COUNT.add(((AD0140010Struct) list.get(i)).getCOUNT());
		}
		return size;
	}
	public int setL2L_TIME_FLG1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TIME_FLG1 == null) {
			l_TIME_FLG1 = new ArrayList();
		} else {
			l_TIME_FLG1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TIME_FLG1.add(((AD0140010Struct) list.get(i)).getTIME_FLG1());
		}
		return size;
	}
	public int setL2L_USER_CD2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_USER_CD2 == null) {
			l_USER_CD2 = new ArrayList();
		} else {
			l_USER_CD2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_USER_CD2.add(((AD0140010Struct) list.get(i)).getUSER_CD2());
		}
		return size;
	}
	public int setL2L_OPR_DATE2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OPR_DATE2 == null) {
			l_OPR_DATE2 = new ArrayList();
		} else {
			l_OPR_DATE2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OPR_DATE2.add(((AD0140010Struct) list.get(i)).getOPR_DATE2());
		}
		return size;
	}
	public int setL2L_TIME_FLG2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TIME_FLG2 == null) {
			l_TIME_FLG2 = new ArrayList();
		} else {
			l_TIME_FLG2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TIME_FLG2.add(((AD0140010Struct) list.get(i)).getTIME_FLG2());
		}
		return size;
	}
	public int setL2L_START_TIME6(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_START_TIME6 == null) {
			l_START_TIME6 = new ArrayList();
		} else {
			l_START_TIME6.clear();
		}
		for (int i = 0; i < size; i++) {
			l_START_TIME6.add(((AD0140010Struct) list.get(i)).getSTART_TIME6());
		}
		return size;
	}
	public int setL2L_END_TIME6(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_END_TIME6 == null) {
			l_END_TIME6 = new ArrayList();
		} else {
			l_END_TIME6.clear();
		}
		for (int i = 0; i < size; i++) {
			l_END_TIME6.add(((AD0140010Struct) list.get(i)).getEND_TIME6());
		}
		return size;
	}
	public int setL2L_HOLIDAY_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_HOLIDAY_FLG == null) {
			l_HOLIDAY_FLG = new ArrayList();
		} else {
			l_HOLIDAY_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_HOLIDAY_FLG.add(((AD0140010Struct) list.get(i)).getHOLIDAY_FLG());
		}
		return size;
	}
	public int setL2L_OPR_DATE3(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OPR_DATE3 == null) {
			l_OPR_DATE3 = new ArrayList();
		} else {
			l_OPR_DATE3.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OPR_DATE3.add(((AD0140010Struct) list.get(i)).getOPR_DATE3());
		}
		return size;
	}
	public int setL2L_PLANT_CD2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PLANT_CD2 == null) {
			l_PLANT_CD2 = new ArrayList();
		} else {
			l_PLANT_CD2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PLANT_CD2.add(((AD0140010Struct) list.get(i)).getPLANT_CD2());
		}
		return size;
	}
	public int setL2L_WORK_SHIFT_CODE3(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_WORK_SHIFT_CODE3 == null) {
			l_WORK_SHIFT_CODE3 = new ArrayList();
		} else {
			l_WORK_SHIFT_CODE3.clear();
		}
		for (int i = 0; i < size; i++) {
			l_WORK_SHIFT_CODE3.add(((AD0140010Struct) list.get(i)).getWORK_SHIFT_CODE3());
		}
		return size;
	}
	public int setL2L_OPR_INST_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OPR_INST_CD == null) {
			l_OPR_INST_CD = new ArrayList();
		} else {
			l_OPR_INST_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OPR_INST_CD.add(((AD0140010Struct) list.get(i)).getOPR_INST_CD());
		}
		return size;
	}
	public int setL2L_WS_CD6(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_WS_CD6 == null) {
			l_WS_CD6 = new ArrayList();
		} else {
			l_WS_CD6.clear();
		}
		for (int i = 0; i < size; i++) {
			l_WS_CD6.add(((AD0140010Struct) list.get(i)).getWS_CD6());
		}
		return size;
	}
	public int setL2L_TARGET_PLANT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TARGET_PLANT_CD == null) {
			l_TARGET_PLANT_CD = new ArrayList();
		} else {
			l_TARGET_PLANT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TARGET_PLANT_CD.add(((AD0140010Struct) list.get(i)).getTARGET_PLANT_CD());
		}
		return size;
	}
	public int setL2L_TARGET_ITEM_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TARGET_ITEM_NO == null) {
			l_TARGET_ITEM_NO = new ArrayList();
		} else {
			l_TARGET_ITEM_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TARGET_ITEM_NO.add(((AD0140010Struct) list.get(i)).getTARGET_ITEM_NO());
		}
		return size;
	}
	public int setL2L_TOTAL_OPR_TIME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TOTAL_OPR_TIME == null) {
			l_TOTAL_OPR_TIME = new ArrayList();
		} else {
			l_TOTAL_OPR_TIME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TOTAL_OPR_TIME.add(((AD0140010Struct) list.get(i)).getTOTAL_OPR_TIME());
		}
		return size;
	}
	public int setL2L_PVC2LOGMODE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PVC2LOGMODE == null) {
			l_PVC2LOGMODE = new ArrayList();
		} else {
			l_PVC2LOGMODE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PVC2LOGMODE.add(((AD0140010Struct) list.get(i)).getPVC2LOGMODE());
		}
		return size;
	}
	public int setL2L_PVC2OUTPUTMODE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PVC2OUTPUTMODE == null) {
			l_PVC2OUTPUTMODE = new ArrayList();
		} else {
			l_PVC2OUTPUTMODE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PVC2OUTPUTMODE.add(((AD0140010Struct) list.get(i)).getPVC2OUTPUTMODE());
		}
		return size;
	}
	public int setL2L_PVC2OUTPUTPATH(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PVC2OUTPUTPATH == null) {
			l_PVC2OUTPUTPATH = new ArrayList();
		} else {
			l_PVC2OUTPUTPATH.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PVC2OUTPUTPATH.add(((AD0140010Struct) list.get(i)).getPVC2OUTPUTPATH());
		}
		return size;
	}
	public int setL2L_PVC2OUTPUTNAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PVC2OUTPUTNAME == null) {
			l_PVC2OUTPUTNAME = new ArrayList();
		} else {
			l_PVC2OUTPUTNAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PVC2OUTPUTNAME.add(((AD0140010Struct) list.get(i)).getPVC2OUTPUTNAME());
		}
		return size;
	}
	public int setL2L_PVC2USERID(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PVC2USERID == null) {
			l_PVC2USERID = new ArrayList();
		} else {
			l_PVC2USERID.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PVC2USERID.add(((AD0140010Struct) list.get(i)).getPVC2USERID());
		}
		return size;
	}
	public int setL2L_PVC2BUSINESSNAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PVC2BUSINESSNAME == null) {
			l_PVC2BUSINESSNAME = new ArrayList();
		} else {
			l_PVC2BUSINESSNAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PVC2BUSINESSNAME.add(((AD0140010Struct) list.get(i)).getPVC2BUSINESSNAME());
		}
		return size;
	}
	public int setL2L_PVC2PLANTCD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PVC2PLANTCD == null) {
			l_PVC2PLANTCD = new ArrayList();
		} else {
			l_PVC2PLANTCD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PVC2PLANTCD.add(((AD0140010Struct) list.get(i)).getPVC2PLANTCD());
		}
		return size;
	}
	public int setL2L_RETURN_MESSAGE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_RETURN_MESSAGE == null) {
			l_RETURN_MESSAGE = new ArrayList();
		} else {
			l_RETURN_MESSAGE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_RETURN_MESSAGE.add(((AD0140010Struct) list.get(i)).getRETURN_MESSAGE());
		}
		return size;
	}
	public int setL2L_RETURN_STATUS(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_RETURN_STATUS == null) {
			l_RETURN_STATUS = new ArrayList();
		} else {
			l_RETURN_STATUS.clear();
		}
		for (int i = 0; i < size; i++) {
			l_RETURN_STATUS.add(((AD0140010Struct) list.get(i)).getRETURN_STATUS());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_FileName = null;
		m_DOWNLOAD_FILE = null;
		m_l_ERROR_IN = null;
		m_l_ERR_INFO = null;
		m_l_ERR_CTR_NM = null;
		m_l_ERR_PLANT_NO = null;
		m_l_ERR_DAILY_WORK_REPORT_TYP = null;
		m_l_ERR_USER_CD = null;
		m_l_ERR_OPR_DATE = null;
		m_l_ERR_WORK_SHIFT_CODE = null;
		m_l_ERR_WS_CD = null;
		m_l_ERR_TYP = null;
		m_WORK_SHIFT_CODE2 = null;
		m_WS_CD1 = null;
		m_START_TIME1 = null;
		m_END_TIME1 = null;
		m_OPR_TYP1 = null;
		m_UN_OPR_CAUSE_TYP1 = null;
		m_UN_OPR_TIME1 = null;
		m_REMARKS1 = null;
		m_WS_CD2 = null;
		m_START_TIME2 = null;
		m_END_TIME2 = null;
		m_OPR_TYP2 = null;
		m_UN_OPR_CAUSE_TYP2 = null;
		m_UN_OPR_TIME2 = null;
		m_REMARKS2 = null;
		m_WS_CD3 = null;
		m_START_TIME3 = null;
		m_END_TIME3 = null;
		m_OPR_TYP3 = null;
		m_UN_OPR_CAUSE_TYP3 = null;
		m_UN_OPR_TIME3 = null;
		m_REMARKS3 = null;
		m_WS_CD4 = null;
		m_START_TIME4 = null;
		m_END_TIME4 = null;
		m_OPR_TYP4 = null;
		m_UN_OPR_CAUSE_TYP4 = null;
		m_UN_OPR_TIME4 = null;
		m_REMARKS4 = null;
		m_WS_CD5 = null;
		m_START_TIME5 = null;
		m_END_TIME5 = null;
		m_OPR_TYP5 = null;
		m_UN_OPR_CAUSE_TYP5 = null;
		m_UN_OPR_TIME5 = null;
		m_REMARKS5 = null;
		m_w_COLUMN_FLG = null;
		m_OPR_TYP6 = null;
		m_UN_OPR_CAUSE_TYP6 = null;
		m_UN_OPR_TIME6 = null;
		m_REMARKS6 = null;
		m_DAILY_WORK_REPORT_DATA_TYP_NULL = null;
		m_OPR_TIME2 = null;
		m_OPR_TIME3 = null;
		m_OPR_TIME4 = null;
		m_OPR_TIME5 = null;
		m_DAILY_WORK_REPORT_CTL_NO = null;
		m_SEQ_NO = null;
		m_PLANT_CD = null;
		m_DAILY_WORK_REPORT_TYP = null;
		m_USER_CD = null;
		m_OPR_DATE = null;
		m_WORK_SHIFT_CODE = null;
		m_WS_CD = null;
		m_START_TIME = null;
		m_END_TIME = null;
		m_OPR_TIME = null;
		m_OPR_TYP = null;
		m_UN_OPR_CAUSE_TYP = null;
		m_UN_OPR_TIME = null;
		m_REMARKS = null;
		m_COUNT = null;
		m_TIME_FLG1 = null;
		m_USER_CD2 = null;
		m_OPR_DATE2 = null;
		m_TIME_FLG2 = null;
		m_START_TIME6 = null;
		m_END_TIME6 = null;
		m_HOLIDAY_FLG = null;
		m_OPR_DATE3 = null;
		m_PLANT_CD2 = null;
		m_WORK_SHIFT_CODE3 = null;
		m_OPR_INST_CD = null;
		m_WS_CD6 = null;
		m_TARGET_PLANT_CD = null;
		m_TARGET_ITEM_NO = null;
		m_TOTAL_OPR_TIME = null;
		m_PVC2LOGMODE = null;
		m_PVC2OUTPUTMODE = null;
		m_PVC2OUTPUTPATH = null;
		m_PVC2OUTPUTNAME = null;
		m_PVC2USERID = null;
		m_PVC2BUSINESSNAME = null;
		m_PVC2PLANTCD = null;
		m_RETURN_MESSAGE = null;
		m_RETURN_STATUS = null;

		l_FileName = null;
		l_DOWNLOAD_FILE = null;
		l_l_ERROR_IN = null;
		l_l_ERR_INFO = null;
		l_l_ERR_CTR_NM = null;
		l_l_ERR_PLANT_NO = null;
		l_l_ERR_DAILY_WORK_REPORT_TYP = null;
		l_l_ERR_USER_CD = null;
		l_l_ERR_OPR_DATE = null;
		l_l_ERR_WORK_SHIFT_CODE = null;
		l_l_ERR_WS_CD = null;
		l_l_ERR_TYP = null;
		l_WORK_SHIFT_CODE2 = null;
		l_WS_CD1 = null;
		l_START_TIME1 = null;
		l_END_TIME1 = null;
		l_OPR_TYP1 = null;
		l_UN_OPR_CAUSE_TYP1 = null;
		l_UN_OPR_TIME1 = null;
		l_REMARKS1 = null;
		l_WS_CD2 = null;
		l_START_TIME2 = null;
		l_END_TIME2 = null;
		l_OPR_TYP2 = null;
		l_UN_OPR_CAUSE_TYP2 = null;
		l_UN_OPR_TIME2 = null;
		l_REMARKS2 = null;
		l_WS_CD3 = null;
		l_START_TIME3 = null;
		l_END_TIME3 = null;
		l_OPR_TYP3 = null;
		l_UN_OPR_CAUSE_TYP3 = null;
		l_UN_OPR_TIME3 = null;
		l_REMARKS3 = null;
		l_WS_CD4 = null;
		l_START_TIME4 = null;
		l_END_TIME4 = null;
		l_OPR_TYP4 = null;
		l_UN_OPR_CAUSE_TYP4 = null;
		l_UN_OPR_TIME4 = null;
		l_REMARKS4 = null;
		l_WS_CD5 = null;
		l_START_TIME5 = null;
		l_END_TIME5 = null;
		l_OPR_TYP5 = null;
		l_UN_OPR_CAUSE_TYP5 = null;
		l_UN_OPR_TIME5 = null;
		l_REMARKS5 = null;
		l_w_COLUMN_FLG = null;
		l_OPR_TYP6 = null;
		l_UN_OPR_CAUSE_TYP6 = null;
		l_UN_OPR_TIME6 = null;
		l_REMARKS6 = null;
		l_DAILY_WORK_REPORT_DATA_TYP_NULL = null;
		l_OPR_TIME2 = null;
		l_OPR_TIME3 = null;
		l_OPR_TIME4 = null;
		l_OPR_TIME5 = null;
		l_DAILY_WORK_REPORT_CTL_NO = null;
		l_SEQ_NO = null;
		l_PLANT_CD = null;
		l_DAILY_WORK_REPORT_TYP = null;
		l_USER_CD = null;
		l_OPR_DATE = null;
		l_WORK_SHIFT_CODE = null;
		l_WS_CD = null;
		l_START_TIME = null;
		l_END_TIME = null;
		l_OPR_TIME = null;
		l_OPR_TYP = null;
		l_UN_OPR_CAUSE_TYP = null;
		l_UN_OPR_TIME = null;
		l_REMARKS = null;
		l_COUNT = null;
		l_TIME_FLG1 = null;
		l_USER_CD2 = null;
		l_OPR_DATE2 = null;
		l_TIME_FLG2 = null;
		l_START_TIME6 = null;
		l_END_TIME6 = null;
		l_HOLIDAY_FLG = null;
		l_OPR_DATE3 = null;
		l_PLANT_CD2 = null;
		l_WORK_SHIFT_CODE3 = null;
		l_OPR_INST_CD = null;
		l_WS_CD6 = null;
		l_TARGET_PLANT_CD = null;
		l_TARGET_ITEM_NO = null;
		l_TOTAL_OPR_TIME = null;
		l_PVC2LOGMODE = null;
		l_PVC2OUTPUTMODE = null;
		l_PVC2OUTPUTPATH = null;
		l_PVC2OUTPUTNAME = null;
		l_PVC2USERID = null;
		l_PVC2BUSINESSNAME = null;
		l_PVC2PLANTCD = null;
		l_RETURN_MESSAGE = null;
		l_RETURN_STATUS = null;

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
	 * medAD0140010クラスの標準コンストラクタ
	 */
	public AD0140010Struct()
	{
		//{{user_implement_code_constractor
			initialize();
			// TODO: ここに初期処理を記述してください
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
	public void setStruct(AD0140010Struct struct)
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
	public void setStructM(AD0140010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setFileName(struct.getFileName());
			this.setDOWNLOAD_FILE(struct.getDOWNLOAD_FILE());
			this.setl_ERROR_IN(struct.getl_ERROR_IN());
			this.setl_ERR_INFO(struct.getl_ERR_INFO());
			this.setl_ERR_CTR_NM(struct.getl_ERR_CTR_NM());
			this.setl_ERR_PLANT_NO(struct.getl_ERR_PLANT_NO());
			this.setl_ERR_DAILY_WORK_REPORT_TYP(struct.getl_ERR_DAILY_WORK_REPORT_TYP());
			this.setl_ERR_USER_CD(struct.getl_ERR_USER_CD());
			this.setl_ERR_OPR_DATE(struct.getl_ERR_OPR_DATE());
			this.setl_ERR_WORK_SHIFT_CODE(struct.getl_ERR_WORK_SHIFT_CODE());
			this.setl_ERR_WS_CD(struct.getl_ERR_WS_CD());
			this.setl_ERR_TYP(struct.getl_ERR_TYP());
			this.setWORK_SHIFT_CODE2(struct.getWORK_SHIFT_CODE2());
			this.setWS_CD1(struct.getWS_CD1());
			this.setSTART_TIME1(struct.getSTART_TIME1());
			this.setEND_TIME1(struct.getEND_TIME1());
			this.setOPR_TYP1(struct.getOPR_TYP1());
			this.setUN_OPR_CAUSE_TYP1(struct.getUN_OPR_CAUSE_TYP1());
			this.setUN_OPR_TIME1(struct.getUN_OPR_TIME1());
			this.setREMARKS1(struct.getREMARKS1());
			this.setWS_CD2(struct.getWS_CD2());
			this.setSTART_TIME2(struct.getSTART_TIME2());
			this.setEND_TIME2(struct.getEND_TIME2());
			this.setOPR_TYP2(struct.getOPR_TYP2());
			this.setUN_OPR_CAUSE_TYP2(struct.getUN_OPR_CAUSE_TYP2());
			this.setUN_OPR_TIME2(struct.getUN_OPR_TIME2());
			this.setREMARKS2(struct.getREMARKS2());
			this.setWS_CD3(struct.getWS_CD3());
			this.setSTART_TIME3(struct.getSTART_TIME3());
			this.setEND_TIME3(struct.getEND_TIME3());
			this.setOPR_TYP3(struct.getOPR_TYP3());
			this.setUN_OPR_CAUSE_TYP3(struct.getUN_OPR_CAUSE_TYP3());
			this.setUN_OPR_TIME3(struct.getUN_OPR_TIME3());
			this.setREMARKS3(struct.getREMARKS3());
			this.setWS_CD4(struct.getWS_CD4());
			this.setSTART_TIME4(struct.getSTART_TIME4());
			this.setEND_TIME4(struct.getEND_TIME4());
			this.setOPR_TYP4(struct.getOPR_TYP4());
			this.setUN_OPR_CAUSE_TYP4(struct.getUN_OPR_CAUSE_TYP4());
			this.setUN_OPR_TIME4(struct.getUN_OPR_TIME4());
			this.setREMARKS4(struct.getREMARKS4());
			this.setWS_CD5(struct.getWS_CD5());
			this.setSTART_TIME5(struct.getSTART_TIME5());
			this.setEND_TIME5(struct.getEND_TIME5());
			this.setOPR_TYP5(struct.getOPR_TYP5());
			this.setUN_OPR_CAUSE_TYP5(struct.getUN_OPR_CAUSE_TYP5());
			this.setUN_OPR_TIME5(struct.getUN_OPR_TIME5());
			this.setREMARKS5(struct.getREMARKS5());
			this.setw_COLUMN_FLG(struct.getw_COLUMN_FLG());
			this.setOPR_TYP6(struct.getOPR_TYP6());
			this.setUN_OPR_CAUSE_TYP6(struct.getUN_OPR_CAUSE_TYP6());
			this.setUN_OPR_TIME6(struct.getUN_OPR_TIME6());
			this.setREMARKS6(struct.getREMARKS6());
			this.setDAILY_WORK_REPORT_DATA_TYP_NULL(struct.getDAILY_WORK_REPORT_DATA_TYP_NULL());
			this.setOPR_TIME2(struct.getOPR_TIME2());
			this.setOPR_TIME3(struct.getOPR_TIME3());
			this.setOPR_TIME4(struct.getOPR_TIME4());
			this.setOPR_TIME5(struct.getOPR_TIME5());
			this.setDAILY_WORK_REPORT_CTL_NO(struct.getDAILY_WORK_REPORT_CTL_NO());
			this.setSEQ_NO(struct.getSEQ_NO());
			this.setPLANT_CD(struct.getPLANT_CD());
			this.setDAILY_WORK_REPORT_TYP(struct.getDAILY_WORK_REPORT_TYP());
			this.setUSER_CD(struct.getUSER_CD());
			this.setOPR_DATE(struct.getOPR_DATE());
			this.setWORK_SHIFT_CODE(struct.getWORK_SHIFT_CODE());
			this.setWS_CD(struct.getWS_CD());
			this.setSTART_TIME(struct.getSTART_TIME());
			this.setEND_TIME(struct.getEND_TIME());
			this.setOPR_TIME(struct.getOPR_TIME());
			this.setOPR_TYP(struct.getOPR_TYP());
			this.setUN_OPR_CAUSE_TYP(struct.getUN_OPR_CAUSE_TYP());
			this.setUN_OPR_TIME(struct.getUN_OPR_TIME());
			this.setREMARKS(struct.getREMARKS());
			this.setCOUNT(struct.getCOUNT());
			this.setTIME_FLG1(struct.getTIME_FLG1());
			this.setUSER_CD2(struct.getUSER_CD2());
			this.setOPR_DATE2(struct.getOPR_DATE2());
			this.setTIME_FLG2(struct.getTIME_FLG2());
			this.setSTART_TIME6(struct.getSTART_TIME6());
			this.setEND_TIME6(struct.getEND_TIME6());
			this.setHOLIDAY_FLG(struct.getHOLIDAY_FLG());
			this.setOPR_DATE3(struct.getOPR_DATE3());
			this.setPLANT_CD2(struct.getPLANT_CD2());
			this.setWORK_SHIFT_CODE3(struct.getWORK_SHIFT_CODE3());
			this.setOPR_INST_CD(struct.getOPR_INST_CD());
			this.setWS_CD6(struct.getWS_CD6());
			this.setTARGET_PLANT_CD(struct.getTARGET_PLANT_CD());
			this.setTARGET_ITEM_NO(struct.getTARGET_ITEM_NO());
			this.setTOTAL_OPR_TIME(struct.getTOTAL_OPR_TIME());
			this.setPVC2LOGMODE(struct.getPVC2LOGMODE());
			this.setPVC2OUTPUTMODE(struct.getPVC2OUTPUTMODE());
			this.setPVC2OUTPUTPATH(struct.getPVC2OUTPUTPATH());
			this.setPVC2OUTPUTNAME(struct.getPVC2OUTPUTNAME());
			this.setPVC2USERID(struct.getPVC2USERID());
			this.setPVC2BUSINESSNAME(struct.getPVC2BUSINESSNAME());
			this.setPVC2PLANTCD(struct.getPVC2PLANTCD());
			this.setRETURN_MESSAGE(struct.getRETURN_MESSAGE());
			this.setRETURN_STATUS(struct.getRETURN_STATUS());
		}
	}

	/**
	 * データのセット(リストメンバのみ)
	 *
	 * @param struct セットする元のStruct
	 */
	public void setStructL(AD0140010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_FileName(struct.getList_FileName());
			this.setList_DOWNLOAD_FILE(struct.getList_DOWNLOAD_FILE());
			this.setList_l_ERROR_IN(struct.getList_l_ERROR_IN());
			this.setList_l_ERR_INFO(struct.getList_l_ERR_INFO());
			this.setList_l_ERR_CTR_NM(struct.getList_l_ERR_CTR_NM());
			this.setList_l_ERR_PLANT_NO(struct.getList_l_ERR_PLANT_NO());
			this.setList_l_ERR_DAILY_WORK_REPORT_TYP(struct.getList_l_ERR_DAILY_WORK_REPORT_TYP());
			this.setList_l_ERR_USER_CD(struct.getList_l_ERR_USER_CD());
			this.setList_l_ERR_OPR_DATE(struct.getList_l_ERR_OPR_DATE());
			this.setList_l_ERR_WORK_SHIFT_CODE(struct.getList_l_ERR_WORK_SHIFT_CODE());
			this.setList_l_ERR_WS_CD(struct.getList_l_ERR_WS_CD());
			this.setList_l_ERR_TYP(struct.getList_l_ERR_TYP());
			this.setList_WORK_SHIFT_CODE2(struct.getList_WORK_SHIFT_CODE2());
			this.setList_WS_CD1(struct.getList_WS_CD1());
			this.setList_START_TIME1(struct.getList_START_TIME1());
			this.setList_END_TIME1(struct.getList_END_TIME1());
			this.setList_OPR_TYP1(struct.getList_OPR_TYP1());
			this.setList_UN_OPR_CAUSE_TYP1(struct.getList_UN_OPR_CAUSE_TYP1());
			this.setList_UN_OPR_TIME1(struct.getList_UN_OPR_TIME1());
			this.setList_REMARKS1(struct.getList_REMARKS1());
			this.setList_WS_CD2(struct.getList_WS_CD2());
			this.setList_START_TIME2(struct.getList_START_TIME2());
			this.setList_END_TIME2(struct.getList_END_TIME2());
			this.setList_OPR_TYP2(struct.getList_OPR_TYP2());
			this.setList_UN_OPR_CAUSE_TYP2(struct.getList_UN_OPR_CAUSE_TYP2());
			this.setList_UN_OPR_TIME2(struct.getList_UN_OPR_TIME2());
			this.setList_REMARKS2(struct.getList_REMARKS2());
			this.setList_WS_CD3(struct.getList_WS_CD3());
			this.setList_START_TIME3(struct.getList_START_TIME3());
			this.setList_END_TIME3(struct.getList_END_TIME3());
			this.setList_OPR_TYP3(struct.getList_OPR_TYP3());
			this.setList_UN_OPR_CAUSE_TYP3(struct.getList_UN_OPR_CAUSE_TYP3());
			this.setList_UN_OPR_TIME3(struct.getList_UN_OPR_TIME3());
			this.setList_REMARKS3(struct.getList_REMARKS3());
			this.setList_WS_CD4(struct.getList_WS_CD4());
			this.setList_START_TIME4(struct.getList_START_TIME4());
			this.setList_END_TIME4(struct.getList_END_TIME4());
			this.setList_OPR_TYP4(struct.getList_OPR_TYP4());
			this.setList_UN_OPR_CAUSE_TYP4(struct.getList_UN_OPR_CAUSE_TYP4());
			this.setList_UN_OPR_TIME4(struct.getList_UN_OPR_TIME4());
			this.setList_REMARKS4(struct.getList_REMARKS4());
			this.setList_WS_CD5(struct.getList_WS_CD5());
			this.setList_START_TIME5(struct.getList_START_TIME5());
			this.setList_END_TIME5(struct.getList_END_TIME5());
			this.setList_OPR_TYP5(struct.getList_OPR_TYP5());
			this.setList_UN_OPR_CAUSE_TYP5(struct.getList_UN_OPR_CAUSE_TYP5());
			this.setList_UN_OPR_TIME5(struct.getList_UN_OPR_TIME5());
			this.setList_REMARKS5(struct.getList_REMARKS5());
			this.setList_w_COLUMN_FLG(struct.getList_w_COLUMN_FLG());
			this.setList_OPR_TYP6(struct.getList_OPR_TYP6());
			this.setList_UN_OPR_CAUSE_TYP6(struct.getList_UN_OPR_CAUSE_TYP6());
			this.setList_UN_OPR_TIME6(struct.getList_UN_OPR_TIME6());
			this.setList_REMARKS6(struct.getList_REMARKS6());
			this.setList_DAILY_WORK_REPORT_DATA_TYP_NULL(struct.getList_DAILY_WORK_REPORT_DATA_TYP_NULL());
			this.setList_OPR_TIME2(struct.getList_OPR_TIME2());
			this.setList_OPR_TIME3(struct.getList_OPR_TIME3());
			this.setList_OPR_TIME4(struct.getList_OPR_TIME4());
			this.setList_OPR_TIME5(struct.getList_OPR_TIME5());
			this.setList_DAILY_WORK_REPORT_CTL_NO(struct.getList_DAILY_WORK_REPORT_CTL_NO());
			this.setList_SEQ_NO(struct.getList_SEQ_NO());
			this.setList_PLANT_CD(struct.getList_PLANT_CD());
			this.setList_DAILY_WORK_REPORT_TYP(struct.getList_DAILY_WORK_REPORT_TYP());
			this.setList_USER_CD(struct.getList_USER_CD());
			this.setList_OPR_DATE(struct.getList_OPR_DATE());
			this.setList_WORK_SHIFT_CODE(struct.getList_WORK_SHIFT_CODE());
			this.setList_WS_CD(struct.getList_WS_CD());
			this.setList_START_TIME(struct.getList_START_TIME());
			this.setList_END_TIME(struct.getList_END_TIME());
			this.setList_OPR_TIME(struct.getList_OPR_TIME());
			this.setList_OPR_TYP(struct.getList_OPR_TYP());
			this.setList_UN_OPR_CAUSE_TYP(struct.getList_UN_OPR_CAUSE_TYP());
			this.setList_UN_OPR_TIME(struct.getList_UN_OPR_TIME());
			this.setList_REMARKS(struct.getList_REMARKS());
			this.setList_COUNT(struct.getList_COUNT());
			this.setList_TIME_FLG1(struct.getList_TIME_FLG1());
			this.setList_USER_CD2(struct.getList_USER_CD2());
			this.setList_OPR_DATE2(struct.getList_OPR_DATE2());
			this.setList_TIME_FLG2(struct.getList_TIME_FLG2());
			this.setList_START_TIME6(struct.getList_START_TIME6());
			this.setList_END_TIME6(struct.getList_END_TIME6());
			this.setList_HOLIDAY_FLG(struct.getList_HOLIDAY_FLG());
			this.setList_OPR_DATE3(struct.getList_OPR_DATE3());
			this.setList_PLANT_CD2(struct.getList_PLANT_CD2());
			this.setList_WORK_SHIFT_CODE3(struct.getList_WORK_SHIFT_CODE3());
			this.setList_OPR_INST_CD(struct.getList_OPR_INST_CD());
			this.setList_WS_CD6(struct.getList_WS_CD6());
			this.setList_TARGET_PLANT_CD(struct.getList_TARGET_PLANT_CD());
			this.setList_TARGET_ITEM_NO(struct.getList_TARGET_ITEM_NO());
			this.setList_TOTAL_OPR_TIME(struct.getList_TOTAL_OPR_TIME());
			this.setList_PVC2LOGMODE(struct.getList_PVC2LOGMODE());
			this.setList_PVC2OUTPUTMODE(struct.getList_PVC2OUTPUTMODE());
			this.setList_PVC2OUTPUTPATH(struct.getList_PVC2OUTPUTPATH());
			this.setList_PVC2OUTPUTNAME(struct.getList_PVC2OUTPUTNAME());
			this.setList_PVC2USERID(struct.getList_PVC2USERID());
			this.setList_PVC2BUSINESSNAME(struct.getList_PVC2BUSINESSNAME());
			this.setList_PVC2PLANTCD(struct.getList_PVC2PLANTCD());
			this.setList_RETURN_MESSAGE(struct.getList_RETURN_MESSAGE());
			this.setList_RETURN_STATUS(struct.getList_RETURN_STATUS());
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
	// 第 1 変数初期値： i_FileName


	final static String i_FileName = null;

	// 第 2 変数初期値： i_DOWNLOAD_FILE


	final static String i_DOWNLOAD_FILE = null;

	// 第 3 変数初期値： i_l_ERROR_IN


	final static String i_l_ERROR_IN = null;

	// 第 4 変数初期値： i_l_ERR_INFO


	final static String i_l_ERR_INFO = null;

	// 第 5 変数初期値： i_l_ERR_CTR_NM


	final static String i_l_ERR_CTR_NM = null;

	// 第 6 変数初期値： i_l_ERR_PLANT_NO


	final static String i_l_ERR_PLANT_NO = null;

	// 第 7 変数初期値： i_l_ERR_DAILY_WORK_REPORT_TYP


	final static String i_l_ERR_DAILY_WORK_REPORT_TYP = null;

	// 第 8 変数初期値： i_l_ERR_USER_CD


	final static String i_l_ERR_USER_CD = null;

	// 第 9 変数初期値： i_l_ERR_OPR_DATE


	final static String i_l_ERR_OPR_DATE = null;

	// 第 10 変数初期値： i_l_ERR_WORK_SHIFT_CODE


	final static String i_l_ERR_WORK_SHIFT_CODE = null;

	// 第 11 変数初期値： i_l_ERR_WS_CD


	final static String i_l_ERR_WS_CD = null;

	// 第 12 変数初期値： i_l_ERR_TYP


	final static String i_l_ERR_TYP = null;

	// 第 13 変数初期値： i_WORK_SHIFT_CODE2


	final static String i_WORK_SHIFT_CODE2 = null;

	// 第 14 変数初期値： i_WS_CD1


	final static String i_WS_CD1 = null;

	// 第 15 変数初期値： i_START_TIME1


	final static String i_START_TIME1 = null;

	// 第 16 変数初期値： i_END_TIME1


	final static String i_END_TIME1 = null;

	// 第 17 変数初期値： i_OPR_TYP1


	final static String i_OPR_TYP1 = null;

	// 第 18 変数初期値： i_UN_OPR_CAUSE_TYP1


	final static String i_UN_OPR_CAUSE_TYP1 = null;

	// 第 19 変数初期値： i_UN_OPR_TIME1


	final static String i_UN_OPR_TIME1 = null;

	// 第 20 変数初期値： i_REMARKS1


	final static String i_REMARKS1 = null;

	// 第 21 変数初期値： i_WS_CD2


	final static String i_WS_CD2 = null;

	// 第 22 変数初期値： i_START_TIME2


	final static String i_START_TIME2 = null;

	// 第 23 変数初期値： i_END_TIME2


	final static String i_END_TIME2 = null;

	// 第 24 変数初期値： i_OPR_TYP2


	final static String i_OPR_TYP2 = null;

	// 第 25 変数初期値： i_UN_OPR_CAUSE_TYP2


	final static String i_UN_OPR_CAUSE_TYP2 = null;

	// 第 26 変数初期値： i_UN_OPR_TIME2


	final static String i_UN_OPR_TIME2 = null;

	// 第 27 変数初期値： i_REMARKS2


	final static String i_REMARKS2 = null;

	// 第 28 変数初期値： i_WS_CD3


	final static String i_WS_CD3 = null;

	// 第 29 変数初期値： i_START_TIME3


	final static String i_START_TIME3 = null;

	// 第 30 変数初期値： i_END_TIME3


	final static String i_END_TIME3 = null;

	// 第 31 変数初期値： i_OPR_TYP3


	final static String i_OPR_TYP3 = null;

	// 第 32 変数初期値： i_UN_OPR_CAUSE_TYP3


	final static String i_UN_OPR_CAUSE_TYP3 = null;

	// 第 33 変数初期値： i_UN_OPR_TIME3


	final static String i_UN_OPR_TIME3 = null;

	// 第 34 変数初期値： i_REMARKS3


	final static String i_REMARKS3 = null;

	// 第 35 変数初期値： i_WS_CD4


	final static String i_WS_CD4 = null;

	// 第 36 変数初期値： i_START_TIME4


	final static String i_START_TIME4 = null;

	// 第 37 変数初期値： i_END_TIME4


	final static String i_END_TIME4 = null;

	// 第 38 変数初期値： i_OPR_TYP4


	final static String i_OPR_TYP4 = null;

	// 第 39 変数初期値： i_UN_OPR_CAUSE_TYP4


	final static String i_UN_OPR_CAUSE_TYP4 = null;

	// 第 40 変数初期値： i_UN_OPR_TIME4


	final static String i_UN_OPR_TIME4 = null;

	// 第 41 変数初期値： i_REMARKS4


	final static String i_REMARKS4 = null;

	// 第 42 変数初期値： i_WS_CD5


	final static String i_WS_CD5 = null;

	// 第 43 変数初期値： i_START_TIME5


	final static String i_START_TIME5 = null;

	// 第 44 変数初期値： i_END_TIME5


	final static String i_END_TIME5 = null;

	// 第 45 変数初期値： i_OPR_TYP5


	final static String i_OPR_TYP5 = null;

	// 第 46 変数初期値： i_UN_OPR_CAUSE_TYP5


	final static String i_UN_OPR_CAUSE_TYP5 = null;

	// 第 47 変数初期値： i_UN_OPR_TIME5


	final static String i_UN_OPR_TIME5 = null;

	// 第 48 変数初期値： i_REMARKS5


	final static String i_REMARKS5 = null;

	// 第 49 変数初期値： i_w_COLUMN_FLG


	final static String i_w_COLUMN_FLG = null;

	// 第 50 変数初期値： i_OPR_TYP6


	final static String i_OPR_TYP6 = null;

	// 第 51 変数初期値： i_UN_OPR_CAUSE_TYP6


	final static String i_UN_OPR_CAUSE_TYP6 = null;

	// 第 52 変数初期値： i_UN_OPR_TIME6


	final static String i_UN_OPR_TIME6 = null;

	// 第 53 変数初期値： i_REMARKS6


	final static String i_REMARKS6 = null;

	// 第 54 変数初期値： i_DAILY_WORK_REPORT_DATA_TYP_NULL


	final static String i_DAILY_WORK_REPORT_DATA_TYP_NULL = null;

	// 第 55 変数初期値： i_OPR_TIME2


	final static String i_OPR_TIME2 = null;

	// 第 56 変数初期値： i_OPR_TIME3


	final static String i_OPR_TIME3 = null;

	// 第 57 変数初期値： i_OPR_TIME4


	final static String i_OPR_TIME4 = null;

	// 第 58 変数初期値： i_OPR_TIME5


	final static String i_OPR_TIME5 = null;

	// 第 59 変数初期値： i_DAILY_WORK_REPORT_CTL_NO


	final static String i_DAILY_WORK_REPORT_CTL_NO = null;

	// 第 60 変数初期値： i_SEQ_NO


	final static String i_SEQ_NO = null;

	// 第 61 変数初期値： i_PLANT_CD


	final static String i_PLANT_CD = null;

	// 第 62 変数初期値： i_DAILY_WORK_REPORT_TYP


	final static String i_DAILY_WORK_REPORT_TYP = null;

	// 第 63 変数初期値： i_USER_CD


	final static String i_USER_CD = null;

	// 第 64 変数初期値： i_OPR_DATE


	final static String i_OPR_DATE = null;

	// 第 65 変数初期値： i_WORK_SHIFT_CODE


	final static String i_WORK_SHIFT_CODE = null;

	// 第 66 変数初期値： i_WS_CD


	final static String i_WS_CD = null;

	// 第 67 変数初期値： i_START_TIME


	final static String i_START_TIME = null;

	// 第 68 変数初期値： i_END_TIME


	final static String i_END_TIME = null;

	// 第 69 変数初期値： i_OPR_TIME


	final static String i_OPR_TIME = null;

	// 第 70 変数初期値： i_OPR_TYP


	final static String i_OPR_TYP = null;

	// 第 71 変数初期値： i_UN_OPR_CAUSE_TYP


	final static String i_UN_OPR_CAUSE_TYP = null;

	// 第 72 変数初期値： i_UN_OPR_TIME


	final static String i_UN_OPR_TIME = null;

	// 第 73 変数初期値： i_REMARKS


	final static String i_REMARKS = null;

	// 第 74 変数初期値： i_COUNT


	final static String i_COUNT = null;

	// 第 75 変数初期値： i_TIME_FLG1


	final static String i_TIME_FLG1 = null;

	// 第 76 変数初期値： i_USER_CD2


	final static String i_USER_CD2 = null;

	// 第 77 変数初期値： i_OPR_DATE2


	final static String i_OPR_DATE2 = null;

	// 第 78 変数初期値： i_TIME_FLG2


	final static String i_TIME_FLG2 = null;

	// 第 79 変数初期値： i_START_TIME6


	final static String i_START_TIME6 = null;

	// 第 80 変数初期値： i_END_TIME6


	final static String i_END_TIME6 = null;

	// 第 81 変数初期値： i_HOLIDAY_FLG


	final static String i_HOLIDAY_FLG = null;

	// 第 82 変数初期値： i_OPR_DATE3


	final static String i_OPR_DATE3 = null;

	// 第 83 変数初期値： i_PLANT_CD2


	final static String i_PLANT_CD2 = null;

	// 第 84 変数初期値： i_WORK_SHIFT_CODE3


	final static String i_WORK_SHIFT_CODE3 = null;

	// 第 85 変数初期値： i_OPR_INST_CD


	final static String i_OPR_INST_CD = null;

	// 第 86 変数初期値： i_WS_CD6


	final static String i_WS_CD6 = null;

	// 第 87 変数初期値： i_TARGET_PLANT_CD


	final static String i_TARGET_PLANT_CD = null;

	// 第 88 変数初期値： i_TARGET_ITEM_NO


	final static String i_TARGET_ITEM_NO = null;

	// 第 89 変数初期値： i_TOTAL_OPR_TIME


	final static String i_TOTAL_OPR_TIME = null;

	// 第 90 変数初期値： i_PVC2LOGMODE


	final static String i_PVC2LOGMODE = null;

	// 第 91 変数初期値： i_PVC2OUTPUTMODE


	final static String i_PVC2OUTPUTMODE = null;

	// 第 92 変数初期値： i_PVC2OUTPUTPATH


	final static String i_PVC2OUTPUTPATH = null;

	// 第 93 変数初期値： i_PVC2OUTPUTNAME


	final static String i_PVC2OUTPUTNAME = null;

	// 第 94 変数初期値： i_PVC2USERID


	final static String i_PVC2USERID = null;

	// 第 95 変数初期値： i_PVC2BUSINESSNAME


	final static String i_PVC2BUSINESSNAME = null;

	// 第 96 変数初期値： i_PVC2PLANTCD


	final static String i_PVC2PLANTCD = null;

	// 第 97 変数初期値： i_RETURN_MESSAGE


	final static String i_RETURN_MESSAGE = null;

	// 第 98 変数初期値： i_RETURN_STATUS


	final static String i_RETURN_STATUS = null;

*/

	//{{user_implement_code
		// TODO: 初期化で使う定数は、ここに記述してください。
		// 以下に記述した内容は自動的には変更されません。
	// 第 1 変数初期値： i_FileName

	final static String i_FileName = null;

	// 第 2 変数初期値： i_DOWNLOAD_FILE

	final static String i_DOWNLOAD_FILE = null;

	// 第 3 変数初期値： i_DAILY_WORK_REPORT_CTL_NO

	final static String i_DAILY_WORK_REPORT_CTL_NO = null;

	// 第 4 変数初期値： i_SEQ_NO

	final static String i_SEQ_NO = null;

	// 第 5 変数初期値： i_PLANT_CD

	final static String i_PLANT_CD = null;

	// 第 6 変数初期値： i_DAILY_WORK_REPORT_TYP

	final static String i_DAILY_WORK_REPORT_TYP = null;

	// 第 7 変数初期値： i_DAILY_WORK_REPORT_DATA_TYP

	final static String i_DAILY_WORK_REPORT_DATA_TYP = null;

	// 第 8 変数初期値： i_USER_CD

	final static String i_USER_CD = null;

	// 第 9 変数初期値： i_OPR_DATE

	final static String i_OPR_DATE = null;

	// 第 10 変数初期値： i_WORK_SHIFT_CODE

	final static String i_WORK_SHIFT_CODE = null;

	// 第 11 変数初期値： i_WS_CD

	final static String i_WS_CD = null;

	// 第 12 変数初期値： i_START_TIME

	final static String i_START_TIME = null;

	// 第 13 変数初期値： i_END_TIME

	final static String i_END_TIME = null;

	// 第 14 変数初期値： i_OPR_TIME

	final static String i_OPR_TIME = null;

	// 第 15 変数初期値： i_OPR_TYP

	final static String i_OPR_TYP = null;

	// 第 16 変数初期値： i_UN_OPR_CAUSE_TYP

	final static String i_UN_OPR_CAUSE_TYP = null;

	// 第 17 変数初期値： i_UN_OPR_TIME

	final static String i_UN_OPR_TIME = null;

	// 第 18 変数初期値： i_REMARKS

	final static String i_REMARKS = null;

	// 第 19 変数初期値： i_WORKER_QTY

	final static String i_WORKER_QTY = null;

	// 第 20 変数初期値： i_OPR_INST_CD

	final static String i_OPR_INST_CD = null;

	// 第 21 変数初期値： i_PRD_QTY

	final static String i_PRD_QTY = null;

	// 第 22 変数初期値： i_PLAN_GROUP_ORDER

	final static String i_PLAN_GROUP_ORDER = null;

	// 第 23 変数初期値： i_ODR_GROUP_ORDER

	final static String i_ODR_GROUP_ORDER = null;

	// 第 24 変数初期値： i_EQUIPMENT_NO

	final static String i_EQUIPMENT_NO = null;

	// 第 25 変数初期値： i_REPAIR_LINE_MACHINE_NO

	final static String i_REPAIR_LINE_MACHINE_NO = null;

	// 第 26 変数初期値： i_ACCOUNTING_NO

	final static String i_ACCOUNTING_NO = null;

	// 第 27 変数初期値： i_OPR_CLASS_CD

	final static String i_OPR_CLASS_CD = null;

	// 第 28 変数初期値： i_PROC_MACHINE_CD

	final static String i_PROC_MACHINE_CD = null;

	// 第 29 変数初期値： i_TARGET_ITEM_NO

	final static String i_TARGET_ITEM_NO = null;

	// 第 30 変数初期値： i_TARGET_PLANT_CD

	final static String i_TARGET_PLANT_CD = null;

	// 第 31 変数初期値： i_TARGET_LINE_NO

	final static String i_TARGET_LINE_NO = null;

	// 第 32 変数初期値： i_STOP_LOSS_EVENT_TIME

	final static String i_STOP_LOSS_EVENT_TIME = null;

	// 第 33 変数初期値： i_STOP_LOSS_ASS_TIME

	final static String i_STOP_LOSS_ASS_TIME = null;

	// 第 34 変数初期値： i_STOP_LOSS_TPM_TIME

	final static String i_STOP_LOSS_TPM_TIME = null;

	// 第 35 変数初期値： i_STOP_LOSS_REPAIR_TIME

	final static String i_STOP_LOSS_REPAIR_TIME = null;

	// 第 36 変数初期値： i_STOP_LOSS_OTHER_TIME

	final static String i_STOP_LOSS_OTHER_TIME = null;

	// 第 37 変数初期値： i_STOP_LOSS_UN_MASS_PROD_TIME

	final static String i_STOP_LOSS_UN_MASS_PROD_TIME = null;

	// 第 38 変数初期値： i_STOP_LOSS_RESERVE_TIME_1

	final static String i_STOP_LOSS_RESERVE_TIME_1 = null;

	// 第 39 変数初期値： i_STOP_LOSS_RESERVE_TIME_2

	final static String i_STOP_LOSS_RESERVE_TIME_2 = null;

	// 第 40 変数初期値： i_STOP_LOSS_RESERVE_TIME_3

	final static String i_STOP_LOSS_RESERVE_TIME_3 = null;

	// 第 41 変数初期値： i_LINE_LOSS_IMPROVE_TIME

	final static String i_LINE_LOSS_IMPROVE_TIME = null;

	// 第 42 変数初期値： i_LINE_LOSS_ON_HAND_TIME

	final static String i_LINE_LOSS_ON_HAND_TIME = null;

	// 第 43 変数初期値： i_LINE_LOSS_LUBRICATE_TIME

	final static String i_LINE_LOSS_LUBRICATE_TIME = null;

	// 第 44 変数初期値： i_LINE_LOSS_MEETING_TIME

	final static String i_LINE_LOSS_MEETING_TIME = null;

	// 第 45 変数初期値： i_LINE_LOSS_DEFECT_TIME

	final static String i_LINE_LOSS_DEFECT_TIME = null;

	// 第 46 変数初期値： i_LINE_LOSS_SELECT_TIME

	final static String i_LINE_LOSS_SELECT_TIME = null;

	// 第 47 変数初期値： i_LINE_LOSS_ADJUST_TIME

	final static String i_LINE_LOSS_ADJUST_TIME = null;

	// 第 48 変数初期値： i_LINE_LOSS_ADJUST_NO

	final static String i_LINE_LOSS_ADJUST_NO = null;

	// 第 49 変数初期値： i_LINE_LOSS_RESERVE_TIME_1

	final static String i_LINE_LOSS_RESERVE_TIME_1 = null;

	// 第 50 変数初期値： i_LINE_LOSS_RESERVE_TIME_2

	final static String i_LINE_LOSS_RESERVE_TIME_2 = null;

	// 第 51 変数初期値： i_LINE_LOSS_RESERVE_TIME_3

	final static String i_LINE_LOSS_RESERVE_TIME_3 = null;

	// 第 52 変数初期値： i_LINE_LOSS_RESERVE_TIME_4

	final static String i_LINE_LOSS_RESERVE_TIME_4 = null;

	// 第 53 変数初期値： i_EQUIP_LOSS_TROUBLE_TIME

	final static String i_EQUIP_LOSS_TROUBLE_TIME = null;

	// 第 54 変数初期値： i_EQUIP_LOSS_TROUBLE_NO

	final static String i_EQUIP_LOSS_TROUBLE_NO = null;

	// 第 55 変数初期値： i_EQUIP_LOSS_HALT_TIME

	final static String i_EQUIP_LOSS_HALT_TIME = null;

	// 第 56 変数初期値： i_EQUIP_LOSS_HALT_NO

	final static String i_EQUIP_LOSS_HALT_NO = null;

	// 第 57 変数初期値： i_EQUIP_LOSS_ARRANGEMENT_TIME

	final static String i_EQUIP_LOSS_ARRANGEMENT_TIME = null;

	// 第 58 変数初期値： i_EQUIP_LOSS_ARRANGEMENT_NO

	final static String i_EQUIP_LOSS_ARRANGEMENT_NO = null;

	// 第 59 変数初期値： i_EQUIP_LOSS_CHG_TIME

	final static String i_EQUIP_LOSS_CHG_TIME = null;

	// 第 60 変数初期値： i_EQUIP_LOSS_CHG_NO

	final static String i_EQUIP_LOSS_CHG_NO = null;

	// 第 61 変数初期値： i_EQUIP_LOSS_BOOT_TIME

	final static String i_EQUIP_LOSS_BOOT_TIME = null;

	// 第 62 変数初期値： i_EQUIP_LOSS_RESERVE_TIME_1

	final static String i_EQUIP_LOSS_RESERVE_TIME_1 = null;

	// 第 63 変数初期値： i_EQUIP_LOSS_RESERVE_TIME_2

	final static String i_EQUIP_LOSS_RESERVE_TIME_2 = null;

	// 第 64 変数初期値： i_EQUIP_LOSS_RESERVE_TIME_3

	final static String i_EQUIP_LOSS_RESERVE_TIME_3 = null;

	// 第 65 変数初期値： i_EQUIP_LOSS_RESERVE_TIME_4

	final static String i_EQUIP_LOSS_RESERVE_TIME_4 = null;

	// 第 66 変数初期値： i_DIS_LOSS_SEARCH_TIME

	final static String i_DIS_LOSS_SEARCH_TIME = null;

	// 第 67 変数初期値： i_DIS_LOSS_TRANSPORT_TIME

	final static String i_DIS_LOSS_TRANSPORT_TIME = null;

	// 第 68 変数初期値： i_DIS_LOSS_RESERVE_TIME_1

	final static String i_DIS_LOSS_RESERVE_TIME_1 = null;

	// 第 69 変数初期値： i_OPR_LOSS_REPAIR_TIME

	final static String i_OPR_LOSS_REPAIR_TIME = null;

	// 第 70 変数初期値： i_OPR_LOSS_SUPPORT_TIME

	final static String i_OPR_LOSS_SUPPORT_TIME = null;

	// 第 71 変数初期値： i_OPR_LOSS_RESERVE_TIME_1

	final static String i_OPR_LOSS_RESERVE_TIME_1 = null;

	// 第 72 変数初期値： i_LOSS_TIME_REMARKS

	final static String i_LOSS_TIME_REMARKS = null;


	/**
	 * 初期化
	 *
	 */
	public void initialize()
	{

		clear();

		m_FileName = i_FileName;
		m_DOWNLOAD_FILE = i_DOWNLOAD_FILE;
		m_DAILY_WORK_REPORT_CTL_NO = i_DAILY_WORK_REPORT_CTL_NO;
		m_SEQ_NO = i_SEQ_NO;
		m_PLANT_CD = i_PLANT_CD;
		m_DAILY_WORK_REPORT_TYP = i_DAILY_WORK_REPORT_TYP;
//		m_DAILY_WORK_REPORT_DATA_TYP = i_DAILY_WORK_REPORT_DATA_TYP;
		m_USER_CD = i_USER_CD;
		m_OPR_DATE = i_OPR_DATE;
		m_WORK_SHIFT_CODE = i_WORK_SHIFT_CODE;
		m_WS_CD = i_WS_CD;
		m_START_TIME = i_START_TIME;
		m_END_TIME = i_END_TIME;
		m_OPR_TIME = i_OPR_TIME;
		m_OPR_TYP = i_OPR_TYP;
		m_UN_OPR_CAUSE_TYP = i_UN_OPR_CAUSE_TYP;
		m_UN_OPR_TIME = i_UN_OPR_TIME;
		m_REMARKS = i_REMARKS;
//		m_WORKER_QTY = i_WORKER_QTY;
		m_OPR_INST_CD = i_OPR_INST_CD;
//		m_PRD_QTY = i_PRD_QTY;
//		m_PLAN_GROUP_ORDER = i_PLAN_GROUP_ORDER;
//		m_ODR_GROUP_ORDER = i_ODR_GROUP_ORDER;
//		m_EQUIPMENT_NO = i_EQUIPMENT_NO;
//		m_REPAIR_LINE_MACHINE_NO = i_REPAIR_LINE_MACHINE_NO;
//		m_ACCOUNTING_NO = i_ACCOUNTING_NO;
//		m_OPR_CLASS_CD = i_OPR_CLASS_CD;
//		m_PROC_MACHINE_CD = i_PROC_MACHINE_CD;
		m_TARGET_ITEM_NO = i_TARGET_ITEM_NO;
		m_TARGET_PLANT_CD = i_TARGET_PLANT_CD;
//		m_TARGET_LINE_NO = i_TARGET_LINE_NO;
//		m_STOP_LOSS_EVENT_TIME = i_STOP_LOSS_EVENT_TIME;
//		m_STOP_LOSS_ASS_TIME = i_STOP_LOSS_ASS_TIME;
//		m_STOP_LOSS_TPM_TIME = i_STOP_LOSS_TPM_TIME;
//		m_STOP_LOSS_REPAIR_TIME = i_STOP_LOSS_REPAIR_TIME;
//		m_STOP_LOSS_OTHER_TIME = i_STOP_LOSS_OTHER_TIME;
//		m_STOP_LOSS_UN_MASS_PROD_TIME = i_STOP_LOSS_UN_MASS_PROD_TIME;
//		m_STOP_LOSS_RESERVE_TIME_1 = i_STOP_LOSS_RESERVE_TIME_1;
//		m_STOP_LOSS_RESERVE_TIME_2 = i_STOP_LOSS_RESERVE_TIME_2;
//		m_STOP_LOSS_RESERVE_TIME_3 = i_STOP_LOSS_RESERVE_TIME_3;
//		m_LINE_LOSS_IMPROVE_TIME = i_LINE_LOSS_IMPROVE_TIME;
//		m_LINE_LOSS_ON_HAND_TIME = i_LINE_LOSS_ON_HAND_TIME;
//		m_LINE_LOSS_LUBRICATE_TIME = i_LINE_LOSS_LUBRICATE_TIME;
//		m_LINE_LOSS_MEETING_TIME = i_LINE_LOSS_MEETING_TIME;
//		m_LINE_LOSS_DEFECT_TIME = i_LINE_LOSS_DEFECT_TIME;
//		m_LINE_LOSS_SELECT_TIME = i_LINE_LOSS_SELECT_TIME;
//		m_LINE_LOSS_ADJUST_TIME = i_LINE_LOSS_ADJUST_TIME;
//		m_LINE_LOSS_ADJUST_NO = i_LINE_LOSS_ADJUST_NO;
//		m_LINE_LOSS_RESERVE_TIME_1 = i_LINE_LOSS_RESERVE_TIME_1;
//		m_LINE_LOSS_RESERVE_TIME_2 = i_LINE_LOSS_RESERVE_TIME_2;
//		m_LINE_LOSS_RESERVE_TIME_3 = i_LINE_LOSS_RESERVE_TIME_3;
//		m_LINE_LOSS_RESERVE_TIME_4 = i_LINE_LOSS_RESERVE_TIME_4;
//		m_EQUIP_LOSS_TROUBLE_TIME = i_EQUIP_LOSS_TROUBLE_TIME;
//		m_EQUIP_LOSS_TROUBLE_NO = i_EQUIP_LOSS_TROUBLE_NO;
//		m_EQUIP_LOSS_HALT_TIME = i_EQUIP_LOSS_HALT_TIME;
//		m_EQUIP_LOSS_HALT_NO = i_EQUIP_LOSS_HALT_NO;
//		m_EQUIP_LOSS_ARRANGEMENT_TIME = i_EQUIP_LOSS_ARRANGEMENT_TIME;
//		m_EQUIP_LOSS_ARRANGEMENT_NO = i_EQUIP_LOSS_ARRANGEMENT_NO;
//		m_EQUIP_LOSS_CHG_TIME = i_EQUIP_LOSS_CHG_TIME;
//		m_EQUIP_LOSS_CHG_NO = i_EQUIP_LOSS_CHG_NO;
//		m_EQUIP_LOSS_BOOT_TIME = i_EQUIP_LOSS_BOOT_TIME;
//		m_EQUIP_LOSS_RESERVE_TIME_1 = i_EQUIP_LOSS_RESERVE_TIME_1;
//		m_EQUIP_LOSS_RESERVE_TIME_2 = i_EQUIP_LOSS_RESERVE_TIME_2;
//		m_EQUIP_LOSS_RESERVE_TIME_3 = i_EQUIP_LOSS_RESERVE_TIME_3;
//		m_EQUIP_LOSS_RESERVE_TIME_4 = i_EQUIP_LOSS_RESERVE_TIME_4;
//		m_DIS_LOSS_SEARCH_TIME = i_DIS_LOSS_SEARCH_TIME;
//		m_DIS_LOSS_TRANSPORT_TIME = i_DIS_LOSS_TRANSPORT_TIME;
//		m_DIS_LOSS_RESERVE_TIME_1 = i_DIS_LOSS_RESERVE_TIME_1;
//		m_OPR_LOSS_REPAIR_TIME = i_OPR_LOSS_REPAIR_TIME;
//		m_OPR_LOSS_SUPPORT_TIME = i_OPR_LOSS_SUPPORT_TIME;
//		m_OPR_LOSS_RESERVE_TIME_1 = i_OPR_LOSS_RESERVE_TIME_1;
//		m_LOSS_TIME_REMARKS = i_LOSS_TIME_REMARKS;
	}
		// TODO: ユーザ利用メソッド・変数は、ここに記述してください。
        //}}user_implement_code

	//////////////////////////////

}
