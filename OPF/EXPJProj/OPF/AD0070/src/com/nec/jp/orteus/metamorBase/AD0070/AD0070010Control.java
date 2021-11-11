/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AD0070/src/com/nec/jp/orteus/metamorBase/AD0070/AD0070010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AD0070;

import com.nec.jp.orteus.metamorBase.AD0070.*;
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
//}}user_implement_code_header

public class AD0070010Control
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
	public AD0070010Struct getListvalue(int x) { return (AD0070010Struct)(this.list.get(x)); }	// リストの値を返します。
	public AD0070010Struct getStruct() { return this.struct; }	// Structを返します。
	public AD0070010Struct createStruct() { return new AD0070010Struct(); }	// 新しいStructを作って返します。
	public void setStruct(Object structname) { this.struct.setStruct((AD0070010Struct)structname); }	// Structをセットします。
	public void initializeStruct() { this.struct.initialize(); }	// Structの値を初期化します。

	// CSV出力用リスト
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }

	// TODO: ユーザ定義のコードを記述してください


	//業務日付
	private String BUSINESSOPRDATE;
	public void setBUSINESSOPRDATE(String name) { this.BUSINESSOPRDATE = name; };
	public String getBUSINESSOPRDATE() { return this.BUSINESSOPRDATE; };

	//会社コード
	private String COMPANY_CD;
	public void setCOMPANY_CD(String name) { this.COMPANY_CD = name; };
	public String getCOMPANY_CD() { return this.COMPANY_CD; };

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
	 * エラーメッセージ設定
	 * @param メッセージ番号
	 * @param 出力メッセージ
	 * @param 置換文字列１
	 */
	private void setErrorMessage(String messageno, String message, String value1)
	{
		ExpjMessage emsg = new ExpjMessage( messageno , value1 );
		msgStruct.addError( emsg );
		sysLog.warning(emsg, getsysUSER_CD());
	}

	/**
	 * インフォメーション発生時のパラメータ設定処理を切り出して関数化
	 * @param tableName テーブル名
	 * @param columnName カラム名
	 * @param value 値
	 */
	private void setInformationParameter(String tableName, String columnName, String value) {
		StringBuffer param = new StringBuffer();
		param.append(tableName);
		param.append('.');
		param.append(columnName);
		param.append(':');
		if (value != null) {
			param.append(value);
		}

		ExpjMessage emsg = new ExpjMessage("ZZ01006", param.toString());
		msgStruct.addInfo(emsg);
	}
	/**
	 * 業務ワーニング発生時のパラメータ設定処理を切り出して関数化
	 * @param tableName テーブル名
	 * @param columnName カラム名
	 * @param value 値
	 */
	private void setWarningParameter(String tableName, String columnName, String value) {
		StringBuffer param = new StringBuffer();
		param.append(tableName);
		param.append('.');
		param.append(columnName);
		param.append(':');
		if (value != null) {
			param.append(value);
		}

		ExpjMessage emsg = new ExpjMessage("ZZ01006", param.toString());
		msgStruct.addWarn(emsg);
		sysLog.info(emsg, sysUSER_CD);
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
//------------------------------------------------------------------------
	/**
	 * SQLExceptionエラーメッセージ設定
	 * @param SQLException
	 * @param 出力エラーメッセージ
	 */
	private void setSqlExceptionMsg(SQLException e) throws ExpjException
	{
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;
	}

	/**
	 * 警告メッセージ設定
	 * @param メッセージ番号
	 * @param 出力メッセージ
	 */
	private void setWarnMessage(String messageno, String message)
	{
		ExpjMessage emsg = new ExpjMessage( messageno );
		msgStruct.addWarn( emsg );
		sysLog.info(emsg, getsysUSER_CD());
		emsg = new ExpjMessage( "ZZ01006", message );
		msgStruct.addWarn( emsg );
		sysLog.info(emsg, getsysUSER_CD());
	}
		
	/**
	 * 情報メッセージ設定
	 * @param メッセージ番号
	 * @param 出力メッセージ
	 */
	private void setInfoMessage(String messageno, String message)
	{
		ExpjMessage emsg = new ExpjMessage( messageno );
		msgStruct.addInfo( emsg );
		sysLog.config(emsg, getsysUSER_CD());
		emsg = new ExpjMessage( "ZZ01006", message );
		msgStruct.addInfo( emsg );
		sysLog.config(emsg, getsysUSER_CD());
	}
		
	/**
	 * ログメッセージ設定
	 * @param メッセージ番号
	 * @param 出力メッセージ
	 */
	private void setSyslogConfig(String message)
	{
		ExpjMessage emsg = new ExpjMessage( "ZZ01006", message );
		sysLog.config(emsg, getsysUSER_CD());
	}

	/**
	 * Exceptionエラーメッセージ設定
	 * @param	code	メッセージ番号
	 * @return	ExpjMessage
	 */
	private ExpjMessage setExceptionMessage(String code)
	{
		ExpjMessage emsg = new ExpjMessage(code);
		sysLog.severe(emsg, getsysUSER_CD());
		return emsg;
	}

	/**
	 * Exceptionエラー発生時パラメータ設定
	 * @param	key		パラメータ
	 */
	private void setExceptionParameter(String key)
	{
		ExpjMessage emsg = new ExpjMessage("ZZ01006", key);
		sysLog.severe(emsg, getsysUSER_CD());
	}

	/** CSVデータリスト */
	private List _csvList = null;

	/**
	 * 初期値の設定
	 * @return boolean true 正常終了 : false 異常終了
	 */
	public boolean initialSet() throws BusinessProcessException, FoundationException
	{
		try {

			// 画面検索項目の初期化
          struct.setIN_PLANT_CD(null);
          struct.setIN_PLANT_NAME(null);
          struct.setIN_WS_CD(null);
          struct.setIN_WS_NAME(null);
          struct.setIN_VEND_CD(null);
          struct.setIN_VEND_NAME(null);
          struct.setIN_ITEM_CD(null);
          struct.setIN_ITEM_NAME(null);
          struct.setIN_WORK_ODR_CD(null);
          struct.setIN_OPR_INST_CD(null);
          struct.setIN_JOB_ODR_CD(null);
          struct.setIN_OPR_INST_START_DATE_FROM(null);
          struct.setIN_OPR_INST_START_DATE_TO(null);
          struct.setIN_WORK_ODR_DLV_DATE_FROM(null);
          struct.setIN_WORK_ODR_DLV_DATE_TO(null);
          struct.setIN_OPR_INST_START_TIME_FROM(null);
          struct.setIN_OPR_INST_START_TIME_TO(null);
          struct.setIN_WORK_ODR_DLV_TIME_FROM(null);
          struct.setIN_WORK_ODR_DLV_TIME_TO(null);
          struct.setL_IN_OPR_INST_START_DATE_FROM(null);
          struct.setL_IN_OPR_INST_START_DATE_TO(null);
          struct.setL_IN_WORK_ODR_DLV_DATE_FROM(null);
          struct.setL_IN_WORK_ODR_DLV_DATE_TO(null);
          struct.setL_IN_OPR_INST_START_DATE_FROM_ZERO(null);
          struct.setL_IN_WORK_ODR_DLV_DATE_FROM_ZERO(null);
          struct.setc1_WORK_STS_TYP(null);
          struct.setc2_WORK_STS_TYP(null);
          struct.setc3_WORK_STS_TYP(null);
          struct.setc4_WORK_STS_TYP("true");
          struct.setc5_WORK_STS_TYP(null);
          struct.setc6_WORK_STS_TYP(null);
          struct.setDOWNLOAD_FILE(null);

			// 画面一覧表示内容を初期化
			setList(null);

			// 読込ステータス設定
			setReadStatus(INITIAL);

			// 自工場コード設定
			struct.setIN_PLANT_CD(getsysPLANT_CD());

			// 工場コードの存在チェック
			List plantList = entity.mselectM_PLANT.read(conn, struct);
			if(plantList.size() <= 0) {
				// 読込処理失敗：工場コードが工場に存在しません
				return false;
			}else{
				AD0070010Struct tmpStruct = (AD0070010Struct)plantList.get(0);
				struct.setIN_PLANT_NAME(tmpStruct.getIN_PLANT_NAME());
			}

			// システムパラメータ（TIME_CTRL）取得
      AD0070010Struct tmpStruct = new AD0070010Struct();
			List TIME_CTRLList = entity.mSELECT_TIME_CTRL.read(conn, tmpStruct);
			if(null != TIME_CTRLList && TIME_CTRLList.size()>0){
				tmpStruct = (AD0070010Struct)TIME_CTRLList.get(0);
				struct.setTIME_CTRL(tmpStruct.getTIME_CTRL());
			}else{
				struct.setTIME_CTRL(null);
			}
			return true;
		} catch(SQLException e) {
			e.printStackTrace();
			// エラー処理を記述してください。
			setSqlExceptionMsg(e);
			return false;
		}
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
	 * 検索条件の設定
	 */
	private void setSearchCondition() {
		
		// データ引数クリア
		struct.setL_IN_OPR_INST_START_DATE_FROM(null);
	  struct.setL_IN_OPR_INST_START_DATE_TO(null);
	  struct.setL_IN_WORK_ODR_DLV_DATE_FROM(null);
		struct.setL_IN_WORK_ODR_DLV_DATE_TO(null);
		struct.setL_IN_OPR_INST_START_DATE_FROM_ZERO(null);
	  struct.setL_IN_WORK_ODR_DLV_DATE_FROM_ZERO(null);
		
		
		// 抽出条件（日付の設定）
		if(null != struct.getTIME_CTRL() && "true".equals(struct.getTIME_CTRL())){
			
		  // 製造着手日(From)
			if(null == struct.getIN_OPR_INST_START_DATE_FROM() || "".equals(struct.getIN_OPR_INST_START_DATE_FROM())){
				struct.setL_IN_OPR_INST_START_DATE_FROM(null);
			}else{
				// 時刻設定
				if(null == struct.getIN_OPR_INST_START_TIME_FROM() || "".equals(struct.getIN_OPR_INST_START_TIME_FROM())){
					struct.setL_IN_OPR_INST_START_DATE_FROM(struct.getIN_OPR_INST_START_DATE_FROM() + " 00:00");
				}else{
				  struct.setIN_OPR_INST_START_TIME_FROM(AppendZero(struct.getIN_OPR_INST_START_TIME_FROM(),4));
					struct.setL_IN_OPR_INST_START_DATE_FROM(struct.getIN_OPR_INST_START_DATE_FROM() + " " + 
					                                struct.getIN_OPR_INST_START_TIME_FROM().substring(0,2) + ":" + 
					                                struct.getIN_OPR_INST_START_TIME_FROM().substring(2));
				}
		  }
		  // 製造着手日(To)
			if(null == struct.getIN_OPR_INST_START_DATE_TO() || "".equals(struct.getIN_OPR_INST_START_DATE_TO())){
				struct.setL_IN_OPR_INST_START_DATE_TO(null);
			}else{
				// 時刻設定
				if(null == struct.getIN_OPR_INST_START_TIME_TO() || "".equals(struct.getIN_OPR_INST_START_TIME_TO())){
					struct.setL_IN_OPR_INST_START_DATE_TO(struct.getIN_OPR_INST_START_DATE_TO() + " 23:59");
				}else{
				  struct.setIN_OPR_INST_START_TIME_TO(AppendZero(struct.getIN_OPR_INST_START_TIME_TO(),4));
					struct.setL_IN_OPR_INST_START_DATE_TO(struct.getIN_OPR_INST_START_DATE_TO() + " " + 
					                                struct.getIN_OPR_INST_START_TIME_TO().substring(0,2) + ":" + 
					                                struct.getIN_OPR_INST_START_TIME_TO().substring(2));
				}
		  }
		  
			// 製造納期（From）
			if(null == struct.getIN_WORK_ODR_DLV_DATE_FROM() || "".equals(struct.getIN_WORK_ODR_DLV_DATE_FROM())){
			  struct.setL_IN_WORK_ODR_DLV_DATE_FROM(null);
		  }else{
				// 時刻設定
				if(null == struct.getIN_WORK_ODR_DLV_TIME_FROM() || "".equals(struct.getIN_WORK_ODR_DLV_TIME_FROM())){
			    struct.setL_IN_WORK_ODR_DLV_DATE_FROM(struct.getIN_WORK_ODR_DLV_DATE_FROM() + " 00:00");
				}else{
				  struct.setIN_WORK_ODR_DLV_TIME_FROM(AppendZero(struct.getIN_WORK_ODR_DLV_TIME_FROM(),4));
			    struct.setL_IN_WORK_ODR_DLV_DATE_FROM(struct.getIN_WORK_ODR_DLV_DATE_FROM() + " " + 
			                                  struct.getIN_WORK_ODR_DLV_TIME_FROM().substring(0,2) + ":" + 
			                                  struct.getIN_WORK_ODR_DLV_TIME_FROM().substring(2));
				}
		  }
		  // 製造納期（To）
			if(null == struct.getIN_WORK_ODR_DLV_DATE_TO() || "".equals(struct.getIN_WORK_ODR_DLV_DATE_TO())){
			  struct.setL_IN_WORK_ODR_DLV_DATE_TO(null);
		  }else{
				// 時刻設定
				if(null == struct.getIN_WORK_ODR_DLV_TIME_TO() || "".equals(struct.getIN_WORK_ODR_DLV_TIME_TO())){
			    struct.setL_IN_WORK_ODR_DLV_DATE_TO(struct.getIN_WORK_ODR_DLV_DATE_TO() + " 23:59");
				}else{
				  struct.setIN_WORK_ODR_DLV_TIME_TO(AppendZero(struct.getIN_WORK_ODR_DLV_TIME_TO(),4));
			    struct.setL_IN_WORK_ODR_DLV_DATE_TO(struct.getIN_WORK_ODR_DLV_DATE_TO() + " " + 
			                                  struct.getIN_WORK_ODR_DLV_TIME_TO().substring(0,2) + ":" + 
			                                  struct.getIN_WORK_ODR_DLV_TIME_TO().substring(2));
				}
		  }
	  }else{
			struct.setL_IN_OPR_INST_START_DATE_FROM(struct.getIN_OPR_INST_START_DATE_FROM());
			if(null == struct.getIN_OPR_INST_START_DATE_TO() || "".equals(struct.getIN_OPR_INST_START_DATE_TO())){
		  	struct.setL_IN_OPR_INST_START_DATE_TO(null);
			}else{
		  	struct.setL_IN_OPR_INST_START_DATE_TO(struct.getIN_OPR_INST_START_DATE_TO() + " 23:59");
			}
		  struct.setL_IN_WORK_ODR_DLV_DATE_FROM(struct.getIN_WORK_ODR_DLV_DATE_FROM());
		  if(null == struct.getIN_WORK_ODR_DLV_DATE_TO() || "".equals(struct.getIN_WORK_ODR_DLV_DATE_TO())){
				struct.setL_IN_WORK_ODR_DLV_DATE_TO(null);
		  }else{
				struct.setL_IN_WORK_ODR_DLV_DATE_TO(struct.getIN_WORK_ODR_DLV_DATE_TO() + " 23:59");
		  }
	  }
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
	* 時分の整理
	* @param 日付時分
	* @param 日付時分
	*/
	private String formatHM(String inDate){
			if(null == inDate || "".equals(inDate)){
				return inDate ;
			}
			if(inDate.length() < 16){
				return inDate ;
			}
			return inDate.replaceAll("00:00","     ");					
	}
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * 読込ボタン押下時に実行される処理です。
	 *
	 */
	public void controlSelect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0070");
		logger.entering("AD0070010Control"+":USER="+struct.getsUser_ID(),"controlSelect");
			//{{user_implement_dev:<controlSelect>
			// TODO: ユーザ定義のコードを記述してください

      try {

        // 読込ステータス設定
        setReadStatus(INITIAL);

        // 一覧表示内容をクリア
        setList(null);

        // CSVダウンロードファイルのクリア
        struct.setDOWNLOAD_FILE(null);

        //【エラーチェック】
        
        // 作業状態区分のチェックが全て[off]の場合
        if(!struct.getc1_WORK_STS_TYP().equals("true") 
           && !struct.getc2_WORK_STS_TYP().equals("true") 
           && !struct.getc3_WORK_STS_TYP().equals("true")
           && !struct.getc4_WORK_STS_TYP().equals("true")
           && !struct.getc5_WORK_STS_TYP().equals("true")
           && !struct.getc6_WORK_STS_TYP().equals("true")
           ){
          setErrorMessage("ZZ06001");
          return;
        }
        
        // 工場コードが指定された場合
        if(struct.getIN_PLANT_CD() != null && ("").equals(struct.getIN_PLANT_CD()) == false){
          // 工場コードの存在チェック
          List plantList = entity.mselectM_PLANT.read(conn, struct);
          if(plantList.size() <= 0) {
            // 読込処理失敗：工場コードが工場に存在しません
            setErrorMessage("ZZ09028");
            setErrorParameter("M_PLANT", "PLANT_CD", struct.getIN_PLANT_CD());
            return;
          }else{
            AD0070010Struct tmpStruct = (AD0070010Struct)plantList.get(0);
            struct.setIN_PLANT_NAME(tmpStruct.getIN_PLANT_NAME());
          }
        }else{
          struct.setIN_PLANT_NAME(null);
        }
        
        // 作業区コードが指定された場合
        if(struct.getIN_WS_CD() != null && ("").equals(struct.getIN_WS_CD()) == false){
          // 作業区コードの存在チェック
          List wsList = entity.mselectM_WS.read(conn, struct);
          if(wsList.size() <= 0) {
            // 読込処理失敗：作業区が存在しません
            setErrorMessage("ZZ11007");
            setErrorParameter("M_WS", "WS_CD", struct.getIN_WS_CD());
            return;
          }else{
            AD0070010Struct tmpStruct = (AD0070010Struct)wsList.get(0);
            struct.setIN_WS_NAME(tmpStruct.getIN_WS_NAME());
            
            // 工場コードが指定された場合関連チェックを行う
            // 　画面.工場コードは入力されているか？
            if(struct.getIN_PLANT_CD() != null && ("").equals(struct.getIN_PLANT_CD()) == false){
              if(tmpStruct.getreadWS_PLANT_CD().equals(struct.getIN_PLANT_CD()) == false){
                // 検索条件不一致：工場コードと作業区の工場コードが一致しません
                setErrorMessage("AD00109");
                setErrorParameter("M_WS", "WS_CD", struct.getIN_WS_CD());
                return;
              }
            }
          }
        }else{
          struct.setIN_WS_NAME(null);
        }
        
        // 取引先コードが指定された場合
        if(struct.getIN_VEND_CD() != null && ("").equals(struct.getIN_VEND_CD()) == false){
          // 取引先コードの存在チェック
          List vendList = entity.mselectM_VEND_CTRL.read(conn, struct);
          if(vendList.size() <= 0) {
            // 読込処理失敗：取引先マスタが存在しません
            setErrorMessage("ZZ11005");
            setErrorParameter("M_VEND_CTRL", "VEND_CD", struct.getIN_VEND_CD());
            return;
          }else{
            AD0070010Struct tmpStruct = (AD0070010Struct)vendList.get(0);
            struct.setIN_VEND_NAME(tmpStruct.getIN_VEND_NAME());
          }
        }else{
          struct.setIN_VEND_NAME(null);
        }
        
        // 品目コードが指定された場合
        if(struct.getIN_ITEM_CD() != null && ("").equals(struct.getIN_ITEM_CD()) == false){
          // 品目コードの存在チェック
          List itemList = entity.mselectM_ITEM.read(conn, struct);
          if(itemList.size() <= 0) {
            // 読込処理失敗：品目が存在しません
            setErrorMessage("ZZ11002");
            setErrorParameter("M_ITEM", "ITEM_CD", struct.getIN_ITEM_CD());
            return;
          }else{
            AD0070010Struct tmpStruct = (AD0070010Struct)itemList.get(0);
            struct.setIN_ITEM_NAME(tmpStruct.getIN_ITEM_NAME());
          }
        }else{
          struct.setIN_ITEM_NAME(null);
        }
        
        // 作業計画番号が指定された場合
        if(struct.getIN_WORK_ODR_CD() != null && ("").equals(struct.getIN_WORK_ODR_CD()) == false){
          // 作業計画番号の存在チェック
          List workList = entity.mselectT_WORK_IN_PROC_BY_ITEM.read(conn, struct);
          if(workList.size() <= 0) {
            // 読込処理失敗：作業計画番号が存在しません
            setErrorMessage("AD00107");
            setErrorParameter("T_WORK_IN_PROC_BY_ITEM", "WORK_ODR_CD", struct.getIN_WORK_ODR_CD());
            return;
          }else{
            AD0070010Struct tmpStruct = (AD0070010Struct)workList.get(0);
            
            // 工場コードが指定された場合関連チェックを行う
            // 　画面.工場コードは入力されているか？
            if(struct.getIN_PLANT_CD() != null && ("").equals(struct.getIN_PLANT_CD()) == false){
              if(tmpStruct.getreadPLANT_CD().equals(struct.getIN_PLANT_CD()) == false){
                // 検索条件不一致：工場コードと作業計画番号の工場コードが一致しません
                setErrorMessage("AD00110");
                setErrorParameter("T_WORK_IN_PROC_BY_ITEM", "WORK_ODR_CD", struct.getIN_WORK_ODR_CD());
                return;
              }
            }
          }
        }
        
        // 作業指示番号が指定された場合
        if(struct.getIN_OPR_INST_CD() != null && ("").equals(struct.getIN_OPR_INST_CD()) == false){
          // 作業指示番号の存在チェック
          List oprList = entity.mselectT_OPR_INST_SLIP.read(conn, struct);
          if(oprList.size() <= 0) {
            // 読込処理失敗：作業指示番伝票が存在しません
            setErrorMessage("AD30587");
            setErrorParameter("T_OPR_INST_SLIP", "OPR_INST_CD", struct.getIN_OPR_INST_CD());
            return;
          }else{
            AD0070010Struct tmpStruct = (AD0070010Struct)oprList.get(0);
            
            // 工場コードが指定された場合関連チェックを行う
            // 　画面.工場コードは入力されているか？
            if(struct.getIN_PLANT_CD() != null && ("").equals(struct.getIN_PLANT_CD()) == false){
              if(tmpStruct.getreadPLANT_CD().equals(struct.getIN_PLANT_CD()) == false){
                // 検索条件不一致：工場コードと作業指示番号の工場コードが一致しません
                setErrorMessage("AD00111");
                setErrorParameter("T_OPR_INST_SLIP", "OPR_INST_CD", struct.getIN_OPR_INST_CD());
                return;
              }
            }
          }
        }
        
        // 製番が指定された場合
        if(struct.getIN_JOB_ODR_CD() != null && ("").equals(struct.getIN_JOB_ODR_CD()) == false){
          // 製番の存在チェック
          List jobList = entity.mreadT_JOB_ODR.read(conn, struct);
          if(jobList.size() <= 0) {
            // 読込処理失敗：製番が製番計画に存在しません
            setErrorMessage("AD00108");
            setErrorParameter("T_JOB_ODR", "JOB_ODR_CD", struct.getIN_JOB_ODR_CD());
            return;
          }else{
            AD0070010Struct tmpStruct = (AD0070010Struct)jobList.get(0);
            
            // 工場コードが指定された場合関連チェックを行う
            // 　画面.工場コードは入力されているか？
            if(struct.getIN_PLANT_CD() != null && ("").equals(struct.getIN_PLANT_CD()) == false){
              if(tmpStruct.getreadPLANT_CD().equals(struct.getIN_PLANT_CD()) == false){
                // 検索条件不一致：工場コードと製番の工場コードが一致しません
                setErrorMessage("AD00112");
                setErrorParameter("T_JOB_ODR", "JOB_ODR_CD", struct.getIN_JOB_ODR_CD());
                return;
              }
            }
          }
        }
        
        //【データ読込】
        
        // 読込ステータス設定
        setReadStatus(INITIAL);
        
        //画面．ステータスの初期化
        struct.setSTATUS1(null);
        struct.setSTATUS2(null);
        struct.setSTATUS3(null);
        struct.setSTATUS4(null);
        struct.setSTATUS5(null);
        struct.setSTATUS6(null);
        
        //画面．ステータスの判定
        if(struct.getc1_WORK_STS_TYP().equals("true")){
          struct.setSTATUS1("1");
        }
        if(struct.getc2_WORK_STS_TYP().equals("true")){
          struct.setSTATUS2("2");
        }
        if(struct.getc3_WORK_STS_TYP().equals("true")){
          struct.setSTATUS3("3");
        }
        if(struct.getc4_WORK_STS_TYP().equals("true")){
          struct.setSTATUS4("4");
        }
        if(struct.getc5_WORK_STS_TYP().equals("true")){
          struct.setSTATUS5("5");
        }
        if(struct.getc6_WORK_STS_TYP().equals("true")){
          struct.setSTATUS6("6");
        }

				// 検索条件の設定
			setSearchCondition();
			// 表示最大行数制限
			ScreenParam sp = new ScreenParam(this.getClass());
			int maxLine = sp.getMaxLine(conn, 10);
			if (maxLine != 0)
				struct.setROW_COUNT(String.valueOf(maxLine));
			else
				struct.setROW_COUNT(null);

			// 検索条件に指定された内容で[作業指示伝票･品目別仕掛･作業系列別仕掛]より取得
			List tempList = entity.mselectWorkInProcCnt.read(conn, struct);
			long rowCount = Long.parseLong(((AD0070010Struct) tempList.get(0))
					.getl_COUNT());

			// 該当レコードが取得できない場合。
			if (rowCount == 0) {
				// 読込処理失敗：対象エータが存在しません
				setErrorMessage("ZZ06001");
				setReadStatus(NOT_FOUND);
				 // 表示用リストにセット
				if(list !=null && list.size()>0){
					list.clear();
				}
				return;
			} else {
				// 表示最大行数制限処理

				if (maxLine != 0 && rowCount == maxLine + 1) {
					// 読込ステータス設定
					setReadStatus(TOO_MANY);
					setErrorMessage("ZZ01119", "" + maxLine);
                   // 表示用リストにセット
					if(list !=null && list.size()>0){
						list.clear();
					}
					return;
				} else {
					// 読込ステータス設定
					setReadStatus(NORMAL);
					// 表示用リストにセット
					tempList = entity.mselectWorkInProc.read(conn, struct);
					// CSV出力用に待避
					_csvList = tempList;
					setList(tempList);
            AD0070010Struct TempStruct;
            for (int i = 0; i < list.size(); i++) {
		     TempStruct = (AD0070010Struct)list.get(i);
		     // コンボボックスの取得
		     TempStruct.setSTATUS_DN(multcombo("OPR_INST_STATUS",TempStruct.getSTATUS_DN()));
		     TempStruct.setWORK_STS_NAME(multcombo("WORK_STS_TYP",TempStruct.getWORK_STS_NAME()));
		     TempStruct.setMRP_ODR_TYP(multcombo("MRP_ODR_TYP",TempStruct.getMRP_ODR_TYP()));
		     TempStruct.setOUTSIDE_TYP(multcombo("OUTSIDE_TYP",TempStruct.getOUTSIDE_TYP()));
		     TempStruct.setACPT_INSPC_TYP(multcombo("ACPT_INSPC_TYP",TempStruct.getACPT_INSPC_TYP()));
		     
		    }
          }
        }
        
      } catch(SQLException e) {
        
        e.printStackTrace();
        
        // 読込ステータス設定
        setReadStatus(ERROR);
        setSqlExceptionMsg(e);
      }
      
                //}}user_implement_dev:<controlSelect>
		logger.exiting("AD0070010Control"+":USER="+struct.getsUser_ID(),"controlSelect");

		return;
	}

	/**
	 * CSV出力ボタン押下時に実行される処理です。
	 *
	 */
	public void controlCsvOut() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0070");
		logger.entering("AD0070010Control"+":USER="+struct.getsUser_ID(),"controlCsvOut");
			//{{user_implement_dev:<controlCsvOut>
			// TODO: ユーザ定義のコードを記述してください


		// 初期化
		csvWriter = new CsvWriter(CsvWriter.getFileName(getsysUSER_CD()));
		List csvList = new ArrayList();

		// タイトル行
		String[] title = {
			"Expj.Cmt0721" ,
			"Expj.PLANT_CD" ,
			"Expj.WORK_ODR_CD" ,
			"Expj.PROC_NO_1" ,
			"Expj.WORK_IN_PROC_CD" ,
			"Expj.PROC_NAME_1" ,
			"Expj.WORK_ODR_DLV_DATE_3" ,
			"Expj.PRD_START_DATE" ,
			"Expj.OPR_INST_CD" ,
			"Expj.PUCH_ODR_CD" ,
			"Expj.OPR_INST_DATE" ,
			"Expj.OPR_INST_SLIP_ISS_DATE" ,
			"Expj.OPR_INST_QTY" ,
			"Expj.Cmt0318" ,
			"Expj.Cmt0325" ,
			"Expj.STOCK_UNIT_1" ,
			"Expj.WORK_STS_TYP" ,
			"Expj.WORK_CMPLT_DATE" ,
			"Expj.ITEM_CD" ,
			"Expj.ITEM_NAME" ,
			"Expj.DRAW_CD" ,
			"Expj.ITEM_SPEC" ,
			"Expj.MRP_ODR_TYP" ,
			"Expj.JOB_ODR_CD" ,
			"Expj.JOB_ODR_CANCEL_NO" ,
			"Expj.OUTSIDE_TYP_2" ,
			"Expj.ACPT_INSPC_TYP" ,
			"Expj.WS_CD" ,
			"Expj.WS_NAME" ,
			"Expj.VEND_CD" ,
			"Expj.VEND_NAME" 
		};
		csvList.add(title);

		// データ行
		for (Iterator i = _csvList.iterator(); i.hasNext();) {
          AD0070010Struct csvStruct = (AD0070010Struct) i.next();
          String[] csvStr = new String[title.length];
          csvStr[0] = csvStruct.getSTATUS_DN();				// ステータス
          csvStr[1] = csvStruct.getPLANT_CD();				// 工場コード
          csvStr[2] = csvStruct.getWORK_ODR_CD();				// 作業計画番号
          csvStr[3] = csvStruct.getPROC_NO();					// 仕掛作業系列番号
          csvStr[4] = csvStruct.getWORK_IN_PROC_CD();			// 仕掛作業コード
          csvStr[5] = csvStruct.getPROC_NAME();				// 仕掛作業名
          csvStr[6] = csvStruct.getWORK_ODR_DLV_DATE();		// 製造納期
          csvStr[7] = csvStruct.getOPR_INST_START_DATE();		// 製造着手日
          csvStr[8] = csvStruct.getOPR_INST_CD();				// 作業指示番号
          csvStr[9] = csvStruct.getPUCH_ODR_CD();				// 発注番号
          csvStr[10] = csvStruct.getOPR_INST_DATE();			// 作業指示日
          csvStr[11] = csvStruct.getOPR_INST_SLIP_ISS_DATE();	// 作業指示伝票発行日
          csvStr[12] = csvStruct.getOPR_INST_QTY();			// 作業指示数
          csvStr[13] = csvStruct.getSUM_ACPT_QTY();			// 良品累計数
          csvStr[14] = csvStruct.getSUM_DEFECT_QTY();			// 不良累計数
          csvStr[15] = csvStruct.getSTOCK_UNIT();				// 単位
          csvStr[16] = csvStruct.getWORK_STS_NAME();			// 作業状態区分
          csvStr[17] = csvStruct.getWORK_CMPLT_DATE();		// 作業完了日
          csvStr[18] = csvStruct.getITEM_CD();				// 品目番号
          csvStr[19] = csvStruct.getITEM_NAME();				// 品目名
          csvStr[20] = csvStruct.getDRAW_CD();				// 図面番号
          csvStr[21] = csvStruct.getSPEC();					// 規格
          csvStr[22] = csvStruct.getMRP_ODR_TYP();			// 品目手配区分
          csvStr[23] = csvStruct.getJOB_ODR_CD();				// 製番
          csvStr[24] = csvStruct.getJOB_ODR_CANCEL_NO();		// 製番取消発生番号
          csvStr[25] = csvStruct.getOUTSIDE_TYP();			// 仕掛内外作区分
          csvStr[26] = csvStruct.getACPT_INSPC_TYP();			// 受入検査区分
          csvStr[27] = csvStruct.getWS_CD();					// 作業区コード
          csvStr[28] = csvStruct.getWS_NAME();				// 作業区名
          csvStr[29] = csvStruct.getVEND_CD();				// 取引先コード
          csvStr[30] = csvStruct.getVEND_ANAME();				// 取引先名
          csvList.add(csvStr);
		}

		if (csvList != null && !csvList.isEmpty()) {
			// CsvWriterを生成
			csvWriter = new CsvWriter(CsvWriter.getFileName(sysUSER_CD));
			csvWriter.write(csvList, CoreTools.getLocale(struct.getsUser_ID()),true);
			struct.setDOWNLOAD_FILE(csvWriter.getFilePath());
		}

                //}}user_implement_dev:<controlCsvOut>
		logger.exiting("AD0070010Control"+":USER="+struct.getsUser_ID(),"controlCsvOut");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0070");
		logger.entering("AD0070010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
			// TODO: ユーザ定義のコードを記述してください

			// 項目をクリアする（初期値をセット）
			initialSet();

                //}}user_implement_dev:<controlClear>
		logger.exiting("AD0070010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0070");
		logger.entering("AD0070010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AD0070010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0070");
		logger.entering("AD0070010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>

			// 項目をクリアする（初期値をセット）
			initialSet();

                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AD0070010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * イベントハンドラの前処理です。
	 *
	 * @param buttun ボタン名
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0070");
		logger.entering("AD0070010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");
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
		logger.exiting("AD0070010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("CsvOut") ) {
				controlCsvOut();
			} else if( button.equals("Clear") ) {
				controlClear();
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
//			throw new FoundationException("AD0070010Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AD0070010-E999","CSVの出力処理"));
			throw new FoundationException("AD0070010Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AD0070010-E999","システム日付の取得処理"));
				throw new FoundationException("AD0070010Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AD0070010-E999","コントロールのイベント処理"));
			throw new FoundationException("AD0070010Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected AD0070010Entity entity;
	protected AD0070010Struct struct;
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

		entity = new AD0070010Entity();
		struct = new AD0070010Struct();

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
	 * AD0070010クラスの標準コンストラクタ
	 */
	public AD0070010Control() throws BusinessProcessException, FoundationException
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
				AD0070010Struct key = (AD0070010Struct)keyList.get(j);
				// メッセージキーを作成する
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("c3_WORK_STS_TYP") && key.getc3_WORK_STS_TYP() != null) {
					msgKey.setKeyValue("c3_WORK_STS_TYP", key.getc3_WORK_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE") && key.getDOWNLOAD_FILE() != null) {
					msgKey.setKeyValue("DOWNLOAD_FILE", key.getDOWNLOAD_FILE());
				}
				if(msgKeyType.containsKeyColumn("IN_OPR_INST_START_DATE_FROM") && key.getIN_OPR_INST_START_DATE_FROM() != null) {
					msgKey.setKeyValue("IN_OPR_INST_START_DATE_FROM", key.getIN_OPR_INST_START_DATE_FROM());
				}
				if(msgKeyType.containsKeyColumn("IN_OPR_INST_START_DATE_TO") && key.getIN_OPR_INST_START_DATE_TO() != null) {
					msgKey.setKeyValue("IN_OPR_INST_START_DATE_TO", key.getIN_OPR_INST_START_DATE_TO());
				}
				if(msgKeyType.containsKeyColumn("IN_WORK_ODR_DLV_DATE_FROM") && key.getIN_WORK_ODR_DLV_DATE_FROM() != null) {
					msgKey.setKeyValue("IN_WORK_ODR_DLV_DATE_FROM", key.getIN_WORK_ODR_DLV_DATE_FROM());
				}
				if(msgKeyType.containsKeyColumn("IN_WORK_ODR_DLV_DATE_TO") && key.getIN_WORK_ODR_DLV_DATE_TO() != null) {
					msgKey.setKeyValue("IN_WORK_ODR_DLV_DATE_TO", key.getIN_WORK_ODR_DLV_DATE_TO());
				}
				if(msgKeyType.containsKeyColumn("c4_WORK_STS_TYP") && key.getc4_WORK_STS_TYP() != null) {
					msgKey.setKeyValue("c4_WORK_STS_TYP", key.getc4_WORK_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("c5_WORK_STS_TYP") && key.getc5_WORK_STS_TYP() != null) {
					msgKey.setKeyValue("c5_WORK_STS_TYP", key.getc5_WORK_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("c6_WORK_STS_TYP") && key.getc6_WORK_STS_TYP() != null) {
					msgKey.setKeyValue("c6_WORK_STS_TYP", key.getc6_WORK_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("c1_WORK_STS_TYP") && key.getc1_WORK_STS_TYP() != null) {
					msgKey.setKeyValue("c1_WORK_STS_TYP", key.getc1_WORK_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("c2_WORK_STS_TYP") && key.getc2_WORK_STS_TYP() != null) {
					msgKey.setKeyValue("c2_WORK_STS_TYP", key.getc2_WORK_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("IN_OPR_INST_START_TIME_FROM") && key.getIN_OPR_INST_START_TIME_FROM() != null) {
					msgKey.setKeyValue("IN_OPR_INST_START_TIME_FROM", key.getIN_OPR_INST_START_TIME_FROM());
				}
				if(msgKeyType.containsKeyColumn("IN_OPR_INST_START_TIME_TO") && key.getIN_OPR_INST_START_TIME_TO() != null) {
					msgKey.setKeyValue("IN_OPR_INST_START_TIME_TO", key.getIN_OPR_INST_START_TIME_TO());
				}
				if(msgKeyType.containsKeyColumn("IN_WORK_ODR_DLV_TIME_FROM") && key.getIN_WORK_ODR_DLV_TIME_FROM() != null) {
					msgKey.setKeyValue("IN_WORK_ODR_DLV_TIME_FROM", key.getIN_WORK_ODR_DLV_TIME_FROM());
				}
				if(msgKeyType.containsKeyColumn("IN_WORK_ODR_DLV_TIME_TO") && key.getIN_WORK_ODR_DLV_TIME_TO() != null) {
					msgKey.setKeyValue("IN_WORK_ODR_DLV_TIME_TO", key.getIN_WORK_ODR_DLV_TIME_TO());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("WORK_ODR_CD") && key.getWORK_ODR_CD() != null) {
					msgKey.setKeyValue("WORK_ODR_CD", key.getWORK_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("PROC_NO") && key.getPROC_NO() != null) {
					msgKey.setKeyValue("PROC_NO", key.getPROC_NO());
				}
				if(msgKeyType.containsKeyColumn("WORK_IN_PROC_CD") && key.getWORK_IN_PROC_CD() != null) {
					msgKey.setKeyValue("WORK_IN_PROC_CD", key.getWORK_IN_PROC_CD());
				}
				if(msgKeyType.containsKeyColumn("PROC_NAME") && key.getPROC_NAME() != null) {
					msgKey.setKeyValue("PROC_NAME", key.getPROC_NAME());
				}
				if(msgKeyType.containsKeyColumn("WORK_ODR_DLV_DATE") && key.getWORK_ODR_DLV_DATE() != null) {
					msgKey.setKeyValue("WORK_ODR_DLV_DATE", key.getWORK_ODR_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_START_DATE") && key.getOPR_INST_START_DATE() != null) {
					msgKey.setKeyValue("OPR_INST_START_DATE", key.getOPR_INST_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_CD") && key.getOPR_INST_CD() != null) {
					msgKey.setKeyValue("OPR_INST_CD", key.getOPR_INST_CD());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_DATE") && key.getOPR_INST_DATE() != null) {
					msgKey.setKeyValue("OPR_INST_DATE", key.getOPR_INST_DATE());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_QTY") && key.getOPR_INST_QTY() != null) {
					msgKey.setKeyValue("OPR_INST_QTY", key.getOPR_INST_QTY());
				}
				if(msgKeyType.containsKeyColumn("SUM_ACPT_QTY") && key.getSUM_ACPT_QTY() != null) {
					msgKey.setKeyValue("SUM_ACPT_QTY", key.getSUM_ACPT_QTY());
				}
				if(msgKeyType.containsKeyColumn("SUM_DEFECT_QTY") && key.getSUM_DEFECT_QTY() != null) {
					msgKey.setKeyValue("SUM_DEFECT_QTY", key.getSUM_DEFECT_QTY());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT") && key.getSTOCK_UNIT() != null) {
					msgKey.setKeyValue("STOCK_UNIT", key.getSTOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("WORK_STS_NAME") && key.getWORK_STS_NAME() != null) {
					msgKey.setKeyValue("WORK_STS_NAME", key.getWORK_STS_NAME());
				}
				if(msgKeyType.containsKeyColumn("WORK_CMPLT_DATE") && key.getWORK_CMPLT_DATE() != null) {
					msgKey.setKeyValue("WORK_CMPLT_DATE", key.getWORK_CMPLT_DATE());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
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
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP") && key.getMRP_ODR_TYP() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP", key.getMRP_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_CD") && key.getJOB_ODR_CD() != null) {
					msgKey.setKeyValue("JOB_ODR_CD", key.getJOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_CANCEL_NO") && key.getJOB_ODR_CANCEL_NO() != null) {
					msgKey.setKeyValue("JOB_ODR_CANCEL_NO", key.getJOB_ODR_CANCEL_NO());
				}
				if(msgKeyType.containsKeyColumn("OUTSIDE_TYP") && key.getOUTSIDE_TYP() != null) {
					msgKey.setKeyValue("OUTSIDE_TYP", key.getOUTSIDE_TYP());
				}
				if(msgKeyType.containsKeyColumn("WS_CD") && key.getWS_CD() != null) {
					msgKey.setKeyValue("WS_CD", key.getWS_CD());
				}
				if(msgKeyType.containsKeyColumn("WS_NAME") && key.getWS_NAME() != null) {
					msgKey.setKeyValue("WS_NAME", key.getWS_NAME());
				}
				if(msgKeyType.containsKeyColumn("VEND_CD") && key.getVEND_CD() != null) {
					msgKey.setKeyValue("VEND_CD", key.getVEND_CD());
				}
				if(msgKeyType.containsKeyColumn("VEND_ANAME") && key.getVEND_ANAME() != null) {
					msgKey.setKeyValue("VEND_ANAME", key.getVEND_ANAME());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_CD") && key.getPUCH_ODR_CD() != null) {
					msgKey.setKeyValue("PUCH_ODR_CD", key.getPUCH_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_SLIP_ISS_DATE") && key.getOPR_INST_SLIP_ISS_DATE() != null) {
					msgKey.setKeyValue("OPR_INST_SLIP_ISS_DATE", key.getOPR_INST_SLIP_ISS_DATE());
				}
				if(msgKeyType.containsKeyColumn("ACPT_INSPC_TYP") && key.getACPT_INSPC_TYP() != null) {
					msgKey.setKeyValue("ACPT_INSPC_TYP", key.getACPT_INSPC_TYP());
				}
				if(msgKeyType.containsKeyColumn("STATUS_DN") && key.getSTATUS_DN() != null) {
					msgKey.setKeyValue("STATUS_DN", key.getSTATUS_DN());
				}
				if(msgKeyType.containsKeyColumn("IN_PLANT_CD") && key.getIN_PLANT_CD() != null) {
					msgKey.setKeyValue("IN_PLANT_CD", key.getIN_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("IN_WS_CD") && key.getIN_WS_CD() != null) {
					msgKey.setKeyValue("IN_WS_CD", key.getIN_WS_CD());
				}
				if(msgKeyType.containsKeyColumn("IN_VEND_CD") && key.getIN_VEND_CD() != null) {
					msgKey.setKeyValue("IN_VEND_CD", key.getIN_VEND_CD());
				}
				if(msgKeyType.containsKeyColumn("IN_ITEM_CD") && key.getIN_ITEM_CD() != null) {
					msgKey.setKeyValue("IN_ITEM_CD", key.getIN_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("IN_WORK_ODR_CD") && key.getIN_WORK_ODR_CD() != null) {
					msgKey.setKeyValue("IN_WORK_ODR_CD", key.getIN_WORK_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("IN_OPR_INST_CD") && key.getIN_OPR_INST_CD() != null) {
					msgKey.setKeyValue("IN_OPR_INST_CD", key.getIN_OPR_INST_CD());
				}
				if(msgKeyType.containsKeyColumn("IN_JOB_ODR_CD") && key.getIN_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("IN_JOB_ODR_CD", key.getIN_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("L_IN_OPR_INST_START_DATE_FROM") && key.getL_IN_OPR_INST_START_DATE_FROM() != null) {
					msgKey.setKeyValue("L_IN_OPR_INST_START_DATE_FROM", key.getL_IN_OPR_INST_START_DATE_FROM());
				}
				if(msgKeyType.containsKeyColumn("L_IN_OPR_INST_START_DATE_TO") && key.getL_IN_OPR_INST_START_DATE_TO() != null) {
					msgKey.setKeyValue("L_IN_OPR_INST_START_DATE_TO", key.getL_IN_OPR_INST_START_DATE_TO());
				}
				if(msgKeyType.containsKeyColumn("L_IN_OPR_INST_START_DATE_FROM_ZERO") && key.getL_IN_OPR_INST_START_DATE_FROM_ZERO() != null) {
					msgKey.setKeyValue("L_IN_OPR_INST_START_DATE_FROM_ZERO", key.getL_IN_OPR_INST_START_DATE_FROM_ZERO());
				}
				if(msgKeyType.containsKeyColumn("L_IN_WORK_ODR_DLV_DATE_FROM") && key.getL_IN_WORK_ODR_DLV_DATE_FROM() != null) {
					msgKey.setKeyValue("L_IN_WORK_ODR_DLV_DATE_FROM", key.getL_IN_WORK_ODR_DLV_DATE_FROM());
				}
				if(msgKeyType.containsKeyColumn("L_IN_WORK_ODR_DLV_DATE_TO") && key.getL_IN_WORK_ODR_DLV_DATE_TO() != null) {
					msgKey.setKeyValue("L_IN_WORK_ODR_DLV_DATE_TO", key.getL_IN_WORK_ODR_DLV_DATE_TO());
				}
				if(msgKeyType.containsKeyColumn("L_IN_WORK_ODR_DLV_DATE_FROM_ZERO") && key.getL_IN_WORK_ODR_DLV_DATE_FROM_ZERO() != null) {
					msgKey.setKeyValue("L_IN_WORK_ODR_DLV_DATE_FROM_ZERO", key.getL_IN_WORK_ODR_DLV_DATE_FROM_ZERO());
				}
				if(msgKeyType.containsKeyColumn("STATUS1") && key.getSTATUS1() != null) {
					msgKey.setKeyValue("STATUS1", key.getSTATUS1());
				}
				if(msgKeyType.containsKeyColumn("STATUS2") && key.getSTATUS2() != null) {
					msgKey.setKeyValue("STATUS2", key.getSTATUS2());
				}
				if(msgKeyType.containsKeyColumn("STATUS3") && key.getSTATUS3() != null) {
					msgKey.setKeyValue("STATUS3", key.getSTATUS3());
				}
				if(msgKeyType.containsKeyColumn("STATUS4") && key.getSTATUS4() != null) {
					msgKey.setKeyValue("STATUS4", key.getSTATUS4());
				}
				if(msgKeyType.containsKeyColumn("STATUS5") && key.getSTATUS5() != null) {
					msgKey.setKeyValue("STATUS5", key.getSTATUS5());
				}
				if(msgKeyType.containsKeyColumn("STATUS6") && key.getSTATUS6() != null) {
					msgKey.setKeyValue("STATUS6", key.getSTATUS6());
				}
				if(msgKeyType.containsKeyColumn("readPLAN_CD") && key.getreadPLAN_CD() != null) {
					msgKey.setKeyValue("readPLAN_CD", key.getreadPLAN_CD());
				}
				if(msgKeyType.containsKeyColumn("IN_PLANT_NAME") && key.getIN_PLANT_NAME() != null) {
					msgKey.setKeyValue("IN_PLANT_NAME", key.getIN_PLANT_NAME());
				}
				if(msgKeyType.containsKeyColumn("readWS_CD") && key.getreadWS_CD() != null) {
					msgKey.setKeyValue("readWS_CD", key.getreadWS_CD());
				}
				if(msgKeyType.containsKeyColumn("IN_WS_NAME") && key.getIN_WS_NAME() != null) {
					msgKey.setKeyValue("IN_WS_NAME", key.getIN_WS_NAME());
				}
				if(msgKeyType.containsKeyColumn("readWS_PLANT_CD") && key.getreadWS_PLANT_CD() != null) {
					msgKey.setKeyValue("readWS_PLANT_CD", key.getreadWS_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("readVEND_CD") && key.getreadVEND_CD() != null) {
					msgKey.setKeyValue("readVEND_CD", key.getreadVEND_CD());
				}
				if(msgKeyType.containsKeyColumn("IN_VEND_NAME") && key.getIN_VEND_NAME() != null) {
					msgKey.setKeyValue("IN_VEND_NAME", key.getIN_VEND_NAME());
				}
				if(msgKeyType.containsKeyColumn("readITEM_CD") && key.getreadITEM_CD() != null) {
					msgKey.setKeyValue("readITEM_CD", key.getreadITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("IN_ITEM_NAME") && key.getIN_ITEM_NAME() != null) {
					msgKey.setKeyValue("IN_ITEM_NAME", key.getIN_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("readWORK_ODR_CD") && key.getreadWORK_ODR_CD() != null) {
					msgKey.setKeyValue("readWORK_ODR_CD", key.getreadWORK_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("readPLANT_CD") && key.getreadPLANT_CD() != null) {
					msgKey.setKeyValue("readPLANT_CD", key.getreadPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("readOPR_INST_CD") && key.getreadOPR_INST_CD() != null) {
					msgKey.setKeyValue("readOPR_INST_CD", key.getreadOPR_INST_CD());
				}
				if(msgKeyType.containsKeyColumn("readJOB_ODR_CD") && key.getreadJOB_ODR_CD() != null) {
					msgKey.setKeyValue("readJOB_ODR_CD", key.getreadJOB_ODR_CD());
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
					AD0070010Struct key = new AD0070010Struct();
					if(msgKeyType.containsKeyColumn("c3_WORK_STS_TYP")) {
						key.setc3_WORK_STS_TYP(msgKey.getKeyValue("c3_WORK_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE")) {
						key.setDOWNLOAD_FILE(msgKey.getKeyValue("DOWNLOAD_FILE"));
					}
					if(msgKeyType.containsKeyColumn("IN_OPR_INST_START_DATE_FROM")) {
						key.setIN_OPR_INST_START_DATE_FROM(msgKey.getKeyValue("IN_OPR_INST_START_DATE_FROM"));
					}
					if(msgKeyType.containsKeyColumn("IN_OPR_INST_START_DATE_TO")) {
						key.setIN_OPR_INST_START_DATE_TO(msgKey.getKeyValue("IN_OPR_INST_START_DATE_TO"));
					}
					if(msgKeyType.containsKeyColumn("IN_WORK_ODR_DLV_DATE_FROM")) {
						key.setIN_WORK_ODR_DLV_DATE_FROM(msgKey.getKeyValue("IN_WORK_ODR_DLV_DATE_FROM"));
					}
					if(msgKeyType.containsKeyColumn("IN_WORK_ODR_DLV_DATE_TO")) {
						key.setIN_WORK_ODR_DLV_DATE_TO(msgKey.getKeyValue("IN_WORK_ODR_DLV_DATE_TO"));
					}
					if(msgKeyType.containsKeyColumn("c4_WORK_STS_TYP")) {
						key.setc4_WORK_STS_TYP(msgKey.getKeyValue("c4_WORK_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("c5_WORK_STS_TYP")) {
						key.setc5_WORK_STS_TYP(msgKey.getKeyValue("c5_WORK_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("c6_WORK_STS_TYP")) {
						key.setc6_WORK_STS_TYP(msgKey.getKeyValue("c6_WORK_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("c1_WORK_STS_TYP")) {
						key.setc1_WORK_STS_TYP(msgKey.getKeyValue("c1_WORK_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("c2_WORK_STS_TYP")) {
						key.setc2_WORK_STS_TYP(msgKey.getKeyValue("c2_WORK_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("IN_OPR_INST_START_TIME_FROM")) {
						key.setIN_OPR_INST_START_TIME_FROM(msgKey.getKeyValue("IN_OPR_INST_START_TIME_FROM"));
					}
					if(msgKeyType.containsKeyColumn("IN_OPR_INST_START_TIME_TO")) {
						key.setIN_OPR_INST_START_TIME_TO(msgKey.getKeyValue("IN_OPR_INST_START_TIME_TO"));
					}
					if(msgKeyType.containsKeyColumn("IN_WORK_ODR_DLV_TIME_FROM")) {
						key.setIN_WORK_ODR_DLV_TIME_FROM(msgKey.getKeyValue("IN_WORK_ODR_DLV_TIME_FROM"));
					}
					if(msgKeyType.containsKeyColumn("IN_WORK_ODR_DLV_TIME_TO")) {
						key.setIN_WORK_ODR_DLV_TIME_TO(msgKey.getKeyValue("IN_WORK_ODR_DLV_TIME_TO"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("WORK_ODR_CD")) {
						key.setWORK_ODR_CD(msgKey.getKeyValue("WORK_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("PROC_NO")) {
						key.setPROC_NO(msgKey.getKeyValue("PROC_NO"));
					}
					if(msgKeyType.containsKeyColumn("WORK_IN_PROC_CD")) {
						key.setWORK_IN_PROC_CD(msgKey.getKeyValue("WORK_IN_PROC_CD"));
					}
					if(msgKeyType.containsKeyColumn("PROC_NAME")) {
						key.setPROC_NAME(msgKey.getKeyValue("PROC_NAME"));
					}
					if(msgKeyType.containsKeyColumn("WORK_ODR_DLV_DATE")) {
						key.setWORK_ODR_DLV_DATE(msgKey.getKeyValue("WORK_ODR_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_START_DATE")) {
						key.setOPR_INST_START_DATE(msgKey.getKeyValue("OPR_INST_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_CD")) {
						key.setOPR_INST_CD(msgKey.getKeyValue("OPR_INST_CD"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_DATE")) {
						key.setOPR_INST_DATE(msgKey.getKeyValue("OPR_INST_DATE"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_QTY")) {
						key.setOPR_INST_QTY(msgKey.getKeyValue("OPR_INST_QTY"));
					}
					if(msgKeyType.containsKeyColumn("SUM_ACPT_QTY")) {
						key.setSUM_ACPT_QTY(msgKey.getKeyValue("SUM_ACPT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("SUM_DEFECT_QTY")) {
						key.setSUM_DEFECT_QTY(msgKey.getKeyValue("SUM_DEFECT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT")) {
						key.setSTOCK_UNIT(msgKey.getKeyValue("STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("WORK_STS_NAME")) {
						key.setWORK_STS_NAME(msgKey.getKeyValue("WORK_STS_NAME"));
					}
					if(msgKeyType.containsKeyColumn("WORK_CMPLT_DATE")) {
						key.setWORK_CMPLT_DATE(msgKey.getKeyValue("WORK_CMPLT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
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
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP")) {
						key.setMRP_ODR_TYP(msgKey.getKeyValue("MRP_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_CD")) {
						key.setJOB_ODR_CD(msgKey.getKeyValue("JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_CANCEL_NO")) {
						key.setJOB_ODR_CANCEL_NO(msgKey.getKeyValue("JOB_ODR_CANCEL_NO"));
					}
					if(msgKeyType.containsKeyColumn("OUTSIDE_TYP")) {
						key.setOUTSIDE_TYP(msgKey.getKeyValue("OUTSIDE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("WS_CD")) {
						key.setWS_CD(msgKey.getKeyValue("WS_CD"));
					}
					if(msgKeyType.containsKeyColumn("WS_NAME")) {
						key.setWS_NAME(msgKey.getKeyValue("WS_NAME"));
					}
					if(msgKeyType.containsKeyColumn("VEND_CD")) {
						key.setVEND_CD(msgKey.getKeyValue("VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("VEND_ANAME")) {
						key.setVEND_ANAME(msgKey.getKeyValue("VEND_ANAME"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_CD")) {
						key.setPUCH_ODR_CD(msgKey.getKeyValue("PUCH_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_SLIP_ISS_DATE")) {
						key.setOPR_INST_SLIP_ISS_DATE(msgKey.getKeyValue("OPR_INST_SLIP_ISS_DATE"));
					}
					if(msgKeyType.containsKeyColumn("ACPT_INSPC_TYP")) {
						key.setACPT_INSPC_TYP(msgKey.getKeyValue("ACPT_INSPC_TYP"));
					}
					if(msgKeyType.containsKeyColumn("STATUS_DN")) {
						key.setSTATUS_DN(msgKey.getKeyValue("STATUS_DN"));
					}
					if(msgKeyType.containsKeyColumn("IN_PLANT_CD")) {
						key.setIN_PLANT_CD(msgKey.getKeyValue("IN_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("IN_WS_CD")) {
						key.setIN_WS_CD(msgKey.getKeyValue("IN_WS_CD"));
					}
					if(msgKeyType.containsKeyColumn("IN_VEND_CD")) {
						key.setIN_VEND_CD(msgKey.getKeyValue("IN_VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("IN_ITEM_CD")) {
						key.setIN_ITEM_CD(msgKey.getKeyValue("IN_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("IN_WORK_ODR_CD")) {
						key.setIN_WORK_ODR_CD(msgKey.getKeyValue("IN_WORK_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("IN_OPR_INST_CD")) {
						key.setIN_OPR_INST_CD(msgKey.getKeyValue("IN_OPR_INST_CD"));
					}
					if(msgKeyType.containsKeyColumn("IN_JOB_ODR_CD")) {
						key.setIN_JOB_ODR_CD(msgKey.getKeyValue("IN_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("L_IN_OPR_INST_START_DATE_FROM")) {
						key.setL_IN_OPR_INST_START_DATE_FROM(msgKey.getKeyValue("L_IN_OPR_INST_START_DATE_FROM"));
					}
					if(msgKeyType.containsKeyColumn("L_IN_OPR_INST_START_DATE_TO")) {
						key.setL_IN_OPR_INST_START_DATE_TO(msgKey.getKeyValue("L_IN_OPR_INST_START_DATE_TO"));
					}
					if(msgKeyType.containsKeyColumn("L_IN_OPR_INST_START_DATE_FROM_ZERO")) {
						key.setL_IN_OPR_INST_START_DATE_FROM_ZERO(msgKey.getKeyValue("L_IN_OPR_INST_START_DATE_FROM_ZERO"));
					}
					if(msgKeyType.containsKeyColumn("L_IN_WORK_ODR_DLV_DATE_FROM")) {
						key.setL_IN_WORK_ODR_DLV_DATE_FROM(msgKey.getKeyValue("L_IN_WORK_ODR_DLV_DATE_FROM"));
					}
					if(msgKeyType.containsKeyColumn("L_IN_WORK_ODR_DLV_DATE_TO")) {
						key.setL_IN_WORK_ODR_DLV_DATE_TO(msgKey.getKeyValue("L_IN_WORK_ODR_DLV_DATE_TO"));
					}
					if(msgKeyType.containsKeyColumn("L_IN_WORK_ODR_DLV_DATE_FROM_ZERO")) {
						key.setL_IN_WORK_ODR_DLV_DATE_FROM_ZERO(msgKey.getKeyValue("L_IN_WORK_ODR_DLV_DATE_FROM_ZERO"));
					}
					if(msgKeyType.containsKeyColumn("STATUS1")) {
						key.setSTATUS1(msgKey.getKeyValue("STATUS1"));
					}
					if(msgKeyType.containsKeyColumn("STATUS2")) {
						key.setSTATUS2(msgKey.getKeyValue("STATUS2"));
					}
					if(msgKeyType.containsKeyColumn("STATUS3")) {
						key.setSTATUS3(msgKey.getKeyValue("STATUS3"));
					}
					if(msgKeyType.containsKeyColumn("STATUS4")) {
						key.setSTATUS4(msgKey.getKeyValue("STATUS4"));
					}
					if(msgKeyType.containsKeyColumn("STATUS5")) {
						key.setSTATUS5(msgKey.getKeyValue("STATUS5"));
					}
					if(msgKeyType.containsKeyColumn("STATUS6")) {
						key.setSTATUS6(msgKey.getKeyValue("STATUS6"));
					}
					if(msgKeyType.containsKeyColumn("readPLAN_CD")) {
						key.setreadPLAN_CD(msgKey.getKeyValue("readPLAN_CD"));
					}
					if(msgKeyType.containsKeyColumn("IN_PLANT_NAME")) {
						key.setIN_PLANT_NAME(msgKey.getKeyValue("IN_PLANT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("readWS_CD")) {
						key.setreadWS_CD(msgKey.getKeyValue("readWS_CD"));
					}
					if(msgKeyType.containsKeyColumn("IN_WS_NAME")) {
						key.setIN_WS_NAME(msgKey.getKeyValue("IN_WS_NAME"));
					}
					if(msgKeyType.containsKeyColumn("readWS_PLANT_CD")) {
						key.setreadWS_PLANT_CD(msgKey.getKeyValue("readWS_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("readVEND_CD")) {
						key.setreadVEND_CD(msgKey.getKeyValue("readVEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("IN_VEND_NAME")) {
						key.setIN_VEND_NAME(msgKey.getKeyValue("IN_VEND_NAME"));
					}
					if(msgKeyType.containsKeyColumn("readITEM_CD")) {
						key.setreadITEM_CD(msgKey.getKeyValue("readITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("IN_ITEM_NAME")) {
						key.setIN_ITEM_NAME(msgKey.getKeyValue("IN_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("readWORK_ODR_CD")) {
						key.setreadWORK_ODR_CD(msgKey.getKeyValue("readWORK_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("readPLANT_CD")) {
						key.setreadPLANT_CD(msgKey.getKeyValue("readPLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("readOPR_INST_CD")) {
						key.setreadOPR_INST_CD(msgKey.getKeyValue("readOPR_INST_CD"));
					}
					if(msgKeyType.containsKeyColumn("readJOB_ODR_CD")) {
						key.setreadJOB_ODR_CD(msgKey.getKeyValue("readJOB_ODR_CD"));
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
