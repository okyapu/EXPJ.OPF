/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AH0010/src/com/nec/jp/orteus/metamorBase/AH0010/AH0010020Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AH0010;

import com.nec.jp.orteus.metamorBase.AH0010.*;
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
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AH0010020Control
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
        public AH0010020Struct getListvalue(int x) { return (AH0010020Struct)(this.list.get(x)); }	// リストの値を返します。
        public AH0010020Struct getStruct() { return this.struct; }	// Structを返します。
        public AH0010020Struct createStruct() { return new AH0010020Struct(); }	// 新しいStructを作って返します。
        public void setStruct(Object structname) { this.struct.setStruct((AH0010020Struct)structname); }	// Structをセットします。
       //	public void initializeStruct() { this.struct.initialize(); }	// Structの値を初期化します。
       
        // CSV出力用リスト
        private CsvWriter csvWriter = null;
        public CsvWriter getCsvWriter(){ return this.csvWriter; }
       
        private CsvReader csvReader = null;
        public void setCsvReader(CsvReader cr){ this.csvReader = cr; }
       
       //-------------------------------------------------------------------------
        /** 画面共通定義取得クラス */
        ScreenParam _scParam = sp;
       
       
       //---------- メッセージ関連の処理-- --------------------------------------------
       
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
       
       
       //------------ コンボボックスデータ--------------------------------------
       
        /**
         * 区分名取得（共通）
         *
         * @param	comboStruct	区分情報リスト
         * @param	strTyp		区分コード
         * @return	区分名称(該当するデータがなかった場合は区分コードを返す)
         */
        private String getTypName(ComboStruct comboStruct, String strTyp)
        {
         String strTypName = strTyp;
         if((comboStruct != null) && (strTyp != null))
         {
          for(int i = 0; i < comboStruct.getValList().size(); i++)
          {
           if(strTyp.equals((String)(comboStruct.getValList().get(i))) == true)
           {
            strTypName = (String)(comboStruct.getExplanList().get(i));
            break;
           }
          }
         }
         return strTypName;
        }
       
        /** 品目手配区分 */
        private ComboStruct _MRP_ODR_TYP = new ComboStruct();
       
        /**
         * 品目手配区分名取得
         *
         * @param	String 区分コード
         * @return	String 区分名称(該当するデータがなかった場合は区分コードを返す)
         */
        private String getMRP_ODR_TYP_name(String typ)
        {
         return (getTypName(_MRP_ODR_TYP, typ));
        }
       
        /** 内外作区分 */
        private ComboStruct _OUTSIDE_TYP = new ComboStruct();
       
        /**
         * 内外作区分名取得
         *
         * @param	String 区分コード
         * @return	String 区分名称(該当するデータがなかった場合は区分コードを返す)
         */
        private String getOUTSIDE_TYP_name(String typ)
        {
         return (getTypName(_OUTSIDE_TYP, typ));
        }
       
        /** 棚卸区分 */
        private ComboStruct _ABC_TYP = new ComboStruct();
       
         /**
         * 棚卸区分名取得
         *
         * @param	String 区分コード
         * @return	String 区分名称(該当するデータがなかった場合は区分コードを返す)
         */
        private String getABC_TYP_name(String typ)
        {
         return (getTypName(_ABC_TYP, typ));
        }
       
       
       //------------------------------------------------------------------------
       
        /** 親画面struct情報一時退避用 */
        private AH0010020Struct _save_struct = new AH0010020Struct();
       
        /**
         * 親画面のstruct情報を退避
         */
        private void saveParentStruct()
        {
         _save_struct.copy(struct);
        }
       
        /**
         * 親画面のstruct情報を復帰
         */
        private void loadParentStruct()
        {
         struct.copy(_save_struct);
        }
       
       
       //------------------------------------------------------------------------
        /**
         * SQLExceptionエラーメッセージ設定
         * @param SQLException
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
         emsg = new ExpjMessage( "ZZ01006", message );
         msgStruct.addWarn( emsg );
         sysLog.info(emsg, getsysUSER_CD());
        }
         
        /**
         * 情報メッセージ設定
         * @param メッセージ番号
         * @param 置換文字列１
         */
        private void setInfoMessage(String messageno, String value1)
        {
         ExpjMessage emsg = new ExpjMessage( messageno , value1 );
         msgStruct.addInfo( emsg );
         sysLog.config(emsg, getsysUSER_CD());
        }
         
        /**
         * ログメッセージ設定
         * @param 出力メッセージ
         */
        private void setSyslogConfig(String message)
        {
         ExpjMessage emsg = new ExpjMessage( "ZZ01006", message );
         sysLog.config(emsg, getsysUSER_CD());
        }
       
       
       //---------- ＣＳＶ取込関連の処理 ---------------------------------------------------
       
        /** CSV取込結果メッセージ情報格納用リスト */
        ArrayList _listResultMessageCsv = new ArrayList(0);
       
        /**
         * CSV取込結果情報追加
         *
         * @return	なし
         */
        public void csvResultListAdd(String strMessage, int intRow, int intCol)
        {
         // メッセージ情報格納用
         AH0010020Struct structTemp = new AH0010020Struct();
 		 // 多言語項目取得対応
 		 String locale = CoreTools.getLocale(sysUSER_CD);
         // 行、列情報「{0}件目の{1}項目」
         ExpjMessage emsg = new ExpjMessage("AH00045", ""+(intRow+1), ""+(intCol+1));
         structTemp.setERR_ADR(emsg.getMessage(locale));
         sysLog.warning(emsg, getsysUSER_CD());
       
         // 詳細内容
         structTemp.setERR_MSG(strMessage);
       
         // リストへ情報追加
         _listResultMessageCsv.add(structTemp);
       
         return;
        }
       
        /**
         * CSV取込結果情報リスト取得
         *
         * @return	CSV取込結果情報リスト
         */
        public List getCsvResultList()
        {
         return _listResultMessageCsv;
        }
       
        /**
         * CSV取込結果情報リストサイズ取得
         *
         * @return	CSV取込結果情報リストサイズ
         */
        public int getCsvResultListSize()
        {
         return _listResultMessageCsv.size();
        }
       
        /**
         *  CSV取込結果情報リストクリア
         *
         * @return	なし
         */
        public void csvResultListClear()
        {
         _listResultMessageCsv.clear();
        }
       
       
        /** ＣＳＶ項目番号定義 */
        private final int CSV_COLNO_ITEM_CD = 0;
        private final int CSV_COLNO_INV_FLG_JAN = 1;
        private final int CSV_COLNO_INV_FLG_FEB = 2;
        private final int CSV_COLNO_INV_FLG_MAR = 3;
        private final int CSV_COLNO_INV_FLG_APR = 4;
        private final int CSV_COLNO_INV_FLG_MAY = 5;
        private final int CSV_COLNO_INV_FLG_JUN = 6;
        private final int CSV_COLNO_INV_FLG_JUL = 7;
        private final int CSV_COLNO_INV_FLG_AUG = 8;
        private final int CSV_COLNO_INV_FLG_SEP = 9;
        private final int CSV_COLNO_INV_FLG_OCT = 10;
        private final int CSV_COLNO_INV_FLG_NOV = 11;
        private final int CSV_COLNO_INV_FLG_DEC = 12;
        /** ＣＳＶ取込データ必要項目数 */
        private final int CSV_NECESSARY_COLUMN = (CSV_COLNO_INV_FLG_DEC+1);
       
       
        /**
         * ＣＳＶデータ取得とリストデータ化
         *
         * @return	CSVデータリスト
         */
        private List readCsvData() throws ExpjException
        {
         // ログ出力情報格納用
         String logMessage = "";
         List listMessage = new ArrayList();
       
         String [] strsCsvData = null;
         List listCsv = null;
         try {
       
          // ＣＳＶデータのアップロード
          strsCsvData = (String []) csvReader.lineRead();
          if(null != strsCsvData)
          {
           logMessage = "strsCsvData.length:" + strsCsvData.length;
           setSyslogConfig(logMessage);
       
           // データ件数としてstrsCsvData.lengthは使えない。実際の行数＋５行くらいらしい
           listCsv = new ArrayList(0);
           for(int i = 0; i < strsCsvData.length; i++)
           {
            // 改行のみのレコードでEOFと判断します
            if(strsCsvData[i].length() == 0)
            {
             break;
            }
            // タイトル行読み飛ばし
            if(i == 0)
            {
             continue;
            }
       
            // レコードを項目毎にばらす
            AH0010020Struct structCsv = new AH0010020Struct();
            Vector v = csvReader.importCSVLine(strsCsvData[i]);
            if(null != v)
            {
             // 項目数チェック
             int intColNum = v.size();
             if(CSV_NECESSARY_COLUMN <= intColNum)
             {
              // ＣＳＶの項目をリストデータ化
              structCsv.setw_ITEM_CD((String) v.get(CSV_COLNO_ITEM_CD));
              structCsv.seth_INV_FLG_JAN((String) v.get(CSV_COLNO_INV_FLG_JAN));
              structCsv.seth_INV_FLG_FEB((String) v.get(CSV_COLNO_INV_FLG_FEB));
              structCsv.seth_INV_FLG_MAR((String) v.get(CSV_COLNO_INV_FLG_MAR));
              structCsv.seth_INV_FLG_APR((String) v.get(CSV_COLNO_INV_FLG_APR));
              structCsv.seth_INV_FLG_MAY((String) v.get(CSV_COLNO_INV_FLG_MAY));
              structCsv.seth_INV_FLG_JUN((String) v.get(CSV_COLNO_INV_FLG_JUN));
              structCsv.seth_INV_FLG_JUL((String) v.get(CSV_COLNO_INV_FLG_JUL));
              structCsv.seth_INV_FLG_AUG((String) v.get(CSV_COLNO_INV_FLG_AUG));
              structCsv.seth_INV_FLG_SEP((String) v.get(CSV_COLNO_INV_FLG_SEP));
              structCsv.seth_INV_FLG_OCT((String) v.get(CSV_COLNO_INV_FLG_OCT));
              structCsv.seth_INV_FLG_NOV((String) v.get(CSV_COLNO_INV_FLG_NOV));
              structCsv.seth_INV_FLG_DEC((String) v.get(CSV_COLNO_INV_FLG_DEC));
              structCsv.setw_COLUMN_FLG((String)null);
              // 処理に関連するパラメータを設定
              structCsv.setPLANT_CD(getsysPLANT_CD());
             }
             else
             {
              // 項目数が必要項目数未満のときは項目数不足エラー
              structCsv.setw_COLUMN_FLG(String.valueOf(intColNum));
             }
             // リスト追加
             listCsv.add(structCsv);
            }
            else
            {
             //ベクター生成失敗エラー
             logMessage = "csvReader.Vector was Failed... line:" + strsCsvData[i];
             setSyslogConfig(logMessage);
             listCsv = null;
             break;
            }
           }
           // ＣＳＶデータ件数（タイトル行は省く）
           if((listCsv == null) || (listCsv.size() <= 0))
           {
            // 取込失敗またはデータなし
            ExpjMessage emsg = new ExpjMessage( "AH00042", "0", "0");
            msgStruct.addError( emsg );
            sysLog.warning(emsg, getsysUSER_CD());
            listCsv = null;
           }
           else
           {
            // ＣＳＶ読込み件数ログ表示
            ExpjMessage emsg = new ExpjMessage( "AH00043", ""+listCsv.size());
            sysLog.config(emsg, getsysUSER_CD());
           }
          }
       
         } catch(Exception e){
          ExpjMessage emsg = new ExpjMessage( "AH00042", "0", "0" );
          sysLog.severe(emsg, getsysUSER_CD());
          ExpjException ee = new ExpjException(e, emsg);
          throw ee;
       
         }
         return listCsv;
        }
       
        /**
         * ＣＳＶデータ内容チェック処理
         *
         * @param	listCsv	CSVデータリスト
         * @return	正常:true / エラー:false
         */
        private boolean checkCsvData(List listCsv) throws BusinessProcessException, FoundationException
        {
         // ログ出力情報格納用
         String logMessage = "";
         List listMessage = new ArrayList();
 		 // 多言語項目取得対応
 		 String locale = CoreTools.getLocale(sysUSER_CD);
         boolean bSuccess = true;	// 処理成功フラグ初期化
         int intSuccessCount = 0;	// チェック正常レコード件数
         int intCsvDataCount = 0;	// 対象データ件数
         List listRead;				// 作業用
         try {
       
          AH0010020Struct structCsv;
          intCsvDataCount = listCsv.size();
          for(int i = 0; i < intCsvDataCount; i++)
          {
           ExpjMessage emsg = new ExpjMessage();
       
           // CSV情報取得
           structCsv = (AH0010020Struct)listCsv.get(i);
       
           // 項目数不足エラー行はチェックしない
           if(structCsv.getw_COLUMN_FLG() != null && ("").equals(structCsv.getw_COLUMN_FLG()) != true)
           {
            // 項目数不足エラー
            emsg = new ExpjMessage( "AH00044", ""+CSV_NECESSARY_COLUMN );
            csvResultListAdd(emsg.getMessage(locale) , i , Integer.parseInt(structCsv.getw_COLUMN_FLG()));
            sysLog.warning(emsg, getsysUSER_CD());
            continue;
           }
       
           ////////////////////////////////////////////////////////////////////////////////////
           // 個別チェック処理開始
           ////////////////////////////////////////////////////////////////////////////////////
           
           boolean bError = false;			// エラーフラグ初期化
       
           // 品目番号チェック
           if(structCsv.getw_ITEM_CD() == null || ("").equals(structCsv.getw_ITEM_CD()) == true)
           {
            // 品目番号がnull
            emsg = new ExpjMessage( "AH00001" );
            csvResultListAdd(emsg.getMessage(locale) , i , CSV_COLNO_ITEM_CD);
            sysLog.warning(emsg, getsysUSER_CD());
            logMessage = "CSV.ITEM_CD:" + structCsv.getw_ITEM_CD();
            emsg = new ExpjMessage( "ZZ01006", logMessage );
            sysLog.warning(emsg, getsysUSER_CD());
            bError = true;
           }
           else
           {
            // 品目読込み
            listRead = entity.mM_ITEM.read(conn, structCsv);
            if(listRead.size() <= 0)
            {
             // 品目が存在しない
             emsg = new ExpjMessage( "AH00002" );
             csvResultListAdd(emsg.getMessage(locale) , i , CSV_COLNO_ITEM_CD);
             sysLog.warning(emsg, getsysUSER_CD());
             logMessage = "M_ITEM.ITEM_CD:" + structCsv.getw_ITEM_CD();
             emsg = new ExpjMessage( "ZZ01006", logMessage );
             sysLog.warning(emsg, getsysUSER_CD());
             bError = true;
            }
            else
            {
             AH0010020Struct readStructItem = new AH0010020Struct();
             readStructItem = (AH0010020Struct)listRead.get(0);
             if("8".equals(readStructItem.getw_MRP_ODR_TYP()) == true)
             {
              // 指定された品目が擬似品目
              emsg = new ExpjMessage( "AH00028" );
              csvResultListAdd(emsg.getMessage(locale) , i , CSV_COLNO_ITEM_CD);
              sysLog.warning(emsg, getsysUSER_CD());
              logMessage = "M_ITEM.ITEM_CD:" + structCsv.getw_ITEM_CD();
              emsg = new ExpjMessage( "ZZ01006", logMessage );
              sysLog.warning(emsg, getsysUSER_CD());
              bError = true;
             }
             // 品目の棚卸区分が9（棚卸しない）かどうかのチェック
             if("9".equals(readStructItem.getw_ABC_TYP()) == true)
             {
              // 指定された品目の棚卸区分が9棚卸しない）
              emsg = new ExpjMessage( "AH00016" );
              csvResultListAdd(emsg.getMessage(locale) , i , CSV_COLNO_ITEM_CD);
              sysLog.warning(emsg, getsysUSER_CD());
              logMessage = "M_ITEM.ITEM_CD:" + structCsv.getw_ITEM_CD();
              emsg = new ExpjMessage( "ZZ01006", logMessage );
              sysLog.warning(emsg, getsysUSER_CD());
              bError = true;
             }
            }
           }
       
           // 棚卸実施フラグの値が0か1かのチェック
           // 棚卸実施フラグ1月
           if("1".equals(structCsv.geth_INV_FLG_JAN()) != true &&
              "0".equals(structCsv.geth_INV_FLG_JAN()) != true)
           {
             emsg = new ExpjMessage( "AH00046" );
             csvResultListAdd(emsg.getMessage(locale) , i , CSV_COLNO_INV_FLG_JAN);
             sysLog.warning(emsg, getsysUSER_CD());
             logMessage = "CSV.INV_FLG_JAN:" + structCsv.geth_INV_FLG_JAN();
             emsg = new ExpjMessage( "ZZ01006", logMessage );
             sysLog.warning(emsg, getsysUSER_CD());
             bError = true;
           }
           // 棚卸実施フラグ2月
           if("1".equals(structCsv.geth_INV_FLG_FEB()) != true &&
              "0".equals(structCsv.geth_INV_FLG_FEB()) != true)
           {
             emsg = new ExpjMessage( "AH00046" );
             csvResultListAdd(emsg.getMessage(locale) , i , CSV_COLNO_INV_FLG_FEB);
             sysLog.warning(emsg, getsysUSER_CD());
             logMessage = "CSV.INV_FLG_FEB:" + structCsv.geth_INV_FLG_FEB();
             emsg = new ExpjMessage( "ZZ01006", logMessage );
             sysLog.warning(emsg, getsysUSER_CD());
             bError = true;
           }
           // 棚卸実施フラグ3月
           if("1".equals(structCsv.geth_INV_FLG_MAR()) != true &&
              "0".equals(structCsv.geth_INV_FLG_MAR()) != true)
           {
             emsg = new ExpjMessage( "AH00046" );
             csvResultListAdd(emsg.getMessage(locale) , i , CSV_COLNO_INV_FLG_MAR);
             sysLog.warning(emsg, getsysUSER_CD());
             logMessage = "CSV.INV_FLG_MAR:" + structCsv.geth_INV_FLG_MAR();
             emsg = new ExpjMessage( "ZZ01006", logMessage );
             sysLog.warning(emsg, getsysUSER_CD());
             bError = true;
           }
           // 棚卸実施フラグ4月
           if("1".equals(structCsv.geth_INV_FLG_APR()) != true &&
              "0".equals(structCsv.geth_INV_FLG_APR()) != true)
           {
             emsg = new ExpjMessage( "AH00046" );
             csvResultListAdd(emsg.getMessage(locale) , i , CSV_COLNO_INV_FLG_APR);
             sysLog.warning(emsg, getsysUSER_CD());
             logMessage = "CSV.INV_FLG_APR:" + structCsv.geth_INV_FLG_APR();
             emsg = new ExpjMessage( "ZZ01006", logMessage );
             sysLog.warning(emsg, getsysUSER_CD());
             bError = true;
           }
           // 棚卸実施フラグ5月
           if("1".equals(structCsv.geth_INV_FLG_MAY()) != true &&
              "0".equals(structCsv.geth_INV_FLG_MAY()) != true)
           {
             emsg = new ExpjMessage( "AH00046" );
             csvResultListAdd(emsg.getMessage(locale) , i , CSV_COLNO_INV_FLG_MAY);
             sysLog.warning(emsg, getsysUSER_CD());
             logMessage = "CSV.INV_FLG_MAY:" + structCsv.geth_INV_FLG_MAY();
             emsg = new ExpjMessage( "ZZ01006", logMessage );
             sysLog.warning(emsg, getsysUSER_CD());
             bError = true;
           }
           // 棚卸実施フラグ6月
           if("1".equals(structCsv.geth_INV_FLG_JUN()) != true &&
              "0".equals(structCsv.geth_INV_FLG_JUN()) != true)
           {
             emsg = new ExpjMessage( "AH00046" );
             csvResultListAdd(emsg.getMessage(locale) , i , CSV_COLNO_INV_FLG_JUN);
             sysLog.warning(emsg, getsysUSER_CD());
             logMessage = "CSV.INV_FLG_JUN:" + structCsv.geth_INV_FLG_JUN();
             emsg = new ExpjMessage( "ZZ01006", logMessage );
             sysLog.warning(emsg, getsysUSER_CD());
             bError = true;
           }
           // 棚卸実施フラグ7月
           if("1".equals(structCsv.geth_INV_FLG_JUL()) != true &&
              "0".equals(structCsv.geth_INV_FLG_JUL()) != true)
           {
             emsg = new ExpjMessage( "AH00046" );
             csvResultListAdd(emsg.getMessage(locale) , i , CSV_COLNO_INV_FLG_JUL);
             sysLog.warning(emsg, getsysUSER_CD());
             logMessage = "CSV.INV_FLG_JUL:" + structCsv.geth_INV_FLG_JUL();
             emsg = new ExpjMessage( "ZZ01006", logMessage );
             sysLog.warning(emsg, getsysUSER_CD());
             bError = true;
           }
           // 棚卸実施フラグ8月
           if("1".equals(structCsv.geth_INV_FLG_AUG()) != true &&
              "0".equals(structCsv.geth_INV_FLG_AUG()) != true)
           {
             emsg = new ExpjMessage( "AH00046" );
             csvResultListAdd(emsg.getMessage(locale) , i , CSV_COLNO_INV_FLG_AUG);
             sysLog.warning(emsg, getsysUSER_CD());
             logMessage = "CSV.INV_FLG_AUG:" + structCsv.geth_INV_FLG_AUG();
             emsg = new ExpjMessage( "ZZ01006", logMessage );
             sysLog.warning(emsg, getsysUSER_CD());
             bError = true;
           }
           // 棚卸実施フラグ9月
           if("1".equals(structCsv.geth_INV_FLG_SEP()) != true &&
              "0".equals(structCsv.geth_INV_FLG_SEP()) != true)
           {
             emsg = new ExpjMessage( "AH00046" );
             csvResultListAdd(emsg.getMessage(locale) , i , CSV_COLNO_INV_FLG_SEP);
             sysLog.warning(emsg, getsysUSER_CD());
             logMessage = "CSV.INV_FLG_SEP:" + structCsv.geth_INV_FLG_SEP();
             emsg = new ExpjMessage( "ZZ01006", logMessage );
             sysLog.warning(emsg, getsysUSER_CD());
             bError = true;
           }
           // 棚卸実施フラグ10月
           if("1".equals(structCsv.geth_INV_FLG_OCT()) != true &&
              "0".equals(structCsv.geth_INV_FLG_OCT()) != true)
           {
             emsg = new ExpjMessage( "AH00046" );
             csvResultListAdd(emsg.getMessage(locale) , i , CSV_COLNO_INV_FLG_OCT);
             sysLog.warning(emsg, getsysUSER_CD());
             logMessage = "CSV.INV_FLG_OCT:" + structCsv.geth_INV_FLG_OCT();
             emsg = new ExpjMessage( "ZZ01006", logMessage );
             sysLog.warning(emsg, getsysUSER_CD());
             bError = true;
           }
           // 棚卸実施フラグ11月
           if("1".equals(structCsv.geth_INV_FLG_NOV()) != true &&
              "0".equals(structCsv.geth_INV_FLG_NOV()) != true)
           {
             emsg = new ExpjMessage( "AH00046" );
             csvResultListAdd(emsg.getMessage(locale) , i , CSV_COLNO_INV_FLG_NOV);
             sysLog.warning(emsg, getsysUSER_CD());
             logMessage = "CSV.INV_FLG_NOV:" + structCsv.geth_INV_FLG_NOV();
             emsg = new ExpjMessage( "ZZ01006", logMessage );
             sysLog.warning(emsg, getsysUSER_CD());
             bError = true;
           }
           // 棚卸実施フラグ12月
           if("1".equals(structCsv.geth_INV_FLG_DEC()) != true &&
              "0".equals(structCsv.geth_INV_FLG_DEC()) != true)
           {
             emsg = new ExpjMessage( "AH00046" );
             csvResultListAdd(emsg.getMessage(locale) , i , CSV_COLNO_INV_FLG_DEC);
             sysLog.warning(emsg, getsysUSER_CD());
             logMessage = "CSV.INV_FLG_DEC:" + structCsv.geth_INV_FLG_DEC();
             emsg = new ExpjMessage( "ZZ01006", logMessage );
             sysLog.warning(emsg, getsysUSER_CD());
             bError = true;
           }
       
           // チェックエラーとなっていない場合、正常レコードとしてカウント
           if(bError != true)
           {
            intSuccessCount++;
           }
           ////////////////////////////////////////////////////////////////////////////////////
           // 個別チェック処理終了
           ////////////////////////////////////////////////////////////////////////////////////
       
          } // for()
       
          // チェック結果処理
          if(getCsvResultListSize() > 0)
          {
           bSuccess = false;
          }
       
          if(bSuccess != true)
          {
           // エラーデータ有りのため更新しなかった場合のメッセージ表示
           ExpjMessage emsg = new ExpjMessage( "AH00041",""+intSuccessCount,""+(intCsvDataCount - intSuccessCount));
           msgStruct.addError( emsg );
           sysLog.warning(emsg, getsysUSER_CD());
          }
       
         }catch(SQLException e){
          setSqlExceptionMsg(e);
         }
         return bSuccess;
        }
       
        /**
         * ＣＳＶデータＤＢ反映処理
         *
         * @param	listCsv	CSVデータリスト
         * @return	正常:true / エラー:false
         */
        private boolean csvData2Db(List listCsv) throws BusinessProcessException, FoundationException
        {
         // ログ出力情報格納用
         String logMessage = "";
         List listMessage = new ArrayList();
       
         boolean bSuccess = false;	// 処理成功フラグ初期化
         boolean bDBUpdate = false;	// DB更新中フラグ初期化
         int intCsvDataCount = 0;	// 対象データ件数
         List listRead;				// 作業用
       
         // 処理直前のstruct情報を退避
         AH0010020Struct structCopy = new AH0010020Struct();
         structCopy.copy(struct);
         try
         {
          // トランザクション開始
          conn.beginTransWeb();
       
          // DB更新中フラグON
          bDBUpdate = true;
       
          // 自工場コードを設定する
          struct.setPLANT_CD(getsysPLANT_CD());
       
          // 品目棚卸サイクルの自工場のデータ全削除
          entity.mT_INV_CYCLE.delete(conn, struct);
       
          // データ件数分処理を繰り返す
          intCsvDataCount = listCsv.size();
          for(int i = 0; i < intCsvDataCount; i++)
          {
           // CSV情報取得
           struct.copy((AH0010020Struct)listCsv.get(i));
       
           // 品目棚卸サイクルデータの存在チェック
           List cycle_list = entity.mT_INV_CYCLE.read(conn, struct);
           
           if(cycle_list.size() <= 0)
           {
        	   // 品目棚卸サイクル登録
               entity.mT_INV_CYCLE.create(conn, struct);
           } else{
        	   // 品目棚卸サイクル更新
        	   entity.mT_INV_CYCLE.update(conn, struct);
           }
           
          } // for()
       
          // コミット
          conn.commit();
       
          // DB更新中フラグOFF
          bDBUpdate = false;
       
          // 処理成功フラグ設定
          bSuccess = true;
       
         } catch(SQLException e) {
          logMessage = "T_INV_CYCLE.ITEM_CD:" +  struct.getw_ITEM_CD()
             + ", T_INV_CYCLE.PLANT_CD:" +  struct.getPLANT_CD();
          ExpjMessage emsg = new ExpjMessage( "ZZ01006", logMessage );
          sysLog.severe(emsg, getsysUSER_CD());
          setSqlExceptionMsg(e);
       
         } finally {
          // DB更新処理中に何らかのエラーが発生した場合はroolbackをおこなう
          if(bDBUpdate == true)
          {
           // ロールバック
           conn.rollback();
           logMessage = "Control：csvData2Db - rollback!! ";
           setSyslogConfig(logMessage);
       
           // 処理直前のstruct情報復帰
           struct.copy(structCopy);
       
           // 更新失敗のメッセージ表示
           ExpjMessage emsg = new ExpjMessage( "AH00042", ""+intCsvDataCount, "0");
           msgStruct.addError( emsg );
           sysLog.warning(emsg, getsysUSER_CD());
       
          }
       
          if(bSuccess == true)
          {
           // 正常終了のメッセージ表示
           ExpjMessage emsg = new ExpjMessage( "AH60005", ""+intCsvDataCount, "0");
           msgStruct.addInfo( emsg );
           sysLog.config(emsg, getsysUSER_CD());
          }
         }
         return bSuccess;
        }
       
       //------------------------------------------------------------------
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * 読込ボタン押下時に実行される処理です。
	 *
	 */
	public void controlselect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0010");
		logger.entering("AH0010020Control"+":USER="+struct.getsUser_ID(),"controlselect");
			//{{user_implement_dev:<controlselect>
                //------------------------------------------------------------------
                // ログ出力情報格納用
                String logMessage = "";
                List listMessage = new ArrayList();
              
                // 読込処理成功フラグ初期化
                boolean bSuccess = false;
              
                try {
                 // エラーフラグ初期化
                 boolean bError = false;
              
                 // 画面表示情報クリア
                 this.struct.init();
              
                 // 入力された品目番号が存在するかどうかのチェック
                 List item_list = entity.mM_ITEM.read(conn, struct);
                 if(item_list.size() <= 0)
                 {
                  listMessage.add("M_ITEM.ITEM_CD:" + struct.getw_ITEM_CD());
                  setErrorMessage("AH00002", listMessage);
                  listMessage.clear();
                  bError = true;	// エラーフラグ設定
                 }
                 else
                 {
                  AH0010020Struct read_struct = new AH0010020Struct();
                  
                  // 読込んだデータを取得
                  read_struct = (AH0010020Struct)item_list.get(0);
                  
                  // 品目名を設定
                  struct.setw_ITEM_NAME(read_struct.getw_ITEM_NAME());
                  
                  // 図面番号を設定
                  struct.setw_DRAW_CD(read_struct.getw_DRAW_CD());
                  
                  // 規格を設定
                  struct.setw_SPEC(read_struct.getw_SPEC());
                  
                  // 品目手配区分を設定
                  struct.setw_MRP_ODR_TYP(getMRP_ODR_TYP_name(read_struct.getw_MRP_ODR_TYP()));
                  
                  // 内外作区分を設定
                  struct.setw_OUTSIDE_TYP(getOUTSIDE_TYP_name(read_struct.getw_OUTSIDE_TYP()));
                  
                  // 棚卸区分を設定
                  struct.setw_ABC_TYP(getABC_TYP_name(read_struct.getw_ABC_TYP()));
                  
                  // 擬似品目は指定不可
                  if(("8").equals(read_struct.getw_MRP_ODR_TYP()) == true)
                  {
                   listMessage.add("M_ITEM.ITEM_CD:" + struct.getw_ITEM_CD());
                   setErrorMessage("AH00028", listMessage);
                   listMessage.clear();
                   bError = true;	// エラーフラグ設定
                  }
                  
                  // 棚卸区分=9(棚卸しない)は指定不可
                  if(("9").equals(read_struct.getw_ABC_TYP()) == true)
                  {
                   listMessage.add("M_ITEM.ITEM_CD:" + struct.getw_ITEM_CD());
                   setErrorMessage("AH00016", listMessage);
                   listMessage.clear();
                   bError = true;	// エラーフラグ設定
                  }
                 }
              
                 // エラーがない場合
                 if(bError != true)
                 {
                  // 自工場コードを設定する
                  struct.setPLANT_CD(getsysPLANT_CD());
                  
                  // 品目別棚卸サイクルよりデータを取得
                  List cycle_list = entity.mT_INV_CYCLE.read(conn, struct);
                  
                  if(cycle_list.size() <= 0)
                  {
                   // 対象データが存在しません
                   listMessage.add("T_INV_CYCLE.ITEM_CD:" + struct.getw_ITEM_CD());
                   listMessage.add("T_INV_CYCLE.PLANT_CD:" + struct.getPLANT_CD());
                   setErrorMessage("AH00015", listMessage);
                   listMessage.clear();
                  }
                  else
                  {
                   AH0010020Struct read_struct = new AH0010020Struct();
                   
                   // 読込んだデータを取得
                   read_struct = (AH0010020Struct)cycle_list.get(0);
                   
                   // 棚卸実施フラグ（１～１２月）を設定
                   struct.seth_INV_FLG_JAN(read_struct.geth_INV_FLG_JAN());
                   struct.seth_INV_FLG_FEB(read_struct.geth_INV_FLG_FEB());
                   struct.seth_INV_FLG_MAR(read_struct.geth_INV_FLG_MAR());
                   struct.seth_INV_FLG_APR(read_struct.geth_INV_FLG_APR());
                   struct.seth_INV_FLG_MAY(read_struct.geth_INV_FLG_MAY());
                   struct.seth_INV_FLG_JUN(read_struct.geth_INV_FLG_JUN());
                   struct.seth_INV_FLG_JUL(read_struct.geth_INV_FLG_JUL());
                   struct.seth_INV_FLG_AUG(read_struct.geth_INV_FLG_AUG());
                   struct.seth_INV_FLG_SEP(read_struct.geth_INV_FLG_SEP());
                   struct.seth_INV_FLG_OCT(read_struct.geth_INV_FLG_OCT());
                   struct.seth_INV_FLG_NOV(read_struct.geth_INV_FLG_NOV());
                   struct.seth_INV_FLG_DEC(read_struct.geth_INV_FLG_DEC());
                   
                   // 更新チェックの設定
                   struct.setMODIFY_COUNT(read_struct.getMODIFY_COUNT());
                   
                   // 読込処理成功フラグ設定
                   bSuccess = true;
                  }
                 }
              
                } catch(SQLException e) {
                 setSqlExceptionMsg(e);
              
                } catch(Exception e){
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006" , "ProcessId:" + this.sp.getProcId() );
                 ee.add(emsg);
                 throw ee;
              
                } finally {
                 if(bSuccess == true)
                 {
                  setReadStatus(NORMAL);
              
                  // 読込成功時のキー情報を退避
                  struct.seth_saveITEM_CD(struct.getw_ITEM_CD());
                 }
                 else
                 {
                  setReadStatus(INITIAL);
                 }
                }
                //------------------------------------------------------------------
                //}}user_implement_dev:<controlselect>
		logger.exiting("AH0010020Control"+":USER="+struct.getsUser_ID(),"controlselect");

		return;
	}

	/**
	 * 更新ボタン押下時に実行される処理です。
	 *
	 */
	public void controlupdate() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0010");
		logger.entering("AH0010020Control"+":USER="+struct.getsUser_ID(),"controlupdate");
			//{{user_implement_dev:<controlupdate>
                //------------------------------------------------------------------
                // ログ出力情報格納用
                String logMessage = "";
                List listMessage = new ArrayList();
              
                // DB更新中フラグ初期化
                boolean bDBUpdate = false;
              
                try {
                 // エラーフラグ初期化
                 boolean bError = false;
              
                 // 画面表示情報クリア
                 struct.setw_ITEM_NAME("");
                 struct.setw_DRAW_CD("");
                 struct.setw_SPEC("");
                 struct.setw_MRP_ODR_TYP("");
                 struct.setw_OUTSIDE_TYP("");
                 struct.setw_ABC_TYP("");
              
                 // 入力された品目番号が存在するかどうかのチェック
                 List item_list = entity.mM_ITEM.read(conn, struct);
                 if(item_list.size() <= 0)
                 {
                  listMessage.add("M_ITEM.ITEM_CD:" + struct.getw_ITEM_CD());
                  setErrorMessage("AH00002", listMessage);
                  listMessage.clear();
                  bError = true;	// エラーフラグ設定
                 }
                 else
                 {
                  AH0010020Struct read_struct = new AH0010020Struct();
                  
                  // 読込んだデータを取得
                  read_struct = (AH0010020Struct)item_list.get(0);
                  
                  // 品目名を設定
                  struct.setw_ITEM_NAME(read_struct.getw_ITEM_NAME());
                  
                  // 図面番号を設定
                  struct.setw_DRAW_CD(read_struct.getw_DRAW_CD());
                  
                  // 規格を設定
                  struct.setw_SPEC(read_struct.getw_SPEC());
                  
                  // 品目手配区分を設定
                  struct.setw_MRP_ODR_TYP(getMRP_ODR_TYP_name(read_struct.getw_MRP_ODR_TYP()));
                  
                  // 内外作区分を設定
                  struct.setw_OUTSIDE_TYP(getOUTSIDE_TYP_name(read_struct.getw_OUTSIDE_TYP()));
                  
                  // 棚卸区分を設定
                  struct.setw_ABC_TYP(getABC_TYP_name(read_struct.getw_ABC_TYP()));
                  
                  // 擬似品目は指定不可
                  if(("8").equals(read_struct.getw_MRP_ODR_TYP()) == true)
                  {
                   listMessage.add("M_ITEM.ITEM_CD:" + struct.getw_ITEM_CD());
                   setErrorMessage("AH00028", listMessage);
                   listMessage.clear();
                   bError = true;	// エラーフラグ設定
                  }
                  
                  // 棚卸区分=9(棚卸しない)は指定不可
                  if(("9").equals(read_struct.getw_ABC_TYP()) == true)
                  {
                   listMessage.add("M_ITEM.ITEM_CD:" + struct.getw_ITEM_CD());
                   setErrorMessage("AH00016", listMessage);
                   listMessage.clear();
                   bError = true;	// エラーフラグ設定
                  }
                 }
              
                 // エラーがない場合
                 if(bError != true)
                 {
                  // トランザクション開始
                  conn.beginTransWeb();
              
                  // DB更新中フラグON
                  bDBUpdate = true;
                  
                  // 自工場コードを設定する
                  struct.setPLANT_CD(getsysPLANT_CD());
                  
                  // 更新チェックの確認
                  List m_list = entity.mT_INV_CYCLE4Update.read(conn, struct);
                  if(m_list.size() <= 0){
                   // 指定キーのデータが存在しません
                   listMessage.add("T_INV_CYCLE.ITEM_CD:" + struct.getw_ITEM_CD());
                   listMessage.add("T_INV_CYCLE.PLANT_CD:" + struct.getPLANT_CD());
                   setErrorMessage("ZZ01101", listMessage);
                   listMessage.clear();
                   bError = true;	// エラーフラグ設定
                  }
                  else{
                   String modify = ((AH0010020Struct)m_list.get(0)).getMODIFY_COUNT();
              
                   if (struct.getMODIFY_COUNT().equals(modify) == false)
                   {
                    // 更新回数が読込時と違うため更新できません
                    listMessage.add("T_INV_CYCLE.ITEM_CD:" + struct.getw_ITEM_CD());
                    listMessage.add("T_INV_CYCLE.PLANT_CD:" + struct.getPLANT_CD());
                    setErrorMessage("ZZ01105", listMessage);
                    listMessage.clear();
                    bError = true;	// エラーフラグ設定
                   }
                  }
                 }
                 
                 // エラーが発生していない場合、更新処理実施
                 if(bError != true)
                 {
                  // 更新
                  entity.mT_INV_CYCLE.update(conn, struct);
                  
                  // コミット
                  conn.commit();
              
                  // DB更新中フラグOFF
                  bDBUpdate = false;
                  
                  // 再読込処理
                  controlselect();
                 }
                 
                } catch(SQLException e) {
                 logMessage = "T_INV_CYCLE.ITEM_CD:" +  struct.getw_ITEM_CD()
                    + ", T_INV_CYCLE.PLANT_CD:" +  struct.getPLANT_CD();
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", logMessage );
                 sysLog.severe(emsg, getsysUSER_CD());
                 setSqlExceptionMsg(e);
              
                } catch(Exception e){
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006" , "ProcessId:" + this.sp.getProcId() );
                 ee.add(emsg);
                 throw ee;
              
                } finally{
                 // DB更新処理中に何らかのエラーが発生した場合はroolbackをおこなう
                 if(bDBUpdate == true)
                 {
                  // ロールバック
                  conn.rollback();
                  logMessage = "Control：controlupdate - rollback!! ";
                  setSyslogConfig(logMessage);
              
                  // DB更新中フラグOFF
                  bDBUpdate = false;
                 }
                }
                //---------------------------------------------------------------------
                //}}user_implement_dev:<controlupdate>
		logger.exiting("AH0010020Control"+":USER="+struct.getsUser_ID(),"controlupdate");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlclear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0010");
		logger.entering("AH0010020Control"+":USER="+struct.getsUser_ID(),"controlclear");
			//{{user_implement_dev:<controlclear>
                //------------------------------------------------------------------
                // クリア処理
                this.struct.clear();
                this.struct.init();
              
                // 表示リストをクリア
                list.clear();
              
                setReadStatus(INITIAL);
              
                //------------------------------------------------------------------
                //}}user_implement_dev:<controlclear>
		logger.exiting("AH0010020Control"+":USER="+struct.getsUser_ID(),"controlclear");

		return;
	}

	/**
	 * CSV取込ボタン押下時に実行される処理です。
	 *
	 */
	public void controlCsvImport() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0010");
		logger.entering("AH0010020Control"+":USER="+struct.getsUser_ID(),"controlCsvImport");
			//{{user_implement_dev:<controlCsvImport>
                //---------------------------------------------------------------------
                // リストクリア
                list.clear();
              
                // 親画面のstructを退避
                saveParentStruct();
              
                // サブ1画面初期化
                struct.clear();
              
                // サブ1画面エラーリストクリア
                csvResultListClear();
                //---------------------------------------------------------------------
                //}}user_implement_dev:<controlCsvImport>
		logger.exiting("AH0010020Control"+":USER="+struct.getsUser_ID(),"controlCsvImport");

		return;
	}

	/**
	 * 戻るボタン押下時に実行される処理です。
	 *
	 */
	public void controlreturn_sub1() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0010");
		logger.entering("AH0010020Control"+":USER="+struct.getsUser_ID(),"controlreturn_sub1");
			//{{user_implement_dev:<controlreturn_sub1>
                //---------------------------------------------------------------------
                // 子画面に遷移する前の親画面のstructを復帰
                loadParentStruct();
              
                // クリア処理
                controlclear();
                //---------------------------------------------------------------------
                //}}user_implement_dev:<controlreturn_sub1>
		logger.exiting("AH0010020Control"+":USER="+struct.getsUser_ID(),"controlreturn_sub1");

		return;
	}

	/**
	 * 参照ボタン押下時に実行される処理です。
	 *
	 */
	public void controlBrowse() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0010");
		logger.entering("AH0010020Control"+":USER="+struct.getsUser_ID(),"controlBrowse");
			//{{user_implement_dev:<controlBrowse>
                //}}user_implement_dev:<controlBrowse>
		logger.exiting("AH0010020Control"+":USER="+struct.getsUser_ID(),"controlBrowse");

		return;
	}

	/**
	 * 取込ボタン押下時に実行される処理です。
	 *
	 */
	public void controlCsvIn() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0010");
		logger.entering("AH0010020Control"+":USER="+struct.getsUser_ID(),"controlCsvIn");
			//{{user_implement_dev:<controlCsvIn>
                //---------------------------------------------------------------------
                // エラーフラグ初期化
                boolean bError = false;
                // 画面表示用エラーリストクリア
                csvResultListClear();
              
                // ＣＳＶデータ取得
                List listCsv = readCsvData();
                if(listCsv == null)
                {
                 bError = true;
                }
              
                // ＣＳＶデータ取得成功
                if(bError != true)
                {
                 // ＣＳＶデータ内容チェック
                 if(checkCsvData(listCsv) != true)
                 {
                  bError = true;
                 }
                }
              
                // ＣＳＶデータ内容に異常なし
                if(bError != true)
                {
                 // ＣＳＶデータ反映
                 csvData2Db(listCsv);
                }
              
                if(getMessage().sizeError() <= 0)
                {
                 // クリア処理
                 controlclear();
                }
                else {
                 // リストにエラー内容セット
                 setList(_listResultMessageCsv);
                }
                //---------------------------------------------------------------------
                //}}user_implement_dev:<controlCsvIn>
		logger.exiting("AH0010020Control"+":USER="+struct.getsUser_ID(),"controlCsvIn");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0010");
		logger.entering("AH0010020Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AH0010020Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0010");
		logger.entering("AH0010020Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
                //------------------------------------------------------------------
                try{
                 // コンボボックスデータ用意
                 ComboBox controller = new ComboBox(conn, sysUSER_CD);
              
                 //棚卸区分
                 _ABC_TYP = controller.getData("ABC_TYP");
                 //品目手配区分
                 _MRP_ODR_TYP  = controller.getData("MRP_ODR_TYP");
                 //内外作成区分
                 _OUTSIDE_TYP = controller.getData("OUTSIDE_TYP");
              
                 // クリア
                 controlclear();
              
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
		logger.exiting("AH0010020Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * イベントハンドラの前処理です。
	 *
	 * @param buttun ボタン名
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0010");
		logger.entering("AH0010020Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
                 // コンボボックス部品のデータのセットはここに記述してください。
                 // コンボボックスデータ用意
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("AH0010020Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("update") ) {
				controlupdate();
			} else if( button.equals("clear") ) {
				controlclear();
			} else if( button.equals("CsvImport") ) {
				controlCsvImport();
			} else if( button.equals("return_sub1") ) {
				controlreturn_sub1();
			} else if( button.equals("Browse") ) {
				controlBrowse();
			} else if( button.equals("CsvIn") ) {
				controlCsvIn();
			} else if( button.equals("initial") ) {
				controlINITIAL();
			} else if( button.equals("reload") ) {
				controlRELOAD();
			}
		//{{user_implement_dev:<control_eventHandller>
                //}}user_implement_dev:<control_eventHandller>
		} catch( BusinessLockException ble ) {
			// 枠メッセージ出力依頼作成
			setNewDataFlg(false);
		} catch( ResourceBusyException rbe ) {
			ExpjException ee = new ExpjException(rbe, "ZZ01105");
			throw ee;
		} catch( FoundationException e ) {
//			e.printStackTrace();
//			throw new FoundationException("AH0010020Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AH0010020-E999","CSVの出力処理"));
			throw new FoundationException("AH0010020Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AH0010020-E999","システム日付の取得処理"));
				throw new FoundationException("AH0010020Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AH0010020-E999","コントロールのイベント処理"));
			throw new FoundationException("AH0010020Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected AH0010020Entity entity;
	protected AH0010020Struct struct;
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

		entity = new AH0010020Entity();
		struct = new AH0010020Struct();

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
	 * AH0010020クラスの標準コンストラクタ
	 */
	public AH0010020Control() throws BusinessProcessException, FoundationException
	{
		initialize();

		//conn = connect();
		//{{user_implement_code_constractor
                //---------------------------------------------------------------------
                list = new ArrayList(0);
                //---------------------------------------------------------------------
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
				AH0010020Struct key = (AH0010020Struct)keyList.get(j);
				// メッセージキーを作成する
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("h_INV_FLG_JAN") && key.geth_INV_FLG_JAN() != null) {
					msgKey.setKeyValue("h_INV_FLG_JAN", key.geth_INV_FLG_JAN());
				}
				if(msgKeyType.containsKeyColumn("h_INV_FLG_FEB") && key.geth_INV_FLG_FEB() != null) {
					msgKey.setKeyValue("h_INV_FLG_FEB", key.geth_INV_FLG_FEB());
				}
				if(msgKeyType.containsKeyColumn("h_INV_FLG_MAR") && key.geth_INV_FLG_MAR() != null) {
					msgKey.setKeyValue("h_INV_FLG_MAR", key.geth_INV_FLG_MAR());
				}
				if(msgKeyType.containsKeyColumn("h_INV_FLG_APR") && key.geth_INV_FLG_APR() != null) {
					msgKey.setKeyValue("h_INV_FLG_APR", key.geth_INV_FLG_APR());
				}
				if(msgKeyType.containsKeyColumn("h_INV_FLG_MAY") && key.geth_INV_FLG_MAY() != null) {
					msgKey.setKeyValue("h_INV_FLG_MAY", key.geth_INV_FLG_MAY());
				}
				if(msgKeyType.containsKeyColumn("h_INV_FLG_JUN") && key.geth_INV_FLG_JUN() != null) {
					msgKey.setKeyValue("h_INV_FLG_JUN", key.geth_INV_FLG_JUN());
				}
				if(msgKeyType.containsKeyColumn("h_INV_FLG_JUL") && key.geth_INV_FLG_JUL() != null) {
					msgKey.setKeyValue("h_INV_FLG_JUL", key.geth_INV_FLG_JUL());
				}
				if(msgKeyType.containsKeyColumn("h_INV_FLG_AUG") && key.geth_INV_FLG_AUG() != null) {
					msgKey.setKeyValue("h_INV_FLG_AUG", key.geth_INV_FLG_AUG());
				}
				if(msgKeyType.containsKeyColumn("h_INV_FLG_SEP") && key.geth_INV_FLG_SEP() != null) {
					msgKey.setKeyValue("h_INV_FLG_SEP", key.geth_INV_FLG_SEP());
				}
				if(msgKeyType.containsKeyColumn("h_INV_FLG_OCT") && key.geth_INV_FLG_OCT() != null) {
					msgKey.setKeyValue("h_INV_FLG_OCT", key.geth_INV_FLG_OCT());
				}
				if(msgKeyType.containsKeyColumn("h_INV_FLG_NOV") && key.geth_INV_FLG_NOV() != null) {
					msgKey.setKeyValue("h_INV_FLG_NOV", key.geth_INV_FLG_NOV());
				}
				if(msgKeyType.containsKeyColumn("h_INV_FLG_DEC") && key.geth_INV_FLG_DEC() != null) {
					msgKey.setKeyValue("h_INV_FLG_DEC", key.geth_INV_FLG_DEC());
				}
				if(msgKeyType.containsKeyColumn("MODIFY_COUNT") && key.getMODIFY_COUNT() != null) {
					msgKey.setKeyValue("MODIFY_COUNT", key.getMODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("w_ITEM_CD") && key.getw_ITEM_CD() != null) {
					msgKey.setKeyValue("w_ITEM_CD", key.getw_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("w_ITEM_NAME") && key.getw_ITEM_NAME() != null) {
					msgKey.setKeyValue("w_ITEM_NAME", key.getw_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("w_DRAW_CD") && key.getw_DRAW_CD() != null) {
					msgKey.setKeyValue("w_DRAW_CD", key.getw_DRAW_CD());
				}
				if(msgKeyType.containsKeyColumn("w_SPEC") && key.getw_SPEC() != null) {
					msgKey.setKeyValue("w_SPEC", key.getw_SPEC());
				}
				if(msgKeyType.containsKeyColumn("w_MRP_ODR_TYP") && key.getw_MRP_ODR_TYP() != null) {
					msgKey.setKeyValue("w_MRP_ODR_TYP", key.getw_MRP_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("w_OUTSIDE_TYP") && key.getw_OUTSIDE_TYP() != null) {
					msgKey.setKeyValue("w_OUTSIDE_TYP", key.getw_OUTSIDE_TYP());
				}
				if(msgKeyType.containsKeyColumn("w_ABC_TYP") && key.getw_ABC_TYP() != null) {
					msgKey.setKeyValue("w_ABC_TYP", key.getw_ABC_TYP());
				}
				if(msgKeyType.containsKeyColumn("ERR_ADR") && key.getERR_ADR() != null) {
					msgKey.setKeyValue("ERR_ADR", key.getERR_ADR());
				}
				if(msgKeyType.containsKeyColumn("ERR_MSG") && key.getERR_MSG() != null) {
					msgKey.setKeyValue("ERR_MSG", key.getERR_MSG());
				}
				if(msgKeyType.containsKeyColumn("c_INV_FLG_JAN") && key.getc_INV_FLG_JAN() != null) {
					msgKey.setKeyValue("c_INV_FLG_JAN", key.getc_INV_FLG_JAN());
				}
				if(msgKeyType.containsKeyColumn("c_INV_FLG_FEB") && key.getc_INV_FLG_FEB() != null) {
					msgKey.setKeyValue("c_INV_FLG_FEB", key.getc_INV_FLG_FEB());
				}
				if(msgKeyType.containsKeyColumn("c_INV_FLG_MAR") && key.getc_INV_FLG_MAR() != null) {
					msgKey.setKeyValue("c_INV_FLG_MAR", key.getc_INV_FLG_MAR());
				}
				if(msgKeyType.containsKeyColumn("c_INV_FLG_APR") && key.getc_INV_FLG_APR() != null) {
					msgKey.setKeyValue("c_INV_FLG_APR", key.getc_INV_FLG_APR());
				}
				if(msgKeyType.containsKeyColumn("c_INV_FLG_MAY") && key.getc_INV_FLG_MAY() != null) {
					msgKey.setKeyValue("c_INV_FLG_MAY", key.getc_INV_FLG_MAY());
				}
				if(msgKeyType.containsKeyColumn("c_INV_FLG_JUN") && key.getc_INV_FLG_JUN() != null) {
					msgKey.setKeyValue("c_INV_FLG_JUN", key.getc_INV_FLG_JUN());
				}
				if(msgKeyType.containsKeyColumn("c_INV_FLG_JUL") && key.getc_INV_FLG_JUL() != null) {
					msgKey.setKeyValue("c_INV_FLG_JUL", key.getc_INV_FLG_JUL());
				}
				if(msgKeyType.containsKeyColumn("c_INV_FLG_AUG") && key.getc_INV_FLG_AUG() != null) {
					msgKey.setKeyValue("c_INV_FLG_AUG", key.getc_INV_FLG_AUG());
				}
				if(msgKeyType.containsKeyColumn("c_INV_FLG_SEP") && key.getc_INV_FLG_SEP() != null) {
					msgKey.setKeyValue("c_INV_FLG_SEP", key.getc_INV_FLG_SEP());
				}
				if(msgKeyType.containsKeyColumn("c_INV_FLG_OCT") && key.getc_INV_FLG_OCT() != null) {
					msgKey.setKeyValue("c_INV_FLG_OCT", key.getc_INV_FLG_OCT());
				}
				if(msgKeyType.containsKeyColumn("c_INV_FLG_NOV") && key.getc_INV_FLG_NOV() != null) {
					msgKey.setKeyValue("c_INV_FLG_NOV", key.getc_INV_FLG_NOV());
				}
				if(msgKeyType.containsKeyColumn("c_INV_FLG_DEC") && key.getc_INV_FLG_DEC() != null) {
					msgKey.setKeyValue("c_INV_FLG_DEC", key.getc_INV_FLG_DEC());
				}
				if(msgKeyType.containsKeyColumn("h_saveITEM_CD") && key.geth_saveITEM_CD() != null) {
					msgKey.setKeyValue("h_saveITEM_CD", key.geth_saveITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("FileName") && key.getFileName() != null) {
					msgKey.setKeyValue("FileName", key.getFileName());
				}
				if(msgKeyType.containsKeyColumn("w_COLUMN_FLG") && key.getw_COLUMN_FLG() != null) {
					msgKey.setKeyValue("w_COLUMN_FLG", key.getw_COLUMN_FLG());
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
					AH0010020Struct key = new AH0010020Struct();
					if(msgKeyType.containsKeyColumn("h_INV_FLG_JAN")) {
						key.seth_INV_FLG_JAN(msgKey.getKeyValue("h_INV_FLG_JAN"));
					}
					if(msgKeyType.containsKeyColumn("h_INV_FLG_FEB")) {
						key.seth_INV_FLG_FEB(msgKey.getKeyValue("h_INV_FLG_FEB"));
					}
					if(msgKeyType.containsKeyColumn("h_INV_FLG_MAR")) {
						key.seth_INV_FLG_MAR(msgKey.getKeyValue("h_INV_FLG_MAR"));
					}
					if(msgKeyType.containsKeyColumn("h_INV_FLG_APR")) {
						key.seth_INV_FLG_APR(msgKey.getKeyValue("h_INV_FLG_APR"));
					}
					if(msgKeyType.containsKeyColumn("h_INV_FLG_MAY")) {
						key.seth_INV_FLG_MAY(msgKey.getKeyValue("h_INV_FLG_MAY"));
					}
					if(msgKeyType.containsKeyColumn("h_INV_FLG_JUN")) {
						key.seth_INV_FLG_JUN(msgKey.getKeyValue("h_INV_FLG_JUN"));
					}
					if(msgKeyType.containsKeyColumn("h_INV_FLG_JUL")) {
						key.seth_INV_FLG_JUL(msgKey.getKeyValue("h_INV_FLG_JUL"));
					}
					if(msgKeyType.containsKeyColumn("h_INV_FLG_AUG")) {
						key.seth_INV_FLG_AUG(msgKey.getKeyValue("h_INV_FLG_AUG"));
					}
					if(msgKeyType.containsKeyColumn("h_INV_FLG_SEP")) {
						key.seth_INV_FLG_SEP(msgKey.getKeyValue("h_INV_FLG_SEP"));
					}
					if(msgKeyType.containsKeyColumn("h_INV_FLG_OCT")) {
						key.seth_INV_FLG_OCT(msgKey.getKeyValue("h_INV_FLG_OCT"));
					}
					if(msgKeyType.containsKeyColumn("h_INV_FLG_NOV")) {
						key.seth_INV_FLG_NOV(msgKey.getKeyValue("h_INV_FLG_NOV"));
					}
					if(msgKeyType.containsKeyColumn("h_INV_FLG_DEC")) {
						key.seth_INV_FLG_DEC(msgKey.getKeyValue("h_INV_FLG_DEC"));
					}
					if(msgKeyType.containsKeyColumn("MODIFY_COUNT")) {
						key.setMODIFY_COUNT(msgKey.getKeyValue("MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("w_ITEM_CD")) {
						key.setw_ITEM_CD(msgKey.getKeyValue("w_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_ITEM_NAME")) {
						key.setw_ITEM_NAME(msgKey.getKeyValue("w_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("w_DRAW_CD")) {
						key.setw_DRAW_CD(msgKey.getKeyValue("w_DRAW_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_SPEC")) {
						key.setw_SPEC(msgKey.getKeyValue("w_SPEC"));
					}
					if(msgKeyType.containsKeyColumn("w_MRP_ODR_TYP")) {
						key.setw_MRP_ODR_TYP(msgKey.getKeyValue("w_MRP_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("w_OUTSIDE_TYP")) {
						key.setw_OUTSIDE_TYP(msgKey.getKeyValue("w_OUTSIDE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("w_ABC_TYP")) {
						key.setw_ABC_TYP(msgKey.getKeyValue("w_ABC_TYP"));
					}
					if(msgKeyType.containsKeyColumn("ERR_ADR")) {
						key.setERR_ADR(msgKey.getKeyValue("ERR_ADR"));
					}
					if(msgKeyType.containsKeyColumn("ERR_MSG")) {
						key.setERR_MSG(msgKey.getKeyValue("ERR_MSG"));
					}
					if(msgKeyType.containsKeyColumn("c_INV_FLG_JAN")) {
						key.setc_INV_FLG_JAN(msgKey.getKeyValue("c_INV_FLG_JAN"));
					}
					if(msgKeyType.containsKeyColumn("c_INV_FLG_FEB")) {
						key.setc_INV_FLG_FEB(msgKey.getKeyValue("c_INV_FLG_FEB"));
					}
					if(msgKeyType.containsKeyColumn("c_INV_FLG_MAR")) {
						key.setc_INV_FLG_MAR(msgKey.getKeyValue("c_INV_FLG_MAR"));
					}
					if(msgKeyType.containsKeyColumn("c_INV_FLG_APR")) {
						key.setc_INV_FLG_APR(msgKey.getKeyValue("c_INV_FLG_APR"));
					}
					if(msgKeyType.containsKeyColumn("c_INV_FLG_MAY")) {
						key.setc_INV_FLG_MAY(msgKey.getKeyValue("c_INV_FLG_MAY"));
					}
					if(msgKeyType.containsKeyColumn("c_INV_FLG_JUN")) {
						key.setc_INV_FLG_JUN(msgKey.getKeyValue("c_INV_FLG_JUN"));
					}
					if(msgKeyType.containsKeyColumn("c_INV_FLG_JUL")) {
						key.setc_INV_FLG_JUL(msgKey.getKeyValue("c_INV_FLG_JUL"));
					}
					if(msgKeyType.containsKeyColumn("c_INV_FLG_AUG")) {
						key.setc_INV_FLG_AUG(msgKey.getKeyValue("c_INV_FLG_AUG"));
					}
					if(msgKeyType.containsKeyColumn("c_INV_FLG_SEP")) {
						key.setc_INV_FLG_SEP(msgKey.getKeyValue("c_INV_FLG_SEP"));
					}
					if(msgKeyType.containsKeyColumn("c_INV_FLG_OCT")) {
						key.setc_INV_FLG_OCT(msgKey.getKeyValue("c_INV_FLG_OCT"));
					}
					if(msgKeyType.containsKeyColumn("c_INV_FLG_NOV")) {
						key.setc_INV_FLG_NOV(msgKey.getKeyValue("c_INV_FLG_NOV"));
					}
					if(msgKeyType.containsKeyColumn("c_INV_FLG_DEC")) {
						key.setc_INV_FLG_DEC(msgKey.getKeyValue("c_INV_FLG_DEC"));
					}
					if(msgKeyType.containsKeyColumn("h_saveITEM_CD")) {
						key.seth_saveITEM_CD(msgKey.getKeyValue("h_saveITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("FileName")) {
						key.setFileName(msgKey.getKeyValue("FileName"));
					}
					if(msgKeyType.containsKeyColumn("w_COLUMN_FLG")) {
						key.setw_COLUMN_FLG(msgKey.getKeyValue("w_COLUMN_FLG"));
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
