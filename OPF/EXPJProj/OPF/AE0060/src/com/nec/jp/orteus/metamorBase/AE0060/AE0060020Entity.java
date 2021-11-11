/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AE0060/src/com/nec/jp/orteus/metamorBase/AE0060/AE0060020Entity.java,v $
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
 *                     ,メソッドコメントの「* @return なし」をすべて削除
 * EXPJ    (2004/03/02),EXPLANNER/J用に改造（ソースヘッダ・クラスヘッダ変更）
 * 3.0.5.1 (2004/12/21),MySQLとPostgresqlの対応
 * 3.0.5.0 (2004/12/06),mv_dbms/mv_dbms_dynamic_sql/mv_std_dbms パターンのバグを修正
 * 3.0.4.3 (2004/09/30),エンティティタイプcsvの際、不要なインナークラスを作成するバグの解消
 * 3.0.4.2 (2004/09/29),エンティティタイプパターンcsvの際、ソース生成ができないバグの解消
 * 3.0.4.1 (2004/08/31),前パージョンカスタマイズ時に追加した不要なエンティティタイプパターンの削除
 * 3.0.4.0 (2004/08/20),TRUST-Vプロジェクトフィードバック（エンティティタイプパターンのバグ）
 * 3.0.3.0 (2004/08/04),TRUST-Vプロジェクトフィードバック（ソート条件変更）
 * 3.0.2.6 (2004/06/29),select_MAX_countの取得時のcontainerの取得方法の修正
 * 3.0.2.5 (2004/05/28),ダウンロードを連続実行するとFileNotFoundExceptionが発生するバグの修正
 * 3.0.2.4 (2004/04/16),動的SQL対応をInsert/Update/Delete時にも追加
 * 3.0.2.3 (2004/03/05),ei_Sysdate::read(Connection conn)内で生成したStatementを利用するように修正
 * 3.0.2.2 (2003/12/25),DB2現在時刻を取得するSQLを修正
 * 3.0.2.1 (2003/10/28),callメソッド利用時の引数設定方法をDataObjectのメソッドに変更
 * 3.0.2.0 (2003/08/04),全てのEntity Typeにcheckメソッドの追加
 * 3.0.1.1 (2003/07/04),checkメソッド利用時のエラー修正
 * 3.0.1.0 (2003/06/05),javadocコメントエラー修正,Stored Procedure対応追加
 * 3.0.0.0 (2003/04/23),クラス名標準化対応
 * 2.1.3.0 (2003/03/31),SQLParser対応,バグ修正
 * 2.1.2.0 (2003/03/12),OrteusStudio/PDConnector対応(更新系Entity設定データリポジトリ修正）
 * 2.1.1.0 (2003/01/22),OrteusStudio/PDConnector対応(取得データ型プロパティ修正)
 * 2.1.0.0 (2002/12/17),doRecordsetの廃止。ResultSetへ修正,Logging package修正
 * 2.0.1.0 (2002/10/15),DB2対応
 * 2.0.0.0 (2002/05/27),new foundation対応
 *
 */

package com.nec.jp.orteus.metamorBase.AE0060;

import com.nec.jp.orteus.util.*;

import com.nec.jp.orteus.xaf.foundation.*;
import com.nec.jp.orteus.xaf.util.*;
import com.nec.jp.orteus.xaf.wa.*;
import com.nec.jp.orteus.xaf.wa.sqlparser.*;
import com.nec.jp.orteus.xaf.eo.*;

import com.nec.jp.orteus.util.logging.*;

import java.util.Date;
import java.util.*;
import java.sql.*;

import com.nec.jp.orteus.expj.exception.*;

//{{user_implement_code_import
	// TODO: ここにimportパッケージを記述してください
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AE0060020Entity extends DataObject
{

	//////////////////////////////

	//{{user_implement_dev:fixed_number

	// SQL文が未定義の場合
	final static int ERROR_SQLNOTDEFINE = 999999;

        //}}user_implement_dev:fixed_number

	//////////////////////////////
	// システム日付取得Entity
	public ei_Sysdate mei_Sysdate = new ei_Sysdate();

	// CSV出力Entity
	public ei_CSVOut mei_CSVOut = new ei_CSVOut();

	// Viewクラス インスタンス
	public View mView = new View();

	// Formクラス インスタンス
	public Form mForm = new Form();

	// FormSub1Insertクラス インスタンス
	public FormSub1Insert mFormSub1Insert = new FormSub1Insert();

	// FormSub1Updateクラス インスタンス
	public FormSub1Update mFormSub1Update = new FormSub1Update();

	// T_ACPT_RSLTクラス インスタンス
	public T_ACPT_RSLT mT_ACPT_RSLT = new T_ACPT_RSLT();

	// T_INSPC_RSLTクラス インスタンス
	public T_INSPC_RSLT mT_INSPC_RSLT = new T_INSPC_RSLT();

	// T_RLSD_PUCH_ODRクラス インスタンス
	public T_RLSD_PUCH_ODR mT_RLSD_PUCH_ODR = new T_RLSD_PUCH_ODR();

	// M_WHクラス インスタンス
	public M_WH mM_WH = new M_WH();

	// M_TAXクラス インスタンス
	public M_TAX mM_TAX = new M_TAX();

	// T_RLSD_PUCH_ODRForCompleteクラス インスタンス
	public T_RLSD_PUCH_ODRForComplete mT_RLSD_PUCH_ODRForComplete = new T_RLSD_PUCH_ODRForComplete();

	// T_RLSD_PUCH_ODRForCancelクラス インスタンス
	public T_RLSD_PUCH_ODRForCancel mT_RLSD_PUCH_ODRForCancel = new T_RLSD_PUCH_ODRForCancel();

	// T_ACPT_RSLT_Lockクラス インスタンス
	public T_ACPT_RSLT_Lock mT_ACPT_RSLT_Lock = new T_ACPT_RSLT_Lock();

	// T_RLSD_PUCH_ODR_Lockクラス インスタンス
	public T_RLSD_PUCH_ODR_Lock mT_RLSD_PUCH_ODR_Lock = new T_RLSD_PUCH_ODR_Lock();

	// T_ISSUE_INSTクラス インスタンス
	public T_ISSUE_INST mT_ISSUE_INST = new T_ISSUE_INST();

	// T_PART_SUPPLIED_ISSUEクラス インスタンス
	public T_PART_SUPPLIED_ISSUE mT_PART_SUPPLIED_ISSUE = new T_PART_SUPPLIED_ISSUE();

	// readT_ITEM_STOCKクラス インスタンス
	public readT_ITEM_STOCK mreadT_ITEM_STOCK = new readT_ITEM_STOCK();

	// readT_JOB_ODR_CD_STOCKクラス インスタンス
	public readT_JOB_ODR_CD_STOCK mreadT_JOB_ODR_CD_STOCK = new readT_JOB_ODR_CD_STOCK();

	// insertT_ITEM_STOCKクラス インスタンス
	public insertT_ITEM_STOCK minsertT_ITEM_STOCK = new insertT_ITEM_STOCK();

	// updateT_ITEM_STOCKクラス インスタンス
	public updateT_ITEM_STOCK mupdateT_ITEM_STOCK = new updateT_ITEM_STOCK();

	// insertT_JOB_ODR_CD_STOCKクラス インスタンス
	public insertT_JOB_ODR_CD_STOCK minsertT_JOB_ODR_CD_STOCK = new insertT_JOB_ODR_CD_STOCK();

	// updateT_JOB_ODR_CD_STOCKクラス インスタンス
	public updateT_JOB_ODR_CD_STOCK mupdateT_JOB_ODR_CD_STOCK = new updateT_JOB_ODR_CD_STOCK();

	// insertT_RCV_ISSUEクラス インスタンス
	public insertT_RCV_ISSUE minsertT_RCV_ISSUE = new insertT_RCV_ISSUE();

	// readM_WHクラス インスタンス
	public readM_WH mreadM_WH = new readM_WH();

	// readT_PART_SUPPLIED_ISSUEクラス インスタンス
	public readT_PART_SUPPLIED_ISSUE mreadT_PART_SUPPLIED_ISSUE = new readT_PART_SUPPLIED_ISSUE();

	// updateT_PART_SUPPLIED_ISSUEクラス インスタンス
	public updateT_PART_SUPPLIED_ISSUE mupdateT_PART_SUPPLIED_ISSUE = new updateT_PART_SUPPLIED_ISSUE();

	// readT_ACPT_RSLTクラス インスタンス
	public readT_ACPT_RSLT mreadT_ACPT_RSLT = new readT_ACPT_RSLT();

	// readT_INSPC_RSLTクラス インスタンス
	public readT_INSPC_RSLT mreadT_INSPC_RSLT = new readT_INSPC_RSLT();

	// selectSuppliedクラス インスタンス
	public selectSupplied mselectSupplied = new selectSupplied();

	// SelectDateCtrlクラス インスタンス
	public SelectDateCtrl mSelectDateCtrl = new SelectDateCtrl();

	// SelectHeaderクラス インスタンス
	public SelectHeader mSelectHeader = new SelectHeader();

	// SelectHeaderVendクラス インスタンス
	public SelectHeaderVend mSelectHeaderVend = new SelectHeaderVend();

	// checkM_ITEMクラス インスタンス
	public checkM_ITEM mcheckM_ITEM = new checkM_ITEM();

	// checkT_PART_SUPPLIED_ISSUEクラス インスタンス
	public checkT_PART_SUPPLIED_ISSUE mcheckT_PART_SUPPLIED_ISSUE = new checkT_PART_SUPPLIED_ISSUE();

	// SelectHeader2クラス インスタンス
	public SelectHeader2 mSelectHeader2 = new SelectHeader2();

	// updateT_PART_SUPPLIED_ISSUE_SUPクラス インスタンス
	public updateT_PART_SUPPLIED_ISSUE_SUP mupdateT_PART_SUPPLIED_ISSUE_SUP = new updateT_PART_SUPPLIED_ISSUE_SUP();

	// updateT_PART_SUPPLIED_ISSUE_COMクラス インスタンス
	public updateT_PART_SUPPLIED_ISSUE_COM mupdateT_PART_SUPPLIED_ISSUE_COM = new updateT_PART_SUPPLIED_ISSUE_COM();

	// updateT_PART_SUPPLIED_ISSUE_NOMALクラス インスタンス
	public updateT_PART_SUPPLIED_ISSUE_NOMAL mupdateT_PART_SUPPLIED_ISSUE_NOMAL = new updateT_PART_SUPPLIED_ISSUE_NOMAL();

	// checkT_RLSD_PUCH_ODRクラス インスタンス
	public checkT_RLSD_PUCH_ODR mcheckT_RLSD_PUCH_ODR = new checkT_RLSD_PUCH_ODR();

	// updateT_PART_SUPPLIED_ISSUE_GNRクラス インスタンス
	public updateT_PART_SUPPLIED_ISSUE_GNR mupdateT_PART_SUPPLIED_ISSUE_GNR = new updateT_PART_SUPPLIED_ISSUE_GNR();

	// T_ACPT_RSLT_COUNTクラス インスタンス
	public T_ACPT_RSLT_COUNT mT_ACPT_RSLT_COUNT = new T_ACPT_RSLT_COUNT();

	// T_PART_SUPPLIED_ISSUE_COUNTクラス インスタンス
	public T_PART_SUPPLIED_ISSUE_COUNT mT_PART_SUPPLIED_ISSUE_COUNT = new T_PART_SUPPLIED_ISSUE_COUNT();

	// T_RLSD_PUCH_ODR_FOR_CANCEL_ODR_CANCELクラス インスタンス
	public T_RLSD_PUCH_ODR_FOR_CANCEL_ODR_CANCEL mT_RLSD_PUCH_ODR_FOR_CANCEL_ODR_CANCEL = new T_RLSD_PUCH_ODR_FOR_CANCEL_ODR_CANCEL();

	// T_ACPT_RSLT_FOR_CANCEL_ODR_CANCELクラス インスタンス
	public T_ACPT_RSLT_FOR_CANCEL_ODR_CANCEL mT_ACPT_RSLT_FOR_CANCEL_ODR_CANCEL = new T_ACPT_RSLT_FOR_CANCEL_ODR_CANCEL();

	// SYS_DEBT_CTRLクラス インスタンス
	public SYS_DEBT_CTRL mSYS_DEBT_CTRL = new SYS_DEBT_CTRL();

	// SYS_INSTALL_OPTIONSクラス インスタンス
	public SYS_INSTALL_OPTIONS mSYS_INSTALL_OPTIONS = new SYS_INSTALL_OPTIONS();

	// M_CONS_UNIT_COSTクラス インスタンス
	public M_CONS_UNIT_COST mM_CONS_UNIT_COST = new M_CONS_UNIT_COST();

	// readT_PART_SUPPLIED_ISSUE2クラス インスタンス
	public readT_PART_SUPPLIED_ISSUE2 mreadT_PART_SUPPLIED_ISSUE2 = new readT_PART_SUPPLIED_ISSUE2();

	// updateT_PART_SUPPLIED_ISSUE2クラス インスタンス
	public updateT_PART_SUPPLIED_ISSUE2 mupdateT_PART_SUPPLIED_ISSUE2 = new updateT_PART_SUPPLIED_ISSUE2();

	// updateT_RLSD_PUCH_ODR_INSPC_CMPLTクラス インスタンス
	public updateT_RLSD_PUCH_ODR_INSPC_CMPLT mupdateT_RLSD_PUCH_ODR_INSPC_CMPLT = new updateT_RLSD_PUCH_ODR_INSPC_CMPLT();

	// SELECT_SYS_PARAMETERクラス インスタンス
	public SELECT_SYS_PARAMETER mSELECT_SYS_PARAMETER = new SELECT_SYS_PARAMETER();

	// SELECT_SYS_ACTUAL_COST_CTRL_ACクラス インスタンス
	public SELECT_SYS_ACTUAL_COST_CTRL_AC mSELECT_SYS_ACTUAL_COST_CTRL_AC = new SELECT_SYS_ACTUAL_COST_CTRL_AC();

	// checkWORK_ODR_CDクラス インスタンス
	public checkWORK_ODR_CD mcheckWORK_ODR_CD = new checkWORK_ODR_CD();

	// checkFINAL_PROC_FLGクラス インスタンス
	public checkFINAL_PROC_FLG mcheckFINAL_PROC_FLG = new checkFINAL_PROC_FLG();

	// checkLOT_NOクラス インスタンス
	public checkLOT_NO mcheckLOT_NO = new checkLOT_NO();

	// checkLOT_CTRL_FLGクラス インスタンス
	public checkLOT_CTRL_FLG mcheckLOT_CTRL_FLG = new checkLOT_CTRL_FLG();

	// updateT_LOT_CTRLクラス インスタンス
	public updateT_LOT_CTRL mupdateT_LOT_CTRL = new updateT_LOT_CTRL();

	// checkT_LOT_ISSUE_INSTクラス インスタンス
	public checkT_LOT_ISSUE_INST mcheckT_LOT_ISSUE_INST = new checkT_LOT_ISSUE_INST();

	// SelectSTOCK_ON_HAND_QTYクラス インスタンス
	public SelectSTOCK_ON_HAND_QTY mSelectSTOCK_ON_HAND_QTY = new SelectSTOCK_ON_HAND_QTY();

	// SelectT_PART_SUPPLIED_ISSUEクラス インスタンス
	public SelectT_PART_SUPPLIED_ISSUE mSelectT_PART_SUPPLIED_ISSUE = new SelectT_PART_SUPPLIED_ISSUE();

	// SelectQtyクラス インスタンス
	public SelectQty mSelectQty = new SelectQty();

	// SelectWH_CDクラス インスタンス
	public SelectWH_CD mSelectWH_CD = new SelectWH_CD();

	// SelectSEQ_JF_RSLTクラス インスタンス
	public SelectSEQ_JF_RSLT mSelectSEQ_JF_RSLT = new SelectSEQ_JF_RSLT();

	// insertT_LOT_USE_RSLTクラス インスタンス
	public insertT_LOT_USE_RSLT minsertT_LOT_USE_RSLT = new insertT_LOT_USE_RSLT();

	// updateT_LOT_USE_RSLTクラス インスタンス
	public updateT_LOT_USE_RSLT mupdateT_LOT_USE_RSLT = new updateT_LOT_USE_RSLT();

	// updateT_LOT_ISSUE_INSTクラス インスタンス
	public updateT_LOT_ISSUE_INST mupdateT_LOT_ISSUE_INST = new updateT_LOT_ISSUE_INST();

	// SelectISSUE_INST_CDクラス インスタンス
	public SelectISSUE_INST_CD mSelectISSUE_INST_CD = new SelectISSUE_INST_CD();

	// checkLOT_CTRL_FLG1クラス インスタンス
	public checkLOT_CTRL_FLG1 mcheckLOT_CTRL_FLG1 = new checkLOT_CTRL_FLG1();

	// checkLOT_NO1クラス インスタンス
	public checkLOT_NO1 mcheckLOT_NO1 = new checkLOT_NO1();

	// checkWH_CDクラス インスタンス
	public checkWH_CD mcheckWH_CD = new checkWH_CD();

	// checkSTOCK_ON_HAND_QTYクラス インスタンス
	public checkSTOCK_ON_HAND_QTY mcheckSTOCK_ON_HAND_QTY = new checkSTOCK_ON_HAND_QTY();

	// checkSTOCK_ON_HAND_QTY2クラス インスタンス
	public checkSTOCK_ON_HAND_QTY2 mcheckSTOCK_ON_HAND_QTY2 = new checkSTOCK_ON_HAND_QTY2();

	// getSUM_TOTAL_ISSUE_QTYクラス インスタンス
	public getSUM_TOTAL_ISSUE_QTY mgetSUM_TOTAL_ISSUE_QTY = new getSUM_TOTAL_ISSUE_QTY();

	// checkT_LOT_ISSUE_INST2クラス インスタンス
	public checkT_LOT_ISSUE_INST2 mcheckT_LOT_ISSUE_INST2 = new checkT_LOT_ISSUE_INST2();

	// getT_LOT_USE_RSLT_QTYクラス インスタンス
	public getT_LOT_USE_RSLT_QTY mgetT_LOT_USE_RSLT_QTY = new getT_LOT_USE_RSLT_QTY();

	// updateT_LOT_ISSUE_INST_SPENT_QTYクラス インスタンス
	public updateT_LOT_ISSUE_INST_SPENT_QTY mupdateT_LOT_ISSUE_INST_SPENT_QTY = new updateT_LOT_ISSUE_INST_SPENT_QTY();

	// deleteT_LOT_USE_RSLTクラス インスタンス
	public deleteT_LOT_USE_RSLT mdeleteT_LOT_USE_RSLT = new deleteT_LOT_USE_RSLT();

	// getParentITEM_CDクラス インスタンス
	public getParentITEM_CD mgetParentITEM_CD = new getParentITEM_CD();

	// SelectT_LOT_USE_RSLT_LOT_NOクラス インスタンス
	public SelectT_LOT_USE_RSLT_LOT_NO mSelectT_LOT_USE_RSLT_LOT_NO = new SelectT_LOT_USE_RSLT_LOT_NO();

	// checkNON_NO_ITEM_FLGクラス インスタンス
	public checkNON_NO_ITEM_FLG mcheckNON_NO_ITEM_FLG = new checkNON_NO_ITEM_FLG();

	// SelectLOT_NO_From_ACPTクラス インスタンス
	public SelectLOT_NO_From_ACPT mSelectLOT_NO_From_ACPT = new SelectLOT_NO_From_ACPT();

	// SelectTOTAL_ISSUE_QTY_SUMクラス インスタンス
	public SelectTOTAL_ISSUE_QTY_SUM mSelectTOTAL_ISSUE_QTY_SUM = new SelectTOTAL_ISSUE_QTY_SUM();

	// checkIsLotManagerクラス インスタンス
	public checkIsLotManager mcheckIsLotManager = new checkIsLotManager();

	// getACPT_NOクラス インスタンス
	public getACPT_NO mgetACPT_NO = new getACPT_NO();

	// getISSUE_INST_CDクラス インスタンス
	public getISSUE_INST_CD mgetISSUE_INST_CD = new getISSUE_INST_CD();

	// T_ISSUE_INST2クラス インスタンス
	public T_ISSUE_INST2 mT_ISSUE_INST2 = new T_ISSUE_INST2();

	// bakT_LOT_USE_RSLTクラス インスタンス
	public bakT_LOT_USE_RSLT mbakT_LOT_USE_RSLT = new bakT_LOT_USE_RSLT();

	// SelectT_LOT_USE_RSLT_LOT_NO2クラス インスタンス
	public SelectT_LOT_USE_RSLT_LOT_NO2 mSelectT_LOT_USE_RSLT_LOT_NO2 = new SelectT_LOT_USE_RSLT_LOT_NO2();

	// updateT_LOT_USE_RSLT3クラス インスタンス
	public updateT_LOT_USE_RSLT3 mupdateT_LOT_USE_RSLT3 = new updateT_LOT_USE_RSLT3();

	// updateT_LOT_USE_RSLT4クラス インスタンス
	public updateT_LOT_USE_RSLT4 mupdateT_LOT_USE_RSLT4 = new updateT_LOT_USE_RSLT4();

	// checkT_LOT_USE_RSLTクラス インスタンス
	public checkT_LOT_USE_RSLT mcheckT_LOT_USE_RSLT = new checkT_LOT_USE_RSLT();

	// SYS_PARAMETERクラス インスタンス
	public SYS_PARAMETER mSYS_PARAMETER = new SYS_PARAMETER();

	// c_BESTBEFORE_DATEクラス インスタンス
	public c_BESTBEFORE_DATE mc_BESTBEFORE_DATE = new c_BESTBEFORE_DATE();

	// SelectLOT_NOクラス インスタンス
	public SelectLOT_NO mSelectLOT_NO = new SelectLOT_NO();

	// updateT_LOT_USE_RSLT2クラス インスタンス
	public updateT_LOT_USE_RSLT2 mupdateT_LOT_USE_RSLT2 = new updateT_LOT_USE_RSLT2();

	// T_ODクラス インスタンス
	public T_OD mT_OD = new T_OD();

	// SYS_BAT_PARMクラス インスタンス
	public SYS_BAT_PARM mSYS_BAT_PARM = new SYS_BAT_PARM();

	// callSQLCALCTAXCALCAMTクラス インスタンス
	public callSQLCALCTAXCALCAMT mcallSQLCALCTAXCALCAMT = new callSQLCALCTAXCALCAMT();

	// ViewCntクラス インスタンス
	public ViewCnt mViewCnt = new ViewCnt();

	// SelectSuppliedCntクラス インスタンス
	public SelectSuppliedCnt mSelectSuppliedCnt = new SelectSuppliedCnt();

	// lockT_ITEM_STOCKクラス インスタンス
	public lockT_ITEM_STOCK mlockT_ITEM_STOCK = new lockT_ITEM_STOCK();

	// updateT_LOT_TRACEクラス インスタンス
	public updateT_LOT_TRACE mupdateT_LOT_TRACE = new updateT_LOT_TRACE();

	// getFROM_PUCH_ODR_CDクラス インスタンス
	public getFROM_PUCH_ODR_CD mgetFROM_PUCH_ODR_CD = new getFROM_PUCH_ODR_CD();


	//////////////////////////////

	// システム日付の変数設定
	public String sSysdate = "";

	/**
	 * システム日付取得処理
	 */
	public class ei_Sysdate extends DataObject
	{

		//////////////////////////////

		//{{user_implement_dev:ei_Sysdate_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:ei_Sysdate_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public String read(IDbConnection conn) throws FoundationException, SQLException
		{
			return read(conn.getConn());
		}

		/**
		 * データ読出し処理
		 *
		 * @return システム日時を返します
		 * @param conn Native Connectionクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public String read(Connection conn) throws FoundationException, SQLException
		{
			PreparedStatement stmt=null;
			String query=null;

			if(m_selcmd==null) throw new FoundationException("ei_Sysdate", "read", "クエリー未登録");

			if("Oracle".equals(conn.getMetaData().getDatabaseProductName())) {
				stmt=prepare(conn, (query=m_selcmd));
			} else if("Microsoft SQL Server".equals(conn.getMetaData().getDatabaseProductName())) {
				stmt=prepare(conn, (query=m_selcmd_MSSQL));
			} else if("PostgreSQL".equals(conn.getMetaData().getDatabaseProductName())) {
				stmt=prepare(conn, (query=m_selcmd_PGS));
			} else if("MySQL".equals(conn.getMetaData().getDatabaseProductName())) {
				stmt=prepare(conn, (query=m_selcmd_MySQL));
			} else {
				stmt=prepare(conn, (query=m_selcmd_DB2));
			}

			ResultSet rs=executeQuery(stmt);

			try {
				return next(rs);
			} finally {
				stmt.close();
				stmt = null;
			}
			//{{user_implement_dev:ei_Sysdate_read
				// TODO: ここにユーザ処理を記述してください
                        //}}user_implement_dev:ei_Sysdate_read
		}

		/**
		 * クエリーのprepare処理
		 *
		 * @return PreparedStatementインスタンスを返します
		 * @param conn Native Connectionインスタンス
		 * @param query SQL文字列
		 * @exception <<コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query) throws FoundationException, SQLException
		{
			PreparedStatement stmt;

			stmt = conn.prepareStatement(query);

			return stmt;
		}

		/**
		 * データ読出し処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt) throws FoundationException, SQLException
		{
			int no=1;


			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public String next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			sSysdate = getString(1, rs);

			return sSysdate;
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:ei_Sysdate_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:ei_Sysdate_clear

			return;
		}

		//////////////////////////////

		/**
		 * ei_Sysdateクラスの標準コンストラクタ
		 */
		public ei_Sysdate()
		{
			//{{user_implement_dev:ei_Sysdate_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:ei_Sysdate_constractor

			return;
		}

		//////////////////////////////

		// 各状態で実行するsql文の定義
		protected String m_selcmd = "select to_char(sysdate,'YYYY/MM/DD HH24:MI:SS') from dual "
+"";
		protected String m_selcmd_MSSQL = "select convert(varchar(19),getdate(),111)+' '+convert(varchar(19),getdate(),114)"
+"";
		protected String m_selcmd_PGS = "select TO_CHAR(SYSDATE(),'YYYY/MM/DD HH24:MI:SS') "
+"";
		protected String m_selcmd_MySQL = "select date_format(sysdate(), '%Y-%m-%d %H:%i:%s') "
+"";
		protected String m_selcmd_DB2 = "select TO_CHAR(SYSDATE(),'YYYY/MM/DD HH24:MI:SS') from SYSIBM.SYSDUMMY1 "
+"";		//////////////////////////////

	}

	//////////////////////////////

	/**
	 * CSV出力デフォルトクラス
	 */
	public class ei_CSVOut extends DataObject
	{

		//////////////////////////////

		//{{user_implement_dev:ei_CSVOut_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:ei_CSVOut_def

		/**
		 * データ書込み処理
		 *
		 * @param list テーブル列項目リストインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public void create(List list, String sTitle[]) throws FoundationException
		{
			String sColums[] = null;
			String sbuff[] = null;
			int nMax_length = 0;
			int nlength = 0;

			if(m_write_fname==null || m_write_fname.length()==0) throw new FoundationException("ei_CSVOut", "create", "ファイル情報未登録");

			try {
				if (m_writer == null) {
					m_writer = new WriteCsv();
				}
				m_writer.open(m_write_path, m_write_fname);

				// タイトルの設定
				if(sTitle != null) {
					m_writer.beginIns();
					for(int w=0, cw=sTitle.length; w<cw; w++) {
						m_writer.addCell( sTitle[w] );
					}
					m_writer.endIns();
				}

				if((list == null) || (list.size() == 0)) return;

				// データの設定
				for(int z=0, cz=list.size(); z<cz; z++) {
					sbuff = (String[])list.get(z);
					if(sbuff == null) continue;
					nlength = sbuff.length;
					if(nlength > nMax_length) {
						nMax_length = nlength;
					}
				}

				for(int y=0, cy=nMax_length; y<cy; y++) {
					m_writer.beginIns();
					for(int x=0, cx=list.size(); x<cx; x++) {
						sColums = (String[])list.get(x);
						m_writer.addCell( sColums[y] );
					}
					m_writer.endIns();
				}
			} catch(FoundationException e) {
				return;
			} finally {
				if (m_writer != null) {
					m_writer.close();
					m_writer = null;
				}
			}

			return;
		}

		//////////////////////////////

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:ei_CSVOut_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:ei_CSVOut_clear

			return;
		}

		//////////////////////////////

		/**
		 * ei_CSVOutクラスの標準コンストラクタ
		 */
		public ei_CSVOut()
		{
			//{{user_implement_dev:ei_CSVOut_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:ei_CSVOut_constractor

			return;
		}

		//////////////////////////////

		// csv用の変数
		String m_write_path="D:/Orteus/csv/";
		String m_write_fname="AE0060020.csv";

		protected WriteCsv m_writer=null;		// csv書込み用

		String m_ProjName="AE0060020";

		/**
		 * CSVファイル名setter/getterメソッド
		 */
		public void setPath(String spath) {m_write_path = spath;}
		public String getPath() {return m_write_path;}
		public void setFname(String sfilename) {m_write_fname = sfilename;}
		public String getFname() {return m_write_fname;}

		//////////////////////////////

	}

	//////////////////////////////
	/**
	 * Entity定義 静的SQL
	 */
	public class View extends DataObject
	{
		protected String m_selcmd = "select "
+"  T_ACPT_RSLT.\"PUCH_ODR_CD\" as \"PUCH_ODR_CD\", "
+"  to_char(T_ACPT_RSLT.\"ACPT_NO\") as \"ACPT_NO\", "
+"  to_char(T_ACPT_RSLT.\"ACPT_QTY\") as \"ACPT_QTY\", "
+"  decode(T_RLSD_PUCH_ODR.\"NON_NO_ITEM_FLG\", 0, M_ITEM.\"STOCK_UNIT\", T_RLSD_PUCH_ODR.\"NON_NO_ITEM_PUCH_ODR_UNIT\") as \"STOCK_UNIT\", "
+"  T_ACPT_RSLT.\"WH_CD\" as \"WH_CD\", "
+"  M_WH.\"WH_NAME\" as \"WH_NAME\", "
+"  T_ACPT_RSLT.\"DLV_CD\" as \"DLV_CD\", "
+"  to_char(T_ACPT_RSLT.\"UNIT_COST\") as \"UNIT_COST\", "
+"  M_CUR.\"CUR_UNIT\" as \"CUR_UNIT\", "
+"  to_char(T_ACPT_RSLT.\"ACPT_STS_TYP\") as \"ACPT_STS_TYP\" "
+"from "
+"  T_ACPT_RSLT, "
+"  T_RLSD_PUCH_ODR, "
+"  M_ITEM, "
+"  M_VEND_CTRL, "
+"  M_WH, "
+"  M_CUR, "
+"  SYS_HOME_CUR "
+"where "
+"  T_RLSD_PUCH_ODR.PUCH_ODR_CD = T_ACPT_RSLT.PUCH_ODR_CD "
+"  and T_RLSD_PUCH_ODR.ITEM_CD = M_ITEM.ITEM_CD(+) "
+"  and T_RLSD_PUCH_ODR.COMPANY_CD = M_VEND_CTRL.COMPANY_CD(+) "
+"  and T_RLSD_PUCH_ODR.VEND_CD = M_VEND_CTRL.VEND_CD(+) "
+"  and M_CUR.CUR_CD = nvl(M_VEND_CTRL.CUR_CD, SYS_HOME_CUR.HOME_CUR_CD) "
+"  and SYS_HOME_CUR.CTRL_CD = 'SYSTEM' "
+"  and T_ACPT_RSLT.WH_CD = M_WH.WH_CD(+) "
+"  and T_ACPT_RSLT.PUCH_ODR_CD = ? "
+"order by "
+"  T_ACPT_RSLT.\"ACPT_NO\"";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:View_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:View_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStr);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStrs);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:View_read
			if(m_selcmd==null) throw new FoundationException("View", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:View_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:View_read2
			if(m_selcmd==null) throw new FoundationException("View", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStr);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:View_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:View_read3
			if(m_selcmd==null) throw new FoundationException("View", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStrs);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:View_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);

			try {
				List list=new ArrayList();

				while((data=next(rs))!=null) {
					list.add(data);
				}

				return list;
			} finally {
				rs.close();
				rs = null;
			}
		}

		/**
		 * クエリーのprepare処理
		 *
		 * @return PreparedStatementインスタンスを返します
		 * @param conn Native Connectionインスタンス
		 * @param query SQL文字列
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query, AE0060020Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getPUCH_ODR_CD());
				if(isNull(data.getPUCH_ODR_CD())) isNull = true;

				// 静的SQL文の生成
				stmt = conn.prepareStatement(query);

			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * データ読出し処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getPUCH_ODR_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0060020Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0060020Struct data = new AE0060020Struct();

			data.setPUCH_ODR_CD( getString(1, rs) );
			data.setl_ACPT_NO( getString(2, rs) );
			data.setl_ACPT_QTY( getString(3, rs) );
			data.setl_STOCK_UNIT( getString(4, rs) );
			data.setl_WH_CD( getString(5, rs) );
			data.setl_WH_NAME( getString(6, rs) );
			data.setl_DLV_CD( getString(7, rs) );
			data.setl_UNIT_COST( getString(8, rs) );
			data.setl_CUR_UNIT( getString(9, rs) );
			data.setl_ACPT_STS_TYP( getString(10, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("View", "hasRecord", "クエリー未登録");

			ResultSet rs=null;
			PreparedStatement stmt=null;

			try {
				stmt = prepare(conn, m_selcmd, data);

				rs = stmt.executeQuery();

				return rs.next();
			} finally {
				if(rs != null) {
					rs.close();
					rs = null;
				}
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return check(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:View_check
			PreparedStatement stmt;

			if(m_chkcmd!=null) {
				stmt = prepare(conn, m_chkcmd, data);
			} else if(m_selcmd!=null) {
				stmt = prepare(conn, m_selcmd, data);
			} else {
				throw new FoundationException("View", "check", "クエリー未登録");
			}

			try {
				return check(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:View_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);
			boolean ret=true;

			try {
				if(rs.next()==false) return false;


				return ret;
			} finally {
				if (rs != null) {
					rs.close();
					rs = null;
				}
			}
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:View_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:View_clear

			return;
		}

		/**
		 * Viewクラスの標準コンストラクタ
		 */
		public View()
		{
			//{{user_implement_dev:View_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:View_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class Form extends DataObject
	{
		protected String m_selcmd = "select "
+"  T_RLSD_PUCH_ODR.\"PUCH_ODR_CD\" as \"PUCH_ODR_CD\", "
+"  to_char(T_RLSD_PUCH_ODR.\"MODIFY_COUNT\") as \"MODIFY_COUNT\", "
+"  T_RLSD_PUCH_ODR.\"ITEM_CD\" as \"ITEM_CD\", "
+"  decode(T_RLSD_PUCH_ODR.\"NON_NO_ITEM_FLG\", 0, M_ITEM.\"ITEM_NAME\", T_RLSD_PUCH_ODR.\"NON_NO_ITEM_NAME\") as \"ITEM_NAME\", "
+"  T_OD.\"JOB_ODR_CD\" as \"JOB_ODR_CD\", "
+"  M_ITEM.\"DRAW_CD\" as \"DRAW_CD\", "
+"  M_ITEM.\"SPEC\" as \"SPEC\", "
+"  to_char(nvl(M_ITEM.\"UNIT_QTY_TYP\", 2)) as \"UNIT_QTY_TYP\", "
+"  T_RLSD_PUCH_ODR.\"VEND_CD\" as \"VEND_CD\", "
+"  M_VEND_CTRL.\"VEND_NAME\" as \"VEND_NAME\", "
+"  to_char(T_RLSD_PUCH_ODR.\"PUCH_ODR_QTY\") as \"PUCH_ODR_QTY\", "
+"  to_char(T0.\"SUM_ACPT_QTY\") as \"SUM_ACPT_QTY\", "
+"  to_char(T_RLSD_PUCH_ODR.\"ACPT_INSPC_TYP\") as \"ACPT_INSPC_TYP\", "
+"  to_char(nvl(T_RLSD_PUCH_ODR.\"PUCH_ODR_SLIP_ISS_DATE\", T_RLSD_PUCH_ODR.\"PUCH_ODR_INST_DATE\"), 'YYYY/MM/DD') as \"PUCH_ODR_SLIP_ISS_DATE\", "
+"  to_char(T_RLSD_PUCH_ODR.\"PUCH_ODR_DLV_DATE\", 'YYYY/MM/DD') as \"PUCH_ODR_DLV_DATE\", "
+"  to_char(T_RLSD_PUCH_ODR.\"CONFIRM_DLV_DATE\", 'YYYY/MM/DD') as \"CONFIRM_DLV_DATE\", "
+"  T_RLSD_PUCH_ODR.\"WORK_IN_PROC_CD\" as \"WORK_IN_PROC_CD\", "
+"  T_WORK_IN_PROC_BY_PROC.\"PROC_NAME\" as \"PROC_NAME\", "
+"  T_RLSD_PUCH_ODR.\"PUCH_ODR_PERSON\" as \"PUCH_ODR_PERSON\", "
+"  USER_MST.\"USER_NAME\" as \"USER_NAME\", "
+"  to_char(T_RLSD_PUCH_ODR.\"PUCH_ODR_STS_TYP\") as \"PUCH_ODR_STS_TYP\", "
+"  to_char(T_RLSD_PUCH_ODR.\"INSPC_CMPLT_FLG\") as \"INSPC_CMPLT_FLG\", "
+"  to_char(T_RLSD_PUCH_ODR.\"SPL_ITEM_TYP\") as \"SPL_ITEM_TYP\", "
+"  to_char(decode(T_RLSD_PUCH_ODR.\"NON_NO_ITEM_FLG\", 0, M_ITEM.\"PRODUCT_TYP\", T_RLSD_PUCH_ODR.\"NON_NO_ITEM_TYP\")) as \"PRODUCT_TYP\", "
+"  to_char(T_RLSD_PUCH_ODR.\"NON_NO_ITEM_FLG\") as \"NON_NO_ITEM_FLG\", "
+"  decode(T_RLSD_PUCH_ODR.\"NON_NO_ITEM_FLG\", 0, M_ITEM.\"STOCK_UNIT\", T_RLSD_PUCH_ODR.\"NON_NO_ITEM_PUCH_ODR_UNIT\") as \"STOCK_UNIT\", "
+"  T_RLSD_PUCH_ODR.\"PLANT_CD\" as \"PLANT_CD\", "
+"  T_RLSD_PUCH_ODR.\"TAX_CD\" as \"TAX_CD\", "
+"  to_char(T_RLSD_PUCH_ODR.\"PUCH_ODR_START_DATE\", 'YYYY/MM/DD') as \"PUCH_ODR_START_DATE\", "
+"  T_RLSD_PUCH_ODR.\"PUCH_ODR_COMMENT\" as \"PUCH_ODR_COMMENT\" "
+"from "
+"  T_RLSD_PUCH_ODR, "
+"  T_OD, "
+"  T_WORK_IN_PROC_BY_PROC, "
+"  M_ITEM, "
+"  M_VEND_CTRL, "
+"  USER_MST, "
+"  ( "
+"    select "
+"      T_ACPT_RSLT.\"PUCH_ODR_CD\" as \"PUCH_ODR_CD\", "
+"      sum(T_ACPT_RSLT.\"ACPT_QTY\") as \"SUM_ACPT_QTY\" "
+"    from "
+"      T_ACPT_RSLT "
+"    group by "
+"      T_ACPT_RSLT.\"PUCH_ODR_CD\" "
+"  ) T0 "
+"where "
+"  T_RLSD_PUCH_ODR.ITEM_CD = M_ITEM.ITEM_CD(+) "
+"  and T_RLSD_PUCH_ODR.COMPANY_CD = M_VEND_CTRL.COMPANY_CD(+) "
+"  and T_RLSD_PUCH_ODR.VEND_CD = M_VEND_CTRL.VEND_CD(+) "
+"  and T_RLSD_PUCH_ODR.OD_NO = T_OD.OD_NO(+) "
+"  and T_RLSD_PUCH_ODR.WORK_ODR_CD = T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD(+) "
+"  and T_RLSD_PUCH_ODR.WORK_IN_PROC_CD = T_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD(+) "
+"  and T_RLSD_PUCH_ODR.PUCH_ODR_PERSON = USER_MST.USER_CD(+) "
+"  and T_RLSD_PUCH_ODR.\"PUCH_ODR_CD\" = T0.\"PUCH_ODR_CD\" "
+"  and T_RLSD_PUCH_ODR.\"PUCH_ODR_CD\" = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:Form_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:Form_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStr);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStrs);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:Form_read
			if(m_selcmd==null) throw new FoundationException("Form", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:Form_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:Form_read2
			if(m_selcmd==null) throw new FoundationException("Form", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStr);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:Form_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:Form_read3
			if(m_selcmd==null) throw new FoundationException("Form", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStrs);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:Form_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);

			try {
				List list=new ArrayList();

				while((data=next(rs))!=null) {
					list.add(data);
				}

				return list;
			} finally {
				rs.close();
				rs = null;
			}
		}

		/**
		 * クエリーのprepare処理
		 *
		 * @return PreparedStatementインスタンスを返します
		 * @param conn Native Connectionインスタンス
		 * @param query SQL文字列
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query, AE0060020Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getPUCH_ODR_CD());
				if(isNull(data.getPUCH_ODR_CD())) isNull = true;

				// 静的SQL文の生成
				stmt = conn.prepareStatement(query);

			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * データ読出し処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getPUCH_ODR_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0060020Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0060020Struct data = new AE0060020Struct();

			data.setPUCH_ODR_CD( getString(1, rs) );
			data.setPUCH_ODR_MODIFY_COUNT( getString(2, rs) );
			data.setITEM_CD( getString(3, rs) );
			data.setITEM_NAME( getString(4, rs) );
			data.setJOB_ODR_CD( getString(5, rs) );
			data.setDRAW_CD( getString(6, rs) );
			data.setSPEC( getString(7, rs) );
			data.setUNIT_QTY_TYP( getString(8, rs) );
			data.setVEND_CD( getString(9, rs) );
			data.setVEND_NAME( getString(10, rs) );
			data.setPUCH_ODR_QTY( getString(11, rs) );
			data.setSUM_ACPT_QTY( getString(12, rs) );
			data.setACPT_INSPC_TYP( getString(13, rs) );
			data.setPUCH_ODR_SLIP_ISS_DATE( getString(14, rs) );
			data.setPUCH_ODR_DLV_DATE( getString(15, rs) );
			data.setCONFIRM_DLV_DATE( getString(16, rs) );
			data.setWORK_IN_PROC_CD( getString(17, rs) );
			data.setPROC_NAME( getString(18, rs) );
			data.setPUCH_ODR_PERSON( getString(19, rs) );
			data.setUSER_NAME( getString(20, rs) );
			data.setPUCH_ODR_STS_TYP( getString(21, rs) );
			data.setINSPC_CMPLT_FLG( getString(22, rs) );
			data.setSPL_ITEM_TYP( getString(23, rs) );
			data.setPRODUCT_TYP( getString(24, rs) );
			data.setNON_NO_ITEM_FLG( getString(25, rs) );
			data.setSTOCK_UNIT( getString(26, rs) );
			data.setPLANT_CD( getString(27, rs) );
			data.setTAX_CD( getString(28, rs) );
			data.setPUCH_ODR_START_DATE( getString(29, rs) );
			data.setPUCH_ODR_COMMENT( getString(30, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("Form", "hasRecord", "クエリー未登録");

			ResultSet rs=null;
			PreparedStatement stmt=null;

			try {
				stmt = prepare(conn, m_selcmd, data);

				rs = stmt.executeQuery();

				return rs.next();
			} finally {
				if(rs != null) {
					rs.close();
					rs = null;
				}
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return check(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:Form_check
			PreparedStatement stmt;

			if(m_chkcmd!=null) {
				stmt = prepare(conn, m_chkcmd, data);
			} else if(m_selcmd!=null) {
				stmt = prepare(conn, m_selcmd, data);
			} else {
				throw new FoundationException("Form", "check", "クエリー未登録");
			}

			try {
				return check(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:Form_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);
			boolean ret=true;

			try {
				if(rs.next()==false) return false;


				return ret;
			} finally {
				if (rs != null) {
					rs.close();
					rs = null;
				}
			}
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:Form_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:Form_clear

			return;
		}

		/**
		 * Formクラスの標準コンストラクタ
		 */
		public Form()
		{
			//{{user_implement_dev:Form_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:Form_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class FormSub1Insert extends DataObject
	{
		protected String m_selcmd = "select "
+"  T_RLSD_PUCH_ODR.\"PUCH_ODR_CD\" as \"PUCH_ODR_CD\", "
+"  to_char((T0.\"MAX_ACPT_NO\" + 1)) as \"ACPT_NO\", "
+"  to_char(T_RLSD_PUCH_ODR.\"MODIFY_COUNT\") as \"PUCH_ODR_MODIFY_COUNT\", "
+"  to_char(T_ACPT_RSLT.\"MODIFY_COUNT\") as \"ACPT_MODIFY_COUNT\", "
+"  to_char((T_RLSD_PUCH_ODR.\"PUCH_ODR_QTY\" - T0.\"SUM_ACPT_QTY\")) as \"ACPT_QTY\", "
+"  decode(T_RLSD_PUCH_ODR.\"NON_NO_ITEM_FLG\", 0, M_ITEM.\"STOCK_UNIT\", T_RLSD_PUCH_ODR.\"NON_NO_ITEM_PUCH_ODR_UNIT\") as \"STOCK_UNIT\", "
+"  to_char(SYS_DATE_CTRL.\"BUSINESS_OPR_DATE\", 'YYYY/MM/DD') as \"ACPT_DATE\", "
+"  T_ACPT_RSLT.\"VEND_LOT_NO\" as \"VEND_LOT_NO\", "
+"  T_ACPT_RSLT.\"WH_CD\" as \"WH_CD\", "
+"  M_WH_1.\"WH_NAME\" as \"WH_NAME\", "
+"  T_ACPT_RSLT.\"INSPC_WH_CD\" as \"INSPC_WH_CD\", "
+"  M_WH_2.\"WH_NAME\" as \"INSPC_WH_NAME\", "
+"  M_CUR.\"CUR_CD\" as \"CUR_CD\", "
+"  M_CUR.\"CUR_NAME\" as \"CUR_NAME\", "
+"  M_CUR.\"CUR_UNIT\" as \"CUR_UNIT\", "
+"  to_char(M_CUR.\"DECIMAL_FIG\") as \"DECIMAL_FIG\", "
+"  to_char(T_ACPT_RSLT.\"UNIT_COST_TYP\") as \"UNIT_COST_TYP\", "
+"  to_char(T_ACPT_RSLT.\"UNIT_COST\") as \"UNIT_COST\", "
+"  to_char(T_ACPT_RSLT.\"PROCESSING_COST\") as \"PROCESSING_COST\", "
+"  to_char(T_ACPT_RSLT.\"MATERIAL_COST\") as \"MATERIAL_COST\", "
+"  to_char(T_ACPT_RSLT.\"OTHER_OVERHEADS\") as \"OTHER_OVERHEADS\", "
+"  to_char(0) as \"PUCH_ODR_AMOUNT\", "
+"  to_char(0) as \"DISC_AMOUNT\", "
+"  to_char(0) as \"NET_AMOUNT\", "
+"  to_char(0) as \"TAX_AMOUNT_1\", "
+"  to_char(0) as \"TAX_AMOUNT_2\", "
+"  to_char(0) as \"TAX_AMOUNT_3\", "
+"  to_char(T_ACPT_RSLT.\"TAX_RATE_1\") as \"TAX_RATE_1\", "
+"  to_char(T_ACPT_RSLT.\"TAX_RATE_2\") as \"TAX_RATE_2\", "
+"  to_char(T_ACPT_RSLT.\"TAX_RATE_3\") as \"TAX_RATE_3\", "
+"  to_char(0) as \"AMOUNT_INCLUDE_TAX\", "
+"  to_char(0) as \"HOME_CUR_AMOUNT\", "
+"  to_char(T_ACPT_RSLT.\"EXCH_RATE\") as \"EXCH_RATE\", "
+"  NULL as \"DLV_CD\", "
+"  NULL as \"ACPT_RSLT_COMMENT\", "
+"  T_RLSD_PUCH_ODR.\"ITEM_CD\" as \"ITEM_CD\", "
+"  decode(T_RLSD_PUCH_ODR.\"NON_NO_ITEM_FLG\", 0, M_ITEM.\"ITEM_NAME\", T_RLSD_PUCH_ODR.\"NON_NO_ITEM_NAME\") as \"ITEM_NAME\", "
+"  T_OD.\"JOB_ODR_CD\" as \"JOB_ODR_CD\", "
+"  M_ITEM.\"DRAW_CD\" as \"DRAW_CD\", "
+"  M_ITEM.\"SPEC\" as \"SPEC\", "
+"  to_char(nvl(M_ITEM.\"UNIT_QTY_TYP\", 2)) as \"UNIT_QTY_TYP\", "
+"  T_RLSD_PUCH_ODR.\"VEND_CD\" as \"VEND_CD\", "
+"  M_VEND_CTRL.\"VEND_NAME\" as \"VEND_NAME\", "
+"  to_char(T_RLSD_PUCH_ODR.\"PUCH_ODR_QTY\") as \"PUCH_ODR_QTY\", "
+"  to_char(T0.\"SUM_ACPT_QTY\") as \"SUM_ACPT_QTY\", "
+"  to_char(T_RLSD_PUCH_ODR.\"ACPT_INSPC_TYP\") as \"ACPT_INSPC_TYP\", "
+"  to_char(nvl(T_RLSD_PUCH_ODR.\"PUCH_ODR_SLIP_ISS_DATE\", T_RLSD_PUCH_ODR.\"PUCH_ODR_INST_DATE\"), 'YYYY/MM/DD') as \"PUCH_ODR_SLIP_ISS_DATE\", "
+"  to_char(T_RLSD_PUCH_ODR.\"PUCH_ODR_DLV_DATE\", 'YYYY/MM/DD') as \"PUCH_ODR_DLV_DATE\", "
+"  to_char(T_RLSD_PUCH_ODR.\"CONFIRM_DLV_DATE\", 'YYYY/MM/DD') as \"CONFIRM_DLV_DATE\", "
+"  T_RLSD_PUCH_ODR.\"WORK_IN_PROC_CD\" as \"WORK_IN_PROC_CD\", "
+"  T_WORK_IN_PROC_BY_PROC.\"PROC_NAME\" as \"PROC_NAME\", "
+"  T_RLSD_PUCH_ODR.\"PUCH_ODR_PERSON\" as \"PUCH_ODR_PERSON\", "
+"  USER_MST.\"USER_NAME\" as \"USER_NAME\", "
+"  to_char(T_RLSD_PUCH_ODR.\"PUCH_ODR_STS_TYP\") as \"PUCH_ODR_STS_TYP\", "
+"  to_char(T_RLSD_PUCH_ODR.\"INSPC_CMPLT_FLG\") as \"INSPC_CMPLT_FLG\", "
+"  to_char(T_RLSD_PUCH_ODR.\"SPL_ITEM_TYP\") as \"SPL_ITEM_TYP\", "
+"  to_char(decode(T_RLSD_PUCH_ODR.\"NON_NO_ITEM_FLG\", 0, M_ITEM.\"PRODUCT_TYP\", T_RLSD_PUCH_ODR.\"NON_NO_ITEM_TYP\")) as \"PRODUCT_TYP\", "
+"  to_char(T_RLSD_PUCH_ODR.\"NON_NO_ITEM_FLG\") as \"NON_NO_ITEM_FLG\", "
+"  T_RLSD_PUCH_ODR.\"PLANT_CD\" as \"PLANT_CD\", "
+"  T_RLSD_PUCH_ODR.\"COMPANY_CD\" as \"COMPANY_CD\", "
+"  T_ACPT_RSLT.\"TAX_CD\" as \"TAX_CD\", "
+"  to_char(nvl(M_VEND_CTRL.\"ROUND_TYP\", 3)) as \"ROUND_TYP\", "
+"  to_char(nvl(M_TAX.\"ROUND_TYP\", 3)) as \"TAX_ROUND_TYP\", "
+"  to_char(T_RLSD_PUCH_ODR.\"PUCH_ODR_START_DATE\", 'YYYY/MM/DD') as \"PUCH_ODR_START_DATE\", "
+"  to_char(SYS_DATE_CTRL.\"BUSINESS_OPR_DATE\", 'YYYY/MM/DD') as \"BUSINESS_OPR_DATE\", "
+"  T_RLSD_PUCH_ODR.\"ODR_CANCEL_CAUSE_CD\" as \"ODR_CANCEL_CAUSE_CD\", "
+"  to_char(T_RLSD_PUCH_ODR.\"ODR_CANCEL_SLIP_ISS_FLG\") as \"ODR_CANCEL_SLIP_ISS_FLG\", "
+"  T_RLSD_PUCH_ODR.\"PUCH_ODR_COMMENT\" as \"PUCH_ODR_COMMENT\", "
+"  T_RLSD_PUCH_ODR.\"WORK_ODR_CD\" as \"WORK_ODR_CD\", "
+"  to_char(M_ITEM.\"LOT_NUMBERING_TYP\") as \"LOT_NUMBERING_TYP\", "
+"  to_char(M_ITEM.\"LOT_CTRL_FLG\") as \"LOT_CTRL_FLG\", "
+"  to_char(T_WORK_IN_PROC_BY_PROC.\"FINAL_PROC_FLG\") as \"FINAL_PROC_FLG\", "
+"  decode(T_RLSD_PUCH_ODR.\"PUCH_ODR_SLIP_ISS_DATE\", NULL, 0, 1) as \"H_DATE_FLG\" "
+"from "
+"  T_RLSD_PUCH_ODR, "
+"  T_ACPT_RSLT, "
+"  T_OD, "
+"  T_WORK_IN_PROC_BY_PROC, "
+"  M_ITEM, "
+"  M_VEND_CTRL, "
+"  M_WH M_WH_1, "
+"  M_WH M_WH_2, "
+"  M_TAX, "
+"  M_CUR, "
+"  USER_MST, "
+"  ( "
+"    select "
+"      T_ACPT_RSLT.\"PUCH_ODR_CD\" as \"PUCH_ODR_CD\", "
+"      max(T_ACPT_RSLT.\"ACPT_NO\") as \"MAX_ACPT_NO\", "
+"      sum(T_ACPT_RSLT.\"ACPT_QTY\") as \"SUM_ACPT_QTY\" "
+"    from "
+"      T_ACPT_RSLT "
+"    where "
+"      T_ACPT_RSLT.PUCH_ODR_CD = ? "
+"    group by "
+"      T_ACPT_RSLT.\"PUCH_ODR_CD\" "
+"  ) T0, "
+"  SYS_DATE_CTRL, "
+"  SYS_HOME_CUR "
+"where "
+"  T_RLSD_PUCH_ODR.ITEM_CD = M_ITEM.ITEM_CD(+) "
+"  and T_RLSD_PUCH_ODR.COMPANY_CD = M_VEND_CTRL.COMPANY_CD(+) "
+"  and T_RLSD_PUCH_ODR.VEND_CD = M_VEND_CTRL.VEND_CD(+) "
+"  and T_RLSD_PUCH_ODR.OD_NO = T_OD.OD_NO(+) "
+"  and T_RLSD_PUCH_ODR.WORK_ODR_CD = T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD(+) "
+"  and T_RLSD_PUCH_ODR.WORK_IN_PROC_CD = T_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD(+) "
+"  and T_RLSD_PUCH_ODR.PUCH_ODR_PERSON = USER_MST.USER_CD(+) "
+"  and T_RLSD_PUCH_ODR.PUCH_ODR_CD = T_ACPT_RSLT.PUCH_ODR_CD "
+"  and T_ACPT_RSLT.ACPT_NO = T0.MAX_ACPT_NO "
+"  and T_ACPT_RSLT.WH_CD = M_WH_1.WH_CD(+) "
+"  and T_ACPT_RSLT.INSPC_WH_CD = M_WH_2.WH_CD(+) "
+"  and T_RLSD_PUCH_ODR.PLANT_CD = SYS_DATE_CTRL.PLANT_CD "
+"  and T_RLSD_PUCH_ODR.TAX_CD = M_TAX.TAX_CD(+) "
+"  and M_CUR.CUR_CD = nvl(M_VEND_CTRL.CUR_CD, SYS_HOME_CUR.HOME_CUR_CD) "
+"  and SYS_HOME_CUR.CTRL_CD = 'SYSTEM' "
+"  and T_RLSD_PUCH_ODR.\"PUCH_ODR_CD\" = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:FormSub1Insert_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:FormSub1Insert_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStr);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStrs);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:FormSub1Insert_read
			if(m_selcmd==null) throw new FoundationException("FormSub1Insert", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:FormSub1Insert_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:FormSub1Insert_read2
			if(m_selcmd==null) throw new FoundationException("FormSub1Insert", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStr);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:FormSub1Insert_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:FormSub1Insert_read3
			if(m_selcmd==null) throw new FoundationException("FormSub1Insert", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStrs);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:FormSub1Insert_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);

			try {
				List list=new ArrayList();

				while((data=next(rs))!=null) {
					list.add(data);
				}

				return list;
			} finally {
				rs.close();
				rs = null;
			}
		}

		/**
		 * クエリーのprepare処理
		 *
		 * @return PreparedStatementインスタンスを返します
		 * @param conn Native Connectionインスタンス
		 * @param query SQL文字列
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query, AE0060020Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getPUCH_ODR_CD());
				if(isNull(data.getPUCH_ODR_CD())) isNull = true;
				ary.addElement(data.getPUCH_ODR_CD());
				if(isNull(data.getPUCH_ODR_CD())) isNull = true;

				// 静的SQL文の生成
				stmt = conn.prepareStatement(query);

			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * データ読出し処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getPUCH_ODR_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getPUCH_ODR_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0060020Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0060020Struct data = new AE0060020Struct();

			data.setPUCH_ODR_CD( getString(1, rs) );
			data.setACPT_NO( getString(2, rs) );
			data.setPUCH_ODR_MODIFY_COUNT( getString(3, rs) );
			data.setACPT_MODIFY_COUNT( getString(4, rs) );
			data.setACPT_QTY( getString(5, rs) );
			data.setSTOCK_UNIT( getString(6, rs) );
			data.setACPT_DATE( getString(7, rs) );
			data.setVEND_LOT_NO( getString(8, rs) );
			data.setWH_CD( getString(9, rs) );
			data.setWH_NAME( getString(10, rs) );
			data.setINSPC_WH_CD( getString(11, rs) );
			data.setINSPC_WH_NAME( getString(12, rs) );
			data.setCUR_CD( getString(13, rs) );
			data.setCUR_NAME( getString(14, rs) );
			data.setVEND_CUR_UNIT( getString(15, rs) );
			data.setVEND_DECIMAL_FIG( getString(16, rs) );
			data.setUNIT_COST_TYP( getString(17, rs) );
			data.setUNIT_COST( getString(18, rs) );
			data.setPROCESSING_COST( getString(19, rs) );
			data.setMATERIAL_COST( getString(20, rs) );
			data.setOTHER_OVERHEADS( getString(21, rs) );
			data.setPUCH_ODR_AMOUNT( getString(22, rs) );
			data.setDISC_AMOUNT( getString(23, rs) );
			data.setNET_AMOUNT( getString(24, rs) );
			data.setTAX_AMOUNT_1( getString(25, rs) );
			data.setTAX_AMOUNT_2( getString(26, rs) );
			data.setTAX_AMOUNT_3( getString(27, rs) );
			data.setTAX_RATE_1( getString(28, rs) );
			data.setTAX_RATE_2( getString(29, rs) );
			data.setTAX_RATE_3( getString(30, rs) );
			data.setAMOUNT_INCLUDE_TAX( getString(31, rs) );
			data.setHOME_CUR_AMOUNT( getString(32, rs) );
			data.setEXCH_RATE( getString(33, rs) );
			data.setDLV_CD( getString(34, rs) );
			data.setACPT_RSLT_COMMENT( getString(35, rs) );
			data.setITEM_CD( getString(36, rs) );
			data.setITEM_NAME( getString(37, rs) );
			data.setJOB_ODR_CD( getString(38, rs) );
			data.setDRAW_CD( getString(39, rs) );
			data.setSPEC( getString(40, rs) );
			data.setUNIT_QTY_TYP( getString(41, rs) );
			data.setVEND_CD( getString(42, rs) );
			data.setVEND_NAME( getString(43, rs) );
			data.setPUCH_ODR_QTY( getString(44, rs) );
			data.setSUM_ACPT_QTY( getString(45, rs) );
			data.setACPT_INSPC_TYP( getString(46, rs) );
			data.setPUCH_ODR_SLIP_ISS_DATE( getString(47, rs) );
			data.setPUCH_ODR_DLV_DATE( getString(48, rs) );
			data.setCONFIRM_DLV_DATE( getString(49, rs) );
			data.setWORK_IN_PROC_CD( getString(50, rs) );
			data.setPROC_NAME( getString(51, rs) );
			data.setPUCH_ODR_PERSON( getString(52, rs) );
			data.setUSER_NAME( getString(53, rs) );
			data.setPUCH_ODR_STS_TYP( getString(54, rs) );
			data.setINSPC_CMPLT_FLG( getString(55, rs) );
			data.setSPL_ITEM_TYP( getString(56, rs) );
			data.setPRODUCT_TYP( getString(57, rs) );
			data.setNON_NO_ITEM_FLG( getString(58, rs) );
			data.setPLANT_CD( getString(59, rs) );
			data.setCOMPANY_CD( getString(60, rs) );
			data.setTAX_CD( getString(61, rs) );
			data.setROUND_TYP( getString(62, rs) );
			data.setTAX_ROUND_TYP( getString(63, rs) );
			data.setPUCH_ODR_START_DATE( getString(64, rs) );
			data.setBUSINESS_OPR_DATE( getString(65, rs) );
			data.setODR_CANCEL_CAUSE_CD( getString(66, rs) );
			data.setODR_CANCEL_SLIP_ISS_FLG( getString(67, rs) );
			data.setPUCH_ODR_COMMENT( getString(68, rs) );
			data.seth_WORK_ODR_CD( getString(69, rs) );
			data.seth_LOT_NUMBERING_TYP( getString(70, rs) );
			data.seth_LOT_CONTROL_FLG( getString(71, rs) );
			data.seth_FINAL_PROC_FLG( getString(72, rs) );
			data.seth_DATE_FLG( getString(73, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("FormSub1Insert", "hasRecord", "クエリー未登録");

			ResultSet rs=null;
			PreparedStatement stmt=null;

			try {
				stmt = prepare(conn, m_selcmd, data);

				rs = stmt.executeQuery();

				return rs.next();
			} finally {
				if(rs != null) {
					rs.close();
					rs = null;
				}
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return check(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:FormSub1Insert_check
			PreparedStatement stmt;

			if(m_chkcmd!=null) {
				stmt = prepare(conn, m_chkcmd, data);
			} else if(m_selcmd!=null) {
				stmt = prepare(conn, m_selcmd, data);
			} else {
				throw new FoundationException("FormSub1Insert", "check", "クエリー未登録");
			}

			try {
				return check(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:FormSub1Insert_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);
			boolean ret=true;

			try {
				if(rs.next()==false) return false;


				return ret;
			} finally {
				if (rs != null) {
					rs.close();
					rs = null;
				}
			}
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:FormSub1Insert_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:FormSub1Insert_clear

			return;
		}

		/**
		 * FormSub1Insertクラスの標準コンストラクタ
		 */
		public FormSub1Insert()
		{
			//{{user_implement_dev:FormSub1Insert_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:FormSub1Insert_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class FormSub1Update extends DataObject
	{
		protected String m_selcmd = "select "
+"  T_ACPT_RSLT.\"PUCH_ODR_CD\" as \"PUCH_ODR_CD\", "
+"  to_char(T_ACPT_RSLT.\"ACPT_NO\") as \"ACPT_NO\", "
+"  to_char(T_RLSD_PUCH_ODR.\"MODIFY_COUNT\") as \"PUCH_ODR_MODIFY_COUNT\", "
+"  to_char(T_ACPT_RSLT.\"MODIFY_COUNT\") as \"ACPT_MODIFY_COUNT\", "
+"  to_char(T_ACPT_RSLT.\"ACPT_QTY\") as \"ACPT_QTY\", "
+"  decode(T_RLSD_PUCH_ODR.\"NON_NO_ITEM_FLG\", 0, M_ITEM.\"STOCK_UNIT\", T_RLSD_PUCH_ODR.\"NON_NO_ITEM_PUCH_ODR_UNIT\") as \"STOCK_UNIT\", "
+"  to_char(T_ACPT_RSLT.\"ACPT_DATE\", 'YYYY/MM/DD') as \"ACPT_DATE\", "
+"  T_ACPT_RSLT.\"VEND_LOT_NO\" as \"VEND_LOT_NO\", "
+"  T_ACPT_RSLT.\"WH_CD\" as \"WH_CD\", "
+"  M_WH_1.\"WH_NAME\" as \"WH_NAME\", "
+"  T_ACPT_RSLT.\"INSPC_WH_CD\" as \"INSPC_WH_CD\", "
+"  M_WH_2.\"WH_NAME\" as \"INSPC_WH_NAME\", "
+"  M_CUR.\"CUR_CD\" as \"CUR_CD\", "
+"  M_CUR.\"CUR_NAME\" as \"CUR_NAME\", "
+"  M_CUR.\"CUR_UNIT\" as \"CUR_UNIT\", "
+"  to_char(M_CUR.\"DECIMAL_FIG\") as \"DECIMAL_FIG\", "
+"  to_char(T_ACPT_RSLT.\"UNIT_COST_TYP\") as \"UNIT_COST_TYP\", "
+"  to_char(T_ACPT_RSLT.\"UNIT_COST\") as \"UNIT_COST\", "
+"  to_char(T_ACPT_RSLT.\"PROCESSING_COST\") as \"PROCESSING_COST\", "
+"  to_char(T_ACPT_RSLT.\"MATERIAL_COST\") as \"MATERIAL_COST\", "
+"  to_char(T_ACPT_RSLT.\"OTHER_OVERHEADS\") as \"OTHER_OVERHEADS\", "
+"  to_char(T_ACPT_RSLT.\"PUCH_ODR_AMOUNT\") as \"PUCH_ODR_AMOUNT\", "
+"  to_char(T_ACPT_RSLT.\"DISC_AMOUNT\") as \"DISC_AMOUNT\", "
+"  to_char(T_ACPT_RSLT.\"NET_AMOUNT\") as \"NET_AMOUNT\", "
+"  to_char(T_ACPT_RSLT.\"TAX_AMOUNT_1\") as \"TAX_AMOUNT_1\", "
+"  to_char(T_ACPT_RSLT.\"TAX_AMOUNT_2\") as \"TAX_AMOUNT_2\", "
+"  to_char(T_ACPT_RSLT.\"TAX_AMOUNT_3\") as \"TAX_AMOUNT_3\", "
+"  to_char(T_ACPT_RSLT.\"TAX_RATE_1\") as \"TAX_RATE_1\", "
+"  to_char(T_ACPT_RSLT.\"TAX_RATE_2\") as \"TAX_RATE_2\", "
+"  to_char(T_ACPT_RSLT.\"TAX_RATE_3\") as \"TAX_RATE_3\", "
+"  to_char(T_ACPT_RSLT.\"AMOUNT_INCLUDE_TAX\") as \"AMOUNT_INCLUDE_TAX\", "
+"  to_char(T_ACPT_RSLT.\"HOME_CUR_AMOUNT\") as \"HOME_CUR_AMOUNT\", "
+"  to_char(T_ACPT_RSLT.\"EXCH_RATE\") as \"EXCH_RATE\", "
+"  T_ACPT_RSLT.\"DLV_CD\" as \"DLV_CD\", "
+"  T_ACPT_RSLT.\"ACPT_RSLT_COMMENT\" as \"ACPT_RSLT_COMMENT\", "
+"  T_RLSD_PUCH_ODR.\"ITEM_CD\" as \"ITEM_CD\", "
+"  decode(T_RLSD_PUCH_ODR.\"NON_NO_ITEM_FLG\", 0, M_ITEM.\"ITEM_NAME\", T_RLSD_PUCH_ODR.\"NON_NO_ITEM_NAME\") as \"ITEM_NAME\", "
+"  T_OD.\"JOB_ODR_CD\" as \"JOB_ODR_CD\", "
+"  M_ITEM.\"DRAW_CD\" as \"DRAW_CD\", "
+"  M_ITEM.\"SPEC\" as \"SPEC\", "
+"  to_char(nvl(M_ITEM.\"UNIT_QTY_TYP\", 2)) as \"UNIT_QTY_TYP\", "
+"  T_RLSD_PUCH_ODR.\"VEND_CD\" as \"VEND_CD\", "
+"  M_VEND_CTRL.\"VEND_NAME\" as \"VEND_NAME\", "
+"  to_char(T_RLSD_PUCH_ODR.\"PUCH_ODR_QTY\") as \"PUCH_ODR_QTY\", "
+"  to_char(T0.\"SUM_ACPT_QTY\" - T_ACPT_RSLT.\"ACPT_QTY\") as \"SUM_ACPT_QTY\", "
+"  to_char(T_RLSD_PUCH_ODR.\"ACPT_INSPC_TYP\") as \"ACPT_INSPC_TYP\", "
+"  to_char(nvl(T_RLSD_PUCH_ODR.\"PUCH_ODR_SLIP_ISS_DATE\", T_RLSD_PUCH_ODR.\"PUCH_ODR_INST_DATE\"), 'YYYY/MM/DD') as \"PUCH_ODR_SLIP_ISS_DATE\", "
+"  to_char(T_RLSD_PUCH_ODR.\"PUCH_ODR_DLV_DATE\", 'YYYY/MM/DD') as \"PUCH_ODR_DLV_DATE\", "
+"  to_char(T_RLSD_PUCH_ODR.\"CONFIRM_DLV_DATE\", 'YYYY/MM/DD') as \"CONFIRM_DLV_DATE\", "
+"  T_RLSD_PUCH_ODR.\"WORK_IN_PROC_CD\" as \"WORK_IN_PROC_CD\", "
+"  T_WORK_IN_PROC_BY_PROC.\"PROC_NAME\" as \"PROC_NAME\", "
+"  T_RLSD_PUCH_ODR.\"PUCH_ODR_PERSON\" as \"PUCH_ODR_PERSON\", "
+"  USER_MST.\"USER_NAME\" as \"USER_NAME\", "
+"  to_char(T_RLSD_PUCH_ODR.\"PUCH_ODR_STS_TYP\") as \"PUCH_ODR_STS_TYP\", "
+"  to_char(T_RLSD_PUCH_ODR.\"INSPC_CMPLT_FLG\") as \"INSPC_CMPLT_FLG\", "
+"  to_char(T_RLSD_PUCH_ODR.\"SPL_ITEM_TYP\") as \"SPL_ITEM_TYP\", "
+"  to_char(decode(T_RLSD_PUCH_ODR.\"NON_NO_ITEM_FLG\", 0, M_ITEM.\"PRODUCT_TYP\", T_RLSD_PUCH_ODR.\"NON_NO_ITEM_TYP\")) as \"PRODUCT_TYP\", "
+"  to_char(T_RLSD_PUCH_ODR.\"NON_NO_ITEM_FLG\") as \"NON_NO_ITEM_FLG\", "
+"  T_RLSD_PUCH_ODR.\"PLANT_CD\" as \"PLANT_CD\", "
+"  T_RLSD_PUCH_ODR.\"COMPANY_CD\" as \"COMPANY_CD\", "
+"  T_ACPT_RSLT.\"TAX_CD\" as \"TAX_CD\", "
+"  to_char(nvl(M_VEND_CTRL.\"ROUND_TYP\", 3)) as \"ROUND_TYP\", "
+"  to_char(nvl(M_TAX.\"ROUND_TYP\", 3)) as \"TAX_ROUND_TYP\", "
+"  to_char(T_RLSD_PUCH_ODR.\"PUCH_ODR_START_DATE\", 'YYYY/MM/DD') as \"PUCH_ODR_START_DATE\", "
+"  to_char(SYS_DATE_CTRL.\"BUSINESS_OPR_DATE\", 'YYYY/MM/DD') as \"BUSINESS_OPR_DATE\", "
+"  T_RLSD_PUCH_ODR.\"ODR_CANCEL_CAUSE_CD\" as \"ODR_CANCEL_CAUSE_CD\", "
+"  to_char(T_RLSD_PUCH_ODR.\"ODR_CANCEL_SLIP_ISS_FLG\") as \"ODR_CANCEL_SLIP_ISS_FLG\", "
+"  T_RLSD_PUCH_ODR.\"PUCH_ODR_COMMENT\" as \"PUCH_ODR_COMMENT\", "
+"  T_RLSD_PUCH_ODR.\"WORK_ODR_CD\" as \"WORK_ODR_CD\", "
+"  to_char(M_ITEM.\"LOT_NUMBERING_TYP\") as \"LOT_NUMBERING_TYP\", "
+"  to_char(M_ITEM.\"LOT_CTRL_FLG\") as \"LOT_CTRL_FLG\", "
+"  to_char(T_WORK_IN_PROC_BY_PROC.\"FINAL_PROC_FLG\") as \"FINAL_PROC_FLG\", "
+"  T_ACPT_RSLT.\"LOT_NO\" as \"LOT_NO\", "
+"  decode(T_RLSD_PUCH_ODR.\"PUCH_ODR_SLIP_ISS_DATE\", NULL, 0, 1) as \"H_DATE_FLG\" "
+"from "
+"  T_RLSD_PUCH_ODR, "
+"  T_ACPT_RSLT, "
+"  T_OD, "
+"  T_WORK_IN_PROC_BY_PROC, "
+"  M_ITEM, "
+"  M_VEND_CTRL, "
+"  M_WH M_WH_1, "
+"  M_WH M_WH_2, "
+"  M_TAX, "
+"  M_CUR, "
+"  USER_MST, "
+"  ( "
+"    select "
+"      T_ACPT_RSLT.\"PUCH_ODR_CD\" as \"PUCH_ODR_CD\", "
+"      sum(T_ACPT_RSLT.\"ACPT_QTY\") as \"SUM_ACPT_QTY\" "
+"    from "
+"      T_ACPT_RSLT "
+"    where "
+"      T_ACPT_RSLT.PUCH_ODR_CD = ? "
+"    group by "
+"      T_ACPT_RSLT.\"PUCH_ODR_CD\" "
+"  ) T0, "
+"  SYS_DATE_CTRL, "
+"  SYS_HOME_CUR "
+"where "
+"  T_RLSD_PUCH_ODR.ITEM_CD = M_ITEM.ITEM_CD(+) "
+"  and T_RLSD_PUCH_ODR.COMPANY_CD = M_VEND_CTRL.COMPANY_CD(+) "
+"  and T_RLSD_PUCH_ODR.VEND_CD = M_VEND_CTRL.VEND_CD(+) "
+"  and T_RLSD_PUCH_ODR.OD_NO = T_OD.OD_NO(+) "
+"  and T_RLSD_PUCH_ODR.WORK_ODR_CD = T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD(+) "
+"  and T_RLSD_PUCH_ODR.WORK_IN_PROC_CD = T_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD(+) "
+"  and T_RLSD_PUCH_ODR.PUCH_ODR_PERSON = USER_MST.USER_CD(+) "
+"  and T_RLSD_PUCH_ODR.PUCH_ODR_CD = T_ACPT_RSLT.PUCH_ODR_CD "
+"  and T_ACPT_RSLT.PUCH_ODR_CD = T0.PUCH_ODR_CD "
+"  and T_ACPT_RSLT.WH_CD = M_WH_1.WH_CD(+) "
+"  and T_ACPT_RSLT.INSPC_WH_CD = M_WH_2.WH_CD(+) "
+"  and T_RLSD_PUCH_ODR.PLANT_CD = SYS_DATE_CTRL.PLANT_CD "
+"  and T_RLSD_PUCH_ODR.TAX_CD = M_TAX.TAX_CD(+) "
+"  and M_CUR.CUR_CD = nvl(M_VEND_CTRL.CUR_CD, SYS_HOME_CUR.HOME_CUR_CD) "
+"  and SYS_HOME_CUR.CTRL_CD = 'SYSTEM' "
+"  and T_ACPT_RSLT.\"PUCH_ODR_CD\" = ? "
+"  and T_ACPT_RSLT.\"ACPT_NO\" = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:FormSub1Update_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:FormSub1Update_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStr);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStrs);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:FormSub1Update_read
			if(m_selcmd==null) throw new FoundationException("FormSub1Update", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:FormSub1Update_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:FormSub1Update_read2
			if(m_selcmd==null) throw new FoundationException("FormSub1Update", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStr);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:FormSub1Update_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:FormSub1Update_read3
			if(m_selcmd==null) throw new FoundationException("FormSub1Update", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStrs);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:FormSub1Update_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);

			try {
				List list=new ArrayList();

				while((data=next(rs))!=null) {
					list.add(data);
				}

				return list;
			} finally {
				rs.close();
				rs = null;
			}
		}

		/**
		 * クエリーのprepare処理
		 *
		 * @return PreparedStatementインスタンスを返します
		 * @param conn Native Connectionインスタンス
		 * @param query SQL文字列
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query, AE0060020Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getPUCH_ODR_CD());
				if(isNull(data.getPUCH_ODR_CD())) isNull = true;
				ary.addElement(data.getPUCH_ODR_CD());
				if(isNull(data.getPUCH_ODR_CD())) isNull = true;
				ary.addElement(data.getl_ACPT_NO());
				if(isNull(data.getl_ACPT_NO())) isNull = true;

				// 静的SQL文の生成
				stmt = conn.prepareStatement(query);

			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * データ読出し処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getPUCH_ODR_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getPUCH_ODR_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getl_ACPT_NO(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0060020Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0060020Struct data = new AE0060020Struct();

			data.setPUCH_ODR_CD( getString(1, rs) );
			data.setACPT_NO( getString(2, rs) );
			data.setPUCH_ODR_MODIFY_COUNT( getString(3, rs) );
			data.setACPT_MODIFY_COUNT( getString(4, rs) );
			data.setACPT_QTY( getString(5, rs) );
			data.setSTOCK_UNIT( getString(6, rs) );
			data.setACPT_DATE( getString(7, rs) );
			data.setVEND_LOT_NO( getString(8, rs) );
			data.setWH_CD( getString(9, rs) );
			data.setWH_NAME( getString(10, rs) );
			data.setINSPC_WH_CD( getString(11, rs) );
			data.setINSPC_WH_NAME( getString(12, rs) );
			data.setCUR_CD( getString(13, rs) );
			data.setCUR_NAME( getString(14, rs) );
			data.setVEND_CUR_UNIT( getString(15, rs) );
			data.setVEND_DECIMAL_FIG( getString(16, rs) );
			data.setUNIT_COST_TYP( getString(17, rs) );
			data.setUNIT_COST( getString(18, rs) );
			data.setPROCESSING_COST( getString(19, rs) );
			data.setMATERIAL_COST( getString(20, rs) );
			data.setOTHER_OVERHEADS( getString(21, rs) );
			data.setPUCH_ODR_AMOUNT( getString(22, rs) );
			data.setDISC_AMOUNT( getString(23, rs) );
			data.setNET_AMOUNT( getString(24, rs) );
			data.setTAX_AMOUNT_1( getString(25, rs) );
			data.setTAX_AMOUNT_2( getString(26, rs) );
			data.setTAX_AMOUNT_3( getString(27, rs) );
			data.setTAX_RATE_1( getString(28, rs) );
			data.setTAX_RATE_2( getString(29, rs) );
			data.setTAX_RATE_3( getString(30, rs) );
			data.setAMOUNT_INCLUDE_TAX( getString(31, rs) );
			data.setHOME_CUR_AMOUNT( getString(32, rs) );
			data.setEXCH_RATE( getString(33, rs) );
			data.setDLV_CD( getString(34, rs) );
			data.setACPT_RSLT_COMMENT( getString(35, rs) );
			data.setITEM_CD( getString(36, rs) );
			data.setITEM_NAME( getString(37, rs) );
			data.setJOB_ODR_CD( getString(38, rs) );
			data.setDRAW_CD( getString(39, rs) );
			data.setSPEC( getString(40, rs) );
			data.setUNIT_QTY_TYP( getString(41, rs) );
			data.setVEND_CD( getString(42, rs) );
			data.setVEND_NAME( getString(43, rs) );
			data.setPUCH_ODR_QTY( getString(44, rs) );
			data.setSUM_ACPT_QTY( getString(45, rs) );
			data.setACPT_INSPC_TYP( getString(46, rs) );
			data.setPUCH_ODR_SLIP_ISS_DATE( getString(47, rs) );
			data.setPUCH_ODR_DLV_DATE( getString(48, rs) );
			data.setCONFIRM_DLV_DATE( getString(49, rs) );
			data.setWORK_IN_PROC_CD( getString(50, rs) );
			data.setPROC_NAME( getString(51, rs) );
			data.setPUCH_ODR_PERSON( getString(52, rs) );
			data.setUSER_NAME( getString(53, rs) );
			data.setPUCH_ODR_STS_TYP( getString(54, rs) );
			data.setINSPC_CMPLT_FLG( getString(55, rs) );
			data.setSPL_ITEM_TYP( getString(56, rs) );
			data.setPRODUCT_TYP( getString(57, rs) );
			data.setNON_NO_ITEM_FLG( getString(58, rs) );
			data.setPLANT_CD( getString(59, rs) );
			data.setCOMPANY_CD( getString(60, rs) );
			data.setTAX_CD( getString(61, rs) );
			data.setROUND_TYP( getString(62, rs) );
			data.setTAX_ROUND_TYP( getString(63, rs) );
			data.setPUCH_ODR_START_DATE( getString(64, rs) );
			data.setBUSINESS_OPR_DATE( getString(65, rs) );
			data.setODR_CANCEL_CAUSE_CD( getString(66, rs) );
			data.setODR_CANCEL_SLIP_ISS_FLG( getString(67, rs) );
			data.setPUCH_ODR_COMMENT( getString(68, rs) );
			data.seth_WORK_ODR_CD( getString(69, rs) );
			data.seth_LOT_NUMBERING_TYP( getString(70, rs) );
			data.seth_LOT_CONTROL_FLG( getString(71, rs) );
			data.seth_FINAL_PROC_FLG( getString(72, rs) );
			data.setLOT_NO( getString(73, rs) );
			data.seth_DATE_FLG( getString(74, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("FormSub1Update", "hasRecord", "クエリー未登録");

			ResultSet rs=null;
			PreparedStatement stmt=null;

			try {
				stmt = prepare(conn, m_selcmd, data);

				rs = stmt.executeQuery();

				return rs.next();
			} finally {
				if(rs != null) {
					rs.close();
					rs = null;
				}
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return check(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:FormSub1Update_check
			PreparedStatement stmt;

			if(m_chkcmd!=null) {
				stmt = prepare(conn, m_chkcmd, data);
			} else if(m_selcmd!=null) {
				stmt = prepare(conn, m_selcmd, data);
			} else {
				throw new FoundationException("FormSub1Update", "check", "クエリー未登録");
			}

			try {
				return check(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:FormSub1Update_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);
			boolean ret=true;

			try {
				if(rs.next()==false) return false;


				return ret;
			} finally {
				if (rs != null) {
					rs.close();
					rs = null;
				}
			}
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:FormSub1Update_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:FormSub1Update_clear

			return;
		}

		/**
		 * FormSub1Updateクラスの標準コンストラクタ
		 */
		public FormSub1Update()
		{
			//{{user_implement_dev:FormSub1Update_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:FormSub1Update_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class T_ACPT_RSLT extends DataObject
	{
		protected String m_selcmd = "select "
+"  to_char(T_ACPT_RSLT.\"ACPT_STS_TYP\") as \"ACPT_STS_TYP\" "
+"from "
+"  T_ACPT_RSLT "
+"where "
+"  T_ACPT_RSLT.\"PUCH_ODR_CD\" = ? "
+"  and T_ACPT_RSLT.\"ACPT_NO\" = ?";
		protected String m_chkcmd = "select "
+"  T_ACPT_RSLT.\"PUCH_ODR_CD\" as \"PUCH_ODR_CD\" "
+"from "
+"  T_ACPT_RSLT "
+"where "
+"  T_ACPT_RSLT.\"PUCH_ODR_CD\" = ? "
+"  and T_ACPT_RSLT.\"ACPT_NO\" = to_number(?)";
		protected String m_inscmd = "insert into "
+"  T_ACPT_RSLT(\"PUCH_ODR_CD\", \"ACPT_NO\", \"ACPT_QTY\", \"ACPT_DATE\", \"ITEM_CD\", \"NON_NO_ITEM_NAME\", \"UNIT_COST\", \"UNIT_COST_TYP\", \"PROCESSING_COST\", \"MATERIAL_COST\", \"OTHER_OVERHEADS\", \"DISC_AMOUNT\", \"PUCH_ODR_AMOUNT\", \"ACPT_STS_TYP\", \"DLV_CD\", \"PLANT_CD\", \"WH_CD\", \"INSPC_WH_CD\", \"ACPT_RSLT_COMMENT\", \"INVOICE_CD\", \"RATE_JUDGE_DATE\", \"EXCH_RATE\", \"TAX_RATE_1\", \"TAX_RATE_2\", \"TAX_RATE_3\", \"NET_AMOUNT\", \"TAX_AMOUNT_1\", \"TAX_AMOUNT_2\", \"TAX_AMOUNT_3\", \"AMOUNT_INCLUDE_TAX\", \"HOME_CUR_AMOUNT\", \"TAX_CD\", \"TAX_ROUND_TYP\", \"LOT_NO\", \"VEND_LOT_NO\", \"ACPT_CRCT_NO\") "
+"values "
+"  (?, to_number(?), to_number(?), to_date(?, 'YYYY/MM/DD'), ?, ?, to_number(?), to_number(?), to_number(?), to_number(?), to_number(?), to_number(?), to_number(?), to_number(?), ?, ?, ?, ?, ?, NULL, to_date(?), to_number(?), to_number(?), to_number(?), to_number(?), to_number(?), to_number(?), to_number(?), to_number(?), to_number(?), to_number(?), ?, to_number(?), ?, ?, 0)";
		protected String m_updcmd = "update "
+"  T_ACPT_RSLT "
+"set "
+"  \"ACPT_QTY\" = to_number(?), "
+"  \"ACPT_DATE\" = to_date(?, 'YYYY/MM/DD'), "
+"  \"ITEM_CD\" = ?, "
+"  \"NON_NO_ITEM_NAME\" = ?, "
+"  \"UNIT_COST\" = to_number(?), "
+"  \"UNIT_COST_TYP\" = to_number(?), "
+"  \"PROCESSING_COST\" = to_number(?), "
+"  \"MATERIAL_COST\" = to_number(?), "
+"  \"OTHER_OVERHEADS\" = to_number(?), "
+"  \"DISC_AMOUNT\" = to_number(?), "
+"  \"PUCH_ODR_AMOUNT\" = to_number(?), "
+"  \"ACPT_STS_TYP\" = to_number(?), "
+"  \"DLV_CD\" = ?, "
+"  \"PLANT_CD\" = ?, "
+"  \"INSPC_WH_CD\" = ?, "
+"  \"WH_CD\" = ?, "
+"  \"ACPT_RSLT_COMMENT\" = ?, "
+"  \"INVOICE_CD\" = NULL, "
+"  \"RATE_JUDGE_DATE\" = to_date(?, 'yyyy/mm/dd'), "
+"  \"EXCH_RATE\" = to_number(?), "
+"  \"TAX_RATE_1\" = to_number(?), "
+"  \"TAX_RATE_2\" = to_number(?), "
+"  \"TAX_RATE_3\" = to_number(?), "
+"  \"NET_AMOUNT\" = to_number(?), "
+"  \"TAX_AMOUNT_1\" = to_number(?), "
+"  \"TAX_AMOUNT_2\" = to_number(?), "
+"  \"TAX_AMOUNT_3\" = to_number(?), "
+"  \"AMOUNT_INCLUDE_TAX\" = to_number(?), "
+"  \"HOME_CUR_AMOUNT\" = to_number(?), "
+"  \"TAX_CD\" = ?, "
+"  \"TAX_ROUND_TYP\" = to_number(?), "
+"  \"LOT_NO\" = ?, "
+"  \"VEND_LOT_NO\" = ?, "
+"  \"ACPT_CRCT_NO\" = (ACPT_CRCT_NO + 1) "
+"where "
+"  T_ACPT_RSLT.\"PUCH_ODR_CD\" = ? "
+"  and T_ACPT_RSLT.\"ACPT_NO\" = ?";
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="AE0060020";
		protected String m_sUpdateProgramName="AE0060020";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:T_ACPT_RSLT_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:T_ACPT_RSLT_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStr);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStrs);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_ACPT_RSLT_read
			if(m_selcmd==null) throw new FoundationException("T_ACPT_RSLT", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:T_ACPT_RSLT_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_ACPT_RSLT_read2
			if(m_selcmd==null) throw new FoundationException("T_ACPT_RSLT", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStr);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:T_ACPT_RSLT_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_ACPT_RSLT_read3
			if(m_selcmd==null) throw new FoundationException("T_ACPT_RSLT", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStrs);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:T_ACPT_RSLT_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);

			try {
				List list=new ArrayList();

				while((data=next(rs))!=null) {
					list.add(data);
				}

				return list;
			} finally {
				if (rs != null) {
					rs.close();
					rs = null;
				}
			}
		}

		/**
		 * クエリーのprepare処理
		 *
		 * @return PreparedStatementインスタンスを返します
		 * @param conn Native Connectionインスタンス
		 * @param query SQL文字列
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query, AE0060020Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getPUCH_ODR_CD());
				if(isNull(data.getPUCH_ODR_CD())) isNull = true;
				ary.addElement(data.getACPT_NO());
				if(isNull(data.getACPT_NO())) isNull = true;

				// 静的SQL文の生成
				stmt = conn.prepareStatement(query);

			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * データ読出し処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getPUCH_ODR_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getACPT_NO(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0060020Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0060020Struct data = new AE0060020Struct();

			data.setACPT_STS_TYP( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("T_ACPT_RSLT", "hasRecord", "クエリー未登録");

			ResultSet rs=null;
			PreparedStatement stmt=null;

			try {
				stmt = prepare(conn, m_selcmd, data);

				rs = stmt.executeQuery();

				return rs.next();
			} finally {
				if(rs!=null) {
					rs.close();
					rs = null;
				}
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return check(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_ACPT_RSLT_check
			PreparedStatement stmt;

			if(m_chkcmd!=null) {
				stmt = prepare(conn, m_chkcmd, data);
			} else if(m_selcmd!=null) {
				stmt = prepare(conn, m_selcmd, data);
			} else {
				throw new FoundationException("T_ACPT_RSLT", "check", "クエリー未登録");
			}

			try {
				return check(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:T_ACPT_RSLT_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);
			boolean ret=true;

			try {
				if(rs.next()==false) return false;


				return ret;
			} finally {
				if (rs != null) {
					rs.close();
					rs = null;
				}
			}
		}

		/**
		 * レコード新規追加処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int create(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return create(conn.getConn(), data);
		}

		/**
		 * レコード新規追加処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int create(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt=null;

			try {
				if("Oracle".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_I(m_inscmd));
				} else if("Microsoft SQL Server".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_I_MSSQL(m_inscmd));
				} else if("PostgreSQL".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_I_PGSQL(m_inscmd));
				} else if("MySQL".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_I_MYSQL(m_inscmd));
				} else {
					stmt = conn.prepareStatement(objMessage.replaceSQL_I_DB2(m_inscmd));
				}

				setString(1, data.getsSysdate(), stmt);
				setString(2, data.getsUser_ID(), stmt);
				setString(3, m_sCreateProgramName, stmt);
				setString(4, data.getsSysdate(), stmt);
				setString(5, data.getsUser_ID(), stmt);
				setString(6, m_sCreateProgramName, stmt);
				setString(7, data.getPUCH_ODR_CD(), stmt);
				setString(8, data.getACPT_NO(), stmt);
				setString(9, data.getACPT_QTY(), stmt);
				setString(10, data.getACPT_DATE(), stmt);
				setString(11, data.getITEM_CD(), stmt);
				setString(12, data.getITEM_NAME(), stmt);
				setString(13, data.getUNIT_COST(), stmt);
				setString(14, data.getUNIT_COST_TYP(), stmt);
				setString(15, data.getPROCESSING_COST(), stmt);
				setString(16, data.getMATERIAL_COST(), stmt);
				setString(17, data.getOTHER_OVERHEADS(), stmt);
				setString(18, data.getDISC_AMOUNT(), stmt);
				setString(19, data.getPUCH_ODR_AMOUNT(), stmt);
				setString(20, data.getACPT_STS_TYP(), stmt);
				setString(21, data.getDLV_CD(), stmt);
				setString(22, data.getPLANT_CD(), stmt);
				setString(23, data.getWH_CD(), stmt);
				setString(24, data.getINSPC_WH_CD(), stmt);
				setString(25, data.getACPT_RSLT_COMMENT(), stmt);
				setString(26, data.getACPT_DATE(), stmt);
				setString(27, data.getEXCH_RATE(), stmt);
				setString(28, data.getTAX_RATE_1(), stmt);
				setString(29, data.getTAX_RATE_2(), stmt);
				setString(30, data.getTAX_RATE_3(), stmt);
				setString(31, data.getNET_AMOUNT(), stmt);
				setString(32, data.getTAX_AMOUNT_1(), stmt);
				setString(33, data.getTAX_AMOUNT_2(), stmt);
				setString(34, data.getTAX_AMOUNT_3(), stmt);
				setString(35, data.getAMOUNT_INCLUDE_TAX(), stmt);
				setString(36, data.getHOME_CUR_AMOUNT(), stmt);
				setString(37, data.getTAX_CD(), stmt);
				setString(38, data.getTAX_ROUND_TYP(), stmt);
				setString(39, data.getLOT_NO(), stmt);
				setString(40, data.getVEND_LOT_NO(), stmt);

				return stmt.executeUpdate();
			} finally {
				if(stmt!=null) {
					stmt.close();
					stmt = null;
				}
			}
		}
		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return update(conn.getConn(), data);
		}

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt=null;
			int modifyCount;

			try {
				if("Oracle".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U(m_updcmd));
				} else if("Microsoft SQL Server".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U_MSSQL(m_updcmd));
				} else if("PostgreSQL".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U_PGSQL(m_updcmd));
				} else if("MySQL".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U_MYSQL(m_updcmd));
				} else {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U_DB2(m_updcmd));
				}

				setString(1, data.getsSysdate(), stmt);
				setString(2, data.getsUser_ID(), stmt);
				setString(3, m_sUpdateProgramName, stmt);
				setString(4, data.getACPT_QTY(), stmt);
				setString(5, data.getACPT_DATE(), stmt);
				setString(6, data.getITEM_CD(), stmt);
				setString(7, data.getITEM_NAME(), stmt);
				setString(8, data.getUNIT_COST(), stmt);
				setString(9, data.getUNIT_COST_TYP(), stmt);
				setString(10, data.getPROCESSING_COST(), stmt);
				setString(11, data.getMATERIAL_COST(), stmt);
				setString(12, data.getOTHER_OVERHEADS(), stmt);
				setString(13, data.getDISC_AMOUNT(), stmt);
				setString(14, data.getPUCH_ODR_AMOUNT(), stmt);
				setString(15, data.getACPT_STS_TYP(), stmt);
				setString(16, data.getDLV_CD(), stmt);
				setString(17, data.getPLANT_CD(), stmt);
				setString(18, data.getINSPC_WH_CD(), stmt);
				setString(19, data.getWH_CD(), stmt);
				setString(20, data.getACPT_RSLT_COMMENT(), stmt);
				setString(21, data.getACPT_DATE(), stmt);
				setString(22, data.getEXCH_RATE(), stmt);
				setString(23, data.getTAX_RATE_1(), stmt);
				setString(24, data.getTAX_RATE_2(), stmt);
				setString(25, data.getTAX_RATE_3(), stmt);
				setString(26, data.getNET_AMOUNT(), stmt);
				setString(27, data.getTAX_AMOUNT_1(), stmt);
				setString(28, data.getTAX_AMOUNT_2(), stmt);
				setString(29, data.getTAX_AMOUNT_3(), stmt);
				setString(30, data.getAMOUNT_INCLUDE_TAX(), stmt);
				setString(31, data.getHOME_CUR_AMOUNT(), stmt);
				setString(32, data.getTAX_CD(), stmt);
				setString(33, data.getTAX_ROUND_TYP(), stmt);
				setString(34, data.getLOT_NO(), stmt);
				setString(35, data.getVEND_LOT_NO(), stmt);
				setString(36, data.getPUCH_ODR_CD(), stmt);
				setString(37, data.getACPT_NO(), stmt);

				return stmt.executeUpdate();
			} finally {
				if(stmt!=null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:T_ACPT_RSLT_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:T_ACPT_RSLT_clear

			return;
		}

		/**
		 * T_ACPT_RSLTクラスの標準コンストラクタ
		 */
		public T_ACPT_RSLT()
		{
			//{{user_implement_dev:T_ACPT_RSLT_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:T_ACPT_RSLT_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class T_INSPC_RSLT extends DataObject
	{
		protected String m_selcmd = "select "
+"  to_char(T_INSPC_RSLT.\"INSPECTED_QTY\", 'fm999999999999999990.0999') as \"INSPECTED_QTY\" "
+"from "
+"  T_INSPC_RSLT "
+"where "
+"  T_INSPC_RSLT.\"PUCH_ODR_CD\" = ? "
+"  and T_INSPC_RSLT.\"ACPT_NO\" = to_number(?)";
		protected String m_chkcmd = null;
		protected String m_inscmd = "insert into "
+"  T_INSPC_RSLT(\"PUCH_ODR_CD\", \"ACPT_NO\", \"INSPECTED_QTY\", \"ACCEPTED_QTY\", \"INSPEC_DATE\", \"PLANT_CD\", \"INSPC_WH_CD\", \"WH_CD\", \"INSPEC_RSLT_COMMENT\", \"LOT_NO\", \"VEND_LOT_NO\", \"INSPC_CRCT_NO\") "
+"values "
+"  (?, to_number(?), to_number(?), to_number(?), to_date(?, 'YYYY/MM/DD'), ?, ?, ?, NULL, ?, ?, 0)";
		protected String m_updcmd = "update "
+"  T_INSPC_RSLT "
+"set "
+"  \"INSPECTED_QTY\" = to_number(?), "
+"  \"ACCEPTED_QTY\" = to_number(?), "
+"  \"INSPEC_DATE\" = to_date(?, 'YYYY/MM/DD'), "
+"  \"PLANT_CD\" = ?, "
+"  \"INSPC_WH_CD\" = ?, "
+"  \"WH_CD\" = ?, "
+"  \"INSPEC_RSLT_COMMENT\" = NULL, "
+"  \"LOT_NO\" = ?, "
+"  \"VEND_LOT_NO\" = ?, "
+"  \"INSPC_CRCT_NO\" = (INSPC_CRCT_NO + 1) "
+"where "
+"  T_INSPC_RSLT.\"PUCH_ODR_CD\" = ? "
+"  and T_INSPC_RSLT.\"ACPT_NO\" = ?";
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="AE0060020";
		protected String m_sUpdateProgramName="AE0060020";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:T_INSPC_RSLT_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:T_INSPC_RSLT_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStr);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStrs);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_INSPC_RSLT_read
			if(m_selcmd==null) throw new FoundationException("T_INSPC_RSLT", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:T_INSPC_RSLT_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_INSPC_RSLT_read2
			if(m_selcmd==null) throw new FoundationException("T_INSPC_RSLT", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStr);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:T_INSPC_RSLT_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_INSPC_RSLT_read3
			if(m_selcmd==null) throw new FoundationException("T_INSPC_RSLT", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStrs);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:T_INSPC_RSLT_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);

			try {
				List list=new ArrayList();

				while((data=next(rs))!=null) {
					list.add(data);
				}

				return list;
			} finally {
				if (rs != null) {
					rs.close();
					rs = null;
				}
			}
		}

		/**
		 * クエリーのprepare処理
		 *
		 * @return PreparedStatementインスタンスを返します
		 * @param conn Native Connectionインスタンス
		 * @param query SQL文字列
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query, AE0060020Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getPUCH_ODR_CD());
				if(isNull(data.getPUCH_ODR_CD())) isNull = true;
				ary.addElement(data.getACPT_NO());
				if(isNull(data.getACPT_NO())) isNull = true;

				// 静的SQL文の生成
				stmt = conn.prepareStatement(query);

			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * データ読出し処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getPUCH_ODR_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getACPT_NO(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0060020Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0060020Struct data = new AE0060020Struct();

			data.setINSPECTED_QTY( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("T_INSPC_RSLT", "hasRecord", "クエリー未登録");

			ResultSet rs=null;
			PreparedStatement stmt=null;

			try {
				stmt = prepare(conn, m_selcmd, data);

				rs = stmt.executeQuery();

				return rs.next();
			} finally {
				if(rs!=null) {
					rs.close();
					rs = null;
				}
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return check(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_INSPC_RSLT_check
			PreparedStatement stmt;

			if(m_chkcmd!=null) {
				stmt = prepare(conn, m_chkcmd, data);
			} else if(m_selcmd!=null) {
				stmt = prepare(conn, m_selcmd, data);
			} else {
				throw new FoundationException("T_INSPC_RSLT", "check", "クエリー未登録");
			}

			try {
				return check(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:T_INSPC_RSLT_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);
			boolean ret=true;

			try {
				if(rs.next()==false) return false;


				return ret;
			} finally {
				if (rs != null) {
					rs.close();
					rs = null;
				}
			}
		}
		/**
		 * レコード新規追加処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int create(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return create(conn.getConn(), data);
		}

		/**
		 * レコード新規追加処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int create(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt=null;

			try {
				if("Oracle".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_I(m_inscmd));
				} else if("Microsoft SQL Server".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_I_MSSQL(m_inscmd));
				} else if("PostgreSQL".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_I_PGSQL(m_inscmd));
				} else if("MySQL".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_I_MYSQL(m_inscmd));
				} else {
					stmt = conn.prepareStatement(objMessage.replaceSQL_I_DB2(m_inscmd));
				}

				setString(1, data.getsSysdate(), stmt);
				setString(2, data.getsUser_ID(), stmt);
				setString(3, m_sCreateProgramName, stmt);
				setString(4, data.getsSysdate(), stmt);
				setString(5, data.getsUser_ID(), stmt);
				setString(6, m_sCreateProgramName, stmt);
				setString(7, data.getPUCH_ODR_CD(), stmt);
				setString(8, data.getACPT_NO(), stmt);
				setString(9, data.getACPT_QTY(), stmt);
				setString(10, data.getACPT_QTY(), stmt);
				setString(11, data.getACPT_DATE(), stmt);
				setString(12, data.getPLANT_CD(), stmt);
				setString(13, data.getINSPC_WH_CD(), stmt);
				setString(14, data.getWH_CD(), stmt);
				setString(15, data.getLOT_NO(), stmt);
				setString(16, data.getVEND_LOT_NO(), stmt);

				return stmt.executeUpdate();
			} finally {
				if(stmt!=null) {
					stmt.close();
					stmt = null;
				}
			}
		}
		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return update(conn.getConn(), data);
		}

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt=null;
			int modifyCount;

			try {
				if("Oracle".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U(m_updcmd));
				} else if("Microsoft SQL Server".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U_MSSQL(m_updcmd));
				} else if("PostgreSQL".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U_PGSQL(m_updcmd));
				} else if("MySQL".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U_MYSQL(m_updcmd));
				} else {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U_DB2(m_updcmd));
				}

				setString(1, data.getsSysdate(), stmt);
				setString(2, data.getsUser_ID(), stmt);
				setString(3, m_sUpdateProgramName, stmt);
				setString(4, data.getACPT_QTY(), stmt);
				setString(5, data.getACPT_QTY(), stmt);
				setString(6, data.getACPT_DATE(), stmt);
				setString(7, data.getPLANT_CD(), stmt);
				setString(8, data.getINSPC_WH_CD(), stmt);
				setString(9, data.getWH_CD(), stmt);
				setString(10, data.getLOT_NO(), stmt);
				setString(11, data.getVEND_LOT_NO(), stmt);
				setString(12, data.getPUCH_ODR_CD(), stmt);
				setString(13, data.getACPT_NO(), stmt);

				return stmt.executeUpdate();
			} finally {
				if(stmt!=null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:T_INSPC_RSLT_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:T_INSPC_RSLT_clear

			return;
		}

		/**
		 * T_INSPC_RSLTクラスの標準コンストラクタ
		 */
		public T_INSPC_RSLT()
		{
			//{{user_implement_dev:T_INSPC_RSLT_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:T_INSPC_RSLT_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class T_RLSD_PUCH_ODR extends DataObject
	{
		protected String m_selcmd = "select "
+"  to_char(T_RLSD_PUCH_ODR.\"PUCH_ODR_STS_TYP\") as \"PUCH_ODR_STS_TYP\", "
+"  to_char(T_RLSD_PUCH_ODR.\"INSPC_CMPLT_FLG\") as \"INSPC_CMPLT_FLG\", "
+"  T_RLSD_PUCH_ODR.\"PLANT_CD\" as \"PLANT_CD\", "
+"  to_char(T_RLSD_PUCH_ODR.\"ACPT_INSPC_TYP\") as \"ACPT_INSPC_TYP\", "
+"  T_RLSD_PUCH_ODR.\"TAX_CD\" as \"TAX_CD\", "
+"  to_char(T_RLSD_PUCH_ODR.\"MODIFY_COUNT\") as \"MODIFY_COUNT\", "
+"  to_char(T_RLSD_PUCH_ODR.\"ODR_CANCEL_SLIP_ISS_FLG\") as \"ODR_CANCEL_SLIP_ISS_FLG\" "
+"from "
+"  T_RLSD_PUCH_ODR "
+"where "
+"  T_RLSD_PUCH_ODR.\"PUCH_ODR_CD\" = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:T_RLSD_PUCH_ODR_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:T_RLSD_PUCH_ODR_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStr);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStrs);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_RLSD_PUCH_ODR_read
			if(m_selcmd==null) throw new FoundationException("T_RLSD_PUCH_ODR", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:T_RLSD_PUCH_ODR_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_RLSD_PUCH_ODR_read2
			if(m_selcmd==null) throw new FoundationException("T_RLSD_PUCH_ODR", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStr);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:T_RLSD_PUCH_ODR_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_RLSD_PUCH_ODR_read3
			if(m_selcmd==null) throw new FoundationException("T_RLSD_PUCH_ODR", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStrs);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:T_RLSD_PUCH_ODR_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);

			try {
				List list=new ArrayList();

				while((data=next(rs))!=null) {
					list.add(data);
				}

				return list;
			} finally {
				if (rs != null) {
					rs.close();
					rs = null;
				}
			}
		}

		/**
		 * クエリーのprepare処理
		 *
		 * @return PreparedStatementインスタンスを返します
		 * @param conn Native Connectionインスタンス
		 * @param query SQL文字列
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query, AE0060020Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getPUCH_ODR_CD());
				if(isNull(data.getPUCH_ODR_CD())) isNull = true;

				// 静的SQL文の生成
				stmt = conn.prepareStatement(query);

			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * データ読出し処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getPUCH_ODR_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0060020Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0060020Struct data = new AE0060020Struct();

			data.setPUCH_ODR_STS_TYP( getString(1, rs) );
			data.setINSPC_CMPLT_FLG( getString(2, rs) );
			data.setPLANT_CD( getString(3, rs) );
			data.setACPT_INSPC_TYP( getString(4, rs) );
			data.setTAX_CD( getString(5, rs) );
			data.setPUCH_ODR_MODIFY_COUNT( getString(6, rs) );
			data.setODR_CANCEL_SLIP_ISS_FLG( getString(7, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("T_RLSD_PUCH_ODR", "hasRecord", "クエリー未登録");

			ResultSet rs=null;
			PreparedStatement stmt=null;

			try {
				stmt = prepare(conn, m_selcmd, data);

				rs = stmt.executeQuery();

				return rs.next();
			} finally {
				if(rs!=null) {
					rs.close();
					rs = null;
				}
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return check(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_RLSD_PUCH_ODR_check
			PreparedStatement stmt;

			if(m_chkcmd!=null) {
				stmt = prepare(conn, m_chkcmd, data);
			} else if(m_selcmd!=null) {
				stmt = prepare(conn, m_selcmd, data);
			} else {
				throw new FoundationException("T_RLSD_PUCH_ODR", "check", "クエリー未登録");
			}

			try {
				return check(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:T_RLSD_PUCH_ODR_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);
			boolean ret=true;

			try {
				if(rs.next()==false) return false;


				return ret;
			} finally {
				if (rs != null) {
					rs.close();
					rs = null;
				}
			}
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:T_RLSD_PUCH_ODR_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:T_RLSD_PUCH_ODR_clear

			return;
		}

		/**
		 * T_RLSD_PUCH_ODRクラスの標準コンストラクタ
		 */
		public T_RLSD_PUCH_ODR()
		{
			//{{user_implement_dev:T_RLSD_PUCH_ODR_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:T_RLSD_PUCH_ODR_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class M_WH extends DataObject
	{
		protected String m_selcmd = "select "
+"  M_WH.\"PLANT_CD\" as \"PLANT_CD\" "
+"from "
+"  M_WH "
+"where "
+"  M_WH.\"WH_CD\" = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:M_WH_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:M_WH_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStr);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStrs);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:M_WH_read
			if(m_selcmd==null) throw new FoundationException("M_WH", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:M_WH_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:M_WH_read2
			if(m_selcmd==null) throw new FoundationException("M_WH", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStr);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:M_WH_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:M_WH_read3
			if(m_selcmd==null) throw new FoundationException("M_WH", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStrs);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:M_WH_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);

			try {
				List list=new ArrayList();

				while((data=next(rs))!=null) {
					list.add(data);
				}

				return list;
			} finally {
				rs.close();
				rs = null;
			}
		}

		/**
		 * クエリーのprepare処理
		 *
		 * @return PreparedStatementインスタンスを返します
		 * @param conn Native Connectionインスタンス
		 * @param query SQL文字列
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query, AE0060020Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getWH_CD());
				if(isNull(data.getWH_CD())) isNull = true;

				// 静的SQL文の生成
				stmt = conn.prepareStatement(query);

			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * データ読出し処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getWH_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0060020Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0060020Struct data = new AE0060020Struct();

			data.setPLANT_CD( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("M_WH", "hasRecord", "クエリー未登録");

			ResultSet rs=null;
			PreparedStatement stmt=null;

			try {
				stmt = prepare(conn, m_selcmd, data);

				rs = stmt.executeQuery();

				return rs.next();
			} finally {
				if(rs != null) {
					rs.close();
					rs = null;
				}
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return check(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:M_WH_check
			PreparedStatement stmt;

			if(m_chkcmd!=null) {
				stmt = prepare(conn, m_chkcmd, data);
			} else if(m_selcmd!=null) {
				stmt = prepare(conn, m_selcmd, data);
			} else {
				throw new FoundationException("M_WH", "check", "クエリー未登録");
			}

			try {
				return check(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:M_WH_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);
			boolean ret=true;

			try {
				if(rs.next()==false) return false;


				return ret;
			} finally {
				if (rs != null) {
					rs.close();
					rs = null;
				}
			}
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:M_WH_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:M_WH_clear

			return;
		}

		/**
		 * M_WHクラスの標準コンストラクタ
		 */
		public M_WH()
		{
			//{{user_implement_dev:M_WH_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:M_WH_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class M_TAX extends DataObject
	{
		protected String m_selcmd = "select "
+"  to_char(M_TAX.\"MODIFY_COUNT\") as \"MODIFY_COUNT\" "
+"from "
+"  M_TAX "
+"where "
+"  M_TAX.\"TAX_CD\" = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:M_TAX_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:M_TAX_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStr);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStrs);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:M_TAX_read
			if(m_selcmd==null) throw new FoundationException("M_TAX", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:M_TAX_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:M_TAX_read2
			if(m_selcmd==null) throw new FoundationException("M_TAX", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStr);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:M_TAX_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:M_TAX_read3
			if(m_selcmd==null) throw new FoundationException("M_TAX", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStrs);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:M_TAX_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);

			try {
				List list=new ArrayList();

				while((data=next(rs))!=null) {
					list.add(data);
				}

				return list;
			} finally {
				rs.close();
				rs = null;
			}
		}

		/**
		 * クエリーのprepare処理
		 *
		 * @return PreparedStatementインスタンスを返します
		 * @param conn Native Connectionインスタンス
		 * @param query SQL文字列
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query, AE0060020Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getTAX_CD());
				if(isNull(data.getTAX_CD())) isNull = true;

				// 静的SQL文の生成
				stmt = conn.prepareStatement(query);

			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * データ読出し処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getTAX_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0060020Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0060020Struct data = new AE0060020Struct();

			data.setMODIFY_COUNT( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("M_TAX", "hasRecord", "クエリー未登録");

			ResultSet rs=null;
			PreparedStatement stmt=null;

			try {
				stmt = prepare(conn, m_selcmd, data);

				rs = stmt.executeQuery();

				return rs.next();
			} finally {
				if(rs != null) {
					rs.close();
					rs = null;
				}
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return check(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:M_TAX_check
			PreparedStatement stmt;

			if(m_chkcmd!=null) {
				stmt = prepare(conn, m_chkcmd, data);
			} else if(m_selcmd!=null) {
				stmt = prepare(conn, m_selcmd, data);
			} else {
				throw new FoundationException("M_TAX", "check", "クエリー未登録");
			}

			try {
				return check(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:M_TAX_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);
			boolean ret=true;

			try {
				if(rs.next()==false) return false;


				return ret;
			} finally {
				if (rs != null) {
					rs.close();
					rs = null;
				}
			}
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:M_TAX_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:M_TAX_clear

			return;
		}

		/**
		 * M_TAXクラスの標準コンストラクタ
		 */
		public M_TAX()
		{
			//{{user_implement_dev:M_TAX_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:M_TAX_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class T_RLSD_PUCH_ODRForComplete extends DataObject
	{
		protected String m_selcmd = "select "
+"  to_char(9) as \"PUCH_ODR_STS_TYP\", "
+"  to_char(decode(T_RLSD_PUCH_ODR.\"ACPT_INSPC_TYP\", 1, 1, decode(T1.\"MIN_ACPT_STS_TYP\", 2, 1, 0))) as \"INSPC_CMPLT_FLG\", "
+"  to_char(T1.\"MAX_ACPT_DATE\", 'YYYY/MM/DD') as \"ACPT_CMPLT_DATE\", "
+"  to_char(decode(T_RLSD_PUCH_ODR.\"ACPT_INSPC_TYP\", 1, T2.\"MAX_INSPEC_DATE\", decode(T1.\"MIN_ACPT_STS_TYP\", 2, T2.\"MAX_INSPEC_DATE\", null)), 'YYYY/MM/DD') as \"INSPC_CMPLT_DATE\", "
+"  T_RLSD_PUCH_ODR.\"PUCH_ODR_CD\" as \"PUCH_ODR_CD\" "
+"from "
+"  T_RLSD_PUCH_ODR, "
+"  ( "
+"    select "
+"      T_ACPT_RSLT.\"PUCH_ODR_CD\" as \"PUCH_ODR_CD\", "
+"      max(T_ACPT_RSLT.\"ACPT_DATE\") as \"MAX_ACPT_DATE\", "
+"      min(T_ACPT_RSLT.\"ACPT_STS_TYP\") as \"MIN_ACPT_STS_TYP\" "
+"    from "
+"      T_ACPT_RSLT "
+"    group by "
+"      T_ACPT_RSLT.\"PUCH_ODR_CD\" "
+"  ) T1, "
+"  ( "
+"    select "
+"      T_INSPC_RSLT.\"PUCH_ODR_CD\" as \"PUCH_ODR_CD\", "
+"      max(T_INSPC_RSLT.\"INSPEC_DATE\") as \"MAX_INSPEC_DATE\" "
+"    from "
+"      T_INSPC_RSLT "
+"    group by "
+"      T_INSPC_RSLT.\"PUCH_ODR_CD\" "
+"  ) T2 "
+"where "
+"  T_RLSD_PUCH_ODR.PUCH_ODR_CD = T1.PUCH_ODR_CD "
+"  and T_RLSD_PUCH_ODR.PUCH_ODR_CD = T2.PUCH_ODR_CD(+) "
+"  and T_RLSD_PUCH_ODR.PUCH_ODR_CD = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = "update "
+"  T_RLSD_PUCH_ODR "
+"set "
+"  \"PUCH_ODR_STS_TYP\" = to_number(?), "
+"  \"INSPC_CMPLT_FLG\" = to_number(?), "
+"  \"ACPT_CMPLT_DATE\" = to_date(?, 'YYYY/MM/DD'), "
+"  \"INSPC_CMPLT_DATE\" = to_date(?, 'YYYY/MM/DD'), "
+"  \"ODR_CANCEL_CAUSE_CD\" = ?, "
+"  \"ODR_CANCEL_SLIP_ISS_FLG\" = to_number(?) "
+"where "
+"  T_RLSD_PUCH_ODR.\"PUCH_ODR_CD\" = ?";
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="AE0060020";
		protected String m_sUpdateProgramName="AE0060020";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:T_RLSD_PUCH_ODRForComplete_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:T_RLSD_PUCH_ODRForComplete_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStr);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStrs);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_RLSD_PUCH_ODRForComplete_read
			if(m_selcmd==null) throw new FoundationException("T_RLSD_PUCH_ODRForComplete", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:T_RLSD_PUCH_ODRForComplete_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_RLSD_PUCH_ODRForComplete_read2
			if(m_selcmd==null) throw new FoundationException("T_RLSD_PUCH_ODRForComplete", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStr);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:T_RLSD_PUCH_ODRForComplete_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_RLSD_PUCH_ODRForComplete_read3
			if(m_selcmd==null) throw new FoundationException("T_RLSD_PUCH_ODRForComplete", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStrs);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:T_RLSD_PUCH_ODRForComplete_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);

			try {
				List list=new ArrayList();

				while((data=next(rs))!=null) {
					list.add(data);
				}

				return list;
			} finally {
				if (rs != null) {
					rs.close();
					rs = null;
				}
			}
		}

		/**
		 * クエリーのprepare処理
		 *
		 * @return PreparedStatementインスタンスを返します
		 * @param conn Native Connectionインスタンス
		 * @param query SQL文字列
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query, AE0060020Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getPUCH_ODR_CD());
				if(isNull(data.getPUCH_ODR_CD())) isNull = true;

				// 静的SQL文の生成
				stmt = conn.prepareStatement(query);

			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * データ読出し処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getPUCH_ODR_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0060020Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0060020Struct data = new AE0060020Struct();

			data.setPUCH_ODR_STS_TYP( getString(1, rs) );
			data.setINSPC_CMPLT_FLG( getString(2, rs) );
			data.setACPT_DATE( getString(3, rs) );
			data.setINSPC_CMPLT_DATE( getString(4, rs) );
			data.setPUCH_ODR_CD( getString(5, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("T_RLSD_PUCH_ODRForComplete", "hasRecord", "クエリー未登録");

			ResultSet rs=null;
			PreparedStatement stmt=null;

			try {
				stmt = prepare(conn, m_selcmd, data);

				rs = stmt.executeQuery();

				return rs.next();
			} finally {
				if(rs!=null) {
					rs.close();
					rs = null;
				}
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return check(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_RLSD_PUCH_ODRForComplete_check
			PreparedStatement stmt;

			if(m_chkcmd!=null) {
				stmt = prepare(conn, m_chkcmd, data);
			} else if(m_selcmd!=null) {
				stmt = prepare(conn, m_selcmd, data);
			} else {
				throw new FoundationException("T_RLSD_PUCH_ODRForComplete", "check", "クエリー未登録");
			}

			try {
				return check(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:T_RLSD_PUCH_ODRForComplete_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);
			boolean ret=true;

			try {
				if(rs.next()==false) return false;


				return ret;
			} finally {
				if (rs != null) {
					rs.close();
					rs = null;
				}
			}
		}
		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return update(conn.getConn(), data);
		}

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt=null;
			int modifyCount;

			try {
				if("Oracle".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U(m_updcmd));
				} else if("Microsoft SQL Server".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U_MSSQL(m_updcmd));
				} else if("PostgreSQL".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U_PGSQL(m_updcmd));
				} else if("MySQL".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U_MYSQL(m_updcmd));
				} else {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U_DB2(m_updcmd));
				}

				setString(1, data.getsSysdate(), stmt);
				setString(2, data.getsUser_ID(), stmt);
				setString(3, m_sUpdateProgramName, stmt);
				setString(4, data.getPUCH_ODR_STS_TYP(), stmt);
				setString(5, data.getINSPC_CMPLT_FLG(), stmt);
				setString(6, data.getACPT_DATE(), stmt);
				setString(7, data.getINSPC_CMPLT_DATE(), stmt);
				setString(8, data.getODR_CANCEL_CAUSE_CD(), stmt);
				setString(9, data.getODR_CANCEL_SLIP_ISS_FLG(), stmt);
				setString(10, data.getPUCH_ODR_CD(), stmt);

				return stmt.executeUpdate();
			} finally {
				if(stmt!=null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:T_RLSD_PUCH_ODRForComplete_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:T_RLSD_PUCH_ODRForComplete_clear

			return;
		}

		/**
		 * T_RLSD_PUCH_ODRForCompleteクラスの標準コンストラクタ
		 */
		public T_RLSD_PUCH_ODRForComplete()
		{
			//{{user_implement_dev:T_RLSD_PUCH_ODRForComplete_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:T_RLSD_PUCH_ODRForComplete_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class T_RLSD_PUCH_ODRForCancel extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = "update "
+"  T_RLSD_PUCH_ODR "
+"set "
+"  \"PUCH_ODR_STS_TYP\" = 2, "
+"  \"ACPT_CMPLT_DATE\" = NULL, "
+"  \"INSPC_CMPLT_FLG\" = decode(\"ACPT_INSPC_TYP\", 1, 0, \"INSPC_CMPLT_FLG\"), "
+"  \"INSPC_CMPLT_DATE\" = decode(\"ACPT_INSPC_TYP\", 1, NULL, \"INSPC_CMPLT_DATE\") "
+"where "
+"  T_RLSD_PUCH_ODR.\"PUCH_ODR_CD\" = ?";
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="AE0060020";
		protected String m_sUpdateProgramName="AE0060020";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:T_RLSD_PUCH_ODRForCancel_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:T_RLSD_PUCH_ODRForCancel_def

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return update(conn.getConn(), data);
		}

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt=null;
			int modifyCount;

			try {
				if("Oracle".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U(m_updcmd));
				} else if("Microsoft SQL Server".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U_MSSQL(m_updcmd));
				} else if("PostgreSQL".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U_PGSQL(m_updcmd));
				} else if("MySQL".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U_MYSQL(m_updcmd));
				} else {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U_DB2(m_updcmd));
				}

				setString(1, data.getsSysdate(), stmt);
				setString(2, data.getsUser_ID(), stmt);
				setString(3, m_sUpdateProgramName, stmt);
				setString(4, data.getPUCH_ODR_CD(), stmt);

				return stmt.executeUpdate();
			} finally {
				if(stmt!=null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:T_RLSD_PUCH_ODRForCancel_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:T_RLSD_PUCH_ODRForCancel_clear

			return;
		}

		/**
		 * T_RLSD_PUCH_ODRForCancelクラスの標準コンストラクタ
		 */
		public T_RLSD_PUCH_ODRForCancel()
		{
			//{{user_implement_dev:T_RLSD_PUCH_ODRForCancel_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:T_RLSD_PUCH_ODRForCancel_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class T_ACPT_RSLT_Lock extends DataObject
	{
		protected String m_selcmd = "select "
+"  to_char(T_ACPT_RSLT.\"MODIFY_COUNT\") as \"MODIFY_COUNT\" "
+"from "
+"  T_ACPT_RSLT "
+"where "
+"  T_ACPT_RSLT.\"PUCH_ODR_CD\" = ? "
+"  and T_ACPT_RSLT.\"ACPT_NO\" = to_number(?) "
+"for update nowait";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:T_ACPT_RSLT_Lock_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:T_ACPT_RSLT_Lock_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStr);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStrs);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_ACPT_RSLT_Lock_read
			if(m_selcmd==null) throw new FoundationException("T_ACPT_RSLT_Lock", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:T_ACPT_RSLT_Lock_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_ACPT_RSLT_Lock_read2
			if(m_selcmd==null) throw new FoundationException("T_ACPT_RSLT_Lock", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStr);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:T_ACPT_RSLT_Lock_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_ACPT_RSLT_Lock_read3
			if(m_selcmd==null) throw new FoundationException("T_ACPT_RSLT_Lock", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStrs);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:T_ACPT_RSLT_Lock_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);

			try {
				List list=new ArrayList();

				while((data=next(rs))!=null) {
					list.add(data);
				}

				return list;
			} finally {
				rs.close();
				rs = null;
			}
		}

		/**
		 * クエリーのprepare処理
		 *
		 * @return PreparedStatementインスタンスを返します
		 * @param conn Native Connectionインスタンス
		 * @param query SQL文字列
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query, AE0060020Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getPUCH_ODR_CD());
				if(isNull(data.getPUCH_ODR_CD())) isNull = true;
				ary.addElement(data.getACPT_NO());
				if(isNull(data.getACPT_NO())) isNull = true;

				// 静的SQL文の生成
				stmt = conn.prepareStatement(query);

			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * データ読出し処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getPUCH_ODR_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getACPT_NO(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0060020Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0060020Struct data = new AE0060020Struct();

			data.setACPT_MODIFY_COUNT( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("T_ACPT_RSLT_Lock", "hasRecord", "クエリー未登録");

			ResultSet rs=null;
			PreparedStatement stmt=null;

			try {
				stmt = prepare(conn, m_selcmd, data);

				rs = stmt.executeQuery();

				return rs.next();
			} finally {
				if(rs != null) {
					rs.close();
					rs = null;
				}
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return check(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_ACPT_RSLT_Lock_check
			PreparedStatement stmt;

			if(m_chkcmd!=null) {
				stmt = prepare(conn, m_chkcmd, data);
			} else if(m_selcmd!=null) {
				stmt = prepare(conn, m_selcmd, data);
			} else {
				throw new FoundationException("T_ACPT_RSLT_Lock", "check", "クエリー未登録");
			}

			try {
				return check(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:T_ACPT_RSLT_Lock_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);
			boolean ret=true;

			try {
				if(rs.next()==false) return false;


				return ret;
			} finally {
				if (rs != null) {
					rs.close();
					rs = null;
				}
			}
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:T_ACPT_RSLT_Lock_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:T_ACPT_RSLT_Lock_clear

			return;
		}

		/**
		 * T_ACPT_RSLT_Lockクラスの標準コンストラクタ
		 */
		public T_ACPT_RSLT_Lock()
		{
			//{{user_implement_dev:T_ACPT_RSLT_Lock_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:T_ACPT_RSLT_Lock_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class T_RLSD_PUCH_ODR_Lock extends DataObject
	{
		protected String m_selcmd = "select "
+"  to_char(T_RLSD_PUCH_ODR.\"MODIFY_COUNT\") as \"MODIFY_COUNT\" "
+"from "
+"  T_RLSD_PUCH_ODR "
+"where "
+"  T_RLSD_PUCH_ODR.\"PUCH_ODR_CD\" = ? "
+"for update nowait";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:T_RLSD_PUCH_ODR_Lock_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:T_RLSD_PUCH_ODR_Lock_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStr);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStrs);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_RLSD_PUCH_ODR_Lock_read
			if(m_selcmd==null) throw new FoundationException("T_RLSD_PUCH_ODR_Lock", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:T_RLSD_PUCH_ODR_Lock_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_RLSD_PUCH_ODR_Lock_read2
			if(m_selcmd==null) throw new FoundationException("T_RLSD_PUCH_ODR_Lock", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStr);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:T_RLSD_PUCH_ODR_Lock_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_RLSD_PUCH_ODR_Lock_read3
			if(m_selcmd==null) throw new FoundationException("T_RLSD_PUCH_ODR_Lock", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStrs);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:T_RLSD_PUCH_ODR_Lock_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);

			try {
				List list=new ArrayList();

				while((data=next(rs))!=null) {
					list.add(data);
				}

				return list;
			} finally {
				rs.close();
				rs = null;
			}
		}

		/**
		 * クエリーのprepare処理
		 *
		 * @return PreparedStatementインスタンスを返します
		 * @param conn Native Connectionインスタンス
		 * @param query SQL文字列
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query, AE0060020Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getPUCH_ODR_CD());
				if(isNull(data.getPUCH_ODR_CD())) isNull = true;

				// 静的SQL文の生成
				stmt = conn.prepareStatement(query);

			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * データ読出し処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getPUCH_ODR_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0060020Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0060020Struct data = new AE0060020Struct();

			data.setPUCH_ODR_MODIFY_COUNT( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("T_RLSD_PUCH_ODR_Lock", "hasRecord", "クエリー未登録");

			ResultSet rs=null;
			PreparedStatement stmt=null;

			try {
				stmt = prepare(conn, m_selcmd, data);

				rs = stmt.executeQuery();

				return rs.next();
			} finally {
				if(rs != null) {
					rs.close();
					rs = null;
				}
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return check(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_RLSD_PUCH_ODR_Lock_check
			PreparedStatement stmt;

			if(m_chkcmd!=null) {
				stmt = prepare(conn, m_chkcmd, data);
			} else if(m_selcmd!=null) {
				stmt = prepare(conn, m_selcmd, data);
			} else {
				throw new FoundationException("T_RLSD_PUCH_ODR_Lock", "check", "クエリー未登録");
			}

			try {
				return check(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:T_RLSD_PUCH_ODR_Lock_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);
			boolean ret=true;

			try {
				if(rs.next()==false) return false;


				return ret;
			} finally {
				if (rs != null) {
					rs.close();
					rs = null;
				}
			}
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:T_RLSD_PUCH_ODR_Lock_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:T_RLSD_PUCH_ODR_Lock_clear

			return;
		}

		/**
		 * T_RLSD_PUCH_ODR_Lockクラスの標準コンストラクタ
		 */
		public T_RLSD_PUCH_ODR_Lock()
		{
			//{{user_implement_dev:T_RLSD_PUCH_ODR_Lock_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:T_RLSD_PUCH_ODR_Lock_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class T_ISSUE_INST extends DataObject
	{
		protected String m_selcmd = "select "
+"  T_ISSUE_INST.\"ISSUE_INST_CD\" as \"ISSUE_INST_CD\", "
+"  T_ISSUE_INST.\"PLANT_CD\" as \"PLANT_CD\", "
+"  T_ISSUE_INST.\"OD_NO\" as \"OD_NO\", "
+"  T_ISSUE_INST.\"ITEM_CD\" as \"ITEM_CD\", "
+"  T_ISSUE_INST.\"PUCH_ODR_CD\" as \"PUCH_ODR_CD\", "
+"  T_ISSUE_INST.\"COMPANY_CD\" as \"COMPANY_CD\", "
+"  T_ISSUE_INST.\"VEND_CD\" as \"VEND_CD\", "
+"  T_ISSUE_INST.\"CONS_TYP\" as \"CONS_TYP\", "
+"  T_ISSUE_INST.\"ISSUE_INST_UNIT_DENOMINATOR\" as \"ISSUE_INST_UNIT_DENOMINATOR\", "
+"  T_ISSUE_INST.\"ISSUE_INST_UNIT_NUMERATOR\" as \"ISSUE_INST_UNIT_NUMERATOR\", "
+"  T_OD.\"JOB_ODR_CD\" as \"JOB_ODR_CD\", "
+"  T_OD.\"JOB_ODR_DETAIL_NO\" as \"JOB_ODR_DETAIL_NO\", "
+"  T_OD.\"MRP_ODR_TYP\" as \"MRP_ODR_TYP\", "
+"  M_ITEM.\"UNIT_QTY_TYP\" as \"UNIT_QTY_TYP\", "
+"  M_ITEM.\"LOT_CTRL_FLG\" as \"LOT_CTRL_FLG\" "
+"from "
+"  T_ISSUE_INST, "
+"  T_OD, "
+"  M_ITEM "
+"where "
+"  T_ISSUE_INST.OD_NO = T_OD.OD_NO(+) "
+"  and T_ISSUE_INST.ITEM_CD = M_ITEM.ITEM_CD(+) "
+"  and T_ISSUE_INST.PUCH_ODR_CD = ? "
+"  and T_ISSUE_INST.WH_CD IS NOT NULL "
+"  and(T_ISSUE_INST.ISSUE_TYP = 1 "
+"  or  T_ISSUE_INST.ISSUE_TYP = 2) "
+"  and T_ISSUE_INST.CONS_TYP != 0";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:T_ISSUE_INST_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:T_ISSUE_INST_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStr);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStrs);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_ISSUE_INST_read
			if(m_selcmd==null) throw new FoundationException("T_ISSUE_INST", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:T_ISSUE_INST_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_ISSUE_INST_read2
			if(m_selcmd==null) throw new FoundationException("T_ISSUE_INST", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStr);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:T_ISSUE_INST_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_ISSUE_INST_read3
			if(m_selcmd==null) throw new FoundationException("T_ISSUE_INST", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStrs);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:T_ISSUE_INST_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);

			try {
				List list=new ArrayList();

				while((data=next(rs))!=null) {
					list.add(data);
				}

				return list;
			} finally {
				rs.close();
				rs = null;
			}
		}

		/**
		 * クエリーのprepare処理
		 *
		 * @return PreparedStatementインスタンスを返します
		 * @param conn Native Connectionインスタンス
		 * @param query SQL文字列
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query, AE0060020Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getPUCH_ODR_CD());
				if(isNull(data.getPUCH_ODR_CD())) isNull = true;

				// 静的SQL文の生成
				stmt = conn.prepareStatement(query);

			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * データ読出し処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getPUCH_ODR_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0060020Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0060020Struct data = new AE0060020Struct();

			data.setreadISSUE_INST_CD( getString(1, rs) );
			data.setreadPLANT_CD( getString(2, rs) );
			data.setreadOD_NO( getString(3, rs) );
			data.setreadITEM_CD( getString(4, rs) );
			data.setreadPUCH_ODR_CD( getString(5, rs) );
			data.setreadCOMPANY_CD( getString(6, rs) );
			data.setreadVEND_CD( getString(7, rs) );
			data.setreadCONS_TYP( getString(8, rs) );
			data.setreadISSUE_INST_UNIT_DENOMINATOR( getString(9, rs) );
			data.setreadISSUE_INST_UNIT_NUMERATOR( getString(10, rs) );
			data.setreadJOB_ODR_CD( getString(11, rs) );
			data.setreadJOB_ODR_DETAIL_NO( getString(12, rs) );
			data.setreadMRP_ODR_TYP( getString(13, rs) );
			data.setreadUNIT_QTY_TYP( getString(14, rs) );
			data.setreadLOT_CONTROL_FLG( getString(15, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("T_ISSUE_INST", "hasRecord", "クエリー未登録");

			ResultSet rs=null;
			PreparedStatement stmt=null;

			try {
				stmt = prepare(conn, m_selcmd, data);

				rs = stmt.executeQuery();

				return rs.next();
			} finally {
				if(rs != null) {
					rs.close();
					rs = null;
				}
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return check(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_ISSUE_INST_check
			PreparedStatement stmt;

			if(m_chkcmd!=null) {
				stmt = prepare(conn, m_chkcmd, data);
			} else if(m_selcmd!=null) {
				stmt = prepare(conn, m_selcmd, data);
			} else {
				throw new FoundationException("T_ISSUE_INST", "check", "クエリー未登録");
			}

			try {
				return check(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:T_ISSUE_INST_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);
			boolean ret=true;

			try {
				if(rs.next()==false) return false;


				return ret;
			} finally {
				if (rs != null) {
					rs.close();
					rs = null;
				}
			}
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:T_ISSUE_INST_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:T_ISSUE_INST_clear

			return;
		}

		/**
		 * T_ISSUE_INSTクラスの標準コンストラクタ
		 */
		public T_ISSUE_INST()
		{
			//{{user_implement_dev:T_ISSUE_INST_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:T_ISSUE_INST_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class T_PART_SUPPLIED_ISSUE extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = "insert into "
+"  T_PART_SUPPLIED_ISSUE(\"PUCH_ODR_CD\", \"ACPT_NO\", \"ITEM_CD\", \"ACPT_QTY\", \"COMPANY_CD\", \"VEND_CD\", \"JOB_ODR_CD\", \"JOB_ODR_DETAIL_NO\", \"PLANT_CD\", \"ISSUE_INST_CD\", \"MRP_ODR_TYP\", \"SUPPLIED_ISSUE_GNR_TYP\", \"SUPPLIED_ISSUE_QTY\", \"TOTAL_ISSUE_QTY\", \"SUPPLIED_UNIT_DENOMINATOR\", \"SUPPLIED_UNIT_NUMERATOR\", \"SUPPLIED_DATE\", \"PART_SUPPLIED_COMMENT\") "
+"values "
+"  (?, to_number(?), ?, to_number(?), ?, ?, ?, to_number(?), ?, ?, to_number(?), to_number(?), to_number(?), to_number(?), to_number(?), to_number(?), to_date(?,'YYYY/MM/DD'), ?)";
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="AE0060020";
		protected String m_sUpdateProgramName="AE0060020";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:T_PART_SUPPLIED_ISSUE_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:T_PART_SUPPLIED_ISSUE_def

		/**
		 * レコード新規追加処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int create(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return create(conn.getConn(), data);
		}

		/**
		 * レコード新規追加処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int create(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt=null;

			try {
				if("Oracle".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_I(m_inscmd));
				} else if("Microsoft SQL Server".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_I_MSSQL(m_inscmd));
				} else if("PostgreSQL".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_I_PGSQL(m_inscmd));
				} else if("MySQL".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_I_MYSQL(m_inscmd));
				} else {
					stmt = conn.prepareStatement(objMessage.replaceSQL_I_DB2(m_inscmd));
				}

				setString(1, data.getsSysdate(), stmt);
				setString(2, data.getsUser_ID(), stmt);
				setString(3, m_sCreateProgramName, stmt);
				setString(4, data.getsSysdate(), stmt);
				setString(5, data.getsUser_ID(), stmt);
				setString(6, m_sCreateProgramName, stmt);
				setString(7, data.getsetPUCH_ODR_CD(), stmt);
				setString(8, data.getsetACPT_NO(), stmt);
				setString(9, data.getsetITEM_CD(), stmt);
				setString(10, data.getsetACPT_QTY(), stmt);
				setString(11, data.getsetCOMPANY_CD(), stmt);
				setString(12, data.getsetVEND_CD(), stmt);
				setString(13, data.getsetJOB_ODR_CD(), stmt);
				setString(14, data.getsetJOB_ODR_DETAIL_NO(), stmt);
				setString(15, data.getsetPLANT_CD(), stmt);
				setString(16, data.getsetISSUE_INST_CD(), stmt);
				setString(17, data.getsetMRP_ODR_TYP(), stmt);
				setString(18, data.getsetSUPPLIED_ISSUE_GNR_TYP(), stmt);
				setString(19, data.getsetSUPPLIED_ISSUE_QTY(), stmt);
				setString(20, data.getsetTOTAL_ISSUE_QTY(), stmt);
				setString(21, data.getsetSUPPLIED_UNIT_DENOMINATOR(), stmt);
				setString(22, data.getsetSUPPLIED_UNIT_NUMERATOR(), stmt);
				setString(23, data.getsetSUPPLIED_DATE(), stmt);
				setString(24, data.getsetPART_SUPPLIED_COMMENT(), stmt);

				return stmt.executeUpdate();
			} finally {
				if(stmt!=null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:T_PART_SUPPLIED_ISSUE_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:T_PART_SUPPLIED_ISSUE_clear

			return;
		}

		/**
		 * T_PART_SUPPLIED_ISSUEクラスの標準コンストラクタ
		 */
		public T_PART_SUPPLIED_ISSUE()
		{
			//{{user_implement_dev:T_PART_SUPPLIED_ISSUE_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:T_PART_SUPPLIED_ISSUE_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class readT_ITEM_STOCK extends DataObject
	{
		protected String m_selcmd = "select "
+"  T_ITEM_STOCK.\"STOCK_ON_HAND_QTY\" as \"STOCK_ON_HAND_QTY\" "
+"from "
+"  T_ITEM_STOCK "
+"where "
+"  T_ITEM_STOCK.ITEM_CD = ? "
+"  and T_ITEM_STOCK.WH_CD = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:readT_ITEM_STOCK_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:readT_ITEM_STOCK_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStr);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStrs);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:readT_ITEM_STOCK_read
			if(m_selcmd==null) throw new FoundationException("readT_ITEM_STOCK", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:readT_ITEM_STOCK_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:readT_ITEM_STOCK_read2
			if(m_selcmd==null) throw new FoundationException("readT_ITEM_STOCK", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStr);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:readT_ITEM_STOCK_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:readT_ITEM_STOCK_read3
			if(m_selcmd==null) throw new FoundationException("readT_ITEM_STOCK", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStrs);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:readT_ITEM_STOCK_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);

			try {
				List list=new ArrayList();

				while((data=next(rs))!=null) {
					list.add(data);
				}

				return list;
			} finally {
				rs.close();
				rs = null;
			}
		}

		/**
		 * クエリーのprepare処理
		 *
		 * @return PreparedStatementインスタンスを返します
		 * @param conn Native Connectionインスタンス
		 * @param query SQL文字列
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query, AE0060020Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getsetITEM_CD());
				if(isNull(data.getsetITEM_CD())) isNull = true;
				ary.addElement(data.getsetWH_CD());
				if(isNull(data.getsetWH_CD())) isNull = true;

				// 静的SQL文の生成
				stmt = conn.prepareStatement(query);

			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * データ読出し処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getsetITEM_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getsetWH_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0060020Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0060020Struct data = new AE0060020Struct();

			data.setreadSTOCK_ON_HAND_QTY( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("readT_ITEM_STOCK", "hasRecord", "クエリー未登録");

			ResultSet rs=null;
			PreparedStatement stmt=null;

			try {
				stmt = prepare(conn, m_selcmd, data);

				rs = stmt.executeQuery();

				return rs.next();
			} finally {
				if(rs != null) {
					rs.close();
					rs = null;
				}
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return check(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:readT_ITEM_STOCK_check
			PreparedStatement stmt;

			if(m_chkcmd!=null) {
				stmt = prepare(conn, m_chkcmd, data);
			} else if(m_selcmd!=null) {
				stmt = prepare(conn, m_selcmd, data);
			} else {
				throw new FoundationException("readT_ITEM_STOCK", "check", "クエリー未登録");
			}

			try {
				return check(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:readT_ITEM_STOCK_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);
			boolean ret=true;

			try {
				if(rs.next()==false) return false;


				return ret;
			} finally {
				if (rs != null) {
					rs.close();
					rs = null;
				}
			}
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:readT_ITEM_STOCK_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:readT_ITEM_STOCK_clear

			return;
		}

		/**
		 * readT_ITEM_STOCKクラスの標準コンストラクタ
		 */
		public readT_ITEM_STOCK()
		{
			//{{user_implement_dev:readT_ITEM_STOCK_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:readT_ITEM_STOCK_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class readT_JOB_ODR_CD_STOCK extends DataObject
	{
		protected String m_selcmd = "select "
+"  T_JOB_ODR_CD_STOCK.\"STOCK_ON_HAND_QTY\" as \"STOCK_ON_HAND_QTY\" "
+"from "
+"  T_JOB_ODR_CD_STOCK "
+"where "
+"  T_JOB_ODR_CD_STOCK.JOB_ODR_CD = ? "
+"  and T_JOB_ODR_CD_STOCK.JOB_ODR_DETAIL_NO = ? "
+"  and T_JOB_ODR_CD_STOCK.ITEM_CD = ? "
+"  and T_JOB_ODR_CD_STOCK.WH_CD = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:readT_JOB_ODR_CD_STOCK_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:readT_JOB_ODR_CD_STOCK_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStr);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStrs);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:readT_JOB_ODR_CD_STOCK_read
			if(m_selcmd==null) throw new FoundationException("readT_JOB_ODR_CD_STOCK", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:readT_JOB_ODR_CD_STOCK_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:readT_JOB_ODR_CD_STOCK_read2
			if(m_selcmd==null) throw new FoundationException("readT_JOB_ODR_CD_STOCK", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStr);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:readT_JOB_ODR_CD_STOCK_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:readT_JOB_ODR_CD_STOCK_read3
			if(m_selcmd==null) throw new FoundationException("readT_JOB_ODR_CD_STOCK", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStrs);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:readT_JOB_ODR_CD_STOCK_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);

			try {
				List list=new ArrayList();

				while((data=next(rs))!=null) {
					list.add(data);
				}

				return list;
			} finally {
				rs.close();
				rs = null;
			}
		}

		/**
		 * クエリーのprepare処理
		 *
		 * @return PreparedStatementインスタンスを返します
		 * @param conn Native Connectionインスタンス
		 * @param query SQL文字列
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query, AE0060020Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getsetJOB_ODR_CD());
				if(isNull(data.getsetJOB_ODR_CD())) isNull = true;
				ary.addElement(data.getsetJOB_ODR_DETAIL_NO());
				if(isNull(data.getsetJOB_ODR_DETAIL_NO())) isNull = true;
				ary.addElement(data.getsetITEM_CD());
				if(isNull(data.getsetITEM_CD())) isNull = true;
				ary.addElement(data.getsetWH_CD());
				if(isNull(data.getsetWH_CD())) isNull = true;

				// 静的SQL文の生成
				stmt = conn.prepareStatement(query);

			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * データ読出し処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getsetJOB_ODR_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getsetJOB_ODR_DETAIL_NO(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getsetITEM_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getsetWH_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0060020Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0060020Struct data = new AE0060020Struct();

			data.setreadSTOCK_ON_HAND_QTY( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("readT_JOB_ODR_CD_STOCK", "hasRecord", "クエリー未登録");

			ResultSet rs=null;
			PreparedStatement stmt=null;

			try {
				stmt = prepare(conn, m_selcmd, data);

				rs = stmt.executeQuery();

				return rs.next();
			} finally {
				if(rs != null) {
					rs.close();
					rs = null;
				}
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return check(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:readT_JOB_ODR_CD_STOCK_check
			PreparedStatement stmt;

			if(m_chkcmd!=null) {
				stmt = prepare(conn, m_chkcmd, data);
			} else if(m_selcmd!=null) {
				stmt = prepare(conn, m_selcmd, data);
			} else {
				throw new FoundationException("readT_JOB_ODR_CD_STOCK", "check", "クエリー未登録");
			}

			try {
				return check(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:readT_JOB_ODR_CD_STOCK_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);
			boolean ret=true;

			try {
				if(rs.next()==false) return false;


				return ret;
			} finally {
				if (rs != null) {
					rs.close();
					rs = null;
				}
			}
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:readT_JOB_ODR_CD_STOCK_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:readT_JOB_ODR_CD_STOCK_clear

			return;
		}

		/**
		 * readT_JOB_ODR_CD_STOCKクラスの標準コンストラクタ
		 */
		public readT_JOB_ODR_CD_STOCK()
		{
			//{{user_implement_dev:readT_JOB_ODR_CD_STOCK_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:readT_JOB_ODR_CD_STOCK_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class insertT_ITEM_STOCK extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = "insert into "
+"  T_ITEM_STOCK(\"ITEM_CD\", \"WH_CD\", \"PLANT_CD\", \"STOCK_ON_HAND_QTY\") "
+"values "
+"  (?, ?, ?, to_number(?))";
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="AE0060020";
		protected String m_sUpdateProgramName="AE0060020";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:insertT_ITEM_STOCK_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:insertT_ITEM_STOCK_def

		/**
		 * レコード新規追加処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int create(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return create(conn.getConn(), data);
		}

		/**
		 * レコード新規追加処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int create(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt=null;

			try {
				if("Oracle".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_I(m_inscmd));
				} else if("Microsoft SQL Server".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_I_MSSQL(m_inscmd));
				} else if("PostgreSQL".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_I_PGSQL(m_inscmd));
				} else if("MySQL".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_I_MYSQL(m_inscmd));
				} else {
					stmt = conn.prepareStatement(objMessage.replaceSQL_I_DB2(m_inscmd));
				}

				setString(1, data.getsSysdate(), stmt);
				setString(2, data.getsUser_ID(), stmt);
				setString(3, m_sCreateProgramName, stmt);
				setString(4, data.getsSysdate(), stmt);
				setString(5, data.getsUser_ID(), stmt);
				setString(6, m_sCreateProgramName, stmt);
				setString(7, data.getsetITEM_CD(), stmt);
				setString(8, data.getsetWH_CD(), stmt);
				setString(9, data.getsetPLANT_CD(), stmt);
				setString(10, data.getsetSTOCK_ON_HAND_QTY(), stmt);

				return stmt.executeUpdate();
			} finally {
				if(stmt!=null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:insertT_ITEM_STOCK_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:insertT_ITEM_STOCK_clear

			return;
		}

		/**
		 * insertT_ITEM_STOCKクラスの標準コンストラクタ
		 */
		public insertT_ITEM_STOCK()
		{
			//{{user_implement_dev:insertT_ITEM_STOCK_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:insertT_ITEM_STOCK_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class updateT_ITEM_STOCK extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = "update "
+"  T_ITEM_STOCK "
+"set "
+"  \"STOCK_ON_HAND_QTY\" = to_number(?) "
+"where "
+"  T_ITEM_STOCK.\"ITEM_CD\" = ? "
+"  and T_ITEM_STOCK.\"WH_CD\" = ?";
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="AE0060020";
		protected String m_sUpdateProgramName="AE0060020";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:updateT_ITEM_STOCK_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:updateT_ITEM_STOCK_def

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return update(conn.getConn(), data);
		}

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt=null;
			int modifyCount;

			try {
				if("Oracle".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U(m_updcmd));
				} else if("Microsoft SQL Server".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U_MSSQL(m_updcmd));
				} else if("PostgreSQL".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U_PGSQL(m_updcmd));
				} else if("MySQL".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U_MYSQL(m_updcmd));
				} else {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U_DB2(m_updcmd));
				}

				setString(1, data.getsSysdate(), stmt);
				setString(2, data.getsUser_ID(), stmt);
				setString(3, m_sUpdateProgramName, stmt);
				setString(4, data.getsetSTOCK_ON_HAND_QTY(), stmt);
				setString(5, data.getsetITEM_CD(), stmt);
				setString(6, data.getsetWH_CD(), stmt);

				return stmt.executeUpdate();
			} finally {
				if(stmt!=null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:updateT_ITEM_STOCK_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:updateT_ITEM_STOCK_clear

			return;
		}

		/**
		 * updateT_ITEM_STOCKクラスの標準コンストラクタ
		 */
		public updateT_ITEM_STOCK()
		{
			//{{user_implement_dev:updateT_ITEM_STOCK_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:updateT_ITEM_STOCK_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class insertT_JOB_ODR_CD_STOCK extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = "insert into "
+"  T_JOB_ODR_CD_STOCK(\"JOB_ODR_CD\", \"JOB_ODR_DETAIL_NO\", \"ITEM_CD\", \"WH_CD\", \"PLANT_CD\", \"STOCK_ON_HAND_QTY\") "
+"values "
+"  (?, to_number(?), ?, ?, ?, to_number(?))";
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="AE0060020";
		protected String m_sUpdateProgramName="AE0060020";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:insertT_JOB_ODR_CD_STOCK_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:insertT_JOB_ODR_CD_STOCK_def

		/**
		 * レコード新規追加処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int create(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return create(conn.getConn(), data);
		}

		/**
		 * レコード新規追加処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int create(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt=null;

			try {
				if("Oracle".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_I(m_inscmd));
				} else if("Microsoft SQL Server".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_I_MSSQL(m_inscmd));
				} else if("PostgreSQL".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_I_PGSQL(m_inscmd));
				} else if("MySQL".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_I_MYSQL(m_inscmd));
				} else {
					stmt = conn.prepareStatement(objMessage.replaceSQL_I_DB2(m_inscmd));
				}

				setString(1, data.getsSysdate(), stmt);
				setString(2, data.getsUser_ID(), stmt);
				setString(3, m_sCreateProgramName, stmt);
				setString(4, data.getsSysdate(), stmt);
				setString(5, data.getsUser_ID(), stmt);
				setString(6, m_sCreateProgramName, stmt);
				setString(7, data.getsetJOB_ODR_CD(), stmt);
				setString(8, data.getsetJOB_ODR_DETAIL_NO(), stmt);
				setString(9, data.getsetITEM_CD(), stmt);
				setString(10, data.getsetWH_CD(), stmt);
				setString(11, data.getsetPLANT_CD(), stmt);
				setString(12, data.getsetSTOCK_ON_HAND_QTY(), stmt);

				return stmt.executeUpdate();
			} finally {
				if(stmt!=null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:insertT_JOB_ODR_CD_STOCK_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:insertT_JOB_ODR_CD_STOCK_clear

			return;
		}

		/**
		 * insertT_JOB_ODR_CD_STOCKクラスの標準コンストラクタ
		 */
		public insertT_JOB_ODR_CD_STOCK()
		{
			//{{user_implement_dev:insertT_JOB_ODR_CD_STOCK_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:insertT_JOB_ODR_CD_STOCK_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class updateT_JOB_ODR_CD_STOCK extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = "update "
+"  T_JOB_ODR_CD_STOCK "
+"set "
+"  \"STOCK_ON_HAND_QTY\" = to_number(?) "
+"where "
+"  T_JOB_ODR_CD_STOCK.\"JOB_ODR_CD\" = ? "
+"  and T_JOB_ODR_CD_STOCK.\"JOB_ODR_DETAIL_NO\" = ? "
+"  and T_JOB_ODR_CD_STOCK.\"ITEM_CD\" = ? "
+"  and T_JOB_ODR_CD_STOCK.\"WH_CD\" = ?";
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="AE0060020";
		protected String m_sUpdateProgramName="AE0060020";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:updateT_JOB_ODR_CD_STOCK_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:updateT_JOB_ODR_CD_STOCK_def

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return update(conn.getConn(), data);
		}

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt=null;
			int modifyCount;

			try {
				if("Oracle".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U(m_updcmd));
				} else if("Microsoft SQL Server".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U_MSSQL(m_updcmd));
				} else if("PostgreSQL".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U_PGSQL(m_updcmd));
				} else if("MySQL".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U_MYSQL(m_updcmd));
				} else {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U_DB2(m_updcmd));
				}

				setString(1, data.getsSysdate(), stmt);
				setString(2, data.getsUser_ID(), stmt);
				setString(3, m_sUpdateProgramName, stmt);
				setString(4, data.getsetSTOCK_ON_HAND_QTY(), stmt);
				setString(5, data.getsetJOB_ODR_CD(), stmt);
				setString(6, data.getsetJOB_ODR_DETAIL_NO(), stmt);
				setString(7, data.getsetITEM_CD(), stmt);
				setString(8, data.getsetWH_CD(), stmt);

				return stmt.executeUpdate();
			} finally {
				if(stmt!=null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:updateT_JOB_ODR_CD_STOCK_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:updateT_JOB_ODR_CD_STOCK_clear

			return;
		}

		/**
		 * updateT_JOB_ODR_CD_STOCKクラスの標準コンストラクタ
		 */
		public updateT_JOB_ODR_CD_STOCK()
		{
			//{{user_implement_dev:updateT_JOB_ODR_CD_STOCK_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:updateT_JOB_ODR_CD_STOCK_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class insertT_RCV_ISSUE extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = "insert into "
+"  T_RCV_ISSUE(\"RCV_ISSUE_CTRL_CD\", \"RCV_ISSUE_TYP\", \"ITEM_CD\", \"PLANT_CD\", \"WH_CD\", \"JOB_ODR_CD\", \"JOB_ODR_DETAIL_NO\", \"PUCH_ODR_CD\", \"ACPT_NO\", \"ACPT_RSLT_CRCT_NO\", \"INSPEC_RSLT_CRCT_NO\", \"WORK_ODR_CD\", \"WORK_IN_PROC_CD\", \"PARTIAL_PRD_NO\", \"OPR_RSLT_CRCT_NO\", \"ISSUE_INST_CD\", \"RCV_ISSUE_BEFORE_QTY\", \"RCV_ISSUE_QTY\", \"RCV_ISSUE_AFTER_QTY\", \"RCV_ISSUE_AMOUNT\", \"RCV_ISSUE_DATE\", \"RCV_ISSUE_GNR_TYP\", \"RCV_ISSUE_ODD_QTY\", \"DEFECT_CAUSE_CD\", \"STOCK_UPD_TYP\", \"RCV_ISSUE_CMPLT_FLG\", \"OD_NO\", \"LOT_NO\", \"VEND_LOT_NO\", \"RCV_ISSUE_COMMENT\", \"COMPANY_CD\", \"VEND_CD\", \"CONS_TYP\", \"CONS_EXEC_DATE\") "
+"values "
+"  (?, to_number(?), ?, ?, ?, ?, to_number(?), ?, to_number(?), to_number(?), to_number(?), ?, ?, to_number(?), to_number(?), ?, to_number(?), to_number(?), to_number(?), to_number(?), to_date(?,'YYYY/MM/DD'), to_number(?), to_number(?), ?, to_number(?), to_number(?), ?, ?, ?, ?, ?, ?, to_number(?), to_date(?,'YYYY/MM/DD')) "
+"";
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="AE0060020";
		protected String m_sUpdateProgramName="AE0060020";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:insertT_RCV_ISSUE_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:insertT_RCV_ISSUE_def

		/**
		 * レコード新規追加処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int create(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return create(conn.getConn(), data);
		}

		/**
		 * レコード新規追加処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int create(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt=null;

			try {
				if("Oracle".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_I(m_inscmd));
				} else if("Microsoft SQL Server".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_I_MSSQL(m_inscmd));
				} else if("PostgreSQL".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_I_PGSQL(m_inscmd));
				} else if("MySQL".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_I_MYSQL(m_inscmd));
				} else {
					stmt = conn.prepareStatement(objMessage.replaceSQL_I_DB2(m_inscmd));
				}

				setString(1, data.getsSysdate(), stmt);
				setString(2, data.getsUser_ID(), stmt);
				setString(3, m_sCreateProgramName, stmt);
				setString(4, data.getsSysdate(), stmt);
				setString(5, data.getsUser_ID(), stmt);
				setString(6, m_sCreateProgramName, stmt);
				setString(7, data.getsetRCV_ISSUE_CTRL_CD(), stmt);
				setString(8, data.getsetRCV_ISSUE_TYP(), stmt);
				setString(9, data.getsetITEM_CD(), stmt);
				setString(10, data.getsetPLANT_CD(), stmt);
				setString(11, data.getsetWH_CD(), stmt);
				setString(12, data.getsetJOB_ODR_CD(), stmt);
				setString(13, data.getsetJOB_ODR_DETAIL_NO(), stmt);
				setString(14, data.getsetPUCH_ODR_CD(), stmt);
				setString(15, data.getsetACPT_NO(), stmt);
				setString(16, data.getsetACPT_RSLT_CRCT_NO(), stmt);
				setString(17, data.getsetINSPEC_RSLT_CRCT_NO(), stmt);
				setString(18, data.getsetWORK_ODR_CD(), stmt);
				setString(19, data.getsetWORK_IN_PROC_CD(), stmt);
				setString(20, data.getsetPARTIAL_PRD_NO(), stmt);
				setString(21, data.getsetOPR_RSLT_CRCT_NO(), stmt);
				setString(22, data.getsetISSUE_INST_CD(), stmt);
				setString(23, data.getsetRCV_ISSUE_BEFORE_QTY(), stmt);
				setString(24, data.getsetRCV_ISSUE_QTY(), stmt);
				setString(25, data.getsetRCV_ISSUE_AFTER_QTY(), stmt);
				setString(26, data.getsetRCV_ISSUE_AMOUNT(), stmt);
				setString(27, data.getsetRCV_ISSUE_DATE(), stmt);
				setString(28, data.getsetRCV_ISSUE_GNR_TYP(), stmt);
				setString(29, data.getsetRCV_ISSUE_ODD_QTY(), stmt);
				setString(30, data.getsetDEFECT_CAUSE_CD(), stmt);
				setString(31, data.getsetSTOCK_UPD_TYP(), stmt);
				setString(32, data.getsetRCV_ISSUE_CMPLT_FLG(), stmt);
				setString(33, data.getsetOD_NO(), stmt);
				setString(34, data.getsetLOT_NO(), stmt);
				setString(35, data.getsetVEND_LOT_NO(), stmt);
				setString(36, data.getsetRCV_ISSUE_COMMENT(), stmt);
				setString(37, data.getsetCOMPANY_CD(), stmt);
				setString(38, data.getsetVEND_CD(), stmt);
				setString(39, data.getsetCONS_TYP(), stmt);
				setString(40, data.getsetCONS_EXEC_DATE(), stmt);

				return stmt.executeUpdate();
			} finally {
				if(stmt!=null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:insertT_RCV_ISSUE_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:insertT_RCV_ISSUE_clear

			return;
		}

		/**
		 * insertT_RCV_ISSUEクラスの標準コンストラクタ
		 */
		public insertT_RCV_ISSUE()
		{
			//{{user_implement_dev:insertT_RCV_ISSUE_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:insertT_RCV_ISSUE_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class readM_WH extends DataObject
	{
		protected String m_selcmd = "select "
+"  M_WH.\"WH_CD\" as \"WH_CD\" "
+"from "
+"  M_WH "
+"where "
+"  M_WH.\"VEND_CD\" = ? "
+"  and M_WH.\"PLANT_CD\" = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:readM_WH_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:readM_WH_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStr);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStrs);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:readM_WH_read
			if(m_selcmd==null) throw new FoundationException("readM_WH", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:readM_WH_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:readM_WH_read2
			if(m_selcmd==null) throw new FoundationException("readM_WH", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStr);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:readM_WH_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:readM_WH_read3
			if(m_selcmd==null) throw new FoundationException("readM_WH", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStrs);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:readM_WH_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);

			try {
				List list=new ArrayList();

				while((data=next(rs))!=null) {
					list.add(data);
				}

				return list;
			} finally {
				rs.close();
				rs = null;
			}
		}

		/**
		 * クエリーのprepare処理
		 *
		 * @return PreparedStatementインスタンスを返します
		 * @param conn Native Connectionインスタンス
		 * @param query SQL文字列
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query, AE0060020Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getsetVEND_CD());
				if(isNull(data.getsetVEND_CD())) isNull = true;
				ary.addElement(data.getsetPLANT_CD());
				if(isNull(data.getsetPLANT_CD())) isNull = true;

				// 静的SQL文の生成
				stmt = conn.prepareStatement(query);

			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * データ読出し処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getsetVEND_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getsetPLANT_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0060020Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0060020Struct data = new AE0060020Struct();

			data.setreadWH_CD( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("readM_WH", "hasRecord", "クエリー未登録");

			ResultSet rs=null;
			PreparedStatement stmt=null;

			try {
				stmt = prepare(conn, m_selcmd, data);

				rs = stmt.executeQuery();

				return rs.next();
			} finally {
				if(rs != null) {
					rs.close();
					rs = null;
				}
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return check(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:readM_WH_check
			PreparedStatement stmt;

			if(m_chkcmd!=null) {
				stmt = prepare(conn, m_chkcmd, data);
			} else if(m_selcmd!=null) {
				stmt = prepare(conn, m_selcmd, data);
			} else {
				throw new FoundationException("readM_WH", "check", "クエリー未登録");
			}

			try {
				return check(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:readM_WH_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);
			boolean ret=true;

			try {
				if(rs.next()==false) return false;


				return ret;
			} finally {
				if (rs != null) {
					rs.close();
					rs = null;
				}
			}
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:readM_WH_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:readM_WH_clear

			return;
		}

		/**
		 * readM_WHクラスの標準コンストラクタ
		 */
		public readM_WH()
		{
			//{{user_implement_dev:readM_WH_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:readM_WH_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class readT_PART_SUPPLIED_ISSUE extends DataObject
	{
		protected String m_selcmd = "select "
+"  T_PART_SUPPLIED_ISSUE.\"PUCH_ODR_CD\" as \"PUCH_ODR_CD\", "
+"  T_PART_SUPPLIED_ISSUE.\"ITEM_CD\" as \"ITEM_CD\", "
+"  T_PART_SUPPLIED_ISSUE.\"COMPANY_CD\" as \"COMPANY_CD\", "
+"  T_PART_SUPPLIED_ISSUE.\"VEND_CD\" as \"VEND_CD\", "
+"  T_PART_SUPPLIED_ISSUE.\"JOB_ODR_CD\" as \"JOB_ODR_CD\", "
+"  T_PART_SUPPLIED_ISSUE.\"JOB_ODR_DETAIL_NO\" as \"JOB_ODR_DETAIL_NO\", "
+"  T_PART_SUPPLIED_ISSUE.\"PLANT_CD\" as \"PLANT_CD\", "
+"  T_PART_SUPPLIED_ISSUE.\"ISSUE_INST_CD\" as \"ISSUE_INST_CD\", "
+"  T_PART_SUPPLIED_ISSUE.\"MRP_ODR_TYP\" as \"MRP_ODR_TYP\", "
+"  T_PART_SUPPLIED_ISSUE.\"SUPPLIED_ISSUE_GNR_TYP\" as \"SUPPLIED_ISSUE_GNR_TYP\", "
+"  T_PART_SUPPLIED_ISSUE.\"TOTAL_ISSUE_QTY\" as \"TOTAL_ISSUE_QTY\", "
+"  T_PART_SUPPLIED_ISSUE.\"SUPPLIED_UNIT_DENOMINATOR\" as \"SUPPLIED_UNIT_DENOMINATOR\", "
+"  T_PART_SUPPLIED_ISSUE.\"SUPPLIED_UNIT_NUMERATOR\" as \"SUPPLIED_UNIT_NUMERATOR\", "
+"  M_ITEM.\"UNIT_QTY_TYP\" as \"UNIT_QTY_TYP\", "
+"  T_ISSUE_INST.\"OD_NO\" as \"OD_NO\", "
+"  T_ISSUE_INST.\"CONS_TYP\" as \"CONS_TYP\", "
+"  M_ITEM.\"LOT_CTRL_FLG\" as \"LOT_CTRL_FLG\", "
+"  to_date(T_PART_SUPPLIED_ISSUE.\"SUPPLIED_DATE\", 'YYYY/MM/DD') as \"SUPPLIED_DATE\", "
+"  T_PART_SUPPLIED_ISSUE.\"TOTAL_ISSUE_QTY\" as \"TOTAL_ISSUE_QTY\", "
+"  T_PART_SUPPLIED_ISSUE.\"PART_SUPPLIED_COMMENT\" as \"PART_SUPPLIED_COMMENT\" "
+"from "
+"  T_PART_SUPPLIED_ISSUE, "
+"  M_ITEM, "
+"  T_ISSUE_INST "
+"where "
+"  T_PART_SUPPLIED_ISSUE.ITEM_CD = M_ITEM.ITEM_CD(+) "
+"  and T_PART_SUPPLIED_ISSUE.ISSUE_INST_CD = T_ISSUE_INST.ISSUE_INST_CD(+) "
+"  and T_PART_SUPPLIED_ISSUE.PUCH_ODR_CD = ? "
+"  and T_PART_SUPPLIED_ISSUE.ACPT_NO = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:readT_PART_SUPPLIED_ISSUE_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:readT_PART_SUPPLIED_ISSUE_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStr);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStrs);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:readT_PART_SUPPLIED_ISSUE_read
			if(m_selcmd==null) throw new FoundationException("readT_PART_SUPPLIED_ISSUE", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:readT_PART_SUPPLIED_ISSUE_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:readT_PART_SUPPLIED_ISSUE_read2
			if(m_selcmd==null) throw new FoundationException("readT_PART_SUPPLIED_ISSUE", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStr);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:readT_PART_SUPPLIED_ISSUE_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:readT_PART_SUPPLIED_ISSUE_read3
			if(m_selcmd==null) throw new FoundationException("readT_PART_SUPPLIED_ISSUE", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStrs);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:readT_PART_SUPPLIED_ISSUE_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);

			try {
				List list=new ArrayList();

				while((data=next(rs))!=null) {
					list.add(data);
				}

				return list;
			} finally {
				rs.close();
				rs = null;
			}
		}

		/**
		 * クエリーのprepare処理
		 *
		 * @return PreparedStatementインスタンスを返します
		 * @param conn Native Connectionインスタンス
		 * @param query SQL文字列
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query, AE0060020Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getPUCH_ODR_CD());
				if(isNull(data.getPUCH_ODR_CD())) isNull = true;
				ary.addElement(data.getACPT_NO());
				if(isNull(data.getACPT_NO())) isNull = true;

				// 静的SQL文の生成
				stmt = conn.prepareStatement(query);

			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * データ読出し処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getPUCH_ODR_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getACPT_NO(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0060020Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0060020Struct data = new AE0060020Struct();

			data.setreadPUCH_ODR_CD( getString(1, rs) );
			data.setreadITEM_CD( getString(2, rs) );
			data.setreadCOMPANY_CD( getString(3, rs) );
			data.setreadVEND_CD( getString(4, rs) );
			data.setreadJOB_ODR_CD( getString(5, rs) );
			data.setreadJOB_ODR_DETAIL_NO( getString(6, rs) );
			data.setreadPLANT_CD( getString(7, rs) );
			data.setreadISSUE_INST_CD( getString(8, rs) );
			data.setreadMRP_ODR_TYP( getString(9, rs) );
			data.setreadSUPPLIED_ISSUE_GNR_TYP( getString(10, rs) );
			data.setreadTOTAL_ISSUE_QTY( getString(11, rs) );
			data.setreadSUPPLIED_UNIT_DENOMINATOR( getString(12, rs) );
			data.setreadSUPPLIED_UNIT_NUMERATOR( getString(13, rs) );
			data.setreadUNIT_QTY_TYP( getString(14, rs) );
			data.setreadOD_NO( getString(15, rs) );
			data.setreadCONS_TYP( getString(16, rs) );
			data.setreadLOT_CONTROL_FLG( getString(17, rs) );
			data.setreadSUPPLIED_DATE( getString(18, rs) );
			data.setreadTOTAL_ISSUE_QTY( getString(19, rs) );
			data.setreadPART_SUPPLIED_COMMENT( getString(20, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("readT_PART_SUPPLIED_ISSUE", "hasRecord", "クエリー未登録");

			ResultSet rs=null;
			PreparedStatement stmt=null;

			try {
				stmt = prepare(conn, m_selcmd, data);

				rs = stmt.executeQuery();

				return rs.next();
			} finally {
				if(rs != null) {
					rs.close();
					rs = null;
				}
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return check(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:readT_PART_SUPPLIED_ISSUE_check
			PreparedStatement stmt;

			if(m_chkcmd!=null) {
				stmt = prepare(conn, m_chkcmd, data);
			} else if(m_selcmd!=null) {
				stmt = prepare(conn, m_selcmd, data);
			} else {
				throw new FoundationException("readT_PART_SUPPLIED_ISSUE", "check", "クエリー未登録");
			}

			try {
				return check(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:readT_PART_SUPPLIED_ISSUE_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);
			boolean ret=true;

			try {
				if(rs.next()==false) return false;


				return ret;
			} finally {
				if (rs != null) {
					rs.close();
					rs = null;
				}
			}
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:readT_PART_SUPPLIED_ISSUE_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:readT_PART_SUPPLIED_ISSUE_clear

			return;
		}

		/**
		 * readT_PART_SUPPLIED_ISSUEクラスの標準コンストラクタ
		 */
		public readT_PART_SUPPLIED_ISSUE()
		{
			//{{user_implement_dev:readT_PART_SUPPLIED_ISSUE_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:readT_PART_SUPPLIED_ISSUE_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class updateT_PART_SUPPLIED_ISSUE extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = "update "
+"  T_PART_SUPPLIED_ISSUE "
+"set "
+"  \"ACPT_QTY\" = to_number(?), "
+"  \"SUPPLIED_ISSUE_QTY\" = to_number(?), "
+"  \"TOTAL_ISSUE_QTY\" = to_number(?), "
+"  \"SUPPLIED_DATE\" = to_date(?,'YYYY/MM/DD') "
+"where "
+"  T_PART_SUPPLIED_ISSUE.\"PUCH_ODR_CD\" = ? "
+"and "
+"  T_PART_SUPPLIED_ISSUE.\"ACPT_NO\" = to_number(?) "
+"and "
+"  T_PART_SUPPLIED_ISSUE.\"ITEM_CD\" = ?";
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="AE0060020";
		protected String m_sUpdateProgramName="AE0060020";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:updateT_PART_SUPPLIED_ISSUE_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:updateT_PART_SUPPLIED_ISSUE_def

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return update(conn.getConn(), data);
		}

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt=null;
			int modifyCount;

			try {
				if("Oracle".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U(m_updcmd));
				} else if("Microsoft SQL Server".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U_MSSQL(m_updcmd));
				} else if("PostgreSQL".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U_PGSQL(m_updcmd));
				} else if("MySQL".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U_MYSQL(m_updcmd));
				} else {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U_DB2(m_updcmd));
				}

				setString(1, data.getsSysdate(), stmt);
				setString(2, data.getsUser_ID(), stmt);
				setString(3, m_sUpdateProgramName, stmt);
				setString(4, data.getsetACPT_QTY(), stmt);
				setString(5, data.getsetSUPPLIED_ISSUE_QTY(), stmt);
				setString(6, data.getsetTOTAL_ISSUE_QTY(), stmt);
				setString(7, data.getsetSUPPLIED_DATE(), stmt);
				setString(8, data.getsetPUCH_ODR_CD(), stmt);
				setString(9, data.getsetACPT_NO(), stmt);
				setString(10, data.getsetITEM_CD(), stmt);

				return stmt.executeUpdate();
			} finally {
				if(stmt!=null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:updateT_PART_SUPPLIED_ISSUE_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:updateT_PART_SUPPLIED_ISSUE_clear

			return;
		}

		/**
		 * updateT_PART_SUPPLIED_ISSUEクラスの標準コンストラクタ
		 */
		public updateT_PART_SUPPLIED_ISSUE()
		{
			//{{user_implement_dev:updateT_PART_SUPPLIED_ISSUE_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:updateT_PART_SUPPLIED_ISSUE_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class readT_ACPT_RSLT extends DataObject
	{
		protected String m_selcmd = "select "
+"  T_ACPT_RSLT.\"ACPT_CRCT_NO\" as \"ACPT_CRCT_NO\" "
+"from "
+"  T_ACPT_RSLT "
+"where "
+"  T_ACPT_RSLT.PUCH_ODR_CD = ? "
+"  and T_ACPT_RSLT.ACPT_NO = to_number(?)";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:readT_ACPT_RSLT_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:readT_ACPT_RSLT_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStr);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStrs);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:readT_ACPT_RSLT_read
			if(m_selcmd==null) throw new FoundationException("readT_ACPT_RSLT", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:readT_ACPT_RSLT_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:readT_ACPT_RSLT_read2
			if(m_selcmd==null) throw new FoundationException("readT_ACPT_RSLT", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStr);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:readT_ACPT_RSLT_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:readT_ACPT_RSLT_read3
			if(m_selcmd==null) throw new FoundationException("readT_ACPT_RSLT", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStrs);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:readT_ACPT_RSLT_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);

			try {
				List list=new ArrayList();

				while((data=next(rs))!=null) {
					list.add(data);
				}

				return list;
			} finally {
				rs.close();
				rs = null;
			}
		}

		/**
		 * クエリーのprepare処理
		 *
		 * @return PreparedStatementインスタンスを返します
		 * @param conn Native Connectionインスタンス
		 * @param query SQL文字列
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query, AE0060020Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getPUCH_ODR_CD());
				if(isNull(data.getPUCH_ODR_CD())) isNull = true;
				ary.addElement(data.getACPT_NO());
				if(isNull(data.getACPT_NO())) isNull = true;

				// 静的SQL文の生成
				stmt = conn.prepareStatement(query);

			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * データ読出し処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getPUCH_ODR_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getACPT_NO(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0060020Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0060020Struct data = new AE0060020Struct();

			data.setreadACPT_CRCT_NO( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("readT_ACPT_RSLT", "hasRecord", "クエリー未登録");

			ResultSet rs=null;
			PreparedStatement stmt=null;

			try {
				stmt = prepare(conn, m_selcmd, data);

				rs = stmt.executeQuery();

				return rs.next();
			} finally {
				if(rs != null) {
					rs.close();
					rs = null;
				}
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return check(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:readT_ACPT_RSLT_check
			PreparedStatement stmt;

			if(m_chkcmd!=null) {
				stmt = prepare(conn, m_chkcmd, data);
			} else if(m_selcmd!=null) {
				stmt = prepare(conn, m_selcmd, data);
			} else {
				throw new FoundationException("readT_ACPT_RSLT", "check", "クエリー未登録");
			}

			try {
				return check(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:readT_ACPT_RSLT_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);
			boolean ret=true;

			try {
				if(rs.next()==false) return false;


				return ret;
			} finally {
				if (rs != null) {
					rs.close();
					rs = null;
				}
			}
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:readT_ACPT_RSLT_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:readT_ACPT_RSLT_clear

			return;
		}

		/**
		 * readT_ACPT_RSLTクラスの標準コンストラクタ
		 */
		public readT_ACPT_RSLT()
		{
			//{{user_implement_dev:readT_ACPT_RSLT_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:readT_ACPT_RSLT_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class readT_INSPC_RSLT extends DataObject
	{
		protected String m_selcmd = "select "
+"  T_INSPC_RSLT.\"INSPC_CRCT_NO\" as \"INSPC_CRCT_NO\" "
+"from "
+"  T_INSPC_RSLT "
+"where "
+"  T_INSPC_RSLT.PUCH_ODR_CD = ? "
+"  and T_INSPC_RSLT.ACPT_NO = to_number(?)";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:readT_INSPC_RSLT_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:readT_INSPC_RSLT_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStr);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStrs);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:readT_INSPC_RSLT_read
			if(m_selcmd==null) throw new FoundationException("readT_INSPC_RSLT", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:readT_INSPC_RSLT_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:readT_INSPC_RSLT_read2
			if(m_selcmd==null) throw new FoundationException("readT_INSPC_RSLT", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStr);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:readT_INSPC_RSLT_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:readT_INSPC_RSLT_read3
			if(m_selcmd==null) throw new FoundationException("readT_INSPC_RSLT", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStrs);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:readT_INSPC_RSLT_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);

			try {
				List list=new ArrayList();

				while((data=next(rs))!=null) {
					list.add(data);
				}

				return list;
			} finally {
				rs.close();
				rs = null;
			}
		}

		/**
		 * クエリーのprepare処理
		 *
		 * @return PreparedStatementインスタンスを返します
		 * @param conn Native Connectionインスタンス
		 * @param query SQL文字列
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query, AE0060020Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getPUCH_ODR_CD());
				if(isNull(data.getPUCH_ODR_CD())) isNull = true;
				ary.addElement(data.getACPT_NO());
				if(isNull(data.getACPT_NO())) isNull = true;

				// 静的SQL文の生成
				stmt = conn.prepareStatement(query);

			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * データ読出し処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getPUCH_ODR_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getACPT_NO(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0060020Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0060020Struct data = new AE0060020Struct();

			data.setreadINSPC_CRCT_NO( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("readT_INSPC_RSLT", "hasRecord", "クエリー未登録");

			ResultSet rs=null;
			PreparedStatement stmt=null;

			try {
				stmt = prepare(conn, m_selcmd, data);

				rs = stmt.executeQuery();

				return rs.next();
			} finally {
				if(rs != null) {
					rs.close();
					rs = null;
				}
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return check(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:readT_INSPC_RSLT_check
			PreparedStatement stmt;

			if(m_chkcmd!=null) {
				stmt = prepare(conn, m_chkcmd, data);
			} else if(m_selcmd!=null) {
				stmt = prepare(conn, m_selcmd, data);
			} else {
				throw new FoundationException("readT_INSPC_RSLT", "check", "クエリー未登録");
			}

			try {
				return check(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:readT_INSPC_RSLT_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);
			boolean ret=true;

			try {
				if(rs.next()==false) return false;


				return ret;
			} finally {
				if (rs != null) {
					rs.close();
					rs = null;
				}
			}
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:readT_INSPC_RSLT_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:readT_INSPC_RSLT_clear

			return;
		}

		/**
		 * readT_INSPC_RSLTクラスの標準コンストラクタ
		 */
		public readT_INSPC_RSLT()
		{
			//{{user_implement_dev:readT_INSPC_RSLT_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:readT_INSPC_RSLT_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class selectSupplied extends DataObject
	{
		protected String m_selcmd = "select "
+"  T_PART_SUPPLIED_ISSUE.\"ITEM_CD\" as \"ITEM_CD\", "
+"  M_ITEM.\"ITEM_NAME\" as \"ITEM_NAME\", "
+"  T_PART_SUPPLIED_ISSUE.\"JOB_ODR_CD\" as \"JOB_ODR_CD\", "
+"  T_PART_SUPPLIED_ISSUE.\"JOB_ODR_DETAIL_NO\" as \"JOB_ODR_DETAIL_NO\", "
+"  T_PART_SUPPLIED_ISSUE.SUPPLIED_ISSUE_GNR_TYP as \"ISSUE_GNR_TYP\", "
+"  decode(M_ITEM.\"LOT_CTRL_FLG\", 1, nvl(T_LOT_USE_RSLT.\"SUPPLIED_ISSUE_QTY\", 0), nvl(T_PART_SUPPLIED_ISSUE.\"SUPPLIED_ISSUE_QTY\", 0)) as \"SUPPLIED_ISSUE_QTY\", "
+"  decode(M_ITEM.\"LOT_CTRL_FLG\", 1, nvl(T_LOT_USE_RSLT.\"TOTAL_ISSUE_QTY\", 0), nvl(T_PART_SUPPLIED_ISSUE.\"TOTAL_ISSUE_QTY\", 0)) as \"TOTAL_ISSUE_QTY\", "
+"  M_ITEM.\"STOCK_UNIT\" as \"STOCK_UNIT\", "
+"  decode(M_ITEM.\"LOT_CTRL_FLG\", 1, to_char(T_LOT_USE_RSLT.\"SUPPLIED_DATE\", 'YYYY/MM/DD'), to_char(T_PART_SUPPLIED_ISSUE.\"SUPPLIED_DATE\", 'YYYY/MM/DD')) as \"SUPPLIED_DATE\", "
+"  T_PART_SUPPLIED_ISSUE.\"MRP_ODR_TYP\" as \"MRP_ODR_TYP\", "
+"  decode(M_ITEM.\"LOT_CTRL_FLG\", 1, T_LOT_USE_RSLT.\"PART_SUPPLIED_COMMENT\", T_PART_SUPPLIED_ISSUE.\"PART_SUPPLIED_COMMENT\") as \"PART_SUPPLIED_COMMENT\", "
+"  decode(M_ITEM.\"LOT_CTRL_FLG\", 1, T_LOT_USE_RSLT.\"ISSUE_INST_CD\", T_PART_SUPPLIED_ISSUE.\"ISSUE_INST_CD\") as \"ISSUE_INST_CD\", "
+"  M_ITEM.MRP_ODR_TYP as \"MRP_ODR_TYP\", "
+"  to_char(T_PART_SUPPLIED_ISSUE.SUPPLIED_UNIT_DENOMINATOR, 'fm999999999999999990.0999') as SUPPLIED_UNIT_DENOMINATOR, "
+"  to_char(T_PART_SUPPLIED_ISSUE.SUPPLIED_UNIT_NUMERATOR, 'fm999999999999999990.0999') as SUPPLIED_UNIT_NUMERATOR, "
+"  T_PART_SUPPLIED_ISSUE.\"VEND_CD\" as \"VEND_CD\", "
+"  T_PART_SUPPLIED_ISSUE.\"PLANT_CD\" as \"PLANT_CD\", "
+"  to_char(M_ITEM.\"UNIT_QTY_TYP\") as \"UNIT_QTY_TYP\", "
+"  T_LOT_USE_RSLT.\"LOT_NO\" as \"LOT_NO\", "
+"  M_ITEM.\"LOT_CTRL_FLG\" as \"LOT_CTRL_FLG\" "
+"from "
+"  T_PART_SUPPLIED_ISSUE, "
+"  M_ITEM, "
+"  T_LOT_USE_RSLT "
+"where "
+"  T_PART_SUPPLIED_ISSUE.ITEM_CD = M_ITEM.ITEM_CD "
+"  and T_PART_SUPPLIED_ISSUE.PUCH_ODR_CD = ? "
+"  and T_PART_SUPPLIED_ISSUE.ACPT_NO = ? "
+"  and T_PART_SUPPLIED_ISSUE.ITEM_CD = T_LOT_USE_RSLT.ITEM_CD(+) "
+"  and T_PART_SUPPLIED_ISSUE.PUCH_ODR_CD = T_LOT_USE_RSLT.PUCH_ODR_CD(+) "
+"  and T_PART_SUPPLIED_ISSUE.ACPT_NO = T_LOT_USE_RSLT.ACPT_NO(+) "
+"order by "
+"  T_PART_SUPPLIED_ISSUE.ITEM_CD";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectSupplied_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:selectSupplied_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStr);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStrs);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectSupplied_read
			if(m_selcmd==null) throw new FoundationException("selectSupplied", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:selectSupplied_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectSupplied_read2
			if(m_selcmd==null) throw new FoundationException("selectSupplied", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStr);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectSupplied_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectSupplied_read3
			if(m_selcmd==null) throw new FoundationException("selectSupplied", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStrs);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectSupplied_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);

			try {
				List list=new ArrayList();

				while((data=next(rs))!=null) {
					list.add(data);
				}

				return list;
			} finally {
				if (rs != null) {
					rs.close();
					rs = null;
				}
			}
		}

		/**
		 * クエリーのprepare処理
		 *
		 * @return PreparedStatementインスタンスを返します
		 * @param conn Native Connectionインスタンス
		 * @param query SQL文字列
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query, AE0060020Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getPUCH_ODR_CD());
				if(isNull(data.getPUCH_ODR_CD())) isNull = true;
				ary.addElement(data.getl_ACPT_NO());
				if(isNull(data.getl_ACPT_NO())) isNull = true;

				//動的SQL生成ロジック
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("selectSupplied", "prepare", "Parse失敗:"+e.toString());
			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * データ読出し処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//動的SQL生成ロジック
			if(!isNull(data.getPUCH_ODR_CD())) setString(no ++, data.getPUCH_ODR_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getl_ACPT_NO())) setString(no ++, data.getl_ACPT_NO(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0060020Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0060020Struct data = new AE0060020Struct();

			data.setl_ITEM_CD( getString(1, rs) );
			data.setl_ITEM_NAME( getString(2, rs) );
			data.setl_JOB_ODR_CD( getString(3, rs) );
			data.settmp_JOB_ODR_DETAIL_NO( getString(4, rs) );
			data.setl_SUPPLIED_GNR_TYP( getString(5, rs) );
			data.setl_SUPPLIED_QTY( getString(6, rs) );
			data.setl_TOTAL_ISSUE_QTY( getString(7, rs) );
			data.setl_STOCK_UNIT2( getString(8, rs) );
			data.setl_SUPPLIED_DATE( getString(9, rs) );
			data.settmp_MRP_ODR_TYP( getString(10, rs) );
			data.setl_PART_SUPPLIED_COMMENT( getString(11, rs) );
			data.setl_ISSUE_INST_CD( getString(12, rs) );
			data.setl_MRP_ODR_TYP( getString(13, rs) );
			data.setl_SUPPLIED_UNIT_DENOMINATOR( getString(14, rs) );
			data.setl_SUPPLIED_UNIT_NUMERATOR( getString(15, rs) );
			data.settmp_VEND_CD( getString(16, rs) );
			data.settmp_PLANT_CD( getString(17, rs) );
			data.setl_UNIT_QTY_TYP( getString(18, rs) );
			data.setl_LOT_NO( getString(19, rs) );
			data.setl_LOT_CONTROL_FLG( getString(20, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectSupplied", "hasRecord", "クエリー未登録");

			ResultSet rs=null;
			PreparedStatement stmt=null;

			try {
				stmt = prepare(conn, m_selcmd, data);

				rs = stmt.executeQuery();

				return rs.next();
			} finally {
				if (rs != null) {
					rs.close();
					rs = null;
				}
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return check(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectSupplied_check
			PreparedStatement stmt;

			if(m_chkcmd!=null) {
				stmt = prepare(conn, m_chkcmd, data);
			} else if(m_selcmd!=null) {
				stmt = prepare(conn, m_selcmd, data);
			} else {
				throw new FoundationException("selectSupplied", "check", "クエリー未登録");
			}

			try {
				return check(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:selectSupplied_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);
			boolean ret=true;

			try {
				if(rs.next()==false) return false;


				return ret;
			} finally {
				if (rs != null) {
					rs.close();
					rs = null;
				}
			}
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:selectSupplied_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:selectSupplied_clear

			return;
		}

		/**
		 * selectSuppliedクラスの標準コンストラクタ
		 */
		public selectSupplied()
		{
			//{{user_implement_dev:selectSupplied_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:selectSupplied_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class SelectDateCtrl extends DataObject
	{
		protected String m_selcmd = "select "
+"  to_char(BUSINESS_OPR_DATE, 'yyyy/mm/dd') as BUSINESS_OPR_DATE "
+"from "
+"  SYS_DATE_CTRL "
+"where "
+"  PLANT_CD = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SelectDateCtrl_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:SelectDateCtrl_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStr);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStrs);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectDateCtrl_read
			if(m_selcmd==null) throw new FoundationException("SelectDateCtrl", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:SelectDateCtrl_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectDateCtrl_read2
			if(m_selcmd==null) throw new FoundationException("SelectDateCtrl", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStr);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectDateCtrl_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectDateCtrl_read3
			if(m_selcmd==null) throw new FoundationException("SelectDateCtrl", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStrs);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectDateCtrl_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);

			try {
				List list=new ArrayList();

				while((data=next(rs))!=null) {
					list.add(data);
				}

				return list;
			} finally {
				rs.close();
				rs = null;
			}
		}

		/**
		 * クエリーのprepare処理
		 *
		 * @return PreparedStatementインスタンスを返します
		 * @param conn Native Connectionインスタンス
		 * @param query SQL文字列
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query, AE0060020Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getsetPLANT_CD());
				if(isNull(data.getsetPLANT_CD())) isNull = true;

				// 静的SQL文の生成
				stmt = conn.prepareStatement(query);

			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * データ読出し処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getsetPLANT_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0060020Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0060020Struct data = new AE0060020Struct();

			data.setreadBUSINESS_OPR_DATE( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SelectDateCtrl", "hasRecord", "クエリー未登録");

			ResultSet rs=null;
			PreparedStatement stmt=null;

			try {
				stmt = prepare(conn, m_selcmd, data);

				rs = stmt.executeQuery();

				return rs.next();
			} finally {
				if(rs != null) {
					rs.close();
					rs = null;
				}
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return check(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectDateCtrl_check
			PreparedStatement stmt;

			if(m_chkcmd!=null) {
				stmt = prepare(conn, m_chkcmd, data);
			} else if(m_selcmd!=null) {
				stmt = prepare(conn, m_selcmd, data);
			} else {
				throw new FoundationException("SelectDateCtrl", "check", "クエリー未登録");
			}

			try {
				return check(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:SelectDateCtrl_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);
			boolean ret=true;

			try {
				if(rs.next()==false) return false;


				return ret;
			} finally {
				if (rs != null) {
					rs.close();
					rs = null;
				}
			}
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:SelectDateCtrl_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:SelectDateCtrl_clear

			return;
		}

		/**
		 * SelectDateCtrlクラスの標準コンストラクタ
		 */
		public SelectDateCtrl()
		{
			//{{user_implement_dev:SelectDateCtrl_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:SelectDateCtrl_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class SelectHeader extends DataObject
	{
		protected String m_selcmd = "select "
+"  T_PART_SUPPLIED_ISSUE.ITEM_CD as ITEM_CD, "
+"  M_ITEM.ITEM_NAME as ITEM_NAME, "
+"  decode(M_ITEM.LOT_CTRL_FLG, 1, nvl(T_LOT_USE_RSLT.SUPPLIED_ISSUE_QTY, 0), nvl(T_PART_SUPPLIED_ISSUE.SUPPLIED_ISSUE_QTY, 0)) as SUPPLIED_ISSUE_QTY, "
+"  M_ITEM.STOCK_UNIT as STOCK_UNIT, "
+"  decode(M_ITEM.LOT_CTRL_FLG, 1, nvl(T_LOT_USE_RSLT.TOTAL_ISSUE_QTY, 0), nvl(T_PART_SUPPLIED_ISSUE.TOTAL_ISSUE_QTY, 0)) as TOTAL_ISSUE_QTY, "
+"  decode(M_ITEM.LOT_CTRL_FLG, 1, to_char(T_LOT_USE_RSLT.SUPPLIED_DATE, 'YYYY/MM/DD'), to_char(T_PART_SUPPLIED_ISSUE.SUPPLIED_DATE, 'YYYY/MM/DD')) as SUPPLIED_DATE, "
+"  T1.DISPLAY_NAME as DISPLAY_NAME, "
+"  T_PART_SUPPLIED_ISSUE.MRP_ODR_TYP as MRP_ODR_TYP, "
+"  T_PART_SUPPLIED_ISSUE.VEND_CD as VEND_CD, "
+"  T_PART_SUPPLIED_ISSUE.PLANT_CD as PLANT_CD, "
+"  decode(M_ITEM.LOT_CTRL_FLG, 1, T_LOT_USE_RSLT.PART_SUPPLIED_COMMENT, T_PART_SUPPLIED_ISSUE.PART_SUPPLIED_COMMENT) as PART_SUPPLIED_COMMENT, "
+"  decode(M_ITEM.LOT_CTRL_FLG, 1, T_LOT_USE_RSLT.ISSUE_INST_CD, T_PART_SUPPLIED_ISSUE.ISSUE_INST_CD) as ISSUE_INST_CD, "
+"  to_char(T_PART_SUPPLIED_ISSUE.SUPPLIED_UNIT_DENOMINATOR, 'fm999999999999999990.0999') as SUPPLIED_UNIT_DENOMINATOR, "
+"  to_char(T_PART_SUPPLIED_ISSUE.SUPPLIED_UNIT_NUMERATOR, 'fm999999999999999990.0999') as SUPPLIED_UNIT_NUMERATOR, "
+"  T_PART_SUPPLIED_ISSUE.JOB_ODR_CD as JOB_ODR_CD, "
+"  T_PART_SUPPLIED_ISSUE.JOB_ODR_DETAIL_NO as JOB_ODR_DETAIL_NO, "
+"  T_PART_SUPPLIED_ISSUE.SUPPLIED_ISSUE_GNR_TYP as SUPPLIED_ISSUE_GNR_TYP, "
+"  T_LOT_USE_RSLT.LOT_NO as LOT_NO, "
+"  M_ITEM.LOT_CTRL_FLG as LOT_CTRL_FLG "
+"from "
+"  T_PART_SUPPLIED_ISSUE, "
+"  M_ITEM, "
+"  SYS_TYPE_VALUE T1, "
+"  T_LOT_USE_RSLT "
+"where "
+"  T_PART_SUPPLIED_ISSUE.ITEM_CD = M_ITEM.ITEM_CD "
+"  and T1.VALUE(+) = T_PART_SUPPLIED_ISSUE.MRP_ODR_TYP "
+"  and T1.NAME = 'MRP_ODR_TYP' "
+"  and T_PART_SUPPLIED_ISSUE.PUCH_ODR_CD = ? "
+"  and T_PART_SUPPLIED_ISSUE.ACPT_NO = ? "
+"  and T_PART_SUPPLIED_ISSUE.ITEM_CD = ? "
+"  and T_LOT_USE_RSLT.LOT_NO = ? "
+"  and T_PART_SUPPLIED_ISSUE.ITEM_CD = T_LOT_USE_RSLT.ITEM_CD(+) "
+"  and T_PART_SUPPLIED_ISSUE.PUCH_ODR_CD = T_LOT_USE_RSLT.PUCH_ODR_CD(+) "
+"  and T_PART_SUPPLIED_ISSUE.ACPT_NO = T_LOT_USE_RSLT.ACPT_NO(+)";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SelectHeader_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:SelectHeader_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStr);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStrs);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectHeader_read
			if(m_selcmd==null) throw new FoundationException("SelectHeader", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:SelectHeader_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectHeader_read2
			if(m_selcmd==null) throw new FoundationException("SelectHeader", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStr);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectHeader_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectHeader_read3
			if(m_selcmd==null) throw new FoundationException("SelectHeader", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStrs);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectHeader_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);

			try {
				List list=new ArrayList();

				while((data=next(rs))!=null) {
					list.add(data);
				}

				return list;
			} finally {
				if (rs != null) {
					rs.close();
					rs = null;
				}
			}
		}

		/**
		 * クエリーのprepare処理
		 *
		 * @return PreparedStatementインスタンスを返します
		 * @param conn Native Connectionインスタンス
		 * @param query SQL文字列
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query, AE0060020Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getPUCH_ODR_CD());
				if(isNull(data.getPUCH_ODR_CD())) isNull = true;
				ary.addElement(data.getl_ACPT_NO());
				if(isNull(data.getl_ACPT_NO())) isNull = true;
				ary.addElement(data.getl_ITEM_CD());
				if(isNull(data.getl_ITEM_CD())) isNull = true;
				ary.addElement(data.getl_LOT_NO());
				if(isNull(data.getl_LOT_NO())) isNull = true;

				//動的SQL生成ロジック
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("SelectHeader", "prepare", "Parse失敗:"+e.toString());
			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * データ読出し処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//動的SQL生成ロジック
			if(!isNull(data.getPUCH_ODR_CD())) setString(no ++, data.getPUCH_ODR_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getl_ACPT_NO())) setString(no ++, data.getl_ACPT_NO(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getl_ITEM_CD())) setString(no ++, data.getl_ITEM_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getl_LOT_NO())) setString(no ++, data.getl_LOT_NO(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0060020Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0060020Struct data = new AE0060020Struct();

			data.setreadITEM_CD( getString(1, rs) );
			data.setreadITEM_NAME( getString(2, rs) );
			data.setreadSUPPLIED_ISSUE_QTY( getString(3, rs) );
			data.setreadSTOCK_UNIT( getString(4, rs) );
			data.setreadTOTAL_ISSUE_QTY( getString(5, rs) );
			data.setreadSUPPLIED_DATE( getString(6, rs) );
			data.setreadDISPLAY_NAME( getString(7, rs) );
			data.setreadMRP_ODR_TYP( getString(8, rs) );
			data.setreadVEND_CD( getString(9, rs) );
			data.setreadPLANT_CD( getString(10, rs) );
			data.setreadPART_SUPPLIED_COMMENT( getString(11, rs) );
			data.setreadISSUE_INST_CD( getString(12, rs) );
			data.setreadSUPPLIED_UNIT_DENOMINATOR( getString(13, rs) );
			data.setreadSUPPLIED_UNIT_NUMERATOR( getString(14, rs) );
			data.setreadJOB_ODR_CD( getString(15, rs) );
			data.setreadJOB_ODR_DETAIL( getString(16, rs) );
			data.setreadSUPPLIED_ISSUE_GNR_TYP( getString(17, rs) );
			data.setreadLOT_NO( getString(18, rs) );
			data.setreadLOT_CONTROL_FLG( getString(19, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SelectHeader", "hasRecord", "クエリー未登録");

			ResultSet rs=null;
			PreparedStatement stmt=null;

			try {
				stmt = prepare(conn, m_selcmd, data);

				rs = stmt.executeQuery();

				return rs.next();
			} finally {
				if (rs != null) {
					rs.close();
					rs = null;
				}
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return check(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectHeader_check
			PreparedStatement stmt;

			if(m_chkcmd!=null) {
				stmt = prepare(conn, m_chkcmd, data);
			} else if(m_selcmd!=null) {
				stmt = prepare(conn, m_selcmd, data);
			} else {
				throw new FoundationException("SelectHeader", "check", "クエリー未登録");
			}

			try {
				return check(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:SelectHeader_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);
			boolean ret=true;

			try {
				if(rs.next()==false) return false;


				return ret;
			} finally {
				if (rs != null) {
					rs.close();
					rs = null;
				}
			}
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:SelectHeader_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:SelectHeader_clear

			return;
		}

		/**
		 * SelectHeaderクラスの標準コンストラクタ
		 */
		public SelectHeader()
		{
			//{{user_implement_dev:SelectHeader_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:SelectHeader_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class SelectHeaderVend extends DataObject
	{
		protected String m_selcmd = "select "
+"  T_RLSD_PUCH_ODR.\"VEND_CD\" as \"VEND_CD\", "
+"  T_RLSD_PUCH_ODR.\"PLANT_CD\" as \"PLANT_CD\", "
+"  T_RLSD_PUCH_ODR.\"COMPANY_CD\" as \"COMPANY_CD\", "
+"  M_VEND_CTRL.\"VEND_ANAME\" as \"VEND_ANAME\", "
+"  T_OD.\"MRP_ODR_TYP\" as \"MRP_ODR_TYP\", "
+"  T_OD.\"JOB_ODR_CD\" as \"JOB_ODR_CD\", "
+"  T_OD.\"JOB_ODR_DETAIL_NO\" as \"JOB_ODR_DETAIL_NO\" "
+"from "
+"  T_RLSD_PUCH_ODR, "
+"  M_VEND_CTRL, "
+"  T_OD "
+"where "
+"  T_RLSD_PUCH_ODR.VEND_CD = M_VEND_CTRL.VEND_CD "
+"  and T_RLSD_PUCH_ODR.OD_NO = T_OD.OD_NO "
+"  and T_RLSD_PUCH_ODR.PUCH_ODR_CD = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SelectHeaderVend_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:SelectHeaderVend_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStr);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStrs);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectHeaderVend_read
			if(m_selcmd==null) throw new FoundationException("SelectHeaderVend", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:SelectHeaderVend_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectHeaderVend_read2
			if(m_selcmd==null) throw new FoundationException("SelectHeaderVend", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStr);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectHeaderVend_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectHeaderVend_read3
			if(m_selcmd==null) throw new FoundationException("SelectHeaderVend", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStrs);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectHeaderVend_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);

			try {
				List list=new ArrayList();

				while((data=next(rs))!=null) {
					list.add(data);
				}

				return list;
			} finally {
				rs.close();
				rs = null;
			}
		}

		/**
		 * クエリーのprepare処理
		 *
		 * @return PreparedStatementインスタンスを返します
		 * @param conn Native Connectionインスタンス
		 * @param query SQL文字列
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query, AE0060020Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getPUCH_ODR_CD());
				if(isNull(data.getPUCH_ODR_CD())) isNull = true;

				// 静的SQL文の生成
				stmt = conn.prepareStatement(query);

			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * データ読出し処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getPUCH_ODR_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0060020Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0060020Struct data = new AE0060020Struct();

			data.setreadVEND_CD( getString(1, rs) );
			data.setreadPLANT_CD( getString(2, rs) );
			data.setreadCOMPANY_CD( getString(3, rs) );
			data.setreadVEND_NAME( getString(4, rs) );
			data.setreadMRP_ODR_TYP( getString(5, rs) );
			data.setreadJOB_ODR_CD( getString(6, rs) );
			data.setreadJOB_ODR_DETAIL_NO( getString(7, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SelectHeaderVend", "hasRecord", "クエリー未登録");

			ResultSet rs=null;
			PreparedStatement stmt=null;

			try {
				stmt = prepare(conn, m_selcmd, data);

				rs = stmt.executeQuery();

				return rs.next();
			} finally {
				if(rs != null) {
					rs.close();
					rs = null;
				}
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return check(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectHeaderVend_check
			PreparedStatement stmt;

			if(m_chkcmd!=null) {
				stmt = prepare(conn, m_chkcmd, data);
			} else if(m_selcmd!=null) {
				stmt = prepare(conn, m_selcmd, data);
			} else {
				throw new FoundationException("SelectHeaderVend", "check", "クエリー未登録");
			}

			try {
				return check(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:SelectHeaderVend_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);
			boolean ret=true;

			try {
				if(rs.next()==false) return false;


				return ret;
			} finally {
				if (rs != null) {
					rs.close();
					rs = null;
				}
			}
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:SelectHeaderVend_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:SelectHeaderVend_clear

			return;
		}

		/**
		 * SelectHeaderVendクラスの標準コンストラクタ
		 */
		public SelectHeaderVend()
		{
			//{{user_implement_dev:SelectHeaderVend_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:SelectHeaderVend_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class checkM_ITEM extends DataObject
	{
		protected String m_selcmd = "select "
+"  M_ITEM.\"ITEM_CD\" as \"ITEM_CD\", "
+"  M_ITEM.\"MRP_ODR_TYP\" as \"MRP_ODR_TYP\", "
+"  M_ITEM.\"UNIT_QTY_TYP\" as \"UNIT_QTY_TYP\" "
+"from "
+"  M_ITEM "
+"where "
+"  M_ITEM.ITEM_CD = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:checkM_ITEM_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:checkM_ITEM_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStr);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStrs);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:checkM_ITEM_read
			if(m_selcmd==null) throw new FoundationException("checkM_ITEM", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:checkM_ITEM_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:checkM_ITEM_read2
			if(m_selcmd==null) throw new FoundationException("checkM_ITEM", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStr);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:checkM_ITEM_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:checkM_ITEM_read3
			if(m_selcmd==null) throw new FoundationException("checkM_ITEM", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStrs);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:checkM_ITEM_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);

			try {
				List list=new ArrayList();

				while((data=next(rs))!=null) {
					list.add(data);
				}

				return list;
			} finally {
				rs.close();
				rs = null;
			}
		}

		/**
		 * クエリーのprepare処理
		 *
		 * @return PreparedStatementインスタンスを返します
		 * @param conn Native Connectionインスタンス
		 * @param query SQL文字列
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query, AE0060020Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getsetITEM_CD());
				if(isNull(data.getsetITEM_CD())) isNull = true;

				// 静的SQL文の生成
				stmt = conn.prepareStatement(query);

			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * データ読出し処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getsetITEM_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0060020Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0060020Struct data = new AE0060020Struct();

			data.setreadITEM_CD( getString(1, rs) );
			data.setreadMRP_ODR_TYP( getString(2, rs) );
			data.setreadUNIT_QTY_TYP( getString(3, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("checkM_ITEM", "hasRecord", "クエリー未登録");

			ResultSet rs=null;
			PreparedStatement stmt=null;

			try {
				stmt = prepare(conn, m_selcmd, data);

				rs = stmt.executeQuery();

				return rs.next();
			} finally {
				if(rs != null) {
					rs.close();
					rs = null;
				}
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return check(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:checkM_ITEM_check
			PreparedStatement stmt;

			if(m_chkcmd!=null) {
				stmt = prepare(conn, m_chkcmd, data);
			} else if(m_selcmd!=null) {
				stmt = prepare(conn, m_selcmd, data);
			} else {
				throw new FoundationException("checkM_ITEM", "check", "クエリー未登録");
			}

			try {
				return check(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:checkM_ITEM_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);
			boolean ret=true;

			try {
				if(rs.next()==false) return false;


				return ret;
			} finally {
				if (rs != null) {
					rs.close();
					rs = null;
				}
			}
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:checkM_ITEM_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:checkM_ITEM_clear

			return;
		}

		/**
		 * checkM_ITEMクラスの標準コンストラクタ
		 */
		public checkM_ITEM()
		{
			//{{user_implement_dev:checkM_ITEM_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:checkM_ITEM_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class checkT_PART_SUPPLIED_ISSUE extends DataObject
	{
		protected String m_selcmd = "select "
+"  T_PART_SUPPLIED_ISSUE.\"PUCH_ODR_CD\" as \"PUCH_ODR_CD\" "
+"from "
+"  T_PART_SUPPLIED_ISSUE "
+"where "
+"  T_PART_SUPPLIED_ISSUE.PUCH_ODR_CD = ? "
+"  and T_PART_SUPPLIED_ISSUE.ACPT_NO = ? "
+"  and T_PART_SUPPLIED_ISSUE.ITEM_CD = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:checkT_PART_SUPPLIED_ISSUE_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:checkT_PART_SUPPLIED_ISSUE_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStr);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStrs);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:checkT_PART_SUPPLIED_ISSUE_read
			if(m_selcmd==null) throw new FoundationException("checkT_PART_SUPPLIED_ISSUE", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:checkT_PART_SUPPLIED_ISSUE_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:checkT_PART_SUPPLIED_ISSUE_read2
			if(m_selcmd==null) throw new FoundationException("checkT_PART_SUPPLIED_ISSUE", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStr);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:checkT_PART_SUPPLIED_ISSUE_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:checkT_PART_SUPPLIED_ISSUE_read3
			if(m_selcmd==null) throw new FoundationException("checkT_PART_SUPPLIED_ISSUE", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStrs);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:checkT_PART_SUPPLIED_ISSUE_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);

			try {
				List list=new ArrayList();

				while((data=next(rs))!=null) {
					list.add(data);
				}

				return list;
			} finally {
				rs.close();
				rs = null;
			}
		}

		/**
		 * クエリーのprepare処理
		 *
		 * @return PreparedStatementインスタンスを返します
		 * @param conn Native Connectionインスタンス
		 * @param query SQL文字列
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query, AE0060020Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getsetPUCH_ODR_CD());
				if(isNull(data.getsetPUCH_ODR_CD())) isNull = true;
				ary.addElement(data.getsetACPT_NO());
				if(isNull(data.getsetACPT_NO())) isNull = true;
				ary.addElement(data.getsetITEM_CD());
				if(isNull(data.getsetITEM_CD())) isNull = true;

				// 静的SQL文の生成
				stmt = conn.prepareStatement(query);

			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * データ読出し処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getsetPUCH_ODR_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getsetACPT_NO(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getsetITEM_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0060020Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0060020Struct data = new AE0060020Struct();

			data.setreadPUCH_ODR_CD( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("checkT_PART_SUPPLIED_ISSUE", "hasRecord", "クエリー未登録");

			ResultSet rs=null;
			PreparedStatement stmt=null;

			try {
				stmt = prepare(conn, m_selcmd, data);

				rs = stmt.executeQuery();

				return rs.next();
			} finally {
				if(rs != null) {
					rs.close();
					rs = null;
				}
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return check(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:checkT_PART_SUPPLIED_ISSUE_check
			PreparedStatement stmt;

			if(m_chkcmd!=null) {
				stmt = prepare(conn, m_chkcmd, data);
			} else if(m_selcmd!=null) {
				stmt = prepare(conn, m_selcmd, data);
			} else {
				throw new FoundationException("checkT_PART_SUPPLIED_ISSUE", "check", "クエリー未登録");
			}

			try {
				return check(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:checkT_PART_SUPPLIED_ISSUE_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);
			boolean ret=true;

			try {
				if(rs.next()==false) return false;


				return ret;
			} finally {
				if (rs != null) {
					rs.close();
					rs = null;
				}
			}
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:checkT_PART_SUPPLIED_ISSUE_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:checkT_PART_SUPPLIED_ISSUE_clear

			return;
		}

		/**
		 * checkT_PART_SUPPLIED_ISSUEクラスの標準コンストラクタ
		 */
		public checkT_PART_SUPPLIED_ISSUE()
		{
			//{{user_implement_dev:checkT_PART_SUPPLIED_ISSUE_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:checkT_PART_SUPPLIED_ISSUE_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class SelectHeader2 extends DataObject
	{
		protected String m_selcmd = "select "
+"  T_PART_SUPPLIED_ISSUE.\"ITEM_CD\" as \"ITEM_CD\", "
+"  T_PART_SUPPLIED_ISSUE.\"SUPPLIED_ISSUE_QTY\" as \"SUPPLIED_ISSUE_QTY\", "
+"  T_PART_SUPPLIED_ISSUE.\"TOTAL_ISSUE_QTY\" as \"TOTAL_ISSUE_QTY\", "
+"  to_char(T_PART_SUPPLIED_ISSUE.\"SUPPLIED_DATE\", 'YYYY/MM/DD') as \"SUPPLIED_DATE\", "
+"  T_PART_SUPPLIED_ISSUE.\"MRP_ODR_TYP\" as \"MRP_ODR_TYP\", "
+"  T_PART_SUPPLIED_ISSUE.\"VEND_CD\" as \"VEND_CD\", "
+"  T_PART_SUPPLIED_ISSUE.\"PLANT_CD\" as \"PLANT_CD\", "
+"  T_PART_SUPPLIED_ISSUE.\"PART_SUPPLIED_COMMENT\" as \"PART_SUPPLIED_COMMENT\", "
+"  T_PART_SUPPLIED_ISSUE.\"ISSUE_INST_CD\" as \"ISSUE_INST_CD\", "
+"  T_PART_SUPPLIED_ISSUE.\"JOB_ODR_CD\" as \"JOB_ODR_CD\", "
+"  T_PART_SUPPLIED_ISSUE.\"JOB_ODR_DETAIL_NO\" as \"JOB_ODR_DETAIL_NO\", "
+"  T_PART_SUPPLIED_ISSUE.\"SUPPLIED_ISSUE_GNR_TYP\" as \"SUPPLIED_ISSUE_GNR_TYP\", "
+"  T_PART_SUPPLIED_ISSUE.\"ISSUE_INST_CD\" as \"ISSUE_INST_CD\", "
+"  T_PART_SUPPLIED_ISSUE.\"COMPANY_CD\" as \"COMPANY_CD\", "
+"  T_ISSUE_INST.\"OD_NO\" as \"OD_NO\", "
+"  T_ISSUE_INST.\"CONS_TYP\" as \"CONS_TYP\", "
+"  M_ITEM.\"UNIT_QTY_TYP\" as \"UNIT_QTY_TYP\", "
+"  M_ITEM.\"LOT_CTRL_FLG\" as \"LOT_CTRL_FLG\" "
+"from "
+"  T_PART_SUPPLIED_ISSUE, "
+"  T_ISSUE_INST, "
+"  M_ITEM "
+"where "
+"  T_PART_SUPPLIED_ISSUE.ITEM_CD = M_ITEM.ITEM_CD "
+"  and T_PART_SUPPLIED_ISSUE.ISSUE_INST_CD = T_ISSUE_INST.ISSUE_INST_CD(+) "
+"  and T_PART_SUPPLIED_ISSUE.PUCH_ODR_CD = ? "
+"  and T_PART_SUPPLIED_ISSUE.ACPT_NO = ? "
+"  and T_PART_SUPPLIED_ISSUE.ITEM_CD = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SelectHeader2_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:SelectHeader2_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStr);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStrs);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectHeader2_read
			if(m_selcmd==null) throw new FoundationException("SelectHeader2", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:SelectHeader2_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectHeader2_read2
			if(m_selcmd==null) throw new FoundationException("SelectHeader2", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStr);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectHeader2_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectHeader2_read3
			if(m_selcmd==null) throw new FoundationException("SelectHeader2", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStrs);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectHeader2_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);

			try {
				List list=new ArrayList();

				while((data=next(rs))!=null) {
					list.add(data);
				}

				return list;
			} finally {
				rs.close();
				rs = null;
			}
		}

		/**
		 * クエリーのprepare処理
		 *
		 * @return PreparedStatementインスタンスを返します
		 * @param conn Native Connectionインスタンス
		 * @param query SQL文字列
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query, AE0060020Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getsetPUCH_ODR_CD());
				if(isNull(data.getsetPUCH_ODR_CD())) isNull = true;
				ary.addElement(data.getsetACPT_NO());
				if(isNull(data.getsetACPT_NO())) isNull = true;
				ary.addElement(data.getsetITEM_CD());
				if(isNull(data.getsetITEM_CD())) isNull = true;

				// 静的SQL文の生成
				stmt = conn.prepareStatement(query);

			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * データ読出し処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getsetPUCH_ODR_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getsetACPT_NO(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getsetITEM_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0060020Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0060020Struct data = new AE0060020Struct();

			data.setreadITEM_CD( getString(1, rs) );
			data.setreadSUPPLIED_ISSUE_QTY( getString(2, rs) );
			data.setreadTOTAL_ISSUE_QTY( getString(3, rs) );
			data.setreadSUPPLIED_DATE( getString(4, rs) );
			data.setreadMRP_ODR_TYP( getString(5, rs) );
			data.setreadVEND_CD( getString(6, rs) );
			data.setreadPLANT_CD( getString(7, rs) );
			data.setreadPART_SUPPLIED_COMMENT( getString(8, rs) );
			data.setreadISSUE_INST_CD( getString(9, rs) );
			data.setreadJOB_ODR_CD( getString(10, rs) );
			data.setreadJOB_ODR_DETAIL_NO( getString(11, rs) );
			data.setreadSUPPLIED_ISSUE_GNR_TYP( getString(12, rs) );
			data.setreadISSUE_INST_CD( getString(13, rs) );
			data.setreadCOMPANY_CD( getString(14, rs) );
			data.setreadOD_NO( getString(15, rs) );
			data.setreadCONS_TYP( getString(16, rs) );
			data.setreadUNIT_QTY_TYP( getString(17, rs) );
			data.setreadLOT_CONTROL_FLG( getString(18, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SelectHeader2", "hasRecord", "クエリー未登録");

			ResultSet rs=null;
			PreparedStatement stmt=null;

			try {
				stmt = prepare(conn, m_selcmd, data);

				rs = stmt.executeQuery();

				return rs.next();
			} finally {
				if(rs != null) {
					rs.close();
					rs = null;
				}
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return check(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectHeader2_check
			PreparedStatement stmt;

			if(m_chkcmd!=null) {
				stmt = prepare(conn, m_chkcmd, data);
			} else if(m_selcmd!=null) {
				stmt = prepare(conn, m_selcmd, data);
			} else {
				throw new FoundationException("SelectHeader2", "check", "クエリー未登録");
			}

			try {
				return check(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:SelectHeader2_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);
			boolean ret=true;

			try {
				if(rs.next()==false) return false;


				return ret;
			} finally {
				if (rs != null) {
					rs.close();
					rs = null;
				}
			}
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:SelectHeader2_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:SelectHeader2_clear

			return;
		}

		/**
		 * SelectHeader2クラスの標準コンストラクタ
		 */
		public SelectHeader2()
		{
			//{{user_implement_dev:SelectHeader2_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:SelectHeader2_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class updateT_PART_SUPPLIED_ISSUE_SUP extends DataObject
	{
		protected String m_selcmd = "select "
+"  T_PART_SUPPLIED_ISSUE.\"MODIFY_COUNT\" "
+"from "
+"  T_PART_SUPPLIED_ISSUE "
+"where "
+"  T_PART_SUPPLIED_ISSUE.\"PUCH_ODR_CD\" = ? "
+"  and T_PART_SUPPLIED_ISSUE.\"ACPT_NO\" = to_number(?) "
+"  and T_PART_SUPPLIED_ISSUE.\"ITEM_CD\" = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = "update "
+"  T_PART_SUPPLIED_ISSUE "
+"set "
+" \"SUPPLIED_ISSUE_GNR_TYP\" = to_number(?), "
+" \"SUPPLIED_DATE\" = to_date(?,'YYYY/MM/DD') "
+"where "
+"  T_PART_SUPPLIED_ISSUE.\"PUCH_ODR_CD\" = ? "
+"  and T_PART_SUPPLIED_ISSUE.\"ACPT_NO\" = to_number(?) "
+"  and T_PART_SUPPLIED_ISSUE.\"ITEM_CD\" = ? "
+" "
+"";
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="AE0060020";
		protected String m_sUpdateProgramName="AE0060020";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:updateT_PART_SUPPLIED_ISSUE_SUP_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:updateT_PART_SUPPLIED_ISSUE_SUP_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStr);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStrs);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:updateT_PART_SUPPLIED_ISSUE_SUP_read
			if(m_selcmd==null) throw new FoundationException("updateT_PART_SUPPLIED_ISSUE_SUP", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:updateT_PART_SUPPLIED_ISSUE_SUP_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:updateT_PART_SUPPLIED_ISSUE_SUP_read2
			if(m_selcmd==null) throw new FoundationException("updateT_PART_SUPPLIED_ISSUE_SUP", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStr);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:updateT_PART_SUPPLIED_ISSUE_SUP_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:updateT_PART_SUPPLIED_ISSUE_SUP_read3
			if(m_selcmd==null) throw new FoundationException("updateT_PART_SUPPLIED_ISSUE_SUP", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStrs);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:updateT_PART_SUPPLIED_ISSUE_SUP_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);

			try {
				List list=new ArrayList();

				while((data=next(rs))!=null) {
					list.add(data);
				}

				return list;
			} finally {
				rs.close();
				rs = null;
			}
		}

		/**
		 * クエリーのprepare処理
		 *
		 * @return PreparedStatementインスタンスを返します
		 * @param conn Native Connectionインスタンス
		 * @param query SQL文字列
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query, AE0060020Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getPUCH_ODR_CD());
				if(isNull(data.getPUCH_ODR_CD())) isNull = true;
				ary.addElement(data.getACPT_NO());
				if(isNull(data.getACPT_NO())) isNull = true;
				ary.addElement(data.getITEM_CD());
				if(isNull(data.getITEM_CD())) isNull = true;

				// 静的SQL文の生成
				stmt = conn.prepareStatement(query);

			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * データ読出し処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getPUCH_ODR_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getACPT_NO(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getITEM_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0060020Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0060020Struct data = new AE0060020Struct();

			data.seth_MODIFY_COUNT( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("updateT_PART_SUPPLIED_ISSUE_SUP", "hasRecord", "クエリー未登録");

			ResultSet rs=null;
			PreparedStatement stmt=null;

			try {
				stmt = prepare(conn, m_selcmd, data);

				rs = stmt.executeQuery();

				return rs.next();
			} finally {
				if(rs != null) {
					rs.close();
					rs = null;
				}
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return check(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:updateT_PART_SUPPLIED_ISSUE_SUP_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:updateT_PART_SUPPLIED_ISSUE_SUP_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);
			boolean ret=true;

			try {
				if(rs.next()==false) return false;


				return ret;
			} finally {
				if (rs != null) {
					rs.close();
					rs = null;
				}
			}
		}
		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return update(conn.getConn(), data);
		}

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt=null;
			int modifyCount;

			try {
				if("Oracle".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U(m_updcmd));
				} else if("Microsoft SQL Server".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U_MSSQL(m_updcmd));
				} else if("PostgreSQL".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U_PGSQL(m_updcmd));
				} else if("MySQL".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U_MYSQL(m_updcmd));
				} else {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U_DB2(m_updcmd));
				}

				setString(1, data.getsSysdate(), stmt);
				setString(2, data.getsUser_ID(), stmt);
				setString(3, m_sUpdateProgramName, stmt);
				setString(4, data.getsetSUPPLIED_ISSUE_GNR_TYP(), stmt);
				setString(5, data.getsetSUPPLIED_DATE(), stmt);
				setString(6, data.getsetPUCH_ODR_CD(), stmt);
				setString(7, data.getsetACPT_NO(), stmt);
				setString(8, data.getsetITEM_CD(), stmt);

				return stmt.executeUpdate();
			} finally {
				if(stmt!=null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:updateT_PART_SUPPLIED_ISSUE_SUP_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:updateT_PART_SUPPLIED_ISSUE_SUP_clear

			return;
		}

		/**
		 * updateT_PART_SUPPLIED_ISSUE_SUPクラスの標準コンストラクタ
		 */
		public updateT_PART_SUPPLIED_ISSUE_SUP()
		{
			//{{user_implement_dev:updateT_PART_SUPPLIED_ISSUE_SUP_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:updateT_PART_SUPPLIED_ISSUE_SUP_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class updateT_PART_SUPPLIED_ISSUE_COM extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = "update "
+"  T_PART_SUPPLIED_ISSUE "
+"set "
+"  \"SUPPLIED_ISSUE_GNR_TYP\" = to_number(?), "
+"  \"PART_SUPPLIED_COMMENT\" = ? "
+"where "
+"  T_PART_SUPPLIED_ISSUE.\"PUCH_ODR_CD\" = ? "
+"  and T_PART_SUPPLIED_ISSUE.\"ACPT_NO\" = to_number(?) "
+"  and T_PART_SUPPLIED_ISSUE.\"ITEM_CD\" = ?";
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="AE0060020";
		protected String m_sUpdateProgramName="AE0060020";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:updateT_PART_SUPPLIED_ISSUE_COM_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:updateT_PART_SUPPLIED_ISSUE_COM_def

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return update(conn.getConn(), data);
		}

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt=null;
			int modifyCount;

			try {
				if("Oracle".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U(m_updcmd));
				} else if("Microsoft SQL Server".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U_MSSQL(m_updcmd));
				} else if("PostgreSQL".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U_PGSQL(m_updcmd));
				} else if("MySQL".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U_MYSQL(m_updcmd));
				} else {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U_DB2(m_updcmd));
				}

				setString(1, data.getsSysdate(), stmt);
				setString(2, data.getsUser_ID(), stmt);
				setString(3, m_sUpdateProgramName, stmt);
				setString(4, data.getsetSUPPLIED_ISSUE_GNR_TYP(), stmt);
				setString(5, data.getsetPART_SUPPLIED_COMMENT(), stmt);
				setString(6, data.getsetPUCH_ODR_CD(), stmt);
				setString(7, data.getsetACPT_NO(), stmt);
				setString(8, data.getsetITEM_CD(), stmt);

				return stmt.executeUpdate();
			} finally {
				if(stmt!=null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:updateT_PART_SUPPLIED_ISSUE_COM_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:updateT_PART_SUPPLIED_ISSUE_COM_clear

			return;
		}

		/**
		 * updateT_PART_SUPPLIED_ISSUE_COMクラスの標準コンストラクタ
		 */
		public updateT_PART_SUPPLIED_ISSUE_COM()
		{
			//{{user_implement_dev:updateT_PART_SUPPLIED_ISSUE_COM_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:updateT_PART_SUPPLIED_ISSUE_COM_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class updateT_PART_SUPPLIED_ISSUE_NOMAL extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = "update "
+"  T_PART_SUPPLIED_ISSUE "
+"set "
+"  \"SUPPLIED_ISSUE_GNR_TYP\" = to_number(?), "
+"  \"TOTAL_ISSUE_QTY\" = to_number(?), "
+"  \"SUPPLIED_DATE\" = to_date(?,'YYYY/MM/DD'), "
+"  \"PART_SUPPLIED_COMMENT\" = ? "
+"where "
+"  T_PART_SUPPLIED_ISSUE.\"PUCH_ODR_CD\" = ? "
+"  and T_PART_SUPPLIED_ISSUE.\"ACPT_NO\" = to_number(?) "
+"  and T_PART_SUPPLIED_ISSUE.\"ITEM_CD\" = ?";
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="AE0060020";
		protected String m_sUpdateProgramName="AE0060020";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:updateT_PART_SUPPLIED_ISSUE_NOMAL_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:updateT_PART_SUPPLIED_ISSUE_NOMAL_def

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return update(conn.getConn(), data);
		}

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt=null;
			int modifyCount;

			try {
				if("Oracle".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U(m_updcmd));
				} else if("Microsoft SQL Server".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U_MSSQL(m_updcmd));
				} else if("PostgreSQL".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U_PGSQL(m_updcmd));
				} else if("MySQL".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U_MYSQL(m_updcmd));
				} else {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U_DB2(m_updcmd));
				}

				setString(1, data.getsSysdate(), stmt);
				setString(2, data.getsUser_ID(), stmt);
				setString(3, m_sUpdateProgramName, stmt);
				setString(4, data.getsetSUPPLIED_ISSUE_GNR_TYP(), stmt);
				setString(5, data.getsetTOTAL_ISSUE_QTY(), stmt);
				setString(6, data.getsetSUPPLIED_DATE(), stmt);
				setString(7, data.getsetPART_SUPPLIED_COMMENT(), stmt);
				setString(8, data.getsetPUCH_ODR_CD(), stmt);
				setString(9, data.getsetACPT_NO(), stmt);
				setString(10, data.getsetITEM_CD(), stmt);

				return stmt.executeUpdate();
			} finally {
				if(stmt!=null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:updateT_PART_SUPPLIED_ISSUE_NOMAL_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:updateT_PART_SUPPLIED_ISSUE_NOMAL_clear

			return;
		}

		/**
		 * updateT_PART_SUPPLIED_ISSUE_NOMALクラスの標準コンストラクタ
		 */
		public updateT_PART_SUPPLIED_ISSUE_NOMAL()
		{
			//{{user_implement_dev:updateT_PART_SUPPLIED_ISSUE_NOMAL_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:updateT_PART_SUPPLIED_ISSUE_NOMAL_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class checkT_RLSD_PUCH_ODR extends DataObject
	{
		protected String m_selcmd = "select "
+"  T_RLSD_PUCH_ODR.\"ITEM_CD\" as \"ITEM_CD\" "
+"from "
+"  T_RLSD_PUCH_ODR "
+"where "
+"  T_RLSD_PUCH_ODR.PUCH_ODR_CD = ? "
+"  and T_RLSD_PUCH_ODR.ITEM_CD = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:checkT_RLSD_PUCH_ODR_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:checkT_RLSD_PUCH_ODR_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStr);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStrs);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:checkT_RLSD_PUCH_ODR_read
			if(m_selcmd==null) throw new FoundationException("checkT_RLSD_PUCH_ODR", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:checkT_RLSD_PUCH_ODR_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:checkT_RLSD_PUCH_ODR_read2
			if(m_selcmd==null) throw new FoundationException("checkT_RLSD_PUCH_ODR", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStr);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:checkT_RLSD_PUCH_ODR_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:checkT_RLSD_PUCH_ODR_read3
			if(m_selcmd==null) throw new FoundationException("checkT_RLSD_PUCH_ODR", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStrs);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:checkT_RLSD_PUCH_ODR_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);

			try {
				List list=new ArrayList();

				while((data=next(rs))!=null) {
					list.add(data);
				}

				return list;
			} finally {
				rs.close();
				rs = null;
			}
		}

		/**
		 * クエリーのprepare処理
		 *
		 * @return PreparedStatementインスタンスを返します
		 * @param conn Native Connectionインスタンス
		 * @param query SQL文字列
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query, AE0060020Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getsetPUCH_ODR_CD());
				if(isNull(data.getsetPUCH_ODR_CD())) isNull = true;
				ary.addElement(data.getsetITEM_CD());
				if(isNull(data.getsetITEM_CD())) isNull = true;

				// 静的SQL文の生成
				stmt = conn.prepareStatement(query);

			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * データ読出し処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getsetPUCH_ODR_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getsetITEM_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0060020Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0060020Struct data = new AE0060020Struct();

			data.setreadPUCH_ITEM_CD( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("checkT_RLSD_PUCH_ODR", "hasRecord", "クエリー未登録");

			ResultSet rs=null;
			PreparedStatement stmt=null;

			try {
				stmt = prepare(conn, m_selcmd, data);

				rs = stmt.executeQuery();

				return rs.next();
			} finally {
				if(rs != null) {
					rs.close();
					rs = null;
				}
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return check(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:checkT_RLSD_PUCH_ODR_check
			PreparedStatement stmt;

			if(m_chkcmd!=null) {
				stmt = prepare(conn, m_chkcmd, data);
			} else if(m_selcmd!=null) {
				stmt = prepare(conn, m_selcmd, data);
			} else {
				throw new FoundationException("checkT_RLSD_PUCH_ODR", "check", "クエリー未登録");
			}

			try {
				return check(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:checkT_RLSD_PUCH_ODR_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);
			boolean ret=true;

			try {
				if(rs.next()==false) return false;


				return ret;
			} finally {
				if (rs != null) {
					rs.close();
					rs = null;
				}
			}
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:checkT_RLSD_PUCH_ODR_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:checkT_RLSD_PUCH_ODR_clear

			return;
		}

		/**
		 * checkT_RLSD_PUCH_ODRクラスの標準コンストラクタ
		 */
		public checkT_RLSD_PUCH_ODR()
		{
			//{{user_implement_dev:checkT_RLSD_PUCH_ODR_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:checkT_RLSD_PUCH_ODR_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class updateT_PART_SUPPLIED_ISSUE_GNR extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = "update "
+"  T_PART_SUPPLIED_ISSUE "
+"set "
+"  \"ACPT_QTY\" = to_number(?), "
+"  \"SUPPLIED_ISSUE_QTY\" = to_number(?) "
+"where "
+"  T_PART_SUPPLIED_ISSUE.\"PUCH_ODR_CD\" = ? "
+"and "
+"  T_PART_SUPPLIED_ISSUE.\"ACPT_NO\" = to_number(?) "
+"and "
+"  T_PART_SUPPLIED_ISSUE.\"ITEM_CD\" = ?";
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="AE0060020";
		protected String m_sUpdateProgramName="AE0060020";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:updateT_PART_SUPPLIED_ISSUE_GNR_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:updateT_PART_SUPPLIED_ISSUE_GNR_def

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return update(conn.getConn(), data);
		}

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt=null;
			int modifyCount;

			try {
				if("Oracle".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U(m_updcmd));
				} else if("Microsoft SQL Server".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U_MSSQL(m_updcmd));
				} else if("PostgreSQL".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U_PGSQL(m_updcmd));
				} else if("MySQL".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U_MYSQL(m_updcmd));
				} else {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U_DB2(m_updcmd));
				}

				setString(1, data.getsSysdate(), stmt);
				setString(2, data.getsUser_ID(), stmt);
				setString(3, m_sUpdateProgramName, stmt);
				setString(4, data.getsetACPT_QTY(), stmt);
				setString(5, data.getsetSUPPLIED_ISSUE_QTY(), stmt);
				setString(6, data.getsetPUCH_ODR_CD(), stmt);
				setString(7, data.getsetACPT_NO(), stmt);
				setString(8, data.getsetITEM_CD(), stmt);

				return stmt.executeUpdate();
			} finally {
				if(stmt!=null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:updateT_PART_SUPPLIED_ISSUE_GNR_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:updateT_PART_SUPPLIED_ISSUE_GNR_clear

			return;
		}

		/**
		 * updateT_PART_SUPPLIED_ISSUE_GNRクラスの標準コンストラクタ
		 */
		public updateT_PART_SUPPLIED_ISSUE_GNR()
		{
			//{{user_implement_dev:updateT_PART_SUPPLIED_ISSUE_GNR_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:updateT_PART_SUPPLIED_ISSUE_GNR_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class T_ACPT_RSLT_COUNT extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  TO_CHAR(COUNT(*)) AS ACPT_RSLT_COUNT "
+"FROM "
+"  T_ACPT_RSLT "
+"WHERE "
+"  PUCH_ODR_CD = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:T_ACPT_RSLT_COUNT_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:T_ACPT_RSLT_COUNT_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStr);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStrs);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_ACPT_RSLT_COUNT_read
			if(m_selcmd==null) throw new FoundationException("T_ACPT_RSLT_COUNT", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:T_ACPT_RSLT_COUNT_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_ACPT_RSLT_COUNT_read2
			if(m_selcmd==null) throw new FoundationException("T_ACPT_RSLT_COUNT", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStr);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:T_ACPT_RSLT_COUNT_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_ACPT_RSLT_COUNT_read3
			if(m_selcmd==null) throw new FoundationException("T_ACPT_RSLT_COUNT", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStrs);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:T_ACPT_RSLT_COUNT_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);

			try {
				List list=new ArrayList();

				while((data=next(rs))!=null) {
					list.add(data);
				}

				return list;
			} finally {
				rs.close();
				rs = null;
			}
		}

		/**
		 * クエリーのprepare処理
		 *
		 * @return PreparedStatementインスタンスを返します
		 * @param conn Native Connectionインスタンス
		 * @param query SQL文字列
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query, AE0060020Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getPUCH_ODR_CD());
				if(isNull(data.getPUCH_ODR_CD())) isNull = true;

				// 静的SQL文の生成
				stmt = conn.prepareStatement(query);

			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * データ読出し処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getPUCH_ODR_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0060020Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0060020Struct data = new AE0060020Struct();

			data.setACPT_RSLT_COUNT( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("T_ACPT_RSLT_COUNT", "hasRecord", "クエリー未登録");

			ResultSet rs=null;
			PreparedStatement stmt=null;

			try {
				stmt = prepare(conn, m_selcmd, data);

				rs = stmt.executeQuery();

				return rs.next();
			} finally {
				if(rs != null) {
					rs.close();
					rs = null;
				}
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return check(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_ACPT_RSLT_COUNT_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:T_ACPT_RSLT_COUNT_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);
			boolean ret=true;

			try {
				if(rs.next()==false) return false;


				return ret;
			} finally {
				if (rs != null) {
					rs.close();
					rs = null;
				}
			}
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:T_ACPT_RSLT_COUNT_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:T_ACPT_RSLT_COUNT_clear

			return;
		}

		/**
		 * T_ACPT_RSLT_COUNTクラスの標準コンストラクタ
		 */
		public T_ACPT_RSLT_COUNT()
		{
			//{{user_implement_dev:T_ACPT_RSLT_COUNT_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:T_ACPT_RSLT_COUNT_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class T_PART_SUPPLIED_ISSUE_COUNT extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  TO_CHAR(SUM(TOTAL_ISSUE_QTY)) AS SUM_OF_TOTAL_ISSUE_QTY "
+"FROM "
+"  T_PART_SUPPLIED_ISSUE "
+"WHERE "
+"  T_PART_SUPPLIED_ISSUE.PUCH_ODR_CD = ? "
+"  AND T_PART_SUPPLIED_ISSUE.ACPT_NO = TO_NUMBER(?)";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:T_PART_SUPPLIED_ISSUE_COUNT_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:T_PART_SUPPLIED_ISSUE_COUNT_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStr);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStrs);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_PART_SUPPLIED_ISSUE_COUNT_read
			if(m_selcmd==null) throw new FoundationException("T_PART_SUPPLIED_ISSUE_COUNT", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:T_PART_SUPPLIED_ISSUE_COUNT_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_PART_SUPPLIED_ISSUE_COUNT_read2
			if(m_selcmd==null) throw new FoundationException("T_PART_SUPPLIED_ISSUE_COUNT", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStr);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:T_PART_SUPPLIED_ISSUE_COUNT_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_PART_SUPPLIED_ISSUE_COUNT_read3
			if(m_selcmd==null) throw new FoundationException("T_PART_SUPPLIED_ISSUE_COUNT", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStrs);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:T_PART_SUPPLIED_ISSUE_COUNT_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);

			try {
				List list=new ArrayList();

				while((data=next(rs))!=null) {
					list.add(data);
				}

				return list;
			} finally {
				rs.close();
				rs = null;
			}
		}

		/**
		 * クエリーのprepare処理
		 *
		 * @return PreparedStatementインスタンスを返します
		 * @param conn Native Connectionインスタンス
		 * @param query SQL文字列
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query, AE0060020Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getPUCH_ODR_CD());
				if(isNull(data.getPUCH_ODR_CD())) isNull = true;
				ary.addElement(data.getACPT_NO());
				if(isNull(data.getACPT_NO())) isNull = true;

				// 静的SQL文の生成
				stmt = conn.prepareStatement(query);

			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * データ読出し処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getPUCH_ODR_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getACPT_NO(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0060020Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0060020Struct data = new AE0060020Struct();

			data.setSUM_OF_TOTAL_ISSUE_QTY( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("T_PART_SUPPLIED_ISSUE_COUNT", "hasRecord", "クエリー未登録");

			ResultSet rs=null;
			PreparedStatement stmt=null;

			try {
				stmt = prepare(conn, m_selcmd, data);

				rs = stmt.executeQuery();

				return rs.next();
			} finally {
				if(rs != null) {
					rs.close();
					rs = null;
				}
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return check(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_PART_SUPPLIED_ISSUE_COUNT_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:T_PART_SUPPLIED_ISSUE_COUNT_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);
			boolean ret=true;

			try {
				if(rs.next()==false) return false;


				return ret;
			} finally {
				if (rs != null) {
					rs.close();
					rs = null;
				}
			}
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:T_PART_SUPPLIED_ISSUE_COUNT_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:T_PART_SUPPLIED_ISSUE_COUNT_clear

			return;
		}

		/**
		 * T_PART_SUPPLIED_ISSUE_COUNTクラスの標準コンストラクタ
		 */
		public T_PART_SUPPLIED_ISSUE_COUNT()
		{
			//{{user_implement_dev:T_PART_SUPPLIED_ISSUE_COUNT_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:T_PART_SUPPLIED_ISSUE_COUNT_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class T_RLSD_PUCH_ODR_FOR_CANCEL_ODR_CANCEL extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = "update "
+"  T_RLSD_PUCH_ODR "
+"set "
+"  \"PUCH_ODR_STS_TYP\" = 2, "
+"  \"ACPT_CMPLT_DATE\" = NULL, "
+"  \"INSPC_CMPLT_FLG\" = decode(\"ACPT_INSPC_TYP\", 1, 0, \"INSPC_CMPLT_FLG\"), "
+"  \"INSPC_CMPLT_DATE\" = decode(\"ACPT_INSPC_TYP\", 1, NULL, \"INSPC_CMPLT_DATE\"), "
+"  \"ODR_CANCEL_CAUSE_CD\" = NULL, "
+"  \"ODR_CANCEL_SLIP_ISS_FLG\" = 0 "
+"where "
+"  T_RLSD_PUCH_ODR.\"PUCH_ODR_CD\" = ?";
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="AE0060020";
		protected String m_sUpdateProgramName="AE0060020";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:T_RLSD_PUCH_ODR_FOR_CANCEL_ODR_CANCEL_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:T_RLSD_PUCH_ODR_FOR_CANCEL_ODR_CANCEL_def

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return update(conn.getConn(), data);
		}

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt=null;
			int modifyCount;

			try {
				if("Oracle".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U(m_updcmd));
				} else if("Microsoft SQL Server".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U_MSSQL(m_updcmd));
				} else if("PostgreSQL".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U_PGSQL(m_updcmd));
				} else if("MySQL".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U_MYSQL(m_updcmd));
				} else {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U_DB2(m_updcmd));
				}

				setString(1, data.getsSysdate(), stmt);
				setString(2, data.getsUser_ID(), stmt);
				setString(3, m_sUpdateProgramName, stmt);
				setString(4, data.getPUCH_ODR_CD(), stmt);

				return stmt.executeUpdate();
			} finally {
				if(stmt!=null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:T_RLSD_PUCH_ODR_FOR_CANCEL_ODR_CANCEL_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:T_RLSD_PUCH_ODR_FOR_CANCEL_ODR_CANCEL_clear

			return;
		}

		/**
		 * T_RLSD_PUCH_ODR_FOR_CANCEL_ODR_CANCELクラスの標準コンストラクタ
		 */
		public T_RLSD_PUCH_ODR_FOR_CANCEL_ODR_CANCEL()
		{
			//{{user_implement_dev:T_RLSD_PUCH_ODR_FOR_CANCEL_ODR_CANCEL_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:T_RLSD_PUCH_ODR_FOR_CANCEL_ODR_CANCEL_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class T_ACPT_RSLT_FOR_CANCEL_ODR_CANCEL extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = "DELETE FROM "
+"  T_ACPT_RSLT "
+"WHERE "
+"  PUCH_ODR_CD = ? "
+"  AND ACPT_NO = to_number(?)";
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="AE0060020";
		protected String m_sUpdateProgramName="AE0060020";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:T_ACPT_RSLT_FOR_CANCEL_ODR_CANCEL_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:T_ACPT_RSLT_FOR_CANCEL_ODR_CANCEL_def

		/**
		 * データ削除処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int delete(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return delete(conn.getConn(), data);
		}

		/**
		 * データ削除処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int delete(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt=null;

			try {
				stmt = conn.prepareStatement(m_delcmd);

				setString(1, data.getPUCH_ODR_CD(), stmt);
				setString(2, data.getACPT_NO(), stmt);

				return stmt.executeUpdate();
			} finally {
				if(stmt!=null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:T_ACPT_RSLT_FOR_CANCEL_ODR_CANCEL_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:T_ACPT_RSLT_FOR_CANCEL_ODR_CANCEL_clear

			return;
		}

		/**
		 * T_ACPT_RSLT_FOR_CANCEL_ODR_CANCELクラスの標準コンストラクタ
		 */
		public T_ACPT_RSLT_FOR_CANCEL_ODR_CANCEL()
		{
			//{{user_implement_dev:T_ACPT_RSLT_FOR_CANCEL_ODR_CANCEL_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:T_ACPT_RSLT_FOR_CANCEL_ODR_CANCEL_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class SYS_DEBT_CTRL extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  TO_CHAR(TO_DATE(THIS_MONTH, 'YYYY/MM'), 'YYYY/MM') AS THIS_MONTH "
+"FROM "
+"  SYS_DEBT_CTRL "
+"WHERE "
+"  COMPANY_CD = ( "
+"    SELECT "
+"      COMPANY_CD "
+"    FROM "
+"      SYS_MY_COMPANY "
+"    WHERE "
+"      CTRL_CD = 'SYSTEM' "
+"  )";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SYS_DEBT_CTRL_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:SYS_DEBT_CTRL_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStr);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStrs);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SYS_DEBT_CTRL_read
			if(m_selcmd==null) throw new FoundationException("SYS_DEBT_CTRL", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SYS_DEBT_CTRL_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SYS_DEBT_CTRL_read2
			if(m_selcmd==null) throw new FoundationException("SYS_DEBT_CTRL", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStr);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SYS_DEBT_CTRL_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SYS_DEBT_CTRL_read3
			if(m_selcmd==null) throw new FoundationException("SYS_DEBT_CTRL", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStrs);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SYS_DEBT_CTRL_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);

			try {
				List list=new ArrayList();

				while((data=next(rs))!=null) {
					list.add(data);
				}

				return list;
			} finally {
				rs.close();
				rs = null;
			}
		}

		/**
		 * クエリーのprepare処理
		 *
		 * @return PreparedStatementインスタンスを返します
		 * @param conn Native Connectionインスタンス
		 * @param query SQL文字列
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query, AE0060020Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {

				// 静的SQL文の生成
				stmt = conn.prepareStatement(query);

			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * データ読出し処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			int no=1;


			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0060020Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0060020Struct data = new AE0060020Struct();

			data.setTHIS_MONTH( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SYS_DEBT_CTRL", "hasRecord", "クエリー未登録");

			ResultSet rs=null;
			PreparedStatement stmt=null;

			try {
				stmt = prepare(conn, m_selcmd, data);

				rs = stmt.executeQuery();

				return rs.next();
			} finally {
				if(rs != null) {
					rs.close();
					rs = null;
				}
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return check(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SYS_DEBT_CTRL_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SYS_DEBT_CTRL_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);
			boolean ret=true;

			try {
				if(rs.next()==false) return false;


				return ret;
			} finally {
				if (rs != null) {
					rs.close();
					rs = null;
				}
			}
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:SYS_DEBT_CTRL_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:SYS_DEBT_CTRL_clear

			return;
		}

		/**
		 * SYS_DEBT_CTRLクラスの標準コンストラクタ
		 */
		public SYS_DEBT_CTRL()
		{
			//{{user_implement_dev:SYS_DEBT_CTRL_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:SYS_DEBT_CTRL_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class SYS_INSTALL_OPTIONS extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  TO_CHAR(INSTALL_FLG) AS INSTALL_FLG "
+"FROM "
+"  SYS_INSTALL_OPTIONS "
+"WHERE "
+"  OPTION_ID = 'C*'";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SYS_INSTALL_OPTIONS_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:SYS_INSTALL_OPTIONS_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStr);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStrs);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SYS_INSTALL_OPTIONS_read
			if(m_selcmd==null) throw new FoundationException("SYS_INSTALL_OPTIONS", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SYS_INSTALL_OPTIONS_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SYS_INSTALL_OPTIONS_read2
			if(m_selcmd==null) throw new FoundationException("SYS_INSTALL_OPTIONS", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStr);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SYS_INSTALL_OPTIONS_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SYS_INSTALL_OPTIONS_read3
			if(m_selcmd==null) throw new FoundationException("SYS_INSTALL_OPTIONS", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStrs);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SYS_INSTALL_OPTIONS_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);

			try {
				List list=new ArrayList();

				while((data=next(rs))!=null) {
					list.add(data);
				}

				return list;
			} finally {
				rs.close();
				rs = null;
			}
		}

		/**
		 * クエリーのprepare処理
		 *
		 * @return PreparedStatementインスタンスを返します
		 * @param conn Native Connectionインスタンス
		 * @param query SQL文字列
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query, AE0060020Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {

				// 静的SQL文の生成
				stmt = conn.prepareStatement(query);

			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * データ読出し処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			int no=1;


			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0060020Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0060020Struct data = new AE0060020Struct();

			data.setINSTALL_FLG( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SYS_INSTALL_OPTIONS", "hasRecord", "クエリー未登録");

			ResultSet rs=null;
			PreparedStatement stmt=null;

			try {
				stmt = prepare(conn, m_selcmd, data);

				rs = stmt.executeQuery();

				return rs.next();
			} finally {
				if(rs != null) {
					rs.close();
					rs = null;
				}
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return check(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SYS_INSTALL_OPTIONS_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SYS_INSTALL_OPTIONS_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);
			boolean ret=true;

			try {
				if(rs.next()==false) return false;


				return ret;
			} finally {
				if (rs != null) {
					rs.close();
					rs = null;
				}
			}
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:SYS_INSTALL_OPTIONS_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:SYS_INSTALL_OPTIONS_clear

			return;
		}

		/**
		 * SYS_INSTALL_OPTIONSクラスの標準コンストラクタ
		 */
		public SYS_INSTALL_OPTIONS()
		{
			//{{user_implement_dev:SYS_INSTALL_OPTIONS_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:SYS_INSTALL_OPTIONS_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class M_CONS_UNIT_COST extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  TO_CHAR(A.ONEROUS_FLG) AS ONEROUS_FLG "
+"FROM "
+"  M_CONS_UNIT_COST A "
+"WHERE "
+"  A.COMPANY_CD = ? "
+"  AND A.VEND_CD = ? "
+"  AND A.ITEM_CD = ? "
+"  AND EFF_PHASE_IN_DATE = ( "
+"    SELECT "
+"      MAX(B.EFF_PHASE_IN_DATE) "
+"    FROM "
+"      M_CONS_UNIT_COST B "
+"    WHERE "
+"      B.COMPANY_CD = A.COMPANY_CD "
+"      AND B.VEND_CD = A.VEND_CD "
+"      AND B.ITEM_CD = A.ITEM_CD "
+"      AND B.EFF_PHASE_IN_DATE <= TO_DATE(?) "
+"  )";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:M_CONS_UNIT_COST_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:M_CONS_UNIT_COST_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStr);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStrs);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:M_CONS_UNIT_COST_read
			if(m_selcmd==null) throw new FoundationException("M_CONS_UNIT_COST", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:M_CONS_UNIT_COST_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:M_CONS_UNIT_COST_read2
			if(m_selcmd==null) throw new FoundationException("M_CONS_UNIT_COST", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStr);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:M_CONS_UNIT_COST_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:M_CONS_UNIT_COST_read3
			if(m_selcmd==null) throw new FoundationException("M_CONS_UNIT_COST", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStrs);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:M_CONS_UNIT_COST_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);

			try {
				List list=new ArrayList();

				while((data=next(rs))!=null) {
					list.add(data);
				}

				return list;
			} finally {
				rs.close();
				rs = null;
			}
		}

		/**
		 * クエリーのprepare処理
		 *
		 * @return PreparedStatementインスタンスを返します
		 * @param conn Native Connectionインスタンス
		 * @param query SQL文字列
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query, AE0060020Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getCOMPANY_CD());
				if(isNull(data.getCOMPANY_CD())) isNull = true;
				ary.addElement(data.getVEND_CD());
				if(isNull(data.getVEND_CD())) isNull = true;
				ary.addElement(data.getITEM_CD());
				if(isNull(data.getITEM_CD())) isNull = true;
				ary.addElement(data.getSUPPLIED_DATE());
				if(isNull(data.getSUPPLIED_DATE())) isNull = true;

				// 静的SQL文の生成
				stmt = conn.prepareStatement(query);

			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * データ読出し処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getCOMPANY_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getVEND_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getITEM_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getSUPPLIED_DATE(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0060020Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0060020Struct data = new AE0060020Struct();

			data.setONEROUS_FLG( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("M_CONS_UNIT_COST", "hasRecord", "クエリー未登録");

			ResultSet rs=null;
			PreparedStatement stmt=null;

			try {
				stmt = prepare(conn, m_selcmd, data);

				rs = stmt.executeQuery();

				return rs.next();
			} finally {
				if(rs != null) {
					rs.close();
					rs = null;
				}
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return check(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:M_CONS_UNIT_COST_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:M_CONS_UNIT_COST_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);
			boolean ret=true;

			try {
				if(rs.next()==false) return false;


				return ret;
			} finally {
				if (rs != null) {
					rs.close();
					rs = null;
				}
			}
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:M_CONS_UNIT_COST_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:M_CONS_UNIT_COST_clear

			return;
		}

		/**
		 * M_CONS_UNIT_COSTクラスの標準コンストラクタ
		 */
		public M_CONS_UNIT_COST()
		{
			//{{user_implement_dev:M_CONS_UNIT_COST_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:M_CONS_UNIT_COST_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class readT_PART_SUPPLIED_ISSUE2 extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  T_PART_SUPPLIED_ISSUE.\"SUPPLIED_ISSUE_QTY\" AS \"SUPPLIED_ISSUE_QTY\", "
+"  T_PART_SUPPLIED_ISSUE.\"TOTAL_ISSUE_QTY\" AS \"TOTAL_ISSUE_QTY\", "
+"  T_PART_SUPPLIED_ISSUE.\"SUPPLIED_UNIT_DENOMINATOR\" AS \"SUPPLIED_UNIT_DENOMINATOR\", "
+"  T_PART_SUPPLIED_ISSUE.\"SUPPLIED_UNIT_NUMERATOR\" AS \"SUPPLIED_UNIT_NUMERATOR\" "
+"FROM "
+"  T_PART_SUPPLIED_ISSUE "
+"WHERE "
+"  T_PART_SUPPLIED_ISSUE.\"PUCH_ODR_CD\" = ? "
+"  AND T_PART_SUPPLIED_ISSUE.\"ACPT_NO\" = ? "
+"  AND T_PART_SUPPLIED_ISSUE.\"ITEM_CD\" = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:readT_PART_SUPPLIED_ISSUE2_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:readT_PART_SUPPLIED_ISSUE2_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStr);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStrs);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:readT_PART_SUPPLIED_ISSUE2_read
			if(m_selcmd==null) throw new FoundationException("readT_PART_SUPPLIED_ISSUE2", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:readT_PART_SUPPLIED_ISSUE2_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:readT_PART_SUPPLIED_ISSUE2_read2
			if(m_selcmd==null) throw new FoundationException("readT_PART_SUPPLIED_ISSUE2", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStr);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:readT_PART_SUPPLIED_ISSUE2_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:readT_PART_SUPPLIED_ISSUE2_read3
			if(m_selcmd==null) throw new FoundationException("readT_PART_SUPPLIED_ISSUE2", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStrs);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:readT_PART_SUPPLIED_ISSUE2_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);

			try {
				List list=new ArrayList();

				while((data=next(rs))!=null) {
					list.add(data);
				}

				return list;
			} finally {
				rs.close();
				rs = null;
			}
		}

		/**
		 * クエリーのprepare処理
		 *
		 * @return PreparedStatementインスタンスを返します
		 * @param conn Native Connectionインスタンス
		 * @param query SQL文字列
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query, AE0060020Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getPUCH_ODR_CD());
				if(isNull(data.getPUCH_ODR_CD())) isNull = true;
				ary.addElement(data.getACPT_NO());
				if(isNull(data.getACPT_NO())) isNull = true;
				ary.addElement(data.getITEM_CD());
				if(isNull(data.getITEM_CD())) isNull = true;

				// 静的SQL文の生成
				stmt = conn.prepareStatement(query);

			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * データ読出し処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getPUCH_ODR_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getACPT_NO(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getITEM_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0060020Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0060020Struct data = new AE0060020Struct();

			data.setreadSUPPLIED_ISSUE_QTY( getString(1, rs) );
			data.setreadTOTAL_ISSUE_QTY( getString(2, rs) );
			data.setreadSUPPLIED_UNIT_DENOMINATOR( getString(3, rs) );
			data.setreadSUPPLIED_UNIT_NUMERATOR( getString(4, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("readT_PART_SUPPLIED_ISSUE2", "hasRecord", "クエリー未登録");

			ResultSet rs=null;
			PreparedStatement stmt=null;

			try {
				stmt = prepare(conn, m_selcmd, data);

				rs = stmt.executeQuery();

				return rs.next();
			} finally {
				if(rs != null) {
					rs.close();
					rs = null;
				}
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return check(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:readT_PART_SUPPLIED_ISSUE2_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:readT_PART_SUPPLIED_ISSUE2_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);
			boolean ret=true;

			try {
				if(rs.next()==false) return false;


				return ret;
			} finally {
				if (rs != null) {
					rs.close();
					rs = null;
				}
			}
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:readT_PART_SUPPLIED_ISSUE2_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:readT_PART_SUPPLIED_ISSUE2_clear

			return;
		}

		/**
		 * readT_PART_SUPPLIED_ISSUE2クラスの標準コンストラクタ
		 */
		public readT_PART_SUPPLIED_ISSUE2()
		{
			//{{user_implement_dev:readT_PART_SUPPLIED_ISSUE2_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:readT_PART_SUPPLIED_ISSUE2_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class updateT_PART_SUPPLIED_ISSUE2 extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = "UPDATE "
+"  T_PART_SUPPLIED_ISSUE "
+"SET "
+"  \"SUPPLIED_ISSUE_QTY\" = ?, "
+"  \"TOTAL_ISSUE_QTY\" = ?, "
+"  \"SUPPLIED_UNIT_DENOMINATOR\" = ?, "
+"  \"SUPPLIED_UNIT_NUMERATOR\" = ? "
+"WHERE "
+"  T_PART_SUPPLIED_ISSUE.\"PUCH_ODR_CD\" = ? "
+"  AND T_PART_SUPPLIED_ISSUE.\"ACPT_NO\" = ? "
+"  AND T_PART_SUPPLIED_ISSUE.\"ITEM_CD\" = ?";
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="AE0060020";
		protected String m_sUpdateProgramName="AE0060020";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:updateT_PART_SUPPLIED_ISSUE2_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:updateT_PART_SUPPLIED_ISSUE2_def

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return update(conn.getConn(), data);
		}

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt=null;
			int modifyCount;

			try {
				if("Oracle".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U(m_updcmd));
				} else if("Microsoft SQL Server".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U_MSSQL(m_updcmd));
				} else if("PostgreSQL".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U_PGSQL(m_updcmd));
				} else if("MySQL".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U_MYSQL(m_updcmd));
				} else {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U_DB2(m_updcmd));
				}

				setString(1, data.getsSysdate(), stmt);
				setString(2, data.getsUser_ID(), stmt);
				setString(3, m_sUpdateProgramName, stmt);
				setString(4, data.getsetSUPPLIED_ISSUE_QTY(), stmt);
				setString(5, data.getsetTOTAL_ISSUE_QTY(), stmt);
				setString(6, data.getsetSUPPLIED_UNIT_DENOMINATOR(), stmt);
				setString(7, data.getsetSUPPLIED_UNIT_NUMERATOR(), stmt);
				setString(8, data.getPUCH_ODR_CD(), stmt);
				setString(9, data.getACPT_NO(), stmt);
				setString(10, data.getITEM_CD(), stmt);

				return stmt.executeUpdate();
			} finally {
				if(stmt!=null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:updateT_PART_SUPPLIED_ISSUE2_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:updateT_PART_SUPPLIED_ISSUE2_clear

			return;
		}

		/**
		 * updateT_PART_SUPPLIED_ISSUE2クラスの標準コンストラクタ
		 */
		public updateT_PART_SUPPLIED_ISSUE2()
		{
			//{{user_implement_dev:updateT_PART_SUPPLIED_ISSUE2_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:updateT_PART_SUPPLIED_ISSUE2_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class updateT_RLSD_PUCH_ODR_INSPC_CMPLT extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = "UPDATE "
+"  T_RLSD_PUCH_ODR "
+"SET "
+"  \"INSPC_CMPLT_DATE\" = NULL, "
+"  \"INSPC_CMPLT_FLG\" = 0 "
+"WHERE "
+"  T_RLSD_PUCH_ODR.\"PUCH_ODR_CD\" = ?";
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="AE0060020";
		protected String m_sUpdateProgramName="AE0060020";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:updateT_RLSD_PUCH_ODR_INSPC_CMPLT_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:updateT_RLSD_PUCH_ODR_INSPC_CMPLT_def

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return update(conn.getConn(), data);
		}

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt=null;
			int modifyCount;

			try {
				if("Oracle".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U(m_updcmd));
				} else if("Microsoft SQL Server".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U_MSSQL(m_updcmd));
				} else if("PostgreSQL".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U_PGSQL(m_updcmd));
				} else if("MySQL".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U_MYSQL(m_updcmd));
				} else {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U_DB2(m_updcmd));
				}

				setString(1, data.getsSysdate(), stmt);
				setString(2, data.getsUser_ID(), stmt);
				setString(3, m_sUpdateProgramName, stmt);
				setString(4, data.getPUCH_ODR_CD(), stmt);

				return stmt.executeUpdate();
			} finally {
				if(stmt!=null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:updateT_RLSD_PUCH_ODR_INSPC_CMPLT_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:updateT_RLSD_PUCH_ODR_INSPC_CMPLT_clear

			return;
		}

		/**
		 * updateT_RLSD_PUCH_ODR_INSPC_CMPLTクラスの標準コンストラクタ
		 */
		public updateT_RLSD_PUCH_ODR_INSPC_CMPLT()
		{
			//{{user_implement_dev:updateT_RLSD_PUCH_ODR_INSPC_CMPLT_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:updateT_RLSD_PUCH_ODR_INSPC_CMPLT_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class SELECT_SYS_PARAMETER extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  VALUE "
+"FROM "
+"  SYS_PARAMETER "
+"WHERE "
+"  NAME = 'PAST_RESULT_ENTRY_TYP'";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SELECT_SYS_PARAMETER_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:SELECT_SYS_PARAMETER_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStr);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStrs);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SELECT_SYS_PARAMETER_read
			if(m_selcmd==null) throw new FoundationException("SELECT_SYS_PARAMETER", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SELECT_SYS_PARAMETER_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SELECT_SYS_PARAMETER_read2
			if(m_selcmd==null) throw new FoundationException("SELECT_SYS_PARAMETER", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStr);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SELECT_SYS_PARAMETER_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SELECT_SYS_PARAMETER_read3
			if(m_selcmd==null) throw new FoundationException("SELECT_SYS_PARAMETER", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStrs);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SELECT_SYS_PARAMETER_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);

			try {
				List list=new ArrayList();

				while((data=next(rs))!=null) {
					list.add(data);
				}

				return list;
			} finally {
				rs.close();
				rs = null;
			}
		}

		/**
		 * クエリーのprepare処理
		 *
		 * @return PreparedStatementインスタンスを返します
		 * @param conn Native Connectionインスタンス
		 * @param query SQL文字列
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query, AE0060020Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {

				// 静的SQL文の生成
				stmt = conn.prepareStatement(query);

			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * データ読出し処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			int no=1;


			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0060020Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0060020Struct data = new AE0060020Struct();

			data.setPAST_RESULT_ENTRY_TYP( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SELECT_SYS_PARAMETER", "hasRecord", "クエリー未登録");

			ResultSet rs=null;
			PreparedStatement stmt=null;

			try {
				stmt = prepare(conn, m_selcmd, data);

				rs = stmt.executeQuery();

				return rs.next();
			} finally {
				if(rs != null) {
					rs.close();
					rs = null;
				}
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return check(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SELECT_SYS_PARAMETER_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SELECT_SYS_PARAMETER_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);
			boolean ret=true;

			try {
				if(rs.next()==false) return false;


				return ret;
			} finally {
				if (rs != null) {
					rs.close();
					rs = null;
				}
			}
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:SELECT_SYS_PARAMETER_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:SELECT_SYS_PARAMETER_clear

			return;
		}

		/**
		 * SELECT_SYS_PARAMETERクラスの標準コンストラクタ
		 */
		public SELECT_SYS_PARAMETER()
		{
			//{{user_implement_dev:SELECT_SYS_PARAMETER_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:SELECT_SYS_PARAMETER_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class SELECT_SYS_ACTUAL_COST_CTRL_AC extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  PROC_EXEC_DATE "
+"FROM "
+"  SYS_ACTUAL_COST_CTRL_AC "
+"WHERE "
+"  PLANT_CD = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SELECT_SYS_ACTUAL_COST_CTRL_AC_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:SELECT_SYS_ACTUAL_COST_CTRL_AC_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStr);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStrs);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SELECT_SYS_ACTUAL_COST_CTRL_AC_read
			if(m_selcmd==null) throw new FoundationException("SELECT_SYS_ACTUAL_COST_CTRL_AC", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SELECT_SYS_ACTUAL_COST_CTRL_AC_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SELECT_SYS_ACTUAL_COST_CTRL_AC_read2
			if(m_selcmd==null) throw new FoundationException("SELECT_SYS_ACTUAL_COST_CTRL_AC", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStr);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SELECT_SYS_ACTUAL_COST_CTRL_AC_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SELECT_SYS_ACTUAL_COST_CTRL_AC_read3
			if(m_selcmd==null) throw new FoundationException("SELECT_SYS_ACTUAL_COST_CTRL_AC", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStrs);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SELECT_SYS_ACTUAL_COST_CTRL_AC_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);

			try {
				List list=new ArrayList();

				while((data=next(rs))!=null) {
					list.add(data);
				}

				return list;
			} finally {
				rs.close();
				rs = null;
			}
		}

		/**
		 * クエリーのprepare処理
		 *
		 * @return PreparedStatementインスタンスを返します
		 * @param conn Native Connectionインスタンス
		 * @param query SQL文字列
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query, AE0060020Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getPLANT_CD());
				if(isNull(data.getPLANT_CD())) isNull = true;

				// 静的SQL文の生成
				stmt = conn.prepareStatement(query);

			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * データ読出し処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getPLANT_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0060020Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0060020Struct data = new AE0060020Struct();

			data.setPROC_EXEC_DATE( getBigDecimal(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SELECT_SYS_ACTUAL_COST_CTRL_AC", "hasRecord", "クエリー未登録");

			ResultSet rs=null;
			PreparedStatement stmt=null;

			try {
				stmt = prepare(conn, m_selcmd, data);

				rs = stmt.executeQuery();

				return rs.next();
			} finally {
				if(rs != null) {
					rs.close();
					rs = null;
				}
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return check(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SELECT_SYS_ACTUAL_COST_CTRL_AC_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SELECT_SYS_ACTUAL_COST_CTRL_AC_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);
			boolean ret=true;

			try {
				if(rs.next()==false) return false;


				return ret;
			} finally {
				if (rs != null) {
					rs.close();
					rs = null;
				}
			}
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:SELECT_SYS_ACTUAL_COST_CTRL_AC_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:SELECT_SYS_ACTUAL_COST_CTRL_AC_clear

			return;
		}

		/**
		 * SELECT_SYS_ACTUAL_COST_CTRL_ACクラスの標準コンストラクタ
		 */
		public SELECT_SYS_ACTUAL_COST_CTRL_AC()
		{
			//{{user_implement_dev:SELECT_SYS_ACTUAL_COST_CTRL_AC_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:SELECT_SYS_ACTUAL_COST_CTRL_AC_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class checkWORK_ODR_CD extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = "SELECT "
+"  T_RLSD_PUCH_ODR.PUCH_ODR_CD "
+"FROM "
+"  T_RLSD_PUCH_ODR "
+"WHERE "
+"  T_RLSD_PUCH_ODR.WORK_ODR_CD IS NULL "
+"  AND T_RLSD_PUCH_ODR.PUCH_ODR_CD = ?";
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:checkWORK_ODR_CD_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:checkWORK_ODR_CD_def

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return check(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:checkWORK_ODR_CD_check
			PreparedStatement stmt = prepare(conn, m_chkcmd, data);

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:checkWORK_ODR_CD_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);
			boolean ret=true;

			try {
				if(rs.next()==false) return false;


				return ret;
			} finally {
				if (rs != null) {
					rs.close();
					rs = null;
				}
			}
		}

		/**
		 * クエリーのprepare処理
		 *
		 * @return PreparedStatementインスタンスを返します
		 * @param conn Native Connectionインスタンス
		 * @param query SQL文字列
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query, AE0060020Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getPUCH_ODR_CD());
				if(isNull(data.getPUCH_ODR_CD())) isNull = true;

				// 静的SQL文の生成
				stmt = conn.prepareStatement(query);

			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * データ読出し処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getPUCH_ODR_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:checkWORK_ODR_CD_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:checkWORK_ODR_CD_clear

			return;
		}

		/**
		 * checkWORK_ODR_CDクラスの標準コンストラクタ
		 */
		public checkWORK_ODR_CD()
		{
			//{{user_implement_dev:checkWORK_ODR_CD_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:checkWORK_ODR_CD_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class checkFINAL_PROC_FLG extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = "SELECT "
+"  T_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD "
+"FROM "
+"  T_RLSD_PUCH_ODR, "
+"  T_WORK_IN_PROC_BY_PROC "
+"WHERE "
+"  T_WORK_IN_PROC_BY_PROC.FINAL_PROC_FLG = 1 "
+"  AND T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD = T_RLSD_PUCH_ODR.WORK_ODR_CD "
+"  AND T_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD = T_RLSD_PUCH_ODR.WORK_IN_PROC_CD "
+"  AND T_RLSD_PUCH_ODR.PUCH_ODR_CD = ?";
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:checkFINAL_PROC_FLG_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:checkFINAL_PROC_FLG_def

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return check(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:checkFINAL_PROC_FLG_check
			PreparedStatement stmt = prepare(conn, m_chkcmd, data);

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:checkFINAL_PROC_FLG_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);
			boolean ret=true;

			try {
				if(rs.next()==false) return false;


				return ret;
			} finally {
				if (rs != null) {
					rs.close();
					rs = null;
				}
			}
		}

		/**
		 * クエリーのprepare処理
		 *
		 * @return PreparedStatementインスタンスを返します
		 * @param conn Native Connectionインスタンス
		 * @param query SQL文字列
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query, AE0060020Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getPUCH_ODR_CD());
				if(isNull(data.getPUCH_ODR_CD())) isNull = true;

				// 静的SQL文の生成
				stmt = conn.prepareStatement(query);

			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * データ読出し処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getPUCH_ODR_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:checkFINAL_PROC_FLG_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:checkFINAL_PROC_FLG_clear

			return;
		}

		/**
		 * checkFINAL_PROC_FLGクラスの標準コンストラクタ
		 */
		public checkFINAL_PROC_FLG()
		{
			//{{user_implement_dev:checkFINAL_PROC_FLG_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:checkFINAL_PROC_FLG_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class checkLOT_NO extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = "SELECT "
+"  T_LOT_CTRL.LOT_NO "
+"FROM "
+"  T_LOT_CTRL, "
+"  T_RLSD_PUCH_ODR "
+"WHERE "
+"  T_LOT_CTRL.LOT_NO = ? "
+"  AND T_RLSD_PUCH_ODR.PUCH_ODR_CD = ? "
+"  AND T_RLSD_PUCH_ODR.ITEM_CD = T_LOT_CTRL.ITEM_CD";
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:checkLOT_NO_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:checkLOT_NO_def

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return check(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:checkLOT_NO_check
			PreparedStatement stmt = prepare(conn, m_chkcmd, data);

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:checkLOT_NO_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);
			boolean ret=true;

			try {
				if(rs.next()==false) return false;


				return ret;
			} finally {
				if (rs != null) {
					rs.close();
					rs = null;
				}
			}
		}

		/**
		 * クエリーのprepare処理
		 *
		 * @return PreparedStatementインスタンスを返します
		 * @param conn Native Connectionインスタンス
		 * @param query SQL文字列
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query, AE0060020Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getLOT_NO());
				if(isNull(data.getLOT_NO())) isNull = true;
				ary.addElement(data.getPUCH_ODR_CD());
				if(isNull(data.getPUCH_ODR_CD())) isNull = true;

				// 静的SQL文の生成
				stmt = conn.prepareStatement(query);

			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * データ読出し処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getLOT_NO(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getPUCH_ODR_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:checkLOT_NO_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:checkLOT_NO_clear

			return;
		}

		/**
		 * checkLOT_NOクラスの標準コンストラクタ
		 */
		public checkLOT_NO()
		{
			//{{user_implement_dev:checkLOT_NO_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:checkLOT_NO_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class checkLOT_CTRL_FLG extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = "SELECT "
+"  M_ITEM.ITEM_CD "
+"FROM "
+"  M_ITEM, "
+"  T_RLSD_PUCH_ODR "
+"WHERE "
+"  M_ITEM.ITEM_CD = T_RLSD_PUCH_ODR.ITEM_CD "
+"  AND M_ITEM.LOT_CTRL_FLG = 1 "
+"  AND T_RLSD_PUCH_ODR.PUCH_ODR_CD = ?";
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:checkLOT_CTRL_FLG_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:checkLOT_CTRL_FLG_def

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return check(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:checkLOT_CTRL_FLG_check
			PreparedStatement stmt = prepare(conn, m_chkcmd, data);

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:checkLOT_CTRL_FLG_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);
			boolean ret=true;

			try {
				if(rs.next()==false) return false;


				return ret;
			} finally {
				if (rs != null) {
					rs.close();
					rs = null;
				}
			}
		}

		/**
		 * クエリーのprepare処理
		 *
		 * @return PreparedStatementインスタンスを返します
		 * @param conn Native Connectionインスタンス
		 * @param query SQL文字列
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query, AE0060020Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getPUCH_ODR_CD());
				if(isNull(data.getPUCH_ODR_CD())) isNull = true;

				// 静的SQL文の生成
				stmt = conn.prepareStatement(query);

			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * データ読出し処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getPUCH_ODR_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:checkLOT_CTRL_FLG_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:checkLOT_CTRL_FLG_clear

			return;
		}

		/**
		 * checkLOT_CTRL_FLGクラスの標準コンストラクタ
		 */
		public checkLOT_CTRL_FLG()
		{
			//{{user_implement_dev:checkLOT_CTRL_FLG_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:checkLOT_CTRL_FLG_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class updateT_LOT_CTRL extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = "UPDATE "
+"  T_LOT_CTRL "
+"SET "
+"  DEL_FLG = 0 "
+"WHERE "
+"  LOT_NO = ? "
+"  AND ITEM_CD = ( "
+"    SELECT "
+"      ITEM_CD "
+"    FROM "
+"      T_RLSD_PUCH_ODR "
+"    WHERE "
+"      T_RLSD_PUCH_ODR.PUCH_ODR_CD = ? "
+"  ) "
+"  AND DEL_FLG = 1";
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="AE0060020";
		protected String m_sUpdateProgramName="AE0060020";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:updateT_LOT_CTRL_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:updateT_LOT_CTRL_def

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return update(conn.getConn(), data);
		}

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt=null;
			int modifyCount;

			try {
				if("Oracle".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U(m_updcmd));
				} else if("Microsoft SQL Server".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U_MSSQL(m_updcmd));
				} else if("PostgreSQL".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U_PGSQL(m_updcmd));
				} else if("MySQL".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U_MYSQL(m_updcmd));
				} else {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U_DB2(m_updcmd));
				}

				setString(1, data.getsSysdate(), stmt);
				setString(2, data.getsUser_ID(), stmt);
				setString(3, m_sUpdateProgramName, stmt);
				setString(4, data.getLOT_NO(), stmt);
				setString(5, data.getPUCH_ODR_CD(), stmt);

				return stmt.executeUpdate();
			} finally {
				if(stmt!=null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:updateT_LOT_CTRL_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:updateT_LOT_CTRL_clear

			return;
		}

		/**
		 * updateT_LOT_CTRLクラスの標準コンストラクタ
		 */
		public updateT_LOT_CTRL()
		{
			//{{user_implement_dev:updateT_LOT_CTRL_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:updateT_LOT_CTRL_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class checkT_LOT_ISSUE_INST extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = "SELECT "
+"  T_LOT_ISSUE_INST.ISSUE_INST_CD "
+"FROM "
+"  T_ISSUE_INST, "
+"  T_LOT_ISSUE_INST, "
+"  T_PART_SUPPLIED_ISSUE, "
+"  T_LOT_CTRL "
+"WHERE "
+"  T_PART_SUPPLIED_ISSUE.PUCH_ODR_CD = ? "
+"  AND T_PART_SUPPLIED_ISSUE.ITEM_CD = ? "
+"  AND T_PART_SUPPLIED_ISSUE.ACPT_NO = TO_NUMBER(?) "
+"  AND T_LOT_ISSUE_INST.PUCH_ODR_CD = T_PART_SUPPLIED_ISSUE.PUCH_ODR_CD "
+"  AND T_LOT_ISSUE_INST.ITEM_CD = T_PART_SUPPLIED_ISSUE.ITEM_CD "
+"  AND T_ISSUE_INST.ISSUE_INST_CD = T_PART_SUPPLIED_ISSUE.ISSUE_INST_CD "
+"  AND T_ISSUE_INST.ISSUE_INST_CD = T_LOT_ISSUE_INST.ISSUE_INST_CD "
+"  AND T_LOT_ISSUE_INST.LOT_NO = T_LOT_CTRL.LOT_NO "
+"  AND T_LOT_ISSUE_INST.ITEM_CD = T_LOT_CTRL.ITEM_CD";
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:checkT_LOT_ISSUE_INST_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:checkT_LOT_ISSUE_INST_def

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return check(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:checkT_LOT_ISSUE_INST_check
			PreparedStatement stmt = prepare(conn, m_chkcmd, data);

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:checkT_LOT_ISSUE_INST_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);
			boolean ret=true;

			try {
				if(rs.next()==false) return false;


				return ret;
			} finally {
				if (rs != null) {
					rs.close();
					rs = null;
				}
			}
		}

		/**
		 * クエリーのprepare処理
		 *
		 * @return PreparedStatementインスタンスを返します
		 * @param conn Native Connectionインスタンス
		 * @param query SQL文字列
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query, AE0060020Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getPUCH_ODR_CD());
				if(isNull(data.getPUCH_ODR_CD())) isNull = true;
				ary.addElement(data.getITEM_CD());
				if(isNull(data.getITEM_CD())) isNull = true;
				ary.addElement(data.getACPT_NO());
				if(isNull(data.getACPT_NO())) isNull = true;

				// 静的SQL文の生成
				stmt = conn.prepareStatement(query);

			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * データ読出し処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getPUCH_ODR_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getITEM_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getACPT_NO(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:checkT_LOT_ISSUE_INST_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:checkT_LOT_ISSUE_INST_clear

			return;
		}

		/**
		 * checkT_LOT_ISSUE_INSTクラスの標準コンストラクタ
		 */
		public checkT_LOT_ISSUE_INST()
		{
			//{{user_implement_dev:checkT_LOT_ISSUE_INST_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:checkT_LOT_ISSUE_INST_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class SelectSTOCK_ON_HAND_QTY extends DataObject
	{
		protected String m_selcmd = "select "
+"  to_char(nvl(T_LOT_STOCK.STOCK_ON_HAND_QTY, 0)) "
+"from "
+"  T_LOT_STOCK "
+"where "
+"  T_LOT_STOCK.ITEM_CD = ? "
+"  and T_LOT_STOCK.WH_CD = ? "
+"  and T_LOT_STOCK.LOT_NO = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SelectSTOCK_ON_HAND_QTY_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:SelectSTOCK_ON_HAND_QTY_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStr);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStrs);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectSTOCK_ON_HAND_QTY_read
			if(m_selcmd==null) throw new FoundationException("SelectSTOCK_ON_HAND_QTY", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectSTOCK_ON_HAND_QTY_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectSTOCK_ON_HAND_QTY_read2
			if(m_selcmd==null) throw new FoundationException("SelectSTOCK_ON_HAND_QTY", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStr);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectSTOCK_ON_HAND_QTY_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectSTOCK_ON_HAND_QTY_read3
			if(m_selcmd==null) throw new FoundationException("SelectSTOCK_ON_HAND_QTY", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStrs);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectSTOCK_ON_HAND_QTY_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);

			try {
				List list=new ArrayList();

				while((data=next(rs))!=null) {
					list.add(data);
				}

				return list;
			} finally {
				rs.close();
				rs = null;
			}
		}

		/**
		 * クエリーのprepare処理
		 *
		 * @return PreparedStatementインスタンスを返します
		 * @param conn Native Connectionインスタンス
		 * @param query SQL文字列
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query, AE0060020Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getsetITEM_CD());
				if(isNull(data.getsetITEM_CD())) isNull = true;
				ary.addElement(data.getsetWH_CD());
				if(isNull(data.getsetWH_CD())) isNull = true;
				ary.addElement(data.getsetLOT_NO());
				if(isNull(data.getsetLOT_NO())) isNull = true;

				// 静的SQL文の生成
				stmt = conn.prepareStatement(query);

			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * データ読出し処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getsetITEM_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getsetWH_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getsetLOT_NO(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0060020Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0060020Struct data = new AE0060020Struct();

			data.setreadSTOCK_ON_HAND_QTY( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SelectSTOCK_ON_HAND_QTY", "hasRecord", "クエリー未登録");

			ResultSet rs=null;
			PreparedStatement stmt=null;

			try {
				stmt = prepare(conn, m_selcmd, data);

				rs = stmt.executeQuery();

				return rs.next();
			} finally {
				if(rs != null) {
					rs.close();
					rs = null;
				}
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return check(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectSTOCK_ON_HAND_QTY_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectSTOCK_ON_HAND_QTY_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);
			boolean ret=true;

			try {
				if(rs.next()==false) return false;


				return ret;
			} finally {
				if (rs != null) {
					rs.close();
					rs = null;
				}
			}
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:SelectSTOCK_ON_HAND_QTY_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:SelectSTOCK_ON_HAND_QTY_clear

			return;
		}

		/**
		 * SelectSTOCK_ON_HAND_QTYクラスの標準コンストラクタ
		 */
		public SelectSTOCK_ON_HAND_QTY()
		{
			//{{user_implement_dev:SelectSTOCK_ON_HAND_QTY_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:SelectSTOCK_ON_HAND_QTY_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class SelectT_PART_SUPPLIED_ISSUE extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  ISSUE_INST_CD, "
+"  VEND_CD, "
+"  PLANT_CD, "
+"  TO_CHAR(SUPPLIED_DATE, 'YYYY/MM/DD') "
+"FROM "
+"  T_PART_SUPPLIED_ISSUE "
+"WHERE "
+"  T_PART_SUPPLIED_ISSUE.PUCH_ODR_CD = ? "
+"  AND T_PART_SUPPLIED_ISSUE.ACPT_NO = TO_NUMBER(?) "
+"  AND T_PART_SUPPLIED_ISSUE.ITEM_CD = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SelectT_PART_SUPPLIED_ISSUE_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:SelectT_PART_SUPPLIED_ISSUE_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStr);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStrs);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectT_PART_SUPPLIED_ISSUE_read
			if(m_selcmd==null) throw new FoundationException("SelectT_PART_SUPPLIED_ISSUE", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectT_PART_SUPPLIED_ISSUE_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectT_PART_SUPPLIED_ISSUE_read2
			if(m_selcmd==null) throw new FoundationException("SelectT_PART_SUPPLIED_ISSUE", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStr);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectT_PART_SUPPLIED_ISSUE_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectT_PART_SUPPLIED_ISSUE_read3
			if(m_selcmd==null) throw new FoundationException("SelectT_PART_SUPPLIED_ISSUE", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStrs);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectT_PART_SUPPLIED_ISSUE_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);

			try {
				List list=new ArrayList();

				while((data=next(rs))!=null) {
					list.add(data);
				}

				return list;
			} finally {
				rs.close();
				rs = null;
			}
		}

		/**
		 * クエリーのprepare処理
		 *
		 * @return PreparedStatementインスタンスを返します
		 * @param conn Native Connectionインスタンス
		 * @param query SQL文字列
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query, AE0060020Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getPUCH_ODR_CD());
				if(isNull(data.getPUCH_ODR_CD())) isNull = true;
				ary.addElement(data.getACPT_NO());
				if(isNull(data.getACPT_NO())) isNull = true;
				ary.addElement(data.getITEM_CD());
				if(isNull(data.getITEM_CD())) isNull = true;

				// 静的SQL文の生成
				stmt = conn.prepareStatement(query);

			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * データ読出し処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getPUCH_ODR_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getACPT_NO(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getITEM_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0060020Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0060020Struct data = new AE0060020Struct();

			data.setreadISSUE_INST_CD( getString(1, rs) );
			data.setreadVEND_CD( getString(2, rs) );
			data.setreadPLANT_CD( getString(3, rs) );
			data.setreadSUPPLIED_DATE( getString(4, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SelectT_PART_SUPPLIED_ISSUE", "hasRecord", "クエリー未登録");

			ResultSet rs=null;
			PreparedStatement stmt=null;

			try {
				stmt = prepare(conn, m_selcmd, data);

				rs = stmt.executeQuery();

				return rs.next();
			} finally {
				if(rs != null) {
					rs.close();
					rs = null;
				}
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return check(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectT_PART_SUPPLIED_ISSUE_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectT_PART_SUPPLIED_ISSUE_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);
			boolean ret=true;

			try {
				if(rs.next()==false) return false;


				return ret;
			} finally {
				if (rs != null) {
					rs.close();
					rs = null;
				}
			}
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:SelectT_PART_SUPPLIED_ISSUE_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:SelectT_PART_SUPPLIED_ISSUE_clear

			return;
		}

		/**
		 * SelectT_PART_SUPPLIED_ISSUEクラスの標準コンストラクタ
		 */
		public SelectT_PART_SUPPLIED_ISSUE()
		{
			//{{user_implement_dev:SelectT_PART_SUPPLIED_ISSUE_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:SelectT_PART_SUPPLIED_ISSUE_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class SelectQty extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  T_LOT_ISSUE_INST.LOT_NO, "
+"  TO_CHAR(NVL(T_LOT_ISSUE_INST.ISSUE_QTY, 0) - NVL(T_LOT_ISSUE_INST.SPENT_QTY, 0)), "
+"  TO_CHAR(T_PART_SUPPLIED_ISSUE.SUPPLIED_ISSUE_QTY), "
+"  T_LOT_CTRL.BEST_BEFORE_DATE "
+"FROM "
+"  T_LOT_ISSUE_INST, "
+"  T_PART_SUPPLIED_ISSUE, "
+"  T_LOT_CTRL "
+"WHERE "
+"  T_PART_SUPPLIED_ISSUE.ACPT_NO = TO_NUMBER(?) "
+"  AND T_PART_SUPPLIED_ISSUE.PUCH_ODR_CD = ? "
+"  AND T_PART_SUPPLIED_ISSUE.ITEM_CD = ? "
+"  AND T_PART_SUPPLIED_ISSUE.ISSUE_INST_CD = ? "
+"  AND T_LOT_ISSUE_INST.ISSUE_INST_CD = T_PART_SUPPLIED_ISSUE.ISSUE_INST_CD "
+"  AND T_LOT_ISSUE_INST.PUCH_ODR_CD = T_PART_SUPPLIED_ISSUE.PUCH_ODR_CD "
+"  AND T_LOT_ISSUE_INST.ITEM_CD = T_PART_SUPPLIED_ISSUE.ITEM_CD "
+"  AND T_LOT_ISSUE_INST.ITEM_CD = T_LOT_CTRL.ITEM_CD "
+"  AND T_LOT_ISSUE_INST.LOT_NO = T_LOT_CTRL.LOT_NO "
+"ORDER BY "
+"  T_LOT_CTRL.BEST_BEFORE_DATE, "
+"  T_LOT_ISSUE_INST.LOT_NO";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SelectQty_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:SelectQty_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStr);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStrs);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectQty_read
			if(m_selcmd==null) throw new FoundationException("SelectQty", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectQty_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectQty_read2
			if(m_selcmd==null) throw new FoundationException("SelectQty", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStr);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectQty_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectQty_read3
			if(m_selcmd==null) throw new FoundationException("SelectQty", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStrs);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectQty_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);

			try {
				List list=new ArrayList();

				while((data=next(rs))!=null) {
					list.add(data);
				}

				return list;
			} finally {
				rs.close();
				rs = null;
			}
		}

		/**
		 * クエリーのprepare処理
		 *
		 * @return PreparedStatementインスタンスを返します
		 * @param conn Native Connectionインスタンス
		 * @param query SQL文字列
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query, AE0060020Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getACPT_NO());
				if(isNull(data.getACPT_NO())) isNull = true;
				ary.addElement(data.getPUCH_ODR_CD());
				if(isNull(data.getPUCH_ODR_CD())) isNull = true;
				ary.addElement(data.getITEM_CD());
				if(isNull(data.getITEM_CD())) isNull = true;
				ary.addElement(data.getISSUE_INST_CD());
				if(isNull(data.getISSUE_INST_CD())) isNull = true;

				// 静的SQL文の生成
				stmt = conn.prepareStatement(query);

			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * データ読出し処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getACPT_NO(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getPUCH_ODR_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getITEM_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getISSUE_INST_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0060020Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0060020Struct data = new AE0060020Struct();

			data.setreadLOT_NO( getString(1, rs) );
			data.setreadQTY( getString(2, rs) );
			data.setreadSUPPLIED_ISSUE_QTY( getString(3, rs) );
			data.setBEST_BEFORE_DATE( getString(4, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SelectQty", "hasRecord", "クエリー未登録");

			ResultSet rs=null;
			PreparedStatement stmt=null;

			try {
				stmt = prepare(conn, m_selcmd, data);

				rs = stmt.executeQuery();

				return rs.next();
			} finally {
				if(rs != null) {
					rs.close();
					rs = null;
				}
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return check(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectQty_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectQty_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);
			boolean ret=true;

			try {
				if(rs.next()==false) return false;


				return ret;
			} finally {
				if (rs != null) {
					rs.close();
					rs = null;
				}
			}
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:SelectQty_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:SelectQty_clear

			return;
		}

		/**
		 * SelectQtyクラスの標準コンストラクタ
		 */
		public SelectQty()
		{
			//{{user_implement_dev:SelectQty_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:SelectQty_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class SelectWH_CD extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  MIN(M_WH.WH_CD) "
+"FROM "
+"  M_WH, "
+"  T_PART_SUPPLIED_ISSUE "
+"WHERE "
+"  T_PART_SUPPLIED_ISSUE.VEND_CD = ? "
+"  AND T_PART_SUPPLIED_ISSUE.PLANT_CD = ? "
+"  AND T_PART_SUPPLIED_ISSUE.VEND_CD = M_WH.VEND_CD "
+"  AND T_PART_SUPPLIED_ISSUE.PLANT_CD = M_WH.PLANT_CD";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SelectWH_CD_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:SelectWH_CD_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStr);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStrs);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectWH_CD_read
			if(m_selcmd==null) throw new FoundationException("SelectWH_CD", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectWH_CD_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectWH_CD_read2
			if(m_selcmd==null) throw new FoundationException("SelectWH_CD", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStr);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectWH_CD_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectWH_CD_read3
			if(m_selcmd==null) throw new FoundationException("SelectWH_CD", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStrs);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectWH_CD_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);

			try {
				List list=new ArrayList();

				while((data=next(rs))!=null) {
					list.add(data);
				}

				return list;
			} finally {
				rs.close();
				rs = null;
			}
		}

		/**
		 * クエリーのprepare処理
		 *
		 * @return PreparedStatementインスタンスを返します
		 * @param conn Native Connectionインスタンス
		 * @param query SQL文字列
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query, AE0060020Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getVEND_CD());
				if(isNull(data.getVEND_CD())) isNull = true;
				ary.addElement(data.getPLANT_CD());
				if(isNull(data.getPLANT_CD())) isNull = true;

				// 静的SQL文の生成
				stmt = conn.prepareStatement(query);

			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * データ読出し処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getVEND_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getPLANT_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0060020Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0060020Struct data = new AE0060020Struct();

			data.setreadWH_CD( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SelectWH_CD", "hasRecord", "クエリー未登録");

			ResultSet rs=null;
			PreparedStatement stmt=null;

			try {
				stmt = prepare(conn, m_selcmd, data);

				rs = stmt.executeQuery();

				return rs.next();
			} finally {
				if(rs != null) {
					rs.close();
					rs = null;
				}
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return check(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectWH_CD_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectWH_CD_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);
			boolean ret=true;

			try {
				if(rs.next()==false) return false;


				return ret;
			} finally {
				if (rs != null) {
					rs.close();
					rs = null;
				}
			}
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:SelectWH_CD_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:SelectWH_CD_clear

			return;
		}

		/**
		 * SelectWH_CDクラスの標準コンストラクタ
		 */
		public SelectWH_CD()
		{
			//{{user_implement_dev:SelectWH_CD_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:SelectWH_CD_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class SelectSEQ_JF_RSLT extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  TO_CHAR(SEQ_JF_RSLT.NEXTVAL, 'fm0000000000') "
+"FROM "
+"  dual";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SelectSEQ_JF_RSLT_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:SelectSEQ_JF_RSLT_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStr);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStrs);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectSEQ_JF_RSLT_read
			if(m_selcmd==null) throw new FoundationException("SelectSEQ_JF_RSLT", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectSEQ_JF_RSLT_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectSEQ_JF_RSLT_read2
			if(m_selcmd==null) throw new FoundationException("SelectSEQ_JF_RSLT", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStr);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectSEQ_JF_RSLT_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectSEQ_JF_RSLT_read3
			if(m_selcmd==null) throw new FoundationException("SelectSEQ_JF_RSLT", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStrs);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectSEQ_JF_RSLT_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);

			try {
				List list=new ArrayList();

				while((data=next(rs))!=null) {
					list.add(data);
				}

				return list;
			} finally {
				rs.close();
				rs = null;
			}
		}

		/**
		 * クエリーのprepare処理
		 *
		 * @return PreparedStatementインスタンスを返します
		 * @param conn Native Connectionインスタンス
		 * @param query SQL文字列
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query, AE0060020Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {

				// 静的SQL文の生成
				stmt = conn.prepareStatement(query);

			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * データ読出し処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			int no=1;


			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0060020Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0060020Struct data = new AE0060020Struct();

			data.setNEXTVAL( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SelectSEQ_JF_RSLT", "hasRecord", "クエリー未登録");

			ResultSet rs=null;
			PreparedStatement stmt=null;

			try {
				stmt = prepare(conn, m_selcmd, data);

				rs = stmt.executeQuery();

				return rs.next();
			} finally {
				if(rs != null) {
					rs.close();
					rs = null;
				}
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return check(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectSEQ_JF_RSLT_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectSEQ_JF_RSLT_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);
			boolean ret=true;

			try {
				if(rs.next()==false) return false;


				return ret;
			} finally {
				if (rs != null) {
					rs.close();
					rs = null;
				}
			}
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:SelectSEQ_JF_RSLT_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:SelectSEQ_JF_RSLT_clear

			return;
		}

		/**
		 * SelectSEQ_JF_RSLTクラスの標準コンストラクタ
		 */
		public SelectSEQ_JF_RSLT()
		{
			//{{user_implement_dev:SelectSEQ_JF_RSLT_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:SelectSEQ_JF_RSLT_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class insertT_LOT_USE_RSLT extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = "INSERT INTO "
+"  T_LOT_USE_RSLT(RSLT_CTL_SEQ_NO, ISSUE_INST_CD, LOT_NO, PUCH_ODR_CD, ACPT_NO, ITEM_CD, WH_CD, TOTAL_ISSUE_QTY, SUPPLIED_ISSUE_QTY, SUPPLIED_DATE, PART_SUPPLIED_COMMENT) "
+"VALUES "
+"  (TO_NUMBER(?), ?, ?, ?, TO_NUMBER(?), ?, ?, TO_NUMBER(?), TO_NUMBER(?), TO_DATE(?, 'YYYY/MM/DD'), ?)";
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="AE0060020";
		protected String m_sUpdateProgramName="AE0060020";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:insertT_LOT_USE_RSLT_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:insertT_LOT_USE_RSLT_def

		/**
		 * レコード新規追加処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int create(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return create(conn.getConn(), data);
		}

		/**
		 * レコード新規追加処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int create(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt=null;

			try {
				if("Oracle".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_I(m_inscmd));
				} else if("Microsoft SQL Server".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_I_MSSQL(m_inscmd));
				} else if("PostgreSQL".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_I_PGSQL(m_inscmd));
				} else if("MySQL".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_I_MYSQL(m_inscmd));
				} else {
					stmt = conn.prepareStatement(objMessage.replaceSQL_I_DB2(m_inscmd));
				}

				setString(1, data.getsSysdate(), stmt);
				setString(2, data.getsUser_ID(), stmt);
				setString(3, m_sCreateProgramName, stmt);
				setString(4, data.getsSysdate(), stmt);
				setString(5, data.getsUser_ID(), stmt);
				setString(6, m_sCreateProgramName, stmt);
				setString(7, data.getsetSEQ_NO(), stmt);
				setString(8, data.getsetISSUE_INST_CD(), stmt);
				setString(9, data.getsetLOT_NO(), stmt);
				setString(10, data.getsetPUCH_ODR_CD(), stmt);
				setString(11, data.getsetACPT_NO(), stmt);
				setString(12, data.getsetITEM_CD(), stmt);
				setString(13, data.getsetWH_CD(), stmt);
				setString(14, data.getsetTOTAL_ISSUE_QTY(), stmt);
				setString(15, data.getsetSUPPLIED_ISSUE_QTY(), stmt);
				setString(16, data.getsetSUPPLIED_DATE(), stmt);
				setString(17, data.getsetPART_SUPPLIED_COMMENT(), stmt);

				return stmt.executeUpdate();
			} finally {
				if(stmt!=null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:insertT_LOT_USE_RSLT_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:insertT_LOT_USE_RSLT_clear

			return;
		}

		/**
		 * insertT_LOT_USE_RSLTクラスの標準コンストラクタ
		 */
		public insertT_LOT_USE_RSLT()
		{
			//{{user_implement_dev:insertT_LOT_USE_RSLT_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:insertT_LOT_USE_RSLT_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class updateT_LOT_USE_RSLT extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = "update "
+"  T_LOT_USE_RSLT "
+"set "
+"  T_LOT_USE_RSLT.SUPPLIED_DATE = to_date(?, 'YYYY/MM/DD'), "
+"  T_LOT_USE_RSLT.PART_SUPPLIED_COMMENT = ? "
+"where "
+"  T_LOT_USE_RSLT.PUCH_ODR_CD = ? "
+"  and T_LOT_USE_RSLT.ACPT_NO = to_number(?) "
+"  and T_LOT_USE_RSLT.ITEM_CD = ? "
+"  and T_LOT_USE_RSLT.LOT_NO = ?";
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="AE0060020";
		protected String m_sUpdateProgramName="AE0060020";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:updateT_LOT_USE_RSLT_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:updateT_LOT_USE_RSLT_def

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return update(conn.getConn(), data);
		}

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt=null;
			int modifyCount;

			try {
				if("Oracle".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U(m_updcmd));
				} else if("Microsoft SQL Server".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U_MSSQL(m_updcmd));
				} else if("PostgreSQL".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U_PGSQL(m_updcmd));
				} else if("MySQL".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U_MYSQL(m_updcmd));
				} else {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U_DB2(m_updcmd));
				}

				setString(1, data.getsSysdate(), stmt);
				setString(2, data.getsUser_ID(), stmt);
				setString(3, m_sUpdateProgramName, stmt);
				setString(4, data.getsetSUPPLIED_DATE(), stmt);
				setString(5, data.getsetPART_SUPPLIED_COMMENT(), stmt);
				setString(6, data.getsetPUCH_ODR_CD(), stmt);
				setString(7, data.getsetACPT_NO(), stmt);
				setString(8, data.getsetITEM_CD(), stmt);
				setString(9, data.getsetLOT_NO(), stmt);

				return stmt.executeUpdate();
			} finally {
				if(stmt!=null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:updateT_LOT_USE_RSLT_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:updateT_LOT_USE_RSLT_clear

			return;
		}

		/**
		 * updateT_LOT_USE_RSLTクラスの標準コンストラクタ
		 */
		public updateT_LOT_USE_RSLT()
		{
			//{{user_implement_dev:updateT_LOT_USE_RSLT_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:updateT_LOT_USE_RSLT_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class updateT_LOT_ISSUE_INST extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = "UPDATE "
+"  T_LOT_ISSUE_INST "
+"SET "
+"  SPENT_QTY = SPENT_QTY + TO_NUMBER(?) "
+"WHERE "
+"  ISSUE_INST_CD = ? "
+"  AND LOT_NO = ? "
+"  AND ITEM_CD = ? "
+"  AND PUCH_ODR_CD = ?";
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="AE0060020";
		protected String m_sUpdateProgramName="AE0060020";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:updateT_LOT_ISSUE_INST_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:updateT_LOT_ISSUE_INST_def

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return update(conn.getConn(), data);
		}

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt=null;
			int modifyCount;

			try {
				if("Oracle".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U(m_updcmd));
				} else if("Microsoft SQL Server".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U_MSSQL(m_updcmd));
				} else if("PostgreSQL".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U_PGSQL(m_updcmd));
				} else if("MySQL".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U_MYSQL(m_updcmd));
				} else {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U_DB2(m_updcmd));
				}

				setString(1, data.getsSysdate(), stmt);
				setString(2, data.getsUser_ID(), stmt);
				setString(3, m_sUpdateProgramName, stmt);
				setString(4, data.getsetSPENT_QTY(), stmt);
				setString(5, data.getISSUE_INST_CD(), stmt);
				setString(6, data.getLOT_NO(), stmt);
				setString(7, data.getITEM_CD(), stmt);
				setString(8, data.getPUCH_ODR_CD(), stmt);

				return stmt.executeUpdate();
			} finally {
				if(stmt!=null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:updateT_LOT_ISSUE_INST_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:updateT_LOT_ISSUE_INST_clear

			return;
		}

		/**
		 * updateT_LOT_ISSUE_INSTクラスの標準コンストラクタ
		 */
		public updateT_LOT_ISSUE_INST()
		{
			//{{user_implement_dev:updateT_LOT_ISSUE_INST_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:updateT_LOT_ISSUE_INST_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class SelectISSUE_INST_CD extends DataObject
	{
		protected String m_selcmd = "select "
+"  T_LOT_USE_RSLT.RSLT_CTL_SEQ_NO, "
+"  T_LOT_USE_RSLT.ISSUE_INST_CD "
+"from "
+"  T_LOT_USE_RSLT "
+"where "
+"  T_LOT_USE_RSLT.PUCH_ODR_CD = ? "
+"  and T_LOT_USE_RSLT.ACPT_NO = to_number(?) "
+"  and T_LOT_USE_RSLT.ITEM_CD = ? "
+"  and T_LOT_USE_RSLT.ISSUE_INST_CD is not null";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SelectISSUE_INST_CD_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:SelectISSUE_INST_CD_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStr);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStrs);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectISSUE_INST_CD_read
			if(m_selcmd==null) throw new FoundationException("SelectISSUE_INST_CD", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectISSUE_INST_CD_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectISSUE_INST_CD_read2
			if(m_selcmd==null) throw new FoundationException("SelectISSUE_INST_CD", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStr);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectISSUE_INST_CD_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectISSUE_INST_CD_read3
			if(m_selcmd==null) throw new FoundationException("SelectISSUE_INST_CD", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStrs);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectISSUE_INST_CD_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);

			try {
				List list=new ArrayList();

				while((data=next(rs))!=null) {
					list.add(data);
				}

				return list;
			} finally {
				rs.close();
				rs = null;
			}
		}

		/**
		 * クエリーのprepare処理
		 *
		 * @return PreparedStatementインスタンスを返します
		 * @param conn Native Connectionインスタンス
		 * @param query SQL文字列
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query, AE0060020Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getsetPUCH_ODR_CD());
				if(isNull(data.getsetPUCH_ODR_CD())) isNull = true;
				ary.addElement(data.getsetACPT_NO());
				if(isNull(data.getsetACPT_NO())) isNull = true;
				ary.addElement(data.getsetITEM_CD());
				if(isNull(data.getsetITEM_CD())) isNull = true;

				// 静的SQL文の生成
				stmt = conn.prepareStatement(query);

			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * データ読出し処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getsetPUCH_ODR_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getsetACPT_NO(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getsetITEM_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0060020Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0060020Struct data = new AE0060020Struct();

			data.setSEQ_NO( getString(1, rs) );
			data.setISSUE_INST_CD( getString(2, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SelectISSUE_INST_CD", "hasRecord", "クエリー未登録");

			ResultSet rs=null;
			PreparedStatement stmt=null;

			try {
				stmt = prepare(conn, m_selcmd, data);

				rs = stmt.executeQuery();

				return rs.next();
			} finally {
				if(rs != null) {
					rs.close();
					rs = null;
				}
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return check(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectISSUE_INST_CD_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectISSUE_INST_CD_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);
			boolean ret=true;

			try {
				if(rs.next()==false) return false;


				return ret;
			} finally {
				if (rs != null) {
					rs.close();
					rs = null;
				}
			}
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:SelectISSUE_INST_CD_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:SelectISSUE_INST_CD_clear

			return;
		}

		/**
		 * SelectISSUE_INST_CDクラスの標準コンストラクタ
		 */
		public SelectISSUE_INST_CD()
		{
			//{{user_implement_dev:SelectISSUE_INST_CD_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:SelectISSUE_INST_CD_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class checkLOT_CTRL_FLG1 extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = "SELECT "
+"  M_ITEM.ITEM_CD "
+"FROM "
+"  M_ITEM "
+"WHERE "
+"  M_ITEM.ITEM_CD = ? "
+"  AND M_ITEM.LOT_CTRL_FLG = 1";
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:checkLOT_CTRL_FLG1_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:checkLOT_CTRL_FLG1_def

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return check(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:checkLOT_CTRL_FLG1_check
			PreparedStatement stmt = prepare(conn, m_chkcmd, data);

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:checkLOT_CTRL_FLG1_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);
			boolean ret=true;

			try {
				if(rs.next()==false) return false;


				return ret;
			} finally {
				if (rs != null) {
					rs.close();
					rs = null;
				}
			}
		}

		/**
		 * クエリーのprepare処理
		 *
		 * @return PreparedStatementインスタンスを返します
		 * @param conn Native Connectionインスタンス
		 * @param query SQL文字列
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query, AE0060020Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getsetITEM_CD());
				if(isNull(data.getsetITEM_CD())) isNull = true;

				// 静的SQL文の生成
				stmt = conn.prepareStatement(query);

			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * データ読出し処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getsetITEM_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:checkLOT_CTRL_FLG1_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:checkLOT_CTRL_FLG1_clear

			return;
		}

		/**
		 * checkLOT_CTRL_FLG1クラスの標準コンストラクタ
		 */
		public checkLOT_CTRL_FLG1()
		{
			//{{user_implement_dev:checkLOT_CTRL_FLG1_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:checkLOT_CTRL_FLG1_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class checkLOT_NO1 extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = "SELECT "
+"  T_LOT_CTRL.LOT_NO "
+"FROM "
+"  T_LOT_CTRL, "
+"  M_ITEM "
+"WHERE "
+"  T_LOT_CTRL.LOT_NO = ? "
+"  AND M_ITEM.ITEM_CD = ? "
+"  AND M_ITEM.ITEM_CD = T_LOT_CTRL.ITEM_CD";
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:checkLOT_NO1_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:checkLOT_NO1_def

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return check(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:checkLOT_NO1_check
			PreparedStatement stmt = prepare(conn, m_chkcmd, data);

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:checkLOT_NO1_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);
			boolean ret=true;

			try {
				if(rs.next()==false) return false;


				return ret;
			} finally {
				if (rs != null) {
					rs.close();
					rs = null;
				}
			}
		}

		/**
		 * クエリーのprepare処理
		 *
		 * @return PreparedStatementインスタンスを返します
		 * @param conn Native Connectionインスタンス
		 * @param query SQL文字列
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query, AE0060020Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getLOT_NO());
				if(isNull(data.getLOT_NO())) isNull = true;
				ary.addElement(data.getsetITEM_CD());
				if(isNull(data.getsetITEM_CD())) isNull = true;

				// 静的SQL文の生成
				stmt = conn.prepareStatement(query);

			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * データ読出し処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getLOT_NO(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getsetITEM_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:checkLOT_NO1_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:checkLOT_NO1_clear

			return;
		}

		/**
		 * checkLOT_NO1クラスの標準コンストラクタ
		 */
		public checkLOT_NO1()
		{
			//{{user_implement_dev:checkLOT_NO1_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:checkLOT_NO1_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class checkWH_CD extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = "select "
+"  T_LOT_STOCK.WH_CD "
+"from "
+"  T_RLSD_PUCH_ODR, "
+"  M_WH, "
+"  T_LOT_STOCK "
+"where "
+"  T_LOT_STOCK.LOT_NO = ? "
+"  and T_LOT_STOCK.ITEM_CD = ? "
+"  and T_RLSD_PUCH_ODR.PUCH_ODR_CD = ? "
+"  and T_RLSD_PUCH_ODR.VEND_CD = M_WH.VEND_CD "
+"  and T_RLSD_PUCH_ODR.PLANT_CD = M_WH.PLANT_CD "
+"  and T_LOT_STOCK.WH_CD = M_WH.WH_CD";
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:checkWH_CD_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:checkWH_CD_def

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return check(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:checkWH_CD_check
			PreparedStatement stmt = prepare(conn, m_chkcmd, data);

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:checkWH_CD_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);
			boolean ret=true;

			try {
				if(rs.next()==false) return false;


				return ret;
			} finally {
				if (rs != null) {
					rs.close();
					rs = null;
				}
			}
		}

		/**
		 * クエリーのprepare処理
		 *
		 * @return PreparedStatementインスタンスを返します
		 * @param conn Native Connectionインスタンス
		 * @param query SQL文字列
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query, AE0060020Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getLOT_NO());
				if(isNull(data.getLOT_NO())) isNull = true;
				ary.addElement(data.getsetITEM_CD());
				if(isNull(data.getsetITEM_CD())) isNull = true;
				ary.addElement(data.getsetPUCH_ODR_CD());
				if(isNull(data.getsetPUCH_ODR_CD())) isNull = true;

				// 静的SQL文の生成
				stmt = conn.prepareStatement(query);

			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * データ読出し処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getLOT_NO(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getsetITEM_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getsetPUCH_ODR_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:checkWH_CD_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:checkWH_CD_clear

			return;
		}

		/**
		 * checkWH_CDクラスの標準コンストラクタ
		 */
		public checkWH_CD()
		{
			//{{user_implement_dev:checkWH_CD_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:checkWH_CD_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class checkSTOCK_ON_HAND_QTY extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = "select "
+"  T_LOT_STOCK.WH_CD "
+"from "
+"  T_RLSD_PUCH_ODR, "
+"  M_WH, "
+"  T_LOT_STOCK "
+"where "
+"  T_LOT_STOCK.LOT_NO = ? "
+"  and T_LOT_STOCK.ITEM_CD = ? "
+"  and T_RLSD_PUCH_ODR.PUCH_ODR_CD = ? "
+"  and T_RLSD_PUCH_ODR.VEND_CD = M_WH.VEND_CD "
+"  and T_RLSD_PUCH_ODR.PLANT_CD = M_WH.PLANT_CD "
+"  and T_LOT_STOCK.WH_CD = M_WH.WH_CD "
+"  and T_LOT_STOCK.STOCK_ON_HAND_QTY - T_LOT_STOCK.ALCD_QTY < to_number(?)";
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:checkSTOCK_ON_HAND_QTY_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:checkSTOCK_ON_HAND_QTY_def

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return check(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:checkSTOCK_ON_HAND_QTY_check
			PreparedStatement stmt = prepare(conn, m_chkcmd, data);

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:checkSTOCK_ON_HAND_QTY_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);
			boolean ret=true;

			try {
				if(rs.next()==false) return false;


				return ret;
			} finally {
				if (rs != null) {
					rs.close();
					rs = null;
				}
			}
		}

		/**
		 * クエリーのprepare処理
		 *
		 * @return PreparedStatementインスタンスを返します
		 * @param conn Native Connectionインスタンス
		 * @param query SQL文字列
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query, AE0060020Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getLOT_NO());
				if(isNull(data.getLOT_NO())) isNull = true;
				ary.addElement(data.getsetITEM_CD());
				if(isNull(data.getsetITEM_CD())) isNull = true;
				ary.addElement(data.getsetPUCH_ODR_CD());
				if(isNull(data.getsetPUCH_ODR_CD())) isNull = true;
				ary.addElement(data.getsetTOTAL_ISSUE_QTY());
				if(isNull(data.getsetTOTAL_ISSUE_QTY())) isNull = true;

				// 静的SQL文の生成
				stmt = conn.prepareStatement(query);

			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * データ読出し処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getLOT_NO(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getsetITEM_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getsetPUCH_ODR_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getsetTOTAL_ISSUE_QTY(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:checkSTOCK_ON_HAND_QTY_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:checkSTOCK_ON_HAND_QTY_clear

			return;
		}

		/**
		 * checkSTOCK_ON_HAND_QTYクラスの標準コンストラクタ
		 */
		public checkSTOCK_ON_HAND_QTY()
		{
			//{{user_implement_dev:checkSTOCK_ON_HAND_QTY_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:checkSTOCK_ON_HAND_QTY_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class checkSTOCK_ON_HAND_QTY2 extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = "select "
+"  T_LOT_STOCK.WH_CD "
+"from "
+"  T_LOT_STOCK "
+"where "
+"  T_LOT_STOCK.LOT_NO = ? "
+"  and T_LOT_STOCK.ITEM_CD = ? "
+"  and T_LOT_STOCK.WH_CD = ? "
+"  and T_LOT_STOCK.STOCK_ON_HAND_QTY - T_LOT_STOCK.ALCD_QTY < to_number(?)";
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:checkSTOCK_ON_HAND_QTY2_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:checkSTOCK_ON_HAND_QTY2_def

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return check(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:checkSTOCK_ON_HAND_QTY2_check
			PreparedStatement stmt = prepare(conn, m_chkcmd, data);

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:checkSTOCK_ON_HAND_QTY2_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);
			boolean ret=true;

			try {
				if(rs.next()==false) return false;


				return ret;
			} finally {
				if (rs != null) {
					rs.close();
					rs = null;
				}
			}
		}

		/**
		 * クエリーのprepare処理
		 *
		 * @return PreparedStatementインスタンスを返します
		 * @param conn Native Connectionインスタンス
		 * @param query SQL文字列
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query, AE0060020Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getLOT_NO());
				if(isNull(data.getLOT_NO())) isNull = true;
				ary.addElement(data.getsetITEM_CD());
				if(isNull(data.getsetITEM_CD())) isNull = true;
				ary.addElement(data.getsetWH_CD());
				if(isNull(data.getsetWH_CD())) isNull = true;
				ary.addElement(data.getsetTOTAL_ISSUE_QTY());
				if(isNull(data.getsetTOTAL_ISSUE_QTY())) isNull = true;

				// 静的SQL文の生成
				stmt = conn.prepareStatement(query);

			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * データ読出し処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getLOT_NO(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getsetITEM_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getsetWH_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getsetTOTAL_ISSUE_QTY(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:checkSTOCK_ON_HAND_QTY2_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:checkSTOCK_ON_HAND_QTY2_clear

			return;
		}

		/**
		 * checkSTOCK_ON_HAND_QTY2クラスの標準コンストラクタ
		 */
		public checkSTOCK_ON_HAND_QTY2()
		{
			//{{user_implement_dev:checkSTOCK_ON_HAND_QTY2_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:checkSTOCK_ON_HAND_QTY2_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class getSUM_TOTAL_ISSUE_QTY extends DataObject
	{
		protected String m_selcmd = "select "
+"  sum(T_LOT_USE_RSLT.TOTAL_ISSUE_QTY) "
+"from "
+"  T_LOT_USE_RSLT "
+"where "
+"  T_LOT_USE_RSLT.PUCH_ODR_CD = ? "
+"  and T_LOT_USE_RSLT.ACPT_NO = to_number(?) "
+"  and T_LOT_USE_RSLT.ITEM_CD = ? "
+"  and T_LOT_USE_RSLT.LOT_NO = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:getSUM_TOTAL_ISSUE_QTY_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:getSUM_TOTAL_ISSUE_QTY_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStr);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStrs);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:getSUM_TOTAL_ISSUE_QTY_read
			if(m_selcmd==null) throw new FoundationException("getSUM_TOTAL_ISSUE_QTY", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:getSUM_TOTAL_ISSUE_QTY_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:getSUM_TOTAL_ISSUE_QTY_read2
			if(m_selcmd==null) throw new FoundationException("getSUM_TOTAL_ISSUE_QTY", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStr);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:getSUM_TOTAL_ISSUE_QTY_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:getSUM_TOTAL_ISSUE_QTY_read3
			if(m_selcmd==null) throw new FoundationException("getSUM_TOTAL_ISSUE_QTY", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStrs);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:getSUM_TOTAL_ISSUE_QTY_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);

			try {
				List list=new ArrayList();

				while((data=next(rs))!=null) {
					list.add(data);
				}

				return list;
			} finally {
				rs.close();
				rs = null;
			}
		}

		/**
		 * クエリーのprepare処理
		 *
		 * @return PreparedStatementインスタンスを返します
		 * @param conn Native Connectionインスタンス
		 * @param query SQL文字列
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query, AE0060020Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getsetPUCH_ODR_CD());
				if(isNull(data.getsetPUCH_ODR_CD())) isNull = true;
				ary.addElement(data.getsetACPT_NO());
				if(isNull(data.getsetACPT_NO())) isNull = true;
				ary.addElement(data.getsetITEM_CD());
				if(isNull(data.getsetITEM_CD())) isNull = true;
				ary.addElement(data.getsetLOT_NO());
				if(isNull(data.getsetLOT_NO())) isNull = true;

				// 静的SQL文の生成
				stmt = conn.prepareStatement(query);

			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * データ読出し処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getsetPUCH_ODR_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getsetACPT_NO(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getsetITEM_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getsetLOT_NO(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0060020Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0060020Struct data = new AE0060020Struct();

			data.setreadTOTAL_ISSUE_QTY( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("getSUM_TOTAL_ISSUE_QTY", "hasRecord", "クエリー未登録");

			ResultSet rs=null;
			PreparedStatement stmt=null;

			try {
				stmt = prepare(conn, m_selcmd, data);

				rs = stmt.executeQuery();

				return rs.next();
			} finally {
				if(rs != null) {
					rs.close();
					rs = null;
				}
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return check(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:getSUM_TOTAL_ISSUE_QTY_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:getSUM_TOTAL_ISSUE_QTY_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);
			boolean ret=true;

			try {
				if(rs.next()==false) return false;


				return ret;
			} finally {
				if (rs != null) {
					rs.close();
					rs = null;
				}
			}
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:getSUM_TOTAL_ISSUE_QTY_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:getSUM_TOTAL_ISSUE_QTY_clear

			return;
		}

		/**
		 * getSUM_TOTAL_ISSUE_QTYクラスの標準コンストラクタ
		 */
		public getSUM_TOTAL_ISSUE_QTY()
		{
			//{{user_implement_dev:getSUM_TOTAL_ISSUE_QTY_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:getSUM_TOTAL_ISSUE_QTY_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class checkT_LOT_ISSUE_INST2 extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = "SELECT "
+"  T_PART_SUPPLIED_ISSUE.ISSUE_INST_CD "
+"FROM "
+"  T_ISSUE_INST, "
+"  T_LOT_USE_RSLT, "
+"  T_LOT_ISSUE_INST, "
+"  T_PART_SUPPLIED_ISSUE, "
+"  T_LOT_CTRL "
+"WHERE "
+"  T_LOT_ISSUE_INST.PUCH_ODR_CD = T_PART_SUPPLIED_ISSUE.PUCH_ODR_CD "
+"  AND T_LOT_ISSUE_INST.ITEM_CD = T_PART_SUPPLIED_ISSUE.ITEM_CD "
+"  AND T_LOT_ISSUE_INST.ISSUE_INST_CD = T_PART_SUPPLIED_ISSUE.ISSUE_INST_CD "
+"  AND T_LOT_USE_RSLT.PUCH_ODR_CD = T_PART_SUPPLIED_ISSUE.PUCH_ODR_CD "
+"  AND T_LOT_USE_RSLT.ITEM_CD = T_PART_SUPPLIED_ISSUE.ITEM_CD "
+"  AND T_LOT_USE_RSLT.ISSUE_INST_CD = T_PART_SUPPLIED_ISSUE.ISSUE_INST_CD "
+"  AND T_ISSUE_INST.ISSUE_INST_CD = T_PART_SUPPLIED_ISSUE.ISSUE_INST_CD "
+"  AND T_ISSUE_INST.ISSUE_INST_CD = T_LOT_ISSUE_INST.ISSUE_INST_CD "
+"  AND T_ISSUE_INST.ISSUE_INST_CD = T_LOT_USE_RSLT.ISSUE_INST_CD "
+"  AND T_LOT_ISSUE_INST.LOT_NO = T_LOT_CTRL.LOT_NO "
+"  AND T_LOT_ISSUE_INST.ITEM_CD = T_LOT_CTRL.ITEM_CD "
+"  AND T_PART_SUPPLIED_ISSUE.PUCH_ODR_CD = ? "
+"  AND T_PART_SUPPLIED_ISSUE.ITEM_CD = ? "
+"  AND T_PART_SUPPLIED_ISSUE.ACPT_NO = TO_NUMBER(?) "
+"  AND T_PART_SUPPLIED_ISSUE.ISSUE_INST_CD = ?";
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:checkT_LOT_ISSUE_INST2_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:checkT_LOT_ISSUE_INST2_def

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return check(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:checkT_LOT_ISSUE_INST2_check
			PreparedStatement stmt = prepare(conn, m_chkcmd, data);

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:checkT_LOT_ISSUE_INST2_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);
			boolean ret=true;

			try {
				if(rs.next()==false) return false;


				return ret;
			} finally {
				if (rs != null) {
					rs.close();
					rs = null;
				}
			}
		}

		/**
		 * クエリーのprepare処理
		 *
		 * @return PreparedStatementインスタンスを返します
		 * @param conn Native Connectionインスタンス
		 * @param query SQL文字列
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query, AE0060020Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getsetPUCH_ODR_CD());
				if(isNull(data.getsetPUCH_ODR_CD())) isNull = true;
				ary.addElement(data.getsetITEM_CD());
				if(isNull(data.getsetITEM_CD())) isNull = true;
				ary.addElement(data.getsetACPT_NO());
				if(isNull(data.getsetACPT_NO())) isNull = true;
				ary.addElement(data.getsetISSUE_INST_CD());
				if(isNull(data.getsetISSUE_INST_CD())) isNull = true;

				// 静的SQL文の生成
				stmt = conn.prepareStatement(query);

			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * データ読出し処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getsetPUCH_ODR_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getsetITEM_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getsetACPT_NO(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getsetISSUE_INST_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:checkT_LOT_ISSUE_INST2_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:checkT_LOT_ISSUE_INST2_clear

			return;
		}

		/**
		 * checkT_LOT_ISSUE_INST2クラスの標準コンストラクタ
		 */
		public checkT_LOT_ISSUE_INST2()
		{
			//{{user_implement_dev:checkT_LOT_ISSUE_INST2_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:checkT_LOT_ISSUE_INST2_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class getT_LOT_USE_RSLT_QTY extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  T_LOT_USE_RSLT.LOT_NO, "
+"  TO_CHAR(SUM(T_LOT_USE_RSLT.TOTAL_ISSUE_QTY)) "
+"FROM "
+"  T_LOT_USE_RSLT, "
+"  T_PART_SUPPLIED_ISSUE, "
+"  T_LOT_CTRL "
+"WHERE "
+"  T_PART_SUPPLIED_ISSUE.PUCH_ODR_CD = ? "
+"  AND T_PART_SUPPLIED_ISSUE.ITEM_CD = ? "
+"  AND T_PART_SUPPLIED_ISSUE.ACPT_NO = TO_NUMBER(?) "
+"  AND T_PART_SUPPLIED_ISSUE.ISSUE_INST_CD = ? "
+"  AND T_LOT_USE_RSLT.PUCH_ODR_CD = T_PART_SUPPLIED_ISSUE.PUCH_ODR_CD "
+"  AND T_LOT_USE_RSLT.ITEM_CD = T_PART_SUPPLIED_ISSUE.ITEM_CD "
+"  AND T_LOT_USE_RSLT.ISSUE_INST_CD = T_PART_SUPPLIED_ISSUE.ISSUE_INST_CD "
+"  AND T_LOT_CTRL.ITEM_CD = T_PART_SUPPLIED_ISSUE.ITEM_CD "
+"  AND T_LOT_CTRL.LOT_NO = T_LOT_USE_RSLT.LOT_NO "
+"GROUP BY "
+"  T_LOT_USE_RSLT.LOT_NO";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:getT_LOT_USE_RSLT_QTY_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:getT_LOT_USE_RSLT_QTY_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStr);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStrs);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:getT_LOT_USE_RSLT_QTY_read
			if(m_selcmd==null) throw new FoundationException("getT_LOT_USE_RSLT_QTY", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:getT_LOT_USE_RSLT_QTY_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:getT_LOT_USE_RSLT_QTY_read2
			if(m_selcmd==null) throw new FoundationException("getT_LOT_USE_RSLT_QTY", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStr);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:getT_LOT_USE_RSLT_QTY_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:getT_LOT_USE_RSLT_QTY_read3
			if(m_selcmd==null) throw new FoundationException("getT_LOT_USE_RSLT_QTY", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStrs);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:getT_LOT_USE_RSLT_QTY_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);

			try {
				List list=new ArrayList();

				while((data=next(rs))!=null) {
					list.add(data);
				}

				return list;
			} finally {
				rs.close();
				rs = null;
			}
		}

		/**
		 * クエリーのprepare処理
		 *
		 * @return PreparedStatementインスタンスを返します
		 * @param conn Native Connectionインスタンス
		 * @param query SQL文字列
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query, AE0060020Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getsetPUCH_ODR_CD());
				if(isNull(data.getsetPUCH_ODR_CD())) isNull = true;
				ary.addElement(data.getsetITEM_CD());
				if(isNull(data.getsetITEM_CD())) isNull = true;
				ary.addElement(data.getsetACPT_NO());
				if(isNull(data.getsetACPT_NO())) isNull = true;
				ary.addElement(data.getsetISSUE_INST_CD());
				if(isNull(data.getsetISSUE_INST_CD())) isNull = true;

				// 静的SQL文の生成
				stmt = conn.prepareStatement(query);

			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * データ読出し処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getsetPUCH_ODR_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getsetITEM_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getsetACPT_NO(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getsetISSUE_INST_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0060020Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0060020Struct data = new AE0060020Struct();

			data.setreadLOT_NO( getString(1, rs) );
			data.setreadSUM_QTY( getString(2, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("getT_LOT_USE_RSLT_QTY", "hasRecord", "クエリー未登録");

			ResultSet rs=null;
			PreparedStatement stmt=null;

			try {
				stmt = prepare(conn, m_selcmd, data);

				rs = stmt.executeQuery();

				return rs.next();
			} finally {
				if(rs != null) {
					rs.close();
					rs = null;
				}
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return check(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:getT_LOT_USE_RSLT_QTY_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:getT_LOT_USE_RSLT_QTY_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);
			boolean ret=true;

			try {
				if(rs.next()==false) return false;


				return ret;
			} finally {
				if (rs != null) {
					rs.close();
					rs = null;
				}
			}
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:getT_LOT_USE_RSLT_QTY_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:getT_LOT_USE_RSLT_QTY_clear

			return;
		}

		/**
		 * getT_LOT_USE_RSLT_QTYクラスの標準コンストラクタ
		 */
		public getT_LOT_USE_RSLT_QTY()
		{
			//{{user_implement_dev:getT_LOT_USE_RSLT_QTY_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:getT_LOT_USE_RSLT_QTY_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class updateT_LOT_ISSUE_INST_SPENT_QTY extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = "update "
+"  T_LOT_ISSUE_INST "
+"set "
+"  T_LOT_ISSUE_INST.SPENT_QTY = 0 "
+"where "
+"  T_LOT_ISSUE_INST.ISSUE_INST_CD = ? "
+"  and T_LOT_ISSUE_INST.ITEM_CD = ? "
+"  and T_LOT_ISSUE_INST.PUCH_ODR_CD = ? "
+"  and exists( "
+"    select "
+"      T_LOT_CTRL.LOT_NO, "
+"      T_LOT_CTRL.ITEM_CD "
+"    from "
+"      T_LOT_CTRL "
+"    where "
+"      T_LOT_ISSUE_INST.LOT_NO = T_LOT_CTRL.LOT_NO "
+"      and T_LOT_ISSUE_INST.ITEM_CD = T_LOT_CTRL.ITEM_CD "
+"  )";
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="AE0060020";
		protected String m_sUpdateProgramName="AE0060020";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:updateT_LOT_ISSUE_INST_SPENT_QTY_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:updateT_LOT_ISSUE_INST_SPENT_QTY_def

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return update(conn.getConn(), data);
		}

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt=null;
			int modifyCount;

			try {
				if("Oracle".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U(m_updcmd));
				} else if("Microsoft SQL Server".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U_MSSQL(m_updcmd));
				} else if("PostgreSQL".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U_PGSQL(m_updcmd));
				} else if("MySQL".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U_MYSQL(m_updcmd));
				} else {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U_DB2(m_updcmd));
				}

				setString(1, data.getsSysdate(), stmt);
				setString(2, data.getsUser_ID(), stmt);
				setString(3, m_sUpdateProgramName, stmt);
				setString(4, data.getsetISSUE_INST_CD(), stmt);
				setString(5, data.getsetITEM_CD(), stmt);
				setString(6, data.getsetPUCH_ODR_CD(), stmt);

				return stmt.executeUpdate();
			} finally {
				if(stmt!=null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:updateT_LOT_ISSUE_INST_SPENT_QTY_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:updateT_LOT_ISSUE_INST_SPENT_QTY_clear

			return;
		}

		/**
		 * updateT_LOT_ISSUE_INST_SPENT_QTYクラスの標準コンストラクタ
		 */
		public updateT_LOT_ISSUE_INST_SPENT_QTY()
		{
			//{{user_implement_dev:updateT_LOT_ISSUE_INST_SPENT_QTY_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:updateT_LOT_ISSUE_INST_SPENT_QTY_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class deleteT_LOT_USE_RSLT extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = "delete from "
+"  T_LOT_USE_RSLT "
+"where "
+"  T_LOT_USE_RSLT.PUCH_ODR_CD = ? "
+"  and exists( "
+"    select "
+"      * "
+"    from "
+"      T_PART_SUPPLIED_ISSUE "
+"    where "
+"      T_LOT_USE_RSLT.PUCH_ODR_CD = T_PART_SUPPLIED_ISSUE.PUCH_ODR_CD "
+"      and T_LOT_USE_RSLT.ITEM_CD = T_PART_SUPPLIED_ISSUE.ITEM_CD "
+"      and T_LOT_USE_RSLT.ISSUE_INST_CD = T_PART_SUPPLIED_ISSUE.ISSUE_INST_CD "
+"      and T_LOT_USE_RSLT.ACPT_NO = T_PART_SUPPLIED_ISSUE.ACPT_NO "
+"  )";
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="AE0060020";
		protected String m_sUpdateProgramName="AE0060020";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:deleteT_LOT_USE_RSLT_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:deleteT_LOT_USE_RSLT_def

		/**
		 * データ削除処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int delete(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return delete(conn.getConn(), data);
		}

		/**
		 * データ削除処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int delete(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt=null;

			try {
				stmt = conn.prepareStatement(m_delcmd);

				setString(1, data.getsetPUCH_ODR_CD(), stmt);

				return stmt.executeUpdate();
			} finally {
				if(stmt!=null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:deleteT_LOT_USE_RSLT_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:deleteT_LOT_USE_RSLT_clear

			return;
		}

		/**
		 * deleteT_LOT_USE_RSLTクラスの標準コンストラクタ
		 */
		public deleteT_LOT_USE_RSLT()
		{
			//{{user_implement_dev:deleteT_LOT_USE_RSLT_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:deleteT_LOT_USE_RSLT_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class getParentITEM_CD extends DataObject
	{
		protected String m_selcmd = "select "
+"  T_RLSD_PUCH_ODR.ITEM_CD "
+"from "
+"  T_RLSD_PUCH_ODR "
+"where "
+"  T_RLSD_PUCH_ODR.PUCH_ODR_CD = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:getParentITEM_CD_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:getParentITEM_CD_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStr);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStrs);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:getParentITEM_CD_read
			if(m_selcmd==null) throw new FoundationException("getParentITEM_CD", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:getParentITEM_CD_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:getParentITEM_CD_read2
			if(m_selcmd==null) throw new FoundationException("getParentITEM_CD", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStr);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:getParentITEM_CD_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:getParentITEM_CD_read3
			if(m_selcmd==null) throw new FoundationException("getParentITEM_CD", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStrs);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:getParentITEM_CD_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);

			try {
				List list=new ArrayList();

				while((data=next(rs))!=null) {
					list.add(data);
				}

				return list;
			} finally {
				rs.close();
				rs = null;
			}
		}

		/**
		 * クエリーのprepare処理
		 *
		 * @return PreparedStatementインスタンスを返します
		 * @param conn Native Connectionインスタンス
		 * @param query SQL文字列
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query, AE0060020Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getPUCH_ODR_CD());
				if(isNull(data.getPUCH_ODR_CD())) isNull = true;

				// 静的SQL文の生成
				stmt = conn.prepareStatement(query);

			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * データ読出し処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getPUCH_ODR_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0060020Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0060020Struct data = new AE0060020Struct();

			data.setreadITEM_CD( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("getParentITEM_CD", "hasRecord", "クエリー未登録");

			ResultSet rs=null;
			PreparedStatement stmt=null;

			try {
				stmt = prepare(conn, m_selcmd, data);

				rs = stmt.executeQuery();

				return rs.next();
			} finally {
				if(rs != null) {
					rs.close();
					rs = null;
				}
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return check(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:getParentITEM_CD_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:getParentITEM_CD_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);
			boolean ret=true;

			try {
				if(rs.next()==false) return false;


				return ret;
			} finally {
				if (rs != null) {
					rs.close();
					rs = null;
				}
			}
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:getParentITEM_CD_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:getParentITEM_CD_clear

			return;
		}

		/**
		 * getParentITEM_CDクラスの標準コンストラクタ
		 */
		public getParentITEM_CD()
		{
			//{{user_implement_dev:getParentITEM_CD_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:getParentITEM_CD_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class SelectT_LOT_USE_RSLT_LOT_NO extends DataObject
	{
		protected String m_selcmd = "select "
+"  to_char(T_LOT_USE_RSLT.TOTAL_ISSUE_QTY) "
+"from "
+"  T_LOT_USE_RSLT, "
+"  T_PART_SUPPLIED_ISSUE, "
+"  T_LOT_CTRL "
+"where "
+"  T_PART_SUPPLIED_ISSUE.PUCH_ODR_CD = ? "
+"  and T_PART_SUPPLIED_ISSUE.ACPT_NO = to_number(?) "
+"  and T_PART_SUPPLIED_ISSUE.ITEM_CD = ? "
+"  and T_LOT_USE_RSLT.LOT_NO = ? "
+"  and T_PART_SUPPLIED_ISSUE.PUCH_ODR_CD = T_LOT_USE_RSLT.PUCH_ODR_CD "
+"  and T_PART_SUPPLIED_ISSUE.ACPT_NO = T_LOT_USE_RSLT.ACPT_NO "
+"  and T_PART_SUPPLIED_ISSUE.ITEM_CD = T_LOT_USE_RSLT.ITEM_CD "
+"  and T_PART_SUPPLIED_ISSUE.ITEM_CD = T_LOT_CTRL.ITEM_CD "
+"  and T_LOT_CTRL.LOT_NO = T_LOT_USE_RSLT.LOT_NO";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SelectT_LOT_USE_RSLT_LOT_NO_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:SelectT_LOT_USE_RSLT_LOT_NO_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStr);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStrs);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectT_LOT_USE_RSLT_LOT_NO_read
			if(m_selcmd==null) throw new FoundationException("SelectT_LOT_USE_RSLT_LOT_NO", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectT_LOT_USE_RSLT_LOT_NO_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectT_LOT_USE_RSLT_LOT_NO_read2
			if(m_selcmd==null) throw new FoundationException("SelectT_LOT_USE_RSLT_LOT_NO", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStr);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectT_LOT_USE_RSLT_LOT_NO_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectT_LOT_USE_RSLT_LOT_NO_read3
			if(m_selcmd==null) throw new FoundationException("SelectT_LOT_USE_RSLT_LOT_NO", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStrs);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectT_LOT_USE_RSLT_LOT_NO_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);

			try {
				List list=new ArrayList();

				while((data=next(rs))!=null) {
					list.add(data);
				}

				return list;
			} finally {
				rs.close();
				rs = null;
			}
		}

		/**
		 * クエリーのprepare処理
		 *
		 * @return PreparedStatementインスタンスを返します
		 * @param conn Native Connectionインスタンス
		 * @param query SQL文字列
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query, AE0060020Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getsetPUCH_ODR_CD());
				if(isNull(data.getsetPUCH_ODR_CD())) isNull = true;
				ary.addElement(data.getsetACPT_NO());
				if(isNull(data.getsetACPT_NO())) isNull = true;
				ary.addElement(data.getsetITEM_CD());
				if(isNull(data.getsetITEM_CD())) isNull = true;
				ary.addElement(data.getsetLOT_NO());
				if(isNull(data.getsetLOT_NO())) isNull = true;

				// 静的SQL文の生成
				stmt = conn.prepareStatement(query);

			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * データ読出し処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getsetPUCH_ODR_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getsetACPT_NO(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getsetITEM_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getsetLOT_NO(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0060020Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0060020Struct data = new AE0060020Struct();

			data.setreadTOTAL_ISSUE_QTY( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SelectT_LOT_USE_RSLT_LOT_NO", "hasRecord", "クエリー未登録");

			ResultSet rs=null;
			PreparedStatement stmt=null;

			try {
				stmt = prepare(conn, m_selcmd, data);

				rs = stmt.executeQuery();

				return rs.next();
			} finally {
				if(rs != null) {
					rs.close();
					rs = null;
				}
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return check(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectT_LOT_USE_RSLT_LOT_NO_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectT_LOT_USE_RSLT_LOT_NO_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);
			boolean ret=true;

			try {
				if(rs.next()==false) return false;


				return ret;
			} finally {
				if (rs != null) {
					rs.close();
					rs = null;
				}
			}
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:SelectT_LOT_USE_RSLT_LOT_NO_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:SelectT_LOT_USE_RSLT_LOT_NO_clear

			return;
		}

		/**
		 * SelectT_LOT_USE_RSLT_LOT_NOクラスの標準コンストラクタ
		 */
		public SelectT_LOT_USE_RSLT_LOT_NO()
		{
			//{{user_implement_dev:SelectT_LOT_USE_RSLT_LOT_NO_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:SelectT_LOT_USE_RSLT_LOT_NO_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class checkNON_NO_ITEM_FLG extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = "select "
+"  T_RLSD_PUCH_ODR.PUCH_ODR_CD "
+"from "
+"  T_RLSD_PUCH_ODR "
+"where "
+"  T_RLSD_PUCH_ODR.PUCH_ODR_CD = ? "
+"  and T_RLSD_PUCH_ODR.NON_NO_ITEM_FLG = 1";
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:checkNON_NO_ITEM_FLG_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:checkNON_NO_ITEM_FLG_def

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return check(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:checkNON_NO_ITEM_FLG_check
			PreparedStatement stmt = prepare(conn, m_chkcmd, data);

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:checkNON_NO_ITEM_FLG_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);
			boolean ret=true;

			try {
				if(rs.next()==false) return false;


				return ret;
			} finally {
				if (rs != null) {
					rs.close();
					rs = null;
				}
			}
		}

		/**
		 * クエリーのprepare処理
		 *
		 * @return PreparedStatementインスタンスを返します
		 * @param conn Native Connectionインスタンス
		 * @param query SQL文字列
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query, AE0060020Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getPUCH_ODR_CD());
				if(isNull(data.getPUCH_ODR_CD())) isNull = true;

				// 静的SQL文の生成
				stmt = conn.prepareStatement(query);

			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * データ読出し処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getPUCH_ODR_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:checkNON_NO_ITEM_FLG_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:checkNON_NO_ITEM_FLG_clear

			return;
		}

		/**
		 * checkNON_NO_ITEM_FLGクラスの標準コンストラクタ
		 */
		public checkNON_NO_ITEM_FLG()
		{
			//{{user_implement_dev:checkNON_NO_ITEM_FLG_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:checkNON_NO_ITEM_FLG_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class SelectLOT_NO_From_ACPT extends DataObject
	{
		protected String m_selcmd = "select "
+"  T_RLSD_PUCH_ODR.ITEM_CD as ITEM_CD, "
+"  T_ACPT_RSLT.LOT_NO as LOT_NO "
+"from "
+"  T_ACPT_RSLT, "
+"  T_RLSD_PUCH_ODR "
+"where "
+"  T_ACPT_RSLT.PUCH_ODR_CD = ? "
+"  and T_ACPT_RSLT.ACPT_NO = to_number(?) "
+"  and T_ACPT_RSLT.PUCH_ODR_CD = T_RLSD_PUCH_ODR.PUCH_ODR_CD";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SelectLOT_NO_From_ACPT_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:SelectLOT_NO_From_ACPT_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStr);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStrs);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectLOT_NO_From_ACPT_read
			if(m_selcmd==null) throw new FoundationException("SelectLOT_NO_From_ACPT", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectLOT_NO_From_ACPT_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectLOT_NO_From_ACPT_read2
			if(m_selcmd==null) throw new FoundationException("SelectLOT_NO_From_ACPT", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStr);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectLOT_NO_From_ACPT_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectLOT_NO_From_ACPT_read3
			if(m_selcmd==null) throw new FoundationException("SelectLOT_NO_From_ACPT", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStrs);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectLOT_NO_From_ACPT_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);

			try {
				List list=new ArrayList();

				while((data=next(rs))!=null) {
					list.add(data);
				}

				return list;
			} finally {
				rs.close();
				rs = null;
			}
		}

		/**
		 * クエリーのprepare処理
		 *
		 * @return PreparedStatementインスタンスを返します
		 * @param conn Native Connectionインスタンス
		 * @param query SQL文字列
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query, AE0060020Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getPUCH_ODR_CD());
				if(isNull(data.getPUCH_ODR_CD())) isNull = true;
				ary.addElement(data.getACPT_NO());
				if(isNull(data.getACPT_NO())) isNull = true;

				// 静的SQL文の生成
				stmt = conn.prepareStatement(query);

			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * データ読出し処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getPUCH_ODR_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getACPT_NO(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0060020Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0060020Struct data = new AE0060020Struct();

			data.setreadITEM_CD( getString(1, rs) );
			data.setreadLOT_NO( getString(2, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SelectLOT_NO_From_ACPT", "hasRecord", "クエリー未登録");

			ResultSet rs=null;
			PreparedStatement stmt=null;

			try {
				stmt = prepare(conn, m_selcmd, data);

				rs = stmt.executeQuery();

				return rs.next();
			} finally {
				if(rs != null) {
					rs.close();
					rs = null;
				}
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return check(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectLOT_NO_From_ACPT_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectLOT_NO_From_ACPT_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);
			boolean ret=true;

			try {
				if(rs.next()==false) return false;


				return ret;
			} finally {
				if (rs != null) {
					rs.close();
					rs = null;
				}
			}
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:SelectLOT_NO_From_ACPT_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:SelectLOT_NO_From_ACPT_clear

			return;
		}

		/**
		 * SelectLOT_NO_From_ACPTクラスの標準コンストラクタ
		 */
		public SelectLOT_NO_From_ACPT()
		{
			//{{user_implement_dev:SelectLOT_NO_From_ACPT_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:SelectLOT_NO_From_ACPT_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class SelectTOTAL_ISSUE_QTY_SUM extends DataObject
	{
		protected String m_selcmd = "select "
+"  sum(T_LOT_USE_RSLT.TOTAL_ISSUE_QTY) as TOTAL_ISSUE_QTY "
+"from "
+"  T_LOT_USE_RSLT "
+"where "
+"  T_LOT_USE_RSLT.PUCH_ODR_CD = ? "
+"  and T_LOT_USE_RSLT.ACPT_NO = to_number(?) "
+"  and T_LOT_USE_RSLT.ITEM_CD = ? "
+"  and T_LOT_USE_RSLT.LOT_NO = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SelectTOTAL_ISSUE_QTY_SUM_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:SelectTOTAL_ISSUE_QTY_SUM_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStr);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStrs);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectTOTAL_ISSUE_QTY_SUM_read
			if(m_selcmd==null) throw new FoundationException("SelectTOTAL_ISSUE_QTY_SUM", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectTOTAL_ISSUE_QTY_SUM_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectTOTAL_ISSUE_QTY_SUM_read2
			if(m_selcmd==null) throw new FoundationException("SelectTOTAL_ISSUE_QTY_SUM", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStr);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectTOTAL_ISSUE_QTY_SUM_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectTOTAL_ISSUE_QTY_SUM_read3
			if(m_selcmd==null) throw new FoundationException("SelectTOTAL_ISSUE_QTY_SUM", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStrs);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectTOTAL_ISSUE_QTY_SUM_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);

			try {
				List list=new ArrayList();

				while((data=next(rs))!=null) {
					list.add(data);
				}

				return list;
			} finally {
				rs.close();
				rs = null;
			}
		}

		/**
		 * クエリーのprepare処理
		 *
		 * @return PreparedStatementインスタンスを返します
		 * @param conn Native Connectionインスタンス
		 * @param query SQL文字列
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query, AE0060020Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getPUCH_ODR_CD());
				if(isNull(data.getPUCH_ODR_CD())) isNull = true;
				ary.addElement(data.getACPT_NO());
				if(isNull(data.getACPT_NO())) isNull = true;
				ary.addElement(data.getITEM_CD());
				if(isNull(data.getITEM_CD())) isNull = true;
				ary.addElement(data.getLOT_NO());
				if(isNull(data.getLOT_NO())) isNull = true;

				// 静的SQL文の生成
				stmt = conn.prepareStatement(query);

			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * データ読出し処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getPUCH_ODR_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getACPT_NO(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getITEM_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getLOT_NO(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0060020Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0060020Struct data = new AE0060020Struct();

			data.setreadTOTAL_ISSUE_QTY( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SelectTOTAL_ISSUE_QTY_SUM", "hasRecord", "クエリー未登録");

			ResultSet rs=null;
			PreparedStatement stmt=null;

			try {
				stmt = prepare(conn, m_selcmd, data);

				rs = stmt.executeQuery();

				return rs.next();
			} finally {
				if(rs != null) {
					rs.close();
					rs = null;
				}
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return check(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectTOTAL_ISSUE_QTY_SUM_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectTOTAL_ISSUE_QTY_SUM_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);
			boolean ret=true;

			try {
				if(rs.next()==false) return false;


				return ret;
			} finally {
				if (rs != null) {
					rs.close();
					rs = null;
				}
			}
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:SelectTOTAL_ISSUE_QTY_SUM_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:SelectTOTAL_ISSUE_QTY_SUM_clear

			return;
		}

		/**
		 * SelectTOTAL_ISSUE_QTY_SUMクラスの標準コンストラクタ
		 */
		public SelectTOTAL_ISSUE_QTY_SUM()
		{
			//{{user_implement_dev:SelectTOTAL_ISSUE_QTY_SUM_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:SelectTOTAL_ISSUE_QTY_SUM_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class checkIsLotManager extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = "select "
+"  M_ITEM.ITEM_CD as ITEM_CD "
+"from "
+"  M_ITEM "
+"where "
+"  M_ITEM.ITEM_CD = ? "
+"  and M_ITEM.LOT_CTRL_FLG = 1";
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:checkIsLotManager_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:checkIsLotManager_def

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return check(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:checkIsLotManager_check
			PreparedStatement stmt = prepare(conn, m_chkcmd, data);

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:checkIsLotManager_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);
			boolean ret=true;

			try {
				if(rs.next()==false) return false;


				return ret;
			} finally {
				if (rs != null) {
					rs.close();
					rs = null;
				}
			}
		}

		/**
		 * クエリーのprepare処理
		 *
		 * @return PreparedStatementインスタンスを返します
		 * @param conn Native Connectionインスタンス
		 * @param query SQL文字列
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query, AE0060020Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getITEM_CD());
				if(isNull(data.getITEM_CD())) isNull = true;

				// 静的SQL文の生成
				stmt = conn.prepareStatement(query);

			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * データ読出し処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getITEM_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:checkIsLotManager_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:checkIsLotManager_clear

			return;
		}

		/**
		 * checkIsLotManagerクラスの標準コンストラクタ
		 */
		public checkIsLotManager()
		{
			//{{user_implement_dev:checkIsLotManager_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:checkIsLotManager_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class getACPT_NO extends DataObject
	{
		protected String m_selcmd = "select "
+"  to_char(T_ACPT_RSLT.ACPT_NO), "
+"  to_char(T_ACPT_RSLT.ACPT_DATE, 'YYYY/MM/DD'), "
+"  to_char(T_ACPT_RSLT.ACPT_QTY) "
+"from "
+"  T_ACPT_RSLT "
+"where "
+"  T_ACPT_RSLT.PUCH_ODR_CD = ? "
+"order by "
+"  T_ACPT_RSLT.ACPT_NO";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:getACPT_NO_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:getACPT_NO_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStr);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStrs);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:getACPT_NO_read
			if(m_selcmd==null) throw new FoundationException("getACPT_NO", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:getACPT_NO_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:getACPT_NO_read2
			if(m_selcmd==null) throw new FoundationException("getACPT_NO", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStr);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:getACPT_NO_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:getACPT_NO_read3
			if(m_selcmd==null) throw new FoundationException("getACPT_NO", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStrs);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:getACPT_NO_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);

			try {
				List list=new ArrayList();

				while((data=next(rs))!=null) {
					list.add(data);
				}

				return list;
			} finally {
				rs.close();
				rs = null;
			}
		}

		/**
		 * クエリーのprepare処理
		 *
		 * @return PreparedStatementインスタンスを返します
		 * @param conn Native Connectionインスタンス
		 * @param query SQL文字列
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query, AE0060020Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getsetPUCH_ODR_CD());
				if(isNull(data.getsetPUCH_ODR_CD())) isNull = true;

				// 静的SQL文の生成
				stmt = conn.prepareStatement(query);

			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * データ読出し処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getsetPUCH_ODR_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0060020Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0060020Struct data = new AE0060020Struct();

			data.setreadACPT_NO( getString(1, rs) );
			data.setreadACPT_DATE( getString(2, rs) );
			data.setreadACPT_QTY( getString(3, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("getACPT_NO", "hasRecord", "クエリー未登録");

			ResultSet rs=null;
			PreparedStatement stmt=null;

			try {
				stmt = prepare(conn, m_selcmd, data);

				rs = stmt.executeQuery();

				return rs.next();
			} finally {
				if(rs != null) {
					rs.close();
					rs = null;
				}
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return check(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:getACPT_NO_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:getACPT_NO_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);
			boolean ret=true;

			try {
				if(rs.next()==false) return false;


				return ret;
			} finally {
				if (rs != null) {
					rs.close();
					rs = null;
				}
			}
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:getACPT_NO_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:getACPT_NO_clear

			return;
		}

		/**
		 * getACPT_NOクラスの標準コンストラクタ
		 */
		public getACPT_NO()
		{
			//{{user_implement_dev:getACPT_NO_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:getACPT_NO_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class getISSUE_INST_CD extends DataObject
	{
		protected String m_selcmd = "select "
+"  T_ISSUE_INST.ISSUE_INST_CD, "
+"  T_ISSUE_INST.ITEM_CD, "
+"  T_ISSUE_INST.PUCH_ODR_CD "
+"from "
+"  T_ISSUE_INST, "
+"  T_OD, "
+"  M_ITEM "
+"where "
+"  T_ISSUE_INST.OD_NO = T_OD.OD_NO(+) "
+"  and T_ISSUE_INST.ITEM_CD = M_ITEM.ITEM_CD(+) "
+"  and T_ISSUE_INST.PUCH_ODR_CD = ? "
+"  and T_ISSUE_INST.WH_CD IS NOT NULL "
+"  and(T_ISSUE_INST.ISSUE_TYP = 1 "
+"  or  T_ISSUE_INST.ISSUE_TYP = 2) "
+"  and T_ISSUE_INST.CONS_TYP != 0 "
+"  and M_ITEM.LOT_CTRL_FLG = 1 "
+"order by "
+"  T_ISSUE_INST.ISSUE_INST_CD, "
+"  T_ISSUE_INST.ITEM_CD";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:getISSUE_INST_CD_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:getISSUE_INST_CD_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStr);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStrs);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:getISSUE_INST_CD_read
			if(m_selcmd==null) throw new FoundationException("getISSUE_INST_CD", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:getISSUE_INST_CD_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:getISSUE_INST_CD_read2
			if(m_selcmd==null) throw new FoundationException("getISSUE_INST_CD", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStr);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:getISSUE_INST_CD_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:getISSUE_INST_CD_read3
			if(m_selcmd==null) throw new FoundationException("getISSUE_INST_CD", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStrs);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:getISSUE_INST_CD_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);

			try {
				List list=new ArrayList();

				while((data=next(rs))!=null) {
					list.add(data);
				}

				return list;
			} finally {
				rs.close();
				rs = null;
			}
		}

		/**
		 * クエリーのprepare処理
		 *
		 * @return PreparedStatementインスタンスを返します
		 * @param conn Native Connectionインスタンス
		 * @param query SQL文字列
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query, AE0060020Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getsetPUCH_ODR_CD());
				if(isNull(data.getsetPUCH_ODR_CD())) isNull = true;

				// 静的SQL文の生成
				stmt = conn.prepareStatement(query);

			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * データ読出し処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getsetPUCH_ODR_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0060020Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0060020Struct data = new AE0060020Struct();

			data.setreadISSUE_INST_CD( getString(1, rs) );
			data.setreadITEM_CD( getString(2, rs) );
			data.setreadPUCH_ODR_CD( getString(3, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("getISSUE_INST_CD", "hasRecord", "クエリー未登録");

			ResultSet rs=null;
			PreparedStatement stmt=null;

			try {
				stmt = prepare(conn, m_selcmd, data);

				rs = stmt.executeQuery();

				return rs.next();
			} finally {
				if(rs != null) {
					rs.close();
					rs = null;
				}
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return check(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:getISSUE_INST_CD_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:getISSUE_INST_CD_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);
			boolean ret=true;

			try {
				if(rs.next()==false) return false;


				return ret;
			} finally {
				if (rs != null) {
					rs.close();
					rs = null;
				}
			}
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:getISSUE_INST_CD_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:getISSUE_INST_CD_clear

			return;
		}

		/**
		 * getISSUE_INST_CDクラスの標準コンストラクタ
		 */
		public getISSUE_INST_CD()
		{
			//{{user_implement_dev:getISSUE_INST_CD_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:getISSUE_INST_CD_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class T_ISSUE_INST2 extends DataObject
	{
		protected String m_selcmd = "select "
+"  T_ISSUE_INST.ISSUE_INST_CD as ISSUE_INST_CD, "
+"  T_ISSUE_INST.PLANT_CD as PLANT_CD, "
+"  T_ISSUE_INST.OD_NO as OD_NO, "
+"  T_ISSUE_INST.ITEM_CD as ITEM_CD, "
+"  T_ISSUE_INST.PUCH_ODR_CD as PUCH_ODR_CD, "
+"  T_ISSUE_INST.COMPANY_CD as COMPANY_CD, "
+"  T_ISSUE_INST.VEND_CD as VEND_CD, "
+"  T_ISSUE_INST.CONS_TYP as CONS_TYP, "
+"  T_ISSUE_INST.ISSUE_INST_UNIT_DENOMINATOR as ISSUE_INST_UNIT_DENOMINATOR, "
+"  T_ISSUE_INST.ISSUE_INST_UNIT_NUMERATOR as ISSUE_INST_UNIT_NUMERATOR, "
+"  T_OD.JOB_ODR_CD as JOB_ODR_CD, "
+"  T_OD.JOB_ODR_DETAIL_NO as JOB_ODR_DETAIL_NO, "
+"  T_OD.MRP_ODR_TYP as MRP_ODR_TYP, "
+"  M_ITEM.UNIT_QTY_TYP as UNIT_QTY_TYP "
+"from "
+"  T_ISSUE_INST, "
+"  T_OD, "
+"  M_ITEM "
+"where "
+"  T_ISSUE_INST.OD_NO = T_OD.OD_NO(+) "
+"  and T_ISSUE_INST.ITEM_CD = M_ITEM.ITEM_CD(+) "
+"  and T_ISSUE_INST.PUCH_ODR_CD = ? "
+"  and T_ISSUE_INST.WH_CD IS NOT NULL "
+"  and(T_ISSUE_INST.ISSUE_TYP = 1 "
+"  or  T_ISSUE_INST.ISSUE_TYP = 2) "
+"  and T_ISSUE_INST.CONS_TYP != 0 "
+"  and M_ITEM.LOT_CTRL_FLG = 1";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:T_ISSUE_INST2_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:T_ISSUE_INST2_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStr);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStrs);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_ISSUE_INST2_read
			if(m_selcmd==null) throw new FoundationException("T_ISSUE_INST2", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:T_ISSUE_INST2_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_ISSUE_INST2_read2
			if(m_selcmd==null) throw new FoundationException("T_ISSUE_INST2", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStr);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:T_ISSUE_INST2_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_ISSUE_INST2_read3
			if(m_selcmd==null) throw new FoundationException("T_ISSUE_INST2", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStrs);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:T_ISSUE_INST2_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);

			try {
				List list=new ArrayList();

				while((data=next(rs))!=null) {
					list.add(data);
				}

				return list;
			} finally {
				rs.close();
				rs = null;
			}
		}

		/**
		 * クエリーのprepare処理
		 *
		 * @return PreparedStatementインスタンスを返します
		 * @param conn Native Connectionインスタンス
		 * @param query SQL文字列
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query, AE0060020Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getsetPUCH_ODR_CD());
				if(isNull(data.getsetPUCH_ODR_CD())) isNull = true;

				// 静的SQL文の生成
				stmt = conn.prepareStatement(query);

			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * データ読出し処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getsetPUCH_ODR_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0060020Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0060020Struct data = new AE0060020Struct();

			data.setreadISSUE_INST_CD( getString(1, rs) );
			data.setreadPLANT_CD( getString(2, rs) );
			data.setreadOD_NO( getString(3, rs) );
			data.setreadITEM_CD( getString(4, rs) );
			data.setreadPUCH_ODR_CD( getString(5, rs) );
			data.setreadCOMPANY_CD( getString(6, rs) );
			data.setreadVEND_CD( getString(7, rs) );
			data.setreadCONS_TYP( getString(8, rs) );
			data.setreadISSUE_INST_UNIT_DENOMINATOR( getString(9, rs) );
			data.setreadISSUE_INST_UNIT_NUMERATOR( getString(10, rs) );
			data.setreadJOB_ODR_CD( getString(11, rs) );
			data.setreadJOB_ODR_DETAIL_NO( getString(12, rs) );
			data.setreadMRP_ODR_TYP( getString(13, rs) );
			data.setreadUNIT_QTY_TYP( getString(14, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("T_ISSUE_INST2", "hasRecord", "クエリー未登録");

			ResultSet rs=null;
			PreparedStatement stmt=null;

			try {
				stmt = prepare(conn, m_selcmd, data);

				rs = stmt.executeQuery();

				return rs.next();
			} finally {
				if(rs != null) {
					rs.close();
					rs = null;
				}
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return check(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_ISSUE_INST2_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:T_ISSUE_INST2_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);
			boolean ret=true;

			try {
				if(rs.next()==false) return false;


				return ret;
			} finally {
				if (rs != null) {
					rs.close();
					rs = null;
				}
			}
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:T_ISSUE_INST2_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:T_ISSUE_INST2_clear

			return;
		}

		/**
		 * T_ISSUE_INST2クラスの標準コンストラクタ
		 */
		public T_ISSUE_INST2()
		{
			//{{user_implement_dev:T_ISSUE_INST2_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:T_ISSUE_INST2_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class bakT_LOT_USE_RSLT extends DataObject
	{
		protected String m_selcmd = "select "
+"  T_LOT_USE_RSLT.LOT_NO, "
+"  to_char(T_LOT_USE_RSLT.ACPT_NO), "
+"  to_char(T_LOT_USE_RSLT.TOTAL_ISSUE_QTY), "
+"  T_LOT_USE_RSLT.ITEM_CD, "
+"  T_LOT_USE_RSLT.ISSUE_INST_CD "
+"from "
+"  T_LOT_USE_RSLT, "
+"  T_PART_SUPPLIED_ISSUE, "
+"  T_LOT_CTRL "
+"where "
+"  T_LOT_USE_RSLT.PUCH_ODR_CD = ? "
+"  and T_LOT_USE_RSLT.PUCH_ODR_CD = T_PART_SUPPLIED_ISSUE.PUCH_ODR_CD "
+"  and T_LOT_USE_RSLT.ITEM_CD = T_PART_SUPPLIED_ISSUE.ITEM_CD "
+"  and T_LOT_USE_RSLT.ISSUE_INST_CD = T_PART_SUPPLIED_ISSUE.ISSUE_INST_CD "
+"  and T_LOT_USE_RSLT.ACPT_NO = T_PART_SUPPLIED_ISSUE.ACPT_NO "
+"  and T_LOT_USE_RSLT.ITEM_CD = T_LOT_CTRL.ITEM_CD "
+"  and T_LOT_USE_RSLT.LOT_NO = T_LOT_CTRL.LOT_NO "
+"order by "
+"  T_LOT_USE_RSLT.ACPT_NO";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:bakT_LOT_USE_RSLT_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:bakT_LOT_USE_RSLT_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStr);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStrs);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:bakT_LOT_USE_RSLT_read
			if(m_selcmd==null) throw new FoundationException("bakT_LOT_USE_RSLT", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:bakT_LOT_USE_RSLT_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:bakT_LOT_USE_RSLT_read2
			if(m_selcmd==null) throw new FoundationException("bakT_LOT_USE_RSLT", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStr);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:bakT_LOT_USE_RSLT_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:bakT_LOT_USE_RSLT_read3
			if(m_selcmd==null) throw new FoundationException("bakT_LOT_USE_RSLT", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStrs);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:bakT_LOT_USE_RSLT_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);

			try {
				List list=new ArrayList();

				while((data=next(rs))!=null) {
					list.add(data);
				}

				return list;
			} finally {
				rs.close();
				rs = null;
			}
		}

		/**
		 * クエリーのprepare処理
		 *
		 * @return PreparedStatementインスタンスを返します
		 * @param conn Native Connectionインスタンス
		 * @param query SQL文字列
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query, AE0060020Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getsetPUCH_ODR_CD());
				if(isNull(data.getsetPUCH_ODR_CD())) isNull = true;

				// 静的SQL文の生成
				stmt = conn.prepareStatement(query);

			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * データ読出し処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getsetPUCH_ODR_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0060020Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0060020Struct data = new AE0060020Struct();

			data.setreadLOT_NO( getString(1, rs) );
			data.setreadACPT_NO( getString(2, rs) );
			data.setreadTOTAL_ISSUE_QTY( getString(3, rs) );
			data.setreadITEM_CD( getString(4, rs) );
			data.setreadISSUE_INST_CD( getString(5, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("bakT_LOT_USE_RSLT", "hasRecord", "クエリー未登録");

			ResultSet rs=null;
			PreparedStatement stmt=null;

			try {
				stmt = prepare(conn, m_selcmd, data);

				rs = stmt.executeQuery();

				return rs.next();
			} finally {
				if(rs != null) {
					rs.close();
					rs = null;
				}
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return check(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:bakT_LOT_USE_RSLT_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:bakT_LOT_USE_RSLT_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);
			boolean ret=true;

			try {
				if(rs.next()==false) return false;


				return ret;
			} finally {
				if (rs != null) {
					rs.close();
					rs = null;
				}
			}
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:bakT_LOT_USE_RSLT_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:bakT_LOT_USE_RSLT_clear

			return;
		}

		/**
		 * bakT_LOT_USE_RSLTクラスの標準コンストラクタ
		 */
		public bakT_LOT_USE_RSLT()
		{
			//{{user_implement_dev:bakT_LOT_USE_RSLT_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:bakT_LOT_USE_RSLT_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class SelectT_LOT_USE_RSLT_LOT_NO2 extends DataObject
	{
		protected String m_selcmd = "select "
+"  T_LOT_USE_RSLT.LOT_NO, "
+"  to_char(T_LOT_USE_RSLT.TOTAL_ISSUE_QTY) "
+"from "
+"  T_LOT_USE_RSLT, "
+"  T_PART_SUPPLIED_ISSUE, "
+"  T_LOT_CTRL "
+"where "
+"  T_PART_SUPPLIED_ISSUE.PUCH_ODR_CD = ? "
+"  and T_PART_SUPPLIED_ISSUE.ACPT_NO = to_number(?) "
+"  and T_PART_SUPPLIED_ISSUE.ITEM_CD = ? "
+"  and T_PART_SUPPLIED_ISSUE.PUCH_ODR_CD = T_LOT_USE_RSLT.PUCH_ODR_CD "
+"  and T_PART_SUPPLIED_ISSUE.ACPT_NO = T_LOT_USE_RSLT.ACPT_NO "
+"  and T_PART_SUPPLIED_ISSUE.ITEM_CD = T_LOT_USE_RSLT.ITEM_CD "
+"  and T_PART_SUPPLIED_ISSUE.ITEM_CD = T_LOT_CTRL.ITEM_CD "
+"  and T_LOT_CTRL.LOT_NO = T_LOT_USE_RSLT.LOT_NO "
+"  and T_LOT_USE_RSLT.ISSUE_INST_CD is null";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SelectT_LOT_USE_RSLT_LOT_NO2_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:SelectT_LOT_USE_RSLT_LOT_NO2_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStr);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStrs);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectT_LOT_USE_RSLT_LOT_NO2_read
			if(m_selcmd==null) throw new FoundationException("SelectT_LOT_USE_RSLT_LOT_NO2", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectT_LOT_USE_RSLT_LOT_NO2_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectT_LOT_USE_RSLT_LOT_NO2_read2
			if(m_selcmd==null) throw new FoundationException("SelectT_LOT_USE_RSLT_LOT_NO2", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStr);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectT_LOT_USE_RSLT_LOT_NO2_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectT_LOT_USE_RSLT_LOT_NO2_read3
			if(m_selcmd==null) throw new FoundationException("SelectT_LOT_USE_RSLT_LOT_NO2", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStrs);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectT_LOT_USE_RSLT_LOT_NO2_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);

			try {
				List list=new ArrayList();

				while((data=next(rs))!=null) {
					list.add(data);
				}

				return list;
			} finally {
				rs.close();
				rs = null;
			}
		}

		/**
		 * クエリーのprepare処理
		 *
		 * @return PreparedStatementインスタンスを返します
		 * @param conn Native Connectionインスタンス
		 * @param query SQL文字列
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query, AE0060020Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getsetPUCH_ODR_CD());
				if(isNull(data.getsetPUCH_ODR_CD())) isNull = true;
				ary.addElement(data.getsetACPT_NO());
				if(isNull(data.getsetACPT_NO())) isNull = true;
				ary.addElement(data.getsetITEM_CD());
				if(isNull(data.getsetITEM_CD())) isNull = true;

				// 静的SQL文の生成
				stmt = conn.prepareStatement(query);

			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * データ読出し処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getsetPUCH_ODR_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getsetACPT_NO(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getsetITEM_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0060020Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0060020Struct data = new AE0060020Struct();

			data.setreadLOT_NO( getString(1, rs) );
			data.setreadTOTAL_ISSUE_QTY( getString(2, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SelectT_LOT_USE_RSLT_LOT_NO2", "hasRecord", "クエリー未登録");

			ResultSet rs=null;
			PreparedStatement stmt=null;

			try {
				stmt = prepare(conn, m_selcmd, data);

				rs = stmt.executeQuery();

				return rs.next();
			} finally {
				if(rs != null) {
					rs.close();
					rs = null;
				}
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return check(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectT_LOT_USE_RSLT_LOT_NO2_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectT_LOT_USE_RSLT_LOT_NO2_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);
			boolean ret=true;

			try {
				if(rs.next()==false) return false;


				return ret;
			} finally {
				if (rs != null) {
					rs.close();
					rs = null;
				}
			}
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:SelectT_LOT_USE_RSLT_LOT_NO2_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:SelectT_LOT_USE_RSLT_LOT_NO2_clear

			return;
		}

		/**
		 * SelectT_LOT_USE_RSLT_LOT_NO2クラスの標準コンストラクタ
		 */
		public SelectT_LOT_USE_RSLT_LOT_NO2()
		{
			//{{user_implement_dev:SelectT_LOT_USE_RSLT_LOT_NO2_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:SelectT_LOT_USE_RSLT_LOT_NO2_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class updateT_LOT_USE_RSLT3 extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = "update "
+"  T_LOT_USE_RSLT "
+"set "
+"  T_LOT_USE_RSLT.SUPPLIED_DATE = to_date(?, 'YYYY/MM/DD'), "
+"  T_LOT_USE_RSLT.TOTAL_ISSUE_QTY = to_number(?), "
+"  T_LOT_USE_RSLT.SUPPLIED_ISSUE_QTY = to_number(?), "
+"  T_LOT_USE_RSLT.PART_SUPPLIED_COMMENT = ? "
+"where "
+"  T_LOT_USE_RSLT.PUCH_ODR_CD = ? "
+"  and T_LOT_USE_RSLT.ACPT_NO = to_number(?) "
+"  and T_LOT_USE_RSLT.ITEM_CD = ? "
+"  and T_LOT_USE_RSLT.ISSUE_INST_CD is null";
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="AE0060020";
		protected String m_sUpdateProgramName="AE0060020";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:updateT_LOT_USE_RSLT3_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:updateT_LOT_USE_RSLT3_def

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return update(conn.getConn(), data);
		}

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt=null;
			int modifyCount;

			try {
				if("Oracle".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U(m_updcmd));
				} else if("Microsoft SQL Server".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U_MSSQL(m_updcmd));
				} else if("PostgreSQL".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U_PGSQL(m_updcmd));
				} else if("MySQL".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U_MYSQL(m_updcmd));
				} else {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U_DB2(m_updcmd));
				}

				setString(1, data.getsSysdate(), stmt);
				setString(2, data.getsUser_ID(), stmt);
				setString(3, m_sUpdateProgramName, stmt);
				setString(4, data.getsetSUPPLIED_DATE(), stmt);
				setString(5, data.getsetTOTAL_ISSUE_QTY(), stmt);
				setString(6, data.getsetSUPPLIED_ISSUE_QTY(), stmt);
				setString(7, data.getsetPART_SUPPLIED_COMMENT(), stmt);
				setString(8, data.getsetPUCH_ODR_CD(), stmt);
				setString(9, data.getsetACPT_NO(), stmt);
				setString(10, data.getsetITEM_CD(), stmt);

				return stmt.executeUpdate();
			} finally {
				if(stmt!=null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:updateT_LOT_USE_RSLT3_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:updateT_LOT_USE_RSLT3_clear

			return;
		}

		/**
		 * updateT_LOT_USE_RSLT3クラスの標準コンストラクタ
		 */
		public updateT_LOT_USE_RSLT3()
		{
			//{{user_implement_dev:updateT_LOT_USE_RSLT3_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:updateT_LOT_USE_RSLT3_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class updateT_LOT_USE_RSLT4 extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = "update "
+"  T_LOT_USE_RSLT "
+"set "
+"  T_LOT_USE_RSLT.SUPPLIED_DATE = to_date(?, 'YYYY/MM/DD'), "
+"  T_LOT_USE_RSLT.PART_SUPPLIED_COMMENT = ? "
+"where "
+"  T_LOT_USE_RSLT.PUCH_ODR_CD = ? "
+"  and T_LOT_USE_RSLT.ACPT_NO = to_number(?) "
+"  and T_LOT_USE_RSLT.ITEM_CD = ?";
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="AE0060020";
		protected String m_sUpdateProgramName="AE0060020";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:updateT_LOT_USE_RSLT4_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:updateT_LOT_USE_RSLT4_def

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return update(conn.getConn(), data);
		}

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt=null;
			int modifyCount;

			try {
				if("Oracle".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U(m_updcmd));
				} else if("Microsoft SQL Server".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U_MSSQL(m_updcmd));
				} else if("PostgreSQL".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U_PGSQL(m_updcmd));
				} else if("MySQL".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U_MYSQL(m_updcmd));
				} else {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U_DB2(m_updcmd));
				}

				setString(1, data.getsSysdate(), stmt);
				setString(2, data.getsUser_ID(), stmt);
				setString(3, m_sUpdateProgramName, stmt);
				setString(4, data.getsetSUPPLIED_DATE(), stmt);
				setString(5, data.getsetPART_SUPPLIED_COMMENT(), stmt);
				setString(6, data.getsetPUCH_ODR_CD(), stmt);
				setString(7, data.getsetACPT_NO(), stmt);
				setString(8, data.getsetITEM_CD(), stmt);

				return stmt.executeUpdate();
			} finally {
				if(stmt!=null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:updateT_LOT_USE_RSLT4_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:updateT_LOT_USE_RSLT4_clear

			return;
		}

		/**
		 * updateT_LOT_USE_RSLT4クラスの標準コンストラクタ
		 */
		public updateT_LOT_USE_RSLT4()
		{
			//{{user_implement_dev:updateT_LOT_USE_RSLT4_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:updateT_LOT_USE_RSLT4_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class checkT_LOT_USE_RSLT extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = "select "
+"  T_LOT_USE_RSLT.RSLT_CTL_SEQ_NO "
+"from "
+"  T_LOT_USE_RSLT "
+"where "
+"  T_LOT_USE_RSLT.PUCH_ODR_CD = ?";
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:checkT_LOT_USE_RSLT_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:checkT_LOT_USE_RSLT_def

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return check(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:checkT_LOT_USE_RSLT_check
			PreparedStatement stmt = prepare(conn, m_chkcmd, data);

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:checkT_LOT_USE_RSLT_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);
			boolean ret=true;

			try {
				if(rs.next()==false) return false;


				return ret;
			} finally {
				if (rs != null) {
					rs.close();
					rs = null;
				}
			}
		}

		/**
		 * クエリーのprepare処理
		 *
		 * @return PreparedStatementインスタンスを返します
		 * @param conn Native Connectionインスタンス
		 * @param query SQL文字列
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query, AE0060020Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getPUCH_ODR_CD());
				if(isNull(data.getPUCH_ODR_CD())) isNull = true;

				// 静的SQL文の生成
				stmt = conn.prepareStatement(query);

			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * データ読出し処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getPUCH_ODR_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:checkT_LOT_USE_RSLT_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:checkT_LOT_USE_RSLT_clear

			return;
		}

		/**
		 * checkT_LOT_USE_RSLTクラスの標準コンストラクタ
		 */
		public checkT_LOT_USE_RSLT()
		{
			//{{user_implement_dev:checkT_LOT_USE_RSLT_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:checkT_LOT_USE_RSLT_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class SYS_PARAMETER extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  SYS_PARAMETER.\"VALUE\" AS \"VALUE\" "
+"FROM "
+"  SYS_PARAMETER "
+"WHERE "
+"  SYS_PARAMETER.\"NAME\" = 'BEST_BEFORE_DATE_CHECK_FLG'";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SYS_PARAMETER_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:SYS_PARAMETER_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStr);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStrs);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SYS_PARAMETER_read
			if(m_selcmd==null) throw new FoundationException("SYS_PARAMETER", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SYS_PARAMETER_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SYS_PARAMETER_read2
			if(m_selcmd==null) throw new FoundationException("SYS_PARAMETER", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStr);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SYS_PARAMETER_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SYS_PARAMETER_read3
			if(m_selcmd==null) throw new FoundationException("SYS_PARAMETER", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStrs);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SYS_PARAMETER_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);

			try {
				List list=new ArrayList();

				while((data=next(rs))!=null) {
					list.add(data);
				}

				return list;
			} finally {
				rs.close();
				rs = null;
			}
		}

		/**
		 * クエリーのprepare処理
		 *
		 * @return PreparedStatementインスタンスを返します
		 * @param conn Native Connectionインスタンス
		 * @param query SQL文字列
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query, AE0060020Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {

				// 静的SQL文の生成
				stmt = conn.prepareStatement(query);

			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * データ読出し処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			int no=1;


			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0060020Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0060020Struct data = new AE0060020Struct();

			data.setBEST_BEFORE_DATE_CHECK_FLG( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SYS_PARAMETER", "hasRecord", "クエリー未登録");

			ResultSet rs=null;
			PreparedStatement stmt=null;

			try {
				stmt = prepare(conn, m_selcmd, data);

				rs = stmt.executeQuery();

				return rs.next();
			} finally {
				if(rs != null) {
					rs.close();
					rs = null;
				}
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return check(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SYS_PARAMETER_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SYS_PARAMETER_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);
			boolean ret=true;

			try {
				if(rs.next()==false) return false;


				return ret;
			} finally {
				if (rs != null) {
					rs.close();
					rs = null;
				}
			}
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:SYS_PARAMETER_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:SYS_PARAMETER_clear

			return;
		}

		/**
		 * SYS_PARAMETERクラスの標準コンストラクタ
		 */
		public SYS_PARAMETER()
		{
			//{{user_implement_dev:SYS_PARAMETER_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:SYS_PARAMETER_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class c_BESTBEFORE_DATE extends DataObject
	{
		protected String m_selcmd = "SELECT  "
+"  NVL(CASE WHEN TO_DATE(?,'YYYY/MM/DD') > T_LOT_CTRL.\"BEST_BEFORE_DATE\" "
+"  THEN '1' ELSE '0' END, 0) BBD_c_FLG "
+"FROM "
+"  T_LOT_CTRL, "
+"  M_ITEM "
+"WHERE "
+"  M_ITEM.ITEM_CD = T_LOT_CTRL.ITEM_CD "
+"  AND T_LOT_CTRL.\"LOT_NO\" = ? "
+"  AND T_LOT_CTRL.\"ITEM_CD\" = ? "
+"";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:c_BESTBEFORE_DATE_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:c_BESTBEFORE_DATE_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStr);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStrs);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:c_BESTBEFORE_DATE_read
			if(m_selcmd==null) throw new FoundationException("c_BESTBEFORE_DATE", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:c_BESTBEFORE_DATE_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:c_BESTBEFORE_DATE_read2
			if(m_selcmd==null) throw new FoundationException("c_BESTBEFORE_DATE", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStr);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:c_BESTBEFORE_DATE_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:c_BESTBEFORE_DATE_read3
			if(m_selcmd==null) throw new FoundationException("c_BESTBEFORE_DATE", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStrs);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:c_BESTBEFORE_DATE_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);

			try {
				List list=new ArrayList();

				while((data=next(rs))!=null) {
					list.add(data);
				}

				return list;
			} finally {
				rs.close();
				rs = null;
			}
		}

		/**
		 * クエリーのprepare処理
		 *
		 * @return PreparedStatementインスタンスを返します
		 * @param conn Native Connectionインスタンス
		 * @param query SQL文字列
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query, AE0060020Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getSUPPLIED_DATE());
				if(isNull(data.getSUPPLIED_DATE())) isNull = true;
				ary.addElement(data.getLOT_NO());
				if(isNull(data.getLOT_NO())) isNull = true;
				ary.addElement(data.getITEM_CD());
				if(isNull(data.getITEM_CD())) isNull = true;

				// 静的SQL文の生成
				stmt = conn.prepareStatement(query);

			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * データ読出し処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getSUPPLIED_DATE(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getLOT_NO(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getITEM_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0060020Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0060020Struct data = new AE0060020Struct();

			data.setBBD_c_FLG( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("c_BESTBEFORE_DATE", "hasRecord", "クエリー未登録");

			ResultSet rs=null;
			PreparedStatement stmt=null;

			try {
				stmt = prepare(conn, m_selcmd, data);

				rs = stmt.executeQuery();

				return rs.next();
			} finally {
				if(rs != null) {
					rs.close();
					rs = null;
				}
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return check(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:c_BESTBEFORE_DATE_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:c_BESTBEFORE_DATE_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);
			boolean ret=true;

			try {
				if(rs.next()==false) return false;


				return ret;
			} finally {
				if (rs != null) {
					rs.close();
					rs = null;
				}
			}
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:c_BESTBEFORE_DATE_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:c_BESTBEFORE_DATE_clear

			return;
		}

		/**
		 * c_BESTBEFORE_DATEクラスの標準コンストラクタ
		 */
		public c_BESTBEFORE_DATE()
		{
			//{{user_implement_dev:c_BESTBEFORE_DATE_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:c_BESTBEFORE_DATE_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class SelectLOT_NO extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  PUCH_ODR_CD, "
+"  LOT_NO "
+"FROM "
+"  T_ACPT_RSLT "
+"WHERE "
+"  PUCH_ODR_CD = ? "
+"  AND ACPT_NO = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SelectLOT_NO_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:SelectLOT_NO_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStr);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStrs);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectLOT_NO_read
			if(m_selcmd==null) throw new FoundationException("SelectLOT_NO", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectLOT_NO_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectLOT_NO_read2
			if(m_selcmd==null) throw new FoundationException("SelectLOT_NO", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStr);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectLOT_NO_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectLOT_NO_read3
			if(m_selcmd==null) throw new FoundationException("SelectLOT_NO", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStrs);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectLOT_NO_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);

			try {
				List list=new ArrayList();

				while((data=next(rs))!=null) {
					list.add(data);
				}

				return list;
			} finally {
				rs.close();
				rs = null;
			}
		}

		/**
		 * クエリーのprepare処理
		 *
		 * @return PreparedStatementインスタンスを返します
		 * @param conn Native Connectionインスタンス
		 * @param query SQL文字列
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query, AE0060020Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getPUCH_ODR_CD());
				if(isNull(data.getPUCH_ODR_CD())) isNull = true;
				ary.addElement(data.getw_ACPT_NO());
				if(isNull(data.getw_ACPT_NO())) isNull = true;

				// 静的SQL文の生成
				stmt = conn.prepareStatement(query);

			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * データ読出し処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getPUCH_ODR_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getw_ACPT_NO(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0060020Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0060020Struct data = new AE0060020Struct();

			data.setPUCH_ODR_CD( getString(1, rs) );
			data.setLOT_NO_PARENT( getString(2, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SelectLOT_NO", "hasRecord", "クエリー未登録");

			ResultSet rs=null;
			PreparedStatement stmt=null;

			try {
				stmt = prepare(conn, m_selcmd, data);

				rs = stmt.executeQuery();

				return rs.next();
			} finally {
				if(rs != null) {
					rs.close();
					rs = null;
				}
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return check(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectLOT_NO_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectLOT_NO_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);
			boolean ret=true;

			try {
				if(rs.next()==false) return false;


				return ret;
			} finally {
				if (rs != null) {
					rs.close();
					rs = null;
				}
			}
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:SelectLOT_NO_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:SelectLOT_NO_clear

			return;
		}

		/**
		 * SelectLOT_NOクラスの標準コンストラクタ
		 */
		public SelectLOT_NO()
		{
			//{{user_implement_dev:SelectLOT_NO_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:SelectLOT_NO_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class updateT_LOT_USE_RSLT2 extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = "update "
+"  T_LOT_USE_RSLT "
+"set "
+"  T_LOT_USE_RSLT.SUPPLIED_DATE = to_date(?, 'YYYY/MM/DD'), "
+"  T_LOT_USE_RSLT.TOTAL_ISSUE_QTY = to_number(?), "
+"  T_LOT_USE_RSLT.SUPPLIED_ISSUE_QTY = to_number(?), "
+"  T_LOT_USE_RSLT.PART_SUPPLIED_COMMENT = ? "
+"where "
+"  T_LOT_USE_RSLT.PUCH_ODR_CD = ? "
+"  and T_LOT_USE_RSLT.ACPT_NO = to_number(?) "
+"  and T_LOT_USE_RSLT.ITEM_CD = ? "
+"  and T_LOT_USE_RSLT.LOT_NO = ?";
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="AE0060020";
		protected String m_sUpdateProgramName="AE0060020";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:updateT_LOT_USE_RSLT2_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:updateT_LOT_USE_RSLT2_def

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return update(conn.getConn(), data);
		}

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt=null;
			int modifyCount;

			try {
				if("Oracle".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U(m_updcmd));
				} else if("Microsoft SQL Server".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U_MSSQL(m_updcmd));
				} else if("PostgreSQL".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U_PGSQL(m_updcmd));
				} else if("MySQL".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U_MYSQL(m_updcmd));
				} else {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U_DB2(m_updcmd));
				}

				setString(1, data.getsSysdate(), stmt);
				setString(2, data.getsUser_ID(), stmt);
				setString(3, m_sUpdateProgramName, stmt);
				setString(4, data.getsetSUPPLIED_DATE(), stmt);
				setString(5, data.getsetTOTAL_ISSUE_QTY(), stmt);
				setString(6, data.getsetSUPPLIED_ISSUE_QTY(), stmt);
				setString(7, data.getsetPART_SUPPLIED_COMMENT(), stmt);
				setString(8, data.getsetPUCH_ODR_CD(), stmt);
				setString(9, data.getsetACPT_NO(), stmt);
				setString(10, data.getsetITEM_CD(), stmt);
				setString(11, data.getsetLOT_NO(), stmt);

				return stmt.executeUpdate();
			} finally {
				if(stmt!=null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:updateT_LOT_USE_RSLT2_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:updateT_LOT_USE_RSLT2_clear

			return;
		}

		/**
		 * updateT_LOT_USE_RSLT2クラスの標準コンストラクタ
		 */
		public updateT_LOT_USE_RSLT2()
		{
			//{{user_implement_dev:updateT_LOT_USE_RSLT2_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:updateT_LOT_USE_RSLT2_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class T_OD extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  T_RLSD_PUCH_ODR.OD_NO, "
+"  T_OD.ODR_QTY, "
+"  T_RLSD_PUCH_ODR.PUCH_ODR_QTY "
+"FROM "
+"  T_OD, "
+"  T_RLSD_PUCH_ODR "
+"WHERE "
+"  T_RLSD_PUCH_ODR.OD_NO = T_OD.OD_NO "
+"  AND T_RLSD_PUCH_ODR.PUCH_ODR_CD = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = "UPDATE "
+"  T_OD "
+"SET "
+"  T_OD.ODR_QTY = ? "
+"WHERE "
+"  T_OD.OD_NO = ?";
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="AE0060020";
		protected String m_sUpdateProgramName="AE0060020";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:T_OD_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:T_OD_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStr);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStrs);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_OD_read
			if(m_selcmd==null) throw new FoundationException("T_OD", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:T_OD_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_OD_read2
			if(m_selcmd==null) throw new FoundationException("T_OD", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStr);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:T_OD_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_OD_read3
			if(m_selcmd==null) throw new FoundationException("T_OD", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStrs);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:T_OD_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);

			try {
				List list=new ArrayList();

				while((data=next(rs))!=null) {
					list.add(data);
				}

				return list;
			} finally {
				rs.close();
				rs = null;
			}
		}

		/**
		 * クエリーのprepare処理
		 *
		 * @return PreparedStatementインスタンスを返します
		 * @param conn Native Connectionインスタンス
		 * @param query SQL文字列
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query, AE0060020Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getPUCH_ODR_CD());
				if(isNull(data.getPUCH_ODR_CD())) isNull = true;

				// 静的SQL文の生成
				stmt = conn.prepareStatement(query);

			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * データ読出し処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getPUCH_ODR_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0060020Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0060020Struct data = new AE0060020Struct();

			data.setOD_NO( getString(1, rs) );
			data.setODR_QTY( getString(2, rs) );
			data.setPUCH_ODR_QTY( getString(3, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("T_OD", "hasRecord", "クエリー未登録");

			ResultSet rs=null;
			PreparedStatement stmt=null;

			try {
				stmt = prepare(conn, m_selcmd, data);

				rs = stmt.executeQuery();

				return rs.next();
			} finally {
				if(rs != null) {
					rs.close();
					rs = null;
				}
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return check(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_OD_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:T_OD_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);
			boolean ret=true;

			try {
				if(rs.next()==false) return false;


				return ret;
			} finally {
				if (rs != null) {
					rs.close();
					rs = null;
				}
			}
		}
		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return update(conn.getConn(), data);
		}

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt=null;
			int modifyCount;

			try {
				if("Oracle".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U(m_updcmd));
				} else if("Microsoft SQL Server".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U_MSSQL(m_updcmd));
				} else if("PostgreSQL".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U_PGSQL(m_updcmd));
				} else if("MySQL".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U_MYSQL(m_updcmd));
				} else {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U_DB2(m_updcmd));
				}

				setString(1, data.getsSysdate(), stmt);
				setString(2, data.getsUser_ID(), stmt);
				setString(3, m_sUpdateProgramName, stmt);
				setString(4, data.getODR_QTY(), stmt);
				setString(5, data.getOD_NO(), stmt);

				return stmt.executeUpdate();
			} finally {
				if(stmt!=null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:T_OD_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:T_OD_clear

			return;
		}

		/**
		 * T_ODクラスの標準コンストラクタ
		 */
		public T_OD()
		{
			//{{user_implement_dev:T_OD_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:T_OD_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class SYS_BAT_PARM extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  SYS_BAT_PARM.\"PROGRAM_CD\" AS \"PROGRAM_CD\", "
+"  SYS_BAT_PARM.\"FILE_PATH\" AS \"FILE_PATH\", "
+"  SYS_BAT_PARM.\"FILE_NAME\" AS \"FILE_NAME\", "
+"  SYS_BAT_PARM.\"LOG_MODE_TYP\" AS \"LOG_MODE_TYP\", "
+"  SYS_BAT_PARM.\"OUTPUT_MODE_TYP\" AS \"OUTPUT_MODE_TYP\" "
+"FROM "
+"  SYS_BAT_PARM "
+"WHERE "
+"  SYS_BAT_PARM.\"PROGRAM_CD\" = 'AE0060020' "
+"  AND SYS_BAT_PARM.\"FUNCTION_NAME\" = 'SQLCALCTAXCALCAMT'";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SYS_BAT_PARM_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:SYS_BAT_PARM_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStr);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStrs);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SYS_BAT_PARM_read
			if(m_selcmd==null) throw new FoundationException("SYS_BAT_PARM", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SYS_BAT_PARM_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SYS_BAT_PARM_read2
			if(m_selcmd==null) throw new FoundationException("SYS_BAT_PARM", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStr);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SYS_BAT_PARM_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SYS_BAT_PARM_read3
			if(m_selcmd==null) throw new FoundationException("SYS_BAT_PARM", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStrs);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SYS_BAT_PARM_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);

			try {
				List list=new ArrayList();

				while((data=next(rs))!=null) {
					list.add(data);
				}

				return list;
			} finally {
				rs.close();
				rs = null;
			}
		}

		/**
		 * クエリーのprepare処理
		 *
		 * @return PreparedStatementインスタンスを返します
		 * @param conn Native Connectionインスタンス
		 * @param query SQL文字列
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query, AE0060020Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {

				// 静的SQL文の生成
				stmt = conn.prepareStatement(query);

			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * データ読出し処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			int no=1;


			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0060020Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0060020Struct data = new AE0060020Struct();

			data.setPVC2BUSINESSNAME( getString(1, rs) );
			data.setPVC2OUTPUTPATH( getString(2, rs) );
			data.setPVC2OUTPUTNAME( getString(3, rs) );
			data.setPVC2LOGMODE( getString(4, rs) );
			data.setPVC2OUTPUTMODE( getString(5, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SYS_BAT_PARM", "hasRecord", "クエリー未登録");

			ResultSet rs=null;
			PreparedStatement stmt=null;

			try {
				stmt = prepare(conn, m_selcmd, data);

				rs = stmt.executeQuery();

				return rs.next();
			} finally {
				if(rs != null) {
					rs.close();
					rs = null;
				}
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return check(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SYS_BAT_PARM_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SYS_BAT_PARM_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);
			boolean ret=true;

			try {
				if(rs.next()==false) return false;


				return ret;
			} finally {
				if (rs != null) {
					rs.close();
					rs = null;
				}
			}
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:SYS_BAT_PARM_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:SYS_BAT_PARM_clear

			return;
		}

		/**
		 * SYS_BAT_PARMクラスの標準コンストラクタ
		 */
		public SYS_BAT_PARM()
		{
			//{{user_implement_dev:SYS_BAT_PARM_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:SYS_BAT_PARM_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class callSQLCALCTAXCALCAMT extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = "{" + "call SQLCALCTAXCALCAMT(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)" + "}";



		//////////////////////////////

		//{{user_implement_dev:callSQLCALCTAXCALCAMT_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:callSQLCALCTAXCALCAMT_def

		/**
		 * Stored Procudure処理
		 *
		 * @return Listインスタンスで実行結果を返します
		 * @param IDbConnection
		 * @param AE0060020Struct
		 * @exception FoundationException, SQLException
		 */
		public List call(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:callSQLCALCTAXCALCAMT_call_storedproc
				// todo: Stored Procedure実行時の処理を記述してください
			return call(conn.getConn(), data);
                        //}}user_implement_dev:callSQLCALCTAXCALCAMT_call_storedproc
		}

		/**
		 * Stored Procudure処理
		 *
		 * @return Listインスタンスで実行結果を返します
		 * @param Connection
		 * @param AE0060020Struct
		 * @exception FoundationException, SQLException
		 */
		public List call(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			CallableStatement cstmt = null;

			try {
				cstmt = conn.prepareCall(m_spcmd);

				setString(1, data.getPVC2LOGMODE(), cstmt);
				setString(2, data.getPVC2OUTPUTMODE(), cstmt);
				setString(3, data.getPVC2OUTPUTPATH(), cstmt);
				setString(4, data.getPVC2OUTPUTNAME(), cstmt);
				setString(5, data.getPVC2USERID(), cstmt);
				setString(6, data.getPVC2BUSINESSNAME(), cstmt);
				setString(7, data.getPVC2PLANTCD(), cstmt);
				setString(8, data.getPVC2TAXID(), cstmt);
				setString(9, data.getTAX_RATE_1(), cstmt);
				setString(10, data.getTAX_RATE_2(), cstmt);
				setString(11, data.getTAX_RATE_3(), cstmt);
				setString(12, data.getTAX_ROUND_TYP(), cstmt);
				setString(13, data.getVEND_DECIMAL_FIG(), cstmt);
				setString(14, data.getNET_AMOUNT(), cstmt);

				registerOutParameterString(15, cstmt);
				registerOutParameterString(16, cstmt);
				registerOutParameterString(17, cstmt);
				registerOutParameterString(18, cstmt);
				registerOutParameterString(19, cstmt);
				registerOutParameterString(20, cstmt);
				registerOutParameterString(21, cstmt);
				registerOutParameterString(22, cstmt);
				registerOutParameterString(23, cstmt);
				registerOutParameterString(24, cstmt);
				registerOutParameterString(25, cstmt);
				registerOutParameterString(26, cstmt);
				registerOutParameterString(27, cstmt);

				cstmt.execute();
				List list = new ArrayList();
				ResultSet rs = cstmt.getResultSet();
				if(rs != null) {
					while((data=call(rs)) != null) {
						list.add(data);
					}
				} else {
					data.setTAX_AMOUNT_1( getString(15, cstmt) );
					data.setTAX_AMOUNT_2( getString(16, cstmt) );
					data.setTAX_AMOUNT_3( getString(17, cstmt) );
					data.setPNUMTAXOUTAMOUNT( getString(18, cstmt) );
					data.setPNUMTAXAMOUNT( getString(19, cstmt) );
					data.setAMOUNT_INCLUDE_TAX( getString(20, cstmt) );
					data.setPNUMEXTERNALTAXSALESAMOUNT( getString(21, cstmt) );
					data.setPNUMINTERNALTAXSALESAMOUNT( getString(22, cstmt) );
					data.setPNUMTAXFREESALESAMOUNT( getString(23, cstmt) );
					data.setPNUMEXTERNALTAXAMOUNT( getString(24, cstmt) );
					data.setPNUMINTERNALTAXAMOUNT( getString(25, cstmt) );
					data.setPVC2ERRCD( getString(26, cstmt) );
					data.setPNUMSTATUS( getString(27, cstmt) );
					list.add(data);
				}

				return list;
			} finally {
				if(cstmt!=null) {
					cstmt.close();
					cstmt = null;
				}
			}
		}

		/**
		 * Stored Procudure処理
		 *
		 * @return AE0060020Structインスタンスで実行結果を返します
		 * @param ResultSet
		 * @exception FoundationException, SQLException
		 */
		public AE0060020Struct call(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs == null || rs.next()==false) return null;
			AE0060020Struct data = new AE0060020Struct();
			data.setTAX_AMOUNT_1( getString(15, rs) );
			data.setTAX_AMOUNT_2( getString(16, rs) );
			data.setTAX_AMOUNT_3( getString(17, rs) );
			data.setPNUMTAXOUTAMOUNT( getString(18, rs) );
			data.setPNUMTAXAMOUNT( getString(19, rs) );
			data.setAMOUNT_INCLUDE_TAX( getString(20, rs) );
			data.setPNUMEXTERNALTAXSALESAMOUNT( getString(21, rs) );
			data.setPNUMINTERNALTAXSALESAMOUNT( getString(22, rs) );
			data.setPNUMTAXFREESALESAMOUNT( getString(23, rs) );
			data.setPNUMEXTERNALTAXAMOUNT( getString(24, rs) );
			data.setPNUMINTERNALTAXAMOUNT( getString(25, rs) );
			data.setPVC2ERRCD( getString(26, rs) );
			data.setPNUMSTATUS( getString(27, rs) );
			return data;
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:callSQLCALCTAXCALCAMT_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:callSQLCALCTAXCALCAMT_clear

			return;
		}

		/**
		 * callSQLCALCTAXCALCAMTクラスの標準コンストラクタ
		 */
		public callSQLCALCTAXCALCAMT()
		{
			//{{user_implement_dev:callSQLCALCTAXCALCAMT_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:callSQLCALCTAXCALCAMT_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class ViewCnt extends DataObject
	{
		protected String m_selcmd = "select "
+"  count(1) "
+"from "
+"  T_ACPT_RSLT, "
+"  T_RLSD_PUCH_ODR, "
+"  M_ITEM, "
+"  M_VEND_CTRL, "
+"  M_WH, "
+"  M_CUR, "
+"  SYS_HOME_CUR "
+"where "
+"  T_RLSD_PUCH_ODR.PUCH_ODR_CD = T_ACPT_RSLT.PUCH_ODR_CD "
+"  and T_RLSD_PUCH_ODR.ITEM_CD = M_ITEM.ITEM_CD(+) "
+"  and T_RLSD_PUCH_ODR.COMPANY_CD = M_VEND_CTRL.COMPANY_CD(+) "
+"  and T_RLSD_PUCH_ODR.VEND_CD = M_VEND_CTRL.VEND_CD(+) "
+"  and M_CUR.CUR_CD = nvl(M_VEND_CTRL.CUR_CD, SYS_HOME_CUR.HOME_CUR_CD) "
+"  and SYS_HOME_CUR.CTRL_CD = 'SYSTEM' "
+"  and T_ACPT_RSLT.WH_CD = M_WH.WH_CD(+) "
+"  and T_ACPT_RSLT.PUCH_ODR_CD = ? "
+"  and ROWNUM <= NVL(TO_NUMBER(?), ROWNUM) + 1";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:ViewCnt_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:ViewCnt_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStr);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStrs);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:ViewCnt_read
			if(m_selcmd==null) throw new FoundationException("ViewCnt", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:ViewCnt_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:ViewCnt_read2
			if(m_selcmd==null) throw new FoundationException("ViewCnt", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStr);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:ViewCnt_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:ViewCnt_read3
			if(m_selcmd==null) throw new FoundationException("ViewCnt", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStrs);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:ViewCnt_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);

			try {
				List list=new ArrayList();

				while((data=next(rs))!=null) {
					list.add(data);
				}

				return list;
			} finally {
				rs.close();
				rs = null;
			}
		}

		/**
		 * クエリーのprepare処理
		 *
		 * @return PreparedStatementインスタンスを返します
		 * @param conn Native Connectionインスタンス
		 * @param query SQL文字列
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query, AE0060020Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getPUCH_ODR_CD());
				if(isNull(data.getPUCH_ODR_CD())) isNull = true;
				ary.addElement(data.getROW_COUNT());
				if(isNull(data.getROW_COUNT())) isNull = true;

				// 静的SQL文の生成
				stmt = conn.prepareStatement(query);

			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * データ読出し処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getPUCH_ODR_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getROW_COUNT(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0060020Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0060020Struct data = new AE0060020Struct();

			data.setl_COUNT( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("ViewCnt", "hasRecord", "クエリー未登録");

			ResultSet rs=null;
			PreparedStatement stmt=null;

			try {
				stmt = prepare(conn, m_selcmd, data);

				rs = stmt.executeQuery();

				return rs.next();
			} finally {
				if(rs != null) {
					rs.close();
					rs = null;
				}
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return check(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:ViewCnt_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:ViewCnt_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);
			boolean ret=true;

			try {
				if(rs.next()==false) return false;


				return ret;
			} finally {
				if (rs != null) {
					rs.close();
					rs = null;
				}
			}
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:ViewCnt_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:ViewCnt_clear

			return;
		}

		/**
		 * ViewCntクラスの標準コンストラクタ
		 */
		public ViewCnt()
		{
			//{{user_implement_dev:ViewCnt_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:ViewCnt_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class SelectSuppliedCnt extends DataObject
	{
		protected String m_selcmd = "select "
+"  count(1) "
+"from "
+"  T_PART_SUPPLIED_ISSUE, "
+"  M_ITEM, "
+"  T_LOT_USE_RSLT "
+"where "
+"  T_PART_SUPPLIED_ISSUE.ITEM_CD = M_ITEM.ITEM_CD "
+"  and T_PART_SUPPLIED_ISSUE.PUCH_ODR_CD = ? "
+"  and T_PART_SUPPLIED_ISSUE.ACPT_NO = ? "
+"  and T_PART_SUPPLIED_ISSUE.ITEM_CD = T_LOT_USE_RSLT.ITEM_CD(+) "
+"  and T_PART_SUPPLIED_ISSUE.PUCH_ODR_CD = T_LOT_USE_RSLT.PUCH_ODR_CD(+) "
+"  and T_PART_SUPPLIED_ISSUE.ACPT_NO = T_LOT_USE_RSLT.ACPT_NO(+) "
+"  and ROWNUM <= TO_NUMBER(?) + 1";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SelectSuppliedCnt_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:SelectSuppliedCnt_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStr);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStrs);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectSuppliedCnt_read
			if(m_selcmd==null) throw new FoundationException("SelectSuppliedCnt", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectSuppliedCnt_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectSuppliedCnt_read2
			if(m_selcmd==null) throw new FoundationException("SelectSuppliedCnt", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStr);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectSuppliedCnt_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectSuppliedCnt_read3
			if(m_selcmd==null) throw new FoundationException("SelectSuppliedCnt", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStrs);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectSuppliedCnt_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);

			try {
				List list=new ArrayList();

				while((data=next(rs))!=null) {
					list.add(data);
				}

				return list;
			} finally {
				if (rs != null) {
					rs.close();
					rs = null;
				}
			}
		}

		/**
		 * クエリーのprepare処理
		 *
		 * @return PreparedStatementインスタンスを返します
		 * @param conn Native Connectionインスタンス
		 * @param query SQL文字列
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query, AE0060020Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getPUCH_ODR_CD());
				if(isNull(data.getPUCH_ODR_CD())) isNull = true;
				ary.addElement(data.getl_ACPT_NO());
				if(isNull(data.getl_ACPT_NO())) isNull = true;
				ary.addElement(data.getROW_COUNT());
				if(isNull(data.getROW_COUNT())) isNull = true;

				//動的SQL生成ロジック
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("SelectSuppliedCnt", "prepare", "Parse失敗:"+e.toString());
			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * データ読出し処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//動的SQL生成ロジック
			if(!isNull(data.getPUCH_ODR_CD())) setString(no ++, data.getPUCH_ODR_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getl_ACPT_NO())) setString(no ++, data.getl_ACPT_NO(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getROW_COUNT())) setString(no ++, data.getROW_COUNT(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0060020Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0060020Struct data = new AE0060020Struct();

			data.setl_COUNT( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SelectSuppliedCnt", "hasRecord", "クエリー未登録");

			ResultSet rs=null;
			PreparedStatement stmt=null;

			try {
				stmt = prepare(conn, m_selcmd, data);

				rs = stmt.executeQuery();

				return rs.next();
			} finally {
				if (rs != null) {
					rs.close();
					rs = null;
				}
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return check(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectSuppliedCnt_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);;

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectSuppliedCnt_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);
			boolean ret=true;

			try {
				if(rs.next()==false) return false;


				return ret;
			} finally {
				if (rs != null) {
					rs.close();
					rs = null;
				}
			}
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:SelectSuppliedCnt_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:SelectSuppliedCnt_clear

			return;
		}

		/**
		 * SelectSuppliedCntクラスの標準コンストラクタ
		 */
		public SelectSuppliedCnt()
		{
			//{{user_implement_dev:SelectSuppliedCnt_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:SelectSuppliedCnt_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class lockT_ITEM_STOCK extends DataObject
	{
		protected String m_selcmd = "select "
+"  T_ITEM_STOCK.STOCK_ON_HAND_QTY as STOCK_ON_HAND_QTY "
+"from "
+"  T_ITEM_STOCK "
+"where "
+"  T_ITEM_STOCK.ITEM_CD = ? "
+"  and T_ITEM_STOCK.PLANT_CD = ? "
+"  and T_ITEM_STOCK.WH_CD = ? "
+"for update nowait";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:lockT_ITEM_STOCK_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:lockT_ITEM_STOCK_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStr);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStrs);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:lockT_ITEM_STOCK_read
			if(m_selcmd==null) throw new FoundationException("lockT_ITEM_STOCK", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:lockT_ITEM_STOCK_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:lockT_ITEM_STOCK_read2
			if(m_selcmd==null) throw new FoundationException("lockT_ITEM_STOCK", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStr);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:lockT_ITEM_STOCK_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:lockT_ITEM_STOCK_read3
			if(m_selcmd==null) throw new FoundationException("lockT_ITEM_STOCK", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStrs);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:lockT_ITEM_STOCK_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);

			try {
				List list=new ArrayList();

				while((data=next(rs))!=null) {
					list.add(data);
				}

				return list;
			} finally {
				rs.close();
				rs = null;
			}
		}

		/**
		 * クエリーのprepare処理
		 *
		 * @return PreparedStatementインスタンスを返します
		 * @param conn Native Connectionインスタンス
		 * @param query SQL文字列
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query, AE0060020Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getsetITEM_CD());
				if(isNull(data.getsetITEM_CD())) isNull = true;
				ary.addElement(data.getsetPLANT_CD());
				if(isNull(data.getsetPLANT_CD())) isNull = true;
				ary.addElement(data.getsetWH_CD());
				if(isNull(data.getsetWH_CD())) isNull = true;

				// 静的SQL文の生成
				stmt = conn.prepareStatement(query);

			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * データ読出し処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getsetITEM_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getsetPLANT_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getsetWH_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0060020Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0060020Struct data = new AE0060020Struct();

			data.setSEL_STOCK_ON_HAND_QTY( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("lockT_ITEM_STOCK", "hasRecord", "クエリー未登録");

			ResultSet rs=null;
			PreparedStatement stmt=null;

			try {
				stmt = prepare(conn, m_selcmd, data);

				rs = stmt.executeQuery();

				return rs.next();
			} finally {
				if(rs != null) {
					rs.close();
					rs = null;
				}
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return check(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:lockT_ITEM_STOCK_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:lockT_ITEM_STOCK_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);
			boolean ret=true;

			try {
				if(rs.next()==false) return false;


				return ret;
			} finally {
				if (rs != null) {
					rs.close();
					rs = null;
				}
			}
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:lockT_ITEM_STOCK_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:lockT_ITEM_STOCK_clear

			return;
		}

		/**
		 * lockT_ITEM_STOCKクラスの標準コンストラクタ
		 */
		public lockT_ITEM_STOCK()
		{
			//{{user_implement_dev:lockT_ITEM_STOCK_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:lockT_ITEM_STOCK_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class updateT_LOT_TRACE extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = "UPDATE "
+"  T_LOT_TRACE "
+"SET "
+"  T_LOT_TRACE.FROM_PUCH_ODR_CD = ?, "
+"  T_LOT_TRACE.TO_PUCH_ODR_CD = ? "
+"WHERE "
+"  T_LOT_TRACE.FROM_ITEM_CD = ? "
+"  AND T_LOT_TRACE.FROM_LOT_NO = ? "
+"  AND T_LOT_TRACE.TO_ITEM_CD = ? "
+"  AND T_LOT_TRACE.TO_LOT_NO = ? "
+"  AND T_LOT_TRACE.LOT_TRACE_TYP = 1";
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="AE0060020";
		protected String m_sUpdateProgramName="AE0060020";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:updateT_LOT_TRACE_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:updateT_LOT_TRACE_def

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return update(conn.getConn(), data);
		}

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt=null;
			int modifyCount;

			try {
				if("Oracle".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U(m_updcmd));
				} else if("Microsoft SQL Server".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U_MSSQL(m_updcmd));
				} else if("PostgreSQL".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U_PGSQL(m_updcmd));
				} else if("MySQL".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U_MYSQL(m_updcmd));
				} else {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U_DB2(m_updcmd));
				}

				setString(1, data.getsSysdate(), stmt);
				setString(2, data.getsUser_ID(), stmt);
				setString(3, m_sUpdateProgramName, stmt);
				setString(4, data.getFROM_PUCH_ODR_CD(), stmt);
				setString(5, data.getTO_PUCH_ODR_CD(), stmt);
				setString(6, data.getFROM_ITEM_CD(), stmt);
				setString(7, data.getFROM_LOT_NO(), stmt);
				setString(8, data.getTO_ITEM_CD(), stmt);
				setString(9, data.getTO_LOT_NO(), stmt);

				return stmt.executeUpdate();
			} finally {
				if(stmt!=null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:updateT_LOT_TRACE_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:updateT_LOT_TRACE_clear

			return;
		}

		/**
		 * updateT_LOT_TRACEクラスの標準コンストラクタ
		 */
		public updateT_LOT_TRACE()
		{
			//{{user_implement_dev:updateT_LOT_TRACE_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:updateT_LOT_TRACE_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class getFROM_PUCH_ODR_CD extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  T_ACPT_RSLT.PUCH_ODR_CD "
+"FROM "
+"  T_ACPT_RSLT "
+"WHERE "
+"  T_ACPT_RSLT.ITEM_CD = ? "
+"  AND T_ACPT_RSLT.LOT_NO = ? "
+"ORDER BY "
+"  PUCH_ODR_CD DESC, "
+"  ACPT_NO DESC";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:getFROM_PUCH_ODR_CD_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:getFROM_PUCH_ODR_CD_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStr);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060020Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStrs);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:getFROM_PUCH_ODR_CD_read
			if(m_selcmd==null) throw new FoundationException("getFROM_PUCH_ODR_CD", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:getFROM_PUCH_ODR_CD_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:getFROM_PUCH_ODR_CD_read2
			if(m_selcmd==null) throw new FoundationException("getFROM_PUCH_ODR_CD", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStr);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:getFROM_PUCH_ODR_CD_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060020Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:getFROM_PUCH_ODR_CD_read3
			if(m_selcmd==null) throw new FoundationException("getFROM_PUCH_ODR_CD", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStrs);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:getFROM_PUCH_ODR_CD_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);

			try {
				List list=new ArrayList();

				while((data=next(rs))!=null) {
					list.add(data);
				}

				return list;
			} finally {
				rs.close();
				rs = null;
			}
		}

		/**
		 * クエリーのprepare処理
		 *
		 * @return PreparedStatementインスタンスを返します
		 * @param conn Native Connectionインスタンス
		 * @param query SQL文字列
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query, AE0060020Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getFROM_ITEM_CD());
				if(isNull(data.getFROM_ITEM_CD())) isNull = true;
				ary.addElement(data.getFROM_LOT_NO());
				if(isNull(data.getFROM_LOT_NO())) isNull = true;

				// 静的SQL文の生成
				stmt = conn.prepareStatement(query);

			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * データ読出し処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getFROM_ITEM_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getFROM_LOT_NO(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0060020Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0060020Struct data = new AE0060020Struct();

			data.setFROM_PUCH_ODR_CD( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("getFROM_PUCH_ODR_CD", "hasRecord", "クエリー未登録");

			ResultSet rs=null;
			PreparedStatement stmt=null;

			try {
				stmt = prepare(conn, m_selcmd, data);

				rs = stmt.executeQuery();

				return rs.next();
			} finally {
				if(rs != null) {
					rs.close();
					rs = null;
				}
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(IDbConnection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			return check(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(Connection conn, AE0060020Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:getFROM_PUCH_ODR_CD_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:getFROM_PUCH_ODR_CD_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0060020Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);
			boolean ret=true;

			try {
				if(rs.next()==false) return false;


				return ret;
			} finally {
				if (rs != null) {
					rs.close();
					rs = null;
				}
			}
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:getFROM_PUCH_ODR_CD_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:getFROM_PUCH_ODR_CD_clear

			return;
		}

		/**
		 * getFROM_PUCH_ODR_CDクラスの標準コンストラクタ
		 */
		public getFROM_PUCH_ODR_CD()
		{
			//{{user_implement_dev:getFROM_PUCH_ODR_CD_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:getFROM_PUCH_ODR_CD_constractor

			return;
		}
	}

	// null文字列、空白文字列の場合にtrueを返します
	public boolean isNull(Object obj) { return (obj==null || obj.toString().length()==0 ? true : false); }

	/**
	 * クリーンナップ用メソッド
	 *
	 */
	public void clear()
	{
		mView.clear();
		mView = null;
		mForm.clear();
		mForm = null;
		mFormSub1Insert.clear();
		mFormSub1Insert = null;
		mFormSub1Update.clear();
		mFormSub1Update = null;
		mT_ACPT_RSLT.clear();
		mT_ACPT_RSLT = null;
		mT_INSPC_RSLT.clear();
		mT_INSPC_RSLT = null;
		mT_RLSD_PUCH_ODR.clear();
		mT_RLSD_PUCH_ODR = null;
		mM_WH.clear();
		mM_WH = null;
		mM_TAX.clear();
		mM_TAX = null;
		mT_RLSD_PUCH_ODRForComplete.clear();
		mT_RLSD_PUCH_ODRForComplete = null;
		mT_RLSD_PUCH_ODRForCancel.clear();
		mT_RLSD_PUCH_ODRForCancel = null;
		mT_ACPT_RSLT_Lock.clear();
		mT_ACPT_RSLT_Lock = null;
		mT_RLSD_PUCH_ODR_Lock.clear();
		mT_RLSD_PUCH_ODR_Lock = null;
		mT_ISSUE_INST.clear();
		mT_ISSUE_INST = null;
		mT_PART_SUPPLIED_ISSUE.clear();
		mT_PART_SUPPLIED_ISSUE = null;
		mreadT_ITEM_STOCK.clear();
		mreadT_ITEM_STOCK = null;
		mreadT_JOB_ODR_CD_STOCK.clear();
		mreadT_JOB_ODR_CD_STOCK = null;
		minsertT_ITEM_STOCK.clear();
		minsertT_ITEM_STOCK = null;
		mupdateT_ITEM_STOCK.clear();
		mupdateT_ITEM_STOCK = null;
		minsertT_JOB_ODR_CD_STOCK.clear();
		minsertT_JOB_ODR_CD_STOCK = null;
		mupdateT_JOB_ODR_CD_STOCK.clear();
		mupdateT_JOB_ODR_CD_STOCK = null;
		minsertT_RCV_ISSUE.clear();
		minsertT_RCV_ISSUE = null;
		mreadM_WH.clear();
		mreadM_WH = null;
		mreadT_PART_SUPPLIED_ISSUE.clear();
		mreadT_PART_SUPPLIED_ISSUE = null;
		mupdateT_PART_SUPPLIED_ISSUE.clear();
		mupdateT_PART_SUPPLIED_ISSUE = null;
		mreadT_ACPT_RSLT.clear();
		mreadT_ACPT_RSLT = null;
		mreadT_INSPC_RSLT.clear();
		mreadT_INSPC_RSLT = null;
		mselectSupplied.clear();
		mselectSupplied = null;
		mSelectDateCtrl.clear();
		mSelectDateCtrl = null;
		mSelectHeader.clear();
		mSelectHeader = null;
		mSelectHeaderVend.clear();
		mSelectHeaderVend = null;
		mcheckM_ITEM.clear();
		mcheckM_ITEM = null;
		mcheckT_PART_SUPPLIED_ISSUE.clear();
		mcheckT_PART_SUPPLIED_ISSUE = null;
		mSelectHeader2.clear();
		mSelectHeader2 = null;
		mupdateT_PART_SUPPLIED_ISSUE_SUP.clear();
		mupdateT_PART_SUPPLIED_ISSUE_SUP = null;
		mupdateT_PART_SUPPLIED_ISSUE_COM.clear();
		mupdateT_PART_SUPPLIED_ISSUE_COM = null;
		mupdateT_PART_SUPPLIED_ISSUE_NOMAL.clear();
		mupdateT_PART_SUPPLIED_ISSUE_NOMAL = null;
		mcheckT_RLSD_PUCH_ODR.clear();
		mcheckT_RLSD_PUCH_ODR = null;
		mupdateT_PART_SUPPLIED_ISSUE_GNR.clear();
		mupdateT_PART_SUPPLIED_ISSUE_GNR = null;
		mT_ACPT_RSLT_COUNT.clear();
		mT_ACPT_RSLT_COUNT = null;
		mT_PART_SUPPLIED_ISSUE_COUNT.clear();
		mT_PART_SUPPLIED_ISSUE_COUNT = null;
		mT_RLSD_PUCH_ODR_FOR_CANCEL_ODR_CANCEL.clear();
		mT_RLSD_PUCH_ODR_FOR_CANCEL_ODR_CANCEL = null;
		mT_ACPT_RSLT_FOR_CANCEL_ODR_CANCEL.clear();
		mT_ACPT_RSLT_FOR_CANCEL_ODR_CANCEL = null;
		mSYS_DEBT_CTRL.clear();
		mSYS_DEBT_CTRL = null;
		mSYS_INSTALL_OPTIONS.clear();
		mSYS_INSTALL_OPTIONS = null;
		mM_CONS_UNIT_COST.clear();
		mM_CONS_UNIT_COST = null;
		mreadT_PART_SUPPLIED_ISSUE2.clear();
		mreadT_PART_SUPPLIED_ISSUE2 = null;
		mupdateT_PART_SUPPLIED_ISSUE2.clear();
		mupdateT_PART_SUPPLIED_ISSUE2 = null;
		mupdateT_RLSD_PUCH_ODR_INSPC_CMPLT.clear();
		mupdateT_RLSD_PUCH_ODR_INSPC_CMPLT = null;
		mSELECT_SYS_PARAMETER.clear();
		mSELECT_SYS_PARAMETER = null;
		mSELECT_SYS_ACTUAL_COST_CTRL_AC.clear();
		mSELECT_SYS_ACTUAL_COST_CTRL_AC = null;
		mcheckWORK_ODR_CD.clear();
		mcheckWORK_ODR_CD = null;
		mcheckFINAL_PROC_FLG.clear();
		mcheckFINAL_PROC_FLG = null;
		mcheckLOT_NO.clear();
		mcheckLOT_NO = null;
		mcheckLOT_CTRL_FLG.clear();
		mcheckLOT_CTRL_FLG = null;
		mupdateT_LOT_CTRL.clear();
		mupdateT_LOT_CTRL = null;
		mcheckT_LOT_ISSUE_INST.clear();
		mcheckT_LOT_ISSUE_INST = null;
		mSelectSTOCK_ON_HAND_QTY.clear();
		mSelectSTOCK_ON_HAND_QTY = null;
		mSelectT_PART_SUPPLIED_ISSUE.clear();
		mSelectT_PART_SUPPLIED_ISSUE = null;
		mSelectQty.clear();
		mSelectQty = null;
		mSelectWH_CD.clear();
		mSelectWH_CD = null;
		mSelectSEQ_JF_RSLT.clear();
		mSelectSEQ_JF_RSLT = null;
		minsertT_LOT_USE_RSLT.clear();
		minsertT_LOT_USE_RSLT = null;
		mupdateT_LOT_USE_RSLT.clear();
		mupdateT_LOT_USE_RSLT = null;
		mupdateT_LOT_ISSUE_INST.clear();
		mupdateT_LOT_ISSUE_INST = null;
		mSelectISSUE_INST_CD.clear();
		mSelectISSUE_INST_CD = null;
		mcheckLOT_CTRL_FLG1.clear();
		mcheckLOT_CTRL_FLG1 = null;
		mcheckLOT_NO1.clear();
		mcheckLOT_NO1 = null;
		mcheckWH_CD.clear();
		mcheckWH_CD = null;
		mcheckSTOCK_ON_HAND_QTY.clear();
		mcheckSTOCK_ON_HAND_QTY = null;
		mcheckSTOCK_ON_HAND_QTY2.clear();
		mcheckSTOCK_ON_HAND_QTY2 = null;
		mgetSUM_TOTAL_ISSUE_QTY.clear();
		mgetSUM_TOTAL_ISSUE_QTY = null;
		mcheckT_LOT_ISSUE_INST2.clear();
		mcheckT_LOT_ISSUE_INST2 = null;
		mgetT_LOT_USE_RSLT_QTY.clear();
		mgetT_LOT_USE_RSLT_QTY = null;
		mupdateT_LOT_ISSUE_INST_SPENT_QTY.clear();
		mupdateT_LOT_ISSUE_INST_SPENT_QTY = null;
		mdeleteT_LOT_USE_RSLT.clear();
		mdeleteT_LOT_USE_RSLT = null;
		mgetParentITEM_CD.clear();
		mgetParentITEM_CD = null;
		mSelectT_LOT_USE_RSLT_LOT_NO.clear();
		mSelectT_LOT_USE_RSLT_LOT_NO = null;
		mcheckNON_NO_ITEM_FLG.clear();
		mcheckNON_NO_ITEM_FLG = null;
		mSelectLOT_NO_From_ACPT.clear();
		mSelectLOT_NO_From_ACPT = null;
		mSelectTOTAL_ISSUE_QTY_SUM.clear();
		mSelectTOTAL_ISSUE_QTY_SUM = null;
		mcheckIsLotManager.clear();
		mcheckIsLotManager = null;
		mgetACPT_NO.clear();
		mgetACPT_NO = null;
		mgetISSUE_INST_CD.clear();
		mgetISSUE_INST_CD = null;
		mT_ISSUE_INST2.clear();
		mT_ISSUE_INST2 = null;
		mbakT_LOT_USE_RSLT.clear();
		mbakT_LOT_USE_RSLT = null;
		mSelectT_LOT_USE_RSLT_LOT_NO2.clear();
		mSelectT_LOT_USE_RSLT_LOT_NO2 = null;
		mupdateT_LOT_USE_RSLT3.clear();
		mupdateT_LOT_USE_RSLT3 = null;
		mupdateT_LOT_USE_RSLT4.clear();
		mupdateT_LOT_USE_RSLT4 = null;
		mcheckT_LOT_USE_RSLT.clear();
		mcheckT_LOT_USE_RSLT = null;
		mSYS_PARAMETER.clear();
		mSYS_PARAMETER = null;
		mc_BESTBEFORE_DATE.clear();
		mc_BESTBEFORE_DATE = null;
		mSelectLOT_NO.clear();
		mSelectLOT_NO = null;
		mupdateT_LOT_USE_RSLT2.clear();
		mupdateT_LOT_USE_RSLT2 = null;
		mT_OD.clear();
		mT_OD = null;
		mSYS_BAT_PARM.clear();
		mSYS_BAT_PARM = null;
		mcallSQLCALCTAXCALCAMT.clear();
		mcallSQLCALCTAXCALCAMT = null;
		mViewCnt.clear();
		mViewCnt = null;
		mSelectSuppliedCnt.clear();
		mSelectSuppliedCnt = null;
		mlockT_ITEM_STOCK.clear();
		mlockT_ITEM_STOCK = null;
		mupdateT_LOT_TRACE.clear();
		mupdateT_LOT_TRACE = null;
		mgetFROM_PUCH_ODR_CD.clear();
		mgetFROM_PUCH_ODR_CD = null;
		return;
	}

	/**
	 * ログ部品インスタンス
	 */
	public DisplayMessageUtil objMessage = new DisplayMessageUtil();
	public void setUsrId(String username) {objMessage.m_writer.setUserID(username);}	// ユーザIDをセットします。

	/**
	 * AE0060020クラスの標準コンストラクタ
	 */
	public AE0060020Entity() throws FoundationException
	{
		//{{user_implement_dev:constractor
			// TODO: ここに初期処理を記述してください
                //}}user_implement_dev:constractor

		return;
	}

	/**
	 * インスタンス破壊時に行う処理
	 *
	 */
	protected void finalize()
	{
		//{{user_implement_dev:entity_destractor
			// TODO: インスタンス消滅時に実行する処理を記述してください
                //}}user_implement_dev:entity_destractor

		objMessage = null;
		clear();

		return;
	}
}
