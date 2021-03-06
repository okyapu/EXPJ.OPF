/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KP0050/src/com/nec/jp/orteus/metamorBase/KP0050/KP0050010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.KP0050;

import com.nec.jp.orteus.metamorBase.KP0050.*;
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
	import java.io.IOException;
//}}user_implement_code_import

//{{user_implement_code_header
/**
 * CLASS     : KP0050010Control クラス
 * ファイル・クラス説明
 * @author $Author: geng-jia $
 * @version $Revision: 1.11 $ $Date: 2015/12/03 08:53:55 $
 *
 */
//}}user_implement_code_header

public class KP0050010Control
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
	protected List list;											// 結果リストのインスタンス
	public List getList() { return this.list; }						// リストを返します。
	public void setList(List listname) { this.list = listname; }	// リストをセットします。
	public int getListsize() {										// リスト型のサイズを返します。
		int nret = 0;
		if( this.list != null ) {nret = this.list.size();}
		return nret;
	}
//	public Object getListvalue(int x) { return this.list.get(x); }	// リストの値を返します。
	public KP0050010Struct getListvalue(int x) { return (KP0050010Struct)(this.list.get(x)); }	// リストの値を返します。
	public KP0050010Struct getStruct() { return this.struct; }	// Structの値を返します。
	public KP0050010Struct createStruct() { return new KP0050010Struct(); }	// 新しいStructを作って返します。
	public void setStruct(Object structname) { this.struct.setStruct((KP0050010Struct)structname); }	// Structをセットします。
	public void initializeStruct() { this.struct.initialize(); }	// Structの値を初期化します。

	// CSV出力用リスト
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }
	// TODO: ユーザ定義のコードを記述してください
	/**
	* バッチ処理クラスを呼び出す
	*
	* @param userID ユーザID
	* @param plantTyp 処理区分（工場指定タイプ）
	* @param plantCd 工場コード
	* @return なし
	*/
	private void executeBatchProgram(String plantCd) throws Exception {
		try {
			// バッチ処理を実行する -------------------------------------------
			ResourceBundle bundle = SystemConfig.getBundle();
			String javaPath = SystemConfig.getProperty("JAVA_PATH", bundle);
			if(javaPath == null){
				//システム既定値ファイルからの情報取得に失敗しました(ＪＶＭパス)
				ExpjMessage emsg = new ExpjMessage("ZZ09010", new String[0]);
				msgStruct.addError( emsg );
			}
			String ClassPath = SystemConfig.getProperty("CLASS_PATH", bundle);
			if(ClassPath == null){
				//システム既定値ファイルからの情報取得に失敗しました(クラスパス)
				ExpjMessage emsg = new ExpjMessage("ZZ09012", new String[0]);
				msgStruct.addError( emsg );
			}
			String batchPath = SystemConfig.getProperty("BATCH_PATH", bundle);
			if(batchPath == null){
				//"システム既定値ファイルからの情報取得に失敗しました(バッチ起動設定)"
				ExpjMessage emsg = new ExpjMessage("ZZ09011", new String[0]);
				msgStruct.addError( emsg );
			}
			// 固定値をセット
				String batchProcessingTyp = "2";		  // 画面より起動：2／自動運転：1
				String ProgID = "KP0050B001";		  // 呼出先の業務ID
				String userID = struct.getsUser_ID(); // ログインユーザID
				String userPlantCD = struct.getstrPLANT_CD();// ユーザ所属工場

			ExpjMessage emsg = new ExpjMessage("ZZ09013", new String[0]);
			msgStruct.addInfo( emsg );
			
			 // 全ての定義情報が取得できていれば、処理を実行する。
			if ((javaPath != null) && (ClassPath != null) && (batchPath != null)) {

//				String cmd = "";
//				cmd = cmd + javaPath;    // ＪＶＭ
//				cmd = cmd + " -cp ";
//				cmd = cmd + ClassPath;   // Java ClassPath
//				cmd = cmd + " -Dcom.nec.jp.orteus.util.logging.config.file=";
//				cmd = cmd + batchPath;   // D:/OrteusStudio/lib/logging.properties"; // 起動設定
//				cmd = cmd + " " + "com.nec.jp.orteus.metamorBase.KP0050.KP0050B001.mainKP0050B001"; // 呼び出し先クラス
//				cmd = cmd + " " + batchProcessingTyp;
//				cmd = cmd + " " + userID;     // ユーザID
//				cmd = cmd + " " + userPlantCD;// ユーザ所属工場
//				cmd = cmd + " " + ProgID;      // 業務ID
//				cmd = cmd + " " + this.struct.getrdoPlanTyp();     // 販売所要登録タイプ 1:計画期間の初日 2:計画期間の末日 3:計画期間で分散
//				cmd = cmd + " " + plantCd;      // 工場コード
				
				List buffer = new ArrayList();
				buffer.add(javaPath);    // ＪＶＭ
				buffer.add("-cp");
				buffer.add(ClassPath);   // Java ClassPath
				buffer.add("-Dcom.nec.jp.orteus.util.logging.config.file=" + batchPath); // D:/OrteusStudio/lib/logging.properties"; // 起動設定
				buffer.add("com.nec.jp.orteus.metamorBase.KP0050.KP0050B001.mainKP0050B001"); // 呼び出し先クラス
				buffer.add(batchProcessingTyp);
				buffer.add(userID);     // ユーザID
				buffer.add(userPlantCD);// ユーザ所属工場
				buffer.add(ProgID);      // 業務ID
				buffer.add(this.struct.getrdoPlanTyp());     // 販売所要登録タイプ 1:計画期間の初日 2:計画期間の末日 3:計画期間で分散
				buffer.add(plantCd);      // 工場コード
				
				//System.out.println(cmd);
				Runtime runtime = Runtime.getRuntime();
//				Process p = runtime.exec(cmd);
				runtime.exec((String[])buffer.toArray(new String[buffer.size()]));

			}
		} catch(IOException e) {
			// バッチ呼び出し失敗の場合、画面メッセージを表示する。
			e.printStackTrace();
			ExpjMessage emsg = new ExpjMessage("ZZ09016", new String[0]);
			msgStruct.addError( emsg );
		} catch(Exception e) {
			e.printStackTrace();
			ExpjMessage emsg = new ExpjMessage("ZZ09016", new String[0]);
			msgStruct.addError( emsg );
		}
	}
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * 実行ボタン押下時に実行される処理です。
	 *
	 */
	public void controlexecute() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KP0050");
		logger.entering("KP0050010Control"+":USER="+struct.getsUser_ID(),"controlexecute");
			//{{user_implement_dev:<controlexecute>
		// TODO: ユーザ定義のコードを記述してください
		try {
			
			List listSysInfo = new ArrayList();
			listSysInfo = entity.mgetSYS_PARAM.read(conn,struct);
			if(listSysInfo == null || listSysInfo.size() != 1) {
				//システムパラメータ情報が無い/複数件
				ExpjMessage emsg = new ExpjMessage("KV03005");
				msgStruct.addError(emsg);	// エラーメッセージとして登録
				sysLog.warning(emsg, getsysUSER_CD()); //エラー内容
				ExpjException ee = new ExpjException(emsg);
				throw ee;
			} else {
				if(("2".equals(((KP0050010Struct)listSysInfo.get(0)).getSYS_PARAM_VALUE())) != true) {
					ExpjMessage emsg = new ExpjMessage("KP06004");
					msgStruct.addError(emsg);	// エラーメッセージとして登録
					sysLog.warning(emsg, getsysUSER_CD()); //エラー内容
					return;
				}
			}
			
			String blnPlantTyp1 = null; // 画面上工場指定タイプ true：工場指定 
			String plantTyp = null; // 工場指定タイプ 1:工場指定 2:全工場
			String plantCd = null;  // 工場コード
			
			// 前回情報のクリア
			this.list = null;
				
			// 画面情報の取得
			blnPlantTyp1 = this.struct.getrdoPlantTyp1();
			if (blnPlantTyp1.equals("true")) {
				plantTyp = "1";
			} else {
				plantTyp = "2";
			}
			plantCd = this.struct.gettxtPlantCd();
			// 工場指定の場合
			if (plantTyp.equals("1")) {
				// データを読み込み、listに保持させる
				try {
					this.list = entity.mreadMPlant.read(conn, this.struct);
				} catch(SQLException e) {
					ExpjMessage emsg = new ExpjMessage("AC00999",new String[0]);
					msgStruct.addError( emsg );
					ExpjException ee = new ExpjException(e, emsg);
					throw ee;
				}
				// データがあれば、バッチ処理を実行する
				if (this.list != null && this.list.size() > 0) {
					// バッチ処理の実行
					executeBatchProgram(plantCd);
				} else {
					ExpjMessage emsg = new ExpjMessage("KV03001",new String[0]);
					msgStruct.addError( emsg );
					return ;
				}
				// 全工場の場合
			} else {
				plantCd = ""; // ダミー文字列(この値は使われない)
				// バッチ処理の実行
				executeBatchProgram(plantCd);
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
                //}}user_implement_dev:<controlexecute>
		logger.exiting("KP0050010Control"+":USER="+struct.getsUser_ID(),"controlexecute");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KP0050");
		logger.entering("KP0050010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
			// TODO: ユーザ定義のコードを記述してください
				this.msgStruct.clearAll();
				// 初期値をセット
				struct.setrdoPlantTyp("1");             // 工場指定タイプ "1"：工場指定
				struct.settxtPlantCd(getsysPLANT_CD()); // 工場コード 自工場コード
                //}}user_implement_dev:<controlClear>
		logger.exiting("KP0050010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * 閉じるボタン押下時に実行される処理です。
	 *
	 */
	public void controlClose() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KP0050");
		logger.entering("KP0050010Control"+":USER="+struct.getsUser_ID(),"controlClose");
			//{{user_implement_dev:<controlClose>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlClose>
		logger.exiting("KP0050010Control"+":USER="+struct.getsUser_ID(),"controlClose");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KP0050");
		logger.entering("KP0050010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("KP0050010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KP0050");
		logger.entering("KP0050010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
			// TODO: ユーザ定義のコードを記述してください
			try {
				struct.clear();
				// 画面起動時の初期値をセット
				struct.settxtPlantCd(getsysPLANT_CD());
				// =======================================
				// 利用者情報の取得
				// =======================================
				struct.setstrUSER_CD(struct.getsUser_ID());
				List listUserInfo = entity.mgetUserInfo.read(conn,struct);
				if(listUserInfo == null || listUserInfo.size() != 1){
					//ユーザ情報が無い/複数件
					ExpjMessage emsg = new ExpjMessage("KQ00025");
					msgStruct.addError(emsg);	// エラーメッセージとして登録
					sysLog.warning(emsg, getsysUSER_CD()); //エラー内容
					ExpjException ee = new ExpjException(emsg);
				throw ee;
				}else{
					struct.setstrUSER_NAME(((KP0050010Struct)listUserInfo.get(0)).getstrUSER_NAME());
					struct.setstrPLANT_CD(((KP0050010Struct)listUserInfo.get(0)).getstrPLANT_CD());
					struct.setstrSECTION_CD(((KP0050010Struct)listUserInfo.get(0)).getstrSECTION_CD());
					struct.setstrORG_CD(((KP0050010Struct)listUserInfo.get(0)).getstrORG_CD());
					struct.setstrORG_NAME(((KP0050010Struct)listUserInfo.get(0)).getstrORG_NAME());
					struct.setstrORG_ANAME(((KP0050010Struct)listUserInfo.get(0)).getstrORG_ANAME());
					struct.setstrPLANT_NAME(((KP0050010Struct)listUserInfo.get(0)).getstrPLANT_NAME());
					struct.setstrPLANT_ANAME(((KP0050010Struct)listUserInfo.get(0)).getstrPLANT_ANAME());
					struct.setstrCAL_NO(((KP0050010Struct)listUserInfo.get(0)).getstrCAL_NO());
				}
					listUserInfo = null;
				}catch(SQLException e){
					e.printStackTrace();
					// エラーメッセージ作成
					ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
					sysLog.severe(emsg, getsysUSER_CD());//致命的エラー エラー内容
					ExpjException ee = new ExpjException(e, emsg); // エクセプションを生成
					emsg = new ExpjMessage( "ZZ01006", e.toString());
					sysLog.severe(emsg ,getsysUSER_CD()); //エクセプションの詳細情報
					msgStruct.addError(emsg);
					throw ee;
				}catch(ExpjException ee){
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
					throw ee;
				}
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("KP0050010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * イベントハンドラの前処理です。
	 *
	 * @param buttun ボタン名
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KP0050");
		logger.entering("KP0050010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
		logger.exiting("KP0050010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
//			throw new FoundationException("KP0050010Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KP0050010-E999","CSVの出力処理"));
			throw new FoundationException("KP0050010Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KP0050010-E999","システム日付の取得処理"));
				throw new FoundationException("KP0050010Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KP0050010-E999","コントロールのイベント処理"));
			throw new FoundationException("KP0050010Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected KP0050010Entity entity;
	protected KP0050010Struct struct;
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

		entity = new KP0050010Entity();
		struct = new KP0050010Struct();

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
	 * KP0050010クラスの標準コンストラクタ
	 */
	public KP0050010Control() throws BusinessProcessException, FoundationException
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
				KP0050010Struct key = (KP0050010Struct)keyList.get(j);
				// メッセージキーを作成する
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("rdoPlanTyp1") && key.getrdoPlanTyp1() != null) {
					msgKey.setKeyValue("rdoPlanTyp1", key.getrdoPlanTyp1());
				}
				if(msgKeyType.containsKeyColumn("rdoPlanTyp2") && key.getrdoPlanTyp2() != null) {
					msgKey.setKeyValue("rdoPlanTyp2", key.getrdoPlanTyp2());
				}
				if(msgKeyType.containsKeyColumn("rdoPlanTyp3") && key.getrdoPlanTyp3() != null) {
					msgKey.setKeyValue("rdoPlanTyp3", key.getrdoPlanTyp3());
				}
				if(msgKeyType.containsKeyColumn("rdoPlantTyp1") && key.getrdoPlantTyp1() != null) {
					msgKey.setKeyValue("rdoPlantTyp1", key.getrdoPlantTyp1());
				}
				if(msgKeyType.containsKeyColumn("rdoPlantTyp2") && key.getrdoPlantTyp2() != null) {
					msgKey.setKeyValue("rdoPlantTyp2", key.getrdoPlantTyp2());
				}
				if(msgKeyType.containsKeyColumn("rdoPlanTyp") && key.getrdoPlanTyp() != null) {
					msgKey.setKeyValue("rdoPlanTyp", key.getrdoPlanTyp());
				}
				if(msgKeyType.containsKeyColumn("rdoPlantTyp") && key.getrdoPlantTyp() != null) {
					msgKey.setKeyValue("rdoPlantTyp", key.getrdoPlantTyp());
				}
				if(msgKeyType.containsKeyColumn("SYS_PARAM_NAME") && key.getSYS_PARAM_NAME() != null) {
					msgKey.setKeyValue("SYS_PARAM_NAME", key.getSYS_PARAM_NAME());
				}
				if(msgKeyType.containsKeyColumn("SYS_PARAM_VALUE") && key.getSYS_PARAM_VALUE() != null) {
					msgKey.setKeyValue("SYS_PARAM_VALUE", key.getSYS_PARAM_VALUE());
				}
				if(msgKeyType.containsKeyColumn("plantCd") && key.getplantCd() != null) {
					msgKey.setKeyValue("plantCd", key.getplantCd());
				}
				if(msgKeyType.containsKeyColumn("txtPlantCd") && key.gettxtPlantCd() != null) {
					msgKey.setKeyValue("txtPlantCd", key.gettxtPlantCd());
				}
				if(msgKeyType.containsKeyColumn("strUSER_NAME") && key.getstrUSER_NAME() != null) {
					msgKey.setKeyValue("strUSER_NAME", key.getstrUSER_NAME());
				}
				if(msgKeyType.containsKeyColumn("strPLANT_CD") && key.getstrPLANT_CD() != null) {
					msgKey.setKeyValue("strPLANT_CD", key.getstrPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("strSECTION_CD") && key.getstrSECTION_CD() != null) {
					msgKey.setKeyValue("strSECTION_CD", key.getstrSECTION_CD());
				}
				if(msgKeyType.containsKeyColumn("strORG_CD") && key.getstrORG_CD() != null) {
					msgKey.setKeyValue("strORG_CD", key.getstrORG_CD());
				}
				if(msgKeyType.containsKeyColumn("strORG_NAME") && key.getstrORG_NAME() != null) {
					msgKey.setKeyValue("strORG_NAME", key.getstrORG_NAME());
				}
				if(msgKeyType.containsKeyColumn("strORG_ANAME") && key.getstrORG_ANAME() != null) {
					msgKey.setKeyValue("strORG_ANAME", key.getstrORG_ANAME());
				}
				if(msgKeyType.containsKeyColumn("strPLANT_NAME") && key.getstrPLANT_NAME() != null) {
					msgKey.setKeyValue("strPLANT_NAME", key.getstrPLANT_NAME());
				}
				if(msgKeyType.containsKeyColumn("strPLANT_ANAME") && key.getstrPLANT_ANAME() != null) {
					msgKey.setKeyValue("strPLANT_ANAME", key.getstrPLANT_ANAME());
				}
				if(msgKeyType.containsKeyColumn("strCAL_NO") && key.getstrCAL_NO() != null) {
					msgKey.setKeyValue("strCAL_NO", key.getstrCAL_NO().toString());
				}
				if(msgKeyType.containsKeyColumn("strUSER_CD") && key.getstrUSER_CD() != null) {
					msgKey.setKeyValue("strUSER_CD", key.getstrUSER_CD());
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
					KP0050010Struct key = new KP0050010Struct();
					if(msgKeyType.containsKeyColumn("rdoPlanTyp1")) {
						key.setrdoPlanTyp1(msgKey.getKeyValue("rdoPlanTyp1"));
					}
					if(msgKeyType.containsKeyColumn("rdoPlanTyp2")) {
						key.setrdoPlanTyp2(msgKey.getKeyValue("rdoPlanTyp2"));
					}
					if(msgKeyType.containsKeyColumn("rdoPlanTyp3")) {
						key.setrdoPlanTyp3(msgKey.getKeyValue("rdoPlanTyp3"));
					}
					if(msgKeyType.containsKeyColumn("rdoPlantTyp1")) {
						key.setrdoPlantTyp1(msgKey.getKeyValue("rdoPlantTyp1"));
					}
					if(msgKeyType.containsKeyColumn("rdoPlantTyp2")) {
						key.setrdoPlantTyp2(msgKey.getKeyValue("rdoPlantTyp2"));
					}
					if(msgKeyType.containsKeyColumn("rdoPlanTyp")) {
						key.setrdoPlanTyp(msgKey.getKeyValue("rdoPlanTyp"));
					}
					if(msgKeyType.containsKeyColumn("rdoPlantTyp")) {
						key.setrdoPlantTyp(msgKey.getKeyValue("rdoPlantTyp"));
					}
					if(msgKeyType.containsKeyColumn("SYS_PARAM_NAME")) {
						key.setSYS_PARAM_NAME(msgKey.getKeyValue("SYS_PARAM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("SYS_PARAM_VALUE")) {
						key.setSYS_PARAM_VALUE(msgKey.getKeyValue("SYS_PARAM_VALUE"));
					}
					if(msgKeyType.containsKeyColumn("plantCd")) {
						key.setplantCd(msgKey.getKeyValue("plantCd"));
					}
					if(msgKeyType.containsKeyColumn("txtPlantCd")) {
						key.settxtPlantCd(msgKey.getKeyValue("txtPlantCd"));
					}
					if(msgKeyType.containsKeyColumn("strUSER_NAME")) {
						key.setstrUSER_NAME(msgKey.getKeyValue("strUSER_NAME"));
					}
					if(msgKeyType.containsKeyColumn("strPLANT_CD")) {
						key.setstrPLANT_CD(msgKey.getKeyValue("strPLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("strSECTION_CD")) {
						key.setstrSECTION_CD(msgKey.getKeyValue("strSECTION_CD"));
					}
					if(msgKeyType.containsKeyColumn("strORG_CD")) {
						key.setstrORG_CD(msgKey.getKeyValue("strORG_CD"));
					}
					if(msgKeyType.containsKeyColumn("strORG_NAME")) {
						key.setstrORG_NAME(msgKey.getKeyValue("strORG_NAME"));
					}
					if(msgKeyType.containsKeyColumn("strORG_ANAME")) {
						key.setstrORG_ANAME(msgKey.getKeyValue("strORG_ANAME"));
					}
					if(msgKeyType.containsKeyColumn("strPLANT_NAME")) {
						key.setstrPLANT_NAME(msgKey.getKeyValue("strPLANT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("strPLANT_ANAME")) {
						key.setstrPLANT_ANAME(msgKey.getKeyValue("strPLANT_ANAME"));
					}
					if(msgKeyType.containsKeyColumn("strCAL_NO")) {
						key.setstrCAL_NO(new Double(msgKey.getKeyValue("strCAL_NO")));
					}
					if(msgKeyType.containsKeyColumn("strUSER_CD")) {
						key.setstrUSER_CD(msgKey.getKeyValue("strUSER_CD"));
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
