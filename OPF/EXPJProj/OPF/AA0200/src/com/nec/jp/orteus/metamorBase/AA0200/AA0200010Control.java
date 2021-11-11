/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AA0200/src/com/nec/jp/orteus/metamorBase/AA0200/AA0200010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AA0200;

import com.nec.jp.orteus.metamorBase.AA0200.*;
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

import java.io.*;
import jp.co.fit.vfreport.*;
//{{user_implement_code_import
	// TODO: ここにimportパッケージを記述してください
import com.nec.jp.orteus.xaf.common.XafTools;
//}}user_implement_code_import

//{{user_implement_code_header
/**
 * CLASS     : AA0200010Control クラス
 * ファイル・クラス説明
 * @author $Author: xl-hs-zzw $
 * @version $Revision: 1.2 $ $Date: 2015/10/27 08:06:33 $
 *
 */
//}}user_implement_code_header

public class AA0200010Control
{

	//////////////////////////////
	// アクセサメソッド等を定義します
	// Businessオブジェクトアクセサメソッド
	private Business business;
	public Business getBusiness() { return this.business; }
	public void setBusiness( Business obj ) { this.business = obj; }

	// PDF用アクセサメソッド
	private String queryFileName = null;
	public String getQueryfileName() { return this.queryFileName; }
	public void setQueryFileName(String queryFileName) { this.queryFileName = queryFileName; }
	private String frmFileName = null;
	public String getFrmfileName() { return this.frmFileName; }
	public void setFrmFileName(String frmFileName) { this.frmFileName = frmFileName; }
	private String pdfFileName = null;
	public String getPdfFileName() { return this.pdfFileName; }
	public void setPdfFileName(String pdfFileName) { this.pdfFileName = pdfFileName; }
	private String dbUID = null;
	private String dbPWD = null;
	private String dbDBQ = null;
	private String dbKIND = null;
	private String pdfFilePath = null;
	public String getPdfFilePath() { return this.pdfFilePath; }
	public void setPdfFilePath(String pdfFilePath) { this.pdfFilePath = pdfFilePath; }

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
//	public Object getListvalue(int x) { return this.list.get(x); }	// リストの値を返します。
	public AA0200010Struct getListvalue(int x) { return (AA0200010Struct)(this.list.get(x)); }	// リストの値を返します。
	public AA0200010Struct getStruct() { return this.struct; }	// Structの値を返します。
	public AA0200010Struct createStruct() { return new AA0200010Struct(); }	// 新しいStructを作って返します。
	public void setStruct(Object structname) { this.struct.setStruct((AA0200010Struct)structname); }	// Structをセットします。
	public void initializeStruct() { this.struct.initialize(); }	// Structの値を初期化します。

	// CSV出力用リスト
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }
	// TODO: ユーザ定義のコードを記述してください
	/**全部レコード件数**/
	private int _intTotalCount = 0; 
	/**エラーレコード件数**/
	private int _intErrorCount = 0;  
	/**正常レコード件数**/
	private int _intSuccessCount = 0;
	/**ワーニング件数**/
	private int _intWarningCount = 0;
	/**エラーコード**/
	private String _strSysdate = "";

	// 親画面のstructを退避
	private String _strRdoInsert = "";
	private String _strRdoUpdate = "";
	private String _strRdoDelete = "";
	private String _strDoChk = "";
	// 拡張子
    private final String EXTENSION_CSV = "csv";
	/** ＣＳＶ項目番号定義 */
	// 利用者コード
	private final int CSV_USER_CD = 0;
	// 利用者
	private final int CSV_USER_NAME = 1;
	// パスワード
	private final int CSV_PASSWORD = 2;
	// 工場コード
	private final int CSV_PLANT_CD = 3;
	// 部門コード
	private final int CSV_SECTION_CD = 4;
	// 多言語
	private final int CSV_LOCALE = 5;
	// メールアドレス
	private final int CSV_ADDRESS = 6;
	// 承認権限
	private final int CSV_APPR_POWER_TYP = 7;
	// 所属部門コード
	private final int CSV_BELONG_GROUP_CD = 8;
	// 所属フラグ
	private final int CSV_BELONG_FLG = 9;
	//ＣＳＶ取込データ必要項目数(合計)
	private final int CSV_NECESSARY_COLUMN= 10;
	// 99
	private final String CSV_COLNO_99 = "99";
	// メッセージ
	private ExpjMessage _emsg = null;

	// 多言語項目取得対応
	private String _locale = CoreTools.getLocale(sysUSER_CD);
	ResourceBundle _resource = CoreTools.getResourceBundle("OrteusUserDic", _locale);

	/** 非表示業務グループ情報アクセスキー */
	private final static String _DISABLE_BUSINESS_GROUP_ACCESS_KEY = "DISABLE_BUSINESS_G";
	
	/** 業務グループデータ格納用 */
	private List _listNotBusinessGroupCD = null;
	
	/** 会社コード */
	private String _strCompany_cd;

	/** コンボボックスデータ：エラー区分 */
	private ComboStruct _COM_ERR_TYP = null;

	/**
	 * 承認権限をゲット
	 * 
	 * @return
	 */
	private ComboStruct APPR_POWER_TYP = null;
	
	/**
	 * 多言語をゲット
	 * 
	 * @return
	 */
	private ComboStruct LOCALE_TYP = null;	
	
	/** 会社コード取得 */
	public String getCompanyCd() {
		return _strCompany_cd;
	}
	/**
	 * 業務ロジックのエラーメッセージ設定処理を切り出して関数化
	 * @param code メッセージコード
	 * @param value1 置換文字列１
	 * @param value2 置換文字列2
	 * @param value3 置換文字列3
	 */
	private void setErrorMessage(String code, String value1, String value2, String value3) {
		ExpjMessage emsg = new ExpjMessage(code, value1, value2, value3);
		msgStruct.addError(emsg);
		sysLog.warning(emsg, sysUSER_CD);
	}
	
	/**
	 * 業務ロジックのエラーメッセージ設定処理を切り出して関数化
	 * @param code メッセージコード
	 * @param value1 置換文字列１
	 * @param value2 置換文字列2
	 */
	private void setErrorMessage(String code, String value1, String value2) {
		ExpjMessage emsg = new ExpjMessage(code, value1, value2);
		msgStruct.addError(emsg);
		sysLog.warning(emsg, sysUSER_CD);
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
	 * 業務ロジックのワーニングメッセージ設定処理を切り出して関数化
	 * @param code メッセージコード
	 * @param msg1
	 * @param msg2
	 */
	private void setWarningMessage(String code, String msg1, String msg2) {
		ExpjMessage emsg = new ExpjMessage(code, msg1, msg2);
		msgStruct.addWarn(emsg);
		sysLog.info(emsg, sysUSER_CD);
	}

	/**
	 * SQLExceptionエラーメッセージ設定
	 * 
	 * @param SQLException
	 */
	private void setSqlExceptionMsg(SQLException e) throws ExpjException {
		ExpjMessage emsg = new ExpjMessage("ZZ01106");
		sysLog.severe(emsg, getsysUSER_CD());
		ExpjException ee = new ExpjException(e, emsg);
		throw ee;
	}

	/**
	 * ログメッセージ設定
	 * @param 出力メッセージ
	 */
	private void setSyslogConfig(String message) {
		ExpjMessage emsg = new ExpjMessage( "ZZ01006", message );
		sysLog.config(emsg, getsysUSER_CD());
	}
	
	/**
	 * 業務ロジックのインフォメーション設定処理を切り出して関数化
	 * @param code
	 * @param value1
	 */
	private void setInfoMessage(String code, String value1, String value2, String value3) {
		ExpjMessage emsg = new ExpjMessage(code, value1, value2, value3);
		msgStruct.addInfo(emsg);
		sysLog.info(emsg, sysUSER_CD);
	}
	
	/**
	 * 業務ロジックのインフォメーション設定処理を切り出して関数化
	 * @param code
	 * @param value1
	 */
	private void setInfoMessage(String code, String value1) {
		ExpjMessage emsg = new ExpjMessage(code, value1);
		msgStruct.addInfo(emsg);
		sysLog.info(emsg, sysUSER_CD);
	}
	/**
	 * NULLの場合、””を戻る
	 * @param strInput
	 * @return
	 */
	private String getString(String strInput){
		if(CsvInCheck.isNull(strInput)){
			return "";
		}else{
			return strInput;
		}
	}
	/** 
	 * 業務運用日読込処理
	 *
	 * @return boolean
	 */
	private String readBUSINESS_OPR_DATE(String plantCd) throws BusinessProcessException, FoundationException
	{
		String businessDate = null;
		try {
			// 業務運用日読込
			AA0200010Struct structCsv = new AA0200010Struct();
			structCsv.setl_PLANT_CD(plantCd);
			List businessList = entity.mselectBUSINESS_OPR_DATE.read(conn, structCsv);
			if(businessList.size() > 0){
				businessDate = ((AA0200010Struct)businessList.get(0)).getl_BUSINESS_OPR_DATE();
			}
		} catch(SQLException e) {
			// エラーメッセージ作成
			ExpjMessage emsg = new ExpjMessage("ZZ01106");
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;
		}
		return businessDate;
	}
	/**
	 * ＣＳＶデータ取得とリストデータ化　
	 * 
	 * @return CSVデータリスト
	 */
	private List readCsvData() throws ExpjException {
		String[] strsCsvData = null;
		List listCsv = new ArrayList();
		try {
			// CSVデータのアップロード
			strsCsvData = (String []) csvReader.lineRead();
			if (strsCsvData != null) {
				setSyslogConfig("strsCsvData.length:" + strsCsvData.length);
				// データ件数としてstrsCsvData.lengthは使えない。実際の行数＋５行くらいらしい
				AA0200010Struct structCsv = null;
				Vector v = null;
				
				for (int i = 0; i < strsCsvData.length; i++) {
					if (strsCsvData[i].length() == 0) {
						// 処理を抜ける。
						break;
					}
					// レコードを項目毎にばらす
					v = csvReader.importCSVLine(strsCsvData[i]);
					if (v != null ) {
						structCsv = new AA0200010Struct();
						if (CSV_NECESSARY_COLUMN == v.size()) {
							// 利用者コード
							structCsv.setl_USER_CD((String)v.get(CSV_USER_CD));
							// 利用者名
							structCsv.setl_USER_NAME((String)v.get(CSV_USER_NAME));
							// パスワード
							structCsv.setl_PASSWORD((String)v.get(CSV_PASSWORD));
							// 工場コード
							structCsv.setl_PLANT_CD((String)v.get(CSV_PLANT_CD));
							// 部門コード
							structCsv.setl_SECTION_CD((String)v.get(CSV_SECTION_CD));
							// 多言語
							if(CsvInCheck.isNull((String)v.get(CSV_LOCALE))){
								structCsv.setl_LOCALE(" ");
							}else{
								structCsv.setl_LOCALE((String)v.get(CSV_LOCALE));
							}
							// メールアドレス
							structCsv.setl_ADDRESS((String)v.get(CSV_ADDRESS));							
							// 承認権限
							if(CsvInCheck.isNull((String)v.get(CSV_APPR_POWER_TYP))){
								structCsv.setl_APPR_POWER_TYP("0");
							}else{
								structCsv.setl_APPR_POWER_TYP((String)v.get(CSV_APPR_POWER_TYP));
							}
							// 所属部門コード
							structCsv.setl_BELONG_GROUP_CD((String)v.get(CSV_BELONG_GROUP_CD));
							// 所属フラグ
							if(CsvInCheck.isNull((String)v.get(CSV_BELONG_FLG))){
								structCsv.setw_BELONG_FLG("0");
							}else{
								structCsv.setw_BELONG_FLG((String)v.get(CSV_BELONG_FLG));
							}
							
							// 会社コード
							structCsv.setl_COMPANY_CD(_strCompany_cd);
							
							structCsv.setw_COLUMN_FLG((String)null);
						} else {
							// 利用者コード
							structCsv.setl_USER_CD((String)v.get(CSV_USER_CD));
							structCsv.setw_COLUMN_FLG(String.valueOf(v.size()));
						}						
						listCsv.add(structCsv);
					} else {
						//ベクター生成失敗エラー
						setSyslogConfig("csvReader.Vector was Failed... line:" + strsCsvData[i]);
						listCsv = null;
						break;
					}
				}
				
				//  ＣＳＶデータ件数（タイトル行は省く）
				if((listCsv == null) || (listCsv.size() <= 0)) {
					// 取込失敗またはデータなし
					ExpjMessage emsg = new ExpjMessage( "AH00042", "0", "0");
					msgStruct.addError( emsg );
					sysLog.warning(emsg, getsysUSER_CD());
					listCsv = null;
				} else {
					// ＣＳＶ読込み件数ログ表示
					ExpjMessage emsg = new ExpjMessage( "AH00043", String.valueOf(listCsv.size()));
					sysLog.config(emsg, getsysUSER_CD());
				}
			}
		} catch (Exception e) {
			ExpjMessage emsg = new ExpjMessage("AH00042", "0", "0");
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;
		}		
		return listCsv;
	}
	/**
     * ファイルネーミング
     *
     * @return  正常:true / エラー:false
     */
	private boolean chkOutputFilePath() throws BusinessProcessException,
			FoundationException {
		String filePath = null;
		try {
			// 出力ファイルネーミング
			PrivateConfig pc = new PrivateConfig(conn);
			// 訂正ログファイル名取得(システムパラメータより取得)
			String CsvCancelFileName = pc.getString("J_USER_MST_CANCEL");
			if (null == CsvCancelFileName || "".equals(CsvCancelFileName)) {
				msgStruct.clear();
				// エラーメッセージ表示
				ExpjMessage emsg = new ExpjMessage("AA01521");
				msgStruct.addError(emsg);
				sysLog.severe(emsg, getsysUSER_CD());
				return false;
			}
			// ファイルネーミング
			FileNaming fnm = new FileNaming();
			// ユーザ
			fnm.setUser(getsysUSER_CD());
			// 拡張子
			fnm.setExtension(EXTENSION_CSV);
			// ディレクトリ
			fnm.setDirectory(CsvCancelFileName);
			filePath = fnm.naming();
			if (null == filePath || "".equals(filePath)) {
				msgStruct.clear();
				// エラーメッセージ表示
				ExpjMessage emsg = new ExpjMessage("AA01522");
				msgStruct.addError(emsg);
				sysLog.severe(emsg, getsysUSER_CD());
				return false;
			}
		} catch (Exception e) {
			ExpjMessage emsg = new ExpjMessage("AH00042", "0", "0");
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;
		}
		struct.setCANCEL_FILE(filePath);
		return true;
	}
	/**
	 * ＣＳＶ出力データ設定準備
	 * 
	 * @param errlineNo
	 *            エラー発生行
	 * @param errItemNo
	 *            エラー項目番号
	 * @param errTyp
	 *            エラー区分
	 * @param target_struct
	 *            対象データ情報
	 * @param fieldName
	 *            エラー項目名
	 * @param strMessage
	 *            エラーメッセージ
	 * @return 異常なし true エラー false
	 */
	private void csvExport(String errlineNo, String errItemNo,
			String errTyp, AA0200010Struct target_struct, String fieldName,	String strMessage) throws BusinessProcessException, FoundationException {
		
		AA0200010Struct errStruct = new AA0200010Struct();
		String locale = CoreTools.getLocale(sysUSER_CD);
		
		ExpjMessage emsg = null;
		// エラー箇所
		// 多言語キーセット
		if (!CSV_COLNO_99.equals(errItemNo)) {
			emsg = new ExpjMessage("AH00045", errlineNo, errItemNo);
		} else {
			emsg = new ExpjMessage("AA01520", errlineNo);
		}
		errStruct.setl_ERROR_IN(emsg.getMessage(locale));
		
		// エラー区分
		errStruct.setl_ERR_TYP(errTyp);
		// 利用者コード
		errStruct.setl_USER_CD(CsvInCheck.replaceSlash(target_struct.getl_USER_CD()));
		errStruct.seto_USER_CD(target_struct.getl_USER_CD());
		// エラー項目名
		errStruct.setl_ERR_CTR_NM(fieldName);
		// エラー内容
		errStruct.setl_ERR_INFO(strMessage);
		// listを追加
		list.add(errStruct);
	}
	
	/**
	 * CSVフェイル内容チェック
	 * @param csvList
	 * @return
	 * @throws BusinessProcessException
	 * @throws FoundationException
	 * @throws SQLException 
	 */
	private boolean checkCsvData(List csvList)
			throws BusinessProcessException, FoundationException {
		// 多言語項目取得対応
		String locale = CoreTools.getLocale(sysUSER_CD);
		String property = "OrteusUserDic";
	    ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
	    
	    boolean break_flg = false;

	    // 項目過不足
	 	String strCsvColCom = CoreTools.getRBString("Expj.Cmt3099", resource);
	 	
	 	// エラーフラグ初期化
	 	boolean checkFlag = true;
	 	
		AA0200010Struct csvStruct = new AA0200010Struct();
		AA0200010Struct tempStruct = null;

		try {
			for (int i = 0; i < csvList.size(); i++) {
				
				// 全部レコード数
				_intTotalCount++;
				break_flg = false;
				csvStruct = (AA0200010Struct)csvList.get(i);
				csvStruct.setl_COMPANY_CD(getCompanyCd());
				// 登録更新チェック
				if ("true".equals(_strRdoInsert) || "true".equals(_strRdoUpdate)) {
					// CSVファイルの項目数チェックを行う
					if (!CsvInCheck.isNull(csvStruct.getw_COLUMN_FLG())) {
						if (Calculate.compare(String.valueOf(CSV_NECESSARY_COLUMN),
								csvStruct.getw_COLUMN_FLG().toString()) > 0) {
							// 項目に不足がある場合
							_emsg = new ExpjMessage("AA01500", csvStruct.getw_COLUMN_FLG());
						} else if (Calculate.compare(String.valueOf(CSV_NECESSARY_COLUMN), 
								csvStruct.getw_COLUMN_FLG().toString()) < 0) {
							// 項目が必要数以上の場合
							_emsg = new ExpjMessage("AA01519", csvStruct.getw_COLUMN_FLG());
						}
						csvExport(
								String.valueOf(i + 1),
								CSV_COLNO_99,
								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
								csvStruct,
								strCsvColCom,
								_emsg.getMessage(locale));
						_intErrorCount++;
						continue;
					}
				}
				// 利用者コードがNULLの場合
				String strUserCd = CoreTools.getRBString("Expj.AR_USER_CD",	resource);
				//登録時のみ
				if ("true".equals(_strRdoInsert)){					
					if (CsvInCheck.isNull(csvStruct.getl_USER_CD())) {
						_emsg = new ExpjMessage("AA01530", strUserCd);
						csvExport(String.valueOf(i + 1),
								String.valueOf(CSV_USER_CD + 1),
								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
								csvStruct,
								strUserCd,
								_emsg.getMessage(locale));
						_intErrorCount ++;
						continue;
					}
					// 文字26桁以上の場合
					if (CsvInCheck.strLengthChk(csvStruct.getl_USER_CD()) >= 26) {
						_emsg = new ExpjMessage("AA01501");
						csvExport(String.valueOf(i + 1),
								String.valueOf(CSV_USER_CD + 1),
								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
								csvStruct,
								strUserCd,
								_emsg.getMessage(locale));
						_intErrorCount ++;
						continue;
					}
					// 禁則文字が入力されていた場合
					if (CsvInCheck.chkHankaku(csvStruct.getl_USER_CD())) {
						_emsg = new ExpjMessage("AA01524");
						csvExport(String.valueOf(i + 1),
								String.valueOf(CSV_USER_CD + 1),
								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
								csvStruct,
								strUserCd,
								_emsg.getMessage(locale));
						_intErrorCount ++;
						continue;
					}
				}
				// 登録更新チェック
				if ("true".equals(_strRdoInsert) || "true".equals(_strRdoUpdate)) {
					//利用者名
					String strUserName = CoreTools.getRBString("Expj.AR_USER_NAME",	resource);
					//NULLの場合
					if (CsvInCheck.isNull(csvStruct.getl_USER_NAME())) {
						_emsg = new ExpjMessage("AA01530", strUserName);
						csvExport(String.valueOf(i + 1),
								String.valueOf(CSV_USER_NAME + 1),
								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
								csvStruct,
								strUserName,
								_emsg.getMessage(locale));
						_intErrorCount ++;
						continue;
					}
					// 文字41桁以上の場合
					if (CsvInCheck.strLengthChk(csvStruct.getl_USER_NAME()) >= 41) {
						_emsg = new ExpjMessage("AA01501");
						csvExport(String.valueOf(i + 1),
								String.valueOf(CSV_USER_NAME + 1),
								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
								csvStruct,
								strUserName,
								_emsg.getMessage(locale));
						_intErrorCount ++;
						continue;
					}
					// 禁則文字が入力されていた場合
					if (CsvInCheck.chkHankaku(csvStruct.getl_USER_NAME())) {
						_emsg = new ExpjMessage("AA01524");
						csvExport(String.valueOf(i + 1),
								String.valueOf(CSV_USER_NAME + 1),
								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
								csvStruct,
								strUserName,
								_emsg.getMessage(locale));
						_intErrorCount ++;
						continue;
					}
					//パスワード
					String strPassword = CoreTools.getRBString("Expj.PASSWORD",	resource);
					//NULLの場合
					if (CsvInCheck.isNull(csvStruct.getl_PASSWORD())) {
						_emsg = new ExpjMessage("AA01530", strPassword);
						csvExport(String.valueOf(i + 1),
								String.valueOf(CSV_PASSWORD + 1),
								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
								csvStruct,
								strPassword,
								_emsg.getMessage(locale));
						_intErrorCount ++;
						continue;
					}
					// 文字41桁以上の場合
					if (CsvInCheck.strLengthChk(csvStruct.getl_PASSWORD()) >= 41) {
						_emsg = new ExpjMessage("AA01501");
						csvExport(String.valueOf(i + 1),
								String.valueOf(CSV_PASSWORD + 1),
								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
								csvStruct,
								strPassword,
								_emsg.getMessage(locale));
						_intErrorCount ++;
						continue;
					}
					// 禁則文字が入力されていた場合
					if (CsvInCheck.chkHankaku(csvStruct.getl_PASSWORD())) {
						_emsg = new ExpjMessage("AA01524");
						csvExport(String.valueOf(i + 1),
								String.valueOf(CSV_PASSWORD + 1),
								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
								csvStruct,
								strPassword,
								_emsg.getMessage(locale));
						_intErrorCount ++;
						continue;
					}	
					//指定されたパスワードとユーザコードが同じ場合
					if(csvStruct.getl_PASSWORD().equals(csvStruct.getl_USER_CD())){
						_emsg = new ExpjMessage("AA00206");
						csvExport(String.valueOf(i + 1),
								String.valueOf(CSV_PASSWORD + 1),
								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
								csvStruct,
								strPassword,
								_emsg.getMessage(locale));
						_intErrorCount ++;
						continue;
					}
					//新パスワード（暗号化前）の桁数が　システムパラメータ「パスワード最小桁数（PSW_MIN_LENGTH）」の値より少ない場合
					Map chkMap = UserPassWordInputRule.compareMinLength(conn, csvStruct.getl_PASSWORD());
					if("false".equals(String.valueOf(chkMap.get("2")))) {
						_emsg = new ExpjMessage("AA00207", String.valueOf(chkMap.get("1")));
						csvExport(String.valueOf(i + 1),
								String.valueOf(CSV_PASSWORD + 1),
								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
								csvStruct,
								strPassword,
								_emsg.getMessage(locale));
						_intErrorCount ++;
						continue;
					}
					//システムパラメータ「パスワード規則（PSW_RULE）」の値が「1」（英字数字含む）のとき、新パスワードがパスワードに（a-zまたはA-Z）、0-9の両方が含まれていない場合
					if(!UserPassWordInputRule.checkWordRule(conn, csvStruct.getl_PASSWORD())) {
						_emsg = new ExpjMessage("AA00208");
						csvExport(String.valueOf(i + 1),
								String.valueOf(CSV_PASSWORD + 1),
								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
								csvStruct,
								strPassword,
								_emsg.getMessage(locale));
						_intErrorCount ++;
						continue;
					}
									
					// 工場ｺｰﾄﾞ
					String strPlantCd = CoreTools.getRBString("Expj.PLANT_CD",	resource);
					//NULLの場合
					if (CsvInCheck.isNull(csvStruct.getl_PLANT_CD())) {
						_emsg = new ExpjMessage("AA01530", strPlantCd);
						csvExport(String.valueOf(i + 1),
								String.valueOf(CSV_PLANT_CD + 1),
								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
								csvStruct,
								strPlantCd,
								_emsg.getMessage(locale));
						_intErrorCount ++;
						continue;
					}
					// 文字3桁以上の場合
					if (CsvInCheck.strLengthChk(csvStruct.getl_PLANT_CD()) >= 3) {
						_emsg = new ExpjMessage("AA01501");
						csvExport(String.valueOf(i + 1),
								String.valueOf(CSV_PLANT_CD + 1),
								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
								csvStruct,
								strPlantCd,
								_emsg.getMessage(locale));
						_intErrorCount ++;
						continue;
					}
					// 禁則文字が入力されていた場合
					if (CsvInCheck.chkHankaku(csvStruct.getl_PLANT_CD())) {
						_emsg = new ExpjMessage("AA01524");
						csvExport(String.valueOf(i + 1),
								String.valueOf(CSV_PLANT_CD + 1),
								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
								csvStruct,
								strPlantCd,
								_emsg.getMessage(locale));
						_intErrorCount ++;
						continue;
					}
					//部門コード
					String strOrgCd = CoreTools.getRBString("Expj.ORG_CD",	resource);
					if(!CsvInCheck.isNull(csvStruct.getl_SECTION_CD())){
						// 文字26桁以上の場合
						if (CsvInCheck.strLengthChk(csvStruct.getl_SECTION_CD()) >= 26) {
							_emsg = new ExpjMessage("AA01501");
							csvExport(String.valueOf(i + 1),
									String.valueOf(CSV_SECTION_CD + 1),
									String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
									csvStruct,
									strOrgCd,
									_emsg.getMessage(locale));
							_intErrorCount ++;
							continue;
						}
						// 禁則文字が入力されていた場合
						if (CsvInCheck.chkHankaku(csvStruct.getl_SECTION_CD())) {
							_emsg = new ExpjMessage("AA01524");
							csvExport(String.valueOf(i + 1),
									String.valueOf(CSV_SECTION_CD + 1),
									String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
									csvStruct,
									strOrgCd,
									_emsg.getMessage(locale));
							_intErrorCount ++;
							continue;
						}		
					}
					//メールアドレス
					String strEmail = CoreTools.getRBString("Expj.EMAIL",	resource);
					if(!CsvInCheck.isNull(csvStruct.getl_ADDRESS())){
						// 文字41桁以上の場合
						if (CsvInCheck.strLengthChk(csvStruct.getl_ADDRESS()) >= 41) {
							_emsg = new ExpjMessage("AA01501");
							csvExport(String.valueOf(i + 1),
									String.valueOf(CSV_ADDRESS + 1),
									String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
									csvStruct,
									strEmail,
									_emsg.getMessage(locale));
							_intErrorCount ++;
							continue;
						}
						//メールアドレスに入力がある場合、形式が不正の場合
						if (CsvInCheck.chkEmail(csvStruct.getl_ADDRESS())) {
							_emsg = new ExpjMessage("AA00109");
							csvExport(String.valueOf(i + 1),
									String.valueOf(CSV_ADDRESS + 1),
									String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
									csvStruct,
									strEmail,
									_emsg.getMessage(locale));
							_intErrorCount ++;
							continue;
						}
					}
					// 多言語
					String strLocale = CoreTools.getRBString("Expj.LOCALE",	resource);
					//コンボボックス項目
					//コンボボックス用データ取得
					StringTokenizer std;
					int losize = 0;
					String loca = null;
					String[]  lolist = null;
					boolean locale_flg = false;
					if (csvStruct.getl_LOCALE() != null){
						while(losize < LOCALE_TYP.size()){
							lolist = LOCALE_TYP.getData(losize);
							std = new StringTokenizer(lolist[1],":");
							loca = std.nextToken();
							if(csvStruct.getl_LOCALE().equals(loca)){
								locale_flg = true;
								break;
							}
							losize++;
						}
					}					
					if (!locale_flg) {
						_emsg = new ExpjMessage("AA01504");
						csvExport(String.valueOf(i + 1),
								String.valueOf(CSV_LOCALE + 1),
								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
								csvStruct,
								strLocale,
								_emsg.getMessage(locale));
						_intErrorCount++;
						continue;
					}
					//承認権限					
					String strApprPowerTyp = CoreTools.getRBString("Expj.Cmt3161",	resource);					
					//整数以外の場合
					if (!CsvInCheck.isIntegerChk(csvStruct.getl_APPR_POWER_TYP())) {
						_emsg = new ExpjMessage("AA01502");
						csvExport(String.valueOf(i + 1),
								String.valueOf(CSV_APPR_POWER_TYP + 1),
								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
								csvStruct,
								strApprPowerTyp,
								_emsg.getMessage(locale));
						_intErrorCount ++;
						continue;
					}
					//コンボボックス項目
					if (!CsvInCheck.chkValue(APPR_POWER_TYP, csvStruct.getl_APPR_POWER_TYP())) {
						_emsg = new ExpjMessage("AA01504");
						csvExport(String.valueOf(i + 1),
								String.valueOf(CSV_APPR_POWER_TYP + 1),
								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
								csvStruct,
								strApprPowerTyp,
								_emsg.getMessage(locale));
						_intErrorCount++;
						continue;
					}
					//所属部門コード
					String strBelongGroupCd = CoreTools.getRBString("Expj.Cmt5435",	resource);					
					//NULLの場合
					if("1".equals(csvStruct.getw_BELONG_FLG())){
						if (CsvInCheck.isNull(csvStruct.getl_BELONG_GROUP_CD())) {
							_emsg = new ExpjMessage("AA01530", strPlantCd);
							csvExport(String.valueOf(i + 1),
									String.valueOf(CSV_BELONG_GROUP_CD + 1),
									String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
									csvStruct,
									strBelongGroupCd,
									_emsg.getMessage(locale));
							_intErrorCount ++;
							continue;
						}
					}
					if (!CsvInCheck.isNull(csvStruct.getl_BELONG_GROUP_CD())) {						
						// 文字11桁以上の場合
						if (CsvInCheck.strLengthChk(csvStruct.getl_BELONG_GROUP_CD()) >= 11) {
							_emsg = new ExpjMessage("AA01501");
							csvExport(String.valueOf(i + 1),
									String.valueOf(CSV_BELONG_GROUP_CD + 1),
									String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
									csvStruct,
									strBelongGroupCd,
									_emsg.getMessage(locale));
							_intErrorCount ++;
							continue;
						}
						// 禁則文字が入力されていた場合
						if (CsvInCheck.chkHankaku(csvStruct.getl_BELONG_GROUP_CD())) {
							_emsg = new ExpjMessage("AA01524");
							csvExport(String.valueOf(i + 1),
									String.valueOf(CSV_BELONG_GROUP_CD + 1),
									String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
									csvStruct,
									strBelongGroupCd,
									_emsg.getMessage(locale));
							_intErrorCount ++;
							continue;
						}	
					}
					//所属部門コードはNULL以外　がつ　所属フラグは0、1以外の場合
					String strBelongFlg = CoreTools.getRBString("Expj.BELONG_FLG",	resource);
					if(!CsvInCheck.isNull(csvStruct.getl_BELONG_GROUP_CD())){
						if(!"0".equals(csvStruct.getw_BELONG_FLG()) && !"1".equals(csvStruct.getw_BELONG_FLG())){
							_emsg = new ExpjMessage("AA34130");
							csvExport(String.valueOf(i + 1),
									String.valueOf(CSV_BELONG_FLG + 1),
									String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
									csvStruct,
									strBelongFlg,
									_emsg.getMessage(locale));
							_intErrorCount ++;
							continue;
						}
					}
					if ("true".equals(_strRdoInsert)){
						//同一キーがCSV内で重複している場合
						checkFlag = true;
						for (int j = 0; j < csvList.size(); j++) {
	    					tempStruct = (AA0200010Struct) csvList.get(j);
	    					if (csvStruct.getl_USER_CD().equals(tempStruct.getl_USER_CD())
	    							&& getString(csvStruct.getl_BELONG_GROUP_CD()).equals(getString(tempStruct.getl_BELONG_GROUP_CD()))) {
	    						if(j!=i){
	    							_emsg = new ExpjMessage("AA34134", String.valueOf(j+1));
	    							csvExport(
	    									String.valueOf(i + 1),
	    									CSV_COLNO_99,
	    									String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
	    									csvStruct,
	    									strUserCd,
	    									_emsg.getMessage(locale));
	    							checkFlag = false;
	    						}
	    					}
	    				}
	    				if(!checkFlag){
	    					_intErrorCount++;
	    					continue;
	    				}
					}
					//コンボボックス項目(各項目チェックの所に移動する)
					//業務チェック
					//ログインユーザの所属会社コードと[CSV情報].”工場コード” で [工場] に存在しない場合
					if(!entity.mcheckM_PLANT.check(conn, csvStruct)){
						_emsg = new ExpjMessage("AA01012");
						csvExport(String.valueOf(i + 1),
								String.valueOf(CSV_PLANT_CD + 1),
								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
								csvStruct,
								strPlantCd,
								_emsg.getMessage(locale));
						_intErrorCount++;
						continue;
					}
					//ログインユーザの所属会社コードと　[CSV情報].”部門コード” で [部門] に存在しない場合
					if(!CsvInCheck.isNull(csvStruct.getl_SECTION_CD())){
						if(!entity.mcheckM_ORG.check(conn, csvStruct)){
							_emsg = new ExpjMessage("AA20054");
							csvExport(String.valueOf(i + 1),
									String.valueOf(CSV_SECTION_CD + 1),
									String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
									csvStruct,
									strOrgCd,
									_emsg.getMessage(locale));
							_intErrorCount++;
							continue;
						}
					}
					//以下の条件で[会社別業務グループ]を検索し、存在しない場合
					//[会社別業務グループ].”会社コード”　＝　ログインユーザの所属会社コード
					//[業務グループマスタ].”業務グループコード”　＝ [会社別業務グループ].”業務グループコード”
					//[会社別業務グループ].”業務グループコード” ＝ [CSV情報]．“所属部門コード”
					if(!CsvInCheck.isNull(csvStruct.getl_BELONG_GROUP_CD())){
						if(!entity.mcheckCOMPANY_BUSINESS_GROUP.check(conn, csvStruct)){
							_emsg = new ExpjMessage("AA34131");
							csvExport(String.valueOf(i + 1),
									String.valueOf(CSV_BELONG_GROUP_CD + 1),
									String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
									csvStruct,
									strBelongGroupCd,
									_emsg.getMessage(locale));
							_intErrorCount++;
							continue;
						}					
						//[CSV情報]．“所属部門コード”は[パラメータ]から取得した非表示業務グループコードに存在する場合
						for(int j = 0; j < _listNotBusinessGroupCD.size(); j++){
							String strBusinessGroupCD = (String)_listNotBusinessGroupCD.get(j);
							if(strBusinessGroupCD.equals(csvStruct.getl_BELONG_GROUP_CD()))
							{
								_emsg = new ExpjMessage("AA34126");
								csvExport(String.valueOf(i + 1),
										String.valueOf(CSV_BELONG_GROUP_CD + 1),
										String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
										csvStruct,
										strBelongGroupCd,
										_emsg.getMessage(locale));
								_intErrorCount++;
								break_flg = true;
								break;
							}
						}
						if(break_flg){
							continue;
						}
					}					
	                if ("true".equals(_strRdoInsert)){
	                	//[CSV情報]．“利用者コード” がすでに [ユーザマスタ] に存在した がつ　以下の条件で[所属マスタ]を検索し、存在した場合
		                //（更新対象レコードは除く）
	                	if(entity.mcheckUSER_MST.check(conn, csvStruct)){
							_emsg = new ExpjMessage("ZZ01102");
							csvExport(String.valueOf(i + 1),
									CSV_COLNO_99,
									String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
									csvStruct,
									strUserCd,
									_emsg.getMessage(locale));
							_intErrorCount++;
							continue;
	                	}
	                	if(!CsvInCheck.isNull(csvStruct.getl_BELONG_GROUP_CD()) && "1".equals(csvStruct.getw_BELONG_FLG())){
	                		if(entity.mcheckBELONG_MST.check(conn, csvStruct)){
								_emsg = new ExpjMessage("ZZ01102");
								csvExport(String.valueOf(i + 1),
										CSV_COLNO_99,
										String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
										csvStruct,
										strUserCd,
										_emsg.getMessage(locale));
								_intErrorCount++;
								continue;
		                	}
	                	}
	                }	                
	                //更新の場合
	                if("true".equals(_strRdoUpdate)){
	                	//[CSV情報]．“利用者コード”が未登録の場合
	                	if(!entity.mcheckUSER_MST.check(conn, csvStruct)){
							_emsg = new ExpjMessage("ZZ06001");
							csvExport(String.valueOf(i + 1),
									CSV_COLNO_99,
									String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
									csvStruct,
									strUserCd,
									_emsg.getMessage(locale));
							_intErrorCount++;
							continue;
						}
	                }	                
				}
				// 削除の場合
				if ("true".equalsIgnoreCase(_strRdoDelete)) {
				    //同一キーがCSV内で重複している場合
					checkFlag = true;
					for (int j = 0; j < csvList.size(); j++) {
    					tempStruct = (AA0200010Struct) csvList.get(j);
    					if (csvStruct.getl_USER_CD().equals(tempStruct.getl_USER_CD())) {
    						if(j!=i){
    							_emsg = new ExpjMessage("AA34134", String.valueOf(j+1));
    							csvExport(
    									String.valueOf(i + 1),
    									CSV_COLNO_99,
    									String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
    									csvStruct,
    									strUserCd,
    									_emsg.getMessage(locale));
    							checkFlag = false;
    						}
    					}
    				}
    				if(!checkFlag){
    					_intErrorCount++;
    					continue;
    				}
					//「利用者コード」 が未登録の場合
					if(!entity.mcheckUSER_MST.check(conn, csvStruct)){
						_emsg = new ExpjMessage("ZZ06001");
						csvExport(String.valueOf(i + 1),
								CSV_COLNO_99,
								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
								csvStruct,
								strUserCd,
								_emsg.getMessage(locale));
						_intErrorCount++;
						continue;
					}
					//「利用者コード」が[得意先マスタ]の「自社担当者コード」に存在した場合
					if(entity.mcheckM_CUST.check(conn, csvStruct)){
						_emsg = new ExpjMessage("AA01017");
						csvExport(String.valueOf(i + 1),
								String.valueOf(CSV_USER_CD + 1),
								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
								csvStruct,
								strUserCd,
								_emsg.getMessage(locale));
						_intErrorCount++;
						continue;
					}
					//「利用者コード」が[得意先支店]の「自社担当者コード」に存在した場合
					if(entity.mcheckM_CUST_BRANCH.check(conn, csvStruct)){
						_emsg = new ExpjMessage("KA10004");
						csvExport(String.valueOf(i + 1),
								String.valueOf(CSV_USER_CD + 1),
								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
								csvStruct,
								strUserCd,
								_emsg.getMessage(locale));
						_intErrorCount++;
						continue;
					}
				}
			}
			_intSuccessCount = _intTotalCount - _intErrorCount - _intWarningCount;
			if (_intErrorCount > 0) {
				return false;
			} else {
				return true;
			}
		} catch (Exception e) {
			ExpjMessage emsg = new ExpjMessage("AH00042", "0", "0");
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;
		}
	}
	/** 
     * ＣＳＶ出力データ設定準備(訂正ログ)
     *
     * @param target_struct 対象データ情報
     * @param SyoriKbn      処理区分
     * @param DataKbn       変更データ区分
     * @param bWrite        
     * @return 異常なし true エラー false
     */ 
    private boolean csvExportCorrection( AA0200010Struct target_struct , String SyoriKbn,
    		String DataKbn ,boolean bWrite)
    {
        // CSVファイル編集用
        String csvStr = "";
        BufferedWriter outStream = null;

        try {
            // 処理日時
            csvStr = '"' + _strSysdate + '"' + "," ;
            // 処理ユーザーＩＤ
            csvStr = csvStr + '"' + getsysUSER_CD() + '"' + "," ;
            // 処理区分
            csvStr = csvStr + '"' + SyoriKbn + '"' + "," ;
            // 変更データ区分
            csvStr = csvStr + '"' + DataKbn + '"' + "," ;
            // 利用者コード
            csvStr = csvStr + '"' + getString(target_struct.getl_USER_CD()) + '"' + "," ;
            // 利用者
            csvStr = csvStr + '"' + getString(target_struct.getl_USER_NAME()) + '"' + "," ;
            // パスワード
            csvStr = csvStr + '"' + getString(target_struct.getl_PASSWORD()) + '"' + "," ;
            // 工場コード
            csvStr = csvStr + '"' + getString(target_struct.getl_PLANT_CD()) + '"' + "," ;
            // 部門コード
            csvStr = csvStr + '"' + getString(target_struct.getl_SECTION_CD()) + '"' + "," ;
            //多言語
            csvStr = csvStr + '"' + getString(target_struct.getl_LOCALE()) + '"' + "," ;
            //メールアドレス
            csvStr = csvStr + '"' + getString(target_struct.getl_ADDRESS()) + '"' + "," ;
            //承認権限
            csvStr = csvStr + '"' + getString(target_struct.getl_APPR_POWER_TYP()) + '"' + "," ;
            //所属部門コード
            csvStr = csvStr + '"' + getString(target_struct.getl_BELONG_GROUP_CD()) + '"' + "," ;
            //所属フラグ
            csvStr = csvStr + '"' + getString(target_struct.getw_BELONG_FLG()) + '"';
            
            if (bWrite) {
            	outStream = new BufferedWriter(new FileWriter(struct.getCANCEL_FILE(),true));
            } else {
            	outStream = new BufferedWriter(new FileWriter(struct.getCANCEL_FILE(),false));
            }
            // ファイルに書込
            outStream.write(csvStr);
            // 改行コード付加
            outStream.newLine();
            // BufferedWriterクローズ
            outStream.close();
            // 処理フラグセット(true:成功)
        	return true;
        }catch(Exception e){
            ExpjMessage emsg = new ExpjMessage( "AH00042", "0", "0" );
            sysLog.severe(emsg, getsysUSER_CD());
            return false;
        }finally{
            if (outStream != null ) {
                try {
                    outStream.close();
                } catch (Exception e ) {
                    e.printStackTrace();
                }
              outStream = null;
             }
        }
    }
	/**
	 * CSVフェイル内容は、登録処理
	 * @param csvList
	 * @return
	 * @throws FoundationException 
	 */
	private boolean csvDataToDb(List csvList) throws BusinessProcessException, FoundationException {
		int intCsvDataCount = 0; // 対象データ件数
		boolean bWrite = false; // 書くファイル
		// ログ出力情報格納用
		String logMessage = "";
		AA0200010Struct structCsv = null;
		boolean bSuccess = false; // 処理成功フラグ初期化
		boolean bDBUpdate = false; // DB更新中フラグ初期化

		try {
			// トランザクション開始
			conn.beginTransWeb();
			// DB更新中フラグON
			bDBUpdate = true;

			// システム日付取得
            beginTransaction();
			
			_strSysdate = struct.getsSysdate();

			// データ数分処理を繰り返す
			intCsvDataCount = csvList.size();
			//  親画面のラジオボタンが1:登録の場合の処理
			if ("true".equals(_strRdoInsert)) {
				for (int i = 0; i < intCsvDataCount; i++) {
					structCsv = (AA0200010Struct) csvList.get(i);
					AA0200010Struct csvExportStruct = new AA0200010Struct();
					csvExportStruct.setl_USER_CD(structCsv.getl_USER_CD()) ;
					csvExportStruct.setl_USER_NAME(structCsv.getl_USER_NAME()) ;
					csvExportStruct.setl_PASSWORD(structCsv.getl_PASSWORD()) ;
					csvExportStruct.setl_PLANT_CD(structCsv.getl_PLANT_CD()) ;
					csvExportStruct.setl_SECTION_CD(structCsv.getl_SECTION_CD()) ;
					csvExportStruct.setl_LOCALE(structCsv.getl_LOCALE()) ;
					csvExportStruct.setl_ADDRESS(structCsv.getl_ADDRESS()) ;
					csvExportStruct.setl_APPR_POWER_TYP(structCsv.getl_APPR_POWER_TYP());
					csvExportStruct.setl_BELONG_GROUP_CD(structCsv.getl_BELONG_GROUP_CD()) ;
					csvExportStruct.setw_BELONG_FLG(structCsv.getw_BELONG_FLG()) ;
					// 業務運用日を読み
					String businessDate = readBUSINESS_OPR_DATE(structCsv.getl_PLANT_CD());
					structCsv.setl_PASSWORD_CHG_DATE(businessDate);
					structCsv.setsUser_ID(sysUSER_CD);	
					structCsv.setl_PASSWORD(XafTools.getCryptString(structCsv.getl_PASSWORD()));					
					// 既存に登録しない場合、[利用者情報]を登録する
					if (!entity.mcheckUSER_MST.check(conn, structCsv)) {
						entity.minsertUSER_MST.create(conn, structCsv);
					}
					//所属フラグが1の場合、所属マスタに登録
					if("1".equals(structCsv.getw_BELONG_FLG())){
						entity.minsertBELONG_MST.create(conn, structCsv);
					}
					// 訂正CSV出力処理(引数:対象データ、ユーザーID、処理区分、変更データ区分)
					csvExportCorrection(csvExportStruct, "1", "2", bWrite);
					bWrite = true;
				}
			}
			// 親画面のラジオボタンが2:変更の場合の処理
			if ("true".equals(_strRdoUpdate)) {
				for (int i = 0; i < intCsvDataCount; i++) {
					structCsv = (AA0200010Struct) csvList.get(i);	
					AA0200010Struct csvExportStruct = new AA0200010Struct();
					csvExportStruct.setl_USER_CD(structCsv.getl_USER_CD()) ;
					csvExportStruct.setl_USER_NAME(structCsv.getl_USER_NAME()) ;
					csvExportStruct.setl_PASSWORD(structCsv.getl_PASSWORD()) ;
					csvExportStruct.setl_PLANT_CD(structCsv.getl_PLANT_CD()) ;
					csvExportStruct.setl_SECTION_CD(structCsv.getl_SECTION_CD()) ;
					csvExportStruct.setl_LOCALE(structCsv.getl_LOCALE()) ;
					csvExportStruct.setl_ADDRESS(structCsv.getl_ADDRESS()) ;
					csvExportStruct.setl_APPR_POWER_TYP(structCsv.getl_APPR_POWER_TYP());
					csvExportStruct.setl_BELONG_GROUP_CD(structCsv.getl_BELONG_GROUP_CD()) ;
					csvExportStruct.setw_BELONG_FLG(structCsv.getw_BELONG_FLG()) ;
					// [利用者情報]取得
					List mSourceList = entity.mselectUSER_MST.read(conn, structCsv);
					if (!mSourceList.isEmpty()) {
						AA0200010Struct target_struct = (AA0200010Struct)mSourceList.get(0);
						AA0200010Struct belongStruct = new AA0200010Struct();
						
						belongStruct.setl_USER_CD(structCsv.getl_USER_CD());
						belongStruct.setl_BELONG_GROUP_CD(structCsv.getl_BELONG_GROUP_CD());
						List mBlongList = entity.mselectBELONG_MST.read(conn, belongStruct);
						if(!mBlongList.isEmpty()){
							target_struct.setw_BELONG_FLG("1");
						}else{
							target_struct.setw_BELONG_FLG("0");
						}
						target_struct.setl_BELONG_GROUP_CD(structCsv.getl_BELONG_GROUP_CD());
						//パスワードの設定
						target_struct.setl_PASSWORD("********************************");
						// 訂正CSV出力処理(引数:対象行、対象データ、ユーザーID、処理区分、データ区分)
						csvExportCorrection(target_struct, "2", "1", bWrite);
						bWrite = true;
					}
					// 業務運用日を読み
					String businessDate = readBUSINESS_OPR_DATE(structCsv.getl_PLANT_CD());
					structCsv.setl_PASSWORD_CHG_DATE(businessDate);
					structCsv.setsUser_ID(sysUSER_CD);			
					structCsv.setl_PASSWORD(XafTools.getCryptString(structCsv.getl_PASSWORD()));
					// [利用者情報]の更新
					entity.mupdateUSER_MST.update(conn, structCsv);
					if("0".equals(structCsv.getw_BELONG_FLG()) && entity.mcheckBELONG_MST.check(conn, structCsv)){
						//[所属マスタ]削除
						entity.mdeleteBELONG_MST.delete(conn, structCsv);
					}
					if("1".equals(structCsv.getw_BELONG_FLG()) && !entity.mcheckBELONG_MST.check(conn, structCsv)){
						//[所属マスタ]新規
						entity.minsertBELONG_MST.create(conn, structCsv);
					}
					// 訂正CSV出力処理(引数:対象データ、ユーザーID、処理区分、変更データ区分)
					csvExportCorrection(csvExportStruct, "2", "2", bWrite);
					bWrite = true;
				}
			}
			// 親画面のラジオボタンが3:削除の場合の処理
			if ("true".equals(_strRdoDelete)) {
				for (int i = 0; i < intCsvDataCount; i++) {
					structCsv = (AA0200010Struct) csvList.get(i);					
					// [利用者情報]取得
					List mSourceList = entity.mselectUSER_MST.read(conn, structCsv);
					if (!mSourceList.isEmpty()) {
						AA0200010Struct target_struct = (AA0200010Struct)mSourceList.get(0);
						AA0200010Struct belongStruct = new AA0200010Struct();
						
						belongStruct.setl_USER_CD(structCsv.getl_USER_CD());
						belongStruct.setl_BELONG_GROUP_CD(structCsv.getl_BELONG_GROUP_CD());
						List mBlongList = entity.mselectBELONG_MST.read(conn, belongStruct);
						if(!mBlongList.isEmpty()){
							target_struct.setw_BELONG_FLG("1");
						}else{
							target_struct.setw_BELONG_FLG("0");
						}
						// 訂正CSV出力処理(引数:対象行、対象データ、ユーザーID、処理区分、データ区分)
						target_struct.setl_BELONG_GROUP_CD(structCsv.getl_BELONG_GROUP_CD());
						//パスワードの設定
						target_struct.setl_PASSWORD("********************************");
						csvExportCorrection(target_struct, "3", "1", bWrite);
						bWrite = true;
					}			
					// [所属マスタ]の削除
					entity.mdeleteBELONG_MST.delete(conn, structCsv);
					//[利用者情報]の削除
					entity.mdeleteUSER_MST.delete(conn, structCsv);
				}
			}
			conn.commit();
			
			// DB更新中フラグOFF
			bDBUpdate = false;

			// 処理成功フラグ設定
			bSuccess = true;
		} catch (SQLException e) {
			logMessage = "USER_MST.USER_CD:" + structCsv.getl_USER_CD();
			ExpjMessage emsg = new ExpjMessage("ZZ01006", logMessage);
			sysLog.severe(emsg, getsysUSER_CD());
			setSqlExceptionMsg(e);
		} finally {
			// DB更新処理中に何らかのエラーが発生した場合はroolbackをおこなう
			if (bDBUpdate == true) {
				// ロールバック
				conn.rollback();
				logMessage = "Control：csvDataToDb - rollback!! ";
				setSyslogConfig(logMessage);
				// 更新失敗のメッセージ表示
				ExpjMessage emsg = new ExpjMessage("AH00042", "" + intCsvDataCount, "0", "0");
				msgStruct.addError(emsg);
				sysLog.warning(emsg, getsysUSER_CD());
			}
		}
		return bSuccess;
	}
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * CSV取込ボタン押下時に実行される処理です。
	 *
	 */
	public void controlCsvImport() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0200");
		logger.entering("AA0200010Control"+":USER="+struct.getsUser_ID(),"controlCsvImport");
			//{{user_implement_dev:<controlCsvImport>
			// TODO: ユーザ定義のコードを記述してください
		setList(null);
		// 親画面のstructを退避
		_strRdoInsert = struct.getrdoInsert();
		_strRdoUpdate = struct.getrdoUpdate();
		_strRdoDelete = struct.getrdoDelete();
		_strDoChk = struct.getDO_CHK();
                //}}user_implement_dev:<controlCsvImport>
		logger.exiting("AA0200010Control"+":USER="+struct.getsUser_ID(),"controlCsvImport");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0200");
		logger.entering("AA0200010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
			// TODO: ユーザ定義のコードを記述してください
		this.struct.clear();
		this.struct.setrdoInsert("true");
		this.struct.setrdoUpdate("false");
		this.struct.setrdoDelete("false");
		this.struct.setDO_CHK("false");

		setReadStatus(INITIAL);
                //}}user_implement_dev:<controlClear>
		logger.exiting("AA0200010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * 閉じるボタン押下時に実行される処理です。
	 *
	 */
	public void controlClose() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0200");
		logger.entering("AA0200010Control"+":USER="+struct.getsUser_ID(),"controlClose");
			//{{user_implement_dev:<controlClose>
			// TODO: ユーザ定義のコードを記述してください
		controlClear();
                //}}user_implement_dev:<controlClose>
		logger.exiting("AA0200010Control"+":USER="+struct.getsUser_ID(),"controlClose");

		return;
	}

	/**
	 * 参照ボタン押下時に実行される処理です。
	 *
	 */
	public void controlBrowse() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0200");
		logger.entering("AA0200010Control"+":USER="+struct.getsUser_ID(),"controlBrowse");
			//{{user_implement_dev:<controlBrowse>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlBrowse>
		logger.exiting("AA0200010Control"+":USER="+struct.getsUser_ID(),"controlBrowse");

		return;
	}

	/**
	 * 取込ボタン押下時に実行される処理です。
	 *
	 */
	public void controlCsvIn() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0200");
		logger.entering("AA0200010Control"+":USER="+struct.getsUser_ID(),"controlCsvIn");
			//{{user_implement_dev:<controlCsvIn>
			// TODO: ユーザ定義のコードを記述してください
		// 全部レコード数
		_intTotalCount = 0; 
		// エラーレコード件数
		_intErrorCount = 0;  
		// 正常レコード件数
		_intSuccessCount = 0;
		// ワーニング件数
		_intWarningCount = 0;
		// 画面表示用リストクリア
		if (list == null) {
			list = new ArrayList();
		} else {
			list.clear();
		}
		
		// ＣＳＶデータ取得
		List listCsv = null;
		listCsv = readCsvData();
		
		if (listCsv != null) {
			if (!"true".equals(this._strDoChk)) {
				if (!chkOutputFilePath()) {
					return;
				}
			}
			// CSVデータチェック
			boolean checkFlg = checkCsvData(listCsv);
			// 「チェックのみ行う」にチェックがある場合
			if ("true".equals(this._strDoChk)) {
				setInfoMessage("AA01517", String.valueOf(_intSuccessCount), String.valueOf(_intWarningCount), String.valueOf(_intErrorCount));
			} else {
				// ＣＳＶ項目のチェックと整合性チェックと登録前チェックを行う
				if (checkFlg) {
					// 登録処理
					if (csvDataToDb(listCsv)) {
						// エラー・ワーニングがない場合
						if (_intWarningCount == 0) {
							setInfoMessage("AA01514", String.valueOf(_intSuccessCount));
						} else {
							// ワーニングだけがある場合
							setWarningMessage("AA01515", String.valueOf(_intSuccessCount), String.valueOf(_intWarningCount));
						}
					}
				} else {
					// エラーがある場合
					setErrorMessage("AA01516", String.valueOf(_intSuccessCount), String.valueOf(_intWarningCount), String.valueOf(_intErrorCount));
				}
			}
			
		}
            
                //}}user_implement_dev:<controlCsvIn>
		logger.exiting("AA0200010Control"+":USER="+struct.getsUser_ID(),"controlCsvIn");

		return;
	}

	/**
	 * CSV出力ボタン押下時に実行される処理です。
	 *
	 */
	public void controlCSVOut() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0200");
		logger.entering("AA0200010Control"+":USER="+struct.getsUser_ID(),"controlCSVOut");
			//{{user_implement_dev:<controlCSVOut>
			// TODO: ユーザ定義のコードを記述してください
		// CSV出力部品を設定
		csvWriter = new CsvWriter(CsvWriter.getFileName(getsysUSER_CD()));
		AA0200010Struct errorStruct = null;
		List csv = new ArrayList();	// CSV情報
		// CSVヘッダ行をCSV情報に追加
		String[] title = {
				 "Expj.Cmt3094"					// エラー箇所
				,"Expj.Cmt3095"					// エラー区分
				,"Expj.AR_USER_CD"              // 利用者コード
				,"Expj.Cmt3097"					// エラー項目名
				,"Expj.Cmt3098"					// エラー内容
				};

		csv.add(title);
		// [画面].一覧部のエラー情報をCSV情報に追加
		for (int i = 0; i < list.size(); i++) {
			errorStruct = (AA0200010Struct)list.get(i);
			String[] data = {
					 errorStruct.getl_ERROR_IN()
					,errorStruct.getl_ERR_TYP()
					,errorStruct.geto_USER_CD()
					,errorStruct.getl_ERR_CTR_NM()
					,errorStruct.getl_ERR_INFO()						
			};
			csv.add(data);
		}

		try {
			// CSVファイルを作成
			csvWriter.write(csv, CoreTools.getLocale(struct.getsUser_ID()), true);
			// CSVファイルをクライアントに出力
			struct.setDOWNLOAD_FILE(getCsvWriter().getFilePath());
		}catch(Exception e) {
			// CSV出力失敗
			ExpjMessage emsg = new ExpjMessage("ZZ01107");
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;
		} 	
                //}}user_implement_dev:<controlCSVOut>
		logger.exiting("AA0200010Control"+":USER="+struct.getsUser_ID(),"controlCSVOut");

		return;
	}

	/**
	 * 戻るボタン押下時に実行される処理です。
	 *
	 */
	public void controlreturn_sub1() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0200");
		logger.entering("AA0200010Control"+":USER="+struct.getsUser_ID(),"controlreturn_sub1");
			//{{user_implement_dev:<controlreturn_sub1>
			// TODO: ユーザ定義のコードを記述してください
		controlClear();
                //}}user_implement_dev:<controlreturn_sub1>
		logger.exiting("AA0200010Control"+":USER="+struct.getsUser_ID(),"controlreturn_sub1");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0200");
		logger.entering("AA0200010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AA0200010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0200");
		logger.entering("AA0200010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
			// TODO: ユーザ定義のコードを記述してください
		try {
			// テーブル用業務グループデータリストの初期化
			if(_listNotBusinessGroupCD != null)
			{
				_listNotBusinessGroupCD.clear();
			}
			else
			{
				_listNotBusinessGroupCD = new ArrayList(0);
			}

			// 会社コード取得
			List tempList = entity.mselectCOMPANY_CD.read(conn, struct);
			if (tempList.size() > 0) {
				_strCompany_cd = ((AA0200010Struct) tempList.get(0)).getl_COMPANY_CD();
			}
						
			// コンボボックスデータを取得
			ComboBox cb = new ComboBox(conn, sysUSER_CD);

			// エラー状態区分をセット
			_COM_ERR_TYP = cb.getData("ERR_TYP");

			// 承認権限
			APPR_POWER_TYP = cb.getData("APPR_POWER_TYP");

			// 多言語
			LOCALE_TYP = cb.getData("LOCALE");
			
			// 非表示業務グループ情報取得
			PrivateConfig privateConfig = new PrivateConfig(conn);
			_listNotBusinessGroupCD = privateConfig.getStrings(_DISABLE_BUSINESS_GROUP_ACCESS_KEY);

		} catch(SQLException e) {
			e.printStackTrace();
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());//致命的エラー エラー内容
			ExpjException ee = new ExpjException(e, emsg); // エクセプションを生成
			throw ee;
		} catch(ExpjException e) {
			throw e;
		} catch(Exception e) {
			e.printStackTrace();
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());//致命的エラー エラー内容
			ExpjException ee = new ExpjException(e, emsg); // エクセプションを生成
			throw ee;
		} 
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AA0200010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * イベントハンドラの前処理です。
	 *
	 * @param buttun ボタン名
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0200");
		logger.entering("AA0200010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");
		struct.setDOWNLOAD_FILE((String)null);	// ダウンロードファイル名クリア

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
		logger.exiting("AA0200010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			if( button.equals("CsvImport") ) {
				controlCsvImport();
			} else if( button.equals("Clear") ) {
				controlClear();
			} else if( button.equals("Close") ) {
				controlClose();
			} else if( button.equals("Browse") ) {
				controlBrowse();
			} else if( button.equals("CsvIn") ) {
				controlCsvIn();
			} else if( button.equals("CSVOut") ) {
				controlCSVOut();
			} else if( button.equals("return_sub1") ) {
				controlreturn_sub1();
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
//			throw new FoundationException("AA0200010Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AA0200010-E999","CSVの出力処理"));
			throw new FoundationException("AA0200010Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AA0200010-E999","システム日付の取得処理"));
				throw new FoundationException("AA0200010Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AA0200010-E999","コントロールのイベント処理"));
			throw new FoundationException("AA0200010Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected AA0200010Entity entity;
	protected AA0200010Struct struct;
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

		entity = new AA0200010Entity();
		struct = new AA0200010Struct();

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
	 * AA0200010クラスの標準コンストラクタ
	 */
	public AA0200010Control() throws BusinessProcessException, FoundationException
	{
		initialize();

		//conn = connect();
		//{{user_implement_code_constractor
			// TODO: ここに初期処理を記述してください
		try {
			ResourceBundle bundle = SystemConfig.getBundle();
			dbUID = SystemConfig.getProperty("CONNECT_DBUSER", bundle);
			dbPWD = SystemConfig.getProperty("CONNECT_DBPASS", bundle);
			dbDBQ = SystemConfig.getProperty("CONNECT_DBHOST", bundle);
			dbKIND = SystemConfig.getProperty("CONNECT_KIND", bundle);
		} catch(MissingResourceException e) {
			e.printStackTrace();
		}
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
				AA0200010Struct key = (AA0200010Struct)keyList.get(j);
				// メッセージキーを作成する
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("rdoInsert") && key.getrdoInsert() != null) {
					msgKey.setKeyValue("rdoInsert", key.getrdoInsert());
				}
				if(msgKeyType.containsKeyColumn("rdoUpdate") && key.getrdoUpdate() != null) {
					msgKey.setKeyValue("rdoUpdate", key.getrdoUpdate());
				}
				if(msgKeyType.containsKeyColumn("rdoDelete") && key.getrdoDelete() != null) {
					msgKey.setKeyValue("rdoDelete", key.getrdoDelete());
				}
				if(msgKeyType.containsKeyColumn("DO_CHK") && key.getDO_CHK() != null) {
					msgKey.setKeyValue("DO_CHK", key.getDO_CHK());
				}
				if(msgKeyType.containsKeyColumn("FileName") && key.getFileName() != null) {
					msgKey.setKeyValue("FileName", key.getFileName());
				}
				if(msgKeyType.containsKeyColumn("CANCEL_FILE") && key.getCANCEL_FILE() != null) {
					msgKey.setKeyValue("CANCEL_FILE", key.getCANCEL_FILE());
				}
				if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE") && key.getDOWNLOAD_FILE() != null) {
					msgKey.setKeyValue("DOWNLOAD_FILE", key.getDOWNLOAD_FILE());
				}
				if(msgKeyType.containsKeyColumn("l_ERROR_IN") && key.getl_ERROR_IN() != null) {
					msgKey.setKeyValue("l_ERROR_IN", key.getl_ERROR_IN());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_TYP") && key.getl_ERR_TYP() != null) {
					msgKey.setKeyValue("l_ERR_TYP", key.getl_ERR_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_CTR_NM") && key.getl_ERR_CTR_NM() != null) {
					msgKey.setKeyValue("l_ERR_CTR_NM", key.getl_ERR_CTR_NM());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_INFO") && key.getl_ERR_INFO() != null) {
					msgKey.setKeyValue("l_ERR_INFO", key.getl_ERR_INFO());
				}
				if(msgKeyType.containsKeyColumn("w_COLUMN_FLG") && key.getw_COLUMN_FLG() != null) {
					msgKey.setKeyValue("w_COLUMN_FLG", key.getw_COLUMN_FLG());
				}
				if(msgKeyType.containsKeyColumn("w_BELONG_FLG") && key.getw_BELONG_FLG() != null) {
					msgKey.setKeyValue("w_BELONG_FLG", key.getw_BELONG_FLG());
				}
				if(msgKeyType.containsKeyColumn("o_USER_CD") && key.geto_USER_CD() != null) {
					msgKey.setKeyValue("o_USER_CD", key.geto_USER_CD());
				}
				if(msgKeyType.containsKeyColumn("l_USER_CD") && key.getl_USER_CD() != null) {
					msgKey.setKeyValue("l_USER_CD", key.getl_USER_CD());
				}
				if(msgKeyType.containsKeyColumn("l_USER_NAME") && key.getl_USER_NAME() != null) {
					msgKey.setKeyValue("l_USER_NAME", key.getl_USER_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_PASSWORD") && key.getl_PASSWORD() != null) {
					msgKey.setKeyValue("l_PASSWORD", key.getl_PASSWORD());
				}
				if(msgKeyType.containsKeyColumn("l_COMPANY_CD") && key.getl_COMPANY_CD() != null) {
					msgKey.setKeyValue("l_COMPANY_CD", key.getl_COMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("l_PLANT_CD") && key.getl_PLANT_CD() != null) {
					msgKey.setKeyValue("l_PLANT_CD", key.getl_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("l_SECTION_CD") && key.getl_SECTION_CD() != null) {
					msgKey.setKeyValue("l_SECTION_CD", key.getl_SECTION_CD());
				}
				if(msgKeyType.containsKeyColumn("l_LOCALE") && key.getl_LOCALE() != null) {
					msgKey.setKeyValue("l_LOCALE", key.getl_LOCALE());
				}
				if(msgKeyType.containsKeyColumn("l_ADDRESS") && key.getl_ADDRESS() != null) {
					msgKey.setKeyValue("l_ADDRESS", key.getl_ADDRESS());
				}
				if(msgKeyType.containsKeyColumn("l_APPR_POWER_TYP") && key.getl_APPR_POWER_TYP() != null) {
					msgKey.setKeyValue("l_APPR_POWER_TYP", key.getl_APPR_POWER_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_PASSWORD_CHG_DATE") && key.getl_PASSWORD_CHG_DATE() != null) {
					msgKey.setKeyValue("l_PASSWORD_CHG_DATE", key.getl_PASSWORD_CHG_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_BELONG_GROUP_CD") && key.getl_BELONG_GROUP_CD() != null) {
					msgKey.setKeyValue("l_BELONG_GROUP_CD", key.getl_BELONG_GROUP_CD());
				}
				if(msgKeyType.containsKeyColumn("l_BUSINESS_OPR_DATE") && key.getl_BUSINESS_OPR_DATE() != null) {
					msgKey.setKeyValue("l_BUSINESS_OPR_DATE", key.getl_BUSINESS_OPR_DATE());
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
					AA0200010Struct key = new AA0200010Struct();
					if(msgKeyType.containsKeyColumn("rdoInsert")) {
						key.setrdoInsert(msgKey.getKeyValue("rdoInsert"));
					}
					if(msgKeyType.containsKeyColumn("rdoUpdate")) {
						key.setrdoUpdate(msgKey.getKeyValue("rdoUpdate"));
					}
					if(msgKeyType.containsKeyColumn("rdoDelete")) {
						key.setrdoDelete(msgKey.getKeyValue("rdoDelete"));
					}
					if(msgKeyType.containsKeyColumn("DO_CHK")) {
						key.setDO_CHK(msgKey.getKeyValue("DO_CHK"));
					}
					if(msgKeyType.containsKeyColumn("FileName")) {
						key.setFileName(msgKey.getKeyValue("FileName"));
					}
					if(msgKeyType.containsKeyColumn("CANCEL_FILE")) {
						key.setCANCEL_FILE(msgKey.getKeyValue("CANCEL_FILE"));
					}
					if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE")) {
						key.setDOWNLOAD_FILE(msgKey.getKeyValue("DOWNLOAD_FILE"));
					}
					if(msgKeyType.containsKeyColumn("l_ERROR_IN")) {
						key.setl_ERROR_IN(msgKey.getKeyValue("l_ERROR_IN"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_TYP")) {
						key.setl_ERR_TYP(msgKey.getKeyValue("l_ERR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_CTR_NM")) {
						key.setl_ERR_CTR_NM(msgKey.getKeyValue("l_ERR_CTR_NM"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_INFO")) {
						key.setl_ERR_INFO(msgKey.getKeyValue("l_ERR_INFO"));
					}
					if(msgKeyType.containsKeyColumn("w_COLUMN_FLG")) {
						key.setw_COLUMN_FLG(msgKey.getKeyValue("w_COLUMN_FLG"));
					}
					if(msgKeyType.containsKeyColumn("w_BELONG_FLG")) {
						key.setw_BELONG_FLG(msgKey.getKeyValue("w_BELONG_FLG"));
					}
					if(msgKeyType.containsKeyColumn("o_USER_CD")) {
						key.seto_USER_CD(msgKey.getKeyValue("o_USER_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_USER_CD")) {
						key.setl_USER_CD(msgKey.getKeyValue("l_USER_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_USER_NAME")) {
						key.setl_USER_NAME(msgKey.getKeyValue("l_USER_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_PASSWORD")) {
						key.setl_PASSWORD(msgKey.getKeyValue("l_PASSWORD"));
					}
					if(msgKeyType.containsKeyColumn("l_COMPANY_CD")) {
						key.setl_COMPANY_CD(msgKey.getKeyValue("l_COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_PLANT_CD")) {
						key.setl_PLANT_CD(msgKey.getKeyValue("l_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_SECTION_CD")) {
						key.setl_SECTION_CD(msgKey.getKeyValue("l_SECTION_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_LOCALE")) {
						key.setl_LOCALE(msgKey.getKeyValue("l_LOCALE"));
					}
					if(msgKeyType.containsKeyColumn("l_ADDRESS")) {
						key.setl_ADDRESS(msgKey.getKeyValue("l_ADDRESS"));
					}
					if(msgKeyType.containsKeyColumn("l_APPR_POWER_TYP")) {
						key.setl_APPR_POWER_TYP(msgKey.getKeyValue("l_APPR_POWER_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_PASSWORD_CHG_DATE")) {
						key.setl_PASSWORD_CHG_DATE(msgKey.getKeyValue("l_PASSWORD_CHG_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_BELONG_GROUP_CD")) {
						key.setl_BELONG_GROUP_CD(msgKey.getKeyValue("l_BELONG_GROUP_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_BUSINESS_OPR_DATE")) {
						key.setl_BUSINESS_OPR_DATE(msgKey.getKeyValue("l_BUSINESS_OPR_DATE"));
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
