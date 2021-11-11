/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AA0210/src/com/nec/jp/orteus/metamorBase/AA0210/AA0210010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AA0210;

import com.nec.jp.orteus.metamorBase.AA0210.*;
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
//}}user_implement_code_import

//{{user_implement_code_header
/**
 * CLASS     : AA0210010Control クラス
 * ファイル・クラス説明
 * @author $Author: xl-hs-zzw $
 * @version $Revision: 1.1 $ $Date: 2015/10/22 07:15:52 $
 *
 */
//}}user_implement_code_header

public class AA0210010Control
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
	public AA0210010Struct getListvalue(int x) { return (AA0210010Struct)(this.list.get(x)); }	// リストの値を返します。
	public AA0210010Struct getStruct() { return this.struct; }	// Structの値を返します。
	public AA0210010Struct createStruct() { return new AA0210010Struct(); }	// 新しいStructを作って返します。
	public void setStruct(Object structname) { this.struct.setStruct((AA0210010Struct)structname); }	// Structをセットします。
	public void initializeStruct() { this.struct.initialize(); }	// Structの値を初期化します。

	// CSV出力用リスト
	private CsvWriter _csvWriter = null;
	public CsvWriter getCsvWriter(){ return this._csvWriter; }

	private CsvReader _csvReader = null;
	public void setCsvReader(CsvReader cr){ this._csvReader = cr; }

	// 拡張子
    private final String EXTENSION_CSV = "csv";

	// ＣＳＶ項目番号定義
    private final int CSV_COLNO_VEND_CD = 0;
    private final int CSV_COLNO_VEND_NAME = 1;
    private final int CSV_COLNO_VEND_ANAME = 2;
    private final int CSV_COLNO_VEND_KNAME = 3;
    private final int CSV_COLNO_ZIP_CD = 4;
    private final int CSV_COLNO_ADDRESS_1 = 5;
    private final int CSV_COLNO_ADDRESS_2 = 6;
    private final int CSV_COLNO_ADDRESS_K_1 = 7;
    private final int CSV_COLNO_ADDRESS_K_2 = 8;
    private final int CSV_COLNO_TEL = 9;
    private final int CSV_COLNO_FAX = 10;
    private final int CSV_COLNO_EMAIL = 11;
    private final int CSV_COLNO_VEND_ORG = 12;
    private final int CSV_COLNO_VEND_PERSON = 13;
    private final int CSV_COLNO_OWN_ORG_CD = 14;
    private final int CSV_COLNO_OWN_ORG_NAME = 15;
    private final int CSV_COLNO_OWN_PERSON_CD = 16;
    private final int CSV_COLNO_ROUND_TYP = 17;
    private final int CSV_COLNO_TAX_CD = 18;
    private final int CSV_COLNO_TAX_APPLY_TYP = 19;
    private final int CSV_COLNO_TAX_CALC_TYP = 20;
    private final int CSV_COLNO_INSPC_ACPT_APP_TYP = 21;
    private final int CSV_COLNO_ODR_FORM_FLG = 22;
    private final int CSV_COLNO_ODR_EDI_FLG = 23;
    private final int CSV_COLNO_VEND_REM = 24;
    private final int CSV_COLNO_CUR_CD = 25;
    private final int CSV_COLNO_EXCH_TYP = 26;
    private final int CSV_COLNO_IMPORT_TRN_TYP = 27;
    private final int CSV_COLNO_UNIT_COST_RET_FLG = 28;
    // ＣＳＶ取込データ必要項目数
    private final int CSV_NECESSARY_COLUMN = 29;
    private final String CSV_COLNO_99 = "99";
    
    /**全部レコード件数**/
	private int _intTotalCount = 0; 
	/**エラーレコード件数**/
	private int _intErrorCount = 0;  
	/**正常レコード件数**/
	private int _intSuccessCount = 0;
	/**ワーニング件数**/
	private int _intWarningCount = 0;
	private String _strSysdate = "";
	// 親画面のstructを退避
	private String _strRdoInsert = "";
	private String _strRdoUpdate = "";
	private String _strRdoDelete = "";
	private String _strDoChk = "";
	
    // 会社コード
	private String _COMPANY_CD = null;
	// エラー状態区分のコンボボックスデータ
    private ComboStruct _COM_ERR_TYP = null;
    
	// 発注金額まるめ区分のコンボボックスデータ
    private ComboStruct _COM_ROUND_TYP = null;
	// 消費税適用区分のコンボボックスデータ
	private ComboStruct _COM_TAX_APPLY_TYP = null;
	// 消費税計算区分のコンボボックスデータ
	private ComboStruct _COM_TAX_CALC_TYP = null;
	// 検収計上区分のコンボボックスデータ
	private ComboStruct _COM_INSPC_ACPT_APP_TYP = null;
	// 為替種別のコンボボックスデータ
	private ComboStruct _COM_EXCH_TYP = null;
	// 輸入取引区分のコンボボックスデータ
	private ComboStruct _COM_IMPORT_TRN_TYP = null;
	// 販売単価遡及フラグのコンボボックスデータ
	private ComboStruct _COM_UNIT_COST_RET_FLG = null;
    
	private AA0210010Struct tempStruct = null;
	
	/**
	 * エラー状態区分をゲット
	 * @return
	*/
	public ComboStruct getComErrTyp() {
		return _COM_ERR_TYP;
	}
	/**
	 * エラー状態区分をセット
	 * @param cs
	*/
	public void setComErrTyp(ComboStruct cs){
		_COM_ERR_TYP = cs;
	}
	
	/**
	 * 発注金額まるめ区分をゲット
	 * @return
	*/
	public ComboStruct getComRoundTyp() {
		return _COM_ROUND_TYP;
	}
	/**
	 * 発注金額まるめ区分をセット
	 * @param cs
	*/
	public void setComRoundTyp(ComboStruct cs){
		_COM_ROUND_TYP = cs;
	}
	
	/**
	 * 消費税適用区分をゲット
	 * @return
	*/
	public ComboStruct getComTaxApplyTyp() {
		return _COM_TAX_APPLY_TYP;
	}
	/**
	 * 消費税適用区分をセット
	 * @param cs
	*/
	public void setComTaxApplyTyp(ComboStruct cs){
		_COM_TAX_APPLY_TYP = cs;
	}
	
	/**
	 * 消費税計算区分をゲット
	 * @return
	*/
	public ComboStruct getComTaxCalcTyp() {
		return _COM_TAX_CALC_TYP;
	}
	/**
	 * 消費税計算区分をセット
	 * @param cs
	*/
	public void setComTaxCalcTyp(ComboStruct cs){
		_COM_TAX_CALC_TYP = cs;
	}
	
	/**
	 * 検収計上区分をゲット
	 * @return
	*/
	public ComboStruct getComInspcAcptAppTyp() {
		return _COM_INSPC_ACPT_APP_TYP;
	}
	/**
	 * 検収計上区分をセット
	 * @param cs
	*/
	public void setComInspcAcptAppTyp(ComboStruct cs){
		_COM_INSPC_ACPT_APP_TYP = cs;
	}
	
	/**
	 * 為替種別をゲット
	 * @return
	*/
	public ComboStruct getComExchTyp() {
		return _COM_EXCH_TYP;
	}
	/**
	 * 為替種別をセット
	 * @param cs
	*/
	public void setComExchTyp(ComboStruct cs){
		_COM_EXCH_TYP = cs;
	}
	
	/**
	 * 輸入取引区分をゲット
	 * @return
	*/
	public ComboStruct getComImportTrnTyp() {
		return _COM_IMPORT_TRN_TYP;
	}
	/**
	 * 輸入取引区分をセット
	 * @param cs
	*/
	public void setComImportTrnTyp(ComboStruct cs){
		_COM_IMPORT_TRN_TYP = cs;
	}
	
	/**
	 * 販売単価遡及フラグをゲット
	 * @return
	*/
	public ComboStruct getComUnitCostRetFlg() {
		return _COM_UNIT_COST_RET_FLG;
	}
	/**
	 * 販売単価遡及フラグをセット
	 * @param cs
	*/
	public void setComUnitCostRetFlg(ComboStruct cs){
		_COM_UNIT_COST_RET_FLG = cs;
	}

    /**
     * ログメッセージ設定
     * @param 出力メッセージ
     */
	private void setSyslogConfig(String message) {
		ExpjMessage emsg = new ExpjMessage("ZZ01006", message);
		sysLog.config(emsg, getsysUSER_CD());
	}
	
	/**
     * メッセージ設定処理を切り出して関数化
     * @param code メッセージコード
     * @param value1   置換文字列１
     */
	private void setInfoMessage(String code, String value1) {
		ExpjMessage emsg = new ExpjMessage(code, value1);
		msgStruct.addInfo(emsg);
		sysLog.info(emsg, sysUSER_CD);
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
	 * 業務ロジックのエラーメッセージ設定処理を切り出して関数化
	 * 
	 * @param code   メッセージコード
	 * @param value1   置換文字列１
	 * @param value2   置換文字列２
	 */
	private void setErrorMessage(String code, String value1, String value2) {
		ExpjMessage emsg = new ExpjMessage(code, value1, value2);
		msgStruct.addError(emsg);
		sysLog.warning(emsg, sysUSER_CD);
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
     * CSV取込結果情報追加
     *
     * @return	なし
     */
	private void csvExport(String errlineNo, String errItemNo,
			String errTyp, AA0210010Struct target_struct, String fieldName,	String strMessage) {
		// メッセージ情報格納用
		AA0210010Struct structTemp = new AA0210010Struct();
		// 多言語項目取得対応
		String locale = CoreTools.getLocale(sysUSER_CD);
		ExpjMessage emsg = null;
		// 多言語キーセット
		if (errItemNo != CSV_COLNO_99) {
			// {0}件目の {1}項目
			emsg = new ExpjMessage("AH00045", errlineNo, errItemNo);
		} else {
			// {0}件目
			emsg = new ExpjMessage("AA01520", errlineNo);
		}
		// エラー箇所
		structTemp.setl_ERR_ADR(emsg.getMessage(locale));		
		// エラー区分
		structTemp.setl_ERR_TYP(errTyp);
		// 取引先コード
		structTemp.setl_VEND_CD(target_struct.getl_VEND_CD());
		structTemp.setOUT_VEND_CD(target_struct.getOUT_VEND_CD());
		// エラー項目名
		structTemp.setl_ERROR_FIELD_NAME(fieldName);
		// エラー内容
		structTemp.setl_ERR_TEXT(strMessage);

		// リストへ情報追加
		list.add(structTemp);
		return;
    }
    
    /**
     * ＣＳＶデータ取得とリストデータ化
     *
     * @return	CSVデータリスト
     */
	private List readCsvData() throws ExpjException {

		String[] strsCsvData = null;
		List listCsv = null;
		List tempList = null;
		try {
			// ＣＳＶデータのアップロード
			strsCsvData = (String[]) _csvReader.lineRead();
			if (null != strsCsvData) {
				setSyslogConfig("strsCsvData.length:" + strsCsvData.length);

				// データ件数としてstrsCsvData.lengthは使えない。実際の行数＋５行くらいらしい
				listCsv = new ArrayList(0);
				AA0210010Struct structCsv = null;
				Vector v = null;
				int intColNum = 0;
				int intColNumForCheck = 0;

				for (int i = 0; i < strsCsvData.length; i++) {
					// 改行のみのレコードでEOFと判断します
					if (strsCsvData[i].length() == 0) {
						break;
					}

					// レコードを項目毎にばらす
					structCsv = new AA0210010Struct();
					v = _csvReader.importCSVLine(strsCsvData[i]);
					if (null != v) {
						// 項目数チェック
						intColNum = v.size();
						if (CSV_NECESSARY_COLUMN == intColNum) {
							// ＣＳＶの項目をリストデータ化
							structCsv.setw_COLUMN_FLG((String) null);
							// 会社コード
							structCsv.setl_COMPANY_CD(_COMPANY_CD);
							// 取引先コード
							structCsv.setOUT_VEND_CD((String)v.get(CSV_COLNO_VEND_CD));
                            // \の場合、\\で置換処理
                            structCsv.setl_VEND_CD(CsvInCheck.replaceSlash(structCsv.getOUT_VEND_CD()));
							// 取引先名称
							structCsv.setl_VEND_NAME((String)v.get(CSV_COLNO_VEND_NAME));
							// 取引先略称
							structCsv.setl_VEND_ANAME((String)v.get(CSV_COLNO_VEND_ANAME));
							// 取引先カナ名称
							structCsv.setl_VEND_KNAME((String)v.get(CSV_COLNO_VEND_KNAME));
							// 郵便番号
							structCsv.setl_ZIP_CD((String)v.get(CSV_COLNO_ZIP_CD));
							// 住所1
							structCsv.setl_ADDRESS_1((String)v.get(CSV_COLNO_ADDRESS_1));
							// 住所2
							structCsv.setl_ADDRESS_2((String)v.get(CSV_COLNO_ADDRESS_2));
							// 住所(カナ)1
							structCsv.setl_ADDRESS_K_1((String)v.get(CSV_COLNO_ADDRESS_K_1));
							// 住所(カナ)2
							structCsv.setl_ADDRESS_K_2((String)v.get(CSV_COLNO_ADDRESS_K_2));
							// 電話番号
							structCsv.setl_TEL((String)v.get(CSV_COLNO_TEL));
							// FAX番号
							structCsv.setl_FAX((String)v.get(CSV_COLNO_FAX));
							// メールアドレス
							structCsv.setl_EMAIL((String)v.get(CSV_COLNO_EMAIL));
							// 相手先担当部門
							structCsv.setl_VEND_ORG((String)v.get(CSV_COLNO_VEND_ORG));
							// 相手先担当者
							structCsv.setl_VEND_PERSON((String)v.get(CSV_COLNO_VEND_PERSON));
							// 自社担当部門コード
							structCsv.setl_OWN_ORG_CD((String)v.get(CSV_COLNO_OWN_ORG_CD));
							// 自社担当部門名
							structCsv.setl_OWN_ORG_NAME((String)v.get(CSV_COLNO_OWN_ORG_NAME));
							// 自社担当者コード
							if (CsvInCheck.isNull((String)v.get(CSV_COLNO_OWN_PERSON_CD))) {
                            	structCsv.setl_OWN_PERSON_CD(sysUSER_CD);
                            }else{
                            	structCsv.setl_OWN_PERSON_CD((String)v.get(CSV_COLNO_OWN_PERSON_CD));
                            }
							// 「自社担当者コード」 が入力ありの場合で、「ログインユーザの所属会社コード」「自社担当者コード」で [ユーザマスタ]を検索し、存在しない場合
							if (!CsvInCheck.isNull(structCsv.getl_OWN_PERSON_CD())) {
								tempList = entity.mselectOWN_PERSON_CD.read(conn, structCsv);
								if (tempList.size() > 0) {
									structCsv.setl_OWN_PERSON_NAME(((AA0210010Struct)tempList.get(0)).getl_OWN_PERSON_NAME());
								}
							}
							// 発注金額まるめ区分
							if (CsvInCheck.isNull((String)v.get(CSV_COLNO_ROUND_TYP))) {
                            	structCsv.setl_ROUND_TYP("1");
                            }else{
                            	structCsv.setl_ROUND_TYP((String)v.get(CSV_COLNO_ROUND_TYP));
                            }
							// 消費税コード
							structCsv.setl_TAX_CD((String)v.get(CSV_COLNO_TAX_CD));
							// 消費税適用区分
							if (CsvInCheck.isNull((String)v.get(CSV_COLNO_TAX_APPLY_TYP))) {
                            	structCsv.setl_TAX_APPLY_TYP("2");
                            }else{
                            	structCsv.setl_TAX_APPLY_TYP((String)v.get(CSV_COLNO_TAX_APPLY_TYP));
                            }							
							// 消費税計算区分
							if (CsvInCheck.isNull((String)v.get(CSV_COLNO_TAX_CALC_TYP))) {
                            	structCsv.setl_TAX_CALC_TYP("1");
                            }else{
                            	structCsv.setl_TAX_CALC_TYP((String)v.get(CSV_COLNO_TAX_CALC_TYP));
                            }
							// 検収計上区分
							if (CsvInCheck.isNull((String)v.get(CSV_COLNO_INSPC_ACPT_APP_TYP))) {
                            	structCsv.setl_INSPC_ACPT_APP_TYP("1");
                            }else{
                            	structCsv.setl_INSPC_ACPT_APP_TYP((String)v.get(CSV_COLNO_INSPC_ACPT_APP_TYP));
                            }					
							// 注文書発注フラグ
							if(CsvInCheck.isNull((String)v.get(CSV_COLNO_ODR_FORM_FLG))){
								structCsv.setl_ODR_FORM_FLG("0");
							}else{
								structCsv.setl_ODR_FORM_FLG((String)v.get(CSV_COLNO_ODR_FORM_FLG));
							}
							// EDI発注フラグ
							if(CsvInCheck.isNull((String)v.get(CSV_COLNO_ODR_EDI_FLG))){
								structCsv.setl_ODR_EDI_FLG("0");
							}else{
								structCsv.setl_ODR_EDI_FLG((String)v.get(CSV_COLNO_ODR_EDI_FLG));
							}
							// 備考
							structCsv.setl_VEND_REM((String)v.get(CSV_COLNO_VEND_REM));
							// 取引通貨コード(省略時の設定値が最後に実装する)
							structCsv.setl_CUR_CD((String)v.get(CSV_COLNO_CUR_CD));
							// 為替種別
							if (CsvInCheck.isNull((String)v.get(CSV_COLNO_EXCH_TYP))) {
                            	structCsv.setl_EXCH_TYP("1");
                            }else{
                            	structCsv.setl_EXCH_TYP((String)v.get(CSV_COLNO_EXCH_TYP));
                            }
							// 輸入取引区分
							if (CsvInCheck.isNull((String)v.get(CSV_COLNO_IMPORT_TRN_TYP))) {
                            	structCsv.setl_IMPORT_TRN_TYP("1");
                            }else{
                            	structCsv.setl_IMPORT_TRN_TYP((String)v.get(CSV_COLNO_IMPORT_TRN_TYP));
                            }
							// 販売単価遡及フラグ
							if (CsvInCheck.isNull((String)v.get(CSV_COLNO_UNIT_COST_RET_FLG))) {
                            	structCsv.setl_UNIT_COST_RETROACTION_FLG("0");
                            }else{
                            	structCsv.setl_UNIT_COST_RETROACTION_FLG((String)v.get(CSV_COLNO_UNIT_COST_RET_FLG));
                            }
							// 取引通貨コード(省略時)
		    				if(CsvInCheck.isNull(structCsv.getl_CUR_CD())){
		    					tempStruct = new AA0210010Struct();
		    					tempStruct.setl_COMPANY_CD(_COMPANY_CD);
		    					tempList = entity.mselectCurCd.read(conn, tempStruct);
		    					if (tempList.size() > 0) {
		    						tempStruct = (AA0210010Struct) tempList.get(0);
		    						structCsv.setl_CUR_CD(tempStruct.getl_HOME_CUR_CD());
		    					}
		    				}
						} else {
							// 会社コード
							structCsv.setl_COMPANY_CD(_COMPANY_CD);
							// 取引先コード
							structCsv.setOUT_VEND_CD((String)v.get(CSV_COLNO_VEND_CD));
                            // \の場合、\\で置換処理
                            structCsv.setl_VEND_CD(CsvInCheck.replaceSlash(structCsv.getOUT_VEND_CD()));
							// 項目数が必要項目数より未満、項目数が必要項目数より多すぎの場合
							structCsv.setw_COLUMN_FLG(String.valueOf(intColNum));
						}
						intColNumForCheck ++;
						structCsv.setw_COLUMN(String.valueOf(intColNumForCheck));
						// リスト追加
						listCsv.add(structCsv);
					} else {
						// ベクター生成失敗エラー
						setSyslogConfig("csvReader.Vector was Failed... line:" + strsCsvData[i]);
						listCsv = null;
						break;
					}
				}
				// ＣＳＶデータ件数（タイトル行は省く）
				if ((listCsv == null) || (listCsv.size() <= 0)) {
					// 取込失敗またはデータなし
					setErrorMessage("AH00042", "0", "0");
					listCsv = null;
				} else {
					// ＣＳＶ読込み件数ログ表示
					ExpjMessage emsg = new ExpjMessage("AH00043", "" + listCsv.size());
					sysLog.config(emsg, getsysUSER_CD());
				}
			}
		} catch(Exception e){
            ExpjMessage emsg = new ExpjMessage( "AH00042", "0", "0");
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
			String CsvCancelFileName = pc.getString("J_VEND_CTRL_CANCEL");
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
			ExpjMessage emsg = new ExpjMessage( "AH00042", "0", "0");
            sysLog.severe(emsg, getsysUSER_CD());
            ExpjException ee = new ExpjException(e, emsg);
            throw ee;
		}
		struct.setCANCEL_FILE(filePath);
		return true;
	}
	
	/**
     * ＣＳＶデータ内容チェック処理
     *
     * @param	listCsv	CSVデータリスト
     * @param	listCsvUpdate　更新用CSVデータリスト
     */
	private boolean checkCsvData(List listCsv) throws BusinessProcessException, FoundationException
	{
		// 多言語項目取得対応
		String locale = CoreTools.getLocale(sysUSER_CD);
		String property = "OrteusUserDic";
		ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
		List tempList = null;
		boolean checkFlag = true;
		
		// 項目過不足
		String strCsvColCom = CoreTools.getRBString("Expj.Cmt3099", resource);
		// 取引先コード
		String strVendCd = CoreTools.getRBString("Expj.VEND_CD", resource);
		// 取引先名称
		String strVendName = CoreTools.getRBString("Expj.Cmt1064", resource);
		// 取引先略称
		String strVendAname = CoreTools.getRBString("Expj.VEND_ANAME", resource);
		// 取引先カナ名称
		String strVendKname = CoreTools.getRBString("Expj.VEND_KNAME", resource);
		// 郵便番号
		String strZipCd = CoreTools.getRBString("Expj.ZIP_CD", resource);
		// 住所1
		String strAddress1 = CoreTools.getRBString("Expj.ADDRESS_1", resource);
		// 住所2
		String strAddress2 = CoreTools.getRBString("Expj.ADDRESS_2", resource);
		// 住所(カナ)1
		String strAddressK1 = CoreTools.getRBString("Expj.ADDRESS_K_1", resource);
		// 住所(カナ)2
		String strAddressK2 = CoreTools.getRBString("Expj.ADDRESS_K_2", resource);
		// 電話番号
		String strTel = CoreTools.getRBString("Expj.TEL", resource);
		// FAX番号
		String strFax = CoreTools.getRBString("Expj.FAX", resource);
		// メールアドレス
		String strEmail = CoreTools.getRBString("Expj.ADDRESS", resource);
		// 相手先担当部門
		String strVendOrg = CoreTools.getRBString("Expj.VEND_ORG", resource);
		// 相手先担当者
		String strVendPerson = CoreTools.getRBString("Expj.VEND_PERSON", resource);
		// 自社担当部門コード
		String strOwnOrgCd = CoreTools.getRBString("Expj.OWN_ORG_CD", resource);
		// 自社担当部門名
		String strOwnOrgName = CoreTools.getRBString("Expj.OWN_ORG_NAME", resource);
		// 自社担当者コード
		String strOwnPersonCd = CoreTools.getRBString("Expj.OWN_PERSON_CD", resource);
		// 発注金額まるめ区分
		String strRoundTyp = CoreTools.getRBString("Expj.Cmt5311", resource);
		// 消費税コード
		String strTaxCd = CoreTools.getRBString("Expj.TAX_CD_1", resource);
		// 消費税適用区分
		String strTaxApplyTyp = CoreTools.getRBString("Expj.TAX_APPLY_TYP", resource);
		// 消費税計算区分
		String strTaxCalcTyp = CoreTools.getRBString("Expj.TAX_CALC_TYP", resource);
		// 検収計上区分
		String strInspcAcptAppTyp = CoreTools.getRBString("Expj.INSPC_ACPT_APP_TYP", resource);
		// 注文書発注フラグ
		String strOdrFormFlg = CoreTools.getRBString("Expj.ODR_FORM_FLG", resource);
		// EDI発注フラグ
		String strOdrEdiFlg = CoreTools.getRBString("Expj.ODR_EDI_FLG", resource);
		// 備考
		String strVendRem = CoreTools.getRBString("Expj.VEND_REM", resource);
		// 取引通貨コード
		String strCurCd = CoreTools.getRBString("Expj.CUR_CD_1", resource);
		// 為替種別
		String strExchTyp = CoreTools.getRBString("Expj.EXCH_TYP", resource);
		// 輸入取引区分
		String strImportTrnTyp = CoreTools.getRBString("Expj.IMPORT_TRN_TYP", resource);
		// 販売単価遡及フラグ
		String strUnitCostRetFlg = CoreTools.getRBString("Expj.UNIT_COST_RETROACTION_FLG", resource);

		try {
			ExpjMessage emsg = null;
			AA0210010Struct structCsv = null;

			for (int i = 0; i < listCsv.size(); i++) {
				// 処理件数
				_intTotalCount++;

				// CSV情報取得
				structCsv = (AA0210010Struct) listCsv.get(i);

				// ★ＣＳＶ項目チェック
				// 項目数チェック
				if (structCsv.getw_COLUMN_FLG() != null
						&& !("").equals(structCsv.getw_COLUMN_FLG()) && !"true".equals(_strRdoDelete)) {
					// 項目に不足がある場合
					if (Calculate.compare(String.valueOf(CSV_NECESSARY_COLUMN),
							structCsv.getw_COLUMN_FLG().toString()) > 0) {
						emsg = new ExpjMessage("AA01500", "" + structCsv.getw_COLUMN_FLG());
						csvExport(
								structCsv.getw_COLUMN(),
								CSV_COLNO_99,
								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
								structCsv,
								strCsvColCom,
								emsg.getMessage(locale));
						_intErrorCount++;
						continue;
					}
					// 項目が必要数以上の場合
					else if (Calculate.compare(String.valueOf(CSV_NECESSARY_COLUMN),
							structCsv.getw_COLUMN_FLG().toString()) < 0) {
						emsg = new ExpjMessage("AA01519", "" + structCsv.getw_COLUMN_FLG());
						csvExport(
								structCsv.getw_COLUMN(),
								CSV_COLNO_99,
								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
								structCsv,
								strCsvColCom,
								emsg.getMessage(locale));
						_intErrorCount++;
						continue;
					}
				}

				// 1.取引先コード
				// NULLの場合
				if (CsvInCheck.isNull(structCsv.getOUT_VEND_CD())) {
					emsg = new ExpjMessage("AA01530", strVendCd);
					csvExport(structCsv.getw_COLUMN(),
							String.valueOf(CSV_COLNO_VEND_CD + 1),
							String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
							structCsv,
							strVendCd,
							emsg.getMessage(locale));
					_intErrorCount++;
					continue;
				} 
				// 文字26桁以上の場合
				if (CsvInCheck.strLengthChk(structCsv.getOUT_VEND_CD()) > 25) {
					emsg = new ExpjMessage("AA01501");
					csvExport(structCsv.getw_COLUMN(),
							String.valueOf(CSV_COLNO_VEND_CD + 1),
							String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
							structCsv,
							strVendCd,
							emsg.getMessage(locale));
					_intErrorCount++;
					continue;
				}
				// 禁則文字が入力されていた場合
				if (CsvInCheck.chkHankaku(structCsv.getOUT_VEND_CD())) {
					emsg = new ExpjMessage("AA01524");
					csvExport(structCsv.getw_COLUMN(),
							String.valueOf(CSV_COLNO_VEND_CD + 1),
							String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
							structCsv,
							strVendCd,
							emsg.getMessage(locale));
					_intErrorCount++;
					continue;
				}
				
                // ◆登録OR更新ラジオボタンが選択されたときのみチェックを行う。(※登録OR更新時)◆
                if (("true").equals(_strRdoInsert) == true || ("true").equals(_strRdoUpdate) == true )
                {
                	// 2.取引先名称
    				// NULLの場合
    				if (CsvInCheck.isNull(structCsv.getl_VEND_NAME())) {
    					emsg = new ExpjMessage("AA01530", strVendName);
    					csvExport(structCsv.getw_COLUMN(),
    							String.valueOf(CSV_COLNO_VEND_NAME + 1),
    							String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
    							structCsv,
    							strVendName,
    							emsg.getMessage(locale));
    					_intErrorCount++;
    					continue;
    				} 
    				// 文字81桁以上の場合
    				if (CsvInCheck.strLengthChk(structCsv.getl_VEND_NAME()) > 80) {
    					emsg = new ExpjMessage("AA01501");
    					csvExport(structCsv.getw_COLUMN(),
    							String.valueOf(CSV_COLNO_VEND_NAME + 1),
    							String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
    							structCsv,
    							strVendName,
    							emsg.getMessage(locale));
    					_intErrorCount++;
    					continue;
    				}
    				// 禁則文字が入力されていた場合
    				if (CsvInCheck.chkHankaku(structCsv.getl_VEND_NAME())) {
    					emsg = new ExpjMessage("AA01524");
    					csvExport(structCsv.getw_COLUMN(),
    							String.valueOf(CSV_COLNO_VEND_NAME + 1),
    							String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
    							structCsv, strVendName,
    							emsg.getMessage(locale));
    					_intErrorCount++;
    					continue;
    				}
    				
    				// 3.取引先略称
    				// NULLの場合
    				if (CsvInCheck.isNull(structCsv.getl_VEND_ANAME())) {
    					emsg = new ExpjMessage("AA01530", strVendAname);
    					csvExport(structCsv.getw_COLUMN(),
    							String.valueOf(CSV_COLNO_VEND_ANAME + 1),
    							String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
    							structCsv,
    							strVendAname,
    							emsg.getMessage(locale));
    					_intErrorCount++;
    					continue;
    				} 
    				// 文字41桁以上の場合
    				if (CsvInCheck.strLengthChk(structCsv.getl_VEND_ANAME()) > 40) {
    					emsg = new ExpjMessage("AA01501");
    					csvExport(structCsv.getw_COLUMN(),
    							String.valueOf(CSV_COLNO_VEND_ANAME + 1),
    							String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
    							structCsv,
    							strVendAname,
    							emsg.getMessage(locale));
    					_intErrorCount++;
    					continue;
    				}
    				// 禁則文字が入力されていた場合
    				if (CsvInCheck.chkHankaku(structCsv.getl_VEND_ANAME())) {
    					emsg = new ExpjMessage("AA01524");
    					csvExport(structCsv.getw_COLUMN(),
    							String.valueOf(CSV_COLNO_VEND_ANAME + 1),
    							String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
    							structCsv,
    							strVendAname,
    							emsg.getMessage(locale));
    					_intErrorCount++;
    					continue;
    				}
    				
    				// 4.取引先カナ名称
    				if(!CsvInCheck.isNull(structCsv.getl_VEND_KNAME())){
    					// 文字41桁以上の場合
    					if (CsvInCheck.strLengthChk(structCsv.getl_VEND_KNAME()) > 40) {
    						emsg = new ExpjMessage("AA01501");
    						csvExport(structCsv.getw_COLUMN(),
    								String.valueOf(CSV_COLNO_VEND_KNAME + 1),
    								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
    								structCsv,
    								strVendKname,
    								emsg.getMessage(locale));
    						_intErrorCount++;
    						continue;
    					}
    					// 禁則文字が入力されていた場合
    					if (CsvInCheck.chkHankaku(structCsv.getl_VEND_KNAME())) {
    						emsg = new ExpjMessage("AA01524");
    						csvExport(structCsv.getw_COLUMN(),
    								String.valueOf(CSV_COLNO_VEND_KNAME + 1),
    								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
    								structCsv,
    								strVendKname,
    								emsg.getMessage(locale));
    						_intErrorCount++;
    						continue;
    					}
    				}
    				
    				// 5.郵便番号
    				if(!CsvInCheck.isNull(structCsv.getl_ZIP_CD())){
    					// 文字26桁以上の場合
    					if (CsvInCheck.strLengthChk(structCsv.getl_ZIP_CD()) > 25) {
    						emsg = new ExpjMessage("AA01501");
    						csvExport(structCsv.getw_COLUMN(),
    								String.valueOf(CSV_COLNO_ZIP_CD + 1),
    								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
    								structCsv,
    								strZipCd,
    								emsg.getMessage(locale));
    						_intErrorCount++;
    						continue;
    					}
    					// 禁則文字が入力されていた場合
    					if (CsvInCheck.chkHankaku(structCsv.getl_ZIP_CD())) {
    						emsg = new ExpjMessage("AA01524");
    						csvExport(structCsv.getw_COLUMN(),
    								String.valueOf(CSV_COLNO_ZIP_CD + 1),
    								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
    								structCsv,
    								strZipCd,
    								emsg.getMessage(locale));
    						_intErrorCount++;
    						continue;
    					}
    				}
    				
    				// 6.住所1
    				// NULLの場合
    				if (CsvInCheck.isNull(structCsv.getl_ADDRESS_1())) {
    					emsg = new ExpjMessage("AA01530", strAddress1);
    					csvExport(structCsv.getw_COLUMN(),
    							String.valueOf(CSV_COLNO_ADDRESS_1 + 1),
    							String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
    							structCsv,
    							strAddress1,
    							emsg.getMessage(locale));
    					_intErrorCount++;
    					continue;
    				} 
    				// 文字81桁以上の場合
    				if (CsvInCheck.strLengthChk(structCsv.getl_ADDRESS_1()) > 80) {
    					emsg = new ExpjMessage("AA01501");
    					csvExport(structCsv.getw_COLUMN(),
    							String.valueOf(CSV_COLNO_ADDRESS_1 + 1),
    							String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
    							structCsv,
    							strAddress1,
    							emsg.getMessage(locale));
    					_intErrorCount++;
    					continue;
    				}
    				// 禁則文字が入力されていた場合
    				if (CsvInCheck.chkHankaku(structCsv.getl_ADDRESS_1())) {
    					emsg = new ExpjMessage("AA01524");
    					csvExport(structCsv.getw_COLUMN(),
    							String.valueOf(CSV_COLNO_ADDRESS_1 + 1),
    							String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
    							structCsv,
    							strAddress1,
    							emsg.getMessage(locale));
    					_intErrorCount++;
    					continue;
    				}
    				
    				// 7.住所2
    				if(!CsvInCheck.isNull(structCsv.getl_ADDRESS_2())){
    					// 文字81桁以上の場合
    					if (CsvInCheck.strLengthChk(structCsv.getl_ADDRESS_2()) > 80) {
    						emsg = new ExpjMessage("AA01501");
    						csvExport(structCsv.getw_COLUMN(),
    								String.valueOf(CSV_COLNO_ADDRESS_2 + 1),
    								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
    								structCsv,
    								strAddress2,
    								emsg.getMessage(locale));
    						_intErrorCount++;
    						continue;
    					}
    					// 禁則文字が入力されていた場合
    					if (CsvInCheck.chkHankaku(structCsv.getl_ADDRESS_2())) {
    						emsg = new ExpjMessage("AA01524");
    						csvExport(structCsv.getw_COLUMN(),
    								String.valueOf(CSV_COLNO_ADDRESS_2 + 1),
    								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
    								structCsv,
    								strAddress2,
    								emsg.getMessage(locale));
    						_intErrorCount++;
    						continue;
    					}
    				}
    				
    				// 8.住所(カナ)1
    				if(!CsvInCheck.isNull(structCsv.getl_ADDRESS_K_1())){
    					// 文字81桁以上の場合
    					if (CsvInCheck.strLengthChk(structCsv.getl_ADDRESS_K_1()) > 80) {
    						emsg = new ExpjMessage("AA01501");
    						csvExport(structCsv.getw_COLUMN(),
    								String.valueOf(CSV_COLNO_ADDRESS_K_1 + 1),
    								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
    								structCsv,
    								strAddressK1,
    								emsg.getMessage(locale));
    						_intErrorCount++;
    						continue;
    					}
    					// 禁則文字が入力されていた場合
    					if (CsvInCheck.chkHankaku(structCsv.getl_ADDRESS_K_1())) {
    						emsg = new ExpjMessage("AA01524");
    						csvExport(structCsv.getw_COLUMN(),
    								String.valueOf(CSV_COLNO_ADDRESS_K_1 + 1),
    								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
    								structCsv,
    								strAddressK1,
    								emsg.getMessage(locale));
    						_intErrorCount++;
    						continue;
    					}
    				}
    				
    				// 9.住所(カナ)2
    				if(!CsvInCheck.isNull(structCsv.getl_ADDRESS_K_2())){
    					// 文字81桁以上の場合
    					if (CsvInCheck.strLengthChk(structCsv.getl_ADDRESS_K_2()) > 80) {
    						emsg = new ExpjMessage("AA01501");
    						csvExport(structCsv.getw_COLUMN(),
    								String.valueOf(CSV_COLNO_ADDRESS_K_2 + 1),
    								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
    								structCsv,
    								strAddressK2,
    								emsg.getMessage(locale));
    						_intErrorCount++;
    						continue;
    					}
    					// 禁則文字が入力されていた場合
    					if (CsvInCheck.chkHankaku(structCsv.getl_ADDRESS_K_2())) {
    						emsg = new ExpjMessage("AA01524");
    						csvExport(structCsv.getw_COLUMN(),
    								String.valueOf(CSV_COLNO_ADDRESS_K_2 + 1),
    								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
    								structCsv,
    								strAddressK2,
    								emsg.getMessage(locale));
    						_intErrorCount++;
    						continue;
    					}
    				}
    				
    				// 10.電話番号
    				if(!CsvInCheck.isNull(structCsv.getl_TEL())){
    					// 文字21桁以上の場合
    					if (CsvInCheck.strLengthChk(structCsv.getl_TEL()) > 20) {
    						emsg = new ExpjMessage("AA01501");
    						csvExport(structCsv.getw_COLUMN(),
    								String.valueOf(CSV_COLNO_TEL + 1),
    								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
    								structCsv,
    								strTel,
    								emsg.getMessage(locale));
    						_intErrorCount++;
    						continue;
    					}
    					// 数値、ハイフン以外を入力した場合
    					if (!CsvInCheck.chkTelOrFax(structCsv.getl_TEL())) {
    						emsg = new ExpjMessage("AA00107");
    						csvExport(structCsv.getw_COLUMN(),
    								String.valueOf(CSV_COLNO_TEL + 1),
    								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
    								structCsv,
    								strTel,
    								emsg.getMessage(locale));
    						_intErrorCount++;
    						continue;
    					}
    				}
    				
    				// 11.FAX番号
    				if(!CsvInCheck.isNull(structCsv.getl_FAX())){
    					// 文字21桁以上の場合
    					if (CsvInCheck.strLengthChk(structCsv.getl_FAX()) > 20) {
    						emsg = new ExpjMessage("AA01501");
    						csvExport(structCsv.getw_COLUMN(),
    								String.valueOf(CSV_COLNO_FAX + 1),
    								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
    								structCsv,
    								strFax,
    								emsg.getMessage(locale));
    						_intErrorCount++;
    						continue;
    					}
    					// 数値、ハイフン以外を入力した場合
    					if (!CsvInCheck.chkTelOrFax(structCsv.getl_FAX())) {
    						emsg = new ExpjMessage("AA00108");
    						csvExport(structCsv.getw_COLUMN(),
    								String.valueOf(CSV_COLNO_FAX + 1),
    								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
    								structCsv,
    								strFax,
    								emsg.getMessage(locale));
    						_intErrorCount++;
    						continue;
    					}
    				}
    				
    				// 12.メールアドレス
    				if(!CsvInCheck.isNull(structCsv.getl_EMAIL())){
    					// 文字41桁以上の場合
    					if (CsvInCheck.strLengthChk(structCsv.getl_EMAIL()) > 40) {
    						emsg = new ExpjMessage("AA01501");
    						csvExport(structCsv.getw_COLUMN(),
    								String.valueOf(CSV_COLNO_EMAIL + 1),
    								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
    								structCsv,
    								strEmail,
    								emsg.getMessage(locale));
    						_intErrorCount++;
    						continue;
    					}
    					// 禁則文字「\」が入力されていた場合
    					if (CsvInCheck.chkEmail(structCsv.getl_EMAIL())) {
    						emsg = new ExpjMessage("AA00109");
    						csvExport(structCsv.getw_COLUMN(),
    								String.valueOf(CSV_COLNO_EMAIL + 1),
    								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
    								structCsv,
    								strEmail,
    								emsg.getMessage(locale));
    						_intErrorCount++;
    						continue;
    					}
    				}
    				
    				// 13.相手先担当部門
    				if(!CsvInCheck.isNull(structCsv.getl_VEND_ORG())){
    					// 文字81桁以上の場合
    					if (CsvInCheck.strLengthChk(structCsv.getl_VEND_ORG()) > 80) {
    						emsg = new ExpjMessage("AA01501");
    						csvExport(structCsv.getw_COLUMN(),
    								String.valueOf(CSV_COLNO_VEND_ORG + 1),
    								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
    								structCsv,
    								strVendOrg,
    								emsg.getMessage(locale));
    						_intErrorCount++;
    						continue;
    					}
    					// 禁則文字が入力されていた場合
    					if (CsvInCheck.chkHankaku(structCsv.getl_VEND_ORG())) {
    						emsg = new ExpjMessage("AA01524");
    						csvExport(structCsv.getw_COLUMN(),
    								String.valueOf(CSV_COLNO_VEND_ORG + 1),
    								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
    								structCsv,
    								strVendOrg,
    								emsg.getMessage(locale));
    						_intErrorCount++;
    						continue;
    					}
    				}
    				
    				// 14.相手先担当者
    				if(!CsvInCheck.isNull(structCsv.getl_VEND_PERSON())){
    					// 文字41桁以上の場合
    					if (CsvInCheck.strLengthChk(structCsv.getl_VEND_PERSON()) > 40) {
    						emsg = new ExpjMessage("AA01501");
    						csvExport(structCsv.getw_COLUMN(),
    								String.valueOf(CSV_COLNO_VEND_PERSON + 1),
    								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
    								structCsv,
    								strVendPerson,
    								emsg.getMessage(locale));
    						_intErrorCount++;
    						continue;
    					}
    					// 禁則文字が入力されていた場合
    					if (CsvInCheck.chkHankaku(structCsv.getl_VEND_PERSON())) {
    						emsg = new ExpjMessage("AA01524");
    						csvExport(structCsv.getw_COLUMN(),
    								String.valueOf(CSV_COLNO_VEND_PERSON + 1),
    								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
    								structCsv,
    								strVendPerson,
    								emsg.getMessage(locale));
    						_intErrorCount++;
    						continue;
    					}
    				}
    				
    				// 15.自社担当部門コード
    				if(!CsvInCheck.isNull(structCsv.getl_OWN_ORG_CD())){
    					// 文字26桁以上の場合
    					if (CsvInCheck.strLengthChk(structCsv.getl_OWN_ORG_CD()) > 25) {
    						emsg = new ExpjMessage("AA01501");
    						csvExport(structCsv.getw_COLUMN(),
    								String.valueOf(CSV_COLNO_OWN_ORG_CD + 1),
    								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
    								structCsv,
    								strOwnOrgCd,
    								emsg.getMessage(locale));
    						_intErrorCount++;
    						continue;
    					}
    					// 禁則文字が入力されていた場合
    					if (CsvInCheck.chkHankaku(structCsv.getl_OWN_ORG_CD())) {
    						emsg = new ExpjMessage("AA01524");
    						csvExport(structCsv.getw_COLUMN(),
    								String.valueOf(CSV_COLNO_OWN_ORG_CD + 1),
    								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
    								structCsv,
    								strOwnOrgCd,
    								emsg.getMessage(locale));
    						_intErrorCount++;
    						continue;
    					}
    				}
    				
    				// 16.自社担当部門名
    				if(!CsvInCheck.isNull(structCsv.getl_OWN_ORG_NAME())){
    					// 文字81桁以上の場合
    					if (CsvInCheck.strLengthChk(structCsv.getl_OWN_ORG_NAME()) > 80) {
    						emsg = new ExpjMessage("AA01501");
    						csvExport(structCsv.getw_COLUMN(),
    								String.valueOf(CSV_COLNO_OWN_ORG_NAME + 1),
    								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
    								structCsv,
    								strOwnOrgName,
    								emsg.getMessage(locale));
    						_intErrorCount++;
    						continue;
    					}
    					// 禁則文字が入力されていた場合
    					if (CsvInCheck.chkHankaku(structCsv.getl_OWN_ORG_NAME())) {
    						emsg = new ExpjMessage("AA01524");
    						csvExport(structCsv.getw_COLUMN(),
    								String.valueOf(CSV_COLNO_OWN_ORG_NAME + 1),
    								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
    								structCsv,
    								strOwnOrgName,
    								emsg.getMessage(locale));
    						_intErrorCount++;
    						continue;
    					}
    				}
    				
    				// 17.自社担当者コード
    				if(!CsvInCheck.isNull(structCsv.getl_OWN_PERSON_CD())){
    					// 文字26桁以上の場合
    					if (CsvInCheck.strLengthChk(structCsv.getl_OWN_PERSON_CD()) > 25) {
    						emsg = new ExpjMessage("AA01501");
    						csvExport(structCsv.getw_COLUMN(),
    								String.valueOf(CSV_COLNO_OWN_PERSON_CD + 1),
    								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
    								structCsv,
    								strOwnPersonCd,
    								emsg.getMessage(locale));
    						_intErrorCount++;
    						continue;
    					}
    					// 禁則文字が入力されていた場合
    					if (CsvInCheck.chkHankaku(structCsv.getl_OWN_PERSON_CD())) {
    						emsg = new ExpjMessage("AA01524");
    						csvExport(structCsv.getw_COLUMN(),
    								String.valueOf(CSV_COLNO_OWN_PERSON_CD + 1),
    								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
    								structCsv,
    								strOwnPersonCd,
    								emsg.getMessage(locale));
    						_intErrorCount++;
    						continue;
    					}
    				}
    				
    				// 18.発注金額まるめ区分
    				if(!CsvInCheck.isNull(structCsv.getl_ROUND_TYP())){
    					// 整数以外の場合
    					if (!CsvInCheck.isIntegerChk(structCsv.getl_ROUND_TYP())) {
    						emsg = new ExpjMessage("AA01502");
    						csvExport(structCsv.getw_COLUMN(),
    								String.valueOf(CSV_COLNO_ROUND_TYP + 1),
    								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
    								structCsv,
    								strRoundTyp,
    								emsg.getMessage(locale));
    						_intErrorCount++;
    						continue;
    					}
    				}
    				
    				// 19.消費税コード
    				// 消費税適用区分が２：取引先マスタ、かつ消費税コードがNULLの場合
    				if(!CsvInCheck.isNull(structCsv.getl_TAX_APPLY_TYP()) && "2".equals(structCsv.getl_TAX_APPLY_TYP())
    						&& CsvInCheck.isNull(structCsv.getl_TAX_CD())){
    					emsg = new ExpjMessage("AA01530", strTaxCd);
    					csvExport(structCsv.getw_COLUMN(),
    							String.valueOf(CSV_COLNO_TAX_CD + 1),
    							String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
    							structCsv,
    							strTaxCd,
    							emsg.getMessage(locale));
    					_intErrorCount++;
    					continue;
    				}
    				if(!CsvInCheck.isNull(structCsv.getl_TAX_CD())){
    					// 文字26桁以上の場合
    					if (CsvInCheck.strLengthChk(structCsv.getl_TAX_CD()) > 25) {
    						emsg = new ExpjMessage("AA01501");
    						csvExport(structCsv.getw_COLUMN(),
    								String.valueOf(CSV_COLNO_TAX_CD + 1),
    								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
    								structCsv,
    								strTaxCd,
    								emsg.getMessage(locale));
    						_intErrorCount++;
    						continue;
    					}
    					// 禁則文字が入力されていた場合
    					if (CsvInCheck.chkHankaku(structCsv.getl_TAX_CD())) {
    						emsg = new ExpjMessage("AA01524");
    						csvExport(structCsv.getw_COLUMN(),
    								String.valueOf(CSV_COLNO_TAX_CD + 1),
    								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
    								structCsv,
    								strTaxCd,
    								emsg.getMessage(locale));
    						_intErrorCount++;
    						continue;
    					}
    				}
    				
    				// 20.消費税適用区分
    				if(!CsvInCheck.isNull(structCsv.getl_TAX_APPLY_TYP())){
    					// 整数以外の場合
    					if (!CsvInCheck.isIntegerChk(structCsv.getl_TAX_APPLY_TYP())) {
    						emsg = new ExpjMessage("AA01502");
    						csvExport(structCsv.getw_COLUMN(),
    								String.valueOf(CSV_COLNO_TAX_APPLY_TYP + 1),
    								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
    								structCsv,
    								strTaxApplyTyp,
    								emsg.getMessage(locale));
    						_intErrorCount++;
    						continue;
    					}
    				}
    				
    				// 21.消費税計算区分
    				if(!CsvInCheck.isNull(structCsv.getl_TAX_CALC_TYP())){
    					// 整数以外の場合
    					if (!CsvInCheck.isIntegerChk(structCsv.getl_TAX_CALC_TYP())) {
    						emsg = new ExpjMessage("AA01502");
    						csvExport(structCsv.getw_COLUMN(),
    								String.valueOf(CSV_COLNO_TAX_CALC_TYP + 1),
    								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
    								structCsv,
    								strTaxCalcTyp,
    								emsg.getMessage(locale));
    						_intErrorCount++;
    						continue;
    					}
    				}
    				
    				// 22.検収計上区分
    				if(!CsvInCheck.isNull(structCsv.getl_INSPC_ACPT_APP_TYP())){
    					// 整数以外の場合
    					if (!CsvInCheck.isIntegerChk(structCsv.getl_INSPC_ACPT_APP_TYP())) {
    						emsg = new ExpjMessage("AA01502");
    						csvExport(structCsv.getw_COLUMN(),
    								String.valueOf(CSV_COLNO_INSPC_ACPT_APP_TYP + 1),
    								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
    								structCsv,
    								strInspcAcptAppTyp,
    								emsg.getMessage(locale));
    						_intErrorCount++;
    						continue;
    					}
    				}
    				
    				// 23.注文書発注フラグ
    				if(!CsvInCheck.isNull(structCsv.getl_ODR_FORM_FLG())){
    					// 整数以外の場合
    					if (!CsvInCheck.isIntegerChk(structCsv.getl_ODR_FORM_FLG())) {
    						emsg = new ExpjMessage("AA01502");
    						csvExport(structCsv.getw_COLUMN(),
    								String.valueOf(CSV_COLNO_ODR_FORM_FLG + 1),
    								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
    								structCsv,
    								strOdrFormFlg,
    								emsg.getMessage(locale));
    						_intErrorCount++;
    						continue;
    					}
    					// 整数2桁以上の場合
    					if (CsvInCheck.strLengthChk(structCsv.getl_ODR_FORM_FLG()) > 1) {
    						emsg = new ExpjMessage("AA01501");
    						csvExport(structCsv.getw_COLUMN(),
    								String.valueOf(CSV_COLNO_ODR_FORM_FLG + 1),
    								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
    								structCsv,
    								strOdrFormFlg,
    								emsg.getMessage(locale));
    						_intErrorCount++;
    						continue;
    					}
    				}
    				
    				// 24.EDI発注フラグ
    				if(!CsvInCheck.isNull(structCsv.getl_ODR_EDI_FLG())){
    					// 整数以外の場合
    					if (!CsvInCheck.isIntegerChk(structCsv.getl_ODR_EDI_FLG())) {
    						emsg = new ExpjMessage("AA01502");
    						csvExport(structCsv.getw_COLUMN(),
    								String.valueOf(CSV_COLNO_ODR_EDI_FLG + 1),
    								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
    								structCsv,
    								strOdrEdiFlg,
    								emsg.getMessage(locale));
    						_intErrorCount++;
    						continue;
    					}
    					// 整数2桁以上の場合
    					if (CsvInCheck.strLengthChk(structCsv.getl_ODR_EDI_FLG()) > 1) {
    						emsg = new ExpjMessage("AA01501");
    						csvExport(structCsv.getw_COLUMN(),
    								String.valueOf(CSV_COLNO_ODR_EDI_FLG + 1),
    								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
    								structCsv,
    								strOdrEdiFlg,
    								emsg.getMessage(locale));
    						_intErrorCount++;
    						continue;
    					}
    				}
    				
    				// 25.備考
    				if(!CsvInCheck.isNull(structCsv.getl_VEND_REM())){
    					// 文字81桁以上の場合
    					if (CsvInCheck.strLengthChk(structCsv.getl_VEND_REM()) > 80) {
    						emsg = new ExpjMessage("AA01501");
    						csvExport(structCsv.getw_COLUMN(),
    								String.valueOf(CSV_COLNO_VEND_REM + 1),
    								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
    								structCsv,
    								strVendRem,
    								emsg.getMessage(locale));
    						_intErrorCount++;
    						continue;
    					}
    					// 禁則文字が入力されていた場合
    					if (CsvInCheck.chkHankaku(structCsv.getl_VEND_REM())) {
    						emsg = new ExpjMessage("AA01524");
    						csvExport(structCsv.getw_COLUMN(),
    								String.valueOf(CSV_COLNO_VEND_REM + 1),
    								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
    								structCsv,
    								strVendRem,
    								emsg.getMessage(locale));
    						_intErrorCount++;
    						continue;
    					}
    				}
    				
    				// 26.取引通貨コード
    				if(!CsvInCheck.isNull(structCsv.getl_CUR_CD())){
    					// 文字26桁以上の場合
    					if (CsvInCheck.strLengthChk(structCsv.getl_CUR_CD()) > 25) {
    						emsg = new ExpjMessage("AA01501");
    						csvExport(structCsv.getw_COLUMN(),
    								String.valueOf(CSV_COLNO_CUR_CD + 1),
    								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
    								structCsv,
    								strCurCd,
    								emsg.getMessage(locale));
    						_intErrorCount++;
    						continue;
    					}
    					// 禁則文字が入力されていた場合
    					if (CsvInCheck.chkHankaku(structCsv.getl_CUR_CD())) {
    						emsg = new ExpjMessage("AA01524");
    						csvExport(structCsv.getw_COLUMN(),
    								String.valueOf(CSV_COLNO_CUR_CD + 1),
    								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
    								structCsv,
    								strCurCd,
    								emsg.getMessage(locale));
    						_intErrorCount++;
    						continue;
    					}
    				}
    				
    				// 27.為替種別
    				if(!CsvInCheck.isNull(structCsv.getl_EXCH_TYP())){
    					// 整数以外の場合
    					if (!CsvInCheck.isIntegerChk(structCsv.getl_EXCH_TYP())) {
    						emsg = new ExpjMessage("AA01502");
    						csvExport(structCsv.getw_COLUMN(),
    								String.valueOf(CSV_COLNO_EXCH_TYP + 1),
    								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
    								structCsv,
    								strExchTyp,
    								emsg.getMessage(locale));
    						_intErrorCount++;
    						continue;
    					}
    				}
    				
    				// 28.輸入取引区分
    				if(!CsvInCheck.isNull(structCsv.getl_IMPORT_TRN_TYP())){
    					// 整数以外の場合
    					if (!CsvInCheck.isIntegerChk(structCsv.getl_IMPORT_TRN_TYP())) {
    						emsg = new ExpjMessage("AA01502");
    						csvExport(structCsv.getw_COLUMN(),
    								String.valueOf(CSV_COLNO_IMPORT_TRN_TYP + 1),
    								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
    								structCsv,
    								strImportTrnTyp,
    								emsg.getMessage(locale));
    						_intErrorCount++;
    						continue;
    					}
    				}
    				
    				// 29.販売単価遡及フラグ
    				if(!CsvInCheck.isNull(structCsv.getl_UNIT_COST_RETROACTION_FLG())){
    					// 整数以外の場合
    					if (!CsvInCheck.isIntegerChk(structCsv.getl_UNIT_COST_RETROACTION_FLG())) {
    						emsg = new ExpjMessage("AA01502");
    						csvExport(structCsv.getw_COLUMN(),
    								String.valueOf(CSV_COLNO_UNIT_COST_RET_FLG + 1),
    								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
    								structCsv,
    								strUnitCostRetFlg,
    								emsg.getMessage(locale));
    						_intErrorCount++;
    						continue;
    					}
    				}
    				
    				// ★コンボチェック
    				// 18.発注金額まるめ区分
    				if(!CsvInCheck.isNull(structCsv.getl_ROUND_TYP())){
    					if(!CsvInCheck.chkValue(_COM_ROUND_TYP, structCsv.getl_ROUND_TYP())){
    						// 【コンボボックスデータに存在する数値を指定してください】
    						emsg = new ExpjMessage("AA01504");
    						csvExport(structCsv.getw_COLUMN(),
    								String.valueOf(CSV_COLNO_ROUND_TYP + 1),
    								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
    								structCsv,
    								strRoundTyp,
    								emsg.getMessage(locale));
    						_intErrorCount++;
    						continue;
    					}
    				}
    				// 20.消費税適用区分
    				if(!CsvInCheck.isNull(structCsv.getl_TAX_APPLY_TYP())){
    					if(!CsvInCheck.chkValue(_COM_TAX_APPLY_TYP, structCsv.getl_TAX_APPLY_TYP())){
    						// 【コンボボックスデータに存在する数値を指定してください】
    						emsg = new ExpjMessage("AA01504");
    						csvExport(structCsv.getw_COLUMN(),
    								String.valueOf(CSV_COLNO_TAX_APPLY_TYP + 1),
    								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
    								structCsv,
    								strTaxApplyTyp,
    								emsg.getMessage(locale));
    						_intErrorCount++;
    						continue;
    					}
    				}
    				// 21.消費税計算区分
    				if(!CsvInCheck.isNull(structCsv.getl_TAX_CALC_TYP())){
    					if(!CsvInCheck.chkValue(_COM_TAX_CALC_TYP, structCsv.getl_TAX_CALC_TYP())){
    						// 【コンボボックスデータに存在する数値を指定してください】
    						emsg = new ExpjMessage("AA01504");
    						csvExport(structCsv.getw_COLUMN(),
    								String.valueOf(CSV_COLNO_TAX_CALC_TYP + 1),
    								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
    								structCsv,
    								strTaxCalcTyp,
    								emsg.getMessage(locale));
    						_intErrorCount++;
    						continue;
    					}
    				}
    				// 22.検収計上区分
    				if(!CsvInCheck.isNull(structCsv.getl_INSPC_ACPT_APP_TYP())){
    					if(!CsvInCheck.chkValue(_COM_INSPC_ACPT_APP_TYP, structCsv.getl_INSPC_ACPT_APP_TYP())){
    						// 【コンボボックスデータに存在する数値を指定してください】
    						emsg = new ExpjMessage("AA01504");
    						csvExport(structCsv.getw_COLUMN(),
    								String.valueOf(CSV_COLNO_INSPC_ACPT_APP_TYP + 1),
    								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
    								structCsv,
    								strInspcAcptAppTyp,
    								emsg.getMessage(locale));
    						_intErrorCount++;
    						continue;
    					}
    				}
    				// 27.為替種別
    				if(!CsvInCheck.isNull(structCsv.getl_EXCH_TYP())){
    					if(!CsvInCheck.chkValue(_COM_EXCH_TYP, structCsv.getl_EXCH_TYP())){
    						// 【コンボボックスデータに存在する数値を指定してください】
    						emsg = new ExpjMessage("AA01504");
    						csvExport(structCsv.getw_COLUMN(),
    								String.valueOf(CSV_COLNO_EXCH_TYP + 1),
    								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
    								structCsv,
    								strExchTyp,
    								emsg.getMessage(locale));
    						_intErrorCount++;
    						continue;
    					}
    				}
    				// 28.輸入取引区分
    				if(!CsvInCheck.isNull(structCsv.getl_IMPORT_TRN_TYP())){
    					if(!CsvInCheck.chkValue(_COM_IMPORT_TRN_TYP, structCsv.getl_IMPORT_TRN_TYP())){
    						// 【コンボボックスデータに存在する数値を指定してください】
    						emsg = new ExpjMessage("AA01504");
    						csvExport(structCsv.getw_COLUMN(),
    								String.valueOf(CSV_COLNO_IMPORT_TRN_TYP + 1),
    								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
    								structCsv,
    								strImportTrnTyp,
    								emsg.getMessage(locale));
    						_intErrorCount++;
    						continue;
    					}
    				}
    				// 29.販売単価遡及フラグ
    				if(!CsvInCheck.isNull(structCsv.getl_UNIT_COST_RETROACTION_FLG())){
    					if(!CsvInCheck.chkValue(_COM_UNIT_COST_RET_FLG, structCsv.getl_UNIT_COST_RETROACTION_FLG())){
    						// 【コンボボックスデータに存在する数値を指定してください】
    						emsg = new ExpjMessage("AA01504");
    						csvExport(structCsv.getw_COLUMN(),
    								String.valueOf(CSV_COLNO_UNIT_COST_RET_FLG + 1),
    								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
    								structCsv,
    								strUnitCostRetFlg,
    								emsg.getMessage(locale));
    						_intErrorCount++;
    						continue;
    					}
    				}
                }
                
                // 登録と削除の場合
                if ("true".equals(_strRdoInsert) || "true".equals(_strRdoDelete)) {
                	//同一キーがCSV内で重複している場合（キー：取引先コード）
    				checkFlag = true;
					for (int j = 0; j < listCsv.size(); j++) {
						tempStruct = (AA0210010Struct) listCsv.get(j);
						if (structCsv.getOUT_VEND_CD().equals(tempStruct.getOUT_VEND_CD())) {
							if(j!=i){
								emsg = new ExpjMessage("AA34134", String.valueOf(j+1));
								csvExport(
										structCsv.getw_COLUMN(),
										CSV_COLNO_99,
										String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
										structCsv,
										strVendCd,
										emsg.getMessage(locale));
								checkFlag = false;
							}
						}
					}
					if(!checkFlag){
						_intErrorCount++;
						continue;
					}
                }

				// ★登録更新チェック
				// １.登録ラジオボタンが選択されたときのみチェックを行う。(※登録時のみ)
				if ("true".equals(_strRdoInsert)) {
					// ログインユーザの所属会社コードと「取引先コード」 で検索し、すでに [取引先] に存在した場合
					tempList = entity.mcheckVEND_CTRL.read(conn, structCsv);
					if (tempList.size() > 0) {
						// 【指定キーのデータがすでに存在します。】
						emsg = new ExpjMessage("ZZ01102");
						csvExport(structCsv.getw_COLUMN(),
								CSV_COLNO_99,
								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
								structCsv,
								strVendCd,
								emsg.getMessage(locale));
						_intErrorCount++;
						continue;
					}
				}
				// ２.更新ラジオボタンが選択されたときのみチェックを行う。(※更新/削除のみ)
				if ("true".equals(_strRdoUpdate) || "true".equals(_strRdoDelete)) {
					// ログインユーザの所属会社コードと「取引先コード」 で検索し、[取引先] に存在しない場合
					tempList = entity.mcheckVEND_CTRL.read(conn, structCsv);
					if (tempList.size() <= 0) {
						// 【対象データが存在しません。】
						emsg = new ExpjMessage("ZZ06001");
						csvExport(structCsv.getw_COLUMN(),
								CSV_COLNO_99,
								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
								structCsv,
								strVendCd,
								emsg.getMessage(locale));
						_intErrorCount++;
						continue;
					}
				}
				// ３.登録/更新ラジオボタンが選択されたときのみチェックを行う。(※登録/更新のみ)
				if ("true".equals(_strRdoInsert) || "true".equals(_strRdoUpdate)) {
					// 「消費税コード」 に [消費税区分] に存在しない消費税コードを入力した場合
					if (!CsvInCheck.isNull(structCsv.getl_TAX_CD())) {
						tempList = entity.mselectM_TAX.read(conn, structCsv);
						if (tempList.size() <= 0) {
							// 【指定した消費税コードは未登録です。】
							emsg = new ExpjMessage("AA01001");
							csvExport(structCsv.getw_COLUMN(),
									String.valueOf(CSV_COLNO_TAX_CD + 1),
									String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
									structCsv,
									strTaxCd,
									emsg.getMessage(locale));
							_intErrorCount++;
							continue;
						}
					}
					
					// 「取引通貨コード」 が [通貨] に存在しない場合
					if (!CsvInCheck.isNull(structCsv.getl_CUR_CD())) {
						tempList = entity.mselectM_CUR.read(conn, structCsv);
						if (tempList.size() <= 0) {
							// 【通貨コードが通貨マスタに存在しません。】
							emsg = new ExpjMessage("AA10011");
							csvExport(structCsv.getw_COLUMN(),
									String.valueOf(CSV_COLNO_CUR_CD + 1),
									String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
									structCsv,
									strCurCd,
									emsg.getMessage(locale));
							_intErrorCount++;
							continue;
						}
					}
					
					// 「自社担当者コード」 が入力ありの場合で、「ログインユーザの所属会社コード」「自社担当者コード」で [ユーザマスタ]を検索し、存在しない場合
					if (!CsvInCheck.isNull(structCsv.getl_OWN_PERSON_CD())) {
						tempList = entity.mselectOWN_PERSON_CD.read(conn, structCsv);
						if (tempList.size() <= 0) {
							// 自社担当者名のクリア
							structCsv.setl_OWN_PERSON_NAME("");
							// 【担当者コードが利用者マスタに登録されていません。】
							emsg = new ExpjMessage("AA00158");
							csvExport(structCsv.getw_COLUMN(),
									String.valueOf(CSV_COLNO_OWN_PERSON_CD + 1),
									String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
									structCsv,
									strOwnPersonCd,
									emsg.getMessage(locale));
							_intErrorCount++;
							continue;
						}
					}
				}
				
				// ４.削除ラジオボタンが選択されたときのみチェックを行う。(※削除のみ)
				if ("true".equals(_strRdoDelete)) {
					// 1.参照整合性検証：作業系列
					tempList = entity.mselectM_PROC_GRP.read(conn, structCsv);
					if (tempList.size() != 0) {
						// エラーメッセージ設定
						emsg = new ExpjMessage("AA00094");
						csvExport(structCsv.getw_COLUMN(),
								String.valueOf(CSV_COLNO_VEND_CD + 1),
								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
								structCsv,
								strVendCd,
								emsg.getMessage(locale));
						_intErrorCount++;
						continue;
					}

					// 2.参照整合性検証：保管区
					tempList = entity.mselectM_WH.read(conn, structCsv);
					if (tempList.size() != 0) {
						// エラーメッセージ設定
						emsg = new ExpjMessage("AA00095");
						csvExport(structCsv.getw_COLUMN(),
								String.valueOf(CSV_COLNO_VEND_CD + 1),
								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
								structCsv,
								strVendCd,
								emsg.getMessage(locale));
						_intErrorCount++;
						continue;
					}

					// 3.参照整合性検証：購入単価ヘッダ
					tempList = entity.mselectM_PUCH_UNIT_COST_H.read(conn, structCsv);
					if (tempList.size() != 0) {
						// エラーメッセージ設定
						emsg = new ExpjMessage("AA00096");
						csvExport(structCsv.getw_COLUMN(),
								String.valueOf(CSV_COLNO_VEND_CD + 1),
								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
								structCsv,
								strVendCd,
								emsg.getMessage(locale));
						_intErrorCount++;
						continue;
					}

					// 4.参照整合性検証：外注単価ヘッダ
					tempList = entity.mselectM_SBCNT_UNIT_COST_H.read(conn, structCsv);
					if (tempList.size() != 0) {
						// エラーメッセージ設定
						emsg = new ExpjMessage("AA00097");
						csvExport(structCsv.getw_COLUMN(),
								String.valueOf(CSV_COLNO_VEND_CD + 1),
								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
								structCsv,
								strVendCd,
								emsg.getMessage(locale));
						_intErrorCount++;
						continue;
					}

					// 5.参照整合性検証：作業系列別仕掛
					tempList = entity.mselectT_WORK_IN_PROC_BY_PROC.read(conn, structCsv);
					if (tempList.size() != 0) {
						// エラーメッセージ設定
						emsg = new ExpjMessage("AA00098");
						csvExport(structCsv.getw_COLUMN(),
								String.valueOf(CSV_COLNO_VEND_CD + 1),
								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
								structCsv,
								strVendCd,
								emsg.getMessage(locale));
						_intErrorCount++;
						continue;
					}

					// 6.参照整合性検証：発注残
					tempList = entity.mselectT_RLSD_PUSH_ODR.read(conn, structCsv);
					if (tempList.size() != 0) {
						// エラーメッセージ設定
						emsg = new ExpjMessage("AA00099");
						csvExport(structCsv.getw_COLUMN(),
								String.valueOf(CSV_COLNO_VEND_CD + 1),
								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
								structCsv,
								strVendCd,
								emsg.getMessage(locale));
						_intErrorCount++;
						continue;
					}

	                // 7.参照整合性検証：有償支給履歴
					tempList = entity.mselectT_PAST_ONEROUS_CONS.read(conn, structCsv);
	                if (tempList.size() != 0 ) {
						// エラーメッセージ設定
						emsg = new ExpjMessage("AA00999");
						csvExport(structCsv.getw_COLUMN(),
								String.valueOf(CSV_COLNO_VEND_CD + 1),
								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
								structCsv,
								strVendCd,
								emsg.getMessage(locale));
						_intErrorCount++;
						continue;
					}


	                // 8.参照整合性検証：購入返品実績
	                tempList = entity.mselectT_PUCH_ODR_RTN_RSLT.read(conn, structCsv);
	                if (tempList.size() != 0 ) {
						// エラーメッセージ設定
						emsg = new ExpjMessage("AA01000");
						csvExport(structCsv.getw_COLUMN(),
								String.valueOf(CSV_COLNO_VEND_CD + 1),
								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
								structCsv,
								strVendCd,
								emsg.getMessage(locale));
						_intErrorCount++;
						continue;
					}
	                
	                // 9.参照整合性検証：支給単価
	                tempList = entity.mselectM_CONS_UNIT_COST.read(conn, structCsv);
	                if(tempList.size() != 0){
						// エラーメッセージ設定
	                	emsg = new ExpjMessage("AA02011");
						csvExport(structCsv.getw_COLUMN(),
								String.valueOf(CSV_COLNO_VEND_CD + 1),
								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
								structCsv,
								strVendCd,
								emsg.getMessage(locale));
						_intErrorCount++;
						continue;
	                }
	                
	                // 10.参照整合性検証：積送在庫
	                tempList = entity.mselect_T_TRANSPORT_STOCK.read(conn, structCsv);
	                if(tempList.size() != 0){
						// エラーメッセージ設定
	                	emsg = new ExpjMessage("CA00133");
						csvExport(structCsv.getw_COLUMN(),
								String.valueOf(CSV_COLNO_VEND_CD + 1),
								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
								structCsv,
								strVendCd,
								emsg.getMessage(locale));
						_intErrorCount++;
						continue;
	                }
	                
	                // 11.参照整合性検証：出庫指示
	                tempList = entity.mselect_T_ISSUE_INST.read(conn, structCsv);
	                if(tempList.size() != 0){
						// エラーメッセージ設定
	                	emsg = new ExpjMessage("CA00134");
						csvExport(structCsv.getw_COLUMN(),
								String.valueOf(CSV_COLNO_VEND_CD + 1),
								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
								structCsv,
								strVendCd,
								emsg.getMessage(locale));
						_intErrorCount++;
						continue;
	                }
	                
	                structCsv.setOPTION_ID("C*");
					tempList  = entity.mgetSYS_INSTALL_OPTIONS.read(conn, structCsv);
					if (tempList.size() > 0) {
						tempStruct = (AA0210010Struct) tempList.get(0);
						structCsv.setINSTALL_FLG(tempStruct.getINSTALL_FLG());
					}
					if("1".equals(structCsv.getINSTALL_FLG())){
						// 参照整合性検証：買掛金残高 
						tempList = entity.mselect_T_DEBT_BALANCE.read(conn, structCsv);
						if (tempList.size() != 0) {
							// エラーメッセージ設定
		                	emsg = new ExpjMessage("CA00135");
							csvExport(structCsv.getw_COLUMN(),
									String.valueOf(CSV_COLNO_VEND_CD + 1),
									String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
									structCsv,
									strVendCd,
									emsg.getMessage(locale));
							_intErrorCount++;
							continue;
						}
						// 参照整合性検証：買掛金残高明細
						tempList = entity.mselect_T_DEBT_BALANCE_D.read(conn, structCsv);
						if (tempList.size() != 0) {
							// エラーメッセージ設定
		                	emsg = new ExpjMessage("CA00136");
							csvExport(structCsv.getw_COLUMN(),
									String.valueOf(CSV_COLNO_VEND_CD + 1),
									String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
									structCsv,
									strVendCd,
									emsg.getMessage(locale));
							_intErrorCount++;
							continue;
						}
						// 参照整合性検証：買掛金元帳ヘッダ
						tempList = entity.mselect_T_DEBT_LEDGER_H.read(conn, structCsv);
						if (tempList.size() != 0) {
							// エラーメッセージ設定
		                	emsg = new ExpjMessage("CA00137");
							csvExport(structCsv.getw_COLUMN(),
									String.valueOf(CSV_COLNO_VEND_CD + 1),
									String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
									structCsv,
									strVendCd,
									emsg.getMessage(locale));
							_intErrorCount++;
							continue;
						}
						// 参照整合性検証：買掛金トランヘッダ
						tempList = entity.mselect_T_DEBT_LEDGER_H_TRN.read(conn, structCsv);
						if (tempList.size() != 0) {
							// エラーメッセージ設定
		                	emsg = new ExpjMessage("CA00138");
							csvExport(structCsv.getw_COLUMN(),
									String.valueOf(CSV_COLNO_VEND_CD + 1),
									String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
									structCsv,
									strVendCd,
									emsg.getMessage(locale));
							_intErrorCount++;
							continue;
						}
						// 参照整合性検証：支払
						tempList = entity.mselect_T_PAYMENT.read(conn, structCsv);
						if (tempList.size() != 0) {
							// エラーメッセージ設定
		                	emsg = new ExpjMessage("CA00139");
							csvExport(structCsv.getw_COLUMN(),
									String.valueOf(CSV_COLNO_VEND_CD + 1),
									String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
									structCsv,
									strVendCd,
									emsg.getMessage(locale));
							_intErrorCount++;
							continue;
						}
						// 参照整合性検証：支払集計
						tempList = entity.mselect_T_PAYMENT_CALC.read(conn, structCsv);
						if (tempList.size() != 0) {
							// エラーメッセージ設定
		                	emsg = new ExpjMessage("CA00140");
							csvExport(structCsv.getw_COLUMN(),
									String.valueOf(CSV_COLNO_VEND_CD + 1),
									String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
									structCsv,
									strVendCd,
									emsg.getMessage(locale));
							_intErrorCount++;
							continue;
						}
					}
				}
			} // End for
			
			// 正常レコード件数
			_intSuccessCount = _intTotalCount - _intErrorCount - _intWarningCount;
			if (_intErrorCount > 0) {
				return false;
			} else {
				return true;
			}
		} catch(Exception e){
            ExpjMessage emsg = new ExpjMessage( "AH00042", "0", "0");
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
    private boolean csvExportCorrection( AA0210010Struct target_struct , String SyoriKbn,
    		String DataKbn ,boolean bWrite)
    {
        // CSVファイル編集用
        String csvStr = "";
        String strTmp = "";
        BufferedWriter outStream = null;
        AA0210010Struct structCsv = new AA0210010Struct();

        try {
        	// 変更データ区分が(1:変更前データ)だった場合。
            if (DataKbn == "1" )
            {
            	// *更新前のデータの取得*
                List tempList = entity.mselectM_VEND_CTRL.read(conn, target_struct);
                structCsv = (AA0210010Struct) tempList.get(0);
            }else{
            	structCsv = target_struct;
            }
        	
            // 処理日時
            csvStr = '"' + _strSysdate + '"' + "," ;
            // 処理ユーザーＩＤ
            csvStr = csvStr + '"' + getsysUSER_CD() + '"' + "," ;
            // 処理区分
            csvStr = csvStr + '"' + SyoriKbn + '"' + "," ;
            // 変更データ区分
            csvStr = csvStr + '"' + DataKbn + '"' + "," ;
            // 取引先コード
            csvStr = csvStr + '"' + target_struct.getOUT_VEND_CD() + '"' + "," ;
            // 取引先名称
            csvStr = csvStr + '"' + structCsv.getl_VEND_NAME() + '"' + "," ;
			// 取引先略称
            csvStr = csvStr + '"' + structCsv.getl_VEND_ANAME() + '"' + "," ;
            // 取引先カナ名称
            if(structCsv.getl_VEND_KNAME() == null){
                csvStr = csvStr + '"' + strTmp + '"' + "," ;
            } else {
                csvStr = csvStr + '"' + structCsv.getl_VEND_KNAME() + '"' + "," ;
            }
			// 郵便番号
			if (structCsv.getl_ZIP_CD() == null) {
				csvStr = csvStr + '"' + strTmp + '"' + ",";
			} else {
				csvStr = csvStr + '"' + structCsv.getl_ZIP_CD() + '"' + ",";
			}
			// 住所1
            csvStr = csvStr + '"' + structCsv.getl_ADDRESS_1() + '"' + "," ;
			// 住所2
			if (structCsv.getl_ADDRESS_2() == null) {
				csvStr = csvStr + '"' + strTmp + '"' + ",";
			} else {
				csvStr = csvStr + '"' + structCsv.getl_ADDRESS_2() + '"' + ",";
			}
			// 住所(カナ)1
			if (structCsv.getl_ADDRESS_K_1() == null) {
				csvStr = csvStr + '"' + strTmp + '"' + ",";
			} else {
				csvStr = csvStr + '"' + structCsv.getl_ADDRESS_K_1() + '"'
						+ ",";
			}
			// 住所(カナ)2
			if (structCsv.getl_ADDRESS_K_2() == null) {
				csvStr = csvStr + '"' + strTmp + '"' + ",";
			} else {
				csvStr = csvStr + '"' + structCsv.getl_ADDRESS_K_2() + '"'
						+ ",";
			}
			// 電話番号
			if (structCsv.getl_TEL() == null) {
				csvStr = csvStr + '"' + strTmp + '"' + ",";
			} else {
				csvStr = csvStr + '"' + structCsv.getl_TEL() + '"' + ",";
			}
			// FAX番号
			if (structCsv.getl_FAX() == null) {
				csvStr = csvStr + '"' + strTmp + '"' + ",";
			} else {
				csvStr = csvStr + '"' + structCsv.getl_FAX() + '"' + ",";
			}
			// メールアドレス
			if (structCsv.getl_EMAIL() == null) {
				csvStr = csvStr + '"' + strTmp + '"' + ",";
			} else {
				csvStr = csvStr + '"' + structCsv.getl_EMAIL() + '"' + ",";
			}
			// 相手先担当部門
			if (structCsv.getl_VEND_ORG() == null) {
				csvStr = csvStr + '"' + strTmp + '"' + ",";
			} else {
				csvStr = csvStr + '"' + structCsv.getl_VEND_ORG() + '"' + ",";
			}
			// 相手先担当者
			if (structCsv.getl_VEND_PERSON() == null) {
				csvStr = csvStr + '"' + strTmp + '"' + ",";
			} else {
				csvStr = csvStr + '"' + structCsv.getl_VEND_PERSON() + '"'
						+ ",";
			}
			// 自社担当部門コード
			if (structCsv.getl_OWN_ORG_CD() == null) {
				csvStr = csvStr + '"' + strTmp + '"' + ",";
			} else {
				csvStr = csvStr + '"' + structCsv.getl_OWN_ORG_CD() + '"' + ",";
			}
			// 自社担当部門名
			if (structCsv.getl_OWN_ORG_NAME() == null) {
				csvStr = csvStr + '"' + strTmp + '"' + ",";
			} else {
				csvStr = csvStr + '"' + structCsv.getl_OWN_ORG_NAME() + '"'
						+ ",";
			}
			// 自社担当者コード
			if (structCsv.getl_OWN_PERSON_CD() == null) {
				csvStr = csvStr + '"' + strTmp + '"' + ",";
			} else {
				csvStr = csvStr + '"' + structCsv.getl_OWN_PERSON_CD() + '"'
						+ ",";
			}
			// 発注金額まるめ区分
			if (structCsv.getl_ROUND_TYP() == null) {
				csvStr = csvStr + '"' + strTmp + '"' + ",";
			} else {
				csvStr = csvStr + '"' + structCsv.getl_ROUND_TYP() + '"' + ",";
			}
			// 消費税コード
			if (structCsv.getl_TAX_CD() == null) {
				csvStr = csvStr + '"' + strTmp + '"' + ",";
			} else {
				csvStr = csvStr + '"' + structCsv.getl_TAX_CD() + '"' + ",";
			}
			// 消費税適用区分
			if (structCsv.getl_TAX_APPLY_TYP() == null) {
				csvStr = csvStr + '"' + strTmp + '"' + ",";
			} else {
				csvStr = csvStr + '"' + structCsv.getl_TAX_APPLY_TYP() + '"'
						+ ",";
			}
			// 消費税計算区分
			if (structCsv.getl_TAX_CALC_TYP() == null) {
				csvStr = csvStr + '"' + strTmp + '"' + ",";
			} else {
				csvStr = csvStr + '"' + structCsv.getl_TAX_CALC_TYP() + '"'
						+ ",";
			}
			// 検収計上区分
			if (structCsv.getl_INSPC_ACPT_APP_TYP() == null) {
				csvStr = csvStr + '"' + strTmp + '"' + ",";
			} else {
				csvStr = csvStr + '"' + structCsv.getl_INSPC_ACPT_APP_TYP()
						+ '"' + ",";
			}
			// 注文書発注フラグ
			if (structCsv.getl_ODR_FORM_FLG() == null) {
				csvStr = csvStr + '"' + strTmp + '"' + ",";
			} else {
				csvStr = csvStr + '"' + structCsv.getl_ODR_FORM_FLG() + '"'
						+ ",";
			}
			// EDI発注フラグ
			if (structCsv.getl_ODR_EDI_FLG() == null) {
				csvStr = csvStr + '"' + strTmp + '"' + ",";
			} else {
				csvStr = csvStr + '"' + structCsv.getl_ODR_EDI_FLG() + '"'
						+ ",";
			}
			// 備考
			if (structCsv.getl_VEND_REM() == null) {
				csvStr = csvStr + '"' + strTmp + '"' + ",";
			} else {
				csvStr = csvStr + '"' + structCsv.getl_VEND_REM() + '"' + ",";
			}
			// 取引通貨コード
			if (structCsv.getl_CUR_CD() == null) {
				csvStr = csvStr + '"' + strTmp + '"' + ",";
			} else {
				csvStr = csvStr + '"' + structCsv.getl_CUR_CD() + '"' + ",";
			}
			// 為替種別
			if (structCsv.getl_EXCH_TYP() == null) {
				csvStr = csvStr + '"' + strTmp + '"' + ",";
			} else {
				csvStr = csvStr + '"' + structCsv.getl_EXCH_TYP() + '"' + ",";
			}
			// 輸入取引区分
			if (structCsv.getl_IMPORT_TRN_TYP() == null) {
				csvStr = csvStr + '"' + strTmp + '"' + ",";
			} else {
				csvStr = csvStr + '"' + structCsv.getl_IMPORT_TRN_TYP() + '"'
						+ ",";
			}
			// 販売単価遡及フラグ
			if (structCsv.getl_UNIT_COST_RETROACTION_FLG() == null) {
				csvStr = csvStr + '"' + strTmp + '"';
			} else {
				csvStr = csvStr + '"'
						+ structCsv.getl_UNIT_COST_RETROACTION_FLG() + '"';
			}
			
			// 訂正ログ出力(出力ファイル名セット)
			if (bWrite) {
				outStream = new BufferedWriter(new FileWriter(struct.getCANCEL_FILE(), true));
			} else {
				outStream = new BufferedWriter(new FileWriter(struct.getCANCEL_FILE(), false));
			}
			// ファイルに書込
			outStream.write(csvStr);
			// 改行コード付加
			outStream.newLine();
			// BufferedWriterクローズ
			outStream.close();
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
	 * ＣＳＶデータ反映処理
	 * @param csvList
	 * @return
	 * @throws FoundationException 
	 */
	private boolean csvDataToDb(List csvList) throws BusinessProcessException, FoundationException {
		
		int intCsvDataCount = 0; // 対象データ件数
		boolean bWrite = false; // 書くファイル
		// ログ出力情報格納用
        String logMessage = "";
        AA0210010Struct structCsv = null;
        boolean bSuccess = false;   // 処理成功フラグ初期化
        boolean bDBUpdate = false;  // DB更新中フラグ初期化
		
		try {
			// トランザクション開始
			conn.beginTransWeb();
			// DB更新中フラグON
            bDBUpdate = true;
			
			// システム日付取得
            beginTransaction();
			_strSysdate = struct.getsSysdate();

			intCsvDataCount = csvList.size();
			// 親画面のラジオボタンが1:登録の場合の処理
			if ("true".equals(_strRdoInsert)) {
				// データ数分処理を繰り返す
				for (int i = 0; i < intCsvDataCount; i++) {
					structCsv = (AA0210010Struct) csvList.get(i);
					
					// ﾕｰｻﾞIDを設定する
					structCsv.setsUser_ID(sysUSER_CD);
					// [手配先情報]の登録
					entity.minsertM_VEND_CTRL.create(conn, structCsv);
					
					// 訂正CSV出力処理(引数:対象データ、ユーザーID、処理区分、変更データ区分)
					csvExportCorrection(structCsv, "1", "2", bWrite);
					bWrite = true;
				}
			}
			
			// 親画面のラジオボタンが2:変更の場合の処理
			if ("true".equals(_strRdoUpdate)) {
				// データ数分処理を繰り返す
				for (int i = 0; i < intCsvDataCount; i++) {
					structCsv = (AA0210010Struct) csvList.get(i);
					
					// 訂正CSV出力処理(引数:対象データ、ユーザーID、処理区分、変更データ区分)
					csvExportCorrection(structCsv, "2", "1", bWrite);
					bWrite = true;
										
					// ﾕｰｻﾞIDを設定する
					structCsv.setsUser_ID(sysUSER_CD);
					// [手配先情報]の登録
					entity.mupdateM_VEND_CTRL.update(conn, structCsv);
					
					// 訂正CSV出力処理(引数:対象データ、ユーザーID、処理区分、変更データ区分)
					csvExportCorrection(structCsv, "2", "2", bWrite);
					bWrite = true;
				}
			}
			
			// 親画面のラジオボタンが3:削除の場合の処理
			if ("true".equals(_strRdoDelete)) {
				// データ数分処理を繰り返す
				for (int i = 0; i < intCsvDataCount; i++) {
					structCsv = (AA0210010Struct) csvList.get(i);
					
					// 訂正CSV出力処理(引数:対象データ、ユーザーID、処理区分、変更データ区分)
					csvExportCorrection(structCsv, "3", "1", bWrite);
					bWrite = true;
					
					// ﾕｰｻﾞIDを設定する
					structCsv.setsUser_ID(sysUSER_CD);
					// [手配先情報]の登録
					entity.mdeleteM_VEND_CTRL.delete(conn, structCsv);
				}
			}
			conn.commit();
			
			// DB更新中フラグOFF
            bDBUpdate = false;

            // 処理成功フラグ設定
            bSuccess = true;
		} catch(SQLException e) {
            logMessage = "M_VEND_CTRL.VEND_CD:" +  structCsv.getOUT_VEND_CD();
            ExpjMessage emsg = new ExpjMessage( "ZZ01006", logMessage );
            sysLog.severe(emsg, getsysUSER_CD());
            setSqlExceptionMsg(e);
        } finally {
            // DB更新処理中に何らかのエラーが発生した場合はroolbackをおこなう
            if(bDBUpdate == true)
            {
                // ロールバック
                conn.rollback();
                logMessage = "Control：csvDataToDb - rollback!! ";
                setSyslogConfig(logMessage);
                // 更新失敗のメッセージ表示
                ExpjMessage emsg = new ExpjMessage( "AH00042", ""+intCsvDataCount, "0","0");
                msgStruct.addError( emsg );
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
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0210");
		logger.entering("AA0210010Control"+":USER="+struct.getsUser_ID(),"controlCsvImport");
			//{{user_implement_dev:<controlCsvImport>
		setList(null);
		// 親画面のstructを退避
		_strRdoInsert = struct.getrdoInsert();
		_strRdoUpdate = struct.getrdoUpdate();
		_strRdoDelete = struct.getrdoDelete();
		_strDoChk = struct.getDO_CHK();
                //}}user_implement_dev:<controlCsvImport>
		logger.exiting("AA0210010Control"+":USER="+struct.getsUser_ID(),"controlCsvImport");

		return;
	}

	/**
	 * 参照ボタン押下時に実行される処理です。
	 *
	 */
	public void controlBrowse() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0210");
		logger.entering("AA0210010Control"+":USER="+struct.getsUser_ID(),"controlBrowse");
			//{{user_implement_dev:<controlBrowse>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlBrowse>
		logger.exiting("AA0210010Control"+":USER="+struct.getsUser_ID(),"controlBrowse");

		return;
	}

	/**
	 * 取込ボタン押下時に実行される処理です。
	 *
	 */
	public void controlCsvIn() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0210");
		logger.entering("AA0210010Control"+":USER="+struct.getsUser_ID(),"controlCsvIn");
			//{{user_implement_dev:<controlCsvIn>
		// 全部レコード数
		_intTotalCount = 0;
		// エラーレコード件数
		_intErrorCount = 0;
		// 正常レコード件数
		_intSuccessCount = 0;
		// ワーニング件数
		_intWarningCount = 0;

		// 画面表示用リストクリア
		if (null == list) {
			list = new ArrayList();
		} else {
			list.clear();
		}

		// ＣＳＶデータ取得
		List listCsv = readCsvData();
		
		// ＣＳＶデータ取得成功
		if (listCsv != null) {
			if (!"true".equals(_strDoChk)) {
				// 処理取消用ファイル出力チェック
				if (!chkOutputFilePath()) {
					return;
				}
			}
			// ＣＳＶ項目のチェックと整合性チェックと登録前チェックを行う
			boolean checkFlg = checkCsvData(listCsv);
			// チェックボックス(チェックのみ行う)がチェックの場合、DBへのデータの反映は行わない。
			if ("true".equals(_strDoChk)) {
				// 【チェック処理を実行しました。（正常 {0}件、ワーニング{1}件、エラー{2}件)）】
				setInfoMessage("AA01517", String.valueOf(_intSuccessCount), String.valueOf(_intWarningCount), String.valueOf(_intErrorCount));
			} else {
				if(checkFlg){
					// ＣＳＶデータ反映処理
					if (csvDataToDb(listCsv)) {
						// エラー・ワーニングがない場合
						if (_intWarningCount == 0) {
							// 【正常に取り込みました。（正常 {0}件）】
							setInfoMessage("AA01514", String.valueOf(_intSuccessCount));
						}
						// ワーニングだけがある場合
						else {
							// 【取り込みましたが、ワーニングがあります。（正常 {0}件、ワーニング{1}件）】
							setWarningMessage("AA01515", String.valueOf(_intSuccessCount), String.valueOf(_intWarningCount));
						}
					}
				}else {
					// エラーがある場合
					setErrorMessage("AA01516", String.valueOf(_intSuccessCount), String.valueOf(_intWarningCount), String.valueOf(_intErrorCount));
				}
			}
		}
                //}}user_implement_dev:<controlCsvIn>
		logger.exiting("AA0210010Control"+":USER="+struct.getsUser_ID(),"controlCsvIn");

		return;
	}

	/**
	 * CSV出力ボタン押下時に実行される処理です。
	 *
	 */
	public void controlCsvOut() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0210");
		logger.entering("AA0210010Control"+":USER="+struct.getsUser_ID(),"controlCsvOut");
			//{{user_implement_dev:<controlCsvOut>
		_csvWriter = new CsvWriter(CsvWriter.getFileName(getsysUSER_CD()));

		List csvList = new ArrayList();
		// CSV情報の作成
		// タイトル情報設定
		String csvTitle[] = { "Expj.Cmt3094", 	// エラー箇所
							  "Expj.Cmt3095", 	// エラー区分
							  "Expj.VEND_CD", 	// 取引先コード
							  "Expj.Cmt3097", 	// エラー項目名
							  "Expj.Cmt3098" 	// エラー内容
		};
		// CSVリストに入れる
		csvList.add(csvTitle);

		AA0210010Struct workStruct;
		// 明細内容設定
		for (int i = 0; i < getListsize(); i++) {
			workStruct = getListvalue(i);
			String csvStr[] = new String[csvTitle.length];
			csvStr[0] = workStruct.getl_ERR_ADR();				// エラー箇所
			csvStr[1] = workStruct.getl_ERR_TYP();				// エラー区分
			csvStr[2] = workStruct.getOUT_VEND_CD();			// 取引先コード
			csvStr[3] = workStruct.getl_ERROR_FIELD_NAME();		// エラー項目名
			csvStr[4] = workStruct.getl_ERR_TEXT();				// エラー内容
			csvList.add(csvStr);// CSVリストに入れる
		}

		if (csvList != null && csvList.size() > 0) {
			try {
				// csvファイルに書く
				_csvWriter.write(csvList, CoreTools.getLocale(struct.getsUser_ID()), true);
				struct.setDOWNLOAD_FILE(_csvWriter.getFilePath());
			} catch (Exception e) {
				// CSV出力失敗
				ExpjMessage emsg = new ExpjMessage("ZZ01107");
				sysLog.severe(emsg, getsysUSER_CD());
				ExpjException ee = new ExpjException(e, emsg);
				throw ee;
			}
		}
                //}}user_implement_dev:<controlCsvOut>
		logger.exiting("AA0210010Control"+":USER="+struct.getsUser_ID(),"controlCsvOut");

		return;
	}

	/**
	 * 戻るボタン押下時に実行される処理です。
	 *
	 */
	public void controlreturn_sub1() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0210");
		logger.entering("AA0210010Control"+":USER="+struct.getsUser_ID(),"controlreturn_sub1");
			//{{user_implement_dev:<controlreturn_sub1>
		controlClear();
                //}}user_implement_dev:<controlreturn_sub1>
		logger.exiting("AA0210010Control"+":USER="+struct.getsUser_ID(),"controlreturn_sub1");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0210");
		logger.entering("AA0210010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
		// クリア処理
        this.struct.clear();
        this.struct.setrdoInsert("true");
        this.struct.setrdoUpdate("false");
        this.struct.setrdoDelete("false");
        this.struct.setDO_CHK("false");

        setReadStatus(INITIAL);
                //}}user_implement_dev:<controlClear>
		logger.exiting("AA0210010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * 閉じるボタン押下時に実行される処理です。
	 *
	 */
	public void controlClose() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0210");
		logger.entering("AA0210010Control"+":USER="+struct.getsUser_ID(),"controlClose");
			//{{user_implement_dev:<controlClose>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlClose>
		logger.exiting("AA0210010Control"+":USER="+struct.getsUser_ID(),"controlClose");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0210");
		logger.entering("AA0210010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
		// クリア
		controlClear();
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AA0210010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0210");
		logger.entering("AA0210010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
		try{
			// 会社コード取得
			List tempList = entity.mselectCOMPANY_CD.read(conn, struct);
			if (tempList.size() > 0) {
				_COMPANY_CD = ((AA0210010Struct)tempList.get(0)).getl_COMPANY_CD();
			}

			// コンボボックスデータを取得
			ComboBox cb = new ComboBox(conn, sysUSER_CD);

			// エラー状態区分をセット
			setComErrTyp(cb.getData("ERR_TYP"));
			
			// 発注金額まるめ区分
			setComRoundTyp(cb.getData("ROUND_TYP"));
			// 消費税適用区分
			setComTaxApplyTyp(cb.getData("TAX_APPLY_TYP"));
			// 消費税計算区分
			setComTaxCalcTyp(cb.getData("TAX_CALC_TYP"));
			// 検収計上区分
			setComInspcAcptAppTyp(cb.getData("INSPC_ACPT_APP_TYP"));
			// 為替種別
			setComExchTyp(cb.getData("EXCH_TYP"));
			// 輸入取引区分
			setComImportTrnTyp(cb.getData("IMPORT_TRN_TYP"));
			// 販売単価遡及フラグ
			setComUnitCostRetFlg(cb.getData("UNIT_COST_RETROACTION_FLG"));

			// クリア
	        controlClear();
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
		logger.exiting("AA0210010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * イベントハンドラの前処理です。
	 *
	 * @param buttun ボタン名
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0210");
		logger.entering("AA0210010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");
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
		logger.exiting("AA0210010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("Browse") ) {
				controlBrowse();
			} else if( button.equals("CsvIn") ) {
				controlCsvIn();
			} else if( button.equals("CsvOut") ) {
				controlCsvOut();
			} else if( button.equals("return_sub1") ) {
				controlreturn_sub1();
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
//			throw new FoundationException("AA0210010Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AA0210010-E999","CSVの出力処理"));
			throw new FoundationException("AA0210010Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AA0210010-E999","システム日付の取得処理"));
				throw new FoundationException("AA0210010Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AA0210010-E999","コントロールのイベント処理"));
			throw new FoundationException("AA0210010Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected AA0210010Entity entity;
	protected AA0210010Struct struct;
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

		entity = new AA0210010Entity();
		struct = new AA0210010Struct();

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
	 * AA0210010クラスの標準コンストラクタ
	 */
	public AA0210010Control() throws BusinessProcessException, FoundationException
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
				AA0210010Struct key = (AA0210010Struct)keyList.get(j);
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
				if(msgKeyType.containsKeyColumn("l_ERR_ADR") && key.getl_ERR_ADR() != null) {
					msgKey.setKeyValue("l_ERR_ADR", key.getl_ERR_ADR());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_TYP") && key.getl_ERR_TYP() != null) {
					msgKey.setKeyValue("l_ERR_TYP", key.getl_ERR_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_VEND_CD") && key.getl_VEND_CD() != null) {
					msgKey.setKeyValue("l_VEND_CD", key.getl_VEND_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ERROR_FIELD_NAME") && key.getl_ERROR_FIELD_NAME() != null) {
					msgKey.setKeyValue("l_ERROR_FIELD_NAME", key.getl_ERROR_FIELD_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_TEXT") && key.getl_ERR_TEXT() != null) {
					msgKey.setKeyValue("l_ERR_TEXT", key.getl_ERR_TEXT());
				}
				if(msgKeyType.containsKeyColumn("w_COLUMN_FLG") && key.getw_COLUMN_FLG() != null) {
					msgKey.setKeyValue("w_COLUMN_FLG", key.getw_COLUMN_FLG());
				}
				if(msgKeyType.containsKeyColumn("w_COLUMN") && key.getw_COLUMN() != null) {
					msgKey.setKeyValue("w_COLUMN", key.getw_COLUMN());
				}
				if(msgKeyType.containsKeyColumn("l_VEND_NAME") && key.getl_VEND_NAME() != null) {
					msgKey.setKeyValue("l_VEND_NAME", key.getl_VEND_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_VEND_ANAME") && key.getl_VEND_ANAME() != null) {
					msgKey.setKeyValue("l_VEND_ANAME", key.getl_VEND_ANAME());
				}
				if(msgKeyType.containsKeyColumn("l_VEND_KNAME") && key.getl_VEND_KNAME() != null) {
					msgKey.setKeyValue("l_VEND_KNAME", key.getl_VEND_KNAME());
				}
				if(msgKeyType.containsKeyColumn("l_ZIP_CD") && key.getl_ZIP_CD() != null) {
					msgKey.setKeyValue("l_ZIP_CD", key.getl_ZIP_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ADDRESS_1") && key.getl_ADDRESS_1() != null) {
					msgKey.setKeyValue("l_ADDRESS_1", key.getl_ADDRESS_1());
				}
				if(msgKeyType.containsKeyColumn("l_ADDRESS_2") && key.getl_ADDRESS_2() != null) {
					msgKey.setKeyValue("l_ADDRESS_2", key.getl_ADDRESS_2());
				}
				if(msgKeyType.containsKeyColumn("l_ADDRESS_K_1") && key.getl_ADDRESS_K_1() != null) {
					msgKey.setKeyValue("l_ADDRESS_K_1", key.getl_ADDRESS_K_1());
				}
				if(msgKeyType.containsKeyColumn("l_ADDRESS_K_2") && key.getl_ADDRESS_K_2() != null) {
					msgKey.setKeyValue("l_ADDRESS_K_2", key.getl_ADDRESS_K_2());
				}
				if(msgKeyType.containsKeyColumn("l_TEL") && key.getl_TEL() != null) {
					msgKey.setKeyValue("l_TEL", key.getl_TEL());
				}
				if(msgKeyType.containsKeyColumn("l_FAX") && key.getl_FAX() != null) {
					msgKey.setKeyValue("l_FAX", key.getl_FAX());
				}
				if(msgKeyType.containsKeyColumn("l_EMAIL") && key.getl_EMAIL() != null) {
					msgKey.setKeyValue("l_EMAIL", key.getl_EMAIL());
				}
				if(msgKeyType.containsKeyColumn("l_VEND_ORG") && key.getl_VEND_ORG() != null) {
					msgKey.setKeyValue("l_VEND_ORG", key.getl_VEND_ORG());
				}
				if(msgKeyType.containsKeyColumn("l_VEND_PERSON") && key.getl_VEND_PERSON() != null) {
					msgKey.setKeyValue("l_VEND_PERSON", key.getl_VEND_PERSON());
				}
				if(msgKeyType.containsKeyColumn("l_OWN_ORG_CD") && key.getl_OWN_ORG_CD() != null) {
					msgKey.setKeyValue("l_OWN_ORG_CD", key.getl_OWN_ORG_CD());
				}
				if(msgKeyType.containsKeyColumn("l_OWN_ORG_NAME") && key.getl_OWN_ORG_NAME() != null) {
					msgKey.setKeyValue("l_OWN_ORG_NAME", key.getl_OWN_ORG_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_OWN_PERSON_CD") && key.getl_OWN_PERSON_CD() != null) {
					msgKey.setKeyValue("l_OWN_PERSON_CD", key.getl_OWN_PERSON_CD());
				}
				if(msgKeyType.containsKeyColumn("l_OWN_PERSON_NAME") && key.getl_OWN_PERSON_NAME() != null) {
					msgKey.setKeyValue("l_OWN_PERSON_NAME", key.getl_OWN_PERSON_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_ROUND_TYP") && key.getl_ROUND_TYP() != null) {
					msgKey.setKeyValue("l_ROUND_TYP", key.getl_ROUND_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_TAX_CD") && key.getl_TAX_CD() != null) {
					msgKey.setKeyValue("l_TAX_CD", key.getl_TAX_CD());
				}
				if(msgKeyType.containsKeyColumn("l_TAX_APPLY_TYP") && key.getl_TAX_APPLY_TYP() != null) {
					msgKey.setKeyValue("l_TAX_APPLY_TYP", key.getl_TAX_APPLY_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_TAX_CALC_TYP") && key.getl_TAX_CALC_TYP() != null) {
					msgKey.setKeyValue("l_TAX_CALC_TYP", key.getl_TAX_CALC_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_INSPC_ACPT_APP_TYP") && key.getl_INSPC_ACPT_APP_TYP() != null) {
					msgKey.setKeyValue("l_INSPC_ACPT_APP_TYP", key.getl_INSPC_ACPT_APP_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_ODR_FORM_FLG") && key.getl_ODR_FORM_FLG() != null) {
					msgKey.setKeyValue("l_ODR_FORM_FLG", key.getl_ODR_FORM_FLG());
				}
				if(msgKeyType.containsKeyColumn("l_ODR_EDI_FLG") && key.getl_ODR_EDI_FLG() != null) {
					msgKey.setKeyValue("l_ODR_EDI_FLG", key.getl_ODR_EDI_FLG());
				}
				if(msgKeyType.containsKeyColumn("l_VEND_REM") && key.getl_VEND_REM() != null) {
					msgKey.setKeyValue("l_VEND_REM", key.getl_VEND_REM());
				}
				if(msgKeyType.containsKeyColumn("l_CUR_CD") && key.getl_CUR_CD() != null) {
					msgKey.setKeyValue("l_CUR_CD", key.getl_CUR_CD());
				}
				if(msgKeyType.containsKeyColumn("l_EXCH_TYP") && key.getl_EXCH_TYP() != null) {
					msgKey.setKeyValue("l_EXCH_TYP", key.getl_EXCH_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_IMPORT_TRN_TYP") && key.getl_IMPORT_TRN_TYP() != null) {
					msgKey.setKeyValue("l_IMPORT_TRN_TYP", key.getl_IMPORT_TRN_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_UNIT_COST_RETROACTION_FLG") && key.getl_UNIT_COST_RETROACTION_FLG() != null) {
					msgKey.setKeyValue("l_UNIT_COST_RETROACTION_FLG", key.getl_UNIT_COST_RETROACTION_FLG());
				}
				if(msgKeyType.containsKeyColumn("l_COMPANY_CD") && key.getl_COMPANY_CD() != null) {
					msgKey.setKeyValue("l_COMPANY_CD", key.getl_COMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("OUT_VEND_CD") && key.getOUT_VEND_CD() != null) {
					msgKey.setKeyValue("OUT_VEND_CD", key.getOUT_VEND_CD());
				}
				if(msgKeyType.containsKeyColumn("l_HOME_CUR_CD") && key.getl_HOME_CUR_CD() != null) {
					msgKey.setKeyValue("l_HOME_CUR_CD", key.getl_HOME_CUR_CD());
				}
				if(msgKeyType.containsKeyColumn("INSTALL_FLG") && key.getINSTALL_FLG() != null) {
					msgKey.setKeyValue("INSTALL_FLG", key.getINSTALL_FLG());
				}
				if(msgKeyType.containsKeyColumn("OPTION_ID") && key.getOPTION_ID() != null) {
					msgKey.setKeyValue("OPTION_ID", key.getOPTION_ID());
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
					AA0210010Struct key = new AA0210010Struct();
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
					if(msgKeyType.containsKeyColumn("l_ERR_ADR")) {
						key.setl_ERR_ADR(msgKey.getKeyValue("l_ERR_ADR"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_TYP")) {
						key.setl_ERR_TYP(msgKey.getKeyValue("l_ERR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_VEND_CD")) {
						key.setl_VEND_CD(msgKey.getKeyValue("l_VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ERROR_FIELD_NAME")) {
						key.setl_ERROR_FIELD_NAME(msgKey.getKeyValue("l_ERROR_FIELD_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_TEXT")) {
						key.setl_ERR_TEXT(msgKey.getKeyValue("l_ERR_TEXT"));
					}
					if(msgKeyType.containsKeyColumn("w_COLUMN_FLG")) {
						key.setw_COLUMN_FLG(msgKey.getKeyValue("w_COLUMN_FLG"));
					}
					if(msgKeyType.containsKeyColumn("w_COLUMN")) {
						key.setw_COLUMN(msgKey.getKeyValue("w_COLUMN"));
					}
					if(msgKeyType.containsKeyColumn("l_VEND_NAME")) {
						key.setl_VEND_NAME(msgKey.getKeyValue("l_VEND_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_VEND_ANAME")) {
						key.setl_VEND_ANAME(msgKey.getKeyValue("l_VEND_ANAME"));
					}
					if(msgKeyType.containsKeyColumn("l_VEND_KNAME")) {
						key.setl_VEND_KNAME(msgKey.getKeyValue("l_VEND_KNAME"));
					}
					if(msgKeyType.containsKeyColumn("l_ZIP_CD")) {
						key.setl_ZIP_CD(msgKey.getKeyValue("l_ZIP_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ADDRESS_1")) {
						key.setl_ADDRESS_1(msgKey.getKeyValue("l_ADDRESS_1"));
					}
					if(msgKeyType.containsKeyColumn("l_ADDRESS_2")) {
						key.setl_ADDRESS_2(msgKey.getKeyValue("l_ADDRESS_2"));
					}
					if(msgKeyType.containsKeyColumn("l_ADDRESS_K_1")) {
						key.setl_ADDRESS_K_1(msgKey.getKeyValue("l_ADDRESS_K_1"));
					}
					if(msgKeyType.containsKeyColumn("l_ADDRESS_K_2")) {
						key.setl_ADDRESS_K_2(msgKey.getKeyValue("l_ADDRESS_K_2"));
					}
					if(msgKeyType.containsKeyColumn("l_TEL")) {
						key.setl_TEL(msgKey.getKeyValue("l_TEL"));
					}
					if(msgKeyType.containsKeyColumn("l_FAX")) {
						key.setl_FAX(msgKey.getKeyValue("l_FAX"));
					}
					if(msgKeyType.containsKeyColumn("l_EMAIL")) {
						key.setl_EMAIL(msgKey.getKeyValue("l_EMAIL"));
					}
					if(msgKeyType.containsKeyColumn("l_VEND_ORG")) {
						key.setl_VEND_ORG(msgKey.getKeyValue("l_VEND_ORG"));
					}
					if(msgKeyType.containsKeyColumn("l_VEND_PERSON")) {
						key.setl_VEND_PERSON(msgKey.getKeyValue("l_VEND_PERSON"));
					}
					if(msgKeyType.containsKeyColumn("l_OWN_ORG_CD")) {
						key.setl_OWN_ORG_CD(msgKey.getKeyValue("l_OWN_ORG_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_OWN_ORG_NAME")) {
						key.setl_OWN_ORG_NAME(msgKey.getKeyValue("l_OWN_ORG_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_OWN_PERSON_CD")) {
						key.setl_OWN_PERSON_CD(msgKey.getKeyValue("l_OWN_PERSON_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_OWN_PERSON_NAME")) {
						key.setl_OWN_PERSON_NAME(msgKey.getKeyValue("l_OWN_PERSON_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_ROUND_TYP")) {
						key.setl_ROUND_TYP(msgKey.getKeyValue("l_ROUND_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_TAX_CD")) {
						key.setl_TAX_CD(msgKey.getKeyValue("l_TAX_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_TAX_APPLY_TYP")) {
						key.setl_TAX_APPLY_TYP(msgKey.getKeyValue("l_TAX_APPLY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_TAX_CALC_TYP")) {
						key.setl_TAX_CALC_TYP(msgKey.getKeyValue("l_TAX_CALC_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_INSPC_ACPT_APP_TYP")) {
						key.setl_INSPC_ACPT_APP_TYP(msgKey.getKeyValue("l_INSPC_ACPT_APP_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_ODR_FORM_FLG")) {
						key.setl_ODR_FORM_FLG(msgKey.getKeyValue("l_ODR_FORM_FLG"));
					}
					if(msgKeyType.containsKeyColumn("l_ODR_EDI_FLG")) {
						key.setl_ODR_EDI_FLG(msgKey.getKeyValue("l_ODR_EDI_FLG"));
					}
					if(msgKeyType.containsKeyColumn("l_VEND_REM")) {
						key.setl_VEND_REM(msgKey.getKeyValue("l_VEND_REM"));
					}
					if(msgKeyType.containsKeyColumn("l_CUR_CD")) {
						key.setl_CUR_CD(msgKey.getKeyValue("l_CUR_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_EXCH_TYP")) {
						key.setl_EXCH_TYP(msgKey.getKeyValue("l_EXCH_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_IMPORT_TRN_TYP")) {
						key.setl_IMPORT_TRN_TYP(msgKey.getKeyValue("l_IMPORT_TRN_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_UNIT_COST_RETROACTION_FLG")) {
						key.setl_UNIT_COST_RETROACTION_FLG(msgKey.getKeyValue("l_UNIT_COST_RETROACTION_FLG"));
					}
					if(msgKeyType.containsKeyColumn("l_COMPANY_CD")) {
						key.setl_COMPANY_CD(msgKey.getKeyValue("l_COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("OUT_VEND_CD")) {
						key.setOUT_VEND_CD(msgKey.getKeyValue("OUT_VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_HOME_CUR_CD")) {
						key.setl_HOME_CUR_CD(msgKey.getKeyValue("l_HOME_CUR_CD"));
					}
					if(msgKeyType.containsKeyColumn("INSTALL_FLG")) {
						key.setINSTALL_FLG(msgKey.getKeyValue("INSTALL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("OPTION_ID")) {
						key.setOPTION_ID(msgKey.getKeyValue("OPTION_ID"));
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
