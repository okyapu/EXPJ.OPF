/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AC0150/src/com/nec/jp/orteus/metamorBase/AC0150/AC0150B001/CtrlMain.java,v $
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

package com.nec.jp.orteus.metamorBase.AC0150.AC0150B001;

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
 * @author $Author: zhou-kehong $
 * @version $Revision: 1.8 $ $Date: 2014/11/28 01:27:48 $
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
	public medAC0150B001 m_med=null;

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
	public CtrlMain(medAC0150B001 med, BatchAppConductor cdr) throws BatchAppException
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
		 */
	public CtrlMain(medAC0150B001 med) throws BatchAppException
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
		// =============
		// 共 通 変 数 
		// =============
		IDbConnection conn = null; // DBコネクション
		BusinessLock Lock = null; // 業務ロック
		int lockCancelKey = 0; // ロック解除キー
		Numbering logCd = null; // ログ識別コード採番の準備

		// バッチ処理共通エラー処理
		String errCode = null; // エラーコード
		String errMsg = null; // エラーメッセージ
		String errNote = ""; // エラーメッセージ(備考)

		// metamorBase業務メッセージ
		BusinessMessageAccessor businessMsgAcc = null;
		BusinessMessage businessMsg = null; // metamorBase業務メッセージ
		String businessErrCode = null; // metamorBase業務メッセージコード

		// 業務メッセージ
		String memoText = ""; // 業務メッセージ 備考

		// 夜間バッチかマニュアルか
		int batchProcessingTyp = 0; // 1: 夜間バッチ（自動運転）2: マニュアル（自動運転なし）

		// ストアドプロシージャ名
		String functionName = null;

		// ストアドプロシージャパラメータ
		String logMode = null; // ログモード
		String outputMode = null; // 出力モード
		String outputPath = null; // 出力パス
		String outputName = null; // 出力ファイル名
		String userId = null; // ユーザID
		String businessName = null; // 業務名（バッチ処理ID）
		String batchTyp = null;             //バッチ処理区分
		String plantCd = null; // 工場コード
		String SysTime = null; // 管理区分 1：ＭＲＰ ２：製番
		String jobOdrCd = null; // 製番
		String jobOdrDetailNo = null; // 製番枝番（SI対応項目 metamorBaseでは未使用）

		
		// ==========
		// 共通処理
		// ==========
		
		// 固定値をセット
		functionName = "SQLODRELEASE_IND"; // 個別オーダ発効

		// 業務名（バッチ処理ID）の取得
		Class myClass = this.getClass();
		businessName = myClass.getName();
		businessName = businessName.substring(businessName.length() - 19,
				businessName.length() - 9);

		// main引数受け取り
		String args[] = m_med.getArgs();
		int argsLength = args.length; // 引数の個数を保持

		try { 
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
				if (errCode == null) {
					errCode = "AC00113"; // バッチパラメータの読み込みに失敗しました
				}
				throw e;
			}
			
			// ===================
			// バッチ（運転）
			// ===================
			
			// 引数の妥当性をチェックし、変数にセットする -------------------
			if (argsLength == 5) {
				batchTyp = args[0];
				userId = args[1];
				plantCd = args[2];
				SysTime = args[3];
				jobOdrCd = args[4]; // 製番の場合のみセット
				jobOdrDetailNo = null; // SI対応項目 metamorBaseでは未使用
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

			try { // try2 --
				// 業務ロックをかける
				try {
					Lock = new BusinessLock(conn, userId, plantCd);
					lockCancelKey = Lock.doLock(businessName); // 解除キーの取得
					conn.commit();
					if (lockCancelKey == -1)
						throw new Exception();
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
				m_med.setpvc2SysTime(SysTime);
				m_med.setpvc2JobOdrCd(jobOdrCd);
				m_med.setpvc2JobOdrDetailNo(jobOdrDetailNo);

				// 追加
				// ストアドプロシージャの実行
				try {
					m_med.getCallSqlOdRelease_Ind().call();
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
					sb.append(SysTime + " ");
					sb.append(jobOdrCd + " ");
					sb.append(jobOdrDetailNo + " ");
					errNote = sb.toString();
					throw e;
				}

			} catch (Exception e) { 
				if (errCode == null) {
					errCode = "AC53402"; // その他 Ｅｒｒｏｒ
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
						logCd = new Numbering(m_conductor.m_transactionConn,
								Numbering.LOG_CD, args[1], businessName,
								plantCd);
						businessMsg.setLogCode(logCd.getNo());
						businessMsgAcc.add(businessMsg);
					} catch (SQLException ex) {
						ex.printStackTrace();
						throw ex;
					}
				}
				memoText = errMsg; // 備考メッセージ
				throw e;

			} finally { 
				try {
					Lock.doUnLock(businessName, lockCancelKey);
					conn.commit();
				} catch (FoundationException e) {
					e.printStackTrace();
					businessErrCode = "ZZ01004"; // 業務ロックの解除に失敗しました。

					// 業務メッセージの登録（業務ロック解除失敗時）
					businessMsg.setMessageCode(businessErrCode);
					businessMsg.setData("");
					try {
						logCd = new Numbering(m_conductor.m_transactionConn,
								Numbering.LOG_CD, args[1], businessName,
								plantCd);
						businessMsg.setLogCode(logCd.getNo());
						businessMsgAcc.add(businessMsg);
					} catch (SQLException ex) {
						ex.printStackTrace();
					}
					AlarmMessage msg = new AlarmMessage(businessErrCode);
					errMsg = "[" + businessErrCode + "]" + msg.getMessage();
					memoText = errMsg; // 備考メッセージ

				}
			} 

		} catch (Exception e) {
			if (errCode == null) {
				errCode = "AC53402"; // その他 Ｅｒｒｏｒ
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
			m_med.setpvc2SysTime(args[3]);
			m_med.setpvc2UserId(args[1]);
			m_med.getDeleteT_OdReleas_T();
			throw new BatchAppException("CtrlMain", "main", errMsg);

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
		public medAC0150B001 m_med=null;

		/**
		 * コンテナクラスインスタンス
		 */
		public ManageContainer m_container=null;

		//////////////////////////////

		public interControl(medAC0150B001 med) throws BatchAppException
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
