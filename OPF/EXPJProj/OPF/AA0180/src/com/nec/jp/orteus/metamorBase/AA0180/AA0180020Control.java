/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AA0180/src/com/nec/jp/orteus/metamorBase/AA0180/AA0180020Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AA0180;

import com.nec.jp.orteus.metamorBase.AA0180.*;
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

import java.text.ParseException;
import com.nec.jp.orteus.expj.util.ExpjMessage;
import com.nec.jp.orteus.expj.psmaintenance.PsMaintenance;
import com.nec.jp.orteus.expj.exception.NoDataException;
import com.nec.jp.orteus.expj.exception.ExpjBadException;
import com.nec.jp.orteus.expj.exception.PsEffPhaseException;
import com.nec.jp.orteus.expj.exception.PsLoopException;
import com.nec.jp.orteus.expj.exception.PsMrpOdrTypException;

//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AA0180020Control
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
        public AA0180020Struct getListvalue(int x) { return (AA0180020Struct)(this.list.get(x)); }	// リストの値を返します。
        public AA0180020Struct getStruct() { return this.struct; }	// Structを返します。
        public AA0180020Struct createStruct() { return new AA0180020Struct(); }	// 新しいStructを作って返します。
        public void setStruct(Object structname) { this.struct.setStruct((AA0180020Struct)structname); }	// Structをセットします。
        public void initializeStruct() { this.struct.initialize(); }	// Structの値を初期化します。
       
        // CSV出力用リスト
        private CsvWriter csvWriter = null;
        public CsvWriter getCsvWriter(){ return this.csvWriter; }
       
        private CsvReader csvReader = null;
        public void setCsvReader(CsvReader cr){ this.csvReader = cr; }
       
        /** 展開区分：正展開 */
        private static final String DEVELOP_NORMAL = "1";
       
        /** 展開区分：逆展開 */
        private static final String DEVELOP_REVERSE = "2";
       
        /** 対象日付 */
        private String _targetDate = null;
       
        /** 製品構成メンテナンス部品アクセス用オブジェクト */
        private PsMaintenance _psMaint = null;
       
        /** 品目番号（画面遷移時） */
        private String _givenItemCd = null;
       
        /** 対象日付（画面遷移時） */
        private String _givenTargetDate = null;
       
        /** 展開区分（画面遷移時） */
        private String _givenDevelopTyp = null;
       
        /** 処理区分（画面遷移時） */
        private String _givenProcTyp = null;
       
        /**
         * データなし例外クラスです。
         */
        private class AA0180020NoDataException extends ExpjBadException
        {
         /**
             * AA0180020NoDataExceptionオブジェクトを構築します。
          *
          * @param em エラーメッセージオブジェクト
          */
         private AA0180020NoDataException(ExpjMessage em)
         {
          super(em);
         }
        }
       
        /**
         * 同一品目番号例外クラスです。
         */
        private class AA0180020SameItemCdException extends ExpjBadException
        {
         /**
             * AA0180020SameItemCdExceptionオブジェクトを構築します。
          *
          * @param em エラーメッセージオブジェクト
          */
         private AA0180020SameItemCdException(ExpjMessage em)
         {
          super(em);
         }
        }
       
        /**
         * 既存構成の一覧を取得します。
         *
         * @param  品目番号
         * @return 既存構成の一覧
         * @throws SQLException DBアクセスに失敗
         * @throws ParseException 日付の形式変換に失敗
         */
        private List getPsList(String itemCd)
          throws SQLException, ParseException
        {
         if (struct.getDEVELOP_TYP().equals(DEVELOP_NORMAL) == true) {
          // 正展開の場合
          if (_targetDate == null || _targetDate.equals("") == true) {
           // 対象日付なしの場合
           return _psMaint.getCompPsList(itemCd);
          } else {
           // 対象日付ありの場合
           return _psMaint.getCompPsList(itemCd, _targetDate);
          }
         } else {
          // 逆展開の場合
          if (_targetDate == null || _targetDate.equals("") == true) {
           // 対象日付なしの場合
           return _psMaint.getParentPsList(itemCd);
          } else {
           // 対象日付ありの場合
           return _psMaint.getParentPsList(itemCd, _targetDate);
          }
         }
        }
       
        /**
         * コピー元既存構成の品目番号がコピー先既存構成の子品目番号に一致するか検査します。
         *
         * @param  コピー先の親品目番号
         * @param  コピー元既存構成の子品目番号
         * @throws SQLException DBアクセスに失敗
         * @throws FoundationException
         * @throws AA0180020SameItemCdException コピー元既存構成の品目がコピー先既存構成の品目に一致
         */
        private void testCompAlreadyExist(String toParentItemCd, String fromCompItemCd)
          throws SQLException, FoundationException, AA0180020SameItemCdException
        {
         AA0180020Struct workStruct = new AA0180020Struct();
         workStruct.setToUp_ITEM_CD(toParentItemCd);
         workStruct.setFrLo_ITEM_CD(fromCompItemCd);
         List workList = entity.mSelectCompM_PS.read(conn, workStruct);
         if (workList != null && workList.size() > 0) {
          // コピー元既存構成の品目がコピー先既存構成の品目に一致した場合
          throw new AA0180020SameItemCdException(new ExpjMessage("ZZ01006",
            "M_PS.PARENT_ITEM_CD,COMP_ITEM_CD:" + toParentItemCd + "," + fromCompItemCd));
         }
        }
       
        /**
         * コピー元既存構成の品目番号がコピー先既存構成の親品目番号に一致するか検査します。
         *
         * @param  コピー元既存構成の親品目番号
         * @param  コピー先の子品目番号
         * @throws FoundationException
         * @throws SQLException DBアクセスに失敗
         * @throws AA0180020SameItemCdException コピー元既存構成の品目がコピー先既存構成の品目に一致
         */
        private void testParentAlreadyExist(String fromParentItemCd, String toCompItemCd)
          throws FoundationException, SQLException, AA0180020SameItemCdException
        {
         AA0180020Struct workStruct = new AA0180020Struct();
         workStruct.setFrLo_ITEM_CD(fromParentItemCd);
         workStruct.setToUp_ITEM_CD(toCompItemCd);
         List workList = entity.mSelectParentM_PS.read(conn, workStruct);
         if (workList != null && workList.size() > 0) {
          // コピー元既存構成の品目がコピー先既存構成の品目に一致した場合
          throw new AA0180020SameItemCdException(new ExpjMessage("ZZ01006",
            "M_PS.PARENT_ITEM_CD,COMP_ITEM_CD:" + fromParentItemCd + "," + toCompItemCd));
         }
        }
       
        /**
         * 品目番号に対する品目名を取得します
         *
         * @param  品目番号
         * @return 品目名
         * @throws FoundationException
         * @throws SQLException DBアクセスに失敗
         * @throws AA0180020NoDataException 品目番号が存在しない
         */
        private String getItemName(String itemCd)
          throws FoundationException, SQLException, AA0180020NoDataException
        {
         AA0180020Struct workStruct = new AA0180020Struct();
         workStruct.setFrUp_ITEM_CD(itemCd);
         List workList = entity.mSelect.read(conn, workStruct);
         if (workList == null || workList.isEmpty()) {
          // 品目番号が存在しない場合
          throw new AA0180020NoDataException(new ExpjMessage("ZZ01006",
            "M_ITEM.ITEM_CD:" + itemCd));
         }
         workStruct = (AA0180020Struct)workList.get(0);
         return workStruct.getFrUp_ITEM_NAME();
        }
    	/**
    	 * 業務エラー発生時のパラメータ設定処理を切り出して関数化
    	 * @param tableName テーブル名
    	 * @param columnName カラム名
    	 * @param value 値
    	 */
    	private void setErrorParameter(String tableName, String columnName, String value) {
    		StringBuffer param = new StringBuffer();
    		param.append(tableName);
    		param.append('.');
    		param.append(columnName);
    		param.append(':');
    		if (value != null) {
    			param.append(value);
    		}

    		ExpjMessage emsg = new ExpjMessage("ZZ01006", param.toString());
    		msgStruct.addError(emsg);
    		sysLog.warning(emsg, sysUSER_CD);
    	}
        /**
         * 画面を消去します。
         *
         * @throws BusinessProcessException
         * @throws FoundationException
         */
        private void clearScreen()
          throws BusinessProcessException, FoundationException
        {
         // 入力されたパラメータを退避
         String saveFrUpItemCd = struct.getFrUp_ITEM_CD();
         String saveh_FrUpItemCd = struct.geth_FrUp_ITEM_CD();
         String saveToUpItemCd = struct.getToUp_ITEM_CD();
         String saveh_ToUpItemCd = struct.geth_ToUp_ITEM_CD();
         String saveTargetDate = struct.getTargetDate();
         String saveh_TargetDate = struct.geth_TargetDate();
         String saveDevelopTyp = struct.getDEVELOP_TYP();
         String saveh_DevelopTyp = struct.geth_DEVELOP_TYP();
         // structを初期化
         struct.initialize();
         // 入力されたパラメータを復元
         struct.setFrUp_ITEM_CD(saveFrUpItemCd);
         struct.seth_FrUp_ITEM_CD(saveh_FrUpItemCd);
         struct.setToUp_ITEM_CD(saveToUpItemCd);
         struct.seth_ToUp_ITEM_CD(saveh_ToUpItemCd);
         struct.setTargetDate(saveTargetDate);
         struct.seth_TargetDate(saveh_TargetDate);
         struct.setDEVELOP_TYP(saveDevelopTyp);
         struct.seth_DEVELOP_TYP(saveh_DevelopTyp);
       
         // listを初期化
         if (list != null) {
          list.clear();
         }
         if (_toList != null) {
          _toList.clear();
         }
       
         // 読込状態（初期状態）を設定
         setReadStatus(INITIAL);
        }
       
        /**
         * 画面を初期化します。
         *
         * @throws BusinessProcessException
         * @throws FoundationException
         */
        private void initializeScreen()
          throws BusinessProcessException, FoundationException
        {
         // 別サーブレットの画面から呼び出されたとき渡されたパラメータを退避
         String saveh_FrUpItemCd = struct.geth_FrUp_ITEM_CD();
         String saveh_ToUpItemCd = struct.geth_ToUp_ITEM_CD();
         String saveh_TargetDate = struct.geth_TargetDate();
         String saveh_DevelopTyp = struct.geth_DEVELOP_TYP();
         // structを初期化
         struct.initialize();
         // 別サーブレットの画面から呼び出されたとき渡されたパラメータを復元
         struct.setFrUp_ITEM_CD(saveh_FrUpItemCd);
         struct.seth_FrUp_ITEM_CD(saveh_FrUpItemCd);
         struct.setToUp_ITEM_CD(saveh_ToUpItemCd);
         struct.seth_ToUp_ITEM_CD(saveh_ToUpItemCd);
         struct.setTargetDate(saveh_TargetDate);
         struct.seth_TargetDate(saveh_TargetDate);
         struct.setDEVELOP_TYP(saveh_DevelopTyp);
         struct.seth_DEVELOP_TYP(saveh_DevelopTyp);
       
         // listを初期化
         if (list != null) {
          list.clear();
         }
         if (_toList != null) {
          _toList.clear();
         }
       
         // 読込状態（初期状態）を設定
         setReadStatus(INITIAL);
       
         if (struct.geth_DEVELOP_TYP() != null && struct.geth_DEVELOP_TYP().equals("") == false) {
          // 別サーブレットの画面から呼び出されたときは、読込処理を実行
          selectByInputData();
         }
        }
       
        /**
         * 読込処理を行います。
         * （読込領域の入力項目に対して検索処理を行い、画面に表示するために値を設定します）
         *
         * @throws BusinessProcessException
         * @throws FoundationException
         * @throws ExpjException システムエラー
         */
        private void selectByInputData()
          throws BusinessProcessException, FoundationException, ExpjException
        {
         try {
          //品目存在確認フラグの定義
          boolean FrUp_ITEM_CD_flg = false;
          boolean ToUp_ITEM_CD_flg = false;
          
          // 製品構成メンテナンス用オブジェクトを構築
          beginTransaction();		// システム時刻を取得
          _psMaint = new PsMaintenance(conn, getsysUSER_CD(), sp.getProcId(),
            struct.getsSysdate());
          // 対象日付の設定
          _targetDate = struct.getTargetDate();
       
          // コピー元品目番号の存在チェック
           if (struct.getFrUp_ITEM_CD() != null
             && struct.getFrUp_ITEM_CD().equals("") == false){
               struct.setCK_ITEM_CD(struct.getFrUp_ITEM_CD());
               if(!entity.mCheckItem_cd.check(conn, struct)){
                   // 読込状態（読込失敗）を設定
                   setReadStatus(ERROR);
                   // 警告：対象データが存在しません。
                   ExpjMessage emsg = new ExpjMessage("ZZ06001");
                   msgStruct.addError(emsg);
                   setErrorParameter("M_ITEM","ITEM_CD",struct.getFrUp_ITEM_CD());
                   
               }else{
            	   //コピー元品目存在確認
            	   FrUp_ITEM_CD_flg =true;
            	   
                   // コピー元既存構成の取得
                   List frPs = getPsList(struct.getFrUp_ITEM_CD());
                   int frPsSize = 0;
                   if (frPs != null) {
                	   frPsSize = frPs.size();
                   }
                   if (list == null) {
                	   list = new ArrayList(0);
                   } else {
                	   list.clear();
                   }
                   if (frPsSize == 0 && struct.getFrUp_ITEM_CD() != null
                     && struct.getFrUp_ITEM_CD().equals("") == false) {
                       // コピー元品目番号の既存構成が存在しない場合
                       AA0180020NoDataException nde = null;
                       if (struct.getDEVELOP_TYP().equals(DEVELOP_NORMAL) == true) {
                           // 正展開の場合
                           nde = new AA0180020NoDataException(new ExpjMessage("ZZ01006",
                             "M_PS.PARENT_ITEM_CD:" + struct.getFrUp_ITEM_CD()));
                       } else {
                           // 逆展開の場合
                           nde = new AA0180020NoDataException(new ExpjMessage("ZZ01006",
                             "M_PS.COMP_ITEM_CD:" + struct.getFrUp_ITEM_CD()));
                       }
                       throw nde;
                   }
                   for (int i = 0; i < frPsSize; i++) {
                       AA0180020Struct workStruct = new AA0180020Struct();
                       String[] frPss = (String[])frPs.get(i);
                       workStruct.setFrLo_ITEM_CD(frPss[0]);
                       workStruct.setFr_PS_EDITION(frPss[1]);
                       workStruct.setFrLo_ITEM_NAME(getItemName(frPss[0]));
                       workStruct.setFr_EFF_PHASE_IN_DATE(frPss[2]);
                       workStruct.setFr_EFF_PHASE_OUT_DATE(frPss[3]);
                       workStruct.seth_Fr_MODIFY_COUNT(frPss[4]);
                       list.add(workStruct);
                   }
               }
           }
           // コピー先品目番号の存在チェック
           if (struct.getToUp_ITEM_CD() != null
             && struct.getToUp_ITEM_CD().equals("") == false)
           {
               struct.setCK_ITEM_CD(struct.getToUp_ITEM_CD());
               if(!entity.mCheckItem_cd.check(conn, struct)){
                   // 読込状態（読込失敗）を設定
                   setReadStatus(ERROR);
                   // 警告：対象データが存在しません。
                   ExpjMessage emsg = new ExpjMessage("ZZ06001" ,"M_ITEM.ITEM_CD:" + struct.geth_ToUp_ITEM_CD());
                   msgStruct.addError(emsg);
                   setErrorParameter("M_ITEM","ITEM_CD",struct.getToUp_ITEM_CD());
               }else{
            	   //コピー先品目存在確認
            	   ToUp_ITEM_CD_flg =true;
            	   
                   // コピー先既存構成の取得
                   List toPs = getPsList(struct.getToUp_ITEM_CD());
                   int toPsSize = 0;
                   if (toPs != null) {
                	   toPsSize = toPs.size();
                   }
                   if (_toList == null) {
                	   _toList = new ArrayList(0);
                   } else {
                	   _toList.clear();
                   }
                   for (int i = 0; i < toPsSize; i++) {
                       AA0180020Struct workStruct = new AA0180020Struct();
                       String[] toPss = (String[])toPs.get(i);
                       workStruct.setToLo_ITEM_CD(toPss[0]);
                       workStruct.setTo_PS_EDITION(toPss[1]);
                       workStruct.setToLo_ITEM_NAME(getItemName(toPss[0]));
                       workStruct.setTo_EFF_PHASE_IN_DATE(toPss[2]);
                       workStruct.setTo_EFF_PHASE_OUT_DATE(toPss[3]);
                       _toList.add(workStruct);
                   }
               }
           }
          if (FrUp_ITEM_CD_flg&&ToUp_ITEM_CD_flg)
          {
           // 読込状態（読込成功）を設定
           setReadStatus(NORMAL);
          }
       
         } catch (AA0180020NoDataException nde) {
          // 読込状態（読込失敗）を設定
          setReadStatus(ERROR);
          // 警告：対象データが存在しません。
          ExpjMessage emsg = new ExpjMessage("ZZ06001");
          msgStruct.addError(emsg);
          sysLog.warning(emsg, getsysUSER_CD());
          emsg = nde.getExpjMessage();
          if (emsg != null) {
           msgStruct.addError(emsg);
           sysLog.warning(emsg, getsysUSER_CD());
          }
          return;
         } catch (ParseException pe) {
          // 読込状態（読込失敗）を設定
          setReadStatus(ERROR);
          // エラー：サーバでエラーが発生しました。
          ExpjMessage emsg = new ExpjMessage("ZZ01106");
          sysLog.severe(emsg, getsysUSER_CD());
          ExpjException ee = new ExpjException(pe, emsg);
          if (_psMaint != null) {
           emsg = _psMaint.getErrorInfo();
           if (emsg != null) {
            sysLog.severe(emsg, getsysUSER_CD());
           }
          }
          throw ee;
         } catch (SQLException se) {
          // 読込状態（読込失敗）を設定
          setReadStatus(ERROR);
          // エラー：サーバでエラーが発生しました。
          ExpjMessage emsg = new ExpjMessage("ZZ01106");
          sysLog.severe(emsg, getsysUSER_CD());
          ExpjException ee = new ExpjException(se, emsg);
          if (_psMaint != null) {
           emsg = _psMaint.getErrorInfo();
           if (emsg != null) {
            sysLog.severe(emsg, getsysUSER_CD());
           }
          }
          emsg = new ExpjMessage("ZZ01006", se.toString());
          sysLog.severe(emsg, getsysUSER_CD());
          throw ee;
         }
        }
       
        /**
         * コピー先の一覧部分の結果リストを画面に表示するためのリストインスタンス
         */
        protected List _toList;
       
        /**
         * 品目番号（画面遷移時）を設定します。
         *
         * @param val 品目番号
         */
        protected void setITEM_CD(String val)
        {
         _givenItemCd = val;
        }
       
        /**
         * 品目番号（画面遷移時）を取得します。
         *
         * @return 品目番号
         */
        protected String getITEM_CD()
        {
         return _givenItemCd;
        }
       
        /**
         * 対象日付（画面遷移時）を設定します。
         *
         * @param val 対象日付
         */
        protected void setTargetDate(String val)
        {
         _givenTargetDate = val;
        }
       
        /**
         * 対象日付（画面遷移時）を取得します。
         *
         * @return 対象日付
         */
        protected String getTargetDate()
        {
         return _givenTargetDate;
        }
       
        /**
         * 展開区分（画面遷移時）を設定します。
         *
         * @param val 展開区分
         */
        protected void setDEVELOP_TYP(String val)
        {
         _givenDevelopTyp = val;
        }
       
        /**
         * 展開区分（画面遷移時）を取得します。
         *
         * @return 展開区分
         */
        protected String getDEVELOP_TYP()
        {
         return _givenDevelopTyp;
        }
       
        /**
         * 処理区分（画面遷移時）を設定します。
         *
         * @param val 処理区分
         */
        protected void setProcTyp(String val) {
         _givenProcTyp = val;
        }
       
        /**
         * 処理区分（画面遷移時）を取得します。
         *
         * @return 処理区分
         */
        protected String getProcTyp()
        {
         return _givenProcTyp;
        }
       
        /**
         * コピー先の一覧部分の結果リストを返します。
         *
         * @return コピー先の一覧部分の結果リスト
         */
        public List getToList() {
         return _toList;
        }
       
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * 読込ボタン押下時に実行される処理です。
	 *
	 */
	public void controlSelect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0180");
		logger.entering("AA0180020Control"+":USER="+struct.getsUser_ID(),"controlSelect");
			//{{user_implement_dev:<controlSelect>
              
                // 画面をクリア
                clearScreen();
              
                // 読込処理を実行
                selectByInputData();
              
                //}}user_implement_dev:<controlSelect>
		logger.exiting("AA0180020Control"+":USER="+struct.getsUser_ID(),"controlSelect");

		return;
	}

	/**
	 * 更新ボタン押下時に実行される処理です。
	 *
	 */
	public void controlUpdate() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0180");
		logger.entering("AA0180020Control"+":USER="+struct.getsUser_ID(),"controlUpdate");
			//{{user_implement_dev:<controlUpdate>
              
                try {
                 // トランザクションを開始
                 conn.beginTransWeb();
              
                 // 製品構成メンテナンス用オブジェクトを構築
                 beginTransaction();		// システム時刻を取得
                 _psMaint = new PsMaintenance(conn, getsysUSER_CD(), sp.getProcId(),
                   struct.getsSysdate());
                 // 対象日付の設定
                 _targetDate = struct.getTargetDate();
              
                 // コピー元既存構成のリスト生成
                 List frLoItemCdList = struct.getList_FrLo_ITEM_CD();
                 List frPsEditionList = struct.getList_Fr_PS_EDITION();
                 List frEffPhaseInDateList = struct.getList_Fr_EFF_PHASE_IN_DATE();
                 List frEffPhaseOutDateList = struct.getList_Fr_EFF_PHASE_OUT_DATE();
                 List frModifyCountList = struct.getList_h_Fr_MODIFY_COUNT();
                 int frLoItemCdListSize = 0;
                 if (frLoItemCdList != null) {
                  frLoItemCdListSize = frLoItemCdList.size();
                 }
                 for (int i = 0; i < frLoItemCdListSize; i++) {
                  String frLoItemCd = (String)frLoItemCdList.get(i);
                  if (frLoItemCd.equals(struct.getToUp_ITEM_CD()) == true) {
                   // コピー元既存構成の品目番号がコピー先品目番号に一致
                   AA0180020SameItemCdException sice = null;
                   if (struct.getDEVELOP_TYP().equals(DEVELOP_NORMAL) == true) {
                    // 正展開の場合
                    sice = new AA0180020SameItemCdException(new ExpjMessage("ZZ01006",
                      "M_PS.COMP_ITEM_CD:" + frLoItemCd));
                   } else {
                    // 逆展開の場合
                    sice = new AA0180020SameItemCdException(new ExpjMessage("ZZ01006",
                      "M_PS.PARENT_ITEM_CD:" + frLoItemCd));
                   }
                   throw sice;
                  }
                  String frPsEdition = (String)frPsEditionList.get(i);
                  int toListSize = _toList.size();
                  for (int j = 0; j < toListSize; j++) {
                   AA0180020Struct workStruct = (AA0180020Struct)_toList.get(j);
                   if (workStruct.getToLo_ITEM_CD().equals(frLoItemCd) == true
                     && workStruct.getTo_PS_EDITION().equals(frPsEdition) == true)
                   {
                    // コピー元既存構成の品目番号がコピー先既存構成の品目番号に一致
                    AA0180020SameItemCdException sice = null;
                    if (struct.getDEVELOP_TYP().equals(DEVELOP_NORMAL) == true) {
                     // 正展開の場合
                     sice = new AA0180020SameItemCdException(new ExpjMessage("ZZ01006",
                       "M_PS.COMP_ITEM_CD:" + frLoItemCd));
                    } else {
                     // 逆展開の場合
                     sice = new AA0180020SameItemCdException(new ExpjMessage("ZZ01006",
                       "M_PS.PARENT_ITEM_CD:" + frLoItemCd));
                    }
                    throw sice;
                   }
                  }
                  String frEffPhaseInDate = (String)frEffPhaseInDateList.get(i);
                  String frEffPhaseOutDate = (String)frEffPhaseOutDateList.get(i);
                  if (struct.getDEVELOP_TYP().equals(DEVELOP_NORMAL) == true) {
                   // 正展開の場合
                   // コピー元既存構成の品目番号がコピー先既存構成の品目番号に一致
                   testCompAlreadyExist(struct.getToUp_ITEM_CD(), frLoItemCd);
                   // 製品構成の品目手配区分検査
                   _psMaint.testMrpOrderType(struct.getToUp_ITEM_CD(), frLoItemCd);
                   // 製品構成の重複期間検査
                   _psMaint.testConflictEffPhase(struct.getToUp_ITEM_CD(), frLoItemCd,
                     frPsEdition, frEffPhaseInDate, frEffPhaseInDate);
                   // 製品構成のルーピング検査
                   _psMaint.testLoopingCompPs(struct.getToUp_ITEM_CD(), frLoItemCd);
                  } else {
                   // 逆展開の場合
                   // コピー元既存構成の品目番号がコピー先既存構成の品目番号に一致
                   testParentAlreadyExist(frLoItemCd, struct.getToUp_ITEM_CD());
                   // 製品構成の品目手配区分検査
                   _psMaint.testMrpOrderType(frLoItemCd, struct.getToUp_ITEM_CD());
                   // 製品構成の重複期間検査
                   _psMaint.testConflictEffPhase(frLoItemCd, struct.getToUp_ITEM_CD(),
                     frPsEdition, frEffPhaseInDate, frEffPhaseInDate);
                   // 製品構成のルーピング検査
                   _psMaint.testLoopingCompPs(frLoItemCd, struct.getToUp_ITEM_CD());
                  }
                 }
                 for (int i = 0; i < frLoItemCdListSize; i++) {
                  String frLoItemCd = (String)frLoItemCdList.get(i);
                  String frPsEdition = (String)frPsEditionList.get(i);
                  String frModifyCount = (String)frModifyCountList.get(i);
                  if (struct.getDEVELOP_TYP().equals(DEVELOP_NORMAL) == true) {
                   // 正展開の場合
                   // コピー元既存子構成をコピー
                   _psMaint.copyCompPs(struct.getFrUp_ITEM_CD(), frLoItemCd, frPsEdition,
                     frModifyCount, struct.getToUp_ITEM_CD());
                  } else {
                   // 逆展開の場合
                   // コピー元既存親構成をコピー
                   _psMaint.copyParentPs(frLoItemCd, struct.getFrUp_ITEM_CD(), frPsEdition,
                     frModifyCount, struct.getToUp_ITEM_CD());
                  }
                 }
              
                 // データを確定
                 conn.commit();
              
                 // 再表示
                 controlSelect();
              
                } catch (AA0180020SameItemCdException sice) {
                 // 読込状態（読込失敗）を設定
                 setReadStatus(ERROR);
                 // 警告：同一品目番号は追加できません。
                 ExpjMessage emsg = new ExpjMessage("AA00051");
                 msgStruct.addError(emsg);
                 sysLog.warning(emsg, getsysUSER_CD());
                 emsg = sice.getExpjMessage();
                 if (emsg != null) {
                  msgStruct.addError(emsg);
                  sysLog.warning(emsg, getsysUSER_CD());
                 }
                 return;
                } catch (PsMrpOdrTypException pmote) {
                 // 警告：この構成は手配区分に矛盾があります。
                 ExpjMessage emsg = new ExpjMessage("AA00052");
                 msgStruct.addError(emsg);
                 sysLog.warning(emsg, getsysUSER_CD());
                 emsg = pmote.getExpjMessage();
                 if (emsg != null) {
                  msgStruct.addError(emsg);
                  sysLog.warning(emsg, getsysUSER_CD());
                 }
                 return;
                } catch (PsEffPhaseException pepe) {
                 // 警告：有効日が重複しています。
                 ExpjMessage emsg = new ExpjMessage("AA00054");
                 msgStruct.addError(emsg);
                 sysLog.warning(emsg, getsysUSER_CD());
                 emsg = pepe.getExpjMessage();
                 if (emsg != null) {
                  msgStruct.addError(emsg);
                  sysLog.warning(emsg, getsysUSER_CD());
                 }
                 return;
                } catch (PsLoopException ple) {
                 // 警告：構成情報に矛盾があります。
                 ExpjMessage emsg = new ExpjMessage("AA00055");
                 msgStruct.addError(emsg);
                 sysLog.warning(emsg, getsysUSER_CD());
                 emsg = ple.getExpjMessage();
                 if (emsg != null) {
                  msgStruct.addError(emsg);
                  sysLog.warning(emsg, getsysUSER_CD());
                 }
                 return;
                } catch (NoDataException nde) {
                 // 警告：対象データが存在しません。
                 ExpjMessage emsg = new ExpjMessage("ZZ06001");
                 msgStruct.addError(emsg);
                 sysLog.warning(emsg, getsysUSER_CD());
                 if (_psMaint != null) {
                  emsg = _psMaint.getErrorInfo();
                  if (emsg != null) {
                   msgStruct.addError(emsg);
                   sysLog.warning(emsg, getsysUSER_CD());
                  }
                 }
                 return;
                } catch (ExpjBadException ebe) {
                 ExpjMessage emsg = ebe.getExpjMessage();
                 if (emsg == null) {
                  // エラー：サーバでエラーが発生しました。
                  emsg = new ExpjMessage("ZZ01106");
                  sysLog.severe(emsg, getsysUSER_CD());
                  ExpjException ee = new ExpjException(ebe, emsg);
                  throw ee;
                 }
                 // 警告：他の処理によりデータが書き換えられています。メニューに戻ってやり直して下さい。
                 // 警告：指定キーのデータがすでに存在します。
                 String code = emsg.getCode();
                 String value = emsg.getValue();
                 emsg = new ExpjMessage(code);
                 msgStruct.addError(emsg);
                 sysLog.warning(emsg, getsysUSER_CD());
                 emsg = new ExpjMessage("ZZ01006", value);
                 msgStruct.addError(emsg);
                 sysLog.warning(emsg, getsysUSER_CD());
                 return;
                } catch (ParseException pe) {
                 // エラー：サーバでエラーが発生しました。
                 ExpjMessage emsg = new ExpjMessage("ZZ01106");
                 sysLog.severe(emsg, getsysUSER_CD());
                 ExpjException ee = new ExpjException(pe, emsg);
                 emsg = _psMaint.getErrorInfo();
                 if (emsg != null) {
                  sysLog.severe(emsg, getsysUSER_CD());
                 }
                 throw ee;
                } catch (SQLException se) {
                 // エラー：サーバでエラーが発生しました。
                 ExpjMessage emsg = new ExpjMessage("ZZ01106");
                 sysLog.severe(emsg, getsysUSER_CD());
                 ExpjException ee = new ExpjException(se, emsg);
                 emsg = _psMaint.getErrorInfo();
                 if (emsg != null) {
                  sysLog.severe(emsg, getsysUSER_CD());
                 }
                 emsg = new ExpjMessage("ZZ01006", se.toString());
                 sysLog.severe(emsg, getsysUSER_CD());
                 throw ee;
                } finally {
                 if (conn != null) {
                  conn.rollback();
                 }
                }
              
                //}}user_implement_dev:<controlUpdate>
		logger.exiting("AA0180020Control"+":USER="+struct.getsUser_ID(),"controlUpdate");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0180");
		logger.entering("AA0180020Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
              
                // 画面を初期化（struct，listも初期化）
                initializeScreen();
              
                //}}user_implement_dev:<controlClear>
		logger.exiting("AA0180020Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * 閉じるボタン押下時に実行される処理です。
	 *
	 */
	public void controlClose() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0180");
		logger.entering("AA0180020Control"+":USER="+struct.getsUser_ID(),"controlClose");
			//{{user_implement_dev:<controlClose>
                 // TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlClose>
		logger.exiting("AA0180020Control"+":USER="+struct.getsUser_ID(),"controlClose");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0180");
		logger.entering("AA0180020Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
                 // TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AA0180020Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0180");
		logger.entering("AA0180020Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
              
                // 画面遷移の呼び出しだったら、Structに画面遷移キーを設定してcontrolSelect()を呼び出す
                if (isScreenMove() == true) {
                 if (_givenProcTyp != null && _givenProcTyp.equals("CopyFrom") == true) {
                  // コピー登録：これをコピー
                  struct.setFrUp_ITEM_CD(_givenItemCd);
                  struct.seth_FrUp_ITEM_CD(_givenItemCd);
                 } else {
                  // コピー登録：ここへコピー
                  struct.setToUp_ITEM_CD(_givenItemCd);
                  struct.seth_ToUp_ITEM_CD(_givenItemCd);
                 }
                 struct.setTargetDate(_givenTargetDate);
                 struct.seth_TargetDate(_givenTargetDate);
                 struct.setDEVELOP_TYP(_givenDevelopTyp);
                 struct.seth_DEVELOP_TYP(_givenDevelopTyp);
                }
              
                // 画面を初期化（struct，listも初期化）
                initializeScreen();
              
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AA0180020Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * イベントハンドラの前処理です。
	 *
	 * @param buttun ボタン名
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0180");
		logger.entering("AA0180020Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
                 // 展開区分のコンボボックスデータを設定
                 ComboBox comboController = new ComboBox(conn, sysUSER_CD);
                 ComboStruct DEVELOP_TYP = comboController.getData("DEVELOP_TYP");
                 struct.setList_DEVELOP_TYP_val(DEVELOP_TYP.getValList());
                 struct.setList_DEVELOP_TYP_name(DEVELOP_TYP.getExplanList());
                } catch (SQLException se) {
                 // エラー：サーバでエラーが発生しました。
                 ExpjMessage emsg = new ExpjMessage("ZZ01106");
                 sysLog.severe(emsg, getsysUSER_CD());
                 ExpjException ee = new ExpjException(se, emsg);
                 emsg = new ExpjMessage("ZZ01006", se.toString());
                 sysLog.severe(emsg, getsysUSER_CD());
                 throw ee;
                }
              
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("AA0180020Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
//			throw new FoundationException("AA0180020Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AA0180020-E999","CSVの出力処理"));
			throw new FoundationException("AA0180020Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AA0180020-E999","システム日付の取得処理"));
				throw new FoundationException("AA0180020Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
                 // TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AA0180020-E999","コントロールのイベント処理"));
			throw new FoundationException("AA0180020Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected AA0180020Entity entity;
	protected AA0180020Struct struct;
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

		entity = new AA0180020Entity();
		struct = new AA0180020Struct();

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
	 * AA0180020クラスの標準コンストラクタ
	 */
	public AA0180020Control() throws BusinessProcessException, FoundationException
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
				AA0180020Struct key = (AA0180020Struct)keyList.get(j);
				// メッセージキーを作成する
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("ToUp_ITEM_NAME") && key.getToUp_ITEM_NAME() != null) {
					msgKey.setKeyValue("ToUp_ITEM_NAME", key.getToUp_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("TargetDate") && key.getTargetDate() != null) {
					msgKey.setKeyValue("TargetDate", key.getTargetDate());
				}
				if(msgKeyType.containsKeyColumn("DEVELOP_TYP") && key.getDEVELOP_TYP() != null) {
					msgKey.setKeyValue("DEVELOP_TYP", key.getDEVELOP_TYP());
				}
				if(msgKeyType.containsKeyColumn("Fr_PS_EDITION") && key.getFr_PS_EDITION() != null) {
					msgKey.setKeyValue("Fr_PS_EDITION", key.getFr_PS_EDITION());
				}
				if(msgKeyType.containsKeyColumn("Fr_EFF_PHASE_IN_DATE") && key.getFr_EFF_PHASE_IN_DATE() != null) {
					msgKey.setKeyValue("Fr_EFF_PHASE_IN_DATE", key.getFr_EFF_PHASE_IN_DATE());
				}
				if(msgKeyType.containsKeyColumn("Fr_EFF_PHASE_OUT_DATE") && key.getFr_EFF_PHASE_OUT_DATE() != null) {
					msgKey.setKeyValue("Fr_EFF_PHASE_OUT_DATE", key.getFr_EFF_PHASE_OUT_DATE());
				}
				if(msgKeyType.containsKeyColumn("h_Fr_MODIFY_COUNT") && key.geth_Fr_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("h_Fr_MODIFY_COUNT", key.geth_Fr_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("ToLo_ITEM_CD") && key.getToLo_ITEM_CD() != null) {
					msgKey.setKeyValue("ToLo_ITEM_CD", key.getToLo_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("To_PS_EDITION") && key.getTo_PS_EDITION() != null) {
					msgKey.setKeyValue("To_PS_EDITION", key.getTo_PS_EDITION());
				}
				if(msgKeyType.containsKeyColumn("ToLo_ITEM_NAME") && key.getToLo_ITEM_NAME() != null) {
					msgKey.setKeyValue("ToLo_ITEM_NAME", key.getToLo_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("To_EFF_PHASE_IN_DATE") && key.getTo_EFF_PHASE_IN_DATE() != null) {
					msgKey.setKeyValue("To_EFF_PHASE_IN_DATE", key.getTo_EFF_PHASE_IN_DATE());
				}
				if(msgKeyType.containsKeyColumn("To_EFF_PHASE_OUT_DATE") && key.getTo_EFF_PHASE_OUT_DATE() != null) {
					msgKey.setKeyValue("To_EFF_PHASE_OUT_DATE", key.getTo_EFF_PHASE_OUT_DATE());
				}
				if(msgKeyType.containsKeyColumn("h_FrUp_ITEM_CD") && key.geth_FrUp_ITEM_CD() != null) {
					msgKey.setKeyValue("h_FrUp_ITEM_CD", key.geth_FrUp_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("h_ToUp_ITEM_CD") && key.geth_ToUp_ITEM_CD() != null) {
					msgKey.setKeyValue("h_ToUp_ITEM_CD", key.geth_ToUp_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("h_TargetDate") && key.geth_TargetDate() != null) {
					msgKey.setKeyValue("h_TargetDate", key.geth_TargetDate());
				}
				if(msgKeyType.containsKeyColumn("h_DEVELOP_TYP") && key.geth_DEVELOP_TYP() != null) {
					msgKey.setKeyValue("h_DEVELOP_TYP", key.geth_DEVELOP_TYP());
				}
				if(msgKeyType.containsKeyColumn("DEVELOP_TYP_name") && key.getDEVELOP_TYP_name() != null) {
					msgKey.setKeyValue("DEVELOP_TYP_name", key.getDEVELOP_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("DEVELOP_TYP_val") && key.getDEVELOP_TYP_val() != null) {
					msgKey.setKeyValue("DEVELOP_TYP_val", key.getDEVELOP_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("FrUp_ITEM_NAME") && key.getFrUp_ITEM_NAME() != null) {
					msgKey.setKeyValue("FrUp_ITEM_NAME", key.getFrUp_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("FrUp_ITEM_CD") && key.getFrUp_ITEM_CD() != null) {
					msgKey.setKeyValue("FrUp_ITEM_CD", key.getFrUp_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("FrLo_ITEM_CD") && key.getFrLo_ITEM_CD() != null) {
					msgKey.setKeyValue("FrLo_ITEM_CD", key.getFrLo_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("ToUp_ITEM_CD") && key.getToUp_ITEM_CD() != null) {
					msgKey.setKeyValue("ToUp_ITEM_CD", key.getToUp_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("FrLo_ITEM_NAME") && key.getFrLo_ITEM_NAME() != null) {
					msgKey.setKeyValue("FrLo_ITEM_NAME", key.getFrLo_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("CK_ITEM_CD") && key.getCK_ITEM_CD() != null) {
					msgKey.setKeyValue("CK_ITEM_CD", key.getCK_ITEM_CD());
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
					AA0180020Struct key = new AA0180020Struct();
					if(msgKeyType.containsKeyColumn("ToUp_ITEM_NAME")) {
						key.setToUp_ITEM_NAME(msgKey.getKeyValue("ToUp_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("TargetDate")) {
						key.setTargetDate(msgKey.getKeyValue("TargetDate"));
					}
					if(msgKeyType.containsKeyColumn("DEVELOP_TYP")) {
						key.setDEVELOP_TYP(msgKey.getKeyValue("DEVELOP_TYP"));
					}
					if(msgKeyType.containsKeyColumn("Fr_PS_EDITION")) {
						key.setFr_PS_EDITION(msgKey.getKeyValue("Fr_PS_EDITION"));
					}
					if(msgKeyType.containsKeyColumn("Fr_EFF_PHASE_IN_DATE")) {
						key.setFr_EFF_PHASE_IN_DATE(msgKey.getKeyValue("Fr_EFF_PHASE_IN_DATE"));
					}
					if(msgKeyType.containsKeyColumn("Fr_EFF_PHASE_OUT_DATE")) {
						key.setFr_EFF_PHASE_OUT_DATE(msgKey.getKeyValue("Fr_EFF_PHASE_OUT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("h_Fr_MODIFY_COUNT")) {
						key.seth_Fr_MODIFY_COUNT(msgKey.getKeyValue("h_Fr_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("ToLo_ITEM_CD")) {
						key.setToLo_ITEM_CD(msgKey.getKeyValue("ToLo_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("To_PS_EDITION")) {
						key.setTo_PS_EDITION(msgKey.getKeyValue("To_PS_EDITION"));
					}
					if(msgKeyType.containsKeyColumn("ToLo_ITEM_NAME")) {
						key.setToLo_ITEM_NAME(msgKey.getKeyValue("ToLo_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("To_EFF_PHASE_IN_DATE")) {
						key.setTo_EFF_PHASE_IN_DATE(msgKey.getKeyValue("To_EFF_PHASE_IN_DATE"));
					}
					if(msgKeyType.containsKeyColumn("To_EFF_PHASE_OUT_DATE")) {
						key.setTo_EFF_PHASE_OUT_DATE(msgKey.getKeyValue("To_EFF_PHASE_OUT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("h_FrUp_ITEM_CD")) {
						key.seth_FrUp_ITEM_CD(msgKey.getKeyValue("h_FrUp_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_ToUp_ITEM_CD")) {
						key.seth_ToUp_ITEM_CD(msgKey.getKeyValue("h_ToUp_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_TargetDate")) {
						key.seth_TargetDate(msgKey.getKeyValue("h_TargetDate"));
					}
					if(msgKeyType.containsKeyColumn("h_DEVELOP_TYP")) {
						key.seth_DEVELOP_TYP(msgKey.getKeyValue("h_DEVELOP_TYP"));
					}
					if(msgKeyType.containsKeyColumn("DEVELOP_TYP_name")) {
						key.setDEVELOP_TYP_name(msgKey.getKeyValue("DEVELOP_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("DEVELOP_TYP_val")) {
						key.setDEVELOP_TYP_val(msgKey.getKeyValue("DEVELOP_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("FrUp_ITEM_NAME")) {
						key.setFrUp_ITEM_NAME(msgKey.getKeyValue("FrUp_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("FrUp_ITEM_CD")) {
						key.setFrUp_ITEM_CD(msgKey.getKeyValue("FrUp_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("FrLo_ITEM_CD")) {
						key.setFrLo_ITEM_CD(msgKey.getKeyValue("FrLo_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("ToUp_ITEM_CD")) {
						key.setToUp_ITEM_CD(msgKey.getKeyValue("ToUp_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("FrLo_ITEM_NAME")) {
						key.setFrLo_ITEM_NAME(msgKey.getKeyValue("FrLo_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("CK_ITEM_CD")) {
						key.setCK_ITEM_CD(msgKey.getKeyValue("CK_ITEM_CD"));
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
