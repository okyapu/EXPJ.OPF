/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AC0140/src/com/nec/jp/orteus/metamorBase/AC0140/AC0140B001/medAC0140B001.java,v $
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
 * EXPJ    (2004/04/05),メソッドコメントの「* @param なし」をすべて削除
 *                     ,メソッドコメントの「* @return なし」をすべて削除
 * EXPJ    (2004/03/21),EXPLANNER/J用に改造
 *                      SystemLogの記述を追加。
 * 2.0.0.0 (2002/05/27),new foundation対応
 *
 */

package com.nec.jp.orteus.metamorBase.AC0140.AC0140B001;

import com.nec.jp.orteus.expj.systemlog.SystemLog;
import com.nec.jp.orteus.xaf.ba.*;

import java.lang.Number.*;
import java.lang.Float;
import java.lang.*;
import java.util.*;
import java.sql.*;
import java.io.*;

//{{user_implement_dev:import
 // TODO: ここにimportパッケージを記述してください
import com.nec.jp.orteus.xaf.foundation.*;
import com.nec.jp.orteus.xaf.util.*;
import com.nec.jp.orteus.msg.core.*;

import com.nec.jp.orteus.expj.util.SystemConfig;
import com.nec.jp.orteus.expj.util.ExpjMessage;
import com.nec.jp.orteus.expj.util.ExpjException;
import com.nec.jp.orteus.expj.businesslock.BusinessLock;
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessage;
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessageAccessor;
import com.nec.jp.orteus.expj.util.Numbering;
//}}user_implement_dev:import

/**
 * CLASS     : medAC0140B001 クラス
 * ファイル・クラス説明
 * @author $Author: xl-hs-zzw $
 * @version $Revision: 1.6 $ $Date: 2014/11/05 07:03:49 $
 */

//{{user_implement_dev:header
//}}user_implement_dev:header

public class medAC0140B001 extends Object
{

	//////////////////////////////

	/**
	 * 第 1 mediator変数
	 */
	protected String m_currentPlantCd;

	/**
	 * 第 2 mediator変数
	 */
	protected Integer m_odCalcFlg;

	/**
	 * 第 3 mediator変数
	 */
	protected String m_PLANT_CD;

	/**
	 * 第 4 mediator変数
	 */
	protected String m_JOB_ODR_CD;

	/**
	 * readMPlant_all entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity0=null;

	/**
	 * readSysOdCalcCtrl_all entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity1=null;

	/**
	 * readSysJobOdCalcCtrl_all entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity2=null;

	/**
	 * CtrlMain entity インスタンスを格納します
	 */
	public IBatchAppCommon m_ctrl0=null;


	//////////////////////////////

	/**
	 * プログラム名を格納します。
	 */
	protected String m_Progname="AC0140B001";

	/**
	 * プログラム名を返します
	 *
	 * @return プログラム名
	 */
	public String getProgname() { return m_Progname; }

	/**
	 * プログラム名をmediatorに格納します
	 *
	 * @param プログラム名
		 */
	public void setProgname(String args) { m_Progname = args; }

	//////////////////////////////

	/**
	 * 処理開始日付を取得します（文字列：YYYY/MM/DD HH24:MI:SS）
	 */
	// java.util.Date mdate = new java.util.Date();
	// java.text.SimpleDateFormat dtformat = new java.text.SimpleDateFormat( "yyyy/MM/dd kk:mm:ss" );
	// protected String Sysdate = dtformat.format(mdate);
	protected String Sysdate = null;

	/**
	 * 処理開始日付を取得します（文字列：YYYY/MM/DD HH24:MI:SS）
	 *
	 * @return 処理日付
	 */
	public String getSysdate() { return Sysdate; }

	/**
	 * 処理日付をmediatorに格納します
	 *
	 * @param 処理日付
		 */
	public void setSysdate( String arg ) { Sysdate = arg; }

	//////////////////////////////

	/**
	 * 登録者/更新者を格納します
	 */
	protected String Username = "orteus_system";

	/**
	 * 登録者/更新者を取得します
	 *
	 * @return 登録者/更新者
	 */
	public String getUsername() { return Username; }

	/**
	 * 登録者/更新者をmediatorに格納します
	 *
	 * @param 登録者/更新者
		 */
	public void setUsername( String arg ) { Username = arg; }

	//////////////////////////////

	/**
	 * 引数情報を格納します
	 */
	protected String[] m_args=null;

	//////////////////////////////

	/**
	 * コマンドラインの引数文字列配列を返します
	 *
	 * @return 引数文字列配列
	 */
	public String[] getArgs() { return m_args; }

	/**
	 * コマンドラインの引数文字列配列をmediatorに格納します
	 *
	 * @param 引数文字列配列
		 */
	public void setArgs(String[] args) { m_args = args; }

	//////////////////////////////

	// mediator変数用(get|set)メソッド

	public String getcurrentPlantCd() { return m_currentPlantCd; }
	public Integer getodCalcFlg() { return m_odCalcFlg; }
	public String getPLANT_CD() { return m_PLANT_CD; }
	public String getJOB_ODR_CD() { return m_JOB_ODR_CD; }
	public void setcurrentPlantCd(String arg) { m_currentPlantCd = arg; }
	public void setodCalcFlg(Integer arg) { m_odCalcFlg = arg; }
	public void setPLANT_CD(String arg) { m_PLANT_CD = arg; }
	public void setJOB_ODR_CD(String arg) { m_JOB_ODR_CD = arg; }

	/////////////////////////////////////////////////////////////////

	public AbstractBatchAppEntity getreadMPlant_all() { return m_entity0; }
	public void setreadMPlant_all(AbstractBatchAppEntity obj) { m_entity0 = obj; }
	public AbstractBatchAppEntity getreadSysOdCalcCtrl_all() { return m_entity1; }
	public void setreadSysOdCalcCtrl_all(AbstractBatchAppEntity obj) { m_entity1 = obj; }
	public AbstractBatchAppEntity getreadSysJobOdCalcCtrl_all() { return m_entity2; }
	public void setreadSysJobOdCalcCtrl_all(AbstractBatchAppEntity obj) { m_entity2 = obj; }
	public IBatchAppCommon getCtrlMain() { return m_ctrl0; }
	public void setCtrlMain(IBatchAppCommon obj) { m_ctrl0 = obj; }

	//////////////////////////////

	/**
	 * medAC0140B001クラスの標準コンストラクタ
	 *
		 */
	public medAC0140B001()
	{
		// mediator変数を初期化します
		m_currentPlantCd = null;
		m_odCalcFlg = null;
		m_PLANT_CD = null;
		m_JOB_ODR_CD = null;

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

		// todo: インスタンス消滅時に実行する処理を記述してください

		return;
	}

	/**
	 * システムログ
	 * 
	 */
	protected SystemLog m_syslog = null;
	public void setSyslog(SystemLog syslog){m_syslog = syslog;}
	public SystemLog getSyslog(){return m_syslog;}

	//////////////////////////////

        //{{user_implement_dev:original
         // TODO: ユーザ利用メソッド・変数は、ここに記述してください。
       // insert Original Code ===================================================
       
           // 処理区分
           private int plantTyp = 1;                // 1:指定工場 2:全工場
       
           // 所要量計算パラメータ
           private String userId = null;            // ユーザID
           private String businessName = null;      // 業務名（バッチ処理ID）
           private String plantCd = null;           // 工場コード
           private String connectDbuser = null;     // Oracleユーザ
           private String connectDbpass = null;     // Oracleパスワード
           private String connectDbhost = null;     // Oracle接続文字列
           private String batchRollbackFlg= null;   // ロールバックセグメント使用フラグ
           private String batchRollbackSeg = null;  // 専用ロールバックセグメント名
           private String batchLogPath = null;      // ログ出力先
           private String mrpExeLogFile = null;     // ログファイル名
           private String batchLogFullPath = null;  // ログファイル名（フルパス）
           private String programPath = null;       // EXEのパス
           private String mrpExeLogMode = null;     // ログモード
           private String mrpExpMode = null;        // 所要量展開モード
           private String jobOdrCd = null;          // 製番
       
           // バッチクラス共通エラー処理用
           private String errCode = null;		     // バッチエラーコード
           private String errMsg = null;		     // バッチエラーメッセージ
           private String errNote = "";             // バッチエラーメッセージ(備考) 必要に応じて使用。
       
           // metamorBase業務メッセージ用
           private String businessErrCode = null;   // metamorBase業務メッセージコード
       
           // Orteus標準業務メッセージ用
           private String memoText = "";            // Orteus業務メッセージ 備考
       
           // setter
        protected void setBusinessName(String arg) { businessName = arg; }
           protected void setBatchLogFullPath() {
               batchLogFullPath = batchLogPath + "/" + plantCd + mrpExeLogFile;
           }
       
           // getter
           protected String getBatchErrorMessage() {
               return errMsg;
           }
       
       
           /**
            * 所要量計算実行バッチクラス メイン処理
            *
            * @param conn DBコネクション
            * @return なし
            */
           protected void main(IDbConnection conn) throws Exception {
       
               try {
       
                   //main引数を取得し、メンバ変数にセットする
                   setParamArgs();
       
                   // 工場コードとそれに対するロック解除キーの配列を保持するリスト
                   ArrayList plantList = new ArrayList();
       
                   // 工場指定の場合 ==============================================
                   if (plantTyp == 1) {
                       // 工場コードとロックを格納する配列を用意
                       Object plantData[] = new Object[3];
                       plantData[0] = plantCd;   // 工場コードをセット
                       plantData[1] = null;      // ロックオブジェクト格納用
                       plantData[2] = null;      // ロック解除キー格納用
                       // リストに配列を保持
                       plantList.add(plantData);
       
                   // 全工場の場合 ==============================================
                   } else {
                      // 工場コードを工場マスタから取得
                       AbstractBatchAppEntity mPlantAll = getreadMPlant_all();
                       try {
                           mPlantAll.read();
                       } catch (Exception e) {
                           throw e;
                       }
                       // 工場データをリストに保持しておく
                       while (mPlantAll.next()) {
                           // 工場コードとロックを格納する配列を用意
                           Object plantData[] = new Object[3];
                           plantData[0] = getcurrentPlantCd(); // 工場コードをセット
                           plantData[1] = null;                // ロックオブジェクト格納用
                           plantData[2] = null;                // ロック解除キー格納用
                           // リストに配列を保持
                           plantList.add(plantData);
                       }
                   }   // -- end of if
       
                   // 所要量計算処理を行う
                   executeAllBatch(conn, plantList);
       
               } catch (Exception e) {
                   throw e;
               }
       
           }
       
       
           /**
            * 全ての工場について、所要量計算処理を実行する。
            * エラーが発生した場合、metamorBase業務メッセージを出力する。
            * また、Orteusメッセージを出力する。
            * @param conn DBコネクション
            * @param plantList 工場コードのリスト
            * @return なし
            */
           protected void executeAllBatch(IDbConnection conn, ArrayList plantList) throws Exception{
       
               try {
       
                   // 1件目の工場コードの業務メッセージとして出力する処理 ------------------
                   // 定義ファイルからのパラメータの取得、所要量計算中チェックを行う。
                   // この処理で発生したエラーに関しては、1件目の工場コードの業務メッセージとして出力する
       
                   // 1件目の工場コードを取得
                   Object firstPlant[] = (Object[]) plantList.get(0);
                   String firstPlantCd = firstPlant[0].toString();
       
                   try {
       
                       // 定義ファイルのパラメータを取得し、所要量計算用メンバ変数にセットする
                       setConfigParameters();
       
                       // 所要量計算中チェック
                       AbstractBatchAppEntity sysOdCalcCtrl = getreadSysOdCalcCtrl_all();
                       sysOdCalcCtrl.read();
       
                       // 1件でも（1工場でも）所要量計算中であれば、処理を終了する。
                       if (sysOdCalcCtrl.next()) {
                           businessErrCode = "AC00107"; // 所要量計算実行中です。
                           errCode = businessErrCode;
                           throw new Exception();
                       }
                       //所要量計算中(製番)チェック
                       setPLANT_CD(plantCd);
                       setJOB_ODR_CD(jobOdrCd);
                       AbstractBatchAppEntity sysJobOdCalcCtrl = getreadSysJobOdCalcCtrl_all();
                       sysJobOdCalcCtrl.read();
       
                       // 所要量計算中(製番)データがあれば、処理を終了する。
                       if (sysJobOdCalcCtrl.next()) {
                    	   if(getodCalcFlg().intValue()==1){
                    		   businessErrCode = "AC00235"; // 所要量計算(製番)実行中です。
                               errCode = businessErrCode;
                               throw new Exception();
                    	   }                           
                       }else{
                    	   businessErrCode = "AC00237"; // 所要量計算制御（製番）データが存在しません。
                           errCode = businessErrCode;                           
                           throw new Exception();
                       }
       
                   // このcatchでは、metamorBase業務メッセージおよびOrteus業務メッセージの出力を行う。
                   } catch (Exception e) {
                       // バッチエラーメッセージのセット
                       setBatchErrorMessage(e);
                       // metamorBase業務メッセージの出力
                       outBusinessMessage(conn, businessName, userId, firstPlantCd);
                       // Orteus業務メッセージの備考にメッセージをコピーしておく
                       memoText = errMsg;
                       throw e;
                   } finally {
                       // Orteus業務メッセージの送信
                       sendOrteusMessage(conn, firstPlantCd);
                   }
       
       
                   // この内部でエラーが発生した場合、すでにかかっている業務ロックを
                   // 全て解除する
                   try {
       
                       // 全ての工場について業務ロックをかけておく
                       for (Iterator it = plantList.iterator(); it.hasNext();) {
                           Object plantData[] = (Object[]) it.next();
                           plantCd = plantData[0].toString();
                           try {
                               try {
       
                                   BusinessLock lock = new BusinessLock(conn, userId, plantCd);
                                   int lockCancelKey = lock.doLock(businessName);  // 解除キーの取得
                                   conn.commit();
                                   if (lockCancelKey == -1) throw new Exception();
       
                                   // ロックを保持しておく
                                   plantData[1] = lock;
                                   plantData[2] = new Integer(lockCancelKey);
                               } catch (Exception e) {
                                   businessErrCode = "ZZ01001"; // 業務ロックされているため起動できません
                                   throw e;
                               }
                           } catch (Exception e) {
                               if (businessErrCode == null) {
                                   businessErrCode = "ZZ09009";  // バッチ処理を開始できませんでした。
                               }
                               errCode = businessErrCode;
                               // バッチエラーメッセージのセット
                               setBatchErrorMessage(e);
                               // metamorBase業務メッセージの出力
                               outBusinessMessage(conn, businessName, userId, plantCd);
                               // Orteus業務メッセージの備考にメッセージをコピーしておく
                               memoText = errMsg;
                               throw e;
                           } finally {
                               // Orteusメッセージの送信
                               sendOrteusMessage(conn, plantCd);
                           }
                       }   // -- end of for
       
       
                       // 全ての工場について所要量計算処理を実行する。
                       for(Iterator it = plantList.iterator(); it.hasNext();){
                           Object plantData[] = (Object[]) it.next();
                           plantCd = plantData[0].toString();
                           BusinessLock lock = (BusinessLock) plantData[1];
                           int lockCancelKey = ((Integer) plantData[2]).intValue();
       
                           try {
                               // ログ出力パス（フルパス）をメンバ変数にセット
                               setBatchLogFullPath();
                               // 所要量計算バッチ処理を実行する
                               executeBatch();
                           } catch (Exception e) {
                               // バッチエラーメッセージのセット
                               setBatchErrorMessage(e);
                               // metamorBase業務メッセージの出力
                               outBusinessMessage(conn, businessName, userId, plantCd);
                               // Orteus業務メッセージの備考にメッセージをコピーしておく
                               memoText = errMsg;
                               throw e;
                           } finally {
                               try {
                                   // 業務ロック解除
       
                                   lock.doUnLock(businessName, lockCancelKey);
                                   conn.commit();
                               } catch (FoundationException e) {
                                   businessErrCode = "ZZ01004";  // 業務ロックの解除に失敗しました。
                                   errCode = businessErrCode;
                                   // バッチエラーメッセージのセット
                                   setBatchErrorMessage(e);
                                   // metamorBase業務メッセージの出力
                                   outBusinessMessage(conn, businessName, userId, plantCd);
                                   // Orteus業務メッセージの備考にメッセージをコピーしておく
                                   memoText = errMsg;
                                   throw e;
                               } catch (Exception e) {
                                   businessErrCode = "ZZ09009";  // バッチ処理を開始できませんでした。
                                   errCode = businessErrCode;
                                   // バッチエラーメッセージのセット
                                   setBatchErrorMessage(e);
                                   // metamorBase業務メッセージの出力
                                   outBusinessMessage(conn, businessName, userId, plantCd);
                                   // Orteus業務メッセージの備考にメッセージをコピーしておく
                                   memoText = errMsg;
                                   throw e;
                               } finally {
                                   // Orteusメッセージの送信
                                   sendOrteusMessage(conn, plantCd);
                               }
                           }
                       }  // -- end of for
       
                   // 1件でもエラーが発生した場合、すべての業務ロックを解除する。
                   } catch (Exception e) {
       
                       for (Iterator it = plantList.iterator(); it.hasNext();) {
                           Object plantData[] = (Object[]) it.next();
                           plantCd = plantData[0].toString();
       
                           // ロックがかかっている場合、解除を行う
                           if (plantData[1] != null) {
                               BusinessLock lock = (BusinessLock) plantData[1];
                               int lockCancelKey = ((Integer) plantData[2]).intValue();
                               try {
                                   // 業務ロック解除
       
                                   lock.doUnLock(businessName, lockCancelKey);
                                   conn.commit();
                               } catch (FoundationException fe) {
                                   businessErrCode = "ZZ01004";  // 業務ロックの解除に失敗しました。
                                   errCode = businessErrCode;
                                   // バッチエラーメッセージのセット
                                   setBatchErrorMessage(e);
                                   // metamorBase業務メッセージの出力
                                   outBusinessMessage(conn, businessName, userId, plantCd);
                                   // Orteus業務メッセージの備考にメッセージをコピーしておく
                                   memoText = errMsg;
                                   throw e;
                               } catch (Exception ex) {
                                   businessErrCode = "ZZ09009";  // バッチ処理を開始できませんでした。
                                   errCode = businessErrCode;
                                   // バッチエラーメッセージのセット
                                   setBatchErrorMessage(e);
                                   // metamorBase業務メッセージの出力
                                   outBusinessMessage(conn, businessName, userId, plantCd);
                                   // Orteus業務メッセージの備考にメッセージをコピーしておく
                                   memoText = errMsg;
                                   throw e;
                               } finally {
                                   sendOrteusMessage(conn, plantCd); // Orteusメッセージの送信
                               }
                           }  // -- end of if
                       }  // -- end of for
       
                       throw e;
                   }
       
               } catch (Exception e) {
                   throw e;
               }
           }
       
       
       
           /**
            * 所要量計算バッチ処理を実行する
            *
            * @return なし
            */
           protected void executeBatch() throws Exception {
       
               try {
//                   String cmd = programPath;
//                   cmd = cmd + " /U:" + userId;
//                   cmd = cmd + " /B:" + businessName ;
//                   cmd = cmd + " /K:" + plantCd ;
//                   cmd = cmd + " /O:" + connectDbuser ;
//                   cmd = cmd + " /P:" + connectDbpass ;
//                   cmd = cmd + " /D:" + connectDbhost ;
//                   cmd = cmd + " /R:" + batchRollbackFlg ;
//                   cmd = cmd + " /N:" + batchRollbackSeg ;
//                   cmd = cmd + " /L:" + batchLogFullPath ;
//                   cmd = cmd + " /M:" + mrpExeLogMode ;
//                   cmd = cmd + " /F:" + mrpExpMode ;
//                   cmd = cmd + " /J:" + jobOdrCd ;
//
//               Process p = Runtime.getRuntime().exec(cmd);
//                   p.waitFor();
       
                   List buffer = new ArrayList();
                   buffer.add(programPath);
                   buffer.add("/U:" + userId);
                   buffer.add("/B:" + businessName);
                   buffer.add("/K:" + plantCd);
                   buffer.add("/O:" + connectDbuser);
                   buffer.add("/P:" + connectDbpass);
                   buffer.add("/D:" + connectDbhost);
                   buffer.add("/R:" + batchRollbackFlg);
                   buffer.add("/N:" + batchRollbackSeg);
                   buffer.add("/L:" + batchLogFullPath);
                   buffer.add("/M:" + mrpExeLogMode);
                   buffer.add("/F:" + mrpExpMode);
                   buffer.add("/J:" + jobOdrCd);

                   // バッチ処理実行
                   Process p = Runtime.getRuntime().exec((String[])buffer.toArray(new String[buffer.size()]));
                   p.waitFor();
               } catch (Exception e) {
                   businessErrCode = "ZZ09009"; // バッチ処理を開始できませんでした。
                   errCode = businessErrCode;
                   throw e;
               }
       
           }
       
       
           /**
            * main引数を取得し、メンバ変数にセットする。
            * 引数の妥当性チェックも行う。
            *
            * @return なし
            */
           protected void setParamArgs() throws Exception{
       
               // main引数受け取り
               String args[] = getArgs();
               int argsLength = args.length;   // 引数の個数を保持
       
               // 引数を変数にセットする。妥当性チェックも行う。
               if (argsLength >= 4) {
                   userId = args[0];
                   mrpExpMode = args[1];
                   if (mrpExpMode.equals("2")){
                       jobOdrCd = args[2];
                       plantCd = args[3];
                   }
               } else {
                   errCode = "AC00111"; // バッチ処理引数の形式が不正です
                   throw new Exception();
               }
           }
       
       
           /**
            * 定義ファイルから所要量計算パラメータを取得し、メンバ変数にセットする
            *
            * @return なし
            */
           protected void setConfigParameters() throws Exception{
               try {
                   ResourceBundle config = SystemConfig.getBundle();
                   connectDbuser = SystemConfig.getProperty("CONNECT_DBUSER", config);
                   connectDbpass = SystemConfig.getProperty("CONNECT_DBPASS", config);
                   connectDbhost = SystemConfig.getProperty("CONNECT_DBHOST", config);
                   batchRollbackFlg = SystemConfig.getProperty("BATCH_ROLLBACK_FLG", config);
                   batchRollbackSeg = SystemConfig.getProperty("BATCH_ROLLBACK_SEG", config);
                   batchLogPath = SystemConfig.getProperty("BATCH_LOG_PATH", config);
                   mrpExeLogFile = SystemConfig.getProperty("MRP_EXE_LOG_FILE", config);
                   programPath = SystemConfig.getProperty("PROGRAM_PATH", config);
                   
                   mrpExeLogMode = SystemConfig.getProperty("MRP_EXE_LOG_MODE", config);
                   
                   if ( mrpExeLogMode == null ) { // ログ出力モード取得に失敗
                   		// システム既定値ファイルからの情報取得に失敗しました。(ＭＲＰログ出力モード)
                   		getSyslog().warning( new ExpjMessage("ZZ09031"), getUsername() );
                   		mrpExeLogMode = "1";
                   } else if ( !mrpExeLogMode.equals("0") && !mrpExeLogMode.equals("1") ) {
                   	   // ＭＲＰログ出力モードが不正です。
                   	   ExpjMessage emsg = new ExpjMessage( "ZZ09032" );
                   	   getSyslog().severe( emsg, getUsername() );
                   	   emsg = new ExpjMessage( "ZZ01006", "MRP_EXE_LOG_MODE : " + mrpExeLogMode );
                   	   getSyslog().severe( emsg, getUsername() );
                   	   throw new ExpjException( emsg );
                   }
               } catch ( Exception e ) {
                   businessErrCode = "ZZ09009"; // バッチ処理を開始できませんでした。
                   errCode = businessErrCode;
                   throw e;
               }
           }
       
       
           /**
            * バッチクラス共通エラー処理のエラーメッセージをメンバ変数にセットする。
            * バッチクラス共通エラー処理は、仕様上、引数にエラーコードではなくエラーメッセージ文字列を必要とする。
            * よって、業務プログラム側でエラーコードからメッセージを作成する必要がある。
            *
            * @param e Exceptionオブジェクト
            * @return なし
            */
           protected void setBatchErrorMessage(Exception e) {
       
               // 特定のバッチエラーコードがセットされていない場合
               if (errCode == null) {
                   errCode = "AC53402";  // その他　Ｅｒｒｏｒ
               }
               // バッチエラーメッセージの作成
               if (errMsg == null) {
                   //AlarmMessage msg = new AlarmMessage(errCode);
                   //errMsg = "[" + errCode + "]" + msg.getMessage();
               }
               // Exceptionオブジェクトにメッセージがある場合、付加する。
               if (e.getMessage() != null) {
                   errMsg = errMsg + " " + e.getMessage();
               }
           }
       
       
           /**
            * metamorBase業務メッセージの出力を行う。
            * metamorBase業務メッセージの出力には、業務名、ユーザコード、工場コードを必要とする
            *
            * @param conn DBコネクション
            * @param businessName 業務名
            * @param userId ユーザコード
            * @param plantCd 工場コード
            * @return なし
            */
           protected void outBusinessMessage(IDbConnection conn,
                                             String businessName,
                                             String userId,
                                             String plantCd) throws Exception{
       
               // 特定の業務エラーコードがセットされていない場合
               if (businessErrCode == null) {
                   businessErrCode = "ZZ09009";  // バッチ処理を開始できませんでした。
               }
       
               // 業務メッセージの準備
               BusinessMessageAccessor businessMsgAcc = new BusinessMessageAccessor();
               BusinessMessage businessMsg = new BusinessMessage();
               businessMsgAcc.init(conn);
               businessMsg.setBusinessOperatingName(businessName);
               businessMsg.setUser(userId);
               businessMsg.setPlantCode(plantCd);
               businessMsg.setMessageCode(businessErrCode);
               businessMsg.setData(errNote);
               try {
          Numbering logCd = new Numbering(conn,Numbering.LOG_CD,userId,businessName,plantCd);
          businessMsg.setLogCode(logCd.getNo());
                   businessMsgAcc.add(businessMsg);
                   // 業務メッセージは、業務プログラム側でコネクションをコミットする
                   // 必要がある。所要量計算指示は、業務プログラムでトランザクションを
                   // 意識する必要がないため、メイン処理と同じコネクションに対し都度コミット
                   // する。
                   conn.commit();
               } catch (SQLException e) {
                   errCode = "AC00999"; // SQL実行時エラー。
                   throw e;
               } catch (Exception e) {
                   errCode = "AC53402";  // その他　Ｅｒｒｏｒ
                   throw e;
               }
           }
       
       
           /**
            * Orteus標準業務メッセージの送信を行う。
            *
            * @param conn DBコネクション
            * @param plantCd 工場コード
            * @return なし
            */
           protected void sendOrteusMessage(IDbConnection conn, String plantCd) {
       
               /* テスト用リリース時はコメント部 *
               try {
       
                   //Business business = Business.getStartBusiness(getBUSINESS_GROUP_CD(), args[1], getBUSINESS_CD());
                   Business business = Business.getStartBusiness(getBUSINESS_GROUP_CD(), userId, getBUSINESS_CD());
                   business.setMessageDisplayLevel(1); // 表示レベル(重要度)の指定
                   business.setMessageReference(memoText); // 備考の指定
                   business.complete();
               }
               catch(MessageApiException e) {
                   e.printStackTrace();
       
                   // 業務メッセージの登録（バッチ終了メッセージ送信失敗時）
                   businessErrCode = "ZZ09008";
       
                   // 業務メッセージの準備
                   BusinessMessageAccessor businessMsgAcc = new BusinessMessageAccessor();
                   businessMsgAcc.init(conn);
                   BusinessMessage businessMsg = new BusinessMessage();
                   businessMsg.setBusinessOperatingName(businessName);
                   businessMsg.setUser(userId);
                   businessMsg.setPlantCode(plantCd);
                   businessMsg.setMessageCode(businessErrCode);
                   businessMsg.setData("");
                   try {
           Numbering logCd = new Numbering(conn,Numbering.LOG_CD,userId,businessName,plantCd);
           businessMsg.setLogCode(logCd.getNo());
                       businessMsgAcc.add(businessMsg);
                   }
                       catch (SQLException ex) {
                       ex.printStackTrace();
                   }
                   AlarmMessage msg = new AlarmMessage(businessErrCode);
                   errMsg = businessErrCode + " " + msg.getMessage();
       
               }
               テスト用リリース時はコメント部 */
               // =========================================================
       
           }
       //=========================================================================
       
        //}}user_implement_dev:original

	//////////////////////////////

}
