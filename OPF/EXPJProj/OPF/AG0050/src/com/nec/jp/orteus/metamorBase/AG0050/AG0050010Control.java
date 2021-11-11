/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AG0050/src/com/nec/jp/orteus/metamorBase/AG0050/AG0050010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AG0050;

import com.nec.jp.orteus.metamorBase.AG0050.*;
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
import com.nec.jp.orteus.expj.util.Calculate;
import java.util.Comparator;
//}}user_implement_code_import

//{{user_implement_code_header
/**
 * CLASS     : UC2040010Control クラス
 * ファイル・クラス説明
 * @author $Author: geng-jia $
 * @version $Revision: 1.22 $ $Date: 2015/11/24 03:20:45 $
 *
 *[修正履歴]
 * 2006/09/14 受注デマンドで、[受注明細]."出荷直送区分"が「2：直送する」の場合、
 *            出荷準備ＬＴ＝０とする（Entity）
 * 2006/10/31 受注情報を表示する場合、出庫単位換算値の計算を行うように修正
 *            受注明細．出荷直送区分＝「直送」の場合、日付計算時の運送日数＝０
 *            に修正（Entity）
 * 2006/11/14 確定オーダの取得条件に[発注残]."注文取消伝票発行フラグ"=0：対象外
 *            を追加（Entity）
 * 2009/03/04 JとJaの機能を統合した           
 * 2015/08/12 EJaSCM／EJa機能強化対応
 */
//}}user_implement_code_header

public class AG0050010Control
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
//20150813 ADD START BY SYSCOM
	/** 受注デマンド作成基テーブル */
	private String tempDM_CREATE_BASE_TBL = null;
//2050813 ADD START BY SYSCOM
		
	/** 運用環境区分：Explanner/J */
	private final static int EXPLANNER_J = 1;
	
	/** 運用環境区分：Explanner/Ja */
	private final static int EXPLANNER_JA = 2;

	/** コンボボックスデータ取得用定数　オーダ状態区分 */
	private final static String ODR_STATUS_PARAMETER_NAME= "MP_ODR_STATUS"; 
	
	/** コンボボックスデータ取得用定数　オーダ状態区分 */
	private final static String ODR_STS_TYP_PARAMETER_NAME= "ODR_STS_TYP"; 
	
	/** コンボボックスデータ取得用定数　所要量発生処理区分 */
	private final static String ODR_GNR_TYP_PARAMETER_NAME= "OD_GNR_TYP"; 
	
	/** コンボボックスデータ取得用定数　発注発生処理区分 */
	private final static String PUCH_ODR_GNR_TYP_PARAMETER_NAME= "PUCH_ODR_GNR_TYP"; 
	
	/** コンボボックスデータ取得用　オーダ状態区分 */
	private ComboStruct COM_ODR_STATUS = null;
	
	/** コンボボックスデータ取得用　オーダ状態区分 */
	private ComboStruct COM_ODR_STS_TYP = null;

	/** コンボボックスデータ取得用　発生処理区分 */
	private ComboStruct COM_ODR_GNR_TYP = null;

	/** コンボボックスデータ取得用　発注発生処理区分 */
	private ComboStruct COM_PUCH_ODR_GNR_TYP = null;

	// 運行環境
	private int Environment = 0;
	
	private int getEnvironment() {
		return Environment;
	}
	private void setEnvironment(int environment) {
		Environment = environment;
	}
	
	/** システム使用の会社コード */
	protected String SysMyCompany;
	public void setsysMY_COMPANY(String name) { this.SysMyCompany = name; };
	public String getsysMY_COMPANY() { return this.SysMyCompany; };
	
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
	public AG0050010Struct getListvalue(int x) { return (AG0050010Struct)(this.list.get(x)); }	// リストの値を返します。
	public AG0050010Struct getStruct() { return this.struct; }	// Structを返します。
	public AG0050010Struct createStruct() { return new AG0050010Struct(); }	// 新しいStructを作って返します。
	public void setStruct(Object structname) { this.struct.setStruct((AG0050010Struct)structname); }	// Structをセットします。
//	public void initializeStruct() { this.struct.initialize(); }	// Structの値を初期化します。

	// CSV出力用リスト
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }

	/** CSVデータリスト */
	private List _csvList = null;

	/**
	 * NULL→"0"変換 
	 * @return メッセージ
	 */
	public String NullToZero(String value)
	{
		if((value == null || value.length() == 0 || value.equalsIgnoreCase("null"))){
			value = "0";
		}
		return value;
	}

//-------------------------------------------------------------------------
	/** 画面共通定義取得クラス */
	ScreenParam _scParam = sp;


//---------- メッセージ関連の処理-- --------------------------------------------

	/**
	 * メッセージ取得 
	 * @return メッセージ
	 */
	public MessageStruct getMessage()
	{
		return msgStruct;
	}

	/**
	 * メッセージ設定
	 * @param メッセージ
	 */
	public void setMessage(MessageStruct msg)
	{
		msgStruct = msg;
	}


//---------- キー情報の退避処理 ---------------------------------------------------

	/** キー情報保持の為のStruct */
	private AG0050010Struct _keyStruct = new AG0050010Struct();

	/** キー情報Structの取得 */
	public AG0050010Struct getKeyStruct(){ return _keyStruct; }
	
	/** キー情報Structの設定 */
	public void setKeyStruct(AG0050010Struct struct){ _keyStruct.copy(struct); }


//---------- コンボボックスデータ取得関連の処理 -------------------------------

	/** 品目手配区分 */
	ComboStruct _MRP_ODR_TYP = new ComboStruct();

	/** 画面遷移パラメータ（工場コード） */
	private String plantCd = null;
	
	/** 画面遷移パラメータ（品目番号） */
	private String itemCd = null;
	
	/** 画面遷移パラメータ（工場コード）を取得します。 */
	public String getPlantCd() {
		return plantCd;
	}
	
	/** 画面遷移パラメータ（工場コード）を設定します。 */
	public void setPlantCd(String s) {
		plantCd = s;
	}
	
	/** 画面遷移パラメータ（品目番号）を取得します。 */
	public String getItemCd() {
		return itemCd;
	}
	
	/** 画面遷移パラメータ（品目番号）を設定します。 */
	public void setItemCd(String s) {
		itemCd = s;
	}

//------------------------------------------------------------------------

	/** ユーザ定義の初期化済フラグ */
	private boolean _usersIntialized = false;

	/**
	 * ユーザ定義 初期化処理
	 */
	private void usersInitialize() throws ExpjException
	{
		if(_usersIntialized) return;

		_usersIntialized = true;
		return ;
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
	 * エラーメッセージ設定
	 * @param メッセージ番号
	 * @param 出力メッセージ
	 */
	private void setErrorMessage(String messageno, String message)
	{
		ExpjMessage emsg = new ExpjMessage( messageno );
		msgStruct.addError( emsg );
		sysLog.warning(emsg, getsysUSER_CD());
		emsg = new ExpjMessage( "ZZ01006", message );
		msgStruct.addError( emsg );
		sysLog.warning(emsg, getsysUSER_CD());
	}

	/**
	 * エラーメッセージ設定
	 * @param メッセージ番号
	 * @param 出力メッセージ(List)
	 */
	private void setErrorMessage(String messageno, List message)
	{
		ExpjMessage emsg = new ExpjMessage( messageno );
		msgStruct.addError( emsg );
		sysLog.warning(emsg, getsysUSER_CD());
		
		for(int i=0; i<message.size(); i++)
		{
			emsg = new ExpjMessage( "ZZ01006", (String)message.get(i) );
			msgStruct.addError( emsg );
			sysLog.warning(emsg, getsysUSER_CD());
		}
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
//20150813 ADD START BY SYSCOM
	/**
	 * 初期設定でのエラーメッセージ設定
	 * @param メッセージ番号
	 */
	private void setFatalMessage(String messageno) throws ExpjException {
		ExpjMessage emsg = new ExpjMessage(messageno);
		msgStruct.addError( emsg );
		sysLog.severe(emsg, getsysUSER_CD());
		ExpjException ee = new ExpjException(emsg);
		throw ee;
	}
//20150813 ADD END BY SYSCOM
	/**
	 * Explanner/J環境での読込操作
	 *
	 */
	private void selectInExplannerJ(List workList, List listMessage){

		try{
			AG0050010Struct readStruct = new AG0050010Struct();
			// 出荷LT取得
			readStruct.setw_CLASS_CODE("SHIP_LT");
			List codeList = entity.mgetSYS_CLASS_CODE.read(conn,readStruct);
			if (codeList.size() <= 0){
				// 出荷準備L/Tの取得に失敗しました。
				listMessage.add("SYS_CLASS_CODE.SYS_CLASS:SALES");
				listMessage.add("SYS_CLASS_CODE.CLASS_CODE:" + readStruct.getw_CLASS_CODE());
				setErrorMessage("AG00501", listMessage);
				struct.copy(getKeyStruct());
				return;
			}
			AG0050010Struct setCodeStruct = (AG0050010Struct)codeList.get(0);
			struct.setw_SHIP_LT(setCodeStruct.getw_SHIP_LT());
	
			setReadStatus(INITIAL);
			List tempList = null;
	
			//詳細データを取得
			struct.setw_MRP_FLG(null);
			struct.setw_CHECK_FLG(null);
			struct.setw_UNCONFIRM_FLG(null);
			struct.setw_ENV_FLG("1");
			if("true".equals(struct.getcheckMrpFlg())){
				struct.setw_MRP_FLG(null);
			} else {
				struct.setw_MRP_FLG("1");
			}
			if("true".equals(struct.getcheckProdPlan())){
				struct.setw_CHECK_FLG("1");
			} else {
				struct.setw_CHECK_FLG("0");
			}
			if("true".equals(struct.getcheckUncnfm())){
				struct.setw_UNCONFIRM_FLG("1");
			} else {
				struct.setw_UNCONFIRM_FLG("0");
			}
			if("true".equals(struct.getcheckQty())){
				struct.setw_QTY_FLG("1");
			} else {
				struct.setw_QTY_FLG("0");
			}

			// 最大表示行数
			ScreenParam sp = new ScreenParam(this.getClass());
			int maxLine = sp.getMaxLine(conn, 10);
			if (maxLine != 0){
				struct.setROW_COUNT(String.valueOf(maxLine));
			}else{
				struct.setROW_COUNT(null);
			}
			List tempList1 = entity.mgetDETAL_DATACnt.read(conn, struct);
			long rowCount1 = Long.parseLong(((AG0050010Struct) tempList1.get(0)).getl_COUNT());
			
			List tempList2 = entity.mgetDETAL_DATA_JCnt.read(conn, struct);
			long rowCount2 = Long.parseLong(((AG0050010Struct) tempList2.get(0)).getl_COUNT());

			// 検索結果0件の場合
			if (rowCount1 ==0 && rowCount2 == 0) { // 該当データなし
				listMessage.add("ITEM_CD:" + struct.getw_ITEM_CD());
				listMessage.add("PLANT_CD:" + struct.getw_PLANT_CD());
				setErrorMessage("ZZ06001", listMessage);
				setReadStatus(NOT_FOUND);
				struct.copy(getKeyStruct());
				if(tempList!=null && tempList.size()>0){
					tempList.clear();
				}
				return;
			}else{
				// 表示最大行数制限処理
				if (maxLine != 0 && ((rowCount1 == maxLine + 1)||(rowCount2 == maxLine + 1))||(rowCount1+rowCount2 >= maxLine + 1)) {
					// 読込ステータス設定
					setErrorMessage("ZZ01115", "", String.valueOf(maxLine));
					readStatus = TOO_MANY;
					listMessage.clear();
					// 表示用リストにセット
					if(tempList!=null && tempList.size()>0){
						tempList.clear();
					}
					return;
				}else{
					tempList1 = entity.mgetDETAIL_DATA.read(conn, struct);
					tempList2 = entity.mgetDETAIL_DATA_J.read(conn, struct);
					tempList1.addAll(tempList2);
					
					tempList = tempList1;

					// 読込ステータス設定
					setReadStatus(NORMAL);
					
					String effectStockQty = "0";
					String scdlRcvTotalFix = "0";
					String scdlRcvTotalNoFix = "0";
					String scdlIssueTotalFix = "0";
					String scdlIssueTotalNoFix = "0";
					
					AG0050010Struct tempStruct = null;
					String insideOdrQty = "0";// 内示受注数
					String demandQty = "0";// デマンド数
					
					for(int k = 0; k < tempList.size(); k++ ) {
						tempStruct = (AG0050010Struct)tempList.get(k);
						if ("6".equals(tempStruct.getSORT_NO()) 
								|| "7".equals(tempStruct.getSORT_NO())) {
							try{
								String userCd = getsysUSER_CD();
								String businessCd = "AG0050010";
								String m_wh_plantCd = tempStruct.getM_WH_PLANT_CD();
								String itemCd = struct.getw_ITEM_CD();
								Date iDate = null;
								int margin = 0;
								boolean moveFlg = true;
					      
								// 指定納期
								if(null != tempStruct.getDESINATED_DLV_DATE() && !"".equals(tempStruct.getDESINATED_DLV_DATE())){
									iDate = new Date(tempStruct.getDESINATED_DLV_DATE());
								} 
								// 運送日数
								String TRANSPORT_LT = tempStruct.getTRANSPORT_LT();
								int iTRANSPORT_LT = 0;
								if(null != tempStruct.getTRANSPORT_LT() && !"".equals(tempStruct.getTRANSPORT_LT())){
									iTRANSPORT_LT = Integer.parseInt(TRANSPORT_LT);
								}
								// 出荷準備ＬＴ
								String SHIP_LT = struct.getw_SHIP_LT();
								int iSHIP_LT = 0;
								if(null != struct.getw_SHIP_LT() && !"".equals(struct.getw_SHIP_LT())){
									iSHIP_LT = Integer.parseInt(SHIP_LT);
								}
								// 加算日
								margin = -(iTRANSPORT_LT + iSHIP_LT);
								// 稼働日計算を行うクラス
								WorkDay workDay = new WorkDay(userCd,businessCd,m_wh_plantCd,iDate,margin,moveFlg);
								// 対象日付から算出した稼動日日付を返却する。
								Date DELIVERY_DATE = workDay.calcDate();
								if(null == DELIVERY_DATE){
									tempStruct.setDELIVERY_DATE(null);
								}else{
									SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd");
									String strDELIVERY_DATE = df.format(DELIVERY_DATE);
									tempStruct.setDELIVERY_DATE(strDELIVERY_DATE);
								}
							}catch(FoundationException fe){
								fe.printStackTrace();
							}
						}
						
						if(null == tempStruct.getDELIVERY_DATE()){
							tempStruct.setDELIVERY_DATE("");
						}
						
					}
			
					Collections.sort(tempList,new Sort());
											
					for(int i = 0; i < tempList.size(); i++ ) {
						tempStruct = (AG0050010Struct)tempList.get(i);
						
						// 受注情報から、値を取得している場合は、出荷単位換算値の計算を行う
						insideOdrQty = "0";
						demandQty = "0";
						if ("6".equals(tempStruct.getSORT_NO()) || "7".equals(tempStruct.getSORT_NO())) {
							// 参考単位換算値がnullまたは0以外の場合、計算を行う
							// 計算式：受注明細．○○数量×購買単位換算値
							if (tempStruct.getw_PKG_UNIT_QTY() != null && !"".equals(tempStruct.getw_PKG_UNIT_QTY()) && !"0".equals(tempStruct.getw_PKG_UNIT_QTY())) {
								// 内示受注数の計算
								if (tempStruct.getINSIDE_ODR_QTY() != null && !"".equals(tempStruct.getINSIDE_ODR_QTY()) && !"0".equals(tempStruct.getINSIDE_ODR_QTY())) {
									//1：整数管理 の場合小数第１位切り上げ
									//2：小数管理 の場合小数第５位切り上げ
									if ("1".equals(tempStruct.getw_UNIT_QTY_TYP())) {
										insideOdrQty = Calculate.ceil(tempStruct.getINSIDE_ODR_QTY(),0);
									} else {
										insideOdrQty = Calculate.ceil(tempStruct.getINSIDE_ODR_QTY(),4);
									}
									tempStruct.setINSIDE_ODR_QTY(insideOdrQty);
								} else {
									tempStruct.setINSIDE_ODR_QTY("0");
								}
								// デマンド数の計算
								if (tempStruct.getDEMAND_QTY() != null && !"".equals(tempStruct.getDEMAND_QTY()) && !"0".equals(tempStruct.getDEMAND_QTY())) {
									//1：整数管理 の場合小数第１位切り上げ
									//2：小数管理 の場合小数第５位切り上げ
									if ("1".equals(tempStruct.getw_UNIT_QTY_TYP())) {
										demandQty = Calculate.ceil(Calculate.multiply(tempStruct.getDEMAND_QTY(),"1"),0);
									} else {
										demandQty = Calculate.ceil(Calculate.multiply(tempStruct.getDEMAND_QTY(),"1"),4);
									}
									tempStruct.setDEMAND_QTY(demandQty);
								} else {
									tempStruct.setDEMAND_QTY("0");
								}
								
							} else {
								tempStruct.setINSIDE_ODR_QTY("0");
								tempStruct.setDEMAND_QTY("0");
							}
						}
						
			
						// (2)	確定デマンドで親オーダ番号、親オーダ品目番号、親オーダ品目名の設定
						if ("4".equals(tempStruct.getSORT_NO())) {
							// 品目別仕掛.作業計画番号
							String WORK_ODR_CD = tempStruct.getWORK_ODR_CD();
							// 発注残.発注番号
							String PARENT_ORDER_NO = tempStruct.getPARENT_ORDER_NO();
							AG0050010Struct itemInfoStruct = new AG0050010Struct();
							List itemList = new ArrayList(0);
							// 品目別仕掛.作業計画番号を取得できる
							if(null != WORK_ODR_CD){
								tempStruct.setPARENT_ORDER_NO(WORK_ODR_CD);
								itemInfoStruct.setODR_CD(WORK_ODR_CD);
			          itemList = entity.mgetT_WORK_ITEM_INFO.read(conn, itemInfoStruct);
			          if(itemList.size() > 0){
			            itemInfoStruct = (AG0050010Struct)itemList.get(0);
				          // 親オーダ品目番号
				          tempStruct.setPARENT_ORDER_ITEM_NO(itemInfoStruct.getPARENT_ORDER_ITEM_NO());
				          // 親オーダ品目名
				          tempStruct.setPARENT_ORDER_ITEM_NAME(itemInfoStruct.getPARENT_ORDER_ITEM_NAME());
			          }
							}else{
								itemInfoStruct.setODR_CD(PARENT_ORDER_NO);
			          itemList = entity.mgetT_RLSD_ITEM_INFO.read(conn, itemInfoStruct);
			          if(itemList.size() > 0){
			            itemInfoStruct = (AG0050010Struct)itemList.get(0);
				          // 親オーダ品目番号
				          tempStruct.setPARENT_ORDER_ITEM_NO(itemInfoStruct.getPARENT_ORDER_ITEM_NO());
				          // 親オーダ品目名
				          tempStruct.setPARENT_ORDER_ITEM_NAME(itemInfoStruct.getPARENT_ORDER_ITEM_NAME());
			          }
							}
						}
					 if ("5".equals(tempStruct.getSORT_NO())) {
							AG0050010Struct odInfoStruct = new AG0050010Struct();
							List odList = new ArrayList(0);
							if(null != tempStruct.getPARENT_ORDER_NO()){
								odInfoStruct.setODR_CD(tempStruct.getPARENT_ORDER_NO());
								odList = entity.mgetT_OD_INFO.read(conn, odInfoStruct);
								if(odList.size() > 0){
									odInfoStruct = (AG0050010Struct)odList.get(0);
									// 親オーダ品目番号
									tempStruct.setPARENT_ORDER_ITEM_NO(odInfoStruct.getPARENT_ORDER_ITEM_NO());
									// 親オーダ品目名
									tempStruct.setPARENT_ORDER_ITEM_NAME(odInfoStruct.getPARENT_ORDER_ITEM_NAME());
								}
							}
						}
						if ("1".equals(((AG0050010Struct)tempList.get(i)).getSORT_NO())) {
							//有効在庫数作成
							effectStockQty = Calculate.add(effectStockQty,((AG0050010Struct)tempList.get(i)).getSTOCK_ODR_QTY());
							((AG0050010Struct)tempList.get(i)).setEFFECT_STOCK_QTY(effectStockQty);
						} else 	if ("2".equals(((AG0050010Struct)tempList.get(i)).getSORT_NO())) {
							// ステータスが「５：取消」、「６：取消発行済」、「７：受入完了」、「８：検査完了」の場合、加算されいてない
							if(!"5".equals(((AG0050010Struct)tempList.get(i)).getNUMBER_STATUS())
									&& !"6".equals(((AG0050010Struct)tempList.get(i)).getNUMBER_STATUS())
									&& !"7".equals(((AG0050010Struct)tempList.get(i)).getNUMBER_STATUS())
									&& !"8".equals(((AG0050010Struct)tempList.get(i)).getNUMBER_STATUS())) {
								//有効在庫数作成
								effectStockQty = Calculate.add(effectStockQty,((AG0050010Struct)tempList.get(i)).getSTOCK_ODR_QTY());
								//確定オーダ(入庫予定合計(確定))作成
								scdlRcvTotalFix = Calculate.add(scdlRcvTotalFix,((AG0050010Struct)tempList.get(i)).getSTOCK_ODR_QTY());
							}
							((AG0050010Struct)tempList.get(i)).setEFFECT_STOCK_QTY(effectStockQty);
						} else if ("3".equals(((AG0050010Struct)tempList.get(i)).getSORT_NO())) {
							//有効在庫数作成
							effectStockQty = Calculate.add(effectStockQty,((AG0050010Struct)tempList.get(i)).getSTOCK_ODR_QTY());
							((AG0050010Struct)tempList.get(i)).setEFFECT_STOCK_QTY(effectStockQty);
							//計画オーダ(入庫予定合計(未確定))作成
							scdlRcvTotalNoFix = Calculate.add(scdlRcvTotalNoFix,((AG0050010Struct)tempList.get(i)).getSTOCK_ODR_QTY());
						} else if ("4".equals(((AG0050010Struct)tempList.get(i)).getSORT_NO())) {
							//有効在庫数作成
							effectStockQty = Calculate.subtract(effectStockQty,((AG0050010Struct)tempList.get(i)).getDEMAND_QTY());
							((AG0050010Struct)tempList.get(i)).setEFFECT_STOCK_QTY(effectStockQty);
							//確定デマンド(出庫予定合計(確定))作成
							scdlIssueTotalFix = Calculate.add(scdlIssueTotalFix,((AG0050010Struct)tempList.get(i)).getDEMAND_QTY());
						} else if ("5".equals(((AG0050010Struct)tempList.get(i)).getSORT_NO())) {
							//有効在庫数作成
							effectStockQty = Calculate.subtract(effectStockQty,((AG0050010Struct)tempList.get(i)).getDEMAND_QTY());
							((AG0050010Struct)tempList.get(i)).setEFFECT_STOCK_QTY(effectStockQty);
							//計画デマンド(出庫予定合計(未確定))作成
							scdlIssueTotalNoFix = Calculate.add(scdlIssueTotalNoFix,((AG0050010Struct)tempList.get(i)).getDEMAND_QTY());
						} else if ("6".equals(((AG0050010Struct)tempList.get(i)).getSORT_NO())) {
							//有効在庫数作成
							effectStockQty = Calculate.subtract(effectStockQty,((AG0050010Struct)tempList.get(i)).getINSIDE_ODR_QTY());
							((AG0050010Struct)tempList.get(i)).setEFFECT_STOCK_QTY(effectStockQty);
							//計画デマンド(出庫予定合計(未確定))作成
							scdlIssueTotalNoFix = Calculate.add(scdlIssueTotalNoFix,((AG0050010Struct)tempList.get(i)).getINSIDE_ODR_QTY());
						} else if ("7".equals(((AG0050010Struct)tempList.get(i)).getSORT_NO())) {
							//有効在庫数作成
							effectStockQty = Calculate.subtract(effectStockQty,((AG0050010Struct)tempList.get(i)).getDEMAND_QTY());
							((AG0050010Struct)tempList.get(i)).setEFFECT_STOCK_QTY(effectStockQty);
							//確定デマンド(出庫予定合計(確定))作成
							scdlIssueTotalFix = Calculate.add(scdlIssueTotalFix,((AG0050010Struct)tempList.get(i)).getDEMAND_QTY());
						}
						
						// コンボボックスデータ多言語対応
						/** コンボボックスデータ取得用　オーダ状態区分 */
						tempStruct.setSTATUS(getDisplayName(COM_ODR_STATUS, tempStruct.getNUMBER_STATUS()));
						if("2".equals(tempStruct.getSORT_NO())) {
							if("1".equals(tempStruct.getGNR())){
						      tempStruct.setSTATUS(getDisplayName(COM_ODR_STS_TYP, tempStruct.getNUMBER_STATUS()));
							}
					    }

						/** コンボボックスデータ取得用　発注発生処理区分 */
						if(null != tempStruct.getGNR() && "2".equals(tempStruct.getGNR())){
					      tempStruct.setGNR_TYP(getDisplayName(COM_PUCH_ODR_GNR_TYP, tempStruct.getNUMBER_GNR_TYP()));
					    }else{
					      tempStruct.setGNR_TYP(getDisplayName(COM_ODR_GNR_TYP, tempStruct.getNUMBER_GNR_TYP()));
					    }
					}
										
					//ヘッダ表示セット
					struct.setSCDL_RCV_TOTAL_FIX(scdlRcvTotalFix);
					struct.setSCDL_RCV_TOTAL_NOFIX(scdlRcvTotalNoFix);
					struct.setSCDL_ISSUE_TOTAL_FIX(scdlIssueTotalFix);
					struct.setSCDL_ISSUE_TOTAL_NOFIX(scdlIssueTotalNoFix);
					
					struct.setSCDL_ISSUE_TOTAL(Calculate.add(scdlIssueTotalFix, scdlIssueTotalNoFix));
					struct.setSCDL_RCV_TOTAL(Calculate.add(scdlRcvTotalFix, scdlRcvTotalNoFix));
						
					// 表示用リストにセット
					setList(tempList);
					
					// 読込データをCSVリストに退避
					_csvList = tempList;
				}
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	/**
	 * Explanner/Ja環境での読込操作
	 *
	 */
	private void selectInExplannerJa(List workList, List listMessage){
		try{

//			List tempList = null;
//
//			//詳細データを取得
//			if (("true".equals(struct.getcheckProdPlan()))){
//				//【生産計画の未確定を含めない】がONの場合
//				// 計画デマンド、計画オーダの取得は行わない
//				tempList = entity.mgetDETAIL_DATA_JA.read(conn, struct);
//			} else {
//				//【生産計画の未確定を含めない】がOFFの場合
//				// 計画デマンド、計画オーダの取得を行う
//				tempList = entity.mgetDETAIL_DATA_PLAN_JA.read(conn, struct);
//			}
			
			List tempList = null;
			long count = 0;
			HashSet set = new HashSet();
			HashSet odrSet = new HashSet();
			HashSet deptSet = new HashSet();
			HashSet coeSet = new HashSet();
			
			//詳細データを取得
			struct.setw_MRP_FLG(null);
			struct.setw_CHECK_FLG(null);
			struct.setw_ENV_FLG("2");
			if("true".equals(struct.getcheckMrpFlg())){
				struct.setw_MRP_FLG(null);
			} else {
				struct.setw_MRP_FLG("1");
			}
			if("true".equals(struct.getcheckProdPlan())){
				struct.setw_CHECK_FLG("1");
			} else {
				struct.setw_CHECK_FLG("0");
			}
			if("true".equals(struct.getcheckQty())){
				struct.setw_QTY_FLG("1");
			} else {
				struct.setw_QTY_FLG("0");
			}
			
			// 表示行数制限値(SYS_SCREEN_PARM)を超えた場合エラー
			ScreenParam sp = new ScreenParam(this.getClass());
		    int maxLine = sp.getMaxLine(conn,10);
		    if (maxLine != 0){
			   struct.setROW_COUNT(String.valueOf(maxLine));
			}else{
			   struct.setROW_COUNT(null);
			}
			List tempList1 = entity.mgetDETAL_DATACnt.read(conn, struct);
			long rowCount1 = Long.parseLong(((AG0050010Struct) tempList1.get(0)).getl_COUNT());
//20150813 MOD START BY SYSCOM
//			List tempList2 = entity.mgetDETAIL_DATA_JACnt.read(conn, struct);
			List tempList2 =  new ArrayList();
			//「受注デマンド作成基テーブル」＝1：統合受注の場合
			if("1".equals(struct.geth_DM_CREATE_BASE_TBL())){
				tempList2 = entity.mgetDETAIL_DATA_JACnt.read(conn, struct);
			//「受注デマンド作成基テーブル」≠1：統合受注の場合
			} else {
				tempList2 = entity.mgetDETAIL_DATA_JA_WORKCnt.read(conn, struct);
			}
//20150813 MOD END BY SYSCOM
			long rowCount2 = Long.parseLong(((AG0050010Struct) tempList2.get(0)).getl_COUNT());
			// 検索結果0件の場合
			if (rowCount1 ==0 && rowCount2 == 0) { // 該当データなし
				listMessage.add("ITEM_CD:" + struct.getw_ITEM_CD());
				listMessage.add("PLANT_CD:" + struct.getw_PLANT_CD());
				setErrorMessage("ZZ06001", listMessage);
				setReadStatus(NOT_FOUND);
				struct.copy(getKeyStruct());
				if(tempList!=null && tempList.size()>0){
					tempList.clear();
				}
				return;
			}else{
				// 表示最大行数制限処理
			    if (maxLine != 0 && ((rowCount1 == maxLine + 1)||(rowCount2 == maxLine + 1))||(rowCount1+rowCount2 >= maxLine + 1)) {
				    // 読込ステータス設定
				    setErrorMessage("ZZ01115", "", String.valueOf(maxLine));
				    readStatus = TOO_MANY;
				    listMessage.clear();
				    // 表示用リストにセット
				   if(tempList!=null && tempList.size()>0){
					  tempList.clear();
				   }
				   return;
			    }else{
					tempList1 = entity.mgetDETAIL_DATA.read(conn, struct);
//20150813 MOD START BY SYSCOM
//					tempList2 = entity.mgetDETAIL_DATA_JA.read(conn, struct);
			    	//「受注デマンド作成基テーブル」＝1：統合受注の場合
			    	if("1".equals(struct.geth_DM_CREATE_BASE_TBL())){
			    		tempList2 = entity.mgetDETAIL_DATA_JA.read(conn, struct);
			    	//「受注デマンド作成基テーブル」≠1：統合受注の場合
					} else {
						tempList2 = entity.mgetDETAIL_DATA_JA_WORK.read(conn, struct);
					}
//20150813 MOD END BY SYSCOM
					tempList1.addAll(tempList2);					
					tempList = tempList1;
					// 読込ステータス設定
					setReadStatus(NORMAL);
					String effectStockQty = "0";
					String scdlRcvTotalFix = "0";
					String scdlRcvTotalNoFix = "0";
					String scdlIssueTotalFix = "0";
					String scdlIssueTotalNoFix = "0";
					
					AG0050010Struct tempStruct = null;

					Collections.sort(tempList,new Sort());									

					for(int i = 0; i < tempList.size(); i++ ) {
						tempStruct = (AG0050010Struct)tempList.get(i);

						// (2)	確定デマンドで親オーダ番号、親オーダ品目番号、親オーダ品目名の設定
						if ("4".equals(tempStruct.getSORT_NO())) {
							// 品目別仕掛.作業計画番号
							String WORK_ODR_CD = tempStruct.getWORK_ODR_CD();
							// 発注残.発注番号
							String PARENT_ORDER_NO = tempStruct.getPARENT_ORDER_NO();
							AG0050010Struct itemInfoStruct = new AG0050010Struct();
							List itemList = new ArrayList(0);
							// 品目別仕掛.作業計画番号を取得できる
							if(null != WORK_ODR_CD){
								tempStruct.setPARENT_ORDER_NO(WORK_ODR_CD);
								itemInfoStruct.setODR_CD(WORK_ODR_CD);
								itemList = entity.mgetT_WORK_ITEM_INFO.read(conn, itemInfoStruct);
								if(itemList.size() > 0){
									itemInfoStruct = (AG0050010Struct)itemList.get(0);
									// 親オーダ品目番号
									tempStruct.setPARENT_ORDER_ITEM_NO(itemInfoStruct.getPARENT_ORDER_ITEM_NO());
									// 親オーダ品目名
									tempStruct.setPARENT_ORDER_ITEM_NAME(itemInfoStruct.getPARENT_ORDER_ITEM_NAME());
								}
							}else{
								itemInfoStruct.setODR_CD(PARENT_ORDER_NO);
								itemList = entity.mgetT_RLSD_ITEM_INFO.read(conn, itemInfoStruct);
								if(itemList.size() > 0){
									itemInfoStruct = (AG0050010Struct)itemList.get(0);
									// 親オーダ品目番号
									tempStruct.setPARENT_ORDER_ITEM_NO(itemInfoStruct.getPARENT_ORDER_ITEM_NO());
									// 親オーダ品目名
									tempStruct.setPARENT_ORDER_ITEM_NAME(itemInfoStruct.getPARENT_ORDER_ITEM_NAME());
								}
							}
						}
						if ("5".equals(tempStruct.getSORT_NO())) {
							AG0050010Struct odInfoStruct = new AG0050010Struct();
							List odList = new ArrayList(0);
							if(null != tempStruct.getPARENT_ORDER_NO()){
								odInfoStruct.setODR_CD(tempStruct.getPARENT_ORDER_NO());
								odList = entity.mgetT_OD_INFO.read(conn, odInfoStruct);
								if(odList.size() > 0){
									odInfoStruct = (AG0050010Struct)odList.get(0);
									// 親オーダ品目番号
									tempStruct.setPARENT_ORDER_ITEM_NO(odInfoStruct.getPARENT_ORDER_ITEM_NO());
									// 親オーダ品目名
									tempStruct.setPARENT_ORDER_ITEM_NAME(odInfoStruct.getPARENT_ORDER_ITEM_NAME());
								}
							}
						}					
						if ("1".equals(((AG0050010Struct)tempList.get(i)).getSORT_NO())) {
							//有効在庫数作成
							effectStockQty = Calculate.add(effectStockQty,((AG0050010Struct)tempList.get(i)).getSTOCK_ODR_QTY());
							((AG0050010Struct)tempList.get(i)).setEFFECT_STOCK_QTY(effectStockQty);
						} else 	if ("2".equals(((AG0050010Struct)tempList.get(i)).getSORT_NO())) {
							// ステータスが「５：取消」、「６：取消発行済」、「７：受入完了」、「８：検査完了」の場合、加算されいてない
							if(!"5".equals(((AG0050010Struct)tempList.get(i)).getNUMBER_STATUS())
									&& !"6".equals(((AG0050010Struct)tempList.get(i)).getNUMBER_STATUS())
									&& !"7".equals(((AG0050010Struct)tempList.get(i)).getNUMBER_STATUS())
									&& !"8".equals(((AG0050010Struct)tempList.get(i)).getNUMBER_STATUS())) {
								// 有効在庫数作成
								effectStockQty = Calculate.add(effectStockQty,((AG0050010Struct)tempList.get(i)).getSTOCK_ODR_QTY());
								//確定オーダ(入庫予定合計(確定))作成
								scdlRcvTotalFix = Calculate.add(scdlRcvTotalFix,((AG0050010Struct)tempList.get(i)).getSTOCK_ODR_QTY());
							}
							((AG0050010Struct)tempList.get(i)).setEFFECT_STOCK_QTY(effectStockQty);

						} else if ("3".equals(((AG0050010Struct)tempList.get(i)).getSORT_NO())) {
							//有効在庫数作成
							effectStockQty = Calculate.add(effectStockQty,((AG0050010Struct)tempList.get(i)).getSTOCK_ODR_QTY());
							((AG0050010Struct)tempList.get(i)).setEFFECT_STOCK_QTY(effectStockQty);
							//計画オーダ(入庫予定合計(未確定))作成
							scdlRcvTotalNoFix = Calculate.add(scdlRcvTotalNoFix,((AG0050010Struct)tempList.get(i)).getSTOCK_ODR_QTY());
						} else if ("4".equals(((AG0050010Struct)tempList.get(i)).getSORT_NO())) {
							//有効在庫数作成
							effectStockQty = Calculate.subtract(effectStockQty,((AG0050010Struct)tempList.get(i)).getDEMAND_QTY());
							((AG0050010Struct)tempList.get(i)).setEFFECT_STOCK_QTY(effectStockQty);
							//確定デマンド(出庫予定合計(確定))作成
							scdlIssueTotalFix = Calculate.add(scdlIssueTotalFix,((AG0050010Struct)tempList.get(i)).getDEMAND_QTY());
						} else if ("5".equals(((AG0050010Struct)tempList.get(i)).getSORT_NO())) {
							//有効在庫数作成
							effectStockQty = Calculate.subtract(effectStockQty,((AG0050010Struct)tempList.get(i)).getDEMAND_QTY());
							((AG0050010Struct)tempList.get(i)).setEFFECT_STOCK_QTY(effectStockQty);
							//計画デマンド(出庫予定合計(未確定))作成
							scdlIssueTotalNoFix = Calculate.add(scdlIssueTotalNoFix,((AG0050010Struct)tempList.get(i)).getDEMAND_QTY());
						} else if ("6".equals(((AG0050010Struct)tempList.get(i)).getSORT_NO())) {
							count = set.size();
							// オーダデマンド番号を保存
							set.add(((AG0050010Struct)tempList.get(i)).getOD_NO());
							count ++;
							// すでにマイナスしたオーダデマンド番号の受注であればマイナスしない
							if(count == set.size()){
								//有効在庫数作成
								effectStockQty = Calculate.subtract(effectStockQty,((AG0050010Struct)tempList.get(i)).getINTEGRATE_ODR_QTY_ZH());
								//内示受注データ・計画デマンド(出庫予定合計(未確定))作成
								scdlIssueTotalNoFix = Calculate.add(scdlIssueTotalNoFix,((AG0050010Struct)tempList.get(i)).getINTEGRATE_ODR_QTY_ZH());
							}
							((AG0050010Struct)tempList.get(i)).setEFFECT_STOCK_QTY(effectStockQty);
						} else if ("7".equals(((AG0050010Struct)tempList.get(i)).getSORT_NO())) {
							count = odrSet.size();
							// オーダデマンド番号を保存
							odrSet.add(((AG0050010Struct)tempList.get(i)).getOD_NO());
							count ++;
							// すでにマイナスしたオーダデマンド番号の受注であればマイナスしない
							if(count == odrSet.size()){
								// 有効在庫数作成
								effectStockQty = Calculate.subtract(effectStockQty,((AG0050010Struct)tempList.get(i)).getINTEGRATE_ODR_QTY_ZH());
								//確定受注データ・確定デマンド(出庫予定合計(確定))作成
								scdlIssueTotalFix = Calculate.add(scdlIssueTotalFix,((AG0050010Struct)tempList.get(i)).getINTEGRATE_ODR_QTY_ZH());
							}
							((AG0050010Struct)tempList.get(i)).setEFFECT_STOCK_QTY(effectStockQty);
						} else if ("8".equals(((AG0050010Struct)tempList.get(i)).getSORT_NO())) {
							count = deptSet.size();
							// オーダデマンド番号を保存
							deptSet.add(((AG0050010Struct)tempList.get(i)).getOD_NO());
							count ++;
							// すでにマイナスしたオーダデマンド番号の受注であればマイナスしない
							if(count == deptSet.size()){
								// 有効在庫数作成
								effectStockQty = Calculate.subtract(effectStockQty,((AG0050010Struct)tempList.get(i)).getINTEGRATE_ODR_QTY_ZH());
								//デポ計画データ・確定デマンド(出庫予定合計(確定))作成
								scdlIssueTotalFix = Calculate.add(scdlIssueTotalFix,((AG0050010Struct)tempList.get(i)).getINTEGRATE_ODR_QTY_ZH());	
							}
							((AG0050010Struct)tempList.get(i)).setEFFECT_STOCK_QTY(effectStockQty);
						} else {
							//混在の有効在庫計算
							count = coeSet.size();
							// オーダデマンド番号を保存
							coeSet.add(((AG0050010Struct)tempList.get(i)).getOD_NO());
							count ++;
							// すでにマイナスしたオーダデマンド番号の受注であればマイナスしない
							if(count == coeSet.size()){
								//有効在庫数作成
								effectStockQty = Calculate.subtract(effectStockQty,((AG0050010Struct)tempList.get(i)).getINTEGRATE_ODR_QTY_ZH());
							}
							((AG0050010Struct)tempList.get(i)).setEFFECT_STOCK_QTY(effectStockQty);
//20150813 MOD START BY SYSCOM
//							//内示受注データ・計画デマンド(出庫予定合計(未確定))作成
//							scdlIssueTotalNoFix = Calculate.add(scdlIssueTotalNoFix,((AG0050010Struct)tempList.get(i)).getUNOFFICIAL_ODR_QTY());
//							//確定受注データ・確定デマンド(出庫予定合計(確定))作成
//							scdlIssueTotalFix = Calculate.add(scdlIssueTotalFix,((AG0050010Struct)tempList.get(i)).getFIX_ODR_QTY());
//							//デポ計画データ・確定デマンド(出庫予定合計(確定))作成
//							scdlIssueTotalFix = Calculate.add(scdlIssueTotalFix,((AG0050010Struct)tempList.get(i)).getDEPOT_QTY());
							if("1".equals(struct.geth_DM_CREATE_BASE_TBL())){
	 							//内示受注データ・計画デマンド(出庫予定合計(未確定))作成
	 							scdlIssueTotalNoFix = Calculate.add(scdlIssueTotalNoFix,((AG0050010Struct)tempList.get(i)).getUNOFFICIAL_ODR_QTY());
	 							//確定受注データ・確定デマンド(出庫予定合計(確定))作成
	 							scdlIssueTotalFix = Calculate.add(scdlIssueTotalFix,((AG0050010Struct)tempList.get(i)).getFIX_ODR_QTY());
	 							//デポ計画データ・確定デマンド(出庫予定合計(確定))作成
	 							scdlIssueTotalFix = Calculate.add(scdlIssueTotalFix,((AG0050010Struct)tempList.get(i)).getDEPOT_QTY());
							}
//20150813 MOD END BY SYSCOM
						}
						
						// コンボボックスデータ多言語対応
						/** コンボボックスデータ取得用　オーダ状態区分 */
					  tempStruct.setSTATUS(getDisplayName(COM_ODR_STATUS, tempStruct.getNUMBER_STATUS()));
						if("2".equals(tempStruct.getSORT_NO())) {
							if("1".equals(tempStruct.getGNR())){
					      tempStruct.setSTATUS(getDisplayName(COM_ODR_STS_TYP, tempStruct.getNUMBER_STATUS()));
						  }
				    }
						
						/** コンボボックスデータ取得用　発注発生処理区分 */
						if(null != tempStruct.getGNR() && "2".equals(tempStruct.getGNR())){
				      tempStruct.setGNR_TYP(getDisplayName(COM_PUCH_ODR_GNR_TYP, tempStruct.getNUMBER_GNR_TYP()));
				    }else{
				      tempStruct.setGNR_TYP(getDisplayName(COM_ODR_GNR_TYP, tempStruct.getNUMBER_GNR_TYP()));
				    }
											
					}
										
					//ヘッダ表示セット
					struct.setSCDL_RCV_TOTAL_FIX(scdlRcvTotalFix);
					struct.setSCDL_RCV_TOTAL_NOFIX(scdlRcvTotalNoFix);
					struct.setSCDL_ISSUE_TOTAL_FIX(scdlIssueTotalFix);
					struct.setSCDL_ISSUE_TOTAL_NOFIX(scdlIssueTotalNoFix);
					
					struct.setSCDL_ISSUE_TOTAL(Calculate.add(scdlIssueTotalFix, scdlIssueTotalNoFix));
					struct.setSCDL_RCV_TOTAL(Calculate.add(scdlRcvTotalFix, scdlRcvTotalNoFix));
						
					// 表示用リストにセット
					setList(tempList);
					
					//読込データをCSVリストに退避
					_csvList = tempList;						
				
			    }
			}
					
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			struct.seth_INSTALL_FLG("1");
		}
		
	}

	//受注データの並び順のため
	public class Sort implements Comparator{
		public int compare(Object o1,Object o2){
			int i  = 0;
			try{
				if (((AG0050010Struct)o1).getDELIVERY_DATE() == null || ((AG0050010Struct)o2).getDELIVERY_DATE() == null){
					i = 0;					
				}else if ((((AG0050010Struct)o1).getDELIVERY_DATE()).compareTo(((AG0050010Struct)o2).getDELIVERY_DATE())==0){
					i = 0;					
				}else if ((((AG0050010Struct)o1).getDELIVERY_DATE()).compareTo(((AG0050010Struct)o2).getDELIVERY_DATE()) < 0){
					i = -1;					
				}else{
					i = 1;					
				}
			}catch(Exception e){
		            e.printStackTrace();
			}
			return i;
		}
	}

		
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * 読込ボタン押下時に実行される処理です。
	 *
	 */
	public void controlselect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AG0050");
		logger.entering("AG0050010Control"+":USER="+struct.getsUser_ID(),"controlselect");
			//{{user_implement_dev:<controlselect>
		// ログ出力情報格納用
		String logMessage = "";
		List listMessage = new ArrayList();

		try {

			// キー項目ログ表示
			logMessage = "ITEM_CD:" + struct.getw_ITEM_CD()
					+ ", PLANT_CD:" + struct.getw_PLANT_CD();
			setSyslogConfig(logMessage);
			setReadStatus(INITIAL);
			
			// 自品目番号
			String SELF_ITEM_CD = struct.getw_ITEM_CD();
			String RDO_SELF_ITEM_CD = struct.getrdoItemCd();
			// 親品目番号
			String PARENT_ITEM_CD = struct.getw_PARENT_ITEM_CD();
			String RDO_PARENT_ITEM_CD = struct.getrdoParentItemCd();
			// 子品目番号
			String COMP_ITEM_CD = struct.getw_COMP_ITEM_CD();
			String RDO_COMP_ITEM_CD = struct.getrdoCompItemCd();
			// リストクリア
			if(list != null){
				list.clear();
			}
			struct.setw_PARENT_ITEM_NAME("");
			struct.setw_COMP_ITEM_NAME("");
			struct.setw_ITEM_NAME("");
			
			// エラーチェック
			// 工場コードが指定された場合
			if(struct.getw_PLANT_CD() != null && "".equals(struct.getw_PLANT_CD()) == false){
				// 工場コードの存在チェック
				List tmpList = entity.mcheckM_PLANT.read(conn, struct);
				if(tmpList.size() <= 0) {
					// 読込処理失敗：工場コードが存在しません
					struct.setw_PLANT_NAME("");
					logMessage = "M_PLANT.PLANT_CD:" + struct.getw_PLANT_CD();
					setErrorMessage("ZZ11001", logMessage);
					struct.copy(getKeyStruct());
					return;
				}
				else{
					AG0050010Struct tmpStruct = (AG0050010Struct)tmpList.get(0);
					struct.setw_PLANT_NAME(tmpStruct.getw_PLANT_NAME());
				}
			}
			// 品目番号の存在チェック
			if("true".equals(struct.getrdoParentItemCd())){
				List itemList = entity.mselect.read(conn, struct);
				if(itemList.size() <= 0) {
					// 読込処理失敗：品目番号が存在しません
					logMessage = "M_ITEM.ITEM_CD:" + struct.getw_ITEM_CD();
					setErrorMessage("ZZ11002", logMessage);
					struct.copy(getKeyStruct());
					return;
				}else{
					AG0050010Struct itemStruct = (AG0050010Struct)itemList.get(0);
					struct.setw_ITEM_NAME(itemStruct.getw_ITEM_NAME());
				}
				struct.setw_ITEM_CD(PARENT_ITEM_CD);
			}
			if("true".equals(struct.getrdoCompItemCd())){
				List itemList = entity.mselect.read(conn, struct);
				if(itemList.size() <= 0) {
					// 読込処理失敗：品目番号が存在しません
					logMessage = "M_ITEM.ITEM_CD:" + struct.getw_ITEM_CD();
					setErrorMessage("ZZ11002", logMessage);
					struct.copy(getKeyStruct());
					return;
				}else{
					AG0050010Struct itemStruct = (AG0050010Struct)itemList.get(0);
					struct.setw_ITEM_NAME(itemStruct.getw_ITEM_NAME());
				}
				struct.setw_ITEM_CD(COMP_ITEM_CD);
			}
			
			List workList = entity.mselect.read(conn, struct);
			if(workList.size() <= 0) {
				// 読込処理失敗：品目番号が存在しません
				logMessage = "M_ITEM.ITEM_CD:" + struct.getw_ITEM_CD();
				setErrorMessage("ZZ11002", logMessage);
				struct.copy(getKeyStruct());
				return;
			}
			
			// 製品構成マスタが存在チェック
			if("true".equals(struct.getrdoParentItemCd())){
			  AG0050010Struct m_psStruct = new AG0050010Struct();
			  m_psStruct.setw_PARENT_ITEM_CD(PARENT_ITEM_CD);
			  m_psStruct.setw_COMP_ITEM_CD(SELF_ITEM_CD);
			  boolean b = entity.mcheckM_PS.check(conn, m_psStruct);
			  if(!b){
				  // 読込処理失敗：製品構成マスタが存在しない
				  String logMessage1 = "M_PS.PARENT_ITEM_CD:" + PARENT_ITEM_CD;
				  String logMessage2 = "M_PS.COMP_ITEM_CD:" + SELF_ITEM_CD;
				  ExpjMessage emsg = new ExpjMessage( "AG00502" );
				  msgStruct.addError( emsg );
				  sysLog.warning(emsg, getsysUSER_CD());
				  emsg = new ExpjMessage( "ZZ01006", logMessage1 );
				  msgStruct.addError( emsg );
				  emsg = new ExpjMessage( "ZZ01006", logMessage2 );
				  msgStruct.addError( emsg );
				  sysLog.warning(emsg, getsysUSER_CD());
				  struct.copy(getKeyStruct());
				  return;
			  }
			}
			
			if("true".equals(struct.getrdoCompItemCd())){
			  AG0050010Struct m_psStruct = new AG0050010Struct();
			  m_psStruct.setw_PARENT_ITEM_CD(SELF_ITEM_CD);
			  m_psStruct.setw_COMP_ITEM_CD(COMP_ITEM_CD);
			  boolean b = entity.mcheckM_PS.check(conn, m_psStruct);
			  if(!b){
					// 読込処理失敗：製品構成マスタが存在しない
					String logMessage1 = "M_PS.PARENT_ITEM_CD:" + SELF_ITEM_CD;
					String logMessage2 = "M_PS.COMP_ITEM_CD:" + COMP_ITEM_CD;
					ExpjMessage emsg = new ExpjMessage( "AG00502" );
					msgStruct.addError( emsg );
					sysLog.warning(emsg, getsysUSER_CD());
					emsg = new ExpjMessage( "ZZ01006", logMessage1 );
					msgStruct.addError( emsg );
					emsg = new ExpjMessage( "ZZ01006", logMessage2 );
					msgStruct.addError( emsg );
					sysLog.warning(emsg, getsysUSER_CD());
					struct.copy(getKeyStruct());
					return;
			  }
			}
			
			// データ読込
			if(msgStruct.sizeError() <= 0){
				// 品目マスタ情報
				if(workList.size() > 0) {
					AG0050010Struct workStruct = (AG0050010Struct)workList.get(0);
					if("true".equals(struct.getrdoItemCd())){
					  struct.setw_ITEM_NAME(workStruct.getw_ITEM_NAME());
					}
					if("true".equals(struct.getrdoParentItemCd())){
					  struct.setw_PARENT_ITEM_NAME(workStruct.getw_ITEM_NAME());
					}
					if("true".equals(struct.getrdoCompItemCd())){
					  struct.setw_COMP_ITEM_NAME(workStruct.getw_ITEM_NAME());
					}
					struct.setSTOCK_UNIT(workStruct.getSTOCK_UNIT());
				}

				if(this.getEnvironment() == EXPLANNER_J){
					this.selectInExplannerJ(workList, listMessage);
				}
				if(this.getEnvironment() == EXPLANNER_JA){
					this.selectInExplannerJa(workList, listMessage);
				}
			}
			
			struct.setw_ITEM_CD(SELF_ITEM_CD);
			struct.setw_PARENT_ITEM_CD(PARENT_ITEM_CD);
			struct.setw_COMP_ITEM_CD(COMP_ITEM_CD);
			struct.setrdoItemCd(RDO_SELF_ITEM_CD);
			struct.setrdoParentItemCd(RDO_PARENT_ITEM_CD);
			struct.setrdoCompItemCd(RDO_COMP_ITEM_CD);

		}catch(SQLException e){
			setSqlExceptionMsg(e);
		}
                //}}user_implement_dev:<controlselect>
		logger.exiting("AG0050010Control"+":USER="+struct.getsUser_ID(),"controlselect");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlclear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AG0050");
		logger.entering("AG0050010Control"+":USER="+struct.getsUser_ID(),"controlclear");
			//{{user_implement_dev:<controlclear>
		//------------------------------------------------------------------

		// リストクリア
		if(list != null){
			list.clear();
		}
		else{
			list = new ArrayList(0);
		}
				
		// 初期化
		struct.clear();
		struct.initialize();
		_keyStruct = new AG0050010Struct();

//20150813 ADD START BY SYSCOM
		struct.seth_DM_CREATE_BASE_TBL(tempDM_CREATE_BASE_TBL);
//20150813 ADD END BY SYSCOM
				
		// 工場コードをデフォルト表示
		struct.setw_PLANT_CD(getsysPLANT_CD());
		// 会社コードをデフォルト表示
		struct.setCOMPANY_CD(getsysMY_COMPANY());
		if(this.getEnvironment() == EXPLANNER_JA){
			struct.seth_INSTALL_FLG("1");
		}
		
		//------------------------------------------------------------------
                //}}user_implement_dev:<controlclear>
		logger.exiting("AG0050010Control"+":USER="+struct.getsUser_ID(),"controlclear");

		return;
	}

	/**
	 * CSV出力ボタン押下時に実行される処理です。
	 *
	 */
	public void controlCsvOut() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AG0050");
		logger.entering("AG0050010Control"+":USER="+struct.getsUser_ID(),"controlCsvOut");
			//{{user_implement_dev:<controlCsvOut>
		List csvList = new ArrayList();
		
		if(this.getEnvironment() == EXPLANNER_J){
		      String[] title = {
		      	"Expj.Cmt0135" ,
		      	"Expj.Cmt3110" ,
		      	"Expj.DM_QTY" ,
		      	"Expj.Cmt3111" ,
		      	"Expj.Cmt3112" ,
		      	"Expj.Cmt3122" ,
		      	"Expj.STOCK_UNIT_1" ,
		      	"Expj.Cmt0721" ,
		      	"Expj.Cmt3114" ,
		      	"Expj.Cmt3118" ,
		      	"Expj.Cmt3119" ,
		      	"Expj.Cmt3115" ,
		      	"Expj.Cmt3116" ,
		      	"Expj.JOB_ODR_CD" ,
		      	"Expj.WH_CD" ,
		      	"Expj.WH_NAME" ,
		      	"Expj.Cmt3117" ,
		      	"Expj.JOB_ODR_CANCEL_NO" ,
		      	"Expj.CUST_CD" ,
		      	"Expj.CUST_NAME",
		      	"Expj.DLV_LOC_CD" ,
		      	"Expj.DESINATED_DLV_DATE",	// 指定納期
		      	"Expj.ODR_ACPT_DATE",		// 受注日
		      	"Expj.VEND_CD" ,
		      	"Expj.VEND_NAME",
		      	"Expj.Cmt3120" ,
		      	"Expj.Cmt3121" 

		      };
		      csvList.add(title);
		      for (Iterator i = _csvList.iterator(); i.hasNext();) {
		        AG0050010Struct csvStruct = (AG0050010Struct) i.next();
		        String[] csvStr = new String[title.length];
		        csvStr[0] = csvStruct.getDELIVERY_DATE();
		        csvStr[1] = NullToZero(csvStruct.getINSIDE_ODR_QTY());
		        csvStr[2] = NullToZero(csvStruct.getDEMAND_QTY());
		        csvStr[3] = NullToZero(csvStruct.getSTOCK_ODR_QTY());
		        csvStr[4] = csvStruct.getADD_SUBTRACT();
		        csvStr[5] = NullToZero(csvStruct.getEFFECT_STOCK_QTY());
		        csvStr[6] = csvStruct.getPURCHASE_UNIT();
		        csvStr[7] = csvStruct.getSTATUS();
		        csvStr[8] = csvStruct.getPARENT_ORDER_NO();
		        csvStr[9] = csvStruct.getPARENT_ORDER_ITEM_NO();
		        csvStr[10] = csvStruct.getPARENT_ORDER_ITEM_NAME();
		        csvStr[11] = csvStruct.getDEMAND_NO();
		        csvStr[12] = csvStruct.getORDER_NO();
		        csvStr[13] = csvStruct.getJOB_ODR_CD();
		        csvStr[14] = csvStruct.getWH_CD();
		        csvStr[15] = csvStruct.getWH_NAME();
		        csvStr[16] = csvStruct.getGNR_TYP();
		        csvStr[17] = csvStruct.getJOB_ODR_CANCEL_NO();
		        csvStr[18] = csvStruct.getCUST_CD();
		        csvStr[19] = csvStruct.getCUST_ANAME();
		        csvStr[20] = csvStruct.getDLV_LOC_CD();
		        csvStr[21] = csvStruct.getDESINATED_DLV_DATE();	// 指定納期
		        csvStr[22] = csvStruct.getODR_ACPT_DATE();		//　受注日
		        csvStr[23] = csvStruct.getVEND_CD();
		        csvStr[24] = csvStruct.getVEND_ANAME();
		        csvStr[25] = csvStruct.getODR_START_DATE();
		        csvStr[26] = csvStruct.getPUCH_ODR_START_DATE();
		      	
		        csvList.add(csvStr);
		      }
		}
		if(this.getEnvironment() == EXPLANNER_JA){
		      String[] title = {
		      	"Expj.Cmt0135" ,
		      	"Expj.Cmt3180" ,
		      	"Expj.DM_QTY" ,
		      	"Expj.Cmt3111" ,
		      	"Expj.Cmt3112" ,
		      	"Expj.Cmt3122" ,
		      	"Expj.STOCK_UNIT_1" ,
		      	"Expj.Cmt0721" ,
		      	"Expj.Cmt3114" ,
		      	"Expj.Cmt3118" ,
		      	"Expj.Cmt3119" ,
		      	"Expj.Cmt3115" ,
		      	"Expj.Cmt3116" ,
		      	"Expj.JOB_ODR_CD" ,
		      	"Expj.WH_CD" ,
		      	"Expj.WH_NAME" ,
		      	"Expj.Cmt3117" ,
		      	"Expj.JOB_ODR_CANCEL_NO" ,
		      	"Expj.CUST_CD" ,
		      	"Expj.CUST_NAME",
		      	"Expj.DLV_LOC_CD" ,
		      	"Expj.VEND_CD" ,
		      	"Expj.VEND_NAME" ,
		      	"Expj.Cmt3120" ,
		      	"Expj.Cmt3121" ,
		      	"Expj.Cmt3070" ,
		      	"Expj.Cmt3069" ,
//20150813 MOD START BY SYSCOM
//		      	"Expj.Cmt3179" 
		      	"Expj.Cmt3179" ,
		      	"Expj.ODR_DEPOT_CTL_NO",  //受注・デポ計画管理番号
		      	"Expj.CUST_ODR_NO",       //得意先注文番号
		      	"Expj.ODR_CHARACTERISTIC" //受注特性
//20150813 MOD END BY SYSCOM

		      };
		      csvList.add(title);
		      for (Iterator i = _csvList.iterator(); i.hasNext();) {
		        AG0050010Struct csvStruct = (AG0050010Struct) i.next();
		        String[] csvStr = new String[title.length];
		        csvStr[0] = csvStruct.getDELIVERY_DATE();
		        csvStr[1] = NullToZero(csvStruct.getINTEGRATE_ODR_QTY());
		        csvStr[2] = NullToZero(csvStruct.getDEMAND_QTY());
		        csvStr[3] = NullToZero(csvStruct.getSTOCK_ODR_QTY());
		        csvStr[4] = csvStruct.getADD_SUBTRACT();
		        csvStr[5] = NullToZero(csvStruct.getEFFECT_STOCK_QTY());
		        csvStr[6] = csvStruct.getPURCHASE_UNIT();
		        csvStr[7] = csvStruct.getSTATUS();
		        csvStr[8] = csvStruct.getPARENT_ORDER_NO();
		        csvStr[9] = csvStruct.getPARENT_ORDER_ITEM_NO();
		        csvStr[10] = csvStruct.getPARENT_ORDER_ITEM_NAME();
		        csvStr[11] = csvStruct.getDEMAND_NO();
		        csvStr[12] = csvStruct.getORDER_NO();
		        csvStr[13] = csvStruct.getJOB_ODR_CD();
		        csvStr[14] = csvStruct.getWH_CD();
		        csvStr[15] = csvStruct.getWH_NAME();
		        csvStr[16] = csvStruct.getGNR_TYP();
		        csvStr[17] = csvStruct.getJOB_ODR_CANCEL_NO();
		        csvStr[18] = csvStruct.getCUST_CD();
		        csvStr[19] = csvStruct.getCUST_ANAME();
		        csvStr[20] = csvStruct.getDLV_LOC_CD();
		        csvStr[21] = csvStruct.getVEND_CD();
		        csvStr[22] = csvStruct.getVEND_ANAME();
		        csvStr[23] = csvStruct.getODR_START_DATE();
		        csvStr[24] = csvStruct.getPUCH_ODR_START_DATE();
		        csvStr[25] = NullToZero(csvStruct.getFIX_ODR_QTY());
		        csvStr[26] = NullToZero(csvStruct.getUNOFFICIAL_ODR_QTY());
		        csvStr[27] = NullToZero(csvStruct.getDEPOT_QTY());
//20150813 ADD START BY SYSCOM
		      	csvStr[28] = csvStruct.getODR_DEPOT_CTL_NO();
		      	csvStr[29] = csvStruct.getCUST_ODR_NO();
		      	csvStr[30] = csvStruct.getODR_CHARACTERISTIC();
//20150813 ADD END BY SYSCOM
	
		        csvList.add(csvStr);
		      }
		}
		      
	      if (csvList != null && !csvList.isEmpty()) {
	        // CsvWriterを生成
	        csvWriter = new CsvWriter(CsvWriter.getFileName(sysUSER_CD));
	        csvWriter.write(csvList, CoreTools.getLocale(struct.getsUser_ID()),true);
	        struct.setDOWNLOAD_FILE(csvWriter.getFilePath());
	      }

                //}}user_implement_dev:<controlCsvOut>
		logger.exiting("AG0050010Control"+":USER="+struct.getsUser_ID(),"controlCsvOut");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AG0050");
		logger.entering("AG0050010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
		//------------------------------------------------------------------
		// ユーザ定義初期化
		usersInitialize();
		try {
			struct.setu_OPTION_ID("JA*");
			List tempList = entity.mgetSYS_INSTALL_OPTIONS.read(conn, struct);
			AG0050010Struct tempStruct = new AG0050010Struct();
			if(tempList != null && tempList.size()>0){
				tempStruct = (AG0050010Struct)tempList.get(0);
				struct.seth_INSTALL_FLG(tempStruct.geth_INSTALL_FLG());
			}
			if("1".equals(struct.geth_INSTALL_FLG())){
				this.setEnvironment(EXPLANNER_JA);
			}else{
				this.setEnvironment(EXPLANNER_J);
			}
			
//20150813 ADD START BY SYSCOM
			// Explanner/Ja環境の場合、受注デマンド作成基テーブル取得
			if(this.getEnvironment() == EXPLANNER_JA){
				List baseTblList = entity.mgetDM_CREATE_BASE_TBL.read(conn, struct);
				AG0050010Struct baseTblStruct = new AG0050010Struct();
				if(baseTblList != null && baseTblList.size()>0){
					baseTblStruct = (AG0050010Struct)baseTblList.get(0);
					struct.seth_DM_CREATE_BASE_TBL(baseTblStruct.getw_DM_CREATE_BASE_TBL());
					
					if(!"1".equals(struct.geth_DM_CREATE_BASE_TBL()) && !"2".equals(struct.geth_DM_CREATE_BASE_TBL())){
						// 取得値が1(統合受注)、2(統合受注ワーク)以外の場合、致命的エラー
						setFatalMessage("KQ22019");
					}
				}
				else
				{
					// 取得できない場合、致命的エラー
					setFatalMessage("KQ22019");
				}
			}
			tempDM_CREATE_BASE_TBL = struct.geth_DM_CREATE_BASE_TBL();
//20150813 ADD END BY SYSCOM
		} catch (SQLException e) {
			e.printStackTrace();
//20150813 DEL START BY SYSCOM
//		} catch (Exception e){
//			e.printStackTrace();
//20150813 DEL END BY SYSCOM
		}
		//------------------------------------------------------------------
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AG0050010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AG0050");
		logger.entering("AG0050010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
		//------------------------------------------------------------------
		// ユーザ定義初期化
		usersInitialize();

		try {
			struct.setu_OPTION_ID("JA*");
			List tempList = entity.mgetSYS_INSTALL_OPTIONS.read(conn, struct);
			AG0050010Struct tempStruct = new AG0050010Struct();
			if(tempList != null && tempList.size()>0){
				tempStruct = (AG0050010Struct)tempList.get(0);
				struct.seth_INSTALL_FLG(tempStruct.geth_INSTALL_FLG());
			}
			if("1".equals(struct.geth_INSTALL_FLG())){
				this.setEnvironment(EXPLANNER_JA);
			}else{
				this.setEnvironment(EXPLANNER_J);
			}
			//自社情報
			SysMyCompany = SystemInformation.getSysMyCompanyCd();
			if(SysMyCompany==null||SysMyCompany.length()==0){
				ExpjMessage emsg = new ExpjMessage("KQ00039");
				msgStruct.addError(emsg);
				sysLog.warning(emsg, sysUSER_CD);
			}
			struct.setCOMPANY_CD(getsysMY_COMPANY());
		} catch (SQLException e) {
			e.printStackTrace();
//20150813 DEL START BY SYSCOM	
//		} catch (Exception e){
//			e.printStackTrace();
//20150813 DEL END BY SYSCOM	
		}
		
		if (isScreenMove() == true) {
			// 初期化
			struct.clear();
			struct.initialize();
			_keyStruct = new AG0050010Struct();
			struct.setw_ITEM_CD(itemCd);
			struct.setw_PLANT_CD(plantCd);
			struct.setrdoItemCd("true");
			controlselect();
		} else {
			// 工場コードをデフォルト表示
			struct.setw_PLANT_CD(getsysPLANT_CD());
		}
		
		//------------------------------------------------------------------
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AG0050010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * イベントハンドラの前処理です。
	 *
	 * @param buttun ボタン名
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AG0050");
		logger.entering("AG0050010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");
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
			// コンボボックス部品のデータのセットはここに記述してください。
			// コンボボックスデータ用意
			try{
				ComboBox comboController = new ComboBox(conn, sysUSER_CD);
				// コンプボックスの内容多言語対応
				COM_ODR_STATUS = comboController.getData(ODR_STATUS_PARAMETER_NAME);
				COM_ODR_STS_TYP = comboController.getData(ODR_STS_TYP_PARAMETER_NAME);
				COM_ODR_GNR_TYP = comboController.getData(ODR_GNR_TYP_PARAMETER_NAME);
				COM_PUCH_ODR_GNR_TYP = comboController.getData(PUCH_ODR_GNR_TYP_PARAMETER_NAME);
			} catch (SQLException e) {
				e.printStackTrace();
				ExpjMessage emsg = new ExpjMessage("ZZ01106");
				sysLog.severe(emsg, getsysUSER_CD());//致命的エラー エラー内容
				ExpjException ee = new ExpjException(e, emsg); // エクセプションを生成
				throw ee;
			}
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("AG0050010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			if( button.equals("select") ) {
				controlselect();
			} else if( button.equals("clear") ) {
				controlclear();
			} else if( button.equals("CsvOut") ) {
				controlCsvOut();
			} else if( button.equals("initial") ) {
				controlINITIAL();
			} else if( button.equals("reload") ) {
				controlRELOAD();
			}
		//{{user_implement_dev:<control_eventHandller>
		//------------------------------------------------------------------

//		ソース内にまだAlarmMessageExceptionが残っている場合は、以下の行のコメントを外してAlarmMessageExceptionを始末する。
//		} catch(AlarmMessageException ame){
//			ExpjException ee = new ExpjException(ame, (ExpjMessageList)((Object)ame.getMessages()));
//			throw ee;
		//------------------------------------------------------------------
                //}}user_implement_dev:<control_eventHandller>
		} catch( BusinessLockException ble ) {
			// 枠メッセージ出力依頼作成
			setNewDataFlg(false);
		} catch( ResourceBusyException rbe ) {
			ExpjException ee = new ExpjException(rbe, "ZZ01105");
			throw ee;
		} catch( FoundationException e ) {
//			e.printStackTrace();
//			throw new FoundationException("AG0050010Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
                //}}user_implement_dev:<createDefaultCSV>
		} catch( FoundationException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AG0050010-E999","CSVの出力処理"));
			throw new FoundationException("AG0050010Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AG0050010-E999","システム日付の取得処理"));
				throw new FoundationException("AG0050010Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AG0050010-E999","コントロールのイベント処理"));
			throw new FoundationException("AG0050010Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected AG0050010Entity entity;
	protected AG0050010Struct struct;
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

		entity = new AG0050010Entity();
		struct = new AG0050010Struct();

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
	 * AG0050010クラスの標準コンストラクタ
	 */
	public AG0050010Control() throws BusinessProcessException, FoundationException
	{
		initialize();

		//conn = connect();
		//{{user_implement_code_constractor
		//------------------------------------------------------------------
		list = new ArrayList(0);
        //------------------------------------------------------------------
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
				AG0050010Struct key = (AG0050010Struct)keyList.get(j);
				// メッセージキーを作成する
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("STOCK_UNIT_3") && key.getSTOCK_UNIT_3() != null) {
					msgKey.setKeyValue("STOCK_UNIT_3", key.getSTOCK_UNIT_3());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT_1") && key.getSTOCK_UNIT_1() != null) {
					msgKey.setKeyValue("STOCK_UNIT_1", key.getSTOCK_UNIT_1());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT_4") && key.getSTOCK_UNIT_4() != null) {
					msgKey.setKeyValue("STOCK_UNIT_4", key.getSTOCK_UNIT_4());
				}
				if(msgKeyType.containsKeyColumn("SCDL_ISSUE_TOTAL") && key.getSCDL_ISSUE_TOTAL() != null) {
					msgKey.setKeyValue("SCDL_ISSUE_TOTAL", key.getSCDL_ISSUE_TOTAL());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT_2") && key.getSTOCK_UNIT_2() != null) {
					msgKey.setKeyValue("STOCK_UNIT_2", key.getSTOCK_UNIT_2());
				}
				if(msgKeyType.containsKeyColumn("SCDL_RCV_TOTAL") && key.getSCDL_RCV_TOTAL() != null) {
					msgKey.setKeyValue("SCDL_RCV_TOTAL", key.getSCDL_RCV_TOTAL());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT_5") && key.getSTOCK_UNIT_5() != null) {
					msgKey.setKeyValue("STOCK_UNIT_5", key.getSTOCK_UNIT_5());
				}
				if(msgKeyType.containsKeyColumn("rdoItemCd") && key.getrdoItemCd() != null) {
					msgKey.setKeyValue("rdoItemCd", key.getrdoItemCd());
				}
				if(msgKeyType.containsKeyColumn("rdoParentItemCd") && key.getrdoParentItemCd() != null) {
					msgKey.setKeyValue("rdoParentItemCd", key.getrdoParentItemCd());
				}
				if(msgKeyType.containsKeyColumn("rdoCompItemCd") && key.getrdoCompItemCd() != null) {
					msgKey.setKeyValue("rdoCompItemCd", key.getrdoCompItemCd());
				}
				if(msgKeyType.containsKeyColumn("w_PARENT_ITEM_NAME") && key.getw_PARENT_ITEM_NAME() != null) {
					msgKey.setKeyValue("w_PARENT_ITEM_NAME", key.getw_PARENT_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("w_COMP_ITEM_NAME") && key.getw_COMP_ITEM_NAME() != null) {
					msgKey.setKeyValue("w_COMP_ITEM_NAME", key.getw_COMP_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("checkMrpFlg") && key.getcheckMrpFlg() != null) {
					msgKey.setKeyValue("checkMrpFlg", key.getcheckMrpFlg());
				}
				if(msgKeyType.containsKeyColumn("checkProdPlan") && key.getcheckProdPlan() != null) {
					msgKey.setKeyValue("checkProdPlan", key.getcheckProdPlan());
				}
				if(msgKeyType.containsKeyColumn("checkUncnfm") && key.getcheckUncnfm() != null) {
					msgKey.setKeyValue("checkUncnfm", key.getcheckUncnfm());
				}
				if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE") && key.getDOWNLOAD_FILE() != null) {
					msgKey.setKeyValue("DOWNLOAD_FILE", key.getDOWNLOAD_FILE());
				}
				if(msgKeyType.containsKeyColumn("checkQty") && key.getcheckQty() != null) {
					msgKey.setKeyValue("checkQty", key.getcheckQty());
				}
				if(msgKeyType.containsKeyColumn("h_DM_CREATE_BASE_TBL") && key.geth_DM_CREATE_BASE_TBL() != null) {
					msgKey.setKeyValue("h_DM_CREATE_BASE_TBL", key.geth_DM_CREATE_BASE_TBL());
				}
				if(msgKeyType.containsKeyColumn("u_OPTION_ID") && key.getu_OPTION_ID() != null) {
					msgKey.setKeyValue("u_OPTION_ID", key.getu_OPTION_ID());
				}
				if(msgKeyType.containsKeyColumn("w_ITEM_NAME") && key.getw_ITEM_NAME() != null) {
					msgKey.setKeyValue("w_ITEM_NAME", key.getw_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT") && key.getSTOCK_UNIT() != null) {
					msgKey.setKeyValue("STOCK_UNIT", key.getSTOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("w_ITEM_CD") && key.getw_ITEM_CD() != null) {
					msgKey.setKeyValue("w_ITEM_CD", key.getw_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("w_PLANT_NAME") && key.getw_PLANT_NAME() != null) {
					msgKey.setKeyValue("w_PLANT_NAME", key.getw_PLANT_NAME());
				}
				if(msgKeyType.containsKeyColumn("w_PLANT_CD") && key.getw_PLANT_CD() != null) {
					msgKey.setKeyValue("w_PLANT_CD", key.getw_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("SCDL_ISSUE_TOTAL_FIX") && key.getSCDL_ISSUE_TOTAL_FIX() != null) {
					msgKey.setKeyValue("SCDL_ISSUE_TOTAL_FIX", key.getSCDL_ISSUE_TOTAL_FIX());
				}
				if(msgKeyType.containsKeyColumn("SCDL_ISSUE_TOTAL_NOFIX") && key.getSCDL_ISSUE_TOTAL_NOFIX() != null) {
					msgKey.setKeyValue("SCDL_ISSUE_TOTAL_NOFIX", key.getSCDL_ISSUE_TOTAL_NOFIX());
				}
				if(msgKeyType.containsKeyColumn("SCDL_RCV_TOTAL_FIX") && key.getSCDL_RCV_TOTAL_FIX() != null) {
					msgKey.setKeyValue("SCDL_RCV_TOTAL_FIX", key.getSCDL_RCV_TOTAL_FIX());
				}
				if(msgKeyType.containsKeyColumn("SCDL_RCV_TOTAL_NOFIX") && key.getSCDL_RCV_TOTAL_NOFIX() != null) {
					msgKey.setKeyValue("SCDL_RCV_TOTAL_NOFIX", key.getSCDL_RCV_TOTAL_NOFIX());
				}
				if(msgKeyType.containsKeyColumn("SORT_NO") && key.getSORT_NO() != null) {
					msgKey.setKeyValue("SORT_NO", key.getSORT_NO());
				}
				if(msgKeyType.containsKeyColumn("DELIVERY_DATE") && key.getDELIVERY_DATE() != null) {
					msgKey.setKeyValue("DELIVERY_DATE", key.getDELIVERY_DATE());
				}
				if(msgKeyType.containsKeyColumn("INSIDE_ODR_QTY") && key.getINSIDE_ODR_QTY() != null) {
					msgKey.setKeyValue("INSIDE_ODR_QTY", key.getINSIDE_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("INTEGRATE_ODR_QTY") && key.getINTEGRATE_ODR_QTY() != null) {
					msgKey.setKeyValue("INTEGRATE_ODR_QTY", key.getINTEGRATE_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("DEMAND_QTY") && key.getDEMAND_QTY() != null) {
					msgKey.setKeyValue("DEMAND_QTY", key.getDEMAND_QTY());
				}
				if(msgKeyType.containsKeyColumn("STOCK_ODR_QTY") && key.getSTOCK_ODR_QTY() != null) {
					msgKey.setKeyValue("STOCK_ODR_QTY", key.getSTOCK_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("ADD_SUBTRACT") && key.getADD_SUBTRACT() != null) {
					msgKey.setKeyValue("ADD_SUBTRACT", key.getADD_SUBTRACT());
				}
				if(msgKeyType.containsKeyColumn("EFFECT_STOCK_QTY") && key.getEFFECT_STOCK_QTY() != null) {
					msgKey.setKeyValue("EFFECT_STOCK_QTY", key.getEFFECT_STOCK_QTY());
				}
				if(msgKeyType.containsKeyColumn("PURCHASE_UNIT") && key.getPURCHASE_UNIT() != null) {
					msgKey.setKeyValue("PURCHASE_UNIT", key.getPURCHASE_UNIT());
				}
				if(msgKeyType.containsKeyColumn("NUMBER_STATUS") && key.getNUMBER_STATUS() != null) {
					msgKey.setKeyValue("NUMBER_STATUS", key.getNUMBER_STATUS());
				}
				if(msgKeyType.containsKeyColumn("STATUS") && key.getSTATUS() != null) {
					msgKey.setKeyValue("STATUS", key.getSTATUS());
				}
				if(msgKeyType.containsKeyColumn("WORK_ODR_CD") && key.getWORK_ODR_CD() != null) {
					msgKey.setKeyValue("WORK_ODR_CD", key.getWORK_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("PARENT_ORDER_NO") && key.getPARENT_ORDER_NO() != null) {
					msgKey.setKeyValue("PARENT_ORDER_NO", key.getPARENT_ORDER_NO());
				}
				if(msgKeyType.containsKeyColumn("PARENT_ORDER_ITEM_NO") && key.getPARENT_ORDER_ITEM_NO() != null) {
					msgKey.setKeyValue("PARENT_ORDER_ITEM_NO", key.getPARENT_ORDER_ITEM_NO());
				}
				if(msgKeyType.containsKeyColumn("PARENT_ORDER_ITEM_NAME") && key.getPARENT_ORDER_ITEM_NAME() != null) {
					msgKey.setKeyValue("PARENT_ORDER_ITEM_NAME", key.getPARENT_ORDER_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("DEMAND_NO") && key.getDEMAND_NO() != null) {
					msgKey.setKeyValue("DEMAND_NO", key.getDEMAND_NO());
				}
				if(msgKeyType.containsKeyColumn("ORDER_NO") && key.getORDER_NO() != null) {
					msgKey.setKeyValue("ORDER_NO", key.getORDER_NO());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_CD") && key.getJOB_ODR_CD() != null) {
					msgKey.setKeyValue("JOB_ODR_CD", key.getJOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("WH_CD") && key.getWH_CD() != null) {
					msgKey.setKeyValue("WH_CD", key.getWH_CD());
				}
				if(msgKeyType.containsKeyColumn("WH_NAME") && key.getWH_NAME() != null) {
					msgKey.setKeyValue("WH_NAME", key.getWH_NAME());
				}
				if(msgKeyType.containsKeyColumn("GNR") && key.getGNR() != null) {
					msgKey.setKeyValue("GNR", key.getGNR());
				}
				if(msgKeyType.containsKeyColumn("NUMBER_GNR_TYP") && key.getNUMBER_GNR_TYP() != null) {
					msgKey.setKeyValue("NUMBER_GNR_TYP", key.getNUMBER_GNR_TYP());
				}
				if(msgKeyType.containsKeyColumn("GNR_TYP") && key.getGNR_TYP() != null) {
					msgKey.setKeyValue("GNR_TYP", key.getGNR_TYP());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_CANCEL_NO") && key.getJOB_ODR_CANCEL_NO() != null) {
					msgKey.setKeyValue("JOB_ODR_CANCEL_NO", key.getJOB_ODR_CANCEL_NO());
				}
				if(msgKeyType.containsKeyColumn("w_PKG_UNIT_QTY") && key.getw_PKG_UNIT_QTY() != null) {
					msgKey.setKeyValue("w_PKG_UNIT_QTY", key.getw_PKG_UNIT_QTY());
				}
				if(msgKeyType.containsKeyColumn("w_UNIT_QTY_TYP") && key.getw_UNIT_QTY_TYP() != null) {
					msgKey.setKeyValue("w_UNIT_QTY_TYP", key.getw_UNIT_QTY_TYP());
				}
				if(msgKeyType.containsKeyColumn("CUST_CD") && key.getCUST_CD() != null) {
					msgKey.setKeyValue("CUST_CD", key.getCUST_CD());
				}
				if(msgKeyType.containsKeyColumn("DLV_LOC_CD") && key.getDLV_LOC_CD() != null) {
					msgKey.setKeyValue("DLV_LOC_CD", key.getDLV_LOC_CD());
				}
				if(msgKeyType.containsKeyColumn("DESINATED_DLV_DATE") && key.getDESINATED_DLV_DATE() != null) {
					msgKey.setKeyValue("DESINATED_DLV_DATE", key.getDESINATED_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("ODR_ACPT_DATE") && key.getODR_ACPT_DATE() != null) {
					msgKey.setKeyValue("ODR_ACPT_DATE", key.getODR_ACPT_DATE());
				}
				if(msgKeyType.containsKeyColumn("VEND_CD") && key.getVEND_CD() != null) {
					msgKey.setKeyValue("VEND_CD", key.getVEND_CD());
				}
				if(msgKeyType.containsKeyColumn("ODR_START_DATE") && key.getODR_START_DATE() != null) {
					msgKey.setKeyValue("ODR_START_DATE", key.getODR_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_START_DATE") && key.getPUCH_ODR_START_DATE() != null) {
					msgKey.setKeyValue("PUCH_ODR_START_DATE", key.getPUCH_ODR_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("M_WH_PLANT_CD") && key.getM_WH_PLANT_CD() != null) {
					msgKey.setKeyValue("M_WH_PLANT_CD", key.getM_WH_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("TRANSPORT_LT") && key.getTRANSPORT_LT() != null) {
					msgKey.setKeyValue("TRANSPORT_LT", key.getTRANSPORT_LT());
				}
				if(msgKeyType.containsKeyColumn("FIX_ODR_QTY") && key.getFIX_ODR_QTY() != null) {
					msgKey.setKeyValue("FIX_ODR_QTY", key.getFIX_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("UNOFFICIAL_ODR_QTY") && key.getUNOFFICIAL_ODR_QTY() != null) {
					msgKey.setKeyValue("UNOFFICIAL_ODR_QTY", key.getUNOFFICIAL_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("DEPOT_QTY") && key.getDEPOT_QTY() != null) {
					msgKey.setKeyValue("DEPOT_QTY", key.getDEPOT_QTY());
				}
				if(msgKeyType.containsKeyColumn("CUST_ANAME") && key.getCUST_ANAME() != null) {
					msgKey.setKeyValue("CUST_ANAME", key.getCUST_ANAME());
				}
				if(msgKeyType.containsKeyColumn("VEND_ANAME") && key.getVEND_ANAME() != null) {
					msgKey.setKeyValue("VEND_ANAME", key.getVEND_ANAME());
				}
				if(msgKeyType.containsKeyColumn("ODR_DEPOT_CTL_NO") && key.getODR_DEPOT_CTL_NO() != null) {
					msgKey.setKeyValue("ODR_DEPOT_CTL_NO", key.getODR_DEPOT_CTL_NO());
				}
				if(msgKeyType.containsKeyColumn("CUST_ODR_NO") && key.getCUST_ODR_NO() != null) {
					msgKey.setKeyValue("CUST_ODR_NO", key.getCUST_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("ODR_CHARACTERISTIC") && key.getODR_CHARACTERISTIC() != null) {
					msgKey.setKeyValue("ODR_CHARACTERISTIC", key.getODR_CHARACTERISTIC());
				}
				if(msgKeyType.containsKeyColumn("w_MRP_FLG") && key.getw_MRP_FLG() != null) {
					msgKey.setKeyValue("w_MRP_FLG", key.getw_MRP_FLG());
				}
				if(msgKeyType.containsKeyColumn("w_ENV_FLG") && key.getw_ENV_FLG() != null) {
					msgKey.setKeyValue("w_ENV_FLG", key.getw_ENV_FLG());
				}
				if(msgKeyType.containsKeyColumn("COMPANY_CD") && key.getCOMPANY_CD() != null) {
					msgKey.setKeyValue("COMPANY_CD", key.getCOMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("w_CHECK_FLG") && key.getw_CHECK_FLG() != null) {
					msgKey.setKeyValue("w_CHECK_FLG", key.getw_CHECK_FLG());
				}
				if(msgKeyType.containsKeyColumn("w_QTY_FLG") && key.getw_QTY_FLG() != null) {
					msgKey.setKeyValue("w_QTY_FLG", key.getw_QTY_FLG());
				}
				if(msgKeyType.containsKeyColumn("w_LOG_MODE_TYP") && key.getw_LOG_MODE_TYP() != null) {
					msgKey.setKeyValue("w_LOG_MODE_TYP", key.getw_LOG_MODE_TYP());
				}
				if(msgKeyType.containsKeyColumn("w_OUTPUT_MODE_TYP") && key.getw_OUTPUT_MODE_TYP() != null) {
					msgKey.setKeyValue("w_OUTPUT_MODE_TYP", key.getw_OUTPUT_MODE_TYP());
				}
				if(msgKeyType.containsKeyColumn("w_PROGRAM_CD") && key.getw_PROGRAM_CD() != null) {
					msgKey.setKeyValue("w_PROGRAM_CD", key.getw_PROGRAM_CD());
				}
				if(msgKeyType.containsKeyColumn("w_FUNCTION_NAME") && key.getw_FUNCTION_NAME() != null) {
					msgKey.setKeyValue("w_FUNCTION_NAME", key.getw_FUNCTION_NAME());
				}
				if(msgKeyType.containsKeyColumn("w_SHIP_LT") && key.getw_SHIP_LT() != null) {
					msgKey.setKeyValue("w_SHIP_LT", key.getw_SHIP_LT());
				}
				if(msgKeyType.containsKeyColumn("w_CLASS_CODE") && key.getw_CLASS_CODE() != null) {
					msgKey.setKeyValue("w_CLASS_CODE", key.getw_CLASS_CODE());
				}
				if(msgKeyType.containsKeyColumn("w_PARENT_ITEM_CD") && key.getw_PARENT_ITEM_CD() != null) {
					msgKey.setKeyValue("w_PARENT_ITEM_CD", key.getw_PARENT_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("w_COMP_ITEM_CD") && key.getw_COMP_ITEM_CD() != null) {
					msgKey.setKeyValue("w_COMP_ITEM_CD", key.getw_COMP_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("ODR_CD") && key.getODR_CD() != null) {
					msgKey.setKeyValue("ODR_CD", key.getODR_CD());
				}
				if(msgKeyType.containsKeyColumn("h_INSTALL_FLG") && key.geth_INSTALL_FLG() != null) {
					msgKey.setKeyValue("h_INSTALL_FLG", key.geth_INSTALL_FLG());
				}
				if(msgKeyType.containsKeyColumn("OD_NO") && key.getOD_NO() != null) {
					msgKey.setKeyValue("OD_NO", key.getOD_NO());
				}
				if(msgKeyType.containsKeyColumn("INTEGRATE_ODR_QTY_ZH") && key.getINTEGRATE_ODR_QTY_ZH() != null) {
					msgKey.setKeyValue("INTEGRATE_ODR_QTY_ZH", key.getINTEGRATE_ODR_QTY_ZH());
				}
				if(msgKeyType.containsKeyColumn("DEPOT_CTL_NO") && key.getDEPOT_CTL_NO() != null) {
					msgKey.setKeyValue("DEPOT_CTL_NO", key.getDEPOT_CTL_NO());
				}
				if(msgKeyType.containsKeyColumn("w_UNCONFIRM_FLG") && key.getw_UNCONFIRM_FLG() != null) {
					msgKey.setKeyValue("w_UNCONFIRM_FLG", key.getw_UNCONFIRM_FLG());
				}
				if(msgKeyType.containsKeyColumn("l_COUNT") && key.getl_COUNT() != null) {
					msgKey.setKeyValue("l_COUNT", key.getl_COUNT());
				}
				if(msgKeyType.containsKeyColumn("ROW_COUNT") && key.getROW_COUNT() != null) {
					msgKey.setKeyValue("ROW_COUNT", key.getROW_COUNT());
				}
				if(msgKeyType.containsKeyColumn("w_DM_CREATE_BASE_TBL") && key.getw_DM_CREATE_BASE_TBL() != null) {
					msgKey.setKeyValue("w_DM_CREATE_BASE_TBL", key.getw_DM_CREATE_BASE_TBL());
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
					AG0050010Struct key = new AG0050010Struct();
					if(msgKeyType.containsKeyColumn("STOCK_UNIT_3")) {
						key.setSTOCK_UNIT_3(msgKey.getKeyValue("STOCK_UNIT_3"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT_1")) {
						key.setSTOCK_UNIT_1(msgKey.getKeyValue("STOCK_UNIT_1"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT_4")) {
						key.setSTOCK_UNIT_4(msgKey.getKeyValue("STOCK_UNIT_4"));
					}
					if(msgKeyType.containsKeyColumn("SCDL_ISSUE_TOTAL")) {
						key.setSCDL_ISSUE_TOTAL(msgKey.getKeyValue("SCDL_ISSUE_TOTAL"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT_2")) {
						key.setSTOCK_UNIT_2(msgKey.getKeyValue("STOCK_UNIT_2"));
					}
					if(msgKeyType.containsKeyColumn("SCDL_RCV_TOTAL")) {
						key.setSCDL_RCV_TOTAL(msgKey.getKeyValue("SCDL_RCV_TOTAL"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT_5")) {
						key.setSTOCK_UNIT_5(msgKey.getKeyValue("STOCK_UNIT_5"));
					}
					if(msgKeyType.containsKeyColumn("rdoItemCd")) {
						key.setrdoItemCd(msgKey.getKeyValue("rdoItemCd"));
					}
					if(msgKeyType.containsKeyColumn("rdoParentItemCd")) {
						key.setrdoParentItemCd(msgKey.getKeyValue("rdoParentItemCd"));
					}
					if(msgKeyType.containsKeyColumn("rdoCompItemCd")) {
						key.setrdoCompItemCd(msgKey.getKeyValue("rdoCompItemCd"));
					}
					if(msgKeyType.containsKeyColumn("w_PARENT_ITEM_NAME")) {
						key.setw_PARENT_ITEM_NAME(msgKey.getKeyValue("w_PARENT_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("w_COMP_ITEM_NAME")) {
						key.setw_COMP_ITEM_NAME(msgKey.getKeyValue("w_COMP_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("checkMrpFlg")) {
						key.setcheckMrpFlg(msgKey.getKeyValue("checkMrpFlg"));
					}
					if(msgKeyType.containsKeyColumn("checkProdPlan")) {
						key.setcheckProdPlan(msgKey.getKeyValue("checkProdPlan"));
					}
					if(msgKeyType.containsKeyColumn("checkUncnfm")) {
						key.setcheckUncnfm(msgKey.getKeyValue("checkUncnfm"));
					}
					if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE")) {
						key.setDOWNLOAD_FILE(msgKey.getKeyValue("DOWNLOAD_FILE"));
					}
					if(msgKeyType.containsKeyColumn("checkQty")) {
						key.setcheckQty(msgKey.getKeyValue("checkQty"));
					}
					if(msgKeyType.containsKeyColumn("h_DM_CREATE_BASE_TBL")) {
						key.seth_DM_CREATE_BASE_TBL(msgKey.getKeyValue("h_DM_CREATE_BASE_TBL"));
					}
					if(msgKeyType.containsKeyColumn("u_OPTION_ID")) {
						key.setu_OPTION_ID(msgKey.getKeyValue("u_OPTION_ID"));
					}
					if(msgKeyType.containsKeyColumn("w_ITEM_NAME")) {
						key.setw_ITEM_NAME(msgKey.getKeyValue("w_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT")) {
						key.setSTOCK_UNIT(msgKey.getKeyValue("STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("w_ITEM_CD")) {
						key.setw_ITEM_CD(msgKey.getKeyValue("w_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_PLANT_NAME")) {
						key.setw_PLANT_NAME(msgKey.getKeyValue("w_PLANT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("w_PLANT_CD")) {
						key.setw_PLANT_CD(msgKey.getKeyValue("w_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("SCDL_ISSUE_TOTAL_FIX")) {
						key.setSCDL_ISSUE_TOTAL_FIX(msgKey.getKeyValue("SCDL_ISSUE_TOTAL_FIX"));
					}
					if(msgKeyType.containsKeyColumn("SCDL_ISSUE_TOTAL_NOFIX")) {
						key.setSCDL_ISSUE_TOTAL_NOFIX(msgKey.getKeyValue("SCDL_ISSUE_TOTAL_NOFIX"));
					}
					if(msgKeyType.containsKeyColumn("SCDL_RCV_TOTAL_FIX")) {
						key.setSCDL_RCV_TOTAL_FIX(msgKey.getKeyValue("SCDL_RCV_TOTAL_FIX"));
					}
					if(msgKeyType.containsKeyColumn("SCDL_RCV_TOTAL_NOFIX")) {
						key.setSCDL_RCV_TOTAL_NOFIX(msgKey.getKeyValue("SCDL_RCV_TOTAL_NOFIX"));
					}
					if(msgKeyType.containsKeyColumn("SORT_NO")) {
						key.setSORT_NO(msgKey.getKeyValue("SORT_NO"));
					}
					if(msgKeyType.containsKeyColumn("DELIVERY_DATE")) {
						key.setDELIVERY_DATE(msgKey.getKeyValue("DELIVERY_DATE"));
					}
					if(msgKeyType.containsKeyColumn("INSIDE_ODR_QTY")) {
						key.setINSIDE_ODR_QTY(msgKey.getKeyValue("INSIDE_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("INTEGRATE_ODR_QTY")) {
						key.setINTEGRATE_ODR_QTY(msgKey.getKeyValue("INTEGRATE_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("DEMAND_QTY")) {
						key.setDEMAND_QTY(msgKey.getKeyValue("DEMAND_QTY"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_ODR_QTY")) {
						key.setSTOCK_ODR_QTY(msgKey.getKeyValue("STOCK_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("ADD_SUBTRACT")) {
						key.setADD_SUBTRACT(msgKey.getKeyValue("ADD_SUBTRACT"));
					}
					if(msgKeyType.containsKeyColumn("EFFECT_STOCK_QTY")) {
						key.setEFFECT_STOCK_QTY(msgKey.getKeyValue("EFFECT_STOCK_QTY"));
					}
					if(msgKeyType.containsKeyColumn("PURCHASE_UNIT")) {
						key.setPURCHASE_UNIT(msgKey.getKeyValue("PURCHASE_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("NUMBER_STATUS")) {
						key.setNUMBER_STATUS(msgKey.getKeyValue("NUMBER_STATUS"));
					}
					if(msgKeyType.containsKeyColumn("STATUS")) {
						key.setSTATUS(msgKey.getKeyValue("STATUS"));
					}
					if(msgKeyType.containsKeyColumn("WORK_ODR_CD")) {
						key.setWORK_ODR_CD(msgKey.getKeyValue("WORK_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("PARENT_ORDER_NO")) {
						key.setPARENT_ORDER_NO(msgKey.getKeyValue("PARENT_ORDER_NO"));
					}
					if(msgKeyType.containsKeyColumn("PARENT_ORDER_ITEM_NO")) {
						key.setPARENT_ORDER_ITEM_NO(msgKey.getKeyValue("PARENT_ORDER_ITEM_NO"));
					}
					if(msgKeyType.containsKeyColumn("PARENT_ORDER_ITEM_NAME")) {
						key.setPARENT_ORDER_ITEM_NAME(msgKey.getKeyValue("PARENT_ORDER_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("DEMAND_NO")) {
						key.setDEMAND_NO(msgKey.getKeyValue("DEMAND_NO"));
					}
					if(msgKeyType.containsKeyColumn("ORDER_NO")) {
						key.setORDER_NO(msgKey.getKeyValue("ORDER_NO"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_CD")) {
						key.setJOB_ODR_CD(msgKey.getKeyValue("JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("WH_CD")) {
						key.setWH_CD(msgKey.getKeyValue("WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("WH_NAME")) {
						key.setWH_NAME(msgKey.getKeyValue("WH_NAME"));
					}
					if(msgKeyType.containsKeyColumn("GNR")) {
						key.setGNR(msgKey.getKeyValue("GNR"));
					}
					if(msgKeyType.containsKeyColumn("NUMBER_GNR_TYP")) {
						key.setNUMBER_GNR_TYP(msgKey.getKeyValue("NUMBER_GNR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("GNR_TYP")) {
						key.setGNR_TYP(msgKey.getKeyValue("GNR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_CANCEL_NO")) {
						key.setJOB_ODR_CANCEL_NO(msgKey.getKeyValue("JOB_ODR_CANCEL_NO"));
					}
					if(msgKeyType.containsKeyColumn("w_PKG_UNIT_QTY")) {
						key.setw_PKG_UNIT_QTY(msgKey.getKeyValue("w_PKG_UNIT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("w_UNIT_QTY_TYP")) {
						key.setw_UNIT_QTY_TYP(msgKey.getKeyValue("w_UNIT_QTY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("CUST_CD")) {
						key.setCUST_CD(msgKey.getKeyValue("CUST_CD"));
					}
					if(msgKeyType.containsKeyColumn("DLV_LOC_CD")) {
						key.setDLV_LOC_CD(msgKey.getKeyValue("DLV_LOC_CD"));
					}
					if(msgKeyType.containsKeyColumn("DESINATED_DLV_DATE")) {
						key.setDESINATED_DLV_DATE(msgKey.getKeyValue("DESINATED_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("ODR_ACPT_DATE")) {
						key.setODR_ACPT_DATE(msgKey.getKeyValue("ODR_ACPT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("VEND_CD")) {
						key.setVEND_CD(msgKey.getKeyValue("VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("ODR_START_DATE")) {
						key.setODR_START_DATE(msgKey.getKeyValue("ODR_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_START_DATE")) {
						key.setPUCH_ODR_START_DATE(msgKey.getKeyValue("PUCH_ODR_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("M_WH_PLANT_CD")) {
						key.setM_WH_PLANT_CD(msgKey.getKeyValue("M_WH_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("TRANSPORT_LT")) {
						key.setTRANSPORT_LT(msgKey.getKeyValue("TRANSPORT_LT"));
					}
					if(msgKeyType.containsKeyColumn("FIX_ODR_QTY")) {
						key.setFIX_ODR_QTY(msgKey.getKeyValue("FIX_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("UNOFFICIAL_ODR_QTY")) {
						key.setUNOFFICIAL_ODR_QTY(msgKey.getKeyValue("UNOFFICIAL_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("DEPOT_QTY")) {
						key.setDEPOT_QTY(msgKey.getKeyValue("DEPOT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("CUST_ANAME")) {
						key.setCUST_ANAME(msgKey.getKeyValue("CUST_ANAME"));
					}
					if(msgKeyType.containsKeyColumn("VEND_ANAME")) {
						key.setVEND_ANAME(msgKey.getKeyValue("VEND_ANAME"));
					}
					if(msgKeyType.containsKeyColumn("ODR_DEPOT_CTL_NO")) {
						key.setODR_DEPOT_CTL_NO(msgKey.getKeyValue("ODR_DEPOT_CTL_NO"));
					}
					if(msgKeyType.containsKeyColumn("CUST_ODR_NO")) {
						key.setCUST_ODR_NO(msgKey.getKeyValue("CUST_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("ODR_CHARACTERISTIC")) {
						key.setODR_CHARACTERISTIC(msgKey.getKeyValue("ODR_CHARACTERISTIC"));
					}
					if(msgKeyType.containsKeyColumn("w_MRP_FLG")) {
						key.setw_MRP_FLG(msgKey.getKeyValue("w_MRP_FLG"));
					}
					if(msgKeyType.containsKeyColumn("w_ENV_FLG")) {
						key.setw_ENV_FLG(msgKey.getKeyValue("w_ENV_FLG"));
					}
					if(msgKeyType.containsKeyColumn("COMPANY_CD")) {
						key.setCOMPANY_CD(msgKey.getKeyValue("COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_CHECK_FLG")) {
						key.setw_CHECK_FLG(msgKey.getKeyValue("w_CHECK_FLG"));
					}
					if(msgKeyType.containsKeyColumn("w_QTY_FLG")) {
						key.setw_QTY_FLG(msgKey.getKeyValue("w_QTY_FLG"));
					}
					if(msgKeyType.containsKeyColumn("w_LOG_MODE_TYP")) {
						key.setw_LOG_MODE_TYP(msgKey.getKeyValue("w_LOG_MODE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("w_OUTPUT_MODE_TYP")) {
						key.setw_OUTPUT_MODE_TYP(msgKey.getKeyValue("w_OUTPUT_MODE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("w_PROGRAM_CD")) {
						key.setw_PROGRAM_CD(msgKey.getKeyValue("w_PROGRAM_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_FUNCTION_NAME")) {
						key.setw_FUNCTION_NAME(msgKey.getKeyValue("w_FUNCTION_NAME"));
					}
					if(msgKeyType.containsKeyColumn("w_SHIP_LT")) {
						key.setw_SHIP_LT(msgKey.getKeyValue("w_SHIP_LT"));
					}
					if(msgKeyType.containsKeyColumn("w_CLASS_CODE")) {
						key.setw_CLASS_CODE(msgKey.getKeyValue("w_CLASS_CODE"));
					}
					if(msgKeyType.containsKeyColumn("w_PARENT_ITEM_CD")) {
						key.setw_PARENT_ITEM_CD(msgKey.getKeyValue("w_PARENT_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_COMP_ITEM_CD")) {
						key.setw_COMP_ITEM_CD(msgKey.getKeyValue("w_COMP_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("ODR_CD")) {
						key.setODR_CD(msgKey.getKeyValue("ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_INSTALL_FLG")) {
						key.seth_INSTALL_FLG(msgKey.getKeyValue("h_INSTALL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("OD_NO")) {
						key.setOD_NO(msgKey.getKeyValue("OD_NO"));
					}
					if(msgKeyType.containsKeyColumn("INTEGRATE_ODR_QTY_ZH")) {
						key.setINTEGRATE_ODR_QTY_ZH(msgKey.getKeyValue("INTEGRATE_ODR_QTY_ZH"));
					}
					if(msgKeyType.containsKeyColumn("DEPOT_CTL_NO")) {
						key.setDEPOT_CTL_NO(msgKey.getKeyValue("DEPOT_CTL_NO"));
					}
					if(msgKeyType.containsKeyColumn("w_UNCONFIRM_FLG")) {
						key.setw_UNCONFIRM_FLG(msgKey.getKeyValue("w_UNCONFIRM_FLG"));
					}
					if(msgKeyType.containsKeyColumn("l_COUNT")) {
						key.setl_COUNT(msgKey.getKeyValue("l_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("ROW_COUNT")) {
						key.setROW_COUNT(msgKey.getKeyValue("ROW_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("w_DM_CREATE_BASE_TBL")) {
						key.setw_DM_CREATE_BASE_TBL(msgKey.getKeyValue("w_DM_CREATE_BASE_TBL"));
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
