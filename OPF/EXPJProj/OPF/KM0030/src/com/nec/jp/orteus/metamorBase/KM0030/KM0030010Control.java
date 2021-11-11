/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KM0030/src/com/nec/jp/orteus/metamorBase/KM0030/KM0030010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.KM0030;

import com.nec.jp.orteus.metamorBase.KM0030.*;
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
//}}user_implement_code_import

//{{user_implement_code_header
/**
 * CLASS     : KM0030010Control クラス
 * ファイル・クラス説明
 * @author $Author: chenjunhua268 $
 * @version $Revision: 1.2 $ $Date: 2014/06/11 03:16:20 $
 *
 */
//}}user_implement_code_header

public class KM0030010Control
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
	public KM0030010Struct getListvalue(int x) { return (KM0030010Struct)(this.list.get(x)); }	// リストの値を返します。
	public KM0030010Struct getStruct() { return this.struct; }	// Structの値を返します。
	public KM0030010Struct createStruct() { return new KM0030010Struct(); }	// 新しいStructを作って返します。
	public void setStruct(Object structname) { this.struct.setStruct((KM0030010Struct)structname); }	// Structをセットします。
	public void initializeStruct() { this.struct.initialize(); }	// Structの値を初期化します。

	// CSV出力用リスト
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }
	// TODO: ユーザ定義のコードを記述してください
    
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
	
	// 自社コード
	private String _COMPANY_CD;
	// 販売管理用工場コード
	private String _PLANT_WEB;
	// 業務日付
	private String _BUSINESS_OPR_DATE;
	// 邦貨コード
	private String _HOME_CUR_CD;
	// 出荷準備L/T
	private String _SHIP_LT;
	// 短納期設定日
	private String _DLV_DATE_CDT;
	// 受注時製番登録
	private String _PRD_REQ_JOB_ODR_TYP_1;
	// 受注登録時の製番採番方法
	private String _PRD_REQ_JOB_ODR_TYP_2;
	// 受注承認
	private String _APR_ODR;
	// 判断フラグ
	private String _HAN_TAN;
	
	// 会社コードをゲット
	public String get_companyCd() {
		return _COMPANY_CD;
	}
	// 会社コードをセット
	public void set_companyCd(String cd) {
		_COMPANY_CD = cd;
	}
	
	// 販売管理用工場コードをゲット
	public String get_plantWeb() {
		return _PLANT_WEB;
	}
	// 販売管理用工場コードをセット
	public void set_plantWeb(String cd) {
		_PLANT_WEB = cd;
	}
	
	// 業務日付をゲット
	public String get_businessOprDate() {
		return _BUSINESS_OPR_DATE;
	}
	// 業務日付をセット
	public void set_businessOprDate(String cd) {
		_BUSINESS_OPR_DATE = cd;
	}
	
	// 邦貨コードをゲット
	public String get_homeCurCd() {
		return _HOME_CUR_CD;
	}
	// 邦貨コードをセット
	public void set_homeCurCd(String cd) {
		_HOME_CUR_CD = cd;
	}
	
	// 出荷準備L/Tをゲット
	public String get_shipLt() {
		return _SHIP_LT;
	}
	// 出荷準備L/Tをセット
	public void set_shipLt(String cd) {
		_SHIP_LT = cd;
	}
	
	// 短納期設定日
	public String get_dlvDateCdt() {
		return _DLV_DATE_CDT;
	}
	// 短納期設定日
	public void set_dlvDateCdt(String cd) {
		_DLV_DATE_CDT = cd;
	}
	
	// 受注時製番登録
	public String getPRD_REQ_JOB_ODR_TYP_1() {
		return _PRD_REQ_JOB_ODR_TYP_1;
	}
	// 受注時製番登録
	public void setPRD_REQ_JOB_ODR_TYP_1(String cd) {
		_PRD_REQ_JOB_ODR_TYP_1 = cd;
	}
	
	// 受注登録時の製番採番方法
	public String getPRD_REQ_JOB_ODR_TYP_2() {
		return _PRD_REQ_JOB_ODR_TYP_2;
	}
	// 受注登録時の製番採番方法
	public void setPRD_REQ_JOB_ODR_TYP_2(String cd) {
		_PRD_REQ_JOB_ODR_TYP_2 = cd;
	}

	/**
     * 情報メッセージ設定処理を切り出して関数化
     * @param code メッセージコード
     * @param param メッセージパラメータ
     */
    public void setInfoMessage(String code, String param) {
    	ExpjMessage emsg = null;
    	if (param == null) {
    		emsg = new ExpjMessage(code);
    	} else {
    		emsg = new ExpjMessage(code, param);
    	}
        msgStruct.addInfo( emsg ); // 情報メッセージとして登録
        sysLog.warning(emsg, struct.getsUser_ID()); //情報内容
    }

	/**
     * エラーメッセージ設定処理を切り出して関数化
     * @param code メッセージコード
     * @param param メッセージパラメータ
     */
    public void setErrorMessage(String code, String param) {
    	ExpjMessage emsg = null;
    	if (param == null) {
    		emsg = new ExpjMessage(code);
    	} else {
    		emsg = new ExpjMessage(code, param);
    	}
        msgStruct.addError( emsg ); // エラーメッセージとして登録
        sysLog.warning(emsg, struct.getsUser_ID()); //エラー内容
    }

	/**
     * ワーニングメッセージ設定処理を切り出して関数化
     * @param code メッセージコード
     * @param param メッセージパラメータ
     */
    private void setWarningMessage(String code, String param) {
    	ExpjMessage emsg = null;
    	if (param == null) {
    		emsg = new ExpjMessage(code);
    	} else {
    		emsg = new ExpjMessage(code, param);
    	}
        msgStruct.addWarn( emsg ); // ワーニングメッセージとして登録
        sysLog.warning(emsg, struct.getsUser_ID()); //エラー内容
    }
	
	/**
	 * nullまたは空白文字ならば0、それ以外はそのままにします。
	 *
	 * @param String str
	 * @return String 変換後文字列
	 */
	private String convertNull(String str){
		if (str == null || str.equals("")) {
			return "0";
		}
		return str;
	}
    
    /**
	 * 区分名取得
	 * 
	 * @param comboStruct
	 *            区分情報リスト
	 * @param strTyp
	 *            区分コード
	 * @return 区分名称。該当するデータがなかった場合は区分コードを返す
	 */
	private String getComboTypeName(ComboStruct comboStruct, String strTyp) {
		String strTypName = strTyp;
		for (int i = 0; i < comboStruct.getValList().size(); i++) {
			if (((String) (comboStruct.getValList().get(i))).equals(strTyp)) {
				strTypName = (String) (comboStruct.getExplanList().get(i));
				break;
			}
		}
		return strTypName;
	}
	
	/**
	 * 初期値のセット
	 * @throws SQLException 
	 * @throws ComboException 
	 */
	private void setDefaultValue() throws ComboException, SQLException {
		// 見積番号
		struct.setESTIMATE_NO("0");
		// 受注登録
		struct.setrdoSHIP_INST("true");
		// 受注更新
		struct.setrdoSHIP_UPDATE("");
		// 受注日
		struct.setODR_ACPT_DATE(_BUSINESS_OPR_DATE);
		// 注文区分
		ComboBox controller = new ComboBox(conn, sysUSER_CD);
		ComboStruct stOdrTyp = controller.getData("ODR_ODR_TYP"); // 注文区分
		struct.setODR_TYP(getComboTypeName(stOdrTyp, "3"));
		// 明細番号
		struct.setDETAIL_NO("0");
	}
	/**
	 * 下段エリア初期値のセット
	 * @throws SQLException 
	 * @throws ComboException 
	 */
	private void setDefaultValue1() throws ComboException, SQLException {
		// 明細番号
		struct.setDETAIL_NO("0");
		// 受注日
		struct.setODR_ACPT_DATE(_BUSINESS_OPR_DATE);
		// 注文区分
		ComboBox controller = new ComboBox(conn, sysUSER_CD);
		ComboStruct stOdrTyp = controller.getData("ODR_ODR_TYP"); // 注文区分
		struct.setODR_TYP(getComboTypeName(stOdrTyp, "3"));
		// 受注番号
		struct.setACPT_ODR_CD("");
		// 得意先注文番号
		struct.setCUST_ODR_NO("");
		// 指定納期
		struct.setDESINATED_DLV_DATE("");
		// 手配品目種
		struct.setESTIMATE_TYPE("");
		// 得意先品目番号
		struct.setCUST_ITEM_CD("");
		// 数量
		struct.setQTY("");
		// 受注単価
		struct.setODR_UNIT_PRICE("");
		// 受注金額
		struct.setODR_AMOUNT("");
		// 備考
		struct.setISSUE_INST_COMMENT("");
		// 受注担当者コード
		struct.setCUST_CHRG_PSN_CD("");
		// 品目番号
		struct.setITEM_CD("");
		// 製番手配を同時に行う
		struct.setc_DOODR("");
		// 手配数量
		struct.setPREPARE_QTY("");
		// 製番納期
		struct.setJOB_ODR_DLV_DATE("");
		// 引当グループコード
		struct.setALC_GRP_CD("");
		// 製番を手入力する
		struct.setc_INPUTODRCD("");
		// 製番
		struct.setJOB_ODR_CD("");
		// 受注金額(邦貨)
		struct.setODR_AMOUNT_EXCH_RATES("");
		// 納品場所コード
		struct.setDLV_LOC_CD("");
		// 品目名
		struct.setITEM_NAME("");
		// 得意先品目番号名
		struct.setCUST_ITEM_NAME("");
		// 数量
		struct.setQTY_UNIT("");
		// 受注単価
		struct.setODR_PRICE_UNIT("");
		// 受注担当者コード名
		struct.setCUST_CHRG_PSN_NAME("");
		// 受注担当部門コード
		struct.setES_ORG_CD("");
		// 受注担当部門コード名
		struct.setES_ORG_NAME("");
		// 品目番号名
		struct.setITEM_NAME_R("");
	}
	
    /**
	 * 文字列非空の判断
	 * 
	 * @param str
	 *            入力する文字列
	 * @return 判断結果
	 */
	private boolean isEmpty(String str) {
		if (str == null || "".equals(str)) {
			return true;
		}
		return false;
	}

    /**
	 * 更新数のチェックを行う
	 * 
	 * @param strModicnt
	 *            更新数１
	 * @param lstModicnt
	 *            更新数2
	 * @return 更新数チェック結果 
	 */
	private boolean checkModifyCnt(String strModicnt, List lstModicnt) {

		if (isEmpty(strModicnt) || lstModicnt == null || lstModicnt.isEmpty()) {
			return false;
		} else if (!strModicnt.equals(((KM0030010Struct)lstModicnt.get(0)).getMODIFY_COUNT())) {
			return false;
		}
		
		return true;
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
		if (DateTool.compareYMD(desinatedShipDate, _BUSINESS_OPR_DATE) < 0) {
			return _BUSINESS_OPR_DATE;
		} else {
			return desinatedShipDate;
		}
	}

    /**
	 * 邦貨を換算する
	 * 
	 * @param amount
	 *            換算前金額
	 * @param beforCurCd
	 *            換算前通貨
	 * @return 換算後金額
     * @throws FoundationException 
     * @throws SQLException 
	 */
	private String getExchangeAmount(String amount, String beforCurCd) {
		String strExcAmount = "0";

		String strBeforRate = "0"; // 変換前為替レート
		String strAfterRate = "0"; // 変換後為替レート
		
		KM0030010Struct st = new KM0030010Struct();
		st.setCOMPANY_CD(_COMPANY_CD);
		st.setCUR_CD(_HOME_CUR_CD);
		List lstTmp;
		try {
			String decimalFig = "0";
			lstTmp = entity.mM_CUR.read(conn, st);
			if (lstTmp != null && !lstTmp.isEmpty()) {
				decimalFig = convertNull(((KM0030010Struct)lstTmp.get(0)).getDECIMAL_FIG());
			}
			lstTmp = entity.mM_EXCH_RATE.read(conn, st);
			if (lstTmp != null && !lstTmp.isEmpty()) {
				strAfterRate = convertNull(((KM0030010Struct)lstTmp.get(0)).getEXCH_RATE());
			}
			st.setCUR_CD(beforCurCd);
			lstTmp = entity.mM_EXCH_RATE.read(conn, st);
			if (lstTmp != null && !lstTmp.isEmpty()) {
				strBeforRate = convertNull(((KM0030010Struct)lstTmp.get(0)).getEXCH_RATE());
			}
			
			if (Double.parseDouble(strAfterRate) > 0) {
				strExcAmount = Calculate.divide(Calculate.multiply(amount, strBeforRate),
						strAfterRate, Integer.parseInt(decimalFig), Calculate.ROUND);
			}
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
		return strExcAmount;
	}

    /**
	 * 製番を取得する
	 * 
	 * @param stDetail
	 *            明細データ
	 * @param lstCustBase
	 *            納品場所情報
	 * @return 製番
     * @throws FoundationException 
     * @throws SQLException 
	 */
	private String getJobOdrCd(KM0030010Struct stDetail, List lstCustBase) throws FoundationException, SQLException {
		String strJobOdrCd = "";

		String strPlantCd = ""; // 工場コード
		if (lstCustBase != null && !lstCustBase.isEmpty()) {
			strPlantCd = ((KM0030010Struct)lstCustBase.get(0)).getSHIP_PLANT_CD();
		}
		if ("0".equals(_PRD_REQ_JOB_ODR_TYP_2) && (null == stDetail.getl_JOB_ODR_CD() || "".equals(stDetail.getl_JOB_ODR_CD()))) {
			Numbering number = new Numbering(conn,Numbering.JOB_OD_CD, struct.getsUser_ID(),sp.getProcId(), strPlantCd);
			strJobOdrCd = number.getNo();
		} else if ("1".equals(_PRD_REQ_JOB_ODR_TYP_2) && (null == stDetail.getl_JOB_ODR_CD() || "".equals(stDetail.getl_JOB_ODR_CD()))) {
			if (!isEmpty(strPlantCd)) {
				String strOdrNo = stDetail.getl_ODR_NO(); // 受注番号
				KM0030010Struct st = new KM0030010Struct();
				st.setPLANT_CD(strPlantCd);
				// 製番接頭辞を検索する
				List lstSysJobCdCtl = entity.mSYS_JOB_ODR_CD_CTRL.read(conn, st);
				if (lstSysJobCdCtl != null && !lstSysJobCdCtl.isEmpty() && ! isEmpty(strOdrNo)) {
					if (strOdrNo.startsWith("ODR")) {
						strOdrNo = strOdrNo.substring(3);
					}
					strJobOdrCd	= ((KM0030010Struct)lstSysJobCdCtl.get(0)).getJOB_OD_CD_PREFIX() + strOdrNo;
				}
			}
		} else {
			// 画面に入力した製番
			strJobOdrCd = stDetail.getl_JOB_ODR_CD();
		}
		
		return strJobOdrCd;
	}

    /**
	 * 製番手配を同時に行うのチェック
	 * 
	 * @param strOdrTyp
	 *            注文区分
	 * @param strEstimateTyp
	 *            手配品目種
	 * @return チェック結果
	 */
	private String getc_DOODRSts(String strOdrTyp, String strEstimateTyp) {
		String strResult = "false";

		// 注文区分が3：確定の場合
		if ("3".equals(strOdrTyp)) {
			if ("1".equals(strEstimateTyp)
					&& "true".equals(struct.getrdoSHIP_INST())
					&& ("2".equals(_PRD_REQ_JOB_ODR_TYP_1))) {
				strResult = "true";
			}
		}
		
		return strResult;
	}

    /**
	 * 製番手配を手入力するのチェック
	 * 
	 * @return チェック結果
	 */
	private String getc_INPUTODRCDSts(KM0030010Struct stDetail) {
		String strResult = "false";

		// PRD_REQ_JOB_ODR_TYP_2’の[パラメータ].“設定値”=’0’、’１’の場合
		if ("true".equals(stDetail.getl_c_DOODR())
							&& "2".equals(_PRD_REQ_JOB_ODR_TYP_2)) {
			strResult = "true";
		}
		
		return strResult;
	}

    /**
	 * システムパラメータの取得
	 * 
	 * @param syspara
	 *            システムパラメータ
	 * @return システムパラメータ
     * @throws SQLException 
     * @throws FoundationException 
	 */
	private String getSysParameter(String syspara) throws FoundationException, SQLException {
		String strSysval = null;
		KM0030010Struct st = new KM0030010Struct();
		st.setNAME(syspara);
		List lstsys = entity.mSYS_PARAMETER.read(conn, st);
		if (!lstsys.isEmpty()) {
			strSysval = ((KM0030010Struct)lstsys.get(0)).getVALUE();
			if (isEmpty(strSysval)) {
				strSysval = "";
			}
		}
		return strSysval;
	}

    /**
	 * 得意先情報の取得
	 * 
	 * @param custCd
	 *            得意先コード
	 * @return 得意先情報
     * @throws SQLException 
     * @throws FoundationException 
	 */
	private KM0030010Struct getCust(String custCd) throws FoundationException, SQLException {
		KM0030010Struct stCust = null;
		struct.setCUST_CD(custCd); // 得意先コード
		struct.setCOMPANY_CD(_COMPANY_CD);
		// 得意先コードの存在チェック
		List lstCust = entity.mM_CUST.read(conn, struct);
		if (lstCust == null || lstCust.isEmpty()) {
			setErrorMessage("KQ00014", null);
		} else {
			stCust = (KM0030010Struct)lstCust.get(0);
			struct.setCUST_NAME(stCust.getCUST_NAME()); // 得意先名
		}
		
		return stCust;
	}

    /**
	 * 通貨情報の取得
	 * 
	 * @param curCd
	 *            通貨コード
	 * @return 通貨情報
     * @throws SQLException 
     * @throws FoundationException 
	 */
	private KM0030010Struct getCur(String curCd) throws FoundationException, SQLException {
		KM0030010Struct stCur = null;
		struct.setCUR_CD(curCd); // 通貨コード
		
		// 通貨コードの存在チェック
		List lstCur = entity.mM_CUR.read(conn, struct);
		if (lstCur == null || lstCur.isEmpty()) {
			setErrorMessage("KQ00073", null);
		} else {
			stCur = (KM0030010Struct)lstCur.get(0);
		}
		
		return stCur;
	}

    /**
	 * [製品][品目]の情報を取得する
	 * 
	 * @param stcond
	 *            検索条件格納
	 * @param itemcd
	 *            得意先品目番号
	 * @param detailno
	 *            明細番号
	 * @return 製品情報
     * @throws SQLException 
     * @throws FoundationException 
	 */
	private KM0030010Struct getItemSpec(KM0030010Struct stcond, String itemcd, String detailno) throws FoundationException, SQLException {
		KM0030010Struct stItemSpec = null;
        if (itemcd == null) {
        	stItemSpec = new KM0030010Struct();
        } else {
        	stcond.setCUST_ITEM_CD(itemcd); // 得意先品目番号
    		
    		List lstItemSpec = entity.mM_ITEM_SPEC.read(conn, stcond);
    		if (lstItemSpec == null || lstItemSpec.isEmpty()) {
    				setWarningMessage("KM00036", detailno);
    				stItemSpec = new KM0030010Struct();
    		} else {
    			stItemSpec = (KM0030010Struct)lstItemSpec.get(0);
    		}
        }
		return stItemSpec;
	}

    /**
	 * ユーザの情報を取得する
	 * 
	 * @param userCd
	 *            ユーザコード
	 * @return ユーザ名
     * @throws SQLException 
     * @throws FoundationException 
	 */
	private String getUserName(String userCd) throws FoundationException, SQLException {
		String strOrgName = "";
		KM0030010Struct st = new KM0030010Struct();
		st.setCOMPANY_CD(_COMPANY_CD);
		st.setUSER_CD(userCd);
		
		List lstItemSpec = entity.mUSER_MST.read(conn, st);
		if (lstItemSpec != null && !lstItemSpec.isEmpty()) {
			strOrgName = ((KM0030010Struct)lstItemSpec.get(0)).getUSER_NAME();
		}
		
		return strOrgName;
	}

    /**
	 * 部門の情報を取得する
	 * 
	 * @param orgCd
	 *            部門コード
	 * @return 部門名
     * @throws SQLException 
     * @throws FoundationException 
	 */
	private String getOrgName(String orgCd) throws FoundationException, SQLException {
		String strOrgName = "";
		KM0030010Struct st = new KM0030010Struct();
		st.setCOMPANY_CD(_COMPANY_CD);
		st.setORG_CD(orgCd);
		
		List lstItemSpec = entity.mM_ORG.read(conn, st);
		if (lstItemSpec != null && !lstItemSpec.isEmpty()) {
			strOrgName = ((KM0030010Struct)lstItemSpec.get(0)).getORG_NAME();
		}
		
		return strOrgName;
	}

    /**
	 * 整数かどうかを判断する
	 * 
	 * @param strQty
	 *            入力値
	 * @return 判断結果
	 */
	private boolean isDecimal(String strQty) {
		if (!isEmpty(strQty)) {
			if (strQty.indexOf(".") >= 0 && !strQty.endsWith(".")) {
				String strDecimal = strQty.substring(strQty.indexOf(".") + 1);
				if (!isEmpty(strDecimal) && Double.parseDouble(strDecimal) > 0) {
					return true;
				}
			}
		}
		return false;
	}

    /**
	 * 製番納期の計算
	 * 
	 * @param strDesinatedDlvDate
	 *            指定納期
	 * @param lstCustBase
	 *            納品場所情報
	 * @return 製番納期
     * @throws SQLException 
     * @throws FoundationException 
     * @throws ParseException 
	 */
	private String getJobDlvDate(String strDesinatedDlvDate, List lstCustBase) throws FoundationException, SQLException {
		String strJobDlvDate = null;
		
		// 納品場所情報の取得
		if (lstCustBase != null && !lstCustBase.isEmpty()) {
			KM0030010Struct stCustBase = (KM0030010Struct)lstCustBase.get(0);
			
			int amount = Integer.parseInt(Calculate.add(stCustBase.getTRANSPORT_LT(), _SHIP_LT));
			// 業務日付計算部品の生成
			WorkCalendar wkd;
			try {
				wkd = new WorkCalendar(conn, sysUSER_CD, business.getBusinessCd(),
						stCustBase.getSHIP_PLANT_CD(), Converter.strToDate(strDesinatedDlvDate, "yyyy/MM/dd"),
						amount*(-1), true);
				Date calcDate = wkd.calcDate();
				strJobDlvDate = Converter.dateToStr(calcDate, "yyyy/MM/dd");
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		
		return strJobDlvDate;
	}
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * 読込ボタン押下時に実行される処理です。
	 *
	 */
	public void controlSelect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0030");
		logger.entering("KM0030010Control"+":USER="+struct.getsUser_ID(),"controlSelect");
			//{{user_implement_dev:<controlSelect>
			// TODO: ユーザ定義のコードを記述してください
		
		if(list != null)
		{
			list.clear();
		} else {
			list = new ArrayList();
		}
		
		try {
			// 初期値のセット
			// 受注日
			struct.setODR_ACPT_DATE(_BUSINESS_OPR_DATE);
			// 注文区分
			ComboBox controller = new ComboBox(conn, sysUSER_CD);
			ComboStruct stOdrTyp = controller.getData("ODR_ODR_TYP"); // 注文区分
			struct.setODR_TYP(getComboTypeName(stOdrTyp, "3"));
			// 明細番号
			struct.setDETAIL_NO("0");
			// 読込ステータス設定
        	setReadStatus(INITIAL);
        	
			KM0030010Struct st = new KM0030010Struct();
			KM0030010Struct sttmp = null;
			KM0030010Struct stProject = null; // 案件
			KM0030010Struct stCust = null; // 得意先
			KM0030010Struct stCur = null; // 通貨
			KM0030010Struct stEstimate = null; // 見積
			KM0030010Struct stCustBase = null; // 納品場所
			List lstDetailTarget = new ArrayList(); // 一覧の表示対象

            // コンボボックスデータ用意
            ComboStruct stestimateTyp = controller.getData("ESTIMATE_TYPE"); // 手配品目種
            ComboStruct DepoTyps = controller.getData("DEPO_TYP"); // 預託倉庫区分
            struct.seth_ODR_TYP3(getComboTypeName(stOdrTyp, "3"));

			// 案件番号の存在チェック
			List lstAnken = entity.mT_PROJECT.read(conn, struct);
			if (lstAnken == null || lstAnken.isEmpty()) {
				setErrorMessage("KM00001", null);
				return;
			}
			stProject = (KM0030010Struct)lstAnken.get(0);

			// 得意先情報の取得
			stCust = getCust(stProject.getCUST_CD());
			if (stCust == null) {
				return;
			}
			
			struct.setPROJECT_NAME(stProject.getPROJECT_NAME()); // 案件名
			st.setCUST_CD(stProject.getCUST_CD()); // 得意先コード
			st.setCOMPANY_CD(_COMPANY_CD); // 会社コード
			st.setPROJECT_CD(stProject.getPROJECT_CD()); // 案件番号
			if (null != stProject.getDLV_LOC_CD() && !"".equals(stProject.getDLV_LOC_CD())) {
				st.setDLV_LOC_CD(stProject.getDLV_LOC_CD()); // 納品場所コード
				// 納品場所情報の取得
				List lstCustBase = entity.mM_CUST_BASE.read(conn, st);
				if (lstCustBase != null && !lstCustBase.isEmpty()) {
					stCustBase = (KM0030010Struct)lstCustBase.get(0);
				}
			}else{
				stCustBase = new KM0030010Struct();
			}
			
			// [画面].“受注登録”のラジオボタンがチェックOnの場合
			if ("true".equals(struct.getrdoSHIP_INST())) {
				
    			// =======================================
    			// 読込処理（受注登録）
    			// =======================================
				
				// 「案件ステータス」が2:見積、3:内示、4:確定受注でない場合
				if (!"2".equals(stProject.getPROJECT_STAT())
						&& !"3".equals(stProject.getPROJECT_STAT())
						&& !"4".equals(stProject.getPROJECT_STAT())) {
					setErrorMessage("KM00011", null);
					return;
				}
				
				// 通貨情報の取得
				stCur = getCur(stCust.getCUR_CD());
				if (stCur == null) {
					return;
				}
				
				// [見積]の情報を取得する
				List lstEstimate = null;
				List lstEstimateR = null;
				
				if (!"0".equals(struct.getESTIMATE_NO())) {
				   lstEstimate = entity.mT_ESTIMATE.read(conn, struct);
				}
				if ("0".equals(struct.getESTIMATE_NO())) {
				   lstEstimateR = entity.mT_ESTIMATE_R.read(conn, struct);
				}
				
				if ((lstEstimate != null && lstEstimate.size() > 0) || (lstEstimateR != null && lstEstimateR.size() > 0)) {
					if (lstEstimate != null && lstEstimate.size() > 0){
						stEstimate = (KM0030010Struct)lstEstimate.get(0);
						if ("9".equals(stEstimate.getESTIMATE_STAT())) {
							setErrorMessage("KM00050", null);
							return;
						}
					}else{
						stEstimate = (KM0030010Struct)lstEstimateR.get(0);
						if ("9".equals(stEstimate.getESTIMATE_STAT())) {
							setErrorMessage("KM00050", null);
							return;
						}
						struct.setESTIMATE_NO(stEstimate.getESTIMATE_NO());
					}
					
					// [見積明細]の情報を取得する
					List lstDetail = entity.mT_ESTIMATE_DETAL.read(conn, struct);
					if (!lstDetail.isEmpty()) {
						List lstPjOdrAlc = null;
						st.setESTIMATE_NO(struct.getESTIMATE_NO()); // 見積番号
						for (int i = 0; i < lstDetail.size(); i++) {
							sttmp = (KM0030010Struct)lstDetail.get(i);
							struct.setDETAL_NO(sttmp.getDETAL_NO());
							// 承認依頼中かをチェックして、承認依頼中の場合、一覧対象から除外する
							List lstTranApr = entity.mselectT_TRAN_APR.read(conn, struct);
							st.setDETAL_NO(sttmp.getDETAL_NO());
							if (lstTranApr.size() != 0) {
								continue;
							} else {
								// 案件受注紐付に存在しない場合、一覧の表示対象とする
								lstPjOdrAlc = entity.mT_PJ_ODR_ALC.read(conn, st);
								if (lstPjOdrAlc.size()  == 0) {
									lstDetailTarget.add(sttmp);
								}
							}
						}
					}
				} else {
					setErrorMessage("ZZ06001", null);
					return;
				}
				
				
				// 一覧の表示対象データが存在しない場合
				if (lstDetailTarget.size() == 0) {
					setErrorMessage("ZZ06001", null);
					return;
				}

				KM0030010Struct stDetail = null; // 一覧の明細データ
				KM0030010Struct stItemSpec = null; // 製品
				for (int i = 0; i < lstDetailTarget.size(); i++) {
					sttmp = (KM0030010Struct)lstDetailTarget.get(i);
					
					// [製品][品目]の情報を取得する
					
					stItemSpec = getItemSpec(st, sttmp.getCUST_ITEM_CD(), sttmp.getDETAL_NO());
					
					stDetail = new KM0030010Struct();
					stDetail.setl_DETAL_NO(sttmp.getDETAL_NO()); // 明細番号
					stDetail.setl_ESTIMATE_TYPE(getComboTypeName(stestimateTyp, sttmp.getESTIMATE_TYPE())); // 手配品目種
					stDetail.setl_h_ESTIMATE_TYPE(sttmp.getESTIMATE_TYPE()); // 手配品目種
					stDetail.setl_ESTIMATE_ITEM_NAME(sttmp.getITEM_NAME()); // 品目名
					stDetail.setl_ODR_NO(null); // 受注番号
					stDetail.setl_ODR_TYP(null); // 注文区分
					stDetail.setl_CUST_ODR_NO(null); // 得意先注文番号
					stDetail.setl_CUST_ITEM_CD(sttmp.getCUST_ITEM_CD()); // 得意先品目番号
					stDetail.setl_ITEM_CD(stItemSpec.getITEM_CD()); // 品目番号
					stDetail.setl_DESINATED_DLV_DATE(sttmp.getDESINATED_DLV_DATE()); // 指定納期
					stDetail.setl_ODR_QTY(sttmp.getESTIMATE_QTY()); // 受注数量
					stDetail.setl_UNIT_CD(sttmp.getUNIT_CD()); // 単位
					stDetail.setl_ESTIMATE_UNIT_PRICE(sttmp.getESTIMATE_UNIT_PRICE()); // 受注単価
					stDetail.setl_CUR_UNIT(stCur.getCUR_UNIT()); // 通貨単位
					stDetail.setl_ODR_AMOUNT(sttmp.getESTIMATE_AMOUNT()); // 受注金額
					stDetail.setl_ODR_AMOUNT_EXCH_RATES(getExchangeAmount(stDetail.getl_ODR_AMOUNT(),
							stCust.getCUR_CD())); // 受注金額(邦貨)
					if ("1".equals(stDetail.getl_h_ESTIMATE_TYPE())) {
						stDetail.setl_DLV_LOC_CD(stProject.getDLV_LOC_CD()); // 納品場所コード
						stDetail.seth_DLV_LOC_CD(stProject.getDLV_LOC_CD()); // 納品場所コード
					}
					stDetail.setl_DLV_LOC_NAME(stCustBase.getDLV_LOC_NAME()); // 納品場所名
					stDetail.setl_DEPO_TYP(getComboTypeName(DepoTyps, stItemSpec.getDEPO_TYP())); // 預託倉庫区分
					stDetail.setl_h_DEPO_TYP(stItemSpec.getDEPO_TYP()); // 預託倉庫区分
					stDetail.setl_CUST_ITEM_NAME(stItemSpec.getCUST_ITEM_NAME()); // 得意先品目名称
					stDetail.setl_ITEM_NAME(stItemSpec.getITEM_NAME()); // 品目名称
					stDetail.setl_ODR_ACPT_DATE(_BUSINESS_OPR_DATE); // 受注日
					stDetail.setl_ESTIMATE_QTY(null); // 手配数量
					stDetail.setl_JOB_ODR_DLV_DATE(null); // 製番納期
					stDetail.setl_ALC_GRP_CD(null); // 引当グループコード
					stDetail.setl_JOB_ODR_CD(null); // 製番
					stDetail.setl_REMARKS(null); // 備考
					stDetail.setl_APPR_REMARKS(null); // 承認備考
					stDetail.setl_OWN_PERSON_CD(stEstimate.getES_USER_CD()); // 受注担当者コード
					stDetail.setl_CUST_CHRG_PSN_NAME(getUserName(stDetail.getl_OWN_PERSON_CD())); // 受注担当者名
					stDetail.setl_OWN_ORG_CD(stEstimate.getES_ORG_CD()); // 受注担当部門コード
					stDetail.setl_CUST_CHRG_ORG_NAME(getOrgName(stDetail.getl_OWN_ORG_CD())); // 受注担当部門名
					stDetail.setl_c_DOODR(getc_DOODRSts("3", sttmp.getESTIMATE_TYPE())); // 製番手配を同時に行う（非表示）
					stDetail.setl_c_INPUTODRCD(getc_INPUTODRCDSts(stDetail)); // 製番手配を手入力する（非表示）
					if (entity.mT_RLSD_PUCH_ODR.check(conn, st)) {
						stDetail.setl_h_PREC_ARRANGE_FLG("1"); // 先行手配有無フラグ（非表示）
					} else {
						stDetail.setl_h_PREC_ARRANGE_FLG("0"); // 先行手配有無フラグ（非表示）
					}
					
					stDetail.setl_h_ESTIMATE_TYPE(sttmp.getESTIMATE_TYPE());
					stDetail.setl_TEST_MODIFY_COUNT(stEstimate.getMODIFY_COUNT()); // [見積]の更新数
					stDetail.setl_TPJ_MODIFY_COUNT(stProject.getMODIFY_COUNT()); // [案件]の更新数
					
					// 為替レート の 取得エラー が発生した場合
					if (Double.parseDouble(stDetail.getl_ODR_AMOUNT_EXCH_RATES()) == 0) {
						setErrorMessage("KQ00038", String.valueOf(i + 1));
						return;
					}
					
					list.add(stDetail);
				}
				
			} else {
				// [画面].“受注更新”のラジオボタンがチェックOnの場合
				
    			// =======================================
    			// 読込処理（受注更新）
    			// =======================================
				
				// 「案件ステータス」が4:確定受注でない場合
				if (!"4".equals(stProject.getPROJECT_STAT())) {
					setErrorMessage("ZZ06001", null);
					return;
				}
				
				// 通貨情報の取得
				stCur = getCur(stCust.getCUR_CD());
				if (stCur == null) {
					return;
				}
				
				// [見積]の情報を取得する
				List lstEstimate = null;
			    List lstEstimateR = null;
			    
				if (!"0".equals(struct.getESTIMATE_NO())) {
				   lstEstimate = entity.mT_ESTIMATE2.read(conn, struct);
				}
				if ("0".equals(struct.getESTIMATE_NO())) {
				   lstEstimateR = entity.mT_ESTIMATE2_R.read(conn, struct);
				}
				if ((lstEstimate != null && lstEstimate.size() > 0) || (lstEstimateR != null && lstEstimateR.size() > 0)) {
					if (lstEstimate != null && lstEstimate.size() > 0){
						stEstimate = (KM0030010Struct)lstEstimate.get(0);
					}else{
						stEstimate = (KM0030010Struct)lstEstimateR.get(0);
						struct.setESTIMATE_NO(stEstimate.getESTIMATE_NO());
					}
					
					// [見積明細]の情報を取得する
					List lstDetail = entity.mT_ESTIMATE_DETAL.read(conn, struct);
					if (lstDetail != null) {
						List lstPjOdrAlc = null;
						KM0030010Struct stPjOdrAlc = null;
						if (!"0".equals(struct.getESTIMATE_NO())) {
						   st.setESTIMATE_NO(stEstimate.getESTIMATE_NO()); // 見積番号
						}
						if ("0".equals(struct.getESTIMATE_NO())) {
						   st.setESTIMATE_NO(stEstimate.getESTIMATE_NO()); // 見積番号
						}
						for (int i = 0; i < lstDetail.size(); i++) {
							sttmp = (KM0030010Struct)lstDetail.get(i);
							struct.setDETAL_NO(sttmp.getDETAL_NO());
							lstPjOdrAlc = entity.mT_PJ_ODR_ALC.read(conn, st);
							// 承認依頼中かをチェックして、承認依頼中の場合、一覧対象から除外する
							List lstTranApr = entity.mselectT_TRAN_APR1.read(conn, struct);
							if (lstTranApr.size() != 0) {
								continue;
							} 

							st.setDETAL_NO(sttmp.getDETAL_NO());
							lstPjOdrAlc = entity.mT_PJ_ODR_ALC.read(conn, st);
														
							if (lstPjOdrAlc != null && !lstPjOdrAlc.isEmpty()) {
								stPjOdrAlc = (KM0030010Struct)lstPjOdrAlc.get(0);
								
								sttmp.setESTIMATE_TYPE(stPjOdrAlc.getESTIMATE_TYPE()); // 手配品目種
								sttmp.setODR_NO(stPjOdrAlc.getODR_NO()); // 受注番号
								
								lstDetailTarget.add(sttmp);
							}
						}
					}
				} else {
					setErrorMessage("ZZ06001", null);
					return;
				}
				
				// 一覧の表示対象データが存在しない場合
				if (lstDetailTarget.size() == 0) {
					setErrorMessage("ZZ06001", null);
					return;
				}

				KM0030010Struct stDetail = null; // 一覧の明細データ
				KM0030010Struct stItemSpec = null; // 製品
				KM0030010Struct stItemSpec1 = null; // 製番計画
				KM0030010Struct stOdr = null; // 受注明細
				List lstOdr = null;
				for (int i = 0; i < lstDetailTarget.size(); i++) {
					sttmp = (KM0030010Struct)lstDetailTarget.get(i);
					
					st.setODR_NO(sttmp.getODR_NO()); // 受注番号
					st.setCOMPANY_CD(_COMPANY_CD); // 会社コード
					// 手配品目種が1:製品の場合
					if ("1".equals(sttmp.getESTIMATE_TYPE())) {
						lstOdr = entity.mT_ODR.read(conn, st);
					} else {
						lstOdr = entity.mT_ODR_UNSTOCK.read(conn, st);
					}
					if (lstOdr == null || lstOdr.isEmpty()) {
						continue;
					}
					stOdr = (KM0030010Struct)lstOdr.get(0);
					
                    if ("1".equals(sttmp.getESTIMATE_TYPE())) {
                    	// [製品][品目]の情報を取得する
    					stItemSpec = getItemSpec(st, stOdr.getl_CUST_ITEM_CD(), sttmp.getDETAL_NO());
                    }else{
                    	KM0030010Struct sItem = new KM0030010Struct();
                    	sItem.setITEM_CD(stOdr.getl_ITEM_CD());
                    	List lstItemSpec = entity.mselectM_ITEM.read(conn, sItem);
                		if (lstItemSpec == null || lstItemSpec.isEmpty()) {
                			stItemSpec = new KM0030010Struct();
                		} else {
                			stItemSpec = (KM0030010Struct)lstItemSpec.get(0);
                		}
                    }
					
					stDetail = new KM0030010Struct();
					stDetail.setl_DETAL_NO(sttmp.getDETAL_NO()); // 明細番号
					stDetail.setl_ESTIMATE_TYPE(getComboTypeName(stestimateTyp, sttmp.getESTIMATE_TYPE())); // 手配品目種
					stDetail.setl_h_ESTIMATE_TYPE(sttmp.getESTIMATE_TYPE()); // 手配品目種
					stDetail.setl_ESTIMATE_ITEM_NAME(sttmp.getITEM_NAME()); // 品目名
					stDetail.setl_ODR_NO(stOdr.getl_ODR_NO()); // 受注番号
					if ("1".equals(sttmp.getESTIMATE_TYPE())) {
						stDetail.setl_ODR_TYP(getComboTypeName(stOdrTyp, stOdr.getl_ODR_TYP())); // 注文区分
						stDetail.setl_h_ODR_TYP(stOdr.getl_ODR_TYP());
						stDetail.setl_CUST_ITEM_CD(stOdr.getl_CUST_ITEM_CD()); // 得意先品目番号
						stDetail.setl_DLV_LOC_CD(stOdr.getl_DLV_LOC_CD()); // 納品場所コード
						if (null != stDetail.getl_DLV_LOC_CD() && !"".equals(stDetail.getl_DLV_LOC_CD())) {
							st.setDLV_LOC_CD(stDetail.getl_DLV_LOC_CD()); // 納品場所コード
							// 納品場所情報の取得
							List lstCustBase = entity.mM_CUST_BASE.read(conn, st);
							if (lstCustBase != null && !lstCustBase.isEmpty()) {
								stCustBase = (KM0030010Struct)lstCustBase.get(0);
							}
						}else{
							stCustBase = new KM0030010Struct();
						}
						stDetail.setl_DLV_LOC_NAME(stCustBase.getDLV_LOC_NAME()); // 納品場所名
					} else {
						stDetail.setl_ODR_TYP(getComboTypeName(stOdrTyp, "3")); // 注文区分
						stDetail.setl_h_ODR_TYP("3");
						stDetail.setl_CUST_ITEM_CD(null); // 得意先品目番号
						stDetail.setl_DLV_LOC_CD(null); // 納品場所コード
					}
					// 製番情報の取得
					List lstJobOdrR = entity.mT_JOB_ODR_R.read(conn, st);
					if (lstJobOdrR == null || lstJobOdrR.isEmpty()) {
            			stItemSpec1 = new KM0030010Struct();
            		} else {
            			stItemSpec1 = (KM0030010Struct)lstJobOdrR.get(0);
            		}
					stDetail.setl_CUST_ODR_NO(stOdr.getl_CUST_ODR_NO()); // 得意先注文番号
					
					stDetail.setl_ITEM_CD(stOdr.getl_ITEM_CD()); // 品目番号
					stDetail.setl_DESINATED_DLV_DATE(stOdr.getl_DESINATED_DLV_DATE()); // 指定納期
					stDetail.setl_ODR_QTY(stOdr.getl_ODR_QTY()); // 受注数量
					stDetail.setl_UNIT_CD(stOdr.getl_UNIT_CD()); // 単位
					stDetail.setl_ESTIMATE_UNIT_PRICE(stOdr.getl_ESTIMATE_UNIT_PRICE()); // 受注単価
					stDetail.setl_CUR_UNIT(stCur.getCUR_UNIT()); // 通貨単位
					stDetail.setl_ODR_AMOUNT(stOdr.getl_ODR_AMOUNT()); // 受注金額
					stDetail.setl_ODR_AMOUNT_EXCH_RATES(stOdr.getl_ODR_AMOUNT_EXCH_RATES()); // 受注金額(邦貨)
					
					stDetail.setl_DEPO_TYP(getComboTypeName(DepoTyps, stItemSpec.getDEPO_TYP())); // 預託倉庫区分
					stDetail.setl_h_DEPO_TYP(stItemSpec.getDEPO_TYP()); // 預託倉庫区分
					stDetail.setl_CUST_ITEM_NAME(stItemSpec.getCUST_ITEM_NAME()); // 得意先品目名称
					stDetail.setl_ITEM_NAME(stItemSpec.getITEM_NAME()); // 品目名称
					stDetail.setl_ODR_ACPT_DATE(stOdr.getl_ODR_ACPT_DATE()); // 受注日
					stDetail.setl_ESTIMATE_QTY(stItemSpec1.getJOB_ODR_QTY()); // 手配数量
					stDetail.setl_JOB_ODR_DLV_DATE(stItemSpec1.getJOB_ODR_DLV_DATE()); // 製番納期
					stDetail.setl_ALC_GRP_CD(stItemSpec1.getALC_GRP_CD()); // 引当グループコード
					stDetail.setl_JOB_ODR_CD(stItemSpec1.getJOB_ODR_CD()); // 製番
					stDetail.setl_REMARKS(stOdr.getl_REMARKS()); // 備考
					stDetail.setl_APPR_REMARKS(null); // 承認備考
					stDetail.setl_OWN_PERSON_CD(stOdr.getl_OWN_PERSON_CD()); // 受注担当者コード
					stDetail.setl_CUST_CHRG_PSN_NAME(getUserName(stDetail.getl_OWN_PERSON_CD())); // 受注担当者名
					stDetail.setl_OWN_ORG_CD(stOdr.getl_OWN_ORG_CD()); // 受注担当部門コード
					stDetail.setl_CUST_CHRG_ORG_NAME(getOrgName(stDetail.getl_OWN_ORG_CD())); // 受注担当部門名
					stDetail.setl_c_DOODR(getc_DOODRSts(stDetail.getl_h_ODR_TYP(), sttmp.getESTIMATE_TYPE())); // 製番手配を同時に行う（非表示）
					stDetail.setl_c_INPUTODRCD(getc_INPUTODRCDSts(stDetail)); // 製番手配を手入力する（非表示）
					if (entity.mT_RLSD_PUCH_ODR.check(conn, st)) {
						stDetail.setl_h_PREC_ARRANGE_FLG("1"); // 先行手配有無フラグ（非表示）
					} else {
						stDetail.setl_h_PREC_ARRANGE_FLG("0"); // 先行手配有無フラグ（非表示）
					}
					
					stDetail.setl_h_ESTIMATE_TYPE(sttmp.getESTIMATE_TYPE());
					stDetail.setl_TODR_MODIFY_COUNT(stOdr.getl_TODR_MODIFY_COUNT()); // [受注明細]の更新数
					stDetail.setl_TEST_MODIFY_COUNT(stEstimate.getMODIFY_COUNT()); // [見積]の更新数
					stDetail.setl_TPJ_MODIFY_COUNT(stProject.getMODIFY_COUNT()); // [案件]の更新数
					List listTemp = entity.mselectT_ANS_DLV_DATE.read(conn, stDetail);
					if(listTemp.isEmpty()){
						stDetail.setl_h_ANS_DLV_DATE_EXIST_FLG("N");
					}else{
						KM0030010Struct wStruct = (KM0030010Struct) listTemp.get(0);
						stDetail.setl_h_ANS_DLV_DATE_EXIST_FLG( wStruct.getl_h_ANS_DLV_DATE_EXIST_FLG() );
					}
					list.add(stDetail);
				}
			}
            setReadStatus(NORMAL);
            
            // 一覧の表示対象データが存在しない場合
			if (list.size() == 0) {
				setErrorMessage("ZZ06001", null);
				return;
			}
			
		} catch(SQLException e) {
			e.printStackTrace();
            setReadStatus(ERROR);
		}
                //}}user_implement_dev:<controlSelect>
		logger.exiting("KM0030010Control"+":USER="+struct.getsUser_ID(),"controlSelect");

		return;
	}

	/**
	 * 修正ボタン押下時に実行される処理です。
	 *
	 */
	public void controlModify() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0030");
		logger.entering("KM0030010Control"+":USER="+struct.getsUser_ID(),"controlModify");
			//{{user_implement_dev:<controlModify>
			// TODO: ユーザ定義のコードを記述してください
		try {
			KM0030010Struct st = new KM0030010Struct();
			KM0030010Struct stDetail = null;
			KM0030010Struct stCustBase = null;
			KM0030010Struct sttmp = null;
			
			st.setCUST_CD(struct.getCUST_CD()); // 得意先コード
			st.setCOMPANY_CD(_COMPANY_CD); // 会社コード
			st.setDLV_LOC_CD(struct.getDLV_LOC_CD()); // 納品場所コード
			st.setl_DLV_LOC_NAME(struct.getDLV_LOC_NAME()); // 納品場所名
			
			// 納品場所コードの取得を行う
			List lstCustBase = entity.mM_CUST_BASE.read(conn, st);
			// [得意先納品場所] に存在しない場合
			if (lstCustBase == null || lstCustBase.isEmpty()) {
				if ("1".equals(struct.geth_ESTIMATE_TYPE())) {
					setErrorMessage("KQ00015", null);
					return;	
				} else {
					stCustBase = new KM0030010Struct();
				}
			} else if (lstCustBase.size() > 1) {
				if ("1".equals(struct.geth_ESTIMATE_TYPE())) {
					setErrorMessage("KQ00016", null);
					return;
				} else {
					stCustBase = new KM0030010Struct();
				}
			} else {
				stCustBase = (KM0030010Struct)lstCustBase.get(0);
			}
			KM0030010Struct stCheckItemSpec = null;
			
			// [画面].“受注登録”のラジオボタンがチェックOnの場合
			if ("true".equals(struct.getrdoSHIP_INST())) {
				
				st.setCUST_ITEM_CD(struct.getCUST_ITEM_CD()); // 得意先品目番号
				List lstCheckItemSpec = entity.mCHECK_M_ITEM_SPEC.read(conn, st);
				// [製品] に存在しない場合
				if ((lstCheckItemSpec == null || lstCheckItemSpec.isEmpty())) {
					if(!"".equals(st.getCUST_ITEM_CD())){
						setErrorMessage("KQ00017", null);
						return;
					}else{
						stCheckItemSpec = new KM0030010Struct();
					}
				} else  {
					stCheckItemSpec = (KM0030010Struct)lstCheckItemSpec.get(0);
					
					// [品目] に存在しない場合
					if (isEmpty(stCheckItemSpec.getITEM_CD())) {
						setErrorMessage("KQ00027", null);
						return;
					}
					st.setITEM_CD(stCheckItemSpec.getITEM_CD()); // 品目番号
					
					// [製品].“預託倉庫区分"　＝　20:預託 の場合
					if ("20".equals(stCheckItemSpec.getDEPO_TYP())) {
						
						// [得意先納品場所].“払出預託保管区" ＝　Null　の場合
						if (isEmpty(stCustBase.getDEPO_WH_CD())) {
							setErrorMessage("KQ20001", null);
							return;
						}
						
						// [画面].“注文区分" ＝　3:確定　の場合
						if ("3".equals(struct.geth_ODR_TYP())) {
							setErrorMessage("KQ00081", null);
							return;
						}
					}
				}
			} else {
				st.setITEM_CD(struct.getITEM_CD()); // 品目番号
			}
			List lstItem = entity.mM_ITEM.read(conn, st);
			// 製品情報の取得
			List lstDetail = entity.mT_ESTIMATE_DETAL1.read(conn, struct);
			if (lstDetail != null && !lstDetail.isEmpty()) {
				sttmp = (KM0030010Struct)lstDetail.get(0);
			} else {
				sttmp = new KM0030010Struct();
			}
			
			if (lstItem != null && !lstItem.isEmpty()) {
				KM0030010Struct stItem = (KM0030010Struct)lstItem.get(0);
				// [品目]."在庫数単位区分" ＝ 1:整数管理 かつ[画面]."受注数量" が 整数でない場合
				if ("1".equals(stItem.getUNIT_QTY_TYP()) && isDecimal(struct.getQTY())) {
					setWarningMessage("KQ20004", null);
					struct.setQTY(Calculate.ceil(struct.getQTY(), 0));
					struct.setODR_AMOUNT(Calculate.multiply(struct.getQTY(), struct.getODR_UNIT_PRICE()));
					struct.setODR_AMOUNT_EXCH_RATES(getExchangeAmount(struct.getODR_AMOUNT(),
							_HOME_CUR_CD)); // 受注金額(邦貨)
				}
			}
			
            // コンボボックスデータ用意
            ComboBox controller = new ComboBox(conn, sysUSER_CD);
            ComboStruct stOdrTyp = controller.getData("ODR_ODR_TYP"); // 注文区分
            ComboStruct DepoTyps = controller.getData("DEPO_TYP"); // 預託倉庫区分
			
			for (int i = 0; i < list.size(); i++) {
				stDetail = (KM0030010Struct)list.get(i);
				if (struct.getDETAIL_NO().equals(stDetail.getl_DETAL_NO())) {
					
					stDetail.setl_CUST_ODR_NO(struct.getCUST_ODR_NO()); // 得意先注文番号
					stDetail.setl_DESINATED_DLV_DATE(struct.getDESINATED_DLV_DATE()); // 指定納期
					
					stDetail.setl_DLV_LOC_NAME(stCustBase.getDLV_LOC_NAME()); // 納品場所名
					stDetail.setl_ODR_ACPT_DATE(struct.getODR_ACPT_DATE()); // 受注日
					stDetail.setl_REMARKS(struct.getISSUE_INST_COMMENT()); // 備考
					stDetail.setl_APPR_REMARKS(struct.getAPPROVED_COMMENT()); // 承認備考
					stDetail.setl_OWN_PERSON_CD(struct.getCUST_CHRG_PSN_CD()); // 受注担当者コード
					stDetail.setl_OWN_ORG_CD(struct.getES_ORG_CD()); // 受注担当部門コード
					stDetail.setl_CUST_CHRG_PSN_NAME(getUserName(stDetail.getl_OWN_PERSON_CD())); // 受注担当者名
					stDetail.setl_CUST_CHRG_ORG_NAME(getOrgName(stDetail.getl_OWN_ORG_CD())); // 受注担当部門名
					
					// [画面].“受注登録”のラジオボタンがチェックOnの場合
					if ("true".equals(struct.getrdoSHIP_INST())) {
						stDetail.setl_ODR_TYP(getComboTypeName(stOdrTyp, struct.geth_ODR_TYP())); // 注文区分
						stDetail.setl_h_ODR_TYP(struct.geth_ODR_TYP()); //注文区分
						stDetail.setl_CUST_ITEM_CD(struct.getCUST_ITEM_CD()); // 得意先品目番号
						stDetail.setl_ITEM_CD(st.getITEM_CD()); // 品目番号
						stDetail.setl_h_DEPO_TYP(stCheckItemSpec.getDEPO_TYP());// 預託倉庫区分
						stDetail.setl_DEPO_TYP(getComboTypeName(DepoTyps, stCheckItemSpec.getDEPO_TYP())); // 預託倉庫区分
						stDetail.setl_CUST_ITEM_NAME(stCheckItemSpec.getCUST_ITEM_NAME()); // 得意先品目名称
						stDetail.setl_ITEM_NAME(stCheckItemSpec.getITEM_NAME()); // 品目名称
						stDetail.setl_JOB_ODR_CD(struct.getJOB_ODR_CD()); // 製番
						stDetail.setl_ESTIMATE_QTY(struct.getPREPARE_QTY()); // 手配数量
						stDetail.setl_JOB_ODR_DLV_DATE(struct.getJOB_ODR_DLV_DATE()); // 製番納期
						stDetail.setl_UNIT_CD(sttmp.getUNIT_CD()); // 単位
						stDetail.setl_ALC_GRP_CD(struct.getALC_GRP_CD()); // 引当グループコード
						stDetail.setl_c_DOODR(struct.getc_DOODR()); // 製番手配を同時に行う（非表示）
						stDetail.setl_c_INPUTODRCD(struct.getc_INPUTODRCD()); // 製番手配を手入力する（非表示）
						stDetail.setl_ODR_QTY(struct.getQTY()); // 受注数量
						stDetail.setl_ODR_AMOUNT(struct.getODR_AMOUNT()); // 受注金額
						stDetail.setl_ODR_AMOUNT_EXCH_RATES(struct.getODR_AMOUNT_EXCH_RATES()); // 受注金額(邦貨)
						stDetail.setl_DLV_LOC_CD(stCustBase.getDLV_LOC_CD()); // 納品場所コード
					} else {
						stDetail.setl_ODR_QTY(struct.getQTY()); // 受注数量
						stDetail.setl_ODR_AMOUNT(struct.getODR_AMOUNT()); // 受注金額
						stDetail.setl_ODR_AMOUNT_EXCH_RATES(struct.getODR_AMOUNT_EXCH_RATES()); // 受注金額(邦貨)
						stDetail.seth_UPDATE_FLG("1"); // 更新フラグ(非表示)(1:更新)
						if ("1".equals(stDetail.getl_h_ESTIMATE_TYPE())) {
							stDetail.setl_DLV_LOC_CD(stCustBase.getDLV_LOC_CD()); // 納品場所コード
						}
					}
					break;
				}
			}
            setReadStatus(NORMAL);
            setDefaultValue1();
			
		} catch(Exception e) {
			e.printStackTrace();
            setReadStatus(ERROR);
            throw new ExpjException(e);
		}
                //}}user_implement_dev:<controlModify>
		logger.exiting("KM0030010Control"+":USER="+struct.getsUser_ID(),"controlModify");

		return;
	}

	/**
	 * 登録ボタン押下時に実行される処理です。
	 *
	 */
	public void controlInsert() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0030");
		logger.entering("KM0030010Control"+":USER="+struct.getsUser_ID(),"controlInsert");
			//{{user_implement_dev:<controlInsert>
		try {
			KM0030010Struct st = new KM0030010Struct();
			KM0030010Struct stDetail = null;
			KM0030010Struct stCustBase = null;
			KM0030010Struct stItem = null;
			List lstTOdrCtl = null;
			List lstCustBase = null;
			List lstItem = null;
			String strOdr = ""; // 受注番号
			String strCtlOdr = ""; // 受注管理番号
			String strDlvDateCdt = DateTool.addDay(_BUSINESS_OPR_DATE, _DLV_DATE_CDT); // 短納期
			boolean isNearDlvDate = false;
			// 全レコードの登録処理
			boolean appSucessFlg = false;

			beginTransaction();
			
			// =======================================
			// 得意先情報の取得
			// =======================================
			st.setCUST_CD(struct.getCUST_CD()); // 得意先コード
			st.setCOMPANY_CD(_COMPANY_CD); // 会社コード
			st.setPROJECT_CD(struct.getPROJECT_CD()); // 案件番号
			st.setESTIMATE_NO(struct.getESTIMATE_NO()); // 見積番号
			st.setsUser_ID(this.getsysUSER_CD()); // ユーザコード
			List lstCust = entity.mM_CUST.read(conn, st);
			KM0030010Struct stCust = (KM0030010Struct)lstCust.get(0);

			for (int i = 0; i < list.size(); i++) {
				stDetail = (KM0030010Struct)list.get(i);
				
				// 得意先注文番号がnullでない行を対象に登録処理を行う
				if (isEmpty(stDetail.getl_CUST_ODR_NO())) {
					continue;
				}
					
				// 手配品目種が製品の場合
				if ("1".equals(stDetail.getl_h_ESTIMATE_TYPE())) {
					
					st.setDLV_LOC_CD(stDetail.getl_DLV_LOC_CD()); // 納品場所コード
					// 納品場所情報の取得
					lstCustBase = entity.mM_CUST_BASE.read(conn, st);
					if (lstCustBase != null && !lstCustBase.isEmpty()) {
						stCustBase = (KM0030010Struct)lstCustBase.get(0);
						st.setPLANT_CD(stCustBase.getSHIP_PLANT_CD());
					}
					// 製品情報の取得
					st.setCUST_CD(struct.getCUST_CD()); // 得意先コード
					st.setCOMPANY_CD(_COMPANY_CD); // 会社コード
					st.setCUST_ITEM_CD(stDetail.getl_CUST_ITEM_CD()); // 得意先品目番号
					lstItem = entity.mM_ITEM_SPEC2.read(conn, st);
					if (lstItem != null && !lstItem.isEmpty()) {
						stItem = (KM0030010Struct)lstItem.get(0);
					}

					// 短納期受注の場合
					if (DateTool.compareYMD(stDetail.getl_DESINATED_DLV_DATE(), strDlvDateCdt) <= 0) {
						isNearDlvDate = true;
					}
					// 受注登録時の製番採番方法
					st.setNAME("PRD_REQ_JOB_ODR_TYP_2");
					List resultList = entity.mSYS_PARAMETER.read(conn, st);
					if (!resultList.isEmpty()) {
						_PRD_REQ_JOB_ODR_TYP_2 = ((KM0030010Struct)resultList.get(0)).getVALUE();
						struct.seth_PRD_REQ_JOB_ODR_TYP_2(_PRD_REQ_JOB_ODR_TYP_2);
					}
					// 製番を同時に登録する場合
					String strJobOdrCd = null;
					if ("true".equals(stDetail.getl_c_DOODR())) {
						// 製番を採番する
						strJobOdrCd = getJobOdrCd(stDetail, lstCustBase); // 製番
						if (isEmpty(strJobOdrCd)) {
							setErrorMessage("AB00023", null);
							return;
						}
						stDetail.setl_JOB_ODR_CD(strJobOdrCd);
					}
					// 一覧の明細行.”製番”のコントロールがnullでない場合
					if ("true".equals(stDetail.getl_c_DOODR())) {
						
						st.setJOB_ODR_CD(stDetail.getl_JOB_ODR_CD()); // 製番
						// 製番が[製番計画]に存在する場合
						if (entity.mCHECK_JOB_ODR_CD.check(conn, st)) {
							setErrorMessage("ZZ01102", null);
							return;
						}
						st.setITEM_CD(stDetail.getl_ITEM_CD()); // 品目番号
						// [品目].“品目手配区分”　が１：製番、2：在庫引当型製番以外の場合
						if (!entity.mCHECK_M_ITEM.check(conn, st)) {
							setErrorMessage("KQ00324", null);
							return;
						}
						
						// 生産工場（納品場所コードからその出荷倉庫がある工場取得）のカレンダが取得できない場合/生産工場の業務運用日を取得できなかった場合
						if (!entity.mCHECK_CAL.check(conn, st)) {
							setErrorMessage("KQ00325", null);
							return;
						}
						// 生産工場の業務運用日を取得できなかった場合
						resultList = entity.mSYS_DATE_CTRL.read(conn, st);
						if (resultList.isEmpty()) {
							setErrorMessage("KQ00330", null);
							return;
						} 
						
						// 製番納期がNull以外の場合
						KM0030010Struct stResult = (KM0030010Struct)resultList.get(0);;
						if (!isEmpty(stDetail.getl_JOB_ODR_DLV_DATE())) {
							// （生産工場の）業務運用日　＞　製番納期の場合
							if (DateTool.compareYMD(stResult.getBUSINESS_OPR_DATE(), stDetail.getl_JOB_ODR_DLV_DATE()) > 0) {
								setErrorMessage("KQ00331", null);
								return;
							}
							
							st.setJOB_ODR_DLV_DATE(stDetail.getl_JOB_ODR_DLV_DATE()); // 製番納期
							// 生産工場で非稼働日の場合
							if (entity.mCHECK_HOLIDAY.check(conn, st)) {
								setErrorMessage("KQ00326", null);
								return;
							}
						} else {
							// 製番納期算出が何らかの理由でできないとき
							String strJobDlvDate = getJobDlvDate(stDetail.getl_DESINATED_DLV_DATE(), lstCustBase);
							if (isEmpty(strJobDlvDate)) {
								setErrorMessage("KQ00327", null);
								return;
							}
							
							// （生産工場の）業務運用日　＞　計算された製番納期の場合
							 
							if (DateTool.compareYMD(stResult.getBUSINESS_OPR_DATE(), strJobDlvDate) > 0) {
								setWarningMessage("KQ00332", null);
							}
							stDetail.setl_JOB_ODR_DLV_DATE(strJobDlvDate);
						}
					}
					
					// パラメータ「受注承認」が1の時
					if ("1".equals(struct.geth_APR_ODR())) {
						
						// 受注担当部門存在チェック
						if (isEmpty(stDetail.getl_OWN_ORG_CD())) {
							setErrorMessage("KQ00335", null);
							return;
						}
						stDetail.setsUser_ID(struct.getsUser_ID());
						stDetail.setCUST_CD(struct.getCUST_CD());
						stDetail.setPROJECT_CD(struct.getPROJECT_CD());
						stDetail.setESTIMATE_NO(struct.getESTIMATE_NO());
						stDetail.setCUST_NAME(struct.getCUST_NAME());
						// 【受注承認依頼処理】を実行する
						ApprProc.execInsertProcess(conn, stDetail, this);
						appSucessFlg = true;
						continue;
					}

	    			// =======================================
	    			// 受注管理番号の取得
	    			// =======================================
					st.setCUST_ITEM_CD(stDetail.getl_CUST_ITEM_CD());
					st.setITEM_CD(stDetail.getl_ITEM_CD());
					lstTOdrCtl = entity.mT_ODR_CTL.read(conn, st);
					
					// 該当レコードが無い場合
					if (lstTOdrCtl == null || lstTOdrCtl.isEmpty()) {
						
		    			// =======================================
		    			// 受注管理の登録
		    			// =======================================
						
						List lstSeqOdrCtl = entity.mSEQ_ODR_CTL.read(conn, st);
						if (lstSeqOdrCtl.isEmpty()) {
							setErrorMessage("KQ00030", String.valueOf(i + 1));
							return;
						}
						strCtlOdr = ((KM0030010Struct)lstSeqOdrCtl.get(0)).getODR_CTL_NO(); // 受注管理番号
						st.setODR_CTL_NO(strCtlOdr); // 受注管理番号
						st.setCUST_ITEM_CD(stDetail.getl_CUST_ITEM_CD()); // 得意先品目番号
						st.setCUST_ITEM_NAME(stDetail.getl_CUST_ITEM_NAME()); // 得意先品目名称
						st.setITEM_CD(stDetail.getl_ITEM_CD()); // 品目番号
						st.setITEM_NAME(stDetail.getl_ITEM_NAME()); // 品目名称
						
						// 受注管理の登録を行う
						entity.mT_ODR_CTL.create(conn, st);
						
					} else if (lstTOdrCtl.size() > 1) {
						setErrorMessage("KQ00029", String.valueOf(i + 1));
						return;
					} else {
						strCtlOdr = ((KM0030010Struct)lstTOdrCtl.get(0)).getODR_CTL_NO(); // 受注管理番号
					}
					
	    			// =======================================
	    			// 受注明細の登録
	    			// =======================================
					
					List lstSeqOdr = entity.mSEQ_ODR.read(conn, st);
					if (lstSeqOdr.isEmpty()) {
						setErrorMessage("KQ00031", String.valueOf(i + 1));
						return;
					}
					String strOdrNo = ((KM0030010Struct)lstSeqOdr.get(0)).getODR_NO(); // // 受注番号
					st.setODR_NO(strOdrNo); // 受注番号
					st.setODR_TYP(stDetail.getl_h_ODR_TYP()); // 注文区分
					st.setODR_CTL_NO(strCtlOdr); // 受注管理番号
					st.setCUST_ODR_NO(stDetail.getl_CUST_ODR_NO()); // 得意先注文番号
					st.setCUST_CHRG_ORG_CD(stDetail.getl_OWN_ORG_CD()); // 営業担当部門コード
					st.setCUST_CHRG_PSN_CD(stDetail.getl_OWN_PERSON_CD()); // 営業担当者コード
					st.setODR_ACPT_PSN_CD(this.getsysUSER_CD()); // 発行担当者コード
					st.setCURRNCY_CD(stCust.getCUR_CD()); // 通貨コード
					st.setEXCH_TYP(stCust.getEXCH_TYP()); // 為替種別
					st.setDLV_LOC_CD(stDetail.getl_DLV_LOC_CD()); // 納品場所コード
					st.setDLV_LOC_NAME_KANJI(stDetail.getl_DLV_LOC_NAME()); // 納品場所名（漢字）
					st.setODR_UNIT_PRICE(stDetail.getl_ESTIMATE_UNIT_PRICE()); // 受注単価
					st.setSPCL_PRICE_TYP("1"); // 特値区分
					st.setDEPO_TYP(stDetail.getl_h_DEPO_TYP()); // 預託倉庫区分
					st.setDESINATED_DLV_DATE(stDetail.getl_DESINATED_DLV_DATE()); // 指定納期
					st.setSTD_DESINATED_RCV_DATE(stDetail.getl_DESINATED_DLV_DATE()); // 基準入庫指定納期
					st.setODR_QTY(stDetail.getl_ODR_QTY()); // 受注数量
					st.setREMAIN_UNCONFIRM_ODR_QTY("0"); // 内示残数量
					st.setCANCELED_UNCONFIRM_ODR_QTY("0"); // 内示減数量
					st.setUNIT_CD(stDetail.getl_UNIT_CD()); // 単位
					st.setUNCONFIRM_ODR_BALANCE("0"); // 内示残金額
					st.setODR_AMOUNT(Calculate.multiply(convertNull(st.getODR_UNIT_PRICE()), convertNull(st.getODR_QTY()))); // 受注金額
					st.setODR_AMOUNT_EXCH_RATES(getExchangeAmount(st.getODR_AMOUNT(),
							st.getCURRNCY_CD())); // 受注金額（邦貨）
					st.setODR_CMPLT_FLG("0"); // 受注完了フラグ
					st.setPART_NAME(getSysParameter("SHIP_SLIP_PART_NAME")); // 一般品名
					st.setTRANSPORT_CD(stCustBase.getTRANSPORT_CD()); // 運送便コード
					st.setTRANSPORT_TYP(stCustBase.getTRANSPORT_TYP()); // 輸送形態区分
					st.setTAX_APPLY_TYP(stCust.getTAX_APPLY_TYP()); // 消費税適用区分
					String strTAX_CD = stCust.getTAX_CD() ;
					if( "1".equals(stCust.getTAX_APPLY_TYP()) ) { //製品マスタの消費税コード
						strTAX_CD = stItem.getTAX_CD();
					}
					st.setTAX_CD(strTAX_CD); // 消費税コード
					st.setTAX_CALC_TYP(stCust.getTAX_CALC_TYP()); // 消費税計算区分
					st.setREMARKS(stDetail.getl_REMARKS()); // 備考
					st.setODR_ACPT_DATE(stDetail.getl_ODR_ACPT_DATE()); // 受注日
					// 短納期受注の場合
					if (isNearDlvDate) {
						st.setSHIP_PLAN_REMAIN_QTY("0"); // 出荷計画残数量
					} else {
						st.setSHIP_PLAN_REMAIN_QTY(stDetail.getl_ODR_QTY()); // 出荷計画残数量
					}
					st.setSHIP_PLAN_CMPLT_FLG("0"); // 出荷計画完了フラグ
					st.setUNCONFIRMED_ODR_EFF_OVR_FLG("0"); // 内示有効期間超過フラグ
					st.setPARTIAL_SHIP_INST_FLG(stCust.getPARTIAL_SHIP_INST_FLG()); // 分納出荷指示フラグ
					st.setIF_CTL_NO(null); // IF情報管理番号
					st.setODR_SEQ(null); // 注文項番
					st.setENTRY_TYP("2"); // データ入力区分(２ （オンライン・固定）)
					st.setDEL_FLG("0"); // 削除フラグ
					st.setJOB_ODR_SET_FLG("0"); // 製番設定フラグ
					
					// 受注明細の登録処理を行う
					entity.mT_ODR.create(conn, st);
					
	    			// =======================================
	    			// 受注履歴の登録
	    			// =======================================
					List lstSeqRsltOdr = entity.mSEQ_RSLT_ODR.read(conn, st);
					if (lstSeqRsltOdr == null && lstSeqRsltOdr.isEmpty()) {
						setErrorMessage("KQ00035", null);
						return;
					}
					
					st.setRSLT_CTL_SEQ_CD(((KM0030010Struct)lstSeqRsltOdr.get(0)).getRSLT_CTL_SEQ_CD()); // 履歴管理番号
					st.setODR_CTL_NO(strCtlOdr); // 受注管理番号
					st.setODR_NO(strOdrNo); // 受注番号
					st.setCUST_ODR_NO(stDetail.getl_CUST_ODR_NO()); // 得意先注文番号
					st.setODR_TYP(stDetail.getl_h_ODR_TYP()); // 注文区分
					st.setCUST_CD(struct.getCUST_CD()); // 得意先コード
					st.setCUST_ITEM_CD(stDetail.getl_CUST_ITEM_CD()); // 得意先品目番号
					st.setITEM_CD(stDetail.getl_ITEM_CD()); // 品目番号
					st.setODR_QTY(stDetail.getl_ODR_QTY()); // 受注数量
					st.setUNIT(stDetail.getl_UNIT_CD()); // 単位
					st.setDLV_PLACE_CD(stDetail.getl_DLV_LOC_CD()); // 納品場所コード
					st.setUNIT_PRICE(stDetail.getl_ESTIMATE_UNIT_PRICE()); // 単価
					st.setCUR_CD(stCust.getCUR_CD()); // 通貨コード
					st.setSPCL_PRICE_CO("1"); // 特値区分
					st.setDEPO_TYP(stDetail.getl_h_DEPO_TYP()); // 預託倉庫区分
					st.setREMARKS(stDetail.getl_REMARKS()); // 備考
					st.setCUST_CHRG_PSN_CD(stDetail.getl_OWN_PERSON_CD()); // 営業担当者コード
					st.setODR_ACPT_PSN_CD(this.getsysUSER_CD()); // 発行担当者コード
					st.setIF_CTL_NO(null); // IF情報管理番号
					st.setODR_SEQ(null); // 注文項番
					st.setODR_ACPT_DATE(stDetail.getl_ODR_ACPT_DATE()); // 受注日
					st.setTAX_CD(strTAX_CD); // 消費税コード
					
					// 受注履歴の登録処理を行う
					entity.mT_ODR_ACPT_RSLT.create(conn, st);
					
	    			// =======================================
	    			// 出荷計画の登録
	    			// =======================================
					
					// 短納期受注の場合
					if (isNearDlvDate && "3".equals(stDetail.getl_h_ODR_TYP())) {

						String desinatedShipDate = calcDesinatedShipDate(stDetail.getl_DESINATED_DLV_DATE(),
								stCustBase.getTRANSPORT_LT(), _SHIP_LT, stCustBase.getSHIP_PLANT_CD());
						String lastAnsDlvDateRcd = calcWorkDate(desinatedShipDate, stCustBase.getTRANSPORT_LT(),
								stCustBase.getSHIP_PLANT_CD());
						
						st.setODR_NO(strOdrNo); // 受注番号
						st.setPART_DLV_SEQ_NO("1"); // 分納項番
						st.setLAST_ANS_DLV_DATE_RCD(lastAnsDlvDateRcd); // 最新納期回答日
						st.setDESINATED_SHIP_DATE(desinatedShipDate); // 出荷指定日
						st.setDESINATED_SHIP_QTY(stDetail.getl_ODR_QTY()); // 出荷指定数量
						st.setREST_SHIP_ODR_QTY(stDetail.getl_ODR_QTY()); // 出荷指示残数量
						st.setSHIP_ODR_CMPLT_FLG("0"); // 出荷指示完了フラグ
						st.setIF_CTL_NO("0"); // IF情報管理番号
						st.setDEL_FLG("0"); // 削除フラグ
						
						// ［出荷計画］の登録処理を行う
						entity.mT_ANS_DLV_DATE.create(conn, st);
					}
					
					// 製番を同時に登録する場合
					if ("true".equals(stDetail.getl_c_DOODR())) {

		    			// =======================================
		    			// 受注明細の更新
		    			// =======================================
						st.setODR_NO(strOdrNo); // 受注番号
						st.setJOB_ODR_SET_FLG("1"); // 製番設定フラグ
						
						// [受注明細]を更新する
						entity.mT_ODR.update(conn, st);
						
						//「製番手配を同時に行う」がチェックOnの場合、また手配数量未入力の場合、「登録」で受注数量を代入
						if ("true".equals(stDetail.getl_c_DOODR()) && "0.0".equals(stDetail.getl_ESTIMATE_QTY())) {
							stDetail.setl_ESTIMATE_QTY(stDetail.getl_ODR_QTY());
						}
		    			// =======================================
		    			// 製番計画の登録
		    			// =======================================
						st.setJOB_ODR_CD(strJobOdrCd); // 製番
						st.setJOB_ODR_CANCEL_NO("0"); // 製番取消明細番号
						st.setJOB_ODR_TYP("1"); // 製番種別(１：受注製番)
						st.setITEM_CD(stDetail.getl_ITEM_CD()); // 品目番号
						st.setPLAN_TYP("1"); // 計画タイプ(１：受注)
						st.setJOB_ODR_DLV_DATE(stDetail.getl_JOB_ODR_DLV_DATE()); // 製番納期
					    st.setJOB_ODR_QTY(stDetail.getl_ESTIMATE_QTY()); // 製番数量
						st.setALC_GRP_CD(stDetail.getl_ALC_GRP_CD()); // 引当グループコード
						st.setJOB_ODR_STS_TYP("2"); // 製番状態区分
						st.setJOB_ODR_EXP_TYP("1"); // 製番処理区分
						st.setJOB_ODR_DEL_FLG("0"); // 製番削除フラグ
						st.setPLANT_CD(stCustBase.getSHIP_PLANT_CD()); // 工場コード
						
						// ［出荷計画］の登録処理を行う
						entity.mT_JOB_ODR.create(conn, st);
		    			// =======================================
		    			// 所要量計算制御（製番）の登録
		    			// =======================================
						st.setPLANT_CD(stCustBase.getSHIP_PLANT_CD()); // 工場コード
						st.setJOB_ODR_CD(strJobOdrCd); // 製番
						st.setUSER_CD(struct.getsUser_ID());
						// [所要量計算制御（製番）]へ追加する
						entity.mSYS_JOB_OD_CALC_CTRL.create(conn, st);
                        
						
		    			// =======================================
		    			// 製番受注紐付の登録
		    			// =======================================
						st.setJOB_ODR_CD(strJobOdrCd); // 製番
						st.setPLANT_CD(stCustBase.getSHIP_PLANT_CD()); // 工場コード
						st.setODR_NO(strOdrNo); // 受注番号
						if (Calculate.compare(convertNull(stDetail.getl_ODR_QTY()),
								convertNull(stDetail.getl_ESTIMATE_QTY())) >= 0) {
							st.setALCD_QTY(stDetail.getl_ESTIMATE_QTY()); // 紐付済み数
						} else {
							st.setALCD_QTY(stDetail.getl_ODR_QTY()); // 紐付済み数
						}
						st.setCOMPANY_CD(_COMPANY_CD); // 会社コード
						
						// [製番受注紐付]を登録する
						entity.mT_JOB_ODR_ODR_ALC.create(conn, st);
					}

	    			// =======================================
	    			// 案件受注紐付の登録
	    			// =======================================
					st.setDETAL_NO(stDetail.getl_DETAL_NO()); // 明細番号
					st.setODR_NO(strOdrNo); // 受注番号
					st.setESTIMATE_TYPE("1"); // 手配品目種(1:製品)
					
					// [案件受注紐付]を登録する
					entity.mT_PJ_ODR_ALC.create(conn, st);

	    			// =======================================
	    			// 見積明細の更新
	    			// =======================================
					st.setODR_FLG("1"); // 受注有無フラグ(1:有り)
					st.setl_DETAL_NO(st.getDETAL_NO()); // 明細番号
					// [見積明細]を更新する
					entity.mT_ESTIMATE_DETAL.update(conn, st);
				} else {
					
					// パラメータ「受注承認」が1の時
					if ("1".equals(struct.geth_APR_ODR())) {
						
						// 受注担当部門存在チェック
						if (isEmpty(stDetail.getl_OWN_ORG_CD())) {
							setErrorMessage("KQ00335", null);
							return;
						}
						stDetail.setsUser_ID(struct.getsUser_ID());
						stDetail.setCUST_CD(struct.getCUST_CD());
						stDetail.setPROJECT_CD(struct.getPROJECT_CD());
						stDetail.setESTIMATE_NO(struct.getESTIMATE_NO());
						stDetail.setCUST_NAME(struct.getCUST_NAME());
						// 【受注承認依頼処理】を実行する
						ApprProc.execInsertProcess(conn, stDetail, this);
						appSucessFlg = true;
						continue;
					}
					
	    			// =======================================
	    			// 非在庫受注の登録
	    			// =======================================
					List lstSeqOdr = entity.mSEQ_ODR_UNSTOCK.read(conn, st);
					strOdr = ((KM0030010Struct)lstSeqOdr.get(0)).getODR_NO(); // 受注番号
					
					st.setODR_NO(strOdr); // 受注番号
					st.setCOMPANY_CD(_COMPANY_CD); // 会社コード
					st.setSLIP_CD(null); // 伝票番号
					st.setCUST_ODR_NO(stDetail.getl_CUST_ODR_NO()); // 得意先注文番号
					st.setCUST_CD(struct.getCUST_CD()); // 得意先コード
					st.setITEM_CD(stDetail.getl_ITEM_CD()); // 品目番号
					st.setITEM_NAME(stDetail.getl_ESTIMATE_ITEM_NAME()); // 品目名称
					st.setCUST_CHRG_PSN_CD(stDetail.getl_OWN_PERSON_CD()); // 営業担当者コード
					st.setODR_ACPT_PSN_CD(this.getsysUSER_CD()); // 発行担当者コード
					st.setCURRNCY_CD(stCust.getCUR_CD()); // 通貨コード
					st.setEXCH_TYP(stCust.getEXCH_TYP()); // 為替種別
					st.setDESINATED_DLV_DATE(stDetail.getl_DESINATED_DLV_DATE()); // 指定納期
					st.setODR_UNIT_PRICE(stDetail.getl_ESTIMATE_UNIT_PRICE()); // 受注単価
					st.setODR_QTY(stDetail.getl_ODR_QTY()); // 受注数量
					st.setODR_AMOUNT(Calculate.multiply(convertNull(st.getODR_UNIT_PRICE()),
							convertNull(st.getODR_QTY()))); // 受注金額
					st.setODR_AMOUNT_EXCH_RATES(getExchangeAmount(st.getODR_AMOUNT(),
							st.getCURRNCY_CD())); // 受注金額（邦貨）
					st.setTAX_APPLY_TYP(stCust.getTAX_APPLY_TYP()); // 消費税適用区分
					st.setTAX_CD(stCust.getTAX_CD()); // 消費税コード
					st.setTAX_CALC_TYP(stCust.getTAX_CALC_TYP()); // 消費税計算区分
					st.setREMARKS(stDetail.getl_REMARKS()); // 備考
					st.setODR_ACPT_DATE(stDetail.getl_ODR_ACPT_DATE()); // 受注日
					st.setORGN_ODR_NO(null); // 元受注番号
					st.setADD_ODR_FLG(null); // 増額受注フラグ
					st.setODR_CMPLT_FLG("0"); // 受注完了フラグ
					st.setODR_CMPLT_DATE(null); // 受注完了日
					st.setDEL_FLG("0"); // 削除フラグ
					st.setCUST_CHRG_ORG_CD(stDetail.getl_OWN_ORG_CD()); // 営業担当部門コード
					st.setODR_ACPT_ORG_CD(null); // 発行担当者部門コード
					
					// [非在庫受注] に登録する
					entity.mT_ODR_UNSTOCK.create(conn, st);
					
	    			// =======================================
	    			// 非在庫受注履歴の登録
	    			// =======================================
					List lstSeqRsltOdr = entity.mSEQ_RSLT_ODR.read(conn, st);
					String strCtlOdrNo = ((KM0030010Struct)lstSeqRsltOdr.get(0)).getRSLT_CTL_SEQ_CD(); // 履歴管理番号
					
					st.setCTL_SEQ_CD(strCtlOdrNo); // 履歴管理番号
					st.setODR_NO(strOdr); // 受注番号
					st.setNEW_OLD_FLG("1"); // 新旧フラグ(1:新)
					st.setTRAN_TYPE("1"); // 処理区分(1:登録)
					
					// [非在庫受注履歴] に登録する
					entity.mHS_T_ODR_UNSTOCK.create(conn, st);

	    			// =======================================
	    			// 案件受注紐付の登録
	    			// =======================================
					st.setDETAL_NO(stDetail.getl_DETAL_NO()); // 明細番号
					st.setODR_NO(strOdr); // 受注番号
					st.setESTIMATE_TYPE("2"); // 手配品目種(2:役務)
					
					// [案件受注紐付]を登録する
					entity.mT_PJ_ODR_ALC.create(conn, st);

	    			// =======================================
	    			// 見積明細の更新
	    			// =======================================
					st.setODR_FLG("1"); // 受注有無フラグ(1:有り)
					st.setl_DETAL_NO(st.getDETAL_NO()); // 明細番号
					// [見積明細]を更新する
					entity.mT_ESTIMATE_DETAL.update(conn, st);
				}
			}
			if (appSucessFlg) {
				/** 承認依頼成功メッセジーを出す*/
		    	setInfoMessage("AZ00042", null);
		    	conn.commit();
			} else {
			// [見積] を再読込する
			List lstEst = entity.mMODIFY_CNT_T_ESTIMATE.read(conn, st);
			
			// [見積].“更新数” が読込時と異なる場合
			if (null != stDetail.getl_TEST_MODIFY_COUNT() && !checkModifyCnt(stDetail.getl_TEST_MODIFY_COUNT(), lstEst)) {
				setErrorMessage("ZZ01105", null);
				return;
			}
			KM0030010Struct stEst = (KM0030010Struct)lstEst.get(0);

			// =======================================
			// 見積の更新
			// =======================================
			
			st.setESTIMATE_STAT("2"); // 見積ステータス(2:確定受注)
			
			// 見積ステータスを更新する
			entity.mTBL_T_ESTIMATE.update(conn, st);
			
			// [見積].“内示受領フラグ”＝0：受領なしの場合
			if ("0".equals(stEst.getUNOFFICIAL_RECEIPT_FLAG())) {
				
				st.setESTIMATE_STAT("9"); // 見積ステータス(9:キャンセル)
				
				// 更新対象以外の見積の「見積ステータス」を0:見積中から、9:キャンセルに更新する
				entity.mUPD_REST_T_ESTIMATE.update(conn, st);
				
			}

			// =======================================
			// 案件の更新
			// =======================================
			
			// [案件] を再読込する
			List lstProject = entity.mT_PROJECT.read(conn, st);
			// [案件].“更新数” が読込時と異なる場合
			if (null != stDetail.getl_TPJ_MODIFY_COUNT() && !checkModifyCnt(stDetail.getl_TPJ_MODIFY_COUNT(), lstProject)) {
				setErrorMessage("ZZ01105", null);
				return;
			}
			st.setPROJECT_STAT("4"); // 案件ステータス(4:確定受注)
			
			// 案件ステータスを更新する
			entity.mT_PROJECT.update(conn, st);
			}
			conn.commit();
			//再読込
			if (null != _HAN_TAN){
				// 【読込処理】を実行する
				controlSelect();
			}
		} catch(Exception e) {
			e.printStackTrace();
			throw new ExpjException(e);
		} finally {
			if (conn != null){
			conn.rollback();
			}
		}
                //}}user_implement_dev:<controlInsert>
		logger.exiting("KM0030010Control"+":USER="+struct.getsUser_ID(),"controlInsert");

		return;
	}

	/**
	 * 更新ボタン押下時に実行される処理です。
	 *
	 */
	public void controlUpdate() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0030");
		logger.entering("KM0030010Control"+":USER="+struct.getsUser_ID(),"controlUpdate");
			//{{user_implement_dev:<controlUpdate>
			// TODO: ユーザ定義のコードを記述してください
		try {
			KM0030010Struct st = new KM0030010Struct();
			KM0030010Struct stDetail = null;
			KM0030010Struct stRslt = null;
			KM0030010Struct stTodr = null;
			KM0030010Struct stTodrCtl = null;
			KM0030010Struct stTodrUnstock = null;
			List lstTodrUnstock = null;
			// 全レコードの登録処理
			boolean appSucessFlg = false;

			beginTransaction();
			st.setsUser_ID(this.getsysUSER_CD()); // ユーザコード
			st.setPROJECT_CD(struct.getPROJECT_CD()); // 案件番号
			st.setESTIMATE_NO(struct.getESTIMATE_NO()); // 見積番号
			st.setsUser_ID(this.getsysUSER_CD()); // ユーザコード

			for (int i = 0; i < list.size(); i++) {
				stDetail = (KM0030010Struct)list.get(i);
				
				// 更新フラグが1：更新の行を対象に更新処理を行う
				if (!"1".equals(stDetail.geth_UPDATE_FLG())) {
					continue;
				}
				
				st.setODR_NO(stDetail.getl_ODR_NO()); // 受注番号
				
				// パラメータ「受注承認」が1の時
				if ("1".equals(struct.geth_APR_ODR())) {
					stDetail.setsUser_ID(struct.getsUser_ID());
					stDetail.setCUST_CD(struct.getCUST_CD());
					stDetail.setPROJECT_CD(struct.getPROJECT_CD());
					stDetail.setESTIMATE_NO(struct.getESTIMATE_NO());
					stDetail.setCUST_NAME(struct.getCUST_NAME());
					
					// 【受注承認依頼処理】を実行する
					ApprProc.execUpdateProcess(conn, stDetail, this,"2");
					appSucessFlg = true;
					continue;
				} else {
					
					// 手配品目種が製品の場合
					if ("1".equals(stDetail.getl_h_ESTIMATE_TYPE())) {
						
						List lstTodrModCnt = entity.mTBL_T_ODR.read(conn, st);
						// 更新数 が 読込時 と異なる場合
						if (null != stDetail.getl_TODR_MODIFY_COUNT() && !checkModifyCnt(stDetail.getl_TODR_MODIFY_COUNT(), lstTodrModCnt)) {
							setErrorMessage("KQ00055", null);
							return;
						}
						if (!lstTodrModCnt.isEmpty()) {
							stRslt =  (KM0030010Struct)lstTodrModCnt.get(0);
						} else {
							stRslt = new KM0030010Struct();
						}

		    			// =======================================
		    			// 受注明細の更新
		    			// =======================================
						st.setCUST_ODR_NO(stDetail.getl_CUST_ODR_NO()); // 得意先注文番号
						st.setCUST_CHRG_PSN_CD(stDetail.getl_OWN_PERSON_CD()); // 営業担当者コード
						st.setCUST_CHRG_ORG_CD(stDetail.getl_OWN_ORG_CD()); // 営業担当部門コード
						st.setDESINATED_DLV_DATE(stDetail.getl_DESINATED_DLV_DATE()); // 指定納期
						st.setSTD_DESINATED_RCV_DATE(stDetail.getl_DESINATED_DLV_DATE()); // 基準入庫指定納期
						st.setDLV_LOC_CD(stDetail.getl_DLV_LOC_CD()); // 納品場所コード
						st.setDLV_LOC_NAME(stDetail.getl_DLV_LOC_NAME()); // 納品場所名
						st.setREMARKS(stDetail.getl_REMARKS()); // 備考
						
						// [受注明細] の更新を行う
						entity.mTBL_T_ODR.update(conn, st);

		    			// =======================================
		    			// 受注管理の取得
		    			// =======================================
						stTodr = stRslt;
						st.setODR_CTL_NO(stTodr.getODR_CTL_NO()); // 受注管理番号
						
						List lstTodrCtl = entity.mreadT_ODR_CTL.read(conn, st);
						if (lstTodrCtl == null || lstTodrCtl.size() == 0) {
							stTodrCtl = new KM0030010Struct();
						} else {
							stTodrCtl = (KM0030010Struct)lstTodrCtl.get(0);
						}

		    			// =======================================
		    			// 受注履歴の登録
		    			// =======================================
						List lstSeqRsltOdr = entity.mSEQ_RSLT_ODR.read(conn, st);
						if (lstSeqRsltOdr == null && lstSeqRsltOdr.isEmpty()) {
							setErrorMessage("KQ00035", null);
							return;
						}
						
						st.setRSLT_CTL_SEQ_CD(((KM0030010Struct)lstSeqRsltOdr.get(0)).getRSLT_CTL_SEQ_CD()); // 履歴管理番号
						st.setODR_CTL_NO(stTodr.getODR_CTL_NO()); // 受注管理番号
						st.setODR_NO(stDetail.getl_ODR_NO()); // 受注番号
						st.setCUST_ODR_NO(stDetail.getl_CUST_ODR_NO()); // 得意先注文番号
						st.setODR_TYP(stDetail.getl_h_ODR_TYP()); // 注文区分
						st.setCUST_CD(stTodrCtl.getCUST_CD()); // 得意先コード
						st.setCUST_ITEM_CD(stTodrCtl.getCUST_ITEM_CD()); // 得意先品目番号
						st.setITEM_CD(stTodrCtl.getITEM_CD()); // 品目番号
						st.setDESINATED_DLV_DATE(stDetail.getl_DESINATED_DLV_DATE()); // 指定納期
						st.setODR_QTY(stDetail.getl_ODR_QTY()); // 受注数量
						st.setUNIT(stDetail.getl_UNIT_CD()); // 単位
						st.setDLV_PLACE_CD(stDetail.getl_DLV_LOC_CD()); // 納品場所コード
						st.setUNIT_PRICE(stTodr.getODR_UNIT_PRICE()); // 単価
						st.setCUR_CD(stTodr.getCURRNCY_CD()); // 通貨コード
						st.setSPCL_PRICE_CO(stTodr.getSPCL_PRICE_TYP()); // 特値区分
						st.setDEPO_TYP(stTodr.getDEPO_TYP()); // 預託倉庫区分
						st.setCUST_DLV_CD(stTodr.getCUST_DLV_CD()); // 納入番号
						st.setCUST_DLV_KEY_CD(stTodr.getCUST_DLV_KEY_CD()); // 納品キー番号
						st.setREMARKS(stDetail.getl_REMARKS()); // 備考
						st.setCUST_CHRG_PSN_CD(stDetail.getl_OWN_PERSON_CD()); // 営業担当者コード
						st.setODR_ACPT_PSN_CD(stTodr.getODR_ACPT_PSN_CD()); // 発行担当者コード
						st.setODR_ACPT_DATE(stTodr.getODR_ACPT_DATE()); // 受注日
						st.setTAX_CD(stTodr.getTAX_CD()); // 消費税コード
						entity.mT_ODR_ACPT_RSLT.create(conn, st);
						
					} else {
						
						lstTodrUnstock = entity.mTBL_T_ODR_UNSTOCK.read(conn, st);
						// 更新数 が 読込時 と異なる場合
						if (null != stDetail.getl_TODR_MODIFY_COUNT() && !checkModifyCnt(stDetail.getl_TODR_MODIFY_COUNT(), lstTodrUnstock)) {
							setErrorMessage("KQ00055", null);
							return;
						}
						stTodrUnstock = (KM0030010Struct)lstTodrUnstock.get(0);
						
		    			// =======================================
		    			// 非在庫受注履歴の登録(旧)
		    			// =======================================
						List lstSeqRsltOdr = entity.mSEQ_RSLT_ODR.read(conn, st);
						String strCtlOdrNo = ((KM0030010Struct)lstSeqRsltOdr.get(0)).getRSLT_CTL_SEQ_CD(); // 履歴管理番号
						
						st.setCTL_SEQ_CD(strCtlOdrNo); // 履歴管理番号
						st.setODR_NO(stTodrUnstock.getODR_NO()); // 受注番号
						st.setNEW_OLD_FLG("0"); // 新旧フラグ(0:旧)
						st.setTRAN_TYPE("2"); // 処理区分(2：更新)
						st.setCOMPANY_CD(stTodrUnstock.getCOMPANY_CD()); // 会社コード
						st.setSLIP_CD(stTodrUnstock.getSLIP_CD()); // 伝票番号
						st.setCUST_ODR_NO(stTodrUnstock.getCUST_ODR_NO()); // 得意先注文番号
						st.setCUST_CD(stTodrUnstock.getCUST_CD()); // 得意先コード
						st.setITEM_CD(stTodrUnstock.getITEM_CD()); // 品目番号
						st.setITEM_NAME(stTodrUnstock.getITEM_NAME()); // 品目名称
						st.setCUST_CHRG_PSN_CD(stTodrUnstock.getCUST_CHRG_PSN_CD()); // 営業担当者コード
						st.setODR_ACPT_PSN_CD(stTodrUnstock.getODR_ACPT_PSN_CD()); // 発行担当者コード
						st.setCURRNCY_CD(stTodrUnstock.getCURRNCY_CD()); // 通貨コード
						st.setEXCH_TYP(stTodrUnstock.getEXCH_TYP()); // 為替種別
						st.setDESINATED_DLV_DATE(stTodrUnstock.getDESINATED_DLV_DATE()); // 指定納期
						st.setODR_UNIT_PRICE(stTodrUnstock.getODR_UNIT_PRICE()); // 受注単価
						st.setODR_QTY(stTodrUnstock.getODR_QTY()); // 受注数量
						st.setODR_AMOUNT(stTodrUnstock.getODR_AMOUNT()); // 受注金額
						st.setODR_AMOUNT_EXCH_RATES(stTodrUnstock.getODR_AMOUNT_EXCH_RATES()); // 受注金額（邦貨）
						st.setTAX_APPLY_TYP(stTodrUnstock.getTAX_APPLY_TYP()); // 消費税適用区分
						st.setTAX_CD(stTodrUnstock.getTAX_CD()); // 消費税コード
						st.setTAX_CALC_TYP(stTodrUnstock.getTAX_CALC_TYP()); // 消費税計算区分
						st.setREMARKS(stTodrUnstock.getREMARKS()); // 備考
						st.setODR_ACPT_DATE(stTodrUnstock.getODR_ACPT_DATE()); // 受注日
						st.setORGN_ODR_NO(stTodrUnstock.getORGN_ODR_NO()); // 元受注番号
						st.setADD_ODR_FLG(stTodrUnstock.getADD_ODR_FLG()); // 増額受注フラグ
						st.setODR_CMPLT_FLG(stTodrUnstock.getODR_CMPLT_FLG()); // 受注完了フラグ
						st.setDEL_FLG(stTodrUnstock.getDEL_FLG()); // 削除フラグ
						st.setCUST_CHRG_ORG_CD(stTodrUnstock.getCUST_CHRG_ORG_CD()); // 営業担当部門コード
						st.setODR_ACPT_ORG_CD(stTodrUnstock.getODR_ACPT_ORG_CD()); // 発行担当者部門コード
						
						// [非在庫受注履歴] に登録する
						entity.mHS_T_ODR_UNSTOCK.create(conn, st);
						
		    			// =======================================
		    			// 非在庫受注の更新
		    			// =======================================
						
						st.setODR_NO(stTodrUnstock.getODR_NO()); // 受注番号
						st.setCUST_ODR_NO(stDetail.getl_CUST_ODR_NO()); // 得意先注文番号
						st.setCUST_CHRG_PSN_CD(stDetail.getl_OWN_PERSON_CD()); // 営業担当者コード
						st.setDESINATED_DLV_DATE(stDetail.getl_DESINATED_DLV_DATE()); // 指定納期
						st.setREMARKS(stDetail.getl_REMARKS()); // 備考
						st.setCUST_CHRG_ORG_CD(stDetail.getl_OWN_ORG_CD()); // 営業担当者コード
						
						// [非在庫受注] を更新する
						entity.mT_ODR_UNSTOCK.update(conn, st);
						
		    			// =======================================
		    			// 非在庫受注履歴の登録(新)
		    			// =======================================
						lstSeqRsltOdr = entity.mSEQ_RSLT_ODR.read(conn, st);
						strCtlOdrNo = ((KM0030010Struct)lstSeqRsltOdr.get(0)).getRSLT_CTL_SEQ_CD(); // 履歴管理番号
						
						st.setCTL_SEQ_CD(strCtlOdrNo); // 履歴管理番号
						st.setNEW_OLD_FLG("1"); // 新旧フラグ(1:新)
						st.setTRAN_TYPE("2"); // 処理区分(2：更新)
						
						// [非在庫受注履歴] に登録する
						entity.mHS_T_ODR_UNSTOCK.create(conn, st);
					}
				}
			}
			
			
			if (appSucessFlg) {
				/** 承認依頼成功メッセジーを出す*/
		    	setInfoMessage("AZ00042", null);
			} else{
				// メッセージを表示する
				setInfoMessage("KQ00308", null);
			}
			conn.commit();
			
			if (null != _HAN_TAN){
				// 【読込処理】を実行する
				controlSelect();
			}
			
		} catch(Exception e) {
			e.printStackTrace();
			throw new ExpjException(e);
		} finally {
			if (conn != null){
			conn.rollback();
			}
		}
                //}}user_implement_dev:<controlUpdate>
		logger.exiting("KM0030010Control"+":USER="+struct.getsUser_ID(),"controlUpdate");

		return;
	}

	/**
	 * 削除ボタン押下時に実行される処理です。
	 *
	 */
	public void controlDelete() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0030");
		logger.entering("KM0030010Control"+":USER="+struct.getsUser_ID(),"controlDelete");
			//{{user_implement_dev:<controlDelete>
			// TODO: ユーザ定義のコードを記述してください
		try {
			KM0030010Struct st = new KM0030010Struct();
			KM0030010Struct stDetail = null;
			KM0030010Struct stRslt = null;
			KM0030010Struct stTodr = null;
			KM0030010Struct stTodrCtl = null;
			KM0030010Struct stTodrUnstock = null;
			// 全レコードの登録処理
			boolean appSucessFlg = false;

			beginTransaction();
			st.setsUser_ID(this.getsysUSER_CD()); // ユーザコード
			st.setPROJECT_CD(struct.getPROJECT_CD()); // 案件番号
			st.setESTIMATE_NO(struct.getESTIMATE_NO()); // 見積番号
			st.setsUser_ID(this.getsysUSER_CD()); // ユーザコード
			
			for (int i = 0; i < list.size(); i++) {
				
			  stDetail = (KM0030010Struct)list.get(i);

			  if (struct.getl_ODR_NO().equals(stDetail.getl_ODR_NO())) {
				
				st.setODR_NO(stDetail.getl_ODR_NO()); // 受注番号
				
				// パラメータ「受注承認」が1の時
				if ("1".equals(struct.geth_APR_ODR())) {
					stDetail.setsUser_ID(struct.getsUser_ID());
					stDetail.setCUST_CD(struct.getCUST_CD());
					stDetail.setPROJECT_CD(struct.getPROJECT_CD());
					stDetail.setESTIMATE_NO(struct.getESTIMATE_NO());
					stDetail.setCUST_NAME(struct.getCUST_NAME());
					
					// 【受注承認依頼処理】を実行する
					ApprProc.execUpdateProcess(conn, stDetail, this,"3");
					appSucessFlg = true;
					continue;
				}
					
				// 手配品目種が製品の場合
				if ("1".equals(stDetail.getl_h_ESTIMATE_TYPE())) {
					
					List lstTodrModCnt = entity.mTBL_T_ODR.read(conn, st);
					// 更新数 が 読込時 と異なる場合
					if (null != stDetail.getl_TODR_MODIFY_COUNT() && !checkModifyCnt(stDetail.getl_TODR_MODIFY_COUNT(), lstTodrModCnt)) {
						setErrorMessage("KQ00055", null);
						return;
					}
					if (!lstTodrModCnt.isEmpty()) {
						stRslt =  (KM0030010Struct)lstTodrModCnt.get(0);
					} else {
						stRslt = new KM0030010Struct();
					}
	    			// =======================================
	    			// 受注明細の削除
	    			// =======================================
					
					// [受注明細] を論理削除する
					entity.mDEL_T_ODR.update(conn, st);

	    			// =======================================
	    			// 受注管理の取得
	    			// =======================================
					stTodr = stRslt;
					st.setODR_CTL_NO(stTodr.getODR_CTL_NO()); // 受注管理番号
					
					List lstTodrCtl = entity.mreadT_ODR_CTL.read(conn, st);
					if (lstTodrCtl == null || lstTodrCtl.size() == 0) {
						stTodrCtl = new KM0030010Struct();
					} else {
						stTodrCtl = (KM0030010Struct)lstTodrCtl.get(0);
					}

	    			// =======================================
	    			// 受注履歴の登録
	    			// =======================================
					List lstSeqRsltOdr = entity.mSEQ_RSLT_ODR.read(conn, st);
					if (lstSeqRsltOdr == null && lstSeqRsltOdr.isEmpty()) {
						setErrorMessage("KQ00035", null);
						return;
					}

					st.setRSLT_CTL_SEQ_CD(((KM0030010Struct)lstSeqRsltOdr.get(0)).getRSLT_CTL_SEQ_CD()); // 履歴管理番号
					st.setODR_CTL_NO(stTodr.getODR_CTL_NO()); // 受注管理番号
					st.setODR_NO(stDetail.getl_ODR_NO()); // 受注番号
					st.setCUST_ODR_NO(stDetail.getl_CUST_ODR_NO()); // 得意先注文番号
					st.setODR_TYP(stDetail.getl_h_ODR_TYP()); // 注文区分
					st.setCUST_CD(stTodrCtl.getCUST_CD()); // 得意先コード
					st.setCUST_ITEM_CD(stTodrCtl.getCUST_ITEM_CD()); // 得意先品目番号
					st.setITEM_CD(stTodrCtl.getITEM_CD()); // 品目番号
					st.setDESINATED_DLV_DATE(stDetail.getl_DESINATED_DLV_DATE()); // 指定納期
					st.setODR_QTY(stDetail.getl_ODR_QTY()); // 受注数量
					st.setUNIT(stDetail.getl_UNIT_CD()); // 単位
					st.setDLV_PLACE_CD(stDetail.getl_DLV_LOC_CD()); // 納品場所コード
					st.setUNIT_PRICE(stTodr.getODR_UNIT_PRICE()); // 単価
					st.setCUR_CD(stTodr.getCURRNCY_CD()); // 通貨コード
					st.setSPCL_PRICE_CO(stTodr.getSPCL_PRICE_TYP()); // 特値区分
					st.setDEPO_TYP(stTodr.getDEPO_TYP()); // 預託倉庫区分
					st.setCUST_DLV_CD(stTodr.getCUST_DLV_CD()); // 納入番号
					st.setCUST_DLV_KEY_CD(stTodr.getCUST_DLV_KEY_CD()); // 納品キー番号
					st.setREMARKS(stTodr.getREMARKS()); // 備考
					st.setCUST_CHRG_PSN_CD(stDetail.getl_OWN_PERSON_CD()); // 営業担当者コード
					st.setODR_ACPT_PSN_CD(stTodr.getODR_ACPT_PSN_CD()); // 発行担当者コード
					st.setODR_ACPT_DATE(stDetail.getl_ODR_ACPT_DATE()); // 受注日
					st.setTAX_CD(stTodr.getTAX_CD()); // 消費税コード
					
					entity.mT_ODR_ACPT_RSLT.create(conn, st);

	    			// =======================================
	    			// 案件受注紐付の削除
	    			// =======================================
					st.setDETAL_NO(stDetail.getl_DETAL_NO()); // 明細番号
					
					// [案件受注紐付]を物理削除する
					entity.mT_PJ_ODR_ALC.delete(conn, st);

	    			// =======================================
	    			// 見積明細の更新
	    			// =======================================
					st.setODR_FLG("0"); // 受注有無フラグ
					st.setl_DETAL_NO(stDetail.getl_DETAL_NO()); // 明細番号
					
					// [見積明細]を更新する
					entity.mT_ESTIMATE_DETAL.update(conn, st);
					
				} else {
					
					// [役務実績]にデータが存在する場合
					if (entity.mT_SERVICE.check(conn, st)) {
						setErrorMessage("KM00019", null);
						return;
					}

					List lstTodrUnstock = entity.mTBL_T_ODR_UNSTOCK.read(conn, st);
					// 更新数 が 読込時 と異なる場合
					if (null != stDetail.getl_TODR_MODIFY_COUNT() &&!checkModifyCnt(stDetail.getl_TODR_MODIFY_COUNT(), lstTodrUnstock)) {
						setErrorMessage("KQ00055", null);
						return;
					}
					stTodrUnstock = (KM0030010Struct)lstTodrUnstock.get(0);
					
	    			// =======================================
	    			// 非在庫受注履歴の登録(旧)
	    			// =======================================
					List lstSeqRsltOdr = entity.mSEQ_RSLT_ODR.read(conn, st);
					String strCtlOdrNo = ((KM0030010Struct)lstSeqRsltOdr.get(0)).getRSLT_CTL_SEQ_CD(); // 履歴管理番号
					
					st.setCTL_SEQ_CD(strCtlOdrNo); // 履歴管理番号
					st.setODR_NO(stTodrUnstock.getODR_NO()); // 受注番号
					st.setNEW_OLD_FLG("0"); // 新旧フラグ(0:旧)
					st.setTRAN_TYPE("3"); // 処理区分(3：削除)
					st.setCOMPANY_CD(stTodrUnstock.getCOMPANY_CD()); // 会社コード
					st.setSLIP_CD(stTodrUnstock.getSLIP_CD()); // 伝票番号
					st.setCUST_ODR_NO(stTodrUnstock.getCUST_ODR_NO()); // 得意先注文番号
					st.setCUST_CD(stTodrUnstock.getCUST_CD()); // 得意先コード
					st.setITEM_CD(stTodrUnstock.getITEM_CD()); // 品目番号
					st.setITEM_NAME(stTodrUnstock.getITEM_NAME()); // 品目名称
					st.setCUST_CHRG_PSN_CD(stTodrUnstock.getCUST_CHRG_PSN_CD()); // 営業担当者コード
					st.setODR_ACPT_PSN_CD(stTodrUnstock.getODR_ACPT_PSN_CD()); // 発行担当者コード
					st.setCURRNCY_CD(stTodrUnstock.getCURRNCY_CD()); // 通貨コード
					st.setEXCH_TYP(stTodrUnstock.getEXCH_TYP()); // 為替種別
					st.setDESINATED_DLV_DATE(stTodrUnstock.getDESINATED_DLV_DATE()); // 指定納期
					st.setODR_UNIT_PRICE(stTodrUnstock.getODR_UNIT_PRICE()); // 受注単価
					st.setODR_QTY(stTodrUnstock.getODR_QTY()); // 受注数量
					st.setODR_AMOUNT(stTodrUnstock.getODR_AMOUNT()); // 受注金額
					st.setODR_AMOUNT_EXCH_RATES(stTodrUnstock.getODR_AMOUNT_EXCH_RATES()); // 受注金額（邦貨）
					st.setTAX_APPLY_TYP(stTodrUnstock.getTAX_APPLY_TYP()); // 消費税適用区分
					st.setTAX_CD(stTodrUnstock.getTAX_CD()); // 消費税コード
					st.setTAX_CALC_TYP(stTodrUnstock.getTAX_CALC_TYP()); // 消費税計算区分
					st.setREMARKS(stTodrUnstock.getREMARKS()); // 備考
					st.setODR_ACPT_DATE(stTodrUnstock.getODR_ACPT_DATE()); // 受注日
					st.setORGN_ODR_NO(stTodrUnstock.getORGN_ODR_NO()); // 元受注番号
					st.setADD_ODR_FLG(stTodrUnstock.getADD_ODR_FLG()); // 増額受注フラグ
					st.setODR_CMPLT_FLG(stTodrUnstock.getODR_CMPLT_FLG()); // 受注完了フラグ
					st.setODR_CMPLT_DATE(stTodrUnstock.getODR_CMPLT_DATE()); // 受注完了日
					st.setDEL_FLG(stTodrUnstock.getDEL_FLG()); // 削除フラグ
					st.setCUST_CHRG_ORG_CD(stTodrUnstock.getCUST_CHRG_ORG_CD()); // 営業担当部門コード
					st.setODR_ACPT_ORG_CD(stTodrUnstock.getODR_ACPT_ORG_CD()); // 発行担当者部門コード
					
					// [非在庫受注履歴] に登録する
					entity.mHS_T_ODR_UNSTOCK.create(conn, st);
					
	    			// =======================================
	    			// 非在庫受注の更新
	    			// =======================================
					
					st.setODR_NO(stTodrUnstock.getODR_NO()); // 受注番号
					
					// [非在庫受注] を更新する
					entity.mTBL_T_ODR_UNSTOCK.update(conn, st);

	    			// =======================================
	    			// 案件受注紐付の削除
	    			// =======================================
					st.setDETAL_NO(stDetail.getl_DETAL_NO()); // 明細番号
					
					// [案件受注紐付]を物理削除する
					entity.mT_PJ_ODR_ALC.delete(conn, st);

	    			// =======================================
	    			// 見積明細の更新
	    			// =======================================
					st.setODR_FLG("0"); // 受注有無フラグ
					st.setl_DETAL_NO(stDetail.getl_DETAL_NO()); // 明細番号
					
					// [見積明細]を更新する
					entity.mT_ESTIMATE_DETAL.update(conn, st);
				}
			  }
			}
			
			if (appSucessFlg) {
				/** 承認依頼成功メッセジーを出す*/
				if(this.getMsgStruct().sizeError() > 0){
					return;
		        }
		    	setInfoMessage("AZ00042", null);
		    	conn.commit();
			} else {
				// すべてが[見積明細].“受注有無フラグ”=0:なしの場合
				if (!entity.mCHECK_STS_T_ESTIMATE_DETAL.check(conn, st)) {
					
					// [見積] を再読込する
					List lstEst = entity.mMODIFY_CNT_T_ESTIMATE.read(conn, st);
					// [見積].“更新数” が読込時と異なる場合
					if (null != stDetail.getl_TEST_MODIFY_COUNT() && !checkModifyCnt(stDetail.getl_TEST_MODIFY_COUNT(), lstEst)) {
						setErrorMessage("ZZ01105", null);
						return;
					}
					KM0030010Struct stEst = (KM0030010Struct)lstEst.get(0);
	
	    			// =======================================
	    			// 見積の更新
	    			// =======================================
					
					// [見積].“内示受領フラグ”＝0：受領なしの場合
					if ("0".equals(stEst.getUNOFFICIAL_RECEIPT_FLAG())) {
						
						st.setESTIMATE_STAT("0"); // 見積ステータス(0：見積中)
						
						// 見積ステータスを更新する
						entity.mTBL_T_ESTIMATE.update(conn, st);
						
						// 更新対象以外の見積の「見積ステータス」を9：キャンセルから0:見積中に更新する
						entity.mUPD_REST_T_ESTIMATE.update(conn, st);
						
					} else {
						
						st.setESTIMATE_STAT("1"); // 見積ステータス(1:内示)
						// 見積ステータスを更新する
						entity.mTBL_T_ESTIMATE.update(conn, st);
					}
	
	    			// =======================================
	    			// 案件の更新
	    			// =======================================
					
					// [案件] を再読込する
					List lstProject = entity.mT_PROJECT.read(conn, st);
					// [案件].“更新数” が読込時と異なる場合
					if (null != stDetail.getl_TPJ_MODIFY_COUNT() && !checkModifyCnt(stDetail.getl_TPJ_MODIFY_COUNT(), lstProject)) {
						setErrorMessage("ZZ01105", null);
						return;
					}
					// [見積].“内示受領フラグ”＝0：受領なしの場合
					if ("0".equals(stEst.getUNOFFICIAL_RECEIPT_FLAG())) {
						st.setPROJECT_STAT("2"); // 案件ステータス(2：見積中)
					} else {
						st.setPROJECT_STAT("3"); // 案件ステータス(3:内示)
					}
					
					// 案件ステータスを更新する
					entity.mT_PROJECT.update(conn, st);
				}
                conn.commit();
			}
			if (null != _HAN_TAN){
				// 【読込処理】を実行する
				controlSelect();
			}
		} catch(Exception e) {
			e.printStackTrace();
			throw new ExpjException(e);
		} finally {
			if (conn != null){
			   conn.rollback();
			}
		}
                //}}user_implement_dev:<controlDelete>
		logger.exiting("KM0030010Control"+":USER="+struct.getsUser_ID(),"controlDelete");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0030");
		logger.entering("KM0030010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
			// TODO: ユーザ定義のコードを記述してください
		if (list != null){
			list.clear();
		}
		struct.clear();
		setReadStatus(INITIAL);
		controlRELOAD();
                //}}user_implement_dev:<controlClear>
		logger.exiting("KM0030010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * 閉じるボタン押下時に実行される処理です。
	 *
	 */
	public void controlClose() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0030");
		logger.entering("KM0030010Control"+":USER="+struct.getsUser_ID(),"controlClose");
			//{{user_implement_dev:<controlClose>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlClose>
		logger.exiting("KM0030010Control"+":USER="+struct.getsUser_ID(),"controlClose");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0030");
		logger.entering("KM0030010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("KM0030010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0030");
		logger.entering("KM0030010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
			// TODO: ユーザ定義のコードを記述してください
		try {
			_HAN_TAN = "1";
			struct.clear();
			List resultList = new ArrayList();
			KM0030010Struct queryStruct = new KM0030010Struct();
			// 自社情報の取得
			resultList = entity.mSYS_MY_COMPANY.read(conn, queryStruct);
			if (resultList.isEmpty()) {
				ExpjMessage message = new ExpjMessage("KQ00039");
				ExpjException ee = new ExpjException(message);
				throw ee;
			} else {
				_COMPANY_CD = ((KM0030010Struct)resultList.get(0)).getCOMPANY_CD();
				struct.setCOMPANY_CD(_COMPANY_CD); // 会社コード
			}
			
			// 日付計算用工場コード
			queryStruct.setSYS_CLASS("SALES");
			queryStruct.setCLASS_CODE("PLANT_WEB");
			resultList = entity.mSYS_CLASS_CODE.read(conn, queryStruct);
			if (resultList.isEmpty()) {
				ExpjMessage message = new ExpjMessage("KP20017");
				ExpjException ee = new ExpjException(message);
				throw ee;
			} else {
				queryStruct.setPLANT_CD(((KM0030010Struct)resultList.get(0)).getCODE());
			}
			
			// 業務日付
			resultList = entity.mSYS_DATE_CTRL.read(conn, queryStruct);
			if (resultList.isEmpty()) {
				ExpjMessage message = new ExpjMessage("KQ00026");
				ExpjException ee = new ExpjException(message);
				throw ee;
			} else {
				_BUSINESS_OPR_DATE = ((KM0030010Struct)resultList.get(0)).getBUSINESS_OPR_DATE();
			}
			
			// 邦貨コード
			resultList = entity.mSYS_HOME_CUR.read(conn, queryStruct);
			if (resultList.isEmpty()) {
				ExpjMessage message = new ExpjMessage("KQ00041");
				ExpjException ee = new ExpjException(message);
				throw ee;
			} else {
				_HOME_CUR_CD = ((KM0030010Struct)resultList.get(0)).getHOME_CUR_CD();
			}
			
			// 出荷準備L/T
			queryStruct.setCLASS_CODE("SHIP_LT");
			resultList = entity.mSYS_CLASS_CODE.read(conn, queryStruct);
			if (resultList.isEmpty()) {
				ExpjMessage message = new ExpjMessage("KQ00037");
				ExpjException ee = new ExpjException(message);
				throw ee;
			} else {
				_SHIP_LT = ((KM0030010Struct)resultList.get(0)).getCODE();
			}
			
			// 短納期設定日
			queryStruct.setCLASS_CODE("DLV_DATE_CDT");
			resultList = entity.mSYS_CLASS_CODE.read(conn, queryStruct);
			if (resultList.isEmpty()) {
				ExpjMessage message = new ExpjMessage("KQ00043");
				ExpjException ee = new ExpjException(message);
				throw ee;
			} else {
				_DLV_DATE_CDT = ((KM0030010Struct)resultList.get(0)).getCODE();
			}
			
			// 受注時製番登録
			queryStruct.setNAME("PRD_REQ_JOB_ODR_TYP_1");
			resultList = entity.mSYS_PARAMETER.read(conn, queryStruct);
			if (resultList.isEmpty()) {
				ExpjMessage message = new ExpjMessage("KQ00319");
				ExpjException ee = new ExpjException(message);
				throw ee;
			} else {
				_PRD_REQ_JOB_ODR_TYP_1 = ((KM0030010Struct)resultList.get(0)).getVALUE();
				struct.seth_PRD_REQ_JOB_ODR_TYP_1(_PRD_REQ_JOB_ODR_TYP_1);
			}
			
			// 受注登録時の製番採番方法
			queryStruct.setNAME("PRD_REQ_JOB_ODR_TYP_2");
			resultList = entity.mSYS_PARAMETER.read(conn, queryStruct);
			if (resultList.isEmpty()) {
				ExpjMessage message = new ExpjMessage("KQ00320");
				ExpjException ee = new ExpjException(message);
				throw ee;
			} else {
				_PRD_REQ_JOB_ODR_TYP_2 = ((KM0030010Struct)resultList.get(0)).getVALUE();
				struct.seth_PRD_REQ_JOB_ODR_TYP_2(_PRD_REQ_JOB_ODR_TYP_2);
			}
			
			// 受注承認
			queryStruct.setNAME("APR_ODR");
			resultList = entity.mSYS_PARAMETER.read(conn, queryStruct);
			if (resultList.isEmpty()) {
		        // 多言語項目取得対応
		        String locale = CoreTools.getLocale(sysUSER_CD);
		        String property = "OrteusUserDic";
		        ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
				ExpjMessage message = new ExpjMessage("AZ00041", CoreTools.getRBString("Expj.Cmt6707",resource));
				ExpjException ee = new ExpjException(message);
				throw ee;
			} else {
				_APR_ODR = ((KM0030010Struct)resultList.get(0)).getVALUE();
				if ("1".equals(_APR_ODR) ) {
					struct.seth_APR_ODR(_APR_ODR);
				} else {
					_APR_ODR = "0";
					struct.seth_APR_ODR("0");
				}
				
			}
			// 初期値のセット
			setDefaultValue();
			if ( isScreenMove() == true ) {
				//案件一覧画面から画面遷移
				if ("KM0040010".equals(getScreenId())) {
					KM0030010Struct st = new KM0030010Struct();
					st.setPROJECT_CD(getProjectCd());
					st.setESTIMATE_NO(getEstimateNo());
					List lstPjOdrAlc = entity.mT_PJ_ODR_ALC.read(conn, st);
					if (lstPjOdrAlc.size() > 0){
						struct.setrdoSHIP_UPDATE("true");
						struct.setrdoSHIP_INST("false");
					}else{
						struct.setrdoSHIP_INST("true");
						struct.setrdoSHIP_UPDATE("false");
					}
					struct.setPROJECT_CD(getProjectCd());
					struct.setESTIMATE_NO(getEstimateNo());
					// 検索のコントロールメソッドを呼び出します。
					controlSelect();
				//受注明細一覧から画面遷移
				}else if("KQ0040010".equals(getScreenId())){
					struct.setrdoSHIP_UPDATE("true");
					struct.setrdoSHIP_INST("false");
					struct.setPROJECT_CD(getProjectCd());
					struct.setESTIMATE_NO(getEstimateNo());
					// 検索のコントロールメソッドを呼び出します。
					controlSelect();
				}
			}

			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("KM0030010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * イベントハンドラの前処理です。
	 *
	 * @param buttun ボタン名
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0030");
		logger.entering("KM0030010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
		logger.exiting("KM0030010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("Modify") ) {
				controlModify();
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
//			throw new FoundationException("KM0030010Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KM0030010-E999","CSVの出力処理"));
			throw new FoundationException("KM0030010Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KM0030010-E999","システム日付の取得処理"));
				throw new FoundationException("KM0030010Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KM0030010-E999","コントロールのイベント処理"));
			throw new FoundationException("KM0030010Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected KM0030010Entity entity;
	protected KM0030010Struct struct;
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

		entity = new KM0030010Entity();
		struct = new KM0030010Struct();

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
	 * KM0030010クラスの標準コンストラクタ
	 */
	public KM0030010Control() throws BusinessProcessException, FoundationException
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
				KM0030010Struct key = (KM0030010Struct)keyList.get(j);
				// メッセージキーを作成する
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("rdoSHIP_INST") && key.getrdoSHIP_INST() != null) {
					msgKey.setKeyValue("rdoSHIP_INST", key.getrdoSHIP_INST());
				}
				if(msgKeyType.containsKeyColumn("rdoSHIP_UPDATE") && key.getrdoSHIP_UPDATE() != null) {
					msgKey.setKeyValue("rdoSHIP_UPDATE", key.getrdoSHIP_UPDATE());
				}
				if(msgKeyType.containsKeyColumn("l_CUR_UNIT") && key.getl_CUR_UNIT() != null) {
					msgKey.setKeyValue("l_CUR_UNIT", key.getl_CUR_UNIT());
				}
				if(msgKeyType.containsKeyColumn("DETAIL_NO") && key.getDETAIL_NO() != null) {
					msgKey.setKeyValue("DETAIL_NO", key.getDETAIL_NO());
				}
				if(msgKeyType.containsKeyColumn("ACPT_ODR_CD") && key.getACPT_ODR_CD() != null) {
					msgKey.setKeyValue("ACPT_ODR_CD", key.getACPT_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("c_DOODR") && key.getc_DOODR() != null) {
					msgKey.setKeyValue("c_DOODR", key.getc_DOODR());
				}
				if(msgKeyType.containsKeyColumn("PREPARE_QTY") && key.getPREPARE_QTY() != null) {
					msgKey.setKeyValue("PREPARE_QTY", key.getPREPARE_QTY());
				}
				if(msgKeyType.containsKeyColumn("c_INPUTODRCD") && key.getc_INPUTODRCD() != null) {
					msgKey.setKeyValue("c_INPUTODRCD", key.getc_INPUTODRCD());
				}
				if(msgKeyType.containsKeyColumn("QTY") && key.getQTY() != null) {
					msgKey.setKeyValue("QTY", key.getQTY());
				}
				if(msgKeyType.containsKeyColumn("QTY_UNIT") && key.getQTY_UNIT() != null) {
					msgKey.setKeyValue("QTY_UNIT", key.getQTY_UNIT());
				}
				if(msgKeyType.containsKeyColumn("ODR_PRICE_UNIT") && key.getODR_PRICE_UNIT() != null) {
					msgKey.setKeyValue("ODR_PRICE_UNIT", key.getODR_PRICE_UNIT());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_INST_COMMENT") && key.getISSUE_INST_COMMENT() != null) {
					msgKey.setKeyValue("ISSUE_INST_COMMENT", key.getISSUE_INST_COMMENT());
				}
				if(msgKeyType.containsKeyColumn("APPROVED_COMMENT") && key.getAPPROVED_COMMENT() != null) {
					msgKey.setKeyValue("APPROVED_COMMENT", key.getAPPROVED_COMMENT());
				}
				if(msgKeyType.containsKeyColumn("CUST_CHRG_PSN_NAME") && key.getCUST_CHRG_PSN_NAME() != null) {
					msgKey.setKeyValue("CUST_CHRG_PSN_NAME", key.getCUST_CHRG_PSN_NAME());
				}
				if(msgKeyType.containsKeyColumn("ES_ORG_NAME") && key.getES_ORG_NAME() != null) {
					msgKey.setKeyValue("ES_ORG_NAME", key.getES_ORG_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_DLV_LOC_NAME") && key.getl_DLV_LOC_NAME() != null) {
					msgKey.setKeyValue("l_DLV_LOC_NAME", key.getl_DLV_LOC_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_CUST_ITEM_NAME") && key.getl_CUST_ITEM_NAME() != null) {
					msgKey.setKeyValue("l_CUST_ITEM_NAME", key.getl_CUST_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_ITEM_NAME") && key.getl_ITEM_NAME() != null) {
					msgKey.setKeyValue("l_ITEM_NAME", key.getl_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_JOB_ODR_DLV_DATE") && key.getl_JOB_ODR_DLV_DATE() != null) {
					msgKey.setKeyValue("l_JOB_ODR_DLV_DATE", key.getl_JOB_ODR_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_ALC_GRP_CD") && key.getl_ALC_GRP_CD() != null) {
					msgKey.setKeyValue("l_ALC_GRP_CD", key.getl_ALC_GRP_CD());
				}
				if(msgKeyType.containsKeyColumn("l_JOB_ODR_CD") && key.getl_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("l_JOB_ODR_CD", key.getl_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("l_APPR_REMARKS") && key.getl_APPR_REMARKS() != null) {
					msgKey.setKeyValue("l_APPR_REMARKS", key.getl_APPR_REMARKS());
				}
				if(msgKeyType.containsKeyColumn("h_UPDATE_FLG") && key.geth_UPDATE_FLG() != null) {
					msgKey.setKeyValue("h_UPDATE_FLG", key.geth_UPDATE_FLG());
				}
				if(msgKeyType.containsKeyColumn("l_TEST_MODIFY_COUNT") && key.getl_TEST_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("l_TEST_MODIFY_COUNT", key.getl_TEST_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("l_TPJ_MODIFY_COUNT") && key.getl_TPJ_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("l_TPJ_MODIFY_COUNT", key.getl_TPJ_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("l_h_ESTIMATE_TYPE") && key.getl_h_ESTIMATE_TYPE() != null) {
					msgKey.setKeyValue("l_h_ESTIMATE_TYPE", key.getl_h_ESTIMATE_TYPE());
				}
				if(msgKeyType.containsKeyColumn("h_ESTIMATE_TYPE") && key.geth_ESTIMATE_TYPE() != null) {
					msgKey.setKeyValue("h_ESTIMATE_TYPE", key.geth_ESTIMATE_TYPE());
				}
				if(msgKeyType.containsKeyColumn("l_h_PREC_ARRANGE_FLG") && key.getl_h_PREC_ARRANGE_FLG() != null) {
					msgKey.setKeyValue("l_h_PREC_ARRANGE_FLG", key.getl_h_PREC_ARRANGE_FLG());
				}
				if(msgKeyType.containsKeyColumn("l_c_DOODR") && key.getl_c_DOODR() != null) {
					msgKey.setKeyValue("l_c_DOODR", key.getl_c_DOODR());
				}
				if(msgKeyType.containsKeyColumn("l_c_INPUTODRCD") && key.getl_c_INPUTODRCD() != null) {
					msgKey.setKeyValue("l_c_INPUTODRCD", key.getl_c_INPUTODRCD());
				}
				if(msgKeyType.containsKeyColumn("h_PREC_ARRANGE_FLG") && key.geth_PREC_ARRANGE_FLG() != null) {
					msgKey.setKeyValue("h_PREC_ARRANGE_FLG", key.geth_PREC_ARRANGE_FLG());
				}
				if(msgKeyType.containsKeyColumn("l_h_ODR_TYP") && key.getl_h_ODR_TYP() != null) {
					msgKey.setKeyValue("l_h_ODR_TYP", key.getl_h_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("h_ODR_TYP") && key.geth_ODR_TYP() != null) {
					msgKey.setKeyValue("h_ODR_TYP", key.geth_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("h_ODR_TYP3") && key.geth_ODR_TYP3() != null) {
					msgKey.setKeyValue("h_ODR_TYP3", key.geth_ODR_TYP3());
				}
				if(msgKeyType.containsKeyColumn("h_APR_ODR") && key.geth_APR_ODR() != null) {
					msgKey.setKeyValue("h_APR_ODR", key.geth_APR_ODR());
				}
				if(msgKeyType.containsKeyColumn("h_PRD_REQ_JOB_ODR_TYP_1") && key.geth_PRD_REQ_JOB_ODR_TYP_1() != null) {
					msgKey.setKeyValue("h_PRD_REQ_JOB_ODR_TYP_1", key.geth_PRD_REQ_JOB_ODR_TYP_1());
				}
				if(msgKeyType.containsKeyColumn("h_PRD_REQ_JOB_ODR_TYP_2") && key.geth_PRD_REQ_JOB_ODR_TYP_2() != null) {
					msgKey.setKeyValue("h_PRD_REQ_JOB_ODR_TYP_2", key.geth_PRD_REQ_JOB_ODR_TYP_2());
				}
				if(msgKeyType.containsKeyColumn("h_DLV_LOC_CD") && key.geth_DLV_LOC_CD() != null) {
					msgKey.setKeyValue("h_DLV_LOC_CD", key.geth_DLV_LOC_CD());
				}
				if(msgKeyType.containsKeyColumn("h_ANS_DLV_DATE_EXIST_FLG") && key.geth_ANS_DLV_DATE_EXIST_FLG() != null) {
					msgKey.setKeyValue("h_ANS_DLV_DATE_EXIST_FLG", key.geth_ANS_DLV_DATE_EXIST_FLG());
				}
				if(msgKeyType.containsKeyColumn("ITEM_NAME_R") && key.getITEM_NAME_R() != null) {
					msgKey.setKeyValue("ITEM_NAME_R", key.getITEM_NAME_R());
				}
				if(msgKeyType.containsKeyColumn("l_h_DEPO_TYP") && key.getl_h_DEPO_TYP() != null) {
					msgKey.setKeyValue("l_h_DEPO_TYP", key.getl_h_DEPO_TYP());
				}
				if(msgKeyType.containsKeyColumn("PROJECT_CD") && key.getPROJECT_CD() != null) {
					msgKey.setKeyValue("PROJECT_CD", key.getPROJECT_CD());
				}
				if(msgKeyType.containsKeyColumn("ESTIMATE_NO") && key.getESTIMATE_NO() != null) {
					msgKey.setKeyValue("ESTIMATE_NO", key.getESTIMATE_NO());
				}
				if(msgKeyType.containsKeyColumn("l_DETAL_NO") && key.getl_DETAL_NO() != null) {
					msgKey.setKeyValue("l_DETAL_NO", key.getl_DETAL_NO());
				}
				if(msgKeyType.containsKeyColumn("CUST_NAME") && key.getCUST_NAME() != null) {
					msgKey.setKeyValue("CUST_NAME", key.getCUST_NAME());
				}
				if(msgKeyType.containsKeyColumn("COMPANY_CD") && key.getCOMPANY_CD() != null) {
					msgKey.setKeyValue("COMPANY_CD", key.getCOMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("CODE") && key.getCODE() != null) {
					msgKey.setKeyValue("CODE", key.getCODE());
				}
				if(msgKeyType.containsKeyColumn("SYS_CLASS") && key.getSYS_CLASS() != null) {
					msgKey.setKeyValue("SYS_CLASS", key.getSYS_CLASS());
				}
				if(msgKeyType.containsKeyColumn("CLASS_CODE") && key.getCLASS_CODE() != null) {
					msgKey.setKeyValue("CLASS_CODE", key.getCLASS_CODE());
				}
				if(msgKeyType.containsKeyColumn("BUSINESS_OPR_DATE") && key.getBUSINESS_OPR_DATE() != null) {
					msgKey.setKeyValue("BUSINESS_OPR_DATE", key.getBUSINESS_OPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("HOME_CUR_CD") && key.getHOME_CUR_CD() != null) {
					msgKey.setKeyValue("HOME_CUR_CD", key.getHOME_CUR_CD());
				}
				if(msgKeyType.containsKeyColumn("VALUE") && key.getVALUE() != null) {
					msgKey.setKeyValue("VALUE", key.getVALUE());
				}
				if(msgKeyType.containsKeyColumn("NAME") && key.getNAME() != null) {
					msgKey.setKeyValue("NAME", key.getNAME());
				}
				if(msgKeyType.containsKeyColumn("PROJECT_NAME") && key.getPROJECT_NAME() != null) {
					msgKey.setKeyValue("PROJECT_NAME", key.getPROJECT_NAME());
				}
				if(msgKeyType.containsKeyColumn("CUST_CD") && key.getCUST_CD() != null) {
					msgKey.setKeyValue("CUST_CD", key.getCUST_CD());
				}
				if(msgKeyType.containsKeyColumn("PROJECT_STAT") && key.getPROJECT_STAT() != null) {
					msgKey.setKeyValue("PROJECT_STAT", key.getPROJECT_STAT());
				}
				if(msgKeyType.containsKeyColumn("DLV_LOC_CD") && key.getDLV_LOC_CD() != null) {
					msgKey.setKeyValue("DLV_LOC_CD", key.getDLV_LOC_CD());
				}
				if(msgKeyType.containsKeyColumn("MODIFY_COUNT") && key.getMODIFY_COUNT() != null) {
					msgKey.setKeyValue("MODIFY_COUNT", key.getMODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("CUR_CD") && key.getCUR_CD() != null) {
					msgKey.setKeyValue("CUR_CD", key.getCUR_CD());
				}
				if(msgKeyType.containsKeyColumn("EXCH_TYP") && key.getEXCH_TYP() != null) {
					msgKey.setKeyValue("EXCH_TYP", key.getEXCH_TYP());
				}
				if(msgKeyType.containsKeyColumn("TAX_APPLY_TYP") && key.getTAX_APPLY_TYP() != null) {
					msgKey.setKeyValue("TAX_APPLY_TYP", key.getTAX_APPLY_TYP());
				}
				if(msgKeyType.containsKeyColumn("TAX_CD") && key.getTAX_CD() != null) {
					msgKey.setKeyValue("TAX_CD", key.getTAX_CD());
				}
				if(msgKeyType.containsKeyColumn("TAX_CALC_TYP") && key.getTAX_CALC_TYP() != null) {
					msgKey.setKeyValue("TAX_CALC_TYP", key.getTAX_CALC_TYP());
				}
				if(msgKeyType.containsKeyColumn("PARTIAL_SHIP_INST_FLG") && key.getPARTIAL_SHIP_INST_FLG() != null) {
					msgKey.setKeyValue("PARTIAL_SHIP_INST_FLG", key.getPARTIAL_SHIP_INST_FLG());
				}
				if(msgKeyType.containsKeyColumn("CUR_NAME") && key.getCUR_NAME() != null) {
					msgKey.setKeyValue("CUR_NAME", key.getCUR_NAME());
				}
				if(msgKeyType.containsKeyColumn("CUR_UNIT") && key.getCUR_UNIT() != null) {
					msgKey.setKeyValue("CUR_UNIT", key.getCUR_UNIT());
				}
				if(msgKeyType.containsKeyColumn("DECIMAL_FIG") && key.getDECIMAL_FIG() != null) {
					msgKey.setKeyValue("DECIMAL_FIG", key.getDECIMAL_FIG());
				}
				if(msgKeyType.containsKeyColumn("l_ES_USER_CD") && key.getl_ES_USER_CD() != null) {
					msgKey.setKeyValue("l_ES_USER_CD", key.getl_ES_USER_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ES_ORG_CD") && key.getl_ES_ORG_CD() != null) {
					msgKey.setKeyValue("l_ES_ORG_CD", key.getl_ES_ORG_CD());
				}
				if(msgKeyType.containsKeyColumn("l_CUST_ITEM_CD") && key.getl_CUST_ITEM_CD() != null) {
					msgKey.setKeyValue("l_CUST_ITEM_CD", key.getl_CUST_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ESTIMATE_QTY") && key.getl_ESTIMATE_QTY() != null) {
					msgKey.setKeyValue("l_ESTIMATE_QTY", key.getl_ESTIMATE_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_UNIT_CD") && key.getl_UNIT_CD() != null) {
					msgKey.setKeyValue("l_UNIT_CD", key.getl_UNIT_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ESTIMATE_UNIT_PRICE") && key.getl_ESTIMATE_UNIT_PRICE() != null) {
					msgKey.setKeyValue("l_ESTIMATE_UNIT_PRICE", key.getl_ESTIMATE_UNIT_PRICE());
				}
				if(msgKeyType.containsKeyColumn("l_ESTIMATE_AMOUNT") && key.getl_ESTIMATE_AMOUNT() != null) {
					msgKey.setKeyValue("l_ESTIMATE_AMOUNT", key.getl_ESTIMATE_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("l_ESTIMATE_TYPE") && key.getl_ESTIMATE_TYPE() != null) {
					msgKey.setKeyValue("l_ESTIMATE_TYPE", key.getl_ESTIMATE_TYPE());
				}
				if(msgKeyType.containsKeyColumn("l_ESTIMATE_ITEM_NAME") && key.getl_ESTIMATE_ITEM_NAME() != null) {
					msgKey.setKeyValue("l_ESTIMATE_ITEM_NAME", key.getl_ESTIMATE_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_USER_NAME") && key.getl_USER_NAME() != null) {
					msgKey.setKeyValue("l_USER_NAME", key.getl_USER_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_ORG_NAME") && key.getl_ORG_NAME() != null) {
					msgKey.setKeyValue("l_ORG_NAME", key.getl_ORG_NAME());
				}
				if(msgKeyType.containsKeyColumn("DLV_LOC_NAME") && key.getDLV_LOC_NAME() != null) {
					msgKey.setKeyValue("DLV_LOC_NAME", key.getDLV_LOC_NAME());
				}
				if(msgKeyType.containsKeyColumn("TRANSPORT_LT") && key.getTRANSPORT_LT() != null) {
					msgKey.setKeyValue("TRANSPORT_LT", key.getTRANSPORT_LT());
				}
				if(msgKeyType.containsKeyColumn("TRANSPORT_CD") && key.getTRANSPORT_CD() != null) {
					msgKey.setKeyValue("TRANSPORT_CD", key.getTRANSPORT_CD());
				}
				if(msgKeyType.containsKeyColumn("TRANSPORT_TYP") && key.getTRANSPORT_TYP() != null) {
					msgKey.setKeyValue("TRANSPORT_TYP", key.getTRANSPORT_TYP());
				}
				if(msgKeyType.containsKeyColumn("DEPO_WH_CD") && key.getDEPO_WH_CD() != null) {
					msgKey.setKeyValue("DEPO_WH_CD", key.getDEPO_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("SHIP_PLANT_CD") && key.getSHIP_PLANT_CD() != null) {
					msgKey.setKeyValue("SHIP_PLANT_CD", key.getSHIP_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("DEPO_TYP") && key.getDEPO_TYP() != null) {
					msgKey.setKeyValue("DEPO_TYP", key.getDEPO_TYP());
				}
				if(msgKeyType.containsKeyColumn("CUST_ITEM_NAME") && key.getCUST_ITEM_NAME() != null) {
					msgKey.setKeyValue("CUST_ITEM_NAME", key.getCUST_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("ITEM_NAME") && key.getITEM_NAME() != null) {
					msgKey.setKeyValue("ITEM_NAME", key.getITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("CUST_ITEM_CD") && key.getCUST_ITEM_CD() != null) {
					msgKey.setKeyValue("CUST_ITEM_CD", key.getCUST_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("ESTIMATE_TYPE") && key.getESTIMATE_TYPE() != null) {
					msgKey.setKeyValue("ESTIMATE_TYPE", key.getESTIMATE_TYPE());
				}
				if(msgKeyType.containsKeyColumn("ODR_NO") && key.getODR_NO() != null) {
					msgKey.setKeyValue("ODR_NO", key.getODR_NO());
				}
				if(msgKeyType.containsKeyColumn("DETAL_NO") && key.getDETAL_NO() != null) {
					msgKey.setKeyValue("DETAL_NO", key.getDETAL_NO());
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
				if(msgKeyType.containsKeyColumn("l_ITEM_CD") && key.getl_ITEM_CD() != null) {
					msgKey.setKeyValue("l_ITEM_CD", key.getl_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("l_DESINATED_DLV_DATE") && key.getl_DESINATED_DLV_DATE() != null) {
					msgKey.setKeyValue("l_DESINATED_DLV_DATE", key.getl_DESINATED_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_ODR_QTY") && key.getl_ODR_QTY() != null) {
					msgKey.setKeyValue("l_ODR_QTY", key.getl_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_ODR_AMOUNT") && key.getl_ODR_AMOUNT() != null) {
					msgKey.setKeyValue("l_ODR_AMOUNT", key.getl_ODR_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("l_ODR_AMOUNT_EXCH_RATES") && key.getl_ODR_AMOUNT_EXCH_RATES() != null) {
					msgKey.setKeyValue("l_ODR_AMOUNT_EXCH_RATES", key.getl_ODR_AMOUNT_EXCH_RATES());
				}
				if(msgKeyType.containsKeyColumn("l_DLV_LOC_CD") && key.getl_DLV_LOC_CD() != null) {
					msgKey.setKeyValue("l_DLV_LOC_CD", key.getl_DLV_LOC_CD());
				}
				if(msgKeyType.containsKeyColumn("l_DEPO_TYP") && key.getl_DEPO_TYP() != null) {
					msgKey.setKeyValue("l_DEPO_TYP", key.getl_DEPO_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_ODR_ACPT_DATE") && key.getl_ODR_ACPT_DATE() != null) {
					msgKey.setKeyValue("l_ODR_ACPT_DATE", key.getl_ODR_ACPT_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_REMARKS") && key.getl_REMARKS() != null) {
					msgKey.setKeyValue("l_REMARKS", key.getl_REMARKS());
				}
				if(msgKeyType.containsKeyColumn("l_OWN_PERSON_CD") && key.getl_OWN_PERSON_CD() != null) {
					msgKey.setKeyValue("l_OWN_PERSON_CD", key.getl_OWN_PERSON_CD());
				}
				if(msgKeyType.containsKeyColumn("l_TODR_MODIFY_COUNT") && key.getl_TODR_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("l_TODR_MODIFY_COUNT", key.getl_TODR_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("l_CUST_CHRG_PSN_NAME") && key.getl_CUST_CHRG_PSN_NAME() != null) {
					msgKey.setKeyValue("l_CUST_CHRG_PSN_NAME", key.getl_CUST_CHRG_PSN_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_OWN_ORG_CD") && key.getl_OWN_ORG_CD() != null) {
					msgKey.setKeyValue("l_OWN_ORG_CD", key.getl_OWN_ORG_CD());
				}
				if(msgKeyType.containsKeyColumn("l_CUST_CHRG_ORG_NAME") && key.getl_CUST_CHRG_ORG_NAME() != null) {
					msgKey.setKeyValue("l_CUST_CHRG_ORG_NAME", key.getl_CUST_CHRG_ORG_NAME());
				}
				if(msgKeyType.containsKeyColumn("ODR_TYP") && key.getODR_TYP() != null) {
					msgKey.setKeyValue("ODR_TYP", key.getODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("ODR_CTL_NO") && key.getODR_CTL_NO() != null) {
					msgKey.setKeyValue("ODR_CTL_NO", key.getODR_CTL_NO());
				}
				if(msgKeyType.containsKeyColumn("CUST_ODR_NO") && key.getCUST_ODR_NO() != null) {
					msgKey.setKeyValue("CUST_ODR_NO", key.getCUST_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("CUST_CHRG_ORG_CD") && key.getCUST_CHRG_ORG_CD() != null) {
					msgKey.setKeyValue("CUST_CHRG_ORG_CD", key.getCUST_CHRG_ORG_CD());
				}
				if(msgKeyType.containsKeyColumn("CUST_CHRG_PSN_CD") && key.getCUST_CHRG_PSN_CD() != null) {
					msgKey.setKeyValue("CUST_CHRG_PSN_CD", key.getCUST_CHRG_PSN_CD());
				}
				if(msgKeyType.containsKeyColumn("ODR_ACPT_PSN_CD") && key.getODR_ACPT_PSN_CD() != null) {
					msgKey.setKeyValue("ODR_ACPT_PSN_CD", key.getODR_ACPT_PSN_CD());
				}
				if(msgKeyType.containsKeyColumn("CURRNCY_CD") && key.getCURRNCY_CD() != null) {
					msgKey.setKeyValue("CURRNCY_CD", key.getCURRNCY_CD());
				}
				if(msgKeyType.containsKeyColumn("DLV_LOC_NAME_KANJI") && key.getDLV_LOC_NAME_KANJI() != null) {
					msgKey.setKeyValue("DLV_LOC_NAME_KANJI", key.getDLV_LOC_NAME_KANJI());
				}
				if(msgKeyType.containsKeyColumn("ODR_UNIT_PRICE") && key.getODR_UNIT_PRICE() != null) {
					msgKey.setKeyValue("ODR_UNIT_PRICE", key.getODR_UNIT_PRICE());
				}
				if(msgKeyType.containsKeyColumn("SPCL_PRICE_TYP") && key.getSPCL_PRICE_TYP() != null) {
					msgKey.setKeyValue("SPCL_PRICE_TYP", key.getSPCL_PRICE_TYP());
				}
				if(msgKeyType.containsKeyColumn("DESINATED_DLV_DATE") && key.getDESINATED_DLV_DATE() != null) {
					msgKey.setKeyValue("DESINATED_DLV_DATE", key.getDESINATED_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("STD_DESINATED_RCV_DATE") && key.getSTD_DESINATED_RCV_DATE() != null) {
					msgKey.setKeyValue("STD_DESINATED_RCV_DATE", key.getSTD_DESINATED_RCV_DATE());
				}
				if(msgKeyType.containsKeyColumn("ODR_QTY") && key.getODR_QTY() != null) {
					msgKey.setKeyValue("ODR_QTY", key.getODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("REMAIN_UNCONFIRM_ODR_QTY") && key.getREMAIN_UNCONFIRM_ODR_QTY() != null) {
					msgKey.setKeyValue("REMAIN_UNCONFIRM_ODR_QTY", key.getREMAIN_UNCONFIRM_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("CANCELED_UNCONFIRM_ODR_QTY") && key.getCANCELED_UNCONFIRM_ODR_QTY() != null) {
					msgKey.setKeyValue("CANCELED_UNCONFIRM_ODR_QTY", key.getCANCELED_UNCONFIRM_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("UNIT_CD") && key.getUNIT_CD() != null) {
					msgKey.setKeyValue("UNIT_CD", key.getUNIT_CD());
				}
				if(msgKeyType.containsKeyColumn("UNCONFIRM_ODR_BALANCE") && key.getUNCONFIRM_ODR_BALANCE() != null) {
					msgKey.setKeyValue("UNCONFIRM_ODR_BALANCE", key.getUNCONFIRM_ODR_BALANCE());
				}
				if(msgKeyType.containsKeyColumn("ODR_AMOUNT") && key.getODR_AMOUNT() != null) {
					msgKey.setKeyValue("ODR_AMOUNT", key.getODR_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("ODR_AMOUNT_EXCH_RATES") && key.getODR_AMOUNT_EXCH_RATES() != null) {
					msgKey.setKeyValue("ODR_AMOUNT_EXCH_RATES", key.getODR_AMOUNT_EXCH_RATES());
				}
				if(msgKeyType.containsKeyColumn("ODR_CMPLT_FLG") && key.getODR_CMPLT_FLG() != null) {
					msgKey.setKeyValue("ODR_CMPLT_FLG", key.getODR_CMPLT_FLG());
				}
				if(msgKeyType.containsKeyColumn("PART_NAME") && key.getPART_NAME() != null) {
					msgKey.setKeyValue("PART_NAME", key.getPART_NAME());
				}
				if(msgKeyType.containsKeyColumn("REMARKS") && key.getREMARKS() != null) {
					msgKey.setKeyValue("REMARKS", key.getREMARKS());
				}
				if(msgKeyType.containsKeyColumn("ODR_ACPT_DATE") && key.getODR_ACPT_DATE() != null) {
					msgKey.setKeyValue("ODR_ACPT_DATE", key.getODR_ACPT_DATE());
				}
				if(msgKeyType.containsKeyColumn("SHIP_PLAN_REMAIN_QTY") && key.getSHIP_PLAN_REMAIN_QTY() != null) {
					msgKey.setKeyValue("SHIP_PLAN_REMAIN_QTY", key.getSHIP_PLAN_REMAIN_QTY());
				}
				if(msgKeyType.containsKeyColumn("SHIP_PLAN_CMPLT_FLG") && key.getSHIP_PLAN_CMPLT_FLG() != null) {
					msgKey.setKeyValue("SHIP_PLAN_CMPLT_FLG", key.getSHIP_PLAN_CMPLT_FLG());
				}
				if(msgKeyType.containsKeyColumn("UNCONFIRMED_ODR_EFF_OVR_FLG") && key.getUNCONFIRMED_ODR_EFF_OVR_FLG() != null) {
					msgKey.setKeyValue("UNCONFIRMED_ODR_EFF_OVR_FLG", key.getUNCONFIRMED_ODR_EFF_OVR_FLG());
				}
				if(msgKeyType.containsKeyColumn("ENTRY_TYP") && key.getENTRY_TYP() != null) {
					msgKey.setKeyValue("ENTRY_TYP", key.getENTRY_TYP());
				}
				if(msgKeyType.containsKeyColumn("DEL_FLG") && key.getDEL_FLG() != null) {
					msgKey.setKeyValue("DEL_FLG", key.getDEL_FLG());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_SET_FLG") && key.getJOB_ODR_SET_FLG() != null) {
					msgKey.setKeyValue("JOB_ODR_SET_FLG", key.getJOB_ODR_SET_FLG());
				}
				if(msgKeyType.containsKeyColumn("SLIP_CD") && key.getSLIP_CD() != null) {
					msgKey.setKeyValue("SLIP_CD", key.getSLIP_CD());
				}
				if(msgKeyType.containsKeyColumn("ORGN_ODR_NO") && key.getORGN_ODR_NO() != null) {
					msgKey.setKeyValue("ORGN_ODR_NO", key.getORGN_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("ADD_ODR_FLG") && key.getADD_ODR_FLG() != null) {
					msgKey.setKeyValue("ADD_ODR_FLG", key.getADD_ODR_FLG());
				}
				if(msgKeyType.containsKeyColumn("ODR_CMPLT_DATE") && key.getODR_CMPLT_DATE() != null) {
					msgKey.setKeyValue("ODR_CMPLT_DATE", key.getODR_CMPLT_DATE());
				}
				if(msgKeyType.containsKeyColumn("ODR_ACPT_ORG_CD") && key.getODR_ACPT_ORG_CD() != null) {
					msgKey.setKeyValue("ODR_ACPT_ORG_CD", key.getODR_ACPT_ORG_CD());
				}
				if(msgKeyType.containsKeyColumn("ESTIMATE_STAT") && key.getESTIMATE_STAT() != null) {
					msgKey.setKeyValue("ESTIMATE_STAT", key.getESTIMATE_STAT());
				}
				if(msgKeyType.containsKeyColumn("ES_ORG_CD") && key.getES_ORG_CD() != null) {
					msgKey.setKeyValue("ES_ORG_CD", key.getES_ORG_CD());
				}
				if(msgKeyType.containsKeyColumn("ES_USER_CD") && key.getES_USER_CD() != null) {
					msgKey.setKeyValue("ES_USER_CD", key.getES_USER_CD());
				}
				if(msgKeyType.containsKeyColumn("ESTIMATE_QTY") && key.getESTIMATE_QTY() != null) {
					msgKey.setKeyValue("ESTIMATE_QTY", key.getESTIMATE_QTY());
				}
				if(msgKeyType.containsKeyColumn("ESTIMATE_UNIT_PRICE") && key.getESTIMATE_UNIT_PRICE() != null) {
					msgKey.setKeyValue("ESTIMATE_UNIT_PRICE", key.getESTIMATE_UNIT_PRICE());
				}
				if(msgKeyType.containsKeyColumn("ESTIMATE_AMOUNT") && key.getESTIMATE_AMOUNT() != null) {
					msgKey.setKeyValue("ESTIMATE_AMOUNT", key.getESTIMATE_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("ODR_FLG") && key.getODR_FLG() != null) {
					msgKey.setKeyValue("ODR_FLG", key.getODR_FLG());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_CD") && key.getJOB_ODR_CD() != null) {
					msgKey.setKeyValue("JOB_ODR_CD", key.getJOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("CAL_NO") && key.getCAL_NO() != null) {
					msgKey.setKeyValue("CAL_NO", key.getCAL_NO());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_DLV_DATE") && key.getJOB_ODR_DLV_DATE() != null) {
					msgKey.setKeyValue("JOB_ODR_DLV_DATE", key.getJOB_ODR_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("RSLT_CTL_SEQ_CD") && key.getRSLT_CTL_SEQ_CD() != null) {
					msgKey.setKeyValue("RSLT_CTL_SEQ_CD", key.getRSLT_CTL_SEQ_CD());
				}
				if(msgKeyType.containsKeyColumn("UNIT") && key.getUNIT() != null) {
					msgKey.setKeyValue("UNIT", key.getUNIT());
				}
				if(msgKeyType.containsKeyColumn("DLV_PLACE_CD") && key.getDLV_PLACE_CD() != null) {
					msgKey.setKeyValue("DLV_PLACE_CD", key.getDLV_PLACE_CD());
				}
				if(msgKeyType.containsKeyColumn("UNIT_PRICE") && key.getUNIT_PRICE() != null) {
					msgKey.setKeyValue("UNIT_PRICE", key.getUNIT_PRICE());
				}
				if(msgKeyType.containsKeyColumn("SPCL_PRICE_CO") && key.getSPCL_PRICE_CO() != null) {
					msgKey.setKeyValue("SPCL_PRICE_CO", key.getSPCL_PRICE_CO());
				}
				if(msgKeyType.containsKeyColumn("CUST_DLV_CD") && key.getCUST_DLV_CD() != null) {
					msgKey.setKeyValue("CUST_DLV_CD", key.getCUST_DLV_CD());
				}
				if(msgKeyType.containsKeyColumn("CUST_DLV_KEY_CD") && key.getCUST_DLV_KEY_CD() != null) {
					msgKey.setKeyValue("CUST_DLV_KEY_CD", key.getCUST_DLV_KEY_CD());
				}
				if(msgKeyType.containsKeyColumn("IF_CTL_NO") && key.getIF_CTL_NO() != null) {
					msgKey.setKeyValue("IF_CTL_NO", key.getIF_CTL_NO());
				}
				if(msgKeyType.containsKeyColumn("ODR_SEQ") && key.getODR_SEQ() != null) {
					msgKey.setKeyValue("ODR_SEQ", key.getODR_SEQ());
				}
				if(msgKeyType.containsKeyColumn("PART_DLV_SEQ_NO") && key.getPART_DLV_SEQ_NO() != null) {
					msgKey.setKeyValue("PART_DLV_SEQ_NO", key.getPART_DLV_SEQ_NO());
				}
				if(msgKeyType.containsKeyColumn("LAST_ANS_DLV_DATE_RCD") && key.getLAST_ANS_DLV_DATE_RCD() != null) {
					msgKey.setKeyValue("LAST_ANS_DLV_DATE_RCD", key.getLAST_ANS_DLV_DATE_RCD());
				}
				if(msgKeyType.containsKeyColumn("DESINATED_SHIP_DATE") && key.getDESINATED_SHIP_DATE() != null) {
					msgKey.setKeyValue("DESINATED_SHIP_DATE", key.getDESINATED_SHIP_DATE());
				}
				if(msgKeyType.containsKeyColumn("DESINATED_SHIP_QTY") && key.getDESINATED_SHIP_QTY() != null) {
					msgKey.setKeyValue("DESINATED_SHIP_QTY", key.getDESINATED_SHIP_QTY());
				}
				if(msgKeyType.containsKeyColumn("REST_SHIP_ODR_QTY") && key.getREST_SHIP_ODR_QTY() != null) {
					msgKey.setKeyValue("REST_SHIP_ODR_QTY", key.getREST_SHIP_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("SHIP_ODR_CMPLT_FLG") && key.getSHIP_ODR_CMPLT_FLG() != null) {
					msgKey.setKeyValue("SHIP_ODR_CMPLT_FLG", key.getSHIP_ODR_CMPLT_FLG());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_CANCEL_NO") && key.getJOB_ODR_CANCEL_NO() != null) {
					msgKey.setKeyValue("JOB_ODR_CANCEL_NO", key.getJOB_ODR_CANCEL_NO());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_TYP") && key.getJOB_ODR_TYP() != null) {
					msgKey.setKeyValue("JOB_ODR_TYP", key.getJOB_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("PLAN_TYP") && key.getPLAN_TYP() != null) {
					msgKey.setKeyValue("PLAN_TYP", key.getPLAN_TYP());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_QTY") && key.getJOB_ODR_QTY() != null) {
					msgKey.setKeyValue("JOB_ODR_QTY", key.getJOB_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("ALC_GRP_CD") && key.getALC_GRP_CD() != null) {
					msgKey.setKeyValue("ALC_GRP_CD", key.getALC_GRP_CD());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_STS_TYP") && key.getJOB_ODR_STS_TYP() != null) {
					msgKey.setKeyValue("JOB_ODR_STS_TYP", key.getJOB_ODR_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_EXP_TYP") && key.getJOB_ODR_EXP_TYP() != null) {
					msgKey.setKeyValue("JOB_ODR_EXP_TYP", key.getJOB_ODR_EXP_TYP());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_DEL_FLG") && key.getJOB_ODR_DEL_FLG() != null) {
					msgKey.setKeyValue("JOB_ODR_DEL_FLG", key.getJOB_ODR_DEL_FLG());
				}
				if(msgKeyType.containsKeyColumn("ALCD_QTY") && key.getALCD_QTY() != null) {
					msgKey.setKeyValue("ALCD_QTY", key.getALCD_QTY());
				}
				if(msgKeyType.containsKeyColumn("CUS_DLV_CD") && key.getCUS_DLV_CD() != null) {
					msgKey.setKeyValue("CUS_DLV_CD", key.getCUS_DLV_CD());
				}
				if(msgKeyType.containsKeyColumn("CUS_DLV_KEY_CD") && key.getCUS_DLV_KEY_CD() != null) {
					msgKey.setKeyValue("CUS_DLV_KEY_CD", key.getCUS_DLV_KEY_CD());
				}
				if(msgKeyType.containsKeyColumn("UNOFFICIAL_RECEIPT_FLAG") && key.getUNOFFICIAL_RECEIPT_FLAG() != null) {
					msgKey.setKeyValue("UNOFFICIAL_RECEIPT_FLAG", key.getUNOFFICIAL_RECEIPT_FLAG());
				}
				if(msgKeyType.containsKeyColumn("JOB_OD_CD_PREFIX") && key.getJOB_OD_CD_PREFIX() != null) {
					msgKey.setKeyValue("JOB_OD_CD_PREFIX", key.getJOB_OD_CD_PREFIX());
				}
				if(msgKeyType.containsKeyColumn("CTL_SEQ_CD") && key.getCTL_SEQ_CD() != null) {
					msgKey.setKeyValue("CTL_SEQ_CD", key.getCTL_SEQ_CD());
				}
				if(msgKeyType.containsKeyColumn("NEW_OLD_FLG") && key.getNEW_OLD_FLG() != null) {
					msgKey.setKeyValue("NEW_OLD_FLG", key.getNEW_OLD_FLG());
				}
				if(msgKeyType.containsKeyColumn("TRAN_TYPE") && key.getTRAN_TYPE() != null) {
					msgKey.setKeyValue("TRAN_TYPE", key.getTRAN_TYPE());
				}
				if(msgKeyType.containsKeyColumn("EXCH_RATE") && key.getEXCH_RATE() != null) {
					msgKey.setKeyValue("EXCH_RATE", key.getEXCH_RATE());
				}
				if(msgKeyType.containsKeyColumn("ORG_NAME") && key.getORG_NAME() != null) {
					msgKey.setKeyValue("ORG_NAME", key.getORG_NAME());
				}
				if(msgKeyType.containsKeyColumn("ORG_CD") && key.getORG_CD() != null) {
					msgKey.setKeyValue("ORG_CD", key.getORG_CD());
				}
				if(msgKeyType.containsKeyColumn("USER_NAME") && key.getUSER_NAME() != null) {
					msgKey.setKeyValue("USER_NAME", key.getUSER_NAME());
				}
				if(msgKeyType.containsKeyColumn("USER_CD") && key.getUSER_CD() != null) {
					msgKey.setKeyValue("USER_CD", key.getUSER_CD());
				}
				if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP") && key.getUNIT_QTY_TYP() != null) {
					msgKey.setKeyValue("UNIT_QTY_TYP", key.getUNIT_QTY_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_h_ANS_DLV_DATE_EXIST_FLG") && key.getl_h_ANS_DLV_DATE_EXIST_FLG() != null) {
					msgKey.setKeyValue("l_h_ANS_DLV_DATE_EXIST_FLG", key.getl_h_ANS_DLV_DATE_EXIST_FLG());
				}
				if(msgKeyType.containsKeyColumn("FIELD_VALUE") && key.getFIELD_VALUE() != null) {
					msgKey.setKeyValue("FIELD_VALUE", key.getFIELD_VALUE());
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
					KM0030010Struct key = new KM0030010Struct();
					if(msgKeyType.containsKeyColumn("rdoSHIP_INST")) {
						key.setrdoSHIP_INST(msgKey.getKeyValue("rdoSHIP_INST"));
					}
					if(msgKeyType.containsKeyColumn("rdoSHIP_UPDATE")) {
						key.setrdoSHIP_UPDATE(msgKey.getKeyValue("rdoSHIP_UPDATE"));
					}
					if(msgKeyType.containsKeyColumn("l_CUR_UNIT")) {
						key.setl_CUR_UNIT(msgKey.getKeyValue("l_CUR_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("DETAIL_NO")) {
						key.setDETAIL_NO(msgKey.getKeyValue("DETAIL_NO"));
					}
					if(msgKeyType.containsKeyColumn("ACPT_ODR_CD")) {
						key.setACPT_ODR_CD(msgKey.getKeyValue("ACPT_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("c_DOODR")) {
						key.setc_DOODR(msgKey.getKeyValue("c_DOODR"));
					}
					if(msgKeyType.containsKeyColumn("PREPARE_QTY")) {
						key.setPREPARE_QTY(msgKey.getKeyValue("PREPARE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("c_INPUTODRCD")) {
						key.setc_INPUTODRCD(msgKey.getKeyValue("c_INPUTODRCD"));
					}
					if(msgKeyType.containsKeyColumn("QTY")) {
						key.setQTY(msgKey.getKeyValue("QTY"));
					}
					if(msgKeyType.containsKeyColumn("QTY_UNIT")) {
						key.setQTY_UNIT(msgKey.getKeyValue("QTY_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("ODR_PRICE_UNIT")) {
						key.setODR_PRICE_UNIT(msgKey.getKeyValue("ODR_PRICE_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_INST_COMMENT")) {
						key.setISSUE_INST_COMMENT(msgKey.getKeyValue("ISSUE_INST_COMMENT"));
					}
					if(msgKeyType.containsKeyColumn("APPROVED_COMMENT")) {
						key.setAPPROVED_COMMENT(msgKey.getKeyValue("APPROVED_COMMENT"));
					}
					if(msgKeyType.containsKeyColumn("CUST_CHRG_PSN_NAME")) {
						key.setCUST_CHRG_PSN_NAME(msgKey.getKeyValue("CUST_CHRG_PSN_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ES_ORG_NAME")) {
						key.setES_ORG_NAME(msgKey.getKeyValue("ES_ORG_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_DLV_LOC_NAME")) {
						key.setl_DLV_LOC_NAME(msgKey.getKeyValue("l_DLV_LOC_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_CUST_ITEM_NAME")) {
						key.setl_CUST_ITEM_NAME(msgKey.getKeyValue("l_CUST_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_ITEM_NAME")) {
						key.setl_ITEM_NAME(msgKey.getKeyValue("l_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_JOB_ODR_DLV_DATE")) {
						key.setl_JOB_ODR_DLV_DATE(msgKey.getKeyValue("l_JOB_ODR_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_ALC_GRP_CD")) {
						key.setl_ALC_GRP_CD(msgKey.getKeyValue("l_ALC_GRP_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_JOB_ODR_CD")) {
						key.setl_JOB_ODR_CD(msgKey.getKeyValue("l_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_APPR_REMARKS")) {
						key.setl_APPR_REMARKS(msgKey.getKeyValue("l_APPR_REMARKS"));
					}
					if(msgKeyType.containsKeyColumn("h_UPDATE_FLG")) {
						key.seth_UPDATE_FLG(msgKey.getKeyValue("h_UPDATE_FLG"));
					}
					if(msgKeyType.containsKeyColumn("l_TEST_MODIFY_COUNT")) {
						key.setl_TEST_MODIFY_COUNT(msgKey.getKeyValue("l_TEST_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("l_TPJ_MODIFY_COUNT")) {
						key.setl_TPJ_MODIFY_COUNT(msgKey.getKeyValue("l_TPJ_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("l_h_ESTIMATE_TYPE")) {
						key.setl_h_ESTIMATE_TYPE(msgKey.getKeyValue("l_h_ESTIMATE_TYPE"));
					}
					if(msgKeyType.containsKeyColumn("h_ESTIMATE_TYPE")) {
						key.seth_ESTIMATE_TYPE(msgKey.getKeyValue("h_ESTIMATE_TYPE"));
					}
					if(msgKeyType.containsKeyColumn("l_h_PREC_ARRANGE_FLG")) {
						key.setl_h_PREC_ARRANGE_FLG(msgKey.getKeyValue("l_h_PREC_ARRANGE_FLG"));
					}
					if(msgKeyType.containsKeyColumn("l_c_DOODR")) {
						key.setl_c_DOODR(msgKey.getKeyValue("l_c_DOODR"));
					}
					if(msgKeyType.containsKeyColumn("l_c_INPUTODRCD")) {
						key.setl_c_INPUTODRCD(msgKey.getKeyValue("l_c_INPUTODRCD"));
					}
					if(msgKeyType.containsKeyColumn("h_PREC_ARRANGE_FLG")) {
						key.seth_PREC_ARRANGE_FLG(msgKey.getKeyValue("h_PREC_ARRANGE_FLG"));
					}
					if(msgKeyType.containsKeyColumn("l_h_ODR_TYP")) {
						key.setl_h_ODR_TYP(msgKey.getKeyValue("l_h_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("h_ODR_TYP")) {
						key.seth_ODR_TYP(msgKey.getKeyValue("h_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("h_ODR_TYP3")) {
						key.seth_ODR_TYP3(msgKey.getKeyValue("h_ODR_TYP3"));
					}
					if(msgKeyType.containsKeyColumn("h_APR_ODR")) {
						key.seth_APR_ODR(msgKey.getKeyValue("h_APR_ODR"));
					}
					if(msgKeyType.containsKeyColumn("h_PRD_REQ_JOB_ODR_TYP_1")) {
						key.seth_PRD_REQ_JOB_ODR_TYP_1(msgKey.getKeyValue("h_PRD_REQ_JOB_ODR_TYP_1"));
					}
					if(msgKeyType.containsKeyColumn("h_PRD_REQ_JOB_ODR_TYP_2")) {
						key.seth_PRD_REQ_JOB_ODR_TYP_2(msgKey.getKeyValue("h_PRD_REQ_JOB_ODR_TYP_2"));
					}
					if(msgKeyType.containsKeyColumn("h_DLV_LOC_CD")) {
						key.seth_DLV_LOC_CD(msgKey.getKeyValue("h_DLV_LOC_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_ANS_DLV_DATE_EXIST_FLG")) {
						key.seth_ANS_DLV_DATE_EXIST_FLG(msgKey.getKeyValue("h_ANS_DLV_DATE_EXIST_FLG"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_NAME_R")) {
						key.setITEM_NAME_R(msgKey.getKeyValue("ITEM_NAME_R"));
					}
					if(msgKeyType.containsKeyColumn("l_h_DEPO_TYP")) {
						key.setl_h_DEPO_TYP(msgKey.getKeyValue("l_h_DEPO_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PROJECT_CD")) {
						key.setPROJECT_CD(msgKey.getKeyValue("PROJECT_CD"));
					}
					if(msgKeyType.containsKeyColumn("ESTIMATE_NO")) {
						key.setESTIMATE_NO(msgKey.getKeyValue("ESTIMATE_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_DETAL_NO")) {
						key.setl_DETAL_NO(msgKey.getKeyValue("l_DETAL_NO"));
					}
					if(msgKeyType.containsKeyColumn("CUST_NAME")) {
						key.setCUST_NAME(msgKey.getKeyValue("CUST_NAME"));
					}
					if(msgKeyType.containsKeyColumn("COMPANY_CD")) {
						key.setCOMPANY_CD(msgKey.getKeyValue("COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("CODE")) {
						key.setCODE(msgKey.getKeyValue("CODE"));
					}
					if(msgKeyType.containsKeyColumn("SYS_CLASS")) {
						key.setSYS_CLASS(msgKey.getKeyValue("SYS_CLASS"));
					}
					if(msgKeyType.containsKeyColumn("CLASS_CODE")) {
						key.setCLASS_CODE(msgKey.getKeyValue("CLASS_CODE"));
					}
					if(msgKeyType.containsKeyColumn("BUSINESS_OPR_DATE")) {
						key.setBUSINESS_OPR_DATE(msgKey.getKeyValue("BUSINESS_OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("HOME_CUR_CD")) {
						key.setHOME_CUR_CD(msgKey.getKeyValue("HOME_CUR_CD"));
					}
					if(msgKeyType.containsKeyColumn("VALUE")) {
						key.setVALUE(msgKey.getKeyValue("VALUE"));
					}
					if(msgKeyType.containsKeyColumn("NAME")) {
						key.setNAME(msgKey.getKeyValue("NAME"));
					}
					if(msgKeyType.containsKeyColumn("PROJECT_NAME")) {
						key.setPROJECT_NAME(msgKey.getKeyValue("PROJECT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("CUST_CD")) {
						key.setCUST_CD(msgKey.getKeyValue("CUST_CD"));
					}
					if(msgKeyType.containsKeyColumn("PROJECT_STAT")) {
						key.setPROJECT_STAT(msgKey.getKeyValue("PROJECT_STAT"));
					}
					if(msgKeyType.containsKeyColumn("DLV_LOC_CD")) {
						key.setDLV_LOC_CD(msgKey.getKeyValue("DLV_LOC_CD"));
					}
					if(msgKeyType.containsKeyColumn("MODIFY_COUNT")) {
						key.setMODIFY_COUNT(msgKey.getKeyValue("MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("CUR_CD")) {
						key.setCUR_CD(msgKey.getKeyValue("CUR_CD"));
					}
					if(msgKeyType.containsKeyColumn("EXCH_TYP")) {
						key.setEXCH_TYP(msgKey.getKeyValue("EXCH_TYP"));
					}
					if(msgKeyType.containsKeyColumn("TAX_APPLY_TYP")) {
						key.setTAX_APPLY_TYP(msgKey.getKeyValue("TAX_APPLY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("TAX_CD")) {
						key.setTAX_CD(msgKey.getKeyValue("TAX_CD"));
					}
					if(msgKeyType.containsKeyColumn("TAX_CALC_TYP")) {
						key.setTAX_CALC_TYP(msgKey.getKeyValue("TAX_CALC_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PARTIAL_SHIP_INST_FLG")) {
						key.setPARTIAL_SHIP_INST_FLG(msgKey.getKeyValue("PARTIAL_SHIP_INST_FLG"));
					}
					if(msgKeyType.containsKeyColumn("CUR_NAME")) {
						key.setCUR_NAME(msgKey.getKeyValue("CUR_NAME"));
					}
					if(msgKeyType.containsKeyColumn("CUR_UNIT")) {
						key.setCUR_UNIT(msgKey.getKeyValue("CUR_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("DECIMAL_FIG")) {
						key.setDECIMAL_FIG(msgKey.getKeyValue("DECIMAL_FIG"));
					}
					if(msgKeyType.containsKeyColumn("l_ES_USER_CD")) {
						key.setl_ES_USER_CD(msgKey.getKeyValue("l_ES_USER_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ES_ORG_CD")) {
						key.setl_ES_ORG_CD(msgKey.getKeyValue("l_ES_ORG_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_CUST_ITEM_CD")) {
						key.setl_CUST_ITEM_CD(msgKey.getKeyValue("l_CUST_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ESTIMATE_QTY")) {
						key.setl_ESTIMATE_QTY(msgKey.getKeyValue("l_ESTIMATE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_UNIT_CD")) {
						key.setl_UNIT_CD(msgKey.getKeyValue("l_UNIT_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ESTIMATE_UNIT_PRICE")) {
						key.setl_ESTIMATE_UNIT_PRICE(msgKey.getKeyValue("l_ESTIMATE_UNIT_PRICE"));
					}
					if(msgKeyType.containsKeyColumn("l_ESTIMATE_AMOUNT")) {
						key.setl_ESTIMATE_AMOUNT(msgKey.getKeyValue("l_ESTIMATE_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("l_ESTIMATE_TYPE")) {
						key.setl_ESTIMATE_TYPE(msgKey.getKeyValue("l_ESTIMATE_TYPE"));
					}
					if(msgKeyType.containsKeyColumn("l_ESTIMATE_ITEM_NAME")) {
						key.setl_ESTIMATE_ITEM_NAME(msgKey.getKeyValue("l_ESTIMATE_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_USER_NAME")) {
						key.setl_USER_NAME(msgKey.getKeyValue("l_USER_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_ORG_NAME")) {
						key.setl_ORG_NAME(msgKey.getKeyValue("l_ORG_NAME"));
					}
					if(msgKeyType.containsKeyColumn("DLV_LOC_NAME")) {
						key.setDLV_LOC_NAME(msgKey.getKeyValue("DLV_LOC_NAME"));
					}
					if(msgKeyType.containsKeyColumn("TRANSPORT_LT")) {
						key.setTRANSPORT_LT(msgKey.getKeyValue("TRANSPORT_LT"));
					}
					if(msgKeyType.containsKeyColumn("TRANSPORT_CD")) {
						key.setTRANSPORT_CD(msgKey.getKeyValue("TRANSPORT_CD"));
					}
					if(msgKeyType.containsKeyColumn("TRANSPORT_TYP")) {
						key.setTRANSPORT_TYP(msgKey.getKeyValue("TRANSPORT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("DEPO_WH_CD")) {
						key.setDEPO_WH_CD(msgKey.getKeyValue("DEPO_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("SHIP_PLANT_CD")) {
						key.setSHIP_PLANT_CD(msgKey.getKeyValue("SHIP_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("DEPO_TYP")) {
						key.setDEPO_TYP(msgKey.getKeyValue("DEPO_TYP"));
					}
					if(msgKeyType.containsKeyColumn("CUST_ITEM_NAME")) {
						key.setCUST_ITEM_NAME(msgKey.getKeyValue("CUST_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_NAME")) {
						key.setITEM_NAME(msgKey.getKeyValue("ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("CUST_ITEM_CD")) {
						key.setCUST_ITEM_CD(msgKey.getKeyValue("CUST_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("ESTIMATE_TYPE")) {
						key.setESTIMATE_TYPE(msgKey.getKeyValue("ESTIMATE_TYPE"));
					}
					if(msgKeyType.containsKeyColumn("ODR_NO")) {
						key.setODR_NO(msgKey.getKeyValue("ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("DETAL_NO")) {
						key.setDETAL_NO(msgKey.getKeyValue("DETAL_NO"));
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
					if(msgKeyType.containsKeyColumn("l_ITEM_CD")) {
						key.setl_ITEM_CD(msgKey.getKeyValue("l_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_DESINATED_DLV_DATE")) {
						key.setl_DESINATED_DLV_DATE(msgKey.getKeyValue("l_DESINATED_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_ODR_QTY")) {
						key.setl_ODR_QTY(msgKey.getKeyValue("l_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_ODR_AMOUNT")) {
						key.setl_ODR_AMOUNT(msgKey.getKeyValue("l_ODR_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("l_ODR_AMOUNT_EXCH_RATES")) {
						key.setl_ODR_AMOUNT_EXCH_RATES(msgKey.getKeyValue("l_ODR_AMOUNT_EXCH_RATES"));
					}
					if(msgKeyType.containsKeyColumn("l_DLV_LOC_CD")) {
						key.setl_DLV_LOC_CD(msgKey.getKeyValue("l_DLV_LOC_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_DEPO_TYP")) {
						key.setl_DEPO_TYP(msgKey.getKeyValue("l_DEPO_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_ODR_ACPT_DATE")) {
						key.setl_ODR_ACPT_DATE(msgKey.getKeyValue("l_ODR_ACPT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_REMARKS")) {
						key.setl_REMARKS(msgKey.getKeyValue("l_REMARKS"));
					}
					if(msgKeyType.containsKeyColumn("l_OWN_PERSON_CD")) {
						key.setl_OWN_PERSON_CD(msgKey.getKeyValue("l_OWN_PERSON_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_TODR_MODIFY_COUNT")) {
						key.setl_TODR_MODIFY_COUNT(msgKey.getKeyValue("l_TODR_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("l_CUST_CHRG_PSN_NAME")) {
						key.setl_CUST_CHRG_PSN_NAME(msgKey.getKeyValue("l_CUST_CHRG_PSN_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_OWN_ORG_CD")) {
						key.setl_OWN_ORG_CD(msgKey.getKeyValue("l_OWN_ORG_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_CUST_CHRG_ORG_NAME")) {
						key.setl_CUST_CHRG_ORG_NAME(msgKey.getKeyValue("l_CUST_CHRG_ORG_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ODR_TYP")) {
						key.setODR_TYP(msgKey.getKeyValue("ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("ODR_CTL_NO")) {
						key.setODR_CTL_NO(msgKey.getKeyValue("ODR_CTL_NO"));
					}
					if(msgKeyType.containsKeyColumn("CUST_ODR_NO")) {
						key.setCUST_ODR_NO(msgKey.getKeyValue("CUST_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("CUST_CHRG_ORG_CD")) {
						key.setCUST_CHRG_ORG_CD(msgKey.getKeyValue("CUST_CHRG_ORG_CD"));
					}
					if(msgKeyType.containsKeyColumn("CUST_CHRG_PSN_CD")) {
						key.setCUST_CHRG_PSN_CD(msgKey.getKeyValue("CUST_CHRG_PSN_CD"));
					}
					if(msgKeyType.containsKeyColumn("ODR_ACPT_PSN_CD")) {
						key.setODR_ACPT_PSN_CD(msgKey.getKeyValue("ODR_ACPT_PSN_CD"));
					}
					if(msgKeyType.containsKeyColumn("CURRNCY_CD")) {
						key.setCURRNCY_CD(msgKey.getKeyValue("CURRNCY_CD"));
					}
					if(msgKeyType.containsKeyColumn("DLV_LOC_NAME_KANJI")) {
						key.setDLV_LOC_NAME_KANJI(msgKey.getKeyValue("DLV_LOC_NAME_KANJI"));
					}
					if(msgKeyType.containsKeyColumn("ODR_UNIT_PRICE")) {
						key.setODR_UNIT_PRICE(msgKey.getKeyValue("ODR_UNIT_PRICE"));
					}
					if(msgKeyType.containsKeyColumn("SPCL_PRICE_TYP")) {
						key.setSPCL_PRICE_TYP(msgKey.getKeyValue("SPCL_PRICE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("DESINATED_DLV_DATE")) {
						key.setDESINATED_DLV_DATE(msgKey.getKeyValue("DESINATED_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("STD_DESINATED_RCV_DATE")) {
						key.setSTD_DESINATED_RCV_DATE(msgKey.getKeyValue("STD_DESINATED_RCV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("ODR_QTY")) {
						key.setODR_QTY(msgKey.getKeyValue("ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("REMAIN_UNCONFIRM_ODR_QTY")) {
						key.setREMAIN_UNCONFIRM_ODR_QTY(msgKey.getKeyValue("REMAIN_UNCONFIRM_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("CANCELED_UNCONFIRM_ODR_QTY")) {
						key.setCANCELED_UNCONFIRM_ODR_QTY(msgKey.getKeyValue("CANCELED_UNCONFIRM_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_CD")) {
						key.setUNIT_CD(msgKey.getKeyValue("UNIT_CD"));
					}
					if(msgKeyType.containsKeyColumn("UNCONFIRM_ODR_BALANCE")) {
						key.setUNCONFIRM_ODR_BALANCE(msgKey.getKeyValue("UNCONFIRM_ODR_BALANCE"));
					}
					if(msgKeyType.containsKeyColumn("ODR_AMOUNT")) {
						key.setODR_AMOUNT(msgKey.getKeyValue("ODR_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("ODR_AMOUNT_EXCH_RATES")) {
						key.setODR_AMOUNT_EXCH_RATES(msgKey.getKeyValue("ODR_AMOUNT_EXCH_RATES"));
					}
					if(msgKeyType.containsKeyColumn("ODR_CMPLT_FLG")) {
						key.setODR_CMPLT_FLG(msgKey.getKeyValue("ODR_CMPLT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("PART_NAME")) {
						key.setPART_NAME(msgKey.getKeyValue("PART_NAME"));
					}
					if(msgKeyType.containsKeyColumn("REMARKS")) {
						key.setREMARKS(msgKey.getKeyValue("REMARKS"));
					}
					if(msgKeyType.containsKeyColumn("ODR_ACPT_DATE")) {
						key.setODR_ACPT_DATE(msgKey.getKeyValue("ODR_ACPT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("SHIP_PLAN_REMAIN_QTY")) {
						key.setSHIP_PLAN_REMAIN_QTY(msgKey.getKeyValue("SHIP_PLAN_REMAIN_QTY"));
					}
					if(msgKeyType.containsKeyColumn("SHIP_PLAN_CMPLT_FLG")) {
						key.setSHIP_PLAN_CMPLT_FLG(msgKey.getKeyValue("SHIP_PLAN_CMPLT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("UNCONFIRMED_ODR_EFF_OVR_FLG")) {
						key.setUNCONFIRMED_ODR_EFF_OVR_FLG(msgKey.getKeyValue("UNCONFIRMED_ODR_EFF_OVR_FLG"));
					}
					if(msgKeyType.containsKeyColumn("ENTRY_TYP")) {
						key.setENTRY_TYP(msgKey.getKeyValue("ENTRY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("DEL_FLG")) {
						key.setDEL_FLG(msgKey.getKeyValue("DEL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_SET_FLG")) {
						key.setJOB_ODR_SET_FLG(msgKey.getKeyValue("JOB_ODR_SET_FLG"));
					}
					if(msgKeyType.containsKeyColumn("SLIP_CD")) {
						key.setSLIP_CD(msgKey.getKeyValue("SLIP_CD"));
					}
					if(msgKeyType.containsKeyColumn("ORGN_ODR_NO")) {
						key.setORGN_ODR_NO(msgKey.getKeyValue("ORGN_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("ADD_ODR_FLG")) {
						key.setADD_ODR_FLG(msgKey.getKeyValue("ADD_ODR_FLG"));
					}
					if(msgKeyType.containsKeyColumn("ODR_CMPLT_DATE")) {
						key.setODR_CMPLT_DATE(msgKey.getKeyValue("ODR_CMPLT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("ODR_ACPT_ORG_CD")) {
						key.setODR_ACPT_ORG_CD(msgKey.getKeyValue("ODR_ACPT_ORG_CD"));
					}
					if(msgKeyType.containsKeyColumn("ESTIMATE_STAT")) {
						key.setESTIMATE_STAT(msgKey.getKeyValue("ESTIMATE_STAT"));
					}
					if(msgKeyType.containsKeyColumn("ES_ORG_CD")) {
						key.setES_ORG_CD(msgKey.getKeyValue("ES_ORG_CD"));
					}
					if(msgKeyType.containsKeyColumn("ES_USER_CD")) {
						key.setES_USER_CD(msgKey.getKeyValue("ES_USER_CD"));
					}
					if(msgKeyType.containsKeyColumn("ESTIMATE_QTY")) {
						key.setESTIMATE_QTY(msgKey.getKeyValue("ESTIMATE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("ESTIMATE_UNIT_PRICE")) {
						key.setESTIMATE_UNIT_PRICE(msgKey.getKeyValue("ESTIMATE_UNIT_PRICE"));
					}
					if(msgKeyType.containsKeyColumn("ESTIMATE_AMOUNT")) {
						key.setESTIMATE_AMOUNT(msgKey.getKeyValue("ESTIMATE_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("ODR_FLG")) {
						key.setODR_FLG(msgKey.getKeyValue("ODR_FLG"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_CD")) {
						key.setJOB_ODR_CD(msgKey.getKeyValue("JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("CAL_NO")) {
						key.setCAL_NO(msgKey.getKeyValue("CAL_NO"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_DLV_DATE")) {
						key.setJOB_ODR_DLV_DATE(msgKey.getKeyValue("JOB_ODR_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("RSLT_CTL_SEQ_CD")) {
						key.setRSLT_CTL_SEQ_CD(msgKey.getKeyValue("RSLT_CTL_SEQ_CD"));
					}
					if(msgKeyType.containsKeyColumn("UNIT")) {
						key.setUNIT(msgKey.getKeyValue("UNIT"));
					}
					if(msgKeyType.containsKeyColumn("DLV_PLACE_CD")) {
						key.setDLV_PLACE_CD(msgKey.getKeyValue("DLV_PLACE_CD"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_PRICE")) {
						key.setUNIT_PRICE(msgKey.getKeyValue("UNIT_PRICE"));
					}
					if(msgKeyType.containsKeyColumn("SPCL_PRICE_CO")) {
						key.setSPCL_PRICE_CO(msgKey.getKeyValue("SPCL_PRICE_CO"));
					}
					if(msgKeyType.containsKeyColumn("CUST_DLV_CD")) {
						key.setCUST_DLV_CD(msgKey.getKeyValue("CUST_DLV_CD"));
					}
					if(msgKeyType.containsKeyColumn("CUST_DLV_KEY_CD")) {
						key.setCUST_DLV_KEY_CD(msgKey.getKeyValue("CUST_DLV_KEY_CD"));
					}
					if(msgKeyType.containsKeyColumn("IF_CTL_NO")) {
						key.setIF_CTL_NO(msgKey.getKeyValue("IF_CTL_NO"));
					}
					if(msgKeyType.containsKeyColumn("ODR_SEQ")) {
						key.setODR_SEQ(msgKey.getKeyValue("ODR_SEQ"));
					}
					if(msgKeyType.containsKeyColumn("PART_DLV_SEQ_NO")) {
						key.setPART_DLV_SEQ_NO(msgKey.getKeyValue("PART_DLV_SEQ_NO"));
					}
					if(msgKeyType.containsKeyColumn("LAST_ANS_DLV_DATE_RCD")) {
						key.setLAST_ANS_DLV_DATE_RCD(msgKey.getKeyValue("LAST_ANS_DLV_DATE_RCD"));
					}
					if(msgKeyType.containsKeyColumn("DESINATED_SHIP_DATE")) {
						key.setDESINATED_SHIP_DATE(msgKey.getKeyValue("DESINATED_SHIP_DATE"));
					}
					if(msgKeyType.containsKeyColumn("DESINATED_SHIP_QTY")) {
						key.setDESINATED_SHIP_QTY(msgKey.getKeyValue("DESINATED_SHIP_QTY"));
					}
					if(msgKeyType.containsKeyColumn("REST_SHIP_ODR_QTY")) {
						key.setREST_SHIP_ODR_QTY(msgKey.getKeyValue("REST_SHIP_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("SHIP_ODR_CMPLT_FLG")) {
						key.setSHIP_ODR_CMPLT_FLG(msgKey.getKeyValue("SHIP_ODR_CMPLT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_CANCEL_NO")) {
						key.setJOB_ODR_CANCEL_NO(msgKey.getKeyValue("JOB_ODR_CANCEL_NO"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_TYP")) {
						key.setJOB_ODR_TYP(msgKey.getKeyValue("JOB_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PLAN_TYP")) {
						key.setPLAN_TYP(msgKey.getKeyValue("PLAN_TYP"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_QTY")) {
						key.setJOB_ODR_QTY(msgKey.getKeyValue("JOB_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("ALC_GRP_CD")) {
						key.setALC_GRP_CD(msgKey.getKeyValue("ALC_GRP_CD"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_STS_TYP")) {
						key.setJOB_ODR_STS_TYP(msgKey.getKeyValue("JOB_ODR_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_EXP_TYP")) {
						key.setJOB_ODR_EXP_TYP(msgKey.getKeyValue("JOB_ODR_EXP_TYP"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_DEL_FLG")) {
						key.setJOB_ODR_DEL_FLG(msgKey.getKeyValue("JOB_ODR_DEL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("ALCD_QTY")) {
						key.setALCD_QTY(msgKey.getKeyValue("ALCD_QTY"));
					}
					if(msgKeyType.containsKeyColumn("CUS_DLV_CD")) {
						key.setCUS_DLV_CD(msgKey.getKeyValue("CUS_DLV_CD"));
					}
					if(msgKeyType.containsKeyColumn("CUS_DLV_KEY_CD")) {
						key.setCUS_DLV_KEY_CD(msgKey.getKeyValue("CUS_DLV_KEY_CD"));
					}
					if(msgKeyType.containsKeyColumn("UNOFFICIAL_RECEIPT_FLAG")) {
						key.setUNOFFICIAL_RECEIPT_FLAG(msgKey.getKeyValue("UNOFFICIAL_RECEIPT_FLAG"));
					}
					if(msgKeyType.containsKeyColumn("JOB_OD_CD_PREFIX")) {
						key.setJOB_OD_CD_PREFIX(msgKey.getKeyValue("JOB_OD_CD_PREFIX"));
					}
					if(msgKeyType.containsKeyColumn("CTL_SEQ_CD")) {
						key.setCTL_SEQ_CD(msgKey.getKeyValue("CTL_SEQ_CD"));
					}
					if(msgKeyType.containsKeyColumn("NEW_OLD_FLG")) {
						key.setNEW_OLD_FLG(msgKey.getKeyValue("NEW_OLD_FLG"));
					}
					if(msgKeyType.containsKeyColumn("TRAN_TYPE")) {
						key.setTRAN_TYPE(msgKey.getKeyValue("TRAN_TYPE"));
					}
					if(msgKeyType.containsKeyColumn("EXCH_RATE")) {
						key.setEXCH_RATE(msgKey.getKeyValue("EXCH_RATE"));
					}
					if(msgKeyType.containsKeyColumn("ORG_NAME")) {
						key.setORG_NAME(msgKey.getKeyValue("ORG_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ORG_CD")) {
						key.setORG_CD(msgKey.getKeyValue("ORG_CD"));
					}
					if(msgKeyType.containsKeyColumn("USER_NAME")) {
						key.setUSER_NAME(msgKey.getKeyValue("USER_NAME"));
					}
					if(msgKeyType.containsKeyColumn("USER_CD")) {
						key.setUSER_CD(msgKey.getKeyValue("USER_CD"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP")) {
						key.setUNIT_QTY_TYP(msgKey.getKeyValue("UNIT_QTY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_h_ANS_DLV_DATE_EXIST_FLG")) {
						key.setl_h_ANS_DLV_DATE_EXIST_FLG(msgKey.getKeyValue("l_h_ANS_DLV_DATE_EXIST_FLG"));
					}
					if(msgKeyType.containsKeyColumn("FIELD_VALUE")) {
						key.setFIELD_VALUE(msgKey.getKeyValue("FIELD_VALUE"));
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
