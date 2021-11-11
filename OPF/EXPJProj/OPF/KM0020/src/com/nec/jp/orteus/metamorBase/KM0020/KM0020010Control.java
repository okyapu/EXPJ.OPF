/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KM0020/src/com/nec/jp/orteus/metamorBase/KM0020/KM0020010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.KM0020;

import com.nec.jp.orteus.metamorBase.KM0020.*;
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
import com.nec.jp.orteus.metamorBase.common06.ExchAmount.ExchAmount;
//}}user_implement_code_import

//{{user_implement_code_header
/**
 * CLASS     : KM0020010Control クラス
 * ファイル・クラス説明
 * @author $Author: xl-hs-zzw $
 * @version $Revision: 1.4 $ $Date: 2014/11/05 07:29:13 $
 *
 */
//}}user_implement_code_header

public class KM0020010Control
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
	public KM0020010Struct getListvalue(int x) { return (KM0020010Struct)(this.list.get(x)); }	// リストの値を返します。
	public KM0020010Struct getStruct() { return this.struct; }	// Structの値を返します。
	public KM0020010Struct createStruct() { return new KM0020010Struct(); }	// 新しいStructを作って返します。
	public void setStruct(Object structname) { this.struct.setStruct((KM0020010Struct)structname); }	// Structをセットします。
	public void initializeStruct() { this.struct.initialize(); }	// Structの値を初期化します。

	// CSV出力用リスト
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }
	// TODO: ユーザ定義のコードを記述してください
	//------------------------------------------------------------------------------
	public String Message = "";
	public int DelCnt = 0;
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
    /**
     * エラーメッセージ設定
     * @param メッセージ番号
     * @param 出力メッセージ
     */
    private void setErrorMessage(String messageno, String message)
    {
     ExpjMessage emsg = new ExpjMessage( messageno ,message);
     msgStruct.addError( emsg );
     sysLog.warning(emsg, getsysUSER_CD());
     emsg = new ExpjMessage( "ZZ01006", message );
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
     ExpjMessage emsg = new ExpjMessage( messageno ,message);
     msgStruct.addWarn( emsg );
     sysLog.info(emsg, getsysUSER_CD());
    }
    // コンボボックスの説明取得（多言語）
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
 			ExpjException ee = new ExpjException(e, emsg);
 			ee.setLocale(CoreTools.getLocale(sysUSER_CD));
 			throw ee;
 		}
 	}
 	//------------------------------------------------------------------------------
    /** 子⇒親に画面遷移した場合のキー情報保持の為のStruct */
    private KM0020010Struct _keyStruct = new KM0020010Struct();
   
    /** キー情報Structの取得 */
    public KM0020010Struct getKeyStruct(){ return _keyStruct; }
   
    /** キー情報Structの設定 */
    public void setKeyStruct(KM0020010Struct struct){ _keyStruct.keycopy(struct); }
    
    /** 画面遷移キー(案件番号) */
	private String _ProjectCd;
	/** 画面遷移キー(見積番号) */
	private String _EstimateNo;
	/**
	 * 画面遷移キー(案件番号)取得
	 * @return案件番号
	 */
	public String getProjectCd() {
		return _ProjectCd;
	}
	/**
	 * 画面遷移キー(見積番号)取得
	 * @return案件番号
	 */
	public String getEstimateNo() {
		return _EstimateNo;
	}
	/**
	 * 画面遷移キー(案件番号)設定
	 * @param cd 案件番号
	 */
	public void settProjectCd(String no) {
		_ProjectCd = no;
	}
	/**
	 * 画面遷移キー(見積番号)設定
	 * @param cd 見積番号
	 */
	public void setEstimateNo(String no) {
		_EstimateNo = no;
	}
    /**
     * ＰＤＦ出力用リスト
     */
    private List pdfList;
    
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
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * 読込ボタン押下時に実行される処理です。
	 *
	 */
	public void controlSelect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0020");
		logger.entering("KM0020010Control"+":USER="+struct.getsUser_ID(),"controlSelect");
			//{{user_implement_dev:<controlSelect>
			// TODO: ユーザ定義のコードを記述してください
		try {
			// リストクリア
			if(list != null){
				list.clear();
			}
			DelCnt = 0;
			setReadStatus(INITIAL);
			struct.setPROJECT_NAME(""); //[案件].“案件名”
			struct.seth_MAX_DETAL_NO("0"); //明細番号最大値(非表示)
			//案件存在チェック
			List listProject = entity.mSelectT_PROJECT.read(conn, struct);
			if (listProject == null || listProject.size() != 1) {
				// 読込処理失敗：案件が存在しません。
				Message = "T_PROJECT.PROJECT_CD:" + struct.getPROJECT_CD();
				setErrorMessage("KM00001", Message);
				setReadStatus(ERROR);
				return;
			}else{
				struct.setPROJECT_NAME(((KM0020010Struct)listProject.get(0)).getPROJECT_NAME()); //[案件].“案件名”
				struct.seth_CUST_CD(((KM0020010Struct)listProject.get(0)).geth_CUST_CD()); //[得意先].“得意先”
				struct.setMODIFY_COUNT_PJ(((KM0020010Struct)listProject.get(0)).getMODIFY_COUNT_PJ()); //[案件].“更新数”
			}
			//得意先存在チェック
			List listMCust = entity.mSelectM_CUST.read(conn, struct);
			if (listMCust == null || listMCust.size() != 1) {
				// 読込処理失敗：得意先コードが存在しない。
				Message = "M_CUST.CUST_CD:" + struct.geth_CUST_CD();
				setErrorMessage("KQ00014", Message);
				setReadStatus(ERROR);
				return;
			}else{
				struct.seth_CUR_CD(((KM0020010Struct)listMCust.get(0)).geth_CUR_CD()); //[通貨].“通貨コード”
			}
			//通貨コードチェック
			List listMCur = entity.mSelectM_CUR.read(conn, struct);
			if (listMCur == null || listMCur.size() != 1) {
				// 読込処理失敗：通貨コードが存在しない。
				Message = "M_CUR.CUR_CD:" + struct.geth_CUR_CD();
				setErrorMessage("KQ00073", Message);
				setReadStatus(ERROR);
				return;
			}
			struct.setPROJECT_STAT(((KM0020010Struct)listProject.get(0)).getPROJECT_STAT()); //[案件].“案件ステータス”
			struct.setCUST_NAME(((KM0020010Struct)listMCust.get(0)).getCUST_NAME()); //[得意先].“得意先名”
			struct.setCUR_UNIT(((KM0020010Struct)listMCur.get(0)).getCUR_UNIT()); //[通貨].“通貨単位”
			//案件ステータスが引合の場合
			if ("1".equals(struct.getPROJECT_STAT())){
				struct.setESTIMATE_STAT(this.multcombo("ESTIMATE_STAT","0")); //“見積ステータス”
				struct.setESTIMATE_DATE(struct.getBUSINESS_DATE()); //“見積日”
				struct.setES_USER_CD(((KM0020010Struct)listProject.get(0)).getES_USER_CD()); //[案件].“案件担当者コード”
				struct.setES_ORG_CD(((KM0020010Struct)listProject.get(0)).getES_ORG_CD()); //[案件].“案件担当部門コード”
				struct.setUSER_NAME(((KM0020010Struct)listProject.get(0)).getUSER_NAME()); //[案件].“案件担当者コード”より、[ユーザマスタ].“ユーザ名”
				struct.setORG_NAME(((KM0020010Struct)listProject.get(0)).getORG_NAME()); //[案件].“案件担当部門コード”より[部門].“部門名”
				struct.setESTIMATE_NO("0"); //[見積].“見積番号”
				//＜情報＞KM00010 【見積が存在しません。】
				Message = "T_PROJECT.PROJECT_CD:" + struct.getPROJECT_CD();
				setWarnMessage("KM00010", Message);
			}else{
				struct.seth_PROJECT_CD(struct.getPROJECT_CD());
				//案件ステータスが引合以外の場合
				//見積番号が0の場合、最大見積番号を取得
				if ("0".equals(struct.getESTIMATE_NO())){
					List listEstimate = entity.mSelectT_ESTIMATE.read(conn, struct);
					if (listEstimate.size() > 0) {
						struct.seth_ESTIMATE_NO(((KM0020010Struct)listEstimate.get(0)).geth_ESTIMATE_NO()); //[見積].“見積番号”
						struct.setESTIMATE_NO(struct.geth_ESTIMATE_NO()); //[見積].“見積番号”
					}
				}else{
					struct.seth_ESTIMATE_NO(struct.getESTIMATE_NO()); //[見積].“見積番号”
				}
				//見積ヘッダの取得
				List listHead = entity.mSelectHEAD.read(conn, struct);
				if (listHead.size() > 0) {
					struct.setESTIMATE_ST(((KM0020010Struct)listHead.get(0)).getESTIMATE_STAT());
					struct.setESTIMATE_STAT(this.multcombo("ESTIMATE_STAT",((KM0020010Struct)listHead.get(0)).getESTIMATE_STAT())); //[見積].“見積ステータス”
					struct.setESTIMATE_DATE(((KM0020010Struct)listHead.get(0)).getESTIMATE_DATE()); //[見積].“見積日”
					//[見積].“内示受領”
					if ("1".equals(((KM0020010Struct)listHead.get(0)).getUNOFFICIAL_RECEIPT_FLG())){
						//チェックOn
						struct.setUNOFFICIAL_RECEIPT_FLG("true");
					}else{
						struct.setUNOFFICIAL_RECEIPT_FLG("false");
					}
					struct.seth_UNOFFICIAL_RECEIPT_FLAG(((KM0020010Struct)listHead.get(0)).getUNOFFICIAL_RECEIPT_FLG());
					struct.setESTIMATE_AMOUNT(((KM0020010Struct)listHead.get(0)).getESTIMATE_AMOUNT()); //[見積].“見積金額合計”
					struct.setESTIMATE_AMOUNT_JPN(((KM0020010Struct)listHead.get(0)).getESTIMATE_AMOUNT_JPN()); //[見積].“見積金額合計（邦貨）”
					struct.setES_COMMET1(((KM0020010Struct)listHead.get(0)).getES_COMMET1()); //[見積].“指定納期”
					struct.setES_COMMET2(((KM0020010Struct)listHead.get(0)).getES_COMMET2()); //[見積].“納品場所”
					struct.setES_COMMET4(((KM0020010Struct)listHead.get(0)).getES_COMMET4()); //[見積].“お支払条件”
					struct.setES_COMMET3(((KM0020010Struct)listHead.get(0)).getES_COMMET3()); //[見積].“荷造運送費”
					struct.setES_COMMET5(((KM0020010Struct)listHead.get(0)).getES_COMMET5()); //[見積].“見積有効期限”
					struct.setES_USER_CD(((KM0020010Struct)listHead.get(0)).getES_USER_CD()); //[見積].“見積担当者コード”
					struct.setUSER_NAME(((KM0020010Struct)listHead.get(0)).getUSER_NAME()); //[見積].“見積担当者名”
					struct.setES_ORG_CD(((KM0020010Struct)listHead.get(0)).getES_ORG_CD()); //[見積].“見積担当部門コード”
					struct.setORG_NAME(((KM0020010Struct)listHead.get(0)).getORG_NAME()); //[見積].“部門名”
					struct.setZIP_CD(((KM0020010Struct)listHead.get(0)).getZIP_CD()); //[見積].“郵便番号”
					struct.setADDRESS_1(((KM0020010Struct)listHead.get(0)).getADDRESS_1()); //[見積].“住所1”
					struct.setADDRESS_2(((KM0020010Struct)listHead.get(0)).getADDRESS_2()); //[見積].“住所2”
					struct.setTEL(((KM0020010Struct)listHead.get(0)).getTEL()); //[見積].“電話番号”
					struct.setESREMARK1(((KM0020010Struct)listHead.get(0)).getESREMARK1()); //[見積].“備考1”
					struct.setESREMARK2(((KM0020010Struct)listHead.get(0)).getESREMARK2()); //[見積].“備考2”
					struct.setESREMARK3(((KM0020010Struct)listHead.get(0)).getESREMARK3()); //[見積].“備考3”
					struct.setMODIFY_COUNT_ES(((KM0020010Struct)listHead.get(0)).getMODIFY_COUNT_ES()); //[見積].“更新数”
				}else{
					Message = "T_PROJECT.PROJECT_CD:" + struct.getPROJECT_CD();
					setErrorMessage("KM00010", Message);
					return;
				}
				 // 表示最大行数制限処理
				if(struct.getROW_COUNT() != null){
					list = entity.mSelectDETAIL_COUNT.read(conn, struct);
				    int maxLine = Integer.parseInt(struct.getROW_COUNT());
					long rowCount = Long.parseLong(((KM0020010Struct)list.get(0)).getl_COUNT());
					if (rowCount == maxLine + 1) {
		 				this.list.clear();
		 				ExpjMessage emsg = new ExpjMessage("ZZ01119", "" + maxLine);
						msgStruct.addError(emsg); // エラーメッセージとして登録
						sysLog.warning(emsg, getsysUSER_CD()); // エラー内容
		 				setReadStatus(TOO_MANY);
		 				if (list != null && list.size() > 0) {
		 					list.clear();
		 				}
		 				return;
		 			}
				}
				//明細番号最大値を取得
				List listMax = entity.mSelectMAX_DETAIL_NO.read(conn, struct);
				if (listMax.size() > 0) {
					struct.seth_MAX_DETAL_NO(((KM0020010Struct)listMax.get(0)).geth_MAX_DETAL_NO()); //明細番号最大値(非表示)
				}
				//見積明細の取得
				list = entity.mSelectDETAIL.read(conn, struct);
				if (listHead.size() > 0) {
					KM0020010Struct TempStruct;
					for (int i = 0; i < this.list.size(); i++) {
						TempStruct = (KM0020010Struct)list.get(i);
						TempStruct.setl_CUR_UNIT(struct.getCUR_UNIT()); //[通貨].“通貨単位”
						TempStruct.setl_ESTIMATE_NAME(this.multcombo("ESTIMATE_TYPE",TempStruct.getl_ESTIMATE_TYP())); //[見積明細].“手配品目種”
						TempStruct.setl_SPEC_CLASS1_NAME(this.multcombo("SPEC_CLASS_01",TempStruct.getl_SPEC_CLASS1_TYP())); //[見積明細].“製品選択1”
						TempStruct.setl_SPEC_CLASS2_NAME(this.multcombo("SPEC_CLASS_02",TempStruct.getl_SPEC_CLASS2_TYP())); //[見積明細].“製品選択2”
						TempStruct.setl_SPEC_SELECT1_NAME(this.multcombo("SPEC_SELECT_01",TempStruct.getl_SPEC_SELECT1_TYP())); //[見積明細].“仕様選択1”
						TempStruct.setl_SPEC_SELECT2_NAME(this.multcombo("SPEC_SELECT_02",TempStruct.getl_SPEC_SELECT2_TYP())); //[見積明細].“仕様選択2”
						TempStruct.setl_SPEC_SELECT3_NAME(this.multcombo("SPEC_SELECT_03",TempStruct.getl_SPEC_SELECT3_TYP())); //[見積明細].“仕様選択3”
						TempStruct.setl_SPEC_SELECT4_NAME(this.multcombo("SPEC_SELECT_04",TempStruct.getl_SPEC_SELECT4_TYP())); //[見積明細].“仕様選択4”
						TempStruct.setl_FLAG("0"); //登録更新フラグ(非表示)
					}
				}
			}
			if (list != null){
				struct.setLIST_CNT(Integer.toString(list.size()));
			}else{
				struct.setLIST_CNT("0");
			}
			setReadStatus(NORMAL);
		} catch(SQLException e) {
			e.printStackTrace();
			// エラー処理を記述してください。
			setReadStatus(ERROR);
			setSqlExceptionMsg(e);
		}
                //}}user_implement_dev:<controlSelect>
		logger.exiting("KM0020010Control"+":USER="+struct.getsUser_ID(),"controlSelect");

		return;
	}

	/**
	 * 明細合計ボタン押下時に実行される処理です。
	 *
	 */
	public void controlTotal() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0020");
		logger.entering("KM0020010Control"+":USER="+struct.getsUser_ID(),"controlTotal");
			//{{user_implement_dev:<controlTotal>
			// TODO: ユーザ定義のコードを記述してください
		KM0020010Struct TempStruct;
		String SumEstimateAmount = "0.00";
		String SumEstimateAmountJpn = "0.00";
		if(list == null || list.size() == 0){
		}else{
			for (int i = 0; i < this.list.size(); i++) {
				TempStruct = (KM0020010Struct)list.get(i);
				//見積金額合計に[画面]の明細一覧.“見積金額”を合計して設定
				SumEstimateAmount = Calculate.add(SumEstimateAmount, TempStruct.getl_ESTIMATE_AMOUNT()); //明細一覧.“見積金額”	
				//見積金額（邦貨）合計に[画面]の明細一覧.“見積金額（邦貨）”を合計して設定
				SumEstimateAmountJpn = Calculate.add(SumEstimateAmountJpn, TempStruct.getl_ESTIMATE_AMOUNT_JPN()); //明細一覧.“見積金額（邦貨）”	
			}
			if(Calculate.compare(SumEstimateAmount,"99999999999999.00") == 1){
				struct.setESTIMATE_AMOUNT("99999999999999.00");
			}else{
				struct.setESTIMATE_AMOUNT(SumEstimateAmount);
			}
			if(Calculate.compare(SumEstimateAmountJpn,"99999999999999.00") == 1){
				struct.setESTIMATE_AMOUNT_JPN("99999999999999.00");
			}else{
				struct.setESTIMATE_AMOUNT_JPN(SumEstimateAmountJpn);
			}
		}
                //}}user_implement_dev:<controlTotal>
		logger.exiting("KM0020010Control"+":USER="+struct.getsUser_ID(),"controlTotal");

		return;
	}

	/**
	 * 行追加ボタン押下時に実行される処理です。
	 *
	 */
	public void controlappend() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0020");
		logger.entering("KM0020010Control"+":USER="+struct.getsUser_ID(),"controlappend");
			//{{user_implement_dev:<controlappend>
			// TODO: ユーザ定義のコードを記述してください
		try {
			int listCnt = 0;
			 // 表示最大行数制限処理
			if(struct.getROW_COUNT() != null){
				int maxLine = Integer.parseInt(struct.getROW_COUNT());
				if (list != null){
					listCnt = list.size();
				}
				if (listCnt + 1 > maxLine) {
					ExpjMessage emsg = new ExpjMessage("ZZ01119", "" + maxLine);
					msgStruct.addError(emsg); // エラーメッセージとして登録
					sysLog.warning(emsg, getsysUSER_CD()); // エラー内容
	 				return;
	 			}
			}
			//明細番号 = メイン[画面].“明細番号最大値(非表示)”+1
			struct.setl_DETAL_NO(Calculate.add(struct.geth_MAX_DETAL_NO(), "1"));
			//通貨単位 = メイン[画面].“通貨単位” 
			struct.setl_CUR_UNIT(struct.getCUR_UNIT());
			// キーを保持
			_keyStruct.keycopy(struct);
			struct.seth_CALLBUTTON("1");
		} catch(Exception e) {
			e.printStackTrace();
			// エラー処理を記述してください。
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());//致命的エラー エラー内容
			ExpjException ee = new ExpjException(e, emsg); // エクセプションを生成
			throw ee;
		}
                //}}user_implement_dev:<controlappend>
		logger.exiting("KM0020010Control"+":USER="+struct.getsUser_ID(),"controlappend");

		return;
	}

	/**
	 * 行修正ボタン押下時に実行される処理です。
	 *
	 */
	public void controlmodify() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0020");
		logger.entering("KM0020010Control"+":USER="+struct.getsUser_ID(),"controlmodify");
			//{{user_implement_dev:<controlmodify>
			// TODO: ユーザ定義のコードを記述してください
		// キーを保持
		_keyStruct.keycopy(struct);
		struct.seth_CALLBUTTON("2");
                //}}user_implement_dev:<controlmodify>
		logger.exiting("KM0020010Control"+":USER="+struct.getsUser_ID(),"controlmodify");

		return;
	}

	/**
	 * 行削除ボタン押下時に実行される処理です。
	 *
	 */
	public void controlerase() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0020");
		logger.entering("KM0020010Control"+":USER="+struct.getsUser_ID(),"controlerase");
			//{{user_implement_dev:<controlerase>
			// TODO: ユーザ定義のコードを記述してください
		try {
			int j = 0;
			//選択行を一覧の画面から削除する。
			for(int i = 0; i < this.list.size(); i++){
				if (struct.getl_DETAL_NO().equals(((KM0020010Struct)list.get(i)).getl_DETAL_NO())){
					j = i;
				}
			}
			list.remove(j);
			//明細削除数をカウントアップする
			DelCnt++;
			struct.setLIST_CNT(Integer.toString(list.size()));
		} catch(Exception e) {
			e.printStackTrace();
			// エラー処理を記述してください。
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());//致命的エラー エラー内容
			ExpjException ee = new ExpjException(e, emsg); // エクセプションを生成
			throw ee;
		}
                //}}user_implement_dev:<controlerase>
		logger.exiting("KM0020010Control"+":USER="+struct.getsUser_ID(),"controlerase");

		return;
	}

	/**
	 * 帳票出力ボタン押下時に実行される処理です。
	 *
	 */
	public void controlprint() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0020");
		logger.entering("KM0020010Control"+":USER="+struct.getsUser_ID(),"controlprint");
			KM0020010Struct strPdf = null;

		int ret = 0;
		String printType      = getPdfOutputType();
		String printPattern   = getPdfOutputListPattern();
		String printer        = getPdfOutputPrinter();
		SvfWrapper svf        = new SvfWrapper(printType, getsysUSER_CD(), printer);

			//{{user_implement_dev:<controlprint>
			// TODO: ユーザ定義のコードを記述してください
		try {
			String printId1 = "KM00200101";	// 帳票IDを指定してください

			ret = svf.VrInit(printId1);	// PDF作成開始
			pdfFilePath = svf.getPdfFilePath();	// pdfフルパスファイル名
			pdfFileName = svf.getPdfFileName();	// pdfファイル名（Web用）
			String excuteOutput = svf.getExcuteOutput();	// サーバ出力処理            

			// クエリーファイルの指定 		
  			if (dbKIND != null && !dbKIND.equals("")) {
  				ret = svf.VrSetQuery("KIND=" + dbKIND + ";UID=" + dbUID
  						+ ";PWD=" + dbPWD + ";DBQ=" + dbDBQ);
  			} else {
  				ret = svf.VrSetQuery("UID=" + dbUID + ";PWD=" + dbPWD + ";DBQ="
  						+ dbDBQ);
  			}  
  			pdfList = list;
  		    //データのセット
            // クエリー抽出条件の指定
           	ret = svf.VrCondition("[X|PROJECT_CD]=" + struct.getPROJECT_CD(), 4);
           	ret = svf.VrCondition("[X|ESTIMATE_NO]=" + struct.geth_ESTIMATE_NO(), 4);
           	ret = svf.VrCondition("[X|COMPANY_CD]=" + struct.getCOMPANY_CD(), 4);
           	// クエリー実行 
           	ret = svf.VrReport();
       		if (ret == -554) {
   				ExpjMessage emsg = new ExpjMessage("ZZ06001");
   				msgStruct.addError(emsg);
   				sysLog.warning(emsg, sysUSER_CD);
   				return;
   			}            
         
            ret = svf.VrQuit(); // PDF作成終了
         
            if ("0".equals(printType)) { // クライアント印刷の場合
             struct.setDOWNLOAD_FILE(getPdfFileName());
            } else if ("1".equals(printType)) {
             try {
                 String acrobatPath = svf.getAcrobatPath();
                 String acrobatOption1 = svf.getAcrobatOption1();
                 String acrobatOption2 = svf.getAcrobatOption2();
                 String pdfPrinter = svf.getPrinter();
                 Runtime.getRuntime().exec(new String[]{acrobatPath, acrobatOption1, acrobatOption2, pdfFilePath, pdfPrinter});
              // Runtime.getRuntime().exec(excuteOutput);
             } catch (IOException e) {
              throw new ExpjException(e);
             }
            }
            conn.commit();
		}catch(Exception e) {
			e.printStackTrace();
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());//致命的エラー エラー内容
			ExpjException ee = new ExpjException(e, emsg); // エクセプションを生成
			throw ee;
		} finally {
			if (conn != null) {
                conn.rollback();
            }
		}
                //}}user_implement_dev:<controlprint>
		logger.exiting("KM0020010Control"+":USER="+struct.getsUser_ID(),"controlprint");

		return;
	}

	/**
	 * 登録ボタン押下時に実行される処理です。
	 *
	 */
	public void controlinsert() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0020");
		logger.entering("KM0020010Control"+":USER="+struct.getsUser_ID(),"controlinsert");
			//{{user_implement_dev:<controlinsert>
			// TODO: ユーザ定義のコードを記述してください
		boolean transFlg = false;
		try {
			//チェック
			//見積担当者コードがnullでない場合
			if (struct.getES_USER_CD() != null && !"".equals(struct.getES_USER_CD())){
				List listUser = entity.mCheckUSER_MST.read(conn, struct);
				if (listUser == null || listUser.size() != 1) {
					// 見積担当者が存在しない場合
					Message = "T_ESTIMATE.ES_USER_CD:" + struct.getES_USER_CD();
					setErrorMessage("KM00013", Message);
					return;
				}else{
					struct.setUSER_NAME(((KM0020010Struct)listUser.get(0)).getUSER_NAME()); //“見積担当者名”
				}
			}
			//見積担当部門コードがnullでない場合
			if (struct.getES_ORG_CD() != null && !"".equals(struct.getES_ORG_CD())){
				List listOrg = entity.mCheckM_ORG.read(conn, struct);
				if (listOrg == null || listOrg.size() != 1) {
					//見積担当 部門コードが存在しない場合
					Message = "T_ESTIMATE.ES_ORG_CD:" + struct.getES_ORG_CD();
					setErrorMessage("KM00006", Message);
					return;
				}else{
					struct.setORG_NAME(((KM0020010Struct)listOrg.get(0)).getORG_NAME()); //“見積担当 部門名”
				}
			}
			//[画面].“見積日”＜業務日付の場合
			GregorianCalendar date1 = new GregorianCalendar();
			date1.setTime(Converter.strToDate(struct.getESTIMATE_DATE(), "yyyy/MM/dd"));
			GregorianCalendar date2 = new GregorianCalendar();
			date2.setTime(Converter.strToDate(struct.getBUSINESS_DATE(), "yyyy/MM/dd"));
			if(date1.getTime().compareTo(date2.getTime()) < 0){
				//<ワーニング> KM00038　見積日が過去日です。
				Message = "T_ESTIMAT.ESTIMATE_DATE:" + struct.getESTIMATE_DATE();
				setWarnMessage("KM00038", Message);
			}
			//「明細合計処理」を行い「見積金額合計」「見積金額合計（邦貨）」を取得する。
			controlTotal();
			// トランザクション開始
        	conn.beginTransWeb();
            transFlg = true;
            
            // [見積] を登録する
            //見積番号=MAX([見積].“見積番号”)　＋1
            struct.seth_PROJECT_CD(struct.getPROJECT_CD());
            List listEstimate = entity.mSelectT_ESTIMATE.read(conn, struct);
			if (listEstimate.size() > 0) {
				struct.setESTIMATE_NO(Calculate.add(((KM0020010Struct)listEstimate.get(0)).geth_ESTIMATE_NO(), "1")); //[見積].“見積番号”
			}else{
				struct.setESTIMATE_NO("1");
			}
			//見積ステータス  [画面].“内示受領”がチェックOnの場合 1:内示
			if ("true".equals(struct.getUNOFFICIAL_RECEIPT_FLG())){
				struct.setESTIMATE_ST("1");
				struct.setUNOFFICIAL_RECEIPT_FLAG("1");
			}else{
				//[画面].“内示受領”がチェックOffの場合　0:見積中
				struct.setESTIMATE_ST("0");
				struct.setUNOFFICIAL_RECEIPT_FLAG("0");
			}
			
            entity.mInsertT_ESTIMATE.create(conn, struct);
            
            //見積明細を登録する
            for(int i = 0; i < this.list.size(); i++){
            	KM0020010Struct structtemp = new KM0020010Struct();
    			structtemp = (KM0020010Struct)list.get(i);
    			structtemp.setPROJECT_CD(struct.getPROJECT_CD());
    			structtemp.seth_ESTIMATE_NO(struct.getESTIMATE_NO());
    			structtemp.setUSER(this.getsysUSER_CD());
    			structtemp.setPROGRAM_NAME("KM0020010");
    			
    			//明細番号は1からふり直して、設定する。
    			structtemp.setl_DETAL_NO(Integer.toString(i+1));
                entity.mInsertT_ESTIMATE_DETAL.create(conn, structtemp);
			}
            //[画面].“内示受領”がチェックOnの場合、更新対象以外の見積の見積ステータスを9:キャンセルに更新する
            if ("true".equals(struct.getUNOFFICIAL_RECEIPT_FLG())){
            	struct.seth_ESTIMATE_NO(struct.getESTIMATE_NO());
            	struct.seth_ESTIMATE_ST("9");
            	entity.mUpdateT_ESTIMATE_ST.update(conn, struct);
			}
            //更新数チェック
            List listProject = entity.mSelectT_PROJECT.read(conn, struct);
			if (listProject.size() > 0) {
				if(!struct.getMODIFY_COUNT_PJ().equals(((KM0020010Struct)listProject.get(0)).getMODIFY_COUNT_PJ())){
					//[案件].“更新数” が読込時と異なる場合
					Message = "T_PROJECT.PROJECT_CD:" + struct.getPROJECT_CD();
					setErrorMessage("ZZ01105", Message);
					return;
				}
			}
			//案件ステータスを更新する。
			if("true".equals(struct.getUNOFFICIAL_RECEIPT_FLG())){
				//3:内示
				struct.setPROJECT_STAT("3");
			}else{
				//2:見積
				struct.setPROJECT_STAT("2");
			}
			entity.mUpdateT_PROJECT.update(conn, struct);
			conn.commit();
			// 再検索
			controlSelect();
			transFlg = false;
		} catch(SQLException e) {
			e.printStackTrace();
			// エラー処理を記述してください。
			setSqlExceptionMsg(e);
		} catch(Exception e) {
			e.printStackTrace();
			// エラー処理を記述してください。
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());//致命的エラー エラー内容
			ExpjException ee = new ExpjException(e, emsg); // エクセプションを生成
			throw ee;
		} finally{
        	try {
        		if(transFlg == true){
        			conn.rollback();
        			}
        		} catch(Exception e) {
        			e.printStackTrace();
        		}
        }
                //}}user_implement_dev:<controlinsert>
		logger.exiting("KM0020010Control"+":USER="+struct.getsUser_ID(),"controlinsert");

		return;
	}

	/**
	 * 更新ボタン押下時に実行される処理です。
	 *
	 */
	public void controlupdate() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0020");
		logger.entering("KM0020010Control"+":USER="+struct.getsUser_ID(),"controlupdate");
			//{{user_implement_dev:<controlupdate>
			// TODO: ユーザ定義のコードを記述してください
		boolean transFlg = false;
		int isdelete = 0;
		try {
			//チェック
			//見積担当者コードがnullでない場合
			if (struct.getES_USER_CD() != null && !"".equals(struct.getES_USER_CD())){
				List listUser = entity.mCheckUSER_MST.read(conn, struct);
				if (listUser == null || listUser.size() != 1) {
					// 見積担当者が存在しない場合
					Message = "T_ESTIMATE.ES_USER_CD:" + struct.getES_USER_CD();
					setErrorMessage("KM00013", Message);
					return;
				}else{
					struct.setUSER_NAME(((KM0020010Struct)listUser.get(0)).getUSER_NAME()); //“見積担当者名”
				}
			}
			
			//見積担当部門コードがnullでない場合
			if (struct.getES_ORG_CD() != null && !"".equals(struct.getES_ORG_CD())){
				List listOrg = entity.mCheckM_ORG.read(conn, struct);
				if (listOrg == null || listOrg.size() != 1) {
					//見積担当 部門コードが存在しない場合
					Message = "T_ESTIMATE.ES_ORG_CD:" + struct.getES_ORG_CD();
					setErrorMessage("KM00006", Message);
					return;
				}else{
					struct.setORG_NAME(((KM0020010Struct)listOrg.get(0)).getORG_NAME()); //“見積担当 部門名”
				}
			}
			//[画面].“見積日”＜業務日付の場合
			GregorianCalendar date1 = new GregorianCalendar();
			date1.setTime(Converter.strToDate(struct.getESTIMATE_DATE(), "yyyy/MM/dd"));
			GregorianCalendar date2 = new GregorianCalendar();
			date2.setTime(Converter.strToDate(struct.getBUSINESS_DATE(), "yyyy/MM/dd"));
			if(date1.getTime().compareTo(date2.getTime()) < 0){
				//<ワーニング> KM00038　見積日が過去日です。
				Message = "T_ESTIMAT.ESTIMATE_DATE:" + struct.getESTIMATE_DATE();
				setWarnMessage("KM00038", Message);
			}
			struct.seth_PROJECT_CD(struct.getPROJECT_CD());
			//見積番号が0の場合、最大見積番号を取得
			if ("0".equals(struct.getESTIMATE_NO())){
				List listEstimate = entity.mSelectT_ESTIMATE.read(conn, struct);
				if (listEstimate.size() > 0) {
					struct.seth_ESTIMATE_NO(((KM0020010Struct)listEstimate.get(0)).geth_ESTIMATE_NO()); //[見積].“見積番号”
				}
			}else{
				struct.seth_ESTIMATE_NO(struct.getESTIMATE_NO()); //[見積].“見積番号”
			}
			//画面より指定された条件のデータを[見積]より再度読み込む。
			List listHead = entity.mSelectHEAD.read(conn, struct);
			if (listHead.size() > 0) {
				if(!struct.getMODIFY_COUNT_ES().equals(((KM0020010Struct)listHead.get(0)).getMODIFY_COUNT_ES())){
					//[見積].“更新数” が読込時と異なる場合
					Message = "T_PROJECT.PROJECT_CD:" + struct.getPROJECT_CD();
					setErrorMessage("ZZ01105", Message);
					return;
				}
			}
			
			//「明細合計処理」を行い「見積金額合計」「見積金額合計（邦貨）」を取得する。
			controlTotal();
			
			// トランザクション開始
        	conn.beginTransWeb();
            transFlg = true;
            
            // [見積] を更新する
            if ("true".equals(struct.getUNOFFICIAL_RECEIPT_FLG())){
				struct.setESTIMATE_ST("1");
				struct.setUNOFFICIAL_RECEIPT_FLAG("1");
			}else{
				//[画面].“内示受領”がチェックOffの場合　0:見積中
				struct.setESTIMATE_ST("0");
				struct.setUNOFFICIAL_RECEIPT_FLAG("0");
			}
            //案件ステータスが1:引合、2:見積、3:内示の場合
            if("1".equals(struct.getPROJECT_STAT()) || "2".equals(struct.getPROJECT_STAT()) ||"3".equals(struct.getPROJECT_STAT()) ){
            	entity.mUpdateT_ESTIMATE.update(conn, struct);
            }
            //「行追加」、「行削除」が行われたかチェックする
            if (DelCnt == 0){
            	for(int i = 0; i < this.list.size(); i++){
                	KM0020010Struct structflag = new KM0020010Struct();
                	structflag = (KM0020010Struct)list.get(i);
        			if ("1".equals(structflag.getl_FLAG())){
        				isdelete = 1;
        				break;
        			}
    			}
            }
            //明細の一覧で、「行追加」、「行削除」が行われた場合
            if (isdelete == 1 || DelCnt != 0){
            	//[見積明細]データを物理削除する。
            	entity.mDeleteT_ESTIMATE_DETAL.delete(conn, struct);
            	//見積明細を登録する
                for(int i = 0; i < this.list.size(); i++){
                	KM0020010Struct structtemp = new KM0020010Struct();
        			structtemp = (KM0020010Struct)list.get(i);
        			structtemp.setPROJECT_CD(struct.getPROJECT_CD());
        			structtemp.seth_ESTIMATE_NO(struct.geth_ESTIMATE_NO());
        			structtemp.setUSER(this.getsysUSER_CD());
        			structtemp.setPROGRAM_NAME("KM0020010");
        			
        			//明細番号は1からふり直して、設定する。
        			structtemp.setl_DETAL_NO(Integer.toString(i+1));
                    entity.mInsertT_ESTIMATE_DETAL.create(conn, structtemp);
    			}
            }else{
            	//明細の一覧で、「行追加」、「行削除」が行われていない場合、明細一覧を更新する
            	for(int i = 0; i < this.list.size(); i++){
                	KM0020010Struct structtemp = new KM0020010Struct();
        			structtemp = (KM0020010Struct)list.get(i);
        			if ("2".equals(structtemp.getl_FLAG())){
        				structtemp.setPROJECT_CD(struct.getPROJECT_CD());
        				structtemp.seth_ESTIMATE_NO(struct.geth_ESTIMATE_NO());
        				structtemp.setUSER(this.getsysUSER_CD());
        				structtemp.setPROGRAM_NAME("KM0020010");
        				entity.mUpdateT_ESTIMATE_DETAL.update(conn, structtemp);
        			}
    			}
            }
            //ステータスの見直し
            //内示受領フラグを変更した場合、更新対象以外の見積の見積ステータスを更新する。
            if(!struct.geth_UNOFFICIAL_RECEIPT_FLAG().equals(struct.getUNOFFICIAL_RECEIPT_FLAG())){
            	//内示受領フラグを1:受領ありから0:受領なしに更新した場合は、更新対象以外の見積の見積ステータスを0:見積中にする。
            	if ("1".equals(struct.geth_UNOFFICIAL_RECEIPT_FLAG()) && "0".equals(struct.getUNOFFICIAL_RECEIPT_FLAG())){
            		struct.seth_ESTIMATE_ST("0");
            		//2:見積
    				struct.setPROJECT_STAT("2");
            	}else{
            		//内示受領フラグを0: 受領なしから1:受領ありに更新した場合は、更新対象以外の見積の見積ステータスを9:キャンセルにする。
            		struct.seth_ESTIMATE_ST("9");
            		//3:内示
    				struct.setPROJECT_STAT("3");
            	}
            	entity.mUpdateT_ESTIMATE_ST.update(conn, struct);
            	//更新数チェック
                List listProject = entity.mSelectT_PROJECT.read(conn, struct);
    			if (listProject.size() > 0) {
    				if(!struct.getMODIFY_COUNT_PJ().equals(((KM0020010Struct)listProject.get(0)).getMODIFY_COUNT_PJ())){
    					//[案件].“更新数” が読込時と異なる場合
    					Message = "T_PROJECT.PROJECT_CD:" + struct.getPROJECT_CD();
    					setErrorMessage("ZZ01105", Message);
    					return;
    				}
    			}
    			//案件ステータスを更新する。
    			entity.mUpdateT_PROJECT.update(conn, struct);
            }
			conn.commit();
			// 再検索
			controlSelect();
			transFlg = false;
		} catch(SQLException e) {
			e.printStackTrace();
			// エラー処理を記述してください。
			setSqlExceptionMsg(e);
		} catch(Exception e) {
			e.printStackTrace();
			// エラー処理を記述してください。
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());//致命的エラー エラー内容
			ExpjException ee = new ExpjException(e, emsg); // エクセプションを生成
			throw ee;
		} finally{
        	try {
        		if(transFlg == true){
        			conn.rollback();
        			}
        		} catch(Exception e) {
        			e.printStackTrace();
        		}
        }
                //}}user_implement_dev:<controlupdate>
		logger.exiting("KM0020010Control"+":USER="+struct.getsUser_ID(),"controlupdate");

		return;
	}

	/**
	 * 削除ボタン押下時に実行される処理です。
	 *
	 */
	public void controldelete() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0020");
		logger.entering("KM0020010Control"+":USER="+struct.getsUser_ID(),"controldelete");
			//{{user_implement_dev:<controldelete>
			// TODO: ユーザ定義のコードを記述してください
		boolean transFlg = false;
		try {
			struct.seth_PROJECT_CD(struct.getPROJECT_CD());
			//見積番号が0の場合、最大見積番号を取得
			if ("0".equals(struct.getESTIMATE_NO())){
				List listEstimate = entity.mSelectT_ESTIMATE.read(conn, struct);
				if (listEstimate.size() > 0) {
					struct.seth_ESTIMATE_NO(((KM0020010Struct)listEstimate.get(0)).geth_ESTIMATE_NO()); //[見積].“見積番号”
				}
			}else{
				struct.seth_ESTIMATE_NO(struct.getESTIMATE_NO()); //[見積].“見積番号”
			}
			//画面より指定された条件のデータを[見積]より再度読み込む。
			List listHead = entity.mSelectHEAD.read(conn, struct);
			if (listHead.size() > 0) {
				if(!struct.getMODIFY_COUNT_ES().equals(((KM0020010Struct)listHead.get(0)).getMODIFY_COUNT_ES())){
					//[見積].“更新数” が読込時と異なる場合
					Message = "T_PROJECT.PROJECT_CD:" + struct.getPROJECT_CD();
					setErrorMessage("ZZ01105", Message);
					return;
				}
			}
			// トランザクション開始
        	conn.beginTransWeb();
            transFlg = true;
            
            //[見積] を物理削除する。
            entity.mDeleteT_ESTIMATE.delete(conn, struct);
            //[見積明細] を物理削除する
            entity.mDeleteT_ESTIMATE_DETAL.delete(conn, struct);
            //画面より指定された条件のデータを[案件]より再度読み込む
            //更新数チェック
            List listProject = entity.mSelectT_PROJECT.read(conn, struct);
			if (listProject.size() > 0) {
				if(!struct.getMODIFY_COUNT_PJ().equals(((KM0020010Struct)listProject.get(0)).getMODIFY_COUNT_PJ())){
					//[案件].“更新数” が読込時と異なる場合
					Message = "T_PROJECT.PROJECT_CD:" + struct.getPROJECT_CD();
					setErrorMessage("ZZ01105", Message);
					return;
				}
			}
			List listCheck = entity.mCheckT_ESTIMATE.read(conn, struct);
			if (listCheck == null || listCheck.size() == 0) {
				//案件ステータスを更新する
				struct.setPROJECT_STAT("1");
				entity.mUpdateT_PROJECT.update(conn, struct);
			}
			conn.commit();
			// クリアする
			controlClear();
			transFlg = false;
		} catch(SQLException e) {
			e.printStackTrace();
			// エラー処理を記述してください。
			setSqlExceptionMsg(e);
		}finally{
        	try {
        		if(transFlg == true){
        			conn.rollback();
        			}
        		} catch(Exception e) {
        			e.printStackTrace();
        		}
        }
                //}}user_implement_dev:<controldelete>
		logger.exiting("KM0020010Control"+":USER="+struct.getsUser_ID(),"controldelete");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0020");
		logger.entering("KM0020010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
			// TODO: ユーザ定義のコードを記述してください
		//------------------------------------------------------------------
        // 初期化
        _keyStruct.clear();
        struct.clear();
        if(list != null){
        	list.clear();
        }
        setReadStatus(INITIAL);
        controlRELOAD();
        //------------------------------------------------------------------
                //}}user_implement_dev:<controlClear>
		logger.exiting("KM0020010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * 閉じるボタン押下時に実行される処理です。
	 *
	 */
	public void controlClose() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0020");
		logger.entering("KM0020010Control"+":USER="+struct.getsUser_ID(),"controlClose");
			//{{user_implement_dev:<controlClose>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlClose>
		logger.exiting("KM0020010Control"+":USER="+struct.getsUser_ID(),"controlClose");

		return;
	}

	/**
	 * 単価読込ボタン押下時に実行される処理です。
	 *
	 */
	public void controlSelectUnitCost() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0020");
		logger.entering("KM0020010Control"+":USER="+struct.getsUser_ID(),"controlSelectUnitCost");
			//{{user_implement_dev:<controlSelectUnitCost>
			// TODO: ユーザ定義のコードを記述してください
		try{
			//[製品単価].“単価”を取得する。
			List listCost = entity.mSelectM_UNIT_COST.read(conn, struct);
			if (listCost == null || listCost.size() == 0) {
				// [製品単価]が取得できなかった場合：単価がマスタに存在しません。
				Message = "M_ITEM_SPEC.CUST_ITEM_CD:" + struct.getl_CUST_ITEM_CD();
				setErrorMessage("KQ00021", Message);
			}else{
				struct.setl_UNIT_PRICE(((KM0020010Struct)listCost.get(0)).getUNIT_COST()); //[製品単価].“単価”
				struct.setl_UNIT_COST(((KM0020010Struct)listCost.get(0)).getUNIT_COST()); //[製品単価].“単価”
				struct.setl_ESTIMATE_UNIT_PRICE(Calculate.add(struct.getl_UNIT_PRICE(), struct.getl_DISCOUNT_PRICE())); //“見積単価”
				if(Calculate.compare((Calculate.multiply(struct.getl_UNIT_PRICE(), struct.getl_ESTIMATE_QTY())),"99999999999999.00") == 1){
					struct.setl_AMOUNT("99999999999999.00");
				}else{
					struct.setl_AMOUNT(Calculate.multiply(struct.getl_UNIT_PRICE(), struct.getl_ESTIMATE_QTY())); //“金額”
				}
				if(Calculate.compare((Calculate.multiply(struct.getl_DISCOUNT_PRICE(), struct.getl_ESTIMATE_QTY())),"99999999999999.00") == 1){
					struct.setl_DISCOUNT_AMOUNT("99999999999999.00");
				}else{
					struct.setl_DISCOUNT_AMOUNT(Calculate.multiply(struct.getl_DISCOUNT_PRICE(), struct.getl_ESTIMATE_QTY())); //“値引金額”
				}
				if(Calculate.compare((Calculate.multiply(struct.getl_ESTIMATE_UNIT_PRICE(), struct.getl_ESTIMATE_QTY())),"99999999999999.00") == 1){
					struct.setl_ESTIMATE_AMOUNT("99999999999999.00");
				}else{
					struct.setl_ESTIMATE_AMOUNT(Calculate.multiply(struct.getl_ESTIMATE_UNIT_PRICE(), struct.getl_ESTIMATE_QTY())); //“見積金額”
				}
			}
		} catch(SQLException e) {
			e.printStackTrace();
			// エラー処理を記述してください。
			setSqlExceptionMsg(e);
		}
                //}}user_implement_dev:<controlSelectUnitCost>
		logger.exiting("KM0020010Control"+":USER="+struct.getsUser_ID(),"controlSelectUnitCost");

		return;
	}

	/**
	 * 邦貨換算ボタン押下時に実行される処理です。
	 *
	 */
	public void controlLcConversion() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0020");
		logger.entering("KM0020010Control"+":USER="+struct.getsUser_ID(),"controlLcConversion");
			//{{user_implement_dev:<controlLcConversion>
			// TODO: ユーザ定義のコードを記述してください
		try{
			//[画面].“見積金額”が0の場合、通貨コードが邦貨の場合、処理を抜ける
			if (!"0".equals(struct.getl_ESTIMATE_AMOUNT()) &&  !struct.getHOME_CUR_CD().equals(struct.geth_CUR_CD())){
				List listMCust = entity.mSelectM_CUST.read(conn, struct);
				if (listMCust.size() > 0) {
					struct.setEXCH_TYP(((KM0020010Struct)listMCust.get(0)).getEXCH_TYP()); //[得意先].“為替種別”
					struct.setDETAIL_ROUND_TYP(((KM0020010Struct)listMCust.get(0)).getDETAIL_ROUND_TYP()); //[得意先].“明細計算まるめ区分”
				}
				//邦貨換算の部品を呼ぶ
				ExchAmount ex = new ExchAmount(conn);
				if(!ex.doExchAmount(struct.getl_ESTIMATE_AMOUNT(),struct.getCOMPANY_CD(),struct.geth_CUR_CD(),
						struct.getEXCH_TYP(),struct.getDETAIL_ROUND_TYP(),struct.getBUSINESS_DATE())){
					//エラーの場合、メッセージを出力する
					//邦貨換算に失敗した場合
					Message = "T_PROJECT.PROJECT_CD:" + struct.getPROJECT_CD();
					setErrorMessage("KM00022", Message);
					return;
				}
				if(Calculate.compare(ex.getS_EXCH_AMOUNT(),"99999999999999.00") == 1){
					struct.setl_ESTIMATE_AMOUNT_JPN("99999999999999.00");
				}else{
					struct.setl_ESTIMATE_AMOUNT_JPN(ex.getS_EXCH_AMOUNT());//見積金額(邦貨)
				}
				if(Calculate.compare((Calculate.subtract(struct.getl_ESTIMATE_AMOUNT_JPN(), struct.getl_ES_COST_ALL())),"99999999999999.00") == 1){
					struct.setl_ESTIMATE_GAIN("99999999999999.00");
				}else{
					struct.setl_ESTIMATE_GAIN(Calculate.subtract(struct.getl_ESTIMATE_AMOUNT_JPN(), struct.getl_ES_COST_ALL())); //見積利益=見積金額(邦貨)－[画面].“予算合計”
				}
			}
		} catch(SQLException e) {
			e.printStackTrace();
			// エラー処理を記述してください。
			setSqlExceptionMsg(e);
		}
                //}}user_implement_dev:<controlLcConversion>
		logger.exiting("KM0020010Control"+":USER="+struct.getsUser_ID(),"controlLcConversion");

		return;
	}

	/**
	 * 追加ボタン押下時に実行される処理です。
	 *
	 */
	public void controlinsertSub1() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0020");
		logger.entering("KM0020010Control"+":USER="+struct.getsUser_ID(),"controlinsertSub1");
			//{{user_implement_dev:<controlinsertSub1>
			// TODO: ユーザ定義のコードを記述してください
		try {
			//チェック
			//得意先品目番号がnullでない場合、
			if (struct.getl_CUST_ITEM_CD() != null && !"".equals(struct.getl_CUST_ITEM_CD())){
				//[製品].“会社コード”＝自社コード、[製品].“得意先コード”＝[案件].“得意先コード”、[製品].“得意先品目番号” ＝ [画面].“得意先品目番号”の条件に合致するレコードが [製品] に存在しない場合
				List listSpec = entity.mCheckM_ITEM_SPEC.read(conn, struct);
				if (listSpec == null || listSpec.size() != 1) {
					// 処理失敗：得意先品目番号が製品マスタに存在しません。
					Message = "M_ITEM_SPEC.CUST_ITEM_CD:" + struct.getl_CUST_ITEM_CD();
					setErrorMessage("KQ00017", Message);
					return;
				}else{
					struct.setl_CUST_ITEM_NAME(((KM0020010Struct)listSpec.get(0)).getl_CUST_ITEM_NAME()); //[製品].“得意先品目名”
				}
			}
			//[品目].“在庫数単位区分” ＝ 1:整数管理 かつ[画面].“数量” が 整数でない場合
			if (!Calculate.isInteger(struct.getl_ESTIMATE_QTY())){
				List listItem = entity.mSelectM_ITEM.read(conn, struct);
				if (listItem.size() > 0) {
					struct.setUNIT_QTY_TYP(((KM0020010Struct)listItem.get(0)).getUNIT_QTY_TYP()); //[品目].“在庫数単位区分”
				}
				if ("1".equals(struct.getUNIT_QTY_TYP())){
					//<ワーニング> KQ20004【整数管理品目のため小数点以下を切り上げました。】
					Message = "M_ITEM_SPEC.CUST_ITEM_CD:" + struct.getl_CUST_ITEM_CD();
					setWarnMessage("KQ20004", Message);
					//小数点以下を切り上げて 一覧の “数量” にセットする。
					struct.setl_ESTIMATE_QTY(Calculate.ceil(struct.getl_ESTIMATE_QTY(), 0));
					struct.setl_AMOUNT(Calculate.multiply(struct.getl_UNIT_PRICE(), struct.getl_ESTIMATE_QTY())); //“金額”
					struct.setl_DISCOUNT_AMOUNT(Calculate.multiply(struct.getl_DISCOUNT_PRICE(), struct.getl_ESTIMATE_QTY())); //“値引金額”
					struct.setl_ESTIMATE_AMOUNT(Calculate.multiply(struct.getl_ESTIMATE_UNIT_PRICE(), struct.getl_ESTIMATE_QTY())); //“見積金額”
				}
			}
			//[画面].“指定納期”＜業務日付の場合
			GregorianCalendar date1 = new GregorianCalendar();
			date1.setTime(Converter.strToDate(struct.getl_DESINATED_DLV_DATE(), "yyyy/MM/dd"));
			GregorianCalendar date2 = new GregorianCalendar();
			date2.setTime(Converter.strToDate(struct.getBUSINESS_DATE(), "yyyy/MM/dd"));
			if(date1.getTime().compareTo(date2.getTime()) < 0){
				//<ワーニング> KM00039　指定納期が過去日です。
				Message = "T_ESTIMATE_DETAL.DESINATED_DLV_DATE:" + struct.getl_DESINATED_DLV_DATE();
				setWarnMessage("KM00039", Message);
			}
			struct.keycopy(_keyStruct);
			struct.setl_UNIT_COST("0");
			//得意先品目番号がnullでない場合、製品単価を取得する。
			if (struct.getl_CUST_ITEM_CD() != null && !"".equals(struct.getl_CUST_ITEM_CD())){
				//[製品単価].“単価”を取得する。
				List listCost = entity.mSelectM_UNIT_COST.read(conn, struct);
				if (listCost == null || listCost.size() == 0) {
					// [製品単価]が取得できなかった場合
					struct.setl_UNIT_COST("0");//[見積明細].“製品単価”
				}else{
					struct.setl_UNIT_COST(((KM0020010Struct)listCost.get(0)).getUNIT_COST()); //[製品単価].“単価”
				}
				//[品目].“計量単位”を取得する
				List listUnit = entity.mSelectSTOCK_UNIT.read(conn, struct);
				if (!listUnit.isEmpty()) {
					struct.setl_UNIT_CD(((KM0020010Struct)listUnit.get(0)).getl_UNIT_CD()); //[品目].“計量単位”
				}else{
					struct.setl_UNIT_CD(null); //[品目].“計量単位”
				}
			}else{
				struct.setl_CUST_ITEM_NAME("");
			}
			//邦貨換算処理
			controlLcConversion();
			//通貨コードが邦貨の場合、見積金額(邦貨)に見積金額を設定する。
			if (struct.getHOME_CUR_CD().equals(struct.geth_CUR_CD())){
				struct.setl_ESTIMATE_AMOUNT_JPN(struct.getl_ESTIMATE_AMOUNT());
				//見積利益=見積金額(邦貨)－予算合計
				struct.setl_ESTIMATE_GAIN(Calculate.subtract(struct.getl_ESTIMATE_AMOUNT_JPN(), struct.getl_ES_COST_ALL()));
			}
			
			//登録更新フラグ(非表示) = 1:登録
			struct.setl_FLAG("1");
			//明細番号最大値(非表示) = 明細番号最大値(非表示)+1
			struct.seth_MAX_DETAL_NO(struct.getl_DETAL_NO());
			struct.setl_ESTIMATE_NAME(this.multcombo("ESTIMATE_TYPE",struct.getl_ESTIMATE_TYP())); //[見積明細].“手配品目種”
			struct.setl_SPEC_CLASS1_NAME(this.multcombo("SPEC_CLASS_01",struct.getl_SPEC_CLASS1_TYP())); //[見積明細].“製品選択1”
			struct.setl_SPEC_CLASS2_NAME(this.multcombo("SPEC_CLASS_02",struct.getl_SPEC_CLASS2_TYP())); //[見積明細].“製品選択2”
			struct.setl_SPEC_SELECT1_NAME(this.multcombo("SPEC_SELECT_01",struct.getl_SPEC_SELECT1_TYP())); //[見積明細].“仕様選択1”
			struct.setl_SPEC_SELECT2_NAME(this.multcombo("SPEC_SELECT_02",struct.getl_SPEC_SELECT2_TYP())); //[見積明細].“仕様選択2”
			struct.setl_SPEC_SELECT3_NAME(this.multcombo("SPEC_SELECT_03",struct.getl_SPEC_SELECT3_TYP())); //[見積明細].“仕様選択3”
			struct.setl_SPEC_SELECT4_NAME(this.multcombo("SPEC_SELECT_04",struct.getl_SPEC_SELECT4_TYP())); //[見積明細].“仕様選択4”
			KM0020010Struct structtemp = new KM0020010Struct();
			structtemp.copy(struct);
			if (list == null) {
    			list = new ArrayList();
    		}
			list.add(structtemp);
			struct.setLIST_CNT(Integer.toString(list.size()));
		} catch(SQLException e) {
			e.printStackTrace();
			// エラー処理を記述してください。
			setSqlExceptionMsg(e);
		}catch(Exception e) {
			e.printStackTrace();
			// エラー処理を記述してください。
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());//致命的エラー エラー内容
			ExpjException ee = new ExpjException(e, emsg); // エクセプションを生成
			throw ee;
		}
                //}}user_implement_dev:<controlinsertSub1>
		logger.exiting("KM0020010Control"+":USER="+struct.getsUser_ID(),"controlinsertSub1");

		return;
	}

	/**
	 * 修正ボタン押下時に実行される処理です。
	 *
	 */
	public void controlupdateSub1() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0020");
		logger.entering("KM0020010Control"+":USER="+struct.getsUser_ID(),"controlupdateSub1");
			//{{user_implement_dev:<controlupdateSub1>
			// TODO: ユーザ定義のコードを記述してください
		try {
			int j = 0;
			//チェック
			//得意先品目番号がnullでない場合、
			if (struct.getl_CUST_ITEM_CD() != null && !"".equals(struct.getl_CUST_ITEM_CD())){
				//[製品].“会社コード”＝自社コード、[製品].“得意先コード”＝[案件].“得意先コード”、[製品].“得意先品目番号” ＝ [画面].“得意先品目番号”の条件に合致するレコードが [製品] に存在しない場合
				List listSpec = entity.mCheckM_ITEM_SPEC.read(conn, struct);
				if (listSpec == null || listSpec.size() != 1) {
					// 処理失敗：得意先品目番号が製品マスタに存在しません。
					Message = "M_ITEM_SPEC.CUST_ITEM_CD:" + struct.getl_CUST_ITEM_CD();
					setErrorMessage("KQ00017", Message);
					return;
				}else{
					struct.setl_CUST_ITEM_NAME(((KM0020010Struct)listSpec.get(0)).getl_CUST_ITEM_NAME()); //[製品].“得意先品目名”
				}
			}
			//[品目].“在庫数単位区分” ＝ 1:整数管理 かつ[画面].“数量” が 整数でない場合
			if (!Calculate.isInteger(struct.getl_ESTIMATE_QTY())){
				List listItem = entity.mSelectM_ITEM.read(conn, struct);
				if (listItem.size() > 0) {
					struct.setUNIT_QTY_TYP(((KM0020010Struct)listItem.get(0)).getUNIT_QTY_TYP()); //[品目].“在庫数単位区分”
				}
				if ("1".equals(struct.getUNIT_QTY_TYP())){
					//<ワーニング> KQ20004【整数管理品目のため小数点以下を切り上げました。】
					Message = "M_ITEM_SPEC.CUST_ITEM_CD:" + struct.getl_CUST_ITEM_CD();
					setWarnMessage("KQ20004", Message);
					//小数点以下を切り上げて 一覧の “数量” にセットする。
					struct.setl_ESTIMATE_QTY(Calculate.ceil(struct.getl_ESTIMATE_QTY(), 0));
					struct.setl_AMOUNT(Calculate.multiply(struct.getl_UNIT_PRICE(), struct.getl_ESTIMATE_QTY())); //“金額”
					struct.setl_DISCOUNT_AMOUNT(Calculate.multiply(struct.getl_DISCOUNT_PRICE(), struct.getl_ESTIMATE_QTY())); //“値引金額”
					struct.setl_ESTIMATE_AMOUNT(Calculate.multiply(struct.getl_ESTIMATE_UNIT_PRICE(), struct.getl_ESTIMATE_QTY())); //“見積金額”
				}
			}
			//[画面].“指定納期”＜業務日付の場合
			GregorianCalendar date1 = new GregorianCalendar();
			date1.setTime(Converter.strToDate(struct.getl_DESINATED_DLV_DATE(), "yyyy/MM/dd"));
			GregorianCalendar date2 = new GregorianCalendar();
			date2.setTime(Converter.strToDate(struct.getBUSINESS_DATE(), "yyyy/MM/dd"));
			if(date1.getTime().compareTo(date2.getTime()) < 0){
				//<ワーニング> KM00039　指定納期が過去日です。
				Message = "T_ESTIMATE_DETAL.DESINATED_DLV_DATE:" + struct.getl_DESINATED_DLV_DATE();
				setWarnMessage("KM00039", Message);
			}
			struct.keycopy(_keyStruct);
			struct.setl_UNIT_COST("0");
			//得意先品目番号がnullでない場合製品単価を取得する。
			if (struct.getl_CUST_ITEM_CD() != null && !"".equals(struct.getl_CUST_ITEM_CD())){
				//[製品単価].“単価”を取得する。
				List listCost = entity.mSelectM_UNIT_COST.read(conn, struct);
				if (listCost == null || listCost.size() == 0) {
					// [製品単価]が取得できなかった場合
					struct.setl_UNIT_COST("0");//[見積明細].“製品単価”
				}else{
					struct.setl_UNIT_COST(((KM0020010Struct)listCost.get(0)).getUNIT_COST()); //[製品単価].“単価”
				}
				//[品目].“計量単位”を取得する
				List listUnit = entity.mSelectSTOCK_UNIT.read(conn, struct);
				if (!listUnit.isEmpty()) {
					struct.setl_UNIT_CD(((KM0020010Struct)listUnit.get(0)).getl_UNIT_CD()); //[品目].“計量単位”
				}else{
					struct.setl_UNIT_CD(null); //[品目].“計量単位”
				}
			}else{
				struct.setl_CUST_ITEM_NAME("");
			}
			//邦貨換算処理
			controlLcConversion();
			//通貨コードが邦貨の場合、見積金額(邦貨)に見積金額を設定する。
			if (struct.getHOME_CUR_CD().equals(struct.geth_CUR_CD())){
				struct.setl_ESTIMATE_AMOUNT_JPN(struct.getl_ESTIMATE_AMOUNT());
				//見積利益=見積金額(邦貨)－予算合計
				struct.setl_ESTIMATE_GAIN(Calculate.subtract(struct.getl_ESTIMATE_AMOUNT_JPN(), struct.getl_ES_COST_ALL()));
			}
			
			//登録更新フラグ(非表示)が0：初期値の場合は2：更新を設定する。
			if("0".equals(struct.getl_FLAG())){
				struct.setl_FLAG("2");
			}
			struct.setl_ESTIMATE_NAME(this.multcombo("ESTIMATE_TYPE",struct.getl_ESTIMATE_TYP())); //[見積明細].“手配品目種”
			struct.setl_SPEC_CLASS1_NAME(this.multcombo("SPEC_CLASS_01",struct.getl_SPEC_CLASS1_TYP())); //[見積明細].“製品選択1”
			struct.setl_SPEC_CLASS2_NAME(this.multcombo("SPEC_CLASS_02",struct.getl_SPEC_CLASS2_TYP())); //[見積明細].“製品選択2”
			struct.setl_SPEC_SELECT1_NAME(this.multcombo("SPEC_SELECT_01",struct.getl_SPEC_SELECT1_TYP())); //[見積明細].“仕様選択1”
			struct.setl_SPEC_SELECT2_NAME(this.multcombo("SPEC_SELECT_02",struct.getl_SPEC_SELECT2_TYP())); //[見積明細].“仕様選択2”
			struct.setl_SPEC_SELECT3_NAME(this.multcombo("SPEC_SELECT_03",struct.getl_SPEC_SELECT3_TYP())); //[見積明細].“仕様選択3”
			struct.setl_SPEC_SELECT4_NAME(this.multcombo("SPEC_SELECT_04",struct.getl_SPEC_SELECT4_TYP())); //[見積明細].“仕様選択4”
			for(int i = 0; i < this.list.size(); i++){
				if (struct.getl_DETAL_NO().equals(((KM0020010Struct)list.get(i)).getl_DETAL_NO())){
					j = i;
				}
			}
			KM0020010Struct structtemp = new KM0020010Struct();
			structtemp = (KM0020010Struct)list.get(j);
			structtemp.copy(struct); 
			struct.setLIST_CNT(Integer.toString(list.size()));
		} catch(SQLException e) {
			e.printStackTrace();
			// エラー処理を記述してください。
			setSqlExceptionMsg(e);
		}catch(Exception e) {
			e.printStackTrace();
			// エラー処理を記述してください。
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());//致命的エラー エラー内容
			ExpjException ee = new ExpjException(e, emsg); // エクセプションを生成
			throw ee;
		}
                //}}user_implement_dev:<controlupdateSub1>
		logger.exiting("KM0020010Control"+":USER="+struct.getsUser_ID(),"controlupdateSub1");

		return;
	}

	/**
	 * 戻るボタン押下時に実行される処理です。
	 *
	 */
	public void controlcancelSub1() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0020");
		logger.entering("KM0020010Control"+":USER="+struct.getsUser_ID(),"controlcancelSub1");
			//{{user_implement_dev:<controlcancelSub1>
			// TODO: ユーザ定義のコードを記述してください
			struct.keycopy(_keyStruct);
			if (list != null){
				struct.setLIST_CNT(Integer.toString(list.size()));
			}else{
				struct.setLIST_CNT("0");
			}
                //}}user_implement_dev:<controlcancelSub1>
		logger.exiting("KM0020010Control"+":USER="+struct.getsUser_ID(),"controlcancelSub1");

		return;
	}

	/**
	 * 引用読込ボタン押下時に実行される処理です。
	 *
	 */
	public void controlQ_Select() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0020");
		logger.entering("KM0020010Control"+":USER="+struct.getsUser_ID(),"controlQ_Select");
			//{{user_implement_dev:<controlQ_Select>
			// TODO: ユーザ定義のコードを記述してください
		try {
			//引用案件番号チェック
			//案件存在チェック
			List listQProject = entity.mCheckQUOTE_PROJECT_CD.read(conn, struct);
			if (listQProject == null || listQProject.size() != 1) {
				// 読込処理失敗：案件が存在しません。
				Message = "T_PROJECT.PROJECT_CD:" + struct.getQUOTE_PROJECT_CD();
				setErrorMessage("KM00001", Message);
				return;
			}else{
				struct.seth_PROJECT_STAT(((KM0020010Struct)listQProject.get(0)).getPROJECT_STAT()); //[案件].“案件ステータス”
				struct.setQUOTE_CUST_CD(((KM0020010Struct)listQProject.get(0)).getQUOTE_CUST_CD()); //[案件].“得意先コード”
				struct.setQUOTE_CUR_CD(((KM0020010Struct)listQProject.get(0)).getQUOTE_CUR_CD()); //[通貨].“通貨コード”
				struct.setQUOTE_CUR_UNIT(((KM0020010Struct)listQProject.get(0)).getQUOTE_CUR_UNIT()); //[通貨].“通貨単位”
				//案件ステータスが引合の場合
				if ("1".equals(struct.geth_PROJECT_STAT())){
					Message = "T_PROJECT.PROJECT_CD:" + struct.getQUOTE_PROJECT_CD();
					setErrorMessage("KM00010", Message);
					return;
				}
				//得意先コードは得意先に存在しない場合
				if (struct.getQUOTE_CUST_CD() == null){
					Message = "T_PROJECT.PROJECT_CD:" + struct.getQUOTE_PROJECT_CD();
					setErrorMessage("KQ00014", Message);
					return;
				}
				//通貨コードは通貨に存在しない場合
				if (struct.getQUOTE_CUR_CD() == null){
					Message = "T_PROJECT.PROJECT_CD:" + struct.getQUOTE_PROJECT_CD();
					setErrorMessage("KQ00073", Message);
					return;
				}
				//取得した「通貨コード」と[画面].“通貨コード(非表示)”が同じでない場合
				if (!struct.getQUOTE_CUR_CD().equals(struct.geth_CUR_CD())){
					Message = "T_PROJECT.PROJECT_CD:" + struct.getQUOTE_PROJECT_CD();
					setErrorMessage("KM00017", Message);
					return;
				}
				struct.seth_PROJECT_CD(struct.getQUOTE_PROJECT_CD());
				//引用見積番号が0の場合、最大見積番号を取得
				if ("0".equals(struct.getQUOTE_ESTIMATE_NO())){
					List listEstimate = entity.mSelectT_ESTIMATE.read(conn, struct);
					if (listEstimate.size() > 0) {
						struct.seth_ESTIMATE_NO(((KM0020010Struct)listEstimate.get(0)).geth_ESTIMATE_NO()); //[見積].“見積番号”
						struct.setQUOTE_ESTIMATE_NO(struct.geth_ESTIMATE_NO());
					}
				}else{
					struct.seth_ESTIMATE_NO(struct.getQUOTE_ESTIMATE_NO()); //[見積].“見積番号”
				}
				//見積ヘッダの取得
				List listHead = entity.mSelectHEAD.read(conn, struct);
				if (listHead.size() > 0) {
					struct.setESTIMATE_AMOUNT(((KM0020010Struct)listHead.get(0)).getESTIMATE_AMOUNT()); //[見積].“見積金額合計”
					struct.setESTIMATE_AMOUNT_JPN(((KM0020010Struct)listHead.get(0)).getESTIMATE_AMOUNT_JPN()); //[見積].“見積金額合計（邦貨）”
					struct.setES_COMMET1(((KM0020010Struct)listHead.get(0)).getES_COMMET1()); //[見積].“指定納期”
					struct.setES_COMMET2(((KM0020010Struct)listHead.get(0)).getES_COMMET2()); //[見積].“納品場所”
					struct.setES_COMMET4(((KM0020010Struct)listHead.get(0)).getES_COMMET4()); //[見積].“お支払条件”
					struct.setES_COMMET3(((KM0020010Struct)listHead.get(0)).getES_COMMET3()); //[見積].“荷造運送費”
					struct.setES_COMMET5(((KM0020010Struct)listHead.get(0)).getES_COMMET5()); //[見積].“見積有効期限”
					struct.setESREMARK1(((KM0020010Struct)listHead.get(0)).getESREMARK1()); //[見積].“備考1”
					struct.setESREMARK2(((KM0020010Struct)listHead.get(0)).getESREMARK2()); //[見積].“備考2”
					struct.setESREMARK3(((KM0020010Struct)listHead.get(0)).getESREMARK3()); //[見積].“備考3”
					struct.setCUR_UNIT(struct.getQUOTE_CUR_UNIT()); //[通貨].“通貨単位”
				}
				 // 表示最大行数制限処理
				if(struct.getROW_COUNT() != null){
					list = entity.mSelectDETAIL_COUNT.read(conn, struct);
				    int maxLine = Integer.parseInt(struct.getROW_COUNT());
					long rowCount = Long.parseLong(((KM0020010Struct)list.get(0)).getl_COUNT());
					if (rowCount == maxLine + 1) {
		 				this.list.clear();
		 				ExpjMessage emsg = new ExpjMessage("ZZ01119", "" + maxLine);
						msgStruct.addError(emsg); // エラーメッセージとして登録
						sysLog.warning(emsg, getsysUSER_CD()); // エラー内容

		 				if (list != null && list.size() > 0) {
		 					list.clear();
		 				}
		 				return;
		 			}
				}
				//明細番号最大値を取得
				List listMax = entity.mSelectMAX_DETAIL_NO.read(conn, struct);
				if (listMax.size() > 0) {
					struct.seth_MAX_DETAL_NO(((KM0020010Struct)listMax.get(0)).geth_MAX_DETAL_NO()); //明細番号最大値(非表示)
				}
				//見積明細の取得
				list = entity.mSelectDETAIL.read(conn, struct);
				if (listHead.size() > 0) {
					KM0020010Struct TempStruct;
					for (int i = 0; i < this.list.size(); i++) {
						TempStruct = (KM0020010Struct)list.get(i);
						TempStruct.setl_CUR_UNIT(struct.getCUR_UNIT()); //[通貨].“通貨単位”
						TempStruct.setl_ESTIMATE_NAME(this.multcombo("ESTIMATE_TYPE",TempStruct.getl_ESTIMATE_TYP())); //[見積明細].“手配品目種”
						TempStruct.setl_SPEC_CLASS1_NAME(this.multcombo("SPEC_CLASS_01",TempStruct.getl_SPEC_CLASS1_TYP())); //[見積明細].“製品選択1”
						TempStruct.setl_SPEC_CLASS2_NAME(this.multcombo("SPEC_CLASS_02",TempStruct.getl_SPEC_CLASS2_TYP())); //[見積明細].“製品選択2”
						TempStruct.setl_SPEC_SELECT1_NAME(this.multcombo("SPEC_SELECT_01",TempStruct.getl_SPEC_SELECT1_TYP())); //[見積明細].“仕様選択1”
						TempStruct.setl_SPEC_SELECT2_NAME(this.multcombo("SPEC_SELECT_02",TempStruct.getl_SPEC_SELECT2_TYP())); //[見積明細].“仕様選択2”
						TempStruct.setl_SPEC_SELECT3_NAME(this.multcombo("SPEC_SELECT_03",TempStruct.getl_SPEC_SELECT3_TYP())); //[見積明細].“仕様選択3”
						TempStruct.setl_SPEC_SELECT4_NAME(this.multcombo("SPEC_SELECT_04",TempStruct.getl_SPEC_SELECT4_TYP())); //[見積明細].“仕様選択4”
						TempStruct.setl_FLAG("0"); //登録更新フラグ(非表示)
						//[画面].“得意先コード”(非表示)　≠ [得意先].“得意先コード”の場合、“得意先品目番号”=null、“得意先品目名称”=null
						if (!struct.getQUOTE_CUST_CD().equals(struct.geth_CUST_CD())){
							TempStruct.setl_CUST_ITEM_CD(null);
							TempStruct.setl_CUST_ITEM_NAME(null);
						}
					}
				}
			}
			if (list != null){
				struct.setLIST_CNT(Integer.toString(list.size()));
			}else{
				struct.setLIST_CNT("0");
			}
		} catch(SQLException e) {
			e.printStackTrace();
			// エラー処理を記述してください。
			setSqlExceptionMsg(e);
		}
                //}}user_implement_dev:<controlQ_Select>
		logger.exiting("KM0020010Control"+":USER="+struct.getsUser_ID(),"controlQ_Select");

		return;
	}

	/**
	 * 行複写ボタン押下時に実行される処理です。
	 *
	 */
	public void controlcopy() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0020");
		logger.entering("KM0020010Control"+":USER="+struct.getsUser_ID(),"controlcopy");
			//{{user_implement_dev:<controlcopy>
			// TODO: ユーザ定義のコードを記述してください
		try {
			int listCnt = 0;
			 // 表示最大行数制限処理
			if(struct.getROW_COUNT() != null){
				int maxLine = Integer.parseInt(struct.getROW_COUNT());
				if (list != null){
					listCnt = list.size();
				}
				if (listCnt + 1 > maxLine) {
					ExpjMessage emsg = new ExpjMessage("ZZ01119", "" + maxLine);
					msgStruct.addError(emsg); // エラーメッセージとして登録
					sysLog.warning(emsg, getsysUSER_CD()); // エラー内容
	 				return;
	 			}
			}
			//明細番号 = メイン[画面].“明細番号最大値(非表示)”+1
			struct.setl_DETAL_NO(Calculate.add(struct.geth_MAX_DETAL_NO(), "1"));
			// キーを保持
			_keyStruct.keycopy(struct);
			struct.seth_CALLBUTTON("1");
		} catch(Exception e) {
			e.printStackTrace();
			// エラー処理を記述してください。
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());//致命的エラー エラー内容
			ExpjException ee = new ExpjException(e, emsg); // エクセプションを生成
			throw ee;
		}
                //}}user_implement_dev:<controlcopy>
		logger.exiting("KM0020010Control"+":USER="+struct.getsUser_ID(),"controlcopy");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0020");
		logger.entering("KM0020010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("KM0020010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0020");
		logger.entering("KM0020010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
			// TODO: ユーザ定義のコードを記述してください
			// データベースへのアクセスを行う場合は、このtry catch文のコメントを外してください。
		try{
			//画面処理件数を取得する
			ScreenParam sp = new ScreenParam(this.getClass());
		    int maxLine = sp.getMaxLine(conn, 10);
		    if (maxLine != 0){
				struct.setROW_COUNT(String.valueOf(maxLine));
		    }else{
				struct.setROW_COUNT(null);
		    }
		    //業務日付 と 日付計算用工場コード の取得
		    List listDate = entity.mSelectBUSINESS_DATE.read(conn,struct);
			if(listDate == null || listDate.size() != 1){
				//取得できなかった場合
				//エラーメッセージ出力
				ExpjMessage emsg = new ExpjMessage("KQ00026");
				msgStruct.addError(emsg);	// エラーメッセージとして登録
				sysLog.severe(emsg, getsysUSER_CD()); //エラー内容
				ExpjException ee = new ExpjException(emsg);
				throw ee;
			}else{
				struct.setBUSINESS_DATE(((KM0020010Struct)listDate.get(0)).getBUSINESS_DATE());
			}
			//邦貨コードを取得する。
		    List listHomeCur = entity.mSelectCUR.read(conn,struct);
			if(listHomeCur == null || listHomeCur.size() != 1){
				//取得できなかった場合
				//エラーメッセージ出力
				ExpjMessage emsg = new ExpjMessage("KQ00041");
				msgStruct.addError(emsg);	// エラーメッセージとして登録
				sysLog.severe(emsg, getsysUSER_CD()); //エラー内容
				ExpjException ee = new ExpjException(emsg);
				throw ee;
			}else{
				struct.setHOME_CUR_CD(((KM0020010Struct)listHomeCur.get(0)).getHOME_CUR_CD());
			}
			// 会社コードの取得
			List listCompanyCd = entity.mSelectSYS_MY_COMPANY.read(conn,struct);
			if(listCompanyCd == null || listCompanyCd.size() != 1){
				//会社情報が無い/複数件
				//エラーメッセージ出力
				ExpjMessage emsg = new ExpjMessage("KQ00039");
				msgStruct.addError(emsg);	// エラーメッセージとして登録
				sysLog.severe(emsg, getsysUSER_CD()); //エラー内容
				ExpjException ee = new ExpjException(emsg);
				throw ee;
			}else{
				struct.setCOMPANY_CD(((KM0020010Struct)listCompanyCd.get(0)).getCOMPANY_CD());
			}
			//見積ステータス   0:見積中
			struct.setESTIMATE_STAT(this.multcombo("ESTIMATE_STAT","0")); 
			struct.setESTIMATE_ST("0");
			//見積日   業務運用日
			struct.setESTIMATE_DATE(struct.getBUSINESS_DATE()); 
			//明細番号最大値(非表示) 0
			struct.seth_MAX_DETAL_NO("0"); 
			struct.setLIST_CNT("0");
			struct.seth_CALLBUTTON("0");
			// 画面遷移の呼び出しだったら、Structに画面遷移キーを設定してcontrolSelect()を呼び出す
			if ( isScreenMove() == true ) {
				struct.setPROJECT_CD(getProjectCd());
				struct.setESTIMATE_NO(getEstimateNo());
				// 検索のコントロールメソッドを呼び出します。
				controlSelect();
			}

			// データベースへのアクセスを行う場合は、このtry catch文のコメントを外してください。
		} catch(SQLException e) {
//			e.printStackTrace();
			// エラー処理を記述してください。
			setSqlExceptionMsg(e); 
		}

                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("KM0020010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * イベントハンドラの前処理です。
	 *
	 * @param buttun ボタン名
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0020");
		logger.entering("KM0020010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");
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
			try{
			    ComboBox comboController = new ComboBox(conn, sysUSER_CD);
			    ComboStruct ESTIMATE_TYPE = comboController.getData("ESTIMATE_TYPE");
			    struct.setList_l_ESTIMATE_TYP_val(ESTIMATE_TYPE.getValList());
			    struct.setList_l_ESTIMATE_TYP_name(ESTIMATE_TYPE.getExplanList());
			    
			    ComboStruct SPEC_CLASS1 = comboController.getData("SPEC_CLASS_01");
			    struct.setList_l_SPEC_CLASS1_TYP_val(SPEC_CLASS1.getValList());
			    struct.setList_l_SPEC_CLASS1_TYP_name(SPEC_CLASS1.getExplanList());
			    
			    ComboStruct SPEC_CLASS2 = comboController.getData("SPEC_CLASS_02");
			    struct.setList_l_SPEC_CLASS2_TYP_val(SPEC_CLASS2.getValList());
			    struct.setList_l_SPEC_CLASS2_TYP_name(SPEC_CLASS2.getExplanList());
			    
			    ComboStruct SPEC_SELECT1 = comboController.getData("SPEC_SELECT_01");
			    struct.setList_l_SPEC_SELECT1_TYP_val(SPEC_SELECT1.getValList());
			    struct.setList_l_SPEC_SELECT1_TYP_name(SPEC_SELECT1.getExplanList());
			    
			    ComboStruct SPEC_SELECT2 = comboController.getData("SPEC_SELECT_02");
			    struct.setList_l_SPEC_SELECT2_TYP_val(SPEC_SELECT2.getValList());
			    struct.setList_l_SPEC_SELECT2_TYP_name(SPEC_SELECT2.getExplanList());
			    
			    ComboStruct SPEC_SELECT3 = comboController.getData("SPEC_SELECT_03");
			    struct.setList_l_SPEC_SELECT3_TYP_val(SPEC_SELECT3.getValList());
			    struct.setList_l_SPEC_SELECT3_TYP_name(SPEC_SELECT3.getExplanList());
			    
			    ComboStruct SPEC_SELECT4 = comboController.getData("SPEC_SELECT_04");
			    struct.setList_l_SPEC_SELECT4_TYP_val(SPEC_SELECT4.getValList());
			    struct.setList_l_SPEC_SELECT4_TYP_name(SPEC_SELECT4.getExplanList());
			} catch(SQLException e) {
				e.printStackTrace();
			// エラー処理を記述してください。
			}
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("KM0020010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("Total") ) {
				controlTotal();
			} else if( button.equals("append") ) {
				controlappend();
			} else if( button.equals("modify") ) {
				controlmodify();
			} else if( button.equals("erase") ) {
				controlerase();
			} else if( button.equals("print") ) {
				controlprint();
			} else if( button.equals("insert") ) {
				controlinsert();
			} else if( button.equals("update") ) {
				controlupdate();
			} else if( button.equals("delete") ) {
				controldelete();
			} else if( button.equals("Clear") ) {
				controlClear();
			} else if( button.equals("Close") ) {
				controlClose();
			} else if( button.equals("SelectUnitCost") ) {
				controlSelectUnitCost();
			} else if( button.equals("LcConversion") ) {
				controlLcConversion();
			} else if( button.equals("insertSub1") ) {
				controlinsertSub1();
			} else if( button.equals("updateSub1") ) {
				controlupdateSub1();
			} else if( button.equals("cancelSub1") ) {
				controlcancelSub1();
			} else if( button.equals("Q_Select") ) {
				controlQ_Select();
			} else if( button.equals("copy") ) {
				controlcopy();
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
//			throw new FoundationException("KM0020010Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KM0020010-E999","CSVの出力処理"));
			throw new FoundationException("KM0020010Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KM0020010-E999","システム日付の取得処理"));
				throw new FoundationException("KM0020010Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KM0020010-E999","コントロールのイベント処理"));
			throw new FoundationException("KM0020010Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected KM0020010Entity entity;
	protected KM0020010Struct struct;
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

		entity = new KM0020010Entity();
		struct = new KM0020010Struct();

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
	 * KM0020010クラスの標準コンストラクタ
	 */
	public KM0020010Control() throws BusinessProcessException, FoundationException
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
				KM0020010Struct key = (KM0020010Struct)keyList.get(j);
				// メッセージキーを作成する
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("l_CUR_UNIT") && key.getl_CUR_UNIT() != null) {
					msgKey.setKeyValue("l_CUR_UNIT", key.getl_CUR_UNIT());
				}
				if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE") && key.getDOWNLOAD_FILE() != null) {
					msgKey.setKeyValue("DOWNLOAD_FILE", key.getDOWNLOAD_FILE());
				}
				if(msgKeyType.containsKeyColumn("l_FLAG") && key.getl_FLAG() != null) {
					msgKey.setKeyValue("l_FLAG", key.getl_FLAG());
				}
				if(msgKeyType.containsKeyColumn("QUOTE_ESTIMATE_NO") && key.getQUOTE_ESTIMATE_NO() != null) {
					msgKey.setKeyValue("QUOTE_ESTIMATE_NO", key.getQUOTE_ESTIMATE_NO());
				}
				if(msgKeyType.containsKeyColumn("l_ESTIMATE_NAME") && key.getl_ESTIMATE_NAME() != null) {
					msgKey.setKeyValue("l_ESTIMATE_NAME", key.getl_ESTIMATE_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_SPEC_CLASS1_NAME") && key.getl_SPEC_CLASS1_NAME() != null) {
					msgKey.setKeyValue("l_SPEC_CLASS1_NAME", key.getl_SPEC_CLASS1_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_SPEC_CLASS2_NAME") && key.getl_SPEC_CLASS2_NAME() != null) {
					msgKey.setKeyValue("l_SPEC_CLASS2_NAME", key.getl_SPEC_CLASS2_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_SPEC_SELECT1_NAME") && key.getl_SPEC_SELECT1_NAME() != null) {
					msgKey.setKeyValue("l_SPEC_SELECT1_NAME", key.getl_SPEC_SELECT1_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_SPEC_SELECT2_NAME") && key.getl_SPEC_SELECT2_NAME() != null) {
					msgKey.setKeyValue("l_SPEC_SELECT2_NAME", key.getl_SPEC_SELECT2_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_SPEC_SELECT3_NAME") && key.getl_SPEC_SELECT3_NAME() != null) {
					msgKey.setKeyValue("l_SPEC_SELECT3_NAME", key.getl_SPEC_SELECT3_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_SPEC_SELECT4_NAME") && key.getl_SPEC_SELECT4_NAME() != null) {
					msgKey.setKeyValue("l_SPEC_SELECT4_NAME", key.getl_SPEC_SELECT4_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_ESTIMATE_TYP_name") && key.getl_ESTIMATE_TYP_name() != null) {
					msgKey.setKeyValue("l_ESTIMATE_TYP_name", key.getl_ESTIMATE_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("l_ESTIMATE_TYP_val") && key.getl_ESTIMATE_TYP_val() != null) {
					msgKey.setKeyValue("l_ESTIMATE_TYP_val", key.getl_ESTIMATE_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("l_SPEC_CLASS1_TYP_name") && key.getl_SPEC_CLASS1_TYP_name() != null) {
					msgKey.setKeyValue("l_SPEC_CLASS1_TYP_name", key.getl_SPEC_CLASS1_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("l_SPEC_CLASS1_TYP_val") && key.getl_SPEC_CLASS1_TYP_val() != null) {
					msgKey.setKeyValue("l_SPEC_CLASS1_TYP_val", key.getl_SPEC_CLASS1_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("l_SPEC_CLASS2_TYP_name") && key.getl_SPEC_CLASS2_TYP_name() != null) {
					msgKey.setKeyValue("l_SPEC_CLASS2_TYP_name", key.getl_SPEC_CLASS2_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("l_SPEC_CLASS2_TYP_val") && key.getl_SPEC_CLASS2_TYP_val() != null) {
					msgKey.setKeyValue("l_SPEC_CLASS2_TYP_val", key.getl_SPEC_CLASS2_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("l_SPEC_SELECT1_TYP_name") && key.getl_SPEC_SELECT1_TYP_name() != null) {
					msgKey.setKeyValue("l_SPEC_SELECT1_TYP_name", key.getl_SPEC_SELECT1_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("l_SPEC_SELECT1_TYP_val") && key.getl_SPEC_SELECT1_TYP_val() != null) {
					msgKey.setKeyValue("l_SPEC_SELECT1_TYP_val", key.getl_SPEC_SELECT1_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("l_SPEC_SELECT2_TYP_name") && key.getl_SPEC_SELECT2_TYP_name() != null) {
					msgKey.setKeyValue("l_SPEC_SELECT2_TYP_name", key.getl_SPEC_SELECT2_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("l_SPEC_SELECT2_TYP_val") && key.getl_SPEC_SELECT2_TYP_val() != null) {
					msgKey.setKeyValue("l_SPEC_SELECT2_TYP_val", key.getl_SPEC_SELECT2_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("l_SPEC_SELECT3_TYP_name") && key.getl_SPEC_SELECT3_TYP_name() != null) {
					msgKey.setKeyValue("l_SPEC_SELECT3_TYP_name", key.getl_SPEC_SELECT3_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("l_SPEC_SELECT3_TYP_val") && key.getl_SPEC_SELECT3_TYP_val() != null) {
					msgKey.setKeyValue("l_SPEC_SELECT3_TYP_val", key.getl_SPEC_SELECT3_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("l_SPEC_SELECT4_TYP_name") && key.getl_SPEC_SELECT4_TYP_name() != null) {
					msgKey.setKeyValue("l_SPEC_SELECT4_TYP_name", key.getl_SPEC_SELECT4_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("l_SPEC_SELECT4_TYP_val") && key.getl_SPEC_SELECT4_TYP_val() != null) {
					msgKey.setKeyValue("l_SPEC_SELECT4_TYP_val", key.getl_SPEC_SELECT4_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("LIST_CNT") && key.getLIST_CNT() != null) {
					msgKey.setKeyValue("LIST_CNT", key.getLIST_CNT());
				}
				if(msgKeyType.containsKeyColumn("h_ESTIMATE_NO") && key.geth_ESTIMATE_NO() != null) {
					msgKey.setKeyValue("h_ESTIMATE_NO", key.geth_ESTIMATE_NO());
				}
				if(msgKeyType.containsKeyColumn("h_UNOFFICIAL_RECEIPT_FLAG") && key.geth_UNOFFICIAL_RECEIPT_FLAG() != null) {
					msgKey.setKeyValue("h_UNOFFICIAL_RECEIPT_FLAG", key.geth_UNOFFICIAL_RECEIPT_FLAG());
				}
				if(msgKeyType.containsKeyColumn("h_PROJECT_STAT") && key.geth_PROJECT_STAT() != null) {
					msgKey.setKeyValue("h_PROJECT_STAT", key.geth_PROJECT_STAT());
				}
				if(msgKeyType.containsKeyColumn("h_CALLBUTTON") && key.geth_CALLBUTTON() != null) {
					msgKey.setKeyValue("h_CALLBUTTON", key.geth_CALLBUTTON());
				}
				if(msgKeyType.containsKeyColumn("PROJECT_NAME") && key.getPROJECT_NAME() != null) {
					msgKey.setKeyValue("PROJECT_NAME", key.getPROJECT_NAME());
				}
				if(msgKeyType.containsKeyColumn("h_CUST_CD") && key.geth_CUST_CD() != null) {
					msgKey.setKeyValue("h_CUST_CD", key.geth_CUST_CD());
				}
				if(msgKeyType.containsKeyColumn("ES_ORG_CD") && key.getES_ORG_CD() != null) {
					msgKey.setKeyValue("ES_ORG_CD", key.getES_ORG_CD());
				}
				if(msgKeyType.containsKeyColumn("ES_USER_CD") && key.getES_USER_CD() != null) {
					msgKey.setKeyValue("ES_USER_CD", key.getES_USER_CD());
				}
				if(msgKeyType.containsKeyColumn("ORG_NAME") && key.getORG_NAME() != null) {
					msgKey.setKeyValue("ORG_NAME", key.getORG_NAME());
				}
				if(msgKeyType.containsKeyColumn("USER_NAME") && key.getUSER_NAME() != null) {
					msgKey.setKeyValue("USER_NAME", key.getUSER_NAME());
				}
				if(msgKeyType.containsKeyColumn("PROJECT_STAT") && key.getPROJECT_STAT() != null) {
					msgKey.setKeyValue("PROJECT_STAT", key.getPROJECT_STAT());
				}
				if(msgKeyType.containsKeyColumn("MODIFY_COUNT_PJ") && key.getMODIFY_COUNT_PJ() != null) {
					msgKey.setKeyValue("MODIFY_COUNT_PJ", key.getMODIFY_COUNT_PJ());
				}
				if(msgKeyType.containsKeyColumn("PROJECT_CD") && key.getPROJECT_CD() != null) {
					msgKey.setKeyValue("PROJECT_CD", key.getPROJECT_CD());
				}
				if(msgKeyType.containsKeyColumn("COMPANY_CD") && key.getCOMPANY_CD() != null) {
					msgKey.setKeyValue("COMPANY_CD", key.getCOMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("CUST_NAME") && key.getCUST_NAME() != null) {
					msgKey.setKeyValue("CUST_NAME", key.getCUST_NAME());
				}
				if(msgKeyType.containsKeyColumn("h_CUR_CD") && key.geth_CUR_CD() != null) {
					msgKey.setKeyValue("h_CUR_CD", key.geth_CUR_CD());
				}
				if(msgKeyType.containsKeyColumn("EXCH_TYP") && key.getEXCH_TYP() != null) {
					msgKey.setKeyValue("EXCH_TYP", key.getEXCH_TYP());
				}
				if(msgKeyType.containsKeyColumn("DETAIL_ROUND_TYP") && key.getDETAIL_ROUND_TYP() != null) {
					msgKey.setKeyValue("DETAIL_ROUND_TYP", key.getDETAIL_ROUND_TYP());
				}
				if(msgKeyType.containsKeyColumn("CUR_UNIT") && key.getCUR_UNIT() != null) {
					msgKey.setKeyValue("CUR_UNIT", key.getCUR_UNIT());
				}
				if(msgKeyType.containsKeyColumn("h_PROJECT_CD") && key.geth_PROJECT_CD() != null) {
					msgKey.setKeyValue("h_PROJECT_CD", key.geth_PROJECT_CD());
				}
				if(msgKeyType.containsKeyColumn("ESTIMATE_STAT") && key.getESTIMATE_STAT() != null) {
					msgKey.setKeyValue("ESTIMATE_STAT", key.getESTIMATE_STAT());
				}
				if(msgKeyType.containsKeyColumn("UNOFFICIAL_RECEIPT_FLG") && key.getUNOFFICIAL_RECEIPT_FLG() != null) {
					msgKey.setKeyValue("UNOFFICIAL_RECEIPT_FLG", key.getUNOFFICIAL_RECEIPT_FLG());
				}
				if(msgKeyType.containsKeyColumn("ESTIMATE_DATE") && key.getESTIMATE_DATE() != null) {
					msgKey.setKeyValue("ESTIMATE_DATE", key.getESTIMATE_DATE());
				}
				if(msgKeyType.containsKeyColumn("ESTIMATE_AMOUNT") && key.getESTIMATE_AMOUNT() != null) {
					msgKey.setKeyValue("ESTIMATE_AMOUNT", key.getESTIMATE_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("ESTIMATE_AMOUNT_JPN") && key.getESTIMATE_AMOUNT_JPN() != null) {
					msgKey.setKeyValue("ESTIMATE_AMOUNT_JPN", key.getESTIMATE_AMOUNT_JPN());
				}
				if(msgKeyType.containsKeyColumn("ES_COMMET1") && key.getES_COMMET1() != null) {
					msgKey.setKeyValue("ES_COMMET1", key.getES_COMMET1());
				}
				if(msgKeyType.containsKeyColumn("ES_COMMET2") && key.getES_COMMET2() != null) {
					msgKey.setKeyValue("ES_COMMET2", key.getES_COMMET2());
				}
				if(msgKeyType.containsKeyColumn("ES_COMMET4") && key.getES_COMMET4() != null) {
					msgKey.setKeyValue("ES_COMMET4", key.getES_COMMET4());
				}
				if(msgKeyType.containsKeyColumn("ES_COMMET3") && key.getES_COMMET3() != null) {
					msgKey.setKeyValue("ES_COMMET3", key.getES_COMMET3());
				}
				if(msgKeyType.containsKeyColumn("ES_COMMET5") && key.getES_COMMET5() != null) {
					msgKey.setKeyValue("ES_COMMET5", key.getES_COMMET5());
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
				if(msgKeyType.containsKeyColumn("ZIP_CD") && key.getZIP_CD() != null) {
					msgKey.setKeyValue("ZIP_CD", key.getZIP_CD());
				}
				if(msgKeyType.containsKeyColumn("ADDRESS_1") && key.getADDRESS_1() != null) {
					msgKey.setKeyValue("ADDRESS_1", key.getADDRESS_1());
				}
				if(msgKeyType.containsKeyColumn("ADDRESS_2") && key.getADDRESS_2() != null) {
					msgKey.setKeyValue("ADDRESS_2", key.getADDRESS_2());
				}
				if(msgKeyType.containsKeyColumn("TEL") && key.getTEL() != null) {
					msgKey.setKeyValue("TEL", key.getTEL());
				}
				if(msgKeyType.containsKeyColumn("MODIFY_COUNT_ES") && key.getMODIFY_COUNT_ES() != null) {
					msgKey.setKeyValue("MODIFY_COUNT_ES", key.getMODIFY_COUNT_ES());
				}
				if(msgKeyType.containsKeyColumn("l_DETAL_NO") && key.getl_DETAL_NO() != null) {
					msgKey.setKeyValue("l_DETAL_NO", key.getl_DETAL_NO());
				}
				if(msgKeyType.containsKeyColumn("l_ESTIMATE_TYP") && key.getl_ESTIMATE_TYP() != null) {
					msgKey.setKeyValue("l_ESTIMATE_TYP", key.getl_ESTIMATE_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_CUST_ITEM_CD") && key.getl_CUST_ITEM_CD() != null) {
					msgKey.setKeyValue("l_CUST_ITEM_CD", key.getl_CUST_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ITEM_NAME") && key.getl_ITEM_NAME() != null) {
					msgKey.setKeyValue("l_ITEM_NAME", key.getl_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_DESINATED_DLV_DATE") && key.getl_DESINATED_DLV_DATE() != null) {
					msgKey.setKeyValue("l_DESINATED_DLV_DATE", key.getl_DESINATED_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_ESTIMATE_QTY") && key.getl_ESTIMATE_QTY() != null) {
					msgKey.setKeyValue("l_ESTIMATE_QTY", key.getl_ESTIMATE_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_UNIT_CD") && key.getl_UNIT_CD() != null) {
					msgKey.setKeyValue("l_UNIT_CD", key.getl_UNIT_CD());
				}
				if(msgKeyType.containsKeyColumn("l_UNIT_PRICE") && key.getl_UNIT_PRICE() != null) {
					msgKey.setKeyValue("l_UNIT_PRICE", key.getl_UNIT_PRICE());
				}
				if(msgKeyType.containsKeyColumn("l_DISCOUNT_PRICE") && key.getl_DISCOUNT_PRICE() != null) {
					msgKey.setKeyValue("l_DISCOUNT_PRICE", key.getl_DISCOUNT_PRICE());
				}
				if(msgKeyType.containsKeyColumn("l_ESTIMATE_UNIT_PRICE") && key.getl_ESTIMATE_UNIT_PRICE() != null) {
					msgKey.setKeyValue("l_ESTIMATE_UNIT_PRICE", key.getl_ESTIMATE_UNIT_PRICE());
				}
				if(msgKeyType.containsKeyColumn("l_AMOUNT") && key.getl_AMOUNT() != null) {
					msgKey.setKeyValue("l_AMOUNT", key.getl_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("l_DISCOUNT_AMOUNT") && key.getl_DISCOUNT_AMOUNT() != null) {
					msgKey.setKeyValue("l_DISCOUNT_AMOUNT", key.getl_DISCOUNT_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("l_ESTIMATE_AMOUNT") && key.getl_ESTIMATE_AMOUNT() != null) {
					msgKey.setKeyValue("l_ESTIMATE_AMOUNT", key.getl_ESTIMATE_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("l_ESTIMATE_AMOUNT_JPN") && key.getl_ESTIMATE_AMOUNT_JPN() != null) {
					msgKey.setKeyValue("l_ESTIMATE_AMOUNT_JPN", key.getl_ESTIMATE_AMOUNT_JPN());
				}
				if(msgKeyType.containsKeyColumn("l_ESTIMATE_GAIN") && key.getl_ESTIMATE_GAIN() != null) {
					msgKey.setKeyValue("l_ESTIMATE_GAIN", key.getl_ESTIMATE_GAIN());
				}
				if(msgKeyType.containsKeyColumn("l_ES_COST_MATERIAL") && key.getl_ES_COST_MATERIAL() != null) {
					msgKey.setKeyValue("l_ES_COST_MATERIAL", key.getl_ES_COST_MATERIAL());
				}
				if(msgKeyType.containsKeyColumn("l_ES_COST_PROCESS") && key.getl_ES_COST_PROCESS() != null) {
					msgKey.setKeyValue("l_ES_COST_PROCESS", key.getl_ES_COST_PROCESS());
				}
				if(msgKeyType.containsKeyColumn("l_ES_COST_OUTSOUCE") && key.getl_ES_COST_OUTSOUCE() != null) {
					msgKey.setKeyValue("l_ES_COST_OUTSOUCE", key.getl_ES_COST_OUTSOUCE());
				}
				if(msgKeyType.containsKeyColumn("l_ES_COST_ETC") && key.getl_ES_COST_ETC() != null) {
					msgKey.setKeyValue("l_ES_COST_ETC", key.getl_ES_COST_ETC());
				}
				if(msgKeyType.containsKeyColumn("l_ES_COST_SERVICE") && key.getl_ES_COST_SERVICE() != null) {
					msgKey.setKeyValue("l_ES_COST_SERVICE", key.getl_ES_COST_SERVICE());
				}
				if(msgKeyType.containsKeyColumn("l_ES_COST_ALL") && key.getl_ES_COST_ALL() != null) {
					msgKey.setKeyValue("l_ES_COST_ALL", key.getl_ES_COST_ALL());
				}
				if(msgKeyType.containsKeyColumn("l_SPEC_CLASS1_TYP") && key.getl_SPEC_CLASS1_TYP() != null) {
					msgKey.setKeyValue("l_SPEC_CLASS1_TYP", key.getl_SPEC_CLASS1_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_SPEC_CLASS2_TYP") && key.getl_SPEC_CLASS2_TYP() != null) {
					msgKey.setKeyValue("l_SPEC_CLASS2_TYP", key.getl_SPEC_CLASS2_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_SPEC_SELECT1_TYP") && key.getl_SPEC_SELECT1_TYP() != null) {
					msgKey.setKeyValue("l_SPEC_SELECT1_TYP", key.getl_SPEC_SELECT1_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_SPEC_SELECT2_TYP") && key.getl_SPEC_SELECT2_TYP() != null) {
					msgKey.setKeyValue("l_SPEC_SELECT2_TYP", key.getl_SPEC_SELECT2_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_SPEC_SELECT3_TYP") && key.getl_SPEC_SELECT3_TYP() != null) {
					msgKey.setKeyValue("l_SPEC_SELECT3_TYP", key.getl_SPEC_SELECT3_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_SPEC_SELECT4_TYP") && key.getl_SPEC_SELECT4_TYP() != null) {
					msgKey.setKeyValue("l_SPEC_SELECT4_TYP", key.getl_SPEC_SELECT4_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_REMARKS") && key.getl_REMARKS() != null) {
					msgKey.setKeyValue("l_REMARKS", key.getl_REMARKS());
				}
				if(msgKeyType.containsKeyColumn("l_UNIT_COST") && key.getl_UNIT_COST() != null) {
					msgKey.setKeyValue("l_UNIT_COST", key.getl_UNIT_COST());
				}
				if(msgKeyType.containsKeyColumn("l_CUST_ITEM_NAME") && key.getl_CUST_ITEM_NAME() != null) {
					msgKey.setKeyValue("l_CUST_ITEM_NAME", key.getl_CUST_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("h_MAX_DETAL_NO") && key.geth_MAX_DETAL_NO() != null) {
					msgKey.setKeyValue("h_MAX_DETAL_NO", key.geth_MAX_DETAL_NO());
				}
				if(msgKeyType.containsKeyColumn("l_COUNT") && key.getl_COUNT() != null) {
					msgKey.setKeyValue("l_COUNT", key.getl_COUNT());
				}
				if(msgKeyType.containsKeyColumn("ROW_COUNT") && key.getROW_COUNT() != null) {
					msgKey.setKeyValue("ROW_COUNT", key.getROW_COUNT());
				}
				if(msgKeyType.containsKeyColumn("BUSINESS_DATE") && key.getBUSINESS_DATE() != null) {
					msgKey.setKeyValue("BUSINESS_DATE", key.getBUSINESS_DATE());
				}
				if(msgKeyType.containsKeyColumn("HOME_CUR_CD") && key.getHOME_CUR_CD() != null) {
					msgKey.setKeyValue("HOME_CUR_CD", key.getHOME_CUR_CD());
				}
				if(msgKeyType.containsKeyColumn("QUOTE_CUST_CD") && key.getQUOTE_CUST_CD() != null) {
					msgKey.setKeyValue("QUOTE_CUST_CD", key.getQUOTE_CUST_CD());
				}
				if(msgKeyType.containsKeyColumn("QUOTE_CUR_CD") && key.getQUOTE_CUR_CD() != null) {
					msgKey.setKeyValue("QUOTE_CUR_CD", key.getQUOTE_CUR_CD());
				}
				if(msgKeyType.containsKeyColumn("QUOTE_CUR_UNIT") && key.getQUOTE_CUR_UNIT() != null) {
					msgKey.setKeyValue("QUOTE_CUR_UNIT", key.getQUOTE_CUR_UNIT());
				}
				if(msgKeyType.containsKeyColumn("QUOTE_PROJECT_CD") && key.getQUOTE_PROJECT_CD() != null) {
					msgKey.setKeyValue("QUOTE_PROJECT_CD", key.getQUOTE_PROJECT_CD());
				}
				if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP") && key.getUNIT_QTY_TYP() != null) {
					msgKey.setKeyValue("UNIT_QTY_TYP", key.getUNIT_QTY_TYP());
				}
				if(msgKeyType.containsKeyColumn("UNIT_COST") && key.getUNIT_COST() != null) {
					msgKey.setKeyValue("UNIT_COST", key.getUNIT_COST());
				}
				if(msgKeyType.containsKeyColumn("ESTIMATE_NO") && key.getESTIMATE_NO() != null) {
					msgKey.setKeyValue("ESTIMATE_NO", key.getESTIMATE_NO());
				}
				if(msgKeyType.containsKeyColumn("UNOFFICIAL_RECEIPT_FLAG") && key.getUNOFFICIAL_RECEIPT_FLAG() != null) {
					msgKey.setKeyValue("UNOFFICIAL_RECEIPT_FLAG", key.getUNOFFICIAL_RECEIPT_FLAG());
				}
				if(msgKeyType.containsKeyColumn("ESTIMATE_ST") && key.getESTIMATE_ST() != null) {
					msgKey.setKeyValue("ESTIMATE_ST", key.getESTIMATE_ST());
				}
				if(msgKeyType.containsKeyColumn("USER") && key.getUSER() != null) {
					msgKey.setKeyValue("USER", key.getUSER());
				}
				if(msgKeyType.containsKeyColumn("PROGRAM_NAME") && key.getPROGRAM_NAME() != null) {
					msgKey.setKeyValue("PROGRAM_NAME", key.getPROGRAM_NAME());
				}
				if(msgKeyType.containsKeyColumn("h_ESTIMATE_ST") && key.geth_ESTIMATE_ST() != null) {
					msgKey.setKeyValue("h_ESTIMATE_ST", key.geth_ESTIMATE_ST());
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
					KM0020010Struct key = new KM0020010Struct();
					if(msgKeyType.containsKeyColumn("l_CUR_UNIT")) {
						key.setl_CUR_UNIT(msgKey.getKeyValue("l_CUR_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE")) {
						key.setDOWNLOAD_FILE(msgKey.getKeyValue("DOWNLOAD_FILE"));
					}
					if(msgKeyType.containsKeyColumn("l_FLAG")) {
						key.setl_FLAG(msgKey.getKeyValue("l_FLAG"));
					}
					if(msgKeyType.containsKeyColumn("QUOTE_ESTIMATE_NO")) {
						key.setQUOTE_ESTIMATE_NO(msgKey.getKeyValue("QUOTE_ESTIMATE_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_ESTIMATE_NAME")) {
						key.setl_ESTIMATE_NAME(msgKey.getKeyValue("l_ESTIMATE_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_SPEC_CLASS1_NAME")) {
						key.setl_SPEC_CLASS1_NAME(msgKey.getKeyValue("l_SPEC_CLASS1_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_SPEC_CLASS2_NAME")) {
						key.setl_SPEC_CLASS2_NAME(msgKey.getKeyValue("l_SPEC_CLASS2_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_SPEC_SELECT1_NAME")) {
						key.setl_SPEC_SELECT1_NAME(msgKey.getKeyValue("l_SPEC_SELECT1_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_SPEC_SELECT2_NAME")) {
						key.setl_SPEC_SELECT2_NAME(msgKey.getKeyValue("l_SPEC_SELECT2_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_SPEC_SELECT3_NAME")) {
						key.setl_SPEC_SELECT3_NAME(msgKey.getKeyValue("l_SPEC_SELECT3_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_SPEC_SELECT4_NAME")) {
						key.setl_SPEC_SELECT4_NAME(msgKey.getKeyValue("l_SPEC_SELECT4_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_ESTIMATE_TYP_name")) {
						key.setl_ESTIMATE_TYP_name(msgKey.getKeyValue("l_ESTIMATE_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("l_ESTIMATE_TYP_val")) {
						key.setl_ESTIMATE_TYP_val(msgKey.getKeyValue("l_ESTIMATE_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("l_SPEC_CLASS1_TYP_name")) {
						key.setl_SPEC_CLASS1_TYP_name(msgKey.getKeyValue("l_SPEC_CLASS1_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("l_SPEC_CLASS1_TYP_val")) {
						key.setl_SPEC_CLASS1_TYP_val(msgKey.getKeyValue("l_SPEC_CLASS1_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("l_SPEC_CLASS2_TYP_name")) {
						key.setl_SPEC_CLASS2_TYP_name(msgKey.getKeyValue("l_SPEC_CLASS2_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("l_SPEC_CLASS2_TYP_val")) {
						key.setl_SPEC_CLASS2_TYP_val(msgKey.getKeyValue("l_SPEC_CLASS2_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("l_SPEC_SELECT1_TYP_name")) {
						key.setl_SPEC_SELECT1_TYP_name(msgKey.getKeyValue("l_SPEC_SELECT1_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("l_SPEC_SELECT1_TYP_val")) {
						key.setl_SPEC_SELECT1_TYP_val(msgKey.getKeyValue("l_SPEC_SELECT1_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("l_SPEC_SELECT2_TYP_name")) {
						key.setl_SPEC_SELECT2_TYP_name(msgKey.getKeyValue("l_SPEC_SELECT2_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("l_SPEC_SELECT2_TYP_val")) {
						key.setl_SPEC_SELECT2_TYP_val(msgKey.getKeyValue("l_SPEC_SELECT2_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("l_SPEC_SELECT3_TYP_name")) {
						key.setl_SPEC_SELECT3_TYP_name(msgKey.getKeyValue("l_SPEC_SELECT3_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("l_SPEC_SELECT3_TYP_val")) {
						key.setl_SPEC_SELECT3_TYP_val(msgKey.getKeyValue("l_SPEC_SELECT3_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("l_SPEC_SELECT4_TYP_name")) {
						key.setl_SPEC_SELECT4_TYP_name(msgKey.getKeyValue("l_SPEC_SELECT4_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("l_SPEC_SELECT4_TYP_val")) {
						key.setl_SPEC_SELECT4_TYP_val(msgKey.getKeyValue("l_SPEC_SELECT4_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("LIST_CNT")) {
						key.setLIST_CNT(msgKey.getKeyValue("LIST_CNT"));
					}
					if(msgKeyType.containsKeyColumn("h_ESTIMATE_NO")) {
						key.seth_ESTIMATE_NO(msgKey.getKeyValue("h_ESTIMATE_NO"));
					}
					if(msgKeyType.containsKeyColumn("h_UNOFFICIAL_RECEIPT_FLAG")) {
						key.seth_UNOFFICIAL_RECEIPT_FLAG(msgKey.getKeyValue("h_UNOFFICIAL_RECEIPT_FLAG"));
					}
					if(msgKeyType.containsKeyColumn("h_PROJECT_STAT")) {
						key.seth_PROJECT_STAT(msgKey.getKeyValue("h_PROJECT_STAT"));
					}
					if(msgKeyType.containsKeyColumn("h_CALLBUTTON")) {
						key.seth_CALLBUTTON(msgKey.getKeyValue("h_CALLBUTTON"));
					}
					if(msgKeyType.containsKeyColumn("PROJECT_NAME")) {
						key.setPROJECT_NAME(msgKey.getKeyValue("PROJECT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("h_CUST_CD")) {
						key.seth_CUST_CD(msgKey.getKeyValue("h_CUST_CD"));
					}
					if(msgKeyType.containsKeyColumn("ES_ORG_CD")) {
						key.setES_ORG_CD(msgKey.getKeyValue("ES_ORG_CD"));
					}
					if(msgKeyType.containsKeyColumn("ES_USER_CD")) {
						key.setES_USER_CD(msgKey.getKeyValue("ES_USER_CD"));
					}
					if(msgKeyType.containsKeyColumn("ORG_NAME")) {
						key.setORG_NAME(msgKey.getKeyValue("ORG_NAME"));
					}
					if(msgKeyType.containsKeyColumn("USER_NAME")) {
						key.setUSER_NAME(msgKey.getKeyValue("USER_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PROJECT_STAT")) {
						key.setPROJECT_STAT(msgKey.getKeyValue("PROJECT_STAT"));
					}
					if(msgKeyType.containsKeyColumn("MODIFY_COUNT_PJ")) {
						key.setMODIFY_COUNT_PJ(msgKey.getKeyValue("MODIFY_COUNT_PJ"));
					}
					if(msgKeyType.containsKeyColumn("PROJECT_CD")) {
						key.setPROJECT_CD(msgKey.getKeyValue("PROJECT_CD"));
					}
					if(msgKeyType.containsKeyColumn("COMPANY_CD")) {
						key.setCOMPANY_CD(msgKey.getKeyValue("COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("CUST_NAME")) {
						key.setCUST_NAME(msgKey.getKeyValue("CUST_NAME"));
					}
					if(msgKeyType.containsKeyColumn("h_CUR_CD")) {
						key.seth_CUR_CD(msgKey.getKeyValue("h_CUR_CD"));
					}
					if(msgKeyType.containsKeyColumn("EXCH_TYP")) {
						key.setEXCH_TYP(msgKey.getKeyValue("EXCH_TYP"));
					}
					if(msgKeyType.containsKeyColumn("DETAIL_ROUND_TYP")) {
						key.setDETAIL_ROUND_TYP(msgKey.getKeyValue("DETAIL_ROUND_TYP"));
					}
					if(msgKeyType.containsKeyColumn("CUR_UNIT")) {
						key.setCUR_UNIT(msgKey.getKeyValue("CUR_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("h_PROJECT_CD")) {
						key.seth_PROJECT_CD(msgKey.getKeyValue("h_PROJECT_CD"));
					}
					if(msgKeyType.containsKeyColumn("ESTIMATE_STAT")) {
						key.setESTIMATE_STAT(msgKey.getKeyValue("ESTIMATE_STAT"));
					}
					if(msgKeyType.containsKeyColumn("UNOFFICIAL_RECEIPT_FLG")) {
						key.setUNOFFICIAL_RECEIPT_FLG(msgKey.getKeyValue("UNOFFICIAL_RECEIPT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("ESTIMATE_DATE")) {
						key.setESTIMATE_DATE(msgKey.getKeyValue("ESTIMATE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("ESTIMATE_AMOUNT")) {
						key.setESTIMATE_AMOUNT(msgKey.getKeyValue("ESTIMATE_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("ESTIMATE_AMOUNT_JPN")) {
						key.setESTIMATE_AMOUNT_JPN(msgKey.getKeyValue("ESTIMATE_AMOUNT_JPN"));
					}
					if(msgKeyType.containsKeyColumn("ES_COMMET1")) {
						key.setES_COMMET1(msgKey.getKeyValue("ES_COMMET1"));
					}
					if(msgKeyType.containsKeyColumn("ES_COMMET2")) {
						key.setES_COMMET2(msgKey.getKeyValue("ES_COMMET2"));
					}
					if(msgKeyType.containsKeyColumn("ES_COMMET4")) {
						key.setES_COMMET4(msgKey.getKeyValue("ES_COMMET4"));
					}
					if(msgKeyType.containsKeyColumn("ES_COMMET3")) {
						key.setES_COMMET3(msgKey.getKeyValue("ES_COMMET3"));
					}
					if(msgKeyType.containsKeyColumn("ES_COMMET5")) {
						key.setES_COMMET5(msgKey.getKeyValue("ES_COMMET5"));
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
					if(msgKeyType.containsKeyColumn("ZIP_CD")) {
						key.setZIP_CD(msgKey.getKeyValue("ZIP_CD"));
					}
					if(msgKeyType.containsKeyColumn("ADDRESS_1")) {
						key.setADDRESS_1(msgKey.getKeyValue("ADDRESS_1"));
					}
					if(msgKeyType.containsKeyColumn("ADDRESS_2")) {
						key.setADDRESS_2(msgKey.getKeyValue("ADDRESS_2"));
					}
					if(msgKeyType.containsKeyColumn("TEL")) {
						key.setTEL(msgKey.getKeyValue("TEL"));
					}
					if(msgKeyType.containsKeyColumn("MODIFY_COUNT_ES")) {
						key.setMODIFY_COUNT_ES(msgKey.getKeyValue("MODIFY_COUNT_ES"));
					}
					if(msgKeyType.containsKeyColumn("l_DETAL_NO")) {
						key.setl_DETAL_NO(msgKey.getKeyValue("l_DETAL_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_ESTIMATE_TYP")) {
						key.setl_ESTIMATE_TYP(msgKey.getKeyValue("l_ESTIMATE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_CUST_ITEM_CD")) {
						key.setl_CUST_ITEM_CD(msgKey.getKeyValue("l_CUST_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ITEM_NAME")) {
						key.setl_ITEM_NAME(msgKey.getKeyValue("l_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_DESINATED_DLV_DATE")) {
						key.setl_DESINATED_DLV_DATE(msgKey.getKeyValue("l_DESINATED_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_ESTIMATE_QTY")) {
						key.setl_ESTIMATE_QTY(msgKey.getKeyValue("l_ESTIMATE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_UNIT_CD")) {
						key.setl_UNIT_CD(msgKey.getKeyValue("l_UNIT_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_UNIT_PRICE")) {
						key.setl_UNIT_PRICE(msgKey.getKeyValue("l_UNIT_PRICE"));
					}
					if(msgKeyType.containsKeyColumn("l_DISCOUNT_PRICE")) {
						key.setl_DISCOUNT_PRICE(msgKey.getKeyValue("l_DISCOUNT_PRICE"));
					}
					if(msgKeyType.containsKeyColumn("l_ESTIMATE_UNIT_PRICE")) {
						key.setl_ESTIMATE_UNIT_PRICE(msgKey.getKeyValue("l_ESTIMATE_UNIT_PRICE"));
					}
					if(msgKeyType.containsKeyColumn("l_AMOUNT")) {
						key.setl_AMOUNT(msgKey.getKeyValue("l_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("l_DISCOUNT_AMOUNT")) {
						key.setl_DISCOUNT_AMOUNT(msgKey.getKeyValue("l_DISCOUNT_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("l_ESTIMATE_AMOUNT")) {
						key.setl_ESTIMATE_AMOUNT(msgKey.getKeyValue("l_ESTIMATE_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("l_ESTIMATE_AMOUNT_JPN")) {
						key.setl_ESTIMATE_AMOUNT_JPN(msgKey.getKeyValue("l_ESTIMATE_AMOUNT_JPN"));
					}
					if(msgKeyType.containsKeyColumn("l_ESTIMATE_GAIN")) {
						key.setl_ESTIMATE_GAIN(msgKey.getKeyValue("l_ESTIMATE_GAIN"));
					}
					if(msgKeyType.containsKeyColumn("l_ES_COST_MATERIAL")) {
						key.setl_ES_COST_MATERIAL(msgKey.getKeyValue("l_ES_COST_MATERIAL"));
					}
					if(msgKeyType.containsKeyColumn("l_ES_COST_PROCESS")) {
						key.setl_ES_COST_PROCESS(msgKey.getKeyValue("l_ES_COST_PROCESS"));
					}
					if(msgKeyType.containsKeyColumn("l_ES_COST_OUTSOUCE")) {
						key.setl_ES_COST_OUTSOUCE(msgKey.getKeyValue("l_ES_COST_OUTSOUCE"));
					}
					if(msgKeyType.containsKeyColumn("l_ES_COST_ETC")) {
						key.setl_ES_COST_ETC(msgKey.getKeyValue("l_ES_COST_ETC"));
					}
					if(msgKeyType.containsKeyColumn("l_ES_COST_SERVICE")) {
						key.setl_ES_COST_SERVICE(msgKey.getKeyValue("l_ES_COST_SERVICE"));
					}
					if(msgKeyType.containsKeyColumn("l_ES_COST_ALL")) {
						key.setl_ES_COST_ALL(msgKey.getKeyValue("l_ES_COST_ALL"));
					}
					if(msgKeyType.containsKeyColumn("l_SPEC_CLASS1_TYP")) {
						key.setl_SPEC_CLASS1_TYP(msgKey.getKeyValue("l_SPEC_CLASS1_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_SPEC_CLASS2_TYP")) {
						key.setl_SPEC_CLASS2_TYP(msgKey.getKeyValue("l_SPEC_CLASS2_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_SPEC_SELECT1_TYP")) {
						key.setl_SPEC_SELECT1_TYP(msgKey.getKeyValue("l_SPEC_SELECT1_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_SPEC_SELECT2_TYP")) {
						key.setl_SPEC_SELECT2_TYP(msgKey.getKeyValue("l_SPEC_SELECT2_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_SPEC_SELECT3_TYP")) {
						key.setl_SPEC_SELECT3_TYP(msgKey.getKeyValue("l_SPEC_SELECT3_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_SPEC_SELECT4_TYP")) {
						key.setl_SPEC_SELECT4_TYP(msgKey.getKeyValue("l_SPEC_SELECT4_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_REMARKS")) {
						key.setl_REMARKS(msgKey.getKeyValue("l_REMARKS"));
					}
					if(msgKeyType.containsKeyColumn("l_UNIT_COST")) {
						key.setl_UNIT_COST(msgKey.getKeyValue("l_UNIT_COST"));
					}
					if(msgKeyType.containsKeyColumn("l_CUST_ITEM_NAME")) {
						key.setl_CUST_ITEM_NAME(msgKey.getKeyValue("l_CUST_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("h_MAX_DETAL_NO")) {
						key.seth_MAX_DETAL_NO(msgKey.getKeyValue("h_MAX_DETAL_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_COUNT")) {
						key.setl_COUNT(msgKey.getKeyValue("l_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("ROW_COUNT")) {
						key.setROW_COUNT(msgKey.getKeyValue("ROW_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("BUSINESS_DATE")) {
						key.setBUSINESS_DATE(msgKey.getKeyValue("BUSINESS_DATE"));
					}
					if(msgKeyType.containsKeyColumn("HOME_CUR_CD")) {
						key.setHOME_CUR_CD(msgKey.getKeyValue("HOME_CUR_CD"));
					}
					if(msgKeyType.containsKeyColumn("QUOTE_CUST_CD")) {
						key.setQUOTE_CUST_CD(msgKey.getKeyValue("QUOTE_CUST_CD"));
					}
					if(msgKeyType.containsKeyColumn("QUOTE_CUR_CD")) {
						key.setQUOTE_CUR_CD(msgKey.getKeyValue("QUOTE_CUR_CD"));
					}
					if(msgKeyType.containsKeyColumn("QUOTE_CUR_UNIT")) {
						key.setQUOTE_CUR_UNIT(msgKey.getKeyValue("QUOTE_CUR_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("QUOTE_PROJECT_CD")) {
						key.setQUOTE_PROJECT_CD(msgKey.getKeyValue("QUOTE_PROJECT_CD"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP")) {
						key.setUNIT_QTY_TYP(msgKey.getKeyValue("UNIT_QTY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_COST")) {
						key.setUNIT_COST(msgKey.getKeyValue("UNIT_COST"));
					}
					if(msgKeyType.containsKeyColumn("ESTIMATE_NO")) {
						key.setESTIMATE_NO(msgKey.getKeyValue("ESTIMATE_NO"));
					}
					if(msgKeyType.containsKeyColumn("UNOFFICIAL_RECEIPT_FLAG")) {
						key.setUNOFFICIAL_RECEIPT_FLAG(msgKey.getKeyValue("UNOFFICIAL_RECEIPT_FLAG"));
					}
					if(msgKeyType.containsKeyColumn("ESTIMATE_ST")) {
						key.setESTIMATE_ST(msgKey.getKeyValue("ESTIMATE_ST"));
					}
					if(msgKeyType.containsKeyColumn("USER")) {
						key.setUSER(msgKey.getKeyValue("USER"));
					}
					if(msgKeyType.containsKeyColumn("PROGRAM_NAME")) {
						key.setPROGRAM_NAME(msgKey.getKeyValue("PROGRAM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("h_ESTIMATE_ST")) {
						key.seth_ESTIMATE_ST(msgKey.getKeyValue("h_ESTIMATE_ST"));
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
