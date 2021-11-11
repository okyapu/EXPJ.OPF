/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AC0150/src/com/nec/jp/orteus/metamorBase/AC0150/AC0150010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AC0150;

import com.nec.jp.orteus.metamorBase.AC0150.*;
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
 * CLASS     : AC0150010Control クラス
 * ファイル・クラス説明
 * @author $Author: zhou-kehong $
 * @version $Revision: 1.11 $ $Date: 2014/11/28 01:27:45 $
 *
 */
//}}user_implement_code_header

public class AC0150010Control
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
	public AC0150010Struct getListvalue(int x) { return (AC0150010Struct)(this.list.get(x)); }	// リストの値を返します。
	public AC0150010Struct getStruct() { return this.struct; }	// Structの値を返します。
	public AC0150010Struct createStruct() { return new AC0150010Struct(); }	// 新しいStructを作って返します。
	public void setStruct(Object structname) { this.struct.setStruct((AC0150010Struct)structname); }	// Structをセットします。
	public void initializeStruct() { this.struct.initialize(); }	// Structの値を初期化します。

	// CSV出力用リスト
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }
	
	/** 正展開用リスト（全て展開した対象） */
	private List Levellist = null;
	/** 展開レベル用フラグ */
	private boolean LevelOverFlg = false;
	/** 展開結果の表示順番 */
	private int DisplayOrderID = 0;
	
	/** 展開レベル */
	private int maxDevelopLevel = 0;
	
	private boolean flag = false;
	
	/**
	 * システムの日付取得
	 */
	public String getDateTime(){
		Date datetime = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddhhmmssSSS");
		return sdf.format(datetime);
	}  
	
	/**
	 * 検索条件をに正展開検索を行う
	 * @param odNo オーダデマンド番号
	 * @param jobOdrCd 製番
	 * @param jobOdrCancelNo 製番取消発生番号
	 * @param plantCd 工場コード
	 * @param level レベル
	 * @param OｄｒStsTyp オーダ状態区分
	 * @param emsg エラーメッセージ
	 * @exception FoundationException 検索処理中にエラーが発生した場合
	 * @exception SQLException 検索処理中にエラーが発生した場合
	 * @exception ParseException 検索処理中にエラーが発生した場合
	 */
	private void developForward(String odNo, String jobOdrCd,
			String jobOdrCancelNo, String plantCd, int level,String OｄｒStsTyp)
			throws Exception{

		AC0150010Struct aStruct = null;
		AC0150010Struct childStruct = new AC0150010Struct();
		List resultList = null;

		// 検索条件の設定
		childStruct.setPARENT_OD_NO(odNo);
		childStruct.setJOB_ODR_CD(jobOdrCd);
		childStruct.setJOB_ODR_CANCEL_NO(jobOdrCancelNo);
		childStruct.setPLANT_CD(plantCd);
		//childStruct.setInC_ODR_STS_TYP(OｄｒStsTyp);
		int maxLine = sp.getMaxLine(conn, 10);
		
         //所要量を検索
		if (level == 1) {
			if (struct.getITEM_CD() == null || struct.getITEM_CD().equals("")) {
				resultList = entity.mV_JOB_ODR_PROG_LST_ROOT.read(conn, childStruct);
			} else {
				String targetItemCd = struct.getITEM_CD();
				childStruct.setITEM_CD(targetItemCd);
				resultList = entity.mV_JOB_ODR_PROG_LST.read(conn, childStruct);
				if (resultList.size() > 1) {
					setWarningMessage("AJ00020");
				}
			}
		} else {
			resultList = entity.mV_JOB_ODR_PROG_LST.read(conn, childStruct);
		}

		for (int i = 0; i < resultList.size(); i++) {
			aStruct = (AC0150010Struct)resultList.get(i);
			try{
				aStruct.setl_ODR_STS_TYP_NAME(multcombo("ODR_STS_TYP",aStruct.getl_ODR_STS_TYP()));
				aStruct.setl_OD_GNR_TYP_NAME(multcombo("OD_GNR_TYP",aStruct.getl_OD_GNR_TYP()));
			}catch(Exception e){
				e.printStackTrace();
			}

			// 相対レベル
			aStruct.setLev_No(String.valueOf(level));

			// オーダ状態区分
			if (("0").equals(aStruct.getl_ODR_STS_TYP())){
				aStruct.setl_ODR_STS_TYP_NAME(null);
				// 製造納期にNullを設定する
				aStruct.setl_PRD_DUE_DATE(null);
			}

			// デマンド状態区分
			if (("0").equals(aStruct.getl_DM_STS_TYP())) {
				// 要求納期にNullを設定する
				aStruct.setl_DUE_DATE(null);
			}

			// 内外作区分
			setOutsideTyp(aStruct);		
			
			
			// 最大レベルに達した場合は展開終了
			if (level > maxDevelopLevel + 1) {
				this.LevelOverFlg = true;
			}else{
				//表示結果リスト
				if ("1".equals(OｄｒStsTyp)){ //オーダ状態区分は計画を選択した場合
					//製番状態区分のチェック　　１：計画のデータのみ、表示された
					if ("1".equals(((AC0150010Struct)resultList.get(i)).getl_ODR_STS_TYP())){
						list.add(resultList.get(i));
						if ((maxLine != 0) && (list.size() > maxLine)) {
				        	flag = true;
				        	return;
						} 
					}
				}else{
					list.add(resultList.get(i));
					if ((maxLine != 0) && (list.size() > maxLine)) {
			        	flag = true;
			        	return;
					} 
				}
			}
			//表示結果順番
			aStruct.setOrderID(String.valueOf(DisplayOrderID++));
			//展開結果リスト（全て展開した対象）
			Levellist.add(resultList.get(i));
			// 所要量処理区分が「3:削除」以外の場合、下位レベルの展開を行う
			if (!("3").equals(aStruct.getMRP_TYP())) {
				developForward(aStruct.getl_OD_NO(), jobOdrCd,
						jobOdrCancelNo, aStruct.getPLANT_CD(), level + 1,OｄｒStsTyp);
			}
			
			if(flag == true){
				return;
			}
		}
	}
	/**
	 * 内外作区分の設定
	 * @param aStruct 内外作区分を設定するStruct
	 */
	private void setOutsideTyp(AC0150010Struct aStruct) throws Exception{
		String displayName = "";  // コンボボックスデータ表示用
		int workInProcQty = 0;
		int rlsdPuchOdrQty = 0;
		workInProcQty = Integer.parseInt(aStruct.getl_WORK_IN_PROC_QTY());
		rlsdPuchOdrQty = Integer.parseInt(aStruct.getl_RLSD_PUCH_ODR_QTY());

		// オーダデマンド番号の存在チェック
		if (rlsdPuchOdrQty > 0 || workInProcQty > 0) {
			// 内外作区分（進捗管理用）
			if (rlsdPuchOdrQty > 0 && workInProcQty > 0) {
				// 発注残・品目別仕掛に存在する
				displayName = multcombo("J_OUTSIDE_TYP", "9");
			} else if (rlsdPuchOdrQty > 0) {
				// 発注残のみ存在する
				displayName = multcombo("J_OUTSIDE_TYP", "2");
			} else if (workInProcQty > 0) {
				// 品目別仕掛のみ存在する
				displayName = multcombo("J_OUTSIDE_TYP", "1");
			} else {
				displayName = null;
			}
			aStruct.setl_OUTSIDE_TYP_NAME(displayName);
		} else {
			// 内外作区分
			displayName = multcombo("OUTSIDE_TYP",
					aStruct.getl_OUTSIDE_TYP());
			aStruct.setl_OUTSIDE_TYP_NAME(displayName);
		}
	}
	/**
	 * コンボボックスの説明取得（多言語）
	 * @param comname コンボボックスのID番号
	 * @param value 　数値
	 * @return 置換文字列
	 * @throws BusinessProcessException
	 * @throws FoundationException
	 */
	private String multcombo(String comname,String value) throws BusinessProcessException, FoundationException {
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
	 * 個別オーダ発効
	 */
	private void OdrReleas(){
		try{ 
			 // パラメータを取得する
			 String userId = getsysUSER_CD();							// ユーザID
		 	 String plantCd = getsysPLANT_CD();							// 工場コード
		 	 String SysTime = struct.getSYS_TIME();			    	    // タイムスタンプ
			 String JobOdrCd = struct.getJOB_ODR_CD();				    // 製番
			 String batchProcessingTyp = null;    					   	// バッチ処理区分

			 
			 //固定値をセット
			 batchProcessingTyp = "2";    // 2: 自動運転しない（夜間バッチなし）
			 
			 ResourceBundle bundle = SystemConfig.getBundle();
		     String javaPath = SystemConfig.getProperty("JAVA_PATH", bundle);
		     if(javaPath == null){
		    	 setErrorMessage("ZZ09010");
		     }
		     String ClassPath = SystemConfig.getProperty("CLASS_PATH", bundle);
		     if(ClassPath == null){
		    	 setErrorMessage("ZZ09012");
		     }
		     String batchPath = SystemConfig.getProperty("BATCH_PATH", bundle);
		     if(batchPath == null){
		    	 setErrorMessage("ZZ09011");
		     }		     
		     
		     // 個別オーダ発効バッチ
//			 String cmdB001 = "";
//			   cmdB001 = cmdB001 + javaPath;    // ＪＶＭ
//			   cmdB001 = cmdB001 + " -cp ";
//			   cmdB001 = cmdB001 + ClassPath;   // Java ClassPath
//			   cmdB001 = cmdB001 + " -Dcom.nec.jp.orteus.util.logging.config.file=";
//			   cmdB001 = cmdB001 + batchPath;   //"; // 起動設定
//		       // 呼び出し先クラス
//			   cmdB001 = cmdB001 + (" com.nec.jp.orteus.metamorBase.AC0150.AC0150B001.mainAC0150B001");
//			   cmdB001 = cmdB001 + " \"" + batchProcessingTyp + "\""; // バッチ処理区分
//			   cmdB001 = cmdB001 + " \"" + userId + "\"";				// ユーザID
//	 		   cmdB001 = cmdB001 + " \"" + plantCd + "\"";				// 工場コード
//			   cmdB001 = cmdB001 + " \"" + SysTime + "\"";              // タイムスタンプ
//			   cmdB001 = cmdB001 + " \"" + JobOdrCd + "\"";              // 製番
	               //cmdB001 = cmdB001 + " " + null;					// 製番枝番（予備）
	               
	         //バッチを実行する
//			 Runtime runtime = Runtime.getRuntime();
			 
			 // ===============================
			 // 個別オーダ発効バッチを実行
			 // ===============================

//			 Process p = runtime.exec(cmdB001);
			 
		     List buffer = new ArrayList();
		     buffer.add(javaPath);            // ＪＶＭ
		     buffer.add("-cp");
		     buffer.add(ClassPath);          // Java ClassPath
		     buffer.add("-Dcom.nec.jp.orteus.util.logging.config.file="+batchPath); // 起動設定
		     buffer.add("com.nec.jp.orteus.metamorBase.AC0150.AC0150B001.mainAC0150B001"); // 呼び出し先クラス
		     buffer.add(batchProcessingTyp);             // バッチ処理区分
		     buffer.add(userId);                         // ユーザID
		     buffer.add(plantCd);                        // 工場コード
		     buffer.add(SysTime);                        // タイムスタンプ
		     buffer.add(JobOdrCd);                       // 製番

		     // バッチ処理実行
		     Runtime runtime = Runtime.getRuntime();
		     runtime.exec((String[])buffer.toArray(new String[buffer.size()]));
			 // バッチ呼び出し成功の場合、画面メッセージを表示する。
			 setWarningMessage("ZZ09013");
             
		} catch (Exception e) {
			e.printStackTrace();			
			// バッチ呼び出し失敗の場合、画面メッセージを表示する。
			setErrorMessage("ZZ09014");
			try{
				// 一時テーブルを削除する
				entity.mT_ODRELEASE_T.delete(conn, struct);
			}catch(Exception ee){
				ee.printStackTrace();
				setErrorMessage("ZZ01106");
				return;
			}
			
			return;
		}
	}
	/**
     * 業務ロジックのエラーメッセージ設定処理
     * @param メッセージ番号
     */
    private void setWarningMessage(String code){
     ExpjMessage emsg = new ExpjMessage(code);
     msgStruct.addWarn( emsg );	// エラーメッセージとして登録
     sysLog.warning(emsg, getsysUSER_CD()); //メッセージ内容
    }
	/**
     * 業務ロジックのエラーメッセージ設定処理
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
     * 画面に製番計画情報の設定
     */
    private void setJobOdr(AC0150010Struct WorkStruct)throws Exception{
    	if(WorkStruct==null){
			struct.setJOB_ODR_STS_TYP_NAME("");
			struct.setJOB_ODR_TYP_NAME("");
			struct.setPLAN_TYP_NAME("");
			struct.setALC_GRP_CD("");
			struct.setJOB_ODR_DLV_DATE("");
			struct.setJOB_ODR_QTY("");
			struct.setJOB_ODR_DEL_FLG("");

    	}else{
    		struct.setJOB_ODR_STS_TYP_NAME(multcombo("JOB_ODR_STS_TYP", WorkStruct.getJOB_ODR_STS_TYP()));
			struct.setJOB_ODR_TYP_NAME(multcombo("JOB_ODR_TYP",WorkStruct.getJOB_ODR_TYP()));
			struct.setPLAN_TYP_NAME(multcombo("PLAN_TYP",WorkStruct.getPLAN_TYP()));
			struct.setALC_GRP_CD(WorkStruct.getALC_GRP_CD());
			struct.setJOB_ODR_DLV_DATE(WorkStruct.getJOB_ODR_DLV_DATE());
			struct.setJOB_ODR_QTY(WorkStruct.getJOB_ODR_QTY());
			struct.setJOB_ODR_DEL_FLG(WorkStruct.getJOB_ODR_DEL_FLG());
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
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0150");
		logger.entering("AC0150010Control"+":USER="+struct.getsUser_ID(),"controlselect");
			//{{user_implement_dev:<controlselect>
		try {
			flag = false;
			struct.setPLANT_CD(getsysPLANT_CD());
			setReadStatus(INITIAL);
			List WorkList = null;
			AC0150010Struct WorkStruct = null;
			list = new ArrayList(0);
			Levellist = new ArrayList(0);
			DisplayOrderID = 0;
			
			//展開レベル用フラグ 
			LevelOverFlg = false;
			//オーダ状態区分の初期化
            struct.setInC_ODR_STS_TYP("");

            
            // 画面編集不可項目クリア
            setJobOdr(null);
            
			// 製番計画の存在チェック
			WorkList = entity.mSelect_form.read(conn, struct);
			
			if(WorkList.isEmpty()||WorkList.size()==0){
				setErrorMessage("AJ00018");
				setErrorMessage("ZZ01006","T_JOB_ODR.JOB_ODR_CD:" + struct.getJOB_ODR_CD());
				setErrorMessage("ZZ01006","T_JOB_ODR.JOB_ODR_CANCEL_NO:" + struct.getJOB_ODR_CANCEL_NO());
			}else{
				WorkStruct=(AC0150010Struct)WorkList.get(0);
				if (struct.getPLANT_CD() != null && struct.getPLANT_CD().equals("") == false) {
					if (!WorkStruct.getPLANT_CD().equals(struct.getPLANT_CD())) {
						setErrorMessage("AJ00019");
						setErrorMessage("ZZ01006","T_JOB_ODR.PLANT_CD:" + WorkStruct.getPLANT_CD());
					}
				}
				if (WorkStruct.getJOB_ODR_STS_TYP().equals("1")
					|| WorkStruct.getJOB_ODR_STS_TYP().equals("2")) {
					// 所要量計算を実行していない
					setErrorMessage("AJ00016");
				} else {
					setJobOdr(WorkStruct);
				}
			
			}
			
			// 品目番号が指定されている場合
			if (struct.getITEM_CD() != null&& !struct.getITEM_CD().equals("")) {
				WorkList = entity.mM_ITEM.read(conn, struct);
				if (WorkList.isEmpty()||WorkList.size()== 0) {
					setErrorMessage("AJ00015");
					setErrorMessage("ZZ01006","M_ITEM.ITEM_CD:" + struct.getITEM_CD());
					struct.setITEM_NAME("");
				} else {
					struct.setITEM_NAME(((AC0150010Struct)WorkList.get(0)).getITEM_NAME());
				}
			}		
	
			//オーダ状態区分設定
            if("true".equals(struct.getc1_ODR_STS_TYP())){
            	//1:計画（末発効）
            	struct.setInC_ODR_STS_TYP("1");
            }
            
            
            // エラーがあれば終了
			if (msgStruct.hasError()) {

				setReadStatus(ERROR);

				return;
			}
			
			// 展開レベル（初期値）
			maxDevelopLevel = Integer.parseInt(struct.getDEVELOP_LEVEL());
			int level = 1;
			// 正展開
          	developForward(null, struct.getJOB_ODR_CD(),struct.getJOB_ODR_CANCEL_NO(), struct.getPLANT_CD(), level,struct.getInC_ODR_STS_TYP());
			
			if (struct.getJOB_ODR_DEL_FLG().equals("1")) {
				// 削除対象（ワーニング）
				setWarningMessage("AJ00017");
			}
			if (list.size() > 0) {
				// 表示行数制限値(SYS_SCREEN_PARM)を超えた場合エラー
	          	int maxLine = sp.getMaxLine(conn, 10);
	          	if ((maxLine != 0) && (list.size() > maxLine)) {
	            	setErrorMessage("AC00229", String.valueOf(maxLine));
	            	setList(null);
	            	setReadStatus(TOO_MANY);
	            	return;
	          	}
	          	
				setReadStatus(NORMAL);
			}else{	
				setErrorMessage("ZZ06001");
				setReadStatus(NOT_FOUND);
				return;
			}
	

			if (LevelOverFlg){
				setWarningMessage("AC00232");
			}
			
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
		logger.exiting("AC0150010Control"+":USER="+struct.getsUser_ID(),"controlselect");

		return;
	}

	/**
	 * 全解除ボタン押下時に実行される処理です。
	 *
	 */
	public void controlClearAssort() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0150");
		logger.entering("AC0150010Control"+":USER="+struct.getsUser_ID(),"controlClearAssort");
			//{{user_implement_dev:<controlClearAssort>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlClearAssort>
		logger.exiting("AC0150010Control"+":USER="+struct.getsUser_ID(),"controlClearAssort");

		return;
	}

	/**
	 * オーダ発効ボタン押下時に実行される処理です。
	 *
	 */
	public void controlReleased() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0150");
		logger.entering("AC0150010Control"+":USER="+struct.getsUser_ID(),"controlReleased");
			//{{user_implement_dev:<controlReleased>
		try{
			AC0150010Struct WorksSruct = null;
			List WorkList = null;
			//add by ホウ誌偉　2008/4/9  start
			String od_No = null;
			//dataがListに存在フラグ
			boolean dateFlg = false;
			List T_ODRELEASE_TList = new ArrayList(0);
			//add by ホウ誌偉　2008/4/9  end
			struct.setPLANT_CD(getsysPLANT_CD());
			struct.setSYS_USER(getsysUSER_CD());
			struct.setSYS_TIME(getDateTime());
			WorkList = struct.getList_OrderID();
			
			//最上位オーダ存在フラグ
			boolean RootFlg = false;
			
			//最上位オーダを検索する
			for (int i=0;i < WorkList.size();i++){
				if ("0".equals((String)WorkList.get(i))){
					RootFlg = true;
				}
			}
			//発効対象中に最上位オーダを入る場合(全て展開した対象を発効する)
			if(RootFlg){
				for (int i=0;i < Levellist.size();i++){
					WorksSruct = (AC0150010Struct)Levellist.get(i);
					WorksSruct.setsUser_ID(getsysUSER_CD());
					WorksSruct.setSYS_USER(getsysUSER_CD());
					WorksSruct.setSYS_TIME(struct.getSYS_TIME());
					WorksSruct.setPLANT_CD(getsysPLANT_CD());
					//オーダ状態区分は計画ではない場合、対象外です
					if (!"1".equals(WorksSruct.getl_ODR_STS_TYP())){
						continue;
					}
					entity.mT_ODRELEASE_T.create(conn, WorksSruct);
				}
			}else{	//発効対象中に最上位オーダを入らない場合(対象を選ぶ)
				
				for (int i=0;i < WorkList.size();i++){
					int j = Integer.parseInt((String)WorkList.get(i));
					WorksSruct = (AC0150010Struct)Levellist.get(j);
					WorksSruct.setsUser_ID(getsysUSER_CD());
					WorksSruct.setSYS_USER(getsysUSER_CD());
					WorksSruct.setSYS_TIME(struct.getSYS_TIME());
					WorksSruct.setPLANT_CD(getsysPLANT_CD());
					//entity.mT_ODRELEASE_T.create(conn, WorksSruct);

					//add by ホウ誌偉　2008/4/9  start
					if(T_ODRELEASE_TList.size() == 0){
						T_ODRELEASE_TList.add(WorksSruct);								
					}
					dateFlg = false;
					od_No = WorksSruct.getl_OD_NO();
					for(int tSize = 0; tSize < T_ODRELEASE_TList.size();tSize++){
						if(od_No.equals(((AC0150010Struct)T_ODRELEASE_TList.get(tSize)).getl_OD_NO())){
							dateFlg = true;
							break;
						}				
					}
					if(!dateFlg){
						T_ODRELEASE_TList.add(WorksSruct);		
					}
					//add by ホウ誌偉　2008/4/9  end
					
					int intLev_No = Integer.parseInt(WorksSruct.getLev_No());
					//発効対象の下位オーダを処理する
					for (j = ++j; j < Levellist.size()
							&& (intLev_No < Integer
									.parseInt(((AC0150010Struct) Levellist
											.get(j)).getLev_No())); j++) {
						
						WorksSruct = (AC0150010Struct) Levellist.get(j);
						//オーダ状態区分は計画ではない場合、対象外です
						if (!"1".equals(WorksSruct.getl_ODR_STS_TYP())){
							continue;
						}
						WorksSruct.setsUser_ID(getsysUSER_CD());
						WorksSruct.setSYS_USER(getsysUSER_CD());
						WorksSruct.setSYS_TIME(struct.getSYS_TIME());
						WorksSruct.setPLANT_CD(getsysPLANT_CD());
						//entity.mT_ODRELEASE_T.create(conn, WorksSruct);

						//add by ホウ誌偉　2008/4/9  start
						dateFlg = false;
						od_No = WorksSruct.getl_OD_NO();
						for(int tSize = 0; tSize < T_ODRELEASE_TList.size();tSize++){
							if(od_No.equals(((AC0150010Struct)T_ODRELEASE_TList.get(tSize)).getl_OD_NO())){
								dateFlg = true;
								break;
							}				
						}
						if(!dateFlg){
							T_ODRELEASE_TList.add(WorksSruct);		
						}						
						//add by ホウ誌偉　2008/4/9  end
					}
					
				}

				//add by ホウ誌偉　2008/4/9  start
				for(int i = 0;i<T_ODRELEASE_TList.size();i++){
					AC0150010Struct insertStruct = (AC0150010Struct)T_ODRELEASE_TList.get(i);					
					entity.mT_ODRELEASE_T.create(conn, insertStruct);					
				}
				//add by ホウ誌偉　2008/4/9  end
			}
			conn.commit();
			//オーダ発効を実行する			
			OdrReleas();
			
		}catch(Exception e){
			setReadStatus(ERROR);	
			conn.rollback();
			e.printStackTrace();
			// エラー処理を記述します
			ExpjMessage emsg = new ExpjMessage("ZZ01106");
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(emsg);
			throw ee;
		}
                //}}user_implement_dev:<controlReleased>
		logger.exiting("AC0150010Control"+":USER="+struct.getsUser_ID(),"controlReleased");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0150");
		logger.entering("AC0150010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
		try{
			//画面の初期化
			struct.setPLANT_CD(getsysPLANT_CD());
			PrivateConfig c = new PrivateConfig(conn);
			Integer level = c.getNumber("INIT_DISPLAY_PS_LEVEL");
			String _level = TypeConverter.sanitizer(level);
			struct.setDEVELOP_LEVEL(_level);
			setList(null);
			setReadStatus(INITIAL);
		}catch(Exception e){
			e.printStackTrace();
		}		
                //}}user_implement_dev:<controlClear>
		logger.exiting("AC0150010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * 閉じるボタン押下時に実行される処理です。
	 *
	 */
	public void controlClose() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0150");
		logger.entering("AC0150010Control"+":USER="+struct.getsUser_ID(),"controlClose");
			//{{user_implement_dev:<controlClose>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlClose>
		logger.exiting("AC0150010Control"+":USER="+struct.getsUser_ID(),"controlClose");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0150");
		logger.entering("AC0150010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AC0150010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0150");
		logger.entering("AC0150010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
		try{
			//画面の初期化
			struct.setPLANT_CD(getsysPLANT_CD());
			PrivateConfig c = new PrivateConfig(conn);
			Integer level = c.getNumber("INIT_DISPLAY_PS_LEVEL");
			String _level = TypeConverter.sanitizer(level);
			struct.setDEVELOP_LEVEL(_level);
		}catch(Exception e){
			e.printStackTrace();
		}
	
/*			// データベースへのアクセスを行う場合は、このtry catch文のコメントを外してください。
		try{
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
		logger.exiting("AC0150010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * イベントハンドラの前処理です。
	 *
	 * @param buttun ボタン名
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0150");
		logger.entering("AC0150010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
		logger.exiting("AC0150010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("ClearAssort") ) {
				controlClearAssort();
			} else if( button.equals("Released") ) {
				controlReleased();
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
//			throw new FoundationException("AC0150010Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AC0150010-E999","CSVの出力処理"));
			throw new FoundationException("AC0150010Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AC0150010-E999","システム日付の取得処理"));
				throw new FoundationException("AC0150010Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AC0150010-E999","コントロールのイベント処理"));
			throw new FoundationException("AC0150010Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected AC0150010Entity entity;
	protected AC0150010Struct struct;
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

		entity = new AC0150010Entity();
		struct = new AC0150010Struct();

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
	 * AC0150010クラスの標準コンストラクタ
	 */
	public AC0150010Control() throws BusinessProcessException, FoundationException
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
				AC0150010Struct key = (AC0150010Struct)keyList.get(j);
				// メッセージキーを作成する
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("DEVELOP_LEVEL") && key.getDEVELOP_LEVEL() != null) {
					msgKey.setKeyValue("DEVELOP_LEVEL", key.getDEVELOP_LEVEL());
				}
				if(msgKeyType.containsKeyColumn("c1_ODR_STS_TYP") && key.getc1_ODR_STS_TYP() != null) {
					msgKey.setKeyValue("c1_ODR_STS_TYP", key.getc1_ODR_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_TYP_NAME") && key.getJOB_ODR_TYP_NAME() != null) {
					msgKey.setKeyValue("JOB_ODR_TYP_NAME", key.getJOB_ODR_TYP_NAME());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_STS_TYP_NAME") && key.getJOB_ODR_STS_TYP_NAME() != null) {
					msgKey.setKeyValue("JOB_ODR_STS_TYP_NAME", key.getJOB_ODR_STS_TYP_NAME());
				}
				if(msgKeyType.containsKeyColumn("Lev_No") && key.getLev_No() != null) {
					msgKey.setKeyValue("Lev_No", key.getLev_No());
				}
				if(msgKeyType.containsKeyColumn("l_ODR_STS_TYP_NAME") && key.getl_ODR_STS_TYP_NAME() != null) {
					msgKey.setKeyValue("l_ODR_STS_TYP_NAME", key.getl_ODR_STS_TYP_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_OUTSIDE_TYP_NAME") && key.getl_OUTSIDE_TYP_NAME() != null) {
					msgKey.setKeyValue("l_OUTSIDE_TYP_NAME", key.getl_OUTSIDE_TYP_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_OD_GNR_TYP_NAME") && key.getl_OD_GNR_TYP_NAME() != null) {
					msgKey.setKeyValue("l_OD_GNR_TYP_NAME", key.getl_OD_GNR_TYP_NAME());
				}
				if(msgKeyType.containsKeyColumn("PLAN_TYP_NAME") && key.getPLAN_TYP_NAME() != null) {
					msgKey.setKeyValue("PLAN_TYP_NAME", key.getPLAN_TYP_NAME());
				}
				if(msgKeyType.containsKeyColumn("OrderID") && key.getOrderID() != null) {
					msgKey.setKeyValue("OrderID", key.getOrderID());
				}
				if(msgKeyType.containsKeyColumn("InC_ODR_STS_TYP") && key.getInC_ODR_STS_TYP() != null) {
					msgKey.setKeyValue("InC_ODR_STS_TYP", key.getInC_ODR_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_STS_TYP") && key.getJOB_ODR_STS_TYP() != null) {
					msgKey.setKeyValue("JOB_ODR_STS_TYP", key.getJOB_ODR_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_TYP") && key.getJOB_ODR_TYP() != null) {
					msgKey.setKeyValue("JOB_ODR_TYP", key.getJOB_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("PLAN_TYP") && key.getPLAN_TYP() != null) {
					msgKey.setKeyValue("PLAN_TYP", key.getPLAN_TYP());
				}
				if(msgKeyType.containsKeyColumn("ALC_GRP_CD") && key.getALC_GRP_CD() != null) {
					msgKey.setKeyValue("ALC_GRP_CD", key.getALC_GRP_CD());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_DLV_DATE") && key.getJOB_ODR_DLV_DATE() != null) {
					msgKey.setKeyValue("JOB_ODR_DLV_DATE", key.getJOB_ODR_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_QTY") && key.getJOB_ODR_QTY() != null) {
					msgKey.setKeyValue("JOB_ODR_QTY", key.getJOB_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_DEL_FLG") && key.getJOB_ODR_DEL_FLG() != null) {
					msgKey.setKeyValue("JOB_ODR_DEL_FLG", key.getJOB_ODR_DEL_FLG());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_CD") && key.getJOB_ODR_CD() != null) {
					msgKey.setKeyValue("JOB_ODR_CD", key.getJOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_CANCEL_NO") && key.getJOB_ODR_CANCEL_NO() != null) {
					msgKey.setKeyValue("JOB_ODR_CANCEL_NO", key.getJOB_ODR_CANCEL_NO());
				}
				if(msgKeyType.containsKeyColumn("l_OD_NO") && key.getl_OD_NO() != null) {
					msgKey.setKeyValue("l_OD_NO", key.getl_OD_NO());
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
				if(msgKeyType.containsKeyColumn("l_ODR_STS_TYP") && key.getl_ODR_STS_TYP() != null) {
					msgKey.setKeyValue("l_ODR_STS_TYP", key.getl_ODR_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_DUE_DATE") && key.getl_DUE_DATE() != null) {
					msgKey.setKeyValue("l_DUE_DATE", key.getl_DUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_ODR_START_DATE") && key.getl_ODR_START_DATE() != null) {
					msgKey.setKeyValue("l_ODR_START_DATE", key.getl_ODR_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_PRD_DUE_DATE") && key.getl_PRD_DUE_DATE() != null) {
					msgKey.setKeyValue("l_PRD_DUE_DATE", key.getl_PRD_DUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_PRD_START_DATE") && key.getl_PRD_START_DATE() != null) {
					msgKey.setKeyValue("l_PRD_START_DATE", key.getl_PRD_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_ODR_QTY") && key.getl_ODR_QTY() != null) {
					msgKey.setKeyValue("l_ODR_QTY", key.getl_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_OUTSIDE_TYP") && key.getl_OUTSIDE_TYP() != null) {
					msgKey.setKeyValue("l_OUTSIDE_TYP", key.getl_OUTSIDE_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_RCV_QTY") && key.getl_RCV_QTY() != null) {
					msgKey.setKeyValue("l_RCV_QTY", key.getl_RCV_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_RCV_CMPLT_DATE") && key.getl_RCV_CMPLT_DATE() != null) {
					msgKey.setKeyValue("l_RCV_CMPLT_DATE", key.getl_RCV_CMPLT_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_OD_GNR_TYP") && key.getl_OD_GNR_TYP() != null) {
					msgKey.setKeyValue("l_OD_GNR_TYP", key.getl_OD_GNR_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_DM_STS_TYP") && key.getl_DM_STS_TYP() != null) {
					msgKey.setKeyValue("l_DM_STS_TYP", key.getl_DM_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("MRP_TYP") && key.getMRP_TYP() != null) {
					msgKey.setKeyValue("MRP_TYP", key.getMRP_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_RLSD_PUCH_ODR_QTY") && key.getl_RLSD_PUCH_ODR_QTY() != null) {
					msgKey.setKeyValue("l_RLSD_PUCH_ODR_QTY", key.getl_RLSD_PUCH_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_WORK_IN_PROC_QTY") && key.getl_WORK_IN_PROC_QTY() != null) {
					msgKey.setKeyValue("l_WORK_IN_PROC_QTY", key.getl_WORK_IN_PROC_QTY());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("OD_NO") && key.getOD_NO() != null) {
					msgKey.setKeyValue("OD_NO", key.getOD_NO());
				}
				if(msgKeyType.containsKeyColumn("PARENT_OD_NO") && key.getPARENT_OD_NO() != null) {
					msgKey.setKeyValue("PARENT_OD_NO", key.getPARENT_OD_NO());
				}
				if(msgKeyType.containsKeyColumn("ITEM_NAME") && key.getITEM_NAME() != null) {
					msgKey.setKeyValue("ITEM_NAME", key.getITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("SYS_USER") && key.getSYS_USER() != null) {
					msgKey.setKeyValue("SYS_USER", key.getSYS_USER());
				}
				if(msgKeyType.containsKeyColumn("SYS_TIME") && key.getSYS_TIME() != null) {
					msgKey.setKeyValue("SYS_TIME", key.getSYS_TIME());
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
					AC0150010Struct key = new AC0150010Struct();
					if(msgKeyType.containsKeyColumn("DEVELOP_LEVEL")) {
						key.setDEVELOP_LEVEL(msgKey.getKeyValue("DEVELOP_LEVEL"));
					}
					if(msgKeyType.containsKeyColumn("c1_ODR_STS_TYP")) {
						key.setc1_ODR_STS_TYP(msgKey.getKeyValue("c1_ODR_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_TYP_NAME")) {
						key.setJOB_ODR_TYP_NAME(msgKey.getKeyValue("JOB_ODR_TYP_NAME"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_STS_TYP_NAME")) {
						key.setJOB_ODR_STS_TYP_NAME(msgKey.getKeyValue("JOB_ODR_STS_TYP_NAME"));
					}
					if(msgKeyType.containsKeyColumn("Lev_No")) {
						key.setLev_No(msgKey.getKeyValue("Lev_No"));
					}
					if(msgKeyType.containsKeyColumn("l_ODR_STS_TYP_NAME")) {
						key.setl_ODR_STS_TYP_NAME(msgKey.getKeyValue("l_ODR_STS_TYP_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_OUTSIDE_TYP_NAME")) {
						key.setl_OUTSIDE_TYP_NAME(msgKey.getKeyValue("l_OUTSIDE_TYP_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_OD_GNR_TYP_NAME")) {
						key.setl_OD_GNR_TYP_NAME(msgKey.getKeyValue("l_OD_GNR_TYP_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PLAN_TYP_NAME")) {
						key.setPLAN_TYP_NAME(msgKey.getKeyValue("PLAN_TYP_NAME"));
					}
					if(msgKeyType.containsKeyColumn("OrderID")) {
						key.setOrderID(msgKey.getKeyValue("OrderID"));
					}
					if(msgKeyType.containsKeyColumn("InC_ODR_STS_TYP")) {
						key.setInC_ODR_STS_TYP(msgKey.getKeyValue("InC_ODR_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_STS_TYP")) {
						key.setJOB_ODR_STS_TYP(msgKey.getKeyValue("JOB_ODR_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_TYP")) {
						key.setJOB_ODR_TYP(msgKey.getKeyValue("JOB_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PLAN_TYP")) {
						key.setPLAN_TYP(msgKey.getKeyValue("PLAN_TYP"));
					}
					if(msgKeyType.containsKeyColumn("ALC_GRP_CD")) {
						key.setALC_GRP_CD(msgKey.getKeyValue("ALC_GRP_CD"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_DLV_DATE")) {
						key.setJOB_ODR_DLV_DATE(msgKey.getKeyValue("JOB_ODR_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_QTY")) {
						key.setJOB_ODR_QTY(msgKey.getKeyValue("JOB_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_DEL_FLG")) {
						key.setJOB_ODR_DEL_FLG(msgKey.getKeyValue("JOB_ODR_DEL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_CD")) {
						key.setJOB_ODR_CD(msgKey.getKeyValue("JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_CANCEL_NO")) {
						key.setJOB_ODR_CANCEL_NO(msgKey.getKeyValue("JOB_ODR_CANCEL_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_OD_NO")) {
						key.setl_OD_NO(msgKey.getKeyValue("l_OD_NO"));
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
					if(msgKeyType.containsKeyColumn("l_ODR_STS_TYP")) {
						key.setl_ODR_STS_TYP(msgKey.getKeyValue("l_ODR_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_DUE_DATE")) {
						key.setl_DUE_DATE(msgKey.getKeyValue("l_DUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_ODR_START_DATE")) {
						key.setl_ODR_START_DATE(msgKey.getKeyValue("l_ODR_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_PRD_DUE_DATE")) {
						key.setl_PRD_DUE_DATE(msgKey.getKeyValue("l_PRD_DUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_PRD_START_DATE")) {
						key.setl_PRD_START_DATE(msgKey.getKeyValue("l_PRD_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_ODR_QTY")) {
						key.setl_ODR_QTY(msgKey.getKeyValue("l_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_OUTSIDE_TYP")) {
						key.setl_OUTSIDE_TYP(msgKey.getKeyValue("l_OUTSIDE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_RCV_QTY")) {
						key.setl_RCV_QTY(msgKey.getKeyValue("l_RCV_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_RCV_CMPLT_DATE")) {
						key.setl_RCV_CMPLT_DATE(msgKey.getKeyValue("l_RCV_CMPLT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_OD_GNR_TYP")) {
						key.setl_OD_GNR_TYP(msgKey.getKeyValue("l_OD_GNR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_DM_STS_TYP")) {
						key.setl_DM_STS_TYP(msgKey.getKeyValue("l_DM_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("MRP_TYP")) {
						key.setMRP_TYP(msgKey.getKeyValue("MRP_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_RLSD_PUCH_ODR_QTY")) {
						key.setl_RLSD_PUCH_ODR_QTY(msgKey.getKeyValue("l_RLSD_PUCH_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_WORK_IN_PROC_QTY")) {
						key.setl_WORK_IN_PROC_QTY(msgKey.getKeyValue("l_WORK_IN_PROC_QTY"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("OD_NO")) {
						key.setOD_NO(msgKey.getKeyValue("OD_NO"));
					}
					if(msgKeyType.containsKeyColumn("PARENT_OD_NO")) {
						key.setPARENT_OD_NO(msgKey.getKeyValue("PARENT_OD_NO"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_NAME")) {
						key.setITEM_NAME(msgKey.getKeyValue("ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("SYS_USER")) {
						key.setSYS_USER(msgKey.getKeyValue("SYS_USER"));
					}
					if(msgKeyType.containsKeyColumn("SYS_TIME")) {
						key.setSYS_TIME(msgKey.getKeyValue("SYS_TIME"));
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
