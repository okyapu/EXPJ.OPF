/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AC0110/src/com/nec/jp/orteus/metamorBase/AC0110/AC0110010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AC0110;

import com.nec.jp.orteus.metamorBase.AC0110.*;
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

public class AC0110010Control
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
	public AC0110010Struct getListvalue(int x) { return (AC0110010Struct)(this.list.get(x)); }	// リストの値を返します。
	public AC0110010Struct getStruct() { return this.struct; }	// Structを返します。
	public AC0110010Struct createStruct() { return new AC0110010Struct(); }	// 新しいStructを作って返します。
	public void setStruct(Object structname) { this.struct.setStruct((AC0110010Struct)structname); }	// Structをセットします。
	public void initializeStruct() { this.struct.initialize(); }	// Structの値を初期化します。

	// CSV出力用リスト
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }

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
		param.append(".");
		param.append(columnName);
		param.append(":");
		if (value != null) {
			param.append(value);
		}

		ExpjMessage emsg = new ExpjMessage("ZZ01006", param.toString());
		msgStruct.addError(emsg);
		sysLog.warning(emsg, sysUSER_CD);
	}

	/**
	 * 画面の全項目を初期化します。
	 */
	private void initializeAll() {
		try{
			struct.setr1_VIEW_TYP("true");			// 不足一覧表示(表示対象)
			struct.setr2_VIEW_TYP(null);			// 過剰一覧表示(表示対象)
			struct.setITEM_CD(null);				// 品目番号
			struct.setITEM_NAME(null);				// 品目名
			struct.setDUE_DATE_FROM(null);			// 要求納期(from)
			struct.setDUE_DATE_TO(null);			// 要求納期(to)
			struct.setJOB_ODR_CD(null);				// 製番
			struct.setJOB_ODR_CANCEL_NO(null);		// 製番取消発生番号
			struct.setALC_GRP_CD(null);				// 引当グループコード
			struct.setc1_DM_STS_TYP(null);			// 計画(デマンド状態区分)
			struct.setc2_DM_STS_TYP("true");		// 確定(デマンド状態区分)
			struct.setc3_DM_STS_TYP(null);			// 完了(デマンド状態区分)
			struct.setl_DUE_DATE_FROM(null);
		  struct.setl_DUE_DATE_TO(null);
			struct.setDUE_TIME_FROM(null);
		  struct.setDUE_TIME_TO(null);
			struct.setl_DUE_DATE_FROM_ZERO(null);
	
			// 一覧表示内容をクリア
			setList(null);
			// 読込ステータス設定
			setReadStatus(INITIAL);
		
			// システムパラメータ（TIME_CTRL）取得
			AC0110010Struct TIME_CTRLStruct = new AC0110010Struct();
			List TIME_CTRLList = entity.mSELECT_TIME_CTRL.read(conn, TIME_CTRLStruct);
			if(null != TIME_CTRLList && TIME_CTRLList.size()>0){
				TIME_CTRLStruct = (AC0110010Struct)TIME_CTRLList.get(0);
				struct.setTIME_CTRL(TIME_CTRLStruct.getTIME_CTRL());
			}else{
				struct.setTIME_CTRL(null);
			}
		} catch(Exception e) {
			e.printStackTrace(); 
		}
	}

	/** CSVデータリスト */
	private List _csvList = null;
	
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
		struct.setl_DUE_DATE_FROM(null);
	  struct.setl_DUE_DATE_TO(null);
		struct.setl_DUE_DATE_FROM_ZERO(null);
		
		// 抽出条件（日付の設定）
		if(null != struct.getTIME_CTRL() && "true".equals(struct.getTIME_CTRL())){
			// 要求納期（From）
			if(null == struct.getDUE_DATE_FROM() || "".equals(struct.getDUE_DATE_FROM())){
			  struct.setl_DUE_DATE_FROM(null);
		  }else{
				// 時刻設定
				if(null == struct.getDUE_TIME_FROM() || "".equals(struct.getDUE_TIME_FROM())){
				  struct.setl_DUE_DATE_FROM(struct.getDUE_DATE_FROM() + " 00:00");
				}else{
				  struct.setDUE_TIME_FROM(AppendZero(struct.getDUE_TIME_FROM(),4));
				  struct.setl_DUE_DATE_FROM(struct.getDUE_DATE_FROM() + " " + 
				                            struct.getDUE_TIME_FROM().substring(0,2) + ":" + 
				                            struct.getDUE_TIME_FROM().substring(2));
				}
		  
		  }
		  // 要求納期（To）
		  if(null == struct.getDUE_DATE_TO() || "".equals(struct.getDUE_DATE_TO())){
		    struct.setl_DUE_DATE_TO(null);
			}else{
				// 時刻設定
				if(null == struct.getDUE_TIME_TO() || "".equals(struct.getDUE_TIME_TO())){
			    struct.setl_DUE_DATE_TO(struct.getDUE_DATE_TO() + " 23:59");
				}else{
				  struct.setDUE_TIME_TO(AppendZero(struct.getDUE_TIME_TO(),4));
			    struct.setl_DUE_DATE_TO(struct.getDUE_DATE_TO() + " " + 
			                                struct.getDUE_TIME_TO().substring(0,2) + ":" + 
			                                struct.getDUE_TIME_TO().substring(2));
				}
		  }
		}else{
			struct.setl_DUE_DATE_FROM(struct.getDUE_DATE_FROM());
			if(null == struct.getDUE_DATE_TO() || "".equals(struct.getDUE_DATE_TO())){
		  	struct.setl_DUE_DATE_TO(null);
			}else{
		  	struct.setl_DUE_DATE_TO(struct.getDUE_DATE_TO() + " 23:59");
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
		
	// TODO: ユーザ定義のコードを記述してください
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * 読込ボタン押下時に実行される処理です。
	 *
	 */
	public void controlSelect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0110");
		logger.entering("AC0110010Control"+":USER="+struct.getsUser_ID(),"controlSelect");
			//{{user_implement_dev:<controlSelect>
			// TODO: ユーザ定義のコードを記述してください
		try {

			// 一覧表示内容をクリア
			setList(null);

			// 読込ステータス設定
			setReadStatus(INITIAL);

			// CSVダウンロードファイルのクリア
			struct.setDOWNLOAD_FILE(null);

			// 画面.｢品目番号｣がNULLでない場合
			if (struct.getITEM_CD() != null && !struct.getITEM_CD().equals(""))
			{
				// DBより[品目]."品目番号"を検索し、存在しない場合はエラー
				List itemList = entity.mreadM_ITEM.read(conn, struct);
				if (itemList.isEmpty()) {
					// ZZ05101:品目が存在しません。
					setErrorMessage("ZZ11002");
					setErrorParameter("M_ITEM", "ITEM_CD", struct.getITEM_CD());
					return;
				} else {
					// 検索できた場合は「品目名」を設定する。
					AC0110010Struct itemStruct = (AC0110010Struct) itemList.get(0);
					struct.setITEM_NAME(itemStruct.getITEM_NAME());
				}
			}

			// 画面.｢製番｣がNULLでない場合
			if (struct.getJOB_ODR_CD() != null && !struct.getJOB_ODR_CD().equals("")) 
			{
				// DBより[製番計画]."製番"、"製番取消発生番号"を検索し、存在しない場合はエラー
				List jobList = entity.mreadT_JOB_ODR.read(conn, struct);
				if (jobList.isEmpty()) 
				{
					// AC00204:製番、製番取消発生番号が製番計画に存在しません。
					setErrorMessage("AC00204");
					setErrorParameter("T_JOB_ODR", "JOB_ODR_CD", struct.getJOB_ODR_CD());
					setErrorParameter("T_JOB_ODR", "JOB_ODR_CANCEL_NO", struct.getJOB_ODR_CANCEL_NO());
					return;
				}

				// DBより[製番計画]."工場"とログインの工場コードと一致しない場合はエラー
				struct.setsetPLANT_CD(sysPLANT_CD);
				List jobPlantList = entity.mreadT_JOB_ODR_PLANT.read(conn, struct);
				if (!jobPlantList.isEmpty())
				{
					// AC00207:工場コードと製番の工場コードが一致しません。
					setErrorMessage("AC00207");
					setErrorParameter("T_JOB_ODR", "PLANT_CD", sysPLANT_CD);
					return;
				}
			}

			// 画面.｢引当グループコード｣・「製番」がNULLでない場合
			if ((struct.getALC_GRP_CD() != null && !struct.getALC_GRP_CD().equals("")) &&
				(struct.getJOB_ODR_CD() != null && !struct.getJOB_ODR_CD().equals("")))
			{
				// DBより[製番計画]."引当グループ"を検索し、一致しない場合はエラー
				List jobAlcList = entity.mreadT_JOB_ODR_ALC.read(conn, struct);
				if (jobAlcList.isEmpty()) 
				{
					// AC00208:製番と引当グループコードが一致しません。
					setErrorMessage("AC00208");
					setErrorParameter("T_JOB_ODR", "ALC_GRP_CD", struct.getALC_GRP_CD());
					return;
				}
			}

			// 初期化
			struct.setsetDM_STS_TYP_1(null);
			struct.setsetDM_STS_TYP_2(null);
			struct.setsetDM_STS_TYP_3(null);

			// デマンド状態区分
			if(struct.getc1_DM_STS_TYP().equals("true"))
			{
				// 計画(未発行)を設定
				struct.setsetDM_STS_TYP_1("1");
			}

			if(struct.getc2_DM_STS_TYP().equals("true"))
			{
				//確定(発行)を設定
				struct.setsetDM_STS_TYP_2("2");
			}

			if(struct.getc3_DM_STS_TYP().equals("true"))
			{
				// 完了を設定
				struct.setsetDM_STS_TYP_3("9");
			} 

			// 検索条件の設定
			setSearchCondition();
			
			List tempList = null;

			// リストセット処理
			// 画面情報の取得
			if (struct.getr1_VIEW_TYP().equals("true")) 
			{
				// 不足一覧表示opt選択
				struct.setsetSYSPLANT_CD_1(sysPLANT_CD);		// ログインユーザの工場コードをセット
				struct.setsetSYSPLANT_CD_2(sysPLANT_CD);		// ログインユーザの工場コードをセット

				// 画面.｢引当グループコード｣が<>NULLの場合。
				if (struct.getALC_GRP_CD() != null && !struct.getALC_GRP_CD().equals(""))
				{
					// 最大表示行数
					int maxLine = sp.getMaxLine(conn, 10);
					if (maxLine != 0) {
						struct.setROW_COUNT(String.valueOf(maxLine));
					} else
						struct.setROW_COUNT(null);
					// リストデータの検索
					List tempList1 = entity.mViewRCnt.read(conn, struct);
					long rowCount = Long.parseLong(((AC0110010Struct) tempList1
							.get(0)).getl_COUNT());
					// リストがNULLの場合
					if (rowCount ==0) {
						if(list !=null && list.size()>0)
						{
							list.clear();
						}
						setErrorMessage("ZZ06001");
						setReadStatus(NOT_FOUND);
					return;
					}
					// 表示最大行数制限処理
					if ((maxLine != 0) && (rowCount == maxLine + 1)) {
						// 読込ステータス設定
						setReadStatus(TOO_MANY);
						setErrorMessage("ZZ01119", "" + maxLine);
						// 表示用リストにセット
						if(list !=null && list.size()>0)
						{
							list.clear();
						}
						return;
					}
					// リストデータの検索
					tempList = entity.mViewR.read(conn, struct);
				} else {

					// 最大表示行数
					int maxLine = sp.getMaxLine(conn, 10);
					if (maxLine != 0) {
						struct.setROW_COUNT(String.valueOf(maxLine));
					} else
						struct.setROW_COUNT(null);
					// リストデータの検索
					List tempList1 = entity.mViewR_ALCCnt.read(conn, struct);
					long rowCount = Long.parseLong(((AC0110010Struct) tempList1
							.get(0)).getl_COUNT());
					// リストがNULLの場合
					if (rowCount ==0) {
						if(list !=null && list.size()>0)
						{
							list.clear();
						}
						setErrorMessage("ZZ06001");
						setReadStatus(NOT_FOUND);
						return;
					}

					// 表示最大行数制限処理
					if ((maxLine != 0) && (rowCount == maxLine + 1)) {
						// 読込ステータス設定
						setReadStatus(TOO_MANY);
						setErrorMessage("ZZ01119", "" + maxLine);
						// 表示用リストにセット
						if(list !=null && list.size()>0)
						{
							list.clear();
						}
						return;
					}

					// 画面.｢引当グループコード｣がNULLの場合。
					tempList = entity.mViewR_ALC.read(conn, struct);
				}
			} else if (struct.getr2_VIEW_TYP().equals("true")) {
				// 過剰一覧表示opt選択
				struct.setsetSYSPLANT_CD_1(sysPLANT_CD); // ログインユーザの工場コードをセット
				struct.setsetSYSPLANT_CD_2(sysPLANT_CD); // ログインユーザの工場コードをセット

				// 画面.｢引当グループコード｣が<>NULLの場合。
				if (struct.getALC_GRP_CD() != null
						&& !struct.getALC_GRP_CD().equals("")) {
					// 最大表示行数
					int maxLine = sp.getMaxLine(conn, 10);
					if (maxLine != 0) {
						struct.setROW_COUNT(String.valueOf(maxLine));
					} else
						struct.setROW_COUNT(null);
					// リストデータの検索
					List tempList1 = entity.mViewECnt.read(conn, struct);
					long rowCount = Long.parseLong(((AC0110010Struct) tempList1
							.get(0)).getl_COUNT());
					// リストがNULLの場合
					if (rowCount ==0) {
						if(list !=null && list.size()>0)
						{
							list.clear();
						}
						setErrorMessage("ZZ06001");
						setReadStatus(NOT_FOUND);
						return;
						
					}

					// 表示最大行数制限処理
					if ((maxLine != 0) && (rowCount == maxLine + 1)) {
						// 読込ステータス設定
						setReadStatus(TOO_MANY);
						setErrorMessage("ZZ01119", "" + maxLine);
						// 表示用リストにセット
						if(list !=null && list.size()>0)
						{
							list.clear();
						}
						return;
					}

					tempList = entity.mViewE.read(conn, struct);
				} else {
					// 最大表示行数
					int maxLine = sp.getMaxLine(conn, 10);
					if (maxLine != 0) {
						struct.setROW_COUNT(String.valueOf(maxLine));
					} else
						struct.setROW_COUNT(null);
					// リストデータの検索
					List tempList1 = entity.mViewE_ALCCnt.read(conn, struct);
					long rowCount = Long.parseLong(((AC0110010Struct) tempList1
							.get(0)).getl_COUNT());
					// リストがNULLの場合
					if (rowCount ==0) {
						if(list !=null && list.size()>0)
						{
							list.clear();
						}
						setErrorMessage("ZZ06001");
						setReadStatus(NOT_FOUND);
						return;
					}
					// 表示最大行数制限処理
					if ((maxLine != 0) && (rowCount == maxLine + 1)) {
						// 読込ステータス設定
						setReadStatus(TOO_MANY);
						setErrorMessage("ZZ01119", "" + maxLine);
						// 表示用リストにセット
						if(list !=null && list.size()>0)
						{
							list.clear();
						}
						return;
					}
					tempList = entity.mViewE_ALC.read(conn, struct);
				}
			}
			// 読込ステータス設定
			setReadStatus(NORMAL);
			// 表示用リストにセット
			setList(tempList);
			// CSV出力用に待避
			_csvList = tempList;

				AC0110010Struct TempStruct;
	             for (int i = 0; i < list.size(); i++) {
			     TempStruct = (AC0110010Struct)list.get(i);
			     
			     TempStruct.setl_DM_STS_TYP(multcombo("DM_STS_TYP",TempStruct.getl_DM_STS_TYP()));
			     TempStruct.setl_OD_TYP(multcombo("OD_TYP",TempStruct.getl_OD_TYP()));
			     TempStruct.setl_MRP_ODR_TYP(multcombo("MRP_ODR_TYP",TempStruct.getl_MRP_ODR_TYP()));
	             	
	             //コンボボックスの取得
			    // othercomboTyp(TempStruct);
			    }

		} catch(SQLException e) {
			e.printStackTrace();
			// エラー処理を記述してください。
		}
                //}}user_implement_dev:<controlSelect>
		logger.exiting("AC0110010Control"+":USER="+struct.getsUser_ID(),"controlSelect");

		return;
	}

	/**
	 * CSV出力ボタン押下時に実行される処理です。
	 *
	 */
	public void controlCsvOut() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0110");
		logger.entering("AC0110010Control"+":USER="+struct.getsUser_ID(),"controlCsvOut");
			//{{user_implement_dev:<controlCsvOut>
			// TODO: ユーザ定義のコードを記述してください
		// CSV情報の作成
		List csvList = new ArrayList();
		String[] title = {
							"Expj.JOB_ODR_CD" ,
							"Expj.JOB_ODR_CANCEL_NO" ,
							"Expj.ALC_GRP_CD" ,
							"Expj.ITEM_CD" ,
							"Expj.ITEM_NAME" ,
							"Expj.DM_QTY_1" ,
							"Expj.ALC_ALCD_QTY" ,
							"Expj.Cmt0358" ,
							"Expj.TOTAL_ISSUE_QTY" ,
							"Expj.PUCH_ODR_UNIT" ,
							"Expj.DUE_DATE" ,
							"Expj.DM_STS_TYP" ,
							"Expj.OD_TYP" ,
							"Expj.MRP_ODR_TYP" ,
							"Expj.OD_NO" 
		};
		csvList.add(title);
		for (Iterator i = _csvList.iterator(); i.hasNext();) 
		{
			AC0110010Struct csvStruct = (AC0110010Struct) i.next();
			String[] csvStr = new String[title.length];
			csvStr[0] = csvStruct.getl_JOB_ODR_CD();
			csvStr[1] = csvStruct.getl_JOB_ODR_CANCEL_NO();
			csvStr[2] = csvStruct.getl_ALC_GRP_CD();
			csvStr[3] = csvStruct.getl_ITEM_CD();
			csvStr[4] = csvStruct.getl_ITEM_NAME();
			csvStr[5] = csvStruct.getl_DM_QTY();
			csvStr[6] = csvStruct.getl_ALC_ALCD_QTY();
			csvStr[7] = csvStruct.getl_ALCDLE_QTY();
			csvStr[8] = csvStruct.getl_TOTAL_ISSUE_QTY();
			csvStr[9] = csvStruct.getl_STOCK_UNIT();
			csvStr[10] = csvStruct.getl_DUE_DATE();
			csvStr[11] =csvStruct.getl_DM_STS_TYP();
			csvStr[12] =csvStruct.getl_OD_TYP();
			csvStr[13] =csvStruct.getl_MRP_ODR_TYP();
			csvStr[14] =csvStruct.getl_OD_NO();
			csvList.add(csvStr);
		}
		if (csvList != null && !csvList.isEmpty()) {
			// CsvWriterを生成
			csvWriter = new CsvWriter(CsvWriter.getFileName(sysUSER_CD));
			csvWriter.write(csvList, CoreTools.getLocale(struct.getsUser_ID()),true);
			struct.setDOWNLOAD_FILE(csvWriter.getFilePath());
		}
			
                //}}user_implement_dev:<controlCsvOut>
		logger.exiting("AC0110010Control"+":USER="+struct.getsUser_ID(),"controlCsvOut");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0110");
		logger.entering("AC0110010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
			// TODO: ユーザ定義のコードを記述してください

			// 画面を初期化
			initializeAll();

                //}}user_implement_dev:<controlClear>
		logger.exiting("AC0110010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * 製番引当ボタン押下時に実行される処理です。
	 *
	 */
	public void controlJobOdrAlc() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0110");
		logger.entering("AC0110010Control"+":USER="+struct.getsUser_ID(),"controlJobOdrAlc");
			//{{user_implement_dev:<controlJobOdrAlc>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlJobOdrAlc>
		logger.exiting("AC0110010Control"+":USER="+struct.getsUser_ID(),"controlJobOdrAlc");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0110");
		logger.entering("AC0110010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AC0110010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0110");
		logger.entering("AC0110010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
			// TODO: ユーザ定義のコードを記述してください
			// 画面を初期化
			initializeAll();
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AC0110010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * イベントハンドラの前処理です。
	 *
	 * @param buttun ボタン名
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0110");
		logger.entering("AC0110010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");
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
		logger.exiting("AC0110010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("JobOdrAlc") ) {
				controlJobOdrAlc();
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
//			throw new FoundationException("AC0110010Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AC0110010-E999","CSVの出力処理"));
			throw new FoundationException("AC0110010Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AC0110010-E999","システム日付の取得処理"));
				throw new FoundationException("AC0110010Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AC0110010-E999","コントロールのイベント処理"));
			throw new FoundationException("AC0110010Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected AC0110010Entity entity;
	protected AC0110010Struct struct;
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

		entity = new AC0110010Entity();
		struct = new AC0110010Struct();

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
	 * AC0110010クラスの標準コンストラクタ
	 */
	public AC0110010Control() throws BusinessProcessException, FoundationException
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
				AC0110010Struct key = (AC0110010Struct)keyList.get(j);
				// メッセージキーを作成する
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("r1_VIEW_TYP") && key.getr1_VIEW_TYP() != null) {
					msgKey.setKeyValue("r1_VIEW_TYP", key.getr1_VIEW_TYP());
				}
				if(msgKeyType.containsKeyColumn("r2_VIEW_TYP") && key.getr2_VIEW_TYP() != null) {
					msgKey.setKeyValue("r2_VIEW_TYP", key.getr2_VIEW_TYP());
				}
				if(msgKeyType.containsKeyColumn("DUE_DATE_FROM") && key.getDUE_DATE_FROM() != null) {
					msgKey.setKeyValue("DUE_DATE_FROM", key.getDUE_DATE_FROM());
				}
				if(msgKeyType.containsKeyColumn("DUE_DATE_TO") && key.getDUE_DATE_TO() != null) {
					msgKey.setKeyValue("DUE_DATE_TO", key.getDUE_DATE_TO());
				}
				if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE") && key.getDOWNLOAD_FILE() != null) {
					msgKey.setKeyValue("DOWNLOAD_FILE", key.getDOWNLOAD_FILE());
				}
				if(msgKeyType.containsKeyColumn("c1_DM_STS_TYP") && key.getc1_DM_STS_TYP() != null) {
					msgKey.setKeyValue("c1_DM_STS_TYP", key.getc1_DM_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("c2_DM_STS_TYP") && key.getc2_DM_STS_TYP() != null) {
					msgKey.setKeyValue("c2_DM_STS_TYP", key.getc2_DM_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("c3_DM_STS_TYP") && key.getc3_DM_STS_TYP() != null) {
					msgKey.setKeyValue("c3_DM_STS_TYP", key.getc3_DM_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("DUE_TIME_FROM") && key.getDUE_TIME_FROM() != null) {
					msgKey.setKeyValue("DUE_TIME_FROM", key.getDUE_TIME_FROM());
				}
				if(msgKeyType.containsKeyColumn("DUE_TIME_TO") && key.getDUE_TIME_TO() != null) {
					msgKey.setKeyValue("DUE_TIME_TO", key.getDUE_TIME_TO());
				}
				if(msgKeyType.containsKeyColumn("ITEM_NAME") && key.getITEM_NAME() != null) {
					msgKey.setKeyValue("ITEM_NAME", key.getITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("readJOB_ODR_CD") && key.getreadJOB_ODR_CD() != null) {
					msgKey.setKeyValue("readJOB_ODR_CD", key.getreadJOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_CD") && key.getJOB_ODR_CD() != null) {
					msgKey.setKeyValue("JOB_ODR_CD", key.getJOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_CANCEL_NO") && key.getJOB_ODR_CANCEL_NO() != null) {
					msgKey.setKeyValue("JOB_ODR_CANCEL_NO", key.getJOB_ODR_CANCEL_NO());
				}
				if(msgKeyType.containsKeyColumn("setPLANT_CD") && key.getsetPLANT_CD() != null) {
					msgKey.setKeyValue("setPLANT_CD", key.getsetPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("ALC_GRP_CD") && key.getALC_GRP_CD() != null) {
					msgKey.setKeyValue("ALC_GRP_CD", key.getALC_GRP_CD());
				}
				if(msgKeyType.containsKeyColumn("l_JOB_ODR_CD") && key.getl_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("l_JOB_ODR_CD", key.getl_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("l_JOB_ODR_CANCEL_NO") && key.getl_JOB_ODR_CANCEL_NO() != null) {
					msgKey.setKeyValue("l_JOB_ODR_CANCEL_NO", key.getl_JOB_ODR_CANCEL_NO());
				}
				if(msgKeyType.containsKeyColumn("l_ALC_GRP_CD") && key.getl_ALC_GRP_CD() != null) {
					msgKey.setKeyValue("l_ALC_GRP_CD", key.getl_ALC_GRP_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ITEM_CD") && key.getl_ITEM_CD() != null) {
					msgKey.setKeyValue("l_ITEM_CD", key.getl_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ITEM_NAME") && key.getl_ITEM_NAME() != null) {
					msgKey.setKeyValue("l_ITEM_NAME", key.getl_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_DM_QTY") && key.getl_DM_QTY() != null) {
					msgKey.setKeyValue("l_DM_QTY", key.getl_DM_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_ALC_ALCD_QTY") && key.getl_ALC_ALCD_QTY() != null) {
					msgKey.setKeyValue("l_ALC_ALCD_QTY", key.getl_ALC_ALCD_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_ALCDLE_QTY") && key.getl_ALCDLE_QTY() != null) {
					msgKey.setKeyValue("l_ALCDLE_QTY", key.getl_ALCDLE_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_TOTAL_ISSUE_QTY") && key.getl_TOTAL_ISSUE_QTY() != null) {
					msgKey.setKeyValue("l_TOTAL_ISSUE_QTY", key.getl_TOTAL_ISSUE_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_STOCK_UNIT") && key.getl_STOCK_UNIT() != null) {
					msgKey.setKeyValue("l_STOCK_UNIT", key.getl_STOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("l_DUE_DATE") && key.getl_DUE_DATE() != null) {
					msgKey.setKeyValue("l_DUE_DATE", key.getl_DUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_DM_STS_TYP") && key.getl_DM_STS_TYP() != null) {
					msgKey.setKeyValue("l_DM_STS_TYP", key.getl_DM_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_OD_TYP") && key.getl_OD_TYP() != null) {
					msgKey.setKeyValue("l_OD_TYP", key.getl_OD_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_MRP_ODR_TYP") && key.getl_MRP_ODR_TYP() != null) {
					msgKey.setKeyValue("l_MRP_ODR_TYP", key.getl_MRP_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_OD_NO") && key.getl_OD_NO() != null) {
					msgKey.setKeyValue("l_OD_NO", key.getl_OD_NO());
				}
				if(msgKeyType.containsKeyColumn("setSYSPLANT_CD_1") && key.getsetSYSPLANT_CD_1() != null) {
					msgKey.setKeyValue("setSYSPLANT_CD_1", key.getsetSYSPLANT_CD_1());
				}
				if(msgKeyType.containsKeyColumn("setSYSPLANT_CD_2") && key.getsetSYSPLANT_CD_2() != null) {
					msgKey.setKeyValue("setSYSPLANT_CD_2", key.getsetSYSPLANT_CD_2());
				}
				if(msgKeyType.containsKeyColumn("l_DUE_DATE_FROM") && key.getl_DUE_DATE_FROM() != null) {
					msgKey.setKeyValue("l_DUE_DATE_FROM", key.getl_DUE_DATE_FROM());
				}
				if(msgKeyType.containsKeyColumn("l_DUE_DATE_TO") && key.getl_DUE_DATE_TO() != null) {
					msgKey.setKeyValue("l_DUE_DATE_TO", key.getl_DUE_DATE_TO());
				}
				if(msgKeyType.containsKeyColumn("l_DUE_DATE_FROM_ZERO") && key.getl_DUE_DATE_FROM_ZERO() != null) {
					msgKey.setKeyValue("l_DUE_DATE_FROM_ZERO", key.getl_DUE_DATE_FROM_ZERO());
				}
				if(msgKeyType.containsKeyColumn("setDM_STS_TYP_1") && key.getsetDM_STS_TYP_1() != null) {
					msgKey.setKeyValue("setDM_STS_TYP_1", key.getsetDM_STS_TYP_1());
				}
				if(msgKeyType.containsKeyColumn("setDM_STS_TYP_2") && key.getsetDM_STS_TYP_2() != null) {
					msgKey.setKeyValue("setDM_STS_TYP_2", key.getsetDM_STS_TYP_2());
				}
				if(msgKeyType.containsKeyColumn("setDM_STS_TYP_3") && key.getsetDM_STS_TYP_3() != null) {
					msgKey.setKeyValue("setDM_STS_TYP_3", key.getsetDM_STS_TYP_3());
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
					AC0110010Struct key = new AC0110010Struct();
					if(msgKeyType.containsKeyColumn("r1_VIEW_TYP")) {
						key.setr1_VIEW_TYP(msgKey.getKeyValue("r1_VIEW_TYP"));
					}
					if(msgKeyType.containsKeyColumn("r2_VIEW_TYP")) {
						key.setr2_VIEW_TYP(msgKey.getKeyValue("r2_VIEW_TYP"));
					}
					if(msgKeyType.containsKeyColumn("DUE_DATE_FROM")) {
						key.setDUE_DATE_FROM(msgKey.getKeyValue("DUE_DATE_FROM"));
					}
					if(msgKeyType.containsKeyColumn("DUE_DATE_TO")) {
						key.setDUE_DATE_TO(msgKey.getKeyValue("DUE_DATE_TO"));
					}
					if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE")) {
						key.setDOWNLOAD_FILE(msgKey.getKeyValue("DOWNLOAD_FILE"));
					}
					if(msgKeyType.containsKeyColumn("c1_DM_STS_TYP")) {
						key.setc1_DM_STS_TYP(msgKey.getKeyValue("c1_DM_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("c2_DM_STS_TYP")) {
						key.setc2_DM_STS_TYP(msgKey.getKeyValue("c2_DM_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("c3_DM_STS_TYP")) {
						key.setc3_DM_STS_TYP(msgKey.getKeyValue("c3_DM_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("DUE_TIME_FROM")) {
						key.setDUE_TIME_FROM(msgKey.getKeyValue("DUE_TIME_FROM"));
					}
					if(msgKeyType.containsKeyColumn("DUE_TIME_TO")) {
						key.setDUE_TIME_TO(msgKey.getKeyValue("DUE_TIME_TO"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_NAME")) {
						key.setITEM_NAME(msgKey.getKeyValue("ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("readJOB_ODR_CD")) {
						key.setreadJOB_ODR_CD(msgKey.getKeyValue("readJOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_CD")) {
						key.setJOB_ODR_CD(msgKey.getKeyValue("JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_CANCEL_NO")) {
						key.setJOB_ODR_CANCEL_NO(msgKey.getKeyValue("JOB_ODR_CANCEL_NO"));
					}
					if(msgKeyType.containsKeyColumn("setPLANT_CD")) {
						key.setsetPLANT_CD(msgKey.getKeyValue("setPLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("ALC_GRP_CD")) {
						key.setALC_GRP_CD(msgKey.getKeyValue("ALC_GRP_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_JOB_ODR_CD")) {
						key.setl_JOB_ODR_CD(msgKey.getKeyValue("l_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_JOB_ODR_CANCEL_NO")) {
						key.setl_JOB_ODR_CANCEL_NO(msgKey.getKeyValue("l_JOB_ODR_CANCEL_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_ALC_GRP_CD")) {
						key.setl_ALC_GRP_CD(msgKey.getKeyValue("l_ALC_GRP_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ITEM_CD")) {
						key.setl_ITEM_CD(msgKey.getKeyValue("l_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ITEM_NAME")) {
						key.setl_ITEM_NAME(msgKey.getKeyValue("l_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_DM_QTY")) {
						key.setl_DM_QTY(msgKey.getKeyValue("l_DM_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_ALC_ALCD_QTY")) {
						key.setl_ALC_ALCD_QTY(msgKey.getKeyValue("l_ALC_ALCD_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_ALCDLE_QTY")) {
						key.setl_ALCDLE_QTY(msgKey.getKeyValue("l_ALCDLE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_TOTAL_ISSUE_QTY")) {
						key.setl_TOTAL_ISSUE_QTY(msgKey.getKeyValue("l_TOTAL_ISSUE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_STOCK_UNIT")) {
						key.setl_STOCK_UNIT(msgKey.getKeyValue("l_STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("l_DUE_DATE")) {
						key.setl_DUE_DATE(msgKey.getKeyValue("l_DUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_DM_STS_TYP")) {
						key.setl_DM_STS_TYP(msgKey.getKeyValue("l_DM_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_OD_TYP")) {
						key.setl_OD_TYP(msgKey.getKeyValue("l_OD_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_MRP_ODR_TYP")) {
						key.setl_MRP_ODR_TYP(msgKey.getKeyValue("l_MRP_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_OD_NO")) {
						key.setl_OD_NO(msgKey.getKeyValue("l_OD_NO"));
					}
					if(msgKeyType.containsKeyColumn("setSYSPLANT_CD_1")) {
						key.setsetSYSPLANT_CD_1(msgKey.getKeyValue("setSYSPLANT_CD_1"));
					}
					if(msgKeyType.containsKeyColumn("setSYSPLANT_CD_2")) {
						key.setsetSYSPLANT_CD_2(msgKey.getKeyValue("setSYSPLANT_CD_2"));
					}
					if(msgKeyType.containsKeyColumn("l_DUE_DATE_FROM")) {
						key.setl_DUE_DATE_FROM(msgKey.getKeyValue("l_DUE_DATE_FROM"));
					}
					if(msgKeyType.containsKeyColumn("l_DUE_DATE_TO")) {
						key.setl_DUE_DATE_TO(msgKey.getKeyValue("l_DUE_DATE_TO"));
					}
					if(msgKeyType.containsKeyColumn("l_DUE_DATE_FROM_ZERO")) {
						key.setl_DUE_DATE_FROM_ZERO(msgKey.getKeyValue("l_DUE_DATE_FROM_ZERO"));
					}
					if(msgKeyType.containsKeyColumn("setDM_STS_TYP_1")) {
						key.setsetDM_STS_TYP_1(msgKey.getKeyValue("setDM_STS_TYP_1"));
					}
					if(msgKeyType.containsKeyColumn("setDM_STS_TYP_2")) {
						key.setsetDM_STS_TYP_2(msgKey.getKeyValue("setDM_STS_TYP_2"));
					}
					if(msgKeyType.containsKeyColumn("setDM_STS_TYP_3")) {
						key.setsetDM_STS_TYP_3(msgKey.getKeyValue("setDM_STS_TYP_3"));
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
