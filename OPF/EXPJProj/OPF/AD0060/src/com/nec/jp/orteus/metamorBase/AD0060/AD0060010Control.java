/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AD0060/src/com/nec/jp/orteus/metamorBase/AD0060/AD0060010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AD0060;

import com.nec.jp.orteus.metamorBase.AD0060.*;
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
import com.nec.jp.orteus.metamorBase.common08.LotCtrl.LotCtrl;
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AD0060010Control
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
	public AD0060010Struct getListvalue(int x) { return (AD0060010Struct)(this.list.get(x)); }	// リストの値を返します。
	public AD0060010Struct getStruct() { return this.struct; }	// Structを返します。
	public AD0060010Struct createStruct() { return new AD0060010Struct(); }	// 新しいStructを作って返します。
	public void setStruct(Object structname) { this.struct.setStruct((AD0060010Struct)structname); }	// Structをセットします。
	public void initializeStruct() { this.struct.initialize(); }	// Structの値を初期化します。

	// CSV出力用リスト
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }

	// TODO: ユーザ定義のコードを記述してください

        /**
         * 画面遷移キー(現品票管理番号)
         */
	private String _IdentCardCtlNo;

        /**
         * 画面遷移キー(現品票管理番号)設定
         * @param cd 現品票管理番号
         */
	protected void setIdentCardCtlNo(String cd){ _IdentCardCtlNo = cd; };

        /**
         * 画面遷移キー(現品票管理番号)取得
         * @return 現品票管理番号
         */
	protected String getIdentCardCtlNo(){ return _IdentCardCtlNo; };

	/**
	 * 業務ロジックのインフォメーションメッセージ設定処理を切り出して関数化
	 * @param code メッセージコード
	 */
	private void setInformationMessage(String code) {
		ExpjMessage emsg = new ExpjMessage(code);
		msgStruct.addInfo(emsg);
	}
	/**
	 * 業務ロジックのワーニングメッセージ設定処理を切り出して関数化
	 * @param code メッセージコード
	 */
	private void setWarningMessage(String code) {
		ExpjMessage emsg = new ExpjMessage(code);
		msgStruct.addWarn(emsg);
		sysLog.info(emsg, sysUSER_CD);
	}
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

	/** ロット管理導入済チェック **/
	private boolean lotCtrlFlg = false;
	
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * 読込ボタン押下時に実行される処理です。
	 *
	 */
	public void controlselect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0060");
		logger.entering("AD0060010Control"+":USER="+struct.getsUser_ID(),"controlselect");
			//{{user_implement_dev:<controlselect>
			// TODO: ユーザ定義のコードを記述してください
		try {
			ResourceBundle bundle = SystemConfig.getBundle();
			dbUID = SystemConfig.getProperty("CONNECT_DBUSER", bundle);
			dbPWD = SystemConfig.getProperty("CONNECT_DBPASS", bundle);
			dbDBQ = SystemConfig.getProperty("CONNECT_DBHOST", bundle);
			dbKIND = SystemConfig.getProperty("CONNECT_KIND", bundle);
		} catch(MissingResourceException e) {
			e.printStackTrace();
		}
		try {

			_IdentCardCtlNo = struct.getIDENT_CARD_CTL_NO();//現品票管理番号

			struct.initialize();

			// 読込ステータス設定
			setReadStatus(INITIAL);

			AD0060010Struct IdentCardStruct = new AD0060010Struct();

			IdentCardStruct.setIDENT_CARD_CTL_NO(_IdentCardCtlNo);
			struct.setIDENT_CARD_CTL_NO(_IdentCardCtlNo);

			//現品票読込処理
			List list_temp = entity.mselect.read(conn, IdentCardStruct);

			//データの存在チェックを行う
			if (list_temp.size()==0||list_temp.isEmpty()){
				setErrorMessage("ZZ06001");
				// 検索状態「O件読込」に設定
				setReadStatus(NOT_FOUND);
				return;
			}

			IdentCardStruct = (AD0060010Struct) list_temp.get(0);

			//工場コードがログインユーザの工場かチェックを行う
			if (!this.sysPLANT_CD.equals(IdentCardStruct.getPLANT_CD())){
				setErrorMessage("AE05002");
				return;
			}

			//削除フラグが1:削除かチェックを行う
			if ("1".equals(IdentCardStruct.getDEL_FLG())){
				setErrorMessage("KZ10002");
				return;
			}

			struct.setIDENT_CARD_CTL_NO(_IdentCardCtlNo);
			struct.setT_IDENT_CARD_CTL_NO(_IdentCardCtlNo);
			struct.setOPR_INST_CD(IdentCardStruct.getOPR_INST_CD());
			struct.setPARTIAL_PRD_NO(IdentCardStruct.getPARTIAL_PRD_NO());
			struct.setITEM_CD(IdentCardStruct.getITEM_CD());
			struct.setITEM_NAME(IdentCardStruct.getITEM_NAME());
			struct.setWS_CD(IdentCardStruct.getWS_CD());
			struct.setWS_NAME(IdentCardStruct.getWS_NAME());
			struct.setOPR_DATE(IdentCardStruct.getOPR_DATE());
			struct.setFIRST_IDENT_CARD_QTY(IdentCardStruct.getFIRST_IDENT_CARD_QTY());
			struct.setIDENT_CARD_QTY(IdentCardStruct.getIDENT_CARD_QTY());
			struct.setORI_IDENT_CARD_QTY(IdentCardStruct.getIDENT_CARD_QTY());
			struct.setPKG_UNIT_QTY(IdentCardStruct.getPKG_UNIT_QTY());
			struct.setPLANT_CD(IdentCardStruct.getPLANT_CD());
			struct.setDEL_FLG(IdentCardStruct.getDEL_FLG());
			struct.setMODIFY_COUNT(IdentCardStruct.getMODIFY_COUNT());
			struct.seth_UNIT_QTY_TYP(IdentCardStruct.geth_UNIT_QTY_TYP());
			struct.setJOB_ODR_CD(IdentCardStruct.getJOB_ODR_CD());
			// ロット導入場合
			if(lotCtrlFlg) {
				struct.setLOT_NO(IdentCardStruct.getLOT_NO());
			}
			
			String pageno = Calculate.divide(IdentCardStruct.getIDENT_CARD_QTY(), IdentCardStruct.getPKG_UNIT_QTY(), 0, Calculate.FLOOR);

			double bunshi = Double.parseDouble(IdentCardStruct.getIDENT_CARD_QTY());
			double bunbo = Double.parseDouble(IdentCardStruct.getPKG_UNIT_QTY());
			double overno;

			//現品票数量÷荷姿単位数量の余りを求める
			overno = bunshi % bunbo;

			//総ページ数の算出
			if (0 < overno){
				//余りがある場合、１を加算
				pageno = Calculate.add(pageno, "1");
			}

			struct.setPRINT_QTY(pageno);

			// 読込ステータス設定
			setReadStatus(NORMAL);

		} catch(SQLException e) {
			// 読込ステータス設定
			setReadStatus(ERROR);
			throw new ExpjException(e);
		}
                //}}user_implement_dev:<controlselect>
		logger.exiting("AD0060010Control"+":USER="+struct.getsUser_ID(),"controlselect");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlclear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0060");
		logger.entering("AD0060010Control"+":USER="+struct.getsUser_ID(),"controlclear");
			//{{user_implement_dev:<controlclear>
			// TODO: ユーザ定義のコードを記述してください
		try{
			struct.initialize();

			// 読込ステータス設定
			setReadStatus(INITIAL);

		}catch(Exception e){
			throw new ExpjException(e);
		}
                //}}user_implement_dev:<controlclear>
		logger.exiting("AD0060010Control"+":USER="+struct.getsUser_ID(),"controlclear");

		return;
	}

	/**
	 * 閉じるボタン押下時に実行される処理です。
	 *
	 */
	public void controlclose() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0060");
		logger.entering("AD0060010Control"+":USER="+struct.getsUser_ID(),"controlclose");
			//{{user_implement_dev:<controlclose>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlclose>
		logger.exiting("AD0060010Control"+":USER="+struct.getsUser_ID(),"controlclose");

		return;
	}

	/**
	 * 更新ボタン押下時に実行される処理です。
	 *
	 */
	public void controlPrint() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0060");
		logger.entering("AD0060010Control"+":USER="+struct.getsUser_ID(),"controlPrint");
			AD0060010Struct strPdf = null;

		int ret = 0;
		String printType      = getPdfOutputType();
		String printPattern   = getPdfOutputListPattern();
		String printer        = getPdfOutputPrinter();
		SvfWrapper svf        = new SvfWrapper(printType, getsysUSER_CD(), printer);

			//{{user_implement_dev:<controlPrint>
			// TODO: ユーザ定義のコードを記述してください
		try {
			String printId1 = "AD00600101";		// TODO: 帳票IDを指定してください

			ret = svf.VrInit(printId1);	// PDF作成開始
			pdfFilePath = svf.getPdfFilePath();	// pdfフルパスファイル名
			pdfFileName = svf.getPdfFileName();	// pdfファイル名（Web用）
			queryFileName = svf.getQueryFileName();	// queryファイル名

			int nRet = 0;
			long lngModifyCount = 0;

			conn.beginTransWeb();		// トランザクション開始

			AD0060010Struct IdentCardStruct = new AD0060010Struct();

			IdentCardStruct.setUPD_IDENT_CARD_QTY(struct.getIDENT_CARD_QTY());
			IdentCardStruct.setUPD_PRINT_QTY(struct.getPRINT_QTY());
			IdentCardStruct.setUPD_UPDATED_BY(this.sysUSER_CD);
			IdentCardStruct.setUPD_UPDATED_PRG_NM(this.sp.getProcId());
			IdentCardStruct.setUPD_IDENT_CARD_CTL_NO(struct.getT_IDENT_CARD_CTL_NO());
			IdentCardStruct.setUPD_MODIFY_COUNT(struct.getMODIFY_COUNT());
			//印刷後の再表示用に更新数を保存
			lngModifyCount = Long.parseLong(struct.getMODIFY_COUNT());

			//現品票の更新
			nRet = entity.mUpdateIdentCard.update(conn,IdentCardStruct);
			if (nRet!=1) {
				setErrorMessage("ZZ01105");
				this.struct.setIDENT_CARD_CTL_NO(_IdentCardCtlNo);
				return;
			}

			conn.commit();

			//印刷グループ番号の新規採番
			ManagementNumber mngNumber = new ManagementNumber();
			String strPrintGrpNo = mngNumber.getSequenceNo("SEQ_ICT");
			mngNumber = null;

			AD0060010Struct InsIdentCardTempStruct = new AD0060010Struct();

			InsIdentCardTempStruct.setTMP_IDENT_CARD_CTL_NO(this.struct.getT_IDENT_CARD_CTL_NO());

			List list_temp = entity.mSelectIdentCardForPrint.read(conn, InsIdentCardTempStruct);

			AD0060010Struct IdentCardTempStruct = new AD0060010Struct();

			//現品票の検索結果のチェック
			if (list_temp.size()==0||list_temp.isEmpty()){
				setErrorMessage("ZZ11001");
				this.struct.setIDENT_CARD_CTL_NO(_IdentCardCtlNo);
				return;
			}else{
				//現品票の検索結果を格納する
				InsIdentCardTempStruct = (AD0060010Struct) list_temp.get(0);
				IdentCardTempStruct.setINS_PRINT_GRP_NO(strPrintGrpNo);
				IdentCardTempStruct.setINS_IDENT_CARD_CTL_NO(InsIdentCardTempStruct.getTMP_IDENT_CARD_CTL_NO());
				IdentCardTempStruct.setINS_OPR_INST_CD(InsIdentCardTempStruct.getTMP_OPR_INST_CD());
				IdentCardTempStruct.setINS_PARTIAL_PRD_NO(InsIdentCardTempStruct.getTMP_PARTIAL_PRD_NO());
				IdentCardTempStruct.setINS_RCV_ISSUE_CTRL_CD(InsIdentCardTempStruct.getTMP_RCV_ISSUE_CTRL_CD());
				IdentCardTempStruct.setINS_ITEM_CD(InsIdentCardTempStruct.getTMP_ITEM_CD());
				IdentCardTempStruct.setINS_JOB_ODR_CD(InsIdentCardTempStruct.getTMP_JOB_ODR_CD());
				IdentCardTempStruct.setINS_FIRST_IDENT_CARD_QTY(InsIdentCardTempStruct.getTMP_FIRST_IDENT_CARD_QTY());
				IdentCardTempStruct.setINS_IDENT_CARD_QTY(InsIdentCardTempStruct.getTMP_IDENT_CARD_QTY());
				IdentCardTempStruct.setINS_OPR_DATE(InsIdentCardTempStruct.getTMP_OPR_DATE());
				IdentCardTempStruct.setINS_PKG_UNIT_QTY(InsIdentCardTempStruct.getTMP_PKG_UNIT_QTY());
				IdentCardTempStruct.setINS_PLANT_CD(InsIdentCardTempStruct.getTMP_PLANT_CD());
				IdentCardTempStruct.setINS_WS_CD(InsIdentCardTempStruct.getTMP_WS_CD());
				if(lotCtrlFlg) {
					IdentCardTempStruct.setLOT_NO(InsIdentCardTempStruct.getLOT_NO());	
				}
				IdentCardTempStruct.setINS_CREATED_BY(this.sysUSER_CD);
				IdentCardTempStruct.setINS_CREATED_PRG_NM(this.sp.getProcId());
				IdentCardTempStruct.setINS_UPDATED_BY(this.sysUSER_CD);
				IdentCardTempStruct.setINS_UPDATED_PRG_NM(this.sp.getProcId());
			}

            //現品票数量÷荷姿単位数量の商を求める
			String pageno = Calculate.divide(IdentCardTempStruct.getINS_IDENT_CARD_QTY(), IdentCardTempStruct.getINS_PKG_UNIT_QTY(), 0, Calculate.FLOOR);

			double bunshi = Double.parseDouble(IdentCardTempStruct.getINS_IDENT_CARD_QTY());
			double bunbo = Double.parseDouble(IdentCardTempStruct.getINS_PKG_UNIT_QTY());
			double overno;

			//現品票数量÷荷姿単位数量の余りを求める
			overno = bunshi % bunbo;

			//総ページ数の算出
			if (0 < overno){
				//余りがある場合、１を加算
				pageno = Calculate.add(pageno, "1");
			}

			//総ページ数分ループする
			for(long i=1;i<=Long.parseLong(pageno) ;i++)
			{
				//最終ページでかつ、余りがある場合
				if (i == Long.parseLong(pageno) && 0 < overno){
					//余りを荷姿単位数量に設定
					IdentCardTempStruct.setINS_PKG_UNIT_QTY(Double.toString(overno));
				}

				IdentCardTempStruct.setINS_PAGE_NO(Long.toString(i));

				// 現品票TEMPの登録
				entity.mInsertIdentCardTemp.create(conn,IdentCardTempStruct);
	    	}  

			conn.commit();

			/* クエリーファイルの指定 */
			if(dbKIND != null && !dbKIND.equals("")) {
				ret = svf.VrSetQuery("KIND=" + dbKIND + ";UID=" + dbUID + ";PWD=" + dbPWD + ";DBQ=" + dbDBQ);
			} else {
				ret = svf.VrSetQuery("UID=" + dbUID + ";PWD=" + dbPWD + ";DBQ=" + dbDBQ);
			}
			/* クエリー抽出条件の指定 */

			ret = svf.VrCondition("[X|PRINT_GRP_NO]=" + Long.parseLong(strPrintGrpNo), 4);

			/* クエリー抽出条件の指定 */

			//ret = svf.VrCondition("[X|INS_IDENT_CARD_CTL_NO]=" + struct.getINS_IDENT_CARD_CTL_NO(), 4);

			/* クエリー実行 */
			ret = svf.VrReport();
			if(ret == -554) {
				ExpjMessage emsg = new ExpjMessage("ZZ06001");
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
				}
			}

			//現品票TEMPの削除
			entity.mDeleteIdentCardTemp.delete(conn,IdentCardTempStruct);

			conn.commit();

			//印刷後の再表示の為にセット
			this.struct.setIDENT_CARD_CTL_NO(this.struct.getT_IDENT_CARD_CTL_NO());
			this.struct.setMODIFY_COUNT(Long.toString(lngModifyCount + 1));

//			objMessage.m_writer.write(Level.INFO, "file=" + svf.VrGetSpoolFileName() + "に出力");
		//}catch(SQLException e){
		//	e.printStackTrace();
		//	ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
		//	sysLog.severe(emsg, getsysUSER_CD());//致命的エラー エラー内容
		//	ExpjException ee = new ExpjException(e, emsg); // エクセプションを生成
		//	throw ee;
		//}catch(ExpjException msg) {
		//	msg.printStackTrace();
		//	throw msg;

		} catch (SQLException e) {
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			throw new ExpjException(e, emsg);
		} catch (Exception e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			throw new ExpjException(e, emsg);
		} finally {
			try {
				if (conn != null) {
					this.struct.setIDENT_CARD_CTL_NO(_IdentCardCtlNo);
					conn.rollback();
				}
			} catch(Exception e) {
				ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
				sysLog.severe(emsg, getsysUSER_CD());
				this.struct.setIDENT_CARD_CTL_NO(_IdentCardCtlNo);
				e.printStackTrace();
				throw new ExpjException(e, emsg);
			}
		}
/*		}catch(Exception e) {
			e.printStackTrace();
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());//致命的エラー エラー内容
			ExpjException ee = new ExpjException(e, emsg); // エクセプションを生成
			throw ee;
		} finally {
			//
		}*/
                //}}user_implement_dev:<controlPrint>
		logger.exiting("AD0060010Control"+":USER="+struct.getsUser_ID(),"controlPrint");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0060");
		logger.entering("AD0060010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AD0060010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0060");
		logger.entering("AD0060010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
			// TODO: ユーザ定義のコードを記述してください
		try{
			// クリア処理
			controlclear();

			// =======================================
			// 自社情報の取得
			// =======================================
			List listCompanyInfo = entity.mread_COMPANY_CD.read(conn,struct);
			if(listCompanyInfo == null || listCompanyInfo.size() != 1){
				//自社情報が無い/複数件
				ExpjMessage emsg = new ExpjMessage("KQ00039");
                msgStruct.addError(emsg);	// エラーメッセージとして登録
                sysLog.severe(emsg, getsysUSER_CD()); //エラー内容
                ExpjException ee = new ExpjException(emsg);
                throw ee;

			}
			listCompanyInfo = null;
			
			// ロット管理
			lotCtrlFlg = LotCtrl.checkLotCtrl(conn);

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
		logger.exiting("AD0060010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * イベントハンドラの前処理です。
	 *
	 * @param buttun ボタン名
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0060");
		logger.entering("AD0060010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");
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
		logger.exiting("AD0060010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("close") ) {
				controlclose();
			} else if( button.equals("Print") ) {
				controlPrint();
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
//			throw new FoundationException("AD0060010Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AD0060010-E999","CSVの出力処理"));
			throw new FoundationException("AD0060010Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AD0060010-E999","システム日付の取得処理"));
				throw new FoundationException("AD0060010Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AD0060010-E999","コントロールのイベント処理"));
			throw new FoundationException("AD0060010Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected AD0060010Entity entity;
	protected AD0060010Struct struct;
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

		entity = new AD0060010Entity();
		struct = new AD0060010Struct();

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
	 * AD0060010クラスの標準コンストラクタ
	 */
	public AD0060010Control() throws BusinessProcessException, FoundationException
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
				AD0060010Struct key = (AD0060010Struct)keyList.get(j);
				// メッセージキーを作成する
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("PRINT_QTY") && key.getPRINT_QTY() != null) {
					msgKey.setKeyValue("PRINT_QTY", key.getPRINT_QTY());
				}
				if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE") && key.getDOWNLOAD_FILE() != null) {
					msgKey.setKeyValue("DOWNLOAD_FILE", key.getDOWNLOAD_FILE());
				}
				if(msgKeyType.containsKeyColumn("ORI_IDENT_CARD_QTY") && key.getORI_IDENT_CARD_QTY() != null) {
					msgKey.setKeyValue("ORI_IDENT_CARD_QTY", key.getORI_IDENT_CARD_QTY());
				}
				if(msgKeyType.containsKeyColumn("TEMP_IDENT_CARD_QTY") && key.getTEMP_IDENT_CARD_QTY() != null) {
					msgKey.setKeyValue("TEMP_IDENT_CARD_QTY", key.getTEMP_IDENT_CARD_QTY());
				}
				if(msgKeyType.containsKeyColumn("T_IDENT_CARD_CTL_NO") && key.getT_IDENT_CARD_CTL_NO() != null) {
					msgKey.setKeyValue("T_IDENT_CARD_CTL_NO", key.getT_IDENT_CARD_CTL_NO());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_CD") && key.getOPR_INST_CD() != null) {
					msgKey.setKeyValue("OPR_INST_CD", key.getOPR_INST_CD());
				}
				if(msgKeyType.containsKeyColumn("PARTIAL_PRD_NO") && key.getPARTIAL_PRD_NO() != null) {
					msgKey.setKeyValue("PARTIAL_PRD_NO", key.getPARTIAL_PRD_NO());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_NAME") && key.getITEM_NAME() != null) {
					msgKey.setKeyValue("ITEM_NAME", key.getITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("WS_CD") && key.getWS_CD() != null) {
					msgKey.setKeyValue("WS_CD", key.getWS_CD());
				}
				if(msgKeyType.containsKeyColumn("WS_NAME") && key.getWS_NAME() != null) {
					msgKey.setKeyValue("WS_NAME", key.getWS_NAME());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_CD") && key.getJOB_ODR_CD() != null) {
					msgKey.setKeyValue("JOB_ODR_CD", key.getJOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("LOT_NO") && key.getLOT_NO() != null) {
					msgKey.setKeyValue("LOT_NO", key.getLOT_NO());
				}
				if(msgKeyType.containsKeyColumn("OPR_DATE") && key.getOPR_DATE() != null) {
					msgKey.setKeyValue("OPR_DATE", key.getOPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("FIRST_IDENT_CARD_QTY") && key.getFIRST_IDENT_CARD_QTY() != null) {
					msgKey.setKeyValue("FIRST_IDENT_CARD_QTY", key.getFIRST_IDENT_CARD_QTY());
				}
				if(msgKeyType.containsKeyColumn("IDENT_CARD_QTY") && key.getIDENT_CARD_QTY() != null) {
					msgKey.setKeyValue("IDENT_CARD_QTY", key.getIDENT_CARD_QTY());
				}
				if(msgKeyType.containsKeyColumn("PKG_UNIT_QTY") && key.getPKG_UNIT_QTY() != null) {
					msgKey.setKeyValue("PKG_UNIT_QTY", key.getPKG_UNIT_QTY());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("DEL_FLG") && key.getDEL_FLG() != null) {
					msgKey.setKeyValue("DEL_FLG", key.getDEL_FLG());
				}
				if(msgKeyType.containsKeyColumn("MODIFY_COUNT") && key.getMODIFY_COUNT() != null) {
					msgKey.setKeyValue("MODIFY_COUNT", key.getMODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("h_UNIT_QTY_TYP") && key.geth_UNIT_QTY_TYP() != null) {
					msgKey.setKeyValue("h_UNIT_QTY_TYP", key.geth_UNIT_QTY_TYP());
				}
				if(msgKeyType.containsKeyColumn("IDENT_CARD_CTL_NO") && key.getIDENT_CARD_CTL_NO() != null) {
					msgKey.setKeyValue("IDENT_CARD_CTL_NO", key.getIDENT_CARD_CTL_NO());
				}
				if(msgKeyType.containsKeyColumn("SYS_COMPANY_CD") && key.getSYS_COMPANY_CD() != null) {
					msgKey.setKeyValue("SYS_COMPANY_CD", key.getSYS_COMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("UPD_IDENT_CARD_QTY") && key.getUPD_IDENT_CARD_QTY() != null) {
					msgKey.setKeyValue("UPD_IDENT_CARD_QTY", key.getUPD_IDENT_CARD_QTY());
				}
				if(msgKeyType.containsKeyColumn("UPD_PRINT_QTY") && key.getUPD_PRINT_QTY() != null) {
					msgKey.setKeyValue("UPD_PRINT_QTY", key.getUPD_PRINT_QTY());
				}
				if(msgKeyType.containsKeyColumn("UPD_UPDATED_BY") && key.getUPD_UPDATED_BY() != null) {
					msgKey.setKeyValue("UPD_UPDATED_BY", key.getUPD_UPDATED_BY());
				}
				if(msgKeyType.containsKeyColumn("UPD_UPDATED_PRG_NM") && key.getUPD_UPDATED_PRG_NM() != null) {
					msgKey.setKeyValue("UPD_UPDATED_PRG_NM", key.getUPD_UPDATED_PRG_NM());
				}
				if(msgKeyType.containsKeyColumn("UPD_IDENT_CARD_CTL_NO") && key.getUPD_IDENT_CARD_CTL_NO() != null) {
					msgKey.setKeyValue("UPD_IDENT_CARD_CTL_NO", key.getUPD_IDENT_CARD_CTL_NO());
				}
				if(msgKeyType.containsKeyColumn("UPD_MODIFY_COUNT") && key.getUPD_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("UPD_MODIFY_COUNT", key.getUPD_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("TMP_IDENT_CARD_CTL_NO") && key.getTMP_IDENT_CARD_CTL_NO() != null) {
					msgKey.setKeyValue("TMP_IDENT_CARD_CTL_NO", key.getTMP_IDENT_CARD_CTL_NO());
				}
				if(msgKeyType.containsKeyColumn("TMP_OPR_INST_CD") && key.getTMP_OPR_INST_CD() != null) {
					msgKey.setKeyValue("TMP_OPR_INST_CD", key.getTMP_OPR_INST_CD());
				}
				if(msgKeyType.containsKeyColumn("TMP_PARTIAL_PRD_NO") && key.getTMP_PARTIAL_PRD_NO() != null) {
					msgKey.setKeyValue("TMP_PARTIAL_PRD_NO", key.getTMP_PARTIAL_PRD_NO());
				}
				if(msgKeyType.containsKeyColumn("TMP_RCV_ISSUE_CTRL_CD") && key.getTMP_RCV_ISSUE_CTRL_CD() != null) {
					msgKey.setKeyValue("TMP_RCV_ISSUE_CTRL_CD", key.getTMP_RCV_ISSUE_CTRL_CD());
				}
				if(msgKeyType.containsKeyColumn("TMP_ITEM_CD") && key.getTMP_ITEM_CD() != null) {
					msgKey.setKeyValue("TMP_ITEM_CD", key.getTMP_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("TMP_JOB_ODR_CD") && key.getTMP_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("TMP_JOB_ODR_CD", key.getTMP_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("TMP_FIRST_IDENT_CARD_QTY") && key.getTMP_FIRST_IDENT_CARD_QTY() != null) {
					msgKey.setKeyValue("TMP_FIRST_IDENT_CARD_QTY", key.getTMP_FIRST_IDENT_CARD_QTY());
				}
				if(msgKeyType.containsKeyColumn("TMP_IDENT_CARD_QTY") && key.getTMP_IDENT_CARD_QTY() != null) {
					msgKey.setKeyValue("TMP_IDENT_CARD_QTY", key.getTMP_IDENT_CARD_QTY());
				}
				if(msgKeyType.containsKeyColumn("TMP_OPR_DATE") && key.getTMP_OPR_DATE() != null) {
					msgKey.setKeyValue("TMP_OPR_DATE", key.getTMP_OPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("TMP_PKG_UNIT_QTY") && key.getTMP_PKG_UNIT_QTY() != null) {
					msgKey.setKeyValue("TMP_PKG_UNIT_QTY", key.getTMP_PKG_UNIT_QTY());
				}
				if(msgKeyType.containsKeyColumn("TMP_PLANT_CD") && key.getTMP_PLANT_CD() != null) {
					msgKey.setKeyValue("TMP_PLANT_CD", key.getTMP_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("TMP_WS_CD") && key.getTMP_WS_CD() != null) {
					msgKey.setKeyValue("TMP_WS_CD", key.getTMP_WS_CD());
				}
				if(msgKeyType.containsKeyColumn("INS_PRINT_GRP_NO") && key.getINS_PRINT_GRP_NO() != null) {
					msgKey.setKeyValue("INS_PRINT_GRP_NO", key.getINS_PRINT_GRP_NO());
				}
				if(msgKeyType.containsKeyColumn("INS_PAGE_NO") && key.getINS_PAGE_NO() != null) {
					msgKey.setKeyValue("INS_PAGE_NO", key.getINS_PAGE_NO());
				}
				if(msgKeyType.containsKeyColumn("INS_IDENT_CARD_CTL_NO") && key.getINS_IDENT_CARD_CTL_NO() != null) {
					msgKey.setKeyValue("INS_IDENT_CARD_CTL_NO", key.getINS_IDENT_CARD_CTL_NO());
				}
				if(msgKeyType.containsKeyColumn("INS_OPR_INST_CD") && key.getINS_OPR_INST_CD() != null) {
					msgKey.setKeyValue("INS_OPR_INST_CD", key.getINS_OPR_INST_CD());
				}
				if(msgKeyType.containsKeyColumn("INS_PARTIAL_PRD_NO") && key.getINS_PARTIAL_PRD_NO() != null) {
					msgKey.setKeyValue("INS_PARTIAL_PRD_NO", key.getINS_PARTIAL_PRD_NO());
				}
				if(msgKeyType.containsKeyColumn("INS_RCV_ISSUE_CTRL_CD") && key.getINS_RCV_ISSUE_CTRL_CD() != null) {
					msgKey.setKeyValue("INS_RCV_ISSUE_CTRL_CD", key.getINS_RCV_ISSUE_CTRL_CD());
				}
				if(msgKeyType.containsKeyColumn("INS_ITEM_CD") && key.getINS_ITEM_CD() != null) {
					msgKey.setKeyValue("INS_ITEM_CD", key.getINS_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("INS_JOB_ODR_CD") && key.getINS_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("INS_JOB_ODR_CD", key.getINS_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("INS_FIRST_IDENT_CARD_QTY") && key.getINS_FIRST_IDENT_CARD_QTY() != null) {
					msgKey.setKeyValue("INS_FIRST_IDENT_CARD_QTY", key.getINS_FIRST_IDENT_CARD_QTY());
				}
				if(msgKeyType.containsKeyColumn("INS_IDENT_CARD_QTY") && key.getINS_IDENT_CARD_QTY() != null) {
					msgKey.setKeyValue("INS_IDENT_CARD_QTY", key.getINS_IDENT_CARD_QTY());
				}
				if(msgKeyType.containsKeyColumn("INS_OPR_DATE") && key.getINS_OPR_DATE() != null) {
					msgKey.setKeyValue("INS_OPR_DATE", key.getINS_OPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("INS_PKG_UNIT_QTY") && key.getINS_PKG_UNIT_QTY() != null) {
					msgKey.setKeyValue("INS_PKG_UNIT_QTY", key.getINS_PKG_UNIT_QTY());
				}
				if(msgKeyType.containsKeyColumn("INS_PLANT_CD") && key.getINS_PLANT_CD() != null) {
					msgKey.setKeyValue("INS_PLANT_CD", key.getINS_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("INS_WS_CD") && key.getINS_WS_CD() != null) {
					msgKey.setKeyValue("INS_WS_CD", key.getINS_WS_CD());
				}
				if(msgKeyType.containsKeyColumn("INS_CREATED_BY") && key.getINS_CREATED_BY() != null) {
					msgKey.setKeyValue("INS_CREATED_BY", key.getINS_CREATED_BY());
				}
				if(msgKeyType.containsKeyColumn("INS_CREATED_PRG_NM") && key.getINS_CREATED_PRG_NM() != null) {
					msgKey.setKeyValue("INS_CREATED_PRG_NM", key.getINS_CREATED_PRG_NM());
				}
				if(msgKeyType.containsKeyColumn("INS_UPDATED_BY") && key.getINS_UPDATED_BY() != null) {
					msgKey.setKeyValue("INS_UPDATED_BY", key.getINS_UPDATED_BY());
				}
				if(msgKeyType.containsKeyColumn("INS_UPDATED_PRG_NM") && key.getINS_UPDATED_PRG_NM() != null) {
					msgKey.setKeyValue("INS_UPDATED_PRG_NM", key.getINS_UPDATED_PRG_NM());
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
					AD0060010Struct key = new AD0060010Struct();
					if(msgKeyType.containsKeyColumn("PRINT_QTY")) {
						key.setPRINT_QTY(msgKey.getKeyValue("PRINT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE")) {
						key.setDOWNLOAD_FILE(msgKey.getKeyValue("DOWNLOAD_FILE"));
					}
					if(msgKeyType.containsKeyColumn("ORI_IDENT_CARD_QTY")) {
						key.setORI_IDENT_CARD_QTY(msgKey.getKeyValue("ORI_IDENT_CARD_QTY"));
					}
					if(msgKeyType.containsKeyColumn("TEMP_IDENT_CARD_QTY")) {
						key.setTEMP_IDENT_CARD_QTY(msgKey.getKeyValue("TEMP_IDENT_CARD_QTY"));
					}
					if(msgKeyType.containsKeyColumn("T_IDENT_CARD_CTL_NO")) {
						key.setT_IDENT_CARD_CTL_NO(msgKey.getKeyValue("T_IDENT_CARD_CTL_NO"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_CD")) {
						key.setOPR_INST_CD(msgKey.getKeyValue("OPR_INST_CD"));
					}
					if(msgKeyType.containsKeyColumn("PARTIAL_PRD_NO")) {
						key.setPARTIAL_PRD_NO(msgKey.getKeyValue("PARTIAL_PRD_NO"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_NAME")) {
						key.setITEM_NAME(msgKey.getKeyValue("ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("WS_CD")) {
						key.setWS_CD(msgKey.getKeyValue("WS_CD"));
					}
					if(msgKeyType.containsKeyColumn("WS_NAME")) {
						key.setWS_NAME(msgKey.getKeyValue("WS_NAME"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_CD")) {
						key.setJOB_ODR_CD(msgKey.getKeyValue("JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("LOT_NO")) {
						key.setLOT_NO(msgKey.getKeyValue("LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("OPR_DATE")) {
						key.setOPR_DATE(msgKey.getKeyValue("OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("FIRST_IDENT_CARD_QTY")) {
						key.setFIRST_IDENT_CARD_QTY(msgKey.getKeyValue("FIRST_IDENT_CARD_QTY"));
					}
					if(msgKeyType.containsKeyColumn("IDENT_CARD_QTY")) {
						key.setIDENT_CARD_QTY(msgKey.getKeyValue("IDENT_CARD_QTY"));
					}
					if(msgKeyType.containsKeyColumn("PKG_UNIT_QTY")) {
						key.setPKG_UNIT_QTY(msgKey.getKeyValue("PKG_UNIT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("DEL_FLG")) {
						key.setDEL_FLG(msgKey.getKeyValue("DEL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("MODIFY_COUNT")) {
						key.setMODIFY_COUNT(msgKey.getKeyValue("MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("h_UNIT_QTY_TYP")) {
						key.seth_UNIT_QTY_TYP(msgKey.getKeyValue("h_UNIT_QTY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("IDENT_CARD_CTL_NO")) {
						key.setIDENT_CARD_CTL_NO(msgKey.getKeyValue("IDENT_CARD_CTL_NO"));
					}
					if(msgKeyType.containsKeyColumn("SYS_COMPANY_CD")) {
						key.setSYS_COMPANY_CD(msgKey.getKeyValue("SYS_COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("UPD_IDENT_CARD_QTY")) {
						key.setUPD_IDENT_CARD_QTY(msgKey.getKeyValue("UPD_IDENT_CARD_QTY"));
					}
					if(msgKeyType.containsKeyColumn("UPD_PRINT_QTY")) {
						key.setUPD_PRINT_QTY(msgKey.getKeyValue("UPD_PRINT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("UPD_UPDATED_BY")) {
						key.setUPD_UPDATED_BY(msgKey.getKeyValue("UPD_UPDATED_BY"));
					}
					if(msgKeyType.containsKeyColumn("UPD_UPDATED_PRG_NM")) {
						key.setUPD_UPDATED_PRG_NM(msgKey.getKeyValue("UPD_UPDATED_PRG_NM"));
					}
					if(msgKeyType.containsKeyColumn("UPD_IDENT_CARD_CTL_NO")) {
						key.setUPD_IDENT_CARD_CTL_NO(msgKey.getKeyValue("UPD_IDENT_CARD_CTL_NO"));
					}
					if(msgKeyType.containsKeyColumn("UPD_MODIFY_COUNT")) {
						key.setUPD_MODIFY_COUNT(msgKey.getKeyValue("UPD_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("TMP_IDENT_CARD_CTL_NO")) {
						key.setTMP_IDENT_CARD_CTL_NO(msgKey.getKeyValue("TMP_IDENT_CARD_CTL_NO"));
					}
					if(msgKeyType.containsKeyColumn("TMP_OPR_INST_CD")) {
						key.setTMP_OPR_INST_CD(msgKey.getKeyValue("TMP_OPR_INST_CD"));
					}
					if(msgKeyType.containsKeyColumn("TMP_PARTIAL_PRD_NO")) {
						key.setTMP_PARTIAL_PRD_NO(msgKey.getKeyValue("TMP_PARTIAL_PRD_NO"));
					}
					if(msgKeyType.containsKeyColumn("TMP_RCV_ISSUE_CTRL_CD")) {
						key.setTMP_RCV_ISSUE_CTRL_CD(msgKey.getKeyValue("TMP_RCV_ISSUE_CTRL_CD"));
					}
					if(msgKeyType.containsKeyColumn("TMP_ITEM_CD")) {
						key.setTMP_ITEM_CD(msgKey.getKeyValue("TMP_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("TMP_JOB_ODR_CD")) {
						key.setTMP_JOB_ODR_CD(msgKey.getKeyValue("TMP_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("TMP_FIRST_IDENT_CARD_QTY")) {
						key.setTMP_FIRST_IDENT_CARD_QTY(msgKey.getKeyValue("TMP_FIRST_IDENT_CARD_QTY"));
					}
					if(msgKeyType.containsKeyColumn("TMP_IDENT_CARD_QTY")) {
						key.setTMP_IDENT_CARD_QTY(msgKey.getKeyValue("TMP_IDENT_CARD_QTY"));
					}
					if(msgKeyType.containsKeyColumn("TMP_OPR_DATE")) {
						key.setTMP_OPR_DATE(msgKey.getKeyValue("TMP_OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("TMP_PKG_UNIT_QTY")) {
						key.setTMP_PKG_UNIT_QTY(msgKey.getKeyValue("TMP_PKG_UNIT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("TMP_PLANT_CD")) {
						key.setTMP_PLANT_CD(msgKey.getKeyValue("TMP_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("TMP_WS_CD")) {
						key.setTMP_WS_CD(msgKey.getKeyValue("TMP_WS_CD"));
					}
					if(msgKeyType.containsKeyColumn("INS_PRINT_GRP_NO")) {
						key.setINS_PRINT_GRP_NO(msgKey.getKeyValue("INS_PRINT_GRP_NO"));
					}
					if(msgKeyType.containsKeyColumn("INS_PAGE_NO")) {
						key.setINS_PAGE_NO(msgKey.getKeyValue("INS_PAGE_NO"));
					}
					if(msgKeyType.containsKeyColumn("INS_IDENT_CARD_CTL_NO")) {
						key.setINS_IDENT_CARD_CTL_NO(msgKey.getKeyValue("INS_IDENT_CARD_CTL_NO"));
					}
					if(msgKeyType.containsKeyColumn("INS_OPR_INST_CD")) {
						key.setINS_OPR_INST_CD(msgKey.getKeyValue("INS_OPR_INST_CD"));
					}
					if(msgKeyType.containsKeyColumn("INS_PARTIAL_PRD_NO")) {
						key.setINS_PARTIAL_PRD_NO(msgKey.getKeyValue("INS_PARTIAL_PRD_NO"));
					}
					if(msgKeyType.containsKeyColumn("INS_RCV_ISSUE_CTRL_CD")) {
						key.setINS_RCV_ISSUE_CTRL_CD(msgKey.getKeyValue("INS_RCV_ISSUE_CTRL_CD"));
					}
					if(msgKeyType.containsKeyColumn("INS_ITEM_CD")) {
						key.setINS_ITEM_CD(msgKey.getKeyValue("INS_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("INS_JOB_ODR_CD")) {
						key.setINS_JOB_ODR_CD(msgKey.getKeyValue("INS_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("INS_FIRST_IDENT_CARD_QTY")) {
						key.setINS_FIRST_IDENT_CARD_QTY(msgKey.getKeyValue("INS_FIRST_IDENT_CARD_QTY"));
					}
					if(msgKeyType.containsKeyColumn("INS_IDENT_CARD_QTY")) {
						key.setINS_IDENT_CARD_QTY(msgKey.getKeyValue("INS_IDENT_CARD_QTY"));
					}
					if(msgKeyType.containsKeyColumn("INS_OPR_DATE")) {
						key.setINS_OPR_DATE(msgKey.getKeyValue("INS_OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("INS_PKG_UNIT_QTY")) {
						key.setINS_PKG_UNIT_QTY(msgKey.getKeyValue("INS_PKG_UNIT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("INS_PLANT_CD")) {
						key.setINS_PLANT_CD(msgKey.getKeyValue("INS_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("INS_WS_CD")) {
						key.setINS_WS_CD(msgKey.getKeyValue("INS_WS_CD"));
					}
					if(msgKeyType.containsKeyColumn("INS_CREATED_BY")) {
						key.setINS_CREATED_BY(msgKey.getKeyValue("INS_CREATED_BY"));
					}
					if(msgKeyType.containsKeyColumn("INS_CREATED_PRG_NM")) {
						key.setINS_CREATED_PRG_NM(msgKey.getKeyValue("INS_CREATED_PRG_NM"));
					}
					if(msgKeyType.containsKeyColumn("INS_UPDATED_BY")) {
						key.setINS_UPDATED_BY(msgKey.getKeyValue("INS_UPDATED_BY"));
					}
					if(msgKeyType.containsKeyColumn("INS_UPDATED_PRG_NM")) {
						key.setINS_UPDATED_PRG_NM(msgKey.getKeyValue("INS_UPDATED_PRG_NM"));
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
