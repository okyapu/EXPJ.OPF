/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AL0060/src/com/nec/jp/orteus/metamorBase/AL0060/AL0060B001/CtrlMain.java,v $
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

package com.nec.jp.orteus.metamorBase.AL0060.AL0060B001;

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

import java.util.Date;
import com.nec.jp.orteus.msg.util.*;
import com.nec.jp.orteus.metamorBase.common.CollectNumber.Numbering;
import com.nec.jp.orteus.metamorBase.util.AlarmMessage.AlarmMessage;
import com.nec.jp.orteus.metamorBase.util.BusinessLock.BusinessLock;
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessage;
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessageAccessor;
import java.text.SimpleDateFormat;
import java.text.ParseException;

//}}user_implement_dev:import

/**
 * CLASS     : CtrlMain クラス
 * ファイル・クラス説明
 * @author $Author: xl-hs-zzw $
 * @version $Revision: 1.5 $ $Date: 2014/11/05 07:19:54 $
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
	public medAL0060B001 m_med=null;

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
	public CtrlMain(medAL0060B001 med, BatchAppConductor cdr) throws BatchAppException
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
        public CtrlMain(medAL0060B001 med) throws BatchAppException
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
       
           // 変数宣言 ========================================================
           int nret = 0;
           IDbConnection conn = null;	  // DBコネクション
           BusinessLock Lock = null;     // 業務ロック
           int lockCancelKey = 0;	      // ロック解除キー
       
           // バッチ処理共通エラー処理
        String errCode = null;		  // エラーコード
        String errMsg = null;		  // エラーメッセージ
           String errNote = "";          // エラーメッセージ(備考)
       
           // metamorBase業務メッセージ
           BusinessMessageAccessor businessMsgAcc = null;
        BusinessMessage businessMsg = null;     // metamorBase業務メッセージ
           String businessErrCode = null;          // metamorBase業務メッセージコード
       
           // Orteus業務メッセージ
           String memoText = "";         // Orteus業務メッセージ 備考
       
           // ストアドプロシージャ名
           String functionName = null;
       
           // ストアドプロシージャパラメータ
           String LogMode = null;        // ログモード
           String OutputMode = null;     // 出力モード
           String OutputPath = null;     // 出力パス
           String OutputName = null;     // 出力ファイル名
           String UserId = null;         // ユーザID
           String BusinessName = null;   // 業務名（バッチ処理ID）
           String PlantCd = null;        // 工場コード
           String CalcFromDate = null;   // 負荷山積対象期間(FROM)
           String CalcToDate = null;     // 負荷山積対象期間(To)
           // ===============================================================
       
        //処理 ===========================================================
       
        //ファンクション名
        functionName = "SQLLOADCALCBAT"; //負荷山積
       
        //引数受け取り
        String args[] = m_med.getArgs();
        int argsLength = args.length; //引数の個数保持
       
        //バッチ処理ID(業務名)取得
        Class myClass = this.getClass();
        String myBusinessName = myClass.getName();
        myBusinessName = myBusinessName.substring(myBusinessName.length()-19,myBusinessName.length()-9);
       
        try{
         //2003.10.27 業務ロック処理修正
            try{
             if(argsLength == 5){
             }else{
                       businessErrCode = "AL60004"; // 引数が不足しています
                       errCode = businessErrCode;
                    // エラーメッセージの作成
                    AlarmMessage msg = new AlarmMessage(errCode);
                    errMsg = "[" + errCode + "]" + msg.getMessage();
                    throw new Exception();
             }
             //2003.11.06 コマンド用　引数に「null」が入っていた場合のチェック
          if(myBusinessName == null || myBusinessName.equals("null") || myBusinessName.equals("Null") || myBusinessName.equals("NULL")){
                       businessErrCode = "ZZ09007"; // バッチパラメータの読み込みに失敗しました
                       errCode = businessErrCode;
           throw new Exception();
          }
          if(args[1] == null || args[1].equals("null") || args[1].equals("Null") || args[1].equals("NULL")){
                       businessErrCode = "ZZ09007"; // バッチパラメータの読み込みに失敗しました
                       errCode = businessErrCode;
           throw new Exception();
          }
          if(args[2] == null || args[2].equals("null") || args[2].equals("Null") || args[2].equals("NULL")){
                       businessErrCode = "ZZ09007"; // バッチパラメータの読み込みに失敗しました
                       errCode = businessErrCode;
           throw new Exception();
          }
          if(args[3] == null || args[3].equals("null") || args[3].equals("Null") || args[3].equals("NULL")){
                       businessErrCode = "ZZ09007"; // バッチパラメータの読み込みに失敗しました
                       errCode = businessErrCode;
           throw new Exception();
          }
          if(args[4] == null || args[4].equals("null") || args[4].equals("Null") || args[4].equals("NULL")){
                       businessErrCode = "ZZ09007"; // バッチパラメータの読み込みに失敗しました
                       errCode = businessErrCode;
           throw new Exception();
          }
             //引数を変数にセット
             BusinessName = myBusinessName;
             UserId = args[1];
             PlantCd = args[2];
             CalcFromDate = args[3];
             CalcToDate = args[4];
                //DB接続取得処理
                conn = m_conductor.m_transactionConn;
       
                //業務メッセージ準備
                   businessMsgAcc = new BusinessMessageAccessor();
                   businessMsg = new BusinessMessage();
                businessMsgAcc.init(conn);
                businessMsg.setBusinessOperatingName(BusinessName);
                   businessMsg.setUser(UserId);
                   businessMsg.setPlantCode(PlantCd);
       
                   try {
                    //業務ロック処理
                    Lock = new BusinessLock(conn,UserId,PlantCd);
                    //業務ロック取得
                    lockCancelKey = Lock.doLock(myBusinessName);
                       // lockCancelKey==-1の場合業務ロックされているのでエラー
                       if(lockCancelKey == -1){
                           businessErrCode = "ZZ01001"; //業務ロックされているため起動できません
                           errCode = businessErrCode;
                           errNote = "(SBM0580)ユーザコード：[ " + UserId + " ] 工場コード：[ " + PlantCd + " ]";
                           throw new Exception();
                       }
                    conn.commit();
                   } catch (FoundationException e) {
                    businessErrCode = "ZZ01001"; //業務ロックされているため起動できません
                       errCode = businessErrCode;
                       throw e;
                   }
       
          //===バッチパラメータTableより、ストアド共通パラメータの読み込み
       
          try {
                 //DB接続取得処理
                 //conn = m_conductor.m_transactionConn;
       
           m_med.setPROGRAM_CD(myBusinessName);
           m_med.setFUNCTION_NAME(functionName);
       
           nret = m_med.getreadSysBatParm().read();
       
           conn.commit();
       
           if(m_med.getreadSysBatParm().next() == false ) {
            throw new Exception();
           }else{
                        LogMode = m_med.getLOG_MODE_TYP().toString();
                        OutputMode = m_med.getOUTPUT_MODE_TYP().toString();
                        OutputPath = m_med.getFILE_PATH();
                        OutputName = m_med.getFILE_NAME();
           }
           //sysBatParam.read();
          } catch (Exception e) {
                       businessErrCode = "ZZ09007"; // バッチパラメータの読み込みに失敗しました
                       errCode = businessErrCode;
                       errNote = "(SBM0581)ファンクション名：[ " + functionName + " ] ";
                       throw e;
          }
       
                   //ストアドプロシージャのパラメータセット
                   m_med.setpvc2LogMode(LogMode);
                   m_med.setpvc2OutputMode(OutputMode);
                   m_med.setpvc2OutputPath(OutputPath);
                   m_med.setpvc2OutputName(OutputName);
                   m_med.setpvc2UserId(UserId);
                   m_med.setpvc2BusinessName(BusinessName);
                   m_med.setpvc2PlantCd(PlantCd);
                   m_med.setpdtmCalcFromDate(CalcFromDate);
                   m_med.setpdtmCalcToDate(CalcToDate);
       
                   //ストアドプロシージャ実行
                   try {
                    m_med.getcallSqlLoadCalcBat().call();
                   } catch (Exception e) {
                    //System.out.println("ストアドエラー");
                    errCode = "AL30006"; //実行時エラー
                    // 引数文字列をエラー備考にセット
                    StringBuffer sb = new StringBuffer();
                    sb.append("(SBM0582)ストアドプロシージャ引数：");
                    sb.append(LogMode + " ");
                    sb.append(OutputMode + " ");
                    sb.append(OutputPath + " ");
                    sb.append(OutputName + " ");
                    sb.append(UserId + " ");
                    sb.append(BusinessName + " ");
                    sb.append(PlantCd + " ");
                    sb.append(CalcFromDate + " ");
                    sb.append(CalcToDate + " ");
                    errNote = sb.toString();
                    throw e;
                   }
               } catch (Exception e) {
                if (errCode == null) {
                 errCode = "AL30007"; //その他のError
                }
       
                // エラーメッセージの作成
                   AlarmMessage msg = new AlarmMessage(errCode);
                   errMsg = "[" + errCode + "]" + msg.getMessage();
                   if (e.getMessage() != null) {
                       errMsg = errMsg + " " + e.getMessage();
                   }
       
                   // 業務メッセージの登録
                   if (businessMsg != null) {
                    //System.out.println("業務メッセージ");
                       // 業務エラーがセットされていない場合
                       if (businessErrCode == null) {
                           businessErrCode = "ZZ09009"; // バッチ処理を開始できませんでした。
                       }
                       Numbering numbering = new Numbering(conn,Numbering.LOG_CD,UserId,BusinessName,PlantCd);
                       businessMsg.setLogCode(numbering.getNo());
                       businessMsg.setMessageCode(businessErrCode);
                       businessMsg.setData(errNote);
                       try {
                           businessMsgAcc.add(businessMsg);
                           conn.commit();
                       } catch (SQLException ex) {
                        conn.rollback();
                           ex.printStackTrace();
                       }
                   }
                   memoText = errMsg; // 備考メッセージ
                   throw e;
       
               } finally {
                   try {
                       // 業務ロック解除
                       //System.out.println("業務ロック解除");
                       if(!Lock.doUnLock(myBusinessName, lockCancelKey)){
                           //System.out.println("業務ロックの解除に失敗しました");
                           businessErrCode = "ZZ01004"; //業務ロックの解除に失敗しました
                           errCode = businessErrCode;
                           throw new Exception();
                       }
                       conn.commit();
                   } catch (FoundationException e) {
                       e.printStackTrace();
                       businessErrCode = "ZZ01004";  // 業務ロックの解除に失敗しました。
       
                       // 業務メッセージの登録（業務ロック解除失敗時）
                       errNote = "(SBM0580)ユーザコード：[ " + UserId + " ] 工場コード：[ " + PlantCd + " ]";
                       Numbering numbering = new Numbering(conn,Numbering.LOG_CD,UserId,BusinessName,PlantCd);
                       businessMsg.setLogCode(numbering.getNo());
                       businessMsg.setMessageCode(businessErrCode);
                       businessMsg.setData(errNote);
                       try {
                           businessMsgAcc.add(businessMsg);
                           conn.commit();
                       } catch (SQLException ex) {
                        conn.rollback();
                           ex.printStackTrace();
                       }
                       AlarmMessage msg = new AlarmMessage(businessErrCode);
                       errMsg = "[" + businessErrCode + "]" + msg.getMessage();
                       memoText = errMsg; // 備考メッセージ
                       //System.out.println("errMsg:" + errMsg);
                   }
                   // =========================================================
                   /* テスト用リリース時はコメント部 *
                   finally {
                       try { // バッチ終了メッセージ送信
                           System.out.println("バッチ終了メッセージ送信");
                           Business business = Business.getStartBusiness(m_med.getBUSINESS_GROUP_CD(), args[1], m_med.getBUSINESS_CD());
                           business.setMessageDisplayLevel(1); // 表示レベル(重要度)の指定
                           business.setMessageReference(memoText); // 備考の指定
                           business.complete();
                       }
                       catch(MessageApiException e) {
                           e.printStackTrace();
       
                           businessErrCode = "ZZ09008";
                           // 業務メッセージの登録（バッチ終了メッセージ送信失敗時）
                           businessMsg.setMessageCode(businessErrCode);
                           businessMsg.setData("");
                           try {
                               businessMsgAcc.add(businessMsg);
                           }
                               catch (SQLException ex) {
                               ex.printStackTrace();
                           }
                           AlarmMessage msg = new AlarmMessage(businessErrCode);
                           errMsg = businessErrCode + " " + msg.getMessage();
                           System.out.println("errMsg:" + errMsg);
                       }
                   }
                    テスト用リリース時はコメント部 */
                   // =========================================================
               }
       
       
           } catch (Exception e) {
       
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
       
           }       // -- end try0
       
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
		public medAL0060B001 m_med=null;

		/**
		 * コンテナクラスインスタンス
		 */
		public ManageContainer m_container=null;

		//////////////////////////////

		public interControl(medAL0060B001 med) throws BatchAppException
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
