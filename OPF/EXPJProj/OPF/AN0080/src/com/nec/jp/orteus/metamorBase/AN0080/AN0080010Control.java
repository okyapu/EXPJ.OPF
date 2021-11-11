/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AN0080/src/com/nec/jp/orteus/metamorBase/AN0080/AN0080010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AN0080;

import com.nec.jp.orteus.metamorBase.AN0080.*;
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
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AN0080010Control
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
        protected List list;											// 一覧部分の結果リストを画面に表示するためのリストインスタンス
       
        // デフォルトアクセサメソッド
        public List getList() { return this.list; }						// リストを返します。
        public void setList(List listname) { this.list = listname; }	// リストをセットします。
        public int getListsize() {										// リスト型のサイズを返します。
         int nret = 0;
         if( this.list != null ) {nret = this.list.size();}
         return nret;
        }
       //	public Object getListvalue(int x) { return this.list.get(x); }	// リストの値を返します。
        public AN0080010Struct getListvalue(int x) { return (AN0080010Struct)(this.list.get(x)); }	// リストの値を返します。
        public AN0080010Struct getStruct() { return this.struct; }	// Structを返します。
        public AN0080010Struct createStruct() { return new AN0080010Struct(); }	// 新しいStructを作って返します。
        public void setStruct(Object structname) { this.struct.setStruct((AN0080010Struct)structname); }	// Structをセットします。
        public void initializeStruct() { this.struct.initialize(); }	// Structの値を初期化します。
       
        // CSV出力用リスト
        private CsvWriter csvWriter = null;
        public CsvWriter getCsvWriter(){ return this.csvWriter; }
       
        private CsvReader csvReader = null;
        public void setCsvReader(CsvReader cr){ this.csvReader = cr; }
       
        /**
         * 画面を初期化します。
         *
         * @throws FoundationException
         * @throws ExpjException サーバーエラー
         */
        private void initializeScreen()
          throws FoundationException, ExpjException
        {
         // structを初期化
         struct.initialize();
         // 工場コードの初期値を設定
         struct.setPLANT_CD(getsysPLANT_CD());
       
         // listを初期化
         if (list != null) {
          list.clear();
         }
       
         // 読込状態（初期状態）を設定
         setReadStatus(INITIAL);
        }
       
        /**
         * データが書き換えられていた場合のメッセージを表示します。
         *
         * @param tableAndKeys アクセスしたテーブル名とキー名
         */
        private void doModifyError(String tableAndKeys)
        {
         // 警告：他の処理によりデータが書き換えられています。
         // 		メニューに戻ってやり直して下さい。
         ExpjMessage emsg = new ExpjMessage("ZZ01105");
         msgStruct.addError(emsg);
         sysLog.warning(emsg, getsysUSER_CD());
         emsg = new ExpjMessage("ZZ01006", tableAndKeys);
         msgStruct.addError(emsg);
         sysLog.warning(emsg, getsysUSER_CD());
        }
       
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * 読込ボタン押下時に実行される処理です。
	 *
	 */
	public void controlSelect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AN0080");
		logger.entering("AN0080010Control"+":USER="+struct.getsUser_ID(),"controlSelect");
			//{{user_implement_dev:<controlSelect>
              
                String tableAndKeys = null;
              
                try {
                 AN0080010Struct workStruct = null;
              
                 // 読込キーを残して、Structをクリア
                 String plantCd = struct.getPLANT_CD();
                 initializeScreen();
                 struct.setPLANT_CD(plantCd);
              
                 // 工場コードを検索
                 tableAndKeys = "M_PLANT.PLANT_CD:" + struct.getPLANT_CD();
                 List workList = entity.mSelectM_PLANT.read(conn, struct);
                 if (workList == null || workList.isEmpty()) {
                  // 読込状態（読込失敗）を設定
                  setReadStatus(ERROR);
                  //「工場コード」が［工場］に存在しない場合
                  // 警告：工場コードが存在しません。
                  ExpjMessage emsg = new ExpjMessage("AN00001");
                  msgStruct.addError(emsg);
                  sysLog.warning(emsg, getsysUSER_CD());
                  emsg = new ExpjMessage("ZZ01006", tableAndKeys);
                  msgStruct.addError(emsg);
                  sysLog.warning(emsg, getsysUSER_CD());
                  return;
                 }
              
                 // 工場名をセット
                 workStruct = (AN0080010Struct)workList.get(0);
                 struct.setPLANT_NAME(workStruct.getPLANT_NAME());
              
                 // 採番テーブルを検索
                 tableAndKeys = "SYS_ISSUE_INST_CD_CTRL,SYS_OPR_INST_CD_CTRL,SYS_PUCH_ODR_CD_CTRL,"
                   + "SYS_TRANSPORT_SLIP_CD_CTRL,SYS_JOB_ODR_CD_CTRL,SYS_WORK_ODR_CD_CTRL,"
                   + "SYS_EXTERNAL_PLAN_CD_CTRL,M_PLANT.PLANT_CD:" + struct.getPLANT_CD();
                 workList = entity.mSelect.read(conn, struct);
                 // 留意事項：常に1件データが存在するので、以下のif文はFalseになる。
                 if (workList == null || workList.isEmpty()) {
                  // 読込状態（０件読込）を設定
                  setReadStatus(NOT_FOUND);
                  //「工場コード」が［工場］に存在しない場合
                  // 警告：工場コードが存在しません。
                  ExpjMessage emsg = new ExpjMessage("AN00001");
                  msgStruct.addError(emsg);
                  sysLog.warning(emsg, getsysUSER_CD());
                  emsg = new ExpjMessage("ZZ01006", tableAndKeys);
                  msgStruct.addError(emsg);
                  sysLog.warning(emsg, getsysUSER_CD());
                  return;
                 }
              
                 workStruct = (AN0080010Struct)workList.get(0);
                 if (workStruct.getISSUE_INST_CD().equals(" ")) {
                  //「工場コード」が［出庫指示番号採番］に存在しない場合
                  // 警告：出庫指示番号採番に対象データが存在しません。
                  tableAndKeys = "SYS_ISSUE_INST_CD_CTRL.PLANT_CD:" + struct.getPLANT_CD();
                  ExpjMessage emsg = new ExpjMessage("AN08008");
                  msgStruct.addError(emsg);
                  sysLog.warning(emsg, getsysUSER_CD());
                  emsg = new ExpjMessage("ZZ01006", tableAndKeys);
                  msgStruct.addError(emsg);
                  sysLog.warning(emsg, getsysUSER_CD());
                 }
                 if (workStruct.getOPR_INST_CD().equals(" ")) {
                  //「工場コード」が［作業指示番号採番］に存在しない場合
                  // 警告：作業指示番号採番に対象データが存在しません。
                  tableAndKeys = "SYS_OPR_INST_CD_CTRL.PLANT_CD:" + struct.getPLANT_CD();
                  ExpjMessage emsg = new ExpjMessage("AN08009");
                  msgStruct.addError(emsg);
                  sysLog.warning(emsg, getsysUSER_CD());
                  emsg = new ExpjMessage("ZZ01006", tableAndKeys);
                  msgStruct.addError(emsg);
                  sysLog.warning(emsg, getsysUSER_CD());
                 }
                 if (workStruct.getPUCH_ODR_CD().equals(" ")) {
                  //「工場コード」が［発注番号採番］に存在しない場合
                  // 警告：発注番号採番に対象データが存在しません。
                  tableAndKeys = "SYS_PUCH_ODR_CD_CTRL.PLANT_CD:" + struct.getPLANT_CD();
                  ExpjMessage emsg = new ExpjMessage("AN08010");
                  msgStruct.addError(emsg);
                  sysLog.warning(emsg, getsysUSER_CD());
                  emsg = new ExpjMessage("ZZ01006", tableAndKeys);
                  msgStruct.addError(emsg);
                  sysLog.warning(emsg, getsysUSER_CD());
                 }
                 if (workStruct.getTRANSPORT_SLIP_CD().equals(" ")) {
                  //「工場コード」が［積送伝票番号採番］に存在しない場合
                  // 警告：積送伝票番号採番に対象データが存在しません。
                  tableAndKeys = "SYS_TRANSPORT_SLIP_CD_CTRL.PLANT_CD:" + struct.getPLANT_CD();
                  ExpjMessage emsg = new ExpjMessage("AN08011");
                  msgStruct.addError(emsg);
                  sysLog.warning(emsg, getsysUSER_CD());
                  emsg = new ExpjMessage("ZZ01006", tableAndKeys);
                  msgStruct.addError(emsg);
                  sysLog.warning(emsg, getsysUSER_CD());
                 }
                 if (workStruct.getJOB_ODR_CD().equals(" ")) {
                  //「工場コード」が［製番採番］に存在しない場合
                  // 警告：製番採番に対象データが存在しません。
                  tableAndKeys = "SYS_JOB_ODR_CD_CTRL.PLANT_CD:" + struct.getPLANT_CD();
                  ExpjMessage emsg = new ExpjMessage("AN08012");
                  msgStruct.addError(emsg);
                  sysLog.warning(emsg, getsysUSER_CD());
                  emsg = new ExpjMessage("ZZ01006", tableAndKeys);
                  msgStruct.addError(emsg);
                  sysLog.warning(emsg, getsysUSER_CD());
                 }
                 if (workStruct.getWORK_ODR_CD().equals(" ")) {
                  //「工場コード」が［作業計画番号採番］に存在しない場合
                  // 警告：作業計画番号採番に対象データが存在しません。
                  tableAndKeys = "SYS_WORK_ODR_CD_CTRL.PLANT_CD:" + struct.getPLANT_CD();
                  ExpjMessage emsg = new ExpjMessage("AN08013");
                  msgStruct.addError(emsg);
                  sysLog.warning(emsg, getsysUSER_CD());
                  emsg = new ExpjMessage("ZZ01006", tableAndKeys);
                  msgStruct.addError(emsg);
                  sysLog.warning(emsg, getsysUSER_CD());
                 }
                 if (workStruct.getEXTERNAL_PLAN_CD().equals(" ")) {
                  //「工場コード」が［外部計画番号採番］に存在しない場合
                  // 警告：外部計画番号採番に対象データが存在しません。
                  tableAndKeys = "SYS_EXTERNAL_PLAN_CD_CTRL.PLANT_CD:" + struct.getPLANT_CD();
                  ExpjMessage emsg = new ExpjMessage("AN08014");
                  msgStruct.addError(emsg);
                  sysLog.warning(emsg, getsysUSER_CD());
                  emsg = new ExpjMessage("ZZ01006", tableAndKeys);
                  msgStruct.addError(emsg);
                  sysLog.warning(emsg, getsysUSER_CD());
                 }
                 if (msgStruct.sizeError() > 0) {
                  // エラー発生時は処理中断
                  return;
                 }
              
                 // 編集領域をセット
                 struct.copyStructEditArea(workStruct);
              
                 // 読込状態（読込成功）を設定
                 setReadStatus(NORMAL);
              
                } catch (SQLException se) {
                 // 読込状態（読込失敗）を設定
                 setReadStatus(ERROR);
                 // エラー：サーバでエラーが発生しました。
                 ExpjMessage emsg = new ExpjMessage("ZZ01106");
                 sysLog.severe(emsg, getsysUSER_CD());
                 ExpjException ee = new ExpjException(se, emsg);
                 emsg = new ExpjMessage("ZZ01006", tableAndKeys);
                 sysLog.severe(emsg, getsysUSER_CD());
                 emsg = new ExpjMessage("ZZ01006", se.toString());
                 sysLog.severe(emsg, getsysUSER_CD());
                 throw ee;
                }
              
                //}}user_implement_dev:<controlSelect>
		logger.exiting("AN0080010Control"+":USER="+struct.getsUser_ID(),"controlSelect");

		return;
	}

	/**
	 * 更新ボタン押下時に実行される処理です。
	 *
	 */
	public void controlUpdate() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AN0080");
		logger.entering("AN0080010Control"+":USER="+struct.getsUser_ID(),"controlUpdate");
			//{{user_implement_dev:<controlUpdate>
              
                String tableAndKeys = null;
                try {
                 List workList = null;
                 AN0080010Struct workStruct = null;
                 int dummyRet = 0;
              
                 // トランザクションを開始
                 conn.beginTransWeb();
              
                 // 出庫指示番号採番
                 if (struct.getISSUE_INST_CD().equals(struct.geth_ISSUE_INST_CD()) == false) {
                  // 更新数をチェック
                  tableAndKeys = "SYS_ISSUE_INST_CD_CTRL.PLANT_CD:" + struct.getPLANT_CD();
                  workList = entity.mSelectForUpdateISSUE_INST_CD.read(conn, struct);
                  if (workList == null || workList.isEmpty()) {
                   // 更新数が変更されていた場合（削除済だった場合）
                   doModifyError(tableAndKeys);
                   return;
                  }
                  workStruct = (AN0080010Struct)workList.get(0);
                  if (workStruct.geth_IssueInst_MODIFY_COUNT().equals(
                    struct.geth_IssueInst_MODIFY_COUNT()) == false) {
                   // 更新数が変更されていた場合
                   doModifyError(tableAndKeys);
                   return;
                  }
                  // 出庫指示番号採番を更新
                  tableAndKeys = "SYS_ISSUE_INST_CD_CTRL.PLANT_CD:" + struct.getPLANT_CD();
                  dummyRet = entity.mUpdateSYS_ISSUE_INST_CD_CTRL.update(conn, struct);
                 }
              
                 // 作業指示番号採番
                 if (struct.getOPR_INST_CD().equals(struct.geth_OPR_INST_CD()) == false) {
                  // 更新数をチェック
                  tableAndKeys = "SYS_OPR_INST_CD_CTRL.PLANT_CD:" + struct.getPLANT_CD();
                  workList = entity.mSelectForUpdateOPR_INST_CD.read(conn, struct);
                  if (workList == null || workList.isEmpty()) {
                   // 更新数が変更されていた場合（削除済だった場合）
                   doModifyError(tableAndKeys);
                   return;
                  }
                  workStruct = (AN0080010Struct)workList.get(0);
                  if (workStruct.geth_OprInst_MODIFY_COUNT().equals(
                    struct.geth_OprInst_MODIFY_COUNT()) == false) {
                   // 更新数が変更されていた場合
                   doModifyError(tableAndKeys);
                   return;
                  }
                  // 作業指示番号採番を更新
                  tableAndKeys = "SYS_OPR_INST_CD_CTRL.PLANT_CD:" + struct.getPLANT_CD();
                  dummyRet = entity.mUpdateSYS_OPR_INST_CD_CTRL.update(conn, struct);
                 }
              
                 // 発注番号採番
                 if (struct.getPUCH_ODR_CD().equals(struct.geth_PUCH_ODR_CD()) == false) {
                  // 更新数をチェック
                  tableAndKeys = "SYS_PUCH_ODR_CD_CTRL.PLANT_CD:" + struct.getPLANT_CD();
                  workList = entity.mSelectForUpdatePUCH_ODR_CD.read(conn, struct);
                  if (workList == null || workList.isEmpty()) {
                   // 更新数が変更されていた場合（削除済だった場合）
                   doModifyError(tableAndKeys);
                   return;
                  }
                  workStruct = (AN0080010Struct)workList.get(0);
                  if (workStruct.geth_PuchOdr_MODIFY_COUNT().equals(
                    struct.geth_PuchOdr_MODIFY_COUNT()) == false) {
                   // 更新数が変更されていた場合
                   doModifyError(tableAndKeys);
                   return;
                  }
                  // 発注番号採番を更新
                  tableAndKeys = "SYS_PUCH_ODR_CD_CTRL.PLANT_CD:" + struct.getPLANT_CD();
                  dummyRet = entity.mUpdateSYS_PUCH_ODR_CD_CTRL.update(conn, struct);
                 }
              
                 // 積送伝票番号採番
                 if (struct.getTRANSPORT_SLIP_CD().equals(struct.geth_TRANSPORT_SLIP_CD()) == false) {
                  // 更新数をチェック
                  tableAndKeys = "SYS_TRANSPORT_SLIP_CD_CTRL.PLANT_CD:" + struct.getPLANT_CD();
                  workList = entity.mSelectForUpdateTRANSPORT_SLIP_CD.read(conn, struct);
                  if (workList == null || workList.isEmpty()) {
                   // 更新数が変更されていた場合（削除済だった場合）
                   doModifyError(tableAndKeys);
                   return;
                  }
                  workStruct = (AN0080010Struct)workList.get(0);
                  if (workStruct.geth_TransportSlip_MODIFY_COUNT().equals(
                    struct.geth_TransportSlip_MODIFY_COUNT()) == false) {
                   // 更新数が変更されていた場合
                   doModifyError(tableAndKeys);
                   return;
                  }
                  // 積送伝票番号採番を更新
                  tableAndKeys = "SYS_TRANSPORT_SLIP_CD_CTRL.PLANT_CD:" + struct.getPLANT_CD();
                  dummyRet = entity.mUpdateSYS_TRANSPORT_SLIP_CD_CTRL.update(conn, struct);
                 }
              
                 // 製番採番
                 if (struct.getJOB_ODR_CD_PREFIX().equals(struct.geth_JOB_ODR_CD_PREFIX()) == false
                   || struct.getJOB_ODR_CD().equals(struct.geth_JOB_ODR_CD()) == false) {
                  // 更新数をチェック
                  tableAndKeys = "SYS_JOB_ODR_CD_CTRL.PLANT_CD:" + struct.getPLANT_CD();
                  workList = entity.mSelectForUpdateJOB_ODR_CD.read(conn, struct);
                  if (workList == null || workList.isEmpty()) {
                   // 更新数が変更されていた場合（削除済だった場合）
                   doModifyError(tableAndKeys);
                   return;
                  }
                  workStruct = (AN0080010Struct)workList.get(0);
                  if (workStruct.geth_JobOdr_MODIFY_COUNT().equals(
                    struct.geth_JobOdr_MODIFY_COUNT()) == false) {
                   // 更新数が変更されていた場合
                   doModifyError(tableAndKeys);
                   return;
                  }
                  // 製番採番を更新
                  tableAndKeys = "SYS_JOB_ODR_CD_CTRL.PLANT_CD:" + struct.getPLANT_CD();
                  dummyRet = entity.mUpdateSYS_JOB_ODR_CD_CTRL.update(conn, struct);
                 }
              
                 // 作業計画番号採番
                 if (struct.getWORK_ODR_CD().equals(struct.geth_WORK_ODR_CD()) == false) {
                  // 更新数をチェック
                  tableAndKeys = "SYS_WORK_ODR_CD_CTRL.PLANT_CD:" + struct.getPLANT_CD();
                  workList = entity.mSelectForUpdateWORK_ODR_CD.read(conn, struct);
                  if (workList == null || workList.isEmpty()) {
                   // 更新数が変更されていた場合（削除済だった場合）
                   doModifyError(tableAndKeys);
                   return;
                  }
                  workStruct = (AN0080010Struct)workList.get(0);
                  if (workStruct.geth_WorkOdr_MODIFY_COUNT().equals(
                    struct.geth_WorkOdr_MODIFY_COUNT()) == false) {
                   // 更新数が変更されていた場合
                   doModifyError(tableAndKeys);
                   return;
                  }
                  // 作業計画番号採番を更新
                  tableAndKeys = "SYS_WORK_ODR_CD_CTRL.PLANT_CD:" + struct.getPLANT_CD();
                  dummyRet = entity.mUpdateSYS_WORK_ODR_CD_CTRL.update(conn, struct);
                 }
              
                 // 外部計画番号採番
                 if (struct.getEXTERNAL_PLAN_CD().equals(struct.geth_EXTERNAL_PLAN_CD()) == false) {
                  // 更新数をチェック
                  tableAndKeys = "SYS_EXTERNAL_PLAN_CD_CTRL.PLANT_CD:" + struct.getPLANT_CD();
                  workList = entity.mSelectForUpdateEXTERNAL_PLAN_CD.read(conn, struct);
                  if (workList == null || workList.isEmpty()) {
                   // 更新数が変更されていた場合（削除済だった場合）
                   doModifyError(tableAndKeys);
                   return;
                  }
                  workStruct = (AN0080010Struct)workList.get(0);
                  if (workStruct.geth_ExternalPlan_MODIFY_COUNT().equals(
                    struct.geth_ExternalPlan_MODIFY_COUNT()) == false) {
                   // 更新数が変更されていた場合
                   doModifyError(tableAndKeys);
                   return;
                  }
                  // 外部計画番号採番を更新
                  tableAndKeys = "SYS_EXTERNAL_PLAN_CD_CTRL.PLANT_CD:" + struct.getPLANT_CD();
                  dummyRet = entity.mUpdateSYS_EXTERNAL_PLAN_CD_CTRL.update(conn, struct);
                 }
              
                 // データを確定
                 conn.commit();
              
                 // 更新後のデータを表示
                 controlSelect();
              
                } catch (SQLException se) {
                 // エラー：サーバでエラーが発生しました。
                 ExpjMessage emsg = new ExpjMessage("ZZ01106");
                 sysLog.severe(emsg, getsysUSER_CD());
                 ExpjException ee = new ExpjException(se, emsg);
                 emsg = new ExpjMessage("ZZ01006", tableAndKeys);
                 sysLog.severe(emsg, getsysUSER_CD());
                 emsg = new ExpjMessage("ZZ01006", se.toString());
                 sysLog.severe(emsg, getsysUSER_CD());
                 throw ee;
                } finally {
                 if (conn != null) {
                  conn.rollback();
                 }
                }
              
                //}}user_implement_dev:<controlUpdate>
		logger.exiting("AN0080010Control"+":USER="+struct.getsUser_ID(),"controlUpdate");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AN0080");
		logger.entering("AN0080010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
              
                // 画面を初期化
                initializeScreen();
              
                //}}user_implement_dev:<controlClear>
		logger.exiting("AN0080010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * 閉じるボタン押下時に実行される処理です。
	 *
	 */
	public void controlClose() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AN0080");
		logger.entering("AN0080010Control"+":USER="+struct.getsUser_ID(),"controlClose");
			//{{user_implement_dev:<controlClose>
                 // TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlClose>
		logger.exiting("AN0080010Control"+":USER="+struct.getsUser_ID(),"controlClose");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AN0080");
		logger.entering("AN0080010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
                 // TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AN0080010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AN0080");
		logger.entering("AN0080010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
              
                // 画面を初期化
                initializeScreen();
              
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AN0080010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * イベントハンドラの前処理です。
	 *
	 * @param buttun ボタン名
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AN0080");
		logger.entering("AN0080010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
		logger.exiting("AN0080010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			if( button.equals("Select") ) {
				controlSelect();
			} else if( button.equals("Update") ) {
				controlUpdate();
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
              //		ソース内にまだAlarmMessageExceptionが残っている場合は、以下の行のコメントを外してAlarmMessageExceptionを始末する。
              //		} catch(AlarmMessageException ame){
              //			ExpjException ee = new ExpjException(ame, (ExpjMessageList)((Object)ame.getMessages()));
              //			throw ee;
                //}}user_implement_dev:<control_eventHandller>
		} catch( BusinessLockException ble ) {
			// 枠メッセージ出力依頼作成
			setNewDataFlg(false);
		} catch( ResourceBusyException rbe ) {
			ExpjException ee = new ExpjException(rbe, "ZZ01105");
			throw ee;
		} catch( FoundationException e ) {
//			e.printStackTrace();
//			throw new FoundationException("AN0080010Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AN0080010-E999","CSVの出力処理"));
			throw new FoundationException("AN0080010Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AN0080010-E999","システム日付の取得処理"));
				throw new FoundationException("AN0080010Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
                 // TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AN0080010-E999","コントロールのイベント処理"));
			throw new FoundationException("AN0080010Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected AN0080010Entity entity;
	protected AN0080010Struct struct;
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

		entity = new AN0080010Entity();
		struct = new AN0080010Struct();

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
	 * AN0080010クラスの標準コンストラクタ
	 */
	public AN0080010Control() throws BusinessProcessException, FoundationException
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
				AN0080010Struct key = (AN0080010Struct)keyList.get(j);
				// メッセージキーを作成する
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("ISSUE_INST_CD") && key.getISSUE_INST_CD() != null) {
					msgKey.setKeyValue("ISSUE_INST_CD", key.getISSUE_INST_CD());
				}
				if(msgKeyType.containsKeyColumn("h_IssueInst_MODIFY_COUNT") && key.geth_IssueInst_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("h_IssueInst_MODIFY_COUNT", key.geth_IssueInst_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_CD") && key.getOPR_INST_CD() != null) {
					msgKey.setKeyValue("OPR_INST_CD", key.getOPR_INST_CD());
				}
				if(msgKeyType.containsKeyColumn("h_OprInst_MODIFY_COUNT") && key.geth_OprInst_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("h_OprInst_MODIFY_COUNT", key.geth_OprInst_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_CD") && key.getPUCH_ODR_CD() != null) {
					msgKey.setKeyValue("PUCH_ODR_CD", key.getPUCH_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("h_PuchOdr_MODIFY_COUNT") && key.geth_PuchOdr_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("h_PuchOdr_MODIFY_COUNT", key.geth_PuchOdr_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("TRANSPORT_SLIP_CD") && key.getTRANSPORT_SLIP_CD() != null) {
					msgKey.setKeyValue("TRANSPORT_SLIP_CD", key.getTRANSPORT_SLIP_CD());
				}
				if(msgKeyType.containsKeyColumn("h_TransportSlip_MODIFY_COUNT") && key.geth_TransportSlip_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("h_TransportSlip_MODIFY_COUNT", key.geth_TransportSlip_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_CD_PREFIX") && key.getJOB_ODR_CD_PREFIX() != null) {
					msgKey.setKeyValue("JOB_ODR_CD_PREFIX", key.getJOB_ODR_CD_PREFIX());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_CD") && key.getJOB_ODR_CD() != null) {
					msgKey.setKeyValue("JOB_ODR_CD", key.getJOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("h_JobOdr_MODIFY_COUNT") && key.geth_JobOdr_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("h_JobOdr_MODIFY_COUNT", key.geth_JobOdr_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("WORK_ODR_CD") && key.getWORK_ODR_CD() != null) {
					msgKey.setKeyValue("WORK_ODR_CD", key.getWORK_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("h_WorkOdr_MODIFY_COUNT") && key.geth_WorkOdr_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("h_WorkOdr_MODIFY_COUNT", key.geth_WorkOdr_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("EXTERNAL_PLAN_CD") && key.getEXTERNAL_PLAN_CD() != null) {
					msgKey.setKeyValue("EXTERNAL_PLAN_CD", key.getEXTERNAL_PLAN_CD());
				}
				if(msgKeyType.containsKeyColumn("h_ExternalPlan_MODIFY_COUNT") && key.geth_ExternalPlan_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("h_ExternalPlan_MODIFY_COUNT", key.geth_ExternalPlan_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("PLANT_NAME") && key.getPLANT_NAME() != null) {
					msgKey.setKeyValue("PLANT_NAME", key.getPLANT_NAME());
				}
				if(msgKeyType.containsKeyColumn("h_ISSUE_INST_CD") && key.geth_ISSUE_INST_CD() != null) {
					msgKey.setKeyValue("h_ISSUE_INST_CD", key.geth_ISSUE_INST_CD());
				}
				if(msgKeyType.containsKeyColumn("h_OPR_INST_CD") && key.geth_OPR_INST_CD() != null) {
					msgKey.setKeyValue("h_OPR_INST_CD", key.geth_OPR_INST_CD());
				}
				if(msgKeyType.containsKeyColumn("h_WORK_ODR_CD") && key.geth_WORK_ODR_CD() != null) {
					msgKey.setKeyValue("h_WORK_ODR_CD", key.geth_WORK_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("h_PUCH_ODR_CD") && key.geth_PUCH_ODR_CD() != null) {
					msgKey.setKeyValue("h_PUCH_ODR_CD", key.geth_PUCH_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("h_TRANSPORT_SLIP_CD") && key.geth_TRANSPORT_SLIP_CD() != null) {
					msgKey.setKeyValue("h_TRANSPORT_SLIP_CD", key.geth_TRANSPORT_SLIP_CD());
				}
				if(msgKeyType.containsKeyColumn("h_EXTERNAL_PLAN_CD") && key.geth_EXTERNAL_PLAN_CD() != null) {
					msgKey.setKeyValue("h_EXTERNAL_PLAN_CD", key.geth_EXTERNAL_PLAN_CD());
				}
				if(msgKeyType.containsKeyColumn("h_JOB_ODR_CD_PREFIX") && key.geth_JOB_ODR_CD_PREFIX() != null) {
					msgKey.setKeyValue("h_JOB_ODR_CD_PREFIX", key.geth_JOB_ODR_CD_PREFIX());
				}
				if(msgKeyType.containsKeyColumn("h_JOB_ODR_CD") && key.geth_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("h_JOB_ODR_CD", key.geth_JOB_ODR_CD());
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
					AN0080010Struct key = new AN0080010Struct();
					if(msgKeyType.containsKeyColumn("ISSUE_INST_CD")) {
						key.setISSUE_INST_CD(msgKey.getKeyValue("ISSUE_INST_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_IssueInst_MODIFY_COUNT")) {
						key.seth_IssueInst_MODIFY_COUNT(msgKey.getKeyValue("h_IssueInst_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_CD")) {
						key.setOPR_INST_CD(msgKey.getKeyValue("OPR_INST_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_OprInst_MODIFY_COUNT")) {
						key.seth_OprInst_MODIFY_COUNT(msgKey.getKeyValue("h_OprInst_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_CD")) {
						key.setPUCH_ODR_CD(msgKey.getKeyValue("PUCH_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_PuchOdr_MODIFY_COUNT")) {
						key.seth_PuchOdr_MODIFY_COUNT(msgKey.getKeyValue("h_PuchOdr_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("TRANSPORT_SLIP_CD")) {
						key.setTRANSPORT_SLIP_CD(msgKey.getKeyValue("TRANSPORT_SLIP_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_TransportSlip_MODIFY_COUNT")) {
						key.seth_TransportSlip_MODIFY_COUNT(msgKey.getKeyValue("h_TransportSlip_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_CD_PREFIX")) {
						key.setJOB_ODR_CD_PREFIX(msgKey.getKeyValue("JOB_ODR_CD_PREFIX"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_CD")) {
						key.setJOB_ODR_CD(msgKey.getKeyValue("JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_JobOdr_MODIFY_COUNT")) {
						key.seth_JobOdr_MODIFY_COUNT(msgKey.getKeyValue("h_JobOdr_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("WORK_ODR_CD")) {
						key.setWORK_ODR_CD(msgKey.getKeyValue("WORK_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_WorkOdr_MODIFY_COUNT")) {
						key.seth_WorkOdr_MODIFY_COUNT(msgKey.getKeyValue("h_WorkOdr_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("EXTERNAL_PLAN_CD")) {
						key.setEXTERNAL_PLAN_CD(msgKey.getKeyValue("EXTERNAL_PLAN_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_ExternalPlan_MODIFY_COUNT")) {
						key.seth_ExternalPlan_MODIFY_COUNT(msgKey.getKeyValue("h_ExternalPlan_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_NAME")) {
						key.setPLANT_NAME(msgKey.getKeyValue("PLANT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("h_ISSUE_INST_CD")) {
						key.seth_ISSUE_INST_CD(msgKey.getKeyValue("h_ISSUE_INST_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_OPR_INST_CD")) {
						key.seth_OPR_INST_CD(msgKey.getKeyValue("h_OPR_INST_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_WORK_ODR_CD")) {
						key.seth_WORK_ODR_CD(msgKey.getKeyValue("h_WORK_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_PUCH_ODR_CD")) {
						key.seth_PUCH_ODR_CD(msgKey.getKeyValue("h_PUCH_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_TRANSPORT_SLIP_CD")) {
						key.seth_TRANSPORT_SLIP_CD(msgKey.getKeyValue("h_TRANSPORT_SLIP_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_EXTERNAL_PLAN_CD")) {
						key.seth_EXTERNAL_PLAN_CD(msgKey.getKeyValue("h_EXTERNAL_PLAN_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_JOB_ODR_CD_PREFIX")) {
						key.seth_JOB_ODR_CD_PREFIX(msgKey.getKeyValue("h_JOB_ODR_CD_PREFIX"));
					}
					if(msgKeyType.containsKeyColumn("h_JOB_ODR_CD")) {
						key.seth_JOB_ODR_CD(msgKey.getKeyValue("h_JOB_ODR_CD"));
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
