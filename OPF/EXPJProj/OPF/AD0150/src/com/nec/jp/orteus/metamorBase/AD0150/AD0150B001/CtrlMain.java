/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AD0150/src/com/nec/jp/orteus/metamorBase/AD0150/AD0150B001/CtrlMain.java,v $
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

package com.nec.jp.orteus.metamorBase.AD0150.AD0150B001;

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
import com.nec.jp.orteus.metamorBase.AD0150.AD0150010Entity;
import com.nec.jp.orteus.metamorBase.AD0150.AD0150010Struct;
import com.nec.jp.orteus.metamorBase.common.CollectNumber.CollectNumber;
import com.nec.jp.orteus.metamorBase.common04.sysdata.DateCtrlControl;
import com.nec.jp.orteus.metamorBase.common04.sysdata.DateCtrlStruct;
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessage;
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessageAccessor;
import com.nec.jp.orteus.msg.util.Business;
import com.nec.jp.orteus.expj.util.CommonOd;
import com.nec.jp.orteus.expj.util.Converter;
import com.nec.jp.orteus.expj.util.ExpjMessage;
import com.nec.jp.orteus.expj.util.ExpjException;
import com.nec.jp.orteus.expj.util.Numbering;
import com.nec.jp.orteus.expj.util.ScreenParam;
import com.nec.jp.orteus.expj.util.WorkCalendar;
import com.nec.jp.orteus.expj.util.WorkDay;
import java.math.BigDecimal;
import com.nec.jp.orteus.xaf.wa.BusinessProcessException;
import java.util.Date;
//}}user_implement_dev:import

/**
 * CLASS     : CtrlMain クラス
 * ファイル・クラス説明
 * @author $Author: shan-xiuqin $
 * @version $Revision: 1.4 $ $Date: 2016/05/23 08:03:53 $
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
	public medAD0150B001 m_med=null;

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
	public CtrlMain(medAD0150B001 med, BatchAppConductor cdr) throws BatchAppException
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
	public CtrlMain(medAD0150B001 med) throws BatchAppException
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
     * @return 業務ID
     */
    private String getCsvTakeTyp() {
     return m_med.getArgs()[4];
    }
    
    /**
     * バッチパラメータ(共通6)取込ファイルパスを返します。
     * @return 業務ID
     */
    private String getCsvTakePath() {
     return m_med.getArgs()[5];
    }
    
    /**
     * バッチパラメータ(共通7)バックアップフォルダパスを返します。
     * @return 業務ID
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
    
	/** ドライブレター変換元文字 **/
	private char _driveLetterChangeCharBefore;
	/** ドライブレター変換先文字 **/
	private char _driveLetterChangeCharAfter;
	/** DBサーバ名 */
	private String _strDbServerName;
    
    /**AD0150 entity*/
    AD0150010Struct struct = null;
	protected AD0150010Entity entity;
	
	/** ロック失敗時ロックキー */
	private static final int LOCK_FAILD = -1;
	
	/** 業務ロッククラス */
	private BusinessLock lock = null;
		
	/** 業務運用日*/
	private String _btmBusinessOprDate;
	
	/** 日付処理用 */
	DateFormat _df = DateFormat.getDateInstance();
	
	private static final int INFOMATION = 0;
	/** ログレベル ワーニング */
	private static final int WARNING = 1;
	/** ログレベル エラー */
	private static final int ERROR = 2;
	
	// 品目別製造納期用
	String WORK_ODR_DLV_DATE_TIME = "0000";	
	//品目別製造着手日用
	String OPR_INST_START_DATE_TIME = "0000";
	// 時刻管理用フラグ
	private String _flgTimeCtrl = null;
	public AD0150010Struct mItemStruct = new AD0150010Struct();
	public AD0150010Struct jobodrStruct = new AD0150010Struct();
//	private Business business;
	
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
	 * CSVファイル内容は、品目別仕掛登録処理
	 * @param csvList
	 * @return
	 * @throws FoundationException 
	 */
	private boolean insertT_WORK_IN_PROC_BY_ITEM (AD0150010Struct adstruct ,int j) throws ExpjException {
		try {
			if (isNull(adstruct.getWORK_ODR_CD())) {
				// 作業計画番号採番処理を行う。

				Numbering MyNo = new Numbering(conn,CollectNumber.ODR_CD,getSysUserCd(),getSysProgramId(),getSysPlantCd());
				String strWorkOdrCd = MyNo.getNo();
				if (isNull(strWorkOdrCd)) {
					//採番結果がない
					writeLogFiles(ERROR, "ZZ01106");
					_intErrorCount++;
					return false;
				} else {
					adstruct.setWORK_ODR_CD(strWorkOdrCd);
				}
			}
			
			// 作業製造納期
			adstruct.setWORK_ODR_DLV_DATE(adstruct.getWORK_ODR_DLV_DATE() + " " + WORK_ODR_DLV_DATE_TIME);
			// 作業製造着手日
			adstruct.setOPR_INST_START_DATE(adstruct.getOPR_INST_START_DATE() + " " + OPR_INST_START_DATE_TIME);
			
			// 作業指示数
			// [品目].在庫数量単位区分=1で「作業指示数」に小数が入力された場合、
			// 切り上げ処理をする
			BigDecimal OprInstQty_up = new BigDecimal(adstruct.getOPR_INST_QTY());
			if ("1".equals(mItemStruct.getUNIT_QTY_TYP())) {
				BigDecimal OprInstQty2 = new BigDecimal("0");
				OprInstQty2 = OprInstQty_up.setScale(0,BigDecimal.ROUND_UP);
				//切り上げ処理前と後で値が異なっていたら
				//小数が入力されていたと判断しワーニング
				if ( OprInstQty_up.doubleValue() != OprInstQty2.doubleValue()) {
					//	品目が整数管理品の場合、切上げを行う
					OprInstQty_up = OprInstQty_up.setScale(0, BigDecimal.ROUND_UP);
				}
			}
			adstruct.setOPR_INST_QTY(OprInstQty_up.toString());
			// 品目別作業状態区分
			adstruct.setWORK_STS_TYP("1");
			// 作業系列展開済フラグ
			adstruct.setPROC_EXPLOSION_FLG("0");
			
			// 品目別作業実績区分
			adstruct.setOPR_RSLT_TYP(mItemStruct.getOPR_RSLT_TYP());
			
			// 作業指示番号
			// [品目].“作業実績区分”が、1：出来高実績 の場合、「作業指示番号」
			if ("1".equals(mItemStruct.getOPR_RSLT_TYP())) {
				
			}else if ("2".equals(mItemStruct.getOPR_RSLT_TYP())) {
				// 2：作業指示実績　の場合、Null
				adstruct.setOPR_INST_CD("");
			}
			// 工場コード
			adstruct.setPLANT_CD(getSysPlantCd());
			
			// [品目別仕掛]への追加内容
			entity.minsertT_WORK_IN_PROC_BY_ITEM.create(conn, adstruct);
			return true;
		}catch(Exception e) {
			throw new ExpjException(e);
		}
	}
	
	/**
	 * CSVフェイル内容は、作業指示伝票登録処理
	 * @param csvList
	 * @return
	 * @throws FoundationException 
	 */
	private boolean insertT_OPR_INST_SLIP (AD0150010Struct adstruct ,int j) throws ExpjException {
		try {
			if (isNull(adstruct.getOPR_INST_CD())) {
				// 作業指示番号採番処理を行う。
				Numbering MyNo = new Numbering(conn,CollectNumber.INST_CD,getSysUserCd(),getSysProgramId(),getSysPlantCd());
				String strOprInstCd = MyNo.getNo();
				if (isNull(strOprInstCd)) {
					//採番結果がない
					writeLogFiles(ERROR, "ZZ01106");
					_intErrorCount++;
					return false;
				} else {
					adstruct.setOPR_INST_CD(strOprInstCd);
				}
			}
			// 作業指示番号発生区分
			adstruct.setOPR_INST_CD_GNR_TYP("1");
			// 作業指示伝票発行済みフラグ
			adstruct.setOPR_INST_SLIP_ISS_FLG("0");
			// 工場コード
			adstruct.setPLANT_CD(getSysPlantCd());
			
			// [作業指示伝票]への追加内容
			entity.minsertT_OPR_INST_SLIP.create(conn, adstruct);
			return true;
		}catch(Exception e) {
			throw new ExpjException(e);
		}
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
	 * 作業計画取込データ取得
     * @return	oprRsltList     作業計画取込リスト
	 * @throws BatchAppException 
	 * @throws SQLException 
	 * @throws FoundationException 
	 */
	private List selectTWorkOdrTemp() throws BatchAppException {
		List rtnList = new ArrayList();
		AD0150010Struct structdata = null;
		m_med.getT_WORK_ODR_TEMP().read();
		while(m_med.getT_WORK_ODR_TEMP().next()) {
			structdata = new AD0150010Struct();
			structdata.setITEM_CD(m_med.getITEM_CD());
			structdata.setWORK_ODR_DLV_DATE(m_med.getPRD_DUE_DATE());
			structdata.setOPR_INST_START_DATE(m_med.getPRD_START_DATE());
			structdata.setOPR_INST_QTY(m_med.getOPR_INST_QTY());
			structdata.setWS_CD(m_med.getWS_CD());
			structdata.setJOB_ODR_CD(m_med.getJOB_ODR_CD());
			structdata.setWORK_IN_PROC_COMMENT(m_med.getWK_IN_PROC_BY_ITEM_COMMENT());
			rtnList.add(structdata);
		}
		return rtnList;
	}
	
	/**
	 * 作業計画取込データのマスタ整合性チェック
	 * @param csvList
	 * @return
	 * @throws BusinessProcessException
	 * @throws FoundationException
	 */
	private boolean check_listTWorkOdrTemp(List dataList) throws Exception {
		
		// 全部レコード数
		_intTotalCount = dataList.size();
		AD0150010Struct dataStruct = new AD0150010Struct();
		//エラー行番号
		String errorNumber = "0";
		//業務メッセージ用エラー行番号
		String err_commt ="";
		try{
			for (int i = 0; i < dataList.size(); i++)	{
				dataStruct = (AD0150010Struct)dataList.get(i);
				errorNumber =String.valueOf(i+1);
				// 製造着手日
				Date OprInstStartDatetemp = null;
				// 製造納期
				Date workOdrDlvDatetemp = null;		
				if (!isNull(dataStruct.getOPR_INST_START_DATE())) {
					OprInstStartDatetemp = _df.parse(dataStruct.getOPR_INST_START_DATE());
				}
				if (!isNull(dataStruct.getWORK_ODR_DLV_DATE())) {
					workOdrDlvDatetemp = _df.parse(dataStruct.getWORK_ODR_DLV_DATE());
				}
				
				// 「品目番号」 に入力された値が [品目] に存在しない場合
				List itemCdList = entity.mselectItem_CD.read(conn, dataStruct);

				if (itemCdList.isEmpty()) {
					errCode = "AD00019";
					//業務メッセージ用エラーメッセージの格納
					err_commt="(SBM1330)CSV行番号 =　[" + errorNumber + "]";
					writeLog(ERROR,errCode,err_commt);	
					_intErrorCount++;
					continue;
				}else{
					mItemStruct = (AD0150010Struct)itemCdList.get(0);
					// 入力された [品目] の “品目手配区分” が	3：欠番 8：擬似品目 の場合
					if ("3".equals(mItemStruct.getMRP_ODR_TYP()) 
							|| "8".equals(mItemStruct.getMRP_ODR_TYP())) {
						errCode = "AD32217";
						//業務メッセージ用エラーメッセージの格納
						err_commt="(SBM1330)CSV行番号 =　[" + errorNumber + "]";
						writeLog(ERROR,errCode,err_commt);	
						_intErrorCount++;
						continue;
					}	
				}
				// 「製造納期」 に休日が入力された場合
				String strWorkOdrDlvDate = Converter.dateToStr(workOdrDlvDatetemp, "yyyy/MM/dd");
				dataStruct.setDATE(strWorkOdrDlvDate);
				dataStruct.setPLANT_CD(getSysPlantCd());
				//品目番号を検索キーとして読込
				List dateList = entity.mSelectM_CAL1.read(conn,dataStruct);
				if (dateList.isEmpty()) {
					//工場コードを検索キーとして読込
					dateList = entity.mselectM_CAL.read(conn,dataStruct);
					if(dateList.isEmpty()){
						//データが存在しない
						errCode = "KQ00325";
						//業務メッセージ用エラーメッセージの格納
						err_commt="(SBM1330)CSV行番号 =　[" + errorNumber + "]";
						writeLog(ERROR,errCode,err_commt);	
						_intErrorCount++;
						continue;
					}else{
						AD0150010Struct dateStruct = (AD0150010Struct)dateList.get(0);
						if ("1".equals(dateStruct.getHOLIDAY_FLG())) {
							errCode = "AD00036";
							//業務メッセージ用エラーメッセージの格納
							err_commt="(SBM1330)CSV行番号 =　[" + errorNumber + "]";
							writeLog(ERROR,errCode,err_commt);	
							_intErrorCount++;
							continue;
						}
					}
				}else{
					AD0150010Struct dateStruct = (AD0150010Struct)dateList.get(0);
					if ("1".equals(dateStruct.getHOLIDAY_FLG())) {
						errCode = "AD00036";
						//業務メッセージ用エラーメッセージの格納
						err_commt="(SBM1330)CSV行番号 =　[" + errorNumber + "]";
						writeLog(ERROR,errCode,err_commt);	
						_intErrorCount++;
						continue;
					}
				}
				
				// 「製造着手日」 に休日が入力された場合
				if (!isNull(dataStruct.getOPR_INST_START_DATE())) {
					//入力された製造着手日が休日だった場合エラー
					String strOprInstStartDate = Converter.dateToStr(OprInstStartDatetemp, "yyyy/MM/dd");
					dataStruct.setDATE(strOprInstStartDate);
					//品目番号を検索キーとして読込
					List dateList2 = entity.mSelectM_CAL1.read(conn,dataStruct);
					if (dateList2.isEmpty()) {
						//工場コードを検索キーとして読込
						dateList2 = entity.mselectM_CAL.read(conn,dataStruct);
						if(dateList2.isEmpty()){
							//データが存在しない
							errCode = "KQ00325";
							//業務メッセージ用エラーメッセージの格納
							err_commt="(SBM1330)CSV行番号 =　[" + errorNumber + "]";
							writeLog(ERROR,errCode,err_commt);	
							_intErrorCount++;	
							continue;
						} else {
							AD0150010Struct dateStruct2 = (AD0150010Struct)dateList2.get(0);
							if ("1".equals(dateStruct2.getHOLIDAY_FLG())) {
								errCode = "AD00038";
								//業務メッセージ用エラーメッセージの格納
								err_commt="(SBM1330)CSV行番号 =　[" + errorNumber + "]";
								writeLog(ERROR,errCode,err_commt);	
								_intErrorCount++;
								continue;
							}
						}
					}else{
						AD0150010Struct dateStruct2 = (AD0150010Struct)dateList2.get(0);
						if ("1".equals(dateStruct2.getHOLIDAY_FLG())) {
							errCode = "AD00038";
							//業務メッセージ用エラーメッセージの格納
							err_commt="(SBM1330)CSV行番号 =　[" + errorNumber + "]";
							writeLog(ERROR,errCode,err_commt);	
							_intErrorCount++;
							continue;
						}
					}
					
					// 「製造納期」 ＜ 「製造着手日」の場合
					if (workOdrDlvDatetemp.compareTo(OprInstStartDatetemp) < 0) {
						errCode = "AD32156";
						//業務メッセージ用エラーメッセージの格納
						err_commt="(SBM1330)CSV行番号 =　[" + errorNumber + "]";
						writeLog(ERROR,errCode,err_commt);	
						_intErrorCount++;
						continue;
					}
				}
				
				// 「作業指示数」 が 0の場合
				if ("0".equals(dataStruct.getOPR_INST_QTY())) {
					errCode = "AD30222";
					//業務メッセージ用エラーメッセージの格納
					err_commt="(SBM1330)CSV行番号 =　[" + errorNumber + "]";
					writeLog(ERROR,errCode,err_commt);	
					_intErrorCount++;
					continue;
				}
				
				// [作業区] に存在しない作業区コードを入力した場合
				if (!isNull(dataStruct.getWS_CD())) {
					List wsCdList = entity.mselectM_WS.read(conn, dataStruct);
					AD0150010Struct wsCdStruct = new AD0150010Struct();
					if (wsCdList.isEmpty()) {
						errCode = "AD20029";
						//業務メッセージ用エラーメッセージの格納
						err_commt="(SBM1330)CSV行番号 =　[" + errorNumber + "]";
						writeLog(ERROR,errCode,err_commt);	
						_intErrorCount++;
						continue;
					}else{
						wsCdStruct = (AD0150010Struct)wsCdList.get(0);
						// 「作業区コード」に対する工場コードと「工場コード」が一致しない場合
						if (!getSysPlantCd().equals(wsCdStruct.getvc2PLANT_CD())) {
							errCode = "AD00004";
							//業務メッセージ用エラーメッセージの格納
							err_commt="(SBM1330)CSV行番号 =　[" + errorNumber + "]";
							writeLog(ERROR,errCode,err_commt);	
							_intErrorCount++;
							continue;
						}
					}
				}
				
				// [品目].“作業実績区分” が 1：出来高実績 で、
				if ("1".equals(mItemStruct.getOPR_RSLT_TYP())) {
					// 「作業区コード」 が Null の場合
					if (isNull(dataStruct.getWS_CD())) {
						// 作業系列から「作業区コード」 を取得し、取得できない場合
						List procgrpList = entity.mselectM_PROC_GRP.read(conn, dataStruct);
						AD0150010Struct procgrpStruct = new AD0150010Struct();
						if (procgrpList.isEmpty()) {
							errCode = "AC00103";
							//業務メッセージ用エラーメッセージの格納
							err_commt="(SBM1330)CSV行番号 =　[" + errorNumber + "]";
							writeLog(ERROR,errCode,err_commt);	
							_intErrorCount++;	
							continue;
						}else {
							procgrpStruct = (AD0150010Struct)procgrpList.get(0);
							dataStruct.setWS_CD(procgrpStruct.getWS_CD());
						}
					}
					
				}else if ("2".equals(mItemStruct.getOPR_RSLT_TYP())) {
					// [品目].“作業実績区分” が 2：作業指示実績 で
					// 「作業区コード」 が入力されている場合
					if (!isNull(dataStruct.getWS_CD())) {
						errCode = "AD00227";
						//業務メッセージ用エラーメッセージの格納
						err_commt="(SBM1330)CSV行番号 =　[" + errorNumber + "]";
						writeLog(ERROR,errCode,err_commt);	
						_intErrorCount++;
						continue;
					}
				}
				
				// 入力された [品目] の “品目手配区分” が1：製番 2：在庫引当型製番の場合
				if (("1".equals(mItemStruct.getMRP_ODR_TYP()) || "2".equals(mItemStruct.getMRP_ODR_TYP()))) {
					// [作業計画取込]の製番が入力されていない場合、
					if (isNull(dataStruct.getJOB_ODR_CD())) {
						errCode = "AD30017";
						//業務メッセージ用エラーメッセージの格納
						err_commt="(SBM1330)CSV行番号 =　[" + errorNumber + "]";
						writeLog(ERROR,errCode,err_commt);	
						_intErrorCount++;
						continue;
					}else {
						// 「製番」 の値で [製番計画] に存在しない場合
						List jobodrList = entity.mselectT_JOB_ODR.read(conn, dataStruct);
						if (jobodrList.isEmpty()) {
							errCode = "AB00043";
							//業務メッセージ用エラーメッセージの格納
							err_commt="(SBM1330)CSV行番号 =　[" + errorNumber + "]";
							writeLog(ERROR,errCode,err_commt);	
							_intErrorCount++;
							continue;
						}else {
							jobodrStruct = (AD0150010Struct)jobodrList.get(0);
							// [製番計画].“製番状態区分” が1：所要量計算未対象 or 2：所要量計算対象 or 9：完了 の場合
							if ("1".equals(jobodrStruct.getJOB_ODR_STS_TYP())
									|| "2".equals(jobodrStruct.getJOB_ODR_STS_TYP())
									|| "9".equals(jobodrStruct.getJOB_ODR_STS_TYP())) {
								errCode = "AD32616";
								//業務メッセージ用エラーメッセージの格納
								err_commt="(SBM1330)CSV行番号 =　[" + errorNumber + "]";
								writeLog(ERROR,errCode,err_commt);	
								_intErrorCount++;
								continue;
							}
							
							// ユーザが所属する工場コードと、[製番計画] の工場コードが一致しない場合
							if (!jobodrStruct.getPLANT_CD().equals(getSysPlantCd())) {
								errCode = "AD00016";
								//業務メッセージ用エラーメッセージの格納
								err_commt="(SBM1330)CSV行番号 =　[" + errorNumber + "]";
								writeLog(ERROR,errCode,err_commt);	
								_intErrorCount++;
								continue;
							}
							
							// [製番計画].“製番納期” ＜ 「製造納期」になる場合
							Date jobOdrDlvDate = _df.parse(jobodrStruct.getJOB_ODR_DLV_DATE());
							if (jobOdrDlvDate.compareTo(workOdrDlvDatetemp) < 0) {
								errCode = "AD32214";
								//業務メッセージ用エラーメッセージの格納
								err_commt="(SBM1330)CSV行番号 =　[" + errorNumber + "]";
								writeLog(ERROR,errCode,err_commt);	
								_intErrorCount++;
								continue;
							}
						}
					}
				}
				
				// [品目].在庫数量単位区分=1で「作業指示数」に小数が入力された場合
				BigDecimal OprInstQty_up = new BigDecimal(dataStruct.getOPR_INST_QTY());
				if ("1".equals(mItemStruct.getUNIT_QTY_TYP())) {
					BigDecimal OprInstQty2 = new BigDecimal("0");
					OprInstQty2 = OprInstQty_up.setScale(0,BigDecimal.ROUND_UP);
					//切り上げ処理前と後で値が異なっていたら
					//小数が入力されていたと判断しワーニング
					if ( OprInstQty_up.doubleValue() != OprInstQty2.doubleValue()) { 
						errCode = "AD00043";
						//業務メッセージ用エラーメッセージの格納
						err_commt="(SBM1330)CSV行番号 =　[" + errorNumber + "]";
						writeLog(WARNING,errCode,err_commt);	
						_intWarningCount++;
					}
				}
				
				// 「製造着手日」 が Null の場合
				if (isNull(dataStruct.getOPR_INST_START_DATE())){
					errCode = "AD34034";
					//業務メッセージ用エラーメッセージの格納
					err_commt="(SBM1330)CSV行番号 =　[" + errorNumber + "]";
					writeLog(WARNING,errCode,err_commt);	
					_intWarningCount++;
				}
				
				//業務運用日取得
				DateCtrlStruct dateCtrl = DateCtrlControl.getData(conn,  getSysPlantCd());
				_btmBusinessOprDate = dateCtrl.getBUSINESS_OPR_DATE();
				
				// 業務運用日
				Date _btmBusinessOprDatetemp = _df.parse(_btmBusinessOprDate);
				
				// 「製造納期」 に 過去日(業務運用日より過去) を入力された場合
				if (!isNull(dataStruct.getWORK_ODR_DLV_DATE())) {
					
					if (workOdrDlvDatetemp.compareTo(_btmBusinessOprDatetemp) < 0) {
						errCode = "AD34035";
						//業務メッセージ用エラーメッセージの格納
						err_commt="(SBM1330)CSV行番号 =　[" + errorNumber + "]";
						writeLog(WARNING,errCode,err_commt);	
						_intWarningCount++;
					}
				}
				
				// 「製造着手日」 に 過去日(業務運用日より過去) を入力された場合
				if (!isNull(dataStruct.getOPR_INST_START_DATE())) {
					if (OprInstStartDatetemp.compareTo(_btmBusinessOprDatetemp) < 0) {
						errCode = "AD34036";
						//業務メッセージ用エラーメッセージの格納
						err_commt="(SBM1330)CSV行番号 =　[" + errorNumber + "]";
						writeLog(WARNING,errCode,err_commt);	
						_intWarningCount++;
					}
				}
				
				// 入力された [品目] の “品目手配区分” が1：製番 2：在庫引当型製番の場合
				if (("1".equals(mItemStruct.getMRP_ODR_TYP()) || "2".equals(mItemStruct.getMRP_ODR_TYP()))) {
					// 中間品目：対応する [所要量].“親オーダデマンド番号” が、 Null 以外
					if (!isNull(jobodrStruct.getPARENT_OD_NO())) {
						if (!isNull(jobodrStruct.getDUE_DATE())) {
							Date dueDate = _df.parse(jobodrStruct.getDUE_DATE());
							
							// 中間品の場合で、 [所要量].“要求納期” ＜ 「製造納期」の場合
							if (dueDate.compareTo(workOdrDlvDatetemp) < 0) {
								errCode = "AD34037";
								//業務メッセージ用エラーメッセージの格納
								err_commt="(SBM1330)CSV行番号 =　[" + errorNumber + "]";
								writeLog(WARNING,errCode,err_commt);	
								_intWarningCount++;
							}
						}
					}
					
					// [所要量].“手配着手日” ＞ 「製造着手日」 の場合
					if (!isNull(jobodrStruct.getODR_START_DATE()) && !isNull(dataStruct.getOPR_INST_START_DATE())) {
						Date odrStartDate = _df.parse(jobodrStruct.getODR_START_DATE());
						if (odrStartDate.compareTo(OprInstStartDatetemp) > 0) {
							errCode = "AD34038";
							//業務メッセージ用エラーメッセージの格納
							err_commt="(SBM1330)CSV行番号 =　[" + errorNumber + "]";
							writeLog(WARNING,errCode,err_commt);	
							_intWarningCount++;
						}
					}
					
					// 先行手配製番([製番計画]."製番種別"=2)の最上位品目の場合で、
					//「製造納期」＞min（同製番・製番枝番をキーに要求もとのデマンドを検索し、
					// その[所要量]."要求納期"）になる場合
					if ("2".equals(jobodrStruct.getJOB_ODR_TYP())) {
						// 最上位品目(親オーダデマンド番号がNULL)の場合
						if (isNull(jobodrStruct.getPARENT_OD_NO())) {
									
							List jobOdrAlcList = entity.mselectJobOdrAlc.read(conn,dataStruct);
							if (jobOdrAlcList.isEmpty()) {
								//引当データが無ければ、チェックしない。	
							} else {
								AD0150010Struct jobOdrAlcStruct = 
										(AD0150010Struct)jobOdrAlcList.get(0);
								if (!isNull(jobOdrAlcStruct.getDUE_DATE_BY_ALC())) {
									Date datealcDueDate = 
										_df.parse(jobOdrAlcStruct.getDUE_DATE_BY_ALC());
									
									//「製造納期」＞[所要量]."要求納期"
									if (workOdrDlvDatetemp.compareTo(datealcDueDate) > 0) {
										//引当納期に矛盾があります。
										errCode = "AD00044";
										//業務メッセージ用エラーメッセージの格納
										err_commt="(SBM1330)CSV行番号 =　[" + errorNumber + "]";
										writeLog(WARNING,errCode,err_commt);	
										_intWarningCount++;
									}
								}
							}
						}
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
	 * CSVファイル（作業計画取込）の内容を登録
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

	        // 品目別作業計画登録処理を開始しました。
	        writeLog(INFOMATION,"AD60048");
			for (int i = 0; i < csvList.size(); i++) {

				AD0150010Struct csvStruct = (AD0150010Struct)csvList.get(i);
//				csvStruct.setsSysdate(struct.getsSysdate());
				csvStruct.setsUser_ID(getSysUserCd());
				//時刻管理パラメータ取得
				 AD0150010Struct TIME_CTRLStruct = new AD0150010Struct();
				List TIME_CTRLlist = entity.mselectTIME_CTRL.read(conn,TIME_CTRLStruct);
				if(TIME_CTRLlist.isEmpty()){
					csvStruct.setTIME_CTRL("false");
					_flgTimeCtrl = "false";
				}else{
					csvStruct.setTIME_CTRL(((AD0150010Struct)TIME_CTRLlist.get(0)).getTIME_CTRL());
					_flgTimeCtrl = csvStruct.getTIME_CTRL();
				}
				// [パラメータ].”名前”=’TIME_CTRL’の[パラメータ].”値”=’true’なら
				if ("true".equals(_flgTimeCtrl)) {
					WORK_ODR_DLV_DATE_TIME = "2359";
					OPR_INST_START_DATE_TIME = "2359";
				} else {
					WORK_ODR_DLV_DATE_TIME = "0000";
					OPR_INST_START_DATE_TIME = "0000";
				}
				
				// [ＣＳＶデータ].”製造着手日”がNULLの場合：製造納期により、算出
				if (isNull(csvStruct.getOPR_INST_START_DATE())) {
					//着手日の自動計算
					List ltList = entity.mselectLT.read(conn,csvStruct);
					if (ltList.isEmpty()) {
 						errCode = "ZZ01101";
 						writeLog(ERROR,errCode);	
 				        //品目別作業計画登録処理が異常終了しました。
 				        writeLog(INFOMATION, "AD60047");	
						return false;
					} else {
						AD0150010Struct ltStruct = (AD0150010Struct)ltList.get(0);
						int fixed = new Integer(ltStruct.getFIXED_LT()).intValue();
						int prop = new Integer(ltStruct.getPROP_LT()).intValue();
						int safety = new Integer(ltStruct.getSAFETY_LT()).intValue();
						int prop_lot = new Integer(ltStruct.getPROP_LOT_SIZE()).intValue();
						//作業指示数を切り上げ処理する
						BigDecimal StrOprInstQty = new BigDecimal(csvStruct.getOPR_INST_QTY());
						BigDecimal OprInstQty = StrOprInstQty.setScale(0, BigDecimal.ROUND_UP);
						String strOprInstQty = OprInstQty.toString();
						//品目のリードタイム
						int lt = 
								0 - (fixed + (Integer.parseInt(strOprInstQty)/prop_lot) * prop + safety);
						Date WorkOdrDlvDate = 
								Converter.strToDate(csvStruct.getWORK_ODR_DLV_DATE(), "yyyy/MM/dd");
						//着手日を自動計算する
						Date calcDate = null;
						WorkCalendar MyCal;
						MyCal = new WorkCalendar(conn,getSysUserCd(),getSysProgramId(),getSysPlantCd(),csvStruct.getITEM_CD(),WorkOdrDlvDate,lt,true);
						calcDate = MyCal.calcDate();
						
						String StrOprInstStartDate = 
								Converter.dateToStr(calcDate, "yyyy/MM/dd");
						if(StrOprInstStartDate == null){
							// 業務日付の取得に失敗しました。
	 						errCode = "AD60044";
	 						writeLog(ERROR,errCode);
	 				        //品目別作業計画登録処理が異常終了しました。
	 				        writeLog(INFOMATION, "AD60047");	
							return false;
						} else {
							csvStruct.setOPR_INST_START_DATE(StrOprInstStartDate.substring(0,10));
						}
					}
				}
				
				// 所要量のオーダ情報の追加、所要量の下位デマンドの追加
				String odNoString;
				CommonOd od = 
						new CommonOd(conn,
							getSysPlantCd(),
							getSysUserCd(),
							getSysProgramId());
				// オーダーデマンド番号をセットする
				odNoString = 
				od.addOdInfo(csvStruct.getITEM_CD(),
					Converter.strToDate(
							csvStruct.getWORK_ODR_DLV_DATE() + " " + WORK_ODR_DLV_DATE_TIME, Converter.SLASH_DATE_HOUR_MINUTE),
					Converter.strToDate(
							csvStruct.getOPR_INST_START_DATE() + " " + OPR_INST_START_DATE_TIME, Converter.SLASH_DATE_HOUR_MINUTE),
					Double.parseDouble(csvStruct.getOPR_INST_QTY()),
					3);
				
				csvStruct.setOD_NO(odNoString);
				
				// [品目].“作業実績区分”が、1：出来高実績 の場合、[作業指示伝票] の追加を行う。
				List itemCdList = entity.mselectItem_CD.read(conn, csvStruct);
				mItemStruct = (AD0150010Struct)itemCdList.get(0);
				if ("1".equals(mItemStruct.getOPR_RSLT_TYP())) {
					rtnFlg = insertT_OPR_INST_SLIP (csvStruct,i);
					if(!rtnFlg) {
						conn.rollback();
 				        //品目別作業計画登録処理が異常終了しました。
 				        writeLog(INFOMATION, "AD60047");	
						return false;
					}
				}
	
				// [品目別仕掛]の追加を行う
				rtnFlg = insertT_WORK_IN_PROC_BY_ITEM (csvStruct,i);
				if(!rtnFlg) {
				    //品目別作業計画登録処理が異常終了しました。
				    writeLog(INFOMATION, "AD60047");	
					conn.rollback();
					return false;
				}
				
			}
			//  登録処理が正常に終了した場合
			_intSuccessCount = csvList.size();
	        String succCommt = "(SBM1701)読込件数　=　[" + _intTotalCount + "] "
	        				 + "登録件数　=　[" + _intSuccessCount + "] ";
	        //品目別作業計画登録処理を正常に終了しました。
	        writeLog(INFOMATION, "AD60046", succCommt);	
			// トランザクションの開始
			conn.beginTransWeb();
			conn.commit();
			return true;
		} catch (Exception e) {
			conn.rollback();;
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
			m_med.setFUNCTION_NAME("SQLWORKINPROCBYITEMINTERFACE");
			
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
			callList = m_med.getSQLWORKINPROCBYITEMINTERFACE().call();
			// PL/SQLの実行結果を取得
			medAD0150B001 resultMed = (medAD0150B001) callList.get(0);
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
			
			// [作業計画取込]のデータを取得
			List listTWorkOdrTemp = new ArrayList();
			listTWorkOdrTemp = selectTWorkOdrTemp();
			
			// [作業計画取込]のデータを取得成功
			if (listTWorkOdrTemp != null) {
				//マスタ整合性チェック実施
				if(check_listTWorkOdrTemp(listTWorkOdrTemp)){
	             // 登録処理
					if(insertCsvDate(listTWorkOdrTemp)) {
						// 終了ログ
						writeLog(INFOMATION, "ZZ09002");
					}        
				}else {
					writeLog(INFOMATION, "ZZ09002");
					return BREAK;
				}	
			}

		} catch (FoundationException e) {
			conn.rollback();
			e.printStackTrace();
			throw new BatchAppException("CtrlMain", "main", e.getMessage());			
		} catch (SQLException e) {
			conn.rollback();
			e.printStackTrace();
			throw new BatchAppException("CtrlMain", "main", e.getMessage());
		} catch (Exception e) {
			conn.rollback();
			e.printStackTrace();
			throw new BatchAppException("CtrlMain", "main", e.getMessage());
		} finally{
			try{
				// 作業計画取込の削除
			    m_med.getdeleteT_WORK_ODR_TEMP().delete();
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
			entity = new AD0150010Entity();
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
		public medAD0150B001 m_med=null;

		/**
		 * コンテナクラスインスタンス
		 */
		public ManageContainer m_container=null;

		//////////////////////////////

		public interControl(medAD0150B001 med) throws BatchAppException
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
