/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KM0040/src/com/nec/jp/orteus/metamorBase/KM0040/KM0040010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.KM0040;

import com.nec.jp.orteus.metamorBase.KM0040.*;
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
/**
 * CLASS     : KM0040010Control クラス
 * ファイル・クラス説明
 * @author $Author: luoxiao $
 * @version $Revision: 1.1 $ $Date: 2014/06/09 03:14:56 $
 *
 */
//}}user_implement_code_header

public class KM0040010Control
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
	public KM0040010Struct getListvalue(int x) { return (KM0040010Struct)(this.list.get(x)); }	// リストの値を返します。
	public KM0040010Struct getStruct() { return this.struct; }	// Structの値を返します。
	public KM0040010Struct createStruct() { return new KM0040010Struct(); }	// 新しいStructを作って返します。
	public void setStruct(Object structname) { this.struct.setStruct((KM0040010Struct)structname); }	// Structをセットします。
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
	private List _csvList = null;
	
	/**
	* 初期値の設定
	* @return void
	*/
	public void initialSet() throws BusinessProcessException, FoundationException
	{
		  // 画面検索項目の初期化
		  struct.setCHECK_1("true");
		  struct.setC1_PROJECT_STAT("true");
	      struct.setC2_PROJECT_STAT("true");
	      
		  // 画面一覧表示内容を初期化
		  setList(null);

		  // 読込ステータス設定
		  setReadStatus(INITIAL);
	}
	// TODO: ユーザ定義のコードを記述してください
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0040");
		logger.entering("KM0040010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
			// TODO: ユーザ定義のコードを記述してください
		    // structのクリア
		    struct.clear();
		    
	        if (list != null) {
	        list.clear();
	        }
	        setReadStatus(INITIAL);
	        controlRELOAD();
                //}}user_implement_dev:<controlClear>
		logger.exiting("KM0040010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * 閉じるボタン押下時に実行される処理です。
	 *
	 */
	public void controlClose() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0040");
		logger.entering("KM0040010Control"+":USER="+struct.getsUser_ID(),"controlClose");
			//{{user_implement_dev:<controlClose>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlClose>
		logger.exiting("KM0040010Control"+":USER="+struct.getsUser_ID(),"controlClose");

		return;
	}

	/**
	 * 読込ボタン押下時に実行される処理です。
	 *
	 */
	public void controlSelect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0040");
		logger.entering("KM0040010Control"+":USER="+struct.getsUser_ID(),"controlSelect");
			//{{user_implement_dev:<controlSelect>
		// TODO: ユーザ定義のコードを記述してください
		
		// CSVダウンロードファイルのクリア
        struct.setDOWNLOAD_FILE(null);
        
		try {
			
			// 読込ステータス設定
        	setReadStatus(INITIAL);

        	// 一覧表示内容をクリア
        	setList(null);
	        
        	//【データ読込】
	        
	        //画面．ステータスの初期化
	        struct.setInC1_PROJECT_STAT("0");
	        struct.setInC2_PROJECT_STAT("0");
	        struct.setInC3_PROJECT_STAT("0");
	        struct.setInC4_PROJECT_STAT("0");
	        struct.setInC5_PROJECT_STAT("0");
	        struct.setInC6_PROJECT_STAT("0");
	        
	        //画面．ステータスの判定
	        if("true".equals(struct.getC1_PROJECT_STAT())){
	        	  struct.setInC1_PROJECT_STAT("1");
	        	}
	        if("true".equals(struct.getC2_PROJECT_STAT())){
		          struct.setInC2_PROJECT_STAT("2");
		        }
	        if("true".equals(struct.getC3_PROJECT_STAT())){
		          struct.setInC3_PROJECT_STAT("3");
		        }
	        if("true".equals(struct.getC4_PROJECT_STAT())){
		          struct.setInC4_PROJECT_STAT("4");
		        }
	        if("true".equals(struct.getC5_PROJECT_STAT())){
		          struct.setInC5_PROJECT_STAT("8");
		        }
	        if("true".equals(struct.getC6_PROJECT_STAT())){
		          struct.setInC6_PROJECT_STAT("9");
		        }
	        
	        struct.setstrCOMPANY_CD(this.getCOMPANY_CD());
	        
	     	// 表示最大行数制限
	     	ScreenParam sp = new ScreenParam(this.getClass());
	     	int maxLine = sp.getMaxLine(conn, 10);
	     	if (maxLine != 0)
	     		struct.setROW_COUNT(String.valueOf(maxLine));

	     	// 検索条件に指定された内容で[所要量･品目マスタ･作業系列]より取得
	     	List tempList = null;
	     	int rowCount = 0;
	     	
	     	if ("true".equals(struct.getCHECK_1())){
	     		tempList = entity.mselectT_PROJECE_ESTIMATE1.read(conn, struct);
	     	} else {
	     		tempList = entity.mselectT_PROJECE_ESTIMATE.read(conn, struct);
	     	}
	     	rowCount = tempList.size();
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
					setErrorMessage("ZZ01115", "" + maxLine);
                   // 表示用リストにセット
					if(list !=null && list.size()>0){
						list.clear();
					}
					return;
				} else {
					// 表示用リストにセット
					setList(tempList);
					
					KM0040010Struct TempStruct;
					for (int i = 0; i < tempList.size();i++ ){
						TempStruct = (KM0040010Struct)list.get(i);
						TempStruct.setI_PROJECT_STAT(TempStruct.getPROJECT_STAT());
						TempStruct.setPROJECT_STAT(this.multcombo("PROJECT_STAT",TempStruct.getPROJECT_STAT()));
						TempStruct.setESTIMATE_STAT(this.multcombo("ESTIMATE_STAT",TempStruct.getESTIMATE_STAT()));
						TempStruct.setACCURACY(this.multcombo("ACCURACY_LEVEL",TempStruct.getACCURACY()));
						if(struct.getIN_PJ_USER_CD() != null && ("").equals(struct.getIN_PJ_USER_CD()) == false){
							struct.setIN_PJ_USER_NAME(TempStruct.getUSER_NAME_1());}else{
						          struct.setIN_PJ_USER_NAME(null);
					        }
						if(struct.getIN_ES_USER_CD() != null && ("").equals(struct.getIN_ES_USER_CD()) == false){
							struct.setIN_ES_USER_NAME(TempStruct.getUSER_NAME_2());}else{
						          struct.setIN_ES_USER_NAME(null);
					        }
					}
					setReadStatus(NORMAL);
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
		logger.exiting("KM0040010Control"+":USER="+struct.getsUser_ID(),"controlSelect");

		return;
	}

	/**
	 * 見積登録ボタン押下時に実行される処理です。
	 *
	 */
	public void controlGoSub1() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0040");
		logger.entering("KM0040010Control"+":USER="+struct.getsUser_ID(),"controlGoSub1");
			//{{user_implement_dev:<controlGoSub1>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlGoSub1>
		logger.exiting("KM0040010Control"+":USER="+struct.getsUser_ID(),"controlGoSub1");

		return;
	}

	/**
	 * 案件進捗ボタン押下時に実行される処理です。
	 *
	 */
	public void controlGoSub2() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0040");
		logger.entering("KM0040010Control"+":USER="+struct.getsUser_ID(),"controlGoSub2");
			//{{user_implement_dev:<controlGoSub2>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlGoSub2>
		logger.exiting("KM0040010Control"+":USER="+struct.getsUser_ID(),"controlGoSub2");

		return;
	}

	/**
	 * 案件受注登録ボタン押下時に実行される処理です。
	 *
	 */
	public void controlGoSub3() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0040");
		logger.entering("KM0040010Control"+":USER="+struct.getsUser_ID(),"controlGoSub3");
			//{{user_implement_dev:<controlGoSub3>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlGoSub3>
		logger.exiting("KM0040010Control"+":USER="+struct.getsUser_ID(),"controlGoSub3");

		return;
	}

	/**
	 * CSV出力ボタン押下時に実行される処理です。
	 *
	 */
	public void controlCSVOut() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0040");
		logger.entering("KM0040010Control"+":USER="+struct.getsUser_ID(),"controlCSVOut");
			//{{user_implement_dev:<controlCSVOut>
			// TODO: ユーザ定義のコードを記述してください
			csvWriter = new CsvWriter(CsvWriter.getFileName(getsysUSER_CD()));
			KM0040010Struct listStruct = null;
			List csv = new ArrayList();	// CSV情報

			// タイトル行
			String[] csvTitle = {
					"Expj.PROJECT_CD"
					,"Expj.ESTIMATE_NO"
					,"Expj.PROJECT_STAT"
					,"Expj.PROJECT_NAME"
					,"Expj.ACCURACY"
					,"Expj.ASSUME_DLV_DATE"
					,"Expj.ASSUME_AMOUNT"
					,"Expj.ESTIMATE_AMOUNT"
					,"Expj.CUR_UNIT"
					,"Expj.ASSUME_AMOUNT_EXCH_RATES"
					,"Expj.ESTIMATE_AMOUNT_JPN"
					,"Expj.VEND_DATE"
					,"Expj.CUST_CD"
					,"Expj.CUST_NAME"
					,"Expj.DLV_LOC_CD"
					,"Expj.DLV_LOC_NAME"
					,"Expj.PJ_ORG_CD"
					,"Expj.ORG_NAME_1"
					,"Expj.PJ_USER_CD"
					,"Expj.USER_NAME_1"
					,"Expj.REMARKS1"
					,"Expj.REMARKS2"
					,"Expj.REMARKS3"
					,"Expj.REMARKS4"
					,"Expj.REMARKS5"
					,"Expj.ESTIMATE_STAT"
					,"Expj.ESTIMATE_DATE"
					,"Expj.DESINATED_DLV_DATE"
					,"Expj.Cmt5934"
					,"Expj.ES_COMMET3"
					,"Expj.ES_COMMET4"
					,"Expj.ES_COMMET5"
					,"Expj.ES_ORG_CD"
					,"Expj.ORG_NAME_2"
					,"Expj.ES_USER_CD"
					,"Expj.USER_NAME_2"
					,"Expj.ESREMARK1"
					,"Expj.ESREMARK2"
					,"Expj.ESREMARK3"
			};
			csv.add(csvTitle);

			// [画面].一覧部情報をCSV情報に追加
			for (int i = 0; i < list.size(); i++) {
				listStruct = (KM0040010Struct)list.get(i);
				String[] data = {
						listStruct.getPROJECT_CD()
						,listStruct.getESTIMATE_NO()
						,listStruct.getPROJECT_STAT()
						,listStruct.getPROJECT_NAME()
						,listStruct.getACCURACY()
						,listStruct.getASSUME_DLV_DATE()
						,listStruct.getASSUME_AMOUNT()
						,listStruct.getESTIMATE_AMOUNT()
						,listStruct.getCUR_UNIT()
						,listStruct.getASSUME_AMOUNT_EXCH_RATES()
						,listStruct.getESTIMATE_AMOUNT_JPN()
						,listStruct.getVEND_DATE()
						,listStruct.getCUST_CD()
						,listStruct.getCUST_NAME()
						,listStruct.getDLV_LOC_CD()
						,listStruct.getDLV_LOC_NAME()
						,listStruct.getPJ_ORG_CD()
						,listStruct.getORG_NAME_1()
						,listStruct.getPJ_USER_CD()
						,listStruct.getUSER_NAME_1()
						,listStruct.getREMARKS1()
						,listStruct.getREMARKS2()
						,listStruct.getREMARKS3()
						,listStruct.getREMARKS4()
						,listStruct.getREMARKS5()
						,listStruct.getESTIMATE_STAT()
						,listStruct.getESTIMATE_DATE()
						,listStruct.getES_COMMET1()
						,listStruct.getES_COMMET2()
						,listStruct.getES_COMMET3()
						,listStruct.getES_COMMET4()
						,listStruct.getES_COMMET5()
						,listStruct.getES_ORG_CD()
						,listStruct.getORG_NAME_2()
						,listStruct.getES_USER_CD()
						,listStruct.getUSER_NAME_2()
						,listStruct.getESREMARK1()
						,listStruct.getESREMARK2()
						,listStruct.getESREMARK3()
				};
				csv.add(data);
			}
		
			// CSVファイルを作成
			csvWriter.write(csv, CoreTools.getLocale(struct.getsUser_ID()), true);
			// CSVファイルをクライアントに出力
			struct.setDOWNLOAD_FILE(getCsvWriter().getFilePath());
                //}}user_implement_dev:<controlCSVOut>
		logger.exiting("KM0040010Control"+":USER="+struct.getsUser_ID(),"controlCSVOut");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0040");
		logger.entering("KM0040010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("KM0040010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0040");
		logger.entering("KM0040010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
			// TODO: ユーザ定義のコードを記述してください
		
		// 画面を初期化
		initialSet();
		
		try{
			// =======================================
			// 自社情報の取得
			// =======================================
			List listCompanyInfo = entity.mgetCompanyInfo.read(conn,struct);
			if (listCompanyInfo == null || listCompanyInfo.size() != 1) {
				//自社情報が無い/複数件sww修正0720
				ExpjMessage emsg = new ExpjMessage("KQ00039");
		    	msgStruct.addError(emsg);	// エラーメッセージとして登録
		    	sysLog.severe(emsg, getsysUSER_CD()); //エラー内容
		    	ExpjException ee = new ExpjException(emsg);
		    	throw ee;
			    } else {
				struct.setstrCOMPANY_CD(((KM0040010Struct)listCompanyInfo.get(0)).getstrCOMPANY_CD());
			    }
				listCompanyInfo = null;
		}catch (SQLException e) {
			e.printStackTrace();
		}
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("KM0040010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * イベントハンドラの前処理です。
	 *
	 * @param buttun ボタン名
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0040");
		logger.entering("KM0040010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");
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
		logger.exiting("KM0040010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("GoSub1") ) {
				controlGoSub1();
			} else if( button.equals("GoSub2") ) {
				controlGoSub2();
			} else if( button.equals("GoSub3") ) {
				controlGoSub3();
			} else if( button.equals("CSVOut") ) {
				controlCSVOut();
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
//			throw new FoundationException("KM0040010Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KM0040010-E999","CSVの出力処理"));
			throw new FoundationException("KM0040010Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KM0040010-E999","システム日付の取得処理"));
				throw new FoundationException("KM0040010Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KM0040010-E999","コントロールのイベント処理"));
			throw new FoundationException("KM0040010Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected KM0040010Entity entity;
	protected KM0040010Struct struct;
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

		entity = new KM0040010Entity();
		struct = new KM0040010Struct();

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
	 * KM0040010クラスの標準コンストラクタ
	 */
	public KM0040010Control() throws BusinessProcessException, FoundationException
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
				KM0040010Struct key = (KM0040010Struct)keyList.get(j);
				// メッセージキーを作成する
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("CHECK_1") && key.getCHECK_1() != null) {
					msgKey.setKeyValue("CHECK_1", key.getCHECK_1());
				}
				if(msgKeyType.containsKeyColumn("C1_PROJECT_STAT") && key.getC1_PROJECT_STAT() != null) {
					msgKey.setKeyValue("C1_PROJECT_STAT", key.getC1_PROJECT_STAT());
				}
				if(msgKeyType.containsKeyColumn("C2_PROJECT_STAT") && key.getC2_PROJECT_STAT() != null) {
					msgKey.setKeyValue("C2_PROJECT_STAT", key.getC2_PROJECT_STAT());
				}
				if(msgKeyType.containsKeyColumn("C3_PROJECT_STAT") && key.getC3_PROJECT_STAT() != null) {
					msgKey.setKeyValue("C3_PROJECT_STAT", key.getC3_PROJECT_STAT());
				}
				if(msgKeyType.containsKeyColumn("C4_PROJECT_STAT") && key.getC4_PROJECT_STAT() != null) {
					msgKey.setKeyValue("C4_PROJECT_STAT", key.getC4_PROJECT_STAT());
				}
				if(msgKeyType.containsKeyColumn("C5_PROJECT_STAT") && key.getC5_PROJECT_STAT() != null) {
					msgKey.setKeyValue("C5_PROJECT_STAT", key.getC5_PROJECT_STAT());
				}
				if(msgKeyType.containsKeyColumn("TXT_FILE") && key.getTXT_FILE() != null) {
					msgKey.setKeyValue("TXT_FILE", key.getTXT_FILE());
				}
				if(msgKeyType.containsKeyColumn("IN_PJ_USER_NAME") && key.getIN_PJ_USER_NAME() != null) {
					msgKey.setKeyValue("IN_PJ_USER_NAME", key.getIN_PJ_USER_NAME());
				}
				if(msgKeyType.containsKeyColumn("IN_ES_USER_NAME") && key.getIN_ES_USER_NAME() != null) {
					msgKey.setKeyValue("IN_ES_USER_NAME", key.getIN_ES_USER_NAME());
				}
				if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE") && key.getDOWNLOAD_FILE() != null) {
					msgKey.setKeyValue("DOWNLOAD_FILE", key.getDOWNLOAD_FILE());
				}
				if(msgKeyType.containsKeyColumn("I_PROJECT_STAT") && key.getI_PROJECT_STAT() != null) {
					msgKey.setKeyValue("I_PROJECT_STAT", key.getI_PROJECT_STAT());
				}
				if(msgKeyType.containsKeyColumn("C6_PROJECT_STAT") && key.getC6_PROJECT_STAT() != null) {
					msgKey.setKeyValue("C6_PROJECT_STAT", key.getC6_PROJECT_STAT());
				}
				if(msgKeyType.containsKeyColumn("PROJECT_CD") && key.getPROJECT_CD() != null) {
					msgKey.setKeyValue("PROJECT_CD", key.getPROJECT_CD());
				}
				if(msgKeyType.containsKeyColumn("PROJECT_NAME") && key.getPROJECT_NAME() != null) {
					msgKey.setKeyValue("PROJECT_NAME", key.getPROJECT_NAME());
				}
				if(msgKeyType.containsKeyColumn("CUST_CD") && key.getCUST_CD() != null) {
					msgKey.setKeyValue("CUST_CD", key.getCUST_CD());
				}
				if(msgKeyType.containsKeyColumn("CUST_NAME") && key.getCUST_NAME() != null) {
					msgKey.setKeyValue("CUST_NAME", key.getCUST_NAME());
				}
				if(msgKeyType.containsKeyColumn("DLV_LOC_CD") && key.getDLV_LOC_CD() != null) {
					msgKey.setKeyValue("DLV_LOC_CD", key.getDLV_LOC_CD());
				}
				if(msgKeyType.containsKeyColumn("DLV_LOC_NAME") && key.getDLV_LOC_NAME() != null) {
					msgKey.setKeyValue("DLV_LOC_NAME", key.getDLV_LOC_NAME());
				}
				if(msgKeyType.containsKeyColumn("ACCURACY") && key.getACCURACY() != null) {
					msgKey.setKeyValue("ACCURACY", key.getACCURACY());
				}
				if(msgKeyType.containsKeyColumn("PROJECT_STAT") && key.getPROJECT_STAT() != null) {
					msgKey.setKeyValue("PROJECT_STAT", key.getPROJECT_STAT());
				}
				if(msgKeyType.containsKeyColumn("VEND_DATE") && key.getVEND_DATE() != null) {
					msgKey.setKeyValue("VEND_DATE", key.getVEND_DATE());
				}
				if(msgKeyType.containsKeyColumn("ASSUME_DLV_DATE") && key.getASSUME_DLV_DATE() != null) {
					msgKey.setKeyValue("ASSUME_DLV_DATE", key.getASSUME_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("ASSUME_AMOUNT") && key.getASSUME_AMOUNT() != null) {
					msgKey.setKeyValue("ASSUME_AMOUNT", key.getASSUME_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("CUR_UNIT") && key.getCUR_UNIT() != null) {
					msgKey.setKeyValue("CUR_UNIT", key.getCUR_UNIT());
				}
				if(msgKeyType.containsKeyColumn("ASSUME_AMOUNT_EXCH_RATES") && key.getASSUME_AMOUNT_EXCH_RATES() != null) {
					msgKey.setKeyValue("ASSUME_AMOUNT_EXCH_RATES", key.getASSUME_AMOUNT_EXCH_RATES());
				}
				if(msgKeyType.containsKeyColumn("PJ_ORG_CD") && key.getPJ_ORG_CD() != null) {
					msgKey.setKeyValue("PJ_ORG_CD", key.getPJ_ORG_CD());
				}
				if(msgKeyType.containsKeyColumn("ORG_NAME_1") && key.getORG_NAME_1() != null) {
					msgKey.setKeyValue("ORG_NAME_1", key.getORG_NAME_1());
				}
				if(msgKeyType.containsKeyColumn("PJ_USER_CD") && key.getPJ_USER_CD() != null) {
					msgKey.setKeyValue("PJ_USER_CD", key.getPJ_USER_CD());
				}
				if(msgKeyType.containsKeyColumn("USER_NAME_1") && key.getUSER_NAME_1() != null) {
					msgKey.setKeyValue("USER_NAME_1", key.getUSER_NAME_1());
				}
				if(msgKeyType.containsKeyColumn("REMARKS1") && key.getREMARKS1() != null) {
					msgKey.setKeyValue("REMARKS1", key.getREMARKS1());
				}
				if(msgKeyType.containsKeyColumn("REMARKS2") && key.getREMARKS2() != null) {
					msgKey.setKeyValue("REMARKS2", key.getREMARKS2());
				}
				if(msgKeyType.containsKeyColumn("REMARKS3") && key.getREMARKS3() != null) {
					msgKey.setKeyValue("REMARKS3", key.getREMARKS3());
				}
				if(msgKeyType.containsKeyColumn("REMARKS4") && key.getREMARKS4() != null) {
					msgKey.setKeyValue("REMARKS4", key.getREMARKS4());
				}
				if(msgKeyType.containsKeyColumn("REMARKS5") && key.getREMARKS5() != null) {
					msgKey.setKeyValue("REMARKS5", key.getREMARKS5());
				}
				if(msgKeyType.containsKeyColumn("ESTIMATE_NO") && key.getESTIMATE_NO() != null) {
					msgKey.setKeyValue("ESTIMATE_NO", key.getESTIMATE_NO());
				}
				if(msgKeyType.containsKeyColumn("ESTIMATE_STAT") && key.getESTIMATE_STAT() != null) {
					msgKey.setKeyValue("ESTIMATE_STAT", key.getESTIMATE_STAT());
				}
				if(msgKeyType.containsKeyColumn("ESTIMATE_DATE") && key.getESTIMATE_DATE() != null) {
					msgKey.setKeyValue("ESTIMATE_DATE", key.getESTIMATE_DATE());
				}
				if(msgKeyType.containsKeyColumn("ES_COMMET1") && key.getES_COMMET1() != null) {
					msgKey.setKeyValue("ES_COMMET1", key.getES_COMMET1());
				}
				if(msgKeyType.containsKeyColumn("ES_COMMET2") && key.getES_COMMET2() != null) {
					msgKey.setKeyValue("ES_COMMET2", key.getES_COMMET2());
				}
				if(msgKeyType.containsKeyColumn("ES_COMMET3") && key.getES_COMMET3() != null) {
					msgKey.setKeyValue("ES_COMMET3", key.getES_COMMET3());
				}
				if(msgKeyType.containsKeyColumn("ES_COMMET4") && key.getES_COMMET4() != null) {
					msgKey.setKeyValue("ES_COMMET4", key.getES_COMMET4());
				}
				if(msgKeyType.containsKeyColumn("ES_COMMET5") && key.getES_COMMET5() != null) {
					msgKey.setKeyValue("ES_COMMET5", key.getES_COMMET5());
				}
				if(msgKeyType.containsKeyColumn("ES_ORG_CD") && key.getES_ORG_CD() != null) {
					msgKey.setKeyValue("ES_ORG_CD", key.getES_ORG_CD());
				}
				if(msgKeyType.containsKeyColumn("ORG_NAME_2") && key.getORG_NAME_2() != null) {
					msgKey.setKeyValue("ORG_NAME_2", key.getORG_NAME_2());
				}
				if(msgKeyType.containsKeyColumn("ES_USER_CD") && key.getES_USER_CD() != null) {
					msgKey.setKeyValue("ES_USER_CD", key.getES_USER_CD());
				}
				if(msgKeyType.containsKeyColumn("USER_NAME_2") && key.getUSER_NAME_2() != null) {
					msgKey.setKeyValue("USER_NAME_2", key.getUSER_NAME_2());
				}
				if(msgKeyType.containsKeyColumn("ESTIMATE_AMOUNT") && key.getESTIMATE_AMOUNT() != null) {
					msgKey.setKeyValue("ESTIMATE_AMOUNT", key.getESTIMATE_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("ESTIMATE_AMOUNT_JPN") && key.getESTIMATE_AMOUNT_JPN() != null) {
					msgKey.setKeyValue("ESTIMATE_AMOUNT_JPN", key.getESTIMATE_AMOUNT_JPN());
				}
				if(msgKeyType.containsKeyColumn("ESREMARK1") && key.getESREMARK1() != null) {
					msgKey.setKeyValue("ESREMARK1", key.getESREMARK1());
				}
				if(msgKeyType.containsKeyColumn("ESREMARK2") && key.getESREMARK2() != null) {
					msgKey.setKeyValue("ESREMARK2", key.getESREMARK2());
				}
				if(msgKeyType.containsKeyColumn("ESREMARK3") && key.getESREMARK3() != null) {
					msgKey.setKeyValue("ESREMARK3", key.getESREMARK3());
				}
				if(msgKeyType.containsKeyColumn("IN_PROJECT_CD") && key.getIN_PROJECT_CD() != null) {
					msgKey.setKeyValue("IN_PROJECT_CD", key.getIN_PROJECT_CD());
				}
				if(msgKeyType.containsKeyColumn("IN_CUST_CD") && key.getIN_CUST_CD() != null) {
					msgKey.setKeyValue("IN_CUST_CD", key.getIN_CUST_CD());
				}
				if(msgKeyType.containsKeyColumn("IN_PJ_USER_CD") && key.getIN_PJ_USER_CD() != null) {
					msgKey.setKeyValue("IN_PJ_USER_CD", key.getIN_PJ_USER_CD());
				}
				if(msgKeyType.containsKeyColumn("IN_ES_USER_CD") && key.getIN_ES_USER_CD() != null) {
					msgKey.setKeyValue("IN_ES_USER_CD", key.getIN_ES_USER_CD());
				}
				if(msgKeyType.containsKeyColumn("FROM_VEND_DATE") && key.getFROM_VEND_DATE() != null) {
					msgKey.setKeyValue("FROM_VEND_DATE", key.getFROM_VEND_DATE());
				}
				if(msgKeyType.containsKeyColumn("TO_VEND_DATE") && key.getTO_VEND_DATE() != null) {
					msgKey.setKeyValue("TO_VEND_DATE", key.getTO_VEND_DATE());
				}
				if(msgKeyType.containsKeyColumn("FROM_ASSUME_DLV_DATE") && key.getFROM_ASSUME_DLV_DATE() != null) {
					msgKey.setKeyValue("FROM_ASSUME_DLV_DATE", key.getFROM_ASSUME_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("TO_ASSUME_DLV_DATE") && key.getTO_ASSUME_DLV_DATE() != null) {
					msgKey.setKeyValue("TO_ASSUME_DLV_DATE", key.getTO_ASSUME_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("FROM_ESTIMATE_DATE") && key.getFROM_ESTIMATE_DATE() != null) {
					msgKey.setKeyValue("FROM_ESTIMATE_DATE", key.getFROM_ESTIMATE_DATE());
				}
				if(msgKeyType.containsKeyColumn("TO_ESTIMATE_DATE") && key.getTO_ESTIMATE_DATE() != null) {
					msgKey.setKeyValue("TO_ESTIMATE_DATE", key.getTO_ESTIMATE_DATE());
				}
				if(msgKeyType.containsKeyColumn("InC2_PROJECT_STAT") && key.getInC2_PROJECT_STAT() != null) {
					msgKey.setKeyValue("InC2_PROJECT_STAT", key.getInC2_PROJECT_STAT());
				}
				if(msgKeyType.containsKeyColumn("InC3_PROJECT_STAT") && key.getInC3_PROJECT_STAT() != null) {
					msgKey.setKeyValue("InC3_PROJECT_STAT", key.getInC3_PROJECT_STAT());
				}
				if(msgKeyType.containsKeyColumn("InC4_PROJECT_STAT") && key.getInC4_PROJECT_STAT() != null) {
					msgKey.setKeyValue("InC4_PROJECT_STAT", key.getInC4_PROJECT_STAT());
				}
				if(msgKeyType.containsKeyColumn("InC5_PROJECT_STAT") && key.getInC5_PROJECT_STAT() != null) {
					msgKey.setKeyValue("InC5_PROJECT_STAT", key.getInC5_PROJECT_STAT());
				}
				if(msgKeyType.containsKeyColumn("InC6_PROJECT_STAT") && key.getInC6_PROJECT_STAT() != null) {
					msgKey.setKeyValue("InC6_PROJECT_STAT", key.getInC6_PROJECT_STAT());
				}
				if(msgKeyType.containsKeyColumn("ROW_COUNT") && key.getROW_COUNT() != null) {
					msgKey.setKeyValue("ROW_COUNT", key.getROW_COUNT());
				}
				if(msgKeyType.containsKeyColumn("InC1_PROJECT_STAT") && key.getInC1_PROJECT_STAT() != null) {
					msgKey.setKeyValue("InC1_PROJECT_STAT", key.getInC1_PROJECT_STAT());
				}
				if(msgKeyType.containsKeyColumn("strCOMPANY_CD") && key.getstrCOMPANY_CD() != null) {
					msgKey.setKeyValue("strCOMPANY_CD", key.getstrCOMPANY_CD());
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
					KM0040010Struct key = new KM0040010Struct();
					if(msgKeyType.containsKeyColumn("CHECK_1")) {
						key.setCHECK_1(msgKey.getKeyValue("CHECK_1"));
					}
					if(msgKeyType.containsKeyColumn("C1_PROJECT_STAT")) {
						key.setC1_PROJECT_STAT(msgKey.getKeyValue("C1_PROJECT_STAT"));
					}
					if(msgKeyType.containsKeyColumn("C2_PROJECT_STAT")) {
						key.setC2_PROJECT_STAT(msgKey.getKeyValue("C2_PROJECT_STAT"));
					}
					if(msgKeyType.containsKeyColumn("C3_PROJECT_STAT")) {
						key.setC3_PROJECT_STAT(msgKey.getKeyValue("C3_PROJECT_STAT"));
					}
					if(msgKeyType.containsKeyColumn("C4_PROJECT_STAT")) {
						key.setC4_PROJECT_STAT(msgKey.getKeyValue("C4_PROJECT_STAT"));
					}
					if(msgKeyType.containsKeyColumn("C5_PROJECT_STAT")) {
						key.setC5_PROJECT_STAT(msgKey.getKeyValue("C5_PROJECT_STAT"));
					}
					if(msgKeyType.containsKeyColumn("TXT_FILE")) {
						key.setTXT_FILE(msgKey.getKeyValue("TXT_FILE"));
					}
					if(msgKeyType.containsKeyColumn("IN_PJ_USER_NAME")) {
						key.setIN_PJ_USER_NAME(msgKey.getKeyValue("IN_PJ_USER_NAME"));
					}
					if(msgKeyType.containsKeyColumn("IN_ES_USER_NAME")) {
						key.setIN_ES_USER_NAME(msgKey.getKeyValue("IN_ES_USER_NAME"));
					}
					if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE")) {
						key.setDOWNLOAD_FILE(msgKey.getKeyValue("DOWNLOAD_FILE"));
					}
					if(msgKeyType.containsKeyColumn("I_PROJECT_STAT")) {
						key.setI_PROJECT_STAT(msgKey.getKeyValue("I_PROJECT_STAT"));
					}
					if(msgKeyType.containsKeyColumn("C6_PROJECT_STAT")) {
						key.setC6_PROJECT_STAT(msgKey.getKeyValue("C6_PROJECT_STAT"));
					}
					if(msgKeyType.containsKeyColumn("PROJECT_CD")) {
						key.setPROJECT_CD(msgKey.getKeyValue("PROJECT_CD"));
					}
					if(msgKeyType.containsKeyColumn("PROJECT_NAME")) {
						key.setPROJECT_NAME(msgKey.getKeyValue("PROJECT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("CUST_CD")) {
						key.setCUST_CD(msgKey.getKeyValue("CUST_CD"));
					}
					if(msgKeyType.containsKeyColumn("CUST_NAME")) {
						key.setCUST_NAME(msgKey.getKeyValue("CUST_NAME"));
					}
					if(msgKeyType.containsKeyColumn("DLV_LOC_CD")) {
						key.setDLV_LOC_CD(msgKey.getKeyValue("DLV_LOC_CD"));
					}
					if(msgKeyType.containsKeyColumn("DLV_LOC_NAME")) {
						key.setDLV_LOC_NAME(msgKey.getKeyValue("DLV_LOC_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ACCURACY")) {
						key.setACCURACY(msgKey.getKeyValue("ACCURACY"));
					}
					if(msgKeyType.containsKeyColumn("PROJECT_STAT")) {
						key.setPROJECT_STAT(msgKey.getKeyValue("PROJECT_STAT"));
					}
					if(msgKeyType.containsKeyColumn("VEND_DATE")) {
						key.setVEND_DATE(msgKey.getKeyValue("VEND_DATE"));
					}
					if(msgKeyType.containsKeyColumn("ASSUME_DLV_DATE")) {
						key.setASSUME_DLV_DATE(msgKey.getKeyValue("ASSUME_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("ASSUME_AMOUNT")) {
						key.setASSUME_AMOUNT(msgKey.getKeyValue("ASSUME_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("CUR_UNIT")) {
						key.setCUR_UNIT(msgKey.getKeyValue("CUR_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("ASSUME_AMOUNT_EXCH_RATES")) {
						key.setASSUME_AMOUNT_EXCH_RATES(msgKey.getKeyValue("ASSUME_AMOUNT_EXCH_RATES"));
					}
					if(msgKeyType.containsKeyColumn("PJ_ORG_CD")) {
						key.setPJ_ORG_CD(msgKey.getKeyValue("PJ_ORG_CD"));
					}
					if(msgKeyType.containsKeyColumn("ORG_NAME_1")) {
						key.setORG_NAME_1(msgKey.getKeyValue("ORG_NAME_1"));
					}
					if(msgKeyType.containsKeyColumn("PJ_USER_CD")) {
						key.setPJ_USER_CD(msgKey.getKeyValue("PJ_USER_CD"));
					}
					if(msgKeyType.containsKeyColumn("USER_NAME_1")) {
						key.setUSER_NAME_1(msgKey.getKeyValue("USER_NAME_1"));
					}
					if(msgKeyType.containsKeyColumn("REMARKS1")) {
						key.setREMARKS1(msgKey.getKeyValue("REMARKS1"));
					}
					if(msgKeyType.containsKeyColumn("REMARKS2")) {
						key.setREMARKS2(msgKey.getKeyValue("REMARKS2"));
					}
					if(msgKeyType.containsKeyColumn("REMARKS3")) {
						key.setREMARKS3(msgKey.getKeyValue("REMARKS3"));
					}
					if(msgKeyType.containsKeyColumn("REMARKS4")) {
						key.setREMARKS4(msgKey.getKeyValue("REMARKS4"));
					}
					if(msgKeyType.containsKeyColumn("REMARKS5")) {
						key.setREMARKS5(msgKey.getKeyValue("REMARKS5"));
					}
					if(msgKeyType.containsKeyColumn("ESTIMATE_NO")) {
						key.setESTIMATE_NO(msgKey.getKeyValue("ESTIMATE_NO"));
					}
					if(msgKeyType.containsKeyColumn("ESTIMATE_STAT")) {
						key.setESTIMATE_STAT(msgKey.getKeyValue("ESTIMATE_STAT"));
					}
					if(msgKeyType.containsKeyColumn("ESTIMATE_DATE")) {
						key.setESTIMATE_DATE(msgKey.getKeyValue("ESTIMATE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("ES_COMMET1")) {
						key.setES_COMMET1(msgKey.getKeyValue("ES_COMMET1"));
					}
					if(msgKeyType.containsKeyColumn("ES_COMMET2")) {
						key.setES_COMMET2(msgKey.getKeyValue("ES_COMMET2"));
					}
					if(msgKeyType.containsKeyColumn("ES_COMMET3")) {
						key.setES_COMMET3(msgKey.getKeyValue("ES_COMMET3"));
					}
					if(msgKeyType.containsKeyColumn("ES_COMMET4")) {
						key.setES_COMMET4(msgKey.getKeyValue("ES_COMMET4"));
					}
					if(msgKeyType.containsKeyColumn("ES_COMMET5")) {
						key.setES_COMMET5(msgKey.getKeyValue("ES_COMMET5"));
					}
					if(msgKeyType.containsKeyColumn("ES_ORG_CD")) {
						key.setES_ORG_CD(msgKey.getKeyValue("ES_ORG_CD"));
					}
					if(msgKeyType.containsKeyColumn("ORG_NAME_2")) {
						key.setORG_NAME_2(msgKey.getKeyValue("ORG_NAME_2"));
					}
					if(msgKeyType.containsKeyColumn("ES_USER_CD")) {
						key.setES_USER_CD(msgKey.getKeyValue("ES_USER_CD"));
					}
					if(msgKeyType.containsKeyColumn("USER_NAME_2")) {
						key.setUSER_NAME_2(msgKey.getKeyValue("USER_NAME_2"));
					}
					if(msgKeyType.containsKeyColumn("ESTIMATE_AMOUNT")) {
						key.setESTIMATE_AMOUNT(msgKey.getKeyValue("ESTIMATE_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("ESTIMATE_AMOUNT_JPN")) {
						key.setESTIMATE_AMOUNT_JPN(msgKey.getKeyValue("ESTIMATE_AMOUNT_JPN"));
					}
					if(msgKeyType.containsKeyColumn("ESREMARK1")) {
						key.setESREMARK1(msgKey.getKeyValue("ESREMARK1"));
					}
					if(msgKeyType.containsKeyColumn("ESREMARK2")) {
						key.setESREMARK2(msgKey.getKeyValue("ESREMARK2"));
					}
					if(msgKeyType.containsKeyColumn("ESREMARK3")) {
						key.setESREMARK3(msgKey.getKeyValue("ESREMARK3"));
					}
					if(msgKeyType.containsKeyColumn("IN_PROJECT_CD")) {
						key.setIN_PROJECT_CD(msgKey.getKeyValue("IN_PROJECT_CD"));
					}
					if(msgKeyType.containsKeyColumn("IN_CUST_CD")) {
						key.setIN_CUST_CD(msgKey.getKeyValue("IN_CUST_CD"));
					}
					if(msgKeyType.containsKeyColumn("IN_PJ_USER_CD")) {
						key.setIN_PJ_USER_CD(msgKey.getKeyValue("IN_PJ_USER_CD"));
					}
					if(msgKeyType.containsKeyColumn("IN_ES_USER_CD")) {
						key.setIN_ES_USER_CD(msgKey.getKeyValue("IN_ES_USER_CD"));
					}
					if(msgKeyType.containsKeyColumn("FROM_VEND_DATE")) {
						key.setFROM_VEND_DATE(msgKey.getKeyValue("FROM_VEND_DATE"));
					}
					if(msgKeyType.containsKeyColumn("TO_VEND_DATE")) {
						key.setTO_VEND_DATE(msgKey.getKeyValue("TO_VEND_DATE"));
					}
					if(msgKeyType.containsKeyColumn("FROM_ASSUME_DLV_DATE")) {
						key.setFROM_ASSUME_DLV_DATE(msgKey.getKeyValue("FROM_ASSUME_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("TO_ASSUME_DLV_DATE")) {
						key.setTO_ASSUME_DLV_DATE(msgKey.getKeyValue("TO_ASSUME_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("FROM_ESTIMATE_DATE")) {
						key.setFROM_ESTIMATE_DATE(msgKey.getKeyValue("FROM_ESTIMATE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("TO_ESTIMATE_DATE")) {
						key.setTO_ESTIMATE_DATE(msgKey.getKeyValue("TO_ESTIMATE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("InC2_PROJECT_STAT")) {
						key.setInC2_PROJECT_STAT(msgKey.getKeyValue("InC2_PROJECT_STAT"));
					}
					if(msgKeyType.containsKeyColumn("InC3_PROJECT_STAT")) {
						key.setInC3_PROJECT_STAT(msgKey.getKeyValue("InC3_PROJECT_STAT"));
					}
					if(msgKeyType.containsKeyColumn("InC4_PROJECT_STAT")) {
						key.setInC4_PROJECT_STAT(msgKey.getKeyValue("InC4_PROJECT_STAT"));
					}
					if(msgKeyType.containsKeyColumn("InC5_PROJECT_STAT")) {
						key.setInC5_PROJECT_STAT(msgKey.getKeyValue("InC5_PROJECT_STAT"));
					}
					if(msgKeyType.containsKeyColumn("InC6_PROJECT_STAT")) {
						key.setInC6_PROJECT_STAT(msgKey.getKeyValue("InC6_PROJECT_STAT"));
					}
					if(msgKeyType.containsKeyColumn("ROW_COUNT")) {
						key.setROW_COUNT(msgKey.getKeyValue("ROW_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("InC1_PROJECT_STAT")) {
						key.setInC1_PROJECT_STAT(msgKey.getKeyValue("InC1_PROJECT_STAT"));
					}
					if(msgKeyType.containsKeyColumn("strCOMPANY_CD")) {
						key.setstrCOMPANY_CD(msgKey.getKeyValue("strCOMPANY_CD"));
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
