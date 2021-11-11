/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KM0060/src/com/nec/jp/orteus/metamorBase/KM0060/KM0060B001/CtrlMain.java,v $
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

package com.nec.jp.orteus.metamorBase.KM0060.KM0060B001;

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
	import com.nec.jp.orteus.expj.businesslock.BusinessLock;
	import com.nec.jp.orteus.expj.util.ExpjMessage;
	import com.nec.jp.orteus.metamorBase.common.CollectNumber.Numbering;
	import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessage;
	import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessageAccessor;

//}}user_implement_dev:import

/**
 * CLASS     : CtrlMain クラス
 * ファイル・クラス説明
 * @author $Author: luoxiao $
 * @version $Revision: 1.1 $ $Date: 2014/06/10 06:10:46 $
 */

//{{user_implement_dev:header
/**
 *
 * 機能名　案件予算積上バッチ処理
 *
 * [修正履歴]
 * 2014/04/25 初版
 */
//}}user_implement_dev:header

public class CtrlMain extends Object
		implements IBatchAppCommon
{

	//////////////////////////////

	/**
	 * mediatorクラス インスタンス
	 */
	public medKM0060B001 m_med=null;

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
	public CtrlMain(medKM0060B001 med, BatchAppConductor cdr) throws BatchAppException
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
	public CtrlMain(medKM0060B001 med) throws BatchAppException
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

	//////////////////////////////		/** ログレベル インフォメーション */
		private static final int INFOMATION = 0;
		/** ログレベル ワーニング */
		private static final int WORNING = 1;
		/** ログレベル エラー */
		private static final int ERROR = 2;
		
		/** DBコネクション */
		private IDbConnection conn = null;
		
		/** 業務メッセージログ用Numberingクラス */
		private Numbering numbering = null;
		/** 業務メッセージログ用BusinessMessageAccessorクラス */
		private BusinessMessageAccessor businessMsgAcc = new BusinessMessageAccessor();
		/** 業務メッセージログ用BusinessMessageクラス */
		private BusinessMessage businessMsg = new BusinessMessage();
		
		/** 業務ロッククラス */
		private BusinessLock lock = null;
		
		/** ロック失敗時ロックキー */
		private static final int LOCK_FAILD = -1;
		
		/** バッチパラメータ(共通1)業務ID */
		private String _sysProgramId;
		/** バッチパラメータ(共通2)ユーザID */
		private String _sysUserCd;
		/** バッチパラメータ(共通3)工場コード */
		private String _sysPlantCd;
		
		/**
		 * ログファイル出力
		 * @param logLevel ログレベル
		 * @param code メッセージコード
		 * @param value 置換文字列
		 */
		private void writeLogFiles(int logLevel, String code, String value) {
			ExpjMessage emsg;
			// 置換文字列判定
			if (!isNull(value)) {
				emsg = new ExpjMessage(code, value);
			} else {
				emsg = new ExpjMessage(code);
			}
			
			// ログレベルによってログタイプを分ける
			switch (logLevel) {
				case INFOMATION :
					m_med.getSyslog().info(emsg, m_med.getUsername());
					break;
				case WORNING :
					m_med.getSyslog().warning(emsg, m_med.getUsername());
					break;
				case ERROR :
					m_med.getSyslog().severe(emsg, m_med.getUsername());
					break;
			}
		}
		
		/**
		 * ログファイル出力
		 * @param logLevel ログレベル
		 * @param code メッセージコード
		 */
		private void writeLogFiles(int logLevel, String code) {
			writeLogFiles(logLevel, code, null);
		}
		
		/**
		 * ログDB出力
		 * @param code メッセージコード
		 * @param value 置換文字列
		 * @param dataStr データストリング
		 * @throws FoundationException
		 * @throws SQLException
		 */
		private void writeLogDB(String code, String value, String dataStr)
			throws FoundationException, SQLException {
			if (numbering == null) {
				throw new NullPointerException();
			}
			businessMsg.setLogCode(numbering.getNo());
			businessMsg.setMessageCode(code);
			businessMsg.setData(dataStr);
			businessMsgAcc.add(businessMsg);
		}
		
		/**
		 * ログDB出力
		 * @param code メッセージコード
		 * @param dataStr データストリング
		 * @throws FoundationException
		 * @throws SQLException
		 */
		private void writeLogDB(String code, String dataStr) throws FoundationException, SQLException {
			writeLogDB(code, null, dataStr);
		}
		
		/**
		 * ログファイル、ログDB出力を行います。
		 * @param logLevel ログレベル
		 * @param code メッセージコード
		 * @param value 置換文字列
		 * @param dataStr データストリング
		 * @throws FoundationException
		 * @throws SQLException
		 */
		private void writeLog(int logLevel, String code, String value, String dataStr)
			throws FoundationException, SQLException {
			writeLogFiles(logLevel, code, value);
			if (!isNull(dataStr)) {
				writeLogFiles(logLevel, "ZZ01006", dataStr);
			}
			writeLogDB(code, value, dataStr);
		}
		
		/**
		 * ログファイル、ログDB出力を行います。
		 * @param logLevel ログレベル
		 * @param code メッセージコード
		 * @param dataStr データストリング
		 * @throws FoundationException
		 * @throws SQLException
		 */
		private void writeLog(int logLevel, String code, String dataStr)
			throws FoundationException, SQLException {
			writeLog(logLevel, code, null, dataStr);
		}
		
		/**
		 * ログファイル、ログDB出力を行います。
		 * @param logLevel ログレベル
		 * @param code メッセージコード
		 * @throws FoundationException
		 * @throws SQLException
		 */
		private void writeLog(int logLevel, String code) throws FoundationException, SQLException {
			writeLog(logLevel, code, null, null);
		}
		
		/**
		 * 業務ロックを行います
		 * @return ロックキャンセルキー
		 * @throws FoundationException
		 */
		private int businessLock() throws FoundationException {
			lock = new BusinessLock(conn, _sysUserCd, _sysPlantCd);
			// 解除キーの取得
			int lockCancelKey = lock.doLock(m_med.getProgname());
			conn.commit();
			return lockCancelKey;
		}
		
		/**
		 * 業務ロックを解除します
		 * @param lockCancelKey ロックキャンセルキー
		 * @return ロック解除成功時true、失敗時false
		 * @throws FoundationException
		 */
		private boolean businessUnLock(int lockCancelKey) throws FoundationException {
			if (lockCancelKey == LOCK_FAILD) {
				return true;
			}
			boolean result = lock.doUnLock(m_med.getProgname(), lockCancelKey);
			conn.commit();
			return result;
		}
		
		/**
		 * バッチパラメータ（共通）を設定します。
		 * @return 設定に成功した場合は true 、失敗した場合は false を返します。
		 * @throws BatchAppException
		 */
		private boolean setCommonParams() throws BatchAppException {
			String[] args = m_med.getArgs();
			
			// バッチパラメータの形式が不正な場合
			if (args.length <= 2) {
				writeLogFiles(ERROR, "ZZ09022");
				return false;
			}
			_sysProgramId = args[0];
			_sysUserCd = args[1];
			_sysPlantCd = args[2];
			return true;
		}
		
		/**
		 * バッチパラメータ（共通）のチェックを行います。
		 * @return 正常の場合true、不正の場合false
		 * @throws BatchAppException
		 */
		private boolean checkCommonParams() throws BatchAppException {
			// [ユーザマスタ]に存在しない場合
			if (!isExsistsUserMst(_sysUserCd)) {
				writeLogFiles(ERROR, "ZZ09026");
				return false;
			}
			
			// [工場]に存在しない場合
			if (!isExistsMPlant(_sysPlantCd)) {
				writeLogFiles(ERROR, "ZZ09028");
				return false;
			}
			
			return true;
		}
		
		/**
		 * [ユーザマスタ]に存在するかを判定します 。
		 * @return [ユーザマスタ]に存在する場合はtrue、存在しない場合はfalse
		 */
		private boolean isExsistsUserMst(String userCd) throws BatchAppException {
			m_med.setUSER_CD(userCd);
			m_med.getUSER_MST().read();
			return m_med.getUSER_MST().hasRecord(false);
		}
		
		/**
		 * [工場]に存在するかを判定します 。
		 * @param plantCd 工場コード
		 * @return [工場]に存在する場合はtrue、存在しない場合はfalse
		 */
		private boolean isExistsMPlant(String plantCd) throws BatchAppException {
			m_med.setPLANT_CD(plantCd);
			m_med.getM_PLANT().read();
			return m_med.getM_PLANT().hasRecord(false);
		}
		
		/**
		 * 対象の文字列がNull（空文字あるいはNull）であるかを判定します。
		 * @param str 対象文字列
		 * @return Nullの場合はtrue、Nullではない場合はfalse
		 */
		private boolean isNull(String str) {
			if (str == null || str.length() == 0 || str.equalsIgnoreCase("null")) {
				return true;
			}
			return false;
		}

	/**
	 * main： ユーザ定義用メソッドです<br>
	 * <<説明を記述してください>>
	 *
	 * @return <<説明を記述してください>>
	 * @exception <<説明を記述してください>>
	 */
	public int main() throws BatchAppException
	{
		// todo: ここにユーザ定義コードを記述してください
		// ロック解除キー
		int lockCancelKey = LOCK_FAILD;
		
		// PL/SQLの実行結果
		String result = null;
		
		// パラメータ取得
		String args[] = m_med.getArgs();
		
		// DB接続取得処理
		conn = m_conductor.m_transactionConn;
		
		String errinfo ;

		// バッチパラメータ（共通）をパラメータ変数に設定
		if (!setCommonParams()) {
			writeLogFiles(ERROR, "ZZ09009");
			return BREAK;
		}
		// バッチパラメータ（共通）チェック
		if (!checkCommonParams()) {
			writeLogFiles(ERROR, "ZZ09009");
			return BREAK;
		}
		
		
		try{
			// DBメッセージ更新準備
			IDbConnection conn_msg = m_conductor.m_defaultConn;
			numbering = new Numbering(conn_msg, Numbering.LOG_CD, _sysUserCd, _sysProgramId, _sysPlantCd);
			businessMsgAcc.init(conn_msg);
			businessMsg.setBusinessOperatingName(_sysProgramId);
			businessMsg.setUser(_sysUserCd);
			businessMsg.setPlantCode(_sysPlantCd);
			
			m_med.setUsername(_sysUserCd);
			
			// [バッチパラメータ]の検索
			m_med.setPROGRAM_CD(m_med.getProgname());

			int nret = m_med.getSYS_BAT_PARM().read();
			if (!m_med.getSYS_BAT_PARM().next()) {
				writeLog(ERROR, "ZZ09030");
				return BREAK;
			}

			// 業務ロック
			lockCancelKey = businessLock();
			if (lockCancelKey == LOCK_FAILD) {
				writeLog(ERROR, "ZZ01008");
				return BREAK;
			}
			
			// 開始メッセージ
			writeLog(INFOMATION, "KM00040");
			
			// トランザクションの開始
			conn.beginTransWeb();

			//案件数検索
			if( m_med.getT_PROJECT_cnt().read()!= SUCCESS){
				throw new Exception();
			}
			// 存在しない
			if( m_med.getT_PROJECT_cnt().next() == false || "0".equals(m_med.getPJ_count())) {
				return BREAK;
			}
			m_med.setpvc2LogMode(m_med.getLOG_MODE_TYP());
			m_med.setpvc2OutputMode(m_med.getOUTPUT_MODE_TYP());
			m_med.setpvc2OutputPath(m_med.getFILE_PATH());
			m_med.setpvc2OutputName(m_med.getFILE_NAME());
			m_med.setpvc2UserId(_sysUserCd);
			m_med.setpvc2BusinessName(_sysProgramId);
			m_med.setpvc2PlantCd(_sysPlantCd);
			m_med.setpnumFlag("1");  //バッチ実行

			// 案件の検索開始
			if( m_med.getT_PROJECT().read()!= SUCCESS){
				throw new Exception();
			}
			// 案件分、ループ
			for(int rec1=0; m_med.getT_PROJECT().next();rec1++ ){
				//受注番号検索
				if( m_med.getreadODR_NO().read()!= SUCCESS){
					throw new Exception();
				}
				// 受注分、ループ
				for(int rec2=0; m_med.getreadODR_NO().next();rec2++ ){

					m_med.setpvc2OdrNo(m_med.getODR_NO());
					m_med.setpvc2ProjectCd(m_med.getPROJECT_CD());
					m_med.setpnumEstimateNo(m_med.getESTIMATE_NO());
					m_med.setpnumDetalNo(m_med.getDETAL_NO());

					//プロシージャの実行
					List callList = null;
					callList = m_med.getSQLPjBudgetCostMake().call();
	
					// PL/SQLの実行結果を取得
					medKM0060B001 resultMed = (medKM0060B001) callList.get(0);
					result = resultMed.getpnumReturn();

					// 異常終了
					if( "3".equals(result) ) {
						writeLog(ERROR, "KM00059");
						throw new Exception();
					}
					// 警告
					if( "2".equals(result) ) {
						errinfo = "PROJECT_CD:"+m_med.getPROJECT_CD()+",ODR_CD:"+m_med.getODR_NO(); 
						writeLog(WORNING, "KM00060", errinfo );
					}
				}

				// すべて積み上がっているか確認
				if( m_med.getT_ESTIMATE_DETAL().read()!= SUCCESS){
					throw new Exception();
				}
				m_med.getT_ESTIMATE_DETAL().next();
				// すべて積み上がっている
				if( "0".equals(m_med.getOD_NO_count())) {
					// 案件を更新
					m_med.getT_PROJECT().update();
				}
			}
			
			conn.commit();
			result = "0" ;

		} catch (SQLException e) {
			e.printStackTrace();
			throw new BatchAppException("CtrlMain", "main", e.getMessage());
		} catch (FoundationException e) {
			e.printStackTrace();
			throw new BatchAppException("CtrlMain", "main", e.getMessage());
		} catch (Exception e) {
			// ここでExceptionをキャッチしてはいけないのですが、mainメソッドを
			// 呼び出しているexecuteメソッドがStackTraceを行わないためキャッチしています。
			e.printStackTrace();
			throw new BatchAppException("CtrlMain", "main", e.getMessage());
		} finally {
			try {
				// ロールバック
				conn.rollback();
				
				// 業務ロック解除
				if (!businessUnLock(lockCancelKey)) {
					writeLog(ERROR, "ZZ01004");
				}
				
				// 終了ログ
				if( "0".equals(result) ) {
					errinfo = "PROJECT_COUNT:" + m_med.getPJ_count() ;
					writeLog(INFOMATION, "KM00041", errinfo);
				} else {
					writeLog(INFOMATION, "KM00042");
				}
			} catch (Exception e) {
				e.printStackTrace();
				throw new BatchAppException("CtrlMain", "main", e.getMessage());
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
		public medKM0060B001 m_med=null;

		/**
		 * コンテナクラスインスタンス
		 */
		public ManageContainer m_container=null;

		//////////////////////////////

		public interControl(medKM0060B001 med) throws BatchAppException
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
