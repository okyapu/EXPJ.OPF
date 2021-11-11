/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AD0030/src/com/nec/jp/orteus/metamorBase/AD0030/AD0030B002/CtrlMain.java,v $
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

package com.nec.jp.orteus.metamorBase.AD0030.AD0030B002;

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

import com.nec.jp.orteus.expj.util.ExpjMessage;
import com.nec.jp.orteus.metamorBase.util.BusinessLock.BusinessLock;
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessage;
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessageAccessor;
import com.nec.jp.orteus.metamorBase.common.CollectNumber.Numbering;
import com.nec.jp.orteus.metamorBase.common.util.ScreenParam;

//}}user_implement_dev:import

/**
 * CLASS     : CtrlMain クラス
 * ファイル・クラス説明
 * @author $Author: shan-xiuqin $
 * @version $Revision: 1.23 $ $Date: 2016/05/23 08:12:46 $
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
	public medAD0030B002 m_med=null;

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
	public CtrlMain(medAD0030B002 med, BatchAppConductor cdr) throws BatchAppException
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

	/** システムログメッセージ作成用 */
	private StringBuffer _sysLogMessage = null;

	/**
	 * 業務メッセージのメッセージコードに表示させるためのコードリストです。
	 */
	List errCodeList = new ArrayList();
	/**
	 * 業務メッセージのデータストリングに表示させるためのノートリストです。
	 */
	Hashtable errNoteHash = new Hashtable();
	/**
	 * 業務メッセージのデータストリングに表示させるためのノートリストを設定します。
	 */
	public void setErrNote(String note){
		errNoteHash.put(Integer.toString(errCodeList.size()-1),note);
	}

	/**
	 * 業務ロジックのシステムログ(エラー)設定処理を切り出して関数化
	 * @param db1 データベース項目１
	 * @param value1 置換文字列１
	 * @param userId ユーザコード
	 */
	private void setWarningSysLogMessage(String db1, String value1, String userId) {
		_sysLogMessage = new StringBuffer();
		_sysLogMessage.append(db1);
		_sysLogMessage.append(":");
		_sysLogMessage.append(value1);
		ExpjMessage emsg 
				= new ExpjMessage("ZZ01006",_sysLogMessage.toString());
		m_med.getSyslog().warning(emsg, userId);
	}
	/**
	 * 業務ロジックのシステムログ（ワーニング）設定処理を切り出して関数化
	 * @param db1 データベース項目１
	 * @param value1 置換文字列１
	 */
	private void setInfoSysLogMessage(String db1, String value1, String userId) {
		_sysLogMessage = new StringBuffer();
		_sysLogMessage.append(db1);
		_sysLogMessage.append(":");
		_sysLogMessage.append(value1);
		ExpjMessage emsg 
				= new ExpjMessage("ZZ01006",_sysLogMessage.toString());
		m_med.getSyslog().info(emsg, userId);
	}

	/**
	 * SPを実行します。
	 * @param logMode LOGモード
	 * @param outputMode 出力モード
	 * @param outputPath 出力パス
	 * @param outputName 出力ファイル名
	 * @param userId ユーザコード
	 * @param businessName 業務名（バッチ処理ID）
	 * @param plantCd 工場コード
	 * @param OprInstStartDate 着手日
	 * @param WorkOdrDlvDate 納期
	 * @param JobOdrCd 製番
	 * @param ItemCd 品目番号
	 * @param WsCd 作業区コード
	 * @param OprRsltTyp 作業実績区分
	 * @param OutSideTyp 作業指示計画（内作）
	 * @param OutSideTyp2 作業指示計画（外作）
	 * @param VendCd 取引先コード
	 * @return true 成功/false 失敗
	 */
	public boolean spExecute(String logMode, String outputMode, String outputPath, String outputName, String userId, String businessName,
				 String plantCd, String OprInstStartDate, String WorkOdrDlvDate, String JobOdrCd, String ItemCd, String WsCd,
				 String OprRsltTyp, String OutSideTyp, String OutSideTyp2, String VendCd){
		try {
			// ストアドプロシージャのパラメータをセットする
			m_med.setpvc2LogMode(logMode);
			m_med.setpvc2OutputMode(outputMode);
			m_med.setpvc2OutputPath(outputPath);
			m_med.setpvc2OutputName(outputName);
			m_med.setpvc2UserId(userId);
			m_med.setpvc2BusinessName(businessName);
			m_med.setpvc2PlantCd(plantCd);
			m_med.setpvc2OprInstStartDate(OprInstStartDate);
			m_med.setpvc2WorkOdrDlvDate(WorkOdrDlvDate);
			m_med.setpvc2JobOdrCd(JobOdrCd);
			m_med.setpvc2ItemCd(ItemCd);
			m_med.setpvc2WsCd(WsCd);
			m_med.setpvc2OprRsltTyp(OprRsltTyp);
			m_med.setpvc2OutSideTyp(OutSideTyp);
			m_med.setpvc2OutSideTyp2(OutSideTyp2);
			m_med.setpvc2VendCd(VendCd);

			System.out.println("Parameter : ");
			System.out.println(" logModeTyp = " + logMode);
			System.out.println(" outputMode = " + outputMode);
			System.out.println(" outputPath = " + outputPath);
			System.out.println(" outputName = " + outputName);
			System.out.println(" userId = " + userId);
			System.out.println(" businessName = " + businessName);
			System.out.println(" plantCd = " + plantCd);
			System.out.println(" OprInstStartDate = " + OprInstStartDate);
			System.out.println(" WorkOdrDlvDate = " + WorkOdrDlvDate);
			System.out.println(" JobOdrCd = " + JobOdrCd);
			System.out.println(" ItemCd = " + ItemCd);
			System.out.println(" WsCd = " + WsCd);
			System.out.println(" OprRsltTyp = " + OprRsltTyp);
			System.out.println(" OutSideTyp = " + OutSideTyp);
			System.out.println(" OutSideTyp2 = " + OutSideTyp2);
			System.out.println(" VendCd = " + VendCd);

			// ストアドプロシージャの実行
			try {
				System.out.println("SPExecute");
				m_med.getcallSqlDailyProc().call();
			} catch (Exception e) {
				errCodeList.add("AD00026"); // ストアドプロシージャ実行時エラー
				StringBuffer sb = new StringBuffer();
				sb.append("SPparameter : ");
				sb.append(logMode + " ");
				sb.append(outputMode + " ");
				sb.append(outputPath + " ");
				sb.append(outputName + " ");
				sb.append(userId + " ");
				sb.append(businessName + " ");
				sb.append(plantCd + " ");
				sb.append(OprInstStartDate + " ");
				sb.append(WorkOdrDlvDate + " ");
				sb.append(JobOdrCd + " ");
				sb.append(ItemCd + " ");
				sb.append(WsCd + " ");
				sb.append(OprRsltTyp + " ");
				sb.append(OutSideTyp + " ");
				sb.append(OutSideTyp2 + " ");
				sb.append(VendCd + " ");
				
				String errNote = sb.toString();
				//エラーノート追加
				setErrNote(errNote);
				return false;
			}
		} catch (Exception e) {
			// バッチパラメータの読み込みに失敗しました
			errCodeList.add("AD00024");
			setErrNote("(SBM0580)ユーザコード：[ " + userId + " ] 工場コード：[ " + plantCd + " ]");
			ExpjMessage emsg = new ExpjMessage("AD00024");
			m_med.getSyslog().warning(emsg, userId);
			setWarningSysLogMessage("userId", userId, userId);
			setWarningSysLogMessage("plantCd", plantCd, userId);
			return false;
		}
		return true;
	}


	/**
	 * CtrlMainクラスの標準コンストラクタ
	 *
	 */
	public CtrlMain(medAD0030B002 med) throws BatchAppException
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
		IDbConnection conn = null;	  // DBコネクション
		BusinessLock Lock = null;     // 業務ロック
		int lockCancelKey = 0;	      // ロック解除キー

		// バッチ処理共通エラー処理
		String errCode = null;		  // エラーコード
		String errNote = "";          // エラーメッセージ(備考)

		// Orteus業務メッセージ

		// metamorBase業務メッセージ
		BusinessMessageAccessor businessMsgAcc = null;
		BusinessMessage businessMsg = null;     // metamorBase業務メッセージ

		// ストアドプロシージャ名
		String functionName = null;
		functionName = "SQLOPRINST";  // 作業指示確定

		// ストアドプロシージャパラメータ
		String logMode = null;             // ログモード
		String outputMode = null;          // 出力モード
		String outputPath = null;          // 出力パス
		String outputName = null;          // 出力ファイル名
		String userId = null;              // ユーザID
		String businessName = null;        // 業務名（バッチ処理ID）
		String plantCd = null;             // 工場コード
		String OprInstStartDate = null;    // 着手日
		String WorkOdrDlvDate = null;      // 納期
		String JobOdrCd = null;            // 製番
		String ItemCd = null;              // 品目番号
		String WsCd = null;                // 作業区コード
		String OprRsltTyp = null;          // 作業実績区分
		String OutSideTyp = null;          // 作業指示計画（内作）
		String OutSideTyp2 = null;         // 作業指示計画（外作）
		String VendCd = null;              // 取引先コード

		// 夜間バッチかマニュアルか
		int batchProcessingTyp = 0;   // 1: 夜間バッチ（自動運転）2: マニュアル（自動運転なし）

		// 業務名（バッチ処理ID）の取得
		Class myClass = this.getClass();
		businessName = myClass.getName();
		businessName = businessName.substring(businessName.length()-19, businessName.length()-9);

		// main引数受け取り
		String args[] = m_med.getArgs();
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

	// 引数の妥当性をチェックし、変数にセットする -----------------------------------------------------------
			if (argsLength != 4) {
				userId = "SYSTEM";
				businessName = sp.getPackageName(ScreenParam.SHORT);
				plantCd = "##";
				errCodeList.add("AD00023");// バッチ処理引数の形式が不正です
				setErrNote("(SBM0617)バッチ処理引数数：[ " + argsLength + " ]");
				Exception e = new Exception();
				ExpjMessage emsg = new ExpjMessage("AD00023");
				m_med.getSyslog().warning(emsg, userId);

				throw e;
			}
			
			batchProcessingTyp = Integer.parseInt(args[0]);
			userId = args[1];
			plantCd = args[2];

			String vcarg = args[3];
			StringTokenizer arg = new StringTokenizer(vcarg,",");
			int i = 0;
			while(arg.hasMoreTokens()){
				if (i==0) {
					OprInstStartDate = (String)arg.nextElement(); 
				} else if (i==1){
					WorkOdrDlvDate = (String)arg.nextElement(); 
				} else if (i==2){
					JobOdrCd = (String)arg.nextElement(); 
				} else if (i==3){
					ItemCd = (String)arg.nextElement(); 
				} else if (i==4){
					WsCd = (String)arg.nextElement(); 
				} else if (i==5){
					OprRsltTyp = (String)arg.nextElement(); 
				} else if (i==6){
					OutSideTyp = (String)arg.nextElement(); 
				} else if (i==7){
					OutSideTyp2 = (String)arg.nextElement(); 
				} else if (i==8){
					VendCd = (String)arg.nextElement(); 
				}
				i++;
			}
			
			System.out.println("(SBM0893)●●●バッチ処理引数のセット●●●");
			System.out.println("　　●businessName = " + businessName);
			System.out.println("　　●batchProcessingTyp = " + batchProcessingTyp);
			System.out.println("　　●userId = " + userId);
			System.out.println("　　●plantCd = " + plantCd);
			System.out.println("　　●OprInstStartDate = " + OprInstStartDate);
			System.out.println("　　●WorkOdrDlvDate = " + WorkOdrDlvDate);
			System.out.println("　　●JobOdrCd = " + JobOdrCd);
			System.out.println("　　●ItemCd = " + ItemCd);
			System.out.println("　　●WsCd = " + WsCd);
			System.out.println("　　●OprRsltTyp = " + OprRsltTyp);
			System.out.println("　　●OutSideTyp = " + OutSideTyp);
			System.out.println("　　●OutSideTyp2 = " + OutSideTyp2);
			System.out.println("　　●VendCd = " + VendCd);

			if(OprInstStartDate == null || OprInstStartDate.equals("null") || OprInstStartDate.equals("Null") || OprInstStartDate.equals("NULL")){
				OprInstStartDate = null;
			}
			if(WorkOdrDlvDate == null || WorkOdrDlvDate.equals("null") || WorkOdrDlvDate.equals("Null") || WorkOdrDlvDate.equals("NULL")){
				WorkOdrDlvDate = null;
			}

			// 引数に「null」が入っていた場合。（必須項目）
			if(batchProcessingTyp != 1 && batchProcessingTyp != 2){
				// バッチ処理引数の形式が不正です
				errCodeList.add("AD00023");
				setErrNote("(SBM0621)バッチプロセスタイプ：[ " + batchProcessingTyp + " ]");
				userId = "SYSTEM";
				plantCd = "##";
				Exception e = new Exception();
				ExpjMessage emsg = new ExpjMessage("AD00023");
				m_med.getSyslog().warning(emsg, userId);

				throw e;
			}
			if(userId == null || userId.equals("null") || userId.equals("Null") || userId.equals("NULL")){
				// バッチ処理引数の形式が不正です
				errCodeList.add("AD00023");
				setErrNote("(SBM0619)ユーザコード：[ " + userId + " ]");
				userId = "SYSTEM";
				plantCd = "##";
				Exception e = new Exception();
				ExpjMessage emsg = new ExpjMessage("AD00023");
				m_med.getSyslog().warning(emsg, userId);
				setWarningSysLogMessage("userId", userId, userId);

				throw e;
			}
			if(plantCd == null || plantCd.equals("null") || plantCd.equals("Null") || plantCd.equals("NULL")){
				// バッチ処理引数の形式が不正です
				errCodeList.add("AD00023");
				setErrNote("(SBM0620)工場コード：[ " + plantCd + " ]");
				userId = "SYSTEM";
				plantCd = "##";
				Exception e = new Exception();
				ExpjMessage emsg = new ExpjMessage("AD00023");
				m_med.getSyslog().warning(emsg, userId);
				setWarningSysLogMessage("plantCd", plantCd, userId);

				throw e;
			}

			// 業務メッセージの準備
			businessMsg.setBusinessOperatingName(businessName);
			businessMsg.setUser(userId);
			businessMsg.setPlantCode(plantCd);

			// 業務ロックをかける
			System.out.println("(SBM0842)◎◎◎　業務ロック開始　◎◎◎");
			Lock = new BusinessLock(conn, userId, plantCd);
			lockCancelKey = Lock.doLock(businessName);  // 解除キーの取得
			// lockCancelKey==-1の場合も業務ロックされているのエラー
			if(lockCancelKey == -1){
				errCodeList.add("ZZ01001");// 業務ロックされているため起動できません
				setErrNote("(SBM0580)ユーザコード：[ " + userId + " ] 工場コード：[ " + plantCd + " ]");
				ExpjMessage emsg = new ExpjMessage("ZZ01001");
				m_med.getSyslog().warning(emsg, userId);
				setWarningSysLogMessage("userId", userId, userId);
				setWarningSysLogMessage("plantCd", plantCd, userId);

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
				// バッチパラメータの読み込みに失敗しました
				errCodeList.add("AD00024");
				setErrNote("(SBM0580)ユーザコード：[ " + userId + " ] 工場コード：[ " + plantCd + " ]");
				ExpjMessage emsg = new ExpjMessage("AD00024");
				m_med.getSyslog().warning(emsg, userId);
				setWarningSysLogMessage("userId", userId, userId);
				setWarningSysLogMessage("plantCd", plantCd, userId);

				throw e;
			}
			
			if (sysBatParam.next()) {
				logMode = m_med.getlogModeTyp().toString();
				outputMode = m_med.getoutputModeTyp().toString();
				outputPath = m_med.getfilePath();
				outputName = m_med.getfileName();
			} else {
				// バッチパラメータデータが存在しません
				errCodeList.add("AD00025");
				setErrNote("(SBM0580)ユーザコード：[ " + userId + " ] 工場コード：[ " + plantCd + " ]");
				ExpjMessage emsg = new ExpjMessage("AD00025");
				m_med.getSyslog().warning(emsg, userId);
				setWarningSysLogMessage("userId", userId, userId);
				setWarningSysLogMessage("plantCd", plantCd, userId);

				Exception e = new Exception();
				throw e;
			}
			// 夜間バッチ（自動運転）の場合
			if ( batchProcessingTyp == 1 ) {

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
					ExpjMessage emsg = new ExpjMessage("ZZ01106");
					m_med.getSyslog().warning(emsg, userId);
					setWarningSysLogMessage("userId", userId, userId);

					throw e;
				}

				if (checkUserCd.next()) {
				} else {
					errCodeList.add("AD00023");// バッチ処理引数の形式が不正です
					setErrNote("(SBM0619)ユーザコード：[ " + userId + " ] ");
					Exception e = new Exception();
					ExpjMessage emsg = new ExpjMessage("AD00023");
					m_med.getSyslog().warning(emsg, userId);
					setWarningSysLogMessage("plantCd", plantCd, userId);

					throw e;
				}

				// 工場コードが存在するかどうか
				m_med.setPLANT_CD(plantCd);
				
				m_med.setpvc2BusinessName(businessName);
				m_med.setfunctionName(functionName);
				AbstractBatchAppEntity checkPlantCd = m_med.getselectPlantCd();
				try {
					checkPlantCd.read();
				} catch (Exception e) {
					errCodeList.add("AD00034");//工場コードの読込みに失敗しました。
					setErrNote("(SBM0620)工場コード：[ " + plantCd + " ]");
					ExpjMessage emsg = new ExpjMessage("AD00034");
					m_med.getSyslog().warning(emsg, userId);
					setWarningSysLogMessage("plantCd", plantCd, userId);

					throw e;
				}
				if (checkPlantCd.next()) {
				} else {
					errCodeList.add("AD00009");// 指定された工場は存在しません。
					setErrNote("(SBM0620)工場コード：[ " + plantCd + " ]");
					Exception e = new Exception();
					ExpjMessage emsg = new ExpjMessage("AD00009");
					m_med.getSyslog().warning(emsg, userId);
					setWarningSysLogMessage("plantCd", plantCd, userId);

					throw e;
				}
				
				// 入力日付のチェック
				// Calendar型の日付を用意
				Calendar calDate = Calendar.getInstance();
				// "yyyy/MM/dd"の日付フォーマットを生成
				DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
				df.setLenient(false);  // 日付解釈のあいまいさをなくす

				// 着手日か納期のどちらかに値が入っているか
				if ((OprInstStartDate != null || !OprInstStartDate.equals("")) && (WorkOdrDlvDate == null || WorkOdrDlvDate.equals(""))){
					// 取得した着手日が妥当であるか
					try {
						calDate.setTime(df.parse(OprInstStartDate));
					} catch (ParseException e) {
						errCodeList.add("AD00037");// 着手日に指定された日付の形式が不正です。
						setErrNote("(SBM0624)着手日：[ " + OprInstStartDate + " ]");
						ExpjMessage emsg = new ExpjMessage("AD00037");
						m_med.getSyslog().warning(emsg, userId);
						setWarningSysLogMessage("OprInstStartDate", OprInstStartDate, userId);

						throw e;
					}
				}else if((OprInstStartDate == null || OprInstStartDate.equals("")) && (WorkOdrDlvDate != null || !WorkOdrDlvDate.equals(""))){
					// 取得した納期が妥当であるか
					try {
						calDate.setTime(df.parse(WorkOdrDlvDate));
					} catch (ParseException e) {
						errCodeList.add("AD00035");// 納期に指定された日付の形式が不正です。
						setErrNote("(SBM0625)納期：[ " + WorkOdrDlvDate + " ]");
						ExpjMessage emsg = new ExpjMessage("AD00035");
						m_med.getSyslog().warning(emsg, userId);
						setWarningSysLogMessage("WorkOdrDlvDate", WorkOdrDlvDate, userId);

						throw e;
					}
				}else{
					errCodeList.add("AD00023");// バッチ処理引数の形式が不正です
					setErrNote("(SBM0626)着手日：[ " + OprInstStartDate + " ] 納期：[ " + WorkOdrDlvDate + " ]");
					ExpjMessage emsg = new ExpjMessage("AD00023");
					m_med.getSyslog().warning(emsg, userId);
					setWarningSysLogMessage("OprInstStartDate", OprInstStartDate, userId);
					setWarningSysLogMessage("WorkOdrDlvDate", WorkOdrDlvDate, userId);

					Exception e = new Exception();
					throw e;
				}
			}
			// SP実行
			if (!spExecute(logMode,outputMode,outputPath,outputName,userId,businessName,plantCd,OprInstStartDate,
						 WorkOdrDlvDate,JobOdrCd,ItemCd,WsCd,OprRsltTyp,OutSideTyp,OutSideTyp2,VendCd)){
				throw new Exception("");
			}
		} catch (Exception e) {
			try{
				conn.rollback();
			}catch(FoundationException fe){
				fe.printStackTrace();
				ExpjMessage exmsg = new ExpjMessage("ZZ01106");
				m_med.getSyslog().severe(exmsg, userId);
			}
			e.printStackTrace();
			if (errCodeList == null || errCodeList.size() == 0) {
				errCodeList.add("AK00010");//その他　Ｅｒｒｏｒ
				setErrNote("(SBM0580)ユーザコード：[ " + userId + " ] 工場コード：[ " + plantCd + " ]");
				ExpjMessage emsg = new ExpjMessage("AK00010");
				m_med.getSyslog().warning(emsg, userId);
				setWarningSysLogMessage("userId", userId, userId);
				setWarningSysLogMessage("plantCd", plantCd, userId);

			}
		} finally {
			for(int i=0;i<errCodeList.size();i++){
				errCode = (String)errCodeList.get(i);
				errNote = (String)errNoteHash.get(Integer.toString(i));

				// 業務メッセージの登録
				if (businessMsg != null) {
					try{
						Numbering numbering = new Numbering(conn,Numbering.LOG_CD,userId,businessName,plantCd);
						businessMsg.setLogCode(numbering.getNo());
						businessMsg.setMessageCode(errCode);
						businessMsg.setData(errNote);
						businessMsgAcc.add(businessMsg);
						System.out.println("(SBM0836)●●●　業務メッセージの登録　●●● <" + (i+1) + "/" + errCodeList.size() + ">");
						System.out.println("　　●userId = " + userId);
						System.out.println("　　●plantCd = " + plantCd);
						System.out.println("　　●No:" + businessMsg.getLogCode() + " errCode:" + errCode + " errNote:" + errNote);

					} catch (Exception ex) {
						ex.printStackTrace();
						ExpjMessage emsg = new ExpjMessage("ZZ01106");
						m_med.getSyslog().warning(emsg, userId);
					}
				}
			}
			try {
				System.out.println("(SBM1344)◎◎◎　業務ロック解除　◎◎◎");

				//結果がfalseの場合もロック解除失敗のエラー
				if(!Lock.doUnLock(businessName, lockCancelKey))
					throw new FoundationException("CtrlMain", "main", "ZZ01004");
				
			}catch (FoundationException e) {
				e.printStackTrace();
				errCode = "ZZ01004";  // 業務ロックの解除に失敗しました。
				ExpjMessage emsg = new ExpjMessage("ZZ01004");
				m_med.getSyslog().warning(emsg, userId);

				
				try {
					// 業務メッセージの登録（業務ロック解除失敗時）
					Numbering numbering = new Numbering(conn,Numbering.LOG_CD,userId,businessName,plantCd);
					businessMsg.setLogCode(numbering.getNo());
					businessMsg.setMessageCode(errCode);
					businessMsg.setData("");
					businessMsgAcc.add(businessMsg);
					System.out.println("(SBM1345)●●●　業務メッセージの登録　●●●");
					System.out.println("　　●No:" + businessMsg.getLogCode() + " errCode:" + errCode);
					
				} catch (SQLException ex) {
					ex.printStackTrace();
					ExpjMessage exmsg = new ExpjMessage("ZZ01106");
					m_med.getSyslog().severe(exmsg, userId);
					ExpjMessage eexmsg = new ExpjMessage("ZZ01006", e.toString());
					m_med.getSyslog().severe(eexmsg, userId);
				} catch (FoundationException ex) {
					ex.printStackTrace();
					ExpjMessage exmsg = new ExpjMessage("ZZ01106");
					m_med.getSyslog().severe(exmsg, userId);
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
		public medAD0030B002 m_med=null;

		/**
		 * コンテナクラスインスタンス
		 */
		public ManageContainer m_container=null;

		//////////////////////////////

		public interControl(medAD0030B002 med) throws BatchAppException
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
