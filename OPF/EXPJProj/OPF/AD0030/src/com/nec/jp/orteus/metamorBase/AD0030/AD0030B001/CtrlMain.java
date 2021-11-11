/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AD0030/src/com/nec/jp/orteus/metamorBase/AD0030/AD0030B001/CtrlMain.java,v $
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

package com.nec.jp.orteus.metamorBase.AD0030.AD0030B001;

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
import com.nec.jp.orteus.metamorBase.util.BusinessLock.BusinessLock;
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessage;
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessageAccessor;
import com.nec.jp.orteus.metamorBase.common.util.ScreenParam;
import com.nec.jp.orteus.metamorBase.common.CollectNumber.Numbering;
import com.nec.jp.orteus.expj.util.*;
//}}user_implement_dev:import

/**
 * CLASS     : CtrlMain クラス
 * ファイル・クラス説明
 * @author $Author: shan-xiuqin $
 * @version $Revision: 1.23 $ $Date: 2016/05/23 08:12:43 $
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
	public medAD0030B001 m_med=null;

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
	public CtrlMain(medAD0030B001 med, BatchAppConductor cdr) throws BatchAppException
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
	public void setErrNote(String note){
		errNoteHash.put(Integer.toString(errCodeList.size() - 1), note);
	}
	
	/**
	 * エラー工場コードセッター
	 * @param code 工場コード
	 */
	public void setErrPlantCd(String code){
		errPlantCdHash.put(Integer.toString(errCodeList.size() - 1), code);
	}
	
	//SP実行
	/**
	 * ストアドプロシージャ実行
	 * @param logMode ログモード
	 * @param outputMode 出力モード
	 * @param outputPath 出力ファイルパス
	 * @param outputName 出力ファイル名
	 * @param userId ユーザID
	 * @param businessName 業務名
	 * @param plantCd 工場コード
	 * @param finalMonthlyDate 月次処理対象日
	 * @return boolean true 正常終了 : false 異常終了
	 */
	public boolean spExecute(String logMode, String outputMode, String outputPath, 
			String outputName, String userId, String businessName, String plantCd, 
			String oprInstStartDate, String workOdrDlvDate, String jobOdrCd) {
		try {
			// ストアドプロシージャのパラメータをセットする
			m_med.setpvc2LogMode(logMode);
			m_med.setpvc2OutputMode(outputMode);
			m_med.setpvc2OutputPath(outputPath);
			m_med.setpvc2OutputName(outputName);
			m_med.setpvc2UserId(userId);
			m_med.setpvc2BusinessName(businessName);
			m_med.setpvc2PlantCd(plantCd);
			m_med.setpvc2OprInstStartDate(oprInstStartDate);  // 作業製造着手日
			m_med.setpvc2WorkOdrDlvDate(workOdrDlvDate);      // 作業製造納期
			m_med.setpvc2JobOdrCd(jobOdrCd);                  // 製番
			
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
			emsg = new ExpjMessage("ZZ01006", "　　●oprInstStartDate = " + oprInstStartDate);
			m_med.getSyslog().info(emsg, userId);
			emsg = new ExpjMessage("ZZ01006", "　　●workOdrDlvDate = " + workOdrDlvDate);
			m_med.getSyslog().info(emsg, userId);
			emsg = new ExpjMessage("ZZ01006", "　　●jobOdrCd = " + jobOdrCd);
			m_med.getSyslog().info(emsg, userId);
			
			// ストアドプロシージャの実行
			try {
				emsg = new ExpjMessage("ZZ01006", "(SBM0892)●●●　SP実行　●●●");
				m_med.getSyslog().info(emsg, userId);
				m_med.getcallSqlExpandByProc().call();
			} catch (Exception e) {
				errCodeList.add("AD00026");//ストアドプロシージャ実行時エラー
				StringBuffer sb = new StringBuffer();
				sb.append("(SBM0577)ストアドプロシージャ引数：[ ");
				sb.append(logMode + " ");
				sb.append(outputMode + " ");
				sb.append(outputPath + " ");
				sb.append(outputName + " ");
				sb.append(userId + " ");
				sb.append(businessName + " ");
				sb.append(plantCd + " ");
				sb.append(oprInstStartDate + " ");
				sb.append(workOdrDlvDate + " ");
				sb.append(jobOdrCd + " ");
				sb.append(" ]");

				String errNote = sb.toString();
				//エラーノート追加
				setErrNote(errNote);
				setErrPlantCd(plantCd);
				return false;
			}
		} catch (Exception e) {
			errCodeList.add("AD00024");// バッチパラメータの読み込みに失敗しました
			setErrNote("(SBM0580)ユーザコード：[ " + userId + " ] 工場コード：[ " + plantCd + " ]");
			setErrPlantCd(plantCd);
			ExpjMessage emsg = new ExpjMessage("ZZ01006", 
					"(SBM1111)ストアドプロシージャ実行時エラー");
			m_med.getSyslog().severe(emsg, userId);
			return false;
		}
		return true;
	}

	/**
	 * CtrlMainクラスの標準コンストラクタ
	 *
	 */
	public CtrlMain(medAD0030B001 med) throws BatchAppException
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
		String functionName = "SQLEXPANDBYPROC";  // 作業系列展開

		// ストアドプロシージャパラメータ
		String logMode = null;             // ログモード
		String outputMode = null;          // 出力モード
		String outputPath = null;          // 出力パス
		String outputName = null;          // 出力ファイル名
		String userId = null;              // ユーザID
		String businessName = null;        // 業務名（バッチ処理ID）
		String plantCd = null;             // 工場コード
		String oprInstStartDate = null;    // 作業製造着手日
		String workOdrDlvDate = null;      // 作業製造納期
		String jobOdrCd = null;            // 製番
		String etcPrm = null;              // 作業製造着手日+作業製造納期+製番

		// 業務名（バッチ処理ID）の取得
		Class myClass = this.getClass();
		businessName = myClass.getName();
		businessName = businessName.substring(businessName.length() - 19, 
				businessName.length() - 9);

		// main引数受け取り
		String args[] = m_med.getArgs();
		
		// パラメータ確認
		int argsLength = args.length;   // 引数の個数を保持
		
		try {
			// コネクションの取得
			ScreenParam sp = new ScreenParam(this.getClass());
			conn = m_conductor.m_transactionConn;

			// 業務メッセージの準備（引数が渡ってくる前用）
			businessMsgAcc = new BusinessMessageAccessor();
			businessMsg = new BusinessMessage();
			businessMsgAcc.init(conn);
			businessMsg.setBusinessOperatingName(sp.getPackageName(ScreenParam.SHORT));
			businessMsg.setUser("SYSTEM");
			businessMsg.setPlantCode("##");

// 引数の妥当性をチェックし、変数にセットする -----------------------
			if (argsLength != 4) {
				// バッチ処理引数の形式が不正です
				userId = "SYSTEM";
				businessName = sp.getPackageName(ScreenParam.SHORT);
				plantCd = "##";
				errCodeList.add("AD00023");
				setErrNote("(SBM0617)バッチ処理引数数：[ " + argsLength + " ]");
				setErrPlantCd(plantCd);
				Exception e = new Exception();
				ExpjMessage emsg = new ExpjMessage("ZZ01006", "(SBM0838)引数の数が不正です。");
				m_med.getSyslog().severe(emsg, userId);
				throw e;
			}

			batchProcessingTyp = Integer.parseInt(args[0]);
			userId = args[1];
			plantCd = args[2];
			etcPrm = args[3];  // 作業製造着手日+作業製造納期+製番

			StringTokenizer tokEtcPrm = new StringTokenizer(etcPrm,",");
			int i = 0;
			while(tokEtcPrm.hasMoreTokens()){
				if(i == 0){
					oprInstStartDate = (String)tokEtcPrm.nextElement();  // 作業製造着手日
					i++;
				}else if(i == 1){
					workOdrDlvDate = (String)tokEtcPrm.nextElement();    // 作業製造納期
					i++;
				}else{
					jobOdrCd = (String)tokEtcPrm.nextElement();          // 製番
					i++;
				}
			}
				
			if (oprInstStartDate == null || oprInstStartDate.equals("null") 
					|| oprInstStartDate.equals("Null") || oprInstStartDate.equals("NULL")) {
				oprInstStartDate = null;
			}
			if (workOdrDlvDate == null || workOdrDlvDate.equals("null") 
					|| workOdrDlvDate.equals("Null") || workOdrDlvDate.equals("NULL")) {
				workOdrDlvDate = null;
			}
			if (jobOdrCd == null || jobOdrCd.equals("null") || jobOdrCd.equals("Null") 
					|| jobOdrCd.equals("NULL")) {
				jobOdrCd = null;
			}

			// 引数に「null」が入っていた場合。（必須項目）
			if (userId == null || userId.equals("null") || userId.equals("Null") 
					|| userId.equals("NULL")) {
				// バッチ処理引数の形式が不正です
				errCodeList.add("AD00023");
				setErrNote("(SBM0619)ユーザコード：[ " + userId + " ]");
				Exception e = new Exception();
				userId = "SYSTEM";
				plantCd = "##";
				setErrPlantCd(plantCd);
				ExpjMessage emsg = new ExpjMessage("ZZ01006", "(SBM0839)ユーザコードが未入力です。");
				m_med.getSyslog().severe(emsg, userId);
				throw e;
			}
			if (plantCd == null || plantCd.equals("null") || plantCd.equals("Null") 
					|| plantCd.equals("NULL")) {
				// バッチ処理引数の形式が不正です
				errCodeList.add("AD00023");
				setErrNote("(SBM0620)工場コード：[ " + plantCd + " ]");
				userId = "SYSTEM";
				plantCd = "##";
				setErrPlantCd(plantCd);
				Exception e = new Exception();
				ExpjMessage emsg = new ExpjMessage("ZZ01006", "(SBM0840)工場コードが未入力です。");
				m_med.getSyslog().severe(emsg, userId);
				throw e;
			}
				// 業務メッセージの準備
				businessMsg.setBusinessOperatingName(businessName);
				businessMsg.setUser(userId);
				businessMsg.setPlantCode(plantCd);
			
			if (batchProcessingTyp != 1 && batchProcessingTyp != 2) {
				// バッチ処理引数の形式が不正です
				errCodeList.add("AD00023");
				setErrNote("(SBM0621)バッチプロセスタイプ：[ " + batchProcessingTyp + " ]");
				setErrPlantCd(plantCd);
				Exception e = new Exception();
				ExpjMessage emsg = new ExpjMessage("ZZ01006", "(SBM0841)バッチプロセスタイプが不正です。");
				m_med.getSyslog().severe(emsg, userId);
				throw e;
			}

			// バッチパラメータtableから、ストアド共通パラメータを読み込む
			m_med.setprogramCd(businessName);
			m_med.setfunctionName(functionName);
			AbstractBatchAppEntity sysBatParam = m_med.getreadSysBatParm();
			
			try {
				sysBatParam.read();
			} catch (Exception e) {
				errCodeList.add("AD00024");// バッチパラメータの読み込みに失敗しました
				setErrNote("(SBM0580)ユーザコード：[ " + userId + " ] 工場コード：[ " + plantCd + " ]");
				setErrPlantCd(plantCd);
				ExpjMessage emsg = new ExpjMessage("ZZ01006", 
						"(SBM0925)バッチパラメータの読み込みに失敗しました。");
				m_med.getSyslog().severe(emsg, userId);
				throw e;
			}

			if (sysBatParam.next()) {
				logMode = m_med.getlogModeTyp().toString();
				outputMode = m_med.getoutputModeTyp().toString();
				outputPath = m_med.getfilePath();
				outputName = m_med.getfileName();
			} else {
				errCodeList.add("AD00025");// バッチパラメータデータが存在しません
				setErrNote("(SBM0580)ユーザコード：[ " + userId + " ] 工場コード：[ " + plantCd + " ]");
				setErrPlantCd(plantCd);
				Exception e = new Exception();
				ExpjMessage emsg = new ExpjMessage("ZZ01006", 
						"(SBM0576)バッチパラメータデータが存在しません。");
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
				AbstractBatchAppEntity selectUserCd = m_med.getselectUserCd();
				try {
					selectUserCd.read();
				} catch (Exception e) {
					errCodeList.add("ZZ01106");// サーバでエラーが発生しました。
					setErrNote("(SBM0619)ユーザコード：[ " + userId + " ]");
					setErrPlantCd(plantCd);
					ExpjMessage emsg = new ExpjMessage("ZZ01006", 
							"(SBM0927)ユーザコードの読込みに失敗しました。");
					m_med.getSyslog().severe(emsg, userId);
					throw e;
				}

				if (selectUserCd.next()) {
				} else {
					errCodeList.add("ZZ09003");// ユーザコードのパラメータが未入力です。
					setErrNote("(SBM0619)ユーザコード：[ " + userId + " ] ");
					setErrPlantCd(plantCd);
					Exception e = new Exception();
					ExpjMessage emsg = new ExpjMessage("ZZ01006", 
							"(SBM0928)指定されたユーザコードは存在しません。");
					m_med.getSyslog().severe(emsg, userId);
					throw e;
				}
				
				// 工場コードが存在するかどうか
				m_med.setwherePlantCd(plantCd);
				
				m_med.setprogramCd(businessName);
				m_med.setfunctionName(functionName);
				AbstractBatchAppEntity selectPlantCd = m_med.getselectPlantCd();
				try {
					selectPlantCd.read();
				} catch (Exception e) {
					errCodeList.add("AD00034");//工場コードの読込みに失敗しました。
					setErrNote("(SBM0620)工場コード：[ " + plantCd + " ]");
					setErrPlantCd(plantCd);
					ExpjMessage emsg = new ExpjMessage("ZZ01006", 
							"(SBM0929)工場コードの読込みに失敗しました。");
					m_med.getSyslog().severe(emsg, userId);
					throw e;
				}
				if (selectPlantCd.next()) {
				} else {
					errCodeList.add("AD00009");// 指定された工場は存在しません。
					setErrNote("(SBM0620)工場コード：[ " + plantCd + " ]");
					setErrPlantCd(plantCd);
					Exception e = new Exception();
					ExpjMessage emsg = new ExpjMessage("ZZ01006", 
							"(SBM0930)指定された工場は存在しません。");
					m_med.getSyslog().severe(emsg, userId);
					throw e;
				}
				
				// 入力日付のチェック
				// Calendar型の日付を用意
				Calendar calDate = Calendar.getInstance();
				// "yyyy/MM/dd"の日付フォーマットを生成
				DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
				df.setLenient(false);  // 日付解釈のあいまいさをなくす

				// 作業製造着手日か作業製造納期のどちらかに値が入っているか
				if ((oprInstStartDate != null || !oprInstStartDate.equals("")) 
						&& (workOdrDlvDate == null || workOdrDlvDate.equals(""))) {
					// 取得した作業製造着手日が妥当であるか
					try {
						calDate.setTime(df.parse(oprInstStartDate));
					} catch (ParseException e) {
						errCodeList.add("AD00037");// 着手日に指定された日付の形式が不正です。
						setErrNote("(SBM0618)作業製造着手日：[ " + oprInstStartDate + " ]");
						setErrPlantCd(plantCd);
						ExpjMessage emsg = new ExpjMessage("ZZ01006", 
								"(SBM0922)着手日に指定された日付の形式が不正です。");
						m_med.getSyslog().severe(emsg, userId);
						throw e;
					}
				} else if ((oprInstStartDate == null || oprInstStartDate.equals("")) 
						&& (workOdrDlvDate != null || !workOdrDlvDate.equals(""))) {
					// 取得した作業製造納期が妥当であるか
					try {
						calDate.setTime(df.parse(workOdrDlvDate));
					} catch (ParseException e) {
						errCodeList.add("AD00035");// 納期に指定された日付の形式が不正です。
						setErrNote("(SBM0622)作業製造納期：[ " + workOdrDlvDate + " ]");
						setErrPlantCd(plantCd);
						ExpjMessage emsg = new ExpjMessage("ZZ01006", 
								"(SBM0923)納期に指定された日付の形式が不正です。");
						m_med.getSyslog().severe(emsg, userId);
						throw e;
					}
				} else {
					errCodeList.add("AD00023");// バッチ処理引数の形式が不正です
					setErrNote("(SBM0623)作業製造着手日：[ " + oprInstStartDate 
							+ " ] 作業製造納期：[ " + workOdrDlvDate + " ]");
					setErrPlantCd(plantCd);
					ExpjMessage emsg = new ExpjMessage("ZZ01006", 
							"(SBM0924)入力日付のチェックでバッチ処理引数の形式が不正です。");
					m_med.getSyslog().severe(emsg, userId);
					Exception e = new Exception();
					throw e;
				}
			}
			// 業務ロックをかける
			ExpjMessage emsg = new ExpjMessage("ZZ01006", "(SBM0842)◎◎◎　業務ロック開始　◎◎◎");
			m_med.getSyslog().info(emsg, userId);
			Lock = new BusinessLock(conn, userId, plantCd);
			lockCancelKey = Lock.doLock(businessName);  // 解除キーの取得
			// lockCancelKey==-1の場合も業務ロックされているのエラー
			if(lockCancelKey == -1){
				errCodeList.add("ZZ01001");// 業務ロックされているため起動できません
				setErrNote("(SBM0580)ユーザコード：[ " + userId 
						+ " ] 工場コード：[ " + plantCd + " ]");
				setErrPlantCd(plantCd);
				emsg = new ExpjMessage("ZZ01006", 
						"(SBM0843)業務ロックされているため起動できません。");
				m_med.getSyslog().severe(emsg, userId);
				throw new Exception("");
			}
			conn.commit();

			//SP実行
			if (!spExecute(logMode, outputMode, outputPath, outputName, 
					userId, businessName, plantCd, oprInstStartDate, 
					workOdrDlvDate, jobOdrCd)) {
				//結果がfalseの場合もロック解除失敗のエラー
				emsg = new ExpjMessage("ZZ01006", 
						"(SBM1344)◎◎◎　業務ロック解除　◎◎◎ " + plantCd);
				m_med.getSyslog().info(emsg, userId);
				if(!Lock.doUnLock(businessName, lockCancelKey)) {
					throw new FoundationException("CtrlMain", "main", "ZZ01004");
				}
				throw new Exception("");
			}
			//結果がfalseの場合もロック解除失敗のエラー
			emsg = new ExpjMessage("ZZ01006", "(SBM1344)◎◎◎　業務ロック解除　◎◎◎ " + plantCd);
			m_med.getSyslog().info(emsg, userId);
			if (!Lock.doUnLock(businessName, lockCancelKey)) {
				throw new FoundationException("CtrlMain", "main", "ZZ01004");
			}
			conn.commit();
			
		} catch (Exception e) {
			try {
				conn.rollback();
			} catch (FoundationException fe) {
				fe.printStackTrace();
			}
			e.printStackTrace();
			if (errCodeList == null || errCodeList.size() == 0) {
				errCodeList.add("AD00027");//その他　Ｅｒｒｏｒ
				setErrNote("(SBM0580)ユーザコード：[ " + userId 
						+ " ] 工場コード：[ " + plantCd + " ]");
				setErrPlantCd(plantCd);
				ExpjMessage emsg = new ExpjMessage("ZZ01006", "(SBM1363)その他　Ｅｒｒｏｒ");
				m_med.getSyslog().severe(emsg, userId);
			}
		} finally {
			try {
				for (int i = 0; i < errCodeList.size(); i++) {
					String errCode = (String)errCodeList.get(i);
					String errNote = (String)errNoteHash.get(Integer.toString(i));
					String errPlantCd = (String)errPlantCdHash.get(Integer.toString(i));
	
					// 業務メッセージの登録
					if (businessMsg != null) {
						try{
							Numbering numbering = new Numbering(conn, Numbering.LOG_CD, 
									userId, businessName, errPlantCd);
							businessMsg.setLogCode(numbering.getNo());
							businessMsg.setPlantCode(errPlantCd);
							businessMsg.setMessageCode(errCode);
							businessMsg.setData(errNote);
							businessMsgAcc.add(businessMsg);
							ExpjMessage emsg = new ExpjMessage("ZZ01006", 
									"(SBM0836)●●●　業務メッセージの登録　●●● <" + (i + 1) + "/" 
									+ errCodeList.size() + ">");
							m_med.getSyslog().info(emsg, userId);
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
				m_med.getSyslog().info(emsg, userId);

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
					Numbering numbering = new Numbering(conn, Numbering.LOG_CD, 
							userId, businessName, plantCd);
					businessMsg.setLogCode(numbering.getNo());
					businessMsg.setPlantCode(plantCd);
					businessMsg.setMessageCode(errCode);
					businessMsg.setData("");
					businessMsgAcc.add(businessMsg);
					emsg = new ExpjMessage("ZZ01006", "(SBM1345)●●●　業務メッセージの登録　●●●");
					m_med.getSyslog().info(emsg, userId);
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

// ▲INS ====================================================================================
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
		public medAD0030B001 m_med=null;

		/**
		 * コンテナクラスインスタンス
		 */
		public ManageContainer m_container=null;

		//////////////////////////////

		public interControl(medAD0030B001 med) throws BatchAppException
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
