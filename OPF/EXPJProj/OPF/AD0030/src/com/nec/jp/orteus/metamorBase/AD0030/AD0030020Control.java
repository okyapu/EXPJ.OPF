/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AD0030/src/com/nec/jp/orteus/metamorBase/AD0030/AD0030020Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AD0030;

import com.nec.jp.orteus.metamorBase.AD0030.*;
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
import java.text.DateFormat;
import java.text.ParseException;

import com.nec.jp.orteus.expj.flash.Kind;

import com.nec.jp.orteus.metamorBase.common.CollectNumber.CollectNumber;
import com.nec.jp.orteus.metamorBase.common04.amount.CurStruct;
import com.nec.jp.orteus.metamorBase.common04.amount.CurControl;
import com.nec.jp.orteus.metamorBase.common04.amount.TaxStruct;
import com.nec.jp.orteus.metamorBase.common04.amount.TaxControl;
import com.nec.jp.orteus.metamorBase.common04.amount.ExchRateStruct;
import com.nec.jp.orteus.metamorBase.common04.amount.ExchRateControl;
import com.nec.jp.orteus.metamorBase.common04.amount.AmountCalculator;
import com.nec.jp.orteus.metamorBase.common04.amount.SbcntUnitCostStruct;
import com.nec.jp.orteus.metamorBase.common04.amount.SbcntUnitCostControl;
import com.nec.jp.orteus.metamorBase.common04.sysdata.HomeCurStruct;
import com.nec.jp.orteus.metamorBase.common04.sysdata.HomeCurControl;
import com.nec.jp.orteus.metamorBase.common04.sysdata.TaxNameControl;
import com.nec.jp.orteus.metamorBase.common04.sysdata.TaxNameStruct;
import com.nec.jp.orteus.metamorBase.common04.util.DataNotFoundException;

import com.nec.jp.orteus.expj.util.*;
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AD0030020Control
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
	public AD0030020Struct getListvalue(int x) { return (AD0030020Struct)(this.list.get(x)); }	// リストの値を返します。
	public AD0030020Struct getStruct() { return this.struct; }	// Structを返します。
	public AD0030020Struct createStruct() { return new AD0030020Struct(); }	// 新しいStructを作って返します。
	public void setStruct(Object structname) { this.struct.setStruct((AD0030020Struct)structname); }	// Structをセットします。
	public void initializeStruct() { this.struct.initialize(); }	// Structの値を初期化します。

	// CSV出力用リスト
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }

//--------------------------------------------------------------------

	// 単価読み込みの際の値のセット用
	/** 行追加ボタンが押下された事を表す定数 */
	public static final int FUNC_INS = 0;	
	/** 行修正ボタンが押下された事を表す定数 */
	public static final int FUNC_UPD = 1;
	/** 行複写ボタンが押下された事を表す定数 */
	public static final int FUNC_CPY = 2;


	/** [コンボボックスデータ]情報（内外作区分） */
	private ComboStruct _outsideTypStruct = new ComboStruct();
	/** [コンボボックスデータ]情報（単価区分） */
	private ComboStruct _unitCostTypStruct = new ComboStruct();
	/** [コンボボックスデータ]情報（受入検査区分） */
	private ComboStruct _acptInspcTypStruct = new ComboStruct();

	/** システムログメッセージ作成用 */
	private StringBuffer _sysLogMessage = null;

	/** 一覧表の最大表示件数オーバー時のＥＲＲ表示フラグ */
	private int _screenMoveFlg = 0;	

	/** 邦貨情報データクラス */
	private HomeCurStruct _sysHomeCurStruct = new HomeCurStruct();
	/** 税名情報データクラス */
	private TaxNameStruct _taxNameStruct = new TaxNameStruct();

	/** 会社コード */
	private String _myCompanyCd = "";


	/** 初系列 */
	private int _firstProcNo ;
	/** 初系列（更新後） */
	private int _firstProcNo_new ;
	/** 最終系列 */
	private int _lastProcNo ;
	/** 最終系列（更新後） */
	private int _lastProcNo_new ;

	/** 更新後初系列の仕掛作業コードを設定 */
	private String _firstWorkInProcCd_new = "" ;
	/** 更新後最終系列の仕掛作業コードを設定 */
	private String _lastWorkInProcCd_new = "" ;
	/** 更新後着手日を設定 */
	private String _firstStartDate_new = "" ;
	/** 更新後着手日(時刻)を設定 */
	private String _firstStartDateTime_new = "" ;
	/** 更新後最終系列の納期を設定 */
	private String _lastDlvDate_new = "" ;	
	/** 更新後最終系列の納期(時刻)を設定 */
	private String _lastDlvDateTime_new = "" ;
	/** 更新後最終系列の作業指示数を設定 */
	private String _lastOprInstQty_new = "";

	/** 登録前時点初系列の仕掛作業コードを設定 */
	private String _firstWorkInProcCd = "" ;
	/** 更新前最終系列の仕掛作業コードを設定 */
	private String _lastWorkInProcCd = "" ;
	/** 更新前最終系列の納期を設定 */
	private String _lastDlvDate = "" ;
	/** 更新前最終系列の納期(時刻)を設定 */
	private String _lastDlvDateTime = "" ;

	/** 更新前の内外作区分セーブ用 */
	private String _outsideTypBefore = "";

	/** サブ画面の入力項目退避用Struct */
	private AD0030020Struct formStruct = new AD0030020Struct();	

	/**
	 * 品目別仕掛の更新を行ったか否かを判断するステータスを保持する。<br>
	 * ※単独工程で着手日と納期が同時に変更された場合、<br>
	 * ２度更新される為更新数等システム項目の更新を制御する。<br>
	 * 0:品目別仕掛未更新 1:品目別仕掛更新済み<br>
	 */
	private int _procByItemUpdateStatus = 0;
	/**
	 * 削除時、作業系列別仕掛がすべて削除された場合のステータスを保持する。<br>
	 * ※品目別仕掛.作業展開済みフラグをＯＦＦにするため、該当データが無い状態となる。<br>
	 * 0:削除時のメッセージ無し 1:削除時のメッセージ有り
	 */
	private int _deleteMessageStatus = 0;

	/** 現在どの処理を行ったのかを保持する */
	private int screenStatus = -1;
	/** 
	 * 現在どの処理を行ったのかを取得する
	 * @return 処理モードを表す定数
	 */
	public int getScreenStatus() {
		return this.screenStatus;
	}

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
	public void setStandardItem(AD0030020Struct target){

		target.setsUser_ID(struct.getsUser_ID());
		target.setsSysdate(struct.getsSysdate());
		target.setsOraganization_CD(struct.getsOrganization_CD());
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
	 * リストのクリア
	 */
	public void clearList() {
		if (this.list != null) {
			this.list.clear();
		}
	}

	/**
	 * Structの値をクリアします。
	 */
	public void clearStruct() {
		
		//key(WORK_ODR_CD)以外の画面項目をクリアする。
		struct.setITEM_CD(null);
		struct.setWORK_ODR_DLV_DATE_BY_ITEM(null);
		struct.setOPR_INST_START_DATE_BY_ITEM(null);
		struct.setPLANT_CD(null);
		struct.setWORK_STS_TYP(null);
		struct.seth_WORK_STS_TYP(null);
		struct.setPROC_EXPLOSION_FLG(null);
		struct.seth_MODIFY_COUNT_BY_ITEM(null);
		struct.setITEM_NAME(null);
		struct.setDRAW_CD(null);
		struct.setSPEC(null);
		struct.setMRP_ODR_TYP(null);
		struct.setJOB_ODR_CD(null);
		struct.seth_JOB_ODR_CD(null);
		struct.seth_JOB_ODR_CANCEL_NO(null);
		struct.setMRP_ODR_TYP_DN(null);
		struct.setITEM_NAME(null);
		struct.seth_UNIT_QTY_TYP(null);
		struct.setSTOCK_UNIT(null);
		struct.seth_ODR_START_DATE(null);
		struct.setWORK_IN_PROC_CD(null);
		struct.setPROC_NAME(null);
		struct.setPROC_NO(null);
		struct.setWORK_ODR_DLV_DATE_BY_PROC(null);
		struct.setOPR_INST_START_DATE_BY_PROC(null);
		struct.setOPR_INST_QTY(null);
		struct.setOUTSIDE_TYP(null);
		struct.setWS_CD(null);
		struct.setWS_NAME(null);
		struct.setVEND_CD(null);
		struct.setVEND_ANAME(null);
		struct.setACPT_INSPC_TYP(null);
		struct.setCUR_CD(null);
		struct.setCUR_NAME(null);
		struct.setUNIT_COST_TYP(null);
		struct.setUNIT_COST(null);
		struct.setVEND_CUR_UNIT(null);
		struct.setPROCESSING_COST(null);
		struct.setMATERIAL_COST(null);
		struct.setOTHER_OVERHEADS(null);
		struct.setPUCH_ODR_AMOUNT(null);
		struct.setDISC_AMOUNT(null);
		struct.setAFTER_DISC_AMOUNT(null);
		struct.setTAX_AMOUNT_1(null);
		struct.setTAX_AMOUNT_2(null);
		struct.setTAX_AMOUNT_3(null);
		struct.setAMOUNT_INCLUDE_TAX(null);
		struct.setPROVISIONAL_HOME_CUR_AMOUNT(null);
		struct.setEXCH_RATE(null);
		struct.setWORK_IN_PROC_COMMENT(null);
		struct.setOPR_INST_CD(null);
		struct.setTAX_NAME_1(null);
		struct.setTAX_NAME_2(null);
		struct.setTAX_NAME_3(null);
		struct.seth_BUSINESS_OPR_DATE(null);
		struct.seth_OD_NO(null);
		struct.setWORK_ODR_DLV_DATE_BY_PROC_TIME(null);
		struct.setOPR_INST_START_DATE_BY_PROC_TIME(null);
		struct.setTIME_CTRL(_flgTimeCtrl);
		struct.setWORK_ODR_DLV_DATE_BY_ITEM_TIME(null);
		struct.setOPR_INST_START_DATE_BY_ITEM_TIME(null);

// ▼▼ 2008/08/28 ADD START -TSUCHIDA▼▼
		struct.seth_MANHOUR_TYP(null);
// ▲▲ 2008/08/28 ADD START -TSUCHIDA▲▲

	}

	/**
	 * サブ画面項目の初期値をセットする
	 */
	public void formInitialize() {

		formStruct.setWORK_IN_PROC_CD(null);
		formStruct.setPROC_NAME(null);
		formStruct.setPROC_NO("0");
		formStruct.setWORK_ODR_DLV_DATE_BY_PROC(null);	
		formStruct.setWORK_ODR_DLV_DATE_BY_PROC_TIME(null);
		formStruct.setOPR_INST_START_DATE_BY_PROC(null);
		formStruct.setOPR_INST_START_DATE_BY_PROC_TIME(null);
		formStruct.seth_WORK_ODR_DLV_DATE_BY_PROC(null);
		formStruct.seth_WORK_ODR_DLV_DATE_BY_PROC_TIME(null);
		formStruct.seth_OPR_INST_START_DATE_BY_PROC(null);
		formStruct.seth_OPR_INST_START_DATE_BY_PROC_TIME(null);
		formStruct.setOPR_INST_QTY("0.0");
		formStruct.seth_OPR_INST_QTY("0.0");
		formStruct.setOUTSIDE_TYP("1");
		formStruct.setWS_CD(null);
		formStruct.setWS_NAME(null);
		formStruct.setVEND_CD(null);
		formStruct.setVEND_ANAME(null);
		formStruct.setACPT_INSPC_TYP("1");
		formStruct.setCUR_CD(null);
		formStruct.setCUR_NAME(null);
		formStruct.setUNIT_COST_TYP("1");
		formStruct.setUNIT_COST("0.00");
		formStruct.setVEND_CUR_UNIT(null);
		formStruct.setPROCESSING_COST("0.00");
		formStruct.setMATERIAL_COST("0.00");
		formStruct.setOTHER_OVERHEADS("0.00");
		formStruct.setPUCH_ODR_AMOUNT("0.00");
		formStruct.setDISC_AMOUNT("0.00");
		formStruct.setAFTER_DISC_AMOUNT("0.00");
		formStruct.setTAX_AMOUNT_1("0.00");
		formStruct.setTAX_AMOUNT_2("0.00");
		formStruct.setTAX_AMOUNT_3("0.00");
		formStruct.setAMOUNT_INCLUDE_TAX("0.00");
		formStruct.setPROVISIONAL_HOME_CUR_AMOUNT("0.00");
		formStruct.setEXCH_RATE("0.00");
		formStruct.setWORK_IN_PROC_COMMENT(null);
		formStruct.setROUND_TYP(Kind.FLOOR);
		formStruct.setHOME_CUR_UNIT(null);
		formStruct.setEXCH_RATE("0.00");
		formStruct.seth_VEND_DECIMAL_FIG("4");
		formStruct.seth_TAX_RATE_1(null);
		formStruct.seth_TAX_RATE_2(null);
		formStruct.seth_TAX_RATE_3(null);
		formStruct.setTIME_CTRL(_flgTimeCtrl);
		//単価読込制御フラグのセット
		formStruct.setSelectUnitCostFlag("false");
	}

	/** 
	 * メイン画面項目のコピー
	 * @param target コピー元のStruct
	 */
	public void copySelectStruct(AD0030020Struct target) {

		struct.setWORK_ODR_CD(target.getWORK_ODR_CD());
		struct.setITEM_CD(target.getITEM_CD());
		struct.setWORK_ODR_DLV_DATE_BY_ITEM(target.getWORK_ODR_DLV_DATE_BY_ITEM());
		struct.setWORK_ODR_DLV_DATE_BY_ITEM_TIME(target.getWORK_ODR_DLV_DATE_BY_ITEM_TIME());
		struct.setOPR_INST_START_DATE_BY_ITEM(target.getOPR_INST_START_DATE_BY_ITEM());
		struct.setOPR_INST_START_DATE_BY_ITEM_TIME(target.getOPR_INST_START_DATE_BY_ITEM_TIME());
		struct.setPLANT_CD(target.getPLANT_CD());
		struct.setWORK_STS_TYP(target.getWORK_STS_TYP());
		struct.seth_WORK_STS_TYP(target.geth_WORK_STS_TYP());
		struct.setPROC_EXPLOSION_FLG(target.getPROC_EXPLOSION_FLG());
		struct.seth_MODIFY_COUNT_BY_ITEM(target.geth_MODIFY_COUNT_BY_ITEM());
		struct.setITEM_NAME(target.getITEM_NAME());
		struct.setDRAW_CD(target.getDRAW_CD());
		struct.setSPEC(target.getSPEC());
		struct.setMRP_ODR_TYP(target.getMRP_ODR_TYP());
		struct.setJOB_ODR_CD(target.getJOB_ODR_CD());
		struct.setMRP_ODR_TYP_DN(target.getMRP_ODR_TYP_DN());
		struct.setTIME_CTRL(_flgTimeCtrl);
// ▼▼ 2008/08/28 ADD START -TSUCHIDA▼▼
		struct.seth_MANHOUR_TYP(target.geth_MANHOUR_TYP());
// ▲▲ 2008/08/28 ADD START -TSUCHIDA▲▲

	}
	/** 
	 * サブ画面項目のコピー
	 * @param target コピー元のStruct
	 */
	public void copyFormStruct(AD0030020Struct target) {
		
		struct.setWORK_ODR_CD(target.getWORK_ODR_CD());
		struct.setITEM_CD(target.getITEM_CD());
		struct.setITEM_NAME(target.getITEM_NAME());
		struct.seth_UNIT_QTY_TYP(target.geth_UNIT_QTY_TYP());
		struct.setSTOCK_UNIT(target.getSTOCK_UNIT());
		struct.seth_ODR_START_DATE(target.geth_ODR_START_DATE());
		struct.setWORK_STS_TYP(target.getWORK_STS_TYP());
		struct.seth_WORK_STS_TYP(target.geth_WORK_STS_TYP());
		struct.setWORK_IN_PROC_CD(target.getWORK_IN_PROC_CD());
		struct.setPROC_NAME(target.getPROC_NAME());
		struct.setPROC_NO(target.getPROC_NO());
		struct.setWORK_ODR_DLV_DATE_BY_PROC(target.getWORK_ODR_DLV_DATE_BY_PROC());
		struct.setWORK_ODR_DLV_DATE_BY_PROC_TIME(target.getWORK_ODR_DLV_DATE_BY_PROC_TIME());
		struct.seth_WORK_ODR_DLV_DATE_BY_PROC(target.geth_WORK_ODR_DLV_DATE_BY_PROC());
		struct.seth_WORK_ODR_DLV_DATE_BY_PROC_TIME(target.geth_WORK_ODR_DLV_DATE_BY_PROC_TIME());
		struct.setOPR_INST_START_DATE_BY_PROC(target.getOPR_INST_START_DATE_BY_PROC());
		struct.setOPR_INST_START_DATE_BY_PROC_TIME(target.getOPR_INST_START_DATE_BY_PROC_TIME());
		struct.seth_OPR_INST_START_DATE_BY_PROC(target.geth_OPR_INST_START_DATE_BY_PROC());
		struct.seth_OPR_INST_START_DATE_BY_PROC_TIME(target.geth_OPR_INST_START_DATE_BY_PROC_TIME());
		struct.setOPR_INST_QTY(target.getOPR_INST_QTY());
		struct.seth_OPR_INST_QTY(target.geth_OPR_INST_QTY());
		struct.seth_JOB_ODR_CD(target.geth_JOB_ODR_CD());
		struct.seth_JOB_ODR_CANCEL_NO(target.geth_JOB_ODR_CANCEL_NO());
		struct.seth_PARENT_OD_NO(target.geth_PARENT_OD_NO());
		struct.setOUTSIDE_TYP(target.getOUTSIDE_TYP());
		struct.setWS_CD(target.getWS_CD());
		struct.setWS_NAME(target.getWS_NAME());
		struct.setVEND_CD(target.getVEND_CD());
		struct.setVEND_ANAME(target.getVEND_ANAME());
		struct.setACPT_INSPC_TYP(target.getACPT_INSPC_TYP());
		struct.setCUR_CD(target.getCUR_CD());
		struct.setCUR_NAME(target.getCUR_NAME());
		struct.setUNIT_COST_TYP(target.getUNIT_COST_TYP());
		struct.setUNIT_COST(target.getUNIT_COST());
		struct.setVEND_CUR_UNIT(target.getVEND_CUR_UNIT());
		struct.setPROCESSING_COST(target.getPROCESSING_COST());
		struct.setMATERIAL_COST(target.getMATERIAL_COST());
		struct.setOTHER_OVERHEADS(target.getOTHER_OVERHEADS());
		struct.setPUCH_ODR_AMOUNT(target.getPUCH_ODR_AMOUNT());
		struct.setDISC_AMOUNT(target.getDISC_AMOUNT());
		struct.setAFTER_DISC_AMOUNT(target.getAFTER_DISC_AMOUNT());
		struct.setTAX_AMOUNT_1(target.getTAX_AMOUNT_1());
		struct.setTAX_AMOUNT_2(target.getTAX_AMOUNT_2());
		struct.setTAX_AMOUNT_3(target.getTAX_AMOUNT_3());
		struct.setAMOUNT_INCLUDE_TAX(target.getAMOUNT_INCLUDE_TAX());
		struct.setPROVISIONAL_HOME_CUR_AMOUNT(target.getPROVISIONAL_HOME_CUR_AMOUNT());
		struct.setEXCH_RATE(target.getEXCH_RATE());
		struct.setWORK_IN_PROC_COMMENT(target.getWORK_IN_PROC_COMMENT());
		struct.setOPR_INST_CD(target.getOPR_INST_CD());
		struct.seth_BUSINESS_OPR_DATE(target.geth_BUSINESS_OPR_DATE());
		struct.seth_OD_NO(target.geth_OD_NO());
		struct.seth_MODIFY_COUNT_BY_ITEM(target.geth_MODIFY_COUNT_BY_ITEM());
		struct.seth_MODIFY_COUNT_BY_PROC(target.geth_MODIFY_COUNT_BY_PROC());
		struct.seth_MODIFY_COUNT_OPR_INST(target.geth_MODIFY_COUNT_OPR_INST());
		struct.setROUND_TYP(target.getROUND_TYP());
		struct.setEXCH_TYP(target.getEXCH_TYP());
		struct.seth_VEND_DECIMAL_FIG(target.geth_VEND_DECIMAL_FIG());
		struct.seth_TAX_RATE_1(target.geth_TAX_RATE_1());
		struct.seth_TAX_RATE_2(target.geth_TAX_RATE_2());
		struct.seth_TAX_RATE_3(target.geth_TAX_RATE_3());
		struct.setHOME_CUR_UNIT(target.getHOME_CUR_UNIT());
		struct.setTIME_CTRL(_flgTimeCtrl);
		//単価読込制御用フラグ
		struct.setSelectUnitCostFlag(target.getSelectUnitCostFlag());

// ▼▼ 2008/08/28 ADD START -TSUCHIDA▼▼
		struct.seth_MANHOUR_TYP(target.geth_MANHOUR_TYP());
// ▲▲ 2008/08/28 ADD START -TSUCHIDA▲▲

	}
	/**
	 * 単価項目のコピー
	 * @param target コピー元のStruct
	 */
	public void copyUnitCostStruct(AD0030020Struct target) {
	
		struct.setAFTER_DISC_AMOUNT(target.getAFTER_DISC_AMOUNT());
		struct.setAMOUNT_INCLUDE_TAX(target.getAMOUNT_INCLUDE_TAX());
		struct.setCUR_CD(target.getCUR_CD());
		struct.setCUR_NAME(target.getCUR_NAME());
		struct.setDISC_AMOUNT(target.getDISC_AMOUNT());
		struct.setEXCH_RATE(target.getEXCH_RATE());
		struct.seth_TAX_RATE_1(target.geth_TAX_RATE_1());
		struct.seth_TAX_RATE_2(target.geth_TAX_RATE_2());
		struct.seth_TAX_RATE_3(target.geth_TAX_RATE_3());
		struct.seth_VEND_DECIMAL_FIG(target.geth_VEND_DECIMAL_FIG());
		struct.setHOME_CUR_UNIT(target.getHOME_CUR_UNIT());
		struct.setMATERIAL_COST(target.getMATERIAL_COST());
		struct.setOTHER_OVERHEADS(target.getOTHER_OVERHEADS());
		struct.setPLANT_CD(target.getPLANT_CD());
		struct.setPROCESSING_COST(target.getPROCESSING_COST());
		struct.setPROVISIONAL_HOME_CUR_AMOUNT(target.getPROVISIONAL_HOME_CUR_AMOUNT());
		struct.setPUCH_ODR_AMOUNT(target.getPUCH_ODR_AMOUNT());
		struct.setROUND_TYP(target.getROUND_TYP());
		struct.setTAX_AMOUNT_1(target.getTAX_AMOUNT_1());
		struct.setTAX_AMOUNT_2(target.getTAX_AMOUNT_2());
		struct.setTAX_AMOUNT_3(target.getTAX_AMOUNT_3());
		struct.setUNIT_COST(target.getUNIT_COST());
		struct.setUNIT_COST_TYP(target.getUNIT_COST_TYP());
		struct.setVEND_ANAME(target.getVEND_ANAME());
		struct.setVEND_CUR_UNIT(target.getVEND_CUR_UNIT());
		//単価読込制御用フラグ
		struct.setSelectUnitCostFlag(target.getSelectUnitCostFlag());
	}
	
	/*
	 * 登録・更新項目のコピー
	 * @param toStruct コピー先のStruct
	 * @param fromStruct コピー元のStruct
	 */
	public void copyUpdateStruct(AD0030020Struct toStruct, AD0030020Struct fromStruct) {

		toStruct.setPROC_NAME(fromStruct.getPROC_NAME());
		toStruct.setPROC_NO(fromStruct.getPROC_NO());
		toStruct.setWORK_ODR_DLV_DATE_BY_PROC(fromStruct.getWORK_ODR_DLV_DATE_BY_PROC());
		toStruct.setWORK_ODR_DLV_DATE_BY_PROC_TIME(fromStruct.getWORK_ODR_DLV_DATE_BY_PROC_TIME());
		toStruct.setOPR_INST_START_DATE_BY_PROC(fromStruct.getOPR_INST_START_DATE_BY_PROC());
		toStruct.setOPR_INST_START_DATE_BY_PROC_TIME(fromStruct.getOPR_INST_START_DATE_BY_PROC_TIME());
		toStruct.setOPR_INST_QTY(fromStruct.getOPR_INST_QTY());
		toStruct.setOUTSIDE_TYP(fromStruct.getOUTSIDE_TYP());
		toStruct.setWS_CD(fromStruct.getWS_CD());
		toStruct.setVEND_CD(fromStruct.getVEND_CD());
		toStruct.setACPT_INSPC_TYP(fromStruct.getACPT_INSPC_TYP());
		toStruct.setUNIT_COST_TYP(fromStruct.getUNIT_COST_TYP());
		toStruct.setUNIT_COST(fromStruct.getUNIT_COST());
		toStruct.setPROCESSING_COST(fromStruct.getPROCESSING_COST());
		toStruct.setMATERIAL_COST(fromStruct.getMATERIAL_COST());
		toStruct.setOTHER_OVERHEADS(fromStruct.getOTHER_OVERHEADS());
		toStruct.setPUCH_ODR_AMOUNT(fromStruct.getPUCH_ODR_AMOUNT());
		toStruct.setDISC_AMOUNT(fromStruct.getDISC_AMOUNT());
		toStruct.setOPR_INST_CD(fromStruct.getOPR_INST_CD());
		toStruct.setWORK_IN_PROC_COMMENT(fromStruct.getWORK_IN_PROC_COMMENT());
		toStruct.seth_COMPANY_CD(fromStruct.geth_COMPANY_CD());
		toStruct.setFINAL_PROC_FLG(fromStruct.getFINAL_PROC_FLG());
		toStruct.setWORK_ODR_CD(fromStruct.getWORK_ODR_CD());
		toStruct.setWORK_IN_PROC_CD(fromStruct.getWORK_IN_PROC_CD());
		toStruct.setOPR_INST_CD(fromStruct.getOPR_INST_CD());

		toStruct.seth_OD_NO(fromStruct.geth_OD_NO());
		toStruct.setITEM_CD(fromStruct.getITEM_CD());
		toStruct.seth_WORK_STS_TYP(fromStruct.geth_WORK_STS_TYP());
		toStruct.setPLANT_CD(fromStruct.getPLANT_CD());

	}
	
	/*
	 * 発注金額の設定
	 * @exception ExpjException, FoundationException
	 */
	public void setPuchOdrAmount() 
			throws ExpjException, FoundationException {


		try {			
			String taxRate1 = null;
			String taxRate2 = null;
			String taxRate3 = null;
			String taxRoundTyp = null;
			
			// [邦貨]情報を部品より取得
			this._sysHomeCurStruct = HomeCurControl.getData(this.conn);
			formStruct.setHOME_CUR_UNIT(this._sysHomeCurStruct.getCUR_UNIT());
			
			//会社コードの取得
			List companyList = entity.mSelect_SYS_MY_COMPANY.read(conn, formStruct);
			if (companyList.isEmpty()) { 
				setErrorMessage("ZZ06001");
				setWarningSysLogMessage("SYS_MY_COMPANY.CTRL_CD", "SYSTEM");
				return;
			}
			AD0030020Struct companyStruct = new AD0030020Struct();
			companyStruct = (AD0030020Struct)companyList.get(0);
			setStandardItem(companyStruct);
			_myCompanyCd = companyStruct.getCOMPANY_CD();
			this.struct.seth_COMPANY_CD(_myCompanyCd);
			
			// 通貨単位
			//this.struct.setVEND_CUR_UNIT(listStruct.getVEND_CUR_UNIT());

			//取引先コード存在チェック
			if (formStruct.getVEND_CD() == null || "".equals(formStruct.getVEND_CD())) {

				// 項目クリア
				formStruct.setVEND_ANAME(null);
				formStruct.setUNIT_COST_TYP("0.00");
				formStruct.setUNIT_COST("0.00");
				formStruct.setPROCESSING_COST("0.00");
				formStruct.setMATERIAL_COST("0.00");
				formStruct.setOTHER_OVERHEADS("0.00");
				formStruct.setPUCH_ODR_AMOUNT("0.00");
				formStruct.setDISC_AMOUNT("0.00");
				formStruct.setAFTER_DISC_AMOUNT("0.00");
				formStruct.setPROVISIONAL_HOME_CUR_AMOUNT("0.00");
				formStruct.setROUND_TYP(Kind.FLOOR);
				formStruct.setCUR_CD(null);
				formStruct.setCUR_NAME(null);
				formStruct.setVEND_CUR_UNIT(null);
				formStruct.seth_VEND_DECIMAL_FIG("4");
				formStruct.setEXCH_RATE("0.00");
				formStruct.seth_TAX_RATE_1("0.00");
				formStruct.seth_TAX_RATE_2("0.00");
				formStruct.seth_TAX_RATE_3("0.00");
				formStruct.setTAX_AMOUNT_1("0.00");
				formStruct.setTAX_AMOUNT_2("0.00");
				formStruct.setTAX_AMOUNT_3("0.00");
			
			} else {
				try {
					// 通貨情報を取得
					CurStruct cs =
						CurControl.getData(
							this.conn,
							_myCompanyCd,
							formStruct.getVEND_CD());
			
					formStruct.setROUND_TYP(cs.getROUND_TYP());
					formStruct.seth_VEND_DECIMAL_FIG(cs.getDECIMAL_FIG());
					formStruct.setVEND_CUR_UNIT(cs.getCUR_UNIT());
					formStruct.setCUR_CD(cs.getCUR_CD());
					formStruct.setCUR_NAME(cs.getCUR_NAME());
			
				} catch (DataNotFoundException e) {
					setErrorMessage("ZZ01101");
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD", 
							this.struct.getWORK_ODR_CD());//作業計画番号
					return;
				}
			
				try {
					// 消費税情報を取得
					TaxStruct ts =
						TaxControl.getData(
							this.conn,
							_myCompanyCd,
							formStruct.getVEND_CD(),
							formStruct.getITEM_CD(),
							formStruct.getWORK_ODR_DLV_DATE_BY_PROC());
			
					//税端数区分:[取引先]．"金額まるめ区分
					taxRoundTyp = ts.getTAX_ROUND_TYP();
			
					// TAX_CDの下1桁が1以外の場合は税率を0とする。
					String lowerTaxCd =
						ts.getTAX_CD().substring(ts.getTAX_CD().length() - 1);
					if (lowerTaxCd.equals("1")) {
						taxRate1 = ts.getTAX_RATE_1();
						taxRate2 = ts.getTAX_RATE_2();
						taxRate3 = ts.getTAX_RATE_3();
					} else {
						taxRate1 = "0.00";
						taxRate2 = "0.00";
						taxRate3 = "0.00";
					}
				} catch (DataNotFoundException e) {
					taxRoundTyp = "1";
					taxRate1 = "0.00";
					taxRate2 = "0.00";
					taxRate3 = "0.00";
				}
			
				if (!("2".equals(formStruct.getEXCH_TYP())) 
						&& !(formStruct.getCUR_CD() == null 
						|| "".equals(formStruct.getCUR_CD()))){
					try{
						// 為替レート情報を取得
						ExchRateStruct ers =
							ExchRateControl.getData(
								this.conn,
								_myCompanyCd,
								formStruct.getCUR_CD(),
								formStruct.getEXCH_TYP(),
								null,
								formStruct.getWORK_ODR_DLV_DATE_BY_PROC());
			
						formStruct.setEXCH_RATE(ers.getEXCH_RATE());
			
					} catch (DataNotFoundException e) {
						// 為替レート
						formStruct.setEXCH_RATE("0.00");
						// 邦貨金額
						formStruct.setPROVISIONAL_HOME_CUR_AMOUNT("0.00");
					}
				} else {
					// 為替レート
					formStruct.setEXCH_RATE("0.00");
					// 邦貨金額
					formStruct.setPROVISIONAL_HOME_CUR_AMOUNT("0.00");
				}
				
				formStruct.seth_TAX_RATE_1(taxRate1); // 税率1
				formStruct.seth_TAX_RATE_2(taxRate2); // 税率2
				formStruct.seth_TAX_RATE_3(taxRate3); // 税率3
				
				// 値引き後金額
				String afterDiscAmount =
						AmountCalculator.calcNetAmount(
							formStruct.getPUCH_ODR_AMOUNT(),
							formStruct.getDISC_AMOUNT());
				formStruct.setAFTER_DISC_AMOUNT(afterDiscAmount);
				
				//税額1
				String taxAmount1 =
						AmountCalculator.calcTaxAmount(
							formStruct.getAFTER_DISC_AMOUNT(),
							taxRate1,
							taxRoundTyp,
							formStruct.geth_VEND_DECIMAL_FIG());
				formStruct.setTAX_AMOUNT_1(taxAmount1);
				
				//税額2
				String taxAmount2 =
						AmountCalculator.calcTaxAmount(
							formStruct.getAFTER_DISC_AMOUNT(),
							taxRate2,
							taxRoundTyp,
							formStruct.geth_VEND_DECIMAL_FIG());
				formStruct.setTAX_AMOUNT_2(taxAmount2);
				
				//税額3
				String taxAmount3 =
						AmountCalculator.calcTaxAmount(
							formStruct.getAFTER_DISC_AMOUNT(),
							taxRate3,
							taxRoundTyp,
							formStruct.geth_VEND_DECIMAL_FIG());
				formStruct.setTAX_AMOUNT_3(taxAmount3);
				
				//税込金額
				String amountIncludeTax =
						AmountCalculator.calcAmountIncludeTax(
							formStruct.getAFTER_DISC_AMOUNT(),
							formStruct.getTAX_AMOUNT_1(),
							formStruct.getTAX_AMOUNT_2(),
							formStruct.getTAX_AMOUNT_3());
				formStruct.setAMOUNT_INCLUDE_TAX(amountIncludeTax);
				
				//為替種別が２の場合
				if ("2".equals(formStruct.getEXCH_TYP())) {
			
					// 為替レート
					formStruct.setEXCH_RATE("0.00");
					// 邦貨金額
					formStruct.setPROVISIONAL_HOME_CUR_AMOUNT("0.00");
			
				} else {
					
					// 邦貨金額の計算
					String homeCurAmount =
							AmountCalculator.calcHomeCurAmount(
								formStruct.getAMOUNT_INCLUDE_TAX(),
								formStruct.getEXCH_RATE(),
								formStruct.getROUND_TYP(),
								this._sysHomeCurStruct.getDECIMAL_FIG());
					formStruct.setPROVISIONAL_HOME_CUR_AMOUNT(homeCurAmount);
				}
			}

		} catch (SQLException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;
		} catch (DataNotFoundException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;
		}

	}
        /** コンボボックスデータ取得用定数　展開済みフラグ */
        private final static String OUTSIDE_TYP_PARAMETER_NAME= "OUTSIDE_TYP"; 
       
        /** コンボボックスデータ取得用　展開済みフラグ */
        private ComboStruct OUTSIDE_TYP = null;
        
        private void othercomboTyp(AD0030020Struct aStruct) {
        	
		 aStruct.setOUTSIDE_TYP_DN(getDisplayName(OUTSIDE_TYP, aStruct.getOUTSIDE_TYP().toString()));
	  
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

	/** 時刻管理用フラグ */
	private String _flgTimeCtrl = null;

        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * 読込ボタン押下時に実行される処理です。
	 *
	 */
	public void controlSelect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0030");
		logger.entering("AD0030020Control"+":USER="+struct.getsUser_ID(),"controlSelect");
			//{{user_implement_dev:<controlSelect>


		try {
			clearStruct();
			clearList();
			
			//作業計画番号が品目別仕掛に存在しない場合エラー
			List workOdrCdList = entity.mCheck_WORK_ODR_CD_BY_ITEM.read(conn, struct);
			if (workOdrCdList.isEmpty()) {
				if (_deleteMessageStatus == 0){
					setErrorMessage("ZZ06001");
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WORK_ODR_CD", struct.getWORK_ODR_CD());
				} else {
					_deleteMessageStatus = 0;
				}
				setReadStatus(NOT_FOUND);
				setScreenMoveFlg(1);
				return;
			}

			//品目別仕掛レコードを取得
			List selectHeaderList = entity.mSelectHeader.read(conn, struct);
			if (selectHeaderList.isEmpty()) {
				if (_deleteMessageStatus == 0){
					setErrorMessage("ZZ06001");
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//作業計画番号
				} else {
					_deleteMessageStatus = 0;
				}
				setReadStatus(NOT_FOUND);
				setScreenMoveFlg(1);
				return;
			}
			AD0030020Struct selectHeaderStruct = new AD0030020Struct();
			selectHeaderStruct = (AD0030020Struct)selectHeaderList.get(0);
			selectHeaderStruct.setMRP_ODR_TYP_DN(multcombo("MRP_ODR_TYP",selectHeaderStruct.getMRP_ODR_TYP()));
			
			//日付と時刻をわける
			DateTimeFormat dtf = new DateTimeFormat(conn);
			selectHeaderStruct.setWORK_ODR_DLV_DATE_BY_ITEM(dtf.getDatePart(selectHeaderStruct.getWORK_ODR_DLV_DATE_BY_ITEM_ALL()));
			selectHeaderStruct.setWORK_ODR_DLV_DATE_BY_ITEM_TIME(dtf.getCoronTimePart(selectHeaderStruct.getWORK_ODR_DLV_DATE_BY_ITEM_ALL()));
			selectHeaderStruct.setOPR_INST_START_DATE_BY_ITEM(dtf.getDatePart(selectHeaderStruct.getOPR_INST_START_DATE_BY_ITEM_ALL()));
			selectHeaderStruct.setOPR_INST_START_DATE_BY_ITEM_TIME(dtf.getCoronTimePart(selectHeaderStruct.getOPR_INST_START_DATE_BY_ITEM_ALL()));
			
			setStandardItem(selectHeaderStruct);



			//ログインユーザの工場コードと品目別仕掛の工場コードが一致しない場合エラー
			if (!getsysPLANT_CD().equals(selectHeaderStruct.getPLANT_CD())) { 
				setErrorMessage("AD00006");
				setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//作業計画番号
				setScreenMoveFlg(1);
				setReadStatus(ERROR);
				return;
			}

			//品目別作業状態区分が１（未指示）以外の場合エラー
			if (!("1".equals(selectHeaderStruct.geth_WORK_STS_TYP()) 
					|| "2".equals(selectHeaderStruct.geth_WORK_STS_TYP()))) {
				setErrorMessage("ZZ06001");
				setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//作業計画番号
				setScreenMoveFlg(1);
				setReadStatus(ERROR);
				return;
			}

			//作業系列展開済みフラグが０（未展開）の場合エラー
			if ("0".equals(selectHeaderStruct.getPROC_EXPLOSION_FLG())) {
				if (_deleteMessageStatus == 0){
					setErrorMessage("ZZ06001");
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//作業計画番号
				} else {
					_deleteMessageStatus = 0;
				}
				setScreenMoveFlg(1);
				setReadStatus(ERROR);
				return;
			}

            //最大表示行数
            int maxLine = sp.getMaxLine(conn, 10);
			if(maxLine != 0) {
				struct.setROW_COUNT(String.valueOf(maxLine));
			} else {
				struct.setROW_COUNT(null);
			}
			list = entity.mSelectGridCnt.read(conn, struct);
			long rowCount = Long.parseLong(((AD0030020Struct)list.get(0)).getl_COUNT()); 

		    if (maxLine != 0 && rowCount == maxLine + 1 && rowCount!= 0) {
				setErrorMessage("ZZ01115", String.valueOf(maxLine));
				setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//作業計画番号
				setScreenMoveFlg(1);
				setReadStatus(TOO_MANY);
				if(list != null && list.size() > 0){
					clearList();
			    }
				return;
			}
			list = entity.mSelectGrid.read(conn, struct);
			AD0030020Struct TempStruct;
	             for (int i = 0; i < list.size(); i++) {
			     TempStruct = (AD0030020Struct)list.get(i);
	
			     //コンボボックスの取得
			     othercomboTyp(TempStruct);
			    }

			//画面項目に値をセット
			copySelectStruct(selectHeaderStruct);
			
			setReadStatus(NORMAL);

		} catch (SQLException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;
		}


                //}}user_implement_dev:<controlSelect>
		logger.exiting("AD0030020Control"+":USER="+struct.getsUser_ID(),"controlSelect");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0030");
		logger.entering("AD0030020Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>


		// 初期化
		struct.clear();
		// リストクリア
		clearList();
		
		setReadStatus(INITIAL);


                //}}user_implement_dev:<controlClear>
		logger.exiting("AD0030020Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * 戻るボタン押下時に実行される処理です。
	 *
	 */
	public void controlReturn() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0030");
		logger.entering("AD0030020Control"+":USER="+struct.getsUser_ID(),"controlReturn");
			//{{user_implement_dev:<controlReturn>


		//キー値の確保
		String workOdrCd = struct.getWORK_ODR_CD();

		// 初期化
		struct.clear();
		// リストクリア
		clearList();
		
		//キー値のセット
		struct.setWORK_ODR_CD(workOdrCd);
		//親画面に戻ったらＤＢ再検索を行う。
		controlSelect();


                //}}user_implement_dev:<controlReturn>
		logger.exiting("AD0030020Control"+":USER="+struct.getsUser_ID(),"controlReturn");

		return;
	}

	/**
	 * 行追加ボタン押下時に実行される処理です。
	 *
	 */
	public void controlLineInsert() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0030");
		logger.entering("AD0030020Control"+":USER="+struct.getsUser_ID(),"controlLineInsert");
			//{{user_implement_dev:<controlLineInsert>


		try {
			//時刻管理パラメータ取得
			List listTimeCtrl = entity.mTIME_CTRL.read(conn,struct);
			if(listTimeCtrl == null || listTimeCtrl.size() <=0){
				struct.setTIME_CTRL("false");
				_flgTimeCtrl = "false";
			}else{
				struct.setTIME_CTRL(((AD0030020Struct)listTimeCtrl.get(0)).getTIME_CTRL());
				_flgTimeCtrl = struct.getTIME_CTRL();
			}
			
			//表示項目とクライアントチェック項目の取得
			List formList = entity.mFormSub1Insert.read(conn, struct);
			if (formList.isEmpty()) {
				setErrorMessage("ZZ06001");
				setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//作業計画番号
				return;
			}
			formStruct = new AD0030020Struct();
			formStruct = (AD0030020Struct) formList.get(0);
			//日付と時刻をわける
			DateTimeFormat dtf = new DateTimeFormat(conn);
			formStruct.seth_ODR_START_DATE(dtf.getDatePart(formStruct.geth_ODR_START_DATE_ALL()));
			formStruct.seth_ODR_START_DATE_TIME(dtf.getTimePart(formStruct.geth_ODR_START_DATE_ALL()));
			setStandardItem(formStruct);
			
			// 初期値をセットする
			formInitialize();
			//変更前の内外作区分のセーブ
			_outsideTypBefore = "1";

			// 作業指示番号を採番する
			CollectNumber OPR_INST_CD = 
					new CollectNumber(CollectNumber.INST_CD, 
						getsysUSER_CD(), 
						this.sp.getProcId(),
						getsysPLANT_CD());
			
			formStruct.setOPR_INST_CD(OPR_INST_CD.getNo());
			
			// 業務運用日のセット
			this.struct.setPLANT_CD(getsysPLANT_CD());
			List oprDateList = entity.mSelect_BUSINESS_OPR_DATE.read(conn, struct);
			if (oprDateList.isEmpty()) {
				setErrorMessage("ZZ06001");
				setWarningSysLogMessage("SYS_DATE_CTRL.PLANT_CD", getsysPLANT_CD());
				return;
			}
			AD0030020Struct oprDateStruct = new AD0030020Struct();
			oprDateStruct = (AD0030020Struct)oprDateList.get(0);
			setStandardItem(oprDateStruct);
			formStruct.seth_BUSINESS_OPR_DATE(oprDateStruct.geth_BUSINESS_OPR_DATE());
			
			
			// 処理が成功したらモードをセットするように変更
			//どのイベントが呼ばれたのかをセット
			this.screenStatus = AD0030020Control.FUNC_INS;


			formStruct.seth_WORK_ODR_DLV_DATE_BY_PROC(formStruct.getWORK_ODR_DLV_DATE_BY_PROC());
			formStruct.seth_WORK_ODR_DLV_DATE_BY_PROC_TIME(formStruct.getWORK_ODR_DLV_DATE_BY_PROC_TIME());
			formStruct.seth_OPR_INST_START_DATE_BY_PROC(formStruct.getOPR_INST_START_DATE_BY_PROC());
			formStruct.seth_OPR_INST_START_DATE_BY_PROC_TIME(formStruct.getOPR_INST_START_DATE_BY_PROC_TIME());
			formStruct.seth_OPR_INST_QTY(formStruct.getOPR_INST_QTY());	
			//画面項目に値をセット
			copyFormStruct(formStruct);
			
			setReadStatus(NORMAL);

		} catch (SQLException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;
		}

                //}}user_implement_dev:<controlLineInsert>
		logger.exiting("AD0030020Control"+":USER="+struct.getsUser_ID(),"controlLineInsert");

		return;
	}

	/**
	 * 行修正ボタン押下時に実行される処理です。
	 *
	 */
	public void controlLineUpdate() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0030");
		logger.entering("AD0030020Control"+":USER="+struct.getsUser_ID(),"controlLineUpdate");
			//{{user_implement_dev:<controlLineUpdate>


		try {
			//時刻管理パラメータ取得
			List listTimeCtrl = entity.mTIME_CTRL.read(conn,struct);
			if(listTimeCtrl == null || listTimeCtrl.size() <=0){
				struct.setTIME_CTRL("false");
				_flgTimeCtrl = "false";
			}else{
				struct.setTIME_CTRL(((AD0030020Struct)listTimeCtrl.get(0)).getTIME_CTRL());
				_flgTimeCtrl = struct.getTIME_CTRL();
			}
			
			formStruct = new AD0030020Struct();
			// 初期値をセットする
			formInitialize();
			
			//表示項目とクライアントチェック項目の取得
			List formList = entity.mFormSub1Update.read(conn, struct);
			if (formList.isEmpty()) {
				setErrorMessage("ZZ06001");
				setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//作業計画番号
				return;
			}
			formStruct = (AD0030020Struct) formList.get(0);
			setStandardItem(formStruct);
			formStruct.setSelectUnitCostFlag("false");			
			
			//日付と時刻をわける
			DateTimeFormat dtf = new DateTimeFormat(conn);
			formStruct.setWORK_ODR_DLV_DATE_BY_PROC(dtf.getDatePart(formStruct.getWORK_ODR_DLV_DATE_BY_PROC_ALL()));
			formStruct.setWORK_ODR_DLV_DATE_BY_PROC_TIME(dtf.getTimePart(formStruct.getWORK_ODR_DLV_DATE_BY_PROC_ALL()));
			formStruct.setOPR_INST_START_DATE_BY_PROC(dtf.getDatePart(formStruct.getOPR_INST_START_DATE_BY_PROC_ALL()));
			formStruct.setOPR_INST_START_DATE_BY_PROC_TIME(dtf.getTimePart(formStruct.getOPR_INST_START_DATE_BY_PROC_ALL()));
			formStruct.seth_ODR_START_DATE(dtf.getDatePart(formStruct.geth_ODR_START_DATE_ALL()));
			formStruct.seth_ODR_START_DATE_TIME(dtf.getTimePart(formStruct.geth_ODR_START_DATE_ALL()));
			
			//更新前の作業指示数＆系列別納期＆系列別着手日をセーブ
			formStruct.seth_WORK_ODR_DLV_DATE_BY_PROC(formStruct.getWORK_ODR_DLV_DATE_BY_PROC());
			formStruct.seth_WORK_ODR_DLV_DATE_BY_PROC_TIME(formStruct.getWORK_ODR_DLV_DATE_BY_PROC_TIME());
			formStruct.seth_OPR_INST_START_DATE_BY_PROC(formStruct.getOPR_INST_START_DATE_BY_PROC());
			formStruct.seth_OPR_INST_START_DATE_BY_PROC_TIME(formStruct.getOPR_INST_START_DATE_BY_PROC_TIME());
			formStruct.seth_OPR_INST_QTY(formStruct.getOPR_INST_QTY());
			//変更前の内外作区分のセーブ
			_outsideTypBefore = formStruct.getOUTSIDE_TYP();
			
			//外作の場合は、単価情報のセットを行う
			if ("2".equals(formStruct.getOUTSIDE_TYP())) {
				setPuchOdrAmount();
			} else {
				formStruct.setROUND_TYP(Kind.FLOOR);
				formStruct.seth_VEND_DECIMAL_FIG("4");
				formStruct.seth_VEND_DECIMAL_FIG("4");
				formStruct.setVEND_CUR_UNIT("");
				formStruct.setHOME_CUR_UNIT("");
			}
			
			
			// 業務運用日のセット
			this.struct.setPLANT_CD(getsysPLANT_CD());
			List oprDateList = entity.mSelect_BUSINESS_OPR_DATE.read(conn, struct);
			if (oprDateList.isEmpty()) {
				setErrorMessage("ZZ06001");
				setWarningSysLogMessage("SYS_DATE_CTRL.PLANT_CD", getsysPLANT_CD());
				return;
			}
			AD0030020Struct oprDateStruct = new AD0030020Struct();
			oprDateStruct = (AD0030020Struct)oprDateList.get(0);
			setStandardItem(oprDateStruct);
			formStruct.seth_BUSINESS_OPR_DATE(oprDateStruct.geth_BUSINESS_OPR_DATE());
			
			
			//処理が成功したらモードを設定する
			// どのイベントが呼ばれたのかをセット
			this.screenStatus = AD0030020Control.FUNC_UPD;
			
			//単価読込制御フラグのセット
			if ("2".equals(formStruct.getOUTSIDE_TYP())) {
				formStruct.setSelectUnitCostFlag("true");
			}


			//画面項目に値をセット
			copyFormStruct(formStruct);
			
			setReadStatus(NORMAL);

		} catch (SQLException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;
		}
		

                //}}user_implement_dev:<controlLineUpdate>
		logger.exiting("AD0030020Control"+":USER="+struct.getsUser_ID(),"controlLineUpdate");

		return;
	}

	/**
	 * 行複写ボタン押下時に実行される処理です。
	 *
	 */
	public void controlLineCopy() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0030");
		logger.entering("AD0030020Control"+":USER="+struct.getsUser_ID(),"controlLineCopy");
			//{{user_implement_dev:<controlLineCopy>


		try {
			//時刻管理パラメータ取得
			List listTimeCtrl = entity.mTIME_CTRL.read(conn,struct);
			if(listTimeCtrl == null || listTimeCtrl.size() <=0){
				struct.setTIME_CTRL("false");
				_flgTimeCtrl = "false";
			}else{
				struct.setTIME_CTRL(((AD0030020Struct)listTimeCtrl.get(0)).getTIME_CTRL());
				_flgTimeCtrl = struct.getTIME_CTRL();
			}
			
			formStruct = new AD0030020Struct();
			// 初期値をセットする
			formInitialize();

			//表示項目とクライアントチェック項目の取得
			List formList = entity.mFormSub1Update.read(conn, struct);
			if (formList.isEmpty()) {
				setErrorMessage("ZZ06001");
				setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//作業計画番号
				return;
			}
			formStruct = new AD0030020Struct();
			formStruct = (AD0030020Struct) formList.get(0);
			setStandardItem(formStruct);
			formStruct.setSelectUnitCostFlag("false");			
			
			//日付と時刻をわける
			DateTimeFormat dtf = new DateTimeFormat(conn);
			formStruct.setWORK_ODR_DLV_DATE_BY_PROC(dtf.getDatePart(formStruct.getWORK_ODR_DLV_DATE_BY_PROC_ALL()));
			formStruct.setWORK_ODR_DLV_DATE_BY_PROC_TIME(dtf.getTimePart(formStruct.getWORK_ODR_DLV_DATE_BY_PROC_ALL()));
			formStruct.setOPR_INST_START_DATE_BY_PROC(dtf.getDatePart(formStruct.getOPR_INST_START_DATE_BY_PROC_ALL()));
			formStruct.setOPR_INST_START_DATE_BY_PROC_TIME(dtf.getTimePart(formStruct.getOPR_INST_START_DATE_BY_PROC_ALL()));
			formStruct.seth_ODR_START_DATE(dtf.getDatePart(formStruct.geth_ODR_START_DATE_ALL()));
			formStruct.seth_ODR_START_DATE_TIME(dtf.getTimePart(formStruct.geth_ODR_START_DATE_ALL()));
			
			//更新前の作業指示数＆系列別納期＆系列別着手日をセーブ
			formStruct.seth_WORK_ODR_DLV_DATE_BY_PROC(formStruct.getWORK_ODR_DLV_DATE_BY_PROC());
			formStruct.seth_WORK_ODR_DLV_DATE_BY_PROC_TIME(formStruct.getWORK_ODR_DLV_DATE_BY_PROC_TIME());
			formStruct.seth_OPR_INST_START_DATE_BY_PROC(formStruct.getOPR_INST_START_DATE_BY_PROC());
			formStruct.seth_OPR_INST_START_DATE_BY_PROC_TIME(formStruct.getOPR_INST_START_DATE_BY_PROC_TIME());
			formStruct.seth_OPR_INST_QTY(formStruct.getOPR_INST_QTY());
			//変更前の内外作区分のセーブ
			_outsideTypBefore = formStruct.getOUTSIDE_TYP();
						
			//外作の場合は、単価情報のセットを行う
			if ("2".equals(formStruct.getOUTSIDE_TYP())) {
				setPuchOdrAmount();
			} else {
				formStruct.setROUND_TYP(Kind.FLOOR);
				formStruct.seth_VEND_DECIMAL_FIG("4");
				formStruct.setVEND_CUR_UNIT("");
				formStruct.setHOME_CUR_UNIT("");
			}

			// 作業コードにはNULLを設定
			formStruct.setWORK_IN_PROC_CD(null);
						
			// 作業指示番号を採番する
			CollectNumber OPR_INST_CD = 
					new CollectNumber(CollectNumber.INST_CD, 
						getsysUSER_CD(), 
						this.sp.getProcId(),
						getsysPLANT_CD());
						
			formStruct.setOPR_INST_CD(OPR_INST_CD.getNo());
						
						
			// 業務運用日のセット
			this.struct.setPLANT_CD(getsysPLANT_CD());
			List oprDateList = entity.mSelect_BUSINESS_OPR_DATE.read(conn, struct);
			if (oprDateList.isEmpty()) {
				setErrorMessage("ZZ06001");
				setWarningSysLogMessage("SYS_DATE_CTRL.PLANT_CD", getsysPLANT_CD());
				return;
			}
			AD0030020Struct oprDateStruct = new AD0030020Struct();
			oprDateStruct = (AD0030020Struct)oprDateList.get(0);
			setStandardItem(oprDateStruct);
			formStruct.seth_BUSINESS_OPR_DATE(oprDateStruct.geth_BUSINESS_OPR_DATE());
						
						
			//処理が成功したらモードを設定する
			// どのイベントが呼ばれたのかをセット
			this.screenStatus = AD0030020Control.FUNC_CPY;
										
			//画面項目に値をセット
			copyFormStruct(formStruct);
						
			setReadStatus(NORMAL);

		} catch (SQLException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;
		}


                //}}user_implement_dev:<controlLineCopy>
		logger.exiting("AD0030020Control"+":USER="+struct.getsUser_ID(),"controlLineCopy");

		return;
	}

	/**
	 * 行削除ボタン押下時に実行される処理です。
	 *
	 */
	public void controlLineDelete() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0030");
		logger.entering("AD0030020Control"+":USER="+struct.getsUser_ID(),"controlLineDelete");
			//{{user_implement_dev:<controlLineDelete>


		try {
			AD0030020Struct deleteStruct = new AD0030020Struct();
			setStandardItem(deleteStruct);
			deleteStruct.setWORK_ODR_CD(struct.getWORK_ODR_CD());
			deleteStruct.setWORK_IN_PROC_CD(struct.getWORK_IN_PROC_CD());
			
			//削除前の同一計画番号内の最終系列の系列番号を取得する
			List lastProcList = entity.mSelect_T_WORK_IN_PROC_BY_PROC_LAST.read(conn, struct);
			if (lastProcList.isEmpty()) {
				setErrorMessage("ZZ06001");
				setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//作業計画番号
				return;
			}
			AD0030020Struct lastProcStruct = new AD0030020Struct();
			lastProcStruct = (AD0030020Struct)lastProcList.get(0);
			setStandardItem(lastProcStruct);

			//削除データの系列番号を設定
			int delete_proc_no = Integer.parseInt(struct.getPROC_NO());

			// 削除対象が最終系列の場合のみ以下のチェックを行う
			if (lastProcStruct.getWORK_IN_PROC_CD().equals(struct.getWORK_IN_PROC_CD())) {
								
				//製番品目の場合
				if (!(struct.getJOB_ODR_CD() == null || "".equals(struct.getJOB_ODR_CD()))) {
						
					List parentList = entity.mSelect_PARENT_OD_NO.read(conn, struct);
					if (parentList.isEmpty()) {
						setErrorMessage("ZZ06001");
						setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//作業計画番号
						setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//仕掛作業コード
						return;
					}
					AD0030020Struct parentStruct = new AD0030020Struct();
					parentStruct = (AD0030020Struct)parentList.get(0);
					setStandardItem(parentStruct);
							
					//最上位品目の場合
					if (parentStruct.geth_PARENT_OD_NO() == null) {
						//ワーニング出力
						setWarningMessage("AD00007");
						setInfoSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//作業計画番号
						setInfoSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//仕掛作業コード
					}

					// 中間品目でかつ、作業指示数の値が異なる場合※削除なので常に異なる
					if (parentStruct.geth_PARENT_OD_NO() != null) {
						//ワーニング出力
						setWarningMessage("AD00045");
						setInfoSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//作業計画番号
						setInfoSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//仕掛作業コード
					}

					// 下位部品が存在する場合※最終系列が前提のチェックのため
					// 下位部品が存在すれば無条件にワーニング
					AD0030020Struct childStruct = new AD0030020Struct();
					childStruct.seth_PARENT_OD_NO(struct.geth_OD_NO());
					setStandardItem(childStruct);
					List childList = entity.mSelect_T_OD.read(conn, childStruct);  
					if (childList.size() > 0) {
						setWarningMessage("AD00047");
						setInfoSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//作業計画番号
						setInfoSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//仕掛作業コード
					}
				}
			}


			//系列別仕掛更新数チェック
			List procModifyList = entity.mSelect_CHECK_MODIFY_COUNT.read(conn, struct);
			//更新対象レコードが存在しなかった場合はエラー
			if (procModifyList.isEmpty()) {
				setErrorMessage("ZZ06001");
				setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//作業計画番号
				setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//仕掛作業コード
				return;
			}
			AD0030020Struct procModifyStruct = new AD0030020Struct();
			procModifyStruct = (AD0030020Struct)procModifyList.get(0);
			setStandardItem(procModifyStruct);
			if (struct.geth_MODIFY_COUNT_BY_PROC().equals(
					procModifyStruct.getMODIFY_COUNT_BY_PROC()) == false) {
				setErrorMessage("ZZ01105");
				setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//作業計画番号
				setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//仕掛作業コード
				return;
			}

			//作業系列別仕掛の削除
			entity.mDelete_T_WORK_IN_PROC_BY_PROC.delete(conn, struct);

		
			//内外作区分＝１（内作）の場合、作業指示伝票の削除
			if ("1".equals(struct.getOUTSIDE_TYP())) {
		
				//作業指示伝票更新数を取得する
				List oprInstModifyList = entity.mSelect_T_OPR_INST_SLIP.read(conn, struct);
				//更新対象レコードが存在しなかった場合はエラー
				if (oprInstModifyList.isEmpty()) {
					setErrorMessage("ZZ06001");
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//作業計画番号
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//仕掛作業コード
					return;
				}
				AD0030020Struct oprInstModifyStruct = new AD0030020Struct();
				oprInstModifyStruct = (AD0030020Struct)oprInstModifyList.get(0);
				setStandardItem(oprInstModifyStruct);
		
				//作業指示伝票：他のユーザが更新していないか更新数チェック
				if (struct.geth_MODIFY_COUNT_OPR_INST().equals(
						oprInstModifyStruct.getMODIFY_COUNT_OPR_INST()) == false) {
					setErrorMessage("ZZ01105");
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.OPR_INST_CD", this.struct.getOPR_INST_CD());//作業指示番号
					return;
				}
		
				//作業指示伝票の削除
				entity.mDelete_T_OPR_INST_SLIP.delete(conn, struct);
		
			}
		
			//品目別仕掛の更新数チェック
			List itemModifyList = entity.mSelect_CHECK_MODIFY_COUNT_BY_ITEM.read(conn, struct);
			//更新対象レコードが存在しなかった場合はエラー
			if (itemModifyList.isEmpty()) {
				setErrorMessage("ZZ06001");
				setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//作業計画番号
				setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//仕掛作業コード
				return;
			}
			AD0030020Struct itemModifyStruct = new AD0030020Struct();
			itemModifyStruct = (AD0030020Struct)itemModifyList.get(0);
			setStandardItem(itemModifyStruct);
			if (struct.geth_MODIFY_COUNT_BY_ITEM().equals(
					itemModifyStruct.getMODIFY_COUNT_BY_ITEM()) == false) {
				setErrorMessage("ZZ01105");
				setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//作業計画番号
				return;
			}

			//現時点での作業系列別仕掛の同一作業計画番号のレコード数をチェックし、
			//１件もなければ品目別仕掛の作業系列展開済みフラグをＯＦＦにする
			List countList = entity.mCount_T_WORK_IN_PROC_BY_PROC.read(conn, struct);
			if (countList.isEmpty()) {
				setErrorMessage("ZZ06001");
				setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//作業計画番号
				setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//仕掛作業コード
				return;
			}
			AD0030020Struct countStruct = new AD0030020Struct();
			countStruct = (AD0030020Struct)countList.get(0);
			setStandardItem(countStruct);
			if ("0".equals(countStruct.getWORK_IN_PROC_CD())) {
				deleteStruct.setPROC_EXPLOSION_FLG("0");
				entity.mUpdate_T_WORK_IN_PROC_BY_ITEM_EXP_FLG.update(conn, deleteStruct);
				_deleteMessageStatus = 1;
			} else {
		
				//削除後の同一計画番号内の初系列の系列番号を取得する
				List firstProcList = entity.mSelect_T_WORK_IN_PROC_BY_PROC_FIRST.read(conn, struct);
				if (firstProcList.isEmpty()) { 
					setErrorMessage("ZZ06001");
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//作業計画番号
					return;
				}
				AD0030020Struct firstProcStruct = new AD0030020Struct();
				firstProcStruct = (AD0030020Struct)firstProcList.get(0);
				setStandardItem(firstProcStruct);
				//更新後初系列の仕掛作業コードを設定
				_firstWorkInProcCd_new = firstProcStruct.getWORK_IN_PROC_CD();
				//更新後初系列番号を設定
				_firstProcNo_new = Integer.parseInt(firstProcStruct.getPROC_NO());
				//更新後着手日を設定
				_firstStartDate_new = firstProcStruct.getOPR_INST_START_DATE_BY_PROC();
				//更新後着手日(時刻)を設定
				_firstStartDateTime_new = firstProcStruct.getOPR_INST_START_DATE_BY_PROC_TIME();

		
				//削除後の同一計画番号内の最終系列の系列番号を取得する
				List delLastProcList = entity.mSelect_T_WORK_IN_PROC_BY_PROC_LAST.read(conn, struct);
				if (delLastProcList.isEmpty()) { 
					setErrorMessage("ZZ06001");
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//作業計画番号
					return;
				} else {
					AD0030020Struct delLastProcStruct = new AD0030020Struct();
					delLastProcStruct = (AD0030020Struct)delLastProcList.get(0);
					setStandardItem(delLastProcStruct);
					//更新後最終系列の仕掛作業コードを設定
					_lastWorkInProcCd_new = delLastProcStruct.getWORK_IN_PROC_CD();
					//更新後最終系列の系列番号を設定
					_lastProcNo_new = Integer.parseInt(delLastProcStruct.getPROC_NO());
					//更新後最終系列の納期を設定
					_lastDlvDate_new = delLastProcStruct.getWORK_ODR_DLV_DATE_BY_PROC();
					//更新後最終系列の納期(時刻)を設定
					_lastDlvDateTime_new = delLastProcStruct.getWORK_ODR_DLV_DATE_BY_PROC_TIME();
					//更新後最終系列の作業指示数を設定
					_lastOprInstQty_new = delLastProcStruct.getOPR_INST_QTY();
				}
		
				//削除されたレコードが初系列だった場合
				if ( delete_proc_no < _firstProcNo_new) {
		
					//新たに初系列となった系列別仕掛の着手日で
					//品目別仕掛の更新を行う（初系列：系列別着手日）
					//検索キーである仕掛作業コードを設定
					deleteStruct.setWORK_IN_PROC_CD(_firstWorkInProcCd_new);
					//品目別仕掛の着手日に設定
					deleteStruct.setOPR_INST_START_DATE_BY_ITEM_ALL(_firstStartDate_new+_firstStartDateTime_new);
					entity.mUpdate_T_WORK_IN_PROC_BY_ITEM_START_DATE.update(conn, deleteStruct);
					
					//所要量のオーダ情報＆下位デマンドの更新（共通処理）
					CommonOd od = new CommonOd(conn,
										this.sysPLANT_CD,
										this.sysUSER_CD,
										this.sp.getProcId());
					od.changeOdInfo(struct.geth_OD_NO(), -1);
				}
		
				//削除されたレコードが最終系列だった場合
				if ( delete_proc_no > _lastProcNo_new) {
					
					//新たに最終系列となった系列別仕掛の最終系列フラグをONにする
					deleteStruct.setWORK_IN_PROC_CD(_lastWorkInProcCd_new);
					deleteStruct.setFINAL_PROC_FLG("1");
					entity.mUpdate_T_WORK_IN_PROC_BY_PROC_FINAL_PROC_FLG.update(conn, deleteStruct);
						
					//品目別仕掛の更新（最終系列：系列別納期＆作業指示数）
					//品目別仕掛の納期に設定
					deleteStruct.setWORK_ODR_DLV_DATE_BY_ITEM_ALL(_lastDlvDate_new+_lastDlvDateTime_new); 
					//品目別仕掛の作業指示数に設定
					deleteStruct.setOPR_INST_QTY(_lastOprInstQty_new);
					entity.mUpdate_T_WORK_IN_PROC_BY_ITEM_DLV_DATE.update(conn, deleteStruct);
						
					//所要量のオーダ情報＆下位デマンドの更新（共通処理）
					CommonOd od = new CommonOd(conn,
										this.sysPLANT_CD,
										this.sysUSER_CD,
										this.sp.getProcId());
					od.changeOdInfo(struct.geth_OD_NO(), -1);
				}
			}

			conn.commit();

			//展開フラグをOFFとした際に、ワーニングを表示させない。
			if (_deleteMessageStatus != 0){
				this.msgStruct.clearAll();
			}
			
			//画面の再検索
			controlSelect();

		} catch (NumberFormatException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;			
		} catch (SQLException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;
		} catch (ApsComException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;			
		} finally {
			try {
				if (conn != null) {
					conn.rollback();
				}
			} catch(Exception e) {
				setReadStatus(ERROR);
				ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
				sysLog.severe(emsg, getsysUSER_CD());
				ExpjException ee = new ExpjException(e, emsg);
				throw ee;
			}
		}


                //}}user_implement_dev:<controlLineDelete>
		logger.exiting("AD0030020Control"+":USER="+struct.getsUser_ID(),"controlLineDelete");

		return;
	}

	/**
	 * 単価読込ボタン押下時に実行される処理です。
	 *
	 */
	public void controlSelectUnitCost() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0030");
		logger.entering("AD0030020Control"+":USER="+struct.getsUser_ID(),"controlSelectUnitCost");
			//{{user_implement_dev:<controlSelectUnitCost>


		try {
			AD0030020Struct unitCostStruct = new AD0030020Struct();
			setStandardItem(unitCostStruct);
			//単価読込制御フラグのセット
			unitCostStruct.setSelectUnitCostFlag(struct.getSelectUnitCostFlag());

			unitCostStruct.setTAX_AMOUNT_1("0.00");
			unitCostStruct.setTAX_AMOUNT_2("0.00");
			unitCostStruct.setTAX_AMOUNT_3("0.00");
			unitCostStruct.setAMOUNT_INCLUDE_TAX("0.00");
			unitCostStruct.setEXCH_RATE("0.00");
			unitCostStruct.setPROVISIONAL_HOME_CUR_AMOUNT("0.00");
			unitCostStruct.setCUR_CD(null);
			unitCostStruct.setCUR_NAME(null);
			unitCostStruct.setPLANT_CD(sysPLANT_CD);

			// [邦貨]情報を部品より取得
			this._sysHomeCurStruct = HomeCurControl.getData(this.conn);
			unitCostStruct.setHOME_CUR_UNIT(this._sysHomeCurStruct.getCUR_UNIT());

			//会社コードの取得
			List companyList = entity.mSelect_SYS_MY_COMPANY.read(conn,struct);
			if (companyList.isEmpty()) { 
				setErrorMessage("ZZ06001");
				setWarningSysLogMessage("SYS_MY_COMPANY.CTRL_CD", "SYSTEM");
				return;
			}
			AD0030020Struct companyStruct = new AD0030020Struct();
			companyStruct = (AD0030020Struct)companyList.get(0);
			setStandardItem(companyStruct);
			_myCompanyCd = companyStruct.getCOMPANY_CD();
			this.struct.seth_COMPANY_CD(_myCompanyCd);
			
			// 取引先名称取得
			AD0030020Struct venderStruct = new AD0030020Struct();
			setStandardItem(venderStruct);
			venderStruct.setCOMPANY_CD(_myCompanyCd);
			venderStruct.setVEND_CD(this.struct.getVEND_CD());
				
			//取引先コード存在チェック ※存在しなければエラー
			List vendList = entity.mSelect_M_VEND_CTRL.read(conn, venderStruct);
			if (vendList.size() > 0) {
				unitCostStruct.setVEND_ANAME(((AD0030020Struct)vendList.get(0)).getVEND_ANAME());
			} else {

				unitCostStruct.setROUND_TYP(Kind.FLOOR);
				unitCostStruct.seth_VEND_DECIMAL_FIG(this.struct.geth_VEND_DECIMAL_FIG());
				
				setErrorMessage("AD20030");
				setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//作業計画番号
				setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//仕掛作業コード
				//画面項目へ追記
				copyUnitCostStruct(unitCostStruct);
				return;
			}
				
			try {
				// 外注単価読込部品より外注単価情報を取得
				SbcntUnitCostStruct sucs =
					SbcntUnitCostControl.getData(
						this.conn,
						_myCompanyCd,
						this.struct.getVEND_CD(),
						this.sysPLANT_CD,
						this.struct.getITEM_CD(),
						this.struct.getWORK_IN_PROC_CD(),
						this.struct.getOPR_INST_START_DATE_BY_PROC(),
						this.struct.getWORK_ODR_DLV_DATE_BY_PROC(),
						this.struct.getOPR_INST_QTY(),
						null);
							
				// 取得したデータをstructに設定
				unitCostStruct.setUNIT_COST_TYP(sucs.getUNIT_COST_TYP());
				unitCostStruct.setUNIT_COST(sucs.getUNIT_COST());
				unitCostStruct.setPROCESSING_COST(sucs.getPROCESSING_COST());
				unitCostStruct.setMATERIAL_COST(sucs.getMATERIAL_COST());
				unitCostStruct.setOTHER_OVERHEADS(sucs.getOTHER_OVERHEADS());
				unitCostStruct.setPUCH_ODR_AMOUNT(sucs.getPUCH_ODR_AMOUNT());
				unitCostStruct.setDISC_AMOUNT(sucs.getDISC_AMOUNT());
				unitCostStruct.setAFTER_DISC_AMOUNT(sucs.getAFTER_DISC_AMOUNT());
				unitCostStruct.setPROVISIONAL_HOME_CUR_AMOUNT(
						sucs.getPROVISIONAL_HOME_CUR_AMOUNT());
				unitCostStruct.setROUND_TYP(sucs.getROUND_TYP());
				unitCostStruct.setCUR_CD(sucs.getCUR_CD());
				unitCostStruct.setCUR_NAME(sucs.getCUR_NAME());
				unitCostStruct.setVEND_CUR_UNIT(sucs.getCUR_UNIT());
				unitCostStruct.seth_VEND_DECIMAL_FIG(sucs.getDECIMAL_FIG());
				unitCostStruct.setEXCH_RATE(sucs.getEXCH_RATE());
					
				String taxRate1 = null;    // 税率1
				String taxRate2 = null;    // 税率2
				String taxRate3 = null;    // 税率3
				String taxRoundTyp = null; // 税端数区分
				try {
					// 消費税情報を取得
					TaxStruct ts =
						TaxControl.getData(
							this.conn,
							_myCompanyCd,
							this.struct.getVEND_CD(),
							this.struct.getITEM_CD(),
							this.struct.getWORK_ODR_DLV_DATE_BY_PROC());
						
					// 税端数区分:[取引先]．"金額まるめ区分
					taxRoundTyp = ts.getTAX_ROUND_TYP();
						
					// TAX_CDの下1桁が1以外の場合は税率を0とする。
					String lowerTaxCd =
						ts.getTAX_CD().substring(ts.getTAX_CD().length() - 1);
					if ("1".equals(lowerTaxCd)) {
						taxRate1 = ts.getTAX_RATE_1();
						taxRate2 = ts.getTAX_RATE_2();
						taxRate3 = ts.getTAX_RATE_3();
					} else {
						taxRate1 = "0";
						taxRate2 = "0";
						taxRate3 = "0";
					}
				} catch (DataNotFoundException e) {
					//税端数区分:[取引先]．"金額まるめ区分
					taxRoundTyp = "1";
					taxRate1 = "0";
					taxRate2 = "0";
					taxRate3 = "0";
				}
					
				unitCostStruct.seth_TAX_RATE_1(taxRate1); // 税率1
				unitCostStruct.seth_TAX_RATE_2(taxRate2); // 税率2
				unitCostStruct.seth_TAX_RATE_3(taxRate3); // 税率3
					
				//税額1
				String taxAmount1 =
					AmountCalculator.calcTaxAmount(
						unitCostStruct.getAFTER_DISC_AMOUNT(),
						taxRate1,
						taxRoundTyp,
						unitCostStruct.geth_VEND_DECIMAL_FIG());
				unitCostStruct.setTAX_AMOUNT_1(taxAmount1);
					
				//税額2
				String taxAmount2 =
					AmountCalculator.calcTaxAmount(
						unitCostStruct.getAFTER_DISC_AMOUNT(),
						taxRate2,
						taxRoundTyp,
						unitCostStruct.geth_VEND_DECIMAL_FIG());
				unitCostStruct.setTAX_AMOUNT_2(taxAmount2);
					
				//税額3
				String taxAmount3 =
					AmountCalculator.calcTaxAmount(
						unitCostStruct.getAFTER_DISC_AMOUNT(),
						taxRate3,
						taxRoundTyp,
						unitCostStruct.geth_VEND_DECIMAL_FIG());
				unitCostStruct.setTAX_AMOUNT_3(taxAmount3);
					
				//税込金額
				String amountIncludeTax =
						AmountCalculator.calcAmountIncludeTax(
							unitCostStruct.getAFTER_DISC_AMOUNT(),
							unitCostStruct.getTAX_AMOUNT_1(),
							unitCostStruct.getTAX_AMOUNT_2(),
							unitCostStruct.getTAX_AMOUNT_3());
				unitCostStruct.setAMOUNT_INCLUDE_TAX(amountIncludeTax);
			
				//為替種別が２の場合
				if ("2".equals(sucs.getEXCH_TYP())) {
			
					// 為替レート
					unitCostStruct.setEXCH_RATE("0.00");
						
					// 邦貨金額
					unitCostStruct.setPROVISIONAL_HOME_CUR_AMOUNT("0.00");
			
				} else {
						
					// 邦貨金額の計算
					String homeCurAmount =
							AmountCalculator.calcHomeCurAmount(
								unitCostStruct.getAMOUNT_INCLUDE_TAX(),
								unitCostStruct.getEXCH_RATE(),
								unitCostStruct.getROUND_TYP(),
							this._sysHomeCurStruct.getDECIMAL_FIG());
					unitCostStruct.setPROVISIONAL_HOME_CUR_AMOUNT(homeCurAmount);
						
				}
									
			} catch (DataNotFoundException e) {
				// クリア
				unitCostStruct.setUNIT_COST_TYP("0.00");
				unitCostStruct.setUNIT_COST("0.00");
				unitCostStruct.setPROCESSING_COST("0.00");
				unitCostStruct.setMATERIAL_COST("0.00");
				unitCostStruct.setOTHER_OVERHEADS("0.00");
				unitCostStruct.setPUCH_ODR_AMOUNT("0.00");
				unitCostStruct.setDISC_AMOUNT("0.00");
				unitCostStruct.setAFTER_DISC_AMOUNT("0.00");
				unitCostStruct.setPROVISIONAL_HOME_CUR_AMOUNT("0.00");
				unitCostStruct.setCUR_CD(null);
				unitCostStruct.setCUR_NAME(null);
				unitCostStruct.setVEND_CUR_UNIT(null);
				unitCostStruct.setROUND_TYP(Kind.FLOOR);
				unitCostStruct.seth_VEND_DECIMAL_FIG("4");
				unitCostStruct.setEXCH_RATE("0.00");
				unitCostStruct.seth_TAX_RATE_1("0.00");
				unitCostStruct.seth_TAX_RATE_2("0.00");
				unitCostStruct.seth_TAX_RATE_3("0.00");
				unitCostStruct.setTAX_AMOUNT_1("0.00");
				unitCostStruct.setTAX_AMOUNT_2("0.00");
				unitCostStruct.setTAX_AMOUNT_3("0.00");
				//画面項目へ追記
				copyUnitCostStruct(unitCostStruct);
				return;
			}

			//単価読込制御フラグのセット
			unitCostStruct.setSelectUnitCostFlag("true");
			
			//画面項目へ追記
			copyUnitCostStruct(unitCostStruct);
			
			setReadStatus(NORMAL);

		} catch (SQLException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;
		} catch (DataNotFoundException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;
		}


                //}}user_implement_dev:<controlSelectUnitCost>
		logger.exiting("AD0030020Control"+":USER="+struct.getsUser_ID(),"controlSelectUnitCost");

		return;
	}

	/**
	 * 登録ボタン押下時に実行される処理です。
	 *
	 */
	public void controlInsert() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0030");
		logger.entering("AD0030020Control"+":USER="+struct.getsUser_ID(),"controlInsert");
			//{{user_implement_dev:<controlInsert>
		try {
			setScreenMoveFlg(0);
			
			this.struct.setPLANT_CD(getsysPLANT_CD());
			//品目カレンダ番号の取得
			List CalList = entity.mSelect_M_ITEM.read(conn,struct);
			
			if (CalList.isEmpty()) { 
				//工場カレンダ番号の取得
				CalList = entity.mSelect_M_PLANT.read(conn,struct);
				if (CalList.isEmpty()) {
				setErrorMessage("ZZ06001");
				setWarningSysLogMessage("M_PLANT.PLANT_CD", getsysPLANT_CD());
				return;
				}
			}
			
			AD0030020Struct CalStruct = new AD0030020Struct();
			CalStruct = (AD0030020Struct)CalList.get(0);
			setStandardItem(CalStruct);
			
			//会社コードの取得
			List companyList = entity.mSelect_SYS_MY_COMPANY.read(conn,struct);
			if (companyList.isEmpty()) { 
				setErrorMessage("ZZ06001");
				setWarningSysLogMessage("SYS_MY_COMPANY.CTRL_CD", "SYSTEM");
				return;
			}
			AD0030020Struct companyStruct = new AD0030020Struct();
			companyStruct = (AD0030020Struct)companyList.get(0);
			setStandardItem(companyStruct);
			_myCompanyCd = companyStruct.getCOMPANY_CD();
			this.struct.seth_COMPANY_CD(_myCompanyCd);
			
			
			//系列別納期の休日チェック
			Date checkDate_d = Converter.strToDate(this.struct.getWORK_ODR_DLV_DATE_BY_PROC(),Converter.SLASH_DATE);
			this.struct.setCHECK_DATE(Converter.dateToStr(checkDate_d, Converter.SLASH_DATE));
			this.struct.setCAL_NO(CalStruct.getCAL_NO()) ;
			
			List calList1 = entity.mSelect_M_CAL.read(conn, struct);
			//カレンダ稼働日に存在しない場合エラー
			if (calList1.isEmpty()) {
				setErrorMessage("AD00036");
				setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//作業計画番号
				setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//仕掛作業コード
			}
			
			//系列別着手日の休日チェック
			Date checkDate_s = Converter.strToDate(this.struct.getOPR_INST_START_DATE_BY_PROC(),Converter.SLASH_DATE);
			this.struct.setCHECK_DATE(Converter.dateToStr(checkDate_s, Converter.SLASH_DATE));
			
			List calList2 = entity.mSelect_M_CAL.read(conn, struct);
			//カレンダ稼働日に存在しない場合エラー
			if (calList2.isEmpty()) {
				setErrorMessage("AD00038");
				setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//作業計画番号
				setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//仕掛作業コード
			}
			
			//内外作区分＝１（内作）の場合
			if ("1".equals(this.struct.getOUTSIDE_TYP())) {
				//作業区コード存在チェック
				List wsCdList = entity.mSelect_M_WS.read(conn, struct);
				//存在しない場合エラー
				if (wsCdList.isEmpty()) {
					this.struct.setWS_NAME(null);  //作業区名を画面クリアする
					setErrorMessage("AD20029");
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//作業計画番号
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//仕掛作業コード
					setWarningSysLogMessage("M_WS.WS_CD", this.struct.getWS_CD());//作業区コード
				} else {
					AD0030020Struct wsCdStruct = new AD0030020Struct();
					wsCdStruct = (AD0030020Struct)wsCdList.get(0);
					setStandardItem(wsCdStruct);
					//作業区．工場コード一致チェック ※不一致はエラー
					if (!getsysPLANT_CD().equals(wsCdStruct.getWS_PLANT_CD())) {
						this.struct.setWS_NAME(null);  //作業区名を画面クリアする
						setErrorMessage("AD00004");
						setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//作業計画番号
						setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//仕掛作業コード
						setWarningSysLogMessage("M_WS.WS_CD", this.struct.getWS_CD());//作業区コード
					}
				}
			}
			
			//内外作区分＝２（外作）の場合
			if ("2".equals(this.struct.getOUTSIDE_TYP())) {
				//取引先コード存在チェック ※存在しなければエラー
				this.struct.setCOMPANY_CD(_myCompanyCd);
				List vendList = entity.mSelect_M_VEND_CTRL.read(conn, struct);
				if (vendList.isEmpty()) {
					this.struct.setVEND_ANAME(null);  //取引先名をクリアする
					setErrorMessage("AD20030");
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//作業計画番号
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//仕掛作業コード
				} else {
					//存在していれば発注金額まるめ区分を取得する
					AD0030020Struct vendStruct = new AD0030020Struct();
					vendStruct = (AD0030020Struct)vendList.get(0);
					setStandardItem(vendStruct);
					this.struct.setROUND_TYP(vendStruct.getROUND_TYP());
					this.struct.seth_VEND_DECIMAL_FIG(vendStruct.geth_VEND_DECIMAL_FIG());
				}
			}

			//登録処理のときのみ行う
			if (this.screenStatus == 0 || this.screenStatus == 2) {
				
				//仕掛作業コード重複チェック ※登録なので既に存在していればエラー
				List workInProcCdList = entity.mSelect_CHECK_MODIFY_COUNT.read(conn, struct);
				if (workInProcCdList.size() > 0) {
					setErrorMessage("AD32366");
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//作業計画番号
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//仕掛作業コード
				}
				
				//系列番号重複チェック
				List procNoList = entity.mSelect_CHECK_PROC_NO.read(conn, struct);
				if (procNoList.size() > 0) {
					setErrorMessage("AD00075");
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//作業計画番号
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//仕掛作業コード
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.PROC_NO", this.struct.getPROC_NO());//系列番号
				}
				
				//作業指示番号重複チェック（指示伝票存在チェック）
				//内外作区分＝１（内作）の場合
				if ("1".equals(this.struct.getOUTSIDE_TYP())) {
					
					List oprInstSlipList = entity.mSelect_T_OPR_INST_SLIP.read(conn, struct);
					if (oprInstSlipList.size() > 0) {
						setErrorMessage("AD32303");
						setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//作業計画番号
						setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//仕掛作業コード
						setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.OPR_INST_CD", this.struct.getOPR_INST_CD());//作業指示番号
					}
				}
			}

			//更新処理のときのみ行う
			if (this.screenStatus == 1) {
				//系列番号重複チェック ※仕掛作業コード違いで存在していればエラー
				//（自レコードの更新はＯＫとするため）
				List procNoList = entity.mSelect_CHECK_PROC_NO.read(conn, struct);
				if (procNoList.size() > 0) {
					AD0030020Struct procNoStruct = new AD0030020Struct();
					procNoStruct = (AD0030020Struct)procNoList.get(0);
					setStandardItem(procNoStruct);
					if (!this.struct.getWORK_IN_PROC_CD().equals(procNoStruct.getWORK_IN_PROC_CD())) {
						setErrorMessage("AD00075");
						setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//作業計画番号
						setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//仕掛作業コード
					}
				}
				//他のユーザが更新していないか更新数チェック
				List modifyList = entity.mSelect_CHECK_MODIFY_COUNT.read(conn, struct);
			
				//更新対象レコードが存在しなかった場合はエラー
				if (modifyList.isEmpty()) {
					setErrorMessage("ZZ06001");
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//作業計画番号
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//仕掛作業コード
				} else {
					AD0030020Struct modifyStruct = new AD0030020Struct();
					modifyStruct = (AD0030020Struct)modifyList.get(0);
					setStandardItem(modifyStruct);
			
					if (struct.geth_MODIFY_COUNT_BY_PROC().equals(
							modifyStruct.getMODIFY_COUNT_BY_PROC()) == false) {
						setErrorMessage("ZZ01105");
						setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//作業計画番号
						setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//仕掛作業コード
					}
				}			
			}


			// エラーがあれば終了
			if (msgStruct.hasError()) {
				return;
			}

			//３桁の場合４桁に変更
			if((struct.getWORK_ODR_DLV_DATE_BY_PROC_TIME()).length() == 3){
				struct.setWORK_ODR_DLV_DATE_BY_PROC_TIME("0" + struct.getWORK_ODR_DLV_DATE_BY_PROC_TIME() );
			}
			if((struct.getOPR_INST_START_DATE_BY_PROC_TIME()).length() == 3){
				struct.setOPR_INST_START_DATE_BY_PROC_TIME("0" + struct.getOPR_INST_START_DATE_BY_PROC_TIME() );
			}
			
			//時刻がNULLの場合、TIME_CTRL=trueの場合2359を設定、falseの場合0000を設定
			String WorkOdrDlvDateByProcTime = struct.getWORK_ODR_DLV_DATE_BY_PROC_TIME();
			String OprInstStartDateByProcTime = struct.getOPR_INST_START_DATE_BY_PROC_TIME();
			
			if((WorkOdrDlvDateByProcTime).length() == 0){
				if("true".equals(struct.getTIME_CTRL())){
					WorkOdrDlvDateByProcTime = "2359";
				}else{
					WorkOdrDlvDateByProcTime = "0000";
				}
			}
			if((OprInstStartDateByProcTime).length() == 0){
				if("true".equals(struct.getTIME_CTRL())){
					OprInstStartDateByProcTime = "2359";
				}else{
					OprInstStartDateByProcTime = "0000";
				}
			}
			
			//登録前時点での同一計画番号内の初系列の系列番号を取得する
			List firstProcList = entity.mSelect_T_WORK_IN_PROC_BY_PROC_FIRST.read(conn, struct);
			if (firstProcList.isEmpty()) { 
				setErrorMessage("AD00027");
				setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//作業計画番号
				setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//仕掛作業コード
				return;
			} else {
				AD0030020Struct firstProcStruct = new AD0030020Struct();
				firstProcStruct = (AD0030020Struct)firstProcList.get(0);
				setStandardItem(firstProcStruct);
				//登録前時点初系列の仕掛作業コードを設定
				_firstWorkInProcCd = firstProcStruct.getWORK_IN_PROC_CD();
				//登録前時点初系列番号を設定
				_firstProcNo = Integer.parseInt(firstProcStruct.getPROC_NO());
			}
			
			//登録前時点での同一計画番号内の最終系列の系列番号を取得する
			List lastProcList = entity.mSelect_T_WORK_IN_PROC_BY_PROC_LAST.read(conn, struct);
			if (lastProcList.isEmpty()) { 
				setErrorMessage("AD00027");
				setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//作業計画番号
				setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//仕掛作業コード
				return;
			} else {
				AD0030020Struct lastProcStruct = new AD0030020Struct();
				lastProcStruct = (AD0030020Struct)lastProcList.get(0);
				setStandardItem(lastProcStruct);
				//登録前時点最終系列の仕掛作業コードを設定
				_lastWorkInProcCd = lastProcStruct.getWORK_IN_PROC_CD();
				//登録前時点最終系列の最終系列番号を設定
				_lastProcNo = Integer.parseInt(lastProcStruct.getPROC_NO());
				_lastDlvDate = lastProcStruct.getWORK_ODR_DLV_DATE_BY_PROC(); 
				_lastDlvDateTime = lastProcStruct.getWORK_ODR_DLV_DATE_BY_PROC_TIME(); 
			}
			
			//登録対象の系列番号をセット
			int insert_proc_no = Integer.parseInt(struct.getPROC_NO()); 
			
			//登録対象が初系列になる場合以外は前工程情報を取得する
			if (insert_proc_no > _firstProcNo) {

				List bProcList = entity.mSelect_B_PROC.read(conn, struct);
				if (bProcList.size() > 0) {
					AD0030020Struct bProcStruct = new AD0030020Struct();
					bProcStruct = (AD0030020Struct)bProcList.get(0);
					setStandardItem(bProcStruct);
					//前工程の作業指示数を設定
					BigDecimal b_inst_qty = new BigDecimal(bProcStruct.getOPR_INST_QTY());
					//自工程の作業指示数を設定
					BigDecimal this_inst_qty = new BigDecimal(this.struct.getOPR_INST_QTY());
					DateFormat df = DateFormat.getDateInstance();
					//前工程の納期を設定
					Date b_dlv_date = df.parse(bProcStruct.getWORK_ODR_DLV_DATE_BY_PROC());
					//前工程の着手日を設定
					Date b_start_date = df.parse(bProcStruct.getOPR_INST_START_DATE_BY_PROC());
					//前工程の納期(時刻)を設定
					String b_dlv_date_time = bProcStruct.getWORK_ODR_DLV_DATE_BY_PROC_TIME();
					//前工程の着手日(時刻)を設定
					String b_start_date_time = bProcStruct.getOPR_INST_START_DATE_BY_PROC_TIME();
					//自工程の納期を設定
					Date this_dlv_date = df.parse(this.struct.getWORK_ODR_DLV_DATE_BY_PROC());
					//自工程の着手日を設定
					Date this_start_date = df.parse(this.struct.getOPR_INST_START_DATE_BY_PROC());
					//自工程の納期(時刻)を設定
					String this_dlv_date_time = WorkOdrDlvDateByProcTime;
					//自工程の着手日(時刻)を設定
					String this_start_date_time = OprInstStartDateByProcTime;
					
						
					//自工程の系列別納期＜前工程の系列別納期か？または
					//自工程の系列別着手日＜前工程の系列別着手日か？
					if ((this_dlv_date.compareTo(b_dlv_date) < 0 ) 
							|| (this_start_date.compareTo(b_start_date) < 0)
							|| (this_dlv_date.compareTo(b_dlv_date) == 0 && this_dlv_date_time.compareTo(b_dlv_date_time) < 0) 
							|| (this_start_date.compareTo(b_start_date) == 0 && this_start_date_time.compareTo(b_start_date_time) < 0)	) {
						setErrorMessage("AD32362");
						setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//作業計画番号
						setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//仕掛作業コード
						return;
					}
					//自工程の作業指示数＞前工程の作業指示数か？
					//ワーニング処理
					if (this_inst_qty.compareTo(b_inst_qty) > 0) {
						//ワーニング出力
						setWarningMessage("AD25035");
						setInfoSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//作業計画番号
						setInfoSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//仕掛作業コード
					}
				} else {
					//取得できない場合はエラーとする
					setErrorMessage("AD00027");
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//作業計画番号
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//仕掛作業コード
					return;
				}
			}
			
			//対象が最終系列になる場合以外は後工程情報を取得する
			if (insert_proc_no < _lastProcNo) {

				List aProcList = entity.mSelect_A_PROC.read(conn, struct);
				if (aProcList.size() > 0) {
					AD0030020Struct aProcStruct = new AD0030020Struct();
					aProcStruct = (AD0030020Struct)aProcList.get(0);
					setStandardItem(aProcStruct);
					//後工程の作業指示数を設定
					BigDecimal a_inst_qty = new BigDecimal(aProcStruct.getOPR_INST_QTY());
					DateFormat df = DateFormat.getDateInstance();
					//後工程の納期を設定
					Date a_dlv_date = df.parse(aProcStruct.getWORK_ODR_DLV_DATE_BY_PROC());
					//後工程の着手日を設定
					Date a_start_date = df.parse(aProcStruct.getOPR_INST_START_DATE_BY_PROC());
					//後工程の納期(時刻)を設定
					String a_dlv_date_time = aProcStruct.getWORK_ODR_DLV_DATE_BY_PROC_TIME();
					//後工程の着手日(時刻)を設定
					String a_start_date_time = aProcStruct.getOPR_INST_START_DATE_BY_PROC_TIME();
					//自工程の納期を設定
					Date this_dlv_date = df.parse(this.struct.getWORK_ODR_DLV_DATE_BY_PROC());
					//自工程の着手日を設定
					Date this_start_date = df.parse(this.struct.getOPR_INST_START_DATE_BY_PROC());
					//自工程の納期(時刻)を設定
					String this_dlv_date_time = WorkOdrDlvDateByProcTime;
					//自工程の着手日(時刻)を設定
					String this_start_date_time = OprInstStartDateByProcTime;
					//自工程の作業指示数を設定
					BigDecimal this_inst_qty = new BigDecimal(this.struct.getOPR_INST_QTY());
			
					//自工程の系列別納期＞後工程の系列別納期か？または
					//自工程の系列別着手日＞後工程の系列別着手日か？
					if ((this_dlv_date.compareTo(a_dlv_date) > 0)
							|| (this_start_date.compareTo(a_start_date) > 0)
							|| (this_dlv_date.compareTo(a_dlv_date) == 0 && this_dlv_date_time.compareTo(a_dlv_date_time) > 0)
							|| (this_start_date.compareTo(a_start_date) == 0 && this_start_date_time.compareTo(a_start_date_time) > 0)	) {
						setErrorMessage("AD32362");
						setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//作業計画番号
						setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//仕掛作業コード
						return;
					}
					//自工程の作業指示数＜後工程の作業指示数か？
					//ワーニング処理
					if (this_inst_qty.compareTo(a_inst_qty) < 0) {
						//ワーニング出力
						setWarningMessage("AD25035");
						setInfoSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//作業計画番号
						setInfoSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//仕掛作業コード
					}
				} else {
					//取得できない場合はエラーとする
					setErrorMessage("AD00027");
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//作業計画番号
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//仕掛作業コード
					return;
				}
			}
			
			// 製番品目の場合
			if (!(struct.geth_JOB_ODR_CD() == null || "".equals(struct.geth_JOB_ODR_CD()))) {
					
				// 最上位品目でかつ、作業指示数が変更された場合ワーニング
				if ((struct.geth_PARENT_OD_NO() == null) 
						|| ("".equals(struct.geth_PARENT_OD_NO()))) {
					//更新前の作業指示数を設定
					BigDecimal old_inst_qty = new BigDecimal(this.struct.geth_OPR_INST_QTY());
					//更新後の作業指示数を設定
					BigDecimal this_inst_qty = new BigDecimal(this.struct.getOPR_INST_QTY());
					if  (this_inst_qty.compareTo(old_inst_qty) != 0) {
						//ワーニング出力
						setWarningMessage("AD00007");
						setInfoSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//作業計画番号
						setInfoSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//仕掛作業コード
					}
				}
			
				// 製番計画．製番納期＜最終系列の系列別納期になる場合エラー
				List jobOdrList = entity.mSelect_T_JOB_ODR.read(conn, struct);
				if (jobOdrList.size() > 0) {
					AD0030020Struct jobOdrStruct = new AD0030020Struct();
					jobOdrStruct = (AD0030020Struct)jobOdrList.get(0);
					setStandardItem(jobOdrStruct);
					DateFormat df = DateFormat.getDateInstance();
					//製番納期を設定
					Date job_dlv_date = df.parse(jobOdrStruct.getJOB_ODR_DLV_DATE());
					//製番納期を設定
					String compare_job_dlv_date = jobOdrStruct.getJOB_ODR_DLV_DATE();
					String job_dlv_date_time = jobOdrStruct.getJOB_ODR_DLV_DATE_TIME();
					//自工程の納期を設定
					Date this_dlv_date = df.parse(this.struct.getWORK_ODR_DLV_DATE_BY_PROC());
					String this_dlv_date_time = WorkOdrDlvDateByProcTime;
					Date last_dlv_date_d = df.parse(_lastDlvDate); 
					String last_dlv_date_d_time = _lastDlvDateTime; 

					if (((this.screenStatus == 0 || this.screenStatus == 2) 
							&& (insert_proc_no > _lastProcNo))
							|| (this.screenStatus == 1 
							&& (insert_proc_no >= _lastProcNo))) { //自工程が最終工程となる場合

						if ((job_dlv_date.compareTo(this_dlv_date) < 0 || ((job_dlv_date.compareTo(this_dlv_date)) == 0 && (job_dlv_date_time.compareTo(this_dlv_date_time)) < 0))) {
							if (DateTool.compareYMD(compare_job_dlv_date,this.struct.geth_BUSINESS_OPR_DATE()) >= 0) {
								setErrorMessage("AD32214");
								setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//作業計画番号
								setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//仕掛作業コード
							}else {
								setWarningMessage("AD32218");
								setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//作業計画番号
								setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//仕掛作業コード
							}
						}
					} else {
						if ((job_dlv_date.compareTo(last_dlv_date_d) < 0 || ((job_dlv_date.compareTo(last_dlv_date_d)) == 0 && (job_dlv_date_time.compareTo(last_dlv_date_d_time)) < 0))) {
							if (DateTool.compareYMD(compare_job_dlv_date,this.struct.geth_BUSINESS_OPR_DATE()) >= 0) {
								setErrorMessage("AD32214");
								setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//作業計画番号
								setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//仕掛作業コード
							}else {
								setWarningMessage("AD32218");
								setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//作業計画番号
								setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//仕掛作業コード
							}
						}
					}
					// 先行手配製番の最上位品目の場合で、
					//最終工程の系列別納期＞min所要量.要求納期になる場合ワーニング
					if ("2".equals(jobOdrStruct.getJOB_ODR_TYP())) {
						if ((struct.geth_PARENT_OD_NO() == null) 
								|| ("".equals(struct.geth_PARENT_OD_NO()))) {

							if (((this.screenStatus == 0 || this.screenStatus == 2) 
									&& (insert_proc_no > _lastProcNo))
									|| (this.screenStatus == 1 
									&& (insert_proc_no >= _lastProcNo))) { //自工程が最終工程となる場合
								List minDueDateList = entity.mSelect_MIN_DUE_DATE.read(conn, struct);
								if (minDueDateList.size() > 0) {
									AD0030020Struct minDueDateStruct = new AD0030020Struct();
									minDueDateStruct = (AD0030020Struct)minDueDateList.get(0);
									setStandardItem(minDueDateStruct);
		
									//検索結果が必ず返ってくるので納期がNullの場合は
									//チェックを行わない
									if (minDueDateStruct.getDUE_DATE() != null) {
										//製番納期を設定
										Date min_due_date = df.parse((minDueDateStruct.getDUE_DATE()).substring(0,10));
										String min_due_date_time = (minDueDateStruct.getDUE_DATE()).substring(10,14);
										if ((this_dlv_date.compareTo(min_due_date)) > 0
											|| ((this_dlv_date.compareTo(min_due_date)) == 0 && (this_dlv_date_time.compareTo(min_due_date_time)) > 0 )) {
											//ワーニング出力
											setWarningMessage("AD00044");
											setInfoSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//作業計画番号
											setInfoSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//仕掛作業コード
										}
									} 
								}
							}
						}
					}
				}
				//中間品目の場合
				if (!(struct.geth_PARENT_OD_NO() == null 
						|| "".equals(struct.geth_PARENT_OD_NO()))) {
					//中間品目でかつ、作業指示数の値が異なる場合ワーニング
					//更新前の作業指示数を設定
					BigDecimal old_inst_qty = new BigDecimal(this.struct.geth_OPR_INST_QTY());
					//更新後の作業指示数を設定
					BigDecimal this_inst_qty = new BigDecimal(this.struct.getOPR_INST_QTY());
					if  (this_inst_qty.compareTo(old_inst_qty) != 0) {
						//ワーニング出力
						setWarningMessage("AD00045");
						setInfoSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//作業計画番号
						setInfoSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//仕掛作業コード
					}
			
					// 中間品目でかつ、所要量．要求納期＜最終工程の系列別納期になる場合ワーニング
					List dueDateList = entity.mSelect_DUE_DATE.read(conn, struct);
					if (dueDateList.isEmpty()) { 
						setErrorMessage("AD00027");
						setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//作業計画番号
						setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//仕掛作業コード
					} else {
						AD0030020Struct dueDateStruct = new AD0030020Struct();
						dueDateStruct = (AD0030020Struct)dueDateList.get(0);
						setStandardItem(dueDateStruct);
						//要求納期がNullの場合は以下のチェックを行わない
						if (dueDateStruct.getDUE_DATE() != null) {
							DateFormat df = DateFormat.getDateInstance();
							Date due_date = df.parse(dueDateStruct.getDUE_DATE());  //要求納期
							String due_date_time = dueDateStruct.getDUE_DATE_TIME();  //要求納期(時刻)
							//自工程納期
							Date this_dlv_date = df.parse(this.struct.getWORK_ODR_DLV_DATE_BY_PROC());
							String this_dlv_date_time = WorkOdrDlvDateByProcTime;
							Date last_dlv_date_d = df.parse(_lastDlvDate);
							String last_dlv_date_d_time = _lastDlvDateTime;
							
							//自工程が最終工程となる場合常にワーニング
							if (((this.screenStatus == 0 || this.screenStatus == 2) 
									&& (insert_proc_no > _lastProcNo))
									|| (this.screenStatus == 1 
									&& (insert_proc_no >= _lastProcNo))) {
								if ((due_date.compareTo(this_dlv_date)) < 0 || ((due_date.compareTo(this_dlv_date)) == 0 && (due_date_time.compareTo(this_dlv_date_time)) < 0) ) {
									//ワーニング出力
									setWarningMessage("AD00046");
									setInfoSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//作業計画番号
									setInfoSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//仕掛作業コード
								}
							} else {
								if ((due_date.compareTo(last_dlv_date_d)) < 0 || ((due_date.compareTo(last_dlv_date_d)) == 0 && (due_date_time.compareTo(last_dlv_date_d_time)) < 0) ) {
									//ワーニング出力
									setWarningMessage("AD00046");
									setInfoSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//作業計画番号
									setInfoSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//仕掛作業コード
								}
							}
						} 
					}
			
				}
				// 下位部品が存在する場合で、最終工程の作業指示数、系列別納期が変更された場合
				// または初工程の系列別着手日が変更された場合
				AD0030020Struct childStruct = new AD0030020Struct();
				childStruct.seth_PARENT_OD_NO(struct.geth_OD_NO());
				setStandardItem(childStruct);
				List childList = entity.mSelect_T_OD.read(conn, childStruct);
				if (childList.size() > 0) {
					// ※登録は初工程もしくは最終工程ならば常にワーニング
					if (this.screenStatus == 0 || this.screenStatus == 2) {
						//登録対象が初工程もしくは最終工程か？
						if (( insert_proc_no < _firstProcNo ) 
								|| ( insert_proc_no > _lastProcNo )) {

							//ワーニング出力
							setWarningMessage("AD00047");
							setInfoSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//作業計画番号
							setInfoSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//仕掛作業コード
						}
					} else {
						//更新対象が最終工程か？
						if ( insert_proc_no >= _lastProcNo ) {
							//更新前の作業指示数を設定
							BigDecimal old_inst_qty = new BigDecimal(this.struct.geth_OPR_INST_QTY());
							//更新後の作業指示数を設定
							BigDecimal this_inst_qty = new BigDecimal(this.struct.getOPR_INST_QTY());
							DateFormat df = DateFormat.getDateInstance();
							//更新前納期を設定
							Date old_dlv_date = df.parse(this.struct.geth_WORK_ODR_DLV_DATE_BY_PROC());
							//更新前納期(時刻)を設定
							String old_dlv_date_time = this.struct.geth_WORK_ODR_DLV_DATE_BY_PROC_TIME();

							//更新後納期を設定
							Date this_dlv_date 
									= df.parse(this.struct.getWORK_ODR_DLV_DATE_BY_PROC());
							//更新後納期(時刻)を設定
							String this_dlv_date_time 
									= WorkOdrDlvDateByProcTime;
									
							if  ((this_inst_qty.compareTo(old_inst_qty) != 0)
									||  (( this_dlv_date.compareTo(old_dlv_date)) != 0)
									||  (( this_dlv_date_time.compareTo(old_dlv_date_time)) != 0)) {
								//ワーニング出力
								setWarningMessage("AD00047");
								setInfoSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//作業計画番号
								setInfoSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//仕掛作業コード
							}
						}
						//更新対象が初工程か？
						if ( insert_proc_no <= _firstProcNo ) {
							DateFormat df = DateFormat.getDateInstance();
							//更新前着手日を設定
							Date old_start_date = df.parse(this.struct.geth_OPR_INST_START_DATE_BY_PROC());
							//更新後着手日を設定
							Date this_start_date 
									= df.parse(this.struct.getOPR_INST_START_DATE_BY_PROC());
							//更新前着手日(時刻)を設定
							String old_start_date_time = this.struct.geth_OPR_INST_START_DATE_BY_PROC_TIME();
							//更新後着手日(時刻)を設定
							String this_start_date_time 
									= OprInstStartDateByProcTime;
							if (this_start_date.compareTo(old_start_date) != 0 || this_start_date_time.compareTo(old_start_date_time) != 0) {
								//ワーニング出力
								setWarningMessage("AD00047");
								setInfoSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//作業計画番号
								setInfoSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//仕掛作業コード
			
							}
						}
					}
				}
			}

			// エラーがあれば終了
			if (msgStruct.hasError()) {
				return;
			}

			
			//現時点の最終系列番号を取得して登録データと比較する
			//対象レコードが最終系列になるか？
			if (((this.screenStatus == 0 || this.screenStatus == 2) 
					&& (insert_proc_no > _lastProcNo))
					|| (this.screenStatus == 1 
					&& (insert_proc_no >= _lastProcNo))) {
				//最終系列フラグ:最終系列であれば1
				this.struct.setFINAL_PROC_FLG("1");
			} else {
				//最終系列でない場合
				//最終系列フラグ:最終系列でなければ0
				this.struct.setFINAL_PROC_FLG("0");
			}
			
			
			
			//登録処理
			if (this.screenStatus == 0 || this.screenStatus == 2) {
				
				AD0030020Struct insertStruct = new AD0030020Struct();
				copyUpdateStruct(insertStruct, this.struct);
				setStandardItem(insertStruct);
				
				//内外作区分＝１（内作）の場合
				if ("1".equals(this.struct.getOUTSIDE_TYP())) {
					//外作から内作に変わった場合のみ、作業指示番号を採番して作業指示伝票を追加する
					//作業指示番号がnullの場合、作業指示番号を採番する
					if ((this.struct.getOPR_INST_CD() == null) 
							|| ("".equals(this.struct.getOPR_INST_CD()))) {
						//作業指示番号を採番する
						CollectNumber OPR_INST_CD = 
								new CollectNumber(CollectNumber.INST_CD,
									getsysUSER_CD(), 
									this.sp.getProcId(),
									getsysPLANT_CD());
						insertStruct.setOPR_INST_CD(OPR_INST_CD.getNo());
					} else {
						insertStruct.setOPR_INST_CD(this.struct.getOPR_INST_CD());
					}
			
					//作業指示番号発生区分="2"
					insertStruct.setOPR_INST_CD_GNR_TYP("2");
					insertStruct.setPLANT_CD(getsysPLANT_CD());
			
					//作業指示伝票の追加
					entity.mInsert_T_OPR_INST_SLIP.create(conn, insertStruct);
			
				} else {
			
					//発注金額
					String puchOdrAmount =
						AmountCalculator.calcPuchOdrAmount(
							this.struct.getOPR_INST_QTY(),
							this.struct.getUNIT_COST(),
							this.struct.getROUND_TYP(),
							this.struct.geth_VEND_DECIMAL_FIG());
					insertStruct.setPUCH_ODR_AMOUNT(puchOdrAmount);
			
				}
				
				//作業系列別仕掛の追加に不必要な情報を初期化する
				if ("1".equals(this.struct.getOUTSIDE_TYP())) {
					insertStruct.seth_COMPANY_CD(null);
					insertStruct.setVEND_CD(null);
					insertStruct.setUNIT_COST_TYP("1");
					insertStruct.setUNIT_COST("0");
					insertStruct.setPROCESSING_COST("0");
					insertStruct.setMATERIAL_COST("0");
					insertStruct.setOTHER_OVERHEADS("0");
					insertStruct.setPUCH_ODR_AMOUNT("0");
					insertStruct.setDISC_AMOUNT("0");
					insertStruct.setACPT_INSPC_TYP("1");
				} else {
					insertStruct.setWS_CD(null);
					insertStruct.setOPR_INST_CD(null);
				}
				insertStruct.seth_WORK_STS_TYP("1");
				
				//日付＋時刻
				insertStruct.setWORK_ODR_DLV_DATE_BY_PROC_ALL(insertStruct.getWORK_ODR_DLV_DATE_BY_PROC()+insertStruct.getWORK_ODR_DLV_DATE_BY_PROC_TIME());
				insertStruct.setOPR_INST_START_DATE_BY_PROC_ALL(insertStruct.getOPR_INST_START_DATE_BY_PROC()+insertStruct.getOPR_INST_START_DATE_BY_PROC_TIME());
				
				//作業系列別仕掛の追加
				entity.mInsert_T_WORK_IN_PROC_BY_PROC.create(conn, insertStruct);
			
			
				//品目別仕掛：他のユーザが更新していないか更新数チェック
				List itemModfyList = entity.mSelect_CHECK_MODIFY_COUNT_BY_ITEM.read(conn,struct);
				//更新対象レコードが存在しなかった場合はエラー
				if (itemModfyList.isEmpty()) {
					setErrorMessage("ZZ06001");
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//作業計画番号
					return;
				}
				AD0030020Struct itemModfyStruct = new AD0030020Struct();
				itemModfyStruct = (AD0030020Struct)itemModfyList.get(0);
				setStandardItem(itemModfyStruct);
			
				if (struct.geth_MODIFY_COUNT_BY_ITEM().equals(
						itemModfyStruct.getMODIFY_COUNT_BY_ITEM()) == false) {
					setErrorMessage("ZZ01105");
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//作業計画番号
					return;
				}
			
				//登録対象が初系列の場合
				if (((this.screenStatus == 0 || this.screenStatus == 2) 
						&& (insert_proc_no < _firstProcNo))
						|| (this.screenStatus == 1 
						&& (insert_proc_no <= _firstProcNo))) {

					//品目別仕掛の更新（初系列：系列別着手日）
					//品目別仕掛の着手日に設定
					insertStruct.setOPR_INST_START_DATE_BY_ITEM_ALL(struct.getOPR_INST_START_DATE_BY_PROC()+OprInstStartDateByProcTime);
					insertStruct.setWORK_ODR_CD(struct.getWORK_ODR_CD());
					entity.mUpdate_T_WORK_IN_PROC_BY_ITEM_START_DATE.update(conn, insertStruct);
					
					//所要量のオーダ情報＆下位デマンドの更新（共通処理）
					CommonOd od = new CommonOd(conn,
										this.sysPLANT_CD,
										this.sysUSER_CD,
										this.sp.getProcId());
					od.changeOdInfo(this.struct.geth_OD_NO(), -1);
				}
			
				//登録対象が最終系列の場合※単独工程は初系列かつ最終系列なので常に判断
				if (((this.screenStatus == 0 || this.screenStatus == 2) 
						&& (insert_proc_no > _lastProcNo))
						|| (this.screenStatus == 1 
						&& (insert_proc_no >= _lastProcNo))) {
					
					AD0030020Struct procStruct = new AD0030020Struct();
					setStandardItem(procStruct);
					//登録前まで最終系列だった系列別仕掛の最終系列フラグをOFFにする
					procStruct.setWORK_ODR_CD(this.struct.getWORK_ODR_CD());
					procStruct.setWORK_IN_PROC_CD(_lastWorkInProcCd);
					procStruct.setFINAL_PROC_FLG("0");
					entity.mUpdate_T_WORK_IN_PROC_BY_PROC_FINAL_PROC_FLG.update(conn, procStruct);
						
					//品目別仕掛の更新（最終系列：系列別納期＆作業指示数）
					//品目別仕掛の納期に設定
					procStruct.setWORK_ODR_DLV_DATE_BY_ITEM_ALL(this.struct.getWORK_ODR_DLV_DATE_BY_PROC()+WorkOdrDlvDateByProcTime);
					//品目別仕掛の作業指示数に設定
					procStruct.setOPR_INST_QTY(this.struct.getOPR_INST_QTY());
					entity.mUpdate_T_WORK_IN_PROC_BY_ITEM_DLV_DATE.update(conn, procStruct);
						
					//所要量のオーダ情報＆下位デマンドの更新（共通処理）
					CommonOd od = new CommonOd(conn,
										this.sysPLANT_CD,
										this.sysUSER_CD,
										this.sp.getProcId());
					od.changeOdInfo(this.struct.geth_OD_NO(), -1);
				}
			
			
			//更新処理
			} else {
				AD0030020Struct updateStruct = new AD0030020Struct();
				copyUpdateStruct(updateStruct, this.struct);
				setStandardItem(updateStruct);

				if ("1".equals(this.struct.getOUTSIDE_TYP())) {
					//作業指示番号がnullの場合、作業指示番号を採番する
					if ((this.struct.getOPR_INST_CD() == null) 
							|| ("".equals(this.struct.getOPR_INST_CD()))) {
						//作業指示番号を採番する
						CollectNumber OPR_INST_CD = 
								new CollectNumber(CollectNumber.INST_CD, 
									getsysUSER_CD(), 
									this.sp.getProcId(),
									getsysPLANT_CD());
						updateStruct.setOPR_INST_CD(OPR_INST_CD.getNo());
						//作業指示番号発生区分="2"
						updateStruct.setOPR_INST_CD_GNR_TYP("2");
						updateStruct.setPLANT_CD(getsysPLANT_CD());
						//作業指示伝票の登録
						entity.mInsert_T_OPR_INST_SLIP.create(conn, updateStruct);
					} else {
						updateStruct.setOPR_INST_CD(this.struct.getOPR_INST_CD());
					}
					//作業系列別仕掛の更新
					updateStruct.seth_COMPANY_CD(null);
					updateStruct.setVEND_CD(null);
					updateStruct.setUNIT_COST_TYP("1");
					updateStruct.setUNIT_COST("0");
					updateStruct.setPROCESSING_COST("0");
					updateStruct.setMATERIAL_COST("0");
					updateStruct.setOTHER_OVERHEADS("0");
					updateStruct.setPUCH_ODR_AMOUNT("0");
					updateStruct.setDISC_AMOUNT("0");
					updateStruct.setACPT_INSPC_TYP("1");
					
					updateStruct.setWORK_ODR_DLV_DATE_BY_PROC_ALL(updateStruct.getWORK_ODR_DLV_DATE_BY_PROC()+updateStruct.getWORK_ODR_DLV_DATE_BY_PROC_TIME());
					updateStruct.setOPR_INST_START_DATE_BY_PROC_ALL(updateStruct.getOPR_INST_START_DATE_BY_PROC()+updateStruct.getOPR_INST_START_DATE_BY_PROC_TIME());
					
					entity.mUpdate_T_WORK_IN_PROC_BY_PROC.update(conn, updateStruct);
			
				} else {
			
					//発注金額
					String puchOdrAmount =
						AmountCalculator.calcPuchOdrAmount(
							this.struct.getOPR_INST_QTY(),
							this.struct.getUNIT_COST(),
							this.struct.getROUND_TYP(),
							this.struct.geth_VEND_DECIMAL_FIG());
					updateStruct.setPUCH_ODR_AMOUNT(puchOdrAmount);

					//作業系列別仕掛の更新
					updateStruct.setWS_CD(null);
					updateStruct.setOPR_INST_CD(null);

					updateStruct.setWORK_ODR_DLV_DATE_BY_PROC_ALL(updateStruct.getWORK_ODR_DLV_DATE_BY_PROC()+updateStruct.getWORK_ODR_DLV_DATE_BY_PROC_TIME());
					updateStruct.setOPR_INST_START_DATE_BY_PROC_ALL(updateStruct.getOPR_INST_START_DATE_BY_PROC()+updateStruct.getOPR_INST_START_DATE_BY_PROC_TIME());
					
					entity.mUpdate_T_WORK_IN_PROC_BY_PROC.update(conn, updateStruct);
			
					//内作から外作に変わった場合のみ、作業指示伝票を削除する
					if ("1".equals(_outsideTypBefore)) {
			
						//作業指示伝票：他のユーザが更新していないか更新数チェック
						List instSlipModifyList = entity.mSelect_T_OPR_INST_SLIP_FOR_UPDATE.read(conn, this.struct);
			
						//更新対象レコードが存在しなかった場合はエラー
						if (instSlipModifyList.isEmpty()) {
							setErrorMessage("ZZ06001");
							setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.OPR_INST_CD", this.struct.getOPR_INST_CD());//作業指示番号
							return;
						}
						AD0030020Struct instSlipModifyStruct = new AD0030020Struct();
						instSlipModifyStruct = (AD0030020Struct)instSlipModifyList.get(0);
						setStandardItem(instSlipModifyStruct);
						if (struct.geth_MODIFY_COUNT_OPR_INST().equals(
								instSlipModifyStruct.getMODIFY_COUNT_OPR_INST()) == false) {
							setErrorMessage("ZZ01105");
							setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.OPR_INST_CD", this.struct.getOPR_INST_CD());//作業指示番号
							return;
						}
			
						//作業指示伝票の削除
						entity.mDelete_T_OPR_INST_SLIP.delete(conn, this.struct);
					}
			
				}
			
				//品目別仕掛：他のユーザが更新していないか更新数チェック
				List itemModfyList = entity.mSelect_CHECK_MODIFY_COUNT_BY_ITEM.read(conn, struct);
			
				//更新対象レコードが存在しなかった場合はエラー
				if (itemModfyList.isEmpty()) {
					setErrorMessage("ZZ06001");
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//作業計画番号
					return;
				}
				AD0030020Struct itemModfyStruct = new AD0030020Struct();
				itemModfyStruct = (AD0030020Struct)itemModfyList.get(0);
				setStandardItem(itemModfyStruct);
				if (struct.geth_MODIFY_COUNT_BY_ITEM().equals(
						itemModfyStruct.getMODIFY_COUNT_BY_ITEM()) == false) {
					setErrorMessage("ZZ01105");
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//作業計画番号
					return;
				}
			
				//更新対象が初系列の場合
				if ( insert_proc_no <= _firstProcNo) {
			
					//品目別仕掛の更新（初系列：系列別着手日）
					//品目別仕掛の着手日に設定
					updateStruct.setOPR_INST_START_DATE_BY_ITEM_ALL(struct.getOPR_INST_START_DATE_BY_PROC()+OprInstStartDateByProcTime);
					updateStruct.setWORK_ODR_CD(struct.getWORK_ODR_CD());
					entity.mUpdate_T_WORK_IN_PROC_BY_ITEM_START_DATE.update(conn, updateStruct);
					_procByItemUpdateStatus = 1;    //品目別仕掛更新済みフラグON
			
					//所要量のオーダ情報＆下位デマンドの更新（共通処理）
					CommonOd od = new CommonOd(conn,
										this.sysPLANT_CD,
										this.sysUSER_CD,
										this.sp.getProcId());
					od.changeOdInfo(this.struct.geth_OD_NO(), -1);
						
				} else {
						
					//更新後の初系列を取得
					firstProcList = entity.mSelect_T_WORK_IN_PROC_BY_PROC_FIRST.read(conn, struct);
					if (firstProcList.isEmpty()) {
						setErrorMessage("AD00027");
						setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//作業計画番号
						setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//仕掛作業コード
						return;
					} else {
						AD0030020Struct firstProcStruct = new AD0030020Struct();
						firstProcStruct = (AD0030020Struct)firstProcList.get(0);
						setStandardItem(firstProcStruct);
						//更新後初系列の仕掛作業コードを設定
						_firstWorkInProcCd_new = firstProcStruct.getWORK_IN_PROC_CD();
						//更新後初系列番号を設定
						_firstProcNo_new = Integer.parseInt(firstProcStruct.getPROC_NO());
						//更新後着手日を設定
						_firstStartDate_new = firstProcStruct.getOPR_INST_START_DATE_BY_PROC();
						//更新後着手日(時刻)を設定
						_firstStartDateTime_new = firstProcStruct.getOPR_INST_START_DATE_BY_PROC_TIME();
					}
			
					//初系列が変わった場合
					if (_firstProcNo_new != _firstProcNo ) {
						
						//初系列の着手日を品目別仕掛の着手日に反映
						//品目別仕掛の着手日に設定
						updateStruct.setOPR_INST_START_DATE_BY_ITEM_ALL(_firstStartDate_new+_firstStartDateTime_new);
						updateStruct.setWORK_ODR_CD(struct.getWORK_ODR_CD());
						entity.mUpdate_T_WORK_IN_PROC_BY_ITEM_START_DATE.update(conn, updateStruct);
						_procByItemUpdateStatus = 1;    //品目別仕掛更新済みフラグON
					}
						
				}
			
				//更新対象が最終系列の場合※単独工程は初系列かつ最終系列なので常に判断 
				if ( insert_proc_no >= _lastProcNo) {
			
					//更新前の最終系列と更新後の最終系列が変わった場合
					//更新後の同一計画番号内の最終系列の系列番号を取得する
					lastProcList = entity.mSelect_T_WORK_IN_PROC_BY_PROC_LAST.read(conn, struct);
					if (lastProcList.isEmpty()) {
						setErrorMessage("AD00027");
						setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//作業計画番号
						setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//仕掛作業コード
						return;
					} else {
						AD0030020Struct lastProcStruct = new AD0030020Struct();
						lastProcStruct = (AD0030020Struct)lastProcList.get(0);
						setStandardItem(lastProcStruct);
						//更新後最終系列の仕掛作業コードを設定
						_lastWorkInProcCd_new = lastProcStruct.getWORK_IN_PROC_CD();
						//更新後最終系列の最終系列番号を設定
						_lastProcNo_new = Integer.parseInt(lastProcStruct.getPROC_NO());
						//更新後最終系列の納期を設定
						_lastDlvDate_new = lastProcStruct.getWORK_ODR_DLV_DATE_BY_PROC();
						//更新後最終系列の納期(時刻)を設定
						_lastDlvDateTime_new = lastProcStruct.getWORK_ODR_DLV_DATE_BY_PROC_TIME();
						//更新後最終系列の作業指示数を設定
						_lastOprInstQty_new = lastProcStruct.getOPR_INST_QTY();
					}
					//最終系列が変わった場合
					if (!_lastWorkInProcCd_new.equals(_lastWorkInProcCd)) {  //条件式修正
						//更新前まで最終系列だった系列別仕掛の最終系列フラグをOFFにする
						updateStruct.setWORK_ODR_CD(this.struct.getWORK_ODR_CD());
						updateStruct.setWORK_IN_PROC_CD(_lastWorkInProcCd);
						updateStruct.setFINAL_PROC_FLG("0");
						entity.mUpdate_T_WORK_IN_PROC_BY_PROC_FINAL_PROC_FLG.update(conn, updateStruct);
					}
					//品目別仕掛の更新（最終系列：系列別納期＆作業指示数）
					//品目別仕掛の納期に設定
					updateStruct.setWORK_ODR_DLV_DATE_BY_ITEM_ALL(this.struct.getWORK_ODR_DLV_DATE_BY_PROC()+WorkOdrDlvDateByProcTime);
					//品目別仕掛の作業指示数に設定
					updateStruct.setOPR_INST_QTY(struct.getOPR_INST_QTY());
					updateStruct.setWORK_ODR_CD(this.struct.getWORK_ODR_CD());
					//品目別仕掛が未更新であれば通常のUpdate Sqlを呼び出す
					if ( _procByItemUpdateStatus == 0 ) {        
						entity.mUpdate_T_WORK_IN_PROC_BY_ITEM_DLV_DATE.update(conn, updateStruct);
					} else {
						entity.mUpdate_T_WORK_IN_PROC_BY_ITEM_DLV_DATE2.update(conn, updateStruct);
					}
					//所要量のオーダ情報＆下位デマンドの更新（共通処理）
					CommonOd od = new CommonOd(conn,
										this.sysPLANT_CD,
										this.sysUSER_CD,
										this.sp.getProcId());
					od.changeOdInfo(this.struct.geth_OD_NO(), -1);
			
				} else {
			
					//更新後の同一計画番号内の最終系列の系列番号を取得する
					lastProcList = entity.mSelect_T_WORK_IN_PROC_BY_PROC_LAST.read(conn, struct);
					if (lastProcList.isEmpty()) {
						setErrorMessage("AD00027");
						setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//作業計画番号
						setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//仕掛作業コード
						return;
					} else {
						AD0030020Struct lastProcStruct = new AD0030020Struct();
						lastProcStruct = (AD0030020Struct)lastProcList.get(0);
						setStandardItem(lastProcStruct);
						//更新後最終系列の仕掛作業コードを設定
						_lastWorkInProcCd_new = lastProcStruct.getWORK_IN_PROC_CD();
						//更新後最終系列の最終系列番号を設定
						_lastProcNo_new = Integer.parseInt(lastProcStruct.getPROC_NO());
						//更新後最終系列の納期を設定
						_lastDlvDate_new = lastProcStruct.getWORK_ODR_DLV_DATE_BY_PROC();
						//更新後最終系列の納期(時刻)を設定
						_lastDlvDateTime_new = lastProcStruct.getWORK_ODR_DLV_DATE_BY_PROC_TIME();
						//更新後最終系列の作業指示数を設定
						_lastOprInstQty_new = lastProcStruct.getOPR_INST_QTY();
					}
			
					//最終系列が変わった場合
					if ((!_lastWorkInProcCd_new.equals(_lastWorkInProcCd)) || (_lastProcNo_new !=_lastProcNo)) {
						//更新後最終系列の系列別仕掛最終系列フラグをONにする
						updateStruct.setWORK_ODR_CD(this.struct.getWORK_ODR_CD());
						updateStruct.setWORK_IN_PROC_CD(_lastWorkInProcCd_new);
						updateStruct.setFINAL_PROC_FLG("1");
						entity.mUpdate_T_WORK_IN_PROC_BY_PROC_FINAL_PROC_FLG.update(conn, updateStruct);
			
						//最終系列の納期を品目別仕掛の納期＆作業指示数に反映
						//品目別仕掛の納期に設定
						updateStruct.setWORK_ODR_DLV_DATE_BY_ITEM_ALL(_lastDlvDate_new+_lastDlvDateTime_new);
						//品目別仕掛の作業指示数に設定
						updateStruct.setOPR_INST_QTY(_lastOprInstQty_new);
						//品目別仕掛が未更新であれば通常のUpdate Sqlを呼び出す
						if ( _procByItemUpdateStatus == 0 ) {        
							entity.mUpdate_T_WORK_IN_PROC_BY_ITEM_DLV_DATE.update(conn, updateStruct);
						} else {
							entity.mUpdate_T_WORK_IN_PROC_BY_ITEM_DLV_DATE2.update(conn, updateStruct);
						}
					}
				}
			}
			
			conn.commit();
				
			_procByItemUpdateStatus = 0;    //品目別仕掛更新ステータス初期化
			
			//画面の再検索
			controlSelect();

		} catch (NumberFormatException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;
		} catch (SQLException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;
		} catch (ParseException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;
		} catch (ApsComException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;
		} finally {
			try {
				if (conn != null) {
					conn.rollback();
				}
			} catch(Exception e) {
				setReadStatus(ERROR);
				ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
				sysLog.severe(emsg, getsysUSER_CD());
				ExpjException ee = new ExpjException(e, emsg);
				throw ee;
			}
		}



                //}}user_implement_dev:<controlInsert>
		logger.exiting("AD0030020Control"+":USER="+struct.getsUser_ID(),"controlInsert");

		return;
	}

	/**
	 * 更新ボタン押下時に実行される処理です。
	 *
	 */
	public void controlUpdate() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0030");
		logger.entering("AD0030020Control"+":USER="+struct.getsUser_ID(),"controlUpdate");
			//{{user_implement_dev:<controlUpdate>
		
		
		controlInsert();


                //}}user_implement_dev:<controlUpdate>
		logger.exiting("AD0030020Control"+":USER="+struct.getsUser_ID(),"controlUpdate");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0030");
		logger.entering("AD0030020Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AD0030020Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0030");
		logger.entering("AD0030020Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>


		try {
			setReadStatus(INITIAL);

			clearList();
			
			// [邦貨]情報を部品より取得
			this._sysHomeCurStruct = HomeCurControl.getData(this.conn);
			// [税名]情報を部品より取得			
			_taxNameStruct = TaxNameControl.getData(conn);


			//コンボボックスの中身をセットする
			// コンボボックスデータを部品より取得
			ComboBox cdac = new ComboBox(conn, sysUSER_CD);
			_outsideTypStruct = cdac.getData("OUTSIDE_TYP");
			_unitCostTypStruct = cdac.getData("UNIT_COST_TYP");
			_acptInspcTypStruct = cdac.getData("ACPT_INSPC_TYP");
			cdac.setConnection(null);
			
			//時刻管理パラメータ取得
			List listTimeCtrl = entity.mTIME_CTRL.read(conn,struct);
			if(listTimeCtrl == null || listTimeCtrl.size() <=0){
				struct.setTIME_CTRL("false");
				_flgTimeCtrl = "false";
			}else{
				struct.setTIME_CTRL(((AD0030020Struct)listTimeCtrl.get(0)).getTIME_CTRL());
				_flgTimeCtrl = struct.getTIME_CTRL();
			}
			
		} catch (ComboException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;
		} catch (SQLException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;
		} catch (DataNotFoundException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;
		}
				

                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AD0030020Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * イベントハンドラの前処理です。
	 *
	 * @param buttun ボタン名
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0030");
		logger.entering("AD0030020Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			// ダウンロードファイル名クリア
			// PDF・CSVのダウンロードを行うときは、画面上にOrHiddenで「DOWNLOAD_FILE」を定義し、次の行のコメントを外してください。
//			struct.setDOWNLOAD_FILE((String)null);
			// コンボボックス部品のデータのセットはここに記述してください。
			// コンボボックスデータ用意
        try{
			ComboBox comboController = new ComboBox(conn, sysUSER_CD);
			OUTSIDE_TYP = comboController.getData(OUTSIDE_TYP_PARAMETER_NAME);
		}catch (Exception e){
			e.printStackTrace();
		}   
                
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("AD0030020Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("Clear") ) {
				controlClear();
			} else if( button.equals("Return") ) {
				controlReturn();
			} else if( button.equals("LineInsert") ) {
				controlLineInsert();
			} else if( button.equals("LineUpdate") ) {
				controlLineUpdate();
			} else if( button.equals("LineCopy") ) {
				controlLineCopy();
			} else if( button.equals("LineDelete") ) {
				controlLineDelete();
			} else if( button.equals("SelectUnitCost") ) {
				controlSelectUnitCost();
			} else if( button.equals("Insert") ) {
				controlInsert();
			} else if( button.equals("Update") ) {
				controlUpdate();
			} else if( button.equals("initial") ) {
				controlINITIAL();
			} else if( button.equals("reload") ) {
				controlRELOAD();
			}
		//{{user_implement_dev:<control_eventHandller>


		//コンボボックスのセット
		struct.setList_OUTSIDE_TYP_val(_outsideTypStruct.getValList());
		struct.setList_OUTSIDE_TYP_name(_outsideTypStruct.getExplanList());
		struct.setList_UNIT_COST_TYP_val(_unitCostTypStruct.getValList());
		struct.setList_UNIT_COST_TYP_name(_unitCostTypStruct.getExplanList());
		struct.setList_ACPT_INSPC_TYP_val(_acptInspcTypStruct.getValList());
		struct.setList_ACPT_INSPC_TYP_name(_acptInspcTypStruct.getExplanList());
		//税名のセット
		struct.setTAX_NAME_1(_taxNameStruct.getTAX_NAME_1());
		struct.setTAX_NAME_2(_taxNameStruct.getTAX_NAME_2());
		struct.setTAX_NAME_3(_taxNameStruct.getTAX_NAME_3());
		//邦貨情報のセット
		struct.seth_HOME_DECIMAL_FIG(_sysHomeCurStruct.getDECIMAL_FIG());


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
//			throw new FoundationException("AD0030020Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AD0030020-E999","CSVの出力処理"));
			throw new FoundationException("AD0030020Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AD0030020-E999","システム日付の取得処理"));
				throw new FoundationException("AD0030020Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AD0030020-E999","コントロールのイベント処理"));
			throw new FoundationException("AD0030020Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected AD0030020Entity entity;
	protected AD0030020Struct struct;
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

		entity = new AD0030020Entity();
		struct = new AD0030020Struct();

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
	 * AD0030020クラスの標準コンストラクタ
	 */
	public AD0030020Control() throws BusinessProcessException, FoundationException
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
				AD0030020Struct key = (AD0030020Struct)keyList.get(j);
				// メッセージキーを作成する
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("OUTSIDE_TYP_name") && key.getOUTSIDE_TYP_name() != null) {
					msgKey.setKeyValue("OUTSIDE_TYP_name", key.getOUTSIDE_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("OUTSIDE_TYP_val") && key.getOUTSIDE_TYP_val() != null) {
					msgKey.setKeyValue("OUTSIDE_TYP_val", key.getOUTSIDE_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("ACPT_INSPC_TYP_name") && key.getACPT_INSPC_TYP_name() != null) {
					msgKey.setKeyValue("ACPT_INSPC_TYP_name", key.getACPT_INSPC_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("ACPT_INSPC_TYP_val") && key.getACPT_INSPC_TYP_val() != null) {
					msgKey.setKeyValue("ACPT_INSPC_TYP_val", key.getACPT_INSPC_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("h_UNIT_COST_TYP") && key.geth_UNIT_COST_TYP() != null) {
					msgKey.setKeyValue("h_UNIT_COST_TYP", key.geth_UNIT_COST_TYP());
				}
				if(msgKeyType.containsKeyColumn("UNIT_COST_TYP_name") && key.getUNIT_COST_TYP_name() != null) {
					msgKey.setKeyValue("UNIT_COST_TYP_name", key.getUNIT_COST_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("UNIT_COST_TYP_val") && key.getUNIT_COST_TYP_val() != null) {
					msgKey.setKeyValue("UNIT_COST_TYP_val", key.getUNIT_COST_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("h_PLANT_CD") && key.geth_PLANT_CD() != null) {
					msgKey.setKeyValue("h_PLANT_CD", key.geth_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("AFTER_DISC_AMOUNT") && key.getAFTER_DISC_AMOUNT() != null) {
					msgKey.setKeyValue("AFTER_DISC_AMOUNT", key.getAFTER_DISC_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("PROVISIONAL_HOME_CUR_AMOUNT") && key.getPROVISIONAL_HOME_CUR_AMOUNT() != null) {
					msgKey.setKeyValue("PROVISIONAL_HOME_CUR_AMOUNT", key.getPROVISIONAL_HOME_CUR_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("HOME_CUR_UNIT") && key.getHOME_CUR_UNIT() != null) {
					msgKey.setKeyValue("HOME_CUR_UNIT", key.getHOME_CUR_UNIT());
				}
				if(msgKeyType.containsKeyColumn("EXCH_RATE") && key.getEXCH_RATE() != null) {
					msgKey.setKeyValue("EXCH_RATE", key.getEXCH_RATE());
				}
				if(msgKeyType.containsKeyColumn("TAX_AMOUNT_1") && key.getTAX_AMOUNT_1() != null) {
					msgKey.setKeyValue("TAX_AMOUNT_1", key.getTAX_AMOUNT_1());
				}
				if(msgKeyType.containsKeyColumn("TAX_AMOUNT_2") && key.getTAX_AMOUNT_2() != null) {
					msgKey.setKeyValue("TAX_AMOUNT_2", key.getTAX_AMOUNT_2());
				}
				if(msgKeyType.containsKeyColumn("AMOUNT_INCLUDE_TAX") && key.getAMOUNT_INCLUDE_TAX() != null) {
					msgKey.setKeyValue("AMOUNT_INCLUDE_TAX", key.getAMOUNT_INCLUDE_TAX());
				}
				if(msgKeyType.containsKeyColumn("h_HOME_DECIMAL_FIG") && key.geth_HOME_DECIMAL_FIG() != null) {
					msgKey.setKeyValue("h_HOME_DECIMAL_FIG", key.geth_HOME_DECIMAL_FIG());
				}
				if(msgKeyType.containsKeyColumn("h_TAX_RATE_1") && key.geth_TAX_RATE_1() != null) {
					msgKey.setKeyValue("h_TAX_RATE_1", key.geth_TAX_RATE_1());
				}
				if(msgKeyType.containsKeyColumn("h_TAX_RATE_2") && key.geth_TAX_RATE_2() != null) {
					msgKey.setKeyValue("h_TAX_RATE_2", key.geth_TAX_RATE_2());
				}
				if(msgKeyType.containsKeyColumn("h_TAX_RATE_3") && key.geth_TAX_RATE_3() != null) {
					msgKey.setKeyValue("h_TAX_RATE_3", key.geth_TAX_RATE_3());
				}
				if(msgKeyType.containsKeyColumn("TAX_AMOUNT_3") && key.getTAX_AMOUNT_3() != null) {
					msgKey.setKeyValue("TAX_AMOUNT_3", key.getTAX_AMOUNT_3());
				}
				if(msgKeyType.containsKeyColumn("h_WORK_ODR_DLV_DATE_BY_PROC") && key.geth_WORK_ODR_DLV_DATE_BY_PROC() != null) {
					msgKey.setKeyValue("h_WORK_ODR_DLV_DATE_BY_PROC", key.geth_WORK_ODR_DLV_DATE_BY_PROC());
				}
				if(msgKeyType.containsKeyColumn("h_OPR_INST_START_DATE_BY_PROC") && key.geth_OPR_INST_START_DATE_BY_PROC() != null) {
					msgKey.setKeyValue("h_OPR_INST_START_DATE_BY_PROC", key.geth_OPR_INST_START_DATE_BY_PROC());
				}
				if(msgKeyType.containsKeyColumn("h_OPR_INST_QTY") && key.geth_OPR_INST_QTY() != null) {
					msgKey.setKeyValue("h_OPR_INST_QTY", key.geth_OPR_INST_QTY());
				}
				if(msgKeyType.containsKeyColumn("SelectUnitCostFlag") && key.getSelectUnitCostFlag() != null) {
					msgKey.setKeyValue("SelectUnitCostFlag", key.getSelectUnitCostFlag());
				}
				if(msgKeyType.containsKeyColumn("WORK_ODR_DLV_DATE_BY_ITEM_TIME") && key.getWORK_ODR_DLV_DATE_BY_ITEM_TIME() != null) {
					msgKey.setKeyValue("WORK_ODR_DLV_DATE_BY_ITEM_TIME", key.getWORK_ODR_DLV_DATE_BY_ITEM_TIME());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_START_DATE_BY_ITEM_TIME") && key.getOPR_INST_START_DATE_BY_ITEM_TIME() != null) {
					msgKey.setKeyValue("OPR_INST_START_DATE_BY_ITEM_TIME", key.getOPR_INST_START_DATE_BY_ITEM_TIME());
				}
				if(msgKeyType.containsKeyColumn("h_ODR_START_DATE_TIME") && key.geth_ODR_START_DATE_TIME() != null) {
					msgKey.setKeyValue("h_ODR_START_DATE_TIME", key.geth_ODR_START_DATE_TIME());
				}
				if(msgKeyType.containsKeyColumn("h_WORK_ODR_DLV_DATE_BY_PROC_TIME") && key.geth_WORK_ODR_DLV_DATE_BY_PROC_TIME() != null) {
					msgKey.setKeyValue("h_WORK_ODR_DLV_DATE_BY_PROC_TIME", key.geth_WORK_ODR_DLV_DATE_BY_PROC_TIME());
				}
				if(msgKeyType.containsKeyColumn("h_OPR_INST_START_DATE_BY_PROC_TIME") && key.geth_OPR_INST_START_DATE_BY_PROC_TIME() != null) {
					msgKey.setKeyValue("h_OPR_INST_START_DATE_BY_PROC_TIME", key.geth_OPR_INST_START_DATE_BY_PROC_TIME());
				}
				if(msgKeyType.containsKeyColumn("WORK_ODR_CD") && key.getWORK_ODR_CD() != null) {
					msgKey.setKeyValue("WORK_ODR_CD", key.getWORK_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
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
				if(msgKeyType.containsKeyColumn("WORK_ODR_DLV_DATE_BY_PROC") && key.getWORK_ODR_DLV_DATE_BY_PROC() != null) {
					msgKey.setKeyValue("WORK_ODR_DLV_DATE_BY_PROC", key.getWORK_ODR_DLV_DATE_BY_PROC());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_START_DATE_BY_ITEM") && key.getOPR_INST_START_DATE_BY_ITEM() != null) {
					msgKey.setKeyValue("OPR_INST_START_DATE_BY_ITEM", key.getOPR_INST_START_DATE_BY_ITEM());
				}
				if(msgKeyType.containsKeyColumn("WORK_ODR_DLV_DATE_BY_ITEM") && key.getWORK_ODR_DLV_DATE_BY_ITEM() != null) {
					msgKey.setKeyValue("WORK_ODR_DLV_DATE_BY_ITEM", key.getWORK_ODR_DLV_DATE_BY_ITEM());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_START_DATE_BY_PROC") && key.getOPR_INST_START_DATE_BY_PROC() != null) {
					msgKey.setKeyValue("OPR_INST_START_DATE_BY_PROC", key.getOPR_INST_START_DATE_BY_PROC());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_QTY") && key.getOPR_INST_QTY() != null) {
					msgKey.setKeyValue("OPR_INST_QTY", key.getOPR_INST_QTY());
				}
				if(msgKeyType.containsKeyColumn("OUTSIDE_TYP") && key.getOUTSIDE_TYP() != null) {
					msgKey.setKeyValue("OUTSIDE_TYP", key.getOUTSIDE_TYP());
				}
				if(msgKeyType.containsKeyColumn("WS_CD") && key.getWS_CD() != null) {
					msgKey.setKeyValue("WS_CD", key.getWS_CD());
				}
				if(msgKeyType.containsKeyColumn("VEND_CD") && key.getVEND_CD() != null) {
					msgKey.setKeyValue("VEND_CD", key.getVEND_CD());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_CD") && key.getOPR_INST_CD() != null) {
					msgKey.setKeyValue("OPR_INST_CD", key.getOPR_INST_CD());
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
				if(msgKeyType.containsKeyColumn("JOB_ODR_CD") && key.getJOB_ODR_CD() != null) {
					msgKey.setKeyValue("JOB_ODR_CD", key.getJOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("h_MODIFY_COUNT_BY_ITEM") && key.geth_MODIFY_COUNT_BY_ITEM() != null) {
					msgKey.setKeyValue("h_MODIFY_COUNT_BY_ITEM", key.geth_MODIFY_COUNT_BY_ITEM());
				}
				if(msgKeyType.containsKeyColumn("h_MODIFY_COUNT_BY_PROC") && key.geth_MODIFY_COUNT_BY_PROC() != null) {
					msgKey.setKeyValue("h_MODIFY_COUNT_BY_PROC", key.geth_MODIFY_COUNT_BY_PROC());
				}
				if(msgKeyType.containsKeyColumn("WORK_STS_TYP") && key.getWORK_STS_TYP() != null) {
					msgKey.setKeyValue("WORK_STS_TYP", key.getWORK_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("PROC_EXPLOSION_FLG") && key.getPROC_EXPLOSION_FLG() != null) {
					msgKey.setKeyValue("PROC_EXPLOSION_FLG", key.getPROC_EXPLOSION_FLG());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP") && key.getMRP_ODR_TYP() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP", key.getMRP_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("UNIT_COST_TYP") && key.getUNIT_COST_TYP() != null) {
					msgKey.setKeyValue("UNIT_COST_TYP", key.getUNIT_COST_TYP());
				}
				if(msgKeyType.containsKeyColumn("UNIT_COST") && key.getUNIT_COST() != null) {
					msgKey.setKeyValue("UNIT_COST", key.getUNIT_COST());
				}
				if(msgKeyType.containsKeyColumn("PROCESSING_COST") && key.getPROCESSING_COST() != null) {
					msgKey.setKeyValue("PROCESSING_COST", key.getPROCESSING_COST());
				}
				if(msgKeyType.containsKeyColumn("MATERIAL_COST") && key.getMATERIAL_COST() != null) {
					msgKey.setKeyValue("MATERIAL_COST", key.getMATERIAL_COST());
				}
				if(msgKeyType.containsKeyColumn("OTHER_OVERHEADS") && key.getOTHER_OVERHEADS() != null) {
					msgKey.setKeyValue("OTHER_OVERHEADS", key.getOTHER_OVERHEADS());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_AMOUNT") && key.getPUCH_ODR_AMOUNT() != null) {
					msgKey.setKeyValue("PUCH_ODR_AMOUNT", key.getPUCH_ODR_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("DISC_AMOUNT") && key.getDISC_AMOUNT() != null) {
					msgKey.setKeyValue("DISC_AMOUNT", key.getDISC_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("ACPT_INSPC_TYP") && key.getACPT_INSPC_TYP() != null) {
					msgKey.setKeyValue("ACPT_INSPC_TYP", key.getACPT_INSPC_TYP());
				}
				if(msgKeyType.containsKeyColumn("WS_NAME") && key.getWS_NAME() != null) {
					msgKey.setKeyValue("WS_NAME", key.getWS_NAME());
				}
				if(msgKeyType.containsKeyColumn("VEND_ANAME") && key.getVEND_ANAME() != null) {
					msgKey.setKeyValue("VEND_ANAME", key.getVEND_ANAME());
				}
				if(msgKeyType.containsKeyColumn("ROUND_TYP") && key.getROUND_TYP() != null) {
					msgKey.setKeyValue("ROUND_TYP", key.getROUND_TYP());
				}
				if(msgKeyType.containsKeyColumn("CUR_CD") && key.getCUR_CD() != null) {
					msgKey.setKeyValue("CUR_CD", key.getCUR_CD());
				}
				if(msgKeyType.containsKeyColumn("CUR_NAME") && key.getCUR_NAME() != null) {
					msgKey.setKeyValue("CUR_NAME", key.getCUR_NAME());
				}
				if(msgKeyType.containsKeyColumn("WORK_IN_PROC_COMMENT") && key.getWORK_IN_PROC_COMMENT() != null) {
					msgKey.setKeyValue("WORK_IN_PROC_COMMENT", key.getWORK_IN_PROC_COMMENT());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("h_UNIT_QTY_TYP") && key.geth_UNIT_QTY_TYP() != null) {
					msgKey.setKeyValue("h_UNIT_QTY_TYP", key.geth_UNIT_QTY_TYP());
				}
				if(msgKeyType.containsKeyColumn("h_PARENT_OD_NO") && key.geth_PARENT_OD_NO() != null) {
					msgKey.setKeyValue("h_PARENT_OD_NO", key.geth_PARENT_OD_NO());
				}
				if(msgKeyType.containsKeyColumn("h_COMPANY_CD") && key.geth_COMPANY_CD() != null) {
					msgKey.setKeyValue("h_COMPANY_CD", key.geth_COMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("h_ODR_START_DATE") && key.geth_ODR_START_DATE() != null) {
					msgKey.setKeyValue("h_ODR_START_DATE", key.geth_ODR_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("OD_NO") && key.getOD_NO() != null) {
					msgKey.setKeyValue("OD_NO", key.getOD_NO());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_DETAIL_NO") && key.getJOB_ODR_DETAIL_NO() != null) {
					msgKey.setKeyValue("JOB_ODR_DETAIL_NO", key.getJOB_ODR_DETAIL_NO());
				}
				if(msgKeyType.containsKeyColumn("h_JOB_ODR_CANCEL_NO") && key.geth_JOB_ODR_CANCEL_NO() != null) {
					msgKey.setKeyValue("h_JOB_ODR_CANCEL_NO", key.geth_JOB_ODR_CANCEL_NO());
				}
				if(msgKeyType.containsKeyColumn("DUE_DATE") && key.getDUE_DATE() != null) {
					msgKey.setKeyValue("DUE_DATE", key.getDUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("h_MODIFY_COUNT_OPR_INST") && key.geth_MODIFY_COUNT_OPR_INST() != null) {
					msgKey.setKeyValue("h_MODIFY_COUNT_OPR_INST", key.geth_MODIFY_COUNT_OPR_INST());
				}
				if(msgKeyType.containsKeyColumn("OUTSIDE_TYP_DN") && key.getOUTSIDE_TYP_DN() != null) {
					msgKey.setKeyValue("OUTSIDE_TYP_DN", key.getOUTSIDE_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP_DN") && key.getMRP_ODR_TYP_DN() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP_DN", key.getMRP_ODR_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("EXCH_TYP") && key.getEXCH_TYP() != null) {
					msgKey.setKeyValue("EXCH_TYP", key.getEXCH_TYP());
				}
				if(msgKeyType.containsKeyColumn("VEND_CUR_UNIT") && key.getVEND_CUR_UNIT() != null) {
					msgKey.setKeyValue("VEND_CUR_UNIT", key.getVEND_CUR_UNIT());
				}
				if(msgKeyType.containsKeyColumn("h_VEND_DECIMAL_FIG") && key.geth_VEND_DECIMAL_FIG() != null) {
					msgKey.setKeyValue("h_VEND_DECIMAL_FIG", key.geth_VEND_DECIMAL_FIG());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_CD_GNR_TYP") && key.getOPR_INST_CD_GNR_TYP() != null) {
					msgKey.setKeyValue("OPR_INST_CD_GNR_TYP", key.getOPR_INST_CD_GNR_TYP());
				}
				if(msgKeyType.containsKeyColumn("h_OD_NO") && key.geth_OD_NO() != null) {
					msgKey.setKeyValue("h_OD_NO", key.geth_OD_NO());
				}
				if(msgKeyType.containsKeyColumn("WORK_ODR_DLV_DATE_BY_PROC_ALL") && key.getWORK_ODR_DLV_DATE_BY_PROC_ALL() != null) {
					msgKey.setKeyValue("WORK_ODR_DLV_DATE_BY_PROC_ALL", key.getWORK_ODR_DLV_DATE_BY_PROC_ALL());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_START_DATE_BY_PROC_ALL") && key.getOPR_INST_START_DATE_BY_PROC_ALL() != null) {
					msgKey.setKeyValue("OPR_INST_START_DATE_BY_PROC_ALL", key.getOPR_INST_START_DATE_BY_PROC_ALL());
				}
				if(msgKeyType.containsKeyColumn("h_WORK_STS_TYP") && key.geth_WORK_STS_TYP() != null) {
					msgKey.setKeyValue("h_WORK_STS_TYP", key.geth_WORK_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("FINAL_PROC_FLG") && key.getFINAL_PROC_FLG() != null) {
					msgKey.setKeyValue("FINAL_PROC_FLG", key.getFINAL_PROC_FLG());
				}
				if(msgKeyType.containsKeyColumn("MODIFY_COUNT_BY_PROC") && key.getMODIFY_COUNT_BY_PROC() != null) {
					msgKey.setKeyValue("MODIFY_COUNT_BY_PROC", key.getMODIFY_COUNT_BY_PROC());
				}
				if(msgKeyType.containsKeyColumn("h_BUSINESS_OPR_DATE") && key.geth_BUSINESS_OPR_DATE() != null) {
					msgKey.setKeyValue("h_BUSINESS_OPR_DATE", key.geth_BUSINESS_OPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("COMPANY_CD") && key.getCOMPANY_CD() != null) {
					msgKey.setKeyValue("COMPANY_CD", key.getCOMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("CAL_DATE") && key.getCAL_DATE() != null) {
					msgKey.setKeyValue("CAL_DATE", key.getCAL_DATE());
				}
				if(msgKeyType.containsKeyColumn("CAL_NO") && key.getCAL_NO() != null) {
					msgKey.setKeyValue("CAL_NO", key.getCAL_NO());
				}
				if(msgKeyType.containsKeyColumn("CHECK_DATE") && key.getCHECK_DATE() != null) {
					msgKey.setKeyValue("CHECK_DATE", key.getCHECK_DATE());
				}
				if(msgKeyType.containsKeyColumn("WS_PLANT_CD") && key.getWS_PLANT_CD() != null) {
					msgKey.setKeyValue("WS_PLANT_CD", key.getWS_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("MODIFY_COUNT_OPR_INST") && key.getMODIFY_COUNT_OPR_INST() != null) {
					msgKey.setKeyValue("MODIFY_COUNT_OPR_INST", key.getMODIFY_COUNT_OPR_INST());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_START_DATE_BY_PROC_TIME") && key.getOPR_INST_START_DATE_BY_PROC_TIME() != null) {
					msgKey.setKeyValue("OPR_INST_START_DATE_BY_PROC_TIME", key.getOPR_INST_START_DATE_BY_PROC_TIME());
				}
				if(msgKeyType.containsKeyColumn("WORK_ODR_DLV_DATE_BY_PROC_TIME") && key.getWORK_ODR_DLV_DATE_BY_PROC_TIME() != null) {
					msgKey.setKeyValue("WORK_ODR_DLV_DATE_BY_PROC_TIME", key.getWORK_ODR_DLV_DATE_BY_PROC_TIME());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_START_DATE_BY_ITEM_ALL") && key.getOPR_INST_START_DATE_BY_ITEM_ALL() != null) {
					msgKey.setKeyValue("OPR_INST_START_DATE_BY_ITEM_ALL", key.getOPR_INST_START_DATE_BY_ITEM_ALL());
				}
				if(msgKeyType.containsKeyColumn("WORK_ODR_DLV_DATE_BY_ITEM_ALL") && key.getWORK_ODR_DLV_DATE_BY_ITEM_ALL() != null) {
					msgKey.setKeyValue("WORK_ODR_DLV_DATE_BY_ITEM_ALL", key.getWORK_ODR_DLV_DATE_BY_ITEM_ALL());
				}
				if(msgKeyType.containsKeyColumn("LOWER_OD_NO") && key.getLOWER_OD_NO() != null) {
					msgKey.setKeyValue("LOWER_OD_NO", key.getLOWER_OD_NO());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_TYP") && key.getJOB_ODR_TYP() != null) {
					msgKey.setKeyValue("JOB_ODR_TYP", key.getJOB_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_DLV_DATE") && key.getJOB_ODR_DLV_DATE() != null) {
					msgKey.setKeyValue("JOB_ODR_DLV_DATE", key.getJOB_ODR_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_DLV_DATE_TIME") && key.getJOB_ODR_DLV_DATE_TIME() != null) {
					msgKey.setKeyValue("JOB_ODR_DLV_DATE_TIME", key.getJOB_ODR_DLV_DATE_TIME());
				}
				if(msgKeyType.containsKeyColumn("h_JOB_ODR_CD") && key.geth_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("h_JOB_ODR_CD", key.geth_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("MODIFY_COUNT_BY_ITEM") && key.getMODIFY_COUNT_BY_ITEM() != null) {
					msgKey.setKeyValue("MODIFY_COUNT_BY_ITEM", key.getMODIFY_COUNT_BY_ITEM());
				}
				if(msgKeyType.containsKeyColumn("TAX_NAME_1") && key.getTAX_NAME_1() != null) {
					msgKey.setKeyValue("TAX_NAME_1", key.getTAX_NAME_1());
				}
				if(msgKeyType.containsKeyColumn("TAX_NAME_2") && key.getTAX_NAME_2() != null) {
					msgKey.setKeyValue("TAX_NAME_2", key.getTAX_NAME_2());
				}
				if(msgKeyType.containsKeyColumn("TAX_NAME_3") && key.getTAX_NAME_3() != null) {
					msgKey.setKeyValue("TAX_NAME_3", key.getTAX_NAME_3());
				}
				if(msgKeyType.containsKeyColumn("h_MANHOUR_TYP") && key.geth_MANHOUR_TYP() != null) {
					msgKey.setKeyValue("h_MANHOUR_TYP", key.geth_MANHOUR_TYP());
				}
				if(msgKeyType.containsKeyColumn("h_ODR_START_DATE_ALL") && key.geth_ODR_START_DATE_ALL() != null) {
					msgKey.setKeyValue("h_ODR_START_DATE_ALL", key.geth_ODR_START_DATE_ALL());
				}
				if(msgKeyType.containsKeyColumn("DUE_DATE_TIME") && key.getDUE_DATE_TIME() != null) {
					msgKey.setKeyValue("DUE_DATE_TIME", key.getDUE_DATE_TIME());
				}
				if(msgKeyType.containsKeyColumn("TIME_CTRL") && key.getTIME_CTRL() != null) {
					msgKey.setKeyValue("TIME_CTRL", key.getTIME_CTRL());
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
					AD0030020Struct key = new AD0030020Struct();
					if(msgKeyType.containsKeyColumn("OUTSIDE_TYP_name")) {
						key.setOUTSIDE_TYP_name(msgKey.getKeyValue("OUTSIDE_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("OUTSIDE_TYP_val")) {
						key.setOUTSIDE_TYP_val(msgKey.getKeyValue("OUTSIDE_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("ACPT_INSPC_TYP_name")) {
						key.setACPT_INSPC_TYP_name(msgKey.getKeyValue("ACPT_INSPC_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("ACPT_INSPC_TYP_val")) {
						key.setACPT_INSPC_TYP_val(msgKey.getKeyValue("ACPT_INSPC_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("h_UNIT_COST_TYP")) {
						key.seth_UNIT_COST_TYP(msgKey.getKeyValue("h_UNIT_COST_TYP"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_COST_TYP_name")) {
						key.setUNIT_COST_TYP_name(msgKey.getKeyValue("UNIT_COST_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_COST_TYP_val")) {
						key.setUNIT_COST_TYP_val(msgKey.getKeyValue("UNIT_COST_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("h_PLANT_CD")) {
						key.seth_PLANT_CD(msgKey.getKeyValue("h_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("AFTER_DISC_AMOUNT")) {
						key.setAFTER_DISC_AMOUNT(msgKey.getKeyValue("AFTER_DISC_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("PROVISIONAL_HOME_CUR_AMOUNT")) {
						key.setPROVISIONAL_HOME_CUR_AMOUNT(msgKey.getKeyValue("PROVISIONAL_HOME_CUR_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("HOME_CUR_UNIT")) {
						key.setHOME_CUR_UNIT(msgKey.getKeyValue("HOME_CUR_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("EXCH_RATE")) {
						key.setEXCH_RATE(msgKey.getKeyValue("EXCH_RATE"));
					}
					if(msgKeyType.containsKeyColumn("TAX_AMOUNT_1")) {
						key.setTAX_AMOUNT_1(msgKey.getKeyValue("TAX_AMOUNT_1"));
					}
					if(msgKeyType.containsKeyColumn("TAX_AMOUNT_2")) {
						key.setTAX_AMOUNT_2(msgKey.getKeyValue("TAX_AMOUNT_2"));
					}
					if(msgKeyType.containsKeyColumn("AMOUNT_INCLUDE_TAX")) {
						key.setAMOUNT_INCLUDE_TAX(msgKey.getKeyValue("AMOUNT_INCLUDE_TAX"));
					}
					if(msgKeyType.containsKeyColumn("h_HOME_DECIMAL_FIG")) {
						key.seth_HOME_DECIMAL_FIG(msgKey.getKeyValue("h_HOME_DECIMAL_FIG"));
					}
					if(msgKeyType.containsKeyColumn("h_TAX_RATE_1")) {
						key.seth_TAX_RATE_1(msgKey.getKeyValue("h_TAX_RATE_1"));
					}
					if(msgKeyType.containsKeyColumn("h_TAX_RATE_2")) {
						key.seth_TAX_RATE_2(msgKey.getKeyValue("h_TAX_RATE_2"));
					}
					if(msgKeyType.containsKeyColumn("h_TAX_RATE_3")) {
						key.seth_TAX_RATE_3(msgKey.getKeyValue("h_TAX_RATE_3"));
					}
					if(msgKeyType.containsKeyColumn("TAX_AMOUNT_3")) {
						key.setTAX_AMOUNT_3(msgKey.getKeyValue("TAX_AMOUNT_3"));
					}
					if(msgKeyType.containsKeyColumn("h_WORK_ODR_DLV_DATE_BY_PROC")) {
						key.seth_WORK_ODR_DLV_DATE_BY_PROC(msgKey.getKeyValue("h_WORK_ODR_DLV_DATE_BY_PROC"));
					}
					if(msgKeyType.containsKeyColumn("h_OPR_INST_START_DATE_BY_PROC")) {
						key.seth_OPR_INST_START_DATE_BY_PROC(msgKey.getKeyValue("h_OPR_INST_START_DATE_BY_PROC"));
					}
					if(msgKeyType.containsKeyColumn("h_OPR_INST_QTY")) {
						key.seth_OPR_INST_QTY(msgKey.getKeyValue("h_OPR_INST_QTY"));
					}
					if(msgKeyType.containsKeyColumn("SelectUnitCostFlag")) {
						key.setSelectUnitCostFlag(msgKey.getKeyValue("SelectUnitCostFlag"));
					}
					if(msgKeyType.containsKeyColumn("WORK_ODR_DLV_DATE_BY_ITEM_TIME")) {
						key.setWORK_ODR_DLV_DATE_BY_ITEM_TIME(msgKey.getKeyValue("WORK_ODR_DLV_DATE_BY_ITEM_TIME"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_START_DATE_BY_ITEM_TIME")) {
						key.setOPR_INST_START_DATE_BY_ITEM_TIME(msgKey.getKeyValue("OPR_INST_START_DATE_BY_ITEM_TIME"));
					}
					if(msgKeyType.containsKeyColumn("h_ODR_START_DATE_TIME")) {
						key.seth_ODR_START_DATE_TIME(msgKey.getKeyValue("h_ODR_START_DATE_TIME"));
					}
					if(msgKeyType.containsKeyColumn("h_WORK_ODR_DLV_DATE_BY_PROC_TIME")) {
						key.seth_WORK_ODR_DLV_DATE_BY_PROC_TIME(msgKey.getKeyValue("h_WORK_ODR_DLV_DATE_BY_PROC_TIME"));
					}
					if(msgKeyType.containsKeyColumn("h_OPR_INST_START_DATE_BY_PROC_TIME")) {
						key.seth_OPR_INST_START_DATE_BY_PROC_TIME(msgKey.getKeyValue("h_OPR_INST_START_DATE_BY_PROC_TIME"));
					}
					if(msgKeyType.containsKeyColumn("WORK_ODR_CD")) {
						key.setWORK_ODR_CD(msgKey.getKeyValue("WORK_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
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
					if(msgKeyType.containsKeyColumn("WORK_ODR_DLV_DATE_BY_PROC")) {
						key.setWORK_ODR_DLV_DATE_BY_PROC(msgKey.getKeyValue("WORK_ODR_DLV_DATE_BY_PROC"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_START_DATE_BY_ITEM")) {
						key.setOPR_INST_START_DATE_BY_ITEM(msgKey.getKeyValue("OPR_INST_START_DATE_BY_ITEM"));
					}
					if(msgKeyType.containsKeyColumn("WORK_ODR_DLV_DATE_BY_ITEM")) {
						key.setWORK_ODR_DLV_DATE_BY_ITEM(msgKey.getKeyValue("WORK_ODR_DLV_DATE_BY_ITEM"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_START_DATE_BY_PROC")) {
						key.setOPR_INST_START_DATE_BY_PROC(msgKey.getKeyValue("OPR_INST_START_DATE_BY_PROC"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_QTY")) {
						key.setOPR_INST_QTY(msgKey.getKeyValue("OPR_INST_QTY"));
					}
					if(msgKeyType.containsKeyColumn("OUTSIDE_TYP")) {
						key.setOUTSIDE_TYP(msgKey.getKeyValue("OUTSIDE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("WS_CD")) {
						key.setWS_CD(msgKey.getKeyValue("WS_CD"));
					}
					if(msgKeyType.containsKeyColumn("VEND_CD")) {
						key.setVEND_CD(msgKey.getKeyValue("VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_CD")) {
						key.setOPR_INST_CD(msgKey.getKeyValue("OPR_INST_CD"));
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
					if(msgKeyType.containsKeyColumn("JOB_ODR_CD")) {
						key.setJOB_ODR_CD(msgKey.getKeyValue("JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_MODIFY_COUNT_BY_ITEM")) {
						key.seth_MODIFY_COUNT_BY_ITEM(msgKey.getKeyValue("h_MODIFY_COUNT_BY_ITEM"));
					}
					if(msgKeyType.containsKeyColumn("h_MODIFY_COUNT_BY_PROC")) {
						key.seth_MODIFY_COUNT_BY_PROC(msgKey.getKeyValue("h_MODIFY_COUNT_BY_PROC"));
					}
					if(msgKeyType.containsKeyColumn("WORK_STS_TYP")) {
						key.setWORK_STS_TYP(msgKey.getKeyValue("WORK_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PROC_EXPLOSION_FLG")) {
						key.setPROC_EXPLOSION_FLG(msgKey.getKeyValue("PROC_EXPLOSION_FLG"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP")) {
						key.setMRP_ODR_TYP(msgKey.getKeyValue("MRP_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_COST_TYP")) {
						key.setUNIT_COST_TYP(msgKey.getKeyValue("UNIT_COST_TYP"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_COST")) {
						key.setUNIT_COST(msgKey.getKeyValue("UNIT_COST"));
					}
					if(msgKeyType.containsKeyColumn("PROCESSING_COST")) {
						key.setPROCESSING_COST(msgKey.getKeyValue("PROCESSING_COST"));
					}
					if(msgKeyType.containsKeyColumn("MATERIAL_COST")) {
						key.setMATERIAL_COST(msgKey.getKeyValue("MATERIAL_COST"));
					}
					if(msgKeyType.containsKeyColumn("OTHER_OVERHEADS")) {
						key.setOTHER_OVERHEADS(msgKey.getKeyValue("OTHER_OVERHEADS"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_AMOUNT")) {
						key.setPUCH_ODR_AMOUNT(msgKey.getKeyValue("PUCH_ODR_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("DISC_AMOUNT")) {
						key.setDISC_AMOUNT(msgKey.getKeyValue("DISC_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("ACPT_INSPC_TYP")) {
						key.setACPT_INSPC_TYP(msgKey.getKeyValue("ACPT_INSPC_TYP"));
					}
					if(msgKeyType.containsKeyColumn("WS_NAME")) {
						key.setWS_NAME(msgKey.getKeyValue("WS_NAME"));
					}
					if(msgKeyType.containsKeyColumn("VEND_ANAME")) {
						key.setVEND_ANAME(msgKey.getKeyValue("VEND_ANAME"));
					}
					if(msgKeyType.containsKeyColumn("ROUND_TYP")) {
						key.setROUND_TYP(msgKey.getKeyValue("ROUND_TYP"));
					}
					if(msgKeyType.containsKeyColumn("CUR_CD")) {
						key.setCUR_CD(msgKey.getKeyValue("CUR_CD"));
					}
					if(msgKeyType.containsKeyColumn("CUR_NAME")) {
						key.setCUR_NAME(msgKey.getKeyValue("CUR_NAME"));
					}
					if(msgKeyType.containsKeyColumn("WORK_IN_PROC_COMMENT")) {
						key.setWORK_IN_PROC_COMMENT(msgKey.getKeyValue("WORK_IN_PROC_COMMENT"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_UNIT_QTY_TYP")) {
						key.seth_UNIT_QTY_TYP(msgKey.getKeyValue("h_UNIT_QTY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("h_PARENT_OD_NO")) {
						key.seth_PARENT_OD_NO(msgKey.getKeyValue("h_PARENT_OD_NO"));
					}
					if(msgKeyType.containsKeyColumn("h_COMPANY_CD")) {
						key.seth_COMPANY_CD(msgKey.getKeyValue("h_COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_ODR_START_DATE")) {
						key.seth_ODR_START_DATE(msgKey.getKeyValue("h_ODR_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("OD_NO")) {
						key.setOD_NO(msgKey.getKeyValue("OD_NO"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_DETAIL_NO")) {
						key.setJOB_ODR_DETAIL_NO(msgKey.getKeyValue("JOB_ODR_DETAIL_NO"));
					}
					if(msgKeyType.containsKeyColumn("h_JOB_ODR_CANCEL_NO")) {
						key.seth_JOB_ODR_CANCEL_NO(msgKey.getKeyValue("h_JOB_ODR_CANCEL_NO"));
					}
					if(msgKeyType.containsKeyColumn("DUE_DATE")) {
						key.setDUE_DATE(msgKey.getKeyValue("DUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("h_MODIFY_COUNT_OPR_INST")) {
						key.seth_MODIFY_COUNT_OPR_INST(msgKey.getKeyValue("h_MODIFY_COUNT_OPR_INST"));
					}
					if(msgKeyType.containsKeyColumn("OUTSIDE_TYP_DN")) {
						key.setOUTSIDE_TYP_DN(msgKey.getKeyValue("OUTSIDE_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP_DN")) {
						key.setMRP_ODR_TYP_DN(msgKey.getKeyValue("MRP_ODR_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("EXCH_TYP")) {
						key.setEXCH_TYP(msgKey.getKeyValue("EXCH_TYP"));
					}
					if(msgKeyType.containsKeyColumn("VEND_CUR_UNIT")) {
						key.setVEND_CUR_UNIT(msgKey.getKeyValue("VEND_CUR_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("h_VEND_DECIMAL_FIG")) {
						key.seth_VEND_DECIMAL_FIG(msgKey.getKeyValue("h_VEND_DECIMAL_FIG"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_CD_GNR_TYP")) {
						key.setOPR_INST_CD_GNR_TYP(msgKey.getKeyValue("OPR_INST_CD_GNR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("h_OD_NO")) {
						key.seth_OD_NO(msgKey.getKeyValue("h_OD_NO"));
					}
					if(msgKeyType.containsKeyColumn("WORK_ODR_DLV_DATE_BY_PROC_ALL")) {
						key.setWORK_ODR_DLV_DATE_BY_PROC_ALL(msgKey.getKeyValue("WORK_ODR_DLV_DATE_BY_PROC_ALL"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_START_DATE_BY_PROC_ALL")) {
						key.setOPR_INST_START_DATE_BY_PROC_ALL(msgKey.getKeyValue("OPR_INST_START_DATE_BY_PROC_ALL"));
					}
					if(msgKeyType.containsKeyColumn("h_WORK_STS_TYP")) {
						key.seth_WORK_STS_TYP(msgKey.getKeyValue("h_WORK_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("FINAL_PROC_FLG")) {
						key.setFINAL_PROC_FLG(msgKey.getKeyValue("FINAL_PROC_FLG"));
					}
					if(msgKeyType.containsKeyColumn("MODIFY_COUNT_BY_PROC")) {
						key.setMODIFY_COUNT_BY_PROC(msgKey.getKeyValue("MODIFY_COUNT_BY_PROC"));
					}
					if(msgKeyType.containsKeyColumn("h_BUSINESS_OPR_DATE")) {
						key.seth_BUSINESS_OPR_DATE(msgKey.getKeyValue("h_BUSINESS_OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("COMPANY_CD")) {
						key.setCOMPANY_CD(msgKey.getKeyValue("COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("CAL_DATE")) {
						key.setCAL_DATE(msgKey.getKeyValue("CAL_DATE"));
					}
					if(msgKeyType.containsKeyColumn("CAL_NO")) {
						key.setCAL_NO(msgKey.getKeyValue("CAL_NO"));
					}
					if(msgKeyType.containsKeyColumn("CHECK_DATE")) {
						key.setCHECK_DATE(msgKey.getKeyValue("CHECK_DATE"));
					}
					if(msgKeyType.containsKeyColumn("WS_PLANT_CD")) {
						key.setWS_PLANT_CD(msgKey.getKeyValue("WS_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("MODIFY_COUNT_OPR_INST")) {
						key.setMODIFY_COUNT_OPR_INST(msgKey.getKeyValue("MODIFY_COUNT_OPR_INST"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_START_DATE_BY_PROC_TIME")) {
						key.setOPR_INST_START_DATE_BY_PROC_TIME(msgKey.getKeyValue("OPR_INST_START_DATE_BY_PROC_TIME"));
					}
					if(msgKeyType.containsKeyColumn("WORK_ODR_DLV_DATE_BY_PROC_TIME")) {
						key.setWORK_ODR_DLV_DATE_BY_PROC_TIME(msgKey.getKeyValue("WORK_ODR_DLV_DATE_BY_PROC_TIME"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_START_DATE_BY_ITEM_ALL")) {
						key.setOPR_INST_START_DATE_BY_ITEM_ALL(msgKey.getKeyValue("OPR_INST_START_DATE_BY_ITEM_ALL"));
					}
					if(msgKeyType.containsKeyColumn("WORK_ODR_DLV_DATE_BY_ITEM_ALL")) {
						key.setWORK_ODR_DLV_DATE_BY_ITEM_ALL(msgKey.getKeyValue("WORK_ODR_DLV_DATE_BY_ITEM_ALL"));
					}
					if(msgKeyType.containsKeyColumn("LOWER_OD_NO")) {
						key.setLOWER_OD_NO(msgKey.getKeyValue("LOWER_OD_NO"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_TYP")) {
						key.setJOB_ODR_TYP(msgKey.getKeyValue("JOB_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_DLV_DATE")) {
						key.setJOB_ODR_DLV_DATE(msgKey.getKeyValue("JOB_ODR_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_DLV_DATE_TIME")) {
						key.setJOB_ODR_DLV_DATE_TIME(msgKey.getKeyValue("JOB_ODR_DLV_DATE_TIME"));
					}
					if(msgKeyType.containsKeyColumn("h_JOB_ODR_CD")) {
						key.seth_JOB_ODR_CD(msgKey.getKeyValue("h_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("MODIFY_COUNT_BY_ITEM")) {
						key.setMODIFY_COUNT_BY_ITEM(msgKey.getKeyValue("MODIFY_COUNT_BY_ITEM"));
					}
					if(msgKeyType.containsKeyColumn("TAX_NAME_1")) {
						key.setTAX_NAME_1(msgKey.getKeyValue("TAX_NAME_1"));
					}
					if(msgKeyType.containsKeyColumn("TAX_NAME_2")) {
						key.setTAX_NAME_2(msgKey.getKeyValue("TAX_NAME_2"));
					}
					if(msgKeyType.containsKeyColumn("TAX_NAME_3")) {
						key.setTAX_NAME_3(msgKey.getKeyValue("TAX_NAME_3"));
					}
					if(msgKeyType.containsKeyColumn("h_MANHOUR_TYP")) {
						key.seth_MANHOUR_TYP(msgKey.getKeyValue("h_MANHOUR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("h_ODR_START_DATE_ALL")) {
						key.seth_ODR_START_DATE_ALL(msgKey.getKeyValue("h_ODR_START_DATE_ALL"));
					}
					if(msgKeyType.containsKeyColumn("DUE_DATE_TIME")) {
						key.setDUE_DATE_TIME(msgKey.getKeyValue("DUE_DATE_TIME"));
					}
					if(msgKeyType.containsKeyColumn("TIME_CTRL")) {
						key.setTIME_CTRL(msgKey.getKeyValue("TIME_CTRL"));
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
