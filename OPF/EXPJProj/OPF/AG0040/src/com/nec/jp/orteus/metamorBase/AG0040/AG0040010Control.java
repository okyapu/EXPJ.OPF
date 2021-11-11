/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AG0040/src/com/nec/jp/orteus/metamorBase/AG0040/AG0040010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AG0040;

import com.nec.jp.orteus.metamorBase.AG0040.*;
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
import com.nec.jp.orteus.metamorBase.common08.LotCtrl.LotCtrl;
	// TODO: ここにimportパッケージを記述してください
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AG0040010Control
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
    private String lotctrl;
	// デフォルトアクセサメソッド
	public List getList() { return this.list; }						// リストを返します。
	public void setList(List listname) { this.list = listname; }	// リストをセットします。
	public int getListsize() {										// リスト型のサイズを返します。
		int nret = 0;
		if( this.list != null ) {nret = this.list.size();}
		return nret;
	}
//	public Object getListvalue(int x) { return this.list.get(x); }	// リストの値を返します。
	public AG0040010Struct getListvalue(int x) { return (AG0040010Struct)(this.list.get(x)); }	// リストの値を返します。
	public AG0040010Struct getStruct() { return this.struct; }	// Structを返します。
	public AG0040010Struct createStruct() { return new AG0040010Struct(); }	// 新しいStructを作って返します。
	public void setStruct(Object structname) { this.struct.setStruct((AG0040010Struct)structname); }	// Structをセットします。
	public void initializeStruct() { this.struct.initialize(); }	// Structの値を初期化します。

	// CSV出力用リスト
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }

	// TODO: ユーザ定義のコードを記述してください

	/** 画面遷移キー(品目番号) */
	private String _itemCd;
		
	/** 画面遷移キー(在庫ロット番号) */
	private String _lotNo;
	
	//業務日付
	private String BUSINESSOPRDATE;
	public void setBUSINESSOPRDATE(String name) { this.BUSINESSOPRDATE = name; };
	public String getBUSINESSOPRDATE() { return this.BUSINESSOPRDATE; };

	//会社コード
	private String COMPANY_CD;
	public void setCOMPANY_CD(String name) { this.COMPANY_CD = name; };
	public String getCOMPANY_CD() { return this.COMPANY_CD; };

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
	 * インフォメーション発生時のパラメータ設定処理を切り出して関数化
	 * @param tableName テーブル名
	 * @param columnName カラム名
	 * @param value 値
	 */
	private void setInformationParameter(String tableName, String columnName, String value) {
		StringBuffer param = new StringBuffer();
		param.append(tableName);
		param.append('.');
		param.append(columnName);
		param.append(':');
		if (value != null) {
			param.append(value);
		}

		ExpjMessage emsg = new ExpjMessage("ZZ01006", param.toString());
		msgStruct.addInfo(emsg);
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

	/**
	 * 警告メッセージ設定
	 * @param メッセージ番号
	 * @param 出力メッセージ
	 */
	private void setWarnMessage(String messageno, String message)
	{
		ExpjMessage emsg = new ExpjMessage( messageno );
		msgStruct.addWarn( emsg );
		sysLog.info(emsg, getsysUSER_CD());
		emsg = new ExpjMessage( "ZZ01006", message );
		msgStruct.addWarn( emsg );
		sysLog.info(emsg, getsysUSER_CD());
	}
		
	/**
	 * 情報メッセージ設定
	 * @param メッセージ番号
	 * @param 出力メッセージ
	 */
	private void setInfoMessage(String messageno, String message)
	{
		ExpjMessage emsg = new ExpjMessage( messageno );
		msgStruct.addInfo( emsg );
		sysLog.config(emsg, getsysUSER_CD());
		emsg = new ExpjMessage( "ZZ01006", message );
		msgStruct.addInfo( emsg );
		sysLog.config(emsg, getsysUSER_CD());
	}
		
	/**
	 * ログメッセージ設定
	 * @param メッセージ番号
	 * @param 出力メッセージ
	 */
	private void setSyslogConfig(String message)
	{
		ExpjMessage emsg = new ExpjMessage( "ZZ01006", message );
		sysLog.config(emsg, getsysUSER_CD());
	}

	/**
	 * Exceptionエラーメッセージ設定
	 * @param	code	メッセージ番号
	 * @return	ExpjMessage
	 */
	private ExpjMessage setExceptionMessage(String code)
	{
		ExpjMessage emsg = new ExpjMessage(code);
		sysLog.severe(emsg, getsysUSER_CD());
		return emsg;
	}

	/**
	 * Exceptionエラー発生時パラメータ設定
	 * @param	key		パラメータ
	 */
	private void setExceptionParameter(String key)
	{
		ExpjMessage emsg = new ExpjMessage("ZZ01006", key);
		sysLog.severe(emsg, getsysUSER_CD());
	}

	/** CSVデータリスト */
	private List _csvList = null;

	/**
	 * 初期値の設定
	 * @return boolean true 正常終了 : false 異常終了
	 */
	public boolean initialSet() throws BusinessProcessException, FoundationException
	{
		try {


			// 画面検索項目の初期化
			struct.setIN_PLANT_CD(null);
			struct.setIN_PLANT_NAME(null);
			struct.setIN_WH_CD(null);
			struct.setIN_WH_NAME(null);
			struct.setIN_VEND_CD(null);
			struct.setIN_VEND_NAME(null);
			struct.setIN_JOB_ODR_CD(null);
			struct.setIN_ITEM_CD(null);
			struct.setIN_ITEM_NAME(null);
			struct.setc1_VIEW_TYP(null);
			struct.setc2_VIEW_TYP(null);
			struct.setc3_VIEW_TYP(null);
			struct.setDOWNLOAD_FILE(null);
			struct.seth_lotCtrl(null);

			// 画面一覧表示内容を初期化
			setList(null);

			// 読込ステータス設定
			setReadStatus(INITIAL);

			// 自工場コード設定
			struct.setIN_PLANT_CD(getsysPLANT_CD());

			// 工場コードの存在チェック
			List plantList = entity.mselectM_PLANT.read(conn, struct);
			if(plantList.size() <= 0) {
				// 読込処理失敗：工場コードが工場に存在しません
				return false;
			}else{
				AG0040010Struct tmpStruct = (AG0040010Struct)plantList.get(0);
				struct.setIN_PLANT_NAME(tmpStruct.getIN_PLANT_NAME());
				return true;
			}

		} catch(SQLException e) {
			e.printStackTrace();
			// エラー処理を記述してください。
			setSqlExceptionMsg(e);
			return false;
		}
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
	
	/**
	 * 画面遷移キー(品目番号)取得
	 * @return 品目番号
	 */
	public String getItemCd() {
		return _itemCd;
	}

	/**
	 * 画面遷移キー(品目番号)設定
	 * @param cd 品目番号
	 */
	public void setItemCd(String cd) {
		_itemCd = cd;
	}
		
	/**
	 * 画面遷移キー(在庫ロット番号)取得
	 * @return 在庫ロット番号
	 */
	public String getLotNo() {
		return _lotNo;
	}

	/**
	 * 画面遷移キー(在庫ロット番号)設定
	 * @param cd 在庫ロット番号
	 */
	public void setLotNo(String cd) {
		_lotNo = cd;
	}
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * 読込ボタン押下時に実行される処理です。
	 *
	 */
	public void controlSelect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AG0040");
		logger.entering("AG0040010Control"+":USER="+struct.getsUser_ID(),"controlSelect");
			//{{user_implement_dev:<controlSelect>
			// TODO: ユーザ定義のコードを記述してください

		try {

			// 読込ステータス設定
			setReadStatus(INITIAL);

			// 一覧表示内容をクリア
			setList(null);

			// CSVダウンロードファイルのクリア
			struct.setDOWNLOAD_FILE(null);

			//【エラーチェック】
				// 工場コードが指定された場合
				if(struct.getIN_PLANT_CD() != null && ("").equals(struct.getIN_PLANT_CD()) == false){
					// 工場コードの存在チェック
					List plantList = entity.mselectM_PLANT.read(conn, struct);
					if(plantList.size() <= 0) {
						// 読込処理失敗：工場コードが工場に存在しません
						setErrorMessage("ZZ09028");
						setErrorParameter("M_PLANT", "PLANT_CD", struct.getIN_PLANT_CD());
						return;
					}else{
						AG0040010Struct tmpStruct = (AG0040010Struct)plantList.get(0);
						struct.setIN_PLANT_NAME(tmpStruct.getIN_PLANT_NAME());
					}
				}else{
					struct.setIN_PLANT_NAME(null);
				}

				// 保管区コードが指定された場合
				if(struct.getIN_WH_CD() != null && ("").equals(struct.getIN_WH_CD()) == false){
					// 保管区コードの存在チェック
					List whList = entity.mselectM_WH.read(conn, struct);
					if(whList.size() <= 0) {
						// 読込処理失敗：保管区が存在しません
						setErrorMessage("ZZ11006");
						setErrorParameter("M_WH", "WH_CD", struct.getIN_WH_CD());
						return;
					}else{
						AG0040010Struct tmpStruct = (AG0040010Struct)whList.get(0);
						struct.setIN_WH_NAME(tmpStruct.getIN_WH_NAME());

						// 工場コードが指定された場合関連チェックを行う
						// 　画面.工場コードは入力されているか？
						if(struct.getIN_PLANT_CD() != null && ("").equals(struct.getIN_PLANT_CD()) == false){
							if(tmpStruct.getreadPLAN_CD().equals(struct.getIN_PLANT_CD()) == false){
								// 検索条件不一致：工場コードと保管区の工場コードが一致しません
								setErrorMessage("AG00011");
								setErrorParameter("M_WH", "WH_CD", struct.getIN_WH_CD());
								return;
							}
						}
						// 取引先コードが指定された場合関連チェックを行う
						// 　画面.取引先コードは入力されているか？
						if(struct.getIN_VEND_CD() != null && ("").equals(struct.getIN_VEND_CD()) == false){
							// 　検索.取引先コードは有効値が入力されているか？
							if(tmpStruct.getreadVEND_CD() != null && ("").equals(tmpStruct.getreadVEND_CD()) == false){
								if(tmpStruct.getreadVEND_CD().equals(struct.getIN_VEND_CD()) == false){
									// 検索条件不一致：取引先コードと保管区の取引先コードが一致しません
									setErrorMessage("AG00012");
									setErrorParameter("M_VEND_CTRL", "VEND_CD", struct.getIN_VEND_CD());
									return;
								}
							}
						}
					}
				}else{
					struct.setIN_WH_NAME(null);
				}

				// 取引先コードが指定された場合
				if(struct.getIN_VEND_CD() != null && ("").equals(struct.getIN_VEND_CD()) == false){
					// 取引先コードの存在チェック
					List vendList = entity.mselectM_VEND_CTRL.read(conn, struct);
					if(vendList.size() <= 0) {
						// 読込処理失敗：取引先マスタが存在しません
						setErrorMessage("ZZ11005");
						setErrorParameter("M_VEND_CTRL", "VEND_CD", struct.getIN_VEND_CD());
						return;
					}else{
						AG0040010Struct tmpStruct = (AG0040010Struct)vendList.get(0);
						struct.setIN_VEND_NAME(tmpStruct.getIN_VEND_NAME());
					}
				}else{
					struct.setIN_VEND_NAME(null);
				}

				// 品目コードが指定された場合
				if(struct.getIN_ITEM_CD() != null && ("").equals(struct.getIN_ITEM_CD()) == false){
					// 品目コードの存在チェック
					List itemList = entity.mselectM_ITEM.read(conn, struct);
					if(itemList.size() <= 0) {
						// 読込処理失敗：品目マスタが存在しません
						setErrorMessage("AG00010");
						setErrorParameter("M_ITEM", "ITEM_CD", struct.getIN_ITEM_CD());
						return;
					}else{
						AG0040010Struct tmpStruct = (AG0040010Struct)itemList.get(0);
						struct.setIN_ITEM_NAME(tmpStruct.getIN_ITEM_NAME());
					}
				}else{
					struct.setIN_ITEM_NAME(null);
				}

			//【データ読込】
				setReadStatus(INITIAL);
				List tempList = null;
				
				// 最大表示行数
				ScreenParam sp = new ScreenParam(this.getClass());
				int maxLine = sp.getMaxLine(conn, 10);
				if (maxLine != 0)
					struct.setROW_COUNT(String.valueOf(maxLine));
				else
					struct.setROW_COUNT(null);
				
				
                 // チェックボックスの状態で処理を振り分ける
				// [取引先保管区のみ表示:off][マイナス在庫のみ表示:off][ロット別在庫対象表示:off]
				if(!"true".equals(struct.getc1_VIEW_TYP()) && !"true".equals(struct.getc2_VIEW_TYP())
						&& !"true".equals(struct.getc3_VIEW_TYP())){
					// 検索条件に指定された内容で[保管区別品目在庫･保管区別製番在庫]より取得
					tempList = entity.mselectT_STOCK1Cnt.read(conn, struct);

				// [取引先保管区のみ表示:on][マイナス在庫のみ表示:on][ロット別在庫対象表示:off]
				} else if("true".equals(struct.getc1_VIEW_TYP()) && "true".equals(struct.getc2_VIEW_TYP())
						&& !"true".equals(struct.getc3_VIEW_TYP())){
					// 検索条件に指定された内容で[保管区別品目在庫･保管区別製番在庫]より取得
					tempList = entity.mselectT_STOCK2Cnt.read(conn, struct);

				// [取引先保管区のみ表示:on][マイナス在庫のみ表示:off][ロット別在庫対象表示:off]
				} else if("true".equals(struct.getc1_VIEW_TYP())&& !"true".equals(struct.getc2_VIEW_TYP())
						  && !"true".equals(struct.getc3_VIEW_TYP())){
					// 検索条件に指定された内容で[保管区別品目在庫･保管区別製番在庫]より取得
					tempList = entity.mselectT_STOCK3Cnt.read(conn, struct);

				// [取引先保管区のみ表示:off][マイナス在庫のみ表示:on][ロット別在庫対象表示:off]
				} else if("true".equals(struct.getc2_VIEW_TYP())&& !"true".equals(struct.getc1_VIEW_TYP())
						   && !"true".equals(struct.getc3_VIEW_TYP())){
					// 検索条件に指定された内容で[保管区別品目在庫･保管区別製番在庫]より取得
					tempList = entity.mselectT_STOCK4Cnt.read(conn, struct);
					
				// [取引先保管区のみ表示:on][マイナス在庫のみ表示:on][ロット別在庫対象表示:on]
				}else if("true".equals(struct.getc1_VIEW_TYP()) 
						  && "true".equals(struct.getc2_VIEW_TYP()) 
						  && "true".equals(struct.getc3_VIEW_TYP())){
				    // 検索条件に指定された内容で[ロット別品目在庫]より取得
					tempList = entity.mselectT_STOCK5Cnt.read(conn, struct);
			
				// [取引先保管区のみ表示:on][マイナス在庫のみ表示:off][ロット別在庫対象表示:on]
				}  else if("true".equals(struct.getc1_VIEW_TYP()) 
						  && "true".equals(struct.getc3_VIEW_TYP()) 
						  && !"true".equals(struct.getc2_VIEW_TYP())){
				    // 検索条件に指定された内容で[ロット別品目在庫]より取得
					tempList = entity.mselectT_STOCK6Cnt.read(conn, struct);
					
				// [取引先保管区のみ表示:off][マイナス在庫のみ表示:on][ロット別在庫対象表示:on]
				}  else if(!"true".equals(struct.getc1_VIEW_TYP()) 
						  && "true".equals(struct.getc2_VIEW_TYP()) 
						  && "true".equals(struct.getc3_VIEW_TYP())){
				    // 検索条件に指定された内容で[ロット別品目在庫]より取得
					tempList = entity.mselectT_STOCK7Cnt.read(conn, struct);
					
			    // [取引先保管区のみ表示:off][マイナス在庫のみ表示:off][ロット別在庫対象表示:on]
				}  else if("true".equals(struct.getc3_VIEW_TYP())
						   && !"true".equals(struct.getc1_VIEW_TYP())
						   && !"true".equals(struct.getc2_VIEW_TYP())){
				    // 検索条件に指定された内容で[ロット別品目在庫]より取得
				    tempList = entity.mselectT_STOCK8Cnt.read(conn, struct);
				}

				long rowCount = Long.parseLong(((AG0040010Struct) tempList.get(0))
						.getl_COUNT());
				
				
                  // 該当レコードが取得できない場合。
				if (rowCount == 0){
					// 該当データなし
					setErrorMessage("ZZ06001");
					setReadStatus(NOT_FOUND);
					// CSV待避エリアのクリア
					_csvList = null;
					
					if(list!=null && list.size()>0){
						list.clear();
					}
					return;
				}else {
					if(maxLine != 0 && rowCount == maxLine+1){
						// 読込ステータス設定
						setReadStatus(TOO_MANY);
						setErrorMessage("ZZ01119", ""+maxLine);
						// 表示用リストにセット
						if(list!=null && list.size()>0){
							list.clear();
						}
						return;
					}
					    }


				// チェックボックスの状態で処理を振り分ける
				//　[取引先保管区のみ表示:off][マイナス在庫のみ表示:off][ロット別在庫対象表示:off]
				if(!"true".equals(struct.getc1_VIEW_TYP()) && !"true".equals(struct.getc2_VIEW_TYP())
						&& !"true".equals(struct.getc3_VIEW_TYP())){
					// 検索条件に指定された内容で[保管区別品目在庫･保管区別製番在庫]より取得
					tempList = entity.mselectT_STOCK1.read(conn, struct);

				//　[取引先保管区のみ表示:on][マイナス在庫のみ表示:on][ロット別在庫対象表示:off]
				} else if("true".equals(struct.getc1_VIEW_TYP()) && "true".equals(struct.getc2_VIEW_TYP())
						&& !"true".equals(struct.getc3_VIEW_TYP())){
					// 検索条件に指定された内容で[保管区別品目在庫･保管区別製番在庫]より取得
					tempList = entity.mselectT_STOCK2.read(conn, struct);

				//　[取引先保管区のみ表示:on][マイナス在庫のみ表示:off][ロット別在庫対象表示:off]
				} else if("true".equals(struct.getc1_VIEW_TYP())&& !"true".equals(struct.getc2_VIEW_TYP())
						  && !"true".equals(struct.getc3_VIEW_TYP())){
					// 検索条件に指定された内容で[保管区別品目在庫･保管区別製番在庫]より取得
					tempList = entity.mselectT_STOCK3.read(conn, struct);

				//　[取引先保管区のみ表示:off][マイナス在庫のみ表示:on][ロット別在庫対象表示:off]
				} else if("true".equals(struct.getc2_VIEW_TYP())&& !"true".equals(struct.getc1_VIEW_TYP())
						   && !"true".equals(struct.getc3_VIEW_TYP())){
					// 検索条件に指定された内容で[保管区別品目在庫･保管区別製番在庫]より取得
					tempList = entity.mselectT_STOCK4.read(conn, struct);
					
				// [取引先保管区のみ表示:on][マイナス在庫のみ表示:on][ロット別在庫対象表示:on]
				}else if("true".equals(struct.getc1_VIEW_TYP()) 
						  && "true".equals(struct.getc2_VIEW_TYP()) 
						  && "true".equals(struct.getc3_VIEW_TYP())){
				    // 検索条件に指定された内容で[ロット別品目在庫]より取得
					tempList = entity.mselectT_STOCK5.read(conn, struct);
			
				// [取引先保管区のみ表示:on][マイナス在庫のみ表示:off][ロット別在庫対象表示:on]
				}  else if("true".equals(struct.getc1_VIEW_TYP()) 
						  && "true".equals(struct.getc3_VIEW_TYP()) 
						  && !"true".equals(struct.getc2_VIEW_TYP())){
				    // 検索条件に指定された内容で[ロット別品目在庫]より取得 
					tempList = entity.mselectT_STOCK6.read(conn, struct);
					
				// 	[取引先保管区のみ表示:off][マイナス在庫のみ表示:on][ロット別在庫対象表示:on]		     
				}  else if(!"true".equals(struct.getc1_VIEW_TYP()) 
						  && "true".equals(struct.getc2_VIEW_TYP()) 
						  && "true".equals(struct.getc3_VIEW_TYP())){
				    // 検索条件に指定された内容で[ロット別品目在庫]より取得
					tempList = entity.mselectT_STOCK7.read(conn, struct);
					
			    // [取引先保管区のみ表示:off][マイナス在庫のみ表示:off][ロット別在庫対象表示:on]	
				}  else if("true".equals(struct.getc3_VIEW_TYP())
						   && !"true".equals(struct.getc1_VIEW_TYP())
						   && !"true".equals(struct.getc2_VIEW_TYP())){
				    // 検索条件に指定された内容で[ロット別品目在庫]より取得
				    tempList = entity.mselectT_STOCK8.read(conn, struct);
				}
				
				// CSV出力用に待避
				_csvList = tempList;
					  AG0040010Struct TempStruct;
			          for (int i = 0; i < tempList.size(); i++) {
					     TempStruct = (AG0040010Struct)tempList.get(i);
					     TempStruct.setSUPPLY_KBN_DN(multcombo("CONS_TYP",TempStruct.getSUPPLY_KBN_DN()));
					     TempStruct.setMRP_FLG(multcombo("MRP_FLG",TempStruct.getMRP_FLG()));
			          }
					   
						// 読込ステータス設定
						setReadStatus(NORMAL);
						// 表示用リストにセット
						setList(tempList);
					
		} catch(SQLException e) {

			e.printStackTrace();

			// 読込ステータス設定
			setReadStatus(ERROR);
			setSqlExceptionMsg(e);
		}

                //}}user_implement_dev:<controlSelect>
		logger.exiting("AG0040010Control"+":USER="+struct.getsUser_ID(),"controlSelect");

		return;
	}

	/**
	 * CSV出力ボタン押下時に実行される処理です。
	 *
	 */
	public void controlCsvOut() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AG0040");
		logger.entering("AG0040010Control"+":USER="+struct.getsUser_ID(),"controlCsvOut");
			//{{user_implement_dev:<controlCsvOut>
			// TODO: ユーザ定義のコードを記述してください

		// 初期化
		csvWriter = new CsvWriter(CsvWriter.getFileName(getsysUSER_CD()));
		List csvList = new ArrayList();

		// タイトル行
		String[] title = {
			"Expj.PLANT_CD" ,
			"Expj.WH_CD" ,
			"Expj.WH_NAME" ,
			"Expj.MRP_FLG" ,
			"Expj.VEND_CD" ,
			"Expj.VEND_NAME" ,
			"Expj.ITEM_CD" ,
			"Expj.ITEM_NAME" ,
			"Expj.STOCK_LOT_CD" ,
			"Expj.JOB_ODR_CD" ,
			"Expj.STOCK_ON_HAND_QTY" ,
			"Expj.DEFECT_QTY" ,
			"Expj.PRVS_DAYEND_STOCK_QTY" ,
			"Expj.PRVS_MONTHEND_STOCK_QTY" ,
			"Expj.STOCK_UNIT_1" ,
			"Expj.CONS_TYP" 
		};
		csvList.add(title);

		// データ行
		for (Iterator i = _csvList.iterator(); i.hasNext();) {
			AG0040010Struct csvStruct = (AG0040010Struct) i.next();
			if("false".equals(struct.geth_lotCtrl())){
				csvStruct.setl_LOT_NO("");
			}
			String[] csvStr = new String[title.length];
			csvStr[0] = csvStruct.getPLANT_CD();					// 工場コード
			csvStr[1] = csvStruct.getWH_CD();						// 保管区コード
			csvStr[2] = csvStruct.getWH_NAME();						// 保管区名
			csvStr[3] = csvStruct.getMRP_FLG();						// 所要量計算対象フラグ
			csvStr[4] = csvStruct.getVEND_CD();						// 取引先コード
			csvStr[5] = csvStruct.getVEND_ANAME();					// 取引先名
			csvStr[6] = csvStruct.getITEM_CD();						// 品目番号
			csvStr[7] = csvStruct.getITEM_NAME();					// 品目名
			csvStr[8] = csvStruct.getl_LOT_NO();					// 在庫ロット番号
			csvStr[9] = csvStruct.getJOB_ODR_CD();					// 製番
			csvStr[10] = csvStruct.getSTOCK_ON_HAND_QTY();			// 手持在庫数
			csvStr[11] = csvStruct.getDEFECT_QTY();					// 不良数
			csvStr[12] = csvStruct.getPRVS_DAYEND_STOCK_QTY();		// 前日末在庫数
			csvStr[13] = csvStruct.getPRVS_MONTHEND_STOCK_QTY();	// 前月末在庫数
			csvStr[14] = csvStruct.getSTOCK_UNIT();					// 単位
			csvStr[15] = csvStruct.getSUPPLY_KBN_DN();				// 支給区分
			csvList.add(csvStr);
		}

		if (csvList != null && !csvList.isEmpty()) {
			// CsvWriterを生成
			csvWriter = new CsvWriter(CsvWriter.getFileName(sysUSER_CD));
			csvWriter.write(csvList, CoreTools.getLocale(struct.getsUser_ID()),true);
			struct.setDOWNLOAD_FILE(csvWriter.getFilePath());
		}

                //}}user_implement_dev:<controlCsvOut>
		logger.exiting("AG0040010Control"+":USER="+struct.getsUser_ID(),"controlCsvOut");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AG0040");
		logger.entering("AG0040010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
			// TODO: ユーザ定義のコードを記述してください

			// 項目をクリアする（初期値をセット）
			initialSet();

                //}}user_implement_dev:<controlClear>
		logger.exiting("AG0040010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * 閉じるボタン押下時に実行される処理です。
	 *
	 */
	public void controlClose() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AG0040");
		logger.entering("AG0040010Control"+":USER="+struct.getsUser_ID(),"controlClose");
			//{{user_implement_dev:<controlClose>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlClose>
		logger.exiting("AG0040010Control"+":USER="+struct.getsUser_ID(),"controlClose");

		return;
	}

	/**
	 * 在庫照会ボタン押下時に実行される処理です。
	 *
	 */
	public void controlJobOdrAlc() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AG0040");
		logger.entering("AG0040010Control"+":USER="+struct.getsUser_ID(),"controlJobOdrAlc");
			//{{user_implement_dev:<controlJobOdrAlc>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlJobOdrAlc>
		logger.exiting("AG0040010Control"+":USER="+struct.getsUser_ID(),"controlJobOdrAlc");

		return;
	}

	/**
	 * ロット別在庫参照ボタン押下時に実行される処理です。
	 *
	 */
	public void controlLotOdrAlc() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AG0040");
		logger.entering("AG0040010Control"+":USER="+struct.getsUser_ID(),"controlLotOdrAlc");
			//{{user_implement_dev:<controlLotOdrAlc>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlLotOdrAlc>
		logger.exiting("AG0040010Control"+":USER="+struct.getsUser_ID(),"controlLotOdrAlc");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AG0040");
		logger.entering("AG0040010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AG0040010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AG0040");
		logger.entering("AG0040010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
			// TODO: ユーザ定義のコードを記述してください

			// 項目をクリアする（初期値をセット）
			initialSet();
			//checkロット導入
			try {
				if(LotCtrl.checkLotCtrl(conn)){
				    struct.seth_lotCtrl("true");
				    lotctrl = "true";
				}else{
					struct.seth_lotCtrl("false");
					lotctrl = "false";
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			if ( isScreenMove() == true ) {
				// 検索のコントロールメソッドを呼び出します。
				struct.setIN_ITEM_CD(_itemCd);
				struct.setIN_LOT_NO(_lotNo);
				struct.setc3_VIEW_TYP("true");
				controlSelect();
			}

                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AG0040010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * イベントハンドラの前処理です。
	 *
	 * @param buttun ボタン名
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AG0040");
		logger.entering("AG0040010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");
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
		logger.exiting("AG0040010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("CsvOut") ) {
				controlCsvOut();
			} else if( button.equals("Clear") ) {
				controlClear();
			} else if( button.equals("Close") ) {
				controlClose();
			} else if( button.equals("JobOdrAlc") ) {
				controlJobOdrAlc();
			} else if( button.equals("LotOdrAlc") ) {
				controlLotOdrAlc();
			} else if( button.equals("initial") ) {
				controlINITIAL();
			} else if( button.equals("reload") ) {
				controlRELOAD();
			}
		//{{user_implement_dev:<control_eventHandller>
			struct.seth_lotCtrl(lotctrl);
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
//			throw new FoundationException("AG0040010Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AG0040010-E999","CSVの出力処理"));
			throw new FoundationException("AG0040010Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AG0040010-E999","システム日付の取得処理"));
				throw new FoundationException("AG0040010Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AG0040010-E999","コントロールのイベント処理"));
			throw new FoundationException("AG0040010Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected AG0040010Entity entity;
	protected AG0040010Struct struct;
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

		entity = new AG0040010Entity();
		struct = new AG0040010Struct();

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
	 * AG0040010クラスの標準コンストラクタ
	 */
	public AG0040010Control() throws BusinessProcessException, FoundationException
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
				AG0040010Struct key = (AG0040010Struct)keyList.get(j);
				// メッセージキーを作成する
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE") && key.getDOWNLOAD_FILE() != null) {
					msgKey.setKeyValue("DOWNLOAD_FILE", key.getDOWNLOAD_FILE());
				}
				if(msgKeyType.containsKeyColumn("c1_VIEW_TYP") && key.getc1_VIEW_TYP() != null) {
					msgKey.setKeyValue("c1_VIEW_TYP", key.getc1_VIEW_TYP());
				}
				if(msgKeyType.containsKeyColumn("c2_VIEW_TYP") && key.getc2_VIEW_TYP() != null) {
					msgKey.setKeyValue("c2_VIEW_TYP", key.getc2_VIEW_TYP());
				}
				if(msgKeyType.containsKeyColumn("tempLot") && key.gettempLot() != null) {
					msgKey.setKeyValue("tempLot", key.gettempLot());
				}
				if(msgKeyType.containsKeyColumn("c3_VIEW_TYP") && key.getc3_VIEW_TYP() != null) {
					msgKey.setKeyValue("c3_VIEW_TYP", key.getc3_VIEW_TYP());
				}
				if(msgKeyType.containsKeyColumn("h_lotCtrl") && key.geth_lotCtrl() != null) {
					msgKey.setKeyValue("h_lotCtrl", key.geth_lotCtrl());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("WH_CD") && key.getWH_CD() != null) {
					msgKey.setKeyValue("WH_CD", key.getWH_CD());
				}
				if(msgKeyType.containsKeyColumn("WH_NAME") && key.getWH_NAME() != null) {
					msgKey.setKeyValue("WH_NAME", key.getWH_NAME());
				}
				if(msgKeyType.containsKeyColumn("MRP_FLG") && key.getMRP_FLG() != null) {
					msgKey.setKeyValue("MRP_FLG", key.getMRP_FLG());
				}
				if(msgKeyType.containsKeyColumn("VEND_CD") && key.getVEND_CD() != null) {
					msgKey.setKeyValue("VEND_CD", key.getVEND_CD());
				}
				if(msgKeyType.containsKeyColumn("VEND_ANAME") && key.getVEND_ANAME() != null) {
					msgKey.setKeyValue("VEND_ANAME", key.getVEND_ANAME());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_NAME") && key.getITEM_NAME() != null) {
					msgKey.setKeyValue("ITEM_NAME", key.getITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_CD") && key.getJOB_ODR_CD() != null) {
					msgKey.setKeyValue("JOB_ODR_CD", key.getJOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("STOCK_ON_HAND_QTY") && key.getSTOCK_ON_HAND_QTY() != null) {
					msgKey.setKeyValue("STOCK_ON_HAND_QTY", key.getSTOCK_ON_HAND_QTY());
				}
				if(msgKeyType.containsKeyColumn("DEFECT_QTY") && key.getDEFECT_QTY() != null) {
					msgKey.setKeyValue("DEFECT_QTY", key.getDEFECT_QTY());
				}
				if(msgKeyType.containsKeyColumn("PRVS_DAYEND_STOCK_QTY") && key.getPRVS_DAYEND_STOCK_QTY() != null) {
					msgKey.setKeyValue("PRVS_DAYEND_STOCK_QTY", key.getPRVS_DAYEND_STOCK_QTY());
				}
				if(msgKeyType.containsKeyColumn("PRVS_MONTHEND_STOCK_QTY") && key.getPRVS_MONTHEND_STOCK_QTY() != null) {
					msgKey.setKeyValue("PRVS_MONTHEND_STOCK_QTY", key.getPRVS_MONTHEND_STOCK_QTY());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT") && key.getSTOCK_UNIT() != null) {
					msgKey.setKeyValue("STOCK_UNIT", key.getSTOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("SUPPLY_KBN_DN") && key.getSUPPLY_KBN_DN() != null) {
					msgKey.setKeyValue("SUPPLY_KBN_DN", key.getSUPPLY_KBN_DN());
				}
				if(msgKeyType.containsKeyColumn("IN_PLANT_CD") && key.getIN_PLANT_CD() != null) {
					msgKey.setKeyValue("IN_PLANT_CD", key.getIN_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("IN_WH_CD") && key.getIN_WH_CD() != null) {
					msgKey.setKeyValue("IN_WH_CD", key.getIN_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("IN_VEND_CD") && key.getIN_VEND_CD() != null) {
					msgKey.setKeyValue("IN_VEND_CD", key.getIN_VEND_CD());
				}
				if(msgKeyType.containsKeyColumn("IN_JOB_ODR_CD") && key.getIN_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("IN_JOB_ODR_CD", key.getIN_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("IN_ITEM_CD") && key.getIN_ITEM_CD() != null) {
					msgKey.setKeyValue("IN_ITEM_CD", key.getIN_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("readPLAN_CD") && key.getreadPLAN_CD() != null) {
					msgKey.setKeyValue("readPLAN_CD", key.getreadPLAN_CD());
				}
				if(msgKeyType.containsKeyColumn("IN_PLANT_NAME") && key.getIN_PLANT_NAME() != null) {
					msgKey.setKeyValue("IN_PLANT_NAME", key.getIN_PLANT_NAME());
				}
				if(msgKeyType.containsKeyColumn("readWH_CD") && key.getreadWH_CD() != null) {
					msgKey.setKeyValue("readWH_CD", key.getreadWH_CD());
				}
				if(msgKeyType.containsKeyColumn("readVEND_CD") && key.getreadVEND_CD() != null) {
					msgKey.setKeyValue("readVEND_CD", key.getreadVEND_CD());
				}
				if(msgKeyType.containsKeyColumn("IN_WH_NAME") && key.getIN_WH_NAME() != null) {
					msgKey.setKeyValue("IN_WH_NAME", key.getIN_WH_NAME());
				}
				if(msgKeyType.containsKeyColumn("IN_VEND_NAME") && key.getIN_VEND_NAME() != null) {
					msgKey.setKeyValue("IN_VEND_NAME", key.getIN_VEND_NAME());
				}
				if(msgKeyType.containsKeyColumn("readITEM_CD") && key.getreadITEM_CD() != null) {
					msgKey.setKeyValue("readITEM_CD", key.getreadITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("IN_ITEM_NAME") && key.getIN_ITEM_NAME() != null) {
					msgKey.setKeyValue("IN_ITEM_NAME", key.getIN_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("SUPPLY_KBN") && key.getSUPPLY_KBN() != null) {
					msgKey.setKeyValue("SUPPLY_KBN", key.getSUPPLY_KBN());
				}
				if(msgKeyType.containsKeyColumn("l_LOT_NO") && key.getl_LOT_NO() != null) {
					msgKey.setKeyValue("l_LOT_NO", key.getl_LOT_NO());
				}
				if(msgKeyType.containsKeyColumn("IN_LOT_NO") && key.getIN_LOT_NO() != null) {
					msgKey.setKeyValue("IN_LOT_NO", key.getIN_LOT_NO());
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
					AG0040010Struct key = new AG0040010Struct();
					if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE")) {
						key.setDOWNLOAD_FILE(msgKey.getKeyValue("DOWNLOAD_FILE"));
					}
					if(msgKeyType.containsKeyColumn("c1_VIEW_TYP")) {
						key.setc1_VIEW_TYP(msgKey.getKeyValue("c1_VIEW_TYP"));
					}
					if(msgKeyType.containsKeyColumn("c2_VIEW_TYP")) {
						key.setc2_VIEW_TYP(msgKey.getKeyValue("c2_VIEW_TYP"));
					}
					if(msgKeyType.containsKeyColumn("tempLot")) {
						key.settempLot(msgKey.getKeyValue("tempLot"));
					}
					if(msgKeyType.containsKeyColumn("c3_VIEW_TYP")) {
						key.setc3_VIEW_TYP(msgKey.getKeyValue("c3_VIEW_TYP"));
					}
					if(msgKeyType.containsKeyColumn("h_lotCtrl")) {
						key.seth_lotCtrl(msgKey.getKeyValue("h_lotCtrl"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("WH_CD")) {
						key.setWH_CD(msgKey.getKeyValue("WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("WH_NAME")) {
						key.setWH_NAME(msgKey.getKeyValue("WH_NAME"));
					}
					if(msgKeyType.containsKeyColumn("MRP_FLG")) {
						key.setMRP_FLG(msgKey.getKeyValue("MRP_FLG"));
					}
					if(msgKeyType.containsKeyColumn("VEND_CD")) {
						key.setVEND_CD(msgKey.getKeyValue("VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("VEND_ANAME")) {
						key.setVEND_ANAME(msgKey.getKeyValue("VEND_ANAME"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_NAME")) {
						key.setITEM_NAME(msgKey.getKeyValue("ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_CD")) {
						key.setJOB_ODR_CD(msgKey.getKeyValue("JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_ON_HAND_QTY")) {
						key.setSTOCK_ON_HAND_QTY(msgKey.getKeyValue("STOCK_ON_HAND_QTY"));
					}
					if(msgKeyType.containsKeyColumn("DEFECT_QTY")) {
						key.setDEFECT_QTY(msgKey.getKeyValue("DEFECT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("PRVS_DAYEND_STOCK_QTY")) {
						key.setPRVS_DAYEND_STOCK_QTY(msgKey.getKeyValue("PRVS_DAYEND_STOCK_QTY"));
					}
					if(msgKeyType.containsKeyColumn("PRVS_MONTHEND_STOCK_QTY")) {
						key.setPRVS_MONTHEND_STOCK_QTY(msgKey.getKeyValue("PRVS_MONTHEND_STOCK_QTY"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT")) {
						key.setSTOCK_UNIT(msgKey.getKeyValue("STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("SUPPLY_KBN_DN")) {
						key.setSUPPLY_KBN_DN(msgKey.getKeyValue("SUPPLY_KBN_DN"));
					}
					if(msgKeyType.containsKeyColumn("IN_PLANT_CD")) {
						key.setIN_PLANT_CD(msgKey.getKeyValue("IN_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("IN_WH_CD")) {
						key.setIN_WH_CD(msgKey.getKeyValue("IN_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("IN_VEND_CD")) {
						key.setIN_VEND_CD(msgKey.getKeyValue("IN_VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("IN_JOB_ODR_CD")) {
						key.setIN_JOB_ODR_CD(msgKey.getKeyValue("IN_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("IN_ITEM_CD")) {
						key.setIN_ITEM_CD(msgKey.getKeyValue("IN_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("readPLAN_CD")) {
						key.setreadPLAN_CD(msgKey.getKeyValue("readPLAN_CD"));
					}
					if(msgKeyType.containsKeyColumn("IN_PLANT_NAME")) {
						key.setIN_PLANT_NAME(msgKey.getKeyValue("IN_PLANT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("readWH_CD")) {
						key.setreadWH_CD(msgKey.getKeyValue("readWH_CD"));
					}
					if(msgKeyType.containsKeyColumn("readVEND_CD")) {
						key.setreadVEND_CD(msgKey.getKeyValue("readVEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("IN_WH_NAME")) {
						key.setIN_WH_NAME(msgKey.getKeyValue("IN_WH_NAME"));
					}
					if(msgKeyType.containsKeyColumn("IN_VEND_NAME")) {
						key.setIN_VEND_NAME(msgKey.getKeyValue("IN_VEND_NAME"));
					}
					if(msgKeyType.containsKeyColumn("readITEM_CD")) {
						key.setreadITEM_CD(msgKey.getKeyValue("readITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("IN_ITEM_NAME")) {
						key.setIN_ITEM_NAME(msgKey.getKeyValue("IN_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("SUPPLY_KBN")) {
						key.setSUPPLY_KBN(msgKey.getKeyValue("SUPPLY_KBN"));
					}
					if(msgKeyType.containsKeyColumn("l_LOT_NO")) {
						key.setl_LOT_NO(msgKey.getKeyValue("l_LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("IN_LOT_NO")) {
						key.setIN_LOT_NO(msgKey.getKeyValue("IN_LOT_NO"));
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
