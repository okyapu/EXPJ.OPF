/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AD0110/src/com/nec/jp/orteus/metamorBase/AD0110/AD0110B001/CtrlMain.java,v $
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

package com.nec.jp.orteus.metamorBase.AD0110.AD0110B001;

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
import java.math.BigDecimal;
import com.nec.jp.orteus.xaf.wa.BusinessProcessException;
import com.nec.jp.orteus.expj.businesslock.BusinessLock;
import com.nec.jp.orteus.expj.util.Converter;
import com.nec.jp.orteus.expj.util.ExpjException;
import com.nec.jp.orteus.expj.util.ExpjMessage;
import com.nec.jp.orteus.expj.util.Calculate;
import com.nec.jp.orteus.expj.util.SystemInformation;
import com.nec.jp.orteus.expj.lot.BizCommon;
import com.nec.jp.orteus.expj.pr.rcvissue.process.RcvCancel;
import com.nec.jp.orteus.expj.pr.rcvissue.process.ValidateWh;
import com.nec.jp.orteus.expj.pr.rcvissue.process.WhAutoIssueProc;
import com.nec.jp.orteus.expj.pr.rcvissue.process.AutoIssue;
import com.nec.jp.orteus.metamorBase.AD0110.AD0110010Entity;
import com.nec.jp.orteus.metamorBase.AD0110.AD0110010Struct;
import com.nec.jp.orteus.metamorBase.common.CollectNumber.CollectNumber;
import com.nec.jp.orteus.metamorBase.common.CollectNumber.Numbering;
import com.nec.jp.orteus.metamorBase.common04.sysdata.DateCtrlControl;
import com.nec.jp.orteus.metamorBase.common04.sysdata.DateCtrlStruct;
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessage;
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessageAccessor;
//}}user_implement_dev:import

/**
 * CLASS     : CtrlMain クラス
 * ファイル・クラス説明
 * @author $Author: geng-jia $
 * @version $Revision: 1.3 $ $Date: 2015/12/22 10:04:34 $
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
	public medAD0110B001 m_med=null;

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
	public CtrlMain(medAD0110B001 med, BatchAppConductor cdr) throws BatchAppException
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
	public CtrlMain(medAD0110B001 med) throws BatchAppException
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
	protected void finalize()
	{
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
	private static final int WARNING = 1;
	/** ログレベル エラー */
	private static final int ERROR = 2;

	/** 多言語項目取得対応 */
	private String _locale = null;
	ResourceBundle _resource = null;

	/** DBコネクション */
	private IDbConnection conn = null;

	/** 業務メッセージログ用Numberingクラス */
	private Numbering numbering = null;
	/** 業務メッセージログ用BusinessMessageAccessorクラス */
	private BusinessMessageAccessor businessMsgAcc = new BusinessMessageAccessor();
	/** 業務メッセージログ用BusinessMessageクラス */
	private BusinessMessage businessMsg = new BusinessMessage();

	/** 品目情報格納用 */
	AD0110010Struct itemStruct = new AD0110010Struct();
	/** 作業実績更新対象Struct*/
	private AD0110010Struct rsltStruct = new AD0110010Struct();
	/** 品目別仕掛更新対象Struct*/
	private AD0110010Struct procByItemStruct = new AD0110010Struct();
	/**AD0110 entity*/
	protected AD0110010Entity entity;

	/** 業務ロッククラス */
	private BusinessLock lock = null;

	/** ロック失敗時ロックキー */
	private static final int LOCK_FAILD = -1;

	/** 業務運用日*/
	private String _btmBusinessOprDate;
	/** 在庫ロット番号*/
	private String strLotNo = null;
	/** 出来高実績番号*/
	private String strOutputRsldCd = null;
	/** 会社コード*/
	private String _company_cd = null;

	/** 日付処理用 */
	DateFormat _df = DateFormat.getDateInstance();

	/**全部レコード数**/
	private int _intTotalCount = 0;
	/**エラーレコード件数**/
	private int _intErrorCount = 0;
	/**ワーニング件数**/
	private int _intWarningCount = 0;
	/**正常レコード件数**/
	private int _intSuccessCount = 0;
	/**エラーコード*/
	String errCode = null;
	private boolean warningFlg = false;

	/** ドライブレター変換元文字 **/
	private String _strDriveLetterChangeCharBefore;
	/** ドライブレター変換先文字 **/
	private String _strDriveLetterChangeCharAfter;
	/** DBサーバ名 */
	private String _strDbServerName;
	/** DB取込フォルダパス */
	private String _strCsvDbBackupPath;

	/**
	 * ログファイル出力
	 * 
	 * @param logLevel
	 *            ログレベル
	 * @param code
	 *            メッセージコード
	 * @param value
	 *            置換文字列
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
		case INFOMATION:
			m_med.getSyslog().info(emsg, m_med.getUsername());
			break;
		case WARNING:
			m_med.getSyslog().warning(emsg, m_med.getUsername());
			break;
		case ERROR:
			m_med.getSyslog().severe(emsg, m_med.getUsername());
			break;
		}
	}

	/**
	 * ログファイル出力
	 * 
	 * @param logLevel
	 *            ログレベル
	 * @param code
	 *            メッセージコード
	 */
	private void writeLogFiles(int logLevel, String code) {
		writeLogFiles(logLevel, code, null);
	}

	/**
	 * ログDB出力
	 * 
	 * @param code
	 *            メッセージコード
	 * @param value
	 *            置換文字列
	 * @param dataStr
	 *            データストリング
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
	 * ログファイル、ログDB出力を行います。
	 * 
	 * @param logLevel
	 *            ログレベル
	 * @param code
	 *            メッセージコード
	 * @param value
	 *            置換文字列
	 * @param dataStr
	 *            データストリング
	 * @throws FoundationException
	 * @throws SQLException
	 */
	private void writeLog(int logLevel, String code, String value,
			String dataStr) throws FoundationException, SQLException {
		writeLogFiles(logLevel, code, value);
		if (!isNull(dataStr)) {
			writeLogFiles(logLevel, "ZZ01006", dataStr);
		}
		writeLogDB(code, value, dataStr);
	}

	/**
	 * ログファイル、ログDB出力を行います。
	 * 
	 * @param logLevel
	 *            ログレベル
	 * @param code
	 *            メッセージコード
	 * @param dataStr
	 *            データストリング
	 * @throws FoundationException
	 * @throws SQLException
	 */
	private void writeLog(int logLevel, String code, String dataStr)
			throws FoundationException, SQLException {
		writeLogFiles(logLevel, code, null);
		if (!isNull(dataStr)) {
			writeLogFiles(logLevel, "ZZ01006", dataStr);
		}
		writeLogDB(code, null, dataStr);
	}

	/**
	 * ログファイル、ログDB出力を行います。
	 * 
	 * @param logLevel
	 *            ログレベル
	 * @param code
	 *            メッセージコード
	 * @throws FoundationException
	 * @throws SQLException
	 */
	private void writeLog(int logLevel, String code)
			throws FoundationException, SQLException {
		writeLog(logLevel, code, null, null);
	}

	/**
	 * 業務ロックを行います
	 * 
	 * @return ロックキャンセルキー
	 * @throws FoundationException
	 */
	private int businessLock() throws FoundationException {
		lock = new BusinessLock(conn, getSysUserCd(), getSysPlantCd());
		// 解除キーの取得
		int lockCancelKey = lock.doLock(m_med.getProgname());
		conn.commit();
		return lockCancelKey;
	}

	/**
	 * 業務ロックを解除します
	 * 
	 * @param lockCancelKey
	 *            ロックキャンセルキー
	 * @return ロック解除成功時true、失敗時false
	 * @throws FoundationException
	 */
	private boolean businessUnLock(int lockCancelKey)
			throws FoundationException {

		if (lockCancelKey == LOCK_FAILD) {
			return true;
		}
		boolean result = lock.doUnLock(m_med.getProgname(), lockCancelKey);
		conn.commit();
		return result;
	}

	/**
	 * 対象の文字列がNull（空文字あるいはNull）であるかを判定します。
	 * 
	 * @param str
	 *            対象文字列
	 * @return Nullの場合はtrue、Nullではない場合はfalse
	 */
	private boolean isNull(String str) {
		if (str == null || str.length() == 0 || str.equalsIgnoreCase("null")) {
			return true;
		}
		return false;
	}

	/**
	 * バッチパラメータ(共通1) バッチ処理区分を返します。
	 * 
	 * @return バッチ処理区分
	 */
	private String getSysBatchType() {
		return m_med.getArgs()[0];
	}

	/**
	 * バッチパラメータ(共通2)ユーザIDを返します。
	 * 
	 * @return ユーザID
	 */
	private String getSysUserCd() {
		return m_med.getArgs()[1];
	}

	/**
	 * バッチパラメータ(共通3)業務名を返します。
	 * 
	 * @return 業務名
	 */
	private String getSysProgramId() {
		return m_med.getArgs()[2];
	}

	/**
	 * バッチパラメータ(共通4)工場コードを返します。
	 * 
	 * @return 工場コード
	 */
	private String getSysPlantCd() {
		return m_med.getArgs()[3];
	}

	/**
	 * バッチパラメータ(5)CSV取込方式を返します。<br>
	 * 
	 * @return CSV取込方式
	 */
	private String getCsvTakeTyp() {
		if (isNull(m_med.getArgs()[4])) {
			return null;
		}
		return m_med.getArgs()[4];
	}

	/**
	 * バッチパラメータ(6)取込パスを返します。<br>
	 * 
	 * @return 取込パス
	 */
	private String getCsvTakePath() {
		if (isNull(m_med.getArgs()[5])) {
			return null;
		}
		return m_med.getArgs()[5];
	}

	/**
	 * バッチパラメータ(7)バックアップフォルダパスを返します。<br>
	 * 
	 * @return バックアップフォルダパス
	 */
	private String getCsvBackupPath() {
		if (isNull(m_med.getArgs()[6])) {
			return null;
		}
		return m_med.getArgs()[6];
	}

	/**
	 * バッチパラメータのチェックを行います。
	 * 
	 * @return 正常の場合true、不正の場合false
	 * @throws BatchAppException
	 */
	private boolean checkArgs() throws BatchAppException {
		// バッチパラメータの形式が不正な場合
		if (m_med.getArgs().length < 5 || m_med.getArgs().length > 7) {
			writeLogFiles(ERROR, "ZZ09022");
			return false;
		}

		// バッチ処理区分がNullの場合
		if (isNull(getSysBatchType())) {
			writeLogFiles(ERROR, "ZZ09023");
			return false;
		}

		// バッチ処理区分が１、２以外の場合
		if ((!"1".equals(getSysBatchType()) && !"2".equals(getSysBatchType()))) {
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

		// 業務名がNullの場合
		if (isNull(getSysProgramId())) {
			writeLogFiles(ERROR, "ZZ09029");
			return false;
		}

		// CSV取込方式が1：固定ファイル取込、2：指定ファイル取込 以外の場合
		if (!"1".equals(getCsvTakeTyp()) && !"2".equals(getCsvTakeTyp())) {
			writeLogFiles(ERROR, "AD60038");
			return false;
		}

		// CSV取込方式が2：指定ファイル取込 かつ
		if ("2".equals(getCsvTakeTyp())) {
			// 取込パスがNULLの場合
			if (isNull(getCsvTakePath())) {
				writeLogFiles(ERROR, "AD60039");
				return false;
			}

			// バックアップフォルダパスがNULLの場合
			if (isNull(getCsvBackupPath())) {
				writeLogFiles(ERROR, "AD60040");
				return false;
			}
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
	 * [パラメータ]から「DBサーバ名」と「DB取込フォルダパス」を取得し、ディレクトリチェックを行う。
	 * 
	 * @param  なし
	 * @return strMessageId     エラー時のメッセージ番号
	 *         strDetailMessage エラー時の詳細メッセージ
	 */
	private String[] dbServerPathGetCheck()
		throws BatchAppException {
		
		// 戻り値用の変数宣言
		String[] strResultMessage = new String[2];
		
		// [区分コード]より「ドライブレター変換文字」を取得する。
		m_med.setSYS_CLASS("PRODUCTION");
		m_med.setCLASS_CODE("DRIVE_LETTER_CHANGE_CHAR");
		
		// [区分コード]の検索実行
		m_med.getSYS_CLASS_CODE().read();
		if (!m_med.getSYS_CLASS_CODE().next()) {
			// [区分コード]が存在しない場合、メッセージ番号を設定しエラー終了。
			strResultMessage[0] = "AD60041";
			strResultMessage[1] = null;
			return strResultMessage;
		} else if (isNull(m_med.getCODE())) {
			// [区分コード]が存在するがコードがNULLの場合、メッセージ番号を設定しエラー終了。
			strResultMessage[0] = "AD60041";
			strResultMessage[1] = null;
			return strResultMessage;
		} else {
			_strDriveLetterChangeCharBefore = m_med.getCODE();
			_strDriveLetterChangeCharAfter = m_med.getCODE2();
		}
		// [区分コード]より「DBサーバ名」を取得する。
		m_med.setSYS_CLASS("PRODUCTION");
		m_med.setCLASS_CODE("DB_SERVER_NAME");
		
		// [区分コード]の検索実行
		m_med.getSYS_CLASS_CODE().read();
		if (!m_med.getSYS_CLASS_CODE().next()) {
			// [区分コード]が存在しない場合、メッセージ番号を設定しエラー終了。
			strResultMessage[0] = "AD60042";
			strResultMessage[1] = null;
			return strResultMessage;
		} else if (isNull(m_med.getCODE_NAME())) {
			// [区分コード]が存在するがコードがNULLの場合、メッセージ番号を設定しエラー終了。
			strResultMessage[0] = "AD60042";
			strResultMessage[1] = null;
			return strResultMessage;
		} else {
			_strDbServerName = m_med.getCODE_NAME();
		}
				
		// 引数の「CSV取込方式」が2：指定ファイル取込の場合かつ、
		// DBサーバにバックアップフォルダ（“\\” + 「DBサーバ名」 + “\” + 引数の「バックアップフォルダパス」）が存在しない場合
		if ("2".equals(getCsvTakeTyp())) {
			_strCsvDbBackupPath = "\\\\" + _strDbServerName + "\\" + getCsvBackupPath().replaceAll(_strDriveLetterChangeCharBefore, _strDriveLetterChangeCharAfter);
			File csvDbBackupFile = new File(_strCsvDbBackupPath);
			if (!csvDbBackupFile.isDirectory()) {
				strResultMessage[0] = "AD60043";
				String[] strArray = _strCsvDbBackupPath.split("\\\\");
				strResultMessage[1] = "バックアップフォルダパス：" + strArray[2] + "/" +strArray[3];
				return strResultMessage;
			}
		}
		
		return strResultMessage;
	}

	/**
	 * 出来高実績取込データ取得
	 * @return	outputRsltList     出来高実績取込リスト
	 * @throws BatchAppException 
	 * @throws SQLException 
	 * @throws FoundationException 
	 */
	private List selectTOutputRsltTemp() throws BatchAppException, SQLException {
		List rtnList = new ArrayList();
		AD0110010Struct structdata = null;
		m_med.getT_OUTPUT_RSLT_TEMP().read();
		while(m_med.getT_OUTPUT_RSLT_TEMP().next()) {
			structdata = new AD0110010Struct();
			structdata.setPLANT_CD(m_med.getPLANT_CD());
			structdata.setITEM_CD(m_med.getITEM_CD());
			structdata.setWS_CD(m_med.getWS_CD());
			structdata.setOPR_DATE(m_med.getOPR_DATE());
			structdata.setWH_CD(m_med.getWH_CD());
			if (isNull(structdata.getWH_CD())) {
				structdata.setWH_CD(ValidateWh.getDefaultOprWh(conn, structdata.getPLANT_CD(),structdata.getITEM_CD()));
			}
			structdata.setACPT_QTY(m_med.getACPT_QTY());
			structdata.setDEFECT_QTY(m_med.getDEFECT_QTY());
			structdata.setDEFECT_CAUSE_CD(m_med.getDEFECT_CAUSE_CD());
			structdata.setDEFECT_COMMENT(m_med.getDEFECT_COMMENT());
			structdata.setOUTPUT_RSLT_PERSON(m_med.getOUTPUT_RSLT_PERSON());
			structdata.setOPR_TIME_UNIT_TYP(m_med.getOPR_TIME_UNIT_TYP());
			structdata.setOPR_TIME(m_med.getOPR_TIME());
			structdata.setVEND_LOT_NO(m_med.getVEND_LOT_NO());
			structdata.setLOT_NO(m_med.getLOT_NO());
			structdata.setPRE_ARRANGEMENT_TIME(m_med.getPRE_ARRANGEMENT_TIME());
			structdata.setPOST_ARRANGEMENT_TIME(m_med.getPOST_ARRANGEMENT_TIME());
			structdata.setCESSATION_TIME(m_med.getCESSATION_TIME());
			structdata.setCESSATION_CAUSE(m_med.getCESSATION_CAUSE());
			structdata.setOUTPUT_RSLT_COMMENT(m_med.getOUTPUT_RSLT_COMMENT());

			rtnList.add(structdata);
		}
		return rtnList;
	}

	/**
	 * 作業日と対象年月の比較
	 * 実際原価の締めが完了している日付での実績の登録を不可とする
	 * @param  oprDate 作業日
	 * @return 正常:true 作業日の年月が対象年月より過去の場合:false
	 * @throws BatchAppException 
	 */
	private boolean chkProcExecDate(String oprDate) throws BusinessProcessException, FoundationException, BatchAppException {
		// 対象年月
		String procExecDate = null;

		m_med.getSYS_PARAMETER().read();
		if (m_med.getSYS_PARAMETER().next()) {
			// 「システムパラメータ」．設定値=“false”の場合
			if ("false".equals(m_med.getPAST_RESULT_ENTRY_TYP())) {
				// [実際原価管理パラメータ].“対象年月”取得
				m_med.setPLANT_CD(getSysPlantCd());
				m_med.getSYS_ACTUAL_COST_CTRL_AC().read();
				if (m_med.getSYS_ACTUAL_COST_CTRL_AC().next()) {
					procExecDate = m_med.getPROC_EXEC_DATE();
				}
				if (!isNull(procExecDate)) {
					// 「作業日」の年月 （YYYY/MM）が[実際原価管理パラメータ].“対象年月”より過去の場合
					if (oprDate.compareTo(procExecDate) < 0) {
						return false;
					}
				}
			}
		}
		return true;
	}

	/**
	 * 出来高実績取込データのマスタ整合性チェック
	 * @param dateList
	 * @return
	 * @throws BusinessProcessException
	 * @throws FoundationException
	 */
	private boolean check_listTOutputRsltTemp(List dataList) throws Exception {
		// 全部レコード数
		_intTotalCount = dataList.size();
		AD0110010Struct dataStruct = new AD0110010Struct();
		AD0110010Struct tempStruct = new AD0110010Struct();;
		// エラー行番号
		String errorNumber = "";
		// 業務メッセージ用エラー行番号
		String err_commt ="";
		// 判定フラグ
		boolean result = true;
		// 作業日
		String oprDateTemp = null;
		try {
			for (int i = 0; i < dataList.size(); i++) {
				dataStruct = (AD0110010Struct)dataList.get(i);
				// 行番号を設定
				errorNumber = String.valueOf(i + 1);
				// 作業日を設定
				oprDateTemp = Converter.dateToStr(_df.parse(dataStruct.getOPR_DATE()), "yyyy/MM/dd");
				warningFlg = false;

				// 実際原価の締めが完了している日付場合
				if (!chkProcExecDate(oprDateTemp)) {
					errCode = "AE00160";
					//業務メッセージ用エラーメッセージの格納
					err_commt = "(SBM0381)CSV行番号 = [" + errorNumber + "]";
					writeLog(ERROR, errCode, err_commt);
					_intErrorCount++;
					continue;
				}

				// 「品目番号」 に入力された値が [品目] に存在しない場合
				List itemCdList = entity.mselectItem_CD.read(conn, dataStruct);
				if (itemCdList.isEmpty()) {
					errCode = "AD00019";
					//業務メッセージ用エラーメッセージの格納
					err_commt = "(SBM0381)CSV行番号 = [" + errorNumber + "]";
					writeLog(ERROR, errCode, err_commt);
					_intErrorCount++;
					continue;
				} else {
					// 取得したデータを格納
					itemStruct = (AD0110010Struct)itemCdList.get(0);
					dataStruct.setLOT_CTRL_FLG(itemStruct.getLOT_CTRL_FLG());
				}

				// [品目別仕掛].“品目番号” ＝ 「品目番号」 かつ、
				// [品目別仕掛].“作業実績区分” ＝ 1：出来高実績 かつ、
				// [品目別仕掛].“品目別作業状態区分” ≧ 2：指示済み かつ
				// [品目別仕掛].“工場コード” ＝ 「工場コード」かつ
				// データ1件も存在しない場合
				result = entity.mcheckT_WORK_IN_PROC_BY_ITEM.check(conn, dataStruct);
				if (!result) {
					errCode = "ZZ06001";
					//業務メッセージ用エラーメッセージの格納
					err_commt = "(SBM0381)CSV行番号 = [" + errorNumber + "]";
					writeLog(ERROR, errCode, err_commt);
					_intErrorCount++;
					continue;
				}

				// 「作業区コード」に入力された値が [作業区] に存在しない場合
				List wsCdList = entity.mselectM_WS.read(conn, dataStruct);
				if (wsCdList.isEmpty()) {
					errCode = "AD20029";
					//業務メッセージ用エラーメッセージの格納
					err_commt = "(SBM0381)CSV行番号 = [" + errorNumber + "]";
					writeLog(ERROR, errCode, err_commt);
					_intErrorCount++;
					continue;
				} else {
					// 「作業区コード」に対する工場コードと「工場コード」が一致しない場合
					tempStruct = (AD0110010Struct)wsCdList.get(0);
					if (!dataStruct.getPLANT_CD().equals(tempStruct.getvc2PLANT_CD())) {
						errCode = "AD00004";
						//業務メッセージ用エラーメッセージの格納
						err_commt = "(SBM0381)CSV行番号 = [" + errorNumber + "]";
						writeLog(ERROR, errCode, err_commt);
						_intErrorCount++;
						continue;
					}
				}

				if (!isNull(dataStruct.getWH_CD())) {
					// 「保管区コード」 に入力された値が [保管区] に存在しない場合
					List whCdList = entity.mselectM_WH.read(conn, dataStruct);
					if (whCdList.isEmpty()) {
						errCode = "AD00020";
						//業務メッセージ用エラーメッセージの格納
						err_commt = "(SBM0381)CSV行番号 = [" + errorNumber + "]";
						writeLog(ERROR, errCode, err_commt);
						_intErrorCount++;
						continue;
					} else {
						// 「保管区コード」の工場コードと「工場コード」が一致しない場合
						tempStruct = (AD0110010Struct)whCdList.get(0);
						if (!dataStruct.getPLANT_CD().equals(tempStruct.getvc2PLANT_CD())) {
							errCode = "AA01007";
							//業務メッセージ用エラーメッセージの格納
							err_commt = "(SBM0381)CSV行番号 = [" + errorNumber + "]";
							writeLog(ERROR, errCode, err_commt);
							_intErrorCount++;
							continue;
						}
					}
				}

				// 業務運用日取得
				DateCtrlStruct dateCtrl = DateCtrlControl.getData(conn,  getSysPlantCd());
				_btmBusinessOprDate = dateCtrl.getBUSINESS_OPR_DATE();

				// 「作業日」に 未来日(業務運用日より未来) を入力された場合
				if (oprDateTemp.compareTo(_btmBusinessOprDate) > 0) {
					errCode = "AD30773";
					//業務メッセージ用エラーメッセージの格納
					err_commt = "(SBM0381)CSV行番号 = [" + errorNumber + "]";
					writeLog(ERROR, errCode, err_commt);
					_intErrorCount++;
					continue;
				}

				// 「良品数」 > 0、かつ、
				// [品目].”ロット管理フラグ”＝1：ロット管理を行う、かつ、
				// [品目].”ロット番号採番区分”＝0：手入力、かつ、
				// 「在庫ロット番号」が未入力の場合
				if (Calculate.compare(dataStruct.getACPT_QTY(), "0") > 0) {
					// [品目].”ロット管理フラグ”＝1：ロット管理を行う
					if ("1".equals(itemStruct.getLOT_CTRL_FLG()) && "0".equals(itemStruct.getLOT_NUMBERING_TYP())) {
						// 「在庫ロット番号」が未入力
						if (isNull(dataStruct.getLOT_NO())) {
							errCode = "AE20600";
							//業務メッセージ用エラーメッセージの格納
							err_commt = "(SBM0381)CSV行番号 = [" + errorNumber + "]";
							writeLog(ERROR, errCode, err_commt);
							_intErrorCount++;
							continue;
						}
					}
				}

				// [品目].”ロット管理フラグ”＝1：ロット管理を行う
				if ("1".equals(itemStruct.getLOT_CTRL_FLG())) {
					if ("0".equals(itemStruct.getLOT_NUMBERING_TYP())) {
						// [品目].”ロット番号採番区分”＝0：手入力、かつ、「在庫ロット番号」が[ロット管理]に存在しない場合
						if (!isNull(dataStruct.getLOT_NO())) {
							List lotCtrlList = entity.mselectT_LOT_CTRL.read(conn, dataStruct);
							if (lotCtrlList.isEmpty()) {
								errCode = "AE21203";
								//業務メッセージ用エラーメッセージの格納
								err_commt = "(SBM0381)CSV行番号 = [" + errorNumber + "]";
								writeLog(ERROR, errCode, err_commt);
								_intErrorCount++;
								continue;
							}
						}
					}
				} else {
					// [品目].”ロット管理フラグ”≠1：ロット管理を行う　かつ、「在庫ロット番号」が入力されている場合
					if (!isNull(dataStruct.getLOT_NO())) {
						errCode = "AE20601";
						//業務メッセージ用エラーメッセージの格納
						err_commt = "(SBM0381)CSV行番号 = [" + errorNumber + "]";
						writeLog(ERROR, errCode, err_commt);
						_intErrorCount++;
						continue;
					}
				}

				// 「良品数」 ＝ 0、かつ、「在庫ロット番号」が入力されている場合
				if (Calculate.compare(dataStruct.getACPT_QTY(), "0") == 0) {
					if (!isNull(dataStruct.getLOT_NO())) {
						errCode = "AD20139";
						//業務メッセージ用エラーメッセージの格納
						err_commt = "(SBM0381)CSV行番号 = [" + errorNumber + "]";
						writeLog(ERROR, errCode, err_commt);
						_intErrorCount++;
						continue;
					}
				}

				// 「不良理由コード」かNull かつ、「不良数」 > 0 の場合
				if (isNull(dataStruct.getDEFECT_CAUSE_CD())) {
					if (Calculate.compare(dataStruct.getDEFECT_QTY(), "0") > 0) {
						errCode = "AE05039";
						//業務メッセージ用エラーメッセージの格納
						err_commt = "(SBM0381)CSV行番号 = [" + errorNumber + "]";
						writeLog(ERROR, errCode, err_commt);
						_intErrorCount++;
						continue;
					}
				} else {
					// 「不良理由コード」≠Null かつ、「不良数」 = 0
					if (Calculate.compare(dataStruct.getDEFECT_QTY(), "0") == 0) {
						// 整数管理品目の場合
						if ("1".equals(itemStruct.getUNIT_QTY_TYP())) {
							errCode = "AE05033";
							//業務メッセージ用エラーメッセージの格納
							err_commt = "(SBM0381)CSV行番号 = [" + errorNumber + "]";
							writeLog(ERROR, errCode, err_commt);
							_intErrorCount++;
							continue;
						} else if ("2".equals(itemStruct.getUNIT_QTY_TYP())) {
							// 小数管理品目の場合
							errCode = "AE05032";
							//業務メッセージ用エラーメッセージの格納
							err_commt = "(SBM0381)CSV行番号 = [" + errorNumber + "]";
							writeLog(ERROR, errCode, err_commt);
							_intErrorCount++;
							continue;
						}
					}
				}

				// 「作業担当者コード」が入力された場合
				if (!isNull(dataStruct.getOUTPUT_RSLT_PERSON())) {
					tempStruct = new AD0110010Struct();
					tempStruct.setUSER_CD(dataStruct.getOUTPUT_RSLT_PERSON());
					List userCdList = entity.mselectUSER_MST.read(conn, tempStruct);

					// 「作業担当者コード」が[ユーザーマスタ] に存在しない場合
					if (userCdList.isEmpty()) {
						errCode = "AD34032";
						//業務メッセージ用エラーメッセージの格納
						err_commt = "(SBM0381)CSV行番号 = [" + errorNumber + "]";
						writeLog(ERROR, errCode, err_commt);
						_intErrorCount++;
						continue;
					} else {
						tempStruct = (AD0110010Struct)userCdList.get(0);
						// 「作業担当者コード」の工場コード ≠ 「工場コード」の場合
						if (!dataStruct.getPLANT_CD().equals(tempStruct.getvc2PLANT_CD())) {
							errCode = "AD34029";
							//業務メッセージ用エラーメッセージの格納
							err_commt = "(SBM0381)CSV行番号 = [" + errorNumber + "]";
							writeLog(ERROR, errCode, err_commt);
							_intErrorCount++;
							continue;
						}
					}
				}

				// 最遅納期のオーダが取得できなかった場合
				List lastList = entity.mSelectTargetProcByItem1.read(conn, dataStruct);
				if (lastList.isEmpty()) {
					List lastDateList = entity.mSelectCompleteProcByItem1.read(conn, dataStruct);
					if (lastDateList.isEmpty()) {
						errCode = "AD34027";
						//業務メッセージ用エラーメッセージの格納
						err_commt = "(SBM0381)CSV行番号 = [" + errorNumber + "]";
						writeLog(ERROR, errCode, err_commt);
						_intErrorCount++;
						continue;
					}
				}

				// 整数管理品目で「良品数」または「不良数」に小数が入力された場合
				if (!isNull(itemStruct.getUNIT_QTY_TYP()) && "1".equals(itemStruct.getUNIT_QTY_TYP())) {
					//良品数に小数が入力された場合
					if (Calculate.isNumeric(dataStruct.getACPT_QTY())) {
						errCode = "AD00087";
						//業務メッセージ用エラーメッセージの格納
						err_commt = "(SBM0381)CSV行番号 = [" + errorNumber + "]";
						writeLog(WARNING, errCode, err_commt);
						if (!warningFlg) {
							_intWarningCount++;
							warningFlg = true;
						}
						// 小数点以下は切り捨てる
						dataStruct.setACPT_QTY(Calculate.floor(dataStruct.getACPT_QTY(), 0));
					}
					// 不良数に小数が入力された場合
					if (Calculate.isNumeric(dataStruct.getDEFECT_QTY())) {
						errCode = "AD00087";
						//業務メッセージ用エラーメッセージの格納
						err_commt = "(SBM0381)CSV行番号 = [" + errorNumber + "]";
						writeLog(WARNING, errCode, err_commt);
						if (!warningFlg) {
							_intWarningCount++;
							warningFlg = true;
						}
						// 小数点以下は切り捨てる
						dataStruct.setDEFECT_QTY(Calculate.floor(dataStruct.getDEFECT_QTY(), 0));
					}
				}
			}

			if (_intErrorCount > 0) {
				return false;
			} else {
				return true;
			}
		} catch (Exception e) {
			conn.rollback();
			throw new ExpjException(e);
		}
	}

	/**
	 * CSVファイル（出来高実績取込）の内容を登録
	 * @param csvList
	 * @return
	 * @throws FoundationException 
	 */
	private void insertCsvDate(List csvList) throws FoundationException, ExpjException {
		try {
			boolean rtnFlg = true;
			conn.beginTransWeb();
			// 全部レコード数
			_intTotalCount = csvList.size();
			//　登録件数
			_intSuccessCount = 0;
			// 出来高実績登録処理を開始しました。
			writeLog(INFOMATION, "AD00244");
			for (int i = 0; i < csvList.size(); i++) {
				AD0110010Struct cvsStruct = (AD0110010Struct)csvList.get(i);
				// 出来高実績登録処理
				rtnFlg = insertToutputRlsd (cvsStruct, i);
				if(!rtnFlg) {
					conn.rollback();
					// 出来高実績登録処理が異常終了しました。
					writeLog(INFOMATION, "AD00246");
					return;
				}
				// 作業実績登録処理 
				rtnFlg = insertTOprRslt (cvsStruct, i);
				if(!rtnFlg) {
					conn.rollback();
					// 出来高実績登録処理が異常終了しました。
					writeLog(INFOMATION, "AD00246");
					return;
				}
			}

			// 登録処理が正常に終了した場合
			_intSuccessCount = csvList.size();
			String succCommt = "(SBM0638)読込件数　=　[" + _intTotalCount + "] "
					+ "登録件数　=　[" + _intSuccessCount + "] "
					+ "エラー件数　=　[0]";
			// 出来高実績登録処理を正常に終了しました。
			writeLog(INFOMATION, "AD00245", succCommt);	

			conn.commit();
		} catch (Exception e) {
			conn.rollback();
			throw new ExpjException(e);
		}
	}

	/**
	 * CSVフェイル内容は、出来高実績登録処理
	 * @param csvList
	 * @return
	 * @throws FoundationException 
	 */
	private boolean insertToutputRlsd (AD0110010Struct adstruct, int j) throws ExpjException {
		try {
			// 在庫ロット番号採番処理を行う。
			// [品目]．”ロット管理フラグ”＝ 1：ロット管理を行う 、かつ、[品目]．”ロット番号採番区分”≠ 0:手入力、かつ、
			if ("1".equals(itemStruct.getLOT_CTRL_FLG()) && !"0".equals(itemStruct.getLOT_NUMBERING_TYP())){
				// 「良品数」 > 0、かつ、｢在庫ロット番号｣ ＝Null
				if (Calculate.compare(adstruct.getACPT_QTY(), "0") > 0 && isNull(adstruct.getLOT_NO())) {
					// 在庫ロット番号の自動採番を行う。
					BizCommon bc = new BizCommon(conn, getSysUserCd(), getSysProgramId(), getSysPlantCd());
					List retList = bc.getsetLotNumberingFd(adstruct.getITEM_CD(), adstruct.getOPR_DATE());

					// 正常終了の場合
					if (bc.getResultStatus().intValue() == 1) {
						// 在庫ロット番号の取得
						if (retList != null && retList.size() > 0) {
							strLotNo = (String) retList.get(0);
						}
						// 警告 or 異常終了の場合
					} else {
						// エラーメッセージの取得
						if (retList != null && retList.size() > 1) {
							errCode = (String) retList.get(1);
							writeLog(ERROR, errCode);
							return false;
						}
					}
				} else {
					strLotNo = adstruct.getLOT_NO();
				}
			} else {
				strLotNo = adstruct.getLOT_NO();
			}

			// 出来高実績番号の自動採番
			Numbering collectNum = 
					new Numbering(conn,
							CollectNumber.OUT_RSLT_CD,
							getSysUserCd(),
							getSysProgramId(),
							adstruct.getPLANT_CD());
			strOutputRsldCd = collectNum.getNo();
			if (isNull(strOutputRsldCd)) {
				// 採番結果がない
				errCode = "ZZ01106";
				writeLog(ERROR, errCode);
				return false;
			}
			// 出来高実績番号を設定する。
			adstruct.setOUTPUT_RSLT_CD(strOutputRsldCd);
			// 在庫ロット番号
			adstruct.setLOT_NO(strLotNo);
			adstruct.setsUser_ID(getSysUserCd());
			// [出来高実績]への追加内容
			entity.minsertT_OUTPUT_RSLT.create(conn, adstruct);
			return true;
		} catch (Exception e) {
			throw new ExpjException(e);
		}
	}

	/**
	 * CSVフェイル内容は、作業実績登録処理
	 * @param csvList
	 * @return
	 * @throws FoundationException 
	 */
	private boolean insertTOprRslt (AD0110010Struct adstruct, int m) throws ExpjException {
		try {
			List targetProcByItemList = entity.mSelectTargetProcByItem.read(conn, adstruct);
			if (targetProcByItemList.isEmpty()) {

				// 品目別仕掛をセットする
				procByItemStruct = new AD0110010Struct();
				procByItemStruct = (AD0110010Struct)entity.mSelectCompleteProcByItem.read(conn,adstruct).get(0);
				procByItemStruct.setsUser_ID(getSysUserCd());

				rsltStruct = new AD0110010Struct();
				rsltStruct.setsUser_ID(getSysUserCd());
				// 作業指示番号
				rsltStruct.setOPR_INST_CD(procByItemStruct.getvc2OPR_INST_CD());

				// 最大分作回数＋１のセット
				List partialPrdNoList = entity.mselectMaxPrdNo.read(conn, rsltStruct);
				AD0110010Struct partialPrdNoStruct = new AD0110010Struct();
				if (!partialPrdNoList.isEmpty()) {
					partialPrdNoStruct = (AD0110010Struct)partialPrdNoList.get(0);
				}
				// 分作回数
				rsltStruct.setPARTIAL_PRD_NO(partialPrdNoStruct.getMAX_PRD_NO());
				// 保管区コード
				rsltStruct.setWH_CD(adstruct.getWH_CD());
				// 出来高実績番号
				rsltStruct.setOUTPUT_RSLT_CD(strOutputRsldCd);
				// 在庫ロット番号
				rsltStruct.setLOT_NO(strLotNo);
				// 品目番号
				rsltStruct.setITEM_CD(adstruct.getITEM_CD());
				// 作業区コード
				rsltStruct.setWS_CD(adstruct.getWS_CD());
				// 良品数
				rsltStruct.setACPT_QTY(adstruct.getACPT_QTY());
				// 不良数
				rsltStruct.setDEFECT_QTY(adstruct.getDEFECT_QTY());
				// 作業日
				rsltStruct.setOPR_DATE(adstruct.getOPR_DATE());
				// 工場コード
				rsltStruct.setPLANT_CD(adstruct.getPLANT_CD());
				// 作業訂正回数
				rsltStruct.setOPR_CRCT_NO("0");

				// [作業実績]の追加を行う
				entity.minsertT_OPR_RSLT.create(conn, rsltStruct);

				AD0110010Struct updateWorkInProcByitemStruct = new AD0110010Struct();
				updateWorkInProcByitemStruct.setsUser_ID(getSysUserCd());
				// 作業計画番号
				updateWorkInProcByitemStruct.setWORK_ODR_CD(procByItemStruct.getvc2WORK_ODR_CD());
				// 作業指示番号
				updateWorkInProcByitemStruct.setOPR_INST_CD(procByItemStruct.getvc2OPR_INST_CD());

				// 同作業指示番号中の最遅作業日の取得（[作業実績]."作業実績作業日"）
				List lastDateList = entity.mselectLastDate.read(conn, updateWorkInProcByitemStruct);
				AD0110010Struct lastDateStruct = new AD0110010Struct();
				if (lastDateList.isEmpty()) {
					errCode = "ZZ01101";
					writeLog(ERROR, errCode);
					return false;
				} else {
					lastDateStruct = (AD0110010Struct)lastDateList.get(0);
				}

				// 品目別仕掛完了日
				updateWorkInProcByitemStruct.setdateOPR_DATE(lastDateStruct.getMAX_OPR_DATE());

				// [品目別仕掛]の更新を行う
				entity.mupdateT_WORK_IN_PROC_BY_ITEM.update(conn, updateWorkInProcByitemStruct);

				//下位部品の自動出庫処理
				String sFLG = "1";	//作業完了
				boolean result = true;
				//下位部品中、出庫型が自動出庫の部品を出庫処理
				result = callCommonIssue(adstruct, sFLG, adstruct.getPLANT_CD(), m);
				if (result == false) {
					return result;
				}
				//上位部品入庫処理
				//入庫処理（保管区別入出庫追加＆入庫処理）
				result = callRcvCancel(adstruct, sFLG, adstruct.getPLANT_CD(), m);
				if (result == false) {
					return result;
				}
			} else {

				// 良品数
				BigDecimal AcptQty = new BigDecimal(adstruct.getACPT_QTY());
				// 実績計上が必要な良品の残数
				BigDecimal TempAcptQty = new BigDecimal(adstruct.getACPT_QTY());
				// 不良数
				BigDecimal DefectQty = new BigDecimal(adstruct.getDEFECT_QTY());
				// 実績計上が必要な不良の残数
				BigDecimal TempDefectQty = new BigDecimal(adstruct.getDEFECT_QTY());
				// 良品数＋不良数
				BigDecimal TotalQty = new BigDecimal("0");
				TotalQty = AcptQty.add(DefectQty);
				// 実績計上対象の品目別仕掛の作業指示数
				BigDecimal TargetOprInstQty = new BigDecimal("0");
				// 実績計上対象の品目別仕掛の作業指示番号を持つ作業実績のSUM(良品数+不良数)
				BigDecimal SumOprRsltQty = new BigDecimal("0");	
				// 実績計上対象の品目別仕掛に実績計上できる残数
				BigDecimal TempOprInstQty = new BigDecimal("0");
				// 実績計上が必要な良品残数＋不良残数
				BigDecimal TempSumOprRsltQty = new BigDecimal("0");

				int i = 0 ;
				int ExitFlg = 0 ;		 //while抜け出しフラグOFF
				int CompleteFlg = 0 ;	 //品目別仕掛完了フラグOFF

				while ( i < targetProcByItemList.size() && ExitFlg == 0 ) {

					//対象品目別仕掛をセット
					procByItemStruct = (AD0110010Struct)targetProcByItemList.get(i);
					procByItemStruct.setsUser_ID(getSysUserCd());

					//対象レコードの作業指示数をセット
					TargetOprInstQty = new BigDecimal(procByItemStruct.getOPR_INST_QTY());

					//対象品目別仕掛の作業指示番号と同一の作業実績のSUM(良品数＋不良数)取得
					List sumOprRsltQtyList = entity.mselectSumOprRsltQty.read(conn, procByItemStruct);
					if (sumOprRsltQtyList.isEmpty()) {
						//作業実績が無いため、SUM(良品数+不良数)はZEROとする
						SumOprRsltQty = new BigDecimal("0");
					} else {
						//品目別仕掛をセットする
						AD0110010Struct tempStruct = (AD0110010Struct)sumOprRsltQtyList.get(0);
						SumOprRsltQty = new BigDecimal(tempStruct.getSUM_OPR_RSLT_QTY());
					}

					// 作業指示数が実績数より大きい場合のみ残指示数計算を行う。
					if (TargetOprInstQty.doubleValue() > SumOprRsltQty.doubleValue()){
						//作業指示数-SUM(良品数+不良数)
						TempOprInstQty = TargetOprInstQty.subtract(SumOprRsltQty );
					};

					// 実績計上が必要な数を算出
					TempSumOprRsltQty = TempAcptQty.add(TempDefectQty);

					if ( TempSumOprRsltQty.doubleValue() > 0 ) {
						if ( TempOprInstQty.doubleValue() <= TempSumOprRsltQty.doubleValue() ) {
							//作業指示残数＜＝実績計上が必要な数の場合：品目別仕掛完了

							if ( i + 1 == targetProcByItemList.size() ) {
								//品目別仕掛最後の1件であれば残数を全て計上する
								rsltStruct.setACPT_QTY(TempAcptQty.toString());	//良品数
								rsltStruct.setDEFECT_QTY(TempDefectQty.toString());//不良数
								TempAcptQty	= new BigDecimal("0");		//良品残数ZERO
								TempDefectQty  = new BigDecimal("0");	//不良残数ZERO
								TempOprInstQty = new BigDecimal("0");	//実績残数ZERO
								CompleteFlg = 1 ;						//品目別仕掛完了フラグON
							} else {
								//それ以外は品目別仕掛に計上できる分だけ計上する
								if ( TempOprInstQty.doubleValue() <= TempAcptQty.doubleValue() ) {

									rsltStruct.setACPT_QTY(
											TempOprInstQty.toString());		//良品数
									rsltStruct.setDEFECT_QTY("0.0");	//不良数
									TempAcptQty = 
											TempAcptQty.subtract(TempOprInstQty);//良品残数
									CompleteFlg = 1 ;	//品目別仕掛完了フラグON
								} else {
									//不良も使う
									if ( TempAcptQty.doubleValue() > 0 ) {
										//良品＋不良数で消し込む
										rsltStruct.setACPT_QTY(TempAcptQty.toString());
										TempOprInstQty = TempOprInstQty.subtract(TempAcptQty);
										rsltStruct.setDEFECT_QTY(TempOprInstQty.toString());
										TempDefectQty =  TempDefectQty.subtract(TempOprInstQty);
										TempAcptQty = new BigDecimal("0");	//良品残数ZERO
										CompleteFlg = 1 ;	//品目別仕掛完了フラグON
									} else {
									//不良数だけで消し込む
										rsltStruct.setACPT_QTY("0.0");
										rsltStruct.setDEFECT_QTY(TempOprInstQty.toString());
										TempDefectQty =  TempDefectQty.subtract(TempOprInstQty);
										TempAcptQty = new BigDecimal("0");	//良品残数ZERO
										CompleteFlg = 1 ;	//品目別仕掛完了フラグON
									}
								}
							}
						} else {
							//品目別仕掛が未完了の場合
							rsltStruct.setACPT_QTY(TempAcptQty.toString());
							rsltStruct.setDEFECT_QTY(TempDefectQty.toString());
							TempAcptQty   = new BigDecimal("0");	//良品残数ZERO
							TempDefectQty = new BigDecimal("0");	//不良残数ZERO
							ExitFlg=1;  //while抜け出しフラグON
						}

						//作業実績の登録処理
						rsltStruct.setsUser_ID(getSysUserCd());
						rsltStruct.setOPR_INST_CD(procByItemStruct.getOPR_INST_CD());//作業指示番号

						//最大分作回数＋１のセット
						List maxPrdNoList = entity.mselectMaxPrdNo.read(conn, rsltStruct);

						//検索結果は必ずある
						AD0110010Struct maxPrdNoStruct = (AD0110010Struct)maxPrdNoList.get(0);

						rsltStruct.setPARTIAL_PRD_NO(maxPrdNoStruct.getMAX_PRD_NO());//分作回数
						rsltStruct.setITEM_CD(adstruct.getITEM_CD());//品目番号
						rsltStruct.setWS_CD(adstruct.getWS_CD());	//作業区コード
						rsltStruct.setOPR_DATE(adstruct.getOPR_DATE());//作業日
						rsltStruct.setWH_CD(adstruct.getWH_CD());	//保管区コード
						rsltStruct.setOUTPUT_RSLT_CD(strOutputRsldCd);//出来高実績番号
						rsltStruct.setPLANT_CD(adstruct.getPLANT_CD());//工場コード
						rsltStruct.setLOT_NO(strLotNo);//在庫ロット番号
						rsltStruct.setVEND_LOT_NO(adstruct.getVEND_LOT_NO());//メーカロット番号
						rsltStruct.setOPR_CRCT_NO("0");				//作業訂正回数

						//作業実績の登録
						entity.minsertT_OPR_RSLT.create(conn, rsltStruct);
						String sFLG = "0";	//初期値セット（作業未完了）
						//作業指示数分の実績が計上されていれば品目別仕掛を更新する
						if ( CompleteFlg == 1 ) {
							AD0110010Struct completeStruct = new AD0110010Struct();
							completeStruct.setsUser_ID(getSysUserCd());
							completeStruct.setWORK_ODR_CD(procByItemStruct.getvc2WORK_ODR_CD());
							completeStruct.setOPR_INST_CD(rsltStruct.getOPR_INST_CD());

							//同作業指示番号中の最遅作業日の取得（[作業実績]."作業実績作業日"）
							List lastdist = entity.mselectLastDate.read(conn, completeStruct);
							if (lastdist.isEmpty()) {
								errCode = "ZZ01101";
								writeLog(ERROR, errCode);
								return false;
							}
							AD0110010Struct tempStruct = (AD0110010Struct)lastdist.get(0);
							completeStruct.setdateOPR_DATE(tempStruct.getMAX_OPR_DATE());

							entity.mupdateT_WORK_IN_PROC_BY_ITEM.update(conn, completeStruct);
							sFLG = "1";	//作業完了
						}

						//下位部品の自動出庫処理
						boolean result = true;
						//下位部品中、出庫型が自動出庫の部品を出庫処理
						result = this.callCommonIssue(adstruct, sFLG, adstruct.getPLANT_CD(), m);
						if(result == false){
							return result;
						}
						//上位部品入庫処理
						//入庫処理（保管区別入出庫追加＆入庫処理）
						result = this.callRcvCancel(adstruct, sFLG, adstruct.getPLANT_CD(), m);
						if(result == false){
							return result;
						}

						CompleteFlg=0 ;	 //品目別仕掛完了フラグ再度OFF
						i = i + 1 ;
					} else {
						//実績計上が必要な数が０以下なので実績計上は行わない
						ExitFlg=1;  //while抜け出しフラグON
					}
				}
			}
			// 出来高実績番号
			adstruct.setOUTPUT_RSLT_CD(strOutputRsldCd);

			//マニュアル出庫 キット出庫処理
			boolean result = this.callManiaruIssue(adstruct, adstruct.getPLANT_CD(),m);
			if(result == false){
				return false;
			}
			//ロット管理フラグ = 1(ロットトレース管理を行う。)の場合
			if("1".equals(itemStruct.getLOT_CTRL_FLG())){
				//在庫ロット番号がNullでない場合
				if(adstruct.getLOT_NO() != null && !"".equals(adstruct.getLOT_NO())){
					//ロット管理テーブル更新
					entity.mT_LOT_CTRL.update(conn,adstruct);
				}
			}
			return true;
		}catch(Exception e) {
			throw new ExpjException(e);
		}
	}

	/**
	 * 自動出庫を呼び出します。
	 * @param sFLG 作業完了フラグ(0:作業未完了 1:作業完了)
	 * @throws SQLException
	 * @throws Exception
	 */
	private boolean callCommonIssue(AD0110010Struct parStruct, String sFLG, String plantCD, int m) 
			throws SQLException, Exception {

		//自動出庫呼び出し
		BigDecimal bdQty = new BigDecimal("0");
		if (rsltStruct.getACPT_QTY() != null) {
			bdQty = new BigDecimal(rsltStruct.getACPT_QTY());
		}
		if (rsltStruct.getDEFECT_QTY() != null) {
			bdQty = bdQty.add(new BigDecimal(rsltStruct.getDEFECT_QTY()));
		}
		if (isNull(rsltStruct.getOPR_CRCT_NO())) {
			rsltStruct.setOPR_CRCT_NO("0");
		}

		/********************
		 * 自動出庫処理開始 *
		 *******************/
		WhAutoIssueProc whAutoIssueProc = new WhAutoIssueProc(conn,
				plantCD,
				getSysUserCd(),
				getSysProgramId());
		WhAutoIssueProc.AutoIssueParam autoIssueParam = whAutoIssueProc.new AutoIssueParam();

		// パラメータのセット
		autoIssueParam.m_WORK_ODR_CD = procByItemStruct.getvc2WORK_ODR_CD();
		autoIssueParam.m_WORK_IN_PROC_CD = "";
		autoIssueParam.m_PARTIAL_PRD_NO = Integer.parseInt(rsltStruct.getPARTIAL_PRD_NO());
		autoIssueParam.m_OPR_RSLT_CRCT_NO = Integer.parseInt(rsltStruct.getOPR_CRCT_NO());
		autoIssueParam.m_PUCH_ODR_CD = "";
		autoIssueParam.m_ACPT_NO = 0;
		autoIssueParam.m_ACPT_RSLT_CRCT_NO = 0;
		autoIssueParam.m_RCV_ISSUE_TYP = 2;
		autoIssueParam.m_RCV_ISSUE_DATE = rsltStruct.getOPR_DATE();
		autoIssueParam.m_RCV_ISSUE_RSLT_NO = bdQty.toString();
		autoIssueParam.m_RCV_ISSUE_CMPLT_FLG = Integer.parseInt(sFLG);
		autoIssueParam.m_PLANT_CD = plantCD;

		AutoIssue autoIssue = new AutoIssue(conn,
				plantCD, getSysUserCd(), getSysProgramId());

		// 自動出庫実行
		boolean result = autoIssue.AutoIssueOpr(autoIssueParam);

		String message1 = "";
		if (result) {
			// 業務アラームがあれば出力する。
			// 業務エラーの出力
			for (int n = 0; n < autoIssue.getWarnList().size(); n++) {
				message1 = message1 + "," + new ExpjMessage(autoIssue.getWarnList().get(n).toString()).getMessage(_locale);
			}
			if (!isNull(message1)) {
				message1 = message1.substring(1);
				errCode = "ZZ01006";
				writeLog(WARNING, errCode, message1);
				if (!warningFlg) {
					_intWarningCount++;
					warningFlg = true;
				}
			}

			return result;
		} else {
			// 業務エラーの出力
			for (int n = 0; n < autoIssue.getErrorList().size(); n++) {
				message1 = message1 + "," + new ExpjMessage(autoIssue.getErrorList().get(n).toString()).getMessage(_locale);
			}
			if (!isNull(message1)) {
				message1 = message1.substring(1);
				errCode = "ZZ01006";
				writeLog(ERROR, errCode, message1);
			}
		}
		return result;
	}

	/**
	 * 入庫処理を呼び出します。
	 * @param sFLG 作業完了フラグ(0:作業未完了 1:作業完了)
	 * @throws Exception
	 */
	private boolean callRcvCancel(AD0110010Struct parStruct, String sFLG, String plantCD, int m)
			throws Exception {

		//入出庫管理番号採番
		Numbering collectNum = 
				new Numbering(conn,
					CollectNumber.ISSUE_CD,
					getSysUserCd(),
					getSysProgramId(),
					plantCD);
		String no = collectNum.getNo();
		if (no == null || no.length() == 0) {
			//採番結果がない
			errCode = "AE00152";
			writeLog(ERROR, errCode);
			return false;
		}
		AD0110010Struct rcvIssueStruct = new AD0110010Struct();
		rcvIssueStruct.setsUser_ID(getSysUserCd());

		rcvIssueStruct.setRCV_ISSUE_CTRL_CD(no);				//入出庫管理番号
		rcvIssueStruct.setRCV_ISSUE_TYP("1");					//入出庫区分
		rcvIssueStruct.setITEM_CD(rsltStruct.getITEM_CD());		//品目番号
		rcvIssueStruct.setPLANT_CD(plantCD);					//工場コード
		rcvIssueStruct.setWH_CD(rsltStruct.getWH_CD());			//保管区コード
		rcvIssueStruct.setJOB_ODR_CD(null);						//製番
		rcvIssueStruct.setJOB_ODR_DETAIL_NO("0");				//製番枝番
		rcvIssueStruct.setPUCH_ODR_CD(null);					//発注番号
		rcvIssueStruct.setACPT_NO("0");							//受入回数
		rcvIssueStruct.setACPT_RSLT_CRCT_NO("0");				//受入実績訂正回数
		rcvIssueStruct.setINSPEC_RSLT_CRCT_NO("0");				//検査実績訂正回数

		rcvIssueStruct.setWORK_ODR_CD(procByItemStruct.getvc2WORK_ODR_CD());//作業計画番号
		rcvIssueStruct.setWORK_IN_PROC_CD(null);							//仕掛作業コード
		rcvIssueStruct.setPARTIAL_PRD_NO(rsltStruct.getPARTIAL_PRD_NO());//分作回数
		rcvIssueStruct.setOPR_RSLT_CRCT_NO(rsltStruct.getOPR_CRCT_NO());//作業実績訂正回数
		rcvIssueStruct.seth_ISSUE_INST_CD(null);						//出庫指示番号
		rcvIssueStruct.setRCV_ISSUE_QTY(rsltStruct.getACPT_QTY());		//入出庫数
		rcvIssueStruct.setRCV_ISSUE_AMOUNT("0");						//入出庫金額
		rcvIssueStruct.setRCV_ISSUE_DATE(rsltStruct.getOPR_DATE());		//入出庫年月日
		rcvIssueStruct.setRCV_ISSUE_GNR_TYP("11");						//入出庫発生区分
		rcvIssueStruct.setRCV_ISSUE_ODD_QTY("0");				//入出庫端数
		rcvIssueStruct.setDEFECT_CAUSE_CD(null);				//入出庫不良理由コード
		rcvIssueStruct.setSTOCK_UPD_TYP("1");					//在庫更新区分
		rcvIssueStruct.setRCV_ISSUE_CMPLT_FLG(sFLG);			//入出庫完了フラグ

		rcvIssueStruct.setOD_NO(procByItemStruct.getOD_NO());	//オーダデマンド番号
		rcvIssueStruct.setLOT_NO(rsltStruct.getLOT_NO());		//在庫ロット番号
		rcvIssueStruct.setVEND_LOT_NO(null);					//メーカロット番号
		rcvIssueStruct.setRCV_ISSUE_COMMENT(null);				//入出庫備考
		rcvIssueStruct.setCONS_TYP("0");						//支給区分
		rcvIssueStruct.setCOMPANY_CD(null);

		// 退避用手持ち在庫数を初期化
		rcvIssueStruct.setSAVE_STOCK_ON_HAND_QTY("0");

		//入庫処理
		RcvCancel RCan = 
				new RcvCancel(conn, rcvIssueStruct.getRCV_ISSUE_CTRL_CD(), getSysUserCd());

		//会社コード
		rcvIssueStruct.setCOMPANY_CD(_company_cd);

		//保管区別入出庫登録
		entity.minsertT_RCV_ISSUE.create(conn, rcvIssueStruct);
		boolean bRSLT = RCan.execProcess();

		String message1 = "";
		if (!bRSLT) {
			for (int n = 0; n < RCan.getErrorList().size(); n++) {
				message1 = message1 + "," + new ExpjMessage(RCan.getErrorList().get(n).toString()).getMessage(_locale);
			}
			if (!isNull(message1)) {
				message1 = message1.substring(1);
				errCode = "ZZ01006";
				writeLog(ERROR, errCode, message1);
				return false;
			}
		}
		return true;
	}

	/**
	 * マニュアル出庫キット出庫を呼び出します。
	 * @param sFLG 作業完了フラグ(0:作業未完了 1:作業完了)
	 * @throws SQLException
	 * @throws Exception
	 */
	private boolean callManiaruIssue(AD0110010Struct parStruct, String plantCD, int m)
	throws SQLException, Exception {
		boolean result=true;
		List UpdateAllList;
		///出来高実績検索
		AD0110010Struct selectStruct = new AD0110010Struct();
		List selectList = entity.mselectT_OUTPUT_RSLT.read(conn, parStruct);
		if (!selectList.isEmpty()) {
			selectStruct = (AD0110010Struct)selectList.get(0);
		}
		selectStruct.setsUser_ID(getSysUserCd());
		//出来高実績番号設定
		selectStruct.setOUTPUT_RSLT_CD(parStruct.getOUTPUT_RSLT_CD());

		//出庫指示リスト取得
		UpdateAllList = entity.mselectIssue.read(conn, selectStruct);

		parStruct.setvc2PLANT_CD(parStruct.getPLANT_CD());
		//出庫指示リストを設定
		result = this.setIssueList(UpdateAllList, parStruct);
		if(result == false){
			return result;
		}

		for (int i = 0; i < UpdateAllList.size(); i++ ) {

			AD0110010Struct issueStruct = new AD0110010Struct();
			issueStruct = (AD0110010Struct)UpdateAllList.get(i);
			issueStruct.setsUser_ID(getSysUserCd());

			issueStruct.setPARTIAL_PRD_NO("0");		//ZEROをセットする
			issueStruct.setJOB_ODR_CD(null);		//製番品目は処理対象外とする

			if (issueStruct.getTEMP_USE_QTY() == null 
					|| Double.parseDouble(issueStruct.getTEMP_USE_QTY()) == 0) {
				continue;	//更新使用数量がZEROの為以下の処理は行わず、次の行に移る
			}

			// 出来高実績番号の自動採番
			Numbering collectNum = 
				new Numbering(conn,
						CollectNumber.ISSUE_CD,
						getSysUserCd(),
						getSysProgramId(),
						plantCD);

			String no = collectNum.getNo();
			if (no == null || no.length() == 0) {
				//採番結果がない
				errCode = "AE00152";
				writeLog(ERROR, errCode);
				return false;
			}

			BigDecimal keepUseQty = new BigDecimal(issueStruct.getTEMP_USE_QTY());
			BigDecimal useQty = new BigDecimal(issueStruct.getTEMP_USE_QTY());
			if (issueStruct.getl_UNIT_QTY_TYP() != null 
					&& "1".equals(issueStruct.getl_UNIT_QTY_TYP())) {
				//品目が整数管理品の場合、切上げを行う
				useQty = useQty.setScale(0,BigDecimal.ROUND_UP);
			}
			//修正内容を保持
			issueStruct.setRCV_ISSUE_CTRL_CD(no);
			issueStruct.setPLANT_CD(plantCD);
			//出来高実績番号
			issueStruct.setWORK_ODR_CD(parStruct.getOUTPUT_RSLT_CD());
			issueStruct.setWORK_IN_PROC_CD(null);

			issueStruct.setRCV_ISSUE_QTY(useQty.negate().toString());
			if (useQty.doubleValue() > 0) {
				//工程在庫出庫
				issueStruct.setRCV_ISSUE_GNR_TYP("51");
			} else {
				//工程在庫出庫取消
				issueStruct.setRCV_ISSUE_GNR_TYP("59");
			}

			issueStruct.setRCV_ISSUE_ODD_QTY(useQty.subtract(keepUseQty).toString());
			issueStruct.setOD_NO(null);
			issueStruct.setRCV_ISSUE_CMPLT_FLG("0");
			issueStruct.setSTOCK_UPD_TYP("2");
			issueStruct.setRCV_ISSUE_TYP("2");

			useQty = new BigDecimal(issueStruct.getTEMP_USE_QTY());
			BigDecimal stockQty = null;
			//工程仕掛在庫出庫処理
			//保管区別品目在庫更新
			List tempList = new ArrayList();
			AD0110010Struct tempStruct= new AD0110010Struct();
			tempList = entity.mselectItemStock.read(conn, issueStruct);
			AD0110010Struct stockStruct = new AD0110010Struct();
			stockStruct.setStructM(issueStruct);
			stockStruct.setsUser_ID(getSysUserCd());
			// 退避用手持ち在庫数を初期化
			issueStruct.setSAVE_STOCK_ON_HAND_QTY("0");

			if (tempList.isEmpty()) {
				//登録
				useQty = useQty.negate();
				stockStruct.setSTOCK_ON_HAND_QTY(useQty.toString());

				entity.minsertItemStock.create(conn, stockStruct);
			} else {
				//更新
				tempStruct = new AD0110010Struct();
				tempStruct = (AD0110010Struct)tempList.get(0);
				stockStruct.setsUser_ID(getSysUserCd());
				issueStruct.setSAVE_STOCK_ON_HAND_QTY(tempStruct.getSTOCK_ON_HAND_QTY());
				stockQty = new BigDecimal(tempStruct.getSTOCK_ON_HAND_QTY());
				if (useQty.doubleValue() > 0) { //出庫
					useQty = stockQty.subtract(useQty);
				} else { //入庫
					useQty = stockQty.add(useQty.negate());
				}
				stockStruct.setSTOCK_ON_HAND_QTY(useQty.toString());

				entity.mupdateItemStock.update(conn, stockStruct);
			}

			issueStruct.setJOB_ODR_CD(null);			//製番
			issueStruct.setJOB_ODR_DETAIL_NO("0");		//製番枝番
			issueStruct.setACPT_NO("0");				//受入回数
			issueStruct.setACPT_RSLT_CRCT_NO("0");		//受入実績訂正回数
			issueStruct.setINSPEC_RSLT_CRCT_NO("0");	//検査実績訂正回数
			issueStruct.setOPR_RSLT_CRCT_NO("0");		//作業実績訂正回数
			issueStruct.setRCV_ISSUE_AMOUNT("0");		//入出庫金額
			issueStruct.setCONS_TYP("0");				//支給区分
			//会社コード
			issueStruct.setCOMPANY_CD(_company_cd);

			// ロット管理フラグ = 1(ロットレース管理を行う。)の場合
			if("1".equals(issueStruct.getLOT_CTRL_FLG())){
				issueStruct.setOUTPUT_RSLT_CD(parStruct.getOUTPUT_RSLT_CD());//出来高実績番号
				issueStruct.setOPR_DATE(parStruct.getOPR_DATE());

				//出庫実績明細取得
				List lotIssueList = entity.mselectT_LOT_ISSUE_INST.read(conn,issueStruct);

				//データがない場合
				if (lotIssueList == null || lotIssueList.size() == 0) {
					errCode = "AD20135";
					writeLog(ERROR, errCode);
					return false;
				}

				//使用残数設定
				BigDecimal remainQty = new BigDecimal(issueStruct.getTEMP_USE_QTY());

				AD0110010Struct lotUseStruct = new AD0110010Struct();
				lotUseStruct.setStructM(issueStruct);
				lotUseStruct.setsUser_ID(getSysUserCd());

				for (int j = 0; j < lotIssueList.size(); j++ ) {
					AD0110010Struct lotIssueStruct = (AD0110010Struct)lotIssueList.get(j);

					//引き当て可能数設定
					BigDecimal issueQty = new BigDecimal(lotIssueStruct.getISSUE_QTY());//出庫実績数量
					BigDecimal spentQty = new BigDecimal(lotIssueStruct.getSPENT_QTY());//使用済
					BigDecimal availQty = issueQty.subtract(spentQty);

					//ロット別使用実績管理番号採番
					List seqList = entity.mSEQ_JF_RSLT.read(conn, parStruct);
					if(seqList != null && seqList.size() > 0){
						lotUseStruct.setRSLT_CTL_SEQ_NO(((AD0110010Struct)seqList.get(0)).getNEXTVAL());
					}

					//出庫指示番号、ロット番号設定
					lotUseStruct.seth_ISSUE_INST_CD(lotIssueStruct.geth_ISSUE_INST_CD());
					lotUseStruct.setLOT_NO(lotIssueStruct.getLOT_NO());

					BigDecimal useLotQty = null;

					//引き当て可能数 >= 使用残数の場合
					if(availQty.doubleValue() >= remainQty.doubleValue()){
						//使用残数を引き当て数に設定
						useLotQty = remainQty;
					//引き当て可能数 < 使用残数の場合
					} else {
						//最終データの場合
						if (j == lotIssueList.size() - 1) {
							//使用残数を使用数に設定
							useLotQty = remainQty;
						//最終データでない場合
						} else {
							//引当可能数が0より大きい場合
							if(availQty.doubleValue() > 0){
								//使用残数を使用数に設定
								useLotQty = remainQty;

								//次レコード以降を取得
								for (int k = j + 1; k < lotIssueList.size(); k++ ) {
									AD0110010Struct nextLotIssueStruct = (AD0110010Struct)lotIssueList.get(k);

									//引き当て可能数設定
									BigDecimal nextIssueQty = new BigDecimal(nextLotIssueStruct.getISSUE_QTY());
									BigDecimal nextSpentQty = new BigDecimal(nextLotIssueStruct.getSPENT_QTY());
									BigDecimal nextAvailQty = nextIssueQty.subtract(nextSpentQty);

									//次レコード以降に引当可能なデータがある場合
									if (nextAvailQty.doubleValue() > 0) {
										//引き当て可能数を使用数に設定
										useLotQty = availQty;
										break;
									}
								}
							//引当可能数が0以下の場合
							} else {
								//次のデータを取得
								continue;
							}
						}
					}

					//使用数が引当可能数より大きい場合
					if(useLotQty.doubleValue() > availQty.doubleValue()){
						//警告メッセージ出力
						errCode = "AD20136";
						writeLog(WARNING, errCode);
						if(!warningFlg){
							warningFlg = true;
						}
					}

					//使用済数量、使用予定数量に上記で設定した使用数を設定
					lotUseStruct.setTOTAL_ISSUE_QTY(useLotQty.toString());
					lotUseStruct.setSUPPLIED_ISSUE_QTY(useLotQty.toString());

					//実績日を使用日に設定
					lotUseStruct.setSUPPLIED_DATE(lotUseStruct.getOPR_DATE());

					//[ロット別使用実績]の追加
					entity.mT_LOT_USE_RSLT.create(conn, lotUseStruct);

					//[出庫実績明細]の更新
					lotUseStruct.setSPENT_QTY(spentQty.add(useLotQty).toString());
					entity.mT_LOT_ISSUE_INST.update(conn, lotUseStruct);

					issueStruct.setLOT_NO(lotIssueStruct.getLOT_NO());
					issueStruct.setRCV_ISSUE_QTY(useLotQty.negate().toString());

					//ロット別品目在庫検索
					tempList = entity.mT_LOT_STOCK.read(conn,issueStruct);

					//更新前の在庫数設定
					if (tempList.isEmpty()) {
						issueStruct.setSAVE_STOCK_ON_HAND_QTY("0");
					} else {
						tempStruct = (AD0110010Struct)tempList.get(0);
						issueStruct.setSAVE_STOCK_ON_HAND_QTY(tempStruct.getSTOCK_ON_HAND_QTY());
					}

					//2件目以降のデータの場合
					if (j > 0) {
						//入出庫管理番号採番
						collectNum = 
							new Numbering(conn,
									CollectNumber.ISSUE_CD,
									getSysUserCd(),
									getSysProgramId(),
									plantCD);
						no = collectNum.getNo();
						if (no == null || no.length() == 0) {
							//採番結果がない
							errCode = "AE00152";
							writeLog(ERROR, errCode);
							return false;
						}
						issueStruct.setRCV_ISSUE_CTRL_CD(no);
					}

					//保管区別入出庫登録
					entity.minsertT_RCV_ISSUE.create(conn, issueStruct);

					//ロット別品目在庫更新
					BizCommon bc = new BizCommon(conn, getSysUserCd(), getSysProgramId(), plantCD);
					List updateLotStockList = bc.excUpdateLotStockFd(no, "");

					//異常終了の場合
					if(bc.getResultStatus().intValue() == 3){
						//エラーメッセージ取得
						if(updateLotStockList != null && updateLotStockList.size() > 0){
							errCode = (String)updateLotStockList.get(0);
							writeLog(ERROR, errCode);
						}
						return false;
					}

					//ロット管理フラグ = 1(ロットトレース管理を行う。)の場合
					if("1".equals(parStruct.getLOT_CTRL_FLG())){
						//親品目の在庫ロット番号が指定されている場合
						if(parStruct.getLOT_NO() != null && !"".equals(parStruct.getLOT_NO())){
							//ロットトレース登録・更新処理
							List lotTraceList = bc.excMakeLotTraceFd(issueStruct.getITEM_CD(),
								issueStruct.getLOT_NO(), parStruct.getITEM_CD(), parStruct.getLOT_NO(),
								"3");
							
							//正常終了の場合
							if(bc.getResultStatus().intValue() == 1){
								AD0110010Struct updateStruct = new AD0110010Struct();
								updateStruct.setFROM_ITEM_CD(issueStruct.getITEM_CD());
								updateStruct.setFROM_LOT_NO(issueStruct.getLOT_NO());
								updateStruct.setTO_ITEM_CD(parStruct.getITEM_CD());
								updateStruct.setTO_LOT_NO(parStruct.getLOT_NO());
								updateStruct.setTO_PUCH_ODR_CD(null);
								updateStruct.setsUser_ID(getSysUserCd());
								
								// 元発注番号を取得する
								List fromPuchOdrNoList = entity.mgetFROM_PUCH_ODR_CD.read(conn, updateStruct);
								if (fromPuchOdrNoList != null && fromPuchOdrNoList.size() > 0) {
									AD0110010Struct puchStruct = (AD0110010Struct)fromPuchOdrNoList.get(0);
									updateStruct.setFROM_PUCH_ODR_CD(puchStruct.getFROM_PUCH_ODR_CD());
								} else {
									updateStruct.setFROM_PUCH_ODR_CD(null);
								}
								entity.mupdateT_LOT_TRACE.update(conn, updateStruct);
							}

							//異常終了の場合
							if(bc.getResultStatus().intValue() == 3){
								//エラーメッセージ取得
								if(lotTraceList != null && lotTraceList.size() > 0){
									errCode = (String)lotTraceList.get(0);
									writeLog(ERROR, errCode);
								}
								return false;
							}
						}
					}

					//使用残数減算
					remainQty = remainQty.subtract(new BigDecimal(lotUseStruct.getTOTAL_ISSUE_QTY()));

					//使用残数が0以下の場合ループ終了
					if (remainQty.doubleValue() <= 0) {
						break;
					}
				}
			//ロット管理フラグ = 1(ロットトレース管理を行う。)でない場合
			} else {
				//保管区別入出庫登録
				entity.minsertT_RCV_ISSUE.create(conn, issueStruct);
			}
		}

		return result;
	}

	/**
	 * 出庫指示リストを設定します。
	 * @throws FoundationException
	 * @throws SQLException
	 * @throws BatchAppException 
	 */
	private boolean setIssueList(List mainIssueList, AD0110010Struct parStruct)
			throws FoundationException, SQLException {

		//良品数
		BigDecimal acptQty = new BigDecimal(parStruct.getACPT_QTY());
		//不良数
		BigDecimal defectQty = new BigDecimal(parStruct.getDEFECT_QTY());

		//作業日(日付制御.業務運用日)のセット
		parStruct.setBUSINESS_OPR_DATE(_btmBusinessOprDate);

		for (int i = 0; i < mainIssueList.size(); i++ ) {
			BigDecimal planSum = acptQty.add(defectQty);
			AD0110010Struct tempIssueStruct = (AD0110010Struct)mainIssueList.get(i);
			tempIssueStruct.setsUser_ID(getSysUserCd());
			//計画使用数量の取得
			int round = Integer.parseInt(tempIssueStruct.getl_UNIT_QTY_TYP());
			BigDecimal denominator = 
					new BigDecimal(tempIssueStruct.getISSUE_INST_UNIT_DENOMINATOR());
			BigDecimal numerator = 
					new BigDecimal(tempIssueStruct.getISSUE_INST_UNIT_NUMERATOR());

			//ロット管理対象外の場合、あるいは新規登録の場合
			if (isNull(tempIssueStruct.getLOT_NO())) {
				if (round == 1) {
					planSum = planSum.multiply(numerator).divide(denominator,0, BigDecimal.ROUND_UP).setScale(1);
				} else {
					planSum = planSum.multiply(numerator).divide(denominator,4, BigDecimal.ROUND_UP);

					// 小数の表示スケール処理
					BigDecimal intVal = new BigDecimal("" + planSum.intValue());
					BigDecimal decimalVal = planSum.subtract(intVal).multiply(
							new BigDecimal(10000));
					int decVal = decimalVal.intValue();
					int roundCount = 1;
					while (true) {
						decVal = decVal / 10;
						if (decVal == 0) {
							break;
						}
						roundCount++;
					}
					planSum = planSum.setScale(roundCount, BigDecimal.ROUND_UP);
				}
				// ロット割り当て済みの場合
			} else {
				// [ロット別使用実績]の使用予定数量を計画使用数量に設定
				planSum = new BigDecimal(tempIssueStruct.getSUPPLIED_ISSUE_QTY());
			}
			tempIssueStruct.setTEMP_PLAN_QTY(planSum.toString());

			//使用済数量、計画外使用済数量、更新使用数量の取得
			tempIssueStruct.setTEMP_USEOVER_QTY("0.0");
			tempIssueStruct.setTEMP_PLANOUT_QTY("0.0");
			tempIssueStruct.setTEMP_USE_QTY("0.0");

			//作業計画番号に出来高実績番号をセット
			List tempList = new ArrayList();
			AD0110010Struct tempStruct = null;
			tempStruct = new AD0110010Struct();
			tempStruct.setsUser_ID(getSysUserCd());
			tempStruct.setWORK_ODR_CD(parStruct.getOUTPUT_RSLT_CD());
			tempStruct.setITEM_CD(tempIssueStruct.getITEM_CD());
			tempStruct.seth_ISSUE_INST_CD(tempIssueStruct.geth_ISSUE_INST_CD());

			// ロット管理対象外の場合、あるいは新規登録の場合
			if (isNull(tempIssueStruct.getLOT_NO())) {
				// 保管区別入出庫の検索
				tempList = new ArrayList();
				tempList = entity.mselectRecvIssue.read(conn, tempStruct);
				if (tempList != null && tempList.size() != 0) {
					tempStruct = (AD0110010Struct) tempList.get(0);
					tempStruct.setsUser_ID(getSysUserCd());
					BigDecimal bdIssue = new BigDecimal(tempStruct.getRCV_ISSUE_QTY());
					tempIssueStruct.setTEMP_USEOVER_QTY(bdIssue.negate().toString());
					if ("0".equals(tempStruct.getcount_RCV_ISSUE())) {
						tempIssueStruct.setTEMP_PLANOUT_QTY("0.0");
						tempIssueStruct.setTEMP_USE_QTY(planSum.toString());
					} else {
						BigDecimal useoverQty = new BigDecimal(tempIssueStruct.getTEMP_USEOVER_QTY());
						BigDecimal planoutQty = (planSum.subtract(useoverQty)).multiply(new BigDecimal(-1));
						tempIssueStruct.setTEMP_PLANOUT_QTY(planoutQty.toString());
						tempIssueStruct.setTEMP_USE_QTY("0.0");
					}
				}
				// ロット割り当て済みの場合
			} else {
				// [ロット別使用実績]の使用済数量を使用済数量に設定
				tempIssueStruct.setTEMP_USEOVER_QTY(tempIssueStruct.getTOTAL_ISSUE_QTY());

				// 計画外使用済数量に計画使用数量-使用済数量、更新使用数量に0を設定
				BigDecimal useoverQty = new BigDecimal(tempIssueStruct.getTEMP_USEOVER_QTY());
				BigDecimal planoutQty = (planSum.subtract(useoverQty)).multiply(new BigDecimal(-1));
				tempIssueStruct.setTEMP_PLANOUT_QTY(planoutQty.toString());
				tempIssueStruct.setTEMP_USE_QTY("0.0");
			}

			//明細用の変数にロット番号設定
			tempIssueStruct.setRCV_ISSUE_DATE(parStruct.getOPR_DATE());
			if (parStruct.getOPR_DATE() == null || "".equals(parStruct.getOPR_DATE())){
				tempIssueStruct.setRCV_ISSUE_DATE(_btmBusinessOprDate);
			}
		}
		return true;
	}

	/**
	 * main： ユーザ定義用メソッドです<br>
	 * <<説明を記述してください>>
	 *
	 * @return <<説明を記述してください>>
	 * @exception <<説明を記述してください>>
	 */
	public int main() throws BatchAppException, BusinessProcessException, FoundationException
	{
		// todo: ここにユーザ定義コードを記述してください
		// PL/SQLの実行
		String result = null;
		// ロック解除キー
		int lockCancelKey = LOCK_FAILD;

		// DB接続取得処理
		conn = m_conductor.m_transactionConn;

		try {
			// 引数チェック
			if (!checkArgs()) {
				writeLog(ERROR, "ZZ09009");
				return BREAK;
			}

			// DBメッセージ更新準備
			IDbConnection conn_msg = m_conductor.m_defaultConn;
			numbering = new Numbering(conn_msg, Numbering.LOG_CD,
					getSysUserCd(), getSysProgramId(), getSysPlantCd());
			businessMsgAcc.init(conn_msg);
			businessMsg.setBusinessOperatingName(getSysProgramId());
			businessMsg.setUser(getSysUserCd());
			businessMsg.setPlantCode(getSysPlantCd());
			m_med.setUsername(getSysUserCd());

			// 業務ロック
			lockCancelKey = businessLock();
			if (lockCancelKey == LOCK_FAILD) {
				writeLog(ERROR, "ZZ01008");
				return BREAK;
			}

			// 【バッチ処理を開始しました。】
			writeLog(INFOMATION, "ZZ09001");

			// 引数の「CSV取込方式」が2：指定ファイル取込 の場合、DBサーバパスの取得・ディレクトリチェック
			if ("2".equals(getCsvTakeTyp())) {
				// エラー時のメッセージ保持用変数
				String[] strMessage = new String[2];

				// DBサーバパスの取得・ディレクトリチェックを行う。
				strMessage = dbServerPathGetCheck();
				// 戻り値配列の0番目(メッセージID)がNULLでない場合、エラー処理を行う。
				if (!isNull(strMessage[0])) {
					// DBサーバパスの取得・ディレクトリチェックにてエラーが発生した場合、例外終了とする。
					if (isNull(strMessage[1])) {
						writeLog(ERROR, strMessage[0]);
						// 異常終了ログ
						writeLog(INFOMATION, "VZ00003");
						return BREAK;
					} else {
						writeLog(ERROR, strMessage[0], strMessage[1]);
						// 異常終了ログ
						writeLog(INFOMATION, "VZ00003");
						return BREAK;
					}
				}
			}

			// 出来高実績CSV取込処理（PL/SQL）の引数をセット
			m_med.setPROGRAM_CD(m_med.getProgname());
			m_med.setFUNCTION_NAME("SQLOUTPUTRSLTINTERFACE");

			m_med.getSYS_BAT_PARM().read();
			if (!m_med.getSYS_BAT_PARM().next()) {
				// 異常終了ログ
				writeLog(INFOMATION, "VZ00003");
				ExpjMessage emsg = new ExpjMessage("ZZ09030");
				throw new BatchAppException("CtrlMain", "excuteProcedure", emsg.getMessage(CoreTools.getLocale(getSysUserCd())));
			}

			m_med.setpvc2LogMode(m_med.getLOG_MODE_TYP().toString());
			m_med.setpvc2OutputMode(m_med.getOUTPUT_MODE_TYP().toString());
			m_med.setpvc2OutputPath(m_med.getFILE_PATH());
			m_med.setpvc2OutputName(m_med.getFILE_NAME());
			m_med.setpvc2UserId(getSysUserCd());
			m_med.setpvc2BusinessName(getSysProgramId());
			m_med.setpvc2PlantCd(getSysPlantCd());

			// CSV取込方式が1：固定ファイル取込 の場合
			if ("1".equals(getCsvTakeTyp())) {
				// CSV取込方式
				m_med.setpnumCsvTakeTyp(getCsvTakeTyp());
				// 取込パス
				m_med.setpvc2CsvTakePath(null);
				// バックアップフォルダパス
				m_med.setpvc2CsvBackupPath(null);
			} else {
				// CSV取込方式
				m_med.setpnumCsvTakeTyp(getCsvTakeTyp());
				// 取込パス
				m_med.setpvc2CsvTakePath(getCsvTakePath());
				// バックアップフォルダパス
				m_med.setpvc2CsvBackupPath(_strCsvDbBackupPath);
			}

			// 出来高実績CSV取込処理（PL/SQL）を行う
			List callList = m_med.getSQLOUTPUTRSLTINTERFACE().call();
			// PL/SQLの実行結果を取得
			medAD0110B001 resultMed = (medAD0110B001) callList.get(0);
			result = resultMed.getpnumReturn();
			// 処理結果が3：異常終了の場合、そこでループを終了する。
			if (result.equals("3")) {
				// 終了ログ
				writeLog(INFOMATION, "VZ00003");
				return BREAK;
			}
			// トランザクションの開始
			conn.beginTransWeb();
			conn.commit();

			// [出来高実績取込]のデータを取得
			List listTOutputRsltTemp = selectTOutputRsltTemp();

			// [出来高実績取込]のデータを取得成功
			if (!listTOutputRsltTemp.isEmpty()) {
				// マスタ整合性チェック実施
				if (check_listTOutputRsltTemp(listTOutputRsltTemp)) {
					// 会社コード取得
					m_med.getSYS_MY_COMPANY().read();
					if (m_med.getSYS_MY_COMPANY().next()) {
						_company_cd = m_med.getCOMPANY_CD();
					}

					// 出来高実績登録処理
					insertCsvDate(listTOutputRsltTemp);
				}
			}
			// 終了ログ
			writeLog(INFOMATION, "ZZ09002");

		} catch (SQLException e) {
			conn.rollback();
			e.printStackTrace();
			throw new BatchAppException("CtrlMain", "main", e.getMessage());
		} catch (FoundationException e) {
			conn.rollback();
			e.printStackTrace();
			throw new BatchAppException("CtrlMain", "main", e.getMessage());
		} catch (Exception e) {
			conn.rollback();
			e.printStackTrace();
			throw new BatchAppException("CtrlMain", "main", e.getMessage());
		} finally {
			try {
				// トランザクションの開始
				conn.beginTransWeb();
				// 出来高実績取込の削除
				m_med.getT_OUTPUT_RSLT_TEMP().delete();
				conn.commit();

				// 業務ロック解除
				if (!businessUnLock(lockCancelKey)) {
					writeLog(ERROR, "ZZ01004");
				}
			} catch (Exception e) {
				conn.rollback();
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
		try {
			entity = new AD0110010Entity();
		} catch (FoundationException e) {
			//TODO 異常終了
		}

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
		public medAD0110B001 m_med=null;

		/**
		 * コンテナクラスインスタンス
		 */
		public ManageContainer m_container=null;

		//////////////////////////////

		public interControl(medAD0110B001 med) throws BatchAppException
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
