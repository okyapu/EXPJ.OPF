/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AK0020/src/com/nec/jp/orteus/metamorBase/AK0020/AK0020B003/CtrlMain.java,v $
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

package com.nec.jp.orteus.metamorBase.AK0020.AK0020B003;

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
import com.nec.jp.orteus.metamorBase.util.AlarmMessage.AlarmMessage;
import com.nec.jp.orteus.metamorBase.util.BusinessLock.BusinessLock;
import com.nec.jp.orteus.metamorBase.common.CollectNumber.Numbering;
import com.nec.jp.orteus.metamorBase.common.util.Converter;
import com.nec.jp.orteus.metamorBase.common01.util.DateConverter;
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessage;
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessageAccessor;
import java.text.SimpleDateFormat;

import com.nec.jp.orteus.expj.util.PrivateConfig;
//}}user_implement_dev:import

/**
 * CLASS     : CtrlMain クラス
 * ファイル・クラス説明
 * @author $Author: shan-xiuqin $
 * @version $Revision: 1.7 $ $Date: 2016/05/23 08:27:52 $
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
	public medAK0020B003 m_med=null;

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
	public CtrlMain(medAK0020B003 med, BatchAppConductor cdr) throws BatchAppException
	{
		// メンバ変数を初期化します
		m_conductor = cdr;
		m_med = med;
		m_control = new interControl(med);

		return;
	}

	//{{user_implement_code
    
    /** エラーリスト */
    List errCodeList = new ArrayList();
    
    /** エラーノート */
    Hashtable errNoteHash = new Hashtable();
    
    /** エラー工場コード */
    Hashtable errPlantCdHash = new Hashtable();
    
    /**
     * エラーノートセッター
     * @param note エラーノート
     */
    public void setErrNote(String note){
     errNoteHash.put(Integer.toString(errCodeList.size() - 1), note);
    }
    
    /**
     * エラー工場コードセッター
     * @param code 工場コード
     */
    public void setErrPlantCd(String code){
     errPlantCdHash.put(Integer.toString(errCodeList.size() - 1), code);
    }
    
	
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
   
    /** バッチパラメータ(共通1) バッチ処理区分 */
    private String _sysBatchType;
    /** バッチパラメータ(共通2)業務ID */
    private String _sysProgramId;
    /** バッチパラメータ(共通3)ユーザID */
    private String _sysUserCd;
    /** バッチパラメータ(共通4)工場コード */
    private String _sysPlantCd;
    /** バッチパラメータ(共通5)削除処理基準年月 */
    private String _sysProcExecDate;
    // バッチクラス共通エラー処理用
    private String errCode = null;		     // バッチエラーコード
    private String errMsg = null;		     // バッチエラーメッセージ
    private String errNote = "";             // バッチエラーメッセージ(備考) 必要に応じて使用。

    // metamorBase業務メッセージ用
    private String businessErrCode = null;   // metamorBase業務メッセージコード
	
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
     * metamorBase業務メッセージの出力を行う。
     * metamorBase業務メッセージの出力には、業務名、ユーザコード、工場コードを必要とする
     *
     * @param conn DBコネクション
     * @param businessName 業務名
     * @param userId ユーザコード
     * @param plantCd 工場コード
     * @return なし
     */
    protected void outBusinessMessage(IDbConnection conn,
                                      String businessName,
                                      String userId,
                                      String plantCd) throws Exception{

        // 特定の業務エラーコードがセットされていない場合
        if (businessErrCode == null) {
            businessErrCode = "ZZ09009";  // バッチ処理を開始できませんでした。
        }

        // 業務メッセージの準備
        BusinessMessageAccessor businessMsgAcc = new BusinessMessageAccessor();
        BusinessMessage businessMsg = new BusinessMessage();
        businessMsgAcc.init(conn);
        businessMsg.setBusinessOperatingName(businessName);
        businessMsg.setUser(userId);
        businessMsg.setPlantCode(plantCd);
        businessMsg.setMessageCode(businessErrCode);
        businessMsg.setData(errNote);
        try {
   Numbering logCd = new Numbering(conn,Numbering.LOG_CD,userId,businessName,plantCd);
   businessMsg.setLogCode(logCd.getNo());
            businessMsgAcc.add(businessMsg);
            // 業務メッセージは、業務プログラム側でコネクションをコミットする
            // 必要がある。所要量計算指示は、業務プログラムでトランザクションを
            // 意識する必要がないため、メイン処理と同じコネクションに対し都度コミット
            // する。
            conn.commit();
        } catch (SQLException e) {
            errCode = "AC00999"; // SQL実行時エラー。
            throw e;
        } catch (Exception e) {
            errCode = "AC53402";  // その他　エラー。
            throw e;
        }
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
    * バッチパラメータ（共通）を設定します。
    * @return 設定に成功した場合は true 、失敗した場合は false を返します。
    * @throws BatchAppException
    */
    private boolean setCommonParams() throws BatchAppException {
     String[] args = m_med.getArgs();

     // バッチパラメータの形式が不正な場合
     if (args.length != 4) {
     writeLogFiles(ERROR, "AK00006");
     return false;
     }

     _sysBatchType = args[0];
     _sysUserCd = args[1];
     _sysPlantCd = args[2];
     _sysProcExecDate = args[3];

     return true;
    }

    /**
    * バッチパラメータ（共通）のチェックを行います。
    * @return 正常の場合true、不正の場合false
    * @throws BatchAppException
     * @throws ParseException 
    */
    private boolean checkCommonParams() throws BatchAppException {
     // バッチ処理区分がNullの場合
     if (isNull(_sysBatchType)) {
     	writeLogFiles(ERROR, "ZZ09023");
     	return false;
     }

     // バッチ処理区分が１、２以外の場合
     if ((!_sysBatchType.equals("1") && !_sysBatchType.equals("2"))) {
     	writeLogFiles(ERROR, "ZZ09024");
     	return false;
     }

		
     // ユーザーコードがNullの場合
     if (isNull(_sysUserCd)) {
     	writeLogFiles(ERROR, "ZZ09025");
     	return false;
     }

     // [ユーザマスタ]に存在しない場合
     if (!isExsistsUserMst(_sysUserCd)) {
     	writeLogFiles(ERROR, "ZZ09026");
     	return false;
     }

     // 工場コードがNullの場合
     if (isNull(_sysPlantCd)) {
     	writeLogFiles(ERROR, "ZZ09027");
     	return false;
     }
     // [工場]に存在しない場合
     if (!isExistsMPlant(_sysPlantCd)) {
     	writeLogFiles(ERROR, "ZZ09028");
     	return false;
     }
     	
/*     // 削除処理基準年月がNullの場合
     if (isNull(_sysProcExecDate)) {    	 
         writeLogFiles(ERROR, "ZZ09029");
         return false;
     }
     // 削除処理基準年月 日付形式チェック
     String deleteDate = _sysProcExecDate + "/01";
     DateConverter dateConv = new DateConverter();
     java.util.Date dateWork = dateConv.str2date(deleteDate);
     if(dateWork == null){
         writeLogFiles(ERROR, "AK00022");
         return false;
     }*/

     
     // 削除処理基準年月 日付のチェック
     // Calendar型の日付を用意
     Calendar calscreenMonthlyDate = Calendar.getInstance();
     Calendar calselectMonthlyDate = Calendar.getInstance(); 
     try {
      //削除処理対象日形式チェック
      calscreenMonthlyDate.setTime(Converter.strToDate(_sysProcExecDate, "yyyy/MM"));
     } catch (ParseException e) {
         writeLogFiles(ERROR, "AK00022");
         return false;
     }
    return true;
    }

    /**
    * [ユーザマスタ]に存在するかを判定します 。
    * @return [ユーザマスタ]に存在する場合はtrue、存在しない場合はfalse
     * @throws BatchAppException 
    */
    private boolean isExsistsUserMst(String userCd) throws BatchAppException {
    	m_med.setUSER_CD(userCd);
    	m_med.getselectUSER_MST().read();
    	return m_med.getselectUSER_MST().hasRecord(false);
    }

    /**
    * [工場]に存在するかを判定します 。
    * @param plantCd 工場コード
    * @return [工場]に存在する場合はtrue、存在しない場合はfalse
    */
    private boolean isExistsMPlant(String plantCd) throws BatchAppException {
    	m_med.setPLANT_CD(plantCd);
    	m_med.getselectM_PLANT();
    	return m_med.getselectM_PLANT().hasRecord(false);
    }
    
    /**
     * ストアドプロシージャ実行
     * @param logMode ログモード
     * @param outputMode 出力モード
     * @param outputPath 出力ファイルパス
     * @param outputName 出力ファイル名
     * @param userId ユーザID
     * @param businessName 業務名
     * @param plantCd 工場コード
     * @param finalMonthlyDate 削除処理対象年月
     * @return boolean true 正常終了 : false 異常終了
     */
    public boolean spExecute(String logMode, String outputMode, String outputPath, 
      String outputName, String userId, String businessName, 
      String plantCd, String finalMonthlyDate) {
     try {
      // ストアドプロシージャのパラメータをセットする
      m_med.setpvc2LogMode(logMode);
      m_med.setpvc2OutputMode(outputMode);
      m_med.setpvc2OutputPath(outputPath);
      m_med.setpvc2OutputName(outputName);
      m_med.setpvc2UserId(userId);
      m_med.setpvc2BusinessName(businessName);
      m_med.setpvc2PlantCd(plantCd);
      m_med.setpvcDeleteProcExecDate(finalMonthlyDate);
   
      ExpjMessage emsg = new ExpjMessage("ZZ01006", 
        "●●●ストアドプロシージャのパラメータセット●●●");
      m_med.getSyslog().info(emsg, userId);
      emsg = new ExpjMessage("ZZ01006", "　　●logModeTyp = " + logMode);
      m_med.getSyslog().info(emsg, userId);
      emsg = new ExpjMessage("ZZ01006", "　　●outputMode = " + outputMode);
      m_med.getSyslog().info(emsg, userId);
      emsg = new ExpjMessage("ZZ01006", "　　●outputPath = " + outputPath);
      m_med.getSyslog().info(emsg, userId);
      emsg = new ExpjMessage("ZZ01006", "　　●outputName = " + outputName);
      m_med.getSyslog().info(emsg, userId);
      emsg = new ExpjMessage("ZZ01006", "　　●userId = " + userId);
      m_med.getSyslog().info(emsg, userId);
      emsg = new ExpjMessage("ZZ01006", "　　●businessName = " + businessName);
      m_med.getSyslog().info(emsg, userId);
      emsg = new ExpjMessage("ZZ01006", "　　●plantCd = " + plantCd);
      m_med.getSyslog().info(emsg, userId);
      emsg = new ExpjMessage("ZZ01006", "　　●finalMonthlyDate = " + finalMonthlyDate);
      m_med.getSyslog().info(emsg, userId);
   
      // ストアドプロシージャの実行
      try {
       emsg = new ExpjMessage("ZZ01006", "●●●　SP実行　●●●");
       m_med.getSyslog().info(emsg, userId);
       m_med.getcallSqlDeleteProc().call();
      } catch (Exception e) {
       errCodeList.add("AK00009");//ストアドプロシージャ実行時エラー
       StringBuffer sb = new StringBuffer();
       sb.append("(SBM0577)ストアドプロシージャ引数：[ ");
       sb.append(logMode + " ");
       sb.append(outputMode + " ");
       sb.append(outputPath + " ");
       sb.append(outputName + " ");
       sb.append(userId + " ");
       sb.append(businessName + " ");
       sb.append(plantCd + " ");
       sb.append(finalMonthlyDate + " ");
       sb.append(" ]");
       
       String errNote = sb.toString();
       //エラーノート追加
       setErrNote(errNote);
       setErrPlantCd(plantCd);
       return false;
      }
     } catch (Exception e) {
      errCodeList.add("AK00007");//バッチパラメータの読み込みに失敗しました
      setErrNote("(SBM0580)ユーザコード：[ " + userId + " ] 工場コード：[ " + plantCd + " ]");
      setErrPlantCd(plantCd);
      ExpjMessage emsg = new ExpjMessage("ZZ01006", 
        "バッチパラメータの読み込みに失敗しました。");
      m_med.getSyslog().severe(emsg, userId);
      return false;
     }
     return true;
    }
   

	//////////////////////////////
	// コードジェネレータは、以下のコードへの上書きを行いません

	/**
	 * CtrlMainクラスの標準コンストラクタ
	 *
		 */
	public CtrlMain(medAK0020B003 med) throws BatchAppException
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
        Numbering logCd = null;       //ログ識別コード採番の準備
       
        // metamorBase業務メッセージ
        BusinessMessageAccessor businessMsgAcc = null;
        BusinessMessage businessMsg = null;     // metamorBase業務メッセージ
        String businessErrCode = null;          // metamorBase業務メッセージコード
       
        // Orteus業務メッセージ
        String memoText = "";         // Orteus業務メッセージ 備考
      
        // 夜間バッチかマニュアルか
        //int batchProcessingTyp = 0;   // 1: 夜間バッチ（自動運転）2: マニュアル（自動運転なし）
      
        // ストアドプロシージャ名
        String functionName = "SQLDELETEHISTORYBYTRIGGER";  // 自動履歴削除処理
      
        // ストアドプロシージャパラメータ
        String logMode = null;             // ログモード
        String outputMode = null;          // 出力モード
        String outputPath = null;          // 出力パス
        String outputName = null;          // 出力ファイル名
        /*String userId = null;              // ユーザID
        String businessName = null;        // 業務名（バッチ処理ID）
        String plantCd = null;             // 工場コード
        String finalMonthlyDate = null;    // 画面の削除処理基準年月*/    
        
        //------------------------------------------------------------------
		// パラメータ取得
		String[] args = m_med.getArgs();
        
		// バッチパラメータ出力
		System.out.println("-------------------------------------------------");
		System.out.println("execute " + m_med.getProgname());
		for (int i = 0; i < args.length; i++) {
			System.out.println("args[" + i + "]:" + args[i]);
		}
        
        // 業務名（バッチ処理ID）の取得
        Class myClass = this.getClass();
        _sysProgramId = myClass.getName();
        _sysProgramId = _sysProgramId.substring(_sysProgramId.length() - 19, 
        		_sysProgramId.length() - 9);
		
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
		try{     // -- catch try0
			
			// DB接続取得処理
			conn = m_conductor.m_transactionConn;
			
	        ExpjMessage emsg = new ExpjMessage();
	        
	        // バッチパラメータtableから、ストアド共通パラメータを読み込む
	        m_med.setprogramCd(_sysProgramId);
	        m_med.setfunctionName(functionName);
	        AbstractBatchAppEntity sysBatParam = m_med.getreadSysBatParm();
	        
	        try {
	         sysBatParam.read();
	        } catch (Exception e) {
	         errCodeList.add("AK00007"); // バッチパラメータの読み込みに失敗しました
	         setErrNote("(SBM0580)ユーザコード：[ " + _sysUserCd + " ] 工場コード：[ " + _sysPlantCd + " ]");
	         setErrPlantCd(_sysPlantCd);
	         emsg = new ExpjMessage("ZZ01006", "バッチパラメータの読み込みに失敗しました");
	         m_med.getSyslog().severe(emsg, _sysUserCd);
	         throw e;
	        }			
	        
	        if (sysBatParam.next()) {	        	
	        	logMode = m_med.getlogModeTyp().toString();
	        	outputMode = m_med.getoutputModeTyp().toString();
	        	outputPath = m_med.getfilePath();
	        	outputName = m_med.getfileName();
	        } else {	 
	        	writeLogFiles(ERROR, "ZZ01006", "(SBM0576)バッチパラメータデータが存在しません");
	            businessErrCode = "ZZ09013"; // 
	            //errCode = businessErrCode;
	            errNote = "(SBM0576)バッチパラメータデータが存在しません";
				outBusinessMessage(conn, _sysProgramId, _sysUserCd, _sysPlantCd);
	        	Exception e = new Exception();
	        	emsg = new ExpjMessage("ZZ01006", "バッチパラメータデータが存在しません");
	        	throw e;
	        }
           
             // 業務メッセージの準備
             businessMsgAcc = new BusinessMessageAccessor();
             businessMsg = new BusinessMessage();
             businessMsgAcc.init(conn);
             businessMsg.setBusinessOperatingName(_sysProgramId);
             businessMsg.setUser(_sysUserCd);
             businessMsg.setPlantCode(_sysPlantCd);
             try{   // try1 --
                 // 業務ロックをかける
                 try {
                  Lock = new BusinessLock(conn, _sysUserCd, _sysPlantCd);
                  lockCancelKey = Lock.doLock(_sysProgramId);  // 解除キーの取得
                  conn.commit();
                  if (lockCancelKey == -1) throw new Exception();
                 } catch (Exception e) {
                  businessErrCode = "ZZ01001"; // 業務ロックされているため起動できません
                  errCode = businessErrCode;
                  throw e;
                 }
                 
     	        // SP実行
     	        if (!spExecute(logMode, outputMode, outputPath, outputName, _sysUserCd, 
     	        		_sysProgramId, _sysPlantCd, _sysProcExecDate)) {
     	        	//結果がfalseの場合もロック解除失敗のエラー
     		        emsg = new ExpjMessage("ZZ01006", 
     		             "◎◎◎　業務ロック解除　◎◎◎ " + _sysPlantCd);
     		        m_med.getSyslog().info(emsg, _sysUserCd);
     		       if (!Lock.doUnLock(_sysProgramId, lockCancelKey)) {
     		            throw new FoundationException("CtrlMain", "main", "ZZ01004");
     		           
     		       }        
     	        }
    			
     	        conn.commit();
            	 
             }catch(Exception e){ // -- try1 catch
                 
                 if (errCode == null) {
                  errCode = "AC53402";  // その他　Ｅｒｒｏｒ
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
                  //outBusinessMessage(conn,_sysProgramId,_sysUserCd,_sysPlantCd);
                  try {
                   logCd = new Numbering(m_conductor.m_transactionConn,Numbering.LOG_CD,args[1],_sysProgramId,_sysPlantCd);
                   businessMsg.setLogCode(logCd.getNo());
                   businessMsgAcc.add(businessMsg);
                  } catch (SQLException ex) {
                   ex.printStackTrace();
                  }
                 }
                 memoText = errMsg; // 備考メッセージ
                 throw e;
            	 
             }finally{ // -- try1 finally
                 try {
                     // 業務ロック解除	                 
                     Lock.doUnLock(_sysProgramId, lockCancelKey);
                     conn.commit();
                    } catch (FoundationException e) {
                     e.printStackTrace();
                     businessErrCode = "ZZ01004";  // 業務ロックの解除に失敗しました。
                 
                     // 業務メッセージの登録（業務ロック解除失敗時）
                     businessMsg.setMessageCode(businessErrCode);
                     businessMsg.setData("");
                     try {
                      logCd = new Numbering(m_conductor.m_transactionConn,Numbering.LOG_CD,_sysUserCd,_sysProgramId,_sysPlantCd);
                      businessMsg.setLogCode(logCd.getNo());
                      businessMsgAcc.add(businessMsg);
                     } catch (SQLException ex) {
                      ex.printStackTrace();
                     }
                     AlarmMessage msg = new AlarmMessage(businessErrCode);
                     errMsg = "[" + businessErrCode + "]" + msg.getMessage();
                     memoText = errMsg; // 備考メッセージ
                 
                    }   
            	 
             }   // -- end try1
			
		}catch(Exception e){     // -- catch try0
		       
	        if (errCode == null) {
	         errCode = "AC53402";  // その他　Ｅｒｒｏｒ
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
		public medAK0020B003 m_med=null;

		/**
		 * コンテナクラスインスタンス
		 */
		public ManageContainer m_container=null;

		//////////////////////////////

		public interControl(medAK0020B003 med) throws BatchAppException
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
