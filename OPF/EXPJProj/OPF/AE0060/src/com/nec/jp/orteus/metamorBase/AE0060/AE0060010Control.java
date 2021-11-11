/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AE0060/src/com/nec/jp/orteus/metamorBase/AE0060/AE0060010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AE0060;

import com.nec.jp.orteus.metamorBase.AE0060.*;
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
import java.text.ParseException;
import com.nec.jp.orteus.expj.flash.Kind;
import com.nec.jp.orteus.metamorBase.common01.Accessor.ProductStructureRepository;
import com.nec.jp.orteus.metamorBase.common01.util.Calculate;
import com.nec.jp.orteus.metamorBase.common02.CommonOd.ApsComException;
import com.nec.jp.orteus.metamorBase.common04.amount.AmountCalculator;
import com.nec.jp.orteus.metamorBase.common04.amount.ExchRateControl;
import com.nec.jp.orteus.metamorBase.common04.amount.ExchRateStruct;
import com.nec.jp.orteus.metamorBase.common04.amount.PuchUnitCostControl;
import com.nec.jp.orteus.metamorBase.common04.amount.PuchUnitCostStruct;
import com.nec.jp.orteus.metamorBase.common04.amount.TaxControl;
import com.nec.jp.orteus.metamorBase.common04.amount.TaxStruct;
import com.nec.jp.orteus.metamorBase.common04.sysdata.HomeCurControl;
import com.nec.jp.orteus.metamorBase.common04.sysdata.HomeCurStruct;
import com.nec.jp.orteus.metamorBase.common04.sysdata.MyCompanyControl;
import com.nec.jp.orteus.metamorBase.common04.sysdata.MyCompanyStruct;
import com.nec.jp.orteus.metamorBase.common04.sysdata.TaxNameControl;
import com.nec.jp.orteus.metamorBase.common04.sysdata.TaxNameStruct;
import com.nec.jp.orteus.metamorBase.common04.util.DataNotFoundException;
import java.math.BigDecimal;
import java.math.BigInteger;
import com.nec.jp.orteus.metamorBase.common.CollectNumber.CollectNumber;
import com.nec.jp.orteus.expj.pr.rcvissue.process.IssueRemain;
import com.nec.jp.orteus.expj.pr.rcvissue.util.StringUtil;
import com.nec.jp.orteus.metamorBase.common08.LotCtrl.*;
import com.nec.jp.orteus.expj.lot.*;
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AE0060010Control
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
	protected List list; // 一覧部分の結果リストを画面に表示するためのリストインスタンス

	// デフォルトアクセサメソッド
	public List getList() {
		return this.list;
	} // リストを返します。
	public void setList(List listname) {
		this.list = listname;
	} // リストをセットします。
	public int getListsize() { // リスト型のサイズを返します。
		int nret = 0;
		if (this.list != null) {
			nret = this.list.size();
		}
		return nret;
	}
	//	public Object getListvalue(int x) { return this.list.get(x); }	// リストの値を返します。
	public AE0060010Struct getListvalue(int x) {
		return (AE0060010Struct) (this.list.get(x));
	} // リストの値を返します。
	public AE0060010Struct getStruct() {
		return this.struct;
	} // Structを返します。
	public AE0060010Struct createStruct() {
		return new AE0060010Struct();
	} // 新しいStructを作って返します。
	public void setStruct(Object structname) {
		this.struct.setStruct((AE0060010Struct) structname);
	} // Structをセットします。
	public void initializeStruct() {
		this.struct.initialize();
	} // Structの値を初期化します。

	// CSV出力用リスト
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter() {
		return this.csvWriter;
	}

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr) {
		this.csvReader = cr;
	}

	// TODO: ユーザ定義のコードを記述してください
	/** [自社]情報 */
	private MyCompanyStruct _myCompanyStruct = new MyCompanyStruct();
	/** [税名]情報 */
	private TaxNameStruct _taxNameStruct = new TaxNameStruct();
	/** [邦貨]情報 */
	private HomeCurStruct _homeCurStruct = new HomeCurStruct();
	/** [コンボボックスデータ]情報（単価区分） */
	private ComboStruct _unitCostTypStruct = new ComboStruct();

	/** 画面遷移キー(発注番号) */
	private String _puchOdrCd;
	
	/** システム導入フラグ*/
	private boolean _lotCtrlFlg;
	
	/** 検査完了フラグ*/
	private String _inspcvalue;
    // 多言語項目取得対応
    ResourceBundle resource = CoreTools.getResourceBundle( "OrteusUserDic", CoreTools.getLocale(sysUSER_CD));
	
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
	 */
	private void setWarningMessage(String code, String value1, String value2) {
		ExpjMessage emsg = new ExpjMessage(code, value1, value2);
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
	 * 業務ロジックのエラーメッセージ設定処理を切り出して関数化
	 * @param code メッセージコード
	 * @param value1 置換文字列１
	 */
	private void setErrorMessage(String code, String value1, String value2) {
		ExpjMessage emsg = new ExpjMessage(code, value1, value2);
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

	/**
	 * 画面遷移キー(発注番号)取得
	 * @return 品目番号
	 */
	public String getPuchOdrCd() {
		return _puchOdrCd;
	}
	/**
	 * 画面遷移キー(発注番号)設定
	 * @param cd 品目番号
	 */
	public void setPuchOdrCd(String cd) {
		_puchOdrCd = cd;
	}

	/**
	 * Structの値をセットします。
	 * @param s 検索したデータ
	 */
	private void setStruct(AE0060010Struct s) throws SQLException, FoundationException{
		struct.setPUCH_ODR_CD(s.getPUCH_ODR_CD());								// 発注番号
		struct.setACPT_NO(s.getACPT_NO());										// 受入回数
		struct.setPUCH_ODR_MODIFY_COUNT(s.getPUCH_ODR_MODIFY_COUNT());			// 更新数
		struct.setITEM_CD(s.getITEM_CD());										// フォーム[品目番号]
		struct.setITEM_NAME(s.getITEM_NAME());									// フォーム[品目名]
		struct.setACPT_QTY(s.getACPT_QTY());									// 受入数
		struct.seth_ACPT_QTY(s.geth_ACPT_QTY());								// 受入数（隠し項目）
		struct.setODR_CANCEL_SLIP_ISS_FLG(s.getODR_CANCEL_SLIP_ISS_FLG());		// 取消し伝票発行フラグ
		struct.seth_ODR_CANCEL_SLIP_ISS_FLG(s.getODR_CANCEL_SLIP_ISS_FLG());	// 取消し伝票発行フラグ（隠し項目）
		struct.setSTOCK_UNIT(s.getSTOCK_UNIT());								// 計量単位
		struct.setACPT_DATE(s.getACPT_DATE());									// 受入日
		struct.setVEND_LOT_NO(s.getVEND_LOT_NO());								// メーカロット番号
		struct.setWH_CD(s.getWH_CD());											// 受入場所
		struct.setWH_NAME(s.getWH_NAME());										// 受入場所名
		if (s.getACPT_INSPC_TYP().equals("1")) {
			struct.setINSPC_WH_CD(null);										// フォーム[検査待ち保管区]
			struct.setINSPC_WH_NAME(null);										// フォーム[検査待ち保管区名]
		} else {
			struct.setINSPC_WH_CD(s.getINSPC_WH_CD());							// フォーム[検査待ち保管区]
			struct.setINSPC_WH_NAME(s.getINSPC_WH_NAME());						// フォーム[検査待ち保管区名]
		}
		struct.setCUR_CD(s.getCUR_CD());										// 取引通貨コード
		struct.setCUR_NAME(s.getCUR_NAME());									// 取引通貨名
		struct.setVEND_CUR_UNIT(s.getVEND_CUR_UNIT());							// 通貨単位
		struct.setVEND_DECIMAL_FIG(s.getVEND_DECIMAL_FIG());					// 小数桁数
		struct.setUNIT_COST_TYP(s.getUNIT_COST_TYP());							// 単価区分
		struct.setUNIT_COST(s.getUNIT_COST());									// 単価
		struct.setPROCESSING_COST(s.getPROCESSING_COST());						// 加工費
		struct.setMATERIAL_COST(s.getMATERIAL_COST());							// 材料費
		struct.setOTHER_OVERHEADS(s.getOTHER_OVERHEADS());						// その他経費
		struct.setPUCH_ODR_AMOUNT(s.getPUCH_ODR_AMOUNT());						// 受入金額
		struct.setDISC_AMOUNT(s.getDISC_AMOUNT());								// 値引き金額
		struct.setNET_AMOUNT(s.getNET_AMOUNT());								// 本体金額
		struct.setTAX_AMOUNT_1(s.getTAX_AMOUNT_1());							// 税額１
		struct.setTAX_AMOUNT_2(s.getTAX_AMOUNT_2());							// 税額２
		struct.setTAX_AMOUNT_3(s.getTAX_AMOUNT_3());							// 税額３
		struct.setTAX_RATE_1(s.getTAX_RATE_1());								// 税率１
		struct.setTAX_RATE_2(s.getTAX_RATE_2());								// 税率２
		struct.setTAX_RATE_3(s.getTAX_RATE_3());								// 税率３
		struct.setAMOUNT_INCLUDE_TAX(s.getAMOUNT_INCLUDE_TAX());				// 税込金額
		struct.setHOME_CUR_AMOUNT(s.getHOME_CUR_AMOUNT());						// 邦貨金額
		struct.setEXCH_RATE(s.getEXCH_RATE());									// 為替レート
		struct.setDLV_CD(s.getDLV_CD());										// 納品書番号
		struct.setACPT_RSLT_COMMENT(s.getACPT_RSLT_COMMENT());					// 受入備考

		struct.setITEM_CD_DW(s.getITEM_CD());								// 詳細ウインドウ[品目番号]
		struct.setITEM_NAME_DW(s.getITEM_NAME());							// 詳細ウインドウ[品目名]
		struct.setJOB_ODR_CD(s.getJOB_ODR_CD());							// 製番
		struct.setDRAW_CD(s.getDRAW_CD());									// 図面番号
		struct.setSPEC(s.getSPEC());										// 企画
		struct.setUNIT_QTY_TYP_DN(s.getUNIT_QTY_TYP_DN());					// 在庫数単位区分
		struct.setUNIT_QTY_TYP(s.getUNIT_QTY_TYP());						// 在庫数単位区分
		struct.setVEND_CD(s.getVEND_CD());									// 取引先コード
		struct.setVEND_NAME(s.getVEND_NAME());								// 取引先名
		struct.setPUCH_ODR_QTY(s.getPUCH_ODR_QTY());						// 発注数
		struct.setSUM_ACPT_QTY(s.getSUM_ACPT_QTY());						// 受入累計数
		struct.setACPT_INSPC_TYP_DN(s.getACPT_INSPC_TYP_DN());				// 受入検査区分
		struct.setACPT_INSPC_TYP(s.getACPT_INSPC_TYP());					// 受入検査区分
		struct.setPUCH_ODR_SLIP_ISS_DATE(s.getPUCH_ODR_SLIP_ISS_DATE());	// 発注日
		struct.setPUCH_ODR_DLV_DATE(s.getPUCH_ODR_DLV_DATE());				// 発注納期
		struct.setCONFIRM_DLV_DATE(s.getCONFIRM_DLV_DATE());				// 取引先回答納期
		struct.setWORK_IN_PROC_CD(s.getWORK_IN_PROC_CD());					// 作業コード
		struct.setPROC_NAME(s.getPROC_NAME());								// 作業名
		struct.setPUCH_ODR_PERSON(s.getPUCH_ODR_PERSON());					// 発注担当者コード
		struct.setUSER_NAME(s.getUSER_NAME());								// ユーザ名
		struct.setPUCH_ODR_STS_TYP_DN(s.getPUCH_ODR_STS_TYP_DN());			// 発注状態区分
		struct.setPUCH_ODR_STS_TYP(s.getPUCH_ODR_STS_TYP());				// 発注状態区分
		struct.setINSPC_CMPLT_FLG_DN(s.getINSPC_CMPLT_FLG_DN());			// 検査完了フラグ
		struct.setINSPC_CMPLT_FLG(s.getINSPC_CMPLT_FLG());					// 検査完了フラグ
		struct.setSPL_ITEM_TYP_DN(s.getSPL_ITEM_TYP_DN());					// 受給品区分
		struct.setSPL_ITEM_TYP(s.getSPL_ITEM_TYP());						// 受給品区分
		struct.setPRODUCT_TYP_DN(s.getPRODUCT_TYP_DN());					// 製品区分
		struct.setPRODUCT_TYP(s.getPRODUCT_TYP());							// 製品区分
		struct.setNON_NO_ITEM_FLG_DN(s.getNON_NO_ITEM_FLG_DN());			// 備品発注フラグ
		struct.setNON_NO_ITEM_FLG(s.getNON_NO_ITEM_FLG());					// 備品発注フラグ

		struct.setPLANT_CD(s.getPLANT_CD());							// 工場コード
		struct.setCOMPANY_CD(s.getCOMPANY_CD());						// 会社コード
		struct.setTAX_CD(s.getTAX_CD());								// 税コード
		struct.setROUND_TYP(s.getROUND_TYP());							// 端数区分
		struct.setTAX_ROUND_TYP(s.getTAX_ROUND_TYP());					// 税端数区分
		struct.setPUCH_ODR_START_DATE(s.getPUCH_ODR_START_DATE());		// 発注着手日
		struct.setBUSINESS_OPR_DATE(s.getBUSINESS_OPR_DATE());			// 業務運用日
		struct.seth_DATE_FLG(s.geth_DATE_FLG());                        // 日付フラグ

		if (_lotCtrlFlg == true) {
			struct.seth_LOT_CTRL_FLG(s.geth_LOT_CTRL_FLG());             //ロット管理フラグ
			struct.seth_LOT_NUMBERING_TYP(s.geth_LOT_NUMBERING_TYP());   //ロット番号採番区分	
		} else {
			struct.seth_LOT_CTRL_FLG(null);                              //ロット管理フラグ
			struct.seth_LOT_NUMBERING_TYP(null);                         //ロット番号採番区分
		}
		struct.seth_FINAL_PROC_CD(s.geth_FINAL_PROC_CD());               //最終系列フラグ
		struct.seth_WORK_ODR_CD(s.geth_WORK_ODR_CD());                   //作業計画番号
		
		if ("1".equals(struct.getACPT_INSPC_TYP())) {
			struct.setACPT_STS_TYP("2");					// 検査完了
		} else {
			struct.setACPT_STS_TYP("1");					// 未検査
		}

		struct.setc_COMPLETE("true");						// 全受入完了

		// ｢発注金額｣の計算
		String puchOdrAmount =
			AmountCalculator.calcPuchOdrAmount(
				struct.getUNIT_COST(),
				struct.getACPT_QTY(),
				struct.getROUND_TYP(),
				struct.getVEND_DECIMAL_FIG());
		struct.setPUCH_ODR_AMOUNT(puchOdrAmount);
		// ｢本体金額｣の計算
		String netAmount =
			AmountCalculator.calcNetAmount(struct.getPUCH_ODR_AMOUNT(), struct.getDISC_AMOUNT());
		struct.setNET_AMOUNT(netAmount);
		
        //20090428 ADD START
        //内税の場合に税額を計算する
 		String lowerTaxCd =
 			struct.getTAX_CD().substring(struct.getTAX_CD().length() - 1);                
 		if (!lowerTaxCd.equals("1")) {
			//バッチパラメータ呼出
			List batList = entity.mSYS_BAT_PARM.read(conn, struct);
			if(!batList.isEmpty()){
				//税計算部品をコール
				AE0060010Struct batStruct = (AE0060010Struct)batList.get(0);
				struct.setPVC2LOGMODE(batStruct.getPVC2LOGMODE());
				struct.setPVC2OUTPUTMODE(batStruct.getPVC2OUTPUTMODE());
				struct.setPVC2OUTPUTPATH(batStruct.getPVC2OUTPUTPATH());
				struct.setPVC2OUTPUTNAME(batStruct.getPVC2OUTPUTNAME());
				struct.setPVC2USERID(this.sysUSER_CD);
				struct.setPVC2BUSINESSNAME(batStruct.getPVC2BUSINESSNAME());
				struct.setPVC2PLANTCD(this.sysPLANT_CD);
				struct.setPVC2TAXID("5");
				batList = entity.mcallSQLCALCTAXCALCAMT.call(conn, struct);
				batStruct = (AE0060010Struct)batList.get(0);
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

		struct.seth_PUCH_ODR_CD(s.getPUCH_ODR_CD());			// 発注番号（隠し項目）

		struct.setPUCH_ODR_COMMENT(s.getPUCH_ODR_COMMENT());	// 発注備考
		struct.setINSTALL_FLG(s.getINSTALL_FLG());				// システム導入フラグ
		struct.setTHIS_MONTH(s.getTHIS_MONTH());				// 当年月度
	}

	/**
	 * Structの値をセットします。
	 * @param s 検索したデータ
	 */
	private void setStructSystemData(AE0060010Struct s) {
		s.setsOraganization_CD(struct.getsOrganization_CD());
		s.setsSysdate(struct.getsSysdate());
		s.setsUser_ID(struct.getsUser_ID());
	}

	/**
	 * 画面の全項目を初期化します。
	 */
	private void initializeAll() {
		struct.setPUCH_ODR_CD(null);

		initializeDetail();
	}

	/**
	 * 画面の詳細項目を初期化します。
	 */
	private void initializeDetail() {
		struct.setACPT_NO("1");
		struct.setPUCH_ODR_MODIFY_COUNT(null);
		struct.setACPT_QTY("0");
		struct.setSTOCK_UNIT(null);
		struct.setACPT_DATE(null);
		struct.setVEND_LOT_NO(null);
		struct.setWH_CD(null);
		struct.setWH_NAME(null);
		struct.setCUR_CD(null);
		struct.setCUR_NAME(null);
		struct.setVEND_CUR_UNIT(null);
		struct.setVEND_DECIMAL_FIG("4");
		struct.setUNIT_COST_TYP("1");
		struct.setUNIT_COST("0");
		struct.setPROCESSING_COST("0");
		struct.setMATERIAL_COST("0");
		struct.setOTHER_OVERHEADS("0");
		struct.setPUCH_ODR_AMOUNT("0");
		struct.setDISC_AMOUNT("0");
		struct.setNET_AMOUNT("0");
		struct.setTAX_AMOUNT_1("0");
		struct.setTAX_AMOUNT_2("0");
		struct.setTAX_AMOUNT_3("0");
		struct.setTAX_RATE_1("0");
		struct.setTAX_RATE_2("0");
		struct.setTAX_RATE_3("0");
		struct.setAMOUNT_INCLUDE_TAX("0");
		struct.setHOME_CUR_AMOUNT("0");
		struct.setEXCH_RATE("1");
		struct.setDLV_CD(null);
		struct.setACPT_RSLT_COMMENT(null);

		struct.setITEM_CD(null);
		struct.setITEM_NAME(null);
		struct.setJOB_ODR_CD(null);
		struct.setDRAW_CD(null);
		struct.setSPEC(null);
		struct.setUNIT_QTY_TYP_DN(null);
		struct.setUNIT_QTY_TYP(Kind.NUMBER);
		struct.setVEND_CD(null);
		struct.setVEND_NAME(null);
		struct.setPUCH_ODR_QTY("0");
		struct.setSUM_ACPT_QTY("0");
		struct.setACPT_INSPC_TYP_DN(null);
		struct.setACPT_INSPC_TYP(null);
		struct.setPUCH_ODR_SLIP_ISS_DATE(null);
		struct.setPUCH_ODR_DLV_DATE(null);
		struct.setCONFIRM_DLV_DATE(null);
		struct.setWORK_IN_PROC_CD(null);
		struct.setPROC_NAME(null);
		struct.setPUCH_ODR_PERSON(null);
		struct.setUSER_NAME(null);
		struct.setPUCH_ODR_STS_TYP_DN(null);
		struct.setPUCH_ODR_STS_TYP(null);
		struct.setINSPC_CMPLT_FLG_DN(null);
		struct.setINSPC_CMPLT_FLG(null);
		struct.setSPL_ITEM_TYP_DN(null);
		struct.setSPL_ITEM_TYP(null);
		struct.setPRODUCT_TYP_DN(null);
		struct.setPRODUCT_TYP(null);
		struct.setNON_NO_ITEM_FLG_DN(null);
		struct.setNON_NO_ITEM_FLG(null);

		struct.setPLANT_CD(null);
		struct.setCOMPANY_CD(null);
		struct.setTAX_CD(null);
		struct.setROUND_TYP(Kind.FLOOR);
		struct.setTAX_ROUND_TYP(Kind.FLOOR);
		struct.setPUCH_ODR_START_DATE(null);
		struct.setBUSINESS_OPR_DATE(null);

		struct.setc_COMPLETE(null);

		struct.seth_PUCH_ODR_CD(null);

		struct.setSelectUnitCostFlag("false");

		struct.setLOT_NO(null);
		struct.seth_FINAL_PROC_CD(null);
		struct.seth_LOT_NUMBERING_TYP(null);
		struct.seth_LOT_CTRL_FLG(null);
		struct.seth_WORK_ODR_CD(null);
		// Add Start 20140113 fang-xf
		struct.seth_PUCH_ODR_CD_1(null);
		// Add End 20140113 fang-xf
		
		list = null;

		readStatus = INITIAL;
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
	 * 小数の表示スケール処理
	 * @param SuppliedUnitVal 
	 */
	public BigDecimal setDisplayscale(BigDecimal SuppliedUnitVal)
	{
		BigDecimal intVal = new BigDecimal("" + SuppliedUnitVal.intValue());
		BigDecimal decimalVal = SuppliedUnitVal.subtract(intVal).multiply(new BigDecimal(10000));
		int decVal = decimalVal.intValue();
		int roundCount = 1;
		while (true)
		{
			decVal = decVal / 10;
			if (decVal == 0) 
			{
				// ループを抜ける。
				break;
			} 
			roundCount++;
		} // END WHILE
		return SuppliedUnitVal.setScale(roundCount,BigDecimal.ROUND_UP);
	}
	/**
	 * 分母の最大公約数を求める処理
	 * @param Bigvala
	 */
	public BigDecimal getgcd(BigDecimal Bigvala,BigDecimal Bigvalb)
	{
		BigInteger gcdval = new BigInteger("0");
		gcdval = Bigvala.toBigInteger().gcd(Bigvalb.toBigInteger()); 
		return new BigDecimal(gcdval);
	}

	//支給品使用テーブルの[使用予定数量]・[支給品使用単位数分母]・[支給品使用単位数分子]の最大値 2006/05/22 up
	BigDecimal Decival = new BigDecimal("100000000000000");
	

	/**
	 * システムパラメータ取得
	 */
	private boolean getSysParameter() throws BusinessProcessException, FoundationException {
		boolean b = true;
		try {
			List sysParameterList = entity.mSELECT_SYS_PARAMETER.read(conn, struct);
			if(sysParameterList == null || sysParameterList.isEmpty()) return b;
			AE0060010Struct sysParameterStruct = (AE0060010Struct) sysParameterList.get(0);
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
	 * 実際原価管理パラメータの対象年月日取得
	 */
	private BigDecimal getProcExecDate() throws BusinessProcessException, FoundationException {
		BigDecimal bd = null;
		try {
			struct.setPLANT_CD(getsysPLANT_CD());
			List procExecDateList = entity.mSELECT_SYS_ACTUAL_COST_CTRL_AC.read(conn, struct);
			if(procExecDateList == null || procExecDateList.isEmpty()) return null;
			AE0060010Struct procExecDateStruct = (AE0060010Struct) procExecDateList.get(0);
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
	
	/**
	 * オラクルシーケンス採番
	 */
	private String getNextval(){
		try{
		    List l = entity.mSelectSEQ_JF_RSLT.read(conn, struct);
		    if(l != null && l.size() > 0){
			    return ((AE0060010Struct)l.get(0)).getNEXTVAL();
		    }
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * [支給品使用].”取引先コード”＝[保管区].“取引先コード”、[支給品使用].”工場コード”＝[保管区].“工場コード”となるMIN([保管区].”保管区コード”)
	 */
    private String getWh_cd(AE0060010Struct s){
    	try{
    	    List list = entity.mSelectWH_CD.read(conn, s);
    	    if(list != null && list.size() > 0){
    		    return ((AE0060010Struct)list.get(0)).getreadWH_CD();
    	    }
    	}catch(Exception e){
    		e.printStackTrace();
    	}
    	return null;
    }
    
    List lotNoList = new ArrayList();
    /**
     * [ロット別使用実績]の追加,[出庫実績明細]の更新
     */
    private boolean insertT_LOT_USE_RSLT(AE0060010Struct s){

    	try{
    	    String vendCd = s.getVEND_CD();                  //取引先コード
    	    String plantCd = s.getPLANT_CD();                //工場コード
    	    String issueInstCd = s.getsetISSUE_INST_CD();    //出庫指示番号
    	    String puchOdrCd = s.getsetPUCH_ODR_CD();        //発注番号
    	    String acptNo = s.getsetACPT_NO();               //受入回数
    	    String itemCd = s.getsetITEM_CD();               //品目番号
    	    String suppliedDate = s.getsetSUPPLIED_DATE();   //使用日
    	
    	    List qtyList = entity.mSelectQty.read(conn, s);
    	
    	    if(qtyList != null && qtyList.size() > 0){
    		    String supplied_issue_qty = ((AE0060010Struct)qtyList.get(0)).getreadSUPPLIED_ISSUE_QTY();  //[支給品使用].”使用予定数量”
    		    System.out.println("supplied_issue_qty="+supplied_issue_qty);
    		    if("0".equals(supplied_issue_qty)){
    		    	//return true;
    		    }
                AE0060010Struct whcdStruct = new AE0060010Struct();
                whcdStruct.setVEND_CD(vendCd);               //取引先コード
                whcdStruct.setPLANT_CD(plantCd);             //工場コード
                String wh_cdStr = getWh_cd(whcdStruct);      //保管区コード
            
                int listSize = qtyList.size();
                for(int i=0; i<listSize; i++){
            	    AE0060010Struct rStruct = (AE0060010Struct)qtyList.get(i);
                    String lot_no = rStruct.getreadLOT_NO();  //在庫ロット番号
                    String qty = rStruct.getreadQTY();        //[出庫実績明細].”出庫支払数量”－[出庫実績明細].”使用済数量”
                    
                    if(lotNoList == null){
                    	lotNoList = new ArrayList();
                    }

                    AE0060010Struct insertStruct = new AE0060010Struct();
                    insertStruct.setsetSEQ_NO(getNextval());          //オラクルシーケンス採番
                    insertStruct.setsetISSUE_INST_CD(issueInstCd);    //出庫指示番号
                    insertStruct.setsetLOT_NO(lot_no);                //在庫ロット番号
                    insertStruct.setsetPUCH_ODR_CD(puchOdrCd);        //発注番号
                    insertStruct.setsetACPT_NO(acptNo);               //受入回数
                    insertStruct.setsetITEM_CD(itemCd);               //支給品目番号
                    insertStruct.setsetWH_CD(wh_cdStr);               //保管区コード
                    insertStruct.setsetSUPPLIED_DATE(suppliedDate);   //使用日
                    insertStruct.setsUser_ID(getsysUSER_CD());        //ユーザコード

                    //最後レコード
                    if(i == (listSize-1)){
                    	
                    	if(Calculate.compare(supplied_issue_qty, qty) == 1){
                    		//支給品のロット使用数が出庫支払数量を超えています。支給品目番号{0},在庫ロット番号{0}
                    		setWarningMessage("AE20610", itemCd, lot_no);
                    		setWarningParameter("T_PART_SUPPLIED_ISSUE", "ITEM_CD", itemCd);
                    		setWarningParameter("T_LOT_ISSUE_INST", "LOT_NO", lot_no);
                    	}
                        lotNoList.add(lot_no);                                      //在庫ロット番号
                        lotNoList.add(supplied_issue_qty);                          //使用済数量
                	    insertStruct.setsetTOTAL_ISSUE_QTY(supplied_issue_qty);     //使用済数量
                        insertStruct.setsetSUPPLIED_ISSUE_QTY(supplied_issue_qty);  //使用予定数量
                        entity.minsertT_LOT_USE_RSLT.create(conn, insertStruct);    //[ロット別使用実績]の追加

                        AE0060010Struct updateStruct = new AE0060010Struct();
                        updateStruct.setsetSPENT_QTY(supplied_issue_qty);           //使用済数量
                        updateStruct.setISSUE_INST_CD(issueInstCd);                 //出庫指示番号
                        updateStruct.setLOT_NO(lot_no);                             //在庫ロット番号
                        updateStruct.setITEM_CD(itemCd);                            //出庫品目番号
                        updateStruct.setPUCH_ODR_CD(puchOdrCd);                     //発注番号
                        updateStruct.setsUser_ID(getsysUSER_CD());                  //ユーザコード
                        entity.mupdateT_LOT_ISSUE_INST.update(conn, updateStruct);  //[出庫実績明細]の更新
                        break;
                    }
                    System.out.println("qty="+qty);

                    if("0".equals(qty)){
                    	continue;
                    }
                    //[支給品使用].”使用予定数量”>[出庫実績明細].”出庫支払数量”－[出庫実績明細].”使用済数量”
                    if(Calculate.compare(supplied_issue_qty, qty) == 1){
                    	//[支給品使用].”使用予定数量” － １件目で更新した数量
                        supplied_issue_qty = Calculate.subtract(supplied_issue_qty, qty);
                        lotNoList.add(lot_no);
                        lotNoList.add(qty);
                        insertStruct.setsetTOTAL_ISSUE_QTY(qty);                   //使用済数量
                        insertStruct.setsetSUPPLIED_ISSUE_QTY(qty);                //使用予定数量
                        entity.minsertT_LOT_USE_RSLT.create(conn, insertStruct);   //[ロット別使用実績]の追加

                        AE0060010Struct updateStruct = new AE0060010Struct();
                        updateStruct.setsetSPENT_QTY(qty);                         //使用済数量
                        updateStruct.setISSUE_INST_CD(issueInstCd);                //出庫指示番号
                        updateStruct.setLOT_NO(lot_no);                            //在庫ロット番号
                        updateStruct.setITEM_CD(itemCd);                           //出庫品目番号
                        updateStruct.setPUCH_ODR_CD(puchOdrCd);                    //発注番号
                        updateStruct.setsUser_ID(getsysUSER_CD());                 //ユーザコード
                        entity.mupdateT_LOT_ISSUE_INST.update(conn, updateStruct); //[出庫実績明細]の更新

                    }else{
                    	//[出庫実績明細].”出庫支払数量” － [出庫実績明細].”使用済数量” ≧ [支給品使用].”使用予定数量”
                    	//の場合は [支給品使用].”使用予定数量”をセットする
                    	lotNoList.add(lot_no);
                        lotNoList.add(supplied_issue_qty);
                        insertStruct.setsetTOTAL_ISSUE_QTY(supplied_issue_qty);    //使用済数量
                        insertStruct.setsetSUPPLIED_ISSUE_QTY(supplied_issue_qty); //使用予定数量
                        entity.minsertT_LOT_USE_RSLT.create(conn, insertStruct);   //[ロット別使用実績]の追加

                        AE0060010Struct updateStruct = new AE0060010Struct();
                        updateStruct.setsetSPENT_QTY(supplied_issue_qty);          //使用済数量
                        updateStruct.setISSUE_INST_CD(issueInstCd);                //出庫指示番号
                        updateStruct.setLOT_NO(lot_no);                            //在庫ロット番号
                        updateStruct.setITEM_CD(itemCd);                           //出庫品目番号
                        updateStruct.setPUCH_ODR_CD(puchOdrCd);                    //発注番号
                        updateStruct.setsUser_ID(getsysUSER_CD());                 //ユーザコード
                        entity.mupdateT_LOT_ISSUE_INST.update(conn, updateStruct); //[出庫実績明細]の更新
                        break;
                    }
                }
    	    }else{
    	    	//支給品目に対する出庫実績明細またはロット管理マスタが存在しません
                setErrorMessage("AE20609");
                return false;
            }
        }catch(Exception e){
        	e.printStackTrace();
        	//支給品目に対する出庫実績明細またはロット管理マスタが存在しません
        	setErrorMessage("AE20609");
            return false;
        }
        return true;
    }

    /**
     * ルーピングチェック。逆展開を行い同品目番号が存在 有無
     * @param repository 製品構成リポジトリ
     * @param checkItem 対象品目番号
     * @param item 比較する品目番号
     * @return true:有  false:無
    */
    private boolean checkReverseRooping(ProductStructureRepository repository, 
                   String targetItem, String item)
         throws SQLException
    {
        // 親品目番号一覧取得
        ArrayList itemList = repository.reverseDeployment(item);
        checkItemList(itemList);

        for(int i = 0; i < itemList.size(); i++){
            if(targetItem.equals((String)itemList.get(i)) == false){
                // 親品目番号一覧から更に上の親品目取得
                boolean result = checkReverseRooping(repository, 
                                       targetItem, (String)itemList.get(i));
                if(result == true){
                    return true;
                }
            }else{
                return true;
            }
        }
        return false;
    }
    
    /** 重複チェック
     * @param itemList 重複チェックする品目リスト
    */
    private void checkItemList(ArrayList itemList){
        List workList = new ArrayList(0);
        for(int i = 0; i < itemList.size(); i++){
            boolean result =true;
            String item_cd = (String)itemList.get(i);
            for(int t = 0; t < workList.size(); t++){
                if(item_cd.equals((String)workList.get(t)) == true){
                    result = false;
                }
            }
            if(result == true){
                workList.add(item_cd);
            }
        }

        itemList.clear();
        for(int i = 0; i < workList.size(); i++){
            itemList.add(workList.get(i));
        }
    }
    private double getDoubleValue(String numString){
    	if(numString == null || "".equals(numString.trim())){
    		return 0.0;
    	}
    	BigDecimal bd = new BigDecimal(0);
    	bd = new BigDecimal(numString);
    	return bd.doubleValue();
    }

    /** 検査待ち保管区をセット
     * @param formStruct 検索情報パラメータ
    */
    private void setInspcWhStruct(AE0060010Struct whStruct) throws SQLException, FoundationException {
        AE0060010Struct readStruct = new AE0060010Struct();
		readStruct.setPLANT_CD(whStruct.getPLANT_CD());
		List inspcWhList = entity.mselectM_WH.read(conn, readStruct);
		
		// [保管区]."工場コード"=[発注残]."工場コード"かつ[保管区]."倉庫区分"=40(検査待ち保管区)
		// に該当するデータが存在しない場合
		if (inspcWhList.isEmpty()) {
			// 検査待ち保管区が存在しません。
			setErrorMessage("AE00163");
			return;
		} else {
			AE0060010Struct inspcWhStruct = (AE0060010Struct)inspcWhList.get(0);
			
			whStruct.setINSPC_WH_CD(inspcWhStruct.getINSPC_WH_CD());
			whStruct.setINSPC_WH_NAME(inspcWhStruct.getINSPC_WH_NAME());
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
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0060");
		logger.entering("AE0060010Control"+":USER="+struct.getsUser_ID(),"controlSelect");
			//{{user_implement_dev:<controlSelect>
		try {
			// キー以外の項目を初期化
			initializeDetail();

			// 受入実績存在チェック
			List acptList = entity.mT_ACPT_RSLT.read(conn, struct);
			// 受入実績の件数により、読み込み先を変える。
			List formList = null;
			if (acptList.isEmpty()) {
				formList = entity.mFormFirst.read(conn, struct);
			} else {
				formList = entity.mFormAfter.read(conn, struct);
			}

			// ｢発注番号｣に入力された値が、[発注残]に存在していない。
			if (formList.isEmpty()) {
				setErrorMessage("ZZ06001");
				setErrorParameter("T_RLSD_PUCH_ODR", "PUCH_ODR_CD", struct.getPUCH_ODR_CD());
				return;
			}

			// データを取得
			AE0060010Struct formStruct = (AE0060010Struct) formList.get(0);
			
			formStruct.setACPT_INSPC_TYP_DN(multcombo("ACPT_INSPC_TYP",formStruct.getACPT_INSPC_TYP()));
			formStruct.setPUCH_ODR_STS_TYP_DN(multcombo("PUCH_ODR_STS_TYP",formStruct.getPUCH_ODR_STS_TYP()));
			formStruct.setINSPC_CMPLT_FLG_DN(multcombo("INSPC_CMPLT_FLG",formStruct.getINSPC_CMPLT_FLG()));
			formStruct.setSPL_ITEM_TYP_DN(multcombo("SPL_ITEM_TYP",formStruct.getSPL_ITEM_TYP()));
			formStruct.setPRODUCT_TYP_DN(multcombo("PRODUCT_TYP",formStruct.getPRODUCT_TYP()));
			formStruct.setNON_NO_ITEM_FLG_DN(multcombo("NON_NO_ITEM_FLG",formStruct.getNON_NO_ITEM_FLG()));
			formStruct.setUNIT_QTY_TYP_DN(multcombo("UNIT_QTY_TYP",formStruct.getUNIT_QTY_TYP()));

			// ログインユーザの｢工場コード｣ != [発注残]."工場コード"の場合
			if (!sysPLANT_CD.equals(formStruct.getPLANT_CD())) {
				setErrorMessage("AE05002");
				setErrorParameter("T_RLSD_PUCH_ODR", "PUCH_ODR_CD", struct.getPUCH_ODR_CD());
				setErrorParameter("T_RLSD_PUCH_ODR", "PLANT_CD", formStruct.getPLANT_CD());
				return;
			}
			// [発注残]."発注状態区分" = 1:未指示の場合
			if ("1".equals(formStruct.getPUCH_ODR_STS_TYP())) {
				setErrorMessage("AE30803");
				setErrorParameter("T_RLSD_PUCH_ODR", "PUCH_ODR_CD", struct.getPUCH_ODR_CD());
				return;
			}
			// [発注残]."税コード"で、[消費税区分]を検索し、存在しなかった場合
			if (formStruct.getTAX_CD() == null || formStruct.getTAX_CD().length() <= 0) {
				try {
					TaxStruct ts =
						TaxControl.getData(
							conn,
							_myCompanyStruct.getCOMPANY_CD(),
							formStruct.getVEND_CD(),
							formStruct.getITEM_CD(),
							formStruct.getPUCH_ODR_START_DATE());

					formStruct.setTAX_CD(ts.getTAX_CD());
					formStruct.setTAX_ROUND_TYP(ts.getTAX_ROUND_TYP());
				} catch (DataNotFoundException e) {
					setErrorMessage("AE05003");
					setErrorParameter("T_RLSD_PUCH_ODR", "VEND_CD", formStruct.getVEND_CD());
					setErrorParameter("T_RLSD_PUCH_ODR", "ITEM_CD", formStruct.getITEM_CD());
					setErrorParameter(
						"T_RLSD_PUCH_ODR",
						"PUCH_ODR_START_DATE",
						formStruct.getPUCH_ODR_START_DATE());
					return;
				}
			}
			List taxList = entity.mM_TAX.read(conn, formStruct);
			if (taxList.isEmpty()) {
				setErrorMessage("AE05003");
				setErrorParameter("T_RLSD_PUCH_ODR", "TAX_CD", formStruct.getTAX_CD());
				return;
			}
			
			if ("2".equals(formStruct.getSPL_ITEM_TYP()) == false) {
				// 買掛管理がインストールされている場合、当年月度を取得
				AE0060010Struct readStruct = new AE0060010Struct();
				List installOptionsList = entity.mSYS_INSTALL_OPTIONS.read(conn, readStruct);
				if (installOptionsList.size() > 0) {
					AE0060010Struct installOptionsStruct = (AE0060010Struct)installOptionsList.get(0);
					formStruct.setINSTALL_FLG(installOptionsStruct.getINSTALL_FLG());
				} else {
					formStruct.setINSTALL_FLG("0");
				}
				
				// 買掛管理がインストールされている場合、当年月度を取得
				if ("1".equals(formStruct.getINSTALL_FLG())) {
					List debtCtrlList = entity.mSYS_DEBT_CTRL.read(conn, readStruct);
					if (debtCtrlList.size() > 0) {
						AE0060010Struct debtCtrlStruct = (AE0060010Struct)debtCtrlList.get(0);
						formStruct.setTHIS_MONTH(debtCtrlStruct.getTHIS_MONTH());
					} else {
						// 買掛システム管理の当年月度が設定されていません。
						setErrorMessage("AE00145");
						return;
					}
				}
			}
			
			// [発注残]."発注状態区分" = 9:受入完了の場合
			if ("9".equals(formStruct.getPUCH_ODR_STS_TYP())) {
				if ("0".equals(formStruct.getODR_CANCEL_SLIP_ISS_FLG())) {
					// [発注残]."取消伝票発行フラグ" = 0:対象外の場合
					setWarningMessage("AE05005");
				} else if ("1".equals(formStruct.getODR_CANCEL_SLIP_ISS_FLG())) {
					// [発注残]."取消伝票発行フラグ" = 1:未発行の場合
					setWarningMessage("AE00086");
				} else if ("2".equals(formStruct.getODR_CANCEL_SLIP_ISS_FLG())) {
					// [発注残]."取消伝票発行フラグ" = 2:発行済の場合
					setWarningMessage("AE00087");
				}
				setWarningParameter("T_RLSD_PUCH_ODR", "PUCH_ODR_CD", formStruct.getPUCH_ODR_CD());
				setWarningParameter("T_RLSD_PUCH_ODR", "ODR_CANCEL_SLIP_ISS_FLG", formStruct.getODR_CANCEL_SLIP_ISS_FLG());
			}
			
			// [発注残]."発注時受入検査区分"が2:受入と検査を行なう の場合
			if ("2".equals(formStruct.getACPT_INSPC_TYP())) {
				setInspcWhStruct(formStruct);
			} else {
				// [発注残]."発注時受入検査区分"が1:受入のみ の場合
				formStruct.setINSPC_WH_CD(null);
				formStruct.setINSPC_WH_NAME(null);
			}

			formStruct.seth_ACPT_QTY(formStruct.getACPT_QTY());
			// Add Start 20140113 fang-xf
			struct.seth_PUCH_ODR_CD_1(struct.getPUCH_ODR_CD());
			// Add End 20140113 fang-xf

			// 画面に表示
			setStruct(formStruct);

			readStatus = NORMAL;

			struct.setSelectUnitCostFlag("true");
		} catch (SQLException e) {
			throw new ExpjException(e);
		}

                //}}user_implement_dev:<controlSelect>
		logger.exiting("AE0060010Control"+":USER="+struct.getsUser_ID(),"controlSelect");

		return;
	}

	/**
	 * 単価読込ボタン押下時に実行される処理です。
	 *
	 */
	public void controlSelectUnitCost() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0060");
		logger.entering("AE0060010Control"+":USER="+struct.getsUser_ID(),"controlSelectUnitCost");
			//{{user_implement_dev:<controlSelectUnitCost>
		try {

			UnitCostStruct ucs;

			// 取引先、購入単価、通貨、消費税を取得
			try {
				ucs =
					UnitCostControl.getData(
						conn,
						_myCompanyStruct.getCOMPANY_CD(),
						struct.getVEND_CD(),
						struct.getPLANT_CD(),
						struct.getITEM_CD(),
						struct.getWORK_IN_PROC_CD(),
						struct.getACPT_DATE(),
						struct.getACPT_DATE(),
						// Mod Start 20131216 fang-xf
						//struct.getACPT_QTY());
						struct.getACPT_QTY(),
						struct.geth_PUCH_ODR_CD_1());// 発注番号
						// Mod End 20131216 fang-xf

				struct.setTAX_CD(ucs.getTAX_CD());
				struct.setUNIT_COST_TYP(ucs.getUNIT_COST_TYP());
				struct.setUNIT_COST(ucs.getUNIT_COST());
				struct.setPROCESSING_COST(ucs.getPROCESSING_COST());
				struct.setMATERIAL_COST(ucs.getMATERIAL_COST());
				struct.setOTHER_OVERHEADS(ucs.getOTHER_OVERHEADS());
				struct.setPUCH_ODR_AMOUNT(ucs.getPUCH_ODR_AMOUNT());
				struct.setTAX_RATE_1(ucs.getTAX_RATE_1());
				struct.setTAX_RATE_2(ucs.getTAX_RATE_2());
				struct.setTAX_RATE_3(ucs.getTAX_RATE_3());
				struct.setNET_AMOUNT(ucs.getNET_AMOUNT());
				struct.setDISC_AMOUNT(ucs.getDISC_AMOUNT());
				struct.setTAX_ROUND_TYP(ucs.getTAX_ROUND_TYP());
				struct.setROUND_TYP(ucs.getROUND_TYP());
				struct.setCUR_CD(ucs.getCUR_CD());
				struct.setCUR_NAME(ucs.getCUR_NAME());
				struct.setVEND_CUR_UNIT(ucs.getCUR_UNIT());
				struct.setVEND_DECIMAL_FIG(ucs.getDECIMAL_FIG());
				
				//20090428 ADD START
                //内税の場合に税額を計算する
        		String lowerTaxCd =
        			struct.getTAX_CD().substring(struct.getTAX_CD().length() - 1);
	       		if (!lowerTaxCd.equals("1")) {
	       			//バッチパラメータ呼出
	       			List batList = entity.mSYS_BAT_PARM.read(conn, struct);
	       			if(!batList.isEmpty()){
	       				//税計算部品をコール
	       				AE0060010Struct batStruct = (AE0060010Struct)batList.get(0);
	       				struct.setPVC2LOGMODE(batStruct.getPVC2LOGMODE());
	       				struct.setPVC2OUTPUTMODE(batStruct.getPVC2OUTPUTMODE());
	       				struct.setPVC2OUTPUTPATH(batStruct.getPVC2OUTPUTPATH());
	       				struct.setPVC2OUTPUTNAME(batStruct.getPVC2OUTPUTNAME());
	       				struct.setPVC2USERID(this.sysUSER_CD);
	       				struct.setPVC2BUSINESSNAME(batStruct.getPVC2BUSINESSNAME());
	       				struct.setPVC2PLANTCD(this.sysPLANT_CD);
	       				struct.setPVC2TAXID("5");
	       				batList = entity.mcallSQLCALCTAXCALCAMT.call(conn, struct);
	       				batStruct = (AE0060010Struct)batList.get(0);
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
      				struct.setTAX_AMOUNT_1(ucs.getTAX_AMOUNT_1());
    				struct.setTAX_AMOUNT_2(ucs.getTAX_AMOUNT_2());
    				struct.setTAX_AMOUNT_3(ucs.getTAX_AMOUNT_3());
    				struct.setAMOUNT_INCLUDE_TAX(ucs.getAMOUNT_INCLUDE_TAX());
            	  }
	       		 //20090428 ADD END
			} catch (DataNotFoundException e) {
				setErrorMessage("AE00060", e.getMessage());
				setErrorParameter("T_ACPT_RSLT", "VEND_CD", struct.getVEND_CD());
				setErrorParameter("T_ACPT_RSLT", "PLANT_CD", struct.getPLANT_CD());
				setErrorParameter("T_ACPT_RSLT", "ITEM_CD", struct.getITEM_CD());
				setErrorParameter("T_ACPT_RSLT", "WORK_IN_PROC_CD", struct.getWORK_IN_PROC_CD());
				setErrorParameter("T_ACPT_RSLT", "ACPT_DATE", struct.getACPT_DATE());
				setErrorParameter("T_ACPT_RSLT", "ACPT_QTY", struct.getACPT_QTY());
				return;
			}

			// 為替レートが存在しない場合はワーニング扱いとするため別に取得
			try {
				ExchRateStruct ers =
					ExchRateControl.getData(
						conn,
						_myCompanyStruct.getCOMPANY_CD(),
						ucs.getCUR_CD(),
						ucs.getEXCH_TYP(),
						null,
						struct.getACPT_DATE());
				// ｢為替レート｣を設定
				struct.setEXCH_RATE(ers.getEXCH_RATE());
				// ｢邦貨金額｣の計算
				String homeCurAmount =
					AmountCalculator.calcHomeCurAmount(
						ucs.getAMOUNT_INCLUDE_TAX(),
						ers.getEXCH_RATE(),
						ucs.getROUND_TYP(),
						_homeCurStruct.getDECIMAL_FIG());

				struct.setHOME_CUR_AMOUNT(homeCurAmount);

			} catch (DataNotFoundException e) {

				struct.setHOME_CUR_AMOUNT("0");
				struct.setEXCH_RATE("0");
				setWarningMessage("AE00061");
				setWarningParameter("T_ACPT_RSLT", "VEND_CD", struct.getVEND_CD());
				setWarningParameter("T_ACPT_RSLT", "PLANT_CD", struct.getPLANT_CD());
				setWarningParameter("T_ACPT_RSLT", "ITEM_CD", struct.getITEM_CD());
				setWarningParameter("T_ACPT_RSLT", "WORK_IN_PROC_CD", struct.getWORK_IN_PROC_CD());
				setWarningParameter("T_ACPT_RSLT", "ACPT_DATE", struct.getACPT_DATE());
				setWarningParameter("T_ACPT_RSLT", "ACPT_QTY", struct.getACPT_QTY());
			}
			struct.setSelectUnitCostFlag("true");
		} catch (SQLException e) {
			throw new ExpjException(e);
		}

                //}}user_implement_dev:<controlSelectUnitCost>
		logger.exiting("AE0060010Control"+":USER="+struct.getsUser_ID(),"controlSelectUnitCost");

		return;
	}

	/**
	 * 登録ボタン押下時に実行される処理です。
	 *
	 */
	public void controlInsert() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0060");
		logger.entering("AE0060010Control"+":USER="+struct.getsUser_ID(),"controlInsert");
			//{{user_implement_dev:<controlInsert>
		String itemCdBak = struct.getITEM_CD();
		String itemQty = struct.getACPT_QTY();
		double acptQty = Double.parseDouble(itemQty);
		try {
			// 生産側の過去の実績入力の制限チェック
			if(getSysParameter() == false){
				if(chkProcExecDate("1","",struct.getACPT_DATE()) == false){
					setErrorMessage(ProcExecDateError);
					setErrorParameter("SYS_ACTUAL_COST_CTRL_AC", "PLANT_CD", struct.getPLANT_CD());
					setErrorParameter("SYS_ACTUAL_COST_CTRL_AC", "PROC_EXEC_DATE", struct.getPROC_EXEC_DATE().toString());
					return;
				}
			}
			
			// [発注残]に存在しない場合
			List lockedList = entity.mT_RLSD_PUCH_ODR_Lock.read(conn, struct);
			if (lockedList.isEmpty()) {
				setErrorMessage("ZZ01105");
				setErrorParameter("T_RLSD_PUCH_ODR", "PUCH_ODR_CD", struct.getPUCH_ODR_CD());
				return;
			}


			AE0060010Struct lockedStruct = (AE0060010Struct) lockedList.get(0);
			// [発注残]."更新数" != ｢更新数｣(hidden使用)の場合
			if (!lockedStruct
				.getPUCH_ODR_MODIFY_COUNT()
				.equals(struct.getPUCH_ODR_MODIFY_COUNT())) {
				setErrorMessage("ZZ01105");
				setErrorParameter("T_RLSD_PUCH_ODR", "PUCH_ODR_CD", struct.getPUCH_ODR_CD());
				return;
			}
			
			// ｢発注番号｣ + ｢受入回数｣が[受入実績]にすでに存在する場合
			if (entity.mT_ACPT_RSLT.check(conn, struct)) {
				setErrorMessage("ZZ01102");
				setErrorParameter("T_ACPT_RSLT", "PUCH_ODR_CD", struct.getPUCH_ODR_CD());
				setErrorParameter("T_ACPT_RSLT", "ACPT_NO", struct.getACPT_NO());
				return;
			}

			/*
			AE0060010Struct lockedStruct = (AE0060010Struct) lockedList.get(0);
			// [発注残]."更新数" != ｢更新数｣(hidden使用)の場合
			if (!lockedStruct
				.getPUCH_ODR_MODIFY_COUNT()
				.equals(struct.getPUCH_ODR_MODIFY_COUNT())) {
				setErrorMessage("ZZ01105");
				setErrorParameter("T_RLSD_PUCH_ODR", "PUCH_ODR_CD", struct.getPUCH_ODR_CD());
				return;
			}*/

			// ｢受入場所｣が、[保管区]に存在しない場合
			List whList = entity.mM_WH.read(conn, struct);
			if (whList.isEmpty()) {
				setErrorMessage("AE00018");
				setErrorParameter("M_WH", "WH_CD", struct.getWH_CD());
			} else {
				// [保管区]."工場コード" != ｢工場コード｣の場合
				AE0060010Struct whStruct = (AE0060010Struct) whList.get(0);
				if (!sysPLANT_CD.equals(whStruct.getPLANT_CD())) {
					setErrorMessage("AE00032");
					setErrorParameter("M_WH", "WH_CD", struct.getWH_CD());
					setErrorParameter("M_WH", "PLANT_CD", whStruct.getPLANT_CD());
				}
			}

			//登録ボタンチェック
			// [出庫指示]データを取得する。
			List issueList = entity.mT_ISSUE_INST.read(conn, struct);
			// [出庫指示]に未存在の場合。
			if (issueList.isEmpty()) 
			{
			} else {
				// ループチェック
				for (int i = 0; i < issueList.size(); i++ ) 
				{
					AE0060010Struct issueStruct = (AE0060010Struct) issueList.get(i);
					// [出庫指示]."取引先"=[保管区マスタ]."保管区コード"の存在チェック
					struct.setsetVEND_CD(issueStruct.getreadVEND_CD());
					struct.setsetPLANT_CD(issueStruct.getreadPLANT_CD());
					List m_whList = entity.mreadM_WH.read(conn, struct);
					// 支給先と一致する取引先保管が存在しない場合
					if (m_whList.isEmpty()) 
					{
						// AE00068:支給先と一致する取引先保管区が存在しません。保管区コードの登録が必要です。
						setErrorMessage("AE00068");
						setErrorParameter("T_ISSUE_INST", "VEND_CD", issueStruct.getreadVEND_CD());
						setErrorParameter("T_ISSUE_INST", "PLANT_CD", issueStruct.getreadPLANT_CD());
						// 処理を抜ける。
						return;
					}
				} // FOR END
			}
			//ロット管理導入済
			if (_lotCtrlFlg == true ) {
				//注文がOff、ロット管理を行う、
				if (!"true".equals(struct.getc_CANCEL()) && "1".equals(struct.geth_LOT_CTRL_FLG())) {
					//在庫ロットがNull以外、
					if (!"".equals(struct.getLOT_NO()) && struct.getLOT_NO() != null) {
						if (!entity.mcheckLOT_NO.check(conn, struct)) {
							//[ロット管理]に存在しない場合
							setErrorMessage("AE20603");
							setErrorParameter("T_LOT_CTRL", "LOT_NO", struct.getLOT_NO());
							return;
						}
					} else if (!"1".equals(struct.getNON_NO_ITEM_FLG()) 
							&& !"0".equals(struct.geth_LOT_NUMBERING_TYP())
							&& !(struct.geth_WORK_ODR_CD() != null && !"".equals(struct.geth_WORK_ODR_CD())
							&& "0".equals(struct.geth_FINAL_PROC_CD()))
							&& acptQty > 0){
						//在庫ロット番号の自動採番を行う。
                        String itemCdStr = struct.getITEM_CD();              //品目番号
		                String acptDateStr = struct.getACPT_DATE();          //受入日
						BizCommon bc = new BizCommon(conn, getsysUSER_CD(), sp.getProcId(), getsysPLANT_CD());
						//ロット採番共通部品
						List resultList = bc.getsetLotNumberingFd(itemCdStr, acptDateStr);
						//結果ステータスが正常終了
			            if(bc.getResultStatus().intValue() == 1){
			                if(resultList != null && resultList.size() > 0){
			        	        String result1 = (String)resultList.get(0);
			        	        struct.setLOT_NO(result1);                   //ロット番号
			                }
			            }else{
			            	//結果ステータスが正常終了以外
			                if(resultList != null && resultList.size() > 1){
			                	//引数のエラーコードでエラーメッセージを表示し
			        	        String result2 = (String)resultList.get(1);
			        	        setErrorMessage(result2);
			        	        struct.setLOT_NO(null);
			        	        return;
			                }
			            }
					}
				} else {
					struct.setLOT_NO(null);
				}
			}
			
			
			String lotNumberingTypBak = struct.geth_LOT_NUMBERING_TYP();
			String lotControlFlgBak = struct.geth_LOT_CTRL_FLG();
			String finalProcFlgBak = struct.geth_FINAL_PROC_CD();
			String vendlotno_bak = struct.getLOT_NO();
			//String puch_odr_cd_bak = struct.getPUCH_ODR_CD();
			// エラーがあったら処理を中断
			if (msgStruct.hasError()) {
				return;
			}

			// JavaScriptの計算では、丸め誤差が発生している可能性があるため再計算
			// ｢発注金額｣の計算
			String puchOdrAmount =
				AmountCalculator.calcPuchOdrAmount(
					struct.getACPT_QTY(),
					struct.getUNIT_COST(),
					struct.getROUND_TYP(),
					struct.getVEND_DECIMAL_FIG());
			struct.setPUCH_ODR_AMOUNT(puchOdrAmount);
            if(!com.nec.jp.orteus.expj.util.Calculate.isNotInNumRange(puchOdrAmount)){
                // 多言語項目取得セット
               String ErrInfo = CoreTools.getRBString("Expj.PUCH_ODR_AMOUNT_1", resource);
               setErrorMessage("AA00215",ErrInfo);
           	   return;
            }
			// ｢値引金額｣の計算
			String discAmount =
				AmountCalculator.calcDiscAmount(
					struct.getPUCH_ODR_AMOUNT(),
					struct.getNET_AMOUNT());
			struct.setDISC_AMOUNT(discAmount);
			
			// Add Start 20131227 fang-xf
			TaxStruct ts =
				TaxControl.getDataTax(
					conn,
					_myCompanyStruct.getCOMPANY_CD(),
					struct.getVEND_CD(),
					struct.getITEM_CD(),
					struct.getACPT_DATE(),
					struct.getTAX_CD());
			// 税率１
			struct.setTAX_RATE_1(ts.getTAX_RATE_1());
			// 税率２
			struct.setTAX_RATE_2(ts.getTAX_RATE_2());
			// 税率３
			struct.setTAX_RATE_3(ts.getTAX_RATE_3());
			// 税端数処理区分
			struct.setTAX_ROUND_TYP(ts.getTAX_ROUND_TYP());
			// Add End 20131227 fang-xf
			
	        //20090428 ADD START
	        //内税の場合に税額を計算する
	 		String lowerTaxCd =
	 			struct.getTAX_CD().substring(struct.getTAX_CD().length() - 1);                
	 		if (!lowerTaxCd.equals("1")) {
				//バッチパラメータ呼出
				List batList = entity.mSYS_BAT_PARM.read(conn, struct);
				if(!batList.isEmpty()){
					//税計算部品をコール
					AE0060010Struct batStruct = (AE0060010Struct)batList.get(0);
					struct.setPVC2LOGMODE(batStruct.getPVC2LOGMODE());
					struct.setPVC2OUTPUTMODE(batStruct.getPVC2OUTPUTMODE());
					struct.setPVC2OUTPUTPATH(batStruct.getPVC2OUTPUTPATH());
					struct.setPVC2OUTPUTNAME(batStruct.getPVC2OUTPUTNAME());
					struct.setPVC2USERID(this.sysUSER_CD);
					struct.setPVC2BUSINESSNAME(batStruct.getPVC2BUSINESSNAME());
					struct.setPVC2PLANTCD(this.sysPLANT_CD);
					struct.setPVC2TAXID("5");
					batList = entity.mcallSQLCALCTAXCALCAMT.call(conn, struct);
					batStruct = (AE0060010Struct)batList.get(0);
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
                if(!com.nec.jp.orteus.expj.util.Calculate.isNotInNumRange(amountIncludeTax)){
                    // 多言語項目取得セット
                   String ErrInfo = CoreTools.getRBString("Expj.AMOUNT_INCLUDE_TAX", resource);
               	   setErrorMessage("AA00215",ErrInfo);
               	   return;
                }
	     	}
	 		//20090428 ADD END
			// ｢邦貨金額｣の計算
			String homeCurAmount =
				AmountCalculator.calcHomeCurAmount(
					struct.getAMOUNT_INCLUDE_TAX(),
					struct.getEXCH_RATE(),
					struct.getROUND_TYP(),
					_homeCurStruct.getDECIMAL_FIG());
			struct.setHOME_CUR_AMOUNT(homeCurAmount);
            if(!com.nec.jp.orteus.expj.util.Calculate.isNotInNumRange(homeCurAmount)){
                // 多言語項目取得セット
               String ErrInfo = CoreTools.getRBString("Expj.HOME_CUR_AMOUNT", resource);
          	   setErrorMessage("AA00215",ErrInfo);
          	   return;
           }
			//　[発注残]."受入検査区分"が2:受入後に検査を行うかつ受入数量=0かつ"検査完了フラグ"=1　2009/07/14
			if("2".equals(struct.getACPT_INSPC_TYP()) &&
			   Calculate.compare(struct.getACPT_QTY(), "0") ==0 &&
			   "1".equals(_inspcvalue)){
				struct.setACPT_STS_TYP("2");
			}
						
			// [発注残]."発注時受入検査区分"が1:受入のみ の場合
			if ("1".equals(struct.getACPT_INSPC_TYP())) {
				struct.setINSPC_WH_CD(null);
			}

			//注文取消がONの場合かつ、[発注残]."受入検査区分"が2:受入後に検査を行うの場合、受入状態区分を2:検査完了にセット 2006/05/22 up
			if(("2".equals(struct.getACPT_INSPC_TYP())) && "true".equals(struct.getc_CANCEL())){
				struct.setACPT_STS_TYP("2");
			}
			// [発注残]."備品発注フラグ"が0:備品以外（通常仕入品）だった場合
			if (struct.getNON_NO_ITEM_FLG().equals("0")) {
				struct.setITEM_NAME(null);
			}
			// [発注残]."発注時受入検査区分"が1:受入のみ だった場合
			if (struct.getACPT_INSPC_TYP().equals("1")) {
				struct.setINSPC_WH_CD(null);
			}
			// [受入実績]を登録
			entity.mT_ACPT_RSLT.create(conn, struct);

			// [発注残]."受入検査区分"が1:受入のみの場合または"受入検査区分"が2:受入後に検査を行うかつ注文取消がONの場合の場合2006/04/14up
			if ("1".equals(struct.getACPT_INSPC_TYP())
				||  ("2".equals(struct.getACPT_INSPC_TYP())) && "true".equals(struct.getc_CANCEL())) {
				// [検査実績]を登録
				entity.mT_INSPC_RSLT.create(conn, struct);
			}

			// 全受入完了の場合
			if ("true".equals(struct.getc_COMPLETE())) {
				List aList = entity.mT_RLSD_PUCH_ODRForComplete.read(conn, struct);
				AE0060010Struct aStruct = (AE0060010Struct) aList.get(0);
				setStructSystemData(aStruct);
				
				// 注文取消がONの場合、取消伝票発行フラグ=1:未発効
				// 注文取消がOFFの場合、取消伝票発行フラグ=0:対象外
				if ("true".equals(struct.getc_CANCEL())) {
					aStruct.setODR_CANCEL_SLIP_ISS_FLG("1");
					//[発注残]."受入検査区分"が2:受入後に検査を行うの場合、
					//[発注残]."検査完了フラグ",[発注残]."検査完了日"に[画面]."受入日"をセットする 2006/04/14up
					if ("2".equals(struct.getACPT_INSPC_TYP())){
						aStruct.setINSPC_CMPLT_DATE(struct.getACPT_DATE());
						aStruct.setINSPC_CMPLT_FLG("1");
					}
				} else {
					aStruct.setODR_CANCEL_SLIP_ISS_FLG("0");
				}
				
				//　[発注残]."受入検査区分"が2:受入後に検査を行うかつ受入数量=0かつ"検査完了フラグ"=1　2009/07/14
				if("2".equals(struct.getACPT_INSPC_TYP()) &&
						   Calculate.compare(struct.getACPT_QTY(), "0") ==0 &&
						   "1".equals(_inspcvalue)){
					aStruct.setINSPC_CMPLT_DATE(struct.getACPT_DATE());
					aStruct.setINSPC_CMPLT_FLG("1");
				}
				aStruct.setODR_CANCEL_CAUSE_CD(struct.getODR_CANCEL_CAUSE_CD());
				
				// [発注残]を更新
				entity.mT_RLSD_PUCH_ODRForComplete.update(conn, aStruct);
			}

			// 受入実績関連のテーブルを更新
			String[] message;
			InspcAcpt ia = new InspcAcpt(conn, sysUSER_CD, sp.getProcId(), sysPLANT_CD);
			boolean result = ia.addAcpt(struct.getPUCH_ODR_CD(), struct.getACPT_NO(), struct.getEXCH_RATE(), _myCompanyStruct.getCOMPANY_CD());
			if (!result) {
				if (ia.getErrorList() != null && !ia.getErrorList().isEmpty() ) {
					if ("BZ00180".equals(ia.getErrorList().get(0).toString())) {
						setErrorMessage("BZ00180");
						return;
					}
				}
				setErrorMessage("AE05017");
				setErrorParameter("T_ACPT_RSLT", "PUCH_ODR_CD", struct.getPUCH_ODR_CD());
				setErrorParameter("T_ACPT_RSLT", "ACPT_NO", struct.getACPT_NO());
				return;
			}

			// 業務ワーニングの出力
			for(int i=0; i<ia.getWarnList().size(); i++){
				message = (String[])ia.getErrorList().get(i);
				if("AD10003".equals(message[0])){
					setWarningMessage("AE00162");
				}
			}
			if(!ia.getErrorList().isEmpty()){
				for(int i=0; i<ia.getErrorList().size(); i++){
					message = (String[])ia.getErrorList().get(i);
					setErrorMessage(message[0], message[1]);
				}
				conn.rollback();
				return;
			}
			String RiMessage;
			if(!ia.getRiErrorList().isEmpty()){
				for(int i=0; i<ia.getRiErrorList().size(); i++){
					RiMessage = ia.getRiErrorList().get(i).toString();
					setErrorMessage(RiMessage);
				}
				conn.rollback();
				return;
			}
			//注文取消がONの場合かつ、[発注残]."受入検査区分"が2:受入後に検査を行うの場合、
			//[発注残]."検査完了フラグ"=0:未,[発注残]."検査完了日"にNULLをセットする 2006/04/14up
			/*if ("true".equals(struct.getc_CANCEL()) && "2".equals(struct.getACPT_INSPC_TYP())) {
				entity.mupdateT_RLSD_PUCH_ODR_INSPC_CMPLT.update(conn, struct);
			}*/
			
			//支給品みなし出庫処理
			BigDecimal planSum     = new BigDecimal(0);			// 受入数(画面項目)
			BigDecimal denominator = new BigDecimal(0);			// 出庫指示単位数分子
			BigDecimal numerator   = new BigDecimal(0);			// 出庫指示単位数分母

			boolean mHantei = false ;							// 在庫数マイナス確認フラグ
			boolean lHantei = false ;							// 在庫数マイナス確認フラグ

			// [出庫指示]データを取得する。
			List issueInstList = entity.mT_ISSUE_INST.read(conn, struct);
			//String flgForT_PART_SUPPLIED_ISSUE = "insert";
			if (issueInstList.isEmpty()) 
			{
			} else {
				for (int i = 0; i < issueInstList.size(); i++ ) 
				{
					AE0060010Struct tempIssueStruct = (AE0060010Struct) issueInstList.get(i);
					// 使用予定数量の計算
					planSum = new BigDecimal(struct.getACPT_QTY());										// 画面:受入数
					denominator = new BigDecimal(tempIssueStruct.getreadISSUE_INST_UNIT_DENOMINATOR());	// 出庫指示単位数分子
					numerator = new BigDecimal(tempIssueStruct.getreadISSUE_INST_UNIT_NUMERATOR());		// 出庫指示単位数分母

					double beforeQty = 0;		// 更新前手持在庫数(初期化)
					double afterQty = 0;		// 更新後手持在庫数(初期化)
					double rcvissueQty = 0;		// 保管区別入出庫入出庫数(初期化)

					// 在庫数単位区分の判定
					if ("1".equals(tempIssueStruct.getreadUNIT_QTY_TYP()))
					{
						// [出庫指示]テーブルの出庫指示単位数分子・分母が0の場合
						// 計算式に組み込まない。
						// 1:整数管理
						if ("0".equals(tempIssueStruct.getreadISSUE_INST_UNIT_DENOMINATOR()) || 
							"0".equals(tempIssueStruct.getreadISSUE_INST_UNIT_NUMERATOR()))
						{
							// 単位分母、分子が0の場合。
							planSum = planSum.setScale(0,BigDecimal.ROUND_UP);
						} else {
							planSum = planSum.multiply(numerator).divide(denominator,0,BigDecimal.ROUND_UP).setScale(1);
						}
					} else {
						// [出庫指示]テーブルの出庫指示単位数分子・分母が0の場合
						// 計算式に組み込まない。
						// 2:小数管理
						if ("0".equals(tempIssueStruct.getreadISSUE_INST_UNIT_DENOMINATOR()) || 
							"0".equals(tempIssueStruct.getreadISSUE_INST_UNIT_NUMERATOR()))
						{
							planSum = planSum.setScale(4,BigDecimal.ROUND_HALF_UP);
						} else {
							// 小数第5位を四捨五入
							planSum = planSum.multiply(numerator).divide(denominator,4,BigDecimal.ROUND_HALF_UP);
							// 小数の表示スケール処理をメソッド化2006/04/11up
							//planSum = setDisplayscale(planSum);
							//小数の表示スケール処理
							/*BigDecimal intVal = new BigDecimal("" + planSum.intValue());
							BigDecimal decimalVal = planSum.subtract(intVal).multiply(new BigDecimal(10000));
							int decVal = decimalVal.intValue();
							int roundCount = 1;
							while (true)
							{
								decVal = decVal / 10;
								if (decVal == 0) 
								{
									// ループを抜ける。
									break;
								} 
								roundCount++;
							} // END WHILE
							planSum = planSum.setScale(roundCount,BigDecimal.ROUND_UP);*/
							
						}
					}

					//支給品テーブルの主キーが存在する場合の対応(品目構成に擬似品目があり、同じ品目をみなし出庫する場合)2006/04/11up
					
					//System.out.println("発注番号" + struct.getPUCH_ODR_CD());
					//System.out.println("受入回数" + struct.getACPT_NO());
					//System.out.println("品目番号" + tempIssueStruct.getreadITEM_CD());
					String parentITEM_CD = struct.getITEM_CD();
					AE0060010Struct tempStruct = new AE0060010Struct();
					tempStruct.setPUCH_ODR_CD(struct.getPUCH_ODR_CD());
					tempStruct.setACPT_NO(struct.getACPT_NO());
					tempStruct.setITEM_CD(tempIssueStruct.getreadITEM_CD());
					List PartSuppliedIssueList = entity.mreadT_PART_SUPPLIED_ISSUE.read(conn, tempStruct);
					if(PartSuppliedIssueList.isEmpty()){//支給品使用テーブルに同一主キーが存在しない場合
						if(parentITEM_CD != null && !"".equals(parentITEM_CD.trim())){
							String subITEM_CD = tempIssueStruct.getreadITEM_CD();
							// 製品構成リポジトリ作成
                            ProductStructureRepository repository = new ProductStructureRepository(conn);
					        if(checkReverseRooping(repository, subITEM_CD, parentITEM_CD)){
                                setErrorMessage("AE20607");
                                if(_lotCtrlFlg == true && !"0".equals(struct.geth_LOT_NUMBERING_TYP())){
			                        struct.setLOT_NO(null);
			                    }
                				conn.rollback();
                                return;
                            }
						}
						
						// 1支給品使用テーブル(T_PART_SUPPLIED_ISSUE)の登録処理
						struct.setsetPUCH_ODR_CD(struct.getPUCH_ODR_CD());												// 発注番号(画面値)
						struct.setsetACPT_NO(struct.getACPT_NO());														// 受入回数
						struct.setsetITEM_CD(tempIssueStruct.getreadITEM_CD());											// 支給品品目番号
						struct.setsetACPT_QTY(struct.getACPT_QTY());													// 受入数(画面値)
						struct.setsetCOMPANY_CD(tempIssueStruct.getreadCOMPANY_CD());									// 会社コード
						struct.setsetVEND_CD(tempIssueStruct.getreadVEND_CD());											// 取引先コード
						struct.setsetJOB_ODR_CD(tempIssueStruct.getreadJOB_ODR_CD());									// 製番
						struct.setsetJOB_ODR_DETAIL_NO(tempIssueStruct.getreadJOB_ODR_DETAIL_NO());						// 製番枝番
						struct.setsetPLANT_CD(tempIssueStruct.getreadPLANT_CD());										// 工場コード
						struct.setsetISSUE_INST_CD(tempIssueStruct.getreadISSUE_INST_CD());								// 出庫指示番号
						struct.setsetMRP_ODR_TYP(tempIssueStruct.getreadMRP_ODR_TYP());									// 品目手配区分
						struct.setsetSUPPLIED_ISSUE_GNR_TYP("1");														// 処理区分(1:みなし出庫)
						struct.setsetSUPPLIED_ISSUE_QTY(String.valueOf(planSum));										// 使用予定数量
						struct.setsetTOTAL_ISSUE_QTY(String.valueOf(planSum));											// 使用済数量
						struct.setsetSUPPLIED_UNIT_DENOMINATOR(tempIssueStruct.getreadISSUE_INST_UNIT_DENOMINATOR());	// 支給品使用単位数分母
						struct.setsetSUPPLIED_UNIT_NUMERATOR(tempIssueStruct.getreadISSUE_INST_UNIT_NUMERATOR());		// 支給品使用単位数分子
						struct.setsetSUPPLIED_DATE(struct.getACPT_DATE());												// 使用日(画面値)
						struct.setsetPART_SUPPLIED_COMMENT(null);														// 支給品使用備考
						entity.mT_PART_SUPPLIED_ISSUE.create(conn, struct);
					}else{
						//flgForT_PART_SUPPLIED_ISSUE= "update";
						///支給品使用テーブルに同一主キーが存在する場合
						AE0060010Struct tempSuppliedStruct = (AE0060010Struct) PartSuppliedIssueList.get(0);
						BigDecimal Denominator = new BigDecimal(tempSuppliedStruct.getreadSUPPLIED_UNIT_DENOMINATOR());	// 検索した支給品使用単位数分母
						BigDecimal Numerator   = new BigDecimal(tempSuppliedStruct.getreadSUPPLIED_UNIT_NUMERATOR());		// 検索した支給品使用単位数分子
						BigDecimal newDenominator = new BigDecimal(0); //計算後の支給品使用単位数分母
						BigDecimal newNumerator = new BigDecimal(0);  //計算後の支給品使用単位数分子
						BigDecimal gcd = new BigDecimal(0); //分母同士の最大公約数 2006/05/22 up
						
						//支給品使用単位数分母・分子の計算を行う
						if ("1".equals(tempIssueStruct.getreadUNIT_QTY_TYP()))
						{
							// [出庫指示]テーブルの出庫指示単位数分子・分母が0の場合
							// 値を変更しない。
							// 1:整数管理
							if ("0".equals(tempIssueStruct.getreadISSUE_INST_UNIT_DENOMINATOR()) || 
								"0".equals(tempIssueStruct.getreadISSUE_INST_UNIT_NUMERATOR()))
							{
								// 単位分母、分子が0の場合。
								struct.setsetSUPPLIED_UNIT_DENOMINATOR(tempIssueStruct.getreadISSUE_INST_UNIT_DENOMINATOR());	// 支給品使用単位数分母
								struct.setsetSUPPLIED_UNIT_NUMERATOR(tempIssueStruct.getreadISSUE_INST_UNIT_NUMERATOR());		// 支給品使用単位数分子
							} else {
								//newDenominator = Denominator.multiply(denominator).setScale(0);
								//newNumerator = numerator.multiply(Denominator).add(Numerator.multiply(denominator)).setScale(0);
								gcd = getgcd(Denominator,denominator);//分母同士の最小公倍数を更新する分母とする 2006/05/22 up
								newDenominator = Denominator.multiply(denominator).divide(gcd,0,BigDecimal.ROUND_UP); //分母（最小公倍数）
								newNumerator = Numerator.multiply(newDenominator).divide(Denominator,0,BigDecimal.ROUND_UP).add(numerator.multiply(newDenominator).divide(denominator,0,BigDecimal.ROUND_UP));//分子の計算
								//分母同士の最小公倍数を更新する分母とする 2006/05/22 end
								struct.setsetSUPPLIED_UNIT_DENOMINATOR(String.valueOf(newDenominator));
								struct.setsetSUPPLIED_UNIT_NUMERATOR(String.valueOf(newNumerator));
							}
						} else {
							// [出庫指示]テーブルの出庫指示単位数分子・分母が0の場合
							// 値を変更しない。
							// 2:小数管理
							if ("0".equals(tempIssueStruct.getreadISSUE_INST_UNIT_DENOMINATOR()) || 
								"0".equals(tempIssueStruct.getreadISSUE_INST_UNIT_NUMERATOR()))
							{
								struct.setsetSUPPLIED_UNIT_DENOMINATOR(tempIssueStruct.getreadISSUE_INST_UNIT_DENOMINATOR());	// 支給品使用単位数分母
								struct.setsetSUPPLIED_UNIT_NUMERATOR(tempIssueStruct.getreadISSUE_INST_UNIT_NUMERATOR());		// 支給品使用単位数分子
							} else {
								// 小数第5位を四捨五入
								//planSum = planSum.multiply(numerator).divide(denominator,4,BigDecimal.ROUND_HALF_UP);
								//newDenominator = setDisplayscale(Denominator.multiply(denominator).setScale(4,BigDecimal.ROUND_HALF_UP));
								//newNumerator = setDisplayscale(numerator.multiply(Denominator).add(Numerator.multiply(denominator)).setScale(4,BigDecimal.ROUND_HALF_UP));
								if(Denominator.compareTo(denominator) >= 0){ //大きいほうの分母を分母として更新する2006/05/22 up
									newDenominator = Denominator;
									newNumerator = Numerator.add((numerator.multiply(Denominator)).divide(denominator,4,BigDecimal.ROUND_UP));
								}else{
									newDenominator = denominator;
									newNumerator = numerator.add((Numerator.multiply(denominator)).divide(Denominator,4,BigDecimal.ROUND_UP))/*.setScale(4,BigDecimal.ROUND_HALF_UP))*/;
								}//大きいほうの分母を分母として更新する 2006/05/22 end
								struct.setsetSUPPLIED_UNIT_DENOMINATOR(String.valueOf(newDenominator));
								struct.setsetSUPPLIED_UNIT_NUMERATOR(String.valueOf(newNumerator));
							}
						}
						BigDecimal SuppliedIssueQty = new BigDecimal(tempSuppliedStruct.getreadSUPPLIED_ISSUE_QTY());	// 検索した使用予定数量
						struct.setsetSUPPLIED_ISSUE_QTY(String.valueOf((SuppliedIssueQty).add(planSum)));				// 使用予定数量
						struct.setsetTOTAL_ISSUE_QTY(String.valueOf((SuppliedIssueQty).add(planSum)));
						struct.setITEM_CD(tempIssueStruct.getreadITEM_CD());					
						// 使用済数量
						//struct.setsetSUPPLIED_UNIT_DENOMINATOR(String.valueOf(newDenominator));							// 支給品使用単位数分母
						//struct.setsetSUPPLIED_UNIT_NUMERATOR(String.valueOf(newNumerator));								// 支給品使用単位数分子

						//登録する桁数チェック 2006/05/22 up
						
						if(newDenominator.compareTo(Decival) > 0 ||
							newNumerator.compareTo(Decival) > 0 ||
							SuppliedIssueQty.compareTo(Decival) > 0){//登録する数値が桁あふれが起こる場合
							setErrorMessage("ZZ05109");
							setErrorParameter("T_PART_SUPPLIED_ISSUE", "ITEM_CD", tempIssueStruct.getreadITEM_CD());
							return ;
						}//登録する桁数チェック 2006/05/22 end
						entity.mupdateT_PART_SUPPLIED_ISSUE.update(conn, struct);
					}
				    if(lotNoList != null){
                        lotNoList.clear();
                    }
					//ロット管理導入済、ロット管理を行う、注文取消がチェック Off 
					if(_lotCtrlFlg == true
							&& "1".equals(tempIssueStruct.getreadLOT_CONTROL_FLG()) 
							&& Calculate.compare(struct.getACPT_QTY(), "0") != 0
							&& !"true".equals(struct.getc_CANCEL())){
                        AE0060010Struct chkStruct = new AE0060010Struct();
                        chkStruct.setPUCH_ODR_CD(struct.getPUCH_ODR_CD());           //発注番号
                        chkStruct.setITEM_CD(tempIssueStruct.getreadITEM_CD());      //品目番号
                        chkStruct.setACPT_NO(struct.getACPT_NO());                   //受入回数
                        //出庫実績明細に存在チェック
                        if(entity.mcheckT_LOT_ISSUE_INST.check(conn, chkStruct)){
                    	    AE0060010Struct tmpStruct = new AE0060010Struct();
                    	    tmpStruct.setACPT_NO(struct.getACPT_NO());               //受入回数
                    	    tmpStruct.setPUCH_ODR_CD(struct.getPUCH_ODR_CD());       //発注番号
                    	    tmpStruct.setITEM_CD(tempIssueStruct.getreadITEM_CD());  //品目番号
                    	    tmpStruct.setsetPUCH_ODR_CD(struct.getPUCH_ODR_CD());    //発注番号
                    	    tmpStruct.setsetACPT_NO(struct.getACPT_NO());            //受入回数
                    	    tmpStruct.setsetITEM_CD(tempIssueStruct.getreadITEM_CD());//品目番号
                        	//[支給品使用]の読込
                    	    List tmpList = entity.mSelectT_PART_SUPPLIED_ISSUE.read(conn, tmpStruct);
                    	    if(tmpList != null && tmpList.size() > 0){
                    		    AE0060010Struct tpsiStruct = (AE0060010Struct)tmpList.get(0);
                    		    tmpStruct.setVEND_CD(tpsiStruct.getreadVEND_CD());                //取引先コード
                		        tmpStruct.setPLANT_CD(tpsiStruct.getreadPLANT_CD());              //工場コード
                		        tmpStruct.setISSUE_INST_CD(tpsiStruct.getreadISSUE_INST_CD());    //出庫指示番号
                		        tmpStruct.setsetISSUE_INST_CD(tpsiStruct.getreadISSUE_INST_CD()); //出庫指示番号
                		        tmpStruct.setsetSUPPLIED_DATE(tpsiStruct.getreadSUPPLIED_DATE()); //使用日
                		        //[ロット別使用実績]の追加
                		        if(!insertT_LOT_USE_RSLT(tmpStruct)){
                		        	if(!"0".equals(struct.geth_LOT_NUMBERING_TYP())){
			                            struct.setLOT_NO(null);
			                        }
                			        return;
                		        }
                    	    }else{
                    	    	//支給品目に対する出庫実績明細またはロット管理マスタが存在しません。
                    		    setErrorMessage("AE20609");
                    		    if(!"0".equals(struct.geth_LOT_NUMBERING_TYP())){
			                        struct.setLOT_NO(null);
			                    }
    						    conn.rollback();
                	            return;
                    	    }
                        }else{
                        	//支給品目に対する出庫実績明細またはロット管理マスタが存在しません。
                    	    setErrorMessage("AE20609");
                    	    if(!"0".equals(struct.geth_LOT_NUMBERING_TYP())){
				                struct.setLOT_NO(null);
				            }
						    conn.rollback();
                    	    return;
                        }
                    }
					// ②保管区別品目在庫(T_ITEM_STOCK)、保管区別製番在庫(T_JOB_ODR_CD_STOCK)の登録・更新処理
					// 品目手配区分による更新対象の変更
					// MRP管理品  4:ﾏﾆｭｱﾙ手配品目、5:ﾛｯﾄ手配品目、6:定量手配品目、7:発注点手配品目
					// 製番管理品 1:製番、2 :在庫引当型製番

					// 保管区コード取得
					struct.setsetVEND_CD(tempIssueStruct.getreadVEND_CD());                       //取引先コード
					struct.setsetPLANT_CD(tempIssueStruct.getreadPLANT_CD());                     //工場コード
					List mWhList = entity.mreadM_WH.read(conn, struct);
					AE0060010Struct tempWhStruct = (AE0060010Struct) mWhList.get(0);

					if (("4".equals(tempIssueStruct.getreadMRP_ODR_TYP())) || ("5".equals(tempIssueStruct.getreadMRP_ODR_TYP())) ||
					   ("6".equals(tempIssueStruct.getreadMRP_ODR_TYP())) || ("7".equals(tempIssueStruct.getreadMRP_ODR_TYP())))
					{
						// MRP管理品(保管区別品目在庫対象)
						// 保管区別品目在庫チェック
						struct.setsetITEM_CD(tempIssueStruct.getreadITEM_CD());
						struct.setsetWH_CD(tempWhStruct.getreadWH_CD());
						List itemStList = entity.mreadT_ITEM_STOCK.read(conn, struct);

						// 更新チェック
						if (itemStList.isEmpty()) 
						{
							// 保管区別品目在庫登録
							struct.setsetITEM_CD(tempIssueStruct.getreadITEM_CD());							// 01.品目番号
							struct.setsetWH_CD(tempWhStruct.getreadWH_CD());								// 02.保管区コード
							struct.setsetPLANT_CD(tempIssueStruct.getreadPLANT_CD());						// 03.工場コード
							struct.setsetSTOCK_ON_HAND_QTY(String.valueOf(planSum.doubleValue() * -1));		// 04.品目別手持在庫数
							entity.minsertT_ITEM_STOCK.create(conn, struct);

							// 更新前手持在庫数セット
							beforeQty = 0;								// 更新前
							afterQty = planSum.doubleValue() * -1;		// 更新後
							rcvissueQty = planSum.doubleValue() * -1;	// 入出庫数
							// 判定フラグに"true"(マイナスデータ)セット
							mHantei = true;
						} else {
							AE0060010Struct tempItemStStruct = (AE0060010Struct) itemStList.get(0);
							// 保管区別品目在庫更新
							struct.setsetSTOCK_ON_HAND_QTY(String.valueOf(Double.parseDouble(tempItemStStruct.getreadSTOCK_ON_HAND_QTY()) 
															- planSum.doubleValue()));						// 01.品目別手持在庫数
							struct.setsetITEM_CD(tempIssueStruct.getreadITEM_CD());							// 条件.品目番号
							struct.setsetWH_CD(tempWhStruct.getreadWH_CD());								// 条件.保管区コード
							entity.mupdateT_ITEM_STOCK.update(conn, struct);

							// 更新前手持在庫数セット
							beforeQty = Double.parseDouble(tempItemStStruct.getreadSTOCK_ON_HAND_QTY());	// 更新前
							afterQty = Double.parseDouble(tempItemStStruct.getreadSTOCK_ON_HAND_QTY()) 
															- planSum.doubleValue();						// 更新後
							rcvissueQty = planSum.doubleValue() * -1;										// 入出庫数
							// 在庫数のマイナスチェック
							if (afterQty < 0 && lHantei == false)
							{
								// 判定フラグに"true"(マイナスデータ)セット
								mHantei = true;
								lHantei = true; //2006/05/22 up
							}
						}
					} else if (("1".equals(tempIssueStruct.getreadMRP_ODR_TYP())) || ("2".equals(tempIssueStruct.getreadMRP_ODR_TYP()))) {
						// 製番管理品(保管区別製番在庫対象)
						// 保管区別製番在庫チェック
						struct.setsetJOB_ODR_CD(tempIssueStruct.getreadJOB_ODR_CD());						// 製番
						struct.setsetJOB_ODR_DETAIL_NO(tempIssueStruct.getreadJOB_ODR_DETAIL_NO());			// 製番枝番
						struct.setsetITEM_CD(tempIssueStruct.getreadITEM_CD());								// 品目番号
						struct.setsetWH_CD(tempWhStruct.getreadWH_CD());									// 保管区コード
						List itemJobList = entity.mreadT_JOB_ODR_CD_STOCK.read(conn, struct);

						// 更新チェック
						if (itemJobList.isEmpty()) 
						{
							// 保管区別製番在庫登録
							struct.setsetJOB_ODR_CD(tempIssueStruct.getreadJOB_ODR_CD());					// 01.製番
							struct.setsetJOB_ODR_DETAIL_NO(tempIssueStruct.getreadJOB_ODR_DETAIL_NO());		// 02.製番枝番
							struct.setsetITEM_CD(tempIssueStruct.getreadITEM_CD());							// 03.品目番号
							struct.setsetWH_CD(tempWhStruct.getreadWH_CD());								// 04.保管区コード
							struct.setsetPLANT_CD(tempIssueStruct.getreadPLANT_CD());						// 05.工場コード
							struct.setsetSTOCK_ON_HAND_QTY(String.valueOf(planSum.doubleValue() * -1));		// 06.製番別手持在庫数
							entity.minsertT_JOB_ODR_CD_STOCK.create(conn, struct);
							// 更新前手持在庫数セット
							beforeQty = 0;								// 更新前
							afterQty = planSum.doubleValue() * -1;		// 更新後
							rcvissueQty = planSum.doubleValue() * -1;	// 入出庫数
							// 判定フラグに"true"(マイナスデータ)セット
							mHantei = true;
						} else {
							AE0060010Struct tempJobStruct = (AE0060010Struct) itemJobList.get(0);
							// 保管区別製番在庫更新
							struct.setsetSTOCK_ON_HAND_QTY(String.valueOf(Double.parseDouble(tempJobStruct.getreadSTOCK_ON_HAND_QTY()) 
															- planSum.doubleValue()));						// 01.製番別手持在庫数
							struct.setsetJOB_ODR_CD(tempIssueStruct.getreadJOB_ODR_CD());					// 条件.製番
							struct.setsetJOB_ODR_DETAIL_NO(tempIssueStruct.getreadJOB_ODR_DETAIL_NO());		// 条件.製番枝番
							struct.setsetITEM_CD(tempIssueStruct.getreadITEM_CD());							// 条件.品目番号
							struct.setsetWH_CD(tempWhStruct.getreadWH_CD());								// 条件.保管区コード
							entity.mupdateT_JOB_ODR_CD_STOCK.update(conn, struct);
							// 更新前手持在庫数セット
							beforeQty = Double.parseDouble(tempJobStruct.getreadSTOCK_ON_HAND_QTY());		// 更新前
							afterQty = Double.parseDouble(tempJobStruct.getreadSTOCK_ON_HAND_QTY()) 
															- planSum.doubleValue();						// 更新後
							rcvissueQty = planSum.doubleValue() * -1;										// 入出庫数
							// 在庫数のマイナスチェック
							if (afterQty < 0 && lHantei == false)
							{
								// 判定フラグに"true"(マイナスデータ)セット
								mHantei = true;
								lHantei = true; //2006/05/22 up
							}
						}
					} // END IF保管区別品目在庫、保管区別製番在庫の登録・更新処理

					// マイナス判定のインフォメーション表示 //コメントアウト 2006/05/22 up
					/*if (mHantei == true && lHantei == false)
					{
						// AE00069:支給品みなし出庫で取引先保管区の品目または
						// 製番手持在庫数が一部マイナスとなりました。
						//setErrorMessage("AE00069");
						setWarningMessage("AE00069");
						// 判定フラグに"true"をセット
						lHantei = true;
					}*/

					// ③保管区別入出庫(T_RCV_ISSUE)の登録処理
					// 入出庫番号採番
					CollectNumber collectNum = new CollectNumber(CollectNumber.ISSUE_CD,this.sysUSER_CD,
												this.sp.getProcId(),this.sysPLANT_CD);
					String no = collectNum.getNo();
					if (no == null || no.length() == 0) 
					{
						//採番結果がない
						setErrorMessage("ZZ01106");
						return;
					}
					struct.setsetRCV_ISSUE_CTRL_CD(no);														// 01.入出庫管理番号
					struct.setsetRCV_ISSUE_TYP("2");														// 02.入出庫区分(2:固定)
					struct.setsetITEM_CD(tempIssueStruct.getreadITEM_CD());									// 03.品目番号
					struct.setsetPLANT_CD(tempIssueStruct.getreadPLANT_CD());								// 04.工場コード
					struct.setsetWH_CD(tempWhStruct.getreadWH_CD());										// 05.保管区コード

					// 品目手配区分による更新値変更
					if (("1".equals(tempIssueStruct.getreadMRP_ODR_TYP())) ||
					    ("2".equals(tempIssueStruct.getreadMRP_ODR_TYP()))) 
					{
						struct.setsetJOB_ODR_CD(tempIssueStruct.getreadJOB_ODR_CD());						// 06.製番
						struct.setsetJOB_ODR_DETAIL_NO(tempIssueStruct.getreadJOB_ODR_DETAIL_NO());			// 07.製番枝番
					}
					struct.setsetPUCH_ODR_CD(struct.getPUCH_ODR_CD());										// 08.画面:発注番号
					struct.setsetACPT_NO(struct.getACPT_NO());												// 09.画面:受入回数
					struct.setsetACPT_RSLT_CRCT_NO("0");													// 10.受入実績訂正回数(0:固定)
					struct.setsetINSPEC_RSLT_CRCT_NO("0");													// 11.検査実績訂正回数(0:固定)
					struct.setsetWORK_ODR_CD(null);															// 12.作業計画番号(null)
					struct.setWORK_IN_PROC_CD(null);														// 13.仕掛作業コード(null)
					struct.setsetPARTIAL_PRD_NO("0");														// 14.分作回数(0:固定)
					struct.setsetOPR_RSLT_CRCT_NO("0");														// 15.作業実績訂正回数(0:固定)
					struct.setsetISSUE_INST_CD(tempIssueStruct.getreadISSUE_INST_CD());						// 16.出庫指示番号
					struct.setsetRCV_ISSUE_BEFORE_QTY(String.valueOf(beforeQty));							// 17.入出庫前在庫数
					struct.setsetRCV_ISSUE_QTY(String.valueOf(rcvissueQty));								// 18.入出庫数
					struct.setsetRCV_ISSUE_AFTER_QTY(String.valueOf(afterQty));								// 19.入出庫後在庫数
					struct.setsetRCV_ISSUE_AMOUNT("0");														// 20.入出庫金額(0:固定)
					struct.setsetRCV_ISSUE_DATE(struct.getACPT_DATE());										// 21.入出庫年月日
					struct.setsetRCV_ISSUE_GNR_TYP("71");													// 22.入出庫発生区分(71:固定)
					struct.setsetRCV_ISSUE_ODD_QTY("0");													// 23.入出庫端数(0:固定)
					struct.setsetDEFECT_CAUSE_CD(null);														// 24.入出庫不良理由コード
					struct.setsetSTOCK_UPD_TYP("2");														// 25.在庫更新区分(2:固定)
					struct.setsetRCV_ISSUE_CMPLT_FLG("0");													// 26.入出庫完了フラグ
					struct.setsetOD_NO(tempIssueStruct.getreadOD_NO());										// 27.オーダデマンド番号
					struct.setsetVEND_LOT_NO(struct.getVEND_LOT_NO());										// 28.画面:メーカロット番号
					struct.setsetRCV_ISSUE_COMMENT(null);													// 30.入出庫備考(null)
					struct.setsetCOMPANY_CD(tempIssueStruct.getreadCOMPANY_CD());							// 31.会社コード
					struct.setsetVEND_CD(tempIssueStruct.getreadVEND_CD());									// 32.取引先コード
					struct.setsetCONS_TYP(tempIssueStruct.getreadCONS_TYP());								// 33.支給区分
					struct.setsetCONS_EXEC_DATE(null);														// 34.有償支給実績抽出日
					
					if(lotNoList != null && lotNoList.size() > 0){
					    for(int l=0; l<lotNoList.size(); l++){
						    if(l > 0){
							    no = null;
						        CollectNumber collectNum1 = new CollectNumber(CollectNumber.ISSUE_CD,this.sysUSER_CD,
									                		this.sp.getProcId(),this.sysPLANT_CD);
					            no = collectNum1.getNo();
					            if (no == null || no.length() == 0) 
					            {
					                //採番結果がない
					                setErrorMessage("ZZ01106");
					                if(!"0".equals(lotNumberingTypBak)){
				                        struct.setLOT_NO(null);
				                    }
								    conn.rollback();
					                return;
					            }
					            beforeQty = afterQty;
					        }
					        struct.setsetRCV_ISSUE_CTRL_CD(no);
					        struct.setsetLOT_NO((String)lotNoList.get(l));                                          // 29.在庫ロット番号
					        rcvissueQty = getDoubleValue((String)lotNoList.get(l+1)) * -1;
					        afterQty = beforeQty + rcvissueQty;
					        struct.setsetRCV_ISSUE_BEFORE_QTY(String.valueOf(beforeQty));							// 17.入出庫前在庫数
					        struct.setsetRCV_ISSUE_QTY(String.valueOf(rcvissueQty));								// 18.入出庫数
					        struct.setsetRCV_ISSUE_AFTER_QTY(String.valueOf(afterQty));								// 19.入出庫後在庫数
					        entity.minsertT_RCV_ISSUE.create(conn, struct);
						    //ロット別品目在庫登録．更新
					        BizCommon bc = new BizCommon(conn, getsysUSER_CD(), sp.getProcId(), getsysPLANT_CD());
					        List updateLotStockList = bc.excUpdateLotStockFd(no, "");
             
					        if(bc.getResultStatus().intValue() == 1){
					        }else{
					            if(updateLotStockList != null && updateLotStockList.size() > 0){
					        	    setErrorMessage((String)updateLotStockList.get(0));
					        	    if(!"0".equals(lotNumberingTypBak)){
				                        struct.setLOT_NO(null);
				                    }
								    conn.rollback();
				                    return;
					            }else{
					        	    setErrorMessage("ZZ22001");
								    conn.rollback();
				                    return;
					            }
					        }

					        if("1".equals(lotControlFlgBak)){
					        	if(acptQty != 0 && vendlotno_bak != null){
					        		  List lotTraceList = bc.excMakeLotTraceFd(tempIssueStruct.getreadITEM_CD(),       //[ロット別使用実績].”支給品目番号”
			                                   								   (String)lotNoList.get(l),               //[ロット別使用実績].”在庫ロット番号”
			                                   								   itemCdBak,                              //[画面].”発注番号”で検索した[発注残]．”品目番号”
					        				                                   vendlotno_bak,                          //[受入実績].”在庫ロット番号”
					        				                                   "1");                                   //1:受入
							            if(bc.getResultStatus().intValue() == 1){
							            	// ロットトレース登録・更新処理が成功場合、［ロットトレース］の更新を行う
							            	tempStruct = new AE0060010Struct();
							            	// [ロットトレース].“元品目番号”＝[ロット別使用実績].”支給品目番号”
							            	tempStruct.setFROM_ITEM_CD(tempIssueStruct.getreadITEM_CD());
							            	// [ロットトレース].“元ロット番号”＝[ロット別使用実績].”在庫ロット番号”
							            	tempStruct.setFROM_LOT_NO((String)lotNoList.get(l));
							            	// [ロットトレース].“先品目番号”＝[画面].”発注番号”で検索した[発注残]．”品目番号”
							            	tempStruct.setTO_ITEM_CD(itemCdBak);
							            	// [ロットトレース].“先ロット番号”＝[受入実績].”在庫ロット番号”
							            	tempStruct.setTO_LOT_NO(vendlotno_bak);
							            	// [ロットトレース].“先発注番号”=[画面].”発注番号”
							            	tempStruct.setTO_PUCH_ODR_CD(struct.getPUCH_ODR_CD());
							            	// ユーザコード
							            	tempStruct.setsUser_ID(getsysUSER_CD());
							            	//[受入実績]で発注番号を取得
							            	List formList = entity.mgetFROM_PUCH_ODR_CD.read(conn, tempStruct);
							            	if((formList != null && formList.size() > 0)){
							            		//発注番号をソート順（降順）にし、１件目のレコードを取得する。
								            	AE0060010Struct orderStruct = (AE0060010Struct) formList.get(0);
								            	//[ロットトレース].“元発注番号” = [受入実績]."発注番号"
								            	tempStruct.setFROM_PUCH_ODR_CD(orderStruct.getFROM_PUCH_ODR_CD());
							            	}else{
							            		tempStruct.setFROM_PUCH_ODR_CD("");
							            	}
							            	// ［ロットトレース］の更新を行う
							            	entity.mupdateT_LOT_TRACE.update(conn, tempStruct);
							            }else{
							                if(lotTraceList != null && lotTraceList.size() > 0){
							         	        setErrorMessage((String)lotTraceList.get(0));
							         	        if(!"0".equals(lotNumberingTypBak)){
						                            struct.setLOT_NO(null);
						                        }
											    conn.rollback();
						                        return;
							                }else{
								        	    setErrorMessage("ZZ22016");
											    conn.rollback();
							                    return;
							                }
							            }							        
					        	   }
					          }else{
					        }
					        l = l+1;
					    }
					}else{
						struct.setsetLOT_NO(null);
					    entity.minsertT_RCV_ISSUE.create(conn, struct);
					}
				} // END FOR
			}
			if (mHantei == true ){ //2006/05/22 up
			// AE00069:支給品みなし出庫で取引先保管区の品目または
			// 製番手持在庫数が一部マイナスとなりました。
			//setErrorMessage("AE00069");
			setWarningMessage("AE00069");
			}

			// 以下、画面再表示特殊処理
			// 明細領域を削除（ただし、受入回数は退避、復元する。）
			String acptNo = struct.getACPT_NO();
			initializeDetail();
			struct.setACPT_NO(acptNo);

			// 登録した「発注番号」「受入回数」で最新のデータを読み直す。
			List formList = entity.mFormUpdate.read(conn, struct);

			// ｢発注番号｣に入力された値が、[発注残]に存在していない。
			if (formList.isEmpty()) {
				setErrorMessage("ZZ06001");
				setErrorParameter("T_RLSD_PUCH_ODR", "PUCH_ODR_CD", struct.getPUCH_ODR_CD());
				return;
			}

			// データを取得
			AE0060010Struct formStruct = (AE0060010Struct) formList.get(0);
			
			formStruct.setACPT_INSPC_TYP_DN(multcombo("ACPT_INSPC_TYP",formStruct.getACPT_INSPC_TYP()));
			formStruct.setPUCH_ODR_STS_TYP_DN(multcombo("PUCH_ODR_STS_TYP",formStruct.getPUCH_ODR_STS_TYP()));
			formStruct.setINSPC_CMPLT_FLG_DN(multcombo("INSPC_CMPLT_FLG",formStruct.getINSPC_CMPLT_FLG()));
			formStruct.setSPL_ITEM_TYP_DN(multcombo("SPL_ITEM_TYP",formStruct.getSPL_ITEM_TYP()));
			formStruct.setPRODUCT_TYP_DN(multcombo("PRODUCT_TYP",formStruct.getPRODUCT_TYP()));
			formStruct.setNON_NO_ITEM_FLG_DN(multcombo("NON_NO_ITEM_FLG",formStruct.getNON_NO_ITEM_FLG()));
			formStruct.setUNIT_QTY_TYP_DN(multcombo("UNIT_QTY_TYP",formStruct.getUNIT_QTY_TYP()));


			// [発注残]."発注状態区分" = 9:受入完了の場合
			if ("9".equals(formStruct.getPUCH_ODR_STS_TYP())) {
				if ("0".equals(formStruct.getODR_CANCEL_SLIP_ISS_FLG())) {
					// [発注残]."取消伝票発行フラグ" = 0:対象外の場合
					setWarningMessage("AE05005");
				} else if ("1".equals(formStruct.getODR_CANCEL_SLIP_ISS_FLG())) {
					// [発注残]."取消伝票発行フラグ" = 1:未発行の場合
					setWarningMessage("AE00089");
				} else if ("2".equals(formStruct.getODR_CANCEL_SLIP_ISS_FLG())) {
					// [発注残]."取消伝票発行フラグ" = 2:発行済の場合
					setWarningMessage("AE00087");
				}
				setWarningParameter("T_RLSD_PUCH_ODR", "PUCH_ODR_CD", formStruct.getPUCH_ODR_CD());
			}
			
			// [発注残]."発注時受入検査区分"が2:受入と検査を行なう の場合
			if ("2".equals(formStruct.getACPT_INSPC_TYP())) {
				setInspcWhStruct(formStruct);
			} else {
				// [発注残]."発注時受入検査区分"が1:受入のみ の場合
				formStruct.setINSPC_WH_CD(null);
				formStruct.setINSPC_WH_NAME(null);
			}

			// 画面に表示
			setStruct(formStruct);
			if ("9".equals(struct.getPUCH_ODR_STS_TYP())) {
				struct.setc_COMPLETE("true");
			} else {
				struct.setc_COMPLETE(null);
			}

			readStatus = NORMAL;

			struct.setSelectUnitCostFlag("true");
			
			if(StringUtil.Validate(struct.getJOB_ODR_CD()) &&
					"true".equals(struct.getc_COMPLETE())){
				// 引当済出庫残数＞製番在庫（手持在庫）の場合
				// ｢全受入完了｣がチェックされている時にチェック
				if(!(new IssueRemain(conn)).isEnoughAlcdQty(getsysPLANT_CD(),
						struct.getITEM_CD(), struct.getJOB_ODR_CD(),
						0)){
					setWarningMessage("AE00080");
				}
			}
			
			// 自動出庫の業務アラームがあれば出力する。
			for(int i=0; i<ia.getWarnList().size(); i++){
				message = (String[])ia.getWarnList().get(i);
				setWarningMessage(message[0], message[1]);
			}
			if (_lotCtrlFlg == true){
	            if(vendlotno_bak != null && !"".equals(vendlotno_bak)){
	                AE0060010Struct setStructForTlot = new AE0060010Struct();
	                setStructForTlot.setsetLOT_NO(vendlotno_bak);               //在庫ロット番号
	                setStructForTlot.setsetITEM_CD(itemCdBak);        //品目番号
	                setStructForTlot.setsUser_ID(getsysUSER_CD());
	                entity.mupdateT_LOT_CTRL.update(conn, setStructForTlot);    //[ロット管理]の更新
	            }
	            struct.seth_LOT_NUMBERING_TYP(lotNumberingTypBak);
				struct.seth_LOT_CTRL_FLG(lotControlFlgBak);
				struct.seth_FINAL_PROC_CD(finalProcFlgBak);
				struct.setLOT_NO(vendlotno_bak);
				
			}
			conn.commit();
		} catch (SQLException e) {
			throw new ExpjException(e);
		} catch( ResourceBusyException rbe ) {
			ExpjException ee = new ExpjException(rbe, "ZZ01105");
			throw ee;
		} catch (Exception e) {
			throw new ExpjException(e);
		} finally {
			struct.setITEM_CD(itemCdBak);
			if (conn != null) {
				conn.rollback();
			}
		}
                //}}user_implement_dev:<controlInsert>
		logger.exiting("AE0060010Control"+":USER="+struct.getsUser_ID(),"controlInsert");

		return;
	}

	/**
	 * 完了解除ボタン押下時に実行される処理です。
	 *
	 */
	public void controlCancelComplete() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0060");
		logger.entering("AE0060010Control"+":USER="+struct.getsUser_ID(),"controlCancelComplete");
			//{{user_implement_dev:<controlCancelComplete>
		try {
			// [発注残]に存在しないとき
			List lockedList = entity.mT_RLSD_PUCH_ODR_Lock.read(conn, struct);
			if (lockedList.isEmpty()) {
				setErrorMessage("ZZ01105");
				setErrorParameter("T_RLSD_PUCH_ODR", "PUCH_ODR_CD", struct.getPUCH_ODR_CD());
				return;
			}
			AE0060010Struct lockedStruct = (AE0060010Struct) lockedList.get(0);
			// [発注残]."更新数" != ｢更新数｣(hidden使用)の場合
			if (!lockedStruct
				.getPUCH_ODR_MODIFY_COUNT()
				.equals(struct.getPUCH_ODR_MODIFY_COUNT())) {
				setErrorMessage("ZZ01105");
				setErrorParameter("T_RLSD_PUCH_ODR", "PUCH_ODR_CD", struct.getPUCH_ODR_CD());
				return;
			}

			// エラーがあった場合は処理を中断
			if (msgStruct.hasError()) {
				return;
			}

			// [発注残]を更新
			entity.mT_RLSD_PUCH_ODRForCancel.update(conn, struct);
			// 完了解除に伴う関連テーブルの更新処理
			InspcAcpt ia = new InspcAcpt(conn, sysUSER_CD, sp.getProcId(), sysPLANT_CD);
			ia.cancelAcpt(struct.getPUCH_ODR_CD());

			// 画面再表示
			controlSelect();

			conn.commit();
		} catch (SQLException e) {
			throw new ExpjException(e);
		} catch (ApsComException e) {
			throw new ExpjException(e);
		} catch (ParseException e) {
			throw new ExpjException(e);
		} finally {
			if (conn != null) {
				conn.rollback();
			}
		}

                //}}user_implement_dev:<controlCancelComplete>
		logger.exiting("AE0060010Control"+":USER="+struct.getsUser_ID(),"controlCancelComplete");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0060");
		logger.entering("AE0060010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
		// 画面を初期化
		initializeAll();

                //}}user_implement_dev:<controlClear>
		logger.exiting("AE0060010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * 取消解除ボタン押下時に実行される処理です。
	 *
	 */
	public void controlCancelOdrCancel() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0060");
		logger.entering("AE0060010Control"+":USER="+struct.getsUser_ID(),"controlCancelOdrCancel");
			//{{user_implement_dev:<controlCancelOdrCancel>
			// TODO: ユーザ定義のコードを記述してください
		try {
			// [発注残]に存在しないとき
			List lockedList = entity.mT_RLSD_PUCH_ODR_Lock.read(conn, struct);
			if (lockedList.isEmpty()) {
				setErrorMessage("ZZ01105");
				setErrorParameter("T_RLSD_PUCH_ODR", "PUCH_ODR_CD", struct.getPUCH_ODR_CD());
				return;
			}
			AE0060010Struct lockedStruct = (AE0060010Struct) lockedList.get(0);
			// [発注残]."更新数" != ｢更新数｣(hidden使用)の場合
			if (!lockedStruct
				.getPUCH_ODR_MODIFY_COUNT()
				.equals(struct.getPUCH_ODR_MODIFY_COUNT())) {
				setErrorMessage("ZZ01105");
				setErrorParameter("T_RLSD_PUCH_ODR", "PUCH_ODR_CD", struct.getPUCH_ODR_CD());
				return;
			}

			// エラーがあった場合は処理を中断
			if (msgStruct.hasError()) {
				return;
			}
			
			// [発注残]を更新
			entity.mT_RLSD_PUCH_ODR_FOR_CANCEL_ODR_CANCEL.update(conn, struct);

			// 完了解除に伴う関連テーブルの更新処理
			InspcAcpt ia = new InspcAcpt(conn, sysUSER_CD, sp.getProcId(), sysPLANT_CD);
			ia.cancelAcpt(struct.getPUCH_ODR_CD());
			
			// [受入実績]を削除
			AE0060010Struct aStruct = new AE0060010Struct();
			setStructSystemData(aStruct);
			aStruct.setPUCH_ODR_CD(struct.getPUCH_ODR_CD());
			aStruct.setACPT_NO("1");
			entity.mT_ACPT_RSLT_FOR_CANCEL_ODR_CANCEL.delete(conn, aStruct);
			
			// [検査実績]を削除
//			entity.mT_INSPC_RSLT_FOR_CANCEL_ODR_CANCEL.delete(conn, struct);
			
			// 画面再表示
			controlSelect();

			conn.commit();
		} catch (SQLException e) {
			throw new ExpjException(e);
		} catch (ApsComException e) {
			throw new ExpjException(e);
		} catch (ParseException e) {
			throw new ExpjException(e);
		} finally {
			if (conn != null) {
				conn.rollback();
			}
		}
                //}}user_implement_dev:<controlCancelOdrCancel>
		logger.exiting("AE0060010Control"+":USER="+struct.getsUser_ID(),"controlCancelOdrCancel");

		return;
	}

	/**
	 * ロット管理ボタン押下時に実行される処理です。
	 *
	 */
	public void controlLotInsert() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0060");
		logger.entering("AE0060010Control"+":USER="+struct.getsUser_ID(),"controlLotInsert");
			//{{user_implement_dev:<controlLotInsert>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlLotInsert>
		logger.exiting("AE0060010Control"+":USER="+struct.getsUser_ID(),"controlLotInsert");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0060");
		logger.entering("AE0060010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
		// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AE0060010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0060");
		logger.entering("AE0060010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
		try {
			// [自社]情報を部品より取得
			_myCompanyStruct = MyCompanyControl.getData(conn);
			// [税名]情報を部品より取得
			_taxNameStruct = TaxNameControl.getData(conn);
			// [邦貨]情報を部品より取得
			_homeCurStruct = HomeCurControl.getData(conn);

			// コンボボックスデータ取得
			ComboBox cdac = new ComboBox(conn, sysUSER_CD);
			_unitCostTypStruct = cdac.getData("UNIT_COST_TYP");
			cdac.setConnection(null);

			//システム導入フラグ取得
			_lotCtrlFlg = LotCtrl.checkLotCtrl(conn);
			
			// パラメータ[検査完了フラグ]を取得
			PrivateConfig pc = new PrivateConfig(conn);
		    _inspcvalue = pc.getString("INSPC_CMPLT_FLG");

			// 画面を初期化
			initializeAll();

			// 画面遷移の呼び出しだったら、Structに画面遷移キーを設定してcontrolselect()を呼び出す
			if (isScreenMove()) {
				struct.setPUCH_ODR_CD(_puchOdrCd);
				controlSelect();
			}

		} catch (SQLException e) {
			throw new ExpjException(e);
		} catch (DataNotFoundException e) {
			throw new ExpjException(e);
		} catch (ComboException e) {
			throw new ExpjException(e);
		}

                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AE0060010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * イベントハンドラの前処理です。
	 *
	 * @param buttun ボタン名
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0060");
		logger.entering("AE0060010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
		// ダウンロードファイル名クリア
		// PDF・CSVのダウンロードを行うときは、画面上にOrHiddenで｢DOWNLOAD_FILE｣を定義し、次の行のコメントを外してください。
		//			struct.setDOWNLOAD_FILE((String)null);
		// コンボボックス部品のデータのセットはここに記述してください。
		// コンボボックスデータ用意
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("AE0060010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("CancelComplete") ) {
				controlCancelComplete();
			} else if( button.equals("Clear") ) {
				controlClear();
			} else if( button.equals("CancelOdrCancel") ) {
				controlCancelOdrCancel();
			} else if( button.equals("LotInsert") ) {
				controlLotInsert();
			} else if( button.equals("initial") ) {
				controlINITIAL();
			} else if( button.equals("reload") ) {
				controlRELOAD();
			}
		//{{user_implement_dev:<control_eventHandller>
			// TODO: ユーザ定義のコードを記述してください
			// リストボックス部品のデータのセットはここに記述してください。
			struct.setCOMPANY_CD(_myCompanyStruct.getCOMPANY_CD());

			struct.setHOME_CUR_UNIT(_homeCurStruct.getCUR_UNIT());
			struct.setHOME_DECIMAL_FIG(_homeCurStruct.getDECIMAL_FIG());

			struct.setList_UNIT_COST_TYP_val(_unitCostTypStruct.getValList());
			struct.setList_UNIT_COST_TYP_name(_unitCostTypStruct.getExplanList());
			
			if (_lotCtrlFlg == true) {
				struct.seth_LOTCTRL("true");
			} else {
				struct.seth_LOTCTRL("false");
			}
			// ダウンロードファイル名クリア
			// PDF・CSVのダウンロードを行うときは、画面上にOrHiddenで｢DOWNLOAD_FILE｣を定義し、次の行のコメントを外してください。
			//			struct.setDOWNLOAD_FILE((String)null);
			//		ソース内にまだAlarmMessageExceptionが残っている場合は、以下の行のコメントを外してAlarmMessageExceptionを始末する。
			//		} catch(AlarmMessageException ame){
			//			ExpjException ee = new ExpjException(ame, (ExpjMessageList)((Object)ame.getMessages()));
			//			throw ee;
			//		
                //}}user_implement_dev:<control_eventHandller>
		} catch( BusinessLockException ble ) {
			// 枠メッセージ出力依頼作成
			setNewDataFlg(false);
		} catch( ResourceBusyException rbe ) {
			ExpjException ee = new ExpjException(rbe, "ZZ01105");
			throw ee;
		} catch( FoundationException e ) {
//			e.printStackTrace();
//			throw new FoundationException("AE0060010Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AE0060010-E999","CSVの出力処理"));
			throw new FoundationException("AE0060010Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AE0060010-E999","システム日付の取得処理"));
				throw new FoundationException("AE0060010Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AE0060010-E999","コントロールのイベント処理"));
			throw new FoundationException("AE0060010Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected AE0060010Entity entity;
	protected AE0060010Struct struct;
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

		entity = new AE0060010Entity();
		struct = new AE0060010Struct();

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
	 * AE0060010クラスの標準コンストラクタ
	 */
	public AE0060010Control() throws BusinessProcessException, FoundationException
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
				AE0060010Struct key = (AE0060010Struct)keyList.get(j);
				// メッセージキーを作成する
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("h_PUCH_ODR_CD") && key.geth_PUCH_ODR_CD() != null) {
					msgKey.setKeyValue("h_PUCH_ODR_CD", key.geth_PUCH_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("c_COMPLETE") && key.getc_COMPLETE() != null) {
					msgKey.setKeyValue("c_COMPLETE", key.getc_COMPLETE());
				}
				if(msgKeyType.containsKeyColumn("UNIT_COST_TYP_name") && key.getUNIT_COST_TYP_name() != null) {
					msgKey.setKeyValue("UNIT_COST_TYP_name", key.getUNIT_COST_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("UNIT_COST_TYP_val") && key.getUNIT_COST_TYP_val() != null) {
					msgKey.setKeyValue("UNIT_COST_TYP_val", key.getUNIT_COST_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("HOME_CUR_UNIT") && key.getHOME_CUR_UNIT() != null) {
					msgKey.setKeyValue("HOME_CUR_UNIT", key.getHOME_CUR_UNIT());
				}
				if(msgKeyType.containsKeyColumn("ACPT_INSPC_TYP_DN") && key.getACPT_INSPC_TYP_DN() != null) {
					msgKey.setKeyValue("ACPT_INSPC_TYP_DN", key.getACPT_INSPC_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("SPL_ITEM_TYP_DN") && key.getSPL_ITEM_TYP_DN() != null) {
					msgKey.setKeyValue("SPL_ITEM_TYP_DN", key.getSPL_ITEM_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("PRODUCT_TYP_DN") && key.getPRODUCT_TYP_DN() != null) {
					msgKey.setKeyValue("PRODUCT_TYP_DN", key.getPRODUCT_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_STS_TYP_DN") && key.getPUCH_ODR_STS_TYP_DN() != null) {
					msgKey.setKeyValue("PUCH_ODR_STS_TYP_DN", key.getPUCH_ODR_STS_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("NON_NO_ITEM_FLG_DN") && key.getNON_NO_ITEM_FLG_DN() != null) {
					msgKey.setKeyValue("NON_NO_ITEM_FLG_DN", key.getNON_NO_ITEM_FLG_DN());
				}
				if(msgKeyType.containsKeyColumn("INSPC_CMPLT_FLG_DN") && key.getINSPC_CMPLT_FLG_DN() != null) {
					msgKey.setKeyValue("INSPC_CMPLT_FLG_DN", key.getINSPC_CMPLT_FLG_DN());
				}
				if(msgKeyType.containsKeyColumn("SelectUnitCostFlag") && key.getSelectUnitCostFlag() != null) {
					msgKey.setKeyValue("SelectUnitCostFlag", key.getSelectUnitCostFlag());
				}
				if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP_DN") && key.getUNIT_QTY_TYP_DN() != null) {
					msgKey.setKeyValue("UNIT_QTY_TYP_DN", key.getUNIT_QTY_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("c_CANCEL") && key.getc_CANCEL() != null) {
					msgKey.setKeyValue("c_CANCEL", key.getc_CANCEL());
				}
				if(msgKeyType.containsKeyColumn("h_ACPT_QTY") && key.geth_ACPT_QTY() != null) {
					msgKey.setKeyValue("h_ACPT_QTY", key.geth_ACPT_QTY());
				}
				if(msgKeyType.containsKeyColumn("h_ODR_CANCEL_SLIP_ISS_FLG") && key.geth_ODR_CANCEL_SLIP_ISS_FLG() != null) {
					msgKey.setKeyValue("h_ODR_CANCEL_SLIP_ISS_FLG", key.geth_ODR_CANCEL_SLIP_ISS_FLG());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD_DW") && key.getITEM_CD_DW() != null) {
					msgKey.setKeyValue("ITEM_CD_DW", key.getITEM_CD_DW());
				}
				if(msgKeyType.containsKeyColumn("ITEM_NAME_DW") && key.getITEM_NAME_DW() != null) {
					msgKey.setKeyValue("ITEM_NAME_DW", key.getITEM_NAME_DW());
				}
				if(msgKeyType.containsKeyColumn("h_LOTCTRL") && key.geth_LOTCTRL() != null) {
					msgKey.setKeyValue("h_LOTCTRL", key.geth_LOTCTRL());
				}
				if(msgKeyType.containsKeyColumn("param1") && key.getparam1() != null) {
					msgKey.setKeyValue("param1", key.getparam1());
				}
				if(msgKeyType.containsKeyColumn("param2") && key.getparam2() != null) {
					msgKey.setKeyValue("param2", key.getparam2());
				}
				if(msgKeyType.containsKeyColumn("param3") && key.getparam3() != null) {
					msgKey.setKeyValue("param3", key.getparam3());
				}
				if(msgKeyType.containsKeyColumn("h_LOT_NO") && key.geth_LOT_NO() != null) {
					msgKey.setKeyValue("h_LOT_NO", key.geth_LOT_NO());
				}
				if(msgKeyType.containsKeyColumn("h_PUCH_ODR_CD_1") && key.geth_PUCH_ODR_CD_1() != null) {
					msgKey.setKeyValue("h_PUCH_ODR_CD_1", key.geth_PUCH_ODR_CD_1());
				}
				if(msgKeyType.containsKeyColumn("HOME_DECIMAL_FIG") && key.getHOME_DECIMAL_FIG() != null) {
					msgKey.setKeyValue("HOME_DECIMAL_FIG", key.getHOME_DECIMAL_FIG());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_CD") && key.getPUCH_ODR_CD() != null) {
					msgKey.setKeyValue("PUCH_ODR_CD", key.getPUCH_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("ACPT_NO") && key.getACPT_NO() != null) {
					msgKey.setKeyValue("ACPT_NO", key.getACPT_NO());
				}
				if(msgKeyType.containsKeyColumn("ACPT_QTY") && key.getACPT_QTY() != null) {
					msgKey.setKeyValue("ACPT_QTY", key.getACPT_QTY());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT") && key.getSTOCK_UNIT() != null) {
					msgKey.setKeyValue("STOCK_UNIT", key.getSTOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("NON_NO_ITEM_NAME") && key.getNON_NO_ITEM_NAME() != null) {
					msgKey.setKeyValue("NON_NO_ITEM_NAME", key.getNON_NO_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("ACPT_DATE") && key.getACPT_DATE() != null) {
					msgKey.setKeyValue("ACPT_DATE", key.getACPT_DATE());
				}
				if(msgKeyType.containsKeyColumn("VEND_LOT_NO") && key.getVEND_LOT_NO() != null) {
					msgKey.setKeyValue("VEND_LOT_NO", key.getVEND_LOT_NO());
				}
				if(msgKeyType.containsKeyColumn("WH_CD") && key.getWH_CD() != null) {
					msgKey.setKeyValue("WH_CD", key.getWH_CD());
				}
				if(msgKeyType.containsKeyColumn("WH_NAME") && key.getWH_NAME() != null) {
					msgKey.setKeyValue("WH_NAME", key.getWH_NAME());
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
				if(msgKeyType.containsKeyColumn("TAX_AMOUNT_1") && key.getTAX_AMOUNT_1() != null) {
					msgKey.setKeyValue("TAX_AMOUNT_1", key.getTAX_AMOUNT_1());
				}
				if(msgKeyType.containsKeyColumn("TAX_AMOUNT_2") && key.getTAX_AMOUNT_2() != null) {
					msgKey.setKeyValue("TAX_AMOUNT_2", key.getTAX_AMOUNT_2());
				}
				if(msgKeyType.containsKeyColumn("TAX_AMOUNT_3") && key.getTAX_AMOUNT_3() != null) {
					msgKey.setKeyValue("TAX_AMOUNT_3", key.getTAX_AMOUNT_3());
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
				if(msgKeyType.containsKeyColumn("AMOUNT_INCLUDE_TAX") && key.getAMOUNT_INCLUDE_TAX() != null) {
					msgKey.setKeyValue("AMOUNT_INCLUDE_TAX", key.getAMOUNT_INCLUDE_TAX());
				}
				if(msgKeyType.containsKeyColumn("HOME_CUR_AMOUNT") && key.getHOME_CUR_AMOUNT() != null) {
					msgKey.setKeyValue("HOME_CUR_AMOUNT", key.getHOME_CUR_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("EXCH_RATE") && key.getEXCH_RATE() != null) {
					msgKey.setKeyValue("EXCH_RATE", key.getEXCH_RATE());
				}
				if(msgKeyType.containsKeyColumn("DLV_CD") && key.getDLV_CD() != null) {
					msgKey.setKeyValue("DLV_CD", key.getDLV_CD());
				}
				if(msgKeyType.containsKeyColumn("ACPT_RSLT_COMMENT") && key.getACPT_RSLT_COMMENT() != null) {
					msgKey.setKeyValue("ACPT_RSLT_COMMENT", key.getACPT_RSLT_COMMENT());
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
				if(msgKeyType.containsKeyColumn("DRAW_CD") && key.getDRAW_CD() != null) {
					msgKey.setKeyValue("DRAW_CD", key.getDRAW_CD());
				}
				if(msgKeyType.containsKeyColumn("SPEC") && key.getSPEC() != null) {
					msgKey.setKeyValue("SPEC", key.getSPEC());
				}
				if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP") && key.getUNIT_QTY_TYP() != null) {
					msgKey.setKeyValue("UNIT_QTY_TYP", key.getUNIT_QTY_TYP());
				}
				if(msgKeyType.containsKeyColumn("VEND_CD") && key.getVEND_CD() != null) {
					msgKey.setKeyValue("VEND_CD", key.getVEND_CD());
				}
				if(msgKeyType.containsKeyColumn("VEND_NAME") && key.getVEND_NAME() != null) {
					msgKey.setKeyValue("VEND_NAME", key.getVEND_NAME());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_QTY") && key.getPUCH_ODR_QTY() != null) {
					msgKey.setKeyValue("PUCH_ODR_QTY", key.getPUCH_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("SUM_ACPT_QTY") && key.getSUM_ACPT_QTY() != null) {
					msgKey.setKeyValue("SUM_ACPT_QTY", key.getSUM_ACPT_QTY());
				}
				if(msgKeyType.containsKeyColumn("ACPT_INSPC_TYP") && key.getACPT_INSPC_TYP() != null) {
					msgKey.setKeyValue("ACPT_INSPC_TYP", key.getACPT_INSPC_TYP());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_SLIP_ISS_DATE") && key.getPUCH_ODR_SLIP_ISS_DATE() != null) {
					msgKey.setKeyValue("PUCH_ODR_SLIP_ISS_DATE", key.getPUCH_ODR_SLIP_ISS_DATE());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_DLV_DATE") && key.getPUCH_ODR_DLV_DATE() != null) {
					msgKey.setKeyValue("PUCH_ODR_DLV_DATE", key.getPUCH_ODR_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("CONFIRM_DLV_DATE") && key.getCONFIRM_DLV_DATE() != null) {
					msgKey.setKeyValue("CONFIRM_DLV_DATE", key.getCONFIRM_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("WORK_IN_PROC_CD") && key.getWORK_IN_PROC_CD() != null) {
					msgKey.setKeyValue("WORK_IN_PROC_CD", key.getWORK_IN_PROC_CD());
				}
				if(msgKeyType.containsKeyColumn("PROC_NAME") && key.getPROC_NAME() != null) {
					msgKey.setKeyValue("PROC_NAME", key.getPROC_NAME());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_PERSON") && key.getPUCH_ODR_PERSON() != null) {
					msgKey.setKeyValue("PUCH_ODR_PERSON", key.getPUCH_ODR_PERSON());
				}
				if(msgKeyType.containsKeyColumn("USER_NAME") && key.getUSER_NAME() != null) {
					msgKey.setKeyValue("USER_NAME", key.getUSER_NAME());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_STS_TYP") && key.getPUCH_ODR_STS_TYP() != null) {
					msgKey.setKeyValue("PUCH_ODR_STS_TYP", key.getPUCH_ODR_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("INSPC_CMPLT_FLG") && key.getINSPC_CMPLT_FLG() != null) {
					msgKey.setKeyValue("INSPC_CMPLT_FLG", key.getINSPC_CMPLT_FLG());
				}
				if(msgKeyType.containsKeyColumn("SPL_ITEM_TYP") && key.getSPL_ITEM_TYP() != null) {
					msgKey.setKeyValue("SPL_ITEM_TYP", key.getSPL_ITEM_TYP());
				}
				if(msgKeyType.containsKeyColumn("PRODUCT_TYP") && key.getPRODUCT_TYP() != null) {
					msgKey.setKeyValue("PRODUCT_TYP", key.getPRODUCT_TYP());
				}
				if(msgKeyType.containsKeyColumn("NON_NO_ITEM_FLG") && key.getNON_NO_ITEM_FLG() != null) {
					msgKey.setKeyValue("NON_NO_ITEM_FLG", key.getNON_NO_ITEM_FLG());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("COMPANY_CD") && key.getCOMPANY_CD() != null) {
					msgKey.setKeyValue("COMPANY_CD", key.getCOMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("TAX_CD") && key.getTAX_CD() != null) {
					msgKey.setKeyValue("TAX_CD", key.getTAX_CD());
				}
				if(msgKeyType.containsKeyColumn("ROUND_TYP") && key.getROUND_TYP() != null) {
					msgKey.setKeyValue("ROUND_TYP", key.getROUND_TYP());
				}
				if(msgKeyType.containsKeyColumn("TAX_ROUND_TYP") && key.getTAX_ROUND_TYP() != null) {
					msgKey.setKeyValue("TAX_ROUND_TYP", key.getTAX_ROUND_TYP());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_START_DATE") && key.getPUCH_ODR_START_DATE() != null) {
					msgKey.setKeyValue("PUCH_ODR_START_DATE", key.getPUCH_ODR_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("BUSINESS_OPR_DATE") && key.getBUSINESS_OPR_DATE() != null) {
					msgKey.setKeyValue("BUSINESS_OPR_DATE", key.getBUSINESS_OPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_MODIFY_COUNT") && key.getPUCH_ODR_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("PUCH_ODR_MODIFY_COUNT", key.getPUCH_ODR_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("ODR_CANCEL_CAUSE_CD") && key.getODR_CANCEL_CAUSE_CD() != null) {
					msgKey.setKeyValue("ODR_CANCEL_CAUSE_CD", key.getODR_CANCEL_CAUSE_CD());
				}
				if(msgKeyType.containsKeyColumn("ODR_CANCEL_SLIP_ISS_FLG") && key.getODR_CANCEL_SLIP_ISS_FLG() != null) {
					msgKey.setKeyValue("ODR_CANCEL_SLIP_ISS_FLG", key.getODR_CANCEL_SLIP_ISS_FLG());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_COMMENT") && key.getPUCH_ODR_COMMENT() != null) {
					msgKey.setKeyValue("PUCH_ODR_COMMENT", key.getPUCH_ODR_COMMENT());
				}
				if(msgKeyType.containsKeyColumn("h_LOT_CTRL_FLG") && key.geth_LOT_CTRL_FLG() != null) {
					msgKey.setKeyValue("h_LOT_CTRL_FLG", key.geth_LOT_CTRL_FLG());
				}
				if(msgKeyType.containsKeyColumn("h_LOT_NUMBERING_TYP") && key.geth_LOT_NUMBERING_TYP() != null) {
					msgKey.setKeyValue("h_LOT_NUMBERING_TYP", key.geth_LOT_NUMBERING_TYP());
				}
				if(msgKeyType.containsKeyColumn("h_WORK_ODR_CD") && key.geth_WORK_ODR_CD() != null) {
					msgKey.setKeyValue("h_WORK_ODR_CD", key.geth_WORK_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("h_FINAL_PROC_CD") && key.geth_FINAL_PROC_CD() != null) {
					msgKey.setKeyValue("h_FINAL_PROC_CD", key.geth_FINAL_PROC_CD());
				}
				if(msgKeyType.containsKeyColumn("h_DATE_FLG") && key.geth_DATE_FLG() != null) {
					msgKey.setKeyValue("h_DATE_FLG", key.geth_DATE_FLG());
				}
				if(msgKeyType.containsKeyColumn("ACPT_STS_TYP") && key.getACPT_STS_TYP() != null) {
					msgKey.setKeyValue("ACPT_STS_TYP", key.getACPT_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("INSPC_WH_CD") && key.getINSPC_WH_CD() != null) {
					msgKey.setKeyValue("INSPC_WH_CD", key.getINSPC_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("LOT_NO") && key.getLOT_NO() != null) {
					msgKey.setKeyValue("LOT_NO", key.getLOT_NO());
				}
				if(msgKeyType.containsKeyColumn("INSPC_CMPLT_DATE") && key.getINSPC_CMPLT_DATE() != null) {
					msgKey.setKeyValue("INSPC_CMPLT_DATE", key.getINSPC_CMPLT_DATE());
				}
				if(msgKeyType.containsKeyColumn("readISSUE_INST_CD") && key.getreadISSUE_INST_CD() != null) {
					msgKey.setKeyValue("readISSUE_INST_CD", key.getreadISSUE_INST_CD());
				}
				if(msgKeyType.containsKeyColumn("readPLANT_CD") && key.getreadPLANT_CD() != null) {
					msgKey.setKeyValue("readPLANT_CD", key.getreadPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("readOD_NO") && key.getreadOD_NO() != null) {
					msgKey.setKeyValue("readOD_NO", key.getreadOD_NO());
				}
				if(msgKeyType.containsKeyColumn("readITEM_CD") && key.getreadITEM_CD() != null) {
					msgKey.setKeyValue("readITEM_CD", key.getreadITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("readPUCH_ODR_CD") && key.getreadPUCH_ODR_CD() != null) {
					msgKey.setKeyValue("readPUCH_ODR_CD", key.getreadPUCH_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("readCOMPANY_CD") && key.getreadCOMPANY_CD() != null) {
					msgKey.setKeyValue("readCOMPANY_CD", key.getreadCOMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("readVEND_CD") && key.getreadVEND_CD() != null) {
					msgKey.setKeyValue("readVEND_CD", key.getreadVEND_CD());
				}
				if(msgKeyType.containsKeyColumn("readCONS_TYP") && key.getreadCONS_TYP() != null) {
					msgKey.setKeyValue("readCONS_TYP", key.getreadCONS_TYP());
				}
				if(msgKeyType.containsKeyColumn("readISSUE_INST_UNIT_DENOMINATOR") && key.getreadISSUE_INST_UNIT_DENOMINATOR() != null) {
					msgKey.setKeyValue("readISSUE_INST_UNIT_DENOMINATOR", key.getreadISSUE_INST_UNIT_DENOMINATOR());
				}
				if(msgKeyType.containsKeyColumn("readISSUE_INST_UNIT_NUMERATOR") && key.getreadISSUE_INST_UNIT_NUMERATOR() != null) {
					msgKey.setKeyValue("readISSUE_INST_UNIT_NUMERATOR", key.getreadISSUE_INST_UNIT_NUMERATOR());
				}
				if(msgKeyType.containsKeyColumn("readJOB_ODR_CD") && key.getreadJOB_ODR_CD() != null) {
					msgKey.setKeyValue("readJOB_ODR_CD", key.getreadJOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("readJOB_ODR_DETAIL_NO") && key.getreadJOB_ODR_DETAIL_NO() != null) {
					msgKey.setKeyValue("readJOB_ODR_DETAIL_NO", key.getreadJOB_ODR_DETAIL_NO());
				}
				if(msgKeyType.containsKeyColumn("readMRP_ODR_TYP") && key.getreadMRP_ODR_TYP() != null) {
					msgKey.setKeyValue("readMRP_ODR_TYP", key.getreadMRP_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("readUNIT_QTY_TYP") && key.getreadUNIT_QTY_TYP() != null) {
					msgKey.setKeyValue("readUNIT_QTY_TYP", key.getreadUNIT_QTY_TYP());
				}
				if(msgKeyType.containsKeyColumn("readLOT_CONTROL_FLG") && key.getreadLOT_CONTROL_FLG() != null) {
					msgKey.setKeyValue("readLOT_CONTROL_FLG", key.getreadLOT_CONTROL_FLG());
				}
				if(msgKeyType.containsKeyColumn("setPUCH_ODR_CD") && key.getsetPUCH_ODR_CD() != null) {
					msgKey.setKeyValue("setPUCH_ODR_CD", key.getsetPUCH_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("setACPT_NO") && key.getsetACPT_NO() != null) {
					msgKey.setKeyValue("setACPT_NO", key.getsetACPT_NO());
				}
				if(msgKeyType.containsKeyColumn("setITEM_CD") && key.getsetITEM_CD() != null) {
					msgKey.setKeyValue("setITEM_CD", key.getsetITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("setACPT_QTY") && key.getsetACPT_QTY() != null) {
					msgKey.setKeyValue("setACPT_QTY", key.getsetACPT_QTY());
				}
				if(msgKeyType.containsKeyColumn("setCOMPANY_CD") && key.getsetCOMPANY_CD() != null) {
					msgKey.setKeyValue("setCOMPANY_CD", key.getsetCOMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("setVEND_CD") && key.getsetVEND_CD() != null) {
					msgKey.setKeyValue("setVEND_CD", key.getsetVEND_CD());
				}
				if(msgKeyType.containsKeyColumn("setJOB_ODR_CD") && key.getsetJOB_ODR_CD() != null) {
					msgKey.setKeyValue("setJOB_ODR_CD", key.getsetJOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("setJOB_ODR_DETAIL_NO") && key.getsetJOB_ODR_DETAIL_NO() != null) {
					msgKey.setKeyValue("setJOB_ODR_DETAIL_NO", key.getsetJOB_ODR_DETAIL_NO());
				}
				if(msgKeyType.containsKeyColumn("setPLANT_CD") && key.getsetPLANT_CD() != null) {
					msgKey.setKeyValue("setPLANT_CD", key.getsetPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("setISSUE_INST_CD") && key.getsetISSUE_INST_CD() != null) {
					msgKey.setKeyValue("setISSUE_INST_CD", key.getsetISSUE_INST_CD());
				}
				if(msgKeyType.containsKeyColumn("setMRP_ODR_TYP") && key.getsetMRP_ODR_TYP() != null) {
					msgKey.setKeyValue("setMRP_ODR_TYP", key.getsetMRP_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("setSUPPLIED_ISSUE_GNR_TYP") && key.getsetSUPPLIED_ISSUE_GNR_TYP() != null) {
					msgKey.setKeyValue("setSUPPLIED_ISSUE_GNR_TYP", key.getsetSUPPLIED_ISSUE_GNR_TYP());
				}
				if(msgKeyType.containsKeyColumn("setSUPPLIED_ISSUE_QTY") && key.getsetSUPPLIED_ISSUE_QTY() != null) {
					msgKey.setKeyValue("setSUPPLIED_ISSUE_QTY", key.getsetSUPPLIED_ISSUE_QTY());
				}
				if(msgKeyType.containsKeyColumn("setTOTAL_ISSUE_QTY") && key.getsetTOTAL_ISSUE_QTY() != null) {
					msgKey.setKeyValue("setTOTAL_ISSUE_QTY", key.getsetTOTAL_ISSUE_QTY());
				}
				if(msgKeyType.containsKeyColumn("setSUPPLIED_UNIT_DENOMINATOR") && key.getsetSUPPLIED_UNIT_DENOMINATOR() != null) {
					msgKey.setKeyValue("setSUPPLIED_UNIT_DENOMINATOR", key.getsetSUPPLIED_UNIT_DENOMINATOR());
				}
				if(msgKeyType.containsKeyColumn("setSUPPLIED_UNIT_NUMERATOR") && key.getsetSUPPLIED_UNIT_NUMERATOR() != null) {
					msgKey.setKeyValue("setSUPPLIED_UNIT_NUMERATOR", key.getsetSUPPLIED_UNIT_NUMERATOR());
				}
				if(msgKeyType.containsKeyColumn("setSUPPLIED_DATE") && key.getsetSUPPLIED_DATE() != null) {
					msgKey.setKeyValue("setSUPPLIED_DATE", key.getsetSUPPLIED_DATE());
				}
				if(msgKeyType.containsKeyColumn("setPART_SUPPLIED_COMMENT") && key.getsetPART_SUPPLIED_COMMENT() != null) {
					msgKey.setKeyValue("setPART_SUPPLIED_COMMENT", key.getsetPART_SUPPLIED_COMMENT());
				}
				if(msgKeyType.containsKeyColumn("readSTOCK_ON_HAND_QTY") && key.getreadSTOCK_ON_HAND_QTY() != null) {
					msgKey.setKeyValue("readSTOCK_ON_HAND_QTY", key.getreadSTOCK_ON_HAND_QTY());
				}
				if(msgKeyType.containsKeyColumn("setWH_CD") && key.getsetWH_CD() != null) {
					msgKey.setKeyValue("setWH_CD", key.getsetWH_CD());
				}
				if(msgKeyType.containsKeyColumn("readWH_CD") && key.getreadWH_CD() != null) {
					msgKey.setKeyValue("readWH_CD", key.getreadWH_CD());
				}
				if(msgKeyType.containsKeyColumn("setSTOCK_ON_HAND_QTY") && key.getsetSTOCK_ON_HAND_QTY() != null) {
					msgKey.setKeyValue("setSTOCK_ON_HAND_QTY", key.getsetSTOCK_ON_HAND_QTY());
				}
				if(msgKeyType.containsKeyColumn("setRCV_ISSUE_CTRL_CD") && key.getsetRCV_ISSUE_CTRL_CD() != null) {
					msgKey.setKeyValue("setRCV_ISSUE_CTRL_CD", key.getsetRCV_ISSUE_CTRL_CD());
				}
				if(msgKeyType.containsKeyColumn("setRCV_ISSUE_TYP") && key.getsetRCV_ISSUE_TYP() != null) {
					msgKey.setKeyValue("setRCV_ISSUE_TYP", key.getsetRCV_ISSUE_TYP());
				}
				if(msgKeyType.containsKeyColumn("setACPT_RSLT_CRCT_NO") && key.getsetACPT_RSLT_CRCT_NO() != null) {
					msgKey.setKeyValue("setACPT_RSLT_CRCT_NO", key.getsetACPT_RSLT_CRCT_NO());
				}
				if(msgKeyType.containsKeyColumn("setINSPEC_RSLT_CRCT_NO") && key.getsetINSPEC_RSLT_CRCT_NO() != null) {
					msgKey.setKeyValue("setINSPEC_RSLT_CRCT_NO", key.getsetINSPEC_RSLT_CRCT_NO());
				}
				if(msgKeyType.containsKeyColumn("setWORK_ODR_CD") && key.getsetWORK_ODR_CD() != null) {
					msgKey.setKeyValue("setWORK_ODR_CD", key.getsetWORK_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("setWORK_IN_PROC_CD") && key.getsetWORK_IN_PROC_CD() != null) {
					msgKey.setKeyValue("setWORK_IN_PROC_CD", key.getsetWORK_IN_PROC_CD());
				}
				if(msgKeyType.containsKeyColumn("setPARTIAL_PRD_NO") && key.getsetPARTIAL_PRD_NO() != null) {
					msgKey.setKeyValue("setPARTIAL_PRD_NO", key.getsetPARTIAL_PRD_NO());
				}
				if(msgKeyType.containsKeyColumn("setOPR_RSLT_CRCT_NO") && key.getsetOPR_RSLT_CRCT_NO() != null) {
					msgKey.setKeyValue("setOPR_RSLT_CRCT_NO", key.getsetOPR_RSLT_CRCT_NO());
				}
				if(msgKeyType.containsKeyColumn("setRCV_ISSUE_BEFORE_QTY") && key.getsetRCV_ISSUE_BEFORE_QTY() != null) {
					msgKey.setKeyValue("setRCV_ISSUE_BEFORE_QTY", key.getsetRCV_ISSUE_BEFORE_QTY());
				}
				if(msgKeyType.containsKeyColumn("setRCV_ISSUE_QTY") && key.getsetRCV_ISSUE_QTY() != null) {
					msgKey.setKeyValue("setRCV_ISSUE_QTY", key.getsetRCV_ISSUE_QTY());
				}
				if(msgKeyType.containsKeyColumn("setRCV_ISSUE_AFTER_QTY") && key.getsetRCV_ISSUE_AFTER_QTY() != null) {
					msgKey.setKeyValue("setRCV_ISSUE_AFTER_QTY", key.getsetRCV_ISSUE_AFTER_QTY());
				}
				if(msgKeyType.containsKeyColumn("setRCV_ISSUE_AMOUNT") && key.getsetRCV_ISSUE_AMOUNT() != null) {
					msgKey.setKeyValue("setRCV_ISSUE_AMOUNT", key.getsetRCV_ISSUE_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("setRCV_ISSUE_DATE") && key.getsetRCV_ISSUE_DATE() != null) {
					msgKey.setKeyValue("setRCV_ISSUE_DATE", key.getsetRCV_ISSUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("setRCV_ISSUE_GNR_TYP") && key.getsetRCV_ISSUE_GNR_TYP() != null) {
					msgKey.setKeyValue("setRCV_ISSUE_GNR_TYP", key.getsetRCV_ISSUE_GNR_TYP());
				}
				if(msgKeyType.containsKeyColumn("setRCV_ISSUE_ODD_QTY") && key.getsetRCV_ISSUE_ODD_QTY() != null) {
					msgKey.setKeyValue("setRCV_ISSUE_ODD_QTY", key.getsetRCV_ISSUE_ODD_QTY());
				}
				if(msgKeyType.containsKeyColumn("setDEFECT_CAUSE_CD") && key.getsetDEFECT_CAUSE_CD() != null) {
					msgKey.setKeyValue("setDEFECT_CAUSE_CD", key.getsetDEFECT_CAUSE_CD());
				}
				if(msgKeyType.containsKeyColumn("setSTOCK_UPD_TYP") && key.getsetSTOCK_UPD_TYP() != null) {
					msgKey.setKeyValue("setSTOCK_UPD_TYP", key.getsetSTOCK_UPD_TYP());
				}
				if(msgKeyType.containsKeyColumn("setRCV_ISSUE_CMPLT_FLG") && key.getsetRCV_ISSUE_CMPLT_FLG() != null) {
					msgKey.setKeyValue("setRCV_ISSUE_CMPLT_FLG", key.getsetRCV_ISSUE_CMPLT_FLG());
				}
				if(msgKeyType.containsKeyColumn("setOD_NO") && key.getsetOD_NO() != null) {
					msgKey.setKeyValue("setOD_NO", key.getsetOD_NO());
				}
				if(msgKeyType.containsKeyColumn("setLOT_NO") && key.getsetLOT_NO() != null) {
					msgKey.setKeyValue("setLOT_NO", key.getsetLOT_NO());
				}
				if(msgKeyType.containsKeyColumn("setVEND_LOT_NO") && key.getsetVEND_LOT_NO() != null) {
					msgKey.setKeyValue("setVEND_LOT_NO", key.getsetVEND_LOT_NO());
				}
				if(msgKeyType.containsKeyColumn("setRCV_ISSUE_COMMENT") && key.getsetRCV_ISSUE_COMMENT() != null) {
					msgKey.setKeyValue("setRCV_ISSUE_COMMENT", key.getsetRCV_ISSUE_COMMENT());
				}
				if(msgKeyType.containsKeyColumn("setCONS_TYP") && key.getsetCONS_TYP() != null) {
					msgKey.setKeyValue("setCONS_TYP", key.getsetCONS_TYP());
				}
				if(msgKeyType.containsKeyColumn("setCONS_EXEC_DATE") && key.getsetCONS_EXEC_DATE() != null) {
					msgKey.setKeyValue("setCONS_EXEC_DATE", key.getsetCONS_EXEC_DATE());
				}
				if(msgKeyType.containsKeyColumn("THIS_MONTH") && key.getTHIS_MONTH() != null) {
					msgKey.setKeyValue("THIS_MONTH", key.getTHIS_MONTH());
				}
				if(msgKeyType.containsKeyColumn("INSTALL_FLG") && key.getINSTALL_FLG() != null) {
					msgKey.setKeyValue("INSTALL_FLG", key.getINSTALL_FLG());
				}
				if(msgKeyType.containsKeyColumn("readSUPPLIED_ISSUE_QTY") && key.getreadSUPPLIED_ISSUE_QTY() != null) {
					msgKey.setKeyValue("readSUPPLIED_ISSUE_QTY", key.getreadSUPPLIED_ISSUE_QTY());
				}
				if(msgKeyType.containsKeyColumn("readTOTAL_ISSUE_QTY") && key.getreadTOTAL_ISSUE_QTY() != null) {
					msgKey.setKeyValue("readTOTAL_ISSUE_QTY", key.getreadTOTAL_ISSUE_QTY());
				}
				if(msgKeyType.containsKeyColumn("readSUPPLIED_UNIT_DENOMINATOR") && key.getreadSUPPLIED_UNIT_DENOMINATOR() != null) {
					msgKey.setKeyValue("readSUPPLIED_UNIT_DENOMINATOR", key.getreadSUPPLIED_UNIT_DENOMINATOR());
				}
				if(msgKeyType.containsKeyColumn("readSUPPLIED_UNIT_NUMERATOR") && key.getreadSUPPLIED_UNIT_NUMERATOR() != null) {
					msgKey.setKeyValue("readSUPPLIED_UNIT_NUMERATOR", key.getreadSUPPLIED_UNIT_NUMERATOR());
				}
				if(msgKeyType.containsKeyColumn("PAST_RESULT_ENTRY_TYP") && key.getPAST_RESULT_ENTRY_TYP() != null) {
					msgKey.setKeyValue("PAST_RESULT_ENTRY_TYP", key.getPAST_RESULT_ENTRY_TYP());
				}
				if(msgKeyType.containsKeyColumn("INSPC_WH_NAME") && key.getINSPC_WH_NAME() != null) {
					msgKey.setKeyValue("INSPC_WH_NAME", key.getINSPC_WH_NAME());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_INST_CD") && key.getISSUE_INST_CD() != null) {
					msgKey.setKeyValue("ISSUE_INST_CD", key.getISSUE_INST_CD());
				}
				if(msgKeyType.containsKeyColumn("readLOT_NO") && key.getreadLOT_NO() != null) {
					msgKey.setKeyValue("readLOT_NO", key.getreadLOT_NO());
				}
				if(msgKeyType.containsKeyColumn("readQTY") && key.getreadQTY() != null) {
					msgKey.setKeyValue("readQTY", key.getreadQTY());
				}
				if(msgKeyType.containsKeyColumn("BEST_BEFORE_DATE") && key.getBEST_BEFORE_DATE() != null) {
					msgKey.setKeyValue("BEST_BEFORE_DATE", key.getBEST_BEFORE_DATE());
				}
				if(msgKeyType.containsKeyColumn("setSEQ_NO") && key.getsetSEQ_NO() != null) {
					msgKey.setKeyValue("setSEQ_NO", key.getsetSEQ_NO());
				}
				if(msgKeyType.containsKeyColumn("readSUPPLIED_DATE") && key.getreadSUPPLIED_DATE() != null) {
					msgKey.setKeyValue("readSUPPLIED_DATE", key.getreadSUPPLIED_DATE());
				}
				if(msgKeyType.containsKeyColumn("setSPENT_QTY") && key.getsetSPENT_QTY() != null) {
					msgKey.setKeyValue("setSPENT_QTY", key.getsetSPENT_QTY());
				}
				if(msgKeyType.containsKeyColumn("NEXTVAL") && key.getNEXTVAL() != null) {
					msgKey.setKeyValue("NEXTVAL", key.getNEXTVAL());
				}
				if(msgKeyType.containsKeyColumn("OD_NO") && key.getOD_NO() != null) {
					msgKey.setKeyValue("OD_NO", key.getOD_NO());
				}
				if(msgKeyType.containsKeyColumn("ODR_QTY") && key.getODR_QTY() != null) {
					msgKey.setKeyValue("ODR_QTY", key.getODR_QTY());
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
				if(msgKeyType.containsKeyColumn("FROM_PUCH_ODR_CD") && key.getFROM_PUCH_ODR_CD() != null) {
					msgKey.setKeyValue("FROM_PUCH_ODR_CD", key.getFROM_PUCH_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("TO_PUCH_ODR_CD") && key.getTO_PUCH_ODR_CD() != null) {
					msgKey.setKeyValue("TO_PUCH_ODR_CD", key.getTO_PUCH_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("FROM_ITEM_CD") && key.getFROM_ITEM_CD() != null) {
					msgKey.setKeyValue("FROM_ITEM_CD", key.getFROM_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("FROM_LOT_NO") && key.getFROM_LOT_NO() != null) {
					msgKey.setKeyValue("FROM_LOT_NO", key.getFROM_LOT_NO());
				}
				if(msgKeyType.containsKeyColumn("TO_ITEM_CD") && key.getTO_ITEM_CD() != null) {
					msgKey.setKeyValue("TO_ITEM_CD", key.getTO_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("TO_LOT_NO") && key.getTO_LOT_NO() != null) {
					msgKey.setKeyValue("TO_LOT_NO", key.getTO_LOT_NO());
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
					AE0060010Struct key = new AE0060010Struct();
					if(msgKeyType.containsKeyColumn("h_PUCH_ODR_CD")) {
						key.seth_PUCH_ODR_CD(msgKey.getKeyValue("h_PUCH_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("c_COMPLETE")) {
						key.setc_COMPLETE(msgKey.getKeyValue("c_COMPLETE"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_COST_TYP_name")) {
						key.setUNIT_COST_TYP_name(msgKey.getKeyValue("UNIT_COST_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_COST_TYP_val")) {
						key.setUNIT_COST_TYP_val(msgKey.getKeyValue("UNIT_COST_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("HOME_CUR_UNIT")) {
						key.setHOME_CUR_UNIT(msgKey.getKeyValue("HOME_CUR_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("ACPT_INSPC_TYP_DN")) {
						key.setACPT_INSPC_TYP_DN(msgKey.getKeyValue("ACPT_INSPC_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("SPL_ITEM_TYP_DN")) {
						key.setSPL_ITEM_TYP_DN(msgKey.getKeyValue("SPL_ITEM_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("PRODUCT_TYP_DN")) {
						key.setPRODUCT_TYP_DN(msgKey.getKeyValue("PRODUCT_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_STS_TYP_DN")) {
						key.setPUCH_ODR_STS_TYP_DN(msgKey.getKeyValue("PUCH_ODR_STS_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("NON_NO_ITEM_FLG_DN")) {
						key.setNON_NO_ITEM_FLG_DN(msgKey.getKeyValue("NON_NO_ITEM_FLG_DN"));
					}
					if(msgKeyType.containsKeyColumn("INSPC_CMPLT_FLG_DN")) {
						key.setINSPC_CMPLT_FLG_DN(msgKey.getKeyValue("INSPC_CMPLT_FLG_DN"));
					}
					if(msgKeyType.containsKeyColumn("SelectUnitCostFlag")) {
						key.setSelectUnitCostFlag(msgKey.getKeyValue("SelectUnitCostFlag"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP_DN")) {
						key.setUNIT_QTY_TYP_DN(msgKey.getKeyValue("UNIT_QTY_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("c_CANCEL")) {
						key.setc_CANCEL(msgKey.getKeyValue("c_CANCEL"));
					}
					if(msgKeyType.containsKeyColumn("h_ACPT_QTY")) {
						key.seth_ACPT_QTY(msgKey.getKeyValue("h_ACPT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("h_ODR_CANCEL_SLIP_ISS_FLG")) {
						key.seth_ODR_CANCEL_SLIP_ISS_FLG(msgKey.getKeyValue("h_ODR_CANCEL_SLIP_ISS_FLG"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD_DW")) {
						key.setITEM_CD_DW(msgKey.getKeyValue("ITEM_CD_DW"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_NAME_DW")) {
						key.setITEM_NAME_DW(msgKey.getKeyValue("ITEM_NAME_DW"));
					}
					if(msgKeyType.containsKeyColumn("h_LOTCTRL")) {
						key.seth_LOTCTRL(msgKey.getKeyValue("h_LOTCTRL"));
					}
					if(msgKeyType.containsKeyColumn("param1")) {
						key.setparam1(msgKey.getKeyValue("param1"));
					}
					if(msgKeyType.containsKeyColumn("param2")) {
						key.setparam2(msgKey.getKeyValue("param2"));
					}
					if(msgKeyType.containsKeyColumn("param3")) {
						key.setparam3(msgKey.getKeyValue("param3"));
					}
					if(msgKeyType.containsKeyColumn("h_LOT_NO")) {
						key.seth_LOT_NO(msgKey.getKeyValue("h_LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("h_PUCH_ODR_CD_1")) {
						key.seth_PUCH_ODR_CD_1(msgKey.getKeyValue("h_PUCH_ODR_CD_1"));
					}
					if(msgKeyType.containsKeyColumn("HOME_DECIMAL_FIG")) {
						key.setHOME_DECIMAL_FIG(msgKey.getKeyValue("HOME_DECIMAL_FIG"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_CD")) {
						key.setPUCH_ODR_CD(msgKey.getKeyValue("PUCH_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("ACPT_NO")) {
						key.setACPT_NO(msgKey.getKeyValue("ACPT_NO"));
					}
					if(msgKeyType.containsKeyColumn("ACPT_QTY")) {
						key.setACPT_QTY(msgKey.getKeyValue("ACPT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT")) {
						key.setSTOCK_UNIT(msgKey.getKeyValue("STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("NON_NO_ITEM_NAME")) {
						key.setNON_NO_ITEM_NAME(msgKey.getKeyValue("NON_NO_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ACPT_DATE")) {
						key.setACPT_DATE(msgKey.getKeyValue("ACPT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("VEND_LOT_NO")) {
						key.setVEND_LOT_NO(msgKey.getKeyValue("VEND_LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("WH_CD")) {
						key.setWH_CD(msgKey.getKeyValue("WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("WH_NAME")) {
						key.setWH_NAME(msgKey.getKeyValue("WH_NAME"));
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
					if(msgKeyType.containsKeyColumn("TAX_AMOUNT_1")) {
						key.setTAX_AMOUNT_1(msgKey.getKeyValue("TAX_AMOUNT_1"));
					}
					if(msgKeyType.containsKeyColumn("TAX_AMOUNT_2")) {
						key.setTAX_AMOUNT_2(msgKey.getKeyValue("TAX_AMOUNT_2"));
					}
					if(msgKeyType.containsKeyColumn("TAX_AMOUNT_3")) {
						key.setTAX_AMOUNT_3(msgKey.getKeyValue("TAX_AMOUNT_3"));
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
					if(msgKeyType.containsKeyColumn("AMOUNT_INCLUDE_TAX")) {
						key.setAMOUNT_INCLUDE_TAX(msgKey.getKeyValue("AMOUNT_INCLUDE_TAX"));
					}
					if(msgKeyType.containsKeyColumn("HOME_CUR_AMOUNT")) {
						key.setHOME_CUR_AMOUNT(msgKey.getKeyValue("HOME_CUR_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("EXCH_RATE")) {
						key.setEXCH_RATE(msgKey.getKeyValue("EXCH_RATE"));
					}
					if(msgKeyType.containsKeyColumn("DLV_CD")) {
						key.setDLV_CD(msgKey.getKeyValue("DLV_CD"));
					}
					if(msgKeyType.containsKeyColumn("ACPT_RSLT_COMMENT")) {
						key.setACPT_RSLT_COMMENT(msgKey.getKeyValue("ACPT_RSLT_COMMENT"));
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
					if(msgKeyType.containsKeyColumn("DRAW_CD")) {
						key.setDRAW_CD(msgKey.getKeyValue("DRAW_CD"));
					}
					if(msgKeyType.containsKeyColumn("SPEC")) {
						key.setSPEC(msgKey.getKeyValue("SPEC"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP")) {
						key.setUNIT_QTY_TYP(msgKey.getKeyValue("UNIT_QTY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("VEND_CD")) {
						key.setVEND_CD(msgKey.getKeyValue("VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("VEND_NAME")) {
						key.setVEND_NAME(msgKey.getKeyValue("VEND_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_QTY")) {
						key.setPUCH_ODR_QTY(msgKey.getKeyValue("PUCH_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("SUM_ACPT_QTY")) {
						key.setSUM_ACPT_QTY(msgKey.getKeyValue("SUM_ACPT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("ACPT_INSPC_TYP")) {
						key.setACPT_INSPC_TYP(msgKey.getKeyValue("ACPT_INSPC_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_SLIP_ISS_DATE")) {
						key.setPUCH_ODR_SLIP_ISS_DATE(msgKey.getKeyValue("PUCH_ODR_SLIP_ISS_DATE"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_DLV_DATE")) {
						key.setPUCH_ODR_DLV_DATE(msgKey.getKeyValue("PUCH_ODR_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("CONFIRM_DLV_DATE")) {
						key.setCONFIRM_DLV_DATE(msgKey.getKeyValue("CONFIRM_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("WORK_IN_PROC_CD")) {
						key.setWORK_IN_PROC_CD(msgKey.getKeyValue("WORK_IN_PROC_CD"));
					}
					if(msgKeyType.containsKeyColumn("PROC_NAME")) {
						key.setPROC_NAME(msgKey.getKeyValue("PROC_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_PERSON")) {
						key.setPUCH_ODR_PERSON(msgKey.getKeyValue("PUCH_ODR_PERSON"));
					}
					if(msgKeyType.containsKeyColumn("USER_NAME")) {
						key.setUSER_NAME(msgKey.getKeyValue("USER_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_STS_TYP")) {
						key.setPUCH_ODR_STS_TYP(msgKey.getKeyValue("PUCH_ODR_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("INSPC_CMPLT_FLG")) {
						key.setINSPC_CMPLT_FLG(msgKey.getKeyValue("INSPC_CMPLT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("SPL_ITEM_TYP")) {
						key.setSPL_ITEM_TYP(msgKey.getKeyValue("SPL_ITEM_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PRODUCT_TYP")) {
						key.setPRODUCT_TYP(msgKey.getKeyValue("PRODUCT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("NON_NO_ITEM_FLG")) {
						key.setNON_NO_ITEM_FLG(msgKey.getKeyValue("NON_NO_ITEM_FLG"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("COMPANY_CD")) {
						key.setCOMPANY_CD(msgKey.getKeyValue("COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("TAX_CD")) {
						key.setTAX_CD(msgKey.getKeyValue("TAX_CD"));
					}
					if(msgKeyType.containsKeyColumn("ROUND_TYP")) {
						key.setROUND_TYP(msgKey.getKeyValue("ROUND_TYP"));
					}
					if(msgKeyType.containsKeyColumn("TAX_ROUND_TYP")) {
						key.setTAX_ROUND_TYP(msgKey.getKeyValue("TAX_ROUND_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_START_DATE")) {
						key.setPUCH_ODR_START_DATE(msgKey.getKeyValue("PUCH_ODR_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("BUSINESS_OPR_DATE")) {
						key.setBUSINESS_OPR_DATE(msgKey.getKeyValue("BUSINESS_OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_MODIFY_COUNT")) {
						key.setPUCH_ODR_MODIFY_COUNT(msgKey.getKeyValue("PUCH_ODR_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("ODR_CANCEL_CAUSE_CD")) {
						key.setODR_CANCEL_CAUSE_CD(msgKey.getKeyValue("ODR_CANCEL_CAUSE_CD"));
					}
					if(msgKeyType.containsKeyColumn("ODR_CANCEL_SLIP_ISS_FLG")) {
						key.setODR_CANCEL_SLIP_ISS_FLG(msgKey.getKeyValue("ODR_CANCEL_SLIP_ISS_FLG"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_COMMENT")) {
						key.setPUCH_ODR_COMMENT(msgKey.getKeyValue("PUCH_ODR_COMMENT"));
					}
					if(msgKeyType.containsKeyColumn("h_LOT_CTRL_FLG")) {
						key.seth_LOT_CTRL_FLG(msgKey.getKeyValue("h_LOT_CTRL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("h_LOT_NUMBERING_TYP")) {
						key.seth_LOT_NUMBERING_TYP(msgKey.getKeyValue("h_LOT_NUMBERING_TYP"));
					}
					if(msgKeyType.containsKeyColumn("h_WORK_ODR_CD")) {
						key.seth_WORK_ODR_CD(msgKey.getKeyValue("h_WORK_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_FINAL_PROC_CD")) {
						key.seth_FINAL_PROC_CD(msgKey.getKeyValue("h_FINAL_PROC_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_DATE_FLG")) {
						key.seth_DATE_FLG(msgKey.getKeyValue("h_DATE_FLG"));
					}
					if(msgKeyType.containsKeyColumn("ACPT_STS_TYP")) {
						key.setACPT_STS_TYP(msgKey.getKeyValue("ACPT_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("INSPC_WH_CD")) {
						key.setINSPC_WH_CD(msgKey.getKeyValue("INSPC_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("LOT_NO")) {
						key.setLOT_NO(msgKey.getKeyValue("LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("INSPC_CMPLT_DATE")) {
						key.setINSPC_CMPLT_DATE(msgKey.getKeyValue("INSPC_CMPLT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("readISSUE_INST_CD")) {
						key.setreadISSUE_INST_CD(msgKey.getKeyValue("readISSUE_INST_CD"));
					}
					if(msgKeyType.containsKeyColumn("readPLANT_CD")) {
						key.setreadPLANT_CD(msgKey.getKeyValue("readPLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("readOD_NO")) {
						key.setreadOD_NO(msgKey.getKeyValue("readOD_NO"));
					}
					if(msgKeyType.containsKeyColumn("readITEM_CD")) {
						key.setreadITEM_CD(msgKey.getKeyValue("readITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("readPUCH_ODR_CD")) {
						key.setreadPUCH_ODR_CD(msgKey.getKeyValue("readPUCH_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("readCOMPANY_CD")) {
						key.setreadCOMPANY_CD(msgKey.getKeyValue("readCOMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("readVEND_CD")) {
						key.setreadVEND_CD(msgKey.getKeyValue("readVEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("readCONS_TYP")) {
						key.setreadCONS_TYP(msgKey.getKeyValue("readCONS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("readISSUE_INST_UNIT_DENOMINATOR")) {
						key.setreadISSUE_INST_UNIT_DENOMINATOR(msgKey.getKeyValue("readISSUE_INST_UNIT_DENOMINATOR"));
					}
					if(msgKeyType.containsKeyColumn("readISSUE_INST_UNIT_NUMERATOR")) {
						key.setreadISSUE_INST_UNIT_NUMERATOR(msgKey.getKeyValue("readISSUE_INST_UNIT_NUMERATOR"));
					}
					if(msgKeyType.containsKeyColumn("readJOB_ODR_CD")) {
						key.setreadJOB_ODR_CD(msgKey.getKeyValue("readJOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("readJOB_ODR_DETAIL_NO")) {
						key.setreadJOB_ODR_DETAIL_NO(msgKey.getKeyValue("readJOB_ODR_DETAIL_NO"));
					}
					if(msgKeyType.containsKeyColumn("readMRP_ODR_TYP")) {
						key.setreadMRP_ODR_TYP(msgKey.getKeyValue("readMRP_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("readUNIT_QTY_TYP")) {
						key.setreadUNIT_QTY_TYP(msgKey.getKeyValue("readUNIT_QTY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("readLOT_CONTROL_FLG")) {
						key.setreadLOT_CONTROL_FLG(msgKey.getKeyValue("readLOT_CONTROL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("setPUCH_ODR_CD")) {
						key.setsetPUCH_ODR_CD(msgKey.getKeyValue("setPUCH_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("setACPT_NO")) {
						key.setsetACPT_NO(msgKey.getKeyValue("setACPT_NO"));
					}
					if(msgKeyType.containsKeyColumn("setITEM_CD")) {
						key.setsetITEM_CD(msgKey.getKeyValue("setITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("setACPT_QTY")) {
						key.setsetACPT_QTY(msgKey.getKeyValue("setACPT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("setCOMPANY_CD")) {
						key.setsetCOMPANY_CD(msgKey.getKeyValue("setCOMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("setVEND_CD")) {
						key.setsetVEND_CD(msgKey.getKeyValue("setVEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("setJOB_ODR_CD")) {
						key.setsetJOB_ODR_CD(msgKey.getKeyValue("setJOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("setJOB_ODR_DETAIL_NO")) {
						key.setsetJOB_ODR_DETAIL_NO(msgKey.getKeyValue("setJOB_ODR_DETAIL_NO"));
					}
					if(msgKeyType.containsKeyColumn("setPLANT_CD")) {
						key.setsetPLANT_CD(msgKey.getKeyValue("setPLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("setISSUE_INST_CD")) {
						key.setsetISSUE_INST_CD(msgKey.getKeyValue("setISSUE_INST_CD"));
					}
					if(msgKeyType.containsKeyColumn("setMRP_ODR_TYP")) {
						key.setsetMRP_ODR_TYP(msgKey.getKeyValue("setMRP_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("setSUPPLIED_ISSUE_GNR_TYP")) {
						key.setsetSUPPLIED_ISSUE_GNR_TYP(msgKey.getKeyValue("setSUPPLIED_ISSUE_GNR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("setSUPPLIED_ISSUE_QTY")) {
						key.setsetSUPPLIED_ISSUE_QTY(msgKey.getKeyValue("setSUPPLIED_ISSUE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("setTOTAL_ISSUE_QTY")) {
						key.setsetTOTAL_ISSUE_QTY(msgKey.getKeyValue("setTOTAL_ISSUE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("setSUPPLIED_UNIT_DENOMINATOR")) {
						key.setsetSUPPLIED_UNIT_DENOMINATOR(msgKey.getKeyValue("setSUPPLIED_UNIT_DENOMINATOR"));
					}
					if(msgKeyType.containsKeyColumn("setSUPPLIED_UNIT_NUMERATOR")) {
						key.setsetSUPPLIED_UNIT_NUMERATOR(msgKey.getKeyValue("setSUPPLIED_UNIT_NUMERATOR"));
					}
					if(msgKeyType.containsKeyColumn("setSUPPLIED_DATE")) {
						key.setsetSUPPLIED_DATE(msgKey.getKeyValue("setSUPPLIED_DATE"));
					}
					if(msgKeyType.containsKeyColumn("setPART_SUPPLIED_COMMENT")) {
						key.setsetPART_SUPPLIED_COMMENT(msgKey.getKeyValue("setPART_SUPPLIED_COMMENT"));
					}
					if(msgKeyType.containsKeyColumn("readSTOCK_ON_HAND_QTY")) {
						key.setreadSTOCK_ON_HAND_QTY(msgKey.getKeyValue("readSTOCK_ON_HAND_QTY"));
					}
					if(msgKeyType.containsKeyColumn("setWH_CD")) {
						key.setsetWH_CD(msgKey.getKeyValue("setWH_CD"));
					}
					if(msgKeyType.containsKeyColumn("readWH_CD")) {
						key.setreadWH_CD(msgKey.getKeyValue("readWH_CD"));
					}
					if(msgKeyType.containsKeyColumn("setSTOCK_ON_HAND_QTY")) {
						key.setsetSTOCK_ON_HAND_QTY(msgKey.getKeyValue("setSTOCK_ON_HAND_QTY"));
					}
					if(msgKeyType.containsKeyColumn("setRCV_ISSUE_CTRL_CD")) {
						key.setsetRCV_ISSUE_CTRL_CD(msgKey.getKeyValue("setRCV_ISSUE_CTRL_CD"));
					}
					if(msgKeyType.containsKeyColumn("setRCV_ISSUE_TYP")) {
						key.setsetRCV_ISSUE_TYP(msgKey.getKeyValue("setRCV_ISSUE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("setACPT_RSLT_CRCT_NO")) {
						key.setsetACPT_RSLT_CRCT_NO(msgKey.getKeyValue("setACPT_RSLT_CRCT_NO"));
					}
					if(msgKeyType.containsKeyColumn("setINSPEC_RSLT_CRCT_NO")) {
						key.setsetINSPEC_RSLT_CRCT_NO(msgKey.getKeyValue("setINSPEC_RSLT_CRCT_NO"));
					}
					if(msgKeyType.containsKeyColumn("setWORK_ODR_CD")) {
						key.setsetWORK_ODR_CD(msgKey.getKeyValue("setWORK_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("setWORK_IN_PROC_CD")) {
						key.setsetWORK_IN_PROC_CD(msgKey.getKeyValue("setWORK_IN_PROC_CD"));
					}
					if(msgKeyType.containsKeyColumn("setPARTIAL_PRD_NO")) {
						key.setsetPARTIAL_PRD_NO(msgKey.getKeyValue("setPARTIAL_PRD_NO"));
					}
					if(msgKeyType.containsKeyColumn("setOPR_RSLT_CRCT_NO")) {
						key.setsetOPR_RSLT_CRCT_NO(msgKey.getKeyValue("setOPR_RSLT_CRCT_NO"));
					}
					if(msgKeyType.containsKeyColumn("setRCV_ISSUE_BEFORE_QTY")) {
						key.setsetRCV_ISSUE_BEFORE_QTY(msgKey.getKeyValue("setRCV_ISSUE_BEFORE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("setRCV_ISSUE_QTY")) {
						key.setsetRCV_ISSUE_QTY(msgKey.getKeyValue("setRCV_ISSUE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("setRCV_ISSUE_AFTER_QTY")) {
						key.setsetRCV_ISSUE_AFTER_QTY(msgKey.getKeyValue("setRCV_ISSUE_AFTER_QTY"));
					}
					if(msgKeyType.containsKeyColumn("setRCV_ISSUE_AMOUNT")) {
						key.setsetRCV_ISSUE_AMOUNT(msgKey.getKeyValue("setRCV_ISSUE_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("setRCV_ISSUE_DATE")) {
						key.setsetRCV_ISSUE_DATE(msgKey.getKeyValue("setRCV_ISSUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("setRCV_ISSUE_GNR_TYP")) {
						key.setsetRCV_ISSUE_GNR_TYP(msgKey.getKeyValue("setRCV_ISSUE_GNR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("setRCV_ISSUE_ODD_QTY")) {
						key.setsetRCV_ISSUE_ODD_QTY(msgKey.getKeyValue("setRCV_ISSUE_ODD_QTY"));
					}
					if(msgKeyType.containsKeyColumn("setDEFECT_CAUSE_CD")) {
						key.setsetDEFECT_CAUSE_CD(msgKey.getKeyValue("setDEFECT_CAUSE_CD"));
					}
					if(msgKeyType.containsKeyColumn("setSTOCK_UPD_TYP")) {
						key.setsetSTOCK_UPD_TYP(msgKey.getKeyValue("setSTOCK_UPD_TYP"));
					}
					if(msgKeyType.containsKeyColumn("setRCV_ISSUE_CMPLT_FLG")) {
						key.setsetRCV_ISSUE_CMPLT_FLG(msgKey.getKeyValue("setRCV_ISSUE_CMPLT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("setOD_NO")) {
						key.setsetOD_NO(msgKey.getKeyValue("setOD_NO"));
					}
					if(msgKeyType.containsKeyColumn("setLOT_NO")) {
						key.setsetLOT_NO(msgKey.getKeyValue("setLOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("setVEND_LOT_NO")) {
						key.setsetVEND_LOT_NO(msgKey.getKeyValue("setVEND_LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("setRCV_ISSUE_COMMENT")) {
						key.setsetRCV_ISSUE_COMMENT(msgKey.getKeyValue("setRCV_ISSUE_COMMENT"));
					}
					if(msgKeyType.containsKeyColumn("setCONS_TYP")) {
						key.setsetCONS_TYP(msgKey.getKeyValue("setCONS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("setCONS_EXEC_DATE")) {
						key.setsetCONS_EXEC_DATE(msgKey.getKeyValue("setCONS_EXEC_DATE"));
					}
					if(msgKeyType.containsKeyColumn("THIS_MONTH")) {
						key.setTHIS_MONTH(msgKey.getKeyValue("THIS_MONTH"));
					}
					if(msgKeyType.containsKeyColumn("INSTALL_FLG")) {
						key.setINSTALL_FLG(msgKey.getKeyValue("INSTALL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("readSUPPLIED_ISSUE_QTY")) {
						key.setreadSUPPLIED_ISSUE_QTY(msgKey.getKeyValue("readSUPPLIED_ISSUE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("readTOTAL_ISSUE_QTY")) {
						key.setreadTOTAL_ISSUE_QTY(msgKey.getKeyValue("readTOTAL_ISSUE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("readSUPPLIED_UNIT_DENOMINATOR")) {
						key.setreadSUPPLIED_UNIT_DENOMINATOR(msgKey.getKeyValue("readSUPPLIED_UNIT_DENOMINATOR"));
					}
					if(msgKeyType.containsKeyColumn("readSUPPLIED_UNIT_NUMERATOR")) {
						key.setreadSUPPLIED_UNIT_NUMERATOR(msgKey.getKeyValue("readSUPPLIED_UNIT_NUMERATOR"));
					}
					if(msgKeyType.containsKeyColumn("PAST_RESULT_ENTRY_TYP")) {
						key.setPAST_RESULT_ENTRY_TYP(msgKey.getKeyValue("PAST_RESULT_ENTRY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("INSPC_WH_NAME")) {
						key.setINSPC_WH_NAME(msgKey.getKeyValue("INSPC_WH_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_INST_CD")) {
						key.setISSUE_INST_CD(msgKey.getKeyValue("ISSUE_INST_CD"));
					}
					if(msgKeyType.containsKeyColumn("readLOT_NO")) {
						key.setreadLOT_NO(msgKey.getKeyValue("readLOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("readQTY")) {
						key.setreadQTY(msgKey.getKeyValue("readQTY"));
					}
					if(msgKeyType.containsKeyColumn("BEST_BEFORE_DATE")) {
						key.setBEST_BEFORE_DATE(msgKey.getKeyValue("BEST_BEFORE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("setSEQ_NO")) {
						key.setsetSEQ_NO(msgKey.getKeyValue("setSEQ_NO"));
					}
					if(msgKeyType.containsKeyColumn("readSUPPLIED_DATE")) {
						key.setreadSUPPLIED_DATE(msgKey.getKeyValue("readSUPPLIED_DATE"));
					}
					if(msgKeyType.containsKeyColumn("setSPENT_QTY")) {
						key.setsetSPENT_QTY(msgKey.getKeyValue("setSPENT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("NEXTVAL")) {
						key.setNEXTVAL(msgKey.getKeyValue("NEXTVAL"));
					}
					if(msgKeyType.containsKeyColumn("OD_NO")) {
						key.setOD_NO(msgKey.getKeyValue("OD_NO"));
					}
					if(msgKeyType.containsKeyColumn("ODR_QTY")) {
						key.setODR_QTY(msgKey.getKeyValue("ODR_QTY"));
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
					if(msgKeyType.containsKeyColumn("FROM_PUCH_ODR_CD")) {
						key.setFROM_PUCH_ODR_CD(msgKey.getKeyValue("FROM_PUCH_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("TO_PUCH_ODR_CD")) {
						key.setTO_PUCH_ODR_CD(msgKey.getKeyValue("TO_PUCH_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("FROM_ITEM_CD")) {
						key.setFROM_ITEM_CD(msgKey.getKeyValue("FROM_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("FROM_LOT_NO")) {
						key.setFROM_LOT_NO(msgKey.getKeyValue("FROM_LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("TO_ITEM_CD")) {
						key.setTO_ITEM_CD(msgKey.getKeyValue("TO_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("TO_LOT_NO")) {
						key.setTO_LOT_NO(msgKey.getKeyValue("TO_LOT_NO"));
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
