/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AF0130/src/com/nec/jp/orteus/metamorBase/AF0130/AF0130010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AF0130;

import com.nec.jp.orteus.metamorBase.AF0130.*;
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
import java.math.BigDecimal;
import com.nec.jp.orteus.metamorBase.common.CollectNumber.CollectNumber;
import com.nec.jp.orteus.metamorBase.common04.sysdata.DateCtrlControl;
import com.nec.jp.orteus.metamorBase.common04.sysdata.DateCtrlStruct;
import com.nec.jp.orteus.metamorBase.common04.util.DataNotFoundException;
import com.nec.jp.orteus.expj.pr.rcvissue.common.UpdateInfo;
import com.nec.jp.orteus.expj.pr.rcvissue.process.IssueInstStruct;
import com.nec.jp.orteus.expj.pr.rcvissue.process.IssueRemain;
import com.nec.jp.orteus.expj.pr.rcvissue.process.WhAutoIssueProc;
import java.text.CharacterIterator;
import java.text.StringCharacterIterator;

import com.nec.jp.orteus.expj.pr.rcvissue.process.JobOdrAlc;

import com.nec.jp.orteus.expj.pr.rcvissue.process.IssueProcess;
import com.nec.jp.orteus.expj.pr.rcvissue.process.RcvProcess;
import com.nec.jp.orteus.expj.util.Calculate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//}}user_implement_code_import

//{{user_implement_code_header
/**
 * CLASS     : AF0130010Control クラス
 *      マニュアル出庫実績CSV取込
 * @author $Author: shan-xiuqin $
 * @version $Revision: 1.6 $ $Date: 2016/05/23 08:18:04 $
 *
 */
//}}user_implement_code_header

public class AF0130010Control
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
	public AF0130010Struct getListvalue(int x) { return (AF0130010Struct)(this.list.get(x)); }	// リストの値を返します。
	public AF0130010Struct getStruct() { return this.struct; }	// Structの値を返します。
	public AF0130010Struct createStruct() { return new AF0130010Struct(); }	// 新しいStructを作って返します。
	public void setStruct(Object structname) { this.struct.setStruct((AF0130010Struct)structname); }	// Structをセットします。
	public void initializeStruct() { this.struct.initialize(); }	// Structの値を初期化します。

	// CSV出力用リスト
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }
	// TODO: ユーザ定義のコードを記述してください
	// CSV出力用リスト
	

	/**全部レコード数**/
	private int _intTotalCount = 0; 
	/**エラーレコード件数**/
	private int _intErrorCount = 0;  
	/**正常レコード件数**/
	private int _intSuccessCount = 0;
	/**ワーニング件数**/
	private int _intWarningCount = 0;
	/**ワーニング件数**/
	private int _intWarningCount1 = 0;
	private boolean warningFlg = false;
	
	/** ＣＳＶ項目番号定義 */
	// 出庫指示番号
	private final int CSV_ISSUE_INST_CD = 0;
	//MOD START 20141208 fei-hy
	// 品目番号
	private final int CSV_ITEM_CD = 1;
	// 製番
	private final int CSV_OB_ODR_CD = 2;
	//private final int CSV_OB_ODR_CD = 3;
	// 出庫元保管区コード
	private final int CSV_ISSUE_WH_CD = 3;
	//private final int CSV_ISSUE_WH_CD = 4;
	// 在庫ロット番号
	private final int CSV_STOCK_LOT_CD = 4;
	//private final int CSV_STOCK_LOT_CD = 5;
	// 出庫数
	private final int CSV_ISSUE_QTY = 5;
	//private final int CSV_ISSUE_QTY = 6;
	// 出庫日
	private final int CSV_ISSUE_DATE = 6;
	//private final int CSV_ISSUE_DATE = 7;
	// 出庫完了
	private final int CSV_ISSUE_CMPLT_FLG = 7;
	//private final int CSV_ISSUE_CMPLT_FLG = 8;
	// 出庫先保管区コード
	private final int CSV_RCV_WH_CD = 8;
	//private final int CSV_RCV_WH_CD = 9;
	// メーカロット番号
	private final int CSV_VEND_LOT_NO = 9;
	//private final int CSV_VEND_LOT_NO = 10;

	// ＣＳＶ取込データ必要項目数(合計)
	private final int CSV_NECESSARY_COLUMN = 10;
	//private final int CSV_NECESSARY_COLUMN = 11;
	//MOD END 20141208 fei-hy
	
	// エラーメッセージ
	private ExpjMessage _emsg = null;

	/*会社コード*/
	public String _company_cd = null;

	// 設定値
	private String strValus = null;
	private String _wh_cd = null;
	private String  _ctrlCd = null;
	
	// 多言語項目取得対応
	private String _locale = CoreTools.getLocale(sysUSER_CD);
	ResourceBundle _resource = CoreTools.getResourceBundle("OrteusUserDic", _locale);

	/** 業務運用日*/
	private String _btmBusinessOprDate;
	
	// コンボボックス定義
	// エラー状態区分
	private ComboStruct _COM_ERR_TYP = null;
	
	/**
	 * ログメッセージ設定
	 * @param 出力メッセージ
	 */
	private void setSyslogConfig(String message) {
		ExpjMessage emsg = new ExpjMessage( "ZZ01006", message );
		sysLog.config(emsg, getsysUSER_CD());
	}
	
	/**
	 * 業務ロジックのエラーメッセージ設定処理を切り出して関数化
	 * @param list メッセージリスト
	 */
	private void setErrorMessage(List list) {
		ExpjMessage emsg;
		if (list != null && !list.isEmpty() && list.size() > 0){
			for(int l = 0; l < list.size(); l++){
				emsg = new ExpjMessage((String)list.get(l));
				msgStruct.addError(emsg);
				sysLog.warning(emsg, getsysUSER_CD());
			}
		}
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
	 * 業務ロジックのエラーメッセージ設定処理を切り出して関数化
	 * @param code メッセージコード
	 * @param value1 置換文字列１
	 */
	private void setErrorMessage(String code, String value1) {
		ExpjMessage emsg = new ExpjMessage(code, value1);
		msgStruct.addError(emsg);
		sysLog.warning(emsg, getsysUSER_CD());
	}
	/**
	 * 業務ロジックのワーニングメッセージ設定処理を切り出して関数化
	 * @param code メッセージコード
	 */
	private void setWarningMessage(String code) {
		ExpjMessage emsg = new ExpjMessage(code);
		msgStruct.addWarn(emsg);
		sysLog.info(emsg, getsysUSER_CD());
	}
	/**
	 * 業務ロジックのワーニングメッセージ設定処理を切り出して関数化
	 * @param code メッセージコード
	 * @param value1 置換文字列１
	 */
	private void setWarningMessage(String code, String value1) {
		ExpjMessage emsg = new ExpjMessage(code, value1);
		msgStruct.addWarn(emsg);
		sysLog.info(emsg, getsysUSER_CD());
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
	 * 業務ロジックのインフォメーション設定処理を切り出して関数化
	 * @param code
	 */
	private void setInfoMessage2(String code) {
		ExpjMessage emsg = new ExpjMessage(code);
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
	 * 対象の文字列がNull（空文字あるいはNull）であるかを判定します。
	 * @param str 対象文字列
	 * @return Nullの場合はtrue、Nullではない場合はfalse
	 */
	private boolean isNull(String str) {
		if (str == null || str.length() == 0 || str.equalsIgnoreCase("null")) {
			return true;
		}
		return false;
	}
	
	/**
	 * 文字(\\)変換、「\\」なら、「\」を削除する
	 * 
	 * @param in
	 *            文字列
	 * @return 編集後文字列
	 */
	private String replaceSlashSub(String in) {
		if (in == null)
			return null;
		return in.replaceAll("\\\\\\\\", "\\\\");
	}
	/**
	 * 文字(\)変換、「\」なら、「\」を直前に追加する
	 * 
	 * @param in   文字列
	 * @return	 編集後文字列
	 */
	private String replaceSlashAdd(String in) {
		if (in == null)
			return null;
		StringBuffer buffer = new StringBuffer(in.length() * 2);
		for (int i = 0; i < in.length(); i++) {
			char c = in.charAt(i);
			if (c == '\\')
				buffer.append("\\\\");
			else
				buffer.append(c);
		}
		return buffer.toString();
	}
	/**
	 * 文字列長さチェック
	 * 
	 * @param strInString
	 *			入力パラメータ
	 * @return 正常:true / エラー:false
	 */
	public int strLengthChk(String strInput) {
		int intLen = 0;
		try {
			byte[] bytstr = strInput.getBytes("SJIS");
			intLen = bytstr.length;
		} catch (Exception e) {
			return 0;
		}
		return intLen;
	}
	/**
	 * 実際原価管理パラメータの対象年月日取得
	 * @param in チェック日
	 * @param in チェック工場コード
	 * @param in AD0050010Struct
	 * @param in AD0050010Entity
	 * 戻り値 チェック結果
	 */
	private boolean checkProcExecDate(String checkDate,String plantCD, AF0130010Struct struct) throws BusinessProcessException, FoundationException {
		boolean checkResult = true;
		try {
			
			struct.setPLANT_CD(plantCD);
			List procExecDateList = entity.mselectSYS_ACTUAL_COST_CTRL_AC.read(conn, struct);
			// 実際原価管理パラメータに存在しない
			if(procExecDateList == null || procExecDateList.isEmpty()){
				return true;
			}
			AF0130010Struct procExecDateStruct = (AF0130010Struct) procExecDateList.get(0);
			BigDecimal date = new BigDecimal(procExecDateStruct.getPROC_EXEC_DATE());
			BigDecimal input = new BigDecimal(chageDate(checkDate).substring(0,4) + chageDate(checkDate).substring(5,7));
			if(input.compareTo(date) >= 0){
				checkResult = true;
			}else{
				//より過去の場合
				checkResult = false;
			}
		}catch(Exception e) {
			e.printStackTrace();
			ExpjMessage emsg = new ExpjMessage("ZZ01006", e.toString());
			msgStruct.addError(emsg);
			sysLog.warning(emsg, getsysUSER_CD());
			e.printStackTrace();
		}
		return checkResult;
	}
	/**
	 * 数値チェック 項目が数値か判断する
	 * 
	 * @param strInString
	 *            入力パラメータ
	 * @return 正常:true / エラー:false
	 */
	public boolean isNumChk(String strInString) {
		// 数値のinputをセット用
		try {
			Double.parseDouble(strInString);
		} catch (Exception e) {
			// 数値ではない場合Exceptionに飛ばして処理
			// falseをセットして処理を抜ける(エラー：数値以外の入力)
			return false;
		}
		if (strInString.indexOf('d') != -1 || strInString.indexOf('D') != -1
				|| strInString.indexOf('f') != -1
				|| strInString.indexOf('F') != -1) {
			return false;
		}
		// trueをセットして処理を抜ける(正常終了)
		return true;
	}

	/*
	 * 時刻がある場合、日期取る
	 * 
	 * @param dataSource String
	 * 
	 * @return 日期
	 */
	private String subDate(String dataSource) {
		String reg = "[0-9]{4}\\/[0-9]{1,2}\\/[0-9]{1,2}";

		Pattern pattern = Pattern.compile (reg);
		Matcher matcher = pattern.matcher (dataSource);
		while (matcher.find ()) {
			dataSource = matcher.group ();
		}

		return dataSource;
	}
	
	/*
	 * 日期のチェック
	 * 
	 * @param dataSource String
	 * 
	 * @return true or false boolean trueの場合　日期です、　falseの場合、日期ではない
	 */
	private String chageDate(String dataSource) {
		String dataEnd = "";
		if (dataSource.matches("^^\\d{4}\\/\\d{2}\\/\\d{2}$")) {
			dataEnd = dataSource;
		} else if (dataSource.matches("^^\\d{4}\\/\\d{1}\\/\\d{1}$")) {
			dataEnd = dataSource.substring(0, 5) + "0"+dataSource.substring(5, 7)+"0"+dataSource.substring(7, 8);

		} else if (dataSource.matches("^^\\d{4}\\/\\d{2}\\/\\d{1}$")) {
			dataEnd = dataSource.substring(0, 5) + dataSource.substring(5, 8)+ "0" + dataSource.substring(8, 9);

		} else if (dataSource.matches("^^\\d{4}\\/\\d{1}\\/\\d{2}$")) {
			dataEnd = dataSource.substring(0, 5) + "0" + dataSource.substring(5, 7) + dataSource.substring(7, 9);
		}
		return dataEnd;
	}
	/**
	 * 数値チェック 項目が数値か判断する
	 * 
	 * @param strInString
	 *            入力パラメータ
	 * @return 正常:true / エラー:false
	 */
	public static boolean isDigitChk(String strInString) {
		if (strInString.matches("[0-9]*")) {
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * 禁則文字チェック(「_」 「"」「\」)
	 * 
	 * @param str
	 *			文字列
	 * @return 「_」: true 「%」: true 「\」: true その他: false
	 */
	private boolean chkHankaku(String str) {
		CharacterIterator iter = new StringCharacterIterator(str);
		for (char c = iter.first(); c != CharacterIterator.DONE; c = iter.next()) {
			// 「%」 0x0025
			if (c == 0x0025) {
				// 禁則文字!
				return true;
			}
			// 「\」 0x005C
			if (c == 0x005C) {
				// 禁則文字!
				return true;
			}
			// 「_」 0x005F
			if (c == 0x005F) {
				// 禁則文字!
				return true;
			}
		}
		return false;
	}
	/**
	 * 数値範囲チェック
	 * 
	 * @param strI	ing
	 *            数値
	 * @param integerSize
	 *            整数位数
	 * @param decimalSize
	 *            小数位数
	 * @return 正常:true / エラー:false
	 */
	public boolean isNotInNumRange(String strInString, int integerSize, int decimalSize) {

		String strInputString = null;
		// マイナスの場合
		if (strInString.indexOf("-") == 0) {
			strInputString = strInString.substring(1);
		} else {
			// 正数の場合
			strInputString = strInString;
		}
		int toneFlg = strInputString.indexOf('.');
		if (toneFlg == -1) {
			// 整数の場合
			if (strInputString.length() > integerSize) {
				return false;
			}
		} else {
			if (decimalSize == 0 && toneFlg == integerSize) {
				return false;
			}
			if (strInputString.length() > decimalSize + integerSize + 1) {
				return false;
			}
			// 整数
			String zhstr = strInputString.substring(0, toneFlg);
			// 小数
			String xistr = strInputString.substring(toneFlg + 1, strInputString.length());
			if (zhstr.length() > integerSize || xistr.length() > decimalSize) {
				return false;
			}
		}
		return true;
	}
	/*
	 * 日期のチェック
	 * 
	 * @param dataSource String
	 * 
	 * @return true or false boolean trueの場合　日期です、　falseの場合、日期ではない
	 */
	private boolean checkDate(String dataSource) {
		String flag = "";
		String dataType = "";
		String regex = "^[1-9]\\d{3}\\/(0?[1-9]|1[0-2])\\/(0?[1-9]|[12]\\d|3[01])\\s*(0?[0-9]|1\\d|2[0-3])(\\:(0?[0-9]|[1-5]\\d)){2}$";
		String regex1 = "^[1-9]\\d{3}\\/(0?[1-9]|1[0-2])\\/(0?[1-9]|[12]\\d|3[01])\\s*(0?[0-9]|1\\d|2[0-3])(\\:(0?[0-9]|[1-5]\\d))$";
		String regex2 = "^[1-9]\\d{3}\\/(0?[1-9]|1[0-2])\\/(0?[1-9]|[12]\\d|3[01])$";

		if (dataSource.matches (regex)) {
			// yyyy/MM/dd HH:mm:ss の形式
			flag = "true";
			dataType = "1";
		} else if (dataSource.matches (regex1)) {
			// yyyy/MM/dd HH:mm の形式
			flag = "true";
			dataType = "2";
		} else if (dataSource.matches (regex2)) {
			// yyyy/MM/dd の形式
			flag = "true";
			dataType = "3";
		} else {
			flag = "false";
		}

		if ("true".equals(flag)) {
			try {
				SimpleDateFormat dateFormat = null;
				if ("1".equals(dataType)) {
					dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
				}
				if ("2".equals(dataType)) {
					dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm");
				}
				if ("3".equals(dataType)) {
					dateFormat = new SimpleDateFormat("yyyy/MM/dd");
				}
				dateFormat.setLenient(false);
				dateFormat.parse(dataSource);
				return true;
			} catch (Exception e) {
				return false;
			}
		} else {
			return false;
		}
	}
	/**
	 * コンボボックスデータから表示説明を取得する
	 * 
	 * @param combo
	 *            コンボボックスデータ
	 * @param value
	 *            コンボボックスデータの値
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
	 * 
	 * @param csvList
	 * @return
	 * @throws BusinessProcessException
	 * @throws FoundationException
	 */
	private boolean checkCsvData(List csvList) throws BusinessProcessException, FoundationException {


		// 全部レコード数
		_intTotalCount = csvList.size();
		AF0130010Struct csvStruct = new AF0130010Struct();
		try {
			for (int i = 0; i < csvList.size(); i++)	{
				warningFlg = false;
				boolean lotWarningFlg = false;
				
				csvStruct = (AF0130010Struct) csvList.get(i);
				// CSVファイルの項目数チェックを行う
				if (!isNull(csvStruct.getw_COLUMN_FLG())) {
					if (Integer.parseInt(csvStruct.getw_COLUMN_FLG()) < CSV_NECESSARY_COLUMN) {
						// 項目に不足がある場合
						_emsg = new ExpjMessage("AA01500", csvStruct.getw_COLUMN_FLG());
					} else {
						// 項目が必要数以上の場合
						_emsg = new ExpjMessage("AA01519", csvStruct.getw_COLUMN_FLG());
					}
					csvExport(csvStruct					// 対象データ情報
							, "1"						// エラー区分
							, i + 1						// エラー発生行
							, null						// エラー項目名
							, _emsg.getMessage(_locale) // エラーメッセージ
							, null
							); 
					_intErrorCount++;
					continue;
				}
			   AF0130010Struct mItemStruct = new AF0130010Struct();
			   AF0130010Struct tIssueinstStruct = new AF0130010Struct();
			   AF0130010Struct tlotcrtl  =new AF0130010Struct();
				// 以下出庫指示番号のチェック
				// 出庫指示番号、 NULLの場合
				if (isNull(csvStruct.getISSUE_INST_CD())) {
					csvExport(csvStruct						// 対象データ情報
							, "1"							// エラー区分
							, i + 1							// エラー発生行
							, "Expj.ISSUE_INST_CD"			// エラー項目名
							, new ExpjMessage("AE00095").getMessage(_locale)		// エラーメッセージ
							, null
							); 
					_intErrorCount++;
					continue;
				}else{
					// 出庫指示番号、文字3桁以上の場合
					if (strLengthChk(csvStruct.getISSUE_INST_CD()) >= 26){
						csvExport(csvStruct						// 対象データ情報
								, "1"							// エラー区分
								, i + 1							// エラー発生行
								, "Expj.ISSUE_INST_CD"			// エラー項目名
								, new ExpjMessage("AA01501").getMessage(_locale)		// エラーメッセージ
								, null
								); 
						_intErrorCount++;
						continue;
					}
					// 出庫指示番号、禁則文字が入力されていた場合
					if (chkHankaku(csvStruct.getISSUE_INST_CD())) {
						csvExport(csvStruct						// 対象データ情報
								, "1"							// エラー区分
								, i + 1							// エラー発生行
								, "Expj.ISSUE_INST_CD"			// エラー項目名
								, new ExpjMessage("AA01524").getMessage(_locale)		// エラーメッセージ
								, null
								); 
						_intErrorCount++;
						continue;
					}
				}
				
				// 以下製番のチェック
				if (!isNull(csvStruct.getJOB_ODR_CD())) {
					// 製番、文字26桁以上の場合
					if (strLengthChk(csvStruct.getJOB_ODR_CD()) >= 26){
						csvExport(csvStruct						// 対象データ情報
								, "1"							// エラー区分
								, i + 1							// エラー発生行
								, "Expj.JOB_ODR_CD"			// エラー項目名
								, new ExpjMessage("AH00025").getMessage(_locale)		// エラーメッセージ
								, null
								); 
						_intErrorCount++;
						continue;
					}
					// 製番、禁則文字が入力されていた場合
					if (chkHankaku(csvStruct.getJOB_ODR_CD())) {
						csvExport(csvStruct						// 対象データ情報
								, "1"							// エラー区分
								, i + 1							// エラー発生行
								, "Expj.JOB_ODR_CD"			// エラー項目名
								, new ExpjMessage("AA01524").getMessage(_locale)		// エラーメッセージ
								, null
								); 
						_intErrorCount++;
						continue;
					}				
				} else {
					csvStruct.setJOB_ODR_CD("");
				}
				// 以下出庫元保管区コードのチェック
				// 出庫元保管区コード、NULLの場合
				if (isNull(csvStruct.getWH_CD())) {
					csvExport(csvStruct						// 対象データ情報
							, "1"							// エラー区分
							, i + 1							// エラー発生行
							, "Expj.ISSUE_WH_CD_1"				// エラー項目名
							, new ExpjMessage("AF00027").getMessage(_locale)		// エラーメッセージ
							, null
							); 
					_intErrorCount++;
					continue;
				}else{
					// 出庫元保管区コード、文字26桁以上の場合
					if (strLengthChk(csvStruct.getWH_CD()) >= 26) {
						csvExport(csvStruct						// 対象データ情報
								, "1"							// エラー区分
								, i + 1							// エラー発生行
								, "Expj.ISSUE_WH_CD_1"				// エラー項目名
								, new ExpjMessage("AA01501").getMessage(_locale)		// エラーメッセージ
								, null
								); 
						_intErrorCount++;
						continue;
					}
					// 出庫元保管区コード、禁則文字が入力されていた場合
					if (chkHankaku(csvStruct.getWH_CD())) {
						csvExport(csvStruct						// 対象データ情報
								, "1"							// エラー区分
								, i + 1							// エラー発生行
								, "Expj.ISSUE_WH_CD_1"				// エラー項目名
								, new ExpjMessage("AA01524").getMessage(_locale)		// エラーメッセージ
								, null
								); 
						_intErrorCount++;
						continue;
					}
				}
				// 以下在庫ロット番号のチェック
				// 在庫ロット番号、文字26桁以上の場合
				if(!isNull(csvStruct.getLOT_NO())){
					if (strLengthChk(csvStruct.getLOT_NO()) >= 26) {
						csvExport(csvStruct							// 対象データ情報
								, "1"								// エラー区分
								, i + 1								// エラー発生行
								, "Expj.STOCK_LOT_CD"		// エラー項目名
								, new ExpjMessage("AA01501").getMessage(_locale)			// エラーメッセージ
								, null
								); 	
						_intErrorCount++;
						continue;
					}
					// 在庫ロット番号、禁則文字が入力されていた場合
					if (chkHankaku(csvStruct.getLOT_NO())) {
						csvExport(csvStruct							// 対象データ情報
								, "1"								// エラー区分
								, i + 1								// エラー発生行
								, "Expj.STOCK_LOT_CD"		// エラー項目名
								, new ExpjMessage("AA01524").getMessage(_locale)			// エラーメッセージ
								, null
								); 
						_intErrorCount++;
						continue;
					}
				}
				
				
				// 以下出庫数のチェック
				// 出庫数、NULLの場合
				if (isNull(csvStruct.getISSUE_QTY())) {
					csvExport(csvStruct
							 , "1"								// エラー区分
							 , i + 1							// エラー行番号
							 , "Expj.ISSUE_QTY"					// エラー項目名
							 , new ExpjMessage("AF00181").getMessage(_locale)// エラーメッセージ
							 , null 
							);	
					_intErrorCount++;
					continue;
				}else{
					// 出庫数、数値以外の場合
					if (!isNumChk(csvStruct.getISSUE_QTY())) {
						csvExport(csvStruct
								 , "1"								// エラー区分
								 , i + 1							// エラー行番号
								 , "Expj.ISSUE_QTY"					// エラー項目名
								 , new ExpjMessage("AF00058").getMessage(_locale)// エラーメッセージ
								 , null 
								);	
						_intErrorCount++;
						continue;
					}
					// 出庫数、0未満の場合
					if (Calculate.compare(csvStruct.getISSUE_QTY(), "0") == -1) {
						csvExport(csvStruct
								 , "1"								// エラー区分
								 , i + 1							// エラー行番号
								 , "Expj.ISSUE_QTY"				// エラー項目名
								 , new ExpjMessage("AF00055").getMessage(_locale)// エラーメッセージ
								 , null
								);	
						_intErrorCount++;
						continue;
					}
					// 出庫数、整数が15桁以上、または、小数点以下5桁以上の場合
					if (!isNotInNumRange(csvStruct.getISSUE_QTY(), 14, 4)) {
						csvExport(csvStruct
								 , "1"								// エラー区分
								 , i + 1							// エラー行番号
								 , "Expj.ISSUE_QTY"				// エラー項目名
								 , new ExpjMessage("AA01501").getMessage(_locale)	// エラーメッセージ
								 , null
								 );
						_intErrorCount++;
						continue;
					}
				}
				
				// 以下出庫日のチェック
				// 出庫日、NULLの場合
				if (isNull(csvStruct.getISSUE_DATE())) {
					csvExport(csvStruct
							 , "1"								// エラー区分
							 , i + 1							// エラー行番号
							 , "Expj.ISSUE_DATE"				// エラー項目名
							 , new ExpjMessage("AE00051").getMessage(_locale)// エラーメッセージ
							, null
							 );	
					_intErrorCount++;
					continue;
				}else{
					// 出庫日、日付型でない場合
					if (!checkDate(csvStruct.getISSUE_DATE())) {
						csvExport(csvStruct
								 , "1"								// エラー区分
								 , i + 1							// エラー行番号
								 , "Expj.ISSUE_DATE"				// エラー項目名
								 , new ExpjMessage("AA01606").getMessage(_locale)// エラーメッセージ
								 , null
								 );	
						_intErrorCount++;
						continue;
					} else {
						// 出庫日に時刻部分ある場合、日期を取る
						csvStruct.setISSUE_DATE_SUB(subDate(csvStruct.getISSUE_DATE()));
					}
				}
				
				// 以下出庫完了のチェック
				//  出庫完了、NULLの場合
				if (isNull(csvStruct.getISSUE_CMPLT_FLG())) {
					csvExport(csvStruct						// 対象データ情報
							, "1"							// エラー区分
							, i + 1							// エラー発生行
							, "Expj.ISSUE_CMPLT_FLG_2"			// エラー項目名
							, new ExpjMessage("AF00185").getMessage(_locale)		// エラーメッセージ
							, null
							); 
					_intErrorCount++;
					continue;
				}else{
					// 出庫完了、数値以外の場合
					if (!isNumChk(csvStruct.getISSUE_CMPLT_FLG())) {
						csvExport(csvStruct
								, "1"										// エラー区分
								, i + 1										// エラー行番号
								, "Expj.ISSUE_CMPLT_FLG_2"					// エラー項目名
								, new ExpjMessage("AA01503").getMessage(_locale)// エラーメッセージ
								, null);	
						_intErrorCount++;
						continue;
					}
					// 出庫完了、Nullではない、かつ、（0,1）以外の場合
					if (!"0".equals(csvStruct.getISSUE_CMPLT_FLG()) && !"1".equals(csvStruct.getISSUE_CMPLT_FLG())) {
						csvExport(csvStruct
								, "1"										// エラー区分
								, i + 1										// エラー行番号
								, "Expj.ISSUE_CMPLT_FLG_2"					// エラー項目名
								, new ExpjMessage("AF00186").getMessage(_locale)// エラーメッセージ
								, null);	
						_intErrorCount++;
						continue;
					}
				}
				// 以下出庫先保管区コードのチェック
				if (!isNull(csvStruct.getRCV_WH_CD())) {
					// 出庫先保管区コード、文字26桁以上の場合
					if (strLengthChk(csvStruct.getRCV_WH_CD()) >=26) {
						csvExport(csvStruct
								, "1"										// エラー区分
								, i + 1										// エラー行番号
								, "Expj.RCV_WH_CD_1"					// エラー項目名
								, new ExpjMessage("AA01501").getMessage(_locale)// エラーメッセージ
								, null);	
						_intErrorCount++;
						continue;
					}
					// 出庫先保管区コード、禁則文字が入力されていた場合
					if (chkHankaku(csvStruct.getRCV_WH_CD())) {
						csvExport(csvStruct
								, "1"										// エラー区分
								, i + 1										// エラー行番号
								, "Expj.RCV_WH_CD_1"					// エラー項目名
								, new ExpjMessage("AA01524").getMessage(_locale)// エラーメッセージ
								, null);	
						_intErrorCount++;
						continue;
					}
				}

				// 以下メーカロット番号のチェック
				if (!isNull(csvStruct.getVEND_LOT_NO())) {
					// メーカロット番号、文字26桁以上の場合
					if (strLengthChk(csvStruct.getVEND_LOT_NO()) >=26) {
						csvExport(csvStruct
								, "1"										// エラー区分
								, i + 1										// エラー行番号
								, "Expj.VEND_LOT_NO"					// エラー項目名
								, new ExpjMessage("AA01501").getMessage(_locale)// エラーメッセージ
								, null);	
						_intErrorCount++;
						continue;
					}
					// メーカロット番号、禁則文字が入力されていた場合
					if (chkHankaku(csvStruct.getVEND_LOT_NO())) {
						csvExport(csvStruct
								, "1"										// エラー区分
								, i + 1										// エラー行番号
								, "Expj.VEND_LOT_NO"					// エラー項目名
								, new ExpjMessage("AA01524").getMessage(_locale)// エラーメッセージ
								, null);	
						_intErrorCount++;
						continue;
					}
				}
				
				// マスタ整合性チェック
				//「出庫指示番号」 への入力値が[出庫指示]に存在しない場合
				List issueinstcd = entity.mselect_T_ISSUE_INST1.read(conn, csvStruct);
				if(issueinstcd.isEmpty()){
					csvExport(csvStruct
							, "1"													// エラー区分
							, i + 1													// エラー行番号
							, "Expj.ISSUE_INST_CD"										// エラー項目名
							, new ExpjMessage("AF00007").getMessage(_locale)
							, null);		// エラーメッセージ
					_intErrorCount++;
					continue;
				}else{
					tIssueinstStruct = (AF0130010Struct)issueinstcd.get(0);
					//[出庫指示].“工場コード” が ログインしたユーザーの工場コードと等しくない場合
					if(!tIssueinstStruct.getPLANT_CD().equals(sysPLANT_CD)){
						csvExport(csvStruct
								, "1"													// エラー区分
								, i + 1													// エラー行番号
								, "Expj.ISSUE_INST_CD"									// エラー項目名
								, new ExpjMessage("AF00182").getMessage(_locale)
								, null);		// エラーメッセージ
						_intErrorCount++;
						continue;
					}
					//[出庫指示].”出庫指示出庫区分” ≠ 1：マニュアル出庫場合
					if(!"1".equals(tIssueinstStruct.getISSUE_TYP())){
						csvExport(csvStruct
								, "1"													// エラー区分
								, i + 1													// エラー行番号
								, "Expj.ISSUE_INST_CD"									// エラー項目名
								, new ExpjMessage("AF00183").getMessage(_locale)
								, null);		// エラーメッセージ
						_intErrorCount++;
						continue;
					}
					//[出庫指示].”出庫完了フラグ” = 1：出庫完了場合
					if("1".equals(tIssueinstStruct.getISSUE_CMPLT_FLG())){
						csvExport(csvStruct
								, "1"													// エラー区分
								, i + 1													// エラー行番号
								, "Expj.ISSUE_INST_CD"									// エラー項目名
								, new ExpjMessage("AF00132").getMessage(_locale)
								, null);		// エラーメッセージ
						_intErrorCount++;
						continue;
					}
					//ADD START 20141208 fei-hy
					//「品目番号」がNULLではないかつ「品目番号」が[出庫指示].“出庫品目番号”と一致しない場合
					if (csvStruct.getITEM_CD() != null && !"".equals(csvStruct.getITEM_CD()) && !csvStruct.getITEM_CD().equals(tIssueinstStruct.getITEM_CD())) {
						csvExport(csvStruct
								, "1"													// エラー区分
								, i + 1													// エラー行番号
								, "Expj.ITEM_CD"								    	// エラー項目名
								, new ExpjMessage("AF00192").getMessage(_locale)
								, null);		// エラーメッセージ
						_intErrorCount++;
						continue;
					}
					//ADD END 20141208 fei-hy
				}
		         
				//[出庫指示].“出庫品目番号”を基に
				//[品目].” 品目手配区分”が「1:製番 」または「2:在庫引当型製番」以外かつ製番がNULLではない場合
				List lotctrlflg =entity.mselect_LOT_CTRL_FLG.read(conn, csvStruct);
				tlotcrtl =(AF0130010Struct)lotctrlflg.get(0);
				if(!("1".equals(tlotcrtl.getMRP_ODR_TYP()) ||"2".equals(tlotcrtl.getMRP_ODR_TYP()))){
					if(!isNull(csvStruct.getJOB_ODR_CD())){
						csvExport(csvStruct
								, "1"													// エラー区分
								, i + 1													// エラー行番号
								, "Expj.JOB_ODR_CD"			                            // エラー項目名
								, new ExpjMessage("AF00018").getMessage(_locale)
								, null);		// エラーメッセージ
						_intErrorCount++;
						continue;
					}
				}
				
				//製番がNULLではない、かつ、[製番計画] はデータが検索できない場合
				tIssueinstStruct = (AF0130010Struct)issueinstcd.get(0);
				if(!isNull(csvStruct.getJOB_ODR_CD())){
					boolean blnTWorkProcByItem = entity.mcheck_JOB_ODR_CD.check(conn, csvStruct);
					if (!blnTWorkProcByItem) {
						csvExport(csvStruct
								, "1"													// エラー区分
								, i + 1													// エラー行番号
								, "Expj.JOB_ODR_CD" 									// エラー項目名
								, new ExpjMessage("AF00184").getMessage(_locale)
								, null);		                                        // エラーメッセージ
						_intErrorCount++;
						continue;
					}
				}
				
				
				//「出庫元保管区コード」 と 「出庫先保管区コード」 の入力値が同じ場合
				if(csvStruct.getWH_CD().equals(csvStruct.getRCV_WH_CD())){
					csvExport(csvStruct
							, "1"													// エラー区分
							, i + 1													// エラー行番号
							, "Expj.RCV_WH_CD_1"				// エラー項目名
							, new ExpjMessage("AF00054").getMessage(_locale)
							, null);		// エラーメッセージ
					_intErrorCount++;
					continue;
				}
				
				//「出庫元保管区コード」 が [保管区] に存在しない場合
				List whList  =entity.mselect_M_WH.read(conn, csvStruct);
				if(whList.isEmpty()){
					csvExport(csvStruct
							, "1"													// エラー区分
							, i + 1													// エラー行番号
							, "Expj.ISSUE_WH_CD_1"			                        // エラー項目名
							, new ExpjMessage("AF00028").getMessage(_locale)
							, null);		// エラーメッセージ
					_intErrorCount++;
					continue;
				}else{
					//「出庫元保管区コード」の[保管区].“工場コード” と ログインユーザーの工場コード が異なる場合
					if(!((AF0130010Struct)whList.get(0)).getPLANT_CD().equals(sysPLANT_CD))
					{
						csvExport(csvStruct
								, "1"													// エラー区分
								, i + 1													// エラー行番号
								, "Expj.ISSUE_WH_CD_1"			                        // エラー項目名
								, new ExpjMessage("AF00029").getMessage(_locale)
								, null);		// エラーメッセージ
						_intErrorCount++;
						continue;
					}
					//「出庫元保管区コード」を基に[保管区].“所要量計算対象フラグ” が 1：所要量計算対象 でない場合
					if(! "1".equals(((AF0130010Struct)whList.get(0)).getMRP_FLG())){
						csvExport(csvStruct
								, "1"													// エラー区分
								, i + 1													// エラー行番号
								, "Expj.ISSUE_WH_CD_1"			                        // エラー項目名
								, new ExpjMessage("AF00096").getMessage(_locale)
								, null);		// エラーメッセージ
						_intErrorCount++;
						continue;
					}
				}
				if("1".equals(tlotcrtl.getLOT_CTRL_FLG())){
					//[出庫指示].“出庫品目番号”を基に[品目].”ロット管理フラグ”が「１：ロット管理を行う」、
					//「在庫ロット番号」がNULL場合
					if(isNull(csvStruct.getLOT_NO())){
						csvExport(csvStruct
								, "1"													// エラー区分
								, i + 1													// エラー行番号
								, "Expj.STOCK_LOT_CD"			                        // エラー項目名
								, new ExpjMessage("AF20001").getMessage(_locale)
								, null);		// エラーメッセージ
						_intErrorCount++;
						continue;
					}else{
						// [出庫指示].“出庫品目番号”を基に[品目].”ロット管理フラグ”が「１：ロット管理を行う」、
						//「在庫ロット番号」と、[出庫指示]．“出庫品目番号”で [ロット管理]を検索し存在しない場合
						boolean chklotno =entity.mcheck_TLOT_CTRL.check(conn, csvStruct);
						if (!chklotno) {
							csvExport(csvStruct
									, "1"													// エラー区分
									, i + 1													// エラー行番号
									, "Expj.STOCK_LOT_CD"									// エラー項目名
									, new ExpjMessage("AF20002").getMessage(_locale)
									, null);		// エラーメッセージ
							_intErrorCount++;
							continue;
						}
					}
				
				}else{
					// [出庫指示].“出庫品目番号”を基に[品目].”ロット管理フラグ”が「0：ロット管理を行わない」、
					//「製番」 が null で 「出庫数」 の値が ＞ 0 の場合
					//品目番号、保管区 を基に [保管区別品目在庫] が存在しない場合
					List itemstock =entity.mselect_T_ITEM_STOCK.read(conn, csvStruct);
					if (isNull(csvStruct.getJOB_ODR_CD()) && Calculate.compare(csvStruct.getISSUE_QTY(), "0")  >0 && itemstock.size()<=0) {
						csvExport(csvStruct
								, "1"													// エラー区分
								, i + 1													// エラー行番号
								, "Expj.ISSUE_QTY"									// エラー項目名
								, new ExpjMessage("AF00044").getMessage(_locale)
								, null);		// エラーメッセージ
						_intErrorCount++;
						continue;
					}
					
					//[出庫指示].“出庫品目番号”を基に[品目].”ロット管理フラグ”が「0：ロット管理を行わない」、
					//「製番」 が nullではない で 「出庫数」 の値が ＞ 0 の場合
					//製番、品目番号、保管区 を基に [保管区別製番在庫] が存在しない場合
					List itemjobstock =entity.mselect_T_JOB_ODR_CD_STOCK.read(conn, csvStruct);
					if (!isNull(csvStruct.getJOB_ODR_CD()) && Calculate.compare(csvStruct.getISSUE_QTY(), "0")>0 && itemjobstock.size()<=0) {
						csvExport(csvStruct
								, "1"													// エラー区分
								, i + 1													// エラー行番号
								, "Expj.ISSUE_QTY"									// エラー項目名
								, new ExpjMessage("AF00045").getMessage(_locale)
								, null);		// エラーメッセージ
						_intErrorCount++;
						continue;
					}
					//[出庫指示].“出庫品目番号”を基に[品目].”ロット管理フラグ”が「0：ロット管理を行わない」、
					//品目手配区分が 1：製番 もしくは 2：在庫引当型製番 で 「製番
					//」がnullで 「出庫数」 ＞ 「出庫可能数」 の場合
					tIssueinstStruct = (AF0130010Struct)issueinstcd.get(0);
					//引当済未出庫数
					IssueRemain issueRemain = new IssueRemain(conn);
					struct.setALC_NOISSUE_QTY(
					issueRemain.getRemainQtyByItem(tIssueinstStruct.getOD_NO()).toString());

					// 「品目在庫未引当数」
					struct.setITEM_STOCK_NON_ALC_QTY(
					issueRemain.getFreeStockQtyOfItem(sysPLANT_CD,tIssueinstStruct.getITEM_CD()).toString());
					//「出庫可能数」 = 「引当済未出庫数」 ＋ 「品目在庫未引当数」
					struct.setTHIS_TIME_ISSUE_POSS_QTY(
					Calculate.add(struct.getALC_NOISSUE_QTY(), struct.getITEM_STOCK_NON_ALC_QTY()));
					
					if("1".equals(tlotcrtl.getMRP_ODR_TYP()) ||"2".equals(tlotcrtl.getMRP_ODR_TYP()) ){
						BigDecimal issueQty = new BigDecimal(csvStruct.getISSUE_QTY());
						BigDecimal itemStock = new BigDecimal(struct.getITEM_STOCK_NON_ALC_QTY());
						if (isNull(csvStruct.getJOB_ODR_CD()) 
								&& issueQty.doubleValue() > itemStock.doubleValue()) {
							csvExport(csvStruct
									, "1"													// エラー区分
									, i + 1													// エラー行番号
									, "Expj.ISSUE_QTY"									    // エラー項目名
									, new ExpjMessage("AF00115").getMessage(_locale)
									, null);		// エラーメッセージ
							_intErrorCount++;
							continue;
						}
					}
					
					//// クリア
					struct.setALC_NOISSUE_QTY("0.0");
					struct.setITEM_STOCK_NON_ALC_QTY("0.0");
					struct.setTHIS_TIME_ISSUE_POSS_QTY("0.0");
					
					//[出庫指示].“出庫品目番号”を基に[品目].”ロット管理フラグ”が「0：ロット管理を行わない」、
					//品目手配区分が 1：製番 もしくは 2：在庫引当型製番 で 「製番」がnullではないで 
					//「製番」が自製番でなく  「出庫数」 ＞ 「出庫可能数」 の場合
					
					//個別手配分出庫可能数
					IssueRemain.ResultByOd  re = issueRemain.getRemainQtyByOd(tIssueinstStruct.getOD_NO());
					struct.setODR_ISSUE_POSS_QTY(re.remainQty.toString());
					
					//「製番」 が nullではない の場合
					List tmpList;
					// 製番がnullでない時、製番在庫 読込
					tmpList = entity.mselectSub1_ODR_STOCK.read(conn, struct);
					
					if(tmpList.size()> 0){
						AF0130010Struct tmpStruct = (AF0130010Struct)tmpList.get(0);
						struct.setw_TOTAL_STOCK_ON_HAND_QTY(tmpStruct.getw_TOTAL_STOCK_ON_HAND_QTY());
					}
					//「引当済未出庫数」
					struct.setITEM_STOCK_NON_ALC_QTY(struct.getw_TOTAL_STOCK_ON_HAND_QTY());
					
					
					//品目の品目手配区分が 1：製番 もしくは 2：在庫引当型製番 で 「製番」が nullではない の場合、
					//「出庫可能数」 = 「個別手配分出庫可能数」＋「引当済未出庫数」
					struct.setTHIS_TIME_ISSUE_POSS_QTY(
							Calculate.add(struct.getODR_ISSUE_POSS_QTY(), struct.getALC_NOISSUE_QTY()));

					if("1".equals(tlotcrtl.getMRP_ODR_TYP()) || "2".equals(tlotcrtl.getMRP_ODR_TYP())){
						if (!isNull(csvStruct.getJOB_ODR_CD()) 
								&& Calculate.compare(csvStruct.getISSUE_QTY(), struct.getTHIS_TIME_ISSUE_POSS_QTY())>0) {
							csvExport(csvStruct
									, "1"													// エラー区分
									, i + 1													// エラー行番号
									, "Expj.ISSUE_QTY"									// エラー項目名
									, new ExpjMessage("AF00116").getMessage(_locale)
									, null);		// エラーメッセージ
							_intErrorCount++;
							continue;
						}
					}
					
				}
				// 「出庫日」 が 「未来日(業務運用日より未来) である場合
				// 業務運用日
				BigDecimal decimalBusinessDate = new BigDecimal(_btmBusinessOprDate.substring(0,4) + 
						_btmBusinessOprDate.substring(5,7)+ _btmBusinessOprDate.substring(8,10));
				// 出庫日
				BigDecimal decimalOprDate = new BigDecimal(chageDate(csvStruct.getISSUE_DATE_SUB()).substring(0,4) + 
						chageDate(csvStruct.getISSUE_DATE_SUB()).substring(5,7)+ chageDate(csvStruct.getISSUE_DATE_SUB()).substring(8,10));
				if (decimalOprDate.compareTo(decimalBusinessDate) > 0) {
					csvExport(csvStruct
							, "1"													// エラー区分
							, i + 1													// エラー行番号
							, "Expj.ISSUE_DATE"										// エラー項目名
							, new ExpjMessage("ZZ05103").getMessage(_locale)
							, null);		// エラーメッセージ
					_intErrorCount++;
					continue;
				}
				
				// 実際原価の締めが完了している日付チェック、「システムパラメータ」．設定値=“false”の場合、「出庫日」の年月 （YYYY/MM）が[実際原価管理パラメータ].“対象年月”より過去の場合
				if ("false".equals(strValus)) {
					if(!checkProcExecDate(csvStruct.getISSUE_DATE_SUB(),tIssueinstStruct.getPLANT_CD(),struct)){
						csvExport(csvStruct
								, "1"													// エラー区分
								, i + 1													// エラー行番号
								, "Expj.ISSUE_DATE"							// エラー項目名
								, new ExpjMessage("AE00160").getMessage(_locale)
								, null);		// エラーメッセージ
						_intErrorCount++;
						continue;
					}
				}
				//[出庫指示].“出庫品目番号”を基に[品目].”ロット管理フラグ”が「１：ロット管理を行う」場合、
				//「在庫ロット番号」がNullでないまたは「出庫数」が０以外、かつ、[ロット管理].”賞味期限”＜ 「出庫日」、かつ、
				//[パラメータ].” 名前”＝’ BEST_BEFORE_DATE_CHECK_FLG’が1:エラーの場合
				List bestbeforedate = entity.mc_BEST_BEFORE_DATE.read(conn, csvStruct);
				csvStruct.setSYS_PARAMETER_NAME("BEST_BEFORE_DATE_CHECK_FLG");
				
				List syspara =entity.mSELECT_SYS_PARAMETER.read(conn, csvStruct);
				
				if("1".equals(tlotcrtl.getLOT_CTRL_FLG())){
					if(!isNull(csvStruct.getLOT_NO())|| !"0".equals(csvStruct.getISSUE_QTY())){
						if(bestbeforedate.size()>0 && syspara.size()>0 ){
							AF0130010Struct bbdstruct = new AF0130010Struct();
							bbdstruct = (AF0130010Struct)bestbeforedate.get(0);						
							AF0130010Struct sysvalue = new AF0130010Struct();
							sysvalue = (AF0130010Struct)syspara.get(0);
							if("1".equals(bbdstruct.getBEST_BEFORE_DATE())){
								if("1".equals(sysvalue.getSYS_PARAMETER_VALUE())){
									csvExport(csvStruct
											, "1"													// エラー区分
											, i + 1													// エラー行番号
											, "Expj.ISSUE_DATE"							// エラー項目名
											, new ExpjMessage("AE05060").getMessage(_locale)
											, null);		// エラーメッセージ
									_intErrorCount++;
									continue;
								}else{
									lotWarningFlg = true;
								
							}
						}
						}
				}
				}
				
				// 買掛管理がインストールされている場合、当年月度を取得
				AF0130010Struct readStruct = new AF0130010Struct();
				List installOptionsList = entity.mSYS_INSTALL_OPTIONS.read(conn, readStruct);
				if (installOptionsList.size() > 0) {
					AF0130010Struct installOptionsStruct = (AF0130010Struct)installOptionsList.get(0);
					csvStruct.setINSTALL_FLG(installOptionsStruct.getINSTALL_FLG());
				} else {
					csvStruct.setINSTALL_FLG("0");
				}
				
				// [インストールオプション].” システムオプション識別子” ＝ C* 、[インストールオプション].” システム導入フラグ” ＝ 1:導入、
				//[出庫指示].”支給区分” ＝ 1：有償支給の場合で
				//[自社].”SYSコントロールコード”　＝　SYSTEM、[自社].”会社コード”＝[買掛システム管理].”会社コード”となる
				//レコードが存在しない場合
				if ("1".equals(csvStruct.getINSTALL_FLG())) {
					List debtCtrlList = entity.mSYS_DEBT_CTRL.read(conn, readStruct);
					if (debtCtrlList.size() > 0) {
						AF0130010Struct debtCtrlStruct = (AF0130010Struct)debtCtrlList.get(0);
						csvStruct.setTHIS_MONTH(debtCtrlStruct.getTHIS_MONTH());
					} else {
						csvExport(csvStruct
								, "1"													// エラー区分
								, i + 1													// エラー行番号
								, "Expj.ISSUE_DATE"										// エラー項目名
								, new ExpjMessage("AF00142").getMessage(_locale)
								, null);		// エラーメッセージ
						_intErrorCount++;
						continue;
					}
				}	
				//[出庫指示].”出庫先保管区コード”≠Ｎｕｌｌで、「出庫先保管区コード」＝Ｎｕｌｌの場合
				if(!isNull(tIssueinstStruct.getRCV_WH_CD())&& isNull(csvStruct.getRCV_WH_CD())){
					csvStruct.setRCV_WH_CD(tIssueinstStruct.getRCV_WH_CD());
				}
				//[出庫指示].”出庫先保管区コード”＝Ｎｕｌｌで、「出庫先保管区コード」≠Ｎｕｌｌの場合
				if(isNull(tIssueinstStruct.getRCV_WH_CD())&& !isNull(csvStruct.getRCV_WH_CD())){
					csvExport(csvStruct
							, "1"													// エラー区分
							, i + 1													// エラー行番号
							, "Expj.RCV_WH_CD_1"										// エラー項目名
							, new ExpjMessage("AF00138").getMessage(_locale)
							, null);		// エラーメッセージ
					_intErrorCount++;
					continue;
				}
				//「出庫先保管区コード」がＮｕｌｌでなく、[保管区] に存在しない場合
				_wh_cd = null;
				_wh_cd =csvStruct.getWH_CD();
				csvStruct.setWH_CD(csvStruct.getRCV_WH_CD());
				List rcvWhList =entity.mselect_M_WH.read(conn, csvStruct);
				csvStruct.setWH_CD(_wh_cd);
				AF0130010Struct rcvWhStruct = new AF0130010Struct();
				if(!isNull(csvStruct.getRCV_WH_CD())){
					if(rcvWhList.isEmpty()){
						csvExport(csvStruct
								, "1"													// エラー区分
								, i + 1													// エラー行番号
								, "Expj.RCV_WH_CD_1"										// エラー項目名
								, new ExpjMessage("AF00031").getMessage(_locale)
								, null);		// エラーメッセージ
						_intErrorCount++;
						continue;
					}else{
						rcvWhStruct =(AF0130010Struct)rcvWhList.get(0);
						//「出庫先保管区コード」の[保管区].“工場コード” と ログインユーザーの工場コード が異なる場合
						if(!rcvWhStruct.getPLANT_CD().equals(sysPLANT_CD)){
							csvExport(csvStruct
									, "1"													// エラー区分
									, i + 1													// エラー行番号
									, "Expj.RCV_WH_CD_1"										// エラー項目名
									, new ExpjMessage("AF00032").getMessage(_locale)
									, null);		// エラーメッセージ
							_intErrorCount++;
							continue;
					}
						//「出庫先保管区コード」≠Ｎｕｌｌで
						//「出庫先保管区コード」と一致する[保管区].”所要量計算対象フラグ”＝1:所要量計算対象の場合
						if("1".equals(rcvWhStruct.getMRP_FLG())){
							csvExport(csvStruct
									, "1"													// エラー区分
									, i + 1													// エラー行番号
									, "Expj.RCV_WH_CD_1"										// エラー項目名
									, new ExpjMessage("AF00139").getMessage(_locale)
									, null);		// エラーメッセージ
							_intErrorCount++;
							continue;
					}
						//「出庫先保管区コード」≠Ｎｕｌｌで、[出庫指示].”支給区分”支給区分」＝0：非の場合、
						//「出庫先保管区コード」と一致する[保管区].”取引先”≠Ｎｕｌｌの場合
						if("0".equals(tIssueinstStruct.getCONS_TYP())){
							if(!isNull(rcvWhStruct.getVEND_CD())){
								csvExport(csvStruct
										, "1"													// エラー区分
										, i + 1													// エラー行番号
										, "Expj.RCV_WH_CD_1"										// エラー項目名
										, new ExpjMessage("AF00140").getMessage(_locale)
										, null);		// エラーメッセージ
								_intErrorCount++;
								continue;
						}
					 }else{
						 if(isNull(rcvWhStruct.getVEND_CD())|| isNull(tIssueinstStruct.getVEND_CD())){
							 csvExport(csvStruct
										, "1"													// エラー区分
										, i + 1													// エラー行番号
										, "Expj.RCV_WH_CD_1"										// エラー項目名
										, new ExpjMessage("AF00141").getMessage(_locale)
										, null);		// エラーメッセージ
								_intErrorCount++;
								continue;
						 }else{
								//「出庫先保管区コード」≠Ｎｕｌｌ、[出庫指示].”支給区分”≠0：非の場合、
								//「出庫先保管区コード」と一致する[保管区].”取引先” [出庫指示].”取引先コード”が一致しない場合
								if(!rcvWhStruct.getVEND_CD().equals(tIssueinstStruct.getVEND_CD()) ){
									csvExport(csvStruct
											, "1"													// エラー区分
											, i + 1													// エラー行番号
											, "Expj.RCV_WH_CD_1"										// エラー項目名
											, new ExpjMessage("AF00141").getMessage(_locale)
											, null);		// エラーメッセージ
									_intErrorCount++;
									continue;
							}
						 }	
				  }
				}
			}	
			
			//[出庫指示].“出庫品目番号”を基に[品目].”ロット管理フラグ”が「１：ロット管理を行う」場合、「在庫ロット番号」がNullでないまたは「出庫数」が０以外の場合かつ、
			//[ロット管理].”賞味期限”＜ 「出庫日」
			//[パラメータ].” 名前”＝’ BEST_BEFORE_DATE_CHECK_FLG’が2:警告の場合
			if (lotWarningFlg){	
				csvExport(csvStruct
						, "2"													// エラー区分
						, i + 1													// エラー行番号
						, "Expj.ISSUE_DATE"							// エラー項目名
						, new ExpjMessage("AE05061").getMessage(_locale)
						, null);		// エラーメッセージ
				if (!warningFlg){
					_intWarningCount++;
					warningFlg = true;
				}	
			}	
				// [インストールオプション].” システムオプション識別子” ＝ C* 、[インストールオプション].” システム導入フラグ” ＝ 1:導入、
				//[出庫指示].”支給区分” ＝ 1：有償支給の場合で
				//[自社].”SYSコントロールコード”　＝　SYSTEM、[自社].”会社コード”＝[買掛システム管理].”会社コード”、
				//[買掛システム管理]."当年月度"＞「出庫日」（YYYY/MM）
				if ("1".equals(csvStruct.getINSTALL_FLG())) {
					List debtCtrlList = entity.mSYS_DEBT_CTRL.read(conn, readStruct);
					AF0130010Struct debtCtrlStruct = (AF0130010Struct)debtCtrlList.get(0);
					if ("1".equals(tIssueinstStruct.getCONS_TYP()) && debtCtrlList.size() > 0){
						if(debtCtrlStruct.getTHIS_MONTH().compareTo(csvStruct.getISSUE_DATE())>0){
							csvExport(csvStruct					// 対象データ情報
									, "2"						// エラー区分
									, i + 1						// エラー発生行
									,"Expj.ISSUE_DATE"			// エラー項目名
									,new ExpjMessage("AF00187").getMessage(_locale)
									, null);	// エラーメッセージ
							if (!warningFlg){
								_intWarningCount++;
								warningFlg = true;
							}

						}
						}
					}
				
				BigDecimal decimalIssueQty2 = new BigDecimal("0");
				BigDecimal decimalIssueQty = new BigDecimal(csvStruct.getISSUE_QTY());
				// 出庫数
				//整数管理品目
				decimalIssueQty2 = decimalIssueQty.setScale(0,BigDecimal.ROUND_FLOOR);
				//切り下げ処理前と後で値が異なっていたら小数が入力されていたと判断しワーニングとする
				if (decimalIssueQty.doubleValue() != decimalIssueQty2.doubleValue()){
					csvExport(csvStruct					// 対象データ情報
							, "2"						// エラー区分
							, i + 1						// エラー発生行
							,"Expj.ISSUE_QTY"			// エラー項目名
							,new ExpjMessage("AF60004").getMessage(_locale)
							, null);	// エラーメッセージ
					if (!warningFlg){
						_intWarningCount++;
						warningFlg = true;
					}
					
					csvStruct.setISSUE_QTY(decimalIssueQty2.toString());
				}	
				
				//「出庫数」 の値が出庫残数より大きく 「完了フラグ」 の入力値が 未 の場合
				BigDecimal decimalRemainQty = new BigDecimal(tIssueinstStruct.getSHIP_REMAIN_QTY());
				if (decimalIssueQty.doubleValue() > decimalRemainQty.doubleValue())
				{
					if("0".equals(csvStruct.getISSUE_CMPLT_FLG())){
						csvExport(csvStruct					// 対象データ情報
								, "2"						// エラー区分
								, i + 1						// エラー発生行
								,"Expj.ISSUE_QTY"			// エラー項目名
								,new ExpjMessage("AF00188").getMessage(_locale)
								, null);	// エラーメッセージ
						if (!warningFlg){
							_intWarningCount++;
							warningFlg = true;
						}

					}
				}
			
				//「出庫数」 の値が出庫残数より小さく 「完了フラグ」 の入力値が 完了 の場合
				if (decimalIssueQty.doubleValue() < decimalRemainQty.doubleValue())
				{
					if("1".equals(csvStruct.getISSUE_CMPLT_FLG())){
						csvExport(csvStruct					// 対象データ情報
								, "2"						// エラー区分
								, i + 1						// エラー発生行
								,"Expj.ISSUE_QTY"			// エラー項目名
								,new ExpjMessage("AF00189").getMessage(_locale)
								, null);	// エラーメッセージ
						if (!warningFlg){
							_intWarningCount++;
							warningFlg = true;
						}
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
			 ExpjMessage emsg = new ExpjMessage("ZZ01106");
			 sysLog.severe(emsg, getsysUSER_CD());
			 ExpjException ee = new ExpjException(e, emsg);
			 throw ee;
		}
	}
	
   //CVSファイルを読込
	private List readCsvData() throws ExpjException{

		String[] strsCsvData = null;
		List listCsv = new ArrayList();
		try {
			// CSVデータのアップロード
			strsCsvData = (String []) csvReader.lineRead();
			if (strsCsvData != null) {
				setSyslogConfig("strsCsvData.length:" + strsCsvData.length);
				// データ件数としてstrsCsvData.lengthは使えない。実際の行数＋５行くらいらしい
				AF0130010Struct structCsv = null;
				Vector v = null;
				for (int i = 0; i < strsCsvData.length; i++) {
					if (strsCsvData[i].length() == 0) {
						// 処理を抜ける。
						break;
					}
					// タイトル行読み飛ばし
					if(i == 0) {
						continue;
					}

					// レコードを項目毎にばらす
					v = csvReader.importCSVLine(strsCsvData[i]);
					if (v != null ) {
						structCsv = new AF0130010Struct();
						if (CSV_NECESSARY_COLUMN == v.size()) {
							 // 出庫指示番号
							structCsv.setISSUE_INST_CD((String)v.get(CSV_ISSUE_INST_CD));
							//ADD START 20141208 fei-hy
							//品目番号
							structCsv.setITEM_CD((String)v.get(CSV_ITEM_CD));
							//ADD END 20141208 fei-hy

							// 製番
							structCsv.setJOB_ODR_CD((String)v.get(CSV_OB_ODR_CD));
							structCsv.setL_JOB_ODR_CD((String)v.get(CSV_OB_ODR_CD));
							// 出庫元保管区コード
							structCsv.setWH_CD((String)v.get(CSV_ISSUE_WH_CD)); 
							// 在庫ロット番号
							structCsv.setLOT_NO((String)v.get(CSV_STOCK_LOT_CD));
							// 出庫数
							structCsv.setISSUE_QTY((String)v.get(CSV_ISSUE_QTY)); 
							structCsv.setLA_ISSUE_QTY((String)v.get(CSV_ISSUE_QTY)); 
							// 出庫日
							structCsv.setISSUE_DATE((String)v.get(CSV_ISSUE_DATE)); 
							// 出庫完了
							structCsv.setISSUE_CMPLT_FLG((String)v.get(CSV_ISSUE_CMPLT_FLG)); 
							// 出庫先保管区コード
							structCsv.setRCV_WH_CD((String)v.get(CSV_RCV_WH_CD)); 
							// メーカロット番号
							structCsv.setVEND_LOT_NO((String)v.get(CSV_VEND_LOT_NO));
						
							structCsv.setw_COLUMN_FLG(null);
						} else {
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
			setErrorMessage("AH00042", "0", "0");
			setReadStatus(ERROR);
			throw new ExpjException(e);
		}
		return listCsv;
	
	}
	
	/**
	* ＣＳＶ出力データ設定準備
	* 
	* @param target_struct
	*			対象データ情報
	* @param errTyp
	*			エラー区分 
	* @param errlineNo
	*			エラー発生行
	* @param errItemNo
	*			エラー項目番号
	* @param errItem
	*			エラー項目名
	* @param errMsg
	*			エラーメッセージ
	* @param errMsg
	*			エラー項目名
	* @return 異常なし true エラー false
	*/  
	
	private boolean csvExport(AF0130010Struct targetStruct, String errTyp, int errlineNo, String errItem, String errMsg, String errItemCd) {
		AF0130010Struct errStruct = new AF0130010Struct();
		// エラー箇所
		ExpjMessage emsg = new ExpjMessage("AA01520", String.valueOf(errlineNo));
		errStruct.setl_ERROR_IN(emsg.getMessage(_locale));
		
		String strErrItem = null;
		
		if (!isNull(errItemCd)) {
			strErrItem = CoreTools.getRBString(errItem, _resource) + "," +CoreTools.getRBString(errItemCd, _resource);
		}else{
			strErrItem = CoreTools.getRBString(errItem, _resource);
		}

		// エラー区分
		errStruct.setl_ERR_TYP(getDisplayName(_COM_ERR_TYP, errTyp));
		// エラー内容
		errStruct.setl_ERR_INFO(errMsg);
		// エラー項目名
		errStruct.setl_ERR_CTR_NM(strErrItem);
		// 出庫指示番号
		errStruct.setl_ERR_ISSUE_INST_CD(replaceSlashAdd(targetStruct.getISSUE_INST_CD()));
		// 品目番号
		errStruct.setl_ERR_ITEM_CD(replaceSlashAdd(targetStruct.getITEM_CD()));

		// 製番
		errStruct.setl_ERR_JOB_ODR_CD(replaceSlashAdd(targetStruct.getL_JOB_ODR_CD()));
		// 出庫元保管区コード
		errStruct.setl_ERR_ISSUE_WH_CD(replaceSlashAdd(targetStruct.getWH_CD()));
		// 在庫ロット番号
		errStruct.setl_ERR_STOCK_LOT_CD(replaceSlashAdd(targetStruct.getLOT_NO()));
		// 出庫数
		errStruct.setl_ERR_ISSUE_QTY(replaceSlashAdd(targetStruct.getLA_ISSUE_QTY()));

		// 出庫日
		errStruct.setl_ERR_ISSUE_DATE(replaceSlashAdd(targetStruct.getISSUE_DATE()));

		// 出庫完了
		errStruct.setl_ERR_ISSUE_CMPLT_FLG(replaceSlashAdd(targetStruct.getISSUE_CMPLT_FLG()));
		// 出庫先保管区コード
		errStruct.setl_ERR_RCV_WH_CD(replaceSlashAdd(targetStruct.getRCV_WH_CD()));
		//メーカロット番号
		errStruct.setl_ERR_VEND_LOT_NO(replaceSlashAdd(targetStruct.getVEND_LOT_NO()));
		// listを追加
		list.add(errStruct);
		return true;
	}

	/**
	 * CSVフェイル内容は、登録処理
	 * @param csvList
	 * @return
	 * @throws FoundationException 
	 */
	private boolean insertCsvDate(List csvList) throws FoundationException, ExpjException {
		try {
			boolean rtnFlg = true;
			conn.beginTransWeb();
			for (int i = 0; i < csvList.size(); i++) {
				
				AF0130010Struct cvsStruct = (AF0130010Struct)csvList.get(i);
				
				AF0130010Struct tlotcrtl  =new AF0130010Struct();
				List lotctrlflg =entity.mselect_LOT_CTRL_FLG.read(conn, cvsStruct);
				tlotcrtl =(AF0130010Struct)lotctrlflg.get(0);
				
				//ロット管理フラグが0：ロット管理を行わない場合
				if("0".equals(tlotcrtl.getLOT_CTRL_FLG())){
					//在庫ロット番号  null
					cvsStruct.setLOT_NO("");
					
					//製番品の品目在庫未引当分から出庫する場合
					//「製番在庫から出庫する」がOffで 「出庫数」が 品目在庫からの「引当済未出庫数」より大きい場合
					//製番引当の追加・更新
					rtnFlg = insertTjobodralc(cvsStruct, i);
					if(!rtnFlg) {
						conn.rollback();
						return false;
					}
					//保管区別入出庫] へ追加を行い、取得した 「入出庫管理番号」 をパラメータとして、
					//出庫処理 を呼び出す
					rtnFlg = insert_issue_process(cvsStruct, i);
					if(!rtnFlg) {
						conn.rollback();
						return false;
					}
					//有償支給品の場合、有償支給履歴登録
					//工程保管場所または取引先保管区となる出庫先保管区コードへ入庫するため 
					//[保管区別入出庫]に追加し 取得した入出庫管理番号をパラメータとして入庫処理を呼び出す。
					rtnFlg = insert_rcv_process(cvsStruct, i);
					if(!rtnFlg) {
						conn.rollback();
						return false;
					}
				}
				if("1".equals(tlotcrtl.getLOT_CTRL_FLG())){
					//メーカロット番号 null
					cvsStruct.setVEND_LOT_NO("");
					//製番 null
					cvsStruct.setJOB_ODR_CD("");
					//保管区別入出庫] へ追加を行い、取得した 「入出庫管理番号」 をパラメータとして、
					//出庫処理 を呼び出す
					rtnFlg = insert_issue_process(cvsStruct, i);
					if(!rtnFlg) {
						conn.rollback();
						return false;
					}
					//有償支給品の場合、有償支給履歴登録
					//工程保管場所または取引先保管区となる出庫先保管区コードへ入庫するため 
					//[保管区別入出庫]に追加し 取得した入出庫管理番号をパラメータとして入庫処理を呼び出す。
					rtnFlg = insert_rcv_process(cvsStruct, i);
					if(!rtnFlg) {
						conn.rollback();
						return false;
					}
					//ロット別に出庫した情報を、出庫実績明細へ追加する。	
					rtnFlg = insertupTlotissueinst(cvsStruct, i);
					if(!rtnFlg) {
						conn.rollback();
						return false;
					}
				}
			}
			conn.commit();
			return true;
		} catch (Exception e) {
			conn.rollback();
			throw new ExpjException(e);
		}
		
	}
	/**
	 * CSVフェイル内容は、 [製番引当]の追加・更新
	 * @param csvList
	 * @return
	 * @throws FoundationException 
	 */
	private boolean insertTjobodralc (AF0130010Struct adstruct, int m) throws ExpjException {
		// ログ出力情報格納用
		String logMessage = "";
		
		logMessage = "Control : insertTjobodralc"
				+ ", T_ISSUE_INST.ISSUE_INST_CD:" + adstruct.getISSUE_INST_CD();
	  setSyslogConfig(logMessage);
		boolean jobOdrAlcFlg = false;
		try {
			IssueRemain issueRemain = new IssueRemain(conn);
			
			AF0130010Struct readStruct = new AF0130010Struct();
			readStruct.setw_ISSUE_INST_CD(adstruct.getISSUE_INST_CD());
			readStruct.setw_WS_CD((String)null);
			readStruct.setw_VEND_CD((String)null);
			readStruct.setw_ISSUE_CMPLT_FLG((String)null);
			readStruct.setw_LOT_CTRL_FLG((String)null);
			readStruct.setw_PLANT_CD((String)null);

			List tmpList = entity.mselect_T_ISSUE_INST1.read(conn, adstruct);
			AF0130010Struct issueInstStruct = (AF0130010Struct)tmpList.get(0);
			
			//[品目]からの「品目手配区分」のデータを定義
			AF0130010Struct tlotcrtl  =new AF0130010Struct();
			List lotctrlflg =entity.mselect_LOT_CTRL_FLG.read(conn, adstruct);
			tlotcrtl =(AF0130010Struct)lotctrlflg.get(0);
			
			//引当済未出庫数を取得
			struct.setALC_NOISSUE_QTY(
					issueRemain.getRemainQtyByItem(issueInstStruct.getOD_NO()).toString());
			//製番品の品目在庫未引当分から出庫する場合
			//「製番」がnullで 「出庫数」が 品目在庫からの「引当済未出庫数」より大きい場合は、
			//以下のレコードが存在すれば、更新する。存在する場合、登録する。
			//[製番引当]．"オーダデマンド番号" ＝ [出庫指示]．オーダデマンド番号
			//[製番引当]．"引当在庫区分" ＝ 1：品目在庫

			if(isNull(adstruct.getJOB_ODR_CD())
					&& Calculate.compare(adstruct.getISSUE_QTY(), struct.getALC_NOISSUE_QTY()) == 1 ){
				if(("1".equals(tlotcrtl.getMRP_ODR_TYP()) || "2".equals(tlotcrtl.getMRP_ODR_TYP()))){
					
					// 出庫指示情報クラスに情報をセット
					IssueInstStruct issueInstforStruct = new IssueInstStruct();
					issueInstforStruct.m_OD_NO = issueInstStruct.getOD_NO();
					issueInstforStruct.m_PLANT_CD = sysPLANT_CD;
					issueInstforStruct.m_ITEM_CD = issueInstStruct.getITEM_CD();
					
					// 更新情報クラスに情報をセット
					UpdateInfo updateInfo = new UpdateInfo(sysUSER_CD, this.sp.getProcId(), 0);
					
					// [製番引当]の追加・更新
					(new JobOdrAlc(conn)).updateAlcQty(issueInstforStruct,
							new BigDecimal(adstruct.getISSUE_QTY()), updateInfo);
					jobOdrAlcFlg = true;;
					
					// [製番引当]を更新した場合
					if(jobOdrAlcFlg){
						csvExport(adstruct					// 対象データ情報
								, "2"						// エラー区分
								, m + 1						// エラー発生行
								,""			// エラー項目名
								,new ExpjMessage("AD60002", issueInstStruct.getITEM_CD()).getMessage(_locale)
								, null);	// エラーメッセージ
						if (!warningFlg){
							_intWarningCount1++;
							warningFlg = true;
						}
					}
				}
				}
		}catch(Exception e) {
			throw new ExpjException(e);
		}
		return true;
	}
	//---------- 出庫処理ＤＢ登録処理（親画面、子画面で共通使用の為）） --------------------
		/**
		 * 親画面の登録ボタンと子画面の登録ボタンから共通に呼び出される処理です。
		 *
		 * @return (true:正常終了  false:異常終了）
		 */
		private boolean insert_issue_process(AF0130010Struct adstruct, int n) throws BusinessProcessException, FoundationException, SQLException
		{
			// ログ出力情報格納用
			String logMessage = "";
			String message1 = "";
			List listMessage = new ArrayList();
			

			logMessage = "Control : insert_issue_process"
						+ ", T_ISSUE_INST.ISSUE_INST_CD:" + adstruct.getISSUE_INST_CD();
			setSyslogConfig(logMessage);

				//----------------------------------------------------------
				// 保管区別入出庫（出庫）登録
				//----------------------------------------------------------
				// 入出庫管理番号採番（出庫）
				_ctrlCd = null;
				CollectNumber collect = new CollectNumber(
										CollectNumber.ISSUE_CD, 
										getsysUSER_CD(), 
										this.sp.getProcId(), 
										sysPLANT_CD);
				try{
					_ctrlCd = collect.getNo();
					if(_ctrlCd == null || _ctrlCd.length() == 0){
						// 採番結果がない
						csvExport(adstruct					// 対象データ情報
								, "1"						// エラー区分
								, n + 1						// エラー発生行
								,null
								,new ExpjMessage("AF00057").getMessage(_locale)
								,null);	// エラーメッセージ
						if (warningFlg){
							_intWarningCount1--;
						}
						_intErrorCount++;
						return false;
					}
				}
				catch(FoundationException ex){
					// 登録処理失敗：入出庫管理番号（出庫）の採番に失敗しました
					csvExport(adstruct					// 対象データ情報
							, "1"						// エラー区分
							, n + 1						// エラー発生行
							,null
							,new ExpjMessage("AF00057").getMessage(_locale)
							,null);	// エラーメッセージ
					if (warningFlg){
						_intWarningCount1--;
					}
					_intErrorCount++;
					return false;
				}
				AF0130010Struct readStruct = new AF0130010Struct();
				List tmpList = entity.mselect_T_ISSUE_INST1.read(conn, adstruct);
				if (!tmpList.isEmpty()) {
			    readStruct = (AF0130010Struct)tmpList.get(0);
			    
				// 入出庫管理番号
			    readStruct.setRCV_ISSUE_CTRL_CD(_ctrlCd);
				//製番
			    readStruct.setJOB_ODR_CD(adstruct.getJOB_ODR_CD());
				// 出庫保管区
			    readStruct.settmp_WH_CD(adstruct.getWH_CD());
			    //工場コード
			    readStruct.setPLANT_CD(sysPLANT_CD);
				// 出庫数
			    readStruct.settmp_RCV_ISSUE_QTY(Calculate.multiply(adstruct.getISSUE_QTY(), "-1"));
			    //入出庫年月日
			    readStruct.setRCV_ISSUE_DATE(adstruct.getISSUE_DATE());
				// 入出庫完了フラグ
			    readStruct.setRCV_ISSUE_CMPLT_FLG(adstruct.getISSUE_CMPLT_FLG());
				// 入出庫区分（2:出庫）
			    readStruct.setRCV_ISSUE_TYP(new Integer(2));
				// 入出庫発生区分（21:通常出庫）
			    readStruct.setRCV_ISSUE_GNR_TYP(new Integer(21));
				// 在庫更新区分（1:未）
			    readStruct.setSTOCK_UPD_TYP(new Integer(1));
			    //メーカロット番号
			    readStruct.setVEND_LOT_NO(adstruct.getVEND_LOT_NO());
			  //在庫ロット番号
			   readStruct.setw_STOCK_LOT_CD(adstruct.getLOT_NO());

				logMessage = "T_RCV_ISSUE.RCV_ISSUE_CTRL_CD:" + readStruct.getRCV_ISSUE_CTRL_CD()
							+ ", T_RCV_ISSUE.JOB_ODR_CD:" + readStruct.getw_JOB_ODR_CD()
							+ ", T_RCV_ISSUE.ITEM_CD:" + readStruct.getITEM_CD()
							+ ", T_RCV_ISSUE.WH_CD:" + readStruct.getWH_CD()
							+ ", T_RCV_ISSUE.RCV_ISSUE_DATE:" + readStruct.getRCV_ISSUE_DATE()
							+ ", T_RCV_ISSUE.RCV_ISSUE_QTY:" + readStruct.gettmp_RCV_ISSUE_QTY();
				setSyslogConfig(logMessage);
				readStruct.setsUser_ID(struct.getsUser_ID());
				// 保管区別入出庫（出庫）登録
				entity.minsertSub1T_RCV_ISSUE.create(conn, readStruct);

				// [出庫処理]呼出し
				IssueProcess issuePrc = new IssueProcess(conn, _ctrlCd);
				try{
					if(issuePrc.execProcess() == true){
						// 更新ＯＫ
						logMessage = "Issue Process was Complated!";
						setSyslogConfig(logMessage);
					}
					else {
						// 更新エラー
						logMessage = "Issue Process was Failed...";
						setSyslogConfig(logMessage);
						return false;
					}
				} finally {
					// 更新結果メッセージ表示
					logMessage = "T_ISSUE_INST.ISSUE_INST_CD:" + struct.getISSUE_INST_CD();
					for(int idx = 0; idx < issuePrc.getErrorList().size(); idx++){
						message1 = message1 + "," + new ExpjMessage(issuePrc.getErrorList().get(idx).toString()).getMessage(_locale);
					}
					if (!isNull(message1)) {
						message1 = message1.substring(1);
						csvExport(adstruct					// 対象データ情報
								, "1"						// エラー区分
								, n + 1						// エラー発生行
								,null
								,new ExpjMessage("ZZ01006",message1).getMessage(_locale)
								,null);	// エラーメッセージ
						if (warningFlg){
							_intWarningCount1--;
						}
						_intErrorCount++;
					}
					
					message1 = "";
					for(int idx = 0; idx < issuePrc.getWarnList().size(); idx++){
						message1 = message1 + "," + new ExpjMessage(issuePrc.getWarnList().get(idx).toString()).getMessage(_locale);
					}
					if (!isNull(message1)) {
						message1 = message1.substring(1);
						csvExport(adstruct					// 対象データ情報
								, "2"						// エラー区分
								, n + 1						// エラー発生行
								,null
								,new ExpjMessage("ZZ01006",message1).getMessage(_locale)
								,null);	// エラーメッセージ
						if (!warningFlg){
							_intWarningCount1++;
							warningFlg = true;
						}
					}
				}
			}

				return true;
		}
		//---------- 入庫処理ＤＢ登録処理（親画面、子画面で共通使用の為）） --------------------
		/**
		 * 親画面の登録ボタンと子画面の登録ボタンから共通に呼び出される処理です。
		 *
		 * @return (true:正常終了  false:異常終了）
		 */
		private boolean insert_rcv_process(AF0130010Struct adstruct, int j) throws BusinessProcessException, FoundationException, SQLException
		{
			// ログ出力情報格納用
			String logMessage = "";
			String message1 = "";
			List listMessage = new ArrayList();
			
			logMessage = "Control : insert_rcv_process"
						+ ", T_ISSUE_INST.ISSUE_INST_CD:" + adstruct.getISSUE_INST_CD();
			setSyslogConfig(logMessage);

				//----------------------------------------------------------
				// 有償支給品の場合、有償支給履歴登録
				//----------------------------------------------------------
				
			AF0130010Struct readStruct = new AF0130010Struct();
			List tpList = entity.mselect_T_ISSUE_INST1.read(conn, adstruct);
			if (!tpList.isEmpty()) {
		    readStruct = (AF0130010Struct)tpList.get(0);
		    //出庫指示の支給区分が1(有償支給)の時
				if ("1".equals(readStruct.getCONS_TYP())) {

					logMessage = "M_CONS_UNIT_COST.ITEM_CD:" +  readStruct.getITEM_CD()
								+ ", M_CONS_UNIT_COST.VEND_CD:" +  readStruct.getVEND_CD()
								+ ", M_CONS_UNIT_COST.COMPANY_CD:" +  readStruct.getCOMPANY_CD()
								+ ", T_ISSUE_INST.EFF_PHASE_IN_DATE:" + readStruct.getRCV_ISSUE_DATE();
					setSyslogConfig(logMessage);
					//支給単価の取得
					List tmpList = entity.mmselectM_COST.read(conn, adstruct);
					if(tmpList.size() <= 0) {
						readStruct.setUNIT_COST(new String("0"));
						readStruct.setUNIT_COST_TYP(new Integer(1));
					}
					else{
						AF0130010Struct workStruct = (AF0130010Struct)tmpList.get(0);
						logMessage = "M_CONS_UNIT_COST.ONEROUS_FLG:" +  workStruct.getONEROUS_FLG()
									+ ", M_CONS_UNIT_COST.UNIT_COST:" +  workStruct.getUNIT_COST()
									+ ", M_CONS_UNIT_COST.UNIT_COST_TYP:" +  workStruct.getUNIT_COST_TYP();
						setSyslogConfig(logMessage);
						// 支給単価の有償フラグ＝1(有償)の時、有償単価セット
						if(("1").equals(workStruct.getONEROUS_FLG()) == true){
							readStruct.setUNIT_COST(workStruct.getUNIT_COST());
							readStruct.setUNIT_COST_TYP(workStruct.getUNIT_COST_TYP());
						}
						else{
							readStruct.setUNIT_COST(new String("0"));
							readStruct.setUNIT_COST_TYP(new Integer(1));
						}
					}

					// 有償支給番号採番
					String ctrlCd = null;
					CollectNumber collect = new CollectNumber(
											CollectNumber.ONERCONS_CD, 
											getsysUSER_CD(), 
											this.sp.getProcId(), 
											sysPLANT_CD);
					try{
						ctrlCd = collect.getNo();
						if(ctrlCd == null || ctrlCd.length() == 0){
							// 採番結果がない
							csvExport(adstruct					// 対象データ情報
									, "1"						// エラー区分
									, j + 1						// エラー発生行
									,null
									,new ExpjMessage("AF00078").getMessage(_locale)
									,null);	// エラーメッセージ
							if (warningFlg){
								_intWarningCount1--;
							}
							_intErrorCount++;
							return false;
						}
					}
					catch(FoundationException ex){
						// 登録処理失敗：有償支給番号の採番に失敗しました
						csvExport(adstruct					// 対象データ情報
								, "1"						// エラー区分
								, j + 1						// エラー発生行
								,null
								,new ExpjMessage("AF00078").getMessage(_locale)
								,null);	// エラーメッセージ
						if (warningFlg){
							_intWarningCount1--;
						}
						_intErrorCount++;
						return false;
					}
					
					// 有償支給番号
					readStruct.setONEROUS_CONS_NO(ctrlCd);
					// 出庫数
					readStruct.setRCV_ISSUE_QTY(adstruct.getISSUE_QTY());
					//出庫日
					readStruct.setRCV_ISSUE_DATE(adstruct.getISSUE_DATE());
					// 製番
					readStruct.setJOB_ODR_CD(adstruct.getJOB_ODR_CD());
					//メーカロット番号
					readStruct.setVEND_LOT_NO(adstruct.getVEND_LOT_NO());
					// 返品先保管区コード
					readStruct.setRETURNED_WH_CD("");
					// 入出庫管理番号
					readStruct.setRCV_ISSUE_CTRL_CD(_ctrlCd);
					//在庫ロット番号
				    readStruct.setSTOCK_LOT_CD(adstruct.getLOT_NO());

					logMessage = "T_PAST_ONEROUS_CONS.ONEROUS_CONS_NO:" + readStruct.getONEROUS_CONS_NO()
								+ ",T_PAST_ONEROUS_CONS.JOB_ODR_CD:" + readStruct.getw_JOB_ODR_CD()
								+ ", T_PAST_ONEROUS_CONS.ITEM_CD:" + readStruct.getITEM_CD()
								+ ", T_PAST_ONEROUS_CONS.VEND_CD:" + readStruct.getVEND_CD()
								+ ", T_PAST_ONEROUS_CONS.ISSUE_DATE:" + readStruct.getRCV_ISSUE_DATE()
								+ ", T_PAST_ONEROUS_CONS.ISSUE_QTY:" + readStruct.gettmp_RCV_ISSUE_QTY();
					setSyslogConfig(logMessage);
					readStruct.setsUser_ID(struct.getsUser_ID());
					// 有償支給履歴登録
					entity.minsertSub1T_PAST_ONEROUS_CONS.create(conn, readStruct);
				}
			  }
				if (readStruct.getRCV_WH_CD() != null && "".equals(readStruct.getRCV_WH_CD()) == false) {
				//----------------------------------------------------------
				// 保管区別入出庫（入庫）登録
				//----------------------------------------------------------
					// 入出庫管理番号採番（入庫）
					String ctrlCd = null;
					CollectNumber collect = new CollectNumber(
											CollectNumber.ISSUE_CD, 
											getsysUSER_CD(), 
											this.sp.getProcId(), 
											sysPLANT_CD);
					try{
						ctrlCd = collect.getNo();
						if(ctrlCd == null || ctrlCd.length() == 0){
							// 採番結果がない
							csvExport(adstruct					// 対象データ情報
									, "1"						// エラー区分
									, j + 1						// エラー発生行
									,null
									,new ExpjMessage("AF00057").getMessage(_locale)
									,null);	// エラーメッセージ
							if (warningFlg){
								_intWarningCount1--;
							}
							_intErrorCount++;
							return false;
						}
					}
					catch(FoundationException ex){
						// 採番結果がない
						csvExport(adstruct					// 対象データ情報
								, "1"						// エラー区分
								, j + 1						// エラー発生行
								,null
								,new ExpjMessage("AF00057").getMessage(_locale)
								,null);	// エラーメッセージ
						if (warningFlg){
							_intWarningCount1--;
						}
						_intErrorCount++;
						return false;
					}

					// 入出庫管理番号
					readStruct.setRCV_ISSUE_CTRL_CD(ctrlCd);
					// 入庫保管区
					readStruct.settmp_WH_CD(adstruct.getRCV_WH_CD());
					//製番
					List mitemList =entity.mselect_LOT_CTRL_FLG.read(conn, readStruct);
					AF0130010Struct mitemStruct =(AF0130010Struct)mitemList.get(0);
					//品目の品目手配区分が 1：製番、2：在庫引当型製番の場合
					//[出庫指示].“製番” ,上記以外 Null
					if(!"1".equals(mitemStruct.getMRP_ODR_TYP()) && 
							!"2".equals(mitemStruct.getMRP_ODR_TYP())){
						readStruct.setJOB_ODR_CD("");
					}
					else{
						readStruct.setJOB_ODR_CD(adstruct.getJOB_ODR_CD());
					}
					//入出庫年月日
				    readStruct.setRCV_ISSUE_DATE(adstruct.getISSUE_DATE());
					// 入庫数
					readStruct.settmp_RCV_ISSUE_QTY(adstruct.getISSUE_QTY());
				    //メーカロット番号
				    readStruct.setVEND_LOT_NO(adstruct.getVEND_LOT_NO());
				    //在庫ロット番号
				    readStruct.setw_STOCK_LOT_CD(adstruct.getLOT_NO());
				    
					// 入出庫完了フラグ
					readStruct.setRCV_ISSUE_CMPLT_FLG(adstruct.getISSUE_CMPLT_FLG());
					// 入出庫区分（1:入庫）
					readStruct.setRCV_ISSUE_TYP(new Integer(1));
					if ("0".equals(readStruct.getCONS_TYP())) {
						// 入出庫発生区分（61:工程在庫入庫）
						readStruct.setRCV_ISSUE_GNR_TYP(new Integer(61));
					} else {
						// 入出庫発生区分（81:取引先在庫入庫）
						readStruct.setRCV_ISSUE_GNR_TYP(new Integer(81));
					}
					// 在庫更新区分（1:未）
					readStruct.setSTOCK_UPD_TYP(new Integer(1));
		            //会社コード
					logMessage = "T_RCV_ISSUE.RCV_ISSUE_CTRL_CD:" + readStruct.getRCV_ISSUE_CTRL_CD()
								+ ", T_RCV_ISSUE.JOB_ODR_CD:" + readStruct.getw_JOB_ODR_CD()
								+ ", T_RCV_ISSUE.ITEM_CD:" + readStruct.getITEM_CD()
								+ ", T_RCV_ISSUE.WH_CD:" + readStruct.getWH_CD()
								+ ", T_RCV_ISSUE.RCV_ISSUE_DATE:" + readStruct.getRCV_ISSUE_DATE()
								+ ", T_RCV_ISSUE.RCV_ISSUE_QTY:" + readStruct.gettmp_RCV_ISSUE_QTY();
					setSyslogConfig(logMessage);
					
					//ユーザ名
					readStruct.setsUser_ID(struct.getsUser_ID());
					// [出庫指示]."製番"を登録するための退避
					String saveJobOdrCd = readStruct.getw_JOB_ODR_CD();
					readStruct.setw_JOB_ODR_CD(readStruct.getJOB_ODR_CD());

					// 保管区別入出庫（入庫）登録
					entity.minsertSub1T_RCV_ISSUE.create(conn, readStruct);

					// 退避した製番を戻す
					struct.setw_JOB_ODR_CD(saveJobOdrCd);

					// [入庫処理]呼出し
					RcvProcess rcvPrc = new RcvProcess(conn, ctrlCd);
					try{
						if(rcvPrc.execProcess() == true){
							// 更新ＯＫ
							logMessage = "Rcv Process was Complated!";
							setSyslogConfig(logMessage);
						}
						else {
							// 更新エラー
							logMessage = "Rcv Process was Failed...";
							setSyslogConfig(logMessage);
							return false;
						}
					} finally {
						// 更新結果メッセージ表示
						logMessage = "T_ISSUE_INST.ISSUE_INST_CD:" + struct.getISSUE_INST_CD();
						
						for(int idx = 0; idx < rcvPrc.getErrorList().size(); idx++){
							message1 = message1 + "," + new ExpjMessage(rcvPrc.getErrorList().get(idx).toString()).getMessage(_locale);
						}
						if (!isNull(message1)) {
							message1 = message1.substring(1);
							csvExport(adstruct					// 対象データ情報
									, "1"						// エラー区分
									, j + 1						// エラー発生行
									,null
									,new ExpjMessage("ZZ01006",message1).getMessage(_locale)
									,null);	// エラーメッセージ
							if (warningFlg){
								_intWarningCount1--;
							}
							_intErrorCount++;
						}
						message1 = "";
						for(int idx = 0; idx < rcvPrc.getWarnList().size(); idx++){
							message1 = message1 + "," + new ExpjMessage(rcvPrc.getWarnList().get(idx).toString()).getMessage(_locale);
						}
						if (!isNull(message1)) {
							message1 = message1.substring(1);
							csvExport(adstruct					// 対象データ情報
								, "2"						// エラー区分
								, j + 1						// エラー発生行
								,null
								,new ExpjMessage("ZZ01006",message1).getMessage(_locale)
								,null);	// エラーメッセージ
							if (!warningFlg){
								_intWarningCount1++;
								warningFlg = true;
							}
						}
					}
				}	
				return true;
		}
		/**
		 * ロット別に出庫した情報を、出庫実績明細へ追加する。
		 *
		 */
		public boolean insertupTlotissueinst(AF0130010Struct adstruct, int k) throws  BusinessProcessException, FoundationException, SQLException
		{
			Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0130");
			logger.entering("AF0130010Control"+":USER="+struct.getsUser_ID(),"insertupTlotissueinst");
				//{{user_implement_dev:<controlBrowse>
				// TODO: ユーザ定義のコードを記述してください
			// 出庫実績明細への登録
			// 出庫数が０の場合は、登録・更新を行わない
			  if (adstruct.getISSUE_QTY() != null 
					&& !"".equals(adstruct.getISSUE_QTY())
					&& Calculate.compare(adstruct.getISSUE_QTY(), "0") != 0) {
				  
				 AF0130010Struct readStruct = new AF0130010Struct();
				List tpList = entity.mselect_T_ISSUE_INST1.read(conn, adstruct);
				//  データが存在しない場合登録、存在する場合更新
				List lockList = entity.mT_LOT_ISSUE_INST_Lock.read(conn, adstruct);
				if (lockList.size() <= 0) {
					readStruct=(AF0130010Struct)tpList.get(0);
					//在庫ロット番号
					readStruct.setLOT_NO(adstruct.getLOT_NO());
					//readStruct.setw_STOCK_LOT_CD(adstruct.getLOT_NO());
					//出庫実績数量
					readStruct.setRCV_ISSUE_QTY((adstruct.getISSUE_QTY()));
					//出庫実績日
					readStruct.setRCV_ISSUE_DATE(adstruct.getISSUE_DATE());
					//ユーザ名
					readStruct.setsUser_ID(struct.getsUser_ID());
					//登録
					entity.mT_LOT_ISSUE_INST.create(conn, readStruct);

				} else {
					AF0130010Struct lockStruct = new AF0130010Struct();
					lockStruct = (AF0130010Struct)lockList.get(0);
					// 出庫実績数量の計算
					//  [出庫実績明細]."出庫実績数" + 画面「出庫数」 
					String rcvIssueQty = "0";
					rcvIssueQty = Calculate.add(
							lockStruct.getISSUE_QTY(),
							adstruct.getISSUE_QTY());
					struct.setISSUE_QTY(rcvIssueQty);
					//出庫日
					struct.setRCV_ISSUE_DATE(adstruct.getISSUE_DATE());
					//在庫ロット番号
					struct.setLOT_NO(adstruct.getLOT_NO());
					//出庫指示番号
					struct.setISSUE_INST_CD(adstruct.getISSUE_INST_CD());
					
					entity.mT_LOT_ISSUE_INST.update(conn, struct);
				}
				
			}
			 // return true;
	                //}}user_implement_dev:<controlBrowse>
			logger.exiting("AF0130010Control"+":USER="+struct.getsUser_ID(),"insertupTlotissueinst");
			return true;

		}
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * 参照ボタン押下時に実行される処理です。
	 *
	 */
	public void controlBrowse() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0130");
		logger.entering("AF0130010Control"+":USER="+struct.getsUser_ID(),"controlBrowse");
			//{{user_implement_dev:<controlBrowse>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlBrowse>
		logger.exiting("AF0130010Control"+":USER="+struct.getsUser_ID(),"controlBrowse");

		return;
	}

	/**
	 * 取込ボタン押下時に実行される処理です。
	 *
	 */
	public void controlCsvIn() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0130");
		logger.entering("AF0130010Control"+":USER="+struct.getsUser_ID(),"controlCsvIn");
			//{{user_implement_dev:<controlCsvIn>
			// TODO: ユーザ定義のコードを記述してください
		try {
			// 全部レコード数
				_intTotalCount = 0; 
				// エラーレコード件数
				_intErrorCount = 0;  
				// 正常レコード件数
				_intSuccessCount = 0;
				// ワーニング件数
				_intWarningCount = 0;
				// ワーニング件数
				_intWarningCount1 = 0;
				// 画面表示用リストクリア
				if (list == null) {
					list = new ArrayList();
				} else {
					list.clear();
				}
				// ＣＳＶデータ取得
				List listCsv = null;
				listCsv = readCsvData();

				// ＣＳＶデータ取得成功
				if (listCsv != null) {
				// ＣＳＶ項目のチェック＆＆ ＣＳＶ項目の登録
					if (checkCsvData(listCsv)) {
						
						// 登録処理
						if(insertCsvDate(listCsv)) {
							_intSuccessCount = _intSuccessCount - _intWarningCount1;
							// エラーがない場合
							if (_intWarningCount1 + _intWarningCount== 0) {
								setInfoMessage("AA01514", String.valueOf(_intSuccessCount));
							} else {
								setWarningMessage("AA01515", String.valueOf(_intSuccessCount), String.valueOf(_intWarningCount+_intWarningCount1));
							}
						} else {
							_intSuccessCount = _intTotalCount - _intErrorCount - _intWarningCount-_intWarningCount1;
							setErrorMessage("AA01516", String.valueOf(_intSuccessCount), String.valueOf(_intWarningCount+_intWarningCount1), String.valueOf(_intErrorCount));
						}
					} else {
						// エラーがある場合
						setErrorMessage("AA01516", String.valueOf(_intSuccessCount), String.valueOf(_intWarningCount), String.valueOf(_intErrorCount));
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
				setErrorMessage("ZZ01106");
				setReadStatus(ERROR);
			}
                //}}user_implement_dev:<controlCsvIn>
		logger.exiting("AF0130010Control"+":USER="+struct.getsUser_ID(),"controlCsvIn");

		return;
	}

	/**
	 * CSV出力ボタン押下時に実行される処理です。
	 *
	 */
	public void controlCSVOut() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0130");
		logger.entering("AF0130010Control"+":USER="+struct.getsUser_ID(),"controlCSVOut");
			//{{user_implement_dev:<controlCSVOut>
			// TODO: ユーザ定義のコードを記述してください
		try {
			// CSV出力部品を設定
			csvWriter = new CsvWriter(CsvWriter.getFileName(getsysUSER_CD()));
			AF0130010Struct errorStruct = null;
			List csv = new ArrayList();	// CSV情報
			// CSVヘッダ行をCSV情報に追加
			String[] title = {
					 "Expj.Cmt3094"							// エラー箇所
					,"Expj.Cmt3095"							// エラー区分
					,"Expj.Cmt3098"							// エラー内容
					,"Expj.Cmt6220"							// エラー項目
					,"Expj.ISSUE_INST_CD"				    // 出庫指示番号
					,"Expj.JOB_ODR_CD"						// 製番
					,"Expj.ISSUE_WH_CD_1"					// 出庫元保管区コード
					,"Expj.STOCK_LOT_CD"					// 在庫ロット番号
					,"Expj.ISSUE_QTY"						// 出庫数
					,"Expj.ISSUE_DATE"						// 出庫日
					,"Expj.ISSUE_CMPLT_FLG_2"				// 出庫完了
					,"Expj.RCV_WH_CD_1"					    // 出庫先保管区コード
					,"Expj.VEND_LOT_NO"					    // メーカロット番号
			};
			csv.add(title);
			// [画面].一覧部のエラー情報をCSV情報に追加
			// [画面].一覧部のエラー情報をCSV情報に追加
			for (int i = 0; i < list.size(); i++) {
				errorStruct = (AF0130010Struct)list.get(i);
				String[] date = {
						 errorStruct.getl_ERROR_IN()
						,errorStruct.getl_ERR_TYP()
						,errorStruct.getl_ERR_INFO()
						,errorStruct.getl_ERR_CTR_NM()
						,replaceSlashSub(errorStruct.getl_ERR_ISSUE_INST_CD())
						,replaceSlashSub(errorStruct.getl_ERR_JOB_ODR_CD())
						,replaceSlashSub(errorStruct.getl_ERR_ISSUE_WH_CD())
						,replaceSlashSub(errorStruct.getl_ERR_STOCK_LOT_CD())
						,replaceSlashSub(errorStruct.getl_ERR_ISSUE_QTY())
						,replaceSlashSub(errorStruct.getl_ERR_ISSUE_DATE())
						,replaceSlashSub(errorStruct.getl_ERR_ISSUE_CMPLT_FLG())
						,replaceSlashSub(errorStruct.getl_ERR_RCV_WH_CD())
						,replaceSlashSub(errorStruct.getl_ERR_VEND_LOT_NO())
						
				};
				csv.add(date);
			}
			
			// CSVファイルを作成
			csvWriter.write(csv, CoreTools.getLocale(struct.getsUser_ID()), true);
			// CSVファイルをクライアントに出力
			struct.setDOWNLOAD_FILE(getCsvWriter().getFilePath());

		}catch(Exception e) {
			e.printStackTrace();
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());//致命的エラー エラー内容
			ExpjException ee = new ExpjException(e, emsg); // エクセプションを生成
			throw ee;
		} finally {
			//
		}
                //}}user_implement_dev:<controlCSVOut>
		logger.exiting("AF0130010Control"+":USER="+struct.getsUser_ID(),"controlCSVOut");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0130");
		logger.entering("AF0130010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
			// TODO: ユーザ定義のコードを記述してください
		setList(null);
		// 検索状態を「初期状態」に設定
		setReadStatus(INITIAL);
                //}}user_implement_dev:<controlClear>
		logger.exiting("AF0130010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * 閉じるボタン押下時に実行される処理です。
	 *
	 */
	public void controlClose() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0130");
		logger.entering("AF0130010Control"+":USER="+struct.getsUser_ID(),"controlClose");
			//{{user_implement_dev:<controlClose>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlClose>
		logger.exiting("AF0130010Control"+":USER="+struct.getsUser_ID(),"controlClose");

		return;
	}

	/**
	 * 実行ボタン押下時に実行される処理です。
	 *
	 */
	public void controlExecute() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0130");
		logger.entering("AF0130010Control"+":USER="+struct.getsUser_ID(),"controlExecute");
			//{{user_implement_dev:<controlExecute>
			// TODO: ユーザ定義のコードを記述してください
		try{
	    	setReadStatus(INITIAL); 
	        // バッチ処理クラスのmain引数
	        String strBatchClassName = null;		// 呼び出し先クラス名
	        String strBatchProcessingTyp = null;	// バッチ処理区分
	        String strProgramId = null;			    // 業務名（AF0130B001）
	        String strUserId = null;				// ユーザID
	        String strPlantCd = null;				// 工場コード
	        String strCsvTakeTyp =null;             // CSV取込方式
	        // 引数セット
	        strBatchClassName = "com.nec.jp.orteus.metamorBase.AF0130.AF0130B001.mainAF0130B001";
	        strBatchProcessingTyp = "2";					  // 2: 自動運転しない（夜間バッチなし）
	        strProgramId = "AF0130B001";					  // 業務名（AF0130B001）
	        strUserId = getsysUSER_CD();					  // ユーザID
	        strPlantCd = getsysPLANT_CD();					  // 工場コード
	        strCsvTakeTyp ="1";                               // CSV取込方式 = 1:固定ファイル取込
	        // バッチ処理を実行する -------------------------------------------
	        ResourceBundle bundle = SystemConfig.getBundle();
	        String javaPath = SystemConfig.getProperty("JAVA_PATH", bundle);
	        if(javaPath == null){
	            //システム既定値ファイルからの情報取得に失敗しました(ＪＶＭパス)
	            setErrorMessage("ZZ09010");
	            return;
	           }
	        String ClassPath = SystemConfig.getProperty("CLASS_PATH", bundle);
	        if(ClassPath == null){
	        	//システム既定値ファイルからの情報取得に失敗しました(クラスパス)
	        	setErrorMessage("ZZ09012");
	            return;
	        }
	        String batchPath = SystemConfig.getProperty("BATCH_PATH", bundle);
	        if(batchPath == null){        	
	            //システム既定値ファイルからの情報取得に失敗しました(バッチ起動設定)        	
	        	setErrorMessage("ZZ09011");
	            return;
	        }
	    
	        String heapSize = SystemConfig.getProperty("HIGH_HEAP_SIZE",bundle); 
	        if (heapSize == null) {
	            //システム既定値ファイルからの情報取得に失敗しました(バッチヒープサイズ設定)
	        	setErrorMessage("ZZ09017");
	            return;
	           }
	        List buffer = new ArrayList();
			buffer.add(javaPath);            // ＪＶＭ
			buffer.add("-cp");
			buffer.add(ClassPath);           // Java ClassPath
			buffer.add("-Dcom.nec.jp.orteus.util.logging.config.file="+batchPath); // 起動設定
			buffer.add(strBatchClassName);                       // 呼び出し先クラス
			buffer.add(strBatchProcessingTyp);                   // バッチ処理区分
			buffer.add(strUserId);                               // ユーザID
			buffer.add(strProgramId);                            // 業務ID
			buffer.add(strPlantCd);                              // 工場コード
			buffer.add(strCsvTakeTyp);                           // CSV取込方式		
			try {
				// バッチ処理実行
				Runtime runtime = Runtime.getRuntime();
				runtime.exec((String[])buffer.toArray(new String[buffer.size()]));
			} catch (IOException e) {	        	
		        // バッチ呼び出し失敗の場合、画面メッセージを表示する。
				setErrorMessage("ZZ09014");
				return;
	        }	    
	        // バッチ呼び出し成功の場合、画面メッセージを表示する。
			setInfoMessage2("ZZ09013");
	    }catch(Exception e){			
			e.printStackTrace();
			setErrorMessage("ZZ01106");
		
		}
		
                //}}user_implement_dev:<controlExecute>
		logger.exiting("AF0130010Control"+":USER="+struct.getsUser_ID(),"controlExecute");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0130");
		logger.entering("AF0130010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AF0130010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0130");
		logger.entering("AF0130010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
			// TODO: ユーザ定義のコードを記述してください
		try{
			setList(null);
			
			// 業務運用日取得
			try {
				DateCtrlStruct dateCtrl = DateCtrlControl.getData(conn, getsysPLANT_CD());
				_btmBusinessOprDate = dateCtrl.getBUSINESS_OPR_DATE();
			} catch(DataNotFoundException e) {
				ExpjMessage emsg = new ExpjMessage("AC34080" );
				sysLog.severe(emsg, getsysUSER_CD());//致命的エラー エラー内容
				ExpjException ee = new ExpjException(e, emsg); // エクセプションを生成
				setReadStatus(ERROR);
				throw ee;
			}
			// 以下の条件で、[システムパラメータ]を検索し、設定値（完了している月の実績の登録／修正を可能とするか否かの区分）を取得する。
			AF0130010Struct adStruct = new AF0130010Struct();
			List valueList = entity.mselectPARAMETER.read(conn, adStruct);
			if (valueList.isEmpty()) {
				strValus = "true";
			}else {
				adStruct = (AF0130010Struct)valueList.get(0);
				strValus = adStruct.getVALUE();
			}		
			// コンボボックスデータ用意
	 		ComboBox combBox = new ComboBox(conn, sysUSER_CD);
			// コンボボックスのデータを取得
			_COM_ERR_TYP = combBox.getData("ERR_TYP");
			
		}catch(ExpjException e) {
			throw e;
		}
		catch(Exception e) {
			e.printStackTrace();
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());//致命的エラー エラー内容
			ExpjException ee = new ExpjException(e, emsg); // エクセプションを生成
			throw ee;
		} 
/*			// データベースへのアクセスを行う場合は、このtry catch文のコメントを外してください。
		try{
*/
			// 画面遷移の呼び出しだったら、Structに画面遷移キーを設定してcontrolSelect()を呼び出す
			if ( isScreenMove() == true ) {
				// 検索のコントロールメソッドを呼び出します。
//				controlSelect();
			}

/*			// データベースへのアクセスを行う場合は、このtry catch文のコメントを外してください。
		} catch(SQLException e) {
//			e.printStackTrace();
			// エラー処理を記述してください。
			// 
		}
*/
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AF0130010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * イベントハンドラの前処理です。
	 *
	 * @param buttun ボタン名
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0130");
		logger.entering("AF0130010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");
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
		logger.exiting("AF0130010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			if( button.equals("Browse") ) {
				controlBrowse();
			} else if( button.equals("CsvIn") ) {
				controlCsvIn();
			} else if( button.equals("CSVOut") ) {
				controlCSVOut();
			} else if( button.equals("Clear") ) {
				controlClear();
			} else if( button.equals("Close") ) {
				controlClose();
			} else if( button.equals("Execute") ) {
				controlExecute();
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
//			throw new FoundationException("AF0130010Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AF0130010-E999","CSVの出力処理"));
			throw new FoundationException("AF0130010Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AF0130010-E999","システム日付の取得処理"));
				throw new FoundationException("AF0130010Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AF0130010-E999","コントロールのイベント処理"));
			throw new FoundationException("AF0130010Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected AF0130010Entity entity;
	protected AF0130010Struct struct;
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

		entity = new AF0130010Entity();
		struct = new AF0130010Struct();

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
	 * AF0130010クラスの標準コンストラクタ
	 */
	public AF0130010Control() throws BusinessProcessException, FoundationException
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
				AF0130010Struct key = (AF0130010Struct)keyList.get(j);
				// メッセージキーを作成する
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("FileName") && key.getFileName() != null) {
					msgKey.setKeyValue("FileName", key.getFileName());
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
				if(msgKeyType.containsKeyColumn("l_ERR_INFO") && key.getl_ERR_INFO() != null) {
					msgKey.setKeyValue("l_ERR_INFO", key.getl_ERR_INFO());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_CTR_NM") && key.getl_ERR_CTR_NM() != null) {
					msgKey.setKeyValue("l_ERR_CTR_NM", key.getl_ERR_CTR_NM());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_ISSUE_INST_CD") && key.getl_ERR_ISSUE_INST_CD() != null) {
					msgKey.setKeyValue("l_ERR_ISSUE_INST_CD", key.getl_ERR_ISSUE_INST_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_JOB_ODR_CD") && key.getl_ERR_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("l_ERR_JOB_ODR_CD", key.getl_ERR_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_ISSUE_WH_CD") && key.getl_ERR_ISSUE_WH_CD() != null) {
					msgKey.setKeyValue("l_ERR_ISSUE_WH_CD", key.getl_ERR_ISSUE_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_STOCK_LOT_CD") && key.getl_ERR_STOCK_LOT_CD() != null) {
					msgKey.setKeyValue("l_ERR_STOCK_LOT_CD", key.getl_ERR_STOCK_LOT_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_ISSUE_QTY") && key.getl_ERR_ISSUE_QTY() != null) {
					msgKey.setKeyValue("l_ERR_ISSUE_QTY", key.getl_ERR_ISSUE_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_ISSUE_DATE") && key.getl_ERR_ISSUE_DATE() != null) {
					msgKey.setKeyValue("l_ERR_ISSUE_DATE", key.getl_ERR_ISSUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_ISSUE_CMPLT_FLG") && key.getl_ERR_ISSUE_CMPLT_FLG() != null) {
					msgKey.setKeyValue("l_ERR_ISSUE_CMPLT_FLG", key.getl_ERR_ISSUE_CMPLT_FLG());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_RCV_WH_CD") && key.getl_ERR_RCV_WH_CD() != null) {
					msgKey.setKeyValue("l_ERR_RCV_WH_CD", key.getl_ERR_RCV_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_VEND_LOT_NO") && key.getl_ERR_VEND_LOT_NO() != null) {
					msgKey.setKeyValue("l_ERR_VEND_LOT_NO", key.getl_ERR_VEND_LOT_NO());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_ITEM_CD") && key.getl_ERR_ITEM_CD() != null) {
					msgKey.setKeyValue("l_ERR_ITEM_CD", key.getl_ERR_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("w_COLUMN_FLG") && key.getw_COLUMN_FLG() != null) {
					msgKey.setKeyValue("w_COLUMN_FLG", key.getw_COLUMN_FLG());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_QTY") && key.getISSUE_QTY() != null) {
					msgKey.setKeyValue("ISSUE_QTY", key.getISSUE_QTY());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_CMPLT_FLG") && key.getISSUE_CMPLT_FLG() != null) {
					msgKey.setKeyValue("ISSUE_CMPLT_FLG", key.getISSUE_CMPLT_FLG());
				}
				if(msgKeyType.containsKeyColumn("RCV_WH_CD") && key.getRCV_WH_CD() != null) {
					msgKey.setKeyValue("RCV_WH_CD", key.getRCV_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("VEND_LOT_NO") && key.getVEND_LOT_NO() != null) {
					msgKey.setKeyValue("VEND_LOT_NO", key.getVEND_LOT_NO());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_DATE") && key.getISSUE_DATE() != null) {
					msgKey.setKeyValue("ISSUE_DATE", key.getISSUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("tmp_RCV_ISSUE_QTY") && key.gettmp_RCV_ISSUE_QTY() != null) {
					msgKey.setKeyValue("tmp_RCV_ISSUE_QTY", key.gettmp_RCV_ISSUE_QTY());
				}
				if(msgKeyType.containsKeyColumn("THIS_TIME_ISSUE_POSS_QTY") && key.getTHIS_TIME_ISSUE_POSS_QTY() != null) {
					msgKey.setKeyValue("THIS_TIME_ISSUE_POSS_QTY", key.getTHIS_TIME_ISSUE_POSS_QTY());
				}
				if(msgKeyType.containsKeyColumn("ALC_NOISSUE_QTY") && key.getALC_NOISSUE_QTY() != null) {
					msgKey.setKeyValue("ALC_NOISSUE_QTY", key.getALC_NOISSUE_QTY());
				}
				if(msgKeyType.containsKeyColumn("ODR_ISSUE_POSS_QTY") && key.getODR_ISSUE_POSS_QTY() != null) {
					msgKey.setKeyValue("ODR_ISSUE_POSS_QTY", key.getODR_ISSUE_POSS_QTY());
				}
				if(msgKeyType.containsKeyColumn("ITEM_STOCK_NON_ALC_QTY") && key.getITEM_STOCK_NON_ALC_QTY() != null) {
					msgKey.setKeyValue("ITEM_STOCK_NON_ALC_QTY", key.getITEM_STOCK_NON_ALC_QTY());
				}
				if(msgKeyType.containsKeyColumn("L_JOB_ODR_CD") && key.getL_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("L_JOB_ODR_CD", key.getL_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("LA_ISSUE_QTY") && key.getLA_ISSUE_QTY() != null) {
					msgKey.setKeyValue("LA_ISSUE_QTY", key.getLA_ISSUE_QTY());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_INST_CD") && key.getISSUE_INST_CD() != null) {
					msgKey.setKeyValue("ISSUE_INST_CD", key.getISSUE_INST_CD());
				}
				if(msgKeyType.containsKeyColumn("OD_NO") && key.getOD_NO() != null) {
					msgKey.setKeyValue("OD_NO", key.getOD_NO());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_CD") && key.getPUCH_ODR_CD() != null) {
					msgKey.setKeyValue("PUCH_ODR_CD", key.getPUCH_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("COMPANY_CD") && key.getCOMPANY_CD() != null) {
					msgKey.setKeyValue("COMPANY_CD", key.getCOMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("VEND_CD") && key.getVEND_CD() != null) {
					msgKey.setKeyValue("VEND_CD", key.getVEND_CD());
				}
				if(msgKeyType.containsKeyColumn("WORK_ODR_CD") && key.getWORK_ODR_CD() != null) {
					msgKey.setKeyValue("WORK_ODR_CD", key.getWORK_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("WORK_IN_PROC_CD") && key.getWORK_IN_PROC_CD() != null) {
					msgKey.setKeyValue("WORK_IN_PROC_CD", key.getWORK_IN_PROC_CD());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_TYP") && key.getISSUE_TYP() != null) {
					msgKey.setKeyValue("ISSUE_TYP", key.getISSUE_TYP());
				}
				if(msgKeyType.containsKeyColumn("CONS_TYP") && key.getCONS_TYP() != null) {
					msgKey.setKeyValue("CONS_TYP", key.getCONS_TYP());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_INST_QTY") && key.getISSUE_INST_QTY() != null) {
					msgKey.setKeyValue("ISSUE_INST_QTY", key.getISSUE_INST_QTY());
				}
				if(msgKeyType.containsKeyColumn("TOTAL_ISSUE_QTY") && key.getTOTAL_ISSUE_QTY() != null) {
					msgKey.setKeyValue("TOTAL_ISSUE_QTY", key.getTOTAL_ISSUE_QTY());
				}
				if(msgKeyType.containsKeyColumn("SHIP_REMAIN_QTY") && key.getSHIP_REMAIN_QTY() != null) {
					msgKey.setKeyValue("SHIP_REMAIN_QTY", key.getSHIP_REMAIN_QTY());
				}
				if(msgKeyType.containsKeyColumn("COUNT") && key.getCOUNT() != null) {
					msgKey.setKeyValue("COUNT", key.getCOUNT());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_CD") && key.getJOB_ODR_CD() != null) {
					msgKey.setKeyValue("JOB_ODR_CD", key.getJOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("WH_CD") && key.getWH_CD() != null) {
					msgKey.setKeyValue("WH_CD", key.getWH_CD());
				}
				if(msgKeyType.containsKeyColumn("MRP_FLG") && key.getMRP_FLG() != null) {
					msgKey.setKeyValue("MRP_FLG", key.getMRP_FLG());
				}
				if(msgKeyType.containsKeyColumn("LOT_CTRL_FLG") && key.getLOT_CTRL_FLG() != null) {
					msgKey.setKeyValue("LOT_CTRL_FLG", key.getLOT_CTRL_FLG());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP") && key.getMRP_ODR_TYP() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP", key.getMRP_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("LOT_NO") && key.getLOT_NO() != null) {
					msgKey.setKeyValue("LOT_NO", key.getLOT_NO());
				}
				if(msgKeyType.containsKeyColumn("BEST_BEFORE_DATE") && key.getBEST_BEFORE_DATE() != null) {
					msgKey.setKeyValue("BEST_BEFORE_DATE", key.getBEST_BEFORE_DATE());
				}
				if(msgKeyType.containsKeyColumn("PROC_EXEC_DATE") && key.getPROC_EXEC_DATE() != null) {
					msgKey.setKeyValue("PROC_EXEC_DATE", key.getPROC_EXEC_DATE());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_DATE_SUB") && key.getISSUE_DATE_SUB() != null) {
					msgKey.setKeyValue("ISSUE_DATE_SUB", key.getISSUE_DATE_SUB());
				}
				if(msgKeyType.containsKeyColumn("SYS_PARAMETER_VALUE") && key.getSYS_PARAMETER_VALUE() != null) {
					msgKey.setKeyValue("SYS_PARAMETER_VALUE", key.getSYS_PARAMETER_VALUE());
				}
				if(msgKeyType.containsKeyColumn("SYS_PARAMETER_NAME") && key.getSYS_PARAMETER_NAME() != null) {
					msgKey.setKeyValue("SYS_PARAMETER_NAME", key.getSYS_PARAMETER_NAME());
				}
				if(msgKeyType.containsKeyColumn("INSTALL_FLG") && key.getINSTALL_FLG() != null) {
					msgKey.setKeyValue("INSTALL_FLG", key.getINSTALL_FLG());
				}
				if(msgKeyType.containsKeyColumn("THIS_MONTH") && key.getTHIS_MONTH() != null) {
					msgKey.setKeyValue("THIS_MONTH", key.getTHIS_MONTH());
				}
				if(msgKeyType.containsKeyColumn("w_SHIP_REMAIN_QTY") && key.getw_SHIP_REMAIN_QTY() != null) {
					msgKey.setKeyValue("w_SHIP_REMAIN_QTY", key.getw_SHIP_REMAIN_QTY());
				}
				if(msgKeyType.containsKeyColumn("SCDL_ISSUE_DATE") && key.getSCDL_ISSUE_DATE() != null) {
					msgKey.setKeyValue("SCDL_ISSUE_DATE", key.getSCDL_ISSUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_CMPLT_DATE") && key.getISSUE_CMPLT_DATE() != null) {
					msgKey.setKeyValue("ISSUE_CMPLT_DATE", key.getISSUE_CMPLT_DATE());
				}
				if(msgKeyType.containsKeyColumn("WS_CD") && key.getWS_CD() != null) {
					msgKey.setKeyValue("WS_CD", key.getWS_CD());
				}
				if(msgKeyType.containsKeyColumn("MODIFY_COUNT") && key.getMODIFY_COUNT() != null) {
					msgKey.setKeyValue("MODIFY_COUNT", key.getMODIFY_COUNT().toString());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_DETAIL_NO") && key.getJOB_ODR_DETAIL_NO() != null) {
					msgKey.setKeyValue("JOB_ODR_DETAIL_NO", key.getJOB_ODR_DETAIL_NO().toString());
				}
				if(msgKeyType.containsKeyColumn("ITEM_NAME") && key.getITEM_NAME() != null) {
					msgKey.setKeyValue("ITEM_NAME", key.getITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("DRAW_CD") && key.getDRAW_CD() != null) {
					msgKey.setKeyValue("DRAW_CD", key.getDRAW_CD());
				}
				if(msgKeyType.containsKeyColumn("SPEC") && key.getSPEC() != null) {
					msgKey.setKeyValue("SPEC", key.getSPEC());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT") && key.getSTOCK_UNIT() != null) {
					msgKey.setKeyValue("STOCK_UNIT", key.getSTOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP") && key.getUNIT_QTY_TYP() != null) {
					msgKey.setKeyValue("UNIT_QTY_TYP", key.getUNIT_QTY_TYP());
				}
				if(msgKeyType.containsKeyColumn("WH_NAME") && key.getWH_NAME() != null) {
					msgKey.setKeyValue("WH_NAME", key.getWH_NAME());
				}
				if(msgKeyType.containsKeyColumn("WS_NAME") && key.getWS_NAME() != null) {
					msgKey.setKeyValue("WS_NAME", key.getWS_NAME());
				}
				if(msgKeyType.containsKeyColumn("VEND_NAME") && key.getVEND_NAME() != null) {
					msgKey.setKeyValue("VEND_NAME", key.getVEND_NAME());
				}
				if(msgKeyType.containsKeyColumn("PROC_NAME") && key.getPROC_NAME() != null) {
					msgKey.setKeyValue("PROC_NAME", key.getPROC_NAME());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_CD_proc") && key.getOPR_INST_CD_proc() != null) {
					msgKey.setKeyValue("OPR_INST_CD_proc", key.getOPR_INST_CD_proc());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_CD_item") && key.getOPR_INST_CD_item() != null) {
					msgKey.setKeyValue("OPR_INST_CD_item", key.getOPR_INST_CD_item());
				}
				if(msgKeyType.containsKeyColumn("w_ISSUE_INST_CD") && key.getw_ISSUE_INST_CD() != null) {
					msgKey.setKeyValue("w_ISSUE_INST_CD", key.getw_ISSUE_INST_CD());
				}
				if(msgKeyType.containsKeyColumn("w_WS_CD") && key.getw_WS_CD() != null) {
					msgKey.setKeyValue("w_WS_CD", key.getw_WS_CD());
				}
				if(msgKeyType.containsKeyColumn("w_VEND_CD") && key.getw_VEND_CD() != null) {
					msgKey.setKeyValue("w_VEND_CD", key.getw_VEND_CD());
				}
				if(msgKeyType.containsKeyColumn("w_ISSUE_CMPLT_FLG") && key.getw_ISSUE_CMPLT_FLG() != null) {
					msgKey.setKeyValue("w_ISSUE_CMPLT_FLG", key.getw_ISSUE_CMPLT_FLG());
				}
				if(msgKeyType.containsKeyColumn("w_PLANT_CD") && key.getw_PLANT_CD() != null) {
					msgKey.setKeyValue("w_PLANT_CD", key.getw_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("t_WORK_ODR_CD") && key.gett_WORK_ODR_CD() != null) {
					msgKey.setKeyValue("t_WORK_ODR_CD", key.gett_WORK_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("t_WORK_IN_PROC_CD") && key.gett_WORK_IN_PROC_CD() != null) {
					msgKey.setKeyValue("t_WORK_IN_PROC_CD", key.gett_WORK_IN_PROC_CD());
				}
				if(msgKeyType.containsKeyColumn("w_PUCH_ODR_CD") && key.getw_PUCH_ODR_CD() != null) {
					msgKey.setKeyValue("w_PUCH_ODR_CD", key.getw_PUCH_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("w_LOT_CTRL_FLG") && key.getw_LOT_CTRL_FLG() != null) {
					msgKey.setKeyValue("w_LOT_CTRL_FLG", key.getw_LOT_CTRL_FLG());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_CTRL_CD") && key.getRCV_ISSUE_CTRL_CD() != null) {
					msgKey.setKeyValue("RCV_ISSUE_CTRL_CD", key.getRCV_ISSUE_CTRL_CD());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_TYP") && key.getRCV_ISSUE_TYP() != null) {
					msgKey.setKeyValue("RCV_ISSUE_TYP", key.getRCV_ISSUE_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("tmp_WH_CD") && key.gettmp_WH_CD() != null) {
					msgKey.setKeyValue("tmp_WH_CD", key.gettmp_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_DATE") && key.getRCV_ISSUE_DATE() != null) {
					msgKey.setKeyValue("RCV_ISSUE_DATE", key.getRCV_ISSUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_GNR_TYP") && key.getRCV_ISSUE_GNR_TYP() != null) {
					msgKey.setKeyValue("RCV_ISSUE_GNR_TYP", key.getRCV_ISSUE_GNR_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UPD_TYP") && key.getSTOCK_UPD_TYP() != null) {
					msgKey.setKeyValue("STOCK_UPD_TYP", key.getSTOCK_UPD_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_CMPLT_FLG") && key.getRCV_ISSUE_CMPLT_FLG() != null) {
					msgKey.setKeyValue("RCV_ISSUE_CMPLT_FLG", key.getRCV_ISSUE_CMPLT_FLG().toString());
				}
				if(msgKeyType.containsKeyColumn("w_STOCK_LOT_CD") && key.getw_STOCK_LOT_CD() != null) {
					msgKey.setKeyValue("w_STOCK_LOT_CD", key.getw_STOCK_LOT_CD());
				}
				if(msgKeyType.containsKeyColumn("UNIT_COST") && key.getUNIT_COST() != null) {
					msgKey.setKeyValue("UNIT_COST", key.getUNIT_COST());
				}
				if(msgKeyType.containsKeyColumn("UNIT_COST_TYP") && key.getUNIT_COST_TYP() != null) {
					msgKey.setKeyValue("UNIT_COST_TYP", key.getUNIT_COST_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("ONEROUS_FLG") && key.getONEROUS_FLG() != null) {
					msgKey.setKeyValue("ONEROUS_FLG", key.getONEROUS_FLG());
				}
				if(msgKeyType.containsKeyColumn("ONEROUS_CONS_NO") && key.getONEROUS_CONS_NO() != null) {
					msgKey.setKeyValue("ONEROUS_CONS_NO", key.getONEROUS_CONS_NO());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_QTY") && key.getRCV_ISSUE_QTY() != null) {
					msgKey.setKeyValue("RCV_ISSUE_QTY", key.getRCV_ISSUE_QTY());
				}
				if(msgKeyType.containsKeyColumn("RETURNED_WH_CD") && key.getRETURNED_WH_CD() != null) {
					msgKey.setKeyValue("RETURNED_WH_CD", key.getRETURNED_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("STOCK_LOT_CD") && key.getSTOCK_LOT_CD() != null) {
					msgKey.setKeyValue("STOCK_LOT_CD", key.getSTOCK_LOT_CD());
				}
				if(msgKeyType.containsKeyColumn("l_LOT_NO") && key.getl_LOT_NO() != null) {
					msgKey.setKeyValue("l_LOT_NO", key.getl_LOT_NO());
				}
				if(msgKeyType.containsKeyColumn("l_PUCH_ODR_CD") && key.getl_PUCH_ODR_CD() != null) {
					msgKey.setKeyValue("l_PUCH_ODR_CD", key.getl_PUCH_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("l_WORK_ODR_CD") && key.getl_WORK_ODR_CD() != null) {
					msgKey.setKeyValue("l_WORK_ODR_CD", key.getl_WORK_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ISSUE_QTY") && key.getl_ISSUE_QTY() != null) {
					msgKey.setKeyValue("l_ISSUE_QTY", key.getl_ISSUE_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_ISSUE_DATE") && key.getl_ISSUE_DATE() != null) {
					msgKey.setKeyValue("l_ISSUE_DATE", key.getl_ISSUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_SPENT_QTY") && key.getl_SPENT_QTY() != null) {
					msgKey.setKeyValue("l_SPENT_QTY", key.getl_SPENT_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_STOCK_UNIT") && key.getl_STOCK_UNIT() != null) {
					msgKey.setKeyValue("l_STOCK_UNIT", key.getl_STOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("w_TOTAL_STOCK_ON_HAND_QTY") && key.getw_TOTAL_STOCK_ON_HAND_QTY() != null) {
					msgKey.setKeyValue("w_TOTAL_STOCK_ON_HAND_QTY", key.getw_TOTAL_STOCK_ON_HAND_QTY());
				}
				if(msgKeyType.containsKeyColumn("w_JOB_ODR_CD") && key.getw_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("w_JOB_ODR_CD", key.getw_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("VALUE") && key.getVALUE() != null) {
					msgKey.setKeyValue("VALUE", key.getVALUE());
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
					AF0130010Struct key = new AF0130010Struct();
					if(msgKeyType.containsKeyColumn("FileName")) {
						key.setFileName(msgKey.getKeyValue("FileName"));
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
					if(msgKeyType.containsKeyColumn("l_ERR_INFO")) {
						key.setl_ERR_INFO(msgKey.getKeyValue("l_ERR_INFO"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_CTR_NM")) {
						key.setl_ERR_CTR_NM(msgKey.getKeyValue("l_ERR_CTR_NM"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_ISSUE_INST_CD")) {
						key.setl_ERR_ISSUE_INST_CD(msgKey.getKeyValue("l_ERR_ISSUE_INST_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_JOB_ODR_CD")) {
						key.setl_ERR_JOB_ODR_CD(msgKey.getKeyValue("l_ERR_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_ISSUE_WH_CD")) {
						key.setl_ERR_ISSUE_WH_CD(msgKey.getKeyValue("l_ERR_ISSUE_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_STOCK_LOT_CD")) {
						key.setl_ERR_STOCK_LOT_CD(msgKey.getKeyValue("l_ERR_STOCK_LOT_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_ISSUE_QTY")) {
						key.setl_ERR_ISSUE_QTY(msgKey.getKeyValue("l_ERR_ISSUE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_ISSUE_DATE")) {
						key.setl_ERR_ISSUE_DATE(msgKey.getKeyValue("l_ERR_ISSUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_ISSUE_CMPLT_FLG")) {
						key.setl_ERR_ISSUE_CMPLT_FLG(msgKey.getKeyValue("l_ERR_ISSUE_CMPLT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_RCV_WH_CD")) {
						key.setl_ERR_RCV_WH_CD(msgKey.getKeyValue("l_ERR_RCV_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_VEND_LOT_NO")) {
						key.setl_ERR_VEND_LOT_NO(msgKey.getKeyValue("l_ERR_VEND_LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_ITEM_CD")) {
						key.setl_ERR_ITEM_CD(msgKey.getKeyValue("l_ERR_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_COLUMN_FLG")) {
						key.setw_COLUMN_FLG(msgKey.getKeyValue("w_COLUMN_FLG"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_QTY")) {
						key.setISSUE_QTY(msgKey.getKeyValue("ISSUE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_CMPLT_FLG")) {
						key.setISSUE_CMPLT_FLG(msgKey.getKeyValue("ISSUE_CMPLT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("RCV_WH_CD")) {
						key.setRCV_WH_CD(msgKey.getKeyValue("RCV_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("VEND_LOT_NO")) {
						key.setVEND_LOT_NO(msgKey.getKeyValue("VEND_LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_DATE")) {
						key.setISSUE_DATE(msgKey.getKeyValue("ISSUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("tmp_RCV_ISSUE_QTY")) {
						key.settmp_RCV_ISSUE_QTY(msgKey.getKeyValue("tmp_RCV_ISSUE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("THIS_TIME_ISSUE_POSS_QTY")) {
						key.setTHIS_TIME_ISSUE_POSS_QTY(msgKey.getKeyValue("THIS_TIME_ISSUE_POSS_QTY"));
					}
					if(msgKeyType.containsKeyColumn("ALC_NOISSUE_QTY")) {
						key.setALC_NOISSUE_QTY(msgKey.getKeyValue("ALC_NOISSUE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("ODR_ISSUE_POSS_QTY")) {
						key.setODR_ISSUE_POSS_QTY(msgKey.getKeyValue("ODR_ISSUE_POSS_QTY"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_STOCK_NON_ALC_QTY")) {
						key.setITEM_STOCK_NON_ALC_QTY(msgKey.getKeyValue("ITEM_STOCK_NON_ALC_QTY"));
					}
					if(msgKeyType.containsKeyColumn("L_JOB_ODR_CD")) {
						key.setL_JOB_ODR_CD(msgKey.getKeyValue("L_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("LA_ISSUE_QTY")) {
						key.setLA_ISSUE_QTY(msgKey.getKeyValue("LA_ISSUE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_INST_CD")) {
						key.setISSUE_INST_CD(msgKey.getKeyValue("ISSUE_INST_CD"));
					}
					if(msgKeyType.containsKeyColumn("OD_NO")) {
						key.setOD_NO(msgKey.getKeyValue("OD_NO"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_CD")) {
						key.setPUCH_ODR_CD(msgKey.getKeyValue("PUCH_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("COMPANY_CD")) {
						key.setCOMPANY_CD(msgKey.getKeyValue("COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("VEND_CD")) {
						key.setVEND_CD(msgKey.getKeyValue("VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("WORK_ODR_CD")) {
						key.setWORK_ODR_CD(msgKey.getKeyValue("WORK_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("WORK_IN_PROC_CD")) {
						key.setWORK_IN_PROC_CD(msgKey.getKeyValue("WORK_IN_PROC_CD"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_TYP")) {
						key.setISSUE_TYP(msgKey.getKeyValue("ISSUE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("CONS_TYP")) {
						key.setCONS_TYP(msgKey.getKeyValue("CONS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_INST_QTY")) {
						key.setISSUE_INST_QTY(msgKey.getKeyValue("ISSUE_INST_QTY"));
					}
					if(msgKeyType.containsKeyColumn("TOTAL_ISSUE_QTY")) {
						key.setTOTAL_ISSUE_QTY(msgKey.getKeyValue("TOTAL_ISSUE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("SHIP_REMAIN_QTY")) {
						key.setSHIP_REMAIN_QTY(msgKey.getKeyValue("SHIP_REMAIN_QTY"));
					}
					if(msgKeyType.containsKeyColumn("COUNT")) {
						key.setCOUNT(msgKey.getKeyValue("COUNT"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_CD")) {
						key.setJOB_ODR_CD(msgKey.getKeyValue("JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("WH_CD")) {
						key.setWH_CD(msgKey.getKeyValue("WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("MRP_FLG")) {
						key.setMRP_FLG(msgKey.getKeyValue("MRP_FLG"));
					}
					if(msgKeyType.containsKeyColumn("LOT_CTRL_FLG")) {
						key.setLOT_CTRL_FLG(msgKey.getKeyValue("LOT_CTRL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP")) {
						key.setMRP_ODR_TYP(msgKey.getKeyValue("MRP_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("LOT_NO")) {
						key.setLOT_NO(msgKey.getKeyValue("LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("BEST_BEFORE_DATE")) {
						key.setBEST_BEFORE_DATE(msgKey.getKeyValue("BEST_BEFORE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("PROC_EXEC_DATE")) {
						key.setPROC_EXEC_DATE(msgKey.getKeyValue("PROC_EXEC_DATE"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_DATE_SUB")) {
						key.setISSUE_DATE_SUB(msgKey.getKeyValue("ISSUE_DATE_SUB"));
					}
					if(msgKeyType.containsKeyColumn("SYS_PARAMETER_VALUE")) {
						key.setSYS_PARAMETER_VALUE(msgKey.getKeyValue("SYS_PARAMETER_VALUE"));
					}
					if(msgKeyType.containsKeyColumn("SYS_PARAMETER_NAME")) {
						key.setSYS_PARAMETER_NAME(msgKey.getKeyValue("SYS_PARAMETER_NAME"));
					}
					if(msgKeyType.containsKeyColumn("INSTALL_FLG")) {
						key.setINSTALL_FLG(msgKey.getKeyValue("INSTALL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("THIS_MONTH")) {
						key.setTHIS_MONTH(msgKey.getKeyValue("THIS_MONTH"));
					}
					if(msgKeyType.containsKeyColumn("w_SHIP_REMAIN_QTY")) {
						key.setw_SHIP_REMAIN_QTY(msgKey.getKeyValue("w_SHIP_REMAIN_QTY"));
					}
					if(msgKeyType.containsKeyColumn("SCDL_ISSUE_DATE")) {
						key.setSCDL_ISSUE_DATE(msgKey.getKeyValue("SCDL_ISSUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_CMPLT_DATE")) {
						key.setISSUE_CMPLT_DATE(msgKey.getKeyValue("ISSUE_CMPLT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("WS_CD")) {
						key.setWS_CD(msgKey.getKeyValue("WS_CD"));
					}
					if(msgKeyType.containsKeyColumn("MODIFY_COUNT")) {
						key.setMODIFY_COUNT(new Integer(msgKey.getKeyValue("MODIFY_COUNT")));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_DETAIL_NO")) {
						key.setJOB_ODR_DETAIL_NO(new Integer(msgKey.getKeyValue("JOB_ODR_DETAIL_NO")));
					}
					if(msgKeyType.containsKeyColumn("ITEM_NAME")) {
						key.setITEM_NAME(msgKey.getKeyValue("ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("DRAW_CD")) {
						key.setDRAW_CD(msgKey.getKeyValue("DRAW_CD"));
					}
					if(msgKeyType.containsKeyColumn("SPEC")) {
						key.setSPEC(msgKey.getKeyValue("SPEC"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT")) {
						key.setSTOCK_UNIT(msgKey.getKeyValue("STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP")) {
						key.setUNIT_QTY_TYP(msgKey.getKeyValue("UNIT_QTY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("WH_NAME")) {
						key.setWH_NAME(msgKey.getKeyValue("WH_NAME"));
					}
					if(msgKeyType.containsKeyColumn("WS_NAME")) {
						key.setWS_NAME(msgKey.getKeyValue("WS_NAME"));
					}
					if(msgKeyType.containsKeyColumn("VEND_NAME")) {
						key.setVEND_NAME(msgKey.getKeyValue("VEND_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PROC_NAME")) {
						key.setPROC_NAME(msgKey.getKeyValue("PROC_NAME"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_CD_proc")) {
						key.setOPR_INST_CD_proc(msgKey.getKeyValue("OPR_INST_CD_proc"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_CD_item")) {
						key.setOPR_INST_CD_item(msgKey.getKeyValue("OPR_INST_CD_item"));
					}
					if(msgKeyType.containsKeyColumn("w_ISSUE_INST_CD")) {
						key.setw_ISSUE_INST_CD(msgKey.getKeyValue("w_ISSUE_INST_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_WS_CD")) {
						key.setw_WS_CD(msgKey.getKeyValue("w_WS_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_VEND_CD")) {
						key.setw_VEND_CD(msgKey.getKeyValue("w_VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_ISSUE_CMPLT_FLG")) {
						key.setw_ISSUE_CMPLT_FLG(msgKey.getKeyValue("w_ISSUE_CMPLT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("w_PLANT_CD")) {
						key.setw_PLANT_CD(msgKey.getKeyValue("w_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("t_WORK_ODR_CD")) {
						key.sett_WORK_ODR_CD(msgKey.getKeyValue("t_WORK_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("t_WORK_IN_PROC_CD")) {
						key.sett_WORK_IN_PROC_CD(msgKey.getKeyValue("t_WORK_IN_PROC_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_PUCH_ODR_CD")) {
						key.setw_PUCH_ODR_CD(msgKey.getKeyValue("w_PUCH_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_LOT_CTRL_FLG")) {
						key.setw_LOT_CTRL_FLG(msgKey.getKeyValue("w_LOT_CTRL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_CTRL_CD")) {
						key.setRCV_ISSUE_CTRL_CD(msgKey.getKeyValue("RCV_ISSUE_CTRL_CD"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_TYP")) {
						key.setRCV_ISSUE_TYP(new Integer(msgKey.getKeyValue("RCV_ISSUE_TYP")));
					}
					if(msgKeyType.containsKeyColumn("tmp_WH_CD")) {
						key.settmp_WH_CD(msgKey.getKeyValue("tmp_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_DATE")) {
						key.setRCV_ISSUE_DATE(msgKey.getKeyValue("RCV_ISSUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_GNR_TYP")) {
						key.setRCV_ISSUE_GNR_TYP(new Integer(msgKey.getKeyValue("RCV_ISSUE_GNR_TYP")));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UPD_TYP")) {
						key.setSTOCK_UPD_TYP(new Integer(msgKey.getKeyValue("STOCK_UPD_TYP")));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_CMPLT_FLG")) {
						key.setRCV_ISSUE_CMPLT_FLG(new Integer(msgKey.getKeyValue("RCV_ISSUE_CMPLT_FLG")));
					}
					if(msgKeyType.containsKeyColumn("w_STOCK_LOT_CD")) {
						key.setw_STOCK_LOT_CD(msgKey.getKeyValue("w_STOCK_LOT_CD"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_COST")) {
						key.setUNIT_COST(msgKey.getKeyValue("UNIT_COST"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_COST_TYP")) {
						key.setUNIT_COST_TYP(new Integer(msgKey.getKeyValue("UNIT_COST_TYP")));
					}
					if(msgKeyType.containsKeyColumn("ONEROUS_FLG")) {
						key.setONEROUS_FLG(msgKey.getKeyValue("ONEROUS_FLG"));
					}
					if(msgKeyType.containsKeyColumn("ONEROUS_CONS_NO")) {
						key.setONEROUS_CONS_NO(msgKey.getKeyValue("ONEROUS_CONS_NO"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_QTY")) {
						key.setRCV_ISSUE_QTY(msgKey.getKeyValue("RCV_ISSUE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("RETURNED_WH_CD")) {
						key.setRETURNED_WH_CD(msgKey.getKeyValue("RETURNED_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_LOT_CD")) {
						key.setSTOCK_LOT_CD(msgKey.getKeyValue("STOCK_LOT_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_LOT_NO")) {
						key.setl_LOT_NO(msgKey.getKeyValue("l_LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_PUCH_ODR_CD")) {
						key.setl_PUCH_ODR_CD(msgKey.getKeyValue("l_PUCH_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_WORK_ODR_CD")) {
						key.setl_WORK_ODR_CD(msgKey.getKeyValue("l_WORK_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ISSUE_QTY")) {
						key.setl_ISSUE_QTY(msgKey.getKeyValue("l_ISSUE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_ISSUE_DATE")) {
						key.setl_ISSUE_DATE(msgKey.getKeyValue("l_ISSUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_SPENT_QTY")) {
						key.setl_SPENT_QTY(msgKey.getKeyValue("l_SPENT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_STOCK_UNIT")) {
						key.setl_STOCK_UNIT(msgKey.getKeyValue("l_STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("w_TOTAL_STOCK_ON_HAND_QTY")) {
						key.setw_TOTAL_STOCK_ON_HAND_QTY(msgKey.getKeyValue("w_TOTAL_STOCK_ON_HAND_QTY"));
					}
					if(msgKeyType.containsKeyColumn("w_JOB_ODR_CD")) {
						key.setw_JOB_ODR_CD(msgKey.getKeyValue("w_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("VALUE")) {
						key.setVALUE(msgKey.getKeyValue("VALUE"));
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
