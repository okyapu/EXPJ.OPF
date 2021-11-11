/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AC0010/src/com/nec/jp/orteus/metamorBase/AC0010/AC0010020Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AC0010;

import com.nec.jp.orteus.metamorBase.AC0010.*;
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

public class AC0010020Control
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
        public AC0010020Struct getListvalue(int x) { return (AC0010020Struct)(this.list.get(x)); }	// リストの値を返します。
        public AC0010020Struct getStruct() { return this.struct; }	// Structを返します。
        public AC0010020Struct createStruct() { return new AC0010020Struct(); }	// 新しいStructを作って返します。
        public void setStruct(Object structname) { this.struct.setStruct((AC0010020Struct)structname); }	// Structをセットします。
        public void initializeStruct() { this.struct.initialize(); }	// Structの値を初期化します。
       
        // CSV出力用リスト
        private CsvWriter csvWriter = null;
        public CsvWriter getCsvWriter(){ return this.csvWriter; }
       
        private CsvReader csvReader = null;
        public void setCsvReader(CsvReader cr){ this.csvReader = cr; }
       
        // TODO: ユーザ定義のコードを記述してください
       
       
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * 印刷ボタン押下時に実行される処理です。
	 *
	 */
	public void controlPrint() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0010");
		logger.entering("AC0010020Control"+":USER="+struct.getsUser_ID(),"controlPrint");
			AC0010020Struct strPdf = null;

		int ret = 0;
		String printType      = getPdfOutputType();
		String printPattern   = getPdfOutputListPattern();
		String printer        = getPdfOutputPrinter();
		SvfWrapper svf        = new SvfWrapper(printType, getsysUSER_CD(), printer);

			//{{user_implement_dev:<controlPrint>
                 // TODO: ユーザ定義のコードを記述してください
              
                try {
              
                 //工場コードのチェック
                 List dataList = null;
                 struct.setIN_PLANT_CD(struct.getPLANT_CD());
                 if (struct.getPLANT_CD() != null && struct.getPLANT_CD().length() > 0) {
                  dataList = entity.mselect_M_PLANT.read(conn,struct);
                  if(dataList.size() == 0){
                   ExpjMessage expjMsg = new ExpjMessage("AC00102");
                   msgStruct.addError(expjMsg);
                   return;
                  }
                 }
              
                 //所要量アラームリストの読み込み
                 struct.setIN_MRP_DATE_FROM(struct.getMRP_DATE_FROM());
                 struct.setIN_MRP_DATE_TO(struct.getMRP_DATE_TO());
                 if (struct.getJOB_ODR_CD() != null && struct.getJOB_ODR_CD().equals("%")) {
                  struct.setIN_JOB_ODR_CD(null);
                 } else {
                  struct.setIN_JOB_ODR_CD(struct.getJOB_ODR_CD());
                 }
                 if (struct.getc_CHECK3().equals("true")) {
                  struct.setIN_c_CHECK3("1");
                 } else {
                  struct.setIN_c_CHECK3("0");
                 }
                 //印刷処理の開始
                 String printId1 = "AC00100201";	// 帳票IDを指定してください  
                 
                 ret = svf.VrInit(printId1);	// PDF作成開始    
                 pdfFilePath = svf.getPdfFilePath();	// pdfフルパスファイル名
                 pdfFileName = svf.getPdfFileName();	// pdfファイル名（Web用）
     			/* クエリーファイルの指定 */
    			if (dbKIND != null && !dbKIND.equals("")) {
    				ret = svf.VrSetQuery("KIND=" + dbKIND + ";UID=" + dbUID
    						+ ";PWD=" + dbPWD + ";DBQ=" + dbDBQ);
    			} else {
    				ret = svf.VrSetQuery("UID=" + dbUID + ";PWD=" + dbPWD + ";DBQ="
    						+ dbDBQ);
    			}   		
     			
     			String MRP_DATE_FROM = struct.getMRP_DATE_FROM();
     			String MRP_DATE_TO = struct.getMRP_DATE_TO();
     			String JOB_ODR_CD = struct.getJOB_ODR_CD();     			
     			
     			if ((MRP_DATE_FROM == null) || ("".equals(MRP_DATE_FROM))) {
     				MRP_DATE_FROM = "1000/01/01";
     			}
     			if ((MRP_DATE_TO == null) || ("".equals(MRP_DATE_TO))) {
     				MRP_DATE_TO = "9999/12/31";
     			}
     			if ((JOB_ODR_CD == null) || ("".equals(JOB_ODR_CD))) {
     				JOB_ODR_CD = "%";
     			}   
     			
     			beginTransaction();    					
     			
     			/* クエリー抽出条件の指定 */     		
     			ret = svf.VrCondition("[X|PLANT_CD]=" + struct.getPLANT_CD(), 4);
     			ret = svf.VrCondition("[X|MRP_DATE_FROM]=" + MRP_DATE_FROM, 4);
     			ret = svf.VrCondition("[X|MRP_DATE_TO]=" + MRP_DATE_TO, 4);
     			ret = svf.VrCondition("[X|JOB_ODR_CD]=" + JOB_ODR_CD, 4);     			
     			ret = svf.VrCondition("[X|OD_ALARM_FLG]=" + struct.getIN_c_CHECK3(), 4);
     			ret = svf.VrCondition("[X|PRINT_DATE]=" + struct.getsSysdate(), 4);
     			
     			/* クエリー実行 */
     			ret = svf.VrReport();
     			if(ret == -554) {
     				ExpjMessage emsg = new ExpjMessage("AC50700");
     				msgStruct.addError(emsg);
     				sysLog.warning(emsg, sysUSER_CD);
     				return;
     			}

     			/* PDF作成終了 */
     			ret = svf.VrQuit();
     			if ( "0".equals(printType) ) {	// クライアント印刷の場合
     				struct.setDOWNLOAD_FILE(getPdfFileName());
     			}
     			else if ( "1".equals(printType) ) {
     				try {
    					String acrobatPath = svf.getAcrobatPath();
    					String acrobatOption1 = svf.getAcrobatOption1();
    					String acrobatOption2 = svf.getAcrobatOption2();
    					String pdfPrinter = svf.getPrinter();
    					Runtime.getRuntime().exec(new String[]{acrobatPath, acrobatOption1, acrobatOption2, pdfFilePath, pdfPrinter});
     					//Runtime.getRuntime().exec(svf.getExecuteOutput());
     				}catch(IOException e){
     					// サーバ印刷失敗時のエラー処理を記述してください。
     				    ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
                        sysLog.severe(emsg, getsysUSER_CD());//致命的エラー エラー内容
                        ExpjException ee = new ExpjException(e, emsg); // エクセプションを生成
                        throw ee;
     				}
     			}                 
               
                 // 所要量アラームリスト発行済みフラグの更新
                 if (struct.getIN_c_CHECK3().equals("0")) {
              
                  //指定されなかった検索条件を加工します
                  if (struct.getIN_PLANT_CD() == null || struct.getIN_PLANT_CD().length() == 0) {
                   struct.setIN_PLANT_CD("%");
                  }
                  if (struct.getIN_MRP_DATE_FROM() == null || struct.getIN_MRP_DATE_FROM().length() == 0) {
                   struct.setIN_MRP_DATE_FROM("1900/01/01");
                  }
                  if (struct.getIN_MRP_DATE_TO() == null || struct.getIN_MRP_DATE_TO().length() == 0) {
                   struct.setIN_MRP_DATE_TO("2999/12/31");
                  }
                  if (struct.getIN_JOB_ODR_CD() == null || struct.getIN_JOB_ODR_CD().length() == 0) {
                   struct.setIN_JOB_ODR_CD("%");
                  }
              
                  //更新します
                  if (struct.getIN_JOB_ODR_CD().equals("%")) {
                   entity.mModifyT_OD_ALARM2.update(conn, struct);
                  } else {
                   entity.mModifyT_OD_ALARM.update(conn, struct);
                  }
                 }
              
              
              //			objMessage.m_writer.write(Level.INFO, "file=" + svf.VrGetSpoolFileName() + "に出力");
              
                }catch(SQLException e){
                 e.printStackTrace();
                 ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
                 sysLog.severe(emsg, getsysUSER_CD());//致命的エラー エラー内容
                 ExpjException ee = new ExpjException(e, emsg); // エクセプションを生成
                 throw ee;
                }catch(Exception e) {
                 e.printStackTrace();
                 ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
                 sysLog.severe(emsg, getsysUSER_CD());//致命的エラー エラー内容
                 ExpjException ee = new ExpjException(e, emsg); // エクセプションを生成
                 throw ee;
                } finally {			//
                }
                //}}user_implement_dev:<controlPrint>
		logger.exiting("AC0010020Control"+":USER="+struct.getsUser_ID(),"controlPrint");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0010");
		logger.entering("AC0010020Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
              
                 // TODO: ユーザ定義のコードを記述してください
              
                try{
                 //業務運用日の取得
                 struct.setuser_PLANT_CD(getsysPLANT_CD());
                 list = entity.mselectSYS_DATE_CTRL.read(conn,struct);
                 AC0010020Struct strDate = null;
                 strDate = (AC0010020Struct)list.get(0);
                 struct.setBUSINESS_OPR_DATE(strDate.getBUSINESS_OPR_DATE());
                 //デフォルト工場コードの設定
                 struct.setPLANT_CD(getsysPLANT_CD());
                } catch(SQLException e) {
                 e.printStackTrace();
                 ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
                 sysLog.severe(emsg, getsysUSER_CD());//致命的エラー エラー内容
                 ExpjException ee = new ExpjException(e, emsg); // エクセプションを生成
                 throw ee;
                }catch(Exception e) {
                 e.printStackTrace();
                 ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
                 sysLog.severe(emsg, getsysUSER_CD());//致命的エラー エラー内容
                 ExpjException ee = new ExpjException(e, emsg); // エクセプションを生成
                 throw ee;
                }
                //}}user_implement_dev:<controlClear>
		logger.exiting("AC0010020Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * 閉じるボタン押下時に実行される処理です。
	 *
	 */
	public void controlClose() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0010");
		logger.entering("AC0010020Control"+":USER="+struct.getsUser_ID(),"controlClose");
			//{{user_implement_dev:<controlClose>
                 // TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlClose>
		logger.exiting("AC0010020Control"+":USER="+struct.getsUser_ID(),"controlClose");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0010");
		logger.entering("AC0010020Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
                 // TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AC0010020Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0010");
		logger.entering("AC0010020Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
                 // TODO: ユーザ定義のコードを記述してください
                try{
                 // 画面遷移の呼び出しだったら、Structに画面遷移キーを設定してcontrolSelect()を呼び出す
                 if ( isScreenMove() == true ) {
                  // 検索のコントロールメソッドを呼び出します。
              //				controlSelect();
                 }
              
                 //業務運用日の取得
                 struct.setuser_PLANT_CD(getsysPLANT_CD());
                 list = entity.mselectSYS_DATE_CTRL.read(conn,struct);
                 AC0010020Struct strDate = null;
                 strDate = (AC0010020Struct)list.get(0);
                 struct.setBUSINESS_OPR_DATE(strDate.getBUSINESS_OPR_DATE());
                 //デフォルト工場コードの設定
                 struct.setPLANT_CD(getsysPLANT_CD());
              
                } catch(SQLException e) {
                 e.printStackTrace();
                 ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
                 sysLog.severe(emsg, getsysUSER_CD());//致命的エラー エラー内容
                 ExpjException ee = new ExpjException(e, emsg); // エクセプションを生成
                 throw ee;
                }catch(Exception e) {
                 e.printStackTrace();
                 ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
                 sysLog.severe(emsg, getsysUSER_CD());//致命的エラー エラー内容
                 ExpjException ee = new ExpjException(e, emsg); // エクセプションを生成
                 throw ee;
                }
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AC0010020Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * イベントハンドラの前処理です。
	 *
	 * @param buttun ボタン名
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0010");
		logger.entering("AC0010020Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");
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
              //			conn.beginTransWeb();
                 struct.setDOWNLOAD_FILE((String)null);
                 // コンボボックス部品のデータのセットはここに記述してください。
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("AC0010020Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			if( button.equals("Print") ) {
				controlPrint();
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
//			throw new FoundationException("AC0010020Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AC0010020-E999","CSVの出力処理"));
			throw new FoundationException("AC0010020Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AC0010020-E999","システム日付の取得処理"));
				throw new FoundationException("AC0010020Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
                 // TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AC0010020-E999","コントロールのイベント処理"));
			throw new FoundationException("AC0010020Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected AC0010020Entity entity;
	protected AC0010020Struct struct;
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

		entity = new AC0010020Entity();
		struct = new AC0010020Struct();

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
	 * AC0010020クラスの標準コンストラクタ
	 */
	public AC0010020Control() throws BusinessProcessException, FoundationException
	{
		initialize();

		//conn = connect();
		//{{user_implement_code_constractor
		
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
				AC0010020Struct key = (AC0010020Struct)keyList.get(j);
				// メッセージキーを作成する
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("PRINT_DATE") && key.getPRINT_DATE() != null) {
					msgKey.setKeyValue("PRINT_DATE", key.getPRINT_DATE());
				}
				if(msgKeyType.containsKeyColumn("PAGE_NO") && key.getPAGE_NO() != null) {
					msgKey.setKeyValue("PAGE_NO", key.getPAGE_NO().toString());
				}
				if(msgKeyType.containsKeyColumn("TOTAL_PAGE") && key.getTOTAL_PAGE() != null) {
					msgKey.setKeyValue("TOTAL_PAGE", key.getTOTAL_PAGE().toString());
				}
				if(msgKeyType.containsKeyColumn("c_CHECK3") && key.getc_CHECK3() != null) {
					msgKey.setKeyValue("c_CHECK3", key.getc_CHECK3());
				}
				if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE") && key.getDOWNLOAD_FILE() != null) {
					msgKey.setKeyValue("DOWNLOAD_FILE", key.getDOWNLOAD_FILE());
				}
				if(msgKeyType.containsKeyColumn("SUBMIT_BUTTON_TYPE") && key.getSUBMIT_BUTTON_TYPE() != null) {
					msgKey.setKeyValue("SUBMIT_BUTTON_TYPE", key.getSUBMIT_BUTTON_TYPE());
				}
				if(msgKeyType.containsKeyColumn("PRINTER_TYPE") && key.getPRINTER_TYPE() != null) {
					msgKey.setKeyValue("PRINTER_TYPE", key.getPRINTER_TYPE());
				}
				if(msgKeyType.containsKeyColumn("SELECTED_PRINTER") && key.getSELECTED_PRINTER() != null) {
					msgKey.setKeyValue("SELECTED_PRINTER", key.getSELECTED_PRINTER());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("MRP_DATE_FROM") && key.getMRP_DATE_FROM() != null) {
					msgKey.setKeyValue("MRP_DATE_FROM", key.getMRP_DATE_FROM());
				}
				if(msgKeyType.containsKeyColumn("MRP_DATE_TO") && key.getMRP_DATE_TO() != null) {
					msgKey.setKeyValue("MRP_DATE_TO", key.getMRP_DATE_TO());
				}
				if(msgKeyType.containsKeyColumn("ITEM_NAME") && key.getITEM_NAME() != null) {
					msgKey.setKeyValue("ITEM_NAME", key.getITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("ODR_QTY") && key.getODR_QTY() != null) {
					msgKey.setKeyValue("ODR_QTY", key.getODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("IN_PLANT_CD") && key.getIN_PLANT_CD() != null) {
					msgKey.setKeyValue("IN_PLANT_CD", key.getIN_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("IN_MRP_DATE_FROM") && key.getIN_MRP_DATE_FROM() != null) {
					msgKey.setKeyValue("IN_MRP_DATE_FROM", key.getIN_MRP_DATE_FROM());
				}
				if(msgKeyType.containsKeyColumn("IN_MRP_DATE_TO") && key.getIN_MRP_DATE_TO() != null) {
					msgKey.setKeyValue("IN_MRP_DATE_TO", key.getIN_MRP_DATE_TO());
				}
				if(msgKeyType.containsKeyColumn("IN_JOB_ODR_CD") && key.getIN_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("IN_JOB_ODR_CD", key.getIN_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("user_PLANT_CD") && key.getuser_PLANT_CD() != null) {
					msgKey.setKeyValue("user_PLANT_CD", key.getuser_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("PLANT_NAME") && key.getPLANT_NAME() != null) {
					msgKey.setKeyValue("PLANT_NAME", key.getPLANT_NAME());
				}
				if(msgKeyType.containsKeyColumn("OD_NO") && key.getOD_NO() != null) {
					msgKey.setKeyValue("OD_NO", key.getOD_NO());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("MRP_DATE") && key.getMRP_DATE() != null) {
					msgKey.setKeyValue("MRP_DATE", key.getMRP_DATE());
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
				if(msgKeyType.containsKeyColumn("DUE_DATE") && key.getDUE_DATE() != null) {
					msgKey.setKeyValue("DUE_DATE", key.getDUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("PRD_DUE_DATE") && key.getPRD_DUE_DATE() != null) {
					msgKey.setKeyValue("PRD_DUE_DATE", key.getPRD_DUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("DM_QTY") && key.getDM_QTY() != null) {
					msgKey.setKeyValue("DM_QTY", key.getDM_QTY());
				}
				if(msgKeyType.containsKeyColumn("MSG") && key.getMSG() != null) {
					msgKey.setKeyValue("MSG", key.getMSG());
				}
				if(msgKeyType.containsKeyColumn("IN_c_CHECK3") && key.getIN_c_CHECK3() != null) {
					msgKey.setKeyValue("IN_c_CHECK3", key.getIN_c_CHECK3());
				}
				if(msgKeyType.containsKeyColumn("BUSINESS_OPR_DATE") && key.getBUSINESS_OPR_DATE() != null) {
					msgKey.setKeyValue("BUSINESS_OPR_DATE", key.getBUSINESS_OPR_DATE());
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
					AC0010020Struct key = new AC0010020Struct();
					if(msgKeyType.containsKeyColumn("PRINT_DATE")) {
						key.setPRINT_DATE(msgKey.getKeyValue("PRINT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("PAGE_NO")) {
						key.setPAGE_NO(new Integer(msgKey.getKeyValue("PAGE_NO")));
					}
					if(msgKeyType.containsKeyColumn("TOTAL_PAGE")) {
						key.setTOTAL_PAGE(new Integer(msgKey.getKeyValue("TOTAL_PAGE")));
					}
					if(msgKeyType.containsKeyColumn("c_CHECK3")) {
						key.setc_CHECK3(msgKey.getKeyValue("c_CHECK3"));
					}
					if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE")) {
						key.setDOWNLOAD_FILE(msgKey.getKeyValue("DOWNLOAD_FILE"));
					}
					if(msgKeyType.containsKeyColumn("SUBMIT_BUTTON_TYPE")) {
						key.setSUBMIT_BUTTON_TYPE(msgKey.getKeyValue("SUBMIT_BUTTON_TYPE"));
					}
					if(msgKeyType.containsKeyColumn("PRINTER_TYPE")) {
						key.setPRINTER_TYPE(msgKey.getKeyValue("PRINTER_TYPE"));
					}
					if(msgKeyType.containsKeyColumn("SELECTED_PRINTER")) {
						key.setSELECTED_PRINTER(msgKey.getKeyValue("SELECTED_PRINTER"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("MRP_DATE_FROM")) {
						key.setMRP_DATE_FROM(msgKey.getKeyValue("MRP_DATE_FROM"));
					}
					if(msgKeyType.containsKeyColumn("MRP_DATE_TO")) {
						key.setMRP_DATE_TO(msgKey.getKeyValue("MRP_DATE_TO"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_NAME")) {
						key.setITEM_NAME(msgKey.getKeyValue("ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ODR_QTY")) {
						key.setODR_QTY(msgKey.getKeyValue("ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("IN_PLANT_CD")) {
						key.setIN_PLANT_CD(msgKey.getKeyValue("IN_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("IN_MRP_DATE_FROM")) {
						key.setIN_MRP_DATE_FROM(msgKey.getKeyValue("IN_MRP_DATE_FROM"));
					}
					if(msgKeyType.containsKeyColumn("IN_MRP_DATE_TO")) {
						key.setIN_MRP_DATE_TO(msgKey.getKeyValue("IN_MRP_DATE_TO"));
					}
					if(msgKeyType.containsKeyColumn("IN_JOB_ODR_CD")) {
						key.setIN_JOB_ODR_CD(msgKey.getKeyValue("IN_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("user_PLANT_CD")) {
						key.setuser_PLANT_CD(msgKey.getKeyValue("user_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_NAME")) {
						key.setPLANT_NAME(msgKey.getKeyValue("PLANT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("OD_NO")) {
						key.setOD_NO(msgKey.getKeyValue("OD_NO"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("MRP_DATE")) {
						key.setMRP_DATE(msgKey.getKeyValue("MRP_DATE"));
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
					if(msgKeyType.containsKeyColumn("DUE_DATE")) {
						key.setDUE_DATE(msgKey.getKeyValue("DUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("PRD_DUE_DATE")) {
						key.setPRD_DUE_DATE(msgKey.getKeyValue("PRD_DUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("DM_QTY")) {
						key.setDM_QTY(msgKey.getKeyValue("DM_QTY"));
					}
					if(msgKeyType.containsKeyColumn("MSG")) {
						key.setMSG(msgKey.getKeyValue("MSG"));
					}
					if(msgKeyType.containsKeyColumn("IN_c_CHECK3")) {
						key.setIN_c_CHECK3(msgKey.getKeyValue("IN_c_CHECK3"));
					}
					if(msgKeyType.containsKeyColumn("BUSINESS_OPR_DATE")) {
						key.setBUSINESS_OPR_DATE(msgKey.getKeyValue("BUSINESS_OPR_DATE"));
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
