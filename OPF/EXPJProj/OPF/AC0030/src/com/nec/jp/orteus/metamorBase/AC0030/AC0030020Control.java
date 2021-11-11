/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AC0030/src/com/nec/jp/orteus/metamorBase/AC0030/AC0030020Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AC0030;

import com.nec.jp.orteus.metamorBase.AC0030.*;
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
 // TODO: ここにimportパッケージを記述してください
// insert Original Code ===================================================
import java.io.File;
import java.io.IOException;
import com.nec.jp.orteus.metamorBase.util.AlarmMessage.AlarmMessage;
import com.nec.jp.orteus.metamorBase.util.AlarmMessage.AlarmMessageException;
import java.io.*;
//=========================================================================
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AC0030020Control
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
        public List getList() { return this.list; }						// リストを返します。
        public void setList(List listname) { this.list = listname; }	// リストをセットします。
        public int getListsize() {										// リスト型のサイズを返します。
         int nret = 0;
         if( this.list != null ) {nret = this.list.size();}
         return nret;
        }
        public Object getListvalue(int x) { return this.list.get(x); }	// リストの値（メディエータ）を返します。
       
        public AC0030020Struct getStruct() { return this.struct; }	// Structの値（メディエータ）を返します。
       
        // TODO: ユーザ定義のコードを記述してください
        // 単票形式部読み出し用
        protected List list1;											// 結果リストのインスタンス
        public List getList1() { return this.list1; }					// リストを返します。
        public void setList1(List listname) { this.list1 = listname; }	// リストをセットします。
        public int getList1size() {										// リスト型のサイズを返します。
         int nret = 0;
         if( this.list1 != null ) {nret = this.list1.size();}
         return nret;
        }
        // リストの値（メディエータ）を返します。
        public AC0030020Struct getList1value(int x) { return (AC0030020Struct)(this.list1.get(x)); }
       
        // 一覧形式部読み出し用
        protected List list2;											// 結果リストのインスタンス
        public List getList2() { return this.list2; }					// リストを返します。
        public void setList2(List listname) { this.list2 = listname; }	// リストをセットします。
        public int getList2size() {										// リスト型のサイズを返します。
         int nret = 0;
         if( this.list2 != null ) {nret = this.list2.size();}
         return nret;
        }
        // リストの値（メディエータ）を返します。
        public AC0030020Struct getList2value(int x) { return (AC0030020Struct)(this.list2.get(x)); }
       
        private boolean closeFlag = false;
        public boolean isCloseFlag(){
         return this.closeFlag;
        }
       
        /**
				* 時分の整理
				* @param 時分 
				*/
				private String formatHM(String inTime , String inFlag){
						
						if(null == inTime || "".equals(inTime)){
							if("0".equals(inFlag)){
								return "23:59" ;
							}else{
								return inTime;
							}
						}
						
						if(inTime.length() < 3 || inTime.length() > 4){
							if("0".equals(inFlag)){
								return "23:59" ;
							}else{
								return inTime;
							}
						}
						
						if(inTime.length() ==  3 ){
							if("0".equals(inFlag)){
								return "0" + inTime.substring(0,1) + ":" + inTime.substring(1);
							}else{
								return "0" + inTime;
							}
						}
						
						if(inTime.length() ==  4 ){
							if("0".equals(inFlag)){
								return inTime.substring(0,2) + ":" + inTime.substring(2);
							}else{
								return inTime;
							}
						}
			
						return inTime;
				}	
				
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlNone() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0030");
		logger.entering("AC0030020Control"+":USER="+struct.getsUser_ID(),"controlNone");
			//{{user_implement_dev:<controlNone>
                 // TODO: ユーザ定義のコードを記述してください
                 sysLog.setConnection(conn);
                 this.msgStruct.clearAll();
              // insert Original Code ===================================================
                // 項目をクリアする（初期値をセット）
                struct.settxtJobOdrCd("");       // 製番
                struct.setrdoOutsideTyp1("true");  // 内外作区分（1:内作のみ）
                struct.setrdoOutsideTyp2(null);    // 内外作区分（1:内作のみ）
                struct.setrdoOutsideTyp3(null);    // 内外作区分（1:内作のみ）
                struct.setrdoEntry1Typ1("true");   // エントリ区分１（1:手配着手日）
                struct.setrdoEntry1Typ2(null);     // エントリ区分１（1:手配着手日）
                struct.setrdoEntry1Typ3(null);     // エントリ区分１（1:手配着手日）
                struct.settxtEntryDate("");      // エントリ日付（表示用項目）
                struct.settxtEntryTime("");      // エントリ日付（表示用項目）
              //=========================================================================
                //}}user_implement_dev:<controlNone>
		logger.exiting("AC0030020Control"+":USER="+struct.getsUser_ID(),"controlNone");

		return;
	}

	/**
	 * 実行ボタン押下時に実行される処理です。
	 *
	 */
	public void controlExecute() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0030");
		logger.entering("AC0030020Control"+":USER="+struct.getsUser_ID(),"controlExecute");
			//{{user_implement_dev:<controlExecute>
                 // TODO: ユーザ定義のコードを記述してください
                try {
                 sysLog.setConnection(conn);
                 this.msgStruct.clearAll();
              
              // insert Original Code ===================================================
                 // バッチ処理クラスのmain引数
                 String batchProcessingTyp = null; // バッチ処理区分
                 String userId = null;			  // ユーザID
                 String plantCd = null;			  // 工場コード
                 String managementTyp = null;	  // 管理区分
                 String outsideTyp = null;		  // 内外作区分
                 String jobOdrCd = null;			  // 製番
                 String jobOdrDetailNo= null;	  // 製番枝番（SI対応項目 metamorBaseでは未使用）
                 String entry1Typ = null;		  // エントリ区分１
                 String entry2Typ = null;		  // エントリ区分２
                 String entryDate = null;		  // エントリ日付
                 String entryTime = null;		  // エントリ日付
                               
                 // 固定値をセット
                 batchProcessingTyp = "2";		  // 2: 自動運転しない（夜間バッチなし）
                 managementTyp = "2";			  // 2: 製番
              
                 // ユーザID、工場コードを取得する
                 userId = getsysUSER_CD();
                 plantCd = getsysPLANT_CD();
              
                 // 画面から送信された情報を取得する
                 //outsideTyp = struct.getrdoOutsideTyp().toString();  // 内外作区分
                 if ("true".equals(struct.getrdoOutsideTyp1())) {
                  outsideTyp = "1";
                 } else if ("true".equals(struct.getrdoOutsideTyp2())) {
                  outsideTyp = "2";
                 } else {
                  outsideTyp = "9";
                 }
              
                 jobOdrCd = struct.gettxtJobOdrCd();                 // 製番
                 if ((jobOdrCd == null) || jobOdrCd.equals("")) {
                  jobOdrCd = "jobOdrCd";  // ダミー文字列をセット
                 }
              
                 //entry1Typ = struct.getrdoEntry1Typ().toString();    // エントリ区分１
                 if ("true".equals(struct.getrdoEntry1Typ1())) {
                  entry1Typ = "1";
                 } else if ("true".equals(struct.getrdoEntry1Typ2())) {
                  entry1Typ = "2";
                 } else {
                  entry1Typ = "3";
                 }
              
                 //entry2Typ = struct.getrdoEntry2Typ().toString();    // エントリ区分２
                 entry2Typ = "1";
              
                 //entryDate = struct.gethdnEntryDate();               // エントリ日付
                 entryDate = struct.gettxtEntryDate();                 // エントリ日付
							   entryTime = formatHM(struct.gettxtEntryTime(),"0");
							   struct.settxtEntryTime(formatHM(struct.gettxtEntryTime(),"1"));
								 entryDate = entryDate + entryTime;
								               
                 // 未使用項目にダミー文字列をセット（この値は使用されない）
              
                 jobOdrDetailNo= "jobOdrDetailNo";  // 製番枝番（SI対応項目）
              
                 // 表示用フィールド"txtEntryDate"に、送信データ用フィールド"hdnEntryDate"の
                 // 値をコピーする
//                 struct.settxtEntryDate(entryDate);
              
                 // バッチ処理を実行する -------------------------------------------
                 ResourceBundle bundle = SystemConfig.getBundle();
                 String javaPath = SystemConfig.getProperty("JAVA_PATH", bundle);
                 if(javaPath == null){
              //				struct.setMESSAGE_ERR("システム既定値ファイルからの情報取得に失敗しました(ＪＶＭパス)");
                  ExpjMessage emsg = new ExpjMessage("ZZ09010");
              //				msgStruct.getError().add(emsg.getMessage());
                  msgStruct.addError(emsg);
                 }
                 String ClassPath = SystemConfig.getProperty("CLASS_PATH", bundle);
                 if(ClassPath == null){
              //				struct.setMESSAGE_ERR("システム既定値ファイルからの情報取得に失敗しました(クラスパス)");
                  ExpjMessage emsg = new ExpjMessage("ZZ09012");
              //				msgStruct.getError().add(emsg.getMessage());
                  msgStruct.addError(emsg);
                 }
                 String batchPath = SystemConfig.getProperty("BATCH_PATH", bundle);
                 if(batchPath == null){
              //				struct.setMESSAGE_ERR("システム既定値ファイルからの情報取得に失敗しました(バッチ起動設定)");
                  ExpjMessage emsg = new ExpjMessage("ZZ09011");
              //				msgStruct.getError().add(emsg.getMessage());
                  msgStruct.addError(emsg);
                 }
              
                 try {
//                  String cmd = "";
//                  cmd = cmd + javaPath; // ＪＶＭ
//                  cmd = cmd + " -cp ";
//                  cmd = cmd + ClassPath; //Java ClassPath
//                  cmd = cmd + " -Dcom.nec.jp.orteus.util.logging.config.file=";
//                  cmd = cmd + batchPath; // D:/OrteusStudio/lib/logging.properties"; // 起動設定
//                  cmd = cmd + " " + "com.nec.jp.orteus.metamorBase.AC0020.AC0020B001.mainAC0020B001"; // 呼び出し先クラス
//                  cmd = cmd + " \"" + batchProcessingTyp + "\""; // バッチ処理区分
//                  cmd = cmd + " \"" + userId + "\"";			  // ユーザID
//                  cmd = cmd + " \"" + plantCd + "\"";			  // 工場コード
//                  cmd = cmd + " \"" + managementTyp + "\"";	  // 管理区分
//                  cmd = cmd + " \"" + outsideTyp + "\"";		  // 内外作区分
//                  cmd = cmd + " \"" + jobOdrCd + "\"";			  // 製番
//                  cmd = cmd + " \"" + jobOdrDetailNo + "\"";	  // 製番枝番
//                  cmd = cmd + " \"" + entry1Typ + "\"";		  // エントリ区分１
//                  cmd = cmd + " \"" + entry2Typ + "\"";		  // エントリ区分２
//                  cmd = cmd + " \"" + entryDate + "\"";		  // エントリ日付
//             
//              
//         
//                  Runtime runtime = Runtime.getRuntime();
//                  Process p = runtime.exec(cmd);
              
                  List buffer = new ArrayList();
                  buffer.add(javaPath);            // ＪＶＭ
                  buffer.add("-cp");
                  buffer.add(ClassPath);          // Java ClassPath
                  buffer.add("-Dcom.nec.jp.orteus.util.logging.config.file="+batchPath); // 起動設定
                  buffer.add("com.nec.jp.orteus.metamorBase.AC0020.AC0020B001.mainAC0020B001"); // 呼び出し先クラス
                  buffer.add(batchProcessingTyp);             // バッチ処理区分
                  buffer.add(userId);                         // ユーザID
                  buffer.add(plantCd);                        // 工場コード
                  buffer.add(managementTyp);                  // 管理区分
                  buffer.add(outsideTyp);                     // 内外作区分
                  buffer.add(jobOdrCd);                       // 製番
                  buffer.add(jobOdrDetailNo);                 // 製番枝番
                  buffer.add(entry1Typ);                      // エントリ区分１
                  buffer.add(entry2Typ);                      // エントリ区分２
                  buffer.add(entryDate);                      // エントリ日付

                  // バッチ処理実行
                  Runtime runtime = Runtime.getRuntime();
                  runtime.exec((String[])buffer.toArray(new String[buffer.size()]));
                 } catch (IOException e) {
                 // バッチ呼び出し失敗の場合、画面メッセージを表示する。
                  ExpjMessage emsg = new ExpjMessage("ZZ09014", new String[0]);
              //				msgStruct.getError().add(emsg.getMessage());
                  msgStruct.addError(emsg);
                  throw e;
                 }
            
                 // バッチ呼び出し成功の場合、画面メッセージを表示する。
                 ExpjMessage emsg = new ExpjMessage("ZZ09013", new String[0]);
              //			msgStruct.getInfo().add(emsg.getMessage());
                 msgStruct.addInfo(emsg);
                } catch (Exception e) {
                 AlarmMessageException ame = null;
                 if (e instanceof AlarmMessageException){
                  ame = (AlarmMessageException)e;
                  ame.next();
                  sysLog.severe("ZZ01006",this.sysUSER_CD,ame.getMessage());//エラー詳細
                  ame.resetCurrent();
                 } else {
                  ame = new AlarmMessageException("ZZ01106",new String[0]);
                  sysLog.severe("ZZ01106",this.sysUSER_CD);//致命的エラー
                  sysLog.severe("ZZ01006",this.sysUSER_CD,e.toString());//エラー詳細
                 }
                 throw ame;
              
                } finally {
                 if (conn != null){
                  try {
                   conn.rollback();
                  } catch (FoundationException fe){
                   AlarmMessageException ame = new AlarmMessageException("ZZ01106",new String[0]);
                   sysLog.severe("ZZ01106",this.sysUSER_CD);//致命的エラー
                   sysLog.severe("ZZ01006",this.sysUSER_CD,fe.toString());//エラー詳細
                   throw ame;
                  }
                 }
                }
              
                // バッチ処理を実行する 終わり-----------------------------------
              
              //=========================================================================
              
                //}}user_implement_dev:<controlExecute>
		logger.exiting("AC0030020Control"+":USER="+struct.getsUser_ID(),"controlExecute");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0030");
		logger.entering("AC0030020Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
                 // TODO: ユーザ定義のコードを記述してください
                 this.msgStruct.clearAll();
                 struct.setrdoOutsideTyp1("true");
                 struct.setrdoEntry1Typ1("true");
                //}}user_implement_dev:<controlClear>
		logger.exiting("AC0030020Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * 閉じるボタン押下時に実行される処理です。
	 *
	 */
	public void controlClose() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0030");
		logger.entering("AC0030020Control"+":USER="+struct.getsUser_ID(),"controlClose");
			//{{user_implement_dev:<controlClose>
                 // TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlClose>
		logger.exiting("AC0030020Control"+":USER="+struct.getsUser_ID(),"controlClose");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0030");
		logger.entering("AC0030020Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
                 // TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AC0030020Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0030");
		logger.entering("AC0030020Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
                 // TODO: ユーザ定義のコードを記述してください
              
              //=========================================================================
                boolean logInit = false;
                try{
                 conn.beginTransWeb();
              
                 this.closeFlag = false;
                 this.sp = new ScreenParam(this.getClass());
                 this.msgStruct.clearAll();
                 struct.setrdoOutsideTyp1("true");
                 struct.setrdoEntry1Typ1("true");
              
                 sysLog = new SystemLog();
                 logInit = sysLog.init(this.sp.getLogId());
                 if(!logInit){
                  //システムログの初期化に失敗しました
                  throw new AlarmMessageException("ZZ01005",new String[0]);
                 }
                 sysLog.setConnection(conn);
              
                 //画面ｕrl直接指定起動の禁止
                 try{
                  if(ScreenPermission.isUseful(conn, this.sysUSER_CD, this.sp.getProcId()) == false) {
                   throw new Exception();
                  }
                 }catch(Exception e){
                  //この機能の使用権限がありません。
                  throw new AlarmMessageException("ZZ01002",new String[0]);
                 }
              
                 //ロック解除
              //			this.doUnBusinessLock();
              
                 // 工場コードの取得
                 String plantCd = getsysPLANT_CD();
                 struct.setplantCd(plantCd);
              
                 // 業務運用日を読み込み、structに保持させる
                 list = entity.mreadSysDateCtrl.read(conn, struct);
                 if(list == null || list.size() != 1){
                  //業務日付情報が無い/複数件
                              //データが存在しない
                  struct.sethdnBusinessOprDate(null);
                              ExpjMessage emsg = new ExpjMessage( "KR00017" );
                              msgStruct.addError( emsg );	// エラーメッセージとして登録
                              sysLog.warning(emsg, this.sysUSER_CD); //エラー内容
                 }else{
                  AC0030020Struct wStruct = (AC0030020Struct) list.get(0);
                  struct.sethdnBusinessOprDate( wStruct.gethdnBusinessOprDate());
                 }
              
              /*
                 bLock = new BusinessLock(conn,this.struct.getsUser_ID(),this.sysPLANT_CD);
                 int id = bLock.doLock(this.sp.getProcId());
                 this.cancelId = "" + id;
                 if(id == -1){
                  //業務ロックされている
                  throw new AlarmMessageException("ZZ01001",new String[0]);
                 }
              */
              
									// システムパラメータ（TIME_CTRL）取得
									AC0030020Struct TIME_CTRLStruct = new AC0030020Struct();
									List TIME_CTRLList = entity.mreadTIME_CTRL.read(conn, TIME_CTRLStruct);
									if(null != TIME_CTRLList && TIME_CTRLList.size()>0){
										TIME_CTRLStruct = (AC0030020Struct)TIME_CTRLList.get(0);
										struct.setTIME_CTRL(TIME_CTRLStruct.getTIME_CTRL());
									}else{
										struct.setTIME_CTRL("false");
									} 
									              
                 conn.commit();
                } catch(SQLException e) {
                 e.printStackTrace();
                 // エラー処理を記述してください。
                 setReadStatus(ERROR);
                 ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
                 sysLog.severe(emsg, getsysUSER_CD());//致命的エラー エラー内容
                 ExpjException ee = new ExpjException(e, emsg); // エクセプションを生成
                 throw ee;
                }catch(Exception e){
                 AlarmMessageException ame = null;
                 if(e instanceof AlarmMessageException){
                  ame = (AlarmMessageException)e;
                  ame.next();
                  if(logInit){
                   ExpjMessage emsg = new ExpjMessage();
                   emsg.setCode(ame.getCode());
                   emsg.setValue(ame.getValue());
                   sysLog.severe("ZZ01006",
                		   this.sysUSER_CD,emsg.getMessage(CoreTools.getLocale(this.sysUSER_CD)));//エラー詳細
                  }
                  ame.resetCurrent();
                 }else{
                  ame = new AlarmMessageException("ZZ01106",new String[0]);
                  if(logInit){
                   sysLog.severe("ZZ01106",this.sysUSER_CD);//致命的エラー
                   sysLog.severe("ZZ01006",this.sysUSER_CD,e.toString());//エラー詳細
                  }
                 }
                 throw ame;
                }finally{
                 if(conn != null){
                  try{
                   conn.rollback();
                  }catch(FoundationException fe){
                   AlarmMessageException ame = new AlarmMessageException("ZZ01106",new String[0]);
                   if(logInit){
                    sysLog.severe("ZZ01106",this.sysUSER_CD);//致命的エラー
                    sysLog.severe("ZZ01006",this.sysUSER_CD,fe.toString());//エラー詳細
                   }
                   throw ame;
                  }
                 }
                }
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AC0030020Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * イベントハンドラの前処理です。
	 *
	 * @param buttun ボタン名
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0030");
		logger.entering("AC0030020Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
                 // TODO: ユーザ定義のコードを記述してください
                 // コンボボックス部品のデータのセットはここに記述してください。
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("AC0030020Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			if( button.equals("None") ) {
				controlNone();
			} else if( button.equals("Execute") ) {
				controlExecute();
			} else if( button.equals("Clear") ) {
				controlClear();
			} else if( button.equals("Close") ) {
				controlClose();
			} else if( button.equals("initial") ) {
				controlINITIAL();
			} else if( button.equals("reload") ) {
				controlRELOAD();
			}
		//{{user_implement_dev:<control_eventHandller>
                 // TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<control_eventHandller>
		} catch( BusinessLockException ble ) {
			// 枠メッセージ出力依頼作成
			setNewDataFlg(false);
		} catch( ResourceBusyException rbe ) {
			ExpjException ee = new ExpjException(rbe, "ZZ01105");
			throw ee;
		} catch( FoundationException e ) {
//			e.printStackTrace();
//			throw new FoundationException("AC0030020Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
                 // TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<createDefaultCSV>
		} catch( FoundationException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AC0030020-E999","CSVの出力処理"));
			throw new FoundationException("AC0030020Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AC0030020-E999","システム日付の取得処理"));
				throw new FoundationException("AC0030020Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
                 // TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AC0030020-E999","コントロールのイベント処理"));
			throw new FoundationException("AC0030020Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected AC0030020Entity entity;
	protected AC0030020Struct struct;
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

		entity = new AC0030020Entity();
		struct = new AC0030020Struct();

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
	 * AC0030020クラスの標準コンストラクタ
	 */
	public AC0030020Control() throws BusinessProcessException, FoundationException
	{
		initialize();

		//conn = connect();
		//{{user_implement_code_constractor
                 // TODO: ここに初期処理を記述してください
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
                 // TODO: インスタンス消滅時に実行する処理を記述してください
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
				AC0030020Struct key = (AC0030020Struct)keyList.get(j);
				// メッセージキーを作成する
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("txtEntryDate") && key.gettxtEntryDate() != null) {
					msgKey.setKeyValue("txtEntryDate", key.gettxtEntryDate());
				}
				if(msgKeyType.containsKeyColumn("rdoOutsideTyp1") && key.getrdoOutsideTyp1() != null) {
					msgKey.setKeyValue("rdoOutsideTyp1", key.getrdoOutsideTyp1());
				}
				if(msgKeyType.containsKeyColumn("rdoOutsideTyp2") && key.getrdoOutsideTyp2() != null) {
					msgKey.setKeyValue("rdoOutsideTyp2", key.getrdoOutsideTyp2());
				}
				if(msgKeyType.containsKeyColumn("rdoOutsideTyp3") && key.getrdoOutsideTyp3() != null) {
					msgKey.setKeyValue("rdoOutsideTyp3", key.getrdoOutsideTyp3());
				}
				if(msgKeyType.containsKeyColumn("rdoEntry1Typ1") && key.getrdoEntry1Typ1() != null) {
					msgKey.setKeyValue("rdoEntry1Typ1", key.getrdoEntry1Typ1());
				}
				if(msgKeyType.containsKeyColumn("rdoEntry1Typ2") && key.getrdoEntry1Typ2() != null) {
					msgKey.setKeyValue("rdoEntry1Typ2", key.getrdoEntry1Typ2());
				}
				if(msgKeyType.containsKeyColumn("rdoEntry1Typ3") && key.getrdoEntry1Typ3() != null) {
					msgKey.setKeyValue("rdoEntry1Typ3", key.getrdoEntry1Typ3());
				}
				if(msgKeyType.containsKeyColumn("txtJobOdrCd") && key.gettxtJobOdrCd() != null) {
					msgKey.setKeyValue("txtJobOdrCd", key.gettxtJobOdrCd());
				}
				if(msgKeyType.containsKeyColumn("rdoOutsideTyp") && key.getrdoOutsideTyp() != null) {
					msgKey.setKeyValue("rdoOutsideTyp", key.getrdoOutsideTyp());
				}
				if(msgKeyType.containsKeyColumn("rdoEntry1Typ") && key.getrdoEntry1Typ() != null) {
					msgKey.setKeyValue("rdoEntry1Typ", key.getrdoEntry1Typ());
				}
				if(msgKeyType.containsKeyColumn("txtEntryTime") && key.gettxtEntryTime() != null) {
					msgKey.setKeyValue("txtEntryTime", key.gettxtEntryTime());
				}
				if(msgKeyType.containsKeyColumn("TIME_CTRL") && key.getTIME_CTRL() != null) {
					msgKey.setKeyValue("TIME_CTRL", key.getTIME_CTRL());
				}
				if(msgKeyType.containsKeyColumn("hdnBusinessOprDate") && key.gethdnBusinessOprDate() != null) {
					msgKey.setKeyValue("hdnBusinessOprDate", key.gethdnBusinessOprDate());
				}
				if(msgKeyType.containsKeyColumn("plantCd") && key.getplantCd() != null) {
					msgKey.setKeyValue("plantCd", key.getplantCd());
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
					AC0030020Struct key = new AC0030020Struct();
					if(msgKeyType.containsKeyColumn("txtEntryDate")) {
						key.settxtEntryDate(msgKey.getKeyValue("txtEntryDate"));
					}
					if(msgKeyType.containsKeyColumn("rdoOutsideTyp1")) {
						key.setrdoOutsideTyp1(msgKey.getKeyValue("rdoOutsideTyp1"));
					}
					if(msgKeyType.containsKeyColumn("rdoOutsideTyp2")) {
						key.setrdoOutsideTyp2(msgKey.getKeyValue("rdoOutsideTyp2"));
					}
					if(msgKeyType.containsKeyColumn("rdoOutsideTyp3")) {
						key.setrdoOutsideTyp3(msgKey.getKeyValue("rdoOutsideTyp3"));
					}
					if(msgKeyType.containsKeyColumn("rdoEntry1Typ1")) {
						key.setrdoEntry1Typ1(msgKey.getKeyValue("rdoEntry1Typ1"));
					}
					if(msgKeyType.containsKeyColumn("rdoEntry1Typ2")) {
						key.setrdoEntry1Typ2(msgKey.getKeyValue("rdoEntry1Typ2"));
					}
					if(msgKeyType.containsKeyColumn("rdoEntry1Typ3")) {
						key.setrdoEntry1Typ3(msgKey.getKeyValue("rdoEntry1Typ3"));
					}
					if(msgKeyType.containsKeyColumn("txtJobOdrCd")) {
						key.settxtJobOdrCd(msgKey.getKeyValue("txtJobOdrCd"));
					}
					if(msgKeyType.containsKeyColumn("rdoOutsideTyp")) {
						key.setrdoOutsideTyp(msgKey.getKeyValue("rdoOutsideTyp"));
					}
					if(msgKeyType.containsKeyColumn("rdoEntry1Typ")) {
						key.setrdoEntry1Typ(msgKey.getKeyValue("rdoEntry1Typ"));
					}
					if(msgKeyType.containsKeyColumn("txtEntryTime")) {
						key.settxtEntryTime(msgKey.getKeyValue("txtEntryTime"));
					}
					if(msgKeyType.containsKeyColumn("TIME_CTRL")) {
						key.setTIME_CTRL(msgKey.getKeyValue("TIME_CTRL"));
					}
					if(msgKeyType.containsKeyColumn("hdnBusinessOprDate")) {
						key.sethdnBusinessOprDate(msgKey.getKeyValue("hdnBusinessOprDate"));
					}
					if(msgKeyType.containsKeyColumn("plantCd")) {
						key.setplantCd(msgKey.getKeyValue("plantCd"));
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
