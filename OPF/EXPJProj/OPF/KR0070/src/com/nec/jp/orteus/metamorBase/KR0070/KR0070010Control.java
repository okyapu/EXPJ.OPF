/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KR0070/src/com/nec/jp/orteus/metamorBase/KR0070/KR0070010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.KR0070;

import com.nec.jp.orteus.metamorBase.KR0070.*;
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
import java.math.BigDecimal;

import com.nec.jp.orteus.expj.sa.amount.SaAmountCalculator;
import com.nec.jp.orteus.metamorBase.common04.amount.AmountCalculator;
import com.nec.jp.orteus.metamorBase.common04.amount.ExchRateControl;
import com.nec.jp.orteus.metamorBase.common04.amount.ExchRateStruct;
import com.nec.jp.orteus.metamorBase.common06.ExchAmount.*;
//}}user_implement_code_import

//{{user_implement_code_header
/**
 * CLASS     : KR0070010Control クラス
 * ファイル・クラス説明
 * @author $Author: zhou-kehong $
 * @version $Revision: 1.3 $ $Date: 2015/03/24 09:32:59 $
 *
 */
//}}user_implement_code_header

public class KR0070010Control
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
	public KR0070010Struct getListvalue(int x) { return (KR0070010Struct)(this.list.get(x)); }	// リストの値を返します。
	public KR0070010Struct getStruct() { return this.struct; }	// Structの値を返します。
	public KR0070010Struct createStruct() { return new KR0070010Struct(); }	// 新しいStructを作って返します。
	public void setStruct(Object structname) { this.struct.setStruct((KR0070010Struct)structname); }	// Structをセットします。
	public void initializeStruct() { this.struct.initialize(); }	// Structの値を初期化します。

	// CSV出力用リスト
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }
	// TODO: ユーザ定義のコードを記述してください
	
	// 実行環境フラグ
	protected String _explannerFlag = "";
	public void setExplannerFlag(String flag) { this._explannerFlag = flag; };
	public String getExplannerFlag() { return this._explannerFlag; };
	
	
	// 業務用の会社コード 
	protected String _sysCOMPANY_CD;
	public void setsysCOMPANY_CD(String name) { this._sysCOMPANY_CD = name; };
	public String getsysCOMPANY_CD() { return this._sysCOMPANY_CD; };
	
	// 販売用の工場コード 
	protected String _salesPLANT_CD;
	public void setSalesPLANT_CD(String name) { this._salesPLANT_CD = name; };
	public String getSalesPLANT_CD() { return this._salesPLANT_CD; };
	
	// 共通部品クラス
	private Common common = null;
	
	/* 定数定義 */
	static final int STATUS_NORMAL = 1; // 結果ステータス(1:正常終了)

	static final int STATUS_WARNING = 2; // 結果ステータス(2:警告終了)

	static final int STATUS_ERROR = 3; // 結果ステータス(3:異常終了)
	
	/** 通貨少数桁数 */
	private int decimalFig = 0;
	
	private String _businessOprDate = null; // 業務運用日
	/**
	 * 業務運用日設定
	 * 
	 * @param businessOprDate
	 *            業務運用日
	 */
	public void setBusinessOprDate(String businessOprDate) {
		_businessOprDate = businessOprDate;
	}

	/**
	 * 業務運用日取得
	 * 
	 * @return String
	 */
	public String getBusinessOprDate() {
		return _businessOprDate;
	}
	
	private String _homeCurCd = null; // 邦貨コード
	/**
	 * 邦貨コード設定
	 * 
	 * @param homeCurCd
	 *            邦貨コード
	 */
	public void setHomeCurCd(String homeCurCd) {
		_homeCurCd = homeCurCd;
	}

	/**
	 * 邦貨コード取得
	 * 
	 * @return String
	 */
	public String getHomeCurCd() {
		return _homeCurCd;
	}
	
	/** 品目名の既定値 */
	private String _itemName = null; 
	/**
	 * 品目名設定
	 * 
	 * @param itemName
	 *            品目名
	 */
	public void setItemName(String itemName) {
		_itemName = itemName;
	}

	/**
	 * 品目名取得
	 * 
	 * @return String
	 */
	public String getItemName() {
		return _itemName;
	}
	//Add NEC 2014.06.18 STR
	 // ----- システム設定値取得 ---------------	
    private PrivateConfig privateConfig;
		
	/** 棚卸承認 */
    	String aprSales = "";	
	//Add NEC 2014.06.18 END	
		
	/** Ai債権連携フラグ */
	private String _installFlg;
	
	/**
	 * Ai債権連携フラグ設定
	 * @param flag
	 */
	public void setInstallFlg (String flag) {
		_installFlg = flag;
	}
	
	/**
	 * Ai債権連携フラグ取得
	 * @return
	 */
	public String getInstallFlg () {
		return _installFlg;
	}
	
	/**
	 * 元受注番号の表示名
	 */
	private String _lbORGN_ODR_NO;
	
	/**
	 * 元受注番号の表示名設定
	 * @param str
	 */
	public void setlbORGN_ODR_NO (String str) {
		_lbORGN_ODR_NO = str;
	}
	
	/**
	 * 元受注番号の表示名取得
	 * @return
	 */
	public String getlbORGN_ODR_NO () {
		return _lbORGN_ODR_NO;
	}
	
	
	/**
	 * Exceptionメッセージ設定
	 * @param キー項目
	 */
	private void setExpjExceptionMsg(Exception e) throws ExpjException
	{
		// エラーメッセージ作成
		ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
		sysLog.severe(emsg, getsysUSER_CD());//致命的エラー エラー内容
		ExpjException ee = new ExpjException(e, emsg); // エクセプションを生成
		throw ee;
	}
	
	
	/**
	 * 業務ロジックのインフォメーションメッセージ設定処理を切り出して関数化
	 * 
	 * @param code
	 *            メッセージコード
	 */
	private void setInformationMessage(String code) {
		ExpjMessage emsg = new ExpjMessage(code);
		msgStruct.addInfo(emsg);
	}

	/**
	 * 業務ロジックのワーニングメッセージ設定処理を切り出して関数化
	 * 
	 * @param code
	 *            メッセージコード
	 */
	private void setWarningMessage(String code) {
		ExpjMessage emsg = new ExpjMessage(code);
		msgStruct.addWarn(emsg);
		sysLog.info(emsg, sysUSER_CD);
	}

	/**
	 * 業務ロジックのワーニングメッセージ設定処理を切り出して関数化
	 * 
	 * @param code
	 *            メッセージコード
	 * @param value1
	 *            置換文字列１
	 */
	private void setWarningMessage(String code, String value1) {
		ExpjMessage emsg = new ExpjMessage(code, value1);
		msgStruct.addWarn(emsg);
		sysLog.info(emsg, sysUSER_CD);
	}

	/**
	 * 業務ロジックのエラーメッセージ設定処理を切り出して関数化
	 * 
	 * @param code
	 *            メッセージコード
	 */
	private void setErrorMessage(String code) {
		ExpjMessage emsg = new ExpjMessage(code);
		msgStruct.addError(emsg);
		sysLog.warning(emsg, sysUSER_CD);
	}

	/**
	 * 業務ロジックのエラーメッセージ設定処理を切り出して関数化
	 * 
	 * @param code
	 *            メッセージコード
	 * @param value1
	 *            置換文字列１
	 */
	private void setErrorMessage(String code, String value1) {
		ExpjMessage emsg = new ExpjMessage(code, value1);
		msgStruct.addError(emsg);
		sysLog.warning(emsg, sysUSER_CD);
	}
	
	
	/**
	 * 画面の全項目を初期化します。
	 */
	private void initializeAll() {
		// 受注番号
		struct.setODR_NO(null);
		struct.seth_ODR_NO(null);
		// 伝票番号
		struct.setSLIP_CD(null);
		struct.seth_SLIP_CD(null);
		// 登録
		struct.setrdoInsert("true");
		struct.seth_rdoInsert("true");
		// 更新・削除
		struct.setrdoUpdateDelete("false");
		// 更新数
		struct.setMODIFY_COUNT(null);
		struct.setH_MODIFY_COUNT(null);
		struct.setODR_MODIFY_COUNT(null);
		
		initializeDetail();
	}
	
	/**
	 * 画面の詳細項目を初期化します。
	 */
	private void initializeDetail() {
		// 元受注番号
		struct.setlbORGN_ODR_NO(null);
		struct.setORGN_ODR_NO(null);
		// 増額受注
		struct.seth_ADD_ODR_FLG(null);
		struct.setaddAmountOrder(null);
		// 得意先注文番号
		struct.setCUST_ODR_NO(null);
		// 得意先コード
		struct.setCUST_CD(null);
		// 得意先名
		struct.setCUST_NAME(null);
		// Ai売掛インタフェースフラグ
		struct.setAI_AR_IF_FLG(null);
		// 通貨コード
		struct.seth_CUR_CD(null);
		// 品目番号
		struct.setITEM_CD(null);
		// 品目名
		struct.setITEM_NAME(null);
		// 指定納期
		struct.setDESINATED_DLV_DATE(null);
		// 売上計上日
		struct.setSALES_DATE(null);
		// 売上計上部門
		struct.setSALES_DEPT_CD(null);
		// 売上計上部門名
		struct.setORG_NAME(null);
		// 営業担当者コード
		struct.setCUST_CHRG_PSN_CD(null);
		// 営業担当者名
		struct.setUSER_NAME(null);
		// 売上単価
		struct.setSALES_UNIT_PRICE("0");
		struct.setCUR_UNIT_PRICE(null);
		// 売上実績数量
		struct.setSALES_QTY("0");
		struct.setSTOCK_UNIT(null);
		// 売上金額
		struct.setSALES_AMOUNT("0");
		struct.setCUR_UNIT_AMOUNT(null);
		// 消費税コード
		struct.setTAX_CD(null);
		struct.seth_TAX_CD(null);
		// 受注数量
		struct.setODR_QTY("0");
		struct.setSTOCK_UNIT(null);
		// 受注日
		struct.setODR_ACPT_DATE(null);
		// 備考
		struct.setREMARKS(null);
		
		list = null;
		readStatus = INITIAL;
	}
	
	/**
	 * 画面の詳細項目を初期化します。
	 */
	private void setShowValue(KR0070010Struct beforeStruct, KR0070010Struct afterStruct) {
		// 売上実績管理番号
		beforeStruct.seth_SALES_SEQ_NO(afterStruct.geth_SALES_SEQ_NO());
		// 売上実績伝票番号(Jf)
		beforeStruct.seth_SALES_H_NO(afterStruct.geth_SALES_H_NO());
		// 元受注番号
		beforeStruct.setORGN_ODR_NO(afterStruct.getORGN_ODR_NO());
		// 元受注番号の表示名
		beforeStruct.setlbORGN_ODR_NO(getlbORGN_ODR_NO());
		// 増額受注
		beforeStruct.seth_ADD_ODR_FLG(afterStruct.geth_ADD_ODR_FLG());
		if ("1".equals(afterStruct.geth_ADD_ODR_FLG())) {
			beforeStruct.setaddAmountOrder("true");
		} else {
			beforeStruct.setaddAmountOrder("");
		}
		// 得意先注文番号
		beforeStruct.setCUST_ODR_NO(afterStruct.getCUST_ODR_NO());
		// 得意先コード
		beforeStruct.setCUST_CD(afterStruct.getCUST_CD());
		// 得意先名
		beforeStruct.setCUST_NAME(afterStruct.getCUST_NAME());
		// 品目番号
		beforeStruct.setITEM_CD(afterStruct.getITEM_CD());
		// 品目名
		beforeStruct.setITEM_NAME(afterStruct.getITEM_NAME());
		// 指定納期
		beforeStruct.setDESINATED_DLV_DATE(afterStruct.getDESINATED_DLV_DATE());
		// 売上計上日
		beforeStruct.setSALES_DATE(afterStruct.getSALES_DATE());
		// 売上計上部門
		beforeStruct.setSALES_DEPT_CD(afterStruct.getSALES_DEPT_CD());
		// 売上計上部門名
		beforeStruct.setORG_NAME(afterStruct.getORG_NAME());
		// 営業担当者コード
		beforeStruct.setCUST_CHRG_PSN_CD(afterStruct.getCUST_CHRG_PSN_CD());
		// 営業担当者名
		beforeStruct.setUSER_NAME(afterStruct.getUSER_NAME());
		// 発行担当者コード
		beforeStruct.setODR_ACPT_PSN_CD(afterStruct.getODR_ACPT_PSN_CD());
		// 売上単価
		beforeStruct.setSALES_UNIT_PRICE(afterStruct.getSALES_UNIT_PRICE());
		beforeStruct.setCUR_UNIT_PRICE(afterStruct.getCUR_UNIT_PRICE());
		// 売上実績数量
		if ("true".equals(struct.getrdoInsert())) {
			beforeStruct.setSALES_QTY(afterStruct.getODR_QTY());
			beforeStruct.setSTOCK_UNIT(afterStruct.getSTOCK_UNIT_ODR());
		} else {
			beforeStruct.setSALES_QTY(afterStruct.getSALES_QTY());
			beforeStruct.setSTOCK_UNIT(afterStruct.getSTOCK_UNIT());
		}
		// 売上金額
		beforeStruct.setSALES_AMOUNT(afterStruct.getSALES_AMOUNT());
		beforeStruct.setCUR_UNIT_AMOUNT(afterStruct.getCUR_UNIT_PRICE());
		// 消費税コード
		beforeStruct.setTAX_CD(afterStruct.getTAX_CD());
		beforeStruct.seth_TAX_CD(afterStruct.getTAX_CD());
		// 受注数量
		beforeStruct.setODR_QTY(afterStruct.getODR_QTY());
		beforeStruct.setSTOCK_UNIT_ODR(afterStruct.getSTOCK_UNIT_ODR());
		// 受注日
		beforeStruct.setODR_ACPT_DATE(afterStruct.getODR_ACPT_DATE());
		// 備考
		beforeStruct.setREMARKS(afterStruct.getREMARKS());
		// Ai売掛インタフェースフラグ
		beforeStruct.setAI_AR_IF_FLG(afterStruct.getAI_AR_IF_FLG());
		
		// 更新数
		beforeStruct.setMODIFY_COUNT(afterStruct.getMODIFY_COUNT());
		beforeStruct.setH_MODIFY_COUNT(afterStruct.getH_MODIFY_COUNT());
		// 非在庫受注更新数
		beforeStruct.setODR_MODIFY_COUNT(afterStruct.getODR_MODIFY_COUNT());
		
		beforeStruct.setBUSINESS_OPR_DATE(getBusinessOprDate());
		
		beforeStruct.seth_ODR_NO(beforeStruct.getODR_NO());
		beforeStruct.seth_SLIP_CD(beforeStruct.getSLIP_CD());
		beforeStruct.seth_rdoInsert(beforeStruct.getrdoInsert());
		
	}
	
	/**
	 * 売掛金元帳と売掛金トランヘッダチェック
	 * @throws BusinessProcessException
	 * @throws FoundationException
	 */
	private void checkT_AR_LEDGER_H() throws BusinessProcessException, FoundationException {
		// 会社コード
		struct.setCOMPANY_CD(getsysCOMPANY_CD());
		try {
			boolean checkFlag = false;
			List checkList = new ArrayList();
			// Ai連携無し
			if (!"1".equals(getInstallFlg())){
				// サブシステムがインストールされている
				checkList = entity.mSYS_INSTALL_OPTIONS_B.read(conn, struct);
				if (!checkList.isEmpty()) {
					checkFlag = true;
				}
			} else {
				checkFlag = true;
			}
			
			
			if (checkFlag) {
				if ("Ja".equals(getExplannerFlag()) || "JaScm".equals(getExplannerFlag())) {
					if ("Ja".equals(getExplannerFlag())) {
						checkList = entity.mT_SALES_Ja.read(conn, struct);
					} else {
						checkList = entity.mT_SALES_JaScm.read(conn, struct);
					}
					if (checkList.isEmpty()) {
						return;
					}
				}
				// 売掛金トランヘッダ
				if ("Jf".equals(getExplannerFlag())) {
					checkList = entity.mT_AR_LEDGER_H_TRN_Jf.read(conn, struct);
				} else {
					struct.setSLIP_TYP("14");
					checkList = entity.mT_AR_LEDGER_H_TRN.read(conn, struct);
				}
				if (checkList.isEmpty()) {
					// 売掛金元帳ヘッダ
					if ("Jf".equals(getExplannerFlag())) {	
						checkList = entity.mT_AR_LEDGER_H_Jf.read(conn, struct);
					} else {
						checkList = entity.mT_AR_LEDGER_H.read(conn, struct);
					}
					if (checkList.isEmpty()) {
						setErrorMessage("BD00027");
					}
					
				}
			}
		} catch (Exception e) {
			setExpjExceptionMsg(e);
		}
	}
	
	
	/**
	 * 邦貨換算。
	 * @param amount 対象金額
	 * @param s ストラクトオブジェクト
	 * @return 邦貨金額
	 * @throws SQLException 処理失敗
	 * @throws ExpjException  処理失敗
	 */
	private String exchAmount(String amount, KR0070010Struct s) throws SQLException, ExpjException {
		ExchAmount exch = new ExchAmount(conn);
		boolean result = exch.doExchAmount(amount, s.getCOMPANY_CD(), s.geth_CUR_CD(), s.getEXCH_TYP(), s.getDETAIL_ROUND_TYP(), s.getSALES_DATE());
		if (!result) {
			setErrorMessage("KQ00038");
			return "0";
		}
		double exchAmount = exch.getD_EXCH_AMOUNT();
		BigDecimal b = new BigDecimal(exchAmount);
		return b.toString();
	}
	
	
	
	/**
	 * 丸め。
	 * @param amount 対象金額
	 * @param s ストラクトオブジェクト
	 * @return 丸め金額
	 * @throws SQLException 処理失敗
	 * @throws ExpjException 処理失敗
	 */
	private String roundAmount(String amount, KR0070010Struct s) throws SQLException, ExpjException {
		ExchAmount exch = new ExchAmount(conn);
		boolean result = exch.doMarume(amount, s.getCOMPANY_CD(), s.geth_CUR_CD(), s.getEXCH_TYP(), s.getDETAIL_ROUND_TYP(), s.getSALES_DATE());
		if (!result) {
			throw new ExpjException("KQ00038");
		}
		return exch.getS_EXCH_AMOUNT();
	}
	
//Add NEC 20140618 Str
      /**
       * システムパラメータチェック       
       * @throws SQLException 処理失敗
       * @throws ExpjException 処理失敗
     * @throws FoundationException 
       */
	private void chkAprSales() throws SQLException, ExpjException, FoundationException {
		  String installFlg = "";
          List installOptionsList = entity.mSYS_INSTALL_OPTIONS_B.read(conn, struct);
          if(installOptionsList.size() > 0){
        	  installFlg = ((KR0070010Struct)installOptionsList.get(0)).getINSTALL_FLG();
        	  
          }
          if (installOptionsList.isEmpty() || "0".equals(installFlg)) {  
              // 売掛管理がインストールされていない。
   	        
   	           /** パラメータ「売上実績承認」を取得*/
   	           privateConfig = new PrivateConfig(conn);
   	           aprSales = privateConfig.getString("APR_SALES");
   	           // パラメータ「売上実績承認」が取得できなかった場合
   	          if(aprSales == null || "".equals(aprSales)){
    				String locale = CoreTools.getLocale(struct.getsUser_ID());
    				ResourceBundle messages = CoreTools.getResourceBundle("ExpjMessage", locale);
    				setErrorMessage("AZ00041", messages.getString("AZ00074"));
    				aprSales = "0";
   	            	return;
   	          }else if(!"1".equals(aprSales)){   	        	  
   				  // １以外の場合
   	        	  aprSales = "0";
   	          }else{
   	        	  // １の場合
   	              aprSales = "1";
   	          }
   	          //売上実績承認が1：行う場合
   	          if("1".equals(aprSales)){
   	   	          //伝票番号で[売上実績]を検索し、承認状況≠1:承認待ち　の場合
   	   	          List tSalesApprList = entity.mT_SALES_ApprFlg.read(conn,struct);
   	   	          if(tSalesApprList != null && tSalesApprList.size() > 0){
   	   	        	  setErrorMessage("KR00025");
   	   	        	  return;
   	   	          }   	        	  
   	          }   
          }
      }
 
      /**
       * システムパラメータチェック       
       * @throws SQLException 処理失敗
       * @throws ExpjException 処理失敗
     * @throws FoundationException 
       */
	private boolean blnchkAprSales() throws SQLException, ExpjException, FoundationException {
	
   	           /** パラメータ「売上実績承認」を取得*/
   	           privateConfig = new PrivateConfig(conn);
   	           aprSales = privateConfig.getString("APR_SALES");
   	           // パラメータ「売上実績承認」が取得できなかった場合
   	          if(aprSales == null || "".equals(aprSales)){
    				String locale = CoreTools.getLocale(struct.getsUser_ID());
    				ResourceBundle messages = CoreTools.getResourceBundle("ExpjMessage", locale);
    				setErrorMessage("AZ00041", messages.getString("AZ00074"));
    				aprSales = "0";
   	            	return false;
   	          }else if(!"1".equals(aprSales)){   	        	  
   				  // １以外の場合
   	        	  return false;
   	          }else{
   	        	  // １の場合
   	        	 return true;
   	          }     	  
      }
//Add NEC 20140618 End
		
	/**
	 * 邦貨換算処理
	 * 
	 * @param curCd
	 *            通貨コード
	 * @param exchTyp
	 *            為替種別
	 * @param roundTyp
	 *            丸め区分
	 * @param decimalFig
	 *            小数桁数
	 * @param amount
	 *            邦貨換算前金額
	 * @param stdDate
	 *            基準日
	 * @return String 変換後金額
	 */
	private String getExchChangeAmount(String curCd, String exchTyp,
			String roundTyp, String decimalFig, String amount, String stdDate) {
		try {
			/* 変数定義 */
			String exchRate; // 為替レート
			String homeCurAmount; // 邦貨換算金額

			// 為替レート取得
			ExchRateStruct ers = ExchRateControl.getData(conn, // DBコネクション
					getsysCOMPANY_CD(), // 会社コード
					curCd, // 通貨コード
					exchTyp, // 為替種別
					null, // 為替予約コード(未使用)
					stdDate); // 基準日

			exchRate = ers.getEXCH_RATE();

			// 邦貨換算処理
			homeCurAmount = AmountCalculator.calcHomeCurAmount(amount, // 対象金額
					exchRate, // 為替レート
					roundTyp, // 丸め区分
					decimalFig); // 小数桁数

			return homeCurAmount;

		} catch (Exception e) {
			return amount;
		}
	}
	

	/**
	 * [売上実績]（黒伝）登録用データを生成
	 * @return
	 * @throws FoundationException
	 * @throws SQLException
	 * @throws ExpjException
	 */
	private KR0070010Struct createDebitRecord() throws FoundationException, SQLException, ExpjException {
		
		KR0070010Struct s = new KR0070010Struct();
		// 売上区分  4:非在庫品売上
		s.setSALES_TYP("4");
		// 得意先コード
		s.setCUST_CD(struct.getCUST_CD());
		// 品目番号
		s.setITEM_CD(struct.getITEM_CD());	
		// 品目名称
		s.setITEM_NAME(struct.getITEM_NAME());
		// 得意先注文番号
		s.setCUST_ODR_NO(struct.getCUST_ODR_NO());
		// 売上計上日
		s.setSALES_DATE(struct.getSALES_DATE());
		// 売上計上部門
		s.setSALES_DEPT_CD(struct.getSALES_DEPT_CD());
		// 取引先コード
		s.setVEND_CD(null);
		// 製造場所コード
		s.setPRD_ODR_PLACE_CD(null);
		// 営業担当者コード
		s.setCUST_CHRG_PSN_CD(struct.getCUST_CHRG_PSN_CD());
		// 発行担当者コード
		s.setODR_ACPT_PSN_CD(struct.getODR_ACPT_PSN_CD());
		// 売上実績数量
		s.setSALES_QTY(struct.getSALES_QTY());
		// 単価
		s.setSALES_UNIT_PRICE(struct.getSALES_UNIT_PRICE());
		// 単位
		s.setUNIT_CD(struct.getSTOCK_UNIT());
		// 売上実績金額
		s.setSALES_AMOUNT(struct.getSALES_AMOUNT());
		
		// 売上実績金額(邦貨)
		String salesAmountExchRates = exchAmount(struct.getSALES_AMOUNT(), struct);
		if (msgStruct.hasError()) {
		 return s;
		}
		s.setSALES_AMOUNT_EXCH_RATES(salesAmountExchRates);
		
		// 受領検収日
		s.setINSPC_ACPT_DATE(struct.getSALES_DATE());
		// 受領検収数
		s.setINSPC_ACPT_QTY(struct.getSALES_QTY());
		
		// 外税対象金額
		String externalTaxSalesAmount = SaAmountCalculator.calcExternalTaxSalesAmount( struct.getTAX_CD(), s.getSALES_AMOUNT());
		s.setEXTERNAL_TAX_SALES_AMOUNT(externalTaxSalesAmount);
		// 内税対象金額
		String internalTaxSalesAmount = SaAmountCalculator.calcInternalTaxSalesAmount( struct.getTAX_CD(), s.getSALES_AMOUNT());
		s.setINTERNAL_TAX_SALES_AMOUNT(internalTaxSalesAmount);
		// 非課税対象金額
		String taxfreeSalesAmount =	SaAmountCalculator.calcTaxfreeSalesAmount(struct.getTAX_CD(), s.getSALES_AMOUNT());
		s.setTAXFREE_SALES_AMOUNT(taxfreeSalesAmount);
		
		// 税額１
		String taxAmount1 = SaAmountCalculator.calcTaxAmount( struct.getTAX_CD(),
																s.getSALES_AMOUNT(),
																struct.getTAX_RATE_1(),
																String.valueOf(decimalFig),
																struct.getTAX_ROUND_TYP());
		s.setTAX_AMOUNT_1(taxAmount1);
		
		// 税額２
		String taxAmount2 = SaAmountCalculator.calcTaxAmount( struct.getTAX_CD(),
																s.getSALES_AMOUNT(),
																struct.getTAX_RATE_2(),
																String.valueOf(decimalFig),
																struct.getTAX_ROUND_TYP());
		s.setTAX_AMOUNT_2(taxAmount2);
		
		// 税額３
		String taxAmount3 = SaAmountCalculator.calcTaxAmount( struct.getTAX_CD(),
																s.getSALES_AMOUNT(),
																struct.getTAX_RATE_3(),
																String.valueOf(decimalFig),
																struct.getTAX_ROUND_TYP());
		s.setTAX_AMOUNT_3(taxAmount3);
		
		// 消費税額（外税）
		String externalTaxAmount = SaAmountCalculator.calcExternalTaxAmount( struct.getTAX_CD(),
																				s.getTAX_AMOUNT_1(),
																				s.getTAX_AMOUNT_2(),
																				s.getTAX_AMOUNT_3());
		s.setEXTERNAL_TAX_AMOUNT(externalTaxAmount);
		
		// 消費税額（内税）
		String internalTaxAmount = SaAmountCalculator.calcInternalTaxAmount( struct.getTAX_CD(),
																				s.getTAX_AMOUNT_1(),
																				s.getTAX_AMOUNT_2(),
																				s.getTAX_AMOUNT_3());
																				s.setINTERNAL_TAX_AMOUNT(internalTaxAmount);
																				
		// 税抜売上金額
		String taxCreditSalesAmount = SaAmountCalculator.calcTaxCreditSalesAmount( s.getEXTERNAL_TAX_SALES_AMOUNT(),
																					s.getINTERNAL_TAX_SALES_AMOUNT(),
																					s.getTAXFREE_SALES_AMOUNT(),
																					s.getINTERNAL_TAX_AMOUNT());
		s.setTAX_CREDIT_SALES_AMOUNT(taxCreditSalesAmount);
		
		// 税抜売上金額（邦貨）
		String taxCreditSalesAmountExchRates = exchAmount(taxCreditSalesAmount, struct);
		if (msgStruct.hasError()) {
			return s;
		}
		s.setOWN_CUR_TAXCREDIT_SALES_AMOUNT(taxCreditSalesAmountExchRates);
		
		//売上実績管理番号
		s.seth_SALES_SEQ_NO(struct.geth_SALES_SEQ_NO());
		// 元伝票番号
		s.setORG_SLIP_CD(null);
		// 通貨コード
		s.setCURRNCY_CD(struct.geth_CUR_CD());
		// 特値区分
		s.setSPCL_PRICE_CO(null);
		// 備考
		s.setREMARKS(struct.getREMARKS());
		// 検収区分
		s.setINSPC_ACPT_TYP(struct.getINSPC_ACPT_TYP());
		// 状態区分
		s.setSTATUS("20");
		// 削除フラグ
		s.setDEL_FLG("0");
		
		//MOD NEC 2014.06.18 STR
		//EJの場合、システムパラメータ(承認)チェック
    	  if("J".equals(getExplannerFlag()) && blnchkAprSales() == true){
    	  	s.setAPPR_FLG("1");
    		s.setAPPR_ID(null);
    		s.setAPPR_DATE(null);
    	  }else{
    		s.setAPPR_FLG("3");
    		s.setAPPR_ID(getsysUSER_CD());
    		s.setAPPR_DATE(struct.getBUSINESS_OPR_DATE());
    	  }	 
    	  
		/*
		// 承認状況
		s.setAPPR_FLG("3");
		// 承認者
		s.setAPPR_ID(getsysUSER_CD());
		// 承認日付
		s.setAPPR_DATE(getBusinessOprDate());
		*/
		
		//MOD NEC 2014.06.18 END

		// 作成日
		s.setsSysdate(struct.getsSysdate());
		// 作成者
		s.setsUser_ID(sysUSER_CD);
		
		return s;
	}
	
	/**
	 * [仮売上実績]に登録する黒レコードを作成する
	 */
	private KR0070010Struct createKuroRecord() throws FoundationException, SQLException, ExpjException {
		KR0070010Struct s = new KR0070010Struct();
		//売上実績管理番号
		s.setSALES_SEQ_NO(null);
		//会社コード
		s.setCOMPANY_CD(getsysCOMPANY_CD());
		//出荷指示番号
		s.setSHIP_ODR_NO(null);
		//出荷実績管理番号
		s.setSHIP_SEQ_NO(null);
		//伝票番号
		s.setSLIP_CD(null);
		// 売上区分  4:非在庫品売上
		s.setSALES_TYP("4");
		// 得意先コード
		s.setCUST_CD(struct.getCUST_CD());
		// 品目番号
		s.setITEM_CD(struct.getITEM_CD());
		// 品目名称
		s.setITEM_NAME(struct.getITEM_NAME());
		// 得意先注文番号
		s.setCUST_ODR_NO(struct.getCUST_ODR_NO());
		// 売上計上日
		s.setSALES_DATE(struct.getSALES_DATE());
		// 売上計上部門
		s.setSALES_DEPT_CD(struct.getSALES_DEPT_CD());
		//取引先コード
		s.setVEND_CD(null);
		//製造場所コード
		s.setPRD_ODR_PLACE_CD(null);
		// 営業担当者コード
		s.setCUST_CHRG_PSN_CD(struct.getCUST_CHRG_PSN_CD());
		// 発行担当者コード
		s.setODR_ACPT_PSN_CD(struct.getODR_ACPT_PSN_CD());
		// 売上実績数量
		s.setSALES_QTY(struct.getSALES_QTY());
		// 単価
		s.setSALES_UNIT_PRICE(struct.getSALES_UNIT_PRICE());
		// 単位
		s.setUNIT_CD(struct.getSTOCK_UNIT());
		// 売上実績金額
		s.setSALES_AMOUNT(struct.getSALES_AMOUNT());
		// 売上実績金額（邦貨）
		s.setSALES_AMOUNT_EXCH_RATES(exchAmount(struct.getSALES_AMOUNT(), struct));
		// 外税対象金額
		s.setEXTERNAL_TAX_SALES_AMOUNT(SaAmountCalculator.calcExternalTaxSalesAmount(struct.getTAX_CD(), s.getSALES_AMOUNT()));
		// 内税対象金額
		s.setINTERNAL_TAX_SALES_AMOUNT(SaAmountCalculator.calcInternalTaxSalesAmount(struct.getTAX_CD(), s.getSALES_AMOUNT()));
		// 非課税対象金額
		s.setTAXFREE_SALES_AMOUNT(SaAmountCalculator.calcTaxfreeSalesAmount(struct.getTAX_CD(), s.getSALES_AMOUNT()));
		// 税額１
		s.setTAX_AMOUNT_1(SaAmountCalculator.calcTaxAmount(struct.getTAX_CD(),
															s.getSALES_AMOUNT(),
															struct.getTAX_RATE_1(),
															String.valueOf(decimalFig),
															struct.getTAX_ROUND_TYP()));
		// 税額２
		s.setTAX_AMOUNT_2(SaAmountCalculator.calcTaxAmount(struct.getTAX_CD(),
															s.getSALES_AMOUNT(),
															struct.getTAX_RATE_2(),
															String.valueOf(decimalFig),
															struct.getTAX_ROUND_TYP()));
		// 税額３
		s.setTAX_AMOUNT_3(SaAmountCalculator.calcTaxAmount(struct.getTAX_CD(),
															s.getSALES_AMOUNT(),
															struct.getTAX_RATE_3(),
															String.valueOf(decimalFig),
															struct.getTAX_ROUND_TYP()));
		// 消費税額（外税）
		s.setEXTERNAL_TAX_AMOUNT(SaAmountCalculator.calcExternalTaxAmount(struct.getTAX_CD(),
																			s.getTAX_AMOUNT_1(),
																			s.getTAX_AMOUNT_2(),
																			s.getTAX_AMOUNT_3()));
		// 消費税額（内税）
		s.setINTERNAL_TAX_AMOUNT(SaAmountCalculator.calcInternalTaxAmount(struct.getTAX_CD(),
																			s.getTAX_AMOUNT_1(),
																			s.getTAX_AMOUNT_2(),
																			s.getTAX_AMOUNT_3()));
		// 税抜売上金額
		s.setTAX_CREDIT_SALES_AMOUNT(SaAmountCalculator.calcTaxCreditSalesAmount(s.getEXTERNAL_TAX_SALES_AMOUNT(),
																					s.getINTERNAL_TAX_SALES_AMOUNT(),
																					s.getTAXFREE_SALES_AMOUNT(),
																					s.getINTERNAL_TAX_AMOUNT()));

		if (msgStruct.hasError()) {
			return s;
		}
		// 税抜売上金額（邦貨）
		s.setOWN_CUR_TAXCREDIT_SALES_AMOUNT(exchAmount(s.getTAX_CREDIT_SALES_AMOUNT(), struct));
		if (msgStruct.hasError()) {
			return s;
		}
		
		//元伝票番号
		s.setORG_SLIP_CD(null);
		// 通貨コード
		s.setCUR_CD(struct.geth_CUR_CD());
		// 金額区分
		s.setAMOUNT_TYP("0");
		// 備考
		s.setREMARKS(struct.getREMARKS());
		// 検収区分
		s.setINSPC_ACPT_TYP(struct.getINSPC_ACPT_TYP());
		//仮売上計上区分
		s.setTEMP_SALES_TYP("1");
		//売上実績照合区分
		s.setSALES_DISAGREEMENT_TYP("1");
		//売上計上フラグ
		s.setSALES_FLG("0");
		//売上実績IF対象フラグ
		s.setSALES_IF_FLG("1");
		// 削除フラグ
		s.setDEL_FLG("0");
		
		//MOD NEC 2014.06.18 STR
		//EJの場合、システムパラメータ(承認)チェック
    	  if("J".equals(getExplannerFlag()) && blnchkAprSales() == true){
    	  	s.setAPPR_FLG("1");
    		s.setAPPR_ID(null);
    		s.setAPPR_DATE(null);
    	  }else{
    		s.setAPPR_FLG("3");
    		s.setAPPR_ID(getsysUSER_CD());
    		s.setAPPR_DATE(struct.getBUSINESS_OPR_DATE());
    	  }	 
    	  
		/*
		// 承認状況
		s.setAPPR_FLG("3");
		// 承認者
		s.setAPPR_ID(getsysUSER_CD());
		// 承認日付
		s.setAPPR_DATE(getBusinessOprDate());
		*/
		//MOD NEC 2014.06.18 END
		
		// 作成日
		s.setsSysdate(struct.getsSysdate());
		// 作成者
		s.setsUser_ID(sysUSER_CD);
		
		return s;
	}
	
	/**
	 * [売上実績ヘッダ]に登録する黒レコードを作成する
	 * @return
	 * @throws FoundationException
	 * @throws SQLException
	 * @throws ExpjException
	 */
	private KR0070010Struct createSalesH() throws FoundationException, SQLException, ExpjException {
		
		KR0070010Struct s = new KR0070010Struct();
		//売上実績伝票番号
		s.setSALES_H_NO(null);
		s.seth_SALES_H_NO(struct.geth_SALES_H_NO());
		// 売上区分  4:非在庫品売上
		s.setSALES_TYP("4");
		// 売上計上日
		s.setSALES_DATE(struct.getSALES_DATE());
		// 受領検収日
		s.setINSPC_ACPT_DATE(struct.getSALES_DATE());
		// 売上計上部門コード
		s.setSALES_DEPT_CD(struct.getSALES_DEPT_CD());
		// 得意先コード
		s.setCUST_CD(struct.getCUST_CD());
		// 請求先コード
		List custCd = entity.mM_CLAIM_CUST_CTRL.read(conn, struct);
		if (!custCd.isEmpty()) {
			KR0070010Struct scustCd = (KR0070010Struct) custCd.get(0);
			s.setBILL_ADDRESSEE_CD(scustCd.getBILL_ADDRESSEE_CD());
		}
		// 営業担当者コード
		s.setCUST_CHRG_PSN_CD(struct.getCUST_CHRG_PSN_CD());
		// 発行担当者コード
		s.setODR_ACPT_PSN_CD(struct.getODR_ACPT_PSN_CD());
		// 通貨コード
		s.setCURRNCY_CD(struct.geth_CUR_CD());
		// 検収区分
		s.setINSPC_ACPT_TYP(struct.getINSPC_ACPT_TYP());
			
		/* 「消費税計算」実行 */
		List calcTaxList = calcTaxProc(struct.getTAX_CD(), // 消費税コード
										struct.getSALES_DATE().substring(0, 10), // 売上計上日
										String.valueOf(decimalFig), // 小数桁数
										struct.getSALES_AMOUNT()); // 対象金額
		
		// 課税関連金額を計算
		if (!calcTaxList.isEmpty()) {
			s.setSALES_AMOUNT(struct.getSALES_AMOUNT()); // 税込金額
			s.setEXTERNAL_TAX_SALES_AMOUNT((String) calcTaxList.get(9)); // 外税対象金額
			s.setINTERNAL_TAX_SALES_AMOUNT((String) calcTaxList.get(10)); // 内税対象金額
			s.setTAXFREE_SALES_AMOUNT((String) calcTaxList.get(11)); // 非課税対象金額
			s.setTAX_CREDIT_SALES_AMOUNT((String) calcTaxList.get(6)); // 税抜金額

			s.setEXTERNAL_TAX_AMOUNT((String) calcTaxList.get(12)); // 消費税額（外税）
			s.setINTERNAL_TAX_AMOUNT((String) calcTaxList.get(13)); // 消費税額（内税）
			s.setTAX_AMOUNT_1((String) calcTaxList.get(3)); // 税額１
			s.setTAX_AMOUNT_2((String) calcTaxList.get(4)); // 税額２
			s.setTAX_AMOUNT_3((String) calcTaxList.get(5)); // 税額３

			// 売上実績金額(邦貨)を計算
			String salesExhangeAmount = "0";
			if (!getHomeCurCd().equals(s.getCURRNCY_CD())) {
				salesExhangeAmount = getExchChangeAmount(struct.geth_CUR_CD(), // 通貨コード
						struct.getEXCH_TYP(), // 為替種別
						struct.getDETAIL_ROUND_TYP(), // まるめ区分
						String.valueOf(decimalFig), // 小数桁数
						(String) calcTaxList.get(8), // 金額
						s.getSALES_DATE().substring(0, 10)); // 対象日付
			} else {
				salesExhangeAmount = (String) calcTaxList.get(8);
			}
			s.setSALES_AMOUNT_EXCH_RATES(salesExhangeAmount);
			
			// 税抜売上金額（邦貨）を計算
			String salesTaxCreditAmount = "0";
			if (!getHomeCurCd().equals(s.getCURRNCY_CD())) {
				salesTaxCreditAmount = getExchChangeAmount(struct.geth_CUR_CD(), // 通貨コード
						struct.getEXCH_TYP(), // 為替種別
						struct.getDETAIL_ROUND_TYP(), // まるめ区分
						String.valueOf(decimalFig), // 小数桁数
						(String) calcTaxList.get(6), // 金額
						s.getSALES_DATE().substring(0, 10)); // 対象日付
			} else {
				salesTaxCreditAmount = (String) calcTaxList.get(6);
			}
			s.setOWN_CUR_TAXCREDIT_SALES_AMOUNT(salesTaxCreditAmount);
		}
		// 作成日
		s.setsSysdate(struct.getsSysdate());
		// 作成者
		s.setsUser_ID(sysUSER_CD);

		return s;
	}
	
	/**
	 * 売上実績テーブル
	 * @return
	 * @throws FoundationException
	 * @throws SQLException
	 * @throws ExpjException
	 */
	private KR0070010Struct createSales() throws FoundationException, SQLException, ExpjException {
		KR0070010Struct s = new KR0070010Struct();
		// 売上実績管理番号
		s.seth_SALES_SEQ_NO(struct.geth_SALES_SEQ_NO());
		// 売上区分  4:非在庫品売上
		s.setSALES_TYP("4");
		// 得意先コード
		s.setCUST_CD(struct.getCUST_CD());
		// 品目番号
		s.setITEM_CD(struct.getITEM_CD());
		// 品目名称
		s.setITEM_NAME(struct.getITEM_NAME());
		// 得意先注文番号
		s.setCUST_ODR_NO(struct.getCUST_ODR_NO());
		// 売上計上日
		s.setSALES_DATE(struct.getSALES_DATE());
		// 売上計上部門
		s.setSALES_DEPT_CD(struct.getSALES_DEPT_CD());
		// 営業担当者コード
		s.setCUST_CHRG_PSN_CD(struct.getCUST_CHRG_PSN_CD());
		// 発行担当者コード
		s.setODR_ACPT_PSN_CD(struct.getODR_ACPT_PSN_CD());
		// 売上実績数量
		s.setSALES_QTY(struct.getSALES_QTY());
		// 得意先売上実績数量
		s.setCUST_SALES_QTY(struct.getSALES_QTY());
		// 単価
		s.setSALES_UNIT_PRICE(struct.getSALES_UNIT_PRICE());
		// 単位
		s.setUNIT_CD(struct.getUNIT_CD());
		// 得意先売上単位
		s.setCUST_UNIT_CD(struct.getSTOCK_UNIT());
		// 受領検収日
		s.setINSPC_ACPT_DATE(struct.getSALES_DATE());
		// 受領検収数
		s.setINSPC_ACPT_QTY(struct.getSALES_QTY());
		// 得意先受領検収数
		s.setCUST_INSPC_ACPT_QTY(struct.getSALES_QTY());
		
		// 通貨コード
		s.setCURRNCY_CD(struct.geth_CUR_CD());
		
		// 消費税コード を取得する

		// 小数桁数を取得する
		/* 「消費税計算」実行 */
		List calcTaxList = calcTaxProc(struct.getTAX_CD(), // 消費税コード
				struct.getSALES_DATE().substring(0, 10), // 納入予定日時
				String.valueOf(decimalFig), // 小数桁数
				struct.getSALES_AMOUNT()); // 対象金額
		
		// 課税関連金額を計算
		if (!calcTaxList.isEmpty()) {
			s.setSALES_AMOUNT(struct.getSALES_AMOUNT()); // 税込金額
			s.setEXTERNAL_TAX_SALES_AMOUNT((String) calcTaxList.get(9)); // 外税対象金額
			s.setINTERNAL_TAX_SALES_AMOUNT((String) calcTaxList.get(10)); // 内税対象金額
			s.setTAXFREE_SALES_AMOUNT((String) calcTaxList.get(11)); // 非課税対象金額
			s.setTAX_CREDIT_SALES_AMOUNT((String) calcTaxList.get(6)); // 税抜金額

			s.setEXTERNAL_TAX_AMOUNT((String) calcTaxList.get(12)); // 消費税額（外税）
			s.setINTERNAL_TAX_AMOUNT((String) calcTaxList.get(13)); // 消費税額（内税）
			s.setTAX_AMOUNT_1((String) calcTaxList.get(3)); // 税額１
			s.setTAX_AMOUNT_2((String) calcTaxList.get(4)); // 税額２
			s.setTAX_AMOUNT_3((String) calcTaxList.get(5)); // 税額３

			// 売上実績金額(邦貨)を計算
			// 通貨コード取得
			String salesExhangeAmount = "0";
			if (!getHomeCurCd().equals(s.getCURRNCY_CD())) {
				salesExhangeAmount = getExchChangeAmount(struct
						.geth_CUR_CD(), // 通貨コード
						struct.getEXCH_TYP(), // 為替種別
						struct.getDETAIL_ROUND_TYP(), // まるめ区分
						String.valueOf(decimalFig), // 小数桁数
						(String) calcTaxList.get(8), // 金額
						s.getSALES_DATE().substring(0, 10)); // 対象日付
			} else {
				salesExhangeAmount = (String) calcTaxList.get(8);
			}
			s.setSALES_AMOUNT_EXCH_RATES(salesExhangeAmount);
			// 税抜売上金額（邦貨）を計算

			String salesTaxCreditAmount = "0";
			if (!getHomeCurCd().equals(s.getCURRNCY_CD())) {
				salesTaxCreditAmount = getExchChangeAmount(struct
						.geth_CUR_CD(), // 通貨コード
						struct.getEXCH_TYP(), // 為替種別
						struct.getDETAIL_ROUND_TYP(), // まるめ区分
						String.valueOf(decimalFig), // 小数桁数
						(String) calcTaxList.get(6), // 金額
						s.getSALES_DATE().substring(0, 10)); // 対象日付
			} else {
				salesTaxCreditAmount = (String) calcTaxList.get(6);
			}

			s.setOWN_CUR_TAXCREDIT_SALES_AMOUNT(salesTaxCreditAmount);
		}
	
		// 備考
		s.setREMARKS(struct.getREMARKS());
		// 通貨コード
		s.setCURRNCY_CD(struct.geth_CUR_CD());
		// 検収区分
		s.setINSPC_ACPT_TYP(struct.getINSPC_ACPT_TYP());
		
		//MOD NEC 2014.06.18 STR
		//EJの場合、システムパラメータ(承認)チェック
    	  if("J".equals(getExplannerFlag()) && blnchkAprSales() == true){
    	  	s.setAPPR_FLG("1");
    		s.setAPPR_ID(null);
    		s.setAPPR_DATE(null);
    	  }else{
    		s.setAPPR_FLG("3");
    		s.setAPPR_ID(getsysUSER_CD());
    		s.setAPPR_DATE(struct.getBUSINESS_OPR_DATE());
    	  }	 
    	  
		/*
		// 承認状況
		s.setAPPR_FLG("3");
		// 承認者
		s.setAPPR_ID(getsysUSER_CD());
		// 承認日付
		s.setAPPR_DATE(getBusinessOprDate());
		*/
		
		//MOD NEC 2014.06.18 END
		// 保留理由
		s.setRESERVE_CAUSE(null);
		// 作成日
		s.setsSysdate(struct.getsSysdate());
		// 作成者
		s.setsUser_ID(sysUSER_CD);
		return s;

	}
	
	
	
	/**
	 * 消費税計算
	 * 
	 * @param taxCd
	 *            消費税コード
	 * @param judgeDate
	 *            新消費税率判定日
	 * @param decimalFig
	 *            小数桁数
	 * @param amount
	 *            金額
	 * @return List
	 */
	private List calcTaxProc(String taxCd, String judgeDate, String decimalFig,
			String amount) throws FoundationException {
	
		// 戻り値リスト
		List retList = new ArrayList();
	
		// 「消費税計算」部品定義
		Common common = new Common(conn, sysUSER_CD, sp.getProcId(), getSalesPLANT_CD(), getsysCOMPANY_CD());
		// 「消費税計算」呼び出し
		List calcTaxList = common.calcTaxFd(taxCd, // 消費税コード
				judgeDate, // 新消費税率判定日
				decimalFig, // 小数桁数
				amount); // 金額
	
		// 「消費税計算」結果ステータスが正常終了以外の場合はエラー
		if (common.getResultStatus().intValue() != STATUS_NORMAL) {
			setErrorMessage("KQ20171");
			return retList;
		}
	
		// 「消費税計算」取得結果をリストに再配置
		retList.add(calcTaxList.get(0).toString()); // 0:税率１
		retList.add(calcTaxList.get(1).toString()); // 1:税率２
		retList.add(calcTaxList.get(2).toString()); // 2:税率３
		retList.add(calcTaxList.get(3).toString()); // 3:税額１
		retList.add(calcTaxList.get(4).toString()); // 4:税額２
		retList.add(calcTaxList.get(5).toString()); // 5:税額３
		retList.add(calcTaxList.get(6).toString()); // 6:税抜金額
		retList.add(calcTaxList.get(7).toString()); // 7:消費税金額
		retList.add(calcTaxList.get(8).toString()); // 8:税込金額
		retList.add(calcTaxList.get(9).toString()); // 9:外税対象金額
		retList.add(calcTaxList.get(10).toString()); // 10:内税対象金額
		retList.add(calcTaxList.get(11).toString()); // 11:非課税対象金額
		retList.add(calcTaxList.get(12).toString()); // 12:消費税額（外税）
		retList.add(calcTaxList.get(13).toString()); // 13:消費税額（内税）
		retList.add(calcTaxList.get(14).toString()); // 14:端数区分
		
		// 処理終了
		return retList;
	}

	/**
	 * [売上伝票]（赤伝）登録用データを生成
	 * @return
	 * @throws ExpjException
	 * @throws FoundationException
	 * @throws SQLException
	 */
	private KR0070010Struct createCreditRecord() throws ExpjException,FoundationException, SQLException {
		List resultList = entity.mT_SALES_CreditRecord.read(conn, struct);
		KR0070010Struct s = (KR0070010Struct) resultList.get(0);

		//売上実績管理番号
		s.seth_SALES_SEQ_NO(struct.geth_SALES_SEQ_NO());
		
		//MOD NEC 2014.06.18 STR
		//EJの場合、システムパラメータ(承認)チェック
    	  if("J".equals(getExplannerFlag()) && blnchkAprSales() == true){
    	  	s.setAPPR_FLG("1");
    		s.setAPPR_ID(null);
    		s.setAPPR_DATE(null);
    	  }else{
    		s.setAPPR_FLG("3");
    		s.setAPPR_ID(getsysUSER_CD());
    		s.setAPPR_DATE(struct.getBUSINESS_OPR_DATE());
    	  }	 
    	  
		/*
		// 承認状況
		s.setAPPR_FLG("3");
		// 承認者
		s.setAPPR_ID(getsysUSER_CD());
		// 承認日付
		s.setAPPR_DATE(getBusinessOprDate());
		*/
		
		//MOD NEC 2014.06.18 END
		// 更新日
		s.setsSysdate(struct.getsSysdate());
		// 更新者
		s.setsUser_ID(sysUSER_CD);
		return s;
	}

	/**
	 * [仮売上実績]に登録する赤レコードを作成する
	 */
	private KR0070010Struct createAkaRecord() throws FoundationException, SQLException {
		List l = new ArrayList();
		if ("Ja".equals(getExplannerFlag())) {
			l = entity.mAKA_T_SALES_TEMP_Ja.read(conn, struct);	
		} else {
			l = entity.mAKA_T_SALES_TEMP.read(conn, struct);
		}
		
		KR0070010Struct s = (KR0070010Struct) l.get(0);
		s.setsSysdate(struct.getsSysdate());
		s.setsUser_ID(sysUSER_CD);
		return s;
	}

	
	/**
	 * Explanner Jの登録
	 * @throws BusinessProcessException
	 * @throws FoundationException
	 */
	private void insertOfJ() throws BusinessProcessException, FoundationException {
		try {
			/* トランザクション開始 */
			conn.beginTransWeb();
			// [売上実績]（黒伝）登録用データを生成
			KR0070010Struct debitRecordStruct = createDebitRecord();
			if (msgStruct.hasError()) {
				return;
			}

			// 売上実績管理番号(連番)
			List salesSeqNoList = entity.mSEQ_SALES_SEQ_NO.read(conn, struct);
			KR0070010Struct salesSeqNoStruct = (KR0070010Struct) salesSeqNoList.get(0);
			debitRecordStruct.setSALES_SEQ_NO(salesSeqNoStruct.getSALES_SEQ_NO());
			// 伝票番号を自動採番
			common = new Common(conn, sysUSER_CD, sp.getProcId(), getSalesPLANT_CD(), getsysCOMPANY_CD());
			debitRecordStruct.setSLIP_CD(common.getSLIP_CD());
			// 元伝票番号にnullを設定
			debitRecordStruct.setORG_SLIP_CD(null);
			
			// [売上実績]（黒伝）の登録
			entity.mT_SALES.create(conn, debitRecordStruct);
			
			// 非在庫受注の伝票番号変更
			updateSlipCd(debitRecordStruct.getSLIP_CD());
	
			List installOptionsList = entity.mSYS_INSTALL_OPTIONS_B.read(conn, struct);
			 
			if (!installOptionsList.isEmpty()) {
				// 売掛管理がインストールされている場合、売掛管理Ⅰ／Ｆ(部品)の呼出
				ArIf arIf = new ArIf(conn, "1");
				arIf.setParameter("6", struct.getsUser_ID(), null, null, debitRecordStruct.getSLIP_CD(), struct.getTAX_CD());
				String msgNo = arIf.execute();
				if (!"0".equals(msgNo)) {
					setErrorMessage(msgNo);
					conn.rollback();
					return;
				}
			}
			// 消費税コード変更
			updateTaxCd();
			if (msgStruct.hasError()) {
				conn.rollback();
				return;
			}
			conn.commit();
			
			// 登録した黒伝の伝票番号で画面を再検索
			struct.setSLIP_CD(debitRecordStruct.getSLIP_CD());
			//登録
			struct.setrdoInsert("NULL");
			//更新・削除
			struct.setrdoUpdateDelete("true");
			
			controlSelect();
		} catch (Exception e) {
			setExpjExceptionMsg(e);
		} finally {
			if (conn != null) {
				conn.rollback();
			}
		}
	}
	
	/**
	 * Explanner Ja、Explanner JaScmの登録
	 * @throws BusinessProcessException
	 * @throws FoundationException
	 */
	public void insertOfJa() throws BusinessProcessException, FoundationException {
		try {
			/* トランザクション開始 */
			conn.beginTransWeb();
			// [売上実績]（黒伝）登録用データを生成
			KR0070010Struct kuroRecordStruct = createKuroRecord();
			if (msgStruct.hasError()) {
				return;
			}
			// 自動採番用
			common = new Common(conn, sysUSER_CD, sp.getProcId(), getSalesPLANT_CD(), getsysCOMPANY_CD());
			if ("Ja".equals(getExplannerFlag())) {
				// 売上実績管理番号(連番)
				List salesSeqNoList = entity.mSEQ_SALES_SEQ_NO.read(conn, struct);
				kuroRecordStruct.setSALES_SEQ_NO(((KR0070010Struct) salesSeqNoList.get(0)).getSALES_SEQ_NO());
				
				// 伝票番号を自動採番
				kuroRecordStruct.setSLIP_CD(common.getSLIP_CD());
			} else {
				// 売上実績管理番号(連番)
				kuroRecordStruct.setSALES_SEQ_NO(common.getNo());
				// 伝票番号を自動採番
				kuroRecordStruct.setSLIP_CD(common.getSCM_SLIP_CD());
			}
						
			// [仮売上実績]（黒伝）の登録
			if ("Ja".equals(getExplannerFlag())) {
				entity.mAKA_T_SALES_TEMP_Ja.create(conn, kuroRecordStruct);
			} else {
				entity.mT_SALES_TEMP.create(conn, kuroRecordStruct);	
			}
			// 非在庫受注の伝票番号変更
			updateSlipCd(kuroRecordStruct.getSLIP_CD());
			
			// 消費税コード変更
			updateTaxCd();
			if (msgStruct.hasError()) {
				conn.rollback();
				return;
			}
			//コミット
			conn.commit();
			
			// 登録した黒伝の伝票番号で画面を再検索
			struct.setSLIP_CD(kuroRecordStruct.getSLIP_CD());
			//登録
			struct.setrdoInsert("NULL");
			//更新・削除
			struct.setrdoUpdateDelete("true");
			
			controlSelect();
		} catch (Exception e) {
			setExpjExceptionMsg(e);
		} finally {
			if (conn != null) {
				conn.rollback();
			}
		}
	}
	
	/**
	 * Explanner Jfの登録
	 * @throws BusinessProcessException
	 * @throws FoundationException
	 */
	public void insertOfJf() throws BusinessProcessException, FoundationException {
		try {
			/* トランザクション開始 */
			conn.beginTransWeb();

			// [売上実績ヘッダ]を登録する。
			KR0070010Struct createSalesHStruct = createSalesH();
			if (msgStruct.hasError()) {
				return;
			}

			// 売上実績伝票番号(連番)
			List salesSeqNoList = entity.mSEQ_SALES_H_NO.read(conn, struct);
			KR0070010Struct salesSeqNoStruct = (KR0070010Struct) salesSeqNoList.get(0);
			createSalesHStruct.setSALES_H_NO(salesSeqNoStruct.getSALES_H_NO());
			
			// 出荷納品・その他売上伝票番号”SDN” & ORACLE_SEQUENCE[SEQ_ODR]（NEXTVAL）
			List salesOdrList = entity.mSEQ_ODR.read(conn, struct);
			KR0070010Struct salesOdrStruct = (KR0070010Struct) salesOdrList.get(0);
			createSalesHStruct.setSHIP_DLV_H_NO(salesOdrStruct.getSHIP_DLV_H_NO());


			// [売上実績]を登録する。
			KR0070010Struct createSalesStruct = createSales();
			if (msgStruct.hasError()) {
				return;
			}
			// 売上実績管理番号” SSN” & RACLE_SEQUENCE[SEQ_SALES_SEQ_NO]（NEXTVAL）
			List salesseqList = entity.mSEQ_SALES_SEQ_NO.read(conn, struct);
			KR0070010Struct salesseqStruct = (KR0070010Struct) salesseqList.get(0);
			createSalesStruct.setSALES_SEQ_NO(salesseqStruct.getSALES_SEQ_NO());
			// 売上実績伝票番号 [売上実績ヘッダ].”売上実績伝票番号”
			createSalesStruct.setSALES_H_NO(salesSeqNoStruct.getSALES_H_NO());
			// 出荷納品・その他売上伝票番号 [売上実績ヘッダ].”出荷納品・その他売上伝票番号”
			createSalesStruct.setSHIP_DLV_H_NO(salesOdrStruct.getSHIP_DLV_H_NO());
						
			entity.mT_SALES_H.create(conn, createSalesHStruct);
			entity.mT_SALES_Jf.create(conn, createSalesStruct);

			// 非在庫受注の伝票番号変更
			updateSlipCd(createSalesStruct.getSHIP_DLV_H_NO());
			
			// 「売掛管理」サブシステムがインストールされている場合、売掛管理Ｉ／Ｆ（部品） を 呼び出し、[売掛金トラン] を更新する。
			List installOptionsList = entity.mSYS_INSTALL_OPTIONS_B.read(conn, struct);
			if (!installOptionsList.isEmpty()) {
				List resultList =null;		
				common = new Common(conn, sysUSER_CD, sp.getProcId(), getSalesPLANT_CD(), getsysCOMPANY_CD());
				//売掛IF処理実行
				resultList= common.excArfIFFd(3, 1, salesOdrStruct.getSHIP_DLV_H_NO(), struct.getTAX_CD());
				
				// 正常終了判定
				if (common.getResultStatus().intValue() != STATUS_NORMAL) {
					setErrorMessage(resultList.get(0).toString());
					return ;
				}
			}
			// 消費税コード変更
			updateTaxCd();
			if (msgStruct.hasError()) {
				conn.rollback();
				return;
			}
			
			/* コミット */
			conn.commit();
			
			// 登録した伝票番号で画面を再検索
			struct.setSLIP_CD(createSalesStruct.getSHIP_DLV_H_NO());
			//登録
			struct.setrdoInsert("NULL");
			//更新・削除
			struct.setrdoUpdateDelete("true");
			controlSelect();
		} catch (Exception e) {
			setExpjExceptionMsg(e);
		} finally {
			if (conn != null) {
				conn.rollback();
			}
		}
	}
	
	/**
	 * Explanner Jの更新処理
	 * @throws BusinessProcessException
	 * @throws FoundationException
	 */
	public void updateOfJ() throws BusinessProcessException, FoundationException {
		try {
			/* トランザクション開始 */
			conn.beginTransWeb();
			// ｢伝票番号｣が、[売上実績]に存在しない場合
			List modifyList = entity.mT_SALES.read(conn, struct);
			if (modifyList.isEmpty()) {
				setErrorMessage("ZZ01105");
				return;
			}
			KR0070010Struct modifyStruct = (KR0070010Struct) modifyList.get(0);
			// [売上実績]."更新数" != ｢更新数｣(hidden使用)の場合
			if (!modifyStruct.getMODIFY_COUNT().equals(struct.getMODIFY_COUNT())) {
				setErrorMessage("ZZ01105");
				return;
			}

			//Ai連携対応、Ai連携ありかつ送信済の場合は[売上実績]赤黒明細を作成
			if("1".equals(getInstallFlg()) && "1".equals(struct.getAI_AR_IF_FLG())){
				// [売上伝票]（赤伝）登録用データを生成
				KR0070010Struct creditRecordStruct = createCreditRecord();
				// 売上実績管理番号(連番)
				List creditSalesSeqNoList = entity.mSEQ_SALES_SEQ_NO.read(conn, struct);
				KR0070010Struct creditSalesSeqNoStruct = (KR0070010Struct) creditSalesSeqNoList.get(0);
				creditRecordStruct.setSALES_SEQ_NO(creditSalesSeqNoStruct.getSALES_SEQ_NO());
				
				// 赤伝票番号は｢伝票番号｣を使用
				creditRecordStruct.setSLIP_CD(struct.getSLIP_CD());
				// 元伝票番号
				creditRecordStruct.setORG_SLIP_CD(struct.getSLIP_CD());
				// [売上伝票]（赤伝）を登録
				entity.mT_SALES.create(conn, creditRecordStruct);
				// [売上伝票]（黒伝）を論理削除
				entity.mT_SALES_Delete.update(conn, struct);
				// [売上伝票]（黒伝）登録用データを生成
				KR0070010Struct debitRecordStruct = createDebitRecord();
				if (msgStruct.hasError()) {
					return;
				}
				// 売上実績管理番号(連番)
				List debitSalesSeqNoList = entity.mSEQ_SALES_SEQ_NO.read(conn, struct);
				KR0070010Struct debitSalesSeqNoStruct = (KR0070010Struct) debitSalesSeqNoList.get(0);
				debitRecordStruct.setSALES_SEQ_NO(debitSalesSeqNoStruct.getSALES_SEQ_NO());
				// 黒伝票番号は｢伝票番号｣を使用
				debitRecordStruct.setSLIP_CD(struct.getSLIP_CD());
				// 元伝票番号
				debitRecordStruct.setORG_SLIP_CD(struct.getSLIP_CD());
				// [売上伝票]（黒伝）を登録
				entity.mT_SALES.create(conn, debitRecordStruct);
				
				// 登録した黒伝の伝票番号で画面を再検索
				struct.setSLIP_CD(debitRecordStruct.getSLIP_CD());
			} else {
				//Add NEC 2014.06.18 STR
				//売掛導入していない場合、システムパラメータ売上実績承認チェック(EJのみ)
				if("J".equals(getExplannerFlag()) ) {
                 	chkAprSales();
                 	if (msgStruct.hasError()) {                	 
                     	return;
                	 }
				}
				//Add NEC 2014.06.18 END
				List installOptionsList = entity.mSYS_INSTALL_OPTIONS_B.read(conn, struct);
				List arLedgerHTrnList = entity.mT_AR_LEDGER_H_TRN_CHECK.read(conn, struct);
				List arLedgerHList = entity.mT_AR_LEDGER_H_CHECK.read(conn, struct);
				
				if (installOptionsList.isEmpty() || (!installOptionsList.isEmpty() && !arLedgerHTrnList.isEmpty())) {
					// 売掛管理がインストールされていない場合
					// または、売掛管理がインストールされているかつ、[売掛金トランヘッダ]."伝票種類" = 14 の場合
					// [売上伝票]（黒伝）登録用データを生成
					KR0070010Struct debitRecordStruct = createDebitRecord();
					if (msgStruct.hasError()) {
						return;
					}
					// 伝票番号は｢伝票番号｣を使用する
					debitRecordStruct.setSLIP_CD(struct.getSLIP_CD());
					// [売上実績]（黒伝）を更新
					entity.mT_SALES.update(conn, debitRecordStruct);
					
					if (!installOptionsList.isEmpty()) {
						// 売掛管理がインストールされている場合
						// 売掛管理Ｉ／Ｆ
						ArIf arIf = new ArIf(conn, "1");
						arIf.setParameter("7", struct.getsUser_ID(), struct.getSLIP_CD(), null, null, struct.getTAX_CD());
						String msgNo = arIf.execute();
						if (!"0".equals(msgNo)) {
							setErrorMessage(msgNo);
							conn.rollback();
							return;
						}
					}
					
					// 登録した黒伝の伝票番号で画面を再検索
					struct.setSLIP_CD(debitRecordStruct.getSLIP_CD());
				} else if (!installOptionsList.isEmpty() && !arLedgerHList.isEmpty()) {
					// 売掛管理がインストールされているかつ、[売掛金元帳ヘッダ]."伝票種類" = 14 の場合
					// [売上伝票]（赤伝）登録用データを生成
					KR0070010Struct creditRecordStruct = createCreditRecord();
					// 売上実績管理番号(連番)
					List creditSalesSeqNoList = entity.mSEQ_SALES_SEQ_NO.read(conn, struct);
					KR0070010Struct creditSalesSeqNoStruct = (KR0070010Struct) creditSalesSeqNoList.get(0);
					creditRecordStruct.setSALES_SEQ_NO(creditSalesSeqNoStruct.getSALES_SEQ_NO());

					// 赤伝票番号を自動採番
					common = new Common(conn, sysUSER_CD, sp.getProcId(), getSalesPLANT_CD(), getsysCOMPANY_CD());
					creditRecordStruct.setSLIP_CD(common.getSLIP_CD());
					// 元伝票番号
					creditRecordStruct.setORG_SLIP_CD(struct.getSLIP_CD());
					// [売上伝票]（赤伝）を登録
					entity.mT_SALES.create(conn, creditRecordStruct);
					// [売上伝票]（黒伝）を論理削除
					entity.mT_SALES_Delete.update(conn, struct);
					// [売上伝票]（黒伝）登録用データを生成
					KR0070010Struct debitRecordStruct = createDebitRecord();
					if (msgStruct.hasError()) {
						return;
					}
					// 売上実績管理番号(連番)
					List debitSalesSeqNoList = entity.mSEQ_SALES_SEQ_NO.read(conn, struct);
					KR0070010Struct debitSalesSeqNoStruct = (KR0070010Struct) debitSalesSeqNoList.get(0);
					debitRecordStruct.setSALES_SEQ_NO(debitSalesSeqNoStruct.getSALES_SEQ_NO());
					// 黒伝票番号を自動採番
					common = new Common(conn, sysUSER_CD, sp.getProcId(), getSalesPLANT_CD(), getsysCOMPANY_CD());
					debitRecordStruct.setSLIP_CD(common.getSLIP_CD());
					// 元伝票番号
					debitRecordStruct.setORG_SLIP_CD(struct.getSLIP_CD());
					// [売上伝票]（黒伝）を登録
					entity.mT_SALES.create(conn, debitRecordStruct);
					// 売掛管理Ｉ／Ｆ
					ArIf arIf = new ArIf(conn, "1");
					arIf.setParameter("7", struct.getsUser_ID(),
							struct.getSLIP_CD(),
							creditRecordStruct.getSLIP_CD(),
							debitRecordStruct.getSLIP_CD(),
							struct.getTAX_CD());
					String msgNo = arIf.execute();
					if (!"0".equals(msgNo)) {
						setErrorMessage(msgNo);
						conn.rollback();
						return;
					}
				
					// 登録した黒伝の伝票番号で画面を再検索
					struct.setSLIP_CD(debitRecordStruct.getSLIP_CD());
					
					// 非在庫受注の伝票番号変更
					updateSlipCd(debitRecordStruct.getSLIP_CD());
				}
			}
			// 消費税コード変更
			updateTaxCd();
			if (msgStruct.hasError()) {
				conn.rollback();
				return;
			}
			conn.commit();
			controlSelect();
			
		} catch (Exception e) {
			setExpjExceptionMsg(e);
		} finally {
			if (conn != null) {
				conn.rollback();
			}
		}
		return;
	}

	/**
	 * Explanner Ja、Explanner JaScmの更新処理
	 * @throws BusinessProcessException
	 * @throws FoundationException
	 */
	public void updateOfJa() throws BusinessProcessException, FoundationException {
		try {
			/* トランザクション開始 */
			conn.beginTransWeb();
			
			// 売掛管理がインストールされているかのフラグ
			// true インストールされている
			// false インストールされていない
			boolean isUrikakeInstFlg = false;
			
			//伝票番号が計上済みかのフラグ
			//計上済み = true 
			//未計上 = false
			boolean checkSlip = false;
			
			//伝票番号を取得するかの区分
			//売掛管理がインストールされていない場合 = 1
			//仮売実績にのみ伝票番号が存在する場合 = 2
			//売掛トランヘッダに伝票番号が存在する場合 = 3
			//売掛元帳ヘッダに伝票番号が存在する場合 = 4
			int pros = 0;
			
			//共通部品クラス
			common = new Common(conn, sysUSER_CD, submitScreen, getSalesPLANT_CD(), getsysCOMPANY_CD());
			
			// 売掛管理がインストールされているかのチェック
			List instOptList = entity.mSYS_INSTALL_OPTIONS_B.read(conn, struct);
			if (instOptList.isEmpty()) {
				// 売掛管理がインストールされていない。
				isUrikakeInstFlg = false;
			} else {
				// 売掛管理がインストールされている。
				isUrikakeInstFlg = true;
			}
			// ｢伝票番号｣が、[仮売上実績]に存在しない場合
			List modifyList = entity.mT_SALES_TEMP.read(conn, struct);
			if (modifyList.isEmpty()) {
				setErrorMessage("ZZ01105");
				return;
			}
			
			// [仮売上実績]."更新数" != ｢更新数｣(hidden使用)の場合
			if (!(((KR0070010Struct) modifyList.get(0)).getMODIFY_COUNT()).equals(struct.getMODIFY_COUNT())) {
				setErrorMessage("ZZ01105");
				return;
			}
			
			//共通部品で売上計上済みか判定する
			checkSlip = common.excSalesCheck(struct.getSLIP_CD());
			// 売上実績IF対象フラグ
			if(checkSlip) {
				struct.setSALES_IF_FLG("1");
			} else {
				struct.setSALES_IF_FLG("0");
			}
			
			// [仮売上実績]レコードにの削除フラグを立てる前に
			// [仮売上実績]（赤伝）登録用データを生成
			KR0070010Struct akaRecordStruct = createAkaRecord();
			
			//[仮売上実績]のレコードを論理削除する
			entity.mT_SALES_TEMP_Delete.update(conn, struct);
			
			List arLedgerHTrnList = null;
			List arLedgerHList = null;
			
			if (isUrikakeInstFlg) {
				// 売掛管理がインストールされている場合
				arLedgerHTrnList = entity.mT_AR_LEDGER_H_TRN_CHECK.read(conn, struct);
				if (!arLedgerHTrnList.isEmpty()) {
					// [売掛金トランヘッダ]に伝票番号が存在する場合
					pros = 3;
				} else {
					arLedgerHList = entity.mT_AR_LEDGER_H_CHECK.read(conn, struct);
					if (!arLedgerHList.isEmpty()) {
						// [売掛金元帳ヘッダ]に伝票番号が存在する場合
						pros = 4;
					} else {
						// [売掛金トランヘッダ]にも[売掛金トランヘッダ]にも伝票番号が存在しない
						pros = 2;
					}
				}
			} else {
				// 売掛管理がインストールされていない場合
				pros = 1;
			}
			// 自動採番用
			common = new Common(conn,sysUSER_CD, sp.getProcId(), getSalesPLANT_CD(), getsysCOMPANY_CD());
			if ("Ja".equals(getExplannerFlag())) {
				// 売上実績管理番号(連番)
				List salesSeqNoList = entity.mSEQ_SALES_SEQ_NO.read(conn, struct);
				akaRecordStruct.setSALES_SEQ_NO(((KR0070010Struct) salesSeqNoList.get(0)).getSALES_SEQ_NO());
			} else {
				akaRecordStruct.setSALES_SEQ_NO(common.getNo());
			}
			
			//伝票番号を取得
			if (pros == 1 || pros == 2 || pros == 3) {
				akaRecordStruct.setSLIP_CD(struct.getSLIP_CD());
			} else {
				// 赤伝票番号を自動採番
				if ("Ja".equals(getExplannerFlag())) {
					akaRecordStruct.setSLIP_CD(common.getSLIP_CD());
				} else {
					akaRecordStruct.setSLIP_CD(common.getSCM_SLIP_CD());
				}
			}
			
			// 元伝票番号
			akaRecordStruct.setORG_SLIP_CD(struct.getSLIP_CD());
			// 売上実績IF対象フラグ
			akaRecordStruct.setSALES_IF_FLG(struct.getSALES_IF_FLG());
			// [仮売上実績]（赤伝）を登録
			if ("Ja".equals(getExplannerFlag())) {
				entity.mAKA_T_SALES_TEMP_Ja.create(conn, akaRecordStruct);
			} else {
				entity.mT_SALES_TEMP.create(conn, akaRecordStruct);
			}
			
			// [仮売上実績]（黒伝）登録用データを生成
			KR0070010Struct kuroRecordStruct = createKuroRecord();
			if (msgStruct.hasError()) {
				return;
			}
			if ("Ja".equals(getExplannerFlag())) {
				// 売上実績管理番号(連番)
				List salesSeqNoList2 = entity.mSEQ_SALES_SEQ_NO.read(conn, struct);
				kuroRecordStruct.setSALES_SEQ_NO(((KR0070010Struct) salesSeqNoList2.get(0)).getSALES_SEQ_NO());
			} else {
				kuroRecordStruct.setSALES_SEQ_NO(common.getNo());
			}
			
			// 伝票番号を取得
			if (pros == 1 || pros == 2 || pros == 3) {
				kuroRecordStruct.setSLIP_CD(struct.getSLIP_CD());
			} else {
				// 黒伝票番号を自動採番
				if ("Ja".equals(getExplannerFlag())) {
					kuroRecordStruct.setSLIP_CD(common.getSLIP_CD());
				} else {
					kuroRecordStruct.setSLIP_CD(common.getSCM_SLIP_CD());
				}
			}
			
			// 元伝票番号
			kuroRecordStruct.setORG_SLIP_CD(struct.getSLIP_CD());
			// 仮売上計上区分
			kuroRecordStruct.setTEMP_SALES_TYP("2");
						
			// [仮売上実績]（黒伝）を登録
			if ("Ja".equals(getExplannerFlag())) {
				entity.mAKA_T_SALES_TEMP_Ja.create(conn, kuroRecordStruct);
			} else {
				entity.mT_SALES_TEMP.create(conn, kuroRecordStruct);
			}
			if (pros == 4) {
				// 非在庫受注の伝票番号変更
				updateSlipCd(kuroRecordStruct.getSLIP_CD());
			}
			
			// 売上計上済みの場合、[売上実績]に登録する
			if(checkSlip){
				if ("Ja".equals(getExplannerFlag())) {
					common.excSalesConf(struct.getSLIP_CD(), common.EXCSALESCONF);
				} else {
					common.excSalesConf(struct.getSLIP_CD(), common.EXCSALESCONFSCM);
				}
			}
			// 売掛管理Ⅰ／Ｆ(自部品用)の呼出
			if(isUrikakeInstFlg && checkSlip){
				ArIf arIfmp = new ArIf(conn, "2");
				arIfmp.setParameter("7", struct.getsUser_ID(), struct.getSLIP_CD(), akaRecordStruct.getSLIP_CD(), kuroRecordStruct.getSLIP_CD(), struct.getTAX_CD());
				String msgNo = arIfmp.execute();
				if (!"0".equals(msgNo)) {
					setErrorMessage(msgNo);
					conn.rollback();
					return;
				}
			}
			
			// 消費税コード変更
			updateTaxCd();
			if (msgStruct.hasError()) {
				conn.rollback();
				return;
			}
			
			conn.commit();
			
			// 登録した黒伝の伝票番号で画面を再検索
			struct.setSLIP_CD(kuroRecordStruct.getSLIP_CD());
			controlSelect();
		} catch (Exception e) {
			setExpjExceptionMsg(e);
		} finally {
			if (conn != null) {
				conn.rollback();
			}
		}
		return;
	}
	
	/**
	 * Explanner Jfの更新
	 * @throws BusinessProcessException
	 * @throws FoundationException
	 */
	public void updateOfJf() throws BusinessProcessException, FoundationException{
		try {
			/* トランザクション開始 */
			conn.beginTransWeb();
			
			List modifyList = entity.mT_SALES_MODIFY_Jf.read(conn, struct);
			if (modifyList.isEmpty()) {
				setErrorMessage("ZZ01105");
				return;
			}
			KR0070010Struct modifyStruct = (KR0070010Struct) modifyList.get(0);
			if (!modifyStruct.getH_MODIFY_COUNT().equals(struct.getH_MODIFY_COUNT()) || !modifyStruct.getMODIFY_COUNT().equals(struct.getMODIFY_COUNT())) {
				setErrorMessage("ZZ01105");
				return;
			}
			
			
			// 変数宣言
			KR0070010Struct salesStruct = new KR0070010Struct();

			//  「売掛管理」サブシステムが未導入、または「売掛管理」サブシステムが導入 かつ [売掛金トランヘッダ]に存在する場合
			List installOptionsList = entity.mSYS_INSTALL_OPTIONS_B.read(conn, struct);
			List tarhList = entity.mT_AR_LEDGER_H_TRN_Jf.read(conn, struct);// [売掛金トランヘッダ]
			List tarlList = entity.mT_AR_LEDGER_H_Jf.read(conn, struct);// [売掛金元帳ヘッダ]
			

			//Ai連携ありかつ送信済の場合は[売上実績]赤黒明細を作成し、売掛I/Fを実行しない		
			if("1".equals(getInstallFlg()) && "1".equals(struct.getAI_AR_IF_FLG())){
				//売上実績ヘッダ][売上実績]に赤黒を更新する。
				// [売上実績ヘッダ][売上実績]を論理削除する。
				entity.mT_SALES_H_Delete.update(conn, struct);
				entity.mT_SALES_Delete.update(conn, struct);

				// [売上実績ヘッダ]の赤伝を登録する。
				List listSalesH = entity.mT_SALES_H_Delete.read(conn, struct);
				KR0070010Struct salesHStruct = (KR0070010Struct) listSalesH.get(0);
				// 売上実績伝票番号 自動採番” SHN” &
				// RACLE_SEQUENCE[SEQ_SALES_H_NO]（NEXTVAL）
				List salesSeqNoList = entity.mSEQ_SALES_H_NO.read(conn, struct);
				KR0070010Struct salesSeqNoStruct = (KR0070010Struct) salesSeqNoList.get(0);
				salesHStruct.setSALES_H_NO(salesSeqNoStruct.getSALES_H_NO());
				salesHStruct.setsSysdate(struct.getsSysdate());
				salesHStruct.setsUser_ID(sysUSER_CD);
				entity.mT_SALES_H_Delete.create(conn, salesHStruct);

				// [売上実績]の赤伝を登録する
				List listSales = entity.mT_SALES_Delete.read(conn, struct);
				KR0070010Struct structSales = (KR0070010Struct) listSales.get(0);
				// 売上実績管理番号
				List salesseqList = entity.mSEQ_SALES_SEQ_NO.read(conn, struct);
				KR0070010Struct salesseqStruct = (KR0070010Struct) salesseqList.get(0);
				structSales.setSALES_SEQ_NO(salesseqStruct.getSALES_SEQ_NO());
				structSales.setsSysdate(struct.getsSysdate());
				structSales.setsUser_ID(sysUSER_CD);
				// 承認状況
				structSales.setAPPR_FLG("3");
				// 承認者
				structSales.setAPPR_ID(getsysUSER_CD());
				// 承認日付
				structSales.setAPPR_DATE(getBusinessOprDate());
				// 保留理由
				structSales.setRESERVE_CAUSE(null);
				entity.mT_SALES_Delete.create(conn, structSales);

				// 入力された条件で[売上実績ヘッダ]の黒伝を登録する。
				KR0070010Struct createSalesHStruct = createSalesH();
				// 売上実績伝票番号(連番)
				salesSeqNoList = entity.mSEQ_SALES_H_NO.read(conn, struct);
				salesSeqNoStruct = (KR0070010Struct) salesSeqNoList.get(0);
				createSalesHStruct.setSALES_H_NO(salesSeqNoStruct.getSALES_H_NO());
				createSalesHStruct.setSHIP_DLV_H_NO(struct.getSLIP_CD());
				entity.mT_SALES_H.create(conn, createSalesHStruct);

				// [売上実績]黒伝を登録する
				// 売上実績管理番号” SSN” & RACLE_SEQUENCE[SEQ_SALES_SEQ_NO]（NEXTVAL）
				salesStruct = createSales();
				salesseqList = entity.mSEQ_SALES_SEQ_NO.read(conn, struct);
				salesseqStruct = (KR0070010Struct) salesseqList.get(0);
				salesStruct.setSALES_SEQ_NO(salesseqStruct.getSALES_SEQ_NO());
				// 売上実績伝票番号 [売上実績ヘッダ].”売上実績伝票番号”
				salesStruct.setSALES_H_NO(salesSeqNoStruct.getSALES_H_NO());
				// 出荷納品・その他売上伝票番号 [売上実績ヘッダ].”出荷納品・その他売上伝票番号”
				salesStruct.setSHIP_DLV_H_NO(struct.getSLIP_CD());
				entity.mT_SALES_Jf.create(conn, salesStruct);
			} else {
				// 「売掛管理」サブシステムが未導入の場合
				if (installOptionsList.isEmpty()) {
					// [売上実績ヘッダ]を更新する
					KR0070010Struct salesHStruct = createSalesH();
					salesHStruct.setSHIP_DLV_H_NO(struct.getSLIP_CD());
					if (salesHStruct != null) {
						entity.mT_SALES_H.update(conn, salesHStruct);
					}
					// [売上実績]を更新する
					salesStruct = createSales();
					salesStruct.setSHIP_DLV_H_NO(struct.getSLIP_CD());
					if (salesStruct != null) {
						entity.mT_SALES_Jf.update(conn, salesStruct);
					}
				} else if (!tarhList.isEmpty()) {
	
					// 「売掛管理」サブシステムが導入 かつ [売掛金トランヘッダ]に存在する場合
					// [売上実績ヘッダ]を更新する
					KR0070010Struct salesHStruct = createSalesH();
					salesHStruct.setSHIP_DLV_H_NO(struct.getSLIP_CD());
					if (salesHStruct != null) {
						entity.mT_SALES_H.update(conn, salesHStruct);
					}
					// [売上実績]を更新する
					salesStruct = createSales();
					salesStruct.setSHIP_DLV_H_NO(struct.getSLIP_CD());
					if (salesStruct != null) {
						entity.mT_SALES_Jf.update(conn, salesStruct);
					}
				} else if (!tarlList.isEmpty()) {
	
					// ③ 「売掛管理」サブシステムが導入 かつ
					// [売掛金元帳ヘッダ]に存在する場合、以下の条件で、[売上実績ヘッダ][売上実績]に赤黒を更新する。
					// [売上実績ヘッダ][売上実績]を論理削除する。
					entity.mT_SALES_H_Delete.update(conn, struct);
					entity.mT_SALES_Delete.update(conn, struct);
	
					// [売上実績ヘッダ]の赤伝を登録する。
					List listSalesH = entity.mT_SALES_H_Delete.read(conn, struct);
					KR0070010Struct salesHStruct = (KR0070010Struct) listSalesH.get(0);
					// 売上実績伝票番号 自動採番” SHN” &
					// RACLE_SEQUENCE[SEQ_SALES_H_NO]（NEXTVAL）
					List salesSeqNoList = entity.mSEQ_SALES_H_NO.read(conn, struct);
					KR0070010Struct salesSeqNoStruct = (KR0070010Struct) salesSeqNoList.get(0);
					salesHStruct.setSALES_H_NO(salesSeqNoStruct.getSALES_H_NO());
					entity.mT_SALES_H_Delete.create(conn, salesHStruct);
	
					// [売上実績]の赤伝を登録する
					List listSales = entity.mT_SALES_Delete.read(conn, struct);
					KR0070010Struct structSales = (KR0070010Struct) listSales.get(0);
					// 売上実績管理番号
					List salesseqList = entity.mSEQ_SALES_SEQ_NO.read(conn, struct);
					KR0070010Struct salesseqStruct = (KR0070010Struct) salesseqList.get(0);
					structSales.setSALES_SEQ_NO(salesseqStruct.getSALES_SEQ_NO());
					structSales.setsSysdate(struct.getsSysdate());
					structSales.setsUser_ID(sysUSER_CD);
					// 承認状況
					structSales.setAPPR_FLG("3");
					// 承認者
					structSales.setAPPR_ID(getsysUSER_CD());
					// 承認日付
					structSales.setAPPR_DATE(getBusinessOprDate());
					// 保留理由
					structSales.setRESERVE_CAUSE(null);
					entity.mT_SALES_Delete.create(conn, structSales);
	
					// 入力された条件で[売上実績ヘッダ]の黒伝を登録する。
					KR0070010Struct createSalesHStruct = createSalesH();
					// 売上実績伝票番号(連番)
					salesSeqNoList = entity.mSEQ_SALES_H_NO.read(conn, struct);
					salesSeqNoStruct = (KR0070010Struct) salesSeqNoList.get(0);
					createSalesHStruct.setSALES_H_NO(salesSeqNoStruct.getSALES_H_NO());
					createSalesHStruct.setSHIP_DLV_H_NO(struct.getSLIP_CD());
					entity.mT_SALES_H.create(conn, createSalesHStruct);
	
					// [売上実績]黒伝を登録する
					// 売上実績管理番号” SSN” & RACLE_SEQUENCE[SEQ_SALES_SEQ_NO]（NEXTVAL）
					salesStruct = createSales();
					salesseqList = entity.mSEQ_SALES_SEQ_NO.read(conn, struct);
					salesseqStruct = (KR0070010Struct) salesseqList.get(0);
					salesStruct.setSALES_SEQ_NO(salesseqStruct.getSALES_SEQ_NO());
					// 売上実績伝票番号 [売上実績ヘッダ].”売上実績伝票番号”
					salesStruct.setSALES_H_NO(salesSeqNoStruct.getSALES_H_NO());
					// 出荷納品・その他売上伝票番号 [売上実績ヘッダ].”出荷納品・その他売上伝票番号”
					salesStruct.setSHIP_DLV_H_NO(struct.getSLIP_CD());
					entity.mT_SALES_Jf.create(conn, salesStruct);
				}

				// ④ 「売掛管理」サブシステムがインストールされている場合、売掛管理Ｉ／Ｆ（部品） を 呼び出し、[売掛金トラン] を更新する。
				if (!installOptionsList.isEmpty()) {
					List resultList =null;		
					//売掛IF処理実行
					
					common = new Common(conn, sysUSER_CD, sp.getProcId(), getSalesPLANT_CD(), getsysCOMPANY_CD());
					
					//売掛IF処理実行
					resultList= common.excArfIFFd(3, 3, struct.getSLIP_CD(), struct.getTAX_CD());
					
					// 正常終了判定
					if (common.getResultStatus().intValue() != STATUS_NORMAL) {
						setErrorMessage(resultList.get(0).toString());
						return;
						
					}
				}		
			}		
			
			// 消費税コード変更
			updateTaxCd();
			if (msgStruct.hasError()) {
				conn.rollback();
				return;
			}
			
			conn.commit();

			// 画面再表示
			controlSelect();

		} catch (Exception e) {
			setExpjExceptionMsg(e);
		} finally {
			if (conn != null) {
				conn.rollback();
			}
		}
		return;
	}
	
	/**
	 * Explanner Jの削除
	 * @throws BusinessProcessException
	 * @throws FoundationException
	 */
	public void deleteOfJ() throws BusinessProcessException, FoundationException{
		try {
			/* トランザクション開始 */
			conn.beginTransWeb();
			
			// ｢伝票番号｣が、[売上実績]に存在しない場合
			List modifyList = entity.mT_SALES.read(conn, struct);
			if (modifyList.isEmpty()) {
				setErrorMessage("ZZ01105");
				return;
			}
			KR0070010Struct modifyStruct = (KR0070010Struct) modifyList.get(0);
			// [売上実績]."更新数" != ｢更新数｣(hidden使用)の場合
			if (!modifyStruct.getMODIFY_COUNT().equals(struct.getMODIFY_COUNT())) {
				setErrorMessage("ZZ01105");
				return;
			}
			
			//Add NEC 2014.06.18 STR
			//売掛導入していない場合、システムパラメータ売上実績承認チェック (EJのみ)
			if("J".equals(getExplannerFlag()) ) {
            	chkAprSales();
            	if (msgStruct.hasError()) {                	 
            	    return;
            	}
			}
			//Add NEC 2014.06.18 END
			
			List installOptionsList = entity.mSYS_INSTALL_OPTIONS_B.read(conn, struct);
			List arLedgerHTrnList = entity.mT_AR_LEDGER_H_TRN_CHECK.read(conn, struct);
			List arLedgerHList = entity.mT_AR_LEDGER_H_CHECK.read(conn, struct);
			
		
			if (installOptionsList.isEmpty()
					|| (!installOptionsList.isEmpty() && !arLedgerHTrnList.isEmpty())) {
				// 売掛管理がインストールされていない場合
				// または、売掛管理がインストールされているかつ、[売掛金トランヘッダ]."伝票種類" = 14 の場合
				
				// [売上伝票]（赤伝）登録用データを生成
				KR0070010Struct creditRecordStruct = createCreditRecord();
				// 売上実績管理番号(連番)
				List salesSeqNoList = entity.mSEQ_SALES_SEQ_NO.read(conn, struct);
				KR0070010Struct salesSeqNoStruct = (KR0070010Struct) salesSeqNoList.get(0);
				creditRecordStruct.setSALES_SEQ_NO(salesSeqNoStruct.getSALES_SEQ_NO());
				// 伝票番号は｢伝票番号｣を使用
				creditRecordStruct.setSLIP_CD(struct.getSLIP_CD());
				// 元伝票番号
				creditRecordStruct.setORG_SLIP_CD(struct.getSLIP_CD());
				// [売上伝票]（赤伝）を登録
				entity.mT_SALES.create(conn, creditRecordStruct);
				
				// [売上伝票]（黒伝）を論理削除
				entity.mT_SALES_Delete.update(conn, struct);
				
				// 非在庫受注の伝票番号変更
				updateSlipCd(null);
				
				//Ai連携ありまたは売掛管理がインストールされていない場合は売掛I/Fを実行しない	
				if (!"1".equals(getInstallFlg()) && 
						!installOptionsList.isEmpty()) {
					ArIf arIf = new ArIf(conn, "1");
					arIf.setParameter("8", struct.getsUser_ID(), struct.getSLIP_CD(),
							creditRecordStruct.getSLIP_CD(), null, struct.getTAX_CD());
					String msgNo = arIf.execute();
					if (!"0".equals(msgNo)) {
						setErrorMessage(msgNo);
						conn.rollback();
						return;
					}
				}
				// 画面をクリア
				initializeAll();
			} else if (!installOptionsList.isEmpty() && !arLedgerHList.isEmpty()) {
				// 売掛管理がインストールされているかつ、[売掛金元帳ヘッダ]."伝票種類" = 14 の場合
				
				// [売上伝票]（赤伝）登録用データを生成
				KR0070010Struct creditRecordStruct = createCreditRecord();
				// 売上実績管理番号(連番)
				List salesSeqNoList = entity.mSEQ_SALES_SEQ_NO.read(conn, struct);
				KR0070010Struct salesSeqNoStruct = (KR0070010Struct) salesSeqNoList.get(0);
				creditRecordStruct.setSALES_SEQ_NO(salesSeqNoStruct.getSALES_SEQ_NO());
				// 伝票番号を自動採番
				Common slipCdNum =
						new Common(conn, sysUSER_CD, sp.getProcId(), getSalesPLANT_CD(), getsysCOMPANY_CD());
				creditRecordStruct.setSLIP_CD(slipCdNum.getSLIP_CD());
				// 元伝票番号
				creditRecordStruct.setORG_SLIP_CD(struct.getSLIP_CD());
				// [売上伝票]（赤伝）を登録
				entity.mT_SALES.create(conn, creditRecordStruct);
				
				// [売上伝票]（黒伝）を論理削除
				entity.mT_SALES_Delete.update(conn, struct);
				
				// 非在庫受注の伝票番号変更
				updateSlipCd(null);
				
				//Ai連携ありの場合は売掛I/Fを実行しない	
				if (!"1".equals(getInstallFlg())) {
					ArIf arIf = new ArIf(conn, "2");
					arIf.setParameter("8", struct.getsUser_ID(), struct.getSLIP_CD(),
							creditRecordStruct.getSLIP_CD(), null, struct.getTAX_CD());
					String msgNo = arIf.execute();
					if (!"0".equals(msgNo)) {
						setErrorMessage(msgNo);
						conn.rollback();
						return;
					}
				}
				// 画面をクリア
				initializeAll();
			}
			conn.commit();
		} catch (Exception e) {
			setExpjExceptionMsg(e);
		} finally {
			if (conn != null) {
				conn.rollback();
			}
		}
	}
	
	
	/**
	 * 削除ボタン押下時に実行される処理です。
	 *
	 */
	/**
	 * Explanner Ja、Explanner JaScmの削除
	 * @throws BusinessProcessException
	 * @throws FoundationException
	 */
	public void deleteOfJa() throws BusinessProcessException, FoundationException {
		try {
			/* トランザクション開始 */
			conn.beginTransWeb();
			// 売掛管理がインストールされているかのフラグ
			// true インストールされている
			// false インストールされていない
			boolean isUrikakeInstFlg = false;
			
			//伝票番号が計上済みかのフラグ
			//計上済み = true 
			//未計上 = false
			boolean checkSlip = false;
			
			//伝票番号を取得するかの区分
			//売掛管理がインストールされていない場合 = 1
			//仮売実績にのみ伝票番号が存在する場合 = 2
			//売掛トランヘッダに伝票番号が存在する場合 = 3
			//売掛元帳ヘッダに伝票番号が存在する場合 = 4
			int pros = 0;
			
			//共通部品クラス
			common = new Common(conn, sysUSER_CD, sp.getProcId(), getSalesPLANT_CD(), getsysCOMPANY_CD());
			
			// 売掛管理がインストールされているかのチェック
			List instOptList = entity.mSYS_INSTALL_OPTIONS_B.read(conn, struct);
			if (instOptList.isEmpty()) {
				// 売掛管理がインストールされていない。
				isUrikakeInstFlg = false;
			} else {
				// 売掛管理がインストールされている。
				isUrikakeInstFlg = true;
			}
						
			// ｢伝票番号｣が、[仮売上実績]に存在しない場合
			List modifyList = entity.mT_SALES_TEMP.read(conn, struct);
			if (modifyList.isEmpty()) {
				setErrorMessage("ZZ01105");
				return;
			}
			
			// [仮売上実績]."更新数" != ｢更新数｣(hidden使用)の場合
			if (!(((KR0070010Struct) modifyList.get(0)).getMODIFY_COUNT()).equals(struct.getMODIFY_COUNT())) {
				setErrorMessage("ZZ01105");
				return;
			}
			
			//共通部品で売上計上済みか判定する
			checkSlip = common.excSalesCheck(struct.getSLIP_CD());
			
			if(checkSlip) {
				struct.setSALES_IF_FLG("1");
			} else {
				struct.setSALES_IF_FLG("0");
			}
			
			// [仮売上実績]レコードにの削除フラグを立てる前に
			// [仮売上実績]（赤伝）登録用データを生成
			KR0070010Struct akaRecordStruct = createAkaRecord();
			
			//[仮売上実績]のレコードを論理削除する
			entity.mT_SALES_TEMP_Delete.update(conn, struct);
			
			// 非在庫受注の伝票番号変更
			updateSlipCd(null);

			List arLedgerHTrnList = null;
			List arLedgerHList = null;
			
			if (isUrikakeInstFlg ) {
				// 売掛管理がインストールされている場合
				arLedgerHTrnList = entity.mT_AR_LEDGER_H_TRN_CHECK.read(conn, struct);
				if (!arLedgerHTrnList.isEmpty()) {
					// [売掛金トランヘッダ]に伝票番号が存在する場合
					pros = 3;
				} else {
					arLedgerHList = entity.mT_AR_LEDGER_H_CHECK.read(conn, struct);
					if (!arLedgerHList.isEmpty()) {
						// [売掛金元帳ヘッダ]に伝票番号が存在する場合
						pros = 4;
					} else {
						// [売掛金トランヘッダ]にも[売掛金トランヘッダ]にも伝票番号が存在しない
						pros = 2;
					}
				}
			} else {
				// 売掛管理がインストールされていない場合
				pros = 1;
			}
			
			// 売上実績管理番号(連番)
			List salesSeqNoList = entity.mSEQ_SALES_SEQ_NO.read(conn, struct);
			akaRecordStruct.setSALES_SEQ_NO(((KR0070010Struct) salesSeqNoList.get(0)).getSALES_SEQ_NO());
			
			//伝票番号を取得
			if (pros == 1 || pros == 2 || pros == 3) {
				akaRecordStruct.setSLIP_CD(struct.getSLIP_CD());
			} else {
				// 赤伝票番号を自動採番
				if ("Ja".equals(getExplannerFlag())) {
					akaRecordStruct.setSLIP_CD(common.getSLIP_CD());
				} else {
					akaRecordStruct.setSLIP_CD(common.getSCM_SLIP_CD());
				}
			}
			
			// 元伝票番号
			akaRecordStruct.setORG_SLIP_CD(struct.getSLIP_CD());
			
			if(checkSlip) {
				akaRecordStruct.setSALES_IF_FLG("1");
			} else {
				akaRecordStruct.setSALES_IF_FLG("0");
			}
			
			// [仮売上実績]（赤伝）を登録
			if ("Ja".equals(getExplannerFlag())) {
				entity.mAKA_T_SALES_TEMP_Ja.create(conn, akaRecordStruct);
			} else {
				entity.mT_SALES_TEMP.create(conn, akaRecordStruct);
			}
			
			// 売上計上済みの場合、[売上実績]に登録する
			if(checkSlip){
				if ("Ja".equals(getExplannerFlag())) {
					common.excSalesConf(struct.getSLIP_CD(), common.EXCSALESCONF);
				} else {
					common.excSalesConf(struct.getSLIP_CD(), common.EXCSALESCONFSCM);
				}
			}
			//------------------------------------------------------------------------------------------------------
			// 売掛管理Ⅰ／Ｆ(自部品用)の呼出
			if(isUrikakeInstFlg && checkSlip){
				ArIf arIfmp = new ArIf(conn, "2");
				arIfmp.setParameter("8", struct.getsUser_ID(), struct.getSLIP_CD(), akaRecordStruct.getSLIP_CD(), null, struct.getTAX_CD());
				String msgNo = arIfmp.execute();
				if (!"0".equals(msgNo)) {
					setErrorMessage(msgNo);
					conn.rollback();
					return;
				}
			}
			// 画面をクリア
			initializeAll();
			conn.commit();
		} catch (Exception e) {
			setExpjExceptionMsg(e);
		} finally {
			if (conn != null) {
				conn.rollback();
			}
		}
	}
	
	/**
	 * Explanner Jfの削除
	 * @throws BusinessProcessException
	 * @throws FoundationException
	 */
	public void deleteOfJf() throws BusinessProcessException, FoundationException{
		try {
			/* トランザクション開始 */
			conn.beginTransWeb();
			
			List modifyList = entity.mT_SALES_MODIFY_Jf.read(conn, struct);
			if (modifyList.isEmpty()) {
				setErrorMessage("ZZ01105");
				return;
			}
			KR0070010Struct modifyStruct = (KR0070010Struct) modifyList.get(0);
			if (!modifyStruct.getH_MODIFY_COUNT().equals(struct.getH_MODIFY_COUNT()) || !modifyStruct.getMODIFY_COUNT().equals(struct.getMODIFY_COUNT())) {
				setErrorMessage("ZZ01105");
				return;
			}
			

			// ① [売上実績]を更新する。
			entity.mT_SALES_Delete.update(conn, struct);
			entity.mT_SALES_H_Delete.update(conn, struct);
			
			// 非在庫受注の伝票番号変更
			updateSlipCd(null);

			// ② [売上実績ヘッダ]の赤伝を登録する。
			List listSalesH = entity.mT_SALES_H_Delete.read(conn, struct);
			if (!listSalesH.isEmpty()) {
				KR0070010Struct structSalesH = (KR0070010Struct) listSalesH.get(0);
				// 売上実績伝票番号 自動採番” SHN” & ORACLE_SEQUENCE[SEQ_SALES_H_NO]（NEXTVAL）
				List salesSeqNoList = entity.mSEQ_SALES_H_NO.read(conn, struct);
				KR0070010Struct salesSeqNoStruct = (KR0070010Struct) salesSeqNoList.get(0);
				structSalesH.setSALES_H_NO(salesSeqNoStruct.getSALES_H_NO());
				structSalesH.setsSysdate(struct.getsSysdate());
				structSalesH.setsUser_ID(sysUSER_CD);
				entity.mT_SALES_H_Delete.create(conn, structSalesH);

				// ③ [売上実績]の赤伝を登録する
				List listSales = entity.mT_SALES_Delete.read(conn, struct);
				if (!listSales.isEmpty()) {
					KR0070010Struct structSales = (KR0070010Struct) listSales.get(0);
					// 売上実績管理番号
					List salesseqList = entity.mSEQ_SALES_SEQ_NO.read(conn,struct);
					KR0070010Struct salesseqStruct = (KR0070010Struct) salesseqList.get(0);
					structSales.setSALES_SEQ_NO(salesseqStruct.getSALES_SEQ_NO());
					// 売上実績伝票番号
					structSales.setSALES_H_NO(structSalesH.getSALES_H_NO());
					structSales.setsSysdate(struct.getsSysdate());
					structSales.setsUser_ID(sysUSER_CD);
					// 承認状況
					structSales.setAPPR_FLG("3");
					// 承認者
					structSales.setAPPR_ID(getsysUSER_CD());
					// 承認日付
					structSales.setAPPR_DATE(getBusinessOprDate());
					// 保留理由
					structSales.setRESERVE_CAUSE(null);
					entity.mT_SALES_Delete.create(conn, structSales);
				}
			}

			//Ai連携ありの場合は売掛I/Fを実行しない	
			if (!"1".equals(getInstallFlg())) {		
				// ④ 「売掛管理」サブシステムがインストールされている場合、売掛管理Ｉ／Ｆ（部品） を 呼び出し、[売掛金トラン] 又は
				// [売掛金元帳] を更新する。
				List installOptionsList = entity.mSYS_INSTALL_OPTIONS_B.read(conn, struct);
				if (!installOptionsList.isEmpty()) {
					List resultList =null;
					//売掛IF処理実行
					Common arfIFFd = new Common(conn, sysUSER_CD, sp.getProcId(), getSalesPLANT_CD(), getsysCOMPANY_CD());
					
					//売掛IF処理実行
					resultList= arfIFFd.excArfIFFd(3, 2, struct.getSLIP_CD(), struct.getTAX_CD());
					// 正常終了判定
					if (arfIFFd.getResultStatus().intValue() != STATUS_NORMAL) {
						setErrorMessage(resultList.get(0).toString());
						return ;
					}
				}			
			}
			conn.commit();
			initializeAll();
		} catch (Exception e) {
			setExpjExceptionMsg(e);
		} finally {
			if (conn != null) {
				conn.rollback();
			}
		}
	}
	
	/**
	 * 非在庫受注の消費税コード変更
	 * @throws FoundationException
	 * @throws SQLException
	 */
	private void updateTaxCd() throws FoundationException, SQLException {
		if (!struct.getTAX_CD().equals(struct.geth_TAX_CD())) {
			List modifyList = entity.mT_ODR_UNSTOCK.read(conn, struct);
			if (modifyList.isEmpty()) {
				setErrorMessage("ZZ01105");
				return;
			}
			KR0070010Struct modifyStruct = (KR0070010Struct) modifyList.get(0);
			if (!modifyStruct.getMODIFY_COUNT().equals(struct.getODR_MODIFY_COUNT())) {
				setErrorMessage("ZZ01105");
				return;
			}
			// 作成者
			struct.setsUser_ID(sysUSER_CD);
			entity.mT_ODR_UNSTOCK.update(conn, struct);
		}
	}
	
	/**
	 * 非在庫受注の伝票番号変更
	 * @throws FoundationException
	 * @throws SQLException
	 */
	private void updateSlipCd(String slipCd) throws FoundationException, SQLException {
			List modifyList = entity.mT_ODR_UNSTOCK.read(conn, struct);
			if (modifyList.isEmpty()) {
				setErrorMessage("ZZ01105");
				return;
			}
			KR0070010Struct modifyStruct = (KR0070010Struct) modifyList.get(0);
			if (!modifyStruct.getMODIFY_COUNT().equals(struct.getODR_MODIFY_COUNT())) {
				setErrorMessage("ZZ01105");
				return;
			}
			KR0070010Struct updateStruct = new KR0070010Struct();
			// 作成者
			updateStruct.setsUser_ID(sysUSER_CD);
			// 作成日
			updateStruct.setsSysdate(struct.getsSysdate());
			updateStruct.setSLIP_CD(slipCd);
			updateStruct.setODR_NO(struct.getODR_NO());
			
			entity.mT_ODR_UNSTOCK_UPDATE_SLIP.update(conn, updateStruct);
			
			modifyList = entity.mT_ODR_UNSTOCK.read(conn, struct);
			if (modifyList.isEmpty()) {
				setErrorMessage("ZZ01105");
				return;
			}
			modifyStruct = (KR0070010Struct) modifyList.get(0);
			struct.setODR_MODIFY_COUNT(modifyStruct.getMODIFY_COUNT());
	}
	
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * 読込ボタン押下時に実行される処理です。
	 *
	 */
	public void controlSelect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KR0070");
		logger.entering("KR0070010Control"+":USER="+struct.getsUser_ID(),"controlSelect");
			//{{user_implement_dev:<controlSelect>
		try {
			// 受注番号のチェック
			List tempList = entity.mT_ODR_UNSTOCK.read(conn, struct);
			if (tempList.isEmpty()) {
				// "受注番号"が[非在庫受注]."受注番号"に存在しない場合
				setErrorMessage("KR00034");
				setReadStatus(NOT_FOUND);
				return;
			}
			//Add NEC Start 20140618
			if ("J".equals(getExplannerFlag())) {
				List pjOdrAlcList = entity.mselectT_PJ_ODR_ALC.read(conn, struct);
				if(!pjOdrAlcList.isEmpty()){	
					setErrorMessage("KQ00353");
					return;
				}
			}
			//Add NEC End   20140618
			List resultList = new ArrayList();
			// 会社コード
			struct.setCOMPANY_CD(getsysCOMPANY_CD());
			
			if ("true".equals(struct.getrdoInsert())) {
				// 登録選択場合
				resultList = entity.mselectOfInsert.read(conn, struct);
				
				if (!resultList.isEmpty()) {
					KR0070010Struct slipCdStruct = (KR0070010Struct) resultList.get(0);
					// 非在庫受注の伝票番号が存在場合
					if (slipCdStruct.getSLIP_CD() != null && !"".equals(slipCdStruct.getSLIP_CD())) {
						List checkList = new ArrayList();
						if ("J".equals(getExplannerFlag())) {
							checkList = entity.mT_SALES.read(conn, slipCdStruct);
						} else if ("Ja".equals(getExplannerFlag()) || "JaScm".equals(getExplannerFlag())) {
							slipCdStruct.setCOMPANY_CD(getsysCOMPANY_CD());
							checkList = entity.mT_SALES_TEMP.read(conn, slipCdStruct);
						} else if ("Jf".equals(getExplannerFlag())) {
							checkList = entity.mcheckSHIP_DLV_H_NO.read(conn, slipCdStruct);
						}
						if (!checkList.isEmpty()) {
							// 売上実績が既に存在するので登録できません。
							setErrorMessage("KQ00350");
							setReadStatus(NOT_FOUND);
							return;
						}
						
					}
				}
			} else {
				// 更新・削除選択場合
				if ("J".equals(getExplannerFlag())) {
					resultList = entity.mselectOfUpdateDeleteJ.read(conn, struct);
				} else if ("Ja".equals(getExplannerFlag()) || "JaScm".equals(getExplannerFlag())) {
					resultList = entity.mselectOfUpdateDeleteJa.read(conn, struct);
				} else if ("Jf".equals(getExplannerFlag())) {
					resultList = entity.mselectOfUpdateDeleteJf.read(conn, struct);
				}
			}
			
			if (resultList.isEmpty()) {
				setErrorMessage("ZZ06001");
				setReadStatus(NOT_FOUND);
				return;
			}
			
			KR0070010Struct tempStruct = (KR0070010Struct) resultList.get(0);
			
			// 増額受注の場合
			if ("1".equals(tempStruct.geth_ADD_ODR_FLG())) {
				if ("J".equals(getExplannerFlag())) {
					tempList = entity.mCHECK_ODR.read(conn, tempStruct);
				} else if ("Jf".equals(getExplannerFlag())) {
					tempList = entity.mCHECK_ODR_Jf.read(conn, tempStruct);
				} else {
					tempList = entity.mCHECK_ODR_Ja.read(conn, tempStruct);
				}
				if (tempList.isEmpty()) {
					setErrorMessage("KR00035");
					return;
				}
			}
			
			tempList = entity.mSYS_INSTALL_OPTIONS_B.read(conn, struct);
			if (tempList.isEmpty()) {
				if ("Ja".equals(getExplannerFlag()) || "JaScm".equals(getExplannerFlag())) {
					List checkList = new ArrayList();
					if ("Ja".equals(getExplannerFlag())) {
						checkList = entity.mT_SALES_Ja.read(conn, struct);
					} else {
						checkList = entity.mT_SALES_JaScm.read(conn, struct);
					}
					if (!checkList.isEmpty()) {
						tempStruct.setSTATUS(((KR0070010Struct)checkList.get(0)).getSTATUS());
					}
				}
				if (tempStruct.getSTATUS()!= null && !"".equals(tempStruct.getSTATUS())) {
					if (tempStruct.getSTATUS().compareTo("40") >= 0) {
						setErrorMessage("BD00027");
						setReadStatus(ERROR);
						return;
					}
				}
			}
			
			if ("true".equals(struct.getrdoUpdateDelete())) {
				checkT_AR_LEDGER_H();
				// エラーがあった場合は処理を中断
				if (msgStruct.hasError()) {
					setReadStatus(ERROR);
					return;
				}
			}

			// 画面表示
			setShowValue(struct, tempStruct);
			setReadStatus(NORMAL);
			
		} catch (Exception e) {
			setExpjExceptionMsg(e);
		}
                //}}user_implement_dev:<controlSelect>
		logger.exiting("KR0070010Control"+":USER="+struct.getsUser_ID(),"controlSelect");

		return;
	}

	/**
	 * 再計算ボタン押下時に実行される処理です。
	 *
	 */
	public void controlRecalc() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KR0070");
		logger.entering("KR0070010Control"+":USER="+struct.getsUser_ID(),"controlRecalc");
			//{{user_implement_dev:<controlRecalc>
		// 会社コード
		struct.setCOMPANY_CD(getsysCOMPANY_CD());
		try {
			// 売上計上部門名
			struct.setORG_NAME(null);
			
			// 売上計上部門コード
			List checkList = entity.mM_ORG.read(conn, struct);
			if (checkList.isEmpty()) {
				setErrorMessage("KA00058");
				return;
			} else {
				// 売上計上部門名
				struct.setORG_NAME(((KR0070010Struct)checkList.get(0)).getORG_NAME());
			}
			// 営業担当者名
			struct.setUSER_NAME(null);
			// 営業担当者コード
			if (struct.getCUST_CHRG_PSN_CD() != null && !"".equals(struct.getCUST_CHRG_PSN_CD())) {
				if ("JaScm".equals(getExplannerFlag())){
					checkList = entity.mUSER_MST_SCM.read(conn, struct);
				} else {
					checkList = entity.mUSER_MST.read(conn, struct);
				}
				if (checkList.isEmpty()) {
					setErrorMessage("KQ20006");
					return;
				} else {
					// 営業担当者名
					struct.setUSER_NAME(((KR0070010Struct)checkList.get(0)).getUSER_NAME());
				}
			}
			
			// 品目
			if (struct.getITEM_CD() != null && !"".equals(struct.getITEM_CD()) ) {
				checkList = entity.mM_ITEM.read(conn, struct);
				if (!checkList.isEmpty()) {
					KR0070010Struct itemStruct = (KR0070010Struct) checkList.get(0);
					// 品目名
					if (struct.getITEM_NAME() == null || "".equals(struct.getITEM_NAME())) {
						struct.setITEM_NAME(itemStruct.getITEM_NAME());
					}
					// 計量単位
					struct.setSTOCK_UNIT(itemStruct.getSTOCK_UNIT());
					// 在庫数単位区分
					struct.setUNIT_QTY_TYP(itemStruct.getUNIT_QTY_TYP());
				} else {
					// 品目名
					if (struct.getITEM_NAME() == null || "".equals(struct.getITEM_NAME())) {
						struct.setITEM_NAME(getItemName());
					}
					// 計量単位
					struct.setSTOCK_UNIT(null);
					// 在庫数単位区分
					struct.setUNIT_QTY_TYP(null);
				}
			} else {
				// 品目名
				if (struct.getITEM_NAME() == null || "".equals(struct.getITEM_NAME())) {
					struct.setITEM_NAME(getItemName());
				}
				// 計量単位
				struct.setSTOCK_UNIT(null);
				// 在庫数単位区分
				struct.setUNIT_QTY_TYP(null);
			}
			
			// 得意先コード
			List custList = entity.mM_CUST.read(conn, struct);
			if (!custList.isEmpty()) {
				KR0070010Struct custStruct = (KR0070010Struct) custList.get(0);
				// 得意先名
				struct.setCUST_NAME(custStruct.getCUST_NAME());
				// 通貨コード
				struct.seth_CUR_CD(custStruct.geth_CUR_CD());
				// 為替種別
				struct.setEXCH_TYP(custStruct.getEXCH_TYP());
				// 検収区分
				struct.setINSPC_ACPT_TYP(custStruct.getINSPC_ACPT_TYP());
				// 明細計算まるめ区分
				struct.setDETAIL_ROUND_TYP(custStruct.getDETAIL_ROUND_TYP());
			} else {
				setErrorMessage("KA00032");
				return;
			}
			
			// 通貨コード
			checkList = entity.mM_CUR.read(conn, struct);
			if (checkList.isEmpty()) {
				setErrorMessage("KQ00073");
				return;
			} else {
				KR0070010Struct curStruct = (KR0070010Struct)checkList.get(0);
				struct.setCUR_UNIT_PRICE(curStruct.getCUR_UNIT());
				struct.setCUR_UNIT_AMOUNT(curStruct.getCUR_UNIT());
				// 通貨少数桁数
				decimalFig = Integer.parseInt(curStruct.getDECIMAL_FIG());
				struct.setDECIMAL_FIG(curStruct.getDECIMAL_FIG());
				if (NumberTool.getRealScale(struct.getSALES_AMOUNT())
							> decimalFig) {
						setErrorMessage("KU01003");
						return;
					}				
			}
			
			// 消費税コード
			checkList = entity.mM_TAX.read(conn, struct);
			if (checkList.isEmpty()) {
				setErrorMessage("AA01001");
				return;
			} else {
				KR0070010Struct taxStruct = (KR0070010Struct) checkList.get(0);
				// 旧税率1
				struct.setTAX_RATE_1(taxStruct.getTAX_RATE_1());
				// 旧税率2
				struct.setTAX_RATE_2(taxStruct.getTAX_RATE_2());
				// 旧税率3
				struct.setTAX_RATE_3(taxStruct.getTAX_RATE_3());
				// 端数区分
				struct.setTAX_ROUND_TYP(taxStruct.getTAX_ROUND_TYP());
			}
			
			// 整数管理チェック
			if ("1".equals(struct.getUNIT_QTY_TYP())) {
				// 整数管理
				if (struct.getSALES_QTY().indexOf(".") >= 0) {
					// 小数入力の場合：切上げ
					String tempString = struct.getSALES_QTY();
					double tempDouble1 = Double.parseDouble(tempString);
					struct.setSALES_QTY(Calculate.ceil(struct.getSALES_QTY(), 0));
					double tempDouble2 = Double.parseDouble(struct.getSALES_QTY());
					if (tempDouble1 != tempDouble2) {
						// ".0"入力除外
						setWarningMessage("KQ20004");
					}
				}
			}
			
			// 数量or単価が入力されていた場合は金額を計算
			if (Calculate.compare(struct.getSALES_QTY(), "0") > 0
					|| Calculate.compare(struct.getSALES_UNIT_PRICE(), "0") > 0) {
				String work =
						Calculate.multiply(struct.getSALES_QTY(), struct.getSALES_UNIT_PRICE());
				work = roundAmount(work, struct);
				struct.setSALES_AMOUNT(work);
				// 計算結果がDBの精度を超えていた場合はエラー
				if (Calculate.compare(work, "99999999999999.9999") > 0) {
					setErrorMessage("KR20024");
					return;
				}
			}
			
			setReadStatus(NORMAL);
		
		} catch (Exception e) {
			setExpjExceptionMsg(e);
		}
                //}}user_implement_dev:<controlRecalc>
		logger.exiting("KR0070010Control"+":USER="+struct.getsUser_ID(),"controlRecalc");

		return;
	}

	/**
	 * 登録ボタン押下時に実行される処理です。
	 *
	 */
	public void controlInsert() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KR0070");
		logger.entering("KR0070010Control"+":USER="+struct.getsUser_ID(),"controlInsert");
			//{{user_implement_dev:<controlInsert>
		// 再計算ロジックを呼び出して、エラーチェック及びデータセットを行う。
		controlRecalc();
		// エラーがあった場合は処理を中断
		if (msgStruct.hasError()) {
			return;
		}
		if ("J".equals(getExplannerFlag())) {
			// Explanner J場合
			insertOfJ();
		} else if ("Ja".equals(getExplannerFlag()) || "JaScm".equals(getExplannerFlag())) {
			// Explanner Ja、Explanner JaScm 場合
			insertOfJa();
		} else {
			// Explanner Jf 場合
			insertOfJf();
		}
		
                //}}user_implement_dev:<controlInsert>
		logger.exiting("KR0070010Control"+":USER="+struct.getsUser_ID(),"controlInsert");

		return;
	}

	/**
	 * 更新ボタン押下時に実行される処理です。
	 *
	 */
	public void controlUpdate() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KR0070");
		logger.entering("KR0070010Control"+":USER="+struct.getsUser_ID(),"controlUpdate");
			//{{user_implement_dev:<controlUpdate>
			
		// 再計算ロジックを呼び出して、エラーチェック及びデータセットを行う。
		controlRecalc();
		// エラーがあった場合は処理を中断
		if (msgStruct.hasError()) {
			return;
		}
		
		checkT_AR_LEDGER_H();
		// エラーがあった場合は処理を中断
		if (msgStruct.hasError()) {
			return;
		}

		if ("J".equals(getExplannerFlag())) {
			// Explanner J場合
			updateOfJ();
		} else if ("Ja".equals(getExplannerFlag()) || "JaScm".equals(getExplannerFlag())) {
			// Explanner Ja、Explanner JaScm 場合
			updateOfJa();
		} else {
			// Explanner Jf 場合
			updateOfJf();
		}
                //}}user_implement_dev:<controlUpdate>
		logger.exiting("KR0070010Control"+":USER="+struct.getsUser_ID(),"controlUpdate");

		return;
	}

	/**
	 * 削除ボタン押下時に実行される処理です。
	 *
	 */
	public void controlDelete() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KR0070");
		logger.entering("KR0070010Control"+":USER="+struct.getsUser_ID(),"controlDelete");
			//{{user_implement_dev:<controlDelete>
		checkT_AR_LEDGER_H();
		// エラーがあった場合は処理を中断
		if (msgStruct.hasError()) {
			return;
		}
		if ("J".equals(getExplannerFlag())) {
			// Explanner J場合
			deleteOfJ();
		} else if ("Ja".equals(getExplannerFlag()) || "JaScm".equals(getExplannerFlag())) {
			// Explanner Ja、Explanner JaScm 場合
			deleteOfJa();
		} else {
			// Explanner Jf 場合
			deleteOfJf();
		}
                //}}user_implement_dev:<controlDelete>
		logger.exiting("KR0070010Control"+":USER="+struct.getsUser_ID(),"controlDelete");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KR0070");
		logger.entering("KR0070010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
		controlRELOAD();
                //}}user_implement_dev:<controlClear>
		logger.exiting("KR0070010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * 閉じるボタン押下時に実行される処理です。
	 *
	 */
	public void controlClose() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KR0070");
		logger.entering("KR0070010Control"+":USER="+struct.getsUser_ID(),"controlClose");
			//{{user_implement_dev:<controlClose>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlClose>
		logger.exiting("KR0070010Control"+":USER="+struct.getsUser_ID(),"controlClose");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KR0070");
		logger.entering("KR0070010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("KR0070010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KR0070");
		logger.entering("KR0070010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
		try {
			//画面クリア
			initializeAll();
			
			// 多言語項目取得対応
			String locale = CoreTools.getLocale(sysUSER_CD);
			String property = "OrteusUserDic";
			ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
			
			
			// 実行環境確認
			// Explanner/J
			setExplannerFlag("J");
			// 元受注番号
			struct.setlbORGN_ODR_NO(CoreTools.getRBString("Expj.ORGN_ODR_NO", resource));
			
			KR0070010Struct tempStruct = new KR0070010Struct();
			// システムオプション識別子
			tempStruct.setOPTION_ID("SCM*");
			// システム導入フラグ
			tempStruct.setINSTALL_FLG("1");
			
			List tempList = entity.mSYS_INSTALL_OPTIONS.read(conn, tempStruct);
			if (!tempList.isEmpty()) {
				setExplannerFlag("JaScm");
				// 元受注管理番号
				struct.setlbORGN_ODR_NO(CoreTools.getRBString("Expj.ORGN_ODR_NO_1", resource));
			} else {
				// システムオプション識別子
				tempStruct.setOPTION_ID("JF*");
				tempList = entity.mSYS_INSTALL_OPTIONS.read(conn, tempStruct);
				if (!tempList.isEmpty()) {
					setExplannerFlag("Jf");
					// 元受注伝票番号
					struct.setlbORGN_ODR_NO(CoreTools.getRBString("Expj.ORGN_ODR_NO_2", resource));
				} else {
					// システムオプション識別子
					tempStruct.setOPTION_ID("JA*");
					tempList = entity.mSYS_INSTALL_OPTIONS.read(conn, tempStruct);
					if (!tempList.isEmpty()) {
						setExplannerFlag("Ja");
						// 元受注管理番号
						struct.setlbORGN_ODR_NO(CoreTools.getRBString("Expj.ORGN_ODR_NO_1", resource));
					}
				}
			}
			
			// 元受注番号の表示名
			setlbORGN_ODR_NO(struct.getlbORGN_ODR_NO());
			
			// Explanner/Jfの場合
			if ("Jf".equals(getExplannerFlag())) {
				Common cm = new Common(conn, sysUSER_CD, sp.getProcId(), sysPLANT_CD, getsysCOMPANY_CD());
				tempList = cm.InitSalesProcFd();
				
				// 「販売管理用初期処理」結果ステータスの判定
				if(cm.getResultStatus().intValue() == STATUS_ERROR) {
					// 結果ステータスが異常の場合は、エラーメッセージを表示して処理終了
					setErrorMessage(tempList.get(8).toString());
					throw new ExpjException(tempList.get(8).toString());
				} else if(cm.getResultStatus().intValue() == STATUS_WARNING) {
					// 結果ステータスが警告の場合は、エラーメッセージを表示して処理継続
					setWarningMessage(tempList.get(8).toString());
				}

				/* 「販売管理用初期処理」で取得した値を画面に反映 */
				
				// 会社コード
				setsysCOMPANY_CD(tempList.get(1).toString());
				
				// 日付計算用工場コード設定
				setSalesPLANT_CD(tempList.get(2).toString());
				
				// 業務運用日		
				setBusinessOprDate(tempList.get(6).toString());
				
				// 邦貨コード設定
				setHomeCurCd(tempList.get(7).toString());
			} else {
				// Explanner/JaScmの場合
				if ("JaScm".equals(getExplannerFlag())) {
					// ログインユーザの所属会社コード
					Common cm = new Common(conn, sysUSER_CD, sp.getProcId(), sysPLANT_CD, getsysCOMPANY_CD());
					setsysCOMPANY_CD(cm.getScmCompanyCd(sysPLANT_CD));
					if (getsysCOMPANY_CD() == null || "".equals(getsysCOMPANY_CD())) {
						setErrorMessage("BZ00179");
						throw new ExpjException("BZ00179");
					}
				} else {
					// 自社コード
					List companyList = entity.mSYS_MY_COMPANY.read(conn, struct);
					if (!companyList.isEmpty()) {
						setsysCOMPANY_CD(((KR0070010Struct)companyList.get(0)).getCOMPANY_CD());
					} else {
						setErrorMessage("KA00060");
						throw new ExpjException("KA00060");
					}
				}
				
				// システム分類
				tempStruct.setSYS_CLASS("MP_SALES");
				if ("J".equals(getExplannerFlag())) {
					tempStruct.setSYS_CLASS("SALES");
				}
				// 販売用工場コード取得
				tempList = entity.mSYS_CLASS_CODE.read(conn, tempStruct);
				if (!tempList.isEmpty()) {
					setSalesPLANT_CD( ((KR0070010Struct)tempList.get(0)).getPLANT_CD());
				} else {
					setErrorMessage("KA20037");
					throw new ExpjException("KA20037");
				}
				
				// 業務運用日取得
				struct.setPLANT_CD(getSalesPLANT_CD());
				tempList = entity.mSYS_DATE_CTRL.read(conn, struct);
				if (!tempList.isEmpty()) {
					setBusinessOprDate(((KR0070010Struct)tempList.get(0)).getBUSINESS_OPR_DATE());
				} else {
					setErrorMessage("KA20038");
					throw new ExpjException("KA20038");
				}	
			}
			
			// 会社コード
			struct.setCOMPANY_CD(getsysCOMPANY_CD());
			// 販売用工場コード
			struct.setPLANT_CD(getSalesPLANT_CD());
			// 業務運用日
			struct.setBUSINESS_OPR_DATE(getBusinessOprDate());

			//  インストールオプションの取得
			tempList = entity.mSYS_INSTALL_OPTIONS_AI.read(conn, struct);
			if (tempList.isEmpty()) {
				setInstallFlg(null);
			} else {
				setInstallFlg(((KR0070010Struct) tempList.get(0)).getINSTALL_FLG());
			}
			
			// 品目名の既定値取得
			tempStruct.setNAME("UNSTOCK_ITEM_NAME");
			tempList = entity.mSYS_PARAMETER.read(conn, tempStruct);
			if (!tempList.isEmpty()) {
				setItemName(((KR0070010Struct)tempList.get(0)).getVALUE());
				if (getItemName() == null || "".equals(getItemName())) {
					setErrorMessage("KQ00340");
					throw new ExpjException("KQ00340");
				}
			} else {
				setErrorMessage("KQ00340");
				throw new ExpjException("KQ00340");
			}
			
		} catch (SQLException e) {
			setExpjExceptionMsg(e);
		}
		
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("KR0070010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * イベントハンドラの前処理です。
	 *
	 * @param buttun ボタン名
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KR0070");
		logger.entering("KR0070010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
		logger.exiting("KR0070010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("Recalc") ) {
				controlRecalc();
			} else if( button.equals("Insert") ) {
				controlInsert();
			} else if( button.equals("Update") ) {
				controlUpdate();
			} else if( button.equals("Delete") ) {
				controlDelete();
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
			// 元受注番号の表示名
			struct.setlbORGN_ODR_NO(getlbORGN_ODR_NO());
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
//			throw new FoundationException("KR0070010Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KR0070010-E999","CSVの出力処理"));
			throw new FoundationException("KR0070010Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KR0070010-E999","システム日付の取得処理"));
				throw new FoundationException("KR0070010Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KR0070010-E999","コントロールのイベント処理"));
			throw new FoundationException("KR0070010Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected KR0070010Entity entity;
	protected KR0070010Struct struct;
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

		entity = new KR0070010Entity();
		struct = new KR0070010Struct();

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
	 * KR0070010クラスの標準コンストラクタ
	 */
	public KR0070010Control() throws BusinessProcessException, FoundationException
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
				KR0070010Struct key = (KR0070010Struct)keyList.get(j);
				// メッセージキーを作成する
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("rdoInsert") && key.getrdoInsert() != null) {
					msgKey.setKeyValue("rdoInsert", key.getrdoInsert());
				}
				if(msgKeyType.containsKeyColumn("rdoUpdateDelete") && key.getrdoUpdateDelete() != null) {
					msgKey.setKeyValue("rdoUpdateDelete", key.getrdoUpdateDelete());
				}
				if(msgKeyType.containsKeyColumn("addAmountOrder") && key.getaddAmountOrder() != null) {
					msgKey.setKeyValue("addAmountOrder", key.getaddAmountOrder());
				}
				if(msgKeyType.containsKeyColumn("CUR_UNIT_AMOUNT") && key.getCUR_UNIT_AMOUNT() != null) {
					msgKey.setKeyValue("CUR_UNIT_AMOUNT", key.getCUR_UNIT_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("lbORGN_ODR_NO") && key.getlbORGN_ODR_NO() != null) {
					msgKey.setKeyValue("lbORGN_ODR_NO", key.getlbORGN_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("h_SLIP_CD") && key.geth_SLIP_CD() != null) {
					msgKey.setKeyValue("h_SLIP_CD", key.geth_SLIP_CD());
				}
				if(msgKeyType.containsKeyColumn("h_TAX_CD") && key.geth_TAX_CD() != null) {
					msgKey.setKeyValue("h_TAX_CD", key.geth_TAX_CD());
				}
				if(msgKeyType.containsKeyColumn("h_rdoInsert") && key.geth_rdoInsert() != null) {
					msgKey.setKeyValue("h_rdoInsert", key.geth_rdoInsert());
				}
				if(msgKeyType.containsKeyColumn("h_ODR_NO") && key.geth_ODR_NO() != null) {
					msgKey.setKeyValue("h_ODR_NO", key.geth_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("OPTION_ID") && key.getOPTION_ID() != null) {
					msgKey.setKeyValue("OPTION_ID", key.getOPTION_ID());
				}
				if(msgKeyType.containsKeyColumn("INSTALL_FLG") && key.getINSTALL_FLG() != null) {
					msgKey.setKeyValue("INSTALL_FLG", key.getINSTALL_FLG());
				}
				if(msgKeyType.containsKeyColumn("ORGN_ODR_NO") && key.getORGN_ODR_NO() != null) {
					msgKey.setKeyValue("ORGN_ODR_NO", key.getORGN_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("h_ADD_ODR_FLG") && key.geth_ADD_ODR_FLG() != null) {
					msgKey.setKeyValue("h_ADD_ODR_FLG", key.geth_ADD_ODR_FLG());
				}
				if(msgKeyType.containsKeyColumn("CUST_ODR_NO") && key.getCUST_ODR_NO() != null) {
					msgKey.setKeyValue("CUST_ODR_NO", key.getCUST_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("CUST_CD") && key.getCUST_CD() != null) {
					msgKey.setKeyValue("CUST_CD", key.getCUST_CD());
				}
				if(msgKeyType.containsKeyColumn("CUST_NAME") && key.getCUST_NAME() != null) {
					msgKey.setKeyValue("CUST_NAME", key.getCUST_NAME());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_NAME") && key.getITEM_NAME() != null) {
					msgKey.setKeyValue("ITEM_NAME", key.getITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("ODR_QTY") && key.getODR_QTY() != null) {
					msgKey.setKeyValue("ODR_QTY", key.getODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("ODR_ACPT_DATE") && key.getODR_ACPT_DATE() != null) {
					msgKey.setKeyValue("ODR_ACPT_DATE", key.getODR_ACPT_DATE());
				}
				if(msgKeyType.containsKeyColumn("TAX_CD") && key.getTAX_CD() != null) {
					msgKey.setKeyValue("TAX_CD", key.getTAX_CD());
				}
				if(msgKeyType.containsKeyColumn("ODR_MODIFY_COUNT") && key.getODR_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("ODR_MODIFY_COUNT", key.getODR_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("ODR_ACPT_PSN_CD") && key.getODR_ACPT_PSN_CD() != null) {
					msgKey.setKeyValue("ODR_ACPT_PSN_CD", key.getODR_ACPT_PSN_CD());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT_ODR") && key.getSTOCK_UNIT_ODR() != null) {
					msgKey.setKeyValue("STOCK_UNIT_ODR", key.getSTOCK_UNIT_ODR());
				}
				if(msgKeyType.containsKeyColumn("CUR_UNIT_PRICE") && key.getCUR_UNIT_PRICE() != null) {
					msgKey.setKeyValue("CUR_UNIT_PRICE", key.getCUR_UNIT_PRICE());
				}
				if(msgKeyType.containsKeyColumn("SALES_UNIT_PRICE") && key.getSALES_UNIT_PRICE() != null) {
					msgKey.setKeyValue("SALES_UNIT_PRICE", key.getSALES_UNIT_PRICE());
				}
				if(msgKeyType.containsKeyColumn("SALES_AMOUNT") && key.getSALES_AMOUNT() != null) {
					msgKey.setKeyValue("SALES_AMOUNT", key.getSALES_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("DESINATED_DLV_DATE") && key.getDESINATED_DLV_DATE() != null) {
					msgKey.setKeyValue("DESINATED_DLV_DATE", key.getDESINATED_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("SLIP_CD") && key.getSLIP_CD() != null) {
					msgKey.setKeyValue("SLIP_CD", key.getSLIP_CD());
				}
				if(msgKeyType.containsKeyColumn("ODR_NO") && key.getODR_NO() != null) {
					msgKey.setKeyValue("ODR_NO", key.getODR_NO());
				}
				if(msgKeyType.containsKeyColumn("COMPANY_CD") && key.getCOMPANY_CD() != null) {
					msgKey.setKeyValue("COMPANY_CD", key.getCOMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("SALES_DATE") && key.getSALES_DATE() != null) {
					msgKey.setKeyValue("SALES_DATE", key.getSALES_DATE());
				}
				if(msgKeyType.containsKeyColumn("SALES_DEPT_CD") && key.getSALES_DEPT_CD() != null) {
					msgKey.setKeyValue("SALES_DEPT_CD", key.getSALES_DEPT_CD());
				}
				if(msgKeyType.containsKeyColumn("ORG_NAME") && key.getORG_NAME() != null) {
					msgKey.setKeyValue("ORG_NAME", key.getORG_NAME());
				}
				if(msgKeyType.containsKeyColumn("CUST_CHRG_PSN_CD") && key.getCUST_CHRG_PSN_CD() != null) {
					msgKey.setKeyValue("CUST_CHRG_PSN_CD", key.getCUST_CHRG_PSN_CD());
				}
				if(msgKeyType.containsKeyColumn("USER_NAME") && key.getUSER_NAME() != null) {
					msgKey.setKeyValue("USER_NAME", key.getUSER_NAME());
				}
				if(msgKeyType.containsKeyColumn("SALES_QTY") && key.getSALES_QTY() != null) {
					msgKey.setKeyValue("SALES_QTY", key.getSALES_QTY());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT") && key.getSTOCK_UNIT() != null) {
					msgKey.setKeyValue("STOCK_UNIT", key.getSTOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("REMARKS") && key.getREMARKS() != null) {
					msgKey.setKeyValue("REMARKS", key.getREMARKS());
				}
				if(msgKeyType.containsKeyColumn("STATUS") && key.getSTATUS() != null) {
					msgKey.setKeyValue("STATUS", key.getSTATUS());
				}
				if(msgKeyType.containsKeyColumn("h_SALES_SEQ_NO") && key.geth_SALES_SEQ_NO() != null) {
					msgKey.setKeyValue("h_SALES_SEQ_NO", key.geth_SALES_SEQ_NO());
				}
				if(msgKeyType.containsKeyColumn("AI_AR_IF_FLG") && key.getAI_AR_IF_FLG() != null) {
					msgKey.setKeyValue("AI_AR_IF_FLG", key.getAI_AR_IF_FLG());
				}
				if(msgKeyType.containsKeyColumn("MODIFY_COUNT") && key.getMODIFY_COUNT() != null) {
					msgKey.setKeyValue("MODIFY_COUNT", key.getMODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("H_MODIFY_COUNT") && key.getH_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("H_MODIFY_COUNT", key.getH_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("h_SALES_H_NO") && key.geth_SALES_H_NO() != null) {
					msgKey.setKeyValue("h_SALES_H_NO", key.geth_SALES_H_NO());
				}
				if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP") && key.getUNIT_QTY_TYP() != null) {
					msgKey.setKeyValue("UNIT_QTY_TYP", key.getUNIT_QTY_TYP());
				}
				if(msgKeyType.containsKeyColumn("TAX_RATE_1") && key.getTAX_RATE_1() != null) {
					msgKey.setKeyValue("TAX_RATE_1", key.getTAX_RATE_1());
				}
				if(msgKeyType.containsKeyColumn("TAX_RATE_2") && key.getTAX_RATE_2() != null) {
					msgKey.setKeyValue("TAX_RATE_2", key.getTAX_RATE_2());
				}
				if(msgKeyType.containsKeyColumn("TAX_RATE_3") && key.getTAX_RATE_3() != null) {
					msgKey.setKeyValue("TAX_RATE_3", key.getTAX_RATE_3());
				}
				if(msgKeyType.containsKeyColumn("TAX_ROUND_TYP") && key.getTAX_ROUND_TYP() != null) {
					msgKey.setKeyValue("TAX_ROUND_TYP", key.getTAX_ROUND_TYP());
				}
				if(msgKeyType.containsKeyColumn("haveFlag") && key.gethaveFlag() != null) {
					msgKey.setKeyValue("haveFlag", key.gethaveFlag());
				}
				if(msgKeyType.containsKeyColumn("SLIP_TYP") && key.getSLIP_TYP() != null) {
					msgKey.setKeyValue("SLIP_TYP", key.getSLIP_TYP());
				}
				if(msgKeyType.containsKeyColumn("h_CUR_CD") && key.geth_CUR_CD() != null) {
					msgKey.setKeyValue("h_CUR_CD", key.geth_CUR_CD());
				}
				if(msgKeyType.containsKeyColumn("EXCH_TYP") && key.getEXCH_TYP() != null) {
					msgKey.setKeyValue("EXCH_TYP", key.getEXCH_TYP());
				}
				if(msgKeyType.containsKeyColumn("INSPC_ACPT_TYP") && key.getINSPC_ACPT_TYP() != null) {
					msgKey.setKeyValue("INSPC_ACPT_TYP", key.getINSPC_ACPT_TYP());
				}
				if(msgKeyType.containsKeyColumn("DETAIL_ROUND_TYP") && key.getDETAIL_ROUND_TYP() != null) {
					msgKey.setKeyValue("DETAIL_ROUND_TYP", key.getDETAIL_ROUND_TYP());
				}
				if(msgKeyType.containsKeyColumn("SALES_SEQ_NO") && key.getSALES_SEQ_NO() != null) {
					msgKey.setKeyValue("SALES_SEQ_NO", key.getSALES_SEQ_NO());
				}
				if(msgKeyType.containsKeyColumn("SALES_TYP") && key.getSALES_TYP() != null) {
					msgKey.setKeyValue("SALES_TYP", key.getSALES_TYP());
				}
				if(msgKeyType.containsKeyColumn("VEND_CD") && key.getVEND_CD() != null) {
					msgKey.setKeyValue("VEND_CD", key.getVEND_CD());
				}
				if(msgKeyType.containsKeyColumn("PRD_ODR_PLACE_CD") && key.getPRD_ODR_PLACE_CD() != null) {
					msgKey.setKeyValue("PRD_ODR_PLACE_CD", key.getPRD_ODR_PLACE_CD());
				}
				if(msgKeyType.containsKeyColumn("UNIT_CD") && key.getUNIT_CD() != null) {
					msgKey.setKeyValue("UNIT_CD", key.getUNIT_CD());
				}
				if(msgKeyType.containsKeyColumn("SALES_AMOUNT_EXCH_RATES") && key.getSALES_AMOUNT_EXCH_RATES() != null) {
					msgKey.setKeyValue("SALES_AMOUNT_EXCH_RATES", key.getSALES_AMOUNT_EXCH_RATES());
				}
				if(msgKeyType.containsKeyColumn("INSPC_ACPT_DATE") && key.getINSPC_ACPT_DATE() != null) {
					msgKey.setKeyValue("INSPC_ACPT_DATE", key.getINSPC_ACPT_DATE());
				}
				if(msgKeyType.containsKeyColumn("INSPC_ACPT_QTY") && key.getINSPC_ACPT_QTY() != null) {
					msgKey.setKeyValue("INSPC_ACPT_QTY", key.getINSPC_ACPT_QTY());
				}
				if(msgKeyType.containsKeyColumn("EXTERNAL_TAX_SALES_AMOUNT") && key.getEXTERNAL_TAX_SALES_AMOUNT() != null) {
					msgKey.setKeyValue("EXTERNAL_TAX_SALES_AMOUNT", key.getEXTERNAL_TAX_SALES_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("INTERNAL_TAX_SALES_AMOUNT") && key.getINTERNAL_TAX_SALES_AMOUNT() != null) {
					msgKey.setKeyValue("INTERNAL_TAX_SALES_AMOUNT", key.getINTERNAL_TAX_SALES_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("TAXFREE_SALES_AMOUNT") && key.getTAXFREE_SALES_AMOUNT() != null) {
					msgKey.setKeyValue("TAXFREE_SALES_AMOUNT", key.getTAXFREE_SALES_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("TAX_CREDIT_SALES_AMOUNT") && key.getTAX_CREDIT_SALES_AMOUNT() != null) {
					msgKey.setKeyValue("TAX_CREDIT_SALES_AMOUNT", key.getTAX_CREDIT_SALES_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("EXTERNAL_TAX_AMOUNT") && key.getEXTERNAL_TAX_AMOUNT() != null) {
					msgKey.setKeyValue("EXTERNAL_TAX_AMOUNT", key.getEXTERNAL_TAX_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("INTERNAL_TAX_AMOUNT") && key.getINTERNAL_TAX_AMOUNT() != null) {
					msgKey.setKeyValue("INTERNAL_TAX_AMOUNT", key.getINTERNAL_TAX_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("TAX_AMOUNT_1") && key.getTAX_AMOUNT_1() != null) {
					msgKey.setKeyValue("TAX_AMOUNT_1", key.getTAX_AMOUNT_1());
				}
				if(msgKeyType.containsKeyColumn("TAX_AMOUNT_2") && key.getTAX_AMOUNT_2() != null) {
					msgKey.setKeyValue("TAX_AMOUNT_2", key.getTAX_AMOUNT_2());
				}
				if(msgKeyType.containsKeyColumn("TAX_AMOUNT_3") && key.getTAX_AMOUNT_3() != null) {
					msgKey.setKeyValue("TAX_AMOUNT_3", key.getTAX_AMOUNT_3());
				}
				if(msgKeyType.containsKeyColumn("OWN_CUR_TAXCREDIT_SALES_AMOUNT") && key.getOWN_CUR_TAXCREDIT_SALES_AMOUNT() != null) {
					msgKey.setKeyValue("OWN_CUR_TAXCREDIT_SALES_AMOUNT", key.getOWN_CUR_TAXCREDIT_SALES_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("ORG_SLIP_CD") && key.getORG_SLIP_CD() != null) {
					msgKey.setKeyValue("ORG_SLIP_CD", key.getORG_SLIP_CD());
				}
				if(msgKeyType.containsKeyColumn("CURRNCY_CD") && key.getCURRNCY_CD() != null) {
					msgKey.setKeyValue("CURRNCY_CD", key.getCURRNCY_CD());
				}
				if(msgKeyType.containsKeyColumn("SPCL_PRICE_CO") && key.getSPCL_PRICE_CO() != null) {
					msgKey.setKeyValue("SPCL_PRICE_CO", key.getSPCL_PRICE_CO());
				}
				if(msgKeyType.containsKeyColumn("DEL_FLG") && key.getDEL_FLG() != null) {
					msgKey.setKeyValue("DEL_FLG", key.getDEL_FLG());
				}
				if(msgKeyType.containsKeyColumn("APPR_FLG") && key.getAPPR_FLG() != null) {
					msgKey.setKeyValue("APPR_FLG", key.getAPPR_FLG());
				}
				if(msgKeyType.containsKeyColumn("APPR_ID") && key.getAPPR_ID() != null) {
					msgKey.setKeyValue("APPR_ID", key.getAPPR_ID());
				}
				if(msgKeyType.containsKeyColumn("APPR_DATE") && key.getAPPR_DATE() != null) {
					msgKey.setKeyValue("APPR_DATE", key.getAPPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("VALUE") && key.getVALUE() != null) {
					msgKey.setKeyValue("VALUE", key.getVALUE());
				}
				if(msgKeyType.containsKeyColumn("NAME") && key.getNAME() != null) {
					msgKey.setKeyValue("NAME", key.getNAME());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("SYS_CLASS") && key.getSYS_CLASS() != null) {
					msgKey.setKeyValue("SYS_CLASS", key.getSYS_CLASS());
				}
				if(msgKeyType.containsKeyColumn("BUSINESS_OPR_DATE") && key.getBUSINESS_OPR_DATE() != null) {
					msgKey.setKeyValue("BUSINESS_OPR_DATE", key.getBUSINESS_OPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("DECIMAL_FIG") && key.getDECIMAL_FIG() != null) {
					msgKey.setKeyValue("DECIMAL_FIG", key.getDECIMAL_FIG());
				}
				if(msgKeyType.containsKeyColumn("CUR_UNIT") && key.getCUR_UNIT() != null) {
					msgKey.setKeyValue("CUR_UNIT", key.getCUR_UNIT());
				}
				if(msgKeyType.containsKeyColumn("SHIP_ODR_NO") && key.getSHIP_ODR_NO() != null) {
					msgKey.setKeyValue("SHIP_ODR_NO", key.getSHIP_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("SHIP_SEQ_NO") && key.getSHIP_SEQ_NO() != null) {
					msgKey.setKeyValue("SHIP_SEQ_NO", key.getSHIP_SEQ_NO());
				}
				if(msgKeyType.containsKeyColumn("CUR_CD") && key.getCUR_CD() != null) {
					msgKey.setKeyValue("CUR_CD", key.getCUR_CD());
				}
				if(msgKeyType.containsKeyColumn("AMOUNT_TYP") && key.getAMOUNT_TYP() != null) {
					msgKey.setKeyValue("AMOUNT_TYP", key.getAMOUNT_TYP());
				}
				if(msgKeyType.containsKeyColumn("TEMP_SALES_TYP") && key.getTEMP_SALES_TYP() != null) {
					msgKey.setKeyValue("TEMP_SALES_TYP", key.getTEMP_SALES_TYP());
				}
				if(msgKeyType.containsKeyColumn("SALES_DISAGREEMENT_TYP") && key.getSALES_DISAGREEMENT_TYP() != null) {
					msgKey.setKeyValue("SALES_DISAGREEMENT_TYP", key.getSALES_DISAGREEMENT_TYP());
				}
				if(msgKeyType.containsKeyColumn("SALES_FLG") && key.getSALES_FLG() != null) {
					msgKey.setKeyValue("SALES_FLG", key.getSALES_FLG());
				}
				if(msgKeyType.containsKeyColumn("SALES_IF_FLG") && key.getSALES_IF_FLG() != null) {
					msgKey.setKeyValue("SALES_IF_FLG", key.getSALES_IF_FLG());
				}
				if(msgKeyType.containsKeyColumn("CONS_TYP") && key.getCONS_TYP() != null) {
					msgKey.setKeyValue("CONS_TYP", key.getCONS_TYP());
				}
				if(msgKeyType.containsKeyColumn("BILL_ADDRESSEE_CD") && key.getBILL_ADDRESSEE_CD() != null) {
					msgKey.setKeyValue("BILL_ADDRESSEE_CD", key.getBILL_ADDRESSEE_CD());
				}
				if(msgKeyType.containsKeyColumn("STL_COND_CD") && key.getSTL_COND_CD() != null) {
					msgKey.setKeyValue("STL_COND_CD", key.getSTL_COND_CD());
				}
				if(msgKeyType.containsKeyColumn("SALES_H_NO") && key.getSALES_H_NO() != null) {
					msgKey.setKeyValue("SALES_H_NO", key.getSALES_H_NO());
				}
				if(msgKeyType.containsKeyColumn("SHIP_DLV_H_NO") && key.getSHIP_DLV_H_NO() != null) {
					msgKey.setKeyValue("SHIP_DLV_H_NO", key.getSHIP_DLV_H_NO());
				}
				if(msgKeyType.containsKeyColumn("CUST_SALES_QTY") && key.getCUST_SALES_QTY() != null) {
					msgKey.setKeyValue("CUST_SALES_QTY", key.getCUST_SALES_QTY());
				}
				if(msgKeyType.containsKeyColumn("CUST_UNIT_CD") && key.getCUST_UNIT_CD() != null) {
					msgKey.setKeyValue("CUST_UNIT_CD", key.getCUST_UNIT_CD());
				}
				if(msgKeyType.containsKeyColumn("CUST_INSPC_ACPT_QTY") && key.getCUST_INSPC_ACPT_QTY() != null) {
					msgKey.setKeyValue("CUST_INSPC_ACPT_QTY", key.getCUST_INSPC_ACPT_QTY());
				}
				if(msgKeyType.containsKeyColumn("RESERVE_CAUSE") && key.getRESERVE_CAUSE() != null) {
					msgKey.setKeyValue("RESERVE_CAUSE", key.getRESERVE_CAUSE());
				}
				if(msgKeyType.containsKeyColumn("SHIP_CTRL_NO") && key.getSHIP_CTRL_NO() != null) {
					msgKey.setKeyValue("SHIP_CTRL_NO", key.getSHIP_CTRL_NO());
				}
				if(msgKeyType.containsKeyColumn("SHIP_DLV_D_NO") && key.getSHIP_DLV_D_NO() != null) {
					msgKey.setKeyValue("SHIP_DLV_D_NO", key.getSHIP_DLV_D_NO());
				}
				if(msgKeyType.containsKeyColumn("FLAG") && key.getFLAG() != null) {
					msgKey.setKeyValue("FLAG", key.getFLAG());
				}
				if(msgKeyType.containsKeyColumn("w_APR_FLG") && key.getw_APR_FLG() != null) {
					msgKey.setKeyValue("w_APR_FLG", key.getw_APR_FLG());
				}
				if(msgKeyType.containsKeyColumn("Cnt_Tpj") && key.getCnt_Tpj() != null) {
					msgKey.setKeyValue("Cnt_Tpj", key.getCnt_Tpj());
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
					KR0070010Struct key = new KR0070010Struct();
					if(msgKeyType.containsKeyColumn("rdoInsert")) {
						key.setrdoInsert(msgKey.getKeyValue("rdoInsert"));
					}
					if(msgKeyType.containsKeyColumn("rdoUpdateDelete")) {
						key.setrdoUpdateDelete(msgKey.getKeyValue("rdoUpdateDelete"));
					}
					if(msgKeyType.containsKeyColumn("addAmountOrder")) {
						key.setaddAmountOrder(msgKey.getKeyValue("addAmountOrder"));
					}
					if(msgKeyType.containsKeyColumn("CUR_UNIT_AMOUNT")) {
						key.setCUR_UNIT_AMOUNT(msgKey.getKeyValue("CUR_UNIT_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("lbORGN_ODR_NO")) {
						key.setlbORGN_ODR_NO(msgKey.getKeyValue("lbORGN_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("h_SLIP_CD")) {
						key.seth_SLIP_CD(msgKey.getKeyValue("h_SLIP_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_TAX_CD")) {
						key.seth_TAX_CD(msgKey.getKeyValue("h_TAX_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_rdoInsert")) {
						key.seth_rdoInsert(msgKey.getKeyValue("h_rdoInsert"));
					}
					if(msgKeyType.containsKeyColumn("h_ODR_NO")) {
						key.seth_ODR_NO(msgKey.getKeyValue("h_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("OPTION_ID")) {
						key.setOPTION_ID(msgKey.getKeyValue("OPTION_ID"));
					}
					if(msgKeyType.containsKeyColumn("INSTALL_FLG")) {
						key.setINSTALL_FLG(msgKey.getKeyValue("INSTALL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("ORGN_ODR_NO")) {
						key.setORGN_ODR_NO(msgKey.getKeyValue("ORGN_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("h_ADD_ODR_FLG")) {
						key.seth_ADD_ODR_FLG(msgKey.getKeyValue("h_ADD_ODR_FLG"));
					}
					if(msgKeyType.containsKeyColumn("CUST_ODR_NO")) {
						key.setCUST_ODR_NO(msgKey.getKeyValue("CUST_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("CUST_CD")) {
						key.setCUST_CD(msgKey.getKeyValue("CUST_CD"));
					}
					if(msgKeyType.containsKeyColumn("CUST_NAME")) {
						key.setCUST_NAME(msgKey.getKeyValue("CUST_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_NAME")) {
						key.setITEM_NAME(msgKey.getKeyValue("ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ODR_QTY")) {
						key.setODR_QTY(msgKey.getKeyValue("ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("ODR_ACPT_DATE")) {
						key.setODR_ACPT_DATE(msgKey.getKeyValue("ODR_ACPT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("TAX_CD")) {
						key.setTAX_CD(msgKey.getKeyValue("TAX_CD"));
					}
					if(msgKeyType.containsKeyColumn("ODR_MODIFY_COUNT")) {
						key.setODR_MODIFY_COUNT(msgKey.getKeyValue("ODR_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("ODR_ACPT_PSN_CD")) {
						key.setODR_ACPT_PSN_CD(msgKey.getKeyValue("ODR_ACPT_PSN_CD"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT_ODR")) {
						key.setSTOCK_UNIT_ODR(msgKey.getKeyValue("STOCK_UNIT_ODR"));
					}
					if(msgKeyType.containsKeyColumn("CUR_UNIT_PRICE")) {
						key.setCUR_UNIT_PRICE(msgKey.getKeyValue("CUR_UNIT_PRICE"));
					}
					if(msgKeyType.containsKeyColumn("SALES_UNIT_PRICE")) {
						key.setSALES_UNIT_PRICE(msgKey.getKeyValue("SALES_UNIT_PRICE"));
					}
					if(msgKeyType.containsKeyColumn("SALES_AMOUNT")) {
						key.setSALES_AMOUNT(msgKey.getKeyValue("SALES_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("DESINATED_DLV_DATE")) {
						key.setDESINATED_DLV_DATE(msgKey.getKeyValue("DESINATED_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("SLIP_CD")) {
						key.setSLIP_CD(msgKey.getKeyValue("SLIP_CD"));
					}
					if(msgKeyType.containsKeyColumn("ODR_NO")) {
						key.setODR_NO(msgKey.getKeyValue("ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("COMPANY_CD")) {
						key.setCOMPANY_CD(msgKey.getKeyValue("COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("SALES_DATE")) {
						key.setSALES_DATE(msgKey.getKeyValue("SALES_DATE"));
					}
					if(msgKeyType.containsKeyColumn("SALES_DEPT_CD")) {
						key.setSALES_DEPT_CD(msgKey.getKeyValue("SALES_DEPT_CD"));
					}
					if(msgKeyType.containsKeyColumn("ORG_NAME")) {
						key.setORG_NAME(msgKey.getKeyValue("ORG_NAME"));
					}
					if(msgKeyType.containsKeyColumn("CUST_CHRG_PSN_CD")) {
						key.setCUST_CHRG_PSN_CD(msgKey.getKeyValue("CUST_CHRG_PSN_CD"));
					}
					if(msgKeyType.containsKeyColumn("USER_NAME")) {
						key.setUSER_NAME(msgKey.getKeyValue("USER_NAME"));
					}
					if(msgKeyType.containsKeyColumn("SALES_QTY")) {
						key.setSALES_QTY(msgKey.getKeyValue("SALES_QTY"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT")) {
						key.setSTOCK_UNIT(msgKey.getKeyValue("STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("REMARKS")) {
						key.setREMARKS(msgKey.getKeyValue("REMARKS"));
					}
					if(msgKeyType.containsKeyColumn("STATUS")) {
						key.setSTATUS(msgKey.getKeyValue("STATUS"));
					}
					if(msgKeyType.containsKeyColumn("h_SALES_SEQ_NO")) {
						key.seth_SALES_SEQ_NO(msgKey.getKeyValue("h_SALES_SEQ_NO"));
					}
					if(msgKeyType.containsKeyColumn("AI_AR_IF_FLG")) {
						key.setAI_AR_IF_FLG(msgKey.getKeyValue("AI_AR_IF_FLG"));
					}
					if(msgKeyType.containsKeyColumn("MODIFY_COUNT")) {
						key.setMODIFY_COUNT(msgKey.getKeyValue("MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("H_MODIFY_COUNT")) {
						key.setH_MODIFY_COUNT(msgKey.getKeyValue("H_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("h_SALES_H_NO")) {
						key.seth_SALES_H_NO(msgKey.getKeyValue("h_SALES_H_NO"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP")) {
						key.setUNIT_QTY_TYP(msgKey.getKeyValue("UNIT_QTY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("TAX_RATE_1")) {
						key.setTAX_RATE_1(msgKey.getKeyValue("TAX_RATE_1"));
					}
					if(msgKeyType.containsKeyColumn("TAX_RATE_2")) {
						key.setTAX_RATE_2(msgKey.getKeyValue("TAX_RATE_2"));
					}
					if(msgKeyType.containsKeyColumn("TAX_RATE_3")) {
						key.setTAX_RATE_3(msgKey.getKeyValue("TAX_RATE_3"));
					}
					if(msgKeyType.containsKeyColumn("TAX_ROUND_TYP")) {
						key.setTAX_ROUND_TYP(msgKey.getKeyValue("TAX_ROUND_TYP"));
					}
					if(msgKeyType.containsKeyColumn("haveFlag")) {
						key.sethaveFlag(msgKey.getKeyValue("haveFlag"));
					}
					if(msgKeyType.containsKeyColumn("SLIP_TYP")) {
						key.setSLIP_TYP(msgKey.getKeyValue("SLIP_TYP"));
					}
					if(msgKeyType.containsKeyColumn("h_CUR_CD")) {
						key.seth_CUR_CD(msgKey.getKeyValue("h_CUR_CD"));
					}
					if(msgKeyType.containsKeyColumn("EXCH_TYP")) {
						key.setEXCH_TYP(msgKey.getKeyValue("EXCH_TYP"));
					}
					if(msgKeyType.containsKeyColumn("INSPC_ACPT_TYP")) {
						key.setINSPC_ACPT_TYP(msgKey.getKeyValue("INSPC_ACPT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("DETAIL_ROUND_TYP")) {
						key.setDETAIL_ROUND_TYP(msgKey.getKeyValue("DETAIL_ROUND_TYP"));
					}
					if(msgKeyType.containsKeyColumn("SALES_SEQ_NO")) {
						key.setSALES_SEQ_NO(msgKey.getKeyValue("SALES_SEQ_NO"));
					}
					if(msgKeyType.containsKeyColumn("SALES_TYP")) {
						key.setSALES_TYP(msgKey.getKeyValue("SALES_TYP"));
					}
					if(msgKeyType.containsKeyColumn("VEND_CD")) {
						key.setVEND_CD(msgKey.getKeyValue("VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("PRD_ODR_PLACE_CD")) {
						key.setPRD_ODR_PLACE_CD(msgKey.getKeyValue("PRD_ODR_PLACE_CD"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_CD")) {
						key.setUNIT_CD(msgKey.getKeyValue("UNIT_CD"));
					}
					if(msgKeyType.containsKeyColumn("SALES_AMOUNT_EXCH_RATES")) {
						key.setSALES_AMOUNT_EXCH_RATES(msgKey.getKeyValue("SALES_AMOUNT_EXCH_RATES"));
					}
					if(msgKeyType.containsKeyColumn("INSPC_ACPT_DATE")) {
						key.setINSPC_ACPT_DATE(msgKey.getKeyValue("INSPC_ACPT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("INSPC_ACPT_QTY")) {
						key.setINSPC_ACPT_QTY(msgKey.getKeyValue("INSPC_ACPT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("EXTERNAL_TAX_SALES_AMOUNT")) {
						key.setEXTERNAL_TAX_SALES_AMOUNT(msgKey.getKeyValue("EXTERNAL_TAX_SALES_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("INTERNAL_TAX_SALES_AMOUNT")) {
						key.setINTERNAL_TAX_SALES_AMOUNT(msgKey.getKeyValue("INTERNAL_TAX_SALES_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("TAXFREE_SALES_AMOUNT")) {
						key.setTAXFREE_SALES_AMOUNT(msgKey.getKeyValue("TAXFREE_SALES_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("TAX_CREDIT_SALES_AMOUNT")) {
						key.setTAX_CREDIT_SALES_AMOUNT(msgKey.getKeyValue("TAX_CREDIT_SALES_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("EXTERNAL_TAX_AMOUNT")) {
						key.setEXTERNAL_TAX_AMOUNT(msgKey.getKeyValue("EXTERNAL_TAX_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("INTERNAL_TAX_AMOUNT")) {
						key.setINTERNAL_TAX_AMOUNT(msgKey.getKeyValue("INTERNAL_TAX_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("TAX_AMOUNT_1")) {
						key.setTAX_AMOUNT_1(msgKey.getKeyValue("TAX_AMOUNT_1"));
					}
					if(msgKeyType.containsKeyColumn("TAX_AMOUNT_2")) {
						key.setTAX_AMOUNT_2(msgKey.getKeyValue("TAX_AMOUNT_2"));
					}
					if(msgKeyType.containsKeyColumn("TAX_AMOUNT_3")) {
						key.setTAX_AMOUNT_3(msgKey.getKeyValue("TAX_AMOUNT_3"));
					}
					if(msgKeyType.containsKeyColumn("OWN_CUR_TAXCREDIT_SALES_AMOUNT")) {
						key.setOWN_CUR_TAXCREDIT_SALES_AMOUNT(msgKey.getKeyValue("OWN_CUR_TAXCREDIT_SALES_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("ORG_SLIP_CD")) {
						key.setORG_SLIP_CD(msgKey.getKeyValue("ORG_SLIP_CD"));
					}
					if(msgKeyType.containsKeyColumn("CURRNCY_CD")) {
						key.setCURRNCY_CD(msgKey.getKeyValue("CURRNCY_CD"));
					}
					if(msgKeyType.containsKeyColumn("SPCL_PRICE_CO")) {
						key.setSPCL_PRICE_CO(msgKey.getKeyValue("SPCL_PRICE_CO"));
					}
					if(msgKeyType.containsKeyColumn("DEL_FLG")) {
						key.setDEL_FLG(msgKey.getKeyValue("DEL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("APPR_FLG")) {
						key.setAPPR_FLG(msgKey.getKeyValue("APPR_FLG"));
					}
					if(msgKeyType.containsKeyColumn("APPR_ID")) {
						key.setAPPR_ID(msgKey.getKeyValue("APPR_ID"));
					}
					if(msgKeyType.containsKeyColumn("APPR_DATE")) {
						key.setAPPR_DATE(msgKey.getKeyValue("APPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("VALUE")) {
						key.setVALUE(msgKey.getKeyValue("VALUE"));
					}
					if(msgKeyType.containsKeyColumn("NAME")) {
						key.setNAME(msgKey.getKeyValue("NAME"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("SYS_CLASS")) {
						key.setSYS_CLASS(msgKey.getKeyValue("SYS_CLASS"));
					}
					if(msgKeyType.containsKeyColumn("BUSINESS_OPR_DATE")) {
						key.setBUSINESS_OPR_DATE(msgKey.getKeyValue("BUSINESS_OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("DECIMAL_FIG")) {
						key.setDECIMAL_FIG(msgKey.getKeyValue("DECIMAL_FIG"));
					}
					if(msgKeyType.containsKeyColumn("CUR_UNIT")) {
						key.setCUR_UNIT(msgKey.getKeyValue("CUR_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("SHIP_ODR_NO")) {
						key.setSHIP_ODR_NO(msgKey.getKeyValue("SHIP_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("SHIP_SEQ_NO")) {
						key.setSHIP_SEQ_NO(msgKey.getKeyValue("SHIP_SEQ_NO"));
					}
					if(msgKeyType.containsKeyColumn("CUR_CD")) {
						key.setCUR_CD(msgKey.getKeyValue("CUR_CD"));
					}
					if(msgKeyType.containsKeyColumn("AMOUNT_TYP")) {
						key.setAMOUNT_TYP(msgKey.getKeyValue("AMOUNT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("TEMP_SALES_TYP")) {
						key.setTEMP_SALES_TYP(msgKey.getKeyValue("TEMP_SALES_TYP"));
					}
					if(msgKeyType.containsKeyColumn("SALES_DISAGREEMENT_TYP")) {
						key.setSALES_DISAGREEMENT_TYP(msgKey.getKeyValue("SALES_DISAGREEMENT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("SALES_FLG")) {
						key.setSALES_FLG(msgKey.getKeyValue("SALES_FLG"));
					}
					if(msgKeyType.containsKeyColumn("SALES_IF_FLG")) {
						key.setSALES_IF_FLG(msgKey.getKeyValue("SALES_IF_FLG"));
					}
					if(msgKeyType.containsKeyColumn("CONS_TYP")) {
						key.setCONS_TYP(msgKey.getKeyValue("CONS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("BILL_ADDRESSEE_CD")) {
						key.setBILL_ADDRESSEE_CD(msgKey.getKeyValue("BILL_ADDRESSEE_CD"));
					}
					if(msgKeyType.containsKeyColumn("STL_COND_CD")) {
						key.setSTL_COND_CD(msgKey.getKeyValue("STL_COND_CD"));
					}
					if(msgKeyType.containsKeyColumn("SALES_H_NO")) {
						key.setSALES_H_NO(msgKey.getKeyValue("SALES_H_NO"));
					}
					if(msgKeyType.containsKeyColumn("SHIP_DLV_H_NO")) {
						key.setSHIP_DLV_H_NO(msgKey.getKeyValue("SHIP_DLV_H_NO"));
					}
					if(msgKeyType.containsKeyColumn("CUST_SALES_QTY")) {
						key.setCUST_SALES_QTY(msgKey.getKeyValue("CUST_SALES_QTY"));
					}
					if(msgKeyType.containsKeyColumn("CUST_UNIT_CD")) {
						key.setCUST_UNIT_CD(msgKey.getKeyValue("CUST_UNIT_CD"));
					}
					if(msgKeyType.containsKeyColumn("CUST_INSPC_ACPT_QTY")) {
						key.setCUST_INSPC_ACPT_QTY(msgKey.getKeyValue("CUST_INSPC_ACPT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("RESERVE_CAUSE")) {
						key.setRESERVE_CAUSE(msgKey.getKeyValue("RESERVE_CAUSE"));
					}
					if(msgKeyType.containsKeyColumn("SHIP_CTRL_NO")) {
						key.setSHIP_CTRL_NO(msgKey.getKeyValue("SHIP_CTRL_NO"));
					}
					if(msgKeyType.containsKeyColumn("SHIP_DLV_D_NO")) {
						key.setSHIP_DLV_D_NO(msgKey.getKeyValue("SHIP_DLV_D_NO"));
					}
					if(msgKeyType.containsKeyColumn("FLAG")) {
						key.setFLAG(msgKey.getKeyValue("FLAG"));
					}
					if(msgKeyType.containsKeyColumn("w_APR_FLG")) {
						key.setw_APR_FLG(msgKey.getKeyValue("w_APR_FLG"));
					}
					if(msgKeyType.containsKeyColumn("Cnt_Tpj")) {
						key.setCnt_Tpj(msgKey.getKeyValue("Cnt_Tpj"));
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
