/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AF0130/src/com/nec/jp/orteus/metamorBase/AF0130/AF0130B001/CtrlMain.java,v $
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

package com.nec.jp.orteus.metamorBase.AF0130.AF0130B001;

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
import com.nec.jp.orteus.metamorBase.AF0130.AF0130010Entity;
import com.nec.jp.orteus.metamorBase.AF0130.AF0130010Struct;
import com.nec.jp.orteus.metamorBase.common.CollectNumber.CollectNumber;
import com.nec.jp.orteus.metamorBase.common04.sysdata.DateCtrlControl;
import com.nec.jp.orteus.metamorBase.common04.sysdata.DateCtrlStruct;
import com.nec.jp.orteus.metamorBase.common04.util.DataNotFoundException;
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessage;
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessageAccessor;
import com.nec.jp.orteus.expj.pr.rcvissue.common.UpdateInfo;
import com.nec.jp.orteus.expj.pr.rcvissue.process.IssueInstStruct;
import com.nec.jp.orteus.expj.pr.rcvissue.process.IssueProcess;
import com.nec.jp.orteus.expj.pr.rcvissue.process.IssueRemain;
import com.nec.jp.orteus.expj.pr.rcvissue.process.JobOdrAlc;
import com.nec.jp.orteus.expj.pr.rcvissue.process.RcvProcess;
import com.nec.jp.orteus.expj.systemlog.SystemLog;
import com.nec.jp.orteus.expj.util.Calculate;
import com.nec.jp.orteus.expj.util.ExpjMessage;
import com.nec.jp.orteus.expj.util.ExpjException;
import com.nec.jp.orteus.expj.util.MessageStruct;
import com.nec.jp.orteus.expj.util.Numbering;
import java.math.BigDecimal;
import com.nec.jp.orteus.xaf.wa.BusinessProcessException;
import com.nec.jp.orteus.util.logging.*;
//}}user_implement_dev:import

/**
 * CLASS     : CtrlMain クラス
 * ファイル・クラス説明
 * @author $Author: shan-xiuqin $
 * @version $Revision: 1.3 $ $Date: 2016/05/23 08:18:12 $
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
	public medAF0130B001 m_med=null;

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
	public CtrlMain(medAF0130B001 med, BatchAppConductor cdr) throws BatchAppException
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
	public CtrlMain(medAF0130B001 med) throws BatchAppException
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
	
	/**全部レコード数**/
	private int _intTotalCount = 0; 
	/**エラーレコード件数**/
	private int _intErrorCount = 0;  
	/**正常レコード件数**/
	private int _intSuccessCount = 0;
	/**ワーニング件数**/
	private int _intWarningCount = 0;
    /**エラーコード*/
    String errCode = null;    
    
	/** 業務運用日*/
	private String _btmBusinessOprDate;
	
	// 設定値
	private String strValus = null;
	private String _wh_cd = null;
	private String  _ctrlCd = null;
	
	protected AF0130010Struct struct = new AF0130010Struct();

    /**AF0130 entity*/
	protected AF0130010Entity entity;
	
	protected SystemLog sysLog = null;
	
	
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
	 * ログメッセージ設定
	 * @param 出力メッセージ
	 */
	private void setSyslogConfig(String message) {
		ExpjMessage emsg = new ExpjMessage( "ZZ01006", message );
		m_med.getSyslog().config(emsg, getSysUserCd());
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
	
	/**
	 * マニュアル出庫実績取込データ取得
     * @return	puchOrdList     マニュアル出庫実績取込リスト
	 * @throws BatchAppException 
	 */
	private List selectTManIssueInstTemp() throws BatchAppException {
		List rtnList = new ArrayList();
		AF0130010Struct structdata = null;
		m_med.getT_MAN_ISSUE_INST_TEMP().read();
		while(m_med.getT_MAN_ISSUE_INST_TEMP().next()) {
			structdata = new AF0130010Struct();
			structdata.setISSUE_INST_CD(m_med.getISSUE_INST_CD());
			structdata.setITEM_CD(m_med.getITEM_CD());
			structdata.setJOB_ODR_CD(m_med.getJOB_ODR_CD());
			structdata.setWH_CD(m_med.getISSUE_WH_CD());
			structdata.setLOT_NO(m_med.getLOT_NO());
			structdata.setISSUE_QTY(m_med.getISSUE_QTY());
			structdata.setISSUE_DATE(m_med.getISSUE_DATE());
			structdata.setISSUE_CMPLT_FLG(m_med.getISSUE_CMPLT_FLG());
			structdata.setRCV_WH_CD(m_med.getRCV_WH_CD());
			structdata.setVEND_LOT_NO(m_med.getVEND_LOT_NO());
			rtnList.add(structdata);
		}
		return rtnList;
	}	

	/*
	 * 日期のチェック
	 * 
	 * @param dataSource String
	 * 
	 * @return true or false boolean trueの場合　日期です、　falseの場合、日期ではない
	 */
	private String chageDate(String dataSource) {
		String dataEnd = "";
		if (dataSource.matches("^^\\d{4}\\/\\d{2}\\/\\d{2}$")) {
			dataEnd = dataSource;
		} else if (dataSource.matches("^^\\d{4}\\/\\d{1}\\/\\d{1}$")) {
			dataEnd = dataSource.substring(0, 5) + "0"+dataSource.substring(5, 7)+"0"+dataSource.substring(7, 8);

		} else if (dataSource.matches("^^\\d{4}\\/\\d{2}\\/\\d{1}$")) {
			dataEnd = dataSource.substring(0, 5) + dataSource.substring(5, 8)+ "0" + dataSource.substring(8, 9);

		} else if (dataSource.matches("^^\\d{4}\\/\\d{1}\\/\\d{2}$")) {
			dataEnd = dataSource.substring(0, 5) + "0" + dataSource.substring(5, 7) + dataSource.substring(7, 9);
		}
		return dataEnd;
	}
	
	/**
	 * 実際原価管理パラメータの対象年月日取得
	 * @param in チェック日
	 * @param in チェック工場コード
	 * @param in AD0050010Struct
	 * @param in AD0050010Entity
	 * 戻り値 チェック結果
	 */
	private boolean checkProcExecDate(String checkDate,String plantCD, AF0130010Struct struct) throws BusinessProcessException, FoundationException {
		boolean checkResult = true;
		try {
			
			struct.setPLANT_CD(plantCD);
			List procExecDateList = entity.mselectSYS_ACTUAL_COST_CTRL_AC.read(conn, struct);
			// 実際原価管理パラメータに存在しない
			if(procExecDateList == null || procExecDateList.isEmpty()){
				return true;
			}
			AF0130010Struct procExecDateStruct = (AF0130010Struct) procExecDateList.get(0);
			BigDecimal date = new BigDecimal(procExecDateStruct.getPROC_EXEC_DATE());
			BigDecimal input = new BigDecimal(chageDate(checkDate).substring(0,4) + chageDate(checkDate).substring(5,7));
			if(input.compareTo(date) >= 0){
				checkResult = true;
			}else{
				//より過去の場合
				checkResult = false;
			}
		}catch(Exception e) {
			conn.rollback();;
			throw new ExpjException(e);
		}
		return checkResult;
	}
	
	
	/**
	 * 出庫実績取込データのマスタ整合性チェック
	 * @param dataList
	 * @return
	 * @throws BusinessProcessException
	 * @throws FoundationException
	 */
	private boolean check_listTManIssueInstTemp(List dataList) throws Exception{
		// 全部レコード数
		_intTotalCount = dataList.size();
		AF0130010Struct dataStruct = new AF0130010Struct();
		//エラー行番号
		String errorNumber = "0";
		//業務メッセージ用エラー行番号
		String err_commt ="";
		try {
			for (int i = 0; i < dataList.size(); i++)	{
				boolean lotWarningFlg = false;
				dataStruct = (AF0130010Struct)dataList.get(i);
				errorNumber =String.valueOf(i+1);
				
				AF0130010Struct tIssueinstStruct = new AF0130010Struct();
				AF0130010Struct tlotcrtl  =new AF0130010Struct();
				
				
				//「出庫指示番号」 への入力値が[出庫指示]に存在しない場合
				List issueinstcd = entity.mselect_T_ISSUE_INST1.read(conn, dataStruct);
				if(issueinstcd.isEmpty()){
					errCode = "AF00007";
					//業務メッセージ用エラーメッセージの格納
					err_commt="(SBM1330)CSV行番号 =　[" + errorNumber + "]";
					writeLog(ERROR,errCode,err_commt);	
					_intErrorCount++;
					continue;
				}else{
					tIssueinstStruct = (AF0130010Struct)issueinstcd.get(0);
					//[出庫指示].“工場コード” が ログインしたユーザーの工場コードと等しくない場合
					if(!tIssueinstStruct.getPLANT_CD().equals(getSysPlantCd())){						
						errCode = "AF00182";
						//業務メッセージ用エラーメッセージの格納
						err_commt="(SBM1330)CSV行番号 =　[" + errorNumber + "]";
						writeLog(ERROR,errCode,err_commt);	
						_intErrorCount++;
						continue;
					}
					//[出庫指示].”出庫指示出庫区分” ≠ 1：マニュアル出庫場合
					if(!"1".equals(tIssueinstStruct.getISSUE_TYP())){						
						errCode = "AF00183";
						//業務メッセージ用エラーメッセージの格納
						err_commt="(SBM1330)CSV行番号 =　[" + errorNumber + "]";
						writeLog(ERROR,errCode,err_commt);	
						_intErrorCount++;
						continue;
					}
					//[出庫指示].”出庫完了フラグ” = 1：出庫完了場合
					if("1".equals(tIssueinstStruct.getISSUE_CMPLT_FLG())){
						
						errCode = "AF00132";
						//業務メッセージ用エラーメッセージの格納
						err_commt="(SBM1330)CSV行番号 =　[" + errorNumber + "]";
						writeLog(ERROR,errCode,err_commt);	
						_intErrorCount++;
						continue;
					}
					//ADD START 20141208 fei-hy
					//「品目番号」がNULLではないかつ「品目番号」が[出庫指示].“出庫品目番号”と一致しない場合
					if (dataStruct.getITEM_CD() != null && !"".equals(dataStruct.getITEM_CD()) && !dataStruct.getITEM_CD().equals(tIssueinstStruct.getITEM_CD())) {						
						errCode = "AF00192";
						//業務メッセージ用エラーメッセージの格納
						err_commt="(SBM1330)CSV行番号 =　[" + errorNumber + "]";
						writeLog(ERROR,errCode,err_commt);	
						_intErrorCount++;
						continue;
					}
					//ADD END 20141208 fei-hy
				}
				
				
				//[出庫指示].“出庫品目番号”を基に
				//[品目].” 品目手配区分”が「1:製番 」または「2:在庫引当型製番」以外かつ製番がNULLではない場合
				List lotctrlflg =entity.mselect_LOT_CTRL_FLG.read(conn, dataStruct);
				tlotcrtl =(AF0130010Struct)lotctrlflg.get(0);
				if(!("1".equals(tlotcrtl.getMRP_ODR_TYP()) ||"2".equals(tlotcrtl.getMRP_ODR_TYP()))){
					if(!isNull(dataStruct.getJOB_ODR_CD())){						
						errCode = "AF00018";
						//業務メッセージ用エラーメッセージの格納
						err_commt="(SBM1330)CSV行番号 =　[" + errorNumber + "]";
						writeLog(ERROR,errCode,err_commt);	
						_intErrorCount++;
						continue;
					}
				}
				
				//製番がNULLではない、かつ、[製番計画] はデータが検索できない場合
				tIssueinstStruct = (AF0130010Struct)issueinstcd.get(0);
				if(!isNull(dataStruct.getJOB_ODR_CD())){
					boolean blnTWorkProcByItem = entity.mcheck_JOB_ODR_CD.check(conn, dataStruct);
					if (!blnTWorkProcByItem) {						
						errCode = "AF00184";
						//業務メッセージ用エラーメッセージの格納
						err_commt="(SBM1330)CSV行番号 =　[" + errorNumber + "]";
						writeLog(ERROR,errCode,err_commt);	
						_intErrorCount++;
						continue;
					}
				}
				
				
				//「出庫元保管区コード」 と 「出庫先保管区コード」 の入力値が同じ場合
				if(dataStruct.getWH_CD().equals(dataStruct.getRCV_WH_CD())){					
					errCode = "AF00054";
					//業務メッセージ用エラーメッセージの格納
					err_commt="(SBM1330)CSV行番号 =　[" + errorNumber + "]";
					writeLog(ERROR,errCode,err_commt);	
					_intErrorCount++;
					continue;
				}
				
				//「出庫元保管区コード」 が [保管区] に存在しない場合
				List whList  =entity.mselect_M_WH.read(conn, dataStruct);
				if(whList.isEmpty()){					
					errCode = "AF00028";
					//業務メッセージ用エラーメッセージの格納
					err_commt="(SBM1330)CSV行番号 =　[" + errorNumber + "]";
					writeLog(ERROR,errCode,err_commt);	
					_intErrorCount++;
					continue;
				}else{
					//「出庫元保管区コード」の[保管区].“工場コード” と ログインユーザーの工場コード が異なる場合
					if(!((AF0130010Struct)whList.get(0)).getPLANT_CD().equals(getSysPlantCd()))
					{						
						errCode = "AF00029";
						//業務メッセージ用エラーメッセージの格納
						err_commt="(SBM1330)CSV行番号 =　[" + errorNumber + "]";
						writeLog(ERROR,errCode,err_commt);	
						_intErrorCount++;
						continue;
					}
					//「出庫元保管区コード」を基に[保管区].“所要量計算対象フラグ” が 1：所要量計算対象 でない場合
					if(! "1".equals(((AF0130010Struct)whList.get(0)).getMRP_FLG())){						
						errCode = "AF00096";
						//業務メッセージ用エラーメッセージの格納
						err_commt="(SBM1330)CSV行番号 =　[" + errorNumber + "]";
						writeLog(ERROR,errCode,err_commt);	
						_intErrorCount++;
						continue;
					}
				}
				if("1".equals(tlotcrtl.getLOT_CTRL_FLG())){
					//[出庫指示].“出庫品目番号”を基に[品目].”ロット管理フラグ”が「１：ロット管理を行う」、
					//「在庫ロット番号」がNULL場合
					if(isNull(dataStruct.getLOT_NO())){						
						errCode = "AF20001";
						//業務メッセージ用エラーメッセージの格納
						err_commt="(SBM1330)CSV行番号 =　[" + errorNumber + "]";
						writeLog(ERROR,errCode,err_commt);	
						_intErrorCount++;
						continue;
					}else{
						// [出庫指示].“出庫品目番号”を基に[品目].”ロット管理フラグ”が「１：ロット管理を行う」、
						//「在庫ロット番号」と、[出庫指示]．“出庫品目番号”で [ロット管理]を検索し存在しない場合
						boolean chklotno =entity.mcheck_TLOT_CTRL.check(conn, dataStruct);
						if (!chklotno) {							
							errCode = "AF20002";
							//業務メッセージ用エラーメッセージの格納
							err_commt="(SBM1330)CSV行番号 =　[" + errorNumber + "]";
							writeLog(ERROR,errCode,err_commt);	
							_intErrorCount++;
							continue;
						}
					}
				
				}else{
					// [出庫指示].“出庫品目番号”を基に[品目].”ロット管理フラグ”が「0：ロット管理を行わない」、
					//「製番」 が null で 「出庫数」 の値が ＞ 0 の場合
					//品目番号、保管区 を基に [保管区別品目在庫] が存在しない場合
					List itemstock =entity.mselect_T_ITEM_STOCK.read(conn, dataStruct);
					if (isNull(dataStruct.getJOB_ODR_CD()) && Calculate.compare(dataStruct.getISSUE_QTY(), "0")  >0 && itemstock.size()<=0) {						
						errCode = "AF00044";
						//業務メッセージ用エラーメッセージの格納
						err_commt="(SBM1330)CSV行番号 =　[" + errorNumber + "]";
						writeLog(ERROR,errCode,err_commt);	
						_intErrorCount++;
						continue;
					}
					
					//[出庫指示].“出庫品目番号”を基に[品目].”ロット管理フラグ”が「0：ロット管理を行わない」、
					//「製番」 が nullではない で 「出庫数」 の値が ＞ 0 の場合
					//製番、品目番号、保管区 を基に [保管区別製番在庫] が存在しない場合
					List itemjobstock =entity.mselect_T_JOB_ODR_CD_STOCK.read(conn, dataStruct);
					if (!isNull(dataStruct.getJOB_ODR_CD()) && Calculate.compare(dataStruct.getISSUE_QTY(), "0")>0 && itemjobstock.size()<=0) {						
						errCode = "AF00045";
						//業務メッセージ用エラーメッセージの格納
						err_commt="(SBM1330)CSV行番号 =　[" + errorNumber + "]";
						writeLog(ERROR,errCode,err_commt);	
						_intErrorCount++;
						continue;
					}
					//[出庫指示].“出庫品目番号”を基に[品目].”ロット管理フラグ”が「0：ロット管理を行わない」、
					//品目手配区分が 1：製番 もしくは 2：在庫引当型製番 で 「製番
					//」がnullで 「出庫数」 ＞ 「出庫可能数」 の場合
					tIssueinstStruct = (AF0130010Struct)issueinstcd.get(0);
					//引当済未出庫数
					IssueRemain issueRemain = new IssueRemain(conn);
					struct.setALC_NOISSUE_QTY(
					issueRemain.getRemainQtyByItem(tIssueinstStruct.getOD_NO()).toString());

					// 「品目在庫未引当数」
					struct.setITEM_STOCK_NON_ALC_QTY(
					issueRemain.getFreeStockQtyOfItem(getSysPlantCd(),tIssueinstStruct.getITEM_CD()).toString());
					//「出庫可能数」 = 「引当済未出庫数」 ＋ 「品目在庫未引当数」
					struct.setTHIS_TIME_ISSUE_POSS_QTY(
					Calculate.add(struct.getALC_NOISSUE_QTY(),struct.getITEM_STOCK_NON_ALC_QTY()));
					
					if("1".equals(tlotcrtl.getMRP_ODR_TYP()) ||"2".equals(tlotcrtl.getMRP_ODR_TYP()) ){
						BigDecimal issueQty = new BigDecimal(dataStruct.getISSUE_QTY());
						BigDecimal itemStock = new BigDecimal(struct.getITEM_STOCK_NON_ALC_QTY());
						if (isNull(dataStruct.getJOB_ODR_CD()) 
								&& issueQty.doubleValue() > itemStock.doubleValue()) {							
							errCode = "AF00115";
							//業務メッセージ用エラーメッセージの格納
							err_commt="(SBM1330)CSV行番号 =　[" + errorNumber + "]";
							writeLog(ERROR,errCode,err_commt);	
							_intErrorCount++;
							continue;
						}
					}
					
					//// クリア
					struct.setALC_NOISSUE_QTY("0.0");
					struct.setITEM_STOCK_NON_ALC_QTY("0.0");
					struct.setTHIS_TIME_ISSUE_POSS_QTY("0.0");
					
					//[出庫指示].“出庫品目番号”を基に[品目].”ロット管理フラグ”が「0：ロット管理を行わない」、
					//品目手配区分が 1：製番 もしくは 2：在庫引当型製番 で 「製番」がnullではないで 
					//「製番」が自製番でなく  「出庫数」 ＞ 「出庫可能数」 の場合
					
					//個別手配分出庫可能数
					IssueRemain.ResultByOd  re = issueRemain.getRemainQtyByOd(tIssueinstStruct.getOD_NO());
					struct.setODR_ISSUE_POSS_QTY(re.remainQty.toString());
					
					//「製番」 が nullではない の場合
					List tmpList;
					// 製番がnullでない時、製番在庫 読込
					tmpList = entity.mselectSub1_ODR_STOCK.read(conn, struct);		

					if(tmpList.size()> 0){
						AF0130010Struct tmpStruct = (AF0130010Struct)tmpList.get(0);
						struct.setw_TOTAL_STOCK_ON_HAND_QTY(tmpStruct.getw_TOTAL_STOCK_ON_HAND_QTY());
					}
					//「引当済未出庫数」
					struct.setITEM_STOCK_NON_ALC_QTY(struct.getw_TOTAL_STOCK_ON_HAND_QTY());
					
					
					//品目の品目手配区分が 1：製番 もしくは 2：在庫引当型製番 で 「製番」が nullではない の場合、
					//「出庫可能数」 = 「個別手配分出庫可能数」＋「引当済未出庫数」
					struct.setTHIS_TIME_ISSUE_POSS_QTY(
							Calculate.add(struct.getODR_ISSUE_POSS_QTY(), struct.getALC_NOISSUE_QTY()));

					if("1".equals(tlotcrtl.getMRP_ODR_TYP()) || "2".equals(tlotcrtl.getMRP_ODR_TYP())){
						if (!isNull(dataStruct.getJOB_ODR_CD()) 
								&& Calculate.compare(dataStruct.getISSUE_QTY(), struct.getTHIS_TIME_ISSUE_POSS_QTY())>0) {							
							errCode = "AF00116";
							//業務メッセージ用エラーメッセージの格納
							err_commt="(SBM1330)CSV行番号 =　[" + errorNumber + "]";
							writeLog(ERROR,errCode,err_commt);	
							_intErrorCount++;
							continue;
						}
					}
				}
				
				// 「出庫日」 が 「未来日(業務運用日より未来) である場合
				//業務運用日の取得
					DateCtrlStruct dateCtrl = DateCtrlControl.getData(conn, getSysPlantCd());
					_btmBusinessOprDate = dateCtrl.getBUSINESS_OPR_DATE();
				
				// 業務運用日
				BigDecimal decimalBusinessDate = new BigDecimal(_btmBusinessOprDate.substring(0,4) + 
						_btmBusinessOprDate.substring(5,7)+ _btmBusinessOprDate.substring(8,10));
				// 出庫日
				BigDecimal decimalOprDate = new BigDecimal(chageDate(dataStruct.getISSUE_DATE()).substring(0,4) + 
						chageDate(dataStruct.getISSUE_DATE()).substring(5,7)+ chageDate(dataStruct.getISSUE_DATE()).substring(8,10));
				if (decimalOprDate.compareTo(decimalBusinessDate) > 0) {					
					errCode = "ZZ05103";
					//業務メッセージ用エラーメッセージの格納
					err_commt="(SBM1330)CSV行番号 =　[" + errorNumber + "]";
					writeLog(ERROR,errCode,err_commt);	
					_intErrorCount++;
					continue;
				}
				
				// 以下の条件で、[システムパラメータ]を検索し、設定値（完了している月の実績の登録／修正を可能とするか否かの区分）を取得する。
				AF0130010Struct adStruct = new AF0130010Struct();
				List valueList = entity.mselectPARAMETER.read(conn, adStruct);
				if (valueList.isEmpty()) {
					strValus = "true";
				}else {
					adStruct = (AF0130010Struct)valueList.get(0);
					strValus = adStruct.getVALUE();
				}	
				

				// 実際原価の締めが完了している日付チェック、「システムパラメータ」．設定値=“false”の場合、「出庫日」の年月 （YYYY/MM）が[実際原価管理パラメータ].“対象年月”より過去の場合
				if ("false".equals(strValus)) {
					if(!checkProcExecDate(dataStruct.getISSUE_DATE(),tIssueinstStruct.getPLANT_CD(),struct)){						
						errCode = "AE00160";
						//業務メッセージ用エラーメッセージの格納
						err_commt="(SBM1330)CSV行番号 =　[" + errorNumber + "]";
						writeLog(ERROR,errCode,err_commt);	
						_intErrorCount++;
						continue;
					}
				}
				//[出庫指示].“出庫品目番号”を基に[品目].”ロット管理フラグ”が「１：ロット管理を行う」場合、
				//「在庫ロット番号」がNullでないまたは「出庫数」が０以外、かつ、[ロット管理].”賞味期限”＜ 「出庫日」、かつ、
				//[パラメータ].” 名前”＝’ BEST_BEFORE_DATE_CHECK_FLG’が1:エラーの場合
				List bestbeforedate = entity.mc_BEST_BEFORE_DATE.read(conn, dataStruct);
				dataStruct.setSYS_PARAMETER_NAME("BEST_BEFORE_DATE_CHECK_FLG");
				
				List syspara =entity.mSELECT_SYS_PARAMETER.read(conn, dataStruct);
				
				if("1".equals(tlotcrtl.getLOT_CTRL_FLG())){
					if(!isNull(dataStruct.getLOT_NO())|| !"0".equals(dataStruct.getISSUE_QTY())){
						if(bestbeforedate.size()>0 && syspara.size()>0 ){
							AF0130010Struct bbdstruct = new AF0130010Struct();
							bbdstruct = (AF0130010Struct)bestbeforedate.get(0);						
							AF0130010Struct sysvalue = new AF0130010Struct();
							sysvalue = (AF0130010Struct)syspara.get(0);
							if("1".equals(bbdstruct.getBEST_BEFORE_DATE())){
								if("1".equals(sysvalue.getSYS_PARAMETER_VALUE())){									
									errCode = "AE05060";
									//業務メッセージ用エラーメッセージの格納
									err_commt="(SBM1330)CSV行番号 =　[" + errorNumber + "]";
									writeLog(ERROR,errCode,err_commt);	
									_intErrorCount++;
									continue;
								}else{
									lotWarningFlg = true;
								
								}
							}
						}
					}
				}
				
				// 買掛管理がインストールされている場合、当年月度を取得
				AF0130010Struct readStruct = new AF0130010Struct();
				List installOptionsList = entity.mSYS_INSTALL_OPTIONS.read(conn, readStruct);
				if (installOptionsList.size() > 0) {
					AF0130010Struct installOptionsStruct = (AF0130010Struct)installOptionsList.get(0);
					dataStruct.setINSTALL_FLG(installOptionsStruct.getINSTALL_FLG());
				} else {
					dataStruct.setINSTALL_FLG("0");
				}
				
				// [インストールオプション].” システムオプション識別子” ＝ C* 、[インストールオプション].” システム導入フラグ” ＝ 1:導入、
				//[出庫指示].”支給区分” ＝ 1：有償支給の場合で
				//[自社].”SYSコントロールコード”　＝　SYSTEM、[自社].”会社コード”＝[買掛システム管理].”会社コード”となる
				//レコードが存在しない場合
				if ("1".equals(dataStruct.getINSTALL_FLG())) {
					List debtCtrlList = entity.mSYS_DEBT_CTRL.read(conn, readStruct);
					if (debtCtrlList.size() > 0) {
						AF0130010Struct debtCtrlStruct = (AF0130010Struct)debtCtrlList.get(0);
						dataStruct.setTHIS_MONTH(debtCtrlStruct.getTHIS_MONTH());
					} else {						
						errCode = "AF00142";
						//業務メッセージ用エラーメッセージの格納
						err_commt="(SBM1330)CSV行番号 =　[" + errorNumber + "]";
						writeLog(ERROR,errCode,err_commt);	
						_intErrorCount++;
						continue;
					}
				}	
				//[出庫指示].”出庫先保管区コード”≠Ｎｕｌｌで、「出庫先保管区コード」＝Ｎｕｌｌの場合
				if(!isNull(tIssueinstStruct.getRCV_WH_CD())&& isNull(dataStruct.getRCV_WH_CD())){
					dataStruct.setRCV_WH_CD(tIssueinstStruct.getRCV_WH_CD());
				}
				//[出庫指示].”出庫先保管区コード”＝Ｎｕｌｌで、「出庫先保管区コード」≠Ｎｕｌｌの場合
				if(isNull(tIssueinstStruct.getRCV_WH_CD())&& !isNull(dataStruct.getRCV_WH_CD())){					
					errCode = "AF00138";
					//業務メッセージ用エラーメッセージの格納
					err_commt="(SBM1330)CSV行番号 =　[" + errorNumber + "]";
					writeLog(ERROR,errCode,err_commt);	
					_intErrorCount++;
					continue;
				}
				
				//「出庫先保管区コード」がＮｕｌｌでなく、[保管区] に存在しない場合
				_wh_cd = null;
				_wh_cd =dataStruct.getWH_CD();
				dataStruct.setWH_CD(dataStruct.getRCV_WH_CD());
				List rcvWhList =entity.mselect_M_WH.read(conn, dataStruct);
				dataStruct.setWH_CD(_wh_cd);
				AF0130010Struct rcvWhStruct = new AF0130010Struct();
				if(!isNull(dataStruct.getRCV_WH_CD())){
					if(rcvWhList.isEmpty()){						
						errCode = "AF00031";
						//業務メッセージ用エラーメッセージの格納
						err_commt="(SBM1330)CSV行番号 =　[" + errorNumber + "]";
						writeLog(ERROR,errCode,err_commt);	
						_intErrorCount++;
						continue;
					}else{
						rcvWhStruct =(AF0130010Struct)rcvWhList.get(0);
						//「出庫先保管区コード」の[保管区].“工場コード” と ログインユーザーの工場コード が異なる場合
						if(!rcvWhStruct.getPLANT_CD().equals(getSysPlantCd())){							
							errCode = "AF00032";
							//業務メッセージ用エラーメッセージの格納
							err_commt="(SBM1330)CSV行番号 =　[" + errorNumber + "]";
							writeLog(ERROR,errCode,err_commt);	
							_intErrorCount++;
							continue;
					}
						//「出庫先保管区コード」≠Ｎｕｌｌで
						//「出庫先保管区コード」と一致する[保管区].”所要量計算対象フラグ”＝1:所要量計算対象の場合
						if("1".equals(rcvWhStruct.getMRP_FLG())){							
							errCode = "AF00139";
							//業務メッセージ用エラーメッセージの格納
							err_commt="(SBM1330)CSV行番号 =　[" + errorNumber + "]";
							writeLog(ERROR,errCode,err_commt);	
							_intErrorCount++;
							continue;
					}
						//「出庫先保管区コード」≠Ｎｕｌｌで、[出庫指示].”支給区分”支給区分」＝0：非の場合、
						//「出庫先保管区コード」と一致する[保管区].”取引先”≠Ｎｕｌｌの場合
						if("0".equals(tIssueinstStruct.getCONS_TYP())){
							if(!isNull(rcvWhStruct.getVEND_CD())){								
								errCode = "AF00140";
								//業務メッセージ用エラーメッセージの格納
								err_commt="(SBM1330)CSV行番号 =　[" + errorNumber + "]";
								writeLog(ERROR,errCode,err_commt);	
								_intErrorCount++;
								continue;
						}
					 }else{
						 if(isNull(rcvWhStruct.getVEND_CD())|| isNull(tIssueinstStruct.getVEND_CD())){							 
								errCode = "AF00141";
								//業務メッセージ用エラーメッセージの格納
								err_commt="(SBM1330)CSV行番号 =　[" + errorNumber + "]";
								writeLog(ERROR,errCode,err_commt);	
								_intErrorCount++;
								continue;
						 }else{
								//「出庫先保管区コード」≠Ｎｕｌｌ、[出庫指示].”支給区分”≠0：非の場合、
								//「出庫先保管区コード」と一致する[保管区].”取引先” [出庫指示].”取引先コード”が一致しない場合
								if(!rcvWhStruct.getVEND_CD().equals(tIssueinstStruct.getVEND_CD()) ){									
									errCode = "AF00141";
									//業務メッセージ用エラーメッセージの格納
									err_commt="(SBM1330)CSV行番号 =　[" + errorNumber + "]";
									writeLog(ERROR,errCode,err_commt);	
									_intErrorCount++;
									continue;
								}
						 }
					 }
					}
				}


				//[出庫指示].“出庫品目番号”を基に[品目].”ロット管理フラグ”が「１：ロット管理を行う」場合、「在庫ロット番号」がNullでないまたは「出庫数」が０以外の場合かつ、
				//[ロット管理].”賞味期限”＜ 「出庫日」
				//[パラメータ].” 名前”＝’ BEST_BEFORE_DATE_CHECK_FLG’が2:警告の場合
				if (lotWarningFlg){						
					errCode = "AE05061";
					//業務メッセージ用エラーメッセージの格納
					err_commt="(SBM1330)CSV行番号 =　[" + errorNumber + "]";
					writeLog(WARNING,errCode,err_commt);	
					_intWarningCount++;	
				}	
					// [インストールオプション].” システムオプション識別子” ＝ C* 、[インストールオプション].” システム導入フラグ” ＝ 1:導入、
					//[出庫指示].”支給区分” ＝ 1：有償支給の場合で
					//[自社].”SYSコントロールコード”　＝　SYSTEM、[自社].”会社コード”＝[買掛システム管理].”会社コード”、
					//[買掛システム管理]."当年月度"＞「出庫日」（YYYY/MM）
					if ("1".equals(dataStruct.getINSTALL_FLG())) {
						List debtCtrlList = entity.mSYS_DEBT_CTRL.read(conn, readStruct);
						AF0130010Struct debtCtrlStruct = (AF0130010Struct)debtCtrlList.get(0);
						if ("1".equals(tIssueinstStruct.getCONS_TYP()) && debtCtrlList.size() > 0){
							if(debtCtrlStruct.getTHIS_MONTH().compareTo(dataStruct.getISSUE_DATE())>0){
								
								errCode = "AF00187";
								//業務メッセージ用エラーメッセージの格納
								err_commt="(SBM1330)CSV行番号 =　[" + errorNumber + "]";
								writeLog(WARNING,errCode,err_commt);	
								_intWarningCount++;

							}
							}
						}
					
					BigDecimal decimalIssueQty2 = new BigDecimal("0");
					BigDecimal decimalIssueQty = new BigDecimal(dataStruct.getISSUE_QTY());
					// 出庫数
					//整数管理品目
					decimalIssueQty2 = decimalIssueQty.setScale(0,BigDecimal.ROUND_FLOOR);
					//切り下げ処理前と後で値が異なっていたら小数が入力されていたと判断しワーニングとする
					if (decimalIssueQty.doubleValue() != decimalIssueQty2.doubleValue()){						
						errCode = "AF60004";
						//業務メッセージ用エラーメッセージの格納
						err_commt="(SBM1330)CSV行番号 =　[" + errorNumber + "]";
						writeLog(WARNING,errCode,err_commt);	
						_intWarningCount++;
						
						dataStruct.setISSUE_QTY(decimalIssueQty2.toString());
					}	
					
					//「出庫数」 の値が出庫残数より大きく 「完了フラグ」 の入力値が 未 の場合
					BigDecimal decimalRemainQty = new BigDecimal(tIssueinstStruct.getSHIP_REMAIN_QTY());
					if (decimalIssueQty.doubleValue() > decimalRemainQty.doubleValue())
					{
						if("0".equals(dataStruct.getISSUE_CMPLT_FLG())){							
							errCode = "AF00188";
							//業務メッセージ用エラーメッセージの格納
							err_commt="(SBM1330)CSV行番号 =　[" + errorNumber + "]";
							writeLog(WARNING,errCode,err_commt);	
							_intWarningCount++;

						}
					}
				
					//「出庫数」 の値が出庫残数より小さく 「完了フラグ」 の入力値が 完了 の場合
					if (decimalIssueQty.doubleValue() < decimalRemainQty.doubleValue())
					{
						if("1".equals(dataStruct.getISSUE_CMPLT_FLG())){							
							errCode = "AF00189";
							//業務メッセージ用エラーメッセージの格納
							err_commt="(SBM1330)CSV行番号 =　[" + errorNumber + "]";
							writeLog(WARNING,errCode,err_commt);	
							_intWarningCount++;
						}
					}
			}
			
			if (_intErrorCount > 0) {
				return false;
			} else {
				return true;
			}
		}catch (Exception e) {
			conn.rollback();;
			throw new ExpjException(e);
		}		
	}
	
	/**
	 * CSVファイル（マニュアル出庫実績取込）の内容を登録
	 * @param csvList
	 * @return
	 * @throws FoundationException 
	 */
	private boolean insertCsvDate(List csvList) throws FoundationException, ExpjException {
		try {
			boolean rtnFlg = true;
			conn.beginTransWeb();
			// 全部レコード数
			_intTotalCount = csvList.size();
			//　登録件数
			_intSuccessCount =0;

	        // 出庫実績登録処理を開始しました。
	        writeLog(INFOMATION,"AF80002");

			for (int i = 0; i < csvList.size(); i++) {
				
				AF0130010Struct cvsStruct = (AF0130010Struct)csvList.get(i);
				
				AF0130010Struct tlotcrtl  =new AF0130010Struct();
				List lotctrlflg =entity.mselect_LOT_CTRL_FLG.read(conn, cvsStruct);
				tlotcrtl =(AF0130010Struct)lotctrlflg.get(0);
				
				//ロット管理フラグが0：ロット管理を行わない場合
				if("0".equals(tlotcrtl.getLOT_CTRL_FLG())){
					//在庫ロット番号  null
					cvsStruct.setLOT_NO("");
					
					//製番品の品目在庫未引当分から出庫する場合
					//「製番在庫から出庫する」がOffで 「出庫数」が 品目在庫からの「引当済未出庫数」より大きい場合
					//製番引当の追加・更新
					rtnFlg = insertTjobodralc(cvsStruct, i);
					if(!rtnFlg) {
						conn.rollback();
						//出庫実績登録処理が異常終了しました。
						 writeLog(INFOMATION, "AF80004");
						return false;
						
					}
					//保管区別入出庫] へ追加を行い、取得した 「入出庫管理番号」 をパラメータとして、
					//出庫処理 を呼び出す
					rtnFlg = insert_issue_process(cvsStruct, i);
					if(!rtnFlg) {
						conn.rollback();
						//出庫実績登録処理が異常終了しました。
						 writeLog(INFOMATION, "AF80004");
						return false;
					}
					//有償支給品の場合、有償支給履歴登録
					//工程保管場所または取引先保管区となる出庫先保管区コードへ入庫するため 
					//[保管区別入出庫]に追加し 取得した入出庫管理番号をパラメータとして入庫処理を呼び出す。
					rtnFlg = insert_rcv_process(cvsStruct, i);
					if(!rtnFlg) {
						conn.rollback();
						//出庫実績登録処理が異常終了しました。
						 writeLog(INFOMATION, "AF80004");
						return false;
					}
				}
				if("1".equals(tlotcrtl.getLOT_CTRL_FLG())){
					//メーカロット番号 null
					cvsStruct.setVEND_LOT_NO("");
					//製番 null
					cvsStruct.setJOB_ODR_CD("");
					//保管区別入出庫] へ追加を行い、取得した 「入出庫管理番号」 をパラメータとして、
					//出庫処理 を呼び出す
					rtnFlg = insert_issue_process(cvsStruct, i);
					if(!rtnFlg) {
						conn.rollback();
						//出庫実績登録処理が異常終了しました。
						 writeLog(INFOMATION, "AF80004");
						return false;
					}
					//有償支給品の場合、有償支給履歴登録
					//工程保管場所または取引先保管区となる出庫先保管区コードへ入庫するため 
					//[保管区別入出庫]に追加し 取得した入出庫管理番号をパラメータとして入庫処理を呼び出す。
					rtnFlg = insert_rcv_process(cvsStruct, i);
					if(!rtnFlg) {
						conn.rollback();
						//出庫実績登録処理が異常終了しました。
						 writeLog(INFOMATION, "AF80004");
						return false;
					}
					//ロット別に出庫した情報を、出庫実績明細へ追加する。	
					rtnFlg = insertupTlotissueinst(cvsStruct, i);
					if(!rtnFlg) {
						conn.rollback();
						//出庫実績登録処理が異常終了しました。
						 writeLog(INFOMATION, "AF80004");
						return false;
					}
				}
			}
			//  登録処理が正常に終了した場合
			_intSuccessCount = csvList.size();
	        String succCommt = "(SBM1701)読込件数　=　[" + _intTotalCount + "] "
	        				 + "登録件数　=　[" + _intSuccessCount + "] ";
	        //出庫実績登録処理を正常に終了しました。
	        writeLog(INFOMATION, "AF80003", succCommt);	
			// トランザクションの開始
			conn.beginTransWeb();
			conn.commit();
			return true;
		} catch (Exception e) {
			conn.rollback();
			throw new ExpjException(e);
		}
	}
	
	/**
	 * CSVフェイル内容は、 [製番引当]の追加・更新
	 * @param csvList
	 * @return
	 * @throws FoundationException 
	 */
	private boolean insertTjobodralc (AF0130010Struct adstruct, int m) throws ExpjException {
		// ログ出力情報格納用

		String logMessage = "";
		
		logMessage = "Control : insertTjobodralc"
				+ ", T_ISSUE_INST.ISSUE_INST_CD:" + adstruct.getISSUE_INST_CD();
	  setSyslogConfig(logMessage);
	
	  
		//エラー行番号
		String errorNumber =String.valueOf(m+1);
		//業務メッセージ用エラー行番号
		String err_commt ="";

		boolean jobOdrAlcFlg = false;
		try {
			IssueRemain issueRemain = new IssueRemain(conn);
			
			AF0130010Struct readStruct = new AF0130010Struct();
			readStruct.setw_ISSUE_INST_CD(adstruct.getISSUE_INST_CD());
			readStruct.setw_WS_CD((String)null);
			readStruct.setw_VEND_CD((String)null);
			readStruct.setw_ISSUE_CMPLT_FLG((String)null);
			readStruct.setw_LOT_CTRL_FLG((String)null);
			readStruct.setw_PLANT_CD((String)null);

			List tmpList = entity.mselect_T_ISSUE_INST1.read(conn, adstruct);
			AF0130010Struct issueInstStruct = (AF0130010Struct)tmpList.get(0);
			
			//[品目]からの「品目手配区分」のデータを定義
			AF0130010Struct tlotcrtl  =new AF0130010Struct();
			List lotctrlflg =entity.mselect_LOT_CTRL_FLG.read(conn, adstruct);
			tlotcrtl =(AF0130010Struct)lotctrlflg.get(0);
			
			//引当済未出庫数を取得
			struct.setALC_NOISSUE_QTY(
					issueRemain.getRemainQtyByItem(issueInstStruct.getOD_NO()).toString());
			//製番品の品目在庫未引当分から出庫する場合
			//「製番」がnullで 「出庫数」が 品目在庫からの「引当済未出庫数」より大きい場合は、
			//以下のレコードが存在すれば、更新する。存在する場合、登録する。
			//[製番引当]．"オーダデマンド番号" ＝ [出庫指示]．オーダデマンド番号
			//[製番引当]．"引当在庫区分" ＝ 1：品目在庫

			if(isNull(adstruct.getJOB_ODR_CD())
					&& Calculate.compare(adstruct.getISSUE_QTY(), struct.getALC_NOISSUE_QTY()) == 1 ){
				if(("1".equals(tlotcrtl.getMRP_ODR_TYP()) || "2".equals(tlotcrtl.getMRP_ODR_TYP()))){
					
					// 出庫指示情報クラスに情報をセット
					IssueInstStruct issueInstforStruct = new IssueInstStruct();
					issueInstforStruct.m_OD_NO = issueInstStruct.getOD_NO();
					issueInstforStruct.m_PLANT_CD = getSysPlantCd();
					issueInstforStruct.m_ITEM_CD = issueInstStruct.getITEM_CD();
					
					// 更新情報クラスに情報をセット
					UpdateInfo updateInfo = new UpdateInfo(getSysPlantCd(), this.getSysProgramId(), 0);
					
					// [製番引当]の追加・更新
					(new JobOdrAlc(conn)).updateAlcQty(issueInstforStruct,
							new BigDecimal(adstruct.getISSUE_QTY()), updateInfo);
					jobOdrAlcFlg = true;;
					
					// [製番引当]を更新した場合
					if(jobOdrAlcFlg){
						errCode = "AD60002";
						//業務メッセージ用エラーメッセージの格納
						err_commt="(SBM1330)CSV行番号 =　[" + errorNumber + "]";
						writeLog(WARNING,errCode,err_commt);	
						_intWarningCount++;
					}
				}
				}
		}catch(Exception e) {
			throw new ExpjException(e);
		}
		return true;
	}
	//---------- 出庫処理ＤＢ登録処理（親画面、子画面で共通使用の為）） --------------------
	/**
	 * 親画面の登録ボタンと子画面の登録ボタンから共通に呼び出される処理です。
	 *
	 * @return (true:正常終了  false:異常終了）
	 */
	private boolean insert_issue_process(AF0130010Struct adstruct, int n) throws BusinessProcessException, FoundationException, SQLException
	{
		// ログ出力情報格納用
		String logMessage = "";
		String message1 = "";
		List listMessage = new ArrayList();
		

		logMessage = "Control : insert_issue_process"
					+ ", T_ISSUE_INST.ISSUE_INST_CD:" + adstruct.getISSUE_INST_CD();
		setSyslogConfig(logMessage);
		
		//エラー行番号
		String errorNumber =String.valueOf(n+1);
		
		//業務メッセージ用エラー行番号
		String err_commt ="";

			//----------------------------------------------------------
			// 保管区別入出庫（出庫）登録
			//----------------------------------------------------------
			// 入出庫管理番号採番（出庫）
			_ctrlCd = null;

			try{
				Numbering MyNo = new Numbering(conn,CollectNumber.ISSUE_CD,getSysUserCd(),getSysProgramId(),getSysPlantCd());
				_ctrlCd = MyNo.getNo();
				if(_ctrlCd == null || _ctrlCd.length() == 0){
					// 採番結果がない
					errCode = "AF00057";
					//業務メッセージ用エラーメッセージの格納
					err_commt="(SBM1330)CSV行番号 =　[" + errorNumber + "]";
					writeLog(ERROR,errCode,err_commt);	
					_intErrorCount++;
					return false;
				}
			}
			catch(FoundationException ex){
				// 登録処理失敗：入出庫管理番号（出庫）の採番に失敗しました				
				errCode = "AF00057";
				//業務メッセージ用エラーメッセージの格納
				err_commt="(SBM1330)CSV行番号 =　[" + errorNumber + "]";
				writeLog(ERROR,errCode,err_commt);	
				_intErrorCount++;
				return false;
			}
			AF0130010Struct readStruct = new AF0130010Struct();
			List tmpList = entity.mselect_T_ISSUE_INST1.read(conn, adstruct);
			if (!tmpList.isEmpty()) {
		    readStruct = (AF0130010Struct)tmpList.get(0);
		    
			// 入出庫管理番号
		    readStruct.setRCV_ISSUE_CTRL_CD(_ctrlCd);
			//製番
		    readStruct.setJOB_ODR_CD(adstruct.getJOB_ODR_CD());
			// 出庫保管区
		    readStruct.settmp_WH_CD(adstruct.getWH_CD());
		    //工場コード
		    readStruct.setPLANT_CD(getSysPlantCd());
			// 出庫数
		    readStruct.settmp_RCV_ISSUE_QTY(Calculate.multiply(adstruct.getISSUE_QTY(), "-1"));
		    //入出庫年月日
		    readStruct.setRCV_ISSUE_DATE(adstruct.getISSUE_DATE());
			// 入出庫完了フラグ
		    readStruct.setRCV_ISSUE_CMPLT_FLG(adstruct.getISSUE_CMPLT_FLG());
			// 入出庫区分（2:出庫）
		    readStruct.setRCV_ISSUE_TYP(new Integer(2));
			// 入出庫発生区分（21:通常出庫）
		    readStruct.setRCV_ISSUE_GNR_TYP(new Integer(21));
			// 在庫更新区分（1:未）
		    readStruct.setSTOCK_UPD_TYP(new Integer(1));
		    //メーカロット番号
		    readStruct.setVEND_LOT_NO(adstruct.getVEND_LOT_NO());
		  //在庫ロット番号
		   readStruct.setw_STOCK_LOT_CD(adstruct.getLOT_NO());

			logMessage = "T_RCV_ISSUE.RCV_ISSUE_CTRL_CD:" + readStruct.getRCV_ISSUE_CTRL_CD()
						+ ", T_RCV_ISSUE.JOB_ODR_CD:" + readStruct.getw_JOB_ODR_CD()
						+ ", T_RCV_ISSUE.ITEM_CD:" + readStruct.getITEM_CD()
						+ ", T_RCV_ISSUE.WH_CD:" + readStruct.getWH_CD()
						+ ", T_RCV_ISSUE.RCV_ISSUE_DATE:" + readStruct.getRCV_ISSUE_DATE()
						+ ", T_RCV_ISSUE.RCV_ISSUE_QTY:" + readStruct.gettmp_RCV_ISSUE_QTY();
			setSyslogConfig(logMessage);
						readStruct.setsUser_ID(getSysUserCd());
			// 保管区別入出庫（出庫）登録
			entity.minsertSub1T_RCV_ISSUE.create(conn, readStruct);

			// [出庫処理]呼出し
			IssueProcess issuePrc = new IssueProcess(conn, _ctrlCd);
			try{
				if(issuePrc.execProcess() == true){
					// 更新ＯＫ
					logMessage = "Issue Process was Complated!";
					setSyslogConfig(logMessage);
				}
				else {
					// 更新エラー
					logMessage = "Issue Process was Failed...";
					setSyslogConfig(logMessage);
					return false;
				}
			} finally {
				// 更新結果メッセージ表示
				logMessage = "T_ISSUE_INST.ISSUE_INST_CD:" + struct.getISSUE_INST_CD();
				for(int idx = 0; idx < issuePrc.getErrorList().size(); idx++){
					message1 = message1 + "," + new ExpjMessage(issuePrc.getErrorList().get(idx).toString());
				}
				if (!isNull(message1)) {
					message1 = message1.substring(1);					
					errCode = "ZZ01006";
					//業務メッセージ用エラーメッセージの格納
					err_commt="(SBM1330)CSV行番号 =　[" + errorNumber + "]";
					writeLog(ERROR,errCode,err_commt);	
					_intErrorCount++;
				}
				
				message1 = "";
				for(int idx = 0; idx < issuePrc.getWarnList().size(); idx++){
					message1 = message1 + "," + new ExpjMessage(issuePrc.getWarnList().get(idx).toString());
				}
				if (!isNull(message1)) {
					message1 = message1.substring(1);					
					errCode = "ZZ01006";
					//業務メッセージ用エラーメッセージの格納
					err_commt="(SBM1330)CSV行番号 =　[" + errorNumber + "]";
					writeLog(WARNING,errCode,err_commt);	
					_intWarningCount++;

				}
			}
		}

			return true;
	}
	
	//---------- 入庫処理ＤＢ登録処理（親画面、子画面で共通使用の為）） --------------------
	/**
	 * 親画面の登録ボタンと子画面の登録ボタンから共通に呼び出される処理です。
	 *
	 * @return (true:正常終了  false:異常終了）
	 */
	private boolean insert_rcv_process(AF0130010Struct adstruct, int j) throws BusinessProcessException, FoundationException, SQLException
	{
		// ログ出力情報格納用
		String logMessage = "";
		String message1 = "";
		List listMessage = new ArrayList();
		
		logMessage = "Control : insert_rcv_process"
					+ ", T_ISSUE_INST.ISSUE_INST_CD:" + adstruct.getISSUE_INST_CD();
		setSyslogConfig(logMessage);
		
		//エラー行番号
		String errorNumber =String.valueOf(j+1);
		//業務メッセージ用エラー行番号
		String err_commt ="";

			//----------------------------------------------------------
			// 有償支給品の場合、有償支給履歴登録
			//----------------------------------------------------------
			
		AF0130010Struct readStruct = new AF0130010Struct();
		List tpList = entity.mselect_T_ISSUE_INST1.read(conn, adstruct);
		if (!tpList.isEmpty()) {
	    readStruct = (AF0130010Struct)tpList.get(0);
	    //出庫指示の支給区分が1(有償支給)の時
			if ("1".equals(readStruct.getCONS_TYP())) {

				logMessage = "M_CONS_UNIT_COST.ITEM_CD:" +  readStruct.getITEM_CD()
							+ ", M_CONS_UNIT_COST.VEND_CD:" +  readStruct.getVEND_CD()
							+ ", M_CONS_UNIT_COST.COMPANY_CD:" +  readStruct.getCOMPANY_CD()
							+ ", T_ISSUE_INST.EFF_PHASE_IN_DATE:" + readStruct.getRCV_ISSUE_DATE();
				setSyslogConfig(logMessage);
				//支給単価の取得
				List tmpList = entity.mmselectM_COST.read(conn, adstruct);
				if(tmpList.size() <= 0) {
					readStruct.setUNIT_COST(new String("0"));
					readStruct.setUNIT_COST_TYP(new Integer(1));
				}
				else{
					AF0130010Struct workStruct = (AF0130010Struct)tmpList.get(0);
					logMessage = "M_CONS_UNIT_COST.ONEROUS_FLG:" +  workStruct.getONEROUS_FLG()
								+ ", M_CONS_UNIT_COST.UNIT_COST:" +  workStruct.getUNIT_COST()
								+ ", M_CONS_UNIT_COST.UNIT_COST_TYP:" +  workStruct.getUNIT_COST_TYP();
					setSyslogConfig(logMessage);
					// 支給単価の有償フラグ＝1(有償)の時、有償単価セット
					if(("1").equals(workStruct.getONEROUS_FLG()) == true){
						readStruct.setUNIT_COST(workStruct.getUNIT_COST());
						readStruct.setUNIT_COST_TYP(workStruct.getUNIT_COST_TYP());
					}
					else{
						readStruct.setUNIT_COST(new String("0"));
						readStruct.setUNIT_COST_TYP(new Integer(1));
					}
				}

				// 有償支給番号採番
				String ctrlCd = null;

				try{
					Numbering MyNo = new Numbering(conn,CollectNumber.ONERCONS_CD,getSysUserCd(),getSysProgramId(),getSysPlantCd());
					ctrlCd = MyNo.getNo();

					if(ctrlCd == null || ctrlCd.length() == 0){
						// 採番結果がない
						errCode = "AF00078";
						//業務メッセージ用エラーメッセージの格納
						err_commt="(SBM1330)CSV行番号 =　[" + errorNumber + "]";
						writeLog(ERROR,errCode,err_commt);	
						_intErrorCount++;
						return false;
					}
				}
				catch(FoundationException ex){
					// 登録処理失敗：有償支給番号の採番に失敗しました
					
					errCode = "AF00078";
					//業務メッセージ用エラーメッセージの格納
					err_commt="(SBM1330)CSV行番号 =　[" + errorNumber + "]";
					writeLog(ERROR,errCode,err_commt);	
					_intErrorCount++;
					return false;
				}
				
				// 有償支給番号
				readStruct.setONEROUS_CONS_NO(ctrlCd);
				// 出庫数
				readStruct.setRCV_ISSUE_QTY(adstruct.getISSUE_QTY());
				//出庫日
				readStruct.setRCV_ISSUE_DATE(adstruct.getISSUE_DATE());
				// 製番
				readStruct.setJOB_ODR_CD(adstruct.getJOB_ODR_CD());
				//メーカロット番号
				readStruct.setVEND_LOT_NO(adstruct.getVEND_LOT_NO());
				// 返品先保管区コード
				readStruct.setRETURNED_WH_CD("");
				// 入出庫管理番号
				readStruct.setRCV_ISSUE_CTRL_CD(_ctrlCd);
				//在庫ロット番号
			    readStruct.setSTOCK_LOT_CD(adstruct.getLOT_NO());

				logMessage = "T_PAST_ONEROUS_CONS.ONEROUS_CONS_NO:" + readStruct.getONEROUS_CONS_NO()
							+ ",T_PAST_ONEROUS_CONS.JOB_ODR_CD:" + readStruct.getw_JOB_ODR_CD()
							+ ", T_PAST_ONEROUS_CONS.ITEM_CD:" + readStruct.getITEM_CD()
							+ ", T_PAST_ONEROUS_CONS.VEND_CD:" + readStruct.getVEND_CD()
							+ ", T_PAST_ONEROUS_CONS.ISSUE_DATE:" + readStruct.getRCV_ISSUE_DATE()
							+ ", T_PAST_ONEROUS_CONS.ISSUE_QTY:" + readStruct.gettmp_RCV_ISSUE_QTY();
				setSyslogConfig(logMessage);
				readStruct.setsUser_ID(getSysUserCd());
				// 有償支給履歴登録
				entity.minsertSub1T_PAST_ONEROUS_CONS.create(conn, readStruct);
			}
		  }
			if (readStruct.getRCV_WH_CD() != null && "".equals(readStruct.getRCV_WH_CD()) == false) {
			//----------------------------------------------------------
			// 保管区別入出庫（入庫）登録
			//----------------------------------------------------------
				// 入出庫管理番号採番（入庫）
				String ctrlCd = null;

				try{
					Numbering MyNo = new Numbering(conn,CollectNumber.ISSUE_CD,getSysUserCd(),getSysProgramId(),getSysPlantCd());
					ctrlCd = MyNo.getNo();

					if(ctrlCd == null || ctrlCd.length() == 0){
						// 採番結果がない						
						errCode = "AF00057";
						//業務メッセージ用エラーメッセージの格納
						err_commt="(SBM1330)CSV行番号 =　[" + errorNumber + "]";
						writeLog(ERROR,errCode,err_commt);	
						_intErrorCount++;
						return false;
					}
				}
				catch(FoundationException ex){
					// 採番結果がない					
					errCode = "AF00057";
					//業務メッセージ用エラーメッセージの格納
					err_commt="(SBM1330)CSV行番号 =　[" + errorNumber + "]";
					writeLog(ERROR,errCode,err_commt);	
					_intErrorCount++;
					return false;
				}

				// 入出庫管理番号
				readStruct.setRCV_ISSUE_CTRL_CD(ctrlCd);
				// 入庫保管区
				readStruct.settmp_WH_CD(adstruct.getRCV_WH_CD());
				//製番
				List mitemList =entity.mselect_LOT_CTRL_FLG.read(conn, readStruct);
				AF0130010Struct mitemStruct =(AF0130010Struct)mitemList.get(0);
				//品目の品目手配区分が 1：製番、2：在庫引当型製番の場合
				//[出庫指示].“製番” ,上記以外 Null
				if(!"1".equals(mitemStruct.getMRP_ODR_TYP()) && 
						!"2".equals(mitemStruct.getMRP_ODR_TYP())){
					readStruct.setJOB_ODR_CD("");
				}
				else{
					readStruct.setJOB_ODR_CD(adstruct.getJOB_ODR_CD());
				}
				//入出庫年月日
			    readStruct.setRCV_ISSUE_DATE(adstruct.getISSUE_DATE());
				// 入庫数
				readStruct.settmp_RCV_ISSUE_QTY(adstruct.getISSUE_QTY());
			    //メーカロット番号
			    readStruct.setVEND_LOT_NO(adstruct.getVEND_LOT_NO());
			    //在庫ロット番号
			    readStruct.setw_STOCK_LOT_CD(adstruct.getLOT_NO());
			    
				// 入出庫完了フラグ
				readStruct.setRCV_ISSUE_CMPLT_FLG(adstruct.getISSUE_CMPLT_FLG());
				// 入出庫区分（1:入庫）
				readStruct.setRCV_ISSUE_TYP(new Integer(1));
				if ("0".equals(readStruct.getCONS_TYP())) {
					// 入出庫発生区分（61:工程在庫入庫）
					readStruct.setRCV_ISSUE_GNR_TYP(new Integer(61));
				} else {
					// 入出庫発生区分（81:取引先在庫入庫）
					readStruct.setRCV_ISSUE_GNR_TYP(new Integer(81));
				}
				// 在庫更新区分（1:未）
				readStruct.setSTOCK_UPD_TYP(new Integer(1));
	            //会社コード
				logMessage = "T_RCV_ISSUE.RCV_ISSUE_CTRL_CD:" + readStruct.getRCV_ISSUE_CTRL_CD()
							+ ", T_RCV_ISSUE.JOB_ODR_CD:" + readStruct.getw_JOB_ODR_CD()
							+ ", T_RCV_ISSUE.ITEM_CD:" + readStruct.getITEM_CD()
							+ ", T_RCV_ISSUE.WH_CD:" + readStruct.getWH_CD()
							+ ", T_RCV_ISSUE.RCV_ISSUE_DATE:" + readStruct.getRCV_ISSUE_DATE()
							+ ", T_RCV_ISSUE.RCV_ISSUE_QTY:" + readStruct.gettmp_RCV_ISSUE_QTY();
				setSyslogConfig(logMessage);
				
				//ユーザ名
				readStruct.setsUser_ID(getSysUserCd());
				// [出庫指示]."製番"を登録するための退避
				String saveJobOdrCd = readStruct.getw_JOB_ODR_CD();
				readStruct.setw_JOB_ODR_CD(readStruct.getJOB_ODR_CD());

				// 保管区別入出庫（入庫）登録
				entity.minsertSub1T_RCV_ISSUE.create(conn, readStruct);

				// 退避した製番を戻す
				struct.setw_JOB_ODR_CD(saveJobOdrCd);

				// [入庫処理]呼出し
				RcvProcess rcvPrc = new RcvProcess(conn, ctrlCd);
				try{
					if(rcvPrc.execProcess() == true){
						// 更新ＯＫ
						logMessage = "Rcv Process was Complated!";
						setSyslogConfig(logMessage);
					}
					else {
						// 更新エラー
						logMessage = "Rcv Process was Failed...";
						setSyslogConfig(logMessage);
						return false;
					}
				} finally {
					// 更新結果メッセージ表示
					logMessage = "T_ISSUE_INST.ISSUE_INST_CD:" + struct.getISSUE_INST_CD();
					
					for(int idx = 0; idx < rcvPrc.getErrorList().size(); idx++){
						message1 = message1 + "," + new ExpjMessage(rcvPrc.getErrorList().get(idx).toString());
					}
					if (!isNull(message1)) {
						message1 = message1.substring(1);						
						errCode = "ZZ01006";
						//業務メッセージ用エラーメッセージの格納
						err_commt="(SBM1330)CSV行番号 =　[" + errorNumber + "]";
						writeLog(ERROR,errCode,err_commt);	
						_intErrorCount++;
					}
					message1 = "";
					for(int idx = 0; idx < rcvPrc.getWarnList().size(); idx++){
						message1 = message1 + "," + new ExpjMessage(rcvPrc.getWarnList().get(idx).toString());
					}
					if (!isNull(message1)) {
						message1 = message1.substring(1);
						errCode = "ZZ01006";
						//業務メッセージ用エラーメッセージの格納
						err_commt="(SBM1330)CSV行番号 =　[" + errorNumber + "]";
						writeLog(WARNING,errCode,err_commt);	
						_intWarningCount++;
					}
				}
			}	
			return true;
	}
	
	/**
	 * ロット別に出庫した情報を、出庫実績明細へ追加する。
	 *
	 */
	public boolean insertupTlotissueinst(AF0130010Struct adstruct, int k) throws  BusinessProcessException, FoundationException, SQLException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0130");
		logger.entering("AF0130010Control"+":USER="+getSysUserCd(),"insertupTlotissueinst");
			//{{user_implement_dev:<controlBrowse>
			// TODO: ユーザ定義のコードを記述してください
		// 出庫実績明細への登録
		// 出庫数が０の場合は、登録・更新を行わない
		  if (adstruct.getISSUE_QTY() != null 
				&& !"".equals(adstruct.getISSUE_QTY())
				&& Calculate.compare(adstruct.getISSUE_QTY(), "0") != 0) {
			  
			 AF0130010Struct readStruct = new AF0130010Struct();
			List tpList = entity.mselect_T_ISSUE_INST1.read(conn, adstruct);
			//  データが存在しない場合登録、存在する場合更新
			List lockList = entity.mT_LOT_ISSUE_INST_Lock.read(conn, adstruct);
			if (lockList.size() <= 0) {
				readStruct=(AF0130010Struct)tpList.get(0);
				//在庫ロット番号
				readStruct.setLOT_NO(adstruct.getLOT_NO());
				//readStruct.setw_STOCK_LOT_CD(adstruct.getLOT_NO());
				//出庫実績数量
				readStruct.setRCV_ISSUE_QTY((adstruct.getISSUE_QTY()));
				//出庫実績日
				readStruct.setRCV_ISSUE_DATE(adstruct.getISSUE_DATE());
				//ユーザ名
				readStruct.setsUser_ID(getSysUserCd());
				//登録
				entity.mT_LOT_ISSUE_INST.create(conn, readStruct);

			} else {
				AF0130010Struct lockStruct = new AF0130010Struct();
				lockStruct = (AF0130010Struct)lockList.get(0);
				// 出庫実績数量の計算
				//  [出庫実績明細]."出庫実績数" + 画面「出庫数」 
				String rcvIssueQty = "0";
				rcvIssueQty = Calculate.add(
						lockStruct.getISSUE_QTY(),
						adstruct.getISSUE_QTY());
				struct.setISSUE_QTY(rcvIssueQty);
				//出庫日
				struct.setRCV_ISSUE_DATE(adstruct.getISSUE_DATE());
				//在庫ロット番号
				struct.setLOT_NO(adstruct.getLOT_NO());
				//出庫指示番号
				struct.setISSUE_INST_CD(adstruct.getISSUE_INST_CD());
				//ユーザ名
				struct.setsUser_ID(getSysUserCd());
				
				entity.mT_LOT_ISSUE_INST.update(conn, struct);
			}
			
		}
		 // return true;
                //}}user_implement_dev:<controlBrowse>
		logger.exiting("AF0130010Control"+":USER="+getSysUserCd(),"insertupTlotissueinst");
		return true;

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
			m_med.setFUNCTION_NAME("SQLMANISSUEINSTINTERFACE");
			
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
			callList = m_med.getSQLMANISSUEINSTINTERFACE().call();
			// PL/SQLの実行結果を取得
			medAF0130B001 resultMed = (medAF0130B001) callList.get(0);
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
			
			// [マニュアル出庫実績取込]のデータを取得
			
			List listTManIssueInstTemp = new ArrayList();
			listTManIssueInstTemp = selectTManIssueInstTemp();
			
			
			// [マニュアル出庫実績取込]のデータを取得成功
			if (listTManIssueInstTemp != null) {
				//マスタ整合性チェック実施
				if(check_listTManIssueInstTemp(listTManIssueInstTemp)){
	             // 登録処理
					if(insertCsvDate(listTManIssueInstTemp)) {
						// 終了ログ
						writeLog(INFOMATION, "ZZ09002");
					}        
				}else {
					writeLog(INFOMATION, "ZZ09002");
					return BREAK;
				}	
			}
			
			
			
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
				
				// 発注計画取込の削除
			    m_med.getdeleteT_MAN_ISSUE_INST_TEMP().delete();
				// トランザクションの開始
				conn.beginTransWeb();
			    conn.commit();
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
		try {
			entity = new AF0130010Entity();
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
		public medAF0130B001 m_med=null;

		/**
		 * コンテナクラスインスタンス
		 */
		public ManageContainer m_container=null;

		//////////////////////////////

		public interControl(medAF0130B001 med) throws BatchAppException
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
