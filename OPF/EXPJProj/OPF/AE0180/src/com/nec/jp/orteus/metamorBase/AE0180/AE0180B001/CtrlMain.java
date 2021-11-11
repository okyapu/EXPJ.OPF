/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AE0180/src/com/nec/jp/orteus/metamorBase/AE0180/AE0180B001/CtrlMain.java,v $
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

package com.nec.jp.orteus.metamorBase.AE0180.AE0180B001;

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
import com.nec.jp.orteus.metamorBase.AE0180.AE0180010Entity;
import com.nec.jp.orteus.metamorBase.AE0180.AE0180010Struct;
import com.nec.jp.orteus.metamorBase.common01.util.Calculate;
import com.nec.jp.orteus.metamorBase.common04.amount.AmountCalculator;
import com.nec.jp.orteus.metamorBase.common04.amount.CurControl;
import com.nec.jp.orteus.metamorBase.common04.amount.CurStruct;
import com.nec.jp.orteus.metamorBase.common04.amount.ExchRateControl;
import com.nec.jp.orteus.metamorBase.common04.amount.ExchRateStruct;
import com.nec.jp.orteus.metamorBase.common04.amount.PuchUnitCostControl;
import com.nec.jp.orteus.metamorBase.common04.amount.PuchUnitCostStruct;
import com.nec.jp.orteus.metamorBase.common04.amount.TaxControl;
import com.nec.jp.orteus.metamorBase.common04.amount.TaxStruct;
import com.nec.jp.orteus.metamorBase.common04.sysdata.DateCtrlControl;
import com.nec.jp.orteus.metamorBase.common04.sysdata.DateCtrlStruct;
import com.nec.jp.orteus.metamorBase.common04.sysdata.HomeCurControl;
import com.nec.jp.orteus.metamorBase.common04.sysdata.HomeCurStruct;
import com.nec.jp.orteus.metamorBase.common04.util.DataNotFoundException;
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessage;
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessageAccessor;
import com.nec.jp.orteus.expj.util.ATAspBom;
import com.nec.jp.orteus.expj.util.ATCommonOd;
import com.nec.jp.orteus.expj.util.ATWorkCalendar;
import com.nec.jp.orteus.expj.util.CommonOd;
import com.nec.jp.orteus.expj.util.Converter;
import com.nec.jp.orteus.expj.util.DateTool;
import com.nec.jp.orteus.expj.util.ExpjMessage;
import com.nec.jp.orteus.expj.util.ExpjException;
import com.nec.jp.orteus.expj.util.Numbering;
import com.nec.jp.orteus.expj.util.ScreenParam;
import com.nec.jp.orteus.expj.util.SystemInformation;
import com.nec.jp.orteus.expj.util.WorkCalendar;
import java.util.Date;
import com.nec.jp.orteus.xaf.wa.BusinessProcessException;
//}}user_implement_dev:import

/**
 * CLASS     : CtrlMain クラス
 * ファイル・クラス説明
 * @author $Author: shan-xiuqin $
 * @version $Revision: 1.5 $ $Date: 2016/05/23 08:15:51 $
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
	public medAE0180B001 m_med=null;

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
	public CtrlMain(medAE0180B001 med, BatchAppConductor cdr) throws BatchAppException
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
	public CtrlMain(medAE0180B001 med) throws BatchAppException
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
    
	/** 入力品目存在確認フラグ */
	private boolean _Itemflg = true;
	
	/** EJa-ASPROVA連携オプション導入フラグ取得用 */
	private String _SysInstallOptions_ASP = null;
		
	private boolean warningFlg = false;
	
	/*会社コード*/
	public String _company_cd = null;
	/** [邦貨]情報 */
    private HomeCurStruct _homeCurStruct = new HomeCurStruct();
	

    /**AE0180 entity*/
    AE0180010Struct struct = null;
	protected AE0180010Entity entity;
	
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


	/**
	 * 発注計画取込データ取得
     * @return	puchOrdList     発注計画取込リスト
	 * @throws BatchAppException 
	 */
	private List selectTPuchOdrTemp() throws BatchAppException {
		List rtnList = new ArrayList();
		AE0180010Struct structdata = null;
		m_med.getT_PUCH_ODR_TEMP().read();
		while(m_med.getT_PUCH_ODR_TEMP().next()) {
			structdata = new AE0180010Struct();			
			structdata.setITEM_CD(m_med.getITEM_CD());
			structdata.setPUCH_ODR_DLV_DATE(m_med.getPUCH_ODR_DLV_DATE());
			structdata.setPUCH_ODR_START_DATE(m_med.getPUCH_ODR_START_DATE());
			structdata.setPUCH_ODR_QTY(m_med.getPUCH_ODR_QTY());
			structdata.setVEND_CD(m_med.getVEND_CD());
			structdata.setJOB_ODR_CD(m_med.getJOB_ODR_CD());
			structdata.setCONFIRM_DLV_DATE(m_med.getCONFIRM_DLV_DATE());
			structdata.setWH_CD(m_med.getWH_CD());
			structdata.setPUCH_ODR_COMMENT(m_med.getPUCH_ODR_COMMENT());
			structdata.setNON_NO_ITEM_FLG(m_med.getNON_NO_ITEM_FLG());
			structdata.setNON_NO_ITEM_NAME(m_med.getNON_NO_ITEM_NAME());
			structdata.setNON_NO_ITEM_TYP(m_med.getNON_NO_ITEM_TYP());
			structdata.setNON_NO_ITEM_PUCH_ODR_UNIT(m_med.getNON_NO_ITEM_PUCH_ODR_UNIT());
			structdata.setUNIT_COST_TYP(m_med.getUNIT_COST_TYP());
			structdata.setUNIT_COST(m_med.getUNIT_COST());
			structdata.setPROCESSING_COST(m_med.getPROCESSING_COST());
			structdata.setMATERIAL_COST(m_med.getMATERIAL_COST());
			structdata.setOTHER_OVERHEADS(m_med.getOTHER_OVERHEADS());
			structdata.setNET_AMOUNT(m_med.getNET_AMOUNT());
			structdata.setEXCH_RATE(m_med.getEXCH_RATE());
			structdata.setACCT_CD(m_med.getACCT_CD());
			structdata.setDEPT_CD(m_med.getDEPT_CD());
			structdata.setPJ_CD(m_med.getPJ_CD());
			structdata.setSEG_CONTENTS1(m_med.getSEG_CONTENTS1());
			structdata.setSEG_CONTENTS2(m_med.getSEG_CONTENTS2());
			structdata.setSEG_CONTENTS3(m_med.getSEG_CONTENTS3());
			structdata.setSEG_CONTENTS4(m_med.getSEG_CONTENTS4());
			
			rtnList.add(structdata);
		}
		return rtnList;
	}
		
	/**
     * 稼働日チェック処理を日付文字列で使えるようにした委譲メソッドです。
     * @param dateString 日付文字列
     * @return 稼働日の場合は true、 非稼働日の場合はfalseを返します。
     * @throws FoundationException  共通部品処理で失敗
     * @throws ParseException 型変換に失敗
     */
    private boolean isWorkDay(String dateString ,String itemCd) throws FoundationException, ParseException {
    	
     Date date = Converter.strToDate(dateString, "yyyy/MM/dd");
   
     // 稼働日共通部品を生成し、チェック処理を実行
     WorkCalendar wc;
     if(!_Itemflg){
     	wc = new WorkCalendar(conn, getSysUserCd(), getSysProgramId(), this.getSysPlantCd(),itemCd, date);
     }else{
     	wc = new WorkCalendar(conn, getSysUserCd(), getSysProgramId(), this.getSysPlantCd(), date);
     }
     boolean reslt = wc.isWorkDate();
     return reslt;
    }
    
    /**
     * 稼働日演算処理を日付文字列で使えるようにした委譲メソッドです。
     * @param dateString 日付文字列
     * @return 演算結果の日付文字列
     * @throws FoundationException 共通部品処理で失敗
     * @throws ParseException 型変換に失敗
     */
    private String calcWorkDay(String dateString, String timeString, String ltString, boolean flg, String itemCd)
     throws FoundationException, ParseException {

     // 渡されてきた時刻をhh24:mi:ss形式に整える
     timeString = timeString.substring(0,2) + ":" + timeString.substring(2) + ":00";

     // 引数の年月日と形式を整えた時刻を結合し、日付型に変換する
     Date date = Converter.strToDate(dateString + " " + timeString, "yyyy/MM/dd HH:mm:ss");
     int lt = Integer.parseInt(ltString);
   
     // 稼働日共通部品を生成し、チェック処理を実行
     WorkCalendar wc =
      new WorkCalendar(conn, getSysUserCd(), getSysProgramId(), this.getSysPlantCd(),itemCd, date, lt, flg);
     Date resultDate = wc.calcDate();

     if (resultDate == null || "".equals(resultDate)){
    	 return ""; 
     }
     // 自動算出された日付を文字型に変換して保持する
     String tidydate = Converter.dateToStr(resultDate, "yyyy/MM/dd HH:mm:ss");

     // 自動算出された日付をyyyy/mm/dd hh24mi形式に整える
     tidydate = tidydate.substring(0,10) + tidydate.substring(11,13) + tidydate.substring(14,16);

     //return df.format(tidydate);
     return tidydate;
    }
	
	//---------- 日付変換 -------------------------------------------
	public Date StrngToDt(String in){
		Date out = null;
		SimpleDateFormat fm = new SimpleDateFormat("yyyy/MM/dd HH:mm");
		if(in == null) return out;
		try{
			if((out = fm.parse(in)) != null) return out;
		}catch(ParseException e){}
		return out;
	}
	
	public String DtGetDate(Date in)
	{
		SimpleDateFormat fm = new SimpleDateFormat("yyyy/MM/dd");
		if(in == null) return null;
		return fm.format(in);
	}
    
	/**
	 * 数値範囲チェック
	 * 
	 * @param strI	ing
	 *            数値
	 * @param integerSize
	 *            整数位数
	 * @param decimalSize
	 *            小数位数
	 * @return 正常:true / エラー:false
	 */
	public boolean isNotInNumRange(String strInString, int integerSize, int decimalSize) {

		String strInputString = null;
		// マイナスの場合
		if (strInString.indexOf("-") == 0) {
			strInputString = strInString.substring(1);
		} else {
			// 正数の場合
			strInputString = strInString;
		}
		int toneFlg = strInputString.indexOf('.');
		if (toneFlg == -1) {
			// 整数の場合
			if (strInputString.length() > integerSize) {
				return false;
			}
		} else {
			if (decimalSize == 0 && toneFlg == integerSize) {
				return false;
			}
			if (strInputString.length() > decimalSize + integerSize + 1) {
				return false;
			}
			// 整数
			String zhstr = strInputString.substring(0, toneFlg);
			// 小数
			String xistr = strInputString.substring(toneFlg + 1, strInputString.length());
			if (zhstr.length() > integerSize || xistr.length() > decimalSize) {
				return false;
			}
		}
		return true;
	}
	
    
	/**
	 * 発注計画取込データのマスタ整合性チェック
	 * @param dataList
	 * @return
	 * @throws BusinessProcessException
	 * @throws FoundationException
	 */
	private boolean check_listTPuchOdrTemp(List dataList) throws Exception{
		// 全部レコード数
		_intTotalCount = dataList.size();
		AE0180010Struct dataStruct = new AE0180010Struct();
		boolean itemCheckFlg = false;
		//エラー行番号
		String errorNumber = "0";
		//業務メッセージ用エラー行番号
		String err_commt ="";
		try {
			for (int i = 0; i < dataList.size(); i++)	{
	             //フラグを初期化
		        _Itemflg = true;
		        itemCheckFlg = false;
				dataStruct = (AE0180010Struct)dataList.get(i);
				errorNumber =String.valueOf(i+1);
				AE0180010Struct itemStruct = new AE0180010Struct();
				AE0180010Struct jobOdrStruct = new AE0180010Struct();
				
		        // [CSV情報]．”品目番号”で[品目] を検索し、存在しなかった場合
		        if(!isNull(dataStruct.getITEM_CD())){
		        	List itemList = entity.mselectM_ITEM.read(conn, dataStruct);
		        	
			        if (itemList.isEmpty()) {
			        	errCode = "AE50509";
			        	//業務メッセージ用エラーメッセージの格納
			        	err_commt="(SBM1330)CSV行番号 =　[" + errorNumber + "]";
			        	writeLog(ERROR,errCode,err_commt);	
			        	_intErrorCount++;
    					continue;
					}else{
						_Itemflg = false;
						// [品目]."品目手配区分"が8の場合
						itemStruct = (AE0180010Struct) itemList.get(0);
						if (("8".equals(itemStruct.getMRP_ODR_TYP()))) {
							errCode = "AE32601";
							//業務メッセージ用エラーメッセージの格納
							err_commt="(SBM1330)CSV行番号 =　[" + errorNumber + "]";
							writeLog(ERROR,errCode,err_commt);	
							_intErrorCount++;
							continue;
		    			}
					}
		        }
		        
		        // [CSV情報]．”発注納期”に休日が入力された場合
		        if (!isWorkDay(dataStruct.getPUCH_ODR_DLV_DATE(), dataStruct.getITEM_CD())) {
		        	errCode = "AE00028";
		        	//業務メッセージ用エラーメッセージの格納
		        	err_commt="(SBM1330)CSV行番号 =　[" + errorNumber + "]";
		        	writeLog(ERROR,errCode,err_commt);	
		        	_intErrorCount++;     
		        	continue;
		        }
		        
				// ASPROVA連携オプションインストールフラグの取得
				 List InstallOptionList_ASP = entity.mselectSYS_INSTALL_OPTIONS_ASP.read(conn, dataStruct);
				 if (InstallOptionList_ASP.isEmpty()) {
					 dataStruct.setASP_INSTALL_FLG(null);			
				 }else{
					 dataStruct.setASP_INSTALL_FLG(((AE0180010Struct)InstallOptionList_ASP.get(0)).getASP_INSTALL_FLG());
				 }
				 
				 _SysInstallOptions_ASP = dataStruct.getASP_INSTALL_FLG();
		        
				DateCtrlStruct dcs = DateCtrlControl.getData(conn, this.getSysPlantCd());
				// ASPROVA連携オプション未導入の場合(導入済の場合、過去日付の登録可)
                if(!"1".equals(_SysInstallOptions_ASP)){
                	// [CSV情報]．”発注納期”<[日付制御]."業務運用日"の場合
    				if(DateTool.compareYMD(dataStruct.getPUCH_ODR_DLV_DATE(), dcs.getBUSINESS_OPR_DATE())<0){
    					errCode = "AE00030";
    					//業務メッセージ用エラーメッセージの格納
    					err_commt="(SBM1330)CSV行番号 =　[" + errorNumber + "]";
    					writeLog(ERROR,errCode,err_commt);	
    					_intErrorCount++;
    					continue;
    				}
                }
		        
             // [CSV情報]．”発注予定日”に休日が入力された場合
		        if (!isNull(dataStruct.getPUCH_ODR_START_DATE())) {
		        	if(!isWorkDay(dataStruct.getPUCH_ODR_START_DATE(),dataStruct.getITEM_CD())){
		        	
		        		errCode = "AE00029";
		        		//業務メッセージ用エラーメッセージの格納
		        		err_commt="(SBM1330)CSV行番号 =　[" + errorNumber + "]";
		        		writeLog(ERROR,errCode,err_commt);	
		        		_intErrorCount++;
		        		continue;
		        	}
		        	
		        	// ASPROVA連携オプション未導入の場合(導入済の場合、過去日付の登録可)
	                if(!"1".equals(_SysInstallOptions_ASP)){
	                	 // [CSV情報]．”発注予定日”＜ [日付制御]."業務運用日"の場合
						if(DateTool.compareYMD(dataStruct.getPUCH_ODR_START_DATE(), dcs.getBUSINESS_OPR_DATE())<0){		
							errCode = "AE00031";
							//業務メッセージ用エラーメッセージの格納
							err_commt="(SBM1330)CSV行番号 =　[" + errorNumber + "]";
							writeLog(ERROR,errCode,err_commt);	
							_intErrorCount++;
							continue;
						}
	                }
		        }

		        // [CSV情報]．”発注予定日”　≠ Null かつ、[CSV情報]．”発注納期” ＜ [CSV情報]．”発注予定日”の場合
	        	if(!isNull(dataStruct.getPUCH_ODR_START_DATE()) && 
	        			(DateTool.compareYMD(dataStruct.getPUCH_ODR_DLV_DATE(), dataStruct.getPUCH_ODR_START_DATE())< 0)){
	        		errCode = "AE32608";
	        		//業務メッセージ用エラーメッセージの格納
	        		err_commt="(SBM1330)CSV行番号 =　[" + errorNumber + "]";
	        		writeLog(ERROR,errCode,err_commt);	
	        		_intErrorCount++;
	        		continue;

	        	}
	        	// レート判定日の設定
	        	dataStruct.setRATE_JUDGE_DATE(dataStruct.getPUCH_ODR_DLV_DATE());
		        // 発注予定日の設定
				String PUCH_ODR_DLV_TIME = null;
				// 入力時刻のチェック(時刻管理する場合のみ)
				if ("true".equals(dataStruct.getTIME_CTRL())) {
					PUCH_ODR_DLV_TIME = "2359";
				} else {
					// 時刻管理しない場合は0000に設定
					PUCH_ODR_DLV_TIME = "0000";
				}
	        	
				// [CSV情報]．”発注予定日”がnullの場合
				if(isNull(dataStruct.getPUCH_ODR_START_DATE())){
                    //備品発注でない場合
		        	if ("0".equals(dataStruct.getNON_NO_ITEM_FLG())){
		        		// [CSV情報]．”発注納期”を元に発注予定日を算出しその結果を発注予定日とする。
		        		String resultDate = null;
		        		// ASPROVA連携オプション未導入の場合：日単位のリードタイム計算を行う。
						if (!"1".equals(_SysInstallOptions_ASP)) {
							String fixedLt = itemStruct.getFIXED_LT();
							String propLt = itemStruct.getPROP_LT();
							String safetyLt = itemStruct.getSAFETY_LT();
							String propLotSize = itemStruct.getPROP_LOT_SIZE();

							String itemLt = Calculate.divide(dataStruct.getPUCH_ODR_QTY(), propLotSize, 0, Calculate._CEIL);
							itemLt = Calculate.multiply(itemLt, propLt);
							itemLt = Calculate.add(itemLt, fixedLt);
							itemLt = Calculate.add(itemLt, safetyLt);
							itemLt = Calculate.multiply(itemLt, "-1");

							resultDate = calcWorkDay(dataStruct.getPUCH_ODR_DLV_DATE(),PUCH_ODR_DLV_TIME, itemLt, true,  dataStruct.getITEM_CD());
							if ("".equals(resultDate)) {
								errCode = "AE00198";
								//業務メッセージ用エラーメッセージの格納
								err_commt="(SBM1330)CSV行番号 =　[" + errorNumber + "]";
								writeLog(ERROR,errCode,err_commt);	
								_intErrorCount++;
								continue;
							}
							// 算出した発注予定日 <[日付制御]."業務運用日"の場合は[日付制御]."業務運用日"を｢発注予定日｣とする。
							if (DateTool.compareYMD(resultDate.substring(0, 10), dcs.getBUSINESS_OPR_DATE()) < 0) {
								dataStruct.setPUCH_ODR_START_DATE(dcs.getBUSINESS_OPR_DATE());
							} else {
								// 自動計算した結果を発注予定日とする
								dataStruct.setPUCH_ODR_START_DATE(resultDate.substring(0, 10));
							}
							// ASPROVA連携オプション導入済の場合：時間単位のリードタイム計算を行う。
		        	    }else{
		        	    	String propLotSize = itemStruct.getPROP_LOT_SIZE();
		        	    	String sWkDate, sShiftMin, sWkTime;
		        	    	ATAspBom ab = new ATAspBom(conn, this.getSysPlantCd(),this.getSysUserCd(), this.getSysProgramId());
		        	    	ATWorkCalendar atWC = new ATWorkCalendar(conn, this.getSysUserCd(), "AE0180010",
									this.getSysPlantCd());
		        	    	Date puchOdrStartDate = null; // 発注予定日
							Date puchOdrDlvDate = null; // 発注納期
							
							// 発注納期が決定の状態
							puchOdrDlvDate = StrngToDt(dataStruct.getPUCH_ODR_DLV_DATE()
									+ " " + (PUCH_ODR_DLV_TIME).substring(0, 2)
									+ ":" + (PUCH_ODR_DLV_TIME).substring(2, 4));
							// 発注予定日LTシフト(－)
							sShiftMin = ab.getProdLtMin(dataStruct.getITEM_CD(), dataStruct.getPUCH_ODR_QTY(), propLotSize, "U");
							sShiftMin = Calculate.multiply(sShiftMin, "-1"); // 過去へ
							puchOdrStartDate = atWC.calcShiftMinute(puchOdrDlvDate, sShiftMin, ATWorkCalendar.SHIFT_START); // Conv
							sWkDate = DtGetDate(puchOdrStartDate);
							dataStruct.setPUCH_ODR_START_DATE(sWkDate);
		        	    }
					// 備品購入の場合
		        	}else{
		        		// [業務日付]."業務運用日"を発注予定日とする。
		        		dataStruct.setPUCH_ODR_START_DATE(dcs.getBUSINESS_OPR_DATE());
						if(!isWorkDay(dataStruct.getPUCH_ODR_START_DATE(),dataStruct.getITEM_CD())){
							errCode = "AE00198";
							//業務メッセージ用エラーメッセージの格納
							err_commt="(SBM1330)CSV行番号 =　[" + errorNumber + "]";
							writeLog(ERROR,errCode,err_commt);	
							_intErrorCount++;
							continue;
						}
		        	}
				}
		        
	        	// [CSV情報]．”発注数”が0以下の場合
	        	if(Calculate.compare(dataStruct.getPUCH_ODR_QTY(),"0") == 0){
	        		errCode = "AE00038";
	        		//業務メッセージ用エラーメッセージの格納
	        		err_commt="(SBM1330)CSV行番号 =　[" + errorNumber + "]";
	        		writeLog(ERROR,errCode,err_commt);	
	        		_intErrorCount++;
	        		continue;
	        	}
	        	
	        	// ｢取引先コード｣が、[取引先]に存在しない場合
                List vendCtrlList = entity.mselectM_VEND_CTRL.read(conn, dataStruct);
                AE0180010Struct vendCtrlStruct = null;
                if (vendCtrlList.isEmpty()) {
                	errCode = "AE20030";
                	//業務メッセージ用エラーメッセージの格納
                	err_commt="(SBM1330)CSV行番号 =　[" + errorNumber + "]";
                	writeLog(ERROR,errCode,err_commt);	
                	_intErrorCount++;
                	continue;

                }else {
                    // ｢取引先｣."取引状態フラグ" = 1:取引停止の場合
                    vendCtrlStruct = (AE0180010Struct) vendCtrlList.get(0);
                    if ("1".equals(vendCtrlStruct.getDEAL_STS_FLG())) {
                    	errCode = "AE00002";
                    	//業務メッセージ用エラーメッセージの格納
                    	err_commt="(SBM1330)CSV行番号 =　[" + errorNumber + "]";
                    	writeLog(ERROR,errCode,err_commt);	
                    	_intErrorCount++;
                    	continue;

                    }
                }
	        	
             // [CSV情報]．”品目番号”で[品目] を検索し、[品目].“品目手配区分” が1：製番 また2：在庫引当型製番
                if (("1".equals(itemStruct.getMRP_ODR_TYP())) || ("2".equals(itemStruct.getMRP_ODR_TYP()))){
                	// 製番がNULLの場合
                	if(isNull(dataStruct.getJOB_ODR_CD())){
                		errCode = "AB00017";
                		//業務メッセージ用エラーメッセージの格納
                		err_commt="(SBM1330)CSV行番号 =　[" + errorNumber + "]";
                		writeLog(ERROR,errCode,err_commt);	
                		_intErrorCount++;
                		continue;
                	}
                	// ログインユーザの所属の工場コード
                	dataStruct.setPLANT_CD(getSysPlantCd());
                	// 製番品の場合、ログインユーザの所属の工場コード、 [CSV情報]．”製番” 、「製番枝番」と「製番取消発生番号」 が [製番計画] に存在しない場合
                    // （「製番枝番」　＝ 0、「製番取消発生番号」　＝ 0）
                    List jobordcdList = entity.mselectT_JOB_ODR.read(conn, dataStruct);
                    if (jobordcdList.isEmpty()) {                    	
                    	errCode = "AB00043";
                    	//業務メッセージ用エラーメッセージの格納
                    	err_commt="(SBM1330)CSV行番号 =　[" + errorNumber + "]";
                    	writeLog(ERROR,errCode,err_commt);	
                    	_intErrorCount++;
                    	continue;
                    }else{
                        // [製番計画]. “製番状態区分”が 1：所要量計算未対象 or 2：所要量計算対象 or 9：完了 の場合
                        AE0180010Struct jobordcdStruct = new AE0180010Struct();
                        jobordcdStruct = (AE0180010Struct)jobordcdList.get(0);
                        if(("1".equals(jobordcdStruct.getJOB_ODR_STS_TYP())) 
                        		|| ("2".equals(jobordcdStruct.getJOB_ODR_STS_TYP())) 
                        		|| ("9".equals(jobordcdStruct.getJOB_ODR_STS_TYP()))){                    	
                        	errCode = "AE01001";
                        	//業務メッセージ用エラーメッセージの格納
                        	err_commt="(SBM1330)CSV行番号 =　[" + errorNumber + "]";
                        	writeLog(ERROR,errCode,err_commt);	
                        	_intErrorCount++;
                        	continue;
                        }
                        // [所要量]情報が存在していない場合
                        List jobOdrList = entity.mselectT_OD_JOB_ODR.read(conn, dataStruct);
                        if(jobOdrList.isEmpty()){                    	
                        	errCode = "AH00039";
                        	//業務メッセージ用エラーメッセージの格納
                        	err_commt="(SBM1330)CSV行番号 =　[" + errorNumber + "]";
                        	writeLog(ERROR,errCode,err_commt);	
                        	_intErrorCount++;
                        	continue;
                        }
                        // [所要量].“製番”で [製番計画] を検索し、[製番計画].“納期” ＜ [CSV情報]．”発注納期”かつ[製番計画].“納期”が業務運用日以降の場合
        				jobOdrStruct = (AE0180010Struct) jobOdrList.get(0);
        				// オーダデマンド番号
        				dataStruct.setOD_NO(jobOdrStruct.getOD_NO());
        				if(DateTool.compareYMD(dataStruct.getPUCH_ODR_DLV_DATE(),jobOdrStruct.getJOB_ODR_DLV_DATE())> 0){
        					if(DateTool.compareYMD(jobOdrStruct.getJOB_ODR_DLV_DATE(),dcs.getBUSINESS_OPR_DATE()) >= 0){    						
        						errCode = "AE32604";
        						//業務メッセージ用エラーメッセージの格納
        						err_commt="(SBM1330)CSV行番号 =　[" + errorNumber + "]";
        						writeLog(ERROR,errCode,err_commt);	
        						_intErrorCount++;
        						continue;
        					}
        				}
                    }
                } else {
                	dataStruct.setJOB_ODR_CD("");
                }
                
             // [CSV情報]．”受入場所”で［保管区］を検索し、存在しなかった場合
                List wh_cdList = entity.mselectM_WH.read(conn, dataStruct);
                if(wh_cdList.isEmpty()){            
                	errCode = "AE00018";
                	//業務メッセージ用エラーメッセージの格納
                	err_commt="(SBM1330)CSV行番号 =　[" + errorNumber + "]";
                	writeLog(ERROR,errCode,err_commt);	
                	_intErrorCount++;
                	continue;
            	}else{
            		AE0180010Struct wh_cdStruct = (AE0180010Struct) wh_cdList.get(0);
            		// ログインユーザの所属の工場コード ≠ [保管区].“工場コード” の場合
            		if (!this.getSysPlantCd().equals(wh_cdStruct.getPLANT_CD())) {            			
            			errCode = "AE00032";
            			//業務メッセージ用エラーメッセージの格納
            			err_commt="(SBM1330)CSV行番号 =　[" + errorNumber + "]";
            			writeLog(ERROR,errCode,err_commt);	
            			_intErrorCount++;
            			continue;
            		}    
            	}
	        	
                // 備品発注でかつ、｢品目番号｣がNullの場合は以下の処理を行わない
                if(!(("1".equals(dataStruct.getNON_NO_ITEM_FLG())) && (dataStruct.getITEM_CD() == null || dataStruct.getITEM_CD().length() <= 0))){
               	 // [品目] . “在庫数単位区分” が 1：整数管理 かつ、[CSV情報]．”発注数”に小数を含む場合
               	 if (("1".equals(itemStruct.getUNIT_QTY_TYP()))) {
                   	 String ceilPuchOdrQty = Calculate.ceil(dataStruct.getPUCH_ODR_QTY(), 0);
                   	 if (Calculate.compare(ceilPuchOdrQty, dataStruct.getPUCH_ODR_QTY()) != 0) {
                   		 dataStruct.setPUCH_ODR_QTY(ceilPuchOdrQty);
                   		itemCheckFlg = true;
                   	 }
                    }
                }
                
                TaxStruct ts = new TaxStruct();
                CurStruct cs = new CurStruct();
                try {
                	// 消費税コードを取得
                	ts =
                    TaxControl.getData(
                    conn,
                    _company_cd,
                    dataStruct.getVEND_CD(),
                    dataStruct.getITEM_CD(),
                    dataStruct.getPUCH_ODR_DLV_DATE());
                 } catch (DataNotFoundException e) {
                		errCode = "AE00017";
                		//業務メッセージ用エラーメッセージの格納
                		err_commt="(SBM1330)CSV行番号 =　[" + errorNumber + "]";
                		writeLog(ERROR,errCode,err_commt);	
                		_intErrorCount++;
                		continue;  	 
                }
                 dataStruct.setTAX_CD(ts.getTAX_CD());
                 dataStruct.setTAX_RATE_1(ts.getTAX_RATE_1());
                 dataStruct.setTAX_RATE_2(ts.getTAX_RATE_2());
                 dataStruct.setTAX_RATE_3(ts.getTAX_RATE_3());
                 dataStruct.setTAX_ROUND_TYP(ts.getTAX_ROUND_TYP());            
                // [通貨]情報を取得
                try {
                 cs =
                  CurControl.getData(conn, _company_cd, dataStruct.getVEND_CD());
                } catch (DataNotFoundException e) {               	
                	errCode = "AE05075";
                	//業務メッセージ用エラーメッセージの格納
                	err_commt="(SBM1330)CSV行番号 =　[" + errorNumber + "]";
                	writeLog(ERROR,errCode,err_commt);	
                	_intErrorCount++;
                	continue;
                }
                dataStruct.setVEND_DECIMAL_FIG(cs.getDECIMAL_FIG());
                
                PuchUnitCostStruct pucs = new PuchUnitCostStruct();
                
                //  [CSV情報]．”単価”がNULL場合
                if(isNull(dataStruct.getUNIT_COST())){
                	// [購入単価]情報を取得
                	pucs =
                    PuchUnitCostControl.getData(
                    conn,
                    _company_cd,
                    dataStruct.getVEND_CD(),
                    this.getSysPlantCd(),
                    dataStruct.getITEM_CD(),
                    dataStruct.getPUCH_ODR_START_DATE(),
                    dataStruct.getPUCH_ODR_DLV_DATE(),
                    dataStruct.getPUCH_ODR_QTY());
                	// [購入単価].” 購入単価区分”とする。
                	dataStruct.setUNIT_COST_TYP(pucs.getUNIT_COST_TYP());
                	// [購入単価].” 購入単価”とする。
                	dataStruct.setUNIT_COST(pucs.getUNIT_COST());
                	// [購入単価].” 購入加工費”とする。
                	dataStruct.setPROCESSING_COST(pucs.getPROCESSING_COST());
                	// [購入単価].” 購入材料費”とする。
                	dataStruct.setMATERIAL_COST(pucs.getMATERIAL_COST());
                	// [購入単価].” 購入その他経費”とする。
                	dataStruct.setOTHER_OVERHEADS(pucs.getOTHER_OVERHEADS());
                }
                //発注金額をまるめ処理
				String tempOdrAmount =
				AmountCalculator.calcPuchOdrAmount(
					dataStruct.getPUCH_ODR_QTY(),
					dataStruct.getUNIT_COST(),
					cs.getROUND_TYP(),
					cs.getDECIMAL_FIG());
                 if(!isNotInNumRange(tempOdrAmount, 14, 4)){              
	            	errCode = "AA00215";
	            	//業務メッセージ用エラーメッセージの格納
	            	err_commt="(SBM1330)CSV行番号 =　[" + errorNumber + "]";
	            	writeLog(ERROR,errCode,err_commt);	
	            	_intErrorCount++;
	            	continue;
                 }
                 // 発注金額
                 dataStruct.setPUCH_ODR_AMOUNT(tempOdrAmount);
                 // 本体金額
                 if(isNull(dataStruct.getNET_AMOUNT()) || "0".equals(dataStruct.getNET_AMOUNT())){
                	 dataStruct.setNET_AMOUNT(tempOdrAmount);
                 }
                 // [CSV情報]．”為替レート”がNULL以外の場合
                 if(!isNull(dataStruct.getEXCH_RATE())){
                	 // 為替レートが0以下の場合
                     if(Calculate.compare(dataStruct.getEXCH_RATE(),"0") == 0){
                 		errCode = "AE00059";
                 		//業務メッセージ用エラーメッセージの格納
                 		err_commt="(SBM1330)CSV行番号 =　[" + errorNumber + "]";
                 		writeLog(ERROR,errCode,err_commt);	
                 		_intErrorCount++;   
                 		continue;
                     }
                 }
                 // [CSV情報]．”為替レート”がNULLの場合
                 if(isNull(dataStruct.getEXCH_RATE())){
                	 // 為替レートを取得
                	 try {
                		 ExchRateStruct ers =
                                 ExchRateControl.getData(
                                 conn,
                                 _company_cd,
                                 cs.getCUR_CD(),
                                 cs.getEXCH_TYP(),
                                 null,
                                 dataStruct.getPUCH_ODR_DLV_DATE());
                                 // ｢為替レート｣を設定
                         dataStruct.setEXCH_RATE(ers.getEXCH_RATE());
                     }catch (DataNotFoundException e) {
                 		errCode = "AE05076";
                 		//業務メッセージ用エラーメッセージの格納
                 		err_commt="(SBM1330)CSV行番号 =　[" + errorNumber + "]";
                 		writeLog(ERROR,errCode,err_commt);	
                 		_intErrorCount++;	     
                 		continue;
                     }
                     // 為替レートが0以下の場合
                     if(Calculate.compare(dataStruct.getEXCH_RATE(),"0") == 0){                    	 
                 		errCode = "AE00059";
                 		//業務メッセージ用エラーメッセージの格納
                 		err_commt="(SBM1330)CSV行番号 =　[" + errorNumber + "]";
                 		writeLog(ERROR,errCode,err_commt);	
                 		_intErrorCount++;
                 		continue;
                     }
                 }
                 
                 //内税の場合に税額を計算する
                 String lowerTaxCd =
                		 ts.getTAX_CD().substring(ts.getTAX_CD().length() - 1);                
              	 if (!lowerTaxCd.equals("1")) {
              		//バッチパラメータ呼出
          			List batList = entity.mselectSYS_BAT_PARM.read(conn, dataStruct);
          			if(!batList.isEmpty()){
          				//税計算部品をコール
          				AE0180010Struct batStruct = (AE0180010Struct)batList.get(0);
          				dataStruct.setPVC2LOGMODE(batStruct.getPVC2LOGMODE());
          				dataStruct.setPVC2OUTPUTMODE(batStruct.getPVC2OUTPUTMODE());
          				dataStruct.setPVC2OUTPUTPATH(batStruct.getPVC2OUTPUTPATH());
          				dataStruct.setPVC2OUTPUTNAME(batStruct.getPVC2OUTPUTNAME());
          				dataStruct.setPVC2USERID(this.getSysUserCd());
          				dataStruct.setPVC2BUSINESSNAME(batStruct.getPVC2BUSINESSNAME());
          				dataStruct.setPVC2PLANTCD(this.getSysPlantCd());
          				dataStruct.setPVC2TAXID("5");
          				batList = entity.mcallSQLCALCTAXCALCAMT.call(conn, dataStruct);
          				batStruct = (AE0180010Struct)batList.get(0);
          				if(!"1".equals(batStruct.getPNUMSTATUS())){
          					errCode = batStruct.getPVC2ERRCD();
          					//業務メッセージ用エラーメッセージの格納
          					err_commt="(SBM1330)CSV行番号 =　[" + errorNumber + "]";
          					writeLog(ERROR,errCode,err_commt);	
          					_intErrorCount++;
          					continue;
          				}
          				dataStruct.setTAX_AMOUNT_1(batStruct.getTAX_AMOUNT_1());
          				dataStruct.setTAX_AMOUNT_2(batStruct.getTAX_AMOUNT_2());
          				dataStruct.setTAX_AMOUNT_3(batStruct.getTAX_AMOUNT_3());
          				dataStruct.setAMOUNT_INCLUDE_TAX(batStruct.getAMOUNT_INCLUDE_TAX());  				
             		}else{
             			errCode = "ZZ09007";
             			//業務メッセージ用エラーメッセージの格納
             			err_commt="(SBM1330)CSV行番号 =　[" + errorNumber + "]";
             			writeLog(ERROR,errCode,err_commt);	
             			_intErrorCount++;
             			continue;
         			}	
                 }else{
                	// ｢税額1｣の計算
  	                String taxAmount1 =
  	                 AmountCalculator.calcTaxAmount(
  	                  dataStruct.getNET_AMOUNT(),
  	                  ts.getTAX_RATE_1(),
  	                  ts.getTAX_ROUND_TYP(),
  	                  cs.getDECIMAL_FIG());
  	                 dataStruct.setTAX_AMOUNT_1(taxAmount1);
  	                 // ｢税額2｣の計算
  	                 String taxAmount2 =
  	                  AmountCalculator.calcTaxAmount(
  	                   dataStruct.getNET_AMOUNT(),
  	                   ts.getTAX_RATE_2(),
  	                   ts.getTAX_ROUND_TYP(),
  	                   cs.getDECIMAL_FIG());
  	                 dataStruct.setTAX_AMOUNT_2(taxAmount2);
  	                 // ｢税額3｣の計算
  	                 String taxAmount3 =
  	                  AmountCalculator.calcTaxAmount(
  	                   dataStruct.getNET_AMOUNT(),
  	                   ts.getTAX_RATE_3(),
  	                   ts.getTAX_ROUND_TYP(),
  	                   cs.getDECIMAL_FIG());
  	                 dataStruct.setTAX_AMOUNT_3(taxAmount3);
  	                 // ｢税込金額｣の計算
  	                 String amountIncludeTax =
  	                  AmountCalculator.calcAmountIncludeTax(
  	                   dataStruct.getNET_AMOUNT(),
  	                   dataStruct.getTAX_AMOUNT_1(),
  	                   dataStruct.getTAX_AMOUNT_2(),
  	                   dataStruct.getTAX_AMOUNT_3());
  	                 dataStruct.setAMOUNT_INCLUDE_TAX(amountIncludeTax);
  	                 if(!isNotInNumRange(amountIncludeTax, 14, 4)){
  	  		          	errCode = "AA00215";
  	  		          	//業務メッセージ用エラーメッセージの格納
  	  		          	err_commt="(SBM1330)CSV行番号 =　[" + errorNumber + "]";
  	  		          	writeLog(ERROR,errCode,err_commt);	
  	  		          	_intErrorCount++;
  	  		          	continue;  	  		          	
  	                 }
                 }
                 // ｢邦貨金額｣の計算
                 String homeCurAmount =
                  AmountCalculator.calcHomeCurAmount(
                   dataStruct.getAMOUNT_INCLUDE_TAX(),
                   dataStruct.getEXCH_RATE(),
                   cs.getROUND_TYP(),
                   _homeCurStruct.getDECIMAL_FIG());
                 dataStruct.setHOME_CUR_AMOUNT(homeCurAmount);
                 if(!isNotInNumRange(homeCurAmount, 14, 4)){	    
		        	errCode = "AA00215";
		        	//業務メッセージ用エラーメッセージの格納
		        	err_commt="(SBM1330)CSV行番号 =　[" + errorNumber + "]";
		        	writeLog(ERROR,errCode,err_commt);	
		        	_intErrorCount++;
		        	continue;
                 }
                 // 備品発注でかつ、｢品目番号｣がNullの場合は以下の処理を行わない
                 if(itemCheckFlg){
             		errCode = "AE00034";
             		//業務メッセージ用エラーメッセージの格納
             		err_commt="(SBM1330)CSV行番号 =　[" + errorNumber + "]";
             		writeLog(WARNING,errCode,err_commt);	
             		_intWarningCount++;
                 }
                 // [CSV情報]．”品目番号”で[品目] を検索し、[品目].“品目手配区分” が1：製番 また2：在庫引当型製番
                 if (("1".equals(itemStruct.getMRP_ODR_TYP())) || ("2".equals(itemStruct.getMRP_ODR_TYP()))){
                	 // [製番計画].“納期” ＜ [CSV情報]．”発注納期”かつ[製番計画].“納期”が業務運用日より過去の場合
                	 if(DateTool.compareYMD(dataStruct.getPUCH_ODR_DLV_DATE(),jobOdrStruct.getJOB_ODR_DLV_DATE())> 0){
                		 if(DateTool.compareYMD(jobOdrStruct.getJOB_ODR_DLV_DATE(),dcs.getBUSINESS_OPR_DATE()) < 0){
                				errCode = "AE32605";
                				//業務メッセージ用エラーメッセージの格納
                				err_commt="(SBM1330)CSV行番号 =　[" + errorNumber + "]";
                				writeLog(WARNING,errCode,err_commt);	
                				_intWarningCount++;
       					 }
      				 }
                 }
                 if(isNull(dataStruct.getUNIT_COST())){
                	 dataStruct.setUNIT_COST("0");
                 }
                 if(isNull(dataStruct.getPROCESSING_COST())){
                	 dataStruct.setPROCESSING_COST("0");
                 }
                 if(isNull(dataStruct.getMATERIAL_COST())){
                	 dataStruct.setMATERIAL_COST("0");
                 }
                 if(isNull(dataStruct.getOTHER_OVERHEADS())){
                	 dataStruct.setOTHER_OVERHEADS("0");
                 }
                 // 「単価」 ＜ （「加工費」 ＋ 「材料費」 ＋ 「その他経費」）の場合
                 if(Calculate.compare(dataStruct.getUNIT_COST(),
                		 Calculate.add(dataStruct.getPROCESSING_COST(), 
                				 Calculate.add(dataStruct.getMATERIAL_COST(),dataStruct.getOTHER_OVERHEADS()))) == -1){
             		errCode = "AE05074";
             		//業務メッセージ用エラーメッセージの格納
             		err_commt="(SBM1330)CSV行番号 =　[" + errorNumber + "]";
             		writeLog(WARNING,errCode,err_commt);	
             		_intWarningCount++;                	 	
                 }
                 
                 // [CSV情報]．”発注予定日”がnullの場合
 				if(isNull(dataStruct.getL_PUCH_ODR_START_DATE())){ 					
 					errCode = "AD34041";
 					//業務メッセージ用エラーメッセージの格納
 					err_commt="(SBM1330)CSV行番号 =　[" + errorNumber + "]";
 					writeLog(WARNING,errCode,err_commt);	
 					_intWarningCount++;

 				}
 				
 				//20150806 ADD START BY SYSCOM
				//科目コードが入力されている場合
				//[CSV情報]．”備品発注フラグ”が1:備品発注の場合かつ、[CSV情報]．”科目コード”が入力されている場合
				if("1".equals(dataStruct.getNON_NO_ITEM_FLG()) && !isNull(dataStruct.getACCT_CD())){
					//科目コードを検索
					List acct_cdList = entity.mselectV_ACCT_CD.read(conn, dataStruct);
					// 存在しない場合
         			if (acct_cdList.isEmpty()) {
                    	errCode = "AE25026";
                    	//業務メッセージ用エラーメッセージの格納
                    	err_commt="(SBM1330)CSV行番号 =　[" + errorNumber + "]";
                    	writeLog(ERROR,errCode,err_commt);
                    	_intErrorCount++;
                    	continue;
         			}
				}
				//負担部門コードがされている場合
				//[CSV情報]．”備品発注フラグ”が1:備品発注の場合かつ、[CSV情報]．”負担部門コード”が入力されている場合、
				if("1".equals(dataStruct.getNON_NO_ITEM_FLG()) && !isNull(dataStruct.getDEPT_CD())){
					//負担部門コードを検索
         			List dept_cdList = entity.mselectV_DEPT_CD.read(conn, dataStruct);
					// 存在しない場合
         			if (dept_cdList.isEmpty()) {
                    	errCode = "AA23603";
                    	//業務メッセージ用エラーメッセージの格納
                    	err_commt="(SBM1330)CSV行番号 =　[" + errorNumber + "]";
                    	writeLog(ERROR,errCode,err_commt);
                    	_intErrorCount++;
                    	continue;    
         			}
				}
				
				//プロジェクトコードが入力されている場合
				//[CSV情報]．”備品発注フラグ”が1:備品発注の場合かつ、[CSV情報]．”プロジェクトコード”が入力されている場合
				if("1".equals(dataStruct.getNON_NO_ITEM_FLG()) && !isNull(dataStruct.getPJ_CD())){
					//プロジェクトコードを検索
         			List pj_cdList = entity.mselectV_PJ_CD.read(conn, dataStruct);
					// 存在しない場合
         			if (pj_cdList.isEmpty()) {
                    	errCode = "AA23608";
                    	//業務メッセージ用エラーメッセージの格納
                    	err_commt="(SBM1330)CSV行番号 =　[" + errorNumber + "]";
                    	writeLog(ERROR,errCode,err_commt);
                    	_intErrorCount++;
                    	continue;    
         			}
				}
				
				//セグメント1が入力されている場合
				//[CSV情報]．”備品発注フラグ”が1:備品発注の場合かつ、[CSV情報]．”セグメント1”が入力されている場合
				if("1".equals(dataStruct.getNON_NO_ITEM_FLG()) && !isNull(dataStruct.getSEG_CONTENTS1())){
					//セグメント1を検索
					List seg_1List = entity.mselectV_SEG_CONTENTS_1.read(conn, dataStruct);
					// 存在しない場合
         			if (seg_1List.isEmpty()) {
                    	errCode = "AA23604";
                    	//業務メッセージ用エラーメッセージの格納
                    	err_commt="(SBM1330)CSV行番号 =　[" + errorNumber + "]";
                    	writeLog(ERROR,errCode,err_commt);
                    	_intErrorCount++;
                    	continue;    
         			}
				}
				
				//セグメント2が入力されている場合
				//[CSV情報]．”備品発注フラグ”が1:備品発注の場合かつ、[CSV情報]．”セグメント2”が入力されている場合
				if("1".equals(dataStruct.getNON_NO_ITEM_FLG()) && !isNull(dataStruct.getSEG_CONTENTS2())){
					//セグメント2を検索
					List seg_2List = entity.mselectV_SEG_CONTENTS_2.read(conn, dataStruct);
					// 存在しない場合
         			if (seg_2List.isEmpty()) {
                    	errCode = "AA23605";
                    	//業務メッセージ用エラーメッセージの格納
                    	err_commt="(SBM1330)CSV行番号 =　[" + errorNumber + "]";
                    	writeLog(ERROR,errCode,err_commt);
                    	_intErrorCount++;
                    	continue;             				
         			}
				}
				
				//セグメント3が入力されている場合
				//[CSV情報]．”備品発注フラグ”が1:備品発注の場合かつ、[CSV情報]．”セグメント3”が入力されている場合
				if("1".equals(dataStruct.getNON_NO_ITEM_FLG()) && !isNull(dataStruct.getSEG_CONTENTS3())){
					//セグメント3を検索
					List seg_3List = entity.mselectV_SEG_CONTENTS_3.read(conn, dataStruct);
					// 存在しない場合
         			if (seg_3List.isEmpty()) {
                    	errCode = "AA23606";
                    	//業務メッセージ用エラーメッセージの格納
                    	err_commt="(SBM1330)CSV行番号 =　[" + errorNumber + "]";
                    	writeLog(ERROR,errCode,err_commt);
                    	_intErrorCount++;
                    	continue;          				
         			}
				}
				
				//セグメント4が入力されている場合
				//[CSV情報]．”備品発注フラグ”が1:備品発注の場合かつ、[CSV情報]．”セグメント4”が入力されている場合
				if("1".equals(dataStruct.getNON_NO_ITEM_FLG()) && !isNull(dataStruct.getSEG_CONTENTS4())){
					//セグメント4を検索
					List seg_4List = entity.mselectV_SEG_CONTENTS_4.read(conn, dataStruct);
					
					// 存在しない場合
         			if (seg_4List.isEmpty()) {
                    	errCode = "AA23607";
                    	//業務メッセージ用エラーメッセージの格納
                    	err_commt="(SBM1330)CSV行番号 =　[" + errorNumber + "]";
                    	writeLog(ERROR,errCode,err_commt);
                    	_intErrorCount++;
                    	continue;   
         			}
				}
//20150806 ADD END BY SYSCOM
 				
                 dataStruct.setTAX_CD(ts.getTAX_CD());                   // 消費税コード
                 dataStruct.setTAX_RATE_1(ts.getTAX_RATE_1());           // 税率1
                 dataStruct.setTAX_RATE_2(ts.getTAX_RATE_2());           // 税率2
                 dataStruct.setTAX_RATE_3(ts.getTAX_RATE_3());           // 税率3
                 dataStruct.setTAX_ROUND_TYP(ts.getTAX_ROUND_TYP());     // 税端数区分
                 // 発注時受入検査区分
                 // 備品以外、または備品で品目ありの場合
                 if("0".equals(dataStruct.getNON_NO_ITEM_FLG()) ||("1".equals(dataStruct.getNON_NO_ITEM_FLG()) && !isNull(dataStruct.getITEM_CD()))){
                	 // ［品目］．”受入検査区分”を設定
                	 dataStruct.setACPT_INSPC_TYP(itemStruct.getACPT_INSPC_TYP());
                 }else{
                	 // １：受入のみを設定
                	 dataStruct.setACPT_INSPC_TYP("1");
                 }
                 // 会社コード
                 dataStruct.setCOMPANY_CD(_company_cd);
                 // 工場コード
                 dataStruct.setPLANT_CD(this.getSysPlantCd());
                 // 発注担当者
                 dataStruct.setPUCH_ODR_PERSON(this.getSysUserCd());
                 // 値引金額
                 String discAmount =
                  AmountCalculator.calcDiscAmount(
                		  dataStruct.getPUCH_ODR_AMOUNT(),
                          dataStruct.getNET_AMOUNT());
                 dataStruct.setDISC_AMOUNT(discAmount);
							        
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
	 * CSVファイル（発注計画取込）の内容を登録
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

	        // 発注残登録処理を開始しました。
	        writeLog(INFOMATION,"AE60007");
	        
			for (int i = 0; i < csvList.size(); i++) {
				warningFlg = false;
				AE0180010Struct cvsStruct = (AE0180010Struct)csvList.get(i);

				 // システムパラメータ（TIME_CTRL）取得
				 AE0180010Struct TIME_CTRLStruct = new AE0180010Struct();
				 List TIME_CTRLList = entity.mselectTIME_CTRL.read(conn, TIME_CTRLStruct);
				 if(null != TIME_CTRLList && TIME_CTRLList.size()>0){
			 		TIME_CTRLStruct = (AE0180010Struct)TIME_CTRLList.get(0);
			 		cvsStruct.setTIME_CTRL(TIME_CTRLStruct.getTIME_CTRL());
				 }else{
					 cvsStruct.setTIME_CTRL("false");
				 }
				 
				// 製番がない場合
				if(isNull(cvsStruct.getJOB_ODR_CD())){
					// CSVファイル内容を元に発注残登録処理
					rtnFlg = insertRlsdPuchOdr (cvsStruct,i);
					if(!rtnFlg) {
						conn.rollback();
						//発注残登録処理が異常終了しました。
						 writeLog(INFOMATION, "AE60009");	
						return false;
					}
				// 製番場合
				}else{
					// CSVファイル内容を元に発注残登録処理
					rtnFlg = insertRlsdPuchOdrJob (cvsStruct,i);
					if(!rtnFlg) {
						conn.rollback();
						//発注残登録処理が異常終了しました。
						 writeLog(INFOMATION, "AE60009");	
						return false;
					}
				}
			}
			//  登録処理が正常に終了した場合
			_intSuccessCount = csvList.size();
	        String succCommt = "(SBM1701)読込件数　=　[" + _intTotalCount + "] "
	        				 + "登録件数　=　[" + _intSuccessCount + "] ";
	        //発注残登録処理を正常に終了しました。
	        writeLog(INFOMATION, "AE60008", succCommt);	
			// トランザクションの開始
			conn.beginTransWeb();
			conn.commit();
			return true;
		} catch (Exception e) {
			conn.rollback();;
			throw new ExpjException(e);
		}
		
	}
	
	/**
	 * 製番がない場合、CSVファイル（発注計画取込）の内容を元に発注残登録処理
	 * @param csvList
	 * @return
	 * @throws FoundationException 
	 */
	private boolean insertRlsdPuchOdr (AE0180010Struct adstruct ,int j) throws ExpjException {
		try {
			String PUCH_ODR_DLV_TIME = null;
			String PUCH_ODR_START_TIME = null;
			String CONFIRM_DLV_TIME = null;
			adstruct.setsUser_ID(getSysUserCd());
			// 入力時刻のチェック(時刻管理する場合のみ)
			if ("true".equals(adstruct.getTIME_CTRL())) {
				PUCH_ODR_DLV_TIME = "2359";
				PUCH_ODR_START_TIME = "2359";
				CONFIRM_DLV_TIME = "2359";
			} else {
				// 時刻管理しない場合は0000に設定
				PUCH_ODR_DLV_TIME = "0000";
				PUCH_ODR_START_TIME = "0000";
				CONFIRM_DLV_TIME = "0000";
			}
			/** 発注予定日（時刻含む）*/
			adstruct.setPUCH_ODR_START_DATE(adstruct.getPUCH_ODR_START_DATE() + " " + PUCH_ODR_START_TIME);
			 /** 発注納期（時刻含む）*/
			adstruct.setPUCH_ODR_DLV_DATE(adstruct.getPUCH_ODR_DLV_DATE() + " " + PUCH_ODR_DLV_TIME);
			 /** 取引先回答納期（時刻含む）*/
            if(adstruct.getCONFIRM_DLV_DATE() != null && !("".equals(adstruct.getCONFIRM_DLV_DATE()))){
            	adstruct.setCONFIRM_DLV_DATE(adstruct.getCONFIRM_DLV_DATE() + " " + CONFIRM_DLV_TIME);
            }
			// オーダーデマンド番号を自動採番
            // [所要量]の更新
            if ("0".equals(adstruct.getNON_NO_ITEM_FLG())) {
           	    String odNoString = null;
                // ASPROVA連携オプション未導入の場合：日単位のリードタイム計算を行う。
          	    if(!"1".equals(_SysInstallOptions_ASP)){
          	    	CommonOd od = new CommonOd(conn, getSysPlantCd(), getSysUserCd(), getSysProgramId());
          	  		odNoString =
          	  			od.addOdInfo(
          	  				adstruct.getITEM_CD(),
          	  					Converter.strToDate(
          	  						adstruct.getPUCH_ODR_DLV_DATE(), Converter.SLASH_DATE_HOUR_MINUTE),
          	  							Converter.strToDate(
          	  								adstruct.getPUCH_ODR_START_DATE(), Converter.SLASH_DATE_HOUR_MINUTE),
          	  									Double.parseDouble(adstruct.getPUCH_ODR_QTY()),
          	  									2);
          	  	// ASPROVA連携オプション導入済の場合：時間単位でのリードタイム計算を行う。
          	  	}else{
	          	  	ATCommonOd od = new ATCommonOd(conn, getSysPlantCd(), getSysUserCd(), getSysProgramId());
	       	  		odNoString =
	       	  			od.addOdInfo(
	       	  				adstruct.getITEM_CD(),
	       	  					Converter.strToDate(
	       	  						adstruct.getPUCH_ODR_DLV_DATE(), Converter.SLASH_DATE_HOUR_MINUTE),
	       	  							Converter.strToDate(
	       	  								adstruct.getPUCH_ODR_START_DATE(), Converter.SLASH_DATE_HOUR_MINUTE),
				
	       	  									Double.parseDouble(adstruct.getPUCH_ODR_QTY()),
	       	  									2,
	       	  									new Integer("2").intValue());
          	  	}
          	  	// オーダーデマンド番号設定
          	    adstruct.setOD_NO(odNoString);
          	    // 備品発注品目名
          	    adstruct.setNON_NO_ITEM_NAME(null);
          	    // 備品発注製品区分
          	    adstruct.setNON_NO_ITEM_TYP("0");
          	    // 備品発注単位
          	    adstruct.setNON_NO_ITEM_PUCH_ODR_UNIT(null);
          	    // 在庫管理フラグ
          	    adstruct.setINV_CTRL_FLG("1");
          	} else {
           	    // オーダーデマンド番号設定
            	adstruct.setOD_NO(null);
          	    // 在庫管理フラグ
          	    adstruct.setINV_CTRL_FLG("0");
          	    // 加工費
          	    adstruct.setPROCESSING_COST("0");
          	    // 材料費
          	    adstruct.setMATERIAL_COST("0");
          	    // その他経費
          	    adstruct.setOTHER_OVERHEADS("0");
          	}
            // 発注番号を自動採番
            Numbering puchCdNumbering =
             new Numbering(
              conn,
              Numbering.PUCH_CD,
              getSysUserCd(),
              getSysProgramId(),
              getSysPlantCd());
            adstruct.setPUCH_ODR_CD(puchCdNumbering.getNo());
            if (isNull(adstruct.getPUCH_ODR_CD())) {
				//採番結果がない
				writeLogFiles(ERROR, "ZZ01106");
				_intErrorCount++;
				return false;
			}
            // [発注残]を登録
            entity.minsertT_RLSD_PUCH_ODR.create(conn, adstruct);
            return true;
		}catch(Exception e) {
			throw new ExpjException(e);
		}
	}	
	
	/**
	 * 製番場合、CSVファイル（発注計画取込）の内容を元に発注残登録処理
	 * @param csvList
	 * @return
	 * @throws FoundationException 
	 */
	private boolean insertRlsdPuchOdrJob (AE0180010Struct adstruct ,int j) throws ExpjException {
		try {
			String PUCH_ODR_DLV_TIME = null;
			String PUCH_ODR_START_TIME = null;
			String CONFIRM_DLV_TIME = null;
			adstruct.setsUser_ID(getSysUserCd());
			
			// 入力時刻のチェック(時刻管理する場合のみ)
			if ("true".equals(adstruct.getTIME_CTRL())) {
				PUCH_ODR_DLV_TIME = "2359";
				PUCH_ODR_START_TIME = "2359";
				CONFIRM_DLV_TIME = "2359";
			} else {
				// 時刻管理しない場合は0000に設定
				PUCH_ODR_DLV_TIME = "0000";
				PUCH_ODR_START_TIME = "0000";
				CONFIRM_DLV_TIME = "0000";
			}
			/** 発注予定日（時刻含む）*/
			adstruct.setPUCH_ODR_START_DATE(adstruct.getPUCH_ODR_START_DATE() + " " + PUCH_ODR_START_TIME);
			 /** 発注納期（時刻含む）*/
			adstruct.setPUCH_ODR_DLV_DATE(adstruct.getPUCH_ODR_DLV_DATE() + " " + PUCH_ODR_DLV_TIME);
			 /** 取引先回答納期（時刻含む）*/
            if(adstruct.getCONFIRM_DLV_DATE() != null && !("".equals(adstruct.getCONFIRM_DLV_DATE()))){
            	adstruct.setCONFIRM_DLV_DATE(adstruct.getCONFIRM_DLV_DATE() + " " + CONFIRM_DLV_TIME);
            }
            // 備品発注品目名
      	    adstruct.setNON_NO_ITEM_NAME(null);
      	    // 備品発注製品区分
      	    adstruct.setNON_NO_ITEM_TYP("0");
      	    // 備品発注単位
      	    adstruct.setNON_NO_ITEM_PUCH_ODR_UNIT(null);
      	    // 在庫管理フラグ
      	    adstruct.setINV_CTRL_FLG("1");
      	    // 備品発注フラグ
      	    adstruct.setNON_NO_ITEM_FLG("0");
			// ｢発注番号｣を自動採番
			Numbering puchCdNumbering =
					new Numbering(
							conn,
							Numbering.PUCH_CD,
							getSysUserCd(),
							getSysProgramId(),
							getSysPlantCd());
			adstruct.setPUCH_ODR_CD(puchCdNumbering.getNo());
			if (isNull(adstruct.getPUCH_ODR_CD())) {
				//採番結果がない				
				writeLogFiles(ERROR, "ZZ01106");
				_intErrorCount++;
				return false;
			}
			// [発注残]を登録
			int nRet = entity.minsertT_RLSD_PUCH_ODR.create(conn, adstruct);

			// [所要量]のオーダ情報の更新
			CommonOd od = new CommonOd(conn, getSysPlantCd(), getSysUserCd(), getSysProgramId());
			od.changeOdInfo(adstruct.getOD_NO(), -1);
			return true;
		}catch(Exception e) {
			throw new ExpjException(e);
		}
	}

	//////////////////////////////

	/**
	 * main： ユーザ定義用メソッドです<br>
	 * <<説明を記述してください>>
	 *
	 * @return <<説明を記述してください>>
	 * @exception <<説明を記述してください>>
	 */
	public int main() throws BatchAppException, BusinessProcessException, FoundationException
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
			m_med.setFUNCTION_NAME("SQLPUCHODRINTERFACE");
			
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
			callList = m_med.getSQLPUCHODRINTERFACE().call();
			// PL/SQLの実行結果を取得
			medAE0180B001 resultMed = (medAE0180B001) callList.get(0);
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
		
			// [発注計画取込]のデータを取得
			List listTPuchOdrTemp = new ArrayList();
			listTPuchOdrTemp = selectTPuchOdrTemp();
			
			// 会社コード取得
			int nret1 = m_med.getSYS_MY_COMPANY().read();
			if (!m_med.getSYS_MY_COMPANY().next()) {
				
				writeLog(ERROR, "VK34002");
				return BREAK;
			}
			_company_cd = m_med.getCOMPANY_CD();
			
            // [邦貨]情報を部品より取得			
            _homeCurStruct = HomeCurControl.getData(conn);
            
			// [発注計画取込]のデータを取得成功
			if (listTPuchOdrTemp != null) {
				//マスタ整合性チェック実施
				if(check_listTPuchOdrTemp(listTPuchOdrTemp)){
	             // 登録処理
					if(insertCsvDate(listTPuchOdrTemp)) {
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
			    m_med.getdeleteT_PUCH_ODR_TEMP().delete();
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
			entity = new AE0180010Entity();
						
		} catch (FoundationException e) {
			//TODO 異常終了
		}catch(Exception e) {
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
		public medAE0180B001 m_med=null;

		/**
		 * コンテナクラスインスタンス
		 */
		public ManageContainer m_container=null;

		//////////////////////////////

		public interControl(medAE0180B001 med) throws BatchAppException
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
