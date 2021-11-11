/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KP0050/src/com/nec/jp/orteus/metamorBase/KP0050/KP0050B001/CtrlMain.java,v $
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

package com.nec.jp.orteus.metamorBase.KP0050.KP0050B001;

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
//-----------------------------------------------------------------------------
import java.util.Date;
import com.nec.jp.orteus.msg.util.*;
import com.nec.jp.orteus.msg.core.*;
import com.nec.jp.orteus.metamorBase.util.AlarmMessage.AlarmMessage;
import com.nec.jp.orteus.metamorBase.util.BusinessLock.BusinessLock;
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessage;
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessageAccessor;
import com.nec.jp.orteus.metamorBase.util.SystemLog.SystemLog;
import com.nec.jp.orteus.metamorBase.util.common.SystemConfig;
import com.nec.jp.orteus.metamorBase.common.util.Converter;
import com.nec.jp.orteus.metamorBase.common.CollectNumber.CollectNumber;
import com.nec.jp.orteus.expj.util.*;
//-----------------------------------------------------------------------------
//}}user_implement_dev:import

/**
 * CLASS     : CtrlMain クラス
 * ファイル・クラス説明
 * @author $Author: geng-jia $
 * @version $Revision: 1.15 $ $Date: 2015/12/03 08:53:58 $
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
	public medKP0050B001 m_med=null;

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
	public CtrlMain(medKP0050B001 med, BatchAppConductor cdr) throws BatchAppException
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

	/** 起動引数 */
	private String strBusinessName = null;
	private String strUserId = null;
	private String strPlantCd = null;
	private String strMsgPlantCd = null;
	private String strPlanTyp = null;

	/** DBコネクション */
	private IDbConnection conn = null;
	private String m_vMSG = "";				//ログファイル用メッセージ

	// バッチクラス共通エラー処理用
	private String errCode = null;		     // バッチエラーコード
	private String errMsg = null;		     // バッチエラーメッセージ
	private String errNote = "";             // バッチエラーメッセージ(備考) 必要に応じて使用。

	// 工場コードとそれに対するロック解除キーの配列を保持するリスト
	private ArrayList plantList = new ArrayList();

	/** 業務ロッククラス */
	private BusinessLock lock = null;
	
	/** ロック失敗時ロックキー */
	private static final int LOCK_FAILD = -1;	
	
	/**
	* ローグファイルのメッセージの取得
	*
	* @param String strMsgCd		キー:SYSコントロールコード
	*
	*/
	private boolean getSysMsg(String strMsgCd) throws BatchAppException{
		boolean rv = true;
		try{
			//キー設定       
			m_med.setsysBusinessIN_MEG_CD(strMsgCd);
			if(m_med.getreadSysBusinessMessage().read() != SUCCESS){
				rv = false;
			}else{
				if(m_med.getreadSysBusinessMessage().next()){
					this.m_vMSG = m_med.getsysBusinessMEG();
				}else{
					throw new Exception();
				}
			}
		}catch (Exception e) {
			rv=false;
		}finally{
			return rv;
		}
	}

	/**
	* エラー/警告メッセージログ出力処理(埋め込みなし)
	*
	* @param String メッセージコード
	*/
	private void writeLogMessage(String msgCd) throws Exception,BatchAppException{
		ExpjMessage am = new ExpjMessage(msgCd);
		CoreTools.write(am.getMessage(CoreTools.getLocale(strUserId)));
	}

	/**
	* エラー/警告メッセージログ出力処理(IF情報管理番号埋め込み)
	*
	* @param String メッセージコード
	* @param String IF情報管理番号
	*/
	private void writeLogMessage(String msgCd,String if_no) throws Exception,BatchAppException{
		ExpjMessage am = new ExpjMessage(msgCd,if_no);
		CoreTools.write(am.getMessage(CoreTools.getLocale(strUserId)));
	}

	/**
	* エラー/警告メッセージログ出力補助情報(埋め込み)
	*
	* @param String 補助情報名
	* @param String 補助情報値
	*/
	private void writeLogMessageInfo(String name,String value) throws Exception,BatchAppException{
		AlarmMessage am = new AlarmMessage("AA99991","    " + name,value);
		CoreTools.write(am.getMessage());
	}

	/**
	* 業務ロックを行います
	* @param strBusinessName 業務名
	* @param strUserId ユーザコード
	* @param strMsgPlantCd 工場コード
	* @return ロックキャンセルキー
	* @throws FoundationException
	*/
	private int businessLock(String strBusinessName,String strUserId,String strMsgPlantCd) throws FoundationException {
		lock = new BusinessLock(conn, strUserId, strMsgPlantCd);
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
	* metamorBase業務メッセージの出力を行う。
	* metamorBase業務メッセージの出力には、業務名、ユーザコード、工場コードを必要とする
	*
	* @param conn DBコネクション
	* @param businessName 業務名
	* @param userId ユーザコード
	* @param plantCd 工場コード
	* @return なし
	*/
	protected void outBusinessMessage(IDbConnection conn, String businessName, String userId, String plantCd) {
		// 特定の業務エラーコードがセットされていない場合
		if (errCode == null) {
			errCode = "ZZ09009";  // バッチ処理を開始できませんでした。
		}

		// 業務メッセージの準備
		BusinessMessageAccessor businessMsgAcc = new BusinessMessageAccessor();
		BusinessMessage businessMsg = new BusinessMessage();
		businessMsgAcc.init(conn);
		businessMsg.setBusinessOperatingName(businessName);
		businessMsg.setUser(userId);
		businessMsg.setPlantCode(plantCd);
		businessMsg.setMessageCode(errCode);
		businessMsg.setData(errNote);
		try {
			Numbering logCd = new Numbering(conn,Numbering.LOG_CD,userId,businessName,plantCd);
			businessMsg.setLogCode(logCd.getNo());
			businessMsgAcc.add(businessMsg);
			// 業務メッセージは、業務プログラム側でコネクションをコミットする
			// 必要がある。販売所要計画Ｉ／Ｆは、業務プログラムでトランザクションを
			// 意識する必要がないため、メイン処理と同じコネクションに対し都度コミット
			// する。
			conn.commit();
		} catch (SQLException e) {
			errCode = "AC00999"; // SQL実行時エラー。
			setBatchErrorMessage(e);
			e.printStackTrace();
		} catch (Exception e) {
			errCode = "KP05002";  // その他　Ｅｒｒｏｒ
			setBatchErrorMessage(e);
			e.printStackTrace();
		}
	}

	/**
	* バッチクラス共通エラー処理のエラーメッセージをメンバ変数にセットする。
	* バッチクラス共通エラー処理は、仕様上、引数にエラーコードではなくエラーメッセージ文字列を必要とする。
	* よって、業務プログラム側でエラーコードからメッセージを作成する必要がある。
	*
	* @param e Exceptionオブジェクト
	* @return なし
	*/
	protected void setBatchErrorMessage(Exception e) {
		// 特定のバッチエラーコードがセットされていない場合
		if (errCode == null) {
			errCode = "KP05002";  // その他　Ｅｒｒｏｒ
		}

		// バッチエラーメッセージの作成
		if (errMsg == null) {
			//AlarmMessage msg = new AlarmMessage(errCode);
			//errMsg = "[" + errCode + "]" + msg.getMessage();
		}
		// Exceptionオブジェクトにメッセージがある場合、付加する。
		if (e.getMessage() != null) {
			errMsg = errMsg + " " + e.getMessage();
		}
	}

	protected String getBatchErrorMessage() {
		return errMsg;
	}
		
	/**
	* 共通部品WorkCalendarを用いて稼働日ベースで日数計算を行う。
	* 計算にはユーザコード、業務コード、工場コード、対象日付、加算日、前倒しフラグが必要とする。
	*
	* @param Plant_Cd 工場コード
	* @param date     対象日付
	* @param margin   加算日
	* @param Item_Cd  品目番号
	* @return 計算結果
	*/
		private Date calcdate(String Plant_Cd,  String Item_Cd, Date date, int margin)throws Exception{
			try{
				WorkCalendar wkd = new WorkCalendar(
												conn,
												strUserId,				//ユーザコード
												strBusinessName,			//業務コード
												Plant_Cd,					//工場コード
												Item_Cd,				//品目番号
												date,					//対象日付
												margin,		//加算日
												true					//前倒しフラグ
												);
				return wkd.calcDate();
			}catch(Exception e){
				throw new Exception();
			}
		}
	/**
	* 共通部品WorkCalendarを用いて稼働日判定を行う。
	* 計算にはユーザコード、業務コード、工場コード、対象日付が必要とする。
	*
	* @param Plant_Cd 工場コード
	* @param date     対象日付
	* @param Item_Cd  品目番号
	* @return 計算結果
	*/
		private boolean isworkdate(String Plant_Cd,  String Item_Cd, Date date) throws Exception{
			try{
				WorkCalendar wc = new WorkCalendar(
												conn,
												strUserId,				//ユーザコード
												strBusinessName,			//業務コード
												Plant_Cd,					//工場コード
												Item_Cd,					//品目番号
												date					//対象日付
												);
				return wc.isWorkDate();
			}catch(Exception e){
				throw new Exception();
			}
		}
		
	/**
	 * CtrlMainクラスの標準コンストラクタ
	 *
		 */
	public CtrlMain(medKP0050B001 med) throws BatchAppException
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
		
		// 販売所要残集計バッチと内示受注I/Fバッチの運行フラグ
		boolean BatchRunFlag = true;
		
		try{
			// 引数受け取り
			String args[] = m_med.getArgs();
			if (args.length < 5 || args.length > 6) {
				throw new Exception();
			}
			
			strUserId = args[1];		// ユーザID
			strMsgPlantCd = args[2];	// ユーザ所属工場
			strBusinessName = args[3];	// 業務ID
			strPlanTyp = args[4];		// 販売所要登録フラグ
			if (args.length == 5) {
				strPlantCd = "%";		// 工場コード
			} else {
				strPlantCd = args[5];	// 工場コード
			}
			
			//パラメータ確認
			/*System.out.println(">>>PRG_NAM:" + strBusinessName);	// 業務名
			System.out.println(">>>USER_ID:" + strUserId);	// ユーザＩＤ
			System.out.println(">>>USER_PLNT_CD:" + strMsgPlantCd);	// ユーザ工場コード
			System.out.println(">>>PLANT_CD:" + strPlantCd);	// 工場コード*/
			
			conn = m_conductor.m_transactionConn;
			
			//販売所要計画I/Fバッチの開始メッセージ登録
			//コネクションを渡して、業務メッセージ準備
			String strMsgCd = "KP05001";
			if(this.getSysMsg(strMsgCd)){
				writeLogMessage(strMsgCd);
			}else{
				throw new Exception();
			}
			errCode = "KP05001";
			errNote = "(SBM0593)<< 販売所要計画Ｉ／Ｆバッチ処理開始 >>";
			outBusinessMessage(conn, strBusinessName, strUserId, strMsgPlantCd);
			CoreTools.write("\n(SBM1088)******>>>> 販売所要計画Ｉ／Ｆスタート <<<******");
			
			//=======================================
			// 対象工場コード取得
			//=======================================
			m_med.setinPLANT_CD(strPlantCd);
			if(m_med.getreadM_PLANT().read() != SUCCESS){
				errCode = "KP05002";
				errNote = "(SBM0594)<< 致命的なエラー >>";
				outBusinessMessage(conn, strBusinessName, strUserId, strMsgPlantCd);
				this.writeLogMessage(errCode);
				throw new Exception();
			}
			if(m_med.getreadM_PLANT().next() == false){
				//対象工場コード取得失敗
				errCode = "KV03001";
				errNote = "(SBM0595)<< 指定した工場コードは未登録です >>";
				outBusinessMessage(conn, strBusinessName, strUserId, strMsgPlantCd);
				this.writeLogMessage(errCode);
				throw new Exception();
			}
			
			// 出荷Ｌ／Ｔの設定
			String ShipLT = null;
			if(m_med.getreadSYS_CLASS_CODE().read() != SUCCESS){
				errCode = "KP05002";
				errNote = "(SBM0594)<< 致命的なエラー >>";
				outBusinessMessage(conn, strBusinessName, strUserId, strMsgPlantCd);
				this.writeLogMessage(errCode);
				throw new Exception();
			}else{
				m_med.getreadSYS_CLASS_CODE().next();
				ShipLT = m_med.getCLASS_CD();
			}
			
			plantList.clear();
			do {
				// 工場コードとロックを格納する配列を用意
				Object plantData[] = new Object[3];
				plantData[0] = m_med.getPLANT_CD(); // 工場コードをセット
				plantData[1] = null;                // ロックオブジェクト格納用
				plantData[2] = null;                // ロック解除キー格納用

				// リストに配列を保持
				plantList.add(plantData);
			} while (m_med.getreadM_PLANT().next() == true);
			
			for (Iterator it = plantList.iterator(); it.hasNext(); ) {
				// ロック解除キー
				int lockCancelKey = LOCK_FAILD;
				try{
					// 各工場コードの取得
					Object plantData[] = (Object[]) it.next();
					String plantCd = plantData[0].toString();
					m_med.setPLANT_CD(plantCd);
					
					//=======================================
					// 業務ロック
					//=======================================
					lockCancelKey = businessLock(strBusinessName,strUserId,
							plantCd);
					if (lockCancelKey == LOCK_FAILD) {
						//this.writeLogMessage("ZZ01008");
						// コネクションを渡して、業務メッセージ準備
						errCode = "ZZ01008";
						errNote = "(SBM0596)<< 業務ロックの開始に失敗しました。 >>";
						outBusinessMessage(conn, strBusinessName, strUserId, 
								strMsgPlantCd);
						CoreTools.write("(SBM0596)業務ロックの開始に失敗しました。");	
						return BREAK;
					}
					
					if(BatchRunFlag == true){
						//<< 販売所要残集計バッチ処理開始 >>その後<< 内示・受注Ｉ／Ｆバッチ処理開始 >>
						//=======================================
						//<< 販売所要残集計バッチ処理開始 >>
						//=======================================
						
						//---------------共通---------------
						ResourceBundle bundle = SystemConfig.getBundle();
						String javaPath = SystemConfig.getProperty("JAVA_PATH", bundle);
						if(javaPath == null){
							//システム既定値ファイルからの情報取得に失敗しました(ＪＶＭパス)
							errCode = "ZZ09010";
							errNote = "(SBM0594)<< 致命的なエラー >>";
							outBusinessMessage(conn, strBusinessName, strUserId, strMsgPlantCd);
							this.writeLogMessage(errCode);
							throw new Exception();
						}
						String ClassPath = SystemConfig.getProperty("CLASS_PATH", bundle);
						if(ClassPath == null){
							//システム既定値ファイルからの情報取得に失敗しました(クラスパス)
							errCode = "ZZ09012";
							errNote = "(SBM0594)<< 致命的なエラー >>";
							outBusinessMessage(conn, strBusinessName, strUserId, strMsgPlantCd);
							this.writeLogMessage(errCode);
							throw new Exception();
						}
						String batchPath = SystemConfig.getProperty("BATCH_PATH", bundle);
						if(batchPath == null){
							//"システム既定値ファイルからの情報取得に失敗しました(バッチ起動設定)"
							errCode = "ZZ09011";
							errNote = "(SBM0594)<< 致命的なエラー >>";
							outBusinessMessage(conn, strBusinessName, strUserId, strMsgPlantCd);
							this.writeLogMessage(errCode);
							throw new Exception();
						}
							
						// 固定値をセット
						String batchProcessingTyp = "2";		  // 画面より起動：2／自動運転：1
						String ProgID = "KP0040B003";		  // 呼出先の業務ID
						String userID = strUserId; // ログインユーザID
					
						//---------------共通---------------
						
						// 全ての定義情報が取得できていれば、処理を実行する。
						if ((javaPath != null) && (ClassPath != null) && (batchPath != null)) {
//							String cmd1 = "";
//							cmd1 = cmd1 + javaPath;    // ＪＶＭ
//							cmd1 = cmd1 + " -cp ";
//							cmd1 = cmd1 + ClassPath;   // Java ClassPath
//							cmd1 = cmd1 + " -Dcom.nec.jp.orteus.util.logging.config.file=";
//							cmd1 = cmd1 + batchPath;   // D:/OrteusStudio/lib/logging.properties"; // 起動設定
//							cmd1 = cmd1 + " " + "com.nec.jp.orteus.metamorBase.KP0040.KP0040B003.mainKP0040B003"; // 呼び出し先クラス
//							cmd1 = cmd1 + " " + ProgID;      // 業務ID
//							cmd1 = cmd1 + " " + userID;     // ユーザID
//							cmd1 = cmd1 + " " + strMsgPlantCd;// メッセージ登録工場
							
							List buffer1 = new ArrayList();
							buffer1.add(javaPath);    // ＪＶＭ
							buffer1.add("-cp");
							buffer1.add(ClassPath);   // Java ClassPath
							buffer1.add("-Dcom.nec.jp.orteus.util.logging.config.file=" + batchPath); // D:/OrteusStudio/lib/logging.properties"; // 起動設定
							buffer1.add("com.nec.jp.orteus.metamorBase.KP0040.KP0040B003.mainKP0040B003"); // 呼び出し先クラス
							buffer1.add(ProgID);      // 業務ID
							buffer1.add(userID);     // ユーザID
							buffer1.add(strMsgPlantCd);// メッセージ登録工場
							
							//System.out.println(cmd1);
							Runtime runtime1 = Runtime.getRuntime();
//							Process q = runtime1.exec(cmd1);
							Process q = runtime1.exec((String[])buffer1.toArray(new String[buffer1.size()]));
							
							int rt = q.waitFor();
							
							if(q.exitValue() != 0) {
								errCode = "KP04302";
								errNote = "";
								outBusinessMessage(conn, strBusinessName, strUserId, strMsgPlantCd);
								this.writeLogMessage(errCode);
								throw new Exception();
							}
						
							//-----------------------------------------------------------------
							//=======================================
							//<< 内示・受注Ｉ／Ｆバッチ処理開始 >>
							//=======================================
								
							// 固定値をセット
							batchProcessingTyp = "2";		  // 画面より起動：2／自動運転：1
							ProgID = "KP0060B001";		  // 呼出先の業務ID
							userID = strUserId; // ログインユーザID
						
							// 全ての定義情報が取得できていれば、処理を実行する。
							List buffer2 = new ArrayList();
							buffer2.add(javaPath);    // ＪＶＭ
							buffer2.add("-cp");
							buffer2.add(ClassPath);   // Java ClassPath
							buffer2.add("-Dcom.nec.jp.orteus.util.logging.config.file=" + batchPath); // D:/OrteusStudio/lib/logging.properties"; // 起動設定
							buffer2.add("com.nec.jp.orteus.metamorBase.KP0060.KP0060B001.mainKP0060B001"); // 呼び出し先クラス
							buffer2.add(batchProcessingTyp);
							buffer2.add(userID);     // ユーザID
							buffer2.add(strMsgPlantCd);// ユーザ所属工場
							buffer2.add(ProgID);      // 業務ID
							buffer2.add(strPlantCd);      // 工場コード
							
							//System.out.println(cmd2);
							Runtime runtime2 = Runtime.getRuntime();
//							Process r = runtime2.exec(cmd2);
							Process r = runtime2.exec((String[])buffer2.toArray(new String[buffer2.size()]));
							
							rt = r.waitFor();
							
							if(r.exitValue() != 0) {
								errCode = "KP06002";
								errNote = "";
								outBusinessMessage(conn, strBusinessName, strUserId, strMsgPlantCd);
								this.writeLogMessage(errCode);
								throw new Exception();
							}
						}
						BatchRunFlag = false;
					}
					//-----------------------------------------------------------------
					
					m_med.setSysdate(Converter.dateToStr(new Date(),"yyyy/MM/dd HH:mm:ss"));
					m_med.setUsername(strUserId);
					
					//=======================================
					// 自社情報コード
					//=======================================
					if(m_med.getreadSYS_MY_COMPANY().read() != SUCCESS){
						errCode = "KP05002";
						errNote = "(SBM0594)<< 致命的なエラー >>";
						outBusinessMessage(conn, strBusinessName, strUserId, strMsgPlantCd);
						this.writeLogMessage(errCode);
						throw new Exception();
					}
					if(m_med.getreadSYS_MY_COMPANY().next() == false){
						//自社情報コード取得失敗
						errCode = "KQ00039";
						errNote = "(SBM0597)<< 自社情報の取得に失敗しました >>";
						outBusinessMessage(conn, strBusinessName, strUserId, strMsgPlantCd);
						this.writeLogMessage(errCode);
						throw new Exception();
					}
					// 自社情報
					CoreTools.write("BATCH COMPANY_CD=" + m_med.getCOMPANY_CD());
					//System.out.println("自社情報:"+m_med.getCOMPANY_CD());
					
					// 工場情報
					CoreTools.write("BATCH PLANT_CD=" + plantCd);
					
		
					//=======================================
					// [所要量]から対象のレコードを削除する
					//=======================================
					if(m_med.getdeleteT_OD().delete() != SUCCESS){
						errCode = "KP05002";
						errNote = "(SBM0594)<< 致命的なエラー >>";
						outBusinessMessage(conn, strBusinessName, strUserId, strMsgPlantCd);
						this.writeLogMessage(errCode);
						throw new Exception();
					}
					
					//=======================================
					// [販売所要計画]の対象レコードを抽出する
					//=======================================
					if(m_med.getreadT_SALES_PLAN().read() != SUCCESS){
						errCode = "KP05002";
						errNote = "(SBM0594)<< 致命的なエラー >>";
						outBusinessMessage(conn, strBusinessName, strUserId, strMsgPlantCd);
						this.writeLogMessage(errCode);
						throw new Exception();
					}
					
					//=======================================
					// [システムパラメータ]の取込月数
					//=======================================
					String KP_ADD_MONTH =null;
					String KP_SUB_MONTH =null;
					if(m_med.getreadKP_ADD_MONTH().read() != SUCCESS){
						errCode = "KP05002";
						errNote = "(SBM0594)<< 致命的なエラー >>";
						outBusinessMessage(conn, strBusinessName, strUserId, strMsgPlantCd);
						this.writeLogMessage(errCode);
						throw new Exception();
					}else{
						m_med.getreadKP_ADD_MONTH().next();
						KP_ADD_MONTH = m_med.getKP_ADD_MONTH();
					}
					if( m_med.getreadKP_SUB_MONTH().read()!= SUCCESS){
						errCode = "KP05002";
						errNote = "(SBM0594)<< 致命的なエラー >>";
						outBusinessMessage(conn, strBusinessName, strUserId, strMsgPlantCd);
						this.writeLogMessage(errCode);
						throw new Exception();
					}else{
						m_med.getreadKP_SUB_MONTH().next();
						KP_SUB_MONTH = m_med.getKP_SUB_MONTH();
					}
					//System.out.println("未来取込月数: "+KP_ADD_MONTH+" "+"過去取込月数: "+KP_SUB_MONTH);
					
					//=======================================
					// 取込開始日、取込終了日の算出
					//=======================================
					
					Calendar cal = Calendar.getInstance();
					Date tempDate = new Date();
					String KP_STR_DATE = DateTool.subtractMonth(m_med.getBUSINESS_OPR_DATE(),KP_SUB_MONTH);
					cal.setTime(Converter.strToDate(KP_STR_DATE ,"yyyy/MM/dd"));
					cal.set(cal.DAY_OF_MONTH, 1);
					KP_STR_DATE = Converter.dateToStr(cal.getTime() ,"yyyy/MM/dd");
					
					String KP_END_DATE = DateTool.addMonth(m_med.getBUSINESS_OPR_DATE(),KP_ADD_MONTH);
					cal.setTime(Converter.strToDate(KP_END_DATE ,"yyyy/MM/dd"));
					cal.set(cal.DAY_OF_MONTH, cal.getActualMaximum(cal.DAY_OF_MONTH));
					KP_END_DATE = Converter.dateToStr(cal.getTime() ,"yyyy/MM/dd");
					
					while (m_med.getreadT_SALES_PLAN().next() == true) {
					/*System.out.println("計画開始日:"+m_med.getPLN_STR_DATE());
					System.out.println("計画終了日:"+m_med.getPLN_END_DATE());
					System.out.println("計画残数量:"+m_med.getPLN_QTY_REMAIN());*/
						
						//計画数残量が0で無いときのみ以下の処理を行う。
						if(m_med.getPLN_QTY_REMAIN().doubleValue() >= 0){
								
							//取込期間に属するかチェック
							if ((DateTool.compareYMD(m_med.getPLN_STR_DATE(), KP_STR_DATE)) >= 0 
								&& (DateTool.compareYMD(m_med.getPLN_STR_DATE(), KP_END_DATE)) <= 0){
								
								//=======================================
								// 要求納期、デマンド数の設定
								//=======================================
								boolean rez_typ = false;
								if((strPlanTyp).equals("1")){
									tempDate = this.calcdate(m_med.getPLANT_CD(),m_med.getITEM_CD(),
															Converter.strToDate(m_med.getPLN_STR_DATE(),"yyyy/MM/dd"),
															-((Integer.parseInt(m_med.getTRANSPORT_LT()))+ (Integer.parseInt(ShipLT)))
															);
									
									//System.out.println("要求納期 :"+tempDate+" 出荷準備LT:"+ShipLT+"運送日数;"+m_med.getTRANSPORT_LT());
									m_med.setDUE_DATE(Converter.dateToStr(tempDate,"yyyy/MM/dd"));
									m_med.setDM_QTY(m_med.getPLN_QTY_REMAIN());
									rez_typ =true;
								}else if((strPlanTyp).equals("2")){
									tempDate = this.calcdate(m_med.getPLANT_CD(),m_med.getITEM_CD(),
															Converter.strToDate(m_med.getPLN_END_DATE(),"yyyy/MM/dd"),
															-((Integer.parseInt(m_med.getTRANSPORT_LT()))+ (Integer.parseInt(ShipLT)))
															);
									
									//System.out.println("要求納期 :"+tempDate+" 出荷準備LT:"+ShipLT+"運送日数;"+m_med.getTRANSPORT_LT());
									m_med.setDUE_DATE(Converter.dateToStr(tempDate,"yyyy/MM/dd"));
									m_med.setDM_QTY(m_med.getPLN_QTY_REMAIN());
									rez_typ =true;
								}else{
									tempDate = this.calcdate(m_med.getPLANT_CD(),m_med.getITEM_CD(),
															Converter.strToDate(m_med.getPLN_STR_DATE(),"yyyy/MM/dd"),
															-((Integer.parseInt(m_med.getTRANSPORT_LT()))+ (Integer.parseInt(ShipLT)))
															);
									m_med.setPLN_STR_DATE(Converter.dateToStr(tempDate,"yyyy/MM/dd"));
									if (tempDate == null) {
										errCode = "KP05002";
										errNote = "(SBM0594)<< 致命的なエラー >>";
										outBusinessMessage(conn, strBusinessName, strUserId, strMsgPlantCd);
										this.writeLogMessage(errCode);
										throw new Exception();
									}
									tempDate = this.calcdate(m_med.getPLANT_CD(),m_med.getITEM_CD(),
															Converter.strToDate(m_med.getPLN_END_DATE(),"yyyy/MM/dd"),
															-((Integer.parseInt(m_med.getTRANSPORT_LT()))+ (Integer.parseInt(ShipLT)))
															);
									//System.out.println("要求納期 :"+tempDate+" 出荷準備LT:"+ShipLT+"運送日数;"+m_med.getTRANSPORT_LT());
									m_med.setPLN_END_DATE(Converter.dateToStr(tempDate,"yyyy/MM/dd"));
								}
								
								if (tempDate == null) {
									errCode = "KP05002";
									errNote = "(SBM0594)<< 致命的なエラー >>";
									outBusinessMessage(conn, strBusinessName, strUserId, strMsgPlantCd);
									this.writeLogMessage(errCode);
									throw new Exception();
								}
								
								//=======================================
								// [所要量]の更新
								//=======================================
								
								String inOD_NO = null;
								
								//追加対象のレコードを追加する(初日に登録、末日に登録選択時）
								if(rez_typ){
									// オーダデマンド番号採番クラスオブジェクト生成
									Numbering MyNo = new Numbering(conn, Numbering.ODNO, strUserId, strBusinessName, m_med.getWH_PLANT_CD());
									inOD_NO = MyNo.getNo();
									if (inOD_NO == null || inOD_NO.trim().length() == 0) {
										errCode = "KP05002";
										errNote = "(SBM0594)<< 致命的なエラー >>";
										outBusinessMessage(conn, strBusinessName, strUserId, strMsgPlantCd);
										this.writeLogMessage(errCode);
										throw new Exception();
									}
									m_med.setinOD_NO(inOD_NO);
									
									/*System.out.println("***[所要量]に追加されるレコードの値***");
									System.out.println("OD_NO:"+m_med.getinOD_NO()+"\n PLANT_CD:"+m_med.getinPLANT_CD()+"\n ITEM_CD:"+m_med.getITEM_CD());
									System.out.println("DUE_DATE:"+m_med.getDUE_DATE()+"\n PRD_DUE_DATE:"+m_med.getDUE_DATE()+"\n DM_QTY:"+m_med.getDM_QTY());
									System.out.println("MRP_ODR_TYP:"+m_med.getMRP_ODR_TYP()+" OUTSIDE_TYP:"+m_med.getOUTSIDE_TYP()+"\n ISSUE_TYP:"+m_med.getISSUE_TYP());
									System.out.println("ODR_LT:"+m_med.getODR_LT()+"\n FIXED_LT:"+m_med.getFIXED_LT()+"\n PROP_LT:"+m_med.getPROP_LT());
									System.out.println("SAFETY_LT:"+m_med.getSAFETY_LT()+"\n ISSUE_LT:"+m_med.getISSUE_LT()+"\n PROP_LOT_SIZE:"+m_med.getPROP_LOT_SIZE());
									System.out.println("OD_LEVEL_NO:"+m_med.getHIGH_LEVEL_NO()+"\n ITEM_SPOIL:"+m_med.getITEM_SPOIL()+"\n");*/
									
									if(m_med.getinsertT_OD().create() != SUCCESS){
										errCode = "KP05002";
										errNote = "(SBM0594)<< 致命的なエラー >>";
										outBusinessMessage(conn, strBusinessName, strUserId, strMsgPlantCd);
										this.writeLogMessage(errCode);
										throw new Exception();
									}
								}else{
									//分散して登録選択時
									int basis_QTY =0;
									double rest_QTY =0;
									double PLN_QTY_REMAIN =m_med.getPLN_QTY_REMAIN().doubleValue();
									int TERM_DAYS =1;
									m_med.setCAL_DATE(m_med.getPLN_STR_DATE());
									
									//稼働日を考慮して期間日数を再計算
									m_med.getselectWORKDAYCOUNT().read();
									if(m_med.getselectWORKDAYCOUNT().next()) {
										TERM_DAYS = Integer.parseInt(m_med.getWORK_DAY_COUNT());
									}
									
									//期間日数を基に計画数残量を分散して所要量に登録する
									basis_QTY = (int)(PLN_QTY_REMAIN/TERM_DAYS);
									rest_QTY = PLN_QTY_REMAIN%TERM_DAYS;
									while(PLN_QTY_REMAIN >0) {
										if(rest_QTY >= 1){
											m_med.setDM_QTY(new Double(basis_QTY + 1));
											PLN_QTY_REMAIN -= basis_QTY + 1;
											rest_QTY--;
											
										}else if(rest_QTY > 0 && rest_QTY <1){
											m_med.setDM_QTY(new Double(basis_QTY+rest_QTY));
											PLN_QTY_REMAIN -= basis_QTY+rest_QTY;
											rest_QTY--;
											
										}else if(rest_QTY <=0){
											m_med.setDM_QTY(new Double(basis_QTY));
											PLN_QTY_REMAIN -= basis_QTY;
											rest_QTY--;
											
										}
										// 稼動日を取得、要求納期を設定
										m_med.getselectWORK_DAY().read();
										if(m_med.getselectWORK_DAY().next()) {
											m_med.setDUE_DATE(m_med.getCAL_DATE());
										}
										
										m_med.setCAL_DATE(DateTool.addDay(m_med.getCAL_DATE(), "1"));
										Numbering MyNo = new Numbering(conn, Numbering.ODNO, strUserId, strBusinessName, m_med.getWH_PLANT_CD());
										inOD_NO = MyNo.getNo();
										if (inOD_NO == null || inOD_NO.trim().length() == 0) {
											errCode = "KP05002";
											errNote = "(SBM0594)<< 致命的なエラー >>";
											outBusinessMessage(conn, strBusinessName, strUserId, strMsgPlantCd);
											this.writeLogMessage(errCode);
											throw new Exception();
										}
										m_med.setinOD_NO(inOD_NO);
										/*System.out.println("***[所要量]に追加されるレコードの値***");
										System.out.println("OD_NO:"+m_med.getinOD_NO()+" PLANT_CD:"+m_med.getPLANT_CD()+" ITEM_CD:"+m_med.getITEM_CD());
										System.out.println("DUE_DATE:"+m_med.getDUE_DATE()+" PRD_DUE_DATE:"+m_med.getDUE_DATE()+" DM_QTY:"+m_med.getDM_QTY());
										System.out.println("MRP_ODR_TYP:"+m_med.getMRP_ODR_TYP()+" OUTSIDE_TYP:"+m_med.getOUTSIDE_TYP()+" ISSUE_TYP:"+m_med.getISSUE_TYP());
										System.out.println("ODR_LT:"+m_med.getODR_LT()+" FIXED_LT:"+m_med.getFIXED_LT()+" PROP_LT:"+m_med.getPROP_LT());
										System.out.println("SAFETY_LT:"+m_med.getSAFETY_LT()+" ISSUE_LT:"+m_med.getISSUE_LT()+" PROP_LOT_SIZE:"+m_med.getPROP_LOT_SIZE());
										System.out.println("OD_LEVEL_NO:"+m_med.getHIGH_LEVEL_NO()+" ITEM_SPOIL:"+m_med.getITEM_SPOIL()+"\n");*/
										if(m_med.getinsertT_OD().create() != SUCCESS){
											errCode = "KP05002";
											errNote = "(SBM0594)<< 致命的なエラー >>";
											outBusinessMessage(conn, strBusinessName, strUserId, strMsgPlantCd);
											this.writeLogMessage(errCode);
											throw new Exception();
										}
									}
								}
							}
						}
					}
				}catch(Exception e){
					throw e;
				}finally{
					//=======================================
					// 業務ロック解除
					//=======================================
					if (!businessUnLock(lockCancelKey)) {
						this.writeLogMessage("ZZ01004");
					}
				}
			}
		} catch (Exception e) {
			try {
			    conn.rollback();
			    e.printStackTrace();
				setBatchErrorMessage(e);
				outBusinessMessage(conn, strBusinessName, strUserId, strMsgPlantCd);
			} catch (Exception ee) {
				ee.printStackTrace();
			}
		} finally {
			try {
				//バッチ終了メッセージ登録
				errCode = "KP05003";
				errNote = "(SBM0598)<< 販売所要計画Ｉ／Ｆバッチ処理終了 >>";
				outBusinessMessage(conn, strBusinessName, strUserId, strMsgPlantCd);
				conn.commit();
				CoreTools.write("\n(SBM1089)******>>>> 販売所要計画Ｉ／Ｆエンド <<<******");
			} catch (Exception ee) {
				ee.printStackTrace();
				outBusinessMessage(conn, strBusinessName, strUserId, strMsgPlantCd);
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
		public medKP0050B001 m_med=null;

		/**
		 * コンテナクラスインスタンス
		 */
		public ManageContainer m_container=null;

		//////////////////////////////

		public interControl(medKP0050B001 med) throws BatchAppException
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
