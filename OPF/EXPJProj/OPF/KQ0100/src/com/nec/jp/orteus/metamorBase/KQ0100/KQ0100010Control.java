/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KQ0100/src/com/nec/jp/orteus/metamorBase/KQ0100/KQ0100010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.KQ0100;

import com.nec.jp.orteus.metamorBase.KQ0100.*;
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
import com.nec.jp.orteus.expj.sa.*;
import com.nec.jp.orteus.metamorBase.common04.amount.TaxControl;
import com.nec.jp.orteus.metamorBase.common04.amount.TaxStruct;
import com.nec.jp.orteus.metamorBase.common04.amount.TaxAmountStruct;
import com.nec.jp.orteus.metamorBase.common04.amount.TaxAmountControl;
import com.nec.jp.orteus.metamorBase.common06.ExchAmount.*;
//}}user_implement_code_import

//{{user_implement_code_header
/**
 * CLASS     : KQ0100010Control クラス
 * 受注消費税率変更
 * @author $Author: shan-xiuqin $
 * @version $Revision: 1.3 $ $Date: 2015/11/16 05:13:57 $
 *
 */
//}}user_implement_code_header

public class KQ0100010Control
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
	public KQ0100010Struct getListvalue(int x) { return (KQ0100010Struct)(this.list.get(x)); }	// リストの値を返します。
	public KQ0100010Struct getStruct() { return this.struct; }	// Structの値を返します。
	public KQ0100010Struct createStruct() { return new KQ0100010Struct(); }	// 新しいStructを作って返します。
	public void setStruct(Object structname) { this.struct.setStruct((KQ0100010Struct)structname); }	// Structをセットします。
	public void initializeStruct() { this.struct.initialize(); }	// Structの値を初期化します。

	// CSV出力用リスト
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }
	// TODO: ユーザ定義のコードを記述してください
	// 自社情報
	private String COMPANY_CD = null;
	
	// 更新フラグ
	private String UPDATE_FLG = "0";
	
	// 売掛管理オプション
	private String OPTION_ID_B = "0";
	
	// ＡｉR連携債権
	private String OPTION_ID_AIR = "0";
	
	// 変更前の消費税コード
	private String TAX_CD = null;
	
    /** 検収区分 */
    private ComboStruct _INSPC_ACPT_TYP = new ComboStruct();
   
    /**検収区分設定
     * @param コンボボックスデータ
    */
    public void setINSPC_ACPT_TYP(ComboStruct combo){ _INSPC_ACPT_TYP = combo; }
   
    /** 検収区分取得
     * @return 検収区分のコンボボックスデータ
    */
    public ComboStruct getINSPC_ACPT_TYP(){ return _INSPC_ACPT_TYP; }
    
    /** ステータス */
    private ComboStruct _STATUS_TYP = new ComboStruct();
   
    /**ステータス設定
     * @param コンボボックスデータ
    */
    public void setSTATUS_TYP(ComboStruct combo){ _STATUS_TYP = combo; }
   
    /** ステータス取得
     * @return 検収区分のコンボボックスデータ
    */
    public ComboStruct getSTATUS_TYP(){ return _STATUS_TYP; }
    
    /**
	 * 区分名取得
	 * 
	 * @param comboStruct
	 *            区分情報リスト
	 * @param strTyp
	 *            区分コード
	 * @return 区分名称。該当するデータがなかった場合は区分コードを返す
	 */
	private String getTypeName(ComboStruct comboStruct, String strTyp) {
		String strTypName = strTyp;
		for (int i = 0; i < comboStruct.getValList().size(); i++) {
			if (strTyp.equals((String) (comboStruct.getValList().get(i)))) {
				strTypName = (String) (comboStruct.getExplanList().get(i));
				break;
			}
		}
		return strTypName;
	}
	/**
	 * 対象の文字列がNull（空文字あるいはNull）であるかを判定します。
	 * @param str 対象文字列
	 * @return Nullの場合はtrue、Nullではない場合はfalse
	 */
	private boolean isNull(String str) {
		if (str == null || str.length() == 0 || str.equalsIgnoreCase("null")) {
			return true;
		}
		return false;
	}
	
	/**
	 * 業務ロジックのエラーメッセージ設定処理を切り出して関数化
	 * @param code メッセージコード
	 */
	private void setErrorMessage(String code) {
		ExpjMessage emsg = new ExpjMessage(code);
		msgStruct.addError(emsg);
		sysLog.warning(emsg, getsysUSER_CD());
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
     * 画面の全項目を初期化します。
     */
    public void initializeAll() {
    	struct.setr_SEL_PTN1("true");
    	struct.setr_SEL_PTN2("false");
		struct.setODR_NO(null);// 受注番号
		struct.setSLIP_CD(null);// 伝票番号
		struct.setCUST_ODR_NO(null);// 得意先注文番号
		struct.setTAX_CD(null);// 消費税コード
		struct.setITEM_CD(null);// 品目番号
		struct.setITEM_NAME(null);// 品目名
		struct.setCUST_CD(null);// 得意先コード
		struct.setCUST_NAME(null);// 得意先名
		struct.setCUST_ITEM_CD(null);// 得意先品目番号
		struct.setCUST_ITEM_NAME(null);// 得意先品目名称
		struct.setINSPC_ACPT_TYP(null);// 検収区分
		struct.setODR_QTY(null);// 受注数量
		struct.setODR_ACPT_DATE(null);// 受注日
		struct.setODR_UNIT_PRICE(null);// 単価
		struct.setODR_UNIT_CD(null);// 通貨単位_単価
		struct.setSHIP_DLV_DATE(null);// 出荷予定日
		struct.setODR_AMOUNT(null);// 受注金額
		struct.setODR_AMOUNT_UNIT_CD(null);// 通貨単位_受注金額
		struct.setDESINATED_DLV_DATE(null);// 指定納期
		struct.seth_INSPC_ACPT_TYP(null);// 検収区分(HIDDEN)
		struct.seth_CURRNCY_CD(null);// 通貨コード(HIDDEN)
		struct.seth_EXCH_TYP(null);// 為替種別(HIDDEN)
		struct.seth_PRICE_ROUND_TYP(null);// 単価計算まるめ区分(HIDDEN)
		struct.seth_TRANSPORT_LT(null);// 運送日数(HIDDEN)
		if (list != null){
			list.clear();
		}
    }
    /***
     * 売掛金トラン更新処理
     * @param workStruct
     * @throws Exception
     */
	private void updateT_AR_LEDGER_TRN(KQ0100010Struct workStruct) throws Exception {
		String taxRate1 = null;			 // 税率１
		String taxRate2 = null;			 // 税率２
		String taxRate3 = null;			 // 税率３
		String taxRoundTyp = null;  	 // 税端数区分
		String internalTaxAmount = null; // 内税対象金額
		String externalTaxAmount = null; // 外税対象金額
		String taxfreeAmount = null; 	 // 非課税対象金額
		String taxAmount1 = null; 		 // 税額１
		String taxAmount2 = null;		 // 税額２
		String taxAmount3 = null; 		 // 税額３
		String taxCreditAmount = null;   // 税抜き金額
		String dExchAmount = null;		 // 税抜売上金額（邦貨）
		
		// 消費税コードの３桁目
	    String tempTaxCd = struct.getTAX_CD().substring(struct.getTAX_CD().length() - 1, struct.getTAX_CD().length());
	    
	    // 消費税情報を取得
		TaxStruct ts =
			TaxControl.getDataTax(
				this.conn,		 
				workStruct.getl_h_AR_TRN_INSPC_ACPT_DATE(), // 売掛金トラン_受領検収日(HIDDEN)
				struct.getTAX_CD());     // 消費税コード
		taxRate1 = ts.getTAX_RATE_1();   // 税率１
		taxRate2 = ts.getTAX_RATE_2();   // 税率２
		taxRate3 = ts.getTAX_RATE_3();   // 税率３
		taxRoundTyp = ts.getTAX_ROUND_TYP(); // 端数区分
		
		// 税額計算処理
		TaxAmountStruct tas =
			TaxAmountControl.getData(
					this.conn, 
					workStruct.getl_h_AR_TRN_SALES_AMOUNT(),// 売掛金トラン_売上金額(HIDDEN)
					struct.getTAX_CD(), 				// 消費税コード
					taxRate1, 							// 税率１
					taxRate2, 							// 税率２
					taxRate3, 							// 税率３
					taxRoundTyp);						// 端数区分
		internalTaxAmount = tas.getINTERNAL_TAX_AMOUNT(); // 内税対象金額
		externalTaxAmount = tas.getEXTERNAL_TAX_AMOUNT(); // 外税対象金額
		taxfreeAmount = tas.getTAXFREE_AMOUNT(); 	 	  // 非課税対象金額
		taxAmount1 = tas.getTAX_AMOUNT_1(); 		 	  // 税額１
		taxAmount2 = tas.getTAX_AMOUNT_2();		          // 税額２
		taxAmount3 = tas.getTAX_AMOUNT_3(); 		      // 税額３
		taxCreditAmount = tas.getTAX_CREDIT_AMOUNT();     // 税抜き金額

		// 邦貨計算処理
		ExchAmount exch = new ExchAmount(conn);

		boolean result = exch.doExchAmount(
				taxCreditAmount,
				COMPANY_CD,
				struct.geth_CURRNCY_CD(), 
				struct.geth_EXCH_TYP(), 
				struct.geth_PRICE_ROUND_TYP(), 
				workStruct.getl_h_AR_TRN_INSPC_ACPT_DATE()); // 売掛金トラン_受領検収日(HIDDEN)
		
		if (!result) {
			conn.rollback();
			setErrorMessage("KQ00038");
			return;
		}
		dExchAmount = String.valueOf(exch.getD_EXCH_AMOUNT());
		
		// [売掛金トラン明細]の更新
		KQ0100010Struct updateStruct = new KQ0100010Struct();
		updateStruct.setsUser_ID(sysUSER_CD);
		updateStruct.setsSysdate(struct.getsSysdate());
		
		updateStruct.setTAX_CD_1(struct.getTAX_CD());				// 消費税コード１
		updateStruct.setTAX_CD_2(tempTaxCd);						// 消費税コード２
		updateStruct.setEXTERNAL_TAX_SALES_AMOUNT(externalTaxAmount);	// 外税対象金額
		updateStruct.setINTERNAL_TAX_SALES_AMOUNT(internalTaxAmount);	// 内税対象金額
		updateStruct.setTAXFREE_SALES_AMOUNT(taxfreeAmount);			// 非課税対象金額
		updateStruct.setTAX_CREDIT_SALES_AMOUNT(taxCreditAmount);			// 税抜売上金額
		if ("1".equals(tempTaxCd)){
			updateStruct.setEXTERNAL_TAX_AMOUNT(Calculate.add(taxAmount1, Calculate.add(taxAmount2, taxAmount3)));
		} else {
			updateStruct.setEXTERNAL_TAX_AMOUNT("0");					// 消費税額（外税）
		}
		if ("5".equals(tempTaxCd)){
			updateStruct.setINTERNAL_TAX_AMOUNT(Calculate.add(taxAmount1, Calculate.add(taxAmount2, taxAmount3)));
		} else {
			updateStruct.setINTERNAL_TAX_AMOUNT("0");					// 消費税額（内税）
		}
		updateStruct.setTAX_AMOUNT_1(taxAmount1);
		updateStruct.setTAX_AMOUNT_2(taxAmount2);
		updateStruct.setTAX_AMOUNT_3(taxAmount3);
		updateStruct.setOWN_CUR_TAXCREDIT_SALES_AMOUNT(dExchAmount);
		updateStruct.setCOMPANY_CD(COMPANY_CD);
		updateStruct.setSLIP_CTRL_GRP(struct.geth_SLIP_CTRL_GRP());
		updateStruct.setSLIP_CD(workStruct.getl_SHIP_ODR_SLIP_CD());
		updateStruct.setSLIP_DATE(workStruct.getl_h_INSPC_ACPT_DATE());
		List selList = entity.mSELECT_T_AR_LEDGER_TRN_FOR.read(conn, updateStruct);
		entity.mupdateT_AR_LEDGER_TRN.update(conn, updateStruct);
		
		// [売掛金トランヘッダ]の更新
		// [売掛金トラン明細]からデータを取得する
		List trnList = entity.mselectT_AR_LEDGER_TRN.read(conn, updateStruct);
		if (!trnList.isEmpty()){
			// [売掛金トランヘッダ]を更新する
			KQ0100010Struct detailStruct = (KQ0100010Struct)trnList.get(0);
			detailStruct.setsUser_ID(sysUSER_CD);
			detailStruct.setsSysdate(struct.getsSysdate());
			detailStruct.setCOMPANY_CD(COMPANY_CD);
			detailStruct.setSLIP_CTRL_GRP(struct.geth_SLIP_CTRL_GRP());
			detailStruct.setSLIP_CD(workStruct.getl_SHIP_ODR_SLIP_CD());
			detailStruct.setSLIP_DATE(workStruct.getl_h_INSPC_ACPT_DATE());
			entity.mupdateT_AR_LEDGER_H_TRN.update(conn, detailStruct);
		}
	}
    /***
     * 売掛金元帳更新処理
     * @param workStruct
     * @throws Exception
     */
	private void updateT_AR_LEDGER(KQ0100010Struct workStruct) throws Exception {
		String taxRate1 = null;			 // 税率１
		String taxRate2 = null;			 // 税率２
		String taxRate3 = null;			 // 税率３
		String taxRoundTyp = null;  	 // 税端数区分
		String internalTaxAmount = null; // 内税対象金額
		String externalTaxAmount = null; // 外税対象金額
		String taxfreeAmount = null; 	 // 非課税対象金額
		String taxAmount1 = null; 		 // 税額１
		String taxAmount2 = null;		 // 税額２
		String taxAmount3 = null; 		 // 税額３
		String taxCreditAmount = null;   // 税抜き金額
		String dExchAmount = null;		 // 税抜売上金額（邦貨）
		
		// 消費税コードの３桁目
	    String tempTaxCd = struct.getTAX_CD().substring(struct.getTAX_CD().length() - 1, struct.getTAX_CD().length());
	    
	    // 消費税情報を取得
		TaxStruct ts =
			TaxControl.getDataTax(
				this.conn,		 
				workStruct.getl_h_AR_INSPC_ACPT_DATE(), // 売掛金元帳_受領検収日(HIDDEN)
				struct.getTAX_CD());     // 消費税コード
		taxRate1 = ts.getTAX_RATE_1();   // 税率１
		taxRate2 = ts.getTAX_RATE_2();   // 税率２
		taxRate3 = ts.getTAX_RATE_3();   // 税率３
		taxRoundTyp = ts.getTAX_ROUND_TYP(); // 端数区分
		
		// 税額計算処理
		TaxAmountStruct tas =
			TaxAmountControl.getData(
					this.conn, 
					workStruct.getl_h_AR_SALES_AMOUNT(),// 売掛金元帳_売上金額(HIDDEN)
					struct.getTAX_CD(), 				// 消費税コード
					taxRate1, 							// 税率１
					taxRate2, 							// 税率２
					taxRate3, 							// 税率３
					taxRoundTyp);						// 端数区分
		internalTaxAmount = tas.getINTERNAL_TAX_AMOUNT(); // 内税対象金額
		externalTaxAmount = tas.getEXTERNAL_TAX_AMOUNT(); // 外税対象金額
		taxfreeAmount = tas.getTAXFREE_AMOUNT(); 	 	  // 非課税対象金額
		taxAmount1 = tas.getTAX_AMOUNT_1(); 		 	  // 税額１
		taxAmount2 = tas.getTAX_AMOUNT_2();		          // 税額２
		taxAmount3 = tas.getTAX_AMOUNT_3(); 		      // 税額３
		taxCreditAmount = tas.getTAX_CREDIT_AMOUNT();     // 税抜き金額

		// 邦貨計算処理
		ExchAmount exch = new ExchAmount(conn);

		boolean result = exch.doExchAmount(
				taxCreditAmount,
				COMPANY_CD,
				struct.geth_CURRNCY_CD(), 
				struct.geth_EXCH_TYP(), 
				struct.geth_PRICE_ROUND_TYP(), 
				workStruct.getl_h_AR_INSPC_ACPT_DATE()); // 売掛金元帳_受領検収日(HIDDEN)
		
		if (!result) {
			conn.rollback();
			setErrorMessage("KQ00038");
			return;
		}
		dExchAmount = String.valueOf(exch.getD_EXCH_AMOUNT());
		
		// [売掛金元帳明細]の更新
		KQ0100010Struct updateStruct = new KQ0100010Struct();
		updateStruct.setsUser_ID(sysUSER_CD);
		updateStruct.setsSysdate(struct.getsSysdate());
		
		updateStruct.setTAX_CD_1(struct.getTAX_CD());				// 消費税コード１
		updateStruct.setTAX_CD_2(tempTaxCd);						// 消費税コード２
		updateStruct.setEXTERNAL_TAX_SALES_AMOUNT(externalTaxAmount);	// 外税対象金額
		updateStruct.setINTERNAL_TAX_SALES_AMOUNT(internalTaxAmount);	// 内税対象金額
		updateStruct.setTAXFREE_SALES_AMOUNT(taxfreeAmount);			// 非課税対象金額
		updateStruct.setTAX_CREDIT_SALES_AMOUNT(taxCreditAmount);		// 税抜売上金額
		if ("1".equals(tempTaxCd)){
			updateStruct.setEXTERNAL_TAX_AMOUNT(Calculate.add(taxAmount1, Calculate.add(taxAmount2, taxAmount3)));
		} else {
			updateStruct.setEXTERNAL_TAX_AMOUNT("0");					// 消費税額（外税）
		}
		if ("5".equals(tempTaxCd)){
			updateStruct.setINTERNAL_TAX_AMOUNT(Calculate.add(taxAmount1, Calculate.add(taxAmount2, taxAmount3)));
		} else {
			updateStruct.setINTERNAL_TAX_AMOUNT("0");					// 消費税額（内税）
		}
		updateStruct.setTAX_AMOUNT_1(taxAmount1);
		updateStruct.setTAX_AMOUNT_2(taxAmount2);
		updateStruct.setTAX_AMOUNT_3(taxAmount3);
		updateStruct.setOWN_CUR_TAXCREDIT_SALES_AMOUNT(dExchAmount);
		updateStruct.setCOMPANY_CD(COMPANY_CD);
		updateStruct.setSLIP_CTRL_GRP(struct.geth_SLIP_CTRL_GRP());
		updateStruct.setSLIP_CD(workStruct.getl_SHIP_ODR_SLIP_CD());
		updateStruct.setSLIP_DATE(workStruct.getl_h_INSPC_ACPT_DATE());
		List selList = entity.mSELECT_T_AR_LEDGER_FOR.read(conn, updateStruct);
		entity.mupdateT_AR_LEDGER.update(conn, updateStruct);
		
		// [売掛金ト元帳ヘッダ]の更新
		// [売掛金ト元帳明細]からデータを取得する
		List trnList = entity.mselectT_AR_LEDGER.read(conn, updateStruct);
		if (!trnList.isEmpty()){
			// [売掛金トランヘッダ]を更新する
			KQ0100010Struct detailStruct = (KQ0100010Struct)trnList.get(0);
			detailStruct.setsUser_ID(sysUSER_CD);
			detailStruct.setsSysdate(struct.getsSysdate());
			detailStruct.setCOMPANY_CD(COMPANY_CD);
			detailStruct.setSLIP_CTRL_GRP(struct.geth_SLIP_CTRL_GRP());
			detailStruct.setSLIP_CD(workStruct.getl_SHIP_ODR_SLIP_CD());
			detailStruct.setSLIP_DATE(workStruct.getl_h_INSPC_ACPT_DATE());
			entity.mupdateT_AR_LEDGER_H.update(conn, detailStruct);
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
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0100");
		logger.entering("KQ0100010Control"+":USER="+struct.getsUser_ID(),"controlselect");
			//{{user_implement_dev:<controlselect>
			// TODO: ユーザ定義のコードを記述してください
		try {
			setReadStatus(INITIAL);
			list = new ArrayList();
			// システム管理情報の検索
			// 「売掛管理オプション」を取得する
			struct.setOPTION_ID("B%");
			List optionList = entity.mgetOptionId.read(conn, struct);
			if (!optionList.isEmpty()){
				OPTION_ID_B = "1";
			}
			// 「Ａｉ連携債権」を取得する
			struct.setOPTION_ID("AiR");
			optionList = entity.mgetOptionId.read(conn, struct);
			if (!optionList.isEmpty()){
				OPTION_ID_AIR = "1";
			}
			// ヘッダの検索
			List headList = new ArrayList();
			if ("true".equals(struct.getr_SEL_PTN1())){
				headList = entity.mselect_Head.read(conn, struct);
			} else {
				headList = entity.mselect_Head_Slip.read(conn, struct);
			}
			
			// [得意先納品場所]."出荷倉庫コード" で [保管区] より取得した "工場コード"
			String strPlantCd = null;
			
			if (headList.isEmpty()){
				setReadStatus(NOT_FOUND);
				ExpjMessage emsg = new ExpjMessage( "ZZ06001");
				msgStruct.addError( emsg );	// エラーメッセージとして登録
				sysLog.warning(emsg, struct.getsUser_ID()); //エラー内容
				return;
			} else {
				KQ0100010Struct tempStruct = new KQ0100010Struct();
				tempStruct = (KQ0100010Struct)headList.get(0);
				
				// 出荷準備LTの取得
				String shipLt = null;
				List ltList = entity.mgetSYUKA_LT.read(conn, struct);
				if (ltList.isEmpty()){
					setErrorMessage("KQ00037");
					return;
				} else {
					shipLt =((KQ0100010Struct)ltList.get(0)).getCODE();
				}
				
				// 出荷予定日計算
				struct.seth_TRANSPORT_LT(tempStruct.geth_TRANSPORT_LT());          // [得意先納品場所]."運送日数"
				strPlantCd = tempStruct.getPLANT_CD();							   // [保管区]."工場コード"
				SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
				Date wkDate = dateFormat.parse(tempStruct.getDESINATED_DLV_DATE());
				WorkDay wkd = new WorkDay(struct.getsUser_ID(),		//ユーザコード
						this.getBusiness().getBusinessCd(),			//業務コード
						strPlantCd,									//工場コード
						wkDate,										//対象日付
						- Integer.parseInt(struct.geth_TRANSPORT_LT()) - Integer.parseInt(shipLt),	//加算日
						false					//前倒しフラグ
					);
				wkDate = wkd.calcDate();		//計算結果
				if(wkDate == null){
					setErrorMessage("KQ00040");
					return;
				}
				struct.setSHIP_DLV_DATE(String.valueOf(Converter.dateToStr(wkDate, "yyyy/MM/dd")));
				
				struct.seth_ODR_NO(tempStruct.geth_ODR_NO());					   // [受注明細]."受注番号"
				struct.setCUST_ODR_NO(tempStruct.getCUST_ODR_NO());                // [受注明細]."得意先注文番号"
				struct.setITEM_CD(tempStruct.getITEM_CD());                        // [受注管理]."品目番号"
				struct.setITEM_NAME(tempStruct.getITEM_NAME());                    // [受注管理]."品目名称"
				struct.setCUST_CD(tempStruct.getCUST_CD());                        // [受注管理]."得意先コード"
				struct.setCUST_NAME(tempStruct.getCUST_NAME());                    // [得意先]."得意先名"
				struct.setCUST_ITEM_CD(tempStruct.getCUST_ITEM_CD());              // [受注管理]."得意先品目番号"
				struct.setCUST_ITEM_NAME(tempStruct.getCUST_ITEM_NAME());          // [受注管理]."得意先品目名称"
				struct.setODR_ACPT_DATE(tempStruct.getODR_ACPT_DATE());            // [受注明細]."受注日"
				struct.setDESINATED_DLV_DATE(tempStruct.getDESINATED_DLV_DATE());  // [受注明細]."指定納期"
				struct.setODR_UNIT_PRICE(tempStruct.getODR_UNIT_PRICE());          // [受注明細]."受注単価"
				struct.setODR_UNIT_CD(tempStruct.getODR_UNIT_CD());                // [通貨]."通貨単位"
				struct.setODR_QTY(tempStruct.getODR_QTY());                        // [受注明細]."受注数量"
				struct.setTAX_CD(tempStruct.getTAX_CD());                          // [受注明細]."消費税コード"
				struct.setODR_AMOUNT(tempStruct.getODR_AMOUNT());                  // [受注明細]."受注金額"
				struct.setODR_AMOUNT_UNIT_CD(tempStruct.getODR_AMOUNT_UNIT_CD());  // [通貨]."通貨単位"
				struct.seth_INSPC_ACPT_TYP(tempStruct.geth_INSPC_ACPT_TYP());      // [得意先]."検収区分"
				struct.setINSPC_ACPT_TYP(getTypeName(_INSPC_ACPT_TYP, tempStruct.geth_INSPC_ACPT_TYP()));
				struct.seth_CURRNCY_CD(tempStruct.geth_CURRNCY_CD());              // [受注明細]."通貨コード"
				struct.seth_EXCH_TYP(tempStruct.geth_EXCH_TYP());                  // [受注明細]."為替種別"
				struct.seth_PRICE_ROUND_TYP(tempStruct.geth_PRICE_ROUND_TYP());    // [得意先]."単価計算まるめ区分"		
				struct.seth_MODIFY_COUNT(tempStruct.geth_MODIFY_COUNT());
				
				
				// 伝票管理グループを取得する
				struct.setCOMPANY_CD(COMPANY_CD);
				if("1".equals(OPTION_ID_B)) {
					List slipCtrlGrp = entity.mgetSLIP_CTRL_GRP.read(conn, struct);
					if (!slipCtrlGrp.isEmpty()){
						struct.setSLIP_CTRL_GRP(((KQ0100010Struct)slipCtrlGrp.get(0)).getSLIP_CTRL_GRP());
						struct.seth_SLIP_CTRL_GRP(((KQ0100010Struct)slipCtrlGrp.get(0)).getSLIP_CTRL_GRP());
					} else {
						setErrorMessage("KI00006");
						return;
					}
					
				}
				
				// 明細の検索
				// リスト表示最大件数
				int maxLine = sp.getMaxLine(conn, 10);
				if(maxLine != 0) {
					struct.setROW_COUNT(String.valueOf(maxLine));
				}else {
					struct.setROW_COUNT(null);
			    }
				List WorkList;
				if ("1".equals(OPTION_ID_B)){
					WorkList = entity.mselectCnt.read(conn, struct);
				} else {
					WorkList = entity.mselectCnt1.read(conn, struct);
				}
				if (!WorkList.isEmpty()){
					long rowCount = Long.parseLong(((KQ0100010Struct)WorkList.get(0)).getCOUNT());
					// 表示行数制限値(SYS_SCREEN_PARM)を超えた場合エラー
		          	if ((maxLine != 0) && (rowCount== maxLine + 1)) {
		            	setErrorMessage("ZZ01115", String.valueOf(maxLine));
		            	if(list!=null && list.size()>0){
		 				   setList(null);
		 				}
		            	setReadStatus(TOO_MANY);
		            	return;
		          	}
				}
				
				List detailList;
				if ("1".equals(OPTION_ID_B)){
					detailList = entity.mselect_Detail.read(conn, struct);
				} else {
					detailList = entity.mselectDetail1.read(conn, struct);
				}
				
				if (!detailList.isEmpty()){
					for (int i = 0; i < detailList.size(); i++){
						tempStruct = (KQ0100010Struct)detailList.get(i);
						// 分納項番
						tempStruct.setl_PART_DLV_SEQ_NO(tempStruct.getl_PART_DLV_SEQ_NO());
						// 伝票番号
						tempStruct.setl_SHIP_ODR_SLIP_CD(tempStruct.getl_SHIP_ODR_SLIP_CD());
						// 出荷指定日
						tempStruct.setl_DESINATED_SHIP_DATE(tempStruct.getl_DESINATED_SHIP_DATE());
						// 納品予定日（出荷指示ベース）
						tempStruct.setl_ODR_SCDL_DLV_DATE(tempStruct.getl_SCDL_DLV_DATE());
						// 出荷実績日
						tempStruct.setl_SHIP_DATE(tempStruct.getl_SHIP_DATE());
						// 納品予定日（出荷実績ベース）
						if (!isNull(tempStruct.getl_SHIP_DATE())){
							wkDate = dateFormat.parse(tempStruct.getl_SHIP_DATE());
							wkd = new WorkDay(struct.getsUser_ID(),		//ユーザコード
									this.getBusiness().getBusinessCd(),				//業務コード
									strPlantCd,										//工場コード
									wkDate,										//対象日付
									Integer.parseInt(struct.geth_TRANSPORT_LT()),	//加算日
									true											//前倒しフラグ
								);
							wkDate = wkd.calcDate();		//計算結果
							if(wkDate == null){
								setErrorMessage("KQ00040");
								return;
							}
							tempStruct.setl_SHIP_SCDL_DLV_DATE((Converter.dateToStr(wkDate, "yyyy/MM/dd")));
						}
						
						// 売上計上日
						tempStruct.setl_SALES_DATE(tempStruct.getl_SALES_DATE());
						// 製番
						tempStruct.setl_JOB_ODR_CD(tempStruct.getl_JOB_ODR_CD());
						// 出荷実績金額(HIDDEN)
						tempStruct.setl_h_SHIP_ODR_AMOUNT(tempStruct.getl_SHIP_ODR_AMOUNT());
						// 売上金額(HIDDEN)
						tempStruct.setl_h_SALES_AMOUNT(tempStruct.getl_SALES_AMOUNT());
						// Ai売掛インタフェースフラグ(HIDDEN)
						tempStruct.setl_h_AI_AR_IF_FLG(tempStruct.getl_AI_AR_IF_FLG());
						// 消費税計算日_出荷指示(HIDDEN)
						// 画面ヘッダ.検収区分(HIDDEN) = "1" の場合
						if ("1".equals(struct.geth_INSPC_ACPT_TYP())){
							// [出荷指示]."出荷指定日"
							tempStruct.setl_h_TAX_DESINATED_SHIP_DATE(tempStruct.getl_DESINATED_SHIP_DATE());
						} else {
							// [出荷指示]."納品予定日"
							tempStruct.setl_h_TAX_DESINATED_SHIP_DATE(tempStruct.getl_SCDL_DLV_DATE());
						}
						// 出荷指示番号(HIDDEN)
						tempStruct.setl_h_SHIP_ODR_NO(tempStruct.getl_SHIP_ODR_NO());
						// 売上実績管理番号(HIDDEN)
						tempStruct.setl_h_SALES_SEQ_NO(tempStruct.getl_SALES_SEQ_NO());
						// 売上実績伝票番号(HIDDEN)
						tempStruct.setl_h_SALES_SLIP_CD(tempStruct.getl_SALES_SLIP_CD());
						// 出荷指示金額(HIDDEN)
						tempStruct.setl_h_SHIP_ODR_AMOUNT(tempStruct.getl_ODR_AMOUNT());
						// 出荷実績管理番号(HIDDEN)
						tempStruct.setl_h_SHIP_SEQ_NO(tempStruct.getl_SHIP_SEQ_NO());
						
						// ステータス番号を取得する
						// WHEN [受注明細]."受注番号" IS NOT NULL THEN "1"
						if (!isNull(tempStruct.getl_ODR_ODR_NO())){
							tempStruct.setl_h_STATUS_CD("1");
						}
						// WHEN [出荷計画]."受注番号" IS NOT NULL THEN "2"
						if (!isNull(tempStruct.getl_DLV_ODR_NO())){
							tempStruct.setl_h_STATUS_CD("2");
						}
						// WHEN [出荷指示]."出荷指示番号" IS NOT NULL THEN "3"
						if (!isNull(tempStruct.getl_SHIP_ODR_NO())){
							tempStruct.setl_h_STATUS_CD("3");
						}
						// WHEN [出荷実績]."出荷実績管理番号" IS NOT NULL THEN "4"
						if (!isNull(tempStruct.getl_SHIP_SEQ_NO())){
							tempStruct.setl_h_STATUS_CD("4");
						}
						// WHEN [売上実績]."状態区分" = '20' THEN "5"
						if (!isNull(tempStruct.getl_SALES_STATUS()) && "20".equals(tempStruct.getl_SALES_STATUS())){
							tempStruct.setl_h_STATUS_CD("5");
						}
						// WHEN 「売掛管理オプション」 = "1"
					    // AND [売掛金トランヘッダ]."状態区分" > 20
					    // AND [売掛金トランヘッダ]."状態区分" < 30 THEN "6"
						if ("1".equals(OPTION_ID_B) &&
								!isNull(tempStruct.getAR_TRN_STATUS()) &&
								Calculate.compare(tempStruct.getAR_TRN_STATUS(), "20") == 1 &&
								Calculate.compare(tempStruct.getAR_TRN_STATUS(), "30") == -1 ){
							tempStruct.setl_h_STATUS_CD("6");
						}
						// WHEN 「売掛管理オプション」 = "1"
					    // AND [売掛金トランヘッダ]."状態区分" >=30
					    // AND [売掛金トランヘッダ]."状態区分" < 40 THEN "7"
						if ("1".equals(OPTION_ID_B) &&
								!isNull(tempStruct.getAR_STATUS()) &&
								Calculate.compare(tempStruct.getAR_STATUS(), "30") >= 0 &&
								Calculate.compare(tempStruct.getAR_STATUS(), "40") == -1 ){
							tempStruct.setl_h_STATUS_CD("7");
						}
						// WHEN    「売掛管理オプション」 = "1"
					    // AND [売掛金元帳ヘッダ]."状態区分" >=40  THEN "8"
						if ("1".equals(OPTION_ID_B) &&
								!isNull(tempStruct.getAR_STATUS()) &&
								Calculate.compare(tempStruct.getAR_STATUS(), "40") >= 0){
							tempStruct.setl_h_STATUS_CD("8");
						}
						
						// 更新フラグ
						tempStruct.setl_h_UPDATE_FLG("0");
						if ("1".equals(OPTION_ID_B) && "8".equals(tempStruct.getl_h_STATUS_CD())){
							tempStruct.setl_h_UPDATE_FLG("1");
						} 
						if ("1".equals(OPTION_ID_AIR) && 
								"5".equals(tempStruct.getl_h_STATUS_CD()) && 
								"1".equals(tempStruct.getl_AI_AR_IF_FLG())){
							tempStruct.setl_h_UPDATE_FLG("1");
						}
						// ステータス
						tempStruct.setl_STATUS(getTypeName(_STATUS_TYP, tempStruct.getl_h_STATUS_CD()));
						list.add(tempStruct);
					}
				}
			}
			// チェック処理
			UPDATE_FLG = "0";
			KQ0100010Struct tempStruct = new KQ0100010Struct();
			for (int i= 0; i < list.size(); i++){
				tempStruct = (KQ0100010Struct)list.get(i);
				if ("1".equals(tempStruct.getl_h_UPDATE_FLG())){
					UPDATE_FLG = "1";
					break;
				}
			}
			
			struct.seth_UPDATE_FLG(UPDATE_FLG);
			if ("1".equals(UPDATE_FLG)){
				setErrorMessage("KQ00338");
				return;
			}
			// 内部データ保持
			TAX_CD = struct.getTAX_CD();
			struct.seth_TAX_CD(TAX_CD);
			setReadStatus(NORMAL);
		
		} catch (Exception e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			throw new ExpjException(e, emsg);
		}
                //}}user_implement_dev:<controlselect>
		logger.exiting("KQ0100010Control"+":USER="+struct.getsUser_ID(),"controlselect");

		return;
	}

	/**
	 * 更新ボタン押下時に実行される処理です。
	 *
	 */
	public void controlupdate() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0100");
		logger.entering("KQ0100010Control"+":USER="+struct.getsUser_ID(),"controlupdate");
			//{{user_implement_dev:<controlupdate>
			// TODO: ユーザ定義のコードを記述してください
		try{
			this.conn.beginTransWeb();
			
			// 入力チェック処理
			List taxList = entity.mget_TAX_CD.read(conn, struct);
			if (taxList.isEmpty()){
				setErrorMessage("AA01001");
				return;
			}
			
			// 2.12.7.1	ヘッダ更新処理
			// ①　[受注明細]を更新する
			struct.setsUser_ID(sysUSER_CD);
			List modifyCountList = entity.mSELECT_MODIFY_COUNT.read(conn, struct);
			if (!modifyCountList.isEmpty()) {
				KQ0100010Struct modifyCountStruct = (KQ0100010Struct)modifyCountList.get(0);
				if (!struct.geth_MODIFY_COUNT().equals(modifyCountStruct.getMODIFY_COUNT())) {
					setErrorMessage("ZZ01105");
					conn.rollback();
					return;
				}
			}
			entity.mT_ODR.update(conn, struct);
			
			// ②　[受注履歴]の登録
			struct.setCREATED_BY(sysUSER_CD);
			struct.setCREATED_PRG_NM(sp.getProcId());
			entity.mT_ODR_ACPT_RSLT.create(conn, struct);

			// 2.12.7.2	明細更新処理
			KQ0100010Struct tempStruct = new KQ0100010Struct();
			String taxRate1 = null;			 // 税率１
			String taxRate2 = null;			 // 税率２
			String taxRate3 = null;			 // 税率３
			String taxRoundTyp = null;  	 // 税端数区分
			String internalTaxAmount = null; // 内税対象金額
			String externalTaxAmount = null; // 外税対象金額
			String taxfreeAmount = null; 	 // 非課税対象金額
			String taxAmount1 = null; 		 // 税額１
			String taxAmount2 = null;		 // 税額２
			String taxAmount3 = null; 		 // 税額３
			String taxAmount = null;  		 // 税込み金額
			String taxCreditAmount = null;   // 税抜き金額
			String dExchAmount = null;		 // 税抜売上金額（邦貨）
			
			// 消費税コードの３桁目
		    String tempTaxCd = struct.getTAX_CD().substring(struct.getTAX_CD().length() - 1, struct.getTAX_CD().length());

			for (int i = 0; i < list.size(); i++){
				tempStruct = (KQ0100010Struct)list.get(i);
				
				// 「ステータス番号」　＜　3の場合、以下の処理を行わずに次明細の処理を行う
				if (Calculate.compare(tempStruct.getl_h_STATUS_CD(), "3") != -1){
					// ① [出荷伝票データ]の更新
					// 消費税情報を取得
					TaxStruct ts =
						TaxControl.getDataTax(
							this.conn,		 
							tempStruct.getl_h_TAX_DESINATED_SHIP_DATE(), // 消費税計算日
							struct.getTAX_CD());     // 消費税コード
					taxRate1 = ts.getTAX_RATE_1();   // 税率１
					taxRate2 = ts.getTAX_RATE_2();   // 税率２
					taxRate3 = ts.getTAX_RATE_3();   // 税率３
					taxRoundTyp = ts.getTAX_ROUND_TYP(); // 端数区分
					
					// 税額計算処理
					TaxAmountStruct tas =
						TaxAmountControl.getData(
								this.conn, 
								tempStruct.getl_h_SHIP_ODR_AMOUNT(),// 出荷指示金額(HIDDEN)
								struct.getTAX_CD(), 				// 消費税コード
								taxRate1, 							// 税率１
								taxRate2, 							// 税率２
								taxRate3, 							// 税率３
								taxRoundTyp);						// 端数区分
					internalTaxAmount = tas.getINTERNAL_TAX_AMOUNT(); // 内税対象金額
					externalTaxAmount = tas.getEXTERNAL_TAX_AMOUNT(); // 外税対象金額
					taxfreeAmount = tas.getTAXFREE_AMOUNT(); 	 	  // 非課税対象金額
					taxAmount1 = tas.getTAX_AMOUNT_1(); 		 	  // 税額１
					taxAmount2 = tas.getTAX_AMOUNT_2();		          // 税額２
					taxAmount3 = tas.getTAX_AMOUNT_3(); 		      // 税額３
					taxAmount = tas.getTAX_AMOUNT();  		          // 税込み金額
					taxCreditAmount = tas.getTAX_CREDIT_AMOUNT();     // 税抜き金額

					// 邦貨計算処理
					ExchAmount exch = new ExchAmount(conn);

					boolean result = exch.doExchAmount(
							taxCreditAmount,
							COMPANY_CD,
							struct.geth_CURRNCY_CD(), 
							struct.geth_EXCH_TYP(), 
							struct.geth_PRICE_ROUND_TYP(), 
							tempStruct.getl_h_TAX_DESINATED_SHIP_DATE()); // 消費税計算日

					if (!result) {
						conn.rollback();
						setErrorMessage("KQ00038");
						return;
					}
					dExchAmount = String.valueOf(exch.getD_EXCH_AMOUNT());
			        
					// [出荷伝票データ]の更新
					// 出荷指示金額
					tempStruct.setslipSHIP_ODR_AMOUNT(taxCreditAmount);
					// 消費税額
					tempStruct.setslipTAX_AMOUNT(Calculate.add(taxAmount1, Calculate.add(taxAmount2, taxAmount3)));
					// 出荷指示金額(税込み)
					tempStruct.setslipSHIP_ODR_AMOUNT_TAX(taxAmount);
					// 外税対象金額
					tempStruct.setslipEXTERNAL_TAX_SALES_AMOUNT(externalTaxAmount);
					// 内税対象金額
					tempStruct.setslipINTERNAL_TAX_SALES_AMOUNT(internalTaxAmount);
					// 非課税対象金額
					tempStruct.setslipTAXFREE_SALES_AMOUNT(taxfreeAmount);
					// 税抜売上金額
					tempStruct.setslipTAX_CREDIT_SALES_AMOUNT(taxCreditAmount);
				    if ("1".equals(tempTaxCd)){
				    	// 消費税額（外税）
						tempStruct.setslipEXTERNAL_TAX_AMOUNT(Calculate.add(taxAmount1, Calculate.add(taxAmount2, taxAmount3)));
				    } else {
				    	// 消費税額（外税）
						tempStruct.setslipEXTERNAL_TAX_AMOUNT("0");
				    }
				    if ("5".equals(tempTaxCd)){
						// 消費税額（内税）
						tempStruct.setslipINTERNAL_TAX_AMOUNT(Calculate.add(taxAmount1, Calculate.add(taxAmount2, taxAmount3)));
				    } else {
				    	// 消費税額（内税）
						tempStruct.setslipINTERNAL_TAX_AMOUNT("0");
				    }
					// 税額１
					tempStruct.setslipTAX_AMOUNT_1(taxAmount1);
					// 税額２
					tempStruct.setslipTAX_AMOUNT_2(taxAmount2);
					// 税額３
					tempStruct.setslipTAX_AMOUNT_3(taxAmount3);
					// 税抜売上金額（邦貨）
					tempStruct.setslipOWN_CUR_TAXCREDIT_SALES_AMOUNT(dExchAmount);
					
					tempStruct.setsUser_ID(sysUSER_CD);
					tempStruct.setsSysdate(struct.getsSysdate());
					entity.mT_SHIP_SLIP.update(conn, tempStruct);
				} else {
					continue;
				}
				
				// 「ステータス番号」　＜　5の場合、以下の処理を行わずに次明細の処理を行う。
				if (Calculate.compare(tempStruct.getl_h_STATUS_CD(), "5") != -1){
					// 消費税情報を取得
					TaxStruct ts =
						TaxControl.getDataTax(
							this.conn,		 
							tempStruct.getl_SALES_DATE(), // 売上計上日
							struct.getTAX_CD());     // 消費税コード
					taxRate1 = ts.getTAX_RATE_1();   // 税率１
					taxRate2 = ts.getTAX_RATE_2();   // 税率２
					taxRate3 = ts.getTAX_RATE_3();   // 税率３
					taxRoundTyp = ts.getTAX_ROUND_TYP(); // 端数区分
					
					// 税額計算処理
					TaxAmountStruct tas =
						TaxAmountControl.getData(
								this.conn, 
								tempStruct.getl_h_SALES_AMOUNT(),  	// 売上金額(HIDDEN)
								struct.getTAX_CD(), 				// 消費税コード
								taxRate1, 							// 税率１
								taxRate2, 							// 税率２
								taxRate3, 							// 税率３
								taxRoundTyp);						// 端数区分
					internalTaxAmount = tas.getINTERNAL_TAX_AMOUNT(); // 内税対象金額
					externalTaxAmount = tas.getEXTERNAL_TAX_AMOUNT(); // 外税対象金額
					taxfreeAmount = tas.getTAXFREE_AMOUNT(); 	 	  // 非課税対象金額
					taxAmount1 = tas.getTAX_AMOUNT_1(); 		 	  // 税額１
					taxAmount2 = tas.getTAX_AMOUNT_2();		          // 税額２
					taxAmount3 = tas.getTAX_AMOUNT_3(); 		      // 税額３
					taxAmount = tas.getTAX_AMOUNT();  		          // 税込み金額
					taxCreditAmount = tas.getTAX_CREDIT_AMOUNT();     // 税抜き金額
					
					// 邦貨計算処理
					ExchAmount exch = new ExchAmount(conn);

					boolean result = exch.doExchAmount(
							taxCreditAmount,
							COMPANY_CD,
							struct.geth_CURRNCY_CD(), 
							struct.geth_EXCH_TYP(), 
							struct.geth_PRICE_ROUND_TYP(), 
							tempStruct.getl_SALES_DATE()); 			// 画面明細.「売上計上日」

					if (!result) {
						conn.rollback();
						setErrorMessage("KQ00038");
						return;
					}
					dExchAmount = String.valueOf(exch.getD_EXCH_AMOUNT());
					
					// 外税対象金額
					tempStruct.setsalesEXTERNAL_TAX_SALES_AMOUNT(externalTaxAmount);
					// 内税対象金額
					tempStruct.setsalesINTERNAL_TAX_SALES_AMOUNT(internalTaxAmount);
					// 非課税対象金額
					tempStruct.setsalesTAXFREE_SALES_AMOUNT(taxfreeAmount);
					// 税抜売上金額
					tempStruct.setsalesTAX_CREDIT_SALES_AMOUNT(taxCreditAmount);
					if ("1".equals(tempTaxCd)){
						// 消費税額（外税）
						tempStruct.setsalesEXTERNAL_TAX_AMOUNT(Calculate.add(taxAmount1, Calculate.add(taxAmount2, taxAmount3)));
					} else {
						// 消費税額（外税）
						tempStruct.setsalesEXTERNAL_TAX_AMOUNT("0");
					}
					if ("5".equals(tempTaxCd)){
						// 消費税額（内税）
						tempStruct.setsalesINTERNAL_TAX_AMOUNT(Calculate.add(taxAmount1, Calculate.add(taxAmount2, taxAmount3)));
					} else {
						// 消費税額（内税）
						tempStruct.setsalesINTERNAL_TAX_AMOUNT("0");
					}
					// 税額１
					tempStruct.setsalesTAX_AMOUNT_1(taxAmount1);
					// 税額２
					tempStruct.setsalesTAX_AMOUNT_2(taxAmount2);
					// 税額３
					tempStruct.setsalesTAX_AMOUNT_3(taxAmount3);
					// 税抜売上金額（邦貨）
					tempStruct.setsalesOWN_CUR_TAXCREDIT_SALES_AMOUNT(dExchAmount);
					
					tempStruct.setsUser_ID(sysUSER_CD);
					tempStruct.setsSysdate(struct.getsSysdate());
					entity.mT_SALES.update(conn, tempStruct);
				}else {
					continue;
				}
				
				// ④	[売掛金トラン]、[売掛金元帳]の更新
				// 「ステータス番号」　<　6の場合、以下の処理を行わずに次明細の処理を行う。
				if (Calculate.compare(tempStruct.getl_h_STATUS_CD(), "6") != -1){
					tempStruct.setCOMPANY_CD(COMPANY_CD);
					tempStruct.setSLIP_CTRL_GRP(struct.geth_SLIP_CTRL_GRP());
					tempStruct.setSLIP_CD(tempStruct.getl_SHIP_ODR_SLIP_CD());
					List trnList = entity.mSelectT_AR_LEDGER_H_TRN.read(conn, tempStruct);
					if (trnList.isEmpty()){
						// 売掛金元帳更新処理を行う。
						updateT_AR_LEDGER(tempStruct);
					} else {
						// 売掛金トラン更新処理を行う。
						updateT_AR_LEDGER_TRN(tempStruct);
					}
				}else {
					continue;
				}
				
			}
			conn.commit();
			
			// 再検索
			controlselect();
		} catch (ResourceBusyException e) {
			// ロールバック
			conn.rollback();
			
			e.printStackTrace();
			setErrorMessage("ZZ01105");
			setReadStatus(ERROR);
		} catch (Exception e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			throw new ExpjException(e, emsg);
		}
                //}}user_implement_dev:<controlupdate>
		logger.exiting("KQ0100010Control"+":USER="+struct.getsUser_ID(),"controlupdate");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlclear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0100");
		logger.entering("KQ0100010Control"+":USER="+struct.getsUser_ID(),"controlclear");
			//{{user_implement_dev:<controlclear>
			// TODO: ユーザ定義のコードを記述してください
		initializeAll();
                //}}user_implement_dev:<controlclear>
		logger.exiting("KQ0100010Control"+":USER="+struct.getsUser_ID(),"controlclear");

		return;
	}

	/**
	 * 閉じるボタン押下時に実行される処理です。
	 *
	 */
	public void controlclose() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0100");
		logger.entering("KQ0100010Control"+":USER="+struct.getsUser_ID(),"controlclose");
			//{{user_implement_dev:<controlclose>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlclose>
		logger.exiting("KQ0100010Control"+":USER="+struct.getsUser_ID(),"controlclose");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0100");
		logger.entering("KQ0100010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("KQ0100010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0100");
		logger.entering("KQ0100010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
			// TODO: ユーザ定義のコードを記述してください
		try{
			
			// クリア処理
            controlclear();
            
			// =======================================
			// 自社情報の取得
			// =======================================
			List listCompanyInfo = entity.mgetCompanyInfo.read(conn,struct);
			if(listCompanyInfo.isEmpty()){
				//自社情報が無い/複数件
				ExpjMessage emsg = new ExpjMessage("KQ00039");
	            msgStruct.addError(emsg);	// エラーメッセージとして登録
	            sysLog.severe(emsg, getsysUSER_CD()); //エラー内容
	            ExpjException ee = new ExpjException(emsg);
	            throw ee;
			}else{
				COMPANY_CD = ((KQ0100010Struct)listCompanyInfo.get(0)).getCOMPANY_CD();
			}

			// コンボボックスデータ用意
            ComboBox controller = new ComboBox(conn, sysUSER_CD);
            _INSPC_ACPT_TYP = controller.getData("INSPC_ACPT_TYP");
            _STATUS_TYP = controller.getData("ORD_PROGRESS_STS_01");
            
		} catch (SQLException e){
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
		logger.exiting("KQ0100010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * イベントハンドラの前処理です。
	 *
	 * @param buttun ボタン名
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0100");
		logger.entering("KQ0100010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
		logger.exiting("KQ0100010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("update") ) {
				controlupdate();
			} else if( button.equals("clear") ) {
				controlclear();
			} else if( button.equals("close") ) {
				controlclose();
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
//			throw new FoundationException("KQ0100010Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KQ0100010-E999","CSVの出力処理"));
			throw new FoundationException("KQ0100010Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KQ0100010-E999","システム日付の取得処理"));
				throw new FoundationException("KQ0100010Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KQ0100010-E999","コントロールのイベント処理"));
			throw new FoundationException("KQ0100010Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected KQ0100010Entity entity;
	protected KQ0100010Struct struct;
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

		entity = new KQ0100010Entity();
		struct = new KQ0100010Struct();

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
	 * KQ0100010クラスの標準コンストラクタ
	 */
	public KQ0100010Control() throws BusinessProcessException, FoundationException
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
				KQ0100010Struct key = (KQ0100010Struct)keyList.get(j);
				// メッセージキーを作成する
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("h_UPDATE_FLG") && key.geth_UPDATE_FLG() != null) {
					msgKey.setKeyValue("h_UPDATE_FLG", key.geth_UPDATE_FLG());
				}
				if(msgKeyType.containsKeyColumn("r_SEL_PTN1") && key.getr_SEL_PTN1() != null) {
					msgKey.setKeyValue("r_SEL_PTN1", key.getr_SEL_PTN1());
				}
				if(msgKeyType.containsKeyColumn("r_SEL_PTN2") && key.getr_SEL_PTN2() != null) {
					msgKey.setKeyValue("r_SEL_PTN2", key.getr_SEL_PTN2());
				}
				if(msgKeyType.containsKeyColumn("INSPC_ACPT_TYP") && key.getINSPC_ACPT_TYP() != null) {
					msgKey.setKeyValue("INSPC_ACPT_TYP", key.getINSPC_ACPT_TYP());
				}
				if(msgKeyType.containsKeyColumn("SHIP_DLV_DATE") && key.getSHIP_DLV_DATE() != null) {
					msgKey.setKeyValue("SHIP_DLV_DATE", key.getSHIP_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_STATUS") && key.getl_STATUS() != null) {
					msgKey.setKeyValue("l_STATUS", key.getl_STATUS());
				}
				if(msgKeyType.containsKeyColumn("l_h_STATUS_CD") && key.getl_h_STATUS_CD() != null) {
					msgKey.setKeyValue("l_h_STATUS_CD", key.getl_h_STATUS_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ODR_SCDL_DLV_DATE") && key.getl_ODR_SCDL_DLV_DATE() != null) {
					msgKey.setKeyValue("l_ODR_SCDL_DLV_DATE", key.getl_ODR_SCDL_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_SHIP_SCDL_DLV_DATE") && key.getl_SHIP_SCDL_DLV_DATE() != null) {
					msgKey.setKeyValue("l_SHIP_SCDL_DLV_DATE", key.getl_SHIP_SCDL_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("h_TAX_CD") && key.geth_TAX_CD() != null) {
					msgKey.setKeyValue("h_TAX_CD", key.geth_TAX_CD());
				}
				if(msgKeyType.containsKeyColumn("l_h_SHIP_ODR_AMOUNT") && key.getl_h_SHIP_ODR_AMOUNT() != null) {
					msgKey.setKeyValue("l_h_SHIP_ODR_AMOUNT", key.getl_h_SHIP_ODR_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("l_h_SALES_AMOUNT") && key.getl_h_SALES_AMOUNT() != null) {
					msgKey.setKeyValue("l_h_SALES_AMOUNT", key.getl_h_SALES_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("l_h_AI_AR_IF_FLG") && key.getl_h_AI_AR_IF_FLG() != null) {
					msgKey.setKeyValue("l_h_AI_AR_IF_FLG", key.getl_h_AI_AR_IF_FLG());
				}
				if(msgKeyType.containsKeyColumn("l_h_TAX_DESINATED_SHIP_DATE") && key.getl_h_TAX_DESINATED_SHIP_DATE() != null) {
					msgKey.setKeyValue("l_h_TAX_DESINATED_SHIP_DATE", key.getl_h_TAX_DESINATED_SHIP_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_h_SALES_SLIP_CD") && key.getl_h_SALES_SLIP_CD() != null) {
					msgKey.setKeyValue("l_h_SALES_SLIP_CD", key.getl_h_SALES_SLIP_CD());
				}
				if(msgKeyType.containsKeyColumn("l_h_UPDATE_FLG") && key.getl_h_UPDATE_FLG() != null) {
					msgKey.setKeyValue("l_h_UPDATE_FLG", key.getl_h_UPDATE_FLG());
				}
				if(msgKeyType.containsKeyColumn("h_SLIP_CTRL_GRP") && key.geth_SLIP_CTRL_GRP() != null) {
					msgKey.setKeyValue("h_SLIP_CTRL_GRP", key.geth_SLIP_CTRL_GRP());
				}
				if(msgKeyType.containsKeyColumn("h_ODR_NO") && key.geth_ODR_NO() != null) {
					msgKey.setKeyValue("h_ODR_NO", key.geth_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("CUST_ODR_NO") && key.getCUST_ODR_NO() != null) {
					msgKey.setKeyValue("CUST_ODR_NO", key.getCUST_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_NAME") && key.getITEM_NAME() != null) {
					msgKey.setKeyValue("ITEM_NAME", key.getITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("CUST_CD") && key.getCUST_CD() != null) {
					msgKey.setKeyValue("CUST_CD", key.getCUST_CD());
				}
				if(msgKeyType.containsKeyColumn("CUST_NAME") && key.getCUST_NAME() != null) {
					msgKey.setKeyValue("CUST_NAME", key.getCUST_NAME());
				}
				if(msgKeyType.containsKeyColumn("CUST_ITEM_CD") && key.getCUST_ITEM_CD() != null) {
					msgKey.setKeyValue("CUST_ITEM_CD", key.getCUST_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("CUST_ITEM_NAME") && key.getCUST_ITEM_NAME() != null) {
					msgKey.setKeyValue("CUST_ITEM_NAME", key.getCUST_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("ODR_ACPT_DATE") && key.getODR_ACPT_DATE() != null) {
					msgKey.setKeyValue("ODR_ACPT_DATE", key.getODR_ACPT_DATE());
				}
				if(msgKeyType.containsKeyColumn("DESINATED_DLV_DATE") && key.getDESINATED_DLV_DATE() != null) {
					msgKey.setKeyValue("DESINATED_DLV_DATE", key.getDESINATED_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("ODR_UNIT_PRICE") && key.getODR_UNIT_PRICE() != null) {
					msgKey.setKeyValue("ODR_UNIT_PRICE", key.getODR_UNIT_PRICE());
				}
				if(msgKeyType.containsKeyColumn("ODR_UNIT_CD") && key.getODR_UNIT_CD() != null) {
					msgKey.setKeyValue("ODR_UNIT_CD", key.getODR_UNIT_CD());
				}
				if(msgKeyType.containsKeyColumn("ODR_QTY") && key.getODR_QTY() != null) {
					msgKey.setKeyValue("ODR_QTY", key.getODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("TAX_CD") && key.getTAX_CD() != null) {
					msgKey.setKeyValue("TAX_CD", key.getTAX_CD());
				}
				if(msgKeyType.containsKeyColumn("ODR_AMOUNT") && key.getODR_AMOUNT() != null) {
					msgKey.setKeyValue("ODR_AMOUNT", key.getODR_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("ODR_AMOUNT_UNIT_CD") && key.getODR_AMOUNT_UNIT_CD() != null) {
					msgKey.setKeyValue("ODR_AMOUNT_UNIT_CD", key.getODR_AMOUNT_UNIT_CD());
				}
				if(msgKeyType.containsKeyColumn("h_INSPC_ACPT_TYP") && key.geth_INSPC_ACPT_TYP() != null) {
					msgKey.setKeyValue("h_INSPC_ACPT_TYP", key.geth_INSPC_ACPT_TYP());
				}
				if(msgKeyType.containsKeyColumn("h_CURRNCY_CD") && key.geth_CURRNCY_CD() != null) {
					msgKey.setKeyValue("h_CURRNCY_CD", key.geth_CURRNCY_CD());
				}
				if(msgKeyType.containsKeyColumn("h_EXCH_TYP") && key.geth_EXCH_TYP() != null) {
					msgKey.setKeyValue("h_EXCH_TYP", key.geth_EXCH_TYP());
				}
				if(msgKeyType.containsKeyColumn("h_PRICE_ROUND_TYP") && key.geth_PRICE_ROUND_TYP() != null) {
					msgKey.setKeyValue("h_PRICE_ROUND_TYP", key.geth_PRICE_ROUND_TYP());
				}
				if(msgKeyType.containsKeyColumn("h_TRANSPORT_LT") && key.geth_TRANSPORT_LT() != null) {
					msgKey.setKeyValue("h_TRANSPORT_LT", key.geth_TRANSPORT_LT());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("h_MODIFY_COUNT") && key.geth_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("h_MODIFY_COUNT", key.geth_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("COMPANY_CD") && key.getCOMPANY_CD() != null) {
					msgKey.setKeyValue("COMPANY_CD", key.getCOMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("ODR_NO") && key.getODR_NO() != null) {
					msgKey.setKeyValue("ODR_NO", key.getODR_NO());
				}
				if(msgKeyType.containsKeyColumn("l_ODR_ODR_NO") && key.getl_ODR_ODR_NO() != null) {
					msgKey.setKeyValue("l_ODR_ODR_NO", key.getl_ODR_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("l_JOB_ODR_CD") && key.getl_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("l_JOB_ODR_CD", key.getl_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("l_PART_DLV_SEQ_NO") && key.getl_PART_DLV_SEQ_NO() != null) {
					msgKey.setKeyValue("l_PART_DLV_SEQ_NO", key.getl_PART_DLV_SEQ_NO());
				}
				if(msgKeyType.containsKeyColumn("l_DLV_ODR_NO") && key.getl_DLV_ODR_NO() != null) {
					msgKey.setKeyValue("l_DLV_ODR_NO", key.getl_DLV_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("l_SHIP_ODR_SLIP_CD") && key.getl_SHIP_ODR_SLIP_CD() != null) {
					msgKey.setKeyValue("l_SHIP_ODR_SLIP_CD", key.getl_SHIP_ODR_SLIP_CD());
				}
				if(msgKeyType.containsKeyColumn("l_DESINATED_SHIP_DATE") && key.getl_DESINATED_SHIP_DATE() != null) {
					msgKey.setKeyValue("l_DESINATED_SHIP_DATE", key.getl_DESINATED_SHIP_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_SCDL_DLV_DATE") && key.getl_SCDL_DLV_DATE() != null) {
					msgKey.setKeyValue("l_SCDL_DLV_DATE", key.getl_SCDL_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_SHIP_ODR_NO") && key.getl_SHIP_ODR_NO() != null) {
					msgKey.setKeyValue("l_SHIP_ODR_NO", key.getl_SHIP_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("l_ODR_AMOUNT") && key.getl_ODR_AMOUNT() != null) {
					msgKey.setKeyValue("l_ODR_AMOUNT", key.getl_ODR_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("l_SHIP_DATE") && key.getl_SHIP_DATE() != null) {
					msgKey.setKeyValue("l_SHIP_DATE", key.getl_SHIP_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_SHIP_ODR_AMOUNT") && key.getl_SHIP_ODR_AMOUNT() != null) {
					msgKey.setKeyValue("l_SHIP_ODR_AMOUNT", key.getl_SHIP_ODR_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("l_SHIP_SEQ_NO") && key.getl_SHIP_SEQ_NO() != null) {
					msgKey.setKeyValue("l_SHIP_SEQ_NO", key.getl_SHIP_SEQ_NO());
				}
				if(msgKeyType.containsKeyColumn("l_SALES_DATE") && key.getl_SALES_DATE() != null) {
					msgKey.setKeyValue("l_SALES_DATE", key.getl_SALES_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_SALES_AMOUNT") && key.getl_SALES_AMOUNT() != null) {
					msgKey.setKeyValue("l_SALES_AMOUNT", key.getl_SALES_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("l_AI_AR_IF_FLG") && key.getl_AI_AR_IF_FLG() != null) {
					msgKey.setKeyValue("l_AI_AR_IF_FLG", key.getl_AI_AR_IF_FLG());
				}
				if(msgKeyType.containsKeyColumn("l_SALES_SEQ_NO") && key.getl_SALES_SEQ_NO() != null) {
					msgKey.setKeyValue("l_SALES_SEQ_NO", key.getl_SALES_SEQ_NO());
				}
				if(msgKeyType.containsKeyColumn("l_SALES_SLIP_CD") && key.getl_SALES_SLIP_CD() != null) {
					msgKey.setKeyValue("l_SALES_SLIP_CD", key.getl_SALES_SLIP_CD());
				}
				if(msgKeyType.containsKeyColumn("l_SALES_STATUS") && key.getl_SALES_STATUS() != null) {
					msgKey.setKeyValue("l_SALES_STATUS", key.getl_SALES_STATUS());
				}
				if(msgKeyType.containsKeyColumn("l_AR_SLIP_CD") && key.getl_AR_SLIP_CD() != null) {
					msgKey.setKeyValue("l_AR_SLIP_CD", key.getl_AR_SLIP_CD());
				}
				if(msgKeyType.containsKeyColumn("l_AR_TRN_SLIP_CD") && key.getl_AR_TRN_SLIP_CD() != null) {
					msgKey.setKeyValue("l_AR_TRN_SLIP_CD", key.getl_AR_TRN_SLIP_CD());
				}
				if(msgKeyType.containsKeyColumn("l_h_INSPC_ACPT_DATE") && key.getl_h_INSPC_ACPT_DATE() != null) {
					msgKey.setKeyValue("l_h_INSPC_ACPT_DATE", key.getl_h_INSPC_ACPT_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_h_AR_INSPC_ACPT_DATE") && key.getl_h_AR_INSPC_ACPT_DATE() != null) {
					msgKey.setKeyValue("l_h_AR_INSPC_ACPT_DATE", key.getl_h_AR_INSPC_ACPT_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_h_AR_SALES_AMOUNT") && key.getl_h_AR_SALES_AMOUNT() != null) {
					msgKey.setKeyValue("l_h_AR_SALES_AMOUNT", key.getl_h_AR_SALES_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("l_h_AR_TRN_INSPC_ACPT_DATE") && key.getl_h_AR_TRN_INSPC_ACPT_DATE() != null) {
					msgKey.setKeyValue("l_h_AR_TRN_INSPC_ACPT_DATE", key.getl_h_AR_TRN_INSPC_ACPT_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_h_AR_TRN_SALES_AMOUNT") && key.getl_h_AR_TRN_SALES_AMOUNT() != null) {
					msgKey.setKeyValue("l_h_AR_TRN_SALES_AMOUNT", key.getl_h_AR_TRN_SALES_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("AR_STATUS") && key.getAR_STATUS() != null) {
					msgKey.setKeyValue("AR_STATUS", key.getAR_STATUS());
				}
				if(msgKeyType.containsKeyColumn("AR_TRN_STATUS") && key.getAR_TRN_STATUS() != null) {
					msgKey.setKeyValue("AR_TRN_STATUS", key.getAR_TRN_STATUS());
				}
				if(msgKeyType.containsKeyColumn("SLIP_CTRL_GRP") && key.getSLIP_CTRL_GRP() != null) {
					msgKey.setKeyValue("SLIP_CTRL_GRP", key.getSLIP_CTRL_GRP());
				}
				if(msgKeyType.containsKeyColumn("OPTION_ID") && key.getOPTION_ID() != null) {
					msgKey.setKeyValue("OPTION_ID", key.getOPTION_ID());
				}
				if(msgKeyType.containsKeyColumn("CODE") && key.getCODE() != null) {
					msgKey.setKeyValue("CODE", key.getCODE());
				}
				if(msgKeyType.containsKeyColumn("CREATED_BY") && key.getCREATED_BY() != null) {
					msgKey.setKeyValue("CREATED_BY", key.getCREATED_BY());
				}
				if(msgKeyType.containsKeyColumn("CREATED_PRG_NM") && key.getCREATED_PRG_NM() != null) {
					msgKey.setKeyValue("CREATED_PRG_NM", key.getCREATED_PRG_NM());
				}
				if(msgKeyType.containsKeyColumn("slipSHIP_ODR_AMOUNT") && key.getslipSHIP_ODR_AMOUNT() != null) {
					msgKey.setKeyValue("slipSHIP_ODR_AMOUNT", key.getslipSHIP_ODR_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("slipTAX_AMOUNT") && key.getslipTAX_AMOUNT() != null) {
					msgKey.setKeyValue("slipTAX_AMOUNT", key.getslipTAX_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("slipSHIP_ODR_AMOUNT_TAX") && key.getslipSHIP_ODR_AMOUNT_TAX() != null) {
					msgKey.setKeyValue("slipSHIP_ODR_AMOUNT_TAX", key.getslipSHIP_ODR_AMOUNT_TAX());
				}
				if(msgKeyType.containsKeyColumn("slipEXTERNAL_TAX_SALES_AMOUNT") && key.getslipEXTERNAL_TAX_SALES_AMOUNT() != null) {
					msgKey.setKeyValue("slipEXTERNAL_TAX_SALES_AMOUNT", key.getslipEXTERNAL_TAX_SALES_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("slipINTERNAL_TAX_SALES_AMOUNT") && key.getslipINTERNAL_TAX_SALES_AMOUNT() != null) {
					msgKey.setKeyValue("slipINTERNAL_TAX_SALES_AMOUNT", key.getslipINTERNAL_TAX_SALES_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("slipTAXFREE_SALES_AMOUNT") && key.getslipTAXFREE_SALES_AMOUNT() != null) {
					msgKey.setKeyValue("slipTAXFREE_SALES_AMOUNT", key.getslipTAXFREE_SALES_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("slipTAX_CREDIT_SALES_AMOUNT") && key.getslipTAX_CREDIT_SALES_AMOUNT() != null) {
					msgKey.setKeyValue("slipTAX_CREDIT_SALES_AMOUNT", key.getslipTAX_CREDIT_SALES_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("slipEXTERNAL_TAX_AMOUNT") && key.getslipEXTERNAL_TAX_AMOUNT() != null) {
					msgKey.setKeyValue("slipEXTERNAL_TAX_AMOUNT", key.getslipEXTERNAL_TAX_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("slipINTERNAL_TAX_AMOUNT") && key.getslipINTERNAL_TAX_AMOUNT() != null) {
					msgKey.setKeyValue("slipINTERNAL_TAX_AMOUNT", key.getslipINTERNAL_TAX_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("slipTAX_AMOUNT_1") && key.getslipTAX_AMOUNT_1() != null) {
					msgKey.setKeyValue("slipTAX_AMOUNT_1", key.getslipTAX_AMOUNT_1());
				}
				if(msgKeyType.containsKeyColumn("slipTAX_AMOUNT_2") && key.getslipTAX_AMOUNT_2() != null) {
					msgKey.setKeyValue("slipTAX_AMOUNT_2", key.getslipTAX_AMOUNT_2());
				}
				if(msgKeyType.containsKeyColumn("slipTAX_AMOUNT_3") && key.getslipTAX_AMOUNT_3() != null) {
					msgKey.setKeyValue("slipTAX_AMOUNT_3", key.getslipTAX_AMOUNT_3());
				}
				if(msgKeyType.containsKeyColumn("slipOWN_CUR_TAXCREDIT_SALES_AMOUNT") && key.getslipOWN_CUR_TAXCREDIT_SALES_AMOUNT() != null) {
					msgKey.setKeyValue("slipOWN_CUR_TAXCREDIT_SALES_AMOUNT", key.getslipOWN_CUR_TAXCREDIT_SALES_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("selectSHIP_ODR_NO") && key.getselectSHIP_ODR_NO() != null) {
					msgKey.setKeyValue("selectSHIP_ODR_NO", key.getselectSHIP_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("selectSLIP_CD") && key.getselectSLIP_CD() != null) {
					msgKey.setKeyValue("selectSLIP_CD", key.getselectSLIP_CD());
				}
				if(msgKeyType.containsKeyColumn("selectSALES_TYP") && key.getselectSALES_TYP() != null) {
					msgKey.setKeyValue("selectSALES_TYP", key.getselectSALES_TYP());
				}
				if(msgKeyType.containsKeyColumn("selectCUST_CD") && key.getselectCUST_CD() != null) {
					msgKey.setKeyValue("selectCUST_CD", key.getselectCUST_CD());
				}
				if(msgKeyType.containsKeyColumn("selectITEM_CD") && key.getselectITEM_CD() != null) {
					msgKey.setKeyValue("selectITEM_CD", key.getselectITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("selectITEM_NAME") && key.getselectITEM_NAME() != null) {
					msgKey.setKeyValue("selectITEM_NAME", key.getselectITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("selectCUST_ODR_NO") && key.getselectCUST_ODR_NO() != null) {
					msgKey.setKeyValue("selectCUST_ODR_NO", key.getselectCUST_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("selectSALES_DATE") && key.getselectSALES_DATE() != null) {
					msgKey.setKeyValue("selectSALES_DATE", key.getselectSALES_DATE());
				}
				if(msgKeyType.containsKeyColumn("selectSALES_DEPT_CD") && key.getselectSALES_DEPT_CD() != null) {
					msgKey.setKeyValue("selectSALES_DEPT_CD", key.getselectSALES_DEPT_CD());
				}
				if(msgKeyType.containsKeyColumn("selectVEND_CD") && key.getselectVEND_CD() != null) {
					msgKey.setKeyValue("selectVEND_CD", key.getselectVEND_CD());
				}
				if(msgKeyType.containsKeyColumn("selectPRD_ODR_PLACE_CD") && key.getselectPRD_ODR_PLACE_CD() != null) {
					msgKey.setKeyValue("selectPRD_ODR_PLACE_CD", key.getselectPRD_ODR_PLACE_CD());
				}
				if(msgKeyType.containsKeyColumn("selectCUST_CHRG_PSN_CD") && key.getselectCUST_CHRG_PSN_CD() != null) {
					msgKey.setKeyValue("selectCUST_CHRG_PSN_CD", key.getselectCUST_CHRG_PSN_CD());
				}
				if(msgKeyType.containsKeyColumn("selectODR_ACPT_PSN_CD") && key.getselectODR_ACPT_PSN_CD() != null) {
					msgKey.setKeyValue("selectODR_ACPT_PSN_CD", key.getselectODR_ACPT_PSN_CD());
				}
				if(msgKeyType.containsKeyColumn("selectSALES_QTY") && key.getselectSALES_QTY() != null) {
					msgKey.setKeyValue("selectSALES_QTY", key.getselectSALES_QTY());
				}
				if(msgKeyType.containsKeyColumn("selectSALES_UNIT_PRICE") && key.getselectSALES_UNIT_PRICE() != null) {
					msgKey.setKeyValue("selectSALES_UNIT_PRICE", key.getselectSALES_UNIT_PRICE());
				}
				if(msgKeyType.containsKeyColumn("selectUNIT_CD") && key.getselectUNIT_CD() != null) {
					msgKey.setKeyValue("selectUNIT_CD", key.getselectUNIT_CD());
				}
				if(msgKeyType.containsKeyColumn("selectSALES_AMOUNT") && key.getselectSALES_AMOUNT() != null) {
					msgKey.setKeyValue("selectSALES_AMOUNT", key.getselectSALES_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("selectSALES_AMOUNT_EXCH_RATES") && key.getselectSALES_AMOUNT_EXCH_RATES() != null) {
					msgKey.setKeyValue("selectSALES_AMOUNT_EXCH_RATES", key.getselectSALES_AMOUNT_EXCH_RATES());
				}
				if(msgKeyType.containsKeyColumn("selectINSPC_ACPT_DATE") && key.getselectINSPC_ACPT_DATE() != null) {
					msgKey.setKeyValue("selectINSPC_ACPT_DATE", key.getselectINSPC_ACPT_DATE());
				}
				if(msgKeyType.containsKeyColumn("selectINSPC_ACPT_QTY") && key.getselectINSPC_ACPT_QTY() != null) {
					msgKey.setKeyValue("selectINSPC_ACPT_QTY", key.getselectINSPC_ACPT_QTY());
				}
				if(msgKeyType.containsKeyColumn("selectEXTERNAL_TAX_SALES_AMOUNT") && key.getselectEXTERNAL_TAX_SALES_AMOUNT() != null) {
					msgKey.setKeyValue("selectEXTERNAL_TAX_SALES_AMOUNT", key.getselectEXTERNAL_TAX_SALES_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("selectINTERNAL_TAX_SALES_AMOUNT") && key.getselectINTERNAL_TAX_SALES_AMOUNT() != null) {
					msgKey.setKeyValue("selectINTERNAL_TAX_SALES_AMOUNT", key.getselectINTERNAL_TAX_SALES_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("selectTAXFREE_SALES_AMOUNT") && key.getselectTAXFREE_SALES_AMOUNT() != null) {
					msgKey.setKeyValue("selectTAXFREE_SALES_AMOUNT", key.getselectTAXFREE_SALES_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("selectTAX_CREDIT_SALES_AMOUNT") && key.getselectTAX_CREDIT_SALES_AMOUNT() != null) {
					msgKey.setKeyValue("selectTAX_CREDIT_SALES_AMOUNT", key.getselectTAX_CREDIT_SALES_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("selectEXTERNAL_TAX_AMOUNT") && key.getselectEXTERNAL_TAX_AMOUNT() != null) {
					msgKey.setKeyValue("selectEXTERNAL_TAX_AMOUNT", key.getselectEXTERNAL_TAX_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("selectINTERNAL_TAX_AMOUNT") && key.getselectINTERNAL_TAX_AMOUNT() != null) {
					msgKey.setKeyValue("selectINTERNAL_TAX_AMOUNT", key.getselectINTERNAL_TAX_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("selectTAX_AMOUNT_1") && key.getselectTAX_AMOUNT_1() != null) {
					msgKey.setKeyValue("selectTAX_AMOUNT_1", key.getselectTAX_AMOUNT_1());
				}
				if(msgKeyType.containsKeyColumn("selectTAX_AMOUNT_2") && key.getselectTAX_AMOUNT_2() != null) {
					msgKey.setKeyValue("selectTAX_AMOUNT_2", key.getselectTAX_AMOUNT_2());
				}
				if(msgKeyType.containsKeyColumn("selectTAX_AMOUNT_3") && key.getselectTAX_AMOUNT_3() != null) {
					msgKey.setKeyValue("selectTAX_AMOUNT_3", key.getselectTAX_AMOUNT_3());
				}
				if(msgKeyType.containsKeyColumn("selectOWN_CUR_TAXCREDIT_SALES_AMOUNT") && key.getselectOWN_CUR_TAXCREDIT_SALES_AMOUNT() != null) {
					msgKey.setKeyValue("selectOWN_CUR_TAXCREDIT_SALES_AMOUNT", key.getselectOWN_CUR_TAXCREDIT_SALES_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("selectORG_SLIP_CD") && key.getselectORG_SLIP_CD() != null) {
					msgKey.setKeyValue("selectORG_SLIP_CD", key.getselectORG_SLIP_CD());
				}
				if(msgKeyType.containsKeyColumn("selectCURRNCY_CD") && key.getselectCURRNCY_CD() != null) {
					msgKey.setKeyValue("selectCURRNCY_CD", key.getselectCURRNCY_CD());
				}
				if(msgKeyType.containsKeyColumn("selectSPCL_PRICE_CO") && key.getselectSPCL_PRICE_CO() != null) {
					msgKey.setKeyValue("selectSPCL_PRICE_CO", key.getselectSPCL_PRICE_CO());
				}
				if(msgKeyType.containsKeyColumn("selectREMARKS") && key.getselectREMARKS() != null) {
					msgKey.setKeyValue("selectREMARKS", key.getselectREMARKS());
				}
				if(msgKeyType.containsKeyColumn("selectINSPC_ACPT_TYP") && key.getselectINSPC_ACPT_TYP() != null) {
					msgKey.setKeyValue("selectINSPC_ACPT_TYP", key.getselectINSPC_ACPT_TYP());
				}
				if(msgKeyType.containsKeyColumn("selectSTATUS") && key.getselectSTATUS() != null) {
					msgKey.setKeyValue("selectSTATUS", key.getselectSTATUS());
				}
				if(msgKeyType.containsKeyColumn("l_h_SALES_SEQ_NO") && key.getl_h_SALES_SEQ_NO() != null) {
					msgKey.setKeyValue("l_h_SALES_SEQ_NO", key.getl_h_SALES_SEQ_NO());
				}
				if(msgKeyType.containsKeyColumn("salesEXTERNAL_TAX_SALES_AMOUNT") && key.getsalesEXTERNAL_TAX_SALES_AMOUNT() != null) {
					msgKey.setKeyValue("salesEXTERNAL_TAX_SALES_AMOUNT", key.getsalesEXTERNAL_TAX_SALES_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("salesINTERNAL_TAX_SALES_AMOUNT") && key.getsalesINTERNAL_TAX_SALES_AMOUNT() != null) {
					msgKey.setKeyValue("salesINTERNAL_TAX_SALES_AMOUNT", key.getsalesINTERNAL_TAX_SALES_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("salesTAXFREE_SALES_AMOUNT") && key.getsalesTAXFREE_SALES_AMOUNT() != null) {
					msgKey.setKeyValue("salesTAXFREE_SALES_AMOUNT", key.getsalesTAXFREE_SALES_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("salesTAX_CREDIT_SALES_AMOUNT") && key.getsalesTAX_CREDIT_SALES_AMOUNT() != null) {
					msgKey.setKeyValue("salesTAX_CREDIT_SALES_AMOUNT", key.getsalesTAX_CREDIT_SALES_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("salesEXTERNAL_TAX_AMOUNT") && key.getsalesEXTERNAL_TAX_AMOUNT() != null) {
					msgKey.setKeyValue("salesEXTERNAL_TAX_AMOUNT", key.getsalesEXTERNAL_TAX_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("salesINTERNAL_TAX_AMOUNT") && key.getsalesINTERNAL_TAX_AMOUNT() != null) {
					msgKey.setKeyValue("salesINTERNAL_TAX_AMOUNT", key.getsalesINTERNAL_TAX_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("salesTAX_AMOUNT_1") && key.getsalesTAX_AMOUNT_1() != null) {
					msgKey.setKeyValue("salesTAX_AMOUNT_1", key.getsalesTAX_AMOUNT_1());
				}
				if(msgKeyType.containsKeyColumn("salesTAX_AMOUNT_2") && key.getsalesTAX_AMOUNT_2() != null) {
					msgKey.setKeyValue("salesTAX_AMOUNT_2", key.getsalesTAX_AMOUNT_2());
				}
				if(msgKeyType.containsKeyColumn("salesTAX_AMOUNT_3") && key.getsalesTAX_AMOUNT_3() != null) {
					msgKey.setKeyValue("salesTAX_AMOUNT_3", key.getsalesTAX_AMOUNT_3());
				}
				if(msgKeyType.containsKeyColumn("salesOWN_CUR_TAXCREDIT_SALES_AMOUNT") && key.getsalesOWN_CUR_TAXCREDIT_SALES_AMOUNT() != null) {
					msgKey.setKeyValue("salesOWN_CUR_TAXCREDIT_SALES_AMOUNT", key.getsalesOWN_CUR_TAXCREDIT_SALES_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("SLIP_CD") && key.getSLIP_CD() != null) {
					msgKey.setKeyValue("SLIP_CD", key.getSLIP_CD());
				}
				if(msgKeyType.containsKeyColumn("COUNT") && key.getCOUNT() != null) {
					msgKey.setKeyValue("COUNT", key.getCOUNT());
				}
				if(msgKeyType.containsKeyColumn("ROW_COUNT") && key.getROW_COUNT() != null) {
					msgKey.setKeyValue("ROW_COUNT", key.getROW_COUNT());
				}
				if(msgKeyType.containsKeyColumn("insertSLIP_CD") && key.getinsertSLIP_CD() != null) {
					msgKey.setKeyValue("insertSLIP_CD", key.getinsertSLIP_CD());
				}
				if(msgKeyType.containsKeyColumn("l_h_SHIP_ODR_NO") && key.getl_h_SHIP_ODR_NO() != null) {
					msgKey.setKeyValue("l_h_SHIP_ODR_NO", key.getl_h_SHIP_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("ORGNAL_SLIP_CD") && key.getORGNAL_SLIP_CD() != null) {
					msgKey.setKeyValue("ORGNAL_SLIP_CD", key.getORGNAL_SLIP_CD());
				}
				if(msgKeyType.containsKeyColumn("l_h_SHIP_SEQ_NO") && key.getl_h_SHIP_SEQ_NO() != null) {
					msgKey.setKeyValue("l_h_SHIP_SEQ_NO", key.getl_h_SHIP_SEQ_NO());
				}
				if(msgKeyType.containsKeyColumn("MODIFY_COUNT") && key.getMODIFY_COUNT() != null) {
					msgKey.setKeyValue("MODIFY_COUNT", key.getMODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("TAX_CD_1") && key.getTAX_CD_1() != null) {
					msgKey.setKeyValue("TAX_CD_1", key.getTAX_CD_1());
				}
				if(msgKeyType.containsKeyColumn("TAX_CD_2") && key.getTAX_CD_2() != null) {
					msgKey.setKeyValue("TAX_CD_2", key.getTAX_CD_2());
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
				if(msgKeyType.containsKeyColumn("SLIP_DATE") && key.getSLIP_DATE() != null) {
					msgKey.setKeyValue("SLIP_DATE", key.getSLIP_DATE());
				}
				if(msgKeyType.containsKeyColumn("SUM_EXTERNAL_TAX_SALES_AMOUNT") && key.getSUM_EXTERNAL_TAX_SALES_AMOUNT() != null) {
					msgKey.setKeyValue("SUM_EXTERNAL_TAX_SALES_AMOUNT", key.getSUM_EXTERNAL_TAX_SALES_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("SUM_INTERNAL_TAX_SALES_AMOUNT") && key.getSUM_INTERNAL_TAX_SALES_AMOUNT() != null) {
					msgKey.setKeyValue("SUM_INTERNAL_TAX_SALES_AMOUNT", key.getSUM_INTERNAL_TAX_SALES_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("SUM_TAXFREE_SALES_AMOUNT") && key.getSUM_TAXFREE_SALES_AMOUNT() != null) {
					msgKey.setKeyValue("SUM_TAXFREE_SALES_AMOUNT", key.getSUM_TAXFREE_SALES_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("SUM_TAX_CREDIT_SALES_AMOUNT") && key.getSUM_TAX_CREDIT_SALES_AMOUNT() != null) {
					msgKey.setKeyValue("SUM_TAX_CREDIT_SALES_AMOUNT", key.getSUM_TAX_CREDIT_SALES_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("SUM_EXTERNAL_TAX_AMOUNT") && key.getSUM_EXTERNAL_TAX_AMOUNT() != null) {
					msgKey.setKeyValue("SUM_EXTERNAL_TAX_AMOUNT", key.getSUM_EXTERNAL_TAX_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("SUM_INTERNAL_TAX_AMOUNT") && key.getSUM_INTERNAL_TAX_AMOUNT() != null) {
					msgKey.setKeyValue("SUM_INTERNAL_TAX_AMOUNT", key.getSUM_INTERNAL_TAX_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("SUM_TAX_AMOUNT_1") && key.getSUM_TAX_AMOUNT_1() != null) {
					msgKey.setKeyValue("SUM_TAX_AMOUNT_1", key.getSUM_TAX_AMOUNT_1());
				}
				if(msgKeyType.containsKeyColumn("SUM_TAX_AMOUNT_2") && key.getSUM_TAX_AMOUNT_2() != null) {
					msgKey.setKeyValue("SUM_TAX_AMOUNT_2", key.getSUM_TAX_AMOUNT_2());
				}
				if(msgKeyType.containsKeyColumn("SUM_TAX_AMOUNT_3") && key.getSUM_TAX_AMOUNT_3() != null) {
					msgKey.setKeyValue("SUM_TAX_AMOUNT_3", key.getSUM_TAX_AMOUNT_3());
				}
				if(msgKeyType.containsKeyColumn("SUM_OWN_CUR_TAXCREDIT_SALES_AMOUNT") && key.getSUM_OWN_CUR_TAXCREDIT_SALES_AMOUNT() != null) {
					msgKey.setKeyValue("SUM_OWN_CUR_TAXCREDIT_SALES_AMOUNT", key.getSUM_OWN_CUR_TAXCREDIT_SALES_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("SEL_SLIP_CD") && key.getSEL_SLIP_CD() != null) {
					msgKey.setKeyValue("SEL_SLIP_CD", key.getSEL_SLIP_CD());
				}
				if(msgKeyType.containsKeyColumn("SEL_SHIP_CD") && key.getSEL_SHIP_CD() != null) {
					msgKey.setKeyValue("SEL_SHIP_CD", key.getSEL_SHIP_CD());
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
					KQ0100010Struct key = new KQ0100010Struct();
					if(msgKeyType.containsKeyColumn("h_UPDATE_FLG")) {
						key.seth_UPDATE_FLG(msgKey.getKeyValue("h_UPDATE_FLG"));
					}
					if(msgKeyType.containsKeyColumn("r_SEL_PTN1")) {
						key.setr_SEL_PTN1(msgKey.getKeyValue("r_SEL_PTN1"));
					}
					if(msgKeyType.containsKeyColumn("r_SEL_PTN2")) {
						key.setr_SEL_PTN2(msgKey.getKeyValue("r_SEL_PTN2"));
					}
					if(msgKeyType.containsKeyColumn("INSPC_ACPT_TYP")) {
						key.setINSPC_ACPT_TYP(msgKey.getKeyValue("INSPC_ACPT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("SHIP_DLV_DATE")) {
						key.setSHIP_DLV_DATE(msgKey.getKeyValue("SHIP_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_STATUS")) {
						key.setl_STATUS(msgKey.getKeyValue("l_STATUS"));
					}
					if(msgKeyType.containsKeyColumn("l_h_STATUS_CD")) {
						key.setl_h_STATUS_CD(msgKey.getKeyValue("l_h_STATUS_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ODR_SCDL_DLV_DATE")) {
						key.setl_ODR_SCDL_DLV_DATE(msgKey.getKeyValue("l_ODR_SCDL_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_SHIP_SCDL_DLV_DATE")) {
						key.setl_SHIP_SCDL_DLV_DATE(msgKey.getKeyValue("l_SHIP_SCDL_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("h_TAX_CD")) {
						key.seth_TAX_CD(msgKey.getKeyValue("h_TAX_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_h_SHIP_ODR_AMOUNT")) {
						key.setl_h_SHIP_ODR_AMOUNT(msgKey.getKeyValue("l_h_SHIP_ODR_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("l_h_SALES_AMOUNT")) {
						key.setl_h_SALES_AMOUNT(msgKey.getKeyValue("l_h_SALES_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("l_h_AI_AR_IF_FLG")) {
						key.setl_h_AI_AR_IF_FLG(msgKey.getKeyValue("l_h_AI_AR_IF_FLG"));
					}
					if(msgKeyType.containsKeyColumn("l_h_TAX_DESINATED_SHIP_DATE")) {
						key.setl_h_TAX_DESINATED_SHIP_DATE(msgKey.getKeyValue("l_h_TAX_DESINATED_SHIP_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_h_SALES_SLIP_CD")) {
						key.setl_h_SALES_SLIP_CD(msgKey.getKeyValue("l_h_SALES_SLIP_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_h_UPDATE_FLG")) {
						key.setl_h_UPDATE_FLG(msgKey.getKeyValue("l_h_UPDATE_FLG"));
					}
					if(msgKeyType.containsKeyColumn("h_SLIP_CTRL_GRP")) {
						key.seth_SLIP_CTRL_GRP(msgKey.getKeyValue("h_SLIP_CTRL_GRP"));
					}
					if(msgKeyType.containsKeyColumn("h_ODR_NO")) {
						key.seth_ODR_NO(msgKey.getKeyValue("h_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("CUST_ODR_NO")) {
						key.setCUST_ODR_NO(msgKey.getKeyValue("CUST_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_NAME")) {
						key.setITEM_NAME(msgKey.getKeyValue("ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("CUST_CD")) {
						key.setCUST_CD(msgKey.getKeyValue("CUST_CD"));
					}
					if(msgKeyType.containsKeyColumn("CUST_NAME")) {
						key.setCUST_NAME(msgKey.getKeyValue("CUST_NAME"));
					}
					if(msgKeyType.containsKeyColumn("CUST_ITEM_CD")) {
						key.setCUST_ITEM_CD(msgKey.getKeyValue("CUST_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("CUST_ITEM_NAME")) {
						key.setCUST_ITEM_NAME(msgKey.getKeyValue("CUST_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ODR_ACPT_DATE")) {
						key.setODR_ACPT_DATE(msgKey.getKeyValue("ODR_ACPT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("DESINATED_DLV_DATE")) {
						key.setDESINATED_DLV_DATE(msgKey.getKeyValue("DESINATED_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("ODR_UNIT_PRICE")) {
						key.setODR_UNIT_PRICE(msgKey.getKeyValue("ODR_UNIT_PRICE"));
					}
					if(msgKeyType.containsKeyColumn("ODR_UNIT_CD")) {
						key.setODR_UNIT_CD(msgKey.getKeyValue("ODR_UNIT_CD"));
					}
					if(msgKeyType.containsKeyColumn("ODR_QTY")) {
						key.setODR_QTY(msgKey.getKeyValue("ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("TAX_CD")) {
						key.setTAX_CD(msgKey.getKeyValue("TAX_CD"));
					}
					if(msgKeyType.containsKeyColumn("ODR_AMOUNT")) {
						key.setODR_AMOUNT(msgKey.getKeyValue("ODR_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("ODR_AMOUNT_UNIT_CD")) {
						key.setODR_AMOUNT_UNIT_CD(msgKey.getKeyValue("ODR_AMOUNT_UNIT_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_INSPC_ACPT_TYP")) {
						key.seth_INSPC_ACPT_TYP(msgKey.getKeyValue("h_INSPC_ACPT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("h_CURRNCY_CD")) {
						key.seth_CURRNCY_CD(msgKey.getKeyValue("h_CURRNCY_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_EXCH_TYP")) {
						key.seth_EXCH_TYP(msgKey.getKeyValue("h_EXCH_TYP"));
					}
					if(msgKeyType.containsKeyColumn("h_PRICE_ROUND_TYP")) {
						key.seth_PRICE_ROUND_TYP(msgKey.getKeyValue("h_PRICE_ROUND_TYP"));
					}
					if(msgKeyType.containsKeyColumn("h_TRANSPORT_LT")) {
						key.seth_TRANSPORT_LT(msgKey.getKeyValue("h_TRANSPORT_LT"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_MODIFY_COUNT")) {
						key.seth_MODIFY_COUNT(msgKey.getKeyValue("h_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("COMPANY_CD")) {
						key.setCOMPANY_CD(msgKey.getKeyValue("COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("ODR_NO")) {
						key.setODR_NO(msgKey.getKeyValue("ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_ODR_ODR_NO")) {
						key.setl_ODR_ODR_NO(msgKey.getKeyValue("l_ODR_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_JOB_ODR_CD")) {
						key.setl_JOB_ODR_CD(msgKey.getKeyValue("l_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_PART_DLV_SEQ_NO")) {
						key.setl_PART_DLV_SEQ_NO(msgKey.getKeyValue("l_PART_DLV_SEQ_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_DLV_ODR_NO")) {
						key.setl_DLV_ODR_NO(msgKey.getKeyValue("l_DLV_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_SHIP_ODR_SLIP_CD")) {
						key.setl_SHIP_ODR_SLIP_CD(msgKey.getKeyValue("l_SHIP_ODR_SLIP_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_DESINATED_SHIP_DATE")) {
						key.setl_DESINATED_SHIP_DATE(msgKey.getKeyValue("l_DESINATED_SHIP_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_SCDL_DLV_DATE")) {
						key.setl_SCDL_DLV_DATE(msgKey.getKeyValue("l_SCDL_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_SHIP_ODR_NO")) {
						key.setl_SHIP_ODR_NO(msgKey.getKeyValue("l_SHIP_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_ODR_AMOUNT")) {
						key.setl_ODR_AMOUNT(msgKey.getKeyValue("l_ODR_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("l_SHIP_DATE")) {
						key.setl_SHIP_DATE(msgKey.getKeyValue("l_SHIP_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_SHIP_ODR_AMOUNT")) {
						key.setl_SHIP_ODR_AMOUNT(msgKey.getKeyValue("l_SHIP_ODR_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("l_SHIP_SEQ_NO")) {
						key.setl_SHIP_SEQ_NO(msgKey.getKeyValue("l_SHIP_SEQ_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_SALES_DATE")) {
						key.setl_SALES_DATE(msgKey.getKeyValue("l_SALES_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_SALES_AMOUNT")) {
						key.setl_SALES_AMOUNT(msgKey.getKeyValue("l_SALES_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("l_AI_AR_IF_FLG")) {
						key.setl_AI_AR_IF_FLG(msgKey.getKeyValue("l_AI_AR_IF_FLG"));
					}
					if(msgKeyType.containsKeyColumn("l_SALES_SEQ_NO")) {
						key.setl_SALES_SEQ_NO(msgKey.getKeyValue("l_SALES_SEQ_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_SALES_SLIP_CD")) {
						key.setl_SALES_SLIP_CD(msgKey.getKeyValue("l_SALES_SLIP_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_SALES_STATUS")) {
						key.setl_SALES_STATUS(msgKey.getKeyValue("l_SALES_STATUS"));
					}
					if(msgKeyType.containsKeyColumn("l_AR_SLIP_CD")) {
						key.setl_AR_SLIP_CD(msgKey.getKeyValue("l_AR_SLIP_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_AR_TRN_SLIP_CD")) {
						key.setl_AR_TRN_SLIP_CD(msgKey.getKeyValue("l_AR_TRN_SLIP_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_h_INSPC_ACPT_DATE")) {
						key.setl_h_INSPC_ACPT_DATE(msgKey.getKeyValue("l_h_INSPC_ACPT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_h_AR_INSPC_ACPT_DATE")) {
						key.setl_h_AR_INSPC_ACPT_DATE(msgKey.getKeyValue("l_h_AR_INSPC_ACPT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_h_AR_SALES_AMOUNT")) {
						key.setl_h_AR_SALES_AMOUNT(msgKey.getKeyValue("l_h_AR_SALES_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("l_h_AR_TRN_INSPC_ACPT_DATE")) {
						key.setl_h_AR_TRN_INSPC_ACPT_DATE(msgKey.getKeyValue("l_h_AR_TRN_INSPC_ACPT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_h_AR_TRN_SALES_AMOUNT")) {
						key.setl_h_AR_TRN_SALES_AMOUNT(msgKey.getKeyValue("l_h_AR_TRN_SALES_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("AR_STATUS")) {
						key.setAR_STATUS(msgKey.getKeyValue("AR_STATUS"));
					}
					if(msgKeyType.containsKeyColumn("AR_TRN_STATUS")) {
						key.setAR_TRN_STATUS(msgKey.getKeyValue("AR_TRN_STATUS"));
					}
					if(msgKeyType.containsKeyColumn("SLIP_CTRL_GRP")) {
						key.setSLIP_CTRL_GRP(msgKey.getKeyValue("SLIP_CTRL_GRP"));
					}
					if(msgKeyType.containsKeyColumn("OPTION_ID")) {
						key.setOPTION_ID(msgKey.getKeyValue("OPTION_ID"));
					}
					if(msgKeyType.containsKeyColumn("CODE")) {
						key.setCODE(msgKey.getKeyValue("CODE"));
					}
					if(msgKeyType.containsKeyColumn("CREATED_BY")) {
						key.setCREATED_BY(msgKey.getKeyValue("CREATED_BY"));
					}
					if(msgKeyType.containsKeyColumn("CREATED_PRG_NM")) {
						key.setCREATED_PRG_NM(msgKey.getKeyValue("CREATED_PRG_NM"));
					}
					if(msgKeyType.containsKeyColumn("slipSHIP_ODR_AMOUNT")) {
						key.setslipSHIP_ODR_AMOUNT(msgKey.getKeyValue("slipSHIP_ODR_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("slipTAX_AMOUNT")) {
						key.setslipTAX_AMOUNT(msgKey.getKeyValue("slipTAX_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("slipSHIP_ODR_AMOUNT_TAX")) {
						key.setslipSHIP_ODR_AMOUNT_TAX(msgKey.getKeyValue("slipSHIP_ODR_AMOUNT_TAX"));
					}
					if(msgKeyType.containsKeyColumn("slipEXTERNAL_TAX_SALES_AMOUNT")) {
						key.setslipEXTERNAL_TAX_SALES_AMOUNT(msgKey.getKeyValue("slipEXTERNAL_TAX_SALES_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("slipINTERNAL_TAX_SALES_AMOUNT")) {
						key.setslipINTERNAL_TAX_SALES_AMOUNT(msgKey.getKeyValue("slipINTERNAL_TAX_SALES_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("slipTAXFREE_SALES_AMOUNT")) {
						key.setslipTAXFREE_SALES_AMOUNT(msgKey.getKeyValue("slipTAXFREE_SALES_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("slipTAX_CREDIT_SALES_AMOUNT")) {
						key.setslipTAX_CREDIT_SALES_AMOUNT(msgKey.getKeyValue("slipTAX_CREDIT_SALES_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("slipEXTERNAL_TAX_AMOUNT")) {
						key.setslipEXTERNAL_TAX_AMOUNT(msgKey.getKeyValue("slipEXTERNAL_TAX_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("slipINTERNAL_TAX_AMOUNT")) {
						key.setslipINTERNAL_TAX_AMOUNT(msgKey.getKeyValue("slipINTERNAL_TAX_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("slipTAX_AMOUNT_1")) {
						key.setslipTAX_AMOUNT_1(msgKey.getKeyValue("slipTAX_AMOUNT_1"));
					}
					if(msgKeyType.containsKeyColumn("slipTAX_AMOUNT_2")) {
						key.setslipTAX_AMOUNT_2(msgKey.getKeyValue("slipTAX_AMOUNT_2"));
					}
					if(msgKeyType.containsKeyColumn("slipTAX_AMOUNT_3")) {
						key.setslipTAX_AMOUNT_3(msgKey.getKeyValue("slipTAX_AMOUNT_3"));
					}
					if(msgKeyType.containsKeyColumn("slipOWN_CUR_TAXCREDIT_SALES_AMOUNT")) {
						key.setslipOWN_CUR_TAXCREDIT_SALES_AMOUNT(msgKey.getKeyValue("slipOWN_CUR_TAXCREDIT_SALES_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("selectSHIP_ODR_NO")) {
						key.setselectSHIP_ODR_NO(msgKey.getKeyValue("selectSHIP_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("selectSLIP_CD")) {
						key.setselectSLIP_CD(msgKey.getKeyValue("selectSLIP_CD"));
					}
					if(msgKeyType.containsKeyColumn("selectSALES_TYP")) {
						key.setselectSALES_TYP(msgKey.getKeyValue("selectSALES_TYP"));
					}
					if(msgKeyType.containsKeyColumn("selectCUST_CD")) {
						key.setselectCUST_CD(msgKey.getKeyValue("selectCUST_CD"));
					}
					if(msgKeyType.containsKeyColumn("selectITEM_CD")) {
						key.setselectITEM_CD(msgKey.getKeyValue("selectITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("selectITEM_NAME")) {
						key.setselectITEM_NAME(msgKey.getKeyValue("selectITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("selectCUST_ODR_NO")) {
						key.setselectCUST_ODR_NO(msgKey.getKeyValue("selectCUST_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("selectSALES_DATE")) {
						key.setselectSALES_DATE(msgKey.getKeyValue("selectSALES_DATE"));
					}
					if(msgKeyType.containsKeyColumn("selectSALES_DEPT_CD")) {
						key.setselectSALES_DEPT_CD(msgKey.getKeyValue("selectSALES_DEPT_CD"));
					}
					if(msgKeyType.containsKeyColumn("selectVEND_CD")) {
						key.setselectVEND_CD(msgKey.getKeyValue("selectVEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("selectPRD_ODR_PLACE_CD")) {
						key.setselectPRD_ODR_PLACE_CD(msgKey.getKeyValue("selectPRD_ODR_PLACE_CD"));
					}
					if(msgKeyType.containsKeyColumn("selectCUST_CHRG_PSN_CD")) {
						key.setselectCUST_CHRG_PSN_CD(msgKey.getKeyValue("selectCUST_CHRG_PSN_CD"));
					}
					if(msgKeyType.containsKeyColumn("selectODR_ACPT_PSN_CD")) {
						key.setselectODR_ACPT_PSN_CD(msgKey.getKeyValue("selectODR_ACPT_PSN_CD"));
					}
					if(msgKeyType.containsKeyColumn("selectSALES_QTY")) {
						key.setselectSALES_QTY(msgKey.getKeyValue("selectSALES_QTY"));
					}
					if(msgKeyType.containsKeyColumn("selectSALES_UNIT_PRICE")) {
						key.setselectSALES_UNIT_PRICE(msgKey.getKeyValue("selectSALES_UNIT_PRICE"));
					}
					if(msgKeyType.containsKeyColumn("selectUNIT_CD")) {
						key.setselectUNIT_CD(msgKey.getKeyValue("selectUNIT_CD"));
					}
					if(msgKeyType.containsKeyColumn("selectSALES_AMOUNT")) {
						key.setselectSALES_AMOUNT(msgKey.getKeyValue("selectSALES_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("selectSALES_AMOUNT_EXCH_RATES")) {
						key.setselectSALES_AMOUNT_EXCH_RATES(msgKey.getKeyValue("selectSALES_AMOUNT_EXCH_RATES"));
					}
					if(msgKeyType.containsKeyColumn("selectINSPC_ACPT_DATE")) {
						key.setselectINSPC_ACPT_DATE(msgKey.getKeyValue("selectINSPC_ACPT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("selectINSPC_ACPT_QTY")) {
						key.setselectINSPC_ACPT_QTY(msgKey.getKeyValue("selectINSPC_ACPT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("selectEXTERNAL_TAX_SALES_AMOUNT")) {
						key.setselectEXTERNAL_TAX_SALES_AMOUNT(msgKey.getKeyValue("selectEXTERNAL_TAX_SALES_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("selectINTERNAL_TAX_SALES_AMOUNT")) {
						key.setselectINTERNAL_TAX_SALES_AMOUNT(msgKey.getKeyValue("selectINTERNAL_TAX_SALES_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("selectTAXFREE_SALES_AMOUNT")) {
						key.setselectTAXFREE_SALES_AMOUNT(msgKey.getKeyValue("selectTAXFREE_SALES_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("selectTAX_CREDIT_SALES_AMOUNT")) {
						key.setselectTAX_CREDIT_SALES_AMOUNT(msgKey.getKeyValue("selectTAX_CREDIT_SALES_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("selectEXTERNAL_TAX_AMOUNT")) {
						key.setselectEXTERNAL_TAX_AMOUNT(msgKey.getKeyValue("selectEXTERNAL_TAX_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("selectINTERNAL_TAX_AMOUNT")) {
						key.setselectINTERNAL_TAX_AMOUNT(msgKey.getKeyValue("selectINTERNAL_TAX_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("selectTAX_AMOUNT_1")) {
						key.setselectTAX_AMOUNT_1(msgKey.getKeyValue("selectTAX_AMOUNT_1"));
					}
					if(msgKeyType.containsKeyColumn("selectTAX_AMOUNT_2")) {
						key.setselectTAX_AMOUNT_2(msgKey.getKeyValue("selectTAX_AMOUNT_2"));
					}
					if(msgKeyType.containsKeyColumn("selectTAX_AMOUNT_3")) {
						key.setselectTAX_AMOUNT_3(msgKey.getKeyValue("selectTAX_AMOUNT_3"));
					}
					if(msgKeyType.containsKeyColumn("selectOWN_CUR_TAXCREDIT_SALES_AMOUNT")) {
						key.setselectOWN_CUR_TAXCREDIT_SALES_AMOUNT(msgKey.getKeyValue("selectOWN_CUR_TAXCREDIT_SALES_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("selectORG_SLIP_CD")) {
						key.setselectORG_SLIP_CD(msgKey.getKeyValue("selectORG_SLIP_CD"));
					}
					if(msgKeyType.containsKeyColumn("selectCURRNCY_CD")) {
						key.setselectCURRNCY_CD(msgKey.getKeyValue("selectCURRNCY_CD"));
					}
					if(msgKeyType.containsKeyColumn("selectSPCL_PRICE_CO")) {
						key.setselectSPCL_PRICE_CO(msgKey.getKeyValue("selectSPCL_PRICE_CO"));
					}
					if(msgKeyType.containsKeyColumn("selectREMARKS")) {
						key.setselectREMARKS(msgKey.getKeyValue("selectREMARKS"));
					}
					if(msgKeyType.containsKeyColumn("selectINSPC_ACPT_TYP")) {
						key.setselectINSPC_ACPT_TYP(msgKey.getKeyValue("selectINSPC_ACPT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("selectSTATUS")) {
						key.setselectSTATUS(msgKey.getKeyValue("selectSTATUS"));
					}
					if(msgKeyType.containsKeyColumn("l_h_SALES_SEQ_NO")) {
						key.setl_h_SALES_SEQ_NO(msgKey.getKeyValue("l_h_SALES_SEQ_NO"));
					}
					if(msgKeyType.containsKeyColumn("salesEXTERNAL_TAX_SALES_AMOUNT")) {
						key.setsalesEXTERNAL_TAX_SALES_AMOUNT(msgKey.getKeyValue("salesEXTERNAL_TAX_SALES_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("salesINTERNAL_TAX_SALES_AMOUNT")) {
						key.setsalesINTERNAL_TAX_SALES_AMOUNT(msgKey.getKeyValue("salesINTERNAL_TAX_SALES_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("salesTAXFREE_SALES_AMOUNT")) {
						key.setsalesTAXFREE_SALES_AMOUNT(msgKey.getKeyValue("salesTAXFREE_SALES_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("salesTAX_CREDIT_SALES_AMOUNT")) {
						key.setsalesTAX_CREDIT_SALES_AMOUNT(msgKey.getKeyValue("salesTAX_CREDIT_SALES_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("salesEXTERNAL_TAX_AMOUNT")) {
						key.setsalesEXTERNAL_TAX_AMOUNT(msgKey.getKeyValue("salesEXTERNAL_TAX_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("salesINTERNAL_TAX_AMOUNT")) {
						key.setsalesINTERNAL_TAX_AMOUNT(msgKey.getKeyValue("salesINTERNAL_TAX_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("salesTAX_AMOUNT_1")) {
						key.setsalesTAX_AMOUNT_1(msgKey.getKeyValue("salesTAX_AMOUNT_1"));
					}
					if(msgKeyType.containsKeyColumn("salesTAX_AMOUNT_2")) {
						key.setsalesTAX_AMOUNT_2(msgKey.getKeyValue("salesTAX_AMOUNT_2"));
					}
					if(msgKeyType.containsKeyColumn("salesTAX_AMOUNT_3")) {
						key.setsalesTAX_AMOUNT_3(msgKey.getKeyValue("salesTAX_AMOUNT_3"));
					}
					if(msgKeyType.containsKeyColumn("salesOWN_CUR_TAXCREDIT_SALES_AMOUNT")) {
						key.setsalesOWN_CUR_TAXCREDIT_SALES_AMOUNT(msgKey.getKeyValue("salesOWN_CUR_TAXCREDIT_SALES_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("SLIP_CD")) {
						key.setSLIP_CD(msgKey.getKeyValue("SLIP_CD"));
					}
					if(msgKeyType.containsKeyColumn("COUNT")) {
						key.setCOUNT(msgKey.getKeyValue("COUNT"));
					}
					if(msgKeyType.containsKeyColumn("ROW_COUNT")) {
						key.setROW_COUNT(msgKey.getKeyValue("ROW_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("insertSLIP_CD")) {
						key.setinsertSLIP_CD(msgKey.getKeyValue("insertSLIP_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_h_SHIP_ODR_NO")) {
						key.setl_h_SHIP_ODR_NO(msgKey.getKeyValue("l_h_SHIP_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("ORGNAL_SLIP_CD")) {
						key.setORGNAL_SLIP_CD(msgKey.getKeyValue("ORGNAL_SLIP_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_h_SHIP_SEQ_NO")) {
						key.setl_h_SHIP_SEQ_NO(msgKey.getKeyValue("l_h_SHIP_SEQ_NO"));
					}
					if(msgKeyType.containsKeyColumn("MODIFY_COUNT")) {
						key.setMODIFY_COUNT(msgKey.getKeyValue("MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("TAX_CD_1")) {
						key.setTAX_CD_1(msgKey.getKeyValue("TAX_CD_1"));
					}
					if(msgKeyType.containsKeyColumn("TAX_CD_2")) {
						key.setTAX_CD_2(msgKey.getKeyValue("TAX_CD_2"));
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
					if(msgKeyType.containsKeyColumn("SLIP_DATE")) {
						key.setSLIP_DATE(msgKey.getKeyValue("SLIP_DATE"));
					}
					if(msgKeyType.containsKeyColumn("SUM_EXTERNAL_TAX_SALES_AMOUNT")) {
						key.setSUM_EXTERNAL_TAX_SALES_AMOUNT(msgKey.getKeyValue("SUM_EXTERNAL_TAX_SALES_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("SUM_INTERNAL_TAX_SALES_AMOUNT")) {
						key.setSUM_INTERNAL_TAX_SALES_AMOUNT(msgKey.getKeyValue("SUM_INTERNAL_TAX_SALES_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("SUM_TAXFREE_SALES_AMOUNT")) {
						key.setSUM_TAXFREE_SALES_AMOUNT(msgKey.getKeyValue("SUM_TAXFREE_SALES_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("SUM_TAX_CREDIT_SALES_AMOUNT")) {
						key.setSUM_TAX_CREDIT_SALES_AMOUNT(msgKey.getKeyValue("SUM_TAX_CREDIT_SALES_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("SUM_EXTERNAL_TAX_AMOUNT")) {
						key.setSUM_EXTERNAL_TAX_AMOUNT(msgKey.getKeyValue("SUM_EXTERNAL_TAX_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("SUM_INTERNAL_TAX_AMOUNT")) {
						key.setSUM_INTERNAL_TAX_AMOUNT(msgKey.getKeyValue("SUM_INTERNAL_TAX_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("SUM_TAX_AMOUNT_1")) {
						key.setSUM_TAX_AMOUNT_1(msgKey.getKeyValue("SUM_TAX_AMOUNT_1"));
					}
					if(msgKeyType.containsKeyColumn("SUM_TAX_AMOUNT_2")) {
						key.setSUM_TAX_AMOUNT_2(msgKey.getKeyValue("SUM_TAX_AMOUNT_2"));
					}
					if(msgKeyType.containsKeyColumn("SUM_TAX_AMOUNT_3")) {
						key.setSUM_TAX_AMOUNT_3(msgKey.getKeyValue("SUM_TAX_AMOUNT_3"));
					}
					if(msgKeyType.containsKeyColumn("SUM_OWN_CUR_TAXCREDIT_SALES_AMOUNT")) {
						key.setSUM_OWN_CUR_TAXCREDIT_SALES_AMOUNT(msgKey.getKeyValue("SUM_OWN_CUR_TAXCREDIT_SALES_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("SEL_SLIP_CD")) {
						key.setSEL_SLIP_CD(msgKey.getKeyValue("SEL_SLIP_CD"));
					}
					if(msgKeyType.containsKeyColumn("SEL_SHIP_CD")) {
						key.setSEL_SHIP_CD(msgKey.getKeyValue("SEL_SHIP_CD"));
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
