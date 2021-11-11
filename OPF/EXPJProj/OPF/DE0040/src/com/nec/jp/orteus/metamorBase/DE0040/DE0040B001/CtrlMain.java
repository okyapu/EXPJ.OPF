/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/DE0040/src/com/nec/jp/orteus/metamorBase/DE0040/DE0040B001/CtrlMain.java,v $
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

package com.nec.jp.orteus.metamorBase.DE0040.DE0040B001;

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
import com.nec.jp.orteus.expj.businesslock.BusinessLock;
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessage;
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessageAccessor;
import com.nec.jp.orteus.expj.util.ExpjMessage;
import com.nec.jp.orteus.expj.util.ExpjException;
import com.nec.jp.orteus.expj.util.Numbering;
//}}user_implement_dev:import

/**
 * CLASS     : CtrlMain クラス
 * ファイル・クラス説明
 * @author $Author: xl-hs-zzw $
 * @version $Revision: 1.6 $ $Date: 2014/11/05 07:27:38 $
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
	public medDE0040B001 m_med=null;

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
	public CtrlMain(medDE0040B001 med, BatchAppConductor cdr) throws BatchAppException
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
        public CtrlMain(medDE0040B001 med) throws BatchAppException {
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
        public void finalize() {
         // 各メンバ変数の初期化
         m_med = null;
         m_control = null;
         objMessage = null;
       
         // todo: インスタンス消滅時に実行する処理を記述してください
       
         return;
        }
       
        //////////////////////////////
       
        /** ログレベル インフォメーション */
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
         lock = new BusinessLock(conn, getSysUserCd(), getTargetPlantCd());
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
         * バッチパラメータのチェックを行います。
         * @return 正常の場合true、不正の場合false
         * @throws BatchAppException
         */
        private boolean checkArgs() throws BatchAppException {
         // バッチパラメータの形式が不正な場合
         if (m_med.getArgs().length != 7) {
          writeLogFiles(ERROR, "ZZ09022");
          return false;
         }
       
         // バッチ処理区分がNullの場合
         if (isNull(getSysBatchType())) {
          writeLogFiles(ERROR, "ZZ09023");
          return false;
         }
       
         // バッチ処理区分が１、２以外の場合
         if ((!getSysBatchType().equals("1") && !getSysBatchType().equals("2"))) {
          writeLogFiles(ERROR, "ZZ09024");
          return false;
         }
       
         // ユーザーコードがNullの場合
         if (isNull(getSysUserCd())) {
          writeLogFiles(ERROR, "ZZ09025");
          return false;
         }
       
         // [ユーザマスタ]に存在しない場合
         if (!isExsistsUserMst(getSysUserCd())) {
          writeLogFiles(ERROR, "ZZ09026");
          return false;
         }
       
         // 工場コードがNullの場合
         if (isNull(getSysPlantCd())) {
          writeLogFiles(ERROR, "ZZ09027");
          return false;
         }
         // [工場]に存在しない場合
         if (!isExistsMPlant(getSysPlantCd())) {
          writeLogFiles(ERROR, "ZZ09028");
          return false;
         }
       
         // 業務IDがNullの場合
         if (isNull(getSysProgramId())) {
          writeLogFiles(ERROR, "ZZ09029");
          return false;
         }
       
         // 処理対象工場コードが[工場]に存在しない場合
         if (!isExistsMPlant(getTargetPlantCd())) {
          writeLogFiles(ERROR, "DE00004");
          return false;
         }
       
         // 処理対象工場コードが[原価管理パラメータ]に存在しない場合
         if (!isExistsSysCostCtrl(getTargetPlantCd())) {
          writeLogFiles(ERROR, "DE00005");
          return false;
         }
       
         // 原価計算トラン保持期間が1以上の整数ではない場合。
         String csCalcTrnPeriod = getCsCalcTrnPeriod();
         if (!isPositiveInteger(csCalcTrnPeriod)) {
          writeLogFiles(ERROR, "DE04001");
          return false;
         }
         return true;
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
         * 対象文字列が正の整数であるか判定します。
         * @param arg 対象文字列
         * @return 正の整数の場合true、それ以外の場合false
         */
        private boolean isPositiveInteger(String arg) {
         try {
          Integer num = new Integer(arg);
       
          if (num.compareTo(new Integer("0")) <= 0) {
           return false;
          }
       
         } catch (NumberFormatException e) {
          return false;
         }
         return true;
        }
       
        /**
         * バッチパラメータ(共通1) バッチ処理区分を返します。
         * @return バッチ処理区分
         */
        private String getSysBatchType() {
         return m_med.getArgs()[0];
        }
       
        /**
         * バッチパラメータ(共通2)ユーザIDを返します。
         * @return ユーザID
         */
        private String getSysUserCd() {
         return m_med.getArgs()[1];
        }
       
        /**
         * バッチパラメータ(共通3)工場コードを返します。
         * @return 工場コード
         */
        private String getSysPlantCd() {
         return m_med.getArgs()[2];
        }
       
        /**
         * バッチパラメータ(共通4)業務IDを返します。
         * @return 業務ID
         */
        private String getSysProgramId() {
         return m_med.getArgs()[3];
        }
       
        /**
         * バッチパラメータ(5)処理対象工場コードを返します。<br>
         * Nullの場合バッチパラメータ（共通3）を返します。
         * @return 処理対象工場コード
         */
        private String getTargetPlantCd() {
         String[] args = m_med.getArgs();
         if (!isNull(args[4])) {
          return args[4];
         }
         return getSysPlantCd();
        }
       
        /**
         * バッチパラメータ(6)原価区分を返します。<br>
         * Nullの場合(初期値:1)を返します。
         * @return 原価区分
         */
        private String getCostTyp() {
         String[] args = m_med.getArgs();
         if (isNull(args[5])) {
          return "1";
         }
         return args[5];
        }
       
        /**
         * バッチパラメータ(7)原価計算トラン保持期間を取得します。
         * @return 原価計算トラン保持期間
         */
        private String getCsCalcTrnPeriod() {
         return m_med.getArgs()[6];
        }
       
        /**
         * [原価管理パラメータ]に存在するかを判定します。
         * @param plantCd
         * @return
         * @throws BatchAppException
         */
        private boolean isExistsSysCostCtrl(String plantCd) throws BatchAppException {
         m_med.setPLANT_CD(plantCd);
         m_med.getSYS_COST_CTRL().read();
         return m_med.getSYS_COST_CTRL().hasRecord(false);
        }
       
        /**
         * main： ユーザ定義用メソッドです<br>
         * <<説明を記述してください>>
         *
         * @return <<説明を記述してください>>
         * @exception <<説明を記述してください>>
         */
        public int main() throws BatchAppException, FoundationException {
       
         // ロック解除キー
         int lockCancelKey = LOCK_FAILD;
       
         // パラメータ取得
         String[] args = m_med.getArgs();
       
         // バッチパラメータ出力
         System.out.println("-------------------------------------------------");
         System.out.println("execute " + m_med.getProgname());
         for (int i = 0; i < args.length; i++) {
          System.out.println("args[" + i + "]:" + args[i]);
         }
       
         // DB接続取得処理
         conn = m_conductor.m_transactionConn;
         //SYSLOG英語化用
         if(args.length >= 2){
         	m_med.setUsername(getSysUserCd());
         }
         // 引数チェック
         if (!checkArgs()) {
          writeLogFiles(ERROR, "ZZ09009");
          return BREAK;
         }
       
         // PL/SQLの実行結果
         String result = null;
       
         try {
          // DBメッセージ更新準備
          IDbConnection conn_msg = m_conductor.m_defaultConn;
          numbering =
           new Numbering(
            conn_msg,
            Numbering.LOG_CD,
            getSysUserCd(),
            getSysProgramId(),
            getTargetPlantCd());
          businessMsgAcc.init(conn_msg);
          businessMsg.setBusinessOperatingName(getSysProgramId());
          businessMsg.setUser(getSysUserCd());
          businessMsg.setPlantCode(getTargetPlantCd());
       
       
          // 開始メッセージ
          writeLog(INFOMATION, "ZZ09001");
       
          // 業務ロック
          lockCancelKey = businessLock();
          if (lockCancelKey == LOCK_FAILD) {
           writeLog(ERROR, "ZZ01008");
           return BREAK;
          }
       
          result = excuteProcedure();
          System.out.println("result:" + result);
       
          if ("3".equals(result)) {
           return BREAK;
          }
       
         } catch (SQLException e) {
          e.printStackTrace();
          throw new BatchAppException("CtrlMain", "main", e.getMessage());
         } catch (FoundationException e) {
          e.printStackTrace();
          throw new BatchAppException("CtrlMain", "main", e.getMessage());
         } catch (BatchAppException e) {
          e.printStackTrace();
          throw new BatchAppException("CtrlMain", "main", e.getMessage());
         } catch (Exception e) {
          // これは本来Exceptionをキャッチしてはいけない
          // mainメソッドを呼び出しているexecuteメソッドがStackTraceを行わないためキャッチしています。
          e.printStackTrace();
          throw new BatchAppException("CtrlMain", "main", e.getMessage());
         } finally {
          try {
           // 業務ロック解除
           if (!businessUnLock(lockCancelKey)) {
            writeLogFiles(ERROR, "ZZ01004");
           }
       
           // 終了ログ
           writeLog(INFOMATION, "ZZ09002");
          } catch (Exception e) {
           e.printStackTrace();
           throw new BatchAppException("CtrlMain", "main", e.getMessage());
          }
         }
       
         return BREAK;
        }
       
        /**
         * PL/SQLを実行します。
         * @return 実行結果
         * @throws BatchAppException
         */
        private String excuteProcedure() throws BatchAppException {
       
         // [バッチパラメータ]の検索
         m_med.setPROGRAM_CD(m_med.getProgname());
         m_med.setFUNCTION_NAME("SQLCSCALCTRNDELETE");
       
         int nret = m_med.getSYS_BAT_PARM().read();
         if (!m_med.getSYS_BAT_PARM().next()) {
          ExpjMessage emsg = new ExpjMessage("ZZ09030");
          throw new BatchAppException("CtrlMain", "excuteProcedure", emsg.getMessage(CoreTools.getLocale(getSysUserCd())));
         }
       
         // PL/SQLの実行
         m_med.setpvc2LogMode(m_med.getLOG_MODE_TYP().toString());
         m_med.setpvc2OutPutMode(m_med.getOUTPUT_MODE_TYP().toString());
         m_med.setpvc2OutPutPath(m_med.getFILE_PATH());
         m_med.setpvc2OutPutName(m_med.getFILE_NAME());
         m_med.setpvc2UserId(getSysUserCd());
         m_med.setpvc2BusinessName(getSysProgramId());
         m_med.setpvc2PlantCd(getTargetPlantCd());
         m_med.setpnumCostTyp(getCostTyp());
         m_med.setpnumCsCalcTrnPeropd(getCsCalcTrnPeriod());
       
         System.out.println("-------------------------------------------");
         System.out.println("pvc2LogMode:" + m_med.getpvc2LogMode());
         System.out.println("pvc2OutPutMode:" + m_med.getpvc2OutPutMode());
         System.out.println("pvc2OutPutPath:" + m_med.getpvc2OutPutPath());
         System.out.println("pvc2OutPutName:" + m_med.getpvc2OutPutName());
         System.out.println("pvc2UserId:" + m_med.getpvc2UserId());
         System.out.println("pvc2BusinessName:" + m_med.getpvc2BusinessName());
         System.out.println("pvc2PlantCd:" + m_med.getpvc2PlantCd());
         System.out.println("pnumCostTyp:" + m_med.getpnumCostTyp());
         System.out.println("pnumCsCalcTrnPeropd:" + m_med.getpnumCsCalcTrnPeropd());
       
         List callList = m_med.getSQLCSCALCTRNDELETE().call();
       
         // PL/SQLの実行結果を取得
         medDE0040B001 resultMed = (medDE0040B001) callList.get(0);
         String result = resultMed.getpnumReturn();
       
         return result;
       
        }
       
        //////////////////////////////
       
        /**
         * object型を返します
         *
         * @return object型
         */
        public int getType() {
         return m_control.getType();
        }
       
        /**
         * 初期処理
         *
         * @return <<コメントを記述してください>>
         * @exception <<コメントを記述してください>>
         */
        public int beginProc() throws BatchAppException {
       
         // todo: ここにユーザ定義コードを記述してください
       
         return m_control.beginProc();
        }
       
        /**
         * 終了処理
         *
         * @exception <<コメントを記述してください>>
         */
        public int endProc() throws BatchAppException {
       
         // todo: ここにユーザ定義コードを記述してください
       
         return m_control.endProc();
        }
       
        /**
         * 終了処理
         *
         * @exception <<コメントを記述してください>>
         */
        public int execute() throws BatchAppException {
       
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
		public medDE0040B001 m_med=null;

		/**
		 * コンテナクラスインスタンス
		 */
		public ManageContainer m_container=null;

		//////////////////////////////

		public interControl(medDE0040B001 med) throws BatchAppException
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
