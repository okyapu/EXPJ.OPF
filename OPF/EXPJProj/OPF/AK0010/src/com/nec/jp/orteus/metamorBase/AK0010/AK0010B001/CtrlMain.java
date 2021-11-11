/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AK0010/src/com/nec/jp/orteus/metamorBase/AK0010/AK0010B001/CtrlMain.java,v $
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
 *                     ,EXPLANNER/J用に改造
 * 3.0.0.0 (2003/12/10),処理結果を利用可能にする修正
 * 2.0.0.0 (2002/05/27),new foundation対応
 *
 */

package com.nec.jp.orteus.metamorBase.AK0010.AK0010B001;

import com.nec.jp.orteus.util.*;
import com.nec.jp.orteus.xaf.foundation.*;
import com.nec.jp.orteus.xaf.util.*;
import com.nec.jp.orteus.xaf.ba.*;

import java.lang.Number.*;
import java.util.*;
import java.io.*;
import java.text.*;
import java.sql.*;

//{{user_implement_dev:import
 // TODO: ここにimportパッケージを記述してください
//}}user_implement_dev:import

/**
 * CLASS     : CtrlMain クラス
 * ファイル・クラス説明
 * @author $Author: shan-xiuqin $
 * @version $Revision: 1.9 $ $Date: 2016/05/23 08:26:41 $
 */

//{{user_implement_dev:header
import java.util.Date;
import com.nec.jp.orteus.metamorBase.common.util.Converter;
import com.nec.jp.orteus.metamorBase.common.util.ScreenParam;
import com.nec.jp.orteus.metamorBase.common.CollectNumber.Numbering;
import com.nec.jp.orteus.metamorBase.util.BusinessLock.BusinessLock;
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessage;
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessageAccessor;
import com.nec.jp.orteus.metamorBase.common04.DateCtrl.DateCtrl;
//import com.nec.jp.orteus.metamorBase.common.WorkDay.WorkDay;
import com.nec.jp.orteus.expj.util.*;
//import com.nec.jp.orteus.expj.util.ExpjMessage;
//}}user_implement_dev:header

public class CtrlMain extends Object
		implements IBatchAppCommon
{

	//////////////////////////////

	/**
	 * mediatorクラス インスタンス
	 */
	public medAK0010B001 m_med=null;

	/**
	 * controlクラス インスタンス
	 */
	protected interControl m_control=null;

	/**
	 * コンダクタクラスインスタンス
	 */
	protected BatchAppConductor m_conductor;

	/**
	 * ログ部品インスタンス
	 */
	public DisplayMessageUtil objMessage = new DisplayMessageUtil();

	/**
	 * 処理結果ステータス
	 */
	public static int m_status = 0;
	public static int getExecuteStatus() { return m_status; }
	public static void setExecuteStatus(int status) { m_status = status; }

	//////////////////////////////

	/**
	 * CtrlMainクラスのコンストラクタ
	 *
		 */
	public CtrlMain(medAK0010B001 med, BatchAppConductor cdr) throws BatchAppException
	{
		// メンバ変数を初期化します
		m_conductor = cdr;
		m_med = med;
		m_control = new interControl(med);

		return;
	}

	//{{user_implement_code
       
        //////////////////////////////
        // コードジェネレータは、以下のコードへの上書きを行いません
       
        /** エラーリスト */
        List errCodeList = new ArrayList();
        
        /** エラーノート */
        Hashtable errNoteHash = new Hashtable();
        
        /** エラー工場コード */
        Hashtable errPlantCdHash = new Hashtable();
        
        /**
         * エラーノートセッター
         * @param note エラーノート
         */
        public void setErrNote(String note) {
         errNoteHash.put(Integer.toString(errCodeList.size() - 1), note);
        }
        /**
         * エラー工場コードセッター
         * @param code 工場コード
         */
        public void setErrPlantCd(String code) {
         errPlantCdHash.put(Integer.toString(errCodeList.size() - 1), code);
        }
        
        /**
         * 最終日次処理実行日チェック
         * @param plantCd 工場コード
         * @param businessName 業務名
         * @param functionName 機能名
         * @param userId ユーザID
         * @param dailyprocDate 日次処理対象日
         * @return boolean true 正常終了 : false 異常終了
         */
        public boolean checkFinalDailyProcExecDate(String plantCd, String businessName,
          String functionName, String userId, String dailyprocDate) {
         
         String allfinalDay = null;
         try{
          ExpjMessage emsg = new ExpjMessage("ZZ01006", 
            "(SBM1006)●●●最終日次処理実行日チェック●●●");
          m_med.getSyslog().info(emsg, userId);
          m_med.setfinalPlantCd(plantCd);
          
          // 最終日次処理実行日の取得
          m_med.setprogramCd(businessName);
          m_med.setfunctionName(functionName);
          AbstractBatchAppEntity readFinalDailyProcExecDate
            = m_med.getreadFinalDailyProcExecDate();
          
          try {
           readFinalDailyProcExecDate.read();
          } catch (Exception e) {
           errCodeList.add("ZZ01106");// サーバでエラーが発生しました。
           setErrNote("(SBM0620)工場コード：[ " + plantCd + " ]");
           setErrPlantCd(plantCd);
           emsg = new ExpjMessage("ZZ01006", "(SBM1007)最終日次処理実行日の読込みに失敗しました。");
           m_med.getSyslog().severe(emsg, userId);
           return false;
          }
          
          if (readFinalDailyProcExecDate.next()) {
           allfinalDay = m_med.getfinalDailyProcExecDate();
          } else {
           errCodeList.add("AK00005"); // 最終日次処理実行日が存在しません。
           setErrNote("(SBM0620)工場コード：[ " + plantCd + " ]");
           setErrPlantCd(plantCd);
           emsg = new ExpjMessage("ZZ01006", "(SBM1008)最終日次処理実行日が存在しません。");
           m_med.getSyslog().severe(emsg, userId);
           return false;
          }
          // 日付成形
          Date dateallDailyprocDate = Converter.strToDate(dailyprocDate,Converter.SLASH_DATE);
          Date dateallFinalDay = Converter.strToDate(allfinalDay,Converter.SLASH_DATE);
          
          if (dateallDailyprocDate.compareTo(dateallFinalDay) < 0){
           // 引数がこの Date と等しい Date の場合は値 0。
           // 引数がこの Date より後の Date の場合は 0 より小さい値。
           // 引数がこの Date の前の Date の場合は 0 より大きい値
           //「日次処理対象日」＜［日次処理制御］."最終日次処理実行日"エラー
           errCodeList.add("AK33232");//過去の日次処理は実行できません。
           setErrNote("(SBM0627)工場コード：[ " + plantCd + " ] 日次処理対象日：[ " 
             + dailyprocDate + " ] 最終日次処理実行日：[ " + allfinalDay + " ]");
           setErrPlantCd(plantCd);
           emsg = new ExpjMessage("ZZ01006", 
             "(SBM1009)「日次処理対象日」＜［日次処理制御］.最終日次処理実行日エラー");
           m_med.getSyslog().severe(emsg, userId);
           return false;
          } else if (dateallDailyprocDate.compareTo(dateallFinalDay) == 0) {
           //「日次処理対象日」＝［日次処理制御］."最終日次処理実行日"ワーニング
           errCodeList.add("AK00017");//処理済の日付で再度処理を行いました。
           setErrNote("(SBM0627)工場コード：[ " + plantCd + " ] 日次処理対象日：[ " 
             + dailyprocDate + " ] 最終日次処理実行日：[ " + allfinalDay + " ]");
           setErrPlantCd(plantCd);
           emsg = new ExpjMessage("ZZ01006", 
           "(SBM1010)「日次処理対象日」＝［日次処理制御］.最終日次処理実行日ワーニング");
           m_med.getSyslog().warning(emsg, userId);
          }
         } catch (Exception e) {
          errCodeList.add("ZZ01106");// サーバでエラーが発生しました。
          setErrNote("(SBM0627)工場コード：[ " + plantCd + " ] 日次処理対象日：[ " 
            + dailyprocDate + " ] 最終日次処理実行日：[ " + allfinalDay + " ]");
          setErrPlantCd(plantCd);
          ExpjMessage emsg = new ExpjMessage("ZZ01006", 
            "(SBM1011)最終日次処理実行日チェックで失敗しました。");
          m_med.getSyslog().severe(emsg, userId);
          return false;
         }
         return true;
        }
        
        /**
         * ストアドプロシージャ実行
         * @param logMode ログモード
         * @param outputMode 出力モード
         * @param outputPath 出力ファイルパス
         * @param outputName 出力ファイル名
         * @param userId ユーザID
         * @param businessName 業務名
         * @param plantCd 工場コード
         * @param dailyprocDate 日次処理対象日
         * @param nextBusinessOprDate 翌業務運用日
         * @return boolean true 正常終了 : false 異常終了
         */
        public boolean spExecute(String logMode, String outputMode, String outputPath, 
          String outputName, String userId, String businessName, String plantCd, 
          String dailyprocDate, String nextBusinessOprDate) {
         
         try {
          // ストアドプロシージャのパラメータをセットする
          m_med.setpvc2LogMode(logMode);
          m_med.setpvc2OutputMode(outputMode);
          m_med.setpvc2OutputPath(outputPath);
          m_med.setpvc2OutputName(outputName);
          m_med.setpvc2UserId(userId);
          m_med.setpvc2BusinessName(businessName);
          m_med.setpvc2PlantCd(plantCd);
          m_med.setpvc2FinalDailyProcExecDate(dailyprocDate);
          m_med.setpvc2BusinessOprDate(nextBusinessOprDate);
          
          ExpjMessage emsg = new ExpjMessage("ZZ01006", 
            "(SBM0891)●●●ストアドプロシージャのパラメータセット●●●");
          m_med.getSyslog().info(emsg, userId);
          emsg = new ExpjMessage("ZZ01006", "　　●logModeTyp = " + logMode);
          m_med.getSyslog().info(emsg, userId);
          emsg = new ExpjMessage("ZZ01006", "　　●outputMode = " + outputMode);
          m_med.getSyslog().info(emsg, userId);
          emsg = new ExpjMessage("ZZ01006", "　　●outputPath = " + outputPath);
          m_med.getSyslog().info(emsg, userId);
          emsg = new ExpjMessage("ZZ01006", "　　●outputName = " + outputName);
          m_med.getSyslog().info(emsg, userId);
          emsg = new ExpjMessage("ZZ01006", "　　●userId = " + userId);
          m_med.getSyslog().info(emsg, userId);
          emsg = new ExpjMessage("ZZ01006", "　　●businessName = " + businessName);
          m_med.getSyslog().info(emsg, userId);
          emsg = new ExpjMessage("ZZ01006", "　　●plantCd = " + plantCd);
          m_med.getSyslog().info(emsg, userId);
          emsg = new ExpjMessage("ZZ01006", "　　●FinalDailyProcExecDate = " + dailyprocDate);
          m_med.getSyslog().info(emsg, userId);
          emsg = new ExpjMessage("ZZ01006", "　　●BusinessOprDate = " + nextBusinessOprDate);
          m_med.getSyslog().info(emsg, userId);
          
          // ストアドプロシージャの実行
          try {
           emsg = new ExpjMessage("ZZ01006", "(SBM0892)●●●　SP実行　●●●");
           m_med.getSyslog().info(emsg, userId);
           m_med.getcallSqlDailyProc().call();
          } catch (Exception e) {
           errCodeList.add("AK00009");//ストアドプロシージャ実行時エラー
           StringBuffer sb = new StringBuffer();
           sb.append("(SBM0577)ストアドプロシージャ引数：[ ");
           sb.append(logMode + " ");
           sb.append(outputMode + " ");
           sb.append(outputPath + " ");
           sb.append(outputName + " ");
           sb.append(userId + " ");
           sb.append(businessName + " ");
           sb.append(plantCd + " ");
           sb.append(dailyprocDate + " ");
           sb.append(nextBusinessOprDate + " ");
           sb.append(" ]");
           
           String errNote = sb.toString();
           //エラーノート追加
           setErrNote(errNote);
           setErrPlantCd(plantCd);
           return false;
          }
         } catch (Exception e) {
          errCodeList.add("AK00007");//バッチパラメータの読み込みに失敗しました
          setErrNote("(SBM0580)ユーザコード：[ " + userId + " ] 工場コード：[ " + plantCd + " ]");
          setErrPlantCd(plantCd);
          ExpjMessage emsg = new ExpjMessage("ZZ01006", 
            "(SBM0925)バッチパラメータの読み込みに失敗しました。");
          m_med.getSyslog().severe(emsg, userId);
          return false;
         }
         return true;
        }
        
        /**
         * CtrlMainクラスの標準コンストラクタ
         *
         */
        public CtrlMain(medAK0010B001 med) throws BatchAppException
        {
         // メンバ変数を初期化します
         m_med = med;
         m_control = new interControl(med);
       
         // todo: インスタンス初期化時に実行する処理を記述してください
       
         return;
        }
       
        /**
         * インスタンス破壊時に行う処理
         *
         */
        public void finalize()
        {
         // 各メンバ変数の初期化
         m_med = null;
         m_control = null;
         objMessage = null;
       
         // todo: インスタンス消滅時に実行する処理を記述してください
       
         return;
        }
       
        //////////////////////////////
       
        /**
         * main： ユーザ定義用メソッドです<br>
         * <<説明を記述してください>>
         *
         * @return <<説明を記述してください>>
         * @exception <<説明を記述してください>>
         */
        public int main() throws BatchAppException
        {
       /*
       
         // todo: ここにユーザ定義コードを記述してください
       
       */
         IDbConnection conn = null;	  // DBコネクション
         BusinessLock Lock = null;     // 業務ロック
         int lockCancelKey = 0;	      // ロック解除キー
         
         // metamorBase業務メッセージ
         BusinessMessageAccessor businessMsgAcc = null;
         BusinessMessage businessMsg = null;     // metamorBase業務メッセージ
         
         // 夜間バッチかマニュアルか
         int batchProcessingTyp = 0;   // 1: 夜間バッチ（自動運転）2: マニュアル（自動運転なし）
         
         // ストアドプロシージャ名
         String functionName = "SQLDAILYPROC";  // 日次処理
         
         // ストアドプロシージャパラメータ
         String logMode = null;             // ログモード
         String outputMode = null;          // 出力モード
         String outputPath = null;          // 出力パス
         String outputName = null;          // 出力ファイル名
         String userId = null;              // ユーザID
         String businessName = null;        // 業務名（バッチ処理ID）
         String plantCd = null;             // 工場コード
         String dailyprocDate = null;       // 日次処理対象日
         String nextBusinessOprDate = null; // 翌業務運用日
         
         // 業務名（バッチ処理ID）の取得
         Class myClass = this.getClass();
         businessName = myClass.getName();
         businessName = businessName.substring(businessName.length() - 19, 
           businessName.length()-9);
         
         // main引数受け取り
         String args[] = m_med.getArgs();
         
         // パラメータ確認
         int argsLength = args.length;   // 引数の個数を保持
         
         try {
          // コネクションの取得
          ScreenParam sp = new ScreenParam(this.getClass());
          conn = m_conductor.m_transactionConn;
          Hashtable plantHash = new Hashtable();
          
          // 業務メッセージの準備（引数が渡ってくる前用）
          businessMsgAcc = new BusinessMessageAccessor();
          businessMsg = new BusinessMessage();
          businessMsgAcc.init(conn);
          businessMsg.setBusinessOperatingName(sp.getPackageName(ScreenParam.SHORT));
          businessMsg.setUser("SYSTEM");
          businessMsg.setPlantCode("##");
          
       // 引数の妥当性をチェックし、変数にセットする -----------------------------------------------------
          if (argsLength != 5 && argsLength != 3) {
           userId = "SYSTEM";
           businessName = sp.getPackageName(ScreenParam.SHORT);
           plantCd = "##";
           errCodeList.add("AK00006");// バッチ処理引数の形式が不正です
           setErrNote("(SBM0617)バッチ処理引数数：[ " + argsLength + " ]");
           setErrPlantCd(plantCd);
           Exception e = new Exception();
           ExpjMessage emsg = emsg 
             = new ExpjMessage("ZZ01006", "(SBM0957)バッチ処理引数の数が不正です");
           m_med.getSyslog().severe(emsg, userId);
           throw e;
          }
          
          batchProcessingTyp = Integer.parseInt(args[0]);
          userId = args[1];
          plantCd = args[2];
          if (argsLength == 5) {
           dailyprocDate = args[3];       // 日次処理対象日
           nextBusinessOprDate = args[4]; // 翌業務運用日
          }
          
          ExpjMessage emsg = new ExpjMessage("ZZ01006", "(SBM0958)●●●　バッチ引数受取　●●●");
          m_med.getSyslog().info(emsg, userId);
          emsg = new ExpjMessage("ZZ01006", "　　●batchProcessingTyp = " + batchProcessingTyp);
          m_med.getSyslog().info(emsg, userId);
          emsg = new ExpjMessage("ZZ01006", "　　●userId = " + userId);
          m_med.getSyslog().info(emsg, userId);
          emsg = new ExpjMessage("ZZ01006", "　　●plantCd = " + plantCd);
          m_med.getSyslog().info(emsg, userId);
          emsg = new ExpjMessage("ZZ01006", "　　●dailyprocDate = " + dailyprocDate);
          m_med.getSyslog().info(emsg, userId);
          emsg = new ExpjMessage("ZZ01006", "　　●nextBusinessOprDate = " + nextBusinessOprDate);
          m_med.getSyslog().info(emsg, userId);
          Lock = new BusinessLock(conn, userId, plantCd);
          // 引数に「null」が入っていた場合。（必須項目）
          if (userId == null || userId.equals("null") || userId.equals("Null") 
            || userId.equals("NULL")) {
           // バッチ処理引数の形式が不正です
           errCodeList.add("AK00006");
           setErrNote("(SBM0619)ユーザコード：[ " + userId + " ]");
           userId = "SYSTEM";
           plantCd = "##";
           setErrPlantCd(plantCd);
           Exception e = new Exception();
           emsg = new ExpjMessage("ZZ01006", "(SBM0839)ユーザコードが未入力です。");
           m_med.getSyslog().severe(emsg, userId);
           throw e;
          }
          
          if (plantCd == null || plantCd.equals("null") 
            || plantCd.equals("Null") || plantCd.equals("NULL")) {
           // バッチ処理引数の形式が不正です
           errCodeList.add("AK00006");
           setErrNote("(SBM0620)工場コード：[ " + plantCd + " ]");
           userId = "SYSTEM";
           plantCd = "##";
           setErrPlantCd(plantCd);
           Exception e = new Exception();
           emsg = new ExpjMessage("ZZ01006", "(SBM0840)工場コードが未入力です。");
           m_med.getSyslog().severe(emsg, userId);
           throw e;
          }
          // 業務メッセージの準備
          businessMsg.setBusinessOperatingName(businessName);
          businessMsg.setUser(userId);
          businessMsg.setPlantCode(plantCd);
          
          if (batchProcessingTyp != 1 && batchProcessingTyp != 2) {
           // バッチ処理引数の形式が不正です
           errCodeList.add("AK00006");
           setErrNote("(SBM0621)バッチプロセスタイプ：[ " + batchProcessingTyp + " ]");
           setErrPlantCd(plantCd);
           Exception e = new Exception();
           emsg = new ExpjMessage("ZZ01006", "(SBM0841)バッチプロセスタイプが不正です。");
           m_med.getSyslog().severe(emsg, userId);
           throw e;
          }
          
          if (batchProcessingTyp != 1 || argsLength != 3) {
           if (dailyprocDate == null || dailyprocDate.equals("null") 
             || dailyprocDate.equals("Null") || dailyprocDate.equals("NULL")) {
            // バッチ処理引数の形式が不正です
            errCodeList.add("AK00006");
            setErrNote("(SBM0628)日次処理対象日：[ " + dailyprocDate + " ]");
            setErrPlantCd(plantCd);
            Exception e = new Exception();
            emsg = new ExpjMessage("ZZ01006", "(SBM1012)日次処理対象日が未入力です。");
            m_med.getSyslog().severe(emsg, userId);
            throw e;
           }
           
           if (nextBusinessOprDate == null || nextBusinessOprDate.equals("null") 
             || nextBusinessOprDate.equals("Null") 
             || nextBusinessOprDate.equals("NULL")) {
            // バッチ処理引数の形式が不正です
            errCodeList.add("AK00006");
            setErrNote("(SBM0629)翌業務運用日：[ " + nextBusinessOprDate + " ]");
            setErrPlantCd(plantCd);
            Exception e = new Exception();
            emsg = new ExpjMessage("ZZ01006", "(SBM1013)翌業務運用日が未入力です。");
            m_med.getSyslog().severe(emsg, userId);
            throw e;
           }
          }
          
          // バッチパラメータtableから、ストアド共通パラメータを読み込む
          m_med.setprogramCd(businessName);
          m_med.setfunctionName(functionName);
          emsg = new ExpjMessage("ZZ01006", "businessName : " + businessName);
          m_med.getSyslog().info(emsg, userId);
          emsg = new ExpjMessage("ZZ01006", "functionName : " + functionName);
          m_med.getSyslog().info(emsg, userId);
          AbstractBatchAppEntity sysBatParam = m_med.getreadSysBatParm();
          
          try {
           sysBatParam.read();
          } catch (Exception e) {
           errCodeList.add("AK00007");// バッチパラメータの読み込みに失敗しました
           setErrNote("(SBM0580)ユーザコード：[ " + userId + " ] 工場コード：[ " + plantCd + " ]");
           setErrPlantCd(plantCd);
           emsg = new ExpjMessage("ZZ01006", "(SBM0925)バッチパラメータの読み込みに失敗しました");
           m_med.getSyslog().severe(emsg, userId);
           throw e;
          }
          
          emsg = new ExpjMessage("ZZ01006", m_med.getfilePath());
          m_med.getSyslog().info(emsg, userId);
          
          if (sysBatParam.next()) {
           logMode = m_med.getlogModeTyp().toString();
           outputMode = m_med.getoutputModeTyp().toString();
           outputPath = m_med.getfilePath();
           outputName = m_med.getfileName();
          } else {
           errCodeList.add("AK00008");// バッチパラメータデータが存在しません
           setErrNote("(SBM0580)ユーザコード：[ " + userId + " ] 工場コード：[ " + plantCd + " ]");
           setErrPlantCd(plantCd);
           Exception e = new Exception();
           emsg = new ExpjMessage("ZZ01006", "(SBM0576)バッチパラメータデータが存在しません");
           m_med.getSyslog().severe(emsg, userId);
           throw e;
          }
          
       // 入力チェック************************************************************************************
          // 夜間バッチ（自動運転）の場合
          if (batchProcessingTyp == 1) {
           
           // ユーザIDが存在するかどうか
           m_med.setwhereUserCd(userId);
           
           m_med.setprogramCd(businessName);
           m_med.setfunctionName(functionName);
           AbstractBatchAppEntity checkUserCd = m_med.getcheckUserCd();
           try {
            checkUserCd.read();
           } catch (Exception e) {
            errCodeList.add("ZZ01106");// サーバでエラーが発生しました。
            setErrNote("(SBM0619)ユーザコード：[ " + userId + " ]");
            setErrPlantCd(plantCd);
            emsg = new ExpjMessage("ZZ01006", "(SBM0927)ユーザコードの読込みに失敗しました。");
            m_med.getSyslog().severe(emsg, userId);
            throw e;
           }
           
           if (checkUserCd.next()) {
            String chUserCd = m_med.getchUserCd();
           } else {
            errCodeList.add("ZZ09003");// ユーザコードのパラメータが未入力です。
            setErrNote("(SBM0619)ユーザコード：[ " + userId + " ]");
            setErrPlantCd(plantCd);
            Exception e = new Exception();
            emsg = new ExpjMessage("ZZ01006", "(SBM0928)指定されたユーザコードは存在しません。");
            m_med.getSyslog().severe(emsg, userId);
            throw e;
           }
           
           // 工場コードが存在するかどうか
           m_med.setwherePlantCd(plantCd);
           
           m_med.setprogramCd(businessName);
           m_med.setfunctionName(functionName);
           AbstractBatchAppEntity checkPlantCd = m_med.getcheckPlantCd();
           try {
            checkPlantCd.read();
           } catch (Exception e) {
            errCodeList.add("AK00014");//工場コードの読込みに失敗しました。
            setErrNote("(SBM0620)工場コード：[ " + plantCd + " ]");
            setErrPlantCd(plantCd);
            emsg = new ExpjMessage("ZZ01006", "(SBM0929)工場コードの読込みに失敗しました。");
            m_med.getSyslog().severe(emsg, userId);
            throw e;
           }
           if (checkPlantCd.next()) {
            String chPlantCd = m_med.getchPlantCd();
           } else {
            errCodeList.add("AK00001");// 指定された工場は存在しません。
            setErrNote("(SBM0620)工場コード：[ " + plantCd + " ]");
            setErrPlantCd(plantCd);
            Exception e = new Exception();
            emsg = new ExpjMessage("ZZ01006", "(SBM0930)指定された工場は存在しません。");
            m_med.getSyslog().severe(emsg, userId);
            throw e;
           }
           
           if (batchProcessingTyp != 1 || argsLength != 3) {
            // 入力日付のチェック
            // Calendar型の日付を用意
            Calendar calDailDate = Calendar.getInstance();
            Calendar calNextDate = Calendar.getInstance();
            // "yyyy/MM/dd"の日付フォーマットを生成
            //DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
            //df.setLenient(false);  // 日付解釈のあいまいさをなくす
            try {
             //日次処理対象日形式チェック
             //calDailDate.setTime(df.parse(dailyprocDate));
             calDailDate.setTime(Converter.strToDate(dailyprocDate, "yyyy/MM/dd"));
            } catch (ParseException e) {
             errCodeList.add("AK00015");// 日次処理対象日の形式が不正です。
             setErrNote("(SBM0628)日次処理対象日：[" + dailyprocDate + "]");
             setErrPlantCd(plantCd);
             emsg = new ExpjMessage("ZZ01006", "(SBM1014)日次処理対象日の形式が不正です。");
             m_med.getSyslog().severe(emsg, userId);
             throw e;
            }
            try {
             //翌業務運用日の形式チェック
             //calNextDate.setTime(df.parse(nextBusinessOprDate));
             calNextDate.setTime(Converter.strToDate(nextBusinessOprDate, "yyyy/MM/dd"));
            } catch (ParseException e) {
             errCodeList.add("AK00016");// 翌業務運用日の形式が不正です。
             setErrNote("(SBM0629)翌業務運用日：[ " + nextBusinessOprDate + " ]");
             setErrPlantCd(plantCd);
             emsg = new ExpjMessage("ZZ01006", "(SBM1015)翌業務運用日の形式が不正です。");
             m_med.getSyslog().severe(emsg, userId);
             throw e;
            }
            
            // 日付型を文字列（"yyyy/MM/dd"）に変換
            //dailyprocDate = df.format(calDailDate.getTime());
            dailyprocDate = Converter.dateToStr(calDailDate.getTime(), "yyyy/MM/dd");
            //nextBusinessOprDate = df.format(calNextDate.getTime());
            nextBusinessOprDate = Converter.dateToStr(calNextDate.getTime(), "yyyy/MM/dd");
       
            // 「日次処理対象日」＞［翌業務運用日］のチェック
            if (dailyprocDate.compareTo(nextBusinessOprDate) > 0) {
             errCodeList.add("AK33231");
             setErrNote("(SBM0630)日次処理対象日：[ " + dailyprocDate 
               + " ] 翌業務運用日：[ " + nextBusinessOprDate + " ]");
             setErrPlantCd(plantCd);
             Exception e = new Exception();
             emsg = new ExpjMessage("ZZ01006", 
               "(SBM1016)「日次処理対象日」＞［翌業務運用日］のエラー");
             m_med.getSyslog().severe(emsg, userId);
             throw e;
            }
           }
          }
          
          if (batchProcessingTyp == 1 && argsLength == 3) {
           // 業務運用日の取得
           DateCtrl dateCtrl = new DateCtrl(conn);
           String oprDate = dateCtrl.getBusinessOprDate(plantCd);
           
           // 翌業務運用日の取得
           Date dateBusinessOprDate = 
             Converter.strToDate(
              oprDate,
              Converter.SLASH_DATE);
           WorkCalendar nextWorkDay = 
             new WorkCalendar(conn,userId,
              businessName,
              plantCd,dateBusinessOprDate,1,false);
           Date nextBusinessDate = nextWorkDay.calcDate();
           
           if (nextBusinessDate == null || nextBusinessDate.equals("")) {
            // 翌業務運用日の読み込みに失敗いたしました。
            errCodeList.add("AK00012");// 翌業務運用日の読み込みに失敗いたしました。
            setErrNote("");
            setErrPlantCd(plantCd);
            Exception e = new Exception();
            emsg = emsg = new ExpjMessage("ZZ01006", 
              "(SBM1017)翌業務運用日の読み込みに失敗いたしました。");
            m_med.getSyslog().severe(emsg, userId);
            throw e;
           }
           dailyprocDate = oprDate;       // 日次処理対象日
           nextBusinessOprDate = Converter.dateToStr(nextBusinessDate, 
             Converter.SLASH_DATE); // 翌業務運用日
          }
          
          // 業務ロックをかける
          emsg = new ExpjMessage("ZZ01006", "(SBM0842)◎◎◎　業務ロック開始　◎◎◎" + plantCd);
          m_med.getSyslog().info(emsg, userId);          
          lockCancelKey = Lock.doLock(businessName);  // 解除キーの取得
          // lockCancelKey==-1の場合も業務ロックされているのエラー
          if(lockCancelKey == -1){
           errCodeList.add("ZZ01001");// 業務ロックされているため起動できません
           setErrNote("(SBM0580)ユーザコード：[ " + userId 
             + " ] 工場コード：[ " + plantCd + " ]");
           setErrPlantCd(plantCd);
           emsg = new ExpjMessage("ZZ01006", "(SBM0843)業務ロックされているため起動できません");
           m_med.getSyslog().severe(emsg, userId);
           throw new Exception("");
          }
          conn.commit();
          if (batchProcessingTyp == 1) {
           //最終日次処理実行日チェック
           if (!checkFinalDailyProcExecDate(plantCd, businessName, functionName,
             userId, dailyprocDate)) {
            //結果がfalseの場合もロック解除失敗のエラー
            emsg = new ExpjMessage("ZZ01006", 
              "(SBM1344)◎◎◎　業務ロック解除　◎◎◎" + plantCd);
            m_med.getSyslog().info(emsg, userId);
            if (!Lock.doUnLock(businessName, lockCancelKey)) {
             throw new FoundationException("CtrlMain", "main", "ZZ01004");
            }
            throw new Exception("");
           }
          }
          
          //SP実行
          if (!spExecute(logMode, outputMode, outputPath, outputName, userId,
            businessName, plantCd, dailyprocDate, nextBusinessOprDate)) {
           //結果がfalseの場合もロック解除失敗のエラー
           emsg = new ExpjMessage("ZZ01006", 
             "(SBM1344)◎◎◎　業務ロック解除　◎◎◎" + plantCd);
           m_med.getSyslog().info(emsg, userId);
           if (!Lock.doUnLock(businessName, lockCancelKey)) {
            throw new FoundationException("CtrlMain", "main", "ZZ01004");
           }
           throw new Exception("");
          }
          //結果がfalseの場合もロック解除失敗のエラー
          emsg = new ExpjMessage("ZZ01006", "(SBM1344)◎◎◎　業務ロック解除　◎◎◎" + plantCd);
          m_med.getSyslog().info(emsg, userId);
          if (!Lock.doUnLock(businessName, lockCancelKey)) {
           throw new FoundationException("CtrlMain", "main", "ZZ01004");
          }
          conn.commit();
       
         } catch (Exception e) {
          try{
           conn.rollback();
		   throw new BatchAppException("CtrlMain", "main", e.getMessage());
          }catch(FoundationException fe){}
          e.printStackTrace();
          if (errCodeList == null || errCodeList.size() == 0) {
           errCodeList.add("AK00010");//その他　Ｅｒｒｏｒ
           setErrNote("(SBM0580)ユーザコード：[ " + userId + " ] 工場コード：[ " + plantCd + " ]");
           setErrPlantCd(plantCd);
           ExpjMessage emsg = new ExpjMessage("ZZ01006", "(SBM1363)その他　Ｅｒｒｏｒ");
           m_med.getSyslog().severe(emsg, userId);
          }
         } finally {
          try {
           for(int i = 0; i < errCodeList.size(); i++) {
            String errCode = (String)errCodeList.get(i);
            String errNote = (String)errNoteHash.get(Integer.toString(i));
            String errPlantCd = (String)errPlantCdHash.get(Integer.toString(i));
            
            // 業務メッセージの登録
            if (businessMsg != null) {
             try{
              Numbering numbering = new Numbering(conn, Numbering.LOG_CD, userId, 
                businessName, errPlantCd);
              businessMsg.setLogCode(numbering.getNo());
              businessMsg.setPlantCode(errPlantCd);
              businessMsg.setMessageCode(errCode);
              businessMsg.setData(errNote);
              businessMsgAcc.add(businessMsg);
              ExpjMessage emsg = new ExpjMessage("ZZ01006", 
                "(SBM0836)●●●　業務メッセージの登録　●●● <" + (i + 1) 
                + "/" + errCodeList.size() + ">");
              m_med.getSyslog().severe(emsg, userId);
              emsg = new ExpjMessage("ZZ01006", 
                "　　●No:" + businessMsg.getLogCode() + " errCode:" 
                + errCode + " errNote:" + errNote);
              m_med.getSyslog().severe(emsg, userId);
             } catch (Exception ex) {
              ex.printStackTrace();
             }
            }
           }
           conn.commit();
       
           ExpjMessage emsg = new ExpjMessage("ZZ01006", "(SBM1344)◎◎◎　業務ロック解除　◎◎◎");
           m_med.getSyslog().severe(emsg, userId);
           //結果がfalseの場合もロック解除失敗のエラー
           if (!Lock.doUnLock(businessName, lockCancelKey)) {
            throw new FoundationException("CtrlMain", "main", "ZZ01004");
           }

          } catch (FoundationException e) {
           e.printStackTrace();
           String errCode = "ZZ01004";  // 業務ロックの解除に失敗しました。
           ExpjMessage emsg = new ExpjMessage("ZZ01006", "(SBM0846)業務ロックの解除に失敗しました。");
           m_med.getSyslog().severe(emsg, userId);
           
           try {
            // 業務メッセージの登録（業務ロック解除失敗時）
            Numbering numbering 
              = new Numbering(conn, Numbering.LOG_CD, userId, businessName, plantCd);
            businessMsg.setPlantCode(plantCd);
            businessMsg.setLogCode(numbering.getNo());
            businessMsg.setMessageCode(errCode);
            businessMsg.setData("");
            businessMsgAcc.add(businessMsg);
            emsg = new ExpjMessage("ZZ01006", 
              "(SBM1345)●●●　業務メッセージの登録　●●●");
            m_med.getSyslog().severe(emsg, userId);
            emsg = new ExpjMessage("ZZ01006", 
              "　　●No:" + businessMsg.getLogCode() + " errCode:" + errCode);
            m_med.getSyslog().severe(emsg, userId);
            
           } catch (SQLException ex) {
            ex.printStackTrace();
           } catch (FoundationException ex) {
            ex.printStackTrace();
           }
          }
         }
         return BREAK;
        }
       
       
        //////////////////////////////
       
        /**
         * object型を返します
         *
         * @return object型
         */
        public int getType()
        {
         return m_control.getType();
        }
       
        /**
         * 初期処理
         *
         * @return <<コメントを記述してください>>
         * @exception <<コメントを記述してください>>
         */
        public int beginProc() throws BatchAppException
        {
       
         // todo: ここにユーザ定義コードを記述してください
       
         return m_control.beginProc();
        }
       
        /**
         * 終了処理
         *
         * @exception <<コメントを記述してください>>
         */
        public int endProc() throws BatchAppException
        {
       
         // todo: ここにユーザ定義コードを記述してください
       
         return m_control.endProc();
        }
       
        /**
         * 終了処理
         *
         * @exception <<コメントを記述してください>>
         */
        public int execute() throws BatchAppException
        {
       
         // todo: ここにユーザ定義コードを記述してください
       
         // 処理結果をリターン値としたいときはここで設定します。
         // setExecuteStatus(0);
       
         return m_control.execute();
        }
       
        //}}user_implement_code

	//{{control_class(wizard code)

	//////////////////////////////

	class interControl
		implements IBatchAppCommon
	{

		//////////////////////////////

		/**
		 * mediatorクラス インスタンス
		 */
		public medAK0010B001 m_med=null;

		/**
		 * コンテナクラスインスタンス
		 */
		public ManageContainer m_container=null;

		//////////////////////////////

		public interControl(medAK0010B001 med) throws BatchAppException
		{
			// 各メンバ変数の初期化
			m_med = med;

			try {
				m_container = new ManageContainer();
			} catch(FoundationException e) {
				e.printStackTrace();
				throw new BatchAppException("CtrlMain", "constractor", "DBへの接続に失敗しました");
			}
			return;
		}

		protected void finalize()
		{
			m_med = null;
			return;
		}

		//////////////////////////////



		//////////////////////////////

		public int getType()
		{
			return TYPE_CONTROL;
		}

		public int beginProc() throws BatchAppException
		{
			return IBatchAppCommon.SUCCESS;
		}

		public int endProc() throws BatchAppException
		{
			int ret;

			return IBatchAppCommon.SUCCESS;
		}

		public int execute() throws BatchAppException
		{
			int ret;

			try {
				if((ret=main())!=IBatchAppCommon.SUCCESS ) return ret;
			} catch(Exception ex) {
				throw new BatchAppException("CtrlMain", "execute", "executeの処理に失敗しました");
			}

			return IBatchAppCommon.SUCCESS;
		}

		public void commit() throws BatchAppException
		{
			try {
				m_conductor.m_transactionConn.getConn().commit();
				m_conductor.m_transactionConn.getConn().setAutoCommit(false);
			} catch(SQLException e) {
				e.printStackTrace();
				throw new BatchAppException("CtrlMain", "commit", "DBへのコミット時に失敗しました(SQLException)");
			}

			return;
		}

		public void rollback() throws BatchAppException
		{
			try {
				m_conductor.m_transactionConn.getConn().rollback();
				m_conductor.m_transactionConn.getConn().setAutoCommit(false);
			} catch(SQLException e) {
				e.printStackTrace();
				throw new BatchAppException("CtrlMain", "rollback", "DBへのロールバック時に失敗しました(SQLException)");
			}

			return;
		}

		//////////////////////////////

	}

	//}}control_class(wizard code)

}
