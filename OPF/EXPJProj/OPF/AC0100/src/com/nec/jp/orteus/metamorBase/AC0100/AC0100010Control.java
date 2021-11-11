/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AC0100/src/com/nec/jp/orteus/metamorBase/AC0100/AC0100010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AC0100;

import com.nec.jp.orteus.metamorBase.AC0100.*;
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
import java.text.ParseException;

import com.nec.jp.orteus.expj.util.*;

//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AC0100010Control
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
	public AC0100010Struct getListvalue(int x) { return (AC0100010Struct)(this.list.get(x)); }	// リストの値を返します。
	public AC0100010Struct getStruct() { return this.struct; }	// Structを返します。
	public AC0100010Struct createStruct() { return new AC0100010Struct(); }	// 新しいStructを作って返します。
	public void setStruct(Object structname) { this.struct.setStruct((AC0100010Struct)structname); }	// Structをセットします。
	public void initializeStruct() { this.struct.initialize(); }	// Structの値を初期化します。

	// CSV出力用リスト
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }

	// TODO: ユーザ定義のコードを記述してください
	
	/** コンボボックスデータ取得用定数 引当区分 */
	private final static String ALC_TYP_2 = "ALC_TYP_2";
	
	/** コンボボックスデータ取得用定数 在庫数単位区分 */
	private final static String UNIT_QTY_TYP = "UNIT_QTY_TYP";
	
	/** コンボボックスデータ取得用定数 オーダ状態区分 */
	private final static String ODR_STS_TYP = "ODR_STS_TYP";
	
	/** コンボボックスデータ取得用定数 デマンド状態区分 */
	private final static String DM_STS_TYP = "DM_STS_TYP";
	
	/** コンボボックスデータ取得用定数 製番状態区分 */
	private final static String JOB_ODR_STS_TYP = "JOB_ODR_STS_TYP";
	
	/** コンボボックスデータ取得用 引当区分 */
	private ComboStruct alcTyp2Combo = null;
	
	/** コンボボックスデータ取得用 在庫数単位区分 */
	private ComboStruct unitQtyTypCombo = null;
	
	/** コンボボックスデータ取得用 オーダ状態区分 */
	private ComboStruct odrStsTypCombo = null;
	
	/** コンボボックスデータ取得用 デマンド状態区分 */
	private ComboStruct dmStsTypCombo = null;
	
	/** コンボボックスデータ取得用 製番状態区分 */
	private ComboStruct jobOdrStsTypCombo = null;
	
	/** 製番引当一覧表示リスト */
	private List jobOdrAlcdList = null;
	
	/** 引当可能一覧表示リスト */
	private List allocatableList = null;
		
	/** 遷移先URL */
	private String nextUrl = null;
	
	/** 画面遷移キー(オーダデマンド番号) */
	private String odNo = null;
	
	/** システムログメッセージ作成用 */
	private StringBuffer _sysLogMessage;
	
	private String mode = null;
	
	/**
	 * サブ画面の起動モード（追加、修正）を取得します。
	 * @return モード
	 */
	public String getMode() {
		return mode;
	}
	
	/**
	 * サブ画面の起動モード（追加、修正）を設定します。
	 * @param s モード
	 */
	public void setMode(String s) {
		mode = s;
	}
	
	/**
	 * 画面遷移キー(オーダデマンド番号)を取得します。
	 * @return オーダデマンド番号
	 */
	public String getOdNo() {
		return odNo;
	}
	
	/**
	 * 画面遷移キー(オーダデマンド番号)を設定します。
	 * @param s オーダデマンド番号
	 */
	public void setOdNo(String s) {
		odNo = s;
	}
	
	/**
	 * 遷移先URLを取得します。
	 * @return 遷移先URL
	 */
	public String getNextUrl() {
		return nextUrl;
	}
	
	/**
	 * 遷移先URLを設定します。
	 * @param s 遷移先URL
	 */
	public void setNextUrl(String s) {
		nextUrl = s;
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
	 * エラーメッセージ設定
	 * @param メッセージ番号
	 * @param 出力メッセージ
	 */
	private void setErrorMessage(String code, String key)
	{
		ExpjMessage emsg = new ExpjMessage(code);
		msgStruct.addError( emsg );	// エラーメッセージとして登録
		sysLog.warning(emsg, getsysUSER_CD()); //エラー内容
		emsg = new ExpjMessage( "ZZ01006", key );
		msgStruct.addError( emsg );	// エラーメッセージとして登録
		sysLog.warning(emsg, getsysUSER_CD()); //エラー詳細
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
	 * Exceptionメッセージ設定
	 * @param キー項目
	 */
	private void setSqlExceptionMsg(SQLException e, String key) throws ExpjException
	{
		// エラーメッセージ作成
		ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
		sysLog.severe(emsg, getsysUSER_CD());//致命的エラー エラー内容
		ExpjException ee = new ExpjException(e, emsg); // エクセプションを生成
		throw ee;
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
	
	/**
	 * 業務ロジックのシステムログ(エラー)設定処理を切り出して関数化
	 * @param db1 データベース項目１
	 * @param value1 置換文字列１
	 */
	private void setWarningSysLogMessage(String db1, String value1) {
		_sysLogMessage = new StringBuffer();
		_sysLogMessage.append(db1);
		_sysLogMessage.append(":");
		_sysLogMessage.append(value1);
		ExpjMessage emsg 
				= new ExpjMessage("ZZ01006",_sysLogMessage.toString());
		sysLog.warning(emsg, getsysUSER_CD());
	}
	
	/**
	 * コンボボックスデータの表示説明を取得します。
	 * @param combo コンボボックスデータ
	 * @param value コンボボックスデータの値
	 * @return コンボボックスデータの表示説明
	 */
	private String getComboDisplayName(ComboStruct combo, String value) {
		for (int j = 0; j < combo.size(); j++) {
			if ((combo.getData(j)[0]).equals(value)) {
				return combo.getData(j)[1];
			}
		}
		return null;
	}
	
	/**
	 * 製番引当一覧を取得します。
	 */
	public List getJobOdrAlcdList() {
		if (jobOdrAlcdList == null) {
			jobOdrAlcdList = new ArrayList(0);
		}
		return jobOdrAlcdList;
	}
	
	/**
	 * 引当可能一覧を取得します。
	 */
	public List getAllocatableList() {
		if (allocatableList == null) {
			allocatableList = new ArrayList(0);
		}
		return allocatableList;
	}
	
	/**
	 * 余剰在庫引当可能数を算出します。
	 * 
	 * @param plantCd - 工場コード
	 * @param itemCd - 品目番号
	 * @return - 算出結果
	 */
	private Double getAllocatableStockQty(String plantCd, String itemCd) 
			throws FoundationException, SQLException {
		
		Double sumOfItemStockOnHandQty = null;
		Double sumOfAllocatedQty = null;
		Double result = null;
		
		// [1][保管区別品目在庫]."品目別手持在庫数"の合計
		sumOfItemStockOnHandQty = getSumOfStockOnHandQtyByItem(plantCd, itemCd);
		
		// [2]([製番引当]."引当済み数" - [製番引当].出庫済み数")の合計
		sumOfAllocatedQty = getSumOfAlcdQtyByItem(plantCd, itemCd);
		
		// 余剰在庫引当可能数 = [1] - [2]
		String strAllocatableStockQty = Calculate.subtract(
				sumOfItemStockOnHandQty.toString(), sumOfAllocatedQty.toString());
		
		result = new Double(strAllocatableStockQty);
		return result;
	}
	
	/**
	 * [保管区別品目在庫]."品目別手持在庫数"の合計を取得します。
	 * 
	 * @param plantCd - 工場コード
	 * @param itemCd - 品目番号
	 * @return 算出結果
	 */
	private Double getSumOfStockOnHandQtyByItem(String plantCd, String itemCd) 
			throws FoundationException, SQLException {
		
		Double result = null;
		AC0100010Struct searchStruct = new AC0100010Struct();
		AC0100010Struct resultStruct = new AC0100010Struct();
		List searchList = null;
		String sumOfStockOnHandQty = null;
		
		searchStruct.setPLANT_CD(plantCd);
		searchStruct.setITEM_CD(itemCd);
		searchList = entity.mSUM_OF_STOCK_ON_HAND_QTY_BY_ITEM.read(conn, searchStruct);
		if (searchList.size() <= 0) {
			sumOfStockOnHandQty = "0";
		} else {
			resultStruct = (AC0100010Struct)(searchList.get(0));
			sumOfStockOnHandQty = resultStruct.getSUM_OF_STOCK_ON_HAND_QTY();
			if (sumOfStockOnHandQty == null || sumOfStockOnHandQty.equals("")){
				sumOfStockOnHandQty = "0";
			}
		}
		result = new Double(sumOfStockOnHandQty);
		return result;
	}
	
	/**
	 * ([製番引当]."引当済み数" - [製番引当]."出庫済み数")の合計を取得します。
	 * 
	 * @param plantCd - 工場コード
	 * @param itemCd - 品目番号
	 * @return 算出結果
	 */
	private Double getSumOfAlcdQtyByItem(String plantCd, String itemCd) 
			throws FoundationException, SQLException {
		
		Double result = null;
		AC0100010Struct searchStruct = new AC0100010Struct();
		AC0100010Struct resultStruct = new AC0100010Struct();
		List searchList = null;
		String sumOfAlcdQty = null;
		
		searchStruct.setPLANT_CD(plantCd);
		searchStruct.setITEM_CD(struct.getITEM_CD());
		searchList = entity.mSUM_OF_ALCD_QTY_BY_ITEM.read(conn, searchStruct);
		if (searchList.size() <= 0) {
			sumOfAlcdQty = "0";
		} else {
			resultStruct = (AC0100010Struct)(searchList.get(0));
			sumOfAlcdQty = resultStruct.getSUM_OF_ALCD_QTY();
			if (sumOfAlcdQty == null || sumOfAlcdQty.equals("")) {
				sumOfAlcdQty = "0";
			}
		}
		
		result = new Double(sumOfAlcdQty);
		return result;
	}
	
	/**
	 * [製番引当]."出庫済み数"の合計を取得します。
	 * 
	 * @param plantCd - 工場コード
	 * @param odNo - オーダデマンド番号
	 * @param 算出結果
	 */
	private Double getSumOfIssuedQty(String plantCd, String odNo) 
			throws FoundationException, SQLException {
		
		Double result = null;
		AC0100010Struct searchStruct = new AC0100010Struct();
		AC0100010Struct resultStruct = new AC0100010Struct();
		List searchList = null;
		String sumOfIssuedQty = "0";
		
		searchStruct.setPLANT_CD(plantCd);
		searchStruct.setOD_NO(odNo);
		searchList = entity.mT_JOB_ODR_ALC_5.read(conn, searchStruct);
		if (searchList.size() > 0) {
			resultStruct = (AC0100010Struct)(searchList.get(0));
			if (resultStruct.getSUM_OF_ISSUEED_QTY() != null 
					&& resultStruct.getSUM_OF_ISSUEED_QTY().equals("") == false) {
				sumOfIssuedQty = resultStruct.getSUM_OF_ISSUEED_QTY();
			} else {
				sumOfIssuedQty = "0";
			}
		}
		result = new Double(sumOfIssuedQty);
		return result;
	}
	
	/**
	 * 製番引当可能数を算出します。
	 * 
	 * @param itemCd - 品目番号
	 * @param 算出結果
	 */
	private Double getJobOdrCdStockAllocatableQty(String itemCd, 
			boolean ctrlFlg1, boolean ctrlFlg2, boolean ctrlFlg3, boolean ctrlFlg4) 
			throws FoundationException, SQLException {
		
		return getJobOdrCdStockAllocatableQty(null, null, itemCd, 
				ctrlFlg1, ctrlFlg2, ctrlFlg3, ctrlFlg4);
	}
	
	/**
	 * 製番引当可能数を算出します。
	 * 
	 * @param jobOdrCd - 製番
	 * @param jobOdrDetailNo - 製番枝番
	 * @param itemCd - 品目番号
	 * @param ctrlFlg1 - 製番総手持在庫数を計算する場合はtrue、そうでない場合はfalse
	 * @param ctrlFlg2 - 先行製番仕掛数を計算する場合はtrue、そうでない場合はfalse
	 * @param ctrlFlg3 - 自製番在庫数を計算する場合はtrue、そうでない場合はfalse
	 * @param ctrlFlg4 - 未引当累計数を計算する場合はtrue、そうでない場合はfalse
	 * @param 計算結果
	 */
	private Double getJobOdrCdStockAllocatableQty(String jobOdrCd, String jobOdrDetailNo, 
			String itemCd, boolean ctrlFlg1, boolean ctrlFlg2, boolean ctrlFlg3, boolean ctrlFlg4) 
			throws FoundationException, SQLException {
		
		Double result = null;
		Double jobOdrCdStockQty = null;
		Double sumOfWorkInProcQty = null;
		Double sumOfOdQty = null;
		Double sumOfJobOdrCdStockAlcdQty = null;
		
		// [1]製番総手持在庫数
		if (ctrlFlg1 == true) {
			jobOdrCdStockQty = getSumOfStockOnHandQtyByJobOdrCd(jobOdrCd, jobOdrDetailNo, itemCd);
		} else {
			jobOdrCdStockQty = new Double("0");
		}
		
		// [2]先行製番仕掛数
		if (ctrlFlg2 == true) {
			sumOfWorkInProcQty = getSumOfWorkInProcQty(jobOdrCd, jobOdrDetailNo, itemCd);
		} else {
			sumOfWorkInProcQty = new Double("0");
		}
		
		// [3]自製番在庫数
		if (ctrlFlg3 == true) {
			sumOfOdQty = getSumOfOdQty(jobOdrCd, jobOdrDetailNo, itemCd);
		} else {
			sumOfOdQty = new Double("0");
		}
		
		// [4]未引当累計数
		if (ctrlFlg4 == true) {
			sumOfJobOdrCdStockAlcdQty = getSumOfAlcdQtyByJobOdrCd(jobOdrCd, jobOdrDetailNo, itemCd);
		} else {
			sumOfJobOdrCdStockAlcdQty = new Double("0");
		}
		
		// [1] + [2] - [3] - [4]
		String s1 = jobOdrCdStockQty.toString();
		String s2 = sumOfWorkInProcQty.toString();
		String s3 = sumOfOdQty.toString();
		String s4 = sumOfJobOdrCdStockAlcdQty.toString();
		String s = Calculate.add(s1, s2);
		s = Calculate.subtract(s, s3);
		s = Calculate.subtract(s, s4);
		
		result = new Double(s);
		return result;
	}
	
	/**
	 * 製番手持在庫数の合計を算出します。
	 *
	 * @param jobOdrCd - 製番
	 * @param jobOdrDetailNo - 製番枝番
	 * @param itemCd - 品目番号
	 * @param jobOdrCdStockQty - 製番手持在庫数の合計
	 */
	private Double getSumOfStockOnHandQtyByJobOdrCd(
			String jobOdrCd, String jobOdrDetailNo, String itemCd) 
			throws FoundationException, SQLException {
		AC0100010Struct searchStruct = new AC0100010Struct();
		AC0100010Struct resultStruct = new AC0100010Struct();
		String jobOdrCdStockQty = "0";
		Double result = null;
		
		searchStruct.setPLANT_CD(sysPLANT_CD);
		searchStruct.setITEM_CD(itemCd);
		searchStruct.setJOB_ODR_CD(jobOdrCd);
		searchStruct.setJOB_ODR_DETAIL_NO(jobOdrDetailNo);
		List searchList = entity.mSUM_OF_STOCK_ON_HAND_QTY_BY_JOB_ODR_CD.read(conn, searchStruct);
		if (searchList.size() <= 0) {
			jobOdrCdStockQty = "0";
		} else {
			resultStruct = (AC0100010Struct)(searchList.get(0));
			jobOdrCdStockQty = resultStruct.getSUM_OF_STOCK_ON_HAND_QTY();
			if (jobOdrCdStockQty == null || jobOdrCdStockQty.equals("")){
				jobOdrCdStockQty = "0";
			}
		}
		result = new Double(jobOdrCdStockQty);
		return result;
	}
	
	/**
	 * 先行製番仕掛数を算出します。
	 *
	 * @param jobOdrCd - 製番
	 * @param jobOdrDetailNo - 製番枝番
	 * @param itemCd - 品目番号
	 * @return 算出結果
	 */
	private Double getSumOfWorkInProcQty(String jobOdrCd, String jobOdrDetailNo, String itemCd) 
			throws FoundationException, SQLException {
		Double result = null;
		AC0100010Struct searchStruct = new AC0100010Struct();
		AC0100010Struct resultStruct = null;
		String sumOfWorkInProcQty = "0";
		List searchList = null;
		
		searchStruct.setPLANT_CD(sysPLANT_CD);
		searchStruct.setITEM_CD(itemCd);
		searchStruct.setJOB_ODR_CD(jobOdrCd);
		searchStruct.setJOB_ODR_DETAIL_NO(jobOdrDetailNo);
		searchList = entity.mSUM_OF_WORK_IN_PROC_QTY.read(conn, searchStruct);
		if (searchList.size() <= 0) {
			sumOfWorkInProcQty = "0";
		} else {
			resultStruct = (AC0100010Struct)(searchList.get(0));
			sumOfWorkInProcQty = resultStruct.getSUM_OF_WORK_IN_PROC_QTY();
			if (sumOfWorkInProcQty == null || sumOfWorkInProcQty.equals("")){
				sumOfWorkInProcQty = "0";
			}
		}
		result = new Double(sumOfWorkInProcQty);
		return result;
	}
	
	
	/**
	 * 自製番在庫数を算出します。
	 *
	 * @param jobOdrCd - 製番
	 * @param jobOdrDetailNo - 製番枝番
	 * @param itemCd - 品目番号
	 * @return 算出結果
	 */
	private Double getSumOfOdQty(String jobOdrCd, String jobOdrDetailNo, String itemCd) 
			throws FoundationException, SQLException {
		Double result = null;
		AC0100010Struct searchStruct = new AC0100010Struct();
		AC0100010Struct resultStruct = new AC0100010Struct();
		searchStruct.setPLANT_CD(sysPLANT_CD);
		searchStruct.setITEM_CD(itemCd);
		searchStruct.setJOB_ODR_CD(jobOdrCd);
		searchStruct.setJOB_ODR_DETAIL_NO(jobOdrDetailNo);
		List searchList = entity.mT_OD.read(conn, searchStruct);
		String totalRcvQty = null;
		String totalIssueQty = null;
		String sumOfOdrQty = "0";
		if (searchList.size() > 0) {
			List searchList2 = null;
			Iterator iterator = searchList.iterator();
			while (iterator.hasNext()) {
				resultStruct = (AC0100010Struct)(iterator.next());
				totalRcvQty = resultStruct.getTOTAL_RCV_QTY();
				totalIssueQty = resultStruct.getTOTAL_ISSUE_QTY();
				
				// 製番引当検索
				AC0100010Struct searchStruct2 = new AC0100010Struct();
				searchStruct2.setOD_NO(resultStruct.getOD_NO());
				searchStruct2.setPLANT_CD(sysPLANT_CD);
				searchList2 = entity.mSUM_OF_ISSUED_QTY.read(conn, searchStruct2);
				String sumOfIssuedQty = null;
				if (searchList2.size() <= 0) {
					sumOfIssuedQty = "0";
				} else {
					AC0100010Struct resultStruct2 = (AC0100010Struct)(searchList2.get(0));
					sumOfIssuedQty = resultStruct2.getSUM_OF_ISSUED_QTY();
				}
				
				// 算出
				sumOfOdrQty = Calculate.add(sumOfOdrQty, totalRcvQty);
				sumOfOdrQty = Calculate.subtract(sumOfOdrQty, totalIssueQty);
				sumOfOdrQty = Calculate.add(sumOfOdrQty, sumOfIssuedQty);
			}
		}
		result = new Double(sumOfOdrQty);
		return result;
	}
	
	/**
	 * 引当済み数の合計を算出します。
	 * （[製番引当]."引当済み数" - [製番引当]."出庫済み数"）の合計
	 *
	 * @param jobOdrCd - 製番
	 * @param jobOdrCancelNo - 製番枝番
	 * @param itemCd - 品目番号
	 * @return 算出結果
	 */
	 private Double getSumOfAlcdQtyByJobOdrCd(String jobOdrCd, String jobOdrDetailNo, String itemCd) 
			throws FoundationException, SQLException {
		Double result = null;
		AC0100010Struct searchStruct = new AC0100010Struct();
		AC0100010Struct resultStruct = null;
		String sumOfJobOdrCdAlcdQty = "0";
		
		searchStruct.setPLANT_CD(sysPLANT_CD);
		searchStruct.setITEM_CD(itemCd);
		searchStruct.setJOB_ODR_CD(jobOdrCd);
		searchStruct.setJOB_ODR_DETAIL_NO(jobOdrDetailNo);
		List searchList = entity.mSUM_OF_ALCD_QTY_BY_JOB_ODR_CD.read(conn, searchStruct);
		if (searchList.size() > 0) {
			resultStruct = (AC0100010Struct)(searchList.get(0));
			sumOfJobOdrCdAlcdQty = resultStruct.getSUM_OF_ALCD_QTY();
			if (sumOfJobOdrCdAlcdQty == null || sumOfJobOdrCdAlcdQty.equals("")){
				sumOfJobOdrCdAlcdQty = "0";
			}
		}
		result = new Double(sumOfJobOdrCdAlcdQty);
		return result;
	}
	
	/**
	 * 製番引当一覧を作成します。
	 */
	private List buildJobOdrAlcdList(String plantCd, String odNo, String jobOdrDetailNo) 
			throws FoundationException, SQLException {
		
		List resultList = new ArrayList(0);
		Iterator iterator = null;
		int maxLine = sp.getMaxLine(conn, 10);
		// [1]余剰在庫引当情報
		AC0100010Struct searchStruct = new AC0100010Struct();
		searchStruct.setPLANT_CD(sysPLANT_CD);
		searchStruct.setOD_NO(odNo);
		List searchList = entity.mT_JOB_ODR_ALC_2.read(conn, searchStruct);
		if (searchList.size() > 0) {

			iterator = searchList.iterator();
			while (iterator.hasNext()) {				
				AC0100010Struct aStruct = (AC0100010Struct)(iterator.next());
				
				// 引当区分
				String comboValue = "1";
				String comboName = ALC_TYP_2;
				String comboDisplayName = getComboDisplayName(alcTyp2Combo, comboValue);
				aStruct.setl_ALC_TYP_2(comboValue);
				
				// 引当区分 表示説明
				aStruct.setl_ALC_TYP_2_DN(comboDisplayName);
				
				// 引当先製番
				aStruct.setl_JOB_ODR_CD(aStruct.getJOB_ODR_CD());
				
				// 引当済み数
				aStruct.setl_ALCD_QTY(aStruct.getALCD_QTY());
				
				// 引当出庫済数
				aStruct.setl_ISSUEED_QTY(aStruct.getISSUEED_QTY());
				
				// 引当出庫残数
				aStruct.setl_ISSUE_REMAIN_QTY(aStruct.getISSUE_REMAIN_QTY());
				
				// 更新回数
				aStruct.setl_MODIFY_COUNT(aStruct.getMODIFY_COUNT());
				
				// 製番処理区分
				aStruct.setl_JOB_ODR_EXP_TYP(aStruct.getJOB_ODR_EXP_TYP());
				
				// 所要量処理区分
				aStruct.setl_MRP_TYP(aStruct.getMRP_TYP());
				
				// オーダ数
				aStruct.setl_ODR_QTY("");
				
				// 入庫累計数
				aStruct.setl_TOTAL_RCV_QTY("");
				
				// 引当可能数の算出
				String itemCd = aStruct.getITEM_CD();
				Double allocatableStockQty = null;
				allocatableStockQty = getAllocatableStockQty(plantCd, itemCd);
				aStruct.setl_ALLOCATABLE_QTY(allocatableStockQty.toString());
				
				// 手持在庫数
				Double sumOfItemStockOnHandQty = getSumOfStockOnHandQtyByItem(plantCd, itemCd);
				aStruct.setl_STOCK_ON_HAND_QTY(sumOfItemStockOnHandQty.toString());
				
				resultList.add(aStruct);
				if  (maxLine != 0 && resultList.size()> maxLine){
					return resultList;
				}
				
			}
		}
		
		// [2]他製番引当情報
		searchStruct = new AC0100010Struct();
		searchStruct.setOD_NO(odNo);

		searchList = entity.mT_JOB_ODR_ALC_3.read(conn, searchStruct);
		if (searchList.size() > 0) {

			iterator = searchList.iterator();
			while (iterator.hasNext()) {
				AC0100010Struct aStruct = (AC0100010Struct)(iterator.next());
				
				String keyJobOdrCd = aStruct.getJOB_ODR_CD();
				String keyJobOdrDetailNo = aStruct.getJOB_ODR_DETAIL_NO();
				String keyItemCd = aStruct.getITEM_CD();
				
				String comboValue = "2";
				String comboName = ALC_TYP_2;
				String comboDisplayName = getComboDisplayName(alcTyp2Combo, comboValue);
				
				// 引当区分
				aStruct.setl_ALC_TYP_2(comboValue);
				
				// 引当区分 表示説明
				aStruct.setl_ALC_TYP_2_DN(comboDisplayName);
				
				// 引当先製番
				aStruct.setl_JOB_ODR_CD(aStruct.getJOB_ODR_CD());
					
				// 引当先製番枝番
				aStruct.setl_JOB_ODR_DETAIL_NO(aStruct.getJOB_ODR_DETAIL_NO());
				
				// 引当済み数
				aStruct.setl_ALCD_QTY(aStruct.getALCD_QTY());
				
				// 引当出庫済数
				aStruct.setl_ISSUEED_QTY(aStruct.getISSUEED_QTY());
				
				// 引当出庫残数
				aStruct.setl_ISSUE_REMAIN_QTY(aStruct.getISSUE_REMAIN_QTY());
				
				// 更新回数
				aStruct.setl_MODIFY_COUNT(aStruct.getMODIFY_COUNT());
				
				// 製番処理区分
				aStruct.setl_JOB_ODR_EXP_TYP(aStruct.getJOB_ODR_EXP_TYP());
				
				// 所要量処理区分
				aStruct.setl_MRP_TYP(aStruct.getMRP_TYP());
				
				// 製番引当可能数
				Double jobOdrCdStockAllocatableQty = null;
				jobOdrCdStockAllocatableQty 
					= getJobOdrCdStockAllocatableQty(keyJobOdrCd, keyJobOdrDetailNo, keyItemCd,
						true, true, true, true);
				// マイナスの場合はゼロ
				if (Calculate.compare(jobOdrCdStockAllocatableQty.toString(), "0") == -1) {
					jobOdrCdStockAllocatableQty = new Double("0");
				}
				aStruct.setl_ALLOCATABLE_QTY(jobOdrCdStockAllocatableQty.toString());
				
				// 製番総手持在庫数
				Double jobOdrCdStockQty = null;
				jobOdrCdStockQty = getSumOfStockOnHandQtyByJobOdrCd(
						keyJobOdrCd, keyJobOdrDetailNo, keyItemCd);
				aStruct.setl_STOCK_ON_HAND_QTY(jobOdrCdStockQty.toString());
				
				// 所要量を検索
				searchStruct = new AC0100010Struct();
				searchStruct.setPLANT_CD(sysPLANT_CD);
				searchStruct.setJOB_ODR_CD(keyJobOdrCd);
				searchStruct.setJOB_ODR_DETAIL_NO(keyJobOdrDetailNo);
				searchStruct.setITEM_CD(keyItemCd);
				searchList = entity.mT_OD_2.read(conn, searchStruct);
				if (searchList.size() > 0) {
					AC0100010Struct aStruct2 = (AC0100010Struct)(searchList.get(0));
					String odrQty = aStruct2.getODR_QTY();
					String alcGrpCd = aStruct2.getALC_GRP_CD();
					String jobOdrStsTyp = aStruct2.getJOB_ODR_STS_TYP();
					String jobOdrStsTypDn = aStruct2.getJOB_ODR_STS_TYP_DN();
					String odrStsTyp = aStruct2.getODR_STS_TYP();
					String odrStsTypDn = aStruct2.getODR_STS_TYP_DN();
					String prdDueDate = aStruct2.getPRD_DUE_DATE();
					String totalRcvQty = aStruct2.getTOTAL_RCV_QTY();
					String odrStartDate = aStruct2.getODR_START_DATE();
					String prdStartDate = aStruct2.getPRD_START_DATE();
					aStruct.setl_JOB_ODR_CANCEL_NO(aStruct2.getJOB_ODR_CANCEL_NO());
					aStruct.setl_ODR_STS_TYP(odrStsTyp);
					aStruct.setl_ODR_STS_TYP_DN(odrStsTypDn);
					aStruct.setl_PRD_DUE_DATE(prdDueDate);
					aStruct.setl_TOTAL_RCV_QTY(totalRcvQty);
					aStruct.setl_ODR_START_DATE(odrStartDate);
					aStruct.setl_PRD_START_DATE(prdStartDate);
					aStruct.setl_ODR_QTY(odrQty);
					aStruct.setl_ALC_GRP_CD(alcGrpCd);
					aStruct.setl_JOB_ODR_STS_TYP(jobOdrStsTyp);
					aStruct.setl_JOB_ODR_STS_TYP_DN(jobOdrStsTypDn);
				}
				resultList.add(aStruct);
				if  (maxLine != 0 && resultList.size()> maxLine){
					return resultList;
				}
			}
		}
		
		
		// [3]自製番引当情報
		searchStruct = new AC0100010Struct();
		searchStruct.setPLANT_CD(sysPLANT_CD);
		searchStruct.setOD_NO(odNo);
		searchList = entity.mT_OD_4.read(conn, searchStruct);
		if (searchList.size() > 0) {		
			AC0100010Struct aStruct = (AC0100010Struct)(searchList.get(0));			
			if ("0".equals(aStruct.getODR_STS_TYP()) == false) {
				
				String keyJobOdrCd = aStruct.getJOB_ODR_CD();
				String keyJobOdrDetailNo = aStruct.getJOB_ODR_DETAIL_NO();
				String keyItemCd = aStruct.getITEM_CD();
				
				// 手持在庫数（[保管区別製番在庫]."製番別手持在庫数"の合計）
				Double jobOdrCdStockQty = null;
				jobOdrCdStockQty = getSumOfStockOnHandQtyByJobOdrCd(
						keyJobOdrCd, keyJobOdrDetailNo, keyItemCd);
				aStruct.setl_STOCK_ON_HAND_QTY(jobOdrCdStockQty.toString());
				
				aStruct.setl_ODR_STS_TYP_DN(aStruct.getODR_STS_TYP_DN());
				aStruct.setl_JOB_ODR_CD(aStruct.getJOB_ODR_CD());
				
				String odrStsTyp = aStruct.getODR_STS_TYP();
				String prdDueDate = aStruct.getPRD_DUE_DATE();
				String totalRcvQty = aStruct.getTOTAL_RCV_QTY();
				String totalIssueQty = aStruct.getTOTAL_ISSUE_QTY();
				String odrStartDate = aStruct.getODR_START_DATE();
				String prdStartDate = aStruct.getPRD_START_DATE();
				String odrQty = aStruct.getODR_QTY();
				aStruct.setl_PRD_DUE_DATE(prdDueDate);
				aStruct.setl_TOTAL_RCV_QTY(totalRcvQty);
				aStruct.setl_ODR_START_DATE(odrStartDate);
				aStruct.setl_PRD_START_DATE(prdStartDate);
				
				String comboValue = "3";
				String comboName = ALC_TYP_2;
				String comboDisplayName = getComboDisplayName(alcTyp2Combo, comboValue);
				
				// 引当区分
				aStruct.setl_ALC_TYP_2(comboValue);
				
				// 引当区分 表示説明
				aStruct.setl_ALC_TYP_2_DN(comboDisplayName);
				
				// 引当先製番
				aStruct.setl_JOB_ODR_CD(aStruct.getJOB_ODR_CD());
				
				// 引当出庫済数
				Double sumOfIssuedQty = getSumOfIssuedQty(sysPLANT_CD, odNo);
				String issuedQty = "0";
				issuedQty = Calculate.subtract(totalIssueQty, sumOfIssuedQty.toString());
				// マイナスの場合はゼロ
				if (Calculate.compare(issuedQty, "0") == -1) {
					issuedQty = "0";
				}
				aStruct.setl_ISSUEED_QTY(issuedQty);
				
				// 引当済み数
				String numerator = "0";
				// オーダ状態区分 = 9の場合はゼロ
				if (("9".equals(aStruct.getODR_STS_TYP()))
						|| (Calculate.compare(aStruct.getODR_QTY(), aStruct.getTOTAL_RCV_QTY()) == -1)) {
					numerator = "0";
				} else {
					numerator = Calculate.subtract(aStruct.getODR_QTY(), aStruct.getTOTAL_RCV_QTY());
				}
				
				String denominator = Calculate.divide(aStruct.getITEM_SPOIL(), "100", 8, Calculate.ROUND);
				denominator = Calculate.add("1", denominator);
				String alcdQty = Calculate.divide(numerator, denominator, 8, Calculate.ROUND);
				
				// 引当出庫済数を加算
				alcdQty = Calculate.add(alcdQty, issuedQty);
				
				// デマンド状態区分 <> 9 の場合、自製番手持在庫数を加算
				if (aStruct.getDM_STS_TYP() == null || aStruct.getDM_STS_TYP().equals("9") == false) {
					alcdQty = Calculate.add(alcdQty, jobOdrCdStockQty.toString());
				}
				
				// 端数処理
				alcdQty = round(alcdQty, aStruct.getUNIT_QTY_TYP());
				aStruct.setl_ALCD_QTY(Calculate.formatNumric(alcdQty, 1));
				
				// 引当出庫残数
				String issueRemainQty = Calculate.subtract(alcdQty, issuedQty);
				aStruct.setl_ISSUE_REMAIN_QTY(issueRemainQty);
				
				// 引当可能数
				Double jobOdrCdStockAllocatableQty = null;
				jobOdrCdStockAllocatableQty 
					= getJobOdrCdStockAllocatableQty(aStruct.getJOB_ODR_CD(), 
						aStruct.getJOB_ODR_DETAIL_NO(), aStruct.getITEM_CD(),
						true, false, true, true);
				// マイナスの場合はゼロ
				if (Calculate.compare(jobOdrCdStockAllocatableQty.toString(), "0") == -1) {
					jobOdrCdStockAllocatableQty = new Double("0");
				}
				aStruct.setl_ALLOCATABLE_QTY(jobOdrCdStockAllocatableQty.toString());
				
				// オーダ数
				aStruct.setl_ODR_QTY(aStruct.getODR_QTY());
				
				// 入庫累計数
				aStruct.setl_TOTAL_RCV_QTY(aStruct.getTOTAL_RCV_QTY());
				
				// オーダ状態区分
				aStruct.setl_ODR_STS_TYP(aStruct.getODR_STS_TYP());
				
				// オーダ状態区分 表示説明
				aStruct.setl_ODR_STS_TYP_DN(aStruct.getODR_STS_TYP_DN());
				
				// 引当グループコード
				aStruct.setl_ALC_GRP_CD(aStruct.getALC_GRP_CD());
				
				// 製番状態区分
				aStruct.setl_JOB_ODR_STS_TYP(aStruct.getJOB_ODR_STS_TYP());
				
				// 製番状態区分 表示説明
				aStruct.setl_JOB_ODR_STS_TYP_DN(aStruct.getJOB_ODR_STS_TYP_DN());
				
				// 製造納期
				aStruct.setl_PRD_DUE_DATE(aStruct.getPRD_DUE_DATE());
				
				// 手配着手日
				aStruct.setl_ODR_START_DATE(aStruct.getODR_START_DATE());
				
				// 製造着手日
				aStruct.setl_PRD_START_DATE(aStruct.getPRD_START_DATE());
				
				// 製番処理区分
				aStruct.setl_JOB_ODR_EXP_TYP(aStruct.getJOB_ODR_EXP_TYP());
				
				// 所要量処理区分
				aStruct.setl_MRP_TYP(aStruct.getMRP_TYP());
			
				resultList.add(aStruct);

				if  (maxLine != 0 && resultList.size()> maxLine){
					return resultList;
				}
			}
		}
		
		for (int x = 0; x < resultList.size(); x++) {
			AC0100010Struct tableStruct = (AC0100010Struct)resultList.get(x);
			
		}
		
		return resultList;
	}
	
	/**
	 * 在庫数単位区分に従って端数処理を行います。
	 *
	 * @param num 端数処理を行う数値
	 * @param unitQtyTyp 在庫数単位区分
	 * @return 処理結果
	 */
	private String round(String num, String unitQtyTyp) {
		
		String result = null;
		
		if (unitQtyTyp.equals("1")) {
			
			// 1:整数管理
			result = Calculate.ceil(num, 0);
			
		} else if (unitQtyTyp.equals("2")) {
			
			// 2:小数管理
			// 小数点第5位がゼロ
			String s1 = Calculate.ceil(Calculate.multiply(num, "10000"), 0);
			s1 = Calculate.divide(s1, "10", 1, Calculate.FLOOR);
			String s2 = Calculate.ceil(s1, 0);
			
			if (Calculate.compare(s1, s2) == 0) {
				// 小数点第5位で切り捨て
				result = Calculate.floor(num, 4);
			} else {
				// 小数点第5位で切り上げ
				result = Calculate.ceil(num, 4);
			}
		}
		return result;
	}
	
	/**
	 * 引当可能一覧を作成します。
	 */
	private List buildAllocatableList(String plantCd, String itemCd, String odNo, 
			String jobOdrCd, String jobOdrDetailNo) 
			throws FoundationException, SQLException {
		
		List resultList = new ArrayList(0);
		Iterator iterator = null;
		
		//[1] 余剰在庫情報の検索
		AC0100010Struct searchStruct = new AC0100010Struct();
		searchStruct.setPLANT_CD(plantCd);
		searchStruct.setOD_NO(odNo);
		List searchList = entity.mT_JOB_ODR_ALC_2.read(conn, searchStruct);
		// 表示最大行数制限
		int maxLine = sp.getMaxLine(conn, 11);

		// 存在しない場合（＝製番引当一覧に表示されていない）
		if (searchList.size() <= 0) {
			
			AC0100010Struct aStruct = new AC0100010Struct();

			// 引当可能数の算出

			Double allocatableStockQty = getAllocatableStockQty(plantCd, itemCd);
			
			// 引当可能数 > ゼロの場合に表示
			if (Calculate.compare(allocatableStockQty.toString(), "0") == 1) {
				
				// 引当可能数
				aStruct.setl_ALLOCATABLE_QTY(allocatableStockQty.toString());
				
				String comboValue = "1";
				String comboName = ALC_TYP_2;
				String comboDisplayName = getComboDisplayName(alcTyp2Combo, comboValue);
				
				// 引当区分
				aStruct.setl_ALC_TYP_2(comboValue);
				
				// 引当区分 表示説明
				aStruct.setl_ALC_TYP_2_DN(comboDisplayName);
				
				// 引当出庫残数
				Double sumOfAlcdQty = getSumOfAlcdQtyByItem(plantCd, itemCd);
				aStruct.setl_ALCD_QTY(sumOfAlcdQty.toString());
				
				// 手持在庫数
				Double sumOfItemStockOnHandQty = getSumOfStockOnHandQtyByItem(plantCd, itemCd);
				aStruct.setl_STOCK_ON_HAND_QTY(sumOfItemStockOnHandQty.toString());
				
				// オーダ数
				aStruct.setl_ODR_QTY("");
				
				// 入庫累計数
				aStruct.setl_TOTAL_RCV_QTY("");
				
				resultList.add(aStruct);
				if (maxLine != 0 && resultList.size() > maxLine) {
					return resultList;
				}
			}
		}
		
		// [2]他製番引当情報の検索
		searchStruct = new AC0100010Struct();
		searchStruct.setITEM_CD(itemCd);
		searchList = entity.mM_ITEM.read(conn, searchStruct);
		String unitQtyTyp = "";
		if (searchList.size() > 0) {
			unitQtyTyp = ((AC0100010Struct)(searchList.get(0))).getUNIT_QTY_TYP();
		}
		
		searchStruct.setJOB_ODR_CD(jobOdrCd);
		searchStruct.setJOB_ODR_DETAIL_NO(jobOdrDetailNo);
		searchStruct.setOD_NO(odNo);
		searchStruct.setPLANT_CD(plantCd);
		searchList = entity.mT_OD_5.read(conn, searchStruct);
		if (searchList.size() > 0) {
				iterator = searchList.iterator();
				while (iterator.hasNext()) {
				
				AC0100010Struct aStruct = (AC0100010Struct)(iterator.next());
				jobOdrCd = aStruct.getJOB_ODR_CD();
				jobOdrDetailNo = aStruct.getJOB_ODR_DETAIL_NO();
				String jobOdrCancelNo = aStruct.getJOB_ODR_CANCEL_NO();
				String parentOdNo = aStruct.getPARENT_OD_NO();
				String jobOdrTyp = aStruct.getJOB_ODR_TYP();
				String dmStsTyp = aStruct.getDM_STS_TYP();
				
				// 引当可能数
				Double allocatableQty = null;
				if ((parentOdNo == null || parentOdNo.equals("")) && ("2".equals(jobOdrTyp))) {
						
					if (("9".equals(aStruct.getODR_STS_TYP()))
							|| (Calculate.compare(aStruct.getODR_QTY(), aStruct.getTOTAL_RCV_QTY()) == -1)
							|| ("0".equals(jobOdrCancelNo) == false)) {
						allocatableQty = getJobOdrCdStockAllocatableQty(jobOdrCd, jobOdrDetailNo, itemCd,
								true, false, false, true);
					} else {
						allocatableQty = getJobOdrCdStockAllocatableQty(jobOdrCd, jobOdrDetailNo, itemCd,
								true, true, false, true);
					}
				} else {
					if ("9".equals(dmStsTyp)) {
						allocatableQty = getJobOdrCdStockAllocatableQty(jobOdrCd, jobOdrDetailNo, itemCd,
								true, false, false, true);
					} else {
						allocatableQty = getJobOdrCdStockAllocatableQty(jobOdrCd, jobOdrDetailNo, itemCd,
								true, false, true, true);
					}
				}
				
				// 引当可能数 > ゼロの場合は表示する
				if (Calculate.compare(allocatableQty.toString(), "0") == 1) {
					
					// 引当可能数
					aStruct.setl_ALLOCATABLE_QTY(allocatableQty.toString());
					
					// 引当区分
					String comboValue = "2";
					String comboName = ALC_TYP_2;
					String comboDisplayName = getComboDisplayName(alcTyp2Combo, comboValue);
					aStruct.setl_ALC_TYP_2(comboValue);
					
					// 引当区分 表示説明
					aStruct.setl_ALC_TYP_2_DN(comboDisplayName);
					
					// 引当先製番
					aStruct.setl_JOB_ODR_CD(aStruct.getJOB_ODR_CD());
					
					// 引当先製番枝番
					aStruct.setl_JOB_ODR_DETAIL_NO(jobOdrDetailNo);
					
					// 引当先製番取消発生番号
					aStruct.setl_JOB_ODR_CANCEL_NO(jobOdrCancelNo);
					
					// 手持在庫
					Double jobOdrCdStockQty = null;
					jobOdrCdStockQty = getSumOfStockOnHandQtyByJobOdrCd(aStruct.getJOB_ODR_CD(), 
							aStruct.getJOB_ODR_DETAIL_NO(), itemCd);
					aStruct.setl_STOCK_ON_HAND_QTY(jobOdrCdStockQty.toString());
					
					// 引当出庫残数
					String alcdQty = "0";
					// 親オーダデマンド番号 IS NULL
					if (parentOdNo == null || parentOdNo.equals("")) {
						if (("2".equals(jobOdrTyp))) {
							// ([製番引当]."引当済み数" - [製番引当]."出庫済み数")の合計
							Double sumOfAlcdQty = getSumOfAlcdQtyByJobOdrCd(
									aStruct.getJOB_ODR_CD(), jobOdrDetailNo, itemCd);
							aStruct.setl_ALCD_QTY(sumOfAlcdQty.toString());
							alcdQty = sumOfAlcdQty.toString();
						}
					} else {
						// 引当済み数
						String odrQty = "0";
						if (aStruct.getODR_QTY() != null) {
							odrQty = aStruct.getODR_QTY();
						}
						String totalRcvQty = "0";
						if (aStruct.getTOTAL_RCV_QTY() != null) {
							totalRcvQty = aStruct.getTOTAL_RCV_QTY();
						}
						String itemSpoil = "0";
						if (aStruct.getITEM_SPOIL() != null) {
							itemSpoil = aStruct.getITEM_SPOIL();
						}
						String denominator = Calculate.divide(itemSpoil, "100", 8, Calculate.ROUND);
						denominator = Calculate.add("1", denominator);
						String numerator = Calculate.subtract(odrQty, totalRcvQty);
						if (("9".equals(aStruct.getODR_STS_TYP()))
								|| (Calculate.compare(aStruct.getODR_QTY(), aStruct.getTOTAL_RCV_QTY()) == -1)) {
							numerator = "0";
						}
						alcdQty = Calculate.divide(numerator, denominator, 8, Calculate.ROUND);
						
						// デマンド状態区分 <> 9 の場合、自製番手持在庫数を加算
						if (aStruct.getDM_STS_TYP() == null || aStruct.getDM_STS_TYP().equals("9") == false) {
							alcdQty = Calculate.add(alcdQty, jobOdrCdStockQty.toString());
						}
						
						// 端数処理
						alcdQty = round(alcdQty, unitQtyTyp);
						aStruct.setl_ALCD_QTY(alcdQty);
					}
					
					// オーダ数
					aStruct.setl_ODR_QTY(aStruct.getODR_QTY());
					
					// 入庫累計数
					aStruct.setl_TOTAL_RCV_QTY(aStruct.getTOTAL_RCV_QTY());
					
					// オーダ状態区分
					aStruct.setl_ODR_STS_TYP(aStruct.getODR_STS_TYP());
					
					// オーダ状態区分 表示説明
					comboValue = aStruct.getODR_STS_TYP();
					comboName = ODR_STS_TYP;
					comboDisplayName = getComboDisplayName(odrStsTypCombo, comboValue);
					aStruct.setl_ODR_STS_TYP_DN(comboDisplayName);
					
					// 引当グループコード
					aStruct.setl_ALC_GRP_CD(aStruct.getALC_GRP_CD());
					
					// 製番状態区分
					aStruct.setl_JOB_ODR_STS_TYP(aStruct.getJOB_ODR_STS_TYP());
					
					// 製番状態区分 表示説明
					comboValue = aStruct.getJOB_ODR_STS_TYP();
					comboName = JOB_ODR_STS_TYP;
					comboDisplayName = getComboDisplayName(jobOdrStsTypCombo, comboValue);
					aStruct.setl_JOB_ODR_STS_TYP_DN(comboDisplayName);
					
					// 製造納期
					aStruct.setl_PRD_DUE_DATE(aStruct.getPRD_DUE_DATE());
					
					// 手配着手日
					aStruct.setl_ODR_START_DATE(aStruct.getODR_START_DATE());
					
					// 製造着手日
					aStruct.setl_PRD_START_DATE(aStruct.getPRD_START_DATE());
					
					resultList.add(aStruct);
					if (maxLine != 0 && resultList.size() > maxLine){
					return 	resultList;
					}
					
				}
			}
		}
		
		for (int x = 0; x < resultList.size(); x++) {
			AC0100010Struct tableStruct = (AC0100010Struct)resultList.get(x);
			
		}
		return resultList;
	}
	
	/**
	 * 引当可能数の合計を算出します。
	 * 
	 * @param plantCd - 工場コード
	 * @param itemCd - 品目番号
	 * @return 算出結果
	 */
	private Double getAllocatableQty(String plantCd, String itemCd) 
			throws FoundationException, SQLException {
		
		Double result = null;
		Double allocatableStockQty = null;
		Double jobOdrCdStockAllocatableQty = null;
		
		// [1]余剰在庫引当可能数（品目単位）
		allocatableStockQty = getAllocatableStockQty(plantCd, itemCd);
		// マイナスの場合はゼロ
		if (Calculate.compare(allocatableStockQty.toString(), "0") == -1) {
			allocatableStockQty = new Double("0");
		}
		
		// [2]製番引当可能数（品目単位）
		jobOdrCdStockAllocatableQty = 
				getJobOdrCdStockAllocatableQty(itemCd, true, true, true, true);
		// マイナスの場合はゼロ
		if (Calculate.compare(jobOdrCdStockAllocatableQty.toString(), "0") == -1) {
			jobOdrCdStockAllocatableQty = new Double("0");
		}
		
		// 引当可能数の合計 = [1] + [2]
		String allocatableQty = Calculate.add(allocatableStockQty.toString(), 
				jobOdrCdStockAllocatableQty.toString());
				
		result = new Double(allocatableQty);
		return result;
	}
	
	/**
	 * 引当済み数合計を算出します。
	 */
	private Double getSumOfAlcdQty(List jobOdrAlcdList) 
			throws FoundationException, SQLException {
		Double result = null;
		String strSumOfAlcdQty = "0";
		if (jobOdrAlcdList != null) {
			Iterator iterator = jobOdrAlcdList.iterator();
			while (iterator.hasNext()) {
				AC0100010Struct aStruct = (AC0100010Struct)(iterator.next());
				String alcdQty = aStruct.getl_ALCD_QTY();
				if (alcdQty != null && alcdQty.equals("") == false) {
					strSumOfAlcdQty = Calculate.add(strSumOfAlcdQty, alcdQty);
				}
			}
		}
		result = new Double(strSumOfAlcdQty);
		return result;
	}
	
	/**
	* 時分の整理
	* @param 日付時分また時分
	* @param 日付時分また時分
	*/
	private String formatHM(String inDate , String inFlag){
			if(null == inDate || "".equals(inDate)){
				return inDate ;
			}
			
			if("0".equals(inFlag) &&  inDate.length() < 16){
				return inDate ;
			}else if("1".equals(inFlag) &&  inDate.length() < 5){
				return inDate ;
			}
			
			return inDate.replaceAll("00:00","     ");					
	}
	
	/**
	* 年月日時分を分ける
	* @param 日付時分
	* @param 日付また時分
	*/
	private String formatYMDHM(String inDate , String inFlag){
			if(null == inDate || "".equals(inDate)){
				return inDate ;
			}
		
			if(inDate.length() < 10){
				return inDate ;
			}
			
			if("0".equals(inFlag)){
				return inDate.substring(0,10);
			}
			
			if("1".equals(inFlag) && inDate.length() == 10){
				return "     ";
			}
			
			return inDate.substring(11);				
	}
				
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * 読込ボタン押下時に実行される処理です。
	 *
	 */
	public void controlSelect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0100");
		logger.entering("AC0100010Control"+":USER="+struct.getsUser_ID(),"controlSelect");
			//{{user_implement_dev:<controlSelect>
			// TODO: ユーザ定義のコードを記述してください
		try {
			
			if (list != null) {
				list.clear();
			} else {
				list = new ArrayList(0);
			}
			
			if (jobOdrAlcdList != null) {
				jobOdrAlcdList.clear();
			} else {
				jobOdrAlcdList = new ArrayList(0);
			}
			
			if (allocatableList != null) {
				allocatableList.clear();
			} else {
				allocatableList = new ArrayList(0);
			}
			ExpjMessage emsg = null;
			
			if (isScreenMove() == false) {
				// 製番、製番取消発生番号の存在チェック
				AC0100010Struct searchStruct = new AC0100010Struct();
				searchStruct.setPLANT_CD(sysPLANT_CD);
				searchStruct.setJOB_ODR_CD(struct.getJOB_ODR_CD());
				searchStruct.setJOB_ODR_CANCEL_NO(struct.getJOB_ODR_CANCEL_NO());
				List resultList = entity.mT_JOB_ODR.read(conn, searchStruct);
				if (resultList.size() <= 0) {
					setErrorMessage("AC00204");
					setErrorParameter("T_JOB_ODR", "JOB_ODR_CD", searchStruct.getJOB_ODR_CD());
					setErrorParameter("T_JOB_ODR", "JOB_ODR_CANCEL_NO", searchStruct.getJOB_ODR_CANCEL_NO());
				}
				
				// 品目番号の存在チェック
				searchStruct = new AC0100010Struct();
				searchStruct.setITEM_CD(struct.getITEM_CD());
				resultList = entity.mM_ITEM.read(conn, searchStruct);
				if (resultList.size() <= 0) {
					setErrorMessage("AC00220");
					setErrorParameter("M_ITEM", "ITEM_CD", searchStruct.getITEM_CD());
				} else {
					AC0100010Struct resultStruct = (AC0100010Struct)(resultList.get(0));
					if (resultStruct.getMRP_ODR_TYP().equals("1") == false && 
							resultStruct.getMRP_ODR_TYP().equals("2") == false) {
						setErrorMessage("AC00211");
						setErrorParameter("M_ITEM", "ITEM_CD", searchStruct.getITEM_CD());
					}
				}
			}
			// エラーがあれば終了
			if (msgStruct.hasError()) {
				return;
			}
			
			// 所要量検索
/*			if (isScreenMove() == true) {
				struct.setOD_NO(odNo);
			}
*/			
			struct.setPLANT_CD(sysPLANT_CD);
			List searchList = null;
			searchList = entity.mT_JOB_ODR_ALC.read(conn, struct);

			if (searchList.size() <= 0) {
				setErrorMessage("ZZ06001");
				setErrorParameter("T_OD", "JOB_ODR_CD", struct.getITEM_CD());
				setErrorParameter("T_OD", "JOB_ODR_CANCEL_NO", struct.getJOB_ODR_CANCEL_NO());
				setErrorParameter("T_OD", "ITEM_CD", struct.getITEM_CD());
				setErrorParameter("T_OD", "OD_NO", struct.getOD_NO());
				readStatus = NOT_FOUND;
				return;
			}
			
			if (searchList.size() > 1) {
				setErrorMessage("AC00209");
				setErrorParameter("T_OD", "JOB_ODR_CD", struct.getITEM_CD());
				setErrorParameter("T_OD", "JOB_ODR_CANCEL_NO", struct.getJOB_ODR_CANCEL_NO());
				setErrorParameter("T_OD", "ITEM_CD", struct.getITEM_CD());
				setErrorParameter("T_OD", "OD_NO", struct.getOD_NO());
				readStatus = ERROR;
				return;
			}
			
			// 所要量
			AC0100010Struct resultStruct = ((AC0100010Struct)(searchList.get(0)));
			
			DateTimeFormat dtf = new DateTimeFormat(conn);
			
			String itemName = resultStruct.getITEM_NAME();
			String odNo = resultStruct.getOD_NO();
			String stockUnit = resultStruct.getSTOCK_UNIT();
			String jobOdrDetailNo = resultStruct.getJOB_ODR_DETAIL_NO();
			String odrQty = resultStruct.getODR_QTY();
			String dmQty = resultStruct.getDM_QTY();
			String alcGrpCd = resultStruct.getALC_GRP_CD();
			String dmStsTyp = resultStruct.getDM_STS_TYP();
			String jobOdrStsTyp = resultStruct.getJOB_ODR_STS_TYP();
			String totalIssueQty = resultStruct.getTOTAL_ISSUE_QTY();
			String dueDate = resultStruct.getDUE_DATE();
			String jobOdrExpTyp = resultStruct.getJOB_ODR_EXP_TYP();
			String odCalcFlg = resultStruct.getOD_CALC_FLG();
			String mrpTyp = resultStruct.getMRP_TYP();
			String unitQtyTyp = resultStruct.getUNIT_QTY_TYP();
			String itemCd = resultStruct.getITEM_CD();
			String jobOdrCd = resultStruct.getJOB_ODR_CD();
			String jobOdrCancelNo = resultStruct.getJOB_ODR_CANCEL_NO();
			
			// structへ設定
			struct.setITEM_NAME(itemName);
			struct.seth_OD_NO(odNo);
			struct.setSTOCK_UNIT(stockUnit);
			struct.setSTOCK_UNIT_1(stockUnit);
			struct.setSTOCK_UNIT_2(stockUnit);
			struct.setSTOCK_UNIT_3(stockUnit);
			struct.setITEM_CD(itemCd);
			struct.setJOB_ODR_CD(jobOdrCd);
			struct.setJOB_ODR_DETAIL_NO(jobOdrDetailNo);
			struct.setJOB_ODR_CANCEL_NO(jobOdrCancelNo);
			struct.setODR_QTY(odrQty);
			struct.setDM_QTY(dmQty);
			struct.setALC_GRP_CD(alcGrpCd);
			struct.setDM_STS_TYP(dmStsTyp);
			struct.setJOB_ODR_STS_TYP(jobOdrStsTyp);
			struct.setTOTAL_ISSUE_QTY(totalIssueQty);
			
		    struct.setDUE_DATE(dtf.getDatePart(dueDate));
	        struct.setDUE_TIME(dtf.getCoronTimePart(dueDate));
			
	        struct.setJOB_ODR_EXP_TYP(jobOdrExpTyp);
			struct.setOD_CALC_FLG(odCalcFlg);
			struct.setMRP_TYP(mrpTyp);
			struct.setUNIT_QTY_TYP(unitQtyTyp);
			
			String comboValue = struct.getDM_STS_TYP();
			String comboName = DM_STS_TYP;
			String comboDisplayName = getComboDisplayName(dmStsTypCombo, comboValue);
			struct.setDM_STS_TYP_DN(comboDisplayName);
			
			comboValue = struct.getJOB_ODR_STS_TYP();
			comboName = JOB_ODR_STS_TYP;
			comboDisplayName = getComboDisplayName(jobOdrStsTypCombo, comboValue);
			struct.setJOB_ODR_STS_TYP_DN(comboDisplayName);
			
			if (resultStruct.getMRP_TYP().equals("3")) {
				setErrorMessage("AC00210");
				setErrorParameter("T_JOB_ODR", "JOB_ODR_CD", struct.getJOB_ODR_CD());
				setErrorParameter("T_JOB_ODR", "JOB_ODR_CANCEL_NO", struct.getJOB_ODR_CANCEL_NO());
			}
			if (resultStruct.getPARENT_OD_NO() == null || resultStruct.getPARENT_OD_NO().equals("")) {
				setErrorMessage("AC00212");
				setErrorParameter("T_OD", "OD_NO", struct.geth_OD_NO());
			}
			// エラーがあれば終了
			if (msgStruct.hasError()) {
				return;
			}
			
			// 引当可能数の合計
			Double allocatableQty = getAllocatableQty(sysPLANT_CD, itemCd);
			struct.setSUM_OF_ALLOCATABLE_QTY(allocatableQty.toString());
			
			// 製番引当一覧
			jobOdrAlcdList = buildJobOdrAlcdList(sysPLANT_CD, odNo, jobOdrDetailNo);
			
			// 引当可能一覧
			allocatableList = buildAllocatableList(sysPLANT_CD, itemCd, odNo, jobOdrCd, jobOdrDetailNo);
			
			
			// 引当済み数合計
			Double sumOfAlcdQty = getSumOfAlcdQty(jobOdrAlcdList);
			// マイナスの場合ゼロ
			if (Calculate.compare(sumOfAlcdQty.toString(), "0") == -1) {
				sumOfAlcdQty = new Double("0");
			}
			struct.setSUM_OF_ALCD_QTY(sumOfAlcdQty.toString());
			
			// 引当残数合計
			struct.setSUM_OF_ALC_REMAIN_QTY(
					Calculate.subtract(struct.getDM_QTY(), struct.getSUM_OF_ALCD_QTY()));
			
			// 表示最大行数チェック
			int maxLine = sp.getMaxLine(conn, 10);
			if(maxLine != 0 && jobOdrAlcdList.size() > maxLine){
				jobOdrAlcdList.clear();
				setErrorMessage("AC00221", "" + maxLine);
				setErrorParameter("T_OD", "JOB_ODR_CD", struct.getITEM_CD());
				setErrorParameter("T_OD", "JOB_ODR_CANCEL_NO", struct.getJOB_ODR_CANCEL_NO());
				setErrorParameter("T_OD", "ITEM_CD", struct.getITEM_CD());
				setErrorParameter("T_OD", "OD_NO", struct.getOD_NO());
			}
			int maxLine2 = sp.getMaxLine(conn, 11);
			if(maxLine2 != 0 && allocatableList.size() > maxLine2){
				allocatableList.clear();
				setErrorMessage("AC00222", "" + maxLine);
				setErrorParameter("T_OD", "JOB_ODR_CD", struct.getITEM_CD());
				setErrorParameter("T_OD", "JOB_ODR_CANCEL_NO", struct.getJOB_ODR_CANCEL_NO());
				setErrorParameter("T_OD", "ITEM_CD", struct.getITEM_CD());
				setErrorParameter("T_OD", "OD_NO", struct.getOD_NO());
			}
			list = jobOdrAlcdList;
			if ((maxLine != 0 && jobOdrAlcdList.size() > maxLine) && 
					(maxLine2 != 0 && allocatableList.size() > maxLine2)) {
				readStatus = TOO_MANY;
			} else {
				readStatus = NORMAL;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new ExpjException(e);
		} catch (Exception e) {
			e.printStackTrace();
			throw new ExpjException(e);
		}
                //}}user_implement_dev:<controlSelect>
		logger.exiting("AC0100010Control"+":USER="+struct.getsUser_ID(),"controlSelect");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0100");
		logger.entering("AC0100010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
			// TODO: ユーザ定義のコードを記述してください
		
		if (list != null) {
			list.clear();
		} else {
			list = new ArrayList(0);
		}
		
		if (jobOdrAlcdList != null) {
			jobOdrAlcdList.clear();
		} else {
			jobOdrAlcdList = new ArrayList(0);
		}
		
		if (allocatableList != null) {
			allocatableList.clear();
		} else {
			allocatableList = new ArrayList(0);
		}
		
		odNo = null;
		mode = null;
		struct.clear();
		struct.setJOB_ODR_CANCEL_NO("0");
                //}}user_implement_dev:<controlClear>
		logger.exiting("AC0100010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * 引当修正ボタン押下時に実行される処理です。
	 *
	 */
	public void controlAlcUpdate() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0100");
		logger.entering("AC0100010Control"+":USER="+struct.getsUser_ID(),"controlAlcUpdate");
			//{{user_implement_dev:<controlAlcUpdate>
			// TODO: ユーザ定義のコードを記述してください
			
		mode = "AlcUpdate";
		
		try{
		DateTimeFormat dtf = new DateTimeFormat(conn);

		String comboValue = struct.getUNIT_QTY_TYP();
		String comboName = UNIT_QTY_TYP;
		String comboDisplayName = getComboDisplayName(unitQtyTypCombo, comboValue);
		struct.setUNIT_QTY_TYP_DN(comboDisplayName);
		struct.setALC_TYP_2(struct.getl_ALC_TYP_2());
		comboValue = struct.getl_ALC_TYP_2();
		comboName = ALC_TYP_2;
		comboDisplayName = getComboDisplayName(alcTyp2Combo, comboValue);
		struct.setALC_TYP_2_DN(comboDisplayName);
		struct.setJOB_ODR_CD_2(struct.getl_JOB_ODR_CD());
		struct.setJOB_ODR_DETAIL_NO_2(struct.getl_JOB_ODR_DETAIL_NO());
		struct.setJOB_ODR_CANCEL_NO_2(struct.getl_JOB_ODR_CANCEL_NO());
		struct.setALCD_QTY(struct.getl_ALCD_QTY());
		struct.setISSUEED_QTY(struct.getl_ISSUEED_QTY());
		struct.setISSUE_REMAIN_QTY(struct.getl_ISSUE_REMAIN_QTY());
		struct.setALLOCATABLE_QTY(struct.getl_ALLOCATABLE_QTY());
		struct.setSTOCK_ON_HAND_QTY(struct.getl_STOCK_ON_HAND_QTY());
		struct.setODR_QTY(struct.getl_ODR_QTY());
		struct.setTOTAL_RCV_QTY(struct.getl_TOTAL_RCV_QTY());
		struct.setODR_STS_TYP(struct.getl_ODR_STS_TYP());
		comboValue = struct.getl_ODR_STS_TYP();
		comboName = ODR_STS_TYP;
		comboDisplayName = getComboDisplayName(odrStsTypCombo, comboValue);
		struct.setODR_STS_TYP_DN(comboDisplayName);
		struct.setALC_GRP_CD_2(struct.getl_ALC_GRP_CD());
		struct.setJOB_ODR_STS_TYP_2(struct.getl_JOB_ODR_STS_TYP());
		comboValue = struct.getl_JOB_ODR_STS_TYP();
		comboName = JOB_ODR_STS_TYP;
		comboDisplayName = getComboDisplayName(jobOdrStsTypCombo, comboValue);
		struct.setJOB_ODR_STS_TYP_DN_2(comboDisplayName);
		
	    struct.setPRD_DUE_DATE(dtf.getDatePart(struct.getl_PRD_DUE_DATE()));
        struct.setODR_START_DATE(dtf.getDatePart(struct.getl_ODR_START_DATE()));
	    struct.setPRD_START_DATE(dtf.getDatePart(struct.getl_PRD_START_DATE()));
        struct.setPRD_DUE_TIME(dtf.getCoronTimePart(struct.getl_PRD_DUE_DATE()));
	    struct.setODR_START_TIME(dtf.getCoronTimePart(struct.getl_ODR_START_DATE()));
        struct.setPRD_START_TIME(dtf.getCoronTimePart(struct.getl_PRD_START_DATE()));
				
		struct.setSTOCK_UNIT(struct.getSTOCK_UNIT());
		struct.setSTOCK_UNIT_1(struct.getSTOCK_UNIT());
		struct.setSTOCK_UNIT_2(struct.getSTOCK_UNIT());
		struct.setSTOCK_UNIT_3(struct.getSTOCK_UNIT());
		struct.setSTOCK_UNIT_4(struct.getSTOCK_UNIT());
		struct.setSTOCK_UNIT_5(struct.getSTOCK_UNIT());
		struct.setSTOCK_UNIT_6(struct.getSTOCK_UNIT());
		struct.setSTOCK_UNIT_7(struct.getSTOCK_UNIT());
		struct.setSTOCK_UNIT_8(struct.getSTOCK_UNIT());
		struct.setSTOCK_UNIT_9(struct.getSTOCK_UNIT());
		// オーダ数、入庫累計数の計量単位にnullを設定
		if (struct.getl_ALC_TYP_2().equals("1")) {
			struct.setSTOCK_UNIT_10(null);
			struct.setSTOCK_UNIT_11(null);
		} else {
			struct.setSTOCK_UNIT_10(struct.getSTOCK_UNIT());
			struct.setSTOCK_UNIT_11(struct.getSTOCK_UNIT());
		}
		struct.setMODIFY_COUNT(struct.getl_MODIFY_COUNT());
		
		} catch(Exception e) {
				e.printStackTrace();
				throw new ExpjException(e);
		}
				
                //}}user_implement_dev:<controlAlcUpdate>
		logger.exiting("AC0100010Control"+":USER="+struct.getsUser_ID(),"controlAlcUpdate");

		return;
	}

	/**
	 * 引当削除ボタン押下時に実行される処理です。
	 *
	 */
	public void controlAlcDelete() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0100");
		logger.entering("AC0100010Control"+":USER="+struct.getsUser_ID(),"controlAlcDelete");
			//{{user_implement_dev:<controlAlcDelete>
			// TODO: ユーザ定義のコードを記述してください
		String keyMessage = "";
		try {
			
			// トランザクション開始
			
			AC0100010Struct deleteStruct = new AC0100010Struct();
			AC0100010Struct searchStruct = new AC0100010Struct();
			
			searchStruct.setPLANT_CD(sysPLANT_CD);
			List resultList = entity.mSYS_OD_CALC_CTRL.read(conn, searchStruct);
			String odCalcFlg = ((AC0100010Struct)resultList.get(0)).getOD_CALC_FLG();
			//String odMntFlg = ((AC0100010Struct)resultList.get(0)).getOD_MNT_FLG();
			
			searchStruct.setJOB_ODR_CD(struct.getJOB_ODR_CD());
			searchStruct.setJOB_ODR_CD_2(struct.getl_JOB_ODR_CD());
			resultList = entity.mSYS_JOB_OD_CALC_CTRL.read(conn, searchStruct);
			String jobOdCalcFlg = ((AC0100010Struct)resultList.get(0)).getOD_CALC_FLG();
			String jobOdMntFlg = ((AC0100010Struct)resultList.get(0)).getOD_MNT_FLG();
			if(jobOdCalcFlg==null||"".equals(jobOdCalcFlg)){
				jobOdCalcFlg = "0";
			}
			if(jobOdMntFlg==null||"".equals(jobOdMntFlg)){
				jobOdMntFlg = "0";
			}
			
			// 引当元製番の製番処理区分
			searchStruct.setJOB_ODR_CD(struct.getJOB_ODR_CD());
			searchStruct.setJOB_ODR_DETAIL_NO(struct.getJOB_ODR_DETAIL_NO());
			searchStruct.setJOB_ODR_CANCEL_NO(struct.getJOB_ODR_CANCEL_NO());
			resultList = entity.mT_JOB_ODR.read(conn, searchStruct);
			String jobOdrExpTyp = ((AC0100010Struct)resultList.get(0)).getJOB_ODR_EXP_TYP();
			
			// 引当先製番の製番処理区分
			String jobOdrExpTyp2 = null;
			if (struct.getl_ALC_TYP_2().equals("2")) {
				searchStruct.setPLANT_CD(sysPLANT_CD);
				searchStruct.setJOB_ODR_CD(struct.getl_JOB_ODR_CD());
				searchStruct.setJOB_ODR_DETAIL_NO(struct.getl_JOB_ODR_DETAIL_NO());
				searchStruct.setJOB_ODR_CANCEL_NO(struct.getl_JOB_ODR_CANCEL_NO());
				resultList = entity.mT_JOB_ODR.read(conn, searchStruct);
				jobOdrExpTyp2 = ((AC0100010Struct)resultList.get(0)).getJOB_ODR_EXP_TYP();
			}
			if (odCalcFlg.equals("1")) {
				setErrorMessage("AC00206");
				setErrorParameter("SYS_OD_CALC_CTRL", "PLANT_CD", searchStruct.getPLANT_CD());
			}
			if (Integer.parseInt(jobOdCalcFlg)>0) {
				setErrorMessage("AC00236");
				setErrorParameter("SYS_JOB_OD_CALC_CTRL", "PLANT_CD", searchStruct.getPLANT_CD());
				setErrorParameter("SYS_JOB_OD_CALC_CTRL", "JOB_ODR_CD", struct.getJOB_ODR_CD()+" OR "+searchStruct.getJOB_ODR_CD_2());
			}

			if (Integer.parseInt(jobOdMntFlg)>0 || "9".equals(jobOdrExpTyp) == false 
					|| ("2".equals(struct.getALC_TYP_2()) && "9".equals(jobOdrExpTyp2) == false)) {
				setErrorMessage("AC00205");
				setErrorParameter("SYS_JOB_OD_CALC_CTRL", "PLANT_CD", searchStruct.getPLANT_CD());
				setErrorParameter("SYS_JOB_OD_CALC_CTRL", "JOB_ODR_CD",  struct.getJOB_ODR_CD()+" OR "+searchStruct.getJOB_ODR_CD_2());
			}
			/*
			if (odMntFlg.equals("1") || jobOdrExpTyp.equals("9") == false 
					|| (struct.getl_ALC_TYP_2().equals("2") && jobOdrExpTyp2.equals("9") == false)) {
				setErrorMessage("AC00205");
				setErrorParameter("SYS_OD_CALC_CTRL", "PLANT_CD", searchStruct.getPLANT_CD());
			}*/
			searchStruct.setPLANT_CD(sysPLANT_CD);
			searchStruct.setOD_NO(struct.geth_OD_NO());
			resultList = entity.mT_OD_3.read(conn, searchStruct);
			String mrpTyp = ((AC0100010Struct)resultList.get(0)).getMRP_TYP();
			if (mrpTyp.equals("3")) {
				setErrorMessage("AC00213");
				setErrorParameter("T_OD", "OD_NO", searchStruct.getOD_NO());
			}
			
			if (struct.getl_ALC_TYP_2().equals("1")) {
				deleteStruct.setPLANT_CD(sysPLANT_CD);
				deleteStruct.setOD_NO(struct.geth_OD_NO());
				deleteStruct.setALC_STOCK_TYP("1");
				deleteStruct.setISSUE_CMPLT_FLG("0");
				deleteStruct.setITEM_CD("");
				deleteStruct.setJOB_ODR_CD("");
				deleteStruct.setJOB_ODR_DETAIL_NO("");
			} else if (struct.getl_ALC_TYP_2().equals("2")) {
				deleteStruct.setPLANT_CD(sysPLANT_CD);
				deleteStruct.setOD_NO(struct.geth_OD_NO());
				deleteStruct.setJOB_ODR_CD(struct.getl_JOB_ODR_CD());
				deleteStruct.setJOB_ODR_DETAIL_NO(struct.getl_JOB_ODR_DETAIL_NO());
				deleteStruct.setJOB_ODR_CANCEL_NO(struct.getl_JOB_ODR_CANCEL_NO());
				deleteStruct.setALC_STOCK_TYP("2");
				deleteStruct.setISSUE_CMPLT_FLG("0");
			}
			
			// 更新回数チェック
			resultList = entity.mT_JOB_ODR_ALC_LOCK.read(conn, deleteStruct);
			String modifyCount = ((AC0100010Struct)resultList.get(0)).getMODIFY_COUNT();
			String issueedQty = ((AC0100010Struct)resultList.get(0)).getISSUEED_QTY();
			if (struct.getl_MODIFY_COUNT().equals(modifyCount) == false) {
				setErrorMessage("ZZ01105");
				if (struct.getl_ALC_TYP_2().equals("1")) {
					setErrorParameter("T_JOB_ODR_ALC", "PLANT_CD", deleteStruct.getPLANT_CD());
					setErrorParameter("T_JOB_ODR_ALC", "OD_NO", deleteStruct.getOD_NO());
					setErrorParameter("T_JOB_ODR_ALC", "ALC_STOCK_TYP", deleteStruct.getALC_STOCK_TYP());
					setErrorParameter("T_JOB_ODR_ALC", "ISSUE_CMPLT_FLG", deleteStruct.getISSUE_CMPLT_FLG());
				} else if (struct.getl_ALC_TYP_2().equals("2")) {
					setErrorParameter("T_JOB_ODR_ALC", "PLANT_CD", deleteStruct.getPLANT_CD());
					setErrorParameter("T_JOB_ODR_ALC", "OD_NO", deleteStruct.getOD_NO());
					setErrorParameter("T_JOB_ODR_ALC", "JOB_ODR_CD", deleteStruct.getJOB_ODR_CD());
					setErrorParameter("T_JOB_ODR_ALC", "JOB_ODR_DETAIL_NO", 
							deleteStruct.getJOB_ODR_DETAIL_NO());
					setErrorParameter("T_JOB_ODR_ALC", "ALC_STOCK_TYP", deleteStruct.getALC_STOCK_TYP());
					setErrorParameter("T_JOB_ODR_ALC", "ISSUE_CMPLT_FLG", deleteStruct.getISSUE_CMPLT_FLG());
				}
			}
			
			if (Calculate.compare(issueedQty, "0") == 1) {
				setErrorMessage("AC00214");
				if (struct.getl_ALC_TYP_2().equals("1")) {
					setErrorParameter("T_JOB_ODR_ALC", "PLANT_CD", deleteStruct.getPLANT_CD());
					setErrorParameter("T_JOB_ODR_ALC", "OD_NO", deleteStruct.geth_OD_NO());
					setErrorParameter("T_JOB_ODR_ALC", "ALC_STOCK_TYP", deleteStruct.getALC_STOCK_TYP());
					setErrorParameter("T_JOB_ODR_ALC", "ISSUE_CMPLT_FLG", deleteStruct.getISSUE_CMPLT_FLG());
				} else {
					setErrorParameter("T_JOB_ODR_ALC", "PLANT_CD", deleteStruct.getPLANT_CD());
					setErrorParameter("T_JOB_ODR_ALC", "OD_NO", deleteStruct.geth_OD_NO());
					setErrorParameter("T_JOB_ODR_ALC", "JOB_ODR_CD", deleteStruct.getl_JOB_ODR_CD());
					setErrorParameter("T_JOB_ODR_ALC", "JOB_ODR_DETAIL_NO", 
							deleteStruct.getl_JOB_ODR_DETAIL_NO());
					setErrorParameter("T_JOB_ODR_ALC", "ALC_STOCK_TYP", deleteStruct.getALC_STOCK_TYP());
					setErrorParameter("T_JOB_ODR_ALC", "ISSUE_CMPLT_FLG", deleteStruct.getISSUE_CMPLT_FLG());
				}
			}
			// エラーがあれば終了
			if (msgStruct.hasError()) {
				return;
			}
			
			int cnt = 0;
			deleteStruct.setsUser_ID(struct.getsUser_ID());
			deleteStruct.setsSysdate(struct.getsSysdate());
			deleteStruct.setsOraganization_CD(struct.getsOrganization_CD());
			if (msgStruct.sizeError() <= 0) {
				if (struct.getl_ALC_TYP_2().equals("1")) {
					cnt = entity.mdeleteT_JOB_ODR_ALC_2.delete(conn, deleteStruct);
				} else {
					cnt = entity.mdeleteT_JOB_ODR_ALC.delete(conn, deleteStruct);
				}
				AC0100010Struct updateStruct = new AC0100010Struct();
				updateStruct.setsUser_ID(struct.getsUser_ID());
				updateStruct.setsSysdate(struct.getsSysdate());
				updateStruct.setsOraganization_CD(struct.getsOrganization_CD());
				updateStruct.setOD_GNR_TYP("1");
				updateStruct.setOD_NO(struct.geth_OD_NO());
				updateStruct.setPLANT_CD(sysPLANT_CD);
				List todList = entity.mSELECT_T_OD.read(conn, updateStruct);
				cnt = entity.mupdateT_OD.update(conn, updateStruct);
				conn.commit();
			}
			controlSelect();
		} catch (ResourceBusyException e) {
			e.printStackTrace();
			setErrorMessage("ZZ01105");
			setReadStatus(ERROR);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new ExpjException(e);
		} catch (Exception e) {
			e.printStackTrace();
			throw new ExpjException(e);
		} finally {
			try {
				conn.rollback();
			} catch(Exception e) {
				e.printStackTrace();
				throw new ExpjException(e);
			}
		}
                //}}user_implement_dev:<controlAlcDelete>
		logger.exiting("AC0100010Control"+":USER="+struct.getsUser_ID(),"controlAlcDelete");

		return;
	}

	/**
	 * 引当追加ボタン押下時に実行される処理です。
	 *
	 */
	public void controlAlcInsert() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0100");
		logger.entering("AC0100010Control"+":USER="+struct.getsUser_ID(),"controlAlcInsert");
			//{{user_implement_dev:<controlAlcInsert>
			// TODO: ユーザ定義のコードを記述してください
		
		mode = "AlcInsert";
		
		try{
		DateTimeFormat dtf = new DateTimeFormat(conn);
		String comboValue = struct.getUNIT_QTY_TYP();
		String comboName = UNIT_QTY_TYP;
		String comboDisplayName = getComboDisplayName(unitQtyTypCombo, comboValue);
		struct.setUNIT_QTY_TYP_DN(comboDisplayName);
		struct.setALC_TYP_2(struct.getl_ALC_TYP_2());
		comboValue = struct.getl_ALC_TYP_2();
		comboName = ALC_TYP_2;
		comboDisplayName = getComboDisplayName(alcTyp2Combo, comboValue);
		struct.setALC_TYP_2_DN(comboDisplayName);
		struct.setJOB_ODR_CD_2(struct.getl_JOB_ODR_CD());
		struct.setJOB_ODR_DETAIL_NO_2(struct.getl_JOB_ODR_DETAIL_NO());
		struct.setJOB_ODR_CANCEL_NO_2(struct.getl_JOB_ODR_CANCEL_NO());
		struct.setALCD_QTY("0");
		struct.setISSUEED_QTY(null);
		struct.setISSUE_REMAIN_QTY(struct.getl_ALCD_QTY());
		struct.setALLOCATABLE_QTY(struct.getl_ALLOCATABLE_QTY());
		struct.setSTOCK_ON_HAND_QTY(struct.getl_STOCK_ON_HAND_QTY());
		struct.setODR_QTY(struct.getl_ODR_QTY());
		struct.setTOTAL_RCV_QTY(struct.getl_TOTAL_RCV_QTY());
		struct.setODR_STS_TYP(struct.getl_ODR_STS_TYP());
		comboValue = struct.getl_ODR_STS_TYP();
		comboName = ODR_STS_TYP;
		comboDisplayName = getComboDisplayName(odrStsTypCombo, comboValue);
		struct.setODR_STS_TYP_DN(comboDisplayName);
		struct.setALC_GRP_CD_2(struct.getl_ALC_GRP_CD());
		struct.setJOB_ODR_STS_TYP_2(struct.getl_JOB_ODR_STS_TYP());
		comboValue = struct.getl_JOB_ODR_STS_TYP();
		comboName = JOB_ODR_STS_TYP;
		comboDisplayName = getComboDisplayName(jobOdrStsTypCombo, comboValue);
		struct.setJOB_ODR_STS_TYP_DN_2(comboDisplayName);
				
	    struct.setPRD_DUE_DATE(dtf.getDatePart(struct.getl_PRD_DUE_DATE()));
        struct.setODR_START_DATE(dtf.getDatePart(struct.getl_ODR_START_DATE()));
	    struct.setPRD_START_DATE(dtf.getDatePart(struct.getl_PRD_START_DATE()));
        struct.setPRD_DUE_TIME(dtf.getCoronTimePart(struct.getl_PRD_DUE_DATE()));
	    struct.setODR_START_TIME(dtf.getCoronTimePart(struct.getl_ODR_START_DATE()));
        struct.setPRD_START_TIME(dtf.getCoronTimePart(struct.getl_PRD_START_DATE()));
				
		struct.setSTOCK_UNIT(struct.getSTOCK_UNIT());
		struct.setSTOCK_UNIT_1(struct.getSTOCK_UNIT());
		struct.setSTOCK_UNIT_2(struct.getSTOCK_UNIT());
		struct.setSTOCK_UNIT_3(struct.getSTOCK_UNIT());
		struct.setSTOCK_UNIT_4(struct.getSTOCK_UNIT());
		struct.setSTOCK_UNIT_5(struct.getSTOCK_UNIT());
		// 引当出庫済数の計量単位にnullを設定
		struct.setSTOCK_UNIT_6(null);
		struct.setSTOCK_UNIT_7(struct.getSTOCK_UNIT());
		struct.setSTOCK_UNIT_8(struct.getSTOCK_UNIT());
		struct.setSTOCK_UNIT_9(struct.getSTOCK_UNIT());
		// オーダ数、入庫累計数の計量単位にnullを設定
		if (struct.getl_ALC_TYP_2().equals("1")) {
			struct.setSTOCK_UNIT_10(null);
			struct.setSTOCK_UNIT_11(null);
		} else {
			struct.setSTOCK_UNIT_10(struct.getSTOCK_UNIT());
			struct.setSTOCK_UNIT_11(struct.getSTOCK_UNIT());
		}
		
		} catch(Exception e) {
				e.printStackTrace();
				throw new ExpjException(e);
		}
				
                //}}user_implement_dev:<controlAlcInsert>
		logger.exiting("AC0100010Control"+":USER="+struct.getsUser_ID(),"controlAlcInsert");

		return;
	}

	/**
	 * 登録ボタン押下時に実行される処理です。
	 *
	 */
	public void controlInsert() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0100");
		logger.entering("AC0100010Control"+":USER="+struct.getsUser_ID(),"controlInsert");
			//{{user_implement_dev:<controlInsert>
			// TODO: ユーザ定義のコードを記述してください
		try {
			
			String errorUrl = "/AC0100011.jsp";
			setNextUrl("/AC0100010.jsp");
			AC0100010Struct searchStruct = new AC0100010Struct();
			searchStruct.setPLANT_CD(sysPLANT_CD);
			List resultList = entity.mSYS_OD_CALC_CTRL.read(conn, searchStruct);
			String odCalcFlg = ((AC0100010Struct)resultList.get(0)).getOD_CALC_FLG();
			//String odMntFlg = ((AC0100010Struct)resultList.get(0)).getOD_MNT_FLG();
			
			searchStruct.setJOB_ODR_CD(struct.getJOB_ODR_CD());
			searchStruct.setJOB_ODR_CD_2(struct.getJOB_ODR_CD_2());
			resultList = entity.mSYS_JOB_OD_CALC_CTRL.read(conn, searchStruct);
			String jobOdCalcFlg = ((AC0100010Struct)resultList.get(0)).getOD_CALC_FLG();
			String jobOdMntFlg = ((AC0100010Struct)resultList.get(0)).getOD_MNT_FLG();
			if(jobOdCalcFlg==null||"".equals(jobOdCalcFlg)){
				jobOdCalcFlg = "0";
			}
			if(jobOdMntFlg==null||"".equals(jobOdMntFlg)){
				jobOdMntFlg = "0";
			}
			
			// 引当元製番の製番処理区分
			searchStruct.setJOB_ODR_CD(struct.getJOB_ODR_CD());
			searchStruct.setJOB_ODR_DETAIL_NO(struct.getJOB_ODR_DETAIL_NO());
			searchStruct.setJOB_ODR_CANCEL_NO(struct.getJOB_ODR_CANCEL_NO());
			resultList = entity.mT_JOB_ODR.read(conn, searchStruct);
			String jobOdrExpTyp = ((AC0100010Struct)resultList.get(0)).getJOB_ODR_EXP_TYP();
			
			// 引当先製番の製番処理区分
			String jobOdrExpTyp2 = null;
			if ("2".equals(struct.getALC_TYP_2())) {
				searchStruct.setPLANT_CD(sysPLANT_CD);
				searchStruct.setJOB_ODR_CD(struct.getJOB_ODR_CD_2());
				searchStruct.setJOB_ODR_DETAIL_NO(struct.getJOB_ODR_DETAIL_NO_2());
				searchStruct.setJOB_ODR_CANCEL_NO(struct.getJOB_ODR_CANCEL_NO_2());
				resultList = entity.mT_JOB_ODR.read(conn, searchStruct);
				jobOdrExpTyp2 = ((AC0100010Struct)resultList.get(0)).getJOB_ODR_EXP_TYP();
			}
			
			if ("1".equals(odCalcFlg)) {
				setErrorMessage("AC00206");
				setErrorParameter("SYS_OD_CALC_CTRL", "PLANT_CD", searchStruct.getPLANT_CD());
			}
			
			if (Integer.parseInt(jobOdCalcFlg)>0) {
				setErrorMessage("AC00236");
				setErrorParameter("SYS_JOB_OD_CALC_CTRL", "PLANT_CD", searchStruct.getPLANT_CD());
				setErrorParameter("SYS_JOB_OD_CALC_CTRL", "JOB_ODR_CD",  struct.getJOB_ODR_CD()+" OR "+searchStruct.getJOB_ODR_CD_2());
			}
			
			if (Integer.parseInt(jobOdMntFlg)>0 || "9".equals(jobOdrExpTyp) == false 
					|| ("2".equals(struct.getALC_TYP_2()) && "9".equals(jobOdrExpTyp2) == false)) {
				setErrorMessage("AC00205");
				setErrorParameter("SYS_JOB_OD_CALC_CTRL", "PLANT_CD", searchStruct.getPLANT_CD());
				setErrorParameter("SYS_JOB_OD_CALC_CTRL", "JOB_ODR_CD",  struct.getJOB_ODR_CD()+" OR "+searchStruct.getJOB_ODR_CD_2());
			}
			
			searchStruct.setPLANT_CD(sysPLANT_CD);
			searchStruct.setOD_NO(struct.geth_OD_NO());
			resultList = entity.mT_OD_3.read(conn, searchStruct);
			String mrpTyp = ((AC0100010Struct)resultList.get(0)).getMRP_TYP();
			
			if ("3".equals(mrpTyp)) {
				setErrorMessage("AC00213");
				setErrorParameter("T_OD", "OD_NO", searchStruct.getOD_NO());
			}
			
			if (Calculate.compare(struct.getALCD_QTY(), "0") == 0) {
				setErrorMessage("AC00216");
			}
			
			Double allocatableStockQty = new Double("0");
			if ("1".equals(struct.getALC_TYP_2())) {
				allocatableStockQty = getAllocatableStockQty(sysPLANT_CD, struct.getITEM_CD());
			} else if (struct.getALC_TYP_2().equals("2")) {
				allocatableStockQty = getJobOdrCdStockAllocatableQty(
						struct.getJOB_ODR_CD_2(), struct.getJOB_ODR_DETAIL_NO_2(), struct.getITEM_CD(),
						true, true, true, true);
			}
			
			if (Calculate.compare(allocatableStockQty.toString(), struct.getALCD_QTY()) == -1) {
				setErrorMessage("AC00215");
			}
			
			// エラーがあれば終了
			if (msgStruct.hasError()) {
				setNextUrl(errorUrl);
				return;
			}
			AC0100010Struct insertStruct = new AC0100010Struct();
			insertStruct.setALCD_QTY(struct.getALCD_QTY());
			if ("1".equals(struct.getUNIT_QTY_TYP())) {
				String ceilAlcdQty = Calculate.ceil(struct.getALCD_QTY(), 0);
				if (Calculate.compare(ceilAlcdQty, struct.getALCD_QTY()) != 0) {
					insertStruct.setALCD_QTY(ceilAlcdQty);
					setWarningMessage("AC00217");
				}
			}
			if (struct.getALC_GRP_CD().equals(struct.getALC_GRP_CD_2()) == false) {
				setWarningMessage("AC00223");
			}
			if (struct.getDUE_DATE() != null && struct.getDUE_DATE().equals("") == false
					&& struct.getPRD_DUE_DATE() != null && struct.getPRD_DUE_DATE().equals("") == false) {
				if (DateTool.compareYMD(struct.getDUE_DATE(), struct.getPRD_DUE_DATE()) < 0) {
					setWarningMessage("AC00218");
				}else if(DateTool.compareYMD(struct.getDUE_DATE(), struct.getPRD_DUE_DATE()) == 0){	
							String sDueTime = struct.getDUE_TIME();
							if(null == sDueTime || "".equals(sDueTime.trim())){
								sDueTime = "00:00";
							}
							String sPrdDueTime = struct.getPRD_DUE_TIME();
							if(null == sPrdDueTime || "".equals(sPrdDueTime.trim())){
								sPrdDueTime = "00:00";
							}
							if(sDueTime.compareTo(sPrdDueTime) < 0){
								setWarningMessage("AC00218");
							}
				}
			}
			
			Numbering jobOdrAlcCdNumbering = null;
			String jobOdrAlcCd = null;
			List searchList = null;
			AC0100010Struct resultStruct = null;
			AC0100010Struct updateStruct = new AC0100010Struct();
			jobOdrAlcCdNumbering = 
					new Numbering(
							conn,
							Numbering.JOB_OD_ALC_CD,
							sysUSER_CD,
							sp.getProcId(),
							sysPLANT_CD);
			jobOdrAlcCd = jobOdrAlcCdNumbering.getNo();
			insertStruct.setJOB_ODR_ALC_CD(jobOdrAlcCd);
			
			// オーダデマンド番号
			insertStruct.setOD_NO(struct.geth_OD_NO());
			
			// 工場コード
			insertStruct.setPLANT_CD(sysPLANT_CD);
			
			// 品目番号
			insertStruct.setITEM_CD(struct.getITEM_CD());
			
			if (struct.getALC_TYP_2().equals("1")) {
				
				// 引当在庫区分
				insertStruct.setALC_STOCK_TYP("1");
				
				// 製番
				insertStruct.setJOB_ODR_CD("");
				
				// 製番枝番
				insertStruct.setJOB_ODR_DETAIL_NO("0");
				
			} else if (struct.getALC_TYP_2().equals("2")) {
				
				// 引当在庫区分
				insertStruct.setALC_STOCK_TYP("2");
				
				// 製番
				insertStruct.setJOB_ODR_CD(struct.getJOB_ODR_CD_2());
				
				// 製番枝番
				insertStruct.setJOB_ODR_DETAIL_NO(struct.getJOB_ODR_DETAIL_NO_2());
				
			}
			
			// 出庫済み数
			insertStruct.setISSUEED_QTY("0");
			
			// 出庫完了フラグ
			insertStruct.setISSUE_CMPLT_FLG("0");
			
			insertStruct.setsUser_ID(struct.getsUser_ID());
			insertStruct.setsSysdate(struct.getsSysdate());
			insertStruct.setsOraganization_CD(struct.getsOrganization_CD());
			
			int cnt = 0;
			if (msgStruct.sizeError() <= 0) {
				cnt = entity.minsertT_JOB_ODR_ALC.create(conn, insertStruct);
				updateStruct.setsUser_ID(struct.getsUser_ID());
				updateStruct.setsSysdate(struct.getsSysdate());
				updateStruct.setsOraganization_CD(struct.getsOrganization_CD());
				updateStruct.setOD_GNR_TYP("1");  // 所要量発生処理区分 1:マニュアル登録
				updateStruct.setOD_NO(struct.geth_OD_NO()); // オーダデマンド番号
				updateStruct.setPLANT_CD(sysPLANT_CD); // 工場コード
				cnt = entity.mupdateT_OD.update(conn, updateStruct);
				conn.commit();
			}
			controlSelect();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new ExpjException(e);
		} catch (ParseException e) {
			e.printStackTrace();
			throw new ExpjException(e);
		} catch (Exception e) {
			e.printStackTrace();
			throw new ExpjException(e);
		} finally {
			try {
				conn.rollback();
			} catch(Exception e) {
				e.printStackTrace();
				throw new ExpjException(e);
			}
		}
                //}}user_implement_dev:<controlInsert>
		logger.exiting("AC0100010Control"+":USER="+struct.getsUser_ID(),"controlInsert");

		return;
	}

	/**
	 * 更新ボタン押下時に実行される処理です。
	 *
	 */
	public void controlUpdate() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0100");
		logger.entering("AC0100010Control"+":USER="+struct.getsUser_ID(),"controlUpdate");
			//{{user_implement_dev:<controlUpdate>
			// TODO: ユーザ定義のコードを記述してください
		try {
			
			String errorUrl = "/AC0100011.jsp";
			setNextUrl("/AC0100010.jsp");
			
			Numbering jobOdrAlcCdNumbering = null;
			String jobOdrAlcCd = null;
			List searchList = null;
			AC0100010Struct searchStruct = null;
			AC0100010Struct resultStruct = null;
			AC0100010Struct updateStruct = new AC0100010Struct();
			
			searchStruct = new AC0100010Struct();
			
			searchStruct.setPLANT_CD(sysPLANT_CD);
			List resultList = entity.mSYS_OD_CALC_CTRL.read(conn, searchStruct);
			String odCalcFlg = ((AC0100010Struct)resultList.get(0)).getOD_CALC_FLG();
			//String odMntFlg = ((AC0100010Struct)resultList.get(0)).getOD_MNT_FLG();
			
			searchStruct.setJOB_ODR_CD(struct.getJOB_ODR_CD());
			searchStruct.setJOB_ODR_CD_2(struct.getJOB_ODR_CD_2());
			resultList = entity.mSYS_JOB_OD_CALC_CTRL.read(conn, searchStruct);
			String jobOdCalcFlg = ((AC0100010Struct)resultList.get(0)).getOD_CALC_FLG();
			String jobOdMntFlg = ((AC0100010Struct)resultList.get(0)).getOD_MNT_FLG();
			if(jobOdCalcFlg==null||"".equals(jobOdCalcFlg)){
				jobOdCalcFlg = "0";
			}
			if(jobOdMntFlg==null||"".equals(jobOdMntFlg)){
				jobOdMntFlg = "0";
			}
			
			// 引当元製番の製番処理区分
			searchStruct.setJOB_ODR_CD(struct.getJOB_ODR_CD());
			searchStruct.setJOB_ODR_DETAIL_NO(struct.getJOB_ODR_DETAIL_NO());
			searchStruct.setJOB_ODR_CANCEL_NO(struct.getJOB_ODR_CANCEL_NO());
			resultList = entity.mT_JOB_ODR.read(conn, searchStruct);
			String jobOdrExpTyp = ((AC0100010Struct)resultList.get(0)).getJOB_ODR_EXP_TYP();
			
			String jobOdrExpTyp2 = null;
			if (struct.getALC_TYP_2().equals("2")) {
				// 引当先製番の製番処理区分
				searchStruct.setPLANT_CD(sysPLANT_CD);
				searchStruct.setJOB_ODR_CD(struct.getJOB_ODR_CD_2());
				searchStruct.setJOB_ODR_DETAIL_NO(struct.getJOB_ODR_DETAIL_NO_2());
				searchStruct.setJOB_ODR_CANCEL_NO(struct.getJOB_ODR_CANCEL_NO_2());
				resultList = entity.mT_JOB_ODR.read(conn, searchStruct);
				jobOdrExpTyp2 = ((AC0100010Struct)resultList.get(0)).getJOB_ODR_EXP_TYP();
			}
							
			// [所要量計算制御]."所要量計算中フラグ" = 1 の場合エラー
			// 所要量計算実行中のためメンテナンスできません。
			if (odCalcFlg.equals("1")) {
				setErrorMessage("AC00206");
				setErrorParameter("SYS_OD_CALC_CTRL", "PLANT_CD", searchStruct.getPLANT_CD());
			}
			
			// [所要量計算制御(製番)]."所要量計算中フラグ" = 1 の場合エラー
			// 所要量計算実行中のためメンテナンスできません。			
			if (Integer.parseInt(jobOdCalcFlg)>0) {
				setErrorMessage("AC00236");
				setErrorParameter("SYS_JOB_OD_CALC_CTRL", "PLANT_CD", searchStruct.getPLANT_CD());
				setErrorParameter("SYS_JOB_OD_CALC_CTRL", "JOB_ODR_CD",  struct.getJOB_ODR_CD()+" OR "+searchStruct.getJOB_ODR_CD_2());
			}

			// [所要量計算制御(製番)]."所要量メンテナンス中フラグ" = 1
			// or 引当元製番の製番処理区分 <> 9
			// or 引当先製番の製番処理区分 <> 9 の場合エラー
			// 製番引当メンテナンスを行うには、所要量計算を実行する必要があります。
			if (Integer.parseInt(jobOdMntFlg)>0 || "9".equals(jobOdrExpTyp) == false 
					|| ("2".equals(struct.getALC_TYP_2()) && "9".equals(jobOdrExpTyp2) == false)) {
				setErrorMessage("AC00205");
				setErrorParameter("SYS_JOB_OD_CALC_CTRL", "PLANT_CD", searchStruct.getPLANT_CD());
				setErrorParameter("SYS_JOB_OD_CALC_CTRL", "JOB_ODR_CD",  struct.getJOB_ODR_CD()+" OR "+searchStruct.getJOB_ODR_CD_2());
			}
			/*
			// [所要量計算制御]."所要量メンテナンス中フラグ" = 1
			// or 引当元製番の製番処理区分 <> 9
			// or 引当先製番の製番処理区分 <> 9 の場合エラー
			// 製番引当メンテナンスを行うには、所要量計算を実行する必要があります。
			if (odMntFlg.equals("1") || jobOdrExpTyp.equals("9") == false 
					|| (struct.getALC_TYP_2().equals("2") && jobOdrExpTyp2.equals("9") == false)) {
				setErrorMessage("AC00205");
				setErrorParameter("SYS_OD_CALC_CTRL", "PLANT_CD", searchStruct.getPLANT_CD());
			}*/
			
			// [所要量]."所要量処理区分" = 3 の場合エラー
			// 指定された所要量は論理削除されているためメンテナンスできません。
			searchStruct.setPLANT_CD(sysPLANT_CD);
			searchStruct.setOD_NO(struct.geth_OD_NO());
			resultList = entity.mT_OD_3.read(conn, searchStruct);
			String mrpTyp = ((AC0100010Struct)resultList.get(0)).getMRP_TYP();
			if (mrpTyp.equals("3")) {
				setErrorMessage("AC00213");
				setErrorParameter("T_OD", "OD_NO", searchStruct.getOD_NO());
			}
			
			Double allocatableStockQty = new Double("0");
			if (struct.getALC_TYP_2().equals("1")) {
				allocatableStockQty = getAllocatableStockQty(sysPLANT_CD, struct.getITEM_CD());
			} else if (struct.getALC_TYP_2().equals("2")) {
				allocatableStockQty = getJobOdrCdStockAllocatableQty(
						struct.getJOB_ODR_CD_2(), struct.getJOB_ODR_DETAIL_NO_2(), struct.getITEM_CD(),
						true, true, true, true);
			}
			
			searchStruct = new AC0100010Struct();
			searchList = null;
			if (struct.getALC_TYP_2().equals("1")) {
				searchStruct.setPLANT_CD(sysPLANT_CD);
				searchStruct.setOD_NO(struct.geth_OD_NO());
				searchStruct.setALC_STOCK_TYP("1");
				searchStruct.setISSUE_CMPLT_FLG("0");
			} else if (struct.getALC_TYP_2().equals("2")) {
				searchStruct.setPLANT_CD(sysPLANT_CD);
				searchStruct.setOD_NO(struct.geth_OD_NO());
				searchStruct.setJOB_ODR_CD(struct.getJOB_ODR_CD_2());
				searchStruct.setJOB_ODR_DETAIL_NO(struct.getJOB_ODR_DETAIL_NO_2());
				searchStruct.setALC_STOCK_TYP("2");
				searchStruct.setISSUE_CMPLT_FLG("0");
			}
			searchList = entity.mT_JOB_ODR_ALC_4.read(conn, searchStruct);
			resultStruct = (AC0100010Struct)(searchList.get(0));
			String alcdQtyBefore = resultStruct.getALCD_QTY();
			String sum = Calculate.add(allocatableStockQty.toString(), alcdQtyBefore);
			
			if (Calculate.compare(sum, struct.getALCD_QTY()) == -1) {
				setErrorMessage("AC00215");
			}
			
			if (Calculate.compare(alcdQtyBefore, struct.getALCD_QTY()) != 0) {
				
				// オーダデマンド番号
				updateStruct.setOD_NO(struct.geth_OD_NO());
				
				// 工場コード
				updateStruct.setPLANT_CD(sysPLANT_CD);
				
				// 品目番号
				updateStruct.setITEM_CD(struct.getITEM_CD());
				
				if (struct.getALC_TYP_2().equals("1")) {
					
					// 引当在庫区分
					updateStruct.setALC_STOCK_TYP("1");
					
					// 製番
					updateStruct.setJOB_ODR_CD("");
					
					// 製番枝番
					updateStruct.setJOB_ODR_DETAIL_NO("");
					
				} else if (struct.getALC_TYP_2().equals("2")) {
					
					// 引当在庫区分
					updateStruct.setALC_STOCK_TYP("2");
					
					// 製番
					updateStruct.setJOB_ODR_CD(struct.getJOB_ODR_CD_2());
					
					// 製番枝番
					updateStruct.setJOB_ODR_DETAIL_NO(struct.getJOB_ODR_DETAIL_NO_2());
				}
				
				// 引当済み数
				updateStruct.setALCD_QTY(struct.getALCD_QTY());
				
				updateStruct.setsUser_ID(struct.getsUser_ID());
				updateStruct.setsSysdate(struct.getsSysdate());
				updateStruct.setsOraganization_CD(struct.getsOrganization_CD());
				
				// 更新回数チェック＆行ロック
				resultList = entity.mT_JOB_ODR_ALC_LOCK.read(conn, updateStruct);
				String modifyCount = ((AC0100010Struct)resultList.get(0)).getMODIFY_COUNT();
				String issueedQty = ((AC0100010Struct)resultList.get(0)).getISSUEED_QTY();
				
				if (struct.getMODIFY_COUNT().equals(modifyCount) == false) {
					setErrorMessage("ZZ01105");
					if (struct.getALC_TYP_2().equals("1")) {
						setErrorParameter("T_JOB_ODR_ALC", "PLANT_CD", updateStruct.getPLANT_CD());
						setErrorParameter("T_JOB_ODR_ALC", "OD_NO", updateStruct.getOD_NO());
						setErrorParameter("T_JOB_ODR_ALC", "ALC_STOCK_TYP", updateStruct.getALC_STOCK_TYP());
					} else if (struct.getALC_TYP_2().equals("2")) {
						setErrorParameter("T_JOB_ODR_ALC", "PLANT_CD", updateStruct.getPLANT_CD());
						setErrorParameter("T_JOB_ODR_ALC", "OD_NO", updateStruct.getOD_NO());
						setErrorParameter("T_JOB_ODR_ALC", "JOB_ODR_CD", updateStruct.getJOB_ODR_CD());
						setErrorParameter("T_JOB_ODR_ALC", "JOB_ODR_DETAIL_NO", 
								updateStruct.getJOB_ODR_DETAIL_NO());
						setErrorParameter("T_JOB_ODR_ALC", "ALC_STOCK_TYP", updateStruct.getALC_STOCK_TYP());
					}
				}
				
				if (Calculate.compare(issueedQty, struct.getALCD_QTY()) == 1) {
					setErrorMessage("AC00219");
					if (struct.getALC_TYP_2().equals("1")) {
						setErrorParameter("T_JOB_ODR_ALC", "PLANT_CD", updateStruct.getPLANT_CD());
						setErrorParameter("T_JOB_ODR_ALC", "OD_NO", updateStruct.getOD_NO());
						setErrorParameter("T_JOB_ODR_ALC", "ALC_STOCK_TYP", updateStruct.getALC_STOCK_TYP());
					} else if (struct.getALC_TYP_2().equals("2")) {
						setErrorParameter("T_JOB_ODR_ALC", "PLANT_CD", updateStruct.getPLANT_CD());
						setErrorParameter("T_JOB_ODR_ALC", "OD_NO", updateStruct.getOD_NO());
						setErrorParameter("T_JOB_ODR_ALC", "JOB_ODR_CD", updateStruct.getJOB_ODR_CD());
						setErrorParameter("T_JOB_ODR_ALC", "JOB_ODR_DETAIL_NO", 
								updateStruct.getJOB_ODR_DETAIL_NO());
						setErrorParameter("T_JOB_ODR_ALC", "ALC_STOCK_TYP", updateStruct.getALC_STOCK_TYP());
					}
				}
				
				// エラーがあれば終了
				if (msgStruct.hasError()) {
					setNextUrl(errorUrl);
					return;
				}
				
				if ("1".equals(struct.getUNIT_QTY_TYP())) {
					String ceilAlcdQty = Calculate.ceil(struct.getALCD_QTY(), 0);
					if (Calculate.compare(ceilAlcdQty, struct.getALCD_QTY()) != 0) {
						updateStruct.setALCD_QTY(ceilAlcdQty);
						setWarningMessage("AC00217");
					}
				}
				
				if (struct.getALC_GRP_CD().equals(struct.getALC_GRP_CD_2()) == false) {
					setWarningMessage("AC00223");
				}
				
				if (struct.getDUE_DATE() != null && struct.getDUE_DATE().equals("") == false
						&& struct.getPRD_DUE_DATE() != null && struct.getPRD_DUE_DATE().equals("") == false) {
					if (DateTool.compareYMD(struct.getDUE_DATE(), struct.getPRD_DUE_DATE()) < 0) {
						setWarningMessage("AC00218");
					}else if(DateTool.compareYMD(struct.getDUE_DATE(), struct.getPRD_DUE_DATE()) == 0){	
							String sDueTime = struct.getDUE_TIME();
							if(null == sDueTime || "".equals(sDueTime.trim())){
								sDueTime = "00:00";
							}
							String sPrdDueTime = struct.getPRD_DUE_TIME();
							if(null == sPrdDueTime || "".equals(sPrdDueTime.trim())){
								sPrdDueTime = "00:00";
							}
							if(sDueTime.compareTo(sPrdDueTime) < 0){
								setWarningMessage("AC00218");
							}
					}
				}
				
				int cnt = 0;
				if (msgStruct.sizeError() <= 0) {
					if (struct.getALC_TYP_2().equals("1")) {
						cnt = entity.mupdateT_JOB_ODR_ALC_2.update(conn, updateStruct);
					} else {
						cnt = entity.mupdateT_JOB_ODR_ALC.update(conn, updateStruct);
					}
					updateStruct.setOD_GNR_TYP("1");  // 所要量発生処理区分 1:マニュアル登録
					updateStruct.setOD_NO(struct.geth_OD_NO()); // オーダデマンド番号
					updateStruct.setPLANT_CD(sysPLANT_CD); // 工場コード
					cnt = entity.mupdateT_OD.update(conn, updateStruct);
					conn.commit();
				}
			}
			controlSelect();
		
		} catch (SQLException e) {
			e.printStackTrace();
			throw new ExpjException(e);
		} catch (ParseException e) {
			e.printStackTrace();
			throw new ExpjException(e);
		} catch (Exception e) {
			e.printStackTrace();
			throw new ExpjException(e);
		} finally {
			try {
				conn.rollback();
			} catch(Exception e) {
				e.printStackTrace();
				throw new ExpjException(e);
			}
		}
                //}}user_implement_dev:<controlUpdate>
		logger.exiting("AC0100010Control"+":USER="+struct.getsUser_ID(),"controlUpdate");

		return;
	}

	/**
	 * 戻るボタン押下時に実行される処理です。
	 *
	 */
	public void controlReturn() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0100");
		logger.entering("AC0100010Control"+":USER="+struct.getsUser_ID(),"controlReturn");
			//{{user_implement_dev:<controlReturn>
			// TODO: ユーザ定義のコードを記述してください
		
		controlSelect();
		
                //}}user_implement_dev:<controlReturn>
		logger.exiting("AC0100010Control"+":USER="+struct.getsUser_ID(),"controlReturn");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0100");
		logger.entering("AC0100010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AC0100010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0100");
		logger.entering("AC0100010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
			// TODO: ユーザ定義のコードを記述してください
			// データベースへのアクセスを行う場合は、このtry catch文のコメントを外してください。
		
		// 画面遷移の呼び出しだったら、Structに画面遷移キーを設定してcontrolSelect()を呼び出す
		if ( isScreenMove() == true ) {
			
			struct.setOD_NO(odNo);
			
			// 検索のコントロールメソッドを呼び出します。
			controlSelect();
		}
		
		mode = null;
		
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AC0100010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * イベントハンドラの前処理です。
	 *
	 * @param buttun ボタン名
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0100");
		logger.entering("AC0100010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			try {
				ComboBox comboController = new ComboBox(conn, sysUSER_CD);
				alcTyp2Combo = comboController.getData(ALC_TYP_2);
				unitQtyTypCombo = comboController.getData(UNIT_QTY_TYP);
				odrStsTypCombo = comboController.getData(ODR_STS_TYP);
				dmStsTypCombo = comboController.getData(DM_STS_TYP);
				jobOdrStsTypCombo = comboController.getData(JOB_ODR_STS_TYP);
			} catch (SQLException e) {
				e.printStackTrace();
				ExpjMessage emsg = new ExpjMessage("ZZ01106");
				sysLog.severe(emsg, getsysUSER_CD());//致命的エラー エラー内容
				ExpjException ee = new ExpjException(e, emsg); // エクセプションを生成
				throw ee;
			}
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("AC0100010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("Clear") ) {
				controlClear();
			} else if( button.equals("AlcUpdate") ) {
				controlAlcUpdate();
			} else if( button.equals("AlcDelete") ) {
				controlAlcDelete();
			} else if( button.equals("AlcInsert") ) {
				controlAlcInsert();
			} else if( button.equals("Insert") ) {
				controlInsert();
			} else if( button.equals("Update") ) {
				controlUpdate();
			} else if( button.equals("Return") ) {
				controlReturn();
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
//			throw new FoundationException("AC0100010Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AC0100010-E999","CSVの出力処理"));
			throw new FoundationException("AC0100010Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AC0100010-E999","システム日付の取得処理"));
				throw new FoundationException("AC0100010Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AC0100010-E999","コントロールのイベント処理"));
			throw new FoundationException("AC0100010Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected AC0100010Entity entity;
	protected AC0100010Struct struct;
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

		entity = new AC0100010Entity();
		struct = new AC0100010Struct();

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
	 * AC0100010クラスの標準コンストラクタ
	 */
	public AC0100010Control() throws BusinessProcessException, FoundationException
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
				AC0100010Struct key = (AC0100010Struct)keyList.get(j);
				// メッセージキーを作成する
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("l_JOB_ODR_CD") && key.getl_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("l_JOB_ODR_CD", key.getl_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ALCD_QTY") && key.getl_ALCD_QTY() != null) {
					msgKey.setKeyValue("l_ALCD_QTY", key.getl_ALCD_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_STOCK_ON_HAND_QTY") && key.getl_STOCK_ON_HAND_QTY() != null) {
					msgKey.setKeyValue("l_STOCK_ON_HAND_QTY", key.getl_STOCK_ON_HAND_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_ODR_STS_TYP_DN") && key.getl_ODR_STS_TYP_DN() != null) {
					msgKey.setKeyValue("l_ODR_STS_TYP_DN", key.getl_ODR_STS_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("l_PRD_DUE_DATE") && key.getl_PRD_DUE_DATE() != null) {
					msgKey.setKeyValue("l_PRD_DUE_DATE", key.getl_PRD_DUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_TOTAL_RCV_QTY") && key.getl_TOTAL_RCV_QTY() != null) {
					msgKey.setKeyValue("l_TOTAL_RCV_QTY", key.getl_TOTAL_RCV_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_ODR_START_DATE") && key.getl_ODR_START_DATE() != null) {
					msgKey.setKeyValue("l_ODR_START_DATE", key.getl_ODR_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_PRD_START_DATE") && key.getl_PRD_START_DATE() != null) {
					msgKey.setKeyValue("l_PRD_START_DATE", key.getl_PRD_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("STOCK_ON_HAND_QTY") && key.getSTOCK_ON_HAND_QTY() != null) {
					msgKey.setKeyValue("STOCK_ON_HAND_QTY", key.getSTOCK_ON_HAND_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_ODR_QTY") && key.getl_ODR_QTY() != null) {
					msgKey.setKeyValue("l_ODR_QTY", key.getl_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_ALC_GRP_CD") && key.getl_ALC_GRP_CD() != null) {
					msgKey.setKeyValue("l_ALC_GRP_CD", key.getl_ALC_GRP_CD());
				}
				if(msgKeyType.containsKeyColumn("l_JOB_ODR_STS_TYP_DN") && key.getl_JOB_ODR_STS_TYP_DN() != null) {
					msgKey.setKeyValue("l_JOB_ODR_STS_TYP_DN", key.getl_JOB_ODR_STS_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("l_ODR_STS_TYP") && key.getl_ODR_STS_TYP() != null) {
					msgKey.setKeyValue("l_ODR_STS_TYP", key.getl_ODR_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_JOB_ODR_STS_TYP") && key.getl_JOB_ODR_STS_TYP() != null) {
					msgKey.setKeyValue("l_JOB_ODR_STS_TYP", key.getl_JOB_ODR_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("ALLOCATABLE_QTY") && key.getALLOCATABLE_QTY() != null) {
					msgKey.setKeyValue("ALLOCATABLE_QTY", key.getALLOCATABLE_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_ALLOCATABLE_QTY") && key.getl_ALLOCATABLE_QTY() != null) {
					msgKey.setKeyValue("l_ALLOCATABLE_QTY", key.getl_ALLOCATABLE_QTY());
				}
				if(msgKeyType.containsKeyColumn("SUM_OF_ALLOCATABLE_QTY") && key.getSUM_OF_ALLOCATABLE_QTY() != null) {
					msgKey.setKeyValue("SUM_OF_ALLOCATABLE_QTY", key.getSUM_OF_ALLOCATABLE_QTY());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT_2") && key.getSTOCK_UNIT_2() != null) {
					msgKey.setKeyValue("STOCK_UNIT_2", key.getSTOCK_UNIT_2());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT_3") && key.getSTOCK_UNIT_3() != null) {
					msgKey.setKeyValue("STOCK_UNIT_3", key.getSTOCK_UNIT_3());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT_1") && key.getSTOCK_UNIT_1() != null) {
					msgKey.setKeyValue("STOCK_UNIT_1", key.getSTOCK_UNIT_1());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT_4") && key.getSTOCK_UNIT_4() != null) {
					msgKey.setKeyValue("STOCK_UNIT_4", key.getSTOCK_UNIT_4());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT_5") && key.getSTOCK_UNIT_5() != null) {
					msgKey.setKeyValue("STOCK_UNIT_5", key.getSTOCK_UNIT_5());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT_6") && key.getSTOCK_UNIT_6() != null) {
					msgKey.setKeyValue("STOCK_UNIT_6", key.getSTOCK_UNIT_6());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT_7") && key.getSTOCK_UNIT_7() != null) {
					msgKey.setKeyValue("STOCK_UNIT_7", key.getSTOCK_UNIT_7());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT_8") && key.getSTOCK_UNIT_8() != null) {
					msgKey.setKeyValue("STOCK_UNIT_8", key.getSTOCK_UNIT_8());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT_9") && key.getSTOCK_UNIT_9() != null) {
					msgKey.setKeyValue("STOCK_UNIT_9", key.getSTOCK_UNIT_9());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT_10") && key.getSTOCK_UNIT_10() != null) {
					msgKey.setKeyValue("STOCK_UNIT_10", key.getSTOCK_UNIT_10());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT_11") && key.getSTOCK_UNIT_11() != null) {
					msgKey.setKeyValue("STOCK_UNIT_11", key.getSTOCK_UNIT_11());
				}
				if(msgKeyType.containsKeyColumn("SUM_OF_ALC_REMAIN_QTY") && key.getSUM_OF_ALC_REMAIN_QTY() != null) {
					msgKey.setKeyValue("SUM_OF_ALC_REMAIN_QTY", key.getSUM_OF_ALC_REMAIN_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_OD_NO") && key.getl_OD_NO() != null) {
					msgKey.setKeyValue("l_OD_NO", key.getl_OD_NO());
				}
				if(msgKeyType.containsKeyColumn("l_JOB_ODR_DETAIL_NO") && key.getl_JOB_ODR_DETAIL_NO() != null) {
					msgKey.setKeyValue("l_JOB_ODR_DETAIL_NO", key.getl_JOB_ODR_DETAIL_NO());
				}
				if(msgKeyType.containsKeyColumn("l_JOB_ODR_CANCEL_NO") && key.getl_JOB_ODR_CANCEL_NO() != null) {
					msgKey.setKeyValue("l_JOB_ODR_CANCEL_NO", key.getl_JOB_ODR_CANCEL_NO());
				}
				if(msgKeyType.containsKeyColumn("l_MODIFY_COUNT") && key.getl_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("l_MODIFY_COUNT", key.getl_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("l_JOB_ODR_EXP_TYP") && key.getl_JOB_ODR_EXP_TYP() != null) {
					msgKey.setKeyValue("l_JOB_ODR_EXP_TYP", key.getl_JOB_ODR_EXP_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_MRP_TYP") && key.getl_MRP_TYP() != null) {
					msgKey.setKeyValue("l_MRP_TYP", key.getl_MRP_TYP());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_STS_TYP_2") && key.getJOB_ODR_STS_TYP_2() != null) {
					msgKey.setKeyValue("JOB_ODR_STS_TYP_2", key.getJOB_ODR_STS_TYP_2());
				}
				if(msgKeyType.containsKeyColumn("ALC_GRP_CD_2") && key.getALC_GRP_CD_2() != null) {
					msgKey.setKeyValue("ALC_GRP_CD_2", key.getALC_GRP_CD_2());
				}
				if(msgKeyType.containsKeyColumn("l_ALC_TYP_2") && key.getl_ALC_TYP_2() != null) {
					msgKey.setKeyValue("l_ALC_TYP_2", key.getl_ALC_TYP_2());
				}
				if(msgKeyType.containsKeyColumn("l_ALC_TYP_2_DN") && key.getl_ALC_TYP_2_DN() != null) {
					msgKey.setKeyValue("l_ALC_TYP_2_DN", key.getl_ALC_TYP_2_DN());
				}
				if(msgKeyType.containsKeyColumn("l_ISSUEED_QTY") && key.getl_ISSUEED_QTY() != null) {
					msgKey.setKeyValue("l_ISSUEED_QTY", key.getl_ISSUEED_QTY());
				}
				if(msgKeyType.containsKeyColumn("ALC_TYP_2") && key.getALC_TYP_2() != null) {
					msgKey.setKeyValue("ALC_TYP_2", key.getALC_TYP_2());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_DETAIL_NO_2") && key.getJOB_ODR_DETAIL_NO_2() != null) {
					msgKey.setKeyValue("JOB_ODR_DETAIL_NO_2", key.getJOB_ODR_DETAIL_NO_2());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_CANCEL_NO_2") && key.getJOB_ODR_CANCEL_NO_2() != null) {
					msgKey.setKeyValue("JOB_ODR_CANCEL_NO_2", key.getJOB_ODR_CANCEL_NO_2());
				}
				if(msgKeyType.containsKeyColumn("l_ISSUE_REMAIN_QTY") && key.getl_ISSUE_REMAIN_QTY() != null) {
					msgKey.setKeyValue("l_ISSUE_REMAIN_QTY", key.getl_ISSUE_REMAIN_QTY());
				}
				if(msgKeyType.containsKeyColumn("h_OD_NO") && key.geth_OD_NO() != null) {
					msgKey.setKeyValue("h_OD_NO", key.geth_OD_NO());
				}
				if(msgKeyType.containsKeyColumn("DM_STS_TYP_DN") && key.getDM_STS_TYP_DN() != null) {
					msgKey.setKeyValue("DM_STS_TYP_DN", key.getDM_STS_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("ODR_STS_TYP_DN") && key.getODR_STS_TYP_DN() != null) {
					msgKey.setKeyValue("ODR_STS_TYP_DN", key.getODR_STS_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("ALC_TYP_2_DN") && key.getALC_TYP_2_DN() != null) {
					msgKey.setKeyValue("ALC_TYP_2_DN", key.getALC_TYP_2_DN());
				}
				if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP_DN") && key.getUNIT_QTY_TYP_DN() != null) {
					msgKey.setKeyValue("UNIT_QTY_TYP_DN", key.getUNIT_QTY_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_STS_TYP_DN_2") && key.getJOB_ODR_STS_TYP_DN_2() != null) {
					msgKey.setKeyValue("JOB_ODR_STS_TYP_DN_2", key.getJOB_ODR_STS_TYP_DN_2());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_STS_TYP_DN") && key.getJOB_ODR_STS_TYP_DN() != null) {
					msgKey.setKeyValue("JOB_ODR_STS_TYP_DN", key.getJOB_ODR_STS_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("DUE_TIME") && key.getDUE_TIME() != null) {
					msgKey.setKeyValue("DUE_TIME", key.getDUE_TIME());
				}
				if(msgKeyType.containsKeyColumn("PRD_DUE_TIME") && key.getPRD_DUE_TIME() != null) {
					msgKey.setKeyValue("PRD_DUE_TIME", key.getPRD_DUE_TIME());
				}
				if(msgKeyType.containsKeyColumn("ODR_START_TIME") && key.getODR_START_TIME() != null) {
					msgKey.setKeyValue("ODR_START_TIME", key.getODR_START_TIME());
				}
				if(msgKeyType.containsKeyColumn("PRD_START_TIME") && key.getPRD_START_TIME() != null) {
					msgKey.setKeyValue("PRD_START_TIME", key.getPRD_START_TIME());
				}
				if(msgKeyType.containsKeyColumn("OD_NO") && key.getOD_NO() != null) {
					msgKey.setKeyValue("OD_NO", key.getOD_NO());
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
				if(msgKeyType.containsKeyColumn("ALC_GRP_CD") && key.getALC_GRP_CD() != null) {
					msgKey.setKeyValue("ALC_GRP_CD", key.getALC_GRP_CD());
				}
				if(msgKeyType.containsKeyColumn("ODR_QTY") && key.getODR_QTY() != null) {
					msgKey.setKeyValue("ODR_QTY", key.getODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("DM_QTY") && key.getDM_QTY() != null) {
					msgKey.setKeyValue("DM_QTY", key.getDM_QTY());
				}
				if(msgKeyType.containsKeyColumn("ITEM_NAME") && key.getITEM_NAME() != null) {
					msgKey.setKeyValue("ITEM_NAME", key.getITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP") && key.getUNIT_QTY_TYP() != null) {
					msgKey.setKeyValue("UNIT_QTY_TYP", key.getUNIT_QTY_TYP());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT") && key.getSTOCK_UNIT() != null) {
					msgKey.setKeyValue("STOCK_UNIT", key.getSTOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_STS_TYP") && key.getJOB_ODR_STS_TYP() != null) {
					msgKey.setKeyValue("JOB_ODR_STS_TYP", key.getJOB_ODR_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("DM_STS_TYP") && key.getDM_STS_TYP() != null) {
					msgKey.setKeyValue("DM_STS_TYP", key.getDM_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("TOTAL_ISSUE_QTY") && key.getTOTAL_ISSUE_QTY() != null) {
					msgKey.setKeyValue("TOTAL_ISSUE_QTY", key.getTOTAL_ISSUE_QTY());
				}
				if(msgKeyType.containsKeyColumn("DUE_DATE") && key.getDUE_DATE() != null) {
					msgKey.setKeyValue("DUE_DATE", key.getDUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("OD_CALC_FLG") && key.getOD_CALC_FLG() != null) {
					msgKey.setKeyValue("OD_CALC_FLG", key.getOD_CALC_FLG());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_EXP_TYP") && key.getJOB_ODR_EXP_TYP() != null) {
					msgKey.setKeyValue("JOB_ODR_EXP_TYP", key.getJOB_ODR_EXP_TYP());
				}
				if(msgKeyType.containsKeyColumn("MRP_TYP") && key.getMRP_TYP() != null) {
					msgKey.setKeyValue("MRP_TYP", key.getMRP_TYP());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP") && key.getMRP_ODR_TYP() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP", key.getMRP_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("PARENT_OD_NO") && key.getPARENT_OD_NO() != null) {
					msgKey.setKeyValue("PARENT_OD_NO", key.getPARENT_OD_NO());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("SUM_OF_WORK_IN_PROC_QTY") && key.getSUM_OF_WORK_IN_PROC_QTY() != null) {
					msgKey.setKeyValue("SUM_OF_WORK_IN_PROC_QTY", key.getSUM_OF_WORK_IN_PROC_QTY());
				}
				if(msgKeyType.containsKeyColumn("TOTAL_RCV_QTY") && key.getTOTAL_RCV_QTY() != null) {
					msgKey.setKeyValue("TOTAL_RCV_QTY", key.getTOTAL_RCV_QTY());
				}
				if(msgKeyType.containsKeyColumn("ODR_STS_TYP") && key.getODR_STS_TYP() != null) {
					msgKey.setKeyValue("ODR_STS_TYP", key.getODR_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("PRD_DUE_DATE") && key.getPRD_DUE_DATE() != null) {
					msgKey.setKeyValue("PRD_DUE_DATE", key.getPRD_DUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("ODR_START_DATE") && key.getODR_START_DATE() != null) {
					msgKey.setKeyValue("ODR_START_DATE", key.getODR_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("PRD_START_DATE") && key.getPRD_START_DATE() != null) {
					msgKey.setKeyValue("PRD_START_DATE", key.getPRD_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("OD_MNT_FLG") && key.getOD_MNT_FLG() != null) {
					msgKey.setKeyValue("OD_MNT_FLG", key.getOD_MNT_FLG());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_ALC_CD") && key.getJOB_ODR_ALC_CD() != null) {
					msgKey.setKeyValue("JOB_ODR_ALC_CD", key.getJOB_ODR_ALC_CD());
				}
				if(msgKeyType.containsKeyColumn("ALC_STOCK_TYP") && key.getALC_STOCK_TYP() != null) {
					msgKey.setKeyValue("ALC_STOCK_TYP", key.getALC_STOCK_TYP());
				}
				if(msgKeyType.containsKeyColumn("ALCD_QTY") && key.getALCD_QTY() != null) {
					msgKey.setKeyValue("ALCD_QTY", key.getALCD_QTY());
				}
				if(msgKeyType.containsKeyColumn("ISSUEED_QTY") && key.getISSUEED_QTY() != null) {
					msgKey.setKeyValue("ISSUEED_QTY", key.getISSUEED_QTY());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_CMPLT_FLG") && key.getISSUE_CMPLT_FLG() != null) {
					msgKey.setKeyValue("ISSUE_CMPLT_FLG", key.getISSUE_CMPLT_FLG());
				}
				if(msgKeyType.containsKeyColumn("ITEM_SPOIL") && key.getITEM_SPOIL() != null) {
					msgKey.setKeyValue("ITEM_SPOIL", key.getITEM_SPOIL());
				}
				if(msgKeyType.containsKeyColumn("SUM_OF_ISSUEED_QTY") && key.getSUM_OF_ISSUEED_QTY() != null) {
					msgKey.setKeyValue("SUM_OF_ISSUEED_QTY", key.getSUM_OF_ISSUEED_QTY());
				}
				if(msgKeyType.containsKeyColumn("MODIFY_COUNT") && key.getMODIFY_COUNT() != null) {
					msgKey.setKeyValue("MODIFY_COUNT", key.getMODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_TYP") && key.getJOB_ODR_TYP() != null) {
					msgKey.setKeyValue("JOB_ODR_TYP", key.getJOB_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_REMAIN_QTY") && key.getISSUE_REMAIN_QTY() != null) {
					msgKey.setKeyValue("ISSUE_REMAIN_QTY", key.getISSUE_REMAIN_QTY());
				}
				if(msgKeyType.containsKeyColumn("OD_GNR_TYP") && key.getOD_GNR_TYP() != null) {
					msgKey.setKeyValue("OD_GNR_TYP", key.getOD_GNR_TYP());
				}
				if(msgKeyType.containsKeyColumn("SUM_OF_ISSUED_QTY") && key.getSUM_OF_ISSUED_QTY() != null) {
					msgKey.setKeyValue("SUM_OF_ISSUED_QTY", key.getSUM_OF_ISSUED_QTY());
				}
				if(msgKeyType.containsKeyColumn("SUM_OF_STOCK_ON_HAND_QTY") && key.getSUM_OF_STOCK_ON_HAND_QTY() != null) {
					msgKey.setKeyValue("SUM_OF_STOCK_ON_HAND_QTY", key.getSUM_OF_STOCK_ON_HAND_QTY());
				}
				if(msgKeyType.containsKeyColumn("SUM_OF_ALCD_QTY") && key.getSUM_OF_ALCD_QTY() != null) {
					msgKey.setKeyValue("SUM_OF_ALCD_QTY", key.getSUM_OF_ALCD_QTY());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_CD_2") && key.getJOB_ODR_CD_2() != null) {
					msgKey.setKeyValue("JOB_ODR_CD_2", key.getJOB_ODR_CD_2());
				}
				if(msgKeyType.containsKeyColumn("SEL_OD_NO") && key.getSEL_OD_NO() != null) {
					msgKey.setKeyValue("SEL_OD_NO", key.getSEL_OD_NO());
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
					AC0100010Struct key = new AC0100010Struct();
					if(msgKeyType.containsKeyColumn("l_JOB_ODR_CD")) {
						key.setl_JOB_ODR_CD(msgKey.getKeyValue("l_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ALCD_QTY")) {
						key.setl_ALCD_QTY(msgKey.getKeyValue("l_ALCD_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_STOCK_ON_HAND_QTY")) {
						key.setl_STOCK_ON_HAND_QTY(msgKey.getKeyValue("l_STOCK_ON_HAND_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_ODR_STS_TYP_DN")) {
						key.setl_ODR_STS_TYP_DN(msgKey.getKeyValue("l_ODR_STS_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("l_PRD_DUE_DATE")) {
						key.setl_PRD_DUE_DATE(msgKey.getKeyValue("l_PRD_DUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_TOTAL_RCV_QTY")) {
						key.setl_TOTAL_RCV_QTY(msgKey.getKeyValue("l_TOTAL_RCV_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_ODR_START_DATE")) {
						key.setl_ODR_START_DATE(msgKey.getKeyValue("l_ODR_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_PRD_START_DATE")) {
						key.setl_PRD_START_DATE(msgKey.getKeyValue("l_PRD_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_ON_HAND_QTY")) {
						key.setSTOCK_ON_HAND_QTY(msgKey.getKeyValue("STOCK_ON_HAND_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_ODR_QTY")) {
						key.setl_ODR_QTY(msgKey.getKeyValue("l_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_ALC_GRP_CD")) {
						key.setl_ALC_GRP_CD(msgKey.getKeyValue("l_ALC_GRP_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_JOB_ODR_STS_TYP_DN")) {
						key.setl_JOB_ODR_STS_TYP_DN(msgKey.getKeyValue("l_JOB_ODR_STS_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("l_ODR_STS_TYP")) {
						key.setl_ODR_STS_TYP(msgKey.getKeyValue("l_ODR_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_JOB_ODR_STS_TYP")) {
						key.setl_JOB_ODR_STS_TYP(msgKey.getKeyValue("l_JOB_ODR_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("ALLOCATABLE_QTY")) {
						key.setALLOCATABLE_QTY(msgKey.getKeyValue("ALLOCATABLE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_ALLOCATABLE_QTY")) {
						key.setl_ALLOCATABLE_QTY(msgKey.getKeyValue("l_ALLOCATABLE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("SUM_OF_ALLOCATABLE_QTY")) {
						key.setSUM_OF_ALLOCATABLE_QTY(msgKey.getKeyValue("SUM_OF_ALLOCATABLE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT_2")) {
						key.setSTOCK_UNIT_2(msgKey.getKeyValue("STOCK_UNIT_2"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT_3")) {
						key.setSTOCK_UNIT_3(msgKey.getKeyValue("STOCK_UNIT_3"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT_1")) {
						key.setSTOCK_UNIT_1(msgKey.getKeyValue("STOCK_UNIT_1"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT_4")) {
						key.setSTOCK_UNIT_4(msgKey.getKeyValue("STOCK_UNIT_4"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT_5")) {
						key.setSTOCK_UNIT_5(msgKey.getKeyValue("STOCK_UNIT_5"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT_6")) {
						key.setSTOCK_UNIT_6(msgKey.getKeyValue("STOCK_UNIT_6"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT_7")) {
						key.setSTOCK_UNIT_7(msgKey.getKeyValue("STOCK_UNIT_7"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT_8")) {
						key.setSTOCK_UNIT_8(msgKey.getKeyValue("STOCK_UNIT_8"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT_9")) {
						key.setSTOCK_UNIT_9(msgKey.getKeyValue("STOCK_UNIT_9"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT_10")) {
						key.setSTOCK_UNIT_10(msgKey.getKeyValue("STOCK_UNIT_10"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT_11")) {
						key.setSTOCK_UNIT_11(msgKey.getKeyValue("STOCK_UNIT_11"));
					}
					if(msgKeyType.containsKeyColumn("SUM_OF_ALC_REMAIN_QTY")) {
						key.setSUM_OF_ALC_REMAIN_QTY(msgKey.getKeyValue("SUM_OF_ALC_REMAIN_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_OD_NO")) {
						key.setl_OD_NO(msgKey.getKeyValue("l_OD_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_JOB_ODR_DETAIL_NO")) {
						key.setl_JOB_ODR_DETAIL_NO(msgKey.getKeyValue("l_JOB_ODR_DETAIL_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_JOB_ODR_CANCEL_NO")) {
						key.setl_JOB_ODR_CANCEL_NO(msgKey.getKeyValue("l_JOB_ODR_CANCEL_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_MODIFY_COUNT")) {
						key.setl_MODIFY_COUNT(msgKey.getKeyValue("l_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("l_JOB_ODR_EXP_TYP")) {
						key.setl_JOB_ODR_EXP_TYP(msgKey.getKeyValue("l_JOB_ODR_EXP_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_MRP_TYP")) {
						key.setl_MRP_TYP(msgKey.getKeyValue("l_MRP_TYP"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_STS_TYP_2")) {
						key.setJOB_ODR_STS_TYP_2(msgKey.getKeyValue("JOB_ODR_STS_TYP_2"));
					}
					if(msgKeyType.containsKeyColumn("ALC_GRP_CD_2")) {
						key.setALC_GRP_CD_2(msgKey.getKeyValue("ALC_GRP_CD_2"));
					}
					if(msgKeyType.containsKeyColumn("l_ALC_TYP_2")) {
						key.setl_ALC_TYP_2(msgKey.getKeyValue("l_ALC_TYP_2"));
					}
					if(msgKeyType.containsKeyColumn("l_ALC_TYP_2_DN")) {
						key.setl_ALC_TYP_2_DN(msgKey.getKeyValue("l_ALC_TYP_2_DN"));
					}
					if(msgKeyType.containsKeyColumn("l_ISSUEED_QTY")) {
						key.setl_ISSUEED_QTY(msgKey.getKeyValue("l_ISSUEED_QTY"));
					}
					if(msgKeyType.containsKeyColumn("ALC_TYP_2")) {
						key.setALC_TYP_2(msgKey.getKeyValue("ALC_TYP_2"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_DETAIL_NO_2")) {
						key.setJOB_ODR_DETAIL_NO_2(msgKey.getKeyValue("JOB_ODR_DETAIL_NO_2"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_CANCEL_NO_2")) {
						key.setJOB_ODR_CANCEL_NO_2(msgKey.getKeyValue("JOB_ODR_CANCEL_NO_2"));
					}
					if(msgKeyType.containsKeyColumn("l_ISSUE_REMAIN_QTY")) {
						key.setl_ISSUE_REMAIN_QTY(msgKey.getKeyValue("l_ISSUE_REMAIN_QTY"));
					}
					if(msgKeyType.containsKeyColumn("h_OD_NO")) {
						key.seth_OD_NO(msgKey.getKeyValue("h_OD_NO"));
					}
					if(msgKeyType.containsKeyColumn("DM_STS_TYP_DN")) {
						key.setDM_STS_TYP_DN(msgKey.getKeyValue("DM_STS_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("ODR_STS_TYP_DN")) {
						key.setODR_STS_TYP_DN(msgKey.getKeyValue("ODR_STS_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("ALC_TYP_2_DN")) {
						key.setALC_TYP_2_DN(msgKey.getKeyValue("ALC_TYP_2_DN"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP_DN")) {
						key.setUNIT_QTY_TYP_DN(msgKey.getKeyValue("UNIT_QTY_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_STS_TYP_DN_2")) {
						key.setJOB_ODR_STS_TYP_DN_2(msgKey.getKeyValue("JOB_ODR_STS_TYP_DN_2"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_STS_TYP_DN")) {
						key.setJOB_ODR_STS_TYP_DN(msgKey.getKeyValue("JOB_ODR_STS_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("DUE_TIME")) {
						key.setDUE_TIME(msgKey.getKeyValue("DUE_TIME"));
					}
					if(msgKeyType.containsKeyColumn("PRD_DUE_TIME")) {
						key.setPRD_DUE_TIME(msgKey.getKeyValue("PRD_DUE_TIME"));
					}
					if(msgKeyType.containsKeyColumn("ODR_START_TIME")) {
						key.setODR_START_TIME(msgKey.getKeyValue("ODR_START_TIME"));
					}
					if(msgKeyType.containsKeyColumn("PRD_START_TIME")) {
						key.setPRD_START_TIME(msgKey.getKeyValue("PRD_START_TIME"));
					}
					if(msgKeyType.containsKeyColumn("OD_NO")) {
						key.setOD_NO(msgKey.getKeyValue("OD_NO"));
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
					if(msgKeyType.containsKeyColumn("ALC_GRP_CD")) {
						key.setALC_GRP_CD(msgKey.getKeyValue("ALC_GRP_CD"));
					}
					if(msgKeyType.containsKeyColumn("ODR_QTY")) {
						key.setODR_QTY(msgKey.getKeyValue("ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("DM_QTY")) {
						key.setDM_QTY(msgKey.getKeyValue("DM_QTY"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_NAME")) {
						key.setITEM_NAME(msgKey.getKeyValue("ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP")) {
						key.setUNIT_QTY_TYP(msgKey.getKeyValue("UNIT_QTY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT")) {
						key.setSTOCK_UNIT(msgKey.getKeyValue("STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_STS_TYP")) {
						key.setJOB_ODR_STS_TYP(msgKey.getKeyValue("JOB_ODR_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("DM_STS_TYP")) {
						key.setDM_STS_TYP(msgKey.getKeyValue("DM_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("TOTAL_ISSUE_QTY")) {
						key.setTOTAL_ISSUE_QTY(msgKey.getKeyValue("TOTAL_ISSUE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("DUE_DATE")) {
						key.setDUE_DATE(msgKey.getKeyValue("DUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("OD_CALC_FLG")) {
						key.setOD_CALC_FLG(msgKey.getKeyValue("OD_CALC_FLG"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_EXP_TYP")) {
						key.setJOB_ODR_EXP_TYP(msgKey.getKeyValue("JOB_ODR_EXP_TYP"));
					}
					if(msgKeyType.containsKeyColumn("MRP_TYP")) {
						key.setMRP_TYP(msgKey.getKeyValue("MRP_TYP"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP")) {
						key.setMRP_ODR_TYP(msgKey.getKeyValue("MRP_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PARENT_OD_NO")) {
						key.setPARENT_OD_NO(msgKey.getKeyValue("PARENT_OD_NO"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("SUM_OF_WORK_IN_PROC_QTY")) {
						key.setSUM_OF_WORK_IN_PROC_QTY(msgKey.getKeyValue("SUM_OF_WORK_IN_PROC_QTY"));
					}
					if(msgKeyType.containsKeyColumn("TOTAL_RCV_QTY")) {
						key.setTOTAL_RCV_QTY(msgKey.getKeyValue("TOTAL_RCV_QTY"));
					}
					if(msgKeyType.containsKeyColumn("ODR_STS_TYP")) {
						key.setODR_STS_TYP(msgKey.getKeyValue("ODR_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PRD_DUE_DATE")) {
						key.setPRD_DUE_DATE(msgKey.getKeyValue("PRD_DUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("ODR_START_DATE")) {
						key.setODR_START_DATE(msgKey.getKeyValue("ODR_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("PRD_START_DATE")) {
						key.setPRD_START_DATE(msgKey.getKeyValue("PRD_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("OD_MNT_FLG")) {
						key.setOD_MNT_FLG(msgKey.getKeyValue("OD_MNT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_ALC_CD")) {
						key.setJOB_ODR_ALC_CD(msgKey.getKeyValue("JOB_ODR_ALC_CD"));
					}
					if(msgKeyType.containsKeyColumn("ALC_STOCK_TYP")) {
						key.setALC_STOCK_TYP(msgKey.getKeyValue("ALC_STOCK_TYP"));
					}
					if(msgKeyType.containsKeyColumn("ALCD_QTY")) {
						key.setALCD_QTY(msgKey.getKeyValue("ALCD_QTY"));
					}
					if(msgKeyType.containsKeyColumn("ISSUEED_QTY")) {
						key.setISSUEED_QTY(msgKey.getKeyValue("ISSUEED_QTY"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_CMPLT_FLG")) {
						key.setISSUE_CMPLT_FLG(msgKey.getKeyValue("ISSUE_CMPLT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_SPOIL")) {
						key.setITEM_SPOIL(msgKey.getKeyValue("ITEM_SPOIL"));
					}
					if(msgKeyType.containsKeyColumn("SUM_OF_ISSUEED_QTY")) {
						key.setSUM_OF_ISSUEED_QTY(msgKey.getKeyValue("SUM_OF_ISSUEED_QTY"));
					}
					if(msgKeyType.containsKeyColumn("MODIFY_COUNT")) {
						key.setMODIFY_COUNT(msgKey.getKeyValue("MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_TYP")) {
						key.setJOB_ODR_TYP(msgKey.getKeyValue("JOB_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_REMAIN_QTY")) {
						key.setISSUE_REMAIN_QTY(msgKey.getKeyValue("ISSUE_REMAIN_QTY"));
					}
					if(msgKeyType.containsKeyColumn("OD_GNR_TYP")) {
						key.setOD_GNR_TYP(msgKey.getKeyValue("OD_GNR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("SUM_OF_ISSUED_QTY")) {
						key.setSUM_OF_ISSUED_QTY(msgKey.getKeyValue("SUM_OF_ISSUED_QTY"));
					}
					if(msgKeyType.containsKeyColumn("SUM_OF_STOCK_ON_HAND_QTY")) {
						key.setSUM_OF_STOCK_ON_HAND_QTY(msgKey.getKeyValue("SUM_OF_STOCK_ON_HAND_QTY"));
					}
					if(msgKeyType.containsKeyColumn("SUM_OF_ALCD_QTY")) {
						key.setSUM_OF_ALCD_QTY(msgKey.getKeyValue("SUM_OF_ALCD_QTY"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_CD_2")) {
						key.setJOB_ODR_CD_2(msgKey.getKeyValue("JOB_ODR_CD_2"));
					}
					if(msgKeyType.containsKeyColumn("SEL_OD_NO")) {
						key.setSEL_OD_NO(msgKey.getKeyValue("SEL_OD_NO"));
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
