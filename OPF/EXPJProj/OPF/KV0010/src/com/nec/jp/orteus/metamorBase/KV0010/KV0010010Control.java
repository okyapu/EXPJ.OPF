/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KV0010/src/com/nec/jp/orteus/metamorBase/KV0010/KV0010010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.KV0010;

import com.nec.jp.orteus.metamorBase.KV0010.*;
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
 // TODO: ここにimportパッケージを記述してください
//=============================
//import java.io.File;
import java.io.IOException;
//import com.nec.jp.orteus.metamorBase.util.AlarmMessage.AlarmMessage;
//import com.nec.jp.orteus.metamorBase.util.AlarmMessage.AlarmMessageException;
//import com.nec.jp.orteus.metamorBase.util.BusinessLock.BusinessLock;
//import com.nec.jp.orteus.metamorBase.util.SystemLog.SystemLog;
//import com.nec.jp.orteus.metamorBase.util.common.SystemConfig;
//import com.nec.jp.orteus.metamorBase.common.util.Converter;
//import com.nec.jp.orteus.metamorBase.common.util.ScreenParam;
//import com.nec.jp.orteus.metamorBase.common.util.ScreenPermission;
//import com.nec.jp.orteus.expj.util.MessageStruct;
import java.io.*;
//=============================
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class KV0010010Control
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
       
        // デフォルトアクセサメソッド
        protected List list;						// 結果リストのインスタンス
        public List getList() { return this.list; }			// リストを返します。
        public void setList(List listname) { this.list = listname; }	// リストをセットします。
        public int getListsize() {					// リスト型のサイズを返します。
         int nret = 0;
         if( this.list != null ) {nret = this.list.size();}
         return nret;
        }
        public Object getListvalue(int x) { return this.list.get(x); }	// リストの値（メディエータ）を返します。
       
        public KV0010010Struct getStruct() { return this.struct; }	// Structの値（メディエータ）を返します。
       
        // TODO: ユーザ定義のコードを記述してください
       // insert Original Code ===================================================
        // 単票形式部読み出し用
        protected List list1;						// 結果リストのインスタンス
        public List getList1() { return this.list1; }			// リストを返します。
        public void setList1(List listname) { this.list1 = listname; }	// リストをセットします。
        public int getList1size() {					// リスト型のサイズを返します。
         int nret = 0;
         if( this.list1 != null ) {nret = this.list1.size();}
         return nret;
        }
        // リストの値（メディエータ）を返します。
        public KV0010010Struct getList1value(int x) { return (KV0010010Struct)(this.list1.get(x)); }
       
        // 一覧形式部読み出し用
        protected List list2;						// 結果リストのインスタンス
        public List getList2() { return this.list2; }			// リストを返します。
        public void setList2(List listname) { this.list2 = listname; }	// リストをセットします。
        public int getList2size() {					// リスト型のサイズを返します。
         int nret = 0;
         if( this.list2 != null ) {nret = this.list2.size();}
         return nret;
        }
        // リストの値（メディエータ）を返します。
        public KV0010010Struct getList2value(int x) { return (KV0010010Struct)(this.list2.get(x)); }
       
       //TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT
        //// システム使用のユーザコード
        //protected String sysUSER_CD;
        //public void setsysUSER_CD(String name) { this.sysUSER_CD = name; };
        //public String getsysUSER_CD() { return this.sysUSER_CD; };
       
        //// システム使用の工場コード
        //protected String sysPLANT_CD;
        //public void setsysPLANT_CD(String name) { this.sysPLANT_CD = name; };
        //public String getsysPLANT_CD() { return this.sysPLANT_CD; };
       
        //// システム使用のユーザ名
        //protected String sysUSER_NAME;
        //public void setsysUSER_NAME(String name) { this.sysUSER_NAME = name; };
        //public String getsysUSER_NAME() { return this.sysUSER_NAME; };
       
        //// システム使用の工場名
        //protected String sysPLANT_NAME;
        //public void setsysPLANT_NAME(String name) { this.sysPLANT_NAME = name; };
        //public String getsysPLANT_NAME() { return this.sysPLANT_NAME; };
       
        //// 画面メッセージを保持
        //private MessageStruct msgStruct = new MessageStruct();
        //public MessageStruct getMsgStruct(){ return this.msgStruct;}
       
        //// システムログを保持
        //private SystemLog sysLog = new SystemLog();
        //public SystemLog getSysLog(){ return this.sysLog;}
       
        //// 画面定義情報を保持
        //private ScreenParam sp = null;
       
        //private BusinessLock bLock = null;
        //public String cancelId = "0";
       
        //public boolean doUnBusinessLock(){
        //	//ここではExceptionをもみ消す
        //	boolean doUnLock = false;
        //	try{
        //		bLock = new BusinessLock(conn,this.struct.getsUser_ID(),this.sysPLANT_CD);
        //		doUnLock = bLock.doUnLock(this.sp.getProcId(),Integer.parseInt(cancelId));
        //		if(!doUnLock){
        //			//業務ロック解除失敗
        //			throw new Exception();
        //		}
        //	}catch(Exception e){
        //		sysLog.setConnection(conn);
        //		sysLog.severe("ZZ01004",this.struct.getsUser_ID());//ロック解除失敗
        //	}
        //	return doUnLock;
        //}
       //LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL
       
        private boolean closeFlag = false;
        public boolean isCloseFlag(){
         return this.closeFlag;
        }
       
        /**
         * バッチ処理クラスを呼び出す
         *
         * @param programCLASS 処理クラス
         * @param programNAME 処理名
         * @param userID ユーザID
         * @param plantCd 工場コード
         * @return なし
         */
        private void executeBatchProgram(String programCLASS,
                                            String programNAME,
                                            String userID,
                                            String plantCd,
                                            String flg) throws Exception {
       
         try {
          // バッチ処理を実行する -------------------------------------------
          ResourceBundle bundle = SystemConfig.getBundle();
          String javaPath = SystemConfig.getProperty("JAVA_PATH", bundle);
          if(javaPath == null || "".equals(javaPath)){
           //システム既定値ファイルからの情報取得に失敗しました(ＪＶＭパス)
           //AlarmMessage almMsg = new AlarmMessage("ZZ09010", new String[0]);
           //msgStruct.getError().add(almMsg.getMessage());
           //sysLog.warning("ZZ09010", sysUSER_CD);
           ExpjMessage emsg = new ExpjMessage("ZZ09010", new String[0]);
           msgStruct.addError( emsg );
          }
          String ClassPath = SystemConfig.getProperty("CLASS_PATH", bundle);
          if(ClassPath == null || "".equals(ClassPath)){
           //システム既定値ファイルからの情報取得に失敗しました(クラスパス)
           //AlarmMessage almMsg = new AlarmMessage("ZZ09012", new String[0]);
           //msgStruct.getError().add(almMsg.getMessage());
           //sysLog.warning("ZZ09012", sysUSER_CD);
           ExpjMessage emsg = new ExpjMessage("ZZ09012", new String[0]);
           msgStruct.addError( emsg );
          }
          String batchPath = SystemConfig.getProperty("BATCH_PATH", bundle);
          if(batchPath == null || "".equals(batchPath)){
           //"システム既定値ファイルからの情報取得に失敗しました(バッチ起動設定)"
           //AlarmMessage almMsg = new AlarmMessage("ZZ09011", new String[0]);
           //msgStruct.getError().add(almMsg.getMessage());
           //sysLog.warning("ZZ09011", sysUSER_CD);
           ExpjMessage emsg = new ExpjMessage("ZZ09011", new String[0]);
           msgStruct.addError( emsg );
          }
          String txtPath = SystemConfig.getProperty("PATH_KV0020B001", bundle);
          if(txtPath == null || "".equals(txtPath)){
           //"システム既定値ファイルからの情報取得に失敗しました(バッチ起動設定)"
           //AlarmMessage almMsg = new AlarmMessage("ZZ09011", new String[0]);
           //msgStruct.getError().add(almMsg.getMessage());
           //sysLog.warning("ZZ09011", sysUSER_CD);
           ExpjMessage emsg = new ExpjMessage("ZZ09011", new String[0]);
           msgStruct.addError( emsg );
          }
          // 全ての定義情報が取得できていれば、処理を実行する。
          if ((javaPath != null && !"".equals(javaPath)) 
            && (ClassPath != null  && !"".equals(ClassPath)) 
            && (batchPath != null && !"".equals(batchPath))) {
//           String cmd = "";
//           cmd = cmd + javaPath;    // ＪＶＭ
//           cmd = cmd + " -cp ";
//           cmd = cmd + ClassPath;   // Java ClassPath
//           cmd = cmd + " -Dcom.nec.jp.orteus.util.logging.config.file=";
//           cmd = cmd + batchPath;   // D:/EXPJStudio/lib/logging.properties"; // 起動設定
//           cmd = cmd + " " + programCLASS; // 呼び出し先クラス
//           cmd = cmd + " " + programNAME;  // 呼び出し先NAME
//           cmd = cmd + " " + userID;       // ユーザID
//           cmd = cmd + " " + plantCd;      // 工場コード
//           
//           if (flg.equals("1")) {
//            String txtfile = "KV0020B001.txt";
//            cmd = cmd + " " + txtPath;
//            cmd = cmd + " " + txtfile;
//           }
//       
//           if (flg.equals("2")) {
//            String txtfile = "KV0020B005.txt";
//            cmd = cmd + " " + txtPath;
//            cmd = cmd + " " + txtfile;
//           }
//
//           if (flg.equals("3")) {
//            String direct_dlv_flg = this.struct.getg_DIRECT_DLV_FLG(); //在庫チェックなしフラグ
//            cmd = cmd + " " + direct_dlv_flg;
//           }
//           
//           if (flg.equals("4")) {
//            String txtfile = "KP0040B001.txt";
//            cmd = cmd + " " + txtPath;
//            cmd = cmd + " " + txtfile;
//           } 

           List buffer = new ArrayList();
           buffer.add(javaPath);    // ＪＶＭ
           buffer.add("-cp");
           buffer.add(ClassPath);   // Java ClassPath
           buffer.add("-Dcom.nec.jp.orteus.util.logging.config.file=" + batchPath); // D:/EXPJStudio/lib/logging.properties"; // 起動設定
           buffer.add(programCLASS); // 呼び出し先クラス
           buffer.add(programNAME);  // 呼び出し先NAME
           buffer.add(userID);       // ユーザID
           buffer.add(plantCd);      // 工場コード
           
           if (flg.equals("1")) {
            String txtfile = "KV0020B001.txt";
            buffer.add(txtPath);
            buffer.add(txtfile);
           }
       
           if (flg.equals("2")) {
            String txtfile = "KV0020B005.txt";
            buffer.add(txtPath);
            buffer.add(txtfile);
           }

           if (flg.equals("3")) {
            String direct_dlv_flg = this.struct.getg_DIRECT_DLV_FLG(); //在庫チェックなしフラグ
            buffer.add(direct_dlv_flg);
           }
           
           if (flg.equals("4")) {
            String txtfile = "KP0040B001.txt";
            buffer.add(txtPath);
            buffer.add(txtfile);
           } 
       //System.out.println("cmd" + cmd);
             
           Runtime runtime = Runtime.getRuntime();
//           Process p = runtime.exec(cmd);
           runtime.exec((String[])buffer.toArray(new String[buffer.size()]));
       
       /*
           //
           // 障害時確認用。呼び出したプログラムを監視し、標準出力を取得する。
           // 運用時はコメントアウトする。
           BufferedReader brE = new BufferedReader(new InputStreamReader(p.getErrorStream()));
           BufferedReader brO = new BufferedReader(new InputStreamReader(p.getInputStream()));
           String s;
           while ( (s = brO.readLine()) != null) {
       
           }
           while ( (s = brE.readLine()) != null) {
       
           }
           //
       */
       
           // バッチ呼び出し成功の場合、画面メッセージを表示する。
           //AlarmMessage almMsg = new AlarmMessage("ZZ09015", new String[0]);
           //msgStruct.getInfo().add(almMsg.getMessage());
           ExpjMessage emsg = new ExpjMessage("ZZ09015", new String[0]);
           msgStruct.addInfo( emsg );
          }
         } catch(IOException e) {
          // バッチ呼び出し失敗の場合、画面メッセージを表示する。
          //AlarmMessage almMsg = new AlarmMessage("ZZ09016", new String[0]);
          //msgStruct.getError().add(almMsg.getMessage());
          ExpjMessage emsg = new ExpjMessage("ZZ09016", new String[0]);
          msgStruct.addError( emsg );
          throw e;
         } catch(Exception e) {
          throw e;
         }
       
        }

        /**
         * 画面の全項目を初期化します。(2005/08/11追加)
         */
        private void initializeAll() {
         struct.setrdoPlantTyp1(null);
         struct.setrdoPlantTyp2(null);
         struct.setrdoPlantTyp3(null);
         struct.setrdoPlantTyp4("true");
         struct.setrdoPlantTyp5(null);
         struct.setrdoPlantTyp6(null);
         struct.setrdoPlantTyp7(null);
         struct.setrdoPlantTyp8(null);
         struct.setrdoPlantTyp9(null);
         struct.setg_DIRECT_DLV_FLG(null);
         initializeDetail();
        }
       
        /**
         * 画面の詳細項目を初期化します。
         * ここでは、キー以外の項目の初期化を行います。
         */
        private void initializeDetail() {
         list = null;
         readStatus = INITIAL;
        }
       //=========================================================================
       
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * 実行ボタン押下時に実行される処理です。
	 *
	 */
	public void controlexecute() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KV0010");
		logger.entering("KV0010010Control"+":USER="+struct.getsUser_ID(),"controlexecute");
			//{{user_implement_dev:<controlexecute>
              
                try {
              // insert Original Code ===================================================
                 //sysLog.setConnection(conn);
                 //this.msgStruct.clearAll();
                 // =======================================
                 // 自社情報の取得
                 // =======================================
              
                 List listCompanyInfo = entity.mgetSYS_MY_COMPANY.read(conn,struct);
                 if(listCompanyInfo == null || listCompanyInfo.size() != 1){
                  //自社情報が無い/複数件
                  // メッセージを画面出力する為
                  ExpjMessage emsg = new ExpjMessage("KQ00039");
                  msgStruct.addError( emsg );
                  return;
              //				ExpjException ee = new ExpjException( emsg);
              //				throw ee;
                 }
                 listCompanyInfo = null;
                 String programTyp1 = null;
                 String programTyp2 = null;
                 String programTyp3 = null;
                 String programTyp4 = null;
                 String programTyp5 = null;
                 String programTyp6 = null;
                 String programTyp7 = null;
                 String programTyp8 = null;
                 String programTyp9 = null;
                 String programClass = null;
                 String programName = null;
              
                 // 前回情報のクリア
                 this.list = null;
              
                 // 画面情報の取得
                 programTyp1 = this.struct.getrdoPlantTyp1();
                 programTyp2 = this.struct.getrdoPlantTyp2();
                 programTyp3 = this.struct.getrdoPlantTyp3();
                 programTyp4 = this.struct.getrdoPlantTyp4();
                 programTyp5 = this.struct.getrdoPlantTyp5();
                 programTyp6 = this.struct.getrdoPlantTyp6();
                 programTyp7 = this.struct.getrdoPlantTyp7();
                 programTyp8 = this.struct.getrdoPlantTyp8();
                 programTyp9 = this.struct.getrdoPlantTyp9();
              
                 // 工場指定の場合
                 if (programTyp1.equals("true"))    //受注情報取込
                 {
                  programClass = "com.nec.jp.orteus.metamorBase.KQ0010.KQ0010B001.mainKQ0010B001";
                  programName = "KQ0010B001";
                  // バッチ処理の実行
                  executeBatchProgram(programClass,programName,sysUSER_CD,sysPLANT_CD,"0");
                 }
                 else if(programTyp2.equals("true"))//出荷指示
                 {
                  programClass = "com.nec.jp.orteus.metamorBase.KU0010.KU0010B001.mainKU0010B001";
                  programName = "KU0010B001";
                  // バッチ処理の実行
                  executeBatchProgram(programClass,programName,sysUSER_CD,sysPLANT_CD,"3");				
                 }
                 else if(programTyp3.equals("true"))//預託検収ＥＤＩ情報取込
                 {
                  programClass = "com.nec.jp.orteus.metamorBase.KV0020.KV0020B005.mainKV0020B005";
                  programName = "KV0020B005";
                  // バッチ処理の実行
                  executeBatchProgram(programClass,programName,sysUSER_CD,sysPLANT_CD,"2");
                 }
                 else if(programTyp4.equals("true"))//ＥＤＩ注文Ⅰ／Ｆ取込
                 {
                  programClass = "com.nec.jp.orteus.metamorBase.KV0020.KV0020B001.mainKV0020B001";
                  programName = "KV0020B001";
                  // バッチ処理の実行
                  executeBatchProgram(programClass,programName,sysUSER_CD,sysPLANT_CD,"1");
                 }
                 else if(programTyp5.equals("true"))//ＥＤＩ注文Ⅰ／Ｆ個別変換
                 {
                  programClass = "com.nec.jp.orteus.metamorBase.KV0020.KV0020B002.mainKV0020B002";
                  programName = "KV0020B002";
                  // バッチ処理の実行
                  executeBatchProgram(programClass,programName,sysUSER_CD,sysPLANT_CD,"0");
                 }
                 else if(programTyp6.equals("true"))//ＥＤＩ所要計画Ⅰ／Ｆ取込
                 {
                  programClass = "com.nec.jp.orteus.metamorBase.KP0040.KP0040B001.mainKP0040B001";
                  programName = "KP0040B001";
                  // バッチ処理の実行
                  executeBatchProgram(programClass,programName,sysUSER_CD,sysPLANT_CD,"4");
                 }
                 else if(programTyp7.equals("true"))//所要計画情報取込
                 {
                  programClass = "com.nec.jp.orteus.metamorBase.KP0040.KP0040B002.mainKP0040B002";
                  programName = "KP0040B002";
                  // バッチ処理の実行
                  executeBatchProgram(programClass,programName,sysUSER_CD,sysPLANT_CD,"0");
                 }
                 else if(programTyp8.equals("true"))//所要計画残集計処理
                 {
                  programClass = "com.nec.jp.orteus.metamorBase.KP0040.KP0040B003.mainKP0040B003";
                  programName = "KP0040B003";
                  // バッチ処理の実行
                  executeBatchProgram(programClass,programName,sysUSER_CD,sysPLANT_CD,"0");
                 }
                 else if(programTyp9.equals("true"))//案件予算積上処理
                 {
                  programClass = "com.nec.jp.orteus.metamorBase.KM0060.KM0060B001.mainKM0060B001";
                  programName = "KM0060B001";
                  // バッチ処理の実行
                  executeBatchProgram(programClass,programName,sysUSER_CD,sysPLANT_CD,"0");
                 }
                 else
                 {
                  programClass = "";
                  programName = "";
                  // バッチ処理の実行
                  executeBatchProgram(programClass,programName,sysUSER_CD,sysPLANT_CD,"0");
                 }
                 
              
                } catch (Exception e) {
                 ExpjMessage emsg = new ExpjMessage("ZZ01106",new String[0]);
                 msgStruct.addError( emsg );
                 ExpjException ee = new ExpjException(e, emsg);
                 throw ee;
                } finally {
                 if (conn != null){
                  try {
                   conn.rollback();
                  } catch (FoundationException fe){
                   ExpjMessage emsg = new ExpjMessage("ZZ01106",new String[0]);
                   msgStruct.addError( emsg );
                   ExpjException ee = new ExpjException(fe, emsg);
                   throw ee;
                  }
                 }
                }
                 // TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlexecute>
		logger.exiting("KV0010010Control"+":USER="+struct.getsUser_ID(),"controlexecute");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlclear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KV0010");
		logger.entering("KV0010010Control"+":USER="+struct.getsUser_ID(),"controlclear");
			//{{user_implement_dev:<controlclear>

                // 画面を初期化(2005/08/11追加)
                initializeAll();

                //}}user_implement_dev:<controlclear>
		logger.exiting("KV0010010Control"+":USER="+struct.getsUser_ID(),"controlclear");

		return;
	}

	/**
	 * 閉じるボタン押下時に実行される処理です。
	 *
	 */
	public void controlclose() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KV0010");
		logger.entering("KV0010010Control"+":USER="+struct.getsUser_ID(),"controlclose");
			//{{user_implement_dev:<controlclose>
                 // TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlclose>
		logger.exiting("KV0010010Control"+":USER="+struct.getsUser_ID(),"controlclose");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KV0010");
		logger.entering("KV0010010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
                 // TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("KV0010010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KV0010");
		logger.entering("KV0010010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
                 // TODO: ユーザ定義のコードを記述してください
              // insert Original Code ===================================================
                //try {
                 // 共通処理 -------------------------------------------
                 // 画面定義情報の取得
                 //sp = new ScreenParam(this.getClass());
              
                 // 画面メッセージ保持オブジェクトのクリア
                 //msgStruct.clearAll();
              
                 // システムログを初期化する
                 //sysLog = new SystemLog();
                 //boolean logInit = sysLog.init(this.sp.getLogId());
                 //if(!logInit){
                 //	システムログの初期化に失敗しました
                 //	throw new AlarmMessageException("ZZ01005",new String[0]);
                 //	throw ee;
                 //}
              
                 // システムログを利用する
                 //sysLog.setConnection(conn);
              
                 //// 画面ｕrl直接指定起動の禁止
                 //try{
                 //	if(ScreenPermission.isUseful(conn, sysUSER_CD, sp.getProcId()) == false) {
                 //		throw new Exception();
                 //	}
                 //}catch(Exception e){
                 //	//この機能の使用権限がありません。
                 //	throw new AlarmMessageException("ZZ01002",new String[0]);
                 //}
              
                 // 共通処理 -------------------------------------------
              
                //} catch (Exception e) {
                 //AlarmMessageException ame = null;
                 //if(e instanceof AlarmMessageException){
                 //	ame = (AlarmMessageException)e;
                 //	ame.next();
                 //	// サーバでエラーが発生しました。
                 //	sysLog.severe("ZZ01106", sysUSER_CD, ame.getMessage()); 
                 //	ame.resetCurrent();
                 //}else{
                 //	ame = new AlarmMessageException("ZZ01106", new String[0]);
                 //	sysLog.severe("ZZ01106", sysUSER_CD); // サーバでエラーが発生しました。
                 //	sysLog.severe("ZZ01106", sysUSER_CD, e.toString()); // サーバでエラーが発生しました。
                 //}
                 //throw ame;
                //}
              //=========================================================================
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("KV0010010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * イベントハンドラの前処理です。
	 *
	 * @param buttun ボタン名
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KV0010");
		logger.entering("KV0010010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
                 // PDF・CSVのダウンロードを行うときは、画面上にOrHiddenで「DOWNLOAD_FILE」を定義し、
                 //次の行のコメントを外してください。
              
              //			struct.setDOWNLOAD_FILE((String)null);
                 // コンボボックス部品のデータのセットはここに記述してください。
                 // コンボボックスデータ用意
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("KV0010010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			if( button.equals("execute") ) {
				controlexecute();
			} else if( button.equals("clear") ) {
				controlclear();
			} else if( button.equals("close") ) {
				controlclose();
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
//			throw new FoundationException("KV0010010Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KV0010010-E999","CSVの出力処理"));
			throw new FoundationException("KV0010010Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KV0010010-E999","システム日付の取得処理"));
				throw new FoundationException("KV0010010Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
                 // TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KV0010010-E999","コントロールのイベント処理"));
			throw new FoundationException("KV0010010Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected KV0010010Entity entity;
	protected KV0010010Struct struct;
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

		entity = new KV0010010Entity();
		struct = new KV0010010Struct();

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
	 * KV0010010クラスの標準コンストラクタ
	 */
	public KV0010010Control() throws BusinessProcessException, FoundationException
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
				KV0010010Struct key = (KV0010010Struct)keyList.get(j);
				// メッセージキーを作成する
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("rdoPlantTyp1") && key.getrdoPlantTyp1() != null) {
					msgKey.setKeyValue("rdoPlantTyp1", key.getrdoPlantTyp1());
				}
				if(msgKeyType.containsKeyColumn("rdoPlantTyp2") && key.getrdoPlantTyp2() != null) {
					msgKey.setKeyValue("rdoPlantTyp2", key.getrdoPlantTyp2());
				}
				if(msgKeyType.containsKeyColumn("rdoPlantTyp3") && key.getrdoPlantTyp3() != null) {
					msgKey.setKeyValue("rdoPlantTyp3", key.getrdoPlantTyp3());
				}
				if(msgKeyType.containsKeyColumn("rdoPlantTyp4") && key.getrdoPlantTyp4() != null) {
					msgKey.setKeyValue("rdoPlantTyp4", key.getrdoPlantTyp4());
				}
				if(msgKeyType.containsKeyColumn("rdoPlantTyp5") && key.getrdoPlantTyp5() != null) {
					msgKey.setKeyValue("rdoPlantTyp5", key.getrdoPlantTyp5());
				}
				if(msgKeyType.containsKeyColumn("g_DIRECT_DLV_FLG") && key.getg_DIRECT_DLV_FLG() != null) {
					msgKey.setKeyValue("g_DIRECT_DLV_FLG", key.getg_DIRECT_DLV_FLG());
				}
				if(msgKeyType.containsKeyColumn("rdoPlantTyp6") && key.getrdoPlantTyp6() != null) {
					msgKey.setKeyValue("rdoPlantTyp6", key.getrdoPlantTyp6());
				}
				if(msgKeyType.containsKeyColumn("rdoPlantTyp7") && key.getrdoPlantTyp7() != null) {
					msgKey.setKeyValue("rdoPlantTyp7", key.getrdoPlantTyp7());
				}
				if(msgKeyType.containsKeyColumn("rdoPlantTyp8") && key.getrdoPlantTyp8() != null) {
					msgKey.setKeyValue("rdoPlantTyp8", key.getrdoPlantTyp8());
				}
				if(msgKeyType.containsKeyColumn("rdoPlantTyp9") && key.getrdoPlantTyp9() != null) {
					msgKey.setKeyValue("rdoPlantTyp9", key.getrdoPlantTyp9());
				}
				if(msgKeyType.containsKeyColumn("my_COMPANY_CD") && key.getmy_COMPANY_CD() != null) {
					msgKey.setKeyValue("my_COMPANY_CD", key.getmy_COMPANY_CD());
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
					KV0010010Struct key = new KV0010010Struct();
					if(msgKeyType.containsKeyColumn("rdoPlantTyp1")) {
						key.setrdoPlantTyp1(msgKey.getKeyValue("rdoPlantTyp1"));
					}
					if(msgKeyType.containsKeyColumn("rdoPlantTyp2")) {
						key.setrdoPlantTyp2(msgKey.getKeyValue("rdoPlantTyp2"));
					}
					if(msgKeyType.containsKeyColumn("rdoPlantTyp3")) {
						key.setrdoPlantTyp3(msgKey.getKeyValue("rdoPlantTyp3"));
					}
					if(msgKeyType.containsKeyColumn("rdoPlantTyp4")) {
						key.setrdoPlantTyp4(msgKey.getKeyValue("rdoPlantTyp4"));
					}
					if(msgKeyType.containsKeyColumn("rdoPlantTyp5")) {
						key.setrdoPlantTyp5(msgKey.getKeyValue("rdoPlantTyp5"));
					}
					if(msgKeyType.containsKeyColumn("g_DIRECT_DLV_FLG")) {
						key.setg_DIRECT_DLV_FLG(msgKey.getKeyValue("g_DIRECT_DLV_FLG"));
					}
					if(msgKeyType.containsKeyColumn("rdoPlantTyp6")) {
						key.setrdoPlantTyp6(msgKey.getKeyValue("rdoPlantTyp6"));
					}
					if(msgKeyType.containsKeyColumn("rdoPlantTyp7")) {
						key.setrdoPlantTyp7(msgKey.getKeyValue("rdoPlantTyp7"));
					}
					if(msgKeyType.containsKeyColumn("rdoPlantTyp8")) {
						key.setrdoPlantTyp8(msgKey.getKeyValue("rdoPlantTyp8"));
					}
					if(msgKeyType.containsKeyColumn("rdoPlantTyp9")) {
						key.setrdoPlantTyp9(msgKey.getKeyValue("rdoPlantTyp9"));
					}
					if(msgKeyType.containsKeyColumn("my_COMPANY_CD")) {
						key.setmy_COMPANY_CD(msgKey.getKeyValue("my_COMPANY_CD"));
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
