/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AC0160/src/com/nec/jp/orteus/metamorBase/AC0160/AC0160010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AC0160;

import com.nec.jp.orteus.metamorBase.AC0160.*;
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
import java.text.DateFormat;
import com.nec.jp.orteus.expj.pr.rcvissue.process.ValidateWh;
import java.text.ParseException;
//}}user_implement_code_import

//{{user_implement_code_header
/**
 * CLASS     : AC0160010Control クラス
 * ファイル・クラス説明
 * @author $Author: shan-xiuqin $
 * @version $Revision: 1.6 $ $Date: 2015/11/05 05:26:12 $
 *
 */
//}}user_implement_code_header

public class AC0160010Control
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
	public AC0160010Struct getListvalue(int x) { return (AC0160010Struct)(this.list.get(x)); }	// リストの値を返します。
	public AC0160010Struct getStruct() { return this.struct; }	// Structの値を返します。
	public AC0160010Struct createStruct() { return new AC0160010Struct(); }	// 新しいStructを作って返します。
	public void setStruct(Object structname) { this.struct.setStruct((AC0160010Struct)structname); }	// Structをセットします。
	public void initializeStruct() { this.struct.initialize(); }	// Structの値を初期化します。

	// CSV出力用リスト
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }
	
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
	
	//会社コード
	private String COMPANY_CD;
	public void setCOMPANY_CD(String name) { this.COMPANY_CD = name; };
	public String getCOMPANY_CD() { return this.COMPANY_CD; };
	
	//端数処理前の値
	public String numData = null;
	public Date time = null;
	//public double  qty = 0;
	
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
	
	/** CSVデータリスト */
	private List _csvList1 = null;
	private List _csvList2 = null;
	
	/**
	* 初期値の設定
	* @return void
	*/
	public void initialSet() throws BusinessProcessException, FoundationException
	{
		  // 画面検索項目の初期化
	      struct.setr1_FILTER2("true");
	      struct.setr2_FILTER2(null);
	      struct.setIN_ITEM_CD(null);
	      struct.setIN_ITEM_NAME(null);
	      struct.setIN_WS_CD(null);
	      struct.setIN_WS_NAME(null);
	      struct.setIN_PRD_START_DATE_FROM(null);
	      struct.setIN_PRD_START_DATE_TO(null);
	      struct.setIN_PRD_DUE_DATE_FROM(null);
	      struct.setIN_PRD_DUE_DATE_TO(null);
	      struct.setr1_FILTER1("true");
	      struct.setr2_FILTER1(null);
	      struct.setw_OD_TYP(null);
	      struct.setPRODUCT_TYP(null);
	      struct.setc1_ODR_STS_TYP("true");
	      struct.setc2_ODR_STS_TYP(null);
	      struct.setc3_ODR_STS_TYP(null);
	      struct.setTXT_FILE("1");

		    // 画面一覧表示内容を初期化
		    setList(null);

		    // 読込ステータス設定
		    setReadStatus(INITIAL);

		    // 自工場コード設定
		    struct.setInPLANT_CD(getsysPLANT_CD());
	}
	/** オーダデマンド区分 */
	private ComboStruct _OD_TYP = new ComboStruct();

	/** オーダデマンド区分設定
	 * @param コンボボックスデータ
	*/
	public void setOD_TYP(ComboStruct combo){ _OD_TYP = combo; }

	/** オーダデマンド区分取得
	 * @return オーダデマンド区分のコンボボックスデータ
	*/
	public ComboStruct getOD_TYP(){ return _OD_TYP; }
	
	/** 製品区分 */
	private ComboStruct _PRODUCT_TYP = new ComboStruct();

	/** 製品区分設定
	 * @param コンボボックスデータ
	*/
	public void setPRODUCT_TYP(ComboStruct combo){ _PRODUCT_TYP = combo; }

	/** 製品区分取得
	 * @return 製品区分のコンボボックスデータ
	*/
	public ComboStruct getPRODUCT_TYP(){ return _PRODUCT_TYP; }
	
	
    //------------------------------------------------------------------------------
    /**
     * 区分名取得（共通）
     *
     * @param	comboStruct	区分情報リスト
     * @param	strTyp		区分コード
     * @return	区分名称(該当するデータがなかった場合は区分コードを返す)
     */
    private String getTypName(ComboStruct comboStruct, String strTyp)
    {
        if(comboStruct != null && strTyp != null) {
            for(int i = 0; i < comboStruct.getValList().size(); i++) {
                if(strTyp.equals((String)(comboStruct.getValList().get(i)))) {
                    strTyp = (String)(comboStruct.getExplanList().get(i));
                    break;
                }
            }
        }
        return strTyp;
    }
	
	/**
	 * 検索条件の設定
	 */
	private void setSearchCondition() {

		  // 製造着手日(From)
		  if(null == struct.getIN_PRD_START_DATE_FROM() || "".equals(struct.getIN_PRD_START_DATE_FROM())){
			  struct.setIN_PRD_START_DATE_FROM(null);
		  }else{
			  struct.setIN_PRD_START_DATE_FROM(struct.getIN_PRD_START_DATE_FROM());
		  }
		  // 製造着手日(To)
		  if(null == struct.getIN_PRD_START_DATE_TO() || "".equals(struct.getIN_PRD_START_DATE_TO())){
			  struct.setIN_PRD_START_DATE_TO(null);
		  }else{
			  struct.setIN_PRD_START_DATE_TO(struct.getIN_PRD_START_DATE_TO());
		  }
		  // 製造納期（From）
		  if(null == struct.getIN_PRD_DUE_DATE_FROM() || "".equals(struct.getIN_PRD_DUE_DATE_FROM())){
			  struct.setIN_PRD_DUE_DATE_FROM(null);
		  }else{
			  struct.setIN_PRD_DUE_DATE_FROM(struct.getIN_PRD_DUE_DATE_FROM());
		  }
		  // 製造納期（To）
		  if(null == struct.getIN_PRD_DUE_DATE_TO() || "".equals(struct.getIN_PRD_DUE_DATE_TO())){
			  struct.setIN_PRD_DUE_DATE_TO(null);
		  }else{
			  struct.setIN_PRD_DUE_DATE_TO(struct.getIN_PRD_DUE_DATE_TO());
		  }
	}

        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0160");
		logger.entering("AC0160010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
			// TODO: ユーザ定義のコードを記述してください
		
		    // 項目をクリアする（初期値をセット）
		    initialSet();
		    
                //}}user_implement_dev:<controlClear>
		logger.exiting("AC0160010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * 閉じるボタン押下時に実行される処理です。
	 *
	 */
	public void controlClose() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0160");
		logger.entering("AC0160010Control"+":USER="+struct.getsUser_ID(),"controlClose");
			//{{user_implement_dev:<controlClose>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlClose>
		logger.exiting("AC0160010Control"+":USER="+struct.getsUser_ID(),"controlClose");

		return;
	}

	/**
	 * 読込ボタン押下時に実行される処理です。
	 *
	 */
	public void controlSelect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0160");
		logger.entering("AC0160010Control"+":USER="+struct.getsUser_ID(),"controlSelect");
			//{{user_implement_dev:<controlSelect>
		try {
			// 読込ステータス設定
	        setReadStatus(INITIAL);

	        // 一覧表示内容をクリア
	        setList(null);
	        
	        // 品目番号が指定された場合
	        if(struct.getIN_ITEM_CD() != null && ("").equals(struct.getIN_ITEM_CD()) == false){
	          // 品目番号の存在チェック
	          List itemList = entity.mselectM_ITEM.read(conn, struct);
	          if(itemList.size() <= 0) {
	            // 読込処理失敗：品目番号が品目に存在しません
	            setErrorMessage("AE00118");
	            setErrorParameter("M_ITEM", "ITEM_CD", struct.getIN_ITEM_CD());
	            struct.setIN_ITEM_NAME(null);
	            return;
	          }else{
	            AC0160010Struct tmpStruct = (AC0160010Struct)itemList.get(0);
	            struct.setIN_ITEM_NAME(tmpStruct.getIN_ITEM_NAME());
	          }
	        }else{
	          struct.setIN_ITEM_NAME(null);
	        }
	        
	        // 作業区コードが指定された場合
	        if(struct.getIN_WS_CD() != null && ("").equals(struct.getIN_WS_CD()) == false){
	          // 作業区コードの存在チェック
	          List wsList = entity.mselectM_WS.read(conn, struct);
	          if(wsList.size() <= 0) {
	            // 読込処理失敗：作業区が存在しません
	            setErrorMessage("AF00002");
	            setErrorParameter("M_WS", "WS_CD", struct.getIN_WS_CD());
	            struct.setIN_WS_NAME(null);
	            return;
	          }else{
	            AC0160010Struct tmpStruct = (AC0160010Struct)wsList.get(0);
	            struct.setIN_WS_NAME(tmpStruct.getIN_WS_NAME());
	            }
	        }else{
	          struct.setIN_WS_NAME(null);
	        }
            
	        //【データ読込】
	        
	        //画面．ステータスの初期化
	        struct.setInC1_ODR_STS_TYP(null);
	        struct.setInC2_ODR_STS_TYP(null);
	        struct.setInC3_ODR_STS_TYP(null);
	        
	        //画面．ステータスの判定
	        if(struct.getc1_ODR_STS_TYP().equals("true")){
	          struct.setInC1_ODR_STS_TYP("1");
	        }
	        if(struct.getc2_ODR_STS_TYP().equals("true")){
	          struct.setInC2_ODR_STS_TYP("2");
	        }
	        if(struct.getc3_ODR_STS_TYP().equals("true")){
	          struct.setInC3_ODR_STS_TYP("9");
	        }

	        // 「オーダデマンド区分」が2：オーダ場合
	        if (struct.getw_OD_TYP().equals("2")){
	        	struct.setInR1_OD_TYP("2");
	        // 「オーダデマンド区分」が3：デマンド場合
	        } else if (struct.getw_OD_TYP().equals("3")){
	        	struct.setInR1_OD_TYP("3");
	        }
	        
	        //「製品区分」が1:製品
	        if (struct.getPRODUCT_TYP().equals("1")){
	        	struct.setPRODUCT_TYP("1");
	        }
	        //「製品区分」が2:半製品
	        if (struct.getPRODUCT_TYP().equals("2")){
	        	struct.setPRODUCT_TYP("2");
	        }
	        //「製品区分」が3:部品
	        if (struct.getPRODUCT_TYP().equals("3")){
	        	struct.setPRODUCT_TYP("3");
	        }
	        //「製品区分」が4:原材料
	        if (struct.getPRODUCT_TYP().equals("4")){
	        	struct.setPRODUCT_TYP("4");
	        }
	        //「製品区分」が5:その他
	        if (struct.getPRODUCT_TYP().equals("5")){
	        	struct.setPRODUCT_TYP("5");
	        }
			// 検索条件の設定
			setSearchCondition();
			// 表示最大行数制限
			ScreenParam sp = new ScreenParam(this.getClass());
			int maxLine = sp.getMaxLine(conn, 10);
			if (maxLine != 0)
				struct.setROW_COUNT_1(String.valueOf(maxLine));
			else
				struct.setROW_COUNT_1(null);
			if (maxLine != 0)
				struct.setROW_COUNT_2(String.valueOf(maxLine));
			else
				struct.setROW_COUNT_2(null);

			// 検索条件に指定された内容で[所要量･品目マスタ･作業系列]より取得
			List tempListCnt = null;
			List tempList = null;
			List tempRoundTyp = null;
			List tempExchRate = null;
			List tempWsVendCd = null;
			List tempHomeCurCd = null;
			List tempMPuchUnitCost = null;
			long rowCount = 0;
			if (struct.getr1_FILTER2().equals("true")){
				tempListCnt = entity.mselectOUTSIDE_TYP_1_Cnt.read(conn, struct);
				rowCount = Long.parseLong(((AC0160010Struct) tempListCnt.get(0)).getl_COUNT_1());
			} else if (struct.getr2_FILTER2().equals("true")){
				tempListCnt = entity.mselectOUTSIDE_TYP_2_Cnt.read(conn, struct);
				rowCount = Long.parseLong(((AC0160010Struct) tempListCnt.get(0)).getl_COUNT_2());
			}
			
			// 該当レコードが取得できない場合。
			if (rowCount == 0) {
				// 読込処理失敗：対象データが存在しません
				setErrorMessage("ZZ06001");
				setReadStatus(NOT_FOUND);
				 // 表示用リストにセット
				if(list !=null && list.size()>0){
					list.clear();
				}
				return;
			} else {
				// 表示最大行数制限処理

				if (maxLine != 0 && (rowCount >= maxLine + 1)) {
					// 読込ステータス設定
					setReadStatus(TOO_MANY);
					setErrorMessage("ZZ01119", "" + maxLine);
                   // 表示用リストにセット
					if(list !=null && list.size()>0){
						list.clear();
					}
					return;
				} else {
					if (struct.getr1_FILTER2().equals("true")){
					    tempList = entity.mselectOUTSIDE_TYP_1.read(conn, struct);
					} else if (struct.getr2_FILTER2().equals("true")){
				        tempList = entity.mselectOUTSIDE_TYP_2.read(conn, struct);
			        }
					
					// 表示用リストにセット
					if (struct.getr1_FILTER2().equals("true")){

						_csvList1 = tempList;
						setList(tempList);
						
						setReadStatus(NORMAL);
					}
					if (struct.getr2_FILTER2().equals("true")){
						
						for (int i = 0; i < tempList.size();i++ ){
							AC0160010Struct tempStruct = (AC0160010Struct) tempList.get(i);
							
							// 邦貨セット
							tempHomeCurCd = entity.mselectHOME_CUR_CD.read(conn, struct);
							AC0160010Struct tempHomeCurCdStruct = (AC0160010Struct) tempHomeCurCd.get(0);				
							
							struct.setITEM_CD(tempStruct.getITEM_CD());
							struct.setInPLANT_CD(getsysPLANT_CD());
							
							// 作業区コード/取引先コードセット
							tempWsVendCd = entity.mselectVEND_CD.read(conn, struct);
							if (!tempWsVendCd.isEmpty()){
								AC0160010Struct tempWsVendCdStruct = (AC0160010Struct) tempWsVendCd.get(0);
								// 作業区コード/取引先コード
								tempStruct.setWS_VEND_CD(tempWsVendCdStruct.getWS_VEND_CD());
								tempStruct.setCOMPANY_CD(COMPANY_CD);
								// 通貨名
								List curList = entity.mgetCUR_NAME.read(conn, tempStruct);
								if (!curList.isEmpty()){
									tempStruct.setCUR_NAME(((AC0160010Struct)curList.get(0)).getCUR_NAME());
								}
							}
							
							struct.setPRD_START_DATE(tempStruct.getPRD_START_DATE());
							struct.setOPR_INST_PUCH_ODR_QTY(tempStruct.getOPR_INST_PUCH_ODR_QTY());
							struct.setWS_VEND_CD(tempStruct.getWS_VEND_CD());
							
							// 本体金額セット
							tempRoundTyp = entity.mselectROUND_TYP.read(conn, struct);
							AC0160010Struct tempRoundTypStruct = new AC0160010Struct();
							if (!tempRoundTyp.isEmpty()) {
								tempRoundTypStruct = (AC0160010Struct) tempRoundTyp.get(0);
							}			
							
							// 受入場所
							tempStruct.setWH_CD_2(ValidateWh.getDefaultOprWh(conn
									, getsysPLANT_CD()
									, tempStruct.getITEM_CD()));
							
							// 単価区分/単価/加工費/材料費/その他経費セット
							tempMPuchUnitCost = entity.mselectM_PUCH_UNIT_COST.read(conn, struct);
							AC0160010Struct tempMPuchUnitCostStruct = new AC0160010Struct();
							if (!tempMPuchUnitCost.isEmpty()){
								tempMPuchUnitCostStruct = (AC0160010Struct) tempMPuchUnitCost.get(0);
							}
							
							struct.setUNIT_COST(tempMPuchUnitCostStruct.getUNIT_COST());
							
							// 本体金額
							if (null != tempMPuchUnitCostStruct.getUNIT_COST() && null != tempStruct.getOPR_INST_PUCH_ODR_QTY()) {
								numData = Calculate.multiply(tempMPuchUnitCostStruct.getUNIT_COST(), tempStruct.getOPR_INST_PUCH_ODR_QTY());
							} else {
								numData = "0";
							}
							
							// 四捨五入
							//if(null == tempStruct.getWS_VEND_CD()){
							//	tempStruct.setNET_AMOUNT("0");
							//}
							if("1".equals(tempRoundTypStruct.getROUND_TYP())){
								tempStruct.setNET_AMOUNT(Calculate.round(numData,0));
							} else
							// 切り上げ
							if("2".equals(tempRoundTypStruct.getROUND_TYP())){
								tempStruct.setNET_AMOUNT(Calculate.ceil(numData,0));
							} else
							// 切り捨て
							if("3".equals(tempRoundTypStruct.getROUND_TYP())){
								tempStruct.setNET_AMOUNT(Calculate.floor(numData,0));
							} else {
								tempStruct.setNET_AMOUNT(numData);
							}
							// 為替レート
							if(null == tempStruct.getWS_VEND_CD()){
								//MOD START 20141205 fei-hy
								//tempStruct.setEXCH_RATE("0");
								tempStruct.setEXCH_RATE("1");
								//MOD END 20141205 fei-hy
							}else {
								tempExchRate = entity.mselectEXCH_RATE.read(conn, struct);
								if (!tempExchRate.isEmpty()){
									AC0160010Struct tempExchRateStruct = (AC0160010Struct) tempExchRate.get(0);
									tempStruct.setEXCH_RATE(tempExchRateStruct.getEXCH_RATE());
									if((tempExchRateStruct.getCUR_CD() == tempHomeCurCdStruct.getHOME_CUR_CD())){
										tempStruct.setEXCH_RATE("1");
									}
								}else {
									tempStruct.setEXCH_RATE("0");
								}
							}

							// 単価区分/単価/加工費/材料費/その他経費
							if(null != tempMPuchUnitCostStruct.getUNIT_COST_TYP()){
								tempStruct.setUNIT_COST_TYP(this.multcombo("UNIT_COST_TYP",tempMPuchUnitCostStruct.getUNIT_COST_TYP()));
								tempStruct.setUNIT_COST_TYP_VAL((tempMPuchUnitCostStruct.getUNIT_COST_TYP()));
							}else{
								tempStruct.setUNIT_COST_TYP(this.multcombo("UNIT_COST_TYP","1"));
								tempStruct.setUNIT_COST_TYP_VAL("1");
							}
							if(null != tempMPuchUnitCostStruct.getUNIT_COST()){
								tempStruct.setUNIT_COST(tempMPuchUnitCostStruct.getUNIT_COST());
							}else{
								tempStruct.setUNIT_COST("0");
							}
							if(null != tempMPuchUnitCostStruct.getPROCESSING_COST()){
								tempStruct.setPROCESSING_COST(tempMPuchUnitCostStruct.getPROCESSING_COST());
							}else{
								tempStruct.setPROCESSING_COST("0");
							}
							if(null != tempMPuchUnitCostStruct.getMATERIAL_COST()){
								tempStruct.setMATERIAL_COST(tempMPuchUnitCostStruct.getMATERIAL_COST());
							}else{
								tempStruct.setMATERIAL_COST("0");
							}
							if(null != tempMPuchUnitCostStruct.getOTHER_OVERHEADS()){
								tempStruct.setOTHER_OVERHEADS(tempMPuchUnitCostStruct.getOTHER_OVERHEADS());
							}else{
								tempStruct.setOTHER_OVERHEADS("0");
							}
						_csvList2 = tempList;
						setList(tempList);
						
						setReadStatus(NORMAL);
						}
					}
				}	        
		}
		}catch(SQLException e) {
			e.printStackTrace();
			// エラー処理を記述してください。
			
			// 読込ステータス設定
	        setReadStatus(ERROR);
	        setSqlExceptionMsg(e);
		}
                //}}user_implement_dev:<controlSelect>
		logger.exiting("AC0160010Control"+":USER="+struct.getsUser_ID(),"controlSelect");

		return;
	}

	/**
	 * CSV出力ボタン押下時に実行される処理です。
	 *
	 */
	public void controlCsvOut() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0160");
		logger.entering("AC0160010Control"+":USER="+struct.getsUser_ID(),"controlCsvOut");
			//{{user_implement_dev:<controlCsvOut>
			// TODO: ユーザ定義のコードを記述してください
		// 内作場合
		if (struct.getr1_FILTER2().equals("true")){
			csvWriter = new CsvWriter(CsvWriter.getFileName(getsysUSER_CD()));
			AC0160010Struct listStruct = null;
			List csvList = new ArrayList();	// CSV情報

			// タイトル行
			String[] csvTitle1 = {"Expj.ITEM_CD",
								  "Expj.PRD_PUCH_DUE_DATE",
								  "Expj.PRD_PUCH_START_DATE",
								  "Expj.OPR_INST_PUCH_ODR_QTY",
								  "Expj.WS_VEND_CD",
								  "Expj.JOB_ODR_CD",
								  "Expj.REMARKS" };
			csvList.add(csvTitle1);

			// [画面].一覧部情報をCSV情報に追加
			for (int i = 0; i < list.size(); i++) {
				listStruct = (AC0160010Struct)list.get(i);
			    // オーダ状態区分＝1：計画（未発効)の明細データをCSV形式のデータへ出力可能です
				String[] data = {listStruct.getITEM_CD()
								,listStruct.getPRD_DUE_DATE()
								,listStruct.getPRD_START_DATE()
								,listStruct.getOPR_INST_PUCH_ODR_QTY()
								,listStruct.getWS_VEND_CD()
								,listStruct.getJOB_ODR_CD()
								,listStruct.getREMARKS()
								};
				csvList.add(data);
			}
			
			// CSVファイルを作成
			csvWriter.write(csvList, CoreTools.getLocale(struct.getsUser_ID()), true);
			// CSVファイルをクライアントに出力
			struct.setDOWNLOAD_FILE(getCsvWriter().getFilePath());
		} else {
			//外作場合
			csvWriter = new CsvWriter(CsvWriter.getFileName(getsysUSER_CD()));
			AC0160010Struct listStruct = null;
			List csvList = new ArrayList();	// CSV情報
			// CSVヘッダ行をCSV情報に追加
			String[] csvTitle2 = {
					"Expj.ITEM_CD" ,
					"Expj.PRD_PUCH_DUE_DATE" ,
					"Expj.PRD_PUCH_START_DATE" ,
					"Expj.OPR_INST_PUCH_ODR_QTY" ,
					"Expj.WS_VEND_CD" ,
					"Expj.JOB_ODR_CD" ,
					"Expj.DEALINGS_ANS_DATE" ,
					"Expj.REC_PLA" ,
					"Expj.REMARKS" ,
					"Expj.NON_NO_ITEM_FLG" ,
					"Expj.NON_NO_ITEM_NAME" ,
					"Expj.NON_NO_ITEM_TYP" ,
					"Expj.NON_NO_ITEM_PUCH_ODR_UNIT" ,
					"Expj.UNIT_COST_TYP" ,
					"Expj.UNIT_COST" ,
					"Expj.PROCESSING_COST" ,
					"Expj.MATERIAL_COST" ,
					"Expj.OTHER_OVERHEADS" ,
					"Expj.NET_AMOUNT" ,
					"Expj.MON_EXCH_RATE" 
			};
			csvList.add(csvTitle2);
			// [画面].一覧部情報をCSV情報に追加
			for (int i = 0; i < list.size(); i++) {
				listStruct = (AC0160010Struct)list.get(i);
			    // オーダ状態区分＝1：計画（未発効)の明細データをCSV形式のデータへ出力可能です
				String[] data = {listStruct.getITEM_CD()					// 品目番号
								,listStruct.getPRD_DUE_DATE()				// 製造納期/発注納期
								,listStruct.getPRD_START_DATE()				// 製造着手日/発注予定日
								,listStruct.getOPR_INST_PUCH_ODR_QTY()		// 作業指示数/発注数
								,listStruct.getWS_VEND_CD()					// 作業区コード/取引先コード
								,listStruct.getJOB_ODR_CD()					// 製番
								,listStruct.getCONFIRM_DLV_DATE()			// 取引先回答納期
								,listStruct.getWH_CD_2()					// 受入場所
								,listStruct.getREMARKS()					// 備考
								,"0"										// 備品発注フラグ
								,listStruct.getNON_NO_ITEM_NAME()			// 備品発注品目名
								,"0"										// 備品発注製品区分
								,listStruct.getNON_NO_ITEM_PUCH_ODR_UNIT()	// 備品発注単位
								,listStruct.getUNIT_COST_TYP_VAL()			// 単価区分
								,listStruct.getUNIT_COST()					// 単価
								,listStruct.getPROCESSING_COST()			// 加工費
								,listStruct.getMATERIAL_COST()				// 材料費
								,listStruct.getOTHER_OVERHEADS()			// その他経費
								,listStruct.getNET_AMOUNT()					// 本体金額
								,listStruct.getEXCH_RATE()					// 為替レート
								};
				csvList.add(data);
			}
			
			// CSVファイルを作成
			csvWriter.write(csvList, CoreTools.getLocale(struct.getsUser_ID()), true);
			// CSVファイルをクライアントに出力
			struct.setDOWNLOAD_FILE(getCsvWriter().getFilePath());
		}
                //}}user_implement_dev:<controlCsvOut>
		logger.exiting("AC0160010Control"+":USER="+struct.getsUser_ID(),"controlCsvOut");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0160");
		logger.entering("AC0160010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AC0160010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0160");
		logger.entering("AC0160010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
		// 項目をクリアする（初期値をセット）
		try {
			initialSet();
			// 自社コードを取得する
			List companylist = entity.mgetCOMPANY_CD.read(conn, struct);
			if (!companylist.isEmpty()){
				COMPANY_CD = ((AC0160010Struct)companylist.get(0)).getCOMPANY_CD();
			} else {
				setErrorMessage("KQ00039");
				throw new ExpjException("KQ00039");
			}
		} catch (Exception e){
			e.printStackTrace();
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());//致命的エラー エラー内容
			ExpjException ee = new ExpjException(e, emsg); // エクセプションを生成
			throw ee;
		}		
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AC0160010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * イベントハンドラの前処理です。
	 *
	 * @param buttun ボタン名
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0160");
		logger.entering("AC0160010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");
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
			// コンボボックスデータ設定
			try{
				// コンボボックスデータ用意				
				ComboBox controller = new ComboBox(conn, sysUSER_CD);
				_OD_TYP = controller.getData("T_OD_TYP");
			    _PRODUCT_TYP = controller.getData("PRODUCT_TYP");
			    
				struct.setList_w_OD_TYP_val(_OD_TYP.getValList());
				struct.setList_w_OD_TYP_name(_OD_TYP.getExplanList());
				struct.setList_PRODUCT_TYP_val(_PRODUCT_TYP.getValList());
				struct.setList_PRODUCT_TYP_name(_PRODUCT_TYP.getExplanList());
			}catch(Exception e){
				// エラーメッセージ作成
				ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
				sysLog.severe(emsg, getsysUSER_CD());
				ExpjException ee = new ExpjException(e, emsg);

				throw ee;

			}
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("AC0160010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			if( button.equals("Clear") ) {
				controlClear();
			} else if( button.equals("Close") ) {
				controlClose();
			} else if( button.equals("Select") ) {
				controlSelect();
			} else if( button.equals("CsvOut") ) {
				controlCsvOut();
			} else if( button.equals("initial") ) {
				controlINITIAL();
			} else if( button.equals("reload") ) {
				controlRELOAD();
			}
		//{{user_implement_dev:<control_eventHandller>

                //}}user_implement_dev:<control_eventHandller>
		} catch( BusinessLockException ble ) {
			// 枠メッセージ出力依頼作成
			setNewDataFlg(false);
		} catch( ResourceBusyException rbe ) {
			ExpjException ee = new ExpjException(rbe, "ZZ01105");
			throw ee;
		} catch( FoundationException e ) {
//			e.printStackTrace();
//			throw new FoundationException("AC0160010Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AC0160010-E999","CSVの出力処理"));
			throw new FoundationException("AC0160010Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AC0160010-E999","システム日付の取得処理"));
				throw new FoundationException("AC0160010Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AC0160010-E999","コントロールのイベント処理"));
			throw new FoundationException("AC0160010Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected AC0160010Entity entity;
	protected AC0160010Struct struct;
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

		entity = new AC0160010Entity();
		struct = new AC0160010Struct();

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
	 * AC0160010クラスの標準コンストラクタ
	 */
	public AC0160010Control() throws BusinessProcessException, FoundationException
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
				AC0160010Struct key = (AC0160010Struct)keyList.get(j);
				// メッセージキーを作成する
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("r1_FILTER1") && key.getr1_FILTER1() != null) {
					msgKey.setKeyValue("r1_FILTER1", key.getr1_FILTER1());
				}
				if(msgKeyType.containsKeyColumn("r2_FILTER1") && key.getr2_FILTER1() != null) {
					msgKey.setKeyValue("r2_FILTER1", key.getr2_FILTER1());
				}
				if(msgKeyType.containsKeyColumn("w_OD_TYP") && key.getw_OD_TYP() != null) {
					msgKey.setKeyValue("w_OD_TYP", key.getw_OD_TYP());
				}
				if(msgKeyType.containsKeyColumn("w_OD_TYP_name") && key.getw_OD_TYP_name() != null) {
					msgKey.setKeyValue("w_OD_TYP_name", key.getw_OD_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("w_OD_TYP_val") && key.getw_OD_TYP_val() != null) {
					msgKey.setKeyValue("w_OD_TYP_val", key.getw_OD_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("PRODUCT_TYP_name") && key.getPRODUCT_TYP_name() != null) {
					msgKey.setKeyValue("PRODUCT_TYP_name", key.getPRODUCT_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("PRODUCT_TYP_val") && key.getPRODUCT_TYP_val() != null) {
					msgKey.setKeyValue("PRODUCT_TYP_val", key.getPRODUCT_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("r1_FILTER2") && key.getr1_FILTER2() != null) {
					msgKey.setKeyValue("r1_FILTER2", key.getr1_FILTER2());
				}
				if(msgKeyType.containsKeyColumn("c1_ODR_STS_TYP") && key.getc1_ODR_STS_TYP() != null) {
					msgKey.setKeyValue("c1_ODR_STS_TYP", key.getc1_ODR_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("c2_ODR_STS_TYP") && key.getc2_ODR_STS_TYP() != null) {
					msgKey.setKeyValue("c2_ODR_STS_TYP", key.getc2_ODR_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("c3_ODR_STS_TYP") && key.getc3_ODR_STS_TYP() != null) {
					msgKey.setKeyValue("c3_ODR_STS_TYP", key.getc3_ODR_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("CONFIRM_DLV_DATE") && key.getCONFIRM_DLV_DATE() != null) {
					msgKey.setKeyValue("CONFIRM_DLV_DATE", key.getCONFIRM_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("WH_CD_2") && key.getWH_CD_2() != null) {
					msgKey.setKeyValue("WH_CD_2", key.getWH_CD_2());
				}
				if(msgKeyType.containsKeyColumn("REMARKS") && key.getREMARKS() != null) {
					msgKey.setKeyValue("REMARKS", key.getREMARKS());
				}
				if(msgKeyType.containsKeyColumn("NON_NO_ITEM_NAME") && key.getNON_NO_ITEM_NAME() != null) {
					msgKey.setKeyValue("NON_NO_ITEM_NAME", key.getNON_NO_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("NON_NO_ITEM_PUCH_ODR_UNIT") && key.getNON_NO_ITEM_PUCH_ODR_UNIT() != null) {
					msgKey.setKeyValue("NON_NO_ITEM_PUCH_ODR_UNIT", key.getNON_NO_ITEM_PUCH_ODR_UNIT());
				}
				if(msgKeyType.containsKeyColumn("NET_AMOUNT") && key.getNET_AMOUNT() != null) {
					msgKey.setKeyValue("NET_AMOUNT", key.getNET_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("r2_FILTER2") && key.getr2_FILTER2() != null) {
					msgKey.setKeyValue("r2_FILTER2", key.getr2_FILTER2());
				}
				if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE") && key.getDOWNLOAD_FILE() != null) {
					msgKey.setKeyValue("DOWNLOAD_FILE", key.getDOWNLOAD_FILE());
				}
				if(msgKeyType.containsKeyColumn("TXT_FILE") && key.getTXT_FILE() != null) {
					msgKey.setKeyValue("TXT_FILE", key.getTXT_FILE());
				}
				if(msgKeyType.containsKeyColumn("UNIT_COST_TYP_VAL") && key.getUNIT_COST_TYP_VAL() != null) {
					msgKey.setKeyValue("UNIT_COST_TYP_VAL", key.getUNIT_COST_TYP_VAL());
				}
				if(msgKeyType.containsKeyColumn("readITEM_CD") && key.getreadITEM_CD() != null) {
					msgKey.setKeyValue("readITEM_CD", key.getreadITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("IN_ITEM_NAME") && key.getIN_ITEM_NAME() != null) {
					msgKey.setKeyValue("IN_ITEM_NAME", key.getIN_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("IN_ITEM_CD") && key.getIN_ITEM_CD() != null) {
					msgKey.setKeyValue("IN_ITEM_CD", key.getIN_ITEM_CD());
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
				if(msgKeyType.containsKeyColumn("IN_WS_CD") && key.getIN_WS_CD() != null) {
					msgKey.setKeyValue("IN_WS_CD", key.getIN_WS_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_NAME") && key.getITEM_NAME() != null) {
					msgKey.setKeyValue("ITEM_NAME", key.getITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("PRD_DUE_DATE") && key.getPRD_DUE_DATE() != null) {
					msgKey.setKeyValue("PRD_DUE_DATE", key.getPRD_DUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("PRD_START_DATE") && key.getPRD_START_DATE() != null) {
					msgKey.setKeyValue("PRD_START_DATE", key.getPRD_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_PUCH_ODR_QTY") && key.getOPR_INST_PUCH_ODR_QTY() != null) {
					msgKey.setKeyValue("OPR_INST_PUCH_ODR_QTY", key.getOPR_INST_PUCH_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("WS_VEND_CD") && key.getWS_VEND_CD() != null) {
					msgKey.setKeyValue("WS_VEND_CD", key.getWS_VEND_CD());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_CD") && key.getJOB_ODR_CD() != null) {
					msgKey.setKeyValue("JOB_ODR_CD", key.getJOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("h_ODR_STS_TYP") && key.geth_ODR_STS_TYP() != null) {
					msgKey.setKeyValue("h_ODR_STS_TYP", key.geth_ODR_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("InR1_OD_TYP") && key.getInR1_OD_TYP() != null) {
					msgKey.setKeyValue("InR1_OD_TYP", key.getInR1_OD_TYP());
				}
				if(msgKeyType.containsKeyColumn("InC1_ODR_STS_TYP") && key.getInC1_ODR_STS_TYP() != null) {
					msgKey.setKeyValue("InC1_ODR_STS_TYP", key.getInC1_ODR_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("InC2_ODR_STS_TYP") && key.getInC2_ODR_STS_TYP() != null) {
					msgKey.setKeyValue("InC2_ODR_STS_TYP", key.getInC2_ODR_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("InC3_ODR_STS_TYP") && key.getInC3_ODR_STS_TYP() != null) {
					msgKey.setKeyValue("InC3_ODR_STS_TYP", key.getInC3_ODR_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("InPLANT_CD") && key.getInPLANT_CD() != null) {
					msgKey.setKeyValue("InPLANT_CD", key.getInPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("IN_PRD_START_DATE_FROM") && key.getIN_PRD_START_DATE_FROM() != null) {
					msgKey.setKeyValue("IN_PRD_START_DATE_FROM", key.getIN_PRD_START_DATE_FROM());
				}
				if(msgKeyType.containsKeyColumn("IN_PRD_START_DATE_TO") && key.getIN_PRD_START_DATE_TO() != null) {
					msgKey.setKeyValue("IN_PRD_START_DATE_TO", key.getIN_PRD_START_DATE_TO());
				}
				if(msgKeyType.containsKeyColumn("IN_PRD_DUE_DATE_FROM") && key.getIN_PRD_DUE_DATE_FROM() != null) {
					msgKey.setKeyValue("IN_PRD_DUE_DATE_FROM", key.getIN_PRD_DUE_DATE_FROM());
				}
				if(msgKeyType.containsKeyColumn("IN_PRD_DUE_DATE_TO") && key.getIN_PRD_DUE_DATE_TO() != null) {
					msgKey.setKeyValue("IN_PRD_DUE_DATE_TO", key.getIN_PRD_DUE_DATE_TO());
				}
				if(msgKeyType.containsKeyColumn("PRODUCT_TYP") && key.getPRODUCT_TYP() != null) {
					msgKey.setKeyValue("PRODUCT_TYP", key.getPRODUCT_TYP());
				}
				if(msgKeyType.containsKeyColumn("NON_NO_ITEM_FLG") && key.getNON_NO_ITEM_FLG() != null) {
					msgKey.setKeyValue("NON_NO_ITEM_FLG", key.getNON_NO_ITEM_FLG());
				}
				if(msgKeyType.containsKeyColumn("NON_NO_ITEM_TYP") && key.getNON_NO_ITEM_TYP() != null) {
					msgKey.setKeyValue("NON_NO_ITEM_TYP", key.getNON_NO_ITEM_TYP());
				}
				if(msgKeyType.containsKeyColumn("ROUND_TYP") && key.getROUND_TYP() != null) {
					msgKey.setKeyValue("ROUND_TYP", key.getROUND_TYP());
				}
				if(msgKeyType.containsKeyColumn("CUR_CD") && key.getCUR_CD() != null) {
					msgKey.setKeyValue("CUR_CD", key.getCUR_CD());
				}
				if(msgKeyType.containsKeyColumn("EXCH_RATE") && key.getEXCH_RATE() != null) {
					msgKey.setKeyValue("EXCH_RATE", key.getEXCH_RATE());
				}
				if(msgKeyType.containsKeyColumn("EXCH_START_DATE") && key.getEXCH_START_DATE() != null) {
					msgKey.setKeyValue("EXCH_START_DATE", key.getEXCH_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("HOME_CUR_CD") && key.getHOME_CUR_CD() != null) {
					msgKey.setKeyValue("HOME_CUR_CD", key.getHOME_CUR_CD());
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
				if(msgKeyType.containsKeyColumn("COMPANY_CD") && key.getCOMPANY_CD() != null) {
					msgKey.setKeyValue("COMPANY_CD", key.getCOMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("CUR_NAME") && key.getCUR_NAME() != null) {
					msgKey.setKeyValue("CUR_NAME", key.getCUR_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_COUNT_1") && key.getl_COUNT_1() != null) {
					msgKey.setKeyValue("l_COUNT_1", key.getl_COUNT_1());
				}
				if(msgKeyType.containsKeyColumn("ROW_COUNT_1") && key.getROW_COUNT_1() != null) {
					msgKey.setKeyValue("ROW_COUNT_1", key.getROW_COUNT_1());
				}
				if(msgKeyType.containsKeyColumn("l_COUNT_2") && key.getl_COUNT_2() != null) {
					msgKey.setKeyValue("l_COUNT_2", key.getl_COUNT_2());
				}
				if(msgKeyType.containsKeyColumn("ROW_COUNT_2") && key.getROW_COUNT_2() != null) {
					msgKey.setKeyValue("ROW_COUNT_2", key.getROW_COUNT_2());
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
					AC0160010Struct key = new AC0160010Struct();
					if(msgKeyType.containsKeyColumn("r1_FILTER1")) {
						key.setr1_FILTER1(msgKey.getKeyValue("r1_FILTER1"));
					}
					if(msgKeyType.containsKeyColumn("r2_FILTER1")) {
						key.setr2_FILTER1(msgKey.getKeyValue("r2_FILTER1"));
					}
					if(msgKeyType.containsKeyColumn("w_OD_TYP")) {
						key.setw_OD_TYP(msgKey.getKeyValue("w_OD_TYP"));
					}
					if(msgKeyType.containsKeyColumn("w_OD_TYP_name")) {
						key.setw_OD_TYP_name(msgKey.getKeyValue("w_OD_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("w_OD_TYP_val")) {
						key.setw_OD_TYP_val(msgKey.getKeyValue("w_OD_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("PRODUCT_TYP_name")) {
						key.setPRODUCT_TYP_name(msgKey.getKeyValue("PRODUCT_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("PRODUCT_TYP_val")) {
						key.setPRODUCT_TYP_val(msgKey.getKeyValue("PRODUCT_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("r1_FILTER2")) {
						key.setr1_FILTER2(msgKey.getKeyValue("r1_FILTER2"));
					}
					if(msgKeyType.containsKeyColumn("c1_ODR_STS_TYP")) {
						key.setc1_ODR_STS_TYP(msgKey.getKeyValue("c1_ODR_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("c2_ODR_STS_TYP")) {
						key.setc2_ODR_STS_TYP(msgKey.getKeyValue("c2_ODR_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("c3_ODR_STS_TYP")) {
						key.setc3_ODR_STS_TYP(msgKey.getKeyValue("c3_ODR_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("CONFIRM_DLV_DATE")) {
						key.setCONFIRM_DLV_DATE(msgKey.getKeyValue("CONFIRM_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("WH_CD_2")) {
						key.setWH_CD_2(msgKey.getKeyValue("WH_CD_2"));
					}
					if(msgKeyType.containsKeyColumn("REMARKS")) {
						key.setREMARKS(msgKey.getKeyValue("REMARKS"));
					}
					if(msgKeyType.containsKeyColumn("NON_NO_ITEM_NAME")) {
						key.setNON_NO_ITEM_NAME(msgKey.getKeyValue("NON_NO_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("NON_NO_ITEM_PUCH_ODR_UNIT")) {
						key.setNON_NO_ITEM_PUCH_ODR_UNIT(msgKey.getKeyValue("NON_NO_ITEM_PUCH_ODR_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("NET_AMOUNT")) {
						key.setNET_AMOUNT(msgKey.getKeyValue("NET_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("r2_FILTER2")) {
						key.setr2_FILTER2(msgKey.getKeyValue("r2_FILTER2"));
					}
					if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE")) {
						key.setDOWNLOAD_FILE(msgKey.getKeyValue("DOWNLOAD_FILE"));
					}
					if(msgKeyType.containsKeyColumn("TXT_FILE")) {
						key.setTXT_FILE(msgKey.getKeyValue("TXT_FILE"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_COST_TYP_VAL")) {
						key.setUNIT_COST_TYP_VAL(msgKey.getKeyValue("UNIT_COST_TYP_VAL"));
					}
					if(msgKeyType.containsKeyColumn("readITEM_CD")) {
						key.setreadITEM_CD(msgKey.getKeyValue("readITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("IN_ITEM_NAME")) {
						key.setIN_ITEM_NAME(msgKey.getKeyValue("IN_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("IN_ITEM_CD")) {
						key.setIN_ITEM_CD(msgKey.getKeyValue("IN_ITEM_CD"));
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
					if(msgKeyType.containsKeyColumn("IN_WS_CD")) {
						key.setIN_WS_CD(msgKey.getKeyValue("IN_WS_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_NAME")) {
						key.setITEM_NAME(msgKey.getKeyValue("ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PRD_DUE_DATE")) {
						key.setPRD_DUE_DATE(msgKey.getKeyValue("PRD_DUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("PRD_START_DATE")) {
						key.setPRD_START_DATE(msgKey.getKeyValue("PRD_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_PUCH_ODR_QTY")) {
						key.setOPR_INST_PUCH_ODR_QTY(msgKey.getKeyValue("OPR_INST_PUCH_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("WS_VEND_CD")) {
						key.setWS_VEND_CD(msgKey.getKeyValue("WS_VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_CD")) {
						key.setJOB_ODR_CD(msgKey.getKeyValue("JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_ODR_STS_TYP")) {
						key.seth_ODR_STS_TYP(msgKey.getKeyValue("h_ODR_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("InR1_OD_TYP")) {
						key.setInR1_OD_TYP(msgKey.getKeyValue("InR1_OD_TYP"));
					}
					if(msgKeyType.containsKeyColumn("InC1_ODR_STS_TYP")) {
						key.setInC1_ODR_STS_TYP(msgKey.getKeyValue("InC1_ODR_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("InC2_ODR_STS_TYP")) {
						key.setInC2_ODR_STS_TYP(msgKey.getKeyValue("InC2_ODR_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("InC3_ODR_STS_TYP")) {
						key.setInC3_ODR_STS_TYP(msgKey.getKeyValue("InC3_ODR_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("InPLANT_CD")) {
						key.setInPLANT_CD(msgKey.getKeyValue("InPLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("IN_PRD_START_DATE_FROM")) {
						key.setIN_PRD_START_DATE_FROM(msgKey.getKeyValue("IN_PRD_START_DATE_FROM"));
					}
					if(msgKeyType.containsKeyColumn("IN_PRD_START_DATE_TO")) {
						key.setIN_PRD_START_DATE_TO(msgKey.getKeyValue("IN_PRD_START_DATE_TO"));
					}
					if(msgKeyType.containsKeyColumn("IN_PRD_DUE_DATE_FROM")) {
						key.setIN_PRD_DUE_DATE_FROM(msgKey.getKeyValue("IN_PRD_DUE_DATE_FROM"));
					}
					if(msgKeyType.containsKeyColumn("IN_PRD_DUE_DATE_TO")) {
						key.setIN_PRD_DUE_DATE_TO(msgKey.getKeyValue("IN_PRD_DUE_DATE_TO"));
					}
					if(msgKeyType.containsKeyColumn("PRODUCT_TYP")) {
						key.setPRODUCT_TYP(msgKey.getKeyValue("PRODUCT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("NON_NO_ITEM_FLG")) {
						key.setNON_NO_ITEM_FLG(msgKey.getKeyValue("NON_NO_ITEM_FLG"));
					}
					if(msgKeyType.containsKeyColumn("NON_NO_ITEM_TYP")) {
						key.setNON_NO_ITEM_TYP(msgKey.getKeyValue("NON_NO_ITEM_TYP"));
					}
					if(msgKeyType.containsKeyColumn("ROUND_TYP")) {
						key.setROUND_TYP(msgKey.getKeyValue("ROUND_TYP"));
					}
					if(msgKeyType.containsKeyColumn("CUR_CD")) {
						key.setCUR_CD(msgKey.getKeyValue("CUR_CD"));
					}
					if(msgKeyType.containsKeyColumn("EXCH_RATE")) {
						key.setEXCH_RATE(msgKey.getKeyValue("EXCH_RATE"));
					}
					if(msgKeyType.containsKeyColumn("EXCH_START_DATE")) {
						key.setEXCH_START_DATE(msgKey.getKeyValue("EXCH_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("HOME_CUR_CD")) {
						key.setHOME_CUR_CD(msgKey.getKeyValue("HOME_CUR_CD"));
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
					if(msgKeyType.containsKeyColumn("COMPANY_CD")) {
						key.setCOMPANY_CD(msgKey.getKeyValue("COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("CUR_NAME")) {
						key.setCUR_NAME(msgKey.getKeyValue("CUR_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_COUNT_1")) {
						key.setl_COUNT_1(msgKey.getKeyValue("l_COUNT_1"));
					}
					if(msgKeyType.containsKeyColumn("ROW_COUNT_1")) {
						key.setROW_COUNT_1(msgKey.getKeyValue("ROW_COUNT_1"));
					}
					if(msgKeyType.containsKeyColumn("l_COUNT_2")) {
						key.setl_COUNT_2(msgKey.getKeyValue("l_COUNT_2"));
					}
					if(msgKeyType.containsKeyColumn("ROW_COUNT_2")) {
						key.setROW_COUNT_2(msgKey.getKeyValue("ROW_COUNT_2"));
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
