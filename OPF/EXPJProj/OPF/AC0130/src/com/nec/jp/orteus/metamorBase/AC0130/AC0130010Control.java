/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AC0130/src/com/nec/jp/orteus/metamorBase/AC0130/AC0130010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AC0130;

import com.nec.jp.orteus.metamorBase.AC0130.*;
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
//}}user_implement_code_import

//{{user_implement_code_header
/**
 * CLASS     : AC0130010Control クラス
 * ファイル・クラス説明
 * @author $Author: xl-hs-zzw $
 * @version $Revision: 1.5 $ $Date: 2014/11/05 07:03:24 $
 *
 */
//}}user_implement_code_header

public class AC0130010Control
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
	public AC0130010Struct getListvalue(int x) { return (AC0130010Struct)(this.list.get(x)); }	// リストの値を返します。
	public AC0130010Struct getStruct() { return this.struct; }	// Structの値を返します。
	public AC0130010Struct createStruct() { return new AC0130010Struct(); }	// 新しいStructを作って返します。
	public void setStruct(Object structname) { this.struct.setStruct((AC0130010Struct)structname); }	// Structをセットします。
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

	/** 製番の計算対象表示文字列 対象 */
	public String _expectObject = null;

	/**
	 * 製番の予定表示文字列取得
	 * 
	 * @param p
	 *            SYS_PARAMETERアクセッサ
	 */
	private boolean getExpectString(PrivateConfig p) {
		try {
			if((_expectObject = p.getString("JOB_ODR_EXPECT_OBJECT")) == null)
				return false;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	/**
	 * 製番の計算対象表示文字列作成
	 * 
	 * @param JobOdrExpectFlg
	 * @return 製番の計算対象 作成失敗時null
	 */
	private String makeExpectString(int JobOdrExpectFlg) {
		if (_expectObject == null)
			return null;
		String expect = null;
		if (JobOdrExpectFlg == 1)
			expect = _expectObject;
		else
			expect = new String("");
		return expect;
	}
   
   // -----------------------------------------------------------------------------
	/**
     * 画面エラーメッセージ設定
     * @param メッセージ番号
     */
    private void setErrorMessage(String code){
     ExpjMessage emsg = new ExpjMessage(code);
     msgStruct.addError( emsg );	// エラーメッセージとして登録
     sysLog.warning(emsg, getsysUSER_CD()); //エラー内容
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
     * バッチ処理クラスを呼び出す
     *
     * @param userID ユーザID
     * @param plantTyp 処理区分（工場指定タイプ）
     * @param plantCd 工場コード
     * @return なし
     */
    private void executeBatchProgram(String userID, String jobOdrCd, String plantCd) throws Exception {

			// バッチ処理を実行する -------------------------------------------
			ResourceBundle bundle = SystemConfig.getBundle();
			String javaPath = SystemConfig.getProperty("JAVA_PATH", bundle);
			if (javaPath == null) {
				// システム既定値ファイルからの情報取得に失敗しました(ＪＶＭパス)
				ExpjMessage emsg = new ExpjMessage("ZZ09010", new String[0]);
				msgStruct.addError(emsg);
			}
			String ClassPath = SystemConfig.getProperty("CLASS_PATH", bundle);
			if (ClassPath == null) {
				// システム既定値ファイルからの情報取得に失敗しました(クラスパス)
				ExpjMessage emsg = new ExpjMessage("ZZ09012", new String[0]);
				msgStruct.addError(emsg);
			}
			String batchPath = SystemConfig.getProperty("BATCH_PATH", bundle);
			if (batchPath == null) {
				// "システム既定値ファイルからの情報取得に失敗しました(バッチ起動設定)"
				ExpjMessage emsg = new ExpjMessage("ZZ09011", new String[0]);
				msgStruct.addError(emsg);
			}

			// 全ての定義情報が取得できていれば、処理を実行する。
			if ((javaPath != null) && (ClassPath != null)
					&& (batchPath != null)) {

				// 所要量展開モードが工場指定の場合
				String mrpExpMode = "2";
//				String cmd = "";
//				cmd = cmd + javaPath; // ＪＶＭ
//				cmd = cmd + " -cp ";
//				cmd = cmd + ClassPath; // Java ClassPath
//				cmd = cmd + " -Dcom.nec.jp.orteus.util.logging.config.file=";
//				cmd = cmd + batchPath; // D:/OrteusStudio/lib/logging.properties";
//				// // 起動設定
//				cmd = cmd + " " + "com.nec.jp.orteus.metamorBase.AC0140.AC0140B001.mainAC0140B001"; // 呼び出し先クラス
//				cmd = cmd + " " + userID; // ユーザID
//				cmd = cmd + " " + mrpExpMode; // 所要量展開モード
//				cmd = cmd + " " + jobOdrCd; // 製番
//				cmd = cmd + " " + plantCd; // 工場コード
//
//				Runtime runtime = Runtime.getRuntime();
//				Process p = runtime.exec(cmd);

				List buffer = new ArrayList();
				buffer.add(javaPath);            // ＪＶＭ
				buffer.add("-cp");
				buffer.add(ClassPath);          // Java ClassPath
				buffer.add("-Dcom.nec.jp.orteus.util.logging.config.file="+batchPath); // 起動設定
				buffer.add("com.nec.jp.orteus.metamorBase.AC0140.AC0140B001.mainAC0140B001"); // 呼び出し先クラス
				buffer.add(userID);             //  ユーザID
				buffer.add(mrpExpMode);         // 所要量展開モード
				buffer.add(jobOdrCd);           // 製番
				buffer.add(plantCd);            // 工場コード

				// バッチ処理実行
				Runtime runtime = Runtime.getRuntime();
				runtime.exec((String[])buffer.toArray(new String[buffer.size()]));
				//
				/*
				 * // 障害時確認用。呼び出したプログラムを監視し、標準出力を取得する。 // 運用時はコメントアウトする。
				 * BufferedReader brE = new BufferedReader(new
				 * InputStreamReader(p. getErrorStream())); BufferedReader brO =
				 * new BufferedReader(new InputStreamReader(p.
				 * getInputStream())); String s; while ( (s = brO.readLine()) !=
				 * null) { } while ( (s = brE.readLine()) != null) { } //
				 */

				// バッチ呼び出し成功の場合、画面メッセージを表示する。
				// AlarmMessage almMsg = new AlarmMessage("ZZ09013", new
				// String[0]);
				// msgStruct.getInfo().add(almMsg.getMessage());
				ExpjMessage emsg = new ExpjMessage("ZZ09013", new String[0]);
				msgStruct.addInfo(emsg);
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
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0130");
		logger.entering("AC0130010Control"+":USER="+struct.getsUser_ID(),"controlselect");
			//{{user_implement_dev:<controlselect>
		try {
			// 読込前の状態の初期化
            setReadStatus(INITIAL);
            setList(null);
            //製番状態区分の初期化
            struct.setInC1_JOB_ODR_STS_TYP("");
            struct.setInC2_JOB_ODR_STS_TYP("");
            struct.setInC3_JOB_ODR_STS_TYP("");
            struct.setInC4_JOB_ODR_STS_TYP("");
            struct.setInC5_JOB_ODR_STS_TYP("");
            struct.setInC9_JOB_ODR_STS_TYP("");
            
            //製番取消の初期化
            struct.setInC1_JOB_ODR_CANCEL("");
            struct.setInC2_JOB_ODR_CANCEL("");
            
            //製番番号の存在チェック
            if (!"".equals(struct.getJOB_ODR_CD())){
            	if(!entity.mCHK_T_JOB_ODR.check(conn, struct)){
            		setErrorMessage("AD00029");
            		setList(null);
            		return;
            	}
            }
            //製番取消のチェック
            if (!"".equals(struct.getJOB_ODR_CD())){
            	if(!entity.mCHK_T_JOB_ODR.check(conn, struct)){
            		setErrorMessage("AD00029");
            		setList(null);
            		return;
            	}
            }
            //品目番号の存在チェック
            if (!"".equals(struct.getITEM_CD())){
            	if(!entity.mCHK_M_ITEM.check(conn, struct)){
            		setErrorMessage("AC00220");
            		setList(null);
            		return;
            	}
            }
            //自工場設定
            struct.setsys_PLANT_CD(this.sysPLANT_CD);
            
            //製番状態区分設定
            if("true".equals(struct.getc1_JOB_ODR_STS())){
            	//1:所要量計算未対象
            	struct.setInC1_JOB_ODR_STS_TYP("1");
            }
            if("true".equals(struct.getc2_JOB_ODR_STS())){
            	//2:所要量計算対象
            	struct.setInC2_JOB_ODR_STS_TYP("2");
            }
            if("true".equals(struct.getc3_JOB_ODR_STS())){
            	//3:展開済み
            	struct.setInC3_JOB_ODR_STS_TYP("3");
            }
            if("true".equals(struct.getc4_JOB_ODR_STS())){
            	//4:下位品目確定済み
            	struct.setInC4_JOB_ODR_STS_TYP("4");
            }
            if("true".equals(struct.getc5_JOB_ODR_STS())){
            	//5:自品目確定済み
            	struct.setInC5_JOB_ODR_STS_TYP("5");
            }
            if("true".equals(struct.getc9_JOB_ODR_STS())){
            	//9:完了
            	struct.setInC9_JOB_ODR_STS_TYP("9");
            }
            
            
            //製番取消の設定
            if("true".equals(struct.getc1_JOB_ODR_CANCEL())){
            	//1:未取消
            	struct.setInC1_JOB_ODR_CANCEL("0");
            }
            if("true".equals(struct.getc2_JOB_ODR_CANCEL())){
            	//2:取消済み
            	struct.setInC2_JOB_ODR_CANCEL("1");
            }
            int maxLine = sp.getMaxLine(conn, 10);
			if(maxLine != 0) {
				struct.setROW_COUNT(String.valueOf(maxLine));
			}else {
				struct.setROW_COUNT(null);
		    }
			List WorkList = entity.mselectCnt.read(conn, struct);
			long rowCount = Long.parseLong(((AC0130010Struct)WorkList.get(0)).getl_COUNT());
			//データが存在しない場合
            if (rowCount==0){
				setErrorMessage("ZZ06001");
				if(list!=null && list.size()>0){
				   setList(null);
				}
				setReadStatus(NOT_FOUND);
				return;
            }
            // 表示行数制限値(SYS_SCREEN_PARM)を超えた場合エラー
          	if ((maxLine != 0) && (rowCount== maxLine + 1)) {
            	setErrorMessage("ZZ01115", String.valueOf(maxLine));
            	if(list!=null && list.size()>0){
 				   setList(null);
 				}
            	setReadStatus(TOO_MANY);
            	return;
          	}
            //読込処理
            WorkList = entity.mselect.read(conn, struct);
          	//データの表示処理
          	for (int i=0;i<WorkList.size();i++){
          		AC0130010Struct WorkStruct = (AC0130010Struct)WorkList.get(i);
          		//区分名の設定
          		WorkStruct.setl_JOB_ODR_NAME(this.multcombo("JOB_ODR_TYP",WorkStruct.getl_JOB_ODR_TYP()));
          		WorkStruct.setl_JOB_ODR_STS_NAME(this.multcombo("JOB_ODR_STS_TYP",WorkStruct.getl_JOB_ODR_STS_TYP()));
          		WorkStruct.setl_PLAN_NAME(this.multcombo("PLAN_TYP",WorkStruct.getl_PLAN_TYP()));
          		//所要量メンテフラグのチェック
          		WorkStruct.setsys_PLANT_CD(this.sysPLANT_CD);
          		if (entity.mSYS_JOB_OD_CALC_CTRL.check(conn, WorkStruct)){
          			WorkStruct.setJobOdrExpectFlg("1");
          		}
          		// 再計算の設定
          		WorkStruct.setl_JobOdrExpect(makeExpectString(Integer
						.parseInt(WorkStruct.getJobOdrExpectFlg())));
          	}
          	//検索結果の表示
          	setList(WorkList);
      		setReadStatus(NORMAL);
			
		} catch(Exception e) {
			setReadStatus(ERROR);	
			e.printStackTrace();
			// エラー処理を記述します
			ExpjMessage emsg = new ExpjMessage("ZZ01106");
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(emsg);

			throw ee;
		}
                //}}user_implement_dev:<controlselect>
		logger.exiting("AC0130010Control"+":USER="+struct.getsUser_ID(),"controlselect");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0130");
		logger.entering("AC0130010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
			setList(null);
                //}}user_implement_dev:<controlClear>
		logger.exiting("AC0130010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * 閉じるボタン押下時に実行される処理です。
	 *
	 */
	public void controlClose() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0130");
		logger.entering("AC0130010Control"+":USER="+struct.getsUser_ID(),"controlClose");
			//{{user_implement_dev:<controlClose>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlClose>
		logger.exiting("AC0130010Control"+":USER="+struct.getsUser_ID(),"controlClose");

		return;
	}

	/**
	 * 所要量計算ボタン押下時に実行される処理です。
	 *
	 */
	public void controlMRP() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0130");
		logger.entering("AC0130010Control"+":USER="+struct.getsUser_ID(),"controlMRP");
			//{{user_implement_dev:<controlMRP>
			//struct.setJOB_ODR_CD(struct.getl_JOB_ODR_CD());
		try{
			executeBatchProgram(sysUSER_CD, struct.getl_JOB_ODR_CD(), sysPLANT_CD);
		} catch (Exception e) {
			// バッチ呼び出し失敗の場合、画面メッセージを表示する。
			ExpjMessage emsg = new ExpjMessage("ZZ09016", new String[0]);
			msgStruct.addError(emsg);
		}
			
                //}}user_implement_dev:<controlMRP>
		logger.exiting("AC0130010Control"+":USER="+struct.getsUser_ID(),"controlMRP");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0130");
		logger.entering("AC0130010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AC0130010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0130");
		logger.entering("AC0130010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
		setReadStatus(INITIAL);
		
		PrivateConfig privateConfig = new PrivateConfig(conn);
		// 製番の計算対象表示用文字列取得
		if (getExpectString(privateConfig) == false) {
			ExpjMessage emsg = new ExpjMessage("ZZ01106");
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(emsg);

			throw ee;
		}
/*
 * // データベースへのアクセスを行う場合は、このtry catch文のコメントを外してください。 try{
 */
			// 画面遷移の呼び出しだったら、Structに画面遷移キーを設定してcontrolSelect()を呼び出す
			if ( isScreenMove() == true ) {
				// 検索のコントロールメソッドを呼び出します。
//				controlSelect();
			}

/*			// データベースへのアクセスを行う場合は、このtry catch文のコメントを外してください。
		} catch(SQLException e) {
//			e.printStackTrace();
			// エラー処理を記述してください。
			// 
		}
*/
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AC0130010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * イベントハンドラの前処理です。
	 *
	 * @param buttun ボタン名
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0130");
		logger.entering("AC0130010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
		try{	
			ComboBox comboController = new ComboBox(conn, sysUSER_CD);
			ComboStruct JOB_ODR_TYP = comboController.getData("JOB_ODR_TYP");
			struct.setList_JOB_ODR_TYP_val(JOB_ODR_TYP.getValList());
			struct.getList_JOB_ODR_TYP_val().add(0, "0");
			struct.setList_JOB_ODR_TYP_name(JOB_ODR_TYP.getExplanList());
			struct.getList_JOB_ODR_TYP_name().add(0, "");
		}catch(Exception e){
			e.printStackTrace();
			ExpjException ee = new ExpjException(e,"ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("AC0130010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("Clear") ) {
				controlClear();
			} else if( button.equals("Close") ) {
				controlClose();
			} else if( button.equals("MRP") ) {
				controlMRP();
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
//			throw new FoundationException("AC0130010Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AC0130010-E999","CSVの出力処理"));
			throw new FoundationException("AC0130010Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AC0130010-E999","システム日付の取得処理"));
				throw new FoundationException("AC0130010Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AC0130010-E999","コントロールのイベント処理"));
			throw new FoundationException("AC0130010Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected AC0130010Entity entity;
	protected AC0130010Struct struct;
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

		entity = new AC0130010Entity();
		struct = new AC0130010Struct();

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
	 * AC0130010クラスの標準コンストラクタ
	 */
	public AC0130010Control() throws BusinessProcessException, FoundationException
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
				AC0130010Struct key = (AC0130010Struct)keyList.get(j);
				// メッセージキーを作成する
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("c1_JOB_ODR_STS") && key.getc1_JOB_ODR_STS() != null) {
					msgKey.setKeyValue("c1_JOB_ODR_STS", key.getc1_JOB_ODR_STS());
				}
				if(msgKeyType.containsKeyColumn("c4_JOB_ODR_STS") && key.getc4_JOB_ODR_STS() != null) {
					msgKey.setKeyValue("c4_JOB_ODR_STS", key.getc4_JOB_ODR_STS());
				}
				if(msgKeyType.containsKeyColumn("c2_JOB_ODR_STS") && key.getc2_JOB_ODR_STS() != null) {
					msgKey.setKeyValue("c2_JOB_ODR_STS", key.getc2_JOB_ODR_STS());
				}
				if(msgKeyType.containsKeyColumn("c5_JOB_ODR_STS") && key.getc5_JOB_ODR_STS() != null) {
					msgKey.setKeyValue("c5_JOB_ODR_STS", key.getc5_JOB_ODR_STS());
				}
				if(msgKeyType.containsKeyColumn("c3_JOB_ODR_STS") && key.getc3_JOB_ODR_STS() != null) {
					msgKey.setKeyValue("c3_JOB_ODR_STS", key.getc3_JOB_ODR_STS());
				}
				if(msgKeyType.containsKeyColumn("c9_JOB_ODR_STS") && key.getc9_JOB_ODR_STS() != null) {
					msgKey.setKeyValue("c9_JOB_ODR_STS", key.getc9_JOB_ODR_STS());
				}
				if(msgKeyType.containsKeyColumn("l_JOB_ODR_STS_NAME") && key.getl_JOB_ODR_STS_NAME() != null) {
					msgKey.setKeyValue("l_JOB_ODR_STS_NAME", key.getl_JOB_ODR_STS_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_JOB_ODR_NAME") && key.getl_JOB_ODR_NAME() != null) {
					msgKey.setKeyValue("l_JOB_ODR_NAME", key.getl_JOB_ODR_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_PLAN_NAME") && key.getl_PLAN_NAME() != null) {
					msgKey.setKeyValue("l_PLAN_NAME", key.getl_PLAN_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_JobOdrExpect") && key.getl_JobOdrExpect() != null) {
					msgKey.setKeyValue("l_JobOdrExpect", key.getl_JobOdrExpect());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_TYP_name") && key.getJOB_ODR_TYP_name() != null) {
					msgKey.setKeyValue("JOB_ODR_TYP_name", key.getJOB_ODR_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_TYP_val") && key.getJOB_ODR_TYP_val() != null) {
					msgKey.setKeyValue("JOB_ODR_TYP_val", key.getJOB_ODR_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("c1_JOB_ODR_CANCEL") && key.getc1_JOB_ODR_CANCEL() != null) {
					msgKey.setKeyValue("c1_JOB_ODR_CANCEL", key.getc1_JOB_ODR_CANCEL());
				}
				if(msgKeyType.containsKeyColumn("c2_JOB_ODR_CANCEL") && key.getc2_JOB_ODR_CANCEL() != null) {
					msgKey.setKeyValue("c2_JOB_ODR_CANCEL", key.getc2_JOB_ODR_CANCEL());
				}
				if(msgKeyType.containsKeyColumn("l_JOB_ODR_CD") && key.getl_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("l_JOB_ODR_CD", key.getl_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("l_JOB_ODR_CANCEL_NO") && key.getl_JOB_ODR_CANCEL_NO() != null) {
					msgKey.setKeyValue("l_JOB_ODR_CANCEL_NO", key.getl_JOB_ODR_CANCEL_NO());
				}
				if(msgKeyType.containsKeyColumn("l_ITEM_CD") && key.getl_ITEM_CD() != null) {
					msgKey.setKeyValue("l_ITEM_CD", key.getl_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ITEM_NAME") && key.getl_ITEM_NAME() != null) {
					msgKey.setKeyValue("l_ITEM_NAME", key.getl_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_STOCK_UNIT") && key.getl_STOCK_UNIT() != null) {
					msgKey.setKeyValue("l_STOCK_UNIT", key.getl_STOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("l_JOB_ODR_QTY") && key.getl_JOB_ODR_QTY() != null) {
					msgKey.setKeyValue("l_JOB_ODR_QTY", key.getl_JOB_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_JOB_ODR_DLV_DATE") && key.getl_JOB_ODR_DLV_DATE() != null) {
					msgKey.setKeyValue("l_JOB_ODR_DLV_DATE", key.getl_JOB_ODR_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_JOB_ODR_STS_TYP") && key.getl_JOB_ODR_STS_TYP() != null) {
					msgKey.setKeyValue("l_JOB_ODR_STS_TYP", key.getl_JOB_ODR_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_JOB_ODR_TYP") && key.getl_JOB_ODR_TYP() != null) {
					msgKey.setKeyValue("l_JOB_ODR_TYP", key.getl_JOB_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_PLAN_TYP") && key.getl_PLAN_TYP() != null) {
					msgKey.setKeyValue("l_PLAN_TYP", key.getl_PLAN_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_ALC_GRP_CD") && key.getl_ALC_GRP_CD() != null) {
					msgKey.setKeyValue("l_ALC_GRP_CD", key.getl_ALC_GRP_CD());
				}
				if(msgKeyType.containsKeyColumn("l_JOB_ODR_DEL_FLG") && key.getl_JOB_ODR_DEL_FLG() != null) {
					msgKey.setKeyValue("l_JOB_ODR_DEL_FLG", key.getl_JOB_ODR_DEL_FLG());
				}
				if(msgKeyType.containsKeyColumn("l_ALCD_QTY") && key.getl_ALCD_QTY() != null) {
					msgKey.setKeyValue("l_ALCD_QTY", key.getl_ALCD_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_ALCD_ENABLE_QTY") && key.getl_ALCD_ENABLE_QTY() != null) {
					msgKey.setKeyValue("l_ALCD_ENABLE_QTY", key.getl_ALCD_ENABLE_QTY());
				}
				if(msgKeyType.containsKeyColumn("JobOdrExpectFlg") && key.getJobOdrExpectFlg() != null) {
					msgKey.setKeyValue("JobOdrExpectFlg", key.getJobOdrExpectFlg());
				}
				if(msgKeyType.containsKeyColumn("sys_PLANT_CD") && key.getsys_PLANT_CD() != null) {
					msgKey.setKeyValue("sys_PLANT_CD", key.getsys_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_CD") && key.getJOB_ODR_CD() != null) {
					msgKey.setKeyValue("JOB_ODR_CD", key.getJOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_DLV_DATE_FROM") && key.getJOB_ODR_DLV_DATE_FROM() != null) {
					msgKey.setKeyValue("JOB_ODR_DLV_DATE_FROM", key.getJOB_ODR_DLV_DATE_FROM());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_DLV_DATE_TO") && key.getJOB_ODR_DLV_DATE_TO() != null) {
					msgKey.setKeyValue("JOB_ODR_DLV_DATE_TO", key.getJOB_ODR_DLV_DATE_TO());
				}
				if(msgKeyType.containsKeyColumn("InC1_JOB_ODR_STS_TYP") && key.getInC1_JOB_ODR_STS_TYP() != null) {
					msgKey.setKeyValue("InC1_JOB_ODR_STS_TYP", key.getInC1_JOB_ODR_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("InC2_JOB_ODR_STS_TYP") && key.getInC2_JOB_ODR_STS_TYP() != null) {
					msgKey.setKeyValue("InC2_JOB_ODR_STS_TYP", key.getInC2_JOB_ODR_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("InC3_JOB_ODR_STS_TYP") && key.getInC3_JOB_ODR_STS_TYP() != null) {
					msgKey.setKeyValue("InC3_JOB_ODR_STS_TYP", key.getInC3_JOB_ODR_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("InC4_JOB_ODR_STS_TYP") && key.getInC4_JOB_ODR_STS_TYP() != null) {
					msgKey.setKeyValue("InC4_JOB_ODR_STS_TYP", key.getInC4_JOB_ODR_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("InC5_JOB_ODR_STS_TYP") && key.getInC5_JOB_ODR_STS_TYP() != null) {
					msgKey.setKeyValue("InC5_JOB_ODR_STS_TYP", key.getInC5_JOB_ODR_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("InC9_JOB_ODR_STS_TYP") && key.getInC9_JOB_ODR_STS_TYP() != null) {
					msgKey.setKeyValue("InC9_JOB_ODR_STS_TYP", key.getInC9_JOB_ODR_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_TYP") && key.getJOB_ODR_TYP() != null) {
					msgKey.setKeyValue("JOB_ODR_TYP", key.getJOB_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("InC1_JOB_ODR_CANCEL") && key.getInC1_JOB_ODR_CANCEL() != null) {
					msgKey.setKeyValue("InC1_JOB_ODR_CANCEL", key.getInC1_JOB_ODR_CANCEL());
				}
				if(msgKeyType.containsKeyColumn("InC2_JOB_ODR_CANCEL") && key.getInC2_JOB_ODR_CANCEL() != null) {
					msgKey.setKeyValue("InC2_JOB_ODR_CANCEL", key.getInC2_JOB_ODR_CANCEL());
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
					AC0130010Struct key = new AC0130010Struct();
					if(msgKeyType.containsKeyColumn("c1_JOB_ODR_STS")) {
						key.setc1_JOB_ODR_STS(msgKey.getKeyValue("c1_JOB_ODR_STS"));
					}
					if(msgKeyType.containsKeyColumn("c4_JOB_ODR_STS")) {
						key.setc4_JOB_ODR_STS(msgKey.getKeyValue("c4_JOB_ODR_STS"));
					}
					if(msgKeyType.containsKeyColumn("c2_JOB_ODR_STS")) {
						key.setc2_JOB_ODR_STS(msgKey.getKeyValue("c2_JOB_ODR_STS"));
					}
					if(msgKeyType.containsKeyColumn("c5_JOB_ODR_STS")) {
						key.setc5_JOB_ODR_STS(msgKey.getKeyValue("c5_JOB_ODR_STS"));
					}
					if(msgKeyType.containsKeyColumn("c3_JOB_ODR_STS")) {
						key.setc3_JOB_ODR_STS(msgKey.getKeyValue("c3_JOB_ODR_STS"));
					}
					if(msgKeyType.containsKeyColumn("c9_JOB_ODR_STS")) {
						key.setc9_JOB_ODR_STS(msgKey.getKeyValue("c9_JOB_ODR_STS"));
					}
					if(msgKeyType.containsKeyColumn("l_JOB_ODR_STS_NAME")) {
						key.setl_JOB_ODR_STS_NAME(msgKey.getKeyValue("l_JOB_ODR_STS_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_JOB_ODR_NAME")) {
						key.setl_JOB_ODR_NAME(msgKey.getKeyValue("l_JOB_ODR_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_PLAN_NAME")) {
						key.setl_PLAN_NAME(msgKey.getKeyValue("l_PLAN_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_JobOdrExpect")) {
						key.setl_JobOdrExpect(msgKey.getKeyValue("l_JobOdrExpect"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_TYP_name")) {
						key.setJOB_ODR_TYP_name(msgKey.getKeyValue("JOB_ODR_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_TYP_val")) {
						key.setJOB_ODR_TYP_val(msgKey.getKeyValue("JOB_ODR_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("c1_JOB_ODR_CANCEL")) {
						key.setc1_JOB_ODR_CANCEL(msgKey.getKeyValue("c1_JOB_ODR_CANCEL"));
					}
					if(msgKeyType.containsKeyColumn("c2_JOB_ODR_CANCEL")) {
						key.setc2_JOB_ODR_CANCEL(msgKey.getKeyValue("c2_JOB_ODR_CANCEL"));
					}
					if(msgKeyType.containsKeyColumn("l_JOB_ODR_CD")) {
						key.setl_JOB_ODR_CD(msgKey.getKeyValue("l_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_JOB_ODR_CANCEL_NO")) {
						key.setl_JOB_ODR_CANCEL_NO(msgKey.getKeyValue("l_JOB_ODR_CANCEL_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_ITEM_CD")) {
						key.setl_ITEM_CD(msgKey.getKeyValue("l_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ITEM_NAME")) {
						key.setl_ITEM_NAME(msgKey.getKeyValue("l_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_STOCK_UNIT")) {
						key.setl_STOCK_UNIT(msgKey.getKeyValue("l_STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("l_JOB_ODR_QTY")) {
						key.setl_JOB_ODR_QTY(msgKey.getKeyValue("l_JOB_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_JOB_ODR_DLV_DATE")) {
						key.setl_JOB_ODR_DLV_DATE(msgKey.getKeyValue("l_JOB_ODR_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_JOB_ODR_STS_TYP")) {
						key.setl_JOB_ODR_STS_TYP(msgKey.getKeyValue("l_JOB_ODR_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_JOB_ODR_TYP")) {
						key.setl_JOB_ODR_TYP(msgKey.getKeyValue("l_JOB_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_PLAN_TYP")) {
						key.setl_PLAN_TYP(msgKey.getKeyValue("l_PLAN_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_ALC_GRP_CD")) {
						key.setl_ALC_GRP_CD(msgKey.getKeyValue("l_ALC_GRP_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_JOB_ODR_DEL_FLG")) {
						key.setl_JOB_ODR_DEL_FLG(msgKey.getKeyValue("l_JOB_ODR_DEL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("l_ALCD_QTY")) {
						key.setl_ALCD_QTY(msgKey.getKeyValue("l_ALCD_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_ALCD_ENABLE_QTY")) {
						key.setl_ALCD_ENABLE_QTY(msgKey.getKeyValue("l_ALCD_ENABLE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("JobOdrExpectFlg")) {
						key.setJobOdrExpectFlg(msgKey.getKeyValue("JobOdrExpectFlg"));
					}
					if(msgKeyType.containsKeyColumn("sys_PLANT_CD")) {
						key.setsys_PLANT_CD(msgKey.getKeyValue("sys_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_CD")) {
						key.setJOB_ODR_CD(msgKey.getKeyValue("JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_DLV_DATE_FROM")) {
						key.setJOB_ODR_DLV_DATE_FROM(msgKey.getKeyValue("JOB_ODR_DLV_DATE_FROM"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_DLV_DATE_TO")) {
						key.setJOB_ODR_DLV_DATE_TO(msgKey.getKeyValue("JOB_ODR_DLV_DATE_TO"));
					}
					if(msgKeyType.containsKeyColumn("InC1_JOB_ODR_STS_TYP")) {
						key.setInC1_JOB_ODR_STS_TYP(msgKey.getKeyValue("InC1_JOB_ODR_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("InC2_JOB_ODR_STS_TYP")) {
						key.setInC2_JOB_ODR_STS_TYP(msgKey.getKeyValue("InC2_JOB_ODR_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("InC3_JOB_ODR_STS_TYP")) {
						key.setInC3_JOB_ODR_STS_TYP(msgKey.getKeyValue("InC3_JOB_ODR_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("InC4_JOB_ODR_STS_TYP")) {
						key.setInC4_JOB_ODR_STS_TYP(msgKey.getKeyValue("InC4_JOB_ODR_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("InC5_JOB_ODR_STS_TYP")) {
						key.setInC5_JOB_ODR_STS_TYP(msgKey.getKeyValue("InC5_JOB_ODR_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("InC9_JOB_ODR_STS_TYP")) {
						key.setInC9_JOB_ODR_STS_TYP(msgKey.getKeyValue("InC9_JOB_ODR_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_TYP")) {
						key.setJOB_ODR_TYP(msgKey.getKeyValue("JOB_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("InC1_JOB_ODR_CANCEL")) {
						key.setInC1_JOB_ODR_CANCEL(msgKey.getKeyValue("InC1_JOB_ODR_CANCEL"));
					}
					if(msgKeyType.containsKeyColumn("InC2_JOB_ODR_CANCEL")) {
						key.setInC2_JOB_ODR_CANCEL(msgKey.getKeyValue("InC2_JOB_ODR_CANCEL"));
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
