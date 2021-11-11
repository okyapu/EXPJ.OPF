/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AA0100/src/com/nec/jp/orteus/metamorBase/AA0100/AA0100030Control.java,v $
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
 * EXPJ    (2005/01/31),SRCGEN対応、帳票ツール連携のKIND対応、getFlashTreeXMLのLinux対応、メッセージの多言語対応(MessageStruct)
 * EXPJ    (2004/10/14),user_implement_code_header 内のユーザコーディングを有効にした
 * EXPJ    (2004/08/02),疎結合印刷対応
 * EXPJ    (2004/07/14),サーバ印刷問題点対応
 * EXPJ    (2004/06/28),印刷用のロジックを大幅改訂
 * EXPJ    (2004/06/24),FLASH連携メソッド追加
 * EXPJ    (2004/04/15),印刷時のプリンタ名、フォルダ・ファイル名の空白対応
 * EXPJ    (2004/04/09),メソッド名修正 "getLabel"->"getlabel"
 * EXPJ    (2004/04/06),Printメソッドの再検索・選択行印刷対応
 * EXPJ    (2004/04/05),メソッドコメントの「* @param なし」をすべて削除
 * EXPJ    (2004/04/01),user_imprement内のコメントに変更していたconn.beginTransWeb();をuser_imprement外の必須処理として復活
 * EXPJ    (2004/03/31),Printメソッドのnull文字出力対応
 * EXPJ    (2004/03/30),インポートを一部修正(printを削除,exceptionを追加）
 * EXPJ    (2004/03/20),レビュー結果を反映
 * EXPJ    (2004/03/13),送信元ボタンアクセサ追加
 * EXPJ    (2004/03/09),Printメソッドの修正不要な部分をユーザ記述部の外に移動
 * EXPJ    (2004/03/04),メッセージ系部品改造対応
 * EXPJ    (2004/03/03),履歴を修正
 *                     ,FLASH画面用メソッドgetReadStsStringを追加
 *                     ,メソッドコメントの「* @return なし」をすべて削除
 *                     ,CsvOutメソッドの処理を追加
 *                     ,Printメソッドの処理をEXPLANNER/J用に改造
 * EXPJ    (2004/03/02),EXPLANNER/J用に改造
 * 4.0.1.3 (2004/12/02),送信キー・受信キーを設定するメソッドを新設 (setOrMsgKey, getOrMsgKey)
 * 4.0.1.2 (2004/11/15),帳票ツール連携のKIND対応
 * 4.0.1.1 (2004/06/16),帳票ツール連携のevent-option対応
 * 4.0.1.0 (2004/08/02),TRUST-Vプロジェクトのフィードバック（ページ制御部品対応）
 * 4.0.0.9 (2004/05/24),ダウンロード対応を追加。event-type=print,downloadが複数ある場合に対応
 * 4.0.0.8 (2004/05/21),connect()の処理判定を追加
 * 4.0.0.7 (2004/04/19),event-type対応
 * 4.0.0.6 (2004/04/12),FlashTree用メソッドに引数追加、帳票出力オブジェクトNULL時処理を変更
 * 4.0.0.5 (2004/02/23),帳票用アクセサメソッド追加
 * 4.0.0.4 (2004/02/17),FlashTree対応を追加
 * 4.0.0.3 (2004/01/23),帳票ツール連携用コードを追加
 * 4.0.0.2 (2003/09/08),ManageContainerの取得方法を修正
 * 4.0.0.1 (2003/06/05),javadocコメントエラー修正
 * 4.0.0.0 (2003/04/23),クラス名標準化対応
 * 3.0.0.0 (2003/03/19),mgrContainerコンストラクタ修正
 * 2.1.0.0 (2002/12/17),User OwnCode部ロギング追加,LoggingPackage修正
 * 2.0.0.1 (2002/07/05),Connection対応
 * 2.0.0.0 (2002/05/27),new foundation対応
 *
 */

package com.nec.jp.orteus.metamorBase.AA0100;

import com.nec.jp.orteus.metamorBase.AA0100.*;
import com.nec.jp.orteus.util.*;
import com.nec.jp.orteus.msg.util.*;
import com.nec.jp.orteus.msg.core.*;

import com.nec.jp.orteus.xaf.foundation.*;
import com.nec.jp.orteus.xaf.util.*;
import com.nec.jp.orteus.xaf.wa.*;

import com.nec.jp.orteus.util.logging.*;

import java.rmi.RemoteException;
import java.util.Date;
import java.util.*;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.lang.reflect.*;

import com.nec.jp.orteus.expj.util.*;
import com.nec.jp.orteus.expj.exception.*;
import com.nec.jp.orteus.expj.combobox.*;
import com.nec.jp.orteus.expj.systemlog.*;
import com.nec.jp.orteus.expj.businesslock.*;
import com.nec.jp.orteus.expj.file.*;
import com.nec.jp.orteus.expj.csv.*;
import com.nec.jp.orteus.expj.util.MessageStruct;

//{{user_implement_code_import
//------------------------------------------------------------------------------
import java.util.ArrayList;
import com.nec.jp.orteus.metamorBase.util.AlarmMessage.AlarmMessageException;
//------------------------------------------------------------------------------
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AA0100030Control
{

	//////////////////////////////
	// アクセサメソッド等を定義します
	// Businessオブジェクトアクセサメソッド
	private Business business;
	public Business getBusiness() { return this.business; }
	public void setBusiness( Business obj ) { this.business = obj; }

	/** システム使用のユーザコード */
	protected String sysUSER_CD;
	public void setsysUSER_CD(String name) { this.sysUSER_CD = name; };
	public String getsysUSER_CD() { return this.sysUSER_CD; };

	/** システム使用の工場コード */
	protected String sysPLANT_CD;
	public void setsysPLANT_CD(String name) { this.sysPLANT_CD = name; };
	public String getsysPLANT_CD() { return this.sysPLANT_CD; };

	/** システム使用のユーザ名 */
	protected String sysUSER_NAME;
	public void setsysUSER_NAME(String name) { this.sysUSER_NAME = name; };
	public String getsysUSER_NAME() { return this.sysUSER_NAME; };

	/** システム使用の工場名 */
	protected String sysPLANT_NAME;
	public void setsysPLANT_NAME(String name) { this.sysPLANT_NAME = name; };
	public String getsysPLANT_NAME() { return this.sysPLANT_NAME; };

	/** 画面遷移フラグ */
	private boolean screenMoveFlg;
	public void setScreenMoveFlg(boolean flg){ this.screenMoveFlg = flg; };
	public boolean isScreenMove(){ return this.screenMoveFlg; };

	/** 送信元画面ID */
	private String submitScreen;
	public void setScreenId(String ScreenId){ this.submitScreen = ScreenId; };
	public String getScreenId(){ return this.submitScreen; };

	/** 送信元プログラムID */
	private String submitProgram;
	public void setProgramId(String ProgramId){ this.submitProgram = ProgramId; };
	public String getProgramId(){ return this.submitProgram; };

	/** 送信元ボタン */
	private String submitButton;
	public void setButton(String Button){ this.submitButton = Button; };
	public String getButton(){ return this.submitButton; };

	/** 押下ボタン種別 */
	private String submitButtonType;
	public void setButtonType(String ButtonType){ this.submitButtonType = ButtonType; };
	public String getButtonType(){ return this.submitButtonType; };

	/** 新規画面フラグ */
	private boolean newScreenFlg;
	public void setNewScreenFlg(boolean flg){ this.newScreenFlg = flg; };
	public boolean isNewScreen(){ return this.newScreenFlg; };

	/** 新規データフラグ */
	private boolean newDataFlg;
	public void setNewDataFlg(boolean flg){ this.newDataFlg = flg; };
	public boolean isNewData(){ return this.newDataFlg; };


	/** 状態制御 */
	private int readStatus = INITIAL;
		/** 読込失敗 */
		static final public int ERROR = -1;
		/** 初期状態 */
		static final public int INITIAL = 0;
		/** ０件読込 */
		static final public int NOT_FOUND = 1;
		/** 最大行数オーバー */
		static final public int TOO_MANY = 2;
		/** 読込成功 */
		static final public int NORMAL = 3;
	public void setReadStatus(int ReadStatus) { readStatus = ReadStatus; }
	public int getReadStatus() { return readStatus; }
	public String getReadStatusString() {
		if (this.readStatus == NORMAL) {
			return "NORMAL"; 
		}
		else if (this.readStatus == TOO_MANY) {
			return "TOO_MANY"; 
		}
		else if (this.readStatus == NOT_FOUND) {
			return "NOT_FOUND"; 
		}
		else if (this.readStatus == ERROR) {
			return "ERROR"; 
		}
		else {
			return "INITIAL"; 
		}
	}
	public boolean isError(){ return (this.readStatus == ERROR); }
	public boolean isInitialized() { return (this.readStatus != ERROR); }
	public boolean isSelected() { return (this.readStatus > NOT_FOUND); }
	public boolean hasRecord() { return (this.readStatus > INITIAL); }
	public boolean isShown() { return (this.readStatus > TOO_MANY); }
	public boolean canAppend() { return ((this.readStatus == NOT_FOUND) || (this.readStatus == NORMAL) ); }

	/** 帳票出力タイプ */
	private String pdfOutputType;
	public void setPdfOutputType(String PdfOutputType){ this.pdfOutputType = PdfOutputType; };
	public String getPdfOutputType(){ return this.pdfOutputType; };

	/** 帳票出力先 */
	private String pdfOutputPrinter;
	public void setPdfOutputPrinter(String PdfOutputPrinter){ this.pdfOutputPrinter = PdfOutputPrinter; };
	public String getPdfOutputPrinter(){ return this.pdfOutputPrinter; };

	/** 帳票出力リストパターン */
	private String pdfOutputListPattern;
	public void setPdfOutputListPattern(String PdfOutputListPattern){ this.pdfOutputListPattern = PdfOutputListPattern; };
	public String getPdfOutputListPattern(){ return this.pdfOutputListPattern; };

	/** 帳票出力リスト行 */
	private String[] pdfOutputListLine;
	public void setPdfOutputListLine(String[] PdfOutputListLine){ this.pdfOutputListLine = PdfOutputListLine; };
	public String[] getPdfOutputListLine(){ return this.pdfOutputListLine; };

	protected SystemLog sysLog = null;
	protected boolean logInit = false;

	/** メッセージストラクト */
	private MessageStruct msgStruct = null;
	public MessageStruct getMsgStruct(){ return this.msgStruct;}

	/**
	 * メッセージストラクト作成（多言語対応）
	 */
	public void createMsgStruct() {
		msgStruct = new MessageStruct(getsysUSER_CD(), false);
	}

	protected ScreenParam sp = null;

	private BusinessLock bLock = null;
	private String cancelId = "0";

	public boolean doUnBusinessLock() {
		//ここではExceptionをもみ消す
		boolean doUnLock = false;
		try {
			bLock = new BusinessLock(conn, getsysUSER_CD(), getsysPLANT_CD());
			doUnLock = bLock.doUnLock(this.sp.getProcId(),Integer.parseInt(cancelId));
			if(!doUnLock){
				//業務ロック解除失敗
				throw new ExpjException("ZZ01004");
			}
		} catch ( Exception e ) {
			sysLog.severe("ZZ01004",getsysUSER_CD());//ロック解除失敗
		}
		return doUnLock;
	}
	//{{user_implement_code_main
        // デフォルトアクセサメソッド
        protected List list;											// 結果リストのインスタンス
        public List getList() { return this.list; } 					// リストを返します。
        public void setList(List listname) { this.list = listname; }	// リストをセットします。
        public int getListsize() {										// リスト型のサイズを返します。
         int nret = 0;
         if( this.list != null ) {nret = this.list.size();}
         return nret;
        }
        public Object getListvalue(int x) { return this.list.get(x); }	// リストの値（メディエータ）を返します。
       
        public AA0100030Struct getStruct() { return this.struct; }	// Structの値（メディエータ）を返します。
       
        //------------------------------------------------------------------------------
       
        /**
         * メッセージ取得	
         * @return メッセージ
         */
        public MessageStruct getMessage()
        {
         return msgStruct;
        }
       
        /**
         * メッセージ設定
         * @param メッセージ
         */
        public void setMessage(MessageStruct msg)
        {
         msgStruct = msg;
        }
       
        /** デバッグ用メッセージ作成用変数 */
        private String _debugMsg = "";
       
        //------------------------------------------------------------------------------
       
        /** 端数区分 */
        private ComboStruct _ROUND_TYP = new ComboStruct();
       
        /**端数区分設定
         * @param コンボボックスデータ
        */
        public void setROUND_TYP(ComboStruct combo){ _ROUND_TYP = combo; }
       
        /** 端数区分取得
         * @return 端数区分のコンボボックスデータ
        */
        public ComboStruct getROUND_TYP(){ return _ROUND_TYP; }
       
        //------------------------------------------------------------------------------
       
        /** メイン画面Struct情報格納用 */
        private AA0100030Struct _main_struct = null;
       
        /** メイン画面Struct情報取得 */
        public AA0100030Struct getMainStruct() { return _main_struct; }
       
        //------------------------------------------------------------------------------
       
        /** 画面共通定義取得クラス */
        ScreenParam _scParam = sp;
        //------------------------------------------------------------------------------
       
        /**
         * SQLExceptionエラーメッセージ設定
         * @param SQLException
         * @param 出力エラーメッセージ
         */
        private void setSqlExceptionMsg(SQLException e) throws ExpjException
        {
          ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
          sysLog.severe(emsg, getsysUSER_CD());
          ExpjException ee = new ExpjException(e, emsg);
       
          throw ee;
        }
       
         
        /**
         * エラーメッセージ設定
         * @param メッセージ番号
         * @param 出力メッセージ
         */
        private void setErrorMessage(String messageno, String message)
        {
         ExpjMessage emsg = new ExpjMessage( messageno );
         msgStruct.addError( emsg );
         sysLog.warning(emsg, getsysUSER_CD());
         emsg = new ExpjMessage( "ZZ01006", message );
         msgStruct.addError( emsg );
         sysLog.warning(emsg, getsysUSER_CD());
        }
       
        /**
         * エラーメッセージ設定
         * @param メッセージ番号
         * @param 出力メッセージ(List)
         */
        private void setErrorMessage(String messageno, List message)
        {
         ExpjMessage emsg = new ExpjMessage( messageno );
         msgStruct.addError( emsg );
         sysLog.warning(emsg, getsysUSER_CD());
         
         for(int i=0; i<message.size(); i++)
         {
          emsg = new ExpjMessage( "ZZ01006", (String)message.get(i) );
          msgStruct.addError( emsg );
          sysLog.warning(emsg, getsysUSER_CD());
         }
        }
        
        /**
         * 警告メッセージ設定
         * @param メッセージ番号
         * @param 出力メッセージ
         */
        private void setWarnMessage(String messageno, String message)
        {
         ExpjMessage emsg = new ExpjMessage( messageno );
         msgStruct.addWarn( emsg );
         sysLog.info(emsg, getsysUSER_CD());
        }
         
        /**
         * 情報メッセージ設定
         * @param メッセージ番号
         * @param 出力メッセージ
         */
        private void setInfoMessage(String messageno, String message)
        {
         ExpjMessage emsg = new ExpjMessage( messageno );
         msgStruct.addInfo( emsg );
         sysLog.config(emsg, getsysUSER_CD());
        }
        //------------------------------------------------------------------------------
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * 読込ボタン押下時に実行される処理です。
	 *
	 */
	public void controlselect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0100");
		logger.entering("AA0100030Control"+":USER="+struct.getsUser_ID(),"controlselect");
			//{{user_implement_dev:<controlselect>
                //------------------------------------------------------------------------------
                 
                String Message = "";
                 
                try {
                 // 読込実行
              
                 List temp_list = new ArrayList(0);
                 AA0100030Struct temp_struct = new AA0100030Struct();
                 temp_list = entity.mselect.read(conn, struct);
              
                 if(temp_list.size() > 0){
                  // 読込データ取得
                  temp_struct = (AA0100030Struct)temp_list.get(0);
                  _main_struct.copy(temp_struct);
                 }else{
                  // 読込処理失敗：消費税区分マスタに消費税コードが存在しません
                  Message = "M_TAX.TAX_CD:" + struct.getTAX_CD();
                  
                  setErrorMessage("ZZ01101", Message);
              
                  // データが存在しない場合のクリア処理
                  String w_taxCd = struct.getTAX_CD();	// キー情報の退避
                  this.struct.initialize();					// 表示項目をデフォルトに戻す
                  struct.setTAX_CD(w_taxCd);				// キー情報の設定
              
                  // 検索状態を「初期状態」に設定
                  setReadStatus(INITIAL);
              
                  _main_struct.initialize();
                 }
              
                 // エラーがない場合、処理実行
                 if(msgStruct.sizeError() <= 0){
                  // 読込データを画面表示用Structへ設定
                  struct.copy(_main_struct);
              
                  // 検索状態を「読込成功」に設定
                  setReadStatus(NORMAL);
                 }
              
                } catch(SQLException e) {
              
                 // 検索状態を「読込失敗」に設定
                 setReadStatus(ERROR);
              
                 setSqlExceptionMsg(e);
                }
              
                //------------------------------------------------------------------------------
                //}}user_implement_dev:<controlselect>
		logger.exiting("AA0100030Control"+":USER="+struct.getsUser_ID(),"controlselect");

		return;
	}

	/**
	 * 登録ボタン押下時に実行される処理です。
	 *
	 */
	public void controlinsert() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0100");
		logger.entering("AA0100030Control"+":USER="+struct.getsUser_ID(),"controlinsert");
			//{{user_implement_dev:<controlinsert>
                //------------------------------------------------------------------
                 
                String Message = "";
                 
                try {
                 // 対象データ存在チェック
                 List temp_list = new ArrayList(0);
                 temp_list = entity.mselect.read(conn, struct);
              
                 if(temp_list.size() > 0){
                  // 登録処理失敗：消費税区分マスタに消費税コードが既に存在しています
                  Message = "M_TAX.TAX_CD:" + struct.getTAX_CD();
                  
                  // 検索状態を「初期状態」に設定
                  setReadStatus(INITIAL);
              
                  setErrorMessage("ZZ01102", Message);
                 }
              
                 // エラーがない場合、処理実行
                 if(msgStruct.sizeError() <= 0){
                  // 登録処理
                  int nRet = entity.minsertM_TAX.create(conn, struct);
              
                  // 読込処理
                  controlselect();
              
                  // 検索状態を「読込成功」に設定
                  setReadStatus(NORMAL);
                 }
              
                }catch(SQLException e) {
                 setSqlExceptionMsg(e);
              
                 // 検索状態を「読込失敗」に設定
                 setReadStatus(ERROR);
                }
              
                //------------------------------------------------------------------
                //}}user_implement_dev:<controlinsert>
		logger.exiting("AA0100030Control"+":USER="+struct.getsUser_ID(),"controlinsert");

		return;
	}

	/**
	 * 更新ボタン押下時に実行される処理です。
	 *
	 */
	public void controlupdate() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0100");
		logger.entering("AA0100030Control"+":USER="+struct.getsUser_ID(),"controlupdate");
			//{{user_implement_dev:<controlupdate>
                //------------------------------------------------------------------
                boolean transFlg = false;
                String Message = "";
              
                try {
                 // トランザクション開始
                 conn.beginTransWeb();
                 transFlg = true;
              
                 // 処理対象データの存在チェック
                 List temp_list = new ArrayList(0);
                 AA0100030Struct temp_struct = new AA0100030Struct();
                 temp_list = entity.mcheckMODIFY_COUNT.read(conn, struct);
              
                 if(temp_list.size() <= 0){
                  // 更新処理失敗：更新対象のレコードが存在しません
                  Message = "M_TAX.TAX_CD:" + struct.getTAX_CD();
                  
                  setErrorMessage("ZZ06001", Message);
                 }else{
                  // レコードが更新されていないかチェック
                  temp_struct = (AA0100030Struct)temp_list.get(0);
                  if(temp_struct.getw_MODIFY_COUNT().equals(struct.getw_MODIFY_COUNT()) != true){
                   // 更新処理失敗：既にレコードが更新されていました
                   Message = "M_TAX.TAX_CD:" + struct.getTAX_CD();
                   
                   setErrorMessage("ZZ01105", Message);
                  }
                 }
                 
                 // エラーがない場合、処理実行
                 if(msgStruct.sizeError() <= 0){
                  // 更新実行
                  entity.mupdateM_TAX.update(conn, struct);
              
                  // コミット
                  conn.commit();
                  transFlg = false;
              
                  // 読込実行
                  controlselect();
              
                 }
              
                } catch(SQLException e) {
                 setSqlExceptionMsg(e);
              
                }finally{
                 try {
                  if(transFlg == true){
                   // ロールバック
                   conn.rollback();
                  }
              
                 } catch(Exception e) {
                  e.printStackTrace();
                 }
                }
              
                //------------------------------------------------------------------
                //}}user_implement_dev:<controlupdate>
		logger.exiting("AA0100030Control"+":USER="+struct.getsUser_ID(),"controlupdate");

		return;
	}

	/**
	 * 削除ボタン押下時に実行される処理です。
	 *
	 */
	public void controldelete() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0100");
		logger.entering("AA0100030Control"+":USER="+struct.getsUser_ID(),"controldelete");
			//{{user_implement_dev:<controldelete>
                //------------------------------------------------------------------
                boolean transFlg = false;
                String Message = "";
              
                try {
                 // トランザクション開始
                 conn.beginTransWeb();
                 transFlg = true;
              
                 // 対象データ存在チェック
                 List temp_list = new ArrayList(0);
                 temp_list = entity.mselect.read(conn, struct);
              
                 if(temp_list.size() <= 0){
                  // 削除処理失敗：削除対象のレコードが存在しません
                  Message = "M_TAX.TAX_CD:" + struct.getTAX_CD();
                  
                  setErrorMessage("ZZ06001", Message);
                 }
              
                 // テーブル上のMODIFY_COUNTカウント、リストのMODIFY_COUNTを取得
                 List modifylist = new ArrayList(0);
                 AA0100030Struct modifyStruct = new AA0100030Struct();
              
                 modifylist = entity.mcheckMODIFY_COUNT.read(conn, struct);
                 if( modifylist.size() > 0 ){
                  modifyStruct = (AA0100030Struct)modifylist.get(0);
              
                  // レコードが更新されていないかチェック
                  if(modifyStruct.getw_MODIFY_COUNT().equals(struct.getw_MODIFY_COUNT()) != true){
                   // 削除処理失敗：既にレコードが更新されていました
                   Message = "M_TAX.TAX_CD:" + struct.getTAX_CD();
                   
                   setErrorMessage("ZZ01105", Message);
                  }
                 }
              
                 // 消費税コード（品目テーブル）存在チェック
                 int count = 0;
                 temp_list = entity.mcheckM_ITEM.read(conn, struct);
                 count = ((AA0100030Struct)temp_list.get(0)).getw_COUNT().intValue();
              
                 if(count > 0){
                  // 削除処理失敗：整合性制約違反[品目]
                  Message = "M_ITEM.TAX_CD:" + struct.getTAX_CD();
                  
                  setErrorMessage("AA00114", Message);
                 }
              
                 // 消費税コード（取引先マスタテーブル）存在チェック
                 temp_list = entity.mcheckM_VEND_CTRL.read(conn, struct);
                 count = ((AA0100030Struct)temp_list.get(0)).getw_COUNT().intValue();
              
                 if(count > 0){
                  // 削除処理失敗：整合性制約違反[取引先]
                  Message = "M_VEND_CTRL.TAX_CD:" + struct.getTAX_CD();
                  
                  setErrorMessage("AA00115", Message);
                 }
              
                 // 消費税コード（受入実績テーブル）存在チェック
                 temp_list = entity.mcheckT_ACPT_RSLT.read(conn, struct);
                 count = ((AA0100030Struct)temp_list.get(0)).getw_COUNT().intValue();
              
                 if(count > 0){
                  // 削除処理失敗：整合性制約違反[受入実績]
                  Message = "T_ACPT_RSLT.TAX_CD:" + struct.getTAX_CD();
                  
                  setErrorMessage("AA00116", Message);
                 }
              
                 // 消費税コード（発注残テーブル）存在チェック
                 temp_list = entity.mcheckT_RLSD_PUCH_ODR.read(conn, struct);
                 count = ((AA0100030Struct)temp_list.get(0)).getw_COUNT().intValue();
              
                 if(count > 0){
                  // 削除処理失敗：整合性制約違反[発注残]
                  Message = "T_RLSD_PUCH_ODR.TAX_CD:" + struct.getTAX_CD();
                  
                  setErrorMessage("AA00117", Message);
                 }

                 // 消費税コード（購入返品実績）存在チェック
                 temp_list = entity.mcheckT_PUCH_ODR_RTN_RSLT.read(conn, struct);
                 count = ((AA0100030Struct)temp_list.get(0)).getw_COUNT().intValue();
              
                 if(count > 0){
                  // 削除処理失敗：整合性制約違反[購入返品実績]
                  Message = "T_PUCH_ODR_RTN_RSLT.TAX_CD:" + struct.getTAX_CD();
                  
                  setErrorMessage("AA01000", Message);
                 }

                 //消費税コード（得意先）存在チェック
                 temp_list = entity.mcheckM_CUST.read(conn, struct);
                 count = ((AA0100030Struct)temp_list.get(0)).getw_COUNT().intValue();
                 
                 if(count > 0) {
                	 // 削除処理失敗：整合性制約違反[得意先]
                	 Message = "M_CUST.TAX_CD:" + struct.getTAX_CD();
                	 
                	 setErrorMessage("AA00175", Message);
                 }
              
                 // エラーがない場合、処理実行
                 if(msgStruct.sizeError() <= 0)
                 {
                  // 削除実行
                  int nRet = entity.mdeleteM_TAX.delete(conn, struct);
              
                  // クリア処理
                  controlclear();
                 }
              
                 // コミット
                 conn.commit();
                 transFlg = false;
              
                } catch(SQLException e) {
                 setSqlExceptionMsg(e);
              
                }finally{
                 try {
                  if(transFlg == true){
                   // ロールバック
                   conn.rollback();
                  }
              
                 } catch(Exception e) {
                  e.printStackTrace();
                 }
                }
              
                //------------------------------------------------------------------
                //}}user_implement_dev:<controldelete>
		logger.exiting("AA0100030Control"+":USER="+struct.getsUser_ID(),"controldelete");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlclear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0100");
		logger.entering("AA0100030Control"+":USER="+struct.getsUser_ID(),"controlclear");
			//{{user_implement_dev:<controlclear>
                //------------------------------------------------------------------
              
                // struct初期化
                this.struct.initialize();
                _main_struct.initialize();
              
                // 検索状態を「初期状態」に設定
                setReadStatus(INITIAL);
              
                //------------------------------------------------------------------
                //}}user_implement_dev:<controlclear>
		logger.exiting("AA0100030Control"+":USER="+struct.getsUser_ID(),"controlclear");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0100");
		logger.entering("AA0100030Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AA0100030Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0100");
		logger.entering("AA0100030Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
                //------------------------------------------------------------------
                 
                try {
              
                 // クリア処理
                 controlclear();
              
                 // コンボボックスデータ用意
                 ComboBox controller = new ComboBox(conn, sysUSER_CD);
                 _ROUND_TYP = controller.getData("ROUND_TYP");
              
                }catch(SQLException e) {
                 setSqlExceptionMsg(e);
              
                }catch(ComboException e){
                  ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
                  sysLog.severe(emsg, getsysUSER_CD());
                  ExpjException ee = new ExpjException(e, emsg);
                  
                  throw ee;
                 
                }
              
                //------------------------------------------------------------------
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AA0100030Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * イベントハンドラの前処理です。
	 *
	 * @param buttun ボタン名
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0100");
		logger.entering("AA0100030Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

		this.msgStruct.clearAll();
		setNewDataFlg(true);
		this.sp = new ScreenParam(this.getClass());

		if (sysLog == null ) {
			sysLog = new SystemLog();
			logInit = sysLog.init(this.sp.getLogId());
			if(!logInit){
				//システムログの初期化に失敗しました
				ExpjException ee = new ExpjException("ZZ01005");
				throw ee;
			}
		}

//		if(logInit){
//			sysLog.setConnection(conn);
//		}

		//画面URL直接指定起動の禁止
		try{
			if(ScreenPermission.isUseful(conn, getsysUSER_CD(), this.sp.getProcId()) == false) {
				throw new Exception();
			}
		}catch(Exception e){
			//この機能の使用権限がありません。
			ExpjException ee = new ExpjException(e, "ZZ01002");
			throw ee;
		}

		if( !( "initial".equals(button) ) && ( "1".equals(getButtonType()) ) ) {
			//業務ロック実行処理
			bLock = new BusinessLock(conn,getsysUSER_CD(),getsysPLANT_CD());
			int id = bLock.doLock(this.sp.getProcId());
			this.cancelId = "" + id;
			if(id == -1){
				//業務ロックされている
				ExpjMessage emsg = new ExpjMessage("ZZ01001");
				msgStruct.addError(emsg);
				sysLog.warning(emsg, getsysUSER_CD());
				List messageParameter = bLock.getLockingInfo();
				if(messageParameter != null) {
					int parameterSize = messageParameter.size();
					for(int i = 0; i < parameterSize; i++ ) {
						emsg = new ExpjMessage("ZZ01007", (String[])messageParameter.get(i));
						msgStruct.addError(emsg);
						sysLog.warning(emsg, getsysUSER_CD());
					}
				}
				BusinessLockException ble = new BusinessLockException();
				throw ble;
			}
		}

			conn.beginTransWeb();

		//{{user_implement_dev:<controlPREPARATION>
                 // ダウンロードファイル名クリア
                 // PDF・CSVのダウンロードを行うときは、画面上にOrHiddenで「DOWNLOAD_FILE」を定義し、次の行のコメントを外してください。
              //			struct.setDOWNLOAD_FILE((String)null);
                 // コンボボックス部品のデータのセットはここに記述してください。
                 // コンボボックスデータ用意
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("AA0100030Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

		return;
	}

	/**
	 * ボタンが押された場合のイベントハンドラ
	 *
	 * @param buttun ボタン名
	 */
	public void control_eventHandller(String button) throws BusinessProcessException, FoundationException {

		try {
			controlPREPARATION(button);
			if( button.equals("select") ) {
				controlselect();
			} else if( button.equals("insert") ) {
				controlinsert();
			} else if( button.equals("update") ) {
				controlupdate();
			} else if( button.equals("delete") ) {
				controldelete();
			} else if( button.equals("clear") ) {
				controlclear();
			} else if( button.equals("initial") ) {
				controlINITIAL();
			} else if( button.equals("reload") ) {
				controlRELOAD();
			}
		//{{user_implement_dev:<control_eventHandller>
                //---------------------------------------------------------------------
                // コンボボックスデータ設定
                struct.setList_ROUND_TYP_val(_ROUND_TYP.getValList());
                struct.setList_ROUND_TYP_name(_ROUND_TYP.getExplanList());
                
                } catch(AlarmMessageException ame){
                 ExpjException ee = new ExpjException(ame, (ExpjMessageList)((Object)ame.getMessages()));
                 throw ee;
                //---------------------------------------------------------------------
                //}}user_implement_dev:<control_eventHandller>
		} catch( BusinessLockException ble ) {
			// 枠メッセージ出力依頼作成
			setNewDataFlg(false);
		} catch( ResourceBusyException rbe ) {
			ExpjException ee = new ExpjException(rbe, "ZZ01105");
			throw ee;
		} catch( FoundationException e ) {
//			e.printStackTrace();
//			throw new FoundationException("AA0100030Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		} finally {
			if( !( "initial".equals(button) ) && ( "1".equals(getButtonType()) ) && (Integer.parseInt(cancelId) >= 0) ) {
				//ロック解除
				this.doUnBusinessLock();
			}
		}

		return;
	}

	//////////////////////////////


	//////////////////////////////

	/**
	 * CSV出力メソッド
	 *
	 * @param list テーブル列項目リストインスタンス
	 */
	public void createDefaultCSV(List list, String sTitle[]) throws BusinessProcessException, FoundationException {

		try {
			// ManageContainer オブジェクトを新規に生成するのをやめた。
			// Singletonで持っているオブジェクトを使用するように変更。
			// 2003.09.08 m-kasai
			//ManageContainer container = new ManageContainer(AppServerResources.getInstance());
			entity.mei_CSVOut.setPath(CoreTools.getContainer().getString("webroot")+"/csv/");
			entity.mei_CSVOut.setFname(entity.mei_CSVOut.m_ProjName
										+(struct.getsUser_ID() == null ? "" : "_"+struct.getsUser_ID())
										+(struct.getsSysdate() == null ? "" : "_"+struct.getsSysdate().substring(0,4)
																				 +struct.getsSysdate().substring(5,7)
																				 +struct.getsSysdate().substring(8,10)
																				 +struct.getsSysdate().substring(11,13)
																				 +struct.getsSysdate().substring(14,16)
																				 +struct.getsSysdate().substring(17,19))
										+".csv");
			entity.mei_CSVOut.create(list, sTitle);
		//{{user_implement_dev:<createDefaultCSV>
                //}}user_implement_dev:<createDefaultCSV>
		} catch( FoundationException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AA0100030-E999","CSVの出力処理"));
			throw new FoundationException("AA0100030Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
		}

		return;
	}

	/**
	 * システム日付取得メソッド
	 *
	 */
	public void beginTransaction() throws BusinessProcessException, FoundationException {
		String sToday = "";

		if(conn == null) { CoreTools.getTransConnection(); }

		try {
			if((sToday = entity.mei_Sysdate.read(conn))==null) {
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AA0100030-E999","システム日付の取得処理"));
				throw new FoundationException("AA0100030Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AA0100030-E999","コントロールのイベント処理"));
			throw new FoundationException("AA0100030Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected AA0100030Entity entity;
	protected AA0100030Struct struct;
	protected IDbConnection conn;

	/**
	 * ログ部品インスタンス
	 */
	public DisplayMessageUtil objMessage = new DisplayMessageUtil();
	public void setUsrId(String username) {objMessage.m_writer.setUserID(username);}	// ユーザIDをセットします。

	/**
	 * メンバ変数を初期化します
	 *
	 */
	public void initialize() throws FoundationException
	{
		conn = null;
		entity = null;
		struct = null;

		entity = new AA0100030Entity();
		struct = new AA0100030Struct();

		return;
	}

	/**
	 * 接続処理を行います。
	 *
	 * @return IDbConnection
	 */
	public IDbConnection connect() throws FoundationException
	{
		// DB接続処理を行います。
		if( conn == null || conn.getConn() == null) {
			conn = CoreTools.getTransConnection();
		}
		return conn;
	}

	/**
	 * 切断処理を行います。
	 *
	 */
	public void disconnect(IDbConnection connect) throws FoundationException
	{
		// セッションの切断処理を行います。
		if( connect != null ) {
			connect.commit();
			CoreTools.closeTransConnection(connect);
			connect = null;
		}
		return;
	}
	//////////////////////////////

	/**
	 * AA0100030クラスの標準コンストラクタ
	 */
	public AA0100030Control() throws BusinessProcessException, FoundationException
	{
		initialize();

		//conn = connect();
		//{{user_implement_code_constractor
                //------------------------------------------------------------------
                // 2003/09/09 M.Isoda
                //------------------------------------------------------------------
                _main_struct = new AA0100030Struct();
                //------------------------------------------------------------------
                //}}user_implement_code_constractor

		return;
	}

	/**
	 * インスタンス破壊時に行う処理
	 *
	 */
	protected void finalize() throws FoundationException
	{
		//{{user_implement_dev:control_destractor
                //}}user_implement_dev:control_destractor

		objMessage = null;

		return;
	}

	//////////////////////////////

	//////////////////////////////
	//  画面遷移結合　関連メソッド

	//////////////////////////////
	// 送信キーを設定	
	public void setOrMsgKey(List keyList) throws MessageApiException {

		// 日付変換用
		SimpleDateFormat sdf = new SimpleDateFormat();

		ArrayList msgKeyTypeArray = business.getMessageKeyType(Business.MSGKEY_TYPE_CAN_SEND); //業務が送信可能なメッセージキーの場合
		ArrayList msgKeyArray = new ArrayList();

		for (int i = 0; msgKeyTypeArray != null && i < msgKeyTypeArray.size(); i++) {
			// メッセージキーの種類の数だけ繰り返し	
			MessageKeyType msgKeyType = (MessageKeyType)msgKeyTypeArray.get(i);

			// メッセージキーのテーブル名	
			String tableName = msgKeyType.getTableName();

			// メッセージキーのキーカラム名リスト	
			// 複合キーの場合、keyColumnNameの配列数が２以上となる
			String [] keyColumnName = msgKeyType.getKeyColumnName();
			for(int j = 0; j < keyList.size(); j++) {
				AA0100030Struct key = (AA0100030Struct)keyList.get(j);
				// メッセージキーを作成する
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("ROUND_TYP_name") && key.getROUND_TYP_name() != null) {
					msgKey.setKeyValue("ROUND_TYP_name", key.getROUND_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("ROUND_TYP_val") && key.getROUND_TYP_val() != null) {
					msgKey.setKeyValue("ROUND_TYP_val", key.getROUND_TYP_val().toString());
				}
				if(msgKeyType.containsKeyColumn("TAX_CD") && key.getTAX_CD() != null) {
					msgKey.setKeyValue("TAX_CD", key.getTAX_CD());
				}
				if(msgKeyType.containsKeyColumn("TAX_NAME") && key.getTAX_NAME() != null) {
					msgKey.setKeyValue("TAX_NAME", key.getTAX_NAME());
				}
				if(msgKeyType.containsKeyColumn("TAX_ANAME") && key.getTAX_ANAME() != null) {
					msgKey.setKeyValue("TAX_ANAME", key.getTAX_ANAME());
				}
				if(msgKeyType.containsKeyColumn("OLD_TAX_RATE_1") && key.getOLD_TAX_RATE_1() != null) {
					msgKey.setKeyValue("OLD_TAX_RATE_1", key.getOLD_TAX_RATE_1());
				}
				if(msgKeyType.containsKeyColumn("OLD_TAX_RATE_2") && key.getOLD_TAX_RATE_2() != null) {
					msgKey.setKeyValue("OLD_TAX_RATE_2", key.getOLD_TAX_RATE_2());
				}
				if(msgKeyType.containsKeyColumn("OLD_TAX_RATE_3") && key.getOLD_TAX_RATE_3() != null) {
					msgKey.setKeyValue("OLD_TAX_RATE_3", key.getOLD_TAX_RATE_3());
				}
				if(msgKeyType.containsKeyColumn("NEW_TAX_RATE_START_DATE") && key.getNEW_TAX_RATE_START_DATE() != null) {
					msgKey.setKeyValue("NEW_TAX_RATE_START_DATE", key.getNEW_TAX_RATE_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("NEW_TAX_RATE_1") && key.getNEW_TAX_RATE_1() != null) {
					msgKey.setKeyValue("NEW_TAX_RATE_1", key.getNEW_TAX_RATE_1());
				}
				if(msgKeyType.containsKeyColumn("NEW_TAX_RATE_2") && key.getNEW_TAX_RATE_2() != null) {
					msgKey.setKeyValue("NEW_TAX_RATE_2", key.getNEW_TAX_RATE_2());
				}
				if(msgKeyType.containsKeyColumn("NEW_TAX_RATE_3") && key.getNEW_TAX_RATE_3() != null) {
					msgKey.setKeyValue("NEW_TAX_RATE_3", key.getNEW_TAX_RATE_3());
				}
				if(msgKeyType.containsKeyColumn("ROUND_TYP") && key.getROUND_TYP() != null) {
					msgKey.setKeyValue("ROUND_TYP", key.getROUND_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("OLD_GL_TAX_CD") && key.getOLD_GL_TAX_CD() != null) {
					msgKey.setKeyValue("OLD_GL_TAX_CD", key.getOLD_GL_TAX_CD());
				}
				if(msgKeyType.containsKeyColumn("NEW_GL_TAX_CD") && key.getNEW_GL_TAX_CD() != null) {
					msgKey.setKeyValue("NEW_GL_TAX_CD", key.getNEW_GL_TAX_CD());
				}
				if(msgKeyType.containsKeyColumn("w_MODIFY_COUNT") && key.getw_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("w_MODIFY_COUNT", key.getw_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("w_COUNT") && key.getw_COUNT() != null) {
					msgKey.setKeyValue("w_COUNT", key.getw_COUNT().toString());
				}
				//{{user_implement_dev:setOrMsgKey
					// TODO: キー情報設定のコードを追加してください
                                //}}user_implement_dev:setOrMsgKey

				// メッセージキー追加
				msgKeyArray.add(msgKey);

				// メッセージキーを業務に登録する
				business.setSendMessageKey(tableName, keyColumnName, msgKeyArray);
			}
		}
	}

	//////////////////////////////
	// 受信キーを取得
	public List getOrMsgKey() throws MessageApiException {
		
		// 日付変換用
		SimpleDateFormat sdf = new SimpleDateFormat();

		ArrayList keyList = new ArrayList();
		ArrayList msgKeyTypeArray = business.getMessageKeyType(Business.MSGKEY_TYPE_CAN_RECEIVE);//業務が受信可能なメッセージキーの場合

		try {
			for (int i = 0; msgKeyTypeArray != null && i < msgKeyTypeArray.size(); i++) {
				// メッセージキーの種類の数だけ繰り返し
				MessageKeyType msgKeyType = (MessageKeyType)msgKeyTypeArray.get(i);

				// メッセージキーのテーブル名
				String tableName = msgKeyType.getTableName();

				// メッセージキーのキーカラム名リスト
				// 複合キーの場合、keyColumnNameの配列数が２以上となる
				String [] keyColumnName = msgKeyType.getKeyColumnName();

				// メッセージキーを取得する
				ArrayList msgKeyArray = business.getRecieveMessageKey(tableName, keyColumnName);//受信したメッセージキー

				// メッセージキーが存在する場合は、メッセージキーの数だけ繰り返し
				for (int j = 0; msgKeyArray != null && j < msgKeyArray.size(); j++) {
					MessageKey msgKey = (MessageKey)msgKeyArray.get(j);
					AA0100030Struct key = new AA0100030Struct();
					if(msgKeyType.containsKeyColumn("ROUND_TYP_name")) {
						key.setROUND_TYP_name(msgKey.getKeyValue("ROUND_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("ROUND_TYP_val")) {
						key.setROUND_TYP_val(new Integer(msgKey.getKeyValue("ROUND_TYP_val")));
					}
					if(msgKeyType.containsKeyColumn("TAX_CD")) {
						key.setTAX_CD(msgKey.getKeyValue("TAX_CD"));
					}
					if(msgKeyType.containsKeyColumn("TAX_NAME")) {
						key.setTAX_NAME(msgKey.getKeyValue("TAX_NAME"));
					}
					if(msgKeyType.containsKeyColumn("TAX_ANAME")) {
						key.setTAX_ANAME(msgKey.getKeyValue("TAX_ANAME"));
					}
					if(msgKeyType.containsKeyColumn("OLD_TAX_RATE_1")) {
						key.setOLD_TAX_RATE_1(msgKey.getKeyValue("OLD_TAX_RATE_1"));
					}
					if(msgKeyType.containsKeyColumn("OLD_TAX_RATE_2")) {
						key.setOLD_TAX_RATE_2(msgKey.getKeyValue("OLD_TAX_RATE_2"));
					}
					if(msgKeyType.containsKeyColumn("OLD_TAX_RATE_3")) {
						key.setOLD_TAX_RATE_3(msgKey.getKeyValue("OLD_TAX_RATE_3"));
					}
					if(msgKeyType.containsKeyColumn("NEW_TAX_RATE_START_DATE")) {
						key.setNEW_TAX_RATE_START_DATE(msgKey.getKeyValue("NEW_TAX_RATE_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("NEW_TAX_RATE_1")) {
						key.setNEW_TAX_RATE_1(msgKey.getKeyValue("NEW_TAX_RATE_1"));
					}
					if(msgKeyType.containsKeyColumn("NEW_TAX_RATE_2")) {
						key.setNEW_TAX_RATE_2(msgKey.getKeyValue("NEW_TAX_RATE_2"));
					}
					if(msgKeyType.containsKeyColumn("NEW_TAX_RATE_3")) {
						key.setNEW_TAX_RATE_3(msgKey.getKeyValue("NEW_TAX_RATE_3"));
					}
					if(msgKeyType.containsKeyColumn("ROUND_TYP")) {
						key.setROUND_TYP(new Integer(msgKey.getKeyValue("ROUND_TYP")));
					}
					if(msgKeyType.containsKeyColumn("OLD_GL_TAX_CD")) {
						key.setOLD_GL_TAX_CD(msgKey.getKeyValue("OLD_GL_TAX_CD"));
					}
					if(msgKeyType.containsKeyColumn("NEW_GL_TAX_CD")) {
						key.setNEW_GL_TAX_CD(msgKey.getKeyValue("NEW_GL_TAX_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_MODIFY_COUNT")) {
						key.setw_MODIFY_COUNT(msgKey.getKeyValue("w_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("w_COUNT")) {
						key.setw_COUNT(new Integer(msgKey.getKeyValue("w_COUNT")));
					}
					//{{user_implement_dev:getOrMsgKey
						// TODO: キー情報取得のコードを追加してください
                                        //}}user_implement_dev:getOrMsgKey
					keyList.add(key);
				}
			}
		} catch (Exception e) {
			// printStackTrace を表示。
			e.printStackTrace();
		}
		return keyList;
	}
}
