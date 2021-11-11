/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/DB0020/src/com/nec/jp/orteus/metamorBase/DB0020/DB0020B001/CtrlMain.java,v $
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

package com.nec.jp.orteus.metamorBase.DB0020.DB0020B001;

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
 * @version $Revision: 1.10 $ $Date: 2014/11/05 07:21:08 $
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
	public medDB0020B001 m_med=null;

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
	public CtrlMain(medDB0020B001 med, BatchAppConductor cdr) throws BatchAppException
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
	public CtrlMain(medDB0020B001 med) throws BatchAppException {
		// メンバ変数を初期化します
		m_med = med;
		m_control = new interControl(med);

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
	private boolean checkArgs() throws FoundationException, BatchAppException, SQLException {
		// バッチパラメータの形式が不正な場合
		if (m_med.getArgs().length != 10) {
			writeLog(ERROR, "ZZ09022");
			return false;
		}

		// バッチ処理区分がNullの場合
		if (isNull(getSysBatchType())) {
			writeLog(ERROR, "ZZ09023");
			return false;
		}

		// バッチ処理区分が１、２以外の場合
		if ((!getSysBatchType().equals("1") && !getSysBatchType().equals("2"))) {
			writeLog(ERROR, "ZZ09024");
			return false;
		}

		// ユーザーコードがNullの場合
		if (isNull(getSysUserCd())) {
			writeLog(ERROR, "ZZ09025");
			return false;
		}

		// [ユーザマスタ]に存在しない場合
		if (!isExsistsUserMst(getSysUserCd())) {
			writeLog(ERROR, "ZZ09026");
			return false;
		}

		// 工場コードがNullの場合
		if (isNull(getSysPlantCd())) {
			writeLog(ERROR, "ZZ09027");
			return false;
		}
		// [工場]に存在しない場合
		if (!isExistsMPlant(getSysPlantCd())) {
			writeLog(ERROR, "ZZ09028");
			return false;
		}

		// 業務IDがNullの場合
		if (isNull(getSysProgramId())) {
			writeLog(ERROR, "ZZ09029");
			return false;
		}

		// 処理対象工場コードが[工場]に存在しない場合
		if (!isExistsMPlant(getTargetPlantCd())) {
			writeLog(ERROR, "DB00004");
			return false;
		}

		// 実行処理区分が１、２、３以外の場合
		String executeType = getExecuteType();
		if (!executeType.equals("1") && !executeType.equals("2") && !executeType.equals("3")) {
			writeLog(ERROR, "DB00005");
			return false;
		}
		// 更新処理モードが１、２以外の場合
		String updateMode = getUpdateMode();
		if (!updateMode.equals("1") && !updateMode.equals("2")) {
			writeLog(ERROR, "DB00006");
			return false;
		}
		// [原価管理パラメータ]に存在しない場合
		if (getPriorityType() == null) {
			writeLog(ERROR, "DB00007");
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
	 * バッチパラメータ(5)処理対象工場コードを返します。
	 * @return 処理対象工場コード
	 */
	private String getTargetPlantCd() {
		String args[] = m_med.getArgs();
		if (!isNull(args[4])) {
			return args[4];
		}
		return getSysPlantCd();
	}
	/**
	 * バッチパラメータ(6)対象年度を返します。
	 * @return 対象年度
	 */
	private String getYear() throws BatchAppException {
		String args[] = m_med.getArgs();
		if (!isNull(args[5])) {
			return args[5];
		}
		if (!isNull(m_med.getYEAR())) {
			return m_med.getYEAR();
		}
		String p = m_med.getPLANT_CD();
		m_med.setPLANT_CD(getSysPlantCd());
		m_med.getSYS_COST_CTRL().read();
		m_med.getSYS_COST_CTRL().next();
		m_med.setPLANT_CD(p);
		return m_med.getYEAR();
	}

	/**
	 * バッチパラメータ(7)半期区分を返します。
	 * @return 半期区分
	 */
	private String getHalfTermTyp() throws BatchAppException {
		String args[] = m_med.getArgs();
		if (!isNull(args[6])) {
			return args[6];
		}
		if (!isNull(m_med.getHALF_TERM_TYP())) {
			return m_med.getHALF_TERM_TYP();
		}
		String p = m_med.getPLANT_CD();
		m_med.setPLANT_CD(getSysPlantCd());
		m_med.getSYS_COST_CTRL().read();
		m_med.getSYS_COST_CTRL().next();
		m_med.setPLANT_CD(p);
		return m_med.getHALF_TERM_TYP();
	}
	/**
	 * バッチパラメータ(8)原価種別を返します。起動引数省略時は「1」を返します。
	 * @return 原価種別
	 */
	private String getCostType() {
		String args[] = m_med.getArgs();
		if (!isNull(args[7])) {
			return args[7];
		}
		return "1";
	}

	/**
	 * バッチパラメータ(9)実行処理区分を返します。
	 * @return 1:工程情報抽出と工程情報一括登録（デフォルト）
	 *          2:工程情報抽出処理のみ
	 *          3:工程情報一括登録のみ
	 */
	private String getExecuteType() {
		String args[] = m_med.getArgs();
		if (!isNull(args[8])) {
			return args[8];
		}
		return "1";
	}

	/**
	 * バッチパラメータ(10)更新モード区分を返します。
	 * @return 1:差分更新（デフォルト）
	 *          2:全件更新
	 */
	private String getUpdateMode() {
		String args[] = m_med.getArgs();
		if (!isNull(args[9])) {
			return args[9];
		}
		return "1";
	}

	/**
	 * "購入品マスタ優先区分"を返します。
	 * @return [原価管理パラメータ]."購入品マスタ優先区分"
	 * 存在しない場合はnullを返す。
	 */
	private String getPriorityType() throws BatchAppException {
		if (isNull(m_med.getPRIORITY_TYP())) {
			m_med.setPLANT_CD(getTargetPlantCd());
			m_med.getSYS_COST_CTRL().read();
			m_med.getSYS_COST_CTRL().next();
		}
		return m_med.getPRIORITY_TYP();
	}

	/**
	 * [原価管理パラメータ]."年度開始日"を返します。
	 * @return [原価管理パラメータ]."年度開始日"
	 * 存在しない場合はnullを返す。
	 */
	private String getStartMonth(String plantCd) throws BatchAppException {
		if (m_med.getSTART_MONTH() == null) {
			m_med.setPLANT_CD(plantCd);
			m_med.getSYS_COST_CTRL().read();
			m_med.getSYS_COST_CTRL().next();
		}
		return m_med.getSTART_MONTH();
	}

	/**
	 * main： ユーザ定義用メソッドです<br>
	 * <<説明を記述してください>>
	 *
	 * @return <<説明を記述してください>>
	 * @exception <<説明を記述してください>>
	 */
	public int main() throws BatchAppException, FoundationException {

		System.out.println("main");

		// ロック解除キー
		int lockCancelKey = LOCK_FAILD;

		// パラメータ取得
		String args[] = m_med.getArgs();

		// バッチパラメータ出力
		System.out.println("-------------------------------------------------");
		System.out.println("execute " + m_med.getProgname());
		for (int i = 0; i < args.length; i++) {
			System.out.println("args[" + i + "]:" + args[i]);
		}

		// DB接続取得処理
		conn = m_conductor.m_transactionConn;

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
			
			//SYSLOG英語化用
			if(args.length >= 2){
				m_med.setUsername(getSysUserCd()); // writelogで使用
			}
			

			// 引数チェック
			if (!checkArgs()) {
				writeLog(ERROR, "ZZ09009");
				return BREAK;
			}
			
			// 開始メッセージ
			writeLog(INFOMATION, "ZZ09001");

			// 業務ロック
			lockCancelKey = businessLock();
			if (lockCancelKey == LOCK_FAILD) {
				writeLog(ERROR, "ZZ01008");
				return BREAK;
			}

			String executeType = getExecuteType();
			if (executeType.equals("1") || executeType.equals("2")) {
				// 購入単価情報抽出処理
				if (executeCsPuchOut() == 3) {
					return BREAK;
				}
			}
			
			if (executeType.equals("1") || executeType.equals("3")) {
				// 購入品情報一括登録処理
				if (executeCsPuchAll() == 3) {
					return BREAK;
				}
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
				// ロールバック
				conn.rollback();

				// 業務ロック解除
				if (!businessUnLock(lockCancelKey)) {
					writeLog(ERROR, "ZZ01004");
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
	 * 購入単価情報抽出処理を実行します。
	 * @return 戻り値
	 * @throws BatchAppException, FoundationException
	 */
	private int executeCsPuchOut() throws BatchAppException, FoundationException {

		m_med.setPROGRAM_CD(m_med.getProgname());
		m_med.setFUNCTION_NAME("SQLCSPUCHOUT");
		
		m_med.getSYS_BAT_PARM().read();
		if (!m_med.getSYS_BAT_PARM().next()) {
			ExpjMessage emsg = new ExpjMessage("ZZ09030");
			throw new BatchAppException("CtrlMain","",emsg.getMessage(CoreTools.getLocale(getSysUserCd())));
		}

		// EXPLANNNER/J必須項目の設定
		m_med.setpvc2LogMode(m_med.getLOG_MODE_TYP());
		m_med.setpvc2OutPutMode(m_med.getOUTPUT_MODE_TYP());
		m_med.setpvc2OutPutPath(m_med.getFILE_PATH());
		m_med.setpvc2OutPutName(m_med.getFILE_NAME());
		m_med.setpvc2UserId(getSysUserCd());
		m_med.setpvc2BusinessName(getSysProgramId());
		m_med.setpvc2PlantCd(getTargetPlantCd());
		
		// プログラム固有項目の設定
		m_med.setBATCH_TYP(Integer.valueOf(getSysBatchType()));
		m_med.setpnumYear(Integer.valueOf(getYear()));
		m_med.setpnumHalfTermTyp(Integer.valueOf(getHalfTermTyp()));
		m_med.setpnumCostTyp(Integer.valueOf(getCostType()));
		m_med.setpnumYyyyMm(
			Integer.valueOf(
				getStartMonthOfHalfTerm(
					getYear(),
					getStartMonth(getTargetPlantCd()),
					getHalfTermTyp())));
		m_med.setpnumExecuteTyp(Integer.valueOf(getExecuteType()));
		m_med.setpnumUpdateMode(Integer.valueOf(getUpdateMode()));

		System.out.println("--------------------------------------");
		System.out.println("pvc2LogMode: " + m_med.getpvc2LogMode());
		System.out.println("pvc2OutPutMode: " + m_med.getpvc2OutPutMode());
		System.out.println("pvc2OutPutPath: " + m_med.getpvc2OutPutPath());
		System.out.println("pvc2OutPutName: " + m_med.getpvc2OutPutName());
		System.out.println("pvc2UserId: " +  m_med.getpvc2UserId());
		System.out.println("pvc2BusinessName: " + m_med.getpvc2BusinessName());
		System.out.println("pvc2PlantCd: " + m_med.getpvc2PlantCd());
		
		// プログラム固有項目
		System.out.println("pnumYear:  " + m_med.getpnumYear());
		System.out.println("pnumHalfTermTyp: " + m_med.getpnumHalfTermTyp());
		System.out.println("pnumCostTyp: " + m_med.getpnumCostTyp().toString());
		System.out.println("pnumYyyyMm: " + m_med.getpnumYyyyMm().toString());
		System.out.println("pnumExecuteTyp: " + m_med.getpnumExecuteTyp().toString());
		System.out.println("pnumUpdateMode: " + m_med.getpnumUpdateMode().toString());
		
		List returnList = m_med.getSQLCSPUCHOUT().call();
		
		medDB0020B001 resultMed = (medDB0020B001) returnList.get(0);
		System.out.println(resultMed.getpnumReturn().intValue());
		
		return resultMed.getpnumReturn().intValue();

	}

	/**
	 * 購入品情報一括登録処理を実行します。
	 * @return 戻り値
	 * @throws BatchAppException, FoundationException
	 */
	private int executeCsPuchAll() throws BatchAppException, FoundationException {
		m_med.setPROGRAM_CD(m_med.getProgname());
		m_med.setFUNCTION_NAME("SQLCSPUCHALL");
		
		m_med.getSYS_BAT_PARM().read();
		if (!m_med.getSYS_BAT_PARM().next()) {
			ExpjMessage emsg = new ExpjMessage("ZZ09030");
			throw new BatchAppException("CtrlMain","",emsg.getMessage(CoreTools.getLocale(getSysUserCd())));
		}

		// EXPLANNNER/J必須項目の設定
		m_med.setpvc2LogMode(m_med.getLOG_MODE_TYP());
		m_med.setpvc2OutPutMode(m_med.getOUTPUT_MODE_TYP());
		m_med.setpvc2OutPutPath(m_med.getFILE_PATH());
		m_med.setpvc2OutPutName(m_med.getFILE_NAME());
		m_med.setpvc2UserId(getSysUserCd());
		m_med.setpvc2BusinessName(getSysProgramId());
		m_med.setpvc2PlantCd(getTargetPlantCd());
		
		// プログラム固有項目の設定
		m_med.setBATCH_TYP(Integer.valueOf(getSysBatchType()));
		m_med.setpnumYear(Integer.valueOf(getYear()));
		m_med.setpnumHalfTermTyp(Integer.valueOf(getHalfTermTyp()));
		m_med.setpnumCostTyp(Integer.valueOf(getCostType()));
		m_med.setpnumYyyyMm(
			Integer.valueOf(
				getStartMonthOfHalfTerm(
					getYear(),
					getStartMonth(getTargetPlantCd()),
					getHalfTermTyp())));
		m_med.setpnumExecuteTyp(Integer.valueOf(getExecuteType()));
		m_med.setpnumUpdateMode(Integer.valueOf(getUpdateMode()));

		System.out.println("--------------------------------------");
		System.out.println("pvc2LogMode: " + m_med.getpvc2LogMode());
		System.out.println("pvc2OutPutMode: " + m_med.getpvc2OutPutMode());
		System.out.println("pvc2OutPutPath: " + m_med.getpvc2OutPutPath());
		System.out.println("pvc2OutPutName: " + m_med.getpvc2OutPutName());
		System.out.println("pvc2UserId: " +  m_med.getpvc2UserId());
		System.out.println("pvc2BusinessName: " + m_med.getpvc2BusinessName());
		System.out.println("pvc2PlantCd: " + m_med.getpvc2PlantCd());
		
		// プログラム固有項目
		System.out.println("pnumYear:  " + m_med.getpnumYear());
		System.out.println("pnumHalfTermTyp: " + m_med.getpnumHalfTermTyp());
		System.out.println("pnumCostTyp: " + m_med.getpnumCostTyp().toString());
		System.out.println("pnumYyyyMm: " + m_med.getpnumYyyyMm().toString());
		System.out.println("pnumExecuteTyp: " + m_med.getpnumExecuteTyp().toString());
		System.out.println("pnumUpdateMode: " + m_med.getpnumUpdateMode().toString());
		
		List returnList = m_med.getSQLCSPUCHALL().call();
		
		medDB0020B001 resultMed = (medDB0020B001) returnList.get(0);
		System.out.println(resultMed.getpnumReturn().intValue());
		
		return resultMed.getpnumReturn().intValue();

	}

	/**
	 * 「対象年度」「年度開始月」「半期区分」を基に暦日の年月（yyyyMM）を計算します。<br>
	 * （例）対象年度=2005、開始月=7の場合<br>
	 * ･上期の場合：200507
	 * ･下期の場合：200601
	 * @param year 対象年度
	 * @param startMonth 開始月
	 * @param halfTerm 半期区分（1:上期　2:下期）
	 * @return 暦日の年月（yyyyMM）
	 * @throws IllegalArgumentException 引数が不正（Null）の場合
	 * @throws NumberFormatException 引数が数字ではない場合
	 */
	private String getStartMonthOfHalfTerm(String year, String startMonth, String halfTerm) {

		if (halfTerm == null || year == null || startMonth == null) {
			throw new IllegalArgumentException();
		}
		int y = Integer.parseInt(year);
		int m = Integer.parseInt(startMonth);

		y = m > 6 ? y + 1 : y;
		m = m > 6 ? m - 6 : m + 6;
		if (halfTerm.equals("2")) {
			y = m > 6 ? y + 1 : y;
			m = m > 6 ? m - 6 : m + 6;
		}
		StringBuffer startYM = new StringBuffer(String.valueOf(m));
		if (m < 10) {
			startYM.insert(0, '0');
		}
		startYM.insert(0, String.valueOf(y));
		while (true) {
			if (startYM.length() >= 6) {
				break;
			}
			startYM.insert(0, '0');
		}
		return startYM.substring(0);
	}

	/**
	 * 抽出処理において、更新可能であるかを判定します。
	 * @return 更新可能な場合はtrue、更新可能ではない場合はfalse
	 */
	private boolean canUpdate() {
		// 処理区分が「更新」以外は対象にしない
		if (!m_med.getTRANSACTION_TYP().equals("2")) {
			return false;
		}
		// 退避更新日が存在しない場合は更新する
		if (isNull(m_med.getSAVE_UPDATED_DATE())) {
			return true;
		}
		try {
			DateFormat format = DateFormat.getInstance();
			java.util.Date saveDate = format.parse(m_med.getSAVE_UPDATED_DATE());
			java.util.Date updateDate = format.parse(m_med.getUPDATED_DATE());
			// 「退避更新日」<「更新日」の場合は更新する。
			if (saveDate.before(updateDate)) {
				return true;
			} else {
				// 1:差分更新の場合は対象にしない
				if (getUpdateMode().equals("1")) {
					return false;
				}
			}
			return true;
		} catch (ParseException e) {
			// 解析エラーの場合はUPDATEしてもOracleエラーになるので対象にしない。
			e.printStackTrace();
			return false;
		}
	}

	/**
	 * 現在のエラー情報をm_medより取得し、[一括登録エラー]にINSERTします。
	 * @param messageCode エラーのメッセージコード
	 * @param count IF入力件数（読込件数）
	 */
	private void insertCsError(String messageCode, int count)
		throws FoundationException, BatchAppException {

		String tmpCostTyp = m_med.getCOST_TYP();

		m_med.setCOST_TYP(getCostType());

		m_med.getSEQ_CS_ERROR_CD().read();
		m_med.getSEQ_CS_ERROR_CD().next();
		// SEQ_CS_ERROR_CDの取得でm_med.CS_ERROR_CDに値が格納されるためデータをセットしていません

		m_med.setMESSAGE_CD(messageCode);
		m_med.setREAD_COUNT(String.valueOf(count));
		m_med.setREMARKS(getRemarks());
		m_med.getT_CS_ERROR().create();

		m_med.setCOST_TYP(tmpCostTyp);
	}

	/**
	 * 備考用文字列を返します
	 * @return 備考用文字列
	 * @throws BatchAppException
	 */
	private String getRemarks() throws BatchAppException {

		return "YEAR=" + getYear() + " HALF_TERM_TYP=" + getHalfTermTyp();

	}

	/**
	 * [品目]に存在するかを判定します 。
	 * @return [品目]に存在する場合はtrue、存在しない場合はfalse
	 */
	private boolean isExistsMItem() throws BatchAppException {
		m_med.getM_ITEM().read();
		return m_med.getM_ITEM().hasRecord(false);
	}

	/**
	 * [購入品マスタ]に存在するかを判定します 。
	 * @return [購入品マスタ]に存在する場合はtrue、存在しない場合はfalse
	 * @throws BatchAppException
	 */
	private boolean isExistsMCsPuch() throws BatchAppException {
		m_med.getM_CS_PUCH().read();
		return m_med.getM_CS_PUCH().next();
	}

	/**
	 * マスタ優先で、かつマスタによって更新されているかを判定します。
	 * 購入品マスタ優先区分=1:マスタ、更新区分=2:マスタで更新の場合はtrueを返します。
	 * 上記以外はfalseを返します。
	 * @return マスタ更新可能な場合はtrue、変更不可の場合はfalse
	 */
	private boolean isUpdatedByMaster() throws BatchAppException {
		return getPriorityType().equals("1") && m_med.getUPDATE_TYP().equals("2");
	}

	/**
	 * 処理区分が削除かどうかを判定します。
	 * @return 削除の場合はtrue、新規・更新の場合はfalse
	 */
	private boolean isDeleteTransaction() {
		return m_med.getTRANSACTION_TYP().equals("3");
	}

	/**
	 * ワークファイルを生成して返します。
	 */
	private CsPuchIfWork createWork() throws BatchAppException {
		return new CsPuchIfWork(m_med.getITEM_CD());
	}

	/**
	 * 購入品インタフェースの情報を格納するオブジェクトです。
	 */
	private class CsPuchIfWork {
		private final String itemCd;
		private boolean exists;
		private boolean error;
		private boolean delete;

		CsPuchIfWork(String item) throws BatchAppException {
			itemCd = item;
			if (item == null) {
				throw new NullPointerException();
			}
			exists = isExistsMCsPuch();
		}
		/**
		 * 現在読み込んでいるレコードと同じであるかを判定します。
		 * @return 現在読み込んでいるレコードと同様の場合はtrue、違う場合はfalse
		 */
		boolean equalsCurrentRecord() {
			return itemCd.equals(m_med.getITEM_CD());
		}

		void setError() {
			error = true;
		}

		/**
		 * マスタ削除をする処理区分に設定します。
		 */
		void setDeleteTransaction(boolean b) {
			delete = b;
		}

		/**
		 * 購入品マスタに存在するかを判定します。
		 * @return マスタに存在する場合はtrue、違う場合はfalse
		 */
		boolean isExistsMaster() {
			return exists;
		}

		/**
		 * マスタ削除をする処理区分であるかを判定します。
		 * @return 削除の場合はtrue、違う場合はfalse
		 */
		boolean isDeleteTransaction() {
			return delete;
		}

		/**
		 * エラーがあるかを判定します。
		 * @return エラーの場合はtrue、違う場合はfalse
		 */
		boolean hasError() {
			return error;
		}
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

		return m_control.beginProc();
	}

	/**
	 * 終了処理
	 *
	 * @exception <<コメントを記述してください>>
	 */
	public int endProc() throws BatchAppException {

		return m_control.endProc();
	}

	/**
	 * 終了処理
	 *
	 * @exception <<コメントを記述してください>>
	 */
	public int execute() throws BatchAppException {

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
		public medDB0020B001 m_med=null;

		/**
		 * コンテナクラスインスタンス
		 */
		public ManageContainer m_container=null;

		//////////////////////////////

		public interControl(medDB0020B001 med) throws BatchAppException
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
