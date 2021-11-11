/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AD0010/src/com/nec/jp/orteus/metamorBase/AD0010/AD0010010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AD0010;

import com.nec.jp.orteus.metamorBase.AD0010.*;
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

import com.nec.jp.orteus.metamorBase.common.CollectNumber.CollectNumber;
import com.nec.jp.orteus.metamorBase.common01.util.Calculate;
import com.nec.jp.orteus.metamorBase.common04.amount.ExchRateControl;
import com.nec.jp.orteus.metamorBase.common04.amount.ExchRateStruct;
import com.nec.jp.orteus.metamorBase.common04.amount.CurControl;
import com.nec.jp.orteus.metamorBase.common04.amount.CurStruct;
import com.nec.jp.orteus.metamorBase.common04.amount.TaxStruct;
import com.nec.jp.orteus.metamorBase.common04.amount.TaxControl;
import com.nec.jp.orteus.metamorBase.common04.amount.AmountCalculator;
import com.nec.jp.orteus.metamorBase.common04.sysdata.HomeCurStruct;
import com.nec.jp.orteus.metamorBase.common04.sysdata.HomeCurControl;
import com.nec.jp.orteus.metamorBase.common04.util.DataNotFoundException;
import com.nec.jp.orteus.expj.pr.rcvissue.process.ValidateWh;

//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AD0010010Control
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

	//一覧部分の結果リストを画面に表示するためのリストインスタンス
	protected List list;

	// デフォルトアクセサメソッド
	//リストを返します。
	public List getList() { return this.list; }
	//リストをセットします。
	public void setList(List listname) { this.list = listname; }
	//リスト型のサイズを返します。
	public int getListsize() {
		int nret = 0;
		if( this.list != null ) {nret = this.list.size();}
		return nret;
	}
//	public Object getListvalue(int x) { return this.list.get(x); }	// リストの値を返します。
	//リストの値を返します。
	public AD0010010Struct getListvalue(int x) {
		return (AD0010010Struct)(this.list.get(x));
	}
	//Structを返します。
	public AD0010010Struct getStruct() { return this.struct; }
	//新しいStructを作って返します。
	public AD0010010Struct createStruct() { return new AD0010010Struct(); }
	//Structをセットします。
	public void setStruct(Object structname) {
		this.struct.setStruct((AD0010010Struct)structname);
	}
	//Structの値を初期化します。
	public void initializeStruct() { this.struct.initialize(); }

	// CSV出力用リスト
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }

//-----------------------------------------------------------------

	/** [コンボボックスデータ]情報（内外作区分） */
	private ComboStruct _outsideTypStruct = new ComboStruct();
	/** システムログメッセージ作成用 */
	private StringBuffer _sysLogMessage;

	/** 会社コード */
	String _companyCd = "";

	/** 日付処理用 */
	DateFormat _df = DateFormat.getDateInstance();
	/** 邦貨情報データクラス */
	HomeCurStruct _sysHomeCurStruct = new HomeCurStruct();

	/** 内外作区分(外作変更) 外作変更した後の表示画面制御用 */
	private String _outSideTyp = null;
	/**
	 * 内外作区分(外作変更)の設定
	 * @param outSideTyp 内外作区分(外作変更)
	 */
	public void setOutSideTyp(String outSideTyp){ 
		_outSideTyp = outSideTyp; 
	}
	/**
	 * 内外作区分(外作変更)の取得
	 * @return 内外作区分(外作変更)
	 */
	public String getOutSideTyp(){ 
		return _outSideTyp; 
	}

	/**
	 * Orteus標準Structの値を対象Structにコピーします。
	 * @param target コピー対象となるStruct
	 */
	public void setStandardItem(AD0010010Struct target){

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
	 * 業務ロジックのエラーメッセージ補助項目設定処理を切り出して関数化
	 * @param db1 データベース項目１
	 * @param value1 置換文字列１
	 */
	private void setSupportMessage(String db1, String value1) {
		_sysLogMessage = new StringBuffer();
		_sysLogMessage.append(db1);
		_sysLogMessage.append(":");
		_sysLogMessage.append(value1);
		ExpjMessage emsg = new ExpjMessage("ZZ01006", _sysLogMessage.toString());
		msgStruct.addInfo(emsg);
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

	// 20081222 ADD↓
	//---------- 日付変換 -------------------------------------------
	public Date StrngToDt(String in){
		Date out = null;
		SimpleDateFormat fm = new SimpleDateFormat("yyyy/MM/dd HH:mm");
		if(in == null) return out;
		try{
			if((out = fm.parse(in)) != null) return out;
		}catch(ParseException e){}
		return out;
	}
	
	public String DtToStrng(Date in)
	{
		SimpleDateFormat fm = new SimpleDateFormat("yyyy/MM/dd HH:mm");
		if(in == null) return null;
		return fm.format(in);
	}
	
	public String DtGetDate(Date in)
	{
		SimpleDateFormat fm = new SimpleDateFormat("yyyy/MM/dd");
		if(in == null) return null;
		return fm.format(in);
	}

	public String DtGetTime(Date in)
	{
		SimpleDateFormat fm = new SimpleDateFormat("HHmm");
		if(in == null) return null;
		return fm.format(in);
	}

	/** デバッグ用メッセージ作成用変数 */
    private String _debugMsg = "";
	// 20081222 ADD↑
	
	/** 時刻管理用フラグ */
	private String _flgTimeCtrl = null;
	
    /** EJa-ASPROVA連携オプション導入フラグ取得用 */
	private String _SysInstallOptions_ASP = null;

	/** クリア処理 */
	public void clear() {

		struct.setITEM_CD("");
		struct.setITEM_NAME("");
		struct.setDRAW_CD("");
		struct.setSPEC("");
		struct.setSTOCK_UNIT("");
		struct.setJOB_ODR_CD("");
		struct.setMRP_ODR_TYP_DN("");
		struct.setMRP_ODR_TYP("");
		struct.setOPR_RSLT_TYP_DN("");
		struct.setOPR_RSLT_TYP("");
		struct.setWORK_ODR_DLV_DATE("");
		struct.setWORK_ODR_DLV_DATE_TIME("");
		struct.setOPR_INST_START_DATE("");
		struct.setOPR_INST_START_DATE_TIME("");
		struct.setOPR_INST_QTY("0.0");
		struct.setOPR_INST_CD("");
		struct.setWS_CD("");
		struct.setWS_NAME("");
		struct.setWORK_IN_PROC_COMMENT("");
		
		struct.seth_OPR_INST_QTY("");
		struct.seth_WORK_ODR_CD("");

		struct.setOUTSIDE_TYP("1"); //内外作区分
		_outSideTyp = "";
		
		struct.setTIME_CTRL(_flgTimeCtrl);
// 2008/09/08 ADD START 土田
		struct.seth_MANHOUR_TYP("");
// 2008/09/08 ADD END 土田

	}
	/** クリア処理 */
	public void clearAll() {
		clear();
		struct.setWORK_ODR_CD("");

		setReadStatus(INITIAL);
	}
	
	/** Structのcopy */
	public void copyStruct(AD0010010Struct target) {
		struct.setWORK_ODR_CD(target.getWORK_ODR_CD());
		struct.setITEM_CD(target.getITEM_CD());
		struct.setITEM_NAME(target.getITEM_NAME());
		struct.setDRAW_CD(target.getDRAW_CD());
		struct.setSPEC(target.getSPEC());
		struct.seth_UNIT_QTY_TYP(target.geth_UNIT_QTY_TYP());
		struct.setSTOCK_UNIT(target.getSTOCK_UNIT());
		struct.setWS_CD(target.getWS_CD());
		struct.setWS_NAME(target.getWS_NAME());
		struct.setOPR_INST_START_DATE(target.getOPR_INST_START_DATE());
		struct.setOPR_INST_START_DATE_TIME(target.getOPR_INST_START_DATE_TIME());
		struct.setWORK_ODR_DLV_DATE(target.getWORK_ODR_DLV_DATE());
		struct.setWORK_ODR_DLV_DATE_TIME(target.getWORK_ODR_DLV_DATE_TIME());
		struct.setOPR_INST_QTY(target.getOPR_INST_QTY());
		struct.seth_OPR_INST_QTY(target.getOPR_INST_QTY());
		struct.setWORK_IN_PROC_COMMENT(target.getWORK_IN_PROC_COMMENT());
		struct.setOPR_INST_CD(target.getOPR_INST_CD());
		struct.setMRP_ODR_TYP(target.getMRP_ODR_TYP());
		struct.setMRP_ODR_TYP_DN(target.getMRP_ODR_TYP_DN());
		struct.setOPR_RSLT_TYP(target.getOPR_RSLT_TYP());
		struct.setOPR_RSLT_TYP_DN(target.getOPR_RSLT_TYP_DN());
		struct.setJOB_ODR_CD(target.getJOB_ODR_CD());
		struct.seth_JOB_ODR_DLV_DATE(target.geth_JOB_ODR_DLV_DATE());
		struct.seth_JOB_ODR_DLV_DATE_TIME(target.geth_JOB_ODR_DLV_DATE_TIME());
		struct.seth_PARENT_OD_NO(target.geth_PARENT_OD_NO());
		struct.seth_DUE_DATE(target.geth_DUE_DATE());
		struct.seth_DUE_DATE_TIME(target.geth_DUE_DATE_TIME());
		struct.seth_BUSINESS_OPR_DATE(target.geth_BUSINESS_OPR_DATE());
		struct.seth_MODIFY_COUNT(target.geth_MODIFY_COUNT());
		struct.setODR_START_DATE(target.getODR_START_DATE());
		struct.seth_ODR_START_DATE(target.geth_ODR_START_DATE());
		struct.seth_ODR_START_DATE_TIME(target.geth_ODR_START_DATE_TIME());
		struct.setOUTSIDE_TYP(target.getOUTSIDE_TYP());
		struct.seth_SUB_FLG(target.geth_SUB_FLG());
		struct.seth_flg(target.geth_flg());
		struct.setPLANT_CD(target.getPLANT_CD());
		struct.seth_OPR_INST_QTY(target.geth_OPR_INST_QTY());
		struct.seth_WORK_ODR_CD(target.geth_WORK_ODR_CD());
		struct.setTIME_CTRL(_flgTimeCtrl);
// 2008/09/08 ADD START 土田
		struct.seth_MANHOUR_TYP(target.geth_MANHOUR_TYP());
// 2008/09/08 ADD END 土田
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
	
	/**
     * 稼働日演算処理を日付文字列で使えるようにした委譲メソッドです。
     * @param dateString 日付文字列
     * @return 演算結果の日付文字列
     * @throws FoundationException 共通部品処理で失敗
     * @throws ParseException 型変換に失敗
     */
    private String calcWorkDay(String dateString, String timeString, String ltString, boolean flg)
     throws FoundationException, ParseException {
     // DateFormatを準備
     //DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
     // 型変換
     //Date date = df.parse(dateString);

     // 渡されてきた時刻をhh24:mi:ss形式に整える
     timeString = timeString.substring(0,2) + ":" + timeString.substring(2) + ":00";

     // 引数の年月日と形式を整えた時刻を結合し、日付型に変換する
     Date date = Converter.strToDate(dateString + " " + timeString, "yyyy/MM/dd HH:mm:ss");
     int lt = Integer.parseInt(ltString);
   
     // 稼働日共通部品を生成し、チェック処理を実行
     WorkCalendar wc =
      new WorkCalendar(conn, sysUSER_CD, sp.getProcId(), struct.getPLANT_CD(),struct.getITEM_CD(), date, lt, flg);
     Date resultDate = wc.calcDate();

     if (resultDate == null || "".equals(resultDate)){
    	 return ""; 
     }
     // 自動算出された日付を文字型に変換して保持する
     String tidydate = Converter.dateToStr(resultDate, "yyyy/MM/dd HH:mm:ss");

     // 自動算出された日付をyyyy/mm/dd hh24mi形式に整える
     tidydate = tidydate.substring(0,10) + tidydate.substring(10,13) + tidydate.substring(14,16);

     //return df.format(tidydate);
     return tidydate;
    }
	

        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * 読込ボタン押下時に実行される処理です。
	 *
	 */
	public void controlSelect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0010");
		logger.entering("AD0010010Control"+":USER="+struct.getsUser_ID(),"controlSelect");
			//{{user_implement_dev:<controlSelect>


		try {
			//画面上の項目値をクリアする
			clear();
			
			//サーバー側チェック
			
			//作業計画番号チェック
			List workOdrCdList = entity.mCheckWORK_IN_PROC_BY_ITEM.read(conn, struct);
			if (workOdrCdList == null || workOdrCdList.size() <= 0) {
				setErrorMessage("ZZ06001");
				setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WORK_ODR_CD", 
						this.struct.getWORK_ODR_CD());//作業計画番号
				setReadStatus(ERROR);
				return;
			}
			
			List selectList = entity.mSelect.read(conn, struct);
			if (selectList == null || selectList.size() <= 0) {
				//データが存在しない
				setErrorMessage("ZZ01101");
				setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WORK_ODR_CD", 
						this.struct.getWORK_ODR_CD());//作業計画番号
				setReadStatus(ERROR);
				return;
			}
			AD0010010Struct selectStruct = (AD0010010Struct)selectList.get(0);
			setStandardItem(selectStruct);
			
			//品目別作業状態区分チェック
			if ("1".equals(selectStruct.getWORK_STS_TYP())) {
			} else {
				setErrorMessage("ZZ06001");
				setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WORK_ODR_CD",
						this.struct.getWORK_ODR_CD());//作業計画番号
				setReadStatus(ERROR);
				return;
			}
			
			//作業系列展開済みフラグチェック
			if ("1".equals(selectStruct.getPROC_EXPLOSION_FLG())) {
				setErrorMessage("ZZ06001");
				setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WORK_ODR_CD",
						this.struct.getWORK_ODR_CD());//作業計画番号
			}
			
			if (!selectStruct.getPLANT_CD().equals(this.sysPLANT_CD)) {
				//工場コードチェック
				setErrorMessage("AD00006");
				setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WORK_ODR_CD", 
						this.struct.getWORK_ODR_CD());//作業計画番号
				setWarningSysLogMessage("PLANT_CD", this.sysPLANT_CD);//工場コード
			}
			
			// エラーがあれば終了
			if (msgStruct.hasError()) {
				return;
			}
			
			
			//製番品目の場合
			if (selectStruct.getJOB_ODR_CD() == null 
					|| selectStruct.getJOB_ODR_CD().equals("")) {
			} else {
				//下位部品
				List jobOdrList = entity.mSelectChild.read(conn, selectStruct);
				if (jobOdrList == null || jobOdrList.size() <= 0) {
					//データが存在しない場合、下位部品が存在しない「0」
					selectStruct.seth_SUB_FLG("0");
				} else {
					selectStruct.seth_SUB_FLG("1");
				}
				//製番納期の取得
				jobOdrList = entity.mselectJOB_ODR_DLV_DATE.read(conn, selectStruct);
				if (jobOdrList == null || jobOdrList.size() <= 0) {
					//データが存在しない
					setErrorMessage("ZZ01101");
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WORK_ODR_CD", 
							this.struct.getWORK_ODR_CD());//作業計画番号
					return;
				} else {
					AD0010010Struct jobOdrStruct = (AD0010010Struct)jobOdrList.get(0);
					setStandardItem(jobOdrStruct);
					selectStruct.seth_JOB_ODR_DLV_DATE(jobOdrStruct.geth_JOB_ODR_DLV_DATE());
					selectStruct.seth_JOB_ODR_DLV_DATE_TIME(jobOdrStruct.geth_JOB_ODR_DLV_DATE_TIME());
				}
			}


			//業務運用日の取得
			selectStruct.setPLANT_CD(this.sysPLANT_CD);
			List oprDateList = entity.mselectBUSINESS_OPR_DATE.read(conn,selectStruct);
			if (oprDateList == null || oprDateList.size() <= 0) {
				//データが存在しない
				setErrorMessage("ZZ01101");
				setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WORK_ODR_CD", 
						this.struct.getWORK_ODR_CD());//作業計画番号
				setReadStatus(ERROR);
				return;
			}
			AD0010010Struct oprDateStruct = (AD0010010Struct)oprDateList.get(0);
			setStandardItem(oprDateStruct);
			selectStruct.seth_BUSINESS_OPR_DATE(oprDateStruct.geth_BUSINESS_OPR_DATE());
			
			selectStruct.seth_OPR_INST_QTY(selectStruct.getOPR_INST_QTY());
			selectStruct.seth_WORK_ODR_CD(selectStruct.getWORK_ODR_CD());
			//内外作区分の表示は内作固定
			selectStruct.setOUTSIDE_TYP("1");
			
			//品目手配区分と作業実績区分の説明取得（コンボボックス値）
			selectStruct.setMRP_ODR_TYP_DN(multcombo("MRP_ODR_TYP",selectStruct.getMRP_ODR_TYP()));
			selectStruct.setOPR_RSLT_TYP_DN(multcombo("OPR_RSLT_TYP",selectStruct.getOPR_RSLT_TYP()));
			
			//時刻管理しないときは時刻を表示しない
			if(!(struct.getTIME_CTRL()).equals("true")){
				selectStruct.setWORK_ODR_DLV_DATE_TIME("");
				selectStruct.setOPR_INST_START_DATE_TIME("");
			}
							
			copyStruct(selectStruct);

			
			setReadStatus(NORMAL);

		} catch (SQLException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			throw new ExpjException(e, emsg);
		}


                //}}user_implement_dev:<controlSelect>
		logger.exiting("AD0010010Control"+":USER="+struct.getsUser_ID(),"controlSelect");

		return;
	}

	/**
	 * 登録ボタン押下時に実行される処理です。
	 *
	 */
	public void controlInsert() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0010");
		logger.entering("AD0010010Control"+":USER="+struct.getsUser_ID(),"controlInsert");
			//{{user_implement_dev:<controlInsert>


		try {
			//サーバー側チェック	
			
			String WORK_ODR_DLV_DATE_TIME = "0000";		//品目別製造納期用
			String OPR_INST_START_DATE_TIME = "0000";	//品目別製造着手日用
			
			//入力時刻のチェック(時刻管理する場合のみ)
			if((struct.getTIME_CTRL()).equals("true")){
				WORK_ODR_DLV_DATE_TIME = struct.getWORK_ODR_DLV_DATE_TIME();
				//①品目別製造納期(時刻)のチェック
				if((WORK_ODR_DLV_DATE_TIME).length() == 0 ){
					//Nullは2359に設定
					WORK_ODR_DLV_DATE_TIME = "2359";
				}else if((WORK_ODR_DLV_DATE_TIME).length() == 3 ){
					//３桁は頭に０を付ける
					WORK_ODR_DLV_DATE_TIME = "0" + WORK_ODR_DLV_DATE_TIME;
				}
				
				
				//②品目別製造着手日(時刻)のチェック
				if( (struct.getOPR_INST_START_DATE()).equals("") && (struct.getOPR_INST_START_DATE_TIME()).equals("") ){	//NULLの場合は自動算出
				}else{
					OPR_INST_START_DATE_TIME = struct.getOPR_INST_START_DATE_TIME();
					if((OPR_INST_START_DATE_TIME).length() == 0 ){
						//Nullは2359に設定
						OPR_INST_START_DATE_TIME = "2359";
					}else if((OPR_INST_START_DATE_TIME).length() == 3 ){
						//３桁は頭に０を付ける
						OPR_INST_START_DATE_TIME = "0" + OPR_INST_START_DATE_TIME;
					}
				}
			}
			
			
			//入力された[品目番号]値が[品目]に存在しない場合エラー
			List itemList = entity.mselectM_ITEM_CD.read(conn,struct);
			if (itemList == null || itemList.size() <= 0) {
				setErrorMessage("AD30825");
				setWarningSysLogMessage("M_ITEM.ITEM_CD", 
						this.struct.getITEM_CD());//品目番号
				return;
			}
		
			//入力された[品目]の品目手配区分が1,2,3,8の場合エラー
			AD0010010Struct itemStruct = (AD0010010Struct)itemList.get(0);
			setStandardItem(itemStruct);
			if ("1".equals(itemStruct.getMRP_ODR_TYP()) 
					|| "2".equals(itemStruct.getMRP_ODR_TYP()) 
					|| "3".equals(itemStruct.getMRP_ODR_TYP()) 
					|| "8".equals(itemStruct.getMRP_ODR_TYP())) {
				setErrorMessage("AD32217");
				setWarningSysLogMessage("M_ITEM.ITEM_CD", 
						this.struct.getITEM_CD());//品目番号
				setWarningSysLogMessage("M_ITEM.MRP_ODR_TYP", 
						itemStruct.getMRP_ODR_TYP());//品目手配区分
			}
			
			//[品目].“作業実績区分” が 2：作業指示実績 で、「作業区コード」 が入力されたいる場合
			if("2".equals(itemStruct.getOPR_RSLT_TYP()) && !"".equals(struct.getWS_CD())){
				setErrorMessage("AD00227");
				return;
			}
			// 品目対応したカレンダー番号存在した場合、カレンダー明細の存在性チェック
			List calList = entity.mSelectM_CAL3.read(conn,struct);
			if(!calList.isEmpty() &&  (((AD0010010Struct)calList.get(0)).getCAL_NO()== null
					|| "".equals(((AD0010010Struct)calList.get(0)).getCAL_NO()))) {
				// カレンダ明細データが存在しません。
				setErrorMessage("ZZ06002");
				setWarningSysLogMessage("ITEM_CD", struct.getITEM_CD());
				return;
			}

			//入力された製造納期が休日だった場合エラー
			Date dateWorkOdrDlvDate = _df.parse(this.struct.getWORK_ODR_DLV_DATE());
			String strWorkOdrDlvDate = Converter.dateToStr(dateWorkOdrDlvDate, "yyyy/MM/dd");
			this.struct.setDATE(strWorkOdrDlvDate);
			this.struct.setPLANT_CD(getsysPLANT_CD());
			//品目番号を検索キーとして読込
			List dateList = entity.mSelectM_CAL1.read(conn,struct);
			if (dateList == null || dateList.size() <= 0) {
				//工場コードを検索キーとして読込
				dateList = entity.mselectM_CAL.read(conn,struct);
				if(dateList == null || dateList.size() <= 0){
					//データが存在しない
					setErrorMessage("ZZ01101");
					setWarningSysLogMessage("M_PLANT.PLANT_CD", this.struct.getPLANT_CD());
					setWarningSysLogMessage("M_CAL.CAL_DATE",
						this.struct.getWORK_ODR_DLV_DATE());//製造納期
						return;
				}else{
					AD0010010Struct dateStruct = (AD0010010Struct)dateList.get(0);
					setStandardItem(dateStruct);
					if ("1".equals(dateStruct.getHOLIDAY_FLG())) {
						setErrorMessage("AD00036");
						setWarningSysLogMessage("M_PLANT.PLANT_CD", this.struct.getPLANT_CD());
						setWarningSysLogMessage("M_CAL.CAL_DATE", 
						this.struct.getWORK_ODR_DLV_DATE());//製造納期
						return;
					}
				}
			}else{
				AD0010010Struct dateStruct = (AD0010010Struct)dateList.get(0);
				setStandardItem(dateStruct);
				if ("1".equals(dateStruct.getHOLIDAY_FLG())) {
					setErrorMessage("AD00036");
					setWarningSysLogMessage("M_ITEM.ITEM_CD", this.struct.getITEM_CD());
					setWarningSysLogMessage("M_CAL.CAL_DATE",
						this.struct.getWORK_ODR_DLV_DATE());//製造納期
					return;
				}
			}

			//着手日のチェック
			if (this.struct.getOPR_INST_START_DATE() == null 
					|| "".equals(this.struct.getOPR_INST_START_DATE())) {

				// 20081222 MOD↓
				// EJa-ASPROVA連携オプション導入の場合
				if("1".equals(_SysInstallOptions_ASP)){	
					String prop_lot = "1";
					List ltList = entity.mselectLT.read(conn,struct);
					if (ltList == null || ltList.size() == 0) {
						//データが存在しない
						setErrorMessage("ZZ01101");
						setWarningSysLogMessage("M_PLANT.PLANT_CD", this.struct.getPLANT_CD());
						setWarningSysLogMessage("M_CAL.CAL_DATE", 
								this.struct.getOPR_INST_START_DATE());//製造着手日
					} else {
						AD0010010Struct ltStruct = (AD0010010Struct)ltList.get(0);
						prop_lot = ltStruct.getPROP_LOT_SIZE();
					}
					
		        	 String sWkDate, sShiftMin,sWkTime ;
		        	
						 ATAspBom ab = new ATAspBom(conn, this.sysPLANT_CD, 
								this.sysUSER_CD, 
								this.getProgramId());
						 ATWorkCalendar atWC = new ATWorkCalendar(conn, 
								this.sysUSER_CD , 
								this.getProgramId(), 
								this.sysPLANT_CD) ;
					 Date odrStartDate = null;		  // 手配着手日
					 Date prdStartDate = null;		  // 製造着手日
					 Date prdDueDate = null;		  // 製造納期
					 Date dueDate = null;		  	// 要求納期
	
					//製造納期が決定の状態
					prdDueDate = StrngToDt(this.struct.getWORK_ODR_DLV_DATE() + " " + (WORK_ODR_DLV_DATE_TIME).substring(0,2) + ":" + (WORK_ODR_DLV_DATE_TIME).substring(2,4));
					//■CHG 20081208 要求納期のLTシフト(＋)-----------------------------
					sShiftMin = ab.getIssueLtMin(struct.getITEM_CD(),"U");
					dueDate = atWC.calcShiftMinute(prdDueDate, sShiftMin, ATWorkCalendar.SHIFT_END);	//Conv
					sWkDate =DtToStrng(dueDate);
					struct.seth_DUE_DATE(sWkDate);
					//-------------------------------------20081208
					//■CHG 20081208 製造着手日LTシフト(－)-----------------------------
					 //strOprInstQty, prop_lot
					//作業指示数を切り上げ処理する
					BigDecimal StrOprInstQty = new BigDecimal(this.struct.getOPR_INST_QTY());
					BigDecimal OprInstQty = StrOprInstQty.setScale(0, BigDecimal.ROUND_UP);
					String strOprInstQty = OprInstQty.toString();
					
					sShiftMin = ab.getProdLtMin(struct.getITEM_CD(),strOprInstQty,prop_lot,"U");
					sShiftMin = Calculate.multiply(sShiftMin,"-1"); //過去へ
					prdStartDate = atWC.calcShiftMinute(prdDueDate, sShiftMin, ATWorkCalendar.SHIFT_START);	//Conv
					sWkDate =DtGetDate(prdStartDate);
					sWkTime =DtGetTime(prdStartDate);
					this.struct.setOPR_INST_START_DATE(sWkDate);
					this.struct.setOPR_INST_START_DATE_TIME(sWkTime);
					OPR_INST_START_DATE_TIME = sWkTime;
					//-------------------------------------20081208
					//■CHG 20081208 手配着手日LTシフト(－)-----------------------------				
					sShiftMin = ab.getOdrLtMin(struct.getITEM_CD(),"U");
					sShiftMin = Calculate.multiply(sShiftMin,"-1"); //過去へ
					odrStartDate = atWC.calcShiftMinute(prdStartDate, sShiftMin, ATWorkCalendar.SHIFT_START);	//Conv
					sWkDate =DtToStrng(odrStartDate);
					struct.seth_ODR_START_DATE(sWkDate);
					//-------------------------------------20081208	
		            _debugMsg = ("(AD0010/EJa-ASP)TIME: "
		            	   + "DUE_DATE" + "[" + this.struct.geth_DUE_DATE() + "]," 
		         		   + "WORK_ODR_DLV_DATE" + "[" + this.struct.getWORK_ODR_DLV_DATE() + "],"  
		         		   + "OPR_INST_START_DATE" + "[" + this.struct.getOPR_INST_START_DATE() + "],"  
		         		   + "ODR_START_DATE" + "[" + struct.geth_ODR_START_DATE() + "] " );
			        sysLog.info("ZZ01006",struct.getsUser_ID(), _debugMsg );
			        //-------------------------------------20081208	 
	     
				}else{	
					//着手日の自動計算
					List ltList = entity.mselectLT.read(conn,struct);
					if (ltList == null || ltList.size() == 0) {
						//データが存在しない
						setErrorMessage("ZZ01101");
						setWarningSysLogMessage("M_PLANT.PLANT_CD", this.struct.getPLANT_CD());
						setWarningSysLogMessage("M_CAL.CAL_DATE", 
								this.struct.getOPR_INST_START_DATE());//製造着手日
	
					} else {
						AD0010010Struct ltStruct = (AD0010010Struct)ltList.get(0);
						setStandardItem(ltStruct);
						String fixed = ltStruct.getFIXED_LT();
						String prop = ltStruct.getPROP_LT();
						String safety = ltStruct.getSAFETY_LT();
						String prop_lot = ltStruct.getPROP_LOT_SIZE();
						//作業指示数を切り上げ処理する
						String itemLt = Calculate.divide(struct.getOPR_INST_QTY(), prop_lot, 0, Calculate._CEIL);
						//品目のリードタイム
						itemLt = Calculate.multiply(itemLt, prop);
						itemLt = Calculate.add(itemLt, fixed);
						itemLt = Calculate.add(itemLt, safety);
						itemLt = Calculate.multiply(itemLt, "-1");
						//着手日を自動計算する
						String StrOprInstStartDate = calcWorkDay(struct.getWORK_ODR_DLV_DATE(),WORK_ODR_DLV_DATE_TIME, itemLt, true);

						if(StrOprInstStartDate == null){
							// 業務日付の取得に失敗しました。
							setErrorMessage("KQ00026");
							setWarningSysLogMessage("M_PLANT.PLANT_CD", this.struct.getPLANT_CD());
							setWarningSysLogMessage("M_CAL.CAL_DATE", struct.getWORK_ODR_DLV_DATE());//製造納期
							return;
						} else {
							this.struct.setOPR_INST_START_DATE(StrOprInstStartDate.substring(0,10));
							OPR_INST_START_DATE_TIME = StrOprInstStartDate.substring(11,15);
						}
					}
				     // 20081222 MOD↑ 
				}	
				
				
			} else {

				//入力された製造着手日が休日だった場合エラー
				Date dateOprInstStartDate = _df.parse(this.struct.getOPR_INST_START_DATE());
				String strOprInstStartDate =
						Converter.dateToStr(dateOprInstStartDate, "yyyy/MM/dd");
				this.struct.setDATE(strOprInstStartDate);
				this.struct.setPLANT_CD(getsysPLANT_CD());
				//品目番号を検索キーとして読込
				List dateList2 = entity.mSelectM_CAL1.read(conn,struct);
				if (dateList2 == null || dateList2.size() == 0) {
					//工場コードを検索キーとして読込
					dateList2 = entity.mselectM_CAL.read(conn,struct);
					if(dateList2 == null || dateList2.size() <= 0){
						//データが存在しない
						setErrorMessage("ZZ01101");
						setWarningSysLogMessage("M_PLANT.PLANT_CD", this.struct.getPLANT_CD());
						setWarningSysLogMessage("M_CAL.CAL_DATE", 
							this.struct.getOPR_INST_START_DATE());//製造着手日
						return;
				} else {
					AD0010010Struct dateStruct2 = (AD0010010Struct)dateList2.get(0);
					setStandardItem(dateStruct2);
					if ("1".equals(dateStruct2.getHOLIDAY_FLG())) {
						setErrorMessage("AD00038");
						setWarningSysLogMessage("M_PLANT.PLANT_CD", this.struct.getPLANT_CD());
						setWarningSysLogMessage("M_CAL.CAL_DATE", 
								this.struct.getOPR_INST_START_DATE());//製造着手日
						return;
					}
				}
				}else{
					AD0010010Struct dateStruct2 = (AD0010010Struct)dateList2.get(0);
					setStandardItem(dateStruct2);
				if ("1".equals(dateStruct2.getHOLIDAY_FLG())) {
					setErrorMessage("AD00038");
					setWarningSysLogMessage("M_ITEM.ITEM_CD", this.struct.getITEM_CD());
					setWarningSysLogMessage("M_CAL.CAL_DATE",
						this.struct.getOPR_INST_START_DATE());//製造着手日
					return;
				}
			}
			}

			//「作業実績区分」が１(出来高実績)以外の場合で、
			// 作業指示番号を入力した場合エラー
			if (!"1".equals(itemStruct.getOPR_RSLT_TYP())) {
				if (this.struct.getOPR_INST_CD() != null 
						|| "".equals(this.struct.getOPR_INST_CD()) == false) {
				 } else {
					setErrorMessage("AD00003");
					setWarningSysLogMessage("M_ITEM.ITEM_CD", 
							this.struct.getITEM_CD());//品目番号
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.OPR_RSLT_TYP", 
							itemStruct.getOPR_RSLT_TYP());//作業実績区分
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.OPR_INST_CD", 
							this.struct.getOPR_INST_CD());//作業指示番号

				}
			}

			//「作業実績区分」が１(出来高実績)で、作業区コードがNULLの場合エラー
			if ("1".equals(itemStruct.getOPR_RSLT_TYP())
					&& (this.struct.getWS_CD() == null 
					|| "".equals(this.struct.getWS_CD()))) {
				setErrorMessage("AD30041");
				setWarningSysLogMessage("M_ITEM.ITEM_CD", 
						this.struct.getITEM_CD());//品目番号
				setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.OPR_RSLT_TYP", 
						itemStruct.getOPR_RSLT_TYP());//作業実績区分
				return;
			}

			//作業区がNULL以外の場合
			if (struct.getWS_CD() != null && !"".equals(struct.getWS_CD())) {
				List wsCdList = entity.mreadWS_CD.read(conn,struct);
				if (wsCdList == null || wsCdList.size() == 0) {
					setErrorMessage("AD20029");
					setWarningSysLogMessage("M_ITEM.ITEM_CD", 
							this.struct.getITEM_CD());//品目番号
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.OPR_RSLT_TYP", 
							itemStruct.getOPR_RSLT_TYP());//作業実績区分
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WS_CD", 
							this.struct.getWS_CD());//作業区コード

				} else {
					//ユーザの所属する工場コードと、
					//入力した作業区コードの工場コードが異なる場合エラー
					AD0010010Struct wsCdStruct = (AD0010010Struct)wsCdList.get(0);
					setStandardItem(wsCdStruct);
					if (!this.sysPLANT_CD.equals(wsCdStruct.getPLANT_CD())) {
						setErrorMessage("AD00004");
						setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WS_CD", 
								this.struct.getWS_CD());//作業区コード
						setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.PLANT_CD", 
								this.sysPLANT_CD);//ユーザの所属する工場コード

					}
				}
			}

			//[品目].在庫数量単位区分=1で「作業指示数」に小数が入力された場合、
			//切り上げ処理をする
			BigDecimal OprInstQty_up = new BigDecimal(this.struct.getOPR_INST_QTY());
			if ("1".equals(itemStruct.geth_UNIT_QTY_TYP())) {
				BigDecimal OprInstQty2 = new BigDecimal("0");
				OprInstQty2 = OprInstQty_up.setScale(0,BigDecimal.ROUND_UP);
				//切り上げ処理前と後で値が異なっていたら
				//小数が入力されていたと判断しワーニング
				if ( OprInstQty_up.doubleValue() != OprInstQty2.doubleValue()) { 
					setWarningMessage("AD00043");
					setWarningSysLogMessage("M_ITEM.ITEM_CD", 
							this.struct.getITEM_CD());//品目番号
					setInfoSysLogMessage("T_WORK_IN_PROC_BY_ITEM.OPR_INST_QTY", 
							this.struct.getOPR_INST_QTY());//作業指示数
				}
				//品目が整数管理品の場合、切上げを行う
				OprInstQty_up = OprInstQty_up.setScale(0, BigDecimal.ROUND_UP);
			}
			this.struct.setOPR_INST_QTY(OprInstQty_up.toString());


			// エラーがあれば終了
			if (msgStruct.hasError()) {
				return;
			}


			//レコード登録

			//所要量のオーダ情報の追加、所要量の下位デマンドの追加
			// 20081222 MOD↓
			 // EJa-ASPROVA連携オプション導入の場合
			String odNoString;
			 if("1".equals(_SysInstallOptions_ASP)){	
					ATCommonOd od = 
						new ATCommonOd(conn,
							this.sysPLANT_CD,
							this.sysUSER_CD,
							this.sp.getProcId());
					
						//オーダーデマンド番号をセットする
						odNoString = 
						od.addOdInfo(this.struct.getITEM_CD(),
							Converter.strToDate(
								struct.getWORK_ODR_DLV_DATE() + " " + WORK_ODR_DLV_DATE_TIME, Converter.SLASH_DATE_HOUR_MINUTE),
							Converter.strToDate(
								struct.getOPR_INST_START_DATE() + " " + OPR_INST_START_DATE_TIME, Converter.SLASH_DATE_HOUR_MINUTE),
							Double.parseDouble(this.struct.getOPR_INST_QTY()),
							3,
							new Integer(this.struct.getOUTSIDE_TYP()).intValue());

			 }else{
					CommonOd od = 
						new CommonOd(conn,
							this.sysPLANT_CD,
							this.sysUSER_CD,
							this.sp.getProcId());
				//オーダーデマンド番号をセットする
				odNoString = 
				od.addOdInfo(this.struct.getITEM_CD(),
					Converter.strToDate(
						struct.getWORK_ODR_DLV_DATE() + " " + WORK_ODR_DLV_DATE_TIME, Converter.SLASH_DATE_HOUR_MINUTE),
					Converter.strToDate(
						struct.getOPR_INST_START_DATE() + " " + OPR_INST_START_DATE_TIME, Converter.SLASH_DATE_HOUR_MINUTE),
					Double.parseDouble(this.struct.getOPR_INST_QTY()),
					3);
			 }
			// 20081222 MOD↑

			this.struct.setOD_NO(odNoString);

			//作業計画番号の採番
			CollectNumber ODR_CD = 
					new CollectNumber(CollectNumber.ODR_CD,
						this.sysUSER_CD, 
						this.sp.getProcId(),
						this.sysPLANT_CD);
			String strOdrCd = ODR_CD.getNo();
			if (strOdrCd == null || "".equals(strOdrCd)) {
				//採番失敗
				setErrorMessage("ZZ01106");
				return;
			} else {
				this.struct.setWORK_ODR_CD(strOdrCd);
			}

			//作業実績区分が１の場合、作業指示伝票作成。
			if ("1".equals(itemStruct.getOPR_RSLT_TYP())) {
				this.struct.setOPR_INST_CD(null);
				if (this.struct.getOPR_INST_CD() == null 
						|| "".equals(this.struct.getOPR_INST_CD())) {
					//作業指示番号の採番
					CollectNumber OPR_INST_CD = 
							new CollectNumber(CollectNumber.INST_CD,
								this.sysUSER_CD, 
								this.sp.getProcId(), 
								this.sysPLANT_CD);
					String strOprInstCd = OPR_INST_CD.getNo();
					if (strOprInstCd == null || "".equals(strOprInstCd)) {
						//採番失敗
						setErrorMessage("ZZ01106");
						return;
					} else {
						this.struct.setOPR_INST_CD(strOprInstCd);
						//作業指示番号が[作業指示伝票]に存在した場合エラー
						List oprInstCdList = entity.mreadOPR_INST_CD.read(conn,struct);
						if (oprInstCdList == null || oprInstCdList.size() <= 0) {
						} else {
							setErrorMessage("AD32213");
							setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.OPR_INST_CD", 
									this.struct.getOPR_INST_CD());//作業指示番号
							return;
						}

					}
				}
				this.struct.setPLANT_CD(this.sysPLANT_CD);
				entity.minsertT_OPR_INST_SLIP.create(conn, struct);
			}


			//品目別仕掛の追加時の一意制約チェック
			List workOdrCdList = entity.mCheckWORK_IN_PROC_BY_ITEM.read(conn, struct);
			if (workOdrCdList != null && workOdrCdList.size() > 0) {
				setErrorMessage("ZZ01102");
				setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WORK_ODR_CD",
						this.struct.getWORK_ODR_CD());//作業計画番号
				setReadStatus(ERROR);
				return;
			}

			//品目別仕掛の追加
			this.struct.setOPR_RSLT_TYP(itemStruct.getOPR_RSLT_TYP());
			struct.setOPR_INST_START_DATE_ALL(struct.getOPR_INST_START_DATE() + " " + OPR_INST_START_DATE_TIME );
			struct.setWORK_ODR_DLV_DATE_ALL(struct.getWORK_ODR_DLV_DATE() + " " + WORK_ODR_DLV_DATE_TIME );
			int nRet = entity.minsert.create(conn, struct);

			conn.commit();

			//画面の再検索
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


                //}}user_implement_dev:<controlInsert>
		logger.exiting("AD0010010Control"+":USER="+struct.getsUser_ID(),"controlInsert");

		return;
	}

	/**
	 * 更新ボタン押下時に実行される処理です。
	 *
	 */
	public void controlUpdate() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0010");
		logger.entering("AD0010010Control"+":USER="+struct.getsUser_ID(),"controlUpdate");
			//{{user_implement_dev:<controlUpdate>


		try {			
			_outSideTyp = "";
			//サーバー側チェック
			String WORK_ODR_DLV_DATE_TIME = "0000";		//品目別製造納期用
			String OPR_INST_START_DATE_TIME = "0000";	//品目別製造着手日用
			
			//入力時刻のチェック(時刻管理する場合のみ)
			if((struct.getTIME_CTRL()).equals("true")){
				WORK_ODR_DLV_DATE_TIME = struct.getWORK_ODR_DLV_DATE_TIME();
				//①品目別製造納期(時刻)のチェック
				//(1)桁数
				if((WORK_ODR_DLV_DATE_TIME).length() == 0 ){
					//Nullは2359に設定
					WORK_ODR_DLV_DATE_TIME = "2359";
				}else if((WORK_ODR_DLV_DATE_TIME).length() < 3 ){
					//１桁２桁はエラー
					setErrorMessage("AS00027", WORK_ODR_DLV_DATE_TIME);
					return;
				}else if((WORK_ODR_DLV_DATE_TIME).length() == 3 ){
					//３桁は頭に０を付ける
					WORK_ODR_DLV_DATE_TIME = "0" + WORK_ODR_DLV_DATE_TIME;
				}
				
				
				//②品目別製造着手日(時刻)のチェック
				if( (struct.getOPR_INST_START_DATE()).equals("") && (struct.getOPR_INST_START_DATE_TIME()).equals("") ){	//NULLの場合は自動算出
				}else{
					OPR_INST_START_DATE_TIME = struct.getOPR_INST_START_DATE_TIME();
					if((OPR_INST_START_DATE_TIME).length() == 0 ){
						//Nullは2359に設定
						OPR_INST_START_DATE_TIME = "2359";
					}else if((OPR_INST_START_DATE_TIME).length() < 3 ){
						//１桁２桁はエラー
						setErrorMessage("AS00029", OPR_INST_START_DATE_TIME);
						return;
					}else if((OPR_INST_START_DATE_TIME).length() == 3 ){
						//３桁は頭に０を付ける
						OPR_INST_START_DATE_TIME = "0" + OPR_INST_START_DATE_TIME;
					}
				}
			}
			
			// 品目対応したカレンダー番号存在した場合、カレンダー明細の存在性チェック
			List calList = entity.mSelectM_CAL3.read(conn,struct);
			if(!calList.isEmpty() &&  (((AD0010010Struct)calList.get(0)).getCAL_NO()== null
					|| "".equals(((AD0010010Struct)calList.get(0)).getCAL_NO()))) {
				// カレンダ明細データが存在しません。
				setErrorMessage("ZZ06002");
				setWarningSysLogMessage("ITEM_CD", struct.getITEM_CD());
				return;
			}
			
			//入力された製造納期が休日だった場合エラー
			Date dateWorkOdrDlvDate = _df.parse(this.struct.getWORK_ODR_DLV_DATE());
			String strWorkOdrDlvDate = Converter.dateToStr(dateWorkOdrDlvDate, "yyyy/MM/dd");
			this.struct.setDATE(strWorkOdrDlvDate);
			this.struct.setPLANT_CD(getsysPLANT_CD());
			//品目番号を検索キーとして読込
			List dateList = entity.mSelectM_CAL1.read(conn,struct);
			if (dateList == null || dateList.size() <= 0) {
				//工場コードを検索キーとして読込
				dateList = entity.mselectM_CAL.read(conn,struct);
				if(dateList == null || dateList.size() <= 0){
					//データが存在しない
					setErrorMessage("ZZ01101");
					setWarningSysLogMessage("M_PLANT.PLANT_CD", this.struct.getPLANT_CD());
					setWarningSysLogMessage("M_CAL.CAL_DATE",
						this.struct.getWORK_ODR_DLV_DATE());//製造納期
						return;
				}else{
					AD0010010Struct dateStruct = (AD0010010Struct)dateList.get(0);
					setStandardItem(dateStruct);
					if ("1".equals(dateStruct.getHOLIDAY_FLG())) {
						setErrorMessage("AD00036");
						setWarningSysLogMessage("M_PLANT.PLANT_CD", this.struct.getPLANT_CD());
						setWarningSysLogMessage("M_CAL.CAL_DATE", 
								this.struct.getWORK_ODR_DLV_DATE());//製造納期
						return;
					}
				}
			}else{
				AD0010010Struct dateStruct = (AD0010010Struct)dateList.get(0);
				setStandardItem(dateStruct);
				if ("1".equals(dateStruct.getHOLIDAY_FLG())) {
					setErrorMessage("AD00036");
					setWarningSysLogMessage("M_ITEM.ITEM_CD", this.struct.getITEM_CD());
					setWarningSysLogMessage("M_CAL.CAL_DATE",
					this.struct.getWORK_ODR_DLV_DATE());//製造納期
					return;
				}
			}

			//着手日の自動計算
			if (this.struct.getOPR_INST_START_DATE() == null 
					|| "".equals(this.struct.getOPR_INST_START_DATE())) {
				// 20081222 MOD↓
				// EJa-ASPROVA連携オプション導入の場合
				if("1".equals(_SysInstallOptions_ASP)){	
					String prop_lot = "1";
					List ltList = entity.mselectLT.read(conn,struct);
					if (ltList == null || ltList.size() == 0) {
						//データが存在しない
						setErrorMessage("ZZ01101");
						setWarningSysLogMessage("M_PLANT.PLANT_CD", this.struct.getPLANT_CD());
						setWarningSysLogMessage("M_CAL.CAL_DATE", 
								this.struct.getOPR_INST_START_DATE());//製造着手日
					} else {
						AD0010010Struct ltStruct = (AD0010010Struct)ltList.get(0);
						prop_lot = ltStruct.getPROP_LOT_SIZE();
					}
					
		        	 String sWkDate, sShiftMin,sWkTime ;
		        	
						 ATAspBom ab = new ATAspBom(conn, this.sysPLANT_CD, 
								this.sysUSER_CD, 
								this.getProgramId());
						 ATWorkCalendar atWC = new ATWorkCalendar(conn, 
								this.sysUSER_CD , 
								this.getProgramId(), 
								this.sysPLANT_CD) ;
					 Date odrStartDate = null;		  // 手配着手日
					 Date prdStartDate = null;		  // 製造着手日
					 Date prdDueDate = null;		  // 製造納期
					 Date dueDate = null;		  	// 要求納期
	
					//製造納期が決定の状態
					prdDueDate = StrngToDt(this.struct.getWORK_ODR_DLV_DATE() + " " + (WORK_ODR_DLV_DATE_TIME).substring(0,2) + ":" + (WORK_ODR_DLV_DATE_TIME).substring(2,4));
					//■CHG 20081208 要求納期のLTシフト(＋)-----------------------------
					sShiftMin = ab.getIssueLtMin(struct.getITEM_CD(),"U");
					dueDate = atWC.calcShiftMinute(prdDueDate, sShiftMin, ATWorkCalendar.SHIFT_END);	//Conv
					sWkDate =DtToStrng(dueDate);
					struct.seth_DUE_DATE(sWkDate);
					//-------------------------------------20081208
					//■CHG 20081208 製造着手日LTシフト(－)-----------------------------
					 //strOprInstQty, prop_lot
					//作業指示数を切り上げ処理する
					BigDecimal StrOprInstQty = new BigDecimal(this.struct.getOPR_INST_QTY());
					BigDecimal OprInstQty = StrOprInstQty.setScale(0, BigDecimal.ROUND_UP);
					String strOprInstQty = OprInstQty.toString();
					
					sShiftMin = ab.getProdLtMin(struct.getITEM_CD(),strOprInstQty,prop_lot,"U");
					sShiftMin = Calculate.multiply(sShiftMin,"-1"); //過去へ
					prdStartDate = atWC.calcShiftMinute(prdDueDate, sShiftMin, ATWorkCalendar.SHIFT_START);	//Conv
					sWkDate =DtGetDate(prdStartDate);
					sWkTime =DtGetTime(prdStartDate);
					this.struct.setOPR_INST_START_DATE(sWkDate);
					this.struct.setOPR_INST_START_DATE_TIME(sWkTime);
					OPR_INST_START_DATE_TIME = sWkTime;
					//-------------------------------------20081208
					//■CHG 20081208 手配着手日LTシフト(－)-----------------------------				
					sShiftMin = ab.getOdrLtMin(struct.getITEM_CD(),"U");
					sShiftMin = Calculate.multiply(sShiftMin,"-1"); //過去へ
					odrStartDate = atWC.calcShiftMinute(prdStartDate, sShiftMin, ATWorkCalendar.SHIFT_START);	//Conv
					sWkDate =DtToStrng(odrStartDate);
					struct.seth_ODR_START_DATE(sWkDate);
					//-------------------------------------20081208	
		            _debugMsg = ("(AD0010/EJa-ASP)TIME: "
		            	   + "DUE_DATE" + "[" + this.struct.geth_DUE_DATE() + "]," 
		         		   + "WORK_ODR_DLV_DATE" + "[" + this.struct.getWORK_ODR_DLV_DATE() + "],"  
		         		   + "OPR_INST_START_DATE" + "[" + this.struct.getOPR_INST_START_DATE() + "],"  
		         		   + "ODR_START_DATE" + "[" + struct.geth_ODR_START_DATE() + "] " );
			        sysLog.info("ZZ01006",struct.getsUser_ID(), _debugMsg );
			        //-------------------------------------20081208	 
				}else{			
					List ltList = entity.mselectLT.read(conn,struct);
					if (ltList == null || ltList.size() == 0) {
						//データが存在しない
						setErrorMessage("ZZ01101");
						setWarningSysLogMessage("M_ITEM.ITEM_CD", 
								this.struct.getWORK_ODR_DLV_DATE());//品目番号
					} else {
						AD0010010Struct ltStruct = (AD0010010Struct)ltList.get(0);
						setStandardItem(ltStruct);
						String fixed = ltStruct.getFIXED_LT();
						String prop = ltStruct.getPROP_LT();
						String safety = ltStruct.getSAFETY_LT();
						String prop_lot = ltStruct.getPROP_LOT_SIZE();
	
						//作業指示数を切り上げ処理する
						String itemLt = Calculate.divide(struct.getOPR_INST_QTY(), prop_lot, 0, Calculate._CEIL);
						//品目のリードタイム
						itemLt = Calculate.multiply(itemLt, prop);
						itemLt = Calculate.add(itemLt, fixed);
						itemLt = Calculate.add(itemLt, safety);
						itemLt = Calculate.multiply(itemLt, "-1");
						//着手日を自動計算する
						String StrOprInstStartDate = calcWorkDay(struct.getWORK_ODR_DLV_DATE(),WORK_ODR_DLV_DATE_TIME, itemLt, true);

						if(StrOprInstStartDate == null){
							// 業務日付の取得に失敗しました。
							setErrorMessage("KQ00026");
							setWarningSysLogMessage("M_PLANT.PLANT_CD", this.struct.getPLANT_CD());
							setWarningSysLogMessage("M_CAL.CAL_DATE", struct.getWORK_ODR_DLV_DATE());//製造納期
							return;
						} else {
							this.struct.setOPR_INST_START_DATE(StrOprInstStartDate.substring(0,10));
							OPR_INST_START_DATE_TIME = StrOprInstStartDate.substring(11,15);
						}
					}
				
				}
		        // 20081222 MOD↑
				
			} else {
				//入力された製造着手日が休日だった場合エラー
				Date dateOprInstStartDate = _df.parse(this.struct.getOPR_INST_START_DATE());
				String strOprInstStartDate =
						Converter.dateToStr(dateOprInstStartDate, "yyyy/MM/dd");
				this.struct.setDATE(strOprInstStartDate);
				this.struct.setPLANT_CD(getsysPLANT_CD());
				//品目番号を検索キーとして読込
				List dateList2 = entity.mSelectM_CAL1.read(conn,struct);
				if (dateList2 == null || dateList2.size() == 0) {
					//工場コードを検索キーとして読込
					dateList2 = entity.mselectM_CAL.read(conn,struct);
					if(dateList2 == null || dateList2.size() <= 0){
						//データが存在しない
						setErrorMessage("ZZ01101");
						setWarningSysLogMessage("M_PLANT.PLANT_CD", this.struct.getPLANT_CD());
						setWarningSysLogMessage("M_CAL.CAL_DATE", 
							this.struct.getOPR_INST_START_DATE());//製造着手日
						return;
				} else {
					AD0010010Struct dateStruct2 = (AD0010010Struct)dateList2.get(0);
					setStandardItem(dateStruct2);
					if ("1".equals(dateStruct2.getHOLIDAY_FLG())) {
						setErrorMessage("AD00038");
						setWarningSysLogMessage("M_PLANT.PLANT_CD", this.struct.getPLANT_CD());
						setWarningSysLogMessage("M_CAL.CAL_DATE", 
						this.struct.getOPR_INST_START_DATE());//製造着手日
						return;
					}
				}
				}else{
					AD0010010Struct dateStruct2 = (AD0010010Struct)dateList2.get(0);
					setStandardItem(dateStruct2);
					if ("1".equals(dateStruct2.getHOLIDAY_FLG())) {
						setErrorMessage("AD00038");
						setWarningSysLogMessage("M_ITEM.ITEM_CD", this.struct.getITEM_CD());
						setWarningSysLogMessage("M_CAL.CAL_DATE",
						this.struct.getOPR_INST_START_DATE());//製造着手日
						return;
					}
				}
			}

			//［作業区］に存在しない作業区コードを入力した場合エラー
			if ("1".equals(struct.getOUTSIDE_TYP())){
				if(struct.getWS_CD() != null && !"".equals(struct.getWS_CD())){
					List wsCdList = entity.mreadWS_CD.read(conn,struct);
					if (wsCdList.size() <= 0) {
						setErrorMessage("AD20029");
						setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WORK_ODR_CD", 
								this.struct.getWORK_ODR_CD());//作業計画番号
						setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WS_CD", 
								this.struct.getWS_CD());//作業区コード
					} else {
						// ユーザの所属する工場コードと、入力した作業区コードの工場コードが
						// 異なる場合エラー
						AD0010010Struct wsCdStruct = (AD0010010Struct)wsCdList.get(0);
						setStandardItem(wsCdStruct);
						if (!this.sysPLANT_CD.equals(wsCdStruct.getPLANT_CD())) {
							setErrorMessage("AD00004");
							setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WORK_ODR_CD", 
									this.struct.getWORK_ODR_CD());//作業計画番号
							setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.PLANT_CD",
									this.sysPLANT_CD);//ユーザの所属する工場コード
						}
					}
				}
			}

			//製番品目の場合
			if (this.struct.getJOB_ODR_CD() == null 
					|| "".equals(this.struct.getJOB_ODR_CD())) {
			} else {
				List jobOdrDlvDateList = entity.mselectJOB_ODR_DLV_DATE.read(conn, struct);
				if (jobOdrDlvDateList == null || jobOdrDlvDateList.size() <= 0) {
					//データが存在しない
					setErrorMessage("ZZ01101");
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WORK_ODR_CD", 
							this.struct.getWORK_ODR_CD());//作業計画番号
					setWarningSysLogMessage("T_OD.JOB_ODR_CD", struct.getJOB_ODR_CD());
					setWarningSysLogMessage("T_JOB_ODR.JOB_ODR_DLV_DATE",
							this.struct.geth_JOB_ODR_DLV_DATE());//「製番計画」製番納期
				} else {
					AD0010010Struct jobOdrDlvDateStruct =
							(AD0010010Struct)jobOdrDlvDateList.get(0);
					setStandardItem(jobOdrDlvDateStruct);
					this.struct.seth_JOB_ODR_DLV_DATE(
							jobOdrDlvDateStruct.geth_JOB_ODR_DLV_DATE());
					this.struct.seth_JOB_ODR_DLV_DATE_TIME(
							jobOdrDlvDateStruct.geth_JOB_ODR_DLV_DATE_TIME());
					Date dateJobOdrDlvDate  =
							_df.parse(this.struct.geth_JOB_ODR_DLV_DATE());

					//「製番計画」製番納期＜製造納期のチェック
					if (dateJobOdrDlvDate.compareTo(dateWorkOdrDlvDate) < 0 || (dateJobOdrDlvDate.compareTo(dateWorkOdrDlvDate) == 0 && (Integer.valueOf(struct.geth_JOB_ODR_DLV_DATE_TIME()).intValue() < Integer.valueOf(WORK_ODR_DLV_DATE_TIME).intValue()))) {
						if (DateTool.compareYMD(struct.geth_JOB_ODR_DLV_DATE(),struct.geth_BUSINESS_OPR_DATE()) >= 0) {
						    setErrorMessage("AD32214");
						    setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//作業計画番号
						    setWarningSysLogMessage("T_JOB_ODR.JOB_ODR_CD", struct.getJOB_ODR_CD());
						    setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.CAL_DATE", this.struct.getWORK_ODR_DLV_DATE());//製造納期
						}else{
							setWarningMessage("AD32219");
							setInfoSysLogMessage("T_JOB_ODR.JOB_ODR_DLV_DATE", struct.geth_JOB_ODR_DLV_DATE());
							setInfoSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WORK_ODR_DLV_DATE", struct.getWORK_ODR_DLV_DATE());
						}
					}

					// 先行手配製番([製番計画]."製番種別"=2)の最上位品目の場合で、
					//「製造納期」＞min（同製番・製番枝番をキーに要求もとのデマンドを検索し、
					// その[所要量]."要求納期"）になる場合
					if ("2".equals(jobOdrDlvDateStruct.getJOB_ODR_TYP())) {
						// 最上位品目(親オーダデマンド番号がNULL)の場合
						if (struct.geth_PARENT_OD_NO() == null 
								|| "".equals(struct.geth_PARENT_OD_NO())) {
								
							List jobOdrAlcList = entity.mSelectJOB_ODR_ALC.read(conn, struct);
							if (jobOdrAlcList == null || jobOdrAlcList.size() == 0) {
								//引当データが無ければ、チェックしない。
							} else {
								AD0010010Struct jobOdrAlcStruct = 
										(AD0010010Struct)jobOdrAlcList.get(0);
								setStandardItem(jobOdrAlcStruct);
								Date datealcDueDate = 
										Converter.strToDate(jobOdrAlcStruct.geth_DUE_DATE(),
											Converter.SLASH_DATE);
								
								//「製造納期」＞[所要量]."要求納期"
								if (dateWorkOdrDlvDate.compareTo(datealcDueDate) > 0 || (dateWorkOdrDlvDate.compareTo(datealcDueDate) == 0 && (Integer.valueOf(WORK_ODR_DLV_DATE_TIME).intValue() > Integer.valueOf(jobOdrAlcStruct.geth_DUE_DATE_TIME()).intValue()))) {
									//引当納期に矛盾があります。
									setWarningMessage("AD00044");
									setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WORK_ODR_CD", 
											this.struct.getWORK_ODR_CD());//作業計画番号
									setWarningSysLogMessage("T_JOB_ODR.JOB_ODR_CD", 
											struct.getJOB_ODR_CD());
									setInfoSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WORK_ODR_DLV_DATE", 
											struct.getWORK_ODR_DLV_DATE());
									setInfoSysLogMessage("T_OD.DUE_DATE", 
											jobOdrAlcStruct.geth_DUE_DATE());
								}
							}
						}
					}
				}

				BigDecimal oprInstQty = new BigDecimal(this.struct.getOPR_INST_QTY());
				BigDecimal hOprInstQty = new BigDecimal(this.struct.geth_OPR_INST_QTY());
				
				//最上位品目の場合で作業指示数が変更された場合
				if ((this.struct.geth_PARENT_OD_NO() == null 
						|| this.struct.geth_PARENT_OD_NO().equals(""))
						&& (oprInstQty.compareTo(hOprInstQty) != 0)) {
					setWarningMessage("AD00007");
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WORK_ODR_CD", 
							this.struct.getWORK_ODR_CD());//作業計画番号
					setInfoSysLogMessage("T_WORK_IN_PROC_BY_ITEM.OPR_INST_QTY", 
							this.struct.getOPR_INST_QTY());//作業指示数
				}
			}


			//[品目].在庫数量単位区分=1で「作業指示数」に小数が入力された場合、
			//切り上げ処理をする
			BigDecimal OprInstQty_up = new BigDecimal(this.struct.getOPR_INST_QTY());
			if (this.struct.geth_UNIT_QTY_TYP().equals("1")) {
				BigDecimal OprInstQty2 = new BigDecimal("0");
				OprInstQty2 = OprInstQty_up.setScale(0,BigDecimal.ROUND_UP);

				//切り上げ処理前と後で値が異なっていたら小数が入力されていたと
				//判断しワーニング
				if (OprInstQty_up.doubleValue() != OprInstQty2.doubleValue()) { 
					setWarningMessage("AD00043");
					setInfoSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WORK_ODR_CD", 
							this.struct.getWORK_ODR_CD());//作業計画番号
					setInfoSysLogMessage("T_WORK_IN_PROC_BY_ITEM.OPR_INST_QTY", 
							this.struct.getOPR_INST_QTY());//作業指示数
				}
				//品目が整数管理品の場合、切上げを行う
				OprInstQty_up = OprInstQty_up.setScale(0,BigDecimal.ROUND_UP);
			}
			this.struct.setOPR_INST_QTY(OprInstQty_up.toString());


			// エラーがあれば終了
			if (msgStruct.hasError()) {
				return;
			}


			//MODIFY_COUNTチェック
			List modifyCountList = entity.mselectMODIFY_COUNT.read(conn,struct);
			if (modifyCountList == null || modifyCountList.size() == 0) {
				//データが存在しない
				setErrorMessage("ZZ01101");
				setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WORK_ODR_CD", 
						this.struct.getWORK_ODR_CD());//作業計画番号
				return;
			}
			AD0010010Struct modifyCountStruct = (AD0010010Struct)modifyCountList.get(0);
			setStandardItem(modifyCountStruct);
			if (this.struct.geth_MODIFY_COUNT().equals(modifyCountStruct.geth_MODIFY_COUNT()) == false) {
				setErrorMessage("ZZ01105");
				setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WORK_ODR_CD",
						this.struct.getWORK_ODR_CD());//作業計画番号
				return;
			}
			this.struct.setOD_NO(modifyCountStruct.getOD_NO());


			//品目別仕掛レコードの更新
			struct.setOPR_INST_START_DATE_ALL(struct.getOPR_INST_START_DATE() + " " + OPR_INST_START_DATE_TIME );
			struct.setWORK_ODR_DLV_DATE_ALL(struct.getWORK_ODR_DLV_DATE() + " " + WORK_ODR_DLV_DATE_TIME );
			entity.mupdateT_WORK_IN_PROC_BY_ITEM.update(conn, struct);
			
			_outSideTyp = this.struct.getOUTSIDE_TYP();
			//「内外作区分」が２(外注)に変更された場合
			if ("2".equals(this.struct.getOUTSIDE_TYP())) {
				//発注番号の採番
				CollectNumber PUCH_CD = 
						new CollectNumber(CollectNumber.PUCH_CD,
							this.sysUSER_CD, 
							this.sp.getProcId(),
							this.sysPLANT_CD);
				String strPuchCd = PUCH_CD.getNo();
				if (strPuchCd == null || strPuchCd.equals("")) {
					//採番失敗
					setErrorMessage("ZZ01106");
					return;
				} else {
					this.struct.setPUCH_ODR_CD(strPuchCd);
				}

				//[自社].会社コードの取得
				List companyCdList = entity.mselectSYS_MY_COMPANY_CompanyCd.read(conn,struct);
				if (companyCdList == null || companyCdList.size() <= 0) {
					//データが存在しない
					setErrorMessage("ZZ01101");
					setWarningSysLogMessage("SYS_MY_COMPANY.COMPANY_CD", 
							this.struct.getCOMPANY_CD());//会社コード
					return;
				}
				AD0010010Struct companyCdStruct = (AD0010010Struct)companyCdList.get(0);
				setStandardItem(companyCdStruct);

				_companyCd = companyCdStruct.getCOMPANY_CD();
				this.struct.setCOMPANY_CD(_companyCd);
				this.struct.setPLANT_CD(this.sysPLANT_CD);
				this.struct.setITEM_CD(this.struct.getITEM_CD());

				//代表取引先コードの取得
				List unitCostList = entity.mselectM_PUCH_UNIT_COST_H.read(conn, struct);

				if (unitCostList == null || unitCostList.size() <= 0) {
					//代表取引先コードが存在しない
					this.struct.setVEND_CD("");            //代表取引先コード
					this.struct.setPUCH_ODR_PERSON("");    //発注担当者
					this.struct.setUNIT_COST_TYP("1");     //購入単価区分
					this.struct.setUNIT_COST("0");         //購入単価
					this.struct.setPROCESSING_COST("0");   //購入加工費
					this.struct.setMATERIAL_COST("0");     //購入材料費
					this.struct.setOTHER_OVERHEADS("0");   //購入その他経費
					this.struct.setPUCH_ODR_AMOUNT("0");   //発注金額
					this.struct.setTAX_RATE_1("0");        //税率1
					this.struct.setTAX_RATE_2("0");        //税率2
					this.struct.setTAX_RATE_3("0");        //税率3
					this.struct.setTAX_CD("");             //税コード
					this.struct.setTAX_ROUND_TYP("1");     //税端数区分
					this.struct.setNET_AMOUNT("0");        //本体金額
					this.struct.setTAX_AMOUNT_1("0");      //税額1
					this.struct.setTAX_AMOUNT_2("0");      //税額2
					this.struct.setTAX_AMOUNT_3("0");      //税額3
					this.struct.setAMOUNT_INCLUDE_TAX("0");//税込金額
					this.struct.setHOME_CUR_AMOUNT("0");   //邦貨金額
					this.struct.setRATE_JUDGE_DATE("");    //レート判定日
					this.struct.setEXCH_RATE("0");         //為替レート

				} else {
					AD0010010Struct unitCostStruct = (AD0010010Struct)unitCostList.get(0);
					setStandardItem(unitCostStruct);

					//代表取引先コードが存在する
					this.struct.setVEND_CD(unitCostStruct.getVEND_CD());

					//発注担当者
					AD0010010Struct updateStruct = new AD0010010Struct();
					setStandardItem(updateStruct);
					updateStruct.setCOMPANY_CD(_companyCd);
					updateStruct.setVEND_CD(unitCostStruct.getVEND_CD());
					
					List vendList = entity.mselectM_VEND_CTRL.read(conn,updateStruct);
					if (vendList == null || vendList.size() <= 0) {
						this.struct.setPUCH_ODR_PERSON("");
					} else {
						AD0010010Struct vendStruct = (AD0010010Struct)vendList.get(0);
						setStandardItem(vendStruct);
						this.struct.setPUCH_ODR_PERSON("");
					}

					String unitCostTyp = null;     // 単価区分
					String unitCost = null;        // 単価
					String processingCost = null;  // 加工費
					String materialCost = null;    // 材料費
					String otherOverheads = null;  // その他経費

					// 単価取得
					AD0010010Struct searchStruct = new AD0010010Struct();
					setStandardItem(searchStruct);
					searchStruct.setCOMPANY_CD(this.struct.getCOMPANY_CD());
					searchStruct.setPLANT_CD(this.sysPLANT_CD);
					searchStruct.setITEM_CD(this.struct.getITEM_CD());
					searchStruct.setVEND_CD(this.struct.getVEND_CD());
					searchStruct.setEFF_PHASE_IN_DATE(this.struct.getWORK_ODR_DLV_DATE());
					searchStruct.setPUCH_SIZE(this.struct.getOPR_INST_QTY());
					List puchUnitCostList = entity.mM_PUCH_UNIT_COST.read(conn, searchStruct);

					if (puchUnitCostList == null || puchUnitCostList.size() <= 0) {
						// 単価情報が存在しない場合
						unitCostTyp = "1";
						unitCost = "0.00";
						processingCost = "0.00";
						materialCost = "0.00";
						otherOverheads = "0.00";

					} else {
						AD0010010Struct resultStruct = 
								(AD0010010Struct)puchUnitCostList.get(0);
						setStandardItem(resultStruct);
						unitCostTyp = resultStruct.getUNIT_COST_TYP();
						unitCost = resultStruct.getUNIT_COST();
						processingCost = resultStruct.getPROCESSING_COST();
						materialCost = resultStruct.getMATERIAL_COST();
						otherOverheads = resultStruct.getOTHER_OVERHEADS();
					}

					//購入単価区分
					this.struct.setUNIT_COST_TYP(unitCostTyp);

					//購入単価
					this.struct.setUNIT_COST(unitCost);

					//購入加工費
					this.struct.setPROCESSING_COST(processingCost);

					//購入材料費
					this.struct.setMATERIAL_COST(materialCost);

					//購入その他経費
					this.struct.setOTHER_OVERHEADS(otherOverheads);

					String roundTyp = "";       // まるめ区分
					String vendDecimalFig = ""; // 小数点桁数
					String exchRate = "0";      // 為替種別
					try {

						// 通貨情報を取得
						CurStruct cs =
							CurControl.getData(
								this.conn,
								this.struct.getCOMPANY_CD(),
								this.struct.getVEND_CD());

						roundTyp = cs.getROUND_TYP();
						vendDecimalFig = cs.getDECIMAL_FIG();

					} catch (DataNotFoundException e) {
						setErrorMessage("ZZ01101", e.getMessage());
						setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WORK_ODR_CD",
								this.struct.getWORK_ODR_CD());//作業計画番号
						return;
					}

					if (!("2".equals(unitCostStruct.getEXCH_TYP()))
							&& !(unitCostStruct.getCUR_CD() == null 
							|| "".equals(unitCostStruct.getCUR_CD()))) {
						try{
							// 為替レート情報を取得
							ExchRateStruct ers =
								ExchRateControl.getData(
									this.conn,
									this.struct.getCOMPANY_CD(),
									unitCostStruct.getCUR_CD(),
									unitCostStruct.getEXCH_TYP(),
									null,
									this.struct.getWORK_ODR_DLV_DATE());
							
							exchRate = ers.getEXCH_RATE();
							this.struct.setRATE_JUDGE_DATE(this.struct.getWORK_ODR_DLV_DATE());
							this.struct.setEXCH_RATE(ers.getEXCH_RATE());

						} catch (DataNotFoundException e) {
							//レート判定日	NULL
							this.struct.setRATE_JUDGE_DATE("");
							// 為替レート	0
							this.struct.setEXCH_RATE("0");
							// 邦貨金額	0
							this.struct.setHOME_CUR_AMOUNT("0");
						}
					} else {
						//レート判定日	NULL
						this.struct.setRATE_JUDGE_DATE("");
						// 為替レート	0
						this.struct.setEXCH_RATE("0");
						// 邦貨金額	0
						this.struct.setHOME_CUR_AMOUNT("0");
					}

					try {
						// 消費税情報を取得
						TaxStruct ts =
							TaxControl.getData(
								this.conn,
								this.struct.getCOMPANY_CD(),
								this.struct.getVEND_CD(),
								this.struct.getITEM_CD(),
								this.struct.getWORK_ODR_DLV_DATE()); //製造納期

						//税コード:"消費税コード
						this.struct.setTAX_CD(ts.getTAX_CD());
						//税端数区分:[消費税区分マスタ]．"端数区分"
						this.struct.setTAX_ROUND_TYP(ts.getTAX_ROUND_TYP());

						// TAX_CDの下1桁が1以外の場合は税率を0とする。
						String lowerTaxCd =
							ts.getTAX_CD().substring(ts.getTAX_CD().length() - 1);
						if (lowerTaxCd.equals("1")) {
							this.struct.setTAX_RATE_1(ts.getTAX_RATE_1());
							this.struct.setTAX_RATE_2(ts.getTAX_RATE_2());
							this.struct.setTAX_RATE_3(ts.getTAX_RATE_3());
						} else {
							this.struct.setTAX_RATE_1("0.0");
							this.struct.setTAX_RATE_2("0.0");
							this.struct.setTAX_RATE_3("0.0");
						}
					} catch (DataNotFoundException e) {
						this.struct.setTAX_ROUND_TYP("1");
						this.struct.setTAX_RATE_1("0.0");
						this.struct.setTAX_RATE_2("0.0");
						this.struct.setTAX_RATE_3("0.0");
					}

					//発注金額
					String puchOdrAmount =
						AmountCalculator.calcPuchOdrAmount(
							this.struct.getOPR_INST_QTY(),
							this.struct.getUNIT_COST(),
							roundTyp,
							vendDecimalFig);
					this.struct.setPUCH_ODR_AMOUNT(puchOdrAmount);

					// 値引金額
					String discAmount = "0.00";

					//本体金額
					String netAmount =
						AmountCalculator.calcNetAmount(
							this.struct.getPUCH_ODR_AMOUNT(),
							discAmount);
					this.struct.setNET_AMOUNT(netAmount);

					//税額1
					String taxAmount1 =
						AmountCalculator.calcTaxAmount(
							this.struct.getNET_AMOUNT(),
							this.struct.getTAX_RATE_1(),
							this.struct.getTAX_ROUND_TYP(),
							vendDecimalFig);
					this.struct.setTAX_AMOUNT_1(taxAmount1);

					//税額2
					String taxAmount2 =
						AmountCalculator.calcTaxAmount(
							this.struct.getNET_AMOUNT(),
							this.struct.getTAX_RATE_2(),
							this.struct.getTAX_ROUND_TYP(),
							vendDecimalFig);
					this.struct.setTAX_AMOUNT_2(taxAmount2);

					//税額3
					String taxAmount3 =
						AmountCalculator.calcTaxAmount(
							this.struct.getNET_AMOUNT(),
							this.struct.getTAX_RATE_3(),
							this.struct.getTAX_ROUND_TYP(),
							vendDecimalFig);
					this.struct.setTAX_AMOUNT_3(taxAmount3);

					//税込金額
					String amountIncludeTax =
						AmountCalculator.calcAmountIncludeTax(
							this.struct.getNET_AMOUNT(),
							this.struct.getTAX_AMOUNT_1(),
							this.struct.getTAX_AMOUNT_2(),
							this.struct.getTAX_AMOUNT_3());
					this.struct.setAMOUNT_INCLUDE_TAX(amountIncludeTax);

					//為替種別が２の場合
					if ("2".equals(unitCostStruct.getEXCH_TYP())) {

						//レート判定日	NULL
						this.struct.setRATE_JUDGE_DATE("");
						// 為替レート	0
						this.struct.setEXCH_RATE("0");
						// 邦貨金額	0
						this.struct.setHOME_CUR_AMOUNT("0");

					} else {
						//邦貨金額
						String homeCurAmount =
							AmountCalculator.calcHomeCurAmount(
								this.struct.getAMOUNT_INCLUDE_TAX(),
								exchRate,
								roundTyp,
								this._sysHomeCurStruct.getDECIMAL_FIG());
						this.struct.setHOME_CUR_AMOUNT(homeCurAmount);
					}
				}

				//[品目].受給品区分、受入検査区分の取得
				List itemList = entity.mselectM_ITEM.read(conn, struct);
				if (itemList == null || itemList.size() <= 0) {
					//データが存在しない
					setErrorMessage("ZZ01101");
					setWarningSysLogMessage("M_ITEM.ITEM_CD",
							this.struct.getITEM_CD());//品目コード
					return;
				} else {
					AD0010010Struct itemStruct = (AD0010010Struct)itemList.get(0);
					setStandardItem(itemStruct);
					this.struct.setSPL_ITEM_TYP(itemStruct.getSPL_ITEM_TYP());
					this.struct.setACPT_INSPC_TYP(itemStruct.getACPT_INSPC_TYP());
				}
				
				// 受け入れ保管区の既定値取得
				String strWhCd = ValidateWh.getDefaultRcv(conn, struct.getPLANT_CD(), struct.getITEM_CD());
				if("".equals(strWhCd)){
					//データが存在しない
					setErrorMessage("AD10001");
					setWarningSysLogMessage("M_PLANT.PLANT_CD", struct.getPLANT_CD());
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.ITEM_CD", struct.getITEM_CD());
					return;
				} else {
					this.struct.setWH_CD(strWhCd);
				}

				this.struct.setsUser_ID(this.sysUSER_CD);

				//発注残の登録時の一意制約エラーチェック
				list = entity.mselectT_RLSD_PUCH_ODR.read(conn, struct);
				if (list != null && list.size() > 0) {
					setErrorMessage("ZZ01102");
					setWarningSysLogMessage("T_RLSD_PUCH_ODR.PUCH_ODR_CD",
							this.struct.getPUCH_ODR_CD());//発注番号
					setReadStatus(ERROR);
					return;
				}


				//発注残の登録
				this.struct.setOPR_INST_START_DATE_ALL(struct.getOPR_INST_START_DATE() + " " + OPR_INST_START_DATE_TIME.substring(0,2) + ":" + OPR_INST_START_DATE_TIME.substring(2,4));
				this.struct.setWORK_ODR_DLV_DATE_ALL(struct.getWORK_ODR_DLV_DATE() + " " + WORK_ODR_DLV_DATE_TIME.substring(0,2) + ":" + WORK_ODR_DLV_DATE_TIME.substring(2,4));
				
				int nRet = entity.minsertT_RLSD_PUCH_ODR.create(conn, struct);


				//品目別仕掛の削除時の一意制約エラーチェック
				List workOdrCdList = entity.mCheckWORK_IN_PROC_BY_ITEM.read(conn, struct);
				if (workOdrCdList == null && workOdrCdList.size() <= 0) {
					setErrorMessage("ZZ01101");
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WORK_ODR_CD",
							this.struct.getWORK_ODR_CD());//作業計画番号
					setReadStatus(ERROR);
					return;
				}

				//品目別仕掛のレコード削除
				entity.mdeleteT_WORK_IN_PROC_BY_ITEM.delete(conn, struct);
				setInformationMessage("AD53282");
				setSupportMessage("T_RLSD_PUCH_ODR.PUCH_ODR_CD", strPuchCd);

			}

			//オーダデマンド情報更新
			// 20081222 MOD↓
		    // EJa-ASPROVA連携オプション導入の場合
			if("1".equals(_SysInstallOptions_ASP)){	
				ATCommonOd od = new ATCommonOd(conn,
						this.sysPLANT_CD,
						this.sysUSER_CD,
						this.sp.getProcId());
				od.changeOdInfo(this.struct.getOD_NO(), -1,new Integer(this.struct.getOUTSIDE_TYP()).intValue());
			}else{
				
				CommonOd od = new CommonOd(conn,
							this.sysPLANT_CD,
							this.sysUSER_CD,
							this.sp.getProcId());

				od.changeOdInfo(this.struct.getOD_NO(), -1);
				
			}
			// 20081222 MOD↑

			conn.commit();

			
			//「内外作区分」が２(外注)に変更された場合
			if ("2".equals(_outSideTyp)) {

				//画面をリロード時の状態にする
				
				//画面項目の初期設定
				clearAll();

				//業務運用日の取得
				this.struct.setPLANT_CD(this.sysPLANT_CD);
				List oprDateList = entity.mselectBUSINESS_OPR_DATE.read(conn, struct);
				if (oprDateList == null || oprDateList.size() <= 0) {
					//データが存在しない
					setErrorMessage("ZZ01101");
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WORK_ODR_CD", 
							this.struct.getWORK_ODR_CD());//作業計画番号
					return;
				}
				AD0010010Struct oprDateStruct = (AD0010010Struct)oprDateList.get(0);
				setStandardItem(oprDateStruct);
				this.struct.seth_BUSINESS_OPR_DATE(oprDateStruct.geth_BUSINESS_OPR_DATE());
				
				_outSideTyp = "";
				
				setReadStatus(INITIAL);

			} else {
				//画面の再検索
				controlSelect();
			}

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


                //}}user_implement_dev:<controlUpdate>
		logger.exiting("AD0010010Control"+":USER="+struct.getsUser_ID(),"controlUpdate");

		return;
	}

	/**
	 * 削除ボタン押下時に実行される処理です。
	 *
	 */
	public void controlDelete() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0010");
		logger.entering("AD0010010Control"+":USER="+struct.getsUser_ID(),"controlDelete");
			//{{user_implement_dev:<controlDelete>


		try {
			//MODIFY_COUNTチェック
			List modifyCountList = entity.mselectMODIFY_COUNT.read(conn, struct);
			if (modifyCountList == null || modifyCountList.size() <= 0) {
				//データが存在しない
				setErrorMessage("ZZ01101");
				setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WORK_ODR_CD", 
						this.struct.getWORK_ODR_CD());//作業計画番号
				return;
			}
			
			AD0010010Struct modifyCountStruct = (AD0010010Struct)modifyCountList.get(0);
			struct.setOD_NO(modifyCountStruct.getOD_NO());
			setStandardItem(modifyCountStruct);
			if (this.struct.geth_MODIFY_COUNT().equals(modifyCountStruct.geth_MODIFY_COUNT()) == false) {
				setErrorMessage("ZZ01105");
				setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WORK_ODR_CD", 
						this.struct.getWORK_ODR_CD());//作業計画番号
				return;
			}
			
			//品目別仕掛のレコード削除
			entity.mdeleteT_WORK_IN_PROC_BY_ITEM.delete(conn, struct);
			//作業指示伝票のレコード削除
			entity.mdeleteT_OPR_INST_SLIP.delete(conn, struct);
			
			//オーダデマンド情報更新
			CommonOd od = new CommonOd(conn,
						this.sysPLANT_CD,
						this.sysUSER_CD,
						this.sp.getProcId());
								
			od.changeOdInfo(this.struct.getOD_NO(), -1);
			
			conn.commit();

			
			//画面をリロード時の状態にする
				
			//画面項目の初期設定
			clearAll();

			//業務運用日の取得
			this.struct.setPLANT_CD(this.sysPLANT_CD);
			List oprDateList = entity.mselectBUSINESS_OPR_DATE.read(conn, struct);
			if (oprDateList == null || oprDateList.size() <= 0) {
				//データが存在しない
				setErrorMessage("ZZ01101");
				setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WORK_ODR_CD", 
						this.struct.getWORK_ODR_CD());//作業計画番号
				setReadStatus(ERROR);
				return;
			}
			AD0010010Struct oprDateStruct = (AD0010010Struct)oprDateList.get(0);
			setStandardItem(oprDateStruct);
			this.struct.seth_BUSINESS_OPR_DATE(oprDateStruct.geth_BUSINESS_OPR_DATE());
			
			setReadStatus(INITIAL);

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


                //}}user_implement_dev:<controlDelete>
		logger.exiting("AD0010010Control"+":USER="+struct.getsUser_ID(),"controlDelete");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0010");
		logger.entering("AD0010010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>


		try {
			//画面上の項目値をクリアする
			clearAll();
			
			//業務運用日の取得
			this.struct.setPLANT_CD(this.sysPLANT_CD);
			List oprDateList = entity.mselectBUSINESS_OPR_DATE.read(conn, struct);
			if (oprDateList == null || oprDateList.size() <= 0) {
				//データが存在しない
				setErrorMessage("ZZ01101");
				setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WORK_ODR_CD", 
						this.struct.getWORK_ODR_CD());//作業計画番号
				setReadStatus(ERROR);
				return;
			}
			AD0010010Struct oprDateStruct = (AD0010010Struct)oprDateList.get(0);
			setStandardItem(oprDateStruct);
			this.struct.seth_BUSINESS_OPR_DATE(oprDateStruct.geth_BUSINESS_OPR_DATE());

		} catch (SQLException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			throw new ExpjException(e, emsg);
		}


                //}}user_implement_dev:<controlClear>
		logger.exiting("AD0010010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0010");
		logger.entering("AD0010010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AD0010010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0010");
		logger.entering("AD0010010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>


		try {
			//画面項目の初期設定
			clearAll();
			
			// 工場コードをセットする。
			this.struct.setPLANT_CD(this.sysPLANT_CD);
			
			//業務運用日の取得
			List oprDateList = entity.mselectBUSINESS_OPR_DATE.read(conn, struct);
			if (oprDateList == null || oprDateList.size() <= 0) {
				//データが存在しない
				setErrorMessage("ZZ01101");
				setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WORK_ODR_CD", 
						this.struct.getWORK_ODR_CD());//作業計画番号
				setReadStatus(ERROR);
				return;
			}
			AD0010010Struct oprDateStruct = (AD0010010Struct)oprDateList.get(0);
			setStandardItem(oprDateStruct);
			this.struct.seth_BUSINESS_OPR_DATE(oprDateStruct.geth_BUSINESS_OPR_DATE());
			
			// コンボボックスデータを部品より取得
			ComboBox cdac = new ComboBox(conn, sysUSER_CD);
			_outsideTypStruct = cdac.getData("OUTSIDE_TYP");
			cdac.setConnection(null);
			
			// [邦貨]情報を部品より取得
			_sysHomeCurStruct = HomeCurControl.getData(conn);
			
			//時刻管理パラメータ取得
			List listTimeCtrl = entity.mselectTIME_CTRL.read(conn,struct);
			if(listTimeCtrl == null || listTimeCtrl.size() <=0){
				struct.setTIME_CTRL("false");
				_flgTimeCtrl = "false";
			}else{
				struct.setTIME_CTRL(((AD0010010Struct)listTimeCtrl.get(0)).getTIME_CTRL());
				_flgTimeCtrl = struct.getTIME_CTRL();
			}
			
            try{
                // インストールオプションテーブルよりEJa-ASPROVA連携オプション導入フラグを取得
                List SysInstallOptASP = entity.mSYS_INSTALL_OPTIONS_ASP.read(conn,struct);
                if(SysInstallOptASP == null || SysInstallOptASP.size() <=0){
                	struct.setASP_INSTALL_FLG(null);
                }else{
                	struct.setASP_INSTALL_FLG(((AD0010010Struct)SysInstallOptASP.get(0)).getASP_INSTALL_FLG());
                }
                _SysInstallOptions_ASP = struct.getASP_INSTALL_FLG();
            }catch(SQLException e){
				e.printStackTrace();
				throw new ExpjException(e);
            }
		} catch (ComboException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			throw new ExpjException(e, emsg);
			
		} catch (SQLException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			throw new ExpjException(e, emsg);
			
		} catch (DataNotFoundException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			throw new ExpjException(e, emsg);
		}


                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AD0010010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * イベントハンドラの前処理です。
	 *
	 * @param buttun ボタン名
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0010");
		logger.entering("AD0010010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("AD0010010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("Insert") ) {
				controlInsert();
			} else if( button.equals("Update") ) {
				controlUpdate();
			} else if( button.equals("Delete") ) {
				controlDelete();
			} else if( button.equals("Clear") ) {
				controlClear();
			} else if( button.equals("initial") ) {
				controlINITIAL();
			} else if( button.equals("reload") ) {
				controlRELOAD();
			}
		//{{user_implement_dev:<control_eventHandller>


			//追加する値をセットする
			this.struct.setCREATED_BY(this.sysUSER_CD);
			this.struct.setCREATED_PRG_NM(this.sp.getClassName(ScreenParam.SHORT).substring(0,9));
			this.struct.setUPDATED_BY(this.sysUSER_CD);
			this.struct.setUPDATED_PRG_NM(this.sp.getClassName(ScreenParam.SHORT).substring(0,9));
			this.struct.setPLANT_CD(this.sysPLANT_CD);

			// コンボボックスのセットする
			struct.setList_OUTSIDE_TYP_val(_outsideTypStruct.getValList());
			struct.setList_OUTSIDE_TYP_name(_outsideTypStruct.getExplanList());


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
//			throw new FoundationException("AD0010010Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AD0010010-E999","CSVの出力処理"));
			throw new FoundationException("AD0010010Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AD0010010-E999","システム日付の取得処理"));
				throw new FoundationException("AD0010010Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AD0010010-E999","コントロールのイベント処理"));
			throw new FoundationException("AD0010010Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected AD0010010Entity entity;
	protected AD0010010Struct struct;
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

		entity = new AD0010010Entity();
		struct = new AD0010010Struct();

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
	 * AD0010010クラスの標準コンストラクタ
	 */
	public AD0010010Control() throws BusinessProcessException, FoundationException
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
				AD0010010Struct key = (AD0010010Struct)keyList.get(j);
				// メッセージキーを作成する
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("OUTSIDE_TYP_name") && key.getOUTSIDE_TYP_name() != null) {
					msgKey.setKeyValue("OUTSIDE_TYP_name", key.getOUTSIDE_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("OUTSIDE_TYP_val") && key.getOUTSIDE_TYP_val() != null) {
					msgKey.setKeyValue("OUTSIDE_TYP_val", key.getOUTSIDE_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("h_SUB_FLG") && key.geth_SUB_FLG() != null) {
					msgKey.setKeyValue("h_SUB_FLG", key.geth_SUB_FLG());
				}
				if(msgKeyType.containsKeyColumn("h_flg") && key.geth_flg() != null) {
					msgKey.setKeyValue("h_flg", key.geth_flg());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP_DN") && key.getMRP_ODR_TYP_DN() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP_DN", key.getMRP_ODR_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("OPR_RSLT_TYP_DN") && key.getOPR_RSLT_TYP_DN() != null) {
					msgKey.setKeyValue("OPR_RSLT_TYP_DN", key.getOPR_RSLT_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("h_OPR_INST_QTY") && key.geth_OPR_INST_QTY() != null) {
					msgKey.setKeyValue("h_OPR_INST_QTY", key.geth_OPR_INST_QTY());
				}
				if(msgKeyType.containsKeyColumn("h_WORK_ODR_CD") && key.geth_WORK_ODR_CD() != null) {
					msgKey.setKeyValue("h_WORK_ODR_CD", key.geth_WORK_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("WORK_ODR_CD") && key.getWORK_ODR_CD() != null) {
					msgKey.setKeyValue("WORK_ODR_CD", key.getWORK_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("OD_NO") && key.getOD_NO() != null) {
					msgKey.setKeyValue("OD_NO", key.getOD_NO());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("WS_CD") && key.getWS_CD() != null) {
					msgKey.setKeyValue("WS_CD", key.getWS_CD());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_START_DATE_ALL") && key.getOPR_INST_START_DATE_ALL() != null) {
					msgKey.setKeyValue("OPR_INST_START_DATE_ALL", key.getOPR_INST_START_DATE_ALL());
				}
				if(msgKeyType.containsKeyColumn("WORK_ODR_DLV_DATE_ALL") && key.getWORK_ODR_DLV_DATE_ALL() != null) {
					msgKey.setKeyValue("WORK_ODR_DLV_DATE_ALL", key.getWORK_ODR_DLV_DATE_ALL());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_QTY") && key.getOPR_INST_QTY() != null) {
					msgKey.setKeyValue("OPR_INST_QTY", key.getOPR_INST_QTY());
				}
				if(msgKeyType.containsKeyColumn("OPR_RSLT_TYP") && key.getOPR_RSLT_TYP() != null) {
					msgKey.setKeyValue("OPR_RSLT_TYP", key.getOPR_RSLT_TYP());
				}
				if(msgKeyType.containsKeyColumn("WORK_IN_PROC_COMMENT") && key.getWORK_IN_PROC_COMMENT() != null) {
					msgKey.setKeyValue("WORK_IN_PROC_COMMENT", key.getWORK_IN_PROC_COMMENT());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_CD") && key.getOPR_INST_CD() != null) {
					msgKey.setKeyValue("OPR_INST_CD", key.getOPR_INST_CD());
				}
				if(msgKeyType.containsKeyColumn("CREATED_BY") && key.getCREATED_BY() != null) {
					msgKey.setKeyValue("CREATED_BY", key.getCREATED_BY());
				}
				if(msgKeyType.containsKeyColumn("CREATED_PRG_NM") && key.getCREATED_PRG_NM() != null) {
					msgKey.setKeyValue("CREATED_PRG_NM", key.getCREATED_PRG_NM());
				}
				if(msgKeyType.containsKeyColumn("UPDATED_BY") && key.getUPDATED_BY() != null) {
					msgKey.setKeyValue("UPDATED_BY", key.getUPDATED_BY());
				}
				if(msgKeyType.containsKeyColumn("UPDATED_PRG_NM") && key.getUPDATED_PRG_NM() != null) {
					msgKey.setKeyValue("UPDATED_PRG_NM", key.getUPDATED_PRG_NM());
				}
				if(msgKeyType.containsKeyColumn("h_UNIT_QTY_TYP") && key.geth_UNIT_QTY_TYP() != null) {
					msgKey.setKeyValue("h_UNIT_QTY_TYP", key.geth_UNIT_QTY_TYP());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP") && key.getMRP_ODR_TYP() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP", key.getMRP_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_CD") && key.getJOB_ODR_CD() != null) {
					msgKey.setKeyValue("JOB_ODR_CD", key.getJOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("h_JOB_ODR_DLV_DATE") && key.geth_JOB_ODR_DLV_DATE() != null) {
					msgKey.setKeyValue("h_JOB_ODR_DLV_DATE", key.geth_JOB_ODR_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("h_PARENT_OD_NO") && key.geth_PARENT_OD_NO() != null) {
					msgKey.setKeyValue("h_PARENT_OD_NO", key.geth_PARENT_OD_NO());
				}
				if(msgKeyType.containsKeyColumn("h_DUE_DATE") && key.geth_DUE_DATE() != null) {
					msgKey.setKeyValue("h_DUE_DATE", key.geth_DUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("h_BUSINESS_OPR_DATE") && key.geth_BUSINESS_OPR_DATE() != null) {
					msgKey.setKeyValue("h_BUSINESS_OPR_DATE", key.geth_BUSINESS_OPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("h_MODIFY_COUNT") && key.geth_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("h_MODIFY_COUNT", key.geth_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("FIXED_LT") && key.getFIXED_LT() != null) {
					msgKey.setKeyValue("FIXED_LT", key.getFIXED_LT());
				}
				if(msgKeyType.containsKeyColumn("PROP_LT") && key.getPROP_LT() != null) {
					msgKey.setKeyValue("PROP_LT", key.getPROP_LT());
				}
				if(msgKeyType.containsKeyColumn("SAFETY_LT") && key.getSAFETY_LT() != null) {
					msgKey.setKeyValue("SAFETY_LT", key.getSAFETY_LT());
				}
				if(msgKeyType.containsKeyColumn("PROP_LOT_SIZE") && key.getPROP_LOT_SIZE() != null) {
					msgKey.setKeyValue("PROP_LOT_SIZE", key.getPROP_LOT_SIZE());
				}
				if(msgKeyType.containsKeyColumn("ODR_START_DATE") && key.getODR_START_DATE() != null) {
					msgKey.setKeyValue("ODR_START_DATE", key.getODR_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("h_JOB_ODR_DLV_DATE_TIME") && key.geth_JOB_ODR_DLV_DATE_TIME() != null) {
					msgKey.setKeyValue("h_JOB_ODR_DLV_DATE_TIME", key.geth_JOB_ODR_DLV_DATE_TIME());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_TYP") && key.getJOB_ODR_TYP() != null) {
					msgKey.setKeyValue("JOB_ODR_TYP", key.getJOB_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("h_PROC_NO") && key.geth_PROC_NO() != null) {
					msgKey.setKeyValue("h_PROC_NO", key.geth_PROC_NO());
				}
				if(msgKeyType.containsKeyColumn("WORK_ODR_DLV_DATE") && key.getWORK_ODR_DLV_DATE() != null) {
					msgKey.setKeyValue("WORK_ODR_DLV_DATE", key.getWORK_ODR_DLV_DATE());
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
				if(msgKeyType.containsKeyColumn("PUCH_ODR_PERSON") && key.getPUCH_ODR_PERSON() != null) {
					msgKey.setKeyValue("PUCH_ODR_PERSON", key.getPUCH_ODR_PERSON());
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
				if(msgKeyType.containsKeyColumn("SPL_ITEM_TYP") && key.getSPL_ITEM_TYP() != null) {
					msgKey.setKeyValue("SPL_ITEM_TYP", key.getSPL_ITEM_TYP());
				}
				if(msgKeyType.containsKeyColumn("ACPT_INSPC_TYP") && key.getACPT_INSPC_TYP() != null) {
					msgKey.setKeyValue("ACPT_INSPC_TYP", key.getACPT_INSPC_TYP());
				}
				if(msgKeyType.containsKeyColumn("RATE_JUDGE_DATE") && key.getRATE_JUDGE_DATE() != null) {
					msgKey.setKeyValue("RATE_JUDGE_DATE", key.getRATE_JUDGE_DATE());
				}
				if(msgKeyType.containsKeyColumn("TAX_RATE_1") && key.getTAX_RATE_1() != null) {
					msgKey.setKeyValue("TAX_RATE_1", key.getTAX_RATE_1());
				}
				if(msgKeyType.containsKeyColumn("TAX_RATE_2") && key.getTAX_RATE_2() != null) {
					msgKey.setKeyValue("TAX_RATE_2", key.getTAX_RATE_2());
				}
				if(msgKeyType.containsKeyColumn("TAX_RATE_3") && key.getTAX_RATE_3() != null) {
					msgKey.setKeyValue("TAX_RATE_3", key.getTAX_RATE_3());
				}
				if(msgKeyType.containsKeyColumn("NET_AMOUNT") && key.getNET_AMOUNT() != null) {
					msgKey.setKeyValue("NET_AMOUNT", key.getNET_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("TAX_AMOUNT_1") && key.getTAX_AMOUNT_1() != null) {
					msgKey.setKeyValue("TAX_AMOUNT_1", key.getTAX_AMOUNT_1());
				}
				if(msgKeyType.containsKeyColumn("TAX_AMOUNT_2") && key.getTAX_AMOUNT_2() != null) {
					msgKey.setKeyValue("TAX_AMOUNT_2", key.getTAX_AMOUNT_2());
				}
				if(msgKeyType.containsKeyColumn("TAX_AMOUNT_3") && key.getTAX_AMOUNT_3() != null) {
					msgKey.setKeyValue("TAX_AMOUNT_3", key.getTAX_AMOUNT_3());
				}
				if(msgKeyType.containsKeyColumn("AMOUNT_INCLUDE_TAX") && key.getAMOUNT_INCLUDE_TAX() != null) {
					msgKey.setKeyValue("AMOUNT_INCLUDE_TAX", key.getAMOUNT_INCLUDE_TAX());
				}
				if(msgKeyType.containsKeyColumn("HOME_CUR_AMOUNT") && key.getHOME_CUR_AMOUNT() != null) {
					msgKey.setKeyValue("HOME_CUR_AMOUNT", key.getHOME_CUR_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("TAX_CD") && key.getTAX_CD() != null) {
					msgKey.setKeyValue("TAX_CD", key.getTAX_CD());
				}
				if(msgKeyType.containsKeyColumn("TAX_ROUND_TYP") && key.getTAX_ROUND_TYP() != null) {
					msgKey.setKeyValue("TAX_ROUND_TYP", key.getTAX_ROUND_TYP());
				}
				if(msgKeyType.containsKeyColumn("WH_CD") && key.getWH_CD() != null) {
					msgKey.setKeyValue("WH_CD", key.getWH_CD());
				}
				if(msgKeyType.containsKeyColumn("EXCH_RATE") && key.getEXCH_RATE() != null) {
					msgKey.setKeyValue("EXCH_RATE", key.getEXCH_RATE());
				}
				if(msgKeyType.containsKeyColumn("EXCH_TYP") && key.getEXCH_TYP() != null) {
					msgKey.setKeyValue("EXCH_TYP", key.getEXCH_TYP());
				}
				if(msgKeyType.containsKeyColumn("CUR_CD") && key.getCUR_CD() != null) {
					msgKey.setKeyValue("CUR_CD", key.getCUR_CD());
				}
				if(msgKeyType.containsKeyColumn("CUR_NAME") && key.getCUR_NAME() != null) {
					msgKey.setKeyValue("CUR_NAME", key.getCUR_NAME());
				}
				if(msgKeyType.containsKeyColumn("VEND_CUR_UNIT") && key.getVEND_CUR_UNIT() != null) {
					msgKey.setKeyValue("VEND_CUR_UNIT", key.getVEND_CUR_UNIT());
				}
				if(msgKeyType.containsKeyColumn("VEND_DECIMAL_FIG") && key.getVEND_DECIMAL_FIG() != null) {
					msgKey.setKeyValue("VEND_DECIMAL_FIG", key.getVEND_DECIMAL_FIG());
				}
				if(msgKeyType.containsKeyColumn("EFF_PHASE_IN_DATE") && key.getEFF_PHASE_IN_DATE() != null) {
					msgKey.setKeyValue("EFF_PHASE_IN_DATE", key.getEFF_PHASE_IN_DATE());
				}
				if(msgKeyType.containsKeyColumn("PUCH_SIZE") && key.getPUCH_SIZE() != null) {
					msgKey.setKeyValue("PUCH_SIZE", key.getPUCH_SIZE());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_START_DATE") && key.getOPR_INST_START_DATE() != null) {
					msgKey.setKeyValue("OPR_INST_START_DATE", key.getOPR_INST_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("TAX_APPLY_TYP") && key.getTAX_APPLY_TYP() != null) {
					msgKey.setKeyValue("TAX_APPLY_TYP", key.getTAX_APPLY_TYP());
				}
				if(msgKeyType.containsKeyColumn("OWN_PERSON_NAME") && key.getOWN_PERSON_NAME() != null) {
					msgKey.setKeyValue("OWN_PERSON_NAME", key.getOWN_PERSON_NAME());
				}
				if(msgKeyType.containsKeyColumn("ROUND_TYP") && key.getROUND_TYP() != null) {
					msgKey.setKeyValue("ROUND_TYP", key.getROUND_TYP());
				}
				if(msgKeyType.containsKeyColumn("HOLIDAY_FLG") && key.getHOLIDAY_FLG() != null) {
					msgKey.setKeyValue("HOLIDAY_FLG", key.getHOLIDAY_FLG());
				}
				if(msgKeyType.containsKeyColumn("DATE") && key.getDATE() != null) {
					msgKey.setKeyValue("DATE", key.getDATE());
				}
				if(msgKeyType.containsKeyColumn("LOG_CD") && key.getLOG_CD() != null) {
					msgKey.setKeyValue("LOG_CD", key.getLOG_CD());
				}
				if(msgKeyType.containsKeyColumn("BUSINESS_NAME") && key.getBUSINESS_NAME() != null) {
					msgKey.setKeyValue("BUSINESS_NAME", key.getBUSINESS_NAME());
				}
				if(msgKeyType.containsKeyColumn("MSG_CD") && key.getMSG_CD() != null) {
					msgKey.setKeyValue("MSG_CD", key.getMSG_CD());
				}
				if(msgKeyType.containsKeyColumn("MSG") && key.getMSG() != null) {
					msgKey.setKeyValue("MSG", key.getMSG());
				}
				if(msgKeyType.containsKeyColumn("DATA_STRING") && key.getDATA_STRING() != null) {
					msgKey.setKeyValue("DATA_STRING", key.getDATA_STRING());
				}
				if(msgKeyType.containsKeyColumn("WORK_ODR_DLV_DATE_TIME") && key.getWORK_ODR_DLV_DATE_TIME() != null) {
					msgKey.setKeyValue("WORK_ODR_DLV_DATE_TIME", key.getWORK_ODR_DLV_DATE_TIME());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_START_DATE_TIME") && key.getOPR_INST_START_DATE_TIME() != null) {
					msgKey.setKeyValue("OPR_INST_START_DATE_TIME", key.getOPR_INST_START_DATE_TIME());
				}
				if(msgKeyType.containsKeyColumn("ITEM_PLANT_CD") && key.getITEM_PLANT_CD() != null) {
					msgKey.setKeyValue("ITEM_PLANT_CD", key.getITEM_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("WS_NAME") && key.getWS_NAME() != null) {
					msgKey.setKeyValue("WS_NAME", key.getWS_NAME());
				}
				if(msgKeyType.containsKeyColumn("WORK_STS_TYP") && key.getWORK_STS_TYP() != null) {
					msgKey.setKeyValue("WORK_STS_TYP", key.getWORK_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("PROC_EXPLOSION_FLG") && key.getPROC_EXPLOSION_FLG() != null) {
					msgKey.setKeyValue("PROC_EXPLOSION_FLG", key.getPROC_EXPLOSION_FLG());
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
				if(msgKeyType.containsKeyColumn("OUTSIDE_TYP") && key.getOUTSIDE_TYP() != null) {
					msgKey.setKeyValue("OUTSIDE_TYP", key.getOUTSIDE_TYP());
				}
				if(msgKeyType.containsKeyColumn("h_ODR_START_DATE") && key.geth_ODR_START_DATE() != null) {
					msgKey.setKeyValue("h_ODR_START_DATE", key.geth_ODR_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("h_ODR_START_DATE_TIME") && key.geth_ODR_START_DATE_TIME() != null) {
					msgKey.setKeyValue("h_ODR_START_DATE_TIME", key.geth_ODR_START_DATE_TIME());
				}
				if(msgKeyType.containsKeyColumn("h_DUE_DATE_TIME") && key.geth_DUE_DATE_TIME() != null) {
					msgKey.setKeyValue("h_DUE_DATE_TIME", key.geth_DUE_DATE_TIME());
				}
				if(msgKeyType.containsKeyColumn("h_MANHOUR_TYP") && key.geth_MANHOUR_TYP() != null) {
					msgKey.setKeyValue("h_MANHOUR_TYP", key.geth_MANHOUR_TYP());
				}
				if(msgKeyType.containsKeyColumn("countOD_NO") && key.getcountOD_NO() != null) {
					msgKey.setKeyValue("countOD_NO", key.getcountOD_NO());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_ALC_CD") && key.getJOB_ODR_ALC_CD() != null) {
					msgKey.setKeyValue("JOB_ODR_ALC_CD", key.getJOB_ODR_ALC_CD());
				}
				if(msgKeyType.containsKeyColumn("TIME_CTRL") && key.getTIME_CTRL() != null) {
					msgKey.setKeyValue("TIME_CTRL", key.getTIME_CTRL());
				}
				if(msgKeyType.containsKeyColumn("ASP_INSTALL_FLG") && key.getASP_INSTALL_FLG() != null) {
					msgKey.setKeyValue("ASP_INSTALL_FLG", key.getASP_INSTALL_FLG());
				}
				if(msgKeyType.containsKeyColumn("CAL_NO") && key.getCAL_NO() != null) {
					msgKey.setKeyValue("CAL_NO", key.getCAL_NO());
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
					AD0010010Struct key = new AD0010010Struct();
					if(msgKeyType.containsKeyColumn("OUTSIDE_TYP_name")) {
						key.setOUTSIDE_TYP_name(msgKey.getKeyValue("OUTSIDE_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("OUTSIDE_TYP_val")) {
						key.setOUTSIDE_TYP_val(msgKey.getKeyValue("OUTSIDE_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("h_SUB_FLG")) {
						key.seth_SUB_FLG(msgKey.getKeyValue("h_SUB_FLG"));
					}
					if(msgKeyType.containsKeyColumn("h_flg")) {
						key.seth_flg(msgKey.getKeyValue("h_flg"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP_DN")) {
						key.setMRP_ODR_TYP_DN(msgKey.getKeyValue("MRP_ODR_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("OPR_RSLT_TYP_DN")) {
						key.setOPR_RSLT_TYP_DN(msgKey.getKeyValue("OPR_RSLT_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("h_OPR_INST_QTY")) {
						key.seth_OPR_INST_QTY(msgKey.getKeyValue("h_OPR_INST_QTY"));
					}
					if(msgKeyType.containsKeyColumn("h_WORK_ODR_CD")) {
						key.seth_WORK_ODR_CD(msgKey.getKeyValue("h_WORK_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("WORK_ODR_CD")) {
						key.setWORK_ODR_CD(msgKey.getKeyValue("WORK_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("OD_NO")) {
						key.setOD_NO(msgKey.getKeyValue("OD_NO"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("WS_CD")) {
						key.setWS_CD(msgKey.getKeyValue("WS_CD"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_START_DATE_ALL")) {
						key.setOPR_INST_START_DATE_ALL(msgKey.getKeyValue("OPR_INST_START_DATE_ALL"));
					}
					if(msgKeyType.containsKeyColumn("WORK_ODR_DLV_DATE_ALL")) {
						key.setWORK_ODR_DLV_DATE_ALL(msgKey.getKeyValue("WORK_ODR_DLV_DATE_ALL"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_QTY")) {
						key.setOPR_INST_QTY(msgKey.getKeyValue("OPR_INST_QTY"));
					}
					if(msgKeyType.containsKeyColumn("OPR_RSLT_TYP")) {
						key.setOPR_RSLT_TYP(msgKey.getKeyValue("OPR_RSLT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("WORK_IN_PROC_COMMENT")) {
						key.setWORK_IN_PROC_COMMENT(msgKey.getKeyValue("WORK_IN_PROC_COMMENT"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_CD")) {
						key.setOPR_INST_CD(msgKey.getKeyValue("OPR_INST_CD"));
					}
					if(msgKeyType.containsKeyColumn("CREATED_BY")) {
						key.setCREATED_BY(msgKey.getKeyValue("CREATED_BY"));
					}
					if(msgKeyType.containsKeyColumn("CREATED_PRG_NM")) {
						key.setCREATED_PRG_NM(msgKey.getKeyValue("CREATED_PRG_NM"));
					}
					if(msgKeyType.containsKeyColumn("UPDATED_BY")) {
						key.setUPDATED_BY(msgKey.getKeyValue("UPDATED_BY"));
					}
					if(msgKeyType.containsKeyColumn("UPDATED_PRG_NM")) {
						key.setUPDATED_PRG_NM(msgKey.getKeyValue("UPDATED_PRG_NM"));
					}
					if(msgKeyType.containsKeyColumn("h_UNIT_QTY_TYP")) {
						key.seth_UNIT_QTY_TYP(msgKey.getKeyValue("h_UNIT_QTY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP")) {
						key.setMRP_ODR_TYP(msgKey.getKeyValue("MRP_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_CD")) {
						key.setJOB_ODR_CD(msgKey.getKeyValue("JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_JOB_ODR_DLV_DATE")) {
						key.seth_JOB_ODR_DLV_DATE(msgKey.getKeyValue("h_JOB_ODR_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("h_PARENT_OD_NO")) {
						key.seth_PARENT_OD_NO(msgKey.getKeyValue("h_PARENT_OD_NO"));
					}
					if(msgKeyType.containsKeyColumn("h_DUE_DATE")) {
						key.seth_DUE_DATE(msgKey.getKeyValue("h_DUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("h_BUSINESS_OPR_DATE")) {
						key.seth_BUSINESS_OPR_DATE(msgKey.getKeyValue("h_BUSINESS_OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("h_MODIFY_COUNT")) {
						key.seth_MODIFY_COUNT(msgKey.getKeyValue("h_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("FIXED_LT")) {
						key.setFIXED_LT(msgKey.getKeyValue("FIXED_LT"));
					}
					if(msgKeyType.containsKeyColumn("PROP_LT")) {
						key.setPROP_LT(msgKey.getKeyValue("PROP_LT"));
					}
					if(msgKeyType.containsKeyColumn("SAFETY_LT")) {
						key.setSAFETY_LT(msgKey.getKeyValue("SAFETY_LT"));
					}
					if(msgKeyType.containsKeyColumn("PROP_LOT_SIZE")) {
						key.setPROP_LOT_SIZE(msgKey.getKeyValue("PROP_LOT_SIZE"));
					}
					if(msgKeyType.containsKeyColumn("ODR_START_DATE")) {
						key.setODR_START_DATE(msgKey.getKeyValue("ODR_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("h_JOB_ODR_DLV_DATE_TIME")) {
						key.seth_JOB_ODR_DLV_DATE_TIME(msgKey.getKeyValue("h_JOB_ODR_DLV_DATE_TIME"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_TYP")) {
						key.setJOB_ODR_TYP(msgKey.getKeyValue("JOB_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("h_PROC_NO")) {
						key.seth_PROC_NO(msgKey.getKeyValue("h_PROC_NO"));
					}
					if(msgKeyType.containsKeyColumn("WORK_ODR_DLV_DATE")) {
						key.setWORK_ODR_DLV_DATE(msgKey.getKeyValue("WORK_ODR_DLV_DATE"));
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
					if(msgKeyType.containsKeyColumn("PUCH_ODR_PERSON")) {
						key.setPUCH_ODR_PERSON(msgKey.getKeyValue("PUCH_ODR_PERSON"));
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
					if(msgKeyType.containsKeyColumn("SPL_ITEM_TYP")) {
						key.setSPL_ITEM_TYP(msgKey.getKeyValue("SPL_ITEM_TYP"));
					}
					if(msgKeyType.containsKeyColumn("ACPT_INSPC_TYP")) {
						key.setACPT_INSPC_TYP(msgKey.getKeyValue("ACPT_INSPC_TYP"));
					}
					if(msgKeyType.containsKeyColumn("RATE_JUDGE_DATE")) {
						key.setRATE_JUDGE_DATE(msgKey.getKeyValue("RATE_JUDGE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("TAX_RATE_1")) {
						key.setTAX_RATE_1(msgKey.getKeyValue("TAX_RATE_1"));
					}
					if(msgKeyType.containsKeyColumn("TAX_RATE_2")) {
						key.setTAX_RATE_2(msgKey.getKeyValue("TAX_RATE_2"));
					}
					if(msgKeyType.containsKeyColumn("TAX_RATE_3")) {
						key.setTAX_RATE_3(msgKey.getKeyValue("TAX_RATE_3"));
					}
					if(msgKeyType.containsKeyColumn("NET_AMOUNT")) {
						key.setNET_AMOUNT(msgKey.getKeyValue("NET_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("TAX_AMOUNT_1")) {
						key.setTAX_AMOUNT_1(msgKey.getKeyValue("TAX_AMOUNT_1"));
					}
					if(msgKeyType.containsKeyColumn("TAX_AMOUNT_2")) {
						key.setTAX_AMOUNT_2(msgKey.getKeyValue("TAX_AMOUNT_2"));
					}
					if(msgKeyType.containsKeyColumn("TAX_AMOUNT_3")) {
						key.setTAX_AMOUNT_3(msgKey.getKeyValue("TAX_AMOUNT_3"));
					}
					if(msgKeyType.containsKeyColumn("AMOUNT_INCLUDE_TAX")) {
						key.setAMOUNT_INCLUDE_TAX(msgKey.getKeyValue("AMOUNT_INCLUDE_TAX"));
					}
					if(msgKeyType.containsKeyColumn("HOME_CUR_AMOUNT")) {
						key.setHOME_CUR_AMOUNT(msgKey.getKeyValue("HOME_CUR_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("TAX_CD")) {
						key.setTAX_CD(msgKey.getKeyValue("TAX_CD"));
					}
					if(msgKeyType.containsKeyColumn("TAX_ROUND_TYP")) {
						key.setTAX_ROUND_TYP(msgKey.getKeyValue("TAX_ROUND_TYP"));
					}
					if(msgKeyType.containsKeyColumn("WH_CD")) {
						key.setWH_CD(msgKey.getKeyValue("WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("EXCH_RATE")) {
						key.setEXCH_RATE(msgKey.getKeyValue("EXCH_RATE"));
					}
					if(msgKeyType.containsKeyColumn("EXCH_TYP")) {
						key.setEXCH_TYP(msgKey.getKeyValue("EXCH_TYP"));
					}
					if(msgKeyType.containsKeyColumn("CUR_CD")) {
						key.setCUR_CD(msgKey.getKeyValue("CUR_CD"));
					}
					if(msgKeyType.containsKeyColumn("CUR_NAME")) {
						key.setCUR_NAME(msgKey.getKeyValue("CUR_NAME"));
					}
					if(msgKeyType.containsKeyColumn("VEND_CUR_UNIT")) {
						key.setVEND_CUR_UNIT(msgKey.getKeyValue("VEND_CUR_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("VEND_DECIMAL_FIG")) {
						key.setVEND_DECIMAL_FIG(msgKey.getKeyValue("VEND_DECIMAL_FIG"));
					}
					if(msgKeyType.containsKeyColumn("EFF_PHASE_IN_DATE")) {
						key.setEFF_PHASE_IN_DATE(msgKey.getKeyValue("EFF_PHASE_IN_DATE"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_SIZE")) {
						key.setPUCH_SIZE(msgKey.getKeyValue("PUCH_SIZE"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_START_DATE")) {
						key.setOPR_INST_START_DATE(msgKey.getKeyValue("OPR_INST_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("TAX_APPLY_TYP")) {
						key.setTAX_APPLY_TYP(msgKey.getKeyValue("TAX_APPLY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("OWN_PERSON_NAME")) {
						key.setOWN_PERSON_NAME(msgKey.getKeyValue("OWN_PERSON_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ROUND_TYP")) {
						key.setROUND_TYP(msgKey.getKeyValue("ROUND_TYP"));
					}
					if(msgKeyType.containsKeyColumn("HOLIDAY_FLG")) {
						key.setHOLIDAY_FLG(msgKey.getKeyValue("HOLIDAY_FLG"));
					}
					if(msgKeyType.containsKeyColumn("DATE")) {
						key.setDATE(msgKey.getKeyValue("DATE"));
					}
					if(msgKeyType.containsKeyColumn("LOG_CD")) {
						key.setLOG_CD(msgKey.getKeyValue("LOG_CD"));
					}
					if(msgKeyType.containsKeyColumn("BUSINESS_NAME")) {
						key.setBUSINESS_NAME(msgKey.getKeyValue("BUSINESS_NAME"));
					}
					if(msgKeyType.containsKeyColumn("MSG_CD")) {
						key.setMSG_CD(msgKey.getKeyValue("MSG_CD"));
					}
					if(msgKeyType.containsKeyColumn("MSG")) {
						key.setMSG(msgKey.getKeyValue("MSG"));
					}
					if(msgKeyType.containsKeyColumn("DATA_STRING")) {
						key.setDATA_STRING(msgKey.getKeyValue("DATA_STRING"));
					}
					if(msgKeyType.containsKeyColumn("WORK_ODR_DLV_DATE_TIME")) {
						key.setWORK_ODR_DLV_DATE_TIME(msgKey.getKeyValue("WORK_ODR_DLV_DATE_TIME"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_START_DATE_TIME")) {
						key.setOPR_INST_START_DATE_TIME(msgKey.getKeyValue("OPR_INST_START_DATE_TIME"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_PLANT_CD")) {
						key.setITEM_PLANT_CD(msgKey.getKeyValue("ITEM_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("WS_NAME")) {
						key.setWS_NAME(msgKey.getKeyValue("WS_NAME"));
					}
					if(msgKeyType.containsKeyColumn("WORK_STS_TYP")) {
						key.setWORK_STS_TYP(msgKey.getKeyValue("WORK_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PROC_EXPLOSION_FLG")) {
						key.setPROC_EXPLOSION_FLG(msgKey.getKeyValue("PROC_EXPLOSION_FLG"));
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
					if(msgKeyType.containsKeyColumn("OUTSIDE_TYP")) {
						key.setOUTSIDE_TYP(msgKey.getKeyValue("OUTSIDE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("h_ODR_START_DATE")) {
						key.seth_ODR_START_DATE(msgKey.getKeyValue("h_ODR_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("h_ODR_START_DATE_TIME")) {
						key.seth_ODR_START_DATE_TIME(msgKey.getKeyValue("h_ODR_START_DATE_TIME"));
					}
					if(msgKeyType.containsKeyColumn("h_DUE_DATE_TIME")) {
						key.seth_DUE_DATE_TIME(msgKey.getKeyValue("h_DUE_DATE_TIME"));
					}
					if(msgKeyType.containsKeyColumn("h_MANHOUR_TYP")) {
						key.seth_MANHOUR_TYP(msgKey.getKeyValue("h_MANHOUR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("countOD_NO")) {
						key.setcountOD_NO(msgKey.getKeyValue("countOD_NO"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_ALC_CD")) {
						key.setJOB_ODR_ALC_CD(msgKey.getKeyValue("JOB_ODR_ALC_CD"));
					}
					if(msgKeyType.containsKeyColumn("TIME_CTRL")) {
						key.setTIME_CTRL(msgKey.getKeyValue("TIME_CTRL"));
					}
					if(msgKeyType.containsKeyColumn("ASP_INSTALL_FLG")) {
						key.setASP_INSTALL_FLG(msgKey.getKeyValue("ASP_INSTALL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("CAL_NO")) {
						key.setCAL_NO(msgKey.getKeyValue("CAL_NO"));
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
