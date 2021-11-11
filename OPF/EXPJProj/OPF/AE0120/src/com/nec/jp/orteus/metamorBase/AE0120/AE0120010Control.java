/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AE0120/src/com/nec/jp/orteus/metamorBase/AE0120/AE0120010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AE0120;

import com.nec.jp.orteus.metamorBase.AE0120.*;
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
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.math.BigDecimal;

import com.nec.jp.orteus.expj.flash.Kind;
import com.nec.jp.orteus.metamorBase.common01.util.Calculate;
import com.nec.jp.orteus.metamorBase.common02.CommonOd.ApsComException;
import com.nec.jp.orteus.metamorBase.common02.CommonOd.CommonOd;
import com.nec.jp.orteus.metamorBase.common04.amount.AmountCalculator;
import com.nec.jp.orteus.metamorBase.common04.amount.CurControl;
import com.nec.jp.orteus.metamorBase.common04.amount.CurStruct;
import com.nec.jp.orteus.metamorBase.common04.amount.ExchRateControl;
import com.nec.jp.orteus.metamorBase.common04.amount.ExchRateStruct;
import com.nec.jp.orteus.metamorBase.common04.amount.PuchUnitCostControl;
import com.nec.jp.orteus.metamorBase.common04.amount.PuchUnitCostStruct;
import com.nec.jp.orteus.metamorBase.common04.amount.TaxControl;
import com.nec.jp.orteus.metamorBase.common04.amount.TaxStruct;
import com.nec.jp.orteus.metamorBase.common04.sysdata.DateCtrlControl;
import com.nec.jp.orteus.metamorBase.common04.sysdata.DateCtrlStruct;
import com.nec.jp.orteus.metamorBase.common04.sysdata.HomeCurControl;
import com.nec.jp.orteus.metamorBase.common04.sysdata.HomeCurStruct;
import com.nec.jp.orteus.metamorBase.common04.sysdata.MyCompanyControl;
import com.nec.jp.orteus.metamorBase.common04.sysdata.MyCompanyStruct;
import com.nec.jp.orteus.metamorBase.common04.sysdata.TaxNameControl;
import com.nec.jp.orteus.metamorBase.common04.sysdata.TaxNameStruct;
import com.nec.jp.orteus.metamorBase.common04.util.DataNotFoundException;
import com.nec.jp.orteus.metamorBase.common08.LotCtrl.LotCtrl;
import com.nec.jp.orteus.expj.lot.BizCommon;
import com.nec.jp.orteus.expj.pr.rcvissue.process.ValidateWh;
import com.nec.jp.orteus.expj.lot.BizCommon;
import com.nec.jp.orteus.expj.arap.ArApNumbering;
//}}user_implement_code_import

//{{user_implement_code_header
/**
 * CLASS     : AE0120010Control クラス
 * ファイル・クラス説明
 * @author $Author: shan-xiuqin $
 * @version $Revision: 1.24 $ $Date: 2015/11/16 05:10:34 $
 *
 */
//}}user_implement_code_header

public class AE0120010Control
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
	/** 部品呼出しの返却値格納リスト */
	protected List _resultList;	

	private String lotCtrl = "";
	/** ワーニング格納リスト */
	private List _errorList = new ArrayList();
	protected List list;											// 結果リストのインスタンス
	public List getList() { return this.list; }						// リストを返します。
	public void setList(List listname) { this.list = listname; }	// リストをセットします。
	public int getListsize() {										// リスト型のサイズを返します。
		int nret = 0;
		if( this.list != null ) {nret = this.list.size();}
		return nret;
	}
//	public Object getListvalue(int x) { return this.list.get(x); }	// リストの値を返します。
	public AE0120010Struct getListvalue(int x) { return (AE0120010Struct)(this.list.get(x)); }	// リストの値を返します。
	public AE0120010Struct getStruct() { return this.struct; }	// Structの値を返します。
	public AE0120010Struct createStruct() { return new AE0120010Struct(); }	// 新しいStructを作って返します。
	public void setStruct(Object structname) { this.struct.setStruct((AE0120010Struct)structname); }	// Structをセットします。
	public void initializeStruct() { this.struct.initialize(); }	// Structの値を初期化します。

	// CSV出力用リスト
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }
	// TODO: ユーザ定義のコードを記述してください

	private String actionTyp = "1"; //処理種類
	private String slipTyp = "79";  //伝票種類
	/** 画面遷移キー(購入返品番号) */
	private String _puchOdrCd;
  
	/**
	 * 画面遷移キー(購入返品番号)取得
	 * @return 購入返品番号
	 */
	public String getPuchOdrCd() {
		return _puchOdrCd;
	}

	/**
	 * 画面遷移キー(購入返品番号)設定
	 * @param cd 購入返品番号
	 */
	public void setPuchOdrCd(String cd) {
		_puchOdrCd = cd;
	}

	/** [自社]情報 */
	private MyCompanyStruct _myCompanyStruct = new MyCompanyStruct();
	
	/** [税名]情報 */
	private TaxNameStruct _taxNameStruct = new TaxNameStruct();
	
	/** [邦貨]情報 */
	private HomeCurStruct _homeCurStruct = new HomeCurStruct();
    // 多言語項目取得対応
    ResourceBundle resource = CoreTools.getResourceBundle( "OrteusUserDic", CoreTools.getLocale(sysUSER_CD));
	/** [コンボボックスデータ]情報（単価区分） */
	private ComboStruct _unitCostTypStruct = new ComboStruct();
	/** [コンボボックスデータ]情報（製品区分） */
	private ComboStruct _productTypStruct = new ComboStruct();
	
	/** 承認 */
	String aprInspcif = "";	
	private PrivateConfig privateConfig;
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
	/**
	 * Structの値をセットします。
	 * @param s 検索したデータ
	 */
	private void setStructSystemData(AE0120010Struct s) {
		s.setsOraganization_CD(struct.getsOrganization_CD());
		s.setsSysdate(struct.getsSysdate());
		s.setsUser_ID(struct.getsUser_ID());
	}
	/**
	 * 画面の全項目を初期化します。
	 */
	private void initializeAll() 
			throws SQLException, DataNotFoundException, FoundationException {
		
		struct.setPUCH_ODR_CD(null);
		struct.seth_PUCH_ODR_CD(null);
		
		initializeDetail();
	}
	
	/**
	 * 画面の詳細項目を初期化します。
	 */
	private void initializeDetail() 
			throws SQLException, DataNotFoundException, FoundationException {
		
		struct.setVEND_CD(null);
		struct.setVEND_ANAME(null);
		struct.setITEM_CD(null);
		struct.setITEM_NAME(null);
		struct.setJOB_ODR_CD(null);
		struct.setJOB_ODR_DETAIL_NO("0");
		struct.setc_NON_NO_ITEM_FLG(null);
		struct.setPUCH_RTN_QTY("0");
		struct.setSTOCK_UNIT(null);
		// [業務日付]情報を部品より取得
		DateCtrlStruct dcs = DateCtrlControl.getData(conn, sysPLANT_CD);
		struct.setPUCH_RTN_DATE(dcs.getBUSINESS_OPR_DATE());
		struct.setWH_CD(null);
		struct.setWH_NAME(null);
		struct.setPUCH_RTN_COMMENT(null);
		struct.setLOT_NO(null);
		struct.setVEND_LOT_NO(null);
		struct.setPUCH_ODR_PERSON(sysUSER_CD);
		struct.setUSER_NAME(null);
		
		//製品区分
		struct.setPRODUCT_TYP("3");
		
		struct.setUNIT_COST_TYP("1");
		struct.setUNIT_COST("0");
		struct.setPROCESSING_COST("0");
		struct.setMATERIAL_COST("0");
		struct.setOTHER_OVERHEADS("0");
		struct.setPUCH_ODR_AMOUNT("0");
		struct.setDISC_AMOUNT("0");
		struct.setNET_AMOUNT("0");
		struct.setTAX_RATE_1("0");
		struct.setTAX_RATE_2("0");
		struct.setTAX_RATE_3("0");
		struct.setTAX_AMOUNT_1("0");
		struct.setTAX_AMOUNT_2("0");
		struct.setTAX_AMOUNT_3("0");
		struct.setHOME_CUR_AMOUNT("0");
		struct.setEXCH_RATE("1");
		struct.setAMOUNT_INCLUDE_TAX("0");
		struct.setINV_CTRL_FLG(null);
		struct.setTAX_CD(null);
		struct.setTAX_ROUND_TYP(Kind.FLOOR);
		struct.setROUND_TYP(Kind.FLOOR);
		struct.setMODIFY_COUNT(null);
		struct.setVEND_CUR_UNIT(null);
		struct.setVEND_DECIMAL_FIG("4");
		
		struct.setr1_FILTER("true");
		
		struct.setSelectUnitCostFlag("false");
		
		// 買掛管理がインストールされている場合、当年月度を取得
		AE0120010Struct readStruct = new AE0120010Struct();
		List installOptionsList = entity.mSYS_INSTALL_OPTIONS.read(conn, readStruct);
		if (installOptionsList.size() > 0) {
			AE0120010Struct installOptionsStruct = (AE0120010Struct)installOptionsList.get(0);
			struct.setINSTALL_FLG(installOptionsStruct.getINSTALL_FLG());
		} else {
			struct.setINSTALL_FLG("0");
		}
		
		// 買掛管理がインストールされている場合、当年月度を取得
		if ("1".equals(struct.getINSTALL_FLG())) {
			List debtCtrlList = entity.mSYS_DEBT_CTRL.read(conn, readStruct);
			if (debtCtrlList.size() > 0) {
				AE0120010Struct debtCtrlStruct = (AE0120010Struct)debtCtrlList.get(0);
				struct.setTHIS_MONTH(debtCtrlStruct.getTHIS_MONTH());
			} else {
				setErrorMessage("AE00145");
			}
		}
		
		list = null;
		
		readStatus = INITIAL;
	}
	
	// 保管区別入出庫追加
	private void addRcvIssue(
			IDbConnection conn, 
			AE0120010Struct formStruct, 
			AE0120010Struct puchOdrRtnRsltStruct, 
			String rcvIssueBeforeQty, 
			String rcvIssueQty, 
			String rcvIssueAterQty, 
			String ctrlCd, 
			int mode) 
			throws ParseException, DataNotFoundException, SQLException, FoundationException {
		
		// [保管区別入出庫]の追加
		AE0120010Struct insertStruct = new AE0120010Struct();
		setStructSystemData(insertStruct);
		
		// 追加内容設定
		insertStruct.setRCV_ISSUE_CTRL_CD(ctrlCd);  // 入出庫管理番号
		insertStruct.setRCV_ISSUE_TYP("1");  // 入出庫区分
		if (mode == 1) {
			insertStruct.setITEM_CD(formStruct.getITEM_CD());  // 品目番号
			insertStruct.setPLANT_CD(sysPLANT_CD);  // 工場コード
			insertStruct.setWH_CD(formStruct.getWH_CD());  // 保管区コード
			insertStruct.setJOB_ODR_CD(formStruct.getJOB_ODR_CD());  // 製番
			insertStruct.setJOB_ODR_DETAIL_NO("0");  // 製番枝番
			insertStruct.setVEND_LOT_NO(formStruct.getVEND_LOT_NO());  // メーカロット番号
			insertStruct.setLOT_NO(formStruct.getLOT_NO());  // 在庫ロット番号
			insertStruct.setRCV_ISSUE_DATE(formStruct.getPUCH_RTN_DATE());  // 入出庫年月日
			insertStruct.setRCV_ISSUE_GNR_TYP("19");  // 入出庫発生区分
			insertStruct.setCOMPANY_CD(_myCompanyStruct.getCOMPANY_CD());  // 会社コード
			insertStruct.setVEND_CD(formStruct.getVEND_CD());  // 取引先コード
		} else {
			insertStruct.setITEM_CD(puchOdrRtnRsltStruct.getITEM_CD());  // 品目番号
			insertStruct.setPLANT_CD(puchOdrRtnRsltStruct.getPLANT_CD());  // 工場コード
			insertStruct.setWH_CD(puchOdrRtnRsltStruct.getWH_CD());  // 保管区コード
			insertStruct.setJOB_ODR_CD(puchOdrRtnRsltStruct.getJOB_ODR_CD());  // 製番
			insertStruct.setJOB_ODR_DETAIL_NO(puchOdrRtnRsltStruct.getJOB_ODR_DETAIL_NO());  // 製番枝番
			insertStruct.setVEND_LOT_NO(puchOdrRtnRsltStruct.getVEND_LOT_NO());  // メーカロット番号
			insertStruct.setLOT_NO(puchOdrRtnRsltStruct.getLOT_NO());  // 在庫ロット番号
			if (mode == 2) {
				insertStruct.setRCV_ISSUE_DATE(puchOdrRtnRsltStruct.getPUCH_RTN_DATE());  // 入出庫年月日
			} else {
				// 業務運用日取得
				// DateCtrlStruct dcs = DateCtrlControl.getData(conn, sysPLANT_CD);
				insertStruct.setRCV_ISSUE_DATE(puchOdrRtnRsltStruct.getPUCH_RTN_DATE());  // 入出庫年月日
			}
			insertStruct.setRCV_ISSUE_GNR_TYP("11");  // 入出庫発生区分
			insertStruct.setCOMPANY_CD(puchOdrRtnRsltStruct.getCOMPANY_CD());  // 会社コード
			insertStruct.setVEND_CD(puchOdrRtnRsltStruct.getVEND_CD());  // 取引先コード
		}
		insertStruct.setACPT_NO("0");  // 受入回数
		insertStruct.setACPT_RSLT_CRCT_NO("0");  // 受入実績訂正回数
		insertStruct.setINSPEC_RSLT_CRCT_NO("0");  // 検査実績訂正回数
		insertStruct.setPARTIAL_PRD_NO("0");  // 分作回数
		insertStruct.setOPR_RSLT_CRCT_NO("0");  // 作業実績訂正回数
		insertStruct.setRCV_ISSUE_BEFORE_QTY(rcvIssueBeforeQty);  // 入出庫前在庫数
		insertStruct.setRCV_ISSUE_QTY(rcvIssueQty);  // 入出庫数
		insertStruct.setRCV_ISSUE_AFTER_QTY(rcvIssueAterQty);  // 入出庫後在庫数
		insertStruct.setRCV_ISSUE_AMOUNT("0");  // 入出庫金額
		insertStruct.setRCV_ISSUE_ODD_QTY("0");  // 入出庫端数
		insertStruct.setSTOCK_UPD_TYP("2");  // 在庫更新区分
		insertStruct.setRCV_ISSUE_CMPLT_FLG("0");  // 入出庫完了フラグ
		insertStruct.setCONS_TYP("0");  // 支給区分
        //会社コード
		if("".equals(insertStruct.getCOMPANY_CD()) || insertStruct.getCOMPANY_CD() == null){
			insertStruct.setCOMPANY_CD(SystemInformation.getSysMyCompanyCd());
		}
		entity.mT_RCV_ISSUE.create(conn, insertStruct);		

	}

    // ロット品目在庫登録・更新処理
    private void addLotStock(
            IDbConnection conn, 
            AE0120010Struct formStruct, 
            AE0120010Struct puchOdrRtnRsltStruct, 
            String ctrlCd, 
            int mode) 
            throws ParseException, DataNotFoundException, SQLException, FoundationException {
        
        String rcvIssueBeforeQty = "0";//ロット別品目在庫の返品前手持在庫数
        String rcvIssueQty = "0";//返品数
        String rcvIssueAterQty = "0";//ロット別品目在庫の返品後手持在庫数
        
        // [ロット別品目在庫]の検索
        List stockList = null;
        
        if (mode == 1) {
            // 登録モード
            stockList = entity.mT_LOT_STOCK.read(conn, formStruct);
        } else {
            // 削除モード
            stockList = entity.mT_LOT_STOCK.read(conn, puchOdrRtnRsltStruct);
        }
        
        if (stockList.isEmpty()) {
        	//ロット別品目在庫の返品前手持在庫数
            rcvIssueBeforeQty = "0";
            if (mode == 1) {
            	//返品数
                rcvIssueQty = Calculate.multiply(formStruct.getPUCH_RTN_QTY(), "-1");
            } else {
            	//返品数
                rcvIssueQty = puchOdrRtnRsltStruct.getPUCH_RTN_QTY();
            }
            //ロット別品目在庫の返品後手持在庫数
            rcvIssueAterQty = rcvIssueQty; 
        } else {	
            AE0120010Struct stockStruct = (AE0120010Struct)(stockList.get(0));
            //ロット別品目在庫の返品前手持在庫数
            rcvIssueBeforeQty = stockStruct.getSTOCK_ON_HAND_QTY();
            
            // 追加モード
            if (mode == 1) {
                rcvIssueQty = Calculate.multiply(formStruct.getPUCH_RTN_QTY(), "-1");
                //ロット別品目在庫の返品後手持在庫数
                rcvIssueAterQty = Calculate.subtract(
                        stockStruct.getSTOCK_ON_HAND_QTY(), formStruct.getPUCH_RTN_QTY());
            } else {
                rcvIssueQty = puchOdrRtnRsltStruct.getPUCH_RTN_QTY();
                //ロット別品目在庫の返品後手持在庫数
                rcvIssueAterQty = Calculate.add(
                        stockStruct.getSTOCK_ON_HAND_QTY(), puchOdrRtnRsltStruct.getPUCH_RTN_QTY());
            } 
        }
        
        // ロット品目在庫登録・更新処理を行う。
        BizCommon bc = new BizCommon(conn, getsysUSER_CD(), sp.getProcId(), getsysPLANT_CD());

        List updateLotStockList = bc.excUpdateLotStockFd(ctrlCd, "");

 
        if(bc.getResultStatus().intValue() == 3){
            if(updateLotStockList != null && updateLotStockList.size() > 0){
                setErrorMessage((String)updateLotStockList.get(0));
                return;
            }
        }

/*        // 計算後の ロット別品目在庫の手持在庫数がマイナスの場合、エラーメッセージ
        if (Calculate.compare(rcvIssueAterQty, "0") == -1) {
        	
            // マイナス更新の場合、または、プラス更新で「返品元保管区コード」と[購入返品実績]."返品元保管区コード"が異なる場合
            if (mode != 2 || (mode == 2 && (puchOdrRtnRsltStruct.getWH_CD().equals(formStruct.getWH_CD()) == false))) {
            	setErrorMessage("AE00168");
            	return;
            }
        }*/
    }


	// 品目在庫更新処理
	private void updateItemStock(
			IDbConnection conn, 
			AE0120010Struct formStruct, 
			AE0120010Struct puchOdrRtnRsltStruct, 
			String ctrlCd, 
			int mode) 
			throws ParseException, DataNotFoundException, SQLException, FoundationException {
		
		String rcvIssueBeforeQty = "0";
		String rcvIssueQty = "0";
		String rcvIssueAterQty = "0";
		
		// [保管区別品目在庫]の検索
		List stockList = null;
		
		if (mode == 1) {
			// 登録モード
			stockList = entity.mT_ITEM_STOCK.read(conn, formStruct);
		} else {
			// 削除モード
			stockList = entity.mT_ITEM_STOCK.read(conn, puchOdrRtnRsltStruct);
		}
		
		if (stockList.isEmpty()) {
			
			// 品目在庫追加
			rcvIssueBeforeQty = "0";
			if (mode == 1) {
				rcvIssueQty = Calculate.multiply(formStruct.getPUCH_RTN_QTY(), "-1");
			} else {
				rcvIssueQty = puchOdrRtnRsltStruct.getPUCH_RTN_QTY();
			}
			rcvIssueAterQty = rcvIssueQty;
			
			AE0120010Struct insertStruct = new AE0120010Struct();
			setStructSystemData(insertStruct);
			
			if (mode == 1) {
				insertStruct.setITEM_CD(formStruct.getITEM_CD());  // 品目番号
				insertStruct.setWH_CD(formStruct.getWH_CD());  // 返品元保管区コード
			} else {
				insertStruct.setITEM_CD(puchOdrRtnRsltStruct.getITEM_CD());  // 品目番号
				insertStruct.setWH_CD(puchOdrRtnRsltStruct.getWH_CD());  // 返品元保管区コード
			}
			insertStruct.setPLANT_CD(sysPLANT_CD);  // 工場コード
			insertStruct.setSTOCK_ON_HAND_QTY(rcvIssueAterQty);  // 品目別手持在庫数
			
			entity.mT_ITEM_STOCK.create(conn, insertStruct);
			
		} else {
			
			// 品目在庫更新
			AE0120010Struct stockStruct = (AE0120010Struct)(stockList.get(0));
			rcvIssueBeforeQty = stockStruct.getSTOCK_ON_HAND_QTY();
			
			// 追加モード
			if (mode == 1) {
				rcvIssueQty = Calculate.multiply(formStruct.getPUCH_RTN_QTY(), "-1");
				rcvIssueAterQty = Calculate.subtract(
						stockStruct.getSTOCK_ON_HAND_QTY(), formStruct.getPUCH_RTN_QTY());
			} else {
				rcvIssueQty = puchOdrRtnRsltStruct.getPUCH_RTN_QTY();
				rcvIssueAterQty = Calculate.add(
						stockStruct.getSTOCK_ON_HAND_QTY(), puchOdrRtnRsltStruct.getPUCH_RTN_QTY());
			}
			
			AE0120010Struct updateStruct = new AE0120010Struct();
			setStructSystemData(updateStruct);
			if (mode == 1) {
				updateStruct.setITEM_CD(formStruct.getITEM_CD());
				updateStruct.setWH_CD(formStruct.getWH_CD());
			} else {
				updateStruct.setITEM_CD(puchOdrRtnRsltStruct.getITEM_CD());
				updateStruct.setWH_CD(puchOdrRtnRsltStruct.getWH_CD());
			}
			updateStruct.setSTOCK_ON_HAND_QTY(rcvIssueAterQty);  // 品目別手持在庫数
			
			entity.mT_ITEM_STOCK.update(conn, updateStruct);
			
		}
		
		// 計算後の品目手持在庫数がマイナスの場合、ワーニング
		if (Calculate.compare(rcvIssueAterQty, "0") == -1) {
			// マイナス更新の場合、または、プラス更新で「返品元保管区コード」と
			// [購入返品実績]."返品元保管区コード"が異なる場合
			if (mode != 2 || (mode == 2 
					&& (puchOdrRtnRsltStruct.getWH_CD().equals(formStruct.getWH_CD()) == false))) {
				setWarningMessage("AE00154");
			}
		}
			
		// [保管区別入出庫]の追加
		addRcvIssue(conn, formStruct, puchOdrRtnRsltStruct, 
				rcvIssueBeforeQty, rcvIssueQty, rcvIssueAterQty, ctrlCd, mode);
		
	}
	
	// 製番在庫更新処理
	private void updateJobOdrCdStock(
			IDbConnection conn, 
			AE0120010Struct formStruct, 
			AE0120010Struct puchOdrRtnRsltStruct, 
			String ctrlCd, 
			int mode) 
			throws ParseException, DataNotFoundException, SQLException, FoundationException {
		
		String rcvIssueBeforeQty = "0";
		String rcvIssueQty = "0";
		String rcvIssueAterQty = "0";
		
		// [保管区別製番在庫]の検索
		
		List stockList = null;
		if (mode == 1) {
			stockList = entity.mT_JOB_ODR_CD_STOCK.read(conn, formStruct);
		} else {
			stockList = entity.mT_JOB_ODR_CD_STOCK.read(conn, puchOdrRtnRsltStruct);
		}
		
		if (stockList.isEmpty()) {
			// 製番在庫追加
			rcvIssueBeforeQty = "0";
			if (mode == 1) {
				rcvIssueQty = Calculate.multiply(formStruct.getPUCH_RTN_QTY(), "-1");
			} else {
				rcvIssueQty = puchOdrRtnRsltStruct.getPUCH_RTN_QTY();
			}
			rcvIssueAterQty = rcvIssueQty;
			
			AE0120010Struct insertStruct = new AE0120010Struct();
			setStructSystemData(insertStruct);
			
			if (mode == 1) {
				insertStruct.setJOB_ODR_CD(formStruct.getJOB_ODR_CD());  // 製番
				insertStruct.setITEM_CD(formStruct.getITEM_CD());  // 品目番号
				insertStruct.setWH_CD(formStruct.getWH_CD());  // 返品元保管区コード
			} else {
				insertStruct.setJOB_ODR_CD(puchOdrRtnRsltStruct.getJOB_ODR_CD());  // 製番
				insertStruct.setITEM_CD(puchOdrRtnRsltStruct.getITEM_CD());  // 品目番号
				insertStruct.setWH_CD(puchOdrRtnRsltStruct.getWH_CD());  // 返品元保管区コード
			}
			insertStruct.setPLANT_CD(sysPLANT_CD);  // 工場コード
			insertStruct.setSTOCK_ON_HAND_QTY(rcvIssueAterQty);  // 製番別手持在庫数
			
			entity.mT_JOB_ODR_CD_STOCK.create(conn, insertStruct);
			
		} else {
			
			// 製番在庫更新
			AE0120010Struct stockStruct = (AE0120010Struct)(stockList.get(0));
			rcvIssueBeforeQty = stockStruct.getSTOCK_ON_HAND_QTY();
			if (mode == 1) {
				rcvIssueQty = Calculate.multiply(formStruct.getPUCH_RTN_QTY(), "-1");
				rcvIssueAterQty = Calculate.subtract(
						stockStruct.getSTOCK_ON_HAND_QTY(), formStruct.getPUCH_RTN_QTY());
			} else {
				rcvIssueQty = puchOdrRtnRsltStruct.getPUCH_RTN_QTY();
				rcvIssueAterQty = Calculate.add(
						stockStruct.getSTOCK_ON_HAND_QTY(), puchOdrRtnRsltStruct.getPUCH_RTN_QTY());
			}
			
			AE0120010Struct updateStruct = new AE0120010Struct();
			setStructSystemData(updateStruct);
			
			if (mode == 1) {
				updateStruct.setJOB_ODR_CD(formStruct.getJOB_ODR_CD());  // 製番
				updateStruct.setITEM_CD(formStruct.getITEM_CD());  // 品目番号
				updateStruct.setWH_CD(formStruct.getWH_CD());  // 返品元保管区コード
			} else {
				updateStruct.setJOB_ODR_CD(puchOdrRtnRsltStruct.getJOB_ODR_CD());  // 製番
				updateStruct.setITEM_CD(puchOdrRtnRsltStruct.getITEM_CD());  // 品目番号
				updateStruct.setWH_CD(puchOdrRtnRsltStruct.getWH_CD());  // 返品元保管区コード
			}
			
			updateStruct.setSTOCK_ON_HAND_QTY(rcvIssueAterQty);  // 製番別手持在庫数
			
			entity.mT_JOB_ODR_CD_STOCK.update(conn, updateStruct);
		}
		
		// 計算後の品目手持在庫数がマイナスの場合、ワーニング
		if (Calculate.compare(rcvIssueAterQty, "0") == -1) {
			// マイナス更新の場合、または、プラス更新で「返品元保管区コード」と
			// [購入返品実績]."返品元保管区コード"が異なる場合
			if (mode != 2 || (mode == 2 
					&& (puchOdrRtnRsltStruct.getWH_CD().equals(formStruct.getWH_CD()) == false))) {
				setWarningMessage("AE00154");
			}
		}
		
		// [保管区別入出庫]の追加
		addRcvIssue(conn, formStruct, puchOdrRtnRsltStruct, 
				rcvIssueBeforeQty, rcvIssueQty, rcvIssueAterQty, ctrlCd, mode);
				
	}
	
	// 在庫更新処理
	private void updateStock(
			IDbConnection conn, 
			AE0120010Struct formStruct, 
			AE0120010Struct puchOdrRtnRsltStruct, 
			int mode) 
			throws ParseException, DataNotFoundException, SQLException, FoundationException, 
					ExpjException {
		
		String rcvIssueBeforeQty = "0";
		String rcvIssueQty = "0";
		String rcvIssueAterQty = "0";
		
		// 入出庫管理番号採番
		String ctrlCd = null;
		Numbering numbering = new Numbering(
								conn,
								Numbering.ISSUE_CD, 
								getsysUSER_CD(), 
								this.sp.getProcId(), 
								sysPLANT_CD);
		try {
			ctrlCd = numbering.getNo();
			if (ctrlCd == null) {
				ExpjMessage emsg = new ExpjMessage("AE00152");
				throw new FoundationException(
								"AE0120010Control",
								"controlInsert()",
								emsg.getMessage(CoreTools.getLocale(this.getsysUSER_CD())));
			}
		} catch(FoundationException ex) {
			// 登録処理失敗：入出庫管理番号（出庫）の採番に失敗しました
			setErrorMessage("AE00152");
			ExpjMessage emsg = new ExpjMessage("ZZ01106");
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(ex, emsg);
			throw ee;
		}
		
		if (formStruct.getJOB_ODR_CD() == null || "".equals(formStruct.getJOB_ODR_CD())) {
			// 品目在庫更新
			updateItemStock(conn, formStruct, puchOdrRtnRsltStruct, ctrlCd, mode);
			
			// 品目存在チェック
			AE0120010Struct itemStruct = null;
			List itemList = entity.mM_ITEM.read(conn, struct);
			//「品目番号」がNullではないの場合
			if ("".equals(struct.getITEM_CD()) == false) {
				if (itemList.isEmpty()) {
					// エラー
					setErrorMessage("AE00118");
					setErrorParameter("M_ITEM", "ITEM_CD", struct.getITEM_CD());
				} else {
					itemStruct = (AE0120010Struct) (itemList.get(0));
				}
			}
			if("true".equals(lotCtrl) && "1".equals(itemStruct.getLOT_CTRL_FLG())){
		        //ロット品目在庫登録・更新処理を行う。
		        addLotStock(conn, formStruct, puchOdrRtnRsltStruct, ctrlCd, mode);
				// エラーがあれば終了
				if (msgStruct.hasError()) {
					return;
				}
			}
		} else {
			// 製番在庫更新
			updateJobOdrCdStock(conn, formStruct, puchOdrRtnRsltStruct, ctrlCd, mode);
		}

	}
	
	// [購入返品実績]の更新
	private void updatePuchOdrRtnRslt(IDbConnection conn, AE0120010Struct s, 
			AE0120010Struct puchOdrRtnRsltStruct, 
			String puchOdrCd, int mode) 
			throws ParseException, DataNotFoundException, SQLException, FoundationException, 
					ExpjException {
		
		if (mode == 1 || mode == 2) {
			
			// [購入返品実績]の追加
			// 追加内容設定
			AE0120010Struct updateStruct = new AE0120010Struct();
			setStructSystemData(updateStruct);
			
			updateStruct.setPUCH_ODR_CD(puchOdrCd);  // 発注番号
			if (mode == 1) {
				updateStruct.setCOMPANY_CD(_myCompanyStruct.getCOMPANY_CD());  // 会社コード
				updateStruct.setVEND_CD(s.getVEND_CD());  // 取引先コード
				updateStruct.setPLANT_CD(sysPLANT_CD);  // 工場コード
				updateStruct.setITEM_CD(s.getITEM_CD());  // 品目番号
				updateStruct.setJOB_ODR_CD(s.getJOB_ODR_CD());  // 製番
				updateStruct.setJOB_ODR_DETAIL_NO("0");  // 製番枝番
			} else {
				updateStruct.setCOMPANY_CD(puchOdrRtnRsltStruct.getCOMPANY_CD());  // 会社コード
				updateStruct.setVEND_CD(puchOdrRtnRsltStruct.getVEND_CD());  // 取引先コード
				updateStruct.setPLANT_CD(puchOdrRtnRsltStruct.getPLANT_CD());  // 工場コード
				updateStruct.setITEM_CD(puchOdrRtnRsltStruct.getITEM_CD());  // 品目番号
				updateStruct.setJOB_ODR_CD(puchOdrRtnRsltStruct.getJOB_ODR_CD());  // 製番
				updateStruct.setJOB_ODR_DETAIL_NO(puchOdrRtnRsltStruct.getJOB_ODR_DETAIL_NO());  // 製番枝番
				updateStruct.setINV_CTRL_FLG(puchOdrRtnRsltStruct.getINV_CTRL_FLG());  // 在庫管理フラグ
			}
			if ("true".equals(s.getc_NON_NO_ITEM_FLG())) {
				updateStruct.setINV_CTRL_FLG("0");  // 在庫管理フラグ
				updateStruct.setNON_NO_ITEM_NAME(s.getITEM_NAME());//備品品目名
				updateStruct.setNON_NO_ITEM_TYP(s.getPRODUCT_TYP());//備品製品区分
				updateStruct.setNON_NO_ITEM_PUCH_ODR_UNIT(s.getSTOCK_UNIT());//備品単位
			} else {
				updateStruct.setINV_CTRL_FLG("1");  // 在庫管理フラグ
				updateStruct.setNON_NO_ITEM_NAME(null);//備品品目名
				updateStruct.setNON_NO_ITEM_TYP(null);//備品製品区分
				updateStruct.setNON_NO_ITEM_PUCH_ODR_UNIT(null);//備品単位
			}
			updateStruct.setPUCH_ODR_PERSON(s.getPUCH_ODR_PERSON());  // 発注担当者コード
			updateStruct.setPUCH_RTN_DATE(s.getPUCH_RTN_DATE());  // 返品日
			updateStruct.setPUCH_RTN_QTY(s.getPUCH_RTN_QTY());  // 返品数
			updateStruct.setWH_CD(s.getWH_CD());  // 返品元保管区コード
			updateStruct.setVEND_LOT_NO(s.getVEND_LOT_NO());  // メーカロット番号
			updateStruct.setLOT_NO(s.getLOT_NO());  // 在庫ロット番号
			updateStruct.setUNIT_COST_TYP(s.getUNIT_COST_TYP());  // 単価区分
			updateStruct.setUNIT_COST(s.getUNIT_COST());  // 単価
			updateStruct.setPROCESSING_COST(s.getPROCESSING_COST());  // 加工費
			updateStruct.setMATERIAL_COST(s.getMATERIAL_COST());  // 材料費
			updateStruct.setOTHER_OVERHEADS(s.getOTHER_OVERHEADS());  // その他経費
			updateStruct.setPUCH_RTN_COMMENT(s.getPUCH_RTN_COMMENT());  // 返品理由コード
			updateStruct.setRATE_JUDGE_DATE(s.getPUCH_RTN_DATE());  // レート判定日
			updateStruct.setEXCH_RATE(s.getEXCH_RATE());  // 為替レート
			updateStruct.setRTN_DEL_FLG("0");  // 返品取消フラグ
			String lowerTaxCd = null;
			try {
				// [消費税区分]情報を取得		
				/*TaxStruct ts =
				TaxControl.getData(
						conn,
						_myCompanyStruct.getCOMPANY_CD(),
						s.getVEND_CD(),
						s.getITEM_CD(),
						s.getPUCH_RTN_DATE());*/
				
				// [消費税区分]情報を取得
				TaxStruct ts =
				TaxControl.getDataTax(
						conn,
						_myCompanyStruct.getCOMPANY_CD(),
						s.getVEND_CD(),
						s.getITEM_CD(),
						s.getPUCH_RTN_DATE(),
						s.getTAX_CD());
				
				// [通貨]情報を取得
				CurStruct cs = 
						CurControl.getData(conn, _myCompanyStruct.getCOMPANY_CD(), s.getVEND_CD());
				
				updateStruct.setTAX_CD(ts.getTAX_CD());
				lowerTaxCd = ts.getTAX_CD().substring(ts.getTAX_CD().length() - 1);
/*
				if (lowerTaxCd.equals("1")) {
*/
					updateStruct.setTAX_RATE_1(ts.getTAX_RATE_1());
					updateStruct.setTAX_RATE_2(ts.getTAX_RATE_2());
					updateStruct.setTAX_RATE_3(ts.getTAX_RATE_3());
/*
				} else {
					updateStruct.setTAX_RATE_1("0.0");
					updateStruct.setTAX_RATE_2("0.0");
					updateStruct.setTAX_RATE_3("0.0");
				}
*/
				updateStruct.setTAX_ROUND_TYP(ts.getTAX_ROUND_TYP());
				updateStruct.setROUND_TYP(cs.getROUND_TYP());
				updateStruct.setVEND_DECIMAL_FIG(cs.getDECIMAL_FIG());
			} catch (DataNotFoundException e) {
				setErrorMessage(e.getCode());
				return;
			}
			
			String netAmount = null;
			int figure = Integer.parseInt(updateStruct.getVEND_DECIMAL_FIG());
			if ("1".equals(updateStruct.getROUND_TYP())) {
				// 四捨五入
				netAmount = Calculate.round(struct.getNET_AMOUNT(), figure);
			} else if ("2".equals(updateStruct.getROUND_TYP())) {
				// 切り上げ
				netAmount = Calculate.ceil(struct.getNET_AMOUNT(), figure);
			} else if ("3".equals(updateStruct.getROUND_TYP())) {
				// 切捨て
				netAmount = Calculate.floor(struct.getNET_AMOUNT(), figure);
			}
			updateStruct.setNET_AMOUNT(netAmount);  // 本体金額
			
			// ｢発注金額｣の計算
			String puchOdrAmount =
					AmountCalculator.calcPuchOdrAmount(
							s.getPUCH_RTN_QTY(),
							s.getUNIT_COST(),
							updateStruct.getROUND_TYP(),
							updateStruct.getVEND_DECIMAL_FIG());
			updateStruct.setPUCH_ODR_AMOUNT(puchOdrAmount);
            if(!com.nec.jp.orteus.expj.util.Calculate.isNotInNumRange(puchOdrAmount)){
                // 多言語項目取得セット
               String ErrInfo = CoreTools.getRBString("Expj.PUCH_ODR_AMOUNT_3", resource);
           	   setErrorMessage("AA00215",ErrInfo);
           	   return;
             }
			
			// ｢値引金額｣の計算
			String discAmount =
					AmountCalculator.calcDiscAmount(
							updateStruct.getPUCH_ODR_AMOUNT(),
							updateStruct.getNET_AMOUNT());
			updateStruct.setDISC_AMOUNT(discAmount);
			
            //内税の場合に税額を計算する			
     		if (!"1".equals(lowerTaxCd)) {
    			//バッチパラメータ呼出
    			List batList = entity.mSYS_BAT_PARM.read(conn, struct);
    			if(!batList.isEmpty()){
    				//税計算部品をコール
    				AE0120010Struct batStruct = (AE0120010Struct)batList.get(0);
    				updateStruct.setPVC2LOGMODE(batStruct.getPVC2LOGMODE());
    				updateStruct.setPVC2OUTPUTMODE(batStruct.getPVC2OUTPUTMODE());
    				updateStruct.setPVC2OUTPUTPATH(batStruct.getPVC2OUTPUTPATH());
    				updateStruct.setPVC2OUTPUTNAME(batStruct.getPVC2OUTPUTNAME());
    				updateStruct.setPVC2USERID(this.sysUSER_CD);
    				updateStruct.setPVC2BUSINESSNAME(batStruct.getPVC2BUSINESSNAME());
    				updateStruct.setPVC2PLANTCD(this.sysPLANT_CD);
    				updateStruct.setPVC2TAXID("5");
    				batList = entity.mcallSQLCALCTAXCALCAMT.call(conn, updateStruct);
    				batStruct = (AE0120010Struct)batList.get(0);
    				if(!"1".equals(batStruct.getPNUMSTATUS())){
    					setErrorMessage(batStruct.getPVC2ERRCD());
    					return;      				       				
    				}
    				updateStruct.setTAX_AMOUNT_1(batStruct.getTAX_AMOUNT_1());
    				updateStruct.setTAX_AMOUNT_2(batStruct.getTAX_AMOUNT_2());
    				updateStruct.setTAX_AMOUNT_3(batStruct.getTAX_AMOUNT_3());
    				updateStruct.setAMOUNT_INCLUDE_TAX(batStruct.getAMOUNT_INCLUDE_TAX());   				
    			}else{
    				setErrorMessage("ZZ09007");   
    				return;
    			}
         	}else{
				// ｢税額1｣の計算
				String taxAmount1 =
						AmountCalculator.calcTaxAmount(
								updateStruct.getNET_AMOUNT(),
								updateStruct.getTAX_RATE_1(),
								updateStruct.getTAX_ROUND_TYP(),
								updateStruct.getVEND_DECIMAL_FIG());
				updateStruct.setTAX_AMOUNT_1(taxAmount1);
				
				// ｢税額2｣の計算
				String taxAmount2 =
						AmountCalculator.calcTaxAmount(
								updateStruct.getNET_AMOUNT(),
								updateStruct.getTAX_RATE_2(),
								updateStruct.getTAX_ROUND_TYP(),
								updateStruct.getVEND_DECIMAL_FIG());
				updateStruct.setTAX_AMOUNT_2(taxAmount2);
				
				// ｢税額3｣の計算
				String taxAmount3 =
						AmountCalculator.calcTaxAmount(
								updateStruct.getNET_AMOUNT(),
								updateStruct.getTAX_RATE_3(),
								updateStruct.getTAX_ROUND_TYP(),
								updateStruct.getVEND_DECIMAL_FIG());
				updateStruct.setTAX_AMOUNT_3(taxAmount3);
				
				// ｢税込金額｣の計算
				String amountIncludeTax =
						AmountCalculator.calcAmountIncludeTax(
								updateStruct.getNET_AMOUNT(),
								updateStruct.getTAX_AMOUNT_1(),
								updateStruct.getTAX_AMOUNT_2(),
								updateStruct.getTAX_AMOUNT_3());
				updateStruct.setAMOUNT_INCLUDE_TAX(amountIncludeTax);
                if(!com.nec.jp.orteus.expj.util.Calculate.isNotInNumRange(amountIncludeTax)){
                    // 多言語項目取得セット
                   String ErrInfo = CoreTools.getRBString("Expj.AMOUNT_INCLUDE_TAX", resource);
               	   setErrorMessage("AA00215",ErrInfo);
               	   return;
                 }
         	}
			
			// ｢邦貨金額｣の計算
			String homeCurAmount =
					AmountCalculator.calcHomeCurAmount(
							updateStruct.getAMOUNT_INCLUDE_TAX(),
							s.getEXCH_RATE(),
							updateStruct.getROUND_TYP(),
							_homeCurStruct.getDECIMAL_FIG());
			updateStruct.setHOME_CUR_AMOUNT(homeCurAmount);
            if(!com.nec.jp.orteus.expj.util.Calculate.isNotInNumRange(homeCurAmount)){
                // 多言語項目取得セット
               String ErrInfo = CoreTools.getRBString("Expj.HOME_CUR_AMOUNT", resource);
          	   setErrorMessage("AA00215",ErrInfo);
          	   return;
             }
			
			updateStruct.setRTN_DEL_DATE("");
			
			if (mode == 1) {
				entity.mT_PUCH_ODR_RTN_RSLT.create(conn, updateStruct);
			} else {
				entity.mT_PUCH_ODR_RTN_RSLT.update(conn, updateStruct);
			}
			
		} else if (mode == 3) {
			// 削除（論理削除）
			AE0120010Struct updateStruct = new AE0120010Struct();
			setStructSystemData(updateStruct);
			updateStruct.setPUCH_ODR_CD(puchOdrCd);
			updateStruct.setPUCH_RTN_COMMENT(s.getPUCH_RTN_COMMENT());
			updateStruct.setRTN_DEL_FLG("1");
			
			// 業務運用日取得
			DateCtrlStruct dcs = DateCtrlControl.getData(conn, sysPLANT_CD);
			updateStruct.setRTN_DEL_DATE(dcs.getBUSINESS_OPR_DATE());
			
			entity.mupdateT_PUCH_ODR_RTN_RSLT.update(conn, updateStruct);
		}
	}
	
	// [検収履歴]、[検収実績情報IF]の追加
	private void updatePastInspcAcptIF(
			IDbConnection conn, 
			AE0120010Struct formStruct, 
			AE0120010Struct puchOdrRtnRsltStruct, 
			AE0120010Struct itemStruct, 
			String puchOdrCd, 
			int mode) 
			throws ParseException, DataNotFoundException, SQLException, FoundationException, 
					ExpjException {
		
		AE0120010Struct pastInspcAcptStruct = null;
		//伝票番号
		String slipCd = null;
			
		if (mode == 1 || mode == 3) {
			
			// 登録 赤
			
			// [検収履歴]の追加
			
			String inspcAcptNo = null;  // 検収番号
			String crctNo = null;  // 訂正回数
			if (mode == 3) {
				List pastInspcAcptList = entity.mT_PAST_INSPC_ACPT.read(conn, formStruct);
				if (pastInspcAcptList.isEmpty()) {
					// エラー
					setErrorMessage("ZZ06001");
					setErrorParameter("T_PAST_INSPC_ACPT", "PUCH_ODR_CD", formStruct.getPUCH_ODR_CD());
					setErrorParameter("T_PAST_INSPC_ACPT", "ACPT_NO", "0");
					return;
				}
				
				pastInspcAcptStruct = (AE0120010Struct)(pastInspcAcptList.get(0));
				inspcAcptNo = Calculate.add(pastInspcAcptStruct.getINSPC_ACPT_NO(), "1");  // 検収番号
				crctNo = Calculate.add(pastInspcAcptStruct.getCRCT_NO(), "1");  // 訂正回数
			}
			
			// 追加内容設定
			pastInspcAcptStruct = new AE0120010Struct();
			setStructSystemData(pastInspcAcptStruct);
			
			pastInspcAcptStruct.setPUCH_ODR_CD(puchOdrCd);  // 発注番号
			pastInspcAcptStruct.setACPT_NO("0");  // 受入回数
			if (mode == 1) {
				pastInspcAcptStruct.setINSPC_ACPT_NO("1");  // 検収番号
				pastInspcAcptStruct.setCRCT_NO("0");  // 訂正回数
			} else if (mode == 3) {
				pastInspcAcptStruct.setINSPC_ACPT_NO(inspcAcptNo);  // 検収番号
				pastInspcAcptStruct.setCRCT_NO(crctNo);  // 訂正回数
			}
			pastInspcAcptStruct.setINSPC_ACPT_GNR_TYP("3");  // 検収発生区分
			pastInspcAcptStruct.setCRCT_NO("0");  // 訂正回数
			pastInspcAcptStruct.setCRCT_TYP("1");  // 訂正区分
			pastInspcAcptStruct.setITEM_CD(formStruct.getITEM_CD());  // 品目番号
			
			if ("true".equals(formStruct.getc_NON_NO_ITEM_FLG()) == false) {
				pastInspcAcptStruct.setITEM_NAME(itemStruct.getITEM_NAME()); // 品目名
				pastInspcAcptStruct.setSTOCK_UNIT(itemStruct.getSTOCK_UNIT());  // 計量単位
				pastInspcAcptStruct.setPRODUCT_TYP(itemStruct.getPRODUCT_TYP());  // 製品区分
			} else {
				pastInspcAcptStruct.setITEM_NAME(formStruct.getITEM_NAME()); // 品目名
				pastInspcAcptStruct.setSTOCK_UNIT(formStruct.getSTOCK_UNIT());  // 計量単位
				pastInspcAcptStruct.setPRODUCT_TYP(formStruct.getPRODUCT_TYP());  // 製品区分
			}
			
			pastInspcAcptStruct.setSLIP_TYP("79");  // 伝票種類
			pastInspcAcptStruct.setCOMPANY_CD(_myCompanyStruct.getCOMPANY_CD());  // 会社コード
			pastInspcAcptStruct.setVEND_CD(formStruct.getVEND_CD());  // 取引先コード
			pastInspcAcptStruct.setPLANT_CD(sysPLANT_CD);  // 工場コード
			pastInspcAcptStruct.setUNIT_COST(formStruct.getUNIT_COST());  // 単価
			pastInspcAcptStruct.setUNIT_COST_TYP(formStruct.getUNIT_COST_TYP());  // 単価区分
			pastInspcAcptStruct.setPROCESSING_COST(
					Calculate.multiply(formStruct.getPROCESSING_COST(), "-1"));  // 加工費
			pastInspcAcptStruct.setMATERIAL_COST(
					Calculate.multiply(formStruct.getMATERIAL_COST(), "-1"));  // 材料費
			pastInspcAcptStruct.setOTHER_OVERHEADS(
					Calculate.multiply(formStruct.getOTHER_OVERHEADS(), "-1"));  // その他経費
			pastInspcAcptStruct.setACPT_QTY(
					Calculate.multiply(formStruct.getPUCH_RTN_QTY(), "-1"));  // 受入数
			pastInspcAcptStruct.setINSPC_ACPT_QTY(
					Calculate.multiply(formStruct.getPUCH_RTN_QTY(), "-1"));  // 検収数
			
			pastInspcAcptStruct.setINSPC_ACPT_AMOUNT(
					Calculate.multiply(formStruct.getPUCH_ODR_AMOUNT(), "-1"));  // 検収金額
			pastInspcAcptStruct.setSAVING_AMOUNT(
					Calculate.multiply(formStruct.getDISC_AMOUNT(), "-1"));  // 値引金額
			pastInspcAcptStruct.setACPT_DATE(formStruct.getPUCH_RTN_DATE());  // 受入日
			pastInspcAcptStruct.setINSPC_ACPT_DATE(formStruct.getPUCH_RTN_DATE());  // 検収日
			
			//採番共通部品
			ArApNumbering arapnumbering_common = new ArApNumbering( conn, sysUSER_CD, sp.getProcId(),sysPLANT_CD, struct.getCOMPANY_CD(),
																	actionTyp, slipTyp, formStruct.getPUCH_RTN_DATE());
			//伝票番号
			slipCd = arapnumbering_common.getSlipCd();
			if (slipCd == null || "".equals(slipCd)) {
				// エラー
				setErrorMessage("BZ00180");
				return;
			}
			pastInspcAcptStruct.setSLIP_CD(slipCd);  // 伝票番号
			pastInspcAcptStruct.setORGN_SLIP_CD(null);  // 元伝票番号
			pastInspcAcptStruct.setEXCH_RATE(struct.getEXCH_RATE());  // 為替レート
			
			entity.mT_PAST_INSPC_ACPT.create(conn, pastInspcAcptStruct);
			
		} else if (mode == 2 || mode == 4) {
			
			// 更新　黒
			// 削除 黒データ
			// 検収履歴、検収実績情報インターフェースの追加
			List pastInspcAcptList = entity.mT_PAST_INSPC_ACPT.read(conn, formStruct);
			if (pastInspcAcptList.isEmpty()) {
				// エラー
				setErrorMessage("ZZ06001");
				setErrorParameter("T_PAST_INSPC_ACPT", "PUCH_ODR_CD", formStruct.getPUCH_ODR_CD());
				setErrorParameter("T_PAST_INSPC_ACPT", "ACPT_NO", "0");
				return;
			}
			
			pastInspcAcptStruct = (AE0120010Struct)(pastInspcAcptList.get(0));
			setStructSystemData(pastInspcAcptStruct);
			// 追加内容設定
			pastInspcAcptStruct.setINSPC_ACPT_NO(
					Calculate.add(pastInspcAcptStruct.getINSPC_ACPT_NO(), "1"));  // 検収番号
			
			pastInspcAcptStruct.setINSPC_ACPT_GNR_TYP("3");  // 検収発生区分
			pastInspcAcptStruct.setCRCT_TYP("2");  // 訂正区分
			
			pastInspcAcptStruct.setPROCESSING_COST(
					Calculate.multiply(pastInspcAcptStruct.getPROCESSING_COST(), "-1"));  // 加工費
			pastInspcAcptStruct.setMATERIAL_COST(
					Calculate.multiply(pastInspcAcptStruct.getMATERIAL_COST(), "-1"));  // 材料費
			pastInspcAcptStruct.setOTHER_OVERHEADS(
					Calculate.multiply(pastInspcAcptStruct.getOTHER_OVERHEADS(), "-1"));  // その他経費
			pastInspcAcptStruct.setACPT_QTY(
					Calculate.multiply(pastInspcAcptStruct.getACPT_QTY(), "-1"));  // 受入数
			pastInspcAcptStruct.setINSPC_ACPT_QTY(
					Calculate.multiply(pastInspcAcptStruct.getINSPC_ACPT_QTY(), "-1"));  // 検収数
			pastInspcAcptStruct.setINSPC_ACPT_AMOUNT(
					Calculate.multiply(pastInspcAcptStruct.getINSPC_ACPT_AMOUNT(), "-1"));  // 検収金額
			pastInspcAcptStruct.setSAVING_AMOUNT(
					Calculate.multiply(pastInspcAcptStruct.getSAVING_AMOUNT(), "-1"));  // 値引金額
			pastInspcAcptStruct.setACPT_DATE(pastInspcAcptStruct.getACPT_DATE());  // 受入日
			
			//採番共通部品
			ArApNumbering arapnumbering_common = new ArApNumbering( conn, sysUSER_CD, sp.getProcId(),sysPLANT_CD, struct.getCOMPANY_CD(),
																	actionTyp, slipTyp, pastInspcAcptStruct.getINSPC_ACPT_DATE());
			//伝票番号
			slipCd = arapnumbering_common.getSlipCd();
			if (slipCd == null || "".equals(slipCd)) {
				// エラー
				setErrorMessage("BZ00180");
				return;
			}
			
			pastInspcAcptStruct.setINSPC_ACPT_DATE(pastInspcAcptStruct.getINSPC_ACPT_DATE());  // 検収日
			
			pastInspcAcptStruct.setORGN_SLIP_CD(pastInspcAcptStruct.getSLIP_CD());  // 元伝票番号
			pastInspcAcptStruct.setSLIP_CD(slipCd);  // 伝票番号
			
			// [検収履歴]追加
			entity.mT_PAST_INSPC_ACPT.create(conn, pastInspcAcptStruct);
			
		}
			
		// [検収実績情報インターフェース]追加
		addInspcAcptIF(conn, formStruct, puchOdrRtnRsltStruct, itemStruct, pastInspcAcptStruct, mode);
	}
	
	// [検収実績情報インターフェース]の追加
	private void addInspcAcptIF(
			IDbConnection conn, 
			AE0120010Struct formStruct, 
			AE0120010Struct puchOdrRtnRsltStruct, 
			AE0120010Struct itemStruct, 
			AE0120010Struct pastInspcAcptStruct,
			int mode) 
			throws ParseException, DataNotFoundException, SQLException, FoundationException,
					ExpjException {
		
		pastInspcAcptStruct.setGNR_ORG_CD(sysPLANT_CD);  // 発生部門コード
		pastInspcAcptStruct.setSBCNT_PUCH_TYP("0");  // 外注購入品区分
		if (mode == 1 || mode == 3) {
			pastInspcAcptStruct.setJOB_ODR_CD(formStruct.getJOB_ODR_CD());  // 製番
			pastInspcAcptStruct.setJOB_ODR_DETAIL_NO("0");  // 製番枝番
		} else {
			pastInspcAcptStruct.setJOB_ODR_CD(puchOdrRtnRsltStruct.getJOB_ODR_CD());  // 製番
			pastInspcAcptStruct.setJOB_ODR_DETAIL_NO(
					puchOdrRtnRsltStruct.getJOB_ODR_DETAIL_NO());  // 製番枝番
		}
		if ("true".equals(formStruct.getc_NON_NO_ITEM_FLG())) {
			pastInspcAcptStruct.setCLASIFICATION_CD("");  // 管理コード
			pastInspcAcptStruct.setINV_CTRL_FLG("0");  // 在庫管理フラグ
		} else {
			pastInspcAcptStruct.setCLASIFICATION_CD(itemStruct.getCLASIFICATION_CD());  // 管理コード
			pastInspcAcptStruct.setINV_CTRL_FLG("1");  // 在庫管理フラグ
		}
		pastInspcAcptStruct.setPUCH_RTN_FLG("1");  // 購入返品フラグ
		pastInspcAcptStruct.setDISC_AMOUNT(pastInspcAcptStruct.getSAVING_AMOUNT());  // 値引金額

        //システムパラメータ(承認)チェック
	  	if(blnchkInspcIf() == true){
	  		pastInspcAcptStruct.setAPPR_FLG("1");
	  		pastInspcAcptStruct.setAPPR_ID(null);
	  		pastInspcAcptStruct.setAPPR_DATE(null);
	  	}else{
			// 業務運用日取得
			DateCtrlStruct dcs = DateCtrlControl.getData(conn, sysPLANT_CD);
	  		pastInspcAcptStruct.setAPPR_FLG("3");
	  		pastInspcAcptStruct.setAPPR_ID(getsysUSER_CD());
	  		pastInspcAcptStruct.setAPPR_DATE(dcs.getBUSINESS_OPR_DATE());
	  	}	 
		entity.mT_INSPC_ACPT_IF.create(conn, pastInspcAcptStruct);
	}
	
	/**
	 * システムパラメータ取得
	 */
	private boolean getSysParameter() throws BusinessProcessException, FoundationException {
		boolean b = true;
		try {
			List sysParameterList = entity.mSELECT_SYS_PARAMETER.read(conn, struct);
			if(sysParameterList == null || sysParameterList.isEmpty()) return b;
			AE0120010Struct sysParameterStruct = (AE0120010Struct) sysParameterList.get(0);
			if(null != sysParameterStruct.getPAST_RESULT_ENTRY_TYP() && !"".equals(sysParameterStruct.getPAST_RESULT_ENTRY_TYP())){
				if("false".equals(sysParameterStruct.getPAST_RESULT_ENTRY_TYP())){
					b = false;
				}
			}
		}catch(Exception e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			throw new ExpjException(e, emsg);
		}
		return b;
	}
	
    /**
     * システムパラメータチェック       
     * @throws SQLException 処理失敗
     * @throws ExpjException 処理失敗
   * @throws FoundationException 
     */
    private boolean blnchkInspcIf()
    throws SQLException, ExpjException, FoundationException {
  	  
 	           /** パラメータ「検収承認」を取得*/
 	           privateConfig = new PrivateConfig(conn);
 	           aprInspcif = privateConfig.getString("APR_INSPC_IF");
 	           // パラメータ「検収承認」が取得できなかった場合
 	          if(aprInspcif == null || "".equals(aprInspcif)){
  				String locale = CoreTools.getLocale(struct.getsUser_ID());
  				ResourceBundle messages = CoreTools.getResourceBundle("ExpjMessage", locale);
  				setErrorMessage("AZ00041", messages.getString("AZ00072"));
  				aprInspcif = "0";
 	            	return false;
 	          }else if(!"1".equals(aprInspcif)){   	        	  
 				  // １以外の場合
 	        	  return false;
 	          }else{
 	        	  // １の場合
 	        	 return true;
 	          }     	  
    }
	/**
	 * 実際原価管理パラメータの対象年月日取得
	 */
	private BigDecimal getProcExecDate() throws BusinessProcessException, FoundationException {
		BigDecimal bd = null;
		try {
			struct.setPLANT_CD(getsysPLANT_CD());
			List procExecDateList = entity.mSELECT_SYS_ACTUAL_COST_CTRL_AC.read(conn, struct);
			if(procExecDateList == null || procExecDateList.isEmpty()) return null;
			AE0120010Struct procExecDateStruct = (AE0120010Struct) procExecDateList.get(0);
			bd = procExecDateStruct.getPROC_EXEC_DATE();
			struct.setPROC_EXEC_DATE(bd);
		}catch(Exception e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			throw new ExpjException(e, emsg);
		}
		return bd;
	}
	
	
  // 実際原価の締めが完了している日付では入力できません
	private String ProcExecDateError = "AE00160";
	
	/**
	 * 対象年月日と入力年月日の比較
	 * 実際原価の締めが完了している日付での実績の登録を不可とする
	 * 実際原価の締めが完了している日付けの実績情報の修正を不可とする
	 * @param  doType      登録（'1'）また更新（'2'）また削除（'3'）
	 * @param  selOutDate  更新前入力年月日
	 * @param  inputDate 　更新後入力年月日
	 * @return boolean 　  チェック返す値
	 */
	private boolean chkProcExecDate(String doType,String selOutDate,String inputDate) throws BusinessProcessException, FoundationException {
		boolean b = true;
		
		// 実際原価管理パラメータの対象年月日
		BigDecimal ProcExecDate = getProcExecDate();
		if(null == ProcExecDate) return b;
		ProcExecDateError = "AE00160";
		
		// 登録の場合
		if("1".equals(doType)){
			// 画面入力年月日
			BigDecimal input = new BigDecimal(inputDate.substring(0,4) + inputDate.substring(5,7));
			b = compDecimal(input,ProcExecDate);
			
		}
		// 更新の場合
		if("2".equals(doType)){
			
			// 更新前入力年月日
			BigDecimal selOut = new BigDecimal(selOutDate.substring(0,4) + selOutDate.substring(5,7));
			// 更新後入力年月日
			BigDecimal input = new BigDecimal(inputDate.substring(0,4) + inputDate.substring(5,7));
			// 読込んだ実績情報の日付の比較
			b = compDecimal(selOut,ProcExecDate);
			if(b == false){
				// 実際原価の締めが完了している日付けの実績情報は修正できません
				ProcExecDateError = "AE00161";
				return b;
			}
			// 入力の日付の比較
			b = compDecimal(input,ProcExecDate);
			
		}
		// 削除の場合
		if("3".equals(doType)){
			// 更新前入力年月日
			BigDecimal selOut = new BigDecimal(selOutDate.substring(0,4) + selOutDate.substring(5,7));
			// 読込んだ実績情報の日付の比較
			b = compDecimal(selOut,ProcExecDate);
			// 実際原価の締めが完了している日付けの実績情報は修正できません
			ProcExecDateError = "AE00161";
			
		}
		
		return b;
	}
	
	/**
	 * 比較
	 * @param  bd1      入力引数1
	 * @param  bd2 　   入力引数2
	 * @return boolean  チェック返す値
	 */
	private boolean compDecimal(BigDecimal bd1,BigDecimal bd2){
		// bd1 >= bd2
		if(bd1.compareTo(bd2) >= 0) {
			return true;
		} else {
			return false;
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
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0120");
		logger.entering("AE0120010Control"+":USER="+struct.getsUser_ID(),"controlSelect");
			//{{user_implement_dev:<controlSelect>
			// TODO: ユーザ定義のコードを記述してください
		try {
			
			// キーを退避
			String puchOdrCd = struct.getPUCH_ODR_CD();
			
			// キー以外の項目を初期化
			initializeDetail();
			
			struct.setCOMPANY_CD(_myCompanyStruct.getCOMPANY_CD());
			
			// [購入返品実績]に対象データが存在しない場合エラー
			List puchOdrRtnRsltList = entity.mT_PUCH_ODR_RTN_RSLT.read(conn, struct);
			if (puchOdrRtnRsltList.isEmpty()) {
				setErrorMessage("ZZ06001");
				setErrorParameter("T_PUCH_ODR_RTN_RSLT", "PUCH_ODR_CD", struct.getPUCH_ODR_CD());
				return;
			}
			
			AE0120010Struct puchOdrRtnRsltStruct = (AE0120010Struct)(puchOdrRtnRsltList.get(0));
			
			// [購入返品実績]."工場コード" ≠ ログインユーザの工場コード の場合エラー
			if (sysPLANT_CD.equals(puchOdrRtnRsltStruct.getPLANT_CD()) == false) {
				setErrorMessage("AE00138");
				setErrorParameter("T_PUCH_ODR_RTN_RSLT", "PUCH_ODR_CD", struct.getPUCH_ODR_CD());
				setErrorParameter("T_PUCH_ODR_RTN_RSLT", "PLANT_CD", puchOdrRtnRsltStruct.getPLANT_CD());
				return;
			}
			
			struct.setStruct(puchOdrRtnRsltStruct);
			struct.setPUCH_ODR_CD(puchOdrCd);
			
			// 買掛管理がインストールされている場合、当年月度を取得
			AE0120010Struct readStruct = new AE0120010Struct();
			List installOptionsList = entity.mSYS_INSTALL_OPTIONS.read(conn, readStruct);
			if (installOptionsList.size() > 0) {
				AE0120010Struct installOptionsStruct = (AE0120010Struct)installOptionsList.get(0);
				struct.setINSTALL_FLG(installOptionsStruct.getINSTALL_FLG());
			} else {
				struct.setINSTALL_FLG("0");
			}
			
			// 買掛管理がインストールされている場合、当年月度を取得
			if ("1".equals(struct.getINSTALL_FLG())) {
				List debtCtrlList = entity.mSYS_DEBT_CTRL.read(conn, readStruct);
				if (debtCtrlList.size() > 0) {
					AE0120010Struct debtCtrlStruct = (AE0120010Struct)debtCtrlList.get(0);
					struct.setTHIS_MONTH(debtCtrlStruct.getTHIS_MONTH());
				} else {
					setErrorMessage("AE00145");
					return;
				}
			}
			
			if ("0".equals(struct.getINV_CTRL_FLG())) {
				struct.setc_NON_NO_ITEM_FLG("true");
			}
			//製品区分を取得
			if ("1".equals(struct.getINV_CTRL_FLG())) {
				struct.setPRODUCT_TYP(struct.getITEM_TYP());
			} else if ("0".equals(struct.getINV_CTRL_FLG())){
				struct.setPRODUCT_TYP(struct.getNON_NO_ITEM_TYP());
			}
			//品目名
			if ("0".equals(struct.getINV_CTRL_FLG())) {
				struct.setITEM_NAME(struct.getNON_NO_ITEM_NAME());//品目名
				struct.setSTOCK_UNIT(struct.getNON_NO_ITEM_PUCH_ODR_UNIT());//単位
			}
			
			// 「発注番号を指定する」で指定する「発注番号」とラジオボタンをクリア
			struct.setr1_FILTER("true");
			struct.setPUCH_ODR_CD_2(null);
			
			struct.setSelectUnitCostFlag("true");
			
			// [購入返品実績]."返品取消フラグ" ＝ 1：返品取消 の場合ワーニング
			if ("1".equals(puchOdrRtnRsltStruct.getRTN_DEL_FLG())) {
				setWarningMessage("AE00142");
				setWarningParameter("T_PUCH_ODR_RTN_RSLT", "PUCH_ODR_CD", struct.getPUCH_ODR_CD());
				setWarningParameter("T_PUCH_ODR_RTN_RSLT", "RTN_DEL_FLG", 
						puchOdrRtnRsltStruct.getRTN_DEL_FLG());
			}
			struct.setRTN_DEL_FLG(puchOdrRtnRsltStruct.getRTN_DEL_FLG());
			
			// 返品日
			struct.seth_PUCH_RTN_DATE(struct.getPUCH_RTN_DATE());
			
			readStatus = NORMAL;
			
		} catch (FoundationException e) {
			throw new ExpjException(e);
		} catch (DataNotFoundException e) {
			throw new ExpjException(e);
		} catch (SQLException e) {
			throw new ExpjException(e);
		}
                //}}user_implement_dev:<controlSelect>
		logger.exiting("AE0120010Control"+":USER="+struct.getsUser_ID(),"controlSelect");

		return;
	}

	/**
	 * 単価読込ボタン押下時に実行される処理です。
	 *
	 */
	public void controlSelectUnitCost() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0120");
		logger.entering("AE0120010Control"+":USER="+struct.getsUser_ID(),"controlSelectUnitCost");
			//{{user_implement_dev:<controlSelectUnitCost>
			// TODO: ユーザ定義のコードを記述してください
			
		try {
			
			// 「購入単価読込」が選択されている場合
			if ("true".equals(struct.getr1_FILTER())) {
				
				// 入力チェック
				// 取引先マスタ存在チェック
				List vendList = entity.mM_VEND_CTRL.read(conn, struct);
				if (vendList.isEmpty()) {
					// エラー
					setErrorMessage("AE20030");
					setErrorParameter("M_VEND_CTRL", "COMPANY_CD", struct.getCOMPANY_CD());
					setErrorParameter("M_VEND_CTRL", "VEND_CD", struct.getVEND_CD());
				} else {
					AE0120010Struct vendStruct = (AE0120010Struct)(vendList.get(0));
				}
				
				// 品目存在チェック
				List itemList = entity.mM_ITEM.read(conn, struct);
				if (itemList.isEmpty() && "true".equals(struct.getc_NON_NO_ITEM_FLG()) == false) {
					// エラー
					setErrorMessage("AE00118");
					setErrorParameter("M_ITEM", "ITEM_CD", struct.getITEM_CD());
				} else if (!itemList.isEmpty()) {
					AE0120010Struct itemStruct = (AE0120010Struct) (itemList.get(0));

					// 品目.在庫数単位区分
					if ("1".equals(itemStruct.getUNIT_QTY_TYP()) == true 
							&& Calculate.isInteger(struct.getPUCH_RTN_QTY()) == false) {
						// エラー
						setErrorMessage("AE00146");
						setErrorParameter("M_ITEM", "ITEM_CD", struct.getITEM_CD());
						setErrorParameter("M_ITEM", "UNIT_QTY_TYP", itemStruct.getUNIT_QTY_TYP());
					}
				}

				// 消費税区分存在チェック
				if(null != struct.getTAX_CD() && !"".equals(struct.getTAX_CD())){
					List taxList = entity.mM_TAX.read(conn, struct);
					if (taxList.isEmpty()) {
						// エラー
						setErrorMessage("AA01001");
						setErrorParameter("M_TAX", "TAX_CD", struct.getTAX_CD());
					}
				}

				// エラーがあれば終了
				if (msgStruct.hasError()) {
					return;
				}
				
				PuchUnitCostStruct pucs;
				
				// 取引先、購入単価、通貨、消費税を取得
				/*try {
					pucs = PuchUnitCostControl.getData(
							conn,
							_myCompanyStruct.getCOMPANY_CD(),
							struct.getVEND_CD(),
							sysPLANT_CD,
							struct.getITEM_CD(),
							struct.getPUCH_RTN_DATE(),
							struct.getPUCH_RTN_DATE(),
							struct.getPUCH_RTN_QTY());*/

				try {
					pucs = PuchUnitCostControl.getDataTax0(
							conn,
							_myCompanyStruct.getCOMPANY_CD(),
							struct.getVEND_CD(),
							sysPLANT_CD,
							struct.getITEM_CD(),
							struct.getPUCH_RTN_DATE(),
							struct.getPUCH_RTN_DATE(),
							struct.getPUCH_RTN_QTY(),
							struct.getTAX_CD());
					
					struct.setTAX_CD(pucs.getTAX_CD());
					struct.setUNIT_COST_TYP(pucs.getUNIT_COST_TYP());
					struct.setUNIT_COST(pucs.getUNIT_COST());
					struct.setPROCESSING_COST(pucs.getPROCESSING_COST());
					struct.setMATERIAL_COST(pucs.getMATERIAL_COST());
					struct.setOTHER_OVERHEADS(pucs.getOTHER_OVERHEADS());
					struct.setPUCH_ODR_AMOUNT(pucs.getPUCH_ODR_AMOUNT());
					struct.setTAX_RATE_1(pucs.getTAX_RATE_1());
					struct.setTAX_RATE_2(pucs.getTAX_RATE_2());
					struct.setTAX_RATE_3(pucs.getTAX_RATE_3());
					struct.setNET_AMOUNT(pucs.getNET_AMOUNT());
					struct.setDISC_AMOUNT(pucs.getDISC_AMOUNT());
					struct.setAMOUNT_INCLUDE_TAX(pucs.getAMOUNT_INCLUDE_TAX());
					struct.setTAX_ROUND_TYP(pucs.getTAX_ROUND_TYP());
					struct.setROUND_TYP(pucs.getROUND_TYP());
					struct.setVEND_CUR_UNIT(pucs.getCUR_UNIT());
					struct.setVEND_DECIMAL_FIG(pucs.getDECIMAL_FIG());
					
	                //内税の場合に税額を計算する
					if(null != struct.getTAX_CD() && !"".equals(struct.getTAX_CD())){
						String lowerTaxCd =
		        			struct.getTAX_CD().substring(struct.getTAX_CD().length() - 1);
			       		if (!lowerTaxCd.equals("1")) {
			       			//バッチパラメータ呼出
			       			List batList = entity.mSYS_BAT_PARM.read(conn, struct);
			       			if(!batList.isEmpty()){
			       				//税計算部品をコール
			       				AE0120010Struct batStruct = (AE0120010Struct)batList.get(0);
			       				struct.setPVC2LOGMODE(batStruct.getPVC2LOGMODE());
			       				struct.setPVC2OUTPUTMODE(batStruct.getPVC2OUTPUTMODE());
			       				struct.setPVC2OUTPUTPATH(batStruct.getPVC2OUTPUTPATH());
			       				struct.setPVC2OUTPUTNAME(batStruct.getPVC2OUTPUTNAME());
			       				struct.setPVC2USERID(this.sysUSER_CD);
			       				struct.setPVC2BUSINESSNAME(batStruct.getPVC2BUSINESSNAME());
			       				struct.setPVC2PLANTCD(this.sysPLANT_CD);
			       				struct.setPVC2TAXID("5");
			       				batList = entity.mcallSQLCALCTAXCALCAMT.call(conn, struct);
			       				batStruct = (AE0120010Struct)batList.get(0);
			       				if(!"1".equals(batStruct.getPNUMSTATUS())){
			       					setErrorMessage(batStruct.getPVC2ERRCD());
			       					return;      				       				
			       				}
			       				struct.setTAX_AMOUNT_1(batStruct.getTAX_AMOUNT_1());
			       				struct.setTAX_AMOUNT_2(batStruct.getTAX_AMOUNT_2());
			       				struct.setTAX_AMOUNT_3(batStruct.getTAX_AMOUNT_3());
			       				struct.setAMOUNT_INCLUDE_TAX(batStruct.getAMOUNT_INCLUDE_TAX());   				
			       			}else{
			       				setErrorMessage("ZZ09007");        				
			       			}
		            	  }else{
		      				struct.setTAX_AMOUNT_1(pucs.getTAX_AMOUNT_1());
		    				struct.setTAX_AMOUNT_2(pucs.getTAX_AMOUNT_2());
		    				struct.setTAX_AMOUNT_3(pucs.getTAX_AMOUNT_3());
		    				struct.setAMOUNT_INCLUDE_TAX(pucs.getAMOUNT_INCLUDE_TAX());
		            	  }
					} else {
						struct.setTAX_AMOUNT_1(pucs.getTAX_AMOUNT_1());
	    				struct.setTAX_AMOUNT_2(pucs.getTAX_AMOUNT_2());
	    				struct.setTAX_AMOUNT_3(pucs.getTAX_AMOUNT_3());
	    				struct.setAMOUNT_INCLUDE_TAX(pucs.getAMOUNT_INCLUDE_TAX());
					}
				} catch (DataNotFoundException e) {
					setErrorMessage("AE00060", e.getMessage());
					setErrorParameter("T_PUCH_ODR_RTN_RSLT", "VEND_CD", struct.getVEND_CD());
					setErrorParameter("T_PUCH_ODR_RTN_RSLT", "PLANT_CD", struct.getPLANT_CD());
					setErrorParameter("T_PUCH_ODR_RTN_RSLT", "ITEM_CD", struct.getITEM_CD());
					setErrorParameter(
							"T_PUCH_ODR_RTN_RSLT",
							"PUCH_RTN_DATE",
							struct.getPUCH_RTN_DATE());
					setErrorParameter("T_PUCH_ODR_RTN_RSLT", "PUCH_RTN_QTY", struct.getPUCH_RTN_QTY());
					return;
				} catch (SQLException e) {
					throw new ExpjException(e);
				}
				
				// 為替レートが存在しない場合はワーニング扱いとするため別に取得
				try {
					ExchRateStruct ers = ExchRateControl.getData(
							conn,
							_myCompanyStruct.getCOMPANY_CD(),
							pucs.getCUR_CD(),
							pucs.getEXCH_TYP(),
							null,
							struct.getPUCH_RTN_DATE());
							
					// ｢為替レート｣を設定
					struct.setEXCH_RATE(ers.getEXCH_RATE());
					
					// ｢邦貨金額｣の計算
					String homeCurAmount = AmountCalculator.calcHomeCurAmount(
							pucs.getAMOUNT_INCLUDE_TAX(),
							ers.getEXCH_RATE(),
							pucs.getROUND_TYP(),
							_homeCurStruct.getDECIMAL_FIG());
					struct.setHOME_CUR_AMOUNT(homeCurAmount);
					
				} catch (DataNotFoundException e) {
					struct.setHOME_CUR_AMOUNT("0");
					struct.setEXCH_RATE("0");
					setWarningMessage("AE00061");
					setWarningParameter("T_PUCH_ODR_RTN_RSLT", "VEND_CD", struct.getVEND_CD());
					setWarningParameter("T_PUCH_ODR_RTN_RSLT", "PLANT_CD", struct.getPLANT_CD());
					setWarningParameter("T_PUCH_ODR_RTN_RSLT", "ITEM_CD", struct.getITEM_CD());
					setWarningParameter(
						"T_PUCH_ODR_RTN_RSLT",
						"PUCH_RTN_DATE",
						struct.getPUCH_RTN_DATE());
					setWarningParameter("T_PUCH_ODR_RTN_RSLT", "PUCH_RTN_QTY", struct.getPUCH_RTN_QTY());
				} catch (SQLException e) {
					throw new ExpjException(e);
				}
				
				// 返品元保管区コード
				if ((struct.getWH_CD() == null || "".equals(struct.getWH_CD())) 
				&& !"".equals(struct.getITEM_CD())) {
					String defaultWhCd = ValidateWh.getDefaultRcv(conn,
							sysPLANT_CD, struct.getITEM_CD());
					struct.setWH_CD(defaultWhCd);
				}
			} else if ("true".equals(struct.getr2_FILTER())) {
				
				// 「発注番号を指定する」が選択されている場合
				
				// 入力チェック
				
				// 発注番号が[受入実績]に存在しない場合エラー
				List acptRsltList = entity.mT_ACPT_RSLT.read(conn, struct);
				if (acptRsltList.isEmpty()) {
					// エラー
					setErrorMessage("AE00130");
					setErrorParameter("T_ACPT_RSLT", "PUCH_ODR_CD", struct.getPUCH_ODR_CD_2());
				} else {
					// [受入実績]."工場コード" <> ログインユーザの工場コードの場合エラー
					AE0120010Struct acptRsltStruct = (AE0120010Struct)(acptRsltList.get(0));
					if (sysPLANT_CD.equals(acptRsltStruct.getPLANT_CD()) == false) {
						// エラー
						setErrorMessage("AE00100");
						setErrorParameter("T_ACPT_RSLT", "PLANT_CD", acptRsltStruct.getPLANT_CD());
					}
				}
				
				if ((struct.getVEND_CD() != null && "".equals(struct.getVEND_CD()) == false)
						|| (struct.getITEM_CD() != null && "".equals(struct.getITEM_CD()) == false)
						|| (struct.getJOB_ODR_CD() != null && "".equals(struct.getJOB_ODR_CD()) == false)) {
					
					// [発注残]検索
					List rlsdPuchOdrList = entity.mT_RLSD_PUCH_ODR.read(conn, struct);
					if (rlsdPuchOdrList.isEmpty()) {
						
						// エラー
						setErrorMessage("ZZ01101");
						setErrorParameter("T_RLSD_PUCH_ODR", "PUCH_ODR_CD", struct.getPUCH_ODR_CD_2());
						
					} else {
						
						AE0120010Struct rlsdPuchOdrStruct = (AE0120010Struct)(rlsdPuchOdrList.get(0));
						
						if (struct.getVEND_CD() != null && "".equals(struct.getVEND_CD()) == false) {
							if ((struct.getVEND_CD()).equals(rlsdPuchOdrStruct.getVEND_CD()) == false) {
								setErrorMessage("AE00131");
								setErrorParameter("T_ACPT_RSLT", "PUCH_ODR_CD", struct.getPUCH_ODR_CD_2());
							}
						}
						if (struct.getITEM_CD() != null && "".equals(struct.getITEM_CD()) == false) {
							if ((struct.getITEM_CD()).equals(rlsdPuchOdrStruct.getITEM_CD()) == false) {
								setErrorMessage("AE00132");
								setErrorParameter("T_ACPT_RSLT", "PUCH_ODR_CD", struct.getPUCH_ODR_CD_2());
							} else {
								List itemList = entity.mM_ITEM.read(conn, struct);
								if (itemList.isEmpty()) {
									// エラー
									setErrorMessage("AE00118");
									setErrorParameter("M_ITEM", "ITEM_CD", struct.getITEM_CD());
								} else {
									AE0120010Struct itemStruct = (AE0120010Struct)(itemList.get(0));
									struct.setITEM_NAME(itemStruct.getITEM_NAME());
									
									if ("1".equals(itemStruct.getUNIT_QTY_TYP()) == true
											&& Calculate.isInteger(struct.getPUCH_RTN_QTY()) == false) {
										// エラー
										setErrorMessage("AE00146");
										setErrorParameter("M_ITEM", "ITEM_CD", struct.getITEM_CD());
										setErrorParameter("M_ITEM", "UNIT_QTY_TYP", itemStruct.getUNIT_QTY_TYP());
									}
								}
							}
						}
						
						// エラーがあれば終了
						if (msgStruct.hasError()) {
							return;
						}
						
						if (struct.getJOB_ODR_CD() != null && "".equals(struct.getJOB_ODR_CD()) == false) {
							if ((struct.getJOB_ODR_CD()).equals(rlsdPuchOdrStruct.getJOB_ODR_CD()) == false) {
								setErrorMessage("AE00133");
								setErrorParameter("T_ACPT_RSLT", "PUCH_ODR_CD", struct.getPUCH_ODR_CD_2());
							}
						}
					}
				}
				
				// エラーがあれば終了
				if (msgStruct.hasError()) {
					return;
				}
				
				PuchUnitCostStruct pucs;
				
				// 取引先、購入単価、通貨、消費税を取得
				try {
					
					List unitCostList = entity.mselectUNIT_COST.read(conn, struct);
					if (unitCostList.isEmpty()) {
						// エラー
						setErrorMessage("AE00130");
						setErrorParameter("T_PUCH_ODR_RTN_RSLT", "VEND_CD", struct.getVEND_CD());
						setErrorParameter("T_PUCH_ODR_RTN_RSLT", "PLANT_CD", struct.getPLANT_CD());
						setErrorParameter("T_PUCH_ODR_RTN_RSLT", "ITEM_CD", struct.getITEM_CD());
						setErrorParameter(
								"T_PUCH_ODR_RTN_RSLT",
								"PUCH_RTN_DATE",
								struct.getPUCH_RTN_DATE());
						setErrorParameter("T_PUCH_ODR_RTN_RSLT", "PUCH_RTN_QTY", struct.getPUCH_RTN_QTY());
						return;
					} else {
						AE0120010Struct unitCostStruct = (AE0120010Struct)(unitCostList.get(0));
						struct.setUNIT_COST_TYP(unitCostStruct.getUNIT_COST_TYP());  // 単価区分
						struct.setUNIT_COST(unitCostStruct.getUNIT_COST());  // 単価
						struct.setVEND_CD(unitCostStruct.getVEND_CD());  // 取引先コード
						struct.setITEM_CD(unitCostStruct.getITEM_CD());  // 品目番号
						struct.setJOB_ODR_CD(unitCostStruct.getJOB_ODR_CD());  // 製番
						if(struct.getWH_CD() == null || "".equals(struct.getWH_CD())){
							struct.setWH_CD(unitCostStruct.getWH_CD());  // 返品元保管区コード
						}
						struct.setPROCESSING_COST(unitCostStruct.getPROCESSING_COST());  // 加工費
						struct.setMATERIAL_COST(unitCostStruct.getMATERIAL_COST());  // 材料費
						struct.setOTHER_OVERHEADS(unitCostStruct.getOTHER_OVERHEADS());  // その他経費
						struct.setTAX_CD(unitCostStruct.getTAX_CD());  // 消費税コード
					}
				} catch (SQLException e) {
					throw new ExpjException(e);
				}
					
				// 為替レートが存在しない場合はワーニング扱いとするため別に取得
				try {
					// 画面外の必要なデータを設定
					try {
						// [消費税区分]情報を取得
						/*TaxStruct ts =
								TaxControl.getData(
									conn,
									struct.getCOMPANY_CD(),
									struct.getVEND_CD(),
									struct.getITEM_CD(),
									struct.getPUCH_RTN_DATE()
									);*/
						TaxStruct ts =
						TaxControl.getDataTax(
							conn,
							struct.getCOMPANY_CD(),
							struct.getVEND_CD(),
							struct.getITEM_CD(),
							struct.getPUCH_RTN_DATE(),
							struct.getTAX_CD()
							);
						// [通貨]情報を取得
						CurStruct cs =
						CurControl.getData(conn, struct.getCOMPANY_CD(), struct.getVEND_CD());
						struct.setVEND_CUR_UNIT(cs.getCUR_UNIT());
						
						struct.setTAX_CD(ts.getTAX_CD());
						struct.setTAX_ROUND_TYP(ts.getTAX_ROUND_TYP());
/*
						String lowerTaxCd = ts.getTAX_CD().substring(ts.getTAX_CD().length() - 1);
						if (lowerTaxCd.equals("1")) {
*/
							struct.setTAX_RATE_1(ts.getTAX_RATE_1());
							struct.setTAX_RATE_2(ts.getTAX_RATE_2());
							struct.setTAX_RATE_3(ts.getTAX_RATE_3());
/*
						} else {
							struct.setTAX_RATE_1("0.0");
							struct.setTAX_RATE_2("0.0");
							struct.setTAX_RATE_3("0.0");
						}
*/
						
						struct.setROUND_TYP(cs.getROUND_TYP());
						struct.setVEND_DECIMAL_FIG(cs.getDECIMAL_FIG());
						
						ExchRateStruct ers = ExchRateControl.getData(
								conn,
								_myCompanyStruct.getCOMPANY_CD(),
								cs.getCUR_CD(),
								cs.getEXCH_TYP(),
								null,
								struct.getPUCH_RTN_DATE());
						
						// ｢為替レート｣を設定
						struct.setEXCH_RATE(ers.getEXCH_RATE());
					} catch (DataNotFoundException e) {
						setErrorMessage(e.getCode());
						return;
					}
					
					// ｢発注金額｣の計算
					String puchOdrAmount =
							AmountCalculator.calcPuchOdrAmount(
									struct.getPUCH_RTN_QTY(),
									struct.getUNIT_COST(),
									struct.getROUND_TYP(),
									struct.getVEND_DECIMAL_FIG());
					struct.setPUCH_ODR_AMOUNT(puchOdrAmount);
					
					// ｢値引金額｣の計算
					String discAmount = "0.00";
					struct.setDISC_AMOUNT(discAmount);
					
					// 本体金額
					String netAmount =
						AmountCalculator.calcNetAmount(
							struct.getPUCH_ODR_AMOUNT(),
							struct.getDISC_AMOUNT());
					struct.setNET_AMOUNT(netAmount);
					
		            //内税の場合に税額を計算する
		     		String lowerTaxCd =
		     			struct.getTAX_CD().substring(struct.getTAX_CD().length() - 1);
		     		if (!lowerTaxCd.equals("1")) {
		    			//バッチパラメータ呼出
		    			List batList = entity.mSYS_BAT_PARM.read(conn, struct);
		    			if(!batList.isEmpty()){
		    				//税計算部品をコール
		    				AE0120010Struct batStruct = (AE0120010Struct)batList.get(0);
		    				struct.setPVC2LOGMODE(batStruct.getPVC2LOGMODE());
		    				struct.setPVC2OUTPUTMODE(batStruct.getPVC2OUTPUTMODE());
		    				struct.setPVC2OUTPUTPATH(batStruct.getPVC2OUTPUTPATH());
		    				struct.setPVC2OUTPUTNAME(batStruct.getPVC2OUTPUTNAME());
		    				struct.setPVC2USERID(this.sysUSER_CD);
		    				struct.setPVC2BUSINESSNAME(batStruct.getPVC2BUSINESSNAME());
		    				struct.setPVC2PLANTCD(this.sysPLANT_CD);
		    				struct.setPVC2TAXID("5");
		    				batList = entity.mcallSQLCALCTAXCALCAMT.call(conn, struct);
		    				batStruct = (AE0120010Struct)batList.get(0);
		    				if(!"1".equals(batStruct.getPNUMSTATUS())){
		    					setErrorMessage(batStruct.getPVC2ERRCD());
		    					return;      				       				
		    				}
		    				struct.setTAX_AMOUNT_1(batStruct.getTAX_AMOUNT_1());
		    				struct.setTAX_AMOUNT_2(batStruct.getTAX_AMOUNT_2());
		    				struct.setTAX_AMOUNT_3(batStruct.getTAX_AMOUNT_3());
		    				struct.setAMOUNT_INCLUDE_TAX(batStruct.getAMOUNT_INCLUDE_TAX());   				
		    			}else{
		    				setErrorMessage("ZZ09007");        				
		    			}
		         	}else{
						// ｢税額1｣の計算
						String taxAmount1 =
								AmountCalculator.calcTaxAmount(
										struct.getNET_AMOUNT(),
										struct.getTAX_RATE_1(),
										struct.getTAX_ROUND_TYP(),
										struct.getVEND_DECIMAL_FIG());
						struct.setTAX_AMOUNT_1(taxAmount1);
						
						// ｢税額2｣の計算
						String taxAmount2 =
								AmountCalculator.calcTaxAmount(
										struct.getNET_AMOUNT(),
										struct.getTAX_RATE_2(),
										struct.getTAX_ROUND_TYP(),
										struct.getVEND_DECIMAL_FIG());
						struct.setTAX_AMOUNT_2(taxAmount2);
						
						// ｢税額3｣の計算
						String taxAmount3 =
								AmountCalculator.calcTaxAmount(
										struct.getNET_AMOUNT(),
										struct.getTAX_RATE_3(),
										struct.getTAX_ROUND_TYP(),
										struct.getVEND_DECIMAL_FIG());
						struct.setTAX_AMOUNT_3(taxAmount3);
						
						// ｢税込金額｣の計算
						String amountIncludeTax =
								AmountCalculator.calcAmountIncludeTax(
										struct.getNET_AMOUNT(),
										struct.getTAX_AMOUNT_1(),
										struct.getTAX_AMOUNT_2(),
										struct.getTAX_AMOUNT_3());
						struct.setAMOUNT_INCLUDE_TAX(amountIncludeTax);
		         	}
					
					// ｢邦貨金額｣の計算
					String homeCurAmount =
							AmountCalculator.calcHomeCurAmount(
									struct.getAMOUNT_INCLUDE_TAX(),
									struct.getEXCH_RATE(),
									struct.getROUND_TYP(),
									_homeCurStruct.getDECIMAL_FIG());
					struct.setHOME_CUR_AMOUNT(homeCurAmount);
				
				} catch (SQLException e) {
					throw new ExpjException(e);
				}
			}
			
		} catch (SQLException e) {
			throw new ExpjException(e);
		}
		struct.setSelectUnitCostFlag("true");
                //}}user_implement_dev:<controlSelectUnitCost>
		logger.exiting("AE0120010Control"+":USER="+struct.getsUser_ID(),"controlSelectUnitCost");

		return;
	}

	/**
	 * 登録ボタン押下時に実行される処理です。
	 *
	 */
	public void controlInsert() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0120");
		logger.entering("AE0120010Control"+":USER="+struct.getsUser_ID(),"controlInsert");
			//{{user_implement_dev:<controlInsert>
			// TODO: ユーザ定義のコードを記述してください
		try {

			// 生産側の過去の実績入力の制限チェック
			if(getSysParameter() == false){
				if(chkProcExecDate("1","",struct.getPUCH_RTN_DATE()) == false){
					setErrorMessage(ProcExecDateError);
					setErrorParameter("SYS_ACTUAL_COST_CTRL_AC", "PLANT_CD", struct.getPLANT_CD());
					setErrorParameter("SYS_ACTUAL_COST_CTRL_AC", "PROC_EXEC_DATE", struct.getPROC_EXEC_DATE().toString());
					return;
				}
			}
						
			// 取引先マスタ存在チェック
			List vendList = entity.mM_VEND_CTRL.read(conn, struct);
			if (vendList.isEmpty()) {
				// エラー
				setErrorMessage("AE20030");
				setErrorParameter("M_VEND_CTRL", "COMPANY_CD", struct.getCOMPANY_CD());
				setErrorParameter("M_VEND_CTRL", "VEND_CD", struct.getVEND_CD());
			} else {
				AE0120010Struct vendStruct = (AE0120010Struct)(vendList.get(0));
				struct.setVEND_ANAME(vendStruct.getVEND_ANAME());
			}
			
			// エラーがあれば終了
			if (msgStruct.hasError()) {
				return;
			}
			
			// 品目存在チェック
			AE0120010Struct itemStruct = null;
			List itemList = entity.mM_ITEM.read(conn, struct);
			//「品目番号」がNullではないの場合
			if ("".equals(struct.getITEM_CD()) == false) {
				if (itemList.isEmpty()) {
					// エラー
					setErrorMessage("AE00118");
					setErrorParameter("M_ITEM", "ITEM_CD", struct.getITEM_CD());
				} else {
					itemStruct = (AE0120010Struct) (itemList.get(0));
					// 品目マスタから品目手配区分を取得、8擬似品目の場合エラー
					if ("8".equals(itemStruct.getMRP_ODR_TYP())) {
	                    // エラー
						setErrorMessage("AE00203");
						setErrorParameter("M_ITEM", "ITEM_CD", struct.getITEM_CD());
						setErrorParameter("M_ITEM", "MRP_ODR_TYP", itemStruct.getMRP_ODR_TYP());
					}
					//「備品購入」フラグがOffの場合
					if ("true".equals(struct.getc_NON_NO_ITEM_FLG()) == false) {
						struct.setITEM_NAME(itemStruct.getITEM_NAME());
						struct.setSTOCK_UNIT(itemStruct.getSTOCK_UNIT());
						struct.setPRODUCT_TYP(itemStruct.getPRODUCT_TYP()); // 製品区分
						struct.setCLASIFICATION_CD(itemStruct.getCLASIFICATION_CD()); // 管理コード
					}
					if ("1".equals(itemStruct.getUNIT_QTY_TYP()) == true
							&& Calculate.isInteger(struct.getPUCH_RTN_QTY()) == false) {
						// エラー
						setErrorMessage("AE00146");
						setErrorParameter("M_ITEM", "ITEM_CD", struct.getITEM_CD());
						setErrorParameter("M_ITEM", "UNIT_QTY_TYP", itemStruct.getUNIT_QTY_TYP());
					}
					if("true".equals(lotCtrl)){
					   String lotCtrlFlg = itemStruct.getLOT_CTRL_FLG();
		                // 在庫ロット番号は指定されていません
		                if(lotCtrlFlg != null && "0".equals(lotCtrlFlg) 
		                        && struct.getLOT_NO() != null && !"".equals(struct.getLOT_NO())){
		                    // エラー
		                    setErrorMessage("AE21200");
		                    return;
		                }
		                
		                // 在庫ロット番号は指定されていません
		                if(lotCtrlFlg != null && "1".equals(lotCtrlFlg) 
		                        && (struct.getLOT_NO() == null || "".equals(struct.getLOT_NO()))
		                        && !"true".equals(struct.getc_NON_NO_ITEM_FLG())){
		                    // エラー
		                    setErrorMessage("AE21201");
		                    return;
		                }
		                
		                // 入力された在庫ロット番号はこの品目に該当しません
		                if(lotCtrlFlg != null && "1".equals(lotCtrlFlg) 
		                        && struct.getLOT_NO() != null && !"".equals(struct.getLOT_NO())){
		                    boolean lotCtrlCheck = entity.mT_LOT_CTRL.check(conn,struct);
		                    if(!lotCtrlCheck){
		                        // エラー
		                        setErrorMessage("AE21203");
		                        setErrorParameter("T_LOT_CTRL", "ITEM_CD", struct.getITEM_CD());
		                        setErrorParameter("T_LOT_CTRL", "LOT_NO", struct.getLOT_NO());   
		                    }
		                }
					}
				}
			}
			// エラーがあれば終了
			if (msgStruct.hasError()) {
				return;
			}
			
			struct.setPLANT_CD(sysPLANT_CD);
			
			DateCtrlStruct dcs = DateCtrlControl.getData(conn, sysPLANT_CD);
			if (DateTool.compareYMD(struct.getPUCH_RTN_DATE(), dcs.getBUSINESS_OPR_DATE()) > 0) {
				setErrorMessage("AE00117");
				setErrorParameter("SYS_DATE_CTRL", "PLANT_CD", sysPLANT_CD);
				setErrorParameter(
					"SYS_DATE_CTRL",
					"BUSINESS_OPR_DATE",
					dcs.getBUSINESS_OPR_DATE());
				setErrorParameter(
					"T_PUCH_ODR_RTN_RSLT",
					"PUCH_RTN_DATE",
					struct.getPUCH_RTN_DATE());
			}
			
			// 製番計画存在チェック
			if (struct.getJOB_ODR_CD() != null && "".equals(struct.getJOB_ODR_CD()) == false) {
				List jobOdrList = entity.mT_JOB_ODR.read(conn, struct);
				if (jobOdrList.isEmpty()) {
					// エラー
					setErrorMessage("AE00110");
					setErrorParameter("T_JOB_ODR", "JOB_ODR_CD", struct.getJOB_ODR_CD());
				} else {
					// 製番計画.工場コードがログインユーザの工場コードと異なる場合エラー
					AE0120010Struct jobOdrStruct = (AE0120010Struct)(jobOdrList.get(0));
					if (sysPLANT_CD.equals(jobOdrStruct.getPLANT_CD()) == false) {
						// エラー
						setErrorMessage("AE00115");
						setErrorParameter("T_JOB_ODR", "JOB_ODR_CD", struct.getJOB_ODR_CD());
						setErrorParameter("T_JOB_ODR", "PLANT_CD", jobOdrStruct.getPLANT_CD());
					}
				}
			}
			
			// エラーがあれば終了
			if (msgStruct.hasError()) {
				return;
			}
			
			// 「返品保管区コード」存在チェック
			List whList = entity.mM_WH.read(conn, struct);
			if (whList.isEmpty()) {
				// エラー
				setErrorMessage("AE00134");
				setErrorParameter("M_WH", "WH_CD", struct.getWH_CD());
			} else {
				// 保管区.工場コードがログインユーザの工場コードと異なる場合エラー
				AE0120010Struct whStruct = (AE0120010Struct)(whList.get(0));
				if (sysPLANT_CD.equals(whStruct.getPLANT_CD()) == false) {
					// エラー
					setErrorMessage("AE00135");
					setErrorParameter("T_JOB_ODR", "JOB_ODR_CD", struct.getJOB_ODR_CD());
					setErrorParameter("T_JOB_ODR", "PLANT_CD", whStruct.getPLANT_CD());
					return;
				}
				// 保管区.所要量計算対象フラグ=0：非の場合エラー
				if ("0".equals(whStruct.getMRP_FLG())) {
					// エラー
					setErrorMessage("AE00136");
					setErrorParameter("M_WH", "WH_CD", struct.getWH_CD());
					setErrorParameter("M_WH", "MRP_FLG", whStruct.getMRP_FLG());
				}
				// 保管区.倉庫区分=40：検査待ち保管区の場合エラー
				if ("40".equals(whStruct.getWH_TYP())) {
					// エラー
					setErrorMessage("AE00164");
					setErrorParameter("M_WH", "WH_CD", struct.getWH_CD());
					setErrorParameter("M_WH", "WH_TYP", whStruct.getWH_TYP());
				}
			}
			
			// エラーがあれば終了
			if (msgStruct.hasError()) {
				return;
			}
			
			// 「発注担当者」存在チェック
			if (struct.getPUCH_ODR_PERSON() != null 
					&& "".equals(struct.getPUCH_ODR_PERSON()) == false) {
				List userList = entity.mUSER_MST.read(conn, struct);
				if (userList.isEmpty()) {
					// エラー
					setErrorMessage("AE00137");
					setErrorParameter("USER_MST", "USER_CD", struct.getPUCH_ODR_PERSON());
				}
			}
			
			// [通貨]情報を取得
			CurStruct cs = null;
			try {
				cs =
						CurControl.getData(conn, struct.getCOMPANY_CD(), struct.getVEND_CD());
			} catch(DataNotFoundException dnfe) {
				throw new ExpjException(dnfe);
			}
					
			String netAmount = "0";
			String discAmount = "0";
			String puchOdrAmount = "0";
			int figure = Integer.parseInt(cs.getDECIMAL_FIG());
			
			// 返品金額を再計算する
			
			puchOdrAmount =
					AmountCalculator.calcPuchOdrAmount(
							struct.getPUCH_RTN_QTY(),
							struct.getUNIT_COST(),
							cs.getROUND_TYP(),
							cs.getDECIMAL_FIG());
            if(!com.nec.jp.orteus.expj.util.Calculate.isNotInNumRange(puchOdrAmount)){
                // 多言語項目取得セット
               String ErrInfo = CoreTools.getRBString("Expj.PUCH_ODR_AMOUNT_3", resource);
           	   setErrorMessage("AA00215",ErrInfo);
           	   return;
             }
			// 計算結果が 本体金額 ＝ 返品金額 － 値引金額 でない場合エラー
			String amount = Calculate.subtract(puchOdrAmount, struct.getDISC_AMOUNT());
			if (Calculate.compare(struct.getNET_AMOUNT(), amount) != 0) {
				// エラー
				setErrorMessage("AE00147");
			}
			
			// 消費税区分存在チェック
			List taxList = entity.mM_TAX.read(conn, struct);
			if (taxList.isEmpty()) {
				// エラー
				setErrorMessage("AA01001");
				setErrorParameter("M_TAX", "TAX_CD", struct.getTAX_CD());
			}
			
			// エラーがあれば終了
			if (msgStruct.hasError()) {
				return;
			}
			
			// 在庫更新
			// 「備品購入」がoffの場合
			if ("true".equals(struct.getc_NON_NO_ITEM_FLG()) == false) {
				
				updateStock(conn, struct, null, 1);
				// エラーがあれば終了
				if (msgStruct.hasError()) {
					return;
				}
			}
			
			// 購入返品実績更新
			// 発注番号採番
			String puchOdrCd = null;
			Numbering numbering = new Numbering(
									conn,
									Numbering.PUCH_CD, 
									getsysUSER_CD(), 
									this.sp.getProcId(), 
									sysPLANT_CD);
			try {
				puchOdrCd = numbering.getNo();
				if(puchOdrCd == null){
					ExpjMessage emsg = new ExpjMessage("AE00153");
					throw new FoundationException(
									"AE0120010Control",
									"controlInsert()",
									emsg.getMessage(CoreTools.getLocale(this.getsysUSER_CD())));
				}
			} catch(FoundationException ex) {
				// 登録処理失敗：発注番号の採番に失敗しました
				setErrorMessage("AE00153");
				ExpjMessage emsg = new ExpjMessage("ZZ01106");
				sysLog.severe(emsg, getsysUSER_CD());
				ExpjException ee = new ExpjException(ex, emsg);
				throw ee;
			}
			
			// 購入返品実績追加
			updatePuchOdrRtnRslt(conn, struct, null, puchOdrCd, 1);
			if (msgStruct.hasError()) {
				return;
			}
			
			if("".equals(struct.getITEM_CD()) || struct.getITEM_CD() == null){
				updatePastInspcAcptIF(conn, struct, null, null,puchOdrCd, 1);
			}else{
				// 検収履歴、検収実績情報インターフェース追加
				//受給区分≠2:無償受給
				if (!itemList.isEmpty()) {
					itemStruct = (AE0120010Struct) (itemList.get(0));
					if ("2".equals(itemStruct.getSPL_ITEM_TYP()) == false) {
						updatePastInspcAcptIF(conn, struct, null, itemStruct,puchOdrCd, 1);
					}
				}
			}

			// 採番後の発注番号を設定
			struct.setPUCH_ODR_CD(puchOdrCd);
			
			// 登録後データ再表示
			controlSelect();
			
			conn.commit();
			
		} catch(ParseException e) {
			throw new ExpjException(e);
		} catch(DataNotFoundException e) {
			throw new ExpjException(e);
		} catch(SQLException e) {
			throw new ExpjException(e);
		} catch(ResourceBusyException rbe) {
			rbe.printStackTrace();
			setErrorMessage("ZZ01105");
			setReadStatus(ERROR);
		} finally {
			if (conn != null) {
				conn.rollback();
			}
		}
                //}}user_implement_dev:<controlInsert>
		logger.exiting("AE0120010Control"+":USER="+struct.getsUser_ID(),"controlInsert");

		return;
	}

	/**
	 * 更新ボタン押下時に実行される処理です。
	 *
	 */
	public void controlUpdate() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0120");
		logger.entering("AE0120010Control"+":USER="+struct.getsUser_ID(),"controlUpdate");
			//{{user_implement_dev:<controlUpdate>
			// TODO: ユーザ定義のコードを記述してください
		try {
			// 生産側の過去の実績入力の制限チェック
			if(getSysParameter() == false){
				if(chkProcExecDate("2",struct.geth_PUCH_RTN_DATE(),struct.getPUCH_RTN_DATE()) == false){
					setErrorMessage(ProcExecDateError);
					setErrorParameter("SYS_ACTUAL_COST_CTRL_AC", "PLANT_CD", struct.getPLANT_CD());
					setErrorParameter("SYS_ACTUAL_COST_CTRL_AC", "PROC_EXEC_DATE", struct.getPROC_EXEC_DATE().toString());
					return;
				}
			}
			
			// 品目存在チェック
			AE0120010Struct itemStruct = null;
			List itemList = entity.mM_ITEM.read(conn, struct);
			if ("".equals(struct.getITEM_CD()) == false) {
				if (itemList.isEmpty()) {
					// エラー
					setErrorMessage("AE00118");
					setErrorParameter("M_ITEM", "ITEM_CD", struct.getITEM_CD());
					return;
				} else {
					itemStruct = (AE0120010Struct) (itemList.get(0));
					//「備品購入」がOffの場合
					if ("true".equals(struct.getc_NON_NO_ITEM_FLG()) == false) {
						struct.setITEM_NAME(itemStruct.getITEM_NAME());
					}
					
					if ("1".equals(itemStruct.getUNIT_QTY_TYP()) == true && Calculate.isInteger(struct.getPUCH_RTN_QTY()) == false) {
						// エラー
						setErrorMessage("AE00146");
						setErrorParameter("M_ITEM", "ITEM_CD", struct.getITEM_CD());
						setErrorParameter("M_ITEM", "UNIT_QTY_TYP", itemStruct.getUNIT_QTY_TYP());
						return;
					}
				}
			}
			DateCtrlStruct dcs = DateCtrlControl.getData(conn, sysPLANT_CD);
			if (DateTool.compareYMD(struct.getPUCH_RTN_DATE(), dcs.getBUSINESS_OPR_DATE()) > 0) {
				setErrorMessage("AE00117");
				setErrorParameter("SYS_DATE_CTRL", "PLANT_CD", sysPLANT_CD);
				setErrorParameter(
					"SYS_DATE_CTRL",
					"BUSINESS_OPR_DATE",
					dcs.getBUSINESS_OPR_DATE());
				setErrorParameter(
					"T_PUCH_ODR_RTN_DATE",
					"PUCH_RTN_DATE",
					struct.getPUCH_RTN_DATE());
			}
			
			// 製番計画存在チェック
			if (struct.getJOB_ODR_CD() != null && "".equals(struct.getJOB_ODR_CD()) == false) {
				List jobOdrList = entity.mT_JOB_ODR.read(conn, struct);
				if (jobOdrList.isEmpty()) {
					// エラー
					setErrorMessage("AE00110");
					setErrorParameter("T_JOB_ODR", "JOB_ODR_CD", struct.getJOB_ODR_CD());
					return;
				} else {
					// 製番計画.工場コードがログインユーザの工場コードと異なる場合エラー
					AE0120010Struct jobOdrStruct = (AE0120010Struct)(jobOdrList.get(0));
					if (sysPLANT_CD.equals(jobOdrStruct.getPLANT_CD()) == false) {
						// エラー
						setErrorMessage("AE00115");
						setErrorParameter("T_JOB_ODR", "JOB_ODR_CD", struct.getJOB_ODR_CD());
						setErrorParameter("T_JOB_ODR", "PLANT_CD", jobOdrStruct.getPLANT_CD());
						return;
					}
				}
			}
			
			// 「返品保管区コード」存在チェック
			List whList = entity.mM_WH.read(conn, struct);
			if (whList.isEmpty()) {
				// エラー
				setErrorMessage("AE00134");
				setErrorParameter("M_WH", "WH_CD", struct.getWH_CD());
				return;
			} else {
				// 保管区.工場コードがログインユーザの工場コードと異なる場合エラー
				AE0120010Struct whStruct = (AE0120010Struct)(whList.get(0));
				if (sysPLANT_CD.equals(whStruct.getPLANT_CD()) == false) {
					// エラー
					setErrorMessage("AE00135");
					setErrorParameter("T_JOB_ODR", "JOB_ODR_CD", struct.getJOB_ODR_CD());
					setErrorParameter("T_JOB_ODR", "PLANT_CD", whStruct.getPLANT_CD());
					return;
				}
				// 保管区.所要量計算対象フラグ=0：非の場合エラー
				if ("0".equals(whStruct.getMRP_FLG())) {
					// エラー
					setErrorMessage("AE00136");
					setErrorParameter("M_WH", "WH_CD", struct.getWH_CD());
					setErrorParameter("M_WH", "MRP_FLG", whStruct.getMRP_FLG());
				}
				// 保管区.倉庫区分=40：検査待ち保管区の場合エラー
				if ("40".equals(whStruct.getWH_TYP())) {
					// エラー
					setErrorMessage("AE00164");
					setErrorParameter("M_WH", "WH_CD", struct.getWH_CD());
					setErrorParameter("M_WH", "WH_TYP", whStruct.getWH_TYP());
				}
			}
			
			// 「発注担当者」存在チェック
			if (struct.getPUCH_ODR_PERSON() != null 
					&& "".equals(struct.getPUCH_ODR_PERSON()) == false) {
				List userList = entity.mUSER_MST.read(conn, struct);
				if (userList.isEmpty()) {
					// エラー
					setErrorMessage("AE00137");
					setErrorParameter("USER_MST", "USER_CD", struct.getPUCH_ODR_PERSON());
				}
			}
			
			// [通貨]情報を取得
			CurStruct cs = null;
			try {
				cs =
					CurControl.getData(conn, struct.getCOMPANY_CD(), struct.getVEND_CD());
			} catch(DataNotFoundException dnfe) {
				throw new ExpjException(dnfe);
			}
					
			String netAmount = "0";
			String discAmount = "0";
			String puchOdrAmount = "0";
			int figure = Integer.parseInt(cs.getDECIMAL_FIG());
			
			// 返品金額を再計算する
			
			puchOdrAmount =
					AmountCalculator.calcPuchOdrAmount(
							struct.getPUCH_RTN_QTY(),
							struct.getUNIT_COST(),
							cs.getROUND_TYP(),
							cs.getDECIMAL_FIG());
            if(!com.nec.jp.orteus.expj.util.Calculate.isNotInNumRange(puchOdrAmount)){
                // 多言語項目取得セット
               String ErrInfo = CoreTools.getRBString("Expj.PUCH_ODR_AMOUNT_3", resource);
          	   setErrorMessage("AA00215",ErrInfo);
          	   return;
            }
			// 計算結果が 本体金額 ＝ 返品金額 － 値引金額 でない場合エラー
			String amount = Calculate.subtract(puchOdrAmount, struct.getDISC_AMOUNT());
			if (Calculate.compare(struct.getNET_AMOUNT(), amount) != 0) {
				// エラー
				setErrorMessage("AE00147");
			}
			
			// 消費税区分存在チェック
			List taxList = entity.mM_TAX.read(conn, struct);
			if (taxList.isEmpty()) {
				// エラー
				setErrorMessage("AA01001");
				setErrorParameter("M_TAX", "TAX_CD", struct.getTAX_CD());
			}
			
			// エラーがあれば終了
			if (msgStruct.hasError()) {
				return;
			}
			
			// 在庫更新処理
			// 画面入力値を退避
			AE0120010Struct formStruct = new AE0120010Struct();
			formStruct.setStruct(struct);
			
			// 購入返品番号をキーに再読込
			List puchOdrRtnRsltList = entity.mT_PUCH_ODR_RTN_RSLT_LOCK.read(conn, struct);
			if (puchOdrRtnRsltList.isEmpty()) {
				setErrorMessage("ZZ06001");
				setErrorParameter("T_PUCH_ODR_RTN_RSLT", "PUCH_ODR_CD", struct.getPUCH_ODR_CD());
				return;
			}
			AE0120010Struct puchOdrRtnRsltStruct = (AE0120010Struct)(puchOdrRtnRsltList.get(0));
			
			// [購入返品実績]の更新数が異なる場合エラー
			if ((puchOdrRtnRsltStruct.getMODIFY_COUNT()).equals(
					formStruct.getMODIFY_COUNT()) == false) {
				setErrorMessage("ZZ01105");
				return;
			}
			
			if ((Calculate.compare(
					formStruct.getPUCH_RTN_QTY(), puchOdrRtnRsltStruct.getPUCH_RTN_QTY()) != 0 
					|| formStruct.getWH_CD().equals(puchOdrRtnRsltStruct.getWH_CD()) == false 
					|| formStruct.getPUCH_RTN_DATE().equals(
							puchOdrRtnRsltStruct.getPUCH_RTN_DATE()) == false) 
					&& "true".equals(formStruct.getc_NON_NO_ITEM_FLG()) == false) {
				
				// 在庫プラス更新
				updateStock(conn, formStruct, puchOdrRtnRsltStruct, 2);
				
				// 在庫マイナス更新
				updateStock(conn, formStruct, null, 1);
				// エラーがあれば終了
				if (msgStruct.hasError()) {
					return;
				}
				
			}
			
			// 購入返品実績更新
			updatePuchOdrRtnRslt(conn, formStruct, puchOdrRtnRsltStruct, 
					formStruct.getPUCH_ODR_CD(), 2);
			if (msgStruct.hasError()) {
				return;
			}
						
			// 画面の情報を設定
			puchOdrRtnRsltStruct.setc_NON_NO_ITEM_FLG(formStruct.getc_NON_NO_ITEM_FLG()); // 備品購入
			puchOdrRtnRsltStruct.setPUCH_RTN_DATE(formStruct.getPUCH_RTN_DATE()); // 返品日
			puchOdrRtnRsltStruct.setJOB_ODR_CD(formStruct.getJOB_ODR_CD()); // 製番
			
			if("".equals(struct.getITEM_CD()) || struct.getITEM_CD() == null){
				// 黒データ
				updatePastInspcAcptIF(conn, formStruct,puchOdrRtnRsltStruct,
						null, struct.getPUCH_ODR_CD(), 2);
				// 赤データ
				updatePastInspcAcptIF(conn, formStruct,puchOdrRtnRsltStruct, 
						null, struct.getPUCH_ODR_CD(), 3);
			}else{
				// 検収履歴、検収実績情報インターフェース追加
				if (!itemList.isEmpty()) {
					itemStruct = (AE0120010Struct) (itemList.get(0));
					if ("2".equals(itemStruct.getSPL_ITEM_TYP()) == false) {
						// 品目の情報を設定
						puchOdrRtnRsltStruct.setITEM_NAME(struct.getITEM_NAME()); // 品目名
						puchOdrRtnRsltStruct.setSTOCK_UNIT(itemStruct.getSTOCK_UNIT()); // 計量単位
						puchOdrRtnRsltStruct.setPRODUCT_TYP(itemStruct.getPRODUCT_TYP()); // 製品区分
						puchOdrRtnRsltStruct.setCLASIFICATION_CD(itemStruct.getCLASIFICATION_CD()); // 管理コード
						// 黒データ
						updatePastInspcAcptIF(conn, formStruct,puchOdrRtnRsltStruct,
								itemStruct, struct.getPUCH_ODR_CD(), 2);
						// 赤データ
						updatePastInspcAcptIF(conn, formStruct,puchOdrRtnRsltStruct, 
								itemStruct, struct.getPUCH_ODR_CD(), 3);
					}
				}
			}

			// 更新後データ再表示
			controlSelect();
			
			conn.commit();
			
		} catch(ParseException e) {
			throw new ExpjException(e);
		} catch(DataNotFoundException e) {
			throw new ExpjException(e);
		} catch(SQLException e) {
			throw new ExpjException(e);
		} catch(ResourceBusyException rbe) {
			rbe.printStackTrace();
			setErrorMessage("ZZ01105");
			setReadStatus(ERROR);
		} finally {
			if (conn != null) {
				conn.rollback();
			}
		}
                //}}user_implement_dev:<controlUpdate>
		logger.exiting("AE0120010Control"+":USER="+struct.getsUser_ID(),"controlUpdate");

		return;
	}

	/**
	 * 削除ボタン押下時に実行される処理です。
	 *
	 */
	public void controlDelete() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0120");
		logger.entering("AE0120010Control"+":USER="+struct.getsUser_ID(),"controlDelete");
			//{{user_implement_dev:<controlDelete>
			// TODO: ユーザ定義のコードを記述してください
		try {
			
			AE0120010Struct formStruct = new AE0120010Struct();
			formStruct.setStruct(struct);
			
			
			// 生産側の過去の実績入力の制限チェック
			if(getSysParameter() == false){
				if(chkProcExecDate("3",struct.geth_PUCH_RTN_DATE(),struct.getPUCH_RTN_DATE()) == false){
					setErrorMessage(ProcExecDateError);
					setErrorParameter("SYS_ACTUAL_COST_CTRL_AC", "PLANT_CD", struct.getPLANT_CD());
					setErrorParameter("SYS_ACTUAL_COST_CTRL_AC", "PROC_EXEC_DATE", struct.getPROC_EXEC_DATE().toString());
					return;
				}
			}
					
			// 購入返品番号をキーに再読込とロック
			List puchOdrRtnRsltList = entity.mT_PUCH_ODR_RTN_RSLT_LOCK.read(conn, struct);
			if (puchOdrRtnRsltList.isEmpty()) {
				setErrorMessage("ZZ06001");
				setErrorParameter("T_PUCH_ODR_RTN_RSLT", "PUCH_ODR_CD", struct.getPUCH_ODR_CD());
				return;
			}
			AE0120010Struct puchOdrRtnRsltStruct = (AE0120010Struct)(puchOdrRtnRsltList.get(0));
			
			// [購入返品実績]の更新数が異なる場合エラー
			if ((puchOdrRtnRsltStruct.getMODIFY_COUNT()).equals(formStruct.getMODIFY_COUNT()) == false) {
				setErrorMessage("ZZ01105");
				return;
			}
			if ("true".equals(struct.getc_NON_NO_ITEM_FLG()) == false) {
				// 在庫更新
				updateStock(conn, formStruct, puchOdrRtnRsltStruct, 3);
				// エラーがあれば終了
				if (msgStruct.hasError()) {
					return;
				}
			}

			// [購入返品実績]の論理削除
			updatePuchOdrRtnRslt(conn, formStruct, null, formStruct.getPUCH_ODR_CD(), 3);
			if (msgStruct.hasError()) {
				return;
			}
			
			puchOdrRtnRsltStruct.setc_NON_NO_ITEM_FLG(struct.getc_NON_NO_ITEM_FLG()); // 備品購入
			
			if("".equals(struct.getITEM_CD()) || struct.getITEM_CD() == null){
				updatePastInspcAcptIF(conn, formStruct,puchOdrRtnRsltStruct, 
						null, struct.getPUCH_ODR_CD(), 4);
			}else{
				// 検収履歴、検収実績情報インターフェース追加
				AE0120010Struct itemStruct = null;
				List itemList = entity.mM_ITEM.read(conn, struct);
				//「品目番号」がNullではないの場合
				if ("".equals(struct.getITEM_CD()) == false) {
					if (itemList.isEmpty()) {
						// エラー
						setErrorMessage("AE00118");
						setErrorParameter("M_ITEM", "ITEM_CD", struct.getITEM_CD());
						return;
					} else {
						itemStruct = (AE0120010Struct) (itemList.get(0));
						if ("2".equals(itemStruct.getSPL_ITEM_TYP()) == false) {
							// 品目の情報を設定
							puchOdrRtnRsltStruct.setCLASIFICATION_CD(itemStruct.getCLASIFICATION_CD()); // 管理コード
							updatePastInspcAcptIF(conn, formStruct,puchOdrRtnRsltStruct, 
									itemStruct, struct.getPUCH_ODR_CD(), 4);
						}
					}
				}
			}

			conn.commit();
			
			initializeAll();
			
		} catch(ParseException e) {
			throw new ExpjException(e);
		} catch(DataNotFoundException e) {
			throw new ExpjException(e);
		} catch(SQLException e) {
			throw new ExpjException(e);
		} catch(ResourceBusyException rbe) {
			rbe.printStackTrace();
			setErrorMessage("ZZ01105");
			setReadStatus(ERROR);
		} finally {
			if (conn != null) {
				conn.rollback();
			}
		}
                //}}user_implement_dev:<controlDelete>
		logger.exiting("AE0120010Control"+":USER="+struct.getsUser_ID(),"controlDelete");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0120");
		logger.entering("AE0120010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
			// TODO: ユーザ定義のコードを記述してください
			
		try {
			
			// 画面を初期化
			initializeAll();
			
		} catch (FoundationException e) {
			throw new ExpjException(e);
		} catch (SQLException e) {
			throw new ExpjException(e);
		} catch (DataNotFoundException e) {
			throw new ExpjException(e);
		}
                //}}user_implement_dev:<controlClear>
		logger.exiting("AE0120010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0120");
		logger.entering("AE0120010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AE0120010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0120");
		logger.entering("AE0120010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
			// TODO: ユーザ定義のコードを記述してください
			// データベースへのアクセスを行う場合は、このtry catch文のコメントを外してください。
		try {
			// [自社]情報を部品より取得			
			_myCompanyStruct = MyCompanyControl.getData(conn);
			
			// [税名]情報を部品より取得			
			_taxNameStruct = TaxNameControl.getData(conn);
			
			// [邦貨]情報を部品より取得			
			_homeCurStruct = HomeCurControl.getData(conn);
			
			// コンボボックスデータを部品より取得
			ComboBox cdac = new ComboBox(conn, sysUSER_CD);
			_unitCostTypStruct = cdac.getData("UNIT_COST_TYP");
			_productTypStruct = cdac.getData("PRODUCT_TYP");
			cdac.setConnection(null);
			
			// 画面を初期化
			initializeAll();
			
			if(LotCtrl.checkLotCtrl(conn)){
				lotCtrl = "true";
			    struct.seth_lotCtrl(lotCtrl);

			}else{
				lotCtrl = "false";
				struct.seth_lotCtrl(lotCtrl);

			}
			
			// 画面遷移の呼び出しだったら、Structに画面遷移キーを設定してcontrolselect()を呼び出す
			if (isScreenMove() == true) {
				// キーとなる項目をstructに格納して、検索のコントロールメソッドを呼び出します。
              struct.setPUCH_ODR_CD(getPuchOdrCd());
              
              controlSelect();

			}
			
		} catch (FoundationException e) {
			throw new ExpjException(e);
		} catch (SQLException e) {
			throw new ExpjException(e);
		} catch (DataNotFoundException e) {
			throw new ExpjException(e);
		} catch (ComboException e) {
			throw new ExpjException(e);
		}
	
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AE0120010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * イベントハンドラの前処理です。
	 *
	 * @param buttun ボタン名
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0120");
		logger.entering("AE0120010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
                 // コンボボックスデータを部品より取得
		try {
			ComboBox cdac = new ComboBox(conn, sysUSER_CD);
			_unitCostTypStruct = cdac.getData("UNIT_COST_TYP");
			_productTypStruct = cdac.getData("PRODUCT_TYP");
			cdac.setConnection(null);
		} catch (SQLException e) {
			throw new ExpjException(e);
		} catch (ComboException e) {
			throw new ExpjException(e);
		}
			// コンボボックス部品のデータのセットはここに記述してください。
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("AE0120010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("SelectUnitCost") ) {
				controlSelectUnitCost();
			} else if( button.equals("Insert") ) {
				controlInsert();
			} else if( button.equals("Update") ) {
				controlUpdate();
			} else if( button.equals("Delete") ) {
				controlDelete();
			} else if( button.equals("Clear") ) {
				controlClear();
			} else if( button.equals("initial") ) {
				controlINITIAL();
			} else if( button.equals("reload") ) {
				controlRELOAD();
			}
		//{{user_implement_dev:<control_eventHandller>
			// TODO: ユーザ定義のコードを記述してください
			struct.seth_lotCtrl(lotCtrl);
			struct.setCOMPANY_CD(_myCompanyStruct.getCOMPANY_CD());
			struct.setHOME_CUR_UNIT(_homeCurStruct.getCUR_UNIT());
			struct.setHOME_DECIMAL_FIG(_homeCurStruct.getDECIMAL_FIG());
//		ソース内にまだAlarmMessageExceptionが残っている場合は、以下の行のコメントを外してAlarmMessageExceptionを始末する。
//		} catch(AlarmMessageException ame){
//			ExpjException ee = new ExpjException(ame, (ExpjMessageList)((Object)ame.getMessages()));
//			throw ee;
			struct.setList_UNIT_COST_TYP_val(_unitCostTypStruct.getValList());
			struct.setList_UNIT_COST_TYP_name(_unitCostTypStruct.getExplanList());
			struct.setList_PRODUCT_TYP_val(_productTypStruct.getValList());
            struct.setList_PRODUCT_TYP_name(_productTypStruct.getExplanList());
                //}}user_implement_dev:<control_eventHandller>
		} catch( BusinessLockException ble ) {
			// 枠メッセージ出力依頼作成
			setNewDataFlg(false);
		} catch( ResourceBusyException rbe ) {
			ExpjException ee = new ExpjException(rbe, "ZZ01105");
			throw ee;
		} catch( FoundationException e ) {
//			e.printStackTrace();
//			throw new FoundationException("AE0120010Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AE0120010-E999","CSVの出力処理"));
			throw new FoundationException("AE0120010Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AE0120010-E999","システム日付の取得処理"));
				throw new FoundationException("AE0120010Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AE0120010-E999","コントロールのイベント処理"));
			throw new FoundationException("AE0120010Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected AE0120010Entity entity;
	protected AE0120010Struct struct;
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

		entity = new AE0120010Entity();
		struct = new AE0120010Struct();

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
	 * AE0120010クラスの標準コンストラクタ
	 */
	public AE0120010Control() throws BusinessProcessException, FoundationException
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
				AE0120010Struct key = (AE0120010Struct)keyList.get(j);
				// メッセージキーを作成する
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("h_PUCH_ODR_CD") && key.geth_PUCH_ODR_CD() != null) {
					msgKey.setKeyValue("h_PUCH_ODR_CD", key.geth_PUCH_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("UNIT_COST_TYP_name") && key.getUNIT_COST_TYP_name() != null) {
					msgKey.setKeyValue("UNIT_COST_TYP_name", key.getUNIT_COST_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("UNIT_COST_TYP_val") && key.getUNIT_COST_TYP_val() != null) {
					msgKey.setKeyValue("UNIT_COST_TYP_val", key.getUNIT_COST_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("r1_FILTER") && key.getr1_FILTER() != null) {
					msgKey.setKeyValue("r1_FILTER", key.getr1_FILTER());
				}
				if(msgKeyType.containsKeyColumn("r2_FILTER") && key.getr2_FILTER() != null) {
					msgKey.setKeyValue("r2_FILTER", key.getr2_FILTER());
				}
				if(msgKeyType.containsKeyColumn("HOME_CUR_UNIT") && key.getHOME_CUR_UNIT() != null) {
					msgKey.setKeyValue("HOME_CUR_UNIT", key.getHOME_CUR_UNIT());
				}
				if(msgKeyType.containsKeyColumn("c_NON_NO_ITEM_FLG") && key.getc_NON_NO_ITEM_FLG() != null) {
					msgKey.setKeyValue("c_NON_NO_ITEM_FLG", key.getc_NON_NO_ITEM_FLG());
				}
				if(msgKeyType.containsKeyColumn("SelectUnitCostFlag") && key.getSelectUnitCostFlag() != null) {
					msgKey.setKeyValue("SelectUnitCostFlag", key.getSelectUnitCostFlag());
				}
				if(msgKeyType.containsKeyColumn("h_PUCH_RTN_DATE") && key.geth_PUCH_RTN_DATE() != null) {
					msgKey.setKeyValue("h_PUCH_RTN_DATE", key.geth_PUCH_RTN_DATE());
				}
				if(msgKeyType.containsKeyColumn("PRODUCT_TYP_name") && key.getPRODUCT_TYP_name() != null) {
					msgKey.setKeyValue("PRODUCT_TYP_name", key.getPRODUCT_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("PRODUCT_TYP_val") && key.getPRODUCT_TYP_val() != null) {
					msgKey.setKeyValue("PRODUCT_TYP_val", key.getPRODUCT_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("h_lotCtrl") && key.geth_lotCtrl() != null) {
					msgKey.setKeyValue("h_lotCtrl", key.geth_lotCtrl());
				}
				if(msgKeyType.containsKeyColumn("HOME_DECIMAL_FIG") && key.getHOME_DECIMAL_FIG() != null) {
					msgKey.setKeyValue("HOME_DECIMAL_FIG", key.getHOME_DECIMAL_FIG());
				}
				if(msgKeyType.containsKeyColumn("EFF_PHASE_IN_DATE") && key.getEFF_PHASE_IN_DATE() != null) {
					msgKey.setKeyValue("EFF_PHASE_IN_DATE", key.getEFF_PHASE_IN_DATE());
				}
				if(msgKeyType.containsKeyColumn("PUCH_SIZE") && key.getPUCH_SIZE() != null) {
					msgKey.setKeyValue("PUCH_SIZE", key.getPUCH_SIZE());
				}
				if(msgKeyType.containsKeyColumn("EXCH_TYP") && key.getEXCH_TYP() != null) {
					msgKey.setKeyValue("EXCH_TYP", key.getEXCH_TYP());
				}
				if(msgKeyType.containsKeyColumn("CUR_SYMBOL") && key.getCUR_SYMBOL() != null) {
					msgKey.setKeyValue("CUR_SYMBOL", key.getCUR_SYMBOL());
				}
				if(msgKeyType.containsKeyColumn("CUR_UNIT") && key.getCUR_UNIT() != null) {
					msgKey.setKeyValue("CUR_UNIT", key.getCUR_UNIT());
				}
				if(msgKeyType.containsKeyColumn("DECIMAL_FIG") && key.getDECIMAL_FIG() != null) {
					msgKey.setKeyValue("DECIMAL_FIG", key.getDECIMAL_FIG());
				}
				if(msgKeyType.containsKeyColumn("TAX_APPLY_TYP") && key.getTAX_APPLY_TYP() != null) {
					msgKey.setKeyValue("TAX_APPLY_TYP", key.getTAX_APPLY_TYP());
				}
				if(msgKeyType.containsKeyColumn("COMPANY_CD") && key.getCOMPANY_CD() != null) {
					msgKey.setKeyValue("COMPANY_CD", key.getCOMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("VEND_CD") && key.getVEND_CD() != null) {
					msgKey.setKeyValue("VEND_CD", key.getVEND_CD());
				}
				if(msgKeyType.containsKeyColumn("VEND_ANAME") && key.getVEND_ANAME() != null) {
					msgKey.setKeyValue("VEND_ANAME", key.getVEND_ANAME());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
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
				if(msgKeyType.containsKeyColumn("JOB_ODR_CD") && key.getJOB_ODR_CD() != null) {
					msgKey.setKeyValue("JOB_ODR_CD", key.getJOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_DETAIL_NO") && key.getJOB_ODR_DETAIL_NO() != null) {
					msgKey.setKeyValue("JOB_ODR_DETAIL_NO", key.getJOB_ODR_DETAIL_NO());
				}
				if(msgKeyType.containsKeyColumn("INV_CTRL_FLG") && key.getINV_CTRL_FLG() != null) {
					msgKey.setKeyValue("INV_CTRL_FLG", key.getINV_CTRL_FLG());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_PERSON") && key.getPUCH_ODR_PERSON() != null) {
					msgKey.setKeyValue("PUCH_ODR_PERSON", key.getPUCH_ODR_PERSON());
				}
				if(msgKeyType.containsKeyColumn("PUCH_RTN_DATE") && key.getPUCH_RTN_DATE() != null) {
					msgKey.setKeyValue("PUCH_RTN_DATE", key.getPUCH_RTN_DATE());
				}
				if(msgKeyType.containsKeyColumn("PUCH_RTN_QTY") && key.getPUCH_RTN_QTY() != null) {
					msgKey.setKeyValue("PUCH_RTN_QTY", key.getPUCH_RTN_QTY());
				}
				if(msgKeyType.containsKeyColumn("WH_CD") && key.getWH_CD() != null) {
					msgKey.setKeyValue("WH_CD", key.getWH_CD());
				}
				if(msgKeyType.containsKeyColumn("WH_NAME") && key.getWH_NAME() != null) {
					msgKey.setKeyValue("WH_NAME", key.getWH_NAME());
				}
				if(msgKeyType.containsKeyColumn("VEND_LOT_NO") && key.getVEND_LOT_NO() != null) {
					msgKey.setKeyValue("VEND_LOT_NO", key.getVEND_LOT_NO());
				}
				if(msgKeyType.containsKeyColumn("LOT_NO") && key.getLOT_NO() != null) {
					msgKey.setKeyValue("LOT_NO", key.getLOT_NO());
				}
				if(msgKeyType.containsKeyColumn("CUR_CD") && key.getCUR_CD() != null) {
					msgKey.setKeyValue("CUR_CD", key.getCUR_CD());
				}
				if(msgKeyType.containsKeyColumn("CUR_NAME") && key.getCUR_NAME() != null) {
					msgKey.setKeyValue("CUR_NAME", key.getCUR_NAME());
				}
				if(msgKeyType.containsKeyColumn("VEND_CUR_UNIT") && key.getVEND_CUR_UNIT() != null) {
					msgKey.setKeyValue("VEND_CUR_UNIT", key.getVEND_CUR_UNIT());
				}
				if(msgKeyType.containsKeyColumn("VEND_DECIMAL_FIG") && key.getVEND_DECIMAL_FIG() != null) {
					msgKey.setKeyValue("VEND_DECIMAL_FIG", key.getVEND_DECIMAL_FIG());
				}
				if(msgKeyType.containsKeyColumn("USER_NAME") && key.getUSER_NAME() != null) {
					msgKey.setKeyValue("USER_NAME", key.getUSER_NAME());
				}
				if(msgKeyType.containsKeyColumn("UNIT_COST_TYP") && key.getUNIT_COST_TYP() != null) {
					msgKey.setKeyValue("UNIT_COST_TYP", key.getUNIT_COST_TYP());
				}
				if(msgKeyType.containsKeyColumn("UNIT_COST") && key.getUNIT_COST() != null) {
					msgKey.setKeyValue("UNIT_COST", key.getUNIT_COST());
				}
				if(msgKeyType.containsKeyColumn("PROCESSING_COST") && key.getPROCESSING_COST() != null) {
					msgKey.setKeyValue("PROCESSING_COST", key.getPROCESSING_COST());
				}
				if(msgKeyType.containsKeyColumn("MATERIAL_COST") && key.getMATERIAL_COST() != null) {
					msgKey.setKeyValue("MATERIAL_COST", key.getMATERIAL_COST());
				}
				if(msgKeyType.containsKeyColumn("OTHER_OVERHEADS") && key.getOTHER_OVERHEADS() != null) {
					msgKey.setKeyValue("OTHER_OVERHEADS", key.getOTHER_OVERHEADS());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_AMOUNT") && key.getPUCH_ODR_AMOUNT() != null) {
					msgKey.setKeyValue("PUCH_ODR_AMOUNT", key.getPUCH_ODR_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("DISC_AMOUNT") && key.getDISC_AMOUNT() != null) {
					msgKey.setKeyValue("DISC_AMOUNT", key.getDISC_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("NET_AMOUNT") && key.getNET_AMOUNT() != null) {
					msgKey.setKeyValue("NET_AMOUNT", key.getNET_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("PUCH_RTN_COMMENT") && key.getPUCH_RTN_COMMENT() != null) {
					msgKey.setKeyValue("PUCH_RTN_COMMENT", key.getPUCH_RTN_COMMENT());
				}
				if(msgKeyType.containsKeyColumn("RATE_JUDGE_DATE") && key.getRATE_JUDGE_DATE() != null) {
					msgKey.setKeyValue("RATE_JUDGE_DATE", key.getRATE_JUDGE_DATE());
				}
				if(msgKeyType.containsKeyColumn("EXCH_RATE") && key.getEXCH_RATE() != null) {
					msgKey.setKeyValue("EXCH_RATE", key.getEXCH_RATE());
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
				if(msgKeyType.containsKeyColumn("TAX_AMOUNT_1") && key.getTAX_AMOUNT_1() != null) {
					msgKey.setKeyValue("TAX_AMOUNT_1", key.getTAX_AMOUNT_1());
				}
				if(msgKeyType.containsKeyColumn("TAX_AMOUNT_2") && key.getTAX_AMOUNT_2() != null) {
					msgKey.setKeyValue("TAX_AMOUNT_2", key.getTAX_AMOUNT_2());
				}
				if(msgKeyType.containsKeyColumn("TAX_AMOUNT_3") && key.getTAX_AMOUNT_3() != null) {
					msgKey.setKeyValue("TAX_AMOUNT_3", key.getTAX_AMOUNT_3());
				}
				if(msgKeyType.containsKeyColumn("AMOUNT_INCLUDE_TAX") && key.getAMOUNT_INCLUDE_TAX() != null) {
					msgKey.setKeyValue("AMOUNT_INCLUDE_TAX", key.getAMOUNT_INCLUDE_TAX());
				}
				if(msgKeyType.containsKeyColumn("HOME_CUR_AMOUNT") && key.getHOME_CUR_AMOUNT() != null) {
					msgKey.setKeyValue("HOME_CUR_AMOUNT", key.getHOME_CUR_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("ROUND_TYP") && key.getROUND_TYP() != null) {
					msgKey.setKeyValue("ROUND_TYP", key.getROUND_TYP());
				}
				if(msgKeyType.containsKeyColumn("TAX_CD") && key.getTAX_CD() != null) {
					msgKey.setKeyValue("TAX_CD", key.getTAX_CD());
				}
				if(msgKeyType.containsKeyColumn("TAX_ROUND_TYP") && key.getTAX_ROUND_TYP() != null) {
					msgKey.setKeyValue("TAX_ROUND_TYP", key.getTAX_ROUND_TYP());
				}
				if(msgKeyType.containsKeyColumn("RTN_DEL_FLG") && key.getRTN_DEL_FLG() != null) {
					msgKey.setKeyValue("RTN_DEL_FLG", key.getRTN_DEL_FLG());
				}
				if(msgKeyType.containsKeyColumn("MODIFY_COUNT") && key.getMODIFY_COUNT() != null) {
					msgKey.setKeyValue("MODIFY_COUNT", key.getMODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("NON_NO_ITEM_TYP") && key.getNON_NO_ITEM_TYP() != null) {
					msgKey.setKeyValue("NON_NO_ITEM_TYP", key.getNON_NO_ITEM_TYP());
				}
				if(msgKeyType.containsKeyColumn("NON_NO_ITEM_NAME") && key.getNON_NO_ITEM_NAME() != null) {
					msgKey.setKeyValue("NON_NO_ITEM_NAME", key.getNON_NO_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("NON_NO_ITEM_PUCH_ODR_UNIT") && key.getNON_NO_ITEM_PUCH_ODR_UNIT() != null) {
					msgKey.setKeyValue("NON_NO_ITEM_PUCH_ODR_UNIT", key.getNON_NO_ITEM_PUCH_ODR_UNIT());
				}
				if(msgKeyType.containsKeyColumn("ITEM_TYP") && key.getITEM_TYP() != null) {
					msgKey.setKeyValue("ITEM_TYP", key.getITEM_TYP());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_CD") && key.getPUCH_ODR_CD() != null) {
					msgKey.setKeyValue("PUCH_ODR_CD", key.getPUCH_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("RTN_DEL_DATE") && key.getRTN_DEL_DATE() != null) {
					msgKey.setKeyValue("RTN_DEL_DATE", key.getRTN_DEL_DATE());
				}
				if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP") && key.getUNIT_QTY_TYP() != null) {
					msgKey.setKeyValue("UNIT_QTY_TYP", key.getUNIT_QTY_TYP());
				}
				if(msgKeyType.containsKeyColumn("SPL_ITEM_TYP") && key.getSPL_ITEM_TYP() != null) {
					msgKey.setKeyValue("SPL_ITEM_TYP", key.getSPL_ITEM_TYP());
				}
				if(msgKeyType.containsKeyColumn("PRODUCT_TYP") && key.getPRODUCT_TYP() != null) {
					msgKey.setKeyValue("PRODUCT_TYP", key.getPRODUCT_TYP());
				}
				if(msgKeyType.containsKeyColumn("CLASIFICATION_CD") && key.getCLASIFICATION_CD() != null) {
					msgKey.setKeyValue("CLASIFICATION_CD", key.getCLASIFICATION_CD());
				}
				if(msgKeyType.containsKeyColumn("LOT_CTRL_FLG") && key.getLOT_CTRL_FLG() != null) {
					msgKey.setKeyValue("LOT_CTRL_FLG", key.getLOT_CTRL_FLG());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP") && key.getMRP_ODR_TYP() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP", key.getMRP_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_CD_2") && key.getPUCH_ODR_CD_2() != null) {
					msgKey.setKeyValue("PUCH_ODR_CD_2", key.getPUCH_ODR_CD_2());
				}
				if(msgKeyType.containsKeyColumn("MRP_FLG") && key.getMRP_FLG() != null) {
					msgKey.setKeyValue("MRP_FLG", key.getMRP_FLG());
				}
				if(msgKeyType.containsKeyColumn("WH_TYP") && key.getWH_TYP() != null) {
					msgKey.setKeyValue("WH_TYP", key.getWH_TYP());
				}
				if(msgKeyType.containsKeyColumn("THIS_MONTH") && key.getTHIS_MONTH() != null) {
					msgKey.setKeyValue("THIS_MONTH", key.getTHIS_MONTH());
				}
				if(msgKeyType.containsKeyColumn("INSTALL_FLG") && key.getINSTALL_FLG() != null) {
					msgKey.setKeyValue("INSTALL_FLG", key.getINSTALL_FLG());
				}
				if(msgKeyType.containsKeyColumn("STOCK_ON_HAND_QTY") && key.getSTOCK_ON_HAND_QTY() != null) {
					msgKey.setKeyValue("STOCK_ON_HAND_QTY", key.getSTOCK_ON_HAND_QTY());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_CTRL_CD") && key.getRCV_ISSUE_CTRL_CD() != null) {
					msgKey.setKeyValue("RCV_ISSUE_CTRL_CD", key.getRCV_ISSUE_CTRL_CD());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_TYP") && key.getRCV_ISSUE_TYP() != null) {
					msgKey.setKeyValue("RCV_ISSUE_TYP", key.getRCV_ISSUE_TYP());
				}
				if(msgKeyType.containsKeyColumn("ACPT_NO") && key.getACPT_NO() != null) {
					msgKey.setKeyValue("ACPT_NO", key.getACPT_NO());
				}
				if(msgKeyType.containsKeyColumn("ACPT_RSLT_CRCT_NO") && key.getACPT_RSLT_CRCT_NO() != null) {
					msgKey.setKeyValue("ACPT_RSLT_CRCT_NO", key.getACPT_RSLT_CRCT_NO());
				}
				if(msgKeyType.containsKeyColumn("INSPEC_RSLT_CRCT_NO") && key.getINSPEC_RSLT_CRCT_NO() != null) {
					msgKey.setKeyValue("INSPEC_RSLT_CRCT_NO", key.getINSPEC_RSLT_CRCT_NO());
				}
				if(msgKeyType.containsKeyColumn("PARTIAL_PRD_NO") && key.getPARTIAL_PRD_NO() != null) {
					msgKey.setKeyValue("PARTIAL_PRD_NO", key.getPARTIAL_PRD_NO());
				}
				if(msgKeyType.containsKeyColumn("OPR_RSLT_CRCT_NO") && key.getOPR_RSLT_CRCT_NO() != null) {
					msgKey.setKeyValue("OPR_RSLT_CRCT_NO", key.getOPR_RSLT_CRCT_NO());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_BEFORE_QTY") && key.getRCV_ISSUE_BEFORE_QTY() != null) {
					msgKey.setKeyValue("RCV_ISSUE_BEFORE_QTY", key.getRCV_ISSUE_BEFORE_QTY());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_QTY") && key.getRCV_ISSUE_QTY() != null) {
					msgKey.setKeyValue("RCV_ISSUE_QTY", key.getRCV_ISSUE_QTY());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_AFTER_QTY") && key.getRCV_ISSUE_AFTER_QTY() != null) {
					msgKey.setKeyValue("RCV_ISSUE_AFTER_QTY", key.getRCV_ISSUE_AFTER_QTY());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_AMOUNT") && key.getRCV_ISSUE_AMOUNT() != null) {
					msgKey.setKeyValue("RCV_ISSUE_AMOUNT", key.getRCV_ISSUE_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_DATE") && key.getRCV_ISSUE_DATE() != null) {
					msgKey.setKeyValue("RCV_ISSUE_DATE", key.getRCV_ISSUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_GNR_TYP") && key.getRCV_ISSUE_GNR_TYP() != null) {
					msgKey.setKeyValue("RCV_ISSUE_GNR_TYP", key.getRCV_ISSUE_GNR_TYP());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_ODD_QTY") && key.getRCV_ISSUE_ODD_QTY() != null) {
					msgKey.setKeyValue("RCV_ISSUE_ODD_QTY", key.getRCV_ISSUE_ODD_QTY());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UPD_TYP") && key.getSTOCK_UPD_TYP() != null) {
					msgKey.setKeyValue("STOCK_UPD_TYP", key.getSTOCK_UPD_TYP());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_CMPLT_FLG") && key.getRCV_ISSUE_CMPLT_FLG() != null) {
					msgKey.setKeyValue("RCV_ISSUE_CMPLT_FLG", key.getRCV_ISSUE_CMPLT_FLG());
				}
				if(msgKeyType.containsKeyColumn("CONS_TYP") && key.getCONS_TYP() != null) {
					msgKey.setKeyValue("CONS_TYP", key.getCONS_TYP());
				}
				if(msgKeyType.containsKeyColumn("INSPC_ACPT_NO") && key.getINSPC_ACPT_NO() != null) {
					msgKey.setKeyValue("INSPC_ACPT_NO", key.getINSPC_ACPT_NO());
				}
				if(msgKeyType.containsKeyColumn("INSPC_ACPT_GNR_TYP") && key.getINSPC_ACPT_GNR_TYP() != null) {
					msgKey.setKeyValue("INSPC_ACPT_GNR_TYP", key.getINSPC_ACPT_GNR_TYP());
				}
				if(msgKeyType.containsKeyColumn("CRCT_NO") && key.getCRCT_NO() != null) {
					msgKey.setKeyValue("CRCT_NO", key.getCRCT_NO());
				}
				if(msgKeyType.containsKeyColumn("CRCT_TYP") && key.getCRCT_TYP() != null) {
					msgKey.setKeyValue("CRCT_TYP", key.getCRCT_TYP());
				}
				if(msgKeyType.containsKeyColumn("SLIP_TYP") && key.getSLIP_TYP() != null) {
					msgKey.setKeyValue("SLIP_TYP", key.getSLIP_TYP());
				}
				if(msgKeyType.containsKeyColumn("ACPT_QTY") && key.getACPT_QTY() != null) {
					msgKey.setKeyValue("ACPT_QTY", key.getACPT_QTY());
				}
				if(msgKeyType.containsKeyColumn("INSPC_ACPT_QTY") && key.getINSPC_ACPT_QTY() != null) {
					msgKey.setKeyValue("INSPC_ACPT_QTY", key.getINSPC_ACPT_QTY());
				}
				if(msgKeyType.containsKeyColumn("INSPC_ACPT_AMOUNT") && key.getINSPC_ACPT_AMOUNT() != null) {
					msgKey.setKeyValue("INSPC_ACPT_AMOUNT", key.getINSPC_ACPT_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("SAVING_AMOUNT") && key.getSAVING_AMOUNT() != null) {
					msgKey.setKeyValue("SAVING_AMOUNT", key.getSAVING_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("ACPT_DATE") && key.getACPT_DATE() != null) {
					msgKey.setKeyValue("ACPT_DATE", key.getACPT_DATE());
				}
				if(msgKeyType.containsKeyColumn("INSPC_ACPT_DATE") && key.getINSPC_ACPT_DATE() != null) {
					msgKey.setKeyValue("INSPC_ACPT_DATE", key.getINSPC_ACPT_DATE());
				}
				if(msgKeyType.containsKeyColumn("SLIP_CD") && key.getSLIP_CD() != null) {
					msgKey.setKeyValue("SLIP_CD", key.getSLIP_CD());
				}
				if(msgKeyType.containsKeyColumn("ORGN_SLIP_CD") && key.getORGN_SLIP_CD() != null) {
					msgKey.setKeyValue("ORGN_SLIP_CD", key.getORGN_SLIP_CD());
				}
				if(msgKeyType.containsKeyColumn("WORK_IN_PROC_CD") && key.getWORK_IN_PROC_CD() != null) {
					msgKey.setKeyValue("WORK_IN_PROC_CD", key.getWORK_IN_PROC_CD());
				}
				if(msgKeyType.containsKeyColumn("DLV_CD") && key.getDLV_CD() != null) {
					msgKey.setKeyValue("DLV_CD", key.getDLV_CD());
				}
				if(msgKeyType.containsKeyColumn("GNR_ORG_CD") && key.getGNR_ORG_CD() != null) {
					msgKey.setKeyValue("GNR_ORG_CD", key.getGNR_ORG_CD());
				}
				if(msgKeyType.containsKeyColumn("SBCNT_PUCH_TYP") && key.getSBCNT_PUCH_TYP() != null) {
					msgKey.setKeyValue("SBCNT_PUCH_TYP", key.getSBCNT_PUCH_TYP());
				}
				if(msgKeyType.containsKeyColumn("PUCH_RTN_FLG") && key.getPUCH_RTN_FLG() != null) {
					msgKey.setKeyValue("PUCH_RTN_FLG", key.getPUCH_RTN_FLG());
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
				if(msgKeyType.containsKeyColumn("PAST_RESULT_ENTRY_TYP") && key.getPAST_RESULT_ENTRY_TYP() != null) {
					msgKey.setKeyValue("PAST_RESULT_ENTRY_TYP", key.getPAST_RESULT_ENTRY_TYP());
				}
				if(msgKeyType.containsKeyColumn("AI_IF") && key.getAI_IF() != null) {
					msgKey.setKeyValue("AI_IF", key.getAI_IF());
				}
				if(msgKeyType.containsKeyColumn("PVC2BUSINESSNAME") && key.getPVC2BUSINESSNAME() != null) {
					msgKey.setKeyValue("PVC2BUSINESSNAME", key.getPVC2BUSINESSNAME());
				}
				if(msgKeyType.containsKeyColumn("PVC2OUTPUTPATH") && key.getPVC2OUTPUTPATH() != null) {
					msgKey.setKeyValue("PVC2OUTPUTPATH", key.getPVC2OUTPUTPATH());
				}
				if(msgKeyType.containsKeyColumn("PVC2OUTPUTNAME") && key.getPVC2OUTPUTNAME() != null) {
					msgKey.setKeyValue("PVC2OUTPUTNAME", key.getPVC2OUTPUTNAME());
				}
				if(msgKeyType.containsKeyColumn("PVC2LOGMODE") && key.getPVC2LOGMODE() != null) {
					msgKey.setKeyValue("PVC2LOGMODE", key.getPVC2LOGMODE());
				}
				if(msgKeyType.containsKeyColumn("PVC2OUTPUTMODE") && key.getPVC2OUTPUTMODE() != null) {
					msgKey.setKeyValue("PVC2OUTPUTMODE", key.getPVC2OUTPUTMODE());
				}
				if(msgKeyType.containsKeyColumn("PVC2USERID") && key.getPVC2USERID() != null) {
					msgKey.setKeyValue("PVC2USERID", key.getPVC2USERID());
				}
				if(msgKeyType.containsKeyColumn("PVC2PLANTCD") && key.getPVC2PLANTCD() != null) {
					msgKey.setKeyValue("PVC2PLANTCD", key.getPVC2PLANTCD());
				}
				if(msgKeyType.containsKeyColumn("PVC2TAXID") && key.getPVC2TAXID() != null) {
					msgKey.setKeyValue("PVC2TAXID", key.getPVC2TAXID());
				}
				if(msgKeyType.containsKeyColumn("PNUMTAXOUTAMOUNT") && key.getPNUMTAXOUTAMOUNT() != null) {
					msgKey.setKeyValue("PNUMTAXOUTAMOUNT", key.getPNUMTAXOUTAMOUNT());
				}
				if(msgKeyType.containsKeyColumn("PNUMTAXAMOUNT") && key.getPNUMTAXAMOUNT() != null) {
					msgKey.setKeyValue("PNUMTAXAMOUNT", key.getPNUMTAXAMOUNT());
				}
				if(msgKeyType.containsKeyColumn("PNUMEXTERNALTAXSALESAMOUNT") && key.getPNUMEXTERNALTAXSALESAMOUNT() != null) {
					msgKey.setKeyValue("PNUMEXTERNALTAXSALESAMOUNT", key.getPNUMEXTERNALTAXSALESAMOUNT());
				}
				if(msgKeyType.containsKeyColumn("PNUMINTERNALTAXSALESAMOUNT") && key.getPNUMINTERNALTAXSALESAMOUNT() != null) {
					msgKey.setKeyValue("PNUMINTERNALTAXSALESAMOUNT", key.getPNUMINTERNALTAXSALESAMOUNT());
				}
				if(msgKeyType.containsKeyColumn("PNUMTAXFREESALESAMOUNT") && key.getPNUMTAXFREESALESAMOUNT() != null) {
					msgKey.setKeyValue("PNUMTAXFREESALESAMOUNT", key.getPNUMTAXFREESALESAMOUNT());
				}
				if(msgKeyType.containsKeyColumn("PNUMEXTERNALTAXAMOUNT") && key.getPNUMEXTERNALTAXAMOUNT() != null) {
					msgKey.setKeyValue("PNUMEXTERNALTAXAMOUNT", key.getPNUMEXTERNALTAXAMOUNT());
				}
				if(msgKeyType.containsKeyColumn("PNUMINTERNALTAXAMOUNT") && key.getPNUMINTERNALTAXAMOUNT() != null) {
					msgKey.setKeyValue("PNUMINTERNALTAXAMOUNT", key.getPNUMINTERNALTAXAMOUNT());
				}
				if(msgKeyType.containsKeyColumn("PVC2ERRCD") && key.getPVC2ERRCD() != null) {
					msgKey.setKeyValue("PVC2ERRCD", key.getPVC2ERRCD());
				}
				if(msgKeyType.containsKeyColumn("PNUMSTATUS") && key.getPNUMSTATUS() != null) {
					msgKey.setKeyValue("PNUMSTATUS", key.getPNUMSTATUS());
				}
				if(msgKeyType.containsKeyColumn("OLD_TAX_RATE_1") && key.getOLD_TAX_RATE_1() != null) {
					msgKey.setKeyValue("OLD_TAX_RATE_1", key.getOLD_TAX_RATE_1());
				}
				if(msgKeyType.containsKeyColumn("OLD_TAX_RATE_2") && key.getOLD_TAX_RATE_2() != null) {
					msgKey.setKeyValue("OLD_TAX_RATE_2", key.getOLD_TAX_RATE_2());
				}
				if(msgKeyType.containsKeyColumn("OLD_TAX_RATE_3") && key.getOLD_TAX_RATE_3() != null) {
					msgKey.setKeyValue("OLD_TAX_RATE_3", key.getOLD_TAX_RATE_3());
				}
				if(msgKeyType.containsKeyColumn("NEW_TAX_RATE_START_DATE") && key.getNEW_TAX_RATE_START_DATE() != null) {
					msgKey.setKeyValue("NEW_TAX_RATE_START_DATE", key.getNEW_TAX_RATE_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("NEW_TAX_RATE_1") && key.getNEW_TAX_RATE_1() != null) {
					msgKey.setKeyValue("NEW_TAX_RATE_1", key.getNEW_TAX_RATE_1());
				}
				if(msgKeyType.containsKeyColumn("NEW_TAX_RATE_2") && key.getNEW_TAX_RATE_2() != null) {
					msgKey.setKeyValue("NEW_TAX_RATE_2", key.getNEW_TAX_RATE_2());
				}
				if(msgKeyType.containsKeyColumn("NEW_TAX_RATE_3") && key.getNEW_TAX_RATE_3() != null) {
					msgKey.setKeyValue("NEW_TAX_RATE_3", key.getNEW_TAX_RATE_3());
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
					AE0120010Struct key = new AE0120010Struct();
					if(msgKeyType.containsKeyColumn("h_PUCH_ODR_CD")) {
						key.seth_PUCH_ODR_CD(msgKey.getKeyValue("h_PUCH_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_COST_TYP_name")) {
						key.setUNIT_COST_TYP_name(msgKey.getKeyValue("UNIT_COST_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_COST_TYP_val")) {
						key.setUNIT_COST_TYP_val(msgKey.getKeyValue("UNIT_COST_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("r1_FILTER")) {
						key.setr1_FILTER(msgKey.getKeyValue("r1_FILTER"));
					}
					if(msgKeyType.containsKeyColumn("r2_FILTER")) {
						key.setr2_FILTER(msgKey.getKeyValue("r2_FILTER"));
					}
					if(msgKeyType.containsKeyColumn("HOME_CUR_UNIT")) {
						key.setHOME_CUR_UNIT(msgKey.getKeyValue("HOME_CUR_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("c_NON_NO_ITEM_FLG")) {
						key.setc_NON_NO_ITEM_FLG(msgKey.getKeyValue("c_NON_NO_ITEM_FLG"));
					}
					if(msgKeyType.containsKeyColumn("SelectUnitCostFlag")) {
						key.setSelectUnitCostFlag(msgKey.getKeyValue("SelectUnitCostFlag"));
					}
					if(msgKeyType.containsKeyColumn("h_PUCH_RTN_DATE")) {
						key.seth_PUCH_RTN_DATE(msgKey.getKeyValue("h_PUCH_RTN_DATE"));
					}
					if(msgKeyType.containsKeyColumn("PRODUCT_TYP_name")) {
						key.setPRODUCT_TYP_name(msgKey.getKeyValue("PRODUCT_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("PRODUCT_TYP_val")) {
						key.setPRODUCT_TYP_val(msgKey.getKeyValue("PRODUCT_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("h_lotCtrl")) {
						key.seth_lotCtrl(msgKey.getKeyValue("h_lotCtrl"));
					}
					if(msgKeyType.containsKeyColumn("HOME_DECIMAL_FIG")) {
						key.setHOME_DECIMAL_FIG(msgKey.getKeyValue("HOME_DECIMAL_FIG"));
					}
					if(msgKeyType.containsKeyColumn("EFF_PHASE_IN_DATE")) {
						key.setEFF_PHASE_IN_DATE(msgKey.getKeyValue("EFF_PHASE_IN_DATE"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_SIZE")) {
						key.setPUCH_SIZE(msgKey.getKeyValue("PUCH_SIZE"));
					}
					if(msgKeyType.containsKeyColumn("EXCH_TYP")) {
						key.setEXCH_TYP(msgKey.getKeyValue("EXCH_TYP"));
					}
					if(msgKeyType.containsKeyColumn("CUR_SYMBOL")) {
						key.setCUR_SYMBOL(msgKey.getKeyValue("CUR_SYMBOL"));
					}
					if(msgKeyType.containsKeyColumn("CUR_UNIT")) {
						key.setCUR_UNIT(msgKey.getKeyValue("CUR_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("DECIMAL_FIG")) {
						key.setDECIMAL_FIG(msgKey.getKeyValue("DECIMAL_FIG"));
					}
					if(msgKeyType.containsKeyColumn("TAX_APPLY_TYP")) {
						key.setTAX_APPLY_TYP(msgKey.getKeyValue("TAX_APPLY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("COMPANY_CD")) {
						key.setCOMPANY_CD(msgKey.getKeyValue("COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("VEND_CD")) {
						key.setVEND_CD(msgKey.getKeyValue("VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("VEND_ANAME")) {
						key.setVEND_ANAME(msgKey.getKeyValue("VEND_ANAME"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
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
					if(msgKeyType.containsKeyColumn("JOB_ODR_CD")) {
						key.setJOB_ODR_CD(msgKey.getKeyValue("JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_DETAIL_NO")) {
						key.setJOB_ODR_DETAIL_NO(msgKey.getKeyValue("JOB_ODR_DETAIL_NO"));
					}
					if(msgKeyType.containsKeyColumn("INV_CTRL_FLG")) {
						key.setINV_CTRL_FLG(msgKey.getKeyValue("INV_CTRL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_PERSON")) {
						key.setPUCH_ODR_PERSON(msgKey.getKeyValue("PUCH_ODR_PERSON"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_RTN_DATE")) {
						key.setPUCH_RTN_DATE(msgKey.getKeyValue("PUCH_RTN_DATE"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_RTN_QTY")) {
						key.setPUCH_RTN_QTY(msgKey.getKeyValue("PUCH_RTN_QTY"));
					}
					if(msgKeyType.containsKeyColumn("WH_CD")) {
						key.setWH_CD(msgKey.getKeyValue("WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("WH_NAME")) {
						key.setWH_NAME(msgKey.getKeyValue("WH_NAME"));
					}
					if(msgKeyType.containsKeyColumn("VEND_LOT_NO")) {
						key.setVEND_LOT_NO(msgKey.getKeyValue("VEND_LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("LOT_NO")) {
						key.setLOT_NO(msgKey.getKeyValue("LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("CUR_CD")) {
						key.setCUR_CD(msgKey.getKeyValue("CUR_CD"));
					}
					if(msgKeyType.containsKeyColumn("CUR_NAME")) {
						key.setCUR_NAME(msgKey.getKeyValue("CUR_NAME"));
					}
					if(msgKeyType.containsKeyColumn("VEND_CUR_UNIT")) {
						key.setVEND_CUR_UNIT(msgKey.getKeyValue("VEND_CUR_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("VEND_DECIMAL_FIG")) {
						key.setVEND_DECIMAL_FIG(msgKey.getKeyValue("VEND_DECIMAL_FIG"));
					}
					if(msgKeyType.containsKeyColumn("USER_NAME")) {
						key.setUSER_NAME(msgKey.getKeyValue("USER_NAME"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_COST_TYP")) {
						key.setUNIT_COST_TYP(msgKey.getKeyValue("UNIT_COST_TYP"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_COST")) {
						key.setUNIT_COST(msgKey.getKeyValue("UNIT_COST"));
					}
					if(msgKeyType.containsKeyColumn("PROCESSING_COST")) {
						key.setPROCESSING_COST(msgKey.getKeyValue("PROCESSING_COST"));
					}
					if(msgKeyType.containsKeyColumn("MATERIAL_COST")) {
						key.setMATERIAL_COST(msgKey.getKeyValue("MATERIAL_COST"));
					}
					if(msgKeyType.containsKeyColumn("OTHER_OVERHEADS")) {
						key.setOTHER_OVERHEADS(msgKey.getKeyValue("OTHER_OVERHEADS"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_AMOUNT")) {
						key.setPUCH_ODR_AMOUNT(msgKey.getKeyValue("PUCH_ODR_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("DISC_AMOUNT")) {
						key.setDISC_AMOUNT(msgKey.getKeyValue("DISC_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("NET_AMOUNT")) {
						key.setNET_AMOUNT(msgKey.getKeyValue("NET_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_RTN_COMMENT")) {
						key.setPUCH_RTN_COMMENT(msgKey.getKeyValue("PUCH_RTN_COMMENT"));
					}
					if(msgKeyType.containsKeyColumn("RATE_JUDGE_DATE")) {
						key.setRATE_JUDGE_DATE(msgKey.getKeyValue("RATE_JUDGE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("EXCH_RATE")) {
						key.setEXCH_RATE(msgKey.getKeyValue("EXCH_RATE"));
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
					if(msgKeyType.containsKeyColumn("TAX_AMOUNT_1")) {
						key.setTAX_AMOUNT_1(msgKey.getKeyValue("TAX_AMOUNT_1"));
					}
					if(msgKeyType.containsKeyColumn("TAX_AMOUNT_2")) {
						key.setTAX_AMOUNT_2(msgKey.getKeyValue("TAX_AMOUNT_2"));
					}
					if(msgKeyType.containsKeyColumn("TAX_AMOUNT_3")) {
						key.setTAX_AMOUNT_3(msgKey.getKeyValue("TAX_AMOUNT_3"));
					}
					if(msgKeyType.containsKeyColumn("AMOUNT_INCLUDE_TAX")) {
						key.setAMOUNT_INCLUDE_TAX(msgKey.getKeyValue("AMOUNT_INCLUDE_TAX"));
					}
					if(msgKeyType.containsKeyColumn("HOME_CUR_AMOUNT")) {
						key.setHOME_CUR_AMOUNT(msgKey.getKeyValue("HOME_CUR_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("ROUND_TYP")) {
						key.setROUND_TYP(msgKey.getKeyValue("ROUND_TYP"));
					}
					if(msgKeyType.containsKeyColumn("TAX_CD")) {
						key.setTAX_CD(msgKey.getKeyValue("TAX_CD"));
					}
					if(msgKeyType.containsKeyColumn("TAX_ROUND_TYP")) {
						key.setTAX_ROUND_TYP(msgKey.getKeyValue("TAX_ROUND_TYP"));
					}
					if(msgKeyType.containsKeyColumn("RTN_DEL_FLG")) {
						key.setRTN_DEL_FLG(msgKey.getKeyValue("RTN_DEL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("MODIFY_COUNT")) {
						key.setMODIFY_COUNT(msgKey.getKeyValue("MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("NON_NO_ITEM_TYP")) {
						key.setNON_NO_ITEM_TYP(msgKey.getKeyValue("NON_NO_ITEM_TYP"));
					}
					if(msgKeyType.containsKeyColumn("NON_NO_ITEM_NAME")) {
						key.setNON_NO_ITEM_NAME(msgKey.getKeyValue("NON_NO_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("NON_NO_ITEM_PUCH_ODR_UNIT")) {
						key.setNON_NO_ITEM_PUCH_ODR_UNIT(msgKey.getKeyValue("NON_NO_ITEM_PUCH_ODR_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_TYP")) {
						key.setITEM_TYP(msgKey.getKeyValue("ITEM_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_CD")) {
						key.setPUCH_ODR_CD(msgKey.getKeyValue("PUCH_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("RTN_DEL_DATE")) {
						key.setRTN_DEL_DATE(msgKey.getKeyValue("RTN_DEL_DATE"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP")) {
						key.setUNIT_QTY_TYP(msgKey.getKeyValue("UNIT_QTY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("SPL_ITEM_TYP")) {
						key.setSPL_ITEM_TYP(msgKey.getKeyValue("SPL_ITEM_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PRODUCT_TYP")) {
						key.setPRODUCT_TYP(msgKey.getKeyValue("PRODUCT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("CLASIFICATION_CD")) {
						key.setCLASIFICATION_CD(msgKey.getKeyValue("CLASIFICATION_CD"));
					}
					if(msgKeyType.containsKeyColumn("LOT_CTRL_FLG")) {
						key.setLOT_CTRL_FLG(msgKey.getKeyValue("LOT_CTRL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP")) {
						key.setMRP_ODR_TYP(msgKey.getKeyValue("MRP_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_CD_2")) {
						key.setPUCH_ODR_CD_2(msgKey.getKeyValue("PUCH_ODR_CD_2"));
					}
					if(msgKeyType.containsKeyColumn("MRP_FLG")) {
						key.setMRP_FLG(msgKey.getKeyValue("MRP_FLG"));
					}
					if(msgKeyType.containsKeyColumn("WH_TYP")) {
						key.setWH_TYP(msgKey.getKeyValue("WH_TYP"));
					}
					if(msgKeyType.containsKeyColumn("THIS_MONTH")) {
						key.setTHIS_MONTH(msgKey.getKeyValue("THIS_MONTH"));
					}
					if(msgKeyType.containsKeyColumn("INSTALL_FLG")) {
						key.setINSTALL_FLG(msgKey.getKeyValue("INSTALL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_ON_HAND_QTY")) {
						key.setSTOCK_ON_HAND_QTY(msgKey.getKeyValue("STOCK_ON_HAND_QTY"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_CTRL_CD")) {
						key.setRCV_ISSUE_CTRL_CD(msgKey.getKeyValue("RCV_ISSUE_CTRL_CD"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_TYP")) {
						key.setRCV_ISSUE_TYP(msgKey.getKeyValue("RCV_ISSUE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("ACPT_NO")) {
						key.setACPT_NO(msgKey.getKeyValue("ACPT_NO"));
					}
					if(msgKeyType.containsKeyColumn("ACPT_RSLT_CRCT_NO")) {
						key.setACPT_RSLT_CRCT_NO(msgKey.getKeyValue("ACPT_RSLT_CRCT_NO"));
					}
					if(msgKeyType.containsKeyColumn("INSPEC_RSLT_CRCT_NO")) {
						key.setINSPEC_RSLT_CRCT_NO(msgKey.getKeyValue("INSPEC_RSLT_CRCT_NO"));
					}
					if(msgKeyType.containsKeyColumn("PARTIAL_PRD_NO")) {
						key.setPARTIAL_PRD_NO(msgKey.getKeyValue("PARTIAL_PRD_NO"));
					}
					if(msgKeyType.containsKeyColumn("OPR_RSLT_CRCT_NO")) {
						key.setOPR_RSLT_CRCT_NO(msgKey.getKeyValue("OPR_RSLT_CRCT_NO"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_BEFORE_QTY")) {
						key.setRCV_ISSUE_BEFORE_QTY(msgKey.getKeyValue("RCV_ISSUE_BEFORE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_QTY")) {
						key.setRCV_ISSUE_QTY(msgKey.getKeyValue("RCV_ISSUE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_AFTER_QTY")) {
						key.setRCV_ISSUE_AFTER_QTY(msgKey.getKeyValue("RCV_ISSUE_AFTER_QTY"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_AMOUNT")) {
						key.setRCV_ISSUE_AMOUNT(msgKey.getKeyValue("RCV_ISSUE_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_DATE")) {
						key.setRCV_ISSUE_DATE(msgKey.getKeyValue("RCV_ISSUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_GNR_TYP")) {
						key.setRCV_ISSUE_GNR_TYP(msgKey.getKeyValue("RCV_ISSUE_GNR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_ODD_QTY")) {
						key.setRCV_ISSUE_ODD_QTY(msgKey.getKeyValue("RCV_ISSUE_ODD_QTY"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UPD_TYP")) {
						key.setSTOCK_UPD_TYP(msgKey.getKeyValue("STOCK_UPD_TYP"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_CMPLT_FLG")) {
						key.setRCV_ISSUE_CMPLT_FLG(msgKey.getKeyValue("RCV_ISSUE_CMPLT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("CONS_TYP")) {
						key.setCONS_TYP(msgKey.getKeyValue("CONS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("INSPC_ACPT_NO")) {
						key.setINSPC_ACPT_NO(msgKey.getKeyValue("INSPC_ACPT_NO"));
					}
					if(msgKeyType.containsKeyColumn("INSPC_ACPT_GNR_TYP")) {
						key.setINSPC_ACPT_GNR_TYP(msgKey.getKeyValue("INSPC_ACPT_GNR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("CRCT_NO")) {
						key.setCRCT_NO(msgKey.getKeyValue("CRCT_NO"));
					}
					if(msgKeyType.containsKeyColumn("CRCT_TYP")) {
						key.setCRCT_TYP(msgKey.getKeyValue("CRCT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("SLIP_TYP")) {
						key.setSLIP_TYP(msgKey.getKeyValue("SLIP_TYP"));
					}
					if(msgKeyType.containsKeyColumn("ACPT_QTY")) {
						key.setACPT_QTY(msgKey.getKeyValue("ACPT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("INSPC_ACPT_QTY")) {
						key.setINSPC_ACPT_QTY(msgKey.getKeyValue("INSPC_ACPT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("INSPC_ACPT_AMOUNT")) {
						key.setINSPC_ACPT_AMOUNT(msgKey.getKeyValue("INSPC_ACPT_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("SAVING_AMOUNT")) {
						key.setSAVING_AMOUNT(msgKey.getKeyValue("SAVING_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("ACPT_DATE")) {
						key.setACPT_DATE(msgKey.getKeyValue("ACPT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("INSPC_ACPT_DATE")) {
						key.setINSPC_ACPT_DATE(msgKey.getKeyValue("INSPC_ACPT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("SLIP_CD")) {
						key.setSLIP_CD(msgKey.getKeyValue("SLIP_CD"));
					}
					if(msgKeyType.containsKeyColumn("ORGN_SLIP_CD")) {
						key.setORGN_SLIP_CD(msgKey.getKeyValue("ORGN_SLIP_CD"));
					}
					if(msgKeyType.containsKeyColumn("WORK_IN_PROC_CD")) {
						key.setWORK_IN_PROC_CD(msgKey.getKeyValue("WORK_IN_PROC_CD"));
					}
					if(msgKeyType.containsKeyColumn("DLV_CD")) {
						key.setDLV_CD(msgKey.getKeyValue("DLV_CD"));
					}
					if(msgKeyType.containsKeyColumn("GNR_ORG_CD")) {
						key.setGNR_ORG_CD(msgKey.getKeyValue("GNR_ORG_CD"));
					}
					if(msgKeyType.containsKeyColumn("SBCNT_PUCH_TYP")) {
						key.setSBCNT_PUCH_TYP(msgKey.getKeyValue("SBCNT_PUCH_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_RTN_FLG")) {
						key.setPUCH_RTN_FLG(msgKey.getKeyValue("PUCH_RTN_FLG"));
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
					if(msgKeyType.containsKeyColumn("PAST_RESULT_ENTRY_TYP")) {
						key.setPAST_RESULT_ENTRY_TYP(msgKey.getKeyValue("PAST_RESULT_ENTRY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("AI_IF")) {
						key.setAI_IF(msgKey.getKeyValue("AI_IF"));
					}
					if(msgKeyType.containsKeyColumn("PVC2BUSINESSNAME")) {
						key.setPVC2BUSINESSNAME(msgKey.getKeyValue("PVC2BUSINESSNAME"));
					}
					if(msgKeyType.containsKeyColumn("PVC2OUTPUTPATH")) {
						key.setPVC2OUTPUTPATH(msgKey.getKeyValue("PVC2OUTPUTPATH"));
					}
					if(msgKeyType.containsKeyColumn("PVC2OUTPUTNAME")) {
						key.setPVC2OUTPUTNAME(msgKey.getKeyValue("PVC2OUTPUTNAME"));
					}
					if(msgKeyType.containsKeyColumn("PVC2LOGMODE")) {
						key.setPVC2LOGMODE(msgKey.getKeyValue("PVC2LOGMODE"));
					}
					if(msgKeyType.containsKeyColumn("PVC2OUTPUTMODE")) {
						key.setPVC2OUTPUTMODE(msgKey.getKeyValue("PVC2OUTPUTMODE"));
					}
					if(msgKeyType.containsKeyColumn("PVC2USERID")) {
						key.setPVC2USERID(msgKey.getKeyValue("PVC2USERID"));
					}
					if(msgKeyType.containsKeyColumn("PVC2PLANTCD")) {
						key.setPVC2PLANTCD(msgKey.getKeyValue("PVC2PLANTCD"));
					}
					if(msgKeyType.containsKeyColumn("PVC2TAXID")) {
						key.setPVC2TAXID(msgKey.getKeyValue("PVC2TAXID"));
					}
					if(msgKeyType.containsKeyColumn("PNUMTAXOUTAMOUNT")) {
						key.setPNUMTAXOUTAMOUNT(msgKey.getKeyValue("PNUMTAXOUTAMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("PNUMTAXAMOUNT")) {
						key.setPNUMTAXAMOUNT(msgKey.getKeyValue("PNUMTAXAMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("PNUMEXTERNALTAXSALESAMOUNT")) {
						key.setPNUMEXTERNALTAXSALESAMOUNT(msgKey.getKeyValue("PNUMEXTERNALTAXSALESAMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("PNUMINTERNALTAXSALESAMOUNT")) {
						key.setPNUMINTERNALTAXSALESAMOUNT(msgKey.getKeyValue("PNUMINTERNALTAXSALESAMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("PNUMTAXFREESALESAMOUNT")) {
						key.setPNUMTAXFREESALESAMOUNT(msgKey.getKeyValue("PNUMTAXFREESALESAMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("PNUMEXTERNALTAXAMOUNT")) {
						key.setPNUMEXTERNALTAXAMOUNT(msgKey.getKeyValue("PNUMEXTERNALTAXAMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("PNUMINTERNALTAXAMOUNT")) {
						key.setPNUMINTERNALTAXAMOUNT(msgKey.getKeyValue("PNUMINTERNALTAXAMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("PVC2ERRCD")) {
						key.setPVC2ERRCD(msgKey.getKeyValue("PVC2ERRCD"));
					}
					if(msgKeyType.containsKeyColumn("PNUMSTATUS")) {
						key.setPNUMSTATUS(msgKey.getKeyValue("PNUMSTATUS"));
					}
					if(msgKeyType.containsKeyColumn("OLD_TAX_RATE_1")) {
						key.setOLD_TAX_RATE_1(msgKey.getKeyValue("OLD_TAX_RATE_1"));
					}
					if(msgKeyType.containsKeyColumn("OLD_TAX_RATE_2")) {
						key.setOLD_TAX_RATE_2(msgKey.getKeyValue("OLD_TAX_RATE_2"));
					}
					if(msgKeyType.containsKeyColumn("OLD_TAX_RATE_3")) {
						key.setOLD_TAX_RATE_3(msgKey.getKeyValue("OLD_TAX_RATE_3"));
					}
					if(msgKeyType.containsKeyColumn("NEW_TAX_RATE_START_DATE")) {
						key.setNEW_TAX_RATE_START_DATE(msgKey.getKeyValue("NEW_TAX_RATE_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("NEW_TAX_RATE_1")) {
						key.setNEW_TAX_RATE_1(msgKey.getKeyValue("NEW_TAX_RATE_1"));
					}
					if(msgKeyType.containsKeyColumn("NEW_TAX_RATE_2")) {
						key.setNEW_TAX_RATE_2(msgKey.getKeyValue("NEW_TAX_RATE_2"));
					}
					if(msgKeyType.containsKeyColumn("NEW_TAX_RATE_3")) {
						key.setNEW_TAX_RATE_3(msgKey.getKeyValue("NEW_TAX_RATE_3"));
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
