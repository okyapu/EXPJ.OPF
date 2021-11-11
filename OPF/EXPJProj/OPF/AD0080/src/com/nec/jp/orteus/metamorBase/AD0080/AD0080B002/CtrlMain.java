/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AD0080/src/com/nec/jp/orteus/metamorBase/AD0080/AD0080B002/CtrlMain.java,v $
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

package com.nec.jp.orteus.metamorBase.AD0080.AD0080B002;

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
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessage;
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessageAccessor;
import com.nec.jp.orteus.expj.util.ExpjMessage;
import com.nec.jp.orteus.expj.util.ExpjException;
import com.nec.jp.orteus.expj.util.Numbering;
//}}user_implement_dev:import

/**
 * CLASS     : CtrlMain クラス
 * ファイル・クラス説明
 * @author $Author: geng-jia $
 * @version $Revision: 1.4 $ $Date: 2015/12/22 09:52:55 $
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
	public medAD0080B002 m_med=null;

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
	public CtrlMain(medAD0080B002 med, BatchAppConductor cdr) throws BatchAppException
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
	public CtrlMain(medAD0080B002 med) throws BatchAppException
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
     return m_med.getArgs()[3];
    }
   
    /**
     * バッチパラメータ(共通4)業務IDを返します。
     * @return 業務ID
     */
    private String getSysProgramId() {
     return m_med.getArgs()[2];
    }
    
    /**
     * バッチパラメータ(共通5)CSV取込方式を返します。
     * @return CSV取込方式
     */
    private String getCsvTakeTyp() {
     return m_med.getArgs()[4];
    }
    
    /**
     * バッチパラメータ(共通6)取込ファイルパスを返します。
     * @return 取込ファイルパス
     */
    private String getCsvTakePath() {
     return m_med.getArgs()[5];
    }
    
    /**
     * バッチパラメータ(共通7)バックアップフォルダパスを返します。
     * @return バックアップフォルダパス
     */
    private String getCsvBackupPath() {
     return m_med.getArgs()[6];
    }
    
    /** DBコネクション */
    private IDbConnection conn = null;
    /** 業務メッセージログ用Numberingクラス */
    private Numbering numbering = null;
    /** 業務メッセージログ用BusinessMessageAccessorクラス */
    private BusinessMessageAccessor businessMsgAcc = new BusinessMessageAccessor();
    /** 業務メッセージログ用BusinessMessageクラス */
    private BusinessMessage businessMsg = new BusinessMessage();
 
	/** ロック失敗時ロックキー */
	private static final int LOCK_FAILD = -1;
	/** 業務ロッククラス */
	private BusinessLock lock = null;
	
	private static final int INFOMATION = 0;
	/** ログレベル ワーニング */
	private static final int WARNING = 1;
	/** ログレベル エラー */
	private static final int ERROR = 2;
	
	/** ドライブレター変換元文字 **/
	private char _driveLetterChangeCharBefore;
	/** ドライブレター変換先文字 **/
	private char _driveLetterChangeCharAfter;
	/** DBサーバ名 */
	private String _strDbServerName;
	
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
	 * ログファイル出力
	 * @param logLevel ログレベル
	 * @param code メッセージコード
	 */
	private void writeLogFiles(int logLevel, String code) {
		writeLogFiles(logLevel, code, null);
	}
	
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
			case WARNING :
				m_med.getSyslog().warning(emsg, m_med.getUsername());
				break;
			case ERROR :
				m_med.getSyslog().severe(emsg, m_med.getUsername());
				break;
		}
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
	 * 業務ロックを行います
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
	 * バッチパラメータ（共通）のチェックを行います。
	 * @return 正常の場合true、不正の場合false
	 * @throws BatchAppException
	 */
	private boolean checkCommonParams() throws BatchAppException {
		
		// バッチパラメータの形式が不正な場合
		String[] args = m_med.getArgs();
		if (args.length > 7){
			writeLogFiles(ERROR, "ZZ09022");
			return false;
		}
		// バッチパラメータの形式が不正な場合
		if (args.length < 5){
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
		
		// 引数の「CSV取込方式」が1：固定ファイル取込、2：指定ファイル取込　以外の場合
		if ((!getCsvTakeTyp().equals("1") && !getCsvTakeTyp().equals("2"))) {
			writeLogFiles(ERROR, "AD60038");
			return false;
		}
		// 引数の「CSV取込方式」が2：指定ファイル取込かつ 引数の「取込パス」がNULLの場合
		if ((getCsvTakeTyp().equals("2"))) {
			if (isNull(getCsvTakePath())) {
				writeLogFiles(ERROR, "AD60039");
				return false;
			}
		}
		// 引数の「CSV取込方式」が2：指定ファイル取込 かつ 引数の「バックアップフォルダパス」がNULLの場合
		if ((getCsvTakeTyp().equals("2"))) {
			if (isNull(getCsvBackupPath())) {
				writeLogFiles(ERROR, "AD60040");
				return false;
			}
		}
		
		return true;
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
		int nret = m_med.getSYS_CLASS_CODE().read();
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
			_driveLetterChangeCharBefore = m_med.getCODE().charAt(0);
			_driveLetterChangeCharAfter = m_med.getCODE2().charAt(0);
		}
		// [区分コード]より「DBサーバ名」を取得する。
		m_med.setSYS_CLASS("PRODUCTION");
		m_med.setCLASS_CODE("DB_SERVER_NAME");
		
		// [区分コード]の検索実行
		nret = m_med.getSYS_CLASS_CODE().read();
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
		if (getCsvTakeTyp().equals("2")) {
			String strCsvDbBackupPath = "\\\\" + _strDbServerName + "\\" + getCsvBackupPath().replace(_driveLetterChangeCharBefore, _driveLetterChangeCharAfter);
			File csvDbBackupFile = new File(strCsvDbBackupPath);
			if (!csvDbBackupFile.isDirectory()) {
				strResultMessage[0] = "AD60043";
				strResultMessage[1] = "バックアップフォルダパス：" + strCsvDbBackupPath.replaceAll("\\\\\\\\", "").replaceAll("\\\\","/");
				return strResultMessage;
			}
		}
		
		return strResultMessage;
	}
	
	
	//////////////////////////////

	/**
	 * main： ユーザ定義用メソッドです<br>
	 * <<説明を記述してください>>
	 *
	 * @return <<説明を記述してください>>
	 * @exception <<説明を記述してください>>
	 */
	public int main() throws BatchAppException, FoundationException
	{
/*
		// todo: ここにユーザ定義コードを記述してください
*/
		// ロック解除キー
		int lockCancelKey = LOCK_FAILD;
		// DB接続取得処理
		conn = m_conductor.m_transactionConn;
		String[] args = m_med.getArgs();
		if(args.length >= 2){
	           m_med.setUsername(m_med.getArgs()[1]);
	        }
		
		// バッチパラメータ（共通）チェック
		if (!checkCommonParams()) {
			writeLogFiles(ERROR, "ZZ09009");
			return BREAK;
		}
		
		// PL/SQLの実行
		String result = null;
		try {	
			// DBメッセージ更新準備
			IDbConnection conn_msg = m_conductor.m_defaultConn;
			numbering = new Numbering(conn_msg, Numbering.LOG_CD, getSysUserCd(), getSysProgramId(), getSysPlantCd());
			businessMsgAcc.init(conn_msg);
			businessMsg.setBusinessOperatingName(getSysProgramId());
			businessMsg.setUser(getSysUserCd());
			businessMsg.setPlantCode(getSysPlantCd());
			
			// 業務ロック
			lockCancelKey = businessLock();
			if (lockCancelKey == LOCK_FAILD) {
				writeLog(ERROR, "ZZ01008");
				return BREAK;
			}
			
			// 開始メッセージ
			writeLog(INFOMATION, "ZZ09001");
			
			m_med.setPROGRAM_CD(m_med.getProgname());
			m_med.setFUNCTION_NAME("SQLOPRRSLTINTERFACE");
			
			int nret = m_med.getSYS_BAT_PARM().read();
			if (!m_med.getSYS_BAT_PARM().next()) {
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
			
			// エラー時のメッセージ保持用変数
			String[] strMessage = new String[2];			
			
			// 引数の「CSV取込方式」が2：指定ファイル取込の場合、DBサーバパスの取得・ディレクトリチェックを行う。
			if ((getCsvTakeTyp().equals("2"))) {
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

			// CSV取込方式が1：固定ファイル取込 の場合
			if (getCsvTakeTyp().equals("1")) {
				// CSV取込方式
				m_med.setpnumCsvTakeTyp(getCsvTakeTyp());
				// 取込パス
				m_med.setpvc2CsvTakePath(null);
				// バックアップフォルダパス
				m_med.setpvc2CsvBackupPath(null);
			}else if (getCsvTakeTyp().equals("2")) {
				// CSV取込方式
				m_med.setpnumCsvTakeTyp(getCsvTakeTyp());
				// 取込パス
				m_med.setpvc2CsvTakePath(getCsvTakePath());
				// バックアップフォルダパス
				m_med.setpvc2CsvBackupPath(getCsvBackupPath());
			}
			
			List callList = null;
			callList = m_med.getSQLOPRRSLTINTERFACE().call();
			// PL/SQLの実行結果を取得
			medAD0080B002 resultMed = (medAD0080B002) callList.get(0);
			result = resultMed.getpnumReturn();
			// 処理結果が3：異常終了の場合、そこでループを終了する。
			if (result.equals("3")) {
				// 終了ログ
				writeLog(INFOMATION, "ZZ09002");
				return BREAK;
			}
			// トランザクションの開始
			conn.beginTransWeb();
			conn.commit();				
			writeLog(INFOMATION, "ZZ09002");
			
		}catch (FoundationException e) {
			conn.rollback();
			e.printStackTrace();
			throw new BatchAppException("CtrlMain", "main", e.getMessage());			
		}catch (SQLException e) {
			conn.rollback();
			e.printStackTrace();
			throw new BatchAppException("CtrlMain", "main", e.getMessage());
		}catch (Exception e) {
			conn.rollback();
			e.printStackTrace();
			throw new BatchAppException("CtrlMain", "main", e.getMessage());
		}finally{
			try{
				// 業務ロック解除
				if (!businessUnLock(lockCancelKey)) {
					writeLog(ERROR, "ZZ01004");
				}
			}catch(Exception e){
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
		public medAD0080B002 m_med=null;

		/**
		 * コンテナクラスインスタンス
		 */
		public ManageContainer m_container=null;

		//////////////////////////////

		public interControl(medAD0080B002 med) throws BatchAppException
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
