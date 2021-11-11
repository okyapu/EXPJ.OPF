/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KV0040/src/com/nec/jp/orteus/metamorBase/KV0040/KV0040B001/CtrlMain.java,v $
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

package com.nec.jp.orteus.metamorBase.KV0040.KV0040B001;

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
import com.nec.jp.orteus.expj.util.*;
import com.nec.jp.orteus.expj.csv.*;
import com.nec.jp.orteus.expj.businesslock.*;
import com.nec.jp.orteus.expj.util.Numbering;
import com.nec.jp.orteus.metamorBase.KV0040.KV0040B001.medKV0040B001;
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessage;
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessageAccessor;
import com.nec.jp.orteus.metamorBase.util.AlarmMessage.AlarmMessage;
//}}user_implement_dev:import

/**
 * CLASS     : CtrlMain クラス
 * ファイル・クラス説明
 * @author $Author: shan-xiuqin $
 * @version $Revision: 1.8 $ $Date: 2016/05/23 08:25:58 $
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
	public medKV0040B001 m_med=null;

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
	public CtrlMain(medKV0040B001 med, BatchAppConductor cdr) throws BatchAppException
	{
		// メンバ変数を初期化します
		m_conductor = cdr;
		m_med = med;
		m_control = new interControl(med);

		return;
	}

	//{{user_implement_code
//	 エラーリスト
    List errCodeList = new ArrayList();
   
    // エラーノート
    Hashtable errNoteHash = new Hashtable();
   
	   /**
	* エラー/警告メッセージログ出力処理
	*
	* @param String メッセージコード
	* @param String 情報
	*/
	private void writeLogMessage(String msgCd,String if_no) throws Exception,BatchAppException{
		AlarmMessage am = new AlarmMessage(msgCd,if_no);
		CoreTools.write(am.getMessage());
	}
   /**
	* エラー/警告メッセージログ出力処理
	*
	* @param String メッセージコード
	*/
	private void writeLogMessage(String msgCd) throws Exception,BatchAppException{
		ExpjMessage am = new ExpjMessage(msgCd);
		CoreTools.write(am.getMessage(CoreTools.getLocale(m_med.getUSER_CD())));
	}
	
	  /** エラー工場コード */
    Hashtable errPlantCdHash = new Hashtable();
    
    /**
     * エラーノートセッター
     * @param note エラーノート
     */
    public void setErrNote(String note) {
     errNoteHash.put(Integer.toString(errCodeList.size() - 1), note);
    }
    
    
    
    /**
     * エラー工場コードセッター
     * @param code 工場コード
     */
    public void setErrPlantCd(String code) {
     errPlantCdHash.put(Integer.toString(errCodeList.size() - 1), code);
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
     */    
	 public boolean spExecute( 
          String logMode,String outputMode, String outputPath,String outputName,String userId, 
		  String businessName, String plantCd, String companyCd,String yearMonth) {
          ExpjMessage emsg = null;
		try {
				//set para
		      // ストアドプロシージャのパラメータをセットする
			m_med.setpvc2LogMode(logMode);
			m_med.setpvc2OutputMode(outputMode);
			m_med.setpvc2OutputPath(outputPath);
			m_med.setpvc2OutputName(outputName);
			m_med.setpvc2UserId(userId);
			m_med.setpvc2BusinessName(businessName);
			m_med.setpvc2PlantCd(plantCd);
			m_med.setpvc2CompanyCd(companyCd);
			m_med.setpnumYearMonth(yearMonth);

			emsg = new ExpjMessage("ZZ01006", "●●●…proc…●●●");
			m_med.getSyslog().info(emsg, "enter spexecute");

			m_med.getSyslog().info(emsg, m_med.getpvc2UserId());
			m_med.getSyslog().info(emsg, m_med.getpvc2BusinessName());
			m_med.getSyslog().info(emsg, m_med.getpvc2PlantCd());
			m_med.getSyslog().info(emsg, m_med.getpvc2CompanyCd());
			m_med.getSyslog().info(emsg, m_med.getpnumYearMonth());

			// call proc
			m_med.getcallSQL().call();
			return true;

		} catch (Exception e) {
			errCodeList.add("ZZ09016");// バッチパラメータの読み込みに失敗しました
			setErrNote("(SBM0580)ユーザコード：[ " + userId + " ] 工場コード：[ " + plantCd + " ]");
			setErrPlantCd(plantCd);
			return false;
		}
	}    
  
	/**
	 * string Format
	 */
	public String strFormat(String str){
		String fstr = str;
		if (fstr.equals("null99999")){
			fstr = "";
		}
		return fstr;
	}
	
    /**
     * 日付フォーマットチェック
     * 指定された日付の"YYYYMM"形式チェックを行う。
     * 条件が成立すると正常と判断する。
     * @param  String  strCheckDate "yyyymmdd"形式のみ
     * @return boolean true：正常、false：異常
     */
    private boolean DateFormatCheck(String strCheckDate)
    {
     // 入力日付のチェック
     // Calendar型の日付を用意
     Calendar calDate = Calendar.getInstance();
     // "yyyy/MM/dd"の日付フォーマットを生成
     DateFormat		df = new SimpleDateFormat("yyyyMM");
     df.setLenient(false);  // 日付解釈のあいまいさをなくす
     boolean		bRet = true;
   
     // 日付の妥当性チェック
     try {
      calDate.setTime( df.parse(strCheckDate) );
     } catch (ParseException e) {
      bRet = false;
     } catch (Exception e) {
      bRet = false;
     }
     return bRet;
    }
    // ロック失敗時ロックキー
    private static final int LOCK_FAILED = -1;
	//////////////////////////////
	// コードジェネレータは、以下のコードへの上書きを行いません

	/**
	 * CtrlMainクラスの標準コンストラクタ
	 *
		 */
	public CtrlMain(medKV0040B001 med) throws BatchAppException
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
		/*
		 *  // todo: ここにユーザ定義コードを記述してください
		 * 
		 */
	    ExpjMessage emsg = null;
		IDbConnection conn = null;       	// DBコネクション
       	IDbRecordset rdset = null;      	//DB結果
		BusinessLock Lock = null;     	// 業務ロック
		int lockCancelKey = 0;       	// ロック解除キー
		// metamorBase業務メッセージ
		BusinessMessageAccessor businessMsgAcc = null;
		BusinessMessage businessMsg = null;     // metamorBase業務メッセージ
		
		// ストアドプロシージャ名
		String functionName = null;  
		
		// ストアドプロシージャパラメータ
		String logMode = null;             	// ログモード
		String outputMode = null;          	// 出力モード
		String outputPath = null;          	// 出力パス
		String outputName = null;         	// 出力ファイル名
		String userId = null;         		// ユーザID
        String businessName = null;   		// 業務名（バッチ処理ID）
        String plantCd = null;        		// 工場コード	
        String companyCd=null;				// 会社コード
		String procTyp = null;              // 業務処理区分
		String yearMonth = null;            // 請求日
		String batchProcessingTyp = null;   // バッチ処理区分


	     // 固定値をセット
	    functionName = "SQLSALESTRNDELETE"; 
		businessName = "KV0040B001";					// 業務名（バッチ処理ID）の取得


	    emsg = new ExpjMessage("ZZ01006",  "●●●　debug log　●●●");
		m_med.getSyslog().info(emsg, userId);          
		String[] args = m_med.getArgs();//引数の取得
		// パラメータ確認
		int argsLength = args.length;   // 引数の個数を保持

		for(int i=0;i<argsLength;i++)
		{
			emsg = new ExpjMessage("ZZ01006",  "(SBM0896)●●●　sysBatParam["+i+"]取得　●●●");
			m_med.getSyslog().info(emsg, ""+args[i]);
		}
			
		try {
        
        // コネクションの取得
		conn = m_conductor.m_transactionConn;
		Hashtable plantHash = new Hashtable();
		
		// 引数の妥当性をチェックし、変数にセットする 
		if (argsLength !=5) {
	        errCodeList.add("AK00006");   
	        setErrPlantCd(plantCd);
	        Exception e = new Exception();
	        emsg = new ExpjMessage("AK00006", "(SBM0897)バッチ処理引数の形式が不正です");
	        m_med.getSyslog().severe(emsg, userId);
	        throw e;			
		}
		
		batchProcessingTyp=strFormat(args[0]);
		emsg = new ExpjMessage("ZZ01006",  "batchProcessingTyp=");
		m_med.getSyslog().info(emsg, ""+batchProcessingTyp);
		
		
		userId = args[1];
		emsg = new ExpjMessage("ZZ01006",  "userId=");
		m_med.getSyslog().info(emsg, ""+userId);
		
		plantCd = args[2];
		emsg = new ExpjMessage("ZZ01006",  "plantCd=");
		m_med.getSyslog().info(emsg, ""+plantCd);
		
		companyCd=args[3];
		emsg = new ExpjMessage("ZZ01006",  "companyCd=");
		m_med.getSyslog().info(emsg, ""+companyCd);
		
		yearMonth=strFormat(args[4]);
		emsg = new ExpjMessage("ZZ01006",  "yearMonth=");
		m_med.getSyslog().info(emsg, ""+yearMonth);
		
     
		// ユーザコードがNullの場合
		if (userId == null || "null".equals(userId)) {
	        errCodeList.add("ZZ09003");   
	        setErrPlantCd(plantCd);
	        Exception e = new Exception();
	        emsg = new ExpjMessage("ZZ09003", "(SBM0898)ユーザコードのパラメータが未入力です");
	        m_med.getSyslog().severe(emsg, userId);
	        throw e;			
		}		
		
		// ユーザコードが [ユーザマスタ] に存在しない場合
		m_med.setUSER_CD(userId);

		AbstractBatchAppEntity selectUserCd = m_med.getselectUSER_MST();
		try {
			selectUserCd.read();
		} catch (Exception e) {
			errCodeList.add("ZZ01106");// サーバでエラーが発生しました。
			setErrNote("(SBM0619)ユーザコード：[ " + userId + " ]");
			setErrPlantCd(plantCd);
			emsg = new ExpjMessage("ZZ01006", 
					"(SBM0927)ユーザコードの読込みに失敗しました。");
			m_med.getSyslog().severe(emsg, userId);
			throw e;
		}

		if (!selectUserCd.next()) {
			Exception e = new Exception();
			emsg = new ExpjMessage("ZZ09026", "(SBM1250)ユーザコードがユーザマスタに存在しません");
			m_med.getSyslog().severe(emsg, userId);
			throw e;
		}
		
		// 会社コードがNullの場合
		if ( companyCd == null || "null".equals(userId)) {
	        errCodeList.add("BZ20001");   
	        setErrPlantCd(plantCd);
	        Exception e = new Exception();
	        emsg = new ExpjMessage("BZ20001", "(SBM1251)会社コードのパラメータが未入力です");
	        m_med.getSyslog().severe(emsg, userId);
	        throw e;			
		}	
			

        // 削除起算年月日日付フォーマットチェック
        if (!DateFormatCheck(yearMonth)) {
				// パラメータが未入力または不正です。
				errCodeList.add("AK00022");
				setErrPlantCd(plantCd);
				Exception e = new Exception();
				emsg = new ExpjMessage("AK00022", "(SBM1252)削除処理対象月の形式が不正です。");
				m_med.getSyslog().severe(emsg, userId);
				throw e;
		}
	
	 	// 業務メッセージの準備（引数が渡ってくる前用）
      
        businessMsgAcc = new BusinessMessageAccessor();
		businessMsg = new BusinessMessage();
		businessMsgAcc.init(conn);
		businessMsg.setBusinessOperatingName(businessName);
		businessMsg.setUser(userId);
		businessMsg.setPlantCode(plantCd);

		//business msg
		Numbering  numbering = new Numbering(conn, Numbering.LOG_CD, 
		        userId, businessName, plantCd);

	    emsg = new ExpjMessage("ZZ01006",  "●●●　LogCode=　●●●"+numbering.getNo());
		m_med.getSyslog().info(emsg, userId);   
		
		// バッチパラメータtableから、ストアド共通パラメータを読み込む
		m_med.setPROGRAM_CD(businessName);
		m_med.setFUNCTION_NAME(functionName);
		
		//logmode,outputMode,filepath,filename
		selectSYS_BAT_PARM sysBatParm = (selectSYS_BAT_PARM)m_med.getselectSYS_BAT_PARM();
		emsg = new ExpjMessage("ZZ01006",  "●●●〉readSysBatParm sysBatParm　●●●");
		m_med.getSyslog().info(emsg, "enter spexecute");	
		
		if(sysBatParm.read() != SUCCESS){
			errCodeList.add("AK00007"); // バッチパラメータの読み込みに失敗しました
			setErrNote("(SBM0580)ユーザコード：[ " + userId + " ] 工場コード：[ " + plantCd + " ]");
			setErrPlantCd(plantCd);
			emsg = new ExpjMessage("AK00007", "(SBM0925)バッチパラメータの読み込みに失敗しました");
			m_med.getSyslog().severe(emsg, userId);
			throw new Exception();
		}	
		rdset = sysBatParm.getRecordset(false);
	
		if (rdset.next()){

			outputPath = rdset.getString(1);
			outputName = rdset.getString(2);
			logMode = rdset.getString(3);
			outputMode = rdset.getString(4);
			emsg = new ExpjMessage("ZZ01006",  "outputPath=");
			m_med.getSyslog().info(emsg, ""+outputPath);
			emsg = new ExpjMessage("ZZ01006",  "outputName=");
			m_med.getSyslog().info(emsg, ""+outputName);
			emsg = new ExpjMessage("ZZ01006",  "logMode=");
			m_med.getSyslog().info(emsg, ""+logMode);
			emsg = new ExpjMessage("ZZ01006",  "outputMode=");
			m_med.getSyslog().info(emsg, ""+outputMode);

		} else {
		
			errCodeList.add("AK00007"); // バッチパラメータデータが存在しません
			setErrNote("(SBM0580)ユーザコード：[ " + userId + " ] 工場コード：[ " + plantCd + " ]");
			setErrPlantCd(plantCd);
			Exception e = new Exception();
			emsg = new ExpjMessage("AK00008"," (SBM0576)バッチパラメータデータが存在しません");
			m_med.getSyslog().severe(emsg, userId);
			throw e;
		}
		//=======================================
		// 業務ロック
		//=======================================
		// 業務ロックをかける
		emsg = new ExpjMessage("ZZ01006", "(SBM0842)◎◎◎　業務ロック開始　◎◎◎");
		m_med.getSyslog().info(emsg, userId);
		
		Lock = new BusinessLock(conn, userId, plantCd);
		lockCancelKey = Lock.doLock(businessName);  // 解除キーの取得
		conn.commit();
		
		// lockCancelKey==-1の場合も業務ロックされているのエラー
		if(lockCancelKey == -1){
			emsg = new ExpjMessage("ZZ01008", "(SBM0596)業務ロックの開始に失敗しました");
			m_med.getSyslog().severe(emsg, userId);
			throw new Exception();
		}
	  	// SP実行
		// バッチ処理開始処理を行う
		errCodeList.add("ZZ09001"); // 
		setErrNote("USER_CD：[ " + userId  + " ] PLANT_CD：[ " + plantCd + " ]");
		setErrPlantCd(plantCd);
		emsg = new ExpjMessage("ZZ09001", "(SBM0992)バッチ処理を開始しました");
		m_med.getSyslog().severe(emsg, userId);
	
		emsg = new ExpjMessage("ZZ01006", "(SBM0892)◎◎◎ SP実行　◎◎◎");
		m_med.getSyslog().info(emsg, logMode+"---"+ outputMode+"---"+ outputPath+"---"+ outputName+"---"+ 
	            		userId+"---"+ businessName+"---"+ plantCd+"---"+ 
	            		companyCd+"---"+yearMonth+"---");	
		
	     if (!spExecute(logMode, outputMode, outputPath, outputName, 
	            		userId, businessName, plantCd, companyCd,yearMonth)) {
 		
				//結果がfalseの場合もロック解除失敗のエラー

			if (!Lock.doUnLock(businessName, lockCancelKey)) {
					throw new Exception();
				}
				emsg = new ExpjMessage("ZZ01006",  "●●● SPStatus　●●●"+"["+getExecuteStatus()+"]");
				m_med.getSyslog().info(emsg, userId);   
				throw new Exception();    
	  	}
	
			// バッチ処理が終了した場合
			errCodeList.add("ZZ09002"); // バッチパラメータの読み込みに失敗しました
			setErrNote("USER_CD：[ " + userId + " ] PLANT_CD：[ " + plantCd
					+ " ]");
			setErrPlantCd(plantCd);
			emsg = new ExpjMessage("ZZ09002", "(SBM1005)バッチ処理を終了しました");
			m_med.getSyslog().severe(emsg, userId);
			
	        }catch (Exception e) {
	        this.setExecuteStatus(1);
	        emsg = new ExpjMessage("ZZ01006", "(SBM1255)その他　Exception ："+"["+e.getMessage()+"]");
			m_med.getSyslog().severe(emsg, userId);
	        e.printStackTrace();	
			try {
				conn.rollback();
			} catch(Exception fe) {
			  	fe.printStackTrace();
			  	if (errCodeList == null || errCodeList.size() == 0) {
					errCodeList.add("ZZ01006");//その他　Ｅｒｒｏｒ
					setErrNote("(SBM0580)ユーザコード：[ " + userId 
					 + " ] 工場コード：[ " + plantCd + " ]");
					setErrPlantCd(plantCd);
					emsg = new ExpjMessage("ZZ01006", "(SBM1363)その他　Ｅｒｒｏｒ");
					m_med.getSyslog().severe(emsg, userId);
				}
			}
		} finally {
			if (rdset != null ) {
			    try {
			        rdset.close();	   //DB結果解放
					emsg = new ExpjMessage("ZZ01006",  "(SBM1257)●●●　DB結果解放　●●● ");
					m_med.getSyslog().severe(emsg, userId);
			    } catch (Exception e ) {
			         e.printStackTrace();
			    }
			    rdset = null;
			}

			for (int i = 0; i < errCodeList.size(); i++) {
				String errCode = (String)errCodeList.get(i);
				String errNote = (String)errNoteHash.get(Integer.toString(i));
				String errPlantCd = (String)errPlantCdHash.get(Integer.toString(i));
				// 業務メッセージの登録
				if (businessMsg != null) {
					try {
						 Numbering numbering_err = new Numbering(conn, Numbering.LOG_CD, 
						 userId, businessName, plantCd);
						 businessMsg.setLogCode(numbering_err.getNo());
						 businessMsg.setMessageCode(errCode);
						 businessMsg.setData(errNote);
						 businessMsgAcc.add(businessMsg);
						 emsg = new ExpjMessage("ZZ01006", 
						   "(SBM0836)●●●　業務メッセージの登録　●●● <" + (i + 1) 
						   + "/" + errCodeList.size() + ">");
						 m_med.getSyslog().severe(emsg, userId);
						 emsg = new ExpjMessage("ZZ01006", 
						   "　　●No:" + businessMsg.getLogCode() + " errCode:" + errCode 
						   + " errNote:" + errNote + " businessMsg:" + businessMsg);
						 m_med.getSyslog().severe(emsg, userId);
					
					} catch (Exception ex) {
					 ex.printStackTrace();
					}
				}	
			}
			
		      try {
				 //業務ロック解除

				if(!Lock.doUnLock(businessName, lockCancelKey)) {
					throw new Exception();
				}
				emsg = new ExpjMessage("ZZ01006", "(SBM0658)業務ロック解除");
				m_med.getSyslog().severe(emsg, userId);
				conn.commit();
				
			} catch (Exception e) {
				e.printStackTrace();
				emsg = new ExpjMessage("ZZ01006", "(SBM0846)業務ロックの解除に失敗しました。"+e.getMessage());
				m_med.getSyslog().severe(emsg, userId);
				
				try {
					// 業務メッセージの登録（業務ロック解除失敗時）
					Numbering numbering_l = new Numbering(conn, Numbering.LOG_CD, 
					userId, businessName, plantCd);
					businessMsg.setLogCode(numbering_l.getNo());
					businessMsg.setMessageCode("ZZ01004");
					businessMsg.setData("(SBM0658)業務ロック解除");
					businessMsgAcc.add(businessMsg);
					emsg = new ExpjMessage("ZZ01006", "(SBM1345)●●●　業務メッセージの登録　●●●");
					m_med.getSyslog().severe(emsg, userId);
					emsg = new ExpjMessage("ZZ01006", "　　●No:" + businessMsg.getLogCode() 
					  + " errCode:ZZ01004"  + " businessMsg:" + businessMsg);
					m_med.getSyslog().severe(emsg, userId);
				
				} catch (SQLException ex) {
					ex.printStackTrace();
				
				} catch (Exception ex) {
					ex.printStackTrace();
					
				}
			}
		    if (this.getExecuteStatus()!=0){
		    	emsg = new ExpjMessage("ZZ01006",  "(SBM1258)●●● バッチ処理　失敗しまた　●●●");
				m_med.getSyslog().info(emsg, userId);   			
				throw new BatchAppException("CtrlMain", "CtrlMain", "(SBM1258)バッチ処理　失敗しまた");
		    }
	  	}
	  	try{
	  		this.writeLogMessage("ZZ09002");  
	  	}catch(Exception e){
	  		e.printStackTrace();
	  	}

		return BREAK;
	}

	// ////////////////////////////

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
		public medKV0040B001 m_med=null;

		/**
		 * コンテナクラスインスタンス
		 */
		public ManageContainer m_container=null;

		//////////////////////////////

		public interControl(medKV0040B001 med) throws BatchAppException
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
