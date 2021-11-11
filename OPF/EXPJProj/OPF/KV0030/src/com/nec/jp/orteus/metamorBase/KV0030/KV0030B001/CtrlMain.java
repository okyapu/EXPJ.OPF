/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KV0030/src/com/nec/jp/orteus/metamorBase/KV0030/KV0030B001/CtrlMain.java,v $
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

package com.nec.jp.orteus.metamorBase.KV0030.KV0030B001;

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
import com.nec.jp.orteus.expj.util.ExpjMessage;
import com.nec.jp.orteus.expj.util.Numbering;
import com.nec.jp.orteus.metamorBase.common.WorkDay.WorkCalendar;
//-----------------------------------------------------------------------------
//}}user_implement_dev:import

/**
 * CLASS     : CtrlMain クラス
 * ファイル・クラス説明
 * @author $Author: geng-jia $
 * @version $Revision: 1.11 $ $Date: 2015/12/03 08:57:28 $
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
	public medKV0030B001 m_med=null;

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
	public CtrlMain(medKV0030B001 med, BatchAppConductor cdr) throws BatchAppException
	{
		// メンバ変数を初期化します
		m_conductor = cdr;
		m_med = med;
		m_control = new interControl(med);

		return;
	}

	//{{user_implement_code
        /** 起動引数 */
        private String strBusinessName = null;
        private String strUserId = null;
        private String strPlantCd = null;
        private String strMsgPlantCd = null;
       
        /** DBコネクション */
           private IDbConnection conn = null;
        private String m_vMSG = "";				//ログファイル用メッセージ
       
           // バッチクラス共通エラー処理用
           private String errCode = null;		     // バッチエラーコード
           private String errMsg = null;		     // バッチエラーメッセージ
           private String errNote = "";             // バッチエラーメッセージ(備考) 必要に応じて使用。
         
           // 工場コードとそれに対するロック解除キーの配列を保持するリスト
           private ArrayList plantList = new ArrayList();
         
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
        private void writeLogMessage(String msgCd) throws Exception,BatchAppException
        {
         ExpjMessage am = new ExpjMessage(msgCd);
         CoreTools.write(am.getMessage(CoreTools.getLocale(strUserId)));
         System.out.println(am.getMessage(CoreTools.getLocale(strUserId)));
        }
        /**
         * エラー/警告メッセージログ出力処理(IF情報管理番号埋め込み)
         *
         * @param String メッセージコード
         * @param String IF情報管理番号
         */
        private void writeLogMessage(String msgCd,String if_no) throws Exception,BatchAppException
        {
         AlarmMessage am = new AlarmMessage(msgCd,if_no);
         CoreTools.write(am.getMessage());
         System.out.println(am.getMessage());
        }
        /**
         * エラー/警告メッセージログ出力補助情報(埋め込み)
         *
         * @param String 補助情報名
         * @param String 補助情報値
         */
        private void writeLogMessageInfo(String name,String value) throws Exception,BatchAppException
        {
         AlarmMessage am = new AlarmMessage("AA99991","    " + name,value);
         CoreTools.write(am.getMessage());
         System.out.println(am.getMessage());
        }
           /**
            * metamorBase業務ロックを行う。
            * metamorBase業務ロックには、業務名、ユーザコード、工場コードを必要とする
            *
            * @param conn DBコネクション
            * @param strBusinessName 業務名
            * @param strUserId ユーザコード
            * @return なし
            */
           protected void doBusinessLock(IDbConnection conn,
                                             String strBusinessName,
                                             String strUserId) throws Exception{
                                              
                   for (Iterator it = plantList.iterator(); it.hasNext();) {
                       Object plantData[] = (Object[]) it.next();
                       String plantCd = plantData[0].toString();
                       try {
       
                           BusinessLock lock = new BusinessLock(conn, strUserId, plantCd);
                           int lockCancelKey = lock.doLock(strBusinessName);  // 解除キーの取得
                           conn.commit();
                           if (lockCancelKey == -1) throw new Exception();
       
                           // ロックを保持しておく
                           plantData[1] = lock;
                           plantData[2] = new Integer(lockCancelKey);
                       } catch (Exception e) {
            errCode = "ZZ01001"; // 業務ロックされているため起動できません
            errNote = "(SBM0612)<< 業務ロックかけられない >>";
            this.writeLogMessage(errCode);
            throw e;
                       }
                   }   // -- end of for
           }
           /**
            * metamorBase業務ロック解除を行う。
            * metamorBase業務ロック解除には、業務名、ユーザコード、工場コードを必要とする
            *
            * @param conn DBコネクション
            * @param strBusinessName 業務名
            * @return なし
            */
           protected void releaseBusinessLock(IDbConnection conn,
                                             String strBusinessName) throws Exception{
                                              
                   for (Iterator it = plantList.iterator(); it.hasNext();) {
       
                    Object plantData[] = (Object[]) it.next();
                       String plantCd = plantData[0].toString();
                       if (plantData[1] != null) {
                           BusinessLock lock = (BusinessLock) plantData[1];
                           int lockCancelKey = ((Integer) plantData[2]).intValue();
                           try {
                               // 業務ロック解除
                               //System.out.println("業務ロック解除");
                               lock.doUnLock(strBusinessName, lockCancelKey);
                               conn.commit();
                        } catch (Exception e) {
             errCode = "ZZ01004"; // 業務ロックされているため起動できません
             errNote = "(SBM0613)<< 業務ロック解除できない >>";
             this.writeLogMessage(errCode);
             throw e;
                        }
                       }
                   }   // -- end of for
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
                                             String plantCd) {
       
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
                   // 必要がある。出荷計画Ｉ／Ｆは、業務プログラムでトランザクションを
                   // 意識する必要がないため、メイン処理と同じコネクションに対し都度コミット
                   // する。
                   conn.commit();
               } catch (SQLException e) {
                   errCode = "AC00999"; // SQL実行時エラー。
                setBatchErrorMessage(e);
          e.printStackTrace();
               } catch (Exception e) {
                   errCode = "KV03003";  // その他　Ｅｒｒｏｒ
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
                   errCode = "KV03003";  // その他　Ｅｒｒｏｒ
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
       
        //////////////////////////////
        // コードジェネレータは、以下のコードへの上書きを行いません
       
        /**
         * CtrlMainクラスの標準コンストラクタ
         *
         */
        public CtrlMain(medKV0030B001 med) throws BatchAppException
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
       
         try{
          // 引数受け取り
          String args[] = m_med.getArgs();
          if (args.length < 4 || args.length > 5) {
           throw new Exception();
          }
       
          strUserId = args[1];
          strMsgPlantCd = args[2];
          strBusinessName = args[3];
          if (args.length == 4) {
           strPlantCd = "%";
          } else {
           strPlantCd = args[4];
          }
       
          // パラメータ確認
          //System.out.println(">>>PRG_NAM:" + strBusinessName);	// 業務名
          //System.out.println(">>>USER_ID:" + strUserId);	// ユーザＩＤ
          //System.out.println(">>>USER_PLNT_CD:" + strMsgPlantCd);	// ユーザ工場コード
          //System.out.println(">>>PLNT_CD:" + strPlantCd);	// 工場コード
       
          conn = m_conductor.m_transactionConn;
          
          //出荷計画I/Fバッチの開始メッセージ登録sww20040804追加
          // コネクションを渡して、業務メッセージ準備
          String strMsgCd = "KV03002";
          if(this.getSysMsg(strMsgCd)){
           CoreTools.write(strMsgCd);
          }else{
           throw new Exception();
          }
       
          // コネクションを渡して、業務メッセージ準備
          errCode = "KV03002";
          errNote = "(SBM0614)<< 出荷管理Ｉ／Ｆバッチ処理開始 >>";
          outBusinessMessage(conn, strBusinessName, strUserId, strMsgPlantCd);
       
          CoreTools.write("\n(SBM1249)******>>>> 出荷管理Ｉ／Ｆスタート <<<******");
       //●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●
       //-----------------------------------------------------------------------------
       //		注文IF(EDI)変換処理（ここから）
       //-----------------------------------------------------------------------------
       
          m_med.setSysdate(Converter.dateToStr(new Date(),"yyyy/MM/dd HH:mm:ss"));
          m_med.setUsername(strUserId);
          //=======================================
          // 自社情報コード
          //=======================================
          if(m_med.getreadSYS_MY_COMPANY().read() != SUCCESS){
           errCode = "KV03003";
           errNote = "(SBM0594)<< 致命的なエラー >>";
           throw new Exception();
          }
          if(m_med.getreadSYS_MY_COMPANY().next() == false){
           //自社情報コード取得失敗
           errCode = "KQ00039";
           errNote = "(SBM0597)<< 自社情報の取得に失敗しました >>";
           this.writeLogMessage(errCode);
       //				outBusinessMessage(conn, strBusinessName, strUserId, strMsgPlantCd);
           throw new Exception();
          }
          CoreTools.write("BATCH COMPANY_CD=" + m_med.getCOMPANY_CD());
          //System.out.println("m_med.getCOMPANY_CD()="+m_med.getCOMPANY_CD());
          
          //=======================================
          // 対象工場コード
          //=======================================
          m_med.setinPLANT_CD(strPlantCd);
          if(m_med.getreadM_PLANT().read() != SUCCESS){
           errCode = "KV03003";
           errNote = "(SBM0594)<< 致命的なエラー >>";
           throw new Exception();
          }
          if(m_med.getreadM_PLANT().next() == false){
           //対象工場コード取得失敗
           errCode = "KV03001";
           errNote = "(SBM0595)<< 指定した工場コードは未登録です >>";
           this.writeLogMessage(errCode);
       //				outBusinessMessage(conn, strBusinessName, strUserId, strMsgPlantCd);
           throw new Exception();
          }
       
          do {
                       // 工場コードとロックを格納する配列を用意
                       Object plantData[] = new Object[3];
                       plantData[0] = m_med.getPLANT_CD(); // 工場コードをセット
                       plantData[1] = null;                // ロックオブジェクト格納用
                       plantData[2] = null;                // ロック解除キー格納用
                       // リストに配列を保持
                       plantList.add(plantData);
          } while (m_med.getreadM_PLANT().next() == true);
       
          //=======================================
          // 業務ロック
          //=======================================
                   // 全ての工場について業務ロックをかけておく
                   doBusinessLock(conn, strBusinessName, strUserId);
       
          for (Iterator it = plantList.iterator(); it.hasNext(); ) {
                    // 各工場コードの取得
                       Object plantData[] = (Object[]) it.next();
                       String plantCd = plantData[0].toString();
           CoreTools.write("BATCH PLANT_CD=" + plantCd);
           //System.out.println("m_med.getPLANT_CD()="+plantCd);
           m_med.setPLANT_CD(plantCd);
       
          //=======================================
          // [出荷計画]の対象レコードを抽出する
          //=======================================
           if(m_med.getreadT_ANS_DLV_DATE().read() != SUCCESS){
            errCode = "KV03003";
            errNote = "(SBM0594)<< 致命的なエラー >>";
            throw new Exception();
           }
           while (m_med.getreadT_ANS_DLV_DATE().next() == true) {
       
          //=======================================
          // [出荷計画].”オーダデマンド番号”＝Nullの場合、
          // [所要量]にデマンドを新規登録する
          //=======================================
            if (m_med.getOD_NO() == null) {
             // オーダデマンド番号採番クラスオブジェクト生成
             Numbering MyNo = new Numbering(conn,
                     Numbering.ODNO,
                     strUserId,
                     strBusinessName,
                     m_med.getPLANT_CD()
                     );
             String odNo = MyNo.getNo();
             if (odNo == null || odNo.trim().length() == 0) {
              errCode = "KV03003";
              errNote = "(SBM0594)<< 致命的なエラー >>";
              throw new Exception();
             }
             m_med.setinOD_NO(odNo);
             if(m_med.getinsertT_OD().create() != SUCCESS){
              errCode = "KV03003";
              errNote = "(SBM0594)<< 致命的なエラー >>";
              throw new Exception();
             }
       
          //=======================================
          // 続けて、[出荷計画] を更新する
          //=======================================
             if(m_med.getupdateT_ANS_DLV_DATE().update() != SUCCESS){
              errCode = "KV03003";
              errNote = "(SBM0594)<< 致命的なエラー >>";
              throw new Exception();
             }
       
          //=======================================
          // [出荷計画].”オーダデマンド番号”≠Nullの場合、
          // [所要量]にデマンドを更新する
          //=======================================
            } else {
             if(m_med.getupdateT_OD().update() != SUCCESS){
              errCode = "KV03003";
              errNote = "(SBM0594)<< 致命的なエラー >>";
              throw new Exception();
             }
            }
           }
          //=======================================
          // [所要量]から削除対象のレコードを抽出する
          //=======================================
           if(m_med.getdeleteT_OD().delete() != SUCCESS){
            errCode = "KV03003";
            errNote = "(SBM0594)<< 致命的なエラー >>";
            throw new Exception();
           }
          }
       
       
          //バッチ終了メッセージ登録
          errCode = "KV03004";
          errNote = "(SBM0615)<< 出荷管理Ｉ／Ｆバッチ処理終了 >>";
          outBusinessMessage(conn, strBusinessName, strUserId, strMsgPlantCd);
          conn.commit();
          CoreTools.write("\n(SBM1248)******>>>> 出荷管理Ｉ／Ｆエンド <<<******");
       
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
          
          //出荷計画I/Fバッチの終了メッセージ登録sww20040804追加
          // コネクションを渡して、業務メッセージ準備
          String strMsgCd = "KV03004";
          if(this.getSysMsg(strMsgCd)){
           CoreTools.write(strMsgCd);
          }
          //=======================================
          // 業務ロック
          //=======================================
                   // 全ての工場について業務ロックをかけておく
          try {
                    releaseBusinessLock(conn, strBusinessName);
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
		public medKV0030B001 m_med=null;

		/**
		 * コンテナクラスインスタンス
		 */
		public ManageContainer m_container=null;

		//////////////////////////////

		public interControl(medKV0030B001 med) throws BatchAppException
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
