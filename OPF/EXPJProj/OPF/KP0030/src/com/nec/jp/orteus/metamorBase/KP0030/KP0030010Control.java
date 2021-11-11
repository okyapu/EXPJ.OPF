/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KP0030/src/com/nec/jp/orteus/metamorBase/KP0030/KP0030010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.KP0030;

import com.nec.jp.orteus.metamorBase.KP0030.*;
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
 * CLASS     : KP0030010Control クラス
 * ファイル・クラス説明
 * @author $Author: chenjunhua268 $
 * @version $Revision: 1.10 $ $Date: 2012/11/01 07:29:10 $
 *
 */
//}}user_implement_code_header

public class KP0030010Control
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
	public KP0030010Struct getListvalue(int x) { return (KP0030010Struct)(this.list.get(x)); }	// リストの値を返します。
	public KP0030010Struct getStruct() { return this.struct; }	// Structの値を返します。
	public KP0030010Struct createStruct() { return new KP0030010Struct(); }	// 新しいStructを作って返します。
	public void setStruct(Object structname) { this.struct.setStruct((KP0030010Struct)structname); }	// Structをセットします。
	public void initializeStruct() { this.struct.initialize(); }	// Structの値を初期化します。

	// CSV出力用リスト
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }
	// TODO: ユーザ定義のコードを記述してください
		
		//** 会社コード */
		private String _companyCD;
		
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
		
		/**
		 * 業務ワーニング発生時のパラメータ設定処理を切り出して関数化
		 * @param tableName テーブル名
		 * @param columnName カラム名
		 * @param value 値
		 */
		private void setWarningParameter(String tableName, String columnName, String value) {
			StringBuffer param = new StringBuffer();
			param.append(tableName);
			param.append('.');
			param.append(columnName);
			param.append(':');
			if (value != null) {
				param.append(value);
			}
			ExpjMessage emsg = new ExpjMessage("ZZ01006", param.toString());
			msgStruct.addWarn(emsg);
			sysLog.info(emsg, sysUSER_CD);
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
		/**自社情報の取得メソッド<br>
		 *変数 _companyCDに会社コードを参照させる。
		 */
		private void setCompanyCD() throws ExpjException {
			try {
				List myCompanyList = entity.mgetCOMPANY_CD.read(conn, struct);
				if (myCompanyList.isEmpty()) {
					setErrorMessage("KQ00039");
					throw new ExpjException("KQ00039");
				}
				KP0030010Struct myCompanyStruct = (KP0030010Struct) myCompanyList.get(0);
				this._companyCD = myCompanyStruct.getCOMPANY_CD();
			} catch(Exception e) {
				setErrorMessage("KQ00039");
				throw new ExpjException("KQ00039");
			}
		}
		
		/**検索条件設定メソッド
		 *
		 */
		private void setValue(KP0030010Struct s) throws ExpjException {
			try {
				setCompanyCD();
				s.setCOMPANY_CD(this._companyCD);
				if(struct.getIN_CUST_CD() == null || "".equals(struct.getIN_CUST_CD())) {
					s.setIN_CUST_CD("%");
				} else {
					s.setIN_CUST_CD(struct.getIN_CUST_CD());
				}
				if(struct.getIN_CUST_ITEM_CD() == null || "".equals(struct.getIN_CUST_ITEM_CD())) {
					s.setIN_CUST_ITEM_CD("%");
				} else {
					s.setIN_CUST_ITEM_CD(struct.getIN_CUST_ITEM_CD());
				}
				if(struct.getIN_DLV_LOC_CD() == null || "".equals(struct.getIN_DLV_LOC_CD())) {
					s.setIN_DLV_LOC_CD("%");
				} else {
					s.setIN_DLV_LOC_CD(struct.getIN_DLV_LOC_CD());
				}
				if(struct.getIN_ITEM_CD() == null || "".equals(struct.getIN_ITEM_CD())) {
					s.setIN_ITEM_CD("%");
				} else {
					s.setIN_ITEM_CD(struct.getIN_ITEM_CD());
				}
				if(struct.getIN_STR_DATE() == null || "".equals(struct.getIN_STR_DATE())) {
					s.setIN_STR_DATE("0001/01/01");
				} else {
					s.setIN_STR_DATE(struct.getIN_STR_DATE());
				}
				if(struct.getIN_END_DATE() == null || "".equals(struct.getIN_END_DATE())) {
					s.setIN_END_DATE("9999/12/31");
				} else {
					s.setIN_END_DATE(struct.getIN_END_DATE());
				}
                 // 最大表示行数
	            int maxLine = sp.getMaxLine(conn, 10);
				if(maxLine != 0) {
					s.setROW_COUNT(String.valueOf(maxLine));
				} else {
					s.setROW_COUNT(null);
				}
				list = entity.mselectCnt.read(conn, s);
				long rowCount = Long.parseLong(((KP0030010Struct)list.get(0)).getl_COUNT());
				if (rowCount == 0) {
					//対象データが存在しません。
					setErrorMessage("ZZ06001");
					if(list != null && list.size() > 0){
						list.clear();
					}
					return;
				}
				 // 最大表示行数エラー
				if(maxLine != 0 && rowCount == maxLine + 1){
					if(list != null && list.size() > 0){
						list.clear();
					}
					setErrorMessage("ZZ01115",String.valueOf(maxLine));
					return;
				}
				list = entity.mSelect.read(conn, s);
    			 KP0030010Struct TempStruct;
                 for (int i = 0; i < this.list.size(); i++) {
                  TempStruct = (KP0030010Struct)list.get(i);
                  TempStruct.setADD_TO_OD_FLG_DN(this.multcombo("ADD_TO_OD_FLG",TempStruct.getADD_TO_OD_FLG().toString()));
                  
                  TempStruct.setPLN_TERM_TYP_DN(this.multcombo("PLN_TERM_TYP",TempStruct.getPLN_TERM_TYP().toString()));
                  
                  TempStruct.setMRP_ODR_TYP_DN(this.multcombo("MRP_ODR_TYP",TempStruct.getMRP_ODR_TYP_DN()));
                 }
   
			} catch(Exception e) {
				e.printStackTrace();
				setErrorMessage("KP00008");
			}
		}
		
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * 読込ボタン押下時に実行される処理です。
	 *
	 */
	public void controlSelect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KP0030");
		logger.entering("KP0030010Control"+":USER="+struct.getsUser_ID(),"controlSelect");
			//{{user_implement_dev:<controlSelect>
			// TODO: ユーザ定義のコードを記述してください
			KP0030010Struct tempStruct = new KP0030010Struct();
			setValue(tempStruct);
                //}}user_implement_dev:<controlSelect>
		logger.exiting("KP0030010Control"+":USER="+struct.getsUser_ID(),"controlSelect");

		return;
	}

	/**
	 * 所要計画修正ボタン押下時に実行される処理です。
	 *
	 */
	public void controlGoSub() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KP0030");
		logger.entering("KP0030010Control"+":USER="+struct.getsUser_ID(),"controlGoSub");
			//{{user_implement_dev:<controlGoSub>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlGoSub>
		logger.exiting("KP0030010Control"+":USER="+struct.getsUser_ID(),"controlGoSub");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KP0030");
		logger.entering("KP0030010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
			// TODO: ユーザ定義のコードを記述してください
				
				struct.clear();
				if (list != null){
					list.clear();
				}
				
                //}}user_implement_dev:<controlClear>
		logger.exiting("KP0030010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * 閉じるボタン押下時に実行される処理です。
	 *
	 */
	public void controlClose() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KP0030");
		logger.entering("KP0030010Control"+":USER="+struct.getsUser_ID(),"controlClose");
			//{{user_implement_dev:<controlClose>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlClose>
		logger.exiting("KP0030010Control"+":USER="+struct.getsUser_ID(),"controlClose");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KP0030");
		logger.entering("KP0030010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
			// TODO: ユーザ定義のコードを記述してください
				struct.clear();
				if (list != null){
					list.clear();	
				}
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("KP0030010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KP0030");
		logger.entering("KP0030010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
			// TODO: ユーザ定義のコードを記述してください
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
		logger.exiting("KP0030010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * イベントハンドラの前処理です。
	 *
	 * @param buttun ボタン名
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KP0030");
		logger.entering("KP0030010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
		logger.exiting("KP0030010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("GoSub") ) {
				controlGoSub();
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
//			throw new FoundationException("KP0030010Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KP0030010-E999","CSVの出力処理"));
			throw new FoundationException("KP0030010Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KP0030010-E999","システム日付の取得処理"));
				throw new FoundationException("KP0030010Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KP0030010-E999","コントロールのイベント処理"));
			throw new FoundationException("KP0030010Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected KP0030010Entity entity;
	protected KP0030010Struct struct;
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

		entity = new KP0030010Entity();
		struct = new KP0030010Struct();

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
	 * KP0030010クラスの標準コンストラクタ
	 */
	public KP0030010Control() throws BusinessProcessException, FoundationException
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
				KP0030010Struct key = (KP0030010Struct)keyList.get(j);
				// メッセージキーを作成する
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("PLN_TERM_TYP_DN") && key.getPLN_TERM_TYP_DN() != null) {
					msgKey.setKeyValue("PLN_TERM_TYP_DN", key.getPLN_TERM_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("ADD_TO_OD_FLG_DN") && key.getADD_TO_OD_FLG_DN() != null) {
					msgKey.setKeyValue("ADD_TO_OD_FLG_DN", key.getADD_TO_OD_FLG_DN());
				}
				if(msgKeyType.containsKeyColumn("COMPANY_CD") && key.getCOMPANY_CD() != null) {
					msgKey.setKeyValue("COMPANY_CD", key.getCOMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("PLN_TERM_TYP") && key.getPLN_TERM_TYP() != null) {
					msgKey.setKeyValue("PLN_TERM_TYP", key.getPLN_TERM_TYP());
				}
				if(msgKeyType.containsKeyColumn("ADD_TO_OD_FLG") && key.getADD_TO_OD_FLG() != null) {
					msgKey.setKeyValue("ADD_TO_OD_FLG", key.getADD_TO_OD_FLG());
				}
				if(msgKeyType.containsKeyColumn("SALES_PLAN_CD") && key.getSALES_PLAN_CD() != null) {
					msgKey.setKeyValue("SALES_PLAN_CD", key.getSALES_PLAN_CD());
				}
				if(msgKeyType.containsKeyColumn("CUST_CD") && key.getCUST_CD() != null) {
					msgKey.setKeyValue("CUST_CD", key.getCUST_CD());
				}
				if(msgKeyType.containsKeyColumn("CUST_ANAME") && key.getCUST_ANAME() != null) {
					msgKey.setKeyValue("CUST_ANAME", key.getCUST_ANAME());
				}
				if(msgKeyType.containsKeyColumn("CUST_ITEM_CD") && key.getCUST_ITEM_CD() != null) {
					msgKey.setKeyValue("CUST_ITEM_CD", key.getCUST_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("CUST_ITEM_NAME") && key.getCUST_ITEM_NAME() != null) {
					msgKey.setKeyValue("CUST_ITEM_NAME", key.getCUST_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_NAME") && key.getITEM_NAME() != null) {
					msgKey.setKeyValue("ITEM_NAME", key.getITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT") && key.getSTOCK_UNIT() != null) {
					msgKey.setKeyValue("STOCK_UNIT", key.getSTOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("DLV_LOC_CD") && key.getDLV_LOC_CD() != null) {
					msgKey.setKeyValue("DLV_LOC_CD", key.getDLV_LOC_CD());
				}
				if(msgKeyType.containsKeyColumn("DLV_LOC_NAME") && key.getDLV_LOC_NAME() != null) {
					msgKey.setKeyValue("DLV_LOC_NAME", key.getDLV_LOC_NAME());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("PLN_STR_DATE") && key.getPLN_STR_DATE() != null) {
					msgKey.setKeyValue("PLN_STR_DATE", key.getPLN_STR_DATE());
				}
				if(msgKeyType.containsKeyColumn("PLN_END_DATE") && key.getPLN_END_DATE() != null) {
					msgKey.setKeyValue("PLN_END_DATE", key.getPLN_END_DATE());
				}
				if(msgKeyType.containsKeyColumn("PLN_QTY") && key.getPLN_QTY() != null) {
					msgKey.setKeyValue("PLN_QTY", key.getPLN_QTY());
				}
				if(msgKeyType.containsKeyColumn("PLN_QTY_REMAIN") && key.getPLN_QTY_REMAIN() != null) {
					msgKey.setKeyValue("PLN_QTY_REMAIN", key.getPLN_QTY_REMAIN());
				}
				if(msgKeyType.containsKeyColumn("TERM_DAYS") && key.getTERM_DAYS() != null) {
					msgKey.setKeyValue("TERM_DAYS", key.getTERM_DAYS());
				}
				if(msgKeyType.containsKeyColumn("PLN_CD") && key.getPLN_CD() != null) {
					msgKey.setKeyValue("PLN_CD", key.getPLN_CD());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP_DN") && key.getMRP_ODR_TYP_DN() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP_DN", key.getMRP_ODR_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("IN_CUST_CD") && key.getIN_CUST_CD() != null) {
					msgKey.setKeyValue("IN_CUST_CD", key.getIN_CUST_CD());
				}
				if(msgKeyType.containsKeyColumn("IN_CUST_ITEM_CD") && key.getIN_CUST_ITEM_CD() != null) {
					msgKey.setKeyValue("IN_CUST_ITEM_CD", key.getIN_CUST_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("IN_DLV_LOC_CD") && key.getIN_DLV_LOC_CD() != null) {
					msgKey.setKeyValue("IN_DLV_LOC_CD", key.getIN_DLV_LOC_CD());
				}
				if(msgKeyType.containsKeyColumn("IN_ITEM_CD") && key.getIN_ITEM_CD() != null) {
					msgKey.setKeyValue("IN_ITEM_CD", key.getIN_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("IN_STR_DATE") && key.getIN_STR_DATE() != null) {
					msgKey.setKeyValue("IN_STR_DATE", key.getIN_STR_DATE());
				}
				if(msgKeyType.containsKeyColumn("IN_END_DATE") && key.getIN_END_DATE() != null) {
					msgKey.setKeyValue("IN_END_DATE", key.getIN_END_DATE());
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
					KP0030010Struct key = new KP0030010Struct();
					if(msgKeyType.containsKeyColumn("PLN_TERM_TYP_DN")) {
						key.setPLN_TERM_TYP_DN(msgKey.getKeyValue("PLN_TERM_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("ADD_TO_OD_FLG_DN")) {
						key.setADD_TO_OD_FLG_DN(msgKey.getKeyValue("ADD_TO_OD_FLG_DN"));
					}
					if(msgKeyType.containsKeyColumn("COMPANY_CD")) {
						key.setCOMPANY_CD(msgKey.getKeyValue("COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("PLN_TERM_TYP")) {
						key.setPLN_TERM_TYP(msgKey.getKeyValue("PLN_TERM_TYP"));
					}
					if(msgKeyType.containsKeyColumn("ADD_TO_OD_FLG")) {
						key.setADD_TO_OD_FLG(msgKey.getKeyValue("ADD_TO_OD_FLG"));
					}
					if(msgKeyType.containsKeyColumn("SALES_PLAN_CD")) {
						key.setSALES_PLAN_CD(msgKey.getKeyValue("SALES_PLAN_CD"));
					}
					if(msgKeyType.containsKeyColumn("CUST_CD")) {
						key.setCUST_CD(msgKey.getKeyValue("CUST_CD"));
					}
					if(msgKeyType.containsKeyColumn("CUST_ANAME")) {
						key.setCUST_ANAME(msgKey.getKeyValue("CUST_ANAME"));
					}
					if(msgKeyType.containsKeyColumn("CUST_ITEM_CD")) {
						key.setCUST_ITEM_CD(msgKey.getKeyValue("CUST_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("CUST_ITEM_NAME")) {
						key.setCUST_ITEM_NAME(msgKey.getKeyValue("CUST_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_NAME")) {
						key.setITEM_NAME(msgKey.getKeyValue("ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT")) {
						key.setSTOCK_UNIT(msgKey.getKeyValue("STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("DLV_LOC_CD")) {
						key.setDLV_LOC_CD(msgKey.getKeyValue("DLV_LOC_CD"));
					}
					if(msgKeyType.containsKeyColumn("DLV_LOC_NAME")) {
						key.setDLV_LOC_NAME(msgKey.getKeyValue("DLV_LOC_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("PLN_STR_DATE")) {
						key.setPLN_STR_DATE(msgKey.getKeyValue("PLN_STR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("PLN_END_DATE")) {
						key.setPLN_END_DATE(msgKey.getKeyValue("PLN_END_DATE"));
					}
					if(msgKeyType.containsKeyColumn("PLN_QTY")) {
						key.setPLN_QTY(msgKey.getKeyValue("PLN_QTY"));
					}
					if(msgKeyType.containsKeyColumn("PLN_QTY_REMAIN")) {
						key.setPLN_QTY_REMAIN(msgKey.getKeyValue("PLN_QTY_REMAIN"));
					}
					if(msgKeyType.containsKeyColumn("TERM_DAYS")) {
						key.setTERM_DAYS(msgKey.getKeyValue("TERM_DAYS"));
					}
					if(msgKeyType.containsKeyColumn("PLN_CD")) {
						key.setPLN_CD(msgKey.getKeyValue("PLN_CD"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP_DN")) {
						key.setMRP_ODR_TYP_DN(msgKey.getKeyValue("MRP_ODR_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("IN_CUST_CD")) {
						key.setIN_CUST_CD(msgKey.getKeyValue("IN_CUST_CD"));
					}
					if(msgKeyType.containsKeyColumn("IN_CUST_ITEM_CD")) {
						key.setIN_CUST_ITEM_CD(msgKey.getKeyValue("IN_CUST_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("IN_DLV_LOC_CD")) {
						key.setIN_DLV_LOC_CD(msgKey.getKeyValue("IN_DLV_LOC_CD"));
					}
					if(msgKeyType.containsKeyColumn("IN_ITEM_CD")) {
						key.setIN_ITEM_CD(msgKey.getKeyValue("IN_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("IN_STR_DATE")) {
						key.setIN_STR_DATE(msgKey.getKeyValue("IN_STR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("IN_END_DATE")) {
						key.setIN_END_DATE(msgKey.getKeyValue("IN_END_DATE"));
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
