/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KQ0060/src/com/nec/jp/orteus/metamorBase/KQ0060/KQ0060010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.KQ0060;

import com.nec.jp.orteus.metamorBase.KQ0060.*;
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
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.parsers.ParserConfigurationException;
import com.nec.jp.orteus.metamorBase.util.common.SystemConfig;
import com.nec.jp.orteus.metamorBase.common01.Accessor.ProductStructureRepository;
import com.nec.jp.orteus.metamorBase.common01.db.DBErrorMessage;
import com.nec.jp.orteus.metamorBase.common.util.Converter;
import com.nec.jp.orteus.metamorBase.common.util.ScreenParam;
import com.nec.jp.orteus.metamorBase.common.util.ScreenPermission;
import java.text.*;
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class KQ0060010Control
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
	public Object getListvalue(int x) { return this.list.get(x); }	// リストの値（メディエータ）を返します。

	public KQ0060010Struct getStruct() { return this.struct; }	// Structの値（メディエータ）を返します。

	private boolean closeFlag = false;
	public boolean isCloseFlag(){
		return this.closeFlag;
	}
	public void setCloseFlag(boolean flg){
	  this.closeFlag = flg;
	}

	//帳票出力関連
	public String WEBROOTpath = null;
	public String PDFpath = null;
	public String FRMpath = null;
	public String fileName_KZ0130 = null;

	// CSV出力用リスト
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }

	//---------- ＣＳＶ出力関連の処理 ---------------------------------------------------
	private List csvList = null;
	public List getCsvList(){ return this.csvList; }

	SystemLog _sysLog = sysLog;

	/** メッセージ定義ファイル */
	private MessageConfig _msgConfig = null;

	//private MessageStruct _msgStruct = msgStruct;
	public MessageStruct _getMsgStruct(){ return this.msgStruct;}

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
	
	/** 画面共通定義取得クラス */
	ScreenParam _scParam = sp;

	//最大行数制限処理
	private void getMaxLine()throws FoundationException{
		try{
			ScreenParam sp = new ScreenParam(this.getClass());
			int maxLine = sp.getMaxLine(conn, 10);
			if (maxLine != 0 && this.list.size() > maxLine) {
				this.list.clear();
				//表示用データ処理
				setReadStatus(TOO_MANY);
				ExpjMessage emsg = new ExpjMessage( "ZZ01115" ,""+maxLine);
				msgStruct.addError( emsg );	// エラーメッセージとして登録
				sysLog.warning(emsg, getsysUSER_CD()); //エラー内容
				emsg = new ExpjMessage( "ZZ01006","M_ITEM.ITEM_CD:" + struct.getIN_ITEM_CD() );
				msgStruct.addError( emsg );	// エラーメッセージとして登録
				sysLog.warning(emsg, getsysUSER_CD()); //エラー詳細
				return;
			}
		}catch(Exception e){
			e.printStackTrace();
			ExpjMessage emsg = new ExpjMessage( "ZZ01106");
			sysLog.severe(emsg, struct.getsUser_ID());
			ExpjException ee = new ExpjException(e,emsg);
			emsg = new ExpjMessage( "AA99991");
			sysLog.severe(emsg, struct.getsUser_ID());
			emsg = new ExpjMessage( "ZZ01106",e.toString());
			sysLog.severe(emsg, struct.getsUser_ID());
		}
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
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0060");
		logger.entering("KQ0060010Control"+":USER="+struct.getsUser_ID(),"controlSelect");
			//{{user_implement_dev:<controlSelect>
			// TODO: ユーザ定義のコードを記述してください
			KQ0060010Struct tempStruct = new KQ0060010Struct();
			tempStruct.setIN_ITEM_CD(struct.getIN_ITEM_CD());
			tempStruct.setIN_DATE(struct.getIN_DATE());
			tempStruct.setw_BUSINESS_OPR_DATE(struct.getw_BUSINESS_OPR_DATE());
			

			
		try {
			if(tempStruct.getIN_ITEM_CD() == null || "".equals(tempStruct.getIN_ITEM_CD())){
				tempStruct.setIN_ITEM_CD("%");
			}
			if(tempStruct.getIN_DATE() == null || "".equals(tempStruct.getIN_DATE())){
				tempStruct.setIN_DATE("9999/12/31");
			}
			
			
			if(DateTool.compareYMD(tempStruct.getIN_DATE(), tempStruct.getw_BUSINESS_OPR_DATE()) < 0) {
				ExpjMessage emsg = new ExpjMessage( "AB00012" );
				msgStruct.addError( emsg );	// エラーメッセージとして登録
				sysLog.warning(emsg, getsysUSER_CD()); //エラー内容
				setReadStatus(NOT_FOUND);
				return;
			}
			
			//検索処理
			list = entity.mSelect.read(conn, tempStruct);
			
			
			if( list.size() == 0 ){
				//データが存在しない
				ExpjMessage emsg = new ExpjMessage( "ZZ06001" );
				msgStruct.addError( emsg );	// エラーメッセージとして登録
				sysLog.warning(emsg, getsysUSER_CD()); //エラー内容
				setReadStatus(NOT_FOUND);
				return;
			}else{
				//最大行数制限処理
				this.getMaxLine();
				
				//表示用データ処理
				setReadStatus(NORMAL);
			}
		} catch(SQLException e) {
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());//致命的エラー エラー内容
			ExpjException ee = new ExpjException(e, emsg); // エクセプションを生成
			emsg = new ExpjMessage( "ZZ01006", "M_ITEM.ITEM_CD:" + struct.getIN_ITEM_CD() );
			sysLog. severe (emsg ,getsysUSER_CD()); //エラー詳細
			emsg = new ExpjMessage( "ZZ01006", e.toString());
			sysLog. severe (emsg ,getsysUSER_CD()); //エクセプションの詳細情報
			throw ee;

		}catch(Exception e){
			e.printStackTrace();
			ExpjMessage emsg = new ExpjMessage( "ZZ01106");
			sysLog.severe(emsg, struct.getsUser_ID());
			ExpjException ee = new ExpjException(e,emsg);
			emsg = new ExpjMessage( "AA99991");
			sysLog.severe(emsg, struct.getsUser_ID());
			emsg = new ExpjMessage( "ZZ01106",e.toString());
			sysLog.severe(emsg, struct.getsUser_ID());
		}
                //}}user_implement_dev:<controlSelect>
		logger.exiting("KQ0060010Control"+":USER="+struct.getsUser_ID(),"controlSelect");

		return;
	}

	/**
	 * CSV出力ボタン押下時に実行される処理です。
	 *
	 */
	public void controlCSVOUT() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0060");
		logger.entering("KQ0060010Control"+":USER="+struct.getsUser_ID(),"controlCSVOUT");
			//{{user_implement_dev:<controlCSVOUT>
			// TODO: ユーザ定義のコードを記述してください
//			_sysLog.finest_d("Control：controlcsv", struct.getsUser_ID());
			csvWriter = new CsvWriter(CsvWriter.getFileName(getsysUSER_CD()));

			try {
				csvList = new ArrayList();

				// 0件の場合終了
				if(list==null || list.size() <= 0) return;

				// CSV情報の作成  
				String title[] = {
					"Expj.ITEM_CD",
				    "Expj.ITEM_NAME",
				    "Expj.Cmt0714",
				    "Expj.Cmt0715",
				    "Expj.Cmt0716",
				    "Expj.Cmt0717",
				    "Expj.Cmt0718",
				    "Expj.Cmt0327",
				    "Expj.Cmt0329",
				    "Expj.Cmt0719",
				    "Expj.PUCH_ODR_UNIT"
				};
				csvList.add(title);
				
				for(int i=0;i<this.list.size();i++){
					KQ0060010Struct tempStruct = (KQ0060010Struct)this.list.get(i);
				
					String csvStr [] = new String[title.length];
					csvStr[0] = tempStruct.getITEM_CD();
					csvStr[1] = tempStruct.getITEM_NAME();
					csvStr[2] = tempStruct.getSUM_ODR_QTY();
					csvStr[3] = tempStruct.getUNCONFIRM_ODR_QTY(); 
					csvStr[4] = tempStruct.getPLN_QTY_REMAIN();
					csvStr[5] = tempStruct.getSHIP_QTY();
					csvStr[6] = tempStruct.getODR_REM_QTY();
					csvStr[7] = tempStruct.getSUM_OD();
					csvStr[8] = tempStruct.getSUM_STOCK_ON_HAND_QTY();
					csvStr[9] = tempStruct.getQTY_DIFF();
					csvStr[10] = tempStruct.getPKG_UNIT();
					csvList.add(csvStr);
				}  
				if(csvList != null && csvList.size() > 0){
					csvWriter.write(csvList, CoreTools.getLocale(struct.getsUser_ID()),true);
					struct.setDOWNLOAD_FILE(csvWriter.getFilePath());
				}
			}catch(Exception e){
				e.printStackTrace();
				ExpjMessage emsg = new ExpjMessage( "ZZ01106");
				sysLog.severe(emsg, struct.getsUser_ID());
				ExpjException ee = new ExpjException(e,emsg);
				emsg = new ExpjMessage( "AA99991");
				sysLog.severe(emsg, struct.getsUser_ID());
				emsg = new ExpjMessage( "ZZ01106",e.toString());
				sysLog.severe(emsg, struct.getsUser_ID());
			}
                //}}user_implement_dev:<controlCSVOUT>
		logger.exiting("KQ0060010Control"+":USER="+struct.getsUser_ID(),"controlCSVOUT");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0060");
		logger.entering("KQ0060010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
			// TODO: ユーザ定義のコードを記述してください
				
				this.msgStruct.clearAll();
				this.list.clear();
				
				struct.setIN_ITEM_CD(null);
				struct.setIN_DATE(null);
				
				//表示用データ処理
				setReadStatus(INITIAL);
                //}}user_implement_dev:<controlClear>
		logger.exiting("KQ0060010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * 閉じるボタン押下時に実行される処理です。
	 *
	 */
	public void controlClose() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0060");
		logger.entering("KQ0060010Control"+":USER="+struct.getsUser_ID(),"controlClose");
			//{{user_implement_dev:<controlClose>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlClose>
		logger.exiting("KQ0060010Control"+":USER="+struct.getsUser_ID(),"controlClose");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0060");
		logger.entering("KQ0060010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("KQ0060010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0060");
		logger.entering("KQ0060010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
			// TODO: ユーザ定義のコードを記述してください
			try{
				
				// 業務日付の取得
				List listGyomuDate = entity.mselectSYS_DATE_CTRL.read(conn,struct);
				if(listGyomuDate == null || listGyomuDate.size() != 1){
					//業務日付情報が無い/複数件
					//データが存在しない
					ExpjMessage emsg = new ExpjMessage( "KR00017" );
					msgStruct.addError( emsg );	// エラーメッセージとして登録
					sysLog.warning(emsg, getsysUSER_CD()); //エラー内容
					return;
				}else{
					struct.setw_BUSINESS_OPR_DATE(((KQ0060010Struct)listGyomuDate.get(0)).getw_BUSINESS_OPR_DATE());
				}
				
				listGyomuDate = null;

				// 会社コードの取得
				 List listKaisyaCd = entity.mselectSYS_MY_COMPANY.read(conn,struct);
				 if(listKaisyaCd == null || listKaisyaCd.size() != 1){
					//会社情報が無い/複数件
					//データが存在しない
					ExpjMessage emsg = new ExpjMessage( "KQ00039" );
					msgStruct.addError( emsg );	// エラーメッセージとして登録
					sysLog.warning(emsg, getsysUSER_CD()); //エラー内容
					return;
				 }else{
					 struct.setw_COMPANY_CD(((KQ0060010Struct)listKaisyaCd.get(0)).getw_COMPANY_CD());
				 }
				
				 listKaisyaCd = null;
				
				//表示用データ処理
				setReadStatus(INITIAL);
				
			}catch(SQLException e){
				ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
				sysLog.severe(emsg, getsysUSER_CD());//致命的エラー エラー内容
				ExpjException ee = new ExpjException(e, emsg); // エクセプションを生成
				emsg = new ExpjMessage( "ZZ01006", e.toString());
				sysLog.severe (emsg ,getsysUSER_CD()); //エクセプションの詳細情報
				throw ee;
			}catch(Exception e){
				e.printStackTrace();
				ExpjMessage emsg = new ExpjMessage( "ZZ01106");
				sysLog.severe(emsg, struct.getsUser_ID());
				ExpjException ee = new ExpjException(e,emsg);
				emsg = new ExpjMessage( "AA99991");
				sysLog.severe(emsg, struct.getsUser_ID());
				emsg = new ExpjMessage( "ZZ01106",e.toString());
				sysLog.severe(emsg, struct.getsUser_ID());
			}
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("KQ0060010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * イベントハンドラの前処理です。
	 *
	 * @param buttun ボタン名
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0060");
		logger.entering("KQ0060010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");
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
			// ダウンロードファイル名クリア
			// PDF・CSVのダウンロードを行うときは、画面上にOrHiddenで「DOWNLOAD_FILE」を定義し、次の行のコメントを外してください。
			struct.setDOWNLOAD_FILE((String)null);
			// コンボボックス部品のデータのセットはここに記述してください。
			// コンボボックスデータ用意
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("KQ0060010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("CSVOUT") ) {
				controlCSVOUT();
			} else if( button.equals("Clear") ) {
				controlClear();
			} else if( button.equals("Close") ) {
				controlClose();
			} else if( button.equals("initial") ) {
				controlINITIAL();
			} else if( button.equals("reload") ) {
				controlRELOAD();
			}
		//{{user_implement_dev:<control_eventHandller>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<control_eventHandller>
		} catch( BusinessLockException ble ) {
			// 枠メッセージ出力依頼作成
			setNewDataFlg(false);
		} catch( ResourceBusyException rbe ) {
			ExpjException ee = new ExpjException(rbe, "ZZ01105");
			throw ee;
		} catch( FoundationException e ) {
//			e.printStackTrace();
//			throw new FoundationException("KQ0060010Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KQ0060010-E999","CSVの出力処理"));
			throw new FoundationException("KQ0060010Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KQ0060010-E999","システム日付の取得処理"));
				throw new FoundationException("KQ0060010Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KQ0060010-E999","コントロールのイベント処理"));
			throw new FoundationException("KQ0060010Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected KQ0060010Entity entity;
	protected KQ0060010Struct struct;
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

		entity = new KQ0060010Entity();
		struct = new KQ0060010Struct();

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
	 * KQ0060010クラスの標準コンストラクタ
	 */
	public KQ0060010Control() throws BusinessProcessException, FoundationException
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
				KQ0060010Struct key = (KQ0060010Struct)keyList.get(j);
				// メッセージキーを作成する
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE") && key.getDOWNLOAD_FILE() != null) {
					msgKey.setKeyValue("DOWNLOAD_FILE", key.getDOWNLOAD_FILE());
				}
				if(msgKeyType.containsKeyColumn("w_BUSINESS_OPR_DATE") && key.getw_BUSINESS_OPR_DATE() != null) {
					msgKey.setKeyValue("w_BUSINESS_OPR_DATE", key.getw_BUSINESS_OPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("w_PLANT_CD") && key.getw_PLANT_CD() != null) {
					msgKey.setKeyValue("w_PLANT_CD", key.getw_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("w_COMPANY_CD") && key.getw_COMPANY_CD() != null) {
					msgKey.setKeyValue("w_COMPANY_CD", key.getw_COMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_NAME") && key.getITEM_NAME() != null) {
					msgKey.setKeyValue("ITEM_NAME", key.getITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("SUM_ODR_QTY") && key.getSUM_ODR_QTY() != null) {
					msgKey.setKeyValue("SUM_ODR_QTY", key.getSUM_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("UNCONFIRM_ODR_QTY") && key.getUNCONFIRM_ODR_QTY() != null) {
					msgKey.setKeyValue("UNCONFIRM_ODR_QTY", key.getUNCONFIRM_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("PLN_QTY_REMAIN") && key.getPLN_QTY_REMAIN() != null) {
					msgKey.setKeyValue("PLN_QTY_REMAIN", key.getPLN_QTY_REMAIN());
				}
				if(msgKeyType.containsKeyColumn("SHIP_QTY") && key.getSHIP_QTY() != null) {
					msgKey.setKeyValue("SHIP_QTY", key.getSHIP_QTY());
				}
				if(msgKeyType.containsKeyColumn("ODR_REM_QTY") && key.getODR_REM_QTY() != null) {
					msgKey.setKeyValue("ODR_REM_QTY", key.getODR_REM_QTY());
				}
				if(msgKeyType.containsKeyColumn("SUM_OD") && key.getSUM_OD() != null) {
					msgKey.setKeyValue("SUM_OD", key.getSUM_OD());
				}
				if(msgKeyType.containsKeyColumn("SUM_STOCK_ON_HAND_QTY") && key.getSUM_STOCK_ON_HAND_QTY() != null) {
					msgKey.setKeyValue("SUM_STOCK_ON_HAND_QTY", key.getSUM_STOCK_ON_HAND_QTY());
				}
				if(msgKeyType.containsKeyColumn("QTY_DIFF") && key.getQTY_DIFF() != null) {
					msgKey.setKeyValue("QTY_DIFF", key.getQTY_DIFF());
				}
				if(msgKeyType.containsKeyColumn("PKG_UNIT") && key.getPKG_UNIT() != null) {
					msgKey.setKeyValue("PKG_UNIT", key.getPKG_UNIT());
				}
				if(msgKeyType.containsKeyColumn("IN_DATE") && key.getIN_DATE() != null) {
					msgKey.setKeyValue("IN_DATE", key.getIN_DATE());
				}
				if(msgKeyType.containsKeyColumn("IN_ITEM_CD") && key.getIN_ITEM_CD() != null) {
					msgKey.setKeyValue("IN_ITEM_CD", key.getIN_ITEM_CD());
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
					KQ0060010Struct key = new KQ0060010Struct();
					if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE")) {
						key.setDOWNLOAD_FILE(msgKey.getKeyValue("DOWNLOAD_FILE"));
					}
					if(msgKeyType.containsKeyColumn("w_BUSINESS_OPR_DATE")) {
						key.setw_BUSINESS_OPR_DATE(msgKey.getKeyValue("w_BUSINESS_OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("w_PLANT_CD")) {
						key.setw_PLANT_CD(msgKey.getKeyValue("w_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_COMPANY_CD")) {
						key.setw_COMPANY_CD(msgKey.getKeyValue("w_COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_NAME")) {
						key.setITEM_NAME(msgKey.getKeyValue("ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("SUM_ODR_QTY")) {
						key.setSUM_ODR_QTY(msgKey.getKeyValue("SUM_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("UNCONFIRM_ODR_QTY")) {
						key.setUNCONFIRM_ODR_QTY(msgKey.getKeyValue("UNCONFIRM_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("PLN_QTY_REMAIN")) {
						key.setPLN_QTY_REMAIN(msgKey.getKeyValue("PLN_QTY_REMAIN"));
					}
					if(msgKeyType.containsKeyColumn("SHIP_QTY")) {
						key.setSHIP_QTY(msgKey.getKeyValue("SHIP_QTY"));
					}
					if(msgKeyType.containsKeyColumn("ODR_REM_QTY")) {
						key.setODR_REM_QTY(msgKey.getKeyValue("ODR_REM_QTY"));
					}
					if(msgKeyType.containsKeyColumn("SUM_OD")) {
						key.setSUM_OD(msgKey.getKeyValue("SUM_OD"));
					}
					if(msgKeyType.containsKeyColumn("SUM_STOCK_ON_HAND_QTY")) {
						key.setSUM_STOCK_ON_HAND_QTY(msgKey.getKeyValue("SUM_STOCK_ON_HAND_QTY"));
					}
					if(msgKeyType.containsKeyColumn("QTY_DIFF")) {
						key.setQTY_DIFF(msgKey.getKeyValue("QTY_DIFF"));
					}
					if(msgKeyType.containsKeyColumn("PKG_UNIT")) {
						key.setPKG_UNIT(msgKey.getKeyValue("PKG_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("IN_DATE")) {
						key.setIN_DATE(msgKey.getKeyValue("IN_DATE"));
					}
					if(msgKeyType.containsKeyColumn("IN_ITEM_CD")) {
						key.setIN_ITEM_CD(msgKey.getKeyValue("IN_ITEM_CD"));
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
