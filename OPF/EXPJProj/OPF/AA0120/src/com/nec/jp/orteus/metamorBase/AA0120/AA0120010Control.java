/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AA0120/src/com/nec/jp/orteus/metamorBase/AA0120/AA0120010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AA0120;

import com.nec.jp.orteus.metamorBase.AA0120.*;
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
import com.nec.jp.orteus.metamorBase.common04.sysdata.DateCtrlControl;
import com.nec.jp.orteus.metamorBase.common04.sysdata.DateCtrlStruct;
import com.nec.jp.orteus.metamorBase.common04.util.DataNotFoundException;
import com.nec.jp.orteus.expj.mstappr.MstAppr;
import com.nec.jp.orteus.expj.mstappr.MstApprDetailStruct;
import com.nec.jp.orteus.expj.mstappr.MstApprKeyStruct;
import com.nec.jp.orteus.expj.mstappr.MstApprStruct;
import com.nec.jp.orteus.expj.mstappr.MstColumns;
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AA0120010Control
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
        public AA0120010Struct getListvalue(int x) { return (AA0120010Struct)(this.list.get(x)); }	// リストの値を返します。
        public AA0120010Struct getStruct() { return this.struct; }	// Structを返します。
        public AA0120010Struct createStruct() { return new AA0120010Struct(); }	// 新しいStructを作って返します。
        public void setStruct(Object structname) { this.struct.setStruct((AA0120010Struct)structname); }	// Structをセットします。
        public void initializeStruct() { this.struct.initialize(); }	// Structの値を初期化します。
       
        // CSV出力用リスト
        private CsvWriter csvWriter = null;
        public CsvWriter getCsvWriter(){ return this.csvWriter; }
       
        private CsvReader csvReader = null;
        public void setCsvReader(CsvReader cr){ this.csvReader = cr; }
        /** ブラウザに表示するJSPのURL */
        public String _nextUrl = null;
       
        private String businessOprDate;
        // シスタム設定値取得 ---------------	
    	private PrivateConfig privateConfig;
    	public AA0120010Struct _keyStruct = new AA0120010Struct();
    	// 為替レート承認フラグ
    	private String _APR_EXCH_RATE = null;
        /**
         * 業務ロジックのインフォメーションメッセージ設定処理を切り出して関数化
         * @param code メッセージコード
         */
        private void setInformationMessage(String code) {
         ExpjMessage emsg = new ExpjMessage(code);
         msgStruct.addInfo(emsg);
        }
        /**
         * 業務ロジックのワーニングメッセージ設定処理を切り出して関数化
         * @param code メッセージコード
         */
        private void setWarningMessage(String code) {
         ExpjMessage emsg = new ExpjMessage(code);
         msgStruct.addWarn(emsg);
         sysLog.info(emsg, sysUSER_CD);
        }
        /**
         * 業務ロジックのワーニングメッセージ設定処理を切り出して関数化
         * @param code メッセージコード
         * @param value1 置換文字列１
         */
        private void setWarningMessage(String code, String value1) {
         ExpjMessage emsg = new ExpjMessage(code, value1);
         msgStruct.addWarn(emsg);
         sysLog.info(emsg, sysUSER_CD);
        }
        /**
         * 業務ロジックのエラーメッセージ設定処理を切り出して関数化
         * @param code メッセージコード
         */
        private void setErrorMessage(String code) {
         ExpjMessage emsg = new ExpjMessage(code);
         msgStruct.addError(emsg);
         sysLog.warning(emsg, sysUSER_CD);
        }
        /**
         * 業務ロジックのエラーメッセージ設定処理を切り出して関数化
         * @param code メッセージコード
         * @param value1 置換文字列１
         */
        private void setErrorMessage(String code, String value1) {
         ExpjMessage emsg = new ExpjMessage(code, value1);
         msgStruct.addError(emsg);
         sysLog.warning(emsg, sysUSER_CD);
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
         param.append(".");
         param.append(columnName);
         param.append(":");
         if (value != null) {
          param.append(value);
         }
       
         ExpjMessage emsg = new ExpjMessage("ZZ01006", param.toString());
         msgStruct.addError(emsg);
         sysLog.warning(emsg, sysUSER_CD);
        }
       
       
        /**
         * ブラウザに表示するJSPのURLを設定します。
         * @param url 次画面JSPのURL
         */
        public void setNextUrl(String url) {
         _nextUrl = url;
        }
        /**
         * ブラウザに表示するJSPのURLを取得します。
         */
        public String getNextUrl() {
         return _nextUrl;
        }
       
        /**
         * メイン画面表示に必要なStruct情報を設定します。
         * @param s 画面情報を持つStruct
         */
        public void setStruct(AA0120010Struct s) {
         struct.setCUR_CD(s.getCUR_CD());
         struct.setCUR_NAME(s.getCUR_NAME());
       
         struct.setCUR_UNIT(s.getCUR_UNIT());
         struct.setCUR_SYMBOL(s.getCUR_SYMBOL());
         struct.setDECIMAL_FIG(s.getDECIMAL_FIG());
        }
       
        /**
         * サブ画面表示に必要なStruct情報を設定します。
         * @param s 画面情報を持つStruct
         */
        public void setStructForSub1(AA0120010Struct s) {
         // URLの設定
         _nextUrl = "/AA0120011.jsp";
       
         struct.setCUR_NAME(s.getCUR_NAME());
         struct.setEXCH_TYP(s.getEXCH_TYP());
         struct.setEXCH_RESERVE_CD(s.getEXCH_RESERVE_CD());
         struct.setEXCH_START_DATE(s.getEXCH_START_DATE());
         struct.setEXCH_RATE(s.getEXCH_RATE());
         struct.setMODIFY_COUNT(s.getMODIFY_COUNT());
        }
       
        /**
         * サブ画面表示に必要な初期のStruct情報を設定します。
         * @param s 画面情報を持つStruct
         */
        public void setDefaultStructForSub1(AA0120010Struct s) {
         // URLの設定
         _nextUrl = "/AA0120011.jsp";
       
         struct.setCUR_NAME(s.getCUR_NAME());
         struct.setEXCH_TYP("1");
         struct.setEXCH_RESERVE_CD(null);
         struct.setEXCH_START_DATE(businessOprDate);
         struct.setEXCH_RATE("0.00");
         struct.setMODIFY_COUNT(null);
        }
       
        /**
         * 画面の全項目を初期化します。
         */
        public void initializeAll() {
         struct.setCUR_CD(null);
         struct.setEXCH_RESERVE_CD_K(null);
         struct.setEXCH_START_DATE_K(null);
         struct.setEXCH_END_DATE_K(null);

         initializeDetail();
        }
       
        /**
         * 画面の詳細項目を初期化します。
         */
        public void initializeDetail() {
         struct.setCUR_NAME(null);
         struct.setCUR_UNIT(null);
         struct.setCUR_SYMBOL(null);
         struct.setDECIMAL_FIG("0");
         
         struct.setl_EXCH_TYP_DN(null);
         struct.setl_EXCH_TYP(null);
         struct.setl_EXCH_RESERVE_CD(null);
         struct.setl_EXCH_START_DATE(null);
         struct.setl_EXCH_RATE(null);
         list = null;
       
         readStatus = INITIAL;
        }
       
        /**
         * クライアント上のマスク項目の値をクリアします。
         */
        private void clearDisabledField() {
         if (!struct.getEXCH_TYP().equals("2")) {
          struct.setEXCH_RESERVE_CD(null);
         }
         
        }
        /** コンボボックスデータ取得用定数　為替種別 */
        private final static String EXCH_TYP_PARAMETER_NAME= "EXCH_TYP"; 
       
        /** コンボボックスデータ取得用　為替種別 */
        private ComboStruct EXCH_TYP = null;
        
        private void othercomboTyp(AA0120010Struct aStruct) {
  
		 aStruct.setl_EXCH_TYP_DN(getDisplayName(EXCH_TYP, aStruct.getl_EXCH_TYP().toString()));
	  
		}
		/**
		 * コンボボックスデータから表示説明を取得する
		 * @param combo コンボボックスデータ
		 * @param value コンボボックスデータの値
		 * @return コンボボックスデータの表示説明
		 */
		private String getDisplayName(ComboStruct combo, String value) {
			for (int j = 0; j < combo.size(); j++) {
				if ((combo.getData(j)[0]).equals(value)) {
					return combo.getData(j)[1];
				}
			}
			return null;
		}
		/**
		 * マスタキーの集う
		 */
		private HashMap keyvalueMap = new HashMap();
		
		/**
		 * @return Returns the keyvalueMap.
		 */
		public HashMap getKeyvalueMap() {
			return keyvalueMap;
		}
		/**
		 * @param keyvalueMap The keyvalueMap to set.
		 */
		public void setKeyvalueMap(HashMap keyvalueMap) {
			this.keyvalueMap = keyvalueMap;
		}
		
    	/**
    	 * 画面遷移時、キーの取得
    	 *
    	 */
    	private void getKey(){	
    		struct.setCOMPANY_CD(keyvalueMap.get("COMPANY_CD").toString());	
    		struct.setCUR_CD(keyvalueMap.get("CUR_CD").toString());
    		struct.setEXCH_TYP(keyvalueMap.get("EXCH_TYP").toString());
    		if (keyvalueMap.get("EXCH_RESERVE_CD") != null) {
    			struct.setEXCH_RESERVE_CD(keyvalueMap.get("EXCH_RESERVE_CD").toString());
    		}
    		struct.setEXCH_START_DATE(keyvalueMap.get("EXCH_START_DATE").toString());
    	}  
    	//主画面の入力値の再設定
        private void setMain(){
           struct.setEXCH_TYP_K(_keyStruct.getEXCH_TYP_K());
           struct.setEXCH_RESERVE_CD_K(_keyStruct.getEXCH_RESERVE_CD_K());
           struct.setEXCH_START_DATE_K(_keyStruct.getEXCH_START_DATE_K());
           struct.setEXCH_END_DATE_K(_keyStruct.getEXCH_END_DATE_K());
        }
		/**
		 * 情報メッセージ設定
		 * @param メッセージ番号
		 * @param 出力メッセージ
		 */
		private void setInfoMessage(String messageno)
		{
			ExpjMessage emsg = new ExpjMessage( messageno );
			msgStruct.addInfo( emsg );
			sysLog.info(emsg, getsysUSER_CD());
		}
		/**
		 * 承認情報を登録
		 * @param button
		 * @throws SQLException
		 */
	    private boolean insertAppr(String button) throws SQLException{   	
	    	/** 承認依頼存在チェック */
			ArrayList keyValueList = new ArrayList();
			
			// 変数設定(会社コード)
			MstColumns key1 = new MstColumns();
			key1.setColumnname("COMPANY_CD");
			key1.setColumnvalue(struct.getCOMPANY_CD());
			keyValueList.add(key1);			
			// 変数設定(通貨コード)
			MstColumns key2 = new MstColumns();
			key2.setColumnname("CUR_CD");
			key2.setColumnvalue(struct.getCUR_CD());
			keyValueList.add(key2);
			// 変数設定(為替種別)
			MstColumns key3 = new MstColumns();
			key3.setColumnname("EXCH_TYP");
			key3.setColumnvalue(struct.getEXCH_TYP());
			keyValueList.add(key3);
            //　変数設定(為替予約コード)
			if (struct.getEXCH_RESERVE_CD() != null && !"".equals(struct.getEXCH_RESERVE_CD())) {
				MstColumns key4 = new MstColumns();
				key4.setColumnname("EXCH_RESERVE_CD");
				key4.setColumnvalue(struct.getEXCH_RESERVE_CD());
				keyValueList.add(key4);			
			}
            //　変数設定(為替開始日付)						
			MstColumns key5 = new MstColumns();
			key5.setColumnname("EXCH_START_DATE");
			key5.setColumnvalue(struct.getEXCH_START_DATE());
			keyValueList.add(key5);
			
			MstAppr mstappr = new MstAppr(this.conn,this.getsysPLANT_CD(),this.getsysUSER_CD(),"AA0120010","AA0120010Servlet");
			// 承認依頼存在チェック
			boolean rtnFlg = mstappr.checkMST_APPR("M_EXCH_RATE", keyValueList);
			if(rtnFlg) {
				// キーが存在している
				ExpjMessage emsg = new ExpjMessage("KA00125");
				msgStruct.addError(emsg); // ワーニングメッセージとして登録
				sysLog.warning(emsg, getsysUSER_CD()); // エラー内容
				setStructForSub1(struct);
				return false;
			}
			
	    	/** 承認依頼表へ登録　*/
	    	MstApprStruct mstApprStruct = new MstApprStruct();
	    	// 画面URL
	    	mstApprStruct.setSCREEN_URL("AA0120010Servlet");
	    	// 工場コード
	    	mstApprStruct.setPLANT_CD(getsysPLANT_CD());
	    	// 処理区分
	    	mstApprStruct.setPROC_TYP(button);
	    	// 承認備考
	    	mstApprStruct.setAPPR_REMARKS(struct.getAPPR_REMARKS());   	
	    	// 承認状態(承認待ち)
	    	mstApprStruct.setSTATUS("1");
	    	// 依頼者
	    	mstApprStruct.setREQUEST_BY(struct.getsUser_ID());
	    	// 認依頼表にデータを追加
	    	String appr_ID = mstappr.insertMST_APPR(mstApprStruct);
	    	
	    	
	    	/** 承認キーへ登録 */
	    	MstApprKeyStruct keyStruct = new MstApprKeyStruct();
	    	// 承認ID
	    	keyStruct.setAPPR_ID(appr_ID);
	    	// テーブル名
	    	keyStruct.setTABLE_NAME("M_EXCH_RATE");
	    	// キー名(会社コード)
	    	keyStruct.setKEY_NAME("COMPANY_CD");
	    	// キー値(会社コード)
	    	keyStruct.setKEY_VALUE(struct.getCOMPANY_CD());
	    	// 承認キー対応表にマスタのキー(会社コード)を追加する
	    	mstappr.insertMST_APPR_KEY(keyStruct);
	    	
	    	// キー名(通貨コード)
	    	keyStruct.setKEY_NAME("CUR_CD");
	    	// キー値(通貨コード)
	    	keyStruct.setKEY_VALUE(struct.getCUR_CD());
	    	// 承認キー対応表にマスタのキー(EXCH_RATE)を追加する
	    	mstappr.insertMST_APPR_KEY(keyStruct);
	    	
	    	// キー名(為替種別)
	    	keyStruct.setKEY_NAME("EXCH_TYP");
	    	// キー値(為替種別)
	    	keyStruct.setKEY_VALUE(struct.getEXCH_TYP());
	    	// 承認キー対応表にマスタのキー(為替種別)を追加する
	    	mstappr.insertMST_APPR_KEY(keyStruct);
	    	if (struct.getEXCH_RESERVE_CD() != null && !"".equals(struct.getEXCH_RESERVE_CD())) {
		    	// キー名(為替予約コード)
		    	keyStruct.setKEY_NAME("EXCH_RESERVE_CD");
		    	// キー値(為替予約コード)
		    	keyStruct.setKEY_VALUE(struct.getEXCH_RESERVE_CD());
		    	// 承認キー対応表にマスタのキー(為替予約コード)を追加する
		    	mstappr.insertMST_APPR_KEY(keyStruct);		
			}

	    	
	    	// キー名(為替開始日付)
	    	keyStruct.setKEY_NAME("EXCH_START_DATE");
	    	// キー値(為替開始日付)
	    	keyStruct.setKEY_VALUE(struct.getEXCH_START_DATE());
	    	// 承認キー対応表にマスタのキー(為替開始日付)を追加する
	    	mstappr.insertMST_APPR_KEY(keyStruct);
	    	
	    	/** 承認明細表へ登録 */
			// 会社コード
	    	String columnID = mstappr.getColumnID( "M_EXCH_RATE", "COMPANY_CD");
			mstappr.setDetailByColumnID(struct.getCOMPANY_CD(),columnID);	
			
			// 通貨コード
	    	columnID = mstappr.getColumnID( "M_EXCH_RATE", "CUR_CD");
			mstappr.setDetailByColumnID(struct.getCUR_CD(),columnID);	
			
			// 為替種別
	    	columnID = mstappr.getColumnID( "M_EXCH_RATE", "EXCH_TYP");
			mstappr.setDetailByColumnID(struct.getEXCH_TYP(),columnID);	
			
			// 為替予約コード
	    	columnID = mstappr.getColumnID( "M_EXCH_RATE", "EXCH_RESERVE_CD");
			mstappr.setDetailByColumnID(struct.getEXCH_RESERVE_CD(),columnID);	
			
			// 為替開始日付
	    	columnID = mstappr.getColumnID( "M_EXCH_RATE", "EXCH_START_DATE");
			mstappr.setDetailByColumnID(struct.getEXCH_START_DATE(),columnID);	
			
			// 為替終了日付
	    	columnID = mstappr.getColumnID( "M_EXCH_RATE", "EXCH_END_DATE");
			mstappr.setDetailByColumnID(null,columnID);	
			
			// 為替レート
	    	columnID = mstappr.getColumnID( "M_EXCH_RATE", "EXCH_RATE");
			mstappr.setDetailByColumnID(struct.getEXCH_RATE(),columnID);	
			
			// 作成日
			columnID = mstappr.getColumnID("M_EXCH_RATE","CREATED_DATE");
			mstappr.setDetailByColumnID(mstappr.readSystemDateTime(),columnID);
			// 作成者
			columnID = mstappr.getColumnID("M_EXCH_RATE","CREATED_BY");
			mstappr.setDetailByColumnID(this.getsysUSER_CD(),columnID);
			// 作成プログラム名
			columnID = mstappr.getColumnID("M_EXCH_RATE","CREATED_PRG_NM");
			mstappr.setDetailByColumnID(this.getScreenId(),columnID);
			// 更新日
			columnID = mstappr.getColumnID("M_EXCH_RATE","UPDATED_DATE");
			mstappr.setDetailByColumnID(mstappr.readSystemDateTime(),columnID);
			// 更新者
			columnID = mstappr.getColumnID("M_EXCH_RATE","UPDATED_BY");
			mstappr.setDetailByColumnID(this.getsysUSER_CD(),columnID);
			// 更新プログラム名
			columnID = mstappr.getColumnID("M_EXCH_RATE","UPDATED_PRG_NM");
			mstappr.setDetailByColumnID(this.getScreenId(),columnID);
			// 更新数
			columnID = mstappr.getColumnID("M_EXCH_RATE","MODIFY_COUNT");
			mstappr.setDetailByColumnID("0",columnID);   	
			
			// 承認明細にデータを追加する。
			mstappr.insertMST_APPR_DETAIL("M_EXCH_RATE",appr_ID);
	    	
			// 承認を依頼しました。
			setInfoMessage("AZ00042");
			
			return true;
			
	    }			
		
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * 読込ボタン押下時に実行される処理です。
	 *
	 */
	public void controlSelect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0120");
		logger.entering("AA0120010Control"+":USER="+struct.getsUser_ID(),"controlSelect");
			//{{user_implement_dev:<controlSelect>
	                try {
	                 initializeDetail();
	                 //画面キーを保存
	                 _keyStruct.setEXCH_TYP_K(struct.getEXCH_TYP_K());
	                 _keyStruct.setEXCH_RESERVE_CD_K(struct.getEXCH_RESERVE_CD_K());
	                 _keyStruct.setEXCH_START_DATE_K(struct.getEXCH_START_DATE_K());
	                 _keyStruct.setEXCH_END_DATE_K(struct.getEXCH_END_DATE_K());
	                 // フォーム情報検索
	                 List formList = entity.mForm.read(conn, struct);
	                 if (formList.isEmpty()) {
	                  setErrorMessage("AA10011");
	                  setErrorParameter("M_CUR", "CUR_CD", struct.getCUR_CD());
	                  return;
	                 }
	                 // フォーム情報設定 
	                 setStruct((AA0120010Struct) formList.get(0));
	              
	                 // リストデータ検索
	     			MstAppr mstappr = new MstAppr(this.conn,this.getsysPLANT_CD(),this.getsysUSER_CD(),"AA0120010","AA0120010Servlet");
	    			// 承認画面の「承認後」ボタンから遷移する時
	     		    List viewList = new ArrayList();
	     		    int maxLine = sp.getMaxLine(conn, 10);
	    			if("1".equals(struct.geth_APR_EXCH_RATE()) && "1".equals(struct.geth_SCREENMOVE_TYP())&& isScreenMove()){				
	    				viewList = mstappr.selectMST_APPR_DETAIL(struct.geth_APPR_ID());
	    				// 対象件数が0の場合
	                    if (viewList.isEmpty()) {
	                     readStatus = NOT_FOUND;
	                     return;
	                    }
	                    // 表示行数制限値(SYS_SCREEN_PARM)を超えた場合エラー
	                    if ((maxLine != 0) && (viewList.size() > maxLine)) {
	                     setErrorMessage("ZZ01115", String.valueOf(maxLine));
	                     readStatus = TOO_MANY;
	                     return;
	                    }
	    			} else {
	    				//最大表示行数
		     			if(maxLine != 0) {
		     				struct.setROW_COUNT(String.valueOf(maxLine));
		     			} else {
		     				struct.setROW_COUNT(null);
		     			}
		     			viewList=entity.mViewCnt.read(conn, struct);
		     		    long rowCount = Long.parseLong(((AA0120010Struct)viewList.get(0)).getl_COUNT());
		     		   // 対象件数が0の場合
		    			if (rowCount==0) {
		    				//一覧表をクリアする
		    				if(list != null && list.size() > 0){
	                            list.clear();
	                        }
		    				setErrorMessage("ZZ06001");
		    				readStatus = NOT_FOUND;
		    				return;
		    			}
		    			// 表示行数制限値(SYS_SCREEN_PARM)を超えた場合エラー
		    			if ((maxLine != 0)  && rowCount == maxLine+1) {
		    				setErrorMessage("ZZ01115", String.valueOf(maxLine));
		    				readStatus = TOO_MANY;
		    				if(list != null && list.size() > 0){
		    					list.clear();
		    				}
		    				return;
		    			}
	    			}
	    			if("1".equals(struct.geth_APR_EXCH_RATE()) && "1".equals(struct.geth_SCREENMOVE_TYP())&& isScreenMove()){				
	    				viewList = mstappr.selectMST_APPR_DETAIL(struct.geth_APPR_ID());   		
	    			}else{
	                   // 正常の読込と承認画面の「承認前」ボタンから遷移する時、
	    				viewList = entity.mView.read(conn, struct);
	    			}
	                 // 承認画面の「承認後」ボタンから遷移する時
	 				if("1".equals(struct.geth_APR_EXCH_RATE()) && "1".equals(struct.geth_SCREENMOVE_TYP())&& isScreenMove()){
						MstApprDetailStruct tempStruct = (MstApprDetailStruct) viewList.get(0);
						String columnID;
						// 通貨コード
						columnID = mstappr.getColumnID( "M_EXCH_RATE", "CUR_CD");
						struct.setCUR_CD(mstappr.getDetailByColumnID(tempStruct,columnID));
						// 通貨名
						List curList = entity.mForm.read(conn,struct);
						if (!curList.isEmpty()) {
							struct.setCUR_NAME(((AA0120010Struct)curList.get(0)).getCUR_NAME());
						}
						// 為替種別
						columnID = mstappr.getColumnID( "M_EXCH_RATE", "EXCH_TYP");
						struct.setEXCH_TYP(mstappr.getDetailByColumnID(tempStruct,columnID));
						// 為替予約コード
						columnID = mstappr.getColumnID( "M_EXCH_RATE", "EXCH_RESERVE_CD");
						struct.setEXCH_RESERVE_CD(mstappr.getDetailByColumnID(tempStruct,columnID));
						// 為替開始日付
						columnID = mstappr.getColumnID( "M_EXCH_RATE", "EXCH_START_DATE");
						struct.setEXCH_START_DATE(mstappr.getDetailByColumnID(tempStruct,columnID));		
						// 為替レート
						columnID = mstappr.getColumnID( "M_EXCH_RATE", "EXCH_RATE");
						struct.setEXCH_RATE(mstappr.getDetailByColumnID(tempStruct,columnID));					
					} else {
						// 承認前のデータを取得
						if ("0".equals(struct.geth_SCREENMOVE_TYP())) {
							List rateList = entity.mM_EXCH_RATE.read(conn,struct);
							String exchRate = ((AA0120010Struct)rateList.get(0)).getEXCH_RATE();
							struct.setEXCH_RATE(exchRate);
						}  else {
							//　リストデータ設定
							setList(viewList);
							
							AA0120010Struct TempStruct;
							for (int i = 0; i < list.size(); i++) {
								TempStruct = (AA0120010Struct)list.get(i);
								//コンボボックスの取得
								othercomboTyp(TempStruct);
							}
							
						}
					}
	                 
	              
	                 readStatus = NORMAL;
	                 
	                } catch (SQLException e) {
	                 throw new ExpjException(e);
	                }
                //}}user_implement_dev:<controlSelect>
		logger.exiting("AA0120010Control"+":USER="+struct.getsUser_ID(),"controlSelect");

		return;
	}

	/**
	 * 行追加ボタン押下時に実行される処理です。
	 *
	 */
	public void controlLineInsert() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0120");
		logger.entering("AA0120010Control"+":USER="+struct.getsUser_ID(),"controlLineInsert");
			//{{user_implement_dev:<controlLineInsert>
                try {
                 // フォーム情報検索
                 List formList = entity.mForm.read(conn, struct);
                 // フォーム情報が存在しない場合は外部更新エラー
                 if (formList.isEmpty()) {
                  setErrorMessage("ZZ01105");
                  readStatus = ERROR;
                  return;
                 }
                 // フォーム情報設定 
                 setStruct((AA0120010Struct) formList.get(0));
                 // サブフォーム情報設定
                 setDefaultStructForSub1(struct);
              
                } catch (SQLException e) {
                 throw new ExpjException(e);
                }
                //}}user_implement_dev:<controlLineInsert>
		logger.exiting("AA0120010Control"+":USER="+struct.getsUser_ID(),"controlLineInsert");

		return;
	}

	/**
	 * 行修正ボタン押下時に実行される処理です。
	 *
	 */
	public void controlLineUpdate() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0120");
		logger.entering("AA0120010Control"+":USER="+struct.getsUser_ID(),"controlLineUpdate");
			//{{user_implement_dev:<controlLineUpdate>
              
                try {
                // サブフォーム情報検索
                 List subformList = entity.mFormSub1.read(conn, struct);
                 // サブフォーム情報が存在しない場合はエラー
                 if (subformList.isEmpty()) {
                  setErrorMessage("ZZ06001");
                  setDefaultStructForSub1(struct);
                  readStatus = ERROR;
                  return;
                 }
                
                 // サブフォーム情報設定
                 setStructForSub1((AA0120010Struct) subformList.get(0));
              
                } catch (SQLException e) {
                 throw new ExpjException(e);
                }
                
                //}}user_implement_dev:<controlLineUpdate>
		logger.exiting("AA0120010Control"+":USER="+struct.getsUser_ID(),"controlLineUpdate");

		return;
	}

	/**
	 * 行複写ボタン押下時に実行される処理です。
	 *
	 */
	public void controlLineCopy() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0120");
		logger.entering("AA0120010Control"+":USER="+struct.getsUser_ID(),"controlLineCopy");
			//{{user_implement_dev:<controlLineCopy>
              
                try {
                 // サブフォーム情報検索
                 List subformList = entity.mFormSub1.read(conn, struct);
                 // サブフォーム情報が存在しない場合はエラー
                 if (subformList.isEmpty()) {
                  setErrorMessage("ZZ06001");
                  setDefaultStructForSub1(struct);
                  readStatus = ERROR;
                  return;
                 }
                 // サブフォーム情報設定
                 setStructForSub1((AA0120010Struct) subformList.get(0));
              
                } catch (SQLException e) {
                 throw new ExpjException(e);
                }
                
                //}}user_implement_dev:<controlLineCopy>
		logger.exiting("AA0120010Control"+":USER="+struct.getsUser_ID(),"controlLineCopy");

		return;
	}

	/**
	 * 行削除ボタン押下時に実行される処理です。
	 *
	 */
	public void controlLineDelete() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0120");
		logger.entering("AA0120010Control"+":USER="+struct.getsUser_ID(),"controlLineDelete");
			//{{user_implement_dev:<controlLineDelete>
              
                try {
                 struct.setEXCH_TYP(struct.getl_EXCH_TYP());
                 struct.setEXCH_RESERVE_CD(struct.getl_EXCH_RESERVE_CD());
                 struct.setEXCH_START_DATE(struct.getl_EXCH_START_DATE());
              
                 // マスタ情報検索
                 List lockedList = entity.mM_EXCH_RATE_Lock.read(conn, struct);
                 // 削除するキーが存在しない場合はエラー。
                 if (lockedList.isEmpty()) {
                  setErrorMessage("ZZ01105");
                  return;
                 } 
                 // 読み込み時の[為替レート]."更新数"と異なる場合はエラー
                 AA0120010Struct lockedStruct = (AA0120010Struct) lockedList.get(0);
                 if (!lockedStruct.getMODIFY_COUNT().equals(struct.getl_MODIFY_COUNT())) {
                  setErrorMessage("ZZ01105");
                  return;
                 }
       			
                 if("1".equals(struct.geth_APR_EXCH_RATE())){				
    				// 承認情報の登録
    				boolean rtn = insertAppr("3");
    				if(!rtn) return;
    			} else {
    				// マスタ削除
    				entity.mM_EXCH_RATE.delete(conn, struct);
    			}
              
                 // 再読込を行う
     			controlSelect();     				
              
                 conn.commit();
                } catch (SQLException e) {
                 throw new ExpjException(e);
                } finally {
                 if (conn != null) {
                  conn.rollback();
                 }
                }
              
                //}}user_implement_dev:<controlLineDelete>
		logger.exiting("AA0120010Control"+":USER="+struct.getsUser_ID(),"controlLineDelete");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0120");
		logger.entering("AA0120010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
                
                // 画面を初期化
                initializeAll();
              
                //}}user_implement_dev:<controlClear>
		logger.exiting("AA0120010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * 登録ボタン押下時に実行される処理です。
	 *
	 */
	public void controlInsert() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0120");
		logger.entering("AA0120010Control"+":USER="+struct.getsUser_ID(),"controlInsert");
			//{{user_implement_dev:<controlInsert>
                try {
                 // マスク項目の値をクリアする
                 clearDisabledField();
              
                 // [通貨]に存在しない場合はエラー
                 List formList = entity.mForm.read(conn, struct);
                 if (formList.isEmpty()) {
                  setErrorMessage("ZZ01105");
                  setErrorParameter("M_CUR", "CUR_CD", struct.getCUR_CD());
                  setStructForSub1(struct);
                  readStatus = ERROR;
                  return;
                 }
                 // [為替レート]にすでに存在する場合はエラー
                 if (entity.mM_EXCH_RATE.check(conn, struct)) {
                  setErrorMessage("ZZ01102");
                  setErrorParameter("M_EXCH_RATE", "COMPANY_CD", struct.getCOMPANY_CD());
                  setErrorParameter("M_EXCH_RATE", "CUR_CD", struct.getCUR_CD());
                  setErrorParameter("M_EXCH_RATE", "EXCH_TYP", struct.getEXCH_TYP());
                  setErrorParameter("M_EXCH_RATE", "EXCH_RESERVE_CD", struct.getEXCH_RESERVE_CD());
                  setErrorParameter("M_EXCH_RATE", "EXCH_START_DATE", struct.getEXCH_START_DATE());
                  setStructForSub1(struct);
                  return;							
                 }
     			if("1".equals(struct.geth_APR_EXCH_RATE())){				
    				// 承認情報の登録
    				boolean rtn = insertAppr("1");
    				if(!rtn) return;

                    // フォーム情報検索
                    formList = entity.mForm.read(conn, struct);
                    if(formList != null && formList.size() > 0){
                        // フォーム情報設定 
                        setStruct((AA0120010Struct) formList.get(0));
                    }
    			} else {
    				// マスタ登録
    				entity.mM_EXCH_RATE.create(conn, struct);
    			}
              
                 // 再読込を行う
     			if(!"1".equals(struct.geth_APR_EXCH_RATE())){
     				setMain();
     				controlSelect();     				
     			}
                               
                 conn.commit();
                } catch (SQLException e) {
                 throw new ExpjException(e);
                } finally {
                 if (conn != null) {
                  conn.rollback();
                 }
                }
                //}}user_implement_dev:<controlInsert>
		logger.exiting("AA0120010Control"+":USER="+struct.getsUser_ID(),"controlInsert");

		return;
	}

	/**
	 * 更新ボタン押下時に実行される処理です。
	 *
	 */
	public void controlUpdate() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0120");
		logger.entering("AA0120010Control"+":USER="+struct.getsUser_ID(),"controlUpdate");
			//{{user_implement_dev:<controlUpdate>
                
                try {
                 // マスク項目の値をクリアする
                 clearDisabledField();
              
                 // マスタ情報検索
                 List lockedList = entity.mM_EXCH_RATE_Lock.read(conn, struct);
                 // 更新するキーが存在しない場合はエラー。
                 if (lockedList.isEmpty()) {
                  setErrorMessage("ZZ01105");
                  setStructForSub1(struct);
                  readStatus = ERROR;
                  return;
                 } 
                 // 読み込み時の[為替レート]."更新数"と異なる場合はエラー
                 AA0120010Struct lockedStruct = (AA0120010Struct) lockedList.get(0);
                 if (!lockedStruct.getMODIFY_COUNT().equals(struct.getMODIFY_COUNT())) {
                  setErrorMessage("ZZ01105");
                  setStructForSub1(struct);
                  readStatus = ERROR;
                  return;
                 }
              
      			if("1".equals(struct.geth_APR_EXCH_RATE())){				
    				// 承認情報の登録
    				boolean rtn = insertAppr("2");
    				if(!rtn) return;

                    // フォーム情報検索
                    List formList = entity.mForm.read(conn, struct);
                    if(formList != null && formList.size() > 0){
                        // フォーム情報設定 
                        setStruct((AA0120010Struct) formList.get(0));
                    }
    			} else {
    				// マスタ更新処理
    				entity.mM_EXCH_RATE.update(conn, struct);
    			}
              
                 // 再読込を行う
     			if(!"1".equals(struct.geth_APR_EXCH_RATE())){
     				setMain();
     				controlSelect();     				
     			}
              
                 conn.commit();
              
                } catch (SQLException e) {
                 throw new ExpjException(e);
                } finally {
                 if (conn != null) {
                  conn.rollback();
                 }
                }
                
                //}}user_implement_dev:<controlUpdate>
		logger.exiting("AA0120010Control"+":USER="+struct.getsUser_ID(),"controlUpdate");

		return;
	}

	/**
	 * 戻るボタン押下時に実行される処理です。
	 *
	 */
	public void controlReturn() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0120");
		logger.entering("AA0120010Control"+":USER="+struct.getsUser_ID(),"controlReturn");
			//{{user_implement_dev:<controlReturn>
		
		       setMain();
               // 再読込を行う
               controlSelect();
              
                //}}user_implement_dev:<controlReturn>
		logger.exiting("AA0120010Control"+":USER="+struct.getsUser_ID(),"controlReturn");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0120");
		logger.entering("AA0120010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
                 // TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AA0120010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0120");
		logger.entering("AA0120010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
              
                try {
                 // DBより[自社]."会社コード"を検索し、存在しない場合はエラー
                 List companyList = entity.mSYS_MY_COMPANY.read(conn, struct);
                 if (companyList.isEmpty()) {
                  throw new ExpjException("ZZ06001");
                 } else {
                  AA0120010Struct compStruct = (AA0120010Struct) companyList.get(0);
                  struct.setCOMPANY_CD(compStruct.getCOMPANY_CD());
                 }
                 DateCtrlStruct dcs = DateCtrlControl.getData(conn, sysPLANT_CD);
                 businessOprDate = dcs.getBUSINESS_OPR_DATE();
				
                 privateConfig = new PrivateConfig(conn);
				// 為替レート承認を取得
				String aprExchRate = privateConfig.getString("APR_EXCH_RATE");
				// パラメータ「為替レート承認」をセット
				if (aprExchRate == null || "".equals(aprExchRate)) {
					String locale = CoreTools.getLocale(struct.getsUser_ID());
					ResourceBundle messages = CoreTools.getResourceBundle("ExpjMessage", locale);
					ExpjMessage emsg = new ExpjMessage("AZ00041", messages.getString("AZ00048"));
					msgStruct.addError(emsg); // ワーニングメッセージとして登録
					sysLog.warning(emsg, getsysUSER_CD()); // エラー内容
					struct.seth_APR_EXCH_RATE("0");
				} else if (!"1".equals(aprExchRate)) {
					// １以外の場合
					struct.seth_APR_EXCH_RATE("0");
				} else {
					struct.seth_APR_EXCH_RATE("1");
				}
				_APR_EXCH_RATE = struct.geth_APR_EXCH_RATE();
                // 画面を初期化
                initializeAll();
				// キーを取得
    			if("1".equals(struct.geth_APR_EXCH_RATE()) && this.isScreenMove() && null != struct.geth_SCREENMOVE_TYP()){
    				getKey();
    			}

                } catch (SQLException e) {
                 throw new ExpjException(e);
                } catch (DataNotFoundException e) {
                 throw new ExpjException(e);
                }
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AA0120010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * イベントハンドラの前処理です。
	 *
	 * @param buttun ボタン名
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0120");
		logger.entering("AA0120010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
                
                ComboBox controller = new ComboBox(conn, sysUSER_CD);
                try {
			        ComboBox comboController = new ComboBox(conn, sysUSER_CD);
					ComboStruct combo = controller.getData("EXCH_TYP");
					struct.setList_EXCH_TYP_val(combo.getValList());
					struct.setList_EXCH_TYP_name(combo.getExplanList());
					struct.setList_EXCH_TYP_K_val(combo.getValList());
					struct.setList_EXCH_TYP_K_name(combo.getExplanList());
					EXCH_TYP = comboController.getData(EXCH_TYP_PARAMETER_NAME);	
					// システムパラメータ　
					struct.seth_APR_EXCH_RATE(_APR_EXCH_RATE);
                } catch (SQLException e) {
                 throw new ExpjException(e);
                } catch (ComboException e) {
                 throw new ExpjException(e);
                }
                controller.setConnection(null);
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("AA0120010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("LineInsert") ) {
				controlLineInsert();
			} else if( button.equals("LineUpdate") ) {
				controlLineUpdate();
			} else if( button.equals("LineCopy") ) {
				controlLineCopy();
			} else if( button.equals("LineDelete") ) {
				controlLineDelete();
			} else if( button.equals("Clear") ) {
				controlClear();
			} else if( button.equals("Insert") ) {
				controlInsert();
			} else if( button.equals("Update") ) {
				controlUpdate();
			} else if( button.equals("Return") ) {
				controlReturn();
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
//			throw new FoundationException("AA0120010Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AA0120010-E999","CSVの出力処理"));
			throw new FoundationException("AA0120010Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AA0120010-E999","システム日付の取得処理"));
				throw new FoundationException("AA0120010Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
                 // TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AA0120010-E999","コントロールのイベント処理"));
			throw new FoundationException("AA0120010Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected AA0120010Entity entity;
	protected AA0120010Struct struct;
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

		entity = new AA0120010Entity();
		struct = new AA0120010Struct();

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
	 * AA0120010クラスの標準コンストラクタ
	 */
	public AA0120010Control() throws BusinessProcessException, FoundationException
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
				AA0120010Struct key = (AA0120010Struct)keyList.get(j);
				// メッセージキーを作成する
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("l_EXCH_TYP_DN") && key.getl_EXCH_TYP_DN() != null) {
					msgKey.setKeyValue("l_EXCH_TYP_DN", key.getl_EXCH_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("EXCH_TYP_name") && key.getEXCH_TYP_name() != null) {
					msgKey.setKeyValue("EXCH_TYP_name", key.getEXCH_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("EXCH_TYP_val") && key.getEXCH_TYP_val() != null) {
					msgKey.setKeyValue("EXCH_TYP_val", key.getEXCH_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("h_APPR_ID") && key.geth_APPR_ID() != null) {
					msgKey.setKeyValue("h_APPR_ID", key.geth_APPR_ID());
				}
				if(msgKeyType.containsKeyColumn("h_SCREENMOVE_TYP") && key.geth_SCREENMOVE_TYP() != null) {
					msgKey.setKeyValue("h_SCREENMOVE_TYP", key.geth_SCREENMOVE_TYP());
				}
				if(msgKeyType.containsKeyColumn("APPR_REMARKS") && key.getAPPR_REMARKS() != null) {
					msgKey.setKeyValue("APPR_REMARKS", key.getAPPR_REMARKS());
				}
				if(msgKeyType.containsKeyColumn("h_APR_EXCH_RATE") && key.geth_APR_EXCH_RATE() != null) {
					msgKey.setKeyValue("h_APR_EXCH_RATE", key.geth_APR_EXCH_RATE());
				}
				if(msgKeyType.containsKeyColumn("EXCH_TYP_K_name") && key.getEXCH_TYP_K_name() != null) {
					msgKey.setKeyValue("EXCH_TYP_K_name", key.getEXCH_TYP_K_name());
				}
				if(msgKeyType.containsKeyColumn("EXCH_TYP_K_val") && key.getEXCH_TYP_K_val() != null) {
					msgKey.setKeyValue("EXCH_TYP_K_val", key.getEXCH_TYP_K_val());
				}
				if(msgKeyType.containsKeyColumn("l_EXCH_TYP") && key.getl_EXCH_TYP() != null) {
					msgKey.setKeyValue("l_EXCH_TYP", key.getl_EXCH_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_EXCH_RESERVE_CD") && key.getl_EXCH_RESERVE_CD() != null) {
					msgKey.setKeyValue("l_EXCH_RESERVE_CD", key.getl_EXCH_RESERVE_CD());
				}
				if(msgKeyType.containsKeyColumn("l_EXCH_START_DATE") && key.getl_EXCH_START_DATE() != null) {
					msgKey.setKeyValue("l_EXCH_START_DATE", key.getl_EXCH_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_EXCH_RATE") && key.getl_EXCH_RATE() != null) {
					msgKey.setKeyValue("l_EXCH_RATE", key.getl_EXCH_RATE());
				}
				if(msgKeyType.containsKeyColumn("l_MODIFY_COUNT") && key.getl_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("l_MODIFY_COUNT", key.getl_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("CUR_CD") && key.getCUR_CD() != null) {
					msgKey.setKeyValue("CUR_CD", key.getCUR_CD());
				}
				if(msgKeyType.containsKeyColumn("EXCH_TYP_K") && key.getEXCH_TYP_K() != null) {
					msgKey.setKeyValue("EXCH_TYP_K", key.getEXCH_TYP_K());
				}
				if(msgKeyType.containsKeyColumn("EXCH_RESERVE_CD_K") && key.getEXCH_RESERVE_CD_K() != null) {
					msgKey.setKeyValue("EXCH_RESERVE_CD_K", key.getEXCH_RESERVE_CD_K());
				}
				if(msgKeyType.containsKeyColumn("EXCH_START_DATE_K") && key.getEXCH_START_DATE_K() != null) {
					msgKey.setKeyValue("EXCH_START_DATE_K", key.getEXCH_START_DATE_K());
				}
				if(msgKeyType.containsKeyColumn("EXCH_END_DATE_K") && key.getEXCH_END_DATE_K() != null) {
					msgKey.setKeyValue("EXCH_END_DATE_K", key.getEXCH_END_DATE_K());
				}
				if(msgKeyType.containsKeyColumn("CUR_NAME") && key.getCUR_NAME() != null) {
					msgKey.setKeyValue("CUR_NAME", key.getCUR_NAME());
				}
				if(msgKeyType.containsKeyColumn("CUR_UNIT") && key.getCUR_UNIT() != null) {
					msgKey.setKeyValue("CUR_UNIT", key.getCUR_UNIT());
				}
				if(msgKeyType.containsKeyColumn("CUR_SYMBOL") && key.getCUR_SYMBOL() != null) {
					msgKey.setKeyValue("CUR_SYMBOL", key.getCUR_SYMBOL());
				}
				if(msgKeyType.containsKeyColumn("DECIMAL_FIG") && key.getDECIMAL_FIG() != null) {
					msgKey.setKeyValue("DECIMAL_FIG", key.getDECIMAL_FIG());
				}
				if(msgKeyType.containsKeyColumn("EXCH_TYP") && key.getEXCH_TYP() != null) {
					msgKey.setKeyValue("EXCH_TYP", key.getEXCH_TYP());
				}
				if(msgKeyType.containsKeyColumn("EXCH_RESERVE_CD") && key.getEXCH_RESERVE_CD() != null) {
					msgKey.setKeyValue("EXCH_RESERVE_CD", key.getEXCH_RESERVE_CD());
				}
				if(msgKeyType.containsKeyColumn("EXCH_START_DATE") && key.getEXCH_START_DATE() != null) {
					msgKey.setKeyValue("EXCH_START_DATE", key.getEXCH_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("EXCH_RATE") && key.getEXCH_RATE() != null) {
					msgKey.setKeyValue("EXCH_RATE", key.getEXCH_RATE());
				}
				if(msgKeyType.containsKeyColumn("MODIFY_COUNT") && key.getMODIFY_COUNT() != null) {
					msgKey.setKeyValue("MODIFY_COUNT", key.getMODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("COMPANY_CD") && key.getCOMPANY_CD() != null) {
					msgKey.setKeyValue("COMPANY_CD", key.getCOMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("l_COUNT") && key.getl_COUNT() != null) {
					msgKey.setKeyValue("l_COUNT", key.getl_COUNT());
				}
				if(msgKeyType.containsKeyColumn("ROW_COUNT") && key.getROW_COUNT() != null) {
					msgKey.setKeyValue("ROW_COUNT", key.getROW_COUNT());
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
					AA0120010Struct key = new AA0120010Struct();
					if(msgKeyType.containsKeyColumn("l_EXCH_TYP_DN")) {
						key.setl_EXCH_TYP_DN(msgKey.getKeyValue("l_EXCH_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("EXCH_TYP_name")) {
						key.setEXCH_TYP_name(msgKey.getKeyValue("EXCH_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("EXCH_TYP_val")) {
						key.setEXCH_TYP_val(msgKey.getKeyValue("EXCH_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("h_APPR_ID")) {
						key.seth_APPR_ID(msgKey.getKeyValue("h_APPR_ID"));
					}
					if(msgKeyType.containsKeyColumn("h_SCREENMOVE_TYP")) {
						key.seth_SCREENMOVE_TYP(msgKey.getKeyValue("h_SCREENMOVE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("APPR_REMARKS")) {
						key.setAPPR_REMARKS(msgKey.getKeyValue("APPR_REMARKS"));
					}
					if(msgKeyType.containsKeyColumn("h_APR_EXCH_RATE")) {
						key.seth_APR_EXCH_RATE(msgKey.getKeyValue("h_APR_EXCH_RATE"));
					}
					if(msgKeyType.containsKeyColumn("EXCH_TYP_K_name")) {
						key.setEXCH_TYP_K_name(msgKey.getKeyValue("EXCH_TYP_K_name"));
					}
					if(msgKeyType.containsKeyColumn("EXCH_TYP_K_val")) {
						key.setEXCH_TYP_K_val(msgKey.getKeyValue("EXCH_TYP_K_val"));
					}
					if(msgKeyType.containsKeyColumn("l_EXCH_TYP")) {
						key.setl_EXCH_TYP(msgKey.getKeyValue("l_EXCH_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_EXCH_RESERVE_CD")) {
						key.setl_EXCH_RESERVE_CD(msgKey.getKeyValue("l_EXCH_RESERVE_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_EXCH_START_DATE")) {
						key.setl_EXCH_START_DATE(msgKey.getKeyValue("l_EXCH_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_EXCH_RATE")) {
						key.setl_EXCH_RATE(msgKey.getKeyValue("l_EXCH_RATE"));
					}
					if(msgKeyType.containsKeyColumn("l_MODIFY_COUNT")) {
						key.setl_MODIFY_COUNT(msgKey.getKeyValue("l_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("CUR_CD")) {
						key.setCUR_CD(msgKey.getKeyValue("CUR_CD"));
					}
					if(msgKeyType.containsKeyColumn("EXCH_TYP_K")) {
						key.setEXCH_TYP_K(msgKey.getKeyValue("EXCH_TYP_K"));
					}
					if(msgKeyType.containsKeyColumn("EXCH_RESERVE_CD_K")) {
						key.setEXCH_RESERVE_CD_K(msgKey.getKeyValue("EXCH_RESERVE_CD_K"));
					}
					if(msgKeyType.containsKeyColumn("EXCH_START_DATE_K")) {
						key.setEXCH_START_DATE_K(msgKey.getKeyValue("EXCH_START_DATE_K"));
					}
					if(msgKeyType.containsKeyColumn("EXCH_END_DATE_K")) {
						key.setEXCH_END_DATE_K(msgKey.getKeyValue("EXCH_END_DATE_K"));
					}
					if(msgKeyType.containsKeyColumn("CUR_NAME")) {
						key.setCUR_NAME(msgKey.getKeyValue("CUR_NAME"));
					}
					if(msgKeyType.containsKeyColumn("CUR_UNIT")) {
						key.setCUR_UNIT(msgKey.getKeyValue("CUR_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("CUR_SYMBOL")) {
						key.setCUR_SYMBOL(msgKey.getKeyValue("CUR_SYMBOL"));
					}
					if(msgKeyType.containsKeyColumn("DECIMAL_FIG")) {
						key.setDECIMAL_FIG(msgKey.getKeyValue("DECIMAL_FIG"));
					}
					if(msgKeyType.containsKeyColumn("EXCH_TYP")) {
						key.setEXCH_TYP(msgKey.getKeyValue("EXCH_TYP"));
					}
					if(msgKeyType.containsKeyColumn("EXCH_RESERVE_CD")) {
						key.setEXCH_RESERVE_CD(msgKey.getKeyValue("EXCH_RESERVE_CD"));
					}
					if(msgKeyType.containsKeyColumn("EXCH_START_DATE")) {
						key.setEXCH_START_DATE(msgKey.getKeyValue("EXCH_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("EXCH_RATE")) {
						key.setEXCH_RATE(msgKey.getKeyValue("EXCH_RATE"));
					}
					if(msgKeyType.containsKeyColumn("MODIFY_COUNT")) {
						key.setMODIFY_COUNT(msgKey.getKeyValue("MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("COMPANY_CD")) {
						key.setCOMPANY_CD(msgKey.getKeyValue("COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_COUNT")) {
						key.setl_COUNT(msgKey.getKeyValue("l_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("ROW_COUNT")) {
						key.setROW_COUNT(msgKey.getKeyValue("ROW_COUNT"));
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
