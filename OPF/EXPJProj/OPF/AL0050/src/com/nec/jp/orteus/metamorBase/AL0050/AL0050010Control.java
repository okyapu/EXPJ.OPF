/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AL0050/src/com/nec/jp/orteus/metamorBase/AL0050/AL0050010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AL0050;

import com.nec.jp.orteus.metamorBase.AL0050.*;
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

import com.nec.jp.orteus.expj.util.Numbering;
import com.nec.jp.orteus.expj.util.WorkCalendar;
import com.nec.jp.orteus.expj.util.Converter;
import java.text.SimpleDateFormat;
import java.text.ParseException;

//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AL0050010Control
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
        public AL0050010Struct getListvalue(int x) { return (AL0050010Struct)(this.list.get(x)); }	// リストの値を返します。
        public AL0050010Struct getStruct() { return this.struct; }	// Structを返します。
        public AL0050010Struct createStruct() { return new AL0050010Struct(); }	// 新しいStructを作って返します。
        public void setStruct(Object structname) { this.struct.setStruct((AL0050010Struct)structname); }	// Structをセットします。
        public void initializeStruct() { this.struct.initialize(); }	// Structの値を初期化します。
       
        // CSV出力用リスト
        private CsvWriter csvWriter = null;
        public CsvWriter getCsvWriter(){ return this.csvWriter; }
       
        private CsvReader csvReader = null;
        public void setCsvReader(CsvReader cr){ this.csvReader = cr; }
       
           /** 再読込が行われたかを判断するフラグ */
        private boolean _reloadFlag = false;
       
        /**
         * Structの値をクリアします。
         */
        private void clearStruct()
        {
         // メイン上段
         struct.setJOB_ODR_CD(null);
         struct.setITEM_CD(null);
         struct.setITEM_NAME(null);
         struct.setPRD_DUE_DATE_FROM(null);
         struct.setPRD_DUE_DATE_TO(null);
         struct.seth_PLANT_CD(getsysPLANT_CD());
         // メイン中段
         struct.setl_JOB_ODR_CD(null);
         struct.setl_ITEM_CD(null);
         struct.setl_ITEM_NAME(null);
         struct.setl_PRD_DUE_DATE(null);
         struct.setl_ODR_QTY(null);
         struct.setl_CUST_CD(null);
         struct.setl_LOAD_PLAN_COMMENT(null);
         struct.setl_h_LOAD_PLAN_CD(null);
         struct.setl_h_MODIFY_COUNT(null);
         // サブ１中段
         struct.setSUB1_JOB_ODR_CD(null);
         struct.setSUB1_ITEM_CD(null);
         struct.setSUB1_ITEM_NAME(null);
         struct.setSUB1_PRD_DUE_DATE(null);
         struct.setSUB1_ODR_QTY("0.0");
         struct.setSUB1_CUST_CD(null);
         struct.setSUB1_LOAD_PLAN_COMMENT(null);
         struct.setSUB1_h_LOAD_PLAN_CD(null);
         struct.setSUB1_h_PLANT_CD(null);
         struct.setSUB1_h_MODIFY_COUNT(null);
         struct.setSUB1_h_ENTRY_BY(null);
         struct.setSUB1_h_PRD_DUE_DATE(null);
         struct.setSUB1_h_PRD_START_DATE(null);
         struct.setSUB1_h_l_JOB_ODR_CD(null);
         struct.setSUB1_h_l_ITEM_CD(null);
         // サブ１隠し
         struct.setMAIN_h_PLANT_CD(null);
         struct.setMAIN_h_JOB_ODR_CD(null);
         struct.setMAIN_h_ITEM_CD(null);
         struct.setMAIN_h_PRD_DUE_DATE_FROM(null);
         struct.setMAIN_h_PRD_DUE_DATE_TO(null);
         // フィールド変数
         struct.setd_ITEM_LT(null);
         struct.setd_ITEM_CD(null);
       
         // リスト
         if (list != null) {
          list.clear();
         }
        }
       
        /**
         * サブ１のStructの値をクリアします。
         */
        private void clearSub1Struct()
        {
         struct.setSUB1_JOB_ODR_CD(null);
         struct.setSUB1_ITEM_CD(null);
         struct.setSUB1_ITEM_NAME(null);
         struct.setSUB1_PRD_DUE_DATE(null);
         struct.setSUB1_ODR_QTY("0.0");
         struct.setSUB1_CUST_CD(null);
         struct.setSUB1_LOAD_PLAN_COMMENT(null);
         struct.setSUB1_h_LOAD_PLAN_CD(null);
         struct.setSUB1_h_PLANT_CD(null);
         struct.setSUB1_h_MODIFY_COUNT(null);
       
         struct.setSUB1_h_PRD_DUE_DATE(null);
         struct.setSUB1_h_PRD_START_DATE(null);
         struct.setSUB1_h_l_JOB_ODR_CD(null);
         struct.setSUB1_h_l_ITEM_CD(null);
        }
       
        /**
         * メインのStructの値をサブ１の隠しフィールドに退避します。
         */
        private void saveMainToSub1Hidden()
        {
         struct.setMAIN_h_PLANT_CD(struct.geth_PLANT_CD());
         struct.setMAIN_h_JOB_ODR_CD(struct.getJOB_ODR_CD());
         struct.setMAIN_h_ITEM_CD(struct.getITEM_CD());
         struct.setMAIN_h_PRD_DUE_DATE_FROM(struct.getPRD_DUE_DATE_FROM());
         struct.setMAIN_h_PRD_DUE_DATE_TO(struct.getPRD_DUE_DATE_TO());
        }
       
        /**
         * メインのStructの値をサブ１の隠しフィールドから復元します。
         */
        // 親画面の検索キーがNULLでないとき、
        // 親画面の検索キーと異なるキーのデータが登録された場合には、
        // 親画面の当該検索キーの値をNULL（フリー）にする。
        private void restoreMainFromSub1Hidden()
        {
         struct.seth_PLANT_CD(struct.getMAIN_h_PLANT_CD());
         if (struct.getMAIN_h_JOB_ODR_CD() != null
           && struct.getMAIN_h_JOB_ODR_CD().equals("") == false
           && struct.getSUB1_JOB_ODR_CD().equals(struct.getMAIN_h_JOB_ODR_CD()) == false)
         {
          struct.setJOB_ODR_CD(null);
         } else {
          struct.setJOB_ODR_CD(struct.getMAIN_h_JOB_ODR_CD());
         }
         if (struct.getMAIN_h_ITEM_CD() != null && struct.getMAIN_h_ITEM_CD().equals("") == false
           && struct.getSUB1_ITEM_CD().equals(struct.getMAIN_h_ITEM_CD()) == false)
         {
          struct.setITEM_CD(null);
         } else {
          struct.setITEM_CD(struct.getMAIN_h_ITEM_CD());
         }
         struct.setPRD_DUE_DATE_FROM(struct.getMAIN_h_PRD_DUE_DATE_FROM());
         struct.setPRD_DUE_DATE_TO(struct.getMAIN_h_PRD_DUE_DATE_TO());
        }
       
        /**
         * サブ１のStructに設定します。
         *
         * @param fromStruct 設定元Struct
         */
        private void setSub1Struct(AL0050010Struct fromStruct)
        {
         struct.setSUB1_JOB_ODR_CD(fromStruct.getSUB1_JOB_ODR_CD());
         struct.setSUB1_ITEM_CD(fromStruct.getSUB1_ITEM_CD());
         struct.setSUB1_ITEM_NAME(fromStruct.getSUB1_ITEM_NAME());
         struct.setSUB1_PRD_DUE_DATE(fromStruct.getSUB1_PRD_DUE_DATE());
         struct.setSUB1_ODR_QTY(fromStruct.getSUB1_ODR_QTY());
         struct.setSUB1_CUST_CD(fromStruct.getSUB1_CUST_CD());
         struct.setSUB1_LOAD_PLAN_COMMENT(fromStruct.getSUB1_LOAD_PLAN_COMMENT());
         struct.setSUB1_h_LOAD_PLAN_CD(fromStruct.getSUB1_h_LOAD_PLAN_CD());
         struct.setSUB1_h_PLANT_CD(fromStruct.getSUB1_h_PLANT_CD());
         struct.setSUB1_h_MODIFY_COUNT(fromStruct.getSUB1_h_MODIFY_COUNT());
        }
       
        /**
         * mSelectの対象テーブルとキーの文字列を生成します。
         *
         * @return mSelectの対象テーブルとキーの文字列
         */
        private String makeTableAndKeyString()
        {
         StringBuffer sbufKey = new StringBuffer("T_LOAD_PLAN.PLANT_CD");
         if (struct.getJOB_ODR_CD() == null || struct.getJOB_ODR_CD().equals("") == false) {
          sbufKey.append(",JOB_ODR_CD");
         }
         if (struct.getITEM_CD() == null || struct.getITEM_CD().equals("") == false) {
          sbufKey.append(",ITEM_CD");
         }
         if (struct.getPRD_DUE_DATE_FROM() == null
           || struct.getPRD_DUE_DATE_FROM().equals("") == false)
         {
          sbufKey.append(",PRD_DUE_DATE_FROM");
         }
         if (struct.getPRD_DUE_DATE_TO() == null
           || struct.getPRD_DUE_DATE_TO().equals("") == false)
         {
          sbufKey.append(",PRD_DUE_DATE_TO");
         }
         sbufKey.append(":");
         sbufKey.append(struct.geth_PLANT_CD());
         if (struct.getJOB_ODR_CD() == null || struct.getJOB_ODR_CD().equals("") == false) {
          sbufKey.append(",");
          sbufKey.append(struct.getJOB_ODR_CD());
         }
         if (struct.getITEM_CD() == null || struct.getITEM_CD().equals("") == false) {
          sbufKey.append(",");
          sbufKey.append(struct.getITEM_CD());
         }
         if (struct.getPRD_DUE_DATE_FROM() == null
           || struct.getPRD_DUE_DATE_FROM().equals("") == false)
         {
          sbufKey.append(",");
          sbufKey.append(struct.getPRD_DUE_DATE_FROM());
         }
         if (struct.getPRD_DUE_DATE_TO() == null
           || struct.getPRD_DUE_DATE_TO().equals("") == false)
         {
          sbufKey.append(",");
          sbufKey.append(struct.getPRD_DUE_DATE_TO());
         }
         return sbufKey.toString();
        }
       
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * 読込ボタン押下時に実行される処理です。
	 *
	 */
	public void controlSelect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AL0050");
		logger.entering("AL0050010Control"+":USER="+struct.getsUser_ID(),"controlSelect");
			//{{user_implement_dev:<controlSelect>
              
                // 補助メッセージ(キー項目)
                String bufKey = null;
              
                try {
                 // 読込状態（初期表示状態）を設定
                 setReadStatus(INITIAL);
              
                 // キーを残して、Structをクリア
                 String jobOdrCd = struct.getJOB_ODR_CD();
                 String itemCd = struct.getITEM_CD();
                 String prdDueDateFrom = struct.getPRD_DUE_DATE_FROM();
                 String prdDueDateTo = struct.getPRD_DUE_DATE_TO();
                 clearStruct();
                 struct.setJOB_ODR_CD(jobOdrCd);
                 struct.setITEM_CD(itemCd);
                 struct.setPRD_DUE_DATE_FROM(prdDueDateFrom);
                 struct.setPRD_DUE_DATE_TO(prdDueDateTo);
              
                 // 日付の変換
                 String strSearchDayFrom = null;
                 Date dateSearchDayFrom = null;
                 String strSearchDayTo = null;
                 Date dateSearchDayTo = null;
              
                 if (struct.getPRD_DUE_DATE_FROM() != null
                   && struct.getPRD_DUE_DATE_FROM().equals("") == false)
                 {
                  dateSearchDayFrom = Converter.strToDate(struct.getPRD_DUE_DATE_FROM(),
                    Converter.SLASH_DATE);
                  strSearchDayFrom = Converter.dateToStr(dateSearchDayFrom, Converter.SLASH_DATE);
                  struct.setPRD_DUE_DATE_FROM(strSearchDayFrom);
                 }
                 if (struct.getPRD_DUE_DATE_TO() != null
                   && struct.getPRD_DUE_DATE_TO().equals("") == false) {
                  dateSearchDayTo = Converter.strToDate(struct.getPRD_DUE_DATE_TO(),
                    Converter.SLASH_DATE);
                  strSearchDayTo = Converter.dateToStr(dateSearchDayTo, Converter.SLASH_DATE);
                  struct.setPRD_DUE_DATE_TO(strSearchDayTo);
                 }
              
                 // 品目マスタを検索
                 if (struct.getITEM_CD() != null && struct.getITEM_CD().equals("") == false) {
                  struct.setd_ITEM_CD(struct.getITEM_CD());
                  bufKey = "M_ITEM.ITEM_CD:" + struct.getd_ITEM_CD();
                  List workList = entity.mSelectItemCD.read(conn, struct);
                  if (workList != null && workList.size() > 0) {
                   AL0050010Struct workStruct = (AL0050010Struct)workList.get(0);
                   struct.setITEM_NAME(workStruct.getITEM_NAME());
                  } else {
                   // 品目番号がマスタに存在しません。
                   ExpjMessage emsg = new ExpjMessage("AL50004");
                   msgStruct.addError(emsg);
                   sysLog.warning(emsg, getsysUSER_CD());
                   emsg = new ExpjMessage("ZZ01006", bufKey);
                   msgStruct.addError(emsg);
                   sysLog.warning(emsg, getsysUSER_CD());
                  }
                 }
              
                 // リスト検索
                 bufKey = makeTableAndKeyString();
                 list = entity.mSelect.read(conn, struct);
                 if (list == null || list.isEmpty()) {
                  // 読込状態（0件）を設定
                  setReadStatus(NOT_FOUND);
                  if (_reloadFlag == false) {
                   // 対象データが存在しません。
                   ExpjMessage emsg = new ExpjMessage("ZZ06001");
                   msgStruct.addError(emsg);
                   sysLog.warning(emsg, getsysUSER_CD());
                   emsg = new ExpjMessage("ZZ01006", bufKey);
                   msgStruct.addError(emsg);
                   sysLog.warning(emsg, getsysUSER_CD());
                  }
                  return;
                 }
              
                 // 表示行数制限
                 int maxLine = sp.getMaxLine(conn, 1);
                 if (maxLine != 0 && list.size() > maxLine) {
                  // 読込状態（0件）を設定
                  setReadStatus(TOO_MANY);
                  // リストをクリア
                  list.clear();
                  // 表示件数が規定値({0})を超えています。条件を変更してやり直してください。
                  ExpjMessage emsg = new ExpjMessage("ZZ01115", Integer.toString(maxLine));
                  msgStruct.addError(emsg);
                  sysLog.warning(emsg, getsysUSER_CD());
                  emsg = new ExpjMessage("ZZ01006", bufKey);
                  msgStruct.addError(emsg);
                  sysLog.warning(emsg, getsysUSER_CD());
                  return;
                 }
              
                 // 読込状態（正常読み込み）を設定
                 setReadStatus(NORMAL);
              
                } catch (SQLException se) {
                 // 読込状態（エラー）を設定
                 setReadStatus(ERROR);
                 // サーバでエラーが発生しました。
                 ExpjMessage emsg = new ExpjMessage("ZZ01106");
                 sysLog.severe(emsg, getsysUSER_CD());
                 ExpjException ee = new ExpjException(se, emsg);
                 emsg = new ExpjMessage("ZZ01006", bufKey);
                 sysLog.severe(emsg, getsysUSER_CD());
                 emsg = new ExpjMessage("ZZ01006", se.toString());
                 sysLog.severe(emsg, getsysUSER_CD());
                 throw ee;
                } catch (Exception e) {
                 ExpjException ee = null;
                 if (e instanceof ExpjException) {
                  ee = (ExpjException)e;
                  sysLog.severe(ee.getExpjMessage(), getsysUSER_CD());
                 } else {
                  // サーバでエラーが発生しました。
                  ExpjMessage emsg = new ExpjMessage("ZZ01106");
                  sysLog.severe(emsg, getsysUSER_CD());
                  ee = new ExpjException(e, emsg);
                  emsg = new ExpjMessage("ZZ01006", e.toString());
                  sysLog.severe(emsg, getsysUSER_CD());
                 }
                 throw ee;
                }
              
                //}}user_implement_dev:<controlSelect>
		logger.exiting("AL0050010Control"+":USER="+struct.getsUser_ID(),"controlSelect");

		return;
	}

	/**
	 * 行複写ボタン押下時に実行される処理です。
	 *
	 */
	public void controlLineCopy() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AL0050");
		logger.entering("AL0050010Control"+":USER="+struct.getsUser_ID(),"controlLineCopy");
			//{{user_implement_dev:<controlLineCopy>
              
                // 補助メッセージ(キー項目)
                String bufKey = null;
              
                try {
                 List workList = null;
                 AL0050010Struct workStruct = null;
              
                 // トランザクション開始
                 conn.beginTransWeb();
              
                 // メイン画面の検索条件を保持
                 saveMainToSub1Hidden();
              
                 // サブ１画面をクリア
                 clearSub1Struct();
              
                 if (struct.getl_h_LOAD_PLAN_CD() != null) {
              
                  // 更新数を取得
                  bufKey = "T_LOAD_PLAN.LOAD_PLAN_CD:" + struct.getl_h_LOAD_PLAN_CD();
                  workList = entity.mDeleteT_LOAD_PLAN.read(conn, struct);
                  if (workList == null || workList.isEmpty()) {
                   // 他の処理によりデータが書き換えられています。
                   // メニューに戻ってやり直して下さい。
                   ExpjMessage emsg = new ExpjMessage("ZZ01105");
                   msgStruct.addError(emsg);
                   sysLog.warning(emsg, getsysUSER_CD());
                   emsg = new ExpjMessage("ZZ01006", bufKey);
                   msgStruct.addError(emsg);
                   sysLog.warning(emsg, getsysUSER_CD());
                   return;
                  }
              
                  workStruct = (AL0050010Struct)workList.get(0);
                  if (workStruct.getl_h_MODIFY_COUNT().equals(
                    struct.getl_h_MODIFY_COUNT()) == false)
                  {
                   // 他の処理によりデータが書き換えられています。
                   // メニューに戻ってやり直して下さい。
                   ExpjMessage emsg = new ExpjMessage("ZZ01105");
                   msgStruct.addError(emsg);
                   sysLog.warning(emsg, getsysUSER_CD());
                   emsg = new ExpjMessage("ZZ01006", bufKey);
                   msgStruct.addError(emsg);
                   sysLog.warning(emsg, getsysUSER_CD());
                   return;
                  }
              
                  // 負荷計画を再検索
                  workList = entity.mSelectT_LOAD_PLAN.read(conn,struct);
                  if (workList == null || workList.isEmpty()) {
                   // 対象データが存在しません。
                   ExpjMessage emsg = new ExpjMessage("ZZ06001");
                   msgStruct.addError(emsg);
                   sysLog.warning(emsg, getsysUSER_CD());
                   emsg = new ExpjMessage("ZZ01006", bufKey);
                   msgStruct.addError(emsg);
                   sysLog.warning(emsg, getsysUSER_CD());
                   return;
                  }
              
                  // サブ１画面に値を設定
                  setSub1Struct((AL0050010Struct)workList.get(0));
                 }
              
                 // 業務運用日取得
                 bufKey = "SYS_DATE_CTRL.PLANT_CD:" + struct.geth_PLANT_CD();
                 workList = entity.mSelectSYS_DATE_CTRL.read(conn, struct);
                 if (workList == null || workList.isEmpty()) {
                  // 業務運用日が存在しません
                  ExpjMessage emsg = new ExpjMessage("AL60002");
                  msgStruct.addError(emsg);
                  sysLog.warning(emsg, getsysUSER_CD());
                  emsg = new ExpjMessage("ZZ01006", bufKey);
                  msgStruct.addError(emsg);
                  sysLog.warning(emsg, getsysUSER_CD());
                  return;
                 }
              
                 workStruct = (AL0050010Struct)workList.get(0);
                 struct.setSUB1_h_PRD_DUE_DATE(workStruct.getSUB1_h_PRD_DUE_DATE());
              
                } catch (SQLException se) {
                 // サーバでエラーが発生しました。
                 ExpjMessage emsg = new ExpjMessage("ZZ01106");
                 sysLog.severe(emsg, getsysUSER_CD());
                 ExpjException ee = new ExpjException(se, emsg);
                 emsg = new ExpjMessage("ZZ01006", bufKey);
                 sysLog.severe(emsg, getsysUSER_CD());
                 emsg = new ExpjMessage("ZZ01006", se.toString());
                 sysLog.severe(emsg, getsysUSER_CD());
                 throw ee;
                } catch (Exception e) {
                 ExpjException ee = null;
                 if (e instanceof ExpjException) {
                  ee = (ExpjException)e;
                  sysLog.severe(ee.getExpjMessage(), getsysUSER_CD());
                 } else {
                  // サーバでエラーが発生しました。
                  ExpjMessage emsg = new ExpjMessage("ZZ01106");
                  sysLog.severe(emsg, getsysUSER_CD());
                  ee = new ExpjException(e, emsg);
                  emsg = new ExpjMessage("ZZ01006", e.toString());
                  sysLog.severe(emsg, getsysUSER_CD());
                 }
                 throw ee;
                }
              
                //}}user_implement_dev:<controlLineCopy>
		logger.exiting("AL0050010Control"+":USER="+struct.getsUser_ID(),"controlLineCopy");

		return;
	}

	/**
	 * 行修正ボタン押下時に実行される処理です。
	 *
	 */
	public void controlLineUpdate() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AL0050");
		logger.entering("AL0050010Control"+":USER="+struct.getsUser_ID(),"controlLineUpdate");
			//{{user_implement_dev:<controlLineUpdate>
              
                // 補助メッセージ(キー項目)
                String bufKey = null;
              
                try {
                 List workList = null;
                 AL0050010Struct workStruct = null;
              
                 // トランザクション開始
                 conn.beginTransWeb();
              
                 // 更新数を取得
                 bufKey = "T_LOAD_PLAN.LOAD_PLAN_CD:" + struct.getl_h_LOAD_PLAN_CD();
                 workList = entity.mDeleteT_LOAD_PLAN.read(conn, struct);
                 if (workList == null || workList.isEmpty()) {
                  // 他の処理によりデータが書き換えられています。
                  // メニューに戻ってやり直して下さい。
                  ExpjMessage emsg = new ExpjMessage("ZZ01105");
                  msgStruct.addError(emsg);
                  sysLog.warning(emsg, getsysUSER_CD());
                  emsg = new ExpjMessage("ZZ01006", bufKey);
                  msgStruct.addError(emsg);
                  sysLog.warning(emsg, getsysUSER_CD());
                  return;
                 }
              
                 workStruct = (AL0050010Struct)workList.get(0);
                 if (workStruct.getl_h_MODIFY_COUNT().equals(
                   struct.getl_h_MODIFY_COUNT()) == false)
                 {
                  // 他の処理によりデータが書き換えられています。
                  // メニューに戻ってやり直して下さい。
                  ExpjMessage emsg = new ExpjMessage("ZZ01105");
                  msgStruct.addError(emsg);
                  sysLog.warning(emsg, getsysUSER_CD());
                  emsg = new ExpjMessage("ZZ01006", bufKey);
                  msgStruct.addError(emsg);
                  sysLog.warning(emsg, getsysUSER_CD());
                  return;
                 }
              
                 // メイン画面の検索条件を保持
                 saveMainToSub1Hidden();
              
                 // 負荷計画を再検索
                 workList = entity.mSelectT_LOAD_PLAN.read(conn, struct);
                 if (workList == null || workList.isEmpty()) {
                  // 対象データが存在しません。
                  ExpjMessage emsg = new ExpjMessage("ZZ06001");
                  msgStruct.addError(emsg);
                  sysLog.warning(emsg, getsysUSER_CD());
                  emsg = new ExpjMessage("ZZ01006", bufKey);
                  msgStruct.addError(emsg);
                  sysLog.warning(emsg, getsysUSER_CD());
                  return;
                 }
              
                 // サブ１画面に値を設定
                 setSub1Struct((AL0050010Struct)workList.get(0));
              
                 // 業務運用日取得
                 bufKey = "SYS_DATE_CTRL.PLANT_CD:" + struct.geth_PLANT_CD();
                 workList = entity.mSelectSYS_DATE_CTRL.read(conn, struct);
                 if (workList == null || workList.isEmpty()) {
                  // 業務運用日が存在しません
                  ExpjMessage emsg = new ExpjMessage("AL60002");
                  msgStruct.addError(emsg);
                  sysLog.warning(emsg, getsysUSER_CD());
                  emsg = new ExpjMessage("ZZ01006", bufKey);
                  msgStruct.addError(emsg);
                  sysLog.warning(emsg, getsysUSER_CD());
                  return;
                 }
              
                 workStruct = (AL0050010Struct)workList.get(0);
                 struct.setSUB1_h_PRD_DUE_DATE(workStruct.getSUB1_h_PRD_DUE_DATE());
                 struct.setSUB1_h_l_JOB_ODR_CD(struct.getl_JOB_ODR_CD());
                 struct.setSUB1_h_l_ITEM_CD(struct.getl_ITEM_CD());
              
                } catch (SQLException se) {
                 // サーバでエラーが発生しました。
                 ExpjMessage emsg = new ExpjMessage("ZZ01106");
                 sysLog.severe(emsg, getsysUSER_CD());
                 ExpjException ee = new ExpjException(se, emsg);
                 emsg = new ExpjMessage("ZZ01006", bufKey);
                 sysLog.severe(emsg, getsysUSER_CD());
                 emsg = new ExpjMessage("ZZ01006", se.toString());
                 sysLog.severe(emsg, getsysUSER_CD());
                 throw ee;
                } catch (Exception e) {
                 ExpjException ee = null;
                 if (e instanceof ExpjException) {
                  ee = (ExpjException)e;
                  sysLog.severe(ee.getExpjMessage(), getsysUSER_CD());
                 } else {
                  // サーバでエラーが発生しました。
                  ExpjMessage emsg = new ExpjMessage("ZZ01106");
                  sysLog.severe(emsg, getsysUSER_CD());
                  ee = new ExpjException(e, emsg);
                  emsg = new ExpjMessage("ZZ01006", e.toString());
                  sysLog.severe(emsg, getsysUSER_CD());
                 }
                 throw ee;
                }
              
                //}}user_implement_dev:<controlLineUpdate>
		logger.exiting("AL0050010Control"+":USER="+struct.getsUser_ID(),"controlLineUpdate");

		return;
	}

	/**
	 * 行削除ボタン押下時に実行される処理です。
	 *
	 */
	public void controlLineDelete() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AL0050");
		logger.entering("AL0050010Control"+":USER="+struct.getsUser_ID(),"controlLineDelete");
			//{{user_implement_dev:<controlLineDelete>
              
                // 補助メッセージ(キー項目)
                String bufKey = null;
              
                try {
                 int dummyRet = 0;
              
                 // トランザクション開始
                 conn.beginTransWeb();
              
                 // 更新数を取得
                 bufKey = "T_LOAD_PLAN.LOAD_PLAN_CD:" + struct.getl_h_LOAD_PLAN_CD();
                 List workList = entity.mDeleteT_LOAD_PLAN.read(conn, struct);
                 if (workList == null || workList.isEmpty()) {
                  // 他の処理によりデータが書き換えられています。
                  // メニューに戻ってやり直して下さい。
                  ExpjMessage emsg = new ExpjMessage("ZZ01105");
                  msgStruct.addError(emsg);
                  sysLog.warning(emsg, getsysUSER_CD());
                  emsg = new ExpjMessage("ZZ01006", bufKey);
                  msgStruct.addError(emsg);
                  sysLog.warning(emsg, getsysUSER_CD());
                  return;
                 }
              
                 AL0050010Struct workStruct = (AL0050010Struct)workList.get(0);
                 if (workStruct.getl_h_MODIFY_COUNT().equals(
                   struct.getl_h_MODIFY_COUNT()) == false)
                 {
                  // 他の処理によりデータが書き換えられています。
                  // メニューに戻ってやり直して下さい。
                  ExpjMessage emsg = new ExpjMessage("ZZ01105");
                  msgStruct.addError(emsg);
                  sysLog.warning(emsg, getsysUSER_CD());
                  emsg = new ExpjMessage("ZZ01006", bufKey);
                  msgStruct.addError(emsg);
                  sysLog.warning(emsg, getsysUSER_CD());
                  return;
                 }
              
                 // [負荷計画]削除
                 bufKey = "T_LOAD_PLAN.LOAD_PLAN_CD:" + struct.getl_h_LOAD_PLAN_CD();
                 dummyRet = entity.mDeleteT_LOAD_PLAN.delete(conn, struct);
              
                 // [シミュレーション負荷明細]削除
                 bufKey = "T_SIM_LOAD_DETAIL.LOAD_PLAN_CD:" + struct.getl_h_LOAD_PLAN_CD();
                 dummyRet = entity.mDeleteT_SIM_LOAD_DETAIL.delete(conn, struct);
              
                 // コミット
                 conn.commit();
              
                 // 画面の再表示
                 _reloadFlag = true;
                 controlSelect();
                 _reloadFlag = false;
              
                } catch (SQLException se) {
                 // サーバでエラーが発生しました。
                 ExpjMessage emsg = new ExpjMessage("ZZ01106");
                 sysLog.severe(emsg, getsysUSER_CD());
                 ExpjException ee = new ExpjException(se, emsg);
                 emsg = new ExpjMessage("ZZ01006", bufKey);
                 sysLog.severe(emsg, getsysUSER_CD());
                 emsg = new ExpjMessage("ZZ01006", se.toString());
                 sysLog.severe(emsg, getsysUSER_CD());
                 throw ee;
                } catch (Exception e) {
                 ExpjException ee = null;
                 if (e instanceof ExpjException) {
                  ee = (ExpjException)e;
                  sysLog.severe(ee.getExpjMessage(), getsysUSER_CD());
                 } else {
                  // サーバでエラーが発生しました。
                  ExpjMessage emsg = new ExpjMessage("ZZ01106");
                  sysLog.severe(emsg, getsysUSER_CD());
                  ee = new ExpjException(e, emsg);
                  emsg = new ExpjMessage("ZZ01006", e.toString());
                  sysLog.severe(emsg, getsysUSER_CD());
                 }
                 throw ee;
                } finally {
                 if (conn != null) {
                  conn.rollback();
                 }
                }
              
                //}}user_implement_dev:<controlLineDelete>
		logger.exiting("AL0050010Control"+":USER="+struct.getsUser_ID(),"controlLineDelete");

		return;
	}

	/**
	 * 負荷計算ボタン押下時に実行される処理です。
	 *
	 */
	public void controlLoadCulculate() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AL0050");
		logger.entering("AL0050010Control"+":USER="+struct.getsUser_ID(),"controlLoadCulculate");
			//{{user_implement_dev:<controlLoadCulculate>
              
                String bufKey= null;
                ExpjMessage emsg = null;
              
                try {
                 // トランザクション開始
                 conn.beginTransWeb();
              
                 // プログラムCD
                 struct.setPROGRAM_CD(sp.getProcId());
                 // ファンクション名
                 struct.setFUNCTION_NAME("SQLLOADCALC");
                 // バッチパラメータ取得
                 bufKey = "SYS_BAT_PARM.PROGRAM_CD,FUNCTION_NAME:" + struct.getPROGRAM_CD() + ","
                   + struct.getFUNCTION_NAME();
                 List workList = entity.mSelectSYS_BAT_PARM.read(conn, struct);
                 if (workList == null || workList.isEmpty()) {
                  // バッチパラメータの読込に失敗しました。
                  emsg = new ExpjMessage("ZZ09007");
                  msgStruct.addError(emsg);
                  sysLog.warning(emsg, getsysUSER_CD());
                  emsg = new ExpjMessage("ZZ01006", bufKey);
                  msgStruct.addError(emsg);
                  sysLog.warning(emsg, getsysUSER_CD());
                  return;
                 }
              
                 // バッチ処理を開始しました。
                 emsg = new ExpjMessage("ZZ09001");
                 msgStruct.addInfo(emsg);
                 sysLog.info(emsg, getsysUSER_CD());
              
                 AL0050010Struct workStruct = (AL0050010Struct)workList.get(0);
              
                 // ストアドプロシージャのパラメータを設定
                 struct.setpvc2LogMode(workStruct.getLOG_MODE_TYP().toString());
                 struct.setpvc2OutputMode(workStruct.getOUTPUT_MODE_TYP().toString());
                 struct.setpvc2OutputPath(workStruct.getFILE_PATH());
                 struct.setpvc2OutputName(workStruct.getFILE_NAME());
                 struct.setpvc2UserId(getsysUSER_CD());
                 struct.setpvc2BusinessName(sp.getProcId());
                 struct.setpvc2PlantCd(getsysPLANT_CD());
              
                 try {
                  // ストアドプロシージャ実行
                  bufKey = "SQLLOADCALC:"
                    + struct.getpvc2LogMode() + "," + struct.getpvc2OutputMode() + ","
                    + struct.getpvc2OutputPath()  + "," + struct.getpvc2OutputName() + ","
                    + struct.getpvc2UserId() + "," + struct.getpvc2BusinessName() + ","
                    + struct.getpvc2PlantCd();
                  entity.mCallSqlLoadCalc.call(conn, struct);
              
                  if (struct.getpnumReturn().intValue() != 0) {
                   // 負荷計算バッチが異常終了しました。
                   emsg = new ExpjMessage("AL50009");
                   msgStruct.addError(emsg);
                   sysLog.warning(emsg, getsysUSER_CD());
                   emsg = new ExpjMessage("ZZ01006", bufKey);
                   msgStruct.addError(emsg);
                   sysLog.warning(emsg, getsysUSER_CD());
                   return;
                  }
              
                  // バッチ処理を終了しました。
                  emsg = new ExpjMessage("ZZ09002");
                  msgStruct.addInfo(emsg);
                  sysLog.info(emsg, getsysUSER_CD());
              
                 } catch (SQLException se) {
                  if (se.getErrorCode() == 6550) {
                   // エラーメッセージ作成
                   emsg = new ExpjMessage("ZZ01006", se.getMessage().replaceAll("\n", " "));
                   msgStruct.addError(emsg);
                   sysLog.warning(emsg, getsysUSER_CD());
                   emsg = new ExpjMessage("ZZ01006", bufKey);
                   msgStruct.addError(emsg);
                   sysLog.warning(emsg, getsysUSER_CD());
                  } else {
                   throw se;
                  }
                 }
              
                 // データを確定
                 conn.commit();
              
                } catch (SQLException se) {
                 // サーバでエラーが発生しました。
                 emsg = new ExpjMessage("ZZ01106");
                 sysLog.severe(emsg, getsysUSER_CD());
                 ExpjException ee = new ExpjException(se, emsg);
                 emsg = new ExpjMessage("ZZ01006", bufKey);
                 sysLog.severe(emsg, getsysUSER_CD());
                 emsg = new ExpjMessage("ZZ01006", se.toString());
                 sysLog.severe(emsg, getsysUSER_CD());
                 throw ee;
                } finally {
                 if (conn != null) {
                  conn.rollback();
                 }
                }
              
                //}}user_implement_dev:<controlLoadCulculate>
		logger.exiting("AL0050010Control"+":USER="+struct.getsUser_ID(),"controlLoadCulculate");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AL0050");
		logger.entering("AL0050010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
              
                // Structをクリア
                clearStruct();
              
                // 読込状態（初期表示状態）を設定
                setReadStatus(INITIAL);
              
                // 再読み込みフラグ設定(未読込)
                _reloadFlag = false;
              
                //}}user_implement_dev:<controlClear>
		logger.exiting("AL0050010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * 閉じるボタン押下時に実行される処理です。
	 *
	 */
	public void controlClose() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AL0050");
		logger.entering("AL0050010Control"+":USER="+struct.getsUser_ID(),"controlClose");
			//{{user_implement_dev:<controlClose>
                 // TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlClose>
		logger.exiting("AL0050010Control"+":USER="+struct.getsUser_ID(),"controlClose");

		return;
	}

	/**
	 * 登録ボタン押下時に実行される処理です。
	 *
	 */
	public void controlInsert() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AL0050");
		logger.entering("AL0050010Control"+":USER="+struct.getsUser_ID(),"controlInsert");
			//{{user_implement_dev:<controlInsert>
              
                // 補助メッセージ(キー項目)
                String bufKey = null;
              
                try {
                 List workList = null;
                 AL0050010Struct workStruct = null;
              
                 //トランザクション開始
                 conn.beginTransWeb();
              
                 // 採番
                 Numbering LOAD_PLAN_CD = new Numbering(conn, Numbering.LOAD_PLAN_CD, getsysUSER_CD(),
                   sp.getProcId(), getsysPLANT_CD());
                 struct.setSUB1_h_LOAD_PLAN_CD(LOAD_PLAN_CD.getNo());
              
                 // 工場コード
                 struct.setSUB1_h_PLANT_CD(getsysPLANT_CD());
              
                 // 品目マスタを検索
                 struct.setd_ITEM_CD(struct.getSUB1_ITEM_CD());
                 bufKey = "M_ITEM.ITEM_CD:" + struct.getd_ITEM_CD();
                 workList = entity.mSelectItemCD.read(conn,struct);
                 if (workList == null || workList.isEmpty()) {
                  // 品目番号がマスタに存在しません。
                  ExpjMessage emsg = new ExpjMessage("AL50004");
                  msgStruct.addError(emsg);
                  sysLog.warning(emsg, getsysUSER_CD());
                  emsg = new ExpjMessage("ZZ01006", bufKey);
                  msgStruct.addError(emsg);
                  sysLog.warning(emsg, getsysUSER_CD());
                  return;
                 }
              
                 // 画面上のの品目番号からLTを取得
                 bufKey = "M_ITEM.ITEM_CD:" + struct.getSUB1_ITEM_CD();
                 workList = entity.mSelectItemLT.read(conn, struct);
                 workStruct = (AL0050010Struct)workList.get(0);
                 int intItemLt = Integer.parseInt(workStruct.getd_ITEM_LT());
                 // 画面上の製造納期を取得
                 Date datePrdDueDate = Converter.strToDate(struct.getSUB1_PRD_DUE_DATE(),
                   Converter.SLASH_DATE);
                 // 製造着手日取得
                 WorkCalendar wdayPrdStartDate = new WorkCalendar(conn, getsysUSER_CD(), sp.getProcId(),
                   getsysPLANT_CD(), datePrdDueDate, -1 * intItemLt, false);
                 String strPrdStartDate = Converter.dateToStr(wdayPrdStartDate.calcDate(),
                   Converter.SLASH_DATE);
              
                 if (strPrdStartDate == null) {
                  // 製造着手日未取得の場合はエラー
                  // カレンダ明細データが存在しません。
                  ExpjMessage emsg = new ExpjMessage("ZZ06002");
                  msgStruct.addError(emsg);
                  sysLog.warning(emsg, getsysUSER_CD());
                  return;
                 }
              
                 struct.setSUB1_h_PRD_START_DATE(strPrdStartDate);
              
                 // 計画登録者を取得
                 struct.setSUB1_h_ENTRY_BY(getsysUSER_CD());
              
                 // 追加
                 bufKey = "T_LOAD_PLAN.JOB_ODR_CD,ITEM_CD,PRD_DUE_DATE,PLANT_CD:"
                   + struct.getSUB1_JOB_ODR_CD() + "," + struct.getSUB1_ITEM_CD() + ","
                   + struct.getSUB1_PRD_DUE_DATE() + "," + struct.getSUB1_h_PLANT_CD();
                 int dummyRet = entity.mInsertT_LOAD_PLAN.create(conn, struct);
              
                 // コミット
                 conn.commit();
              
                 // 再検索
                 controlReturn();
              
                } catch (SQLException se) {
                 // サーバでエラーが発生しました。
                 ExpjMessage emsg = new ExpjMessage("ZZ01106");
                 sysLog.severe(emsg, getsysUSER_CD());
                 ExpjException ee = new ExpjException(se, emsg);
                 emsg = new ExpjMessage("ZZ01006", bufKey);
                 sysLog.severe(emsg, getsysUSER_CD());
                 emsg = new ExpjMessage("ZZ01006", se.toString());
                 sysLog.severe(emsg, getsysUSER_CD());
                 throw ee;
                } catch (Exception e) {
                 ExpjException ee = null;
                 if (e instanceof ExpjException) {
                  ee = (ExpjException)e;
                  sysLog.severe(ee.getExpjMessage(), getsysUSER_CD());
                 } else {
                  // サーバでエラーが発生しました。
                  ExpjMessage emsg = new ExpjMessage("ZZ01106");
                  sysLog.severe(emsg, getsysUSER_CD());
                  ee = new ExpjException(e, emsg);
                  emsg = new ExpjMessage("ZZ01006", e.toString());
                  sysLog.severe(emsg, getsysUSER_CD());
                 }
                 throw ee;
                } finally {
                 if (conn != null) {
                  conn.rollback();
                 }
                }
              
                //}}user_implement_dev:<controlInsert>
		logger.exiting("AL0050010Control"+":USER="+struct.getsUser_ID(),"controlInsert");

		return;
	}

	/**
	 * 更新ボタン押下時に実行される処理です。
	 *
	 */
	public void controlUpdate() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AL0050");
		logger.entering("AL0050010Control"+":USER="+struct.getsUser_ID(),"controlUpdate");
			//{{user_implement_dev:<controlUpdate>
              
                // 補助メッセージ(キー項目)
                String bufKey = null;
              
                try {
                 List workList = null;
                 AL0050010Struct workStruct = null;
                 int dummyRet = 0;
              
                 // トランザクション開始
                 conn.beginTransWeb();
              
                 // 更新数を取得
                 bufKey = "T_LOAD_PLAN.JOB_ODR_CD,ITEM_CD,PRD_DUE_DATE,PLANT_CD:"
                   + struct.getSUB1_JOB_ODR_CD() + "," + struct.getSUB1_ITEM_CD() + ","
                   + struct.getSUB1_PRD_DUE_DATE() + "," + struct.getSUB1_h_PLANT_CD();
                 workList = entity.mUpdateT_LOAD_PLAN.read(conn, struct);
                 if (workList == null || workList.isEmpty()) {
                  // 他の処理によりデータが書き換えられています。
                  // メニューに戻ってやり直して下さい。
                  ExpjMessage emsg = new ExpjMessage("ZZ01105");
                  msgStruct.addError(emsg);
                  sysLog.warning(emsg, getsysUSER_CD());
                  emsg = new ExpjMessage("ZZ01006", bufKey);
                  msgStruct.addError(emsg);
                  sysLog.warning(emsg, getsysUSER_CD());
                  return;
                 }
              
                 workStruct = (AL0050010Struct)workList.get(0);
                 if (workStruct.getSUB1_h_MODIFY_COUNT().equals(
                   struct.getSUB1_h_MODIFY_COUNT()) == false) {
                  // 他の処理によりデータが書き換えられています。
                  // メニューに戻ってやり直して下さい。
                  ExpjMessage emsg = new ExpjMessage("ZZ01105");
                  msgStruct.addError(emsg);
                  sysLog.warning(emsg, getsysUSER_CD());
                  emsg = new ExpjMessage("ZZ01006", bufKey);
                  msgStruct.addError(emsg);
                  sysLog.warning(emsg, getsysUSER_CD());
                  return;
                 }
              
                 // 品目マスタを検索
                 struct.setd_ITEM_CD(struct.getSUB1_ITEM_CD());
                 bufKey = "M_ITEM.ITEM_CD:" + struct.getd_ITEM_CD();
                 workList = entity.mSelectItemCD.read(conn,struct);
                 if (workList == null || workList.isEmpty()) {
                  // 品目番号がマスタに存在しません。
                  ExpjMessage emsg = new ExpjMessage("AL50004");
                  msgStruct.addError(emsg);
                  sysLog.warning(emsg, getsysUSER_CD());
                  emsg = new ExpjMessage("ZZ01006", bufKey);
                  msgStruct.addError(emsg);
                  sysLog.warning(emsg, getsysUSER_CD());
                  return;
                 }
              
                 // 画面上のの品目番号からLTを取得
                 bufKey = "M_ITEM.ITEM_CD:" + struct.getSUB1_ITEM_CD();
                 workList = entity.mSelectItemLT.read(conn,struct);
                 workStruct = (AL0050010Struct)workList.get(0);
                 int intItemLt = Integer.parseInt(workStruct.getd_ITEM_LT());
              
                 // 画面上の製造納期を取得
                 Date datePrdDueDate = Converter.strToDate(struct.getSUB1_PRD_DUE_DATE(),
                   Converter.SLASH_DATE);
              
                 // 製造着手日取得
                 WorkCalendar wdayPrdStartDate = new WorkCalendar(conn, getsysUSER_CD(), sp.getProcId(),
                   getsysPLANT_CD(), datePrdDueDate, -1 * intItemLt, false);
                 String strPrdStartDate = Converter.dateToStr(wdayPrdStartDate.calcDate(),
                   Converter.SLASH_DATE);
              
                 if (strPrdStartDate == null) {
                  // 製造着手日未取得の場合はエラー
                  // カレンダ明細データが存在しません。
                  ExpjMessage emsg = new ExpjMessage("ZZ06002");
                  msgStruct.addError(emsg);
                  sysLog.warning(emsg, getsysUSER_CD());
                  return;
                 }
              
                 struct.setSUB1_h_PRD_START_DATE(strPrdStartDate);
              
                 // 計画登録者を取得
                 struct.setSUB1_h_ENTRY_BY(getsysUSER_CD());
              
                 // [負荷計画]更新
                 bufKey = "T_LOAD_PLAN.JOB_ODR_CD,ITEM_CD,PRD_DUE_DATE,PLANT_CD:"
                   + struct.getSUB1_JOB_ODR_CD() + "," + struct.getSUB1_ITEM_CD() + ","
                   + struct.getSUB1_PRD_DUE_DATE() + "," + struct.getSUB1_h_PLANT_CD();
                 dummyRet = entity.mUpdateT_LOAD_PLAN.update(conn, struct);
              
                 // [シミュレーション負荷明細]削除
                 bufKey = "T_SIM_LOAD_DETAIL.LOAD_PLAN_CD:" + struct.getl_h_LOAD_PLAN_CD();
                 dummyRet = entity.mUpdateT_SIM_LOAD_DETAIL.delete(conn,struct);
              
                 // コミット
                 conn.commit();
              
                 // 再検索
                 controlReturn();
              
                } catch (SQLException se) {
                 // サーバでエラーが発生しました。
                 ExpjMessage emsg = new ExpjMessage("ZZ01106");
                 sysLog.severe(emsg, getsysUSER_CD());
                 ExpjException ee = new ExpjException(se, emsg);
                 emsg = new ExpjMessage("ZZ01006", bufKey);
                 sysLog.severe(emsg, getsysUSER_CD());
                 emsg = new ExpjMessage("ZZ01006", se.toString());
                 sysLog.severe(emsg, getsysUSER_CD());
                 throw ee;
                } catch (Exception e) {
                 ExpjException ee = null;
                 if (e instanceof ExpjException) {
                  ee = (ExpjException)e;
                  sysLog.severe(ee.getExpjMessage(), getsysUSER_CD());
                 } else {
                  // サーバでエラーが発生しました。
                  ExpjMessage emsg = new ExpjMessage("ZZ01106");
                  sysLog.severe(emsg, getsysUSER_CD());
                  ee = new ExpjException(e, emsg);
                  emsg = new ExpjMessage("ZZ01006", e.toString());
                  sysLog.severe(emsg, getsysUSER_CD());
                 }
                 throw ee;
                } finally {
                 if (conn != null) {
                  conn.rollback();
                 }
                }
              
                //}}user_implement_dev:<controlUpdate>
		logger.exiting("AL0050010Control"+":USER="+struct.getsUser_ID(),"controlUpdate");

		return;
	}

	/**
	 * 戻るボタン押下時に実行される処理です。
	 *
	 */
	public void controlReturn() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AL0050");
		logger.entering("AL0050010Control"+":USER="+struct.getsUser_ID(),"controlReturn");
			//{{user_implement_dev:<controlReturn>
              
                // メイン画面の検索条件を取得
                restoreMainFromSub1Hidden();
              
                if (struct.getSUB1_h_l_ITEM_CD() == null
                  || struct.getSUB1_h_l_ITEM_CD().equals("") == true)
                {
                 // 登録の場合
                 if (isInitialized()) {
                  // 読込状態がエラーでない場合
                  // メイン画面の再表示
                  _reloadFlag = true;
                  controlSelect();
                  _reloadFlag = false;
                 }
                } else {
                 // 更新の場合
                 if (isShown()) {
                  // 読込状態が正常である場合
                  // メイン画面の再表示
                  _reloadFlag = true;
                  controlSelect();
                  _reloadFlag = false;
                 }
                }
              
                //}}user_implement_dev:<controlReturn>
		logger.exiting("AL0050010Control"+":USER="+struct.getsUser_ID(),"controlReturn");

		return;
	}

	/**
	 * 行追加ボタン押下時に実行される処理です。
	 *
	 */
	public void controlLineInsert() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AL0050");
		logger.entering("AL0050010Control"+":USER="+struct.getsUser_ID(),"controlLineInsert");
			//{{user_implement_dev:<controlLineInsert>
              
                // 補助メッセージ(キー項目)
                String bufKey = null;
              
                try {
                 List workList = null;
                 AL0050010Struct workStruct = null;
              
                 // メイン画面の検索条件を保持
                 saveMainToSub1Hidden();
              
                 // サブ１画面をクリア
                 clearSub1Struct();
              
                 // メイン画面の検索条件をサブ１画面に設定
                 struct.setSUB1_JOB_ODR_CD(struct.getJOB_ODR_CD());
                 struct.setSUB1_ITEM_CD(struct.getITEM_CD());
              
                 if (struct.getSUB1_ITEM_CD() != null && struct.getSUB1_ITEM_CD().equals("") == false) {
                  // 品目マスタを検索
                  struct.setd_ITEM_CD(struct.getSUB1_ITEM_CD());
                  bufKey = "M_ITEM.ITEM_CD:" + struct.getd_ITEM_CD();
                  workList = entity.mSelectItemCD.read(conn,struct);
                  if (workList == null || workList.isEmpty()) {
                   // 品目番号がマスタに存在しません。
                   ExpjMessage emsg = new ExpjMessage("AL50004");
                   msgStruct.addError(emsg);
                   sysLog.warning(emsg, getsysUSER_CD());
                   emsg = new ExpjMessage("ZZ01006", bufKey);
                   msgStruct.addError(emsg);
                   sysLog.warning(emsg, getsysUSER_CD());
                   return;
                  }
                  workStruct = (AL0050010Struct)workList.get(0);
                  struct.setSUB1_ITEM_NAME(workStruct.getITEM_NAME());
                 }
              
                 // 業務運用日取得
                 bufKey = "SYS_DATE_CTRL.PLANT_CD:" + struct.geth_PLANT_CD();
                 workList = entity.mSelectSYS_DATE_CTRL.read(conn, struct);
                 if (workList == null || workList.isEmpty()) {
                  // 業務運用日が存在しません
                  ExpjMessage emsg = new ExpjMessage("AL60002");
                  msgStruct.addError(emsg);
                  sysLog.warning(emsg, getsysUSER_CD());
                  emsg = new ExpjMessage("ZZ01006", bufKey);
                  msgStruct.addError(emsg);
                  sysLog.warning(emsg, getsysUSER_CD());
                  return;
                 }
              
                 workStruct = (AL0050010Struct)workList.get(0);
                 struct.setSUB1_PRD_DUE_DATE(workStruct.getSUB1_h_PRD_DUE_DATE());
                 struct.setSUB1_h_PRD_DUE_DATE(workStruct.getSUB1_h_PRD_DUE_DATE());
              
                } catch (SQLException se) {
                 // サーバでエラーが発生しました。
                 ExpjMessage emsg = new ExpjMessage("ZZ01106");
                 sysLog.severe(emsg, getsysUSER_CD());
                 ExpjException ee = new ExpjException(se, emsg);
                 emsg = new ExpjMessage("ZZ01006", bufKey);
                 sysLog.severe(emsg, getsysUSER_CD());
                 emsg = new ExpjMessage("ZZ01006", se.toString());
                 sysLog.severe(emsg, getsysUSER_CD());
                 throw ee;
                } catch (Exception e) {
                 ExpjException ee = null;
                 if (e instanceof ExpjException) {
                  ee = (ExpjException)e;
                  sysLog.severe(ee.getExpjMessage(), getsysUSER_CD());
                 } else {
                  // サーバでエラーが発生しました。
                  ExpjMessage emsg = new ExpjMessage("ZZ01106");
                  sysLog.severe(emsg, getsysUSER_CD());
                  ee = new ExpjException(e, emsg);
                  emsg = new ExpjMessage("ZZ01006", e.toString());
                  sysLog.severe(emsg, getsysUSER_CD());
                 }
                 throw ee;
                }
              
                //}}user_implement_dev:<controlLineInsert>
		logger.exiting("AL0050010Control"+":USER="+struct.getsUser_ID(),"controlLineInsert");

		return;
	}

	/**
	 * 全削除ボタン押下時に実行される処理です。
	 *
	 */
	public void controlDeleteAll() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AL0050");
		logger.entering("AL0050010Control"+":USER="+struct.getsUser_ID(),"controlDeleteAll");
			//{{user_implement_dev:<controlDeleteAll>
              
                // 補助メッセージ(キー項目)
                String bufKey = null;
              
                try {
                 AL0050010Struct workStruct = null;
                 int dummyRet = 0;
              
                 // トランザクション開始
                 conn.beginTransWeb();
              
                 if (list == null || list.isEmpty()) {
                  return;
                 }
              
                 int listSize = list.size();
                 for (int i = 0; i < listSize; i++) {
                  // 検索キーを設定
                  workStruct = (AL0050010Struct)list.get(i);
                  struct.setl_h_LOAD_PLAN_CD(workStruct.getl_h_LOAD_PLAN_CD());
                  struct.setl_h_MODIFY_COUNT(workStruct.getl_h_MODIFY_COUNT());
              
                  // 更新数を取得
                  bufKey = "T_LOAD_PLAN.LOAD_PLAN_CD:" + struct.getl_h_LOAD_PLAN_CD();
                  List workList = entity.mDeleteT_LOAD_PLAN.read(conn, struct);
                  if (workList == null || workList.isEmpty()) {
                   // 他の処理によりデータが書き換えられています。
                   // メニューに戻ってやり直して下さい。
                   ExpjMessage emsg = new ExpjMessage("ZZ01105");
                   msgStruct.addError(emsg);
                   sysLog.warning("ZZ01105", getsysUSER_CD());
                   emsg = new ExpjMessage("ZZ01006", bufKey);
                   msgStruct.addError(emsg);
                   sysLog.warning(emsg, getsysUSER_CD());
                   return;
                  }
              
                  workStruct = (AL0050010Struct)workList.get(0);
                  if (workStruct.getl_h_MODIFY_COUNT().equals(
                    struct.getl_h_MODIFY_COUNT()) == false)
                  {
                   // 他の処理によりデータが書き換えられています。
                   // メニューに戻ってやり直して下さい。
                   ExpjMessage emsg = new ExpjMessage("ZZ01105");
                   msgStruct.addError(emsg);
                   sysLog.warning("ZZ01105", getsysUSER_CD());
                   emsg = new ExpjMessage("ZZ01006", bufKey);
                   msgStruct.addError(emsg);
                   sysLog.warning(emsg, getsysUSER_CD());
                   return;
                  }
              
                  // [負荷計画]削除
                  dummyRet = entity.mDeleteT_LOAD_PLAN.delete(conn, struct);
              
                  // [シミュレーション負荷明細]削除
                  bufKey = "T_SIM_LOAD_DETAIL.LOAD_PLAN_CD:" + struct.getl_h_LOAD_PLAN_CD();
                  dummyRet = entity.mDeleteT_SIM_LOAD_DETAIL.delete(conn, struct);
                 }
              
                 // コミット
                 conn.commit();
              
                 // 画面の再表示
                 _reloadFlag = true;
                 controlSelect();
                 _reloadFlag = false;
              
                } catch (SQLException se) {
                 // サーバでエラーが発生しました。
                 ExpjMessage emsg = new ExpjMessage("ZZ01106");
                 sysLog.severe(emsg, getsysUSER_CD());
                 ExpjException ee = new ExpjException(se, emsg);
                 emsg = new ExpjMessage("ZZ01006", bufKey);
                 sysLog.severe(emsg, getsysUSER_CD());
                 emsg = new ExpjMessage("ZZ01006", se.toString());
                 sysLog.severe(emsg, getsysUSER_CD());
                 throw ee;
                } catch (Exception e) {
                 ExpjException ee = null;
                 if (e instanceof ExpjException) {
                  ee = (ExpjException)e;
                  sysLog.severe(ee.getExpjMessage(), getsysUSER_CD());
                 } else {
                  // サーバでエラーが発生しました。
                  ExpjMessage emsg = new ExpjMessage("ZZ01106");
                  sysLog.severe(emsg, getsysUSER_CD());
                  ee = new ExpjException(e, emsg);
                  emsg = new ExpjMessage("ZZ01006", e.toString());
                  sysLog.severe(emsg, getsysUSER_CD());
                 }
                 throw ee;
                } finally {
                 if (conn != null) {
                  conn.rollback();
                 }
                }
              
                //}}user_implement_dev:<controlDeleteAll>
		logger.exiting("AL0050010Control"+":USER="+struct.getsUser_ID(),"controlDeleteAll");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AL0050");
		logger.entering("AL0050010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
                 // TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AL0050010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AL0050");
		logger.entering("AL0050010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
              
                // Structをクリア
                clearStruct();
              
                // 読込状態（初期表示状態）を設定
                setReadStatus(INITIAL);
              
                // 再読み込みフラグ設定(未読込)
                _reloadFlag = false;
              
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AL0050010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * イベントハンドラの前処理です。
	 *
	 * @param buttun ボタン名
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AL0050");
		logger.entering("AL0050010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
              //			conn.beginTransWeb();
                 // コンボボックス部品のデータのセットはここに記述してください。
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("AL0050010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("LineCopy") ) {
				controlLineCopy();
			} else if( button.equals("LineUpdate") ) {
				controlLineUpdate();
			} else if( button.equals("LineDelete") ) {
				controlLineDelete();
			} else if( button.equals("LoadCulculate") ) {
				controlLoadCulculate();
			} else if( button.equals("Clear") ) {
				controlClear();
			} else if( button.equals("Close") ) {
				controlClose();
			} else if( button.equals("Insert") ) {
				controlInsert();
			} else if( button.equals("Update") ) {
				controlUpdate();
			} else if( button.equals("Return") ) {
				controlReturn();
			} else if( button.equals("LineInsert") ) {
				controlLineInsert();
			} else if( button.equals("DeleteAll") ) {
				controlDeleteAll();
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
//			throw new FoundationException("AL0050010Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AL0050010-E999","CSVの出力処理"));
			throw new FoundationException("AL0050010Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AL0050010-E999","システム日付の取得処理"));
				throw new FoundationException("AL0050010Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
                 // TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AL0050010-E999","コントロールのイベント処理"));
			throw new FoundationException("AL0050010Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected AL0050010Entity entity;
	protected AL0050010Struct struct;
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

		entity = new AL0050010Entity();
		struct = new AL0050010Struct();

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
	 * AL0050010クラスの標準コンストラクタ
	 */
	public AL0050010Control() throws BusinessProcessException, FoundationException
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
				AL0050010Struct key = (AL0050010Struct)keyList.get(j);
				// メッセージキーを作成する
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("l_h_LOAD_PLAN_CD") && key.getl_h_LOAD_PLAN_CD() != null) {
					msgKey.setKeyValue("l_h_LOAD_PLAN_CD", key.getl_h_LOAD_PLAN_CD());
				}
				if(msgKeyType.containsKeyColumn("l_JOB_ODR_CD") && key.getl_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("l_JOB_ODR_CD", key.getl_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ITEM_CD") && key.getl_ITEM_CD() != null) {
					msgKey.setKeyValue("l_ITEM_CD", key.getl_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ITEM_NAME") && key.getl_ITEM_NAME() != null) {
					msgKey.setKeyValue("l_ITEM_NAME", key.getl_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_PRD_DUE_DATE") && key.getl_PRD_DUE_DATE() != null) {
					msgKey.setKeyValue("l_PRD_DUE_DATE", key.getl_PRD_DUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_ODR_QTY") && key.getl_ODR_QTY() != null) {
					msgKey.setKeyValue("l_ODR_QTY", key.getl_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_h_MODIFY_COUNT") && key.getl_h_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("l_h_MODIFY_COUNT", key.getl_h_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("l_CUST_CD") && key.getl_CUST_CD() != null) {
					msgKey.setKeyValue("l_CUST_CD", key.getl_CUST_CD());
				}
				if(msgKeyType.containsKeyColumn("l_LOAD_PLAN_COMMENT") && key.getl_LOAD_PLAN_COMMENT() != null) {
					msgKey.setKeyValue("l_LOAD_PLAN_COMMENT", key.getl_LOAD_PLAN_COMMENT());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_CD") && key.getJOB_ODR_CD() != null) {
					msgKey.setKeyValue("JOB_ODR_CD", key.getJOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("PRD_DUE_DATE_FROM") && key.getPRD_DUE_DATE_FROM() != null) {
					msgKey.setKeyValue("PRD_DUE_DATE_FROM", key.getPRD_DUE_DATE_FROM());
				}
				if(msgKeyType.containsKeyColumn("PRD_DUE_DATE_TO") && key.getPRD_DUE_DATE_TO() != null) {
					msgKey.setKeyValue("PRD_DUE_DATE_TO", key.getPRD_DUE_DATE_TO());
				}
				if(msgKeyType.containsKeyColumn("h_PLANT_CD") && key.geth_PLANT_CD() != null) {
					msgKey.setKeyValue("h_PLANT_CD", key.geth_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("SUB1_JOB_ODR_CD") && key.getSUB1_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("SUB1_JOB_ODR_CD", key.getSUB1_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("SUB1_ITEM_CD") && key.getSUB1_ITEM_CD() != null) {
					msgKey.setKeyValue("SUB1_ITEM_CD", key.getSUB1_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("SUB1_PRD_DUE_DATE") && key.getSUB1_PRD_DUE_DATE() != null) {
					msgKey.setKeyValue("SUB1_PRD_DUE_DATE", key.getSUB1_PRD_DUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("SUB1_ODR_QTY") && key.getSUB1_ODR_QTY() != null) {
					msgKey.setKeyValue("SUB1_ODR_QTY", key.getSUB1_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("SUB1_CUST_CD") && key.getSUB1_CUST_CD() != null) {
					msgKey.setKeyValue("SUB1_CUST_CD", key.getSUB1_CUST_CD());
				}
				if(msgKeyType.containsKeyColumn("SUB1_LOAD_PLAN_COMMENT") && key.getSUB1_LOAD_PLAN_COMMENT() != null) {
					msgKey.setKeyValue("SUB1_LOAD_PLAN_COMMENT", key.getSUB1_LOAD_PLAN_COMMENT());
				}
				if(msgKeyType.containsKeyColumn("SUB1_h_LOAD_PLAN_CD") && key.getSUB1_h_LOAD_PLAN_CD() != null) {
					msgKey.setKeyValue("SUB1_h_LOAD_PLAN_CD", key.getSUB1_h_LOAD_PLAN_CD());
				}
				if(msgKeyType.containsKeyColumn("SUB1_h_PLANT_CD") && key.getSUB1_h_PLANT_CD() != null) {
					msgKey.setKeyValue("SUB1_h_PLANT_CD", key.getSUB1_h_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("SUB1_h_ENTRY_BY") && key.getSUB1_h_ENTRY_BY() != null) {
					msgKey.setKeyValue("SUB1_h_ENTRY_BY", key.getSUB1_h_ENTRY_BY());
				}
				if(msgKeyType.containsKeyColumn("SUB1_h_PRD_START_DATE") && key.getSUB1_h_PRD_START_DATE() != null) {
					msgKey.setKeyValue("SUB1_h_PRD_START_DATE", key.getSUB1_h_PRD_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("SUB1_h_MODIFY_COUNT") && key.getSUB1_h_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("SUB1_h_MODIFY_COUNT", key.getSUB1_h_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("d_ITEM_LT") && key.getd_ITEM_LT() != null) {
					msgKey.setKeyValue("d_ITEM_LT", key.getd_ITEM_LT());
				}
				if(msgKeyType.containsKeyColumn("d_ITEM_CD") && key.getd_ITEM_CD() != null) {
					msgKey.setKeyValue("d_ITEM_CD", key.getd_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_NAME") && key.getITEM_NAME() != null) {
					msgKey.setKeyValue("ITEM_NAME", key.getITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("pvc2LogMode") && key.getpvc2LogMode() != null) {
					msgKey.setKeyValue("pvc2LogMode", key.getpvc2LogMode());
				}
				if(msgKeyType.containsKeyColumn("pvc2OutputMode") && key.getpvc2OutputMode() != null) {
					msgKey.setKeyValue("pvc2OutputMode", key.getpvc2OutputMode());
				}
				if(msgKeyType.containsKeyColumn("pvc2OutputPath") && key.getpvc2OutputPath() != null) {
					msgKey.setKeyValue("pvc2OutputPath", key.getpvc2OutputPath());
				}
				if(msgKeyType.containsKeyColumn("pvc2OutputName") && key.getpvc2OutputName() != null) {
					msgKey.setKeyValue("pvc2OutputName", key.getpvc2OutputName());
				}
				if(msgKeyType.containsKeyColumn("pvc2UserId") && key.getpvc2UserId() != null) {
					msgKey.setKeyValue("pvc2UserId", key.getpvc2UserId());
				}
				if(msgKeyType.containsKeyColumn("pvc2BusinessName") && key.getpvc2BusinessName() != null) {
					msgKey.setKeyValue("pvc2BusinessName", key.getpvc2BusinessName());
				}
				if(msgKeyType.containsKeyColumn("pvc2PlantCd") && key.getpvc2PlantCd() != null) {
					msgKey.setKeyValue("pvc2PlantCd", key.getpvc2PlantCd());
				}
				if(msgKeyType.containsKeyColumn("pnumReturn") && key.getpnumReturn() != null) {
					msgKey.setKeyValue("pnumReturn", key.getpnumReturn().toString());
				}
				if(msgKeyType.containsKeyColumn("PROGRAM_CD") && key.getPROGRAM_CD() != null) {
					msgKey.setKeyValue("PROGRAM_CD", key.getPROGRAM_CD());
				}
				if(msgKeyType.containsKeyColumn("FUNCTION_NAME") && key.getFUNCTION_NAME() != null) {
					msgKey.setKeyValue("FUNCTION_NAME", key.getFUNCTION_NAME());
				}
				if(msgKeyType.containsKeyColumn("BUSINESS_GROUP_CD") && key.getBUSINESS_GROUP_CD() != null) {
					msgKey.setKeyValue("BUSINESS_GROUP_CD", key.getBUSINESS_GROUP_CD());
				}
				if(msgKeyType.containsKeyColumn("BUSINESS_CD") && key.getBUSINESS_CD() != null) {
					msgKey.setKeyValue("BUSINESS_CD", key.getBUSINESS_CD());
				}
				if(msgKeyType.containsKeyColumn("FILE_PATH") && key.getFILE_PATH() != null) {
					msgKey.setKeyValue("FILE_PATH", key.getFILE_PATH());
				}
				if(msgKeyType.containsKeyColumn("FILE_NAME") && key.getFILE_NAME() != null) {
					msgKey.setKeyValue("FILE_NAME", key.getFILE_NAME());
				}
				if(msgKeyType.containsKeyColumn("LOG_MODE_TYP") && key.getLOG_MODE_TYP() != null) {
					msgKey.setKeyValue("LOG_MODE_TYP", key.getLOG_MODE_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("OUTPUT_MODE_TYP") && key.getOUTPUT_MODE_TYP() != null) {
					msgKey.setKeyValue("OUTPUT_MODE_TYP", key.getOUTPUT_MODE_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("SUB1_h_PRD_DUE_DATE") && key.getSUB1_h_PRD_DUE_DATE() != null) {
					msgKey.setKeyValue("SUB1_h_PRD_DUE_DATE", key.getSUB1_h_PRD_DUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("SUB1_ITEM_NAME") && key.getSUB1_ITEM_NAME() != null) {
					msgKey.setKeyValue("SUB1_ITEM_NAME", key.getSUB1_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("MAIN_h_PLANT_CD") && key.getMAIN_h_PLANT_CD() != null) {
					msgKey.setKeyValue("MAIN_h_PLANT_CD", key.getMAIN_h_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("MAIN_h_JOB_ODR_CD") && key.getMAIN_h_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("MAIN_h_JOB_ODR_CD", key.getMAIN_h_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("MAIN_h_ITEM_CD") && key.getMAIN_h_ITEM_CD() != null) {
					msgKey.setKeyValue("MAIN_h_ITEM_CD", key.getMAIN_h_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("MAIN_h_PRD_DUE_DATE_FROM") && key.getMAIN_h_PRD_DUE_DATE_FROM() != null) {
					msgKey.setKeyValue("MAIN_h_PRD_DUE_DATE_FROM", key.getMAIN_h_PRD_DUE_DATE_FROM());
				}
				if(msgKeyType.containsKeyColumn("MAIN_h_PRD_DUE_DATE_TO") && key.getMAIN_h_PRD_DUE_DATE_TO() != null) {
					msgKey.setKeyValue("MAIN_h_PRD_DUE_DATE_TO", key.getMAIN_h_PRD_DUE_DATE_TO());
				}
				if(msgKeyType.containsKeyColumn("SUB1_h_l_JOB_ODR_CD") && key.getSUB1_h_l_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("SUB1_h_l_JOB_ODR_CD", key.getSUB1_h_l_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("SUB1_h_l_ITEM_CD") && key.getSUB1_h_l_ITEM_CD() != null) {
					msgKey.setKeyValue("SUB1_h_l_ITEM_CD", key.getSUB1_h_l_ITEM_CD());
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
					AL0050010Struct key = new AL0050010Struct();
					if(msgKeyType.containsKeyColumn("l_h_LOAD_PLAN_CD")) {
						key.setl_h_LOAD_PLAN_CD(msgKey.getKeyValue("l_h_LOAD_PLAN_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_JOB_ODR_CD")) {
						key.setl_JOB_ODR_CD(msgKey.getKeyValue("l_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ITEM_CD")) {
						key.setl_ITEM_CD(msgKey.getKeyValue("l_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ITEM_NAME")) {
						key.setl_ITEM_NAME(msgKey.getKeyValue("l_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_PRD_DUE_DATE")) {
						key.setl_PRD_DUE_DATE(msgKey.getKeyValue("l_PRD_DUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_ODR_QTY")) {
						key.setl_ODR_QTY(msgKey.getKeyValue("l_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_h_MODIFY_COUNT")) {
						key.setl_h_MODIFY_COUNT(msgKey.getKeyValue("l_h_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("l_CUST_CD")) {
						key.setl_CUST_CD(msgKey.getKeyValue("l_CUST_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_LOAD_PLAN_COMMENT")) {
						key.setl_LOAD_PLAN_COMMENT(msgKey.getKeyValue("l_LOAD_PLAN_COMMENT"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_CD")) {
						key.setJOB_ODR_CD(msgKey.getKeyValue("JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("PRD_DUE_DATE_FROM")) {
						key.setPRD_DUE_DATE_FROM(msgKey.getKeyValue("PRD_DUE_DATE_FROM"));
					}
					if(msgKeyType.containsKeyColumn("PRD_DUE_DATE_TO")) {
						key.setPRD_DUE_DATE_TO(msgKey.getKeyValue("PRD_DUE_DATE_TO"));
					}
					if(msgKeyType.containsKeyColumn("h_PLANT_CD")) {
						key.seth_PLANT_CD(msgKey.getKeyValue("h_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("SUB1_JOB_ODR_CD")) {
						key.setSUB1_JOB_ODR_CD(msgKey.getKeyValue("SUB1_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("SUB1_ITEM_CD")) {
						key.setSUB1_ITEM_CD(msgKey.getKeyValue("SUB1_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("SUB1_PRD_DUE_DATE")) {
						key.setSUB1_PRD_DUE_DATE(msgKey.getKeyValue("SUB1_PRD_DUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("SUB1_ODR_QTY")) {
						key.setSUB1_ODR_QTY(msgKey.getKeyValue("SUB1_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("SUB1_CUST_CD")) {
						key.setSUB1_CUST_CD(msgKey.getKeyValue("SUB1_CUST_CD"));
					}
					if(msgKeyType.containsKeyColumn("SUB1_LOAD_PLAN_COMMENT")) {
						key.setSUB1_LOAD_PLAN_COMMENT(msgKey.getKeyValue("SUB1_LOAD_PLAN_COMMENT"));
					}
					if(msgKeyType.containsKeyColumn("SUB1_h_LOAD_PLAN_CD")) {
						key.setSUB1_h_LOAD_PLAN_CD(msgKey.getKeyValue("SUB1_h_LOAD_PLAN_CD"));
					}
					if(msgKeyType.containsKeyColumn("SUB1_h_PLANT_CD")) {
						key.setSUB1_h_PLANT_CD(msgKey.getKeyValue("SUB1_h_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("SUB1_h_ENTRY_BY")) {
						key.setSUB1_h_ENTRY_BY(msgKey.getKeyValue("SUB1_h_ENTRY_BY"));
					}
					if(msgKeyType.containsKeyColumn("SUB1_h_PRD_START_DATE")) {
						key.setSUB1_h_PRD_START_DATE(msgKey.getKeyValue("SUB1_h_PRD_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("SUB1_h_MODIFY_COUNT")) {
						key.setSUB1_h_MODIFY_COUNT(msgKey.getKeyValue("SUB1_h_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("d_ITEM_LT")) {
						key.setd_ITEM_LT(msgKey.getKeyValue("d_ITEM_LT"));
					}
					if(msgKeyType.containsKeyColumn("d_ITEM_CD")) {
						key.setd_ITEM_CD(msgKey.getKeyValue("d_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_NAME")) {
						key.setITEM_NAME(msgKey.getKeyValue("ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("pvc2LogMode")) {
						key.setpvc2LogMode(msgKey.getKeyValue("pvc2LogMode"));
					}
					if(msgKeyType.containsKeyColumn("pvc2OutputMode")) {
						key.setpvc2OutputMode(msgKey.getKeyValue("pvc2OutputMode"));
					}
					if(msgKeyType.containsKeyColumn("pvc2OutputPath")) {
						key.setpvc2OutputPath(msgKey.getKeyValue("pvc2OutputPath"));
					}
					if(msgKeyType.containsKeyColumn("pvc2OutputName")) {
						key.setpvc2OutputName(msgKey.getKeyValue("pvc2OutputName"));
					}
					if(msgKeyType.containsKeyColumn("pvc2UserId")) {
						key.setpvc2UserId(msgKey.getKeyValue("pvc2UserId"));
					}
					if(msgKeyType.containsKeyColumn("pvc2BusinessName")) {
						key.setpvc2BusinessName(msgKey.getKeyValue("pvc2BusinessName"));
					}
					if(msgKeyType.containsKeyColumn("pvc2PlantCd")) {
						key.setpvc2PlantCd(msgKey.getKeyValue("pvc2PlantCd"));
					}
					if(msgKeyType.containsKeyColumn("pnumReturn")) {
						key.setpnumReturn(new Integer(msgKey.getKeyValue("pnumReturn")));
					}
					if(msgKeyType.containsKeyColumn("PROGRAM_CD")) {
						key.setPROGRAM_CD(msgKey.getKeyValue("PROGRAM_CD"));
					}
					if(msgKeyType.containsKeyColumn("FUNCTION_NAME")) {
						key.setFUNCTION_NAME(msgKey.getKeyValue("FUNCTION_NAME"));
					}
					if(msgKeyType.containsKeyColumn("BUSINESS_GROUP_CD")) {
						key.setBUSINESS_GROUP_CD(msgKey.getKeyValue("BUSINESS_GROUP_CD"));
					}
					if(msgKeyType.containsKeyColumn("BUSINESS_CD")) {
						key.setBUSINESS_CD(msgKey.getKeyValue("BUSINESS_CD"));
					}
					if(msgKeyType.containsKeyColumn("FILE_PATH")) {
						key.setFILE_PATH(msgKey.getKeyValue("FILE_PATH"));
					}
					if(msgKeyType.containsKeyColumn("FILE_NAME")) {
						key.setFILE_NAME(msgKey.getKeyValue("FILE_NAME"));
					}
					if(msgKeyType.containsKeyColumn("LOG_MODE_TYP")) {
						key.setLOG_MODE_TYP(new Double(msgKey.getKeyValue("LOG_MODE_TYP")));
					}
					if(msgKeyType.containsKeyColumn("OUTPUT_MODE_TYP")) {
						key.setOUTPUT_MODE_TYP(new Double(msgKey.getKeyValue("OUTPUT_MODE_TYP")));
					}
					if(msgKeyType.containsKeyColumn("SUB1_h_PRD_DUE_DATE")) {
						key.setSUB1_h_PRD_DUE_DATE(msgKey.getKeyValue("SUB1_h_PRD_DUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("SUB1_ITEM_NAME")) {
						key.setSUB1_ITEM_NAME(msgKey.getKeyValue("SUB1_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("MAIN_h_PLANT_CD")) {
						key.setMAIN_h_PLANT_CD(msgKey.getKeyValue("MAIN_h_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("MAIN_h_JOB_ODR_CD")) {
						key.setMAIN_h_JOB_ODR_CD(msgKey.getKeyValue("MAIN_h_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("MAIN_h_ITEM_CD")) {
						key.setMAIN_h_ITEM_CD(msgKey.getKeyValue("MAIN_h_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("MAIN_h_PRD_DUE_DATE_FROM")) {
						key.setMAIN_h_PRD_DUE_DATE_FROM(msgKey.getKeyValue("MAIN_h_PRD_DUE_DATE_FROM"));
					}
					if(msgKeyType.containsKeyColumn("MAIN_h_PRD_DUE_DATE_TO")) {
						key.setMAIN_h_PRD_DUE_DATE_TO(msgKey.getKeyValue("MAIN_h_PRD_DUE_DATE_TO"));
					}
					if(msgKeyType.containsKeyColumn("SUB1_h_l_JOB_ODR_CD")) {
						key.setSUB1_h_l_JOB_ODR_CD(msgKey.getKeyValue("SUB1_h_l_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("SUB1_h_l_ITEM_CD")) {
						key.setSUB1_h_l_ITEM_CD(msgKey.getKeyValue("SUB1_h_l_ITEM_CD"));
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
