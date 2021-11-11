/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AD0030/src/com/nec/jp/orteus/metamorBase/AD0030/AD0030030Control.java,v $
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

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.math.BigDecimal;

import com.nec.jp.orteus.metamorBase.common.CollectNumber.CollectNumber;
import com.nec.jp.orteus.metamorBase.common01.util.Calculate;
import com.nec.jp.orteus.metamorBase.common04.amount.AmountCalculator;
import com.nec.jp.orteus.metamorBase.common04.amount.CurControl;
import com.nec.jp.orteus.metamorBase.common04.amount.CurStruct;
import com.nec.jp.orteus.metamorBase.common04.amount.ExchRateControl;
import com.nec.jp.orteus.metamorBase.common04.amount.ExchRateStruct;
import com.nec.jp.orteus.metamorBase.common04.amount.TaxControl;
import com.nec.jp.orteus.metamorBase.common04.amount.TaxStruct;
import com.nec.jp.orteus.metamorBase.common04.sysdata.HomeCurControl;
import com.nec.jp.orteus.metamorBase.common04.sysdata.HomeCurStruct;
import com.nec.jp.orteus.metamorBase.common04.util.DataNotFoundException;
import com.nec.jp.orteus.expj.pr.rcvissue.process.ValidateWh;

//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AD0030030Control
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
	public AD0030030Struct getListvalue(int x) { return (AD0030030Struct)(this.list.get(x)); }	// リストの値を返します。
	public AD0030030Struct getStruct() { return this.struct; }	// Structを返します。
	public AD0030030Struct createStruct() { return new AD0030030Struct(); }	// 新しいStructを作って返します。
	public void setStruct(Object structname) { this.struct.setStruct((AD0030030Struct)structname); }	// Structをセットします。
	public void initializeStruct() { this.struct.initialize(); }	// Structの値を初期化します。

	// CSV出力用リスト
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }

//------------------------------------------------------------------------------
	/** システムログメッセージ作成用 */
	private StringBuffer _sysLogMessage = null;

	/** 出庫指示処理の処理件数 */
	private int _debugParentCount = 0;
	/** 出庫指示処理の処理件数 */
	private int _debugAllCount = 0;

	/** 日付処理用 */
	DateFormat df = DateFormat.getDateInstance();
	/** 邦貨情報データクラス */
	HomeCurStruct sysHomeCurStruct = new HomeCurStruct();

	/** 発注番号 */
	String puchCd = null;

	/** 『選択更新』ボタン押下時の、「対象データがありません」表示判定用 */
	private int _messageSetFlg = 0;


	/**
	 * Orteus標準Structの値を対象Structにコピーします。
	 * @param target コピー対象となるStruct
	 */
	private void setStandardItem(AD0030030Struct target){

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
		msgStruct.addError(emsg);
	}
	/**
	 * 業務ロジックのエラーメッセージ補助項目設定処理を切り出して関数化
	 * @param db1 データベース項目１
	 * @param value1 置換文字列１
	 * @param db2 データベース項目２
	 * @param value2 置換文字列２
	 */
	private void setSupportMessage(String db1, String value1, String db2, String value2) {
		_sysLogMessage = new StringBuffer();
		_sysLogMessage.append(db1);
		_sysLogMessage.append(":");
		_sysLogMessage.append(value1);
		_sysLogMessage.append(",");
		_sysLogMessage.append(db2);
		_sysLogMessage.append(":");
		_sysLogMessage.append(value2);
		ExpjMessage emsg = new ExpjMessage("ZZ01006", _sysLogMessage.toString());
		msgStruct.addError(emsg);
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
	 * 画面の全項目を初期化
	 */
	public void initializeAll() {
		
		this.struct.setOPR_INST_START_DATE(null); //着手日
		this.struct.setOPR_INST_START_TIME(null); //着手日時間
		this.struct.setWORK_ODR_DLV_DATE(null);   //納期
		this.struct.setWORK_ODR_DLV_TIME(null);   //納期時間
		this.struct.setJOB_ODR_CD(null);          //製番
		this.struct.setITEM_CD(null);             //品目番号
		this.struct.setWS_CD(null);               //作業区コード
		this.struct.setVEND_CD(null);             //取引先コード
		this.struct.setITEM_NAME(null);
		this.struct.setWS_NAME(null);
		this.struct.setVEND_ANAME(null);

		this.struct.setr1_FILTER1("true");
		this.struct.setr2_FILTER1(null);
		this.struct.setc_OUTPUT_RSLT("true");
		this.struct.setc_OUTSIDE_TYP_IN("true");
		this.struct.setc_OUTSIDE_TYP_OUT("true");
	}

	/**
	 * 全リストを初期化
	 */
	public void listClear() {
		if(this.list != null && this.list.size() > 0){
			this.list.clear();
		}
	}

	/**
	 * 選択更新ボタン押下時の選択行の更新処理を行います。（選択行ごとのCommit処理）
	 * @param selectedStruct 選択更新の対象行のデータ
	 * @throws ExpjException
	 * @throws FoundationException
	 * @throws SQLException
	 * @throws ParseException
	 */
	private void UpdateAssort(AD0030030Struct selectedStruct) 
			throws ExpjException, FoundationException, SQLException, ParseException {
		
		try {
			//品目別仕掛テーブルを更新する(指示済みでない場合)
			List byItemList = new ArrayList();
			byItemList = entity.mSelectChkWorkItem.read(conn, struct);
						
			if (byItemList.isEmpty()) {
				//データが存在しない
				setErrorMessage("ZZ01101");
				setWarningSysLogMessage("V_WORK_ODR_LST.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//作業計画番号
				setWarningSysLogMessage("V_WORK_ODR_LST.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//仕掛作業コード
				setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//作業計画番号
				return;
			}
			AD0030030Struct byItemStruct = new AD0030030Struct();
			byItemStruct = (AD0030030Struct)byItemList.get(0);
			setStandardItem(byItemStruct);
			byItemStruct.setWORK_ODR_CD(struct.getWORK_ODR_CD());
			byItemStruct.setOPR_INST_DATE(struct.getBUSINESS_OPR_DATE());
						
			if (byItemStruct.getWORK_STS_TYP() != null 
					&& !("2".equals(byItemStruct.getWORK_STS_TYP()))) {
				//品目仕掛の更新(指示済み更新)
				entity.mupdateWORK_IN_PROC_BY_ITEM.update(conn, byItemStruct);
			}
						
			//作業指示の場合、作業系列仕掛を更新する
			if ("2".equals(selectedStruct.getl_OPR_RSLT_TYP())) {
			
				//作業仕掛存在チェック
				List modifyCountList = new ArrayList();
				modifyCountList = entity.mSelectChkWorkProc.read(conn,struct);
				if (modifyCountList.isEmpty()) {
					//指定キーのデータが存在しません。
					setErrorMessage("ZZ01101");
					setWarningSysLogMessage("V_WORK_ODR_LST.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//作業計画番号
					setWarningSysLogMessage("V_WORK_ODR_LST.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//仕掛作業コード
					return;
				}
						
				//作業仕掛ModifyCountチェック
				AD0030030Struct modifyCountStruct = new AD0030030Struct();
				modifyCountStruct = (AD0030030Struct)modifyCountList.get(0);
				setStandardItem(modifyCountStruct);
				if(modifyCountStruct.getCHECK_MODIFY_COUNT() != null 
						&& !selectedStruct.geth_MODIFY_COUNT().equals(
						modifyCountStruct.getCHECK_MODIFY_COUNT())){
					//他の処理によりデータが書き換えられています。メニューに戻ってやり直して下さい。
					setErrorMessage("ZZ01105");
					setWarningSysLogMessage("V_WORK_ODR_LST.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//作業計画番号
					setWarningSysLogMessage("V_WORK_ODR_LST.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//仕掛作業コード
					return;
				}
				
				AD0030030Struct byProcStruct = new AD0030030Struct(); 
				setStandardItem(byProcStruct);
				byProcStruct.setWORK_ODR_CD(struct.getWORK_ODR_CD());
				byProcStruct.setWORK_IN_PROC_CD(struct.getWORK_IN_PROC_CD());
				byProcStruct.setOPR_INST_DATE(struct.getBUSINESS_OPR_DATE());
				
				//作業系列別仕掛を更新する
				entity.mupdateT_WORK_IN_PROC_BY_PROC.update(conn, byProcStruct);
						
			}
			
			
			//発注番号
			puchCd = null;
						
			//作業指示でかつ外作の場合、発注残処理
			if ("2".equals(selectedStruct.getl_OPR_RSLT_TYP()) 
					&& "2".equals(selectedStruct.getOUTSIDE_TYP())) {
			
				//発注残の登録
				if( !insertPuch(selectedStruct) ){
					return;
				}
			}
									
						
			AD0030030Struct minProcNoStruct = new AD0030030Struct();
			//作業系列別仕掛の系列番号最小のレコードを取得する。
			if ("2".equals(selectedStruct.getl_OPR_RSLT_TYP())) {
				List minProcNoList = new ArrayList();
				minProcNoList = entity.mSelectMinPROC.read(conn, struct);
				if (minProcNoList.isEmpty()) {
					setErrorMessage("ZZ06001");
					setWarningSysLogMessage("V_WORK_ODR_LST.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//作業計画番号
					setWarningSysLogMessage("V_WORK_ODR_LST.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//仕掛作業コード
					return;
				}
				minProcNoStruct = (AD0030030Struct)minProcNoList.get(0);
				setStandardItem(minProcNoStruct);
			}
						
			//出来高もしくは作業指示かつ初工程のみ出庫指示処理を行う
			if ("1".equals(selectedStruct.getl_OPR_RSLT_TYP())
					|| ("2".equals(selectedStruct.getl_OPR_RSLT_TYP())
					&& minProcNoStruct.getPROC_NO() != null
					&& Integer.parseInt(minProcNoStruct.getPROC_NO())
					== Integer.parseInt(selectedStruct.getPROC_NO()))) {
							
				//出庫指示処理
				insertIssue(selectedStruct);
			}
						
			conn.commit();

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
	}

	/**
	 * 発注残の登録を行います。
	 * @param selectedStruct 選択更新の対象行のデータ
	 * @throws FoundationException
	 * @return true/false エラーが発生した場合 false
	 * @throws SQLException
	 */
	private boolean insertPuch(AD0030030Struct selectedStruct) 
			throws FoundationException, SQLException {

		//まるめ区分
		String roundTyp = "";
		
		//作業系列別仕掛より発注残に登録するデータを取得し、設定する
		List byProcList = new ArrayList();
		byProcList = entity.mselectT_WORK_IN_PROC_BY_PROC.read(conn, struct);
		if (byProcList.isEmpty()) {
			//データが存在しない
			setErrorMessage("ZZ01101");
			setWarningSysLogMessage("V_WORK_ODR_LST.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//作業計画番号
			setWarningSysLogMessage("V_WORK_ODR_LST.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//仕掛作業コード
			setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//作業計画番号
			return false;
		}
		AD0030030Struct puchStruct = new AD0030030Struct();
		puchStruct = (AD0030030Struct)byProcList.get(0);
		setStandardItem(puchStruct);

		puchStruct.setOPR_INST_DATE(struct.getBUSINESS_OPR_DATE());
		puchStruct.setWORK_ODR_CD(struct.getWORK_ODR_CD());
		puchStruct.setWORK_IN_PROC_CD(struct.getWORK_IN_PROC_CD());
		puchStruct.setPLANT_CD(getsysPLANT_CD());

		//発注着手日:［作業系列別仕掛］."作業系列別着手日"
		puchStruct.setPUCH_ODR_START_DATE(puchStruct.getOPR_INST_START_DATE());
		//発注納期:［作業系列別仕掛］."作業系列別製造納期"
		puchStruct.setPUCH_ODR_DLV_DATE(puchStruct.getWORK_ODR_DLV_DATE());
		//発注数:［作業系列別仕掛］."作業指示数"
		puchStruct.setPUCH_ODR_QTY(puchStruct.getOPR_INST_QTY());
		selectedStruct.setOPR_INST_QTY(puchStruct.getOPR_INST_QTY());
		//発注指示日:［作業系列別仕掛］."作業系列別作業指示日"
		puchStruct.setPUCH_ODR_INST_DATE(puchStruct.getOPR_INST_DATE());
		//発注備考:［作業系列別仕掛］."作業系列別仕掛備考"
		puchStruct.setPUCH_ODR_COMMENT(puchStruct.getWORK_IN_PROC_COMMENT());
		//レート判定日:［作業系列別仕掛］."作業系列別製造納期"
		puchStruct.setRATE_JUDGE_DATE(puchStruct.getWORK_ODR_DLV_DATE());
	
	
		//発注番号の採番
		CollectNumber PUCH_CD = 
				new CollectNumber(CollectNumber.PUCH_CD,
					this.sysUSER_CD,
					this.sp.getProcId(),
					this.sysPLANT_CD);
		puchCd = PUCH_CD.getNo();
		puchStruct.setPUCH_ODR_CD(puchCd);
		struct.setPUCH_ODR_CD(puchCd);
	
		//品目より発注残に登録するデータを取得し、設定する
		List insertList = new ArrayList();
		insertList = entity.mselectM_ITEM.read(conn, puchStruct);
		if (insertList.isEmpty()) {
			//データが存在しない
			setErrorMessage("ZZ01101");
			setWarningSysLogMessage("V_WORK_ODR_LST.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//作業計画番号
			setWarningSysLogMessage("V_WORK_ODR_LST.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//仕掛作業コード
			setWarningSysLogMessage("M_ITEM.ITEM_CD", puchStruct.getl_ITEM_CD());//品目コード
			return false;
		}
		AD0030030Struct insertStruct = new AD0030030Struct();
		insertStruct = (AD0030030Struct)insertList.get(0);
		setStandardItem(insertStruct);
	
		//受給品区分:［品目］."受給品区分"
		puchStruct.setSPL_ITEM_TYP(insertStruct.getSPL_ITEM_TYP());
				
		this.struct.setPLANT_CD(getsysPLANT_CD());
		// 受け入れ保管区の既定値取得
		String strWhCd = ValidateWh.getDefaultRcv(conn, struct.getPLANT_CD(), puchStruct.getl_ITEM_CD());
		if("".equals(strWhCd)){
			//データが存在しない
			setErrorMessage("AD10001");
			setWarningSysLogMessage("V_WORK_ODR_LST.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//作業計画番号
			setWarningSysLogMessage("V_WORK_ODR_LST.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//仕掛作業コード
			setWarningSysLogMessage("M_PLANT.PLANT_CD", struct.getPLANT_CD());
			setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.ITEM_CD", puchStruct.getl_ITEM_CD());
			return false;
		} else {
			puchStruct.setWH_CD(strWhCd);
		}
	
		//取引先マスタより発注残に登録するデータを取得し、設定する
		insertList = new ArrayList();
		insertList = entity.mselectM_VEND_CTRL.read(conn, puchStruct);
		if (insertList.isEmpty()) {
			//データが存在しない
			setErrorMessage("ZZ01101");
			setWarningSysLogMessage("V_WORK_ODR_LST.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//作業計画番号
			setWarningSysLogMessage("V_WORK_ODR_LST.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//仕掛作業コード
			setWarningSysLogMessage("M_VEND_CTRL.VEND_CD", puchStruct.getVEND_CD());//取引先コード
			return false;
		}
	
		insertStruct = new AD0030030Struct();
		insertStruct = (AD0030030Struct)insertList.get(0);
		setStandardItem(insertStruct);
	
		//発注担当者
		puchStruct.setPUCH_ODR_PERSON("");
		//為替レート
		puchStruct.setEXCH_TYP(insertStruct.getEXCH_TYP());
		//通貨コード
		puchStruct.setCUR_CD(insertStruct.getCUR_CD());
	
	
		try {
			// 消費税情報を取得
			TaxStruct ts =
				TaxControl.getData(
					this.conn,
					puchStruct.getCOMPANY_CD(),
					puchStruct.getVEND_CD(),
					puchStruct.getITEM_CD(),
					puchStruct.getPUCH_ODR_DLV_DATE()); //発注納期
	
			//税コード:"消費税コード
			puchStruct.setTAX_CD(ts.getTAX_CD());
			//税端数区分:[取引先]．"金額まるめ区分
			puchStruct.setTAX_ROUND_TYP(ts.getTAX_ROUND_TYP());
	
			// TAX_CDの下1桁が1以外の場合は税率を0とする。
			String lowerTaxCd =
				ts.getTAX_CD().substring(ts.getTAX_CD().length() - 1);
			if ("1".equals(lowerTaxCd)) {
				puchStruct.setTAX_RATE_1(ts.getTAX_RATE_1());
				puchStruct.setTAX_RATE_2(ts.getTAX_RATE_2());
				puchStruct.setTAX_RATE_3(ts.getTAX_RATE_3());
			} else {
				puchStruct.setTAX_RATE_1("0.0");
				puchStruct.setTAX_RATE_2("0.0");
				puchStruct.setTAX_RATE_3("0.0");
			}
		} catch (DataNotFoundException e) {
			//税端数区分
			puchStruct.setTAX_ROUND_TYP("1");
			puchStruct.setTAX_RATE_1("0.0");
			puchStruct.setTAX_RATE_2("0.0");
			puchStruct.setTAX_RATE_3("0.0");
		}
	
	
		try {
			roundTyp = "";
			// 通貨情報を取得
			CurStruct cs =
				CurControl.getData(
					this.conn,
					puchStruct.getCOMPANY_CD(),
					puchStruct.getVEND_CD());
	
			roundTyp = cs.getROUND_TYP();
			puchStruct.setVEND_DECIMAL_FIG(cs.getDECIMAL_FIG());
	
	
		} catch (DataNotFoundException e) {
			setErrorMessage("ZZ01101");
			setWarningSysLogMessage("V_WORK_ODR_LST.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//作業計画番号
			setWarningSysLogMessage("V_WORK_ODR_LST.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//仕掛作業コード
			setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//作業計画番号
			return false;
		}
	
		if (!("2".equals(puchStruct.getEXCH_TYP()))) {
			try{
				// 為替レート情報を取得
				ExchRateStruct ers =
					ExchRateControl.getData(
						this.conn,
						puchStruct.getCOMPANY_CD(),
						puchStruct.getCUR_CD(),
						puchStruct.getEXCH_TYP(),
						null,
						puchStruct.getPUCH_ODR_DLV_DATE());
	
				puchStruct.setEXCH_RATE(ers.getEXCH_RATE());
	
			} catch (DataNotFoundException e) {
				//レート判定日	NULL
				puchStruct.setRATE_JUDGE_DATE("");
				// 為替レート	0
				puchStruct.setEXCH_RATE("0");
				// 邦貨金額	0
				puchStruct.setHOME_CUR_AMOUNT("0");
			}
		} else {
			//レート判定日	NULL
			puchStruct.setRATE_JUDGE_DATE("");
			// 為替レート	0
			puchStruct.setEXCH_RATE("0");
			// 邦貨金額	0
			puchStruct.setHOME_CUR_AMOUNT("0");
		}
	
	
		// 本体金額の計算
		String netAmount =
				AmountCalculator.calcNetAmount(
					puchStruct.getPUCH_ODR_AMOUNT(),
					puchStruct.getDISC_AMOUNT());
		puchStruct.setNET_AMOUNT(netAmount);
		// 税額１の計算
		String taxAmount1 =
				AmountCalculator.calcTaxAmount(
					puchStruct.getNET_AMOUNT(),
					puchStruct.getTAX_RATE_1(),
					puchStruct.getTAX_ROUND_TYP(),
					puchStruct.getVEND_DECIMAL_FIG());
		puchStruct.setTAX_AMOUNT_1(taxAmount1);
		// 税額２の計算
		String taxAmount2 =
				AmountCalculator.calcTaxAmount(
					puchStruct.getNET_AMOUNT(),
					puchStruct.getTAX_RATE_2(),
					puchStruct.getTAX_ROUND_TYP(),
					puchStruct.getVEND_DECIMAL_FIG());
		puchStruct.setTAX_AMOUNT_2(taxAmount2);
		// 税額３の計算
		String taxAmount3 =
				AmountCalculator.calcTaxAmount(
					puchStruct.getNET_AMOUNT(),
					puchStruct.getTAX_RATE_3(),
					puchStruct.getTAX_ROUND_TYP(),
					puchStruct.getVEND_DECIMAL_FIG());
		puchStruct.setTAX_AMOUNT_3(taxAmount3);
		// 税込金額の計算
		String amountIncludeTax =
				AmountCalculator.calcAmountIncludeTax(
					puchStruct.getNET_AMOUNT(),
					puchStruct.getTAX_AMOUNT_1(),
					puchStruct.getTAX_AMOUNT_2(),
					puchStruct.getTAX_AMOUNT_3());
		puchStruct.setAMOUNT_INCLUDE_TAX(amountIncludeTax);
	
	
		//為替種別が２の場合、ワーニング
		if ("2".equals(puchStruct.getEXCH_TYP())) {
	
			//レート判定日	NULL
			puchStruct.setRATE_JUDGE_DATE("");
			// 為替レート	0
			puchStruct.setEXCH_RATE("0");
			// 邦貨金額	0
			puchStruct.setHOME_CUR_AMOUNT("0");
			setWarningMessage("AD00098");
			setWarningMessage("AD00099", puchStruct.getPUCH_ODR_CD(), puchStruct.getVEND_CD());
			setInfoSysLogMessage("V_WORK_ODR_LST.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//作業計画番号
			setInfoSysLogMessage("V_WORK_ODR_LST.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//仕掛作業コード
		
		} else {
			//邦貨金額
			String homeCurAmount =
					AmountCalculator.calcHomeCurAmount(
						puchStruct.getAMOUNT_INCLUDE_TAX(),
						puchStruct.getEXCH_RATE(),
						roundTyp,
						this.sysHomeCurStruct.getDECIMAL_FIG());
			puchStruct.setHOME_CUR_AMOUNT(homeCurAmount);
		}
	
		//発注残に登録する。
		entity.minsertT_RLSD_PUCH_ODR.create(conn, puchStruct);

		return true;
	}

	/**
	 * 出庫指示処理を行います。
	 * @param selectedStruct 選択更新の対象行のデータ
	 * @throws FoundationException
	 * @throws SQLException
	 * @throws ParseException
	 */
	private void insertIssue(AD0030030Struct selectedStruct) 
			throws FoundationException, SQLException, ParseException { 
			
		//出庫指示処理（内作）
		_debugParentCount += 1;
		List issueList = new ArrayList();
		AD0030030Struct issueStruct = new AD0030030Struct();
		//システムパラメータ仕損率を取得
		List sysList = entity.mselectSYS_SPOIL_FLG.read(conn, struct);
		AD0030030Struct spoilStruct = (AD0030030Struct)sysList.get(0);
		String SPOIL_FLG = spoilStruct.getSPOIL_FLG();
					
		//所要量データの読込
		List tOdList = new ArrayList();
		tOdList = entity.mreadT_OD.read(conn,struct);
		AD0030030Struct tOdStruct = new AD0030030Struct();
		List tOdList2 = new ArrayList();
		AD0030030Struct tOdStruct2 = new AD0030030Struct();

		//所要量のデータが存在しない場合、出庫指示処理は行わない。
		if (tOdList != null || tOdList.size() > 0) {
			int childCount = 0;
			for (int j = 0; tOdList != null && tOdList.size() > j; j++) {
				issueStruct = new AD0030030Struct();
				setStandardItem(issueStruct);
									
				tOdStruct = (AD0030030Struct)tOdList.get(j);
				setStandardItem(tOdStruct);
								
				//擬似品目の場合
				if ("8".equals(tOdStruct.getMRP_ODR_TYP())) {
					//オーダデマンド番号
					issueStruct.setOD_NO(tOdStruct.getOD_NO());
					// 品目番号
					issueStruct.setITEM_CD(tOdStruct.getITEM_CD());
					// 製品構成版数
					issueStruct.setPS_EDITION(tOdStruct.getPS_EDITION());
					// 製品構成単位数
					issueStruct.setPS_UNIT_QTY(tOdStruct.getPS_UNIT_QTY());
					// 製品構成単位数分母
					issueStruct.setPS_UNIT_DENOMINATOR(tOdStruct.getPS_UNIT_DENOMINATOR());
					// 製品構成単位数分子
					issueStruct.setPS_UNIT_NUMERATOR(tOdStruct.getPS_UNIT_NUMERATOR());
					//構成仕損率
					issueStruct.setPS_SPOIL(tOdStruct.getPS_SPOIL());
					// 出庫指示区分(品目手配区分)
					issueStruct.setMRP_ODR_TYP("9");
					// 擬似品目展開フラグ(0:OFF,1:ON)
					issueStruct.setODINFO_DISGUISE("0");
					// 親オーダデマンド番号
					issueStruct.setPARENT_OD_NO(tOdStruct.getPARENT_OD_NO());
					// 所要量出庫区分
					issueStruct.setISSUE_TYP(tOdStruct.getISSUE_TYP());
					// 所要量工場コード
					issueStruct.setPLANT_CD(tOdStruct.getPLANT_CD());
					// 出庫予定日
					issueStruct.setSCDL_ISSUE_DATE(tOdStruct.getDUE_DATE());
					
					issueList.add(issueStruct);
					_debugAllCount += 1;
					
					//所要量データの読込
					tOdList2 = entity.mSelectT_ODChild.read(conn, tOdStruct);
					for (int k = 0; tOdList2.size() > k; k++) {
						tOdStruct2 = (AD0030030Struct)tOdList2.get(k);
						setStandardItem(tOdStruct2);
					
						issueStruct = new AD0030030Struct();
						setStandardItem(issueStruct);
										
						//オーダデマンド番号
						issueStruct.setOD_NO(tOdStruct2.getOD_NO());
						// 品目番号
						issueStruct.setITEM_CD(tOdStruct2.getITEM_CD());
						// 製品構成版数
						issueStruct.setPS_EDITION(tOdStruct2.getPS_EDITION());
						// 製品構成単位数
						issueStruct.setPS_UNIT_QTY(tOdStruct2.getPS_UNIT_QTY());
						// 製品構成単位数分母
						issueStruct.setPS_UNIT_DENOMINATOR(tOdStruct2.getPS_UNIT_DENOMINATOR());
						// 製品構成単位数分子
						issueStruct.setPS_UNIT_NUMERATOR(tOdStruct2.getPS_UNIT_NUMERATOR());
						//構成仕損率
						issueStruct.setPS_SPOIL(tOdStruct2.getPS_SPOIL());
						// 出庫指示区分(品目手配区分)
						issueStruct.setMRP_ODR_TYP("1");
						// 擬似品目展開フラグ(0:OFF,1:ON)
						issueStruct.setODINFO_DISGUISE("1");
						// 親オーダデマンド番号
						issueStruct.setPARENT_OD_NO(tOdStruct2.getPARENT_OD_NO());
						// 所要量出庫区分
						issueStruct.setISSUE_TYP(tOdStruct2.getISSUE_TYP());
						// 所要量工場コード
						issueStruct.setPLANT_CD(tOdStruct2.getPLANT_CD());
						// 出庫予定日
						issueStruct.setSCDL_ISSUE_DATE(tOdStruct2.getDUE_DATE());
					
						issueList.add(issueStruct);
						_debugAllCount += 1;
						childCount++;
					}
									
				//擬似品目以外	
				} else {
					//オーダデマンド番号
					issueStruct.setOD_NO(tOdStruct.getOD_NO());
					// 品目番号
					issueStruct.setITEM_CD(tOdStruct.getITEM_CD());
					// 製品構成版数
					issueStruct.setPS_EDITION(tOdStruct.getPS_EDITION());
					// 製品構成単位数
					issueStruct.setPS_UNIT_QTY(tOdStruct.getPS_UNIT_QTY());
					// 製品構成単位数分母
					issueStruct.setPS_UNIT_DENOMINATOR(tOdStruct.getPS_UNIT_DENOMINATOR());
					// 製品構成単位数分子
					issueStruct.setPS_UNIT_NUMERATOR(tOdStruct.getPS_UNIT_NUMERATOR());
					//構成仕損率
					issueStruct.setPS_SPOIL(tOdStruct.getPS_SPOIL());
					// 出庫指示区分(品目手配区分)
					issueStruct.setMRP_ODR_TYP("1");
					// 擬似品目展開フラグ(0:OFF,1:ON)
					issueStruct.setODINFO_DISGUISE("0");
					// 親オーダデマンド番号
					issueStruct.setPARENT_OD_NO(tOdStruct.getPARENT_OD_NO());
					// 所要量出庫区分
					issueStruct.setISSUE_TYP(tOdStruct.getISSUE_TYP());
					// 所要量工場コード
					issueStruct.setPLANT_CD(tOdStruct.getPLANT_CD());
					// 出庫予定日
					issueStruct.setSCDL_ISSUE_DATE(tOdStruct.getDUE_DATE());
					
					issueList.add(issueStruct);
					_debugAllCount += 1;
					childCount++;
				}
			}
					
			int LNumCntCurr = 0;
			String LNumPARENT_OD_NoTemp = "";
			int LNumCntCurr_ISSUE_INST = 0;
					
			while (issueList.size() > LNumCntCurr) {
				AD0030030Struct insertStruct = new AD0030030Struct();
				setStandardItem(insertStruct);
				issueStruct = (AD0030030Struct)issueList.get(LNumCntCurr);
				setStandardItem(issueStruct);
								
				//作業計画別出庫計画データの出庫指示区分：１(通常出庫計画)の場合対象外
				if (!("1".equals(issueStruct.getMRP_ODR_TYP()))) {
					LNumCntCurr++;
					_debugAllCount--;
					continue;
				}
					
				//追加データのセット
				// 工場コード
				insertStruct.setPLANT_CD(getsysPLANT_CD());
				// オーダデマンド番号
				insertStruct.setOD_NO(issueStruct.getOD_NO());
				// 品目番号
				insertStruct.setl_ITEM_CD(issueStruct.getITEM_CD());
				// 製品構成版数
				insertStruct.setPS_EDITION(issueStruct.getPS_EDITION());
				// 発注番号
				insertStruct.setPUCH_ODR_CD(null);
				// 作業計画番号
				insertStruct.setWORK_ODR_CD(this.struct.getWORK_ODR_CD());
				insertStruct.setWORK_IN_PROC_CD(null);  
					
				//擬似品目展開フラグ：１（ＯＮ）
				if ("1".equals(issueStruct.getODINFO_DISGUISE())) {
					LNumPARENT_OD_NoTemp = issueStruct.getPARENT_OD_NO();
					LNumCntCurr_ISSUE_INST = 0;
					
					AD0030030Struct issueChildStruct = new AD0030030Struct();
					do {
						issueChildStruct = new AD0030030Struct();
						issueChildStruct = 
								(AD0030030Struct)issueList.get(LNumCntCurr_ISSUE_INST);
						setStandardItem(issueChildStruct);
										
						BigDecimal PsUnitQtyLNCC = 
								new BigDecimal(issueStruct.getPS_UNIT_QTY());
						BigDecimal PsUnitQtyLNCCII = 
								new BigDecimal(issueChildStruct.getPS_UNIT_QTY());
						BigDecimal PsUnitDenominatorLNCC = 
								new BigDecimal(issueStruct.getPS_UNIT_DENOMINATOR());
						BigDecimal PsUnitDenominatorLNCCII = 
								new BigDecimal(issueChildStruct.getPS_UNIT_DENOMINATOR());
						BigDecimal PsUnitNumeratorLNCC = 
								new BigDecimal(issueStruct.getPS_UNIT_NUMERATOR());
						BigDecimal PsUnitNumeratorLNCCII = 
								new BigDecimal(issueChildStruct.getPS_UNIT_NUMERATOR());
						BigDecimal OprInstQty = 
								new BigDecimal(selectedStruct.getOPR_INST_QTY());
						BigDecimal PsSpoil  =
						    new BigDecimal(issueStruct.getPS_SPOIL());
					
						if (LNumPARENT_OD_NoTemp.equals(issueChildStruct.getOD_NO())) {
							//親品目の在庫数単位区分を取得
							AD0030030Struct tempStruct = new AD0030030Struct();
							tempStruct.setl_ITEM_CD(issueChildStruct.getITEM_CD());
							List issueChildList = entity.mPuchOdrInst_UNIT_QTY_TYP.read(conn, tempStruct);
							String CHILD_UNIT_QTY_TYP = ((AD0030030Struct)issueChildList.get(0)).getUNIT_QTY_TYP();
							
							//子品目の在庫数単位区分を取得
							List unitList = new ArrayList();
							unitList = 
									entity.mPuchOdrInst_UNIT_QTY_TYP.read(conn, insertStruct);
									
							AD0030030Struct unitStruct = new AD0030030Struct();
							unitStruct = (AD0030030Struct)unitList.get(0);
							setStandardItem(unitStruct);
					
							//出庫単位数 = 親データ.出庫単位数 * 子データ出庫単位数
							//小数第５位切上げ
							BigDecimal issue_inst_unit_qty = 
									(PsUnitQtyLNCC.multiply(PsUnitQtyLNCCII));
					
							issue_inst_unit_qty = 
									issue_inst_unit_qty.setScale(4, BigDecimal.ROUND_UP);
							insertStruct.setISSUE_INST_UNIT_QTY(
									issue_inst_unit_qty.toString());
					
							//出庫単位数分母 = 親データ.出庫単位数分母
							//                 * 子データ出庫単位数分母
							//小数第５位切上げ
					
							BigDecimal issue_inst_unit_denominator = 
									(PsUnitDenominatorLNCC.multiply(PsUnitDenominatorLNCCII));
							issue_inst_unit_denominator
									= issue_inst_unit_denominator.setScale(4, BigDecimal.ROUND_UP);
							insertStruct.setISSUE_INST_UNIT_DENOMINATOR(
									issue_inst_unit_denominator.toString());
					
							//出庫単位数分子 = 親データ.出庫単位数分子 
							//                 * 子データ出庫単位数分母
							//小数第５位切上げ
					
							BigDecimal issue_inst_unit_numerator = 
									(PsUnitNumeratorLNCC.multiply(PsUnitNumeratorLNCCII));
							issue_inst_unit_numerator = 
									issue_inst_unit_numerator.setScale(4, BigDecimal.ROUND_UP);
							insertStruct.setISSUE_INST_UNIT_NUMERATOR(
									issue_inst_unit_numerator.toString());
					
							BigDecimal issue_inst_qty = new BigDecimal("0");
							
							if("1".equals(CHILD_UNIT_QTY_TYP)){
								//親品目出庫指示数
								issue_inst_qty =(((OprInstQty.multiply(
											PsUnitNumeratorLNCCII)).divide(PsUnitDenominatorLNCCII,10, BigDecimal.ROUND_UP))).setScale(0,BigDecimal.ROUND_UP);
							}else{
								//親品目出庫指示数
								issue_inst_qty =(((OprInstQty.multiply(
											PsUnitNumeratorLNCCII)).divide(PsUnitDenominatorLNCCII,10, BigDecimal.ROUND_UP))).setScale(4,BigDecimal.ROUND_UP);
							}
							
							//在庫数量単位数区分　１：整数管理
							if ("1".equals(unitStruct.getUNIT_QTY_TYP())) {					
								if ("1".equals(SPOIL_FLG)){
									//子品目出庫指示数
									issue_inst_qty =(((issue_inst_qty.multiply((PsSpoil.divide(
												new BigDecimal(100), 10,BigDecimal.ROUND_UP)).add(new BigDecimal(1))).multiply(
												PsUnitNumeratorLNCC)).divide(PsUnitDenominatorLNCC,10, BigDecimal.ROUND_UP))).setScale(0,BigDecimal.ROUND_UP);
								}else{
									//子品目出庫指示数
									issue_inst_qty =(((issue_inst_qty.multiply(
												PsUnitNumeratorLNCC)).divide(PsUnitDenominatorLNCC,10, BigDecimal.ROUND_UP))).setScale(0,BigDecimal.ROUND_UP);
								}
								//小数切上げ
								insertStruct.setISSUE_INST_QTY(issue_inst_qty.toString());
					
							//在庫数量単位数区分　２：小数管理
							} else {			
								if ("1".equals(SPOIL_FLG)){
									//子品目出庫指示数
									issue_inst_qty =(((issue_inst_qty.multiply((PsSpoil.divide(
												new BigDecimal(100), 10,BigDecimal.ROUND_UP)).add(new BigDecimal(1))).multiply(
												PsUnitNumeratorLNCC)).divide(PsUnitDenominatorLNCC,10, BigDecimal.ROUND_UP))).setScale(4,BigDecimal.ROUND_UP);
								}else{
									//子品目出庫指示数
									issue_inst_qty =(((issue_inst_qty.multiply(
												PsUnitNumeratorLNCC)).divide(PsUnitDenominatorLNCC,10, BigDecimal.ROUND_UP))).setScale(4,BigDecimal.ROUND_UP);
								}
								////小数第５位切上げ切上げ
								insertStruct.setISSUE_INST_QTY(issue_inst_qty.toString());
							}
						}
						LNumCntCurr_ISSUE_INST++;
	
					} while (LNumPARENT_OD_NoTemp.equals(issueChildStruct.getOD_NO())
							|| LNumCntCurr_ISSUE_INST < issueList.size());
					
					LNumCntCurr_ISSUE_INST=0;
					
				//擬似品目展開フラグ：０（ＯＦＦ）
				} else {
					
					BigDecimal issue_inst_unit_qty = 
							new BigDecimal(issueStruct.getPS_UNIT_QTY());
					BigDecimal issue_inst_unit_numerator   = 
							new BigDecimal(issueStruct.getPS_UNIT_NUMERATOR());
					BigDecimal issue_inst_unit_denominator = 
							new BigDecimal(issueStruct.getPS_UNIT_DENOMINATOR());
				    BigDecimal PsSpoil  =
				            new BigDecimal(issueStruct.getPS_SPOIL());
					BigDecimal OprInstQty                  = 
							new BigDecimal(selectedStruct.getOPR_INST_QTY());
					
					//出庫指示単位数
					insertStruct.setISSUE_INST_UNIT_QTY(issue_inst_unit_qty.toString());
					
					//出庫単位数分母
					insertStruct.setISSUE_INST_UNIT_DENOMINATOR(
							issue_inst_unit_denominator.toString());
					
					//出庫単位数分子
					insertStruct.setISSUE_INST_UNIT_NUMERATOR(
							issue_inst_unit_numerator.toString());
					
					List unitList = new ArrayList();
					unitList = entity.mPuchOdrInst_UNIT_QTY_TYP.read(conn,insertStruct);
					AD0030030Struct unitStruct = new AD0030030Struct();
					unitStruct = (AD0030030Struct)unitList.get(0);
					setStandardItem(unitStruct);
					
					if ("1".equals(SPOIL_FLG)){
						
                        /*所要量構成仕損率*/
						OprInstQty =OprInstQty.multiply((PsSpoil.divide(
								new BigDecimal(100), 10, BigDecimal.ROUND_UP)).add(new BigDecimal(1)));
					} 
					//出庫指示数 =   発注指示数 * 出庫単位数分子 / 出庫単位数分母
					BigDecimal issue_inst_qty = 
							(OprInstQty.multiply
							(issue_inst_unit_numerator)).divide
							(issue_inst_unit_denominator, 10, BigDecimal.ROUND_UP);
					
					//在庫数量単位区分　１：整数管理
					if ("1".equals(unitStruct.getUNIT_QTY_TYP())) {
						insertStruct.setISSUE_INST_QTY(
								issue_inst_qty.setScale(0,BigDecimal.ROUND_UP).toString());
					
					//在庫数量単位区分　２：小数管理
					} else {
						//小数第５位切上げ
						insertStruct.setISSUE_INST_QTY(
								issue_inst_qty.setScale(4,BigDecimal.ROUND_UP).toString());
					}
				}

				insertStruct.setWORK_ODR_CD(this.struct.getWORK_ODR_CD());
				insertStruct.setWORK_IN_PROC_CD(this.struct.getWORK_IN_PROC_CD());
				insertStruct.setl_OPR_RSLT_TYP(selectedStruct.getl_OPR_RSLT_TYP());
				insertStruct.setl_WS_CD(selectedStruct.getl_WS_CD());
				insertStruct.setOUTSIDE_TYP(selectedStruct.getOUTSIDE_TYP());
				insertStruct.setVEND_CD(selectedStruct.getVEND_CD());
				insertStruct.setPLANT_CD(selectedStruct.getPLANT_CD());
				insertStruct.setPROC_NO(selectedStruct.getPROC_NO());			
				if ("2".equals(insertStruct.getl_OPR_RSLT_TYP())) {
					insertStruct.setPUCH_ODR_CD(puchCd);
					insertStruct.setWORK_IN_PROC_CD(this.struct.getWORK_IN_PROC_CD());
				}
				// 出庫累計数
				insertStruct.setTOTAL_ISSUE_QTY("0");
				// 出庫予定日
				insertStruct.setSCDL_ISSUE_DATE(issueStruct.getSCDL_ISSUE_DATE());
				// 出庫完了日
				insertStruct.setISSUE_CMPLT_DATE("");
				// 所要量出庫区分
				insertStruct.setISSUE_TYP(issueStruct.getISSUE_TYP());
				// 出庫完了フラグ
				insertStruct.setISSUE_CMPLT_FLG("0");
				// 出庫指示書発行済みフラグ
				insertStruct.setISSUE_INST_ISS_FLG("0"); 
				// 出庫指示書発行日
				insertStruct.setISSUE_INST_ISS_DATE("");
				// 出庫指示備考
				insertStruct.setISSUE_INST_COMMENT("");  

					
				//追加情報取得
				//(作業区、会社コード、取引先コード、保管場所コード、支給区分)
				AD0030030Struct keyStruct = new AD0030030Struct();
				setStandardItem(keyStruct);
	
				keyStruct.setWORK_ODR_CD(this.struct.getWORK_ODR_CD());
				keyStruct.setWORK_IN_PROC_CD(this.struct.getWORK_IN_PROC_CD());
				keyStruct.setITEM_CD(issueStruct.getITEM_CD());
	
				List addList = new ArrayList();
				if ("1".equals(selectedStruct.getl_OPR_RSLT_TYP())) {
					//出来高実績の場合、品目別仕掛の検索
					addList = entity.mSelectBeforeWorkItem.read(conn,keyStruct);
					if (addList.isEmpty()) {
					
						insertStruct.setWS_CD("");//作業区コード
						insertStruct.setWH_CD("");//保管区コード
						insertStruct.setCONS_TYP("0");//支給区分
					} else {
						AD0030030Struct addStruct = new AD0030030Struct();
						addStruct = (AD0030030Struct)addList.get(0);
						setStandardItem(addStruct);
	
						insertStruct.setWS_CD(addStruct.getWS_CD());//作業区コード
						insertStruct.setWH_CD(addStruct.getWH_CD());//保管区コード
						insertStruct.setCONS_TYP("0");//支給区分
					}
					
				} else {
					//作業指示の場合、作業系列別仕掛の検索
					addList = new ArrayList();
					addList = entity.mSelectBeforeWorkProc.read(conn, keyStruct);
					
					if ("1".equals(selectedStruct.getOUTSIDE_TYP())) {
						//内作
						if (addList != null && addList.size() != 0) {
							AD0030030Struct addStruct = (AD0030030Struct)addList.get(0);
							setStandardItem(addStruct);
							insertStruct.setWS_CD(addStruct.getWS_CD());//作業区コード
							insertStruct.setWH_CD(addStruct.getWH_CD());//保管区コード
							insertStruct.setCONS_TYP("0");
						}
					} else {
						//外作
						AD0030030Struct addStruct = new AD0030030Struct();
						if(addList != null && addList.size() != 0){
							addStruct = (AD0030030Struct)addList.get(0);
							setStandardItem(addStruct);
							//会社コード
							insertStruct.setCOMPANY_CD(addStruct.getCOMPANY_CD());
							//取引先コード
							insertStruct.setVEND_CD(addStruct.getVEND_CD());
						}
						//仕掛作業コード、保管区コード、支給区分の取得
						keyStruct.setCOMPANY_CD(addStruct.getCOMPANY_CD());
						keyStruct.setVEND_CD(addStruct.getVEND_CD());
										
						addList = new ArrayList();
						addList = entity.mSelectBeforeWorkProcSec.read(conn, keyStruct);
						if (addList != null && addList.size() != 0) {
							addStruct = new AD0030030Struct();
							addStruct = (AD0030030Struct)addList.get(0);
							setStandardItem(addStruct);
	
							insertStruct.setWORK_IN_PROC_CD(addStruct.getWORK_IN_PROC_CD());//仕掛作業コード
							insertStruct.setWH_CD(addStruct.getWH_CD());//保管区コード
					
						}
						
						// 工場コード
						keyStruct.setPLANT_CD(addStruct.getPLANT_CD());
						// 出庫予定日
						keyStruct.setEFF_PHASE_IN_DATE(insertStruct.getSCDL_ISSUE_DATE());
					
						insertStruct.setCONS_TYP("0");//支給区分
					}
				}

// ▼▼ 2008/08/11 ADD START -TSUCHIDA▼▼
				List manhourTypList = new ArrayList();
				manhourTypList = entity.mselectMANHOUR_TYP.read(conn, insertStruct);
				// 工数管理品目区分が１以外の場合、出庫指示追加処理
				if (manhourTypList != null && manhourTypList.size() != 0) {
				
// ▲▲ 2008/08/11 ADD END -TSUCHIDA▲▲
				//出庫指示番号採番
				CollectNumber ISS_INST_CD = 
						new CollectNumber(
						CollectNumber.ISS_INST_CD,
						this.sysUSER_CD,
						this.sp.getProcId(),
						this.sysPLANT_CD);
				String issueInstCd = ISS_INST_CD.getNo();
				insertStruct.setISSUE_INST_CD(issueInstCd);
					
				//出庫指示追加
				entity.minsertT_ISSUE_INST.create(conn, insertStruct);
// ▼▼ 2008/08/11 ADD START -TSUCHIDA▼▼
				}
// ▲▲ 2008/08/11 ADD END -TSUCHIDA▲▲
				LNumCntCurr++;
			}
		}
	}
    /** コンボボックスデータ取得用定数　作業実績区分 */
    private final static String OPR_RSLT_TYP_PARAMETER_NAME= "OPR_RSLT_TYP"; 
    
    /** コンボボックスデータ取得用定数　系列内外作区分 */
    private final static String OUTSIDE_TYP_PARAMETER_NAME= "OUTSIDE_TYP"; 
   
    /** コンボボックスデータ取得用　作業実績区分 */
    private ComboStruct OPR_RSLT_TYP = null;

    /** コンボボックスデータ取得用　系列内外作区分 */
    private ComboStruct OUTSIDE_TYP = null;
    
    private void othercomboTyp(AD0030030Struct aStruct) {

	 aStruct.setOPR_RSLT_TYP_DN(getDisplayName(OPR_RSLT_TYP, aStruct.getl_OPR_RSLT_TYP().toString()));
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

	/**
	* 検索条件のため、日時分の整理
	* @param 時分 1:":"付き
	* @param 時分
	*/
	private String formatHMW(String inTime ,String inFlag){
			
			if(null == inTime || "".equals(inTime)){
				if("1".equals(inFlag)){
					return " 23:59" ;
				}else{
					return inTime;
				}
			}
			
			if(inTime.length() < 3 || inTime.length() > 4){
				if("1".equals(inFlag)){
					return " 23:59" ;
				}else{
					return inTime;
				}
			}
			
			if(inTime.length() ==  3 ){
				if("1".equals(inFlag)){
					return " 0" + inTime.substring(0,1) + ":" + inTime.substring(1);
				}else{
					return "0" + inTime;
				}
			}
			if("1".equals(inFlag)){
				return " " + inTime.substring(0,2) + ":" + inTime.substring(2);
			}
			return inTime;
	}	
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * 読込ボタン押下時に実行される処理です。
	 *
	 */
	public void controlSelect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0030");
		logger.entering("AD0030030Control"+":USER="+struct.getsUser_ID(),"controlSelect");
			//{{user_implement_dev:<controlSelect>


		try {
			struct.setHIDDEN_OPR_RSLT_TYP("");
			struct.setHIDDEN_OPR_RSLT_TYP2("");
			struct.setHIDDEN_OPR_RSLT_TYP3("");
			struct.setHIDDEN_OUTSIDE_TYP("");
			struct.setHIDDEN_OUTSIDE_TYP2("");
			struct.seth1_WS_CD(struct.getWS_CD());
			struct.seth2_WS_CD(struct.getWS_CD());
			struct.seth_VEND_CD(struct.getVEND_CD());


			//抽出条件の項目名のセット
			AD0030030Struct tempStruct = new AD0030030Struct();
			List tempList = new ArrayList();
			
			if (this.struct.getITEM_CD() == null || this.struct.getITEM_CD().length() == 0) {
				this.struct.setITEM_NAME(null);
			} else {
				tempList = entity.mM_ITEM.read(conn, this.struct);
				if (tempList.isEmpty()) {
					this.struct.setITEM_NAME(null);
				} else {
					tempStruct = (AD0030030Struct)tempList.get(0);
					this.struct.setITEM_NAME(tempStruct.getITEM_NAME());
				}
			}
			if (this.struct.getWS_CD() == null || this.struct.getWS_CD().length() == 0) {
				this.struct.setWS_NAME(null);
			} else {
				tempList = entity.mM_WS.read(conn, this.struct);
				if (tempList.isEmpty()) {
					this.struct.setWS_NAME(null);
				} else {
					tempStruct = (AD0030030Struct)tempList.get(0);
					this.struct.setWS_NAME(tempStruct.getWS_NAME());
				}
			}
			if (this.struct.getVEND_CD() == null || this.struct.getVEND_CD().length() == 0) {
				this.struct.setVEND_ANAME(null);
			} else {
				tempList = entity.mM_VEND_CTRL.read(conn, this.struct);
				if (tempList.isEmpty()) {
					this.struct.setVEND_ANAME(null);
				} else {
					tempStruct = (AD0030030Struct)tempList.get(0);
					this.struct.setVEND_ANAME(tempStruct.getVEND_ANAME());
				}
			}


			//サーバチェック

			//出来高実績作業計画が選択された場合、検索条件に入れる
			if ("true".equals(struct.getc_OUTPUT_RSLT())) {
				struct.setHIDDEN_OPR_RSLT_TYP("1");
			} else {
				struct.setHIDDEN_OPR_RSLT_TYP(null);
				struct.seth1_WS_CD(null);
			}
			//作業指示計画（内作）が選択された場合、検索条件に入れる
			if ("true".equals(struct.getc_OUTSIDE_TYP_IN())) {
				struct.setHIDDEN_OUTSIDE_TYP("1");
				struct.setHIDDEN_OPR_RSLT_TYP2("2");			  	
			} else {
				struct.setHIDDEN_OUTSIDE_TYP(null);
				struct.seth2_WS_CD(null);
			}
			//作業指示計画（外作）が選択された場合、検索条件に入れる
			if ("true".equals(struct.getc_OUTSIDE_TYP_OUT())) {
				struct.setHIDDEN_OUTSIDE_TYP2("2");
				struct.setHIDDEN_OPR_RSLT_TYP3("2");
				//取引先コード
				if (struct.getVEND_CD() == null || "".equals(struct.getVEND_CD())) {
					struct.setVEND_CD(null);
				} else {
					struct.setVEND_CD(struct.getVEND_CD());
				}				
			} else {
				struct.setHIDDEN_OUTSIDE_TYP2(null);
				struct.seth_VEND_CD(null);
			}

			//全てがチェックされていない場合
			if (!("true".equals(struct.getc_OUTPUT_RSLT()))
					&& !("true".equals(struct.getc_OUTSIDE_TYP_IN()))
					&& !("true".equals(struct.getc_OUTSIDE_TYP_OUT()))) {
				struct.setHIDDEN_OPR_RSLT_TYP("-1"); //何も取得しない
			}
		
			//工場コードを設定する
			this.struct.setPLANT_CD(this.sysPLANT_CD);
			if (this.struct.getr1_FILTER1() != null 
					&& "true".equals(this.struct.getr1_FILTER1())) {
				Date dtOprInstStartDate = 
						df.parse(this.struct.getOPR_INST_START_DATE());
				String strOprInstStartDate = 
						Converter.dateToStr(dtOprInstStartDate, "yyyy/MM/dd");
				String strOprInstStartDateTime = formatHMW(this.struct.getOPR_INST_START_TIME() ,"1");
				this.struct.setOPR_INST_START_DATE_01(strOprInstStartDate + strOprInstStartDateTime);
				this.struct.setWORK_ODR_DLV_DATE_01(null);
				this.struct.setOPR_INST_START_TIME(formatHMW(this.struct.getOPR_INST_START_TIME() ,"0"));
			} else {
				Date dtWorkOorDlvDate = 
						df.parse(this.struct.getWORK_ODR_DLV_DATE());
				String strWorkOorDlvDate = 
						Converter.dateToStr(dtWorkOorDlvDate, "yyyy/MM/dd");
				String strWorkOorDlvDateTime = formatHMW(this.struct.getWORK_ODR_DLV_TIME() ,"1");
				this.struct.setOPR_INST_START_DATE_01(null);
				this.struct.setWORK_ODR_DLV_DATE_01(strWorkOorDlvDate + strWorkOorDlvDateTime);
				this.struct.setWORK_ODR_DLV_TIME(formatHMW(this.struct.getWORK_ODR_DLV_TIME() ,"0"));
			}
		


            // 最大表示行数
            int maxLine = sp.getMaxLine(conn, 10);
			if(maxLine != 0) {
				struct.setROW_COUNT(String.valueOf(maxLine));
			} else {
				struct.setROW_COUNT(null);
			}
			list = new ArrayList();
			this.list = entity.mselectV_WORK_ODR_LSTCnt.read(conn, struct);
			long rowCount = Long.parseLong(((AD0030030Struct)list.get(0)).getl_COUNT()); 
			if (rowCount==0) {
				if (_messageSetFlg == 0) {
					//データが存在しない
					setErrorMessage("ZZ06001");
					setWarningSysLogMessage("OPR_INST_START_DATE", this.struct.getOPR_INST_START_DATE());
					setWarningSysLogMessage("WORK_ODR_DLV_DATE", this.struct.getWORK_ODR_DLV_DATE());
					setWarningSysLogMessage("JOB_ODR_CD", this.struct.getJOB_ODR_CD());
					setWarningSysLogMessage("ITEM_CD", this.struct.getITEM_CD());
					setWarningSysLogMessage("WS_CD", this.struct.getWS_CD());
					setWarningSysLogMessage("VEND_CD", this.struct.getVEND_CD());
					setReadStatus(NOT_FOUND);
				} else {
					//フラグのclear
					_messageSetFlg = 0;
				}
					if(list != null && list.size() > 0){
					list.clear();
				 }
					return;	
			}
			if (maxLine != 0 && rowCount == maxLine + 1) {
				setErrorMessage("ZZ01115", ""+maxLine);
				setWarningSysLogMessage("OPR_INST_START_DATE", this.struct.getOPR_INST_START_DATE());
				setWarningSysLogMessage("WORK_ODR_DLV_DATE", this.struct.getWORK_ODR_DLV_DATE());
				setWarningSysLogMessage("JOB_ODR_CD", this.struct.getJOB_ODR_CD());
				setWarningSysLogMessage("ITEM_CD", this.struct.getITEM_CD());
				setWarningSysLogMessage("WS_CD", this.struct.getWS_CD());
				setWarningSysLogMessage("VEND_CD", this.struct.getVEND_CD());
				setReadStatus(TOO_MANY);
				if(list != null && list.size() > 0){
					listClear();
				}	
				return;
				
			}	
			list = entity.mselectV_WORK_ODR_LST.read(conn, this.struct);
             AD0030030Struct TempStruct;
             for (int i = 0; i < list.size(); i++) {
		     TempStruct = (AD0030030Struct)list.get(i);
				
		     //コンボボックスの取得
		     othercomboTyp(TempStruct);
		    }		
			setReadStatus(NORMAL);
				
		} catch (ParseException e) {
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


                //}}user_implement_dev:<controlSelect>
		logger.exiting("AD0030030Control"+":USER="+struct.getsUser_ID(),"controlSelect");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0030");
		logger.entering("AD0030030Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>


		//画面の初期化
		initializeAll();
		//リストの初期化
		listClear();
		try{
			// システムパラメータ（TIME_CTRL）取得
			AD0030030Struct TIME_CTRLStruct = new AD0030030Struct();
			List TIME_CTRLList = entity.mreadTIME_CTRL.read(conn, TIME_CTRLStruct);
			if(null != TIME_CTRLList && TIME_CTRLList.size()>0){
				TIME_CTRLStruct = (AD0030030Struct)TIME_CTRLList.get(0);
				struct.setTIME_CTRL(TIME_CTRLStruct.getTIME_CTRL());
			}else{
				struct.setTIME_CTRL("false");
			}

		} catch(SQLException e) {
			e.printStackTrace();
			// エラー処理を記述してください。
			// 
		}

                //}}user_implement_dev:<controlClear>
		logger.exiting("AD0030030Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * 一括更新ボタン押下時に実行される処理です。
	 *
	 */
	public void controlUpdateAll() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0030");
		logger.entering("AD0030030Control"+":USER="+struct.getsUser_ID(),"controlUpdateAll");
			//{{user_implement_dev:<controlUpdateAll>


		try {
			//バッチに引き渡す値の定義
			String OprInstStartDate = null; //着手日
			String WorkOdrDlvDate = null;   //納期
			String JobOdrCd = null;         //製番
			String ItemCd = null;           //品目番号
			String WsCd = null;             //作業区コード
			String OprRsltTyp = null;       //作業実績区分
			String OutSideTyp = null;       //作業指示計画（内作）
			String OutSideTyp2 = null;      //作業指示計画（外作）
			String VendCd = null;           //取引先コード
			//バッチ処理区分： 1: 夜間バッチ（自動運転） 2: マニュアル（自動運転なし）
			String batchProcessingTyp = "2";

			String strOprInstStartDateTime = formatHMW(this.struct.getOPR_INST_START_TIME() ,"1");
			String strWorkOorDlvDateTime = formatHMW(this.struct.getWORK_ODR_DLV_TIME() ,"1");
			// 着手日
			if (this.struct.getOPR_INST_START_DATE() == null
					|| "".equals(this.struct.getOPR_INST_START_DATE())) {
				OprInstStartDate = null;
			} else {
				OprInstStartDate = this.struct.getOPR_INST_START_DATE() + strOprInstStartDateTime.trim();
			}
			 
			// 納期
			if (this.struct.getWORK_ODR_DLV_DATE() == null
					|| "".equals(this.struct.getWORK_ODR_DLV_DATE())) {
				WorkOdrDlvDate = null;
			} else {
				WorkOdrDlvDate = this.struct.getWORK_ODR_DLV_DATE() + strWorkOorDlvDateTime.trim();
			}
			 
			// 製番
			if (this.struct.getJOB_ODR_CD() == null
					|| "".equals(this.struct.getJOB_ODR_CD())) {
				JobOdrCd = null;
			} else {
				JobOdrCd = this.struct.getJOB_ODR_CD();
			}
		
			// 品目番号
			if (this.struct.getITEM_CD() == null
					|| "".equals(this.struct.getITEM_CD())) {
				ItemCd = null;
			} else {
				ItemCd = this.struct.getITEM_CD();
			}
					
			// 作業区コード
			if (this.struct.getWS_CD() == null
					|| "".equals(this.struct.getWS_CD())) {
				WsCd = null;
			} else {
				WsCd = this.struct.getWS_CD();
			}
			
			// 作業実績区分
			if ("true".equals(struct.getc_OUTPUT_RSLT())) {
				OprRsltTyp = struct.getc_OUTPUT_RSLT();
			} else {
				OprRsltTyp = null;
			}

			// 作業指示計画（内作）
			if ("true".equals(struct.getc_OUTSIDE_TYP_IN())) {
				OutSideTyp = struct.getc_OUTSIDE_TYP_IN();
			} else {
				OutSideTyp = null;
			}
			
			// 作業指示計画（外作）
			if ("true".equals(struct.getc_OUTSIDE_TYP_OUT())) {
				OutSideTyp2 = struct.getc_OUTSIDE_TYP_OUT();
				//取引先コード
				if (struct.getVEND_CD() == null
						|| "".equals(struct.getVEND_CD())) {
					VendCd = null;
				} else {
					VendCd = this.struct.getVEND_CD();
				}
			} else {
				OutSideTyp2 = null;
				VendCd = null;
			}
			
			
			// バッチ処理を実行する -------------------------------------------
			
			ResourceBundle bundle = SystemConfig.getBundle();
			String javaPath = SystemConfig.getProperty("JAVA_PATH", bundle);
			if (javaPath == null) {
				setErrorMessage("ZZ09010");
			}
			String ClassPath = SystemConfig.getProperty("CLASS_PATH", bundle);
			if (ClassPath == null) {
				setErrorMessage("ZZ09012");
			}
			String batchPath = SystemConfig.getProperty("BATCH_PATH", bundle);
			if (batchPath == null) {
				setErrorMessage("ZZ09011");
			}

			// エラーがあれば終了
			if (msgStruct.hasError()) {
				setErrorMessage("ZZ09014");
				setReadStatus(ERROR);
				return;
			}

			try {
				StringBuffer cmd = new StringBuffer();
				cmd.append(javaPath);           // ＪＶＭ
				cmd.append(" -cp ");
				cmd.append(ClassPath);          //Java ClassPath
				cmd.append(" -Dcom.nec.jp.orteus.util.logging.config.file=");
				cmd.append(batchPath);          // 起動設定
				cmd.append(" ");                // 呼び出し先クラス
				cmd.append("com.nec.jp.orteus.metamorBase.AD0030.AD0030B002.mainAD0030B002");
				cmd.append(" \"");
				cmd.append(batchProcessingTyp); // バッチ処理区分
				cmd.append('\"');
				cmd.append(" \"");
				cmd.append(this.sysUSER_CD);   // ユーザＩＤ
				cmd.append('\"');
				cmd.append(" \"");
				cmd.append(this.sysPLANT_CD);  // 工場コード
				cmd.append('\"');
				cmd.append(" \"");
				cmd.append(OprInstStartDate);   // 着手日
				cmd.append('\"');
				cmd.append(",");
				cmd.append("\"");
				cmd.append(WorkOdrDlvDate);     // 納期
				cmd.append('\"');
				cmd.append(",");
				cmd.append("\"");
				cmd.append(JobOdrCd);           // 製番
				cmd.append('\"');
				cmd.append(",");
				cmd.append("\"");
				cmd.append(ItemCd);             // 品目番号
				cmd.append('\"');
				cmd.append(",");
				cmd.append("\"");
				cmd.append(WsCd);               // 作業区コード
				cmd.append('\"');
			    cmd.append(",");
				cmd.append("\"");
				cmd.append(OprRsltTyp);         // 作業実績区分
				cmd.append('\"');
				cmd.append(",");
				cmd.append("\"");
				cmd.append(OutSideTyp);         // 作業指示計画（内作）
				cmd.append('\"');
				cmd.append(",");
				cmd.append("\"");
				cmd.append(OutSideTyp2);        // 作業指示計画（外作）
				cmd.append('\"');
				cmd.append(",");
				cmd.append("\"");
				cmd.append(VendCd);             // 取引先コード
				cmd.append('\"');
				setInfoSysLogMessage("BatchCommand : ", cmd.toString());
			
//				// バッチコマンドを実行
//				Runtime runtime = Runtime.getRuntime();
//				Process p = runtime.exec(cmd.toString());
			
				List buffer = new ArrayList();
				buffer.add(javaPath);            // ＪＶＭ
				buffer.add("-cp");
				buffer.add(ClassPath);           // Java ClassPath
				buffer.add("-Dcom.nec.jp.orteus.util.logging.config.file="+batchPath); // 起動設定
				buffer.add("com.nec.jp.orteus.metamorBase.AD0030.AD0030B002.mainAD0030B002"); // 呼び出し先クラス
				buffer.add(batchProcessingTyp);                      // バッチ処理区分
				buffer.add(this.sysUSER_CD);                         // ユーザID
				buffer.add(this.sysPLANT_CD);                        // 工場コード
				buffer.add(OprInstStartDate + "," + WorkOdrDlvDate + "," + JobOdrCd + "," + ItemCd + "," + WsCd + "," + OprRsltTyp + "," + OutSideTyp + "," + OutSideTyp2 + "," + VendCd);

				// バッチ処理実行
				Runtime runtime = Runtime.getRuntime();
				runtime.exec((String[])buffer.toArray(new String[buffer.size()]));
			} catch (IOException e) {
				// バッチ呼び出し失敗の場合、画面メッセージを表示する。
				setErrorMessage("ZZ09014");
				setReadStatus(ERROR);
				throw e;
			}

			if(this.list != null && this.list.size() > 0){
				//リストのクリア
				this.list.clear();
			}
			
			// バッチ呼び出し成功の場合、画面メッセージを表示する。
			setInformationMessage("ZZ09013");
			setReadStatus(NORMAL);

		} catch (MissingResourceException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			throw new ExpjException(e, emsg);
		} catch (IOException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			throw new ExpjException(e, emsg);
		}


                //}}user_implement_dev:<controlUpdateAll>
		logger.exiting("AD0030030Control"+":USER="+struct.getsUser_ID(),"controlUpdateAll");

		return;
	}

	/**
	 * 選択更新ボタン押下時に実行される処理です。
	 *
	 */
	public void controlUpdateAssort() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0030");
		logger.entering("AD0030030Control"+":USER="+struct.getsUser_ID(),"controlUpdateAssort");
			//{{user_implement_dev:<controlUpdateAssort>


		try {	
			//検索結果(List)を取得
			if (this.list.isEmpty()) {
				//読込み前だった場合エラー
				setErrorMessage("ZZ01114");
				setReadStatus(ERROR);
				return;
			}
			//業務運用日を取得する
			List oprDateList = new ArrayList();
			struct.setPLANT_CD(getsysPLANT_CD());
			oprDateList  = entity.mselectBUSINESS_OPR_DATE.read(conn, struct);
			if (oprDateList.isEmpty()) {
				//データが存在しない
				setErrorMessage("ZZ01101");
				setWarningSysLogMessage("SYS_DATE_CTRL.PLANT_CD", getsysPLANT_CD());//工場コード
				return;
			}
			AD0030030Struct oprDateStruct = new AD0030030Struct();
			oprDateStruct = (AD0030030Struct)oprDateList.get(0);
			setStandardItem(oprDateStruct);
			struct.setBUSINESS_OPR_DATE(oprDateStruct.getBUSINESS_OPR_DATE());
			

			_debugParentCount = 0;
			_debugAllCount = 0;


			// [邦貨]情報を部品より取得
			this.sysHomeCurStruct = HomeCurControl.getData(this.conn);

			// 選択列の取得
			List workOdrCdList = struct.getList_WORK_ODR_CD();

			//更新を行う
			for (int i = 0; i < workOdrCdList.size(); i++) {
				
				conn.beginTransWeb();

 				// 選択された行の作業計画番号・仕掛作業コードを設定
				struct.setWORK_ODR_CD((String) workOdrCdList.get(i));
				struct.setWORK_IN_PROC_CD((String) struct.getList_WORK_IN_PROC_CD().get(i));				

				// 選択行の再検索
				List selectdeList = new ArrayList();
				selectdeList = entity.mV_WORK_ODR_LST.read(conn, struct);
				if (selectdeList.isEmpty()) {
					setErrorMessage("ZZ01105");
					setWarningSysLogMessage("V_WORK_ODR_LST.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//作業計画番号
					setWarningSysLogMessage("V_WORK_ODR_LST.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//仕掛作業コード
					continue;
				} 
				// 更新数のチェック
				AD0030030Struct selectedStruct = new AD0030030Struct();
				selectedStruct = (AD0030030Struct)selectdeList.get(0);
				setStandardItem(selectedStruct);
				if (!selectedStruct.geth_MODIFY_COUNT().equals(struct.getList_h_MODIFY_COUNT().get(i))) {
					setErrorMessage("ZZ01105");
					setWarningSysLogMessage("V_WORK_ODR_LST.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//作業計画番号
					setWarningSysLogMessage("V_WORK_ODR_LST.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//仕掛作業コード
					setWarningSysLogMessage("V_WORK_ODR_LST.MODIFY_COUNT", selectedStruct.geth_MODIFY_COUNT());
					continue;
				}
				
				//チェック１
				//出来高実績の計画で、作業区コードが"Null"
				if ("1".equals(selectedStruct.getl_OPR_RSLT_TYP())
						&& (selectedStruct.getl_WS_CD() == null 
						|| "".equals(selectedStruct.getl_WS_CD()))) {
					setErrorMessage("AD30041");
					setSupportMessage("V_WORK_ODR_LST.WORK_ODR_CD", this.struct.getWORK_ODR_CD());
					setWarningSysLogMessage("V_WORK_ODR_LST.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//作業計画番号
					continue;
				}
				
				//チェック２
				//作業指示実績（内作）の計画で、作業区コード"Null"
				if ("2".equals(selectedStruct.getl_OPR_RSLT_TYP())
						&& "1".equals(selectedStruct.getOUTSIDE_TYP())
						&& (selectedStruct.getl_WS_CD() == null 
						|| "".equals(selectedStruct.getl_WS_CD()))) {
					setErrorMessage("AD30041");
					setSupportMessage("V_WORK_ODR_LST.WORK_ODR_CD", this.struct.getWORK_ODR_CD(), "V_WORK_ODR_LST.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());
					setWarningSysLogMessage("V_WORK_ODR_LST.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//作業計画番号
					setWarningSysLogMessage("V_WORK_ODR_LST.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//仕掛作業コード
					continue;
				}
				
				//チェック３
				//作業指示実績（外作）の計画で、取引先コードが"Null"
				if ("2".equals(selectedStruct.getl_OPR_RSLT_TYP())
						&& "2".equals(selectedStruct.getOUTSIDE_TYP())
						&& (selectedStruct.getl_VEND_CD() == null 
						|| "".equals(selectedStruct.getl_VEND_CD()))) {
					setErrorMessage("AD30037");
					setSupportMessage("V_WORK_ODR_LST.WORK_ODR_CD", this.struct.getWORK_ODR_CD(), "V_WORK_ODR_LST.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());
					setWarningSysLogMessage("V_WORK_ODR_LST.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//作業計画番号
					setWarningSysLogMessage("V_WORK_ODR_LST.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//仕掛作業コード
					continue;
				}
				
				//[仕掛一覧VIEW].“作業実績区分”　=　１（出来高実績）の場合
				if ("1".equals(selectedStruct.getl_OPR_RSLT_TYP())) {
				
					//チェック４
					//設定されている作業区コードが、[作業区]に存在しない
					List wsCdList = new ArrayList();
					wsCdList = entity.mselectWS_CD.read(conn,selectedStruct);
					if (wsCdList.isEmpty()) {
						setErrorMessage("AD00011");
						setSupportMessage("V_WORK_ODR_LST.WORK_ODR_CD", this.struct.getWORK_ODR_CD());
						setWarningSysLogMessage("V_WORK_ODR_LST.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//作業計画番号
						setWarningSysLogMessage("V_WORK_ODR_LST.WS_CD", selectedStruct.getl_WS_CD());//作業区コード
						continue;
					}

					//チェック５
					//設定されている作業区コードに対応する[作業区]の工場コードと一致しない
					AD0030030Struct wsStruct = new AD0030030Struct();
					wsStruct = (AD0030030Struct)wsCdList.get(0);
					setStandardItem(wsStruct);
					if (wsStruct.getPLANT_CD() == null 
							|| !selectedStruct.getPLANT_CD().equals(wsStruct.getPLANT_CD())) {
						setErrorMessage("AD00012");
						setSupportMessage("V_WORK_ODR_LST.WORK_ODR_CD", this.struct.getWORK_ODR_CD());
						setWarningSysLogMessage("V_WORK_ODR_LST.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//作業計画番号
						setWarningSysLogMessage("V_WORK_ODR_LST.PLANT_CD", selectedStruct.getPLANT_CD());//工場コード
						setWarningSysLogMessage("M_WS.PLANT_CD", wsStruct.getPLANT_CD());//工場コード
						continue;
					}

					//チェック６
					//設定されている作業区コードに対応する[作業区]に[保管区コード]が設定されていない
					if (wsStruct.getWH_CD() == null) {
						setErrorMessage("AD00013");
						setSupportMessage("V_WORK_ODR_LST.WORK_ODR_CD", this.struct.getWORK_ODR_CD());
						setWarningSysLogMessage("V_WORK_ODR_LST.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//作業計画番号
						setWarningSysLogMessage("M_WH.WH_CD", wsStruct.getWH_CD());//工場コード
						continue;
					}
				
					//チェック７
					//設定されている作業区コードに対応する[作業区]に「保管区コード」が設定されていて、
					//その保管区が、[保管区]に存在しない場合
					List whList = new ArrayList();
					whList = entity.mselectM_WH.read(conn, wsStruct);
					if (whList.isEmpty()) {
						//保管区コードが保管区に存在しない
						setErrorMessage("AD00018");
						setSupportMessage("V_WORK_ODR_LST.WORK_ODR_CD", this.struct.getWORK_ODR_CD());
						setWarningSysLogMessage("V_WORK_ODR_LST.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//作業計画番号
						setWarningSysLogMessage("M_WH.WH_CD", wsStruct.getWH_CD());//保管区コード
						continue;
					}

					//チェック８
					//設定されている作業区コードに対応する[作業区]に[保管区コード]が設定されていて、
					//その保管区の工場コードが、作業区の工場コードと一致しない
					AD0030030Struct whStruct = new AD0030030Struct();
					whStruct = (AD0030030Struct)whList.get(0);
					setStandardItem(whStruct);
					if (!wsStruct.getPLANT_CD().equals(whStruct.getPLANT_CD())) {
						setErrorMessage("AD00014");
						setSupportMessage("V_WORK_ODR_LST.WORK_ODR_CD", this.struct.getWORK_ODR_CD());
						setWarningSysLogMessage("V_WORK_ODR_LST.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//作業計画番号
						setWarningSysLogMessage("M_WS.PLANT_CD", wsStruct.getPLANT_CD());//工場コード
						setWarningSysLogMessage("M_WH.PLANT_CD", whStruct.getPLANT_CD());//工場コード
						continue;
					}

				//作業実績区分=2（作業指示実績）の場合
				} else {
				
					//仕掛作業系列番号が最小のデータを取得
					List minProcNoList = new ArrayList();
					minProcNoList = entity.mselectMIN_PROC_NO.read(conn, struct);
					if (minProcNoList.isEmpty()) {
						setErrorMessage("ZZ06001");
						setWarningSysLogMessage("V_WORK_ODR_LST.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//作業計画番号
						setWarningSysLogMessage("V_WORK_ODR_LST.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//仕掛作業コード
						continue;
					}
					AD0030030Struct minProcNoStruct = new AD0030030Struct();
					minProcNoStruct = (AD0030030Struct)minProcNoList.get(0);
					setStandardItem(minProcNoStruct);
					if (minProcNoStruct.getMIN_PROC_NO() != null
							&& minProcNoStruct.getMIN_PROC_NO().equals(selectedStruct.getPROC_NO())) {
						//同一作業計画番号内で最初の内作工程
						//作業区コード存在チェック用（作業区コード、工場コード取得）
						List wsList = new ArrayList();
						wsList = entity.mselectWS_CD.read(conn, selectedStruct);
				
						//チェック９
						//設定されている作業区コードが、[作業区]に存在しない
						if (wsList.isEmpty()) {
							//データが存在しない
							setErrorMessage("AD00011");
							setSupportMessage("V_WORK_ODR_LST.WORK_ODR_CD", this.struct.getWORK_ODR_CD(), "V_WORK_ODR_LST.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());
							setWarningSysLogMessage("V_WORK_ODR_LST.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//作業計画番号
							setWarningSysLogMessage("V_WORK_ODR_LST.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//仕掛作業コード
							setWarningSysLogMessage("M_WS.WS_CD", selectedStruct.getWS_CD());//作業区コード
							continue;
						}
						
						//チェック１０
						//設定されている作業区コードに対応する[作業区]の
						//工場コードと一致しない場合
						AD0030030Struct wsStruct = new AD0030030Struct();
						wsStruct = (AD0030030Struct)wsList.get(0);
						setStandardItem(wsStruct);
						if (!selectedStruct.getPLANT_CD().equals(wsStruct.getPLANT_CD())) {
							//データが存在しない
							setErrorMessage("AD00012");
							setSupportMessage("V_WORK_ODR_LST.WORK_ODR_CD", this.struct.getWORK_ODR_CD(), "V_WORK_ODR_LST.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());
							setWarningSysLogMessage("V_WORK_ODR_LST.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//作業計画番号
							setWarningSysLogMessage("V_WORK_ODR_LST.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//仕掛作業コード
							setWarningSysLogMessage("M_WS.PLANT_CD", wsStruct.getPLANT_CD());//工場コード
							setWarningSysLogMessage("M_WS.WS_CD", selectedStruct.getWS_CD());//作業区コード
							continue;
						}
				
						//チェック１１
						//設定されている作業区コードに対応する[作業区]に
						//「保管区コード」が設定されていない
						if (wsStruct.getWH_CD() == null) {
							setErrorMessage("AD00013");
							setSupportMessage("V_WORK_ODR_LST.WORK_ODR_CD", this.struct.getWORK_ODR_CD(), "V_WORK_ODR_LST.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());
							setWarningSysLogMessage("V_WORK_ODR_LST.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//作業計画番号
							setWarningSysLogMessage("V_WORK_ODR_LST.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//仕掛作業コード
							setWarningSysLogMessage("M_WS.WS_CD", this.struct.getWS_CD());//作業区コード
							continue;
						}
				
						//チェック１２
						//設定されている作業区コードに対応する[作業区]のに「保管区コード」が
						//設定されていて、その保管区が、[保管区]に存在しない
						List whList = new ArrayList();
						whList = entity.mselectM_WH.read(conn, wsStruct);	
						if (whList.isEmpty()) {
							//データが存在しない
							setErrorMessage("AD00018");
							setSupportMessage("V_WORK_ODR_LST.WORK_ODR_CD", this.struct.getWORK_ODR_CD(), "V_WORK_ODR_LST.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());
							setWarningSysLogMessage("V_WORK_ODR_LST.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//作業計画番号
							setWarningSysLogMessage("V_WORK_ODR_LST.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//仕掛作業コード
							setWarningSysLogMessage("M_WS.WH_CD", wsStruct.getWH_CD());//保管区コード
							continue;
						}
				
						//チェック１３
						//設定されている作業区コードに対応する[作業区]に「保管区コード」が設定され
						//ていて、その保管区の工場コードが、作業区コードの工場コードと一致しない
						AD0030030Struct whStruct = new AD0030030Struct();
						whStruct = (AD0030030Struct)whList.get(0);
						setStandardItem(whStruct);
						if (!wsStruct.getPLANT_CD().equals(whStruct.getPLANT_CD())) {
							setErrorMessage("AD00014");
							setSupportMessage("V_WORK_ODR_LST.WORK_ODR_CD", this.struct.getWORK_ODR_CD(), "V_WORK_ODR_LST.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());
							setWarningSysLogMessage("V_WORK_ODR_LST.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//作業計画番号
							setWarningSysLogMessage("V_WORK_ODR_LST.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//仕掛作業コード
							setWarningSysLogMessage("M_WS.WH_CD", wsStruct.getWH_CD());//保管区コード
							continue;
						}
					}
				}
				
				//更新処理(１行ごとcommit)
				UpdateAssort(selectedStruct);
		
			}
			
			//フラグのset
			_messageSetFlg = 1;
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
		} catch (DataNotFoundException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			throw new ExpjException(e, emsg);
		} catch (ParseException e) {
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


                //}}user_implement_dev:<controlUpdateAssort>
		logger.exiting("AD0030030Control"+":USER="+struct.getsUser_ID(),"controlUpdateAssort");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0030");
		logger.entering("AD0030030Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AD0030030Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0030");
		logger.entering("AD0030030Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>


		//画面の初期化
		initializeAll();
		//リストの初期化
		listClear();
		try{
			// システムパラメータ（TIME_CTRL）取得
			AD0030030Struct TIME_CTRLStruct = new AD0030030Struct();
			List TIME_CTRLList = entity.mreadTIME_CTRL.read(conn, TIME_CTRLStruct);
			if(null != TIME_CTRLList && TIME_CTRLList.size()>0){
				TIME_CTRLStruct = (AD0030030Struct)TIME_CTRLList.get(0);
				struct.setTIME_CTRL(TIME_CTRLStruct.getTIME_CTRL());
			}else{
				struct.setTIME_CTRL("false");
			}

		} catch(SQLException e) {
			e.printStackTrace();
			// エラー処理を記述してください。
			// 
		}
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AD0030030Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

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
		logger.entering("AD0030030Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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


		setReadStatus(INITIAL);


			// ダウンロードファイル名クリア
			// PDF・CSVのダウンロードを行うときは、画面上にOrHiddenで「DOWNLOAD_FILE」を定義し、次の行のコメントを外してください。
//			struct.setDOWNLOAD_FILE((String)null);
			// コンボボックス部品のデータのセットはここに記述してください。
			// コンボボックスデータ用意
			try {
                 ComboBox comboController = new ComboBox(conn, sysUSER_CD);	
                 OPR_RSLT_TYP = comboController.getData(OPR_RSLT_TYP_PARAMETER_NAME);
                 OUTSIDE_TYP = comboController.getData(OUTSIDE_TYP_PARAMETER_NAME);
                } catch (SQLException e) {
                 throw new ExpjException(e);
                } catch (ComboException e) {
                 throw new ExpjException(e);
                }
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("AD0030030Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("UpdateAll") ) {
				controlUpdateAll();
			} else if( button.equals("UpdateAssort") ) {
				controlUpdateAssort();
			} else if( button.equals("initial") ) {
				controlINITIAL();
			} else if( button.equals("reload") ) {
				controlRELOAD();
			}
		//{{user_implement_dev:<control_eventHandller>


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
//			throw new FoundationException("AD0030030Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AD0030030-E999","CSVの出力処理"));
			throw new FoundationException("AD0030030Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AD0030030-E999","システム日付の取得処理"));
				throw new FoundationException("AD0030030Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AD0030030-E999","コントロールのイベント処理"));
			throw new FoundationException("AD0030030Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected AD0030030Entity entity;
	protected AD0030030Struct struct;
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

		entity = new AD0030030Entity();
		struct = new AD0030030Struct();

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
	 * AD0030030クラスの標準コンストラクタ
	 */
	public AD0030030Control() throws BusinessProcessException, FoundationException
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
				AD0030030Struct key = (AD0030030Struct)keyList.get(j);
				// メッセージキーを作成する
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("OPR_RSLT_TYP_DN") && key.getOPR_RSLT_TYP_DN() != null) {
					msgKey.setKeyValue("OPR_RSLT_TYP_DN", key.getOPR_RSLT_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("r1_FILTER1") && key.getr1_FILTER1() != null) {
					msgKey.setKeyValue("r1_FILTER1", key.getr1_FILTER1());
				}
				if(msgKeyType.containsKeyColumn("c_OUTPUT_RSLT") && key.getc_OUTPUT_RSLT() != null) {
					msgKey.setKeyValue("c_OUTPUT_RSLT", key.getc_OUTPUT_RSLT());
				}
				if(msgKeyType.containsKeyColumn("r2_FILTER1") && key.getr2_FILTER1() != null) {
					msgKey.setKeyValue("r2_FILTER1", key.getr2_FILTER1());
				}
				if(msgKeyType.containsKeyColumn("c_OUTSIDE_TYP_IN") && key.getc_OUTSIDE_TYP_IN() != null) {
					msgKey.setKeyValue("c_OUTSIDE_TYP_IN", key.getc_OUTSIDE_TYP_IN());
				}
				if(msgKeyType.containsKeyColumn("c_OUTSIDE_TYP_OUT") && key.getc_OUTSIDE_TYP_OUT() != null) {
					msgKey.setKeyValue("c_OUTSIDE_TYP_OUT", key.getc_OUTSIDE_TYP_OUT());
				}
				if(msgKeyType.containsKeyColumn("OUTSIDE_TYP_DN") && key.getOUTSIDE_TYP_DN() != null) {
					msgKey.setKeyValue("OUTSIDE_TYP_DN", key.getOUTSIDE_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_START_TIME") && key.getOPR_INST_START_TIME() != null) {
					msgKey.setKeyValue("OPR_INST_START_TIME", key.getOPR_INST_START_TIME());
				}
				if(msgKeyType.containsKeyColumn("WORK_ODR_DLV_TIME") && key.getWORK_ODR_DLV_TIME() != null) {
					msgKey.setKeyValue("WORK_ODR_DLV_TIME", key.getWORK_ODR_DLV_TIME());
				}
				if(msgKeyType.containsKeyColumn("ODINFO_DISGUISE") && key.getODINFO_DISGUISE() != null) {
					msgKey.setKeyValue("ODINFO_DISGUISE", key.getODINFO_DISGUISE());
				}
				if(msgKeyType.containsKeyColumn("WORK_ODR_DLV_DATE_01") && key.getWORK_ODR_DLV_DATE_01() != null) {
					msgKey.setKeyValue("WORK_ODR_DLV_DATE_01", key.getWORK_ODR_DLV_DATE_01());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_START_DATE_01") && key.getOPR_INST_START_DATE_01() != null) {
					msgKey.setKeyValue("OPR_INST_START_DATE_01", key.getOPR_INST_START_DATE_01());
				}
				if(msgKeyType.containsKeyColumn("TIME_CTRL") && key.getTIME_CTRL() != null) {
					msgKey.setKeyValue("TIME_CTRL", key.getTIME_CTRL());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_CD") && key.getOPR_INST_CD() != null) {
					msgKey.setKeyValue("OPR_INST_CD", key.getOPR_INST_CD());
				}
				if(msgKeyType.containsKeyColumn("WORK_ODR_CD") && key.getWORK_ODR_CD() != null) {
					msgKey.setKeyValue("WORK_ODR_CD", key.getWORK_ODR_CD());
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
				if(msgKeyType.containsKeyColumn("l_JOB_ODR_CD") && key.getl_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("l_JOB_ODR_CD", key.getl_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ITEM_CD") && key.getl_ITEM_CD() != null) {
					msgKey.setKeyValue("l_ITEM_CD", key.getl_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_NAME") && key.getITEM_NAME() != null) {
					msgKey.setKeyValue("ITEM_NAME", key.getITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_WS_CD") && key.getl_WS_CD() != null) {
					msgKey.setKeyValue("l_WS_CD", key.getl_WS_CD());
				}
				if(msgKeyType.containsKeyColumn("WS_NAME") && key.getWS_NAME() != null) {
					msgKey.setKeyValue("WS_NAME", key.getWS_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_VEND_CD") && key.getl_VEND_CD() != null) {
					msgKey.setKeyValue("l_VEND_CD", key.getl_VEND_CD());
				}
				if(msgKeyType.containsKeyColumn("l_VEND_ANAME") && key.getl_VEND_ANAME() != null) {
					msgKey.setKeyValue("l_VEND_ANAME", key.getl_VEND_ANAME());
				}
				if(msgKeyType.containsKeyColumn("l_WORK_ODR_DLV_DATE") && key.getl_WORK_ODR_DLV_DATE() != null) {
					msgKey.setKeyValue("l_WORK_ODR_DLV_DATE", key.getl_WORK_ODR_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_OPR_INST_START_DATE") && key.getl_OPR_INST_START_DATE() != null) {
					msgKey.setKeyValue("l_OPR_INST_START_DATE", key.getl_OPR_INST_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_QTY") && key.getOPR_INST_QTY() != null) {
					msgKey.setKeyValue("OPR_INST_QTY", key.getOPR_INST_QTY());
				}
				if(msgKeyType.containsKeyColumn("WORK_IN_PROC_COMMENT") && key.getWORK_IN_PROC_COMMENT() != null) {
					msgKey.setKeyValue("WORK_IN_PROC_COMMENT", key.getWORK_IN_PROC_COMMENT());
				}
				if(msgKeyType.containsKeyColumn("OUTSIDE_TYP") && key.getOUTSIDE_TYP() != null) {
					msgKey.setKeyValue("OUTSIDE_TYP", key.getOUTSIDE_TYP());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("l_OPR_RSLT_TYP") && key.getl_OPR_RSLT_TYP() != null) {
					msgKey.setKeyValue("l_OPR_RSLT_TYP", key.getl_OPR_RSLT_TYP());
				}
				if(msgKeyType.containsKeyColumn("h_MODIFY_COUNT") && key.geth_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("h_MODIFY_COUNT", key.geth_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_CD") && key.getJOB_ODR_CD() != null) {
					msgKey.setKeyValue("JOB_ODR_CD", key.getJOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("HIDDEN_OPR_RSLT_TYP") && key.getHIDDEN_OPR_RSLT_TYP() != null) {
					msgKey.setKeyValue("HIDDEN_OPR_RSLT_TYP", key.getHIDDEN_OPR_RSLT_TYP());
				}
				if(msgKeyType.containsKeyColumn("h1_WS_CD") && key.geth1_WS_CD() != null) {
					msgKey.setKeyValue("h1_WS_CD", key.geth1_WS_CD());
				}
				if(msgKeyType.containsKeyColumn("HIDDEN_OUTSIDE_TYP") && key.getHIDDEN_OUTSIDE_TYP() != null) {
					msgKey.setKeyValue("HIDDEN_OUTSIDE_TYP", key.getHIDDEN_OUTSIDE_TYP());
				}
				if(msgKeyType.containsKeyColumn("HIDDEN_OPR_RSLT_TYP2") && key.getHIDDEN_OPR_RSLT_TYP2() != null) {
					msgKey.setKeyValue("HIDDEN_OPR_RSLT_TYP2", key.getHIDDEN_OPR_RSLT_TYP2());
				}
				if(msgKeyType.containsKeyColumn("h2_WS_CD") && key.geth2_WS_CD() != null) {
					msgKey.setKeyValue("h2_WS_CD", key.geth2_WS_CD());
				}
				if(msgKeyType.containsKeyColumn("HIDDEN_OUTSIDE_TYP2") && key.getHIDDEN_OUTSIDE_TYP2() != null) {
					msgKey.setKeyValue("HIDDEN_OUTSIDE_TYP2", key.getHIDDEN_OUTSIDE_TYP2());
				}
				if(msgKeyType.containsKeyColumn("HIDDEN_OPR_RSLT_TYP3") && key.getHIDDEN_OPR_RSLT_TYP3() != null) {
					msgKey.setKeyValue("HIDDEN_OPR_RSLT_TYP3", key.getHIDDEN_OPR_RSLT_TYP3());
				}
				if(msgKeyType.containsKeyColumn("h_VEND_CD") && key.geth_VEND_CD() != null) {
					msgKey.setKeyValue("h_VEND_CD", key.geth_VEND_CD());
				}
				if(msgKeyType.containsKeyColumn("WH_CD") && key.getWH_CD() != null) {
					msgKey.setKeyValue("WH_CD", key.getWH_CD());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_DATE") && key.getOPR_INST_DATE() != null) {
					msgKey.setKeyValue("OPR_INST_DATE", key.getOPR_INST_DATE());
				}
				if(msgKeyType.containsKeyColumn("BUSINESS_OPR_DATE") && key.getBUSINESS_OPR_DATE() != null) {
					msgKey.setKeyValue("BUSINESS_OPR_DATE", key.getBUSINESS_OPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("OD_NO") && key.getOD_NO() != null) {
					msgKey.setKeyValue("OD_NO", key.getOD_NO());
				}
				if(msgKeyType.containsKeyColumn("PS_EDITION") && key.getPS_EDITION() != null) {
					msgKey.setKeyValue("PS_EDITION", key.getPS_EDITION());
				}
				if(msgKeyType.containsKeyColumn("PS_UNIT_QTY") && key.getPS_UNIT_QTY() != null) {
					msgKey.setKeyValue("PS_UNIT_QTY", key.getPS_UNIT_QTY());
				}
				if(msgKeyType.containsKeyColumn("PARENT_OD_NO") && key.getPARENT_OD_NO() != null) {
					msgKey.setKeyValue("PARENT_OD_NO", key.getPARENT_OD_NO());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP") && key.getMRP_ODR_TYP() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP", key.getMRP_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_TYP") && key.getISSUE_TYP() != null) {
					msgKey.setKeyValue("ISSUE_TYP", key.getISSUE_TYP());
				}
				if(msgKeyType.containsKeyColumn("DUE_DATE") && key.getDUE_DATE() != null) {
					msgKey.setKeyValue("DUE_DATE", key.getDUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("PS_UNIT_DENOMINATOR") && key.getPS_UNIT_DENOMINATOR() != null) {
					msgKey.setKeyValue("PS_UNIT_DENOMINATOR", key.getPS_UNIT_DENOMINATOR());
				}
				if(msgKeyType.containsKeyColumn("PS_UNIT_NUMERATOR") && key.getPS_UNIT_NUMERATOR() != null) {
					msgKey.setKeyValue("PS_UNIT_NUMERATOR", key.getPS_UNIT_NUMERATOR());
				}
				if(msgKeyType.containsKeyColumn("PS_SPOIL") && key.getPS_SPOIL() != null) {
					msgKey.setKeyValue("PS_SPOIL", key.getPS_SPOIL());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_INST_CD") && key.getISSUE_INST_CD() != null) {
					msgKey.setKeyValue("ISSUE_INST_CD", key.getISSUE_INST_CD());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_CD") && key.getPUCH_ODR_CD() != null) {
					msgKey.setKeyValue("PUCH_ODR_CD", key.getPUCH_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_INST_UNIT_QTY") && key.getISSUE_INST_UNIT_QTY() != null) {
					msgKey.setKeyValue("ISSUE_INST_UNIT_QTY", key.getISSUE_INST_UNIT_QTY());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_INST_UNIT_DENOMINATOR") && key.getISSUE_INST_UNIT_DENOMINATOR() != null) {
					msgKey.setKeyValue("ISSUE_INST_UNIT_DENOMINATOR", key.getISSUE_INST_UNIT_DENOMINATOR());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_INST_UNIT_NUMERATOR") && key.getISSUE_INST_UNIT_NUMERATOR() != null) {
					msgKey.setKeyValue("ISSUE_INST_UNIT_NUMERATOR", key.getISSUE_INST_UNIT_NUMERATOR());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_INST_QTY") && key.getISSUE_INST_QTY() != null) {
					msgKey.setKeyValue("ISSUE_INST_QTY", key.getISSUE_INST_QTY());
				}
				if(msgKeyType.containsKeyColumn("TOTAL_ISSUE_QTY") && key.getTOTAL_ISSUE_QTY() != null) {
					msgKey.setKeyValue("TOTAL_ISSUE_QTY", key.getTOTAL_ISSUE_QTY());
				}
				if(msgKeyType.containsKeyColumn("SCDL_ISSUE_DATE") && key.getSCDL_ISSUE_DATE() != null) {
					msgKey.setKeyValue("SCDL_ISSUE_DATE", key.getSCDL_ISSUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_CMPLT_DATE") && key.getISSUE_CMPLT_DATE() != null) {
					msgKey.setKeyValue("ISSUE_CMPLT_DATE", key.getISSUE_CMPLT_DATE());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_CMPLT_FLG") && key.getISSUE_CMPLT_FLG() != null) {
					msgKey.setKeyValue("ISSUE_CMPLT_FLG", key.getISSUE_CMPLT_FLG());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_INST_ISS_FLG") && key.getISSUE_INST_ISS_FLG() != null) {
					msgKey.setKeyValue("ISSUE_INST_ISS_FLG", key.getISSUE_INST_ISS_FLG());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_INST_ISS_DATE") && key.getISSUE_INST_ISS_DATE() != null) {
					msgKey.setKeyValue("ISSUE_INST_ISS_DATE", key.getISSUE_INST_ISS_DATE());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_INST_COMMENT") && key.getISSUE_INST_COMMENT() != null) {
					msgKey.setKeyValue("ISSUE_INST_COMMENT", key.getISSUE_INST_COMMENT());
				}
				if(msgKeyType.containsKeyColumn("WS_CD") && key.getWS_CD() != null) {
					msgKey.setKeyValue("WS_CD", key.getWS_CD());
				}
				if(msgKeyType.containsKeyColumn("COMPANY_CD") && key.getCOMPANY_CD() != null) {
					msgKey.setKeyValue("COMPANY_CD", key.getCOMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("VEND_CD") && key.getVEND_CD() != null) {
					msgKey.setKeyValue("VEND_CD", key.getVEND_CD());
				}
				if(msgKeyType.containsKeyColumn("CONS_TYP") && key.getCONS_TYP() != null) {
					msgKey.setKeyValue("CONS_TYP", key.getCONS_TYP());
				}
				if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP") && key.getUNIT_QTY_TYP() != null) {
					msgKey.setKeyValue("UNIT_QTY_TYP", key.getUNIT_QTY_TYP());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_PERSON") && key.getPUCH_ODR_PERSON() != null) {
					msgKey.setKeyValue("PUCH_ODR_PERSON", key.getPUCH_ODR_PERSON());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_START_DATE") && key.getPUCH_ODR_START_DATE() != null) {
					msgKey.setKeyValue("PUCH_ODR_START_DATE", key.getPUCH_ODR_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_DLV_DATE") && key.getPUCH_ODR_DLV_DATE() != null) {
					msgKey.setKeyValue("PUCH_ODR_DLV_DATE", key.getPUCH_ODR_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_QTY") && key.getPUCH_ODR_QTY() != null) {
					msgKey.setKeyValue("PUCH_ODR_QTY", key.getPUCH_ODR_QTY());
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
				if(msgKeyType.containsKeyColumn("DISC_AMOUNT") && key.getDISC_AMOUNT() != null) {
					msgKey.setKeyValue("DISC_AMOUNT", key.getDISC_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_AMOUNT") && key.getPUCH_ODR_AMOUNT() != null) {
					msgKey.setKeyValue("PUCH_ODR_AMOUNT", key.getPUCH_ODR_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_INST_DATE") && key.getPUCH_ODR_INST_DATE() != null) {
					msgKey.setKeyValue("PUCH_ODR_INST_DATE", key.getPUCH_ODR_INST_DATE());
				}
				if(msgKeyType.containsKeyColumn("SPL_ITEM_TYP") && key.getSPL_ITEM_TYP() != null) {
					msgKey.setKeyValue("SPL_ITEM_TYP", key.getSPL_ITEM_TYP());
				}
				if(msgKeyType.containsKeyColumn("ACPT_INSPC_TYP") && key.getACPT_INSPC_TYP() != null) {
					msgKey.setKeyValue("ACPT_INSPC_TYP", key.getACPT_INSPC_TYP());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_COMMENT") && key.getPUCH_ODR_COMMENT() != null) {
					msgKey.setKeyValue("PUCH_ODR_COMMENT", key.getPUCH_ODR_COMMENT());
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
				if(msgKeyType.containsKeyColumn("EXCH_RATE") && key.getEXCH_RATE() != null) {
					msgKey.setKeyValue("EXCH_RATE", key.getEXCH_RATE());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_START_DATE") && key.getOPR_INST_START_DATE() != null) {
					msgKey.setKeyValue("OPR_INST_START_DATE", key.getOPR_INST_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("WORK_ODR_DLV_DATE") && key.getWORK_ODR_DLV_DATE() != null) {
					msgKey.setKeyValue("WORK_ODR_DLV_DATE", key.getWORK_ODR_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("OWN_PERSON_NAME") && key.getOWN_PERSON_NAME() != null) {
					msgKey.setKeyValue("OWN_PERSON_NAME", key.getOWN_PERSON_NAME());
				}
				if(msgKeyType.containsKeyColumn("EXCH_TYP") && key.getEXCH_TYP() != null) {
					msgKey.setKeyValue("EXCH_TYP", key.getEXCH_TYP());
				}
				if(msgKeyType.containsKeyColumn("CUR_CD") && key.getCUR_CD() != null) {
					msgKey.setKeyValue("CUR_CD", key.getCUR_CD());
				}
				if(msgKeyType.containsKeyColumn("VEND_DECIMAL_FIG") && key.getVEND_DECIMAL_FIG() != null) {
					msgKey.setKeyValue("VEND_DECIMAL_FIG", key.getVEND_DECIMAL_FIG());
				}
				if(msgKeyType.containsKeyColumn("MIN_PROC_NO") && key.getMIN_PROC_NO() != null) {
					msgKey.setKeyValue("MIN_PROC_NO", key.getMIN_PROC_NO());
				}
				if(msgKeyType.containsKeyColumn("EFF_PHASE_IN_DATE") && key.getEFF_PHASE_IN_DATE() != null) {
					msgKey.setKeyValue("EFF_PHASE_IN_DATE", key.getEFF_PHASE_IN_DATE());
				}
				if(msgKeyType.containsKeyColumn("WORK_STS_TYP") && key.getWORK_STS_TYP() != null) {
					msgKey.setKeyValue("WORK_STS_TYP", key.getWORK_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("CHECK_MODIFY_COUNT") && key.getCHECK_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("CHECK_MODIFY_COUNT", key.getCHECK_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("VEND_ANAME") && key.getVEND_ANAME() != null) {
					msgKey.setKeyValue("VEND_ANAME", key.getVEND_ANAME());
				}
				if(msgKeyType.containsKeyColumn("MANHOUR_TYP") && key.getMANHOUR_TYP() != null) {
					msgKey.setKeyValue("MANHOUR_TYP", key.getMANHOUR_TYP());
				}
				if(msgKeyType.containsKeyColumn("SPOIL_FLG") && key.getSPOIL_FLG() != null) {
					msgKey.setKeyValue("SPOIL_FLG", key.getSPOIL_FLG());
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
					AD0030030Struct key = new AD0030030Struct();
					if(msgKeyType.containsKeyColumn("OPR_RSLT_TYP_DN")) {
						key.setOPR_RSLT_TYP_DN(msgKey.getKeyValue("OPR_RSLT_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("r1_FILTER1")) {
						key.setr1_FILTER1(msgKey.getKeyValue("r1_FILTER1"));
					}
					if(msgKeyType.containsKeyColumn("c_OUTPUT_RSLT")) {
						key.setc_OUTPUT_RSLT(msgKey.getKeyValue("c_OUTPUT_RSLT"));
					}
					if(msgKeyType.containsKeyColumn("r2_FILTER1")) {
						key.setr2_FILTER1(msgKey.getKeyValue("r2_FILTER1"));
					}
					if(msgKeyType.containsKeyColumn("c_OUTSIDE_TYP_IN")) {
						key.setc_OUTSIDE_TYP_IN(msgKey.getKeyValue("c_OUTSIDE_TYP_IN"));
					}
					if(msgKeyType.containsKeyColumn("c_OUTSIDE_TYP_OUT")) {
						key.setc_OUTSIDE_TYP_OUT(msgKey.getKeyValue("c_OUTSIDE_TYP_OUT"));
					}
					if(msgKeyType.containsKeyColumn("OUTSIDE_TYP_DN")) {
						key.setOUTSIDE_TYP_DN(msgKey.getKeyValue("OUTSIDE_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_START_TIME")) {
						key.setOPR_INST_START_TIME(msgKey.getKeyValue("OPR_INST_START_TIME"));
					}
					if(msgKeyType.containsKeyColumn("WORK_ODR_DLV_TIME")) {
						key.setWORK_ODR_DLV_TIME(msgKey.getKeyValue("WORK_ODR_DLV_TIME"));
					}
					if(msgKeyType.containsKeyColumn("ODINFO_DISGUISE")) {
						key.setODINFO_DISGUISE(msgKey.getKeyValue("ODINFO_DISGUISE"));
					}
					if(msgKeyType.containsKeyColumn("WORK_ODR_DLV_DATE_01")) {
						key.setWORK_ODR_DLV_DATE_01(msgKey.getKeyValue("WORK_ODR_DLV_DATE_01"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_START_DATE_01")) {
						key.setOPR_INST_START_DATE_01(msgKey.getKeyValue("OPR_INST_START_DATE_01"));
					}
					if(msgKeyType.containsKeyColumn("TIME_CTRL")) {
						key.setTIME_CTRL(msgKey.getKeyValue("TIME_CTRL"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_CD")) {
						key.setOPR_INST_CD(msgKey.getKeyValue("OPR_INST_CD"));
					}
					if(msgKeyType.containsKeyColumn("WORK_ODR_CD")) {
						key.setWORK_ODR_CD(msgKey.getKeyValue("WORK_ODR_CD"));
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
					if(msgKeyType.containsKeyColumn("l_JOB_ODR_CD")) {
						key.setl_JOB_ODR_CD(msgKey.getKeyValue("l_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ITEM_CD")) {
						key.setl_ITEM_CD(msgKey.getKeyValue("l_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_NAME")) {
						key.setITEM_NAME(msgKey.getKeyValue("ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_WS_CD")) {
						key.setl_WS_CD(msgKey.getKeyValue("l_WS_CD"));
					}
					if(msgKeyType.containsKeyColumn("WS_NAME")) {
						key.setWS_NAME(msgKey.getKeyValue("WS_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_VEND_CD")) {
						key.setl_VEND_CD(msgKey.getKeyValue("l_VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_VEND_ANAME")) {
						key.setl_VEND_ANAME(msgKey.getKeyValue("l_VEND_ANAME"));
					}
					if(msgKeyType.containsKeyColumn("l_WORK_ODR_DLV_DATE")) {
						key.setl_WORK_ODR_DLV_DATE(msgKey.getKeyValue("l_WORK_ODR_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_OPR_INST_START_DATE")) {
						key.setl_OPR_INST_START_DATE(msgKey.getKeyValue("l_OPR_INST_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_QTY")) {
						key.setOPR_INST_QTY(msgKey.getKeyValue("OPR_INST_QTY"));
					}
					if(msgKeyType.containsKeyColumn("WORK_IN_PROC_COMMENT")) {
						key.setWORK_IN_PROC_COMMENT(msgKey.getKeyValue("WORK_IN_PROC_COMMENT"));
					}
					if(msgKeyType.containsKeyColumn("OUTSIDE_TYP")) {
						key.setOUTSIDE_TYP(msgKey.getKeyValue("OUTSIDE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_OPR_RSLT_TYP")) {
						key.setl_OPR_RSLT_TYP(msgKey.getKeyValue("l_OPR_RSLT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("h_MODIFY_COUNT")) {
						key.seth_MODIFY_COUNT(msgKey.getKeyValue("h_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_CD")) {
						key.setJOB_ODR_CD(msgKey.getKeyValue("JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("HIDDEN_OPR_RSLT_TYP")) {
						key.setHIDDEN_OPR_RSLT_TYP(msgKey.getKeyValue("HIDDEN_OPR_RSLT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("h1_WS_CD")) {
						key.seth1_WS_CD(msgKey.getKeyValue("h1_WS_CD"));
					}
					if(msgKeyType.containsKeyColumn("HIDDEN_OUTSIDE_TYP")) {
						key.setHIDDEN_OUTSIDE_TYP(msgKey.getKeyValue("HIDDEN_OUTSIDE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("HIDDEN_OPR_RSLT_TYP2")) {
						key.setHIDDEN_OPR_RSLT_TYP2(msgKey.getKeyValue("HIDDEN_OPR_RSLT_TYP2"));
					}
					if(msgKeyType.containsKeyColumn("h2_WS_CD")) {
						key.seth2_WS_CD(msgKey.getKeyValue("h2_WS_CD"));
					}
					if(msgKeyType.containsKeyColumn("HIDDEN_OUTSIDE_TYP2")) {
						key.setHIDDEN_OUTSIDE_TYP2(msgKey.getKeyValue("HIDDEN_OUTSIDE_TYP2"));
					}
					if(msgKeyType.containsKeyColumn("HIDDEN_OPR_RSLT_TYP3")) {
						key.setHIDDEN_OPR_RSLT_TYP3(msgKey.getKeyValue("HIDDEN_OPR_RSLT_TYP3"));
					}
					if(msgKeyType.containsKeyColumn("h_VEND_CD")) {
						key.seth_VEND_CD(msgKey.getKeyValue("h_VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("WH_CD")) {
						key.setWH_CD(msgKey.getKeyValue("WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_DATE")) {
						key.setOPR_INST_DATE(msgKey.getKeyValue("OPR_INST_DATE"));
					}
					if(msgKeyType.containsKeyColumn("BUSINESS_OPR_DATE")) {
						key.setBUSINESS_OPR_DATE(msgKey.getKeyValue("BUSINESS_OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("OD_NO")) {
						key.setOD_NO(msgKey.getKeyValue("OD_NO"));
					}
					if(msgKeyType.containsKeyColumn("PS_EDITION")) {
						key.setPS_EDITION(msgKey.getKeyValue("PS_EDITION"));
					}
					if(msgKeyType.containsKeyColumn("PS_UNIT_QTY")) {
						key.setPS_UNIT_QTY(msgKey.getKeyValue("PS_UNIT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("PARENT_OD_NO")) {
						key.setPARENT_OD_NO(msgKey.getKeyValue("PARENT_OD_NO"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP")) {
						key.setMRP_ODR_TYP(msgKey.getKeyValue("MRP_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_TYP")) {
						key.setISSUE_TYP(msgKey.getKeyValue("ISSUE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("DUE_DATE")) {
						key.setDUE_DATE(msgKey.getKeyValue("DUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("PS_UNIT_DENOMINATOR")) {
						key.setPS_UNIT_DENOMINATOR(msgKey.getKeyValue("PS_UNIT_DENOMINATOR"));
					}
					if(msgKeyType.containsKeyColumn("PS_UNIT_NUMERATOR")) {
						key.setPS_UNIT_NUMERATOR(msgKey.getKeyValue("PS_UNIT_NUMERATOR"));
					}
					if(msgKeyType.containsKeyColumn("PS_SPOIL")) {
						key.setPS_SPOIL(msgKey.getKeyValue("PS_SPOIL"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_INST_CD")) {
						key.setISSUE_INST_CD(msgKey.getKeyValue("ISSUE_INST_CD"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_CD")) {
						key.setPUCH_ODR_CD(msgKey.getKeyValue("PUCH_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_INST_UNIT_QTY")) {
						key.setISSUE_INST_UNIT_QTY(msgKey.getKeyValue("ISSUE_INST_UNIT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_INST_UNIT_DENOMINATOR")) {
						key.setISSUE_INST_UNIT_DENOMINATOR(msgKey.getKeyValue("ISSUE_INST_UNIT_DENOMINATOR"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_INST_UNIT_NUMERATOR")) {
						key.setISSUE_INST_UNIT_NUMERATOR(msgKey.getKeyValue("ISSUE_INST_UNIT_NUMERATOR"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_INST_QTY")) {
						key.setISSUE_INST_QTY(msgKey.getKeyValue("ISSUE_INST_QTY"));
					}
					if(msgKeyType.containsKeyColumn("TOTAL_ISSUE_QTY")) {
						key.setTOTAL_ISSUE_QTY(msgKey.getKeyValue("TOTAL_ISSUE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("SCDL_ISSUE_DATE")) {
						key.setSCDL_ISSUE_DATE(msgKey.getKeyValue("SCDL_ISSUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_CMPLT_DATE")) {
						key.setISSUE_CMPLT_DATE(msgKey.getKeyValue("ISSUE_CMPLT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_CMPLT_FLG")) {
						key.setISSUE_CMPLT_FLG(msgKey.getKeyValue("ISSUE_CMPLT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_INST_ISS_FLG")) {
						key.setISSUE_INST_ISS_FLG(msgKey.getKeyValue("ISSUE_INST_ISS_FLG"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_INST_ISS_DATE")) {
						key.setISSUE_INST_ISS_DATE(msgKey.getKeyValue("ISSUE_INST_ISS_DATE"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_INST_COMMENT")) {
						key.setISSUE_INST_COMMENT(msgKey.getKeyValue("ISSUE_INST_COMMENT"));
					}
					if(msgKeyType.containsKeyColumn("WS_CD")) {
						key.setWS_CD(msgKey.getKeyValue("WS_CD"));
					}
					if(msgKeyType.containsKeyColumn("COMPANY_CD")) {
						key.setCOMPANY_CD(msgKey.getKeyValue("COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("VEND_CD")) {
						key.setVEND_CD(msgKey.getKeyValue("VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("CONS_TYP")) {
						key.setCONS_TYP(msgKey.getKeyValue("CONS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP")) {
						key.setUNIT_QTY_TYP(msgKey.getKeyValue("UNIT_QTY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_PERSON")) {
						key.setPUCH_ODR_PERSON(msgKey.getKeyValue("PUCH_ODR_PERSON"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_START_DATE")) {
						key.setPUCH_ODR_START_DATE(msgKey.getKeyValue("PUCH_ODR_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_DLV_DATE")) {
						key.setPUCH_ODR_DLV_DATE(msgKey.getKeyValue("PUCH_ODR_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_QTY")) {
						key.setPUCH_ODR_QTY(msgKey.getKeyValue("PUCH_ODR_QTY"));
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
					if(msgKeyType.containsKeyColumn("DISC_AMOUNT")) {
						key.setDISC_AMOUNT(msgKey.getKeyValue("DISC_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_AMOUNT")) {
						key.setPUCH_ODR_AMOUNT(msgKey.getKeyValue("PUCH_ODR_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_INST_DATE")) {
						key.setPUCH_ODR_INST_DATE(msgKey.getKeyValue("PUCH_ODR_INST_DATE"));
					}
					if(msgKeyType.containsKeyColumn("SPL_ITEM_TYP")) {
						key.setSPL_ITEM_TYP(msgKey.getKeyValue("SPL_ITEM_TYP"));
					}
					if(msgKeyType.containsKeyColumn("ACPT_INSPC_TYP")) {
						key.setACPT_INSPC_TYP(msgKey.getKeyValue("ACPT_INSPC_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_COMMENT")) {
						key.setPUCH_ODR_COMMENT(msgKey.getKeyValue("PUCH_ODR_COMMENT"));
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
					if(msgKeyType.containsKeyColumn("EXCH_RATE")) {
						key.setEXCH_RATE(msgKey.getKeyValue("EXCH_RATE"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_START_DATE")) {
						key.setOPR_INST_START_DATE(msgKey.getKeyValue("OPR_INST_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("WORK_ODR_DLV_DATE")) {
						key.setWORK_ODR_DLV_DATE(msgKey.getKeyValue("WORK_ODR_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("OWN_PERSON_NAME")) {
						key.setOWN_PERSON_NAME(msgKey.getKeyValue("OWN_PERSON_NAME"));
					}
					if(msgKeyType.containsKeyColumn("EXCH_TYP")) {
						key.setEXCH_TYP(msgKey.getKeyValue("EXCH_TYP"));
					}
					if(msgKeyType.containsKeyColumn("CUR_CD")) {
						key.setCUR_CD(msgKey.getKeyValue("CUR_CD"));
					}
					if(msgKeyType.containsKeyColumn("VEND_DECIMAL_FIG")) {
						key.setVEND_DECIMAL_FIG(msgKey.getKeyValue("VEND_DECIMAL_FIG"));
					}
					if(msgKeyType.containsKeyColumn("MIN_PROC_NO")) {
						key.setMIN_PROC_NO(msgKey.getKeyValue("MIN_PROC_NO"));
					}
					if(msgKeyType.containsKeyColumn("EFF_PHASE_IN_DATE")) {
						key.setEFF_PHASE_IN_DATE(msgKey.getKeyValue("EFF_PHASE_IN_DATE"));
					}
					if(msgKeyType.containsKeyColumn("WORK_STS_TYP")) {
						key.setWORK_STS_TYP(msgKey.getKeyValue("WORK_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("CHECK_MODIFY_COUNT")) {
						key.setCHECK_MODIFY_COUNT(msgKey.getKeyValue("CHECK_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("VEND_ANAME")) {
						key.setVEND_ANAME(msgKey.getKeyValue("VEND_ANAME"));
					}
					if(msgKeyType.containsKeyColumn("MANHOUR_TYP")) {
						key.setMANHOUR_TYP(msgKey.getKeyValue("MANHOUR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("SPOIL_FLG")) {
						key.setSPOIL_FLG(msgKey.getKeyValue("SPOIL_FLG"));
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
