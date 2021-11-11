/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AC0060/src/com/nec/jp/orteus/metamorBase/AC0060/AC0060B001/CtrlMain.java,v $
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

package com.nec.jp.orteus.metamorBase.AC0060.AC0060B001;

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
//------------------------------------------------------------------
// 2004/02/17 M.Hotokebuchi
//------------------------------------------------------------------
import com.nec.jp.orteus.metamorBase.util.BusinessLock.BusinessLock;
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessage;
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessageAccessor;
import com.nec.jp.orteus.metamorBase.common.util.ScreenParam;
import com.nec.jp.orteus.metamorBase.common.CollectNumber.Numbering;
//import com.nec.jp.orteus.metamorBase.common01.ExtPlanExp.ExtPlanExpProcess;
import com.nec.jp.orteus.expj.util.*;
//------------------------------------------------------------------
//}}user_implement_dev:import

/**
 * CLASS     : CtrlMain クラス
 * ファイル・クラス説明
 * @author $Author: shan-xiuqin $
 * @version $Revision: 1.17 $ $Date: 2016/05/23 08:00:00 $
 */

//{{user_implement_dev:header
/**
 * CLASS     : CtrlMain クラス
 * VERSION   : 1.0.0.0
 * DATE      : <日付>
 * AUTHOR    : <開発者名>
 * HISTORY
 *           : 1.0.0.0　(2004/2/17),新規作成
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
	public medAC0060B001 m_med=null;

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
	public CtrlMain(medAC0060B001 med, BatchAppConductor cdr) throws BatchAppException
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
        //////////////////////////////
        // コードジェネレータは、以下のコードへの上書きを行いません
        //------------------------------------------------------------------
        // 2004/02/17 M.Hotokebuchi
        //------------------------------------------------------------------
        ////////////////////////////////////////////////////////////////////////////
        // エラーリスト
        List errCodeList = new ArrayList();
        // エラーノート
        Hashtable errNoteHash = new Hashtable();
        //エラーノートセッター
        public void setErrNote(String note){
         errNoteHash.put(Integer.toString(errCodeList.size()-1),note);
        }
       
        ////////////////////////////////////////////////////////////////////////////
        /**
         * 業務メッセージ登録処理
         *
         * @param	conn			DBアクセス用のコネクション
         * @param	userId			ユーザコード
         * @param	plantCd			工場コード
         * @param	businessName	業務名
         * @return	true:成功 / false:失敗
         */
        private boolean businessMessageWrite(
         IDbConnection conn, 
         String userId, 
         String plantCd, 
         String businessName)
        {
         boolean bResult = true;
         try
         {
          // metamorBase業務メッセージ
          BusinessMessageAccessor businessMsgAcc = null;
          BusinessMessage businessMsg = null;     // metamorBase業務メッセージ
       
          // 業務メッセージの準備
          businessMsgAcc = new BusinessMessageAccessor();
          businessMsg = new BusinessMessage();
          businessMsgAcc.init(conn);
          businessMsg.setBusinessOperatingName(businessName);
          businessMsg.setUser(userId);
          businessMsg.setPlantCode(plantCd);
       
          // 業務メッセージの登録
          String errCode;
          String errNote;
          for(int i = 0; i < errCodeList.size(); i++)
          {
           errCode = (String)errCodeList.get(i);
           errNote = (String)errNoteHash.get(Integer.toString(i));
           try{
            Numbering numbering = new Numbering(conn,Numbering.LOG_CD,userId,businessName,plantCd);
            businessMsg.setLogCode(numbering.getNo());
            businessMsg.setMessageCode(errCode);
            businessMsg.setData(errNote);
            businessMsgAcc.add(businessMsg);
            System.out.println("(SBM0836)●●●　業務メッセージの登録　●●● <" + (i+1) + "/" + errCodeList.size() + ">");
            System.out.println("　　●No:" + businessMsg.getLogCode() + " errCode:" + errCode + " errNote:" + errNote + " businessMsg:" + businessMsg);
       
           } catch (Exception ex) {
            ex.printStackTrace();
           }
          }
         }
         catch(Exception e)
         {
          e.printStackTrace();
       
          // エラー
          bResult = false;
         }
         return bResult;
        }
       
        /**
         * CtrlMainクラスの標準コンストラクタ
         *
         * @return なし
         */
        public CtrlMain(medAC0060B001 med) throws BatchAppException
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
         * @param なし
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
               //------------------------------------------------------------------
         // 2004/02/17 M.Hotokebuchi
               //------------------------------------------------------------------
         System.out.println("(SBM0837)バッチ処理開始");
         // 共通変数 ========================================================
         IDbConnection conn = null;		// DBコネクション
         BusinessLock Lock = null;		// 業務ロック
         int lockCancelKey = -1;			// ロック解除キー
       
         // バッチ処理共通エラー処理
         String errMsg = "";				// エラーメッセージ
       
         // 夜間バッチかマニュアルか
         int batchProcessingTyp = 0;		// 1: 夜間バッチ（自動運転）2: マニュアル（自動運転なし）
       
         // パラメータ
         String businessName = null;		// 業務名（バッチ処理ID）
         String userId = null;			// ユーザID
         String plantCd = null;			// 工場コード
       
         // 共通処理 ========================================================
         // 業務名（バッチ処理ID）の取得(AC0060B0001)
         Class myClass = this.getClass();
         businessName = myClass.getName();
         businessName = businessName.substring(businessName.length()-19, businessName.length()-9);
       
         // main引数受け取り
         String args[] = m_med.getArgs();
         int argsLength = args.length;   // 引数の個数を保持
       
         try {
          // コネクションの取得
          ScreenParam sp = new ScreenParam(this.getClass());
          conn = m_conductor.m_transactionConn;
       
          // 引数の個数チェック ----------------------------------------------
          if(argsLength != 4)
          {
           // バッチ処理引数の形式が不正です
           userId = "SYSTEM";
           plantCd = "##";
           errCodeList.add("AC10034");
           setErrNote("(SBM0617)バッチ処理引数数：[ " + argsLength + " ]");
           System.out.println("(SBM0838)引数の数が不正です。");
           throw new Exception();
          }
       
          // 引数取得設定 ----------------------------------------------------
          // ユーザコード取得
          userId = args[1];
       
          // 工場コード取得
          plantCd = args[2];
       
          // まるめフラグ取得
          Boolean roundFlg = new Boolean(args[3]);
       
          // 引数内容の「null」チェック（必須項目）---------------------------
          if(userId == null || userId.equals("null") || userId.equals("Null") || userId.equals("NULL"))
          {
           // バッチ処理引数の形式が不正です
           errCodeList.add("AC10034");
           setErrNote("(SBM0619)ユーザコード：[ " + userId + " ]");
           userId = "SYSTEM";
           plantCd = "##";
           System.out.println("(SBM0839)ユーザコードが未入力です。");
           throw new Exception();
          }
          if(plantCd == null || plantCd.equals("null") || plantCd.equals("Null") || plantCd.equals("NULL"))
          {
           // バッチ処理引数の形式が不正です
           errCodeList.add("AC10034");
           setErrNote("(SBM0620)工場コード：[ " + plantCd + " ]");
           userId = "SYSTEM";
           plantCd = "##";
           System.out.println("(SBM0840)工場コードが未入力です。");
           throw new Exception();
          }
       
          // バッチ処理区分取得
          try {
           batchProcessingTyp = Integer.parseInt(args[0]);	
          } catch (NumberFormatException e) {
           batchProcessingTyp = 0;
          }
          if(batchProcessingTyp != 1 && batchProcessingTyp != 2)
          {
           // バッチ処理引数の形式が不正です
           errCodeList.add("AC10034");
           setErrNote("(SBM0621)バッチプロセスタイプ：[ " + batchProcessingTyp + " ]");
           System.out.println("(SBM0841)バッチプロセスタイプが不正です。");
           throw new Exception();
          }
       
          // 業務ロックをかける
          System.out.println("(SBM0842)◎◎◎　業務ロック開始　◎◎◎");
          Lock = new BusinessLock(conn, userId, plantCd);
          lockCancelKey = Lock.doLock(businessName);  // 解除キーの取得
          conn.commit();
          if(lockCancelKey == -1)
          {
           errCodeList.add("ZZ01001");// 業務ロックされているため起動できません
           setErrNote("(SBM0580)ユーザコード：[ " + userId + " ] 工場コード：[ " + plantCd + " ]");
           System.out.println("(SBM0843)業務ロックされているため起動できません。");
           throw new Exception();
          }
       
         ///////////////////////////////////////////////////////////////////
         // OPF専用処理 はじめ
       
          // 総所要量展開処理
          ExtPlanExpProcess extTest = new ExtPlanExpProcess(conn, userId, plantCd, businessName, roundFlg.booleanValue());
          extTest.execute();
       
         // OPF専用処理 おわり
         ///////////////////////////////////////////////////////////////////
       
         } catch (Exception e) {
          e.printStackTrace();
          if(errCodeList.size() == 0)
          {
           // エラーメッセージの作成
           if (e.getMessage() != null)
           {
            errMsg += " " + e.getMessage();
           }
           errMsg += " (SBM0580)ユーザコード：[ " + userId + " ] 工場コード：[ " + plantCd + " ]";
           errCodeList.add("AC53402");//その他　Ｅｒｒｏｒ
           setErrNote(errMsg);
           System.out.println("(SBM0844)その他　Ｅｒｒｏｒ：");
          }
       
         } finally {
       
          // 業務メッセージ登録処理
          businessMessageWrite(conn, userId, plantCd, businessName);
       
          try {
           if(lockCancelKey != -1)
           {
            // 業務ロック解除
            System.out.println("(SBM1344)◎◎◎　業務ロック解除　◎◎◎");
            Lock.doUnLock(businessName, lockCancelKey);
            conn.commit();
           }
       
          } catch (FoundationException e) {
           e.printStackTrace();
           errCodeList.add("ZZ01004");// 業務ロックの解除に失敗しました。
           setErrNote("");
           System.out.println("(SBM0846)業務ロックの解除に失敗しました。");
       
           // 業務メッセージ登録処理
           businessMessageWrite(conn, userId, plantCd, businessName);
          }
         }
         // 共通処理 終わり =============================================
               //------------------------------------------------------------------
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
		public medAC0060B001 m_med=null;

		/**
		 * コンテナクラスインスタンス
		 */
		public ManageContainer m_container=null;

		//////////////////////////////

		public interControl(medAC0060B001 med) throws BatchAppException
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
