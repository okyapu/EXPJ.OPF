/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AK0030/src/com/nec/jp/orteus/metamorBase/AK0030/AK0030B001/CtrlMain.java,v $
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

package com.nec.jp.orteus.metamorBase.AK0030.AK0030B001;

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
import com.nec.jp.orteus.metamorBase.common.util.ScreenParam;
import com.nec.jp.orteus.metamorBase.common.CollectNumber.Numbering;
import com.nec.jp.orteus.metamorBase.util.BusinessLock.BusinessLock;
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessage;
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessageAccessor;
import com.nec.jp.orteus.expj.util.ExpjMessage;
//}}user_implement_dev:import

/**
 * CLASS     : CtrlMain クラス
 * ファイル・クラス説明
 * @author $Author: shan-xiuqin $
 * @version $Revision: 1.7 $ $Date: 2016/05/23 08:28:18 $
 */

//{{user_implement_dev:header
//}}user_implement_dev:header

public class CtrlMain extends Object
		implements IBatchAppCommon
{

	//////////////////////////////

	/**
	 * mediatorクラス インスタンス
	 */
	public medAK0030B001 m_med=null;

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
	public CtrlMain(medAK0030B001 med, BatchAppConductor cdr) throws BatchAppException
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
        
        /**
         * エラーノートセッター
         * @param note エラーノート
         */
        public void setErrNote(String note) {
         errNoteHash.put(Integer.toString(errCodeList.size() - 1), note);
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
         * @param stepFlg ステップフラグ
         * @return boolean true 正常終了 : false 異常終了
         */
        public boolean spExecute(String logMode, String outputMode, String outputPath, 
          String outputName, String userId, String businessName, 
          String plantCd, String stepFlg) {
         try {
          // ストアドプロシージャのパラメータをセットする
          m_med.setpvc2LogMode(logMode);
          m_med.setpvc2OutputMode(outputMode);
          m_med.setpvc2OutputPath(outputPath);
          m_med.setpvc2OutputName(outputName);
          m_med.setpvc2UserId(userId);
          m_med.setpvc2BusinessName(businessName);
          m_med.setpvc2PlantCd(plantCd);
          m_med.setpvc2StepFlg(stepFlg);
       
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
          emsg = new ExpjMessage("ZZ01006", "　　●stepFlg = " + stepFlg);
          m_med.getSyslog().info(emsg, userId);
          
          // ストアドプロシージャの実行
          try {
           emsg = new ExpjMessage("ZZ01006", "(SBM0892)●●●　SP実行　●●●");
           m_med.getSyslog().info(emsg, userId);
           m_med.getcallSqlCommItemChgExec().call();
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
           sb.append(stepFlg + " ");
           sb.append(" ]");
           
           String errNote = sb.toString();
           //エラーノート追加
           setErrNote(errNote);
           return false;
          }
         } catch (Exception e) {
          errCodeList.add("AK00007");//バッチパラメータの読み込みに失敗しました
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
        public CtrlMain(medAK0030B001 med) throws BatchAppException
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
         String functionName = "SQLCOMMITEMCHGEXEC";  // 販売情報取込指示処理
         
         // ストアドプロシージャパラメータ
         String logMode = null;             // ログモード
         String outputMode = null;          // 出力モード
         String outputPath = null;          // 出力パス
         String outputName = null;          // 出力ファイル名
         String userId = null;              // ユーザID
         String businessName = null;        // 業務名（バッチ処理ID）
         String plantCd = null;             // 工場コード
         String stepFlg = null;             // ステップフラグ
         
         // 業務名（バッチ処理ID）の取得
         Class myClass = this.getClass();
         businessName = myClass.getName();
         businessName 
           = businessName.substring(businessName.length() - 19, businessName.length() - 9);
         
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
       
       // 引数の妥当性をチェックし、変数にセットする -----------------------------------------------------------
          if (argsLength != 4) {
        	 userId = "SYSTEM";
           businessName = sp.getPackageName(ScreenParam.SHORT);
           plantCd = "##";
           errCodeList.add("AK00006");// バッチ処理引数の形式が不正です
           setErrNote("(SBM0617)バッチ処理引数数：[ " + argsLength + " ]");
           Exception e = new Exception();
           ExpjMessage emsg = new ExpjMessage("ZZ01006", 
             "(SBM0957)バッチ処理引数の数が不正です");
           m_med.getSyslog().severe(emsg, userId);
           throw e;
          }
          
          batchProcessingTyp = Integer.parseInt(args[0]);
          userId = args[1];
          plantCd = args[2];
          stepFlg = args[3];       // ステップフラグ
       
          ExpjMessage emsg = new ExpjMessage("ZZ01006", 
            "(SBM0958)●●●　バッチ引数受取　●●●");
          m_med.getSyslog().info(emsg, userId);
          emsg = new ExpjMessage("ZZ01006", "　　●batchProcessingTyp = " + batchProcessingTyp);
          m_med.getSyslog().info(emsg, userId);
          emsg = new ExpjMessage("ZZ01006", "　　●userId = " + userId);
          m_med.getSyslog().info(emsg, userId);
          emsg = new ExpjMessage("ZZ01006", "　　●plantCd = " + plantCd);
          m_med.getSyslog().info(emsg, userId);
          emsg = new ExpjMessage("ZZ01006", "　　●stepFlg = " + stepFlg);
          m_med.getSyslog().info(emsg, userId);
       
          // 引数に「null」が入っていた場合。（必須項目）
          if (userId == null || userId.equals("null") 
            || userId.equals("Null") || userId.equals("NULL")) {
           // バッチ処理引数の形式が不正です
           errCodeList.add("AK00006");
           setErrNote("(SBM0619)ユーザコード：[ " + userId + " ]");
           userId = "SYSTEM";
           plantCd = "##";
           Exception e = new Exception();
           emsg = new ExpjMessage("ZZ01006", "(SBM0839)ユーザコードが未入力です。");
           m_med.getSyslog().severe(emsg, userId);
           throw e;
          }
          if	(plantCd == null || plantCd.equals("null") 
            || plantCd.equals("Null") || plantCd.equals("NULL"))	{
           // バッチ処理引数の形式が不正です
           errCodeList.add("AK00006");
           setErrNote("(SBM0620)工場コード：[ " + plantCd + " ]");
           userId = "SYSTEM";
           plantCd = "##";
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
           Exception e = new Exception();
           emsg = new ExpjMessage("ZZ01006", "(SBM0841)バッチプロセスタイプが不正です。");
           m_med.getSyslog().severe(emsg, userId);
           throw e;
          }
          if (stepFlg == null || stepFlg.equals("null") 
            || stepFlg.equals("Null") || stepFlg.equals("NULL")) {
           // バッチ処理引数の形式が不正です
           errCodeList.add("AK00006");
           setErrNote("(SBM0635)ステップフラグ：[ " + stepFlg + " ]");
           Exception e = new Exception();
           emsg = new ExpjMessage("ZZ01006", "(SBM0961)ステップフラグが未入力です");
           m_med.getSyslog().severe(emsg, userId);
           throw e;
          }
          // 業務ロックをかける
          emsg = new ExpjMessage("ZZ01006", "(SBM0842)◎◎◎　業務ロック開始　◎◎◎");
          m_med.getSyslog().info(emsg, userId);
          Lock = new BusinessLock(conn, userId, plantCd);
          lockCancelKey = Lock.doLock(businessName);  // 解除キーの取得
          // lockCancelKey==-1の場合も業務ロックされているのエラー
          if(lockCancelKey == -1){
           errCodeList.add("ZZ01001");// 業務ロックされているため起動できません
           setErrNote("(SBM0580)ユーザコード：[ " + userId + " ] 工場コード：[ " + plantCd + " ]");
           emsg = new ExpjMessage("ZZ01006", "(SBM0843)業務ロックされているため起動できません");
           m_med.getSyslog().severe(emsg, userId);
           throw new Exception("");
          }
          conn.commit();
          
          // バッチパラメータtableから、ストアド共通パラメータを読み込む
          m_med.setprogramCd(businessName);
          m_med.setfunctionName(functionName);
          AbstractBatchAppEntity sysBatParam = m_med.getreadSysBatParm();
          
          try {
           sysBatParam.read();
          } catch (Exception e) {
           errCodeList.add("AK00007");// バッチパラメータの読み込みに失敗しました
           setErrNote("(SBM0580)ユーザコード：[ " + userId + " ] 工場コード：[ " + plantCd + " ]");
           emsg = new ExpjMessage("ZZ01006", "(SBM0925)バッチパラメータの読み込みに失敗しました");
           m_med.getSyslog().severe(emsg, userId);
           throw e;
          }
          
          if (sysBatParam.next()) {
           logMode = m_med.getlogModeTyp().toString();
           outputMode = m_med.getoutputModeTyp().toString();
           outputPath = m_med.getfilePath();
           outputName = m_med.getfileName();
          } else {
           errCodeList.add("AK00008");// バッチパラメータデータが存在しません
           setErrNote("(SBM0580)ユーザコード：[ " + userId + " ] 工場コード：[ " + plantCd + " ]");
           Exception e = new Exception();
           emsg = new ExpjMessage("ZZ01006", "(SBM0576)バッチパラメータデータが存在しません");
           m_med.getSyslog().severe(emsg, userId);
           throw e;
          }
       
       // 入力チェック************************************************************************************
          // 夜間バッチ（自動運転）の場合
          if (batchProcessingTyp == 1) {
           
           // ユーザIDが存在するかどうか
           m_med.setUSER_CD(userId);
       
           m_med.setprogramCd(businessName);
           m_med.setfunctionName(functionName);
           AbstractBatchAppEntity checkUserCd = m_med.getselectUserCd();
           try {
            checkUserCd.read();
           } catch (Exception e) {
            errCodeList.add("ZZ01106");// サーバでエラーが発生しました。
            setErrNote("(SBM0619)ユーザコード：[ " + userId + " ]");
            emsg = new ExpjMessage("ZZ01006", "(SBM0927)ユーザコードの読込みに失敗しました。");
            m_med.getSyslog().severe(emsg, userId);
            throw e;
           }
       
           if (checkUserCd.next()) {
            String chUserCd = m_med.getUSER_CD();
           } else {
            errCodeList.add("ZZ09003");// ユーザコードのパラメータが未入力です。
            setErrNote("(SBM0619)ユーザコード：[ " + userId + " ] ");
            Exception e = new Exception();
            emsg = new ExpjMessage("ZZ01006", "(SBM0928)指定されたユーザコードは存在しません。");
            m_med.getSyslog().severe(emsg, userId);
            throw e;
           }
           
           // 工場コードが存在するかどうか
           m_med.setPLANT_CD(plantCd);
           
           m_med.setprogramCd(businessName);
           m_med.setfunctionName(functionName);
           AbstractBatchAppEntity checkPlantCd = m_med.getselectPlantCd();
           try {
            checkPlantCd.read();
           } catch (Exception e) {
            errCodeList.add("AK00014");//工場コードの読込みに失敗しました。
            setErrNote("(SBM0620)工場コード：[ " + plantCd + " ]");
            emsg = new ExpjMessage("ZZ01006", "(SBM0929)工場コードの読込みに失敗しました。");
            m_med.getSyslog().severe(emsg, userId);
            throw e;
           }
           if (checkPlantCd.next()) {
            String chPlantCd = m_med.getPLANT_CD();
           } else {
            errCodeList.add("AK00001");// 指定された工場は存在しません。
            setErrNote("(SBM0620)工場コード：[ " + plantCd + " ]");
            Exception e = new Exception();
            emsg = new ExpjMessage("ZZ01006", "(SBM0930)指定された工場は存在しません。");
            m_med.getSyslog().severe(emsg, userId);
            throw e;
           }
           
           // ステップフラグが正しい値かどうか
           if (!(stepFlg.equals("0") || stepFlg.equals("1") 
             || stepFlg.equals("2") || stepFlg.equals("3")))	{
            // バッチ処理引数の形式が不正です
            errCodeList.add("AK00006");
            setErrNote("(SBM0635)ステップフラグ：[ " + stepFlg + " ]");
            Exception e = new Exception();
            emsg = new ExpjMessage("ZZ01006", "(SBM0962)ステップフラグが不正です。");
            m_med.getSyslog().severe(emsg, userId);
            throw e;
           }
           
           // 生産要求制御チェック
           m_med.setPLANT_CD(plantCd);
           
           m_med.setprogramCd(businessName);
           m_med.setfunctionName(functionName);
           AbstractBatchAppEntity checkPrdReqCtrl = m_med.getselectPrdReqCtrl();
           try {
            checkPrdReqCtrl.read();
           } catch (Exception e) {
            errCodeList.add("ZZ01106");// サーバでエラーが発生しました。
            setErrNote("(SBM0580)ユーザコード：[ " + userId + " ] 工場コード：[ " + plantCd + " ]");
            emsg = new ExpjMessage("ZZ01006", "(SBM0963)生産要求制御情報の読込みに失敗しました。");
            m_med.getSyslog().severe(emsg, userId);
            throw e;
           }
           String prdReqEndDate = null;         // 生産要求処理終了日時
           String mrpDmEndDate = null;          // MRP品デマンド生成処理終了日
           String shipConvEndDate = null;       // 出荷商品品目変換処理終了日
           String stockIssueEndDate = null;     // 在庫出庫処理終了日時
           if (checkPrdReqCtrl.next()) {
            prdReqEndDate 
              = m_med.getPRD_REQ_END_DATE();      // 生産要求処理終了日時
            mrpDmEndDate 
              = m_med.getMRP_DM_END_DATE();       // MRP品デマンド生成処理終了日
            shipConvEndDate 
              = m_med.getSHIP_CONV_END_DATE();    // 出荷商品品目変換処理終了日
            stockIssueEndDate 
              = m_med.getSTOCK_ISSUE_END_DATE();  // 在庫出庫処理終了日時
           } else {
            errCodeList.add("AK00006");// バッチ処理引数の形式が不正です
            setErrNote("(SBM0580)ユーザコード：[ " + userId + " ] 工場コード：[ " + plantCd + " ]");
            Exception e = new Exception();
            emsg = new ExpjMessage("ZZ01006", "(SBM0964)生産要求制御が存在しません。");
            m_med.getSyslog().severe(emsg, userId);
            throw e;
           }
           emsg = new ExpjMessage("ZZ01006", "(SBM0965)●●●生産要求制御チェック●●●");
           m_med.getSyslog().info(emsg, userId);
           emsg = new ExpjMessage("ZZ01006", "　　(SBM0966)●生産要求生成処理　　= " + prdReqEndDate);
           m_med.getSyslog().info(emsg, userId);
           emsg = new ExpjMessage("ZZ01006", "　　(SBM0967)●MRPデマンド生成処理 = " + mrpDmEndDate);
           m_med.getSyslog().info(emsg, userId);
           emsg = new ExpjMessage("ZZ01006", "　　(SBM0968)●出荷要求生成処理　　= " + shipConvEndDate);
           m_med.getSyslog().info(emsg, userId);
           emsg = new ExpjMessage("ZZ01006", "　　(SBM0969)●在庫出庫処理　　　　= " + stockIssueEndDate);
           m_med.getSyslog().info(emsg, userId);
          
           int firstStepFlg = -1;
           // ステップフラグ位置設定
           if (prdReqEndDate == null || prdReqEndDate.equals("")) {
            firstStepFlg = 0;
           }
           else if (mrpDmEndDate == null || mrpDmEndDate.equals("")) {
            firstStepFlg = 1;
           }
           else if (shipConvEndDate == null || shipConvEndDate.equals("")) {
            firstStepFlg = 2;
           }
           else if (stockIssueEndDate == null || stockIssueEndDate.equals("")) {
            firstStepFlg = 3;
           }
           else{
            throw new Exception("");
           }
           emsg = new ExpjMessage("ZZ01006", "　　(SBM0970)●ステップフラグ位置　= " + firstStepFlg);
           m_med.getSyslog().info(emsg, userId);
           
           // ステップフラグチェック
           int intstepFlg = Integer.parseInt(stepFlg);
           if (intstepFlg > firstStepFlg) {
            // 直前の処理が終了していないので実行出来ません。
            errCodeList.add("AK32818");
            setErrNote("(SBM0636)ユーザ指定ステップフラグ：[ " + intstepFlg 
              + " ] ステップフラグ：[ " + firstStepFlg + " ]");
            Exception e = new Exception();
            emsg = new ExpjMessage("ZZ01006", 
              "(SBM0971)直前の処理が終了していないので実行出来ません。");
            m_med.getSyslog().severe(emsg, userId);
            throw e;
           }
          }
       
          //SP実行
          if (!spExecute(logMode, outputMode, outputPath, outputName, userId, 
            businessName, plantCd, stepFlg)) {
           throw new Exception("");
          }
       
         } catch (Exception e) {
          try {
           conn.rollback();
          } catch (FoundationException fe) {}
          e.printStackTrace();
          if (errCodeList == null || errCodeList.size() == 0) {
           errCodeList.add("AK00010");//その他　Ｅｒｒｏｒ
           setErrNote("(SBM0580)ユーザコード：[ " + userId + " ] 工場コード：[ " + plantCd + " ]");
           ExpjMessage emsg = new ExpjMessage("ZZ01006", "(SBM1363)その他　Ｅｒｒｏｒ");
           m_med.getSyslog().severe(emsg, userId);
          }
         } finally {
          for (int i = 0; i < errCodeList.size(); i++) {
           String errCode = (String)errCodeList.get(i);
           String errNote = (String)errNoteHash.get(Integer.toString(i));
       
           // 業務メッセージの登録
           if (businessMsg != null) {
            try {
             Numbering numbering = new Numbering(conn, Numbering.LOG_CD, 
               userId, businessName, plantCd);
             businessMsg.setLogCode(numbering.getNo());
             businessMsg.setMessageCode(errCode);
             businessMsg.setData(errNote);
             businessMsgAcc.add(businessMsg);
             ExpjMessage emsg = new ExpjMessage("ZZ01006", 
               "(SBM0836)●●●　業務メッセージの登録　●●● <" + (i + 1) 
               + "/" + errCodeList.size() + ">");
             m_med.getSyslog().severe(emsg, userId);
             emsg = new ExpjMessage("ZZ01006", 
               "　　●No:" + businessMsg.getLogCode() + " errCode:" + errCode 
               + " errNote:" + errNote + " businessMsg:" + businessMsg);
             m_med.getSyslog().severe(emsg, userId);
       
            } catch (Exception ex) {
             ex.printStackTrace();
            }
           }
          }
          try {
           ExpjMessage emsg = new ExpjMessage("ZZ01006", "(SBM1344)◎◎◎　業務ロック解除　◎◎◎");
           m_med.getSyslog().info(emsg, userId);
       
           //結果がfalseの場合もロック解除失敗のエラー
           if(!Lock.doUnLock(businessName, lockCancelKey))
            throw new FoundationException("CtrlMain", "main", "ZZ01004");
           
          } catch (FoundationException e) {
           e.printStackTrace();
           String errCode = "ZZ01004";  // 業務ロックの解除に失敗しました。
           ExpjMessage emsg = new ExpjMessage("ZZ01006", "(SBM0846)業務ロックの解除に失敗しました。");
           m_med.getSyslog().severe(emsg, userId);
           
           try {
            // 業務メッセージの登録（業務ロック解除失敗時）
            Numbering numbering = new Numbering(conn, Numbering.LOG_CD, 
              userId, businessName, plantCd);
            businessMsg.setLogCode(numbering.getNo());
            businessMsg.setMessageCode(errCode);
            businessMsg.setData("");
            businessMsgAcc.add(businessMsg);
            emsg = new ExpjMessage("ZZ01006", "(SBM1345)●●●　業務メッセージの登録　●●●");
            m_med.getSyslog().severe(emsg, userId);
            emsg = new ExpjMessage("ZZ01006", "　　●No:" + businessMsg.getLogCode() 
              + " errCode:" + errCode + " businessMsg:" + businessMsg);
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
		public medAK0030B001 m_med=null;

		/**
		 * コンテナクラスインスタンス
		 */
		public ManageContainer m_container=null;

		//////////////////////////////

		public interControl(medAK0030B001 med) throws BatchAppException
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
