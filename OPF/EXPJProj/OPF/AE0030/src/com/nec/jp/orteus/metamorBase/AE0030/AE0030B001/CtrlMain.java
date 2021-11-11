/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AE0030/src/com/nec/jp/orteus/metamorBase/AE0030/AE0030B001/CtrlMain.java,v $
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

package com.nec.jp.orteus.metamorBase.AE0030.AE0030B001;

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
import com.nec.jp.orteus.msg.util.*;
import com.nec.jp.orteus.metamorBase.util.AlarmMessage.AlarmMessage;
import com.nec.jp.orteus.metamorBase.util.BusinessLock.BusinessLock;
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessage;
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.
        BusinessMessageAccessor;
import com.nec.jp.orteus.metamorBase.common.CollectNumber.Numbering;
import com.nec.jp.orteus.expj.util.ExpjMessage;

//}}user_implement_dev:import

/**
 * CLASS     : CtrlMain クラス
 * ファイル・クラス説明
 * @author $Author: xl-hs-zzw $
 * @version $Revision: 1.21 $ $Date: 2014/11/05 07:09:54 $
 */

//{{user_implement_dev:header
/**
 * CLASS     : CtrlMain クラス
 * VERSION   : 1.0.0.0
 * DATE      : <日付>
 * AUTHOR    : <開発者名>
 * HISTORY
 *           : 1.0.0.0　(2003/10/3),新規作成
 *         [ : <バージョン> (<日付>),<内容> ]
 *                        ・ ・ ・
 */
//}}user_implement_dev:header

public class CtrlMain extends Object
		implements IBatchAppCommon
{

	//////////////////////////////

	/**
	 * mediatorクラス インスタンス
	 */
	public medAE0030B001 m_med=null;

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
	public CtrlMain(medAE0030B001 med, BatchAppConductor cdr) throws BatchAppException
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
            * @return なし
            */
           public CtrlMain(medAE0030B001 med) throws BatchAppException {
               // メンバ変数を初期化します
               m_med = med;
               m_control = new interControl(med);
       
               // todo: インスタンス初期化時に実行する処理を記述してください
       
               return;
           }
       
           /**
            * インスタンス破壊時に行う処理
            *
            * @param なし
            */
           public void finalize() {
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
           public int main() throws BatchAppException {
               /*
                 // todo: ここにユーザ定義コードを記述してください
                */
               // 初期化
               int nret = 0;
               BusinessMessageAccessor businessMsgAcc = new BusinessMessageAccessor();
               BusinessMessage businessMsg = new BusinessMessage();
               String errCode = ""; //エラーコードの準備
               String errMsg = ""; //エラーメッセージの準備
               BusinessLock Lock = null;
               int lockCancelKey = 0; // ロック解除キー
               IDbConnection conn = null; // DB接続
               String functionName = "SQLPUCHODRINST"; // ストアドプロシージャ名
               List callList; //ストアドプロシージャ戻り値
       
               // 引数受け取り
               String args[] = m_med.getArgs();
       		   
           	   //引数がダブルクォーテーションで括られていた場合削除（LINUX対応）
			   for(int i = 0; i < args.length; i++){
			   		if((args[i].indexOf("\"") == 0 && args[i].lastIndexOf("\"") == args[i].length()-1)){
			   			args[i] = args[i].substring( args[i].indexOf("\"") + 1,args[i].lastIndexOf("\""));
			   		}
			   }
           	
               // パラメータ確認
               System.out.println("-----------------------------------------------");
               System.out.println("functionName:" + functionName); // ストアドプロシージャ名
               System.out.println("args[0]:" + args[0]);
               System.out.println("args[1]:" + args[1]);
               System.out.println("args[2]:" + args[2]);
               System.out.println("args[3]:" + args[3]);
               System.out.println("args[4]:" + args[4]);
               System.out.println("args[5]:" + args[5]);
               System.out.println("args[6]:" + args[6]);
               System.out.println("args[7]:" + args[7]);
               System.out.println("args[8]:" + args[8]);
               System.out.println("args[9]:" + args[9]);
               System.out.println("args[10]:" + args[10]);
               System.out.println("-----------------------------------------------");
               // バッチ終了メッセージの準備
               
           	   //20070509 takahashi↓
           	   //String memoText = ""; // 備考メッセージ
               //20070509 takahashi↑
           	
               // 自業務名の設定
               Class myClass = this.getClass();
               String myProgramName = myClass.getName();
               myProgramName = myProgramName.substring(myProgramName.length() - 19,
                                                       myProgramName.length() - 9);
               System.out.println("BAT_BRG:" + myProgramName); // バッチ業務名
       
               try {
                   try {
                       // DB接続取得処理
                       conn = m_conductor.m_transactionConn;
       
                       // コネクションを渡して、業務メッセージ準備
                       businessMsgAcc.init(conn);
                       businessMsg.setBusinessOperatingName(args[0]);
                       businessMsg.setUser(args[1]);
                       businessMsg.setPlantCode(args[2]);
       
                       // コネクション・ユーザＩＤ・工場コードを渡して、業務ロッククラスを作成
                       Lock = new BusinessLock(conn, args[1], args[2]);
       
                       // 業務ロック取得
                       lockCancelKey = Lock.doLock(myProgramName);
                       // ロックに失敗した場合
           if (lockCancelKey == -1) {
            throw new Exception(); 
           }
                       conn.commit();
       
                       System.out.println("LOCK_KY:" + lockCancelKey);
                   } catch (Exception e) {
                       e.printStackTrace();
       
                       errCode = "ZZ01001";
                       // 業務メッセージの登録
                       businessMsg.setMessageCode(errCode);
                       businessMsg.setData("");
                       try {
                           Numbering logCd = new Numbering(m_conductor.
                                   m_transactionConn,
                                   Numbering.LOG_CD,
                                   args[1],
                                   args[0],
                                   args[2]);
                           businessMsg.setLogCode(logCd.getNo());
                           businessMsgAcc.add(businessMsg);
                       } catch (Exception ex) {
                           ex.printStackTrace();
                       }
       
                       ExpjMessage msg = new ExpjMessage(errCode);
                       errMsg = errCode + " " + msg.getMessage(CoreTools.getLocale(args[1]));
                   	
                   	   //20070509 takahashi↓
                       //memoText = errMsg; // 備考メッセージ
                       //20070509 takahashi↑
                   	
                   	   System.out.println("errMsg:" + errMsg);
                       throw new BatchAppException("CtrlMain", "main", errMsg);
                   }
       
                   try {
                       // 条件設定
                       m_med.setPROGRAM_CD(args[0]);
                       m_med.setFUNCTION_NAME(functionName);
       
                       // パラメータ読込
                       nret = m_med.getSelectSYS_BAT_PARM().read();
       
                       if (m_med.getSelectSYS_BAT_PARM().next() == false) {
                           throw new Exception();
                       } else {
                           // 戻り値表示
                           System.out.println("nret:" + nret);
                           System.out.println("--------------------------------------");
                           System.out.println("PROGRAM_CD:" + m_med.getPROGRAM_CD());
                           System.out.println("FUNCTION_NAME:" +
                                              m_med.getFUNCTION_NAME());
                           System.out.println("LOG_MODE_TYP:" + m_med.getLOG_MODE_TYP());
                           System.out.println("OUTPUT_MODE_TYP:" +
                                              m_med.getOUTPUT_MODE_TYP());
                           System.out.println("FILE_PATH:" + m_med.getFILE_PATH());
                           System.out.println("FILE_NAME:" + m_med.getFILE_NAME());
                           System.out.println("BUSINESS_GROUP_CD:" +
                                              m_med.getBUSINESS_GROUP_CD());
                           System.out.println("BUSINESS_CD:" + m_med.getBUSINESS_CD());
                           System.out.println("--------------------------------------");
                       }
                   } catch (Exception e) {
                       e.printStackTrace();
       
                       errCode = "ZZ09007";
                       // 業務メッセージの登録
                       businessMsg.setMessageCode(errCode);
                       businessMsg.setData("");
                       try {
                           Numbering logCd = new Numbering(m_conductor.
                                   m_transactionConn,
                                   Numbering.LOG_CD,
                                   args[1],
                                   args[0],
                                   args[2]);
                           businessMsg.setLogCode(logCd.getNo());
                           businessMsgAcc.add(businessMsg);
                       } catch (Exception ex) {
                           ex.printStackTrace();
                       }
       
                       businessMsg.setMessageCode(errCode);
                       businessMsg.setData("(SBM0579)詳しい情報を1023byte以内で記述します。");
                       ExpjMessage msg = new ExpjMessage(errCode);
                       errMsg = errCode + " " + msg.getMessage(CoreTools.getLocale(args[1]));
                   	
                   	   //20070509 takahashi↓
                       //memoText = errMsg; // 備考メッセージ
                       //20070509 takahashi↑
                   	
                   	   System.out.println("errMsg:" + errMsg);
                       throw new BatchAppException("CtrlMain", "main", errMsg);
                   }
       
                   try {
                       // 条件設定
                       m_med.setpvc2LogMode(m_med.getLOG_MODE_TYP().toString());
                       m_med.setpvc2OutputMode(m_med.getOUTPUT_MODE_TYP().toString());
                       m_med.setpvc2OutputPath(m_med.getFILE_PATH());
                       m_med.setpvc2OutputName(m_med.getFILE_NAME());
                       m_med.setpvc2UserId(args[1]);
                       m_med.setpvc2BusinessName(args[0]);
                       m_med.setpvc2PlantCd(args[2]);
                       m_med.setpvc2StartDate(args[3]);
                       m_med.setpvc2DlvDate(args[4]);
                       m_med.setpvc2PuchOdrCd(args[5]);
                       m_med.setpvc2VendCd(args[6]);
                       m_med.setpvc2PuchOdrPerson(args[7]);
                       m_med.setpvc2JobOdrCd(args[8]);
                       m_med.setpvc2ApprPurInst(args[9]);
                       m_med.setpvc2ApprPowerTyp(args[10]);
       
                       System.out.println("--------------------------------------");
                       System.out.println("pvc2LogMode:" + m_med.getpvc2LogMode());
                       System.out.println("pvc2OutputMode:" + m_med.getpvc2OutputMode());
                       System.out.println("pvc2OutputPath:" + m_med.getpvc2OutputPath());
                       System.out.println("pvc2OutputName:" + m_med.getpvc2OutputName());
                       System.out.println("pvc2UserId:" + m_med.getpvc2UserId());
                       System.out.println("pvc2BusinessName:" +
                                          m_med.getpvc2BusinessName());
                       System.out.println("pvc2PlantCd:" + m_med.getpvc2PlantCd());
                       System.out.println("pvc2StartDate:" + m_med.getpvc2StartDate());
                       System.out.println("pvc2DlvDate:" + m_med.getpvc2DlvDate());
                       System.out.println("pvc2PuchOdrCd:" + m_med.getpvc2PuchOdrCd());
                       System.out.println("pvc2VendCd:" + m_med.getpvc2VendCd());
                       System.out.println("pvc2PuchOdrPerson:" +
                                          m_med.getpvc2PuchOdrPerson());
                       System.out.println("pvc2JobOdrCd:" + m_med.getpvc2JobOdrCd());
                       System.out.println("pvc2ApprPurInst:" + m_med.getpvc2ApprPurInst());
                       System.out.println("pvc2ApprPowerTyp:" + m_med.getpvc2ApprPowerTyp());
                       System.out.println("--------------------------------------");
                       // 処理実行
                       callList = m_med.getCallSQLPUCHODRINST().call();
                       if (callList != null) {
                           nret = callList.size();
                       } else {
                           throw new Exception();
                       }
       
                       // 戻り値表示
                       System.out.println("nret:" + nret);
                       errCode = "ZZ09002";
       
                       // 以下、PL/SQL側で終了メッセージを表示しているため、
                       // バッチ実装標準改定までコメントアウトとする。
           /*
                       // 業務メッセージの登録（正常終了時）
                       businessMsg.setMessageCode(errCode);
                       businessMsg.setData("");
                       try {
                           Numbering logCd = new Numbering(m_conductor.
                                   m_transactionConn,
                                   Numbering.LOG_CD,
                                   args[1],
                                   args[0],
                                   args[2]);
                           businessMsg.setLogCode(logCd.getNo());
                           businessMsgAcc.add(businessMsg);
                       } catch (Exception ex) {
                           ex.printStackTrace();
                       }
                       */
       
                       ExpjMessage msg = new ExpjMessage(errCode);
                       errMsg = errCode + " " + msg.getMessage(CoreTools.getLocale(args[1]));
                   	   
                   	   //20070509 takahashi↓
                       //memoText = errMsg; // 備考メッセージ
                       //20070509 takahashi↑
                   	
                   	   System.out.println("errMsg:" + errMsg);
       
                   } catch (Exception e) {
                       e.printStackTrace();
       
                       errCode = "ZZ01106";
                       // 業務メッセージの登録
                       businessMsg.setMessageCode(errCode);
                       businessMsg.setData("");
                       try {
                           Numbering logCd = new Numbering(m_conductor.
                                   m_transactionConn,
                                   Numbering.LOG_CD,
                                   args[1],
                                   args[0],
                                   args[2]);
                           businessMsg.setLogCode(logCd.getNo());
                           businessMsgAcc.add(businessMsg);
                       } catch (Exception ex) {
                           ex.printStackTrace();
                       }
       
                       ExpjMessage msg = new ExpjMessage(errCode);
                       errMsg = errCode + " " + msg.getMessage(CoreTools.getLocale(args[1]));
                       System.out.println("errMsg:" + errMsg);
                   	   
                   	   //20070509 takahashi↓
                       //memoText = errMsg; // 備考メッセージ
                       //20070509 takahashi↓
                   	
                   	   throw new BatchAppException("CtrlMain", "main", errMsg);
                   }
               } finally {
                   try {
                       // 業務ロック解除
                       System.out.println("(SBM0658)業務ロック解除");
                       Lock.doUnLock(myProgramName, lockCancelKey);
                       conn.commit();
                   } catch (Exception e) {
                       e.printStackTrace();
       
                       errCode = "ZZ01004";
                       // 業務メッセージの登録（業務ロック解除失敗時）
                       businessMsg.setMessageCode(errCode);
                       businessMsg.setData("");
                       try {
                           Numbering logCd = new Numbering(m_conductor.
                                   m_transactionConn,
                                   Numbering.LOG_CD,
                                   args[1],
                                   args[0],
                                   args[2]);
                           businessMsg.setLogCode(logCd.getNo());
                           businessMsgAcc.add(businessMsg);
                       } catch (Exception ex) {
                           ex.printStackTrace();
                       }
       
                       ExpjMessage msg = new ExpjMessage(errCode);
                       errMsg = errCode + " " + msg.getMessage(CoreTools.getLocale(args[1]));
                       System.out.println("errMsg:" + errMsg);
                   	
                   	   //20070509 takahashi↓
                       //memoText = errMsg; // 備考メッセージ
                       //20070509 takahashi↑
                   }
                   /*
                    テスト用リリース時はコメント部
                                  finally {
                           try { // バッチ終了メッセージ送信
                                   System.out.println("バッチ終了メッセージ送信");
                                   Business business = Business.getStartBusiness
                            (m_med.getBUSINESS_GROUP_CD(), args[1], m_med.getBUSINESS_CD());
                            business.setMessageDisplayLevel(1); // 表示レベル(重要度)の指定
                                   business.setMessageReference(memoText); // 備考の指定
                                   business.complete();
                           }
                           catch(MessageApiException e) {
                                   e.printStackTrace();
                                   errCode = "ZZ09008";
                                   // 業務メッセージの登録（バッチ終了メッセージ送信失敗時）
                                   businessMsg.setMessageCode(errCode);
                                   businessMsg.setData("");
                                   try {
                           Numbering logCd = new Numbering(m_conductor.
                                   m_transactionConn,
                                   Numbering.LOG_CD,
                                   args[1],
                                   args[0],
                                   args[2]);
                           businessMsg.setLogCode(logCd.getNo());
                                           businessMsgAcc.add(businessMsg);
                                   }
                                           catch (Exception ex) {
                                           ex.printStackTrace();
                                   }
                                   AlarmMessage msg = new AlarmMessage(errCode);
                                   errMsg = errCode + " " + msg.getMessage();
                                   System.out.println("errMsg:" + errMsg);
                           }
                                    }
                                     テスト用リリース時はコメント部
                    */
               }
               return BREAK;
           }
       
       
           //////////////////////////////
       
           /**
            * object型を返します
            *
            * @return object型
            */
           public int getType() {
               return m_control.getType();
           }
       
           /**
            * 初期処理
            *
            * @return <<コメントを記述してください>>
            * @exception <<コメントを記述してください>>
            */
           public int beginProc() throws BatchAppException {
       
               // todo: ここにユーザ定義コードを記述してください
       
               return m_control.beginProc();
           }
       
           /**
            * 終了処理
            *
            * @exception <<コメントを記述してください>>
            */
           public int endProc() throws BatchAppException {
       
               // todo: ここにユーザ定義コードを記述してください
       
               return m_control.endProc();
           }
       
           /**
            * 終了処理
            *
            * @exception <<コメントを記述してください>>
            */
           public int execute() throws BatchAppException {
       
               // todo: ここにユーザ定義コードを記述してください
       
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
		public medAE0030B001 m_med=null;

		/**
		 * コンテナクラスインスタンス
		 */
		public ManageContainer m_container=null;

		//////////////////////////////

		public interControl(medAE0030B001 med) throws BatchAppException
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
