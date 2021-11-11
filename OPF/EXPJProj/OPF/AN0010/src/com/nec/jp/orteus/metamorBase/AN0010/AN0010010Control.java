/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AN0010/src/com/nec/jp/orteus/metamorBase/AN0010/AN0010010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AN0010;

import com.nec.jp.orteus.metamorBase.AN0010.*;
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

public class AN0010010Control
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
        public AN0010010Struct getListvalue(int x) { return (AN0010010Struct)(this.list.get(x)); }	// リストの値を返します。
        public AN0010010Struct getStruct() { return this.struct; }	// Structを返します。
        public AN0010010Struct createStruct() { return new AN0010010Struct(); }	// 新しいStructを作って返します。
        public void setStruct(Object structname) { this.struct.setStruct((AN0010010Struct)structname); }	// Structをセットします。
        public void initializeStruct() { this.struct.initialize(); }	// Structの値を初期化します。
       
        // CSV出力用リスト
        private CsvWriter csvWriter = null;
        public CsvWriter getCsvWriter(){ return this.csvWriter; }
       
        private CsvReader csvReader = null;
        public void setCsvReader(CsvReader cr){ this.csvReader = cr; }
       
        /**
         * 更新数例外クラスです。
         */
        private class AN0010010ModifyCountException extends ExpjBadException
        {
         /**
             * AN0010010ModifyCountException オブジェクトを構築します。
          */
         private AN0010010ModifyCountException()
         {
          super();
         }
        }
       
        /**
         * 画面を初期化します。
         */
        private void initializeScreen()
        {
         // structを初期化
         struct.initialize();
       
         // listを初期化
         if (list != null) {
          list.clear();
         }
       
         // 読込状態（初期状態）を設定
         setReadStatus(INITIAL);
        }
       
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * 読込ボタン押下時に実行される処理です。
	 *
	 */
	public void controlSelect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AN0010");
		logger.entering("AN0010010Control"+":USER="+struct.getsUser_ID(),"controlSelect");
			//{{user_implement_dev:<controlSelect>
              
                String tableAndKeys = null;
              
                try {
                 AN0010010Struct workStruct = null;
              
                 // 読込キーを残して、Structをクリア
                 String programCd = struct.getPROGRAM_CD();
                 initializeScreen();
                 struct.setPROGRAM_CD(programCd);
              
                 // 業務ロック元を退避
                 struct.seth_PROGRAM_CD(struct.getPROGRAM_CD());
              
                 // 業務ロック元を検索
                 tableAndKeys = "SYS_OBJECTS.PROGRAM_CD:" + struct.getPROGRAM_CD();
                 List workList = entity.mSelectSYS_OBJECTS.read(conn, struct);
                 if (workList == null || workList.isEmpty()) {
                  // 読込状態（読込失敗）を設定
                  setReadStatus(ERROR);
                  //「業務ロック元」が［オブジェクト］に存在しない場合
                  // 警告：業務ロック元が存在しません。
                  ExpjMessage emsg = new ExpjMessage("AN01002");
                  msgStruct.addError(emsg);
                  sysLog.warning(emsg, getsysUSER_CD());
                  emsg = new ExpjMessage("ZZ01006", tableAndKeys);
                  msgStruct.addError(emsg);
                  sysLog.warning(emsg, getsysUSER_CD());
                  return;
                 }
              
                 // 業務ロック元名をセット
                 workStruct = (AN0010010Struct)workList.get(0);
                 struct.setPROGRAM_NAME(workStruct.getPROGRAM_NAME());
              
                 // 業務ロックを検索
                 tableAndKeys = "SYS_OBJECTS.PROGRAM_CD,SYS_BUSINESS_LOCK.MODE_FORM_FROM_NAME:"
                   + struct.getPROGRAM_CD();
                 list = entity.mSelect.read(conn, struct);
                 if (list == null || list.isEmpty()) {
                  // 読込状態（０件読込）を設定
                  setReadStatus(NOT_FOUND);
                  // 警告：対象データが存在しません。
                  ExpjMessage emsg = new ExpjMessage("ZZ06001");
                  msgStruct.addError(emsg);
                  sysLog.warning(emsg, getsysUSER_CD());
                  emsg = new ExpjMessage("ZZ01006", tableAndKeys);
                  msgStruct.addError(emsg);
                  sysLog.warning(emsg, getsysUSER_CD());
                  return;
                 }
              
                 // 表示対象工場区分を退避
                 int listSize = list.size();
                 struct.seth_ExistSysBusinessLock("false");
                 for (int i = 0; i < listSize; i++) {
                  workStruct = (AN0010010Struct)list.get(i);
                  workStruct.seth_TARGET_PLANT_TYP(workStruct.getTARGET_PLANT_TYP());
                  if (workStruct.getTARGET_PLANT_TYP().equals("0") == false) {
                   struct.seth_ExistSysBusinessLock("true");
                  }
                 }
              
                 // 読込状態（読込成功）を設定
                 setReadStatus(NORMAL);
              
                } catch (SQLException se) {
                 // 読込状態（読込失敗）を設定
                 setReadStatus(ERROR);
                 // エラー：サーバでエラーが発生しました。
                 ExpjMessage emsg = new ExpjMessage("ZZ01106");
                 sysLog.severe(emsg, getsysUSER_CD());
                 ExpjException ee = new ExpjException(se, emsg);
                 ee.setLocale(CoreTools.getLocale(getsysUSER_CD()));
                 emsg = new ExpjMessage("ZZ01006", tableAndKeys);
                 sysLog.severe(emsg, getsysUSER_CD());
                 emsg = new ExpjMessage("ZZ01006", se.toString());
                 sysLog.severe(emsg, getsysUSER_CD());
                 throw ee;
                }
              
                //}}user_implement_dev:<controlSelect>
		logger.exiting("AN0010010Control"+":USER="+struct.getsUser_ID(),"controlSelect");

		return;
	}

	/**
	 * 登録ボタン押下時に実行される処理です。
	 *
	 */
	public void controlInsert() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AN0010");
		logger.entering("AN0010010Control"+":USER="+struct.getsUser_ID(),"controlInsert");
			//{{user_implement_dev:<controlInsert>
              
                String tableAndKeys = null;
              
                try {
                 List workList = null;
                 AN0010010Struct workStruct = null;
                 int dummyRet = 0;
              
                 if (struct.getPROGRAM_CD().equals(struct.geth_PROGRAM_CD()) == false) {
                  // 業務ロック元名をクリア
                  struct.setPROGRAM_NAME(null);
                 }
              
                 // トランザクションを開始
                 conn.beginTransWeb();
              
                 // 画面入力項目を取得
                 List lProgramCdList = struct.getList_l_PROGRAM_CD();
                 List lProgramNameList = struct.getList_l_PROGRAM_NAME();
                 List targetPlantTypList = struct.getList_TARGET_PLANT_TYP();
                 List hTargetPlantTypList = struct.getList_h_TARGET_PLANT_TYP();
                 List hChangeableTypList = struct.getList_h_CHANGEABLE_TYP();
                 List hModifuCountList = struct.getList_h_MODIFY_COUNT();
                 List hTargetPlantTyp2List = struct.getList_h_TARGET_PLANT_TYP2();
                 List hModifuCount2List = struct.getList_h_MODIFY_COUNT2();
              
                 // エラー発生時の再表示のため、手入力データを保持
                 // listに画面入力項目を退避
                 if (list == null) {
                  list = new ArrayList(0);
                 } else {
                  list.clear();
                 }
                 int lProgramCdListSize = lProgramCdList.size();
                 for (int i = 0; i < lProgramCdListSize; i++) {
                  workStruct = new AN0010010Struct();
                  workStruct.setl_PROGRAM_CD((String)lProgramCdList.get(i));
                  workStruct.setl_PROGRAM_NAME((String)lProgramNameList.get(i));
                  workStruct.setTARGET_PLANT_TYP((String)targetPlantTypList.get(i));
                  workStruct.seth_TARGET_PLANT_TYP((String)hTargetPlantTypList.get(i));
                  workStruct.seth_CHANGEABLE_TYP((String)hChangeableTypList.get(i));
                  workStruct.seth_MODIFY_COUNT((String)hModifuCountList.get(i));
                  workStruct.seth_TARGET_PLANT_TYP2((String)hTargetPlantTyp2List.get(i));
                  workStruct.seth_MODIFY_COUNT2((String)hModifuCount2List.get(i));
                  list.add(workStruct);
                 }
              
                 // オブジェクトを検索
                 tableAndKeys = "SYS_OBJECTS.PROGRAM_CD:" + struct.getPROGRAM_CD();
                 workList = entity.mSelectSYS_OBJECTS.read(conn, struct);
                 if (workList == null || workList.isEmpty()) {
                  //「業務ロック元」が［オブジェクト］に存在しない場合
                  // 警告：業務ロック元が存在しません。
                  ExpjMessage emsg = new ExpjMessage("AN01002");
                  msgStruct.addError(emsg);
                  sysLog.warning(emsg, getsysUSER_CD());
                  emsg = new ExpjMessage("ZZ01006", tableAndKeys);
                  msgStruct.addError(emsg);
                  sysLog.warning(emsg, getsysUSER_CD());
                  return;
                 }
              
                 // 業務ロック元名を表示
                 workStruct = (AN0010010Struct)workList.get(0);
                 struct.setPROGRAM_NAME(workStruct.getPROGRAM_NAME());
              
                 // 業務ロックを検索
                 tableAndKeys = "SYS_BUSINESS_LOCK.MODE_FORM_FROM_NAME:" + struct.getPROGRAM_CD();
                 if (entity.mInsertSYS_BUSINESS_LOCK.check(conn, struct) == true) {
                  //「業務ロック元」が［業務ロック］に存在する場合
                  // 警告：指定キーのデータがすでに存在します。
                  ExpjMessage emsg = new ExpjMessage("ZZ01102");
                  msgStruct.addError(emsg);
                  sysLog.warning(emsg, getsysUSER_CD());
                  emsg = new ExpjMessage("ZZ01006", tableAndKeys);
                  msgStruct.addError(emsg);
                  sysLog.warning(emsg, getsysUSER_CD());
                  return;
                 }
              
                 // 登録処理ボタン押下時のＤＢ処理を実行
                 int listSize = list.size();
                 for (int i = 0; i < listSize; i++) {
                  workStruct = (AN0010010Struct)list.get(i);
                  if (workStruct.getTARGET_PLANT_TYP().equals("0") == true) {
                   // 入力されなかった行の場合
                   continue;
                  }
              
                  struct.setl_PROGRAM_CD(workStruct.getl_PROGRAM_CD());
                  struct.setl_PROGRAM_NAME(workStruct.getl_PROGRAM_NAME());
                  struct.setTARGET_PLANT_TYP(workStruct.getTARGET_PLANT_TYP());
                  struct.seth_TARGET_PLANT_TYP(workStruct.geth_TARGET_PLANT_TYP());
                  struct.seth_CHANGEABLE_TYP(workStruct.geth_CHANGEABLE_TYP());
                  struct.seth_MODIFY_COUNT(workStruct.geth_MODIFY_COUNT());
                  struct.seth_TARGET_PLANT_TYP2(workStruct.geth_TARGET_PLANT_TYP2());
                  struct.seth_MODIFY_COUNT2(workStruct.geth_MODIFY_COUNT2());
              
                  // 表示データを処理
                  tableAndKeys = "SYS_BUSINESS_LOCK.MODE_FORM_FROM_NAME,MODE_FORM_TO_NAME:"
                    + struct.getPROGRAM_CD() + "," + struct.getl_PROGRAM_CD();
                  dummyRet = entity.mInsertSYS_BUSINESS_LOCK.create(conn, struct);
              
                  if (struct.getPROGRAM_CD().equals(struct.getl_PROGRAM_CD()) == true) {
                   // 業務ロック元と業務ロック先が等しい場合
                   continue;
                  }
              
                  // 対称データを処理
                  String modeFormFromName = struct.getPROGRAM_CD();
                  String modeFormToName = struct.getl_PROGRAM_CD();
              
                  // 元・先を入替
                  struct.setPROGRAM_CD(modeFormToName);
                  struct.setl_PROGRAM_CD(modeFormFromName);
              
                  try {
                   tableAndKeys = "SYS_BUSINESS_LOCK.MODE_FORM_FROM_NAME,MODE_FORM_TO_NAME:"
                     + struct.getPROGRAM_CD() + "," + struct.getl_PROGRAM_CD();
                   dummyRet = entity.mInsertSYS_BUSINESS_LOCK.create(conn, struct);
                  } catch (SQLException se) {
                   if (se.getErrorCode() != 1) {
                    // キー重複以外の場合
                    throw se;
                   }
                   // 既に存在した場合は更新処理
                   dummyRet = entity.mUpdateSYS_BUSINESS_LOCK.update(conn, struct);
                  }
              
                  // 元・先を復元
                  struct.setPROGRAM_CD(modeFormFromName);
                  struct.setl_PROGRAM_CD(modeFormToName);
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
                 ee.setLocale(CoreTools.getLocale(getsysUSER_CD()));
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
              
                //}}user_implement_dev:<controlInsert>
		logger.exiting("AN0010010Control"+":USER="+struct.getsUser_ID(),"controlInsert");

		return;
	}

	/**
	 * 更新ボタン押下時に実行される処理です。
	 *
	 */
	public void controlUpdate() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AN0010");
		logger.entering("AN0010010Control"+":USER="+struct.getsUser_ID(),"controlUpdate");
			//{{user_implement_dev:<controlUpdate>
              
                String tableAndKeys = null;
              
                try {
                 List workList = null;
                 AN0010010Struct workStruct = null;
                 int dummyRet = 0;
              
                 // トランザクションを開始
                 conn.beginTransWeb();
              
                 // 画面入力項目を取得
                 List lProgramCdList = struct.getList_l_PROGRAM_CD();
                 List lProgramNameList = struct.getList_l_PROGRAM_NAME();
                 List targetPlantTypList = struct.getList_TARGET_PLANT_TYP();
                 List hTargetPlantTypList = struct.getList_h_TARGET_PLANT_TYP();
                 List hChangeableTypList = struct.getList_h_CHANGEABLE_TYP();
                 List hModifuCountList = struct.getList_h_MODIFY_COUNT();
                 List hTargetPlantTyp2List = struct.getList_h_TARGET_PLANT_TYP2();
                 List hModifuCount2List = struct.getList_h_MODIFY_COUNT2();
              
                 // エラー発生時の再表示のため、手入力データを保持
                 // listに画面入力項目を退避
                 if (list == null) {
                  list = new ArrayList(0);
                 } else {
                  list.clear();
                 }
                 int lProgramCdListSize = lProgramCdList.size();
                 for (int i = 0; i < lProgramCdListSize; i++) {
                  workStruct = new AN0010010Struct();
                  workStruct.setl_PROGRAM_CD((String)lProgramCdList.get(i));
                  workStruct.setl_PROGRAM_NAME((String)lProgramNameList.get(i));
                  workStruct.setTARGET_PLANT_TYP((String)targetPlantTypList.get(i));
                  workStruct.seth_TARGET_PLANT_TYP((String)hTargetPlantTypList.get(i));
                  workStruct.seth_CHANGEABLE_TYP((String)hChangeableTypList.get(i));
                  workStruct.seth_MODIFY_COUNT((String)hModifuCountList.get(i));
                  workStruct.seth_TARGET_PLANT_TYP2((String)hTargetPlantTyp2List.get(i));
                  workStruct.seth_MODIFY_COUNT2((String)hModifuCount2List.get(i));
                  list.add(workStruct);
                 }
              
                 // 更新処理ボタン押下時のＤＢ処理を実行
                 int listSize = list.size();
                 for (int i = 0; i < listSize; i++) {
                  workStruct = (AN0010010Struct)list.get(i);
                  if (workStruct.getTARGET_PLANT_TYP().equals(
                    workStruct.geth_TARGET_PLANT_TYP()) == true)
                  {
                   // 更新されなかった行の場合
                   continue;
                  }
              
                  struct.setl_PROGRAM_CD(workStruct.getl_PROGRAM_CD());
                  struct.setl_PROGRAM_NAME(workStruct.getl_PROGRAM_NAME());
                  struct.setTARGET_PLANT_TYP(workStruct.getTARGET_PLANT_TYP());
                  struct.seth_TARGET_PLANT_TYP(workStruct.geth_TARGET_PLANT_TYP());
                  struct.seth_CHANGEABLE_TYP(workStruct.geth_CHANGEABLE_TYP());
                  struct.seth_MODIFY_COUNT(workStruct.geth_MODIFY_COUNT());
                  struct.seth_TARGET_PLANT_TYP2(workStruct.geth_TARGET_PLANT_TYP2());
                  struct.seth_MODIFY_COUNT2(workStruct.geth_MODIFY_COUNT2());
              
                  if (struct.getTARGET_PLANT_TYP().equals("0") == true) {
              
                   // 削除処理（更新された対象工場区分が"0"ならば、削除を意味する）
                   tableAndKeys = "SYS_BUSINESS_LOCK.MODE_FORM_FROM_NAME,MODE_FORM_TO_NAME:"
                     + struct.getPROGRAM_CD() + "," + struct.getl_PROGRAM_CD();
              
                   // データ更新可否をチェックおよび更新対象レコードをロック
                   // [業務ロック]."更新数"を取得し、
                   // 更新対象レコードの存在の可否、一覧取得時の値との一致を調べる。
                   workList = entity.mSelectForUpdate.read(conn, struct);
                   if (workList == null || workList.isEmpty()) {
                    // 更新対象レコードが存在しない場合
                    throw new AN0010010ModifyCountException();
                   }
              
                   workStruct = (AN0010010Struct)workList.get(0);
                   if (workStruct.geth_MODIFY_COUNT().equals(
                     struct.geth_MODIFY_COUNT()) == false)
                   {
                    // 更新数が変更されていた場合
                    throw new AN0010010ModifyCountException();
                   }
              
                   // 削除処理を実行
                   dummyRet = entity.mDeleteSYS_BUSINESS_LOCK.delete(conn, struct);
              
                   if (struct.geth_TARGET_PLANT_TYP2().equals("0") == true
                     || struct.getPROGRAM_CD().equals(struct.getl_PROGRAM_CD()) == true)
                   {
                    // 業務ロック元の対象工場区分が"0"か、
                    // 業務ロック元と業務ロック先が等しい場合
                    continue;
                   }
              
                   // 対称データを処理
                   String modeFormFromName = struct.getPROGRAM_CD();
                   String modeFormToName = struct.getl_PROGRAM_CD();
              
                   // 元・先を入替
                   struct.setPROGRAM_CD(modeFormToName);
                   struct.setl_PROGRAM_CD(modeFormFromName);
              
                   tableAndKeys = "SYS_BUSINESS_LOCK.MODE_FORM_FROM_NAME,MODE_FORM_TO_NAME:"
                     + struct.getPROGRAM_CD() + "," + struct.getl_PROGRAM_CD();
              
                   // データ更新可否をチェックおよび更新対象レコードをロック
                   // [業務ロック]."更新数"を取得し、
                   // 更新対象レコードの存在の可否、一覧取得時の値との一致を調べる。
                   workList = entity.mSelectForUpdate.read(conn, struct);
                   if (workList == null || workList.isEmpty()) {
                    // 更新対象レコードが存在しない場合
                    struct.setPROGRAM_CD(modeFormFromName);
                    struct.setl_PROGRAM_CD(modeFormToName);
                    throw new AN0010010ModifyCountException();
                   }
              
                   workStruct = (AN0010010Struct)workList.get(0);
                   if (workStruct.geth_MODIFY_COUNT().equals(
                     struct.geth_MODIFY_COUNT2()) == false)
                   {
                    // 更新数が変更されていた場合
                    struct.setPROGRAM_CD(modeFormFromName);
                    struct.setl_PROGRAM_CD(modeFormToName);
                    throw new AN0010010ModifyCountException();
                   }
              
                   // 削除処理を実行
                   dummyRet = entity.mDeleteSYS_BUSINESS_LOCK.delete(conn, struct);
              
                   struct.setPROGRAM_CD(modeFormFromName);
                   struct.setl_PROGRAM_CD(modeFormToName);
              
                  } else {
              
                   tableAndKeys = "SYS_BUSINESS_LOCK.MODE_FORM_FROM_NAME,MODE_FORM_TO_NAME:"
                     + struct.getPROGRAM_CD() + "," + struct.getl_PROGRAM_CD();
              
                   if (struct.geth_TARGET_PLANT_TYP().equals("0") == true) {
                    // 登録処理（更新前の対象工場区分が"0"ならば、登録を意味する）
              
                    // 登録処理を実行
                    try {
                     dummyRet = entity.mInsertSYS_BUSINESS_LOCK.create(conn, struct);
                    } catch (SQLException se) {
                     if (se.getErrorCode() != 1) {
                      // キー重複以外の場合
                      throw se;
                     }
                     // 警告：指定キーのデータがすでに存在します。
                     ExpjMessage emsg = new ExpjMessage("ZZ01102");
                     msgStruct.addError(emsg);
                     sysLog.warning(emsg, getsysUSER_CD());
                     emsg = new ExpjMessage("ZZ01006", tableAndKeys);
                     msgStruct.addError(emsg);
                     sysLog.warning(emsg, getsysUSER_CD());
                     return;
                    }
                   } else {
                    // 更新処理（更新前の対象工場区分が"0"以外ならば、更新を意味する）
              
                    // データ更新可否をチェックおよび更新対象レコードをロック
                    // [業務ロック]."更新数"を取得し、
                    // 更新対象レコードの存在の可否、一覧取得時の値との一致を調べる。
                    workList = entity.mSelectForUpdate.read(conn, struct);
                    if (workList == null || workList.isEmpty()) {
                     // 更新対象レコードが存在しない場合
                     throw new AN0010010ModifyCountException();
                    }
              
                    workStruct = (AN0010010Struct)workList.get(0);
                    if (workStruct.geth_MODIFY_COUNT().equals(
                      struct.geth_MODIFY_COUNT()) == false)
                    {
                     // 更新数が変更されていた場合
                     throw new AN0010010ModifyCountException();
                    }
              
                    // 更新処理を実行
                    dummyRet = entity.mUpdateSYS_BUSINESS_LOCK.update(conn, struct);
                   }
              
                   if (struct.getPROGRAM_CD().equals(struct.getl_PROGRAM_CD()) == true) {
                    // 業務ロック元と業務ロック先が等しい場合
                    continue;
                   }
              
                   // 対称データを処理
                   String modeFormFromName = struct.getPROGRAM_CD();
                   String modeFormToName = struct.getl_PROGRAM_CD();
              
                   struct.setPROGRAM_CD(modeFormToName);
                   struct.setl_PROGRAM_CD(modeFormFromName);
              
                   tableAndKeys = "SYS_BUSINESS_LOCK.MODE_FORM_FROM_NAME,MODE_FORM_TO_NAME:"
                     + struct.getPROGRAM_CD() + "," + struct.getl_PROGRAM_CD();
                   if (struct.geth_TARGET_PLANT_TYP2().equals("0") == true) {
                    // 登録処理（更新前の対象工場区分が"0"ならば、登録を意味する）
              
                    // 登録処理を実行
                    try {
                     dummyRet = entity.mInsertSYS_BUSINESS_LOCK.create(conn, struct);
                    } catch (SQLException se) {
                     if (se.getErrorCode() != 1) {
                      // キー重複以外の場合
                      throw se;
                     }
                     struct.setPROGRAM_CD(modeFormFromName);
                     struct.setl_PROGRAM_CD(modeFormToName);
                     // 警告：指定キーのデータがすでに存在します。
                     ExpjMessage emsg = new ExpjMessage("ZZ01102");
                     msgStruct.addError(emsg);
                     sysLog.warning(emsg, getsysUSER_CD());
                     emsg = new ExpjMessage("ZZ01006", tableAndKeys);
                     msgStruct.addError(emsg);
                     sysLog.warning(emsg, getsysUSER_CD());
                     return;
                    }
              
                   } else {
                    // 更新処理（更新前の対象工場区分が"0"以外ならば、更新を意味する）
              
                    // データ更新可否をチェックおよび更新対象レコードをロック
                    // [業務ロック]."更新数"を取得し、
                    // 更新対象レコードの存在の可否、一覧取得時の値との一致を調べる。
                    workList = entity.mSelectForUpdate.read(conn, struct);
                    if (workList == null || workList.isEmpty()) {
                     // 更新対象レコードが存在しない場合
                     struct.setPROGRAM_CD(modeFormFromName);
                     struct.setl_PROGRAM_CD(modeFormToName);
                     throw new AN0010010ModifyCountException();
                    }
              
                    workStruct = (AN0010010Struct)workList.get(0);
                    if (workStruct.geth_MODIFY_COUNT().equals(
                      struct.geth_MODIFY_COUNT2()) == false)
                    {
                     // 更新数が変更されていた場合
                     struct.setPROGRAM_CD(modeFormFromName);
                     struct.setl_PROGRAM_CD(modeFormToName);
                     throw new AN0010010ModifyCountException();
                    }
              
                    // 更新処理を実行
                    dummyRet = entity.mUpdateSYS_BUSINESS_LOCK.update(conn, struct);
                   }
              
                   struct.setPROGRAM_CD(modeFormFromName);
                   struct.setl_PROGRAM_CD(modeFormToName);
                  }
                 }
              
                 // データを確定
                 conn.commit();
              
                 // 更新後のデータを表示
                 controlSelect();
              
                } catch (AN0010010ModifyCountException mce) {
                 // 警告：他の処理によりデータが書き換えられています。
                 //       メニューに戻ってやり直して下さい。
                 ExpjMessage emsg = new ExpjMessage("ZZ01105");
                 msgStruct.addError(emsg);
                 sysLog.warning(emsg, getsysUSER_CD());
                 emsg = new ExpjMessage("ZZ01006", tableAndKeys);
                 msgStruct.addError(emsg);
                 sysLog.warning(emsg, getsysUSER_CD());
                 return;
                } catch (SQLException se) {
                 // エラー：サーバでエラーが発生しました。
                 ExpjMessage emsg = new ExpjMessage("ZZ01106");
                 sysLog.severe(emsg, getsysUSER_CD());
                 ExpjException ee = new ExpjException(se, emsg);
                 ee.setLocale(CoreTools.getLocale(getsysUSER_CD()));
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
		logger.exiting("AN0010010Control"+":USER="+struct.getsUser_ID(),"controlUpdate");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AN0010");
		logger.entering("AN0010010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
              
                // 画面を初期化
                initializeScreen();
              
                //}}user_implement_dev:<controlClear>
		logger.exiting("AN0010010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * 閉じるボタン押下時に実行される処理です。
	 *
	 */
	public void controlClose() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AN0010");
		logger.entering("AN0010010Control"+":USER="+struct.getsUser_ID(),"controlClose");
			//{{user_implement_dev:<controlClose>
                 // TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlClose>
		logger.exiting("AN0010010Control"+":USER="+struct.getsUser_ID(),"controlClose");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AN0010");
		logger.entering("AN0010010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
                 // TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AN0010010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AN0010");
		logger.entering("AN0010010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
              
                // 画面を初期化
                initializeScreen();
              
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AN0010010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * イベントハンドラの前処理です。
	 *
	 * @param buttun ボタン名
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AN0010");
		logger.entering("AN0010010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
              
                try {
                 ComboBox comboController = new ComboBox(conn, sysUSER_CD);
                 // 対象工場区分のコンボボックスデータを設定
                 ComboStruct TARGET_PLANT_TYP = comboController.getData("TARGET_PLANT_TYP");
                 struct.setList_TARGET_PLANT_TYP_val(TARGET_PLANT_TYP.getValList());
                 struct.setList_TARGET_PLANT_TYP_name(TARGET_PLANT_TYP.getExplanList());
                } catch (SQLException se) {
                 // エラー：サーバでエラーが発生しました。
                 ExpjMessage emsg = new ExpjMessage("ZZ01106");
                 sysLog.severe(emsg, getsysUSER_CD());
                 ExpjException ee = new ExpjException(se, emsg);
                 ee.setLocale(CoreTools.getLocale(getsysUSER_CD()));
                 emsg = new ExpjMessage("ZZ01006", se.toString());
                 sysLog.severe(emsg, getsysUSER_CD());
                 throw ee;
                }
              
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("AN0010010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("Insert") ) {
				controlInsert();
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
//			throw new FoundationException("AN0010010Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AN0010010-E999","CSVの出力処理"));
			throw new FoundationException("AN0010010Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AN0010010-E999","システム日付の取得処理"));
				throw new FoundationException("AN0010010Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
                 // TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AN0010010-E999","コントロールのイベント処理"));
			throw new FoundationException("AN0010010Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected AN0010010Entity entity;
	protected AN0010010Struct struct;
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

		entity = new AN0010010Entity();
		struct = new AN0010010Struct();

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
	 * AN0010010クラスの標準コンストラクタ
	 */
	public AN0010010Control() throws BusinessProcessException, FoundationException
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
				AN0010010Struct key = (AN0010010Struct)keyList.get(j);
				// メッセージキーを作成する
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("l_PROGRAM_CD") && key.getl_PROGRAM_CD() != null) {
					msgKey.setKeyValue("l_PROGRAM_CD", key.getl_PROGRAM_CD());
				}
				if(msgKeyType.containsKeyColumn("l_PROGRAM_NAME") && key.getl_PROGRAM_NAME() != null) {
					msgKey.setKeyValue("l_PROGRAM_NAME", key.getl_PROGRAM_NAME());
				}
				if(msgKeyType.containsKeyColumn("TARGET_PLANT_TYP") && key.getTARGET_PLANT_TYP() != null) {
					msgKey.setKeyValue("TARGET_PLANT_TYP", key.getTARGET_PLANT_TYP());
				}
				if(msgKeyType.containsKeyColumn("h_CHANGEABLE_TYP") && key.geth_CHANGEABLE_TYP() != null) {
					msgKey.setKeyValue("h_CHANGEABLE_TYP", key.geth_CHANGEABLE_TYP());
				}
				if(msgKeyType.containsKeyColumn("h_MODIFY_COUNT") && key.geth_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("h_MODIFY_COUNT", key.geth_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("h_TARGET_PLANT_TYP2") && key.geth_TARGET_PLANT_TYP2() != null) {
					msgKey.setKeyValue("h_TARGET_PLANT_TYP2", key.geth_TARGET_PLANT_TYP2());
				}
				if(msgKeyType.containsKeyColumn("h_MODIFY_COUNT2") && key.geth_MODIFY_COUNT2() != null) {
					msgKey.setKeyValue("h_MODIFY_COUNT2", key.geth_MODIFY_COUNT2());
				}
				if(msgKeyType.containsKeyColumn("PROGRAM_CD") && key.getPROGRAM_CD() != null) {
					msgKey.setKeyValue("PROGRAM_CD", key.getPROGRAM_CD());
				}
				if(msgKeyType.containsKeyColumn("PROGRAM_NAME") && key.getPROGRAM_NAME() != null) {
					msgKey.setKeyValue("PROGRAM_NAME", key.getPROGRAM_NAME());
				}
				if(msgKeyType.containsKeyColumn("h_TARGET_PLANT_TYP") && key.geth_TARGET_PLANT_TYP() != null) {
					msgKey.setKeyValue("h_TARGET_PLANT_TYP", key.geth_TARGET_PLANT_TYP());
				}
				if(msgKeyType.containsKeyColumn("TARGET_PLANT_TYP_name") && key.getTARGET_PLANT_TYP_name() != null) {
					msgKey.setKeyValue("TARGET_PLANT_TYP_name", key.getTARGET_PLANT_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("TARGET_PLANT_TYP_val") && key.getTARGET_PLANT_TYP_val() != null) {
					msgKey.setKeyValue("TARGET_PLANT_TYP_val", key.getTARGET_PLANT_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("h_PROGRAM_CD") && key.geth_PROGRAM_CD() != null) {
					msgKey.setKeyValue("h_PROGRAM_CD", key.geth_PROGRAM_CD());
				}
				if(msgKeyType.containsKeyColumn("h_ExistSysBusinessLock") && key.geth_ExistSysBusinessLock() != null) {
					msgKey.setKeyValue("h_ExistSysBusinessLock", key.geth_ExistSysBusinessLock());
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
					AN0010010Struct key = new AN0010010Struct();
					if(msgKeyType.containsKeyColumn("l_PROGRAM_CD")) {
						key.setl_PROGRAM_CD(msgKey.getKeyValue("l_PROGRAM_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_PROGRAM_NAME")) {
						key.setl_PROGRAM_NAME(msgKey.getKeyValue("l_PROGRAM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("TARGET_PLANT_TYP")) {
						key.setTARGET_PLANT_TYP(msgKey.getKeyValue("TARGET_PLANT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("h_CHANGEABLE_TYP")) {
						key.seth_CHANGEABLE_TYP(msgKey.getKeyValue("h_CHANGEABLE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("h_MODIFY_COUNT")) {
						key.seth_MODIFY_COUNT(msgKey.getKeyValue("h_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("h_TARGET_PLANT_TYP2")) {
						key.seth_TARGET_PLANT_TYP2(msgKey.getKeyValue("h_TARGET_PLANT_TYP2"));
					}
					if(msgKeyType.containsKeyColumn("h_MODIFY_COUNT2")) {
						key.seth_MODIFY_COUNT2(msgKey.getKeyValue("h_MODIFY_COUNT2"));
					}
					if(msgKeyType.containsKeyColumn("PROGRAM_CD")) {
						key.setPROGRAM_CD(msgKey.getKeyValue("PROGRAM_CD"));
					}
					if(msgKeyType.containsKeyColumn("PROGRAM_NAME")) {
						key.setPROGRAM_NAME(msgKey.getKeyValue("PROGRAM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("h_TARGET_PLANT_TYP")) {
						key.seth_TARGET_PLANT_TYP(msgKey.getKeyValue("h_TARGET_PLANT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("TARGET_PLANT_TYP_name")) {
						key.setTARGET_PLANT_TYP_name(msgKey.getKeyValue("TARGET_PLANT_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("TARGET_PLANT_TYP_val")) {
						key.setTARGET_PLANT_TYP_val(msgKey.getKeyValue("TARGET_PLANT_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("h_PROGRAM_CD")) {
						key.seth_PROGRAM_CD(msgKey.getKeyValue("h_PROGRAM_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_ExistSysBusinessLock")) {
						key.seth_ExistSysBusinessLock(msgKey.getKeyValue("h_ExistSysBusinessLock"));
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
