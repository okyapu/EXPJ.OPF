/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KQ0010/src/com/nec/jp/orteus/metamorBase/KQ0010/KQ0010010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.KQ0010;

import com.nec.jp.orteus.metamorBase.KQ0010.*;
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
import java.text.SimpleDateFormat;
import java.text.ParseException;

import utils.system;

import com.nec.jp.orteus.metamorBase.common.CollectNumber.Numbering;
import com.nec.jp.orteus.metamorBase.common06.ExchAmount.*;
import com.nec.jp.orteus.expj.util.PrivateConfig;
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class KQ0010010Control
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
	public KQ0010010Struct getListvalue(int x) {
		return (KQ0010010Struct) (this.list.get(x));
	} // リストの値を返します。
	public KQ0010010Struct getStruct() {
		return this.struct;
	} // Structを返します。
	public KQ0010010Struct createStruct() {
		return new KQ0010010Struct();
	} // 新しいStructを作って返します。
	public void setStruct(Object structname) {
		this.struct.setStruct((KQ0010010Struct) structname);
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
	/** 会社コード */
	private String _companyCd;
	// 会社コードをゲット
	public String get_companyCd() {
		return _companyCd;
	}
	// 会社コードをセット
	public void set_companyCd(String cd) {
		_companyCd = cd;
	}
	/** 販売管理用工場コード */
	private String _plantWeb;
	// 販売管理用工場コードをゲット
	public String get_plantWeb() {
		return _plantWeb;
	}
	// 販売管理用工場コードをセット
	public void set_plantWeb(String web) {
		_plantWeb = web;
	}
	/** 業務運用日 */
	private String _businessOprDate;
    // 業務運用日をゲット
	public String get_businessOprDate() {
		return _businessOprDate;
	}
	// 業務運用日をセット	
	public void set_businessOprDate(String oprDate) {
		_businessOprDate = oprDate;
	}
	/** 邦貨コード */
	private String _homeCurCd;
	//  邦貨コードをゲット
	public String get_homeCurCd() {
		return _homeCurCd;
	}
	//  邦貨コードをセット
	public void set_homeCurCd(String curCd) {
		_homeCurCd = curCd;
	}
	/** 出荷準備L/T */
	private String _shipLt;
	// 出荷準備L/Tをゲット
	public String get_shipLt() {
		return _shipLt;
	}
	// 出荷準備L/Tをセット
	public void set_shipLt(String lt) {
		_shipLt = lt;
	}
	/** 短納期の判定日数 */
	private String _dlvDateCdt;
	// 短納期の判定日数をゲット
	public String get_dlvDateCdt() {
		return _dlvDateCdt;
	}
	// 短納期の判定日数をセット
	public void set_dlvDateCdt(String dateCdt) {
		_dlvDateCdt = dateCdt;
	}
	/** シスパラ①[受注時製番登録]*/
	private String PRD_REQ_JOB_ODR_TYP_1;
	// シスパラ①[受注時製番登録]をゲット
	public String getPRD_REQ_JOB_ODR_TYP_1() {
		return PRD_REQ_JOB_ODR_TYP_1;
	}
	// シスパラ①[受注時製番登録]をセット
	public void setPRD_REQ_JOB_ODR_TYP_1(String prd_req_job_odr_typ_1) {
		PRD_REQ_JOB_ODR_TYP_1 = prd_req_job_odr_typ_1;
	}
	/** シスパラ②[受注時製番登録]*/
	private String PRD_REQ_JOB_ODR_TYP_2;
	// シスパラ②[受注時製番登録]をゲット
	public String getPRD_REQ_JOB_ODR_TYP_2() {
		return PRD_REQ_JOB_ODR_TYP_2;
	}
	// シスパラ②[受注時製番登録]をセット
	public void setPRD_REQ_JOB_ODR_TYP_2(String prd_req_job_odr_typ_2) {
		PRD_REQ_JOB_ODR_TYP_2 = prd_req_job_odr_typ_2;
	}

	/** [コンボボックスデータ]情報（） */
	private ComboStruct _odrTypStruct = new ComboStruct();
	/** [コンボボックスデータ]情報（） */
	private ComboStruct _spclPriceTypStruct = new ComboStruct();
	/** [コンボボックスデータ]情報（） */
	private ComboStruct _depoTypStruct = new ComboStruct();
    /** シスタム設定値  */	
	private PrivateConfig privateConfig;
	/** 受注承認フラグ */
	private String _APR_ODR ;
	// 受注承認フラグをゲット
	public String get_APR_ODR() {
		return _APR_ODR;
	}
    // 受注承認フラグをセット
	public void set_APR_ODR(String _apr_odr) {
		_APR_ODR = _apr_odr;
	}

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

	/**
	 * コンボボックスの値を元に表示文字列を取得します。
	 * @param cs コンボボックスストラクトオブジェクト
	 * @param val コンボボックスの値
	 * @return コンボボックスの表示用データ文字列
	 */
	private String getComboData(ComboStruct cs, String val) {
		List valList = cs.getValList();
		List explanList = cs.getExplanList();
		for (int i = 0; i < valList.size(); i++) {
			String listVal = (String) valList.get(i);
			if (val.equals(listVal)) {
				return (String) explanList.get(i);
			}
		}

		return null;
	}
	/**
	 * 業務ロジックのインフォメーションメッセージ設定処理を切り出して関数化
	 * @param code メッセージコード
	 */
	public void setInfoMessage(String code) {
		ExpjMessage emsg = new ExpjMessage(code);
		msgStruct.addInfo(emsg);
	}
	

	/**
	 * 邦貨換算。
	 * @param amount 対象金額
	 * @param s ストラクトオブジェクト
	 * @return 邦貨金額
	 * @throws SQLException 処理失敗
	 * @throws ExpjException  処理失敗
	 */
	private String exchAmount(String amount, KQ0010010Struct s)
		throws SQLException, ExpjException {

		ExchAmount exch = new ExchAmount(conn);

		boolean result =
			exch.doExchAmount(
				amount,
				_companyCd,
				s.getl_CURRNCY_CD(),
				s.getl_EXCH_TYP(),
				s.getl_DETAIL_ROUND_TYP(),
				_businessOprDate);

		if (!result) {
			throw new ExpjException("KQ00038");
		}

		double exchAmount = exch.getD_EXCH_AMOUNT();

		return String.valueOf(exchAmount);
	}

	/**
	 * 丸め。
	 * @param amount 対象金額
	 * @param s ストラクトオブジェクト
	 * @return 丸め金額
	 * @throws SQLException 処理失敗
	 * @throws ExpjException 処理失敗
	 */
	private String roundAmount(String amount, KQ0010010Struct s)
		throws SQLException, ExpjException {

		ExchAmount exch = new ExchAmount(conn);

		boolean result =
			exch.doMarume(
				amount,
				_companyCd,
				s.getl_CURRNCY_CD(),
				s.getl_EXCH_TYP(),
				s.getl_DETAIL_ROUND_TYP(),
				_businessOprDate);

		if (!result) {
			throw new ExpjException("KQ00038");
		}

		double roundAmount = exch.getD_EXCH_AMOUNT();

		return String.valueOf(roundAmount);
	}

	/**
	 * 業務運用日計算メソッドを文字列で取り扱うための変換メソッド
	 * @param dateValue 日付文字列
	 * @param margin 日数文字列
     * @param plantCd 工場コード
	 * @param moveFlg 前倒しフラグ
	 * @return 計算結果日
	 * @throws ParseException 文字列の日付/数値変換に失敗した場合。
	 * @throws FoundationException 共通部品処理で失敗した場合
	 * @throws ExpjException 稼働日取得に失敗した場合
	 */
	private String calcWorkDate(String dateValue, String margin, String plantCd, boolean moveFlg)
		throws ParseException, FoundationException, ExpjException {

	//	SimpleDateFormat sdi = new SimpleDateFormat("yyyy/MM/dd");
		Date date = Converter.strToDate(dateValue, "yyyy/MM/dd");

		//業務日付計算
		WorkCalendar wkd =
			new WorkCalendar(
				conn,
				sysUSER_CD,
				business.getBusinessCd(),
				plantCd,
				date,
				Integer.parseInt(margin),
				moveFlg);
		Date calcDate = wkd.calcDate();
		if (calcDate == null) {
			throw new ExpjException("KQ00040");
		}

		return Converter.dateToStr(calcDate, "yyyy/MM/dd");
	}

	private String calcWorkDate(String dateValue, String margin, String plantCd)
		throws ParseException, FoundationException, ExpjException {

		if (Integer.parseInt(margin) < 0) {
			return calcWorkDate(dateValue, margin, plantCd, true);
		} else {
			return calcWorkDate(dateValue, margin, plantCd, false);
		}
	}

	/**
	 * 出荷指定日計算
	 * @param desinatedDlvDate 指定納期
	 * @param transportLt 運送日数
	 * @param shipLt 出荷準備L/T
     * @param plantCd 工場コード
	 * @return 出荷指定日
	 * @throws ParseException 文字列の日付/数値変換に失敗した場合。
	 * @throws FoundationException 共通部品処理で失敗した場合
	 */
	private String calcDesinatedShipDate(
		String desinatedDlvDate,
		String transportLt,
		String shipLt,
        String plantCd)
		throws ParseException, FoundationException, ExpjException {

		// 前倒し日数を求める。
		String margin = Calculate.subtract("0", Calculate.add(transportLt, shipLt));
		// 出荷指定日を求める。
		String desinatedShipDate = calcWorkDate(desinatedDlvDate, margin, plantCd, true);

		// 出荷指定日＜業務運用日の場合は業務運用日を返す。
		if (DateTool.compareYMD(desinatedShipDate, _businessOprDate) < 0) {
			return _businessOprDate;
		} else {
			return desinatedShipDate;
		}
	}

	/**
	 * 短納期判定
	 * @param s ストラクトオブジェクト
	 * @return 短納期の場合はtrue、そうでない場合はfalse
	 * @throws ParseException 日付データが不正な場合。
	 */
	private boolean isQuickDelivery(KQ0010010Struct s)
		throws ParseException, FoundationException, ExpjException {
		String quickDeliveryDate = calcWorkDate(_businessOprDate, _dlvDateCdt, _plantWeb);

		// 短納期
		if (DateTool.compareYMD(quickDeliveryDate, s.getl_DESINATED_DLV_DATE()) >= 0) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * 画面の全項目を初期化します。
	 */
	private void initializeAll() {

		initializeForm(true);
		initializeList();
	}

	/**
	 * 画面の詳細項目を初期化します。
	 */
	private void initializeList() {
		list = null;

		readStatus = INITIAL;
	}

	/**
	 * 画面の詳細項目を初期化します。
     * @param clearFlg クリアフラグ
	 */
	private void initializeForm(boolean clearFlg) {

        if (clearFlg) {
            struct.setNO(null);
            struct.setODR_TYP("2");
            struct.setCUST_ODR_NO(null);
            struct.setCUST_ITEM_CD(null);
            struct.setCUST_CD(null);
            struct.setDLV_LOC_CD(null);
            struct.setDESINATED_DLV_DATE(null);
            struct.setODR_QTY("0");
            struct.setODR_UNIT_PRICE("0");
            struct.setSPCL_PRICE_TYP("0");
            struct.setREMARKS(null);
            struct.seth_BUSINESS_OPR_DATE(_businessOprDate);
            struct.setODR_ACPT_DATE(_businessOprDate);
            struct.seth_PRD_REQ_JOB_ODR_TYP_1(PRD_REQ_JOB_ODR_TYP_1);
            struct.seth_PRD_REQ_JOB_ODR_TYP_2(PRD_REQ_JOB_ODR_TYP_2);
            struct.setJOB_ODR_QTY("0");
            struct.setJOB_ODR_DLV_DATE(null);
            struct.setALC_GRP_CD(null);
            struct.setJOB_ODR_CD(null);
            struct.setAPPR_REMARKS(null); // 承認備考
            readStatus = INITIAL;
        }
		//readStatus = INITIAL;
	}

	/**
	 * 「追加」「修正」ボタン押下時に画面表示と登録に必要なデータを取得します。
	 * @param s 参照対象のstruct
	 * @throws BusinessProcessException 業務例外した場合
	 * @throws FoundationException 業務例外が発生した場合
	 */
	public void refer2Master(KQ0010010Struct s)
		throws BusinessProcessException, FoundationException {
		try {

			s.setl_COMPANY_CD(_companyCd);
			s.setBUSINESS_OPR_DATE(_businessOprDate);

			// 得意先情報の取得
			List custList = entity.mM_CUST.read(conn, s);
			if (custList.isEmpty()) {
				setErrorMessage("KQ00014");
				setErrorParameter("M_CUST", "CUST_CD", s.getl_CUST_CD());
				return;
			}
			// 得意先情報のデータセット
			KQ0010010Struct custStruct = (KQ0010010Struct) custList.get(0);
			s.setl_CUST_ANAME(custStruct.getl_CUST_ANAME());
			s.setl_OWN_ORG_CD(custStruct.getl_OWN_ORG_CD());
			s.setl_OWN_PERSON_CD(custStruct.getl_OWN_PERSON_CD());
			if (custStruct.getl_CUR_CD() == null || "".equals(custStruct.getl_CUR_CD())) {
				s.setl_CUR_CD(_homeCurCd);
				s.setl_CURRNCY_CD(_homeCurCd);
			} else {
				s.setl_CUR_CD(custStruct.getl_CUR_CD());
				s.setl_CURRNCY_CD(custStruct.getl_CUR_CD());
			}
			s.setl_EXCH_TYP(custStruct.getl_EXCH_TYP());
			s.setl_TAX_APPLY_TYP(custStruct.getl_TAX_APPLY_TYP());
			
			s.setl_TAX_CD(custStruct.getl_TAX_CD());
			s.setl_TAX_CALC_TYP(custStruct.getl_TAX_CALC_TYP());
			s.setl_DETAIL_ROUND_TYP(custStruct.getl_DETAIL_ROUND_TYP());
			s.setl_PARTIAL_SHIP_INST_FLG(custStruct.getl_PARTIAL_SHIP_INST_FLG());

			// 通貨情報の取得
			List curList = entity.mM_CUR.read(conn, s);
			if (curList.isEmpty()) {
				setErrorMessage("KQ00073");
				setErrorParameter("M_CUR", "CUR_CD", s.getl_CUR_CD());
				return;
			}
			// 通貨情報のデータセット
			KQ0010010Struct curStruct = (KQ0010010Struct) curList.get(0);
			s.setl_CUR_UNIT(curStruct.getl_CUR_UNIT());

			// 納品場所情報のチェック
			List custBaseList = entity.mM_CUST_BASE.read(conn, s);
			if (custBaseList.isEmpty()) {
				setErrorMessage("KQ00015");
				setErrorParameter("M_CUST_BASE", "COMPANY_CD", s.getl_COMPANY_CD());
				setErrorParameter("M_CUST_BASE", "CUST_CD", s.getl_CUST_CD());
				setErrorParameter("M_CUST_BASE", "DLV_LOC_CD", s.getl_DLV_LOC_CD());
				return;
			} else if (custBaseList.size() > 1) {
				setErrorMessage("KQ00016");
				setErrorParameter("M_CUST_BASE", "COMPANY_CD", s.getl_COMPANY_CD());
				setErrorParameter("M_CUST_BASE", "CUST_CD", s.getl_CUST_CD());
				setErrorParameter("M_CUST_BASE", "DLV_LOC_CD", s.getl_DLV_LOC_CD());
				return;
			}
			// 納品場所情報のデータセット
			KQ0010010Struct custBaseStruct = (KQ0010010Struct) custBaseList.get(0);
			s.setl_DLV_LOC_CD(custBaseStruct.getl_DLV_LOC_CD());
			s.setl_DLV_LOC_NAME(custBaseStruct.getl_DLV_LOC_NAME());
			s.setl_TRANSPORT_CD(custBaseStruct.getl_TRANSPORT_CD());
			s.setl_TRANSPORT_LT(custBaseStruct.getl_TRANSPORT_LT());
			s.setl_TRANSPORT_TYP(custBaseStruct.getl_TRANSPORT_TYP());
            s.seth_SHIP_PLANT_CD(custBaseStruct.geth_SHIP_PLANT_CD());

			String yotaku_DEPO_WH_CD=custBaseStruct.getl_DEPO_WH_CD();//sww追加20040727払出預託保管区の取得

			// 製品情報の取得
			List itemSpecList = entity.mM_ITEM_SPEC.read(conn, s);
			if (itemSpecList.isEmpty()) {
				setErrorMessage("KQ00017");
				setErrorParameter("M_ITEM_SPEC", "CUST_ITEM_CD", s.getl_CUST_ITEM_CD());
				return;
			}
			// 製品情報データセット
			KQ0010010Struct itemSpecStruct = (KQ0010010Struct) itemSpecList.get(0);
			s.setl_ITEM_CD(itemSpecStruct.getl_ITEM_CD());
			s.setl_CUST_ITEM_NAME(itemSpecStruct.getl_CUST_ITEM_NAME());
			// 開始製品からの預託倉庫区分の取得
			s.setl_DEPO_TYP(itemSpecStruct.getl_DEPO_TYP());
			
			// Add Start 20131217 liu-chy
			if("1".equals(custStruct.getl_TAX_APPLY_TYP())){
				// 製品情報の取得
				s.setl_TAX_CD(itemSpecStruct.getl_TAX_CD());
			}
			// Add END 20131217 liu-chy
			
			// 預託区分が20、かつ、注文区分が3:確定の場合はエラー
			if ("20".equals(s.getl_DEPO_TYP()) && "3".equals(s.getl_ODR_TYP())) {
				setErrorMessage("KQ00081");
				return;
			}

			s.setl_DEPO_TYP_DN(getComboData(_depoTypStruct, itemSpecStruct.getl_DEPO_TYP()));

			// 「特値区分」が"0:正規"の場合、単価情報を取得
			if ("0".equals(s.getl_SPCL_PRICE_TYP())) {
				s.setl_EFF_PHASE_IN_DATE(_businessOprDate);
				List unitCostList = entity.mM_UNIT_COST.read(conn, s);
				if (unitCostList.isEmpty()) {
					// 単価情報が無ければエラー
					setErrorMessage("KQ00021");
					setErrorParameter("M_UNIT_COST", "COMPANY_CD", s.getl_COMPANY_CD());
					setErrorParameter("M_UNIT_COST", "CUST_CD", s.getl_CUST_CD());
					setErrorParameter("M_UNIT_COST", "ITEM_CD", s.getl_ITEM_CD());
					setErrorParameter("M_UNIT_COST", "EFF_PHASE_IN_DATE", s.getl_EFF_PHASE_IN_DATE());
					return;
				}
				KQ0010010Struct unitCostStruct = (KQ0010010Struct) unitCostList.get(0);
				//単価情報があれば取得した値を設定
				s.setl_ODR_UNIT_PRICE(unitCostStruct.getl_UNIT_COST());
				s.setl_UNIT_PRICE(unitCostStruct.getl_UNIT_COST());
			} else {
				s.setl_UNIT_PRICE(s.getl_ODR_UNIT_PRICE());
			}
            // 単価修正（入力欄）
            struct.setODR_UNIT_PRICE(s.getl_ODR_UNIT_PRICE());

			// 品目情報のチェック
			List itemList = entity.mM_ITEM.read(conn, s);
			if (itemList.isEmpty()) {
				setErrorMessage("KQ00027");
				setErrorParameter("M_ITEM", "ITEM_CD", s.getl_ITEM_CD());
				return;
			}
			//預託倉庫区分の非NULLチェック
			if ("20".equals(s.getl_DEPO_TYP()) && (yotaku_DEPO_WH_CD==null)) {
				setErrorMessage("KQ20001");
				return;
			}
			// データセット
			KQ0010010Struct itemStruct = (KQ0010010Struct) itemList.get(0);
			s.setl_ITEM_NAME(itemStruct.getl_ITEM_NAME());
			s.setl_UNIT_CD(itemStruct.getl_STOCK_UNIT());
            s.setl_UNIT_QTY_TYP(itemStruct.getl_UNIT_QTY_TYP());
            s.seth_MRP_ODR_TYP(itemStruct.geth_MRP_ODR_TYP());

            // 整数管理チェック
            if ("1".equals(s.getl_UNIT_QTY_TYP())) {
                // 整数管理
                if (s.getl_ODR_QTY().indexOf(".") >= 0) {
                    // 小数入力の場合：切上げ
                    String tempString = s.getl_ODR_QTY();
                    double tempDouble1 = Double.parseDouble(tempString);
                    s.setl_ODR_QTY(Calculate.ceil(s.getl_ODR_QTY(), 0));
                    double tempDouble2 = Double.parseDouble(s.getl_ODR_QTY());
                    if (tempDouble1 != tempDouble2) {
                        // ".0"入力除外
                        setWarningMessage("KQ20004");
                        setWarningParameter("T_ODR", "ODR_QTY", tempString);
                    }
                }
            }
            // 整数管理チェック	
            if ("1".equals(s.getl_UNIT_QTY_TYP()) && "true".equals(s.geth_DOODRFLG())) {
                // 整数管理
                if (s.getl_JOB_ODR_QTY().indexOf(".") >= 0) {
                    // 小数入力の場合：切上げ
                    String tempString = s.getl_JOB_ODR_QTY();
                    double tempDouble1 = Double.parseDouble(tempString);
                    s.setl_JOB_ODR_QTY(Calculate.ceil(s.getl_JOB_ODR_QTY(), 0));
                    double tempDouble2 = Double.parseDouble(s.getl_JOB_ODR_QTY());
                    if (tempDouble1 != tempDouble2) {
                        // ".0"入力除外
                        setWarningMessage("KQ20004");
                        setWarningParameter("T_JOB_ODR", "JOB_ODR_QTY", tempString);
                    }
                }
            }

		} /*catch (ParseException e) {
			throw new ExpjException(e);
		}*/ catch (SQLException e) {
			throw new ExpjException(e);
		}
	}
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * 追加ボタン押下時に実行される処理です。
	 *
	 */
	public void controlAddition() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0010");
		logger.entering("KQ0010010Control"+":USER="+struct.getsUser_ID(),"controlAddition");
			//{{user_implement_dev:<controlAddition>

		// リストがnullの場合は生成する。
		if (list == null) {
			list = new ArrayList(0);
		}

		// 一覧データが最大表示行数を超えていた場合
		// （追加前の事前チェックのため、size + 1と比較する）
		int maxLine = sp.getMaxLine(conn, 10);
		if ((maxLine != 0) && (list.size() + 1 > maxLine)) {
			setErrorMessage("KQ00100", String.valueOf(maxLine));
			// 最大行数オーバー
			readStatus = TOO_MANY;
			return;
		}

		// 「NO」を求める。
		int no = list.size() + 1;

		// 入力内容より一覧用ストラクトを作成
		KQ0010010Struct newListStruct = new KQ0010010Struct();
		newListStruct.setl_NO(String.valueOf(no));
		newListStruct.setl_ODR_TYP(struct.getODR_TYP());
		newListStruct.setl_ODR_TYP_DN(getComboData(_odrTypStruct, struct.getODR_TYP()));
		newListStruct.setl_CUST_ODR_NO(struct.getCUST_ODR_NO());
		newListStruct.setl_CUST_ITEM_CD(struct.getCUST_ITEM_CD());
		newListStruct.setl_CUST_CD(struct.getCUST_CD());
		newListStruct.setl_DLV_LOC_CD(struct.getDLV_LOC_CD());
		newListStruct.setl_DESINATED_DLV_DATE(struct.getDESINATED_DLV_DATE());
		newListStruct.setl_ODR_QTY(struct.getODR_QTY());
		newListStruct.setl_ODR_UNIT_PRICE(struct.getODR_UNIT_PRICE());
		newListStruct.setl_SPCL_PRICE_TYP(struct.getSPCL_PRICE_TYP());
		newListStruct.setl_SPCL_PRICE_TYP_DN(getComboData(_spclPriceTypStruct, struct.getSPCL_PRICE_TYP()));
		newListStruct.setl_REMARKS(struct.getREMARKS());
		newListStruct.setl_ODR_ACPT_DATE(struct.getODR_ACPT_DATE());
		newListStruct.setl_APPR_REMARKS(struct.getAPPR_REMARKS());  // 承認備考
		// 画面の"製番手配を同時に行う"がチェックされている場合、手配数量、製番納期と引当グループコードを取得。
		if("true".equals(struct.getc_DOODR())){
			newListStruct.seth_DOODRFLG("true");
			newListStruct.setl_JOB_ODR_QTY(struct.getJOB_ODR_QTY());
			newListStruct.setl_JOB_ODR_DLV_DATE(struct.getJOB_ODR_DLV_DATE());
			newListStruct.setl_ALC_GRP_CD(struct.getALC_GRP_CD());
			struct.seth_CHECK_STATUS("true");
			// 製番を取得。
			if("true".equals(struct.getc_INPUTODRCD())){
				newListStruct.setl_JOB_ODR_CD(struct.getJOB_ODR_CD());
				newListStruct.seth_INPUTODRCDFLG("true");
			}else{
				newListStruct.setl_JOB_ODR_CD(null);
				newListStruct.seth_INPUTODRCDFLG("false");
			}
		}else{
			newListStruct.seth_DOODRFLG("null");
			newListStruct.setl_JOB_ODR_QTY(null);
			newListStruct.setl_JOB_ODR_DLV_DATE(null);
			newListStruct.setl_ALC_GRP_CD(null);
			newListStruct.seth_INPUTODRCDFLG("null");
			newListStruct.setl_JOB_ODR_CD(null);
			struct.seth_CHECK_STATUS("false");
		}
		

		// マスタ参照処理を行う。
		refer2Master(newListStruct);
		// エラーがあれば処理を中断
		if (msgStruct.hasError()) {
			return;
		}

		// 一覧を追加
		list.add(newListStruct);

		// 読込成功
		readStatus = NORMAL;
		
		// 編集フォームを初期化
		initializeForm(false);

                //}}user_implement_dev:<controlAddition>
		logger.exiting("KQ0010010Control"+":USER="+struct.getsUser_ID(),"controlAddition");

		return;
	}

	/**
	 * 修正ボタン押下時に実行される処理です。
	 *
	 */
	public void controlModify() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0010");
		logger.entering("KQ0010010Control"+":USER="+struct.getsUser_ID(),"controlModify");
			//{{user_implement_dev:<controlModify>

		for (int i = 0; i < list.size(); i++) {
			// 修正対象の「NO」を探す。
			KQ0010010Struct listStruct = (KQ0010010Struct) list.get(i);
			if (listStruct.getl_NO().equals(struct.getNO())) {

				// 修正対象のストラクトを入力内容から作り直す。
				KQ0010010Struct newListStruct = new KQ0010010Struct();
				newListStruct.setl_NO(struct.getNO());
				newListStruct.setl_ODR_TYP(struct.getODR_TYP());
				newListStruct.setl_ODR_TYP_DN(getComboData(_odrTypStruct, struct.getODR_TYP()));
				newListStruct.setl_CUST_ODR_NO(struct.getCUST_ODR_NO());
				newListStruct.setl_CUST_ITEM_CD(struct.getCUST_ITEM_CD());
				newListStruct.setl_CUST_CD(struct.getCUST_CD());
				newListStruct.setl_DLV_LOC_CD(struct.getDLV_LOC_CD());
				newListStruct.setl_DESINATED_DLV_DATE(struct.getDESINATED_DLV_DATE());
				newListStruct.setl_ODR_QTY(struct.getODR_QTY());
				newListStruct.setl_ODR_UNIT_PRICE(struct.getODR_UNIT_PRICE());
				newListStruct.setl_SPCL_PRICE_TYP(struct.getSPCL_PRICE_TYP());
				newListStruct.setl_SPCL_PRICE_TYP_DN(getComboData(_spclPriceTypStruct, struct.getSPCL_PRICE_TYP()));
				newListStruct.setl_REMARKS(struct.getREMARKS());
				newListStruct.setl_APPR_REMARKS(struct.getAPPR_REMARKS());  // 承認備考
				newListStruct.setl_ODR_ACPT_DATE(struct.getODR_ACPT_DATE());
				// 画面の"製番手配を同時に行う"がチェックされている場合、手配数量、製番納期と引当グループコードを取得。
				if("true".equals(struct.getc_DOODR())){
					newListStruct.seth_DOODRFLG("true");
					newListStruct.setl_JOB_ODR_QTY(struct.getJOB_ODR_QTY());
					newListStruct.setl_JOB_ODR_DLV_DATE(struct.getJOB_ODR_DLV_DATE());
					newListStruct.setl_ALC_GRP_CD(struct.getALC_GRP_CD());
					struct.seth_CHECK_STATUS("true");
					// 画面の"製番を手入力する"がチェックされている場合、製番を取得。
					if("true".equals(struct.getc_INPUTODRCD())){
						newListStruct.setl_JOB_ODR_CD(struct.getJOB_ODR_CD());
						newListStruct.seth_INPUTODRCDFLG("true");
					}else{
						newListStruct.setl_JOB_ODR_CD(null);
						newListStruct.seth_INPUTODRCDFLG("false");
					}
				}else{
					newListStruct.seth_DOODRFLG("null");
					newListStruct.setl_JOB_ODR_QTY(null);
					newListStruct.setl_JOB_ODR_DLV_DATE(null);
					newListStruct.setl_ALC_GRP_CD(null);
					newListStruct.seth_INPUTODRCDFLG("null");
					newListStruct.setl_JOB_ODR_CD(null);
					struct.seth_CHECK_STATUS("false");
				}
				// マスタ参照を行う。
				refer2Master(newListStruct);
				// エラーがあれば処理を中断
				if (msgStruct.hasError()) {
					return;
				}

				// 一覧データを上書きする。
				list.set(i, newListStruct);

				// 読込成功
				readStatus = NORMAL;
				
				// 編集フォームを初期化
				initializeForm(false);

				return;
			}
		}
                //}}user_implement_dev:<controlModify>
		logger.exiting("KQ0010010Control"+":USER="+struct.getsUser_ID(),"controlModify");

		return;
	}

	/**
	 * 消去ボタン押下時に実行される処理です。
	 *
	 */
	public void controlEliminate() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0010");
		logger.entering("KQ0010010Control"+":USER="+struct.getsUser_ID(),"controlEliminate");
			//{{user_implement_dev:<controlEliminate>
		for (int i = 0; i < list.size(); i++) {

			// 削除対象の「NO」を探す。
			KQ0010010Struct listStruct = (KQ0010010Struct) list.get(i);
			if (listStruct.getl_NO().equals(struct.getNO())) {

				// 対象データを一覧から削除
				list.remove(i);

				// 削除したデータ以降にデータある場合はそのデータの「NO」を1繰り上げる。
				for (int j = i; j < list.size(); j++) {
					KQ0010010Struct modifyListStruct = (KQ0010010Struct) list.get(j);
					int newNo = Integer.valueOf(modifyListStruct.getl_NO()).intValue() - 1;
					modifyListStruct.setl_NO(String.valueOf(newNo));
					list.set(j, modifyListStruct);
				}

				// 編集フォームを初期化
				initializeForm(true);

				//return;
			}
		}
		// ビューの状態設定
	  int cnt = list.size();         // 削除済み、リストのサイズ
	  if(cnt != 0){
				// 読込成功
				readStatus = NORMAL;
	  }else{
				// 初期状態
				readStatus = INITIAL;
	  }
	  
                //}}user_implement_dev:<controlEliminate>
		logger.exiting("KQ0010010Control"+":USER="+struct.getsUser_ID(),"controlEliminate");

		return;
	}

	/**
	 * 登録ボタン押下時に実行される処理です。
	 *
	 */
	public void controlInsert() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0010");
		logger.entering("KQ0010010Control"+":USER="+struct.getsUser_ID(),"controlInsert");
			//{{user_implement_dev:<controlInsert>
		try {
			// 全レコードの登録処理
			boolean appSucessFlg = false;
			
			for (int i = 0; i < list.size();) {
				KQ0010010Struct listStruct = (KQ0010010Struct) list.get(i);

				// 承認処理時、保存データ再チェック
				if ("3".equals(listStruct.geth_APR_ODR())) {
					refer2Master(listStruct);
				}
				
				
				// 登録/更新用システムデータを設定
				listStruct.setsOraganization_CD(struct.getsOrganization_CD());
				listStruct.setsSysdate(struct.getsSysdate());
				listStruct.setsUser_ID(struct.getsUser_ID());
			
				// [画面].”製番手配を同時に行う”がチェックONの状態で、以下のチェックを行う
				if("true".equals(listStruct.geth_DOODRFLG())){
					// [画面]. "製番入力する"がチェックONの状態で、入力した製番が[製番計画]に存在のチェック
					if("true".equals(listStruct.geth_INPUTODRCDFLG())){
						if(Numbering.checkNumber(conn, Numbering.JOB_OD_CD,listStruct.getJOB_ODR_CD()) == true){
			                    String Message = "T_JOB_ODR.JOB_ODR_CD:" + struct.getJOB_ODR_CD();
			                    setErrorMessage("AB00024", Message);
			                   }
						boolean blnRepeat = false;
						blnRepeat = entity.mCHECK_JOB_ODR_CD.check(conn,listStruct);
						if(blnRepeat){
							setErrorMessage("ZZ01102");
							setErrorParameter("","",listStruct.getl_JOB_ODR_CD());
							return;
						}
					}
					// [品目]."品目手配区分"　が１：製番、2：在庫引当型製番以外のチェック
					if(!"1".equals(listStruct.geth_MRP_ODR_TYP())&&!"2".equals(listStruct.geth_MRP_ODR_TYP())){
						setErrorMessage("KQ00324",listStruct.getl_CUST_ITEM_CD());
						return;
					}
					// 生産工場（納品場所コードからその出荷倉庫がある工場取得）のカレンダーが取得のチェック
					boolean blnCalendaExist = false;
					blnCalendaExist = entity.mCHECK_CAL.check(conn,listStruct);
					if(!blnCalendaExist){
						setErrorMessage("KQ00325");
						setErrorParameter("","",listStruct.getl_DLV_LOC_CD());
						return;
					}
					// 製番納期
					String strJobOdrDlvDate = listStruct.getl_JOB_ODR_DLV_DATE();
					// 「工場コード」は納品場所コードからその出荷元倉庫がある工場を取得する
					String plant_cd = listStruct.geth_SHIP_PLANT_CD();
					if(plant_cd == null || "".equals(plant_cd)){
						setErrorMessage("AB00023");
						return ;
					}
					// 製番納期がNull以外、生産工場でで非稼働日ののチェック
					if(strJobOdrDlvDate != null && !"".equals(strJobOdrDlvDate)){
						boolean blnHoliday = false;
						blnHoliday = entity.mCHECK_HOLIDAY.check(conn,listStruct);
						if(blnHoliday){
							setErrorMessage("KQ00326");
							setErrorParameter("","",listStruct.getl_JOB_ODR_DLV_DATE());
							return;
						}
					}
					else{
						// 業務日付計算部品に渡す加算日(運送日数+出荷準備LT)を計算する
						String transportLt = listStruct.getl_TRANSPORT_LT();
						int amount = Integer.parseInt(Calculate.add(transportLt, _shipLt));
						// 業務日付計算部品の生成
						WorkCalendar wkd = new WorkCalendar(conn,sysUSER_CD,business.getBusinessCd(),plant_cd,Converter.strToDate(listStruct.getl_DESINATED_DLV_DATE(), "yyyy/MM/dd"),amount*(-1),true);
						Date calcDate = wkd.calcDate();
						// 製番納期がNullの場合、製番納期算出が何らかの理由でできないとき
						if (calcDate == null) {
							throw new ExpjException("KQ00327");
						}
						strJobOdrDlvDate = Converter.dateToStr(calcDate, "yyyy/MM/dd");
						listStruct.setl_JOB_ODR_DLV_DATE(strJobOdrDlvDate);
					}
					//　製番数量を取得
					if(listStruct.getl_JOB_ODR_QTY() == null || listStruct.getl_JOB_ODR_QTY().equals("") || Float.parseFloat(listStruct.getl_JOB_ODR_QTY())==0){
						listStruct.setl_JOB_ODR_QTY(listStruct.getl_ODR_QTY());
					}
					//　製番
					String strJobOdrCD = "";
					//　製番を入力した
					if("true".equals(listStruct.geth_INPUTODRCDFLG())){
						strJobOdrCD = listStruct.getl_JOB_ODR_CD();
					} else {
						//　製番を入力しません、シスパラ②「受注登録時の製番採番方法」が０：自動採番（単純昇順）の場合。[製番採番].“採番済み製番”の値 を 現在の値＋１ で更新する。
						if ("0".equals(PRD_REQ_JOB_ODR_TYP_2)) {
							Numbering number = new Numbering(conn,Numbering.JOB_OD_CD, struct.getsUser_ID(),sp.getProcId(), listStruct.geth_SHIP_PLANT_CD());
							strJobOdrCD = number.getNo();
							if (strJobOdrCD == null) {
								setErrorMessage("AB00023");
								return ;
							}
							listStruct.setl_JOB_ODR_CD(strJobOdrCD);
						} 
					}
				}
                
				/** 承認依頼する場合、【受注承認依頼処理】を呼び出す */
				if ("1".equals(struct.geth_APR_ODR())) {
				    //　担当部門存在チェック
					if (listStruct.getl_OWN_ORG_CD() == null || "".equals(listStruct.getl_OWN_ORG_CD())  ) {
						setErrorMessage("KQ00335");
						return;
					}
					beginTransaction();
					ApprProc.execInsertProcess(conn, listStruct, this);
					appSucessFlg = true;
					
					// 画面上部のlistから1件削除する
					list.remove(i);
					continue;
				}	
				
				// [受注管理]情報の登録
				List odrCtlList = entity.mT_ODR_CTL.read(conn, listStruct);
				if (odrCtlList.isEmpty()) {
					// 受注管理情報が無い場合、受注管理番号を採番し、受注管理テーブルにレコードを登録する
					// [受注管理]."受注管理番号"の採番
					List seqOdrCtlList = entity.mSEQ_ODR_CTL.read(conn, listStruct);
					if (seqOdrCtlList.isEmpty()) {
						setErrorMessage("KQ00030", String.valueOf(i + 1));
						return;
					}
					KQ0010010Struct seqOdrCtlStruct = (KQ0010010Struct) seqOdrCtlList.get(0);
					// [受注管理]登録用データの設定
					listStruct.setl_ODR_CTL_NO(seqOdrCtlStruct.getl_ODR_CTL_NO());
					// [受注管理]の登録
					entity.mT_ODR_CTL.create(conn, listStruct);
				} else if (odrCtlList.size() > 1) {
					// 受注管理情報が複数件存在する場合、エラーメッセージ出力
					setErrorMessage("KQ00029", String.valueOf(i + 1));
					setErrorParameter("T_ODR_CTL", "CUST_CD", listStruct.getl_CUST_CD());
					setErrorParameter("T_ODR_CTL", "CUST_ITEM_CD", listStruct.getl_CUST_ITEM_CD());
					return;
				} else {
					KQ0010010Struct odrCtlStruct = (KQ0010010Struct) odrCtlList.get(0);
					listStruct.setl_ODR_CTL_NO(odrCtlStruct.getl_ODR_CTL_NO());
				}

				// [受注明細]."受注番号"の取得
				List seqOdrList = entity.mSEQ_ODR.read(conn, listStruct);
				if (seqOdrList.isEmpty()) {
					setErrorMessage("KQ00031", String.valueOf(i + 1));
					return;
				}
				KQ0010010Struct seqOdrStruct = (KQ0010010Struct) seqOdrList.get(0);

				// [受注明細]登録用データの設定
				listStruct.setl_ODR_NO(seqOdrStruct.getl_ODR_NO());
				listStruct.setl_CUST_CHRG_ORG_CD(listStruct.getl_OWN_ORG_CD());
				listStruct.setl_CUST_CHRG_PSN_CD(listStruct.getl_OWN_PERSON_CD());
				listStruct.setl_ODR_ACPT_ORG_CD(null);
				listStruct.setl_ODR_ACPT_PSN_CD(sysUSER_CD);
				listStruct.setl_CURRNCY_CD(listStruct.getl_CUR_CD());
				listStruct.setl_DLV_LOC_NAME_KANJI(listStruct.getl_DLV_LOC_NAME());
				listStruct.setl_STD_DESINATED_RCV_DATE(listStruct.getl_DESINATED_DLV_DATE());
				if ("2".equals(listStruct.getl_ODR_TYP())) {
					listStruct.setl_REMAIN_UNCONFIRM_ODR_QTY(listStruct.getl_ODR_QTY());
				} else {
					listStruct.setl_REMAIN_UNCONFIRM_ODR_QTY("0");
				}
				if ("2".equals(listStruct.getl_ODR_TYP())) {
					String unconfirmOdrBalance =
						Calculate.multiply(listStruct.getl_REMAIN_UNCONFIRM_ODR_QTY(),listStruct.getl_ODR_UNIT_PRICE());

					try {
						listStruct.setl_UNCONFIRM_ODR_BALANCE(roundAmount(unconfirmOdrBalance, listStruct));
					} catch (ExpjException e) {
						setErrorMessage("KQ00038");
						setErrorParameter("", "AMOUNT", unconfirmOdrBalance);
						setErrorParameter("", "COMPANY_CD", _companyCd);
						setErrorParameter("", "CURRNCY_CD", listStruct.getl_CURRNCY_CD());
						setErrorParameter("", "EXCH_TYP", listStruct.getl_EXCH_TYP());
						setErrorParameter("","DETAIL_ROUND_TYP",listStruct.getl_DETAIL_ROUND_TYP());
						setErrorParameter("", "BUSINESS_OPR_DATE", _businessOprDate);
						return;
					}
				} else {
					listStruct.setl_UNCONFIRM_ODR_BALANCE("0");
				}

				String odrAmount = Calculate.multiply(listStruct.getl_ODR_QTY(), listStruct.getl_ODR_UNIT_PRICE());
				try {
					listStruct.setl_ODR_AMOUNT(roundAmount(odrAmount, listStruct));
					listStruct.setl_ODR_AMOUNT_EXCH_RATES(exchAmount(odrAmount, listStruct));
				} catch (ExpjException e) {
					setErrorMessage("KQ00038");
					setErrorParameter("", "AMOUNT", odrAmount);
					setErrorParameter("", "COMPANY_CD", _companyCd);
					setErrorParameter("", "CURRNCY_CD", listStruct.getl_CURRNCY_CD());
					setErrorParameter("", "EXCH_TYP", listStruct.getl_EXCH_TYP());
					setErrorParameter("", "DETAIL_ROUND_TYP", listStruct.getl_DETAIL_ROUND_TYP());
					setErrorParameter("", "BUSINESS_OPR_DATE", _businessOprDate);
					return;
				}
				if (isQuickDelivery(listStruct)
					&& ("3".equals(listStruct.getl_ODR_TYP())
						|| ("2".equals(listStruct.getl_ODR_TYP())
							&& "20".equals(listStruct.getl_DEPO_TYP())))) {
					listStruct.setl_SHIP_PLAN_REMAIN_QTY("0");
				} else {
					listStruct.setl_SHIP_PLAN_REMAIN_QTY(listStruct.getl_ODR_QTY());
				}
				//　製番設定フラグは0
				listStruct.setl_JOB_ODR_SET_FLG("0");
				

	            //システムパラメタを取得の方法
				PrivateConfig privateConfig = new PrivateConfig(conn);				
				// パラメータ（CAR_PLAN_DEPO_AREA）を取得
				String shipSlipPartName = privateConfig.getString("SHIP_SLIP_PART_NAME");	

				//一般品名設定
				if(!"2".equals(shipSlipPartName) && !"1".equals(shipSlipPartName)){
					listStruct.setPART_NAME("");
				}else if("1".equals(shipSlipPartName)){
					listStruct.setPART_NAME(listStruct.getl_ITEM_NAME());
				}else{
					listStruct.setPART_NAME(listStruct.getl_CUST_ITEM_NAME());
				}

				
				// [受注明細]の登録
				entity.mT_ODR.create(conn, listStruct);

				// [受注履歴]."受注履歴番号"を採番
				List seqRsltOdrList = entity.mSEQ_RSLT_ODR.read(conn, listStruct);
				if (seqRsltOdrList.isEmpty()) {
					setErrorMessage("KQ00035", String.valueOf(i + 1));
					return;
				}
				KQ0010010Struct seqRsltOdrStruct = (KQ0010010Struct) seqRsltOdrList.get(0);

				// [受注履歴]登録用データの設定
				listStruct.setl_RSLT_CTL_SEQ_CD(seqRsltOdrStruct.getl_RSLT_CTL_SEQ_CD());
				// 単位設定
				listStruct.setl_UNIT(listStruct.getl_UNIT_CD());
                //　納品場所コード
				listStruct.setl_DLV_PLACE_CD(listStruct.getl_DLV_LOC_CD());
				// [受注履歴]の登録
				entity.mT_ODR_ACPT_RSLT.create(conn, listStruct);

				// 「注文区分」が"3:確定"の場合は内示確定注文取崩処理を行う
				if ("3".equals(listStruct.getl_ODR_TYP())) {

					List odrUnconfirmList = entity.mT_ODR_Unconfirm.read(conn, listStruct);

					String odrQty = listStruct.getl_ODR_QTY();

					for (int j = 0; j < odrUnconfirmList.size(); j++) {
						KQ0010010Struct odrUnconfirmStruct = (KQ0010010Struct) odrUnconfirmList.get(j);

						// 登録/更新用システムデータを設定
						odrUnconfirmStruct.setsOraganization_CD(struct.getsOrganization_CD());
						odrUnconfirmStruct.setsSysdate(struct.getsSysdate());
						odrUnconfirmStruct.setsUser_ID(struct.getsUser_ID());

						// [内示確定注文取崩]データを設定
						odrUnconfirmStruct.setl_FIXED_ODR_NO(listStruct.getl_ODR_NO());
						odrUnconfirmStruct.setl_ALCTED_SEQ_CD(String.valueOf(j + 1));
						odrUnconfirmStruct.setl_ALCTED_UNCONFIRM_ODR_NO(
							odrUnconfirmStruct.getl_ODR_NO());
						if (Calculate.compare(odrQty, odrUnconfirmStruct.getl_REMAIN_UNCONFIRM_ODR_QTY())> 0) {
							odrUnconfirmStruct.setl_ALCTED_UNCONFIRM_ODR_QTY(odrUnconfirmStruct.getl_REMAIN_UNCONFIRM_ODR_QTY());
						} else {
							odrUnconfirmStruct.setl_ALCTED_UNCONFIRM_ODR_QTY(odrQty);
						}
						// [内示確定注文取崩]の登録
						entity.mT_ALLOC_FIXED_ODR_RSLT.create(conn, odrUnconfirmStruct);
						// [受注明細]更新用データを設定
						String remainUnconfirmOdrQty =Calculate.subtract(odrUnconfirmStruct.getl_REMAIN_UNCONFIRM_ODR_QTY(),odrUnconfirmStruct.getl_ALCTED_UNCONFIRM_ODR_QTY());
						odrUnconfirmStruct.setl_REMAIN_UNCONFIRM_ODR_QTY(remainUnconfirmOdrQty);
						String unconfirmOdrBalance = Calculate.multiply(odrUnconfirmStruct.getl_REMAIN_UNCONFIRM_ODR_QTY(),odrUnconfirmStruct.getl_ODR_UNIT_PRICE());
						try {
							odrUnconfirmStruct.setl_UNCONFIRM_ODR_BALANCE(roundAmount(unconfirmOdrBalance, listStruct));
						} catch (ExpjException e) {
							setErrorMessage("KQ00038");
							setErrorParameter("", "AMOUNT", unconfirmOdrBalance);
							setErrorParameter("", "COMPANY_CD", _companyCd);
							setErrorParameter("", "CURRNCY_CD", listStruct.getl_CURRNCY_CD());
							setErrorParameter("", "EXCH_TYP", listStruct.getl_EXCH_TYP());
							setErrorParameter("","DETAIL_ROUND_TYP",listStruct.getl_DETAIL_ROUND_TYP());
							setErrorParameter("", "BUSINESS_OPR_DATE", _businessOprDate);
							return;
						}
						// [受注明細]の更新
						entity.mT_ODR_Unconfirm.update(conn, odrUnconfirmStruct);
						// 注文数から引当数を引き、残りの注文数を求める
						odrQty = Calculate.subtract(odrQty,odrUnconfirmStruct.getl_ALCTED_UNCONFIRM_ODR_QTY());
						// 注文数が無くなったら処理を終了
						if (Calculate.compare(odrQty, "0") == 0) {
							break;
						}
					}
				}
				// "短納期 and (確定注文 or (内示 and 預託))" の場合、出荷計画を登録する。
				if (isQuickDelivery(listStruct)
					&& ("3".equals(listStruct.getl_ODR_TYP())
						|| ("2".equals(listStruct.getl_ODR_TYP())
							&& "20".equals(listStruct.getl_DEPO_TYP())))) {

					// [出荷計画]登録用データの設定
					listStruct.setl_ODR_NO(listStruct.getl_ODR_NO());

					String desinatedShipDate = calcDesinatedShipDate(listStruct.getl_DESINATED_DLV_DATE(),listStruct.getl_TRANSPORT_LT(),_shipLt,listStruct.geth_SHIP_PLANT_CD());

					String lastAnsDlvDateRcd = calcWorkDate(desinatedShipDate, listStruct.getl_TRANSPORT_LT(), _plantWeb);

					listStruct.setl_LAST_ANS_DLV_DATE_RCD(lastAnsDlvDateRcd);
					listStruct.setl_DESINATED_SHIP_DATE(desinatedShipDate);
					listStruct.setl_DESINATED_SHIP_QTY(listStruct.getl_ODR_QTY());
					listStruct.setl_REST_SHIP_ODR_QTY(listStruct.getl_ODR_QTY());
					// [出荷計画]の登録
					entity.mT_ANS_DLV_DATE.create(conn, listStruct);
				}
				//製番を同時に登録する場合、受注関連データを作成する
				if("true".equals(listStruct.geth_DOODRFLG())){
					// [受注明細]更新用データの設定
					listStruct.setl_ODR_NO(listStruct.getl_ODR_NO());
					listStruct.setl_JOB_ODR_SET_FLG("1");
					//[受注明細]更新
					entity.mUPDATE_T_ODR.update(conn,listStruct);
					
					//シスパラ②「受注登録時の製番採番方法」が１：自動（接頭文字＋受注番号）の場合、製番接頭辞＋［受注明細］の受注番号（受注番号の接頭辞は除く）から製番を作成する。
					if("false".equals(listStruct.geth_INPUTODRCDFLG()) && PRD_REQ_JOB_ODR_TYP_2.equals("1")){
						StringBuffer strOdrNO = new StringBuffer(listStruct.getl_ODR_NO().substring(3));
						StringBuffer strJobOdrCDPrefix = null;
						List prefixList = entity.mSYS_JOB_ODR_CD_CTRL.read(conn,listStruct);
						strJobOdrCDPrefix = new StringBuffer(((KQ0010010Struct)prefixList.get(0)).getJOB_OD_CD_PREFIX());
						String strJobOdrCD = strJobOdrCDPrefix.append(strOdrNO).toString();
						listStruct.setl_JOB_ODR_CD(strJobOdrCD);
					}
					entity.mT_JOB_ODR.create(conn,listStruct);
                	//[所要量計算制御（製番）]に存在チェック
                	List odList = entity.mselectSYS_JOB_OD_CALC_CTRL.read(conn, struct);
                   	if(odList.size() <=0) {
    					//[所要量計算制御（製番）]へ登録
    					entity.mSYS_JOB_OD_CALC_CTRL.create(conn,listStruct);	
                   	}else{
                   		entity.mupdateSYS_JOB_OD_CALC_CTRL.update(conn, struct);
                   	}
					//[製番受注紐付]登録用データの設定
					listStruct.setl_COMPANY_CD(_companyCd);
					if(Calculate.compare(listStruct.getl_ODR_QTY(),listStruct.getl_JOB_ODR_QTY())>=0){
						listStruct.setl_ALCD_QTY(listStruct.getl_JOB_ODR_QTY());
					}else{
						listStruct.setl_ALCD_QTY(listStruct.getl_ODR_QTY());
					}
					entity.mT_JOB_ODR_ODR_ALC.create(conn,listStruct);
				}
				// 1件毎コミット
				conn.commit();
				
				// コミット時画面上部のlistから1件削除する
				list.remove(i);
			}
			if (appSucessFlg) {
				/** 承認依頼成功メッセジーを出す*/
		    	setInfoMessage("AZ00042");
			}
			// 画面クリア
			initializeAll();

			conn.commit();
		} catch (ParseException e) {
			throw new ExpjException(e);
		} catch (SQLException e) {
			throw new ExpjException(e);
		} finally {
			if (conn != null) {
				conn.rollback();
			}
		}

                //}}user_implement_dev:<controlInsert>
		logger.exiting("KQ0010010Control"+":USER="+struct.getsUser_ID(),"controlInsert");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0010");
		logger.entering("KQ0010010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
		initializeAll();
                //}}user_implement_dev:<controlClear>
		logger.exiting("KQ0010010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0010");
		logger.entering("KQ0010010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
		// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("KQ0010010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0010");
		logger.entering("KQ0010010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
		try {

			// 自社情報の取得
			List myCompanyList = entity.mSYS_MY_COMPANY.read(conn, struct);
			if (myCompanyList.isEmpty()) {
				setErrorMessage("KQ00039");
				throw new ExpjException("KQ00039");
			}
			KQ0010010Struct myCompanyStruct = (KQ0010010Struct) myCompanyList.get(0);
			_companyCd = myCompanyStruct.getCOMPANY_CD();

			// 日付計算用の工場コード取得
			struct.setCLASS_CODE("PLANT_WEB");
			List plantWebClassCodeList = entity.mSYS_CLASS_CODE.read(conn, struct);
			if (plantWebClassCodeList.isEmpty()) {
				setErrorMessage("KQ00026");
				throw new ExpjException("KQ00026");
			}
			KQ0010010Struct plantWebClassCodeStruct =
				(KQ0010010Struct) plantWebClassCodeList.get(0);
			_plantWeb = plantWebClassCodeStruct.getCODE();

			// 業務運用日の取得
			struct.setPLANT_CD(_plantWeb);
			List dateCtrlList = entity.mSYS_DATE_CTRL.read(conn, struct);
			if (dateCtrlList.isEmpty()) {
				setErrorMessage("KQ00026");
				throw new ExpjException("KQ00026");
			}
			KQ0010010Struct dateCtrlStruct = (KQ0010010Struct) dateCtrlList.get(0);
			_businessOprDate = dateCtrlStruct.getBUSINESS_OPR_DATE();
            // 画面の業務運用日をセットする
			struct.seth_BUSINESS_OPR_DATE(_businessOprDate);
			struct.setODR_ACPT_DATE(_businessOprDate);
			// 日本円通貨コード取得
			List homeCurList = entity.mSYS_HOME_CUR.read(conn, struct);
			if (homeCurList.isEmpty()) {
				setErrorMessage("KQ00041");
				throw new ExpjException("KQ00041");
			}
			KQ0010010Struct homeCurStruct = (KQ0010010Struct) homeCurList.get(0);
			_homeCurCd = homeCurStruct.getHOME_CUR_CD();

			// 出荷準備L/T取得
			struct.setCLASS_CODE("SHIP_LT");
			List shipLtClassCodeList = entity.mSYS_CLASS_CODE.read(conn, struct);
			if (shipLtClassCodeList.isEmpty()) {
				setErrorMessage("KQ00037");
				throw new ExpjException("KQ00037");
			}
			KQ0010010Struct shipLtClassCodeStruct = (KQ0010010Struct) shipLtClassCodeList.get(0);
			_shipLt = shipLtClassCodeStruct.getCODE();

			// 短納期の判定日数取得
			struct.setCLASS_CODE("DLV_DATE_CDT");
			List dlvDateCdtClassCodeList = entity.mSYS_CLASS_CODE.read(conn, struct);
			if (shipLtClassCodeList.isEmpty()) {
				setErrorMessage("KQ00056");
				throw new ExpjException("KQ00056");
			}
			KQ0010010Struct dlvDateCdtClassCodeStruct =
				(KQ0010010Struct) dlvDateCdtClassCodeList.get(0);
			_dlvDateCdt = dlvDateCdtClassCodeStruct.getCODE();

			// コンボボックスデータを部品より取得
			ComboBox cb = new ComboBox(conn, sysUSER_CD);
			_odrTypStruct = cb.getData("ODR_ODR_TYP");
			_spclPriceTypStruct = cb.getData("ODR_SPCL_PRICE");
			_depoTypStruct = cb.getData("ODR_DEPO_TYP");
			
			//シスパラ①[受注時製番登録]を取得
			List value1List = null;
			String value1 = null;
			value1List = entity.mPRD_REQ_JOB_ODR_TYP_1.read(conn,struct);
			if(value1List.isEmpty()){
				setErrorMessage("KQ00319");
				throw new ExpjException("KQ00319");
			}
			PRD_REQ_JOB_ODR_TYP_1 = ((KQ0010010Struct)value1List.get(0)).geth_PRD_REQ_JOB_ODR_TYP_1();
			if(!"0".equals(PRD_REQ_JOB_ODR_TYP_1)&&!"1".equals(PRD_REQ_JOB_ODR_TYP_1)&&!"2".equals(PRD_REQ_JOB_ODR_TYP_1)){
				setErrorMessage("KQ00319");
				throw new ExpjException("KQ00319");
			}
			//シスパラ②[受注時製番登録]を取得
			List value2List = null;
			value2List = entity.mPRD_REQ_JOB_ODR_TYP_2.read(conn,struct);
			if(value2List.isEmpty()){
				setErrorMessage("KQ00320");
				throw new ExpjException("KQ00320");
			}
			PRD_REQ_JOB_ODR_TYP_2 = ((KQ0010010Struct)value2List.get(0)).geth_PRD_REQ_JOB_ODR_TYP_2();
			if(!"0".equals(PRD_REQ_JOB_ODR_TYP_2)&&!"1".equals(PRD_REQ_JOB_ODR_TYP_2)&&!"2".equals(PRD_REQ_JOB_ODR_TYP_2)){
				setErrorMessage("KQ00320");
				throw new ExpjException("KQ00320");
			}
			cb.setConnection(null);
			
			// 受注承認を取得
            privateConfig = new PrivateConfig(conn);
			String aprCompany = privateConfig.getString("APR_ODR");
			// パラメータ「受注承認」をセット
			if (aprCompany == null || "".equals(aprCompany)) {
				String locale = CoreTools.getLocale(struct.getsUser_ID());
				ResourceBundle messages = CoreTools.getResourceBundle("ExpjMessage", locale);
				ExpjMessage emsg = new ExpjMessage("AZ00041", messages.getString("AZ00072"));
				msgStruct.addError(emsg); // ワーニングメッセージとして登録
				sysLog.warning(emsg, getsysUSER_CD()); // エラー内容
				struct.seth_APR_ODR("0");
			} else if (!"1".equals(aprCompany)) {
				// １以外の場合
				struct.seth_APR_ODR("0");
			} else {
				struct.seth_APR_ODR("1");
			}
			_APR_ODR = struct.geth_APR_ODR();

			// 画面を初期化
			initializeAll();

		} catch (SQLException e) {
			e.printStackTrace();
		}
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("KQ0010010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * イベントハンドラの前処理です。
	 *
	 * @param buttun ボタン名
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0010");
		logger.entering("KQ0010010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
		// システムパラメータ
			struct.seth_APR_ODR(_APR_ODR);
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("KQ0010010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			if( button.equals("Addition") ) {
				controlAddition();
			} else if( button.equals("Modify") ) {
				controlModify();
			} else if( button.equals("Eliminate") ) {
				controlEliminate();
			} else if( button.equals("Insert") ) {
				controlInsert();
			} else if( button.equals("Clear") ) {
				controlClear();
			} else if( button.equals("initial") ) {
				controlINITIAL();
			} else if( button.equals("reload") ) {
				controlRELOAD();
			}
		//{{user_implement_dev:<control_eventHandller>
			struct.setList_ODR_TYP_val(_odrTypStruct.getValList());
			struct.setList_ODR_TYP_name(_odrTypStruct.getExplanList());
			struct.setList_SPCL_PRICE_TYP_val(_spclPriceTypStruct.getValList());
			struct.setList_SPCL_PRICE_TYP_name(_spclPriceTypStruct.getExplanList());
                //}}user_implement_dev:<control_eventHandller>
		} catch( BusinessLockException ble ) {
			// 枠メッセージ出力依頼作成
			setNewDataFlg(false);
		} catch( ResourceBusyException rbe ) {
			ExpjException ee = new ExpjException(rbe, "ZZ01105");
			throw ee;
		} catch( FoundationException e ) {
//			e.printStackTrace();
//			throw new FoundationException("KQ0010010Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KQ0010010-E999","CSVの出力処理"));
			throw new FoundationException("KQ0010010Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KQ0010010-E999","システム日付の取得処理"));
				throw new FoundationException("KQ0010010Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KQ0010010-E999","コントロールのイベント処理"));
			throw new FoundationException("KQ0010010Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected KQ0010010Entity entity;
	protected KQ0010010Struct struct;
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

		entity = new KQ0010010Entity();
		struct = new KQ0010010Struct();

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
	 * KQ0010010クラスの標準コンストラクタ
	 */
	public KQ0010010Control() throws BusinessProcessException, FoundationException
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
				KQ0010010Struct key = (KQ0010010Struct)keyList.get(j);
				// メッセージキーを作成する
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("l_NO") && key.getl_NO() != null) {
					msgKey.setKeyValue("l_NO", key.getl_NO());
				}
				if(msgKeyType.containsKeyColumn("l_ODR_TYP_DN") && key.getl_ODR_TYP_DN() != null) {
					msgKey.setKeyValue("l_ODR_TYP_DN", key.getl_ODR_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("l_SPCL_PRICE_TYP_DN") && key.getl_SPCL_PRICE_TYP_DN() != null) {
					msgKey.setKeyValue("l_SPCL_PRICE_TYP_DN", key.getl_SPCL_PRICE_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("l_DEPO_TYP_DN") && key.getl_DEPO_TYP_DN() != null) {
					msgKey.setKeyValue("l_DEPO_TYP_DN", key.getl_DEPO_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("ODR_TYP") && key.getODR_TYP() != null) {
					msgKey.setKeyValue("ODR_TYP", key.getODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("ODR_TYP_name") && key.getODR_TYP_name() != null) {
					msgKey.setKeyValue("ODR_TYP_name", key.getODR_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("ODR_TYP_val") && key.getODR_TYP_val() != null) {
					msgKey.setKeyValue("ODR_TYP_val", key.getODR_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("NO") && key.getNO() != null) {
					msgKey.setKeyValue("NO", key.getNO());
				}
				if(msgKeyType.containsKeyColumn("CUST_ODR_NO") && key.getCUST_ODR_NO() != null) {
					msgKey.setKeyValue("CUST_ODR_NO", key.getCUST_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("CUST_ITEM_CD") && key.getCUST_ITEM_CD() != null) {
					msgKey.setKeyValue("CUST_ITEM_CD", key.getCUST_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("CUST_CD") && key.getCUST_CD() != null) {
					msgKey.setKeyValue("CUST_CD", key.getCUST_CD());
				}
				if(msgKeyType.containsKeyColumn("DLV_LOC_CD") && key.getDLV_LOC_CD() != null) {
					msgKey.setKeyValue("DLV_LOC_CD", key.getDLV_LOC_CD());
				}
				if(msgKeyType.containsKeyColumn("DESINATED_DLV_DATE") && key.getDESINATED_DLV_DATE() != null) {
					msgKey.setKeyValue("DESINATED_DLV_DATE", key.getDESINATED_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("ODR_QTY") && key.getODR_QTY() != null) {
					msgKey.setKeyValue("ODR_QTY", key.getODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("ODR_UNIT_PRICE") && key.getODR_UNIT_PRICE() != null) {
					msgKey.setKeyValue("ODR_UNIT_PRICE", key.getODR_UNIT_PRICE());
				}
				if(msgKeyType.containsKeyColumn("SPCL_PRICE_TYP") && key.getSPCL_PRICE_TYP() != null) {
					msgKey.setKeyValue("SPCL_PRICE_TYP", key.getSPCL_PRICE_TYP());
				}
				if(msgKeyType.containsKeyColumn("SPCL_PRICE_TYP_name") && key.getSPCL_PRICE_TYP_name() != null) {
					msgKey.setKeyValue("SPCL_PRICE_TYP_name", key.getSPCL_PRICE_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("SPCL_PRICE_TYP_val") && key.getSPCL_PRICE_TYP_val() != null) {
					msgKey.setKeyValue("SPCL_PRICE_TYP_val", key.getSPCL_PRICE_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("REMARKS") && key.getREMARKS() != null) {
					msgKey.setKeyValue("REMARKS", key.getREMARKS());
				}
				if(msgKeyType.containsKeyColumn("ODR_ACPT_DATE") && key.getODR_ACPT_DATE() != null) {
					msgKey.setKeyValue("ODR_ACPT_DATE", key.getODR_ACPT_DATE());
				}
				if(msgKeyType.containsKeyColumn("h_BUSINESS_OPR_DATE") && key.geth_BUSINESS_OPR_DATE() != null) {
					msgKey.setKeyValue("h_BUSINESS_OPR_DATE", key.geth_BUSINESS_OPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("c_DOODR") && key.getc_DOODR() != null) {
					msgKey.setKeyValue("c_DOODR", key.getc_DOODR());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_QTY") && key.getJOB_ODR_QTY() != null) {
					msgKey.setKeyValue("JOB_ODR_QTY", key.getJOB_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_DLV_DATE") && key.getJOB_ODR_DLV_DATE() != null) {
					msgKey.setKeyValue("JOB_ODR_DLV_DATE", key.getJOB_ODR_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("ALC_GRP_CD") && key.getALC_GRP_CD() != null) {
					msgKey.setKeyValue("ALC_GRP_CD", key.getALC_GRP_CD());
				}
				if(msgKeyType.containsKeyColumn("c_INPUTODRCD") && key.getc_INPUTODRCD() != null) {
					msgKey.setKeyValue("c_INPUTODRCD", key.getc_INPUTODRCD());
				}
				if(msgKeyType.containsKeyColumn("h_DOODRFLG") && key.geth_DOODRFLG() != null) {
					msgKey.setKeyValue("h_DOODRFLG", key.geth_DOODRFLG());
				}
				if(msgKeyType.containsKeyColumn("h_INPUTODRCDFLG") && key.geth_INPUTODRCDFLG() != null) {
					msgKey.setKeyValue("h_INPUTODRCDFLG", key.geth_INPUTODRCDFLG());
				}
				if(msgKeyType.containsKeyColumn("h_CHECK_STATUS") && key.geth_CHECK_STATUS() != null) {
					msgKey.setKeyValue("h_CHECK_STATUS", key.geth_CHECK_STATUS());
				}
				if(msgKeyType.containsKeyColumn("h_APR_ODR") && key.geth_APR_ODR() != null) {
					msgKey.setKeyValue("h_APR_ODR", key.geth_APR_ODR());
				}
				if(msgKeyType.containsKeyColumn("APPR_REMARKS") && key.getAPPR_REMARKS() != null) {
					msgKey.setKeyValue("APPR_REMARKS", key.getAPPR_REMARKS());
				}
				if(msgKeyType.containsKeyColumn("l_APPR_REMARKS") && key.getl_APPR_REMARKS() != null) {
					msgKey.setKeyValue("l_APPR_REMARKS", key.getl_APPR_REMARKS());
				}
				if(msgKeyType.containsKeyColumn("l_PROJECT_CD") && key.getl_PROJECT_CD() != null) {
					msgKey.setKeyValue("l_PROJECT_CD", key.getl_PROJECT_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ESTIMATE_NO") && key.getl_ESTIMATE_NO() != null) {
					msgKey.setKeyValue("l_ESTIMATE_NO", key.getl_ESTIMATE_NO());
				}
				if(msgKeyType.containsKeyColumn("l_DETAL_NO") && key.getl_DETAL_NO() != null) {
					msgKey.setKeyValue("l_DETAL_NO", key.getl_DETAL_NO());
				}
				if(msgKeyType.containsKeyColumn("l_ODR_CTL_NO") && key.getl_ODR_CTL_NO() != null) {
					msgKey.setKeyValue("l_ODR_CTL_NO", key.getl_ODR_CTL_NO());
				}
				if(msgKeyType.containsKeyColumn("l_CUST_CD") && key.getl_CUST_CD() != null) {
					msgKey.setKeyValue("l_CUST_CD", key.getl_CUST_CD());
				}
				if(msgKeyType.containsKeyColumn("l_CUST_ITEM_CD") && key.getl_CUST_ITEM_CD() != null) {
					msgKey.setKeyValue("l_CUST_ITEM_CD", key.getl_CUST_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ITEM_CD") && key.getl_ITEM_CD() != null) {
					msgKey.setKeyValue("l_ITEM_CD", key.getl_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("l_CUST_ITEM_NAME") && key.getl_CUST_ITEM_NAME() != null) {
					msgKey.setKeyValue("l_CUST_ITEM_NAME", key.getl_CUST_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_ITEM_NAME") && key.getl_ITEM_NAME() != null) {
					msgKey.setKeyValue("l_ITEM_NAME", key.getl_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_ODR_NO") && key.getl_ODR_NO() != null) {
					msgKey.setKeyValue("l_ODR_NO", key.getl_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("l_ODR_TYP") && key.getl_ODR_TYP() != null) {
					msgKey.setKeyValue("l_ODR_TYP", key.getl_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_CUST_ODR_NO") && key.getl_CUST_ODR_NO() != null) {
					msgKey.setKeyValue("l_CUST_ODR_NO", key.getl_CUST_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("l_CUST_CHRG_ORG_CD") && key.getl_CUST_CHRG_ORG_CD() != null) {
					msgKey.setKeyValue("l_CUST_CHRG_ORG_CD", key.getl_CUST_CHRG_ORG_CD());
				}
				if(msgKeyType.containsKeyColumn("l_CUST_CHRG_PSN_CD") && key.getl_CUST_CHRG_PSN_CD() != null) {
					msgKey.setKeyValue("l_CUST_CHRG_PSN_CD", key.getl_CUST_CHRG_PSN_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ODR_ACPT_ORG_CD") && key.getl_ODR_ACPT_ORG_CD() != null) {
					msgKey.setKeyValue("l_ODR_ACPT_ORG_CD", key.getl_ODR_ACPT_ORG_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ODR_ACPT_PSN_CD") && key.getl_ODR_ACPT_PSN_CD() != null) {
					msgKey.setKeyValue("l_ODR_ACPT_PSN_CD", key.getl_ODR_ACPT_PSN_CD());
				}
				if(msgKeyType.containsKeyColumn("l_CURRNCY_CD") && key.getl_CURRNCY_CD() != null) {
					msgKey.setKeyValue("l_CURRNCY_CD", key.getl_CURRNCY_CD());
				}
				if(msgKeyType.containsKeyColumn("l_EXCH_TYP") && key.getl_EXCH_TYP() != null) {
					msgKey.setKeyValue("l_EXCH_TYP", key.getl_EXCH_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_DLV_LOC_CD") && key.getl_DLV_LOC_CD() != null) {
					msgKey.setKeyValue("l_DLV_LOC_CD", key.getl_DLV_LOC_CD());
				}
				if(msgKeyType.containsKeyColumn("l_DLV_LOC_NAME_KANJI") && key.getl_DLV_LOC_NAME_KANJI() != null) {
					msgKey.setKeyValue("l_DLV_LOC_NAME_KANJI", key.getl_DLV_LOC_NAME_KANJI());
				}
				if(msgKeyType.containsKeyColumn("l_ODR_UNIT_PRICE") && key.getl_ODR_UNIT_PRICE() != null) {
					msgKey.setKeyValue("l_ODR_UNIT_PRICE", key.getl_ODR_UNIT_PRICE());
				}
				if(msgKeyType.containsKeyColumn("l_SPCL_PRICE_TYP") && key.getl_SPCL_PRICE_TYP() != null) {
					msgKey.setKeyValue("l_SPCL_PRICE_TYP", key.getl_SPCL_PRICE_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_DEPO_TYP") && key.getl_DEPO_TYP() != null) {
					msgKey.setKeyValue("l_DEPO_TYP", key.getl_DEPO_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_DESINATED_DLV_DATE") && key.getl_DESINATED_DLV_DATE() != null) {
					msgKey.setKeyValue("l_DESINATED_DLV_DATE", key.getl_DESINATED_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_STD_DESINATED_RCV_DATE") && key.getl_STD_DESINATED_RCV_DATE() != null) {
					msgKey.setKeyValue("l_STD_DESINATED_RCV_DATE", key.getl_STD_DESINATED_RCV_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_ODR_QTY") && key.getl_ODR_QTY() != null) {
					msgKey.setKeyValue("l_ODR_QTY", key.getl_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_REMAIN_UNCONFIRM_ODR_QTY") && key.getl_REMAIN_UNCONFIRM_ODR_QTY() != null) {
					msgKey.setKeyValue("l_REMAIN_UNCONFIRM_ODR_QTY", key.getl_REMAIN_UNCONFIRM_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_UNIT_CD") && key.getl_UNIT_CD() != null) {
					msgKey.setKeyValue("l_UNIT_CD", key.getl_UNIT_CD());
				}
				if(msgKeyType.containsKeyColumn("l_UNCONFIRM_ODR_BALANCE") && key.getl_UNCONFIRM_ODR_BALANCE() != null) {
					msgKey.setKeyValue("l_UNCONFIRM_ODR_BALANCE", key.getl_UNCONFIRM_ODR_BALANCE());
				}
				if(msgKeyType.containsKeyColumn("l_ODR_AMOUNT") && key.getl_ODR_AMOUNT() != null) {
					msgKey.setKeyValue("l_ODR_AMOUNT", key.getl_ODR_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("l_ODR_AMOUNT_EXCH_RATES") && key.getl_ODR_AMOUNT_EXCH_RATES() != null) {
					msgKey.setKeyValue("l_ODR_AMOUNT_EXCH_RATES", key.getl_ODR_AMOUNT_EXCH_RATES());
				}
				if(msgKeyType.containsKeyColumn("l_TRANSPORT_CD") && key.getl_TRANSPORT_CD() != null) {
					msgKey.setKeyValue("l_TRANSPORT_CD", key.getl_TRANSPORT_CD());
				}
				if(msgKeyType.containsKeyColumn("l_TRANSPORT_TYP") && key.getl_TRANSPORT_TYP() != null) {
					msgKey.setKeyValue("l_TRANSPORT_TYP", key.getl_TRANSPORT_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_TAX_APPLY_TYP") && key.getl_TAX_APPLY_TYP() != null) {
					msgKey.setKeyValue("l_TAX_APPLY_TYP", key.getl_TAX_APPLY_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_TAX_CD") && key.getl_TAX_CD() != null) {
					msgKey.setKeyValue("l_TAX_CD", key.getl_TAX_CD());
				}
				if(msgKeyType.containsKeyColumn("l_TAX_CALC_TYP") && key.getl_TAX_CALC_TYP() != null) {
					msgKey.setKeyValue("l_TAX_CALC_TYP", key.getl_TAX_CALC_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_REMARKS") && key.getl_REMARKS() != null) {
					msgKey.setKeyValue("l_REMARKS", key.getl_REMARKS());
				}
				if(msgKeyType.containsKeyColumn("l_ODR_ACPT_DATE") && key.getl_ODR_ACPT_DATE() != null) {
					msgKey.setKeyValue("l_ODR_ACPT_DATE", key.getl_ODR_ACPT_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_SHIP_PLAN_REMAIN_QTY") && key.getl_SHIP_PLAN_REMAIN_QTY() != null) {
					msgKey.setKeyValue("l_SHIP_PLAN_REMAIN_QTY", key.getl_SHIP_PLAN_REMAIN_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_PARTIAL_SHIP_INST_FLG") && key.getl_PARTIAL_SHIP_INST_FLG() != null) {
					msgKey.setKeyValue("l_PARTIAL_SHIP_INST_FLG", key.getl_PARTIAL_SHIP_INST_FLG());
				}
				if(msgKeyType.containsKeyColumn("PART_NAME") && key.getPART_NAME() != null) {
					msgKey.setKeyValue("PART_NAME", key.getPART_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_RSLT_CTL_SEQ_CD") && key.getl_RSLT_CTL_SEQ_CD() != null) {
					msgKey.setKeyValue("l_RSLT_CTL_SEQ_CD", key.getl_RSLT_CTL_SEQ_CD());
				}
				if(msgKeyType.containsKeyColumn("l_UNIT") && key.getl_UNIT() != null) {
					msgKey.setKeyValue("l_UNIT", key.getl_UNIT());
				}
				if(msgKeyType.containsKeyColumn("l_DLV_PLACE_CD") && key.getl_DLV_PLACE_CD() != null) {
					msgKey.setKeyValue("l_DLV_PLACE_CD", key.getl_DLV_PLACE_CD());
				}
				if(msgKeyType.containsKeyColumn("l_UNIT_PRICE") && key.getl_UNIT_PRICE() != null) {
					msgKey.setKeyValue("l_UNIT_PRICE", key.getl_UNIT_PRICE());
				}
				if(msgKeyType.containsKeyColumn("l_CUR_CD") && key.getl_CUR_CD() != null) {
					msgKey.setKeyValue("l_CUR_CD", key.getl_CUR_CD());
				}
				if(msgKeyType.containsKeyColumn("l_SPCL_PRICE_CO") && key.getl_SPCL_PRICE_CO() != null) {
					msgKey.setKeyValue("l_SPCL_PRICE_CO", key.getl_SPCL_PRICE_CO());
				}
				if(msgKeyType.containsKeyColumn("l_CUST_DLV_CD") && key.getl_CUST_DLV_CD() != null) {
					msgKey.setKeyValue("l_CUST_DLV_CD", key.getl_CUST_DLV_CD());
				}
				if(msgKeyType.containsKeyColumn("l_CUST_DLV_KEY_CD") && key.getl_CUST_DLV_KEY_CD() != null) {
					msgKey.setKeyValue("l_CUST_DLV_KEY_CD", key.getl_CUST_DLV_KEY_CD());
				}
				if(msgKeyType.containsKeyColumn("l_FIXED_ODR_NO") && key.getl_FIXED_ODR_NO() != null) {
					msgKey.setKeyValue("l_FIXED_ODR_NO", key.getl_FIXED_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("l_ALCTED_SEQ_CD") && key.getl_ALCTED_SEQ_CD() != null) {
					msgKey.setKeyValue("l_ALCTED_SEQ_CD", key.getl_ALCTED_SEQ_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ALCTED_UNCONFIRM_ODR_NO") && key.getl_ALCTED_UNCONFIRM_ODR_NO() != null) {
					msgKey.setKeyValue("l_ALCTED_UNCONFIRM_ODR_NO", key.getl_ALCTED_UNCONFIRM_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("l_ALCTED_UNCONFIRM_ODR_QTY") && key.getl_ALCTED_UNCONFIRM_ODR_QTY() != null) {
					msgKey.setKeyValue("l_ALCTED_UNCONFIRM_ODR_QTY", key.getl_ALCTED_UNCONFIRM_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_LAST_ANS_DLV_DATE_RCD") && key.getl_LAST_ANS_DLV_DATE_RCD() != null) {
					msgKey.setKeyValue("l_LAST_ANS_DLV_DATE_RCD", key.getl_LAST_ANS_DLV_DATE_RCD());
				}
				if(msgKeyType.containsKeyColumn("l_DESINATED_SHIP_DATE") && key.getl_DESINATED_SHIP_DATE() != null) {
					msgKey.setKeyValue("l_DESINATED_SHIP_DATE", key.getl_DESINATED_SHIP_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_DESINATED_SHIP_QTY") && key.getl_DESINATED_SHIP_QTY() != null) {
					msgKey.setKeyValue("l_DESINATED_SHIP_QTY", key.getl_DESINATED_SHIP_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_REST_SHIP_ODR_QTY") && key.getl_REST_SHIP_ODR_QTY() != null) {
					msgKey.setKeyValue("l_REST_SHIP_ODR_QTY", key.getl_REST_SHIP_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_CUST_ANAME") && key.getl_CUST_ANAME() != null) {
					msgKey.setKeyValue("l_CUST_ANAME", key.getl_CUST_ANAME());
				}
				if(msgKeyType.containsKeyColumn("l_OWN_ORG_CD") && key.getl_OWN_ORG_CD() != null) {
					msgKey.setKeyValue("l_OWN_ORG_CD", key.getl_OWN_ORG_CD());
				}
				if(msgKeyType.containsKeyColumn("l_OWN_PERSON_CD") && key.getl_OWN_PERSON_CD() != null) {
					msgKey.setKeyValue("l_OWN_PERSON_CD", key.getl_OWN_PERSON_CD());
				}
				if(msgKeyType.containsKeyColumn("l_DETAIL_ROUND_TYP") && key.getl_DETAIL_ROUND_TYP() != null) {
					msgKey.setKeyValue("l_DETAIL_ROUND_TYP", key.getl_DETAIL_ROUND_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_COMPANY_CD") && key.getl_COMPANY_CD() != null) {
					msgKey.setKeyValue("l_COMPANY_CD", key.getl_COMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("l_DLV_LOC_NAME") && key.getl_DLV_LOC_NAME() != null) {
					msgKey.setKeyValue("l_DLV_LOC_NAME", key.getl_DLV_LOC_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_TRANSPORT_LT") && key.getl_TRANSPORT_LT() != null) {
					msgKey.setKeyValue("l_TRANSPORT_LT", key.getl_TRANSPORT_LT());
				}
				if(msgKeyType.containsKeyColumn("l_DEPO_WH_CD") && key.getl_DEPO_WH_CD() != null) {
					msgKey.setKeyValue("l_DEPO_WH_CD", key.getl_DEPO_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("l_SHIP_WH_CD") && key.getl_SHIP_WH_CD() != null) {
					msgKey.setKeyValue("l_SHIP_WH_CD", key.getl_SHIP_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("h_SHIP_PLANT_CD") && key.geth_SHIP_PLANT_CD() != null) {
					msgKey.setKeyValue("h_SHIP_PLANT_CD", key.geth_SHIP_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("l_UNIT_COST") && key.getl_UNIT_COST() != null) {
					msgKey.setKeyValue("l_UNIT_COST", key.getl_UNIT_COST());
				}
				if(msgKeyType.containsKeyColumn("l_EFF_PHASE_IN_DATE") && key.getl_EFF_PHASE_IN_DATE() != null) {
					msgKey.setKeyValue("l_EFF_PHASE_IN_DATE", key.getl_EFF_PHASE_IN_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_STOCK_UNIT") && key.getl_STOCK_UNIT() != null) {
					msgKey.setKeyValue("l_STOCK_UNIT", key.getl_STOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("l_UNIT_QTY_TYP") && key.getl_UNIT_QTY_TYP() != null) {
					msgKey.setKeyValue("l_UNIT_QTY_TYP", key.getl_UNIT_QTY_TYP());
				}
				if(msgKeyType.containsKeyColumn("h_MRP_ODR_TYP") && key.geth_MRP_ODR_TYP() != null) {
					msgKey.setKeyValue("h_MRP_ODR_TYP", key.geth_MRP_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("COMPANY_CD") && key.getCOMPANY_CD() != null) {
					msgKey.setKeyValue("COMPANY_CD", key.getCOMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("CODE") && key.getCODE() != null) {
					msgKey.setKeyValue("CODE", key.getCODE());
				}
				if(msgKeyType.containsKeyColumn("CLASS_CODE") && key.getCLASS_CODE() != null) {
					msgKey.setKeyValue("CLASS_CODE", key.getCLASS_CODE());
				}
				if(msgKeyType.containsKeyColumn("HOME_CUR_CD") && key.getHOME_CUR_CD() != null) {
					msgKey.setKeyValue("HOME_CUR_CD", key.getHOME_CUR_CD());
				}
				if(msgKeyType.containsKeyColumn("BUSINESS_OPR_DATE") && key.getBUSINESS_OPR_DATE() != null) {
					msgKey.setKeyValue("BUSINESS_OPR_DATE", key.getBUSINESS_OPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("l_CUR_UNIT") && key.getl_CUR_UNIT() != null) {
					msgKey.setKeyValue("l_CUR_UNIT", key.getl_CUR_UNIT());
				}
				if(msgKeyType.containsKeyColumn("h_PRD_REQ_JOB_ODR_TYP_1") && key.geth_PRD_REQ_JOB_ODR_TYP_1() != null) {
					msgKey.setKeyValue("h_PRD_REQ_JOB_ODR_TYP_1", key.geth_PRD_REQ_JOB_ODR_TYP_1());
				}
				if(msgKeyType.containsKeyColumn("h_PRD_REQ_JOB_ODR_TYP_2") && key.geth_PRD_REQ_JOB_ODR_TYP_2() != null) {
					msgKey.setKeyValue("h_PRD_REQ_JOB_ODR_TYP_2", key.geth_PRD_REQ_JOB_ODR_TYP_2());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_CD") && key.getJOB_ODR_CD() != null) {
					msgKey.setKeyValue("JOB_ODR_CD", key.getJOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("l_JOB_ODR_CD") && key.getl_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("l_JOB_ODR_CD", key.getl_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("l_JOB_ODR_DLV_DATE") && key.getl_JOB_ODR_DLV_DATE() != null) {
					msgKey.setKeyValue("l_JOB_ODR_DLV_DATE", key.getl_JOB_ODR_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("JOB_OD_CD") && key.getJOB_OD_CD() != null) {
					msgKey.setKeyValue("JOB_OD_CD", key.getJOB_OD_CD());
				}
				if(msgKeyType.containsKeyColumn("JOB_OD_CD_PREFIX") && key.getJOB_OD_CD_PREFIX() != null) {
					msgKey.setKeyValue("JOB_OD_CD_PREFIX", key.getJOB_OD_CD_PREFIX());
				}
				if(msgKeyType.containsKeyColumn("l_JOB_ODR_SET_FLG") && key.getl_JOB_ODR_SET_FLG() != null) {
					msgKey.setKeyValue("l_JOB_ODR_SET_FLG", key.getl_JOB_ODR_SET_FLG());
				}
				if(msgKeyType.containsKeyColumn("l_JOB_ODR_QTY") && key.getl_JOB_ODR_QTY() != null) {
					msgKey.setKeyValue("l_JOB_ODR_QTY", key.getl_JOB_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_ALC_GRP_CD") && key.getl_ALC_GRP_CD() != null) {
					msgKey.setKeyValue("l_ALC_GRP_CD", key.getl_ALC_GRP_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ALCD_QTY") && key.getl_ALCD_QTY() != null) {
					msgKey.setKeyValue("l_ALCD_QTY", key.getl_ALCD_QTY());
				}
				if(msgKeyType.containsKeyColumn("OD_CALC_FLG") && key.getOD_CALC_FLG() != null) {
					msgKey.setKeyValue("OD_CALC_FLG", key.getOD_CALC_FLG());
				}
				if(msgKeyType.containsKeyColumn("TAX_CD") && key.getTAX_CD() != null) {
					msgKey.setKeyValue("TAX_CD", key.getTAX_CD());
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
					KQ0010010Struct key = new KQ0010010Struct();
					if(msgKeyType.containsKeyColumn("l_NO")) {
						key.setl_NO(msgKey.getKeyValue("l_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_ODR_TYP_DN")) {
						key.setl_ODR_TYP_DN(msgKey.getKeyValue("l_ODR_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("l_SPCL_PRICE_TYP_DN")) {
						key.setl_SPCL_PRICE_TYP_DN(msgKey.getKeyValue("l_SPCL_PRICE_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("l_DEPO_TYP_DN")) {
						key.setl_DEPO_TYP_DN(msgKey.getKeyValue("l_DEPO_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("ODR_TYP")) {
						key.setODR_TYP(msgKey.getKeyValue("ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("ODR_TYP_name")) {
						key.setODR_TYP_name(msgKey.getKeyValue("ODR_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("ODR_TYP_val")) {
						key.setODR_TYP_val(msgKey.getKeyValue("ODR_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("NO")) {
						key.setNO(msgKey.getKeyValue("NO"));
					}
					if(msgKeyType.containsKeyColumn("CUST_ODR_NO")) {
						key.setCUST_ODR_NO(msgKey.getKeyValue("CUST_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("CUST_ITEM_CD")) {
						key.setCUST_ITEM_CD(msgKey.getKeyValue("CUST_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("CUST_CD")) {
						key.setCUST_CD(msgKey.getKeyValue("CUST_CD"));
					}
					if(msgKeyType.containsKeyColumn("DLV_LOC_CD")) {
						key.setDLV_LOC_CD(msgKey.getKeyValue("DLV_LOC_CD"));
					}
					if(msgKeyType.containsKeyColumn("DESINATED_DLV_DATE")) {
						key.setDESINATED_DLV_DATE(msgKey.getKeyValue("DESINATED_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("ODR_QTY")) {
						key.setODR_QTY(msgKey.getKeyValue("ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("ODR_UNIT_PRICE")) {
						key.setODR_UNIT_PRICE(msgKey.getKeyValue("ODR_UNIT_PRICE"));
					}
					if(msgKeyType.containsKeyColumn("SPCL_PRICE_TYP")) {
						key.setSPCL_PRICE_TYP(msgKey.getKeyValue("SPCL_PRICE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("SPCL_PRICE_TYP_name")) {
						key.setSPCL_PRICE_TYP_name(msgKey.getKeyValue("SPCL_PRICE_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("SPCL_PRICE_TYP_val")) {
						key.setSPCL_PRICE_TYP_val(msgKey.getKeyValue("SPCL_PRICE_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("REMARKS")) {
						key.setREMARKS(msgKey.getKeyValue("REMARKS"));
					}
					if(msgKeyType.containsKeyColumn("ODR_ACPT_DATE")) {
						key.setODR_ACPT_DATE(msgKey.getKeyValue("ODR_ACPT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("h_BUSINESS_OPR_DATE")) {
						key.seth_BUSINESS_OPR_DATE(msgKey.getKeyValue("h_BUSINESS_OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("c_DOODR")) {
						key.setc_DOODR(msgKey.getKeyValue("c_DOODR"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_QTY")) {
						key.setJOB_ODR_QTY(msgKey.getKeyValue("JOB_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_DLV_DATE")) {
						key.setJOB_ODR_DLV_DATE(msgKey.getKeyValue("JOB_ODR_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("ALC_GRP_CD")) {
						key.setALC_GRP_CD(msgKey.getKeyValue("ALC_GRP_CD"));
					}
					if(msgKeyType.containsKeyColumn("c_INPUTODRCD")) {
						key.setc_INPUTODRCD(msgKey.getKeyValue("c_INPUTODRCD"));
					}
					if(msgKeyType.containsKeyColumn("h_DOODRFLG")) {
						key.seth_DOODRFLG(msgKey.getKeyValue("h_DOODRFLG"));
					}
					if(msgKeyType.containsKeyColumn("h_INPUTODRCDFLG")) {
						key.seth_INPUTODRCDFLG(msgKey.getKeyValue("h_INPUTODRCDFLG"));
					}
					if(msgKeyType.containsKeyColumn("h_CHECK_STATUS")) {
						key.seth_CHECK_STATUS(msgKey.getKeyValue("h_CHECK_STATUS"));
					}
					if(msgKeyType.containsKeyColumn("h_APR_ODR")) {
						key.seth_APR_ODR(msgKey.getKeyValue("h_APR_ODR"));
					}
					if(msgKeyType.containsKeyColumn("APPR_REMARKS")) {
						key.setAPPR_REMARKS(msgKey.getKeyValue("APPR_REMARKS"));
					}
					if(msgKeyType.containsKeyColumn("l_APPR_REMARKS")) {
						key.setl_APPR_REMARKS(msgKey.getKeyValue("l_APPR_REMARKS"));
					}
					if(msgKeyType.containsKeyColumn("l_PROJECT_CD")) {
						key.setl_PROJECT_CD(msgKey.getKeyValue("l_PROJECT_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ESTIMATE_NO")) {
						key.setl_ESTIMATE_NO(msgKey.getKeyValue("l_ESTIMATE_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_DETAL_NO")) {
						key.setl_DETAL_NO(msgKey.getKeyValue("l_DETAL_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_ODR_CTL_NO")) {
						key.setl_ODR_CTL_NO(msgKey.getKeyValue("l_ODR_CTL_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_CUST_CD")) {
						key.setl_CUST_CD(msgKey.getKeyValue("l_CUST_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_CUST_ITEM_CD")) {
						key.setl_CUST_ITEM_CD(msgKey.getKeyValue("l_CUST_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ITEM_CD")) {
						key.setl_ITEM_CD(msgKey.getKeyValue("l_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_CUST_ITEM_NAME")) {
						key.setl_CUST_ITEM_NAME(msgKey.getKeyValue("l_CUST_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_ITEM_NAME")) {
						key.setl_ITEM_NAME(msgKey.getKeyValue("l_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_ODR_NO")) {
						key.setl_ODR_NO(msgKey.getKeyValue("l_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_ODR_TYP")) {
						key.setl_ODR_TYP(msgKey.getKeyValue("l_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_CUST_ODR_NO")) {
						key.setl_CUST_ODR_NO(msgKey.getKeyValue("l_CUST_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_CUST_CHRG_ORG_CD")) {
						key.setl_CUST_CHRG_ORG_CD(msgKey.getKeyValue("l_CUST_CHRG_ORG_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_CUST_CHRG_PSN_CD")) {
						key.setl_CUST_CHRG_PSN_CD(msgKey.getKeyValue("l_CUST_CHRG_PSN_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ODR_ACPT_ORG_CD")) {
						key.setl_ODR_ACPT_ORG_CD(msgKey.getKeyValue("l_ODR_ACPT_ORG_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ODR_ACPT_PSN_CD")) {
						key.setl_ODR_ACPT_PSN_CD(msgKey.getKeyValue("l_ODR_ACPT_PSN_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_CURRNCY_CD")) {
						key.setl_CURRNCY_CD(msgKey.getKeyValue("l_CURRNCY_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_EXCH_TYP")) {
						key.setl_EXCH_TYP(msgKey.getKeyValue("l_EXCH_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_DLV_LOC_CD")) {
						key.setl_DLV_LOC_CD(msgKey.getKeyValue("l_DLV_LOC_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_DLV_LOC_NAME_KANJI")) {
						key.setl_DLV_LOC_NAME_KANJI(msgKey.getKeyValue("l_DLV_LOC_NAME_KANJI"));
					}
					if(msgKeyType.containsKeyColumn("l_ODR_UNIT_PRICE")) {
						key.setl_ODR_UNIT_PRICE(msgKey.getKeyValue("l_ODR_UNIT_PRICE"));
					}
					if(msgKeyType.containsKeyColumn("l_SPCL_PRICE_TYP")) {
						key.setl_SPCL_PRICE_TYP(msgKey.getKeyValue("l_SPCL_PRICE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_DEPO_TYP")) {
						key.setl_DEPO_TYP(msgKey.getKeyValue("l_DEPO_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_DESINATED_DLV_DATE")) {
						key.setl_DESINATED_DLV_DATE(msgKey.getKeyValue("l_DESINATED_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_STD_DESINATED_RCV_DATE")) {
						key.setl_STD_DESINATED_RCV_DATE(msgKey.getKeyValue("l_STD_DESINATED_RCV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_ODR_QTY")) {
						key.setl_ODR_QTY(msgKey.getKeyValue("l_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_REMAIN_UNCONFIRM_ODR_QTY")) {
						key.setl_REMAIN_UNCONFIRM_ODR_QTY(msgKey.getKeyValue("l_REMAIN_UNCONFIRM_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_UNIT_CD")) {
						key.setl_UNIT_CD(msgKey.getKeyValue("l_UNIT_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_UNCONFIRM_ODR_BALANCE")) {
						key.setl_UNCONFIRM_ODR_BALANCE(msgKey.getKeyValue("l_UNCONFIRM_ODR_BALANCE"));
					}
					if(msgKeyType.containsKeyColumn("l_ODR_AMOUNT")) {
						key.setl_ODR_AMOUNT(msgKey.getKeyValue("l_ODR_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("l_ODR_AMOUNT_EXCH_RATES")) {
						key.setl_ODR_AMOUNT_EXCH_RATES(msgKey.getKeyValue("l_ODR_AMOUNT_EXCH_RATES"));
					}
					if(msgKeyType.containsKeyColumn("l_TRANSPORT_CD")) {
						key.setl_TRANSPORT_CD(msgKey.getKeyValue("l_TRANSPORT_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_TRANSPORT_TYP")) {
						key.setl_TRANSPORT_TYP(msgKey.getKeyValue("l_TRANSPORT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_TAX_APPLY_TYP")) {
						key.setl_TAX_APPLY_TYP(msgKey.getKeyValue("l_TAX_APPLY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_TAX_CD")) {
						key.setl_TAX_CD(msgKey.getKeyValue("l_TAX_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_TAX_CALC_TYP")) {
						key.setl_TAX_CALC_TYP(msgKey.getKeyValue("l_TAX_CALC_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_REMARKS")) {
						key.setl_REMARKS(msgKey.getKeyValue("l_REMARKS"));
					}
					if(msgKeyType.containsKeyColumn("l_ODR_ACPT_DATE")) {
						key.setl_ODR_ACPT_DATE(msgKey.getKeyValue("l_ODR_ACPT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_SHIP_PLAN_REMAIN_QTY")) {
						key.setl_SHIP_PLAN_REMAIN_QTY(msgKey.getKeyValue("l_SHIP_PLAN_REMAIN_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_PARTIAL_SHIP_INST_FLG")) {
						key.setl_PARTIAL_SHIP_INST_FLG(msgKey.getKeyValue("l_PARTIAL_SHIP_INST_FLG"));
					}
					if(msgKeyType.containsKeyColumn("PART_NAME")) {
						key.setPART_NAME(msgKey.getKeyValue("PART_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_RSLT_CTL_SEQ_CD")) {
						key.setl_RSLT_CTL_SEQ_CD(msgKey.getKeyValue("l_RSLT_CTL_SEQ_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_UNIT")) {
						key.setl_UNIT(msgKey.getKeyValue("l_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("l_DLV_PLACE_CD")) {
						key.setl_DLV_PLACE_CD(msgKey.getKeyValue("l_DLV_PLACE_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_UNIT_PRICE")) {
						key.setl_UNIT_PRICE(msgKey.getKeyValue("l_UNIT_PRICE"));
					}
					if(msgKeyType.containsKeyColumn("l_CUR_CD")) {
						key.setl_CUR_CD(msgKey.getKeyValue("l_CUR_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_SPCL_PRICE_CO")) {
						key.setl_SPCL_PRICE_CO(msgKey.getKeyValue("l_SPCL_PRICE_CO"));
					}
					if(msgKeyType.containsKeyColumn("l_CUST_DLV_CD")) {
						key.setl_CUST_DLV_CD(msgKey.getKeyValue("l_CUST_DLV_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_CUST_DLV_KEY_CD")) {
						key.setl_CUST_DLV_KEY_CD(msgKey.getKeyValue("l_CUST_DLV_KEY_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_FIXED_ODR_NO")) {
						key.setl_FIXED_ODR_NO(msgKey.getKeyValue("l_FIXED_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_ALCTED_SEQ_CD")) {
						key.setl_ALCTED_SEQ_CD(msgKey.getKeyValue("l_ALCTED_SEQ_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ALCTED_UNCONFIRM_ODR_NO")) {
						key.setl_ALCTED_UNCONFIRM_ODR_NO(msgKey.getKeyValue("l_ALCTED_UNCONFIRM_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_ALCTED_UNCONFIRM_ODR_QTY")) {
						key.setl_ALCTED_UNCONFIRM_ODR_QTY(msgKey.getKeyValue("l_ALCTED_UNCONFIRM_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_LAST_ANS_DLV_DATE_RCD")) {
						key.setl_LAST_ANS_DLV_DATE_RCD(msgKey.getKeyValue("l_LAST_ANS_DLV_DATE_RCD"));
					}
					if(msgKeyType.containsKeyColumn("l_DESINATED_SHIP_DATE")) {
						key.setl_DESINATED_SHIP_DATE(msgKey.getKeyValue("l_DESINATED_SHIP_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_DESINATED_SHIP_QTY")) {
						key.setl_DESINATED_SHIP_QTY(msgKey.getKeyValue("l_DESINATED_SHIP_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_REST_SHIP_ODR_QTY")) {
						key.setl_REST_SHIP_ODR_QTY(msgKey.getKeyValue("l_REST_SHIP_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_CUST_ANAME")) {
						key.setl_CUST_ANAME(msgKey.getKeyValue("l_CUST_ANAME"));
					}
					if(msgKeyType.containsKeyColumn("l_OWN_ORG_CD")) {
						key.setl_OWN_ORG_CD(msgKey.getKeyValue("l_OWN_ORG_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_OWN_PERSON_CD")) {
						key.setl_OWN_PERSON_CD(msgKey.getKeyValue("l_OWN_PERSON_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_DETAIL_ROUND_TYP")) {
						key.setl_DETAIL_ROUND_TYP(msgKey.getKeyValue("l_DETAIL_ROUND_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_COMPANY_CD")) {
						key.setl_COMPANY_CD(msgKey.getKeyValue("l_COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_DLV_LOC_NAME")) {
						key.setl_DLV_LOC_NAME(msgKey.getKeyValue("l_DLV_LOC_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_TRANSPORT_LT")) {
						key.setl_TRANSPORT_LT(msgKey.getKeyValue("l_TRANSPORT_LT"));
					}
					if(msgKeyType.containsKeyColumn("l_DEPO_WH_CD")) {
						key.setl_DEPO_WH_CD(msgKey.getKeyValue("l_DEPO_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_SHIP_WH_CD")) {
						key.setl_SHIP_WH_CD(msgKey.getKeyValue("l_SHIP_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_SHIP_PLANT_CD")) {
						key.seth_SHIP_PLANT_CD(msgKey.getKeyValue("h_SHIP_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_UNIT_COST")) {
						key.setl_UNIT_COST(msgKey.getKeyValue("l_UNIT_COST"));
					}
					if(msgKeyType.containsKeyColumn("l_EFF_PHASE_IN_DATE")) {
						key.setl_EFF_PHASE_IN_DATE(msgKey.getKeyValue("l_EFF_PHASE_IN_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_STOCK_UNIT")) {
						key.setl_STOCK_UNIT(msgKey.getKeyValue("l_STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("l_UNIT_QTY_TYP")) {
						key.setl_UNIT_QTY_TYP(msgKey.getKeyValue("l_UNIT_QTY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("h_MRP_ODR_TYP")) {
						key.seth_MRP_ODR_TYP(msgKey.getKeyValue("h_MRP_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("COMPANY_CD")) {
						key.setCOMPANY_CD(msgKey.getKeyValue("COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("CODE")) {
						key.setCODE(msgKey.getKeyValue("CODE"));
					}
					if(msgKeyType.containsKeyColumn("CLASS_CODE")) {
						key.setCLASS_CODE(msgKey.getKeyValue("CLASS_CODE"));
					}
					if(msgKeyType.containsKeyColumn("HOME_CUR_CD")) {
						key.setHOME_CUR_CD(msgKey.getKeyValue("HOME_CUR_CD"));
					}
					if(msgKeyType.containsKeyColumn("BUSINESS_OPR_DATE")) {
						key.setBUSINESS_OPR_DATE(msgKey.getKeyValue("BUSINESS_OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_CUR_UNIT")) {
						key.setl_CUR_UNIT(msgKey.getKeyValue("l_CUR_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("h_PRD_REQ_JOB_ODR_TYP_1")) {
						key.seth_PRD_REQ_JOB_ODR_TYP_1(msgKey.getKeyValue("h_PRD_REQ_JOB_ODR_TYP_1"));
					}
					if(msgKeyType.containsKeyColumn("h_PRD_REQ_JOB_ODR_TYP_2")) {
						key.seth_PRD_REQ_JOB_ODR_TYP_2(msgKey.getKeyValue("h_PRD_REQ_JOB_ODR_TYP_2"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_CD")) {
						key.setJOB_ODR_CD(msgKey.getKeyValue("JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_JOB_ODR_CD")) {
						key.setl_JOB_ODR_CD(msgKey.getKeyValue("l_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_JOB_ODR_DLV_DATE")) {
						key.setl_JOB_ODR_DLV_DATE(msgKey.getKeyValue("l_JOB_ODR_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("JOB_OD_CD")) {
						key.setJOB_OD_CD(msgKey.getKeyValue("JOB_OD_CD"));
					}
					if(msgKeyType.containsKeyColumn("JOB_OD_CD_PREFIX")) {
						key.setJOB_OD_CD_PREFIX(msgKey.getKeyValue("JOB_OD_CD_PREFIX"));
					}
					if(msgKeyType.containsKeyColumn("l_JOB_ODR_SET_FLG")) {
						key.setl_JOB_ODR_SET_FLG(msgKey.getKeyValue("l_JOB_ODR_SET_FLG"));
					}
					if(msgKeyType.containsKeyColumn("l_JOB_ODR_QTY")) {
						key.setl_JOB_ODR_QTY(msgKey.getKeyValue("l_JOB_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_ALC_GRP_CD")) {
						key.setl_ALC_GRP_CD(msgKey.getKeyValue("l_ALC_GRP_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ALCD_QTY")) {
						key.setl_ALCD_QTY(msgKey.getKeyValue("l_ALCD_QTY"));
					}
					if(msgKeyType.containsKeyColumn("OD_CALC_FLG")) {
						key.setOD_CALC_FLG(msgKey.getKeyValue("OD_CALC_FLG"));
					}
					if(msgKeyType.containsKeyColumn("TAX_CD")) {
						key.setTAX_CD(msgKey.getKeyValue("TAX_CD"));
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
