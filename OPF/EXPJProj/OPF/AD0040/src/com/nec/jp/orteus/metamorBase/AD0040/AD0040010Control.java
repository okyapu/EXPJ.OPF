/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AD0040/src/com/nec/jp/orteus/metamorBase/AD0040/AD0040010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AD0040;

import com.nec.jp.orteus.metamorBase.AD0040.*;
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

import java.math.BigDecimal;
import java.text.ParseException;

import com.nec.jp.orteus.expj.flash.Kind;

import com.nec.jp.orteus.metamorBase.common.CollectNumber.CollectNumber;
import com.nec.jp.orteus.metamorBase.common02.CommonOd.ApsComException;
import com.nec.jp.orteus.metamorBase.common02.CommonOd.CommonOd;
import com.nec.jp.orteus.expj.lot.BizCommon;
import com.nec.jp.orteus.expj.pr.rcvissue.process.RcvCancel;

// ▼▼ 2008/08/12 ADD START -TSUCHIDA▼▼
import com.nec.jp.orteus.expj.pr.rcvissue.process.IssueProcess;
// ▲▲ 2008/08/12 ADD END -TSUCHIDA▲▲

import com.nec.jp.orteus.expj.pr.rcvissue.process.WhAutoIssueProc;
import com.nec.jp.orteus.expj.pr.rcvissue.process.AutoIssue;

import com.nec.jp.orteus.expj.util.Calculate;
import com.nec.jp.orteus.expj.pr.rcvissue.process.IssueRemain;
import com.nec.jp.orteus.expj.pr.rcvissue.process.ValidateWh;
import com.nec.jp.orteus.expj.pr.rcvissue.util.StringUtil;
import com.nec.jp.orteus.metamorBase.common08.LotCtrl.LotCtrl;

import java.io.*;
import jp.co.fit.vfreport.*;
import com.nec.jp.orteus.expj.util.*;
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AD0040010Control
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
	public AD0040010Struct getListvalue(int x) { return (AD0040010Struct)(this.list.get(x)); }	// リストの値を返します。
	public AD0040010Struct getStruct() { return this.struct; }	// Structを返します。
	public AD0040010Struct createStruct() { return new AD0040010Struct(); }	// 新しいStructを作って返します。
	public void setStruct(Object structname) { this.struct.setStruct((AD0040010Struct)structname); }	// Structをセットします。
	public void initializeStruct() { this.struct.initialize(); }	// Structの値を初期化します。

	// CSV出力用リスト
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }

//-----------------------------------------------------------------------------

	/** 不良リストの追加表示件数 */
	static final public int DISPLAY_NUMBER = 15;
  
  /** 作業完了のワーニングメッセージの表示制御定数 */
	private final static int WARNING_INITIAL = 0;   // 初期状態
	private final static int WARNING_NOTHING = 1;   // 表示しない
	private final static int WARNING_MESSAGE_1 = 2; // AD00090を表示
	private final static int WARNING_MESSAGE_2 = 3; // AD00106を表示
	
 /** 作業完了のワーニングメッセージ表示制御フラグ */
	private int warningFlg = WARNING_INITIAL;
  
	/** [コンボボックスデータ]情報（作業時間単位区分） */
	private ComboStruct _oprTimeUnitTtpStruct = new ComboStruct();
	/** [コンボボックスデータ]情報（不良理由コード） */
	private ComboStruct DEFECT_CAUSE_CD = new ComboStruct();
	/** システムログメッセージ作成用 */
	private StringBuffer _sysLogMessage;

	/** 一覧表の最大表示件数オーバー時のＥＲＲ表示フラグ */
	private int _screenMoveFlg = 0;

	/** 帳票ファイル **/
	private String _downloadFile = null;
	private String _printFlg = "0";
	private String _outputFlg = "0";
	private String _initProduct_Typ = "";

	/** 印刷フラグ取得 **/
	public String getPrintFlg() { return _printFlg; };
	/** 印刷有効フラグ取得 **/
	public String getOutputFlg() { return _outputFlg; };

	/** 業務日付 */
	private String _oprDate = null;

	/** 業務日付 */
	private String _oprTime = null;
	
	/** 作業指示番号 */
	private String _keepOprInstCd = null;
	/** 分作回数 */
	private String _keepPartialPrdNo = null;
	/** ロット管理導入済チェック **/
	private boolean lotCtrlFlg = false;

//	/** 画面遷移キー(作業指示番号) */
	private String _in_Opr_Inst_Cd_Move = null;
	public void setIn_Opr_Inst_Cd_Move(String value){
		this._in_Opr_Inst_Cd_Move = value;
	}
	
	private String getIn_Opr_Inst_Cd_Move(){
		return this._in_Opr_Inst_Cd_Move;
	}
//	/** 画面遷移キー(分作回数) */
//	private String _partialPrdNo = null;
		
	/** 最終工程かどうか判断するためのフラグ */
	private boolean _lastProc = false;

	/** 実績更新処理タイプ 0:登録 1:更新 */
	public int _rsltExeType = 0;
	/** 保管区別入出庫更新処理タイプ 0:登録 1:更新 */
	public int _issueExeType = 0;
	/** 作業実績検索後件数 0:なし 1:あり */
	public int _rsltListflg = 0;
	/** 出庫指示検索後件数 0:なし 1:あり */
	public int _issueListflg = 0;
	
	// Add Start 20140213 liu-j
	/** 工程保管場所の在庫を管理する 0:工程保管場所の在庫を行なわない 1:工程保管場所の在庫をなう*/
	private String _processManageFlg = "0";
	/** 不良在庫を工程管理する 0:不良在庫の工程管理するを行なわない 1:不良在庫の工程管理するをなう*/
	private String _defectManageFlg = "0";
	private int crctNoCheck = 0;
	// Add End 20140213 liu-j

	/** 実績一覧 */
	private List rsltList = new ArrayList();
	/** 作業不良一覧 */
	private List defectList = new ArrayList();
	/** 出庫一覧 */
	private List issueList = new ArrayList();

	/** ヘッダーStruct */
	private AD0040010Struct headerStruct = new AD0040010Struct();
	/** 作業実績更新対象Struct */
	private AD0040010Struct rsltStruct = new AD0040010Struct();
	/** 作業実績保管Struct */
	private AD0040010Struct keepRsltStruct = new AD0040010Struct();
	/** 作業不良更新対象Struct */
	private AD0040010Struct defectStruct = new AD0040010Struct();
	/** 保管区別入出庫更新対象Struct */
	private AD0040010Struct issueStruct = new AD0040010Struct();
	/** 保管区別入出庫保管Struct */
	private AD0040010Struct issueKeepStruct = new AD0040010Struct();
	
	/*会社コード*/
	public String _company_cd = null;

	/**
	 * 一覧表の最大表示件数オーバー時のＥＲＲ表示フラグの取得
	 * @return 0:ERRなし  1:ERRあり
	 */
	public int getScreenMoveFlg() {
		return _screenMoveFlg;
	}

	/**
	 * 一覧表の最大表示件数オーバー時のＥＲＲ表示フラグの設定
	 * @param cd 一覧表の最大表示件数オーバー時のＥＲＲ表示フラグ
	 */
	public void setScreenMoveFlg(int cd) {
		_screenMoveFlg = cd;
	}

	/**
	 * Orteus標準Structの値を対象Structにコピーします。
	 * @param target コピー対象となるStruct
	 */
	public void setStandardItem(AD0040010Struct target){

		target.setsUser_ID(struct.getsUser_ID());
		target.setsSysdate(struct.getsSysdate());
		target.setsOraganization_CD(struct.getsOrganization_CD());
		target.setTIME_CTRL(struct.getTIME_CTRL());
	}

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
	 * @param value1 置換文字列１
	 * @param value2 置換文字列２
	 */
	private void setWarningMessage(String code, String value1, String value2) {
		ExpjMessage emsg = new ExpjMessage(code, value1, value2);
		msgStruct.addWarn(emsg);
		sysLog.info(emsg, getsysUSER_CD());
	}
	/**
	 * 業務ロジックのエラーメッセージ設定処理を切り出して関数化
	 * @param code メッセージコード
	 */
	private void setErrorMessage(String code) {
		ExpjMessage emsg = new ExpjMessage(code);
		msgStruct.addError(emsg);
		sysLog.warning(emsg, getsysUSER_CD());
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
	 * 業務ロジックのシステムログ(致命的エラー)設定処理を切り出して関数化
	 * @param db1 データベース項目１
	 * @param value1 置換文字列１
	 */
	private void setSeverSysLogMessage(String db1, String value1) {
		_sysLogMessage = new StringBuffer();
		_sysLogMessage.append(db1);
		_sysLogMessage.append(":");
		_sysLogMessage.append(value1);
		ExpjMessage emsg 
				= new ExpjMessage("ZZ01006",_sysLogMessage.toString());
		sysLog.severe(emsg, getsysUSER_CD());
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
	/**
	 * 業務ロジックのシステムログ（ワーニング）設定処理を切り出して関数化
	 * @param db1 データベース項目１
	 * @param value1 置換文字列１
	 */
	private void setInfoSysLogMessage(String db1, String value1) {
		_sysLogMessage = new StringBuffer();
		_sysLogMessage.append(db1);
		_sysLogMessage.append(":");
		_sysLogMessage.append(value1);
		ExpjMessage emsg 
				= new ExpjMessage("ZZ01006",_sysLogMessage.toString());
		sysLog.info(emsg, getsysUSER_CD());
	}

	/**
	 * 業務日付の設定
	 * @return 業務日付
	 */
	public String getOprDate() {
		return _oprDate;
	}

	/**
	 * 業務日付の時分設定
	 * @return 業務日付時分
	 */
	public String getOprTime() {
		return _oprTime;
	}

	/**
	 * 実績一覧の取得
	 * @return 実績一覧
	 */
	public List getRsltList() {
		return this.rsltList;
	}
	/**
	 * 作業不良一覧の取得
	 * @return 作業不良一覧
	 */
	public List getDefectList() {
		return this.defectList;
	}
	/** 
	 * 出庫一覧の取得
	 * @return 出庫一覧
	 */
	public List getIssueList() {
		return this.issueList;
	}
	/**
	 * 出庫一覧のサイズの取得
	 * @return 出庫一覧のサイズ
	 */
	public int getIssueListsize() {
		int nret = 0;
		if( this.issueList != null ) {
			nret = this.issueList.size();
		}
		return nret;
	}
	/**
	 * 出庫一覧の値の取得
	 * @param x x番目の値
	 * @return リストの値
	 */
	public AD0040010Struct getIssueListvalue(int x) { 
		return (AD0040010Struct)(this.list.get(x)); 
	}


	/** リストのクリア */
	private void listClear() {

		if(this.list != null && this.list.size() > 0){
			this.list.clear();
		}
		//実績一覧
		if(this.rsltList != null && this.rsltList.size() > 0){
			this.rsltList.clear();
		}
		//出庫一覧
		if(this.issueList != null && this.issueList.size() > 0){
			this.issueList.clear();
		}
		//作業不良一覧
		if(this.defectList != null && this.defectList.size() > 0){
			this.defectList.clear();
		}
	}
	/** structのクリア */
	private void structClear() {
		
		if (this.struct != null) {
			this.struct.clear();
		}
		//ヘッダーStruct
		if (this.headerStruct != null) {
			this.headerStruct.clear();
		}
		//作業実績更新対象Struct
		if (this.rsltStruct != null) {
			this.rsltStruct.clear();
		}
		//保管区別入出庫更新対象Struct
		if (this.issueStruct != null) {
			this.issueStruct.clear();
		}
		//作業不良更新対象Struct
		if (this.defectStruct != null) {
			this.defectStruct.clear();
		}
		//作業実績保管Struct
		if (this.keepRsltStruct != null) {
			this.keepRsltStruct.clear();
		}
		//保管区別入出庫保管Struct
		if (this.issueKeepStruct != null) {
			this.issueKeepStruct.clear();
		}
	}
	/**
	 * ヘッダーStructの取得
	 * @return ヘッダーStruct
	 */
	public AD0040010Struct getHeaderStruct() {
		return this.headerStruct;
	}
	/**
	 * 作業実績保管Structの取得
	 * @return 作業実績保管Struct
	 */
	public AD0040010Struct getKeepRsltStruct() {
		return this.keepRsltStruct;
	}
	/**
	 * 保管区別入出庫保管Structの取得
	 * @return 保管区別入出庫保管Struct
	 */
	public AD0040010Struct getIssueKeepStruct() {
		return this.issueKeepStruct;
	}
	/**
	 * 保管区別入出庫更新対象Structの取得
	 * @return 保管区別入出庫更新対象Struct
	 */
	public AD0040010Struct getIssueStruct() {
		return this.issueStruct;
	}
	
	/**
	 * 最終工程かどうか判断します。(true:最終工程)
	 * @return 最終工程かどうか判断するためのフラグ
	 */
	public boolean isLastProc() {
		return _lastProc;
	}
	/**
	 * 作業実績検索後件数の取得 
	 * @return 作業実績検索後件数(false:なし true:あり)
	 */
	public boolean isRsltListFlg() {
		
		if (_rsltListflg == 0) {
			return false;
		} else {
			return true;
		}
	}
	/**
	 * 出庫指示検索後件数の取得 
	 * @return 出庫指示検索後件数(false:なし true:あり)
	 */
	public boolean isIssueListFlg() {
		
		if (_issueListflg == 0) {
			return false;
		} else {
			return true;
		}
	}
	/**
	 * メイン画面項目の初期値をセットする
	 */
	public void mainInitialize() {
		//初期値の設定
		this.struct.setOPR_INST_QTY("0.0");//作業指示数
		this.struct.setSUM_ACPT_QTY("0.0");//良品数累計
		this.struct.setSUM_DEFECT_QTY("0.0");//不良品累計
		this.headerStruct.setUNIT_QTY_TYP(Kind.NUMBER);//計量単位
		this.struct.setUNIT_QTY_TYP(Kind.NUMBER);//計量単位
	}


	/**
	 * 数値タイプ項目がnullの場合、0をセットします。
	 * @throws Exception
	 */
	private void zeroSet(AD0040010Struct targetStruct)
			throws Exception {
		//良品数がnullの場合、0をセット
		if (targetStruct.getACPT_QTY() == null 
				|| targetStruct.getACPT_QTY().length() == 0) {
			targetStruct.setACPT_QTY("0.0");
		}
		//不良品数がnullの場合、0をセット
		if (targetStruct.getDEFECT_QTY() == null 
				|| targetStruct.getDEFECT_QTY().length() == 0) {
			targetStruct.setDEFECT_QTY("0.0");
		}
		//前段取り時間がnullの場合、0をセット
		if (targetStruct.getPRE_ARRANGEMENT_TIME() == null 
				|| targetStruct.getPRE_ARRANGEMENT_TIME().length() == 0) {
			targetStruct.setPRE_ARRANGEMENT_TIME("0.0");
		}
		//作業時間がnullの場合、0をセット
		if (targetStruct.getOPR_TIME() == null 
				|| targetStruct.getOPR_TIME().length() == 0) {
			targetStruct.setOPR_TIME("0.0");
		}
		//後段取り時間がnullの場合、0をセット
		if (targetStruct.getPOST_ARRANGEMENT_TIME() == null 
				|| targetStruct.getPOST_ARRANGEMENT_TIME().length() == 0) {
			targetStruct.setPOST_ARRANGEMENT_TIME("0.0");
		}
		//停止時間がnullの場合、0をセット
		if (targetStruct.getCESSATION_TIME() == null 
				|| targetStruct.getCESSATION_TIME().length() == 0) {
			targetStruct.setCESSATION_TIME("0.0");
		}
	}

	/**
	 * 空文字の場合、nullをセットします。
	 */
	private void nullSet() {
		if (this.rsltStruct.getACPT_QTY() != null 
				&& this.rsltStruct.getACPT_QTY().length() == 0) {
			this.rsltStruct.setACPT_QTY(null);
		}
		if (this.rsltStruct.getDEFECT_QTY() != null 
				&& this.rsltStruct.getDEFECT_QTY().length() == 0) {
			this.rsltStruct.setDEFECT_QTY(null);
		}
		if (this.rsltStruct.getOPR_DATE() != null 
				&& this.rsltStruct.getOPR_DATE().length() == 0) {
			this.rsltStruct.setOPR_DATE(null);
		}
		if (this.rsltStruct.getWH_CD() != null 
				&& this.rsltStruct.getWH_CD().length() == 0) {
			this.rsltStruct.setWH_CD(null);
		}
		if (this.rsltStruct.getWS_CD() != null 
				&& this.rsltStruct.getWS_CD().length() == 0) {
			this.rsltStruct.setWS_CD(null);
		}
		if (this.rsltStruct.getOPR_TIME_UNIT_TYP() != null 
				&& this.rsltStruct.getOPR_TIME_UNIT_TYP().length() == 0) {
			this.rsltStruct.setOPR_TIME_UNIT_TYP(null);
		}
		if (this.rsltStruct.getOPR_RSLT_PERSON() != null 
				&& this.rsltStruct.getOPR_RSLT_PERSON().length() == 0) {
			this.rsltStruct.setOPR_RSLT_PERSON(null);
		}
		if (this.rsltStruct.getPRE_ARRANGEMENT_TIME() != null 
				&& this.rsltStruct.getPRE_ARRANGEMENT_TIME().length() == 0) {
			this.rsltStruct.setPRE_ARRANGEMENT_TIME(null);
		}
		if (this.rsltStruct.getOPR_TIME() != null 
				&& this.rsltStruct.getOPR_TIME().length() == 0) {
			this.rsltStruct.setOPR_TIME(null);
		}
		if (this.rsltStruct.getPOST_ARRANGEMENT_TIME() != null 
				&& this.rsltStruct.getPOST_ARRANGEMENT_TIME().length() == 0) {
			this.rsltStruct.setPOST_ARRANGEMENT_TIME(null);
		}
		if (this.rsltStruct.getCESSATION_TIME() != null 
				&& this.rsltStruct.getCESSATION_TIME().length() == 0) {
			this.rsltStruct.setCESSATION_TIME(null);
		}
		if (this.rsltStruct.getCESSATION_CAUSE() != null 
				&& this.rsltStruct.getCESSATION_CAUSE().length() == 0) {
			this.rsltStruct.setCESSATION_CAUSE(null);
		}
		if (this.rsltStruct.getVEND_LOT_NO() != null 
				&& this.rsltStruct.getVEND_LOT_NO().length() == 0) {
			this.rsltStruct.setVEND_LOT_NO(null);
		}
		if (this.rsltStruct.getOPR_RSLT_COMMENT() != null 
				&& this.rsltStruct.getOPR_RSLT_COMMENT().length() == 0) {
			this.rsltStruct.setOPR_RSLT_COMMENT(null);
		}
		if (this.rsltStruct.getLOT_NO() != null 
				&& this.rsltStruct.getLOT_NO().length() == 0) {
			this.rsltStruct.setLOT_NO(null);
		}

	}

	/**
	 * 出庫指示リストを設定します。
	 * @throws FoundationException
	 * @throws SQLException
	 */
	private void setIssueList() 
			throws FoundationException, SQLException {

		List tempList = null;
		_lastProc = false;
		AD0040010Struct tempStruct = null;

		//在庫検索
		//内作の最大仕掛作業系列番号を取得
		String maxProcNo = null;
		tempList = entity.mSelectMaxProcNo.read(conn, this.headerStruct);
		if (tempList != null && tempList.size() != 0) {
			tempStruct = (AD0040010Struct)tempList.get(0);
			maxProcNo = tempStruct.getPROC_NO();
		}

		if (maxProcNo != null 
				&& this.headerStruct.getOUTSIDE_TYP() != null 
				&& "1".equals(this.headerStruct.getOUTSIDE_TYP()) 
				&& maxProcNo.equals(this.headerStruct.getPROC_NO())){
			//最終工程フラグを立てる
			_lastProc = true;
			headerStruct.setIN_OPR_INST_CD(struct.getIN_OPR_INST_CD());
			
            int maxLine = sp.getMaxLine(conn, 11);
			if(maxLine != 0) {
				headerStruct.setROW_COUNT(String.valueOf(maxLine));
			} else {
				headerStruct.setROW_COUNT(null);
			}
			
			//内作で最大仕掛作業系列番号の場合検索
			this.issueList = entity.mSelectIssue.read(conn,this.headerStruct);
			if(maxLine != 0 && issueList.size() > maxLine) {
				return;
			}
			List mainList = entity.mselectT_ISSUE_INST_MAIN.read(conn, this.headerStruct);
			for(int i = 0; i< mainList.size();i++){
				issueList.add((AD0040010Struct)mainList.get(i));
				if(maxLine != 0 && issueList.size() > maxLine) {
					return;
				}
			}
/*			tempStruct = (AD0040010Struct)this.rsltList.get(pos10);
			String partialNo = tempStruct.getPARTIAL_PRD_NO();
			BigDecimal acptQty = new BigDecimal(tempStruct.getACPT_QTY());
			BigDecimal defectQty = new BigDecimal(tempStruct.getDEFECT_QTY());
*/
			String partialNo = this.headerStruct.getPARTIAL_PRD_NO();
			BigDecimal acptQty = new BigDecimal(this.headerStruct.getACPT_QTY());
			BigDecimal defectQty = new BigDecimal(this.headerStruct.getDEFECT_QTY());

			for (int i = 0; i < this.issueList.size(); i++) {

				BigDecimal planSum = acptQty.add(defectQty);
				AD0040010Struct tempIssueStruct = (AD0040010Struct) this.issueList.get(i);
				
				// 画面表示用子品目番号、子品目名の設定
				tempIssueStruct.setl_ITEM_CD(tempIssueStruct.getITEM_CD());
				tempIssueStruct.setl_ITEM_NAME(tempIssueStruct.getITEM_NAME());

				// コンボボックスの取得
				othercomboTyp(tempIssueStruct);

				// 計画使用数量の取得
				int round = Integer.parseInt(tempIssueStruct.getUNIT_QTY_TYP());
				BigDecimal denominator = new BigDecimal(tempIssueStruct
						.geth_ISSUE_INST_UNIT_DENOMINATOR());
				BigDecimal numerator = new BigDecimal(tempIssueStruct.geth_ISSUE_INST_UNIT_NUMERATOR());
				_issueListflg = 0;
				if (tempIssueStruct.getUNIT_QTY_TYP() != null
						|| "".equals(tempIssueStruct.getUNIT_QTY_TYP())) {
					// 出庫指示検索後件数 0:なし 1:あり
					_issueListflg = 1;
				}

				// ロット管理対象外の場合、あるいは新規登録の場合
				if (tempIssueStruct.getLOT_NO() == null|| tempIssueStruct.getLOT_NO().equals("")) {
					// 作業実績数 * 構成数を計画使用数量に設定
					if (round == 1) {
						planSum = planSum.multiply(numerator).divide(denominator, 0, BigDecimal.ROUND_UP).setScale(1);
					} else {
						planSum = planSum.multiply(numerator).divide(denominator, 4, BigDecimal.ROUND_UP);

//						// 小数の表示スケール処理
//						BigDecimal intVal = new BigDecimal(""+ planSum.intValue());
//						BigDecimal decimalVal = planSum.subtract(intVal).multiply(new BigDecimal(10000));
//						int decVal = decimalVal.intValue();
//						int roundCount = 1;
//						while (true) {
//							decVal = decVal / 10;
//							if (decVal == 0) {
//								break;
//							}
//							roundCount++;
//						}
//
//						planSum = planSum.setScale(roundCount,BigDecimal.ROUND_UP);
					}// ロット割り当て済みの場合
				} else {
					// [ロット別使用実績]の使用予定数量を計画使用数量に設定
					planSum = new BigDecimal(tempIssueStruct.getSUPPLIED_ISSUE_QTY());
				}
				tempIssueStruct.setTEMP_PLAN_QTY(planSum.toString());

				// 使用済数量、計画外使用済数量、更新使用数量の取得
				tempIssueStruct.setTEMP_USEOVER_QTY("0.0");
				tempIssueStruct.setTEMP_PLANOUT_QTY("0.0");
				tempIssueStruct.setTEMP_USE_QTY("0.0");
				tempStruct.setWORK_ODR_CD(this.headerStruct.getWORK_ODR_CD());
				tempStruct.setWORK_IN_PROC_CD(this.headerStruct.getWORK_IN_PROC_CD());
				tempStruct.setPARTIAL_PRD_NO(partialNo);
				tempStruct.setITEM_CD(tempIssueStruct.getITEM_CD());
				tempStruct.seth_ISSUE_INST_CD(tempIssueStruct.geth_ISSUE_INST_CD());
				
				// ロット管理対象外の場合、あるいは新規登録の場合
				if (tempIssueStruct.getLOT_NO() == null || tempIssueStruct.getLOT_NO().equals("")) {
					// 保管区別入出庫より工程出庫・工程出庫取消の数量合計を取得
					tempList = entity.mSelectRecvIssue.read(conn, tempStruct);
					if (tempList != null && tempList.size() != 0) {
						tempStruct = (AD0040010Struct) tempList.get(0);
						BigDecimal bdIssue = new BigDecimal(tempStruct.getRCV_ISSUE_QTY());
						tempIssueStruct.setTEMP_USEOVER_QTY(bdIssue.negate().toString());
						// tempIssueStruct.setTEMP_PLANOUT_QTY(tempStruct.getRCV_ISSUE_ODD_QTY());
						if ("0".equals(tempStruct.getcount_RCV_ISSUE())) {
							tempIssueStruct.setTEMP_PLANOUT_QTY("0.0");
							tempIssueStruct.setTEMP_USE_QTY(planSum.toString());
						} else {
							BigDecimal useoverQty = new BigDecimal(
									tempIssueStruct.getTEMP_USEOVER_QTY());
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

				// 明細用の変数にロット番号設定
				tempIssueStruct.setl_LOT_NO(tempIssueStruct.getLOT_NO());

				tempIssueStruct.setRCV_ISSUE_DATE(_oprDate + " " + _oprTime.substring(0, 2) + ":" + _oprTime.substring(2));
				tempIssueStruct.setl_PARTIAL_PRD_NO(partialNo);
				if("".equals(tempIssueStruct.geth_ISSUE_INST_CD()) || tempIssueStruct.geth_ISSUE_INST_CD() == null){

					// 計画使用数量、使用済数量、計画外使用済数量、更新使用数量の取得
					tempIssueStruct.setTEMP_PLAN_QTY("0.0");
					tempIssueStruct.setTEMP_USEOVER_QTY(tempIssueStruct.getTOTAL_ISSUE_QTY());
					tempIssueStruct.setTEMP_PLANOUT_QTY(tempIssueStruct.getTOTAL_ISSUE_QTY());
					tempIssueStruct.setTEMP_USE_QTY("0.0");
				}

/*				//更新使用数量の計算
				BigDecimal useoverQty = 
						new BigDecimal(tempIssueStruct.getTEMP_USEOVER_QTY());
				BigDecimal planoutQty = 
						new BigDecimal(tempIssueStruct.getTEMP_PLANOUT_QTY());
				BigDecimal sumQty = 
						planSum.subtract(useoverQty).add(planoutQty);

				BigDecimal intVal = new BigDecimal("" + sumQty.intValue());
				BigDecimal decimalVal = 
						sumQty.subtract(intVal).multiply(new BigDecimal(10000));
				int decVal = decimalVal.intValue();
				int roundCount = 1;
				while (true) {
					decVal = decVal / 10;
					if (decVal == 0) {
						break;
					} 
					roundCount++;
				}
				sumQty = sumQty.setScale(roundCount,BigDecimal.ROUND_UP);
				tempIssueStruct.setTEMP_USE_QTY(sumQty.toString());
				tempIssueStruct.setl_PARTIAL_PRD_NO(partialNo);
*/
			}

		}
	}

	/**
	 * 出庫指示リストの存在チェックを行います。
	 * @throws FoundationException
	 * @throws SQLException
	 */
	private void checkIssueList() 
			throws FoundationException, SQLException {

		List tempList = null;
		_lastProc = false;
		AD0040010Struct tempStruct = null;

		//在庫検索
		//内作の最大仕掛作業系列番号を取得
		String maxProcNo = null;
		tempList = entity.mSelectMaxProcNo.read(conn, this.headerStruct);
		if (tempList != null && tempList.size() != 0) {
			tempStruct = (AD0040010Struct)tempList.get(0);
			maxProcNo = tempStruct.getPROC_NO();
		}

		if (maxProcNo != null 
				&& this.headerStruct.getOUTSIDE_TYP() != null 
				&& "1".equals(this.headerStruct.getOUTSIDE_TYP()) 
				&& maxProcNo.equals(this.headerStruct.getPROC_NO())){
			//最終工程フラグを立てる
			_lastProc = true;
			//内作で最大仕掛作業系列番号の場合検索
			List checkIssueList = entity.mSelectIssue.read(conn,this.headerStruct);
			for (int i = 0; i < checkIssueList.size(); i++ ) {
				AD0040010Struct tempIssueStruct = (AD0040010Struct)checkIssueList.get(i);
				//コンボボックスの取得
		        othercomboTyp(tempIssueStruct);
				_issueListflg = 0;
				if (tempIssueStruct.getUNIT_QTY_TYP() != null || "".equals(tempIssueStruct.getUNIT_QTY_TYP())) {
					//出庫指示検索後件数 0:なし 1:あり
					_issueListflg = 1;
				}
			}

		}
	}

	/**
	 * 業務運用日を取得します。
	 * @throws FoundationException
	 * @throws SQLException
	 */
	private void setBussinessOprDate() 
			throws FoundationException, SQLException {

		this.struct.setPLANT_CD(this.sysPLANT_CD);
		List oprDateList = entity.mSelectDateCtrl.read(conn, this.struct);
		if (oprDateList.isEmpty()) {
			setErrorMessage("ZZ06001");
			setWarningSysLogMessage("SYS_DATE_CTRL.PLANT_CD", getsysPLANT_CD());
			return;
		}
		AD0040010Struct oprDateStruct = (AD0040010Struct)oprDateList.get(0);
		setStandardItem(oprDateStruct);
		_oprDate = oprDateStruct.geth_BUSINESS_OPR_DATE();
		String TIME_CTRL = struct.getTIME_CTRL();
		if(null != TIME_CTRL && "true".equals(TIME_CTRL)){
		  _oprTime = oprDateStruct.geth_BUSINESS_OPR_TIME();
	  }else{
		  _oprTime = "0000";
	  }

	}

	/**
	 * 現品票出力チェックボックス制御処理
	 */
	private void setIdentCard() throws FoundationException, SQLException{

		PrivateConfig pc = new PrivateConfig(conn);
		String tempIDENT_CARD = pc.getString("IDENT_CARD");
		
		if(!"1".equals(tempIDENT_CARD)){
			_outputFlg = "0";
			struct.setc_OUTPUT("false");
		}else{
			_outputFlg = "1";
		}

		_initProduct_Typ = pc.getString("PRODUCT_TYP");
		
	}
	
	/**
	 * 読込み後の項目内容と更新時の項目内容に変更があるかないか比較します。
	 * @param rslt 更新時の項目内容
	 * @param keep 読込み後の項目内容
	 * @return true(変更あり)/false(変更なし)
	 * @throws ParseException
	 */
	private boolean CompareRsltStruct(AD0040010Struct rslt,AD0040010Struct keep) 
			throws ParseException{
		BigDecimal rsltACPT_QTY = new BigDecimal(rslt.getACPT_QTY());
		BigDecimal keepACPT_QTY = new BigDecimal(keep.getACPT_QTY());

		BigDecimal rsltDEFECT_QTY = new BigDecimal(rslt.getDEFECT_QTY());
		BigDecimal keepDEFECT_QTY = new BigDecimal(keep.getDEFECT_QTY());

		BigDecimal rsltPRE_ARRANGEMENT_TIME = 
				new BigDecimal(rslt.getPRE_ARRANGEMENT_TIME());
		BigDecimal keepPRE_ARRANGEMENT_TIME = 
				new BigDecimal(keep.getPRE_ARRANGEMENT_TIME());

		BigDecimal rsltOPR_TIME = new BigDecimal(rslt.getOPR_TIME());
		BigDecimal keepOPR_TIME = new BigDecimal(keep.getOPR_TIME());

		BigDecimal rsltPOST_ARRANGEMENT_TIME = 
				new BigDecimal(rslt.getPOST_ARRANGEMENT_TIME());
		BigDecimal keepPOST_ARRANGEMENT_TIME = 
				new BigDecimal(keep.getPOST_ARRANGEMENT_TIME());

		BigDecimal rsltCESSATION_TIME = new BigDecimal(rslt.getCESSATION_TIME());
		BigDecimal keepCESSATION_TIME = new BigDecimal(keep.getCESSATION_TIME());

		Date rsltOPR_DATE = 
				Converter.strToDate(rslt.getOPR_DATE(),Converter.SLASH_DATE);
		Date keepOPR_DATE = 
				Converter.strToDate(keep.getOPR_DATE(),Converter.SLASH_DATE);
				
		BigDecimal rsltOPRATION_TIME = new BigDecimal(rslt.getOPRATION_TIME());
		BigDecimal keepOPRATION_TIME = null;
		if(null == keep.getOPRATION_TIME() || keep.getOPRATION_TIME().length() == 0){
		  keepOPRATION_TIME = new BigDecimal("0");
		}else{
		  keepOPRATION_TIME = new BigDecimal(keep.getOPRATION_TIME());
		}

		if ((rsltACPT_QTY.compareTo(keepACPT_QTY) != 0)
				|| 
				(rsltDEFECT_QTY.compareTo(keepDEFECT_QTY) != 0)
				|| 
				(rsltOPR_DATE.compareTo(keepOPR_DATE) != 0)
				||
				(rsltOPRATION_TIME.compareTo(keepOPRATION_TIME) != 0)
				|| 
				((rslt.getWH_CD() != null
				&& !rslt.getWH_CD().equals(keep.getWH_CD()))
				|| 
				(rslt.getWH_CD() == null
				&& keep.getWH_CD() != null)
				|| 
				(rslt.getWH_CD() != null
				&& keep.getWH_CD() == null))
				||
				((rslt.getWS_CD() != null
				&& !rslt.getWS_CD().equals(keep.getWS_CD()))
				|| 
				(rslt.getWS_CD() == null
				&& keep.getWS_CD() != null)
				|| 
				(rslt.getWS_CD() != null
				&& keep.getWS_CD() == null))
				||
				((rslt.getOPR_TIME_UNIT_TYP() != null
				&& !rslt.getOPR_TIME_UNIT_TYP().equals(keep.getOPR_TIME_UNIT_TYP()))
				|| 
				(rslt.getOPR_TIME_UNIT_TYP() == null
				&& keep.getOPR_TIME_UNIT_TYP() != null)
				|| 
				(rslt.getOPR_TIME_UNIT_TYP() != null
				&& keep.getOPR_TIME_UNIT_TYP() == null))
				||
				((rslt.getOPR_RSLT_PERSON() != null
				&& !rslt.getOPR_RSLT_PERSON().equals(keep.getOPR_RSLT_PERSON()))
				|| 
				(rslt.getOPR_RSLT_PERSON() == null
				&& keep.getOPR_RSLT_PERSON() != null)
				|| 
				(rslt.getOPR_RSLT_PERSON() != null
				&& keep.getOPR_RSLT_PERSON() == null))
				||
				(rsltPRE_ARRANGEMENT_TIME.compareTo(keepPRE_ARRANGEMENT_TIME) != 0)
				|| 
				(rsltOPR_TIME.compareTo(keepOPR_TIME) != 0)
				|| 
				(rsltPOST_ARRANGEMENT_TIME.compareTo(keepPOST_ARRANGEMENT_TIME) != 0)
				|| 
				(rsltCESSATION_TIME.compareTo(keepCESSATION_TIME) != 0)
				|| 
				((rslt.getCESSATION_CAUSE() != null
				&& !rslt.getCESSATION_CAUSE().equals(keep.getCESSATION_CAUSE()))
				|| 
				(rslt.getCESSATION_CAUSE() == null
				&& keep.getCESSATION_CAUSE() != null)
				|| 
				(rslt.getCESSATION_CAUSE() != null
				&& keep.getCESSATION_CAUSE() == null))
				||
				((rslt.getVEND_LOT_NO() != null
				&& !rslt.getVEND_LOT_NO().equals(keep.getVEND_LOT_NO()))
				|| 
				(rslt.getVEND_LOT_NO() == null
				&& keep.getVEND_LOT_NO() != null)
				|| 
				(rslt.getVEND_LOT_NO() != null
				&& keep.getVEND_LOT_NO() == null))
				||
				((rslt.getLOT_NO() != null
				&& !rslt.getLOT_NO().equals(keep.getLOT_NO()))
				|| 
				(rslt.getLOT_NO() == null
				&& keep.getLOT_NO() != null)
				|| 
				(rslt.getLOT_NO() != null
				&& keep.getLOT_NO() == null))
				||
				((rslt.getOPR_RSLT_COMMENT() != null
				&& !rslt.getOPR_RSLT_COMMENT().equals(keep.getOPR_RSLT_COMMENT()))
				|| 
				(rslt.getOPR_RSLT_COMMENT() == null
				&& keep.getOPR_RSLT_COMMENT() != null)
				|| 
				(rslt.getOPR_RSLT_COMMENT() != null
				&& keep.getOPR_RSLT_COMMENT() == null))) {
			return false;
		}
		return true;
	}
    /** コンボボックスデータ取得用定数　出庫区分 */
    private final static String ISSUE_TYP_PARAMETER_NAME= "ISSUE_TYP"; 

    /** コンボボックスデータ取得用　出庫区分*/
    private ComboStruct ISSUE_TYP = null;
    
    /** コンボボックスデータ取得用定数　品目手配区分*/
    private final static String MRP_ODR_TYP_PARAMETER_NAME= "MRP_ODR_TYP"; 

    /** コンボボックスデータ取得用　品目手配区分*/
    private ComboStruct MRP_ODR_TYP = null;

    private void othercomboTyp(AD0040010Struct aStruct) {

	 aStruct.setISSUE_TYP_DN(getDisplayName(ISSUE_TYP, aStruct.geth_ISSUE_TYP()));
	 aStruct.setMRP_ODR_TYP_DN(getDisplayName(MRP_ODR_TYP, aStruct.getMRP_ODR_TYP()));
  
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
	//コンボボックスの説明取得（多言語）
	public String multcombo(String comname,String value) throws BusinessProcessException, FoundationException {
		try {
			ComboBox com = new ComboBox(conn, sysUSER_CD);
			ComboStruct _comstruct = new ComboStruct();
			_comstruct = com.getData(comname);
			for (int j = 0; j < _comstruct.size(); j++) {
				if ((_comstruct.getData(j)[0]).equals(value)) {
					return _comstruct.getData(j)[1];
				}
			}
			return null;
		}catch(Exception e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			throw new ExpjException(e, emsg);
		}
	}

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

	/**
	 * 帳票出力ボタン押下時に実行される処理です。
	 *
	 */
	public void controlPrint(String strPrintGrpNo) throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0040");
		logger.entering("AD0040011Control"+":USER="+struct.getsUser_ID(),"controlPrint");
			AD0040010Struct strPdf = null;

		int ret = 0;
		String printType      = getPdfOutputType();
		String printPattern   = getPdfOutputListPattern();
		String printer        = getPdfOutputPrinter();
		SvfWrapper svf        = new SvfWrapper(printType, getsysUSER_CD(), printer);

			//{{user_implement_dev:<controlPrint>
			// TODO: ユーザ定義のコードを記述してください
		try {
			String printId1 = "AD00400101";		// TODO: 帳票IDを指定してください

			ret = svf.VrInit(printId1);	// PDF作成開始
			pdfFilePath = svf.getPdfFilePath();	// pdfフルパスファイル名
			pdfFileName = svf.getPdfFileName();	// pdfファイル名（Web用）
			queryFileName = svf.getQueryFileName();	// queryファイル名
		
			/* クエリーファイルの指定 */
			if(dbKIND != null && !"".equals(dbKIND)) {
				ret = svf.VrSetQuery("KIND=" + dbKIND + ";UID=" + dbUID + ";PWD=" + dbPWD + ";DBQ=" + dbDBQ);
			} else {
				ret = svf.VrSetQuery("UID=" + dbUID + ";PWD=" + dbPWD + ";DBQ=" + dbDBQ);
			}
			/* クエリー抽出条件の指定 */

			ret = svf.VrCondition("[X|PRINT_GRP_NO]=" + Long.parseLong(strPrintGrpNo), 4);

			/* クエリー抽出条件の指定 */

			//ret = svf.VrCondition("[X|PLANT_CD]=" + struct.getPLANT_CD(), 4);

			//ret = svf.VrCondition("[X|PLANT_NAME]=" + struct.getPLANT_NAME(), 4);

			//ret = svf.VrCondition("[X|ORG_CD]=" + struct.getORG_CD(), 4);

			//ret = svf.VrCondition("[X|ORG_NAME]=" + struct.getORG_NAME(), 4);

			//ret = svf.VrCondition("[X|DOWNLOAD_FILE]=" + struct.getDOWNLOAD_FILE(), 4);

			//ret = svf.VrCondition("[X|COMPARE_F_YEAR_MONTH]=" + struct.getCOMPARE_F_YEAR_MONTH(), 4);

			//ret = svf.VrCondition("[X|COMPARE_T_YEAR_MONTH]=" + struct.getCOMPARE_T_YEAR_MONTH(), 4);

			//ret = svf.VrCondition("[X|l_EXPENSE_CD]=" + struct.getl_EXPENSE_CD(), 4);

			//ret = svf.VrCondition("[X|l_EXPENSE_NAME]=" + struct.getl_EXPENSE_NAME(), 4);

			//ret = svf.VrCondition("[X|l_COMPARE_F_COST]=" + struct.getl_COMPARE_F_COST(), 4);

			//ret = svf.VrCondition("[X|l_COMPARE_T_COST]=" + struct.getl_COMPARE_T_COST(), 4);

			//ret = svf.VrCondition("[X|l_DIFFERENCE_COST]=" + struct.getl_DIFFERENCE_COST(), 4);
			/* クエリー実行 */
			ret = svf.VrReport();
			if(ret == -554) {
				setErrorMessage("ZZ06001");
				setScreenMoveFlg(1);
				return;
			}
			if (ret != 0){
				setErrorMessage("ZZ01108");
				setScreenMoveFlg(1);
				return;
			}

			/* PDF作成終了 */
			ret = svf.VrQuit();
			_printFlg = "1";
			_downloadFile = getPdfFileName();
			_keepOprInstCd = this.struct.getOPR_INST_CD();

		}catch(Exception e) {
			e.printStackTrace();
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());//致命的エラー エラー内容
			ExpjException ee = new ExpjException(e, emsg); // エクセプションを生成
			throw ee;
		} finally {
			//
		}
                //}}user_implement_dev:<controlPrint>
		logger.exiting("AD0040011Control"+":USER="+struct.getsUser_ID(),"controlPrint");

		return;
	}
	
	/**
	 * 時刻の設定
	 * @param  input    入力String
	 * @param  cnt      桁数
	 * @return String   頭にゼロを埋める
	 */
	private String AppendZero(String input,int cnt){
	  int nCount = cnt - input.length() ;
	  for(int i = 1; i <= nCount;i++)
	  {
	  	input = "0" + input;
	  }
	  return input;
	}
	
	/**
	 * システムパラメータ
	 * @return 
	 */
	private void GetTimeCtrl() throws BusinessProcessException, FoundationException {
		try{
			// システムパラメータ（TIME_CTRL）取得
			AD0040010Struct TIME_CTRLStruct = new AD0040010Struct();
			List TIME_CTRLList = entity.mSELECT_TIME_CTRL.read(conn, TIME_CTRLStruct);
			if(null != TIME_CTRLList && TIME_CTRLList.size()>0){
				TIME_CTRLStruct = (AD0040010Struct)TIME_CTRLList.get(0);
				struct.setTIME_CTRL(TIME_CTRLStruct.getTIME_CTRL());
			}else{
				struct.setTIME_CTRL(null);
			}
		}catch(Exception e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			throw new ExpjException(e, emsg);
		}
	}
	/**
	 * システムパラメータ取得
	 */
	private boolean getSysParameter() throws BusinessProcessException, FoundationException {
		boolean b = true;
		try {
			List sysParameterList = entity.mSELECT_SYS_PARAMETER.read(conn, struct);
			if(sysParameterList == null || sysParameterList.isEmpty()) return b;
			AD0040010Struct sysParameterStruct = (AD0040010Struct) sysParameterList.get(0);
			if(null != sysParameterStruct.getPAST_RESULT_ENTRY_TYP() && !"".equals(sysParameterStruct.getPAST_RESULT_ENTRY_TYP())){
				if("false".equals(sysParameterStruct.getPAST_RESULT_ENTRY_TYP())){
					b = false;
				}
			}
		}catch(Exception e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			throw new ExpjException(e, emsg);
		}
		return b;
	}
	/**
	 * 実際原価管理パラメータの対象年月日取得
	 */
	private BigDecimal getProcExecDate() throws BusinessProcessException, FoundationException {
		BigDecimal bd = null;
		try {
			struct.setPLANT_CD(getsysPLANT_CD());
			List procExecDateList = entity.mSELECT_SYS_ACTUAL_COST_CTRL_AC.read(conn, struct);
			if(procExecDateList == null || procExecDateList.isEmpty()) return null;
			AD0040010Struct procExecDateStruct = (AD0040010Struct) procExecDateList.get(0);
			bd = procExecDateStruct.getPROC_EXEC_DATE();
			struct.setPROC_EXEC_DATE(bd);
		}catch(Exception e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			throw new ExpjException(e, emsg);
		}
		return bd;
	}
	
	
  // 実際原価の締めが完了している日付では入力できません
	private String ProcExecDateError = "AE00160";
	
	/**
	 * 対象年月日と入力年月日の比較
	 * 実際原価の締めが完了している日付での実績の登録を不可とする
	 * 実際原価の締めが完了している日付けの実績情報の修正を不可とする
	 * @param  doType      登録（'1'）また更新（'2'）また削除（'3'）
	 * @param  selOutDate  更新前入力年月日
	 * @param  inputDate 　更新後入力年月日
	 * @return boolean 　  チェック返す値
	 */
	private boolean chkProcExecDate(String doType,String selOutDate,String inputDate) throws BusinessProcessException, FoundationException {
		boolean b = true;
		
		// 実際原価管理パラメータの対象年月日
		BigDecimal ProcExecDate = getProcExecDate();
		if(null == ProcExecDate) return b;
		ProcExecDateError = "AE00160";
		
		// 登録の場合
		if("1".equals(doType)){
			// 画面入力年月日
			BigDecimal input = new BigDecimal(inputDate.substring(0,4) + inputDate.substring(5,7));
			b = compDecimal(input,ProcExecDate);
			
		}
		// 更新の場合
		if("2".equals(doType)){
			
			// 更新前入力年月日
			BigDecimal selOut = new BigDecimal(selOutDate.substring(0,4) + selOutDate.substring(5,7));
			// 更新後入力年月日
			BigDecimal input = new BigDecimal(inputDate.substring(0,4) + inputDate.substring(5,7));
			// 読込んだ実績情報の日付の比較
			b = compDecimal(selOut,ProcExecDate);
			if(b == false){
				// 実際原価の締めが完了している日付けの実績情報は修正できません
				ProcExecDateError = "AE00161";
				return b;
			}
			// 入力の日付の比較
			b = compDecimal(input,ProcExecDate);
			
		}
		// 削除の場合
		if("3".equals(doType)){
			// 更新前入力年月日
			BigDecimal selOut = new BigDecimal(selOutDate.substring(0,4) + selOutDate.substring(5,7));
			// 読込んだ実績情報の日付の比較
			b = compDecimal(selOut,ProcExecDate);
			// 実際原価の締めが完了している日付けの実績情報は修正できません
			ProcExecDateError = "AE00161";
			
		}
		
		return b;
	}
	
	/**
	 * 比較
	 * @param  bd1      入力引数1
	 * @param  bd2 　   入力引数2
	 * @return boolean  チェック返す値
	 */
	private boolean compDecimal(BigDecimal bd1,BigDecimal bd2){
		// bd1 >= bd2
		if(bd1.compareTo(bd2) >= 0) {
			return true;
		} else {
			return false;
		}
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
	 * 不良理由コードを再設定
	 *
	 */
	private void setDefect(){
		List viewList = new ArrayList(0);
		List defectCauseCdListNew = struct.getList_l_DEFECT_CAUSE_CD();
		List defectInspcQtyListNew = struct.getList_l_DEFECT_QTY();
		List defectCommentListNew = struct.getList_l_DEFECT_COMMENT();
		String defectCauseCd;
		String defectInspcQty;
		String defectComment;
		for (int i = 0; i < defectCauseCdListNew.size(); i++) {
			defectCauseCd = (String) defectCauseCdListNew.get(i);
			defectInspcQty = (String) defectInspcQtyListNew.get(i);
			defectComment = (String) defectCommentListNew.get(i);
			AD0040010Struct defectStruct = new AD0040010Struct();
			defectStruct.setl_DEFECT_CAUSE_CD(defectCauseCd);
			defectStruct.setl_DEFECT_QTY(defectInspcQty);
			defectStruct.setl_DEFECT_COMMENT(defectComment);
			viewList.add(defectStruct);
		}
		this.defectList = viewList;
	}
	
	// Add Start 20140220 liuj

    /**
     * 前工程の存在チェック
     */
	private boolean chkBeforeProc(String oprInstNo) throws Exception{
		AD0040010Struct chkStruct = new AD0040010Struct();
		chkStruct.setOPR_INST_CD(oprInstNo);
		List chkList = entity.mchkBeforeProc.read(conn, chkStruct);
		if (chkList.isEmpty()){
			return false;
		} else {
			return true;
		}
		
	}
	
    /**
     * 前工程の保管区コードを取得する
     */
	private String getBeforeProc(String oprInstNo) throws Exception{
		AD0040010Struct chkStruct = new AD0040010Struct();
		chkStruct.setOPR_INST_CD(oprInstNo);
		List chkList = entity.mchkBeforeProc.read(conn, chkStruct);
		if (!chkList.isEmpty()){
			return ((AD0040010Struct)chkList.get(0)).getBEFORE_WH_CD();
		} else {
			return null;
		}
		
	}
	// Add End 20140220 liuj
		
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * 読込ボタン押下時に実行される処理です。
	 *
	 */
	public void controlSelect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0040");
		logger.entering("AD0040010Control"+":USER="+struct.getsUser_ID(),"controlSelect");
			//{{user_implement_dev:<controlSelect>
		
		try {
			ResourceBundle bundle = SystemConfig.getBundle();
			dbUID = SystemConfig.getProperty("CONNECT_DBUSER", bundle);
			dbPWD = SystemConfig.getProperty("CONNECT_DBPASS", bundle);
			dbDBQ = SystemConfig.getProperty("CONNECT_DBHOST", bundle);
			dbKIND = SystemConfig.getProperty("CONNECT_KIND", bundle);
		} catch(MissingResourceException e) {
			e.printStackTrace();
		}

		try {
			_keepOprInstCd = this.struct.getIN_OPR_INST_CD();
			_keepPartialPrdNo = this.struct.getPARTIAL_PRD_NO();

			this.headerStruct.clear();
			this.listClear();
			
			this.struct.clear();
			//初期値の設定
			mainInitialize();
			this.struct.setIN_OPR_INST_CD(_keepOprInstCd);
			this.struct.setPARTIAL_PRD_NO(null);
			
			//作業指示伝票検索
			List tempList = entity.mSelectOprInstSlip.read(conn, struct);
			if (tempList.isEmpty()) {
				setErrorMessage("AD30587");
				setWarningSysLogMessage("T_OPR_INST_SLIP.OPR_INST_CD", struct.getIN_OPR_INST_CD());//作業指示伝票.作業指示番号
				setReadStatus(NOT_FOUND);
				setScreenMoveFlg(1);
				return;
			}
			AD0040010Struct tempStruct = (AD0040010Struct)tempList.get(0);
			if (!this.sysPLANT_CD.equals(tempStruct.getPLANT_CD())) {
				setErrorMessage("AD00031");
				setWarningSysLogMessage("T_OPR_INST_SLIP.OPR_INST_CD", struct.getIN_OPR_INST_CD());//作業指示伝票.作業指示番号
				setReadStatus(ERROR);
				setScreenMoveFlg(1);
				return;
			}
			
			//ヘッダ検索
			tempList = new ArrayList();
			tempList = entity.mSelectHeaderT_OD_MRP_ODR_TYP.read(conn, struct);
			
			if (tempList.isEmpty()) {
				setErrorMessage("ZZ01101");
				setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.OPR_INST_CD", struct.getIN_OPR_INST_CD());//系列別仕掛.作業指示番号
				setReadStatus(NOT_FOUND);
				setScreenMoveFlg(1);
				return;
			}

			this.headerStruct = new AD0040010Struct();
			this.headerStruct = (AD0040010Struct)tempList.get(0);
			headerStruct.setMRP_ODR_TYP_DN(multcombo("MRP_ODR_TYP",headerStruct.getMRP_ODR_TYP()));
			setStandardItem(headerStruct);
			this.headerStruct.setIN_OPR_INST_CD(struct.getIN_OPR_INST_CD());
			this.headerStruct.setOPR_INST_CD_GNR_TYP(tempStruct.getOPR_INST_CD_GNR_TYP());

			//品目別仕掛のmodifycount取得+作業実績区分の取得
			tempList = entity.mSelectWorkItem.read(conn, this.headerStruct);
			if (tempList.isEmpty()) {
				this.headerStruct.clear();
				setErrorMessage("ZZ01101");
				setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.OPR_INST_CD", struct.getIN_OPR_INST_CD());//系列別仕掛.作業指示番号
				setReadStatus(ERROR);
				mainInitialize();
				setScreenMoveFlg(1);
				return;
			}
			tempStruct = (AD0040010Struct)tempList.get(0);
			this.headerStruct.seth_ITEM_MODIFY_COUNT(tempStruct.geth_ITEM_MODIFY_COUNT());
				
			if (tempStruct.getOPR_RSLT_TYP() == null
					|| "1".equals(tempStruct.getOPR_RSLT_TYP())) {
				//出来高の場合エラー
				this.headerStruct.clear();
				setErrorMessage("ZZ01101");
				setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.OPR_INST_CD", struct.getIN_OPR_INST_CD());//系列別仕掛.作業指示番号
				setReadStatus(ERROR);
				mainInitialize();
				setScreenMoveFlg(1);
				return;
			}

			if (this.headerStruct.geth_WORK_STS_TYP() == null
					|| "1".equals(this.headerStruct.geth_WORK_STS_TYP())) {
				//作業状態区分が1（未指示の場合エラー）
				this.headerStruct.clear();
				setErrorMessage("AD30804");
				setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.OPR_INST_CD", struct.getIN_OPR_INST_CD());//系列別仕掛.作業指示番号
				setReadStatus(ERROR);
				mainInitialize();
				setScreenMoveFlg(1);
				return;
			}
			
			// Add Start 20140214 liuj
			// システムパラメータ：　”工程保管場所の在庫を管理する”が”ＯＮ”、且つ、前回工程の[作業実績]に登録しない場合
			if ("1".equals(this._processManageFlg)){
				List preList = entity.mgetPREVIOUS_PROC.read(conn, struct);
				if (!preList.isEmpty()){
					// 前回工程がある
					AD0040010Struct workStruct = new AD0040010Struct();
					for (int i = 0 ; i < preList.size(); i++){
						workStruct.setOPR_INST_CD(((AD0040010Struct)preList.get(i)).getPRE_OPR_INST_CD());
						List rsltList = entity.mT_OPR_RSLT.read(conn, workStruct);
						AD0040010Struct rsltStruct = (AD0040010Struct)rsltList.get(0);
						if (rsltStruct.getOPR_DATE() == null || "".equals(rsltStruct.getOPR_DATE())){ 
							// 前回工程の[作業実績]に登録しない
							this.headerStruct.clear();
							setErrorMessage("AD00228");
							setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.OPR_INST_CD", struct.getIN_OPR_INST_CD());//系列別仕掛.作業指示番号
							setReadStatus(ERROR);
							mainInitialize();
							setScreenMoveFlg(1);
							return;
						}
					}
				}
				// 「作業指示番号」を基に、[作業系列別仕掛]から[作業系列別仕掛]．“作業計画番号”を取得し、
				// [作業系列別仕掛]．“作業計画番号”を基に、[作業系列別仕掛].“仕掛内外作区分”が2：外作場合
				preList = entity.mgetT_WORK_IN_PROC_BY_PROC.read(conn, struct);
				if (!preList.isEmpty()){
					this.headerStruct.clear();
					setErrorMessage("AD00229");
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.OPR_INST_CD", struct.getIN_OPR_INST_CD());//系列別仕掛.作業指示番号
					setReadStatus(ERROR);
					mainInitialize();
					setScreenMoveFlg(1);
					return;
				}
			}
			
			
			// Add End 20140214 liuj
			
			if (warningFlg == WARNING_INITIAL) {
				warningFlg = WARNING_MESSAGE_1;
			}
			if (this.headerStruct.geth_WORK_STS_TYP() == null
					|| "9".equals(this.headerStruct.geth_WORK_STS_TYP())) {
				//作業状態区分が9（完了の場合ワーニング）
				if (warningFlg == WARNING_MESSAGE_2) {
					setWarningMessage("AD00106");
					setInfoSysLogMessage("T_WORK_IN_PROC_BY_PROC.OPR_INST_CD", struct.getIN_OPR_INST_CD());//系列別仕掛.作業指示番号
				} else if(warningFlg == WARNING_MESSAGE_1) {
					setWarningMessage("AD00090");
					setInfoSysLogMessage("T_WORK_IN_PROC_BY_PROC.OPR_INST_CD", struct.getIN_OPR_INST_CD());//系列別仕掛.作業指示番号
				}
			}
			warningFlg = WARNING_INITIAL;
			
			int maxLine = 0;		
			_rsltListflg = 0;
			_issueListflg = 0;
            // 最大表示行数
            maxLine = sp.getMaxLine(conn, 10);
			if(maxLine != 0) {
				struct.setROW_COUNT(String.valueOf(maxLine));
			} else {
				struct.setROW_COUNT(null);
			}
			this.rsltList = entity.mSelectCnt.read(conn, struct);
			long rowCount = Long.parseLong(((AD0040010Struct)rsltList.get(0)).getl_COUNT()); 
			if (rowCount==0) {

			} else {
				   if (maxLine != 0 && rowCount == maxLine + 1) {
					   if(this.rsltList != null && this.rsltList.size() > 0){
					     this.rsltList.clear();
					   }
						setErrorMessage("AD00064",""+maxLine);
						setWarningSysLogMessage("T_OPR_RSLT.OPR_INST_CD", struct.getIN_OPR_INST_CD());//作業実績.作業指示番号
						setReadStatus(TOO_MANY);
						setScreenMoveFlg(1);
//						return;
					}
			}
            //作業実績検索
		    if (rowCount == 0 || maxLine == 0 || rowCount < maxLine + 1){
				this.rsltList = entity.mSelect.read(conn, struct);
		    }
			if (this.rsltList.isEmpty()) {
			} else {
				
				if (_keepPartialPrdNo == null || _keepPartialPrdNo.length() == 0) {
					tempStruct = (AD0040010Struct)this.rsltList.get(0);
					String partialNo = tempStruct.getPARTIAL_PRD_NO();		
					if (!(partialNo == null || partialNo.length() == 0)) {
						//作業実績検索後件数 0:なし 1:あり
						_rsltListflg = 1;
					}
					this.headerStruct.setPARTIAL_PRD_NO(tempStruct.getPARTIAL_PRD_NO());
					this.headerStruct.setACPT_QTY(tempStruct.getACPT_QTY());
					this.headerStruct.setDEFECT_QTY(tempStruct.getDEFECT_QTY());

				} else {
					for (int i = 0; i < this.rsltList.size(); i++ ) {
						tempStruct = (AD0040010Struct)this.rsltList.get(i);
						if (_keepPartialPrdNo.equals(tempStruct.getPARTIAL_PRD_NO())) {
							String partialNo = tempStruct.getPARTIAL_PRD_NO();		
							if (!(partialNo == null || partialNo.length() == 0)) {
								//作業実績検索後件数 0:なし 1:あり
								_rsltListflg = 1;
							}
							this.headerStruct.setPARTIAL_PRD_NO(tempStruct.getPARTIAL_PRD_NO());
							this.headerStruct.setACPT_QTY(tempStruct.getACPT_QTY());
							this.headerStruct.setDEFECT_QTY(tempStruct.getDEFECT_QTY());
						}
					}
				}

				this.headerStruct.seth_ISSUE_INST_CD(null);
				//数値タイプ項目がnullの場合、0をセット
				zeroSet(this.headerStruct);
				
				
/*				//出庫指示リスト取得
				this.setIssueList();
				maxLine = sp.getMaxLine(conn,11);//子品目表示件数
				if (maxLine != 0 && this.issueList.size() > maxLine) {
					this.issueList.clear();
					setErrorMessage("AD00065",""+maxLine);
					setWarningSysLogMessage("T_ISSUE_INST.WORK_ODR_CD", headerStruct.getWORK_ODR_CD());//作業実績.作業計画番号
					setReadStatus(TOO_MANY);
					setScreenMoveFlg(1);
					return;
				}
*/
				//出庫指示リスト存在チェック		
				checkIssueList();
			}			
			
			//現品票出力チェックボックス制御処理
			AD0040010Struct FormSetStruct = new AD0040010Struct();
			
			if("1".equals(_outputFlg)){
				
				_outputFlg = "0";
				FormSetStruct.setFORM_SET_ITEM_CD(this.headerStruct.getITEM_CD());
									
				List list_formset2 = entity.mSelectProduct_Typ.read(conn, FormSetStruct);
				//品目マスタから製品区分の検索結果のチェック
				if (list_formset2.isEmpty()){
					setErrorMessage("KR20011");
					setWarningSysLogMessage("M_ITEM.ITEM_CD", headerStruct.getITEM_CD());//品目.品目番号
					setReadStatus(ERROR);
					return;
				}
				//製品区分の取得
				FormSetStruct = (AD0040010Struct)list_formset2.get(0);
				String strProduct_Typ = FormSetStruct.getPRODUCT_TYP();
				
				if (null != _initProduct_Typ && !"".equals(_initProduct_Typ)){
					String[] arrProduct_Typ = _initProduct_Typ.split(",");
					for(int i=0; i < arrProduct_Typ.length; i++){
						if(null != strProduct_Typ && !"".equals(strProduct_Typ) && strProduct_Typ.equals(arrProduct_Typ[i])){
							_outputFlg = "1";
							break;
						}
					}
				}
				
			}
			
			this.struct.setStructM(this.headerStruct);
			List tempList1 = entity.mselectMaxNum.read(conn, struct);		
			if(tempList1.size()>0){
				struct.seth_OPR_DATE(((AD0040010Struct) (tempList1.get(0))).geth_OPR_DATE());
			}
			setReadStatus(NORMAL);

		} catch (SQLException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			throw new ExpjException(e, emsg);
		} catch (Exception e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			throw new ExpjException(e, emsg);
		}


                //}}user_implement_dev:<controlSelect>
		logger.exiting("AD0040010Control"+":USER="+struct.getsUser_ID(),"controlSelect");

		return;
	}

	/**
	 * 子部品追加登録ボタン押下時に実行される処理です。
	 *
	 */
	public void controlUseParts() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0040");
		logger.entering("AD0040010Control"+":USER="+struct.getsUser_ID(),"controlUseParts");
			//{{user_implement_dev:<controlUseParts>
			

		try {
			GetTimeCtrl();
			setBussinessOprDate();
			this.issueStruct = new AD0040010Struct();
			setStandardItem(issueStruct);

			//ヘッダ検索
			List tempList = new ArrayList();
			tempList = entity.mSelectHeader.read(conn, struct);
			
			if (tempList.isEmpty()) {
				setErrorMessage("ZZ01101");
				setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.OPR_INST_CD", struct.getIN_OPR_INST_CD());//系列別仕掛.作業指示番号
				return;
			}
			this.headerStruct = new AD0040010Struct();
			this.headerStruct = (AD0040010Struct)tempList.get(0);
			headerStruct.setMRP_ODR_TYP_DN(multcombo("MRP_ODR_TYP",headerStruct.getMRP_ODR_TYP()));
			setStandardItem(headerStruct);
			this.headerStruct.setIN_OPR_INST_CD(struct.getIN_OPR_INST_CD());

			//品目別仕掛のmodifycount取得+作業実績区分の取得
			tempList = entity.mSelectWorkItem.read(conn, this.headerStruct);
			if (tempList.isEmpty()) {
				this.headerStruct.clear();
				setErrorMessage("ZZ01101");
				setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.OPR_INST_CD", struct.getIN_OPR_INST_CD());//品目別仕掛.作業指示番号
				return;
			}
			AD0040010Struct tempStruct = (AD0040010Struct)tempList.get(0);
			this.headerStruct.seth_ITEM_MODIFY_COUNT(tempStruct.geth_ITEM_MODIFY_COUNT());

			//表示項目のセット
			this.issueStruct.setITEM_CD(null);//子品目番号
			this.issueStruct.setITEM_NAME(null);//品目名
			this.issueStruct.setWH_CD(null);//使用元保管区
			this.issueStruct.setWH_NAME(null);//保管区名
			this.issueStruct.setJOB_ODR_CD(this.headerStruct.getJOB_ODR_CD());//使用元製番
			this.issueStruct.setTEMP_PLAN_QTY("0.0");//計画使用数量
			this.issueStruct.setSTOCK_UNIT(null);//計量単位
			this.issueStruct.setTEMP_USEOVER_QTY("0.0");//使用済数量
			this.issueStruct.setTEMP_PLANOUT_QTY("0.0");//計画外使用済数量
			this.issueStruct.setTEMP_USE_QTY("0.0");//更新使用数量
			this.issueStruct.setRCV_ISSUE_DATE(_oprDate);//使用日
		    this.issueStruct.setRCV_ISSUE_TIME(null);//使用日時分
			this.issueStruct.setVEND_LOT_NO(null);//製造ロット番号
			this.issueStruct.setLOT_NO(null);//在庫ロット番号
			this.issueStruct.seth_LOT_NO(null);//在庫ロット番号
			this.issueStruct.setRCV_ISSUE_COMMENT(null);//備考
			this.issueStruct.setMRP_ODR_TYP_DN(null);//手配区分
			this.issueStruct.setMRP_ODR_TYP(null);
			this.issueStruct.setISSUE_TYP_DN(null);//出庫指示出庫区分
			this.issueStruct.seth_ISSUE_TYP(null);
			
			this.issueStruct.setIN_OPR_INST_CD(struct.getIN_OPR_INST_CD());
			List partialPrdNoList = new ArrayList();
			partialPrdNoList = struct.getList_PARTIAL_PRD_NO();
			this.issueStruct.setPARTIAL_PRD_NO((String) partialPrdNoList.get(0));
			this.issueStruct.seth_ISSUE_INST_CD(null);
			
			//クライアントチェック項目のセット
			this.issueStruct.setUNIT_QTY_TYP(Kind.NUMBER);
			this.issueStruct.seth_BUSINESS_OPR_DATE(_oprDate);
			
			this.struct.setStructM(this.issueStruct);
			this.issueKeepStruct.setStructM(this.issueStruct);
			_issueExeType = 0;
			
			setReadStatus(NORMAL);

		} catch (SQLException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			throw new ExpjException(e, emsg);
		}


                //}}user_implement_dev:<controlUseParts>
		logger.exiting("AD0040010Control"+":USER="+struct.getsUser_ID(),"controlUseParts");

		return;
	}

	/**
	 * 更新ボタン押下時に実行される処理です。
	 *
	 */
	public void controlUpdate11() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0040");
		logger.entering("AD0040010Control"+":USER="+struct.getsUser_ID(),"controlUpdate11");
			//{{user_implement_dev:<controlUpdate11>


		try {
			//不良理由コードを再設定
			setDefect();			
			// 登録ボタン押下時に実行される処理です。
			if(null == struct.geth_OPR_DATE() || "".equals(struct.geth_OPR_DATE())){
					// 生産側の過去の実績入力の制限チェック
					if(getSysParameter() == false){
						if(chkProcExecDate("1","",struct.getOPR_DATE()) == false){
							setErrorMessage(ProcExecDateError);
							setErrorParameter("SYS_ACTUAL_COST_CTRL_AC", "PLANT_CD", struct.getPLANT_CD());
							setErrorParameter("SYS_ACTUAL_COST_CTRL_AC", "PROC_EXEC_DATE", struct.getPROC_EXEC_DATE().toString());
							return;
						}
					}
			}else{
					// 生産側の過去の実績入力の制限チェック
					if(getSysParameter() == false){
						if(chkProcExecDate("2",struct.geth_OPR_DATE(),struct.getOPR_DATE()) == false){
							setErrorMessage(ProcExecDateError);
							setErrorParameter("SYS_ACTUAL_COST_CTRL_AC", "PLANT_CD", struct.getPLANT_CD());
							setErrorParameter("SYS_ACTUAL_COST_CTRL_AC", "PROC_EXEC_DATE", struct.getPROC_EXEC_DATE().toString());
							return;
						}
					}
			}
			
			//数値タイプ項目がnullの場合、0をセット
			zeroSet(this.struct);
			
			List tempList = null;
			AD0040010Struct tempStruct = null;
			//作業状態区分のチェック
			tempList = entity.mSELECT_Work_Sts_Typ.read(conn, struct);
			if(null != tempList && tempList.size() > 0){
				tempStruct = (AD0040010Struct)tempList.get(0);	
				if("9".equals(tempStruct.geth_WORK_STS_TYP())){
					setErrorMessage("AD00121");
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.OPR_INST_CD", struct.getIN_OPR_INST_CD());//作業系列別仕掛.作業指示番号
					return;
				}
			}
			
			//一覧の「不良理由コード」が重複フラグ
			boolean defectCauseCdFlag = false;
			//一覧の「不良理由コード」が重複チェック
			List defectCauseCdListChk = struct.getList_l_DEFECT_CAUSE_CD();
			for (int i = 0; i < defectCauseCdListChk.size()-1; i++) {
				String defectCauseCd = (String) defectCauseCdListChk.get(i);
				if("0".equals(defectCauseCd)){
					continue;
				}
				for(int j = i+1; j < defectCauseCdListChk.size(); j++){
					String defectCauseCd2 = (String) defectCauseCdListChk.get(j);
					if(defectCauseCd.equals(defectCauseCd2)){
						defectCauseCdFlag = true;
						break;
					}					
				}				
			}
			//一覧の「不良理由コード」が重複の場合
			if(defectCauseCdFlag){
				setErrorMessage("AE05062");
				return;				
			}

			//赤履歴登録内容をセットする
			AD0040010Struct pastRsltStruct = new AD0040010Struct();
			pastRsltStruct.setStructM(this.rsltStruct);
			setStandardItem(pastRsltStruct);

			BigDecimal inAcptQty = new BigDecimal(this.struct.getACPT_QTY());
			BigDecimal inDefectQty = new BigDecimal(this.struct.getDEFECT_QTY());
			if (this.headerStruct.getUNIT_QTY_TYP() != null 
					&& "1".equals(this.headerStruct.getUNIT_QTY_TYP())) {
				//品目が整数管理品の場合、切上げを行う
				inAcptQty = inAcptQty.setScale(0,BigDecimal.ROUND_DOWN);
				inDefectQty = inDefectQty.setScale(0,BigDecimal.ROUND_DOWN);
			}

			//変更内容をセットする
			this.rsltStruct.setOPR_INST_CD(this.struct.getOPR_INST_CD());
			this.rsltStruct.setPARTIAL_PRD_NO(this.struct.getPARTIAL_PRD_NO());

			this.rsltStruct.setACPT_QTY(inAcptQty.toString());
			this.rsltStruct.setDEFECT_QTY(inDefectQty.toString());
			this.rsltStruct.setOPR_DATE(this.struct.getOPR_DATE());
		  // 使用日の時刻
		  if (null == this.struct.getOPRATION_TIME() || "".equals(this.struct.getOPRATION_TIME())){
			  this.rsltStruct.setOPRATION_TIME("0000");
		  }else{
				this.struct.setOPRATION_TIME(AppendZero(this.struct.getOPRATION_TIME(),4));
				this.rsltStruct.setOPRATION_TIME(this.struct.getOPRATION_TIME());
			}
			this.rsltStruct.setWH_CD(this.struct.getWH_CD());
			this.rsltStruct.setWS_CD(this.struct.getWS_CD());
			this.rsltStruct.setOPR_RSLT_PERSON(this.struct.getOPR_RSLT_PERSON());
			this.rsltStruct.setPRE_ARRANGEMENT_TIME(this.struct.getPRE_ARRANGEMENT_TIME());
			this.rsltStruct.setOPR_TIME(this.struct.getOPR_TIME());
			this.rsltStruct.setPOST_ARRANGEMENT_TIME(this.struct.getPOST_ARRANGEMENT_TIME());
			this.rsltStruct.setCESSATION_TIME(this.struct.getCESSATION_TIME());
			this.rsltStruct.setCESSATION_CAUSE(this.struct.getCESSATION_CAUSE());
			this.rsltStruct.setVEND_LOT_NO(this.struct.getVEND_LOT_NO());
			this.rsltStruct.setLOT_NO(this.struct.getLOT_NO());
			this.rsltStruct.setOPR_RSLT_COMMENT(this.struct.getOPR_RSLT_COMMENT());
			this.rsltStruct.setUSER_CD(this.sysUSER_CD);
			this.rsltStruct.setPRG_NM(this.sp.getProcId());
			this.rsltStruct.setPLANT_CD(this.sysPLANT_CD);
			this.rsltStruct.setOPR_TIME_UNIT_TYP(this.struct.getOPR_TIME_UNIT_TYP());
			this.rsltStruct.setc_COMPLETE(this.struct.getc_COMPLETE());

// ▼▼ 2008/08/12 ADD START -TSUCHIDA▼▼
			List manhourTypList = new ArrayList();
			AD0040010Struct manhourTypStruct = null;
			List parentList = new ArrayList();
			AD0040010Struct parentStruct = null;
			List tRlsdPuchOdrList = new ArrayList();
			AD0040010Struct tRlsdPuchOdrStruct = null;
			List tWorkInProcByProcList = new ArrayList();
			AD0040010Struct tWorkInProcByProcStruct = null;
// ▲▲ 2008/08/12 ADD END -TSUCHIDA▲▲
			
			//保管区コードチェック
			//［作業系列別仕掛］.”最終系列フラグ”がOnかつ「良品数」＋「不良数」≠Zero
			// かつ、「保管区コード」＝Nullの場合は、保管区コードチェックを行わない。
			if (this.struct.getWH_CD() == null || "".equals(this.struct.getWH_CD())) {
			} else {
				tempList = entity.mSelectChkWhCd.read(conn,this.rsltStruct);
				if(tempList.isEmpty()){
					setErrorMessage("AD00020");
					setWarningSysLogMessage("M_WH.WH_CD", this.rsltStruct.getWH_CD());//保管区.保管区コード
				} else {
					tempStruct = (AD0040010Struct)tempList.get(0);
					this.rsltStruct.setWH_NAME(tempStruct.getWH_NAME());
					//保管区コードの工場コードと作業系列別仕掛の工場コードの同一チェック
					if (tempStruct.getPLANT_CD() == null 
							|| !tempStruct.getPLANT_CD().equals(this.headerStruct.getPLANT_CD())) {
						setErrorMessage("AD00021");
						setWarningSysLogMessage("M_WH.WH_CD", this.rsltStruct.getWH_CD());//保管区.保管区コード
						setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.OPR_INST_CD", this.headerStruct.getWORK_ODR_CD());//系列別仕掛.作業指示番号
					}
					// Add Start 20140214 liuj
					// システムパラメータ：”工程保管場所の在庫を管理する”が”ＯＮ”、且つ、最終工程の以外の場合、
					// [保管区].”倉庫区分”が １：工程保管場所 でない場合
					if ("1".equals(this._processManageFlg) && 
							!"1".equals(this.headerStruct.geth_FINAL_PROC_FLG()) &&
							!"1".equals(tempStruct.getWH_TYP())){
						setErrorMessage("AD00233");
						setWarningSysLogMessage("M_WH.WH_CD", this.rsltStruct.getWH_CD());//保管区.保管区コード
					}
					// システムパラメータ：”工程保管場所の在庫を管理する”が”ＯＮ”、且つ
					// 同じ「作業指示番号」の保管区コードが異なる場合
					if ("1".equals(this._processManageFlg) &&
							Calculate.compare(this.rsltStruct.getPARTIAL_PRD_NO(), "1") > 0){
						List whList = entity.mgetWH_CD_FROM_T_OPR_RSLT.read(conn, rsltStruct);
						if (!whList.isEmpty()){
							if (!rsltStruct.getWH_CD().equals(
									((AD0040010Struct)whList.get(0)).getT_OPR_RSLT_WH_CD())){
								setErrorMessage("AD00230");
								setWarningSysLogMessage("M_WH.WH_CD", this.rsltStruct.getWH_CD());//保管区.保管区コード					
							}
						}
					}
					// Add End 20140214 liuj
				}
			}

			//実績作業区コードチェック
			tempList = entity.mSelectChkWsCd.read(conn,this.rsltStruct);
			if (tempList.isEmpty()) {
				setErrorMessage("AD20029");
				setWarningSysLogMessage("M_WS.WS_CD",this.rsltStruct.getWS_CD());//作業区.作業区コード
			} else {
				tempStruct = (AD0040010Struct)tempList.get(0);
				this.rsltStruct.setWS_NAME(tempStruct.getWS_NAME());
				//実績作業区コードの工場コードと作業系列別仕掛の工場コードの同一チェック
				if (tempStruct.getPLANT_CD() == null 
						|| !tempStruct.getPLANT_CD().equals(this.headerStruct.getPLANT_CD())) {
					setErrorMessage("AD00004");
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.OPR_INST_CD", this.headerStruct.getWORK_ODR_CD());//系列別仕掛.作業指示番号
				}
			}

			// ロット管理フラグ = 1(ロットトレース管理を行う。)の場合
			if(rsltStruct.getLOT_CTRL_FLG().equals("1")){
				//最終系列フラグ = 1(最終系列)の場合
				if(rsltStruct.geth_FINAL_PROC_FLG().equals("1")){
					BigDecimal acptQty = new BigDecimal(this.rsltStruct.getACPT_QTY());

					//良品数 > 0の場合
					if (acptQty.doubleValue() > 0){
						//ロット番号採番区分 = 0(自動採番しない)の場合
						if(rsltStruct.getLOT_NUMBERING_TYP().equals("0")){
							//ロット管理検索
							tempList = entity.mT_LOT_CTRL.read(conn,this.rsltStruct);

							//[ロット管理]に存在しない場合
							if(tempList == null || tempList.size() == 0){
								setErrorMessage("AE20603");
								setWarningSysLogMessage("T_LOT_CTRL.LOT_NO", this.rsltStruct.getLOT_NO());
							}
						//ロット番号採番区分 = 0(自動採番しない)でない場合
						}else{
							//ロット番号がnullの場合
							if (this.rsltStruct.getLOT_NO() == null || this.rsltStruct.getLOT_NO().equals("")) {
								// 在庫ロット番号の自動採番を行う。
								BizCommon bc = new BizCommon(conn, getsysUSER_CD(), sp.getProcId(), getsysPLANT_CD());
						 		List retList = bc.getsetLotNumberingFd(rsltStruct.getITEM_CD(), rsltStruct.getOPR_DATE());

								//正常終了の場合
								if(bc.getResultStatus().intValue() == 1){
									//在庫ロット番号の取得
									if(retList != null && retList.size() > 0){
										String result1 = (String)retList.get(0);
										rsltStruct.setLOT_NO(result1);
									}
								//警告 or 異常終了の場合
								}else{
									//エラーメッセージの取得
									if(retList != null && retList.size() > 1){
										String result2 = (String)retList.get(1);
										setErrorMessage(result2);
									}
								}
							//更新前のロット番号がnullでない場合
							} else {
								//ロット管理検索
								tempList = entity.mT_LOT_CTRL.read(conn,this.rsltStruct);

								//[ロット管理]に存在しない場合
								if(tempList == null || tempList.size() == 0){
									setErrorMessage("AE20603");
									setWarningSysLogMessage("T_LOT_CTRL.LOT_NO", this.rsltStruct.getLOT_NO());
								}
							}
						}
					}
				}
			}
			// エラーがあれば終了
			if (msgStruct.hasError()) {
				return;
			}

			//空文字をnullに置換
			nullSet();
			
			// 作業日の設定
			this.rsltStruct.setOPR_DATE(this.rsltStruct.getOPR_DATE() + " "+ 
			                            this.rsltStruct.getOPRATION_TIME().substring(0,2) + ":" +
			                            this.rsltStruct.getOPRATION_TIME().substring(2));
			//完了以外が変更されていた場合のみ
			if (!this.CompareRsltStruct(this.rsltStruct,this.keepRsltStruct)) {
				//作業実績更新処理
				if (_rsltExeType == 0) { //登録
					try {
						entity.mInsertOprRslt.create(conn,this.rsltStruct);
					} catch (SQLException se){
						String err = se.toString();
						if (err.indexOf("ORA-00001") != -1) { //一意制約エラー
							setErrorMessage("ZZ01102");
							setWarningSysLogMessage("T_OPR_RSLT.OPR_INST_CD",this.rsltStruct.getOPR_INST_CD());//作業実績.作業指示番号
							setWarningSysLogMessage("T_OPR_RSLT.PARTIAL_PRD_NO",this.rsltStruct.getPARTIAL_PRD_NO());//作業実績.分作回数
							return;
						}
						throw se;
					}
				} else { //更新
	
					//排他制御＋ModifyCountチェック
					tempList = entity.mSelectChkOprRslt.read(conn, this.rsltStruct);
					if (tempList.isEmpty()) {
						setErrorMessage("ZZ01101");
						setWarningSysLogMessage("T_OPR_RSLT.OPR_INST_CD", this.rsltStruct.getOPR_INST_CD());//作業実績.作業指示番号
						setWarningSysLogMessage("T_OPR_RSLT.PARTIAL_PRD_NO", this.rsltStruct.getPARTIAL_PRD_NO());//作業実績.分作回数
						return;
					}
					tempStruct = (AD0040010Struct)tempList.get(0);
					if (this.rsltStruct.getRSLT_MODIFY_COUNT() != null 
							&& !this.rsltStruct.getRSLT_MODIFY_COUNT().equals(
							tempStruct.getRSLT_MODIFY_COUNT())) {
						setErrorMessage("ZZ01105");
						setWarningSysLogMessage("T_OPR_RSLT.OPR_INST_CD", this.rsltStruct.getOPR_INST_CD());//作業実績.作業指示番号
						setWarningSysLogMessage("T_OPR_RSLT.PARTIAL_PRD_NO", this.rsltStruct.getPARTIAL_PRD_NO());//作業実績.分作回数
						return;
					}

					//作業訂正回数のセット
					int crctNo = Integer.parseInt(tempStruct.getOPR_CRCT_NO());//作業訂正回数
						crctNo = crctNo + 1;
						// Add Start 20140307 liuj
						crctNoCheck = crctNo;
						// Add End  20140307 liuj
						
					this.rsltStruct.setOPR_CRCT_NO("" + crctNo);
					entity.mUpdateOprRslt.update(conn,this.rsltStruct);
				}
			}

			//完了のチェックボックス有りの場合、仕掛情報の更新
			this.rsltStruct.setUPDATE_WORK_STS_TYP("9");
			this.rsltStruct.setWORK_ODR_CD(this.headerStruct.getWORK_ODR_CD());

			if (this.rsltStruct.getc_COMPLETE() != null 
					&& "true".equals(this.rsltStruct.getc_COMPLETE())) {

				AD0040010Struct completeStruct = new AD0040010Struct();
				setStandardItem(completeStruct);
				completeStruct.setUPDATE_WORK_STS_TYP("9");
				completeStruct.setWORK_ODR_CD(this.headerStruct.getWORK_ODR_CD());
				completeStruct.setOPR_INST_CD(this.struct.getOPR_INST_CD());
				completeStruct.setUSER_CD(this.sysUSER_CD);
				completeStruct.setPRG_NM(this.sp.getProcId());
				completeStruct.setPLANT_CD(this.sysPLANT_CD);
				
				//同作業指示番号中の最遅作業日の取得（[作業実績]."作業実績作業日"）
				tempList = entity.mT_OPR_RSLT.read(conn, completeStruct);
				if (tempList.isEmpty()) {
					setErrorMessage("ZZ01101");
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.OPR_INST_CD",this.rsltStruct.getOPR_INST_CD());//作業系列仕掛.作業指示番号
					return;
				}
				tempStruct = (AD0040010Struct)tempList.get(0);
				completeStruct.setOPR_DATE(tempStruct.getOPR_DATE());
				

				//作業系列仕掛更新処理
				tempList = entity.mSelectChkWorkProc.read(conn,this.rsltStruct);
				if (tempList.isEmpty()) {
					setErrorMessage("ZZ01101");
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.OPR_INST_CD",this.rsltStruct.getOPR_INST_CD());//作業系列仕掛.作業指示番号
					return;
				}
				tempStruct = (AD0040010Struct)tempList.get(0);
				if (this.headerStruct.getPROC_MODIFY_COUNT() != null 
						&& !this.headerStruct.getPROC_MODIFY_COUNT().equals(
						tempStruct.getPROC_MODIFY_COUNT())) {
					setErrorMessage("ZZ01105");
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.OPR_INST_CD",this.rsltStruct.getOPR_INST_CD());//作業系列仕掛.作業指示番号
					return;
				}

				entity.mUpdateWorkProc.update(conn, completeStruct);
				//ModifyCountの再セット
				tempList = entity.mSelectChkWorkProc.read(conn,this.rsltStruct);
				if (tempList.isEmpty()) {
					setErrorMessage("ZZ01101");
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.OPR_INST_CD",this.rsltStruct.getOPR_INST_CD());//作業系列仕掛.作業指示番号
					return;
				}
				tempStruct = (AD0040010Struct)tempList.get(0);
				this.headerStruct.seth_PROC_MODIFY_COUNT(tempStruct.getPROC_MODIFY_COUNT());

				//デマンド完了（所要量）
				CommonOd od = 
						new CommonOd(
							conn,
							this.sysPLANT_CD,
							this.sysUSER_CD,
							this.sp.getProcId());
				od.changeDemandForComplete(
						this.headerStruct.getWORK_ODR_CD(),
						this.headerStruct.getWORK_IN_PROC_CD(),
						Converter.strToDate(this.rsltStruct.getOPR_DATE(), Converter.SLASH_DATE_HOUR_COLON_MINUTE)
				);

				if (this.headerStruct.geth_FINAL_PROC_FLG() != null 
						&& "1".equals(this.headerStruct.geth_FINAL_PROC_FLG())) {
					//作業系列が最終系列の場合、品目別仕掛更新処理
					tempList = entity.mSelectChkWorkItem.read(conn,this.headerStruct);

					if (tempList.isEmpty()) {
						setErrorMessage("ZZ01101");
						setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.OPR_INST_CD", this.rsltStruct.getOPR_INST_CD());//品目仕掛.作業指示番号
						return;
					}
					tempStruct = (AD0040010Struct)tempList.get(0);
					if (this.struct.geth_ITEM_MODIFY_COUNT() != null 
							&& !this.struct.geth_ITEM_MODIFY_COUNT().equals(
							tempStruct.getITEM_MODIFY_COUNT())) {
						setErrorMessage("ZZ01105");
						setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.OPR_INST_CD",this.rsltStruct.getOPR_INST_CD());//品目仕掛.作業指示番号
						return;
					}

					entity.mUpdateWorkItem.update(conn, completeStruct);

					//ModifyCountの再セット
					tempList = entity.mSelectChkWorkItem.read(conn,this.rsltStruct);
					if (tempList.isEmpty()) {
						setErrorMessage("ZZ01101");
						setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.OPR_INST_CD",this.rsltStruct.getOPR_INST_CD());//品目仕掛.作業指示番号
						return;
					}
					tempStruct = (AD0040010Struct)tempList.get(0);
					this.struct.seth_ITEM_MODIFY_COUNT(tempStruct.getITEM_MODIFY_COUNT());

					//オーダ完了（所要量）
					od.changeOrderForComplete(this.headerStruct.getOD_NO(),-1);
// ▼▼ 2008/08/12 ADD START -TSUCHIDA▼▼
					AD0040010Struct tOdUpdateStruct = new AD0040010Struct();
					manhourTypList = entity.mSelectItem.read(conn,this.headerStruct);

					if (!manhourTypList.isEmpty()) {
						manhourTypStruct = (AD0040010Struct)manhourTypList.get(0);
					}
					// [品目].工数管理品目区分 = 1:工数管理品目の場合
					if (manhourTypStruct.getMANHOUR_TYP() != null
							&& "1".equals(manhourTypStruct.getMANHOUR_TYP())){
						tOdUpdateStruct.setDM_STS_TYP("9");
						tOdUpdateStruct.setISSUE_CMPLT_DATE(this.rsltStruct.getOPR_DATE());
						tOdUpdateStruct.setUSER_CD(this.sysUSER_CD);
						tOdUpdateStruct.setPRG_NM(this.sp.getProcId());
						tOdUpdateStruct.setOD_NO(this.headerStruct.getOD_NO());
						// デマンド完了（所要量）
						entity.mUPDATE_T_OD.update(conn,tOdUpdateStruct);
					}
// ▲▲ 2008/08/12 ADD END -TSUCHIDA▲▲

				}
			}
			
			//現品票用
			AD0040010Struct IdentCardStruct = new AD0040010Struct();
			
			//製番のチェック
			String jobOdrNo = this.headerStruct.getJOB_ODR_CD();
			if (jobOdrNo != null) {
				tempList = entity.mSelectJobOdr.read(conn,this.headerStruct);
				if (tempList != null && tempList.size() > 0) {
					tempStruct = (AD0040010Struct)tempList.get(0);
					if (tempStruct.getJOB_ODR_TYP() != null 
							&& "3".equals(tempStruct.getJOB_ODR_TYP())
								&& tempStruct.getITEM_CD().equals(this.headerStruct.getITEM_CD())) {//最上位品目の場合2006/05/31 up
						//在庫補充製番
						jobOdrNo = null;
					}
				}
			}
			// 完了以外が変更されていない場合、現品票も出力する
			IdentCardStruct.setINS_JOB_ODR_CD(jobOdrNo); //製番
			IdentCardStruct.setINS_RCV_ISSUE_CTRL_CD(" ");//保管区別入出庫番号
			
			//完了以外が変更されていた場合のみ
			if (!this.CompareRsltStruct(this.rsltStruct,this.keepRsltStruct)) {  

				// 自動出庫呼び出し
				BigDecimal bdQty = new BigDecimal("0");
				if (this.rsltStruct.getACPT_QTY() != null) {
					bdQty = new BigDecimal(this.rsltStruct.getACPT_QTY());
				}
				if (this.rsltStruct.getDEFECT_QTY() != null) {
					bdQty = bdQty.add(new BigDecimal(this.rsltStruct.getDEFECT_QTY()));
				}
				String sFLG = "0";	//「作業完了」未
				if (this.rsltStruct.getc_COMPLETE() != null 
						&& "true".equals(this.rsltStruct.getc_COMPLETE())) {
					sFLG = "1";	//「作業完了」
				}
				if (this.rsltStruct.getOPR_CRCT_NO() == null 
						|| this.rsltStruct.getOPR_CRCT_NO().length() == 0) {
					this.rsltStruct.setOPR_CRCT_NO("0");
				}
				
				/********************
				 * 自動出庫処理開始 *
				 *******************/
				WhAutoIssueProc whAutoIssueProc = new WhAutoIssueProc(conn,
						this.sysPLANT_CD,
						this.sysUSER_CD,
						this.sp.getProcId());
				WhAutoIssueProc.AutoIssueParam autoIssueParam = whAutoIssueProc.new AutoIssueParam();
				
				// パラメータのセット
				autoIssueParam.m_WORK_ODR_CD = this.headerStruct.getWORK_ODR_CD();
				autoIssueParam.m_WORK_IN_PROC_CD = this.headerStruct.getWORK_IN_PROC_CD();
				autoIssueParam.m_PARTIAL_PRD_NO = Integer.parseInt(this.rsltStruct.getPARTIAL_PRD_NO());
				autoIssueParam.m_OPR_RSLT_CRCT_NO = Integer.parseInt(this.rsltStruct.getOPR_CRCT_NO());
				autoIssueParam.m_PUCH_ODR_CD = "";
				autoIssueParam.m_ACPT_NO = 0;
				autoIssueParam.m_ACPT_RSLT_CRCT_NO = 0;
				autoIssueParam.m_RCV_ISSUE_TYP = 2;
				autoIssueParam.m_RCV_ISSUE_DATE = this.rsltStruct.getOPR_DATE();
				autoIssueParam.m_RCV_ISSUE_RSLT_NO = bdQty.toString();
				autoIssueParam.m_RCV_ISSUE_CMPLT_FLG = Integer.parseInt(sFLG);
				autoIssueParam.m_PLANT_CD = this.sysPLANT_CD;
				
				AutoIssue autoIssue = new AutoIssue(conn,
						this.sysPLANT_CD,this.sysUSER_CD,this.sp.getProcId());
				
				// 自動出庫実行
				boolean result = autoIssue.AutoIssueOpr(autoIssueParam);

				String[] message;
				if(result){
					// 業務アラームがあれば出力する。
					for(int i=0; i<autoIssue.getWarnList().size(); i++){
						message = (String[])autoIssue.getWarnList().get(i);
						setWarningMessage(message[0], message[1]);
					}
				}else{
					// 業務エラーの出力
					for(int i=0; i<autoIssue.getErrorList().size(); i++){
						message = (String[])autoIssue.getErrorList().get(i);
						setErrorMessage(message[0], message[1]);
					}
					return;
				}
				
				if (this.headerStruct.geth_FINAL_PROC_FLG() != null 
						&& "1".equals(this.headerStruct.geth_FINAL_PROC_FLG())) {
					//入庫処理（保管区別入出庫追加）
					CollectNumber collectNum = 
							new CollectNumber(
								CollectNumber.ISSUE_CD,
								this.sysUSER_CD,
								this.sp.getProcId(),
								this.sysPLANT_CD);
					String no = collectNum.getNo();
					if (no == null || no.length() == 0) {
						//採番結果がない
						setErrorMessage("ZZ01106");
						setReadStatus(ERROR);
						return;
					}
					AD0040010Struct rcvIssueStruct = new AD0040010Struct();
					rcvIssueStruct.setRCV_ISSUE_CTRL_CD(no);
					rcvIssueStruct.setITEM_CD(this.headerStruct.getITEM_CD());
					rcvIssueStruct.setPLANT_CD(this.sysPLANT_CD);
					rcvIssueStruct.setPARTIAL_PRD_NO(this.rsltStruct.getPARTIAL_PRD_NO());
					rcvIssueStruct.setWH_CD(this.rsltStruct.getWH_CD());
					rcvIssueStruct.setJOB_ODR_CD(jobOdrNo);
					rcvIssueStruct.setWORK_ODR_CD(this.headerStruct.getWORK_ODR_CD());
					rcvIssueStruct.setWORK_IN_PROC_CD(this.headerStruct.getWORK_IN_PROC_CD());
					rcvIssueStruct.setRCV_ISSUE_QTY(inAcptQty.toString());
					rcvIssueStruct.setRCV_ISSUE_DATE(this.rsltStruct.getOPR_DATE());
					rcvIssueStruct.setRCV_ISSUE_GNR_TYP("11");
					rcvIssueStruct.setRCV_ISSUE_ODD_QTY("0.0");
					rcvIssueStruct.setOD_NO(this.headerStruct.getOD_NO());
					rcvIssueStruct.setVEND_LOT_NO(this.rsltStruct.getVEND_LOT_NO());
					rcvIssueStruct.setLOT_NO(this.rsltStruct.getLOT_NO());
					rcvIssueStruct.setUSER_CD(this.sysUSER_CD);
					rcvIssueStruct.setPRG_NM(this.sp.getProcId());
					rcvIssueStruct.setRCV_ISSUE_TYP("1");
					if (this.rsltStruct.getc_COMPLETE() != null 
							&& "true".equals(this.rsltStruct.getc_COMPLETE())) {
						rcvIssueStruct.setRCV_ISSUE_CMPLT_FLG("1");
					} else {
						rcvIssueStruct.setRCV_ISSUE_CMPLT_FLG("0");
					}
					rcvIssueStruct.setSTOCK_UPD_TYP("1");

					//作業実績訂正回数
					rcvIssueStruct.setOPR_RSLT_CRCT_NO(this.rsltStruct.getOPR_CRCT_NO());  

					// 退避用手持ち在庫数を初期化
					rcvIssueStruct.setSAVE_STOCK_ON_HAND_QTY("0");
                    //会社コード
					rcvIssueStruct.setCOMPANY_CD(_company_cd);
					//保管区別入出庫
					// Add Start 20140307 liuj
					rcvIssueStruct.setRCV_ISSUE_AFTER_QTY(rcvIssueStruct.getRCV_ISSUE_QTY());
					// Add End   20140307 liuj
					entity.mInsertRecvIssue.create(conn, rcvIssueStruct);

					//現品票用にデータ保管
					IdentCardStruct.setINS_RCV_ISSUE_CTRL_CD(no);//保管区別入出庫番号
					
					// 入庫処理呼び出し
					RcvCancel RCan = 
							new RcvCancel(
								conn,
								rcvIssueStruct.getRCV_ISSUE_CTRL_CD(),
								this.sysUSER_CD);
					boolean bRSLT = RCan.execProcess();
					if (!bRSLT) {
						//入庫処理失敗 サーバーエラー
						throw new Exception();
					}
					// Add Start 20140307 liuj
					// システムパラメータ：”不良在庫を工程管理する”が”ＯＮ”場合、
					if ("1".equals(this._defectManageFlg)){
						// ①更新前の不良品の入庫処理を取消する
						AD0040010Struct issueInstStruct = new AD0040010Struct();
						issueInstStruct.setINST_ITEM_CD(this.headerStruct.getITEM_CD());
						issueInstStruct.setINST_RCV_ISSUE_TYP("3");
						issueInstStruct.setINST_WORK_ODR_CD(this.headerStruct.getWORK_ODR_CD());
						issueInstStruct.setINST_WORK_IN_PROC_CD(this.headerStruct.getWORK_IN_PROC_CD());
						issueInstStruct.setINST_OPR_INST_CD(this.headerStruct.getOPR_INST_CD());
						issueInstStruct.setINST_PARTIAL_PRD_NO(this.rsltStruct.getPARTIAL_PRD_NO());
						issueInstStruct.setINST_RCV_ISSUE_GNR_TYP("11");
						if (_rsltExeType == 1){
							List rvcList = entity.mgetBASE_T_RCV_ISSUE.read(conn, issueInstStruct);
							if (!rvcList.isEmpty() && ((AD0040010Struct)rvcList.get(0)).getBASE_OPR_RSLT_CRCT_NO().equals("" + (crctNoCheck -1 )) ){
								AD0040010Struct rvcIssueStruct = (AD0040010Struct)rvcList.get(0);
								// 入庫取消処理（保管区別入出庫追加）
								collectNum = 
										new CollectNumber(
											CollectNumber.ISSUE_CD,
											this.sysUSER_CD,
											this.sp.getProcId(),
											this.sysPLANT_CD);
								no = collectNum.getNo();
								if (no == null || no.length() == 0) {
									//採番結果がない
									setErrorMessage("ZZ01106");
									setReadStatus(ERROR);
									return;
								}
								AD0040010Struct issueStruct1 = new AD0040010Struct();
								issueStruct1.setRCV_ISSUE_CTRL_CD(no);
								issueStruct1.setRCV_ISSUE_TYP("4");
								issueStruct1.setITEM_CD(rvcIssueStruct.getBASE_ITEM_CD());
								issueStruct1.setPLANT_CD(rvcIssueStruct.getBASE_PLANT_CD());
								issueStruct1.setWH_CD(rvcIssueStruct.getBASE_WH_CD());
								issueStruct1.setJOB_ODR_CD(rvcIssueStruct.getBASE_JOB_ODR_CD());
								issueStruct1.setJOB_ODR_DETAIL_NO(rvcIssueStruct.getBASE_JOB_ODR_DETAIL_NO());
								issueStruct1.setPUCH_ODR_CD(rvcIssueStruct.getBASE_PUCH_ODR_CD());
								issueStruct1.setACPT_NO(rvcIssueStruct.getBASE_ACPT_NO());
								issueStruct1.setACPT_RSLT_CRCT_NO(rvcIssueStruct.getBASE_ACPT_RSLT_CRCT_NO());
								issueStruct1.setINSPEC_RSLT_CRCT_NO(rvcIssueStruct.getBASE_INSPEC_RSLT_CRCT_NO());
								issueStruct1.setWORK_ODR_CD(rvcIssueStruct.getBASE_WORK_ODR_CD());
								issueStruct1.setWORK_IN_PROC_CD(rvcIssueStruct.getBASE_WORK_IN_PROC_CD());
								issueStruct1.setPARTIAL_PRD_NO(rvcIssueStruct.getBASE_PARTIAL_PRD_NO());
								issueStruct1.setOPR_RSLT_CRCT_NO(rvcIssueStruct.getBASE_OPR_RSLT_CRCT_NO());
								issueStruct1.setISSUE_INST_CD(rvcIssueStruct.getBASE_ISSUE_INST_CD());
								issueStruct1.setRCV_ISSUE_BEFORE_QTY("0");
								issueStruct1.setRCV_ISSUE_QTY(Calculate.multiply(rvcIssueStruct.getBASE_RCV_ISSUE_QTY(), "-1"));
								issueStruct1.setRCV_ISSUE_AFTER_QTY("0");
								issueStruct1.setRCV_ISSUE_AMOUNT("0.0");
								issueStruct1.setRCV_ISSUE_DATE(rvcIssueStruct.getBASE_OPR_DATE());
								issueStruct1.setRCV_ISSUE_GNR_TYP("19");
								issueStruct1.setRCV_ISSUE_ODD_QTY(rvcIssueStruct.getBASE_RCV_ISSUE_ODD_QTY());
								issueStruct1.setSTOCK_UPD_TYP("1");
								issueStruct1.setOD_NO(rvcIssueStruct.getBASE_OD_NO());
								issueStruct1.setLOT_NO(rvcIssueStruct.getBASE_LOT_NO());
								issueStruct1.setVEND_LOT_NO(rvcIssueStruct.getBASE_VEND_LOT_NO());
								issueStruct1.setRCV_ISSUE_COMMENT(rvcIssueStruct.getBASE_RCV_ISSUE_COMMENT());
								issueStruct1.setUSER_CD(this.sysUSER_CD);
								issueStruct1.setPRG_NM(this.sp.getProcId());
								issueStruct1.setRCV_ISSUE_CMPLT_FLG(rvcIssueStruct.getBASE_RCV_ISSUE_CMPLT_FLG());
								issueStruct1.setCOMPANY_CD(_company_cd);
								
								entity.mINSERT_RCV_ISSUE3.create(conn, issueStruct1);
								// 不良品出庫処理呼び出し
								IssueProcess IProc = new IssueProcess(conn, no);
								bRSLT = IProc.execDefectProcess();
								if (!bRSLT) {
									//出庫処理失敗 サーバーエラー
									throw new Exception();
								}
							}
						}
						
						if (Calculate.compare(inDefectQty.toString(), "0") != 0 &&
								(jobOdrNo == null || "".equals(jobOdrNo))){
							// ②不良品の入庫処理
							no = collectNum.getNo();
							if (no == null || no.length() == 0) {
								//採番結果がない
								setErrorMessage("ZZ01106");
								setReadStatus(ERROR);
								return;
							}
							rcvIssueStruct.setRCV_ISSUE_CTRL_CD(no);
							rcvIssueStruct.setISSUE_INST_CD(null);
							rcvIssueStruct.setRCV_ISSUE_QTY(inDefectQty.toString());
							rcvIssueStruct.setRCV_ISSUE_GNR_TYP("11");
							rcvIssueStruct.setRCV_ISSUE_ODD_QTY("0.0");
							rcvIssueStruct.setRCV_ISSUE_TYP("3");
							//保管区別入出庫
							rcvIssueStruct.setRCV_ISSUE_AFTER_QTY("0");
							entity.mInsertRecvIssue.create(conn, rcvIssueStruct);
							
							// 不良品出庫処理呼び出し
							IssueProcess IProc = new IssueProcess(conn, no);
							bRSLT = IProc.execDefectProcess();
							if (!bRSLT) {
								//出庫処理失敗 サーバーエラー
								throw new Exception();
							}
						}
					}
						
					// Add End 20140307 liuj

// ▼▼ 2008/08/12 ADD START -TSUCHIDA▼▼

					manhourTypStruct = null;
					List selelctRcvIssueList = new ArrayList();
					AD0040010Struct selectRcvIssueStruct = new AD0040010Struct();
					boolean bFlg = false;

					String strPuchOdrCd = null;		// 登録用発注番号
					String strWorkOdrCd = null;		// 登録用作業計画番号
					String strWorkInProcCd = null;	// 登録用仕掛作業コード

					manhourTypList = entity.mSelectItem.read(conn,this.headerStruct);

					if (!manhourTypList.isEmpty()) {
						manhourTypStruct = (AD0040010Struct)manhourTypList.get(0);
					}

					// [品目].工数管理品目区分 = 1:工数管理品目の場合
					if (manhourTypStruct.getMANHOUR_TYP() != null
							&& "1".equals(manhourTypStruct.getMANHOUR_TYP())){

						collectNum = 
							new CollectNumber(
								CollectNumber.ISSUE_CD,
								this.sysUSER_CD,
								this.sp.getProcId(),
								this.sysPLANT_CD);
						no = collectNum.getNo();
						if (no == null || no.length() == 0) {
							//採番結果がない
							setErrorMessage("ZZ01106");
							setReadStatus(ERROR);
							return;
						}

						// 親品目の初工程に出庫するためのデータ設定
						parentList = entity.mSELECT_PARENT.read(conn,this.headerStruct);
						if ( !parentList.isEmpty()) {
							parentStruct = (AD0040010Struct)parentList.get(0);
							// 親品目が擬似品目の場合、さらに上の品目のオーダデマンド番号を取得する
							if ( "8".equals(parentStruct.getPARENT_MRP_ODR_TYP())){
								parentList = new ArrayList();
								parentList = entity.mSELECT_DUMMY_PARENT.read(conn,parentStruct);
								if ( !parentList.isEmpty()){
									parentStruct = null;
									parentStruct = (AD0040010Struct)parentList.get(0);
								}
							}

							if ( !parentList.isEmpty()){
								// 親品目が内作の場合
								if ( "1".equals(parentStruct.getPARENT_OUTSIDE_TYP())){
									tWorkInProcByProcList = entity.mSELECT_T_WORK_IN_PROC_BY_PROC.read(conn,parentStruct);
									if ( !tWorkInProcByProcList.isEmpty()){
										tWorkInProcByProcStruct = (AD0040010Struct)tWorkInProcByProcList.get(0);
										// 作業計画番号設定
										strWorkOdrCd = tWorkInProcByProcStruct.getPARENT_WORK_ODR_CD();

										// 作業指示番号設定
										strWorkInProcCd = tWorkInProcByProcStruct.getPARENT_WORK_IN_PROC_CD();
									}
								}
								// 親品目が外作の場合
								if ( "2".equals(parentStruct.getPARENT_OUTSIDE_TYP())){
									tRlsdPuchOdrList = entity.mSELECT_T_RLSD_PUCH_ODR.read(conn,parentStruct);
									if ( !tRlsdPuchOdrList.isEmpty()){
										tRlsdPuchOdrStruct = (AD0040010Struct)tRlsdPuchOdrList.get(0);
										// 発注番号設定
										strPuchOdrCd = tRlsdPuchOdrStruct.getPARENT_PUCH_ODR_CD();
									}
								}
							}
						}

					// 入出庫数をマイナスにする
						BigDecimal minusOne = new BigDecimal("-1");
						inAcptQty = inAcptQty.multiply(minusOne);

						AD0040010Struct outIssueStruct = new AD0040010Struct();
						outIssueStruct.setPUCH_ODR_CD(strPuchOdrCd);
						outIssueStruct.setWORK_ODR_CD(strWorkOdrCd);
						outIssueStruct.setWORK_IN_PROC_CD(strWorkInProcCd);
						outIssueStruct.setRCV_ISSUE_CTRL_CD(no);
						outIssueStruct.setITEM_CD(this.headerStruct.getITEM_CD());
						outIssueStruct.setPLANT_CD(this.sysPLANT_CD);
						outIssueStruct.setPARTIAL_PRD_NO(this.rsltStruct.getPARTIAL_PRD_NO());
						outIssueStruct.setWH_CD(this.rsltStruct.getWH_CD());
						outIssueStruct.setJOB_ODR_CD(jobOdrNo);
						outIssueStruct.setRCV_ISSUE_QTY(inAcptQty.toString());
						outIssueStruct.setRCV_ISSUE_DATE(this.rsltStruct.getOPR_DATE());
						outIssueStruct.setRCV_ISSUE_GNR_TYP("21");
						outIssueStruct.setRCV_ISSUE_ODD_QTY("0.0");
						outIssueStruct.setOD_NO(this.headerStruct.getOD_NO());
						outIssueStruct.setVEND_LOT_NO(this.rsltStruct.getVEND_LOT_NO());
						outIssueStruct.setLOT_NO(this.rsltStruct.getLOT_NO());
						outIssueStruct.setUSER_CD(this.sysUSER_CD);
						outIssueStruct.setPRG_NM(this.sp.getProcId());
						outIssueStruct.setRCV_ISSUE_TYP("2");
						if (this.rsltStruct.getc_COMPLETE() != null 
								&& "true".equals(this.rsltStruct.getc_COMPLETE())) {
							outIssueStruct.setRCV_ISSUE_CMPLT_FLG("1");
						} else {
							outIssueStruct.setRCV_ISSUE_CMPLT_FLG("0");
						}
						outIssueStruct.setSTOCK_UPD_TYP("1");

						//作業実績訂正回数
						outIssueStruct.setOPR_RSLT_CRCT_NO(this.rsltStruct.getOPR_CRCT_NO());  

						// 退避用手持ち在庫数を初期化
						outIssueStruct.setSAVE_STOCK_ON_HAND_QTY("0");
                        //会社コード
						outIssueStruct.setCOMPANY_CD(_company_cd);
						//保管区別入出庫
						entity.mINSERT_RCV_ISSUE2.create(conn, outIssueStruct);

				/* 出庫取消処理START */
						/* [T_RCV_ISSUE]読込 */
						selelctRcvIssueList = entity.mSELECT_CHECK_T_RCV_ISSUE.read(conn,outIssueStruct);
						if (selelctRcvIssueList.isEmpty()) {
							bFlg = true;
							bRSLT = false;
						}else{
							selectRcvIssueStruct = (AD0040010Struct)selelctRcvIssueList.get(0);
						}

						/* エラーチェック */
						// 入出庫区分が"2"(出庫)でない
						if(selectRcvIssueStruct.getRCV_ISSUE_TYP()!=null
								&& !selectRcvIssueStruct.getRCV_ISSUE_TYP().equals("2")){
							bFlg = true;
							bRSLT = false;
						}

						// 入出庫発生区分が"21"(通常出庫)でない
						if(!bFlg
							&& selectRcvIssueStruct.getRCV_ISSUE_GNR_TYP()!=null 
							&& !selectRcvIssueStruct.getRCV_ISSUE_GNR_TYP().equals("21")){
							bFlg = true;
							bRSLT = false;
						}

						// 出庫処理呼び出し
						if(!bFlg){
							IssueProcess IProc = new IssueProcess(conn,selectRcvIssueStruct.getRCV_ISSUE_CTRL_CD());
							bRSLT = IProc.execProcess();
							if( !bRSLT ){
								bFlg = true;
								bRSLT = false;
							}
						}

						// 出庫取消処理
						// 前回出庫実績の検索
						if(!bFlg){
							// [保管区別入出庫]."作業実績訂正回数"が1以上の時
							// ＊出庫を取消す場合は必ず1以上である
							if( selectRcvIssueStruct.getOPR_RSLT_CRCT_NO()!=null
									&& selectRcvIssueStruct.getOPR_RSLT_CRCT_NO().compareTo("1")>=0){

								selelctRcvIssueList = new ArrayList();
								selelctRcvIssueList = entity.mSELECT_T_RCV_ISSUE.read(conn,selectRcvIssueStruct);
								if (selelctRcvIssueList.isEmpty()) {
									bFlg = true;
									bRSLT = false;
								}else{
									selectRcvIssueStruct = new AD0040010Struct();
									selectRcvIssueStruct = (AD0040010Struct)selelctRcvIssueList.get(0);
								}
							}else{
								bFlg = true;
							}
						}

						if(!bFlg){
							//保管区別入出庫への追加
							BigDecimal bQty = new BigDecimal(selectRcvIssueStruct.getRCV_ISSUE_QTY());
							selectRcvIssueStruct.setRCV_ISSUE_QTY(bQty.negate().toString());

							collectNum = 
								new CollectNumber(
									CollectNumber.ISSUE_CD,
									this.sysUSER_CD,
									this.sp.getProcId(),
									this.sysPLANT_CD);
							no = collectNum.getNo();

							selectRcvIssueStruct.setRCV_ISSUE_CTRL_CD(no);		//採番したｷｰをｾｯﾄ
							selectRcvIssueStruct.setUSER_CD(this.sysUSER_CD);
							selectRcvIssueStruct.setPRG_NM(this.sp.getProcId());
							if (this.rsltStruct.getc_COMPLETE() != null 
									&& "true".equals(this.rsltStruct.getc_COMPLETE())) {
								selectRcvIssueStruct.setRCV_ISSUE_CMPLT_FLG("1");
							} else {
								selectRcvIssueStruct.setRCV_ISSUE_CMPLT_FLG("0");
							}
							selectRcvIssueStruct.setCOMPANY_CD(_company_cd);
							entity.mINSERT_T_RCV_ISSUE.create(conn,selectRcvIssueStruct);

							// 出庫取消処理呼び出し
							IssueProcess IProc = new IssueProcess(conn,selectRcvIssueStruct.getRCV_ISSUE_CTRL_CD());
							bRSLT = IProc.execProcess();
						}

						if (!bRSLT) {
							//出庫処理失敗 サーバーエラー
							throw new Exception();
						}
						
					}
				/* 出庫取消処理END */
// ▲▲ 2008/08/12 ADD END -TSUCHIDA▲▲
				}
				// Add Start 20140214 liuj
				// システムパラメータ：　”工程保管場所の在庫を管理する”が”ＯＮ”、且つ最終系列以外の場合
				else if ("1".equals(this._processManageFlg)){
					List instList = entity.mselectT_ISSUE_INST.read(conn, this.rsltStruct);
					if (!instList.isEmpty()){
						AD0040010Struct issueInstStruct;
						AD0040010Struct rvcIssueStruct;
						AD0040010Struct issueStruct1 = null;
						boolean bRSLT;
						String acptQty = "";      	// 更新使用数量（良品数）
						String defectQty = "";		// 更新使用数量（不良数）
						String jobOdrCd = "";       // 製番
						String strQty = "";
						boolean isExist = false;
						List nextQtyList = entity.mgetNext_Qty.read(conn, rsltStruct);
						if (!nextQtyList.isEmpty()){
							strQty = ((AD0040010Struct)nextQtyList.get(0)).getSUM_QTY();
							if (!"".equals(strQty) && strQty != null){
								if (Calculate.compare(strQty, "0") > 0){
									isExist = true;
								}
							}
						}
						for (int i = 0; i < instList.size(); i++){
							issueInstStruct = (AD0040010Struct)instList.get(i);
							// 子品目の製番を取得する
							List odList = entity.mget_JOB_ODR_CD.read(conn, issueInstStruct);
							if (!odList.isEmpty()){
								jobOdrCd = ((AD0040010Struct)odList.get(0)).getJOB_ODR_CD();
							}
							
							// 整数管理
							if ("1".equals(issueInstStruct.getINST_UNIT_QTY_TYP())){
								// 更新使用数量（良品数）
								acptQty = Calculate.divide(
										Calculate.multiply(rsltStruct.getACPT_QTY(), 
												issueInstStruct.getINST_ISSUE_INST_UNIT_NUMERATOR()),
										issueInstStruct.getINST_ISSUE_INST_UNIT_DENOMINATOR(), 
										Calculate.CEIL);
								acptQty = Calculate.ceil(acptQty, 0);
								// 更新使用数量（不良数）
								defectQty = Calculate.divide(
										Calculate.multiply(rsltStruct.getDEFECT_QTY(), 
												issueInstStruct.getINST_ISSUE_INST_UNIT_NUMERATOR()),
										issueInstStruct.getINST_ISSUE_INST_UNIT_DENOMINATOR(), 
										Calculate.CEIL);
								defectQty = Calculate.ceil(defectQty, 0);
							} else {
								// 更新使用数量（良品数）
								acptQty = Calculate.divide(
										Calculate.multiply(rsltStruct.getACPT_QTY(), 
												issueInstStruct.getINST_ISSUE_INST_UNIT_NUMERATOR()),
										issueInstStruct.getINST_ISSUE_INST_UNIT_DENOMINATOR(), 
										4,
										Calculate.CEIL);
								// 更新使用数量（不良数）
								defectQty = Calculate.divide(
										Calculate.multiply(rsltStruct.getDEFECT_QTY(), 
												issueInstStruct.getINST_ISSUE_INST_UNIT_NUMERATOR()),
										issueInstStruct.getINST_ISSUE_INST_UNIT_DENOMINATOR(), 
										4,
										Calculate.CEIL);
							}
							
							
							// ① 更新前データにより、該当工程の工程保管場所からの入庫取消を取消する
							issueInstStruct.setINST_RCV_ISSUE_TYP("1");
							issueInstStruct.setINST_OPR_INST_CD(this.struct.getOPR_INST_CD());
							issueInstStruct.setINST_PARTIAL_PRD_NO(this.struct.getPARTIAL_PRD_NO());
							if (_rsltExeType == 1){
								issueInstStruct.setINST_RCV_ISSUE_GNR_TYP("61");
								List rvcList = entity.mgetBASE_T_RCV_ISSUE.read(conn, issueInstStruct);
								for (int n = 0; n< rvcList.size(); n++){
									rvcIssueStruct = (AD0040010Struct)rvcList.get(n);
									if(rvcIssueStruct.getBASE_OPR_RSLT_CRCT_NO().equals("" + (crctNoCheck -1 ))){
										// 入庫取消処理（保管区別入出庫追加）
										CollectNumber collectNum = 
												new CollectNumber(
													CollectNumber.ISSUE_CD,
													this.sysUSER_CD,
													this.sp.getProcId(),
													this.sysPLANT_CD);
										String no = collectNum.getNo();
										if (no == null || no.length() == 0) {
											//採番結果がない
											setErrorMessage("ZZ01106");
											setReadStatus(ERROR);
											return;
										}
										issueStruct1 = new AD0040010Struct();
										issueStruct1.setRCV_ISSUE_CTRL_CD(no);
										issueStruct1.setRCV_ISSUE_TYP("2");
										issueStruct1.setITEM_CD(rvcIssueStruct.getBASE_ITEM_CD());
										issueStruct1.setPLANT_CD(rvcIssueStruct.getBASE_PLANT_CD());
										issueStruct1.setWH_CD(rvcIssueStruct.getBASE_WH_CD());
										issueStruct1.setJOB_ODR_CD(rvcIssueStruct.getBASE_JOB_ODR_CD());
										issueStruct1.setJOB_ODR_DETAIL_NO(rvcIssueStruct.getBASE_JOB_ODR_DETAIL_NO());
										issueStruct1.setPUCH_ODR_CD(rvcIssueStruct.getBASE_PUCH_ODR_CD());
										issueStruct1.setACPT_NO(rvcIssueStruct.getBASE_ACPT_NO());
										issueStruct1.setACPT_RSLT_CRCT_NO(rvcIssueStruct.getBASE_ACPT_RSLT_CRCT_NO());
										issueStruct1.setINSPEC_RSLT_CRCT_NO(rvcIssueStruct.getBASE_INSPEC_RSLT_CRCT_NO());
										issueStruct1.setWORK_ODR_CD(rvcIssueStruct.getBASE_WORK_ODR_CD());
										issueStruct1.setWORK_IN_PROC_CD(rvcIssueStruct.getBASE_WORK_IN_PROC_CD());
										issueStruct1.setPARTIAL_PRD_NO(rvcIssueStruct.getBASE_PARTIAL_PRD_NO());
										issueStruct1.setOPR_RSLT_CRCT_NO(rvcIssueStruct.getBASE_OPR_RSLT_CRCT_NO());
										issueStruct1.setISSUE_INST_CD(rvcIssueStruct.getBASE_ISSUE_INST_CD());
										issueStruct1.setRCV_ISSUE_BEFORE_QTY("0");
										issueStruct1.setRCV_ISSUE_QTY(Calculate.multiply(rvcIssueStruct.getBASE_RCV_ISSUE_QTY(), "-1"));
										issueStruct1.setRCV_ISSUE_AFTER_QTY("0");
										issueStruct1.setRCV_ISSUE_AMOUNT("0.0");
										issueStruct1.setRCV_ISSUE_DATE(rvcIssueStruct.getBASE_OPR_DATE());
										issueStruct1.setRCV_ISSUE_GNR_TYP("69");
										issueStruct1.setRCV_ISSUE_ODD_QTY(rvcIssueStruct.getBASE_RCV_ISSUE_ODD_QTY());
										issueStruct1.setSTOCK_UPD_TYP("1");
										issueStruct1.setOD_NO(rvcIssueStruct.getBASE_OD_NO());
										issueStruct1.setLOT_NO(rvcIssueStruct.getBASE_LOT_NO());
										issueStruct1.setVEND_LOT_NO(rvcIssueStruct.getBASE_VEND_LOT_NO());
										issueStruct1.setRCV_ISSUE_COMMENT(rvcIssueStruct.getBASE_RCV_ISSUE_COMMENT());
										issueStruct1.setUSER_CD(this.sysUSER_CD);
										issueStruct1.setPRG_NM(this.sp.getProcId());
										issueStruct1.setRCV_ISSUE_CMPLT_FLG(rvcIssueStruct.getBASE_RCV_ISSUE_CMPLT_FLG());
										issueStruct1.setCOMPANY_CD(_company_cd);
										
										entity.mINSERT_RCV_ISSUE3.create(conn, issueStruct1);
										// 良品出庫処理呼び出し
										IssueProcess IProc = new IssueProcess(conn, no);
										bRSLT = IProc.execAcptProcess();
										if (!bRSLT) {
											//出庫処理失敗 サーバーエラー
											throw new Exception();
										}
									}
								}
								// ② 更新前データにより、該当工程の工程保管場所からの出庫処理を取消する
								issueInstStruct.setINST_RCV_ISSUE_TYP("2");
								issueInstStruct.setINST_RCV_ISSUE_GNR_TYP("41");
								rvcList = entity.mgetBASE_T_RCV_ISSUE.read(conn, issueInstStruct);
								for (int n = 0; n< rvcList.size(); n++){
									rvcIssueStruct = (AD0040010Struct)rvcList.get(n);
									if(rvcIssueStruct.getBASE_OPR_RSLT_CRCT_NO().equals("" + (crctNoCheck -1 ))){
										// 入庫取消処理（保管区別入出庫追加）
										CollectNumber collectNum = 
												new CollectNumber(
													CollectNumber.ISSUE_CD,
													this.sysUSER_CD,
													this.sp.getProcId(),
													this.sysPLANT_CD);
										String no = collectNum.getNo();
										if (no == null || no.length() == 0) {
											//採番結果がない
											setErrorMessage("ZZ01106");
											setReadStatus(ERROR);
											return;
										}
										issueStruct1 = new AD0040010Struct();			
										issueStruct1.setRCV_ISSUE_CTRL_CD(no);
										issueStruct1.setRCV_ISSUE_TYP("1");
										issueStruct1.setITEM_CD(rvcIssueStruct.getBASE_ITEM_CD());
										issueStruct1.setPLANT_CD(rvcIssueStruct.getBASE_PLANT_CD());
										issueStruct1.setWH_CD(rvcIssueStruct.getBASE_WH_CD());
										issueStruct1.setJOB_ODR_CD(rvcIssueStruct.getBASE_JOB_ODR_CD());
										issueStruct1.setJOB_ODR_DETAIL_NO(rvcIssueStruct.getBASE_JOB_ODR_DETAIL_NO());
										issueStruct1.setPUCH_ODR_CD(rvcIssueStruct.getBASE_PUCH_ODR_CD());
										issueStruct1.setACPT_NO(rvcIssueStruct.getBASE_ACPT_NO());
										issueStruct1.setACPT_RSLT_CRCT_NO(rvcIssueStruct.getBASE_ACPT_RSLT_CRCT_NO());
										issueStruct1.setINSPEC_RSLT_CRCT_NO(rvcIssueStruct.getBASE_INSPEC_RSLT_CRCT_NO());
										issueStruct1.setWORK_ODR_CD(rvcIssueStruct.getBASE_WORK_ODR_CD());
										issueStruct1.setWORK_IN_PROC_CD(rvcIssueStruct.getBASE_WORK_IN_PROC_CD());
										issueStruct1.setPARTIAL_PRD_NO(rvcIssueStruct.getBASE_PARTIAL_PRD_NO());
										issueStruct1.setOPR_RSLT_CRCT_NO(rvcIssueStruct.getBASE_OPR_RSLT_CRCT_NO());
										issueStruct1.setISSUE_INST_CD(rvcIssueStruct.getBASE_ISSUE_INST_CD());
										issueStruct1.setRCV_ISSUE_BEFORE_QTY("0");
										issueStruct1.setRCV_ISSUE_QTY(Calculate.multiply(rvcIssueStruct.getBASE_RCV_ISSUE_QTY(), "-1"));
										issueStruct1.setRCV_ISSUE_AFTER_QTY("0");
										issueStruct1.setRCV_ISSUE_AMOUNT("0.0");
										issueStruct1.setRCV_ISSUE_DATE(rvcIssueStruct.getBASE_OPR_DATE());
										issueStruct1.setRCV_ISSUE_GNR_TYP("49");
										issueStruct1.setRCV_ISSUE_ODD_QTY(rvcIssueStruct.getBASE_RCV_ISSUE_ODD_QTY());
										issueStruct1.setSTOCK_UPD_TYP("1");
										issueStruct1.setOD_NO(rvcIssueStruct.getBASE_OD_NO());
										issueStruct1.setLOT_NO(rvcIssueStruct.getBASE_LOT_NO());
										issueStruct1.setVEND_LOT_NO(rvcIssueStruct.getBASE_VEND_LOT_NO());
										issueStruct1.setRCV_ISSUE_COMMENT(rvcIssueStruct.getBASE_RCV_ISSUE_COMMENT());
										issueStruct1.setUSER_CD(this.sysUSER_CD);
										issueStruct1.setPRG_NM(this.sp.getProcId());
										issueStruct1.setRCV_ISSUE_CMPLT_FLG(rvcIssueStruct.getBASE_RCV_ISSUE_CMPLT_FLG());
										issueStruct1.setCOMPANY_CD(_company_cd);
										entity.mINSERT_RCV_ISSUE3.create(conn, issueStruct1);
										// 良品出庫処理呼び出し
										IssueProcess IProc = new IssueProcess(conn, no);
										bRSLT = IProc.execAcptProcess();
										if (!bRSLT) {
											//出庫処理失敗 サーバーエラー
											throw new Exception();
										}
									}
									
								}
								
								// ③ システムパラメータ：”不良在庫を工程管理する”が”ＯＮ”場合、更新前の不良品の入庫処理を取消する
								if ("1".equals(this._defectManageFlg)){
									issueInstStruct.setINST_RCV_ISSUE_TYP("3");
									issueInstStruct.setINST_RCV_ISSUE_GNR_TYP("61");
									rvcList = entity.mgetBASE_T_RCV_ISSUE.read(conn, issueInstStruct);
									for (int n = 0; n< rvcList.size(); n++){
										rvcIssueStruct = (AD0040010Struct)rvcList.get(n);
										if(rvcIssueStruct.getBASE_OPR_RSLT_CRCT_NO().equals("" + (crctNoCheck -1 ))){
											// 入庫取消処理（保管区別入出庫追加）
											CollectNumber collectNum = 
													new CollectNumber(
														CollectNumber.ISSUE_CD,
														this.sysUSER_CD,
														this.sp.getProcId(),
														this.sysPLANT_CD);
											String no = collectNum.getNo();
											if (no == null || no.length() == 0) {
												//採番結果がない
												setErrorMessage("ZZ01106");
												setReadStatus(ERROR);
												return;
											}
											issueStruct1 = new AD0040010Struct();
											issueStruct1.setRCV_ISSUE_CTRL_CD(no);
											issueStruct1.setRCV_ISSUE_TYP("4");
											issueStruct1.setITEM_CD(rvcIssueStruct.getBASE_ITEM_CD());
											issueStruct1.setPLANT_CD(rvcIssueStruct.getBASE_PLANT_CD());
											issueStruct1.setWH_CD(rvcIssueStruct.getBASE_WH_CD());
											issueStruct1.setJOB_ODR_CD(rvcIssueStruct.getBASE_JOB_ODR_CD());
											issueStruct1.setJOB_ODR_DETAIL_NO(rvcIssueStruct.getBASE_JOB_ODR_DETAIL_NO());
											issueStruct1.setPUCH_ODR_CD(rvcIssueStruct.getBASE_PUCH_ODR_CD());
											issueStruct1.setACPT_NO(rvcIssueStruct.getBASE_ACPT_NO());
											issueStruct1.setACPT_RSLT_CRCT_NO(rvcIssueStruct.getBASE_ACPT_RSLT_CRCT_NO());
											issueStruct1.setINSPEC_RSLT_CRCT_NO(rvcIssueStruct.getBASE_INSPEC_RSLT_CRCT_NO());
											issueStruct1.setWORK_ODR_CD(rvcIssueStruct.getBASE_WORK_ODR_CD());
											issueStruct1.setWORK_IN_PROC_CD(rvcIssueStruct.getBASE_WORK_IN_PROC_CD());
											issueStruct1.setPARTIAL_PRD_NO(rvcIssueStruct.getBASE_PARTIAL_PRD_NO());
											issueStruct1.setOPR_RSLT_CRCT_NO(rvcIssueStruct.getBASE_OPR_RSLT_CRCT_NO());
											issueStruct1.setISSUE_INST_CD(rvcIssueStruct.getBASE_ISSUE_INST_CD());
											issueStruct1.setRCV_ISSUE_BEFORE_QTY("0");
											issueStruct1.setRCV_ISSUE_QTY(Calculate.multiply(rvcIssueStruct.getBASE_RCV_ISSUE_QTY(), "-1"));
											issueStruct1.setRCV_ISSUE_AFTER_QTY("0");
											issueStruct1.setRCV_ISSUE_AMOUNT("0.0");
											issueStruct1.setRCV_ISSUE_DATE(rvcIssueStruct.getBASE_OPR_DATE());
											issueStruct1.setRCV_ISSUE_GNR_TYP("69");
											issueStruct1.setRCV_ISSUE_ODD_QTY(rvcIssueStruct.getBASE_RCV_ISSUE_ODD_QTY());
											issueStruct1.setSTOCK_UPD_TYP("1");
											issueStruct1.setOD_NO(rvcIssueStruct.getBASE_OD_NO());
											issueStruct1.setLOT_NO(rvcIssueStruct.getBASE_LOT_NO());
											issueStruct1.setVEND_LOT_NO(rvcIssueStruct.getBASE_VEND_LOT_NO());
											issueStruct1.setRCV_ISSUE_COMMENT(rvcIssueStruct.getBASE_RCV_ISSUE_COMMENT());
											issueStruct1.setUSER_CD(this.sysUSER_CD);
											issueStruct1.setPRG_NM(this.sp.getProcId());
											issueStruct1.setRCV_ISSUE_CMPLT_FLG(rvcIssueStruct.getBASE_RCV_ISSUE_CMPLT_FLG());
											issueStruct1.setCOMPANY_CD(_company_cd);
											
											entity.mINSERT_RCV_ISSUE3.create(conn, issueStruct1);
											// 不良品出庫処理呼び出し
											IssueProcess IProc = new IssueProcess(conn, no);
											bRSLT = IProc.execDefectProcess();
											if (!bRSLT) {
												//出庫処理失敗 サーバーエラー
												throw new Exception();
											}
										}
										
									}
								}
							}
							
							// 「子品目番号」の[品目].”ロット管理フラグ” ＝ 1：ロット管理を行う以外場合
							if (!"1".equals(issueInstStruct.getINST_LOT_CTRL_FLG())){
								// ④ [保管区別入出庫]の追加（出庫）
								CollectNumber collectNum = 
										new CollectNumber(
											CollectNumber.ISSUE_CD,
											this.sysUSER_CD,
											this.sp.getProcId(),
											this.sysPLANT_CD);
								String no = collectNum.getNo();
								if (no == null || no.length() == 0) {
									//採番結果がない
									setErrorMessage("ZZ01106");
									setReadStatus(ERROR);
									return;
								}
								issueStruct1 = new AD0040010Struct();
								issueStruct1.setRCV_ISSUE_CTRL_CD(no);
								issueStruct1.setRCV_ISSUE_TYP("2");
								issueStruct1.setITEM_CD(issueInstStruct.getINST_ITEM_CD());
								issueStruct1.setPLANT_CD(this.sysPLANT_CD);
								// 保管区コード
								if (chkBeforeProc(rsltStruct.getOPR_INST_CD())){
									issueStruct1.setWH_CD(getBeforeProc(rsltStruct.getOPR_INST_CD()));
								} else {
									issueStruct1.setWH_CD(issueInstStruct.getINST_WH_CD());
								}
								
								if (issueStruct1.getWH_CD() == null 
										|| "".equals(issueStruct1.getWH_CD())) {
									setErrorMessage("AD20060");
									setReadStatus(ERROR);
									return;
								}

								//保管区コードチェック
								List whList = entity.mSelectChkWhCd.read(conn, issueStruct1);
								if(whList == null || whList.size() == 0){
				  					setErrorMessage("AD00020");
				  					setReadStatus(ERROR);
									return;
								}

								AD0040010Struct whStruct = (AD0040010Struct)whList.get(0);
								//保管区コードの工場コードと作業系列別仕掛の工場コードの同一チェック
								if (whStruct.getPLANT_CD() == null 
										|| !whStruct.getPLANT_CD().equals(this.headerStruct.getPLANT_CD())) {
									setErrorMessage("AD00021");
									setReadStatus(ERROR);
									return;
								}
								issueStruct1.setJOB_ODR_CD(jobOdrCd);
								issueStruct1.setPUCH_ODR_CD(null);
								issueStruct1.setWORK_ODR_CD(issueInstStruct.getINST_WORK_ODR_CD());
								issueStruct1.setWORK_IN_PROC_CD(issueInstStruct.getINST_WORK_IN_PROC_CD());
								issueStruct1.setPARTIAL_PRD_NO(this.rsltStruct.getPARTIAL_PRD_NO());
								// 作業実績訂正回数
								issueStruct1.setOPR_RSLT_CRCT_NO(this.rsltStruct.getOPR_CRCT_NO());
								issueStruct1.seth_ISSUE_INST_CD(issueInstStruct.getINST_ISSUE_INST_CD());
								issueStruct1.setSAVE_STOCK_ON_HAND_QTY("0");	
								issueStruct1.setRCV_ISSUE_QTY(Calculate.multiply(Calculate.add(acptQty, defectQty), "-1"));
								issueStruct1.setRCV_ISSUE_DATE(this.rsltStruct.getOPR_DATE());
								issueStruct1.setRCV_ISSUE_GNR_TYP("41");
								issueStruct1.setRCV_ISSUE_ODD_QTY("0.0");
								issueStruct1.setSTOCK_UPD_TYP("1");
								issueStruct1.setOD_NO(issueInstStruct.getINST_OD_NO());
								issueStruct1.setLOT_NO(null);
								issueStruct1.setVEND_LOT_NO(null);
								issueStruct1.setRCV_ISSUE_COMMENT(null);
								issueStruct1.setUSER_CD(this.sysUSER_CD);
								issueStruct1.setPRG_NM(this.sp.getProcId());
								
								if (this.rsltStruct.getc_COMPLETE() != null 
										&& "true".equals(this.rsltStruct.getc_COMPLETE())) {
									issueStruct1.setRCV_ISSUE_CMPLT_FLG("1");
								} else {
									issueStruct1.setRCV_ISSUE_CMPLT_FLG("0");
								}
		                        //会社コード
								issueStruct1.setCOMPANY_CD(_company_cd);
								//保管区別入出庫
								entity.mINSERT_RCV_ISSUE2.create(conn, issueStruct1);
								
								// 良品出庫処理呼び出し
								IssueProcess IProc = new IssueProcess(conn, no);
								bRSLT = IProc.execAcptProcess();
								if (!bRSLT) {
									//出庫処理失敗 サーバーエラー
									throw new Exception();
								}
								
								// ⑤ [保管区別入出庫]の追加（入庫）
								no = collectNum.getNo();
								if (no == null || no.length() == 0) {
									//採番結果がない
									setErrorMessage("ZZ01106");
									setReadStatus(ERROR);
									return;
								}
								issueStruct1.setRCV_ISSUE_CTRL_CD(no);
								issueStruct1.seth_ISSUE_INST_CD(null);
								issueStruct1.setWH_CD(this.rsltStruct.getWH_CD());
								issueStruct1.setRCV_ISSUE_TYP("1");
								issueStruct1.setRCV_ISSUE_GNR_TYP("61");
								issueStruct1.setRCV_ISSUE_QTY(acptQty);
								issueStruct1.setSAVE_STOCK_ON_HAND_QTY("0");
								// 保管区別入出庫
								
								entity.mINSERT_RCV_ISSUE2.create(conn, issueStruct1);
								IProc = new IssueProcess(conn, no);
								bRSLT = IProc.execAcptProcess();
								if (!bRSLT) {
									//出庫処理失敗 サーバーエラー
									throw new Exception();
								}
								
								// 登録処理にシステムパラメータ：”不良在庫を工程管理する”が”ＯＮ”且つ、「不良数」＜＞０場合
								if ("1".equals(this._defectManageFlg) && Calculate.compare(defectQty, "0") != 0 &&
										(jobOdrCd == null || "".equals(jobOdrCd))){
									no = collectNum.getNo();
									if (no == null || no.length() == 0) {
										//採番結果がない
										setErrorMessage("ZZ01106");
										setReadStatus(ERROR);
										return;
									}
									issueStruct1.setRCV_ISSUE_CTRL_CD(no);
									issueStruct1.setRCV_ISSUE_TYP("3");
									issueStruct1.setRCV_ISSUE_GNR_TYP("61");
									issueStruct1.setSAVE_STOCK_ON_HAND_QTY("0");
									issueStruct1.setRCV_ISSUE_QTY(defectQty);
									// 保管区別入出庫
									entity.mINSERT_RCV_ISSUE2.create(conn, issueStruct1);
									IProc = new IssueProcess(conn, no);
									bRSLT = IProc.execDefectProcess();
									if (!bRSLT) {
										//出庫処理失敗 サーバーエラー
										throw new Exception();
									}
								}
							} else {
								// 「子品目番号」の[品目].”ロット管理フラグ” ＝ 1：ロット管理を行う場合
								issueInstStruct.seth_ISSUE_INST_CD(issueInstStruct.getINST_ISSUE_INST_CD());
								issueInstStruct.setITEM_CD(issueInstStruct.getINST_ITEM_CD());
								issueInstStruct.setWORK_ODR_CD(issueInstStruct.getINST_WORK_ODR_CD());
								// 出庫実績明細取得
								List lotIssueList = entity.mT_LOT_ISSUE_INST.read(conn, issueInstStruct);

								// データがない場合
								if (lotIssueList == null || lotIssueList.size() == 0) {
									setErrorMessage("AD20135");
									setSupportMessage("T_ISSUE_INST.ITEM_CD", issueInstStruct.getITEM_CD());
									setWarningSysLogMessage("T_LOT_ISSUE_INST.ISSUE_INST_CD",
											issueInstStruct.geth_ISSUE_INST_CD());// 出庫指示番号
									setWarningSysLogMessage("T_LOT_ISSUE_INST.ITEM_CD", issueInstStruct.getITEM_CD());// 品目番号
									setWarningSysLogMessage("T_LOT_ISSUE_INST.WORK_ODR_CD", issueInstStruct.getWORK_ODR_CD());
									// 作業計画番号
									return;
								}

								// 出庫 使用残数設定
								BigDecimal remainQty = new BigDecimal(Calculate.add(acptQty, defectQty));
								String lestQty[] = new String[lotIssueList.size()];
								String useQty[] = new String[lotIssueList.size()];
								issueStruct1 = new AD0040010Struct();
								for (int j = 0; j < lotIssueList.size(); j++) {
									if (remainQty.intValue() <= 0){
										break;
									}
									AD0040010Struct lotIssueStruct = (AD0040010Struct) lotIssueList.get(j);
									// 引き当て可能数設定
									BigDecimal issueQty = new BigDecimal(lotIssueStruct.getISSUE_QTY());
									BigDecimal spentQty = new BigDecimal(lotIssueStruct.getSPENT_QTY());
									BigDecimal availQty = issueQty.subtract(spentQty);
									BigDecimal useLotQty = null;

									// 引き当て可能数 >= 使用残数の場合
									if (availQty.doubleValue() >= remainQty.doubleValue()) {
										// 使用残数を引き当て数に設定
										useLotQty = remainQty;
										// 引き当て可能数 < 使用残数の場合
									} else {
										// 最終データの場合
										if (j == lotIssueList.size() - 1) {
											// 使用残数を使用数に設定
											useLotQty = remainQty;
											// 最終データでない場合
										} else {
											// 引当可能数が0より大きい場合
											if (availQty.doubleValue() > 0) {
												// 使用残数を使用数に設定
												useLotQty = remainQty;

												// 次レコード以降を取得
												for (int k = j + 1; k < lotIssueList.size(); k++) {
													AD0040010Struct nextLotIssueStruct = (AD0040010Struct) lotIssueList.get(k);

													// 引き当て可能数設定
													BigDecimal nextIssueQty = new BigDecimal(nextLotIssueStruct.getISSUE_QTY());
													BigDecimal nextSpentQty = new BigDecimal(nextLotIssueStruct.getSPENT_QTY());
													BigDecimal nextAvailQty = nextIssueQty.subtract(nextSpentQty);

													// 次レコード以降に引当可能なデータがある場合
													if (nextAvailQty.doubleValue() > 0) {
														// 引き当て可能数を使用数に設定
														useLotQty = availQty;
														break;
													}
												}
												// 引当可能数が0以下の場合
											} else {
												// 次のデータを取得
												continue;
											}
										}
									}

									// 使用数が引当可能数より大きい場合
									if (useLotQty.doubleValue() > availQty.doubleValue()) {
										// メッセージ出力
										setWarningMessage("AD20136");
										setWarningSysLogMessage("T_ISSUE_INST.ITEM_CD", issueInstStruct.getITEM_CD());
										setWarningSysLogMessage("T_LOT_ISSUE_INST.ISSUE_INST_CD",
												issueInstStruct.geth_ISSUE_INST_CD());// 出庫指示番号
										setWarningSysLogMessage("T_LOT_ISSUE_INST.ITEM_CD", issueInstStruct.getITEM_CD());
										// 品目番号
										setWarningSysLogMessage("T_LOT_ISSUE_INST.WORK_ODR_CD", issueInstStruct.getWORK_ODR_CD());
										// 作業計画番号
									}


									issueStruct1.setLOT_NO(lotIssueStruct.getLOT_NO());
									issueStruct1.setRCV_ISSUE_QTY(useLotQty.negate().toString());

									// 更新前の在庫数設定
									issueStruct1.setSAVE_STOCK_ON_HAND_QTY("0");

									CollectNumber collectNum;
									String no = "";
									// 入出庫管理番号採番
									collectNum = new CollectNumber(CollectNumber.ISSUE_CD, this.sysUSER_CD,this.sp.getProcId(), this.sysPLANT_CD);
									no = collectNum.getNo();
									if (no == null || no.length() == 0) {
										// 採番結果がない
										setErrorMessage("ZZ01106");
										return;
									}

									issueStruct1.setRCV_ISSUE_CTRL_CD(no);
									// 2：出庫
									issueStruct1.setRCV_ISSUE_TYP("2");
									issueStruct1.setITEM_CD(issueInstStruct.getINST_ITEM_CD());
									issueStruct1.setPLANT_CD(this.sysPLANT_CD);
									// 保管区コード
									if (chkBeforeProc(rsltStruct.getOPR_INST_CD())){
										issueStruct1.setWH_CD(getBeforeProc(rsltStruct.getOPR_INST_CD()));
									} else {
										issueStruct1.setWH_CD(issueInstStruct.getINST_WH_CD());
									}
									
									// 保管区コードチェック
									if (issueStruct1.getWH_CD() == null 
											|| "".equals(issueStruct1.getWH_CD())) {
										setErrorMessage("AD20060");
										setReadStatus(ERROR);
										return;
									}

									//保管区コードチェック
									List whList = entity.mSelectChkWhCd.read(conn, issueStruct1);
									if(whList == null || whList.size() == 0){
					  					setErrorMessage("AD00020");
					  					setReadStatus(ERROR);
										return;
									}

									AD0040010Struct whStruct = (AD0040010Struct)whList.get(0);
									//保管区コードの工場コードと作業系列別仕掛の工場コードの同一チェック
									if (whStruct.getPLANT_CD() == null 
											|| !whStruct.getPLANT_CD().equals(this.headerStruct.getPLANT_CD())) {
										setErrorMessage("AD00021");
										setReadStatus(ERROR);
										return;
									}
									
									issueStruct1.setJOB_ODR_CD(jobOdrNo);
									issueStruct1.setPUCH_ODR_CD(null);
									issueStruct1.setWORK_ODR_CD(issueInstStruct.getINST_WORK_ODR_CD());
									issueStruct1.setWORK_IN_PROC_CD(issueInstStruct.getINST_WORK_IN_PROC_CD());
									issueStruct1.setPARTIAL_PRD_NO(this.rsltStruct.getPARTIAL_PRD_NO());
									// 作業実績訂正回数
									issueStruct1.setOPR_RSLT_CRCT_NO(this.rsltStruct.getOPR_CRCT_NO());
									issueStruct1.seth_ISSUE_INST_CD(issueInstStruct.getINST_ISSUE_INST_CD());
									issueStruct1.setRCV_ISSUE_DATE(this.rsltStruct.getOPR_DATE());
									issueStruct1.setRCV_ISSUE_GNR_TYP("41");
									issueStruct1.setRCV_ISSUE_ODD_QTY("0.0");
									issueStruct1.setSTOCK_UPD_TYP("1");
									issueStruct1.setOD_NO(issueInstStruct.getINST_OD_NO());
									issueStruct1.setVEND_LOT_NO(null);
									issueStruct1.setRCV_ISSUE_COMMENT(null);
									issueStruct1.setUSER_CD(this.sysUSER_CD);
									issueStruct1.setPRG_NM(this.sp.getProcId());
									
									if (this.rsltStruct.getc_COMPLETE() != null 
											&& "true".equals(this.rsltStruct.getc_COMPLETE())) {
										issueStruct1.setRCV_ISSUE_CMPLT_FLG("1");
									} else {
										issueStruct1.setRCV_ISSUE_CMPLT_FLG("0");
									}
			                        //会社コード
									issueStruct1.setCOMPANY_CD(_company_cd);
									//保管区別入出庫
									entity.mINSERT_RCV_ISSUE2.create(conn, issueStruct1);
									
									// 良品出庫処理呼び出し
									IssueProcess IProc = new IssueProcess(conn, no);
									bRSLT = IProc.execAcptProcess();
									if (!bRSLT) {
										// エラーメッセージ取得
										if (IProc.getErrorList() != null&& IProc.getErrorList().size() > 0) {
											setErrorMessage((String) IProc.getErrorList().get(0));
										}
										return;
									}
									
									remainQty = remainQty.subtract(useLotQty);
								}
								// 良品の入庫処理
								remainQty = new BigDecimal(acptQty);
								for (int j = 0; j < lotIssueList.size(); j++) {
									
									AD0040010Struct lotIssueStruct = (AD0040010Struct) lotIssueList.get(j);

									// 引き当て可能数設定
									BigDecimal issueQty = new BigDecimal(lotIssueStruct.getISSUE_QTY());
									BigDecimal spentQty = new BigDecimal(lotIssueStruct.getSPENT_QTY());
									BigDecimal availQty = issueQty.subtract(spentQty);

									BigDecimal useLotQty = null;
									
									lestQty[j] = availQty.toString();
									useQty[j] = "0";
									
									if (remainQty.intValue() <= 0){
										continue;
									}
									
									// 引き当て可能数 >= 使用残数の場合
									if (availQty.doubleValue() >= remainQty.doubleValue()) {
										// 使用残数を引き当て数に設定
										useLotQty = remainQty;
										// 引き当て可能数 < 使用残数の場合
									} else {
										// 最終データの場合
										if (j == lotIssueList.size() - 1) {
											// 使用残数を使用数に設定
											useLotQty = remainQty;
											// 最終データでない場合
										} else {
											// 引当可能数が0より大きい場合
											if (availQty.doubleValue() > 0) {
												// 使用残数を使用数に設定
												useLotQty = remainQty;

												// 次レコード以降を取得
												for (int k = j + 1; k < lotIssueList.size(); k++) {
													AD0040010Struct nextLotIssueStruct = (AD0040010Struct) lotIssueList.get(k);

													// 引き当て可能数設定
													BigDecimal nextIssueQty = new BigDecimal(nextLotIssueStruct.getISSUE_QTY());
													BigDecimal nextSpentQty = new BigDecimal(nextLotIssueStruct.getSPENT_QTY());
													BigDecimal nextAvailQty = nextIssueQty.subtract(nextSpentQty);

													// 次レコード以降に引当可能なデータがある場合
													if (nextAvailQty.doubleValue() > 0) {
														// 引き当て可能数を使用数に設定
														useLotQty = availQty;
														break;
													}
												}
												// 引当可能数が0以下の場合
											} else {
												// 次のデータを取得
												continue;
											}
										}
									}

									// 使用数が引当可能数より大きい場合
									if (useLotQty.doubleValue() > availQty.doubleValue()) {
										// メッセージ出力
										setWarningMessage("AD20136");
										setWarningSysLogMessage("T_ISSUE_INST.ITEM_CD", issueInstStruct.getITEM_CD());
										setWarningSysLogMessage("T_LOT_ISSUE_INST.ISSUE_INST_CD",
												issueInstStruct.geth_ISSUE_INST_CD());// 出庫指示番号
										setWarningSysLogMessage("T_LOT_ISSUE_INST.ITEM_CD", issueInstStruct.getITEM_CD());
										// 品目番号
										setWarningSysLogMessage("T_LOT_ISSUE_INST.WORK_ODR_CD", issueInstStruct.getWORK_ODR_CD());
										// 作業計画番号
									}

									issueStruct1.setLOT_NO(lotIssueStruct.getLOT_NO());
									issueStruct1.setRCV_ISSUE_QTY(useLotQty.toString());
									issueStruct1.setSAVE_STOCK_ON_HAND_QTY("0");
									
									lestQty[j] = Calculate.add(issueQty.toString(), useLotQty.negate().toString());
									useQty[j] = Calculate.add(spentQty.toString(), useLotQty.toString());

									CollectNumber collectNum;
									String no = "";
									// 入出庫管理番号採番
									collectNum = new CollectNumber(CollectNumber.ISSUE_CD, this.sysUSER_CD,this.sp.getProcId(), this.sysPLANT_CD);
									no = collectNum.getNo();
									if (no == null || no.length() == 0) {
										// 採番結果がない
										setErrorMessage("ZZ01106");
										return;
									}

									issueStruct1.setRCV_ISSUE_CTRL_CD(no);
									// 1：入庫
									issueStruct1.setRCV_ISSUE_TYP("1");
									issueStruct1.setITEM_CD(issueInstStruct.getINST_ITEM_CD());
									issueStruct1.setPLANT_CD(this.sysPLANT_CD);
									// 保管区コード
									issueStruct1.setWH_CD(this.rsltStruct.getWH_CD());
									issueStruct1.setJOB_ODR_CD(jobOdrNo);
									issueStruct1.setPUCH_ODR_CD(null);
									issueStruct1.setWORK_ODR_CD(issueInstStruct.getINST_WORK_ODR_CD());
									issueStruct1.setWORK_IN_PROC_CD(issueInstStruct.getINST_WORK_IN_PROC_CD());
									issueStruct1.setPARTIAL_PRD_NO(this.rsltStruct.getPARTIAL_PRD_NO());
									// 作業実績訂正回数
									issueStruct1.setOPR_RSLT_CRCT_NO(this.rsltStruct.getOPR_CRCT_NO());
									issueStruct1.seth_ISSUE_INST_CD(null);
									issueStruct1.setRCV_ISSUE_DATE(this.rsltStruct.getOPR_DATE());
									issueStruct1.setRCV_ISSUE_GNR_TYP("61");
									issueStruct1.setRCV_ISSUE_ODD_QTY("0.0");
									issueStruct1.setSTOCK_UPD_TYP("1");
									issueStruct1.setOD_NO(issueInstStruct.getINST_OD_NO());
									issueStruct1.setVEND_LOT_NO(null);
									issueStruct1.setRCV_ISSUE_COMMENT(null);
									issueStruct1.setUSER_CD(this.sysUSER_CD);
									issueStruct1.setPRG_NM(this.sp.getProcId());
									
									if (this.rsltStruct.getc_COMPLETE() != null 
											&& "true".equals(this.rsltStruct.getc_COMPLETE())) {
										issueStruct1.setRCV_ISSUE_CMPLT_FLG("1");
									} else {
										issueStruct1.setRCV_ISSUE_CMPLT_FLG("0");
									}
			                        //会社コード
									issueStruct1.setCOMPANY_CD(_company_cd);
									//保管区別入出庫
									entity.mINSERT_RCV_ISSUE2.create(conn, issueStruct1);
									
									// 良品出庫処理呼び出し
									IssueProcess IProc = new IssueProcess(conn, no);
									bRSLT = IProc.execAcptProcess();
									if (!bRSLT) {
										// エラーメッセージ取得
										if (IProc.getErrorList() != null&& IProc.getErrorList().size() > 0) {
											setErrorMessage((String) IProc.getErrorList().get(0));
										}
										return;
									}
									remainQty = remainQty.subtract(useLotQty);
								}
								// 不良品の入庫処理
								// 登録処理にシステムパラメータ：”不良在庫を工程管理する”が”ＯＮ”且つ、「不良数」＜＞０場合
								if ("1".equals(this._defectManageFlg) && Calculate.compare(defectQty, "0") != 0){
									remainQty = new BigDecimal(defectQty);
									for (int j = 0; j < lotIssueList.size(); j++) {
										if (remainQty.intValue() <= 0){
											break;
										}
										if (Calculate.compare(lestQty[j], "0") <= 0){
											continue;
										}
										AD0040010Struct lotIssueStruct = (AD0040010Struct) lotIssueList.get(j);

										// 引き当て可能数設定
										BigDecimal availQty = new BigDecimal(lestQty[j]);
										BigDecimal useLotQty = null;

										// 引き当て可能数 >= 使用残数の場合
										if (availQty.doubleValue() >= remainQty.doubleValue()) {
											// 使用残数を引き当て数に設定
											useLotQty = remainQty;
											// 引き当て可能数 < 使用残数の場合
										} else {
											// 最終データの場合
											if (j == lotIssueList.size() - 1) {
												// 使用残数を使用数に設定
												useLotQty = remainQty;
												// 最終データでない場合
											} else {
												// 引当可能数が0より大きい場合
												if (availQty.doubleValue() > 0) {
													// 使用残数を使用数に設定
													useLotQty = remainQty;

													// 次レコード以降を取得
													for (int k = j + 1; k < lotIssueList.size(); k++) {
														AD0040010Struct nextLotIssueStruct = (AD0040010Struct) lotIssueList.get(k);

														// 引き当て可能数設定
														BigDecimal nextAvailQty = new BigDecimal(lestQty[k]);

														// 次レコード以降に引当可能なデータがある場合
														if (nextAvailQty.doubleValue() > 0) {
															// 引き当て可能数を使用数に設定
															useLotQty = availQty;
															break;
														}
													}
													// 引当可能数が0以下の場合
												} else {
													// 次のデータを取得
													continue;
												}
											}
										}

										// 使用数が引当可能数より大きい場合
										if (useLotQty.doubleValue() > availQty.doubleValue()) {
											// メッセージ出力
											setWarningMessage("AD20136");
											setWarningSysLogMessage("T_ISSUE_INST.ITEM_CD", issueInstStruct.getITEM_CD());
											setWarningSysLogMessage("T_LOT_ISSUE_INST.ISSUE_INST_CD",
													issueInstStruct.geth_ISSUE_INST_CD());// 出庫指示番号
											setWarningSysLogMessage("T_LOT_ISSUE_INST.ITEM_CD", issueInstStruct.getITEM_CD());
											// 品目番号
											setWarningSysLogMessage("T_LOT_ISSUE_INST.WORK_ODR_CD", issueInstStruct.getWORK_ODR_CD());
											// 作業計画番号
										}

										issueStruct1.setLOT_NO(lotIssueStruct.getLOT_NO());
										issueStruct1.setRCV_ISSUE_QTY(useLotQty.toString());

										issueStruct1.setSAVE_STOCK_ON_HAND_QTY("0");
										CollectNumber collectNum;
										String no = "";
										// 入出庫管理番号採番
										collectNum = new CollectNumber(CollectNumber.ISSUE_CD, this.sysUSER_CD,this.sp.getProcId(), this.sysPLANT_CD);
										no = collectNum.getNo();
										if (no == null || no.length() == 0) {
											// 採番結果がない
											setErrorMessage("ZZ01106");
											return;
										}

										issueStruct1.setRCV_ISSUE_CTRL_CD(no);
										// 3:不良入庫
										issueStruct1.setRCV_ISSUE_TYP("3");
										issueStruct1.setITEM_CD(issueInstStruct.getINST_ITEM_CD());
										issueStruct1.setPLANT_CD(this.sysPLANT_CD);
										// 保管区コード
										issueStruct1.setWH_CD(this.rsltStruct.getWH_CD());
										issueStruct1.setJOB_ODR_CD(jobOdrNo);
										issueStruct1.setPUCH_ODR_CD(null);
										issueStruct1.setWORK_ODR_CD(issueInstStruct.getINST_WORK_ODR_CD());
										issueStruct1.setWORK_IN_PROC_CD(issueInstStruct.getINST_WORK_IN_PROC_CD());
										issueStruct1.setPARTIAL_PRD_NO(this.rsltStruct.getPARTIAL_PRD_NO());
										// 作業実績訂正回数
										issueStruct1.setOPR_RSLT_CRCT_NO(this.rsltStruct.getOPR_CRCT_NO());
										issueStruct1.seth_ISSUE_INST_CD(null);
										issueStruct1.setRCV_ISSUE_DATE(this.rsltStruct.getOPR_DATE());
										issueStruct1.setRCV_ISSUE_GNR_TYP("61");
										issueStruct1.setRCV_ISSUE_ODD_QTY("0.0");
										issueStruct1.setSTOCK_UPD_TYP("1");
										issueStruct1.setOD_NO(issueInstStruct.getINST_OD_NO());
										issueStruct1.setVEND_LOT_NO(null);
										issueStruct1.setRCV_ISSUE_COMMENT(null);
										issueStruct1.setUSER_CD(this.sysUSER_CD);
										issueStruct1.setPRG_NM(this.sp.getProcId());
										
										if (this.rsltStruct.getc_COMPLETE() != null 
												&& "true".equals(this.rsltStruct.getc_COMPLETE())) {
											issueStruct1.setRCV_ISSUE_CMPLT_FLG("1");
										} else {
											issueStruct1.setRCV_ISSUE_CMPLT_FLG("0");
										}
				                        //会社コード
										issueStruct1.setCOMPANY_CD(_company_cd);
										// 保管区別入出庫
										entity.mINSERT_RCV_ISSUE2.create(conn, issueStruct1);
										IssueProcess IProc = new IssueProcess(conn, no);
										bRSLT = IProc.execDefectProcess();
										if (!bRSLT) {
											// エラーメッセージ取得
											if (IProc.getErrorList() != null&& IProc.getErrorList().size() > 0) {
												setErrorMessage((String) IProc.getErrorList().get(0));
											}
											return;
										}
										remainQty = remainQty.subtract(useLotQty);
									}
								}
							}
						}
						if (isExist){
							// 次工程に作業実績がある、且つ、次工程の保管区に良品数、不良品数があります。
							setWarningMessage("AD00234");
						}
					}
				}
				// Add End 20140214 liuj 
				//ロット管理フラグ = 1(ロットトレース管理を行う。)の場合
				if(rsltStruct.getLOT_CTRL_FLG().equals("1")){
					//最終系列フラグ = 1(最終系列)の場合
					if(rsltStruct.geth_FINAL_PROC_FLG().equals("1")){
						//在庫ロット番号がNullでない場合
						if(this.rsltStruct.getLOT_NO() != null && !this.rsltStruct.getLOT_NO().equals("")){
							//ロット番号が変更された場合
							/*if(!this.rsltStruct.getLOT_NO().equals(this.keepRsltStruct.getLOT_NO())) {
								//ロット別使用実績取得
								tempList = entity.mT_LOT_USE_RSLT.read(conn,this.headerStruct);
								if (tempList != null && !tempList.isEmpty()) {
									for (int i = 0; i < tempList.size(); i++ ) {
										tempStruct = (AD0040010Struct)tempList.get(i);

										//ロットトレース登録・更新処理
										BizCommon bc = new BizCommon(conn, getsysUSER_CD(), sp.getProcId(),
											getsysPLANT_CD());
										List lotTraceList = bc.excMakeLotTraceFd(tempStruct.getITEM_CD(),
											tempStruct.getLOT_NO(), this.rsltStruct.getITEM_CD(),
											this.rsltStruct.getLOT_NO(), "2");

										//異常終了の場合
										if(bc.getResultStatus().intValue() == 3){
											//エラーメッセージ取得
											if(lotTraceList != null && lotTraceList.size() > 0){
												setErrorMessage((String)lotTraceList.get(0));
											}
											return;
										}
									}
								}
							}*/

							//ロット管理テーブル更新
							setStandardItem(this.rsltStruct);
							entity.mT_LOT_CTRL.update(conn,this.rsltStruct);
							
							String temp;
							int round;
							BigDecimal denominator;
							BigDecimal numerator;
							BigDecimal planSum;
							//ロット使用別実績の更新処理
							tempList = entity.mUpdateT_LOT_USE_RSLT.read(conn, rsltStruct);
							if (tempList.size() > 0) {
								for (int i = 0; i < tempList.size(); i++) {
									tempStruct = (AD0040010Struct)tempList.get(i);
									round = Integer.parseInt(tempStruct.getUNIT_QTY_TYP());
									denominator = new BigDecimal(tempStruct.geth_ISSUE_INST_UNIT_DENOMINATOR());
									numerator = new BigDecimal(tempStruct.geth_ISSUE_INST_UNIT_NUMERATOR());
									//良品数
									temp = rsltStruct.getACPT_QTY();
									planSum = new BigDecimal(temp);
									//子品目の使用数の計算
									if (round == 1) {
										planSum = planSum.multiply(numerator).divide(denominator, 0, BigDecimal.ROUND_UP).setScale(1);
									} else {
										planSum = planSum.multiply(numerator).divide(denominator, 4, BigDecimal.ROUND_UP);
//										// 小数の表示スケール処理
//										BigDecimal intVal = new BigDecimal(""+ planSum.intValue());
//										BigDecimal decimalVal = planSum.subtract(intVal).multiply(new BigDecimal(10000));
//										int decVal = decimalVal.intValue();
//										int roundCount = 1;
//										while (true) {
//											decVal = decVal / 10;
//											if (decVal == 0) {
//												break;
//											}
//											roundCount++;
//										}
//										planSum = planSum.setScale(roundCount,BigDecimal.ROUND_UP);
									}							
									//使用予定数量の計算：「良品数」-SUM（[ロット別使用実績].”使用予定数量”）+MAX（ロット番号）の使用予定数量
									if (Calculate.compare(planSum.toString(),tempStruct.getSUPPLIED_ISSUE_QTY_sum()) != 0) {
										temp = Calculate.add(tempStruct.getSUPPLIED_ISSUE_QTY(),
												Calculate.subtract(planSum.toString(),tempStruct.getSUPPLIED_ISSUE_QTY_sum()));
										tempStruct.setSUPPLIED_ISSUE_QTY(temp);
										setStandardItem(tempStruct);
										entity.mUpdateT_LOT_USE_RSLT.update(conn, tempStruct);
									}
								}
							}
						}
					}
				}
			}

//-------------------------------------------------------------------------------------------------------------------------
//			System.out.println("完了以外が変更されていた場合のみ");
						//完了以外が変更されていた場合のみ
//						if (!this.CompareRsltStruct(this.rsltStruct,this.keepRsltStruct)) {  
			// 完了以外が変更されていた場合、現品票も出力できる
			System.out.println("(SBM1260)最終系列の実績の場合のみ");
							//最終系列の実績の場合のみ
							if (this.headerStruct.geth_FINAL_PROC_FLG() != null 
									&& "1".equals(this.headerStruct.geth_FINAL_PROC_FLG())) {

			System.out.println("(SBM1261)良品数が０以下の場合は現品票は作成しない");
								//良品数が０以下の場合は現品票は作成しない
								if (Double.parseDouble(this.struct.getACPT_QTY()) > 0) {

			System.out.println("(SBM1262)現品票出力が有効の場合、現品票の登録・更新処理");
									//現品票アクティブの場合、現品票の登録・更新処理
									if ("1".equals(_outputFlg)) {

			System.out.println("(SBM1263)現品票管理番号の新規採番");
										//現品票管理番号の新規採番
										AD0040010Struct GetIdentCardCtlNoStruct = new AD0040010Struct();

										List list_Get = entity.mselectGetIdentCardCtlNo.read(conn, GetIdentCardCtlNoStruct);

										GetIdentCardCtlNoStruct = (AD0040010Struct) list_Get.get(0);

										AD0040010Struct InsOprRsltStruct = new AD0040010Struct();

										InsOprRsltStruct.setSEL_OPR_INST_CD(this.struct.getOPR_INST_CD());
										InsOprRsltStruct.setSEL_PARTIAL_PRD_NO(this.struct.getPARTIAL_PRD_NO());

										List list_temp = entity.mSelectOprRsltForPrint.read(conn, InsOprRsltStruct);

										//作業実績の検索結果のチェック
										if (list_temp.size()==0||list_temp.isEmpty()){
											setErrorMessage("ZZ11001");
											return;
										}else{
											//作業実績の検索結果を格納する
											InsOprRsltStruct = (AD0040010Struct) list_temp.get(0);
											IdentCardStruct.setINS_IDENT_CARD_CTL_NO(GetIdentCardCtlNoStruct.getGET_IDENT_CARD_CTL_NO());
											IdentCardStruct.setINS_OPR_INST_CD(InsOprRsltStruct.getSEL_OPR_INST_CD());
											IdentCardStruct.setINS_PARTIAL_PRD_NO(InsOprRsltStruct.getSEL_PARTIAL_PRD_NO());
											IdentCardStruct.setINS_ITEM_CD(InsOprRsltStruct.getSEL_ITEM_CD());
											IdentCardStruct.setINS_FIRST_IDENT_CARD_QTY(InsOprRsltStruct.getSEL_ACPT_QTY());
											IdentCardStruct.setINS_IDENT_CARD_QTY(InsOprRsltStruct.getSEL_ACPT_QTY());
											IdentCardStruct.setINS_OPR_DATE(InsOprRsltStruct.getSEL_OPR_DATE());
											IdentCardStruct.setINS_PKG_UNIT_QTY(InsOprRsltStruct.getSEL_PKG_UNIT_QTY());
											IdentCardStruct.setINS_PLANT_CD(InsOprRsltStruct.getSEL_PLANT_CD());
											IdentCardStruct.setINS_WS_CD(InsOprRsltStruct.getSEL_WS_CD());
											IdentCardStruct.setLOT_NO(InsOprRsltStruct.getLOT_NO());
											IdentCardStruct.setINS_CREATED_BY(this.sysUSER_CD);
											IdentCardStruct.setINS_CREATED_PRG_NM(this.sp.getProcId());
											IdentCardStruct.setINS_UPDATED_BY(this.sysUSER_CD);
											IdentCardStruct.setINS_UPDATED_PRG_NM(this.sp.getProcId());
										}

										//現品票更新処理
										if (_rsltExeType == 0) { //登録

											// 現品票の登録
											entity.mInsertIdentCard.create(conn,IdentCardStruct);
										} else { //更新

											// 現品票の更新
											entity.mUpdateIdentCard1.update(conn,IdentCardStruct);
											// 現品票の登録
											entity.mInsertIdentCard.create(conn,IdentCardStruct);
										}

									}

								}

							}

//						}

//-------------------------------------------------------------------------------------------------------------------------
						
			// 不良理由の登録(全削除⇒全登録)
			entity.mDeleteT_DEFECT.delete(conn, struct);

			defectStruct = new AD0040010Struct();
			setStandardItem(defectStruct);
			this.defectStruct.setOPR_INST_CD(this.struct.getOPR_INST_CD());
			this.defectStruct.setPARTIAL_PRD_NO(this.struct.getPARTIAL_PRD_NO());
			this.defectStruct.setPLANT_CD(this.sysPLANT_CD);
			this.defectStruct.setUSER_CD(this.sysUSER_CD);
			this.defectStruct.setPRG_NM(this.sp.getProcId());


			List defectCauseCdList = struct.getList_l_DEFECT_CAUSE_CD();
			List defectQtyList = struct.getList_l_DEFECT_QTY();
			List defectCommentList = struct.getList_l_DEFECT_COMMENT();

			for (int i = 0; i < defectCauseCdList.size(); i++) {
				String defectCauseCd = (String) defectCauseCdList.get(i);
				if ("0".equals(defectCauseCd)) {
					continue;
				}
				String defectInspcQty = (String) defectQtyList.get(i);
				String defectComment = (String) defectCommentList.get(i);


				this.defectStruct.setl_DEFECT_CAUSE_CD(defectCauseCd);
				this.defectStruct.setl_DEFECT_QTY(defectInspcQty);
				this.defectStruct.setl_DEFECT_COMMENT(defectComment);


				entity.mInsertDefect.create(conn, this.defectStruct);
			}

			conn.commit();

			if(StringUtil.Validate(this.headerStruct.getJOB_ODR_CD()) &&
					"true".equals(struct.getc_COMPLETE())){
				// 引当済出庫残数＞製番在庫（手持在庫）の場合
				// ｢作業完了｣がチェックされている時のみチェック
				if(!(new IssueRemain(conn)).isEnoughAlcdQty(getsysPLANT_CD(),
						this.headerStruct.getITEM_CD(), this.headerStruct.getJOB_ODR_CD(),
						AD0040Const._JOB_ODR_DETAIL_NO)){
					setWarningMessage("AD60001");
				}
			}
			int maxLine = sp.getMaxLine(conn,20);//不良品表示件数
			if(maxLine != 0) {
				this.defectStruct.setROW_COUNT(String.valueOf(maxLine));
			} else {
				this.defectStruct.setROW_COUNT(null);
			}
			this.defectList= entity.mSelectDefectListCnt.read(conn, this.defectStruct);
			long rowCount = Long.parseLong(((AD0040010Struct)this.defectList.get(0)).getl_COUNT());
			if(rowCount==0){
				if(this.defectList != null && this.defectList.size() > 0){
				   this.defectList.clear();
				}
			}
			if (maxLine != 0 && rowCount== maxLine + 1) {
				if(this.defectList != null && this.defectList.size() > 0){
				   this.defectList.clear();
				}
				setErrorMessage("AD00066",""+maxLine);
				setWarningSysLogMessage("T_DEFECT.OPR_INST_CD", this.rsltStruct.getOPR_INST_CD());//作業不良.作業指示番号
				setReadStatus(TOO_MANY);
				return;
			}
			//作業不良リストの取得defectListFlg
			this.defectList = entity.mSelectDefectList.read(conn, this.defectStruct);

//-------------------------------------------------------------------------------------------------------------------------

//			//完了以外が変更されていた場合のみ
//			if (!this.CompareRsltStruct(this.rsltStruct,this.keepRsltStruct)) {  
			    // 完了以外が変更されていた場合、現品票も出力できる
				//最終系列の実績の場合のみ
				if (this.headerStruct.geth_FINAL_PROC_FLG() != null 
						&& "1".equals(this.headerStruct.geth_FINAL_PROC_FLG())) {

					//良品数が０以下の場合は現品票は印刷しない
					if (Double.parseDouble(this.struct.getACPT_QTY()) > 0) {

						//現品票出力が有効の場合、現品票の読込処理
						if (this.struct.getc_OUTPUT() != null 
								&& "true".equals(this.struct.getc_OUTPUT())) {

							//印刷グループ番号の新規採番
							ManagementNumber mngNumber = new ManagementNumber();
							String strPrintGrpNo = mngNumber.getSequenceNo("SEQ_ICT");
							mngNumber = null;

							AD0040010Struct InsIdentCardTempStruct = new AD0040010Struct();

							InsIdentCardTempStruct.setTMP_OPR_INST_CD(this.struct.getOPR_INST_CD());
							InsIdentCardTempStruct.setTMP_PARTIAL_PRD_NO(this.struct.getPARTIAL_PRD_NO());

							List list_temp = entity.mSelectIdentCardForPrint.read(conn, InsIdentCardTempStruct);

							AD0040010Struct IdentCardTempStruct = new AD0040010Struct();

							//現品票の検索結果のチェック
							if (list_temp.size()==0||list_temp.isEmpty()){
								setErrorMessage("ZZ11001");
								return;
							}else{
								//現品票の検索結果を格納する
								InsIdentCardTempStruct = (AD0040010Struct) list_temp.get(0);
								IdentCardTempStruct.setINS_PRINT_GRP_NO(strPrintGrpNo);
								IdentCardTempStruct.setINS_IDENT_CARD_CTL_NO(InsIdentCardTempStruct.getTMP_IDENT_CARD_CTL_NO());
								IdentCardTempStruct.setINS_OPR_INST_CD(InsIdentCardTempStruct.getTMP_OPR_INST_CD());
								IdentCardTempStruct.setINS_PARTIAL_PRD_NO(InsIdentCardTempStruct.getTMP_PARTIAL_PRD_NO());
								IdentCardTempStruct.setINS_RCV_ISSUE_CTRL_CD(InsIdentCardTempStruct.getTMP_RCV_ISSUE_CTRL_CD());
								IdentCardTempStruct.setINS_ITEM_CD(InsIdentCardTempStruct.getTMP_ITEM_CD());
								IdentCardTempStruct.setINS_JOB_ODR_CD(InsIdentCardTempStruct.getTMP_JOB_ODR_CD());
								IdentCardTempStruct.setINS_FIRST_IDENT_CARD_QTY(InsIdentCardTempStruct.getTMP_FIRST_IDENT_CARD_QTY());
								IdentCardTempStruct.setINS_IDENT_CARD_QTY(InsIdentCardTempStruct.getTMP_IDENT_CARD_QTY());
								IdentCardTempStruct.setINS_OPR_DATE(InsIdentCardTempStruct.getTMP_OPR_DATE());
								IdentCardTempStruct.setINS_PKG_UNIT_QTY(InsIdentCardTempStruct.getTMP_PKG_UNIT_QTY());
								IdentCardTempStruct.setINS_PLANT_CD(InsIdentCardTempStruct.getTMP_PLANT_CD());
								IdentCardTempStruct.setINS_WS_CD(InsIdentCardTempStruct.getTMP_WS_CD());
								IdentCardTempStruct.setLOT_NO(InsIdentCardTempStruct.getLOT_NO());
								IdentCardTempStruct.setINS_CREATED_BY(this.sysUSER_CD);
								IdentCardTempStruct.setINS_CREATED_PRG_NM(this.sp.getProcId());
								IdentCardTempStruct.setINS_UPDATED_BY(this.sysUSER_CD);
								IdentCardTempStruct.setINS_UPDATED_PRG_NM(this.sp.getProcId());
							}

				            //現品票数量÷荷姿単位数量の商を求める
							String pageno = Calculate.divide(IdentCardTempStruct.getINS_IDENT_CARD_QTY(), IdentCardTempStruct.getINS_PKG_UNIT_QTY(), 0, Calculate.FLOOR);

							double bunshi = Double.parseDouble(IdentCardTempStruct.getINS_IDENT_CARD_QTY());
							double bunbo = Double.parseDouble(IdentCardTempStruct.getINS_PKG_UNIT_QTY());
							double overno;

							//現品票数量÷荷姿単位数量の余りを求める
							overno = bunshi % bunbo;

							//総ページ数の算出
							if (0 < overno){
								//余りがある場合、１を加算
								pageno = Calculate.add(pageno, "1");
							}

							//総ページ数分ループする
							for(long i=1;i<=Long.parseLong(pageno) ;i++)
							{
								//最終ページでかつ、余りがある場合
								if (i == Long.parseLong(pageno) && 0 < overno){
									//余りを荷姿単位数量に設定
									IdentCardTempStruct.setINS_PKG_UNIT_QTY(Double.toString(overno));
								}

								IdentCardTempStruct.setINS_PAGE_NO(Long.toString(i));

								// 現品票TEMPの登録
								entity.mInsertIdentCardTemp.create(conn,IdentCardTempStruct);
					    	} 

							//現品票出力
							controlPrint(strPrintGrpNo);

							//出力枚数を設定
							IdentCardTempStruct.setINS_PRINT_QTY(pageno);

							//現品票の更新
							entity.mUpdateIdentCard2.update(conn,IdentCardTempStruct);

							//現品票TEMPの削除
							entity.mDeleteIdentCardTemp.delete(conn,IdentCardTempStruct);

						}

					}

				}

//			}

//-------------------------------------------------------------------------------------------------------------------------

			// 作業完了のワーニングメッセージ表示制御
			warningFlg = WARNING_MESSAGE_2;

			//再検索
			controlSelect();
			
				
		} catch (NumberFormatException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			throw new ExpjException(e, emsg);
		} catch (SQLException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			throw new ExpjException(e, emsg);
		} catch (ParseException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			throw new ExpjException(e, emsg);
		} catch (ApsComException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			throw new ExpjException(e, emsg);
		} catch (Exception e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			throw new ExpjException(e, emsg);
		} finally {
			try {
				if (conn != null) {
					conn.rollback();
				}
			} catch(Exception e) {
				setReadStatus(ERROR);
				ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
				sysLog.severe(emsg, getsysUSER_CD());
				throw new ExpjException(e, emsg);
			}
		}


                //}}user_implement_dev:<controlUpdate11>
		logger.exiting("AD0040010Control"+":USER="+struct.getsUser_ID(),"controlUpdate11");

		return;
	}

	/**
	 * 更新ボタン押下時に実行される処理です。
	 *
	 */
	public void controlUpdate12() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0040");
		logger.entering("AD0040010Control"+":USER="+struct.getsUser_ID(),"controlUpdate12");
			//{{user_implement_dev:<controlUpdate12>


		controlInsert12();


                //}}user_implement_dev:<controlUpdate12>
		logger.exiting("AD0040010Control"+":USER="+struct.getsUser_ID(),"controlUpdate12");

		return;
	}

	/**
	 * 調整数登録ボタン押下時に実行される処理です。
	 *
	 */
	public void controlNoUserParts() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0040");
		logger.entering("AD0040010Control"+":USER="+struct.getsUser_ID(),"controlNoUserParts");
			//{{user_implement_dev:<controlNoUserParts>


		try {
			GetTimeCtrl();
			setBussinessOprDate();
			this.issueStruct = new AD0040010Struct();
			setStandardItem(issueStruct);

			//ヘッダ検索
			List tempList = new ArrayList();
			tempList = entity.mSelectHeader.read(conn, struct);
			if (tempList.isEmpty()) {
				setErrorMessage("ZZ01101");
				setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.OPR_INST_CD", struct.getIN_OPR_INST_CD());//系列別仕掛.作業指示番号
				return;
			}
			this.headerStruct = new AD0040010Struct();
			this.headerStruct = (AD0040010Struct)tempList.get(0);
			headerStruct.setMRP_ODR_TYP_DN(multcombo("MRP_ODR_TYP",headerStruct.getMRP_ODR_TYP()));
			setStandardItem(headerStruct);
			this.headerStruct.setIN_OPR_INST_CD(struct.getIN_OPR_INST_CD());

			//品目別仕掛のmodifycount取得+作業実績区分の取得
			tempList = entity.mSelectWorkItem.read(conn, this.headerStruct);
			if (tempList.isEmpty()) {
				this.headerStruct.clear();
				setErrorMessage("ZZ01101");
				setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.OPR_INST_CD", struct.getIN_OPR_INST_CD());//品目別仕掛.作業指示番号
				return;
			}
			AD0040010Struct tempStruct = (AD0040010Struct)tempList.get(0);
			tempStruct.setMRP_ODR_TYP_DN(multcombo("MRP_ODR_TYP",tempStruct.getMRP_ODR_TYP()));
			this.headerStruct.seth_ITEM_MODIFY_COUNT(tempStruct.geth_ITEM_MODIFY_COUNT());
			this.headerStruct.setPARTIAL_PRD_NO(struct.getPARTIAL_PRD_NO());
			this.headerStruct.seth_ISSUE_INST_CD(struct.geth_ISSUE_INST_CD());
			this.headerStruct.setl_LOT_NO(struct.getl_LOT_NO());

			//作業実績検索
			tempList = entity.mSelect.read(conn, struct);
			if (tempList.isEmpty()) {
				setErrorMessage("ZZ01101");
				setWarningSysLogMessage("T_ISSUE_INST.WORK_ODR_CD", struct.getIN_OPR_INST_CD());//作業指示番号
				setWarningSysLogMessage("T_ISSUE_INST.ISSUE_INST_CD", struct.geth_ISSUE_INST_CD());
				return;
			}
			tempStruct = (AD0040010Struct)tempList.get(0);
			this.headerStruct.setPARTIAL_PRD_NO(tempStruct.getPARTIAL_PRD_NO());
			this.headerStruct.setACPT_QTY(tempStruct.getACPT_QTY());
			this.headerStruct.setDEFECT_QTY(tempStruct.getDEFECT_QTY());
			//数値タイプ項目がnullの場合、0をセット
			zeroSet(this.headerStruct);

    			//出庫指示リスト取得
    			this.setIssueList();
    			if (this.issueList.isEmpty()) {
    				setErrorMessage("ZZ01101");
    				setWarningSysLogMessage("T_ISSUE_INST.WORK_ODR_CD", struct.getIN_OPR_INST_CD());//作業指示番号
    				setWarningSysLogMessage("T_ISSUE_INST.ISSUE_INST_CD", struct.geth_ISSUE_INST_CD());
    				return;
    			}
    			tempStruct = new AD0040010Struct();
                if(headerStruct.geth_ISSUE_INST_CD() != null && !"".equals(headerStruct.geth_ISSUE_INST_CD())){
    			    tempStruct = (AD0040010Struct)issueList.get(0);
    			    issueStruct.setJOB_ODR_CD(headerStruct.getJOB_ODR_CD());//使用元製番
                }else{
               	    List readList = entity.msel_T_ISSUE_ADD.read(conn, struct);
               	    tempStruct = (AD0040010Struct)readList.get(0);
               	    this.issueStruct.setJOB_ODR_CD(tempStruct.getJOB_ODR_CD());
 				    // コンボボックスの取得
 				    othercomboTyp(tempStruct);
                }

    			//表示項目のセット
    			this.issueStruct.setITEM_CD(tempStruct.getITEM_CD());//子品目番号
    			this.issueStruct.setITEM_NAME(tempStruct.getITEM_NAME());//品目名
    			this.issueStruct.setWH_CD(tempStruct.getWH_CD());//使用元保管区
    			this.issueStruct.setWH_NAME(tempStruct.getWH_NAME());//保管区名
    			this.issueStruct.setTEMP_PLAN_QTY(tempStruct.getTEMP_PLAN_QTY());//計画使用数量
    			this.issueStruct.setSTOCK_UNIT(tempStruct.getSTOCK_UNIT());//計量単位
    			this.issueStruct.setTEMP_USEOVER_QTY(tempStruct.getTEMP_USEOVER_QTY());//使用済数量
    			this.issueStruct.setTEMP_PLANOUT_QTY(tempStruct.getTEMP_PLANOUT_QTY());//計画外使用済数量
    			this.issueStruct.setTEMP_USE_QTY(tempStruct.getTEMP_USE_QTY());//更新使用数量
    			this.issueStruct.setRCV_ISSUE_DATE(_oprDate);//使用日
    			this.issueStruct.setRCV_ISSUE_TIME(null);
    			this.issueStruct.setLOT_NO(tempStruct.getl_LOT_NO());//在庫ロット番号
    			this.issueStruct.seth_LOT_NO(tempStruct.getl_LOT_NO());//在庫ロット番号
    			this.issueStruct.setVEND_LOT_NO(tempStruct.getVEND_LOT_NO());//製造ロット番号
    			this.issueStruct.setRCV_ISSUE_COMMENT(tempStruct.getRCV_ISSUE_COMMENT());//備考
    			this.issueStruct.setMRP_ODR_TYP_DN(multcombo("MRP_ODR_TYP",tempStruct.getMRP_ODR_TYP()));//手配区分
    			this.issueStruct.setMRP_ODR_TYP(tempStruct.getMRP_ODR_TYP());//手配区分
    			this.issueStruct.setISSUE_TYP_DN(tempStruct.getISSUE_TYP_DN());//出庫指示出庫区分
    			this.issueStruct.seth_ISSUE_TYP(tempStruct.geth_ISSUE_TYP());//出庫指示出庫区分
    			
    			this.issueStruct.setIN_OPR_INST_CD(struct.getIN_OPR_INST_CD());
    			List partialPrdNoList = new ArrayList();
    			partialPrdNoList = struct.getList_PARTIAL_PRD_NO();
    			this.issueStruct.setPARTIAL_PRD_NO((String) partialPrdNoList.get(0));
    			List issueInstCdList = new ArrayList();
    			issueInstCdList = struct.getList_h_ISSUE_INST_CD();
    			this.issueStruct.seth_ISSUE_INST_CD((String) issueInstCdList.get(0));

          

			//クライアントチェック項目のセット
			this.issueStruct.setUNIT_QTY_TYP(tempStruct.getUNIT_QTY_TYP());
			this.issueStruct.seth_BUSINESS_OPR_DATE(_oprDate);

			//製番品（MRP_ODR_TYP = 1,2）以外の場合、使用元製番に「""」をset
			if (!("1".equals(this.issueStruct.getMRP_ODR_TYP()) 
					|| "2".equals(this.issueStruct.getMRP_ODR_TYP()))) {
				this.issueStruct.setJOB_ODR_CD("");
			}
			
			this.struct.setStructM(this.issueStruct);
			this.issueKeepStruct.setStructM(this.issueStruct);
			_issueExeType = 1;
			setReadStatus(NORMAL);

		} catch (SQLException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			throw new ExpjException(e, emsg);
		} catch (Exception e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			throw new ExpjException(e, emsg);
		}


                //}}user_implement_dev:<controlNoUserParts>
		logger.exiting("AD0040010Control"+":USER="+struct.getsUser_ID(),"controlNoUserParts");

		return;
	}

	/**
	 * 完了解除ボタン押下時に実行される処理です。
	 *
	 */
	public void controlCancelComplete() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0040");
		logger.entering("AD0040010Control"+":USER="+struct.getsUser_ID(),"controlCancelComplete");
			//{{user_implement_dev:<controlCancelComplete>


		try {
			//実際原価の締めが完了している日付チェック
			if(getSysParameter() == false){
				//実際原価管理パラメータの対象年月日
				BigDecimal ProcExecDate = getProcExecDate();
				if(null != ProcExecDate){
					boolean b = true;
					// 画面入力年月日
					BigDecimal input = new BigDecimal(struct.geth_OPR_DATE().substring(0,4) + struct.geth_OPR_DATE().substring(5,7));
					b = compDecimal(input,ProcExecDate);
					if(!b){
						setErrorMessage("AE00177");
						setErrorParameter("SYS_ACTUAL_COST_CTRL_AC", "PLANT_CD", struct.getPLANT_CD());
						setErrorParameter("SYS_ACTUAL_COST_CTRL_AC", "PROC_EXEC_DATE", struct.getPROC_EXEC_DATE().toString());
						return;
					}
				}
			}
			//ヘッダ検索
			List tempList = new ArrayList();
			tempList = entity.mSelectHeader.read(conn, struct);
			
			if (tempList.isEmpty()) {
				setErrorMessage("ZZ01101");
				setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.OPR_INST_CD", struct.getIN_OPR_INST_CD());//系列別仕掛.作業指示番号
				setReadStatus(NOT_FOUND);
				return;
			}

			this.headerStruct = new AD0040010Struct();
			this.headerStruct = (AD0040010Struct)tempList.get(0);
		    headerStruct.setMRP_ODR_TYP_DN(multcombo("MRP_ODR_TYP",headerStruct.getMRP_ODR_TYP()));
			setStandardItem(headerStruct);
			this.headerStruct.setIN_OPR_INST_CD(struct.getIN_OPR_INST_CD());

			
			tempList = entity.mSelectChkWorkProc.read(conn,this.headerStruct);
			if (tempList.isEmpty()) {
				setErrorMessage("ZZ01101");
				setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.OPR_INST_CD",this.headerStruct.getOPR_INST_CD());//作業系列仕掛.作業指示番号
				return;
			}
			AD0040010Struct tempStruct = (AD0040010Struct)tempList.get(0);
			if (this.struct.geth_PROC_MODIFY_COUNT() != null 
					&& !this.struct.geth_PROC_MODIFY_COUNT().equals(
					tempStruct.getPROC_MODIFY_COUNT())) {
				setErrorMessage("ZZ01105");
				setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.OPR_INST_CD",this.headerStruct.getOPR_INST_CD());//作業系列仕掛.作業指示番号
				return;
			}
			
			this.headerStruct.setUPDATE_WORK_STS_TYP("2");
			this.headerStruct.setOPR_DATE(null);
			this.headerStruct.setUSER_CD(this.sysUSER_CD);
			this.headerStruct.setPRG_NM(this.sp.getProcId());
			//作業系列別仕掛更新処理
			entity.mUpdateWorkProc.update(conn,this.headerStruct);
			
			//デマンド完了解除（所要量）
			CommonOd od = 
					new CommonOd(
						conn,
						this.sysPLANT_CD,
						this.sysUSER_CD,
						this.sp.getProcId());
			od.changeDemandForCancel(
					this.headerStruct.getWORK_ODR_CD(),
					this.headerStruct.getWORK_IN_PROC_CD());
			
			if (this.headerStruct.geth_FINAL_PROC_FLG() != null 
					&& "1".equals(this.headerStruct.geth_FINAL_PROC_FLG())) {
				//作業系列が最終系列の場合、品目別仕掛更新処理
				tempList = entity.mSelectChkWorkItem.read(conn,this.headerStruct);
				if (tempList.isEmpty()) {
					setErrorMessage("ZZ01101");
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.OPR_INST_CD", this.headerStruct.getOPR_INST_CD());//品目仕掛.作業指示番号
					return;
				}
				tempStruct = (AD0040010Struct)tempList.get(0);
				if(this.struct.getITEM_MODIFY_COUNT() != null 
						&& !struct.geth_ITEM_MODIFY_COUNT().equals(
						tempStruct.getITEM_MODIFY_COUNT())) {
					setErrorMessage("ZZ01105");
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.OPR_INST_CD", this.headerStruct.getOPR_INST_CD());//品目仕掛.作業指示番号
					return;
				}
			
				//品目別仕掛更新処理
				entity.mUpdateWorkItem.update(conn,this.headerStruct);
			
				//オーダ情報完了解除（所要量）
				od.changeOrderForCancel(this.headerStruct.getOD_NO(),-1);
// ▼▼ 2008/08/12 ADD START -TSUCHIDA▼▼
				List manhourTypList = new ArrayList();
				AD0040010Struct manhourTypStruct = null;
				AD0040010Struct tOdUpdateStruct = new AD0040010Struct();

				manhourTypList = entity.mSelectItem.read(conn,this.headerStruct);

				if (!manhourTypList.isEmpty()) {
					manhourTypStruct = (AD0040010Struct)manhourTypList.get(0);
				}
				// [品目].工数管理品目区分 = 1:工数管理品目の場合
				if (manhourTypStruct.getMANHOUR_TYP() != null
						&& "1".equals(manhourTypStruct.getMANHOUR_TYP())){
					tOdUpdateStruct.setDM_STS_TYP("2");
					tOdUpdateStruct.setISSUE_CMPLT_DATE(null);
					tOdUpdateStruct.setUSER_CD(this.sysUSER_CD);
					tOdUpdateStruct.setPRG_NM(this.sp.getProcId());
					tOdUpdateStruct.setOD_NO(this.headerStruct.getOD_NO());
					// デマンド完了（所要量）
					entity.mUPDATE_T_OD.update(conn,tOdUpdateStruct);
				}

// ▲▲ 2008/08/12 ADD END -TSUCHIDA▲▲
			}
			
			conn.commit();
			
			// 作業完了のワーニングメッセージ表示制御
			warningFlg = WARNING_NOTHING;
			
			//再検索
			controlSelect();
			
		} catch (SQLException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			throw new ExpjException(e, emsg);
		} catch (ApsComException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			throw new ExpjException(e, emsg);
		} finally {
			try {
				if (conn != null) {
					conn.rollback();
				}
			} catch(Exception e) {
				setReadStatus(ERROR);
				ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
				sysLog.severe(emsg, getsysUSER_CD());
				throw new ExpjException(e, emsg);
			}
		}


                //}}user_implement_dev:<controlCancelComplete>
		logger.exiting("AD0040010Control"+":USER="+struct.getsUser_ID(),"controlCancelComplete");

		return;
	}

	/**
	 * 行追加ボタン押下時に実行される処理です。
	 *
	 */
	public void controlLineInsert() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0040");
		logger.entering("AD0040010Control"+":USER="+struct.getsUser_ID(),"controlLineInsert");
			//{{user_implement_dev:<controlLineInsert>


		try {
			GetTimeCtrl();
			
			// 印刷フラグクリア
			_printFlg = "0";
			_downloadFile = null;
			struct.setDOWNLOAD_FILE("");
			
			//ヘッダ検索
			List tempList = new ArrayList();
			tempList = entity.mSelectHeader.read(conn, struct);
			if (tempList.isEmpty()) {
				setErrorMessage("ZZ01101");
				setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.OPR_INST_CD", struct.getIN_OPR_INST_CD());//系列別仕掛.作業指示番号
				setReadStatus(NOT_FOUND);
				return;
			}
			this.headerStruct = new AD0040010Struct();
			this.headerStruct = (AD0040010Struct)tempList.get(0);
			headerStruct.setMRP_ODR_TYP_DN(multcombo("MRP_ODR_TYP",headerStruct.getMRP_ODR_TYP()));
			setStandardItem(headerStruct);
			this.headerStruct.setIN_OPR_INST_CD(struct.getIN_OPR_INST_CD());
	
			if (this.headerStruct.geth_WORK_STS_TYP().equals("9")) {
				//完了のためエラー
				setErrorMessage("AD00090");
				setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.OPR_INST_CD",this.headerStruct.getOPR_INST_CD());//系列仕掛.作業指示番号
				this.struct.seth_WORK_STS_TYP(this.headerStruct.geth_WORK_STS_TYP());
				return;
			}
	
			this.rsltStruct = new AD0040010Struct();
			this.rsltStruct.setOPR_INST_CD(this.headerStruct.getOPR_INST_CD());
			this.rsltStruct.setIN_OPR_INST_CD(this.struct.getIN_OPR_INST_CD());
			this.rsltStruct.seth_FINAL_PROC_FLG(this.headerStruct.geth_FINAL_PROC_FLG());
	
			// Add Start 20140303 liuj
			this.rsltStruct.seth_PROCESS_MANAGE_FLG(this._processManageFlg);
			// Add End 20140303 liuj
			//最大分作回数＋１のセット
			tempList = entity.mSelectMaxPrdNo.read(conn, this.rsltStruct);
			//検索結果は必ずある
			AD0040010Struct tempStruct = (AD0040010Struct)tempList. get(0);
			this.rsltStruct.setPARTIAL_PRD_NO(tempStruct.getPARTIAL_PRD_NO());
	
			//作業日(日付制御.業務運用日)のセット
			setBussinessOprDate();
			this.rsltStruct.setOPR_DATE(_oprDate);

			this.rsltStruct.seth_BUSINESS_OPR_DATE(_oprDate);
			
			// 保管区コードのセット
			this.rsltStruct.setITEM_CD(this.headerStruct.getITEM_CD());
			this.rsltStruct.setPLANT_CD(this.sysPLANT_CD);
			// Mod Start 20140214 liuj
			//this.rsltStruct.setWH_CD(ValidateWh.getDefaultOprWh(
			//		conn, getsysPLANT_CD(), this.rsltStruct.getITEM_CD()));
			// システムパラメータ：　”工程保管場所の在庫を管理する”が”ＯＮ”場合
			if ("1".equals(this._processManageFlg)){ 
				// 最終工程の場合
				if ("1".equals(this.rsltStruct.geth_FINAL_PROC_FLG())){
					// 入出庫管理 規定保管区の取得 の 【入庫元保管区既定値取得】に従い取得した保管区コード
					this.rsltStruct.setWH_CD(ValidateWh.getDefaultOprWh(
							conn, getsysPLANT_CD(), this.rsltStruct.getITEM_CD()));
				} else {
					// 次工程の作業区コードから作業区に登録されている保管区コードを取得する
					List whList = entity.mgetNEXT_WH_CD.read(conn, rsltStruct);
					if (!whList.isEmpty()){
						this.rsltStruct.setWH_CD(((AD0040010Struct)whList.get(0)).getNEXT_WH_CD());
					}
				}
			} else {
				// システムパラメータ：　”工程保管場所の在庫を管理する”が”OFF”場合
				// 入出庫管理 規定保管区の取得 の 【入庫元保管区既定値取得】に従い取得した保管区コード
				this.rsltStruct.setWH_CD(ValidateWh.getDefaultOprWh(
						conn, getsysPLANT_CD(), this.rsltStruct.getITEM_CD()));
			}
			// Mod End 20140214 liuj
			
			if(StringUtil.Validate(this.rsltStruct.getWH_CD())){
				tempList = entity.mM_WH.read(conn,this.rsltStruct);
				this.rsltStruct.setWH_NAME(((AD0040010Struct)tempList.get(0)).getWH_NAME());
			}

			//良品数のセット
			//作業指示数
			BigDecimal instQty = new BigDecimal(this.headerStruct.getOPR_INST_QTY());
			//良品数累計
			BigDecimal acptQty = new BigDecimal(this.headerStruct.getSUM_ACPT_QTY());
			//不良品累計
			BigDecimal defectQty = new BigDecimal(this.headerStruct.getSUM_DEFECT_QTY());
			//作業指示数-(良品数累計+不良品数累計)
			BigDecimal sum = instQty.subtract(acptQty.add(defectQty));
	
			if (sum.doubleValue() < 0) {
				this.rsltStruct.setACPT_QTY("0.0");
			} else {
				this.rsltStruct.setACPT_QTY(sum.toString());
			}
	
			//その他項目セット
			this.rsltStruct.setDEFECT_QTY("0.0");
			this.rsltStruct.setWS_CD(this.headerStruct.getWS_CD());
			this.rsltStruct.setWS_NAME(this.headerStruct.getWS_NAME());
			this.rsltStruct.setPRE_ARRANGEMENT_TIME("0.0");
			this.rsltStruct.setOPR_TIME("0.0");
			this.rsltStruct.setPOST_ARRANGEMENT_TIME("0.0");
			this.rsltStruct.setCESSATION_TIME("0.0");
			this.rsltStruct.setc_COMPLETE("true");
			this.rsltStruct.setSTOCK_UNIT(this.headerStruct.getSTOCK_UNIT());
			this.rsltStruct.setTIME_CTRL(struct.getTIME_CTRL());
			
			if ("1".equals(_outputFlg)) {
				this.rsltStruct.setc_OUTPUT("true");
			}else{
				this.rsltStruct.setc_OUTPUT("false");
			}
			this.rsltStruct.setLOT_NO("");
			this.rsltStruct.setLOT_NUMBERING_TYP(this.headerStruct.getLOT_NUMBERING_TYP());
			this.rsltStruct.setLOT_CTRL_FLG(this.headerStruct.getLOT_CTRL_FLG());
			this.struct.setStructM(this.rsltStruct);
			this.keepRsltStruct.setStructM(this.rsltStruct);
			this.keepRsltStruct.setACPT_QTY("0.0");
			this.keepRsltStruct.setDEFECT_QTY("0.0");
	

			//作業不良リストの設定
			this.defectStruct = null;
			for (int i = 0; i < DISPLAY_NUMBER; i++) {
				AD0040010Struct viewStruct = new AD0040010Struct();
				viewStruct.setl_DEFECT_QTY("0");
				this.defectList.add(viewStruct);
			}

			_rsltExeType = 0;//登録処理

			setReadStatus(NORMAL);
			
		} catch (NumberFormatException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			throw new ExpjException(e, emsg);
		} catch (SQLException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			throw new ExpjException(e, emsg);
		}


                //}}user_implement_dev:<controlLineInsert>
		logger.exiting("AD0040010Control"+":USER="+struct.getsUser_ID(),"controlLineInsert");

		return;
	}

	/**
	 * 行修正ボタン押下時に実行される処理です。
	 *
	 */
	public void controlLineUpdate() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0040");
		logger.entering("AD0040010Control"+":USER="+struct.getsUser_ID(),"controlLineUpdate");
			//{{user_implement_dev:<controlLineUpdate>


		try {
			GetTimeCtrl();
			
			//印刷フラグクリア
			_printFlg = "0";
			_downloadFile = null;
			struct.setDOWNLOAD_FILE("");
			
			List partialPrdNoList = new ArrayList();
			partialPrdNoList = struct.getList_PARTIAL_PRD_NO();
			this.struct.setPARTIAL_PRD_NO((String) partialPrdNoList.get(0));

			//ヘッダ検索
			List tempList = new ArrayList();
			tempList = entity.mSelectHeader.read(conn, struct);
			if (tempList.isEmpty()) {
				setErrorMessage("ZZ01101");
				setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.OPR_INST_CD", struct.getIN_OPR_INST_CD());//系列別仕掛.作業指示番号
				setReadStatus(NOT_FOUND);
				return;
			}
			this.headerStruct = new AD0040010Struct();
			this.headerStruct = (AD0040010Struct)tempList.get(0);
			headerStruct.setMRP_ODR_TYP_DN(multcombo("MRP_ODR_TYP",headerStruct.getMRP_ODR_TYP()));
			setStandardItem(headerStruct);
			this.headerStruct.setIN_OPR_INST_CD(struct.getIN_OPR_INST_CD());
	
			if ("9".equals(this.headerStruct.geth_WORK_STS_TYP())) {
				//完了のためエラー
				setErrorMessage("AD00090");
				setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.OPR_INST_CD",this.headerStruct.getOPR_INST_CD());//系列仕掛.作業指示番号
				this.struct.seth_WORK_STS_TYP(this.headerStruct.geth_WORK_STS_TYP());
				return;
			}

			//作業実績検索
			AD0040010Struct tempStruct= new AD0040010Struct();
			tempList = entity.mSelect.read(conn, struct);
			if (tempList.isEmpty()) {
				setErrorMessage("ZZ06001");
				setWarningSysLogMessage("T_OPR_RSLT.OPR_INST_CD", struct.getIN_OPR_INST_CD());//作業指示番号
				setWarningSysLogMessage("T_OPR_RSLT.PARTIAL_PRD_NO", struct.getPARTIAL_PRD_NO());
				return;
			}
			for (int i = 0; i < tempList.size(); i++ ) {
				tempStruct = (AD0040010Struct)tempList.get(i);
				if (struct.getPARTIAL_PRD_NO().equals(tempStruct.getPARTIAL_PRD_NO())) {
					this.rsltStruct.setStructM(tempStruct);
					setStandardItem(rsltStruct);
				}
			}
			this.rsltStruct.setc_COMPLETE("false");
			this.rsltStruct.setIN_OPR_INST_CD(this.struct.getIN_OPR_INST_CD());
			this.rsltStruct.setOPR_INST_CD(this.struct.getIN_OPR_INST_CD());
			this.rsltStruct.setPARTIAL_PRD_NO(this.struct.getPARTIAL_PRD_NO());

			
			if ("1".equals(_outputFlg)) {
				this.rsltStruct.setc_OUTPUT("true");
			}else{
				this.rsltStruct.setc_OUTPUT("false");
			}
			
			DateTimeFormat dtf = new DateTimeFormat(conn);

			this.rsltStruct.setOPRATION_TIME(dtf.getTimePart(rsltStruct.getOPR_DATE()));
			this.rsltStruct.setOPR_DATE(dtf.getDatePart(rsltStruct.getOPR_DATE()));

			//作業不良リストの取得defectListFlg
			this.defectStruct = null;
			this.defectList = entity.mSelectDefectList.read(conn, this.rsltStruct);
			for (int i = 0; i < DISPLAY_NUMBER; i++) {
				AD0040010Struct viewStruct = new AD0040010Struct();
				viewStruct.setl_DEFECT_QTY("0");
				this.defectList.add(viewStruct);
			}

			//業務運用日のセット
			setBussinessOprDate();
			this.rsltStruct.seth_BUSINESS_OPR_DATE(_oprDate);
			this.rsltStruct.seth_OPR_DATE(this.struct.getOPR_DATE());
			this.rsltStruct.setIN_OPR_INST_CD(this.struct.getIN_OPR_INST_CD());
			this.rsltStruct.setPARTIAL_PRD_NO(this.struct.getPARTIAL_PRD_NO());
			this.rsltStruct.seth_FINAL_PROC_FLG(this.headerStruct.geth_FINAL_PROC_FLG());
			this.rsltStruct.setSTOCK_UNIT(this.headerStruct.getSTOCK_UNIT());
			
			this.rsltStruct.setLOT_NUMBERING_TYP(this.headerStruct.getLOT_NUMBERING_TYP());
			this.rsltStruct.setLOT_CTRL_FLG(this.headerStruct.getLOT_CTRL_FLG());
			
			// Add Start 20140303 liuj
			this.rsltStruct.seth_PROCESS_MANAGE_FLG(this._processManageFlg);
			// Add End 20140303 liuj
			
			this.struct.setStructM(this.rsltStruct);
			this.keepRsltStruct.setStructM(this.rsltStruct);

			_rsltExeType = 1;//修正処理
			
			setReadStatus(NORMAL);
			
		} catch (NumberFormatException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			throw new ExpjException(e, emsg);
		} catch (SQLException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			throw new ExpjException(e, emsg);
		}


                //}}user_implement_dev:<controlLineUpdate>
		logger.exiting("AD0040010Control"+":USER="+struct.getsUser_ID(),"controlLineUpdate");

		return;
	}

	/**
	 * 一括更新ボタン押下時に実行される処理です。
	 *
	 */
	public void controlUpdateAll() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0040");
		logger.entering("AD0040010Control"+":USER="+struct.getsUser_ID(),"controlUpdateAll");
			//{{user_implement_dev:<controlUpdateAll>


		try {
			GetTimeCtrl();
			setBussinessOprDate();
			this.issueStruct = new AD0040010Struct();
			setStandardItem(issueStruct);

			List partialPrdNoList = new ArrayList();
			partialPrdNoList = struct.getList_PARTIAL_PRD_NO();
			this.struct.setPARTIAL_PRD_NO((String) partialPrdNoList.get(0));
			
			//ヘッダ検索
			List tempList = new ArrayList();
			tempList = entity.mSelectHeader.read(conn, struct);
			if (tempList.isEmpty()) {
				setErrorMessage("ZZ01101");
				setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.OPR_INST_CD", struct.getIN_OPR_INST_CD());//系列別仕掛.作業指示番号
				return;
			}
			this.headerStruct = new AD0040010Struct();
			this.headerStruct = (AD0040010Struct)tempList.get(0);
			headerStruct.setMRP_ODR_TYP_DN(multcombo("MRP_ODR_TYP",headerStruct.getMRP_ODR_TYP()));
			setStandardItem(headerStruct);
			this.headerStruct.setIN_OPR_INST_CD(struct.getIN_OPR_INST_CD());
			
			//品目別仕掛のmodifycount取得+作業実績区分の取得
			tempList = entity.mSelectWorkItem.read(conn, this.headerStruct);
			if (tempList.isEmpty()) {
				this.headerStruct.clear();
				setErrorMessage("ZZ01101");
				setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.OPR_INST_CD", struct.getIN_OPR_INST_CD());//品目別仕掛.作業指示番号
				return;
			}
			AD0040010Struct tempStruct = (AD0040010Struct)tempList.get(0);
			this.headerStruct.seth_ITEM_MODIFY_COUNT(tempStruct.geth_ITEM_MODIFY_COUNT());

			//作業実績検索
			tempList = entity.mSelect.read(conn, struct);
			if (tempList.isEmpty()) {
				setErrorMessage("ZZ01101");
				setWarningSysLogMessage("T_OPR_RSLT.OPR_INST_CD", struct.getIN_OPR_INST_CD());//作業指示番号
				setWarningSysLogMessage("T_ISSUE_INST.ISSUE_INST_CD", struct.geth_ISSUE_INST_CD());
				return;
			}
			tempStruct = (AD0040010Struct)tempList.get(0);
			this.headerStruct.setPARTIAL_PRD_NO(tempStruct.getPARTIAL_PRD_NO());
			this.headerStruct.setACPT_QTY(tempStruct.getACPT_QTY());
			this.headerStruct.setDEFECT_QTY(tempStruct.getDEFECT_QTY());
			this.headerStruct.setLOT_NO(tempStruct.getLOT_NO());
			//数値タイプ項目がnullの場合、0をセット
			zeroSet(this.headerStruct);

			List headerLotList = new ArrayList();

			//作業実績品目のロット管理フラグ = 1(ロットトレース管理を行う。)の場合
			if(headerStruct.getLOT_CTRL_FLG().equals("1")){
				//最終系列でない場合
				if (!this.headerStruct.geth_FINAL_PROC_FLG().equals("1")) {
					tempList = entity.mSelectParentLotNo.read(conn, this.headerStruct);
					if (tempList != null && tempList.size() != 0) {
						for (int i = 0; i < tempList.size(); i++) {
							tempStruct = (AD0040010Struct)tempList.get(i);
							headerLotList.add(tempStruct);
						}
					}
				//最終系列の場合
				} else {
					headerLotList.add(headerStruct);
				}
			}
		
			this.headerStruct.setPARTIAL_PRD_NO(struct.getPARTIAL_PRD_NO());
			this.issueStruct.setPARTIAL_PRD_NO(struct.getPARTIAL_PRD_NO());
			this.issueStruct.setJOB_ODR_CD(this.headerStruct.getJOB_ODR_CD());
			this.headerStruct.seth_ISSUE_INST_CD(struct.geth_ISSUE_INST_CD());
			//出庫指示リスト取得
			this.setIssueList();
			if (this.issueList.isEmpty()) {
				setErrorMessage("ZZ01101");
				setWarningSysLogMessage("T_OPR_RSLT.OPR_INST_CD", struct.getIN_OPR_INST_CD());//作業指示番号
				setWarningSysLogMessage("T_ISSUE_INST.ISSUE_INST_CD", struct.geth_ISSUE_INST_CD());
				return;
			}
			
			for (int i = 0; i < this.issueList.size(); i++ ) {
								
				this.issueStruct = new AD0040010Struct();
				this.issueStruct = (AD0040010Struct)this.issueList.get(i);
				setStandardItem(issueStruct);
				this.issueStruct.setPARTIAL_PRD_NO(this.struct.getPARTIAL_PRD_NO());
				this.issueStruct.setJOB_ODR_CD(this.headerStruct.getJOB_ODR_CD());

				if (this.issueStruct.getTEMP_USE_QTY() == null
						|| Double.parseDouble(this.issueStruct.getTEMP_USE_QTY()) == 0) {
					continue;
				}

				CollectNumber collectNum = 
						new CollectNumber(
							CollectNumber.ISSUE_CD,
							this.sysUSER_CD,
							this.sp.getProcId(),
							this.sysPLANT_CD);
				String no = collectNum.getNo();
				if (no == null || no.length() == 0) {
					//採番結果がない
					setErrorMessage("ZZ01106");
					return;
				}
	
				BigDecimal keepUseQty = new BigDecimal(this.issueStruct.getTEMP_USE_QTY());
	
				BigDecimal planQty = new BigDecimal(this.issueStruct.getTEMP_PLAN_QTY());
				BigDecimal useQty = new BigDecimal(this.issueStruct.getTEMP_USE_QTY());
				if (this.issueStruct.getUNIT_QTY_TYP() != null
						&& "1".equals(this.issueStruct.getUNIT_QTY_TYP())) {
					//品目が整数管理品の場合、切上げを行う
					useQty = useQty.setScale(0,BigDecimal.ROUND_UP);
				}
				//修正内容を保持
				this.issueStruct.setRCV_ISSUE_CTRL_CD(no);
				this.issueStruct.setPLANT_CD(this.sysPLANT_CD);
				this.issueStruct.setWORK_ODR_CD(this.headerStruct.getWORK_ODR_CD());
				this.issueStruct.setWORK_IN_PROC_CD(this.headerStruct.getWORK_IN_PROC_CD());
				this.issueStruct.setRCV_ISSUE_QTY(useQty.negate().toString());
				if (useQty.doubleValue() > 0) {
					//工程在庫出庫
					this.issueStruct.setRCV_ISSUE_GNR_TYP("41");
				} else {
					//工程在庫出庫取消
					this.issueStruct.setRCV_ISSUE_GNR_TYP("49");
				}

				this.issueStruct.setRCV_ISSUE_ODD_QTY(useQty.subtract(keepUseQty).toString());
				this.issueStruct.setOD_NO(this.headerStruct.getOD_NO());
				this.issueStruct.setUSER_CD(this.sysUSER_CD);
				this.issueStruct.setPRG_NM(this.sp.getProcId());
				this.issueStruct.setRCV_ISSUE_CMPLT_FLG("0");
				this.issueStruct.setSTOCK_UPD_TYP("2");
				this.issueStruct.setRCV_ISSUE_TYP("2");

				// Add Start 20140224 liuj
				// システムパラメータ：　”工程保管場所の在庫を管理する”が”1”の場合
				if ("1".equals(this._processManageFlg)){
					if (chkBeforeProc(headerStruct.getIN_OPR_INST_CD())){
						String strWhCd = getBeforeProc(headerStruct.getIN_OPR_INST_CD());
						this.issueStruct.setWH_CD(strWhCd);
					}
				}
				
				// Add Start 20140224 liuj

				//保管区コードのNULLチェック
				if (this.issueStruct.getWH_CD() == null 
						|| "".equals(this.issueStruct.getWH_CD())) {
					setErrorMessage("AD20060");
					setSupportMessage("T_ISSUE_INST.ITEM_CD", this.issueStruct.getITEM_CD());
					setWarningSysLogMessage("T_ISSUE_INST.ITEM_CD", this.issueStruct.getITEM_CD());//出庫指示.品目番号
					setWarningSysLogMessage("T_ISSUE_INST.ISSUE_INST_CD", this.issueStruct.geth_ISSUE_INST_CD());//出庫指示.出庫指示番号
					continue;
				}

				//保管区コードチェック
				tempList = entity.mSelectChkWhCd.read(conn,this.issueStruct);
				if(tempList == null || tempList.size() == 0){
  					setErrorMessage("AD00020");
					setSupportMessage("T_ISSUE_INST.ITEM_CD", this.issueStruct.getITEM_CD());
					setWarningSysLogMessage("T_ISSUE_INST.ITEM_CD", this.issueStruct.getITEM_CD());//出庫指示.品目番号
					setWarningSysLogMessage("T_ISSUE_INST.ISSUE_INST_CD", this.issueStruct.geth_ISSUE_INST_CD());//出庫指示.出庫指示番号
					setWarningSysLogMessage("M_WH.WH_CD",this.issueStruct.getWH_CD());//保管区.保管区コード
					continue;
				}

				tempStruct = (AD0040010Struct)tempList.get(0);
				this.issueStruct.setWH_NAME(tempStruct.getWH_NAME());
				//保管区コードの工場コードと作業系列別仕掛の工場コードの同一チェック
				if (tempStruct.getPLANT_CD() == null 
						|| !tempStruct.getPLANT_CD().equals(this.headerStruct.getPLANT_CD())) {
					setErrorMessage("AD00021");
					setSupportMessage("T_ISSUE_INST.ITEM_CD", this.issueStruct.getITEM_CD());
					setWarningSysLogMessage("T_ISSUE_INST.ITEM_CD", this.issueStruct.getITEM_CD());//出庫指示.品目番号
					setWarningSysLogMessage("T_ISSUE_INST.ISSUE_INST_CD", this.issueStruct.geth_ISSUE_INST_CD());//出庫指示.出庫指示番号
					setWarningSysLogMessage("M_WH.WH_CD", this.issueStruct.getWH_CD());//保管区.保管区コード
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.OPR_INST_CD", this.headerStruct.getWORK_ODR_CD());//系列別仕掛.作業指示番号
					continue;
				}

				//品目.品目手配区分が0【製番】、1【製番計画】以外で製番を入力された場合エラー
				tempList = entity.mSelectItem.read(conn,this.issueStruct);
				if (tempList.isEmpty()) {
					setErrorMessage("AD00019");
					setSupportMessage("T_ISSUE_INST.ITEM_CD", this.issueStruct.getITEM_CD());
					setWarningSysLogMessage("T_ISSUE_INST.ITEM_CD", this.issueStruct.getITEM_CD());//出庫指示.品目番号
					setWarningSysLogMessage("T_ISSUE_INST.ISSUE_INST_CD", this.issueStruct.geth_ISSUE_INST_CD());//出庫指示.出庫指示番号
					setWarningSysLogMessage("M_ITEM.ITEM_CD", tempStruct.getITEM_CD());//品目.品目番号
					continue;
				}

				tempStruct = (AD0040010Struct)tempList.get(0);
				//製番品（MRP_ODR_TYP = 1,2）以外の場合、使用元製番に「""」をset
				if(!("1".equals(this.issueStruct.getMRP_ODR_TYP()) 
						|| "2".equals(this.issueStruct.getMRP_ODR_TYP()))){
					this.issueStruct.setJOB_ODR_CD("");
				}
				if (tempStruct.getMRP_ODR_TYP() != null 
						&& !"1".equals(tempStruct.getMRP_ODR_TYP()) 
						&& !"2".equals(tempStruct.getMRP_ODR_TYP()) 
						&& this.issueStruct.getJOB_ODR_CD() != null 
						&& this.issueStruct.getJOB_ODR_CD().length() != 0) {
					setErrorMessage("AD00061");
					setSupportMessage("T_ISSUE_INST.ITEM_CD", this.issueStruct.getITEM_CD());
					setWarningSysLogMessage("T_ISSUE_INST.ITEM_CD", this.issueStruct.getITEM_CD());//出庫指示.品目番号
					setWarningSysLogMessage("T_ISSUE_INST.ISSUE_INST_CD", this.issueStruct.geth_ISSUE_INST_CD());//出庫指示.出庫指示番号
					setWarningSysLogMessage("M_ITEM.ITEM_CD", issueStruct.getITEM_CD());//品目.品目番号
					continue;
				}

				//製番チェック
				if(this.issueStruct.getJOB_ODR_CD() != null 
						&& this.issueStruct.getJOB_ODR_CD().length() != 0){
					if (tempStruct.getMRP_ODR_TYP() != null 
							&& ("1".equals(tempStruct.getMRP_ODR_TYP()) 
							|| "2".equals(tempStruct.getMRP_ODR_TYP()))) {
						tempList = entity.mSelectChkJobOdr.read(conn,this.issueStruct);
						if (tempList.isEmpty()) {
							setErrorMessage("AD00029");
							setSupportMessage("T_ISSUE_INST.ITEM_CD", this.issueStruct.getITEM_CD());
							setWarningSysLogMessage("T_ISSUE_INST.ITEM_CD", this.issueStruct.getITEM_CD());//出庫指示.品目番号
							setWarningSysLogMessage("T_ISSUE_INST.ISSUE_INST_CD", this.issueStruct.geth_ISSUE_INST_CD());//出庫指示.出庫指示番号
							setWarningSysLogMessage("M_ITEM.ITEM_CD", issueStruct.getITEM_CD());//品目.品目番号
							continue;
						}

						tempStruct = (AD0040010Struct)tempList.get(0);
						//製番計画の工場コードとユーザ工場コードの同一チェック
						if (tempStruct.getPLANT_CD() == null 
								|| !tempStruct.getPLANT_CD().equals(this.sysPLANT_CD)) {
							setErrorMessage("AD00016");
							setSupportMessage("T_ISSUE_INST.ITEM_CD", this.issueStruct.getITEM_CD());
							setWarningSysLogMessage("T_ISSUE_INST.ITEM_CD", this.issueStruct.getITEM_CD());//出庫指示.品目番号
							setWarningSysLogMessage("T_ISSUE_INST.ISSUE_INST_CD", this.issueStruct.geth_ISSUE_INST_CD());//出庫指示.出庫指示番号
							setWarningSysLogMessage("T_JOB_ODR.JOB_ODR_CD", issueStruct.getJOB_ODR_CD());//製番計画.製番
							continue;
						}
					}
				}
				
				// 退避用手持ち在庫数を初期化
				issueStruct.setSAVE_STOCK_ON_HAND_QTY("0");
	
				useQty = new BigDecimal(this.issueStruct.getTEMP_USE_QTY());
				BigDecimal stockQty = null;
				//工程仕掛在庫出庫処理
				if(this.issueStruct.getJOB_ODR_CD() == null 
						|| this.issueStruct.getJOB_ODR_CD().length() == 0){
					//保管区別品目在庫更新
					tempList = entity.mSelectItemStock.read(conn,this.issueStruct);
					AD0040010Struct stockStruct = new AD0040010Struct();
					stockStruct.setStructM(this.issueStruct);
					setStandardItem(stockStruct);
	
					if (tempList.isEmpty()) {
						//登録
						useQty = useQty.negate();
						stockStruct.setSTOCK_ON_HAND_QTY(useQty.toString());
						entity.mInsertItemStock.create(conn, stockStruct);
					} else {
						//更新
						tempStruct = (AD0040010Struct)tempList.get(0);
						issueStruct.setSAVE_STOCK_ON_HAND_QTY(tempStruct.getSTOCK_ON_HAND_QTY());
						stockQty = new BigDecimal(tempStruct.getSTOCK_ON_HAND_QTY());
						if (useQty.doubleValue() > 0) { //出庫
							useQty = stockQty.subtract(useQty) ;
						} else { //入庫
							useQty = stockQty.add(useQty.negate()) ;
						}
						stockStruct.setSTOCK_ON_HAND_QTY(useQty.toString());
	
						entity.mUpdateItemStock.update(conn, stockStruct);
					}
				} else {
					//製番仕掛在庫更新
					tempList = entity.mSelectOdrStock.read(conn,this.issueStruct);
					AD0040010Struct stockStruct = new AD0040010Struct();	
					stockStruct.setStructM(this.issueStruct);
					setStandardItem(stockStruct);
	
					if (tempList.isEmpty()) {
						//登録
						useQty = useQty.negate();
						stockStruct.setSTOCK_ON_HAND_QTY(useQty.toString());
						entity.mInsertOdrStock.create(conn,stockStruct);
					} else {
						//更新
						tempStruct = (AD0040010Struct)tempList.get(0);
						stockStruct.setJOB_ODR_DETAIL_NO(tempStruct.getJOB_ODR_DETAIL_NO());
						issueStruct.setSAVE_STOCK_ON_HAND_QTY(tempStruct.getSTOCK_ON_HAND_QTY());
						stockQty = new BigDecimal(tempStruct.getSTOCK_ON_HAND_QTY());
						if (useQty.doubleValue() > 0) { 
							//出庫
							useQty = stockQty.subtract(useQty) ;
						} else {
							//入庫
							useQty = stockQty.add(useQty.negate()) ;
						}
						stockStruct.setSTOCK_ON_HAND_QTY(useQty.toString());
	
						entity.mUpdateOdrStock.update(conn,stockStruct);
					}
				}

				this.issueStruct.setOPR_RSLT_CRCT_NO("0");  //作業実績訂正回数
				//会社コード
				this.issueStruct.setCOMPANY_CD(_company_cd);

				// ロット管理フラグ = 1(ロットトレース管理を行う。)の場合
				if (issueStruct.getLOT_CTRL_FLG().equals("1")) {
					// 出庫実績明細取得
					List lotIssueList = entity.mT_LOT_ISSUE_INST.read(conn,this.issueStruct);

					// データがない場合
					if (lotIssueList == null || lotIssueList.size() == 0) {
						setErrorMessage("AD20135");
						setSupportMessage("T_ISSUE_INST.ITEM_CD",this.issueStruct.getITEM_CD());
						setWarningSysLogMessage("T_LOT_ISSUE_INST.ISSUE_INST_CD",
								this.issueStruct.geth_ISSUE_INST_CD());// 出庫指示番号
						setWarningSysLogMessage("T_LOT_ISSUE_INST.ITEM_CD",this.issueStruct.getITEM_CD());// 品目番号
						setWarningSysLogMessage("T_LOT_ISSUE_INST.WORK_ODR_CD",this.issueStruct.getWORK_ODR_CD());
						// 作業計画番号
						return;
					}

					// 使用残数設定
					BigDecimal remainQty = new BigDecimal(this.issueStruct.getTEMP_USE_QTY());

					AD0040010Struct lotUseStruct = new AD0040010Struct();
					lotUseStruct.setStructM(this.issueStruct);
					setStandardItem(lotUseStruct);

					for (int j = 0; j < lotIssueList.size(); j++) {
						AD0040010Struct lotIssueStruct = (AD0040010Struct) lotIssueList.get(j);

						// 引き当て可能数設定
						BigDecimal issueQty = new BigDecimal(lotIssueStruct.getISSUE_QTY());
						BigDecimal spentQty = new BigDecimal(lotIssueStruct.getSPENT_QTY());
						BigDecimal availQty = issueQty.subtract(spentQty);

						// ロット別使用実績管理番号採番
						List seqList = entity.mSEQ_JF_RSLT.read(conn, struct);
						if (seqList != null && seqList.size() > 0) {
							lotUseStruct.setRSLT_CTL_SEQ_NO(((AD0040010Struct) seqList.get(0)).getNEXTVAL());
						}

						// ロット番号設定
						lotUseStruct.setLOT_NO(lotIssueStruct.getLOT_NO());

						BigDecimal useLotQty = null;

						// 引き当て可能数 >= 使用残数の場合
						if (availQty.doubleValue() >= remainQty.doubleValue()) {
							// 使用残数を引き当て数に設定
							useLotQty = remainQty;
							// 引き当て可能数 < 使用残数の場合
						} else {
							// 最終データの場合
							if (j == lotIssueList.size() - 1) {
								// 使用残数を使用数に設定
								useLotQty = remainQty;
								// 最終データでない場合
							} else {
								// 引当可能数が0より大きい場合
								if (availQty.doubleValue() > 0) {
									// 使用残数を使用数に設定
									useLotQty = remainQty;

									// 次レコード以降を取得
									for (int k = j + 1; k < lotIssueList.size(); k++) {
										AD0040010Struct nextLotIssueStruct = (AD0040010Struct) lotIssueList.get(k);

										// 引き当て可能数設定
										BigDecimal nextIssueQty = new BigDecimal(nextLotIssueStruct.getISSUE_QTY());
										BigDecimal nextSpentQty = new BigDecimal(nextLotIssueStruct.getSPENT_QTY());
										BigDecimal nextAvailQty = nextIssueQty.subtract(nextSpentQty);

										// 次レコード以降に引当可能なデータがある場合
										if (nextAvailQty.doubleValue() > 0) {
											// 引き当て可能数を使用数に設定
											useLotQty = availQty;
											break;
										}
									}
									// 引当可能数が0以下の場合
								} else {
									// 次のデータを取得
									continue;
								}
							}
						}

						// 使用数が引当可能数より大きい場合
						if (useLotQty.doubleValue() > availQty.doubleValue()) {
							// メッセージ出力
							setWarningMessage("AD20136");
							setWarningSysLogMessage("T_ISSUE_INST.ITEM_CD",this.issueStruct.getITEM_CD());
							setWarningSysLogMessage("T_LOT_ISSUE_INST.ISSUE_INST_CD",
									this.issueStruct.geth_ISSUE_INST_CD());// 出庫指示番号
							setWarningSysLogMessage("T_LOT_ISSUE_INST.ITEM_CD",this.issueStruct.getITEM_CD());
							// 品目番号
							setWarningSysLogMessage("T_LOT_ISSUE_INST.WORK_ODR_CD",this.issueStruct.getWORK_ODR_CD());
							// 作業計画番号
						}

						// 使用済数量、使用予定数量に上記で設定した使用数を設定
						lotUseStruct.setTOTAL_ISSUE_QTY(useLotQty.toString());
						lotUseStruct.setSUPPLIED_ISSUE_QTY(useLotQty.toString());

						// 実績日を使用日に設定
						lotUseStruct.setSUPPLIED_DATE(lotUseStruct.getOPR_DATE());

						// [ロット別使用実績]の追加
						entity.mT_LOT_USE_RSLT.create(conn, lotUseStruct);

						// [出庫実績明細]の更新
						lotUseStruct.setSPENT_QTY(spentQty.add(useLotQty).toString());
						entity.mT_LOT_ISSUE_INST.update(conn, lotUseStruct);

						this.issueStruct.setLOT_NO(lotIssueStruct.getLOT_NO());
						this.issueStruct.setRCV_ISSUE_QTY(useLotQty.negate().toString());

						// ロット別品目在庫検索
						tempList = entity.mT_LOT_STOCK.read(conn,this.issueStruct);

						// 更新前の在庫数設定
						if (tempList.isEmpty()) {
							issueStruct.setSAVE_STOCK_ON_HAND_QTY("0");
						} else {
							tempStruct = (AD0040010Struct) tempList.get(0);
							issueStruct.setSAVE_STOCK_ON_HAND_QTY(tempStruct.getSTOCK_ON_HAND_QTY());
						}

						// 2件目以降のデータの場合
						if (j > 0) {
							// 入出庫管理番号採番
							collectNum = new CollectNumber(CollectNumber.ISSUE_CD, this.sysUSER_CD,this.sp.getProcId(), this.sysPLANT_CD);
							no = collectNum.getNo();
							if (no == null || no.length() == 0) {
								// 採番結果がない
								setErrorMessage("ZZ01106");
								return;
							}
							this.issueStruct.setRCV_ISSUE_CTRL_CD(no);
						}
						// Add Start 20140307 liuj
						this.issueStruct.setRCV_ISSUE_AFTER_QTY(this.issueStruct.getRCV_ISSUE_QTY());
						// Add End   20140307 liuj
						entity.mInsertRecvIssue.create(conn, this.issueStruct);

						// ロット別品目在庫更新
						BizCommon bc = new BizCommon(conn, getsysUSER_CD(), sp.getProcId(), getsysPLANT_CD());
						List updateLotStockList = bc.excUpdateLotStockFd(no, "");

						// 異常終了の場合
						if (bc.getResultStatus().intValue() == 3) {
							// エラーメッセージ取得
							if (updateLotStockList != null&& updateLotStockList.size() > 0) {
								setErrorMessage((String) updateLotStockList.get(0));
							}
							return;
						}

						// 作業実績品目のロット管理フラグ = 1(ロットトレース管理を行う。)の場合
						if (headerStruct.getLOT_CTRL_FLG().equals("1")) {
							// 親品目の実績入力済みの場合
							if (headerLotList != null&& headerLotList.size() > 0) {
								for (int k = 0; k < headerLotList.size(); k++) {
									AD0040010Struct headerLotStruct = (AD0040010Struct) headerLotList.get(k);
									// 親品目の在庫ロット番号が指定されている場合
									if (headerLotStruct.getLOT_NO() != null&& !headerLotStruct.getLOT_NO().equals("")) {
										// ロットトレース登録・更新処理
										List lotTraceList = bc.excMakeLotTraceFd(this.issueStruct.getITEM_CD(),
												this.issueStruct.getLOT_NO(),headerStruct.getITEM_CD(),
												headerLotStruct.getLOT_NO(),"2");

										// 異常終了の場合
										if (bc.getResultStatus().intValue() == 3) {
											// エラーメッセージ取得
											if (lotTraceList != null && lotTraceList.size() > 0) {
												setErrorMessage((String) lotTraceList.get(0));
											}
											return;
										} else {
											// 正常終了の場合、元品目番号と元ロット番号によて、「受入実績」を検索
											tempStruct = new AD0040010Struct();
											tempStruct.setFROM_ITEM_CD(this.issueStruct.getITEM_CD());
											tempStruct.setFROM_LOT_NO(this.issueStruct.getLOT_NO());

											List puchOdrList = entity.mgetFROM_PUCH_ODR_CD.read(conn, tempStruct);
											// データが存在するの場合、元品目は外作品、発注番号を[ロットトレース]に更新
											if (puchOdrList != null && puchOdrList.size() > 0) {
												// 発注番号と受入回数をソート順（降順）にし、１件目のレコードを取得する
												AD0040010Struct puchOdrStruct = (AD0040010Struct)puchOdrList.get(0);

												// [ロットトレース].“先品目番号”
												tempStruct.setTO_ITEM_CD(headerStruct.getITEM_CD());
												// [ロットトレース].“先ロット番号”
												tempStruct.setTO_LOT_NO(headerLotStruct.getLOT_NO());
												// [ロットトレース].“元発注番号”
												tempStruct.setFROM_PUCH_ODR_CD(puchOdrStruct.getFROM_PUCH_ODR_CD());
												// [ロットトレース].“先発注番号”
												tempStruct.setTO_PUCH_ODR_CD("");
												// ユーザコード
												tempStruct.setsUser_ID(getsysUSER_CD());
												entity.mupdateT_LOT_TRACE.update(conn, tempStruct);
											}
										}
									}
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
					// Add Start 20140307 liuj
					this.issueStruct.setRCV_ISSUE_AFTER_QTY(this.issueStruct.getRCV_ISSUE_QTY());
					// Add End   20140307 liuj
					entity.mInsertRecvIssue.create(conn, this.issueStruct);
				}
			}
	
			conn.commit();
			
			// 作業完了のワーニングメッセージ表示制御
			warningFlg = WARNING_NOTHING;
			
			//再検索
			controlSelect();

		} catch (NumberFormatException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			setSeverSysLogMessage("T_OPR_RSLT.OPR_INST_CD", struct.getIN_OPR_INST_CD());//作業指示番号
			setSeverSysLogMessage("T_OPR_RSLT.PARTIAL_PRD_NO", struct.getPARTIAL_PRD_NO());
			setSeverSysLogMessage("T_ISSUE_INST.ITEM_CD", this.issueStruct.getITEM_CD());//品目番号
			setSeverSysLogMessage("T_ISSUE_INST.ISSUE_INST_CD", this.issueStruct.geth_ISSUE_INST_CD());//出庫指示番号
			throw new ExpjException(e, emsg);
		} catch (SQLException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			setSeverSysLogMessage("T_OPR_RSLT.OPR_INST_CD", struct.getIN_OPR_INST_CD());//作業指示番号
			setSeverSysLogMessage("T_OPR_RSLT.PARTIAL_PRD_NO", struct.getPARTIAL_PRD_NO());
			setSeverSysLogMessage("T_ISSUE_INST.ITEM_CD", this.issueStruct.getITEM_CD());//品目番号
			setSeverSysLogMessage("T_ISSUE_INST.ISSUE_INST_CD", this.issueStruct.geth_ISSUE_INST_CD());//出庫指示番号
			throw new ExpjException(e, emsg);
		} catch (Exception e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			setSeverSysLogMessage("T_OPR_RSLT.OPR_INST_CD", struct.getIN_OPR_INST_CD());//作業指示番号
			setSeverSysLogMessage("T_OPR_RSLT.PARTIAL_PRD_NO", struct.getPARTIAL_PRD_NO());
			setSeverSysLogMessage("T_ISSUE_INST.ITEM_CD", this.issueStruct.getITEM_CD());//品目番号
			setSeverSysLogMessage("T_ISSUE_INST.ISSUE_INST_CD", this.issueStruct.geth_ISSUE_INST_CD());//出庫指示番号
			throw new ExpjException(e, emsg);
		} finally {
			try {
				if (conn != null) {
					conn.rollback();
				}
			} catch(Exception e) {
				setReadStatus(ERROR);
				ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
				sysLog.severe(emsg, getsysUSER_CD());
				throw new ExpjException(e, emsg);
			}
		}


                //}}user_implement_dev:<controlUpdateAll>
		logger.exiting("AD0040010Control"+":USER="+struct.getsUser_ID(),"controlUpdateAll");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0040");
		logger.entering("AD0040010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>


		setReadStatus(INITIAL);
		
		this.listClear();
		this.structClear();
		
		_rsltListflg = 0;
		_issueListflg = 0;
		_printFlg = "0";

		//初期値の設定
		mainInitialize();
		

                //}}user_implement_dev:<controlClear>
		logger.exiting("AD0040010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * 登録ボタン押下時に実行される処理です。
	 *
	 */
	public void controlInsert11() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0040");
		logger.entering("AD0040010Control"+":USER="+struct.getsUser_ID(),"controlInsert11");
			//{{user_implement_dev:<controlInsert11>


		controlUpdate11();

		
                //}}user_implement_dev:<controlInsert11>
		logger.exiting("AD0040010Control"+":USER="+struct.getsUser_ID(),"controlInsert11");

		return;
	}

	/**
	 * 戻るボタン押下時に実行される処理です。
	 *
	 */
	public void controlReturn11() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0040");
		logger.entering("AD0040010Control"+":USER="+struct.getsUser_ID(),"controlReturn11");
			//{{user_implement_dev:<controlReturn11>

		this.struct.setPARTIAL_PRD_NO(null);

			// 作業完了のワーニングメッセージ表示制御
			warningFlg = WARNING_NOTHING;

		//再検索
		controlSelect();


                //}}user_implement_dev:<controlReturn11>
		logger.exiting("AD0040010Control"+":USER="+struct.getsUser_ID(),"controlReturn11");

		return;
	}

	/**
	 * 登録ボタン押下時に実行される処理です。
	 *
	 */
	public void controlInsert12() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0040");
		logger.entering("AD0040010Control"+":USER="+struct.getsUser_ID(),"controlInsert12");
			//{{user_implement_dev:<controlInsert12>


		try {
			
			// 生産側の過去の実績入力の制限チェック
			if(getSysParameter() == false){
				if(chkProcExecDate("1","",struct.getRCV_ISSUE_DATE()) == false){
					setErrorMessage(ProcExecDateError);
					setErrorParameter("SYS_ACTUAL_COST_CTRL_AC", "PLANT_CD", struct.getPLANT_CD());
					setErrorParameter("SYS_ACTUAL_COST_CTRL_AC", "PROC_EXEC_DATE", struct.getPROC_EXEC_DATE().toString());
					return;
				}
			}
						this.issueStruct = new AD0040010Struct();
			setStandardItem(issueStruct);
			//修正内容を保持
			this.issueStruct.setITEM_CD(this.struct.getITEM_CD());
			this.issueStruct.setWH_CD(this.struct.getWH_CD());
			this.issueStruct.setJOB_ODR_CD(this.struct.getJOB_ODR_CD());
			this.issueStruct.setRCV_ISSUE_DATE(this.struct.getRCV_ISSUE_DATE());
			this.issueStruct.setRCV_ISSUE_COMMENT(this.struct.getRCV_ISSUE_COMMENT());
			this.issueStruct.setTEMP_PLAN_QTY(this.struct.getTEMP_PLAN_QTY());
			this.issueStruct.setTEMP_USEOVER_QTY(this.struct.getTEMP_USEOVER_QTY());
			this.issueStruct.setTEMP_PLANOUT_QTY(this.struct.getTEMP_PLANOUT_QTY());
			this.issueStruct.setTEMP_USE_QTY(this.struct.getTEMP_USE_QTY());
			this.issueStruct.setRCV_ISSUE_DATE(this.struct.getRCV_ISSUE_DATE());
			this.issueStruct.setLOT_NO(this.struct.getLOT_NO());
			this.issueStruct.setVEND_LOT_NO(this.struct.getVEND_LOT_NO());
		  // 入出庫年月日の時刻
		  if (null == this.struct.getRCV_ISSUE_TIME() || "".equals(this.struct.getRCV_ISSUE_TIME())){
			  this.issueStruct.setRCV_ISSUE_TIME("0000");
		  }else{
				this.struct.setRCV_ISSUE_TIME(AppendZero(this.struct.getRCV_ISSUE_TIME(),4));
				this.issueStruct.setRCV_ISSUE_TIME(this.struct.getRCV_ISSUE_TIME());
			}
		    this.issueStruct.setRCV_ISSUE_COMMENT(this.struct.getRCV_ISSUE_COMMENT());
			this.issueStruct.setTEMP_PLAN_QTY(this.struct.getTEMP_PLAN_QTY());
			this.issueStruct.setTEMP_USEOVER_QTY(this.struct.getTEMP_USEOVER_QTY());
			this.issueStruct.setTEMP_PLANOUT_QTY(this.struct.getTEMP_PLANOUT_QTY());
			this.issueStruct.setTEMP_USE_QTY(this.struct.getTEMP_USE_QTY());
			this.issueStruct.setRCV_ISSUE_DATE(this.struct.getRCV_ISSUE_DATE());
			this.issueStruct.setVEND_LOT_NO(this.struct.getVEND_LOT_NO());

			this.issueStruct.setRCV_ISSUE_CMPLT_FLG("0");
			this.issueStruct.setSTOCK_UPD_TYP("2");
			this.issueStruct.setRCV_ISSUE_TYP("2");
			this.issueStruct.setPLANT_CD(this.sysPLANT_CD);
			this.issueStruct.setUSER_CD(this.sysUSER_CD);
			this.issueStruct.setPRG_NM(this.sp.getProcId());
			this.issueStruct.setIN_OPR_INST_CD(struct.getIN_OPR_INST_CD());
			this.issueStruct.seth_ITEM_MODIFY_COUNT(struct.geth_ITEM_MODIFY_COUNT());
			this.issueStruct.setPARTIAL_PRD_NO(struct.getPARTIAL_PRD_NO());
			this.issueStruct.seth_ISSUE_INST_CD(struct.geth_ISSUE_INST_CD());
			
			List headerLotList = new ArrayList();
			
			//ヘッダ検索
			List tempList = new ArrayList();
			tempList = entity.mSelectHeader.read(conn, struct);		
			if (tempList.isEmpty()) {
				setErrorMessage("ZZ01101");
				setWarningSysLogMessage("T_OPR_RSLT.OPR_INST_CD", struct.getIN_OPR_INST_CD());
				setWarningSysLogMessage("T_OPR_RSLT.PARTIAL_PRD_NO", struct.getPARTIAL_PRD_NO());
				setReadStatus(NOT_FOUND);
				return;
			}
			this.headerStruct = new AD0040010Struct();
			this.headerStruct = (AD0040010Struct)tempList.get(0);
			headerStruct.setMRP_ODR_TYP_DN(multcombo("MRP_ODR_TYP",headerStruct.getMRP_ODR_TYP()));
			setStandardItem(headerStruct);
			this.headerStruct.setIN_OPR_INST_CD(struct.getIN_OPR_INST_CD());
			this.issueStruct.setOD_NO(this.headerStruct.getOD_NO());
			this.issueStruct.setWORK_ODR_CD(this.headerStruct.getWORK_ODR_CD());
			this.issueStruct.setWORK_IN_PROC_CD(this.headerStruct.getWORK_IN_PROC_CD());
			
			
			//入出庫番号採番
			CollectNumber collectNum = 
					new CollectNumber(
						CollectNumber.ISSUE_CD,
						this.sysUSER_CD,
						this.sp.getProcId(),
						this.sysPLANT_CD);
			String no = collectNum.getNo();
			if (no == null || no.length() == 0) {
				//採番結果がない
				setErrorMessage("ZZ01106");
				return;
			}
			this.issueStruct.setRCV_ISSUE_CTRL_CD(no);
			
			BigDecimal keepUseQty = new BigDecimal(this.issueKeepStruct.getTEMP_USE_QTY());
			
			BigDecimal planQty = new BigDecimal(this.struct.getTEMP_PLAN_QTY());
			BigDecimal useQty  = new BigDecimal(this.struct.getTEMP_USE_QTY());
			BigDecimal useQty2 = new BigDecimal("0");
			useQty2 = useQty.setScale(0,BigDecimal.ROUND_UP);
			if (this.issueStruct.getUNIT_QTY_TYP() != null 
					&& "1".equals(this.issueStruct.getUNIT_QTY_TYP())) {
				//品目が整数管理品の場合、切上げを行う
				useQty = useQty.setScale(0,BigDecimal.ROUND_UP);
			}
			
			//保管区コードチェック
			tempList = entity.mSelectChkWhCd.read(conn,this.issueStruct);
			AD0040010Struct tempStruct = null;
			if (tempList.isEmpty()) {
				setErrorMessage("AD00020");
				setWarningSysLogMessage("T_OPR_RSLT.OPR_INST_CD", struct.getIN_OPR_INST_CD());
				setWarningSysLogMessage("T_OPR_RSLT.PARTIAL_PRD_NO", struct.getPARTIAL_PRD_NO());
				setWarningSysLogMessage("M_WH.WH_CD",this.issueStruct.getWH_CD());//保管区.保管区コード
			} else {
				tempStruct = (AD0040010Struct)tempList.get(0);
				this.issueStruct.setWH_NAME(tempStruct.getWH_NAME());
				//保管区コードの工場コードと作業系列別仕掛の工場コードの同一チェック
				if (tempStruct.getPLANT_CD() == null 
						|| !tempStruct.getPLANT_CD().equals(this.headerStruct.getPLANT_CD())) {
					setErrorMessage("AD00021");
					setWarningSysLogMessage("T_OPR_RSLT.OPR_INST_CD", struct.getIN_OPR_INST_CD());
					setWarningSysLogMessage("T_OPR_RSLT.PARTIAL_PRD_NO", struct.getPARTIAL_PRD_NO());
					setWarningSysLogMessage("M_WH.WH_CD", this.issueStruct.getWH_CD());//保管区.保管区コード
				}
			}
			
			//品目が存在しない、品目.品目手配区分が
			//0【製番】、1【製番計画】以外で製番を入力された場合エラー
			tempList = entity.mSelectItem.read(conn,this.issueStruct);
			if (tempList.isEmpty()) {
				setErrorMessage("AD00019");
				setWarningSysLogMessage("T_OPR_RSLT.OPR_INST_CD", struct.getIN_OPR_INST_CD());
				setWarningSysLogMessage("T_OPR_RSLT.PARTIAL_PRD_NO", struct.getPARTIAL_PRD_NO());
				setWarningSysLogMessage("M_ITEM.ITEM_CD", issueStruct.getITEM_CD());//品目.品目番号
			} else {
				tempStruct = (AD0040010Struct)tempList.get(0);
// ▼▼ 2008/08/12 ADD START -TSUCHIDA▼▼
				// [品目].工数管理品目区分 = 1:工数管理品目の場合エラー
				if (tempStruct.getMANHOUR_TYP() != null
						&& "1".equals(tempStruct.getMANHOUR_TYP())){
					setErrorMessage("AD00116");
					setWarningSysLogMessage("T_OPR_RSLT.OPR_INST_CD", struct.getIN_OPR_INST_CD());
					setWarningSysLogMessage("T_OPR_RSLT.PARTIAL_PRD_NO", struct.getPARTIAL_PRD_NO());
					setWarningSysLogMessage("M_ITEM.ITEM_CD", issueStruct.getITEM_CD());//品目.品目番号
				}
// ▲▲ 2008/08/12 ADD END -TSUCHIDA▲▲
				if (tempStruct.getMRP_ODR_TYP() != null 
						&& !"1".equals(tempStruct.getMRP_ODR_TYP()) 
						&& !"2".equals(tempStruct.getMRP_ODR_TYP()) 
						&& this.issueStruct.getJOB_ODR_CD() != null 
						&& this.issueStruct.getJOB_ODR_CD().length() != 0) {
					setErrorMessage("AD00092");
					setWarningSysLogMessage("T_OPR_RSLT.OPR_INST_CD", struct.getIN_OPR_INST_CD());
					setWarningSysLogMessage("T_OPR_RSLT.PARTIAL_PRD_NO", struct.getPARTIAL_PRD_NO());
					setWarningSysLogMessage("M_ITEM.ITEM_CD", issueStruct.getITEM_CD());//品目.品目番号
				}
				this.issueStruct.setLOT_NUMBERING_TYP(tempStruct.getLOT_NUMBERING_TYP());
				this.issueStruct.setLOT_CTRL_FLG(tempStruct.getLOT_CTRL_FLG());
				//新規登録時切り上げ処理
				if (_issueExeType == 0 && "1".equals(tempStruct.getUNIT_QTY_TYP())) {
					//切り上げ処理前と後で値が異なっていたら小数が入力されていたと判断しワーニング
					if ( useQty.doubleValue() != useQty2.doubleValue()) { 
						setWarningMessage("AD00043");
					}
					//品目が整数管理品の場合、切上げを行う
					useQty = useQty.setScale(0,BigDecimal.ROUND_UP);
				}
				this.issueStruct.setRCV_ISSUE_QTY(useQty.negate().toString());
			
				if (useQty.doubleValue() > 0) {
					//工程在庫出庫
					this.issueStruct.setRCV_ISSUE_GNR_TYP("41");
				} else {
					//工程在庫出庫取消
					this.issueStruct.setRCV_ISSUE_GNR_TYP("49");
				}
				if (_issueExeType == 0) {
					//登録処理
					this.issueStruct.setRCV_ISSUE_ODD_QTY(useQty.toString());
				} else {
					this.issueStruct.setRCV_ISSUE_ODD_QTY(useQty.subtract(keepUseQty).toString());
				}

				//製番チェック
				if (this.issueStruct.getJOB_ODR_CD() != null 
						&& this.issueStruct.getJOB_ODR_CD().length() != 0) {
					if (tempStruct.getMRP_ODR_TYP() != null 
							&& ("1".equals(tempStruct.getMRP_ODR_TYP()) 
							|| "2".equals(tempStruct.getMRP_ODR_TYP()))) {
						tempList = entity.mSelectChkJobOdr.read(conn,this.issueStruct);
						if (tempList.isEmpty()) {
							setErrorMessage("AD00029");
							setWarningSysLogMessage("T_OPR_RSLT.OPR_INST_CD", struct.getIN_OPR_INST_CD());
							setWarningSysLogMessage("T_OPR_RSLT.PARTIAL_PRD_NO", struct.getPARTIAL_PRD_NO());
							setWarningSysLogMessage("M_ITEM.ITEM_CD", issueStruct.getITEM_CD());//品目.品目番号
							setWarningSysLogMessage("T_JOB_ODR.JOB_ODR_CD", issueStruct.getJOB_ODR_CD());//製番計画.製番
						} else {
							tempStruct = (AD0040010Struct)tempList.get(0);
							//製番計画の工場コードとユーザ工場コードの同一チェック
							if (tempStruct.getPLANT_CD() == null 
									|| !tempStruct.getPLANT_CD().equals(this.sysPLANT_CD)) {
								setErrorMessage("AD00016");
								setWarningSysLogMessage("T_OPR_RSLT.OPR_INST_CD", struct.getIN_OPR_INST_CD());
								setWarningSysLogMessage("T_OPR_RSLT.PARTIAL_PRD_NO", struct.getPARTIAL_PRD_NO());
								setWarningSysLogMessage("M_ITEM.ITEM_CD", issueStruct.getITEM_CD());//品目.品目番号
								setWarningSysLogMessage("T_JOB_ODR.JOB_ODR_CD", issueStruct.getJOB_ODR_CD());//製番計画.製番
							}
						}
					}
				}

			//入力した子品目番号と作業実績品目が同じ場合
			if(this.issueStruct.getITEM_CD().equals(headerStruct.getITEM_CD())){
				setErrorMessage("AD20138");
				setWarningSysLogMessage("ITEM_CD", this.issueStruct.getITEM_CD());
				return;
			}
			
			//入力した子品目番号を親品目、作業実績品目を子品目として製品構成検索
			this.issueStruct.setPARENT_ITEM_CD(this.issueStruct.getITEM_CD());
			this.issueStruct.setCOMP_ITEM_CD(headerStruct.getITEM_CD());

			tempList = entity.mM_PS.read(conn, this.issueStruct);

			//データが存在する場合
			if(tempList != null && tempList.size() > 0){
				//エラーメッセージ出力
				setErrorMessage("AD20137");
				setWarningSysLogMessage("M_PS.PARENT_ITEM_CD", this.issueStruct.getITEM_CD());
				setWarningSysLogMessage("M_PS.COMP_ITEM_CD", headerStruct.getITEM_CD());
				return;
			}

			//入力された子品目のロット管理フラグ = 1(ロットトレース管理を行う。)の場合
			if(this.issueStruct.getLOT_CTRL_FLG().equals("1")){
				//ロット番号未入力の場合
				if(this.issueStruct.getLOT_NO() == null || this.issueStruct.getLOT_NO().trim().equals("")){
					//エラーメッセージ出力
					setErrorMessage("AE20600");
				//ロット番号が入力された場合
				}else{
					//ロット管理検索
					tempList = entity.mT_LOT_CTRL.read(conn,this.issueStruct);

					//[ロット管理]に存在しない場合
					if(tempList == null || tempList.size() == 0){
						//エラーメッセージ出力
						setErrorMessage("AE20615");
						setWarningSysLogMessage("T_LOTL_CTRL.LOT_NO", this.issueStruct.getLOT_NO());
					//[ロット管理]に存在する場合
					}else{
						if (useQty.doubleValue() > 0) {
							// 出庫指示番号がNullの場合
							if(issueStruct.geth_ISSUE_INST_CD() == null || issueStruct.geth_ISSUE_INST_CD().equals("")){
								// システムパラメータの品質期限チェックフラグを取得
								List sysParaList = entity.mSYS_PARAMETER.read(conn,this.issueStruct);
								if(sysParaList.size() > 0){
									AD0040010Struct sysParaStruct = (AD0040010Struct)sysParaList.get(0);
									this.issueStruct.setBEST_BEFORE_DATE_CHECK_FLG(sysParaStruct.getBEST_BEFORE_DATE_CHECK_FLG());
								}else{
									this.issueStruct.setBEST_BEFORE_DATE_CHECK_FLG("1");
								}
								
								//  [ロット管理].”賞味期限”＜ 「出庫日」の場合
								List bbdList = entity.mc_BEST_BEFORE_DATE.read(conn, this.issueStruct);
								if(bbdList.size() > 0){
									AD0040010Struct bbdStruct = (AD0040010Struct)bbdList.get(0);
									// 品質期限チェックフラグが1:エラーの場合
									if(bbdStruct.getBBD_c_FLG().equals("1") && this.issueStruct.getBEST_BEFORE_DATE_CHECK_FLG().equals("1")){
										//品質期限が切れています。
										setErrorMessage("AD00114");
										setWarningSysLogMessage("T_LOTL_CTRL.LOT_NO", this.issueStruct.getLOT_NO());
									}// 品質期限チェックフラグが2:警告の場合
									else if(bbdStruct.getBBD_c_FLG().equals("1") && this.issueStruct.getBEST_BEFORE_DATE_CHECK_FLG().equals("2")){
										//品質期限切れのロットを使用しました。
										setWarningMessage("AD00115");
										setWarningSysLogMessage("T_LOTL.LOT_NO", this.issueStruct.getLOT_NO());
									}
								}
							}
						}
					}
				}

				//作業実績品目のロット管理フラグ = 1(ロットトレース管理を行う。)の場合
				if(headerStruct.getLOT_CTRL_FLG().equals("1")){
					//最終系列でない場合
					if (!this.headerStruct.geth_FINAL_PROC_FLG().equals("1")) {
						tempList = entity.mSelectParentLotNo.read(conn, this.issueStruct);
						if (tempList != null && tempList.size() != 0) {
							for (int i = 0; i < tempList.size(); i++) {
								tempStruct = (AD0040010Struct)tempList.get(i);
								headerLotList.add(tempStruct);
							}
						}
					//最終系列の場合
					} else {
						//作業実績検索
						tempList = entity.mSelect.read(conn, struct);

						//データが存在しない場合
						if (tempList.isEmpty()) {
							//エラーメッセージ出力
							setErrorMessage("ZZ01101");
							setWarningSysLogMessage("T_OPR_RSLT.OPR_INST_CD", struct.getIN_OPR_INST_CD());
																									//作業指示番号
							setWarningSysLogMessage("T_ISSUE_INST.ISSUE_INST_CD", struct.geth_ISSUE_INST_CD());
							return;
						}
						tempStruct = (AD0040010Struct)tempList.get(0);
						headerLotList.add(tempStruct);
					}
				}
			//入力された子品目のロット管理フラグ = 1(ロットトレース管理を行う。)でない場合
			}else{
				//ロット番号が入力された場合
				if(this.issueStruct.getLOT_NO() != null && !this.issueStruct.getLOT_NO().trim().equals("")){
					//エラーメッセージ出力
					setErrorMessage("AE20601");
				}
				}
			}

			// エラーがあれば終了
			if (msgStruct.hasError()) {
				return;
			}

			//使用数設定
			BigDecimal useLotQty = useQty;
			
			// 退避用手持ち在庫数に0をセット
			issueStruct.setSAVE_STOCK_ON_HAND_QTY("0");

			BigDecimal stockQty = null;
			//工程仕掛在庫出庫処理
			if (this.issueStruct.getJOB_ODR_CD() == null 
					|| this.issueStruct.getJOB_ODR_CD().length() == 0) {
				//保管区別品目在庫更新
				tempList = entity.mSelectItemStock.read(conn,this.issueStruct);
				AD0040010Struct stockStruct = new AD0040010Struct();
				stockStruct.setStructM(this.issueStruct);
			
				if (tempList.isEmpty()) {
					//登録
					useQty = useQty.negate();
					stockStruct.setSTOCK_ON_HAND_QTY(useQty.toString());
					entity.mInsertItemStock.create(conn, stockStruct);
				} else {
					//更新
					tempStruct = (AD0040010Struct)tempList.get(0);
					issueStruct.setSAVE_STOCK_ON_HAND_QTY(tempStruct.getSTOCK_ON_HAND_QTY());
					stockQty = new BigDecimal(tempStruct.getSTOCK_ON_HAND_QTY());
					if (useQty.doubleValue() > 0) { 
						//出庫
						useQty = stockQty.subtract(useQty) ;
					} else { 
						//入庫
						useQty = stockQty.add(useQty.negate()) ;
					}
					stockStruct.setSTOCK_ON_HAND_QTY(useQty.toString());
			
					entity.mUpdateItemStock.update(conn,stockStruct);
				}
			} else {
				//製番仕掛在庫更新
				tempList = entity.mSelectOdrStock.read(conn,this.issueStruct);
				AD0040010Struct stockStruct = new AD0040010Struct();
				setStandardItem(stockStruct);
			
				stockStruct.setStructM(this.issueStruct);
			
				if (tempList.isEmpty()) {
					//登録
					useQty = useQty.negate();
					stockStruct.setSTOCK_ON_HAND_QTY(useQty.toString());
					entity.mInsertOdrStock.create(conn, stockStruct);
				} else {
					//更新
					tempStruct = (AD0040010Struct)tempList.get(0);
					issueStruct.setSAVE_STOCK_ON_HAND_QTY(tempStruct.getSTOCK_ON_HAND_QTY());
					stockStruct.setJOB_ODR_DETAIL_NO(tempStruct.getJOB_ODR_DETAIL_NO());
					stockQty = new BigDecimal(tempStruct.getSTOCK_ON_HAND_QTY());
					if (useQty.doubleValue() > 0) { 
						//出庫
						useQty = stockQty.subtract(useQty) ;
					} else { 
						//入庫
						useQty = stockQty.add(useQty.negate()) ;
					}
					stockStruct.setSTOCK_ON_HAND_QTY(useQty.toString());
			
					entity.mUpdateOdrStock.update(conn, stockStruct);
				}
			}
			
			this.issueStruct.setOPR_RSLT_CRCT_NO("0");  //作業実績訂正回数
			
			// 入出庫年月日設定
			this.issueStruct.setRCV_ISSUE_DATE(this.issueStruct.getRCV_ISSUE_DATE() + " " + 
			                                   this.issueStruct.getRCV_ISSUE_TIME().substring(0,2) + ":" + 
			                                   this.issueStruct.getRCV_ISSUE_TIME().substring(2));
			//会社コード
			this.issueStruct.setCOMPANY_CD(_company_cd);
			//ロット管理フラグ = 1(ロットトレース管理を行う。)の場合
			if(issueStruct.getLOT_CTRL_FLG().equals("1")){
				//出庫指示番号がnullでない場合
				if(issueStruct.geth_ISSUE_INST_CD() != null && !issueStruct.geth_ISSUE_INST_CD().equals("")){
					//出庫実績明細取得
					List lotIssueList = entity.mT_LOT_ISSUE_INST.read(conn,this.issueStruct);

					//データが存在しない場合
					if (lotIssueList == null || lotIssueList.size() == 0) {
						//エラーメッセージ出力
						setErrorMessage("AD20135");
						setWarningSysLogMessage("T_LOT_ISSUE_INST.ISSUE_INST_CD",
							this.issueStruct.geth_ISSUE_INST_CD());//出庫指示番号
						setWarningSysLogMessage("T_LOT_ISSUE_INST.ITEM_CD", this.issueStruct.getITEM_CD());//品目番号
						setWarningSysLogMessage("T_LOT_ISSUE_INST.WORK_ODR_CD", this.issueStruct.getWORK_ODR_CD());
																										//作業計画番号
						return;
					}

					AD0040010Struct lotUseStruct = new AD0040010Struct();
					lotUseStruct.setStructM(this.issueStruct);
					setStandardItem(lotUseStruct);

					AD0040010Struct lotIssueStruct = (AD0040010Struct)lotIssueList.get(0);

					//ロット番号設定
					lotUseStruct.setLOT_NO(lotIssueStruct.getLOT_NO());

					//引当済数設定
					BigDecimal spentQty = new BigDecimal(lotIssueStruct.getSPENT_QTY());
					BigDecimal issueQty = new BigDecimal(lotIssueStruct.getISSUE_QTY());
					
					spentQty = spentQty.add(useLotQty);
					if(spentQty.doubleValue()>issueQty.doubleValue()){
						setWarningMessage("AD20136");
						setWarningSysLogMessage("T_ISSUE_INST.ITEM_CD",this.issueStruct.getITEM_CD());
						// 出庫指示番号
						setWarningSysLogMessage("T_LOT_ISSUE_INST.ISSUE_INST_CD",this.issueStruct.geth_ISSUE_INST_CD());
						// 品目番号
						setWarningSysLogMessage("T_LOT_ISSUE_INST.ITEM_CD",this.issueStruct.getITEM_CD());
						// 作業計画番号
						setWarningSysLogMessage("T_LOT_ISSUE_INST.WORK_ODR_CD",this.issueStruct.getWORK_ODR_CD());
						// 在庫ロット番号
						setWarningSysLogMessage("T_LOT_ISSUE_INST.LOT_NO",this.issueStruct.getLOT_NO());
						
					}
					//使用済数に引当済数を設定
					//lotUseStruct.setTOTAL_ISSUE_QTY(spentQty.toString());
					lotUseStruct.setTOTAL_ISSUE_QTY(useLotQty.toString());
					//使用予定数量に画面の使用予定数量を設定
					lotUseStruct.setSUPPLIED_ISSUE_QTY(planQty.toString());

					//実績日を使用日に設定
					lotUseStruct.setSUPPLIED_DATE(lotUseStruct.getOPR_DATE());

					//ロット未割り当ての場合
					if (this.issueKeepStruct.getLOT_NO() == null || this.issueKeepStruct.getLOT_NO().equals("")){
						//ロット別使用実績管理番号採番
						List seqList = entity.mSEQ_JF_RSLT.read(conn, struct);
						if(seqList != null && seqList.size() > 0){
							lotUseStruct.setRSLT_CTL_SEQ_NO(((AD0040010Struct)seqList.get(0)).getNEXTVAL());
						}
						//[ロット別使用実績]の追加
						entity.mT_LOT_USE_RSLT.create(conn, lotUseStruct);
					//ロット割り当て済みの場合
					} else {
						//[ロット別使用実績]の更新
						entity.mT_LOT_USE_RSLT.update(conn, lotUseStruct);
					}

					//[出庫実績明細]の更新
					lotUseStruct.setSPENT_QTY(spentQty.toString());
					entity.mT_LOT_ISSUE_INST.update(conn, lotUseStruct);

					this.issueStruct.setLOT_NO(lotIssueStruct.getLOT_NO());
					this.issueStruct.setRCV_ISSUE_QTY(useLotQty.negate().toString());
					
				//出庫指示番号がnullの場合
				} else {
					AD0040010Struct lotUseStruct = new AD0040010Struct();
					lotUseStruct.setStructM(this.issueStruct);
					setStandardItem(lotUseStruct);

					//使用済数に画面の使用予定数量を設定
					lotUseStruct.setTOTAL_ISSUE_QTY(useLotQty.toString());
					//使用予定数量に0を設定
					lotUseStruct.setSUPPLIED_ISSUE_QTY("0.0");

					//実績日を使用日に設定
					lotUseStruct.setSUPPLIED_DATE(lotUseStruct.getOPR_DATE());

					//ロット別使用実績管理番号採番
					List seqList = entity.mSEQ_JF_RSLT.read(conn, struct);
					if(seqList != null && seqList.size() > 0){
						lotUseStruct.setRSLT_CTL_SEQ_NO(((AD0040010Struct)seqList.get(0)).getNEXTVAL());
					}
					//[ロット別使用実績]の追加
					entity.mT_LOT_USE_RSLT.create(conn, lotUseStruct);
				}

				//ロット別品目在庫検索
				tempList = entity.mT_LOT_STOCK.read(conn,this.issueStruct);

				//更新前の在庫数設定
				if (tempList.isEmpty()) {
					issueStruct.setSAVE_STOCK_ON_HAND_QTY("0");
				} else {
					tempStruct = (AD0040010Struct)tempList.get(0);
					issueStruct.setSAVE_STOCK_ON_HAND_QTY(tempStruct.getSTOCK_ON_HAND_QTY());
				}

				//保管区別入出庫登録
				// Add Start 20140307 liuj
				this.issueStruct.setRCV_ISSUE_AFTER_QTY(this.issueStruct.getRCV_ISSUE_QTY());
				// Add End   20140307 liuj
				entity.mInsertRecvIssue.create(conn, this.issueStruct);

				//ロット別品目在庫更新
				BizCommon bc = new BizCommon(conn, getsysUSER_CD(), sp.getProcId(), getsysPLANT_CD());
				List updateLotStockList = bc.excUpdateLotStockFd(no, "");

				//異常終了の場合
				if(bc.getResultStatus().intValue() == 3){
					//エラーメッセージ取得
					if(updateLotStockList != null && updateLotStockList.size() > 0){
						setErrorMessage((String)updateLotStockList.get(0));
					}
					return;
				}
				//作業実績品目のロット管理フラグ = 1(ロットトレース管理を行う。)の場合
				if(headerStruct.getLOT_CTRL_FLG().equals("1")){
					//親品目の実績入力済みの場合
					if (headerLotList != null && headerLotList.size() > 0) {
						for (int i = 0; i < headerLotList.size(); i++){
							AD0040010Struct headerLotStruct = (AD0040010Struct)headerLotList.get(i);
							//親品目の在庫ロット番号が指定されている場合
							if (headerLotStruct.getLOT_NO() != null && !headerLotStruct.getLOT_NO().equals("")){
								//ロットトレース登録・更新処理
								List lotTraceList = bc.excMakeLotTraceFd(this.issueStruct.getITEM_CD(),
									this.issueStruct.getLOT_NO(), headerStruct.getITEM_CD(),
									headerLotStruct.getLOT_NO(), "2");

								//異常終了の場合
								if(bc.getResultStatus().intValue() == 3){
									//エラーメッセージ取得
									if(lotTraceList != null && lotTraceList.size() > 0){
										setErrorMessage((String)lotTraceList.get(0));
									}
									return;
								} else {
									// 正常終了の場合、元品目番号と元ロット番号によて、「受入実績」を検索
									tempStruct = new AD0040010Struct();
									tempStruct.setFROM_ITEM_CD(this.issueStruct.getITEM_CD());
									tempStruct.setFROM_LOT_NO(this.issueStruct.getLOT_NO());

									List puchOdrList = entity.mgetFROM_PUCH_ODR_CD.read(conn, tempStruct);
									// データが存在するの場合、元品目は外作品、発注番号を[ロットトレース]に更新
									if (puchOdrList != null && puchOdrList.size() > 0) {
										// 発注番号と受入回数をソート順（降順）にし、１件目のレコードを取得する
										AD0040010Struct puchOdrStruct = (AD0040010Struct)puchOdrList.get(0);

										// [ロットトレース].“先品目番号”
										tempStruct.setTO_ITEM_CD(headerStruct.getITEM_CD());
										// [ロットトレース].“先ロット番号”
										tempStruct.setTO_LOT_NO(headerLotStruct.getLOT_NO());
										// [ロットトレース].“元発注番号”
										tempStruct.setFROM_PUCH_ODR_CD(puchOdrStruct.getFROM_PUCH_ODR_CD());
										// [ロットトレース].“先発注番号”
										tempStruct.setTO_PUCH_ODR_CD("");
										// ユーザコード
										tempStruct.setsUser_ID(getsysUSER_CD());
										entity.mupdateT_LOT_TRACE.update(conn, tempStruct);
									}
								}
							}
						}
					}
				}
			//ロット管理フラグ = 1(ロットトレース管理を行う。)でない場合
			} else {
				//保管区別入出庫登録
				// Add Start 20140307 liuj
				this.issueStruct.setRCV_ISSUE_AFTER_QTY(this.issueStruct.getRCV_ISSUE_QTY());
				// Add End   20140307 liuj
				entity.mInsertRecvIssue.create(conn, this.issueStruct);
			}
			//　作業指示番号
			issueStruct.setIN_OPR_INST_CD(struct.getIN_OPR_INST_CD());
			// 子品目追加登録の品目
			if (issueStruct.geth_ISSUE_INST_CD() == null || "".equals(issueStruct.geth_ISSUE_INST_CD())) {
					/* 追加出庫実績明細 */				
					List addList = entity.mselT_ISSUE_INST_ADD.read(conn, struct);
					if (addList.size() > 0) {
						/* 更新処理を行う */
						entity.mupd_Issue_Inst_Add.update(conn, issueStruct);
					} else {
						List readList = entity.mSelectItem.read(conn, issueStruct);
						if (readList.size() > 0) {
							issueStruct.setMRP_ODR_TYP(((AD0040010Struct) readList.get(0)).getMRP_ODR_TYP());
							issueStruct.setISSUE_TYP(((AD0040010Struct) readList.get(0)).getISSUE_TYP());
						}
						/* 登録処理を行う */
						entity.mins_Issue_Inst_Add.create(conn, issueStruct);
					}
			}
			conn.commit();
			
			// 作業完了のワーニングメッセージ表示制御
			warningFlg = WARNING_NOTHING;
			
			//再検索
			controlSelect();
			
		} catch (SQLException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			throw new ExpjException(e, emsg);
		} finally {
			try {
				if (conn != null) {
					conn.rollback();
				}
			} catch(Exception e) {
				setReadStatus(ERROR);
				ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
				sysLog.severe(emsg, getsysUSER_CD());
				throw new ExpjException(e, emsg);
			}
		}


                //}}user_implement_dev:<controlInsert12>
		logger.exiting("AD0040010Control"+":USER="+struct.getsUser_ID(),"controlInsert12");

		return;
	}

	/**
	 * 戻るボタン押下時に実行される処理です。
	 *
	 */
	public void controlReturn12() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0040");
		logger.entering("AD0040010Control"+":USER="+struct.getsUser_ID(),"controlReturn12");
			//{{user_implement_dev:<controlReturn12>

		// 作業完了のワーニングメッセージ表示制御
		warningFlg = WARNING_NOTHING;

		//再検索
		controlSelect();


                //}}user_implement_dev:<controlReturn12>
		logger.exiting("AD0040010Control"+":USER="+struct.getsUser_ID(),"controlReturn12");

		return;
	}

	/**
	 * ボタン押下時に実行される処理です。
	 *
	 */
	public void controlClickShow() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0040");
		logger.entering("AD0040010Control"+":USER="+struct.getsUser_ID(),"controlClickShow");
			//{{user_implement_dev:<controlClickShow>


		try {
			List partialPrdNoList = new ArrayList();
			partialPrdNoList = struct.getList_PARTIAL_PRD_NO();
			this.headerStruct.setPARTIAL_PRD_NO((String) partialPrdNoList.get(0));

			List acptQtyList = new ArrayList();
			acptQtyList = struct.getList_ACPT_QTY();
			this.headerStruct.setACPT_QTY((String) acptQtyList.get(0));

			List defectQtyList = new ArrayList();
			defectQtyList = struct.getList_DEFECT_QTY();
			this.headerStruct.setDEFECT_QTY((String) defectQtyList.get(0));

			//数値タイプ項目がnullの場合、0をセット
			zeroSet(this.headerStruct);
			
//			出庫指示リスト取得
			int maxLine = 0;
			this.setIssueList();
			maxLine = sp.getMaxLine(conn,11);//子品目表示件数
			if (maxLine != 0 && this.issueList.size() > maxLine) {
				this.issueList.clear();
				setErrorMessage("AD00065",""+maxLine);
				setWarningSysLogMessage("T_ISSUE_INST.WORK_ODR_CD", headerStruct.getWORK_ODR_CD());//作業実績.作業計画番号
				setReadStatus(TOO_MANY);
				return;
			}
			setReadStatus(NORMAL);
			_printFlg = "0";

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}


                //}}user_implement_dev:<controlClickShow>
		logger.exiting("AD0040010Control"+":USER="+struct.getsUser_ID(),"controlClickShow");

		return;
	}

	/**
	 * ロット管理ボタン押下時に実行される処理です。
	 *
	 */
	public void controlLotInsert() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0040");
		logger.entering("AD0040010Control"+":USER="+struct.getsUser_ID(),"controlLotInsert");
			//{{user_implement_dev:<controlLotInsert>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlLotInsert>
		logger.exiting("AD0040010Control"+":USER="+struct.getsUser_ID(),"controlLotInsert");

		return;
	}

	/**
	 * 詳細ボタン押下時に実行される処理です。
	 *
	 */
	public void controlDetail() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0040");
		logger.entering("AD0040010Control"+":USER="+struct.getsUser_ID(),"controlDetail");
			//{{user_implement_dev:<controlDetail>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlDetail>
		logger.exiting("AD0040010Control"+":USER="+struct.getsUser_ID(),"controlDetail");

		return;
	}

	/**
	 * 帳票出力ボタン押下時に実行される処理です。
	 *
	 */
	public void controlPrintShow() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0040");
		logger.entering("AD0040010Control"+":USER="+struct.getsUser_ID(),"controlPrintShow");
			//{{user_implement_dev:<controlPrintShow>
			// TODO: ユーザ定義のコードを記述してください
			// 作業完了のワーニングメッセージ表示制御
			warningFlg = WARNING_MESSAGE_2;
			struct.setIN_OPR_INST_CD(_keepOprInstCd);
			controlSelect();
			struct.setDOWNLOAD_FILE(_downloadFile);
			_printFlg = "0";
                //}}user_implement_dev:<controlPrintShow>
		logger.exiting("AD0040010Control"+":USER="+struct.getsUser_ID(),"controlPrintShow");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0040");
		logger.entering("AD0040010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AD0040010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0040");
		logger.entering("AD0040010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>


		try {
			this.listClear();
			this.structClear();

			// コンボボックスデータを部品より取得
			ComboBox cdac = new ComboBox(conn, sysUSER_CD);
			_oprTimeUnitTtpStruct = cdac.getData("OPR_TIME_UNIT_TYP");
	        DEFECT_CAUSE_CD = cdac.getData("DEFECT_CAUSE_CD_INNER");
			cdac.setConnection(null);

			//初期値の設定
			mainInitialize();

			GetTimeCtrl();
			setBussinessOprDate();
			lotCtrlFlg = LotCtrl.checkLotCtrl(conn);
			//現品票出力チェックボックス制御処理
			setIdentCard();
			setReadStatus(INITIAL);
			
			// 会社コード取得
			_company_cd = SystemInformation.getSysMyCompanyCd();
			
			if(isScreenMove() == true){
				this.struct.setIN_OPR_INST_CD(null);	
				if(null != this.getIn_Opr_Inst_Cd_Move() && !"".equals(this.getIn_Opr_Inst_Cd_Move())){
					this.struct.setIN_OPR_INST_CD(this.getIn_Opr_Inst_Cd_Move());
					controlSelect();
				}	
			}

			// Add Start 20140213 liuj
			// 工程保管場所の在庫を管理する
			struct.setIN_SYS_PARAMETER_NAME("PROCESS_MANAGE_FLG");
			List parameterList = entity.mgetSYS_PARAMETER.read(conn, struct);
			if (!parameterList.isEmpty()){
				_processManageFlg = ((AD0040010Struct)parameterList.get(0)).getSYS_PARAMETER_VALUE();
				if (!"0".equals(_processManageFlg) && !"1".equals(_processManageFlg)){
					ExpjMessage emsg = new ExpjMessage("AD00231");
					sysLog.severe(emsg, getsysUSER_CD());
					ExpjException ee = new ExpjException(emsg);
					throw ee;
				}
			} else {
				ExpjMessage emsg = new ExpjMessage("AD00231");
				sysLog.severe(emsg, getsysUSER_CD());
				ExpjException ee = new ExpjException(emsg);
				throw ee;
			}
			// 不良在庫を工程管理する
			struct.setIN_SYS_PARAMETER_NAME("DEFECT_MANAGE_FLG");
			parameterList = entity.mgetSYS_PARAMETER.read(conn, struct);
			if (!parameterList.isEmpty()){
				_defectManageFlg = ((AD0040010Struct)parameterList.get(0)).getSYS_PARAMETER_VALUE();
				if (!"0".equals(_defectManageFlg) && !"1".equals(_defectManageFlg)){
					ExpjMessage emsg = new ExpjMessage("AD00232");
					sysLog.severe(emsg, getsysUSER_CD());
					ExpjException ee = new ExpjException(emsg);
					throw ee;
				}
			} else {
				ExpjMessage emsg = new ExpjMessage("AD00232");
				sysLog.severe(emsg, getsysUSER_CD());
				ExpjException ee = new ExpjException(emsg);
				throw ee;
			}
			// Add End 20140213 liuj
		} catch (SQLException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			throw new ExpjException(e, emsg);
		} catch (ComboException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			throw new ExpjException(e, emsg);
		}


                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AD0040010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * イベントハンドラの前処理です。
	 *
	 * @param buttun ボタン名
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0040");
		logger.entering("AD0040010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
		try {
			ComboBox comboController = new ComboBox(conn, sysUSER_CD);	
            ISSUE_TYP = comboController.getData(ISSUE_TYP_PARAMETER_NAME);
            MRP_ODR_TYP = comboController.getData(MRP_ODR_TYP_PARAMETER_NAME);
            
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ComboException e) {
             throw new ExpjException(e);
        }		
        	
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("AD0040010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("UseParts") ) {
				controlUseParts();
			} else if( button.equals("Update11") ) {
				controlUpdate11();
			} else if( button.equals("Update12") ) {
				controlUpdate12();
			} else if( button.equals("NoUserParts") ) {
				controlNoUserParts();
			} else if( button.equals("CancelComplete") ) {
				controlCancelComplete();
			} else if( button.equals("LineInsert") ) {
				controlLineInsert();
			} else if( button.equals("LineUpdate") ) {
				controlLineUpdate();
			} else if( button.equals("UpdateAll") ) {
				controlUpdateAll();
			} else if( button.equals("Clear") ) {
				controlClear();
			} else if( button.equals("Insert11") ) {
				controlInsert11();
			} else if( button.equals("Return11") ) {
				controlReturn11();
			} else if( button.equals("Insert12") ) {
				controlInsert12();
			} else if( button.equals("Return12") ) {
				controlReturn12();
			} else if( button.equals("ClickShow") ) {
				controlClickShow();
			} else if( button.equals("LotInsert") ) {
				controlLotInsert();
			} else if( button.equals("Detail") ) {
				controlDetail();
			} else if( button.equals("PrintShow") ) {
				controlPrintShow();
			} else if( button.equals("initial") ) {
				controlINITIAL();
			} else if( button.equals("reload") ) {
				controlRELOAD();
			}
		//{{user_implement_dev:<control_eventHandller>
			if(lotCtrlFlg){
				struct.seth_SYS_LOT_CTRL_FLG("true");
			}else{
				struct.seth_SYS_LOT_CTRL_FLG("false");
			}

			//コンボボックスのセット（作業時間単位区分）
			struct.setList_OPR_TIME_UNIT_TYP_val(_oprTimeUnitTtpStruct.getValList());
			struct.setList_OPR_TIME_UNIT_TYP_name(_oprTimeUnitTtpStruct.getExplanList());
			//コンボボックスのセット（不良理由コード）
			struct.setList_l_DEFECT_CAUSE_CD_val(DEFECT_CAUSE_CD.getValList());
	        struct.setList_l_DEFECT_CAUSE_CD_name(DEFECT_CAUSE_CD.getExplanList());

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
//			throw new FoundationException("AD0040010Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AD0040010-E999","CSVの出力処理"));
			throw new FoundationException("AD0040010Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AD0040010-E999","システム日付の取得処理"));
				throw new FoundationException("AD0040010Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AD0040010-E999","コントロールのイベント処理"));
			throw new FoundationException("AD0040010Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected AD0040010Entity entity;
	protected AD0040010Struct struct;
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

		entity = new AD0040010Entity();
		struct = new AD0040010Struct();

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
	 * AD0040010クラスの標準コンストラクタ
	 */
	public AD0040010Control() throws BusinessProcessException, FoundationException
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
				AD0040010Struct key = (AD0040010Struct)keyList.get(j);
				// メッセージキーを作成する
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("OPR_TIME_UNIT_TYP_name") && key.getOPR_TIME_UNIT_TYP_name() != null) {
					msgKey.setKeyValue("OPR_TIME_UNIT_TYP_name", key.getOPR_TIME_UNIT_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("OPR_TIME_UNIT_TYP_val") && key.getOPR_TIME_UNIT_TYP_val() != null) {
					msgKey.setKeyValue("OPR_TIME_UNIT_TYP_val", key.getOPR_TIME_UNIT_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_TYP_DN") && key.getISSUE_TYP_DN() != null) {
					msgKey.setKeyValue("ISSUE_TYP_DN", key.getISSUE_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP_DN") && key.getMRP_ODR_TYP_DN() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP_DN", key.getMRP_ODR_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("h_OPR_INST_CD") && key.geth_OPR_INST_CD() != null) {
					msgKey.setKeyValue("h_OPR_INST_CD", key.geth_OPR_INST_CD());
				}
				if(msgKeyType.containsKeyColumn("c_COMPLETE") && key.getc_COMPLETE() != null) {
					msgKey.setKeyValue("c_COMPLETE", key.getc_COMPLETE());
				}
				if(msgKeyType.containsKeyColumn("l_PARTIAL_PRD_NO") && key.getl_PARTIAL_PRD_NO() != null) {
					msgKey.setKeyValue("l_PARTIAL_PRD_NO", key.getl_PARTIAL_PRD_NO());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_TIME") && key.getRCV_ISSUE_TIME() != null) {
					msgKey.setKeyValue("RCV_ISSUE_TIME", key.getRCV_ISSUE_TIME());
				}
				if(msgKeyType.containsKeyColumn("OPRATION_TIME") && key.getOPRATION_TIME() != null) {
					msgKey.setKeyValue("OPRATION_TIME", key.getOPRATION_TIME());
				}
				if(msgKeyType.containsKeyColumn("h_SYS_LOT_CTRL_FLG") && key.geth_SYS_LOT_CTRL_FLG() != null) {
					msgKey.setKeyValue("h_SYS_LOT_CTRL_FLG", key.geth_SYS_LOT_CTRL_FLG());
				}
				if(msgKeyType.containsKeyColumn("param1") && key.getparam1() != null) {
					msgKey.setKeyValue("param1", key.getparam1());
				}
				if(msgKeyType.containsKeyColumn("param2") && key.getparam2() != null) {
					msgKey.setKeyValue("param2", key.getparam2());
				}
				if(msgKeyType.containsKeyColumn("param3") && key.getparam3() != null) {
					msgKey.setKeyValue("param3", key.getparam3());
				}
				if(msgKeyType.containsKeyColumn("h_LOT_NO") && key.geth_LOT_NO() != null) {
					msgKey.setKeyValue("h_LOT_NO", key.geth_LOT_NO());
				}
				if(msgKeyType.containsKeyColumn("l_DEFECT_CAUSE_CD_name") && key.getl_DEFECT_CAUSE_CD_name() != null) {
					msgKey.setKeyValue("l_DEFECT_CAUSE_CD_name", key.getl_DEFECT_CAUSE_CD_name());
				}
				if(msgKeyType.containsKeyColumn("l_DEFECT_CAUSE_CD_val") && key.getl_DEFECT_CAUSE_CD_val() != null) {
					msgKey.setKeyValue("l_DEFECT_CAUSE_CD_val", key.getl_DEFECT_CAUSE_CD_val());
				}
				if(msgKeyType.containsKeyColumn("c_OUTPUT") && key.getc_OUTPUT() != null) {
					msgKey.setKeyValue("c_OUTPUT", key.getc_OUTPUT());
				}
				if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE") && key.getDOWNLOAD_FILE() != null) {
					msgKey.setKeyValue("DOWNLOAD_FILE", key.getDOWNLOAD_FILE());
				}
				if(msgKeyType.containsKeyColumn("l_ITEM_NAME") && key.getl_ITEM_NAME() != null) {
					msgKey.setKeyValue("l_ITEM_NAME", key.getl_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("h_PROCESS_MANAGE_FLG") && key.geth_PROCESS_MANAGE_FLG() != null) {
					msgKey.setKeyValue("h_PROCESS_MANAGE_FLG", key.geth_PROCESS_MANAGE_FLG());
				}
				if(msgKeyType.containsKeyColumn("SAVE_STOCK_ON_HAND_QTY") && key.getSAVE_STOCK_ON_HAND_QTY() != null) {
					msgKey.setKeyValue("SAVE_STOCK_ON_HAND_QTY", key.getSAVE_STOCK_ON_HAND_QTY());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_CD") && key.getOPR_INST_CD() != null) {
					msgKey.setKeyValue("OPR_INST_CD", key.getOPR_INST_CD());
				}
				if(msgKeyType.containsKeyColumn("PARTIAL_PRD_NO") && key.getPARTIAL_PRD_NO() != null) {
					msgKey.setKeyValue("PARTIAL_PRD_NO", key.getPARTIAL_PRD_NO());
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
				if(msgKeyType.containsKeyColumn("OPR_DATE") && key.getOPR_DATE() != null) {
					msgKey.setKeyValue("OPR_DATE", key.getOPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("WH_CD") && key.getWH_CD() != null) {
					msgKey.setKeyValue("WH_CD", key.getWH_CD());
				}
				if(msgKeyType.containsKeyColumn("WS_CD") && key.getWS_CD() != null) {
					msgKey.setKeyValue("WS_CD", key.getWS_CD());
				}
				if(msgKeyType.containsKeyColumn("OPR_RSLT_PERSON") && key.getOPR_RSLT_PERSON() != null) {
					msgKey.setKeyValue("OPR_RSLT_PERSON", key.getOPR_RSLT_PERSON());
				}
				if(msgKeyType.containsKeyColumn("OPR_TIME_UNIT_TYP") && key.getOPR_TIME_UNIT_TYP() != null) {
					msgKey.setKeyValue("OPR_TIME_UNIT_TYP", key.getOPR_TIME_UNIT_TYP());
				}
				if(msgKeyType.containsKeyColumn("PRE_ARRANGEMENT_TIME") && key.getPRE_ARRANGEMENT_TIME() != null) {
					msgKey.setKeyValue("PRE_ARRANGEMENT_TIME", key.getPRE_ARRANGEMENT_TIME());
				}
				if(msgKeyType.containsKeyColumn("OPR_TIME") && key.getOPR_TIME() != null) {
					msgKey.setKeyValue("OPR_TIME", key.getOPR_TIME());
				}
				if(msgKeyType.containsKeyColumn("POST_ARRANGEMENT_TIME") && key.getPOST_ARRANGEMENT_TIME() != null) {
					msgKey.setKeyValue("POST_ARRANGEMENT_TIME", key.getPOST_ARRANGEMENT_TIME());
				}
				if(msgKeyType.containsKeyColumn("CESSATION_TIME") && key.getCESSATION_TIME() != null) {
					msgKey.setKeyValue("CESSATION_TIME", key.getCESSATION_TIME());
				}
				if(msgKeyType.containsKeyColumn("CESSATION_CAUSE") && key.getCESSATION_CAUSE() != null) {
					msgKey.setKeyValue("CESSATION_CAUSE", key.getCESSATION_CAUSE());
				}
				if(msgKeyType.containsKeyColumn("VEND_LOT_NO") && key.getVEND_LOT_NO() != null) {
					msgKey.setKeyValue("VEND_LOT_NO", key.getVEND_LOT_NO());
				}
				if(msgKeyType.containsKeyColumn("LOT_NO") && key.getLOT_NO() != null) {
					msgKey.setKeyValue("LOT_NO", key.getLOT_NO());
				}
				if(msgKeyType.containsKeyColumn("OPR_RSLT_COMMENT") && key.getOPR_RSLT_COMMENT() != null) {
					msgKey.setKeyValue("OPR_RSLT_COMMENT", key.getOPR_RSLT_COMMENT());
				}
				if(msgKeyType.containsKeyColumn("RSLT_MODIFY_COUNT") && key.getRSLT_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("RSLT_MODIFY_COUNT", key.getRSLT_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("WH_NAME") && key.getWH_NAME() != null) {
					msgKey.setKeyValue("WH_NAME", key.getWH_NAME());
				}
				if(msgKeyType.containsKeyColumn("WS_NAME") && key.getWS_NAME() != null) {
					msgKey.setKeyValue("WS_NAME", key.getWS_NAME());
				}
				if(msgKeyType.containsKeyColumn("IN_OPR_INST_CD") && key.getIN_OPR_INST_CD() != null) {
					msgKey.setKeyValue("IN_OPR_INST_CD", key.getIN_OPR_INST_CD());
				}
				if(msgKeyType.containsKeyColumn("WORK_IN_PROC_CD") && key.getWORK_IN_PROC_CD() != null) {
					msgKey.setKeyValue("WORK_IN_PROC_CD", key.getWORK_IN_PROC_CD());
				}
				if(msgKeyType.containsKeyColumn("PROC_NAME") && key.getPROC_NAME() != null) {
					msgKey.setKeyValue("PROC_NAME", key.getPROC_NAME());
				}
				if(msgKeyType.containsKeyColumn("PROC_NO") && key.getPROC_NO() != null) {
					msgKey.setKeyValue("PROC_NO", key.getPROC_NO());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("h_WORK_STS_TYP") && key.geth_WORK_STS_TYP() != null) {
					msgKey.setKeyValue("h_WORK_STS_TYP", key.geth_WORK_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("WORK_ODR_CD") && key.getWORK_ODR_CD() != null) {
					msgKey.setKeyValue("WORK_ODR_CD", key.getWORK_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("OD_NO") && key.getOD_NO() != null) {
					msgKey.setKeyValue("OD_NO", key.getOD_NO());
				}
				if(msgKeyType.containsKeyColumn("OUTSIDE_TYP") && key.getOUTSIDE_TYP() != null) {
					msgKey.setKeyValue("OUTSIDE_TYP", key.getOUTSIDE_TYP());
				}
				if(msgKeyType.containsKeyColumn("h_PROC_MODIFY_COUNT") && key.geth_PROC_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("h_PROC_MODIFY_COUNT", key.geth_PROC_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("h_FINAL_PROC_FLG") && key.geth_FINAL_PROC_FLG() != null) {
					msgKey.setKeyValue("h_FINAL_PROC_FLG", key.geth_FINAL_PROC_FLG());
				}
				if(msgKeyType.containsKeyColumn("WORK_ODR_DLV_DATE") && key.getWORK_ODR_DLV_DATE() != null) {
					msgKey.setKeyValue("WORK_ODR_DLV_DATE", key.getWORK_ODR_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_START_DATE") && key.getOPR_INST_START_DATE() != null) {
					msgKey.setKeyValue("OPR_INST_START_DATE", key.getOPR_INST_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_QTY") && key.getOPR_INST_QTY() != null) {
					msgKey.setKeyValue("OPR_INST_QTY", key.getOPR_INST_QTY());
				}
				if(msgKeyType.containsKeyColumn("ITEM_NAME") && key.getITEM_NAME() != null) {
					msgKey.setKeyValue("ITEM_NAME", key.getITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP") && key.getUNIT_QTY_TYP() != null) {
					msgKey.setKeyValue("UNIT_QTY_TYP", key.getUNIT_QTY_TYP());
				}
				if(msgKeyType.containsKeyColumn("DRAW_CD") && key.getDRAW_CD() != null) {
					msgKey.setKeyValue("DRAW_CD", key.getDRAW_CD());
				}
				if(msgKeyType.containsKeyColumn("SPEC") && key.getSPEC() != null) {
					msgKey.setKeyValue("SPEC", key.getSPEC());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP") && key.getMRP_ODR_TYP() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP", key.getMRP_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT") && key.getSTOCK_UNIT() != null) {
					msgKey.setKeyValue("STOCK_UNIT", key.getSTOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("LOT_NUMBERING_TYP") && key.getLOT_NUMBERING_TYP() != null) {
					msgKey.setKeyValue("LOT_NUMBERING_TYP", key.getLOT_NUMBERING_TYP());
				}
				if(msgKeyType.containsKeyColumn("LOT_CTRL_FLG") && key.getLOT_CTRL_FLG() != null) {
					msgKey.setKeyValue("LOT_CTRL_FLG", key.getLOT_CTRL_FLG());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_CD") && key.getJOB_ODR_CD() != null) {
					msgKey.setKeyValue("JOB_ODR_CD", key.getJOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_DETAIL_NO") && key.getJOB_ODR_DETAIL_NO() != null) {
					msgKey.setKeyValue("JOB_ODR_DETAIL_NO", key.getJOB_ODR_DETAIL_NO());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_CANCEL_NO") && key.getJOB_ODR_CANCEL_NO() != null) {
					msgKey.setKeyValue("JOB_ODR_CANCEL_NO", key.getJOB_ODR_CANCEL_NO());
				}
				if(msgKeyType.containsKeyColumn("SUM_ACPT_QTY") && key.getSUM_ACPT_QTY() != null) {
					msgKey.setKeyValue("SUM_ACPT_QTY", key.getSUM_ACPT_QTY());
				}
				if(msgKeyType.containsKeyColumn("SUM_DEFECT_QTY") && key.getSUM_DEFECT_QTY() != null) {
					msgKey.setKeyValue("SUM_DEFECT_QTY", key.getSUM_DEFECT_QTY());
				}
				if(msgKeyType.containsKeyColumn("h_BUSINESS_OPR_DATE") && key.geth_BUSINESS_OPR_DATE() != null) {
					msgKey.setKeyValue("h_BUSINESS_OPR_DATE", key.geth_BUSINESS_OPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("h_BUSINESS_OPR_TIME") && key.geth_BUSINESS_OPR_TIME() != null) {
					msgKey.setKeyValue("h_BUSINESS_OPR_TIME", key.geth_BUSINESS_OPR_TIME());
				}
				if(msgKeyType.containsKeyColumn("USER_CD") && key.getUSER_CD() != null) {
					msgKey.setKeyValue("USER_CD", key.getUSER_CD());
				}
				if(msgKeyType.containsKeyColumn("PRG_NM") && key.getPRG_NM() != null) {
					msgKey.setKeyValue("PRG_NM", key.getPRG_NM());
				}
				if(msgKeyType.containsKeyColumn("WH_TYP") && key.getWH_TYP() != null) {
					msgKey.setKeyValue("WH_TYP", key.getWH_TYP());
				}
				if(msgKeyType.containsKeyColumn("OPR_CRCT_NO") && key.getOPR_CRCT_NO() != null) {
					msgKey.setKeyValue("OPR_CRCT_NO", key.getOPR_CRCT_NO());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_CD_GNR_TYP") && key.getOPR_INST_CD_GNR_TYP() != null) {
					msgKey.setKeyValue("OPR_INST_CD_GNR_TYP", key.getOPR_INST_CD_GNR_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_DEFECT_CAUSE_CD") && key.getl_DEFECT_CAUSE_CD() != null) {
					msgKey.setKeyValue("l_DEFECT_CAUSE_CD", key.getl_DEFECT_CAUSE_CD());
				}
				if(msgKeyType.containsKeyColumn("l_DEFECT_QTY") && key.getl_DEFECT_QTY() != null) {
					msgKey.setKeyValue("l_DEFECT_QTY", key.getl_DEFECT_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_DEFECT_COMMENT") && key.getl_DEFECT_COMMENT() != null) {
					msgKey.setKeyValue("l_DEFECT_COMMENT", key.getl_DEFECT_COMMENT());
				}
				if(msgKeyType.containsKeyColumn("DEFECT_MODIFY_COUNT") && key.getDEFECT_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("DEFECT_MODIFY_COUNT", key.getDEFECT_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("CRCT_TYP") && key.getCRCT_TYP() != null) {
					msgKey.setKeyValue("CRCT_TYP", key.getCRCT_TYP());
				}
				if(msgKeyType.containsKeyColumn("h_ITEM_MODIFY_COUNT") && key.geth_ITEM_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("h_ITEM_MODIFY_COUNT", key.geth_ITEM_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("OPR_RSLT_TYP") && key.getOPR_RSLT_TYP() != null) {
					msgKey.setKeyValue("OPR_RSLT_TYP", key.getOPR_RSLT_TYP());
				}
				if(msgKeyType.containsKeyColumn("PROC_MODIFY_COUNT") && key.getPROC_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("PROC_MODIFY_COUNT", key.getPROC_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("ITEM_MODIFY_COUNT") && key.getITEM_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("ITEM_MODIFY_COUNT", key.getITEM_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("UPDATE_WORK_STS_TYP") && key.getUPDATE_WORK_STS_TYP() != null) {
					msgKey.setKeyValue("UPDATE_WORK_STS_TYP", key.getUPDATE_WORK_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("h_ISSUE_INST_CD") && key.geth_ISSUE_INST_CD() != null) {
					msgKey.setKeyValue("h_ISSUE_INST_CD", key.geth_ISSUE_INST_CD());
				}
				if(msgKeyType.containsKeyColumn("h_ISSUE_INST_UNIT_DENOMINATOR") && key.geth_ISSUE_INST_UNIT_DENOMINATOR() != null) {
					msgKey.setKeyValue("h_ISSUE_INST_UNIT_DENOMINATOR", key.geth_ISSUE_INST_UNIT_DENOMINATOR());
				}
				if(msgKeyType.containsKeyColumn("h_ISSUE_INST_UNIT_NUMERATOR") && key.geth_ISSUE_INST_UNIT_NUMERATOR() != null) {
					msgKey.setKeyValue("h_ISSUE_INST_UNIT_NUMERATOR", key.geth_ISSUE_INST_UNIT_NUMERATOR());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_INST_UNIT_FRACTION") && key.getISSUE_INST_UNIT_FRACTION() != null) {
					msgKey.setKeyValue("ISSUE_INST_UNIT_FRACTION", key.getISSUE_INST_UNIT_FRACTION());
				}
				if(msgKeyType.containsKeyColumn("h_ISSUE_TYP") && key.geth_ISSUE_TYP() != null) {
					msgKey.setKeyValue("h_ISSUE_TYP", key.geth_ISSUE_TYP());
				}
				if(msgKeyType.containsKeyColumn("TOTAL_ISSUE_QTY") && key.getTOTAL_ISSUE_QTY() != null) {
					msgKey.setKeyValue("TOTAL_ISSUE_QTY", key.getTOTAL_ISSUE_QTY());
				}
				if(msgKeyType.containsKeyColumn("SUPPLIED_ISSUE_QTY") && key.getSUPPLIED_ISSUE_QTY() != null) {
					msgKey.setKeyValue("SUPPLIED_ISSUE_QTY", key.getSUPPLIED_ISSUE_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_LOT_NO") && key.getl_LOT_NO() != null) {
					msgKey.setKeyValue("l_LOT_NO", key.getl_LOT_NO());
				}
				if(msgKeyType.containsKeyColumn("ROW_COUNT") && key.getROW_COUNT() != null) {
					msgKey.setKeyValue("ROW_COUNT", key.getROW_COUNT());
				}
				if(msgKeyType.containsKeyColumn("count_RCV_ISSUE") && key.getcount_RCV_ISSUE() != null) {
					msgKey.setKeyValue("count_RCV_ISSUE", key.getcount_RCV_ISSUE());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_QTY") && key.getRCV_ISSUE_QTY() != null) {
					msgKey.setKeyValue("RCV_ISSUE_QTY", key.getRCV_ISSUE_QTY());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_ODD_QTY") && key.getRCV_ISSUE_ODD_QTY() != null) {
					msgKey.setKeyValue("RCV_ISSUE_ODD_QTY", key.getRCV_ISSUE_ODD_QTY());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_CTRL_CD") && key.getRCV_ISSUE_CTRL_CD() != null) {
					msgKey.setKeyValue("RCV_ISSUE_CTRL_CD", key.getRCV_ISSUE_CTRL_CD());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_TYP") && key.getRCV_ISSUE_TYP() != null) {
					msgKey.setKeyValue("RCV_ISSUE_TYP", key.getRCV_ISSUE_TYP());
				}
				if(msgKeyType.containsKeyColumn("OPR_RSLT_CRCT_NO") && key.getOPR_RSLT_CRCT_NO() != null) {
					msgKey.setKeyValue("OPR_RSLT_CRCT_NO", key.getOPR_RSLT_CRCT_NO());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_AFTER_QTY") && key.getRCV_ISSUE_AFTER_QTY() != null) {
					msgKey.setKeyValue("RCV_ISSUE_AFTER_QTY", key.getRCV_ISSUE_AFTER_QTY());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_DATE") && key.getRCV_ISSUE_DATE() != null) {
					msgKey.setKeyValue("RCV_ISSUE_DATE", key.getRCV_ISSUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_GNR_TYP") && key.getRCV_ISSUE_GNR_TYP() != null) {
					msgKey.setKeyValue("RCV_ISSUE_GNR_TYP", key.getRCV_ISSUE_GNR_TYP());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UPD_TYP") && key.getSTOCK_UPD_TYP() != null) {
					msgKey.setKeyValue("STOCK_UPD_TYP", key.getSTOCK_UPD_TYP());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_COMMENT") && key.getRCV_ISSUE_COMMENT() != null) {
					msgKey.setKeyValue("RCV_ISSUE_COMMENT", key.getRCV_ISSUE_COMMENT());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_CMPLT_FLG") && key.getRCV_ISSUE_CMPLT_FLG() != null) {
					msgKey.setKeyValue("RCV_ISSUE_CMPLT_FLG", key.getRCV_ISSUE_CMPLT_FLG());
				}
				if(msgKeyType.containsKeyColumn("COMPANY_CD") && key.getCOMPANY_CD() != null) {
					msgKey.setKeyValue("COMPANY_CD", key.getCOMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("MANHOUR_TYP") && key.getMANHOUR_TYP() != null) {
					msgKey.setKeyValue("MANHOUR_TYP", key.getMANHOUR_TYP());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_TYP") && key.getISSUE_TYP() != null) {
					msgKey.setKeyValue("ISSUE_TYP", key.getISSUE_TYP());
				}
				if(msgKeyType.containsKeyColumn("STOCK_ON_HAND_QTY") && key.getSTOCK_ON_HAND_QTY() != null) {
					msgKey.setKeyValue("STOCK_ON_HAND_QTY", key.getSTOCK_ON_HAND_QTY());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_TYP") && key.getJOB_ODR_TYP() != null) {
					msgKey.setKeyValue("JOB_ODR_TYP", key.getJOB_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("TIME_CTRL") && key.getTIME_CTRL() != null) {
					msgKey.setKeyValue("TIME_CTRL", key.getTIME_CTRL());
				}
				if(msgKeyType.containsKeyColumn("PAST_RESULT_ENTRY_TYP") && key.getPAST_RESULT_ENTRY_TYP() != null) {
					msgKey.setKeyValue("PAST_RESULT_ENTRY_TYP", key.getPAST_RESULT_ENTRY_TYP());
				}
				if(msgKeyType.containsKeyColumn("TEMP_PLAN_QTY") && key.getTEMP_PLAN_QTY() != null) {
					msgKey.setKeyValue("TEMP_PLAN_QTY", key.getTEMP_PLAN_QTY());
				}
				if(msgKeyType.containsKeyColumn("TEMP_USEOVER_QTY") && key.getTEMP_USEOVER_QTY() != null) {
					msgKey.setKeyValue("TEMP_USEOVER_QTY", key.getTEMP_USEOVER_QTY());
				}
				if(msgKeyType.containsKeyColumn("BEST_BEFORE_DATE") && key.getBEST_BEFORE_DATE() != null) {
					msgKey.setKeyValue("BEST_BEFORE_DATE", key.getBEST_BEFORE_DATE());
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
				if(msgKeyType.containsKeyColumn("RSLT_CTL_SEQ_NO") && key.getRSLT_CTL_SEQ_NO() != null) {
					msgKey.setKeyValue("RSLT_CTL_SEQ_NO", key.getRSLT_CTL_SEQ_NO());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_CD") && key.getPUCH_ODR_CD() != null) {
					msgKey.setKeyValue("PUCH_ODR_CD", key.getPUCH_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("ACPT_NO") && key.getACPT_NO() != null) {
					msgKey.setKeyValue("ACPT_NO", key.getACPT_NO());
				}
				if(msgKeyType.containsKeyColumn("PART_SUPPLIED_COMMENT") && key.getPART_SUPPLIED_COMMENT() != null) {
					msgKey.setKeyValue("PART_SUPPLIED_COMMENT", key.getPART_SUPPLIED_COMMENT());
				}
				if(msgKeyType.containsKeyColumn("SUPPLIED_DATE") && key.getSUPPLIED_DATE() != null) {
					msgKey.setKeyValue("SUPPLIED_DATE", key.getSUPPLIED_DATE());
				}
				if(msgKeyType.containsKeyColumn("h_PARTIAL_PRD_NO") && key.geth_PARTIAL_PRD_NO() != null) {
					msgKey.setKeyValue("h_PARTIAL_PRD_NO", key.geth_PARTIAL_PRD_NO());
				}
				if(msgKeyType.containsKeyColumn("h_WORK_IN_PROC_CD") && key.geth_WORK_IN_PROC_CD() != null) {
					msgKey.setKeyValue("h_WORK_IN_PROC_CD", key.geth_WORK_IN_PROC_CD());
				}
				if(msgKeyType.containsKeyColumn("ALCD_QTY") && key.getALCD_QTY() != null) {
					msgKey.setKeyValue("ALCD_QTY", key.getALCD_QTY());
				}
				if(msgKeyType.containsKeyColumn("NEXTVAL") && key.getNEXTVAL() != null) {
					msgKey.setKeyValue("NEXTVAL", key.getNEXTVAL());
				}
				if(msgKeyType.containsKeyColumn("PARENT_ITEM_CD") && key.getPARENT_ITEM_CD() != null) {
					msgKey.setKeyValue("PARENT_ITEM_CD", key.getPARENT_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("COMP_ITEM_CD") && key.getCOMP_ITEM_CD() != null) {
					msgKey.setKeyValue("COMP_ITEM_CD", key.getCOMP_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("BEST_BEFORE_DATE_CHECK_FLG") && key.getBEST_BEFORE_DATE_CHECK_FLG() != null) {
					msgKey.setKeyValue("BEST_BEFORE_DATE_CHECK_FLG", key.getBEST_BEFORE_DATE_CHECK_FLG());
				}
				if(msgKeyType.containsKeyColumn("BBD_c_FLG") && key.getBBD_c_FLG() != null) {
					msgKey.setKeyValue("BBD_c_FLG", key.getBBD_c_FLG());
				}
				if(msgKeyType.containsKeyColumn("RSLT_CTRL_SEQ_NO") && key.getRSLT_CTRL_SEQ_NO() != null) {
					msgKey.setKeyValue("RSLT_CTRL_SEQ_NO", key.getRSLT_CTRL_SEQ_NO());
				}
				if(msgKeyType.containsKeyColumn("SUPPLIED_ISSUE_QTY_sum") && key.getSUPPLIED_ISSUE_QTY_sum() != null) {
					msgKey.setKeyValue("SUPPLIED_ISSUE_QTY_sum", key.getSUPPLIED_ISSUE_QTY_sum());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_INST_CD") && key.getISSUE_INST_CD() != null) {
					msgKey.setKeyValue("ISSUE_INST_CD", key.getISSUE_INST_CD());
				}
				if(msgKeyType.containsKeyColumn("UPDATED_PRG_NM") && key.getUPDATED_PRG_NM() != null) {
					msgKey.setKeyValue("UPDATED_PRG_NM", key.getUPDATED_PRG_NM());
				}
				if(msgKeyType.containsKeyColumn("DM_STS_TYP") && key.getDM_STS_TYP() != null) {
					msgKey.setKeyValue("DM_STS_TYP", key.getDM_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_CMPLT_DATE") && key.getISSUE_CMPLT_DATE() != null) {
					msgKey.setKeyValue("ISSUE_CMPLT_DATE", key.getISSUE_CMPLT_DATE());
				}
				if(msgKeyType.containsKeyColumn("PARENT_OD_NO") && key.getPARENT_OD_NO() != null) {
					msgKey.setKeyValue("PARENT_OD_NO", key.getPARENT_OD_NO());
				}
				if(msgKeyType.containsKeyColumn("PARENT_OUTSIDE_TYP") && key.getPARENT_OUTSIDE_TYP() != null) {
					msgKey.setKeyValue("PARENT_OUTSIDE_TYP", key.getPARENT_OUTSIDE_TYP());
				}
				if(msgKeyType.containsKeyColumn("PARENT_MRP_ODR_TYP") && key.getPARENT_MRP_ODR_TYP() != null) {
					msgKey.setKeyValue("PARENT_MRP_ODR_TYP", key.getPARENT_MRP_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("PARENT_PUCH_ODR_CD") && key.getPARENT_PUCH_ODR_CD() != null) {
					msgKey.setKeyValue("PARENT_PUCH_ODR_CD", key.getPARENT_PUCH_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("PARENT_WORK_ODR_CD") && key.getPARENT_WORK_ODR_CD() != null) {
					msgKey.setKeyValue("PARENT_WORK_ODR_CD", key.getPARENT_WORK_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("PARENT_WORK_IN_PROC_CD") && key.getPARENT_WORK_IN_PROC_CD() != null) {
					msgKey.setKeyValue("PARENT_WORK_IN_PROC_CD", key.getPARENT_WORK_IN_PROC_CD());
				}
				if(msgKeyType.containsKeyColumn("FORM_SET_CODE") && key.getFORM_SET_CODE() != null) {
					msgKey.setKeyValue("FORM_SET_CODE", key.getFORM_SET_CODE());
				}
				if(msgKeyType.containsKeyColumn("FORM_SET_ITEM_CD") && key.getFORM_SET_ITEM_CD() != null) {
					msgKey.setKeyValue("FORM_SET_ITEM_CD", key.getFORM_SET_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("INS_PRINT_GRP_NO") && key.getINS_PRINT_GRP_NO() != null) {
					msgKey.setKeyValue("INS_PRINT_GRP_NO", key.getINS_PRINT_GRP_NO());
				}
				if(msgKeyType.containsKeyColumn("INS_PAGE_NO") && key.getINS_PAGE_NO() != null) {
					msgKey.setKeyValue("INS_PAGE_NO", key.getINS_PAGE_NO());
				}
				if(msgKeyType.containsKeyColumn("INS_IDENT_CARD_CTL_NO") && key.getINS_IDENT_CARD_CTL_NO() != null) {
					msgKey.setKeyValue("INS_IDENT_CARD_CTL_NO", key.getINS_IDENT_CARD_CTL_NO());
				}
				if(msgKeyType.containsKeyColumn("INS_OPR_INST_CD") && key.getINS_OPR_INST_CD() != null) {
					msgKey.setKeyValue("INS_OPR_INST_CD", key.getINS_OPR_INST_CD());
				}
				if(msgKeyType.containsKeyColumn("INS_PARTIAL_PRD_NO") && key.getINS_PARTIAL_PRD_NO() != null) {
					msgKey.setKeyValue("INS_PARTIAL_PRD_NO", key.getINS_PARTIAL_PRD_NO());
				}
				if(msgKeyType.containsKeyColumn("INS_RCV_ISSUE_CTRL_CD") && key.getINS_RCV_ISSUE_CTRL_CD() != null) {
					msgKey.setKeyValue("INS_RCV_ISSUE_CTRL_CD", key.getINS_RCV_ISSUE_CTRL_CD());
				}
				if(msgKeyType.containsKeyColumn("INS_ITEM_CD") && key.getINS_ITEM_CD() != null) {
					msgKey.setKeyValue("INS_ITEM_CD", key.getINS_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("INS_JOB_ODR_CD") && key.getINS_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("INS_JOB_ODR_CD", key.getINS_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("INS_FIRST_IDENT_CARD_QTY") && key.getINS_FIRST_IDENT_CARD_QTY() != null) {
					msgKey.setKeyValue("INS_FIRST_IDENT_CARD_QTY", key.getINS_FIRST_IDENT_CARD_QTY());
				}
				if(msgKeyType.containsKeyColumn("INS_IDENT_CARD_QTY") && key.getINS_IDENT_CARD_QTY() != null) {
					msgKey.setKeyValue("INS_IDENT_CARD_QTY", key.getINS_IDENT_CARD_QTY());
				}
				if(msgKeyType.containsKeyColumn("INS_OPR_DATE") && key.getINS_OPR_DATE() != null) {
					msgKey.setKeyValue("INS_OPR_DATE", key.getINS_OPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("INS_PKG_UNIT_QTY") && key.getINS_PKG_UNIT_QTY() != null) {
					msgKey.setKeyValue("INS_PKG_UNIT_QTY", key.getINS_PKG_UNIT_QTY());
				}
				if(msgKeyType.containsKeyColumn("INS_PLANT_CD") && key.getINS_PLANT_CD() != null) {
					msgKey.setKeyValue("INS_PLANT_CD", key.getINS_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("INS_WS_CD") && key.getINS_WS_CD() != null) {
					msgKey.setKeyValue("INS_WS_CD", key.getINS_WS_CD());
				}
				if(msgKeyType.containsKeyColumn("INS_CREATED_BY") && key.getINS_CREATED_BY() != null) {
					msgKey.setKeyValue("INS_CREATED_BY", key.getINS_CREATED_BY());
				}
				if(msgKeyType.containsKeyColumn("INS_CREATED_PRG_NM") && key.getINS_CREATED_PRG_NM() != null) {
					msgKey.setKeyValue("INS_CREATED_PRG_NM", key.getINS_CREATED_PRG_NM());
				}
				if(msgKeyType.containsKeyColumn("INS_UPDATED_BY") && key.getINS_UPDATED_BY() != null) {
					msgKey.setKeyValue("INS_UPDATED_BY", key.getINS_UPDATED_BY());
				}
				if(msgKeyType.containsKeyColumn("INS_UPDATED_PRG_NM") && key.getINS_UPDATED_PRG_NM() != null) {
					msgKey.setKeyValue("INS_UPDATED_PRG_NM", key.getINS_UPDATED_PRG_NM());
				}
				if(msgKeyType.containsKeyColumn("INS_PRINT_QTY") && key.getINS_PRINT_QTY() != null) {
					msgKey.setKeyValue("INS_PRINT_QTY", key.getINS_PRINT_QTY());
				}
				if(msgKeyType.containsKeyColumn("SEL_OPR_INST_CD") && key.getSEL_OPR_INST_CD() != null) {
					msgKey.setKeyValue("SEL_OPR_INST_CD", key.getSEL_OPR_INST_CD());
				}
				if(msgKeyType.containsKeyColumn("SEL_PARTIAL_PRD_NO") && key.getSEL_PARTIAL_PRD_NO() != null) {
					msgKey.setKeyValue("SEL_PARTIAL_PRD_NO", key.getSEL_PARTIAL_PRD_NO());
				}
				if(msgKeyType.containsKeyColumn("SEL_ITEM_CD") && key.getSEL_ITEM_CD() != null) {
					msgKey.setKeyValue("SEL_ITEM_CD", key.getSEL_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("SEL_ACPT_QTY") && key.getSEL_ACPT_QTY() != null) {
					msgKey.setKeyValue("SEL_ACPT_QTY", key.getSEL_ACPT_QTY());
				}
				if(msgKeyType.containsKeyColumn("SEL_OPR_DATE") && key.getSEL_OPR_DATE() != null) {
					msgKey.setKeyValue("SEL_OPR_DATE", key.getSEL_OPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("SEL_PKG_UNIT_QTY") && key.getSEL_PKG_UNIT_QTY() != null) {
					msgKey.setKeyValue("SEL_PKG_UNIT_QTY", key.getSEL_PKG_UNIT_QTY());
				}
				if(msgKeyType.containsKeyColumn("SEL_PLANT_CD") && key.getSEL_PLANT_CD() != null) {
					msgKey.setKeyValue("SEL_PLANT_CD", key.getSEL_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("SEL_WS_CD") && key.getSEL_WS_CD() != null) {
					msgKey.setKeyValue("SEL_WS_CD", key.getSEL_WS_CD());
				}
				if(msgKeyType.containsKeyColumn("GET_IDENT_CARD_CTL_NO") && key.getGET_IDENT_CARD_CTL_NO() != null) {
					msgKey.setKeyValue("GET_IDENT_CARD_CTL_NO", key.getGET_IDENT_CARD_CTL_NO());
				}
				if(msgKeyType.containsKeyColumn("TMP_IDENT_CARD_CTL_NO") && key.getTMP_IDENT_CARD_CTL_NO() != null) {
					msgKey.setKeyValue("TMP_IDENT_CARD_CTL_NO", key.getTMP_IDENT_CARD_CTL_NO());
				}
				if(msgKeyType.containsKeyColumn("TMP_OPR_INST_CD") && key.getTMP_OPR_INST_CD() != null) {
					msgKey.setKeyValue("TMP_OPR_INST_CD", key.getTMP_OPR_INST_CD());
				}
				if(msgKeyType.containsKeyColumn("TMP_PARTIAL_PRD_NO") && key.getTMP_PARTIAL_PRD_NO() != null) {
					msgKey.setKeyValue("TMP_PARTIAL_PRD_NO", key.getTMP_PARTIAL_PRD_NO());
				}
				if(msgKeyType.containsKeyColumn("TMP_RCV_ISSUE_CTRL_CD") && key.getTMP_RCV_ISSUE_CTRL_CD() != null) {
					msgKey.setKeyValue("TMP_RCV_ISSUE_CTRL_CD", key.getTMP_RCV_ISSUE_CTRL_CD());
				}
				if(msgKeyType.containsKeyColumn("TMP_ITEM_CD") && key.getTMP_ITEM_CD() != null) {
					msgKey.setKeyValue("TMP_ITEM_CD", key.getTMP_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("TMP_JOB_ODR_CD") && key.getTMP_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("TMP_JOB_ODR_CD", key.getTMP_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("TMP_FIRST_IDENT_CARD_QTY") && key.getTMP_FIRST_IDENT_CARD_QTY() != null) {
					msgKey.setKeyValue("TMP_FIRST_IDENT_CARD_QTY", key.getTMP_FIRST_IDENT_CARD_QTY());
				}
				if(msgKeyType.containsKeyColumn("TMP_IDENT_CARD_QTY") && key.getTMP_IDENT_CARD_QTY() != null) {
					msgKey.setKeyValue("TMP_IDENT_CARD_QTY", key.getTMP_IDENT_CARD_QTY());
				}
				if(msgKeyType.containsKeyColumn("TMP_OPR_DATE") && key.getTMP_OPR_DATE() != null) {
					msgKey.setKeyValue("TMP_OPR_DATE", key.getTMP_OPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("TMP_PKG_UNIT_QTY") && key.getTMP_PKG_UNIT_QTY() != null) {
					msgKey.setKeyValue("TMP_PKG_UNIT_QTY", key.getTMP_PKG_UNIT_QTY());
				}
				if(msgKeyType.containsKeyColumn("TMP_PLANT_CD") && key.getTMP_PLANT_CD() != null) {
					msgKey.setKeyValue("TMP_PLANT_CD", key.getTMP_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("TMP_WS_CD") && key.getTMP_WS_CD() != null) {
					msgKey.setKeyValue("TMP_WS_CD", key.getTMP_WS_CD());
				}
				if(msgKeyType.containsKeyColumn("PRODUCT_TYP") && key.getPRODUCT_TYP() != null) {
					msgKey.setKeyValue("PRODUCT_TYP", key.getPRODUCT_TYP());
				}
				if(msgKeyType.containsKeyColumn("TEMP_PLANOUT_QTY") && key.getTEMP_PLANOUT_QTY() != null) {
					msgKey.setKeyValue("TEMP_PLANOUT_QTY", key.getTEMP_PLANOUT_QTY());
				}
				if(msgKeyType.containsKeyColumn("TEMP_USE_QTY") && key.getTEMP_USE_QTY() != null) {
					msgKey.setKeyValue("TEMP_USE_QTY", key.getTEMP_USE_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_ITEM_CD") && key.getl_ITEM_CD() != null) {
					msgKey.setKeyValue("l_ITEM_CD", key.getl_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("l_COUNT") && key.getl_COUNT() != null) {
					msgKey.setKeyValue("l_COUNT", key.getl_COUNT());
				}
				if(msgKeyType.containsKeyColumn("h_OPR_DATE") && key.geth_OPR_DATE() != null) {
					msgKey.setKeyValue("h_OPR_DATE", key.geth_OPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("SYS_PARAMETER_VALUE") && key.getSYS_PARAMETER_VALUE() != null) {
					msgKey.setKeyValue("SYS_PARAMETER_VALUE", key.getSYS_PARAMETER_VALUE());
				}
				if(msgKeyType.containsKeyColumn("IN_SYS_PARAMETER_NAME") && key.getIN_SYS_PARAMETER_NAME() != null) {
					msgKey.setKeyValue("IN_SYS_PARAMETER_NAME", key.getIN_SYS_PARAMETER_NAME());
				}
				if(msgKeyType.containsKeyColumn("PRE_OPR_INST_CD") && key.getPRE_OPR_INST_CD() != null) {
					msgKey.setKeyValue("PRE_OPR_INST_CD", key.getPRE_OPR_INST_CD());
				}
				if(msgKeyType.containsKeyColumn("OUTSIDE_TYPE") && key.getOUTSIDE_TYPE() != null) {
					msgKey.setKeyValue("OUTSIDE_TYPE", key.getOUTSIDE_TYPE());
				}
				if(msgKeyType.containsKeyColumn("NEXT_WH_CD") && key.getNEXT_WH_CD() != null) {
					msgKey.setKeyValue("NEXT_WH_CD", key.getNEXT_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("INST_ISSUE_INST_CD") && key.getINST_ISSUE_INST_CD() != null) {
					msgKey.setKeyValue("INST_ISSUE_INST_CD", key.getINST_ISSUE_INST_CD());
				}
				if(msgKeyType.containsKeyColumn("INST_PLANT_CD") && key.getINST_PLANT_CD() != null) {
					msgKey.setKeyValue("INST_PLANT_CD", key.getINST_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("INST_ITEM_CD") && key.getINST_ITEM_CD() != null) {
					msgKey.setKeyValue("INST_ITEM_CD", key.getINST_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("INST_WORK_ODR_CD") && key.getINST_WORK_ODR_CD() != null) {
					msgKey.setKeyValue("INST_WORK_ODR_CD", key.getINST_WORK_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("INST_WORK_IN_PROC_CD") && key.getINST_WORK_IN_PROC_CD() != null) {
					msgKey.setKeyValue("INST_WORK_IN_PROC_CD", key.getINST_WORK_IN_PROC_CD());
				}
				if(msgKeyType.containsKeyColumn("INST_WH_CD") && key.getINST_WH_CD() != null) {
					msgKey.setKeyValue("INST_WH_CD", key.getINST_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("INST_ISSUE_INST_UNIT_DENOMINATOR") && key.getINST_ISSUE_INST_UNIT_DENOMINATOR() != null) {
					msgKey.setKeyValue("INST_ISSUE_INST_UNIT_DENOMINATOR", key.getINST_ISSUE_INST_UNIT_DENOMINATOR());
				}
				if(msgKeyType.containsKeyColumn("INST_ISSUE_INST_UNIT_NUMERATOR") && key.getINST_ISSUE_INST_UNIT_NUMERATOR() != null) {
					msgKey.setKeyValue("INST_ISSUE_INST_UNIT_NUMERATOR", key.getINST_ISSUE_INST_UNIT_NUMERATOR());
				}
				if(msgKeyType.containsKeyColumn("INST_UNIT_QTY_TYP") && key.getINST_UNIT_QTY_TYP() != null) {
					msgKey.setKeyValue("INST_UNIT_QTY_TYP", key.getINST_UNIT_QTY_TYP());
				}
				if(msgKeyType.containsKeyColumn("INST_LOT_CTRL_FLG") && key.getINST_LOT_CTRL_FLG() != null) {
					msgKey.setKeyValue("INST_LOT_CTRL_FLG", key.getINST_LOT_CTRL_FLG());
				}
				if(msgKeyType.containsKeyColumn("INST_OD_NO") && key.getINST_OD_NO() != null) {
					msgKey.setKeyValue("INST_OD_NO", key.getINST_OD_NO());
				}
				if(msgKeyType.containsKeyColumn("BASE_ITEM_CD") && key.getBASE_ITEM_CD() != null) {
					msgKey.setKeyValue("BASE_ITEM_CD", key.getBASE_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("BASE_PLANT_CD") && key.getBASE_PLANT_CD() != null) {
					msgKey.setKeyValue("BASE_PLANT_CD", key.getBASE_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("BASE_WH_CD") && key.getBASE_WH_CD() != null) {
					msgKey.setKeyValue("BASE_WH_CD", key.getBASE_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("BASE_JOB_ODR_CD") && key.getBASE_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("BASE_JOB_ODR_CD", key.getBASE_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("BASE_JOB_ODR_DETAIL_NO") && key.getBASE_JOB_ODR_DETAIL_NO() != null) {
					msgKey.setKeyValue("BASE_JOB_ODR_DETAIL_NO", key.getBASE_JOB_ODR_DETAIL_NO());
				}
				if(msgKeyType.containsKeyColumn("BASE_PUCH_ODR_CD") && key.getBASE_PUCH_ODR_CD() != null) {
					msgKey.setKeyValue("BASE_PUCH_ODR_CD", key.getBASE_PUCH_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("BASE_ACPT_NO") && key.getBASE_ACPT_NO() != null) {
					msgKey.setKeyValue("BASE_ACPT_NO", key.getBASE_ACPT_NO());
				}
				if(msgKeyType.containsKeyColumn("BASE_ACPT_RSLT_CRCT_NO") && key.getBASE_ACPT_RSLT_CRCT_NO() != null) {
					msgKey.setKeyValue("BASE_ACPT_RSLT_CRCT_NO", key.getBASE_ACPT_RSLT_CRCT_NO());
				}
				if(msgKeyType.containsKeyColumn("BASE_INSPEC_RSLT_CRCT_NO") && key.getBASE_INSPEC_RSLT_CRCT_NO() != null) {
					msgKey.setKeyValue("BASE_INSPEC_RSLT_CRCT_NO", key.getBASE_INSPEC_RSLT_CRCT_NO());
				}
				if(msgKeyType.containsKeyColumn("BASE_WORK_ODR_CD") && key.getBASE_WORK_ODR_CD() != null) {
					msgKey.setKeyValue("BASE_WORK_ODR_CD", key.getBASE_WORK_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("BASE_WORK_IN_PROC_CD") && key.getBASE_WORK_IN_PROC_CD() != null) {
					msgKey.setKeyValue("BASE_WORK_IN_PROC_CD", key.getBASE_WORK_IN_PROC_CD());
				}
				if(msgKeyType.containsKeyColumn("BASE_PARTIAL_PRD_NO") && key.getBASE_PARTIAL_PRD_NO() != null) {
					msgKey.setKeyValue("BASE_PARTIAL_PRD_NO", key.getBASE_PARTIAL_PRD_NO());
				}
				if(msgKeyType.containsKeyColumn("BASE_OPR_RSLT_CRCT_NO") && key.getBASE_OPR_RSLT_CRCT_NO() != null) {
					msgKey.setKeyValue("BASE_OPR_RSLT_CRCT_NO", key.getBASE_OPR_RSLT_CRCT_NO());
				}
				if(msgKeyType.containsKeyColumn("BASE_ISSUE_INST_CD") && key.getBASE_ISSUE_INST_CD() != null) {
					msgKey.setKeyValue("BASE_ISSUE_INST_CD", key.getBASE_ISSUE_INST_CD());
				}
				if(msgKeyType.containsKeyColumn("BASE_RCV_ISSUE_BEFORE_QTY") && key.getBASE_RCV_ISSUE_BEFORE_QTY() != null) {
					msgKey.setKeyValue("BASE_RCV_ISSUE_BEFORE_QTY", key.getBASE_RCV_ISSUE_BEFORE_QTY());
				}
				if(msgKeyType.containsKeyColumn("BASE_RCV_ISSUE_QTY") && key.getBASE_RCV_ISSUE_QTY() != null) {
					msgKey.setKeyValue("BASE_RCV_ISSUE_QTY", key.getBASE_RCV_ISSUE_QTY());
				}
				if(msgKeyType.containsKeyColumn("BASE_RCV_ISSUE_AFTER_QTY") && key.getBASE_RCV_ISSUE_AFTER_QTY() != null) {
					msgKey.setKeyValue("BASE_RCV_ISSUE_AFTER_QTY", key.getBASE_RCV_ISSUE_AFTER_QTY());
				}
				if(msgKeyType.containsKeyColumn("BASE_RCV_ISSUE_ODD_QTY") && key.getBASE_RCV_ISSUE_ODD_QTY() != null) {
					msgKey.setKeyValue("BASE_RCV_ISSUE_ODD_QTY", key.getBASE_RCV_ISSUE_ODD_QTY());
				}
				if(msgKeyType.containsKeyColumn("BASE_OD_NO") && key.getBASE_OD_NO() != null) {
					msgKey.setKeyValue("BASE_OD_NO", key.getBASE_OD_NO());
				}
				if(msgKeyType.containsKeyColumn("BASE_LOT_NO") && key.getBASE_LOT_NO() != null) {
					msgKey.setKeyValue("BASE_LOT_NO", key.getBASE_LOT_NO());
				}
				if(msgKeyType.containsKeyColumn("BASE_VEND_LOT_NO") && key.getBASE_VEND_LOT_NO() != null) {
					msgKey.setKeyValue("BASE_VEND_LOT_NO", key.getBASE_VEND_LOT_NO());
				}
				if(msgKeyType.containsKeyColumn("BASE_RCV_ISSUE_COMMENT") && key.getBASE_RCV_ISSUE_COMMENT() != null) {
					msgKey.setKeyValue("BASE_RCV_ISSUE_COMMENT", key.getBASE_RCV_ISSUE_COMMENT());
				}
				if(msgKeyType.containsKeyColumn("BASE_RCV_ISSUE_CMPLT_FLG") && key.getBASE_RCV_ISSUE_CMPLT_FLG() != null) {
					msgKey.setKeyValue("BASE_RCV_ISSUE_CMPLT_FLG", key.getBASE_RCV_ISSUE_CMPLT_FLG());
				}
				if(msgKeyType.containsKeyColumn("BASE_COMPANY_CD") && key.getBASE_COMPANY_CD() != null) {
					msgKey.setKeyValue("BASE_COMPANY_CD", key.getBASE_COMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("BASE_OPR_DATE") && key.getBASE_OPR_DATE() != null) {
					msgKey.setKeyValue("BASE_OPR_DATE", key.getBASE_OPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("INST_RCV_ISSUE_TYP") && key.getINST_RCV_ISSUE_TYP() != null) {
					msgKey.setKeyValue("INST_RCV_ISSUE_TYP", key.getINST_RCV_ISSUE_TYP());
				}
				if(msgKeyType.containsKeyColumn("INST_OPR_INST_CD") && key.getINST_OPR_INST_CD() != null) {
					msgKey.setKeyValue("INST_OPR_INST_CD", key.getINST_OPR_INST_CD());
				}
				if(msgKeyType.containsKeyColumn("INST_PARTIAL_PRD_NO") && key.getINST_PARTIAL_PRD_NO() != null) {
					msgKey.setKeyValue("INST_PARTIAL_PRD_NO", key.getINST_PARTIAL_PRD_NO());
				}
				if(msgKeyType.containsKeyColumn("INST_RCV_ISSUE_GNR_TYP") && key.getINST_RCV_ISSUE_GNR_TYP() != null) {
					msgKey.setKeyValue("INST_RCV_ISSUE_GNR_TYP", key.getINST_RCV_ISSUE_GNR_TYP());
				}
				if(msgKeyType.containsKeyColumn("T_OPR_RSLT_WH_CD") && key.getT_OPR_RSLT_WH_CD() != null) {
					msgKey.setKeyValue("T_OPR_RSLT_WH_CD", key.getT_OPR_RSLT_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("BEFORE_WH_CD") && key.getBEFORE_WH_CD() != null) {
					msgKey.setKeyValue("BEFORE_WH_CD", key.getBEFORE_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("ACPT_RSLT_CRCT_NO") && key.getACPT_RSLT_CRCT_NO() != null) {
					msgKey.setKeyValue("ACPT_RSLT_CRCT_NO", key.getACPT_RSLT_CRCT_NO());
				}
				if(msgKeyType.containsKeyColumn("INSPEC_RSLT_CRCT_NO") && key.getINSPEC_RSLT_CRCT_NO() != null) {
					msgKey.setKeyValue("INSPEC_RSLT_CRCT_NO", key.getINSPEC_RSLT_CRCT_NO());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_BEFORE_QTY") && key.getRCV_ISSUE_BEFORE_QTY() != null) {
					msgKey.setKeyValue("RCV_ISSUE_BEFORE_QTY", key.getRCV_ISSUE_BEFORE_QTY());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_AMOUNT") && key.getRCV_ISSUE_AMOUNT() != null) {
					msgKey.setKeyValue("RCV_ISSUE_AMOUNT", key.getRCV_ISSUE_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("SUM_QTY") && key.getSUM_QTY() != null) {
					msgKey.setKeyValue("SUM_QTY", key.getSUM_QTY());
				}
				if(msgKeyType.containsKeyColumn("FROM_PUCH_ODR_CD") && key.getFROM_PUCH_ODR_CD() != null) {
					msgKey.setKeyValue("FROM_PUCH_ODR_CD", key.getFROM_PUCH_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("FROM_ITEM_CD") && key.getFROM_ITEM_CD() != null) {
					msgKey.setKeyValue("FROM_ITEM_CD", key.getFROM_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("FROM_LOT_NO") && key.getFROM_LOT_NO() != null) {
					msgKey.setKeyValue("FROM_LOT_NO", key.getFROM_LOT_NO());
				}
				if(msgKeyType.containsKeyColumn("TO_PUCH_ODR_CD") && key.getTO_PUCH_ODR_CD() != null) {
					msgKey.setKeyValue("TO_PUCH_ODR_CD", key.getTO_PUCH_ODR_CD());
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
					AD0040010Struct key = new AD0040010Struct();
					if(msgKeyType.containsKeyColumn("OPR_TIME_UNIT_TYP_name")) {
						key.setOPR_TIME_UNIT_TYP_name(msgKey.getKeyValue("OPR_TIME_UNIT_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("OPR_TIME_UNIT_TYP_val")) {
						key.setOPR_TIME_UNIT_TYP_val(msgKey.getKeyValue("OPR_TIME_UNIT_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_TYP_DN")) {
						key.setISSUE_TYP_DN(msgKey.getKeyValue("ISSUE_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP_DN")) {
						key.setMRP_ODR_TYP_DN(msgKey.getKeyValue("MRP_ODR_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("h_OPR_INST_CD")) {
						key.seth_OPR_INST_CD(msgKey.getKeyValue("h_OPR_INST_CD"));
					}
					if(msgKeyType.containsKeyColumn("c_COMPLETE")) {
						key.setc_COMPLETE(msgKey.getKeyValue("c_COMPLETE"));
					}
					if(msgKeyType.containsKeyColumn("l_PARTIAL_PRD_NO")) {
						key.setl_PARTIAL_PRD_NO(msgKey.getKeyValue("l_PARTIAL_PRD_NO"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_TIME")) {
						key.setRCV_ISSUE_TIME(msgKey.getKeyValue("RCV_ISSUE_TIME"));
					}
					if(msgKeyType.containsKeyColumn("OPRATION_TIME")) {
						key.setOPRATION_TIME(msgKey.getKeyValue("OPRATION_TIME"));
					}
					if(msgKeyType.containsKeyColumn("h_SYS_LOT_CTRL_FLG")) {
						key.seth_SYS_LOT_CTRL_FLG(msgKey.getKeyValue("h_SYS_LOT_CTRL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("param1")) {
						key.setparam1(msgKey.getKeyValue("param1"));
					}
					if(msgKeyType.containsKeyColumn("param2")) {
						key.setparam2(msgKey.getKeyValue("param2"));
					}
					if(msgKeyType.containsKeyColumn("param3")) {
						key.setparam3(msgKey.getKeyValue("param3"));
					}
					if(msgKeyType.containsKeyColumn("h_LOT_NO")) {
						key.seth_LOT_NO(msgKey.getKeyValue("h_LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_DEFECT_CAUSE_CD_name")) {
						key.setl_DEFECT_CAUSE_CD_name(msgKey.getKeyValue("l_DEFECT_CAUSE_CD_name"));
					}
					if(msgKeyType.containsKeyColumn("l_DEFECT_CAUSE_CD_val")) {
						key.setl_DEFECT_CAUSE_CD_val(msgKey.getKeyValue("l_DEFECT_CAUSE_CD_val"));
					}
					if(msgKeyType.containsKeyColumn("c_OUTPUT")) {
						key.setc_OUTPUT(msgKey.getKeyValue("c_OUTPUT"));
					}
					if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE")) {
						key.setDOWNLOAD_FILE(msgKey.getKeyValue("DOWNLOAD_FILE"));
					}
					if(msgKeyType.containsKeyColumn("l_ITEM_NAME")) {
						key.setl_ITEM_NAME(msgKey.getKeyValue("l_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("h_PROCESS_MANAGE_FLG")) {
						key.seth_PROCESS_MANAGE_FLG(msgKey.getKeyValue("h_PROCESS_MANAGE_FLG"));
					}
					if(msgKeyType.containsKeyColumn("SAVE_STOCK_ON_HAND_QTY")) {
						key.setSAVE_STOCK_ON_HAND_QTY(msgKey.getKeyValue("SAVE_STOCK_ON_HAND_QTY"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_CD")) {
						key.setOPR_INST_CD(msgKey.getKeyValue("OPR_INST_CD"));
					}
					if(msgKeyType.containsKeyColumn("PARTIAL_PRD_NO")) {
						key.setPARTIAL_PRD_NO(msgKey.getKeyValue("PARTIAL_PRD_NO"));
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
					if(msgKeyType.containsKeyColumn("OPR_DATE")) {
						key.setOPR_DATE(msgKey.getKeyValue("OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("WH_CD")) {
						key.setWH_CD(msgKey.getKeyValue("WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("WS_CD")) {
						key.setWS_CD(msgKey.getKeyValue("WS_CD"));
					}
					if(msgKeyType.containsKeyColumn("OPR_RSLT_PERSON")) {
						key.setOPR_RSLT_PERSON(msgKey.getKeyValue("OPR_RSLT_PERSON"));
					}
					if(msgKeyType.containsKeyColumn("OPR_TIME_UNIT_TYP")) {
						key.setOPR_TIME_UNIT_TYP(msgKey.getKeyValue("OPR_TIME_UNIT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PRE_ARRANGEMENT_TIME")) {
						key.setPRE_ARRANGEMENT_TIME(msgKey.getKeyValue("PRE_ARRANGEMENT_TIME"));
					}
					if(msgKeyType.containsKeyColumn("OPR_TIME")) {
						key.setOPR_TIME(msgKey.getKeyValue("OPR_TIME"));
					}
					if(msgKeyType.containsKeyColumn("POST_ARRANGEMENT_TIME")) {
						key.setPOST_ARRANGEMENT_TIME(msgKey.getKeyValue("POST_ARRANGEMENT_TIME"));
					}
					if(msgKeyType.containsKeyColumn("CESSATION_TIME")) {
						key.setCESSATION_TIME(msgKey.getKeyValue("CESSATION_TIME"));
					}
					if(msgKeyType.containsKeyColumn("CESSATION_CAUSE")) {
						key.setCESSATION_CAUSE(msgKey.getKeyValue("CESSATION_CAUSE"));
					}
					if(msgKeyType.containsKeyColumn("VEND_LOT_NO")) {
						key.setVEND_LOT_NO(msgKey.getKeyValue("VEND_LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("LOT_NO")) {
						key.setLOT_NO(msgKey.getKeyValue("LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("OPR_RSLT_COMMENT")) {
						key.setOPR_RSLT_COMMENT(msgKey.getKeyValue("OPR_RSLT_COMMENT"));
					}
					if(msgKeyType.containsKeyColumn("RSLT_MODIFY_COUNT")) {
						key.setRSLT_MODIFY_COUNT(msgKey.getKeyValue("RSLT_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("WH_NAME")) {
						key.setWH_NAME(msgKey.getKeyValue("WH_NAME"));
					}
					if(msgKeyType.containsKeyColumn("WS_NAME")) {
						key.setWS_NAME(msgKey.getKeyValue("WS_NAME"));
					}
					if(msgKeyType.containsKeyColumn("IN_OPR_INST_CD")) {
						key.setIN_OPR_INST_CD(msgKey.getKeyValue("IN_OPR_INST_CD"));
					}
					if(msgKeyType.containsKeyColumn("WORK_IN_PROC_CD")) {
						key.setWORK_IN_PROC_CD(msgKey.getKeyValue("WORK_IN_PROC_CD"));
					}
					if(msgKeyType.containsKeyColumn("PROC_NAME")) {
						key.setPROC_NAME(msgKey.getKeyValue("PROC_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PROC_NO")) {
						key.setPROC_NO(msgKey.getKeyValue("PROC_NO"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_WORK_STS_TYP")) {
						key.seth_WORK_STS_TYP(msgKey.getKeyValue("h_WORK_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("WORK_ODR_CD")) {
						key.setWORK_ODR_CD(msgKey.getKeyValue("WORK_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("OD_NO")) {
						key.setOD_NO(msgKey.getKeyValue("OD_NO"));
					}
					if(msgKeyType.containsKeyColumn("OUTSIDE_TYP")) {
						key.setOUTSIDE_TYP(msgKey.getKeyValue("OUTSIDE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("h_PROC_MODIFY_COUNT")) {
						key.seth_PROC_MODIFY_COUNT(msgKey.getKeyValue("h_PROC_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("h_FINAL_PROC_FLG")) {
						key.seth_FINAL_PROC_FLG(msgKey.getKeyValue("h_FINAL_PROC_FLG"));
					}
					if(msgKeyType.containsKeyColumn("WORK_ODR_DLV_DATE")) {
						key.setWORK_ODR_DLV_DATE(msgKey.getKeyValue("WORK_ODR_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_START_DATE")) {
						key.setOPR_INST_START_DATE(msgKey.getKeyValue("OPR_INST_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_QTY")) {
						key.setOPR_INST_QTY(msgKey.getKeyValue("OPR_INST_QTY"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_NAME")) {
						key.setITEM_NAME(msgKey.getKeyValue("ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP")) {
						key.setUNIT_QTY_TYP(msgKey.getKeyValue("UNIT_QTY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("DRAW_CD")) {
						key.setDRAW_CD(msgKey.getKeyValue("DRAW_CD"));
					}
					if(msgKeyType.containsKeyColumn("SPEC")) {
						key.setSPEC(msgKey.getKeyValue("SPEC"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP")) {
						key.setMRP_ODR_TYP(msgKey.getKeyValue("MRP_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT")) {
						key.setSTOCK_UNIT(msgKey.getKeyValue("STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("LOT_NUMBERING_TYP")) {
						key.setLOT_NUMBERING_TYP(msgKey.getKeyValue("LOT_NUMBERING_TYP"));
					}
					if(msgKeyType.containsKeyColumn("LOT_CTRL_FLG")) {
						key.setLOT_CTRL_FLG(msgKey.getKeyValue("LOT_CTRL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_CD")) {
						key.setJOB_ODR_CD(msgKey.getKeyValue("JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_DETAIL_NO")) {
						key.setJOB_ODR_DETAIL_NO(msgKey.getKeyValue("JOB_ODR_DETAIL_NO"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_CANCEL_NO")) {
						key.setJOB_ODR_CANCEL_NO(msgKey.getKeyValue("JOB_ODR_CANCEL_NO"));
					}
					if(msgKeyType.containsKeyColumn("SUM_ACPT_QTY")) {
						key.setSUM_ACPT_QTY(msgKey.getKeyValue("SUM_ACPT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("SUM_DEFECT_QTY")) {
						key.setSUM_DEFECT_QTY(msgKey.getKeyValue("SUM_DEFECT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("h_BUSINESS_OPR_DATE")) {
						key.seth_BUSINESS_OPR_DATE(msgKey.getKeyValue("h_BUSINESS_OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("h_BUSINESS_OPR_TIME")) {
						key.seth_BUSINESS_OPR_TIME(msgKey.getKeyValue("h_BUSINESS_OPR_TIME"));
					}
					if(msgKeyType.containsKeyColumn("USER_CD")) {
						key.setUSER_CD(msgKey.getKeyValue("USER_CD"));
					}
					if(msgKeyType.containsKeyColumn("PRG_NM")) {
						key.setPRG_NM(msgKey.getKeyValue("PRG_NM"));
					}
					if(msgKeyType.containsKeyColumn("WH_TYP")) {
						key.setWH_TYP(msgKey.getKeyValue("WH_TYP"));
					}
					if(msgKeyType.containsKeyColumn("OPR_CRCT_NO")) {
						key.setOPR_CRCT_NO(msgKey.getKeyValue("OPR_CRCT_NO"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_CD_GNR_TYP")) {
						key.setOPR_INST_CD_GNR_TYP(msgKey.getKeyValue("OPR_INST_CD_GNR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_DEFECT_CAUSE_CD")) {
						key.setl_DEFECT_CAUSE_CD(msgKey.getKeyValue("l_DEFECT_CAUSE_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_DEFECT_QTY")) {
						key.setl_DEFECT_QTY(msgKey.getKeyValue("l_DEFECT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_DEFECT_COMMENT")) {
						key.setl_DEFECT_COMMENT(msgKey.getKeyValue("l_DEFECT_COMMENT"));
					}
					if(msgKeyType.containsKeyColumn("DEFECT_MODIFY_COUNT")) {
						key.setDEFECT_MODIFY_COUNT(msgKey.getKeyValue("DEFECT_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("CRCT_TYP")) {
						key.setCRCT_TYP(msgKey.getKeyValue("CRCT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("h_ITEM_MODIFY_COUNT")) {
						key.seth_ITEM_MODIFY_COUNT(msgKey.getKeyValue("h_ITEM_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("OPR_RSLT_TYP")) {
						key.setOPR_RSLT_TYP(msgKey.getKeyValue("OPR_RSLT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PROC_MODIFY_COUNT")) {
						key.setPROC_MODIFY_COUNT(msgKey.getKeyValue("PROC_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_MODIFY_COUNT")) {
						key.setITEM_MODIFY_COUNT(msgKey.getKeyValue("ITEM_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("UPDATE_WORK_STS_TYP")) {
						key.setUPDATE_WORK_STS_TYP(msgKey.getKeyValue("UPDATE_WORK_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("h_ISSUE_INST_CD")) {
						key.seth_ISSUE_INST_CD(msgKey.getKeyValue("h_ISSUE_INST_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_ISSUE_INST_UNIT_DENOMINATOR")) {
						key.seth_ISSUE_INST_UNIT_DENOMINATOR(msgKey.getKeyValue("h_ISSUE_INST_UNIT_DENOMINATOR"));
					}
					if(msgKeyType.containsKeyColumn("h_ISSUE_INST_UNIT_NUMERATOR")) {
						key.seth_ISSUE_INST_UNIT_NUMERATOR(msgKey.getKeyValue("h_ISSUE_INST_UNIT_NUMERATOR"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_INST_UNIT_FRACTION")) {
						key.setISSUE_INST_UNIT_FRACTION(msgKey.getKeyValue("ISSUE_INST_UNIT_FRACTION"));
					}
					if(msgKeyType.containsKeyColumn("h_ISSUE_TYP")) {
						key.seth_ISSUE_TYP(msgKey.getKeyValue("h_ISSUE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("TOTAL_ISSUE_QTY")) {
						key.setTOTAL_ISSUE_QTY(msgKey.getKeyValue("TOTAL_ISSUE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("SUPPLIED_ISSUE_QTY")) {
						key.setSUPPLIED_ISSUE_QTY(msgKey.getKeyValue("SUPPLIED_ISSUE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_LOT_NO")) {
						key.setl_LOT_NO(msgKey.getKeyValue("l_LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("ROW_COUNT")) {
						key.setROW_COUNT(msgKey.getKeyValue("ROW_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("count_RCV_ISSUE")) {
						key.setcount_RCV_ISSUE(msgKey.getKeyValue("count_RCV_ISSUE"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_QTY")) {
						key.setRCV_ISSUE_QTY(msgKey.getKeyValue("RCV_ISSUE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_ODD_QTY")) {
						key.setRCV_ISSUE_ODD_QTY(msgKey.getKeyValue("RCV_ISSUE_ODD_QTY"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_CTRL_CD")) {
						key.setRCV_ISSUE_CTRL_CD(msgKey.getKeyValue("RCV_ISSUE_CTRL_CD"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_TYP")) {
						key.setRCV_ISSUE_TYP(msgKey.getKeyValue("RCV_ISSUE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("OPR_RSLT_CRCT_NO")) {
						key.setOPR_RSLT_CRCT_NO(msgKey.getKeyValue("OPR_RSLT_CRCT_NO"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_AFTER_QTY")) {
						key.setRCV_ISSUE_AFTER_QTY(msgKey.getKeyValue("RCV_ISSUE_AFTER_QTY"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_DATE")) {
						key.setRCV_ISSUE_DATE(msgKey.getKeyValue("RCV_ISSUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_GNR_TYP")) {
						key.setRCV_ISSUE_GNR_TYP(msgKey.getKeyValue("RCV_ISSUE_GNR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UPD_TYP")) {
						key.setSTOCK_UPD_TYP(msgKey.getKeyValue("STOCK_UPD_TYP"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_COMMENT")) {
						key.setRCV_ISSUE_COMMENT(msgKey.getKeyValue("RCV_ISSUE_COMMENT"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_CMPLT_FLG")) {
						key.setRCV_ISSUE_CMPLT_FLG(msgKey.getKeyValue("RCV_ISSUE_CMPLT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("COMPANY_CD")) {
						key.setCOMPANY_CD(msgKey.getKeyValue("COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("MANHOUR_TYP")) {
						key.setMANHOUR_TYP(msgKey.getKeyValue("MANHOUR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_TYP")) {
						key.setISSUE_TYP(msgKey.getKeyValue("ISSUE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_ON_HAND_QTY")) {
						key.setSTOCK_ON_HAND_QTY(msgKey.getKeyValue("STOCK_ON_HAND_QTY"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_TYP")) {
						key.setJOB_ODR_TYP(msgKey.getKeyValue("JOB_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("TIME_CTRL")) {
						key.setTIME_CTRL(msgKey.getKeyValue("TIME_CTRL"));
					}
					if(msgKeyType.containsKeyColumn("PAST_RESULT_ENTRY_TYP")) {
						key.setPAST_RESULT_ENTRY_TYP(msgKey.getKeyValue("PAST_RESULT_ENTRY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("TEMP_PLAN_QTY")) {
						key.setTEMP_PLAN_QTY(msgKey.getKeyValue("TEMP_PLAN_QTY"));
					}
					if(msgKeyType.containsKeyColumn("TEMP_USEOVER_QTY")) {
						key.setTEMP_USEOVER_QTY(msgKey.getKeyValue("TEMP_USEOVER_QTY"));
					}
					if(msgKeyType.containsKeyColumn("BEST_BEFORE_DATE")) {
						key.setBEST_BEFORE_DATE(msgKey.getKeyValue("BEST_BEFORE_DATE"));
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
					if(msgKeyType.containsKeyColumn("RSLT_CTL_SEQ_NO")) {
						key.setRSLT_CTL_SEQ_NO(msgKey.getKeyValue("RSLT_CTL_SEQ_NO"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_CD")) {
						key.setPUCH_ODR_CD(msgKey.getKeyValue("PUCH_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("ACPT_NO")) {
						key.setACPT_NO(msgKey.getKeyValue("ACPT_NO"));
					}
					if(msgKeyType.containsKeyColumn("PART_SUPPLIED_COMMENT")) {
						key.setPART_SUPPLIED_COMMENT(msgKey.getKeyValue("PART_SUPPLIED_COMMENT"));
					}
					if(msgKeyType.containsKeyColumn("SUPPLIED_DATE")) {
						key.setSUPPLIED_DATE(msgKey.getKeyValue("SUPPLIED_DATE"));
					}
					if(msgKeyType.containsKeyColumn("h_PARTIAL_PRD_NO")) {
						key.seth_PARTIAL_PRD_NO(msgKey.getKeyValue("h_PARTIAL_PRD_NO"));
					}
					if(msgKeyType.containsKeyColumn("h_WORK_IN_PROC_CD")) {
						key.seth_WORK_IN_PROC_CD(msgKey.getKeyValue("h_WORK_IN_PROC_CD"));
					}
					if(msgKeyType.containsKeyColumn("ALCD_QTY")) {
						key.setALCD_QTY(msgKey.getKeyValue("ALCD_QTY"));
					}
					if(msgKeyType.containsKeyColumn("NEXTVAL")) {
						key.setNEXTVAL(msgKey.getKeyValue("NEXTVAL"));
					}
					if(msgKeyType.containsKeyColumn("PARENT_ITEM_CD")) {
						key.setPARENT_ITEM_CD(msgKey.getKeyValue("PARENT_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("COMP_ITEM_CD")) {
						key.setCOMP_ITEM_CD(msgKey.getKeyValue("COMP_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("BEST_BEFORE_DATE_CHECK_FLG")) {
						key.setBEST_BEFORE_DATE_CHECK_FLG(msgKey.getKeyValue("BEST_BEFORE_DATE_CHECK_FLG"));
					}
					if(msgKeyType.containsKeyColumn("BBD_c_FLG")) {
						key.setBBD_c_FLG(msgKey.getKeyValue("BBD_c_FLG"));
					}
					if(msgKeyType.containsKeyColumn("RSLT_CTRL_SEQ_NO")) {
						key.setRSLT_CTRL_SEQ_NO(msgKey.getKeyValue("RSLT_CTRL_SEQ_NO"));
					}
					if(msgKeyType.containsKeyColumn("SUPPLIED_ISSUE_QTY_sum")) {
						key.setSUPPLIED_ISSUE_QTY_sum(msgKey.getKeyValue("SUPPLIED_ISSUE_QTY_sum"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_INST_CD")) {
						key.setISSUE_INST_CD(msgKey.getKeyValue("ISSUE_INST_CD"));
					}
					if(msgKeyType.containsKeyColumn("UPDATED_PRG_NM")) {
						key.setUPDATED_PRG_NM(msgKey.getKeyValue("UPDATED_PRG_NM"));
					}
					if(msgKeyType.containsKeyColumn("DM_STS_TYP")) {
						key.setDM_STS_TYP(msgKey.getKeyValue("DM_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_CMPLT_DATE")) {
						key.setISSUE_CMPLT_DATE(msgKey.getKeyValue("ISSUE_CMPLT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("PARENT_OD_NO")) {
						key.setPARENT_OD_NO(msgKey.getKeyValue("PARENT_OD_NO"));
					}
					if(msgKeyType.containsKeyColumn("PARENT_OUTSIDE_TYP")) {
						key.setPARENT_OUTSIDE_TYP(msgKey.getKeyValue("PARENT_OUTSIDE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PARENT_MRP_ODR_TYP")) {
						key.setPARENT_MRP_ODR_TYP(msgKey.getKeyValue("PARENT_MRP_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PARENT_PUCH_ODR_CD")) {
						key.setPARENT_PUCH_ODR_CD(msgKey.getKeyValue("PARENT_PUCH_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("PARENT_WORK_ODR_CD")) {
						key.setPARENT_WORK_ODR_CD(msgKey.getKeyValue("PARENT_WORK_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("PARENT_WORK_IN_PROC_CD")) {
						key.setPARENT_WORK_IN_PROC_CD(msgKey.getKeyValue("PARENT_WORK_IN_PROC_CD"));
					}
					if(msgKeyType.containsKeyColumn("FORM_SET_CODE")) {
						key.setFORM_SET_CODE(msgKey.getKeyValue("FORM_SET_CODE"));
					}
					if(msgKeyType.containsKeyColumn("FORM_SET_ITEM_CD")) {
						key.setFORM_SET_ITEM_CD(msgKey.getKeyValue("FORM_SET_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("INS_PRINT_GRP_NO")) {
						key.setINS_PRINT_GRP_NO(msgKey.getKeyValue("INS_PRINT_GRP_NO"));
					}
					if(msgKeyType.containsKeyColumn("INS_PAGE_NO")) {
						key.setINS_PAGE_NO(msgKey.getKeyValue("INS_PAGE_NO"));
					}
					if(msgKeyType.containsKeyColumn("INS_IDENT_CARD_CTL_NO")) {
						key.setINS_IDENT_CARD_CTL_NO(msgKey.getKeyValue("INS_IDENT_CARD_CTL_NO"));
					}
					if(msgKeyType.containsKeyColumn("INS_OPR_INST_CD")) {
						key.setINS_OPR_INST_CD(msgKey.getKeyValue("INS_OPR_INST_CD"));
					}
					if(msgKeyType.containsKeyColumn("INS_PARTIAL_PRD_NO")) {
						key.setINS_PARTIAL_PRD_NO(msgKey.getKeyValue("INS_PARTIAL_PRD_NO"));
					}
					if(msgKeyType.containsKeyColumn("INS_RCV_ISSUE_CTRL_CD")) {
						key.setINS_RCV_ISSUE_CTRL_CD(msgKey.getKeyValue("INS_RCV_ISSUE_CTRL_CD"));
					}
					if(msgKeyType.containsKeyColumn("INS_ITEM_CD")) {
						key.setINS_ITEM_CD(msgKey.getKeyValue("INS_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("INS_JOB_ODR_CD")) {
						key.setINS_JOB_ODR_CD(msgKey.getKeyValue("INS_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("INS_FIRST_IDENT_CARD_QTY")) {
						key.setINS_FIRST_IDENT_CARD_QTY(msgKey.getKeyValue("INS_FIRST_IDENT_CARD_QTY"));
					}
					if(msgKeyType.containsKeyColumn("INS_IDENT_CARD_QTY")) {
						key.setINS_IDENT_CARD_QTY(msgKey.getKeyValue("INS_IDENT_CARD_QTY"));
					}
					if(msgKeyType.containsKeyColumn("INS_OPR_DATE")) {
						key.setINS_OPR_DATE(msgKey.getKeyValue("INS_OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("INS_PKG_UNIT_QTY")) {
						key.setINS_PKG_UNIT_QTY(msgKey.getKeyValue("INS_PKG_UNIT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("INS_PLANT_CD")) {
						key.setINS_PLANT_CD(msgKey.getKeyValue("INS_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("INS_WS_CD")) {
						key.setINS_WS_CD(msgKey.getKeyValue("INS_WS_CD"));
					}
					if(msgKeyType.containsKeyColumn("INS_CREATED_BY")) {
						key.setINS_CREATED_BY(msgKey.getKeyValue("INS_CREATED_BY"));
					}
					if(msgKeyType.containsKeyColumn("INS_CREATED_PRG_NM")) {
						key.setINS_CREATED_PRG_NM(msgKey.getKeyValue("INS_CREATED_PRG_NM"));
					}
					if(msgKeyType.containsKeyColumn("INS_UPDATED_BY")) {
						key.setINS_UPDATED_BY(msgKey.getKeyValue("INS_UPDATED_BY"));
					}
					if(msgKeyType.containsKeyColumn("INS_UPDATED_PRG_NM")) {
						key.setINS_UPDATED_PRG_NM(msgKey.getKeyValue("INS_UPDATED_PRG_NM"));
					}
					if(msgKeyType.containsKeyColumn("INS_PRINT_QTY")) {
						key.setINS_PRINT_QTY(msgKey.getKeyValue("INS_PRINT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("SEL_OPR_INST_CD")) {
						key.setSEL_OPR_INST_CD(msgKey.getKeyValue("SEL_OPR_INST_CD"));
					}
					if(msgKeyType.containsKeyColumn("SEL_PARTIAL_PRD_NO")) {
						key.setSEL_PARTIAL_PRD_NO(msgKey.getKeyValue("SEL_PARTIAL_PRD_NO"));
					}
					if(msgKeyType.containsKeyColumn("SEL_ITEM_CD")) {
						key.setSEL_ITEM_CD(msgKey.getKeyValue("SEL_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("SEL_ACPT_QTY")) {
						key.setSEL_ACPT_QTY(msgKey.getKeyValue("SEL_ACPT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("SEL_OPR_DATE")) {
						key.setSEL_OPR_DATE(msgKey.getKeyValue("SEL_OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("SEL_PKG_UNIT_QTY")) {
						key.setSEL_PKG_UNIT_QTY(msgKey.getKeyValue("SEL_PKG_UNIT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("SEL_PLANT_CD")) {
						key.setSEL_PLANT_CD(msgKey.getKeyValue("SEL_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("SEL_WS_CD")) {
						key.setSEL_WS_CD(msgKey.getKeyValue("SEL_WS_CD"));
					}
					if(msgKeyType.containsKeyColumn("GET_IDENT_CARD_CTL_NO")) {
						key.setGET_IDENT_CARD_CTL_NO(msgKey.getKeyValue("GET_IDENT_CARD_CTL_NO"));
					}
					if(msgKeyType.containsKeyColumn("TMP_IDENT_CARD_CTL_NO")) {
						key.setTMP_IDENT_CARD_CTL_NO(msgKey.getKeyValue("TMP_IDENT_CARD_CTL_NO"));
					}
					if(msgKeyType.containsKeyColumn("TMP_OPR_INST_CD")) {
						key.setTMP_OPR_INST_CD(msgKey.getKeyValue("TMP_OPR_INST_CD"));
					}
					if(msgKeyType.containsKeyColumn("TMP_PARTIAL_PRD_NO")) {
						key.setTMP_PARTIAL_PRD_NO(msgKey.getKeyValue("TMP_PARTIAL_PRD_NO"));
					}
					if(msgKeyType.containsKeyColumn("TMP_RCV_ISSUE_CTRL_CD")) {
						key.setTMP_RCV_ISSUE_CTRL_CD(msgKey.getKeyValue("TMP_RCV_ISSUE_CTRL_CD"));
					}
					if(msgKeyType.containsKeyColumn("TMP_ITEM_CD")) {
						key.setTMP_ITEM_CD(msgKey.getKeyValue("TMP_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("TMP_JOB_ODR_CD")) {
						key.setTMP_JOB_ODR_CD(msgKey.getKeyValue("TMP_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("TMP_FIRST_IDENT_CARD_QTY")) {
						key.setTMP_FIRST_IDENT_CARD_QTY(msgKey.getKeyValue("TMP_FIRST_IDENT_CARD_QTY"));
					}
					if(msgKeyType.containsKeyColumn("TMP_IDENT_CARD_QTY")) {
						key.setTMP_IDENT_CARD_QTY(msgKey.getKeyValue("TMP_IDENT_CARD_QTY"));
					}
					if(msgKeyType.containsKeyColumn("TMP_OPR_DATE")) {
						key.setTMP_OPR_DATE(msgKey.getKeyValue("TMP_OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("TMP_PKG_UNIT_QTY")) {
						key.setTMP_PKG_UNIT_QTY(msgKey.getKeyValue("TMP_PKG_UNIT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("TMP_PLANT_CD")) {
						key.setTMP_PLANT_CD(msgKey.getKeyValue("TMP_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("TMP_WS_CD")) {
						key.setTMP_WS_CD(msgKey.getKeyValue("TMP_WS_CD"));
					}
					if(msgKeyType.containsKeyColumn("PRODUCT_TYP")) {
						key.setPRODUCT_TYP(msgKey.getKeyValue("PRODUCT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("TEMP_PLANOUT_QTY")) {
						key.setTEMP_PLANOUT_QTY(msgKey.getKeyValue("TEMP_PLANOUT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("TEMP_USE_QTY")) {
						key.setTEMP_USE_QTY(msgKey.getKeyValue("TEMP_USE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_ITEM_CD")) {
						key.setl_ITEM_CD(msgKey.getKeyValue("l_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_COUNT")) {
						key.setl_COUNT(msgKey.getKeyValue("l_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("h_OPR_DATE")) {
						key.seth_OPR_DATE(msgKey.getKeyValue("h_OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("SYS_PARAMETER_VALUE")) {
						key.setSYS_PARAMETER_VALUE(msgKey.getKeyValue("SYS_PARAMETER_VALUE"));
					}
					if(msgKeyType.containsKeyColumn("IN_SYS_PARAMETER_NAME")) {
						key.setIN_SYS_PARAMETER_NAME(msgKey.getKeyValue("IN_SYS_PARAMETER_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PRE_OPR_INST_CD")) {
						key.setPRE_OPR_INST_CD(msgKey.getKeyValue("PRE_OPR_INST_CD"));
					}
					if(msgKeyType.containsKeyColumn("OUTSIDE_TYPE")) {
						key.setOUTSIDE_TYPE(msgKey.getKeyValue("OUTSIDE_TYPE"));
					}
					if(msgKeyType.containsKeyColumn("NEXT_WH_CD")) {
						key.setNEXT_WH_CD(msgKey.getKeyValue("NEXT_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("INST_ISSUE_INST_CD")) {
						key.setINST_ISSUE_INST_CD(msgKey.getKeyValue("INST_ISSUE_INST_CD"));
					}
					if(msgKeyType.containsKeyColumn("INST_PLANT_CD")) {
						key.setINST_PLANT_CD(msgKey.getKeyValue("INST_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("INST_ITEM_CD")) {
						key.setINST_ITEM_CD(msgKey.getKeyValue("INST_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("INST_WORK_ODR_CD")) {
						key.setINST_WORK_ODR_CD(msgKey.getKeyValue("INST_WORK_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("INST_WORK_IN_PROC_CD")) {
						key.setINST_WORK_IN_PROC_CD(msgKey.getKeyValue("INST_WORK_IN_PROC_CD"));
					}
					if(msgKeyType.containsKeyColumn("INST_WH_CD")) {
						key.setINST_WH_CD(msgKey.getKeyValue("INST_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("INST_ISSUE_INST_UNIT_DENOMINATOR")) {
						key.setINST_ISSUE_INST_UNIT_DENOMINATOR(msgKey.getKeyValue("INST_ISSUE_INST_UNIT_DENOMINATOR"));
					}
					if(msgKeyType.containsKeyColumn("INST_ISSUE_INST_UNIT_NUMERATOR")) {
						key.setINST_ISSUE_INST_UNIT_NUMERATOR(msgKey.getKeyValue("INST_ISSUE_INST_UNIT_NUMERATOR"));
					}
					if(msgKeyType.containsKeyColumn("INST_UNIT_QTY_TYP")) {
						key.setINST_UNIT_QTY_TYP(msgKey.getKeyValue("INST_UNIT_QTY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("INST_LOT_CTRL_FLG")) {
						key.setINST_LOT_CTRL_FLG(msgKey.getKeyValue("INST_LOT_CTRL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("INST_OD_NO")) {
						key.setINST_OD_NO(msgKey.getKeyValue("INST_OD_NO"));
					}
					if(msgKeyType.containsKeyColumn("BASE_ITEM_CD")) {
						key.setBASE_ITEM_CD(msgKey.getKeyValue("BASE_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("BASE_PLANT_CD")) {
						key.setBASE_PLANT_CD(msgKey.getKeyValue("BASE_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("BASE_WH_CD")) {
						key.setBASE_WH_CD(msgKey.getKeyValue("BASE_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("BASE_JOB_ODR_CD")) {
						key.setBASE_JOB_ODR_CD(msgKey.getKeyValue("BASE_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("BASE_JOB_ODR_DETAIL_NO")) {
						key.setBASE_JOB_ODR_DETAIL_NO(msgKey.getKeyValue("BASE_JOB_ODR_DETAIL_NO"));
					}
					if(msgKeyType.containsKeyColumn("BASE_PUCH_ODR_CD")) {
						key.setBASE_PUCH_ODR_CD(msgKey.getKeyValue("BASE_PUCH_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("BASE_ACPT_NO")) {
						key.setBASE_ACPT_NO(msgKey.getKeyValue("BASE_ACPT_NO"));
					}
					if(msgKeyType.containsKeyColumn("BASE_ACPT_RSLT_CRCT_NO")) {
						key.setBASE_ACPT_RSLT_CRCT_NO(msgKey.getKeyValue("BASE_ACPT_RSLT_CRCT_NO"));
					}
					if(msgKeyType.containsKeyColumn("BASE_INSPEC_RSLT_CRCT_NO")) {
						key.setBASE_INSPEC_RSLT_CRCT_NO(msgKey.getKeyValue("BASE_INSPEC_RSLT_CRCT_NO"));
					}
					if(msgKeyType.containsKeyColumn("BASE_WORK_ODR_CD")) {
						key.setBASE_WORK_ODR_CD(msgKey.getKeyValue("BASE_WORK_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("BASE_WORK_IN_PROC_CD")) {
						key.setBASE_WORK_IN_PROC_CD(msgKey.getKeyValue("BASE_WORK_IN_PROC_CD"));
					}
					if(msgKeyType.containsKeyColumn("BASE_PARTIAL_PRD_NO")) {
						key.setBASE_PARTIAL_PRD_NO(msgKey.getKeyValue("BASE_PARTIAL_PRD_NO"));
					}
					if(msgKeyType.containsKeyColumn("BASE_OPR_RSLT_CRCT_NO")) {
						key.setBASE_OPR_RSLT_CRCT_NO(msgKey.getKeyValue("BASE_OPR_RSLT_CRCT_NO"));
					}
					if(msgKeyType.containsKeyColumn("BASE_ISSUE_INST_CD")) {
						key.setBASE_ISSUE_INST_CD(msgKey.getKeyValue("BASE_ISSUE_INST_CD"));
					}
					if(msgKeyType.containsKeyColumn("BASE_RCV_ISSUE_BEFORE_QTY")) {
						key.setBASE_RCV_ISSUE_BEFORE_QTY(msgKey.getKeyValue("BASE_RCV_ISSUE_BEFORE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("BASE_RCV_ISSUE_QTY")) {
						key.setBASE_RCV_ISSUE_QTY(msgKey.getKeyValue("BASE_RCV_ISSUE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("BASE_RCV_ISSUE_AFTER_QTY")) {
						key.setBASE_RCV_ISSUE_AFTER_QTY(msgKey.getKeyValue("BASE_RCV_ISSUE_AFTER_QTY"));
					}
					if(msgKeyType.containsKeyColumn("BASE_RCV_ISSUE_ODD_QTY")) {
						key.setBASE_RCV_ISSUE_ODD_QTY(msgKey.getKeyValue("BASE_RCV_ISSUE_ODD_QTY"));
					}
					if(msgKeyType.containsKeyColumn("BASE_OD_NO")) {
						key.setBASE_OD_NO(msgKey.getKeyValue("BASE_OD_NO"));
					}
					if(msgKeyType.containsKeyColumn("BASE_LOT_NO")) {
						key.setBASE_LOT_NO(msgKey.getKeyValue("BASE_LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("BASE_VEND_LOT_NO")) {
						key.setBASE_VEND_LOT_NO(msgKey.getKeyValue("BASE_VEND_LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("BASE_RCV_ISSUE_COMMENT")) {
						key.setBASE_RCV_ISSUE_COMMENT(msgKey.getKeyValue("BASE_RCV_ISSUE_COMMENT"));
					}
					if(msgKeyType.containsKeyColumn("BASE_RCV_ISSUE_CMPLT_FLG")) {
						key.setBASE_RCV_ISSUE_CMPLT_FLG(msgKey.getKeyValue("BASE_RCV_ISSUE_CMPLT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("BASE_COMPANY_CD")) {
						key.setBASE_COMPANY_CD(msgKey.getKeyValue("BASE_COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("BASE_OPR_DATE")) {
						key.setBASE_OPR_DATE(msgKey.getKeyValue("BASE_OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("INST_RCV_ISSUE_TYP")) {
						key.setINST_RCV_ISSUE_TYP(msgKey.getKeyValue("INST_RCV_ISSUE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("INST_OPR_INST_CD")) {
						key.setINST_OPR_INST_CD(msgKey.getKeyValue("INST_OPR_INST_CD"));
					}
					if(msgKeyType.containsKeyColumn("INST_PARTIAL_PRD_NO")) {
						key.setINST_PARTIAL_PRD_NO(msgKey.getKeyValue("INST_PARTIAL_PRD_NO"));
					}
					if(msgKeyType.containsKeyColumn("INST_RCV_ISSUE_GNR_TYP")) {
						key.setINST_RCV_ISSUE_GNR_TYP(msgKey.getKeyValue("INST_RCV_ISSUE_GNR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("T_OPR_RSLT_WH_CD")) {
						key.setT_OPR_RSLT_WH_CD(msgKey.getKeyValue("T_OPR_RSLT_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("BEFORE_WH_CD")) {
						key.setBEFORE_WH_CD(msgKey.getKeyValue("BEFORE_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("ACPT_RSLT_CRCT_NO")) {
						key.setACPT_RSLT_CRCT_NO(msgKey.getKeyValue("ACPT_RSLT_CRCT_NO"));
					}
					if(msgKeyType.containsKeyColumn("INSPEC_RSLT_CRCT_NO")) {
						key.setINSPEC_RSLT_CRCT_NO(msgKey.getKeyValue("INSPEC_RSLT_CRCT_NO"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_BEFORE_QTY")) {
						key.setRCV_ISSUE_BEFORE_QTY(msgKey.getKeyValue("RCV_ISSUE_BEFORE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_AMOUNT")) {
						key.setRCV_ISSUE_AMOUNT(msgKey.getKeyValue("RCV_ISSUE_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("SUM_QTY")) {
						key.setSUM_QTY(msgKey.getKeyValue("SUM_QTY"));
					}
					if(msgKeyType.containsKeyColumn("FROM_PUCH_ODR_CD")) {
						key.setFROM_PUCH_ODR_CD(msgKey.getKeyValue("FROM_PUCH_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("FROM_ITEM_CD")) {
						key.setFROM_ITEM_CD(msgKey.getKeyValue("FROM_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("FROM_LOT_NO")) {
						key.setFROM_LOT_NO(msgKey.getKeyValue("FROM_LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("TO_PUCH_ODR_CD")) {
						key.setTO_PUCH_ODR_CD(msgKey.getKeyValue("TO_PUCH_ODR_CD"));
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
