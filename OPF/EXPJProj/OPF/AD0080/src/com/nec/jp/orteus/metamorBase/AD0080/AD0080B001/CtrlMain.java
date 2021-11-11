/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AD0080/src/com/nec/jp/orteus/metamorBase/AD0080/AD0080B001/CtrlMain.java,v $
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

package com.nec.jp.orteus.metamorBase.AD0080.AD0080B001;

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
import com.nec.jp.orteus.metamorBase.AD0040.*;
import com.nec.jp.orteus.metamorBase.common.CollectNumber.CollectNumber;
import com.nec.jp.orteus.metamorBase.common02.CommonOd.CommonOd;
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessage;
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessageAccessor;
import com.nec.jp.orteus.expj.lot.BizCommon;
import com.nec.jp.orteus.expj.pr.rcvissue.process.AutoIssue;
import com.nec.jp.orteus.expj.pr.rcvissue.process.IssueProcess;
import com.nec.jp.orteus.expj.pr.rcvissue.process.IssueRemain;
import com.nec.jp.orteus.expj.pr.rcvissue.process.RcvCancel;
import com.nec.jp.orteus.expj.pr.rcvissue.process.ValidateWh;
import com.nec.jp.orteus.expj.pr.rcvissue.process.WhAutoIssueProc;
import com.nec.jp.orteus.expj.util.Calculate;
import com.nec.jp.orteus.expj.util.Converter;
import com.nec.jp.orteus.expj.util.DateCtrl;
import com.nec.jp.orteus.expj.util.DateTool;
import com.nec.jp.orteus.expj.util.ExpjException;
import com.nec.jp.orteus.expj.util.ExpjMessage;
import com.nec.jp.orteus.expj.util.Numbering;
import com.nec.jp.orteus.expj.util.PrivateConfig;

import java.math.BigDecimal;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import utils.system;
//}}user_implement_dev:import

/**
 * CLASS     : CtrlMain クラス
 * ファイル・クラス説明
 * @author $Author: geng-jia $
 * @version $Revision: 1.17 $ $Date: 2015/12/22 09:52:49 $
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
	public medAD0080B001 m_med=null;

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
	public CtrlMain(medAD0080B001 med, BatchAppConductor cdr) throws BatchAppException
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
	public CtrlMain(medAD0080B001 med) throws BatchAppException
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

    //-++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
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
    /** メッセージHashMap */
    private Map tempHashMap = null;
   
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
        writeLogFiles(logLevel, code, null);
        if (!isNull(dataStr)) {
         writeLogFiles(logLevel, "ZZ01006", dataStr);
        }
        writeLogDB(code, null, dataStr);
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

     // 工場コードがNullの場合
     if (isNull(getSysPlantCd())) {
      writeLogFiles(ERROR, "ZZ09027");
      return false;
     }   
     // 業務IDがNullの場合
     if (isNull(getSysProgramId())) {
      writeLogFiles(ERROR, "ZZ09029");
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
     * バッチパラメータ(共通5)業務運用日を返します。
     * @return 業務運用日
     */
    private String getBusinessDate() {
     return m_med.getArgs()[4];
    }
    
    /**
     * バッチパラメータ(6)CSV取込時間を返します。<br>
     * @return CSV取込時間From
     */
    private String getCsvIntakeFrom() {
    	if(isNull(m_med.getArgs()[5])) {
    		return null;
    	}
    	return m_med.getArgs()[5];
    }
    
    /**
     * バッチパラメータ(7)CSV取込時間を返します。<br>
     * @return CSV取込時間To
     */
    private String getCsvIntakeTo() {
    	if(isNull(m_med.getArgs()[6])) {
    		return null;
    	}
    	return m_med.getArgs()[6];
    }
    
    /**作業実績entity*/
    AD0040010Entity entity = null;
    
    /**作業実績entity*/
    AD0040010Struct struct = null;
    
    /**エラーコード*/
    String errCode = null;
    
    String company_cd = null;
    
    /**
     * 更新処理メイン
     *
     * @param	userId			ユーザコード
     * @param	strProgramName	プログラム名
     * @param   businessDate    業務運用日
     * @param	csvIntakeFrom   CSV取込時間From
     * @param	csvIntakeTo		CSV取込時間To
     * @return	なし
     * @throws FoundationException 
     * @throws SQLException 
     */
    private void exeOprRsltCsvLoad (
            String userId, 
            String strProgramName, 
            String businessDate,
            String csvIntakeFrom,
            String csvIntakeTo) throws Exception {
    	try {
    		
	        // 作業実績取込バッチ処理を開始しました。
	        writeLog(INFOMATION,"AD00201");
	        
	        // 作業実績entity
	        entity = new AD0040010Entity();
	        // 作業実績struct
	        struct = new AD0040010Struct();
	      
	        // 読込件数
	        long readCnt = 0;
	        // 登録件数
	        long insertCnt = 0;
	        // 製品フラグ
	 		boolean productFlg = false;
	        
	        struct.setUSER_CD(userId);
	        struct.setPRG_NM(strProgramName);
	        
	        // メッセージプロパティファイル
	        ResourceBundle _messages = CoreTools.getResourceBundle("ExpjMessage", CoreTools.getLocale(userId));
	        
	        //システムパラメータ(時間管理)取得
	        GetTimeCtrl();

	        //会社コード.getSysMyCompanyCd();
			m_med.getselSYS_MY_COMPANY_CD().read();
			if(!m_med.getselSYS_MY_COMPANY_CD().next()) {
				// 会社コード
	 			writeLog(ERROR, "BZ00179");
	 			throw new Exception();
			}
	        company_cd = m_med.getCOMPANY_CD();
	        // システムパラメータ「作業実績CSV取込時現品票発行」を取得する
	 		PrivateConfig privateConfig = new PrivateConfig(conn);
	 		String identCard = privateConfig.getString("IDENT_CARD");
	 		if(isNull(identCard)) {
	 			writeLog(ERROR, "AD00222");
	 			throw new Exception();
	 		}
	 		
	 		// Add Start 20140219 huang-lh
	 		// システムパラメータ「工程保管場所の在庫を管理」を取得する
	 		_processManageFlg  = privateConfig.getString("PROCESS_MANAGE_FLG");
	 		if(isNull(_processManageFlg)) {
	 			writeLog(ERROR, "AD00231");
	 			throw new Exception();
	 		} else {
	 			if(!"0".equals(_processManageFlg) && !"1".equals(_processManageFlg)) {
	 				writeLog(ERROR, "AD00231");
		 			throw new Exception();
	 			}
	 		}
	 		
	 		// システムパラメータ「不良在庫を工程管理」を取得する
	 		_defectManageFlg  = privateConfig.getString("DEFECT_MANAGE_FLG");
	 		if(isNull(_defectManageFlg)) {
	 			writeLog(ERROR, "AD00232");
	 			throw new Exception();
	 		} else {
	 			if(!"0".equals(_defectManageFlg) && !"1".equals(_defectManageFlg)) {
	 				writeLog(ERROR, "AD00232");
		 			throw new Exception();
	 			}
	 		}
	 		// Add End 20140219 huang-lh

	 		// 現品票印刷対象製品区分
	 		String sysPRODUCT_TYP = privateConfig.getString("PRODUCT_TYP");
	 		
	        // 業務運用日
	        struct.seth_BUSINESS_OPR_DATE(businessDate);	
			
		    // 作業実績取込処理
		    AD0040010Struct tempStruct = null;
		    AD0040010Struct headerStruct = null;
		    List tempList = null;
		    List errList = null;
		    List hashList = null;
		    tempHashMap = new HashMap();		    
		    medAD0080B001 tempMed = new medAD0080B001();
		    String oprRsltTempCtlNo = null;
		    List oprRsltList = new ArrayList();
		    boolean compltFlg = false;
		    // 更新成功フラグ
		    int updFlg = 0;
		    int errFlg = 0;
		    
		    m_med.setINTAKE_TERM_FROM(csvIntakeFrom);
		    m_med.setINTAKE_TERM_TO(csvIntakeTo);
		    m_med.getOPR_INST_LIST().read();
		    
		    while(m_med.getOPR_INST_LIST().next()) {
		        tempStruct = new AD0040010Struct();
		        compltFlg = false;	
		        updFlg = 0;
		        errFlg = 0;
		        tempStruct.setIN_OPR_INST_CD(m_med.getOPR_INST_CD());
		        tempStruct.setUSER_CD(userId);
		        tempStruct.setPRG_NM(strProgramName);
			    m_med.setINTAKE_TERM_FROM(csvIntakeFrom);
			    m_med.setINTAKE_TERM_TO(csvIntakeTo);	
	    		m_med.setUSER_CD(userId);
	    		m_med.setPRG_NM(strProgramName);

				// 作業実績CSVデータ取得
		        oprRsltList = selectOprRsltData(csvIntakeFrom, csvIntakeTo);
		        readCnt = readCnt + oprRsltList.size();

				// 「作業指示番号」 が [作業指示伝票] に存在チェック
				tempList = entity.mSelectOprInstSlip.read(conn, tempStruct);
				if(tempList.isEmpty()) {
					// 作業指示伝票データが存在しません。
					errCode = "AD30587";					
					updFlg = 1;
					errFlg = 1;
				}
				if(updFlg ==0) {
					// 系列別仕掛情報取得
			        tempList = entity.mSelectHeader.read(conn, tempStruct);
			        if(tempList.isEmpty()) {
			        	errCode = "ZZ01101";
			        	updFlg = 1;
			        	errFlg = 1;
			        } else {
			        	headerStruct = (AD0040010Struct)tempList.get(0);
			        	struct.setPLANT_CD(headerStruct.getPLANT_CD());
				        tempStruct.setPLANT_CD(headerStruct.getPLANT_CD());
				        
				        if(getSysPlantCd().equals(struct.getPLANT_CD()) == false){
	                       	errCode = "AF00177";
				        	updFlg = 1; 
				        	errFlg = 1;
	                        }
			        }
				}
		        // 品目別仕掛情報取得
		        AD0040010Struct workItemStruct = null;
		        if(updFlg ==0) {
			        tempList = entity.mSelectWorkItem.read(conn, headerStruct);
			        if (tempList.isEmpty()) {
			        	errCode = "ZZ01101";
			        	updFlg = 1;
			        	errFlg = 1;
			        } else {
			        	workItemStruct = (AD0040010Struct)tempList.get(0);
			        }
		        }
		        
		        // 出来高の場合エラー
		        if(updFlg ==0) {
		        	if (workItemStruct.getOPR_RSLT_TYP() == null
							|| "1".equals(workItemStruct.getOPR_RSLT_TYP())) {
			        	errCode = "ZZ01101";
			        	updFlg = 1;
			        	errFlg = 1;
			        }
		        }
		        
		        // 未指示の場合エラー
		        if(updFlg ==0) {
		        	if (headerStruct.geth_WORK_STS_TYP() == null
							|| "1".equals(headerStruct.geth_WORK_STS_TYP())) {
						errCode = "AD30804";
						updFlg = 1;
						errFlg = 1;
					}
		        }
				
				// 作業状態区分の完了エラー
		        if(updFlg ==0) {
					if ("9".equals(headerStruct.geth_WORK_STS_TYP())) {
						errCode = "AD00204";
						updFlg = 1;
						errFlg = 1;
					}
		        }
		        conn.beginTransWeb();
				loop:
		        	for(int i = 0; i < oprRsltList.size(); i++) {
		        		errList = new ArrayList();
		        		hashList=new ArrayList();
			    		tempMed = (medAD0080B001)oprRsltList.get(i);
			    		oprRsltTempCtlNo = tempMed.getOPR_RSLT_TEMP_CTL_NO();
			    		m_med.setOPR_RSLT_TEMP_CTL_NO(oprRsltTempCtlNo);
			    		m_med.getlockT_OPR_RSLT_TEMP().read();
			    		
			    		// 作業実績取込管理番号{0}を処理します。
			    		writeLogFiles(INFOMATION, "AD00202", oprRsltTempCtlNo);
			    		if(errFlg==1) {
			    			writeLogFiles(ERROR,errCode);
			    			setMessageHash(oprRsltTempCtlNo,updFlg,_messages.getString(errCode));
			    			continue;
			    		}
			    		
			    		// 良品累計、不良品累計取得
			    		m_med.setOPR_INST_CD(tempMed.getOPR_INST_CD());
			    		m_med.getselectSumQty().read();
			    		m_med.getselectSumQty().next();
			    		headerStruct.setSUM_ACPT_QTY(m_med.getSUM_ACPT_QTY());
			    		headerStruct.setSUM_DEFECT_QTY(m_med.getSUM_DEFECT_QTY());
			    		
			    		// Mod Start 20140219 huang-lh
			    		
			    		//作業計画番号と仕掛作業系列番号を保持する
				        tempMed.setWORK_ODR_CD(headerStruct.getWORK_ODR_CD());
				        tempMed.setPROC_NO(headerStruct.getPROC_NO());
				        m_med.setWORK_ODR_CD(tempMed.getWORK_ODR_CD());
				        m_med.setPROC_NO(tempMed.getPROC_NO());
				        
			    		// 作業系列別仕掛から、最初工程情報を取得する
			    		m_med.getCheckFirstWork().read();
			    		m_med.getCheckFirstWork().next();
			    		
			    		// 最初工程かどうか判断する
			    		if (m_med.getOPR_INST_CD().equals(m_med.getFIRST_OPR_INST_CD())) {
			    			// 最初工程場合
			    			m_med.setFIRST_WORK_FLG("1");
			    			tempMed.setFIRST_WORK_FLG("1");
			    			
			    			// 次工程情報を取得する
				    		m_med.getGetNextWorkInfo().read();
				    		m_med.getGetNextWorkInfo().next();
				    		tempMed.setNEXT_WH_CD(m_med.getNEXT_WH_CD());
				    		tempMed.setNEXT_WORK_ODR_CD(m_med.getNEXT_WORK_ODR_CD());
				    		tempMed.setNEXT_OPR_INST_CD(m_med.getNEXT_OPR_INST_CD());
				    		tempMed.setNEXT_PROC_NO(m_med.getNEXT_PROC_NO());
				    		tempMed.setNEXT_WS_CD(m_med.getNEXT_WS_CD());
			    		} else {
			    			// 最初工程でない場合
			    			m_med.setFIRST_WORK_FLG("0");
			    			tempMed.setFIRST_WORK_FLG("0");
			    			
			    			// 前工程情報を取得する
				    		m_med.getGetPrevWorkInfo().read();
				    		m_med.getGetPrevWorkInfo().next();
				    		tempMed.setPREV_WORK_ODR_CD(m_med.getPREV_WORK_ODR_CD());
				    		tempMed.setPREV_OPR_INST_CD(m_med.getPREV_OPR_INST_CD());
				    		tempMed.setPREV_PARTIAL_PRD_NO(m_med.getPREV_PARTIAL_PRD_NO());
				    		tempMed.setPREV_PROC_NO(m_med.getPREV_PROC_NO());
				    		tempMed.setPREV_WH_CD(m_med.getPREV_WH_CD());
			    			// 最終工程場合
			    			if (!"1".equals(headerStruct.geth_FINAL_PROC_FLG())){
			    				// 次工程情報を取得する
					    		m_med.getGetNextWorkInfo().read();
					    		m_med.getGetNextWorkInfo().next();
					    		tempMed.setNEXT_WH_CD(m_med.getNEXT_WH_CD());
					    		tempMed.setNEXT_WORK_ODR_CD(m_med.getNEXT_WORK_ODR_CD());
					    		tempMed.setNEXT_OPR_INST_CD(m_med.getNEXT_OPR_INST_CD());
					    		tempMed.setNEXT_PROC_NO(m_med.getNEXT_PROC_NO());
					    		tempMed.setNEXT_WS_CD(m_med.getNEXT_WS_CD());
			    			}
				    		
			    			
			    		}
			    		structCopy(tempStruct, tempMed, headerStruct);
			    		
			    		// 保管区の倉庫区分を取得する
			    		m_med.setNEXT_WH_CD(tempMed.getNEXT_WH_CD());
			    		m_med.getSelectWhTyp().read();
			    		m_med.getSelectWhTyp().next();
			    		tempMed.setWH_TYP(m_med.getWH_TYP());
			    		
			    		// 作業実績の同じ作業指示番号の保管区コードの数量を取得する
			    		
			    		m_med.setOPR_INST_CD(tempMed.getOPR_INST_CD());
			    		m_med.setWH_CD(tempStruct.getWH_CD());
			    		m_med.getSelectWhCdCount().read();
			    		m_med.getSelectWhCdCount().next();
			    		tempMed.setWH_CD_COUNT(m_med.getWH_CD_COUNT());
			    		
			    		// 作業系列別仕掛]から取得する[作業系列別仕掛].“仕掛内外作区分”が2：外作のレコードを取得する
			    		m_med.getSelectTworkProcByProc().read();
			    		m_med.getSelectTworkProcByProc().next();
			    		tempMed.setDATA_COUNT(m_med.getDATA_COUNT());
			    		
			    		// Mod End 20140219 huang-lh
			    		
			    		// 分作回数取得
			    		if(isNull(tempStruct.getPARTIAL_PRD_NO())) {  				
		    				tempList = entity.mSelectMaxPrdNo.read(conn, tempStruct);
		    				tempStruct.setPARTIAL_PRD_NO(((AD0040010Struct)tempList. get(0)).getPARTIAL_PRD_NO());	
			    		} else {
		    	    		// 分作回数＋１のセット
		    	    		tempStruct.setPARTIAL_PRD_NO(Calculate.add(tempStruct.getPARTIAL_PRD_NO(), "1"));
			    		}
			    		
			    		// 作業完了フラグ設定
			    		tempStruct.setc_COMPLETE("0"); // 初期値
			    		if(i == oprRsltList.size()-1)  {
			    			if(compltFlg || "1".equals(tempMed.getOPR_CMPLT_FLG())|| "2".equals(tempMed.getOPR_CMPLT_FLG())) {
			    				tempStruct.setc_COMPLETE("1");
			    			}	
			    		} else {
			    			if("1".equals(tempMed.getOPR_CMPLT_FLG()) || "2".equals(tempMed.getOPR_CMPLT_FLG())) {
			    				compltFlg = true;
			    				tempStruct.setc_COMPLETE("0");
			    			}
			    		}
			    		
			    		// 作業実績CSV取込データのチェック
			    		if(dataCheck(tempStruct, headerStruct, tempMed) == 1) {
			    			updFlg = 1;
			    			setMessageHash(oprRsltTempCtlNo,updFlg,_messages.getString(errCode));
			    			continue;
			    		}	
			    		
			    		//-------------------ロット情報登録処理-----------------
			    		if("1".equals(headerStruct.getLOT_CTRL_FLG()) &&   // ロット管理品目        
			    				"1".equals(headerStruct.geth_FINAL_PROC_FLG()) &&  // 最終系列
			    				Calculate.compare(tempStruct.getACPT_QTY(), "0") > 0 ) { // 「良品数」　≠　０
			    			
			    			// ロット番号採番区分 ＝ 手入力
			    			if("0".equals(headerStruct.getLOT_NUMBERING_TYP())) {
								// ロット管理検索
								tempList = entity.mT_LOT_CTRL.read(conn,tempStruct);
								// ロット情報登録
								if(tempList.isEmpty()) {
									m_med.setLOT_NO(tempStruct.getLOT_NO());
									m_med.setITEM_CD(tempStruct.getITEM_CD());
									m_med.setOPR_DATE(tempStruct.getOPR_DATE());
						    		m_med.setUSER_CD(userId);
						    		m_med.setPRG_NM(strProgramName);
									// 賞味期限自動計算を行う。
									BizCommon bc = new BizCommon(conn, userId, strProgramName, headerStruct.getPLANT_CD());
									// 賞味期限自動計算共通部品
									List resultList = bc.calcBestBeforeFd(tempStruct.getITEM_CD(), tempStruct.getOPR_DATE().substring(0,10));
									// 結果ステータスが正常終了
									if (bc.getResultStatus().intValue() == 1) {
										if (resultList != null && resultList.size() > 0) {
											String result1 = "";
											result1 = (String) resultList.get(0);
											if(result1.length() < 10) {
												m_med.setBEST_BEFORE_DATE(null); // 賞味期限
											} else {
												m_med.setBEST_BEFORE_DATE(result1); // 賞味期限
											}
										}
									} else {
										// 結果ステータスが正常終了以外
										if (resultList != null && resultList.size() > 1) {
											// 引数のエラーコードでエラーメッセージを表示し
											m_med.setBEST_BEFORE_DATE(null); // 賞味期限
											errCode = "AE22056";
											writeLogFiles(ERROR, errCode);
											updFlg = 9;
											setMessageHash(oprRsltTempCtlNo,updFlg,_messages.getString(errCode));
											continue;
										}
									}
									m_med.getT_LOT_CTRL().create();
								}
			    			} else {
			    				// 在庫ロット番号の自動採番を行う。
			    				if(isNull(tempStruct.getLOT_NO())) {
			    					BizCommon bc = new BizCommon(conn, userId, strProgramName, headerStruct.getPLANT_CD());
							 		List retList = bc.getsetLotNumberingFd(tempStruct.getITEM_CD(), tempStruct.getOPR_DATE());
		
									//正常終了の場合
									if(bc.getResultStatus().intValue() == 1){
										//在庫ロット番号の取得
										if(!retList.isEmpty()){
											String result1 = (String)retList.get(0);
											tempStruct.setLOT_NO(result1);
										}
									//警告 or 異常終了の場合
									} else {
										// ロット番号の採番に失敗しました。
										errCode = "AD00214";
										writeLogFiles(ERROR,errCode);
										updFlg = 9;
										setMessageHash(oprRsltTempCtlNo,updFlg,_messages.getString(errCode));
										continue;
									}
			    				} else {
									// ロット管理検索
									tempList = entity.mT_LOT_CTRL.read(conn,tempStruct);
									// ロット情報登録
									if(tempList.isEmpty()) {
										// 在庫ロット番号がロット管理に存在しません。
										errCode = "AD00220";
										writeLogFiles(ERROR,errCode);
										updFlg = 1;
										setMessageHash(oprRsltTempCtlNo,updFlg,_messages.getString(errCode));
										continue;
									}
			    				}
			    			}
			    		}
			    		
			    		//-------------------作業実績登録------------------------
			    		entity.mInsertOprRslt.create(conn,tempStruct); 
			    		
			    		//---------[作業系列別仕掛]、[品目別仕掛]の更新------------
			    		if("1".equals(tempStruct.getc_COMPLETE())) { // 作業完了の場合
			    			AD0040010Struct oprRsltStruct = new AD0040010Struct();
			    			oprRsltStruct.setOPR_INST_CD(tempStruct.getOPR_INST_CD());
			    			oprRsltStruct.setUPDATE_WORK_STS_TYP("9");
			    			oprRsltStruct.setWORK_ODR_CD(headerStruct.getWORK_ODR_CD());
			    			oprRsltStruct.setUSER_CD(userId);
			    			oprRsltStruct.setPRG_NM(strProgramName);
			    			
							//同作業指示番号中の最遅作業日の取得（[作業実績]."作業実績作業日"）
							tempList = entity.mT_OPR_RSLT.read(conn, oprRsltStruct);
							if (tempList.isEmpty()) {
								errCode = "ZZ01101";
								writeLogFiles(ERROR,errCode);
								updFlg = 1;
								setMessageHash(oprRsltTempCtlNo,updFlg,_messages.getString(errCode));
								continue;
							}
							oprRsltStruct.setOPR_DATE(((AD0040010Struct)tempList.get(0)).getOPR_DATE());
							
							//作業系列仕掛更新処理
							entity.mUpdateWorkProc.update(conn, oprRsltStruct);
							

							//デマンド完了（所要量）
							String strOprDate = tempStruct.getOPR_DATE().substring(0,10);
							CommonOd od = new CommonOd(conn, headerStruct.getPLANT_CD(), userId, strProgramName);
							od.changeDemandForComplete(
									headerStruct.getWORK_ODR_CD(),
									headerStruct.getWORK_IN_PROC_CD(),
									Converter.strToDate("false".equalsIgnoreCase(struct.getTIME_CTRL()) ? 
											strOprDate + " " + "00:00" : tempStruct.getOPR_DATE().substring(0,13) + ":" + tempStruct.getOPR_DATE().substring(13,15), 
											Converter.SLASH_DATE_HOUR_COLON_MINUTE)
							);
							// 作業系列が最終系列の場合
							if("1".equals(headerStruct.geth_FINAL_PROC_FLG())) {
								// 品目別仕掛更新処理
								entity.mUpdateWorkItem.update(conn, oprRsltStruct);
								
								// オーダ完了（所要量）
								od.changeOrderForComplete(headerStruct.getOD_NO(),-1);
								
								AD0040010Struct tOdUpdateStruct = new AD0040010Struct();
								tempList = entity.mSelectItem.read(conn,headerStruct);
								if (!tempList.isEmpty()) {
									tOdUpdateStruct = (AD0040010Struct)tempList.get(0);
								}
								// [品目].工数管理品目区分 = 1:工数管理品目の場合
								if (tOdUpdateStruct.getMANHOUR_TYP() != null
										&& "1".equals(tOdUpdateStruct.getMANHOUR_TYP())){
									tOdUpdateStruct.setDM_STS_TYP("9");
									tOdUpdateStruct.setISSUE_CMPLT_DATE(tempStruct.getOPR_DATE());
									tOdUpdateStruct.setUSER_CD(userId);
									tOdUpdateStruct.setPRG_NM(strProgramName);
									tOdUpdateStruct.setOD_NO(headerStruct.getOD_NO());
									// デマンド完了（所要量）
									entity.mUPDATE_T_OD.update(conn,tOdUpdateStruct);
								}
							}
			    		}
			    		
			    		//---------------------自動出庫処理----------------------
			    		WhAutoIssueProc whAutoIssueProc = new WhAutoIssueProc(conn,
								tempStruct.getPLANT_CD(),
								tempStruct.getUSER_CD(),
								tempStruct.getPRG_NM());
						WhAutoIssueProc.AutoIssueParam autoIssueParam = whAutoIssueProc.new AutoIssueParam();
						
						// パラメータのセット
						autoIssueParam.m_WORK_ODR_CD = headerStruct.getWORK_ODR_CD();
						autoIssueParam.m_WORK_IN_PROC_CD = headerStruct.getWORK_IN_PROC_CD();
						autoIssueParam.m_PARTIAL_PRD_NO = Integer.parseInt(tempStruct.getPARTIAL_PRD_NO());
						autoIssueParam.m_OPR_RSLT_CRCT_NO = 0;
						autoIssueParam.m_PUCH_ODR_CD = null;
						autoIssueParam.m_ACPT_NO = 0;
						autoIssueParam.m_ACPT_RSLT_CRCT_NO = 0;
						autoIssueParam.m_RCV_ISSUE_TYP = 2;
						autoIssueParam.m_RCV_ISSUE_DATE = tempStruct.getOPR_DATE();
						autoIssueParam.m_RCV_ISSUE_RSLT_NO = Calculate.add(tempStruct.getACPT_QTY(), tempStruct.getDEFECT_QTY());
						autoIssueParam.m_RCV_ISSUE_CMPLT_FLG = Integer.parseInt(tempStruct.getc_COMPLETE());
						autoIssueParam.m_PLANT_CD = headerStruct.getPLANT_CD();
						
						AutoIssue autoIssue = new AutoIssue(conn, headerStruct.getPLANT_CD(), userId, strProgramName);
						
						// 自動出庫実行
						boolean result = autoIssue.AutoIssueOpr(autoIssueParam);
						
						String[] message;
						if(result){
							// 業務アラームがあれば出力する。
							for(int m=0; m<autoIssue.getWarnList().size(); m++){
								message = (String[])autoIssue.getWarnList().get(m);
								writeLogFiles(WORNING, message[0], message[1]);
							}
						}else{
							// 業務エラーの出力
							for(int n=0; n<autoIssue.getErrorList().size(); n++){
								message = (String[])autoIssue.getErrorList().get(n);
								errCode = message[0];
								errList.add(errCode);
								errList.add( message[1]);
								writeLogFiles(ERROR, errCode, message[1]);							
							}
							updFlg = 9;
							StringBuffer buffer = new StringBuffer();
			        		String code  = null;
			        		String value[] = new String[1];
			        		for(int m = 0; m < errList.size(); m+=2) {
			        			code = String.valueOf(errList.get(m));
			        			value[0] = String.valueOf(errList.get(m+1));
			        			buffer.append(MessageFormat.format(_messages.getString(code), value) + " ");
			        		}
							setMessageHash(oprRsltTempCtlNo,updFlg,buffer.toString());
							continue;
						}
						// システムパラメータ：　”工程保管場所の在庫を管理する”　を　”ＯＮ”　に設定した場合、以下の処理を行う
						// 品目の工程在庫の管理を行う
						if ("1".equals(_processManageFlg)) {
							updFlg =ItemWorkManager(tempStruct,headerStruct);
							// エラー発生場合
							if (updFlg != 0) {
								setMessageHash(oprRsltTempCtlNo,updFlg,_messages.getString(errCode));
								continue loop;
							}
						}
						
						// ------------------------入庫処理--------------------
						if("1".equals(headerStruct.geth_FINAL_PROC_FLG())) {
							//製番のチェック
							String jobOdrNo = headerStruct.getJOB_ODR_CD();
							if (!isNull(jobOdrNo)) {
								tempList = entity.mSelectJobOdr.read(conn,headerStruct);
								if (!tempList.isEmpty()) {
									AD0040010Struct jobStruct = (AD0040010Struct)tempList.get(0);
									if ("3".equals(jobStruct.getJOB_ODR_TYP())
												&& jobStruct.getITEM_CD().equals(headerStruct.getITEM_CD())) {
										//在庫補充製番
										jobOdrNo = null;
									}
								}
							}

							// 入出庫管理番号採番
							Numbering collectNum = new Numbering(conn,
									CollectNumber.ISSUE_CD,
									tempStruct.getUSER_CD(),
									tempStruct.getPRG_NM(),
									tempStruct.getPLANT_CD());
							String no = collectNum.getNo();
							if (no == null || no.length() == 0) {
								//採番結果がない
								errCode = "ZZ01106";
								writeLogFiles(ERROR, errCode);
								updFlg = 9;
								setMessageHash(oprRsltTempCtlNo,updFlg,_messages.getString(errCode));
								continue;
							}
							
							// 保管区別入出庫追加
							AD0040010Struct rcvIssueStruct = new AD0040010Struct();
							rcvIssueStruct.setRCV_ISSUE_CTRL_CD(no);
							rcvIssueStruct.setITEM_CD(headerStruct.getITEM_CD());
							rcvIssueStruct.setPLANT_CD(headerStruct.getPLANT_CD());
							rcvIssueStruct.setPARTIAL_PRD_NO(tempStruct.getPARTIAL_PRD_NO());
							rcvIssueStruct.setWH_CD(tempStruct.getWH_CD());
							rcvIssueStruct.setJOB_ODR_CD(jobOdrNo);
							rcvIssueStruct.setWORK_ODR_CD(headerStruct.getWORK_ODR_CD());
							rcvIssueStruct.setWORK_IN_PROC_CD(headerStruct.getWORK_IN_PROC_CD());
							rcvIssueStruct.setRCV_ISSUE_QTY(tempStruct.getACPT_QTY());
							rcvIssueStruct.setRCV_ISSUE_DATE(tempStruct.getOPR_DATE());
							rcvIssueStruct.setRCV_ISSUE_GNR_TYP("11");
							rcvIssueStruct.setRCV_ISSUE_ODD_QTY("0.0");
							rcvIssueStruct.setOD_NO(headerStruct.getOD_NO());
							rcvIssueStruct.setVEND_LOT_NO(tempStruct.getVEND_LOT_NO());
							rcvIssueStruct.setLOT_NO(tempStruct.getLOT_NO());
							rcvIssueStruct.setUSER_CD(userId);
							rcvIssueStruct.setPRG_NM(strProgramName);
							rcvIssueStruct.setRCV_ISSUE_TYP("1");
							rcvIssueStruct.setOPR_RSLT_CRCT_NO("0"); 
							if ("1".equals(tempStruct.getc_COMPLETE())) {
								rcvIssueStruct.setRCV_ISSUE_CMPLT_FLG("1");
							} else {
								rcvIssueStruct.setRCV_ISSUE_CMPLT_FLG("0");
							}
							rcvIssueStruct.setSTOCK_UPD_TYP("1");					 
							rcvIssueStruct.setSAVE_STOCK_ON_HAND_QTY("0");
		                    //会社コード
							rcvIssueStruct.setCOMPANY_CD(company_cd);
							//保管区別入出庫
							rcvIssueStruct.setRCV_ISSUE_AFTER_QTY(rcvIssueStruct.getRCV_ISSUE_QTY());
							entity.mInsertRecvIssue.create(conn, rcvIssueStruct);
							// 入庫処理呼び出し
							RcvCancel RCan = new RcvCancel(conn, rcvIssueStruct.getRCV_ISSUE_CTRL_CD(), tempStruct.getUSER_CD());
							boolean bRSLT = RCan.execProcess();
							if (!bRSLT) {
								//入庫処理失敗 サーバーエラー
								errCode = "ZZ01106";
								writeLogFiles(ERROR, errCode);
								updFlg = 9;
								setMessageHash(oprRsltTempCtlNo,updFlg,_messages.getString(errCode));
								continue;
							}
							
							// システムパラメータ：”不良在庫を工程管理する”が”ＯＮ”且つ、「不良数」＜＞０場合、不良品入庫を行う
							if ("1".equals(_defectManageFlg) && !"0".equals(tempStruct.getDEFECT_QTY())) {
								AD0040010Struct defectInIssueStruct = new AD0040010Struct();
								no = collectNum.getNo();
								if (no == null || no.length() == 0) {
									//採番結果がない
									errCode = "ZZ01106";
									writeLogFiles(ERROR, errCode);
									setMessageHash(oprRsltTempCtlNo,updFlg,_messages.getString(errCode));
									continue;
								}
								
								// 入出庫管理番号
								defectInIssueStruct.setRCV_ISSUE_CTRL_CD(no);
								//入出庫区分
								defectInIssueStruct.setRCV_ISSUE_TYP("3");
								//品目番号
								defectInIssueStruct.setITEM_CD(tempStruct.getITEM_CD());
								//保管区コード
								defectInIssueStruct.setWH_CD(tempStruct.getWH_CD());
								//製番
								defectInIssueStruct.setJOB_ODR_CD(jobOdrNo);
								//製番枝番
								defectInIssueStruct.setJOB_ODR_DETAIL_NO("0");
								//受入回数
								defectInIssueStruct.setACPT_NO("0");
								//作業計画番号
								defectInIssueStruct.setWORK_ODR_CD(headerStruct.getWORK_ODR_CD());
								//仕掛作業コード
								defectInIssueStruct.setWORK_IN_PROC_CD(headerStruct.getWORK_IN_PROC_CD());
								//分作回数
								defectInIssueStruct.setPARTIAL_PRD_NO(tempStruct.getPARTIAL_PRD_NO());
								//作業実績訂正回数
								defectInIssueStruct.setOPR_RSLT_CRCT_NO("0");
								//出庫指示番号
								defectInIssueStruct.setISSUE_INST_CD(null);
								//入出庫数
								defectInIssueStruct.setRCV_ISSUE_QTY(tempStruct.getDEFECT_QTY());
								//入出庫前在庫数
								defectInIssueStruct.setSAVE_STOCK_ON_HAND_QTY("0");
								//入出庫後在庫数
								defectInIssueStruct.setRCV_ISSUE_AFTER_QTY("0");
								//入出庫年月日
								defectInIssueStruct.setRCV_ISSUE_DATE(tempStruct.getOPR_DATE());
								//入出庫発生区分
								defectInIssueStruct.setRCV_ISSUE_GNR_TYP("11");
								//在庫更新区分
								defectInIssueStruct.setSTOCK_UPD_TYP("1");
								//入出庫完了フラグ
								if ("1".equals(tempStruct.getc_COMPLETE())) {
									defectInIssueStruct.setRCV_ISSUE_CMPLT_FLG("1");
								} else {
									defectInIssueStruct.setRCV_ISSUE_CMPLT_FLG("0");
								}
								//オーダデマンド番号
								defectInIssueStruct.setOD_NO(headerStruct.getOD_NO());
								//入出庫端数
								defectInIssueStruct.setRCV_ISSUE_ODD_QTY("0");
								//工場コード
								defectInIssueStruct.setPLANT_CD(headerStruct.getPLANT_CD());
								//在庫ロット番号
								defectInIssueStruct.setLOT_NO(tempStruct.getLOT_NO());
								defectInIssueStruct.setUSER_CD(tempStruct.getUSER_CD());
								defectInIssueStruct.setPRG_NM(tempStruct.getPRG_NM());
								defectInIssueStruct.setCOMPANY_CD(company_cd);
								// 保管区別入出庫
								entity.mInsertRecvIssue.create(conn, defectInIssueStruct);
								IssueProcess IProc = new IssueProcess(conn, no);
								boolean bResult = IProc.execDefectProcess();
								if (!bResult) {
									//出庫処理失敗 サーバーエラー
									updFlg = 9;
									setMessageHash(oprRsltTempCtlNo,updFlg,_messages.getString(errCode));
									continue;
								}
							}
							
							// 工数管理品目の場合、[保管区別入出庫]の追加（出庫）
							if(!manHourRcvIssue(tempStruct, headerStruct, jobOdrNo, company_cd)) {
								updFlg = 9;
								setMessageHash(oprRsltTempCtlNo,updFlg,_messages.getString(errCode));
				    			continue;
							};
							
							// ロット管理の更新処理
							if("1".equals(headerStruct.getLOT_CTRL_FLG())) {
								m_med.setLOT_NO(tempStruct.getLOT_NO());
								m_med.setITEM_CD(tempStruct.getITEM_CD());
					    		m_med.setUSER_CD(userId);
					    		m_med.setPRG_NM(strProgramName);
								m_med.getT_LOT_CTRL().update();
							}
							
							//-------------------現品票の追加処理---------------------
				    		// 現品帳出力可否
					 		if("1".equals(identCard)) {
					 			m_med.setITEM_CD(tempStruct.getITEM_CD());
					 			m_med.getselectPRODUCT_TYP().read();
					 			if(!m_med.getselectPRODUCT_TYP().next()) {
									// 品目マスタから製品区分の検索結果
									errCode = "KR20011";
									writeLogFiles(ERROR, errCode);
									updFlg = 9;
									setMessageHash(oprRsltTempCtlNo,updFlg,_messages.getString(errCode));
					    			continue;
					 			}
					 			String strProduct_Typ = m_med.getPRODUCT_TYP();
					 			
								if (sysPRODUCT_TYP != null && !"".equals(sysPRODUCT_TYP)){
									String[] arrProduct_Typ = sysPRODUCT_TYP.split(",");
									for(int m = 0; m < arrProduct_Typ.length; m ++){
										if(strProduct_Typ != null && !"".equals(strProduct_Typ) && 
												strProduct_Typ.equals(arrProduct_Typ[m])){
											productFlg = true;
											break;
										} 
									}
								}
					 		}
					 		
							// 現品票管理番号の新規採番
							if(productFlg) {
								m_med.setITEM_CD(tempStruct.getITEM_CD());
								m_med.getselectGetIdentCardCtlNo().read();
								m_med.getselectGetIdentCardCtlNo().next();
								m_med.setOPR_INST_CD(tempStruct.getOPR_INST_CD());
								m_med.setPARTIAL_PRD_NO(tempStruct.getPARTIAL_PRD_NO());
								m_med.setRCV_ISSUE_CTRL_CD(no);							
								m_med.setJOB_ODR_CD(jobOdrNo);
								m_med.setFIRST_IDENT_CARD_QTY(tempStruct.getACPT_QTY());
								m_med.setIDENT_CARD_QTY(tempStruct.getACPT_QTY());
								m_med.setOPR_DATE(tempStruct.getOPR_DATE());
								m_med.setPLANT_CD(tempStruct.getPLANT_CD());
								m_med.setWS_CD(tempStruct.getWS_CD());
								m_med.setLOT_NO(tempStruct.getLOT_NO());
					    		m_med.setUSER_CD(userId);
					    		m_med.setPRG_NM(strProgramName);					
								// 現品票の登録
					    		m_med.getinsertIdentCard().create();
							}
						}
						
						//-------------------不良実績の登録処理---------------------
						AD0040010Struct defectStruct = new AD0040010Struct();
						defectStruct.setOPR_INST_CD(tempStruct.getOPR_INST_CD());
						defectStruct.setPARTIAL_PRD_NO(tempStruct.getPARTIAL_PRD_NO());
						defectStruct.setPLANT_CD(headerStruct.getPLANT_CD());
						defectStruct.setUSER_CD(tempStruct.getUSER_CD());
						defectStruct.setPRG_NM(tempStruct.getPRG_NM());
						
						// 不良理由1
						if(!isNull(tempMed.getDEFECT_CAUSE_CD1())) {
							defectStruct.setl_DEFECT_CAUSE_CD(tempMed.getDEFECT_CAUSE_CD1());
							defectStruct.setl_DEFECT_QTY(tempMed.getDEFECT_QTY1());
							defectStruct.setl_DEFECT_COMMENT(tempMed.getDEFECT_COMMENT1());
							entity.mInsertDefect.create(conn, defectStruct);
						}
						
						// 不良理由2
						if(!isNull(tempMed.getDEFECT_CAUSE_CD2())) {
							defectStruct.setl_DEFECT_CAUSE_CD(tempMed.getDEFECT_CAUSE_CD2());
							defectStruct.setl_DEFECT_QTY(tempMed.getDEFECT_QTY2());
							defectStruct.setl_DEFECT_COMMENT(tempMed.getDEFECT_COMMENT2());
							entity.mInsertDefect.create(conn, defectStruct);
						}
						// 不良理由3
						if(!isNull(tempMed.getDEFECT_CAUSE_CD3())) {
							defectStruct.setl_DEFECT_CAUSE_CD(tempMed.getDEFECT_CAUSE_CD3());
							defectStruct.setl_DEFECT_QTY(tempMed.getDEFECT_QTY3());
							defectStruct.setl_DEFECT_COMMENT(tempMed.getDEFECT_COMMENT3());
							entity.mInsertDefect.create(conn, defectStruct);
						}
						// 不良理由4
						if(!isNull(tempMed.getDEFECT_CAUSE_CD4())) {
							defectStruct.setl_DEFECT_CAUSE_CD(tempMed.getDEFECT_CAUSE_CD4());
							defectStruct.setl_DEFECT_QTY(tempMed.getDEFECT_QTY4());
							defectStruct.setl_DEFECT_COMMENT(tempMed.getDEFECT_COMMENT4());
							entity.mInsertDefect.create(conn, defectStruct);
						}
						// 不良理由5
						if(!isNull(tempMed.getDEFECT_CAUSE_CD5())) {
							defectStruct.setl_DEFECT_CAUSE_CD(tempMed.getDEFECT_CAUSE_CD5());
							defectStruct.setl_DEFECT_QTY(tempMed.getDEFECT_QTY5());
							defectStruct.setl_DEFECT_COMMENT(tempMed.getDEFECT_COMMENT5());
							entity.mInsertDefect.create(conn, defectStruct);
						}
						
						//--------------子部品一括更新処理--------------------------
						if ("1".equals(tempMed.getCHILD_RSLTUPDATE_FLG())) {
						// 内作の最大仕掛作業系列番号を取得
						String maxProcNo = null;
						AD0040010Struct issueStruct = null;
						String denominator = null;  // 分母
						String numerator = null;  //  分子
						String useSum = null;  // 更新使用数量
						
						//作業実績品目のロット管理フラグ = 1(ロットトレース管理を行う。)の場合
						List headerLotList = new ArrayList();
						if("1".equals(headerStruct.getLOT_CTRL_FLG())){
							//最終系列でない場合
							if (!"1".equals(headerStruct.geth_FINAL_PROC_FLG())) {
								tempList = entity.mSelectParentLotNo.read(conn, headerStruct);
								if (!tempList.isEmpty()) {
									for (int l = 0; l < tempList.size(); l++) {
										AD0040010Struct parentStruct = (AD0040010Struct)tempList.get(l);
										headerLotList.add(parentStruct);
									}
								}
							//最終系列の場合
							} else {
								AD0040010Struct finalStruct = new AD0040010Struct();
								finalStruct.setStructM(headerStruct);
								finalStruct.setLOT_NO(tempStruct.getLOT_NO());
								headerLotList.add(finalStruct);
							}
						}
						
						List issueList = new ArrayList();
						tempList = entity.mSelectMaxProcNo.read(conn, headerStruct);
						if (!tempList.isEmpty()) {
							AD0040010Struct maxStruct = (AD0040010Struct)tempList.get(0);
							maxProcNo = maxStruct.getPROC_NO();
						}
						//最終工程フラグを立てる
						if (maxProcNo != null && "1".equals(headerStruct.getOUTSIDE_TYP()) 
								&& maxProcNo.equals(headerStruct.getPROC_NO())){
							AD0040010Struct selectIssueStruct= new AD0040010Struct();
							selectIssueStruct.setWORK_ODR_CD(headerStruct.getWORK_ODR_CD());
							selectIssueStruct.setPARTIAL_PRD_NO(tempStruct.getPARTIAL_PRD_NO());
							//内作で最大仕掛作業系列番号の場合検索
							issueList = entity.mSelectIssue.read(conn,selectIssueStruct);
						}
						
						for(int j = 0; j < issueList.size(); j++) {
							issueStruct = (AD0040010Struct)issueList.get(j);
							if ("1".equals(_processManageFlg)) {
			    				// 取得された項目「使用元保管区」を再設定する
			        			m_med.setWORK_ODR_CD(headerStruct.getWORK_ODR_CD());
			        			m_med.setPROC_NO(issueStruct.getPROC_NO());
			        			m_med.setWH_CD(issueStruct.getWH_CD());
			        			
			        			m_med.getCheckFirstWork().read();
			        			m_med.getCheckFirstWork().next();
			    				
			        			// 最初工程かどうか判断する
					    		if (!m_med.getFIRST_OPR_INST_CD().equals(tempStruct.getIN_OPR_INST_CD())) {
					    			// 前工程があるの場合：前工程の作業実績で登録した保管区コード
					    			m_med.setFIRST_WORK_FLG("0");
					    			
					    			// 前工程情報を取得する
					    			m_med.getGetPrevWorkInfo().read();
					    			m_med.getGetPrevWorkInfo().next();
					    			issueStruct.setWH_CD(m_med.getPREV_WH_CD());
					    			
					    		}
							}
		        			
							// 保管区コードのNULLチェック
							if (isNull(issueStruct.getWH_CD())) {
								// 子品目の使用元保管区コードが未入力です。
								errCode = "AD00215";
								writeLogFiles(ERROR, errCode);
								updFlg = 9;
								setMessageHash(oprRsltTempCtlNo,updFlg,_messages.getString(errCode));
				    			continue loop;
							}
							
							// 保管区コードチェック
							tempList = entity.mSelectChkWhCd.read(conn,issueStruct);
							if(tempList.isEmpty()){
								errCode = "AD00216";
								writeLogFiles(ERROR, errCode);
								updFlg = 9;
								setMessageHash(oprRsltTempCtlNo,updFlg,_messages.getString(errCode));
				    			continue loop;
							}
							
							// 保管区コードの工場コードと作業系列別仕掛の工場コードの同一チェック
							AD0040010Struct whStruct = (AD0040010Struct)tempList.get(0);
							if (whStruct.getPLANT_CD() == null || !whStruct.getPLANT_CD().equals(headerStruct.getPLANT_CD())) {
								errCode = "AD00217";
								writeLogFiles(ERROR, errCode);
								updFlg = 9;
								setMessageHash(oprRsltTempCtlNo,updFlg,_messages.getString(errCode));
				    			continue loop;
							}
							
							// 更新使用数量の計算
							denominator = issueStruct.geth_ISSUE_INST_UNIT_DENOMINATOR(); // 分母
							numerator = issueStruct.geth_ISSUE_INST_UNIT_NUMERATOR(); // 分子
							useSum = Calculate.add(tempStruct.getACPT_QTY(), tempStruct.getDEFECT_QTY());							
							if("1".equals(issueStruct.getUNIT_QTY_TYP())) { //　整数管理
								useSum = Calculate.divide(Calculate.multiply(useSum, numerator), denominator, Calculate.CEIL);
								useSum = Calculate.ceil(useSum, 0);
							} else {
								useSum = Calculate.divide(Calculate.multiply(useSum, numerator), denominator, 4, Calculate.CEIL);
							}
							issueStruct.setTEMP_USE_QTY(useSum);
							if (issueStruct.getTEMP_USE_QTY() == null || Calculate.compare(useSum, "0") ==0) {
								continue;
							}
							
							// 入出庫管理番号採番
							Numbering collectNum = new Numbering(conn,
									CollectNumber.ISSUE_CD,
									tempStruct.getUSER_CD(),
									tempStruct.getPRG_NM(),
									tempStruct.getPLANT_CD());
							String no = collectNum.getNo();
							if (no == null || no.length() == 0) {
								//採番結果がない
								errCode = "ZZ01106";
								writeLogFiles(ERROR, errCode);
								updFlg = 9;
								setMessageHash(oprRsltTempCtlNo,updFlg,_messages.getString(errCode));
				    			continue loop;
							}
							// 入出庫管理番号
							issueStruct.setRCV_ISSUE_CTRL_CD(no);
		
							// 使用元製番
							if("1".equals(issueStruct.getMRP_ODR_TYP()) || "2".equals(issueStruct.getMRP_ODR_TYP())) {
								issueStruct.setJOB_ODR_CD(headerStruct.getJOB_ODR_CD());
							} else {
								issueStruct.setJOB_ODR_CD("");
							}
							// 工場
							issueStruct.setPLANT_CD(headerStruct.getPLANT_CD());
							// 退避用手持ち在庫数を初期化
							issueStruct.setSAVE_STOCK_ON_HAND_QTY("0");
							issueStruct.setOPR_DATE(tempStruct.getOPR_DATE());
							issueStruct.setRCV_ISSUE_DATE(tempStruct.getOPR_DATE());
							issueStruct.setPARTIAL_PRD_NO(tempStruct.getPARTIAL_PRD_NO());
							issueStruct.setWORK_ODR_CD(headerStruct.getWORK_ODR_CD());
							issueStruct.setWORK_IN_PROC_CD(headerStruct.getWORK_IN_PROC_CD());
							issueStruct.setRCV_ISSUE_QTY(Calculate.multiply(issueStruct.getTEMP_USE_QTY(), "-1"));
							if (Calculate.compare(issueStruct.getTEMP_USE_QTY(), "0") > 0) {
								//工程在庫出庫
								issueStruct.setRCV_ISSUE_GNR_TYP("41");
							} else {
								//工程在庫出庫取消
								issueStruct.setRCV_ISSUE_GNR_TYP("49");
							}
							issueStruct.setRCV_ISSUE_ODD_QTY("0");
							issueStruct.setOD_NO(headerStruct.getOD_NO());
							issueStruct.setRCV_ISSUE_CMPLT_FLG("0");
							issueStruct.setSTOCK_UPD_TYP("2");
							issueStruct.setRCV_ISSUE_TYP("2");
							issueStruct.setWS_CD(tempStruct.getWS_CD());
							issueStruct.setOPR_RSLT_CRCT_NO("0");
							issueStruct.setUSER_CD(tempStruct.getUSER_CD());
							issueStruct.setPRG_NM(tempStruct.getPRG_NM());
		
							// 工程仕掛在庫出庫処理
							if(isNull(issueStruct.getJOB_ODR_CD())) {
								//保管区別品目在庫更新
								tempList = entity.mSelectItemStock.read(conn,issueStruct);
								if (tempList.isEmpty()) {
									// 登録
									issueStruct.setSTOCK_ON_HAND_QTY(Calculate.multiply(issueStruct.getTEMP_USE_QTY(), "-1"));
									entity.mInsertItemStock.create(conn, issueStruct);
								} else {
									// 更新
									AD0040010Struct itemStruct = (AD0040010Struct)tempList.get(0);
									// 更新前品目別手持在庫数
									issueStruct.setSAVE_STOCK_ON_HAND_QTY(itemStruct.getSTOCK_ON_HAND_QTY());
									// 品目別手持在庫数
									issueStruct.setSTOCK_ON_HAND_QTY(
											Calculate.subtract(issueStruct.getSAVE_STOCK_ON_HAND_QTY(), issueStruct.getTEMP_USE_QTY()));		
									entity.mUpdateItemStock.update(conn, issueStruct);
								}
							} else {
								//製番仕掛在庫更新
								tempList = entity.mSelectOdrStock.read(conn,issueStruct);		
								if (tempList.isEmpty()) {
									//登録
									issueStruct.setSTOCK_ON_HAND_QTY(Calculate.multiply(issueStruct.getTEMP_USE_QTY(), "-1"));
									entity.mInsertOdrStock.create(conn,issueStruct);
								} else {
									//更新
									AD0040010Struct jobStruct = (AD0040010Struct)tempList.get(0);
									// 更新前品目別手持在庫数
									issueStruct.setSAVE_STOCK_ON_HAND_QTY(jobStruct.getSTOCK_ON_HAND_QTY());
									issueStruct.setJOB_ODR_DETAIL_NO(jobStruct.getJOB_ODR_DETAIL_NO());
									// 品目別手持在庫数
									issueStruct.setSTOCK_ON_HAND_QTY(
											Calculate.subtract(issueStruct.getSAVE_STOCK_ON_HAND_QTY(), issueStruct.getTEMP_USE_QTY()));		
									entity.mUpdateOdrStock.update(conn,issueStruct);
								}
							}
							//会社コード
							issueStruct.setCOMPANY_CD(company_cd);
							issueStruct.setRCV_ISSUE_AFTER_QTY(issueStruct.getRCV_ISSUE_QTY());
							// 子品目がロット管理品の場合
							if ("1".equals(issueStruct.getLOT_CTRL_FLG())) {
								// 出庫実績明細取得
								List lotIssueList = entity.mT_LOT_ISSUE_INST.read(conn,issueStruct);
								// データがない場合
								if (lotIssueList.isEmpty()) {
									errCode = "AD20135";
									writeLogFiles(ERROR, errCode);
									updFlg = 9;
									setMessageHash(oprRsltTempCtlNo,updFlg,_messages.getString(errCode));
					    			continue loop;
								}
		
								// 使用残数設定
								BigDecimal remainQty = new BigDecimal(issueStruct.getTEMP_USE_QTY());
		
								AD0040010Struct lotUseStruct = new AD0040010Struct();
								lotUseStruct.setStructM(issueStruct);							
								lotUseStruct.setsUser_ID(tempStruct.getUSER_CD());
		
								for (int m = 0; m < lotIssueList.size(); m++) {
									AD0040010Struct lotIssueStruct = (AD0040010Struct) lotIssueList.get(m);
		
									// 引き当て可能数設定
									BigDecimal issueQty = new BigDecimal(lotIssueStruct.getISSUE_QTY());
									BigDecimal spentQty = new BigDecimal(lotIssueStruct.getSPENT_QTY());
									BigDecimal availQty = issueQty.subtract(spentQty);

									// ロット別使用実績管理番号採番
									List seqList = entity.mSEQ_JF_RSLT.read(conn, lotIssueStruct);
									if (seqList != null && seqList.size() > 0) {
										lotUseStruct.setRSLT_CTL_SEQ_NO(((AD0040010Struct) seqList.get(0)).getNEXTVAL());
									}
		
									// ロット番号設定
									lotUseStruct.setLOT_NO(lotIssueStruct.getLOT_NO());
		
									BigDecimal useLotQty = null;
		
									// 引き当て可能数 >= 使用残数の場合
									if (availQty.doubleValue() >= remainQty.doubleValue()) {
										// 使用残数を引き当て数に設定
										useLotQty = remainQty;
										// 引き当て可能数 < 使用残数の場合
									} else {
										// 最終データの場合
										if (m == lotIssueList.size() - 1) {
											// 使用残数を使用数に設定
											useLotQty = remainQty;
											// 最終データでない場合
										} else {
											// 引当可能数が0より大きい場合
											if (availQty.doubleValue() > 0) {
												// 使用残数を使用数に設定
												useLotQty = remainQty;
		
												// 次レコード以降を取得
												for (int n = m + 1; n < lotIssueList.size(); n++) {
													AD0040010Struct nextLotIssueStruct = (AD0040010Struct) lotIssueList.get(n);
		
													// 引き当て可能数設定
													BigDecimal nextIssueQty = new BigDecimal(nextLotIssueStruct.getISSUE_QTY());
													BigDecimal nextSpentQty = new BigDecimal(nextLotIssueStruct.getSPENT_QTY());
													BigDecimal nextAvailQty = nextIssueQty.subtract(nextSpentQty);
		
													// 次レコード以降に引当可能なデータがある場合
													if (nextAvailQty.doubleValue() > 0) {
														// 引き当て可能数を使用数に設定
														useLotQty = availQty;
														break;
													}
												}
												// 引当可能数が0以下の場合
											} else {
												// 次のデータを取得
												continue;
											}
										}
									}
		
									// 使用数が引当可能数より大きい場合
									if (useLotQty.doubleValue() > availQty.doubleValue()) {
										// メッセージ出力
										writeLogFiles(WORNING, "AD20136");
									}

									// 使用済数量、使用予定数量に上記で設定した使用数を設定
									lotUseStruct.setTOTAL_ISSUE_QTY(useLotQty.toString());
									lotUseStruct.setSUPPLIED_ISSUE_QTY(useLotQty.toString());						
									// 実績日を使用日に設定
									lotUseStruct.setSUPPLIED_DATE(lotUseStruct.getOPR_DATE().substring(0,10));
		
									// [ロット別使用実績]の追加
									entity.mT_LOT_USE_RSLT.create(conn, lotUseStruct);
		
									// [出庫実績明細]の更新
									lotUseStruct.setSPENT_QTY(spentQty.add(useLotQty).toString());
									entity.mT_LOT_ISSUE_INST.update(conn, lotUseStruct);
		
									issueStruct.setLOT_NO(lotIssueStruct.getLOT_NO());
									issueStruct.setRCV_ISSUE_QTY(useLotQty.negate().toString());
		
									// ロット別品目在庫検索
									tempList = entity.mT_LOT_STOCK.read(conn,issueStruct);
		
									// 更新前の在庫数設定
									if (tempList.isEmpty()) {
										issueStruct.setSAVE_STOCK_ON_HAND_QTY("0");
									} else {
										AD0040010Struct lotStruct = (AD0040010Struct) tempList.get(0);
										issueStruct.setSAVE_STOCK_ON_HAND_QTY(lotStruct.getSTOCK_ON_HAND_QTY());
									}
		
									// 2件目以降のデータの場合
									if (m > 0) {
										// 入出庫管理番号採番
										collectNum = new Numbering(conn,
												CollectNumber.ISSUE_CD, 
												tempStruct.getUSER_CD(),
												tempStruct.getPRG_NM(), 
												tempStruct.getPLANT_CD());
										no = collectNum.getNo();
										if (no == null || no.length() == 0) {
											// 採番結果がない
											errCode = "ZZ01106";
											writeLogFiles(ERROR, errCode);
											updFlg = 9;
											setMessageHash(oprRsltTempCtlNo,updFlg,_messages.getString(errCode));
											continue loop;
										}
										issueStruct.setRCV_ISSUE_CTRL_CD(no);
									}
									issueStruct.setRCV_ISSUE_AFTER_QTY(issueStruct.getRCV_ISSUE_QTY());
									entity.mInsertRecvIssue.create(conn, issueStruct);
		
									// ロット別品目在庫更新
									BizCommon bc = new BizCommon(conn, tempStruct.getUSER_CD(), tempStruct.getPRG_NM(), tempStruct.getPLANT_CD());
									List updateLotStockList = bc.excUpdateLotStockFd(no, "");
									// 異常終了の場合
									if (bc.getResultStatus().intValue() == 3) {
										// エラーメッセージ取得
										if (updateLotStockList != null&& updateLotStockList.size() > 0) {
											errCode = (String) updateLotStockList.get(0);
											writeLogFiles(ERROR, errCode);
										}
										updFlg = 9;
										setMessageHash(oprRsltTempCtlNo,updFlg,_messages.getString(errCode));
										continue loop;
									}
									
									// 作業実績品目のロット管理フラグ = 1(ロットトレース管理を行う。)の場合
									if ("1".equals(headerStruct.getLOT_CTRL_FLG())) {
										// 親品目の実績入力済みの場合
										if (!headerLotList.isEmpty()) {
											for (int k = 0; k < headerLotList.size(); k++) {
												AD0040010Struct headerLotStruct = (AD0040010Struct) headerLotList.get(k);					
												// 親品目の在庫ロット番号が指定されている場合
												if (!isNull(headerLotStruct.getLOT_NO())) {
													// ロットトレース登録・更新処理
													List lotTraceList = bc.excMakeLotTraceFd(issueStruct.getITEM_CD(),
															issueStruct.getLOT_NO(),headerStruct.getITEM_CD(),
															headerLotStruct.getLOT_NO(),"2");
													if(bc.getResultStatus().intValue() == 1){
														// ロットトレース登録・更新処理が成功場合、［ロットトレース］の更新を行う
										            	tempStruct = new AD0040010Struct();
										            	// [ロットトレース].“元品目番号”＝[ロット別使用実績].”支給品目番号”
										            	tempStruct.setFROM_ITEM_CD(issueStruct.getITEM_CD());
										            	// [ロットトレース].“元ロット番号”＝[ロット別使用実績].”在庫ロット番号”
										            	tempStruct.setFROM_LOT_NO(issueStruct.getLOT_NO());
										            	// [ロットトレース].“先品目番号”＝[画面].”発注番号”で検索した[発注残]．”品目番号”
										            	tempStruct.setTO_ITEM_CD(headerStruct.getITEM_CD());
										            	// [ロットトレース].“先ロット番号”＝[受入実績].”在庫ロット番号”
										            	tempStruct.setTO_LOT_NO(headerLotStruct.getLOT_NO());
										            	// [ロットトレース].“先発注番号”=""
									            	    tempStruct.setTO_PUCH_ODR_CD("");
										            	// ユーザコード
										            	tempStruct.setsUser_ID(getSysUserCd());
										            	//[受入実績]で発注番号を取得
										            	List formList = entity.mgetFROM_PUCH_ODR_CD.read(conn, tempStruct);
										            	if((formList != null && formList.size() > 0)){
										            		//発注番号をソート順（降順）にし、１件目のレコードを取得する。
										            		AD0040010Struct orderStruct = (AD0040010Struct) formList.get(0);
											            	//[ロットトレース].“元発注番号” = [受入実績]."発注番号"
											            	tempStruct.setFROM_PUCH_ODR_CD(orderStruct.getFROM_PUCH_ODR_CD());
										            	}else{
										            		tempStruct.setFROM_PUCH_ODR_CD("");
										            	}
										            	// ［ロットトレース］の更新を行う
										            	entity.mupdateT_LOT_TRACE.update(conn, tempStruct);
													}
		
													// 異常終了の場合
													if (bc.getResultStatus().intValue() == 3) {
														// エラーメッセージ取得
														if (!lotTraceList.isEmpty()) {
															errCode = (String) lotTraceList.get(0);
															writeLogFiles(ERROR, errCode);
														}
														updFlg = 9;
														setMessageHash(oprRsltTempCtlNo,updFlg,_messages.getString(errCode));
														continue loop;
													}
												}
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
								entity.mInsertRecvIssue.create(conn, issueStruct);
							}
						}
					}
			    	}

		        // 正常終了
		        if(updFlg==0) {		        	
			    	conn.commit();
			    	insertCnt = insertCnt + oprRsltList.size();
			    	m_med.setOPR_RSLT_TEMP_CTL_NO(null);
			    	m_med.setRSLT_TAKE_ERR_TYP(null);
			    	m_med.setRSLT_TAKE_ERR_INFO(null);
			    	
		        } else {
		        	// 異常終了
		        	conn.rollback();
		        	
		        }
		        for (int i=0;i<oprRsltList.size();i++) {
		        	m_med.setOPR_RSLT_TEMP_CTL_NO(null);
				    m_med.setRSLT_TAKE_ERR_TYP(null);
				    m_med.setRSLT_TAKE_ERR_INFO(null);
		        	if(updFlg!=0) {
		        		tempMed = (medAD0080B001)oprRsltList.get(i);
			    		oprRsltTempCtlNo = tempMed.getOPR_RSLT_TEMP_CTL_NO();
			    		List getHashList = (List)tempHashMap.get(oprRsltTempCtlNo);
			    		m_med.setOPR_RSLT_TEMP_CTL_NO(oprRsltTempCtlNo);
			    		if(getHashList!=null){
			    			m_med.setRSLT_TAKE_ERR_TYP(getHashList.get(0).toString());
			    			m_med.setRSLT_TAKE_ERR_INFO(getHashList.get(1).toString());
			    		}else{
			    			m_med.setRSLT_TAKE_ERR_TYP("1");
			    			m_med.setRSLT_TAKE_ERR_INFO(_messages.getString("AD00239"));
			    		}
		        	}
		        	// 作業実績一時履歴テーブルの登録
				    m_med.getinsertT_OPR_RSLT_TEMP_HISTORY().create();
					if(updFlg==0){
						break;
					}
		        }
		        // 作業実績一時テーブルの削除
				m_med.getdeleteT_OPR_RSLT_TEMP_HISTORY().delete();
				conn.commit();

		    } 

	        // バッチが正常に終了した場合
	        String succCommt = "(SBM0638)読込件数　=　[" + readCnt + "] "
	        				 + "登録件数　=　[" + insertCnt + "] "
	        				 + "エラー件数　=　[" + (readCnt - insertCnt) + "]";
	        // 作業実績取込バッチ処理を正常に終了しました。
	        writeLog(INFOMATION, "AD00218", succCommt);
    	} catch(Exception e) {    		
    		conn.rollback();
    		// 作業実績取込バッチ処理が異常終了しました。
    		writeLog(INFOMATION, "AD00219");
    		throw e;
    	}
    }
    
    /**
     * 品目の工程在庫の管理する
     * @param	AD0040010Struct	 作業実績struct
     * @param	AD0040010Struct	 作業仕掛struct
     * @return  int             実行結果
	 * @throws SQLException 
     * @throws FoundationException 
     * @throws BatchAppException 
     * */
    private int ItemWorkManager(AD0040010Struct tempStruct,AD0040010Struct headerStruct) throws SQLException, FoundationException, BatchAppException {
    	AD0040010Struct issueStruct = null;
    	int updFlg = 0;
    	List issueList = new ArrayList();
    	List tempList = new ArrayList();
    	Numbering collectNum = new Numbering(conn,
				CollectNumber.ISSUE_CD,
				tempStruct.getUSER_CD(),
				tempStruct.getPRG_NM(),
				tempStruct.getPLANT_CD());
    	String no = null;
    	
    		//　最終工程の以外かどうか判断する
    		if (!"1".equals(headerStruct.geth_FINAL_PROC_FLG())) {
    			//　最終工程の以外の場合
    			// --------------[出庫指示]のデータを取得する----------
    			AD0040010Struct selectIssueStruct= new AD0040010Struct();
    			selectIssueStruct.setWORK_ODR_CD(headerStruct.getWORK_ODR_CD());
    			selectIssueStruct.setPARTIAL_PRD_NO(tempStruct.getPARTIAL_PRD_NO());
    			
    			issueList = entity.mSelectIssue.read(conn,selectIssueStruct);
    			// 出庫指示データを繰り返す。
    			for(int j = 0; j < issueList.size(); j++) {
    				issueStruct = (AD0040010Struct)issueList.get(j);
        			
    				// 取得された項目「使用元保管区」を再設定する
        			m_med.setWORK_ODR_CD(headerStruct.getWORK_ODR_CD());
        			m_med.setPROC_NO(issueStruct.getPROC_NO());
        			m_med.setWH_CD(issueStruct.getWH_CD());
    				
        			m_med.getCheckFirstWork().read();
        			m_med.getCheckFirstWork().next();
		    		// 最初工程かどうか判断する
		    		if (!m_med.getFIRST_OPR_INST_CD().equals(tempStruct.getIN_OPR_INST_CD())) {
		    			// 最初工程でない場合
		    			m_med.setFIRST_WORK_FLG("0");
		    			
		    			// 前工程情報を取得する
		    			m_med.getGetPrevWorkInfo().read();
		    			m_med.getGetPrevWorkInfo().next();
		    			
		    			// 前工程があるの場合：前工程の作業実績で登録した保管区コード
		    			issueStruct.setWH_CD(m_med.getPREV_WH_CD());
		    		}
		    		
		    		// 保管区コードのNULLチェック
					if (isNull(issueStruct.getWH_CD())) {
						// 子品目の使用元保管区コードが未入力です。
						errCode = "AD00215";
						writeLogFiles(ERROR, errCode);
						updFlg = 9;
						break;
					}
					
					// 保管区コードチェック
					tempList = entity.mSelectChkWhCd.read(conn,issueStruct);
					if(tempList.isEmpty()){
						errCode = "AD00216";
						writeLogFiles(ERROR, errCode);
						updFlg = 9;
						break;
					}
					
					// 保管区コードの工場コードと作業系列別仕掛の工場コードの同一チェック
					AD0040010Struct whStruct = (AD0040010Struct)tempList.get(0);
					if (whStruct.getPLANT_CD() == null || !whStruct.getPLANT_CD().equals(headerStruct.getPLANT_CD())) {
						errCode = "AD00217";
						writeLogFiles(ERROR, errCode);
						updFlg = 9;
						break;
					}
					
					String denominator = null;  // 分母
					String numerator = null;  //  分子
					String useSum = null;  // 更新使用数量
					String acptQty = null; // 更新使用数量(良品)
					String defectQty = null; // 更新使用数量(不良品)
					
					// 更新使用数量の計算
					denominator = issueStruct.geth_ISSUE_INST_UNIT_DENOMINATOR(); // 分母
					numerator = issueStruct.geth_ISSUE_INST_UNIT_NUMERATOR(); // 分子
					useSum = Calculate.add(tempStruct.getACPT_QTY(), tempStruct.getDEFECT_QTY());	
					
					if("1".equals(issueStruct.getUNIT_QTY_TYP())) { //　整数管理
						// 更新使用数量
						useSum = Calculate.divide(Calculate.multiply(useSum, numerator), denominator, Calculate.CEIL);
						useSum = Calculate.ceil(useSum, 0);
						
						// 更新使用数量（良品数）
						acptQty = Calculate.divide(
								Calculate.multiply(tempStruct.getACPT_QTY(), 
										issueStruct.geth_ISSUE_INST_UNIT_NUMERATOR()),
										issueStruct.geth_ISSUE_INST_UNIT_DENOMINATOR(), 
								Calculate.CEIL);
						acptQty = Calculate.ceil(acptQty, 0);
						
						// 更新使用数量（不良数）
						defectQty = Calculate.divide(
								Calculate.multiply(tempStruct.getDEFECT_QTY(), 
										issueStruct.geth_ISSUE_INST_UNIT_NUMERATOR()),
										issueStruct.geth_ISSUE_INST_UNIT_DENOMINATOR(), 
								Calculate.CEIL);
						defectQty = Calculate.ceil(defectQty, 0);
					} else {
						// 更新使用数量
						useSum = Calculate.divide(Calculate.multiply(useSum, numerator), denominator, 4, Calculate.CEIL);
						
						// 更新使用数量（良品数）
						acptQty = Calculate.divide(
								Calculate.multiply(tempStruct.getACPT_QTY(), 
										issueStruct.geth_ISSUE_INST_UNIT_NUMERATOR()),
										issueStruct.geth_ISSUE_INST_UNIT_DENOMINATOR(), 
										4,
										Calculate.CEIL);
						
						// 更新使用数量（不良数）
						defectQty = Calculate.divide(
								Calculate.multiply(tempStruct.getDEFECT_QTY(), 
										issueStruct.geth_ISSUE_INST_UNIT_NUMERATOR()),
										issueStruct.geth_ISSUE_INST_UNIT_DENOMINATOR(), 
										4,
										Calculate.CEIL);
					}
        			
					// 退避用手持ち在庫数を初期化
					issueStruct.setSAVE_STOCK_ON_HAND_QTY("0");
					issueStruct.setTEMP_USE_QTY(useSum);
					m_med.setUSE_DEFECT_QTY(defectQty);
					m_med.setUSE_ACPT_QTY(acptQty);
					// 工場
					issueStruct.setPLANT_CD(headerStruct.getPLANT_CD());
					issueStruct.setUSER_CD(tempStruct.getUSER_CD());
					issueStruct.setPRG_NM(tempStruct.getPRG_NM());
					issueStruct.setWORK_ODR_CD(headerStruct.getWORK_ODR_CD());
					//更新使用数量が”0”場合、次の出庫指示データに進む。
					if ("0".equals(useSum)) {
						continue;
					}
					// ----------------------工程在庫出庫処理------------------
					boolean bResult;
					// [所要量].“製番”がnull場合、[保管区別品目在庫]から、データを取得する
					if (isNull(issueStruct.getJOB_ODR_CD())) {
						tempList = entity.mSelectItemStock.read(conn,issueStruct);
						if (tempList.isEmpty()) {
							// [保管区別品目在庫]から、データを存在しないする場合
							issueStruct.setSTOCK_ON_HAND_QTY(Calculate.multiply(issueStruct.getTEMP_USE_QTY(), "-1"));
							entity.mInsertItemStock.create(conn, issueStruct);
						} else {
							//　[保管区別品目在庫]から、データが存在する場合
							AD0040010Struct itemStruct = (AD0040010Struct)tempList.get(0);
							// 更新前品目別手持在庫数
							issueStruct.setSAVE_STOCK_ON_HAND_QTY(itemStruct.getSTOCK_ON_HAND_QTY());
							// 品目別手持在庫数
							issueStruct.setSTOCK_ON_HAND_QTY(
									Calculate.subtract(issueStruct.getSAVE_STOCK_ON_HAND_QTY(), issueStruct.getTEMP_USE_QTY()));		
							entity.mUpdateItemStock.update(conn, issueStruct);
						}
					} else {
						// [所要量].“製番”がnullでない場合、[保管区別製番在庫]から、データを取得する
						tempList = entity.mSelectOdrStock.read(conn,issueStruct);		
						if (tempList.isEmpty()) {
							// [保管区別製番在庫]から、データを存在しないする場合、製番仕掛在庫登録
							issueStruct.setSTOCK_ON_HAND_QTY(Calculate.multiply(issueStruct.getTEMP_USE_QTY(), "-1"));
							entity.mInsertOdrStock.create(conn,issueStruct);
						} else {
							//　[保管区別製番在庫]から、データが存在する場合、製番仕掛在庫更新
							AD0040010Struct jobStruct = (AD0040010Struct)tempList.get(0);
							// 更新前品目別手持在庫数
							issueStruct.setSAVE_STOCK_ON_HAND_QTY(jobStruct.getSTOCK_ON_HAND_QTY());
							issueStruct.setJOB_ODR_DETAIL_NO(jobStruct.getJOB_ODR_DETAIL_NO());
							// 品目別手持在庫数
							issueStruct.setSTOCK_ON_HAND_QTY(
									Calculate.subtract(issueStruct.getSAVE_STOCK_ON_HAND_QTY(), issueStruct.getTEMP_USE_QTY()));		
							entity.mUpdateOdrStock.update(conn,issueStruct);
						}
					}
					
					// ロット管理を行うの場合
					if ("1".equals(issueStruct.getLOT_CTRL_FLG())) {
						// 使用数の計算処理を呼び出し。
						updFlg = CalcUseQty(issueStruct,tempStruct,headerStruct,"2");
						if (updFlg != 0) {
							break;
						}
						
						// ロット管理しない場合
					} else {
						//---------------[保管区別入出庫]の追加(出庫)------------------
						updFlg = InsertRecvIssue(issueStruct,tempStruct,headerStruct,"2");
						if (updFlg != 0) {
							break;
						}
					}
		    		
					// ----------------------工程在庫入庫処理------------------
		    		issueStruct.setWH_CD(tempStruct.getWH_CD());
		    		issueStruct.setSAVE_STOCK_ON_HAND_QTY("0");
					// [所要量].“製番”がnull場合、[保管区別品目在庫]から、データを取得する
					if (isNull(issueStruct.getJOB_ODR_CD())) {
						tempList = entity.mSelectItemStock.read(conn,issueStruct);
						if (tempList.isEmpty()) {
							// [保管区別品目在庫]から、データを存在しないする場合
							issueStruct.setSTOCK_ON_HAND_QTY(acptQty);
							entity.mInsertItemStock.create(conn, issueStruct);
						} else {
							//　[保管区別品目在庫]から、データが存在する場合
							AD0040010Struct itemStruct = (AD0040010Struct)tempList.get(0);
							// 更新前品目別手持在庫数
							issueStruct.setSAVE_STOCK_ON_HAND_QTY(itemStruct.getSTOCK_ON_HAND_QTY());
							// 品目別手持在庫数
							issueStruct.setSTOCK_ON_HAND_QTY(
									Calculate.add(issueStruct.getSAVE_STOCK_ON_HAND_QTY(), acptQty));		
							entity.mUpdateItemStock.update(conn, issueStruct);
						}
					} else {
						// [所要量].“製番”がnullでない場合、[保管区別製番在庫]から、データを取得する
						tempList = entity.mSelectOdrStock.read(conn,issueStruct);		
						if (tempList.isEmpty()) {
							// [保管区別製番在庫]から、データを存在しないする場合、製番仕掛在庫登録
							issueStruct.setSTOCK_ON_HAND_QTY(acptQty);
							entity.mInsertOdrStock.create(conn,issueStruct);
						} else {
							//　[保管区別製番在庫]から、データが存在する場合、製番仕掛在庫更新
							AD0040010Struct jobStruct = (AD0040010Struct)tempList.get(0);
							// 更新前品目別手持在庫数
							issueStruct.setSAVE_STOCK_ON_HAND_QTY(jobStruct.getSTOCK_ON_HAND_QTY());
							issueStruct.setJOB_ODR_DETAIL_NO(jobStruct.getJOB_ODR_DETAIL_NO());
							// 品目別手持在庫数
							issueStruct.setSTOCK_ON_HAND_QTY(
									Calculate.add(issueStruct.getSAVE_STOCK_ON_HAND_QTY(), acptQty));		
							entity.mUpdateOdrStock.update(conn,issueStruct);
						}
					}
					
					// ロット管理を行うの場合
					if ("1".equals(issueStruct.getLOT_CTRL_FLG())) {
						// 使用数の計算処理を呼び出し。
						updFlg = CalcUseQty(issueStruct,tempStruct,headerStruct,"1");
						if (updFlg != 0) {
							break;
						}
						// ロット管理しない場合
					} else {
						//---------------[保管区別入出庫]の追加(入庫)------------------
						updFlg = InsertRecvIssue(issueStruct,tempStruct,headerStruct,"1");
						if (updFlg != 0) {
							break;
						}
					}
					// システムパラメータ：”不良在庫を工程管理する”が”ＯＮ”且つ、「不良数」＜＞０場合、不良品入庫を行う
					if ("1".equals(_defectManageFlg) && !"0".equals(defectQty)) {
						// ロット管理を行うの場合
						if ("1".equals(issueStruct.getLOT_CTRL_FLG())) {
							// 使用数の計算処理を呼び出し。
							updFlg = CalcUseQty(issueStruct,tempStruct,headerStruct,"3");
							if (updFlg != 0) {
								break;
							}
							
							// ロット管理しない場合
						} else {
							updFlg = InsertRecvIssue(issueStruct,tempStruct,headerStruct,"3");
							if (updFlg != 0) {
								break;
							}
							IssueProcess IProc = new IssueProcess(conn, issueStruct.getRCV_ISSUE_CTRL_CD());
							bResult= IProc.execDefectProcess();
							if (!bResult) {
								//出庫処理失敗 サーバーエラー
								updFlg = 9;
								break;
							}
						}
					}
    			}
    		}
    		return updFlg;
    }
    /**
     * 使用数の計算処理処理
     * @param	AD0040010Struct	 出庫指示struct
     * @param	AD0040010Struct	 作業実績struct
     * @param	AD0040010Struct	 作業仕掛struct
     * @param	int         	 登録フラグ
     * @return  int             実行結果
	 * @throws SQLException 
     * @throws FoundationException 
     * @throws BatchAppException 
     * */
    private int CalcUseQty(AD0040010Struct issueStruct,AD0040010Struct tempStruct,
    		AD0040010Struct headerStruct,String insertType) throws FoundationException, SQLException{
    	List tempList = new ArrayList();
    	int updFlg = 0;
    	// 出庫実績明細取得
		List lotIssueList = entity.mT_LOT_ISSUE_INST.read(conn,issueStruct);
		if ("1".equals(insertType)) {			// 入庫の場合
			 lestQty = new String[lotIssueList.size()];
			 useQty = new String[lotIssueList.size()];
		}
		
		// データがない場合
		if (lotIssueList.isEmpty()) {
			errCode = "AD20135";
			writeLogFiles(ERROR, errCode);
			updFlg = 9;
			return updFlg;
		}

		// 使用残数設定
		BigDecimal remainQty = null;
		if ("2".equals(insertType)) {		// 出庫の場合
			remainQty = new BigDecimal(issueStruct.getTEMP_USE_QTY());
		} else if ("1".equals(insertType)) {			// 入庫の場合
			remainQty = new BigDecimal(m_med.getUSE_ACPT_QTY());
		} else if ("3".equals(insertType)) {			// 不良入庫の場合
			remainQty = new BigDecimal(m_med.getUSE_DEFECT_QTY());
		}
		for (int m = 0; m < lotIssueList.size(); m++) {
			if ("3".equals(insertType) && Calculate.compare(lestQty[m], "0") <= 0){
				continue;
			}
			AD0040010Struct lotIssueStruct = (AD0040010Struct) lotIssueList.get(m);

			// 引き当て可能数設定
			BigDecimal issueQty = new BigDecimal(lotIssueStruct.getISSUE_QTY());
			BigDecimal spentQty = new BigDecimal(lotIssueStruct.getSPENT_QTY());
			BigDecimal availQty = null;

			if ("3".equals(insertType)){
				availQty = new BigDecimal(lestQty[m]);
			} else {
				availQty = issueQty.subtract(spentQty);
			}
			BigDecimal useLotQty = null;

			if ("1".equals(insertType)) {			// 入庫の場合
				lestQty[m] = availQty.toString();
				useQty[m] = "0";
			}
			//使用残数が0以下の場合ループ終了
			if (remainQty.doubleValue() <= 0) {
				continue;
			}	
			
			// 引き当て可能数 >= 使用残数の場合
			if (availQty.doubleValue() >= remainQty.doubleValue()) {
				// 使用残数を引き当て数に設定
				useLotQty = remainQty;
				// 引き当て可能数 < 使用残数の場合
			} else {
				// 最終データの場合
				if (m == lotIssueList.size() - 1) {
					// 使用残数を使用数に設定
					useLotQty = remainQty;
					// 最終データでない場合
				} else {
					// 引当可能数が0より大きい場合
					if (availQty.doubleValue() > 0) {
						// 使用残数を使用数に設定
						useLotQty = remainQty;
						// 次レコード以降を取得
						for (int n = m + 1; n < lotIssueList.size(); n++) {
							AD0040010Struct nextLotIssueStruct = (AD0040010Struct) lotIssueList.get(n);

							// 引き当て可能数設定
							BigDecimal nextIssueQty = new BigDecimal(nextLotIssueStruct.getISSUE_QTY());
							BigDecimal nextSpentQty = new BigDecimal(nextLotIssueStruct.getSPENT_QTY());
							BigDecimal nextAvailQty = null;

							if ("3".equals(insertType)){
								nextAvailQty = new BigDecimal(lestQty[n]);
							} else {
								nextAvailQty = nextIssueQty.subtract(nextSpentQty);
							}
							// 次レコード以降に引当可能なデータがある場合
							if (nextAvailQty.doubleValue() > 0) {
								// 引き当て可能数を使用数に設定
								useLotQty = availQty;
								break;
							}
						}
						// 引当可能数が0以下の場合
					} else {
						// 次のデータを取得
						continue;
					}
				}
			}

			// 使用数が引当可能数より大きい場合
			if (useLotQty.doubleValue() > availQty.doubleValue()) {
				// メッセージ出力
				writeLogFiles(WORNING, "AD20136");
			}

			m_med.setUSE_LOT_NO(lotIssueStruct.getLOT_NO());
			issueStruct.setRCV_ISSUE_QTY(useLotQty.toString());
			if ("1".equals(insertType)) {			// 入庫の場合
				lestQty[m] = Calculate.add(issueQty.toString(), useLotQty.negate().toString());
				useQty[m] = Calculate.add(spentQty.toString(), useLotQty.toString());
			}
			
			// ロット別品目在庫検索
			tempList = entity.mT_LOT_STOCK.read(conn,issueStruct);

			// 更新前の在庫数設定
			if (tempList.isEmpty()) {
				issueStruct.setSAVE_STOCK_ON_HAND_QTY("0");
			} else {
				AD0040010Struct lotStruct = (AD0040010Struct) tempList.get(0);
				issueStruct.setSAVE_STOCK_ON_HAND_QTY(lotStruct.getSTOCK_ON_HAND_QTY());
			}

			// 保管区別入出庫の登録処理
			if ("2".equals(insertType)) {		// 出庫の場合
				updFlg = InsertRecvIssue(issueStruct,tempStruct,headerStruct,"2");
			} else if ("1".equals(insertType)) {			// 入庫の場合
				updFlg = InsertRecvIssue(issueStruct,tempStruct,headerStruct,"1");
			} else if ("3".equals(insertType)) {			// 不良入庫の場合
				updFlg = InsertRecvIssue(issueStruct,tempStruct,headerStruct,"3");
				IssueProcess IProc = new IssueProcess(conn, issueStruct.getRCV_ISSUE_CTRL_CD());
				boolean bResult= IProc.execDefectProcess();
				if (!bResult) {
					//出庫処理失敗 サーバーエラー
					updFlg = 9;
					break;
				}
			}
			if (updFlg != 0) {
				break;
			}

			// ロット別品目在庫更新
			BizCommon bc = new BizCommon(conn, tempStruct.getUSER_CD(), tempStruct.getPRG_NM(), tempStruct.getPLANT_CD());
			List updateLotStockList = null;
			if ("2".equals(insertType) || "1".equals(insertType)) {		// 出庫或る入庫の場合
				updateLotStockList = bc.excUpdateLotStockFd(issueStruct.getRCV_ISSUE_CTRL_CD(), "");
				// 異常終了の場合
				if (bc.getResultStatus().intValue() == 3) {
					// エラーメッセージ取得
					if (updateLotStockList != null&& updateLotStockList.size() > 0) {
						errCode = (String) updateLotStockList.get(0);
						writeLogFiles(ERROR, errCode);
					}
					updFlg = 9;
					break;
				}
			}
			
			//使用残数減算
			remainQty = remainQty.subtract(new BigDecimal(useLotQty.toString()));
																																				
		}
    	return updFlg;
    }
    /**
     * 保管区別入出庫の登録処理
     * @param	AD0040010Struct	 出庫指示struct
     * @param	AD0040010Struct	 作業実績struct
     * @param	AD0040010Struct	 作業仕掛struct
     * @param	int         	 登録フラグ
     * @return  int             実行結果
	 * @throws SQLException 
     * @throws FoundationException 
     * @throws BatchAppException 
     * */
    private int InsertRecvIssue(AD0040010Struct issueStruct,AD0040010Struct tempStruct,
    		AD0040010Struct headerStruct,String insertType) throws FoundationException, SQLException {
    	int updFlg = 0;
    	Numbering collectNum = new Numbering(conn,
				CollectNumber.ISSUE_CD,
				tempStruct.getUSER_CD(),
				tempStruct.getPRG_NM(),
				tempStruct.getPLANT_CD());
    	String no = null;
    	
    	AD0040010Struct tempIssueStruct = new AD0040010Struct();
		// 入出庫管理番号採番
		 no = collectNum.getNo();
		if (no == null || no.length() == 0) {
			//採番結果がない
			errCode = "ZZ01106";
			writeLogFiles(ERROR, errCode);
			updFlg = 9;
			return updFlg;
		}
		// 入出庫管理番号
		tempIssueStruct.setRCV_ISSUE_CTRL_CD(no);
		issueStruct.setRCV_ISSUE_CTRL_CD(no);
		//品目番号
		tempIssueStruct.setITEM_CD(issueStruct.getITEM_CD());
		//製番
		tempIssueStruct.setJOB_ODR_CD(issueStruct.getJOB_ODR_CD());
		//製番枝番
		tempIssueStruct.setJOB_ODR_DETAIL_NO("0");
		//受入回数
		tempIssueStruct.setACPT_NO("0");
		//作業計画番号
		tempIssueStruct.setWORK_ODR_CD(headerStruct.getWORK_ODR_CD());
		//仕掛作業コード
		tempIssueStruct.setWORK_IN_PROC_CD(headerStruct.getWORK_IN_PROC_CD());
		//分作回数
		tempIssueStruct.setPARTIAL_PRD_NO(tempStruct.getPARTIAL_PRD_NO());
		//作業実績訂正回数
		tempIssueStruct.setOPR_RSLT_CRCT_NO("0");
		//入出庫年月日
		tempIssueStruct.setRCV_ISSUE_DATE(tempStruct.getOPR_DATE());
		//入出庫端数
		tempIssueStruct.setRCV_ISSUE_ODD_QTY("0");
		//在庫更新区分
		tempIssueStruct.setSTOCK_UPD_TYP("2");
		//オーダデマンド番号
		tempIssueStruct.setOD_NO(headerStruct.getOD_NO());
		//工場コード
		tempIssueStruct.setPLANT_CD(headerStruct.getPLANT_CD());
		
		tempIssueStruct.setUSER_CD(tempStruct.getUSER_CD());
		tempIssueStruct.setPRG_NM(tempStruct.getPRG_NM());
		
		// ロット管理を行うの場合
		if ("1".equals(issueStruct.getLOT_CTRL_FLG())) {
			//在庫ロット番号
			tempIssueStruct.setLOT_NO(m_med.getUSE_LOT_NO());
		} else {
			//在庫ロット番号
			tempIssueStruct.setLOT_NO("");
		}
		
		if ("2".equals(insertType)) {					// 出庫の場合
			//入出庫区分
			tempIssueStruct.setRCV_ISSUE_TYP("2");
			//保管区コード
			tempIssueStruct.setWH_CD(issueStruct.getWH_CD());
			//出庫指示番号
			tempIssueStruct.seth_ISSUE_INST_CD(issueStruct.geth_ISSUE_INST_CD());
			//入出庫前在庫数
			tempIssueStruct.setSAVE_STOCK_ON_HAND_QTY(issueStruct.getSAVE_STOCK_ON_HAND_QTY());
			// ロット管理を行うの場合
			if ("1".equals(issueStruct.getLOT_CTRL_FLG())) {
				//入出庫数
				tempIssueStruct.setRCV_ISSUE_QTY(Calculate.multiply(issueStruct.getRCV_ISSUE_QTY(), "-1"));
			} else {
				//入出庫数
				tempIssueStruct.setRCV_ISSUE_QTY(Calculate.multiply(issueStruct.getTEMP_USE_QTY(), "-1"));
			}
			
			//入出庫後在庫数
			tempIssueStruct.setRCV_ISSUE_AFTER_QTY(tempIssueStruct.getRCV_ISSUE_QTY());
			//入出庫発生区分
			tempIssueStruct.setRCV_ISSUE_GNR_TYP("41");
			//入出庫完了フラグ
			tempIssueStruct.setRCV_ISSUE_CMPLT_FLG("0");
    	} else if ("1".equals(insertType)) {			// 入庫の場合
    		//入出庫区分
			tempIssueStruct.setRCV_ISSUE_TYP("1");
			//保管区コード
			tempIssueStruct.setWH_CD(tempStruct.getWH_CD());
			//出庫指示番号
			tempIssueStruct.seth_ISSUE_INST_CD(null);
			//入出庫前在庫数
			tempIssueStruct.setSAVE_STOCK_ON_HAND_QTY(issueStruct.getSAVE_STOCK_ON_HAND_QTY());
			//入出庫数
			// ロット管理を行うの場合
			if ("1".equals(issueStruct.getLOT_CTRL_FLG())) {
				//入出庫数
				tempIssueStruct.setRCV_ISSUE_QTY(issueStruct.getRCV_ISSUE_QTY());
			} else {
				//入出庫数
				tempIssueStruct.setRCV_ISSUE_QTY(m_med.getUSE_ACPT_QTY());
			}
			//入出庫後在庫数
			tempIssueStruct.setRCV_ISSUE_AFTER_QTY(tempIssueStruct.getRCV_ISSUE_QTY());
			//入出庫発生区分
			tempIssueStruct.setRCV_ISSUE_GNR_TYP("61");
			//入出庫完了フラグ
			tempIssueStruct.setRCV_ISSUE_CMPLT_FLG(tempStruct.getc_COMPLETE());
    	} else if ("3".equals(insertType)) {			// 不良入庫の場合
    		//入出庫区分
			tempIssueStruct.setRCV_ISSUE_TYP("3");
			//保管区コード
			tempIssueStruct.setWH_CD(tempStruct.getWH_CD());
			//出庫指示番号
			tempIssueStruct.seth_ISSUE_INST_CD(null);
			//入出庫前在庫数
			tempIssueStruct.setSAVE_STOCK_ON_HAND_QTY(issueStruct.getSAVE_STOCK_ON_HAND_QTY());
			//入出庫数
			// ロット管理を行うの場合
			if ("1".equals(issueStruct.getLOT_CTRL_FLG())) {
				//入出庫数
				tempIssueStruct.setRCV_ISSUE_QTY(issueStruct.getRCV_ISSUE_QTY());
			} else {
				//入出庫数
				tempIssueStruct.setRCV_ISSUE_QTY(m_med.getUSE_DEFECT_QTY());
			}
			//入出庫後在庫数
			tempIssueStruct.setRCV_ISSUE_AFTER_QTY(tempIssueStruct.getRCV_ISSUE_QTY());
			//入出庫発生区分
			tempIssueStruct.setRCV_ISSUE_GNR_TYP("61");
			//入出庫完了フラグ
			tempIssueStruct.setRCV_ISSUE_CMPLT_FLG(tempStruct.getc_COMPLETE());
    	}
		tempIssueStruct.setCOMPANY_CD(company_cd);
		//保管区別入出庫登録
		entity.mInsertRecvIssue.create(conn, tempIssueStruct);
    	return updFlg;
    }
    
	/**
	 * システムパラメータ(時間管理)取得
	 * @return 
	 * @throws SQLException 
	 */
	private void GetTimeCtrl() throws SQLException{
		// システムパラメータ（TIME_CTRL）取得
 		PrivateConfig privateConfig = new PrivateConfig(conn);
 		String aprInvCtrl = privateConfig.getString("TIME_CTRL");
		struct.setTIME_CTRL(aprInvCtrl);
	}

	/**
	 * 作業実績CSVデータ取得
     * @param	csvIntakeFrom   CSV取込時間From
     * @param	csvIntakeTo		CSV取込時間To
     * @return	oprRsltList     作業実績リスト
	 * @throws BatchAppException 
	 * @throws SQLException 
	 * @throws FoundationException 
	 */
	private List selectOprRsltData(String csvIntakeFrom,String csvIntakeTo) throws BatchAppException {
		 List rtnList = new ArrayList();
	     m_med.getT_OPR_RSLT_TEMP().read();
		 medAD0080B001 temp_med = null;
	     while(m_med.getT_OPR_RSLT_TEMP().next()) {
	    	 temp_med = new medAD0080B001();
	    	 temp_med.setOPR_RSLT_TEMP_CTL_NO(m_med.getOPR_RSLT_TEMP_CTL_NO());
	    	 temp_med.setOPR_INST_CD(m_med.getOPR_INST_CD());
	    	 temp_med.setITEM_CD(m_med.getITEM_CD());
	    	 temp_med.setACPT_QTY(m_med.getACPT_QTY());
	    	 temp_med.setDEFECT_QTY(m_med.getDEFECT_QTY());
	    	 temp_med.setOPR_DATE(m_med.getOPR_DATE());
	    	 temp_med.setWH_CD(m_med.getWH_CD());
	    	 temp_med.setWS_CD(m_med.getWS_CD());
	    	 temp_med.setOPR_RSLT_PERSON(m_med.getOPR_RSLT_PERSON());
	    	 temp_med.setOPR_RSLT_COMMENT(m_med.getOPR_RSLT_COMMENT());
	    	 temp_med.setOPR_TIME_UNIT_TYP(m_med.getOPR_TIME_UNIT_TYP());
	    	 temp_med.setPRE_ARRANGEMENT_TIME(m_med.getPRE_ARRANGEMENT_TIME());
	    	 temp_med.setPOST_ARRANGEMENT_TIME(m_med.getPOST_ARRANGEMENT_TIME());
	    	 temp_med.setOPR_TIME(m_med.getOPR_TIME());
	    	 temp_med.setCESSATION_TIME(m_med.getCESSATION_TIME());
	    	 temp_med.setCESSATION_CAUSE(m_med.getCESSATION_CAUSE());
	    	 temp_med.setLOT_NO(m_med.getLOT_NO());
	    	 temp_med.setVEND_LOT_NO(m_med.getVEND_LOT_NO());
	    	 temp_med.setDEFECT_CAUSE_CD1(m_med.getDEFECT_CAUSE_CD1());
	    	 temp_med.setDEFECT_QTY1(m_med.getDEFECT_QTY1());
	    	 temp_med.setDEFECT_COMMENT1(m_med.getDEFECT_COMMENT1());
	    	 temp_med.setDEFECT_CAUSE_CD2(m_med.getDEFECT_CAUSE_CD2());
	    	 temp_med.setDEFECT_QTY2(m_med.getDEFECT_QTY2());
	    	 temp_med.setDEFECT_COMMENT2(m_med.getDEFECT_COMMENT2());
	    	 temp_med.setDEFECT_CAUSE_CD3(m_med.getDEFECT_CAUSE_CD3());
	    	 temp_med.setDEFECT_QTY3(m_med.getDEFECT_QTY3());
	    	 temp_med.setDEFECT_COMMENT3(m_med.getDEFECT_COMMENT3());
	    	 temp_med.setDEFECT_CAUSE_CD4(m_med.getDEFECT_CAUSE_CD4());
	    	 temp_med.setDEFECT_QTY4(m_med.getDEFECT_QTY4());
	    	 temp_med.setDEFECT_COMMENT4(m_med.getDEFECT_COMMENT4());
	    	 temp_med.setDEFECT_CAUSE_CD5(m_med.getDEFECT_CAUSE_CD5());
	    	 temp_med.setDEFECT_QTY5(m_med.getDEFECT_QTY5());
	    	 temp_med.setDEFECT_COMMENT5(m_med.getDEFECT_COMMENT5());
	    	 temp_med.setOPR_CMPLT_FLG(m_med.getOPR_CMPLT_FLG());
	    	 temp_med.setSUM_DEFECT_QTY(m_med.getSUM_DEFECT_QTY());
	    	 temp_med.setTAKE_DATE(m_med.getTAKE_DATE());
	    	 temp_med.setCHILD_RSLTUPDATE_FLG(m_med.getCHILD_RSLTUPDATE_FLG());
	    	 rtnList.add(temp_med);
	     }
	     return rtnList;
	}
	/**
	 * 作業実績データコピー
     * @param	AD0040010Struct	 作業実績struct
     * @param　　medAD0080B001　　CSV出力med
     * @param	AD0040010Struct	 作業仕掛struct
	 * @return  なし
	 * @throws SQLException 
	 */
	private void structCopy(AD0040010Struct tempStruct, medAD0080B001 tempMed, 
			AD0040010Struct headerStruct) throws SQLException {
		tempStruct.setOPR_INST_CD(tempMed.getOPR_INST_CD());
		// 品目番号
		if(isNull(tempMed.getITEM_CD())) {
			tempStruct.setITEM_CD(headerStruct.getITEM_CD());
		} else {
			tempStruct.setITEM_CD(tempMed.getITEM_CD());
		}
		// 良品数
		if(isNull(tempMed.getACPT_QTY())) {
			tempStruct.setACPT_QTY(Calculate.subtract(headerStruct.getOPR_INST_QTY(), 
					Calculate.add(headerStruct.getSUM_ACPT_QTY(), headerStruct.getSUM_DEFECT_QTY())));
		} else {
			tempStruct.setACPT_QTY(tempMed.getACPT_QTY());
		}
		// 不良数
		if(isNull(tempMed.getDEFECT_QTY())) {
			tempStruct.setDEFECT_QTY("0");
		} else {
			tempStruct.setDEFECT_QTY(tempMed.getDEFECT_QTY());
		}		
		// 作業日
		if(isNull(tempMed.getOPR_DATE())) {
			tempStruct.setOPR_DATE(struct.geth_BUSINESS_OPR_DATE());
		} else {
			tempStruct.setOPR_DATE(tempMed.getOPR_DATE());
		}
		
		// 保管区コード
//		if(isNull(tempMed.getWH_CD())) {
//			String wh_cd = ValidateWh.getDefaultOprWh(conn, tempStruct.getPLANT_CD(),tempStruct.getITEM_CD());
//			tempStruct.setWH_CD(wh_cd);
//		} else {
//			tempStruct.setWH_CD(tempMed.getWH_CD());
//		}
	   // システムパラメータ：”工程保管場所の在庫を管理”が”ON”の場合
		if ("1".equals(_processManageFlg)) {
			// 最終工程の場合、
			if ("1".equals(headerStruct.geth_FINAL_PROC_FLG())) {
				// 保管区コードNULL場合
				if(isNull(tempMed.getWH_CD())) {
					String wh_cd = ValidateWh.getDefaultOprWh(conn, tempStruct.getPLANT_CD(),tempStruct.getITEM_CD());
					tempStruct.setWH_CD(wh_cd);
				} else {
					// 保管区コードNULLでない場合
					tempStruct.setWH_CD(tempMed.getWH_CD());
				} 
				
				// 最終工程以外の場合、
			} else {
				// 保管区コードNULL場合
				if(isNull(tempMed.getWH_CD())) {
					//次工程の保管区コードで設定する
					tempStruct.setWH_CD(tempMed.getNEXT_WH_CD());
				} else {
					// 保管区コードNULLでない場合
					tempStruct.setWH_CD(tempMed.getWH_CD());
				} 
			}
		} else {
			// システムパラメータ：”工程保管場所の在庫を管理”が”OFF”の場合
			if(isNull(tempMed.getWH_CD())) {
				String wh_cd = ValidateWh.getDefaultOprWh(conn, tempStruct.getPLANT_CD(),tempStruct.getITEM_CD());
				tempStruct.setWH_CD(wh_cd);
			} else {
				tempStruct.setWH_CD(tempMed.getWH_CD());
			}
		}
		
		// 作業区コード
		if(isNull(tempMed.getWS_CD())) {
			tempStruct.setWS_CD(headerStruct.getWS_CD());
		} else {
			tempStruct.setWS_CD(tempMed.getWS_CD());
		}
		tempStruct.setOPR_RSLT_PERSON(tempMed.getOPR_RSLT_PERSON());
		tempStruct.setOPR_RSLT_COMMENT(tempMed.getOPR_RSLT_COMMENT());
		tempStruct.setOPR_TIME_UNIT_TYP(tempMed.getOPR_TIME_UNIT_TYP());
		tempStruct.setPRE_ARRANGEMENT_TIME(tempMed.getPRE_ARRANGEMENT_TIME());
		tempStruct.setPOST_ARRANGEMENT_TIME(tempMed.getPOST_ARRANGEMENT_TIME());
		tempStruct.setOPR_TIME(tempMed.getOPR_TIME());
		tempStruct.setCESSATION_TIME(tempMed.getCESSATION_TIME());
		tempStruct.setCESSATION_CAUSE(tempMed.getCESSATION_CAUSE());
		tempStruct.setLOT_NO(tempMed.getLOT_NO());
		tempStruct.setVEND_LOT_NO(tempMed.getVEND_LOT_NO());
	}
	/**
	 * 作業実績CSV取込データのチェック
     * @param  AD0040010Struct	 作業実績struct
     * @param  AD0040010Struct	 作業実績ヘーダstruct
     * @param  medAD0080B001　　  CSV出力med
	 * @return int			     0：エラー無い　1：データチェックエラー　
	 * @throws SQLException
	 * @throws FoundationException 
	 * @throws ParseException 
	 * @throws BatchAppException 
	 */
	private int dataCheck(AD0040010Struct checkStruct, AD0040010Struct headerStruct, medAD0080B001 checkMed)
		throws SQLException, FoundationException, ParseException, BatchAppException{
		// 品目番号の一致チェック
		if(!checkStruct.getITEM_CD().equals(headerStruct.getITEM_CD())) {
			// 品目番号が作業系列別仕掛と一致していません。
			errCode = "AD00205";
			writeLogFiles(ERROR,errCode);
			return 1;
		}

		// 作業日のチェック
		if(DateTool.compareYMD(checkStruct.getOPR_DATE(), struct.geth_BUSINESS_OPR_DATE()) > 0) {
			// 日付が業務運用日より未来です。
			errCode = "AD30773";
			writeLogFiles(ERROR,errCode);
			return 1;
		} else if(DateTool.compareYMD(checkStruct.getOPR_DATE(), struct.geth_BUSINESS_OPR_DATE()) < 0) {
			// 作業日に過去日が設定されています。
			writeLogFiles(WORNING,"AD00206");
		}
		
		// 実際原価の締めが完了している日付チェック
		BigDecimal ProcExecDate = null;
		// システムパラメータ（実際原価区分）取得
 		PrivateConfig privateConfig = new PrivateConfig(conn);
 		String entityTyp = privateConfig.getString("PAST_RESULT_ENTRY_TYP");
 		if("false".equalsIgnoreCase(entityTyp)) {
 			List procExecDateList = entity.mSELECT_SYS_ACTUAL_COST_CTRL_AC.read(conn, struct);
 			if(!procExecDateList.isEmpty()) {
 				ProcExecDate = ((AD0040010Struct) procExecDateList.get(0)).getPROC_EXEC_DATE();
 			}		
 			// CSV入力作業日
 			BigDecimal csvInput = new BigDecimal(checkStruct.getOPR_DATE().substring(0,4) + 
 					checkStruct.getOPR_DATE().substring(5,7));
 			if(csvInput.compareTo(ProcExecDate) < 0) {
 				// 実際原価の締めが完了している日付では入力できません。
 				errCode = "AE00160";
 				writeLogFiles(ERROR,errCode);
 				return 1;
 			}
 		}
 		
 		// 保管区の存在チェック
 		AD0040010Struct tempStruct = null;
 		List tempList = entity.mSelectChkWhCd.read(conn,checkStruct);
 		if(tempList.isEmpty()) {
 			// 指定された保管区コードは存在しません。
 			errCode = "AD00020";
 			writeLogFiles(ERROR,errCode);
 			return 1;
 		} else {
 			tempStruct = (AD0040010Struct)tempList.get(0);
			//保管区コードの工場コードと作業系列別仕掛の工場コードの同一チェック
			if (tempStruct.getPLANT_CD() == null 
					|| !tempStruct.getPLANT_CD().equals(headerStruct.getPLANT_CD())) {
				errCode = "AD00021";
	 			writeLogFiles(ERROR,errCode);
	 			return 1;
			}
 		}

 		// 作業区の存在チェック
 		tempList = entity.mSelectChkWsCd.read(conn,checkStruct);
 		if (tempList.isEmpty()) {
 			// 該当する作業区コードが見つかりません。
 			errCode = "AD20029";
 			writeLogFiles(ERROR,errCode);
 			return 1;
 		} else {
 			tempStruct = (AD0040010Struct)tempList.get(0);
			//実績作業区コードの工場コードと作業系列別仕掛の工場コードの同一チェック
			if (tempStruct.getPLANT_CD() == null 
					|| !tempStruct.getPLANT_CD().equals(headerStruct.getPLANT_CD())) {
				errCode = "AD00004";
	 			writeLogFiles(ERROR,errCode);
	 			return 1;
			}
 		}

 		// 「良品数」＋ 「不良数」
 		String allQty = Calculate.add(checkStruct.getACPT_QTY(), checkStruct.getDEFECT_QTY());
 		//[作業時間の累計
 		String alltime =Calculate.add(Calculate.add(Calculate.add(checkStruct.getPRE_ARRANGEMENT_TIME()
 				              ,checkStruct.getPOST_ARRANGEMENT_TIME())
 				              ,checkStruct.getOPR_TIME())
 				              ,checkStruct.getCESSATION_TIME());
 		//  良品累計＋　不良累計
 		String sumQty = Calculate.add(headerStruct.getSUM_ACPT_QTY(), headerStruct.getSUM_DEFECT_QTY());
 		
 		// 「良品数」　＝　0、かつ、「不良数」　＝　0 かつ、各作業時間 ＝　0 のチェック 　かつ　「作業完了フラグ」　≠　2：0完了の場合
 		if(Calculate.compare(Calculate.add(allQty,alltime), "0") == 0 && !"2".equals(m_med.getOPR_CMPLT_FLG())) {
 			errCode = "AE00202";
 			writeLogFiles(ERROR,errCode);
 			return 1;
 		} 
 				
 		// 保管区コードの入力チェック
// 		if("1".equals(headerStruct.geth_FINAL_PROC_FLG()) && isNull(checkStruct.getWH_CD()) &&
// 				Calculate.compare(allQty, "0") != 0) {
// 			// 保管区コードが未入力です。
// 			errCode = "AD20060";
// 			writeLogFiles(ERROR,errCode);
// 			return 1;
// 		}
 		if(!"1".equals(_processManageFlg) && "1".equals(headerStruct.geth_FINAL_PROC_FLG()) 
 				&& isNull(checkStruct.getWH_CD()) &&
			Calculate.compare(allQty, "0") != 0) {
			// 保管区コードが未入力です。
			errCode = "AD20060";
			writeLogFiles(ERROR,errCode);
			return 1;
 		} else if ("1".equals(_processManageFlg) && isNull(checkStruct.getWH_CD()) 
 				&& Calculate.compare(allQty, "0") != 0) {
 			// システムパラメータ：”工程保管場所の在庫を管理”が”ＯＮ” 且つ、「良品数」＋ 「不良数」≠ 0、
 			// かつ、「保管区コード」 ＝ Null の場合、保管区コードが未入力場合
			errCode = "AD20060";
			writeLogFiles(ERROR,errCode);
			return 1;
 		}
 		
 		// システムパラメータ：”工程保管場所の在庫を管理”が”ＯＮ” 且つ、最終工程以外の場合、[保管区].”倉庫区分”が １：工程保管場所 でない場合
 		if("1".equals(_processManageFlg) && !"1".equals(headerStruct.geth_FINAL_PROC_FLG()) 
 				&& !"1".equals(checkMed.getWH_TYP().toString())) {
 			errCode = "AA00156";
 			writeLogFiles(ERROR,errCode);
 			return 1;
 		}
 		
 		//システムパラメータ：”工程保管場所の在庫を管理”が”ＯＮ” 且つ、最終工程以外且つ分作回数>1の場合、作業指示番号ごとに保管区コードが不一致の場合
 		if("1".equals(_processManageFlg) && !"1".equals(headerStruct.geth_FINAL_PROC_FLG()) 
 				&& Calculate.compare(checkStruct.getPARTIAL_PRD_NO(),"1") > 0 
 				&& Calculate.compare(checkMed.getWH_CD_COUNT(),"0") == 0) {
 			errCode = "AD00230";
 			writeLogFiles(ERROR,errCode);
 			return 1;
 		}

 		// システムパラメータ：”工程保管場所の在庫を管理”が”ＯＮ” 且つ、最初工程でない、且つ前回工程の[作業実績]に登録しない場合
 		if("1".equals(_processManageFlg) && !"1".equals(checkMed.getFIRST_WORK_FLG())
 				&& isNull(checkMed.getPREV_WORK_ODR_CD())) {
 			errCode = "AD00228";
 			writeLogFiles(ERROR,errCode);
 			return 1;
 		}
 		// システムパラメータ：”工程保管場所の在庫を管理”が”ＯＮ” 且つ、
 		// [作業系列別仕掛]から取得する[作業系列別仕掛].“仕掛内外作区分”が2：外作のレコードがある場合
 		if("1".equals(_processManageFlg) && Calculate.compare(checkMed.getDATA_COUNT(),"0") > 0) {
 			errCode = "AD00229";
 			writeLogFiles(ERROR,errCode);
 			return 1;
 		}
 		
	 		
	 		// （良品累計 + 　「良品数」） ＋　(不良累計 + 「不良数」) ＞ 作業指示数 のチェック
	 		if(Calculate.compare(Calculate.add(sumQty, allQty), headerStruct.getOPR_INST_QTY()) > 0) {
	 			// 作業指示数を超えています。
	 			writeLogFiles(WORNING,"AD00208");
	 		}
	 		
	 		// （良品累計 + 　「良品数」） ＋　(不良累計 + 「不良数」) ＜ 作業指示数 のチェック
	 		if("1".equals(checkStruct.getc_COMPLETE()) && 
	 				Calculate.compare(Calculate.add(sumQty, allQty), headerStruct.getOPR_INST_QTY()) < 0) {
	 			// 作業指示数を下回って、完了しています。
	 			writeLogFiles(WORNING,"AD00209");
	 		}


 		// 品目が整数管理品の場合、切下げを行う
		if ("1".equals(headerStruct.getUNIT_QTY_TYP()) && 
				(Calculate.isNumeric(checkStruct.getACPT_QTY()) || Calculate.isNumeric(checkStruct.getDEFECT_QTY()))) {			
			checkStruct.setACPT_QTY(Calculate.floor(checkStruct.getACPT_QTY(), 0));
			checkStruct.setDEFECT_QTY(Calculate.floor(checkStruct.getDEFECT_QTY(), 0));
			// 整数管理品目のため小数点以下は切り捨てされます。
			writeLogFiles(WORNING,"AD00210");
		}
		
		// 不良理由コード01のチェック
		if(!isNull(checkMed.getDEFECT_CAUSE_CD1())) {
			m_med.setDEFECT_CAUSE_CD(checkMed.getDEFECT_CAUSE_CD1());
			m_med.getSYS_TYPE_VALUE().read();
			if(!m_med.getSYS_TYPE_VALUE().next()) {
				// 作業不良理由コードが存在しません。
				errCode = "AD00211";
	 			writeLogFiles(ERROR,errCode);
	 			return 1;
			}
		}
		
		// 不良理由コード02のチェック
		if(!isNull(checkMed.getDEFECT_CAUSE_CD2())) {
			m_med.setDEFECT_CAUSE_CD(checkMed.getDEFECT_CAUSE_CD2());
			m_med.getSYS_TYPE_VALUE().read();
			if(!m_med.getSYS_TYPE_VALUE().next()) {
				// 作業不良理由コードが存在しません。
				errCode = "AD00211";
	 			writeLogFiles(ERROR,errCode);
	 			return 1;
			}
		}
		
		// 不良理由コード03のチェック
		if(!isNull(checkMed.getDEFECT_CAUSE_CD3())) {
			m_med.setDEFECT_CAUSE_CD(checkMed.getDEFECT_CAUSE_CD3());
			m_med.getSYS_TYPE_VALUE().read();
			if(!m_med.getSYS_TYPE_VALUE().next()) {
				// 作業不良理由コードが存在しません。
				errCode = "AD00211";
	 			writeLogFiles(ERROR,errCode);
	 			return 1;
			}
		}
		
		// 不良理由コード04のチェック
		if(!isNull(checkMed.getDEFECT_CAUSE_CD4())) {
			m_med.setDEFECT_CAUSE_CD(checkMed.getDEFECT_CAUSE_CD4());
			m_med.getSYS_TYPE_VALUE().read();
			if(!m_med.getSYS_TYPE_VALUE().next()) {
				// 作業不良理由コードが存在しません。
				errCode = "AD00211";
	 			writeLogFiles(ERROR,errCode);
	 			return 1;
			}
		}
		
		// 不良理由コード05のチェック
		if(!isNull(checkMed.getDEFECT_CAUSE_CD5())) {
			m_med.setDEFECT_CAUSE_CD(checkMed.getDEFECT_CAUSE_CD5());
			m_med.getSYS_TYPE_VALUE().read();
			if(!m_med.getSYS_TYPE_VALUE().next()) {
				// 作業不良理由コードが存在しません。
				errCode = "AD00211";
	 			writeLogFiles(ERROR,errCode);
	 			return 1;
			}
		}
		
		// 不良理由コード01＝Null かつ「不良数01」 > 0 の場合
		if(isNull(checkMed.getDEFECT_CAUSE_CD1()) && !isNull(checkMed.getDEFECT_QTY1()) && Calculate.compare(checkMed.getDEFECT_QTY1(), "0") > 0) {
			// 作業不良理由コードが未入力です。
			errCode = "AD30009";
 			writeLogFiles(ERROR,errCode);
 			return 1;
		}
		
		// 不良理由コード02＝Null かつ「不良数02」 > 0 の場合
		if(isNull(checkMed.getDEFECT_CAUSE_CD2()) && !isNull(checkMed.getDEFECT_QTY2()) && Calculate.compare(checkMed.getDEFECT_QTY2(), "0") > 0) {
			// 作業不良理由コードが未入力です。
			errCode = "AD30009";
 			writeLogFiles(ERROR,errCode);
 			return 1;
		}
		
		// 不良理由コード03＝Null かつ「不良数03」 > 0 の場合
		if(isNull(checkMed.getDEFECT_CAUSE_CD3()) && !isNull(checkMed.getDEFECT_QTY3()) && Calculate.compare(checkMed.getDEFECT_QTY3(), "0") > 0) {
			// 作業不良理由コードが未入力です。
			errCode = "AD30009";
 			writeLogFiles(ERROR,errCode);
 			return 1;
		}
		
		// 不良理由コード04＝Null かつ「不良数04」 > 0 の場合
		if(isNull(checkMed.getDEFECT_CAUSE_CD4()) && !isNull(checkMed.getDEFECT_QTY4()) && Calculate.compare(checkMed.getDEFECT_QTY4(), "0") > 0) {
			// 作業不良理由コードが未入力です。
			errCode = "AD30009";
 			writeLogFiles(ERROR,errCode);
 			return 1;
		}
		
		// 不良理由コード05＝Null かつ「不良数05」 > 0 の場合
		if(isNull(checkMed.getDEFECT_CAUSE_CD5()) && !isNull(checkMed.getDEFECT_QTY5()) && Calculate.compare(checkMed.getDEFECT_QTY5(), "0") > 0) {
			// 作業不良理由コードが未入力です。
			errCode = "AD30009";
 			writeLogFiles(ERROR,errCode);
 			return 1;
		}
		
		// 整数管理品目の場合
		if("1".equals(headerStruct.getUNIT_QTY_TYP())) {
			// 「不良理由コード1」≠Null かつ、「不良数1」 = Null OR　0
			if(!isNull(checkMed.getDEFECT_CAUSE_CD1()) &&
					(isNull(checkMed.getDEFECT_QTY1()) || Calculate.compare(checkMed.getDEFECT_QTY1(), "0")==0)) {
				// 不良理由の不良数には、0より大きい整数を入力してください。
				errCode = "AD00102";
				writeLogFiles(ERROR,errCode);
				return 1;
			}
			// 「不良理由コード2」≠Null かつ、「不良数2」 = Null OR　0
			if(!isNull(checkMed.getDEFECT_CAUSE_CD2()) &&
					(isNull(checkMed.getDEFECT_QTY2()) || Calculate.compare(checkMed.getDEFECT_QTY2(), "0")==0)) {
				// 不良理由の不良数には、0より大きい整数を入力してください。
				errCode = "AD00102";
				writeLogFiles(ERROR,errCode);
				return 1;
			}
			// 「不良理由コード3」≠Null かつ、「不良数3」 = Null OR　0
			if(!isNull(checkMed.getDEFECT_CAUSE_CD3()) &&
					(isNull(checkMed.getDEFECT_QTY3()) || Calculate.compare(checkMed.getDEFECT_QTY3(), "0")==0)) {
				// 不良理由の不良数には、0より大きい整数を入力してください。
				errCode = "AD00102";
				writeLogFiles(ERROR,errCode);
				return 1;
			}
			// 「不良理由コード4」≠Null かつ、「不良数4」 = Null OR　0
			if(!isNull(checkMed.getDEFECT_CAUSE_CD4()) &&
					(isNull(checkMed.getDEFECT_QTY4()) || Calculate.compare(checkMed.getDEFECT_QTY4(), "0")==0)) {
				// 不良理由の不良数には、0より大きい整数を入力してください。
				errCode = "AD00102";
				writeLogFiles(ERROR,errCode);
				return 1;
			}
			// 「不良理由コード5」≠Null かつ、「不良数5」 = Null OR　0
			if(!isNull(checkMed.getDEFECT_CAUSE_CD5()) &&
					(isNull(checkMed.getDEFECT_QTY5()) || Calculate.compare(checkMed.getDEFECT_QTY5(), "0")==0)) {
				// 不良理由の不良数には、0より大きい整数を入力してください。
				errCode = "AD00102";
				writeLogFiles(ERROR,errCode);
				return 1;
			}
		}
		// 小数管理品目の場合
		if("2".equals(headerStruct.getUNIT_QTY_TYP())) {
			// 「不良理由コード1」≠Null かつ、「不良数1」 = Null OR　0
			if(!isNull(checkMed.getDEFECT_CAUSE_CD1()) &&
					(isNull(checkMed.getDEFECT_QTY1()) || Calculate.compare(checkMed.getDEFECT_QTY1(), "0")==0)) {
				// 不良理由の不良数には、0より大きい数値を入力してください。
				errCode = "AD00103";
				writeLogFiles(ERROR,errCode);
				return 1;
			}
			// 「不良理由コード2」≠Null かつ、「不良数2」 = Null OR　0
			if(!isNull(checkMed.getDEFECT_CAUSE_CD2()) &&
					(isNull(checkMed.getDEFECT_QTY2()) || Calculate.compare(checkMed.getDEFECT_QTY2(), "0")==0)) {
				// 不良理由の不良数には、0より大きい数値を入力してください。
				errCode = "AD00103";
				writeLogFiles(ERROR,errCode);
				return 1;
			}
			// 「不良理由コード3」≠Null かつ、「不良数3」 = Null OR　0
			if(!isNull(checkMed.getDEFECT_CAUSE_CD3()) &&
					(isNull(checkMed.getDEFECT_QTY3()) || Calculate.compare(checkMed.getDEFECT_QTY3(), "0")==0)) {
				// 不良理由の不良数には、0より大きい数値を入力してください。
				errCode = "AD00103";
				writeLogFiles(ERROR,errCode);
				return 1;
			}
			// 「不良理由コード4」≠Null かつ、「不良数4」 = Null OR　0
			if(!isNull(checkMed.getDEFECT_CAUSE_CD4()) &&
					(isNull(checkMed.getDEFECT_QTY4()) || Calculate.compare(checkMed.getDEFECT_QTY4(), "0")==0)) {
				// 不良理由の不良数には、0より大きい数値を入力してください。
				errCode = "AD00103";
				writeLogFiles(ERROR,errCode);
				return 1;
			}
			// 「不良理由コード5」≠Null かつ、「不良数5」 = Null OR　0
			if(!isNull(checkMed.getDEFECT_CAUSE_CD5()) &&
					(isNull(checkMed.getDEFECT_QTY5()) || Calculate.compare(checkMed.getDEFECT_QTY5(), "0")==0)) {
				// 不良理由の不良数には、0より大きい数値を入力してください。
				errCode = "AD00103";
				writeLogFiles(ERROR,errCode);
				return 1;
			}
		}
		
		// 「不良数1～5」の合計　＞　「不良数」　のチェック
		if(Calculate.compare(checkMed.getSUM_DEFECT_QTY(), checkStruct.getDEFECT_QTY()) > 0) {
			// 不良理由の不良数が作業不良数を超えています。
			errCode = "AD00118";
			writeLogFiles(ERROR,errCode);
			return 1;
		} else if(Calculate.compare(checkMed.getSUM_DEFECT_QTY(), checkStruct.getDEFECT_QTY()) < 0) {
			// 不良理由の不良数が作業不良数未満です。
			writeLogFiles(WORNING,"AD00212");
		}
		
		// 「不良理由コードXX」の重複チェック
		HashSet set = new HashSet();
		int count = 0;
		if(!isNull(checkMed.getDEFECT_CAUSE_CD1())) {set.add(checkMed.getDEFECT_CAUSE_CD1()); count++;}
		if(!isNull(checkMed.getDEFECT_CAUSE_CD2())) {set.add(checkMed.getDEFECT_CAUSE_CD2()); count++;}
		if(!isNull(checkMed.getDEFECT_CAUSE_CD3())) {set.add(checkMed.getDEFECT_CAUSE_CD3()); count++;}
		if(!isNull(checkMed.getDEFECT_CAUSE_CD4())) {set.add(checkMed.getDEFECT_CAUSE_CD4()); count++;}
		if(!isNull(checkMed.getDEFECT_CAUSE_CD5())) {set.add(checkMed.getDEFECT_CAUSE_CD5()); count++;}
		if(set.size() < count) {
			// 不良理由コードが重複不可。
			errCode = "AE05062";
			writeLogFiles(ERROR,errCode);
			return 1;
		}
		
		// 「作業日」の時刻チェック	
		if("false".equalsIgnoreCase(struct.getTIME_CTRL()) && 
		   !"0000".equals(checkStruct.getOPR_DATE().substring(11,15))) {
			writeLogFiles(WORNING,"AD00213");
			// 時刻管理しないため、作業日時刻は切捨てされます。
			checkStruct.setOPR_DATE(checkStruct.getOPR_DATE().substring(0,10));
		}
		
		// 在庫ロット番号の入力チェック
		if(Calculate.compare(checkStruct.getACPT_QTY(), "0") > 0 &&
				"1".equals(headerStruct.getLOT_CTRL_FLG()) && 
				"1".equals(headerStruct.geth_FINAL_PROC_FLG()) &&
				"0".equals(headerStruct.getLOT_NUMBERING_TYP()) &&
				isNull(checkStruct.getLOT_NO())) {
			// 在庫ロット番号が入力されていません。
			errCode = "AE20600";
			writeLogFiles(ERROR,errCode);
			return 1;
		}

		if("1".equals(headerStruct.getLOT_CTRL_FLG()) && 
				"0".equals(headerStruct.geth_FINAL_PROC_FLG()) &&
				!isNull(checkStruct.getLOT_NO())) {
			// 工程外注・最終工程ではありません。在庫ロット番号をつける事はできません。
			errCode = "AE20602";
			writeLogFiles(ERROR,errCode);
			return 1;
		}
		
		if("0".equals(headerStruct.getLOT_CTRL_FLG()) && !isNull(checkStruct.getLOT_NO())) {
			// ロット管理でない品目です。在庫ロット番号を採番する事はできません。
			errCode = "AE20601";
			writeLogFiles(ERROR,errCode);
			return 1;
		}
		
		// 製番在庫数のチェック
		if("1".equals(checkStruct.getc_COMPLETE()) && !isNull(headerStruct.getJOB_ODR_CD())) {
			// 引当済出庫残数＞製番在庫（手持在庫）の場合
			if(!(new IssueRemain(conn)).isEnoughAlcdQty(checkStruct.getPLANT_CD(),
					checkStruct.getITEM_CD(), headerStruct.getJOB_ODR_CD(),
					AD0040Const._JOB_ODR_DETAIL_NO)){
				// 他製番への引当数が不足します。引当メンテナンスで修正してください。
				writeLogFiles(WORNING,"AD60001");
			}
		}
		return 0;
	}
	
	
	/**
	 * 工数管理品目の[保管区別入出庫]の追加（出庫）
     * @param	AD0040010Struct	 作業実績struct
     * @param	AD0040010Struct	 作業実績ヘーダstruct
     * @param	jobOdrNo		 製番
	 *
	 * @return boolean
	 * @exception Exception
	 */
	private boolean manHourRcvIssue(AD0040010Struct tempStruct, AD0040010Struct headerStruct, String jobOdrNo, String company_cd) throws Exception {
		AD0040010Struct manhourTypStruct = null;
		AD0040010Struct parentStruct = null;
		List selelctRcvIssueList = new ArrayList();
		AD0040010Struct selectRcvIssueStruct = new AD0040010Struct();
		boolean bFlg = false;

		String strPuchOdrCd = null;		// 登録用発注番号
		String strWorkOdrCd = null;		// 登録用作業計画番号
		String strWorkInProcCd = null;	// 登録用仕掛作業コード
		String no = null;
		List tempList = null;
		
		List manhourTypList = entity.mSelectItem.read(conn, headerStruct);

		if (!manhourTypList.isEmpty()) {
			manhourTypStruct = (AD0040010Struct)manhourTypList.get(0);
		}

		// [品目].工数管理品目区分 = 1:工数管理品目の場合
		if ("1".equals(manhourTypStruct.getMANHOUR_TYP())){
			Numbering collectNum = new Numbering(conn,
					CollectNumber.ISSUE_CD,
					tempStruct.getUSER_CD(),
					tempStruct.getPRG_NM(),
					tempStruct.getPLANT_CD());
			no = collectNum.getNo();
			if (no == null || no.length() == 0) {
				//採番結果がない
				errCode = "ZZ01106";
				writeLogFiles(ERROR, errCode);
				return false;
			}
			
			// 親品目の初工程に出庫するためのデータ設定
			List parentList = entity.mSELECT_PARENT.read(conn,headerStruct);
			if (!parentList.isEmpty()) {
				parentStruct = (AD0040010Struct)parentList.get(0);
				// 親品目が擬似品目の場合、さらに上の品目のオーダデマンド番号を取得する
				if ("8".equals(parentStruct.getPARENT_MRP_ODR_TYP())){
					parentList = new ArrayList();
					parentList = entity.mSELECT_DUMMY_PARENT.read(conn,parentStruct);
					if (!parentList.isEmpty()) {
						parentStruct = null;
						parentStruct = (AD0040010Struct)parentList.get(0);
					}
				}

				if (!parentList.isEmpty()){
					// 親品目が内作の場合
					if ("1".equals(parentStruct.getPARENT_OUTSIDE_TYP())){
						tempList = entity.mSELECT_T_WORK_IN_PROC_BY_PROC.read(conn,parentStruct);
						if (!tempList.isEmpty()){
							AD0040010Struct tWorkInProcByProcStruct = (AD0040010Struct)tempList.get(0);
							// 作業計画番号設定
							strWorkOdrCd = tWorkInProcByProcStruct.getPARENT_WORK_ODR_CD();
							// 作業指示番号設定
							strWorkInProcCd = tWorkInProcByProcStruct.getPARENT_WORK_IN_PROC_CD();
						}
					}
					// 親品目が外作の場合
					if ("2".equals(parentStruct.getPARENT_OUTSIDE_TYP())){
						tempList = entity.mSELECT_T_RLSD_PUCH_ODR.read(conn,parentStruct);
						if (!tempList.isEmpty()){
							AD0040010Struct tRlsdPuchOdrStruct = (AD0040010Struct)tempList.get(0);
							// 発注番号設定
							strPuchOdrCd = tRlsdPuchOdrStruct.getPARENT_PUCH_ODR_CD();
						}
					}
				}
			}

			AD0040010Struct outIssueStruct = new AD0040010Struct();
			outIssueStruct.setPUCH_ODR_CD(strPuchOdrCd);
			outIssueStruct.setWORK_ODR_CD(strWorkOdrCd);
			outIssueStruct.setWORK_IN_PROC_CD(strWorkInProcCd);
			outIssueStruct.setRCV_ISSUE_CTRL_CD(no);
			outIssueStruct.setITEM_CD(headerStruct.getITEM_CD());
			outIssueStruct.setPLANT_CD(headerStruct.getPLANT_CD());
			outIssueStruct.setPARTIAL_PRD_NO(tempStruct.getPARTIAL_PRD_NO());
			outIssueStruct.setWH_CD(tempStruct.getWH_CD());
			outIssueStruct.setJOB_ODR_CD(jobOdrNo);
			outIssueStruct.setRCV_ISSUE_QTY(Calculate.multiply(tempStruct.getACPT_QTY(), "-1"));
			outIssueStruct.setRCV_ISSUE_DATE(tempStruct.getOPR_DATE());
			outIssueStruct.setRCV_ISSUE_GNR_TYP("21");
			outIssueStruct.setRCV_ISSUE_ODD_QTY("0.0");
			outIssueStruct.setOD_NO(headerStruct.getOD_NO());
			outIssueStruct.setVEND_LOT_NO(tempStruct.getVEND_LOT_NO());
			outIssueStruct.setLOT_NO(tempStruct.getLOT_NO());
			outIssueStruct.setUSER_CD(tempStruct.getUSER_CD());
			outIssueStruct.setPRG_NM(tempStruct.getPRG_NM());
			outIssueStruct.setRCV_ISSUE_TYP("2");
			if ("1".equals(tempStruct.getc_COMPLETE())) {
				outIssueStruct.setRCV_ISSUE_CMPLT_FLG("1");
			} else {
				outIssueStruct.setRCV_ISSUE_CMPLT_FLG("0");
			}
			outIssueStruct.setSTOCK_UPD_TYP("1");
			outIssueStruct.setOPR_RSLT_CRCT_NO("0");  
			// 退避用手持ち在庫数を初期化
			outIssueStruct.setSAVE_STOCK_ON_HAND_QTY("0");
            //会社コード
			outIssueStruct.setCOMPANY_CD(company_cd);
			//保管区別入出庫
			entity.mINSERT_RCV_ISSUE2.create(conn, outIssueStruct);

			/* 出庫取消処理START */
			/* [T_RCV_ISSUE]読込 */
			boolean bRSLT = true;
			selelctRcvIssueList = entity.mSELECT_CHECK_T_RCV_ISSUE.read(conn,outIssueStruct);
			if (selelctRcvIssueList.isEmpty()) {
				bFlg = true;
				bRSLT = false;
			}else{
				selectRcvIssueStruct = (AD0040010Struct)selelctRcvIssueList.get(0);
			}

			/* エラーチェック */
			// 入出庫区分が"2"(出庫)でない
			if(!"2".equals(selectRcvIssueStruct.getRCV_ISSUE_TYP())) {
				bFlg = true;
				bRSLT = false;
			}

			// 入出庫発生区分が"21"(通常出庫)でない
			if(!bFlg
				&& selectRcvIssueStruct.getRCV_ISSUE_GNR_TYP()!=null 
				&& !selectRcvIssueStruct.getRCV_ISSUE_GNR_TYP().equals("21")){
				bFlg = true;
				bRSLT = false;
			}

			// 出庫処理呼び出し
			if(!bFlg){
				IssueProcess IProc = new IssueProcess(conn,selectRcvIssueStruct.getRCV_ISSUE_CTRL_CD());
				bRSLT = IProc.execProcess();
				if( !bRSLT ){
					bFlg = true;
					bRSLT = false;
				}
			}

			// 出庫取消処理
			// 前回出庫実績の検索
			if(!bFlg){
				// [保管区別入出庫]."作業実績訂正回数"が1以上の時
				// ＊出庫を取消す場合は必ず1以上である
				if( selectRcvIssueStruct.getOPR_RSLT_CRCT_NO()!=null
						&& selectRcvIssueStruct.getOPR_RSLT_CRCT_NO().compareTo("1")>=0){

					selelctRcvIssueList = new ArrayList();
					selelctRcvIssueList = entity.mSELECT_T_RCV_ISSUE.read(conn,selectRcvIssueStruct);
					if (selelctRcvIssueList.isEmpty()) {
						bFlg = true;
						bRSLT = false;
					}else{
						selectRcvIssueStruct = new AD0040010Struct();
						selectRcvIssueStruct = (AD0040010Struct)selelctRcvIssueList.get(0);
					}
				}else{
					bFlg = true;
				}
			}

			if(!bFlg){
				//保管区別入出庫への追加
				BigDecimal bQty = new BigDecimal(selectRcvIssueStruct.getRCV_ISSUE_QTY());
				selectRcvIssueStruct.setRCV_ISSUE_QTY(bQty.negate().toString());

				collectNum = new Numbering(conn,
						CollectNumber.ISSUE_CD,
						tempStruct.getUSER_CD(), 
						tempStruct.getPRG_NM(),
						tempStruct.getPLANT_CD());
				no = collectNum.getNo();

				selectRcvIssueStruct.setRCV_ISSUE_CTRL_CD(no);		//採番したｷｰをｾｯﾄ
				selectRcvIssueStruct.setUSER_CD(tempStruct.getUSER_CD());
				selectRcvIssueStruct.setPRG_NM(tempStruct.getPRG_NM());
				if ("1".equals(tempStruct.getc_COMPLETE())) {
					selectRcvIssueStruct.setRCV_ISSUE_CMPLT_FLG("1");
				} else {
					selectRcvIssueStruct.setRCV_ISSUE_CMPLT_FLG("0");
				}
                //会社コード
				selectRcvIssueStruct.setCOMPANY_CD(company_cd);
				entity.mINSERT_T_RCV_ISSUE.create(conn,selectRcvIssueStruct);

				// 出庫取消処理呼び出し
				IssueProcess IProc = new IssueProcess(conn,selectRcvIssueStruct.getRCV_ISSUE_CTRL_CD());
				bRSLT = IProc.execProcess();
			}

			if (!bRSLT) {
				//出庫処理失敗 サーバーエラー
				errCode = "ZZ01106";
				writeLogFiles(ERROR, errCode);
				return false;
			}
		}
		return true;
	}
	
	/**
	 * メッセージをセット
     * @param	strKey	 HashMap key
     * @param	intFlg	 HashMap intFlg
     * @param	errMsg	 HashMap errMsg
	 *
	 * @exception Exception
	 */	
	private void setMessageHash(String strKey,int intFlg,String errMsg){
		List hashList = new ArrayList();
		hashList.add(0, Integer.toString(intFlg));
		hashList.add(1, errMsg);
		tempHashMap.put(strKey, hashList);
	}
    //-++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	
	/**
	 * main： ユーザ定義用メソッドです<br>
	 * <<説明を記述してください>>
	 *
	 * @return <<説明を記述してください>>
	 * @exception <<説明を記述してください>>
	 */
	public int main() throws BatchAppException
	{
		// ロック解除キー
		int lockCancelKey = LOCK_FAILD;
		// DB接続取得処理
		conn = m_conductor.m_transactionConn;
		// パラメータ取得
		String[] args = m_med.getArgs();
        if(args.length >= 2){
           m_med.setUsername(m_med.getArgs()[1]);
        }

		try {		        
			// 引数チェック
			if (!checkArgs()) {
				writeLog(ERROR, "ZZ09009");
				return BREAK;
			}
			
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
			
			/* 作業実績CVS取込バッチ処理 */
			exeOprRsltCsvLoad(getSysUserCd(), getSysProgramId(),
					getBusinessDate(),getCsvIntakeFrom(), getCsvIntakeTo());

		} catch (SQLException e) {
			e.printStackTrace();
			throw new BatchAppException("CtrlMain", "main", e.getMessage());
		} catch (FoundationException e) {
			e.printStackTrace();
			throw new BatchAppException("CtrlMain", "main", e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
			throw new BatchAppException("CtrlMain", "main", e.getMessage());
		} finally {
			try {
				// 業務ロック解除
				if (!businessUnLock(lockCancelKey)) {
					writeLog(ERROR, "ZZ01004");
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

		/** 工程保管場所の在庫を管理する 0:工程保管場所の在庫を行なわない 1:工程保管場所の在庫をなう*/
		private String _processManageFlg = "0";
		/** 不良在庫を工程管理する 0:不良在庫の工程管理するを行なわない 1:不良在庫の工程管理するをなう*/
		private String _defectManageFlg = "0";
		private String lestQty[] = null;
		private String useQty[] = null;
		
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
		public medAD0080B001 m_med=null;

		/**
		 * コンテナクラスインスタンス
		 */
		public ManageContainer m_container=null;

		//////////////////////////////

		public interControl(medAD0080B001 med) throws BatchAppException
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
