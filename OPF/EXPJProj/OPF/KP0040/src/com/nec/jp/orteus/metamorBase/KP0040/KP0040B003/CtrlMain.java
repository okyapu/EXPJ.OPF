/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KP0040/src/com/nec/jp/orteus/metamorBase/KP0040/KP0040B003/CtrlMain.java,v $
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

package com.nec.jp.orteus.metamorBase.KP0040.KP0040B003;

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
import java.util.Date;
import com.nec.jp.orteus.msg.util.*;
import com.nec.jp.orteus.msg.core.*;
import com.nec.jp.orteus.expj.util.*;
import com.nec.jp.orteus.expj.exception.*;
import com.nec.jp.orteus.expj.systemlog.*;
import com.nec.jp.orteus.expj.businesslock.*;
import com.nec.jp.orteus.metamorBase.util.AlarmMessage.AlarmMessage;
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessage;
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessageAccessor;
import com.nec.jp.orteus.metamorBase.util.common.SystemConfig;
import com.nec.jp.orteus.metamorBase.common.util.Converter;
import com.nec.jp.orteus.metamorBase.common.CollectNumber.CollectNumber;
import com.nec.jp.orteus.metamorBase.common.CollectNumber.Numbering;
import com.nec.jp.orteus.metamorBase.common.WorkDay.WorkCalendar;
//}}user_implement_dev:import

/**
 * CLASS     : CtrlMain クラス
 * ファイル・クラス説明
 * @author $Author: geng-jia $
 * @version $Revision: 1.17 $ $Date: 2015/12/03 08:53:29 $
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
	public medKP0040B003 m_med=null;

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
	public CtrlMain(medKP0040B003 med, BatchAppConductor cdr) throws BatchAppException
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

	/** DBコネクション */
	private IDbConnection conn = null;

	private String m_vMSG = "";				//ログファイル用メッセージ

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
	private boolean getSysMsg(String strMsgCd) throws BatchAppException {
		boolean rv = true;
		try{
		//キー設定
			
			m_med.setsysBusinessIN_MEG_CD(strMsgCd);
			
			if(m_med.getreadSysBusinessMessage().read() != SUCCESS) {
				rv = false;
			} else {
				if(m_med.getreadSysBusinessMessage().next()) {
					this.m_vMSG = m_med.getsysBusinessMEG();
				} else {
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
	private void writeLogMessage(String msgCd) throws Exception,BatchAppException {
		ExpjMessage  am = new ExpjMessage (msgCd);
		CoreTools.write(am.getMessage(CoreTools.getLocale(strUserId)));
	}
	
	/**
	* エラー/警告メッセージログ出力処理(IF情報管理番号埋め込み)
	*
	* @param String メッセージコード
	* @param String IF情報管理番号
	*/
	private void writeLogMessage(String msgCd,String if_no) throws Exception,BatchAppException {
		ExpjMessage am = new ExpjMessage(msgCd,if_no);
		CoreTools.write(am.getMessage(CoreTools.getLocale(strUserId)));
	}
	/**
	* エラー/警告メッセージログ出力補助情報(埋め込み)
	*
	* @param String 補助情報名
	* @param String 補助情報値
	*/
	private void writeLogMessageInfo(String name,String value) throws Exception,BatchAppException {
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
	 * CtrlMainクラスの標準コンストラクタ
	 *
	 */
	public CtrlMain(medKP0040B003 med) throws BatchAppException
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
		// todo: ここにユーザ定義コードを記述してください
		// エラーリスト
		List errCodeList = new ArrayList();
		BusinessMessageAccessor businessMsgAcc = new BusinessMessageAccessor();
		BusinessMessage businessMsg = new BusinessMessage();
		Numbering logCd = null;		//ログ識別コード採番の準備
		
		// 引数受け取り
		String args[] = m_med.getArgs();
		
		strBusinessName = args[0];
		strUserId = args[1];
		strPlantCd = args[2];
		strMsgPlantCd = args[2];
		
		//業務ロック解除キー
		int lockCancelKey = LOCK_FAILD;
		
		try{
			conn = m_conductor.m_transactionConn;
			try {
				if(m_med.getreadM_PLANT().read() != SUCCESS){
					this.writeLogMessage("KP04303");
					throw new Exception();
				}
				if(m_med.getreadM_PLANT().next() == false){
				//対象工場コード取得失敗
					this.writeLogMessage("KV03001");
					throw new Exception();
				}
				//=======================================
				// 業務ロック開始
				//=======================================
				lockCancelKey = businessLock(strBusinessName,strUserId,strMsgPlantCd);
				if (lockCancelKey == LOCK_FAILD) {
					//this.writeLogMessage("ZZ01008");
					logCd = new Numbering(conn,Numbering.LOG_CD,strUserId,strBusinessName,strMsgPlantCd);
					String strMsgCd = "ZZ01008";
					String strDataString = "(SBM0596)<< 業務ロックの開始に失敗しました。 >>";
					businessMsgAcc.init(conn);
					businessMsg.setBusinessOperatingName(strBusinessName);
					businessMsg.setUser(strUserId);
					businessMsg.setPlantCode(strMsgPlantCd);
					businessMsg.setLogCode(logCd.getNo());
					businessMsg.setMessageCode(strMsgCd);
					businessMsg.setData(strDataString);
					businessMsgAcc.add(businessMsg);
					if(this.getSysMsg(strMsgCd)) {
						CoreTools.write(strMsgCd+" "+this.m_vMSG+" "+strDataString);
					} else {
						throw new Exception();
					}
					return BREAK;
				}
				
				//バッチ開始メッセージ登録
				// コネクションを渡して、採番の準備
				logCd = new Numbering(conn,Numbering.LOG_CD,strUserId,strBusinessName,strMsgPlantCd);
				// コネクションを渡して、業務メッセージ準備
				String strMsgCd = "KP04301";
				String strDataString = "(SBM0590)<< 販売所要残集計バッチ処理開始 >>";
				businessMsgAcc.init(conn);
				businessMsg.setBusinessOperatingName(strBusinessName);
				businessMsg.setUser(strUserId);
				businessMsg.setPlantCode(strMsgPlantCd);
				businessMsg.setLogCode(logCd.getNo());
				businessMsg.setMessageCode(strMsgCd);
				businessMsg.setData(strDataString);
				businessMsgAcc.add(businessMsg);
				if(this.getSysMsg(strMsgCd)) {
					CoreTools.write(strMsgCd+" "+this.m_vMSG+" "+strDataString);
				} else {
					throw new Exception();
				}
				conn.commit();
			} catch(Exception e) {
				e.printStackTrace();
				throw new Exception();
			}
		
		try{
			//-----------------------------------------------------------------------------
			//		販売所要残集計バッチ処理（ここから）
			//-----------------------------------------------------------------------------
			int rec = 0;
			int rv = 0;
			try{
				m_med.setSysdate(Converter.dateToStr(new Date(),"yyyy/MM/dd HH:mm:ss"));
				m_med.setUsername(strUserId);
				//=======================================
				// 対象データの取得
				//=======================================
				if(m_med.getgetV_SLP_ODR_CAL().read() != SUCCESS){
						throw new Exception();
				}
				
				//========================================
				// 取得できたレコードの数だけ更新する
				//========================================
				for(rec=0; m_med.getgetV_SLP_ODR_CAL().next(); rec++){
					this.writeLogMessageInfo("SALES_PLAN_CD",(m_med.getVIEW_SALES_PLAN_CD()));
					
					//========================================
					// 値を設定
					//========================================
					m_med.setIN_SALES_PLAN_CD(m_med.getVIEW_SALES_PLAN_CD());
					m_med.setIN_REM_QTY(m_med.getVIEW_REM_QTY());
					
					//========================================
					// 更新処理
					//========================================
					rv = m_med.getinsertT_SALES_PLAN().update();
					conn.commit();
				}
			} catch(Exception e) {
				try {
				conn.rollback();
				e.printStackTrace();
				// =========================================
				// エラーログを出力し、次のレコードを処理する
				// =========================================
				this.writeLogMessage("KP04303");
				this.writeLogMessageInfo("ErrorRecord",Integer.toString(rec+1));
				
				// コネクションを渡して、採番の準備
				logCd = new Numbering(conn,Numbering.LOG_CD,strUserId,strBusinessName,strMsgPlantCd);
				// 販販売所要残集計処理にて致命的エラーが発生しました。
				String strMsgCd = "KP04304";
				String strDataString = "LINE=" + (rec + 1);
				businessMsgAcc.init(conn);
				businessMsg.setBusinessOperatingName(strBusinessName);
				businessMsg.setUser(strUserId);
				businessMsg.setPlantCode(strMsgPlantCd);
				businessMsg.setLogCode(logCd.getNo());
				businessMsg.setMessageCode(strMsgCd);
				businessMsg.setData(strDataString);
				businessMsgAcc.add(businessMsg);
				if(this.getSysMsg(strMsgCd)){
					CoreTools.write(strMsgCd+" "+this.m_vMSG);
				} else {
					throw new Exception();
				}
				conn.commit();
			    } catch (SQLException ex) {
					ex.printStackTrace();
				} catch (FoundationException ex) {
					ex.printStackTrace();
				}
			}
			
			//-----------------------------------------------------------------------------
			//		販売所要計画情報取込バッチ処理（ここまで）
			//-----------------------------------------------------------------------------
			} catch (Exception e) {
				try {
					conn.rollback();
					e.printStackTrace();
					logCd = new Numbering(conn,Numbering.LOG_CD,strUserId,strBusinessName,strMsgPlantCd);
					// 販販売所要残集計処理にて致命的エラーが発生しました。
					String strMsgCd = "KP04304";
					String strDataString = "(SBM0591)<< 販売所要残集計バッチ異常検出 >>";
					businessMsgAcc.init(conn);
					businessMsg.setBusinessOperatingName(strBusinessName);
					businessMsg.setUser(strUserId);
					businessMsg.setPlantCode(strMsgPlantCd);
					businessMsg.setLogCode(logCd.getNo());
					businessMsg.setMessageCode(strMsgCd);
					businessMsg.setData(strDataString);
					businessMsgAcc.add(businessMsg);
					
					if(this.getSysMsg(strMsgCd)){
						CoreTools.write(strMsgCd+" "+this.m_vMSG);
					} else{
						throw new Exception();
					}
					conn.commit();
				} catch (SQLException ex) {
					ex.printStackTrace();
				} catch (FoundationException ex) {
					ex.printStackTrace();
				}
			}
		} catch (Exception e) {
			try {
				conn.rollback();
				e.printStackTrace();
				logCd = new Numbering(conn,Numbering.LOG_CD,strUserId,strBusinessName,strMsgPlantCd);
				// 販売所要計画情報取込バッチ処理にて致命的エラーが発生しました。
				String strMsgCd = "KP04304";
				String strDataString = "(SBM0591)<< 販売所要残集計バッチ異常検出 >>";
				businessMsgAcc.init(conn);
				businessMsg.setBusinessOperatingName(strBusinessName);
				businessMsg.setUser(strUserId);
				businessMsg.setPlantCode(strMsgPlantCd);
				businessMsg.setLogCode(logCd.getNo());
				businessMsg.setMessageCode(strMsgCd);
				businessMsg.setData(strDataString);
				businessMsgAcc.add(businessMsg);
				if(this.getSysMsg(strMsgCd)){
					CoreTools.write(strMsgCd+" "+this.m_vMSG);
				}
				conn.commit();
			} catch (SQLException ex) {
				ex.printStackTrace();
			} catch (FoundationException ex) {
				ex.printStackTrace();
			}
		} finally {
			//バッチ終了メッセージ登録
			// コネクションを渡して、採番の準備
			try {
				if (lockCancelKey != LOCK_FAILD) {
					logCd = new Numbering(conn,Numbering.LOG_CD,strUserId,strBusinessName,strMsgPlantCd);
					// コネクションを渡して、業務メッセージ準備
					String strMsgCd = "KP04305";
					String strDataString = "(SBM0592)<< 販売所要残集計バッチ処理終了 >>";
					businessMsgAcc.init(conn);
					businessMsg.setBusinessOperatingName(strBusinessName);
					businessMsg.setUser(strUserId);
					businessMsg.setPlantCode(strMsgPlantCd);
					businessMsg.setLogCode(logCd.getNo());
					businessMsg.setMessageCode(strMsgCd);
					businessMsg.setData(strDataString);
					businessMsgAcc.add(businessMsg);
					if(this.getSysMsg(strMsgCd)){
						CoreTools.write(strMsgCd+" "+this.m_vMSG+" "+strDataString);
					}
					conn.commit();
				}
				//=======================================
				// 業務ロック解除
				//=======================================
				if (!businessUnLock(lockCancelKey)) {
					this.writeLogMessage("ZZ01004");
				}
			} catch (SQLException ex) {
				ex.printStackTrace();
			} catch (FoundationException ex) {
				ex.printStackTrace();
			} catch(Exception e) {
				e.printStackTrace();
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
		public medKP0040B003 m_med=null;

		/**
		 * コンテナクラスインスタンス
		 */
		public ManageContainer m_container=null;

		//////////////////////////////

		public interControl(medKP0040B003 med) throws BatchAppException
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
