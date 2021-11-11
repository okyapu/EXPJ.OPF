/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AC0020/src/com/nec/jp/orteus/metamorBase/AC0020/AC0020B001/CtrlMain.java,v $
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

package com.nec.jp.orteus.metamorBase.AC0020.AC0020B001;

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
import com.nec.jp.orteus.msg.util.*;
import com.nec.jp.orteus.msg.core.*;
import com.nec.jp.orteus.metamorBase.util.AlarmMessage.AlarmMessage;
import com.nec.jp.orteus.metamorBase.util.BusinessLock.BusinessLock;
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessage;
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessageAccessor;
import com.nec.jp.orteus.metamorBase.util.SystemLog.SystemLog;
import com.nec.jp.orteus.metamorBase.common.CollectNumber.Numbering;
import com.nec.jp.orteus.expj.util.Converter;
//}}user_implement_dev:import

/**
 * CLASS     : CtrlMain クラス
 * ファイル・クラス説明
 * @author $Author: xl-hs-zzw $
 * @version $Revision: 1.7 $ $Date: 2014/11/05 07:01:33 $
 */

//{{user_implement_dev:header
/**
 * CLASS     : CtrlMain クラス
 * VERSION   : 1.0.0.0
 * DATE      : 2003/08/12
 * AUTHOR    : NEXS
 * HISTORY
 *           : 1.0.0.0　2003/08/08,新規作成
 *           : 1.0.0.0　2003/08/12,製番対応。
 *                                 ・バッチ処理区分"1" 夜間バッチ（自動運転）の場合、
 *                                   オーダ発効実行制御テーブルの製番の値が、空文字列""の
 *                                   場合、ストアドプロシージャ引数をnullとするよう変更。
 *                                 ・バッチ処理区分"2" マニュアル（自動運転なし）の場合
 *                                   製番にダミー文字列"jobOdrCd"が送信されたとき、
 *                                   ストアドプロシージャ引数をnullとするよう変更。
 *
 *         [ : <バージョン> (<日付>),<内容> ]
 *                        ・ ・ ・
 * @see main()メソッド内で、オーダ発効実行処理を行う。
 */
//}}user_implement_dev:header

public class CtrlMain extends Object
		implements IBatchAppCommon
{

	//////////////////////////////

	/**
	 * mediatorクラス インスタンス
	 */
	public medAC0020B001 m_med=null;

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
	public CtrlMain(medAC0020B001 med, BatchAppConductor cdr) throws BatchAppException
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
       
        /**
         * CtrlMainクラスの標準コンストラクタ
         *
         * @return なし
         */
        public CtrlMain(medAC0020B001 med) throws BatchAppException
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
         * @param なし
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
       
       
       //------- start of Original Code -------
       
        // 共通変数 ========================================================
        IDbConnection conn = null;          // DBコネクション
        BusinessLock Lock = null;     // 業務ロック
        int lockCancelKey = 0;              // ロック解除キー
        Numbering logCd = null;       //ログ識別コード採番の準備
       
        // バッチ処理共通エラー処理
        String errCode = null;                  // エラーコード
        String errMsg = null;                  // エラーメッセージ
        String errNote = "";          // エラーメッセージ(備考)
       
        // metamorBase業務メッセージ
        BusinessMessageAccessor businessMsgAcc = null;
        BusinessMessage businessMsg = null;     // metamorBase業務メッセージ
        String businessErrCode = null;          // metamorBase業務メッセージコード
       
        // Orteus業務メッセージ
        String memoText = "";         // Orteus業務メッセージ 備考
       
        // 夜間バッチかマニュアルか
        int batchProcessingTyp = 0;   // 1: 夜間バッチ（自動運転）2: マニュアル（自動運転なし）
       
        // ストアドプロシージャ名
        String functionName = null;
       
        // ストアドプロシージャパラメータ
        String logMode = null;        // ログモード
        String outputMode = null;     // 出力モード
        String outputPath = null;     // 出力パス
        String outputName = null;     // 出力ファイル名
        String userId = null;         // ユーザID
        String businessName = null;   // 業務名（バッチ処理ID）
        String plantCd = null;        // 工場コード
        String managementTyp = null;  // 管理区分  1：ＭＲＰ ２：製番
        String outsideTyp = null;     // 内外作区分  1：内作 2：外作 9：内外作両方
        String jobOdrCd = null;       // 製番
        String jobOdrDetailNo= null;  // 製番枝番（SI対応項目 metamorBaseでは未使用）
        String entry1Typ = null;      // エントリ区分１ 1：手配着手日 2：製造着手日 3：製造納期
        String entry2Typ = null;      // エントリ区分２ 1：手入力 2：今週 3：今旬 4：今月
        String entryDate = null;      // エントリ日付
        // ===============================================================
       
        // 共通処理 =======================================================
       
        // 固定値をセット
        functionName = "SQLODRELEASE";  // オーダ発効
       
        // 業務名（バッチ処理ID）の取得
        Class myClass = this.getClass();
        businessName = myClass.getName();
        businessName = businessName.substring(businessName.length()-19, businessName.length()-9);
       
        // main引数受け取り
        String args[] = m_med.getArgs();
        int argsLength = args.length;   // 引数の個数を保持
       
        try {   // try0 --
       
        // 引数から、バッチ処理区分を取得する
        if (argsLength >= 2) {
         try {
          batchProcessingTyp = Integer.parseInt(args[0]);
         } catch (NumberFormatException e) {
          errCode = "AC00111"; // バッチ処理引数の形式が不正です
          throw e;
         }
        } else {
         errCode = "AC00111"; // バッチ処理引数の形式が不正です
         Exception e = new Exception();
         throw e;
        }
       
        // バッチパラメータtableから、ストアド共通パラメータを読み込む
        m_med.setprogramCd(businessName);
        m_med.setfunctionName(functionName);
       
       
        AbstractBatchAppEntity sysBatParam = m_med.getreadSysBatParm();
        try {
         sysBatParam.read();
         if (sysBatParam.next()) {
          logMode = m_med.getlogModeTyp().toString();
          outputMode = m_med.getoutputModeTyp().toString();
          outputPath = m_med.getfilePath();
          outputName = m_med.getfileName();
         } else {
          errCode = "AC00109"; // バッチパラメータデータが存在しません
          Exception e = new Exception();
          throw e;
         }
        } catch (Exception e) {
         if ( errCode == null ) {
          errCode = "AC00113"; // バッチパラメータの読み込みに失敗しました
         }
         throw e;
        }
        // 共通処理 終わり =============================================
       
       
        // 夜間バッチ（自動運転）の場合 ==================================
        if ( batchProcessingTyp == 1 ) {
       
         // 引数からユーザIDを取得する
         userId = args[1];
       
         // オーダ発効実行制御tableから、ストアドプロシージャ実行用パラメータを
         // 全件読み込む
         AbstractBatchAppEntity sysOdReleaseCtrl =
          m_med.getreadSysOdReleaseCtrl();
         try {
         sysOdReleaseCtrl.read();
         } catch (Exception e) {
          errCode = "AC00114"; // オーダ発効実行制御の読み込みに失敗しました
          throw e;
         }
       
         // コネクションの取得
         conn = m_conductor.m_transactionConn;
       
         // 登録されているレコード件数分、ストアドプロシージャを実行する
         while (sysOdReleaseCtrl.next()) {
       
          // ストアドプロシージャ用パラメータの取得
          plantCd = m_med.getplantCd();
          managementTyp = m_med.getmanagementTyp().toString();
          if(null != m_med.getoutsideTyp() && !"".equals(m_med.getoutsideTyp())){
          	outsideTyp = m_med.getoutsideTyp().toString();
          }
          if (managementTyp.equals("2")) {
           jobOdrCd = m_med.getjobOdrCd();
           if (null == jobOdrCd || "".equals(jobOdrCd)) {
            jobOdrCd = null;     // 空文字の場合もnullとして扱う
           }
          } else {
           jobOdrCd = null;
          }
          jobOdrDetailNo= null;        // SI対応項目 metamorBaseでは未使用
          if(null != m_med.getentry1Typ()){
          	entry1Typ = m_med.getentry1Typ().toString();
          }
          if(null != m_med.getentry2Typ()){
          	entry2Typ = m_med.getentry2Typ().toString();
          }
       
          // 業務メッセージの準備
          businessMsgAcc = new BusinessMessageAccessor();
          businessMsg = new BusinessMessage();
          businessMsgAcc.init(conn);
          businessMsg.setBusinessOperatingName(businessName);
          businessMsg.setUser(userId);
          businessMsg.setPlantCode(plantCd);
       
          try {   // try1 --
       
           // 業務ロックをかける
           try {
            Lock = new BusinessLock(conn, userId, plantCd);
            lockCancelKey = Lock.doLock(businessName);  // 解除キーの取得
            conn.commit();
            if (lockCancelKey == -1) throw new Exception();
           } catch (Exception e) {
            businessErrCode = "ZZ01001"; // 業務ロックされているため起動できません
            errCode = businessErrCode;
            throw e;
           }
       
           // エントリ日付を算出する -------------------------------
       if(null != m_med.getentry2Typ()){
           // Calendar型のエントリ日付を用意
           Calendar calEntryDate = Calendar.getInstance();
       
           // "yyyy/MM/dd"の日付フォーマットを生成
           //DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
           //df.setLenient(false);  // 日付解釈のあいまいさをなくす
       
           // エントリ区分２と業務運用日より、エントリ日付を算出する
           int type = m_med.getentry2Typ().intValue();
       
           // エントリ区分２が"手入力"指定の場合
           if (type == 1) {
            // tableに登録されているエントリ日付（文字列）を取得する
            entryDate = m_med.getentryDate();
       			
            // 取得した日付が妥当であるか
            try {
     					if(null != entryDate && !"".equals(entryDate)){
             		//calEntryDate.setTime(df.parse(entryDate));
             		calEntryDate.setTime(Converter.strToDate(entryDate, "yyyy/MM/dd"));
            	}
            } catch (ParseException e) {
             errCode = "AC00116"; // 登録されているエントリ日付の形式が不正です
             throw e;
            }
       
           // エントリ区分２が"手入力"以外の場合
           } else {
            java.util.Date businessOrpDate = null; // 業務運用日（Date型）
       
            // 日付制御tableから、業務運用日を取得する
            m_med.setplantCd(plantCd);
            AbstractBatchAppEntity sysDateCtrl = m_med.getreadSysDateCtrl();
            try {
             sysDateCtrl.read();
            } catch (Exception e) {
             errCode = "AC00115"; // 日付制御の読み込みに失敗しました
             throw e;
            }
            if (sysDateCtrl.next()) {
             businessOrpDate = m_med.getbusinessOprDate();
            } else {
             errCode = "AC50537"; // 日付制御データが存在しません
             Exception e = new Exception();
             throw e;
            }
            calEntryDate.setTime(businessOrpDate);
       
            // エントリ区分２が"今週"指定の場合
            if (type == 2) {
             // 今週末日をエントリ日付にセットする
             int END_DAY_OF_WEEK = Calendar.SATURDAY; // 週末とする曜日
             int difference = END_DAY_OF_WEEK -
             calEntryDate.get(Calendar.DAY_OF_WEEK);
             if (difference < 0) {
              difference += 7;
             }
             calEntryDate.add(Calendar.DATE, difference);
       
            // エントリ区分２が"今旬"指定の場合
            } else if (type == 3) {
             //今旬末日をエントリ日付にセットする
             int date = calEntryDate.get(Calendar.DAY_OF_MONTH);
             if (date <= 10 ) {
              calEntryDate.set(Calendar.DAY_OF_MONTH, 10);
             } else if (date > 10 && date <= 20) {
              calEntryDate.set(Calendar.DAY_OF_MONTH, 20);
             } else {
              calEntryDate.set(
              Calendar.DAY_OF_MONTH,
              calEntryDate.getActualMaximum(Calendar.DAY_OF_MONTH)
             );
            }
       
            // エントリ区分２が"今月"指定の場合
            } else if (type == 4) {
             //今月末日をエントリ日付にセットする
             calEntryDate.set(
             Calendar.DAY_OF_MONTH,
             calEntryDate.getActualMaximum(Calendar.DAY_OF_MONTH)
             );
            }
           }
           // 日付型を文字列（"yyyy/MM/dd"）に変換
           //entryDate = df.format(calEntryDate.getTime());
           
           if (type == 1 && (null == entryDate || "".equals(entryDate))) {
           		entryDate = null;
           }else{
           		entryDate = Converter.dateToStr(calEntryDate.getTime(), "yyyy/MM/dd");
           }
           // エントリ日付を算出する 終わり -------------------------
       }
           // ストアドプロシージャのパラメータをセットする
           m_med.setpvc2LogMode(logMode);
           m_med.setpvc2OutputMode(outputMode);
           m_med.setpvc2OutputPath(outputPath);
           m_med.setpvc2OutputName(outputName);
           m_med.setpvc2UserId(userId);
           m_med.setpvc2BusinessName(businessName);
           m_med.setpvc2PlantCd(plantCd);
           m_med.setpvc2ManagementTyp(managementTyp);
           m_med.setpvc2OutsideTyp(outsideTyp);
           m_med.setpvc2JobOdrCd(jobOdrCd);
           m_med.setpvc2JobOdrDetailNo(jobOdrDetailNo);
           m_med.setpvc2Entry1Typ(entry1Typ);
           m_med.setpvc2Entry2Typ(entry2Typ);
           m_med.setpvc2EntryDate(entryDate);
       
       //追加
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
           // ストアドプロシージャの実行
           try {
            m_med.getcallSqlOdRelease().call();
           } catch (Exception e) {
            errCode = "AC00117"; // ストアドプロシージャ実行時エラー
            // 引数文字列をエラー備考にセット
            StringBuffer sb = new StringBuffer();
            sb.append("(SBM0582)ストアドプロシージャ引数：");
            sb.append(logMode + " ");
            sb.append(outputMode + " ");
            sb.append(outputPath + " ");
            sb.append(outputName + " ");
            sb.append(userId + " ");
            sb.append(businessName + " ");
            sb.append(plantCd + " ");
            sb.append(managementTyp + " ");
            sb.append(outsideTyp + " ");
            sb.append(jobOdrCd + " ");
            sb.append(jobOdrDetailNo + " ");
            sb.append(entry1Typ + " ");
            sb.append(entry2Typ + " ");
            sb.append(entryDate);
            errNote = sb.toString();
            throw e;
           }
       
          } catch (Exception e) { // -- try1 catch
       
           if (errCode == null) {
            errCode = "AC53402";  // その他　Ｅｒｒｏｒ
           }
       
           // エラーメッセージの作成
           AlarmMessage msg = new AlarmMessage(errCode);
           errMsg = "[" + errCode + "]" + msg.getMessage();
           if (e.getMessage() != null) {
            errMsg = errMsg + " " + e.getMessage();
           }
       
           // 業務メッセージの登録
           if (businessMsg != null) {
            // 業務エラーがセットされていない場合
            if (businessErrCode == null) {
             businessErrCode = "ZZ09009"; // バッチ処理を開始できませんでした。
            }
            businessMsg.setMessageCode(businessErrCode);
            businessMsg.setData(errNote);
            try {
             logCd = new Numbering(m_conductor.m_transactionConn,Numbering.LOG_CD,args[1],businessName,plantCd);
             businessMsg.setLogCode(logCd.getNo());
             businessMsgAcc.add(businessMsg);
            } catch (SQLException ex) {
             ex.printStackTrace();
            }
           }
           memoText = errMsg; // 備考メッセージ
           throw e;
       
          } finally {  // -- try1 finally
           try {
            // 業務ロック解除
       
            Lock.doUnLock(businessName, lockCancelKey);
            conn.commit();
           } catch (FoundationException e) {
           e.printStackTrace();
           businessErrCode = "ZZ01004";  // 業務ロックの解除に失敗しました。
       
           // 業務メッセージの登録（業務ロック解除失敗時）
           businessMsg.setMessageCode(businessErrCode);
           businessMsg.setData("");
           try {
            logCd = new Numbering(m_conductor.m_transactionConn,Numbering.LOG_CD,args[1],businessName,plantCd);
            businessMsg.setLogCode(logCd.getNo());
            businessMsgAcc.add(businessMsg);
           } catch (SQLException ex) {
            ex.printStackTrace();
           }
           AlarmMessage msg = new AlarmMessage(businessErrCode);
           errMsg = "[" + businessErrCode + "]" + msg.getMessage();
           memoText = errMsg; // 備考メッセージ
       
           }
           // =========================================================
           /* テスト用リリース時はコメント部 *
           finally {
            try { // バッチ終了メッセージ送信
       
             Business business = Business.getStartBusiness(m_med.getBUSINESS_GROUP_CD(), args[1], m_med.getBUSINESS_CD());
             business.setMessageDisplayLevel(1); // 表示レベル(重要度)の指定
             business.setMessageReference(memoText); // 備考の指定
             business.complete();
            }
            catch(MessageApiException e) {
             e.printStackTrace();
       
             businessErrCode = "ZZ09008";
             // 業務メッセージの登録（バッチ終了メッセージ送信失敗時）
             businessMsg.setMessageCode(businessErrCode);
             businessMsg.setData("");
             try {
              logCd = new Numbering(m_conductor.m_transactionConn,Numbering.LOG_CD,args[1],businessName,plantCd);
              businessMsg.setLogCode(logCd.getNo());
              businessMsgAcc.add(businessMsg);
             }
             catch (SQLException ex) {
              ex.printStackTrace();
             }
             AlarmMessage msg = new AlarmMessage(businessErrCode);
             errMsg = businessErrCode + " " + msg.getMessage();
       
            }
           }
            テスト用リリース時はコメント部 */
           // =========================================================
       
          }   // -- end try1
       
         }   // -- end while
       
        // 夜間バッチ（自動運転）の場合 終わり ===============================
       
       
        // マニュアル（自動運転なし）の場合 ==================================
        } else if ( batchProcessingTyp == 2 ) {
       
         // 引数の妥当性をチェックし、変数にセットする -------------------
         if (argsLength == 10) {
          userId = args[1];
          plantCd = args[2];
          managementTyp = args[3];
          outsideTyp = args[4];
          if (managementTyp.equals("2")) {
           jobOdrCd = args[5];   // 製番の場合のみセット
           if (jobOdrCd.equals("jobOdrCd")) {
            jobOdrCd = null;  // ダミー文字列の場合、nullをセット
           }
          } else {
           jobOdrCd = null;
          }
          jobOdrDetailNo= null;   // SI対応項目 metamorBaseでは未使用
          entry1Typ = args[7];
          entry2Typ = args[8];
          entryDate = args[9];
       
          // 数値タイプの引数に半角数字がセットされているか
          try {
           Integer.parseInt(managementTyp);
           Integer.parseInt(outsideTyp);
           Integer.parseInt(entry1Typ);
           Integer.parseInt(entry2Typ);
          } catch (NumberFormatException e) {
           errCode = "AC00111"; // バッチ処理引数の形式が不正です
           throw e;
          }
         } else {
          errCode = "AC00111"; // バッチ処理引数の形式が不正です
          Exception e = new Exception();
          throw e;
         }
         // 引数のセット 終わり ---------------------------------------
       
         // コネクションの取得
         conn = m_conductor.m_transactionConn;
       
         // 業務メッセージの準備
         businessMsgAcc = new BusinessMessageAccessor();
         businessMsg = new BusinessMessage();
         businessMsgAcc.init(conn);
         businessMsg.setBusinessOperatingName(businessName);
         businessMsg.setUser(userId);
         businessMsg.setPlantCode(plantCd);
       
         try {   // try2 --
          // 業務ロックをかける
          try {
           Lock = new BusinessLock(conn, userId, plantCd);
           lockCancelKey = Lock.doLock(businessName);  // 解除キーの取得
           conn.commit();
           if (lockCancelKey == -1) throw new Exception();
          } catch (Exception e) {
           businessErrCode = "ZZ01001"; // 業務ロックされているため起動できません
           errCode = businessErrCode;
           throw e;
          }
       
          // ストアドプロシージャのパラメータをセットする
          m_med.setpvc2LogMode(logMode);
          m_med.setpvc2OutputMode(outputMode);
          m_med.setpvc2OutputPath(outputPath);
          m_med.setpvc2OutputName(outputName);
          m_med.setpvc2UserId(userId);
          m_med.setpvc2BusinessName(businessName);
          m_med.setpvc2PlantCd(plantCd);
          m_med.setpvc2ManagementTyp(managementTyp);
          m_med.setpvc2OutsideTyp(outsideTyp);
          m_med.setpvc2JobOdrCd(jobOdrCd);
          m_med.setpvc2JobOdrDetailNo(jobOdrDetailNo);
          m_med.setpvc2Entry1Typ(entry1Typ);
          m_med.setpvc2Entry2Typ(entry2Typ);
          m_med.setpvc2EntryDate(entryDate);
       //追加
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
          // ストアドプロシージャの実行
          try {
           m_med.getcallSqlOdRelease().call();
          } catch (Exception e) {
           errCode = "AC00117"; // ストアドプロシージャ実行時エラー
           // 引数文字列をエラー備考にセット
           StringBuffer sb = new StringBuffer();
           sb.append("(SBM0582)ストアドプロシージャ引数：");
           sb.append(logMode + " ");
           sb.append(outputMode + " ");
           sb.append(outputPath + " ");
           sb.append(outputName + " ");
           sb.append(userId + " ");
           sb.append(businessName + " ");
           sb.append(plantCd + " ");
           sb.append(managementTyp + " ");
           sb.append(outsideTyp + " ");
           sb.append(jobOdrCd + " ");
           sb.append(jobOdrDetailNo + " ");
           sb.append(entry1Typ + " ");
           sb.append(entry2Typ + " ");
           sb.append(entryDate);
           errNote = sb.toString();
           throw e;
          }
       
         } catch (Exception e) { // -- try2 catch
       
          if (errCode == null) {
           errCode = "AC53402";  // その他　Ｅｒｒｏｒ
          }
       
          // エラーメッセージの作成
          AlarmMessage msg = new AlarmMessage(errCode);
          errMsg = "[" + errCode + "]" + msg.getMessage();
          if (e.getMessage() != null) {
           errMsg = errMsg + " " + e.getMessage();
          }
       
          // 業務メッセージの登録
          if (businessMsg != null) {
           // 業務エラーがセットされていない場合
           if (businessErrCode == null) {
            businessErrCode = "ZZ09009"; // バッチ処理を開始できませんでした。
           }
           businessMsg.setMessageCode(businessErrCode);
           businessMsg.setData(errNote);
           try {
            logCd = new Numbering(m_conductor.m_transactionConn,Numbering.LOG_CD,args[1],businessName,plantCd);
            businessMsg.setLogCode(logCd.getNo());
            businessMsgAcc.add(businessMsg);
           } catch (SQLException ex) {
            ex.printStackTrace();
           }
          }
          memoText = errMsg; // 備考メッセージ
          throw e;
       
         } finally { // -- try2 finally
          try {
           // 業務ロック解除
       
       
       
           Lock.doUnLock(businessName, lockCancelKey);
           conn.commit();
          } catch (FoundationException e) {
           e.printStackTrace();
           businessErrCode = "ZZ01004";  // 業務ロックの解除に失敗しました。
       
           // 業務メッセージの登録（業務ロック解除失敗時）
           businessMsg.setMessageCode(businessErrCode);
           businessMsg.setData("");
           try {
            logCd = new Numbering(m_conductor.m_transactionConn,Numbering.LOG_CD,args[1],businessName,plantCd);
            businessMsg.setLogCode(logCd.getNo());
            businessMsgAcc.add(businessMsg);
           } catch (SQLException ex) {
            ex.printStackTrace();
           }
           AlarmMessage msg = new AlarmMessage(businessErrCode);
           errMsg = "[" + businessErrCode + "]" + msg.getMessage();
           memoText = errMsg; // 備考メッセージ
       
          }
          // =========================================================
          /* テスト用リリース時はコメント部 *
          finally {
           try { // バッチ終了メッセージ送信
       
            Business business = Business.getStartBusiness(m_med.getBUSINESS_GROUP_CD(), args[1], m_med.getBUSINESS_CD());
            business.setMessageDisplayLevel(1); // 表示レベル(重要度)の指定
            business.setMessageReference(memoText); // 備考の指定
            business.complete();
           }
           catch(MessageApiException e) {
            e.printStackTrace();
       
            businessErrCode = "ZZ09008";
            // 業務メッセージの登録（バッチ終了メッセージ送信失敗時）
            businessMsg.setMessageCode(businessErrCode);
            businessMsg.setData("");
            try {
             logCd = new Numbering(m_conductor.m_transactionConn,Numbering.LOG_CD,args[1],businessName,plantCd);
             businessMsg.setLogCode(logCd.getNo());
             businessMsgAcc.add(businessMsg);
            }
            catch (SQLException ex) {
             ex.printStackTrace();
            }
            AlarmMessage msg = new AlarmMessage(businessErrCode);
            errMsg = businessErrCode + " " + msg.getMessage();
       
           }
          }
           テスト用リリース時はコメント部 */
          // =========================================================
       
         }   // -- end try2
       
        } // マニュアル（自動運転なし）の場合 終わり =========================
       
        } catch (Exception e) {     // -- catch try0
       
        if (errCode == null) {
         errCode = "AC53402";  // その他　Ｅｒｒｏｒ
        }
       
        // エラーメッセージの作成
        if (errMsg == null) {
         AlarmMessage msg = new AlarmMessage(errCode);
         errMsg = "[" + errCode + "]" + msg.getMessage();
         if (e.getMessage() != null) {
          errMsg = errMsg + " " + e.getMessage();
         }
        }
       
        e.printStackTrace();
        throw new BatchAppException("CtrlMain", "main", errMsg);
       
        }       // -- end try0
       
       //------- end of Original Code -------
       
       
       
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
		public medAC0020B001 m_med=null;

		/**
		 * コンテナクラスインスタンス
		 */
		public ManageContainer m_container=null;

		//////////////////////////////

		public interControl(medAC0020B001 med) throws BatchAppException
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
