/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AD0110/src/com/nec/jp/orteus/metamorBase/AD0110/AD0110010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AD0110;

import com.nec.jp.orteus.metamorBase.AD0110.*;
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
import java.math.BigDecimal;
import com.nec.jp.orteus.metamorBase.common.CollectNumber.CollectNumber;
import com.nec.jp.orteus.metamorBase.common04.sysdata.DateCtrlControl;
import com.nec.jp.orteus.metamorBase.common04.sysdata.DateCtrlStruct;
import com.nec.jp.orteus.metamorBase.common04.util.DataNotFoundException;
import com.nec.jp.orteus.expj.pr.rcvissue.process.WhAutoIssueProc;
import com.nec.jp.orteus.expj.pr.rcvissue.process.WhAutoIssueProc.AutoIssueParam;
import java.text.ParseException ;
import com.nec.jp.orteus.expj.lot.BizCommon;
import java.text.CharacterIterator;
import java.text.StringCharacterIterator;

import com.nec.jp.orteus.expj.pr.rcvissue.process.AutoIssue;
import com.nec.jp.orteus.expj.pr.rcvissue.process.RcvCancel;
import com.nec.jp.orteus.expj.pr.rcvissue.process.ValidateWh;
//}}user_implement_code_import

//{{user_implement_code_header
/**
 * CLASS     : AD0110010Control クラス
 * 			出来高実績CSV取込
 * @author $Author: geng-jia $
 * @version $Revision: 1.6 $ $Date: 2015/12/22 10:04:26 $
 *
 */
//}}user_implement_code_header

public class AD0110010Control
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
	public AD0110010Struct getListvalue(int x) { return (AD0110010Struct)(this.list.get(x)); }	// リストの値を返します。
	public AD0110010Struct getStruct() { return this.struct; }	// Structの値を返します。
	public AD0110010Struct createStruct() { return new AD0110010Struct(); }	// 新しいStructを作って返します。
	public void setStruct(Object structname) { this.struct.setStruct((AD0110010Struct)structname); }	// Structをセットします。
	public void initializeStruct() { this.struct.initialize(); }	// Structの値を初期化します。

	// CSV出力用リスト
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	public AD0110010Struct mItemStruct = new AD0110010Struct();

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
	/**ワーニング件数**/
	private int _intWarningCount1 = 0;
	private boolean warningFlg = false;
	/** システムログメッセージ作成用 */
	private StringBuffer _sysLogMessage;
	
	//作業実績更新対象Struct
	private AD0110010Struct rsltStruct = new AD0110010Struct();
	//品目別仕掛更新対象Struct
	private AD0110010Struct procByItemStruct = new AD0110010Struct();
	
	
	/** ＣＳＶ項目番号定義 */
	// 工場コード
	private final int CSV_PLANT_CD = 0;
	// 品目番号
	private final int CSV_ITEM_CD = 1;
	// 作業区コード
	private final int CSV_WS_CD = 2;
	// 作業日
	private final int CSV_OPR_DATE = 3;
	// 作業日
	private final int CSV_WH_CD = 4;
	// 良品数
	private final int CSV_ACPT_QTY = 5;
	// 不良数
	private final int CSV_DEFECT_QTY = 6;
	// 不良理由コード
	private final int CSV_DEFECT_CAUSE_CD = 7;
	// 不良備考
	private final int CSV_DEFECT_COMMENT = 8;
	// 作業担当者コード
	private final int CSV_OUTPUT_RSLT_PERSON = 9;
	// 作業時間単位区分
	private final int CSV_OPR_TIME_UNIT_TYP = 10;
	// 作業時間
	private final int CSV_OPR_TIME = 11;
	// 製造ロット番号
	private final int CSV_VEND_LOT_NO = 12;
	// 在庫ロット番号
	private final int CSV_LOT_NO = 13;
	// 前段取時間
	private final int CSV_PRE_ARRANGEMENT_TIME = 14;
	// 後段取時間
	private final int CSV_POST_ARRANGEMENT_TIME = 15;
	// 停止時間
	private final int CSV_CESSATION_TIME = 16;
	// 停止理由
	private final int CSV_CESSATION_CAUSE = 17;
	// 備考
	private final int CSV_OUTPUT_RSLT_COMMENT = 18;

	// ＣＳＶ取込データ必要項目数(合計)
	private final int CSV_NECESSARY_COLUMN = 19;
	
	// 199
	private final int CSV_COLNO_199 = 199;
	// エラーメッセージ
	private ExpjMessage _emsg = null;
	
	// 在庫ロット番号
	private String strLotNo = null;
	
	// 出来高実績番号
	private String strOutputRsldCd = null;
	
	/*会社コード*/
	public String _company_cd = null;

	// 設定値
	private String strValus = null;

	
	// 多言語項目取得対応
	private String _locale = CoreTools.getLocale(sysUSER_CD);
	ResourceBundle _resource = CoreTools.getResourceBundle("OrteusUserDic", _locale);

	/** 業務運用日*/
	private String _btmBusinessOprDate;
	
	// コンボボックス定義
	// エラー状態区分
	private ComboStruct _COM_ERR_TYP = null;
	// 作業時間単位区分
	private ComboStruct _OPR_TIME_UNIT_TYP = null;
	
	// 不良理由コード
	private ComboStruct _DEFECT_CAUSE_CD_INNER = null;
	

	/**
	 * 業務ロジックのエラーメッセージ設定処理を切り出して関数化
	 * @param db1 データベース項目１
	 * @param value1 置換文字列１
	 */
	private void setSupportMessage(String db1, String value1) {
		_sysLogMessage = new StringBuffer();
		_sysLogMessage.append(db1);
		_sysLogMessage.append(":");
		_sysLogMessage.append(value1);
		ExpjMessage emsg = new ExpjMessage("ZZ01006", _sysLogMessage.toString());
		msgStruct.addError(emsg);
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
	 * 業務ロジックのインフォメーション設定処理を切り出して関数化
	 * @param code
	 */
	private void setInfoMessage(String code) {
		ExpjMessage emsg = new ExpjMessage(code);
		msgStruct.addInfo(emsg);
		sysLog.info(emsg, sysUSER_CD);
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
	
	/**
	 * 業務ロジックのシステムログ(エラー)設定処理を切り出して関数化
	 * @param db1 データベース項目１
	 * @param value1 置換文字列１
	 */
	private void setWarningSysLogMessage(String db1, String value1) {
		_sysLogMessage = new StringBuffer();
		_sysLogMessage.append(db1);
		_sysLogMessage.append(":");
		_sysLogMessage.append(value1);
		ExpjMessage emsg 
				= new ExpjMessage("ZZ01006",_sysLogMessage.toString());
		sysLog.warning(emsg, getsysUSER_CD());
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
	 * 実際原価管理パラメータの対象年月日取得
	 * @param in チェック日
	 * @param in チェック工場コード
	 * @param in AD0050010Struct
	 * @param in AD0050010Entity
	 * 戻り値 チェック結果
	 */
	private boolean checkProcExecDate(String checkDate,String plantCD, AD0110010Struct struct) throws BusinessProcessException, FoundationException {
		boolean checkResult = true;
		try {
			
			struct.setPLANT_CD(plantCD);
			List procExecDateList = entity.mselectSYS_ACTUAL_COST_CTRL_AC.read(conn, struct);
			// 実際原価管理パラメータに存在しない
			if(procExecDateList == null || procExecDateList.isEmpty()){
				return true;
			}
			AD0110010Struct procExecDateStruct = (AD0110010Struct) procExecDateList.get(0);
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
	 * 自動出庫を呼び出します。
	 * @param sFLG 作業完了フラグ(0:作業未完了 1:作業完了)
	 * @throws SQLException
	 * @throws Exception
	 */
	private boolean callCommonIssue(AD0110010Struct parStruct,String sFLG ,String plantCD, int m) 
			throws SQLException, Exception {

		//自動出庫呼び出し
		BigDecimal bdQty = new BigDecimal("0");
		if (rsltStruct.getACPT_QTY()!=null) {
			bdQty = new BigDecimal(rsltStruct.getACPT_QTY());
		}
		if (rsltStruct.getDEFECT_QTY()!=null) {
			bdQty = bdQty.add(new BigDecimal(rsltStruct.getDEFECT_QTY()));
		}
		if (rsltStruct.getOPR_CRCT_NO() == null 
				|| rsltStruct.getOPR_CRCT_NO().length() == 0) {
			rsltStruct.setOPR_CRCT_NO("0");
		}
		
		/********************
		 * 自動出庫処理開始 *
		 *******************/
		WhAutoIssueProc whAutoIssueProc = new WhAutoIssueProc(conn,
				plantCD,
				getsysUSER_CD(),
				sp.getProcId());
		WhAutoIssueProc.AutoIssueParam autoIssueParam = whAutoIssueProc.new AutoIssueParam();
		
		// パラメータのセット
		autoIssueParam.m_WORK_ODR_CD = procByItemStruct.getvc2WORK_ODR_CD();
		autoIssueParam.m_WORK_IN_PROC_CD = "";
		autoIssueParam.m_PARTIAL_PRD_NO = Integer.parseInt(rsltStruct.getPARTIAL_PRD_NO());
		autoIssueParam.m_OPR_RSLT_CRCT_NO = Integer.parseInt(rsltStruct.getOPR_CRCT_NO());
		autoIssueParam.m_PUCH_ODR_CD = "";
		autoIssueParam.m_ACPT_NO = 0;
		autoIssueParam.m_ACPT_RSLT_CRCT_NO = 0;
		autoIssueParam.m_RCV_ISSUE_TYP = 2;
		autoIssueParam.m_RCV_ISSUE_DATE = rsltStruct.getOPR_DATE();
		autoIssueParam.m_RCV_ISSUE_RSLT_NO = bdQty.toString();
		autoIssueParam.m_RCV_ISSUE_CMPLT_FLG = Integer.parseInt(sFLG);
		autoIssueParam.m_PLANT_CD = plantCD;
		
		AutoIssue autoIssue = new AutoIssue(conn,
				plantCD,getsysUSER_CD(),sp.getProcId());
		
		// 自動出庫実行
		boolean result = autoIssue.AutoIssueOpr(autoIssueParam);

		String message1 = "";
		if(result){
			// 業務アラームがあれば出力する。
			// 業務エラーの出力
			for (int n = 0; n < autoIssue.getWarnList().size(); n++) {
				message1 = message1 + "," + new ExpjMessage(autoIssue.getWarnList().get(n).toString()).getMessage(_locale);
			}
			if (!isNull(message1)) {
				message1 = message1.substring(1);
				csvExport(parStruct // 対象データ情報
						, "2" 		// エラー区分
						, m + 1 	// エラー発生行
						, null
						, new ExpjMessage("ZZ01006", message1).getMessage(_locale), null); // エラーメッセージ
				if (!warningFlg){
					_intWarningCount1++;
					warningFlg = true;
				}
			
			}

			return result;
		}else{
			// 業務エラーの出力
			for (int n = 0; n < autoIssue.getErrorList().size(); n++) {
				message1 = message1 + "," + new ExpjMessage(autoIssue.getErrorList().get(n).toString()).getMessage(_locale);
			}
			if (!isNull(message1)) {
				message1 = message1.substring(1);
				csvExport(parStruct					// 対象データ情報
						, "1"						// エラー区分
						, m + 1						// エラー発生行
						,null
						,new ExpjMessage("ZZ01006",message1).getMessage(_locale)
						,null);	// エラーメッセージ
				_intErrorCount++;
			}
		}
		return result;
	}

	/**
	 * 入庫処理を呼び出します。
	 * @param sFLG 作業完了フラグ(0:作業未完了 1:作業完了)
	 * @throws Exception
	 */
	private boolean callRcvCancel(AD0110010Struct parStruct, String sFLG ,String plantCD,int m) 
			throws Exception {

		//入出庫管理番号採番
		Numbering collectNum = 
				new Numbering(conn,
					CollectNumber.ISSUE_CD,
					getsysUSER_CD(),
					sp.getProcId(),
					plantCD);
		String no = collectNum.getNo();
		if (no == null || no.length() == 0) {
			//採番結果がない
			csvExport(parStruct					// 対象データ情報
					, "1"						// エラー区分
					, m + 1						// エラー発生行
					,null
					,new ExpjMessage("AE00152").getMessage(_locale)
					,null);	// エラーメッセージ
			_intErrorCount++;
			return false;
		}
		AD0110010Struct rcvIssueStruct = new AD0110010Struct();
		rcvIssueStruct.setsUser_ID(sysUSER_CD);

		rcvIssueStruct.setRCV_ISSUE_CTRL_CD(no);				//入出庫管理番号
		rcvIssueStruct.setRCV_ISSUE_TYP("1");					//入出庫区分
		rcvIssueStruct.setITEM_CD(rsltStruct.getITEM_CD());//品目番号
		rcvIssueStruct.setPLANT_CD(plantCD);			//工場コード
		rcvIssueStruct.setWH_CD(rsltStruct.getWH_CD());	//保管区コード
		rcvIssueStruct.setJOB_ODR_CD(null);					//製番
		rcvIssueStruct.setJOB_ODR_DETAIL_NO("0");				//製番枝番
		rcvIssueStruct.setPUCH_ODR_CD(null);					//発注番号
		rcvIssueStruct.setACPT_NO("0");							//受入回数
		rcvIssueStruct.setACPT_RSLT_CRCT_NO("0");				//受入実績訂正回数
		rcvIssueStruct.setINSPEC_RSLT_CRCT_NO("0");				//検査実績訂正回数

		rcvIssueStruct.setWORK_ODR_CD(procByItemStruct.getvc2WORK_ODR_CD());//作業計画番号
		rcvIssueStruct.setWORK_IN_PROC_CD(null);							//仕掛作業コード
		rcvIssueStruct.setPARTIAL_PRD_NO(rsltStruct.getPARTIAL_PRD_NO());//分作回数
		rcvIssueStruct.setOPR_RSLT_CRCT_NO(rsltStruct.getOPR_CRCT_NO());//作業実績訂正回数
		rcvIssueStruct.seth_ISSUE_INST_CD(null);						//出庫指示番号
		rcvIssueStruct.setRCV_ISSUE_QTY(rsltStruct.getACPT_QTY());		//入出庫数
		rcvIssueStruct.setRCV_ISSUE_AMOUNT("0");							//入出庫金額
		rcvIssueStruct.setRCV_ISSUE_DATE(rsltStruct.getOPR_DATE());		//入出庫年月日
		rcvIssueStruct.setRCV_ISSUE_GNR_TYP("11");								//入出庫発生区分
		rcvIssueStruct.setRCV_ISSUE_ODD_QTY("0");				//入出庫端数
		rcvIssueStruct.setDEFECT_CAUSE_CD(null);				//入出庫不良理由コード
		rcvIssueStruct.setSTOCK_UPD_TYP("1");					//在庫更新区分
		rcvIssueStruct.setRCV_ISSUE_CMPLT_FLG(sFLG);			//入出庫完了フラグ

		rcvIssueStruct.setOD_NO(procByItemStruct.getOD_NO());	//オーダデマンド番号
		rcvIssueStruct.setLOT_NO(rsltStruct.getLOT_NO());	//在庫ロット番号
		rcvIssueStruct.setVEND_LOT_NO(null);					//メーカロット番号
		rcvIssueStruct.setRCV_ISSUE_COMMENT(null);				//入出庫備考
		rcvIssueStruct.setCONS_TYP("0");						//支給区分
		rcvIssueStruct.setCOMPANY_CD(null);

		// 退避用手持ち在庫数を初期化
		rcvIssueStruct.setSAVE_STOCK_ON_HAND_QTY("0");


		//入庫処理
		RcvCancel RCan = 
				new RcvCancel(conn,rcvIssueStruct.getRCV_ISSUE_CTRL_CD(),getsysUSER_CD());
		
		//会社コード
		rcvIssueStruct.setCOMPANY_CD(_company_cd);
		
		//保管区別入出庫登録
		entity.minsertT_RCV_ISSUE.create(conn, rcvIssueStruct);
		boolean bRSLT = RCan.execProcess();

		String message1 = "";
		if (!bRSLT) {
			for (int n = 0; n < RCan.getErrorList().size(); n++) {
				message1 = message1 + "," + new ExpjMessage(RCan.getErrorList().get(n).toString()).getMessage(_locale);
			}
			if (!isNull(message1)) {
				message1 = message1.substring(1);
				csvExport(
						parStruct // 対象データ情報
						,
						"1" // エラー区分
						,
						m + 1 // エラー発生行
						, null,
						new ExpjMessage("ZZ01006", message1)
								.getMessage(_locale), null); // エラーメッセージ
				_intErrorCount++;
				return false;
			}
		}
		return true;
	}
	
	/**
	 * 出庫指示リストを設定します。
	 * @throws FoundationException
	 * @throws SQLException
	 * @throws BatchAppException 
	 */
	private boolean setIssueList(List mainIssueList,AD0110010Struct parStruct) 
			throws FoundationException, SQLException {

		//良品数
		BigDecimal acptQty = new BigDecimal(parStruct.getACPT_QTY());
		//不良数
		BigDecimal defectQty = new BigDecimal(parStruct.getDEFECT_QTY());
		
		//作業日(日付制御.業務運用日)のセット
		parStruct.setBUSINESS_OPR_DATE(_btmBusinessOprDate);


		for (int i = 0; i < mainIssueList.size(); i++ ) {
			BigDecimal planSum = acptQty.add(defectQty);
			AD0110010Struct tempIssueStruct = (AD0110010Struct)mainIssueList.get(i);
			tempIssueStruct.setsUser_ID(sysUSER_CD);
			//計画使用数量の取得
			int round = Integer.parseInt(tempIssueStruct.getl_UNIT_QTY_TYP());
			BigDecimal denominator = 
					new BigDecimal(tempIssueStruct.getISSUE_INST_UNIT_DENOMINATOR());
			BigDecimal numerator = 
					new BigDecimal(tempIssueStruct.getISSUE_INST_UNIT_NUMERATOR());


			//ロット管理対象外の場合、あるいは新規登録の場合
			if (tempIssueStruct.getLOT_NO() == null || tempIssueStruct.getLOT_NO().equals("")) {
				if (round == 1) {
					planSum = planSum.multiply(numerator).divide(denominator,0, BigDecimal.ROUND_UP).setScale(1);
				} else {
					planSum = planSum.multiply(numerator).divide(denominator,4, BigDecimal.ROUND_UP);

					// 小数の表示スケール処理
					BigDecimal intVal = new BigDecimal("" + planSum.intValue());
					BigDecimal decimalVal = planSum.subtract(intVal).multiply(
							new BigDecimal(10000));
					int decVal = decimalVal.intValue();
					int roundCount = 1;
					while (true) {
						decVal = decVal / 10;
						if (decVal == 0) {
							break;
						}
						roundCount++;
					}
					planSum = planSum.setScale(roundCount, BigDecimal.ROUND_UP);
				}
				// ロット割り当て済みの場合
			} else {
				// [ロット別使用実績]の使用予定数量を計画使用数量に設定
				planSum = new BigDecimal(tempIssueStruct.getSUPPLIED_ISSUE_QTY());
			}
			tempIssueStruct.setTEMP_PLAN_QTY(planSum.toString());
			
			//使用済数量、計画外使用済数量、更新使用数量の取得
			tempIssueStruct.setTEMP_USEOVER_QTY("0.0");
			tempIssueStruct.setTEMP_PLANOUT_QTY("0.0");
			tempIssueStruct.setTEMP_USE_QTY("0.0");
			
			//作業計画番号に出来高実績番号をセット
			List tempList = new ArrayList();
			AD0110010Struct tempStruct = null;
			tempStruct = new AD0110010Struct();
			tempStruct.setsUser_ID(sysUSER_CD);
			tempStruct.setWORK_ODR_CD(parStruct.getOUTPUT_RSLT_CD());  
			tempStruct.setITEM_CD(tempIssueStruct.getITEM_CD());
			tempStruct.seth_ISSUE_INST_CD(tempIssueStruct.geth_ISSUE_INST_CD());

			// ロット管理対象外の場合、あるいは新規登録の場合
			if (tempIssueStruct.getLOT_NO() == null || tempIssueStruct.getLOT_NO().equals("")) {
				// 保管区別入出庫の検索
				tempList = new ArrayList();
				tempList = entity.mselectRecvIssue.read(conn, tempStruct);
				if (tempList != null && tempList.size() != 0) {
					tempStruct = (AD0110010Struct) tempList.get(0);
					tempStruct.setsUser_ID(sysUSER_CD);
					BigDecimal bdIssue = new BigDecimal(tempStruct.getRCV_ISSUE_QTY());
					tempIssueStruct.setTEMP_USEOVER_QTY(bdIssue.negate().toString());
					if ("0".equals(tempStruct.getcount_RCV_ISSUE())) {
						tempIssueStruct.setTEMP_PLANOUT_QTY("0.0");
						tempIssueStruct.setTEMP_USE_QTY(planSum.toString());
					} else {
						BigDecimal useoverQty = new BigDecimal(tempIssueStruct.getTEMP_USEOVER_QTY());
						BigDecimal planoutQty = (planSum.subtract(useoverQty)).multiply(new BigDecimal(-1));
						tempIssueStruct.setTEMP_PLANOUT_QTY(planoutQty.toString());
						tempIssueStruct.setTEMP_USE_QTY("0.0");
					}
				}
				// ロット割り当て済みの場合
			} else {
				// [ロット別使用実績]の使用済数量を使用済数量に設定
				tempIssueStruct.setTEMP_USEOVER_QTY(tempIssueStruct.getTOTAL_ISSUE_QTY());

				// 計画外使用済数量に計画使用数量-使用済数量、更新使用数量に0を設定
				BigDecimal useoverQty = new BigDecimal(tempIssueStruct.getTEMP_USEOVER_QTY());
				BigDecimal planoutQty = (planSum.subtract(useoverQty)).multiply(new BigDecimal(-1));
				tempIssueStruct.setTEMP_PLANOUT_QTY(planoutQty.toString());
				tempIssueStruct.setTEMP_USE_QTY("0.0");
			}

			//明細用の変数にロット番号設定
			//tempIssueStruct.setl_LOT_NO(tempIssueStruct.getLOT_NO());
			tempIssueStruct.setRCV_ISSUE_DATE(parStruct.getOPR_DATE());
			if (parStruct.getOPR_DATE() == null || "".equals(parStruct.getOPR_DATE())){
				tempIssueStruct.setRCV_ISSUE_DATE(_btmBusinessOprDate);
			}
		}
		return true;
	}
	
	/**
	 * マニュアル出庫キット出庫を呼び出します。
	 * @param sFLG 作業完了フラグ(0:作業未完了 1:作業完了)
	 * @throws SQLException
	 * @throws Exception
	 */
	private boolean callManiaruIssue(AD0110010Struct parStruct,String plantCD, int m) 
	throws SQLException, Exception {
		boolean result=true;
		List UpdateAllList;
		///出来高実績検索
		List selectList = entity.mselectT_OUTPUT_RSLT.read(conn, parStruct);
		AD0110010Struct selectStruct = new AD0110010Struct();
		selectStruct = (AD0110010Struct)selectList.get(0);
		selectStruct.setsUser_ID(sysUSER_CD);
		//出来高実績番号設定
		selectStruct.setOUTPUT_RSLT_CD(parStruct.getOUTPUT_RSLT_CD());
		
		//出庫指示リスト取得
		UpdateAllList = entity.mselectIssue.read(conn, selectStruct);

		parStruct.setvc2PLANT_CD(parStruct.getPLANT_CD());
		//出庫指示リストを設定
		result = this.setIssueList(UpdateAllList, parStruct);
		if(result == false){
			return result;
		}
		
		for (int i = 0; i < UpdateAllList.size(); i++ ) {
			
			AD0110010Struct issueStruct = new AD0110010Struct();
			issueStruct = (AD0110010Struct)UpdateAllList.get(i);
			issueStruct.setsUser_ID(sysUSER_CD);

			issueStruct.setPARTIAL_PRD_NO("0");		//ZEROをセットする
			issueStruct.setJOB_ODR_CD(null);		//製番品目は処理対象外とする
		
			if (issueStruct.getTEMP_USE_QTY() == null 
					|| Double.parseDouble(issueStruct.getTEMP_USE_QTY()) == 0) {
				continue;	//更新使用数量がZEROの為以下の処理は行わず、次の行に移る
			}

			// 出来高実績番号の自動採番
			Numbering collectNum = 
				new Numbering(conn,
						CollectNumber.ISSUE_CD,
						sysUSER_CD,
						sp.getProcId(),
						plantCD);
			
			String no = collectNum.getNo();
			if (no == null || no.length() == 0) {
				//採番結果がない
				csvExport(parStruct					// 対象データ情報
						, "1"						// エラー区分
						, m + 1						// エラー発生行
						,null
						,new ExpjMessage("AE00152").getMessage(_locale)
						,null);	// エラーメッセージ
				_intErrorCount++;
				setReadStatus(ERROR);
				return false;
			}

			BigDecimal keepUseQty = new BigDecimal(issueStruct.getTEMP_USE_QTY());
			BigDecimal planQty = new BigDecimal(issueStruct.getTEMP_PLAN_QTY());
			BigDecimal useQty = new BigDecimal(issueStruct.getTEMP_USE_QTY());
			if (issueStruct.getl_UNIT_QTY_TYP() != null 
					&& "1".equals(issueStruct.getl_UNIT_QTY_TYP())) {
				//品目が整数管理品の場合、切上げを行う
				useQty = useQty.setScale(0,BigDecimal.ROUND_UP);
			}
			//修正内容を保持
			issueStruct.setRCV_ISSUE_CTRL_CD(no);
			issueStruct.setPLANT_CD(plantCD);
			//出来高実績番号
			issueStruct.setWORK_ODR_CD(parStruct.getOUTPUT_RSLT_CD());
			issueStruct.setWORK_IN_PROC_CD(null);

			issueStruct.setRCV_ISSUE_QTY(useQty.negate().toString());
			if (useQty.doubleValue() > 0) {
				//工程在庫出庫
				issueStruct.setRCV_ISSUE_GNR_TYP("51");
			} else {
				//工程在庫出庫取消
				issueStruct.setRCV_ISSUE_GNR_TYP("59");
			}

			issueStruct.setRCV_ISSUE_ODD_QTY(useQty.subtract(keepUseQty).toString());
			issueStruct.setOD_NO(null);
			issueStruct.setRCV_ISSUE_CMPLT_FLG("0");
			issueStruct.setSTOCK_UPD_TYP("2");
			issueStruct.setRCV_ISSUE_TYP("2");


			useQty = new BigDecimal(issueStruct.getTEMP_USE_QTY());
			BigDecimal stockQty = null;
			//工程仕掛在庫出庫処理
		
			//保管区別品目在庫更新
			List tempList = new ArrayList();
			AD0110010Struct tempStruct= new AD0110010Struct();
			tempList = entity.mselectItemStock.read(conn, issueStruct);
			AD0110010Struct stockStruct = new AD0110010Struct();
			stockStruct.setStructM(issueStruct);
			stockStruct.setsUser_ID(sysUSER_CD);
			// 退避用手持ち在庫数を初期化
			issueStruct.setSAVE_STOCK_ON_HAND_QTY("0");
		
			if (tempList.isEmpty()) {
				//登録
				useQty = useQty.negate();
				stockStruct.setSTOCK_ON_HAND_QTY(useQty.toString());
				
				entity.minsertItemStock.create(conn, stockStruct);
			} else {
				//更新
				tempStruct = new AD0110010Struct();
				tempStruct = (AD0110010Struct)tempList.get(0);
				stockStruct.setsUser_ID(sysUSER_CD);
				issueStruct.setSAVE_STOCK_ON_HAND_QTY(tempStruct.getSTOCK_ON_HAND_QTY());
				stockQty = new BigDecimal(tempStruct.getSTOCK_ON_HAND_QTY());
				if (useQty.doubleValue() > 0) { //出庫
					useQty = stockQty.subtract(useQty) ;
				} else { //入庫
					useQty = stockQty.add(useQty.negate()) ;
				}
				stockStruct.setSTOCK_ON_HAND_QTY(useQty.toString());
				
				entity.mupdateItemStock.update(conn, stockStruct);
			}
		
			issueStruct.setJOB_ODR_CD(null);			//製番
			issueStruct.setJOB_ODR_DETAIL_NO("0");		//製番枝番
			issueStruct.setACPT_NO("0");				//受入回数
			issueStruct.setACPT_RSLT_CRCT_NO("0");		//受入実績訂正回数
			issueStruct.setINSPEC_RSLT_CRCT_NO("0");	//検査実績訂正回数
			issueStruct.setOPR_RSLT_CRCT_NO("0");		//作業実績訂正回数
			issueStruct.setRCV_ISSUE_AMOUNT("0");		//入出庫金額
			issueStruct.setCONS_TYP("0");				//支給区分
			//会社コード
			issueStruct.setCOMPANY_CD(_company_cd);

			// ロット管理フラグ = 1(ロットレース管理を行う。)の場合
			if(issueStruct.getLOT_CTRL_FLG().equals("1")){
				issueStruct.setOUTPUT_RSLT_CD(parStruct.getOUTPUT_RSLT_CD());//出来高実績番号
				issueStruct.setOPR_DATE(parStruct.getOPR_DATE());

				//出庫実績明細取得
				List lotIssueList = entity.mselectT_LOT_ISSUE_INST.read(conn,issueStruct);

				//データがない場合
				if (lotIssueList == null || lotIssueList.size() == 0) {
					csvExport(parStruct					// 対象データ情報
							, "1"						// エラー区分
							, m + 1						// エラー発生行
							,null
							,new ExpjMessage("AD20135").getMessage(_locale)
							,null);	// エラーメッセージ
					_intErrorCount++;
					return false;
				}

				//使用残数設定
				BigDecimal remainQty = new BigDecimal(issueStruct.getTEMP_USE_QTY());

				AD0110010Struct lotUseStruct = new AD0110010Struct();
				lotUseStruct.setStructM(issueStruct);
				lotUseStruct.setsUser_ID(sysUSER_CD);

				for (int j = 0; j < lotIssueList.size(); j++ ) {
					AD0110010Struct lotIssueStruct = (AD0110010Struct)lotIssueList.get(j);

					//引き当て可能数設定
					BigDecimal issueQty = new BigDecimal(lotIssueStruct.getISSUE_QTY());//出庫実績数量
					BigDecimal spentQty = new BigDecimal(lotIssueStruct.getSPENT_QTY());//使用済
					BigDecimal availQty = issueQty.subtract(spentQty);

					//ロット別使用実績管理番号採番
					List seqList = entity.mSEQ_JF_RSLT.read(conn, parStruct);
					if(seqList != null && seqList.size() > 0){
						lotUseStruct.setRSLT_CTL_SEQ_NO(((AD0110010Struct)seqList.get(0)).getNEXTVAL());
					}

					//出庫指示番号、ロット番号設定
					lotUseStruct.seth_ISSUE_INST_CD(lotIssueStruct.geth_ISSUE_INST_CD());
					lotUseStruct.setLOT_NO(lotIssueStruct.getLOT_NO());

					BigDecimal useLotQty = null;

					//引き当て可能数 >= 使用残数の場合
					if(availQty.doubleValue() >= remainQty.doubleValue()){
						//使用残数を引き当て数に設定
						useLotQty = remainQty;
					//引き当て可能数 < 使用残数の場合
					} else {
						//最終データの場合
						if (j == lotIssueList.size() - 1) {
							//使用残数を使用数に設定
							useLotQty = remainQty;
						//最終データでない場合
						} else {
							//引当可能数が0より大きい場合
							if(availQty.doubleValue() > 0){
								//使用残数を使用数に設定
								useLotQty = remainQty;

								//次レコード以降を取得
								for (int k = j + 1; k < lotIssueList.size(); k++ ) {
									AD0110010Struct nextLotIssueStruct = (AD0110010Struct)lotIssueList.get(k);

									//引き当て可能数設定
									BigDecimal nextIssueQty = new BigDecimal(nextLotIssueStruct.getISSUE_QTY());
									BigDecimal nextSpentQty = new BigDecimal(nextLotIssueStruct.getSPENT_QTY());
									BigDecimal nextAvailQty = nextIssueQty.subtract(nextSpentQty);

									//次レコード以降に引当可能なデータがある場合
									if (nextAvailQty.doubleValue() > 0) {
										//引き当て可能数を使用数に設定
										useLotQty = availQty;
										break;
									}
								}
							//引当可能数が0以下の場合
							} else {
								//次のデータを取得
								continue;
							}
						}
					}

					//使用数が引当可能数より大きい場合
					if(useLotQty.doubleValue() > availQty.doubleValue()){
						//警告メッセージ出力
						csvExport(parStruct					// 対象データ情報
								, "2"						// エラー区分
								, m + 1						// エラー発生行
								,null
								,new ExpjMessage("AD20136").getMessage(_locale)
								,null);	// エラーメッセージ
						if(!warningFlg){
							_intWarningCount1++;
							warningFlg = true;
						}
					}

					//使用済数量、使用予定数量に上記で設定した使用数を設定
					lotUseStruct.setTOTAL_ISSUE_QTY(useLotQty.toString());
					lotUseStruct.setSUPPLIED_ISSUE_QTY(useLotQty.toString());

					//実績日を使用日に設定
					lotUseStruct.setSUPPLIED_DATE(lotUseStruct.getOPR_DATE());

					//[ロット別使用実績]の追加
					entity.mT_LOT_USE_RSLT.create(conn, lotUseStruct);

					//[出庫実績明細]の更新
					lotUseStruct.setSPENT_QTY(spentQty.add(useLotQty).toString());
					entity.mT_LOT_ISSUE_INST.update(conn, lotUseStruct);

					issueStruct.setLOT_NO(lotIssueStruct.getLOT_NO());
					issueStruct.setRCV_ISSUE_QTY(useLotQty.negate().toString());

					//ロット別品目在庫検索
					tempList = entity.mT_LOT_STOCK.read(conn,issueStruct);

					//更新前の在庫数設定
					if (tempList.isEmpty()) {
						issueStruct.setSAVE_STOCK_ON_HAND_QTY("0");
					} else {
						tempStruct = (AD0110010Struct)tempList.get(0);
						issueStruct.setSAVE_STOCK_ON_HAND_QTY(tempStruct.getSTOCK_ON_HAND_QTY());
					}

					//2件目以降のデータの場合
					if (j > 0) {
						//入出庫管理番号採番
						collectNum = 
							new Numbering(conn,
									CollectNumber.ISSUE_CD,
									sysUSER_CD,
									sp.getProcId(),
									plantCD);
						no = collectNum.getNo();
						if (no == null || no.length() == 0) {
							//採番結果がない
							csvExport(parStruct					// 対象データ情報
									, "1"						// エラー区分
									, m + 1						// エラー発生行
									,null
									,new ExpjMessage("AE00152").getMessage(_locale)
									,null);	// エラーメッセージ
							_intErrorCount++;
							return false;
						}
						issueStruct.setRCV_ISSUE_CTRL_CD(no);
					}

					//保管区別入出庫登録
					entity.minsertT_RCV_ISSUE.create(conn, issueStruct);

					//ロット別品目在庫更新
					BizCommon bc = new BizCommon(conn, sysUSER_CD, sp.getProcId(), plantCD);
					List updateLotStockList = bc.excUpdateLotStockFd(no, "");

					//異常終了の場合
					if(bc.getResultStatus().intValue() == 3){
						//エラーメッセージ取得
						if(updateLotStockList != null && updateLotStockList.size() > 0){
							csvExport(parStruct					// 対象データ情報
									, "1"						// エラー区分
									, m + 1						// エラー発生行
									,null
									,new ExpjMessage((String)updateLotStockList.get(0)).getMessage(_locale)
									,null);	// エラーメッセージ
							_intErrorCount++;
						}
						return false;
					}

					//ロット管理フラグ = 1(ロットトレース管理を行う。)の場合
					if(parStruct.getLOT_CTRL_FLG().equals("1")){
						//親品目の在庫ロット番号が指定されている場合
						if(parStruct.getLOT_NO() != null && !parStruct.getLOT_NO().equals("")){
							//ロットトレース登録・更新処理
							List lotTraceList = bc.excMakeLotTraceFd(issueStruct.getITEM_CD(),
								issueStruct.getLOT_NO(), parStruct.getITEM_CD(), parStruct.getLOT_NO(),
								"3");
							
							//正常終了の場合
							if(bc.getResultStatus().intValue() == 1){
								AD0110010Struct updateStruct = new AD0110010Struct();
								updateStruct.setFROM_ITEM_CD(issueStruct.getITEM_CD());
								updateStruct.setFROM_LOT_NO(issueStruct.getLOT_NO());
								updateStruct.setTO_ITEM_CD(parStruct.getITEM_CD());
								updateStruct.setTO_LOT_NO(parStruct.getLOT_NO());
								updateStruct.setTO_PUCH_ODR_CD(null);
								updateStruct.setsUser_ID(getsysUSER_CD());
								
								// 元発注番号を取得する
								List fromPuchOdrNoList = entity.mgetFROM_PUCH_ODR_CD.read(conn, updateStruct);
								if (fromPuchOdrNoList != null && fromPuchOdrNoList.size() > 0) {
									AD0110010Struct puchStruct = (AD0110010Struct)fromPuchOdrNoList.get(0);
									updateStruct.setFROM_PUCH_ODR_CD(puchStruct.getFROM_PUCH_ODR_CD());
								} else {
									updateStruct.setFROM_PUCH_ODR_CD(null);
								}
								entity.mupdateT_LOT_TRACE.update(conn, updateStruct);
							}
							
							//異常終了の場合
							if(bc.getResultStatus().intValue() == 3){
								//エラーメッセージ取得
								if(lotTraceList != null && lotTraceList.size() > 0){
									csvExport(parStruct					// 対象データ情報
											, "1"						// エラー区分
											, m + 1						// エラー発生行
											,null
											,new ExpjMessage((String)lotTraceList.get(0)).getMessage(_locale)
											,null);	// エラーメッセージ
									_intErrorCount++;
								}
								return false;
							}
						}
					}

					//使用残数減算
					remainQty = remainQty.subtract(new BigDecimal(lotUseStruct.getTOTAL_ISSUE_QTY()));

					//使用残数が0以下の場合ループ終了
					if (remainQty.doubleValue() <= 0) {
						break;
					}
				}
			//ロット管理フラグ = 1(ロットトレース管理を行う。)でない場合
			} else {
				//保管区別入出庫登録
				entity.minsertT_RCV_ISSUE.create(conn, issueStruct);
			}
		}
		
		return result;
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
		warningFlg = false;
		AD0110010Struct csvStruct = new AD0110010Struct();
		try {
			for (int i = 0; i < csvList.size(); i++)	{
				csvStruct = (AD0110010Struct)csvList.get(i);
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
				// 以下工場コードのチェック
				// 工場コード、 NULLの場合
				if (isNull(csvStruct.getPLANT_CD())) {
					csvExport(csvStruct						// 対象データ情報
							, "1"							// エラー区分
							, i + 1							// エラー発生行
							, "Expj.ISSUE_PLANT_CD"			// エラー項目名
							, new ExpjMessage("AA02007").getMessage(_locale)		// エラーメッセージ
							, null
							); 
					_intErrorCount++;
					continue;
				}else{
					// 工場コード、文字3桁以上の場合
					if (strLengthChk(csvStruct.getPLANT_CD()) >= 3){
						csvExport(csvStruct						// 対象データ情報
								, "1"							// エラー区分
								, i + 1							// エラー発生行
								, "Expj.ISSUE_PLANT_CD"			// エラー項目名
								, new ExpjMessage("AA01501").getMessage(_locale)		// エラーメッセージ
								, null
								); 
						_intErrorCount++;
						continue;
					}
					// 工場コード、禁則文字が入力されていた場合
					if (chkHankaku(csvStruct.getPLANT_CD())) {
						csvExport(csvStruct						// 対象データ情報
								, "1"							// エラー区分
								, i + 1							// エラー発生行
								, "Expj.ISSUE_PLANT_CD"			// エラー項目名
								, new ExpjMessage("AA01524").getMessage(_locale)		// エラーメッセージ
								, null
								); 
						_intErrorCount++;
						continue;
					}
				}
				// 以下品目番号のチェック
				// 品目番号、NULLの場合
				if (isNull(csvStruct.getITEM_CD())) {
					csvExport(csvStruct						// 対象データ情報
							, "1"							// エラー区分
							, i + 1							// エラー発生行
							, "Expj.ITEM_CD"				// エラー項目名
							, new ExpjMessage("AB00002").getMessage(_locale)		// エラーメッセージ
							, null
							); 
					_intErrorCount++;
					continue;
				}else{
					// 品目番号、文字26桁以上の場合
					if (strLengthChk(csvStruct.getITEM_CD()) >= 26) {
						csvExport(csvStruct						// 対象データ情報
								, "1"							// エラー区分
								, i + 1							// エラー発生行
								, "Expj.ITEM_CD"				// エラー項目名
								, new ExpjMessage("AA01501").getMessage(_locale)		// エラーメッセージ
								, null
								); 
						_intErrorCount++;
						continue;
					}
					// 品目番号、禁則文字が入力されていた場合
					if (chkHankaku(csvStruct.getITEM_CD())) {
						csvExport(csvStruct						// 対象データ情報
								, "1"							// エラー区分
								, i + 1							// エラー発生行
								, "Expj.ITEM_CD"				// エラー項目名
								, new ExpjMessage("AA01524").getMessage(_locale)		// エラーメッセージ
								, null
								); 
						_intErrorCount++;
						continue;
					}
				}
				// 以下作業区コードのチェック
				// 作業区コード、NULLの場合
				if (isNull(csvStruct.getWS_CD())) {
					csvExport(csvStruct							// 対象データ情報
							, "1"								// エラー区分
							, i + 1								// エラー発生行
							, "Expj.WS_CD"		// エラー項目名
							, new ExpjMessage("AD20057").getMessage(_locale)			// エラーメッセージ
							, null
							); 
					_intErrorCount++;
					continue;
				}else{
					// 作業区コード、文字26桁以上の場合
					if (strLengthChk(csvStruct.getWS_CD()) >= 26) {
						csvExport(csvStruct							// 対象データ情報
								, "1"								// エラー区分
								, i + 1								// エラー発生行
								, "Expj.WS_CD"		// エラー項目名
								, new ExpjMessage("AA01501").getMessage(_locale)			// エラーメッセージ
								, null
								); 
						_intErrorCount++;
						continue;
					}
					// 作業区コード、禁則文字が入力されていた場合
					if (chkHankaku(csvStruct.getWS_CD())) {
						csvExport(csvStruct							// 対象データ情報
								, "1"								// エラー区分
								, i + 1								// エラー発生行
								, "Expj.WS_CD"		// エラー項目名
								, new ExpjMessage("AA01524").getMessage(_locale)			// エラーメッセージ
								, null
								); 
						_intErrorCount++;
						continue;
					}
				}
				// 以下作業日のチェック
				// 作業日、NULLの場合
				if (isNull(csvStruct.getOPR_DATE())) {
					csvExport(csvStruct
							 , "1"								// エラー区分
							 , i + 1							// エラー行番号
							 , "Expj.OPR_DATE_3"				// エラー項目名
							 , new ExpjMessage("AD20059").getMessage(_locale)// エラーメッセージ
							, null
							 );	
					_intErrorCount++;
					continue;
				}else{
					// 作業日、日付型でない場合
					if (!checkDate(csvStruct.getOPR_DATE())) {
						csvExport(csvStruct
								 , "1"								// エラー区分
								 , i + 1							// エラー行番号
								 , "Expj.OPR_DATE_3"				// エラー項目名
								 , new ExpjMessage("AA01606").getMessage(_locale)// エラーメッセージ
								 , null
								 );	
						_intErrorCount++;
						continue;
					}
				}
				
				// 以下保管区コードのチェック
				if (!isNull(csvStruct.getWH_CD())) {
					// 保管区コード、文字26桁以上の場合
					if (strLengthChk(csvStruct.getWH_CD()) >= 26) {
						csvExport(csvStruct
								 , "1"								// エラー区分
								 , i + 1							// エラー行番号
								 , "Expj.WH_CD"						// エラー項目名
								 , new ExpjMessage("AA01501").getMessage(_locale)// エラーメッセージ
								 , null 
								);	
						_intErrorCount++;
						continue;
					}
					// 保管区コード、禁則文字が入力されていた場合
					if (chkHankaku(csvStruct.getWH_CD())) {
						csvExport(csvStruct
								 , "1"								// エラー区分
								 , i + 1							// エラー行番号
								 , "Expj.WH_CD"						// エラー項目名
								 , new ExpjMessage("AA01524").getMessage(_locale)// エラーメッセージ
								 , null 
								);	
						_intErrorCount++;
						continue;
					}
				}

				// 以下良品数のチェック
				// 良品数、NULLの場合
				if (isNull(csvStruct.getACPT_QTY())) {
					csvExport(csvStruct
							 , "1"								// エラー区分
							 , i + 1							// エラー行番号
							 , "Expj.ACPT_QTY"					// エラー項目名
							 , new ExpjMessage("AD34028").getMessage(_locale)// エラーメッセージ
							 , null 
							);	
					_intErrorCount++;
					continue;
				}else{
					// 良品数、数値以外の場合
					if (!isNumChk(csvStruct.getACPT_QTY())) {
						csvExport(csvStruct
								 , "1"								// エラー区分
								 , i + 1							// エラー行番号
								 , "Expj.ACPT_QTY"					// エラー項目名
								 , new ExpjMessage("AA01503").getMessage(_locale)// エラーメッセージ
								 , null 
								);	
						_intErrorCount++;
						continue;
					}
					// 良品数、0未満の場合
					if (Calculate.compare(csvStruct.getACPT_QTY(), "0") == -1) {
						csvExport(csvStruct
								 , "1"								// エラー区分
								 , i + 1							// エラー行番号
								 , "Expj.ACPT_QTY"				// エラー項目名
								 , new ExpjMessage("AD34026").getMessage(_locale)// エラーメッセージ
								 , null
								);	
						_intErrorCount++;
						continue;
					}
					// 良品数、整数が14桁以上、または、小数点以下5桁以上の場合
					if (!isNotInNumRange(csvStruct.getACPT_QTY(), 14, 4)) {
						csvExport(csvStruct
								 , "1"								// エラー区分
								 , i + 1							// エラー行番号
								 , "Expj.ACPT_QTY"				// エラー項目名
								 , new ExpjMessage("AA01501").getMessage(_locale)	// エラーメッセージ
								 , null
								 );
						_intErrorCount++;
						continue;
					}
				}
				
				// 以下不良数のチェック
				// 不良数、数値以外の場合
				if (!isNumChk(csvStruct.getDEFECT_QTY())) {
					csvExport(csvStruct, "1" // エラー区分
							, i + 1 // エラー行番号
							, "Expj.DEFECT_INSPC_QTY_2" // エラー項目名
							, new ExpjMessage("AA01503").getMessage(_locale)// エラーメッセージ
							, null);
					_intErrorCount++;
					continue;
				}
				// 不良数、0未満の場合
				if (Calculate.compare(csvStruct.getDEFECT_QTY(), "0") == -1) {
					csvExport(csvStruct, "1" // エラー区分
							, i + 1 // エラー行番号
							, "Expj.DEFECT_INSPC_QTY_2" // エラー項目名
							, new ExpjMessage("AD34026").getMessage(_locale)// エラーメッセージ
							, null);
					_intErrorCount++;
					continue;
				}
				// 不良数、整数が14桁以上、または、小数点以下5桁以上の場合
				if (!isNotInNumRange(csvStruct.getDEFECT_QTY(), 14, 4)) {
					csvExport(csvStruct, "1" // エラー区分
							, i + 1 // エラー行番号
							, "Expj.DEFECT_INSPC_QTY_2" // エラー項目名
							, new ExpjMessage("AA01501").getMessage(_locale)// エラーメッセージ
							, null);
					_intErrorCount++;
					continue;
				}

				// 以下不良理由コードのチェック
				if (!isNull(csvStruct.getDEFECT_CAUSE_CD())) {
					// 不良理由コード、数値以外の場合
					if (!isNumChk(csvStruct.getDEFECT_CAUSE_CD())) {
						csvExport(csvStruct
								, "1"										// エラー区分
								, i + 1										// エラー行番号
								, "Expj.DEFECT_CAUSE_CD"					// エラー項目名
								, new ExpjMessage("AA01503").getMessage(_locale)// エラーメッセージ
								, null);	
						_intErrorCount++;
						continue;
					}
					// 不良理由コード、Nullではない、かつ、（0,1,2,3,4,5,6,7,8,9,10）以外の場合
					boolean comFlag1 = checkCombValue(_DEFECT_CAUSE_CD_INNER, csvStruct.getDEFECT_CAUSE_CD());
					if (comFlag1 == false) {
						csvExport(csvStruct
								, "1"										// エラー区分
								, i + 1										// エラー行番号
								, "Expj.DEFECT_CAUSE_CD"					// エラー項目名
								, new ExpjMessage("AA01504").getMessage(_locale)// エラーメッセージ
								, null);	
						_intErrorCount++;
						continue;
					}
				}
				
				// 以下不良備考のチェック
				if (!isNull(csvStruct.getDEFECT_COMMENT())) {
					// 不良備考、文字8１桁以上の場合
					if (strLengthChk(csvStruct.getDEFECT_COMMENT()) >= 81) {
						csvExport(csvStruct
								, "1"										// エラー区分
								, i + 1										// エラー行番号
								, "Expj.DEFECT_COMMENT"					// エラー項目名
								, new ExpjMessage("AA01501").getMessage(_locale)// エラーメッセージ
								, null);	
						_intErrorCount++;
						continue;
					}
					// 不良備考、禁則文字が入力されていた場合
					if (chkHankaku(csvStruct.getDEFECT_COMMENT())) {
						csvExport(csvStruct
								, "1"										// エラー区分
								, i + 1										// エラー行番号
								, "Expj.DEFECT_COMMENT"					// エラー項目名
								, new ExpjMessage("AA01524").getMessage(_locale)// エラーメッセージ
								, null);	
						_intErrorCount++;
						continue;
					}
				}
				
				// 以下作業担当者コードのチェック
				if (!isNull(csvStruct.getOUTPUT_RSLT_PERSON())) {
					// 作業担当者コード、文字41桁以上の場合
					if (strLengthChk(csvStruct.getOUTPUT_RSLT_PERSON()) >= 41) {
						csvExport(csvStruct
								, "1"										// エラー区分
								, i + 1										// エラー行番号
								, "Expj.Cmt6216"					// エラー項目名
								, new ExpjMessage("AA01501").getMessage(_locale)// エラーメッセージ
								, null);	
						_intErrorCount++;
						continue;
					}
					// 作業担当者コード、禁則文字が入力されていた場合
					if (chkHankaku(csvStruct.getOUTPUT_RSLT_PERSON())) {
						csvExport(csvStruct
								, "1"										// エラー区分
								, i + 1										// エラー行番号
								, "Expj.Cmt6216"					// エラー項目名
								, new ExpjMessage("AA01524").getMessage(_locale)// エラーメッセージ
								, null);	
						_intErrorCount++;
						continue;
					}
				}
				
				// 以下作業時間単位区分のチェック
				// 作業時間単位区分、数値以外の場合
				if (!isNumChk(csvStruct.getOPR_TIME_UNIT_TYP())) {
					csvExport(csvStruct, "1" // エラー区分
							, i + 1 // エラー行番号
							, "Expj.OPR_TIME_UNIT_TYP" // エラー項目名
							, new ExpjMessage("AA01503").getMessage(_locale)// エラーメッセージ
							, null);
					_intErrorCount++;
					continue;
				}
				// 作業時間単位区分、Nullではない、かつ、（1，2）以外の場合
				boolean ptuFlg = checkCombValue(_OPR_TIME_UNIT_TYP,
						csvStruct.getOPR_TIME_UNIT_TYP());
				if (ptuFlg == false) {
					csvExport(csvStruct, "1" // エラー区分
							, i + 1 // エラー行番号
							, "Expj.OPR_TIME_UNIT_TYP" // エラー項目名
							, new ExpjMessage("AD00226").getMessage(_locale)// エラーメッセージ
							, null);
					_intErrorCount++;
					continue;
				}

				// 以下作業時間のチェック
				// 作業時間、数値以外の場合
				if (!isNumChk(csvStruct.getOPR_TIME())) {
					csvExport(csvStruct, "1" // エラー区分
							, i + 1 // エラー行番号
							, "Expj.OPR_TIME" // エラー項目名
							, new ExpjMessage("AA01503").getMessage(_locale) // エラーメッセージ
							, null);
					_intErrorCount++;
					continue;
				}
				// 作業時間、0未満の場合
				if (Calculate.compare(csvStruct.getOPR_TIME(), "0") == -1) {
					csvExport(csvStruct, "1" // エラー区分
							, i + 1 // エラー行番号
							, "Expj.OPR_TIME" // エラー項目名
							, new ExpjMessage("AD34026").getMessage(_locale)// エラーメッセージ
							, null);
					_intErrorCount++;
					continue;
				}
				// 作業時間、整数が14桁以上、または、小数点以下5桁以上の場合
				if (!isNotInNumRange(csvStruct.getOPR_TIME(), 14, 4)) {
					csvExport(csvStruct, "1" // エラー区分
							, i + 1 // エラー行番号
							, "Expj.OPR_TIME" // エラー項目名
							, new ExpjMessage("AA01501").getMessage(_locale)// エラーメッセージ
							, null);
					_intErrorCount++;
					continue;
				}
				// 以下製造ロット番号のチェック
				if (!isNull(csvStruct.getVEND_LOT_NO())) {
					// 製造ロット番号、文字26桁以上の場合
					if (strLengthChk(csvStruct.getVEND_LOT_NO()) >= 26) {
						csvExport(csvStruct
								, "1"										// エラー区分
								, i + 1										// エラー行番号
								, "Expj.VEND_LOT_NO_1"						// エラー項目名
								, new ExpjMessage("AA01501").getMessage(_locale)
								, null);	// エラーメッセージ
						_intErrorCount++;
						continue;
					}
					// 製造ロット番号、禁則文字が入力されていた場合
					if (chkHankaku(csvStruct.getVEND_LOT_NO())) {
						csvExport(csvStruct
								, "1"										// エラー区分
								, i + 1										// エラー行番号
								, "Expj.VEND_LOT_NO_1"						// エラー項目名
								, new ExpjMessage("AA01524").getMessage(_locale)
								, null);	// エラーメッセージ
						_intErrorCount++;
						continue;
					}
				}
				
				// 以下在庫ロット番号のチェック
				if (!isNull(csvStruct.getLOT_NO())) {
					// 在庫ロット番号、文字26桁以上の場合
					if (strLengthChk(csvStruct.getLOT_NO()) >= 26) {
						csvExport(csvStruct
								, "1"										// エラー区分
								, i + 1										// エラー行番号
								, "Expj.STOCK_LOT_CD"						// エラー項目名
								, new ExpjMessage("AA01501").getMessage(_locale)
								, null);	// エラーメッセージ
						_intErrorCount++;
						continue;
					}
					// 在庫ロット番号、禁則文字が入力されていた場合
					if (chkHankaku(csvStruct.getLOT_NO())) {
						csvExport(csvStruct
								, "1"										// エラー区分
								, i + 1										// エラー行番号
								, "Expj.STOCK_LOT_CD"						// エラー項目名
								, new ExpjMessage("AA01524").getMessage(_locale)
								, null);	// エラーメッセージ
						_intErrorCount++;
						continue;
					}
				}
				
				// 以下前段取時間のチェック
				// 前段取時間、数値以外の場合
				if (!isNumChk(csvStruct.getPRE_ARRANGEMENT_TIME())) {
					csvExport(csvStruct,
							"1" // エラー区分
							,
							i + 1 // エラー行番号
							,
							"Expj.PRE_ARRANGEMENT_TIME" // エラー項目名
							, new ExpjMessage("AA01503").getMessage(_locale),
							null); // エラーメッセージ
					_intErrorCount++;
					continue;
				}
				// 前段取時間、0未満の場合
				if (Calculate.compare(csvStruct.getPRE_ARRANGEMENT_TIME(), "0") == -1) {
					csvExport(csvStruct,
							"1" // エラー区分
							,
							i + 1 // エラー行番号
							,
							"Expj.PRE_ARRANGEMENT_TIME" // エラー項目名
							, new ExpjMessage("AD34026").getMessage(_locale),
							null); // エラーメッセージ
					_intErrorCount++;
					continue;
				}
				// 前段取時間、整数が14桁以上、または、小数点以下5桁以上の場合
				if (!isNotInNumRange(csvStruct.getPRE_ARRANGEMENT_TIME(), 14, 4)) {
					csvExport(csvStruct,
							"1" // エラー区分
							,
							i + 1 // エラー行番号
							,
							"Expj.PRE_ARRANGEMENT_TIME" // エラー項目名
							, new ExpjMessage("AA01501").getMessage(_locale),
							null); // エラーメッセージ
					_intErrorCount++;
					continue;
				}
				
				// 以下後段取時間のチェック
				// 下後段取時間、数値以外の場合
				if (!isNumChk(csvStruct.getPOST_ARRANGEMENT_TIME())) {
					csvExport(csvStruct,
							"1" // エラー区分
							,
							i + 1 // エラー行番号
							,
							"Expj.POST_ARRANGEMENT_TIME" // エラー項目名
							, new ExpjMessage("AA01503").getMessage(_locale),
							null); // エラーメッセージ
					_intErrorCount++;
					continue;
				}
				// 下後段取時間、0未満の場合
				if (Calculate
						.compare(csvStruct.getPOST_ARRANGEMENT_TIME(), "0") == -1) {
					csvExport(csvStruct,
							"1" // エラー区分
							,
							i + 1 // エラー行番号
							,
							"Expj.POST_ARRANGEMENT_TIME" // エラー項目名
							, new ExpjMessage("AD34026").getMessage(_locale),
							null); // エラーメッセージ
					_intErrorCount++;
					continue;
				}
				// 下後段取時間、整数が14桁以上、または、小数点以下5桁以上の場合
				if (!isNotInNumRange(csvStruct.getPOST_ARRANGEMENT_TIME(), 14,
						4)) {
					csvExport(csvStruct,
							"1" // エラー区分
							,
							i + 1 // エラー行番号
							,
							"Expj.POST_ARRANGEMENT_TIME" // エラー項目名
							, new ExpjMessage("AA01501").getMessage(_locale),
							null); // エラーメッセージ
					_intErrorCount++;
					continue;
				}
				
				// 以下停止時間のチェック
				// 停止時間、数値以外の場合
				if (!isNumChk(csvStruct.getCESSATION_TIME())) {
					csvExport(csvStruct,
							"1" // エラー区分
							,
							i + 1 // エラー行番号
							,
							"Expj.CESSATION_TIME" // エラー項目名
							, new ExpjMessage("AA01503").getMessage(_locale),
							null); // エラーメッセージ
					_intErrorCount++;
					continue;
				}
				// 停止時間、0未満の場合
				if (Calculate.compare(csvStruct.getCESSATION_TIME(), "0") == -1) {
					csvExport(csvStruct,
							"1" // エラー区分
							,
							i + 1 // エラー行番号
							,
							"Expj.CESSATION_TIME" // エラー項目名
							, new ExpjMessage("AD34026").getMessage(_locale),
							null); // エラーメッセージ
					_intErrorCount++;
					continue;
				}
				// 停止時間、整数が14桁以上、または、小数点以下5桁以上の場合
				if (!isNotInNumRange(csvStruct.getCESSATION_TIME(), 14, 4)) {
					csvExport(csvStruct,
							"1" // エラー区分
							,
							i + 1 // エラー行番号
							,
							"Expj.CESSATION_TIME" // エラー項目名
							, new ExpjMessage("AA01501").getMessage(_locale),
							null); // エラーメッセージ
					_intErrorCount++;
					continue;
				}
				
				// 以下停止理由のチェック
				if (!isNull(csvStruct.getCESSATION_CAUSE())) {
					// 停止理由、文字8１桁以上の場合
					if (strLengthChk(csvStruct.getCESSATION_CAUSE()) >= 81) {
						csvExport(csvStruct
								, "1"													// エラー区分
								, i + 1													// エラー行番号
								, "Expj.CESSATION_CAUSE"								// エラー項目名
								, new ExpjMessage("AA01501").getMessage(_locale)
								, null);		// エラーメッセージ
						_intErrorCount++;
						continue;
					}
					// 停止理由、禁則文字が入力されていた場合
					if (chkHankaku(csvStruct.getCESSATION_CAUSE())) {
						csvExport(csvStruct
								, "1"													// エラー区分
								, i + 1													// エラー行番号
								, "Expj.CESSATION_CAUSE"								// エラー項目名
								, new ExpjMessage("AA01524").getMessage(_locale)
								, null);		// エラーメッセージ
						_intErrorCount++;
						continue;
					}
				}
				
				// 以下備考のチェック
				if (!isNull(csvStruct.getOUTPUT_RSLT_COMMENT())) {
					// 備考、文字8１桁以上の場合
					if (strLengthChk(csvStruct.getOUTPUT_RSLT_COMMENT()) >= 81) {
						csvExport(csvStruct
								, "1"													// エラー区分
								, i + 1													// エラー行番号
								, "Expj.ISSUE_INST_COMMENT_1"							// エラー項目名
								, new ExpjMessage("AA01501").getMessage(_locale)
								, null);		// エラーメッセージ
						_intErrorCount++;
						continue;
					}
					// 備考、禁則文字が入力されていた場合
					if (chkHankaku(csvStruct.getOUTPUT_RSLT_COMMENT())) {
						csvExport(csvStruct
								, "1"													// エラー区分
								, i + 1													// エラー行番号
								, "Expj.ISSUE_INST_COMMENT_1"							// エラー項目名
								, new ExpjMessage("AA01524").getMessage(_locale)
								, null);		// エラーメッセージ
						_intErrorCount++;
						continue;
					}
				}
				
				// マスタ整合性チェック
				// 実際原価の締めが完了している日付チェック、「システムパラメータ」．設定値=“false”の場合、「作業日」の年月 （YYYY/MM）が[実際原価管理パラメータ].“対象年月”より過去の場合
				if ("false".equals(strValus)) {
					if(!checkProcExecDate(csvStruct.getOPR_DATE(),csvStruct.getPLANT_CD(),struct)){
						csvExport(csvStruct
								, "1"													// エラー区分
								, i + 1													// エラー行番号
								, "Expj.Cmt5833"							// エラー項目名
								, new ExpjMessage("AE00160").getMessage(_locale)
								, null);		// エラーメッセージ
						_intErrorCount++;
						continue;
					}
				}
				// 「品目番号」 に入力された値が [品目] に存在しない場合
				List itemCdList = entity.mselectItem_CD.read(conn, csvStruct);
				if (itemCdList.isEmpty()) {
					csvExport(csvStruct
							, "1"													// エラー区分
							, i + 1													// エラー行番号
							, "Expj.ITEM_CD"										// エラー項目名
							, new ExpjMessage("AD00019").getMessage(_locale)
							, null);		// エラーメッセージ
					_intErrorCount++;
					continue;
				}else{
					mItemStruct = (AD0110010Struct)itemCdList.get(0);
					csvStruct.setLOT_CTRL_FLG(mItemStruct.getLOT_CTRL_FLG());
					//[品目別仕掛].“品目番号” ＝ 「品目番号」 かつ、[品目別仕掛].“作業実績区分” ＝ 1：出来高実績 かつ、[品目別仕掛].“品目別作業状態区分” ≧ 2：指示済み かつ [品目別仕掛].“工場コード” ＝ 「工場コード」が1件も存在しない場合
					boolean blnTWorkProcByItem = entity.mcheckT_WORK_IN_PROC_BY_ITEM.check(conn, csvStruct);
					if (!blnTWorkProcByItem) {
						csvExport(csvStruct
								, "1"													// エラー区分
								, i + 1													// エラー行番号
								, "Expj.PLANT_CD" 										// エラー項目名
								, new ExpjMessage("ZZ06001").getMessage(_locale)
								, "Expj.ITEM_CD");		// エラーメッセージ
						_intErrorCount++;
						continue;
					}
				}
				// 「作業区コード」に入力された値が [作業区] に存在しない場合
				List wsCdList = entity.mselectM_WS.read(conn, csvStruct);
				AD0110010Struct wsCdStruct = new AD0110010Struct();
				if (wsCdList.isEmpty()) {
					csvExport(csvStruct
							, "1"													// エラー区分
							, i + 1													// エラー行番号
							, "Expj.Cmt6189"										// エラー項目名
							, new ExpjMessage("AD20029").getMessage(_locale)
							, null);		// エラーメッセージ
					_intErrorCount++;
					continue;
				}else{
					wsCdStruct = (AD0110010Struct)wsCdList.get(0);
					// 「作業区コード」に対する工場コードと「工場コード」が一致しない場合
					if (!csvStruct.getPLANT_CD().equals(wsCdStruct.getvc2PLANT_CD())) {
						csvExport(csvStruct
								, "1"													// エラー区分
								, i + 1													// エラー行番号
								, "Expj.Cmt6189"										// エラー項目名
								, new ExpjMessage("AD00004").getMessage(_locale)
								, null);		// エラーメッセージ
						_intErrorCount++;
						continue;
					}
				}
				
				// 「保管区コード」 に入力された値が [保管区] に存在しない場合
				if (!isNull(csvStruct.getWH_CD())) {
					List whCdList = entity.mselectM_WH.read(conn, csvStruct);
					AD0110010Struct whCdStruct = new AD0110010Struct();
					if (whCdList.isEmpty()) {
						csvExport(csvStruct
								, "1"													// エラー区分
								, i + 1													// エラー行番号
								, "Expj.WH_CD"											// エラー項目名
								, new ExpjMessage("AD00020").getMessage(_locale)
								, null);		// エラーメッセージ
						_intErrorCount++;
						continue;
					}else{
						whCdStruct = (AD0110010Struct)whCdList.get(0);
						// 「保管区コード」の工場コードと「工場コード」が一致しない場合
						if (!csvStruct.getPLANT_CD().equals(whCdStruct.getvc2PLANT_CD())) {
							csvExport(csvStruct
									, "1"													// エラー区分
									, i + 1													// エラー行番号
									, "Expj.WH_CD"											// エラー項目名
									, new ExpjMessage("AA01007").getMessage(_locale)
									, null);		// エラーメッセージ
							_intErrorCount++;
							continue;
						}
					}
				}
				
				// 「作業日」に 未来日(業務運用日より未来) を入力された場合
				// 業務運用日
				BigDecimal decimalBusinessDate = new BigDecimal(_btmBusinessOprDate.substring(0,4) + 
						_btmBusinessOprDate.substring(5,7)+ _btmBusinessOprDate.substring(8,10));
				// 作業日
				BigDecimal decimalOprDate = new BigDecimal(chageDate(csvStruct.getOPR_DATE()).substring(0,4) + 
						chageDate(csvStruct.getOPR_DATE()).substring(5,7)+ chageDate(csvStruct.getOPR_DATE()).substring(8,10));
				if (decimalOprDate.compareTo(decimalBusinessDate) > 0) {
					csvExport(csvStruct
							, "1"													// エラー区分
							, i + 1													// エラー行番号
							, "Expj.Cmt5833"										// エラー項目名
							, new ExpjMessage("AD30773").getMessage(_locale)
							, null);		// エラーメッセージ
					_intErrorCount++;
					continue;
				}
				
				BigDecimal decimalAcptQty2 = new BigDecimal("0");
				BigDecimal decimalAcptQty = new BigDecimal(csvStruct.getACPT_QTY());

				BigDecimal decimalDefectQty = new BigDecimal(csvStruct.getDEFECT_QTY());
				BigDecimal decimalDefectQty2 = new BigDecimal("0");
				
				//「良品数」 > 0、かつ、[品目].”ロット管理フラグ”＝1：ロット管理を行う、かつ、[品目].”ロット番号採番区分”＝0：手入力、かつ、「在庫ロット番号」が未入力の場合
				decimalAcptQty2 = new BigDecimal("0");
				// 「良品数」 > 0
				if (decimalAcptQty.compareTo(decimalAcptQty2) > 0) {
					// [品目].”ロット管理フラグ”＝1：ロット管理を行う
					if ("1".equals(mItemStruct.getLOT_CTRL_FLG())) {
						// [品目].”ロット番号採番区分”＝0：手入力
						if ( "0".equals(mItemStruct.getLOT_NUMBERING_TYP())){
								// 「在庫ロット番号」が未入力
								if (isNull(csvStruct.getLOT_NO())) {
									csvExport(csvStruct
											, "1"													// エラー区分
											, i + 1													// エラー行番号
											, "Expj.STOCK_LOT_CD"									// エラー項目名
											, new ExpjMessage("AE20600").getMessage(_locale)
											, null);		// エラーメッセージ
									_intErrorCount++;
									continue;
								}
							}
						}
				}else {
					// 「良品数」 ＝ 0、かつ、「在庫ロット番号」が入力されている場合
					if (!isNull(csvStruct.getLOT_NO())) {
						csvExport(csvStruct
								, "1"													// エラー区分
								, i + 1													// エラー行番号
								, "Expj.STOCK_LOT_CD"									// エラー項目名
								, new ExpjMessage("AD20139").getMessage(_locale)
								, null);		// エラーメッセージ
						_intErrorCount++;
						continue;
					}
				}
				// [品目].”ロット管理フラグ”＝1：ロット管理を行う
				if ("1".equals(mItemStruct.getLOT_CTRL_FLG())) {
					if ("0".equals(mItemStruct.getLOT_NUMBERING_TYP())) {
						// [品目].”ロット管理フラグ”＝1：ロット管理を行う、かつ、「在庫ロット番号」が[ロット管理]に存在しない場合
						if (!isNull(csvStruct.getLOT_NO())) {
							List lotCtrlList = entity.mselectT_LOT_CTRL.read(conn, csvStruct);
							if (lotCtrlList.isEmpty()) {
								csvExport(csvStruct
										, "1"													// エラー区分
										, i + 1													// エラー行番号
										, "Expj.STOCK_LOT_CD"									// エラー項目名
										, new ExpjMessage("AE21203").getMessage(_locale)
										, null);		// エラーメッセージ
								_intErrorCount++;
								continue;
							}
						}
					}
				}else {
					// [品目].”ロット管理フラグ”≠1：ロット管理を行う　かつ、「在庫ロット番号」が入力されている場合
					// 「在庫ロット番号」が入力
					if (!isNull(csvStruct.getLOT_NO())) {
						csvExport(csvStruct
								, "1"													// エラー区分
								, i + 1													// エラー行番号
								, "Expj.STOCK_LOT_CD"									// エラー項目名
								, new ExpjMessage("AE20601").getMessage(_locale)
								, null);		// エラーメッセージ
						_intErrorCount++;
						continue;
					}
				}

				// 不良理由コードチェック
				decimalDefectQty2 = new BigDecimal("0");
				if (isNull(csvStruct.getDEFECT_CAUSE_CD())) {
					// 「不良数」 > 0 の場合
					if (decimalDefectQty.compareTo( decimalDefectQty2) > 0) {
						csvExport(csvStruct
								, "1"													// エラー区分
								, i + 1													// エラー行番号
								, "Expj.DEFECT_CAUSE_CD"								// エラー項目名
								, new ExpjMessage("AE05039").getMessage(_locale)
								, null);		// エラーメッセージ
						_intErrorCount++;
						continue;
					}
				}else {
					// 「不良理由コード」≠Null かつ、「不良数」 = 0 かつ、整数管理品目の場合
					if (decimalDefectQty.compareTo(decimalDefectQty2) == 0) {
						// 整数管理品目
						if (!isNull(mItemStruct.getUNIT_QTY_TYP()) && "1".equals(mItemStruct.getUNIT_QTY_TYP())) {
							csvExport(csvStruct
									, "1"													// エラー区分
									, i + 1													// エラー行番号
									, "Expj.DEFECT_INSPC_QTY_2"								// エラー項目名
									, new ExpjMessage("AE05033").getMessage(_locale)
									, null);		// エラーメッセージ
							_intErrorCount++;
							continue;
						}else if (!isNull(mItemStruct.getUNIT_QTY_TYP()) && "2".equals(mItemStruct.getUNIT_QTY_TYP())) {
							csvExport(csvStruct
									, "1"													// エラー区分
									, i + 1													// エラー行番号
									, "Expj.DEFECT_INSPC_QTY_2"								// エラー項目名
									, new ExpjMessage("AE05032").getMessage(_locale)
									, null);		// エラーメッセージ
							_intErrorCount++;
							continue;
						}
					}
				}
				
				// 「作業担当者コード」の工場コード ≠ 「工場コード」の場合
				if (!isNull(csvStruct.getOUTPUT_RSLT_PERSON())) {
					AD0110010Struct userStruct = new AD0110010Struct();
					userStruct.setUSER_CD(csvStruct.getOUTPUT_RSLT_PERSON());
					List userCdList = entity.mselectUSER_MST.read(conn, userStruct);
					if (!userCdList.isEmpty()) {
						userStruct = (AD0110010Struct)userCdList.get(0);
						if (!csvStruct.getPLANT_CD().equals(userStruct.getvc2PLANT_CD())) {
							csvExport(csvStruct
									, "1"													// エラー区分
									, i + 1													// エラー行番号
									, "Expj.Cmt6216"										// エラー項目名
									, new ExpjMessage("AD34029").getMessage(_locale)
									, null);		// エラーメッセージ
							_intErrorCount++;
							continue;
						}
					}else {
						csvExport(csvStruct
								, "1"													// エラー区分
								, i + 1													// エラー行番号
								, "Expj.Cmt6216"										// エラー項目名
								, new ExpjMessage("AD34032").getMessage(_locale)
								, null);		// エラーメッセージ
						_intErrorCount++;
						continue;
						
					}
				}
				
				// 最遅納期のオーダが取得できなかった場合
				List lastList = new ArrayList();
				lastList = entity.mSelectTargetProcByItem1.read(conn, csvStruct);
				//対象データが存在しない場合
				if (lastList.isEmpty()) {
					List lastDateList = entity.mSelectCompleteProcByItem1.read(conn, csvStruct);
					if (lastDateList.isEmpty()) {
						csvExport(csvStruct
								, "1"													// エラー区分
								, i + 1													// エラー行番号
								, "Expj.PLANT_CD"										// エラー項目名
								, new ExpjMessage("AD34027").getMessage(_locale)
								, "Expj.ITEM_CD");		// エラーメッセージ
						_intErrorCount++;
						continue;
					}
				}
				// 整数管理品目で「良品数」または「不良数」に小数が入力された場合
				//良品数
				if (!isNull(mItemStruct.getUNIT_QTY_TYP()) && "1".equals(mItemStruct.getUNIT_QTY_TYP())) {
					//整数管理品目
					decimalAcptQty2 = decimalAcptQty.setScale(0,BigDecimal.ROUND_DOWN);
					//切り下げ処理前と後で値が異なっていたら小数が入力されていたと判断しワーニングとする
					if (decimalAcptQty.doubleValue() != decimalAcptQty2.doubleValue()){
						csvExport(csvStruct					// 対象データ情報
								, "2"						// エラー区分
								, i + 1						// エラー発生行
								,"Expj.ACPT_QTY"			// エラー項目名
								,new ExpjMessage("AD00087").getMessage(_locale)
								, null);	// エラーメッセージ
						if(!warningFlg){
							_intWarningCount++;
							warningFlg = true;
						}
						csvStruct.setACPT_QTY(decimalAcptQty2.toString());
					}		
				}
				// 不良数
				if (!isNull(mItemStruct.getUNIT_QTY_TYP()) && "1".equals(mItemStruct.getUNIT_QTY_TYP())) {
					//整数管理品目
					decimalDefectQty2 = decimalDefectQty.setScale(0,BigDecimal.ROUND_DOWN);
					//切り下げ処理前と後で値が異なっていたら小数が入力されていたと判断しワーニングとする
					if (decimalDefectQty.doubleValue() != decimalDefectQty2.doubleValue()){
						csvExport(csvStruct					// 対象データ情報
								, "2"						// エラー区分
								, i + 1						// エラー発生行
								,"Expj.DEFECT_QTY"			// エラー項目名
								,new ExpjMessage("AD00087").getMessage(_locale)
								, null);	// エラーメッセージ
						if(!warningFlg){
							_intWarningCount++;
							warningFlg = true;	
						}
						csvStruct.setDEFECT_QTY(decimalDefectQty2.toString());
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
			 ee.setLocale(CoreTools.getLocale(getsysUSER_CD()));
			 throw ee;
		}
	}

	private List readCsvData() throws ExpjException{

		String[] strsCsvData = null;
		List listCsv = new ArrayList();
		try {
			// CSVデータのアップロード
			strsCsvData = (String []) csvReader.lineRead();
			if (strsCsvData != null) {
				setSyslogConfig("strsCsvData.length:" + strsCsvData.length);
				// データ件数としてstrsCsvData.lengthは使えない。実際の行数＋５行くらいらしい
				AD0110010Struct structCsv = null;
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
						structCsv = new AD0110010Struct();
						if (CSV_NECESSARY_COLUMN == v.size()) {
							 // 工場コード
							structCsv.setPLANT_CD((String) v.get(CSV_PLANT_CD));
							// 品目番号　
							structCsv.setITEM_CD((String) v.get(CSV_ITEM_CD)); 
							// 作業区コード
							structCsv.setWS_CD((String) v.get(CSV_WS_CD));
							// 作業日
							structCsv.setOPR_DATE((String) v.get(CSV_OPR_DATE)); 
							// 保管区コード
							if (isNull((String) v.get(CSV_WH_CD))) {
								structCsv.setWH_CD(ValidateWh.getDefaultOprWh(conn, structCsv.getPLANT_CD(),structCsv.getITEM_CD()));
							} else {
								structCsv.setWH_CD((String) v.get(CSV_WH_CD));
							}
							// 良品数
							structCsv.setACPT_QTY((String) v.get(CSV_ACPT_QTY)); 
							structCsv.setl_ERR_ACPT_QTY_KEEP((String) v.get(CSV_ACPT_QTY));
							// 不良数
							if (isNull((String) v.get(CSV_DEFECT_QTY))) {
								structCsv.setDEFECT_QTY("0"); 
							}else{
								structCsv.setDEFECT_QTY((String) v.get(CSV_DEFECT_QTY)); 
							}
							structCsv.setl_ERR_DEFECT_QTY_KEEP((String) v.get(CSV_DEFECT_QTY));
							
							// 不良理由コード
							structCsv.setDEFECT_CAUSE_CD((String) v.get(CSV_DEFECT_CAUSE_CD)); 
							// 不良備考
							structCsv.setDEFECT_COMMENT((String) v.get(CSV_DEFECT_COMMENT)); 
							// 作業担当者コード
							structCsv.setOUTPUT_RSLT_PERSON((String) v.get(CSV_OUTPUT_RSLT_PERSON));
							// 作業時間単位区分
							if (isNull((String) v.get(CSV_OPR_TIME_UNIT_TYP))) {
								structCsv.setOPR_TIME_UNIT_TYP("1"); 
							}else{
								structCsv.setOPR_TIME_UNIT_TYP((String) v.get(CSV_OPR_TIME_UNIT_TYP)); 
							}
							// 作業時間
							if (isNull((String) v.get(CSV_OPR_TIME))) {
								structCsv.setOPR_TIME("0"); 
							}else{
								structCsv.setOPR_TIME((String) v.get(CSV_OPR_TIME)); 
							}

							// 製造ロット番号
							structCsv.setVEND_LOT_NO((String) v.get(CSV_VEND_LOT_NO)); 
							// 在庫ロット番号
							structCsv.setLOT_NO((String) v.get(CSV_LOT_NO)); 
							structCsv.setl_LOT_NO_KEEP((String) v.get(CSV_LOT_NO)); 
							// 前段取時間
							if (isNull((String) v.get(CSV_PRE_ARRANGEMENT_TIME))) {
								structCsv.setPRE_ARRANGEMENT_TIME("0"); 
							}else{
								structCsv.setPRE_ARRANGEMENT_TIME((String) v.get(CSV_PRE_ARRANGEMENT_TIME)); 
							}
							// 後段取時間
							if (isNull((String) v.get(CSV_POST_ARRANGEMENT_TIME))) {
								structCsv.setPOST_ARRANGEMENT_TIME("0"); 
							}else{
								structCsv.setPOST_ARRANGEMENT_TIME((String) v.get(CSV_POST_ARRANGEMENT_TIME)); 
							}

							// 停止時間
							if (isNull((String) v.get(CSV_CESSATION_TIME))) {
								structCsv.setCESSATION_TIME("0"); 
							}else{
								structCsv.setCESSATION_TIME((String) v.get(CSV_CESSATION_TIME)); 
							}
							// 停止理由
							structCsv.setCESSATION_CAUSE((String) v.get(CSV_CESSATION_CAUSE)); 
							// 備考
							structCsv.setOUTPUT_RSLT_COMMENT((String) v.get(CSV_OUTPUT_RSLT_COMMENT)); 

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
	
	private boolean csvExport(AD0110010Struct targetStruct, String errTyp, int errlineNo, String errItem, String errMsg, String errItemCd) {
		AD0110010Struct errStruct = new AD0110010Struct();
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
		// 工場コード
		errStruct.setl_ERR_PLANT_CD(replaceSlashAdd(targetStruct.getPLANT_CD()));
		// 品目番号
		errStruct.setl_ERR_ITEM_CD(replaceSlashAdd(targetStruct.getITEM_CD()));	
		// 作業区コード
		errStruct.setl_ERR_WS_CD(replaceSlashAdd(targetStruct.getWS_CD()));
		// 保管区コード
		errStruct.setl_ERR_WH_CD(replaceSlashAdd(targetStruct.getWH_CD()));
		// 作業日
		errStruct.setl_ERR_OPR_DATE(replaceSlashAdd(targetStruct.getOPR_DATE()));
		// 良品数
		errStruct.setl_ERR_ACPT_QTY(replaceSlashAdd(targetStruct.getl_ERR_ACPT_QTY_KEEP()));

		// 不良数
		errStruct.setl_ERR_DEFECT_QTY(replaceSlashAdd(targetStruct.getl_ERR_DEFECT_QTY_KEEP()));

		// 作業時間
		errStruct.setl_ERR_OPR_TIME(replaceSlashAdd(targetStruct.getOPR_TIME()));
		// 在庫ロット番号
		errStruct.setl_ERR_LOT_NO(replaceSlashAdd(targetStruct.getl_LOT_NO_KEEP()));
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
				warningFlg = false;
				AD0110010Struct cvsStruct = (AD0110010Struct)csvList.get(i);
				
				rtnFlg = insertToutputRlsd (cvsStruct,i);
				if(!rtnFlg) {
					conn.rollback();
					return false;
				}
				
				rtnFlg = insertTOprRslt (cvsStruct,i);
				if(!rtnFlg) {
					conn.rollback();
					return false;
				}
			}
			conn.commit();
			return true;
		} catch (Exception e) {
			conn.rollback();;
			throw new ExpjException(e);
		}
		
	}
	
	/**
	 * CSVフェイル内容は、出来高実績登録処理
	 * @param csvList
	 * @return
	 * @throws FoundationException 
	 */
	private boolean insertToutputRlsd (AD0110010Struct adstruct ,int j) throws ExpjException {
		try {
			// 在庫ロット番号採番処理を行う。
			// [品目]．”ロット管理フラグ”＝ 1：ロット管理を行う 、かつ、[品目]．”ロット番号採番区分”≠ 0:手入力、かつ、
			if ("1".equals(mItemStruct.getLOT_CTRL_FLG()) && !"0".equals(mItemStruct.getLOT_NUMBERING_TYP())){
				BigDecimal bigdAcptQty2   = new BigDecimal("0");
				BigDecimal bigdAcptQty   = new BigDecimal(adstruct.getACPT_QTY());
				// 「良品数」 > 0、かつ、｢在庫ロット番号｣ ＝Null
				if (bigdAcptQty.compareTo(bigdAcptQty2) > 0 && isNull(adstruct.getLOT_NO())) {
					// 在庫ロット番号の自動採番を行う。
					BizCommon bc = new BizCommon(conn, getsysUSER_CD(), sp.getProcId(), getsysPLANT_CD());
					List retList = bc.getsetLotNumberingFd(adstruct.getITEM_CD(), adstruct.getOPR_DATE());

					// 正常終了の場合
					if (bc.getResultStatus().intValue() == 1) {
						// 在庫ロット番号の取得
						if (retList != null && retList.size() > 0) {
							strLotNo = (String) retList.get(0);
						}
						// 警告 or 異常終了の場合
					} else {
						// エラーメッセージの取得
						if (retList != null && retList.size() > 1) {
							csvExport(adstruct, // 対象データ情報
									"1", // エラー区分
									j + 1, // エラー発生行
									null,
									new ExpjMessage((String) retList.get(1)).getMessage(_locale), null); // エラーメッセージ
							_intErrorCount++;
							return false;
						}
					}
				} else {
					strLotNo = adstruct.getLOT_NO();
				}
			}else{
				strLotNo = adstruct.getLOT_NO();
			}
			
			// 出来高実績番号の自動採番
			Numbering collectNum = 
					new Numbering(conn,
							CollectNumber.OUT_RSLT_CD,
							getsysUSER_CD(),
							sp.getProcId(),
							adstruct.getPLANT_CD());
			strOutputRsldCd = collectNum.getNo();
			if (isNull(strOutputRsldCd)) {
				//採番結果がない
				csvExport(adstruct					// 対象データ情報
						, "1"						// エラー区分
						, j + 1						// エラー発生行
						,null
						,new ExpjMessage("ZZ01106").getMessage(_locale)
						,null);	// エラーメッセージ
				_intErrorCount++;
				setReadStatus(ERROR);
				return false;
			}
			// 出来高実績番号を設定する。
			adstruct.setOUTPUT_RSLT_CD(strOutputRsldCd);

			adstruct.setLOT_NO(strLotNo);

			adstruct.setsUser_ID(sysUSER_CD);
			// [出来高実績]への追加内容
			entity.minsertT_OUTPUT_RSLT.create(conn, adstruct);
			return true;
		}catch(Exception e) {
			throw new ExpjException(e);
		}
	}
	
	/**
	 * CSVフェイル内容は、作業実績登録処理
	 * @param csvList
	 * @return
	 * @throws FoundationException 
	 */
	private boolean insertTOprRslt (AD0110010Struct adstruct,int m) throws ExpjException {
		try {
			List targetProcByItemList = entity.mSelectTargetProcByItem.read(conn, adstruct);
			AD0110010Struct targetProcByItemStruct = new AD0110010Struct();
			if (targetProcByItemList.isEmpty()) {

				// 品目別仕掛をセットする
				procByItemStruct = new AD0110010Struct();
				procByItemStruct = (AD0110010Struct)entity.mSelectCompleteProcByItem.read(conn,adstruct).get(0);
				procByItemStruct.setsUser_ID(sysUSER_CD);
				
				rsltStruct = new AD0110010Struct();
				rsltStruct.setsUser_ID(sysUSER_CD);
				// 作業指示番号
				rsltStruct.setOPR_INST_CD(procByItemStruct.getvc2OPR_INST_CD());

				// 最大分作回数＋１のセット
				List partialPrdNoList = entity.mselectMaxPrdNo.read(conn, rsltStruct);
				AD0110010Struct partialPrdNoStruct = new AD0110010Struct();
				if (!partialPrdNoList.isEmpty()) {
					partialPrdNoStruct = (AD0110010Struct)partialPrdNoList.get(0);
				}
				// 分作回数
				rsltStruct.setPARTIAL_PRD_NO(partialPrdNoStruct.getMAX_PRD_NO());
				// 保管区コード
				rsltStruct.setWH_CD(adstruct.getWH_CD());
				// 出来高実績番号
				rsltStruct.setOUTPUT_RSLT_CD(strOutputRsldCd);
				// 在庫ロット番号
				rsltStruct.setLOT_NO(strLotNo);
				//品目番号
				rsltStruct.setITEM_CD(adstruct.getITEM_CD());
				//作業区コード
				rsltStruct.setWS_CD(adstruct.getWS_CD());
				// 良品数
				rsltStruct.setACPT_QTY(adstruct.getACPT_QTY());
				// 不良数
				rsltStruct.setDEFECT_QTY(adstruct.getDEFECT_QTY());
				// 作業日
				rsltStruct.setOPR_DATE(adstruct.getOPR_DATE());
				// 工場コード
				rsltStruct.setPLANT_CD(adstruct.getPLANT_CD());
				// 作業訂正回数
				rsltStruct.setOPR_CRCT_NO("0");
				
				// [作業実績]の追加を行う
				entity.minsertT_OPR_RSLT.create(conn, rsltStruct);
				
				AD0110010Struct updateWorkInProcByitemStruct = new AD0110010Struct();
				updateWorkInProcByitemStruct.setsUser_ID(sysUSER_CD);
				// 作業計画番号
				updateWorkInProcByitemStruct.setWORK_ODR_CD(procByItemStruct.getvc2WORK_ODR_CD());
				// 作業指示番号
				updateWorkInProcByitemStruct.setOPR_INST_CD(procByItemStruct.getvc2OPR_INST_CD());

				// 同作業指示番号中の最遅作業日の取得（[作業実績]."作業実績作業日"）
				List lastDateList = entity.mselectLastDate.read(conn, updateWorkInProcByitemStruct);
				AD0110010Struct lastDateStruct = new AD0110010Struct();
				if (lastDateList.isEmpty()) {
					csvExport(adstruct					// 対象データ情報
							, "1"						// エラー区分
							, m + 1						// エラー発生行
							,"Expj.WORK_ODR_CD"			// エラー項目名
							,new ExpjMessage("ZZ01101").getMessage(_locale)
							,null);	// エラーメッセージ
					_intErrorCount++;
					return false;
				}else{
					lastDateStruct = (AD0110010Struct)lastDateList.get(0);
				}
				
				// 品目別仕掛完了日
				updateWorkInProcByitemStruct.setdateOPR_DATE(lastDateStruct.getMAX_OPR_DATE());
				
				// [品目別仕掛]の更新を行う
				entity.mupdateT_WORK_IN_PROC_BY_ITEM.update(conn, updateWorkInProcByitemStruct);
				
				//下位部品の自動出庫処理
				String sFLG = "1";	//作業完了
				boolean result = true;
				//下位部品中、出庫型が自動出庫の部品を出庫処理
				result = callCommonIssue(adstruct, sFLG,adstruct.getPLANT_CD(),m);
				if(result == false){
					return result;
				}
				//上位部品入庫処理
				//入庫処理（保管区別入出庫追加＆入庫処理）
				result = callRcvCancel(adstruct,sFLG,adstruct.getPLANT_CD(),m);
				if(result == false){
					return result;
				}
			}else{

				//良品数
				BigDecimal AcptQty = new BigDecimal(adstruct.getACPT_QTY());
				//実績計上が必要な良品の残数
				BigDecimal TempAcptQty = new BigDecimal(adstruct.getACPT_QTY());
				//不良数
				BigDecimal DefectQty = new BigDecimal(adstruct.getDEFECT_QTY());
				//実績計上が必要な不良の残数
				BigDecimal TempDefectQty = new BigDecimal(adstruct.getDEFECT_QTY());
				//良品数＋不良数
				BigDecimal TotalQty = new BigDecimal("0");
				TotalQty = AcptQty.add(DefectQty) ;
				//実績計上対象の品目別仕掛の作業指示数
				BigDecimal TargetOprInstQty  = new BigDecimal("0");
				//実績計上対象の品目別仕掛の作業指示番号を持つ作業実績のSUM(良品数+不良数)
				BigDecimal SumOprRsltQty	 = new BigDecimal("0");	
				//実績計上対象の品目別仕掛に実績計上できる残数
				BigDecimal TempOprInstQty	= new BigDecimal("0");
				//実績計上が必要な良品残数＋不良残数
				BigDecimal TempSumOprRsltQty = new BigDecimal("0");
			
				int i=0 ;
				int ExitFlg=0 ;		 //while抜け出しフラグOFF
				int CompleteFlg=0 ;	 //品目別仕掛完了フラグOFF
			
			
				while ( i < targetProcByItemList.size() && ExitFlg == 0 ) {
			
					//対象品目別仕掛をセット
					procByItemStruct = (AD0110010Struct)targetProcByItemList.get(i);
					procByItemStruct.setsUser_ID(sysUSER_CD);
			
					//対象レコードの作業指示数をセット
					TargetOprInstQty = new BigDecimal(procByItemStruct.getOPR_INST_QTY());
			
					//対象品目別仕掛の作業指示番号と同一の作業実績のSUM(良品数＋不良数)取得
					List sumOprRsltQtyList = entity.mselectSumOprRsltQty.read(conn, procByItemStruct);
					if (sumOprRsltQtyList.isEmpty()) {
						//作業実績が無いため、SUM(良品数+不良数)はZEROとする
						SumOprRsltQty = new BigDecimal("0");
					} else {
						//品目別仕掛をセットする
						AD0110010Struct tempStruct = (AD0110010Struct)sumOprRsltQtyList.get(0);
						tempStruct.setsUser_ID(sysUSER_CD);
						SumOprRsltQty = new BigDecimal(tempStruct.getSUM_OPR_RSLT_QTY());
					}
			
					// 作業指示数が実績数より大きい場合のみ残指示数計算を行う。
					if (TargetOprInstQty.doubleValue() > SumOprRsltQty.doubleValue()){
					//作業指示数-SUM(良品数+不良数)
					TempOprInstQty = TargetOprInstQty.subtract(SumOprRsltQty );
					};

					//　実績計上が必要な数を算出
					TempSumOprRsltQty = TempAcptQty.add(TempDefectQty);
			
					if ( TempSumOprRsltQty.doubleValue() > 0 ) {
						if ( TempOprInstQty.doubleValue() <= TempSumOprRsltQty.doubleValue() ) {
							//作業指示残数＜＝実績計上が必要な数の場合：品目別仕掛完了
			
							if ( i + 1 == targetProcByItemList.size() ) {
								//品目別仕掛最後の1件であれば残数を全て計上する
								rsltStruct.setACPT_QTY(TempAcptQty.toString());	//良品数
								rsltStruct.setDEFECT_QTY(TempDefectQty.toString());//不良数
								TempAcptQty	= new BigDecimal("0");		//良品残数ZERO
								TempDefectQty  = new BigDecimal("0");	//不良残数ZERO
								TempOprInstQty = new BigDecimal("0");	//実績残数ZERO
								CompleteFlg = 1 ;						//品目別仕掛完了フラグON
							} else {
								//それ以外は品目別仕掛に計上できる分だけ計上する
								if ( TempOprInstQty.doubleValue() <= TempAcptQty.doubleValue() ) {
			
									rsltStruct.setACPT_QTY(
											TempOprInstQty.toString());		//良品数
									rsltStruct.setDEFECT_QTY("0.0");	//不良数
									TempAcptQty = 
											TempAcptQty.subtract(TempOprInstQty);//良品残数
									CompleteFlg = 1 ;	//品目別仕掛完了フラグON
								} else {
									//不良も使う
									if ( TempAcptQty.doubleValue() > 0 ) {
										//良品＋不良数で消し込む
										rsltStruct.setACPT_QTY(TempAcptQty.toString());
										TempOprInstQty = TempOprInstQty.subtract(TempAcptQty);
										rsltStruct.setDEFECT_QTY(TempOprInstQty.toString());
										TempDefectQty =  TempDefectQty.subtract(TempOprInstQty);
										TempAcptQty = new BigDecimal("0");	//良品残数ZERO
										CompleteFlg = 1 ;	//品目別仕掛完了フラグON
									} else {
									//不良数だけで消し込む
										rsltStruct.setACPT_QTY("0.0");
										rsltStruct.setDEFECT_QTY(TempOprInstQty.toString());
										TempDefectQty =  TempDefectQty.subtract(TempOprInstQty);
										TempAcptQty = new BigDecimal("0");	//良品残数ZERO
										CompleteFlg = 1 ;	//品目別仕掛完了フラグON
									}
								}
							}
						} else {
							//品目別仕掛が未完了の場合
			
							rsltStruct.setACPT_QTY(TempAcptQty.toString());
							rsltStruct.setDEFECT_QTY(TempDefectQty.toString());
							TempAcptQty   = new BigDecimal("0");	//良品残数ZERO
							TempDefectQty = new BigDecimal("0");	//不良残数ZERO
							ExitFlg=1;  //while抜け出しフラグON
						}
			
						//作業実績の登録処理
						rsltStruct.setsUser_ID(sysUSER_CD);
						rsltStruct.setOPR_INST_CD(procByItemStruct.getOPR_INST_CD());//作業指示番号

						//最大分作回数＋１のセット
						
						List maxPrdNoList = entity.mselectMaxPrdNo.read(conn, rsltStruct);

						//検索結果は必ずある
						AD0110010Struct maxPrdNoStruct = (AD0110010Struct)maxPrdNoList.get(0);
						maxPrdNoStruct.setsUser_ID(sysUSER_CD);

						rsltStruct.setPARTIAL_PRD_NO(maxPrdNoStruct.getMAX_PRD_NO());//分作回数
						rsltStruct.setITEM_CD(adstruct.getITEM_CD());//品目番号
						rsltStruct.setWS_CD(adstruct.getWS_CD());	//作業区コード
						rsltStruct.setOPR_DATE(adstruct.getOPR_DATE());//作業日
						rsltStruct.setWH_CD(adstruct.getWH_CD());	//保管区コード
						rsltStruct.setOUTPUT_RSLT_CD(strOutputRsldCd);//出来高実績番号
						rsltStruct.setPLANT_CD(adstruct.getPLANT_CD());//工場コード
						rsltStruct.setLOT_NO(strLotNo);//在庫ロット番号
						rsltStruct.setVEND_LOT_NO(adstruct.getVEND_LOT_NO());//メーカロット番号
						rsltStruct.setOPR_CRCT_NO("0");				//作業訂正回数
			
						//作業実績の登録
						entity.minsertT_OPR_RSLT.create(conn, rsltStruct);
						String sFLG = "0";	//初期値セット（作業未完了）
						//作業指示数分の実績が計上されていれば品目別仕掛を更新する
						if ( CompleteFlg == 1 ) {
							AD0110010Struct completeStruct = new AD0110010Struct();
							completeStruct.setsUser_ID(sysUSER_CD);
							completeStruct.setWORK_ODR_CD(procByItemStruct.getvc2WORK_ODR_CD());
							completeStruct.setOPR_INST_CD(rsltStruct.getOPR_INST_CD());

							//同作業指示番号中の最遅作業日の取得（[作業実績]."作業実績作業日"）
							List lastdist = entity.mselectLastDate.read(conn, completeStruct);
							if (lastdist.isEmpty()) {
								csvExport(adstruct					// 対象データ情報
										, "1"						// エラー区分
										, m + 1						// エラー発生行
										,"Expj.WORK_ODR_CD"			// エラー項目名
										,new ExpjMessage("ZZ01101").getMessage(_locale)
										,null);	// エラーメッセージ
								_intErrorCount++;
								return false;
							}
							AD0110010Struct tempStruct = (AD0110010Struct)lastdist.get(0);
							completeStruct.setdateOPR_DATE(tempStruct.getMAX_OPR_DATE());

							entity.mupdateT_WORK_IN_PROC_BY_ITEM.update(conn, completeStruct);
							sFLG = "1";	//作業完了
						}	
			
						//下位部品の自動出庫処理
						//this.callCommonIssue(sFLG);
						//入庫処理（保管区別入出庫追加＆入庫処理）
						//this.callRcvCancel(sFLG,entity);
						
						//下位部品の自動出庫処理
						boolean result = true;
						//下位部品中、出庫型が自動出庫の部品を出庫処理
						result = this.callCommonIssue(adstruct,sFLG,adstruct.getPLANT_CD(),m);
						if(result == false){
							return result;
						}
						//上位部品入庫処理
						//入庫処理（保管区別入出庫追加＆入庫処理）
						result = this.callRcvCancel(adstruct,sFLG,adstruct.getPLANT_CD(),m);
						if(result == false){
							return result;
						}
						
						CompleteFlg=0 ;	 //品目別仕掛完了フラグ再度OFF
						i = i + 1 ;
					} else {
					//実績計上が必要な数が０以下なので実績計上は行わない
			
						ExitFlg=1;  //while抜け出しフラグON
					}
				}
			}
				// 
				adstruct.setOUTPUT_RSLT_CD(strOutputRsldCd);

				//マニュアル出庫 キット出庫処理
				boolean result = this.callManiaruIssue(adstruct, adstruct.getPLANT_CD(),m);
				if(result == false){
					return false;
				}
				//ロット管理フラグ = 1(ロットトレース管理を行う。)の場合
				if("1".equals(mItemStruct.getLOT_CTRL_FLG())){
					//在庫ロット番号がNullでない場合
					if(adstruct.getLOT_NO() != null && !adstruct.getLOT_NO().equals("")){
						//ロット管理テーブル更新
						entity.mT_LOT_CTRL.update(conn,adstruct);
					}
				}
			return true;
		}catch(Exception e) {
			throw new ExpjException(e);
		}
		
	}
	
	// TODO: ユーザ定義のコードを記述してください
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * 参照ボタン押下時に実行される処理です。
	 *
	 */
	public void controlBrowse() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0110");
		logger.entering("AD0110010Control"+":USER="+struct.getsUser_ID(),"controlBrowse");
			//{{user_implement_dev:<controlBrowse>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlBrowse>
		logger.exiting("AD0110010Control"+":USER="+struct.getsUser_ID(),"controlBrowse");

		return;
	}

	/**
	 * 取込ボタン押下時に実行される処理です。
	 *
	 */
	public void controlCsvIn() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0110");
		logger.entering("AD0110010Control"+":USER="+struct.getsUser_ID(),"controlCsvIn");
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
							setErrorMessage("AD34033");
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
		logger.exiting("AD0110010Control"+":USER="+struct.getsUser_ID(),"controlCsvIn");

		return;
	}

	/**
	 * CSV出力ボタン押下時に実行される処理です。
	 *
	 */
	public void controlCSVOut() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0110");
		logger.entering("AD0110010Control"+":USER="+struct.getsUser_ID(),"controlCSVOut");
			//{{user_implement_dev:<controlCSVOut>
			// TODO: ユーザ定義のコードを記述してください
			// CSV出力部品を設定
				csvWriter = new CsvWriter(CsvWriter.getFileName(getsysUSER_CD()));
				AD0110010Struct errorStruct = null;
				List csv = new ArrayList();	// CSV情報
				// CSVヘッダ行をCSV情報に追加
				String[] title = {
						 "Expj.Cmt3094"							// エラー箇所
						,"Expj.Cmt3095"							// エラー区分
						,"Expj.Cmt3098"							// エラー内容
						,"Expj.Cmt6220"							// エラー項目
						,"Expj.PLANT_CD"						// 工場コード
						,"Expj.ITEM_CD"							// 品目番号
						,"Expj.WS_CD"							// 作業区コード
						,"Expj.WH_CD"							// 保管区コード
						,"Expj.ACPT_QTY"						// 良品数
						,"Expj.DEFECT_QTY"						// 不良数
						,"Expj.Cmt5833"							// 作業日
						,"Expj.OPR_TIME"						// 作業時間
						,"Expj.STOCK_LOT_CD"					// 在庫ロット番号
				};
				csv.add(title);
				// [画面].一覧部のエラー情報をCSV情報に追加
				for (int i = 0; i < list.size(); i++) {
					errorStruct = (AD0110010Struct)list.get(i);
					String[] date = {
							 errorStruct.getl_ERROR_IN()
							,errorStruct.getl_ERR_TYP()
							,errorStruct.getl_ERR_INFO()
							,errorStruct.getl_ERR_CTR_NM()
							,replaceSlashSub(errorStruct.getl_ERR_PLANT_CD())
							,replaceSlashSub(errorStruct.getl_ERR_ITEM_CD())
							,replaceSlashSub(errorStruct.getl_ERR_WS_CD())
							,replaceSlashSub(errorStruct.getl_ERR_WH_CD())
							,replaceSlashSub(errorStruct.getl_ERR_ACPT_QTY())
							,replaceSlashSub(errorStruct.getl_ERR_DEFECT_QTY())
							,replaceSlashSub(errorStruct.getl_ERR_OPR_DATE())
							,replaceSlashSub(errorStruct.getl_ERR_OPR_TIME())
							,replaceSlashSub(errorStruct.getl_ERR_LOT_NO())
					};
					csv.add(date);
				}
				
				// CSVファイルを作成
				csvWriter.write(csv, CoreTools.getLocale(struct.getsUser_ID()), true);
				// CSVファイルをクライアントに出力
				struct.setDOWNLOAD_FILE(getCsvWriter().getFilePath());
		
                //}}user_implement_dev:<controlCSVOut>
		logger.exiting("AD0110010Control"+":USER="+struct.getsUser_ID(),"controlCSVOut");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0110");
		logger.entering("AD0110010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
		setList(null);
		// 検索状態を「初期状態」に設定
		setReadStatus(INITIAL);
                //}}user_implement_dev:<controlClear>
		logger.exiting("AD0110010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * 閉じるボタン押下時に実行される処理です。
	 *
	 */
	public void controlClose() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0110");
		logger.entering("AD0110010Control"+":USER="+struct.getsUser_ID(),"controlClose");
			//{{user_implement_dev:<controlClose>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlClose>
		logger.exiting("AD0110010Control"+":USER="+struct.getsUser_ID(),"controlClose");

		return;
	}

	/**
	 * 実行ボタン押下時に実行される処理です。
	 *
	 */
	public void controlExecute() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0110");
		logger.entering("AD0110010Control"+":USER="+struct.getsUser_ID(),"controlExecute");
			//{{user_implement_dev:<controlExecute>
			// TODO: ユーザ定義のコードを記述してください
		try {
			setReadStatus(INITIAL);
			// バッチ処理クラスのmain引数
			String strBatchClassName = null;		// 呼び出し先クラス名
			String strBatchProcessingTyp = null;	// バッチ処理区分
			String strProgramId = null;				// 業務名（AD0110B001）
			String strUserId = null;				// ユーザID
			String strPlantCd = null;				// 工場コード
			String strCsvTakeTyp = null;			// CSV取込方式

			// 引数セット
			strBatchClassName = " com.nec.jp.orteus.metamorBase.AD0110.AD0110B001.mainAD0110B001";
			strBatchProcessingTyp = "2";	// 2: 自動運転しない（夜間バッチなし）
			strProgramId = "AD0110B001";	// 業務名（AD0110B001）
			strUserId = getsysUSER_CD();	// ユーザID
			strPlantCd = getsysPLANT_CD();	// 工場コード
			strCsvTakeTyp = "1";			// 1：固定ファイル取込

			// バッチ処理を実行する -------------------------------------------
			ResourceBundle bundle = SystemConfig.getBundle();
			String javaPath = SystemConfig.getProperty("JAVA_PATH", bundle);
			if (javaPath == null) {
				// システム既定値ファイルからの情報取得に失敗しました(ＪＶＭパス)
				setErrorMessage("ZZ09010");
				return;
			}
			String ClassPath = SystemConfig.getProperty("CLASS_PATH", bundle);
			if (ClassPath == null) {
				// システム既定値ファイルからの情報取得に失敗しました(クラスパス)
				setErrorMessage("ZZ09012");
				return;
			}
			String batchPath = SystemConfig.getProperty("BATCH_PATH", bundle);
			if (batchPath == null) {
				// システム既定値ファイルからの情報取得に失敗しました(バッチ起動設定)
				setErrorMessage("ZZ09011");
				return;
			}

			String heapSize = SystemConfig.getProperty("HIGH_HEAP_SIZE", bundle);
			if (heapSize == null) {
				// システム既定値ファイルからの情報取得に失敗しました(バッチヒープサイズ設定)
				setErrorMessage("ZZ09017");
				return;
			}
			StringBuffer buffer = new StringBuffer(javaPath); // コマンド文字列
			buffer.append(" -cp ");
			buffer.append(ClassPath);
			buffer.append(" -Dcom.nec.jp.orteus.util.logging.config.file=");
			buffer.append(batchPath);
			buffer.append(strBatchClassName);

			// バッチ処理区分
			buffer.append(" ").append(strBatchProcessingTyp);
			// ログインユーザのユーザコード
			buffer.append(" ").append(strUserId);
			// 業務名
			buffer.append(" ").append(strProgramId);
			// 工場コード
			buffer.append(" ").append(strPlantCd);
			// CSV取込方式
			buffer.append(" ").append(strCsvTakeTyp);

			try {
				// バッチ処理実行
				Runtime runtime = Runtime.getRuntime();
				Process p = runtime.exec(buffer.toString());

			} catch (IOException e) {
				// バッチ呼び出し失敗の場合、画面メッセージを表示する。
				setErrorMessage("ZZ09014");
				return;
			}
			// バッチ呼び出し成功の場合、画面メッセージを表示する。
			setInfoMessage("ZZ09013");

		} catch(Exception e) {
			e.printStackTrace();
			setErrorMessage("ZZ01106");
		}
                //}}user_implement_dev:<controlExecute>
		logger.exiting("AD0110010Control"+":USER="+struct.getsUser_ID(),"controlExecute");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0110");
		logger.entering("AD0110010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AD0110010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0110");
		logger.entering("AD0110010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
		try{
			// 業務運用日取得
			try {
				DateCtrlStruct dateCtrl = DateCtrlControl.getData(conn, getsysPLANT_CD());
				_btmBusinessOprDate = dateCtrl.getBUSINESS_OPR_DATE();
			} catch(DataNotFoundException e) {
				ExpjMessage emsg = new ExpjMessage("AC34080" );
				sysLog.severe(emsg, getsysUSER_CD());//致命的エラー エラー内容
				ExpjException ee = new ExpjException(e, emsg); // エクセプションを生成
				setReadStatus(ERROR);
				ee.setLocale(CoreTools.getLocale(getsysUSER_CD()));
				throw ee;
			}
			
			// 以下の条件で、[システムパラメータ]を検索し、設定値（完了している月の実績の登録／修正を可能とするか否かの区分）を取得する。
			AD0110010Struct adStruct = new AD0110010Struct();
			List valueList = entity.mselectPARAMETER.read(conn, adStruct);
			if (valueList.isEmpty()) {
				strValus = "true";
			}else {
				adStruct = (AD0110010Struct)valueList.get(0);
				strValus = adStruct.getVALUE();
			}

			// コンボボックスデータ用意
	 		ComboBox combBox = new ComboBox(conn, sysUSER_CD);
			// コンボボックスのデータを取得
			_COM_ERR_TYP = combBox.getData("ERR_TYP");
			// 作業時間単位区分
			_OPR_TIME_UNIT_TYP = combBox.getData("OPR_TIME_UNIT_TYP");
			
			// 不良理由コード
			_DEFECT_CAUSE_CD_INNER = combBox.getData("DEFECT_CAUSE_CD_INNER");

			// 会社コード取得
			_company_cd = SystemInformation.getSysMyCompanyCd();
			
			
		}catch(ExpjException e) {
			throw e;
		}
		catch(Exception e) {
			e.printStackTrace();
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());//致命的エラー エラー内容
			ExpjException ee = new ExpjException(e, emsg); // エクセプションを生成
			ee.setLocale(CoreTools.getLocale(getsysUSER_CD()));
			throw ee;
		} 
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AD0110010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * イベントハンドラの前処理です。
	 *
	 * @param buttun ボタン名
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0110");
		logger.entering("AD0110010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");
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
		logger.exiting("AD0110010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
//			throw new FoundationException("AD0110010Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AD0110010-E999","CSVの出力処理"));
			throw new FoundationException("AD0110010Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AD0110010-E999","システム日付の取得処理"));
				throw new FoundationException("AD0110010Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AD0110010-E999","コントロールのイベント処理"));
			throw new FoundationException("AD0110010Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected AD0110010Entity entity;
	protected AD0110010Struct struct;
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

		entity = new AD0110010Entity();
		struct = new AD0110010Struct();

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
	 * AD0110010クラスの標準コンストラクタ
	 */
	public AD0110010Control() throws BusinessProcessException, FoundationException
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
				AD0110010Struct key = (AD0110010Struct)keyList.get(j);
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
				if(msgKeyType.containsKeyColumn("l_ERR_PLANT_CD") && key.getl_ERR_PLANT_CD() != null) {
					msgKey.setKeyValue("l_ERR_PLANT_CD", key.getl_ERR_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_ITEM_CD") && key.getl_ERR_ITEM_CD() != null) {
					msgKey.setKeyValue("l_ERR_ITEM_CD", key.getl_ERR_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_WS_CD") && key.getl_ERR_WS_CD() != null) {
					msgKey.setKeyValue("l_ERR_WS_CD", key.getl_ERR_WS_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_OPR_DATE") && key.getl_ERR_OPR_DATE() != null) {
					msgKey.setKeyValue("l_ERR_OPR_DATE", key.getl_ERR_OPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_ACPT_QTY") && key.getl_ERR_ACPT_QTY() != null) {
					msgKey.setKeyValue("l_ERR_ACPT_QTY", key.getl_ERR_ACPT_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_DEFECT_QTY") && key.getl_ERR_DEFECT_QTY() != null) {
					msgKey.setKeyValue("l_ERR_DEFECT_QTY", key.getl_ERR_DEFECT_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_OPR_TIME") && key.getl_ERR_OPR_TIME() != null) {
					msgKey.setKeyValue("l_ERR_OPR_TIME", key.getl_ERR_OPR_TIME());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_LOT_NO") && key.getl_ERR_LOT_NO() != null) {
					msgKey.setKeyValue("l_ERR_LOT_NO", key.getl_ERR_LOT_NO());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_WH_CD") && key.getl_ERR_WH_CD() != null) {
					msgKey.setKeyValue("l_ERR_WH_CD", key.getl_ERR_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("w_COLUMN_FLG") && key.getw_COLUMN_FLG() != null) {
					msgKey.setKeyValue("w_COLUMN_FLG", key.getw_COLUMN_FLG());
				}
				if(msgKeyType.containsKeyColumn("TEMP_PLAN_QTY") && key.getTEMP_PLAN_QTY() != null) {
					msgKey.setKeyValue("TEMP_PLAN_QTY", key.getTEMP_PLAN_QTY());
				}
				if(msgKeyType.containsKeyColumn("TEMP_USEOVER_QTY") && key.getTEMP_USEOVER_QTY() != null) {
					msgKey.setKeyValue("TEMP_USEOVER_QTY", key.getTEMP_USEOVER_QTY());
				}
				if(msgKeyType.containsKeyColumn("TEMP_PLANOUT_QTY") && key.getTEMP_PLANOUT_QTY() != null) {
					msgKey.setKeyValue("TEMP_PLANOUT_QTY", key.getTEMP_PLANOUT_QTY());
				}
				if(msgKeyType.containsKeyColumn("TEMP_USE_QTY") && key.getTEMP_USE_QTY() != null) {
					msgKey.setKeyValue("TEMP_USE_QTY", key.getTEMP_USE_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_DEFECT_QTY_KEEP") && key.getl_ERR_DEFECT_QTY_KEEP() != null) {
					msgKey.setKeyValue("l_ERR_DEFECT_QTY_KEEP", key.getl_ERR_DEFECT_QTY_KEEP());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_ACPT_QTY_KEEP") && key.getl_ERR_ACPT_QTY_KEEP() != null) {
					msgKey.setKeyValue("l_ERR_ACPT_QTY_KEEP", key.getl_ERR_ACPT_QTY_KEEP());
				}
				if(msgKeyType.containsKeyColumn("l_LOT_NO_KEEP") && key.getl_LOT_NO_KEEP() != null) {
					msgKey.setKeyValue("l_LOT_NO_KEEP", key.getl_LOT_NO_KEEP());
				}
				if(msgKeyType.containsKeyColumn("OUTPUT_RSLT_CD") && key.getOUTPUT_RSLT_CD() != null) {
					msgKey.setKeyValue("OUTPUT_RSLT_CD", key.getOUTPUT_RSLT_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("ACPT_QTY") && key.getACPT_QTY() != null) {
					msgKey.setKeyValue("ACPT_QTY", key.getACPT_QTY());
				}
				if(msgKeyType.containsKeyColumn("DEFECT_QTY") && key.getDEFECT_QTY() != null) {
					msgKey.setKeyValue("DEFECT_QTY", key.getDEFECT_QTY());
				}
				if(msgKeyType.containsKeyColumn("DEFECT_CAUSE_CD") && key.getDEFECT_CAUSE_CD() != null) {
					msgKey.setKeyValue("DEFECT_CAUSE_CD", key.getDEFECT_CAUSE_CD());
				}
				if(msgKeyType.containsKeyColumn("OPR_DATE") && key.getOPR_DATE() != null) {
					msgKey.setKeyValue("OPR_DATE", key.getOPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("WH_CD") && key.getWH_CD() != null) {
					msgKey.setKeyValue("WH_CD", key.getWH_CD());
				}
				if(msgKeyType.containsKeyColumn("WS_CD") && key.getWS_CD() != null) {
					msgKey.setKeyValue("WS_CD", key.getWS_CD());
				}
				if(msgKeyType.containsKeyColumn("OUTPUT_RSLT_PERSON") && key.getOUTPUT_RSLT_PERSON() != null) {
					msgKey.setKeyValue("OUTPUT_RSLT_PERSON", key.getOUTPUT_RSLT_PERSON());
				}
				if(msgKeyType.containsKeyColumn("OUTPUT_RSLT_COMMENT") && key.getOUTPUT_RSLT_COMMENT() != null) {
					msgKey.setKeyValue("OUTPUT_RSLT_COMMENT", key.getOUTPUT_RSLT_COMMENT());
				}
				if(msgKeyType.containsKeyColumn("OPR_TIME_UNIT_TYP") && key.getOPR_TIME_UNIT_TYP() != null) {
					msgKey.setKeyValue("OPR_TIME_UNIT_TYP", key.getOPR_TIME_UNIT_TYP());
				}
				if(msgKeyType.containsKeyColumn("PRE_ARRANGEMENT_TIME") && key.getPRE_ARRANGEMENT_TIME() != null) {
					msgKey.setKeyValue("PRE_ARRANGEMENT_TIME", key.getPRE_ARRANGEMENT_TIME());
				}
				if(msgKeyType.containsKeyColumn("POST_ARRANGEMENT_TIME") && key.getPOST_ARRANGEMENT_TIME() != null) {
					msgKey.setKeyValue("POST_ARRANGEMENT_TIME", key.getPOST_ARRANGEMENT_TIME());
				}
				if(msgKeyType.containsKeyColumn("OPR_TIME") && key.getOPR_TIME() != null) {
					msgKey.setKeyValue("OPR_TIME", key.getOPR_TIME());
				}
				if(msgKeyType.containsKeyColumn("CESSATION_TIME") && key.getCESSATION_TIME() != null) {
					msgKey.setKeyValue("CESSATION_TIME", key.getCESSATION_TIME());
				}
				if(msgKeyType.containsKeyColumn("CESSATION_CAUSE") && key.getCESSATION_CAUSE() != null) {
					msgKey.setKeyValue("CESSATION_CAUSE", key.getCESSATION_CAUSE());
				}
				if(msgKeyType.containsKeyColumn("LOT_NO") && key.getLOT_NO() != null) {
					msgKey.setKeyValue("LOT_NO", key.getLOT_NO());
				}
				if(msgKeyType.containsKeyColumn("VEND_LOT_NO") && key.getVEND_LOT_NO() != null) {
					msgKey.setKeyValue("VEND_LOT_NO", key.getVEND_LOT_NO());
				}
				if(msgKeyType.containsKeyColumn("DEFECT_COMMENT") && key.getDEFECT_COMMENT() != null) {
					msgKey.setKeyValue("DEFECT_COMMENT", key.getDEFECT_COMMENT());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_CD") && key.getOPR_INST_CD() != null) {
					msgKey.setKeyValue("OPR_INST_CD", key.getOPR_INST_CD());
				}
				if(msgKeyType.containsKeyColumn("PARTIAL_PRD_NO") && key.getPARTIAL_PRD_NO() != null) {
					msgKey.setKeyValue("PARTIAL_PRD_NO", key.getPARTIAL_PRD_NO());
				}
				if(msgKeyType.containsKeyColumn("OPR_CRCT_NO") && key.getOPR_CRCT_NO() != null) {
					msgKey.setKeyValue("OPR_CRCT_NO", key.getOPR_CRCT_NO());
				}
				if(msgKeyType.containsKeyColumn("dateOPR_DATE") && key.getdateOPR_DATE() != null) {
					msgKey.setKeyValue("dateOPR_DATE", key.getdateOPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("WORK_ODR_CD") && key.getWORK_ODR_CD() != null) {
					msgKey.setKeyValue("WORK_ODR_CD", key.getWORK_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("vc2ITEM_CD") && key.getvc2ITEM_CD() != null) {
					msgKey.setKeyValue("vc2ITEM_CD", key.getvc2ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("LOT_CTRL_FLG") && key.getLOT_CTRL_FLG() != null) {
					msgKey.setKeyValue("LOT_CTRL_FLG", key.getLOT_CTRL_FLG());
				}
				if(msgKeyType.containsKeyColumn("LOT_NUMBERING_TYP") && key.getLOT_NUMBERING_TYP() != null) {
					msgKey.setKeyValue("LOT_NUMBERING_TYP", key.getLOT_NUMBERING_TYP());
				}
				if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP") && key.getUNIT_QTY_TYP() != null) {
					msgKey.setKeyValue("UNIT_QTY_TYP", key.getUNIT_QTY_TYP());
				}
				if(msgKeyType.containsKeyColumn("COUNT") && key.getCOUNT() != null) {
					msgKey.setKeyValue("COUNT", key.getCOUNT());
				}
				if(msgKeyType.containsKeyColumn("vc2PLANT_CD") && key.getvc2PLANT_CD() != null) {
					msgKey.setKeyValue("vc2PLANT_CD", key.getvc2PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("BUSINESS_OPR_DATE") && key.getBUSINESS_OPR_DATE() != null) {
					msgKey.setKeyValue("BUSINESS_OPR_DATE", key.getBUSINESS_OPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("vc2LOT_NO") && key.getvc2LOT_NO() != null) {
					msgKey.setKeyValue("vc2LOT_NO", key.getvc2LOT_NO());
				}
				if(msgKeyType.containsKeyColumn("vc2WORK_ODR_CD") && key.getvc2WORK_ODR_CD() != null) {
					msgKey.setKeyValue("vc2WORK_ODR_CD", key.getvc2WORK_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("OD_NO") && key.getOD_NO() != null) {
					msgKey.setKeyValue("OD_NO", key.getOD_NO());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_QTY") && key.getOPR_INST_QTY() != null) {
					msgKey.setKeyValue("OPR_INST_QTY", key.getOPR_INST_QTY());
				}
				if(msgKeyType.containsKeyColumn("WORK_STS_TYP") && key.getWORK_STS_TYP() != null) {
					msgKey.setKeyValue("WORK_STS_TYP", key.getWORK_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("MODIFY_COUNT_BY_ITEM") && key.getMODIFY_COUNT_BY_ITEM() != null) {
					msgKey.setKeyValue("MODIFY_COUNT_BY_ITEM", key.getMODIFY_COUNT_BY_ITEM());
				}
				if(msgKeyType.containsKeyColumn("vc2OPR_INST_CD") && key.getvc2OPR_INST_CD() != null) {
					msgKey.setKeyValue("vc2OPR_INST_CD", key.getvc2OPR_INST_CD());
				}
				if(msgKeyType.containsKeyColumn("VALUE") && key.getVALUE() != null) {
					msgKey.setKeyValue("VALUE", key.getVALUE());
				}
				if(msgKeyType.containsKeyColumn("USER_CD") && key.getUSER_CD() != null) {
					msgKey.setKeyValue("USER_CD", key.getUSER_CD());
				}
				if(msgKeyType.containsKeyColumn("MAX_PRD_NO") && key.getMAX_PRD_NO() != null) {
					msgKey.setKeyValue("MAX_PRD_NO", key.getMAX_PRD_NO());
				}
				if(msgKeyType.containsKeyColumn("MAX_OPR_DATE") && key.getMAX_OPR_DATE() != null) {
					msgKey.setKeyValue("MAX_OPR_DATE", key.getMAX_OPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_CTRL_CD") && key.getRCV_ISSUE_CTRL_CD() != null) {
					msgKey.setKeyValue("RCV_ISSUE_CTRL_CD", key.getRCV_ISSUE_CTRL_CD());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_TYP") && key.getRCV_ISSUE_TYP() != null) {
					msgKey.setKeyValue("RCV_ISSUE_TYP", key.getRCV_ISSUE_TYP());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_CD") && key.getJOB_ODR_CD() != null) {
					msgKey.setKeyValue("JOB_ODR_CD", key.getJOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_DETAIL_NO") && key.getJOB_ODR_DETAIL_NO() != null) {
					msgKey.setKeyValue("JOB_ODR_DETAIL_NO", key.getJOB_ODR_DETAIL_NO());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_CD") && key.getPUCH_ODR_CD() != null) {
					msgKey.setKeyValue("PUCH_ODR_CD", key.getPUCH_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("ACPT_NO") && key.getACPT_NO() != null) {
					msgKey.setKeyValue("ACPT_NO", key.getACPT_NO());
				}
				if(msgKeyType.containsKeyColumn("ACPT_RSLT_CRCT_NO") && key.getACPT_RSLT_CRCT_NO() != null) {
					msgKey.setKeyValue("ACPT_RSLT_CRCT_NO", key.getACPT_RSLT_CRCT_NO());
				}
				if(msgKeyType.containsKeyColumn("INSPEC_RSLT_CRCT_NO") && key.getINSPEC_RSLT_CRCT_NO() != null) {
					msgKey.setKeyValue("INSPEC_RSLT_CRCT_NO", key.getINSPEC_RSLT_CRCT_NO());
				}
				if(msgKeyType.containsKeyColumn("WORK_IN_PROC_CD") && key.getWORK_IN_PROC_CD() != null) {
					msgKey.setKeyValue("WORK_IN_PROC_CD", key.getWORK_IN_PROC_CD());
				}
				if(msgKeyType.containsKeyColumn("OPR_RSLT_CRCT_NO") && key.getOPR_RSLT_CRCT_NO() != null) {
					msgKey.setKeyValue("OPR_RSLT_CRCT_NO", key.getOPR_RSLT_CRCT_NO());
				}
				if(msgKeyType.containsKeyColumn("h_ISSUE_INST_CD") && key.geth_ISSUE_INST_CD() != null) {
					msgKey.setKeyValue("h_ISSUE_INST_CD", key.geth_ISSUE_INST_CD());
				}
				if(msgKeyType.containsKeyColumn("SAVE_STOCK_ON_HAND_QTY") && key.getSAVE_STOCK_ON_HAND_QTY() != null) {
					msgKey.setKeyValue("SAVE_STOCK_ON_HAND_QTY", key.getSAVE_STOCK_ON_HAND_QTY());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_QTY") && key.getRCV_ISSUE_QTY() != null) {
					msgKey.setKeyValue("RCV_ISSUE_QTY", key.getRCV_ISSUE_QTY());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_AMOUNT") && key.getRCV_ISSUE_AMOUNT() != null) {
					msgKey.setKeyValue("RCV_ISSUE_AMOUNT", key.getRCV_ISSUE_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_DATE") && key.getRCV_ISSUE_DATE() != null) {
					msgKey.setKeyValue("RCV_ISSUE_DATE", key.getRCV_ISSUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_GNR_TYP") && key.getRCV_ISSUE_GNR_TYP() != null) {
					msgKey.setKeyValue("RCV_ISSUE_GNR_TYP", key.getRCV_ISSUE_GNR_TYP());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_ODD_QTY") && key.getRCV_ISSUE_ODD_QTY() != null) {
					msgKey.setKeyValue("RCV_ISSUE_ODD_QTY", key.getRCV_ISSUE_ODD_QTY());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UPD_TYP") && key.getSTOCK_UPD_TYP() != null) {
					msgKey.setKeyValue("STOCK_UPD_TYP", key.getSTOCK_UPD_TYP());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_CMPLT_FLG") && key.getRCV_ISSUE_CMPLT_FLG() != null) {
					msgKey.setKeyValue("RCV_ISSUE_CMPLT_FLG", key.getRCV_ISSUE_CMPLT_FLG());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_COMMENT") && key.getRCV_ISSUE_COMMENT() != null) {
					msgKey.setKeyValue("RCV_ISSUE_COMMENT", key.getRCV_ISSUE_COMMENT());
				}
				if(msgKeyType.containsKeyColumn("CONS_TYP") && key.getCONS_TYP() != null) {
					msgKey.setKeyValue("CONS_TYP", key.getCONS_TYP());
				}
				if(msgKeyType.containsKeyColumn("COMPANY_CD") && key.getCOMPANY_CD() != null) {
					msgKey.setKeyValue("COMPANY_CD", key.getCOMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("SUM_OPR_RSLT_QTY") && key.getSUM_OPR_RSLT_QTY() != null) {
					msgKey.setKeyValue("SUM_OPR_RSLT_QTY", key.getSUM_OPR_RSLT_QTY());
				}
				if(msgKeyType.containsKeyColumn("vc2OUTPUT_RSLT_CD") && key.getvc2OUTPUT_RSLT_CD() != null) {
					msgKey.setKeyValue("vc2OUTPUT_RSLT_CD", key.getvc2OUTPUT_RSLT_CD());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_TYP") && key.getISSUE_TYP() != null) {
					msgKey.setKeyValue("ISSUE_TYP", key.getISSUE_TYP());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_INST_UNIT_DENOMINATOR") && key.getISSUE_INST_UNIT_DENOMINATOR() != null) {
					msgKey.setKeyValue("ISSUE_INST_UNIT_DENOMINATOR", key.getISSUE_INST_UNIT_DENOMINATOR());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_INST_UNIT_NUMERATOR") && key.getISSUE_INST_UNIT_NUMERATOR() != null) {
					msgKey.setKeyValue("ISSUE_INST_UNIT_NUMERATOR", key.getISSUE_INST_UNIT_NUMERATOR());
				}
				if(msgKeyType.containsKeyColumn("ITEM_NAME") && key.getITEM_NAME() != null) {
					msgKey.setKeyValue("ITEM_NAME", key.getITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP") && key.getMRP_ODR_TYP() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP", key.getMRP_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("WH_NAME") && key.getWH_NAME() != null) {
					msgKey.setKeyValue("WH_NAME", key.getWH_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_UNIT_QTY_TYP") && key.getl_UNIT_QTY_TYP() != null) {
					msgKey.setKeyValue("l_UNIT_QTY_TYP", key.getl_UNIT_QTY_TYP());
				}
				if(msgKeyType.containsKeyColumn("TOTAL_ISSUE_QTY") && key.getTOTAL_ISSUE_QTY() != null) {
					msgKey.setKeyValue("TOTAL_ISSUE_QTY", key.getTOTAL_ISSUE_QTY());
				}
				if(msgKeyType.containsKeyColumn("SUPPLIED_ISSUE_QTY") && key.getSUPPLIED_ISSUE_QTY() != null) {
					msgKey.setKeyValue("SUPPLIED_ISSUE_QTY", key.getSUPPLIED_ISSUE_QTY());
				}
				if(msgKeyType.containsKeyColumn("count_RCV_ISSUE") && key.getcount_RCV_ISSUE() != null) {
					msgKey.setKeyValue("count_RCV_ISSUE", key.getcount_RCV_ISSUE());
				}
				if(msgKeyType.containsKeyColumn("STOCK_ON_HAND_QTY") && key.getSTOCK_ON_HAND_QTY() != null) {
					msgKey.setKeyValue("STOCK_ON_HAND_QTY", key.getSTOCK_ON_HAND_QTY());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_QTY") && key.getISSUE_QTY() != null) {
					msgKey.setKeyValue("ISSUE_QTY", key.getISSUE_QTY());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_DATE") && key.getISSUE_DATE() != null) {
					msgKey.setKeyValue("ISSUE_DATE", key.getISSUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("SPENT_QTY") && key.getSPENT_QTY() != null) {
					msgKey.setKeyValue("SPENT_QTY", key.getSPENT_QTY());
				}
				if(msgKeyType.containsKeyColumn("NEXTVAL") && key.getNEXTVAL() != null) {
					msgKey.setKeyValue("NEXTVAL", key.getNEXTVAL());
				}
				if(msgKeyType.containsKeyColumn("RSLT_CTL_SEQ_NO") && key.getRSLT_CTL_SEQ_NO() != null) {
					msgKey.setKeyValue("RSLT_CTL_SEQ_NO", key.getRSLT_CTL_SEQ_NO());
				}
				if(msgKeyType.containsKeyColumn("PART_SUPPLIED_COMMENT") && key.getPART_SUPPLIED_COMMENT() != null) {
					msgKey.setKeyValue("PART_SUPPLIED_COMMENT", key.getPART_SUPPLIED_COMMENT());
				}
				if(msgKeyType.containsKeyColumn("SUPPLIED_DATE") && key.getSUPPLIED_DATE() != null) {
					msgKey.setKeyValue("SUPPLIED_DATE", key.getSUPPLIED_DATE());
				}
				if(msgKeyType.containsKeyColumn("ALCD_QTY") && key.getALCD_QTY() != null) {
					msgKey.setKeyValue("ALCD_QTY", key.getALCD_QTY());
				}
				if(msgKeyType.containsKeyColumn("PROC_EXEC_DATE") && key.getPROC_EXEC_DATE() != null) {
					msgKey.setKeyValue("PROC_EXEC_DATE", key.getPROC_EXEC_DATE());
				}
				if(msgKeyType.containsKeyColumn("FROM_PUCH_ODR_CD") && key.getFROM_PUCH_ODR_CD() != null) {
					msgKey.setKeyValue("FROM_PUCH_ODR_CD", key.getFROM_PUCH_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("TO_PUCH_ODR_CD") && key.getTO_PUCH_ODR_CD() != null) {
					msgKey.setKeyValue("TO_PUCH_ODR_CD", key.getTO_PUCH_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("FROM_ITEM_CD") && key.getFROM_ITEM_CD() != null) {
					msgKey.setKeyValue("FROM_ITEM_CD", key.getFROM_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("FROM_LOT_NO") && key.getFROM_LOT_NO() != null) {
					msgKey.setKeyValue("FROM_LOT_NO", key.getFROM_LOT_NO());
				}
				if(msgKeyType.containsKeyColumn("TO_ITEM_CD") && key.getTO_ITEM_CD() != null) {
					msgKey.setKeyValue("TO_ITEM_CD", key.getTO_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("TO_LOT_NO") && key.getTO_LOT_NO() != null) {
					msgKey.setKeyValue("TO_LOT_NO", key.getTO_LOT_NO());
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
					AD0110010Struct key = new AD0110010Struct();
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
					if(msgKeyType.containsKeyColumn("l_ERR_PLANT_CD")) {
						key.setl_ERR_PLANT_CD(msgKey.getKeyValue("l_ERR_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_ITEM_CD")) {
						key.setl_ERR_ITEM_CD(msgKey.getKeyValue("l_ERR_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_WS_CD")) {
						key.setl_ERR_WS_CD(msgKey.getKeyValue("l_ERR_WS_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_OPR_DATE")) {
						key.setl_ERR_OPR_DATE(msgKey.getKeyValue("l_ERR_OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_ACPT_QTY")) {
						key.setl_ERR_ACPT_QTY(msgKey.getKeyValue("l_ERR_ACPT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_DEFECT_QTY")) {
						key.setl_ERR_DEFECT_QTY(msgKey.getKeyValue("l_ERR_DEFECT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_OPR_TIME")) {
						key.setl_ERR_OPR_TIME(msgKey.getKeyValue("l_ERR_OPR_TIME"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_LOT_NO")) {
						key.setl_ERR_LOT_NO(msgKey.getKeyValue("l_ERR_LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_WH_CD")) {
						key.setl_ERR_WH_CD(msgKey.getKeyValue("l_ERR_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_COLUMN_FLG")) {
						key.setw_COLUMN_FLG(msgKey.getKeyValue("w_COLUMN_FLG"));
					}
					if(msgKeyType.containsKeyColumn("TEMP_PLAN_QTY")) {
						key.setTEMP_PLAN_QTY(msgKey.getKeyValue("TEMP_PLAN_QTY"));
					}
					if(msgKeyType.containsKeyColumn("TEMP_USEOVER_QTY")) {
						key.setTEMP_USEOVER_QTY(msgKey.getKeyValue("TEMP_USEOVER_QTY"));
					}
					if(msgKeyType.containsKeyColumn("TEMP_PLANOUT_QTY")) {
						key.setTEMP_PLANOUT_QTY(msgKey.getKeyValue("TEMP_PLANOUT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("TEMP_USE_QTY")) {
						key.setTEMP_USE_QTY(msgKey.getKeyValue("TEMP_USE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_DEFECT_QTY_KEEP")) {
						key.setl_ERR_DEFECT_QTY_KEEP(msgKey.getKeyValue("l_ERR_DEFECT_QTY_KEEP"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_ACPT_QTY_KEEP")) {
						key.setl_ERR_ACPT_QTY_KEEP(msgKey.getKeyValue("l_ERR_ACPT_QTY_KEEP"));
					}
					if(msgKeyType.containsKeyColumn("l_LOT_NO_KEEP")) {
						key.setl_LOT_NO_KEEP(msgKey.getKeyValue("l_LOT_NO_KEEP"));
					}
					if(msgKeyType.containsKeyColumn("OUTPUT_RSLT_CD")) {
						key.setOUTPUT_RSLT_CD(msgKey.getKeyValue("OUTPUT_RSLT_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("ACPT_QTY")) {
						key.setACPT_QTY(msgKey.getKeyValue("ACPT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("DEFECT_QTY")) {
						key.setDEFECT_QTY(msgKey.getKeyValue("DEFECT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("DEFECT_CAUSE_CD")) {
						key.setDEFECT_CAUSE_CD(msgKey.getKeyValue("DEFECT_CAUSE_CD"));
					}
					if(msgKeyType.containsKeyColumn("OPR_DATE")) {
						key.setOPR_DATE(msgKey.getKeyValue("OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("WH_CD")) {
						key.setWH_CD(msgKey.getKeyValue("WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("WS_CD")) {
						key.setWS_CD(msgKey.getKeyValue("WS_CD"));
					}
					if(msgKeyType.containsKeyColumn("OUTPUT_RSLT_PERSON")) {
						key.setOUTPUT_RSLT_PERSON(msgKey.getKeyValue("OUTPUT_RSLT_PERSON"));
					}
					if(msgKeyType.containsKeyColumn("OUTPUT_RSLT_COMMENT")) {
						key.setOUTPUT_RSLT_COMMENT(msgKey.getKeyValue("OUTPUT_RSLT_COMMENT"));
					}
					if(msgKeyType.containsKeyColumn("OPR_TIME_UNIT_TYP")) {
						key.setOPR_TIME_UNIT_TYP(msgKey.getKeyValue("OPR_TIME_UNIT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PRE_ARRANGEMENT_TIME")) {
						key.setPRE_ARRANGEMENT_TIME(msgKey.getKeyValue("PRE_ARRANGEMENT_TIME"));
					}
					if(msgKeyType.containsKeyColumn("POST_ARRANGEMENT_TIME")) {
						key.setPOST_ARRANGEMENT_TIME(msgKey.getKeyValue("POST_ARRANGEMENT_TIME"));
					}
					if(msgKeyType.containsKeyColumn("OPR_TIME")) {
						key.setOPR_TIME(msgKey.getKeyValue("OPR_TIME"));
					}
					if(msgKeyType.containsKeyColumn("CESSATION_TIME")) {
						key.setCESSATION_TIME(msgKey.getKeyValue("CESSATION_TIME"));
					}
					if(msgKeyType.containsKeyColumn("CESSATION_CAUSE")) {
						key.setCESSATION_CAUSE(msgKey.getKeyValue("CESSATION_CAUSE"));
					}
					if(msgKeyType.containsKeyColumn("LOT_NO")) {
						key.setLOT_NO(msgKey.getKeyValue("LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("VEND_LOT_NO")) {
						key.setVEND_LOT_NO(msgKey.getKeyValue("VEND_LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("DEFECT_COMMENT")) {
						key.setDEFECT_COMMENT(msgKey.getKeyValue("DEFECT_COMMENT"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_CD")) {
						key.setOPR_INST_CD(msgKey.getKeyValue("OPR_INST_CD"));
					}
					if(msgKeyType.containsKeyColumn("PARTIAL_PRD_NO")) {
						key.setPARTIAL_PRD_NO(msgKey.getKeyValue("PARTIAL_PRD_NO"));
					}
					if(msgKeyType.containsKeyColumn("OPR_CRCT_NO")) {
						key.setOPR_CRCT_NO(msgKey.getKeyValue("OPR_CRCT_NO"));
					}
					if(msgKeyType.containsKeyColumn("dateOPR_DATE")) {
						key.setdateOPR_DATE(msgKey.getKeyValue("dateOPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("WORK_ODR_CD")) {
						key.setWORK_ODR_CD(msgKey.getKeyValue("WORK_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("vc2ITEM_CD")) {
						key.setvc2ITEM_CD(msgKey.getKeyValue("vc2ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("LOT_CTRL_FLG")) {
						key.setLOT_CTRL_FLG(msgKey.getKeyValue("LOT_CTRL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("LOT_NUMBERING_TYP")) {
						key.setLOT_NUMBERING_TYP(msgKey.getKeyValue("LOT_NUMBERING_TYP"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP")) {
						key.setUNIT_QTY_TYP(msgKey.getKeyValue("UNIT_QTY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("COUNT")) {
						key.setCOUNT(msgKey.getKeyValue("COUNT"));
					}
					if(msgKeyType.containsKeyColumn("vc2PLANT_CD")) {
						key.setvc2PLANT_CD(msgKey.getKeyValue("vc2PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("BUSINESS_OPR_DATE")) {
						key.setBUSINESS_OPR_DATE(msgKey.getKeyValue("BUSINESS_OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("vc2LOT_NO")) {
						key.setvc2LOT_NO(msgKey.getKeyValue("vc2LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("vc2WORK_ODR_CD")) {
						key.setvc2WORK_ODR_CD(msgKey.getKeyValue("vc2WORK_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("OD_NO")) {
						key.setOD_NO(msgKey.getKeyValue("OD_NO"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_QTY")) {
						key.setOPR_INST_QTY(msgKey.getKeyValue("OPR_INST_QTY"));
					}
					if(msgKeyType.containsKeyColumn("WORK_STS_TYP")) {
						key.setWORK_STS_TYP(msgKey.getKeyValue("WORK_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("MODIFY_COUNT_BY_ITEM")) {
						key.setMODIFY_COUNT_BY_ITEM(msgKey.getKeyValue("MODIFY_COUNT_BY_ITEM"));
					}
					if(msgKeyType.containsKeyColumn("vc2OPR_INST_CD")) {
						key.setvc2OPR_INST_CD(msgKey.getKeyValue("vc2OPR_INST_CD"));
					}
					if(msgKeyType.containsKeyColumn("VALUE")) {
						key.setVALUE(msgKey.getKeyValue("VALUE"));
					}
					if(msgKeyType.containsKeyColumn("USER_CD")) {
						key.setUSER_CD(msgKey.getKeyValue("USER_CD"));
					}
					if(msgKeyType.containsKeyColumn("MAX_PRD_NO")) {
						key.setMAX_PRD_NO(msgKey.getKeyValue("MAX_PRD_NO"));
					}
					if(msgKeyType.containsKeyColumn("MAX_OPR_DATE")) {
						key.setMAX_OPR_DATE(msgKey.getKeyValue("MAX_OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_CTRL_CD")) {
						key.setRCV_ISSUE_CTRL_CD(msgKey.getKeyValue("RCV_ISSUE_CTRL_CD"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_TYP")) {
						key.setRCV_ISSUE_TYP(msgKey.getKeyValue("RCV_ISSUE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_CD")) {
						key.setJOB_ODR_CD(msgKey.getKeyValue("JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_DETAIL_NO")) {
						key.setJOB_ODR_DETAIL_NO(msgKey.getKeyValue("JOB_ODR_DETAIL_NO"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_CD")) {
						key.setPUCH_ODR_CD(msgKey.getKeyValue("PUCH_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("ACPT_NO")) {
						key.setACPT_NO(msgKey.getKeyValue("ACPT_NO"));
					}
					if(msgKeyType.containsKeyColumn("ACPT_RSLT_CRCT_NO")) {
						key.setACPT_RSLT_CRCT_NO(msgKey.getKeyValue("ACPT_RSLT_CRCT_NO"));
					}
					if(msgKeyType.containsKeyColumn("INSPEC_RSLT_CRCT_NO")) {
						key.setINSPEC_RSLT_CRCT_NO(msgKey.getKeyValue("INSPEC_RSLT_CRCT_NO"));
					}
					if(msgKeyType.containsKeyColumn("WORK_IN_PROC_CD")) {
						key.setWORK_IN_PROC_CD(msgKey.getKeyValue("WORK_IN_PROC_CD"));
					}
					if(msgKeyType.containsKeyColumn("OPR_RSLT_CRCT_NO")) {
						key.setOPR_RSLT_CRCT_NO(msgKey.getKeyValue("OPR_RSLT_CRCT_NO"));
					}
					if(msgKeyType.containsKeyColumn("h_ISSUE_INST_CD")) {
						key.seth_ISSUE_INST_CD(msgKey.getKeyValue("h_ISSUE_INST_CD"));
					}
					if(msgKeyType.containsKeyColumn("SAVE_STOCK_ON_HAND_QTY")) {
						key.setSAVE_STOCK_ON_HAND_QTY(msgKey.getKeyValue("SAVE_STOCK_ON_HAND_QTY"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_QTY")) {
						key.setRCV_ISSUE_QTY(msgKey.getKeyValue("RCV_ISSUE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_AMOUNT")) {
						key.setRCV_ISSUE_AMOUNT(msgKey.getKeyValue("RCV_ISSUE_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_DATE")) {
						key.setRCV_ISSUE_DATE(msgKey.getKeyValue("RCV_ISSUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_GNR_TYP")) {
						key.setRCV_ISSUE_GNR_TYP(msgKey.getKeyValue("RCV_ISSUE_GNR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_ODD_QTY")) {
						key.setRCV_ISSUE_ODD_QTY(msgKey.getKeyValue("RCV_ISSUE_ODD_QTY"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UPD_TYP")) {
						key.setSTOCK_UPD_TYP(msgKey.getKeyValue("STOCK_UPD_TYP"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_CMPLT_FLG")) {
						key.setRCV_ISSUE_CMPLT_FLG(msgKey.getKeyValue("RCV_ISSUE_CMPLT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_COMMENT")) {
						key.setRCV_ISSUE_COMMENT(msgKey.getKeyValue("RCV_ISSUE_COMMENT"));
					}
					if(msgKeyType.containsKeyColumn("CONS_TYP")) {
						key.setCONS_TYP(msgKey.getKeyValue("CONS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("COMPANY_CD")) {
						key.setCOMPANY_CD(msgKey.getKeyValue("COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("SUM_OPR_RSLT_QTY")) {
						key.setSUM_OPR_RSLT_QTY(msgKey.getKeyValue("SUM_OPR_RSLT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("vc2OUTPUT_RSLT_CD")) {
						key.setvc2OUTPUT_RSLT_CD(msgKey.getKeyValue("vc2OUTPUT_RSLT_CD"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_TYP")) {
						key.setISSUE_TYP(msgKey.getKeyValue("ISSUE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_INST_UNIT_DENOMINATOR")) {
						key.setISSUE_INST_UNIT_DENOMINATOR(msgKey.getKeyValue("ISSUE_INST_UNIT_DENOMINATOR"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_INST_UNIT_NUMERATOR")) {
						key.setISSUE_INST_UNIT_NUMERATOR(msgKey.getKeyValue("ISSUE_INST_UNIT_NUMERATOR"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_NAME")) {
						key.setITEM_NAME(msgKey.getKeyValue("ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP")) {
						key.setMRP_ODR_TYP(msgKey.getKeyValue("MRP_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("WH_NAME")) {
						key.setWH_NAME(msgKey.getKeyValue("WH_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_UNIT_QTY_TYP")) {
						key.setl_UNIT_QTY_TYP(msgKey.getKeyValue("l_UNIT_QTY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("TOTAL_ISSUE_QTY")) {
						key.setTOTAL_ISSUE_QTY(msgKey.getKeyValue("TOTAL_ISSUE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("SUPPLIED_ISSUE_QTY")) {
						key.setSUPPLIED_ISSUE_QTY(msgKey.getKeyValue("SUPPLIED_ISSUE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("count_RCV_ISSUE")) {
						key.setcount_RCV_ISSUE(msgKey.getKeyValue("count_RCV_ISSUE"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_ON_HAND_QTY")) {
						key.setSTOCK_ON_HAND_QTY(msgKey.getKeyValue("STOCK_ON_HAND_QTY"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_QTY")) {
						key.setISSUE_QTY(msgKey.getKeyValue("ISSUE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_DATE")) {
						key.setISSUE_DATE(msgKey.getKeyValue("ISSUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("SPENT_QTY")) {
						key.setSPENT_QTY(msgKey.getKeyValue("SPENT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("NEXTVAL")) {
						key.setNEXTVAL(msgKey.getKeyValue("NEXTVAL"));
					}
					if(msgKeyType.containsKeyColumn("RSLT_CTL_SEQ_NO")) {
						key.setRSLT_CTL_SEQ_NO(msgKey.getKeyValue("RSLT_CTL_SEQ_NO"));
					}
					if(msgKeyType.containsKeyColumn("PART_SUPPLIED_COMMENT")) {
						key.setPART_SUPPLIED_COMMENT(msgKey.getKeyValue("PART_SUPPLIED_COMMENT"));
					}
					if(msgKeyType.containsKeyColumn("SUPPLIED_DATE")) {
						key.setSUPPLIED_DATE(msgKey.getKeyValue("SUPPLIED_DATE"));
					}
					if(msgKeyType.containsKeyColumn("ALCD_QTY")) {
						key.setALCD_QTY(msgKey.getKeyValue("ALCD_QTY"));
					}
					if(msgKeyType.containsKeyColumn("PROC_EXEC_DATE")) {
						key.setPROC_EXEC_DATE(msgKey.getKeyValue("PROC_EXEC_DATE"));
					}
					if(msgKeyType.containsKeyColumn("FROM_PUCH_ODR_CD")) {
						key.setFROM_PUCH_ODR_CD(msgKey.getKeyValue("FROM_PUCH_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("TO_PUCH_ODR_CD")) {
						key.setTO_PUCH_ODR_CD(msgKey.getKeyValue("TO_PUCH_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("FROM_ITEM_CD")) {
						key.setFROM_ITEM_CD(msgKey.getKeyValue("FROM_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("FROM_LOT_NO")) {
						key.setFROM_LOT_NO(msgKey.getKeyValue("FROM_LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("TO_ITEM_CD")) {
						key.setTO_ITEM_CD(msgKey.getKeyValue("TO_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("TO_LOT_NO")) {
						key.setTO_LOT_NO(msgKey.getKeyValue("TO_LOT_NO"));
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
