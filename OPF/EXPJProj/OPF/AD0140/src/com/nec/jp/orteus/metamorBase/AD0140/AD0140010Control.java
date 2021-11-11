/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AD0140/src/com/nec/jp/orteus/metamorBase/AD0140/AD0140010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AD0140;

import com.nec.jp.orteus.metamorBase.AD0140.*;
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
import com.nec.jp.orteus.metamorBase.common04.sysdata.DateCtrlControl;
import com.nec.jp.orteus.metamorBase.common04.sysdata.DateCtrlStruct;
import com.nec.jp.orteus.metamorBase.common04.util.DataNotFoundException;
import java.text.ParseException ;
import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
//}}user_implement_code_import

//{{user_implement_code_header
/**
 * CLASS     : AD0140010Control クラス
 * ファイル・クラス説明
 * @author $Author: geng-jia $
 * @version $Revision: 1.6 $ $Date: 2015/12/21 03:06:19 $
 * 
 */
//}}user_implement_code_header

public class AD0140010Control
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
	public AD0140010Struct getListvalue(int x) { return (AD0140010Struct)(this.list.get(x)); }	// リストの値を返します。
	public AD0140010Struct getStruct() { return this.struct; }	// Structの値を返します。
	public AD0140010Struct createStruct() { return new AD0140010Struct(); }	// 新しいStructを作って返します。
	public void setStruct(Object structname) { this.struct.setStruct((AD0140010Struct)structname); }	// Structをセットします。
	public void initializeStruct() { this.struct.initialize(); }	// Structの値を初期化します。

	// CSV出力用リスト
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }
	
	/**全部レコード数**/
	private int _intTotalCount = 0; 
	/**エラーレコード件数**/
	private int _intErrorCount = 0;  
	/**正常レコード件数**/
	private int _intSuccessCount = 0;
	/**ワーニング件数**/
	private int _intWarningCount = 0;
	
	/** ＣＳＶ項目番号定義 */
	// 日報区分
	private final int CSV_DAILY_WORK_REPORT_TYP = 0;

	// ユーザコード（人日報）
	private final int CSV_USER_CD2 = 1;
	// 作業日（人日報）
	private final int CSV_OPR_DATE2 = 2;
	// 勤務シフト（人日報）
	private final int CSV_WORK_SHIFT_CODE2 = 3;
	// 作業区コード１
	private final int CSV_WS_CD1 = 4;
	// 開始時刻１
	private final int CSV_START_TIME1 = 5;
	// 終了時刻１
	private final int CSV_END_TIME1 = 6;
	// 作業区分１
	private final int CSV_OPR_TYP1 = 7;
	// 不作業理由１
	private final int CSV_UN_OPR_CAUSE_TYP1 = 8;
	// 不作業時間（分）１
	private final int CSV_UN_OPR_TIME1 = 9;
	// 不作業理由備考１
	private final int CSV_REMARKS1 = 10;
	// 作業区コード２
	private final int CSV_WS_CD2 = 11;
	// 開始時刻２
	private final int CSV_START_TIME2 = 12;
	// 終了時刻２
	private final int CSV_END_TIME2 = 13;
	// 作業区分２
	private final int CSV_OPR_TYP2 = 14;
	// 不作業理由２
	private final int CSV_UN_OPR_CAUSE_TYP2 = 15;
	// 不作業時間（分）２
	private final int CSV_UN_OPR_TIME2 = 16;
	// 不作業理由備考２
	private final int CSV_REMARKS2 = 17;
	// 作業区コード３
	private final int CSV_WS_CD3 = 18;
	// 開始時刻３
	private final int CSV_START_TIME3 = 19;
	// 終了時刻３
	private final int CSV_END_TIME3 = 20;
	// 作業区分３
	private final int CSV_OPR_TYP3 = 21;
	// 不作業理由３
	private final int CSV_UN_OPR_CAUSE_TYP3 = 22;
	// 不作業時間（分）３
	private final int CSV_UN_OPR_TIME3 = 23;
	// 不作業理由備考３
	private final int CSV_REMARKS3 = 24;
	// 作業区コード４
	private final int CSV_WS_CD4 = 25;
	// 開始時刻４
	private final int CSV_START_TIME4 = 26;
	// 終了時刻４
	private final int CSV_END_TIME4 = 27;
	// 作業区分４
	private final int CSV_OPR_TYP4 = 28;
	// 不作業理由４
	private final int CSV_UN_OPR_CAUSE_TYP4 = 29;
	// 不作業時間（分）４
	private final int CSV_UN_OPR_TIME4 = 30;
	// 不作業理由備考４
	private final int CSV_REMARKS4 = 31;
	// 作業区コード５
	private final int CSV_WS_CD5 = 32;
	// 開始時刻５
	private final int CSV_START_TIME5 = 33;
	// 終了時刻５
	private final int CSV_END_TIME5 = 34;
	// 作業区分５
	private final int CSV_OPR_TYP5 = 35;
	// 不作業理由５
	private final int CSV_UN_OPR_CAUSE_TYP5 = 36;
	// 不作業時間（分）５
	private final int CSV_UN_OPR_TIME5 = 37;
	// 不作業理由備考５
	private final int CSV_REMARKS5 = 38;
	// ＣＳＶ取込データ必要項目数(合計)
	private final int CSV_NECESSARY_COLUMN = 39;
	// 199
	private final int CSV_COLNO_199 = 199;        
	
	// エラーメッセージ
	private ExpjMessage _emsg = null;

	// 多言語項目取得対応
	private String _locale = CoreTools.getLocale(sysUSER_CD);
	ResourceBundle _resource = CoreTools.getResourceBundle("OrteusUserDic", _locale);

//	/** 会社コード */
//	private String _strCompany_cd;
//
//	/** 会社コード取得 */
//	public String getCompanyCd() {
//		return _strCompany_cd;
//	}
	
	/** 業務運用日*/
	private String _businessOprDate;
	/**
	 * 
	 * @return 業務運用日を取得
	 * @throws SQLException
	 */
	private String getBUSINESS_OPR_DATE() {
		return _businessOprDate;
	}
	
	// コンボボックス定義
	// エラー状態区分
	private ComboStruct _COM_ERR_TYP = null;
	// 日報区分
	private ComboStruct _DAILY_WORK_REPORT_TYP_01 = null;
	// 作業区分
	private ComboStruct _OPR_TYP_CD_01 = null;
	// 不作業理由区分
	private ComboStruct _UN_OPR_CAUSE_CD_01 = null;
	// 作業時間の上限値
	String _MAX_OPR_TIME = null;
	
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
	private void setInfoMessage(String code, String value1) {
		ExpjMessage emsg = new ExpjMessage(code, value1);
		msgStruct.addInfo(emsg);
		sysLog.info(emsg, sysUSER_CD);
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
		if (dataSource.matches("^^\\d{4}\\/\\d{2}\\/\\d{2}$")) {
			flag = "true";

		} else if (dataSource.matches("^^\\d{4}\\/\\d{1}\\/\\d{1}$")) {
			flag = "true";

		} else if (dataSource.matches("^^\\d{4}\\/\\d{2}\\/\\d{1}$")) {
			flag = "true";

		} else if (dataSource.matches("^^\\d{4}\\/\\d{1}\\/\\d{2}$")) {
			flag = "true";
		} else {
			flag = "false";
		}
		if ("true".equals(flag)) {
			try {
				SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
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
	 * "HH:mm"形式の日付文字列を比較します。
	 * @param dateString1 日付文字列１
	 * @param dateString2 日付文字列２
	 * @return 日付文字列１ ＝ 日付文字列２ の場合は 0を戻す。日付文字列１ ＜ 日付文字列２ の場合は 0 より小さい値を戻す。日付文字列１ ＞ 日付文字列２ の場合は 0 より大きい値を戻す。
	 * @throws ParseException パラメータが日付文字列ではない。
	 */
	public int compareHm(String dateString1, String dateString2) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("HHmm");
		
		if(dateString1.length() == 3) {
			dateString1 = "0" + dateString1;
		} 
		if(dateString2.length() == 3) {
			dateString2 = "0" + dateString2;
		} 
		Date date1 = sdf.parse(dateString1);
		Date date2 = sdf.parse(dateString2);
		return date1.compareTo(date2);

	}

	/**
	 * 整数チェック 項目が整数か判断する
	 * 
	 * @param strInString
	 *            入力パラメータ
	 * @return 正常:true / エラー:false
	 */
	public boolean isIntegerChk(String strInString) {
		// 整数のinputをセット用
		try {
			Integer.parseInt(strInString);
		} catch (Exception e) {
			// 整数ではない場合Exceptionに飛ばして処理
			// falseをセットして処理を抜ける(エラー：数値以外の入力)
			return false;
		}
		// trueをセットして処理を抜ける(正常終了)
		return true;
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
	 * 作業時間計算
	 * 
	 * @param workShiftCode
	 *				勤務シフト
	 * @param startTime
	 *				開始時刻
	 * @param endTime
	 *				終了時刻
	 * @return
	 * @throws SQLException
	 * @throws FoundationException
	 * @throws ParseException 
	 */
	private String getTimeCalculate(AD0140010Struct csvStruct) throws FoundationException, SQLException, ParseException {
		String strOprTime = null;
		if(compareHm(csvStruct.getSTART_TIME6(), csvStruct.getEND_TIME6()) == 0) {
			csvStruct.setRETURN_MESSAGE(new ExpjMessage("AD61007").getMessage(_locale));
			return strOprTime;
		}
		
		AD0140010Struct callStruct = new AD0140010Struct();
		ResourceBundle rb = SystemConfig.getBundle();
		callStruct.setPVC2LOGMODE(SystemConfig.getProperty("LOG_MODE", rb));
		callStruct.setPVC2OUTPUTMODE(SystemConfig.getProperty("OUTPUT_MODE", rb));
		callStruct.setPVC2OUTPUTPATH(SystemConfig.getProperty("OUTPUT_PATH", rb));
		callStruct.setPVC2OUTPUTNAME(SystemConfig.getProperty("OUTPUT_NAME", rb));
		callStruct.setPVC2USERID(sysUSER_CD);
		callStruct.setPVC2BUSINESSNAME(sp.getProcId());
		callStruct.setPVC2PLANTCD(sysPLANT_CD);
		callStruct.setWORK_SHIFT_CODE3(csvStruct.getWORK_SHIFT_CODE3());
		callStruct.setSTART_TIME6(csvStruct.getSTART_TIME6());
		callStruct.setEND_TIME6(csvStruct.getEND_TIME6());

		//バッチパラメータ呼出
		List resultList = entity.mCallSQLOPRTIMECALC.call(conn, callStruct);
		AD0140010Struct resultStruct = (AD0140010Struct)resultList.get(0);
		if ("9".equals(resultStruct.getRETURN_STATUS())) {
			csvStruct.setRETURN_MESSAGE(new ExpjMessage(resultStruct.getRETURN_MESSAGE()).getMessage(_locale));
		} else {
			strOprTime = resultStruct.getOPR_TIME();
		}
		return strOprTime;
	}
	
	/**
	 * コンボボックスデータの存在チェック
	 * 
	 * @param combo
	 *			ンボボックスデータ
	 * @param value
	 *			コンボボックスデータの値
	 * @return コンボボックスデータ存在場合戻値true,存在しない場合戻値false
	 */
	private boolean checkCombValue(ComboStruct combo, String value) {
		for (int j = 0; j < combo.size(); j++) {
			if (value.equals((combo.getData(j)[0]))) {
				return true;
			}
		}
		return false;
	}

	/**
	 * コンボボックス項目のチェック
	 * 
	 * @param csvStruct
	 *				CSVデータ
	 * @param lineNo
	 *				行番号
	 * @return　true：値存在　false：値存在しない
	 */
	private boolean checkCombData(AD0140010Struct csvStruct, int lineNo) {
		// エラーメッセージ
		String errMsg = new ExpjMessage("AA01504").getMessage(_locale);
			// 作業区分1
			if (!checkCombValue(_OPR_TYP_CD_01, csvStruct.getOPR_TYP1())) {
				csvExport(csvStruct
						 , "1"									// エラー区分
						 , lineNo								// エラー行番号
						 , CSV_OPR_TYP1							// エラー項目番号
						 , "Expj.Cmt6751"						// エラー項目名
						 , errMsg);								// エラーメッセージ
				return false;
			}
			// 不作業理由1
			if (!checkCombValue(_UN_OPR_CAUSE_CD_01, csvStruct.getUN_OPR_CAUSE_TYP1())) {
				csvExport(csvStruct
						 , "1"									// エラー区分
						 , lineNo								// エラー行番号
						 , CSV_UN_OPR_CAUSE_TYP1				// エラー項目番号
						 , "Expj.Cmt6752"						// エラー項目名
						 , errMsg);								// エラーメッセージ
				return false;
			}
			// 作業区分2
			if (!checkCombValue(_OPR_TYP_CD_01, csvStruct.getOPR_TYP2())) {
				csvExport(csvStruct
						 , "1"									// エラー区分
						 , lineNo								// エラー行番号
						 , CSV_OPR_TYP2							// エラー項目番号
						 , "Expj.Cmt6758"						// エラー項目名
						 , errMsg);								// エラーメッセージ
				return false;
			}
			// 不作業理由2
			if (!checkCombValue(_UN_OPR_CAUSE_CD_01, csvStruct.getUN_OPR_CAUSE_TYP2())) {
				csvExport(csvStruct
						 , "1"									// エラー区分
						 , lineNo								// エラー行番号
						 , CSV_UN_OPR_CAUSE_TYP2				// エラー項目番号
						 , "Expj.Cmt6759"						// エラー項目名
						 , errMsg);								// エラーメッセージ
				return false;
			}
			// 作業区分3
			if (!checkCombValue(_OPR_TYP_CD_01, csvStruct.getOPR_TYP3())) {
				csvExport(csvStruct
						 , "1"									// エラー区分
						 , lineNo								// エラー行番号
						 , CSV_OPR_TYP3							// エラー項目番号
						 , "Expj.Cmt6765"						// エラー項目名
						 , errMsg);								// エラーメッセージ
				return false;
			}
			// 不作業理由3
			if (!checkCombValue(_UN_OPR_CAUSE_CD_01, csvStruct.getUN_OPR_CAUSE_TYP3())) {
				csvExport(csvStruct
						 , "1"									// エラー区分
						 , lineNo								// エラー行番号
						 , CSV_UN_OPR_CAUSE_TYP3				// エラー項目番号
						 , "Expj.Cmt6766"						// エラー項目名
						 , errMsg);								// エラーメッセージ
				return false;
			}
			// 作業区分4
			if (!checkCombValue(_OPR_TYP_CD_01, csvStruct.getOPR_TYP4())) {
				csvExport(csvStruct
						 , "1"									// エラー区分
						 , lineNo								// エラー行番号
						 , CSV_OPR_TYP4							// エラー項目番号
						 , "Expj.Cmt6772"						// エラー項目名
						 , errMsg);								// エラーメッセージ
				return false;
			}
			// 不作業理由4
			if (!checkCombValue(_UN_OPR_CAUSE_CD_01, csvStruct.getUN_OPR_CAUSE_TYP4())) {
				csvExport(csvStruct
						 , "1"									// エラー区分
						 , lineNo								// エラー行番号
						 , CSV_UN_OPR_CAUSE_TYP4				// エラー項目番号
						 , "Expj.Cmt6773"						// エラー項目名
						 , errMsg);								// エラーメッセージ
				return false;
			}
			// 作業区分5
			if (!checkCombValue(_OPR_TYP_CD_01, csvStruct.getOPR_TYP5())) {
				csvExport(csvStruct
						 , "1"									// エラー区分
						 , lineNo								// エラー行番号
						 , CSV_OPR_TYP5							// エラー項目番号
						 , "Expj.Cmt6779"						// エラー項目名
						 , errMsg);								// エラーメッセージ
				return false;
			}
			// 不作業理由5
			if (!checkCombValue(_UN_OPR_CAUSE_CD_01, csvStruct.getUN_OPR_CAUSE_TYP5())) {
				csvExport(csvStruct
						 , "1"									// エラー区分
						 , lineNo								// エラー行番号
						 , CSV_UN_OPR_CAUSE_TYP5				// エラー項目番号
						 , "Expj.Cmt6780"						// エラー項目名
						 , errMsg);								// エラーメッセージ
				return false;
			}
//		}
		
		return true;
	}
	/**
	 * エラー項目出力
	 * @param csvStruct　CSVデータ
	 * @param lineNo　行番号
	 * @param detialNo　作業区明細番号
	 */
	public void exportCompareLog(AD0140010Struct csvStruct, int lineNo, int detialNo) {
		switch(detialNo) {
			case 1:
				csvExport(csvStruct
						, "1"					// エラー区分
						, lineNo				// エラー行番号
						, CSV_START_TIME1		// エラー項目番号
						, "Expj.Cmt6749"		// エラー項目名
						, new ExpjMessage("AD61007").getMessage(_locale));  // エラーメッセージ
				break;
			case 2:
				csvExport(csvStruct
						, "1"					// エラー区分
						, lineNo				// エラー行番号
						, CSV_START_TIME2		// エラー項目番号
						, "Expj.Cmt6756"		// エラー項目名
						, new ExpjMessage("AD61007").getMessage(_locale));  // エラーメッセージ
				break;
			case 3:
				csvExport(csvStruct
						, "1"					// エラー区分
						, lineNo				 // エラー行番号
						, CSV_START_TIME3		// エラー項目番号
						, "Expj.Cmt6763"		// エラー項目名
						, new ExpjMessage("AD61007").getMessage(_locale));  // エラーメッセージ
				break;
			case 4:
				csvExport(csvStruct
						, "1"					// エラー区分
						, lineNo				// エラー行番号
						, CSV_START_TIME4		// エラー項目番号
						, "Expj.Cmt6770"		// エラー項目名
						, new ExpjMessage("AD61007").getMessage(_locale));  // エラーメッセージ
				break;
			case 5:
				csvExport(csvStruct
						, "1"					// エラー区分
						, lineNo				// エラー行番号
						, CSV_START_TIME5		// エラー項目番号
						, "Expj.Cmt6777"		// エラー項目名
						, new ExpjMessage("AD61007").getMessage(_locale));  // エラーメッセージ
				break;
		}
		
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
	 * 時間帯の重複チェック
	 * @param csvStruct　CSVデータ
	 * @param lineNo　行番号
	 * @return　true：エラーなし　false:エラーあり
	 */
	private boolean checkTimeDuplicate(AD0140010Struct csvStruct, int lineNo) {
		try {
			// 時刻1と時刻2の比較
			if(!isNull(csvStruct.getSTART_TIME2()) && !isNull(csvStruct.getEND_TIME2())) {
				if (compareHm(csvStruct.getSTART_TIME1(), csvStruct.getEND_TIME1()) > 0) {
					if (compareHm(csvStruct.getSTART_TIME2(), csvStruct.getSTART_TIME1()) >= 0
							|| compareHm(csvStruct.getEND_TIME2(), csvStruct.getSTART_TIME1()) > 0
							|| compareHm(csvStruct.getSTART_TIME2(), csvStruct.getEND_TIME1()) < 0
							|| compareHm(csvStruct.getEND_TIME2(), csvStruct.getEND_TIME1()) <= 0
							|| (compareHm(csvStruct.getSTART_TIME2(), csvStruct.getEND_TIME2()) > 0 && compareHm(csvStruct.getSTART_TIME2(), csvStruct.getSTART_TIME1()) < 0 && compareHm(csvStruct.getEND_TIME2(), csvStruct.getEND_TIME1()) > 0)) {
						// <エラー> AD61007 【開始時刻・終了時刻に矛盾があります。】
						// 「行番号：{0}」をメッセージに付加する。
						// {0}：明細の番号（1）
						// エラー項目：開始時刻1
						exportCompareLog(csvStruct, lineNo, 1);
						return false;
					}
				}

				if (compareHm(csvStruct.getSTART_TIME1(), csvStruct.getEND_TIME1()) <= 0) {
					if (compareHm(csvStruct.getSTART_TIME2(), csvStruct.getEND_TIME2()) > 0) {
						if (compareHm(csvStruct.getSTART_TIME2(), csvStruct.getSTART_TIME1()) <= 0
								|| compareHm(csvStruct.getSTART_TIME2(), csvStruct.getEND_TIME1()) < 0
								|| compareHm(csvStruct.getEND_TIME2(), csvStruct.getSTART_TIME1()) > 0
								|| compareHm(csvStruct.getEND_TIME2(), csvStruct.getEND_TIME1()) >= 0) {
							// <エラー> AD61007 【開始時刻・終了時刻に矛盾があります。】
							// 「行番号：{0}」をメッセージに付加する。
							// {0}：明細の番号（1）
							// エラー項目：開始時刻1
							exportCompareLog(csvStruct, lineNo, 1);
							return false;
						}
					}

				}

				if (compareHm(csvStruct.getSTART_TIME1(), csvStruct.getEND_TIME1()) <= 0) {
					if (compareHm(csvStruct.getSTART_TIME2(), csvStruct.getEND_TIME2()) <= 0) {
						if ((compareHm(csvStruct.getSTART_TIME2(), csvStruct.getSTART_TIME1()) >= 0 && compareHm(csvStruct.getSTART_TIME2(), csvStruct.getEND_TIME1()) < 0)
								|| (compareHm(csvStruct.getEND_TIME2(), csvStruct.getSTART_TIME1()) > 0 && compareHm(csvStruct.getEND_TIME2(), csvStruct.getEND_TIME1()) <= 0)
								|| (compareHm(csvStruct.getSTART_TIME2(), csvStruct.getSTART_TIME1()) <= 0) && (compareHm(csvStruct.getEND_TIME2(), csvStruct.getEND_TIME1()) >= 0)) {
							// <エラー> AD61007 【開始時刻・終了時刻に矛盾があります。】
							// 「行番号：{0}」をメッセージに付加する。
							// {0}：明細の番号（1）
							// エラー項目：開始時刻1
							exportCompareLog(csvStruct, lineNo, 1);
							return false;
						}
					}
				}
			}
			// 時刻1と時刻3の比較
			if(!isNull(csvStruct.getSTART_TIME3()) && !isNull(csvStruct.getEND_TIME3())) {
				if (compareHm(csvStruct.getSTART_TIME1(), csvStruct.getEND_TIME1()) > 0) {
					if (compareHm(csvStruct.getSTART_TIME3(), csvStruct.getSTART_TIME1()) >= 0
							|| compareHm(csvStruct.getEND_TIME3(), csvStruct.getSTART_TIME1()) > 0
							|| compareHm(csvStruct.getSTART_TIME3(), csvStruct.getEND_TIME1()) < 0
							|| compareHm(csvStruct.getEND_TIME3(), csvStruct.getEND_TIME1()) <= 0
							|| (compareHm(csvStruct.getSTART_TIME3(), csvStruct.getEND_TIME3()) > 0 && compareHm(csvStruct.getSTART_TIME3(), csvStruct.getSTART_TIME1()) < 0 && compareHm(csvStruct.getEND_TIME3(), csvStruct.getEND_TIME1()) > 0)) {
						// <エラー> AD61007 【開始時刻・終了時刻に矛盾があります。】
						// 「行番号：{0}」をメッセージに付加する。
						// {0}：明細の番号（1）
						// エラー項目：開始時刻1
						exportCompareLog(csvStruct, lineNo, 1);
						return false;
					}
				}

				if (compareHm(csvStruct.getSTART_TIME1(), csvStruct.getEND_TIME1()) <= 0) {
					if (compareHm(csvStruct.getSTART_TIME3(), csvStruct.getEND_TIME3()) > 0) {
						if (compareHm(csvStruct.getSTART_TIME3(), csvStruct.getSTART_TIME1()) <= 0
								|| compareHm(csvStruct.getSTART_TIME3(), csvStruct.getEND_TIME1()) < 0
								|| compareHm(csvStruct.getEND_TIME3(), csvStruct.getSTART_TIME1()) > 0
								|| compareHm(csvStruct.getEND_TIME3(), csvStruct.getEND_TIME1()) >= 0) {
							// <エラー> AD61007 【開始時刻・終了時刻に矛盾があります。】
							// 「行番号：{0}」をメッセージに付加する。
							// {0}：明細の番号（1）
							// エラー項目：開始時刻1
							exportCompareLog(csvStruct, lineNo, 1);
							return false;
						}
					}
				}

				if (compareHm(csvStruct.getSTART_TIME1(), csvStruct.getEND_TIME1()) <= 0) {
					if (compareHm(csvStruct.getSTART_TIME3(), csvStruct.getEND_TIME3()) <= 0) {
						if ((compareHm(csvStruct.getSTART_TIME3(), csvStruct.getSTART_TIME1()) >= 0 && compareHm(csvStruct.getSTART_TIME3(), csvStruct.getEND_TIME1()) < 0)
								|| (compareHm(csvStruct.getEND_TIME3(), csvStruct.getSTART_TIME1()) > 0 && compareHm(csvStruct.getEND_TIME3(), csvStruct.getEND_TIME1()) <= 0)
								|| (compareHm(csvStruct.getSTART_TIME3(), csvStruct.getSTART_TIME1()) <= 0) && (compareHm(csvStruct.getEND_TIME3(), csvStruct.getEND_TIME1()) >= 0)) {
							// <エラー> AD61007 【開始時刻・終了時刻に矛盾があります。】
							// 「行番号：{0}」をメッセージに付加する。
							// {0}：明細の番号（1）
							// エラー項目：開始時刻1
							exportCompareLog(csvStruct, lineNo, 1);
							return false;
						}
					}
				}
			}
			
			// 時刻1と時刻4の比較
			if(!isNull(csvStruct.getSTART_TIME4()) && !isNull(csvStruct.getEND_TIME4())) {
				if (compareHm(csvStruct.getSTART_TIME1(), csvStruct.getEND_TIME1()) > 0) {
					if (compareHm(csvStruct.getSTART_TIME4(), csvStruct.getSTART_TIME1()) >= 0
							|| compareHm(csvStruct.getEND_TIME4(), csvStruct.getSTART_TIME1()) > 0
							|| compareHm(csvStruct.getSTART_TIME4(), csvStruct.getEND_TIME1()) < 0
							|| compareHm(csvStruct.getEND_TIME4(), csvStruct.getEND_TIME1()) <= 0
							|| (compareHm(csvStruct.getSTART_TIME4(), csvStruct.getEND_TIME4()) > 0 && compareHm(csvStruct.getSTART_TIME4(), csvStruct.getSTART_TIME1()) < 0 && compareHm(csvStruct.getEND_TIME4(), csvStruct.getEND_TIME1()) > 0)) {
						// <エラー> AD61007 【開始時刻・終了時刻に矛盾があります。】
						// 「行番号：{0}」をメッセージに付加する。
						// {0}：明細の番号（1）
						// エラー項目：開始時刻1
						exportCompareLog(csvStruct, lineNo, 1);
						return false;
					}
				}

				if (compareHm(csvStruct.getSTART_TIME1(), csvStruct.getEND_TIME1()) <= 0) {
					if (compareHm(csvStruct.getSTART_TIME4(), csvStruct.getEND_TIME4()) > 0) {
						if (compareHm(csvStruct.getSTART_TIME4(), csvStruct.getSTART_TIME1()) <= 0
								|| compareHm(csvStruct.getSTART_TIME4(), csvStruct.getEND_TIME1()) < 0
								|| compareHm(csvStruct.getEND_TIME4(), csvStruct.getSTART_TIME1()) > 0
								|| compareHm(csvStruct.getEND_TIME4(), csvStruct.getEND_TIME1()) >= 0) {
							// <エラー> AD61007 【開始時刻・終了時刻に矛盾があります。】
							// 「行番号：{0}」をメッセージに付加する。
							// {0}：明細の番号（1）
							// エラー項目：開始時刻1
							exportCompareLog(csvStruct, lineNo, 1);
							return false;
						}
					}

				}

				if (compareHm(csvStruct.getSTART_TIME1(), csvStruct.getEND_TIME1()) <= 0) {
					if (compareHm(csvStruct.getSTART_TIME4(), csvStruct.getEND_TIME4()) <= 0) {
						if ((compareHm(csvStruct.getSTART_TIME4(), csvStruct.getSTART_TIME1()) >= 0 && compareHm(csvStruct.getSTART_TIME4(), csvStruct.getEND_TIME1()) < 0)
								|| (compareHm(csvStruct.getEND_TIME4(), csvStruct.getSTART_TIME1()) > 0 && compareHm(csvStruct.getEND_TIME4(), csvStruct.getEND_TIME1()) <= 0)
								|| (compareHm(csvStruct.getSTART_TIME4(), csvStruct.getSTART_TIME1()) <= 0) && (compareHm(csvStruct.getEND_TIME4(), csvStruct.getEND_TIME1()) >= 0)) {
							// <エラー> AD61007 【開始時刻・終了時刻に矛盾があります。】
							// 「行番号：{0}」をメッセージに付加する。
							// {0}：明細の番号（1）
							// エラー項目：開始時刻1
							exportCompareLog(csvStruct, lineNo, 1);
							return false;
						}
					}
				}
			}
			
			// 時刻1と時刻5の比較
			if(!isNull(csvStruct.getSTART_TIME5()) && !isNull(csvStruct.getEND_TIME5())) {
				if (compareHm(csvStruct.getSTART_TIME1(), csvStruct.getEND_TIME1()) > 0) {
					if (compareHm(csvStruct.getSTART_TIME5(), csvStruct.getSTART_TIME1()) >= 0
							|| compareHm(csvStruct.getEND_TIME5(), csvStruct.getSTART_TIME1()) > 0
							|| compareHm(csvStruct.getSTART_TIME5(), csvStruct.getEND_TIME1()) < 0
							|| compareHm(csvStruct.getEND_TIME5(), csvStruct.getEND_TIME1()) <= 0
							|| (compareHm(csvStruct.getSTART_TIME5(), csvStruct.getEND_TIME5()) > 0 && compareHm(csvStruct.getSTART_TIME5(), csvStruct.getSTART_TIME1()) < 0 && compareHm(csvStruct.getEND_TIME5(), csvStruct.getEND_TIME1()) > 0)) {
						// <エラー> AD61007 【開始時刻・終了時刻に矛盾があります。】
						// 「行番号：{0}」をメッセージに付加する。
						// {0}：明細の番号（1）
						// エラー項目：開始時刻1
						exportCompareLog(csvStruct, lineNo, 1);
						return false;

					}
				}

				if (compareHm(csvStruct.getSTART_TIME1(), csvStruct.getEND_TIME1()) <= 0) {
					if (compareHm(csvStruct.getSTART_TIME5(), csvStruct.getEND_TIME5()) > 0) {
						if (compareHm(csvStruct.getSTART_TIME5(), csvStruct.getSTART_TIME1()) <= 0
								|| compareHm(csvStruct.getSTART_TIME5(), csvStruct.getEND_TIME1()) < 0
								|| compareHm(csvStruct.getEND_TIME5(), csvStruct.getSTART_TIME1()) > 0
								|| compareHm(csvStruct.getEND_TIME5(), csvStruct.getEND_TIME1()) >= 0) {
							// <エラー> AD61007 【開始時刻・終了時刻に矛盾があります。】
							// 「行番号：{0}」をメッセージに付加する。
							// {0}：明細の番号（1）
							// エラー項目：開始時刻1
							exportCompareLog(csvStruct, lineNo, 1);
							return false;
						}
					}

				}

				if (compareHm(csvStruct.getSTART_TIME1(), csvStruct.getEND_TIME1()) <= 0) {
					if (compareHm(csvStruct.getSTART_TIME5(), csvStruct.getEND_TIME5()) <= 0) {
						if ((compareHm(csvStruct.getSTART_TIME5(), csvStruct.getSTART_TIME1()) >= 0 && compareHm(csvStruct.getSTART_TIME5(), csvStruct.getEND_TIME1()) < 0)
								|| (compareHm(csvStruct.getEND_TIME5(), csvStruct.getSTART_TIME1()) > 0 && compareHm(csvStruct.getEND_TIME5(), csvStruct.getEND_TIME1()) <= 0)
								|| (compareHm(csvStruct.getSTART_TIME5(), csvStruct.getSTART_TIME1()) <= 0) && (compareHm(csvStruct.getEND_TIME5(), csvStruct.getEND_TIME1()) >= 0)) {
							// <エラー> AD61007 【開始時刻・終了時刻に矛盾があります。】
							// 「行番号：{0}」をメッセージに付加する。
							// {0}：明細の番号（1）
							// エラー項目：開始時刻1
							exportCompareLog(csvStruct, lineNo, 1);
							return false;
						}
					}
				}
			}
			
			// 明細2チェック
			if(!isNull(csvStruct.getSTART_TIME2()) && !isNull(csvStruct.getEND_TIME2())) {
				// 時刻2と時刻3の比較
				if(!isNull(csvStruct.getSTART_TIME3()) && !isNull(csvStruct.getEND_TIME3())) {
					if (compareHm(csvStruct.getSTART_TIME2(), csvStruct.getEND_TIME2()) > 0) {
						if (compareHm(csvStruct.getSTART_TIME3(), csvStruct.getSTART_TIME2()) >= 0
								|| compareHm(csvStruct.getEND_TIME3(), csvStruct.getSTART_TIME2()) > 0
								|| compareHm(csvStruct.getSTART_TIME3(), csvStruct.getEND_TIME2()) < 0
								|| compareHm(csvStruct.getEND_TIME3(), csvStruct.getEND_TIME2()) <= 0
								|| (compareHm(csvStruct.getSTART_TIME3(), csvStruct.getEND_TIME3()) > 0 && compareHm(csvStruct.getSTART_TIME3(), csvStruct.getSTART_TIME2()) < 0 && compareHm(csvStruct.getEND_TIME3(), csvStruct.getEND_TIME2()) > 0)) {
							// <エラー> AD61007 【開始時刻・終了時刻に矛盾があります。】
							// 「行番号：{0}」をメッセージに付加する。
							// {0}：明細の番号（2）
							// エラー項目：開始時刻2
							exportCompareLog(csvStruct, lineNo, 2);
							return false;
						}

					}

					if (compareHm(csvStruct.getSTART_TIME2(), csvStruct.getEND_TIME2()) <= 0) {
						if (compareHm(csvStruct.getSTART_TIME3(), csvStruct.getEND_TIME3()) > 0) {
							if (compareHm(csvStruct.getSTART_TIME3(), csvStruct.getSTART_TIME2()) <= 0
									|| compareHm(csvStruct.getSTART_TIME3(), csvStruct.getEND_TIME2()) < 0
									|| compareHm(csvStruct.getEND_TIME3(), csvStruct.getSTART_TIME2()) > 0
									|| compareHm(csvStruct.getEND_TIME3(), csvStruct.getEND_TIME2()) >= 0) {
								// <エラー> AD61007 【開始時刻・終了時刻に矛盾があります。】
								// 「行番号：{0}」をメッセージに付加する。
								// {0}：明細の番号（2）
								// エラー項目：開始時刻2
								exportCompareLog(csvStruct, lineNo, 2);
								return false;
							}
						}

					}

					if (compareHm(csvStruct.getSTART_TIME2(), csvStruct.getEND_TIME2()) <= 0) {
						if (compareHm(csvStruct.getSTART_TIME3(), csvStruct.getEND_TIME3()) <= 0) {
							if ((compareHm(csvStruct.getSTART_TIME3(), csvStruct.getSTART_TIME2()) >= 0 && compareHm(csvStruct.getSTART_TIME3(), csvStruct.getEND_TIME2()) < 0)
									|| (compareHm(csvStruct.getEND_TIME3(), csvStruct.getSTART_TIME2()) > 0 && compareHm(csvStruct.getEND_TIME3(), csvStruct.getEND_TIME2()) <= 0)
									|| (compareHm(csvStruct.getSTART_TIME3(), csvStruct.getSTART_TIME2()) <= 0) && (compareHm(csvStruct.getEND_TIME3(), csvStruct.getEND_TIME2()) >= 0)) {
								// <エラー> AD61007 【開始時刻・終了時刻に矛盾があります。】
								// 「行番号：{0}」をメッセージに付加する。
								// {0}：明細の番号（2）
								// エラー項目：開始時刻2
								exportCompareLog(csvStruct, lineNo, 2);
								return false;
							}
						}
					}
				}
				
				// 時刻2と時刻4の比較
				if(!isNull(csvStruct.getSTART_TIME4()) && !isNull(csvStruct.getEND_TIME4())) {
					if (compareHm(csvStruct.getSTART_TIME2(), csvStruct.getEND_TIME2()) > 0) {
						if (compareHm(csvStruct.getSTART_TIME4(), csvStruct.getSTART_TIME2()) >= 0
								|| compareHm(csvStruct.getEND_TIME4(), csvStruct.getSTART_TIME2()) > 0
								|| compareHm(csvStruct.getSTART_TIME4(), csvStruct.getEND_TIME2()) < 0
								|| compareHm(csvStruct.getEND_TIME4(), csvStruct.getEND_TIME2()) <= 0
								|| (compareHm(csvStruct.getSTART_TIME4(), csvStruct.getEND_TIME4()) > 0 && compareHm(csvStruct.getSTART_TIME4(), csvStruct.getSTART_TIME2()) < 0 && compareHm(csvStruct.getEND_TIME4(), csvStruct.getEND_TIME2()) > 0)) {
							// <エラー> AD61007 【開始時刻・終了時刻に矛盾があります。】
							// 「行番号：{0}」をメッセージに付加する。
							// {0}：明細の番号（2）
							// エラー項目：開始時刻2
							exportCompareLog(csvStruct, lineNo, 2);
							return false;
						}
					}

					if (compareHm(csvStruct.getSTART_TIME2(), csvStruct.getEND_TIME2()) <= 0) {
						if (compareHm(csvStruct.getSTART_TIME4(), csvStruct.getEND_TIME4()) > 0) {
							if (compareHm(csvStruct.getSTART_TIME4(), csvStruct.getSTART_TIME2()) <= 0
									|| compareHm(csvStruct.getSTART_TIME4(), csvStruct.getEND_TIME2()) < 0
									|| compareHm(csvStruct.getEND_TIME4(), csvStruct.getSTART_TIME2()) > 0
									|| compareHm(csvStruct.getEND_TIME4(), csvStruct.getEND_TIME2()) >= 0) {
								// <エラー> AD61007 【開始時刻・終了時刻に矛盾があります。】
								// 「行番号：{0}」をメッセージに付加する。
								// {0}：明細の番号（2）
								// エラー項目：開始時刻2
								exportCompareLog(csvStruct, lineNo, 2);
								return false;
							}
						}
					}

					if (compareHm(csvStruct.getSTART_TIME2(), csvStruct.getEND_TIME2()) <= 0) {
						if (compareHm(csvStruct.getSTART_TIME4(), csvStruct.getEND_TIME4()) <= 0) {
							if ((compareHm(csvStruct.getSTART_TIME4(), csvStruct.getSTART_TIME2()) >= 0 && compareHm(csvStruct.getSTART_TIME4(), csvStruct.getEND_TIME2()) < 0)
									|| (compareHm(csvStruct.getEND_TIME4(), csvStruct.getSTART_TIME2()) > 0 && compareHm(csvStruct.getEND_TIME4(), csvStruct.getEND_TIME2()) <= 0)
									|| (compareHm(csvStruct.getSTART_TIME4(), csvStruct.getSTART_TIME2()) <= 0) && (compareHm(csvStruct.getEND_TIME4(), csvStruct.getEND_TIME2()) >= 0)) {
								// <エラー> AD61007 【開始時刻・終了時刻に矛盾があります。】
								// 「行番号：{0}」をメッセージに付加する。
								// {0}：明細の番号（2）
								// エラー項目：開始時刻2
								exportCompareLog(csvStruct, lineNo, 2);
								return false;
							}
						}
					}
				}
				
				// 時刻2と時刻5の比較
				if(!isNull(csvStruct.getSTART_TIME5()) && !isNull(csvStruct.getEND_TIME5())) {
					if (compareHm(csvStruct.getSTART_TIME2(), csvStruct.getEND_TIME2()) > 0) {
						if (compareHm(csvStruct.getSTART_TIME5(), csvStruct.getSTART_TIME2()) >= 0
								|| compareHm(csvStruct.getEND_TIME5(), csvStruct.getSTART_TIME2()) > 0
								|| compareHm(csvStruct.getSTART_TIME5(), csvStruct.getEND_TIME2()) < 0
								|| compareHm(csvStruct.getEND_TIME5(), csvStruct.getEND_TIME2()) <= 0
								|| (compareHm(csvStruct.getSTART_TIME5(), csvStruct.getEND_TIME5()) > 0 && compareHm(csvStruct.getSTART_TIME5(), csvStruct.getSTART_TIME2()) < 0 && compareHm(csvStruct.getEND_TIME5(), csvStruct.getEND_TIME2()) > 0)) {
							// <エラー> AD61007 【開始時刻・終了時刻に矛盾があります。】
							// 「行番号：{0}」をメッセージに付加する。
							// {0}：明細の番号（2）
							// エラー項目：開始時刻2
							exportCompareLog(csvStruct, lineNo, 2);
							return false;
						}
					}

					if (compareHm(csvStruct.getSTART_TIME2(), csvStruct.getEND_TIME2()) <= 0) {
						if (compareHm(csvStruct.getSTART_TIME5(), csvStruct.getEND_TIME5()) > 0) {
							if (compareHm(csvStruct.getSTART_TIME5(), csvStruct.getSTART_TIME2()) <= 0
									|| compareHm(csvStruct.getSTART_TIME5(), csvStruct.getEND_TIME2()) < 0
									|| compareHm(csvStruct.getEND_TIME5(), csvStruct.getSTART_TIME2()) > 0
									|| compareHm(csvStruct.getEND_TIME5(), csvStruct.getEND_TIME2()) >= 0) {
								// <エラー> AD61007 【開始時刻・終了時刻に矛盾があります。】
								// 「行番号：{0}」をメッセージに付加する。
								// {0}：明細の番号（2）
								// エラー項目：開始時刻2
								exportCompareLog(csvStruct, lineNo, 2);
								return false;
							}
						}

					}

					if (compareHm(csvStruct.getSTART_TIME2(), csvStruct.getEND_TIME2()) <= 0) {
						if (compareHm(csvStruct.getSTART_TIME5(), csvStruct.getEND_TIME5()) <= 0) {
							if ((compareHm(csvStruct.getSTART_TIME5(), csvStruct.getSTART_TIME2()) >= 0 && compareHm(csvStruct.getSTART_TIME5(), csvStruct.getEND_TIME2()) < 0)
									|| (compareHm(csvStruct.getEND_TIME5(), csvStruct.getSTART_TIME2()) > 0 && compareHm(csvStruct.getEND_TIME5(), csvStruct.getEND_TIME2()) <= 0)
									|| (compareHm(csvStruct.getSTART_TIME5(), csvStruct.getSTART_TIME2()) <= 0) && (compareHm(csvStruct.getEND_TIME5(), csvStruct.getEND_TIME2()) >= 0)) {
								// <エラー> AD61007 【開始時刻・終了時刻に矛盾があります。】
								// 「行番号：{0}」をメッセージに付加する。
								// {0}：明細の番号（2）
								// エラー項目：開始時刻2
								exportCompareLog(csvStruct, lineNo, 2);
								return false;
							}
						}
					}
				}
			}
			
			// 明細3チェック
			if(!isNull(csvStruct.getSTART_TIME3()) && !isNull(csvStruct.getEND_TIME3())) {
				// 時刻3と時刻4の比較
				if(!isNull(csvStruct.getSTART_TIME4()) && !isNull(csvStruct.getEND_TIME4())) {
					if (compareHm(csvStruct.getSTART_TIME3(), csvStruct.getEND_TIME3()) > 0) {
						if (compareHm(csvStruct.getSTART_TIME4(), csvStruct.getSTART_TIME3()) >= 0
								|| compareHm(csvStruct.getEND_TIME4(), csvStruct.getSTART_TIME3()) > 0
								|| compareHm(csvStruct.getSTART_TIME4(), csvStruct.getEND_TIME3()) < 0
								|| compareHm(csvStruct.getEND_TIME4(), csvStruct.getEND_TIME3()) <= 0
								|| (compareHm(csvStruct.getSTART_TIME4(), csvStruct.getEND_TIME4()) > 0 && compareHm(csvStruct.getSTART_TIME4(), csvStruct.getSTART_TIME3()) < 0 && compareHm(csvStruct.getEND_TIME4(), csvStruct.getEND_TIME3()) > 0)) {
							// <エラー> AD61007 【開始時刻・終了時刻に矛盾があります。】
							// 「行番号：{0}」をメッセージに付加する。
							// {0}：明細の番号（3）
							// エラー項目：開始時刻3
							exportCompareLog(csvStruct, lineNo, 3);
							return false;
						}
					}

					if (compareHm(csvStruct.getSTART_TIME3(), csvStruct.getEND_TIME3()) <= 0) {
						if (compareHm(csvStruct.getSTART_TIME4(), csvStruct.getEND_TIME4()) > 0) {
							if (compareHm(csvStruct.getSTART_TIME4(), csvStruct.getSTART_TIME3()) <= 0
									|| compareHm(csvStruct.getSTART_TIME4(), csvStruct.getEND_TIME3()) < 0
									|| compareHm(csvStruct.getEND_TIME4(), csvStruct.getSTART_TIME3()) > 0
									|| compareHm(csvStruct.getEND_TIME4(), csvStruct.getEND_TIME3()) >= 0) {
								// <エラー> AD61007 【開始時刻・終了時刻に矛盾があります。】
								// 「行番号：{0}」をメッセージに付加する。
								// {0}：明細の番号（3）
								// エラー項目：開始時刻3
								exportCompareLog(csvStruct, lineNo, 3);
								return false;
							}
						}

					}

					if (compareHm(csvStruct.getSTART_TIME3(), csvStruct.getEND_TIME3()) <= 0) {
						if (compareHm(csvStruct.getSTART_TIME4(), csvStruct.getEND_TIME4()) <= 0) {
							if ((compareHm(csvStruct.getSTART_TIME4(), csvStruct.getSTART_TIME3()) >= 0 && compareHm(csvStruct.getSTART_TIME4(), csvStruct.getEND_TIME3()) < 0)
									|| (compareHm(csvStruct.getEND_TIME4(), csvStruct.getSTART_TIME3()) > 0 && compareHm(csvStruct.getEND_TIME4(), csvStruct.getEND_TIME3()) <= 0)
									|| (compareHm(csvStruct.getSTART_TIME4(), csvStruct.getSTART_TIME3()) <= 0) && (compareHm(csvStruct.getEND_TIME4(), csvStruct.getEND_TIME3()) >= 0)) {
								// <エラー> AD61007 【開始時刻・終了時刻に矛盾があります。】
								// 「行番号：{0}」をメッセージに付加する。
								// {0}：明細の番号（3）
								// エラー項目：開始時刻3
								exportCompareLog(csvStruct, lineNo, 3);
								return false;
							}
						}
					}
				}
				
				// 時刻3と時刻5の比較
				if(!isNull(csvStruct.getSTART_TIME5()) && !isNull(csvStruct.getEND_TIME5())) {
					if (compareHm(csvStruct.getSTART_TIME3(), csvStruct.getEND_TIME3()) > 0) {
						if (compareHm(csvStruct.getSTART_TIME5(), csvStruct.getSTART_TIME3()) >= 0
								|| compareHm(csvStruct.getEND_TIME5(), csvStruct.getSTART_TIME3()) > 0
								|| compareHm(csvStruct.getSTART_TIME5(), csvStruct.getEND_TIME3()) < 0
								|| compareHm(csvStruct.getEND_TIME5(), csvStruct.getEND_TIME3()) <= 0
								|| (compareHm(csvStruct.getSTART_TIME5(), csvStruct.getEND_TIME5()) > 0 && compareHm(csvStruct.getSTART_TIME5(), csvStruct.getSTART_TIME3()) < 0 && compareHm(csvStruct.getEND_TIME5(), csvStruct.getEND_TIME3()) > 0)) {
							// <エラー> AD61007 【開始時刻・終了時刻に矛盾があります。】
							// 「行番号：{0}」をメッセージに付加する。
							// {0}：明細の番号（3）
							// エラー項目：開始時刻3
							exportCompareLog(csvStruct, lineNo, 3);
							return false;

						}
					}

					if (compareHm(csvStruct.getSTART_TIME3(), csvStruct.getEND_TIME3()) <= 0) {
						if (compareHm(csvStruct.getSTART_TIME5(), csvStruct.getEND_TIME5()) > 0) {
							if (compareHm(csvStruct.getSTART_TIME5(), csvStruct.getSTART_TIME3()) <= 0
									|| compareHm(csvStruct.getSTART_TIME5(), csvStruct.getEND_TIME3()) < 0
									|| compareHm(csvStruct.getEND_TIME5(), csvStruct.getSTART_TIME3()) > 0
									|| compareHm(csvStruct.getEND_TIME5(), csvStruct.getEND_TIME3()) >= 0) {
								// <エラー> AD61007 【開始時刻・終了時刻に矛盾があります。】
								// 「行番号：{0}」をメッセージに付加する。
								// {0}：明細の番号（3）
								// エラー項目：開始時刻3
								exportCompareLog(csvStruct, lineNo, 3);
								return false;
							}
						}

					}

					if (compareHm(csvStruct.getSTART_TIME3(), csvStruct.getEND_TIME3()) <= 0) {
						if (compareHm(csvStruct.getSTART_TIME5(), csvStruct.getEND_TIME5()) <= 0) {
							if ((compareHm(csvStruct.getSTART_TIME5(), csvStruct.getSTART_TIME3()) >= 0 && compareHm(csvStruct.getSTART_TIME5(), csvStruct.getEND_TIME3()) < 0)
									|| (compareHm(csvStruct.getEND_TIME5(), csvStruct.getSTART_TIME3()) > 0 && compareHm(csvStruct.getEND_TIME5(), csvStruct.getEND_TIME3()) <= 0)
									|| (compareHm(csvStruct.getSTART_TIME5(), csvStruct.getSTART_TIME3()) <= 0) && (compareHm(csvStruct.getEND_TIME5(), csvStruct.getEND_TIME3()) >= 0)) {
								// <エラー> AD61007 【開始時刻・終了時刻に矛盾があります。】
								// 「行番号：{0}」をメッセージに付加する。
								// {0}：明細の番号（3）
								// エラー項目：開始時刻3
								exportCompareLog(csvStruct, lineNo, 3);
								return false;
							}
						}
					}
				}
			}
			
			// 明細4チェック
			if(!isNull(csvStruct.getSTART_TIME4()) && !isNull(csvStruct.getEND_TIME4())) {
				// 時刻4と時刻5の比較
				if(!isNull(csvStruct.getSTART_TIME5()) && !isNull(csvStruct.getEND_TIME5())) {
					if (compareHm(csvStruct.getSTART_TIME4(), csvStruct.getEND_TIME4()) > 0) {
						if (compareHm(csvStruct.getSTART_TIME5(), csvStruct.getSTART_TIME4()) >= 0
								|| compareHm(csvStruct.getEND_TIME5(), csvStruct.getSTART_TIME4()) > 0
								|| compareHm(csvStruct.getSTART_TIME5(), csvStruct.getEND_TIME4()) < 0
								|| compareHm(csvStruct.getEND_TIME5(), csvStruct.getEND_TIME4()) <= 0
								|| (compareHm(csvStruct.getSTART_TIME5(), csvStruct.getEND_TIME5()) > 0 && compareHm(csvStruct.getSTART_TIME5(), csvStruct.getSTART_TIME4()) < 0 && compareHm(csvStruct.getEND_TIME5(), csvStruct.getEND_TIME4()) > 0)) {
							// <エラー> AD61007 【開始時刻・終了時刻に矛盾があります。】
							// 「行番号：{0}」をメッセージに付加する。
							// {0}：明細の番号（4）
							// エラー項目：開始時刻4
							exportCompareLog(csvStruct, lineNo, 4);
							return false;
						}
					}

					if (compareHm(csvStruct.getSTART_TIME4(), csvStruct.getEND_TIME4()) <= 0) {
						if (compareHm(csvStruct.getSTART_TIME5(), csvStruct.getEND_TIME5()) > 0) {
							if (compareHm(csvStruct.getSTART_TIME5(), csvStruct.getSTART_TIME4()) <= 0
									|| compareHm(csvStruct.getSTART_TIME5(), csvStruct.getEND_TIME4()) < 0
									|| compareHm(csvStruct.getEND_TIME5(), csvStruct.getSTART_TIME4()) > 0
									|| compareHm(csvStruct.getEND_TIME5(), csvStruct.getEND_TIME4()) >= 0) {
								// <エラー> AD61007 【開始時刻・終了時刻に矛盾があります。】
								// 「行番号：{0}」をメッセージに付加する。
								// {0}：明細の番号（4）
								// エラー項目：開始時刻4
								exportCompareLog(csvStruct, lineNo, 4);
								return false;
							}
						}
					}

					if (compareHm(csvStruct.getSTART_TIME4(), csvStruct.getEND_TIME4()) <= 0) {
						if (compareHm(csvStruct.getSTART_TIME5(), csvStruct.getEND_TIME5()) <= 0) {
							if ((compareHm(csvStruct.getSTART_TIME5(), csvStruct.getSTART_TIME4()) >= 0 && compareHm(csvStruct.getSTART_TIME5(), csvStruct.getEND_TIME4()) < 0)
									|| (compareHm(csvStruct.getEND_TIME5(), csvStruct.getSTART_TIME4()) > 0 && compareHm(csvStruct.getEND_TIME5(), csvStruct.getEND_TIME4()) <= 0)
									|| (compareHm(csvStruct.getSTART_TIME5(), csvStruct.getSTART_TIME4()) <= 0) && (compareHm(csvStruct.getEND_TIME5(), csvStruct.getEND_TIME4()) >= 0)) {
								// <エラー> AD61007 【開始時刻・終了時刻に矛盾があります。】
								// 「行番号：{0}」をメッセージに付加する。
								// {0}：明細の番号（4）
								// エラー項目：開始時刻4
								exportCompareLog(csvStruct, lineNo, 4);
								return false;
							}
						}
					}
				}
			}
		} catch(Exception e) {
			return false;
		}
		
		return true;
	}
	 /**
	 *   HH24MIチェック
	 *   項目がHH24MIか判断する
	 *
	 *   @param  strInString  入力パラメータ
	 *   @return 正常:true / エラー:false
	 */
	public boolean checkTimeFormat(String strInString) {
		// 数値のinputをセット用
		try {
			int getInt = Integer.parseInt(strInString);
			int getIntbel = getInt%100;
			int getIntfrt = getInt/100;
			if(getIntfrt >= 24 || getIntfrt < 0 || getIntbel >= 60 || getIntbel < 0){
				 return false;
			}
		} catch(Exception e) {
			 return false;
		}
		// trueをセットして処理を抜ける(正常終了)
		return true;
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
	* @return 異常なし true エラー false
	*/  
	
	private boolean csvExport(AD0140010Struct targetStruct, String errTyp, int errlineNo, int errItemNo, String errItem, String errMsg) {
		AD0140010Struct errStruct = new AD0140010Struct();
		// エラー箇所
		ExpjMessage emsg = new ExpjMessage("AA01520", String.valueOf(errlineNo));
		errStruct.setl_ERROR_IN(emsg.getMessage(_locale));

		// エラー区分
		errStruct.setl_ERR_TYP(getDisplayName(_COM_ERR_TYP, errTyp));
		// エラー内容
		errStruct.setl_ERR_INFO(errMsg);
		// エラー項目名
		errStruct.setl_ERR_CTR_NM(CoreTools.getRBString(errItem, _resource));
		// 工場
		errStruct.setl_ERR_PLANT_NO(targetStruct.getPLANT_CD());
		// 日報区分
		if (isNull(targetStruct.getDAILY_WORK_REPORT_TYP()) || !checkCombValue(_DAILY_WORK_REPORT_TYP_01, targetStruct.getDAILY_WORK_REPORT_TYP())) {
			errStruct.setl_ERR_DAILY_WORK_REPORT_TYP(targetStruct.getDAILY_WORK_REPORT_TYP());
		} else {
			errStruct.setl_ERR_DAILY_WORK_REPORT_TYP(getDisplayName(_DAILY_WORK_REPORT_TYP_01, targetStruct.getDAILY_WORK_REPORT_TYP()));
		}
		

			// ユーザコード
			errStruct.setl_ERR_USER_CD(replaceSlashAdd(targetStruct.getUSER_CD2()));
			// 作業日
			errStruct.setl_ERR_OPR_DATE(targetStruct.getOPR_DATE2());
			// 勤務シフト
			errStruct.setl_ERR_WORK_SHIFT_CODE(replaceSlashAdd(targetStruct.getWORK_SHIFT_CODE2()));
			// 作業区コード1
			if (errItemNo >= CSV_USER_CD2 && errItemNo <= CSV_REMARKS1) {
				errStruct.setl_ERR_WS_CD(replaceSlashAdd(targetStruct.getWS_CD1()));
			}
			// 作業区コード2
			if (errItemNo >= CSV_WS_CD2 && errItemNo <= CSV_REMARKS2) {
				errStruct.setl_ERR_WS_CD(replaceSlashAdd(targetStruct.getWS_CD2()));
			}
			// 作業区コード3
			if (errItemNo >= CSV_WS_CD3 && errItemNo <= CSV_REMARKS3) {
				errStruct.setl_ERR_WS_CD(replaceSlashAdd(targetStruct.getWS_CD3()));
			}
			// 作業区コード4
			if (errItemNo >= CSV_WS_CD4 && errItemNo <= CSV_REMARKS4) {
				errStruct.setl_ERR_WS_CD(replaceSlashAdd(targetStruct.getWS_CD4()));
			}
			// 作業区コード5
			if (errItemNo >= CSV_WS_CD5 && errItemNo <= CSV_REMARKS5) {
				errStruct.setl_ERR_WS_CD(replaceSlashAdd(targetStruct.getWS_CD5()));
			}
//		}

		list.add(errStruct);
		return true;
	}
	/**
	 * 
	 * @param csvList
	 * @return
	 * @throws BusinessProcessException
	 * @throws FoundationException
	 */
	private boolean checkCsvData(List csvList)
			throws BusinessProcessException, FoundationException {
		// 全部レコード数
		_intTotalCount = csvList.size();
		AD0140010Struct csvStruct = new AD0140010Struct();
		try {
			for (int i = 0; i < csvList.size(); i++)	{
				csvStruct = (AD0140010Struct)csvList.get(i);
//				csvStruct.setCOMPANY_CD(getCompanyCd());
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
							, CSV_COLNO_199				// エラー項目番号
							, "Expj.Cmt3099"			// エラー項目名
							, _emsg.getMessage(_locale) // エラーメッセージ
							); 
					_intErrorCount++;
					continue;
				}
				// 日報区分、 NULLの場合
				if (isNull(csvStruct.getDAILY_WORK_REPORT_TYP())) {
					csvStruct.clear();
					csvExport(csvStruct						// 対象データ情報
							, "1"							// エラー区分
							, i + 1							// エラー発生行
							, CSV_DAILY_WORK_REPORT_TYP		// エラー項目番号
							, "Expj.DAILY_WORK_REPORT_TYP" // エラー項目名
							, new ExpjMessage("AD61016").getMessage(_locale)		// エラーメッセージ
							); 
					_intErrorCount++;
					continue;
				}
				// 日報区分、整数以外の場合
				if (!isIntegerChk(csvStruct.getDAILY_WORK_REPORT_TYP())) {
					csvStruct.clear();
					csvExport(csvStruct						// 対象データ情報
							, "1"							// エラー区分
							, i + 1							// エラー発生行
							, CSV_DAILY_WORK_REPORT_TYP		// エラー項目番号
							, "Expj.DAILY_WORK_REPORT_TYP" // エラー項目名
							, new ExpjMessage("AA01502").getMessage(_locale)		// エラーメッセージ
							); 
					_intErrorCount++;
					continue;
				}
				// 日報区分、整数 3桁以上の場合
				if (csvStruct.getDAILY_WORK_REPORT_TYP().length() >= 3) {
					csvStruct.clear();
					csvExport(csvStruct							// 対象データ情報
							, "1"								// エラー区分
							, i + 1								// エラー発生行
							, CSV_DAILY_WORK_REPORT_TYP			// エラー項目番号
							, "Expj.DAILY_WORK_REPORT_TYP"		// エラー項目名
							, new ExpjMessage("AA01501").getMessage(_locale)			// エラーメッセージ
							); 
					_intErrorCount++;
					continue;
				}
				// 日報区分
				if (!checkCombValue(_DAILY_WORK_REPORT_TYP_01, csvStruct.getDAILY_WORK_REPORT_TYP())) {
					csvStruct.clear();
					csvExport(csvStruct
							 , "1"								// エラー区分
							 , i + 1							// エラー行番号
							 , CSV_DAILY_WORK_REPORT_TYP		// エラー項目番号
							 , "Expj.DAILY_WORK_REPORT_TYP"	// エラー項目名
							 , new ExpjMessage("AA01504").getMessage(_locale));	// エラーメッセージ
					_intErrorCount++;
					continue;
				}
				
					// CSVフェイル内容チェック
					if (!checkPersonCsvData(csvStruct, i + 1)) {
						_intErrorCount++;
						continue;
					}
					// コンボボックス項目のチェック
					if (!checkCombData(csvStruct, i + 1)) {
						_intErrorCount++;
						continue;
					}
					// 登録時チェック２
					if (!checkPersonInsertData(csvStruct, i + 1)) {
						_intErrorCount++;
						continue;
					}
				}
//			}
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
			 ee.setLocale(CoreTools.getLocale(getsysUSER_CD()));
			 throw ee;
		}
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
	 * 登録時チェック２ （日報区分＝２（人日報）の場合）
	 * 
	 * @param csvStruct
	 *			　csvデータ
	 * @param lineNo
	 *			　行番号
	 * @return　true:エラーなし、false：エラーあり
	 */
	private boolean checkPersonInsertData(AD0140010Struct csvStruct, int lineNo) throws ExpjException{
		try {
			//「作業日」＞業務運用日の場合
			if (DateTool.compareYMD(csvStruct.getOPR_DATE2(), getBUSINESS_OPR_DATE()) > 0) {
				// <エラー> ZZ05103【未来の日付は指定できません。】
				// エラー項目：作業日
				csvExport(csvStruct
						 , "1"								// エラー区分
						 , lineNo							// エラー行番号
						 , CSV_OPR_DATE2					// エラー項目番号
						 , "Expj.Cmt6783"					// エラー項目名
						 , new ExpjMessage("ZZ05103").getMessage(_locale));	// エラーメッセージ
				return false;
			}
			
			//工場コード
			csvStruct.setOPR_DATE3(csvStruct.getOPR_DATE2());

			List tempList = entity.mselectM_CAL.read(conn, csvStruct);

			if (tempList.isEmpty()) {
				// <エラー> AC10005 【カレンダが存在しません。】
				// エラー項目：工場コード
				csvExport(csvStruct
						, "1"					// エラー区分
						, lineNo				// エラー行番号
						, CSV_USER_CD2			// エラー項目番号
						, "Expj.Cmt6784"		// エラー項目名
						, new ExpjMessage("AC10005").getMessage(_locale));	// エラーメッセージ
				return false;
			} else {
				AD0140010Struct tempStruct = (AD0140010Struct)tempList.get(0);
				csvStruct.setHOLIDAY_FLG(tempStruct.getHOLIDAY_FLG());
			}
			csvStruct.setWORK_SHIFT_CODE3(csvStruct.getWORK_SHIFT_CODE2());	
			if (!entity.mcheckUM_WORK_SHIFT_H.check(conn, csvStruct)) {
				// <エラー> AD61003 【勤務シフトが勤務シフトヘッダに存在しません。】 
				// エラー項目：勤務シフト
				csvExport(csvStruct
						, "1"							// エラー区分
						, lineNo						// エラー行番号
						, CSV_WORK_SHIFT_CODE2			// エラー項目番号
						, "Expj.Cmt6785"				// エラー項目名
						, new ExpjMessage("AD61003").getMessage(_locale));	// エラーメッセージ
				return false;
			}
//			csvStruct.setCOMPANY_CD2(_strCompany_cd);
			/** 明細1のチェック　*/
			csvStruct.setWS_CD6(csvStruct.getWS_CD1());
			tempList = entity.mselectM_WS_PLANT.read(conn, csvStruct);
			if (tempList.isEmpty()) {
				// <エラー> AA01003 【作業区コードが作業区に存在しません。】
				// エラー項目：作業区コード　
				csvExport(csvStruct
							, "1"					// エラー区分
							, lineNo				// エラー行番号
							, CSV_WS_CD1			// エラー項目番号
							, "Expj.Cmt6748"		// エラー項目名
							, new ExpjMessage("AA01003").getMessage(_locale));	// エラーメッセージ
				return false;
			}
			
			if (isNull(csvStruct.getSTART_TIME1()) || isNull(csvStruct.getEND_TIME1())) {
				// <エラー> AD61004 【開始時刻・終了時刻を入力して下さい。】
				// エラー項目：開始時刻
				csvExport(csvStruct
							, "1"					// エラー区分
							, lineNo				// エラー行番号
							, CSV_START_TIME1		// エラー項目番号
							, "Expj.Cmt6749"		// エラー項目名
							, new ExpjMessage("AD61004").getMessage(_locale));	// エラーメッセージ
				return false;
			} else {
				if (!checkTimeNum(csvStruct.getSTART_TIME1()) || !checkTimeNum(csvStruct.getEND_TIME1())) {
					// 開始時刻・終了時刻が１・２桁の場合
					// <エラー> AD61005
					// 【開始時刻・終了時刻を設定する場合は、3桁もしくは4桁の数字で指定してください。】
					csvExport(csvStruct
								, "1"					// エラー区分
								, lineNo				// エラー行番号
								, CSV_START_TIME1			// エラー項目番号
								, "Expj.Cmt6749"		// エラー項目名
								, new ExpjMessage("AD61005").getMessage(_locale));	// エラーメッセージ
					return false;
				}
				// 開始時刻・終了時刻
				if (!checkTimeFormat(csvStruct.getSTART_TIME1()) || !checkTimeFormat(csvStruct.getEND_TIME1())) {
					// エラー項目：開始時刻
					// 3開始時刻・終了時刻がhh24mi形式でない場合
					// <エラー> AD61006
					// 【開始時刻・終了時刻はhh24miの時刻形式で入力してください。】
					// エラー項目：開始時刻
					csvExport(csvStruct
								, "1"					// エラー区分
								, lineNo				// エラー行番号
								, CSV_START_TIME1			// エラー項目番号
								, "Expj.Cmt6749"		// エラー項目名
								, new ExpjMessage("AD61006").getMessage(_locale));	// エラーメッセージ
					return false;
				}
			}
			
			if ("0".equals(csvStruct.getUN_OPR_CAUSE_TYP1()) && (!"0".equals(csvStruct.getUN_OPR_TIME1()))) {
				// 「不作業理由１」が0：対象外 かつ、
				// （「不作業時間１」が0） の場合
				// <エラー> AD61008 【不作業理由を入力して下さい。】
				// エラー項目：不作業理由1
				csvExport(csvStruct
							, "1"					// エラー区分
							, lineNo				// エラー行番号
							, CSV_UN_OPR_CAUSE_TYP1	// エラー項目番号
							, "Expj.Cmt6752"		// エラー項目名
							, new ExpjMessage("AD61008").getMessage(_locale));	// エラーメッセージ
				return false;
			}
			
			if (!"0".equals(csvStruct.getUN_OPR_CAUSE_TYP1()) && "0".equals(csvStruct.getUN_OPR_TIME1())) {
				// 「不作業理由１」が0：対象外以外かつ、「不作業時間１」が0 の場合
				// <エラー> AD61009 【不作業時間を入力して下さい。】
				csvExport(csvStruct
							, "1"					// エラー区分
							, lineNo				// エラー行番号
							, CSV_UN_OPR_TIME1		// エラー項目番号
							, "Expj.Cmt6753"		// エラー項目名
							, new ExpjMessage("AD61009").getMessage(_locale));	// エラーメッセージ
				return false;
			}
			
			// 作業時間計算処理を行い、作業時間計算処理がエラーとなった場合
			csvStruct.setWORK_SHIFT_CODE3(csvStruct.getWORK_SHIFT_CODE2());
			csvStruct.setSTART_TIME6(csvStruct.getSTART_TIME1());
			csvStruct.setEND_TIME6(csvStruct.getEND_TIME1());
			String oprTime = getTimeCalculate(csvStruct);
			if (isNull(oprTime)) {
				csvExport(csvStruct
							, "1"						// エラー区分
							, lineNo					// エラー行番号
							, CSV_START_TIME1			// エラー項目番号
							, "Expj.Cmt6749"		// エラー項目名
							, new ExpjMessage("AD61010", csvStruct.getRETURN_MESSAGE()).getMessage(_locale));	// エラーメッセージ
				return false;
			} else {
				csvStruct.setOPR_TIME(oprTime);
			}
			
			csvStruct.setSTART_TIME6(csvStruct.getSTART_TIME1());
			csvStruct.setEND_TIME6(csvStruct.getEND_TIME1());
			if (compareHm(csvStruct.getSTART_TIME6(), csvStruct.getEND_TIME6()) > 0) {
				csvStruct.setTIME_FLG2("1");
			} else {
				csvStruct.setTIME_FLG2("2");
			}
			tempList = entity.mUT_DAILY_WORK_REPORT_2.read(conn, csvStruct);
			if (!tempList.isEmpty()) {
				// <エラー> AD61014
				// 【同一作業日で、作業時間帯が重複しているデータが既に存在します。】
				// エラー項目：開始時刻
				csvExport(csvStruct
							, "1"						// エラー区分
							, lineNo					// エラー行番号
							, CSV_START_TIME1			// エラー項目番号
							, "Expj.Cmt6749"			// エラー項目名
							, new ExpjMessage("AD61014").getMessage(_locale));	// エラーメッセージ
				return false;
			}
			
			/** 明細2のチェック　*/
			if(isNull(csvStruct.getWS_CD2()) && (!isNull(csvStruct.getSTART_TIME2()) || !isNull(csvStruct.getEND_TIME2()) || !"0".equals(csvStruct.getOPR_TYP2()))) {
				// <エラー> AD20057  【作業区コードを入力して下さい。】
				// エラー項目：作業区コード　
				csvExport(csvStruct
							, "1"					// エラー区分
							, lineNo				// エラー行番号
							, CSV_WS_CD2			// エラー項目番号
							, "Expj.CSV_SUB_WS_CD"		// エラー項目名
							, new ExpjMessage("AD20057").getMessage(_locale));	// エラーメッセージ
				return false;
			}
			
			if(!isNull(csvStruct.getWS_CD2())) {
				//作業区コード2　
				csvStruct.setWS_CD6(csvStruct.getWS_CD2());
				tempList = entity.mselectM_WS_PLANT.read(conn, csvStruct);
				if (tempList.isEmpty()) {
					// <エラー> AA01003 【作業区コードが作業区に存在しません。】
					// エラー項目：作業区コード　
					csvExport(csvStruct
								, "1"					// エラー区分
								, lineNo				// エラー行番号
								, CSV_WS_CD2			// エラー項目番号
								, "Expj.Cmt6755"		// エラー項目名
								, new ExpjMessage("AA01003").getMessage(_locale));	// エラーメッセージ
					return false;
				}
				
				if (isNull(csvStruct.getSTART_TIME2()) || isNull(csvStruct.getEND_TIME2())) {
					// <エラー> AD61004 【開始時刻・終了時刻を入力して下さい。】
					// エラー項目：開始時刻
					csvExport(csvStruct
								, "1"					// エラー区分
								, lineNo				// エラー行番号
								, CSV_START_TIME2		// エラー項目番号
								, "Expj.Cmt6756"		// エラー項目名
								, new ExpjMessage("AD61004").getMessage(_locale));	// エラーメッセージ
					return false;
				} else {
					if (!checkTimeNum(csvStruct.getSTART_TIME2()) || !checkTimeNum(csvStruct.getEND_TIME2())) {
						// 開始時刻・終了時刻が１・２桁の場合
						// <エラー> AD61005
						// 【開始時刻・終了時刻を設定する場合は、3桁もしくは4桁の数字で指定してください。】
						csvExport(csvStruct
									, "1"					// エラー区分
									, lineNo				// エラー行番号
									, CSV_START_TIME2		// エラー項目番号
									, "Expj.Cmt6756"		// エラー項目名
									, new ExpjMessage("AD61005").getMessage(_locale));	// エラーメッセージ
						return false;
					}
					// 開始時刻・終了時刻
					if (!checkTimeFormat(csvStruct.getSTART_TIME2()) || !checkTimeFormat(csvStruct.getEND_TIME2())) {
						// エラー項目：開始時刻
						// 開始時刻・終了時刻がhh24mi形式でない場合
						// <エラー> AD61006
						// 【開始時刻・終了時刻はhh24miの時刻形式で入力してください。】
						// エラー項目：開始時刻
						csvExport(csvStruct
									, "1"					// エラー区分
									, lineNo				// エラー行番号
									, CSV_START_TIME2		// エラー項目番号
									, "Expj.Cmt6756"		// エラー項目名
									, new ExpjMessage("AD61006").getMessage(_locale));	// エラーメッセージ
						return false;
					}
				}
			}
			
			if ("0".equals(csvStruct.getUN_OPR_CAUSE_TYP2()) && (!"0".equals(csvStruct.getUN_OPR_TIME2()))) {
				// 「不作業理由2」が0：対象外 かつ、
				// （「不作業時間2」が0以外） の場合
				// <エラー> AD61008 【不作業理由を入力して下さい。】
				// エラー項目：不作業理由2
				csvExport(csvStruct
							, "1"					// エラー区分
							, lineNo				// エラー行番号
							, CSV_UN_OPR_CAUSE_TYP2	// エラー項目番号
							, "Expj.Cmt6759"		// エラー項目名
							, new ExpjMessage("AD61008").getMessage(_locale));	// エラーメッセージ
				return false;
			}
			
			if (!"0".equals(csvStruct.getUN_OPR_CAUSE_TYP2()) && "0".equals(csvStruct.getUN_OPR_TIME2())) {
				// 「不作業理由2」が0：対象外以外 かつ、「不作業時間2」が 0 の場合
				// <エラー> AD61009 【不作業時間を入力して下さい。】
				csvExport(csvStruct
							, "1"					// エラー区分
							, lineNo				// エラー行番号
							, CSV_UN_OPR_TIME2		// エラー項目番号
							, "Expj.Cmt6760"		// エラー項目名
							, new ExpjMessage("AD61009").getMessage(_locale));	// エラーメッセージ
				return false;
			}
			
			// 作業時間計算処理を行い、作業時間計算処理がエラーとなった場合
			if(!isNull(csvStruct.getSTART_TIME2()) && !isNull(csvStruct.getEND_TIME2())) {
				csvStruct.setSTART_TIME6(csvStruct.getSTART_TIME2());
				csvStruct.setEND_TIME6(csvStruct.getEND_TIME2());
				String oprTime2 = getTimeCalculate(csvStruct);
				if (isNull(oprTime2)) {
					csvExport(csvStruct
								, "1"						// エラー区分
								, lineNo					// エラー行番号
								, CSV_START_TIME2			// エラー項目番号
								, "Expj.Cmt6756"			// エラー項目名
								, new ExpjMessage("AD61010", csvStruct.getRETURN_MESSAGE()).getMessage(_locale));	// エラーメッセージ
					return false;
				} else {
					oprTime = Calculate.add(oprTime, oprTime2);
					csvStruct.setOPR_TIME2(oprTime2);
				}
			} else {
				csvStruct.setOPR_TIME2(null);
			}
			// 「作業区コード2」がNull かつ「不作業理由2」が0：対象外以外の場合
			if(isNull(csvStruct.getWS_CD2()) && !"0".equals(csvStruct.getUN_OPR_CAUSE_TYP2())) {
				// <エラー> AD20057 【作業区コードを入力して下さい。】
				// エラー項目：作業区コード　
				csvExport(csvStruct
							, "1"					// エラー区分
							, lineNo				// エラー行番号
							, CSV_WS_CD2			// エラー項目番号
							, "Expj.CSV_WS_CD_02"		// エラー項目名
							, new ExpjMessage("AD20057").getMessage(_locale));	// エラーメッセージ
				return false;
			}
			
			if(!isNull(csvStruct.getSTART_TIME2()) && !isNull(csvStruct.getEND_TIME2())) {
				csvStruct.setSTART_TIME6(csvStruct.getSTART_TIME2());
				csvStruct.setEND_TIME6(csvStruct.getEND_TIME2());
				if (compareHm(csvStruct.getSTART_TIME6(), csvStruct.getEND_TIME6()) > 0) {
					csvStruct.setTIME_FLG2("1");
				} else {
					csvStruct.setTIME_FLG2("2");
				}
				tempList = entity.mUT_DAILY_WORK_REPORT_2.read(conn, csvStruct);
				if (!tempList.isEmpty()) {
					// <エラー> AD61014
					// 【同一作業日で、作業時間帯が重複しているデータが既に存在します。】
					// エラー項目：開始時刻
					csvExport(csvStruct
								, "1"						// エラー区分
								, lineNo					// エラー行番号
								, CSV_START_TIME2			// エラー項目番号
								, "Expj.Cmt6756"			// エラー項目名
								, new ExpjMessage("AD61014").getMessage(_locale));	// エラーメッセージ
					return false;
				}
			}
			
			/** 明細3のチェック　*/
			if(isNull(csvStruct.getWS_CD3()) && (!isNull(csvStruct.getSTART_TIME3()) || !isNull(csvStruct.getEND_TIME3()) || !"0".equals(csvStruct.getOPR_TYP3()))) {
				// <エラー> AD20057 【作業区コードを入力して下さい。】
				// エラー項目：作業区コード　
				csvExport(csvStruct
							, "1"					// エラー区分
							, lineNo				// エラー行番号
							, CSV_WS_CD3			// エラー項目番号
							 , "Expj.CSV_SUB_WS_CD"		// エラー項目名
							 , new ExpjMessage("AD20057").getMessage(_locale));	// エラーメッセージ
				return false;
			}
			
			if(!isNull(csvStruct.getWS_CD3())) {
				//作業区コード3　
				csvStruct.setWS_CD6(csvStruct.getWS_CD3());
				tempList = entity.mselectM_WS_PLANT.read(conn, csvStruct);
				if (tempList.isEmpty()) {
					// <エラー> AA01003 【作業区コードが作業区に存在しません。】
					// エラー項目：作業区コード　
					csvExport(csvStruct
								, "1"					// エラー区分
								, lineNo				// エラー行番号
								, CSV_WS_CD3			// エラー項目番号
								, "Expj.Cmt6762"		// エラー項目名
								, new ExpjMessage("AA01003").getMessage(_locale));	// エラーメッセージ
					return false;
				}
				if (isNull(csvStruct.getSTART_TIME3()) || isNull(csvStruct.getEND_TIME3())) {
					// <エラー> AD61004 【開始時刻・終了時刻を入力して下さい。】
					// エラー項目：開始時刻
					csvExport(csvStruct
								, "1"					// エラー区分
								, lineNo				// エラー行番号
								, CSV_START_TIME3		// エラー項目番号
								, "Expj.Cmt6763"		// エラー項目名
								, new ExpjMessage("AD61004").getMessage(_locale));	// エラーメッセージ
					return false;
				} else {
					if (!checkTimeNum(csvStruct.getSTART_TIME3()) || !checkTimeNum(csvStruct.getEND_TIME3())) {
						// 開始時刻・終了時刻が１・２桁の場合
						// <エラー> AD61005
						// 【開始時刻・終了時刻を設定する場合は、3桁もしくは4桁の数字で指定してください。】
						csvExport(csvStruct
									, "1"					// エラー区分
									, lineNo				// エラー行番号
									, CSV_START_TIME3		// エラー項目番号
									, "Expj.Cmt6763"		// エラー項目名
									, new ExpjMessage("AD61005").getMessage(_locale));	// エラーメッセージ
						return false;
					}
					// 開始時刻・終了時刻
					if (!checkTimeFormat(csvStruct.getSTART_TIME3()) || !checkTimeFormat(csvStruct.getEND_TIME3())) {
						// エラー項目：開始時刻
						// 開始時刻・終了時刻がhh24mi形式でない場合
						// <エラー> AD61006
						// 【開始時刻・終了時刻はhh24miの時刻形式で入力してください。】
						// エラー項目：開始時刻
						csvExport(csvStruct
									, "1"					// エラー区分
									, lineNo				// エラー行番号
									, CSV_START_TIME3		// エラー項目番号
									, "Expj.Cmt6763"		// エラー項目名
									, new ExpjMessage("AD61006").getMessage(_locale));	// エラーメッセージ
						return false;
					}
				}
			}
			
			if ("0".equals(csvStruct.getUN_OPR_CAUSE_TYP3()) && (!"0".equals(csvStruct.getUN_OPR_TIME3()))) {
				// 「不作業理由3」が0：対象外 かつ、
				// （「不作業時間3」が0以外） の場合
				// <エラー> AD61008 【不作業理由を入力して下さい。】
				// エラー項目：不作業理由1
				csvExport(csvStruct
							, "1"					// エラー区分
							, lineNo				// エラー行番号
							, CSV_UN_OPR_CAUSE_TYP3	// エラー項目番号
							, "Expj.Cmt6766"		// エラー項目名
							, new ExpjMessage("AD61008").getMessage(_locale));	// エラーメッセージ
				return false;
			}
			
			if (!"0".equals(csvStruct.getUN_OPR_CAUSE_TYP3()) && "0".equals(csvStruct.getUN_OPR_TIME3())) {
				// 「不作業理由3」が0：対象外　以外 かつ、「不作業時間3」が0 の場合
				// <エラー> AD61009 【不作業時間を入力して下さい。】
				csvExport(csvStruct
							, "1"					// エラー区分
							, lineNo				// エラー行番号
							, CSV_UN_OPR_TIME3		// エラー項目番号
							, "Expj.Cmt6767"		// エラー項目名
							, new ExpjMessage("AD61009").getMessage(_locale));	// エラーメッセージ
				return false;
			}
			
			// 作業時間計算処理を行い、作業時間計算処理がエラーとなった場合
			if(!isNull(csvStruct.getSTART_TIME3()) && !isNull(csvStruct.getEND_TIME3())) {
				csvStruct.setSTART_TIME6(csvStruct.getSTART_TIME3());
				csvStruct.setEND_TIME6(csvStruct.getEND_TIME3());
				String oprTime3 = getTimeCalculate(csvStruct);
				if (isNull(oprTime3)) {
					csvExport(csvStruct
								, "1"						// エラー区分
								, lineNo					// エラー行番号
								, CSV_START_TIME3			// エラー項目番号
								, "Expj.Cmt6763"			// エラー項目名
								, new ExpjMessage("AD61010", csvStruct.getRETURN_MESSAGE()).getMessage(_locale));	// エラーメッセージ
					return false;
				} else {
					oprTime = Calculate.add(oprTime, oprTime3);
					csvStruct.setOPR_TIME3(oprTime3);
				}
			} else {
				csvStruct.setOPR_TIME3(null);
			}
			// 「作業区コード3」がNull かつ、「不作業理由」が0：対象外　以外の場合
			if(isNull(csvStruct.getWS_CD3()) && !"0".equals(csvStruct.getUN_OPR_CAUSE_TYP3())) {
				// <エラー> AD20057 【作業区コードを入力して下さい。】
				// エラー項目：作業区コード　
				csvExport(csvStruct
							, "1"					// エラー区分
							, lineNo				// エラー行番号
							, CSV_WS_CD3			// エラー項目番号
							, "Expj.CSV_WS_CD_03"		// エラー項目名
							, new ExpjMessage("AD20057").getMessage(_locale));	// エラーメッセージ
				return false;
			}
			
			if(!isNull(csvStruct.getSTART_TIME3()) && !isNull(csvStruct.getEND_TIME3())) {
				csvStruct.setSTART_TIME6(csvStruct.getSTART_TIME3());
				csvStruct.setEND_TIME6(csvStruct.getEND_TIME3());
				if (compareHm(csvStruct.getSTART_TIME6(), csvStruct.getEND_TIME6()) > 0) {
					csvStruct.setTIME_FLG2("1");
				} else {
					csvStruct.setTIME_FLG2("2");
				}
				tempList = entity.mUT_DAILY_WORK_REPORT_2.read(conn, csvStruct);
				if (!tempList.isEmpty()) {
					// <エラー> AD61014
					// 【同一作業日で、作業時間帯が重複しているデータが既に存在します。】
					// エラー項目：開始時刻
					csvExport(csvStruct
								, "1"						// エラー区分
								, lineNo					// エラー行番号
								, CSV_START_TIME3			// エラー項目番号
								, "Expj.Cmt6763"			// エラー項目名
								, new ExpjMessage("AD61014").getMessage(_locale));	// エラーメッセージ
					return false;
				}
			}
			
			/** 明細4のチェック　*/
			if(isNull(csvStruct.getWS_CD4()) && (!isNull(csvStruct.getSTART_TIME4()) || !isNull(csvStruct.getEND_TIME4()) || !"0".equals(csvStruct.getOPR_TYP4()))) {
				// <エラー> AD20057 【作業区コードを入力して下さい。】
				// エラー項目：作業区コード　
				csvExport(csvStruct
							, "1"					// エラー区分
							, lineNo				// エラー行番号
							, CSV_WS_CD4			// エラー項目番号
							, "Expj.CSV_SUB_WS_CD"		// エラー項目名
							, new ExpjMessage("AD20057").getMessage(_locale));	// エラーメッセージ
				return false;
			}
			
			if(!isNull(csvStruct.getWS_CD4())) {
				//作業区コード4　
				csvStruct.setWS_CD6(csvStruct.getWS_CD4());
				tempList = entity.mselectM_WS_PLANT.read(conn, csvStruct);
				if (tempList.isEmpty()) {
					// <エラー> AA01003 【作業区コードが作業区に存在しません。】
					// エラー項目：作業区コード　
					csvExport(csvStruct
								, "1"					// エラー区分
								, lineNo				// エラー行番号
								, CSV_WS_CD4			// エラー項目番号
								, "Expj.Cmt6769"		// エラー項目名
								, new ExpjMessage("AA01003").getMessage(_locale));	// エラーメッセージ
					return false;
				}
				if (isNull(csvStruct.getSTART_TIME4()) || isNull(csvStruct.getEND_TIME4())) {
					// <エラー> AD61004 【開始時刻・終了時刻を入力して下さい。】
					// エラー項目：開始時刻
					csvExport(csvStruct
								, "1"					// エラー区分
								, lineNo				// エラー行番号
								, CSV_START_TIME4		// エラー項目番号
								, "Expj.Cmt6770"		// エラー項目名
								, new ExpjMessage("AD61004").getMessage(_locale));	// エラーメッセージ
					return false;
				} else {
					if (!checkTimeNum(csvStruct.getSTART_TIME4()) || !checkTimeNum(csvStruct.getEND_TIME4())) {
						// 2開始時刻・終了時刻が１・２桁の場合
						// <エラー> AD61005
						// 【開始時刻・終了時刻を設定する場合は、3桁もしくは4桁の数字で指定してください。】
						csvExport(csvStruct
									, "1"					// エラー区分
									, lineNo				// エラー行番号
									, CSV_START_TIME4		// エラー項目番号
									, "Expj.Cmt6770"		// エラー項目名
									, new ExpjMessage("AD61005").getMessage(_locale));	// エラーメッセージ
						return false;
					}
					// 開始時刻・終了時刻
					if (!checkTimeFormat(csvStruct.getSTART_TIME4()) || !checkTimeFormat(csvStruct.getEND_TIME4())) {
						// エラー項目：開始時刻
						// 開始時刻・終了時刻がhh24mi形式でない場合
						// <エラー> AD61006
						// 【開始時刻・終了時刻はhh24miの時刻形式で入力してください。】
						// エラー項目：開始時刻
						csvExport(csvStruct
									, "1"					// エラー区分
									, lineNo				// エラー行番号
									, CSV_START_TIME4		// エラー項目番号
									, "Expj.Cmt6770"		// エラー項目名
									, new ExpjMessage("AD61006").getMessage(_locale));	// エラーメッセージ
						return false;
					}
				}
			}
			
			if ("0".equals(csvStruct.getUN_OPR_CAUSE_TYP4()) && (!"0".equals(csvStruct.getUN_OPR_TIME4()))) {
				// 「不作業理由4」が0：対象外 かつ、
				// （「不作業時間4」が0以外） の場合
				// <エラー> AD61008 【不作業理由を入力して下さい。】
				// エラー項目：不作業理由4
				csvExport(csvStruct
							, "1"					// エラー区分
							, lineNo				// エラー行番号
							, CSV_UN_OPR_CAUSE_TYP4	// エラー項目番号
							, "Expj.Cmt6773"		// エラー項目名
							, new ExpjMessage("AD61008").getMessage(_locale));	// エラーメッセージ
				return false;
			}
			
			if (!"0".equals(csvStruct.getUN_OPR_CAUSE_TYP4()) && "0".equals(csvStruct.getUN_OPR_TIME4())) {
				// 「不作業理由4」が0：対象外以外 かつ、「不作業時間4」が 0 の場合
				// <エラー> AD61009 【不作業時間を入力して下さい。】
				csvExport(csvStruct
							, "1"					// エラー区分
							, lineNo				// エラー行番号
							, CSV_UN_OPR_TIME4		// エラー項目番号
							, "Expj.Cmt6774"		// エラー項目名
							, new ExpjMessage("AD61009").getMessage(_locale));	// エラーメッセージ
				return false;
			}
			
			// 作業時間計算処理を行い、作業時間計算処理がエラーとなった場合
			if(!isNull(csvStruct.getSTART_TIME4()) && !isNull(csvStruct.getEND_TIME4())) {
				csvStruct.setSTART_TIME6(csvStruct.getSTART_TIME4());
				csvStruct.setEND_TIME6(csvStruct.getEND_TIME4());
				String oprTime4 = getTimeCalculate(csvStruct);
				if (isNull(oprTime4)) {
					csvExport(csvStruct
								, "1"						// エラー区分
								, lineNo					// エラー行番号
								, CSV_START_TIME4			// エラー項目番号
								, "Expj.Cmt6770"			// エラー項目名
								, new ExpjMessage("AD61010", csvStruct.getRETURN_MESSAGE()).getMessage(_locale));	// エラーメッセージ
					return false;
				} else {
					oprTime = Calculate.add(oprTime, oprTime4);
					csvStruct.setOPR_TIME4(oprTime4);
				}
			} else{
				csvStruct.setOPR_TIME4(null);
			}
			
			if(isNull(csvStruct.getWS_CD4()) && !"0".equals(csvStruct.getUN_OPR_CAUSE_TYP4())) {
				// <エラー> AD20057 【作業区コードを入力して下さい。】
				// エラー項目：作業区コード　
				csvExport(csvStruct
							, "1"					// エラー区分
							, lineNo				// エラー行番号
							, CSV_WS_CD4			// エラー項目番号
							, "Expj.CSV_SUB_WS_CD"		// エラー項目名
							, new ExpjMessage("AD20057").getMessage(_locale));	// エラーメッセージ
				return false;
			}
			
			if(!isNull(csvStruct.getSTART_TIME4()) && !isNull(csvStruct.getEND_TIME4())) {
				csvStruct.setSTART_TIME6(csvStruct.getSTART_TIME4());
				csvStruct.setEND_TIME6(csvStruct.getEND_TIME4());
				if (compareHm(csvStruct.getSTART_TIME6(), csvStruct.getEND_TIME6()) > 0) {
					csvStruct.setTIME_FLG2("1");
				} else {
					csvStruct.setTIME_FLG2("2");
				}
				tempList = entity.mUT_DAILY_WORK_REPORT_2.read(conn, csvStruct);
				if (!tempList.isEmpty()) {
					// <エラー> AD61014
					// 【同一作業日で、作業時間帯が重複しているデータが既に存在します。】
					// エラー項目：開始時刻
					csvExport(csvStruct
								, "1"						// エラー区分
								, lineNo					// エラー行番号
								, CSV_START_TIME4			// エラー項目番号
								, "Expj.Cmt6770"			// エラー項目名
								, new ExpjMessage("AD61014").getMessage(_locale));	// エラーメッセージ
					return false;
				}
			}
			
			/** 明細5のチェック　*/
			if(isNull(csvStruct.getWS_CD5()) && (!isNull(csvStruct.getSTART_TIME5()) || !isNull(csvStruct.getEND_TIME5()) || !"0".equals(csvStruct.getOPR_TYP5()))) {
				// <エラー> AD20057 【作業区コードを入力して下さい。】
				// エラー項目：作業区コード　
				csvExport(csvStruct
							, "1"					// エラー区分
							, lineNo				// エラー行番号
							, CSV_WS_CD5			// エラー項目番号
							, "Expj.CSV_SUB_WS_CD"		// エラー項目名
							, new ExpjMessage("AD20057").getMessage(_locale));	// エラーメッセージ
				return false;
			}
			
			if(!isNull(csvStruct.getWS_CD5())) {
				//作業区コード5　
				csvStruct.setWS_CD6(csvStruct.getWS_CD5());
				tempList = entity.mselectM_WS_PLANT.read(conn, csvStruct);
				if (tempList.isEmpty()) {
					// <エラー> AA01003 【作業区コードが作業区に存在しません。】
					// エラー項目：作業区コード　
					csvExport(csvStruct
								, "1"					// エラー区分
								, lineNo				// エラー行番号
								, CSV_WS_CD5			// エラー項目番号
								, "Expj.Cmt6776"		// エラー項目名
								, new ExpjMessage("AA01003").getMessage(_locale));	// エラーメッセージ
					return false;
				}
				if (isNull(csvStruct.getSTART_TIME5()) || isNull(csvStruct.getEND_TIME5())) {
					// <エラー> AD61004 【開始時刻・終了時刻を入力して下さい。】
					// エラー項目：開始時刻
					csvExport(csvStruct
								, "1"					// エラー区分
								, lineNo				// エラー行番号
								, CSV_START_TIME5		// エラー項目番号
								, "Expj.Cmt6777"		// エラー項目名
								, new ExpjMessage("AD61004").getMessage(_locale));	// エラーメッセージ
					return false;
				} else {
					if (!checkTimeNum(csvStruct.getSTART_TIME5()) || !checkTimeNum(csvStruct.getEND_TIME5())) {
						// 2開始時刻・終了時刻が１・２桁の場合
						// <エラー> AD61005
						// 【開始時刻・終了時刻を設定する場合は、3桁もしくは4桁の数字で指定してください。】
						csvExport(csvStruct
									, "1"					// エラー区分
									, lineNo				// エラー行番号
									, CSV_START_TIME5		// エラー項目番号
									, "Expj.Cmt6777"		// エラー項目名
									, new ExpjMessage("AD61005").getMessage(_locale));	// エラーメッセージ
						return false;
					}
					// 開始時刻・終了時刻
					if (!checkTimeFormat(csvStruct.getSTART_TIME5()) || !checkTimeFormat(csvStruct.getEND_TIME5())) {
						// エラー項目：開始時刻
						// 3開始時刻・終了時刻がhh24mi形式でない場合
						// <エラー> AD61006
						// 【開始時刻・終了時刻はhh24miの時刻形式で入力してください。】
						// エラー項目：開始時刻
						csvExport(csvStruct
									, "1"					// エラー区分
									, lineNo				// エラー行番号
									, CSV_START_TIME5		// エラー項目番号
									, "Expj.Cmt6777"		// エラー項目名
									, new ExpjMessage("AD61006").getMessage(_locale));	// エラーメッセージ
						return false;
					}
				}
			}
			
			if ("0".equals(csvStruct.getUN_OPR_CAUSE_TYP5()) && (!"0".equals(csvStruct.getUN_OPR_TIME5()))) {
				// 「不作業理由5」が0：対象外  かつ、
				// （「不作業時間5」が0以外） の場合
				// <エラー> AD61008 【不作業理由を入力して下さい。】
				// エラー項目：不作業理由1
				csvExport(csvStruct
							, "1"					// エラー区分
							, lineNo				// エラー行番号
							, CSV_UN_OPR_CAUSE_TYP5	// エラー項目番号
							, "Expj.Cmt6780"		// エラー項目名
							, new ExpjMessage("AD61008").getMessage(_locale));	// エラーメッセージ
				return false;
			}
			
			if (!"0".equals(csvStruct.getUN_OPR_CAUSE_TYP5()) && "0".equals(csvStruct.getUN_OPR_TIME5())) {
				// 「不作業理由5」が0：対象外　以外 かつ、「不作業時間5」が 0 の場合
				// <エラー> AD61009 【不作業時間を入力して下さい。】
				csvExport(csvStruct
						, "1"					// エラー区分
						, lineNo				// エラー行番号
						, CSV_UN_OPR_TIME5		// エラー項目番号
						, "Expj.Cmt6781"		// エラー項目名
						, new ExpjMessage("AD61009").getMessage(_locale));	// エラーメッセージ
				return false;
			}
			
			// 作業時間計算処理を行い、作業時間計算処理がエラーとなった場合
			if(!isNull(csvStruct.getSTART_TIME5()) && !isNull(csvStruct.getEND_TIME5())) {
				csvStruct.setSTART_TIME6(csvStruct.getSTART_TIME5());
				csvStruct.setEND_TIME6(csvStruct.getEND_TIME5());
				String oprTime5 = getTimeCalculate(csvStruct);
				if (isNull(oprTime5)) {
					csvExport(csvStruct
								, "1"						// エラー区分
								, lineNo					// エラー行番号
								, CSV_START_TIME5			// エラー項目番号
								, "Expj.Cmt6777"			// エラー項目名
								, new ExpjMessage("AD61010", csvStruct.getRETURN_MESSAGE()).getMessage(_locale));	// エラーメッセージ
					return false;
				} else {
					oprTime = Calculate.add(oprTime, oprTime5);
					csvStruct.setOPR_TIME5(oprTime5);
				}
			} else {
				csvStruct.setOPR_TIME5(null);
			}
			
			if(isNull(csvStruct.getWS_CD5()) && !"0".equals(csvStruct.getUN_OPR_CAUSE_TYP5())) {
				// <エラー> AD20057 【作業区コードを入力して下さい。】
				// エラー項目：作業区コード　
				csvExport(csvStruct
							, "1"					// エラー区分
							, lineNo				// エラー行番号
							, CSV_WS_CD5			// エラー項目番号
							, "Expj.Cmt6776"		// エラー項目名
							, new ExpjMessage("AD20057").getMessage(_locale));	// エラーメッセージ
				return false;
			}
			
			if(!isNull(csvStruct.getSTART_TIME5()) && !isNull(csvStruct.getEND_TIME5())) {
				csvStruct.setSTART_TIME6(csvStruct.getSTART_TIME5());
				csvStruct.setEND_TIME6(csvStruct.getEND_TIME5());
				if (compareHm(csvStruct.getSTART_TIME6(), csvStruct.getEND_TIME6()) > 0) {
					csvStruct.setTIME_FLG2("1");
				} else {
					csvStruct.setTIME_FLG2("2");
				}
				tempList = entity.mUT_DAILY_WORK_REPORT_2.read(conn, csvStruct);
				if (!tempList.isEmpty()) {
					// <エラー> AD61014
					// 【同一作業日で、作業時間帯が重複しているデータが既に存在します。】
					// エラー項目：開始時刻
					csvExport(csvStruct
								, "1"						// エラー区分
								, lineNo					// エラー行番号
								, CSV_START_TIME5			// エラー項目番号
								, "Expj.Cmt6777"			// エラー項目名
								, new ExpjMessage("AD61014").getMessage(_locale));	// エラーメッセージ
					return false;
				}
			}
		
			// 「時刻1」～「時刻5」が他の同一キーと重なってる場合
			if(!checkTimeDuplicate(csvStruct, lineNo)) {
				return false;
			}
			
			if (Calculate.compare(oprTime, _MAX_OPR_TIME) > 0) {
				// <エラー> AD61012 【作業時間が上限を超えています。】
				// エラー項目：開始時刻
				csvExport(csvStruct
							, "1"						// エラー区分
							, lineNo					// エラー行番号
							, CSV_START_TIME1			// エラー項目番号
							, "Expj.Cmt6749"			// エラー項目名
							, new ExpjMessage("AD61012").getMessage(_locale));// エラーメッセージ
				return false;
			} else {
				csvStruct.setTOTAL_OPR_TIME(oprTime);
			}
			
			if ("1".equals(csvStruct.getHOLIDAY_FLG())) {
				// <ワーニング> AD61013 【入力された日付は稼働日ではありません。】
				// エラー項目：ユーザコード（人日報）
				csvExport(csvStruct					// 対象データ情報
						, "2"						// エラー区分
						, lineNo					// エラー発生行
						, CSV_OPR_DATE2				// エラー項目番号
						,"Expj.Cmt6783"			// エラー項目名
						,new ExpjMessage("AD61013").getMessage(_locale));	// エラーメッセージ
				_intWarningCount++;
			}
		} catch(Exception e) {
			 ExpjMessage emsg = new ExpjMessage( "ZZ01106");
			 sysLog.severe(emsg, getsysUSER_CD());
			 ExpjException ee = new ExpjException(e, emsg);
			 ee.setLocale(CoreTools.getLocale(getsysUSER_CD()));
			 throw ee;
		}
		
		return true;
	}
	
	/**
	 * 日期桁数チェック
	 * @param date 日期桁数
	 * @return　
	 */
	private boolean checkTimeNum (String date){
		if (date.length() != 3 && date.length() != 4) {
			return false;
		} 
		return true;
	}
	
	/**
	 * CSVフェイル内容チェック（日報区分＝２（人日報）の場合）
	 * @param csvStruct CSVフェイル内容
	 * @throws DataNotFoundException 
	 * @throws SQLException 
	 * @throws ParseException 
	 * @throws FoundationException 
	 */
	private boolean checkPersonCsvData(AD0140010Struct csvStruct, int index) throws ExpjException {
		try {
			// ユーザコード（人日報）、NULLの場合
			if (isNull(csvStruct.getUSER_CD2())){
				csvExport(csvStruct					// 対象データ情報
						, "1"						// エラー区分
						, index						// エラー発生行
						, CSV_USER_CD2				// エラー項目番号
						, "Expj.Cmt6784"			// エラー項目名
						,new ExpjMessage("AD61017").getMessage(_locale)	// エラーメッセージ
						); 
				return false;
			}
			
			// ユーザコード（人日報）、文字26桁の場合
			if (strLengthChk(csvStruct.getUSER_CD2()) >= 26) {
				csvExport(csvStruct					// 対象データ情報
						, "1"						// エラー区分
						, index						// エラー発生行
						, CSV_USER_CD2				// エラー項目番号
						, "Expj.Cmt6784"			// エラー項目名
						,new ExpjMessage("AA01501").getMessage(_locale)	// エラーメッセージ
						);  
				return false;
			}
			// ユーザコード、【禁則文字（「%」、「_」、「\」）が含まれています。】
			if (chkHankaku(csvStruct.getUSER_CD2())) {
				csvExport(csvStruct					// 対象データ情報
						, "1"						// エラー区分
						, index						// エラー発生行
						, CSV_USER_CD2				// エラー項目番号
						, "Expj.Cmt6784"			// エラー項目名
						, new ExpjMessage("AA01524").getMessage(_locale)	// エラーメッセージ
						); 
				return false;
			}
			// ユーザコード（人日報）を基に[ユーザマスタ].“工場コード”
			List tempList = entity.mselectUSER_MST.read(conn, csvStruct);
			if(!tempList.isEmpty()) {
				AD0140010Struct tempStruct = (AD0140010Struct)tempList.get(0);
				csvStruct.setPLANT_CD(tempStruct.getPLANT_CD());
			} else {
				csvStruct.setPLANT_CD(sysPLANT_CD);
			}
			
			// 作業日（人日報）、 NULLの場合
			if (isNull(csvStruct.getOPR_DATE2())) {
				csvExport(csvStruct					// 対象データ情報
						, "1"						// エラー区分
						, index						// エラー発生行
						, CSV_OPR_DATE2				// エラー項目番号
						, "Expj.Cmt6783"			// エラー項目名
						, new ExpjMessage("AD20059").getMessage(_locale)	// エラーメッセージ
						); 
				return false;
			}
			// 作業日（人日報）日付フォーマット文字列でない場合
			if (!checkDate(csvStruct.getOPR_DATE2())) {
				csvExport(csvStruct					// 対象データ情報
						, "1"						// エラー区分
						, index						// エラー発生行
						, CSV_OPR_DATE2				// エラー項目番号
						, "Expj.Cmt6783"			// エラー項目名
						, new ExpjMessage("AA01606").getMessage(_locale)	// エラーメッセージ
						); 
				return false;
			}
			// 勤務シフト（人日報）、NULLの場合
			if( isNull(csvStruct.getWORK_SHIFT_CODE2())) {
				csvExport(csvStruct					// 対象データ情報
						, "1"						// エラー区分
						, index						// エラー発生行
						, CSV_WORK_SHIFT_CODE2		// エラー項目番号
						, "Expj.Cmt6785"			// エラー項目名
						,new ExpjMessage("AD61015").getMessage(_locale)	// エラーメッセージ
						);  
				return false;
			}
			// 勤務シフト、文字26桁の場合
			if (strLengthChk(csvStruct.getWORK_SHIFT_CODE2()) >= 26) {
				csvExport(csvStruct					// 対象データ情報
						, "1"						// エラー区分
						, index						// エラー発生行
						, CSV_WORK_SHIFT_CODE2		// エラー項目番号
						, "Expj.Cmt6785"			// エラー項目名
						, new ExpjMessage("AA01501").getMessage(_locale)	// エラーメッセージ
						);  
				return false;
			}
			// 勤務シフト、【禁則文字（「%」、「_」、「\」）が含まれています。】
			if (chkHankaku(csvStruct.getWORK_SHIFT_CODE2())) {
				csvExport(csvStruct					// 対象データ情報
						, "1"						// エラー区分
						, index						// エラー発生行
						, CSV_WORK_SHIFT_CODE2		// エラー項目番号
						, "Expj.Cmt6785"			// エラー項目名
						, new ExpjMessage("AA01524").getMessage(_locale)	// エラーメッセージ
						);  
				return false;
			}
			// 作業区コード1 、NULLの場合
			if (isNull(csvStruct.getWS_CD1())){
				csvExport(csvStruct					// 対象データ情報
						, "1"						// エラー区分
						, index						// エラー発生行
						, CSV_WS_CD1				// エラー項目番号
						, "Expj.CSV_WS_CD_01"			// エラー項目名
						, new ExpjMessage("AD20057").getMessage(_locale)	// エラーメッセージ
						);  
				return false;
			} 
			//作業区コード1 、文字26桁以上の場合、
			if (strLengthChk(csvStruct.getWS_CD1()) >= 26) {
				csvExport(csvStruct					// 対象データ情報
						, "1"						// エラー区分
						, index						// エラー発生行
						, CSV_WS_CD1				// エラー項目番号
						, "Expj.CSV_WS_CD_01"			// エラー項目名
						, new ExpjMessage("AA01501").getMessage(_locale)	// エラーメッセージ
						); 
				return false;
			}
			// 作業区コード1 【禁則文字（「%」、「_」、「\」）が含まれています。】
			if (chkHankaku(csvStruct.getWS_CD1())){
				csvExport(csvStruct					// 対象データ情報
						, "1"						// エラー区分
						, index						// エラー発生行
						, CSV_WS_CD1				// エラー項目番号
						, "Expj.CSV_WS_CD_01"			// エラー項目名
						, new ExpjMessage("AA01524").getMessage(_locale)	// エラーメッセージ
						);  
				return false;
			} 
			if (!isNull(csvStruct.getSTART_TIME1())) {
				// 開始時刻1、数字以外の場合
				if (!isDigitChk(csvStruct.getSTART_TIME1())){
					csvExport(csvStruct						// 対象データ情報
							, "1"							// エラー区分
							, index							// エラー発生行
							, CSV_START_TIME1				// エラー項目番号
							, "Expj.Cmt6749"				// エラー項目名
							, new ExpjMessage("AA01503").getMessage(_locale)	// エラーメッセージ
							); 
					return false;
				}
				// 開始時刻1、数字2桁以下、または5桁以上の場合
				if (csvStruct.getSTART_TIME1().length() >= 5 || csvStruct.getSTART_TIME1().length() <= 2){
					csvExport(csvStruct					// 対象データ情報
							, "1"						// エラー区分
							, index						// エラー発生行
							, CSV_START_TIME1			// エラー項目番号
							, "Expj.Cmt6749"			// エラー項目名
							, new ExpjMessage("AS00019").getMessage(_locale)	// エラーメッセージ
							); 
					return false;
				}
			}
			if (!isNull(csvStruct.getEND_TIME1())) {
				// 終了時刻1、数字以外の場合
				if (!isDigitChk(csvStruct.getEND_TIME1())){
					csvExport(csvStruct					// 対象データ情報
							, "1"						// エラー区分
							, index						// エラー発生行
							, CSV_END_TIME1				// エラー項目番号
							, "Expj.Cmt6750"			// エラー項目名
							, new ExpjMessage("AA01503").getMessage(_locale)	// エラーメッセージ
							); 
					return false;
				}
				// 終了時刻1、数字2桁以下、または5桁以上の場合
				if (csvStruct.getEND_TIME1().length() >= 5 || csvStruct.getEND_TIME1().length() <= 2){
					csvExport(csvStruct					// 対象データ情報
							, "1"						// エラー区分
							, index						// エラー発生行
							, CSV_END_TIME1				// エラー項目番号
							, "Expj.Cmt6750"			// エラー項目名
							, new ExpjMessage("AS00019").getMessage(_locale)	// エラーメッセージ
							); 
					return false;
				}
			}
			// 作業区分1、整数以外の場合
			if (!isIntegerChk(csvStruct.getOPR_TYP1())){
				csvExport(csvStruct					// 対象データ情報
						, "1"						// エラー区分
						, index						// エラー発生行
						, CSV_OPR_TYP1				// エラー項目番号
						, "Expj.Cmt6751"			// エラー項目名
						, new ExpjMessage("AA01502").getMessage(_locale)	// エラーメッセージ
						); 
				return false;
			}
			// 作業区分1、整数 3桁以上の場合
			if (csvStruct.getOPR_TYP1().length() >= 3) {
				csvExport(csvStruct					// 対象データ情報
						, "1"						// エラー区分
						, index						// エラー発生行
						, CSV_OPR_TYP1				// エラー項目番号
						, "Expj.Cmt6751"			// エラー項目名
						, new ExpjMessage("AA01501").getMessage(_locale)	// エラーメッセージ
						); 
				return false;
			}
			// 不作業理由区分1、整数以外の場合
			if (!isIntegerChk(csvStruct.getUN_OPR_CAUSE_TYP1())){
				csvExport(csvStruct					// 対象データ情報
						, "1"						// エラー区分
						, index						// エラー発生行
						, CSV_UN_OPR_CAUSE_TYP1		// エラー項目番号
						, "Expj.Cmt6752"			// エラー項目名
						, new ExpjMessage("AA01502").getMessage(_locale)	// エラーメッセージ
						);
				
				return false;
			}
			// 不作業理由区分1、整数 3桁以上の場合
			if (csvStruct.getUN_OPR_CAUSE_TYP1().length() >= 3) {
				csvExport(csvStruct					// 対象データ情報
						, "1"						// エラー区分
						, index						// エラー発生行
						, CSV_UN_OPR_CAUSE_TYP1		// エラー項目番号
						, "Expj.Cmt6752"			// エラー項目名
						, new ExpjMessage("AA01501").getMessage(_locale)	// エラーメッセージ
						); 
				return false;
			}
			// 不作業時間（分）1、数値以外の場合
			if (!isNumChk(csvStruct.getUN_OPR_TIME1())){
				csvExport(csvStruct					// 対象データ情報
						, "1"						// エラー区分
						, index						// エラー発生行
						, CSV_UN_OPR_TIME1			// エラー項目番号
						, "Expj.Cmt6753"			// エラー項目名
						, new ExpjMessage("AA01503").getMessage(_locale)	// エラーメッセージ
						); 
				return false;
			}
			// 不作業時間（分）1、0未満の場合
			if (Calculate.compare(csvStruct.getUN_OPR_TIME1(), "0") == -1){
				csvExport(csvStruct					// 対象データ情報
						, "1"						// エラー区分
						, index						// エラー発生行
						, CSV_UN_OPR_TIME1			// エラー項目番号
						, "Expj.Cmt6753"			// エラー項目名
						,new ExpjMessage("UD60167").getMessage(_locale)	// エラーメッセージ
						); 
				return false;
			}
			// 不作業時間（分）1、9999～0範囲以外の場合
			if (!isNotInNumRange(csvStruct.getUN_OPR_TIME1(), 4, 0)) {
				csvExport(csvStruct					// 対象データ情報
						, "1"						// エラー区分
						, index						// エラー発生行
						, CSV_UN_OPR_TIME1			// エラー項目番号
						, "Expj.Cmt6753"			// エラー項目名
						, new ExpjMessage("AA01501").getMessage(_locale)	// エラーメッセージ
						); 
				return false;
			}
			if (!isNull(csvStruct.getREMARKS1())) {
				// 不作業理由備考1、文字81桁以上の場合
				if (strLengthChk(csvStruct.getREMARKS1()) >= 81) {
					csvExport(csvStruct					// 対象データ情報
							, "1"						// エラー区分
							, index						// エラー発生行
							, CSV_REMARKS1				// エラー項目番号
							, "Expj.Cmt6754"			// エラー項目名
							, new ExpjMessage("AA01501").getMessage(_locale)	// エラーメッセージ
							); 
					return false;
				}
				// 不作業理由備考1、禁則文字が入力されていた場合
				if (chkHankaku(csvStruct.getREMARKS1())) {
					csvExport(csvStruct					// 対象データ情報
							, "1"						// エラー区分
							, index						// エラー発生行
							, CSV_REMARKS1				// エラー項目番号
							, "Expj.Cmt6754"			// エラー項目名
							, new ExpjMessage("AA01524").getMessage(_locale)	// エラーメッセージ
							);  
					return false;
				}	
			}
			if (!isNull(csvStruct.getWS_CD2())) {
				//作業区コード2 、文字26桁以上の場合、
				if (strLengthChk(csvStruct.getWS_CD2()) >= 26) {
					csvExport(csvStruct					// 対象データ情報
							, "1"						// エラー区分
							, index						// エラー発生行
							, CSV_WS_CD2				// エラー項目番号
							, "Expj.CSV_WS_CD_02"			// エラー項目名
							, new ExpjMessage("AA01501").getMessage(_locale)	// エラーメッセージ
							); 
					return false;
				}
				// 作業区コード2 【禁則文字（「%」、「_」、「\」）が含まれています。】
				if (chkHankaku(csvStruct.getWS_CD2())) {
					csvExport(csvStruct					// 対象データ情報
							, "1"						// エラー区分
							, index						// エラー発生行
							, CSV_WS_CD2				// エラー項目番号
							, "Expj.CSV_WS_CD_02"			// エラー項目名
							, new ExpjMessage("AA01524").getMessage(_locale)	// エラーメッセージ
							);  
					return false;
				}
			}
			if (!isNull(csvStruct.getSTART_TIME2())) {
				// 開始時刻2、数字以外の場合
				if (!isDigitChk(csvStruct.getSTART_TIME2())) {
					csvExport(csvStruct						// 対象データ情報
							, "1"							// エラー区分
							, index							// エラー発生行
							, CSV_START_TIME2				// エラー項目番号
							, "Expj.Cmt6756"				// エラー項目名
							, new ExpjMessage("AA01503").getMessage(_locale)	// エラーメッセージ
							); 
					return false;
					
				}
				// 開始時刻2、数字2桁以下、または5桁以上の場合
				if (csvStruct.getSTART_TIME2().length() >= 5 || csvStruct.getSTART_TIME2().length() <= 2){
					csvExport(csvStruct					// 対象データ情報
							, "1"						// エラー区分
							, index						// エラー発生行
							, CSV_START_TIME2			// エラー項目番号
							, "Expj.Cmt6756"			// エラー項目名
							, new ExpjMessage("AS00019").getMessage(_locale)	// エラーメッセージ
							); 
					return false;
				}
			}
			if (!isNull(csvStruct.getEND_TIME2())) {
				// 終了時刻2、数字以外の場合
				if (!isDigitChk(csvStruct.getEND_TIME2())){
					csvExport(csvStruct					// 対象データ情報
							, "1"						// エラー区分
							, index						// エラー発生行
							, CSV_END_TIME2				// エラー項目番号
							, "Expj.Cmt6757"			// エラー項目名
							, new ExpjMessage("AA01503").getMessage(_locale)	// エラーメッセージ
							); 
					return false;
				}
				// 終了時刻2、数字2桁以下、または5桁以上の場合
				if (csvStruct.getEND_TIME2().length() >= 5 || csvStruct.getEND_TIME2().length() <= 2){
					csvExport(csvStruct					// 対象データ情報
							, "1"						// エラー区分
							, index						// エラー発生行
							, CSV_END_TIME2				// エラー項目番号
							, "Expj.Cmt6757"			// エラー項目名
							, new ExpjMessage("AS00019").getMessage(_locale)	// エラーメッセージ
							); 
					return false;
				}
			}
			// 作業区分2、整数以外の場合
			if (!isIntegerChk(csvStruct.getOPR_TYP2())){
				csvExport(csvStruct					// 対象データ情報
						, "1"						// エラー区分
						, index						// エラー発生行
						, CSV_OPR_TYP2				// エラー項目番号
						, "Expj.Cmt6758"			// エラー項目名
						, new ExpjMessage("AA01502").getMessage(_locale)	// エラーメッセージ
						); 
				return false;
			}
			// 作業区分2、整数 3桁以上の場合
			if (csvStruct.getOPR_TYP2().length() >= 3) {
				csvExport(csvStruct					// 対象データ情報
						, "1"						// エラー区分
						, index						// エラー発生行
						, CSV_OPR_TYP2				// エラー項目番号
						, "Expj.Cmt6758"			// エラー項目名
						, new ExpjMessage("AA01501").getMessage(_locale)	// エラーメッセージ
						); 
				return false;
			}
			// 不作業理由区分2、整数以外の場合
			if (!isIntegerChk(csvStruct.getUN_OPR_CAUSE_TYP2())){
				csvExport(csvStruct					// 対象データ情報
						, "1"						// エラー区分
						, index						// エラー発生行
						, CSV_UN_OPR_CAUSE_TYP2		// エラー項目番号
						, "Expj.Cmt6759"			// エラー項目名
						, new ExpjMessage("AA01502").getMessage(_locale)	// エラーメッセージ
						); 
				return false;
			}
			// 不作業理由区分2、整数 3桁以上の場合
			if (csvStruct.getUN_OPR_CAUSE_TYP2().length() >= 3) {
				csvExport(csvStruct					// 対象データ情報
						, "1"						// エラー区分
						, index						// エラー発生行
						, CSV_UN_OPR_CAUSE_TYP2		// エラー項目番号
						, "Expj.Cmt6759"			// エラー項目名
						, new ExpjMessage("AA01501").getMessage(_locale)	// エラーメッセージ
						); 
				return false;
			}
			// 不作業時間（分）2、数値以外の場合
			if (!isNumChk(csvStruct.getUN_OPR_TIME2())) {
				csvExport(csvStruct					// 対象データ情報
						, "1"						// エラー区分
						, index						// エラー発生行
						, CSV_UN_OPR_TIME2			// エラー項目番号
						, "Expj.Cmt6760"			// エラー項目名
						, new ExpjMessage("AA01503").getMessage(_locale)	// エラーメッセージ
						); 
				return false;
			}
			// 不作業時間（分）2、0未満の場合
			if (Calculate.compare(csvStruct.getUN_OPR_TIME2(), "0") == -1){
				csvExport(csvStruct					// 対象データ情報
						, "1"						// エラー区分
						, index						// エラー発生行
						, CSV_UN_OPR_TIME2			// エラー項目番号
						, "Expj.Cmt6760"			// エラー項目名
						, new ExpjMessage("UD60167").getMessage(_locale)	// エラーメッセージ
						);  
				return false;
			}
			// 不作業時間（分）2、9999～0範囲以外の場合
			if (!isNotInNumRange(csvStruct.getUN_OPR_TIME2(), 4, 0)) {
				csvExport(csvStruct					// 対象データ情報
						, "1"						// エラー区分
						, index						// エラー発生行
						, CSV_UN_OPR_TIME2			// エラー項目番号
						, "Expj.Cmt6760"			// エラー項目名
						, new ExpjMessage("AA01501").getMessage(_locale)	// エラーメッセージ
						);  
				return false;
			}
			if (!isNull(csvStruct.getREMARKS2())) {
				// 不作業理由備考2、文字81桁以上の場合
				if (strLengthChk(csvStruct.getREMARKS2()) >= 81) {
					csvExport(csvStruct					// 対象データ情報
							, "1"						// エラー区分
							, index						// エラー発生行
							, CSV_REMARKS2				// エラー項目番号
							, "Expj.Cmt6761"			// エラー項目名
							, new ExpjMessage("AA01501").getMessage(_locale)	// エラーメッセージ
							); 
					return false;
				}
				// 不作業理由備考2、禁則文字が入力されていた場合
				if (chkHankaku(csvStruct.getREMARKS2())){
					csvExport(csvStruct					// 対象データ情報
							, "1"						// エラー区分
							, index						// エラー発生行
							, CSV_REMARKS2				// エラー項目番号
							, "Expj.Cmt6761"			// エラー項目名
							, new ExpjMessage("AA01524").getMessage(_locale)	// エラーメッセージ
							); 
					return false;
				}
			}
			if (!isNull(csvStruct.getWS_CD3())) {
				//作業区コード3 、文字26桁以上の場合、
				if (strLengthChk(csvStruct.getWS_CD3()) >= 26) {
					csvExport(csvStruct					// 対象データ情報
							, "1"						// エラー区分
							, index						// エラー発生行
							, CSV_WS_CD3				// エラー項目番号
							, "Expj.CSV_WS_CD_03"			// エラー項目名
							, new ExpjMessage("AA01501").getMessage(_locale)	// エラーメッセージ
							); 
					return false;
				}
				// 作業区コード3 【禁則文字（「%」、「_」、「\」）が含まれています。】
				if (chkHankaku(csvStruct.getWS_CD3())){
					csvExport(csvStruct					// 対象データ情報
							, "1"						// エラー区分
							, index						// エラー発生行
							, CSV_WS_CD3				// エラー項目番号
							, "Expj.CSV_WS_CD_03"			// エラー項目名
							, new ExpjMessage("AA01524").getMessage(_locale)	// エラーメッセージ
							);  
					return false;
				}
			}
			if (!isNull(csvStruct.getSTART_TIME3())) {
				// 開始時刻3、数字以外の場合
				if (!isDigitChk(csvStruct.getSTART_TIME3())){
					csvExport(csvStruct						// 対象データ情報
							, "1"							// エラー区分
							, index							// エラー発生行
							, CSV_START_TIME3				// エラー項目番号
							, "Expj.Cmt6763"				// エラー項目名
							, new ExpjMessage("AA01503").getMessage(_locale)	// エラーメッセージ
							); 
					return false;
				}
				// 開始時刻3、数字2桁以下、または5桁以上の場合
				if (csvStruct.getSTART_TIME3().length() >= 5 || csvStruct.getSTART_TIME3().length() <= 2){
					csvExport(csvStruct					// 対象データ情報
							, "1"						// エラー区分
							, index						// エラー発生行
							, CSV_START_TIME3			// エラー項目番号
							, "Expj.Cmt6763"			// エラー項目名
							, new ExpjMessage("AS00019").getMessage(_locale)	// エラーメッセージ
							); 
					return false;
				}
			}
			if (!isNull(csvStruct.getEND_TIME3())) {
				// 終了時刻3、数字以外の場合
				if (!isDigitChk(csvStruct.getEND_TIME3())){
					csvExport(csvStruct					// 対象データ情報
							, "1"						// エラー区分
							, index						// エラー発生行
							, CSV_END_TIME3				// エラー項目番号
							, "Expj.Cmt6764"			// エラー項目名
							, new ExpjMessage("AA01503").getMessage(_locale)	// エラーメッセージ
							); 
					return false;
				}
				// 終了時刻3、数字2桁以下、、または5桁以上の場合
				if (csvStruct.getEND_TIME3().length() >= 5 || csvStruct.getEND_TIME3().length() <= 2){
					csvExport(csvStruct					// 対象データ情報
							, "1"						// エラー区分
							, index						// エラー発生行
							, CSV_END_TIME3				// エラー項目番号
							, "Expj.Cmt6764"			// エラー項目名
							, new ExpjMessage("AS00019").getMessage(_locale)	// エラーメッセージ
							); 
					return false;
				}
			}
			// 作業区分3、整数以外の場合
			if (!isIntegerChk(csvStruct.getOPR_TYP3())){
				csvExport(csvStruct					// 対象データ情報
						, "1"						// エラー区分
						, index						// エラー発生行
						, CSV_OPR_TYP3				// エラー項目番号
						, "Expj.Cmt6765"			// エラー項目名
						, new ExpjMessage("AA01502").getMessage(_locale)	// エラーメッセージ
						); 
				return false;
			}
			// 作業区分3、整数 3桁以上の場合
			if (csvStruct.getOPR_TYP3().length() >= 3) {
				csvExport(csvStruct					// 対象データ情報
						, "1"						// エラー区分
						, index						// エラー発生行
						, CSV_OPR_TYP3				// エラー項目番号
						, "Expj.Cmt6765"			// エラー項目名
						, new ExpjMessage("AA01501").getMessage(_locale)	// エラーメッセージ
						); 
				return false;
			}
			// 不作業理由区分3、整数以外の場合
			if (!isIntegerChk(csvStruct.getUN_OPR_CAUSE_TYP3())){
				csvExport(csvStruct					// 対象データ情報
						, "1"						// エラー区分
						, index						// エラー発生行
						, CSV_UN_OPR_CAUSE_TYP3		// エラー項目番号
						, "Expj.Cmt6766"			// エラー項目名
						, new ExpjMessage("AA01502").getMessage(_locale)	// エラーメッセージ
						); 
				return false;
			}
			// 不作業理由区分3、整数 3桁以上の場合
			if (csvStruct.getUN_OPR_CAUSE_TYP3().length() >= 3) {
				csvExport(csvStruct					// 対象データ情報
						, "1"						// エラー区分
						, index						// エラー発生行
						, CSV_UN_OPR_CAUSE_TYP3		// エラー項目番号
						, "Expj.Cmt6766"			// エラー項目名
						, new ExpjMessage("AA01501").getMessage(_locale)	// エラーメッセージ
						); 
				return false;
			}
			// 不作業時間（分）3、数値以外の場合
			if (!isNumChk(csvStruct.getUN_OPR_TIME3())){
				csvExport(csvStruct					// 対象データ情報
						, "1"						// エラー区分
						, index						// エラー発生行
						, CSV_UN_OPR_TIME3			// エラー項目番号
						, "Expj.Cmt6767"			// エラー項目名
						, new ExpjMessage("AA01503").getMessage(_locale)	// エラーメッセージ
						); 
				return false;
			}
			// 不作業時間（分）3、0未満の場合
			if (Calculate.compare(csvStruct.getUN_OPR_TIME3(), "0") == -1){
				csvExport(csvStruct					// 対象データ情報
						, "1"						// エラー区分
						, index						// エラー発生行
						, CSV_UN_OPR_TIME3			// エラー項目番号
						, "Expj.Cmt6767"			// エラー項目名
						, new ExpjMessage("UD60167").getMessage(_locale)	// エラーメッセージ
						);  
				return false;
			}
			// 不作業時間（分）3、9999～0範囲以外の場合
			if (!isNotInNumRange(csvStruct.getUN_OPR_TIME3(), 4, 0)) {
				csvExport(csvStruct					// 対象データ情報
						, "1"						// エラー区分
						, index						// エラー発生行
						, CSV_UN_OPR_TIME3			// エラー項目番号
						, "Expj.Cmt6767"			// エラー項目名
						, new ExpjMessage("AA01501").getMessage(_locale)	// エラーメッセージ
						);  
				return false;
			}
			if (!isNull(csvStruct.getREMARKS3())) {
				// 不作業理由備考3、文字81桁以上の場合
				if (strLengthChk(csvStruct.getREMARKS3()) >= 81) {
					csvExport(csvStruct					// 対象データ情報
							, "1"						// エラー区分
							, index						// エラー発生行
							, CSV_REMARKS3				// エラー項目番号
							, "Expj.Cmt6768"			// エラー項目名
							, new ExpjMessage("AA01501").getMessage(_locale)	// エラーメッセージ
							); 
					return false;
				}
				// 不作業理由備考3、禁則文字が入力されていた場合
				if (chkHankaku(csvStruct.getREMARKS3())){
					csvExport(csvStruct					// 対象データ情報
							, "1"						// エラー区分
							, index						// エラー発生行
							, CSV_REMARKS3				// エラー項目番号
							, "Expj.Cmt6768"			// エラー項目名
							, new ExpjMessage("AA01524").getMessage(_locale)	// エラーメッセージ
							); 
					return false;
				}
			}
			if (!isNull(csvStruct.getWS_CD4())) {
				//作業区コード4 、文字26桁以上の場合、
				if (strLengthChk(csvStruct.getWS_CD4()) >= 26) {
					csvExport(csvStruct					// 対象データ情報
							, "1"						// エラー区分
							, index						// エラー発生行
							, CSV_WS_CD4				// エラー項目番号
							, "Expj.CSV_WS_CD_04"			// エラー項目名
							, new ExpjMessage("AA01501").getMessage(_locale)	// エラーメッセージ
							); 
					return false;
				}
				// 作業区コード4 【禁則文字（「%」、「_」、「\」）が含まれています。】
				if (chkHankaku(csvStruct.getWS_CD4())){
					csvExport(csvStruct					// 対象データ情報
							, "1"						// エラー区分
							, index						// エラー発生行
							, CSV_WS_CD4				// エラー項目番号
							, "Expj.CSV_WS_CD_04"			// エラー項目名
							, new ExpjMessage("AA01524").getMessage(_locale)	// エラーメッセージ
							);  
					return false;
				}
			}
			if (!isNull(csvStruct.getSTART_TIME4())) {
				// 開始時刻4、数字以外の場合
				if (!isDigitChk(csvStruct.getSTART_TIME4())){
					csvExport(csvStruct						// 対象データ情報
							, "1"							// エラー区分
							, index							// エラー発生行
							, CSV_START_TIME4				// エラー項目番号
							, "Expj.Cmt6770"				// エラー項目名
							, new ExpjMessage("AA01503").getMessage(_locale)	// エラーメッセージ
							); 
					return false;
				}
				// 開始時刻4、数字2桁以下、または5桁以上の場合
				if (csvStruct.getSTART_TIME4().length() >= 5 || csvStruct.getSTART_TIME4().length() <= 2) {
					csvExport(csvStruct					// 対象データ情報
							, "1"						// エラー区分
							, index						// エラー発生行
							, CSV_START_TIME4			// エラー項目番号
							, "Expj.Cmt6770"			// エラー項目名
							, new ExpjMessage("AS00019").getMessage(_locale)	// エラーメッセージ
							); 
					return false;
				}
			}
			if (!isNull(csvStruct.getEND_TIME4())) {
				// 終了時刻4、数字以外の場合
				if (!isDigitChk(csvStruct.getEND_TIME4())){
					csvExport(csvStruct					// 対象データ情報
							, "1"						// エラー区分
							, index						// エラー発生行
							, CSV_END_TIME4				// エラー項目番号
							, "Expj.Cmt6771"			// エラー項目名
							, new ExpjMessage("AA01503").getMessage(_locale)	// エラーメッセージ
							); 
					return false;
				}
				// 終了時刻4、数字5桁以上の場合
				if (csvStruct.getEND_TIME4().length() >= 5 || csvStruct.getEND_TIME4().length() <= 2){
					csvExport(csvStruct					// 対象データ情報
							, "1"						// エラー区分
							, index						// エラー発生行
							, CSV_END_TIME4				// エラー項目番号
							, "Expj.Cmt6771"			// エラー項目名
							, new ExpjMessage("AS00019").getMessage(_locale)	// エラーメッセージ
							); 
					return false;
				}
			}
			// 作業区分4、整数以外の場合
			if (!isIntegerChk(csvStruct.getOPR_TYP4())){
				csvExport(csvStruct					// 対象データ情報
						, "1"						// エラー区分
						, index						// エラー発生行
						, CSV_OPR_TYP4				// エラー項目番号
						, "Expj.Cmt6772"			// エラー項目名
						, new ExpjMessage("AA01502").getMessage(_locale)	// エラーメッセージ
						); 
				return false;
			}
			// 作業区分4、整数 3桁以上の場合
			if (csvStruct.getOPR_TYP4().length() >= 3) {
				csvExport(csvStruct					// 対象データ情報
						, "1"						// エラー区分
						, index						// エラー発生行
						, CSV_OPR_TYP4				// エラー項目番号
						, "Expj.Cmt6772"			// エラー項目名
						, new ExpjMessage("AA01501").getMessage(_locale)	// エラーメッセージ
						); 
				return false;
			}
			// 不作業理由区分4、整数以外の場合
			if (!isIntegerChk(csvStruct.getUN_OPR_CAUSE_TYP4())){
				csvExport(csvStruct					// 対象データ情報
						, "1"						// エラー区分
						, index						// エラー発生行
						, CSV_UN_OPR_CAUSE_TYP4		// エラー項目番号
						, "Expj.Cmt6773"			// エラー項目名
						, new ExpjMessage("AA01502").getMessage(_locale)	// エラーメッセージ
						); 
				return false;
			}
			// 不作業理由区分4、整数 3桁以上の場合
			if (csvStruct.getUN_OPR_CAUSE_TYP4().length() >= 3) {
				csvExport(csvStruct					// 対象データ情報
						, "1"						// エラー区分
						, index						// エラー発生行
						, CSV_UN_OPR_CAUSE_TYP4		// エラー項目番号
						, "Expj.Cmt6773"			// エラー項目名
						, new ExpjMessage("AA01501").getMessage(_locale)	// エラーメッセージ
						); 
				return false;
			}
			// 不作業時間（分）4、数値以外の場合
			if (!isNumChk(csvStruct.getUN_OPR_TIME4())) {
				csvExport(csvStruct					// 対象データ情報
						, "1"						// エラー区分
						, index						// エラー発生行
						, CSV_UN_OPR_TIME4			// エラー項目番号
						, "Expj.Cmt6774"			// エラー項目名
						, new ExpjMessage("AA01503").getMessage(_locale)	// エラーメッセージ
						); 
				return false;
			}
			// 不作業時間（分）4、0未満の場合
			if (Calculate.compare(csvStruct.getUN_OPR_TIME4(), "0") == -1){
				csvExport(csvStruct					// 対象データ情報
						, "1"						// エラー区分
						, index						// エラー発生行
						, CSV_UN_OPR_TIME4			// エラー項目番号
						, "Expj.Cmt6774"			// エラー項目名
						, new ExpjMessage("UD60167").getMessage(_locale)	// エラーメッセージ
						);  
				return false;
			}
			// 不作業時間（分）4、9999～0範囲以外の場合
			if (!isNotInNumRange(csvStruct.getUN_OPR_TIME4(), 4, 0)) {
				csvExport(csvStruct					// 対象データ情報
						, "1"						// エラー区分
						, index						// エラー発生行
						, CSV_UN_OPR_TIME4			// エラー項目番号
						, "Expj.Cmt6774"			// エラー項目名
						, new ExpjMessage("AA01501").getMessage(_locale)	// エラーメッセージ
						);  
				return false;
			}
			if (!isNull(csvStruct.getREMARKS4())) {
				// 不作業理由備考4、文字81桁以上の場合
				if (strLengthChk(csvStruct.getREMARKS4()) >= 81) {
					csvExport(csvStruct					// 対象データ情報
							,"1"						// エラー区分
							,index						// エラー発生行
							, CSV_REMARKS4				// エラー項目番号
							, "Expj.Cmt6775"			// エラー項目名
							, new ExpjMessage("AA01501").getMessage(_locale)	// エラーメッセージ
							); 
					return false;
				}
				// 不作業理由備考4、禁則文字が入力されていた場合
				if (chkHankaku(csvStruct.getREMARKS4())){
					csvExport(csvStruct					// 対象データ情報
							, "1"						// エラー区分
							, index						// エラー発生行
							, CSV_REMARKS4				// エラー項目番号
							, "Expj.Cmt6775"			// エラー項目名
							, new ExpjMessage("AA01524").getMessage(_locale)	// エラーメッセージ
							); 
					return false;
				}
			}
			if (!isNull(csvStruct.getWS_CD5())) {
				//作業区コード5 、文字26桁以上の場合、
				if (strLengthChk(csvStruct.getWS_CD5()) >= 26) {
					csvExport(csvStruct					// 対象データ情報
							, "1"						// エラー区分
							, index						// エラー発生行
							, CSV_WS_CD5				// エラー項目番号
							, "Expj.CSV_WS_CD_05"			// エラー項目名
							, new ExpjMessage("AA01501").getMessage(_locale)	// エラーメッセージ
							); 
					return false;
				}
				// 作業区コード5 【禁則文字（「%」、「_」、「\」）が含まれています。】
				if (chkHankaku(csvStruct.getWS_CD5())){
					csvExport(csvStruct					// 対象データ情報
							, "1"						// エラー区分
							, index						// エラー発生行
							, CSV_WS_CD5				// エラー項目番号
							, "Expj.CSV_WS_CD_05"			// エラー項目名
							, new ExpjMessage("AA01524").getMessage(_locale)	// エラーメッセージ
							);  
					return false;
				}
			}
			if (!isNull(csvStruct.getSTART_TIME5())) {
				// 開始時刻5、数字以外の場合
				if (!isDigitChk(csvStruct.getSTART_TIME5())){
					csvExport(csvStruct						// 対象データ情報
							, "1"							// エラー区分
							, index							// エラー発生行
							, CSV_START_TIME5				// エラー項目番号
							, "Expj.Cmt6777"				// エラー項目名
							, new ExpjMessage("AA01503").getMessage(_locale)	// エラーメッセージ
							); 
					return false;
				}
				// 開始時刻5、数字2桁以下、5桁以上の場合
				if (csvStruct.getSTART_TIME5().length() >= 5 || csvStruct.getSTART_TIME5().length() <= 2){
					csvExport(csvStruct					// 対象データ情報
							, "1"						// エラー区分
							, index						// エラー発生行
							, CSV_START_TIME5			// エラー項目番号
							, "Expj.Cmt6777"			// エラー項目名
							, new ExpjMessage("AS00019").getMessage(_locale)	// エラーメッセージ
							); 
					return false;
				}
			}
			if (!isNull(csvStruct.getEND_TIME5())) {
				// 終了時刻5、数字以外の場合
				if (!isDigitChk(csvStruct.getEND_TIME5())){
					csvExport(csvStruct					// 対象データ情報
							, "1"						// エラー区分
							, index						// エラー発生行
							, CSV_END_TIME5				// エラー項目番号
							, "Expj.Cmt6778"			// エラー項目名
							, new ExpjMessage("AA01503").getMessage(_locale)	// エラーメッセージ
							); 
					return false;
				}
				// 終了時刻5、数字2桁以下、または5桁以上の場合
				if (csvStruct.getEND_TIME5().length() >= 5 || csvStruct.getEND_TIME5().length() <= 2){
					csvExport(csvStruct					// 対象データ情報
							, "1"						// エラー区分
							, index						// エラー発生行
							, CSV_END_TIME5				// エラー項目番号
							, "Expj.Cmt6778"			// エラー項目名
							, new ExpjMessage("AS00019").getMessage(_locale)	// エラーメッセージ
							); 
					return false;
				}
			}
			// 作業区分5、整数以外の場合
			if (!isIntegerChk(csvStruct.getOPR_TYP5())){
				csvExport(csvStruct					// 対象データ情報
						, "1"						// エラー区分
						, index						// エラー発生行
						, CSV_OPR_TYP5				// エラー項目番号
						, "Expj.Cmt6779"			// エラー項目名
						, new ExpjMessage("AA01502").getMessage(_locale)	// エラーメッセージ
						); 
				return false;
			}
			// 作業区分5、整数 3桁以上の場合
			if (csvStruct.getOPR_TYP5().length() >= 3) {
				csvExport(csvStruct					// 対象データ情報
						, "1"						// エラー区分
						, index						// エラー発生行
						, CSV_OPR_TYP5				// エラー項目番号
						, "Expj.Cmt6779"			// エラー項目名
						, new ExpjMessage("AA01501").getMessage(_locale)	// エラーメッセージ
						); 
				return false;
			}
			// 不作業理由区分5、整数以外の場合
			if (!isIntegerChk(csvStruct.getUN_OPR_CAUSE_TYP5())){
				csvExport(csvStruct					// 対象データ情報
						, "1"						// エラー区分
						, index						// エラー発生行
						, CSV_UN_OPR_CAUSE_TYP5		// エラー項目番号
						, "Expj.Cmt6780"			// エラー項目名
						, new ExpjMessage("AA01502").getMessage(_locale)	// エラーメッセージ
						); 
				return false;
			}
			// 不作業理由区分5、整数 3桁以上の場合
			if (csvStruct.getUN_OPR_CAUSE_TYP5().length() >= 3) {
				csvExport(csvStruct					// 対象データ情報
						, "1"						// エラー区分
						, index						// エラー発生行
						, CSV_UN_OPR_CAUSE_TYP5		// エラー項目番号
						, "Expj.Cmt6780"			// エラー項目名
						, new ExpjMessage("AA01501").getMessage(_locale)	// エラーメッセージ
						); 
				return false;
			}
			// 不作業時間（分）5、数値以外の場合
			if (!isNumChk(csvStruct.getUN_OPR_TIME5())) {
				csvExport(csvStruct					// 対象データ情報
						, "1"						// エラー区分
						, index						// エラー発生行
						, CSV_UN_OPR_TIME5			// エラー項目番号
						, "Expj.Cmt6781"			// エラー項目名
						, new ExpjMessage("AA01503").getMessage(_locale)	// エラーメッセージ
						); 
				return false;
			}
			// 不作業時間（分）5、0未満の場合
			if (Calculate.compare(csvStruct.getUN_OPR_TIME5(), "0") == -1){
				csvExport(csvStruct					// 対象データ情報
						, "1"						// エラー区分
						, index						// エラー発生行
						, CSV_UN_OPR_TIME5			// エラー項目番号
						, "Expj.Cmt6781"			// エラー項目名
						, new ExpjMessage("UD60167").getMessage(_locale)	// エラーメッセージ
						);  
				return false;
			}
			// 不作業時間（分）5、9999～0範囲以外の場合
			if (!isNotInNumRange(csvStruct.getUN_OPR_TIME5(), 4, 0)) {
				csvExport(csvStruct					// 対象データ情報
						, "1"						// エラー区分
						, index						// エラー発生行
						, CSV_UN_OPR_TIME5			// エラー項目番号
						, "Expj.Cmt6781"			// エラー項目名
						, new ExpjMessage("AA01501").getMessage(_locale)	// エラーメッセージ
						);  
				return false;
			}
			if (!isNull(csvStruct.getREMARKS5())) {
				// 不作業理由備考5、文字81桁以上の場合
				if (strLengthChk(csvStruct.getREMARKS5()) >= 81) {
					csvExport(csvStruct					// 対象データ情報
							, "1"						// エラー区分
							, index						// エラー発生行
							, CSV_REMARKS5				// エラー項目番号
							, "Expj.Cmt6782"			// エラー項目名
							, new ExpjMessage("AA01501").getMessage(_locale)	// エラーメッセージ
							); 
					return false;
				}
				// 不作業理由備考5、禁則文字が入力されていた場合
				if (chkHankaku(csvStruct.getREMARKS5())) {
					csvExport(csvStruct					// 対象データ情報
							, "1"						// エラー区分
							, index						// エラー発生行
							, CSV_REMARKS5				// エラー項目番号
							, "Expj.Cmt6782"			// エラー項目名
							, new ExpjMessage("AA01524").getMessage(_locale)	// エラーメッセージ
							); 
					return false;
				}
			}			
		} catch (Exception e) {
			 ExpjMessage emsg = new ExpjMessage( "ZZ01106");
			 sysLog.severe(emsg, getsysUSER_CD());
			 ExpjException ee = new ExpjException(e, emsg);
			 ee.setLocale(CoreTools.getLocale(getsysUSER_CD()));
			 throw ee;
		}
		return true;
	}
		
	/**
	 * ＣＳＶデータ取得、リストデータ化、日報区分の判定
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
				AD0140010Struct structCsv = null;
				Vector v = null;
				for (int i = 0; i < strsCsvData.length; i++) {
					if (strsCsvData[i].length() == 0) {
						// 処理を抜ける。
						break;
					}
					// レコードを項目毎にばらす
					v = csvReader.importCSVLine(strsCsvData[i]);
					if (v != null ) {
						structCsv = new AD0140010Struct();
						if (CSV_NECESSARY_COLUMN == v.size()) {
							// 日報区分
							structCsv.setDAILY_WORK_REPORT_TYP((String)v.get(CSV_DAILY_WORK_REPORT_TYP)); 
							
							// 日報区分 2:人日報
							// ユーザコード
							structCsv.setUSER_CD2((String)v.get(CSV_USER_CD2)); 
							// 作業日
							structCsv.setOPR_DATE2((String)v.get(CSV_OPR_DATE2));
							// 勤務シフト
							structCsv.setWORK_SHIFT_CODE2((String)v.get(CSV_WORK_SHIFT_CODE2)); 
							// 作業区コード１
							structCsv.setWS_CD1((String)v.get(CSV_WS_CD1)); 
							// 開始時刻１
							structCsv.setSTART_TIME1((String)v.get(CSV_START_TIME1)); 
							// 終了時刻１
							structCsv.setEND_TIME1((String)v.get(CSV_END_TIME1)); 
							// 作業区分１
							if(isNull((String)v.get(CSV_OPR_TYP1))) {
								structCsv.setOPR_TYP1("0"); 
							} else {
								structCsv.setOPR_TYP1((String)v.get(CSV_OPR_TYP1)); 
							}
							// 不作業理由１
							if (isNull((String)v.get(CSV_UN_OPR_CAUSE_TYP1))) {
								structCsv.setUN_OPR_CAUSE_TYP1("0");
							} else {
								structCsv.setUN_OPR_CAUSE_TYP1((String)v.get(CSV_UN_OPR_CAUSE_TYP1)); 
							}
							// 不作業時間（分）１
							if (isNull((String)v.get(CSV_UN_OPR_TIME1))) {
								structCsv.setUN_OPR_TIME1("0"); 
							} else {
								structCsv.setUN_OPR_TIME1((String)v.get(CSV_UN_OPR_TIME1)); 
							}
							// 不作業理由備考１
							structCsv.setREMARKS1((String)v.get(CSV_REMARKS1)); 
							// 作業区コード２
							structCsv.setWS_CD2((String)v.get(CSV_WS_CD2)); 
							// 開始時刻２
							structCsv.setSTART_TIME2((String)v.get(CSV_START_TIME2)); 
							// 終了時刻２
							structCsv.setEND_TIME2((String)v.get(CSV_END_TIME2)); 
							// 作業区分２
							if(isNull((String)v.get(CSV_OPR_TYP2))) {
								structCsv.setOPR_TYP2("0"); 
							} else {
								structCsv.setOPR_TYP2((String)v.get(CSV_OPR_TYP2)); 
							}
							// 不作業理由２
							if (isNull((String)v.get(CSV_UN_OPR_CAUSE_TYP2))) {
								structCsv.setUN_OPR_CAUSE_TYP2("0");
							} else {
								structCsv.setUN_OPR_CAUSE_TYP2((String)v.get(CSV_UN_OPR_CAUSE_TYP2));
							}
							// 不作業時間（分）２
							if (isNull((String)v.get(CSV_UN_OPR_TIME2))) {
								structCsv.setUN_OPR_TIME2("0"); 
							} else {
								structCsv.setUN_OPR_TIME2((String)v.get(CSV_UN_OPR_TIME2)); 
							}
							// 不作業理由備考２
							structCsv.setREMARKS2((String)v.get(CSV_REMARKS2)); 
							// 作業区コード３
							structCsv.setWS_CD3((String)v.get(CSV_WS_CD3)); 
							// 開始時刻３
							structCsv.setSTART_TIME3((String)v.get(CSV_START_TIME3)); 
							// 終了時刻３
							structCsv.setEND_TIME3((String)v.get(CSV_END_TIME3)); 
							// 作業区分３
							if(isNull((String)v.get(CSV_OPR_TYP3))) {
								structCsv.setOPR_TYP3("0"); 
							} else {
								structCsv.setOPR_TYP3((String)v.get(CSV_OPR_TYP3)); 
							}
							// 不作業理由３
							if (isNull((String)v.get(CSV_UN_OPR_CAUSE_TYP3))) {
								structCsv.setUN_OPR_CAUSE_TYP3("0"); 
							} else {
								structCsv.setUN_OPR_CAUSE_TYP3((String)v.get(CSV_UN_OPR_CAUSE_TYP3)); 
							}
							// 不作業時間（分）３
							if (isNull((String)v.get(CSV_UN_OPR_TIME3))) {
								structCsv.setUN_OPR_TIME3("0"); 
							} else {
								structCsv.setUN_OPR_TIME3((String)v.get(CSV_UN_OPR_TIME3)); 
							}
							// 不作業理由備考３
							structCsv.setREMARKS3((String)v.get(CSV_REMARKS3)); 
							// 作業区コード４
							structCsv.setWS_CD4((String)v.get(CSV_WS_CD4)); 
							// 開始時刻４
							structCsv.setSTART_TIME4((String)v.get(CSV_START_TIME4)); 
							// 終了時刻４
							structCsv.setEND_TIME4((String)v.get(CSV_END_TIME4)); 
							// 作業区分４
							if(isNull((String)v.get(CSV_OPR_TYP4))) {
								structCsv.setOPR_TYP4("0"); 
							} else {
								structCsv.setOPR_TYP4((String)v.get(CSV_OPR_TYP4)); 
							}
							// 不作業理由４
							if (isNull((String)v.get(CSV_UN_OPR_CAUSE_TYP4))) {
								structCsv.setUN_OPR_CAUSE_TYP4("0"); 
							} else {
								structCsv.setUN_OPR_CAUSE_TYP4((String)v.get(CSV_UN_OPR_CAUSE_TYP4)); 
							}
							// 不作業時間（分）４
							if (isNull((String)v.get(CSV_UN_OPR_TIME4))) {
								structCsv.setUN_OPR_TIME4("0"); 
							} else {
								structCsv.setUN_OPR_TIME4((String)v.get(CSV_UN_OPR_TIME4));
							}
							// 不作業理由備考４
							structCsv.setREMARKS4((String)v.get(CSV_REMARKS4));
							// 作業区コード５
							structCsv.setWS_CD5((String)v.get(CSV_WS_CD5)); 
							// 開始時刻５
							structCsv.setSTART_TIME5((String)v.get(CSV_START_TIME5));
							// 終了時刻５
							structCsv.setEND_TIME5((String)v.get(CSV_END_TIME5)); 
							// 作業区分５
							if(isNull((String)v.get(CSV_OPR_TYP5))) {
								structCsv.setOPR_TYP5("0"); 
							} else {
								structCsv.setOPR_TYP5((String)v.get(CSV_OPR_TYP5)); 
							}
							// 不作業理由５
							if (isNull((String)v.get(CSV_UN_OPR_CAUSE_TYP5))) {
								structCsv.setUN_OPR_CAUSE_TYP5("0");
							} else {
								structCsv.setUN_OPR_CAUSE_TYP5((String)v.get(CSV_UN_OPR_CAUSE_TYP5));
							}
							// 不作業時間（分）５
							if (isNull((String)v.get(CSV_UN_OPR_TIME5))) {
								structCsv.setUN_OPR_TIME5("0"); 
							} else {
								structCsv.setUN_OPR_TIME5((String)v.get(CSV_UN_OPR_TIME5)); 
							}
							// 不作業理由備考５
							structCsv.setREMARKS5((String)v.get(CSV_REMARKS5));
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
			throw new ExpjException();
		}
		return listCsv;
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
				AD0140010Struct cvsStruct = (AD0140010Struct)csvList.get(i);
//				if ("1".equals(cvsStruct.getDAILY_WORK_REPORT_TYP())) {
//					//日報区分 1:作業日報の登録
//					rtnFlg = workCsvDataInsert(cvsStruct, i + 1);
//				} else {
					//日報区分 2:人日報の登録
					rtnFlg = personCsvDataInsert(cvsStruct, i + 1);
//				}
				if(!rtnFlg) {
					conn.rollback();
					break;
				}
			}
			conn.commit();
			return rtnFlg;
		} catch (Exception e) {
			conn.rollback();;
			throw new ExpjException();
		}
	}
	
	
	/**
	 * CSVフェイル内容は、人日報の登録処理
	 * @param csvStruct　csvデータ
	 * @param lineNo 行番号
	 * @throws ExpjException 
	 */
	private boolean personCsvDataInsert(AD0140010Struct csvStruct, int lineNo) throws ExpjException {
		try {
			// 重複チェック(明細1)
			csvStruct.setSTART_TIME6(csvStruct.getSTART_TIME1());
			csvStruct.setEND_TIME6(csvStruct.getEND_TIME1());
			if (compareHm(csvStruct.getSTART_TIME6(), csvStruct.getEND_TIME6()) > 0) {
				csvStruct.setTIME_FLG2("1");
			} else {
				csvStruct.setTIME_FLG2("2");
			}
			List tempList = entity.mUT_DAILY_WORK_REPORT_2.read(conn, csvStruct);
			if(!tempList.isEmpty()) {
				csvExport(csvStruct					// 対象データ情報
						, "3"						// エラー区分
						, lineNo					// エラー発生行
						, CSV_START_TIME1			// エラー項目番号
						, null						// エラー項目名
						, new ExpjMessage("AD61014").getMessage(_locale)	// エラーメッセージ
						); 
				return false;
			}
				
			// 重複チェック(明細2)
			if(!isNull(csvStruct.getSTART_TIME2()) && !isNull(csvStruct.getEND_TIME2())) {
				csvStruct.setSTART_TIME6(csvStruct.getSTART_TIME2());
				csvStruct.setEND_TIME6(csvStruct.getEND_TIME2());
				if (compareHm(csvStruct.getSTART_TIME6(), csvStruct.getEND_TIME6()) > 0) {
					csvStruct.setTIME_FLG2("1");
				} else {
					csvStruct.setTIME_FLG2("2");
				}
				tempList = entity.mUT_DAILY_WORK_REPORT_2.read(conn, csvStruct);
				if(!tempList.isEmpty()) {
					csvExport(csvStruct					// 対象データ情報
							, "3"						// エラー区分
							, lineNo					// エラー発生行
							, CSV_START_TIME2			// エラー項目番号
							, null						// エラー項目名
							, new ExpjMessage("AD61014").getMessage(_locale)	// エラーメッセージ
							); 
					return false;
				}
			}
			
			// 重複チェック(明細3)
			if(!isNull(csvStruct.getSTART_TIME3()) && !isNull(csvStruct.getEND_TIME3())) {
				csvStruct.setSTART_TIME6(csvStruct.getSTART_TIME3());
				csvStruct.setEND_TIME6(csvStruct.getEND_TIME3());
				if (compareHm(csvStruct.getSTART_TIME6(), csvStruct.getEND_TIME6()) > 0) {
					csvStruct.setTIME_FLG2("1");
				} else {
					csvStruct.setTIME_FLG2("2");
				}
				tempList = entity.mUT_DAILY_WORK_REPORT_2.read(conn, csvStruct);
				if(!tempList.isEmpty()) {
					csvExport(csvStruct					// 対象データ情報
							, "3"						// エラー区分
							, lineNo					// エラー発生行
							, CSV_START_TIME3			// エラー項目番号
							, null						// エラー項目名
							, new ExpjMessage("AD61014").getMessage(_locale)	// エラーメッセージ
							); 
					return false;
				}
			}
			
			// 重複チェック(明細4)
			if(!isNull(csvStruct.getSTART_TIME4()) && !isNull(csvStruct.getEND_TIME4())) {
				csvStruct.setSTART_TIME6(csvStruct.getSTART_TIME4());
				csvStruct.setEND_TIME6(csvStruct.getEND_TIME4());
				if (compareHm(csvStruct.getSTART_TIME6(), csvStruct.getEND_TIME6()) > 0) {
					csvStruct.setTIME_FLG2("1");
				} else {
					csvStruct.setTIME_FLG2("2");
				}
				tempList = entity.mUT_DAILY_WORK_REPORT_2.read(conn, csvStruct);
				if(!tempList.isEmpty()) {
					csvExport(csvStruct					// 対象データ情報
							, "3"						// エラー区分
							, lineNo					// エラー発生行
							, CSV_START_TIME4			// エラー項目番号
							, null						// エラー項目名
							, new ExpjMessage("AD61014").getMessage(_locale)	// エラーメッセージ
							); 
					return false;
				}
			}
			
			// 重複チェック(明細5)
			if(!isNull(csvStruct.getSTART_TIME5()) && !isNull(csvStruct.getEND_TIME5())) {
				csvStruct.setSTART_TIME6(csvStruct.getSTART_TIME5());
				csvStruct.setEND_TIME6(csvStruct.getEND_TIME5());
				if (compareHm(csvStruct.getSTART_TIME6(), csvStruct.getEND_TIME6()) > 0) {
					csvStruct.setTIME_FLG2("1");
				} else {
					csvStruct.setTIME_FLG2("2");
				}
				tempList = entity.mUT_DAILY_WORK_REPORT_2.read(conn, csvStruct);
				if(!tempList.isEmpty()) {
					csvExport(csvStruct					// 対象データ情報
							, "3"						// エラー区分
							, lineNo					// エラー発生行
							, CSV_START_TIME5			// エラー項目番号
							, null						// エラー項目名
							, new ExpjMessage("AD61014").getMessage(_locale)	// エラーメッセージ
							); 
					return false;
				}
			}
			
			// 上限値チェック
			List sumOprTimeList = entity.mselectTOTAL_OPR_TIME.read(conn, csvStruct);
			String totalOprTime = ((AD0140010Struct)sumOprTimeList.get(0)).getTOTAL_OPR_TIME();
			if (Calculate.compare(Calculate.add(totalOprTime, csvStruct.getTOTAL_OPR_TIME()), _MAX_OPR_TIME) > 0) {
				// <エラー> AD61012 【作業時間が上限を超えています。】
				csvExport(csvStruct					// 対象データ情報
						, "3"						// エラー区分
						, lineNo					// エラー発生行
						, CSV_START_TIME1			// エラー項目番号
						, null						// エラー項目名
						, new ExpjMessage("AD61012").getMessage(_locale)	// エラーメッセージ
						); 
				return false;
			}
			
			// 作業日報管理番号の取得
			List noList = entity.mUSEQ_DAILY_WORK_REPORT_CTL_NO.read(conn, struct);
			csvStruct.setDAILY_WORK_REPORT_CTL_NO(((AD0140010Struct)noList.get(0)).getDAILY_WORK_REPORT_CTL_NO());
//			// 作業日報データ区分
//			csvStruct.setDAILY_WORK_REPORT_DATA_TYP("0");
			int j = 0;
			for (int i = 0; i < 5; i++) {
				// 作業区コード（１～５）～備考１～５
				switch (i) {
				case 0:
					// 作業区コード１
					csvStruct.setWS_CD(csvStruct.getWS_CD1()); 
					// 開始時刻１
					if(csvStruct.getSTART_TIME1().length() == 3){
						csvStruct.setSTART_TIME("0" + csvStruct.getSTART_TIME1());
					} else {
						csvStruct.setSTART_TIME(csvStruct.getSTART_TIME1());
					}
					// 終了時刻１
					if(csvStruct.getEND_TIME1().length() == 3){
						csvStruct.setEND_TIME("0" + csvStruct.getEND_TIME1());
					} else {
						csvStruct.setEND_TIME(csvStruct.getEND_TIME1());
					}
					// 作業区分１
					csvStruct.setOPR_TYP(csvStruct.getOPR_TYP1()); 
					// 不作業理由区分１
					csvStruct.setUN_OPR_CAUSE_TYP(csvStruct.getUN_OPR_CAUSE_TYP1()); 
					// 不作業時間１
					csvStruct.setUN_OPR_TIME(csvStruct.getUN_OPR_TIME1());
					// 備考１
					csvStruct.setREMARKS(csvStruct.getREMARKS1()); 
					break;
				case 1:
					if(isNull(csvStruct.getWS_CD2())) {
						continue;
					}
					// 作業区コード２
					csvStruct.setWS_CD(csvStruct.getWS_CD2()); 
					// 開始時刻２
					if(csvStruct.getSTART_TIME2().length() == 3){
						csvStruct.setSTART_TIME("0" + csvStruct.getSTART_TIME2());
					} else {
						csvStruct.setSTART_TIME(csvStruct.getSTART_TIME2());
					}
					// 終了時刻２
					if(csvStruct.getEND_TIME2().length() == 3){
						csvStruct.setEND_TIME("0" + csvStruct.getEND_TIME2());
					} else {
						csvStruct.setEND_TIME(csvStruct.getEND_TIME2());
					}
					// 作業時間２
					csvStruct.setOPR_TIME(csvStruct.getOPR_TIME2());
					// 作業区分２
					csvStruct.setOPR_TYP(csvStruct.getOPR_TYP2()); 
					// 不作業理由区分２
					csvStruct.setUN_OPR_CAUSE_TYP(csvStruct.getUN_OPR_CAUSE_TYP2()); 
					// 不作業時間２
					csvStruct.setUN_OPR_TIME(csvStruct.getUN_OPR_TIME2());
					// 備考２
					csvStruct.setREMARKS(csvStruct.getREMARKS2()); 
					break;
				case 2:
					if(isNull(csvStruct.getWS_CD3())) {
						continue;
					}
					// 作業区コード３
					csvStruct.setWS_CD(csvStruct.getWS_CD3()); 
					// 開始時刻３
					if(csvStruct.getSTART_TIME3().length() == 3){
						csvStruct.setSTART_TIME("0" + csvStruct.getSTART_TIME3());
					} else {
						csvStruct.setSTART_TIME(csvStruct.getSTART_TIME3());
					}
					// 終了時刻３
					if(csvStruct.getEND_TIME3().length() == 3){
						csvStruct.setEND_TIME("0" + csvStruct.getEND_TIME3());
					} else {
						csvStruct.setEND_TIME(csvStruct.getEND_TIME3());
					}
					// 作業時間３
					csvStruct.setOPR_TIME(csvStruct.getOPR_TIME3());
					// 作業区分３
					csvStruct.setOPR_TYP(csvStruct.getOPR_TYP3()); 
					// 不作業理由区分３
					csvStruct.setUN_OPR_CAUSE_TYP(csvStruct.getUN_OPR_CAUSE_TYP3()); 
					// 不作業時間３
					csvStruct.setUN_OPR_TIME(csvStruct.getUN_OPR_TIME3());
					// 備考３
					csvStruct.setREMARKS(csvStruct.getREMARKS3()); 
					break;
				case 3:
					if(isNull(csvStruct.getWS_CD4())) {
						continue;
					}
					// 作業区コード４
					csvStruct.setWS_CD(csvStruct.getWS_CD4()); 
					// 開始時刻４
					if(csvStruct.getSTART_TIME4().length() == 3){
						csvStruct.setSTART_TIME("0" + csvStruct.getSTART_TIME4());
					} else {
						csvStruct.setSTART_TIME(csvStruct.getSTART_TIME4());
					}
					// 終了時刻４
					if(csvStruct.getEND_TIME4().length() == 3){
						csvStruct.setEND_TIME("0" + csvStruct.getEND_TIME4());
					} else {
						csvStruct.setEND_TIME(csvStruct.getEND_TIME4());
					}
					// 作業時間４
					csvStruct.setOPR_TIME(csvStruct.getOPR_TIME4());
					// 作業区分４
					csvStruct.setOPR_TYP(csvStruct.getOPR_TYP4()); 
					// 不作業理由区分４
					csvStruct.setUN_OPR_CAUSE_TYP(csvStruct.getUN_OPR_CAUSE_TYP4()); 
					// 不作業時間４
					csvStruct.setUN_OPR_TIME(csvStruct.getUN_OPR_TIME4());
					// 備考４
					csvStruct.setREMARKS(csvStruct.getREMARKS4()); 
					break;
				case 4:
					if(isNull(csvStruct.getWS_CD5())) {
						continue;
					}
					// 作業区コード５
					csvStruct.setWS_CD(csvStruct.getWS_CD5()); 
					// 開始時刻５
					if(csvStruct.getSTART_TIME5().length() == 3){
						csvStruct.setSTART_TIME("0" + csvStruct.getSTART_TIME5());
					} else {
						csvStruct.setSTART_TIME(csvStruct.getSTART_TIME5());
					}
					// 終了時刻５
					if(csvStruct.getEND_TIME5().length() == 3){
						csvStruct.setEND_TIME("0" + csvStruct.getEND_TIME5());
					} else {
						csvStruct.setEND_TIME(csvStruct.getEND_TIME5());
					}
					// 作業時間５
					csvStruct.setOPR_TIME(csvStruct.getOPR_TIME5());
					// 作業区分５
					csvStruct.setOPR_TYP(csvStruct.getOPR_TYP5()); 
					// 不作業理由区分５
					csvStruct.setUN_OPR_CAUSE_TYP(csvStruct.getUN_OPR_CAUSE_TYP5()); 
					// 不作業時間５
					csvStruct.setUN_OPR_TIME(csvStruct.getUN_OPR_TIME5());
					// 備考５
					csvStruct.setREMARKS(csvStruct.getREMARKS5()); 
					break;
				}
				// 行番号
				csvStruct.setSEQ_NO(String.valueOf(++j)); 
				// ユーザコード
				csvStruct.setUSER_CD(csvStruct.getUSER_CD2());
				// 作業日
				csvStruct.setOPR_DATE(csvStruct.getOPR_DATE2());
				// 勤務シフトコード
				csvStruct.setWORK_SHIFT_CODE(csvStruct.getWORK_SHIFT_CODE2());
				
				csvStruct.setsUser_ID(getsysUSER_CD());
				//登録実行
				entity.minsert.create(conn, csvStruct);
			}
			return true;
		} catch(Exception e) {
			e.printStackTrace();
			throw new ExpjException();
		}
	}
	
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * 参照ボタン押下時に実行される処理です。
	 *
	 */
	public void controlBrowse() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0140");
		logger.entering("AD0140010Control"+":USER="+struct.getsUser_ID(),"controlBrowse");
			//{{user_implement_dev:<controlBrowse>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlBrowse>
		logger.exiting("AD0140010Control"+":USER="+struct.getsUser_ID(),"controlBrowse");

		return;
	}

	/**
	 * 取込ボタン押下時に実行される処理です。
	 *
	 */
	public void controlCsvIn() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0140");
		logger.entering("AD0140010Control"+":USER="+struct.getsUser_ID(),"controlCsvIn");
			//{{user_implement_dev:<controlCsvIn>
		try {
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

			// ＣＳＶデータ取得成功
			if (listCsv != null) {
				// ＣＳＶ項目のチェック＆＆ ＣＳＶ項目の登録
				if (checkCsvData(listCsv)) {
					// 登録処理
					if(insertCsvDate(listCsv)) {
						// エラー・ワーニングがない場合
						if (_intWarningCount == 0) {
							setInfoMessage("AA01514", String.valueOf(_intSuccessCount));
						} else {
							setWarningMessage("AA01515", String.valueOf(_intSuccessCount), String.valueOf(_intWarningCount));
						}
					} else {
						setErrorMessage("AD61018");
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
		logger.exiting("AD0140010Control"+":USER="+struct.getsUser_ID(),"controlCsvIn");

		return;
	}

	/**
	 * CSV出力ボタン押下時に実行される処理です。
	 *
	 */
	public void controlCSVOut() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0140");
		logger.entering("AD0140010Control"+":USER="+struct.getsUser_ID(),"controlCSVOut");
			//{{user_implement_dev:<controlCSVOut>
		// CSV出力部品を設定
		csvWriter = new CsvWriter(CsvWriter.getFileName(getsysUSER_CD()));
		AD0140010Struct errorStruct = null;
		List csv = new ArrayList();	// CSV情報
		// CSVヘッダ行をCSV情報に追加
		String[] title = {
				 "Expj.Cmt3094"							//エラー箇所
				,"Expj.Cmt3095"							//エラー区分
				,"Expj.Cmt3098"							//エラー内容
				,"Expj.Cmt6745"						//エラー項目
				,"Expj.Cmt0037"							//工場
				,"Expj.DAILY_WORK_REPORT_TYP"			//日報区分
				,"Expj.USER_CD"							//ユーザコード
				,"Expj.Cmt5833"							//作業日
				,"Expj.Cmt6746"						//勤務シフト
				,"Expj.CSV_SUB_WS_CD"						//作業区コード
		};
		csv.add(title);
		// [画面].一覧部のエラー情報をCSV情報に追加
		for (int i = 0; i < list.size(); i++) {
			errorStruct = (AD0140010Struct)list.get(i);
			String[] date = {
					 errorStruct.getl_ERROR_IN()
					,errorStruct.getl_ERR_TYP()
					,errorStruct.getl_ERR_INFO()
					,errorStruct.getl_ERR_CTR_NM()
					,errorStruct.getl_ERR_PLANT_NO()
					,errorStruct.getl_ERR_DAILY_WORK_REPORT_TYP()
					,replaceSlashSub(errorStruct.getl_ERR_USER_CD())
					,errorStruct.getl_ERR_OPR_DATE()
					,replaceSlashSub(errorStruct.getl_ERR_WORK_SHIFT_CODE())
					,replaceSlashSub(errorStruct.getl_ERR_WS_CD())
			};
			csv.add(date);
		}
		
		// CSVファイルを作成
		csvWriter.write(csv, CoreTools.getLocale(struct.getsUser_ID()), true);
		// CSVファイルをクライアントに出力
		struct.setDOWNLOAD_FILE(getCsvWriter().getFilePath());
	    
                //}}user_implement_dev:<controlCSVOut>
		logger.exiting("AD0140010Control"+":USER="+struct.getsUser_ID(),"controlCSVOut");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0140");
		logger.entering("AD0140010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
		setList(null);
		// 検索状態を「初期状態」に設定
		setReadStatus(INITIAL);
                //}}user_implement_dev:<controlClear>
		logger.exiting("AD0140010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * 閉じるボタン押下時に実行される処理です。
	 *
	 */
	public void controlClose() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0140");
		logger.entering("AD0140010Control"+":USER="+struct.getsUser_ID(),"controlClose");
			//{{user_implement_dev:<controlClose>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlClose>
		logger.exiting("AD0140010Control"+":USER="+struct.getsUser_ID(),"controlClose");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0140");
		logger.entering("AD0140010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AD0140010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0140");
		logger.entering("AD0140010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
		try{
			
			// 業務運用日取得
			try {
				DateCtrlStruct dateCtrl = DateCtrlControl.getData(conn, getsysPLANT_CD());
				_businessOprDate = dateCtrl.getBUSINESS_OPR_DATE();
			} catch(DataNotFoundException e) {
				ExpjMessage emsg = new ExpjMessage("AC34080" );
				sysLog.severe(emsg, getsysUSER_CD());//致命的エラー エラー内容
				ExpjException ee = new ExpjException(e, emsg); // エクセプションを生成
				ee.setLocale(CoreTools.getLocale(getsysUSER_CD()));
				setReadStatus(ERROR);
				throw ee;
			}
			
			// コンボボックスデータ用意
	 		ComboBox combBox = new ComboBox(conn, sysUSER_CD);
			// コンボボックスのデータを取得
			_COM_ERR_TYP = combBox.getData("DAILY_WORK_REP_CSV_ERR_TYP_01");
			// 日報区分
			_DAILY_WORK_REPORT_TYP_01 = combBox.getData("DAILY_WORK_REPORT_TYP_01");
			// 作業区分
			_OPR_TYP_CD_01 = combBox.getData("OPR_TYP_CD_01");
			// 不作業理由
			_UN_OPR_CAUSE_CD_01 = combBox.getData("UN_OPR_CAUSE_CD_01");
			
			// 作業時間の上限値
			PrivateConfig privateConfig = new PrivateConfig(conn);
			_MAX_OPR_TIME = privateConfig.getString("WORK_REPORT_MAX_OPR_TIME");
			// ［システムパラメータ］が存在しない
			if (isNull(_MAX_OPR_TIME)) {
				ExpjMessage emsg = new ExpjMessage("AD61001" );
				sysLog.severe(emsg, getsysUSER_CD());//致命的エラー エラー内容
				ExpjException ee = new ExpjException(emsg); // エクセプションを生成
				ee.setLocale(CoreTools.getLocale(getsysUSER_CD()));
				setReadStatus(ERROR);
				throw ee;
			}
		} catch(SQLException e) {
			e.printStackTrace();
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());//致命的エラー エラー内容
			ExpjException ee = new ExpjException(e, emsg); // エクセプションを生成
			ee.setLocale(CoreTools.getLocale(getsysUSER_CD()));
			throw ee;
		} catch(ExpjException e) {
			throw e;
		} catch(Exception e) {
			e.printStackTrace();
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());//致命的エラー エラー内容
			ExpjException ee = new ExpjException(e, emsg); // エクセプションを生成
			ee.setLocale(CoreTools.getLocale(getsysUSER_CD()));
			throw ee;
		} 

                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AD0140010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * イベントハンドラの前処理です。
	 *
	 * @param buttun ボタン名
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0140");
		logger.entering("AD0140010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");
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
		logger.exiting("AD0140010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
//			throw new FoundationException("AD0140010Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AD0140010-E999","CSVの出力処理"));
			throw new FoundationException("AD0140010Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AD0140010-E999","システム日付の取得処理"));
				throw new FoundationException("AD0140010Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AD0140010-E999","コントロールのイベント処理"));
			throw new FoundationException("AD0140010Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected AD0140010Entity entity;
	protected AD0140010Struct struct;
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

		entity = new AD0140010Entity();
		struct = new AD0140010Struct();

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
	 * AD0140010クラスの標準コンストラクタ
	 */
	public AD0140010Control() throws BusinessProcessException, FoundationException
	{
		initialize();

		//conn = connect();
		//{{user_implement_code_constractor
			// TODO: ここに初期処理を記述してください
		try {
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
				AD0140010Struct key = (AD0140010Struct)keyList.get(j);
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
				if(msgKeyType.containsKeyColumn("l_ERR_INFO") && key.getl_ERR_INFO() != null) {
					msgKey.setKeyValue("l_ERR_INFO", key.getl_ERR_INFO());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_CTR_NM") && key.getl_ERR_CTR_NM() != null) {
					msgKey.setKeyValue("l_ERR_CTR_NM", key.getl_ERR_CTR_NM());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_PLANT_NO") && key.getl_ERR_PLANT_NO() != null) {
					msgKey.setKeyValue("l_ERR_PLANT_NO", key.getl_ERR_PLANT_NO());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_DAILY_WORK_REPORT_TYP") && key.getl_ERR_DAILY_WORK_REPORT_TYP() != null) {
					msgKey.setKeyValue("l_ERR_DAILY_WORK_REPORT_TYP", key.getl_ERR_DAILY_WORK_REPORT_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_USER_CD") && key.getl_ERR_USER_CD() != null) {
					msgKey.setKeyValue("l_ERR_USER_CD", key.getl_ERR_USER_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_OPR_DATE") && key.getl_ERR_OPR_DATE() != null) {
					msgKey.setKeyValue("l_ERR_OPR_DATE", key.getl_ERR_OPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_WORK_SHIFT_CODE") && key.getl_ERR_WORK_SHIFT_CODE() != null) {
					msgKey.setKeyValue("l_ERR_WORK_SHIFT_CODE", key.getl_ERR_WORK_SHIFT_CODE());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_WS_CD") && key.getl_ERR_WS_CD() != null) {
					msgKey.setKeyValue("l_ERR_WS_CD", key.getl_ERR_WS_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_TYP") && key.getl_ERR_TYP() != null) {
					msgKey.setKeyValue("l_ERR_TYP", key.getl_ERR_TYP());
				}
				if(msgKeyType.containsKeyColumn("WORK_SHIFT_CODE2") && key.getWORK_SHIFT_CODE2() != null) {
					msgKey.setKeyValue("WORK_SHIFT_CODE2", key.getWORK_SHIFT_CODE2());
				}
				if(msgKeyType.containsKeyColumn("WS_CD1") && key.getWS_CD1() != null) {
					msgKey.setKeyValue("WS_CD1", key.getWS_CD1());
				}
				if(msgKeyType.containsKeyColumn("START_TIME1") && key.getSTART_TIME1() != null) {
					msgKey.setKeyValue("START_TIME1", key.getSTART_TIME1());
				}
				if(msgKeyType.containsKeyColumn("END_TIME1") && key.getEND_TIME1() != null) {
					msgKey.setKeyValue("END_TIME1", key.getEND_TIME1());
				}
				if(msgKeyType.containsKeyColumn("OPR_TYP1") && key.getOPR_TYP1() != null) {
					msgKey.setKeyValue("OPR_TYP1", key.getOPR_TYP1());
				}
				if(msgKeyType.containsKeyColumn("UN_OPR_CAUSE_TYP1") && key.getUN_OPR_CAUSE_TYP1() != null) {
					msgKey.setKeyValue("UN_OPR_CAUSE_TYP1", key.getUN_OPR_CAUSE_TYP1());
				}
				if(msgKeyType.containsKeyColumn("UN_OPR_TIME1") && key.getUN_OPR_TIME1() != null) {
					msgKey.setKeyValue("UN_OPR_TIME1", key.getUN_OPR_TIME1());
				}
				if(msgKeyType.containsKeyColumn("REMARKS1") && key.getREMARKS1() != null) {
					msgKey.setKeyValue("REMARKS1", key.getREMARKS1());
				}
				if(msgKeyType.containsKeyColumn("WS_CD2") && key.getWS_CD2() != null) {
					msgKey.setKeyValue("WS_CD2", key.getWS_CD2());
				}
				if(msgKeyType.containsKeyColumn("START_TIME2") && key.getSTART_TIME2() != null) {
					msgKey.setKeyValue("START_TIME2", key.getSTART_TIME2());
				}
				if(msgKeyType.containsKeyColumn("END_TIME2") && key.getEND_TIME2() != null) {
					msgKey.setKeyValue("END_TIME2", key.getEND_TIME2());
				}
				if(msgKeyType.containsKeyColumn("OPR_TYP2") && key.getOPR_TYP2() != null) {
					msgKey.setKeyValue("OPR_TYP2", key.getOPR_TYP2());
				}
				if(msgKeyType.containsKeyColumn("UN_OPR_CAUSE_TYP2") && key.getUN_OPR_CAUSE_TYP2() != null) {
					msgKey.setKeyValue("UN_OPR_CAUSE_TYP2", key.getUN_OPR_CAUSE_TYP2());
				}
				if(msgKeyType.containsKeyColumn("UN_OPR_TIME2") && key.getUN_OPR_TIME2() != null) {
					msgKey.setKeyValue("UN_OPR_TIME2", key.getUN_OPR_TIME2());
				}
				if(msgKeyType.containsKeyColumn("REMARKS2") && key.getREMARKS2() != null) {
					msgKey.setKeyValue("REMARKS2", key.getREMARKS2());
				}
				if(msgKeyType.containsKeyColumn("WS_CD3") && key.getWS_CD3() != null) {
					msgKey.setKeyValue("WS_CD3", key.getWS_CD3());
				}
				if(msgKeyType.containsKeyColumn("START_TIME3") && key.getSTART_TIME3() != null) {
					msgKey.setKeyValue("START_TIME3", key.getSTART_TIME3());
				}
				if(msgKeyType.containsKeyColumn("END_TIME3") && key.getEND_TIME3() != null) {
					msgKey.setKeyValue("END_TIME3", key.getEND_TIME3());
				}
				if(msgKeyType.containsKeyColumn("OPR_TYP3") && key.getOPR_TYP3() != null) {
					msgKey.setKeyValue("OPR_TYP3", key.getOPR_TYP3());
				}
				if(msgKeyType.containsKeyColumn("UN_OPR_CAUSE_TYP3") && key.getUN_OPR_CAUSE_TYP3() != null) {
					msgKey.setKeyValue("UN_OPR_CAUSE_TYP3", key.getUN_OPR_CAUSE_TYP3());
				}
				if(msgKeyType.containsKeyColumn("UN_OPR_TIME3") && key.getUN_OPR_TIME3() != null) {
					msgKey.setKeyValue("UN_OPR_TIME3", key.getUN_OPR_TIME3());
				}
				if(msgKeyType.containsKeyColumn("REMARKS3") && key.getREMARKS3() != null) {
					msgKey.setKeyValue("REMARKS3", key.getREMARKS3());
				}
				if(msgKeyType.containsKeyColumn("WS_CD4") && key.getWS_CD4() != null) {
					msgKey.setKeyValue("WS_CD4", key.getWS_CD4());
				}
				if(msgKeyType.containsKeyColumn("START_TIME4") && key.getSTART_TIME4() != null) {
					msgKey.setKeyValue("START_TIME4", key.getSTART_TIME4());
				}
				if(msgKeyType.containsKeyColumn("END_TIME4") && key.getEND_TIME4() != null) {
					msgKey.setKeyValue("END_TIME4", key.getEND_TIME4());
				}
				if(msgKeyType.containsKeyColumn("OPR_TYP4") && key.getOPR_TYP4() != null) {
					msgKey.setKeyValue("OPR_TYP4", key.getOPR_TYP4());
				}
				if(msgKeyType.containsKeyColumn("UN_OPR_CAUSE_TYP4") && key.getUN_OPR_CAUSE_TYP4() != null) {
					msgKey.setKeyValue("UN_OPR_CAUSE_TYP4", key.getUN_OPR_CAUSE_TYP4());
				}
				if(msgKeyType.containsKeyColumn("UN_OPR_TIME4") && key.getUN_OPR_TIME4() != null) {
					msgKey.setKeyValue("UN_OPR_TIME4", key.getUN_OPR_TIME4());
				}
				if(msgKeyType.containsKeyColumn("REMARKS4") && key.getREMARKS4() != null) {
					msgKey.setKeyValue("REMARKS4", key.getREMARKS4());
				}
				if(msgKeyType.containsKeyColumn("WS_CD5") && key.getWS_CD5() != null) {
					msgKey.setKeyValue("WS_CD5", key.getWS_CD5());
				}
				if(msgKeyType.containsKeyColumn("START_TIME5") && key.getSTART_TIME5() != null) {
					msgKey.setKeyValue("START_TIME5", key.getSTART_TIME5());
				}
				if(msgKeyType.containsKeyColumn("END_TIME5") && key.getEND_TIME5() != null) {
					msgKey.setKeyValue("END_TIME5", key.getEND_TIME5());
				}
				if(msgKeyType.containsKeyColumn("OPR_TYP5") && key.getOPR_TYP5() != null) {
					msgKey.setKeyValue("OPR_TYP5", key.getOPR_TYP5());
				}
				if(msgKeyType.containsKeyColumn("UN_OPR_CAUSE_TYP5") && key.getUN_OPR_CAUSE_TYP5() != null) {
					msgKey.setKeyValue("UN_OPR_CAUSE_TYP5", key.getUN_OPR_CAUSE_TYP5());
				}
				if(msgKeyType.containsKeyColumn("UN_OPR_TIME5") && key.getUN_OPR_TIME5() != null) {
					msgKey.setKeyValue("UN_OPR_TIME5", key.getUN_OPR_TIME5());
				}
				if(msgKeyType.containsKeyColumn("REMARKS5") && key.getREMARKS5() != null) {
					msgKey.setKeyValue("REMARKS5", key.getREMARKS5());
				}
				if(msgKeyType.containsKeyColumn("w_COLUMN_FLG") && key.getw_COLUMN_FLG() != null) {
					msgKey.setKeyValue("w_COLUMN_FLG", key.getw_COLUMN_FLG());
				}
				if(msgKeyType.containsKeyColumn("OPR_TYP6") && key.getOPR_TYP6() != null) {
					msgKey.setKeyValue("OPR_TYP6", key.getOPR_TYP6());
				}
				if(msgKeyType.containsKeyColumn("UN_OPR_CAUSE_TYP6") && key.getUN_OPR_CAUSE_TYP6() != null) {
					msgKey.setKeyValue("UN_OPR_CAUSE_TYP6", key.getUN_OPR_CAUSE_TYP6());
				}
				if(msgKeyType.containsKeyColumn("UN_OPR_TIME6") && key.getUN_OPR_TIME6() != null) {
					msgKey.setKeyValue("UN_OPR_TIME6", key.getUN_OPR_TIME6());
				}
				if(msgKeyType.containsKeyColumn("REMARKS6") && key.getREMARKS6() != null) {
					msgKey.setKeyValue("REMARKS6", key.getREMARKS6());
				}
				if(msgKeyType.containsKeyColumn("DAILY_WORK_REPORT_DATA_TYP_NULL") && key.getDAILY_WORK_REPORT_DATA_TYP_NULL() != null) {
					msgKey.setKeyValue("DAILY_WORK_REPORT_DATA_TYP_NULL", key.getDAILY_WORK_REPORT_DATA_TYP_NULL());
				}
				if(msgKeyType.containsKeyColumn("OPR_TIME2") && key.getOPR_TIME2() != null) {
					msgKey.setKeyValue("OPR_TIME2", key.getOPR_TIME2());
				}
				if(msgKeyType.containsKeyColumn("OPR_TIME3") && key.getOPR_TIME3() != null) {
					msgKey.setKeyValue("OPR_TIME3", key.getOPR_TIME3());
				}
				if(msgKeyType.containsKeyColumn("OPR_TIME4") && key.getOPR_TIME4() != null) {
					msgKey.setKeyValue("OPR_TIME4", key.getOPR_TIME4());
				}
				if(msgKeyType.containsKeyColumn("OPR_TIME5") && key.getOPR_TIME5() != null) {
					msgKey.setKeyValue("OPR_TIME5", key.getOPR_TIME5());
				}
				if(msgKeyType.containsKeyColumn("DAILY_WORK_REPORT_CTL_NO") && key.getDAILY_WORK_REPORT_CTL_NO() != null) {
					msgKey.setKeyValue("DAILY_WORK_REPORT_CTL_NO", key.getDAILY_WORK_REPORT_CTL_NO());
				}
				if(msgKeyType.containsKeyColumn("SEQ_NO") && key.getSEQ_NO() != null) {
					msgKey.setKeyValue("SEQ_NO", key.getSEQ_NO());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("DAILY_WORK_REPORT_TYP") && key.getDAILY_WORK_REPORT_TYP() != null) {
					msgKey.setKeyValue("DAILY_WORK_REPORT_TYP", key.getDAILY_WORK_REPORT_TYP());
				}
				if(msgKeyType.containsKeyColumn("USER_CD") && key.getUSER_CD() != null) {
					msgKey.setKeyValue("USER_CD", key.getUSER_CD());
				}
				if(msgKeyType.containsKeyColumn("OPR_DATE") && key.getOPR_DATE() != null) {
					msgKey.setKeyValue("OPR_DATE", key.getOPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("WORK_SHIFT_CODE") && key.getWORK_SHIFT_CODE() != null) {
					msgKey.setKeyValue("WORK_SHIFT_CODE", key.getWORK_SHIFT_CODE());
				}
				if(msgKeyType.containsKeyColumn("WS_CD") && key.getWS_CD() != null) {
					msgKey.setKeyValue("WS_CD", key.getWS_CD());
				}
				if(msgKeyType.containsKeyColumn("START_TIME") && key.getSTART_TIME() != null) {
					msgKey.setKeyValue("START_TIME", key.getSTART_TIME());
				}
				if(msgKeyType.containsKeyColumn("END_TIME") && key.getEND_TIME() != null) {
					msgKey.setKeyValue("END_TIME", key.getEND_TIME());
				}
				if(msgKeyType.containsKeyColumn("OPR_TIME") && key.getOPR_TIME() != null) {
					msgKey.setKeyValue("OPR_TIME", key.getOPR_TIME());
				}
				if(msgKeyType.containsKeyColumn("OPR_TYP") && key.getOPR_TYP() != null) {
					msgKey.setKeyValue("OPR_TYP", key.getOPR_TYP());
				}
				if(msgKeyType.containsKeyColumn("UN_OPR_CAUSE_TYP") && key.getUN_OPR_CAUSE_TYP() != null) {
					msgKey.setKeyValue("UN_OPR_CAUSE_TYP", key.getUN_OPR_CAUSE_TYP());
				}
				if(msgKeyType.containsKeyColumn("UN_OPR_TIME") && key.getUN_OPR_TIME() != null) {
					msgKey.setKeyValue("UN_OPR_TIME", key.getUN_OPR_TIME());
				}
				if(msgKeyType.containsKeyColumn("REMARKS") && key.getREMARKS() != null) {
					msgKey.setKeyValue("REMARKS", key.getREMARKS());
				}
				if(msgKeyType.containsKeyColumn("COUNT") && key.getCOUNT() != null) {
					msgKey.setKeyValue("COUNT", key.getCOUNT());
				}
				if(msgKeyType.containsKeyColumn("TIME_FLG1") && key.getTIME_FLG1() != null) {
					msgKey.setKeyValue("TIME_FLG1", key.getTIME_FLG1());
				}
				if(msgKeyType.containsKeyColumn("USER_CD2") && key.getUSER_CD2() != null) {
					msgKey.setKeyValue("USER_CD2", key.getUSER_CD2());
				}
				if(msgKeyType.containsKeyColumn("OPR_DATE2") && key.getOPR_DATE2() != null) {
					msgKey.setKeyValue("OPR_DATE2", key.getOPR_DATE2());
				}
				if(msgKeyType.containsKeyColumn("TIME_FLG2") && key.getTIME_FLG2() != null) {
					msgKey.setKeyValue("TIME_FLG2", key.getTIME_FLG2());
				}
				if(msgKeyType.containsKeyColumn("START_TIME6") && key.getSTART_TIME6() != null) {
					msgKey.setKeyValue("START_TIME6", key.getSTART_TIME6());
				}
				if(msgKeyType.containsKeyColumn("END_TIME6") && key.getEND_TIME6() != null) {
					msgKey.setKeyValue("END_TIME6", key.getEND_TIME6());
				}
				if(msgKeyType.containsKeyColumn("HOLIDAY_FLG") && key.getHOLIDAY_FLG() != null) {
					msgKey.setKeyValue("HOLIDAY_FLG", key.getHOLIDAY_FLG());
				}
				if(msgKeyType.containsKeyColumn("OPR_DATE3") && key.getOPR_DATE3() != null) {
					msgKey.setKeyValue("OPR_DATE3", key.getOPR_DATE3());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD2") && key.getPLANT_CD2() != null) {
					msgKey.setKeyValue("PLANT_CD2", key.getPLANT_CD2());
				}
				if(msgKeyType.containsKeyColumn("WORK_SHIFT_CODE3") && key.getWORK_SHIFT_CODE3() != null) {
					msgKey.setKeyValue("WORK_SHIFT_CODE3", key.getWORK_SHIFT_CODE3());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_CD") && key.getOPR_INST_CD() != null) {
					msgKey.setKeyValue("OPR_INST_CD", key.getOPR_INST_CD());
				}
				if(msgKeyType.containsKeyColumn("WS_CD6") && key.getWS_CD6() != null) {
					msgKey.setKeyValue("WS_CD6", key.getWS_CD6());
				}
				if(msgKeyType.containsKeyColumn("TARGET_PLANT_CD") && key.getTARGET_PLANT_CD() != null) {
					msgKey.setKeyValue("TARGET_PLANT_CD", key.getTARGET_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("TARGET_ITEM_NO") && key.getTARGET_ITEM_NO() != null) {
					msgKey.setKeyValue("TARGET_ITEM_NO", key.getTARGET_ITEM_NO());
				}
				if(msgKeyType.containsKeyColumn("TOTAL_OPR_TIME") && key.getTOTAL_OPR_TIME() != null) {
					msgKey.setKeyValue("TOTAL_OPR_TIME", key.getTOTAL_OPR_TIME());
				}
				if(msgKeyType.containsKeyColumn("PVC2LOGMODE") && key.getPVC2LOGMODE() != null) {
					msgKey.setKeyValue("PVC2LOGMODE", key.getPVC2LOGMODE());
				}
				if(msgKeyType.containsKeyColumn("PVC2OUTPUTMODE") && key.getPVC2OUTPUTMODE() != null) {
					msgKey.setKeyValue("PVC2OUTPUTMODE", key.getPVC2OUTPUTMODE());
				}
				if(msgKeyType.containsKeyColumn("PVC2OUTPUTPATH") && key.getPVC2OUTPUTPATH() != null) {
					msgKey.setKeyValue("PVC2OUTPUTPATH", key.getPVC2OUTPUTPATH());
				}
				if(msgKeyType.containsKeyColumn("PVC2OUTPUTNAME") && key.getPVC2OUTPUTNAME() != null) {
					msgKey.setKeyValue("PVC2OUTPUTNAME", key.getPVC2OUTPUTNAME());
				}
				if(msgKeyType.containsKeyColumn("PVC2USERID") && key.getPVC2USERID() != null) {
					msgKey.setKeyValue("PVC2USERID", key.getPVC2USERID());
				}
				if(msgKeyType.containsKeyColumn("PVC2BUSINESSNAME") && key.getPVC2BUSINESSNAME() != null) {
					msgKey.setKeyValue("PVC2BUSINESSNAME", key.getPVC2BUSINESSNAME());
				}
				if(msgKeyType.containsKeyColumn("PVC2PLANTCD") && key.getPVC2PLANTCD() != null) {
					msgKey.setKeyValue("PVC2PLANTCD", key.getPVC2PLANTCD());
				}
				if(msgKeyType.containsKeyColumn("RETURN_MESSAGE") && key.getRETURN_MESSAGE() != null) {
					msgKey.setKeyValue("RETURN_MESSAGE", key.getRETURN_MESSAGE());
				}
				if(msgKeyType.containsKeyColumn("RETURN_STATUS") && key.getRETURN_STATUS() != null) {
					msgKey.setKeyValue("RETURN_STATUS", key.getRETURN_STATUS());
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
					AD0140010Struct key = new AD0140010Struct();
					if(msgKeyType.containsKeyColumn("FileName")) {
						key.setFileName(msgKey.getKeyValue("FileName"));
					}
					if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE")) {
						key.setDOWNLOAD_FILE(msgKey.getKeyValue("DOWNLOAD_FILE"));
					}
					if(msgKeyType.containsKeyColumn("l_ERROR_IN")) {
						key.setl_ERROR_IN(msgKey.getKeyValue("l_ERROR_IN"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_INFO")) {
						key.setl_ERR_INFO(msgKey.getKeyValue("l_ERR_INFO"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_CTR_NM")) {
						key.setl_ERR_CTR_NM(msgKey.getKeyValue("l_ERR_CTR_NM"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_PLANT_NO")) {
						key.setl_ERR_PLANT_NO(msgKey.getKeyValue("l_ERR_PLANT_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_DAILY_WORK_REPORT_TYP")) {
						key.setl_ERR_DAILY_WORK_REPORT_TYP(msgKey.getKeyValue("l_ERR_DAILY_WORK_REPORT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_USER_CD")) {
						key.setl_ERR_USER_CD(msgKey.getKeyValue("l_ERR_USER_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_OPR_DATE")) {
						key.setl_ERR_OPR_DATE(msgKey.getKeyValue("l_ERR_OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_WORK_SHIFT_CODE")) {
						key.setl_ERR_WORK_SHIFT_CODE(msgKey.getKeyValue("l_ERR_WORK_SHIFT_CODE"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_WS_CD")) {
						key.setl_ERR_WS_CD(msgKey.getKeyValue("l_ERR_WS_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_TYP")) {
						key.setl_ERR_TYP(msgKey.getKeyValue("l_ERR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("WORK_SHIFT_CODE2")) {
						key.setWORK_SHIFT_CODE2(msgKey.getKeyValue("WORK_SHIFT_CODE2"));
					}
					if(msgKeyType.containsKeyColumn("WS_CD1")) {
						key.setWS_CD1(msgKey.getKeyValue("WS_CD1"));
					}
					if(msgKeyType.containsKeyColumn("START_TIME1")) {
						key.setSTART_TIME1(msgKey.getKeyValue("START_TIME1"));
					}
					if(msgKeyType.containsKeyColumn("END_TIME1")) {
						key.setEND_TIME1(msgKey.getKeyValue("END_TIME1"));
					}
					if(msgKeyType.containsKeyColumn("OPR_TYP1")) {
						key.setOPR_TYP1(msgKey.getKeyValue("OPR_TYP1"));
					}
					if(msgKeyType.containsKeyColumn("UN_OPR_CAUSE_TYP1")) {
						key.setUN_OPR_CAUSE_TYP1(msgKey.getKeyValue("UN_OPR_CAUSE_TYP1"));
					}
					if(msgKeyType.containsKeyColumn("UN_OPR_TIME1")) {
						key.setUN_OPR_TIME1(msgKey.getKeyValue("UN_OPR_TIME1"));
					}
					if(msgKeyType.containsKeyColumn("REMARKS1")) {
						key.setREMARKS1(msgKey.getKeyValue("REMARKS1"));
					}
					if(msgKeyType.containsKeyColumn("WS_CD2")) {
						key.setWS_CD2(msgKey.getKeyValue("WS_CD2"));
					}
					if(msgKeyType.containsKeyColumn("START_TIME2")) {
						key.setSTART_TIME2(msgKey.getKeyValue("START_TIME2"));
					}
					if(msgKeyType.containsKeyColumn("END_TIME2")) {
						key.setEND_TIME2(msgKey.getKeyValue("END_TIME2"));
					}
					if(msgKeyType.containsKeyColumn("OPR_TYP2")) {
						key.setOPR_TYP2(msgKey.getKeyValue("OPR_TYP2"));
					}
					if(msgKeyType.containsKeyColumn("UN_OPR_CAUSE_TYP2")) {
						key.setUN_OPR_CAUSE_TYP2(msgKey.getKeyValue("UN_OPR_CAUSE_TYP2"));
					}
					if(msgKeyType.containsKeyColumn("UN_OPR_TIME2")) {
						key.setUN_OPR_TIME2(msgKey.getKeyValue("UN_OPR_TIME2"));
					}
					if(msgKeyType.containsKeyColumn("REMARKS2")) {
						key.setREMARKS2(msgKey.getKeyValue("REMARKS2"));
					}
					if(msgKeyType.containsKeyColumn("WS_CD3")) {
						key.setWS_CD3(msgKey.getKeyValue("WS_CD3"));
					}
					if(msgKeyType.containsKeyColumn("START_TIME3")) {
						key.setSTART_TIME3(msgKey.getKeyValue("START_TIME3"));
					}
					if(msgKeyType.containsKeyColumn("END_TIME3")) {
						key.setEND_TIME3(msgKey.getKeyValue("END_TIME3"));
					}
					if(msgKeyType.containsKeyColumn("OPR_TYP3")) {
						key.setOPR_TYP3(msgKey.getKeyValue("OPR_TYP3"));
					}
					if(msgKeyType.containsKeyColumn("UN_OPR_CAUSE_TYP3")) {
						key.setUN_OPR_CAUSE_TYP3(msgKey.getKeyValue("UN_OPR_CAUSE_TYP3"));
					}
					if(msgKeyType.containsKeyColumn("UN_OPR_TIME3")) {
						key.setUN_OPR_TIME3(msgKey.getKeyValue("UN_OPR_TIME3"));
					}
					if(msgKeyType.containsKeyColumn("REMARKS3")) {
						key.setREMARKS3(msgKey.getKeyValue("REMARKS3"));
					}
					if(msgKeyType.containsKeyColumn("WS_CD4")) {
						key.setWS_CD4(msgKey.getKeyValue("WS_CD4"));
					}
					if(msgKeyType.containsKeyColumn("START_TIME4")) {
						key.setSTART_TIME4(msgKey.getKeyValue("START_TIME4"));
					}
					if(msgKeyType.containsKeyColumn("END_TIME4")) {
						key.setEND_TIME4(msgKey.getKeyValue("END_TIME4"));
					}
					if(msgKeyType.containsKeyColumn("OPR_TYP4")) {
						key.setOPR_TYP4(msgKey.getKeyValue("OPR_TYP4"));
					}
					if(msgKeyType.containsKeyColumn("UN_OPR_CAUSE_TYP4")) {
						key.setUN_OPR_CAUSE_TYP4(msgKey.getKeyValue("UN_OPR_CAUSE_TYP4"));
					}
					if(msgKeyType.containsKeyColumn("UN_OPR_TIME4")) {
						key.setUN_OPR_TIME4(msgKey.getKeyValue("UN_OPR_TIME4"));
					}
					if(msgKeyType.containsKeyColumn("REMARKS4")) {
						key.setREMARKS4(msgKey.getKeyValue("REMARKS4"));
					}
					if(msgKeyType.containsKeyColumn("WS_CD5")) {
						key.setWS_CD5(msgKey.getKeyValue("WS_CD5"));
					}
					if(msgKeyType.containsKeyColumn("START_TIME5")) {
						key.setSTART_TIME5(msgKey.getKeyValue("START_TIME5"));
					}
					if(msgKeyType.containsKeyColumn("END_TIME5")) {
						key.setEND_TIME5(msgKey.getKeyValue("END_TIME5"));
					}
					if(msgKeyType.containsKeyColumn("OPR_TYP5")) {
						key.setOPR_TYP5(msgKey.getKeyValue("OPR_TYP5"));
					}
					if(msgKeyType.containsKeyColumn("UN_OPR_CAUSE_TYP5")) {
						key.setUN_OPR_CAUSE_TYP5(msgKey.getKeyValue("UN_OPR_CAUSE_TYP5"));
					}
					if(msgKeyType.containsKeyColumn("UN_OPR_TIME5")) {
						key.setUN_OPR_TIME5(msgKey.getKeyValue("UN_OPR_TIME5"));
					}
					if(msgKeyType.containsKeyColumn("REMARKS5")) {
						key.setREMARKS5(msgKey.getKeyValue("REMARKS5"));
					}
					if(msgKeyType.containsKeyColumn("w_COLUMN_FLG")) {
						key.setw_COLUMN_FLG(msgKey.getKeyValue("w_COLUMN_FLG"));
					}
					if(msgKeyType.containsKeyColumn("OPR_TYP6")) {
						key.setOPR_TYP6(msgKey.getKeyValue("OPR_TYP6"));
					}
					if(msgKeyType.containsKeyColumn("UN_OPR_CAUSE_TYP6")) {
						key.setUN_OPR_CAUSE_TYP6(msgKey.getKeyValue("UN_OPR_CAUSE_TYP6"));
					}
					if(msgKeyType.containsKeyColumn("UN_OPR_TIME6")) {
						key.setUN_OPR_TIME6(msgKey.getKeyValue("UN_OPR_TIME6"));
					}
					if(msgKeyType.containsKeyColumn("REMARKS6")) {
						key.setREMARKS6(msgKey.getKeyValue("REMARKS6"));
					}
					if(msgKeyType.containsKeyColumn("DAILY_WORK_REPORT_DATA_TYP_NULL")) {
						key.setDAILY_WORK_REPORT_DATA_TYP_NULL(msgKey.getKeyValue("DAILY_WORK_REPORT_DATA_TYP_NULL"));
					}
					if(msgKeyType.containsKeyColumn("OPR_TIME2")) {
						key.setOPR_TIME2(msgKey.getKeyValue("OPR_TIME2"));
					}
					if(msgKeyType.containsKeyColumn("OPR_TIME3")) {
						key.setOPR_TIME3(msgKey.getKeyValue("OPR_TIME3"));
					}
					if(msgKeyType.containsKeyColumn("OPR_TIME4")) {
						key.setOPR_TIME4(msgKey.getKeyValue("OPR_TIME4"));
					}
					if(msgKeyType.containsKeyColumn("OPR_TIME5")) {
						key.setOPR_TIME5(msgKey.getKeyValue("OPR_TIME5"));
					}
					if(msgKeyType.containsKeyColumn("DAILY_WORK_REPORT_CTL_NO")) {
						key.setDAILY_WORK_REPORT_CTL_NO(msgKey.getKeyValue("DAILY_WORK_REPORT_CTL_NO"));
					}
					if(msgKeyType.containsKeyColumn("SEQ_NO")) {
						key.setSEQ_NO(msgKey.getKeyValue("SEQ_NO"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("DAILY_WORK_REPORT_TYP")) {
						key.setDAILY_WORK_REPORT_TYP(msgKey.getKeyValue("DAILY_WORK_REPORT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("USER_CD")) {
						key.setUSER_CD(msgKey.getKeyValue("USER_CD"));
					}
					if(msgKeyType.containsKeyColumn("OPR_DATE")) {
						key.setOPR_DATE(msgKey.getKeyValue("OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("WORK_SHIFT_CODE")) {
						key.setWORK_SHIFT_CODE(msgKey.getKeyValue("WORK_SHIFT_CODE"));
					}
					if(msgKeyType.containsKeyColumn("WS_CD")) {
						key.setWS_CD(msgKey.getKeyValue("WS_CD"));
					}
					if(msgKeyType.containsKeyColumn("START_TIME")) {
						key.setSTART_TIME(msgKey.getKeyValue("START_TIME"));
					}
					if(msgKeyType.containsKeyColumn("END_TIME")) {
						key.setEND_TIME(msgKey.getKeyValue("END_TIME"));
					}
					if(msgKeyType.containsKeyColumn("OPR_TIME")) {
						key.setOPR_TIME(msgKey.getKeyValue("OPR_TIME"));
					}
					if(msgKeyType.containsKeyColumn("OPR_TYP")) {
						key.setOPR_TYP(msgKey.getKeyValue("OPR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("UN_OPR_CAUSE_TYP")) {
						key.setUN_OPR_CAUSE_TYP(msgKey.getKeyValue("UN_OPR_CAUSE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("UN_OPR_TIME")) {
						key.setUN_OPR_TIME(msgKey.getKeyValue("UN_OPR_TIME"));
					}
					if(msgKeyType.containsKeyColumn("REMARKS")) {
						key.setREMARKS(msgKey.getKeyValue("REMARKS"));
					}
					if(msgKeyType.containsKeyColumn("COUNT")) {
						key.setCOUNT(msgKey.getKeyValue("COUNT"));
					}
					if(msgKeyType.containsKeyColumn("TIME_FLG1")) {
						key.setTIME_FLG1(msgKey.getKeyValue("TIME_FLG1"));
					}
					if(msgKeyType.containsKeyColumn("USER_CD2")) {
						key.setUSER_CD2(msgKey.getKeyValue("USER_CD2"));
					}
					if(msgKeyType.containsKeyColumn("OPR_DATE2")) {
						key.setOPR_DATE2(msgKey.getKeyValue("OPR_DATE2"));
					}
					if(msgKeyType.containsKeyColumn("TIME_FLG2")) {
						key.setTIME_FLG2(msgKey.getKeyValue("TIME_FLG2"));
					}
					if(msgKeyType.containsKeyColumn("START_TIME6")) {
						key.setSTART_TIME6(msgKey.getKeyValue("START_TIME6"));
					}
					if(msgKeyType.containsKeyColumn("END_TIME6")) {
						key.setEND_TIME6(msgKey.getKeyValue("END_TIME6"));
					}
					if(msgKeyType.containsKeyColumn("HOLIDAY_FLG")) {
						key.setHOLIDAY_FLG(msgKey.getKeyValue("HOLIDAY_FLG"));
					}
					if(msgKeyType.containsKeyColumn("OPR_DATE3")) {
						key.setOPR_DATE3(msgKey.getKeyValue("OPR_DATE3"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD2")) {
						key.setPLANT_CD2(msgKey.getKeyValue("PLANT_CD2"));
					}
					if(msgKeyType.containsKeyColumn("WORK_SHIFT_CODE3")) {
						key.setWORK_SHIFT_CODE3(msgKey.getKeyValue("WORK_SHIFT_CODE3"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_CD")) {
						key.setOPR_INST_CD(msgKey.getKeyValue("OPR_INST_CD"));
					}
					if(msgKeyType.containsKeyColumn("WS_CD6")) {
						key.setWS_CD6(msgKey.getKeyValue("WS_CD6"));
					}
					if(msgKeyType.containsKeyColumn("TARGET_PLANT_CD")) {
						key.setTARGET_PLANT_CD(msgKey.getKeyValue("TARGET_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("TARGET_ITEM_NO")) {
						key.setTARGET_ITEM_NO(msgKey.getKeyValue("TARGET_ITEM_NO"));
					}
					if(msgKeyType.containsKeyColumn("TOTAL_OPR_TIME")) {
						key.setTOTAL_OPR_TIME(msgKey.getKeyValue("TOTAL_OPR_TIME"));
					}
					if(msgKeyType.containsKeyColumn("PVC2LOGMODE")) {
						key.setPVC2LOGMODE(msgKey.getKeyValue("PVC2LOGMODE"));
					}
					if(msgKeyType.containsKeyColumn("PVC2OUTPUTMODE")) {
						key.setPVC2OUTPUTMODE(msgKey.getKeyValue("PVC2OUTPUTMODE"));
					}
					if(msgKeyType.containsKeyColumn("PVC2OUTPUTPATH")) {
						key.setPVC2OUTPUTPATH(msgKey.getKeyValue("PVC2OUTPUTPATH"));
					}
					if(msgKeyType.containsKeyColumn("PVC2OUTPUTNAME")) {
						key.setPVC2OUTPUTNAME(msgKey.getKeyValue("PVC2OUTPUTNAME"));
					}
					if(msgKeyType.containsKeyColumn("PVC2USERID")) {
						key.setPVC2USERID(msgKey.getKeyValue("PVC2USERID"));
					}
					if(msgKeyType.containsKeyColumn("PVC2BUSINESSNAME")) {
						key.setPVC2BUSINESSNAME(msgKey.getKeyValue("PVC2BUSINESSNAME"));
					}
					if(msgKeyType.containsKeyColumn("PVC2PLANTCD")) {
						key.setPVC2PLANTCD(msgKey.getKeyValue("PVC2PLANTCD"));
					}
					if(msgKeyType.containsKeyColumn("RETURN_MESSAGE")) {
						key.setRETURN_MESSAGE(msgKey.getKeyValue("RETURN_MESSAGE"));
					}
					if(msgKeyType.containsKeyColumn("RETURN_STATUS")) {
						key.setRETURN_STATUS(msgKey.getKeyValue("RETURN_STATUS"));
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
