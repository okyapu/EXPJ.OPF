/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AE0180/src/com/nec/jp/orteus/metamorBase/AE0180/AE0180010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AE0180;

import com.nec.jp.orteus.metamorBase.AE0180.*;
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
import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
import java.text.ParseException;

import com.nec.jp.orteus.metamorBase.common01.util.Calculate;
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
import com.nec.jp.orteus.metamorBase.common04.util.DataNotFoundException;
//}}user_implement_code_import

//{{user_implement_code_header
/**
 * CLASS     : AE0180010Control クラス
 * 発注計画CSV取込
 * @author $Author: shan-xiuqin $
 * @version $Revision: 1.6 $ $Date: 2016/05/23 08:15:42 $
 *
 *修正履歴
 *(2015/08/06),EJaSCM／EJa機能強化対応
 */
//}}user_implement_code_header

public class AE0180010Control
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
	public AE0180010Struct getListvalue(int x) { return (AE0180010Struct)(this.list.get(x)); }	// リストの値を返します。
	public AE0180010Struct getStruct() { return this.struct; }	// Structの値を返します。
	public AE0180010Struct createStruct() { return new AE0180010Struct(); }	// 新しいStructを作って返します。
	public void setStruct(Object structname) { this.struct.setStruct((AE0180010Struct)structname); }	// Structをセットします。
	public void initializeStruct() { this.struct.initialize(); }	// Structの値を初期化します。

	// CSV出力用リスト
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }
	
	// csvデータ
	public List listCsvTemp = null;;
	
	/**全部レコード数**/
	private int _intTotalCount = 0; 
	/**エラーレコード件数**/
	private int _intErrorCount = 0;  
	/**正常レコード件数**/
	private int _intSuccessCount = 0;
	/**ワーニング件数**/
	private int _intWarningCount = 0;
	/**ワーニング件数**/
	private int _intWarningCount1 = 0;
	private boolean warningFlg = false;
	
	/** 入力品目存在確認フラグ */
	private boolean _Itemflg = true;
	
	/** ＣＳＶ項目番号定義 */
	// 品目番号
	private final int CSV_ITEM_CD = 0;
	// 発注納期
	private final int CSV_PRD_DUE_DATE = 1;
	// 発注予定日
	private final int CSV_PUCH_ODR_DLV_DATE = 2;
	// 発注数
	private final int CSV_PUCH_ODR_QTY = 3;
	// 取引先コード
	private final int CSV_VEND_CD = 4;
	// 製番
	private final int CSV_JOB_ODR_CD = 5;
	// 取引先回答納期
	private final int CSV_CONFIRM_DLV_DATE = 6;
	// 受入場所
	private final int CSV_WH_CD = 7;
	// 備考
	private final int CSV_WORK_IN_PROC_COMMENT = 8;
	// 備品発注フラグ
	private final int CSV_NON_NO_ITEM_FLG = 9;
	// 備品発注品目名
	private final int CSV_NON_NO_ITEM_NAME = 10;
	// 備品発注製品区分
	private final int CSV_NON_NO_ITEM_TYP = 11;
	// 備品発注単位
	private final int CSV_NON_NO_ITEM_PUCH_ODR_UNIT = 12;
	// 単価区分
	private final int CSV_UNIT_COST_TYP = 13;
	// 単価
	private final int CSV_ACTUAL_UNIT_PRICE = 14;
	// 加工費
	private final int CSV_PROCESSING_COST = 15;
	// 材料費
	private final int CSV_MATERIAL_COST = 16;
	// その他経費
	private final int CSV_OTHER_OVERHEADS = 17;
	// 本体金額
	private final int CSV_NET_AMOUNT = 18;
	// 為替レート
	private final int CSV_EXCH_RATE = 19;
//20150806 ADD START BY SYSCOM
	//科目コード
	private final int CSV_ACCT_CD = 20;
	//負担部門コード
	private final int CSV_DEPT_CD = 21;
	//プロジェクトコード
	private final int CSV_PJ_CD = 22;
	//セグメント1
	private final int CSV_SEG_CONTENTS1 = 23;
	//セグメント2
	private final int CSV_SEG_CONTENTS2 = 24;
	//セグメント3
	private final int CSV_SEG_CONTENTS3 = 25;
	//セグメント4
	private final int CSV_SEG_CONTENTS4 = 26;
//20150806 ADD END BY SYSCOM

	// ＣＳＶ取込データ必要項目数(合計)
//20150806 MOD START BY SYSCOM
//	private final int CSV_NECESSARY_COLUMN = 20;
	private final int CSV_NECESSARY_COLUMN = 27;
//20150806 MOD END BY SYSCOM
	// エラーメッセージ
	private ExpjMessage _emsg = null;
	
	/** EJa-ASPROVA連携オプション導入フラグ取得用 */
	private String _SysInstallOptions_ASP = null;
	
	/** 業務運用日*/
	private String _btmBusinessOprDate;
	
	// 多言語項目取得対応
    ResourceBundle resource = CoreTools.getResourceBundle( "OrteusUserDic", CoreTools.getLocale(sysUSER_CD));
	
	// コンボボックス定義
	// エラー状態区分
	private ComboStruct _COM_ERR_TYP = null;
	
	// 備品発注フラグ
	private ComboStruct _NON_NO_ITEM_FLG = null;
	
	// 備品発注製品区分
	private ComboStruct _PRODUCT_TYP = null;
	
	// 単価区分
	private ComboStruct _UNIT_COST_TYP = null;
	
	/*会社コード*/
	public String _company_cd = null;
	
	/*半角スベース*/
	private String _space = " ";
	
	/** [邦貨]情報 */
    private HomeCurStruct _homeCurStruct = new HomeCurStruct();
		
	// 多言語項目取得対応
	private String _locale = CoreTools.getLocale(sysUSER_CD);
	ResourceBundle _resource = CoreTools.getResourceBundle("OrteusUserDic", _locale);

	/**
	 * 業務ロジックのエラーメッセージ設定処理を切り出して関数化
	 * @param code メッセージコード
	 * @param value1 置換文字列１
	 * @param value2 置換文字列2
	 * @param value3 置換文字列3
	 */
	private void setErrorMessage(String code, String value1, String value2, String value3) {
		ExpjMessage emsg = new ExpjMessage(code, value1, value2, value3);
		msgStruct.addError(emsg);
		sysLog.warning(emsg, sysUSER_CD);
	}
	
	/**
	 * 業務ロジックのエラーメッセージ設定処理を切り出して関数化
	 * @param code メッセージコード
	 * @param value1 置換文字列１
	 * @param value2 置換文字列2
	 */
	private void setErrorMessage(String code, String value1, String value2) {
		ExpjMessage emsg = new ExpjMessage(code, value1, value2);
		msgStruct.addError(emsg);
		sysLog.warning(emsg, sysUSER_CD);
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
	 * 業務ロジックのワーニングメッセージ設定処理を切り出して関数化
	 * @param code メッセージコード
	 * @param msg1
	 * @param msg2
	 */
	private void setWarningMessage(String code, String msg1, String msg2) {
		ExpjMessage emsg = new ExpjMessage(code, msg1, msg2);
		msgStruct.addWarn(emsg);
		sysLog.info(emsg, sysUSER_CD);
	}
	
	/**
	 * ログメッセージ設定
	 * @param 出力メッセージ
	 */
	private void setSyslogConfig(String message) {
		ExpjMessage emsg = new ExpjMessage( "ZZ01006", message );
		sysLog.config(emsg, getsysUSER_CD());
	}
	
	/**
	 * 業務ロジックのインフォメーション設定処理を切り出して関数化
	 * @param code
	 * @param value1
	 */
	private void setInfoMessage(String code, String value1) {
		ExpjMessage emsg = new ExpjMessage(code, value1);
		msgStruct.addInfo(emsg);
		sysLog.info(emsg, sysUSER_CD);
	}
	
	/**
	 * 業務ロジックのインフォメーション設定処理を切り出して関数化
	 * @param code
	 */
	private void setInfoMessage2(String code) {
		ExpjMessage emsg = new ExpjMessage(code);
		msgStruct.addInfo(emsg);
		sysLog.info(emsg, sysUSER_CD);
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
	 * 文字(\)変換、「\」なら、「\」を直前に追加する
	 * 
	 * @param in   文字列
	 * @return	 編集後文字列
	 */
	private String replaceSlashAdd(String in) {
		if (in == null)
			return null;
		StringBuffer buffer = new StringBuffer(in.length() * 2);
		for (int i = 0; i < in.length(); i++) {
			char c = in.charAt(i);
			if (c == '\\')
				buffer.append("\\\\");
			else
				buffer.append(c);
		}
		return buffer.toString();
	}
	
	/**
	 * 文字(\\)変換、「\\」なら、「\」を削除する
	 * 
	 * @param in
	 *            文字列
	 * @return 編集後文字列
	 */
	private String replaceSlashSub(String in) {
		if (in == null)
			return null;
		return in.replaceAll("\\\\\\\\", "\\\\");
	}
	
	/**
	 * 文字列長さチェック
	 * 
	 * @param strInString
	 *			入力パラメータ
	 * @return 正常:true / エラー:false
	 */
	public int strLengthChk(String strInput) {
		int intLen = 0;
		try {
			byte[] bytstr = strInput.getBytes("SJIS");
			intLen = bytstr.length;
		} catch (Exception e) {
			return 0;
		}
		return intLen;
	}
	
	/**
	 * 禁則文字チェック(「_」 「%」「\」)
	 * 
	 * @param str
	 *			文字列
	 * @return 「_」: true 「%」: true 「\」: true その他: false
	 */
	private boolean chkHankaku(String str) {
		CharacterIterator iter = new StringCharacterIterator(str);
		for (char c = iter.first(); c != CharacterIterator.DONE; c = iter.next()) {
			// 「%」 0x0025
			if (c == 0x0025) {
				// 禁則文字!
				return true;
			}
			// 「\」 0x005C
			if (c == 0x005C) {
				// 禁則文字!
				return true;
			}
			// 「_」 0x005F
			if (c == 0x005F) {
				// 禁則文字!
				return true;
			}
		}
		return false;
	}
	
	/*
	 * 日期のチェック
	 * 
	 * @param dataSource String
	 * 
	 * @return true or false boolean trueの場合　日期です、　falseの場合、日期ではない
	 */
	private boolean checkDate(String dataSource) {
		String flag = "";
		if (dataSource.matches("^^\\d{4}\\/\\d{2}\\/\\d{2}$")) {
			flag = "true";

		} else if (dataSource.matches("^^\\d{4}\\/\\d{1}\\/\\d{1}$")) {
			flag = "true";

		} else if (dataSource.matches("^^\\d{4}\\/\\d{2}\\/\\d{1}$")) {
			flag = "true";

		} else if (dataSource.matches("^^\\d{4}\\/\\d{1}\\/\\d{2}$")) {
			flag = "true";
		} else {
			flag = "false";
		}
		if ("true".equals(flag)) {
			try {
				SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
				dateFormat.setLenient(false);
				dateFormat.parse(dataSource);
				return true;
			} catch (Exception e) {
				return false;
			}
		} else {
			return false;
		}
	}
	
	/*
	 * 日期のチェック(時刻付け)
	 * 
	 * @param dataSource String
	 * 
	 * @return true or false boolean trueの場合　日期です、　falseの場合、日期ではない
	 */
	private boolean checkTime(String dataSource) {
		dataSource = dataSource.trim();
		if (dataSource.length()!= 4) {
			return false;
		}
		/* 時刻の時間が"00"～"23"の間以外の場合はエラーとする */
		if(Integer.parseInt(dataSource.substring(0,2)) < 0 || Integer.parseInt(dataSource.substring(0,2)) > 23) {
			return false;
		}
		/* 時刻の分が"00"～"59"の間以外の場合はエラーとする */
		if(Integer.parseInt(dataSource.substring(2,4)) < 0 || Integer.parseInt(dataSource.substring(2,4)) > 59) {
			return false;
		}
		return true;
	}
	
	/**
	 * 数値チェック 項目が数値か判断する
	 * 
	 * @param strInString
	 *            入力パラメータ
	 * @return 正常:true / エラー:false
	 */
	public boolean isNumChk(String strInString) {
		// 数値のinputをセット用
		try {
			Double.parseDouble(strInString);
		} catch (Exception e) {
			// 数値ではない場合Exceptionに飛ばして処理
			// falseをセットして処理を抜ける(エラー：数値以外の入力)
			return false;
		}
		if (strInString.indexOf('d') != -1 || strInString.indexOf('D') != -1
				|| strInString.indexOf('f') != -1
				|| strInString.indexOf('F') != -1) {
			return false;
		}
		// trueをセットして処理を抜ける(正常終了)
		return true;
	}

	/**
	 * 数値チェック 項目が数値か判断する
	 * 
	 * @param strInString
	 *            入力パラメータ
	 * @return 正常:true / エラー:false
	 */
	public static boolean isDigitChk(String strInString) {
		if (strInString.matches("[0-9]*")) {
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * 数値範囲チェック
	 * 
	 * @param strI	ing
	 *            数値
	 * @param integerSize
	 *            整数位数
	 * @param decimalSize
	 *            小数位数
	 * @return 正常:true / エラー:false
	 */
	public boolean isNotInNumRange(String strInString, int integerSize, int decimalSize) {

		String strInputString = null;
		// マイナスの場合
		if (strInString.indexOf("-") == 0) {
			strInputString = strInString.substring(1);
		} else {
			// 正数の場合
			strInputString = strInString;
		}
		int toneFlg = strInputString.indexOf('.');
		if (toneFlg == -1) {
			// 整数の場合
			if (strInputString.length() > integerSize) {
				return false;
			}
		} else {
			if (decimalSize == 0 && toneFlg == integerSize) {
				return false;
			}
			if (strInputString.length() > decimalSize + integerSize + 1) {
				return false;
			}
			// 整数
			String zhstr = strInputString.substring(0, toneFlg);
			// 小数
			String xistr = strInputString.substring(toneFlg + 1, strInputString.length());
			if (zhstr.length() > integerSize || xistr.length() > decimalSize) {
				return false;
			}
		}
		return true;
	}
	
	/**
     * 稼働日チェック処理を日付文字列で使えるようにした委譲メソッドです。
     * @param dateString 日付文字列
     * @return 稼働日の場合は true、 非稼働日の場合はfalseを返します。
     * @throws FoundationException  共通部品処理で失敗
     * @throws ParseException 型変換に失敗
     */
    private boolean isWorkDay(String dateString) throws FoundationException, ParseException {
    	
     Date date = Converter.strToDate(dateString, "yyyy/MM/dd");
   
     // 稼働日共通部品を生成し、チェック処理を実行
     WorkCalendar wc;
     if(!_Itemflg){
     	wc = new WorkCalendar(conn, sysUSER_CD, sp.getProcId(), this.sysPLANT_CD,struct.getITEM_CD(), date);
     }else{
     	wc = new WorkCalendar(conn, sysUSER_CD, sp.getProcId(), this.sysPLANT_CD, date);
     }
     boolean reslt = wc.isWorkDate();
     return reslt;
    }
	
    /**
     * 稼働日演算処理を日付文字列で使えるようにした委譲メソッドです。
     * @param dateString 日付文字列
     * @return 演算結果の日付文字列
     * @throws FoundationException 共通部品処理で失敗
     * @throws ParseException 型変換に失敗
     */
    private String calcWorkDay(String dateString, String timeString, String ltString, boolean flg)
     throws FoundationException, ParseException {

     // 渡されてきた時刻をhh24:mi:ss形式に整える
     timeString = timeString.substring(0,2) + ":" + timeString.substring(2) + ":00";

     // 引数の年月日と形式を整えた時刻を結合し、日付型に変換する
     Date date = Converter.strToDate(dateString + " " + timeString, "yyyy/MM/dd HH:mm:ss");
     int lt = Integer.parseInt(ltString);
   
     // 稼働日共通部品を生成し、チェック処理を実行
     WorkCalendar wc =
      new WorkCalendar(conn, sysUSER_CD, sp.getProcId(), this.sysPLANT_CD,struct.getITEM_CD(), date, lt, flg);
     Date resultDate = wc.calcDate();

     if (resultDate == null || "".equals(resultDate)){
    	 return ""; 
     }
     // 自動算出された日付を文字型に変換して保持する
     String tidydate = Converter.dateToStr(resultDate, "yyyy/MM/dd HH:mm:ss");

     // 自動算出された日付をyyyy/mm/dd hh24mi形式に整える
     tidydate = tidydate.substring(0,10) + tidydate.substring(11,13) + tidydate.substring(14,16);

     //return df.format(tidydate);
     return tidydate;
    }
    
	/**
	 * コンボボックスデータから表示説明を取得する
	 * 
	 * @param combo
	 *            コンボボックスデータ
	 * @param value
	 *            コンボボックスデータの値
	 * @return コンボボックスデータの表示説明
	 */
	private String getDisplayName(ComboStruct combo, String value) {
		for (int j = 0; j < combo.size(); j++) {
			if ((combo.getData(j)[0]).equals(value)) {
				return combo.getData(j)[1];
			}
		}
		return null;
	}
	
	//---------- 日付変換 -------------------------------------------
	public Date StrngToDt(String in){
		Date out = null;
		SimpleDateFormat fm = new SimpleDateFormat("yyyy/MM/dd HH:mm");
		if(in == null) return out;
		try{
			if((out = fm.parse(in)) != null) return out;
		}catch(ParseException e){}
		return out;
	}
	
	public String DtGetDate(Date in)
	{
		SimpleDateFormat fm = new SimpleDateFormat("yyyy/MM/dd");
		if(in == null) return null;
		return fm.format(in);
	}
	
	/**
	 * コンボボックスデータの存在チェック
	 * 
	 * @param combo
	 *			ンボボックスデータ
	 * @param value
	 *			コンボボックスデータの値
	 * @return コンボボックスデータ存在場合戻値true,存在しない場合戻値false
	 */
	private boolean checkCombValue(ComboStruct combo, String value) {
		for (int j = 0; j < combo.size(); j++) {
			if (value.equals((combo.getData(j)[0]))) {
				return true;
			}
		}
		return false;
	}
	
	/**
	* ＣＳＶ出力データ設定準備
	* 
	* @param target_struct
	*			対象データ情報
	* @param errTyp
	*			エラー区分 
	* @param errlineNo
	*			エラー発生行
	* @param errItemNo
	*			エラー項目番号
	* @param errItem
	*			エラー項目名
	* @param errMsg
	*			エラーメッセージ
	* @param errItemCd
	*			エラー項目名
	* @param errItemCd1
	*			エラー項目名
	* @param errItemCd2
	*			エラー項目名
	* @return 異常なし true エラー false
	*/  
	
	private boolean csvExport(AE0180010Struct targetStruct, String errTyp, int errlineNo, String errItem, String errMsg, String errItemCd,String errItemCd1,String errItemCd2) {
		AE0180010Struct errStruct = new AE0180010Struct();
		AE0180010Struct infoStruct = new AE0180010Struct();
		// エラー箇所
		ExpjMessage emsg = new ExpjMessage("AA01520", String.valueOf(errlineNo));
		errStruct.setl_ERROR_IN(emsg.getMessage(_locale));
		
		String strErrItem = null;
		if(!isNull(errItemCd2)){
			strErrItem = CoreTools.getRBString(errItem, _resource) + "," +CoreTools.getRBString(errItemCd, _resource)+ "," 
		                 +CoreTools.getRBString(errItemCd1, _resource)+ "," +CoreTools.getRBString(errItemCd2, _resource);
		}else if(!isNull(errItemCd1)){
			strErrItem = CoreTools.getRBString(errItem, _resource) + "," +CoreTools.getRBString(errItemCd, _resource)+ "," 
	                 +CoreTools.getRBString(errItemCd1, _resource);
		}else if(!isNull(errItemCd)) {
			strErrItem = CoreTools.getRBString(errItem, _resource) + "," +CoreTools.getRBString(errItemCd, _resource);
		}else{
			strErrItem = CoreTools.getRBString(errItem, _resource);
		}

		int errline = errlineNo-1;
		infoStruct =(AE0180010Struct)listCsvTemp.get(errline);
		// エラー区分
		errStruct.setl_ERR_TYP(getDisplayName(_COM_ERR_TYP, errTyp));
		// エラー内容
		errStruct.setl_ERR_INFO(errMsg);
		// エラー項目名
		errStruct.setl_ERR_CTR_NM(strErrItem);
		// 品目番号
		errStruct.setl_ERR_ITEM_CD(replaceSlashAdd(infoStruct.getITEM_CD()));	
		// 発注納期
		errStruct.setl_ERR_PRD_DUE_DATE(replaceSlashAdd(infoStruct.getPUCH_ODR_DLV_DATE()));
		// 発注予定日
		errStruct.setl_ERR_PUCH_ODR_DLV_DATE(replaceSlashAdd(infoStruct.getL_PUCH_ODR_START_DATE()));
		// 発注数
		errStruct.setl_ERR_PUCH_ODR_QTY(replaceSlashAdd(infoStruct.getL_PUCH_ODR_QTY()));
		// 取引先コード
		errStruct.setl_ERR_VEND_CD(replaceSlashAdd(infoStruct.getVEND_CD()));
		// 製番
		errStruct.setl_ERR_JOB_ODR_CD(replaceSlashAdd(infoStruct.getL_JOB_ODR_CD()));
		// 取引先回答納期
		errStruct.setl_ERR_CONFIRM_DLV_DATE(replaceSlashAdd(infoStruct.getCONFIRM_DLV_DATE()));
		// 受入場所
		errStruct.setl_ERR_WH_CD(replaceSlashAdd(infoStruct.getWH_CD()));
		// 備考
		errStruct.setl_ERR_WORK_IN_PROC_COMMENT(replaceSlashAdd(infoStruct.getPUCH_ODR_COMMENT()));
		// 備品発注フラグ
		errStruct.setl_ERR_NON_NO_ITEM_FLG(replaceSlashAdd(infoStruct.getNON_NO_ITEM_FLG()));
		// 備品発注品目名
		errStruct.setl_ERR_NON_NO_ITEM_NAME(replaceSlashAdd(infoStruct.getNON_NO_ITEM_NAME()));
		// 備品発注製品区分
		errStruct.setl_ERR_NON_NO_ITEM_TYP(replaceSlashAdd(infoStruct.getNON_NO_ITEM_TYP()));
		// 備品発注単位
		errStruct.setl_ERR_NON_NO_ITEM_PUCH_ODR_UNIT(replaceSlashAdd(infoStruct.getNON_NO_ITEM_PUCH_ODR_UNIT()));
		// 単価区分
		errStruct.setl_ERR_UNIT_COST_TYP(replaceSlashAdd(infoStruct.getL_UNIT_COST_TYP()));
		// 単価
		errStruct.setl_ERR_ACTUAL_UNIT_PRICE(replaceSlashAdd(infoStruct.getL_UNIT_COST()));
		// 加工費
		errStruct.setl_ERR_PROCESSING_COST(replaceSlashAdd(infoStruct.getL_PROCESSING_COST()));
		// 材料費
		errStruct.setl_ERR_MATERIAL_COST(replaceSlashAdd(infoStruct.getL_MATERIAL_COST()));
		// その他経費
		errStruct.setl_ERR_OTHER_OVERHEADS(replaceSlashAdd(infoStruct.getL_OTHER_OVERHEADS()));
		// 本体金額
		errStruct.setl_ERR_NET_AMOUNT(replaceSlashAdd(infoStruct.getL_NET_AMOUNT()));
		// 為替レート
		errStruct.setl_ERR_EXCH_RATE(replaceSlashAdd(infoStruct.getL_EXCH_RATE()));
//20150806 ADD START BY SYSCOM
		//科目コード
		errStruct.setl_ERR_EXPENSE_CLASS_CD(replaceSlashAdd(infoStruct.getACCT_CD()));
		//負担部門コード
		errStruct.setl_ERR_DEPT_CD(replaceSlashAdd(infoStruct.getDEPT_CD()));
		//プロジェクトコード
		errStruct.setl_ERR_PJ_CD(replaceSlashAdd(infoStruct.getPJ_CD()));
		//セグメント1
		errStruct.setl_ERR_SEG_CONTENTS1(replaceSlashAdd(infoStruct.getSEG_CONTENTS1()));
		//セグメント2
		errStruct.setl_ERR_SEG_CONTENTS2(replaceSlashAdd(infoStruct.getSEG_CONTENTS2()));
		//セグメント3
		errStruct.setl_ERR_SEG_CONTENTS3(replaceSlashAdd(infoStruct.getSEG_CONTENTS3()));
		//セグメント4
		errStruct.setl_ERR_SEG_CONTENTS4(replaceSlashAdd(infoStruct.getSEG_CONTENTS4()));
//20150806 ADD END BY SYSCOM
		
		// listを追加
		list.add(errStruct);
		return true;
	}
	
	/**
	 * ＣＳＶデータチェック
	 * @param csvList
	 * @return
	 * @throws BusinessProcessException
	 * @throws FoundationException
	 */
	private boolean checkCsvData(List csvList) throws BusinessProcessException, FoundationException {

		// 全部レコード数
		_intTotalCount = csvList.size();
		AE0180010Struct csvStruct = new AE0180010Struct();
		boolean itemCheckFlg = false;
		// 発注納期日付
		String strDlvYmd = null;
		// 発注予定日日付
		String strStartYmd = null;
		// 取引先回答納期*/
		String strConfirmYmd = null;
		
		try {

			for (int i = 0; i < csvList.size(); i++)	{
	             //フラグを初期化
		        _Itemflg = true;
		        itemCheckFlg = false;
				csvStruct =(AE0180010Struct)csvList.get(i);
				warningFlg = false;
				AE0180010Struct itemStruct = new AE0180010Struct();
				AE0180010Struct jobOdrStruct = new AE0180010Struct();
				// CSVファイルの項目数チェックを行う
				if (!isNull(csvStruct.getw_COLUMN_FLG())) {
					if (Integer.parseInt(csvStruct.getw_COLUMN_FLG()) < CSV_NECESSARY_COLUMN) {
						// 項目に不足がある場合
						_emsg = new ExpjMessage("AA01500", csvStruct.getw_COLUMN_FLG());
					} else {
						// 項目が必要数以上の場合
						_emsg = new ExpjMessage("AA01519", csvStruct.getw_COLUMN_FLG());
					}
					csvExport(csvStruct					// 対象データ情報
							, "1"						// エラー区分
							, i + 1						// エラー発生行
							, null						// エラー項目名
							, _emsg.getMessage(_locale) // エラーメッセージ
							, null
							, null
							, null); 
					_intErrorCount++;
					continue;
				}
				// 以下品目番号のチェック
				// 備品以外、かつNULLの場合
				if("0".equals(csvStruct.getNON_NO_ITEM_FLG()) && isNull(csvStruct.getITEM_CD())){
					csvExport(csvStruct						// 対象データ情報
							, "1"							// エラー区分
							, i + 1							// エラー発生行
							, "Expj.ITEM_CD"				// エラー項目名
							, new ExpjMessage("AB00002").getMessage(_locale)		// エラーメッセージ
							, null
							, null
							, null); 
					_intErrorCount++;
					continue;
				// 備品、かつ品目番号と備品発注品目名がNULLの場合
				}else if("1".equals(csvStruct.getNON_NO_ITEM_FLG()) && isNull(csvStruct.getNON_NO_ITEM_NAME())
						&& isNull(csvStruct.getITEM_CD())){
					csvExport(csvStruct						// 対象データ情報
							, "1"							// エラー区分
							, i + 1							// エラー発生行
							, "Expj.ITEM_CD"				// エラー項目名
							, new ExpjMessage("AB00002").getMessage(_locale)		// エラーメッセージ
							, null
							, null
							, null); 
					_intErrorCount++;
					continue;
				// 品目番号がNULL以外の場合
				}else if(!isNull(csvStruct.getITEM_CD())){
					// 文字26桁以上の場合
					if (strLengthChk(csvStruct.getITEM_CD()) >= 26) {
						csvExport(csvStruct						// 対象データ情報
								, "1"							// エラー区分
								, i + 1							// エラー発生行
								, "Expj.ITEM_CD"				// エラー項目名
								, new ExpjMessage("AA01501").getMessage(_locale)		// エラーメッセージ
								, null
								, null
								, null); 
						_intErrorCount++;
						continue;
					}
					// 品目番号、禁則文字が入力されていた場合
					if (chkHankaku(csvStruct.getITEM_CD())) {
						csvExport(csvStruct						// 対象データ情報
								, "1"							// エラー区分
								, i + 1							// エラー発生行
								, "Expj.ITEM_CD"				// エラー項目名
								, new ExpjMessage("AA01524").getMessage(_locale)		// エラーメッセージ
								, null
								, null
								, null); 
						_intErrorCount++;
						continue;
					}
					struct.setITEM_CD(csvStruct.getITEM_CD());
				}
				// 以下発注納期のチェック
				// NULLの場合
				if(isNull(csvStruct.getPUCH_ODR_DLV_DATE())){
					csvExport(csvStruct						// 対象データ情報
							, "1"							// エラー区分
							, i + 1							// エラー発生行
							, "Expj.PRD_DUE_DATE_1"			// エラー項目名
							, new ExpjMessage("AE00014").getMessage(_locale)		// エラーメッセージ
							, null
							, null
							, null); 
					_intErrorCount++;
					continue;
				}else{
					String strDate = csvStruct.getPUCH_ODR_DLV_DATE();
					int dateIdx = strDate.indexOf(_space);
					if (dateIdx < 0) {
						strDlvYmd = csvStruct.getPUCH_ODR_DLV_DATE();
						// 日付型でない場合
						if (!checkDate(csvStruct.getPUCH_ODR_DLV_DATE())) {
							csvExport(csvStruct                         // 対象データ情報
									 , "1"								// エラー区分
									 , i + 1							// エラー行番号
									 , "Expj.PRD_DUE_DATE_1"			// エラー項目名
									 , new ExpjMessage("AA01606").getMessage(_locale)// エラーメッセージ
									 , null
									 , null
									 , null);	
							_intErrorCount++;
							continue;
						}
					} else {
						strDlvYmd = strDate.substring(0, dateIdx);
						String strTime = strDate.substring(dateIdx+1);
						if ("false".equals(struct.getTIME_CTRL())) {
							strTime = "0000";
							csvStruct.setPUCH_ODR_DLV_DATE(strDlvYmd+_space+strTime);
						}
						if (!checkDate(strDlvYmd) || !checkTime(strTime)) {
							csvExport(csvStruct                         // 対象データ情報
									 , "1"								// エラー区分
									 , i + 1							// エラー行番号
									 , "Expj.PRD_DUE_DATE_1"			// エラー項目名
									 , new ExpjMessage("AA01606").getMessage(_locale)// エラーメッセージ
									 , null
									 , null
									 , null);	
							_intErrorCount++;
							continue;
						}
					}
				}
				// 以下発注予定日のチェック
				// 発注予定日がNULL以外場合
				if(!isNull(csvStruct.getPUCH_ODR_START_DATE())){
					String strDate = csvStruct.getPUCH_ODR_START_DATE();
					int dateIdx = strDate.indexOf(_space);
					if (dateIdx < 0) {
						strStartYmd = csvStruct.getPUCH_ODR_START_DATE();
						// 日付型でない場合
						if (!checkDate(csvStruct.getPUCH_ODR_START_DATE())) {
							csvExport(csvStruct                         // 対象データ情報
									, "1"								// エラー区分
									, i + 1							// エラー行番号
									, "Expj.PUCH_ODR_DLV_DATE_1"		// エラー項目名
									, new ExpjMessage("AA01606").getMessage(_locale)// エラーメッセージ
									, null
									, null
									, null);	
							_intErrorCount++;
							continue;
						}
					} else {
						strStartYmd = strDate.substring(0, dateIdx);
						String strTime = strDate.substring(dateIdx+1);
						if ("false".equals(struct.getTIME_CTRL())) {
							strTime = "0000";
							csvStruct.setPUCH_ODR_START_DATE(strStartYmd+_space+strTime);
						}
						if (!checkDate(strStartYmd) || !checkTime(strTime)) {
							csvExport(csvStruct                         // 対象データ情報
									, "1"								// エラー区分
									, i + 1							// エラー行番号
									, "Expj.PUCH_ODR_DLV_DATE_1"		// エラー項目名
									, new ExpjMessage("AA01606").getMessage(_locale)// エラーメッセージ
									, null
									, null
									, null);	
							_intErrorCount++;
							continue;
						}
					}
				}
				// 以下発注数のチェック
				// NULLの場合
				if (isNull(csvStruct.getPUCH_ODR_QTY())){
					csvExport(csvStruct						// 対象データ情報
							, "1"							// エラー区分
							, i + 1							// エラー発生行
							, "Expj.PUCH_ODR_QTY"			// エラー項目名
							, new ExpjMessage("AE32609").getMessage(_locale)		// エラーメッセージ
							, null
							, null
							, null); 
					_intErrorCount++;
					continue;
				}else{
					// 数値以外の場合
					if (!isNumChk(csvStruct.getPUCH_ODR_QTY())) {
						csvExport(csvStruct                         // 対象データ情報
								 , "1"								// エラー区分
								 , i + 1							// エラー行番号
								 , "Expj.PUCH_ODR_QTY"				// エラー項目名
								 , new ExpjMessage("AA01503").getMessage(_locale)// エラーメッセージ
								 , null 
								 , null
								 , null);	
						_intErrorCount++;
						continue;
					}
					// マイナスの場合
					if (Calculate.compare(csvStruct.getPUCH_ODR_QTY(), "0") == -1) {
						csvExport(csvStruct                         // 対象データ情報
								 , "1"								// エラー区分
								 , i + 1							// エラー行番号
								 , "Expj.PUCH_ODR_QTY"				// エラー項目名
								 , new ExpjMessage("AD34026").getMessage(_locale)// エラーメッセージ
								 , null
								 , null
								 , null);	
						_intErrorCount++;
						continue;
					}
					// 有効桁数(整数部14桁:小数部4桁)を超過場合
					if (!isNotInNumRange(csvStruct.getPUCH_ODR_QTY(), 14, 4)) {
						// 多言語項目取得セット
	                    String ErrInfo = CoreTools.getRBString("Expj.PUCH_ODR_QTY", resource);
						csvExport(csvStruct                         // 対象データ情報
								 , "1"								// エラー区分
								 , i + 1							// エラー行番号
								 , "Expj.PUCH_ODR_QTY"				// エラー項目名
								 , new ExpjMessage("AA00215",ErrInfo).getMessage(_locale)	// エラーメッセージ
								 , null
								 , null
								 , null);
						_intErrorCount++;
						continue;
					}
				}
				// 以下取引先コードのチェック
				// NULLの場合
				if (isNull(csvStruct.getVEND_CD())){
					csvExport(csvStruct						// 対象データ情報
							, "1"							// エラー区分
							, i + 1							// エラー発生行
							, "Expj.VEND_CD"				// エラー項目名
							, new ExpjMessage("AA02004").getMessage(_locale)		// エラーメッセージ
							, null
							, null
							, null); 
					_intErrorCount++;
					continue;
				}else{
					// 文字26桁以上の場合
					if (strLengthChk(csvStruct.getVEND_CD()) >= 26) {
						csvExport(csvStruct						// 対象データ情報
								, "1"							// エラー区分
								, i + 1							// エラー発生行
								, "Expj.VEND_CD"				// エラー項目名
								, new ExpjMessage("AA01501").getMessage(_locale)		// エラーメッセージ
								, null
								, null
								, null); 
						_intErrorCount++;
						continue;
					}
					// 禁則文字が入力されていた場合
					if (chkHankaku(csvStruct.getVEND_CD())) {
						csvExport(csvStruct						// 対象データ情報
								, "1"							// エラー区分
								, i + 1							// エラー発生行
								, "Expj.VEND_CD"				// エラー項目名
								, new ExpjMessage("AA01524").getMessage(_locale)		// エラーメッセージ
								, null
								, null
								, null); 
						_intErrorCount++;
						continue;
					}
				}
				// 以下製番のチェック
				// 製番がNULL以外の場合
				if(!isNull(csvStruct.getJOB_ODR_CD())){
					// 文字26桁以上の場合
					if (strLengthChk(csvStruct.getJOB_ODR_CD()) >= 26) {
						csvExport(csvStruct						// 対象データ情報
								, "1"							// エラー区分
								, i + 1							// エラー発生行
								, "Expj.JOB_ODR_CD"				// エラー項目名
								, new ExpjMessage("AA01501").getMessage(_locale)		// エラーメッセージ
								, null
								, null
								, null); 
						_intErrorCount++;
						continue;
					}
					// 禁則文字が入力されていた場合
					if (chkHankaku(csvStruct.getJOB_ODR_CD())) {
						csvExport(csvStruct						// 対象データ情報
								, "1"							// エラー区分
								, i + 1							// エラー発生行
								, "Expj.JOB_ODR_CD"				// エラー項目名
								, new ExpjMessage("AA01524").getMessage(_locale)		// エラーメッセージ
								, null
								, null
								, null); 
						_intErrorCount++;
						continue;
					}
				}
				// 以下取引先回答納期のチェック
				// 取引先回答納期がNULL以外の場合
				if(!isNull(csvStruct.getCONFIRM_DLV_DATE())){
					String strDate = csvStruct.getCONFIRM_DLV_DATE();
					int dateIdx = strDate.indexOf(_space);
					if (dateIdx < 0) {
						// 日付型でない場合
						strConfirmYmd = csvStruct.getCONFIRM_DLV_DATE();
						if (!checkDate(csvStruct.getCONFIRM_DLV_DATE())) {
							csvExport(csvStruct                         // 対象データ情報
									, "1"								// エラー区分
									, i + 1							// エラー行番号
									, "Expj.CONFIRM_DLV_DATE_1"		// エラー項目名
									, new ExpjMessage("AA01606").getMessage(_locale)// エラーメッセージ
									, null
									, null
									, null);	
							_intErrorCount++;
							continue;
						}
					} else {
						strConfirmYmd = strDate.substring(0, dateIdx);
						String strTime = strDate.substring(dateIdx+1);
						if ("false".equals(struct.getTIME_CTRL())) {
							strTime = "0000";
							csvStruct.setCONFIRM_DLV_DATE(strConfirmYmd+_space+strTime);
						}
						if (!checkDate(strConfirmYmd) || !checkTime(strTime)) {
							// 日付型でない場合
							if (!checkDate(csvStruct.getCONFIRM_DLV_DATE())) {
								csvExport(csvStruct                         // 対象データ情報
										, "1"								// エラー区分
										, i + 1							// エラー行番号
										, "Expj.CONFIRM_DLV_DATE_1"		// エラー項目名
										, new ExpjMessage("AA01606").getMessage(_locale)// エラーメッセージ
										, null
										, null
										, null);	
								_intErrorCount++;
								continue;
							}
						}
					}
				}
				// 以下受入場所のチェック
				// NULLの場合
				if (isNull(csvStruct.getWH_CD())){
					csvExport(csvStruct						// 対象データ情報
							, "1"							// エラー区分
							, i + 1							// エラー発生行
							, "Expj.WH_CD_2"				// エラー項目名
							, new ExpjMessage("AE00013").getMessage(_locale)		// エラーメッセージ
							, null
							, null
							, null); 
					_intErrorCount++;
					continue;
				}else{
					// 文字26桁以上の場合
					if (strLengthChk(csvStruct.getWH_CD()) >= 26) {
						csvExport(csvStruct						// 対象データ情報
								, "1"							// エラー区分
								, i + 1							// エラー発生行
								, "Expj.WH_CD_2"				// エラー項目名
								, new ExpjMessage("AA01501").getMessage(_locale)		// エラーメッセージ
								, null
								, null
								, null); 
						_intErrorCount++;
						continue;
					}
					// 禁則文字が入力されていた場合
					if (chkHankaku(csvStruct.getWH_CD())) {
						csvExport(csvStruct						// 対象データ情報
								, "1"							// エラー区分
								, i + 1							// エラー発生行
								, "Expj.WH_CD_2"				// エラー項目名
								, new ExpjMessage("AA01524").getMessage(_locale)		// エラーメッセージ
								, null
								, null
								, null); 
						_intErrorCount++;
						continue;
					}
				}
				// 以下備考のチェック
				// 備考がNULL以外の場合
				if(!isNull(csvStruct.getPUCH_ODR_COMMENT())){
				    // 文字81桁以上の場合
				    if (strLengthChk(csvStruct.getPUCH_ODR_COMMENT()) >= 81) {
					    csvExport(csvStruct						// 対象データ情報
   						   	     , "1"							// エラー区分
							     , i + 1						// エラー発生行
							     , "Expj.WORK_IN_PROC_COMMENT_3"// エラー項目名
							     , new ExpjMessage("AA01501").getMessage(_locale)		// エラーメッセージ
							     , null
							     , null
								 , null); 
					    _intErrorCount++;
					    continue;
				    }
				    // 禁則文字が入力されていた場合
					if (chkHankaku(csvStruct.getPUCH_ODR_COMMENT())) {
						csvExport(csvStruct						// 対象データ情報
								, "1"							// エラー区分
								, i + 1							// エラー発生行
								, "Expj.WORK_IN_PROC_COMMENT_3"	// エラー項目名
								, new ExpjMessage("AA01524").getMessage(_locale)		// エラーメッセージ
								, null
								, null
								, null); 
						_intErrorCount++;
						continue;
					}
				}
				// 以下備品発注フラグのチェック
				// NULLの場合
				if (isNull(csvStruct.getNON_NO_ITEM_FLG())){
					csvExport(csvStruct						// 対象データ情報
							, "1"							// エラー区分
							, i + 1							// エラー発生行
							, "Expj.NON_NO_ITEM_FLG"		// エラー項目名
							, new ExpjMessage("AE05069").getMessage(_locale)		// エラーメッセージ
							, null
							, null
							, null); 
					_intErrorCount++;
					continue;
				}else{
				    // 数値以外の場合
					if (!isNumChk(csvStruct.getNON_NO_ITEM_FLG())) {
						csvExport(csvStruct                         // 対象データ情報
								 , "1"								// エラー区分
								 , i + 1							// エラー行番号
								 , "Expj.NON_NO_ITEM_FLG"			// エラー項目名
								 , new ExpjMessage("AA01503").getMessage(_locale)// エラーメッセージ
								 , null 
								 , null
								 , null);	
						_intErrorCount++;
						continue;
					}
					// (0,1)以外の場合
					boolean comFlag1 = checkCombValue(_NON_NO_ITEM_FLG, csvStruct.getNON_NO_ITEM_FLG());
					if (comFlag1 == false) {
						csvExport(csvStruct                                 // 対象データ情報
								, "1"										// エラー区分
								, i + 1										// エラー行番号
								, "Expj.NON_NO_ITEM_FLG"					// エラー項目名
								, new ExpjMessage("AE05070").getMessage(_locale)// エラーメッセージ
								, null
								, null
								, null);	
						_intErrorCount++;
						continue;
					}
				}
				// 以下備品発注品目名のチェック
				// 備品、かつ品目番号と備品発注品目名がNULLの場合
		        if("1".equals(csvStruct.getNON_NO_ITEM_FLG()) && isNull(csvStruct.getITEM_CD())
					&& isNull(csvStruct.getNON_NO_ITEM_NAME())){
		        	csvExport(csvStruct						// 対象データ情報
							, "1"							// エラー区分
							, i + 1							// エラー発生行
							, "Expj.NON_NO_ITEM_NAME"		// エラー項目名
							, new ExpjMessage("AE05071").getMessage(_locale)		// エラーメッセージ
							, null
							, null
							, null); 
					_intErrorCount++;
					continue;
		        }else{
		        	// 備品発注品目名がNULL以外場合
		        	if(!isNull(csvStruct.getNON_NO_ITEM_NAME())){
		        		// 桁数が４１桁以上の場合
			        	if (strLengthChk(csvStruct.getNON_NO_ITEM_NAME()) >= 41) {
						    csvExport(csvStruct						// 対象データ情報
	   						   	     , "1"							// エラー区分
								     , i + 1						// エラー発生行
								     , "Expj.NON_NO_ITEM_NAME"		// エラー項目名
								     , new ExpjMessage("AA01501").getMessage(_locale)		// エラーメッセージ
								     , null
								     , null
									 , null); 
						    _intErrorCount++;
						    continue;
					    }
					    // 禁則文字が入力されていた場合
						if (chkHankaku(csvStruct.getNON_NO_ITEM_NAME())) {
							csvExport(csvStruct						// 対象データ情報
									, "1"							// エラー区分
									, i + 1							// エラー発生行
									, "Expj.NON_NO_ITEM_NAME"		// エラー項目名
									, new ExpjMessage("AA01524").getMessage(_locale)		// エラーメッセージ
									, null
									, null
									, null); 
							_intErrorCount++;
							continue;
						}
		        	}
		        }
		        // 以下備品発注製品区分のチェック
		        // 備品かつNULLの場合
		        if("1".equals(csvStruct.getNON_NO_ITEM_FLG())  && isNull(csvStruct.getNON_NO_ITEM_TYP())){
			        	csvExport(csvStruct						// 対象データ情報
								, "1"							// エラー区分
								, i + 1							// エラー発生行
								, "Expj.NON_NO_ITEM_TYP"		// エラー項目名
								, new ExpjMessage("AE05072").getMessage(_locale)		// エラーメッセージ
								, null
								, null
								, null); 
						_intErrorCount++;
						continue;
		        }else{
		        	// NULL以外の場合
		        	if (!isNull(csvStruct.getNON_NO_ITEM_TYP())){
		        		// 数値以外の場合
						if (!isNumChk(csvStruct.getNON_NO_ITEM_TYP())) {
							csvExport(csvStruct                         // 対象データ情報
									 , "1"								// エラー区分
									 , i + 1							// エラー行番号
									 , "Expj.NON_NO_ITEM_TYP"			// エラー項目名
									 , new ExpjMessage("AA01503").getMessage(_locale)// エラーメッセージ
									 , null 
									 , null
									 , null);	
							_intErrorCount++;
							continue;
						}
						
						// (1,2,3,4,5)以外の場合
						boolean comFlag1 = checkCombValue(_PRODUCT_TYP, csvStruct.getNON_NO_ITEM_TYP());
						if ("1".equals(csvStruct.getNON_NO_ITEM_FLG()) && comFlag1 == false) {
							csvExport(csvStruct                                 // 対象データ情報
									, "1"										// エラー区分
									, i + 1										// エラー行番号
									, "Expj.NON_NO_ITEM_TYP"					// エラー項目名
									, new ExpjMessage("AE05070").getMessage(_locale)// エラーメッセージ
									, null
									, null
									, null);	
							_intErrorCount++;
							continue;
						}
			        }
		        }
		        // 以下備品発注単位のチェック
		        // 備品発注単位がNULL以外の場合
		        if(!isNull(csvStruct.getNON_NO_ITEM_PUCH_ODR_UNIT())){
		        	// 桁数が13桁以上の場合
		        	if (strLengthChk(csvStruct.getNON_NO_ITEM_PUCH_ODR_UNIT()) >= 13) {
					    csvExport(csvStruct						    // 対象データ情報
   						   	     , "1"							    // エラー区分
							     , i + 1							// エラー発生行
							     , "Expj.NON_NO_ITEM_PUCH_ODR_UNIT"	// エラー項目名
							     , new ExpjMessage("AA01501").getMessage(_locale)		// エラーメッセージ
							     , null
							     , null
								 , null); 
					    _intErrorCount++;
					    continue;
				    }
				    // 禁則文字が入力されていた場合
					if (chkHankaku(csvStruct.getNON_NO_ITEM_PUCH_ODR_UNIT())) {
						csvExport(csvStruct						     // 対象データ情報
								, "1"							     // エラー区分
								, i + 1							     // エラー発生行
								, "Expj.NON_NO_ITEM_PUCH_ODR_UNIT"	 // エラー項目名
								, new ExpjMessage("AA01524").getMessage(_locale)		// エラーメッセージ
								, null
								, null
								, null); 
						_intErrorCount++;
						continue;
					}
		        }
		        // 以下単価区分のチェック
		        // 単価区分がNULL以外の場合
		        if(!isNull(csvStruct.getUNIT_COST_TYP())){
		        	// 数値以外の場合
					if (!isNumChk(csvStruct.getUNIT_COST_TYP())) {
						csvExport(csvStruct                         // 対象データ情報
								 , "1"								// エラー区分
								 , i + 1							// エラー行番号
								 , "Expj.UNIT_COST_TYP"				// エラー項目名
								 , new ExpjMessage("AA01503").getMessage(_locale)// エラーメッセージ
								 , null 
								 , null
								 , null);	
						_intErrorCount++;
						continue;
					}
					
					// (1,2)以外の場合
					boolean comFlag1 = checkCombValue(_UNIT_COST_TYP, csvStruct.getUNIT_COST_TYP());
					if (comFlag1 == false) {
						csvExport(csvStruct                                 // 対象データ情報
								, "1"										// エラー区分
								, i + 1										// エラー行番号
								, "Expj.UNIT_COST_TYP"					    // エラー項目名
								, new ExpjMessage("AE05070").getMessage(_locale)// エラーメッセージ
								, null
								, null
								, null);	
						_intErrorCount++;
						continue;
					}
		        }
		        // 以下単価のチェック
		        // 単価がNULL以外の場合
		        if(!isNull(csvStruct.getUNIT_COST())){
		        	// 数値以外の場合
					if (!isNumChk(csvStruct.getUNIT_COST())) {
						csvExport(csvStruct                         // 対象データ情報
								 , "1"								// エラー区分
								 , i + 1							// エラー行番号
								 , "Expj.ACTUAL_UNIT_PRICE"			// エラー項目名
								 , new ExpjMessage("AA01503").getMessage(_locale)// エラーメッセージ
								 , null 
								 , null
								 , null);	
						_intErrorCount++;
						continue;
					}
					// マイナスの場合
					if (Calculate.compare(csvStruct.getUNIT_COST(), "0") == -1) {
						csvExport(csvStruct                         // 対象データ情報
								 , "1"								// エラー区分
								 , i + 1							// エラー行番号
								 , "Expj.ACTUAL_UNIT_PRICE"			// エラー項目名
								 , new ExpjMessage("AD34026").getMessage(_locale)// エラーメッセージ
								 , null
								 , null
								 , null);	
						_intErrorCount++;
						continue;
					}
					// 有効桁数(整数部14桁:小数部4桁)を超過場合
					if (!isNotInNumRange(csvStruct.getUNIT_COST(), 14, 4)) {
						// 多言語項目取得セット
	                    String ErrInfo = CoreTools.getRBString("Expj.ACTUAL_UNIT_PRICE", resource);
						csvExport(csvStruct                         // 対象データ情報
								 , "1"								// エラー区分
								 , i + 1							// エラー行番号
								 , "Expj.ACTUAL_UNIT_PRICE"			// エラー項目名
								 , new ExpjMessage("AA00215",ErrInfo).getMessage(_locale)	// エラーメッセージ
								 , null
								 , null
								 , null);
						_intErrorCount++;
						continue;
					}
		        }
		        // 以下単価区分のチェック
		        // [CSV情報]．”単価”がNULL以外時、NULL場合
		        if(!isNull(csvStruct.getUNIT_COST()) && isNull(csvStruct.getUNIT_COST_TYP())){
		        	csvExport(csvStruct                         // 対象データ情報
							 , "1"								// エラー区分
							 , i + 1							// エラー行番号
							 , "Expj.UNIT_COST_TYP"				// エラー項目名
							 , new ExpjMessage("AD20033").getMessage(_locale)// エラーメッセージ
							 , null 
							 , null
							 , null);	
					_intErrorCount++;
					continue;
		        }
		        // 以下加工費のチェック
		        // [CSV情報]．”単価”がNULL以外時、NULL場合
		        if(!isNull(csvStruct.getUNIT_COST()) && isNull(csvStruct.getPROCESSING_COST())){
		        	csvExport(csvStruct                         // 対象データ情報
							 , "1"								// エラー区分
							 , i + 1							// エラー行番号
							 , "Expj.PROCESSING_COST"			// エラー項目名
							 , new ExpjMessage("AE00040").getMessage(_locale)// エラーメッセージ
							 , null 
							 , null
							 , null);	
					_intErrorCount++;
					continue;
		        }
		        // 加工費がNULL以外の場合
		        if(!isNull(csvStruct.getPROCESSING_COST())){
		        	// 数値以外の場合
					if (!isNumChk(csvStruct.getPROCESSING_COST())) {
						csvExport(csvStruct                         // 対象データ情報
								 , "1"								// エラー区分
								 , i + 1							// エラー行番号
								 , "Expj.PROCESSING_COST"			// エラー項目名
								 , new ExpjMessage("AA01503").getMessage(_locale)// エラーメッセージ
								 , null 
								 , null
								 , null);	
						_intErrorCount++;
						continue;
					}
					// マイナスの場合
					if (Calculate.compare(csvStruct.getPROCESSING_COST(), "0") == -1) {
						csvExport(csvStruct                         // 対象データ情報
								 , "1"								// エラー区分
								 , i + 1							// エラー行番号
								 , "Expj.PROCESSING_COST"			// エラー項目名
								 , new ExpjMessage("AD34026").getMessage(_locale)// エラーメッセージ
								 , null
								 , null
								 , null);	
						_intErrorCount++;
						continue;
					}
					// 有効桁数(整数部14桁:小数部4桁)を超過場合
					if (!isNotInNumRange(csvStruct.getPROCESSING_COST(), 14, 4)) {
						// 多言語項目取得セット
	                    String ErrInfo = CoreTools.getRBString("Expj.PROCESSING_COST", resource);
						csvExport(csvStruct                         // 対象データ情報
								 , "1"								// エラー区分
								 , i + 1							// エラー行番号
								 , "Expj.PROCESSING_COST"			// エラー項目名
								 , new ExpjMessage("AA00215",ErrInfo).getMessage(_locale)	// エラーメッセージ
								 , null
								 , null
								 , null);
						_intErrorCount++;
						continue;
					}
		        }
		        // 以下材料費のチェック
		        // [CSV情報]．”単価”がNULL以外時、NULL場合
		        if(!isNull(csvStruct.getUNIT_COST()) && isNull(csvStruct.getMATERIAL_COST())){
		        	csvExport(csvStruct                         // 対象データ情報
							 , "1"								// エラー区分
							 , i + 1							// エラー行番号
							 , "Expj.MATERIAL_COST"				// エラー項目名
							 , new ExpjMessage("AE00041").getMessage(_locale)// エラーメッセージ
							 , null 
							 , null
							 , null);	
					_intErrorCount++;
					continue;
		        }
		        // 材料費がNULL以外の場合
		        if(!isNull(csvStruct.getMATERIAL_COST())){
		        	// 数値以外の場合
					if (!isNumChk(csvStruct.getMATERIAL_COST())) {
						csvExport(csvStruct                         // 対象データ情報
								 , "1"								// エラー区分
								 , i + 1							// エラー行番号
								 , "Expj.MATERIAL_COST"				// エラー項目名
								 , new ExpjMessage("AA01503").getMessage(_locale)// エラーメッセージ
								 , null 
								 , null
								 , null);	
						_intErrorCount++;
						continue;
					}
					// マイナスの場合
					if (Calculate.compare(csvStruct.getMATERIAL_COST(), "0") == -1) {
						csvExport(csvStruct                         // 対象データ情報
								 , "1"								// エラー区分
								 , i + 1							// エラー行番号
								 , "Expj.MATERIAL_COST"				// エラー項目名
								 , new ExpjMessage("AD34026").getMessage(_locale)// エラーメッセージ
								 , null
								 , null
								 , null);	
						_intErrorCount++;
						continue;
					}
					// 有効桁数(整数部14桁:小数部4桁)を超過場合
					if (!isNotInNumRange(csvStruct.getMATERIAL_COST(), 14, 4)) {
						// 多言語項目取得セット
	                    String ErrInfo = CoreTools.getRBString("Expj.MATERIAL_COST", resource);
						csvExport(csvStruct                         // 対象データ情報
								 , "1"								// エラー区分
								 , i + 1							// エラー行番号
								 , "Expj.MATERIAL_COST"				// エラー項目名
								 , new ExpjMessage("AA00215",ErrInfo).getMessage(_locale)	// エラーメッセージ
								 , null
								 , null
								 , null);
						_intErrorCount++;
						continue;
					}
		        }
		        // 以下その他経費のチェック
		        // [CSV情報]．”単価”がNULL以外時、NULL場合
		        if(!isNull(csvStruct.getUNIT_COST()) && isNull(csvStruct.getOTHER_OVERHEADS())){
		        	csvExport(csvStruct                         // 対象データ情報
							 , "1"								// エラー区分
							 , i + 1							// エラー行番号
							 , "Expj.OTHER_OVERHEADS"			// エラー項目名
							 , new ExpjMessage("AE00042").getMessage(_locale)// エラーメッセージ
							 , null 
							 , null
							 , null);	
					_intErrorCount++;
					continue;
		        }
		        // その他経費がNULL以外の場合
		        if(!isNull(csvStruct.getOTHER_OVERHEADS())){
		        	// 数値以外の場合
					if (!isNumChk(csvStruct.getOTHER_OVERHEADS())) {
						csvExport(csvStruct                         // 対象データ情報
								 , "1"								// エラー区分
								 , i + 1							// エラー行番号
								 , "Expj.OTHER_OVERHEADS"			// エラー項目名
								 , new ExpjMessage("AA01503").getMessage(_locale)// エラーメッセージ
								 , null 
								 , null
								 , null);	
						_intErrorCount++;
						continue;
					}
					// マイナスの場合
					if (Calculate.compare(csvStruct.getOTHER_OVERHEADS(), "0") == -1) {
						csvExport(csvStruct                         // 対象データ情報
								 , "1"								// エラー区分
								 , i + 1							// エラー行番号
								 , "Expj.OTHER_OVERHEADS"			// エラー項目名
								 , new ExpjMessage("AD34026").getMessage(_locale)// エラーメッセージ
								 , null
								 , null
								 , null);	
						_intErrorCount++;
						continue;
					}
					// 有効桁数(整数部14桁:小数部4桁)を超過場合
					if (!isNotInNumRange(csvStruct.getOTHER_OVERHEADS(), 14, 4)) {
						// 多言語項目取得セット
	                    String ErrInfo = CoreTools.getRBString("Expj.OTHER_OVERHEADS", resource);
						csvExport(csvStruct                         // 対象データ情報
								 , "1"								// エラー区分
								 , i + 1							// エラー行番号
								 , "Expj.OTHER_OVERHEADS"			// エラー項目名
								 , new ExpjMessage("AA00215",ErrInfo).getMessage(_locale)	// エラーメッセージ
								 , null
								 , null
								 , null);
						_intErrorCount++;
						continue;
					}
		        }
		        // 以下本体金額のチェック
		        // 本体金額がNULL以外の場合
		        if(!isNull(csvStruct.getNET_AMOUNT())){
		        	// 数値以外の場合
					if (!isNumChk(csvStruct.getNET_AMOUNT())) {
						csvExport(csvStruct                         // 対象データ情報
								 , "1"								// エラー区分
								 , i + 1							// エラー行番号
								 , "Expj.NET_AMOUNT"				// エラー項目名
								 , new ExpjMessage("AA01503").getMessage(_locale)// エラーメッセージ
								 , null 
								 , null
								 , null);	
						_intErrorCount++;
						continue;
					}
					// マイナスの場合
					if (Calculate.compare(csvStruct.getNET_AMOUNT(), "0") == -1) {
						csvExport(csvStruct                         // 対象データ情報
								 , "1"								// エラー区分
								 , i + 1							// エラー行番号
								 , "Expj.NET_AMOUNT"				// エラー項目名
								 , new ExpjMessage("AD34026").getMessage(_locale)// エラーメッセージ
								 , null
								 , null
								 , null);	
						_intErrorCount++;
						continue;
					}
					// 有効桁数(整数部14桁:小数部4桁)を超過場合
					if (!isNotInNumRange(csvStruct.getNET_AMOUNT(), 14, 4)) {
						// 多言語項目取得セット
	                    String ErrInfo = CoreTools.getRBString("Expj.NET_AMOUNT", resource);
						csvExport(csvStruct                         // 対象データ情報
								 , "1"								// エラー区分
								 , i + 1							// エラー行番号
								 , "Expj.NET_AMOUNT"				// エラー項目名
								 , new ExpjMessage("AA00215",ErrInfo).getMessage(_locale)	// エラーメッセージ
								 , null
								 , null
								 , null);
						_intErrorCount++;
						continue;
					}
		        }
		        // 以下為替レートのチェック
		        // 為替レートがNULL以外の場合
		        if(!isNull(csvStruct.getEXCH_RATE())){
		        	// 数値以外の場合
					if (!isNumChk(csvStruct.getEXCH_RATE())) {
						csvExport(csvStruct                         // 対象データ情報
								 , "1"								// エラー区分
								 , i + 1							// エラー行番号
								 , "Expj.EXCH_RATE"					// エラー項目名
								 , new ExpjMessage("AA01503").getMessage(_locale)// エラーメッセージ
								 , null 
								 , null
								 , null);	
						_intErrorCount++;
						continue;
					}
					// マイナスの場合
					if (Calculate.compare(csvStruct.getEXCH_RATE(), "0") == -1) {
						csvExport(csvStruct                         // 対象データ情報
								 , "1"								// エラー区分
								 , i + 1							// エラー行番号
								 , "Expj.EXCH_RATE"				    // エラー項目名
								 , new ExpjMessage("AD34026").getMessage(_locale)// エラーメッセージ
								 , null
								 , null
								 , null);	
						_intErrorCount++;
						continue;
					}
					// 有効桁数(整数部14桁:小数部4桁)を超過場合
					if (!isNotInNumRange(csvStruct.getEXCH_RATE(), 14, 6)) {
						// 多言語項目取得セット
	                    String ErrInfo = CoreTools.getRBString("Expj.EXCH_RATE", resource);
						csvExport(csvStruct                         // 対象データ情報
								 , "1"								// エラー区分
								 , i + 1							// エラー行番号
								 , "Expj.EXCH_RATE"				    // エラー項目名
								 , new ExpjMessage("AE05073",ErrInfo).getMessage(_locale)	// エラーメッセージ
								 , null
								 , null
								 , null);
						_intErrorCount++;
						continue;
					}
		        }

//20150806 ADD START BY SYSCOM
				//科目コードのチェック
				//[CSV情報]．”科目コード”が入力されている場合
				if (!isNull(csvStruct.getACCT_CD())){
					//備品発注フラグが「0:備品以外（通常仕入品）」の場合
					if ("0".equals(csvStruct.getNON_NO_ITEM_FLG())){
						String ErrInfo = CoreTools.getRBString("Expj.EXPENSE_CLASS_CD", resource);
						csvExport(csvStruct						// 対象データ情報
							, "1"							// エラー区分
							, i + 1							// エラー発生行
							, "Expj.EXPENSE_CLASS_CD"		// エラー項目名
							, new ExpjMessage("AE25027",ErrInfo).getMessage(_locale)		// エラーメッセージ
							, null
							, null
							, null); 
						_intErrorCount++;
						continue;
					}
					//文字11桁以上の場合
					if (strLengthChk(csvStruct.getACCT_CD()) >= 11) {
						csvExport(csvStruct						    // 対象データ情報
							, "1"							    	// エラー区分
							, i + 1									// エラー発生行
							, "Expj.EXPENSE_CLASS_CD"				// エラー項目名
							, new ExpjMessage("AA01501").getMessage(_locale)		// エラーメッセージ
							, null
							, null
							, null); 
						_intErrorCount++;
						continue;
					}
					//禁則文字が入力されていた場合
					if (chkHankaku(csvStruct.getACCT_CD())) {
						csvExport(csvStruct						// 対象データ情報
							, "1"								// エラー区分
							, i + 1								// エラー発生行
							, "Expj.EXPENSE_CLASS_CD"			// エラー項目名
							, new ExpjMessage("AA01524").getMessage(_locale)		// エラーメッセージ
							, null
							, null
							, null); 
						_intErrorCount++;
						continue;
					}
				}

				//以下負担部門コードのチェック
				//[CSV情報]．”負担部門コード”が入力されている場合
				if (!isNull(csvStruct.getDEPT_CD())){
					//備品発注フラグが「0:備品以外（通常仕入品）」の場合
					if ("0".equals(csvStruct.getNON_NO_ITEM_FLG())){
						String ErrInfo = CoreTools.getRBString("Expj.DEPT_CD", resource);
						csvExport(csvStruct						// 対象データ情報
							, "1"								// エラー区分
							, i + 1								// エラー発生行
							, "Expj.DEPT_CD"					// エラー項目名
							, new ExpjMessage("AE25027",ErrInfo).getMessage(_locale)		// エラーメッセージ
							, null
							, null
							, null); 
						_intErrorCount++;
						continue;
					}
					//文字26桁以上の場合
					if (strLengthChk(csvStruct.getDEPT_CD()) >= 26) {
						csvExport(csvStruct						    // 対象データ情報
   							, "1"							    // エラー区分
							, i + 1							// エラー発生行
							, "Expj.DEPT_CD"	// エラー項目名
							, new ExpjMessage("AA01501").getMessage(_locale)		// エラーメッセージ
							, null
							, null
							, null);
						_intErrorCount++;
						continue;
					}
					//禁則文字が入力されていた場合
					if (chkHankaku(csvStruct.getDEPT_CD())) {
						csvExport(csvStruct						// 対象データ情報
							, "1"								// エラー区分
							, i + 1								// エラー発生行
							, "Expj.DEPT_CD"					// エラー項目名
							, new ExpjMessage("AA01524").getMessage(_locale)		// エラーメッセージ
							, null
							, null
							, null); 
						_intErrorCount++;
						continue;
					}
				}
				
				//以下プロジェクトコードのチェック
				//[CSV情報]．”プロジェクトコード”が入力されている場合
				if (!isNull(csvStruct.getPJ_CD())){
					//備品発注フラグが「0:備品以外（通常仕入品）」の場合
					if ("0".equals(csvStruct.getNON_NO_ITEM_FLG())){
						String ErrInfo = CoreTools.getRBString("Expj.PJ_CD", resource);
						csvExport(csvStruct						// 対象データ情報
							, "1"							// エラー区分
							, i + 1							// エラー発生行
							, "Expj.PJ_CD"				// エラー項目名
							, new ExpjMessage("AE25027",ErrInfo).getMessage(_locale)		// エラーメッセージ
							, null
							, null
							, null);
						_intErrorCount++;
						continue;
					}
					//文字16桁以上の場合
					if (strLengthChk(csvStruct.getPJ_CD()) >= 16) {
						csvExport(csvStruct						    // 対象データ情報
   							, "1"							    // エラー区分
							, i + 1							// エラー発生行
							, "Expj.PJ_CD"	// エラー項目名
							, new ExpjMessage("AA01501").getMessage(_locale)		// エラーメッセージ
							, null
							, null
							, null); 
						_intErrorCount++;
						continue;
					}
					//禁則文字が入力されていた場合
					if (chkHankaku(csvStruct.getPJ_CD())) {
						csvExport(csvStruct						// 対象データ情報
							, "1"							// エラー区分
							, i + 1							// エラー発生行
							, "Expj.PJ_CD"		// エラー項目名
							, new ExpjMessage("AA01524").getMessage(_locale)		// エラーメッセージ
							, null
							, null
							, null); 
						_intErrorCount++;
						continue;
					}
				}
				
				//以下セグメント1のチェック
				//[CSV情報]．”セグメント1”が入力されている場合
				if (!isNull(csvStruct.getSEG_CONTENTS1())){
					//備品発注フラグが「0:備品以外（通常仕入品）」の場合
					if ("0".equals(csvStruct.getNON_NO_ITEM_FLG())){
						String ErrInfo = CoreTools.getRBString("Expj.SEG_CONTENTS1", resource);
						csvExport(csvStruct						// 対象データ情報
							, "1"							// エラー区分
							, i + 1							// エラー発生行
							, "Expj.SEG_CONTENTS1"				// エラー項目名
							, new ExpjMessage("AE25027",ErrInfo).getMessage(_locale)		// エラーメッセージ
							, null
							, null
							, null);
						_intErrorCount++;
						continue;
					}
					//文字51桁以上の場合
					if (strLengthChk(csvStruct.getSEG_CONTENTS1()) >= 51) {
						csvExport(csvStruct						    // 対象データ情報
   							, "1"							    // エラー区分
							, i + 1							// エラー発生行
							, "Expj.SEG_CONTENTS1"	// エラー項目名
							, new ExpjMessage("AA01501").getMessage(_locale)		// エラーメッセージ
							, null
							, null
							, null); 
						_intErrorCount++;
						continue;
					}
					//禁則文字が入力されていた場合
					if (chkHankaku(csvStruct.getSEG_CONTENTS1())) {
						csvExport(csvStruct						// 対象データ情報
							, "1"							// エラー区分
							, i + 1							// エラー発生行
							, "Expj.SEG_CONTENTS1"		// エラー項目名
							, new ExpjMessage("AA01524").getMessage(_locale)		// エラーメッセージ
							, null
							, null
							, null); 
						_intErrorCount++;
						continue;
					}
				}
				//以下セグメント2のチェック
				//[CSV情報]．”セグメント2”が入力されている場合
				if (!isNull(csvStruct.getSEG_CONTENTS2())){
					//備品発注フラグが「0:備品以外（通常仕入品）」の場合
					if ("0".equals(csvStruct.getNON_NO_ITEM_FLG())){
						String ErrInfo = CoreTools.getRBString("Expj.SEG_CONTENTS2", resource);
						csvExport(csvStruct						// 対象データ情報
								, "1"							// エラー区分
								, i + 1							// エラー発生行
								, "Expj.SEG_CONTENTS2"				// エラー項目名
								, new ExpjMessage("AE25027",ErrInfo).getMessage(_locale)		// エラーメッセージ
								, null
								, null
								, null);
						_intErrorCount++;
						continue;
					}
					//文字51桁以上の場合
			        if (strLengthChk(csvStruct.getSEG_CONTENTS2()) >= 51) {
						csvExport(csvStruct						    // 対象データ情報
	   							, "1"							    // エラー区分
								, i + 1							// エラー発生行
								, "Expj.SEG_CONTENTS2"	// エラー項目名
								, new ExpjMessage("AA01501").getMessage(_locale)		// エラーメッセージ
								, null
								, null
								, null); 
						_intErrorCount++;
						continue;
					}
					//禁則文字が入力されていた場合
					if (chkHankaku(csvStruct.getSEG_CONTENTS2())) {
						csvExport(csvStruct						// 対象データ情報
								, "1"							// エラー区分
								, i + 1							// エラー発生行
								, "Expj.SEG_CONTENTS2"		// エラー項目名
								, new ExpjMessage("AA01524").getMessage(_locale)		// エラーメッセージ
								, null
								, null
								, null); 
						_intErrorCount++;
						continue;
					}
				}
				
				//以下セグメント3のチェック
				//[CSV情報]．”セグメント3”が入力されている場合
				if (!isNull(csvStruct.getSEG_CONTENTS3())){
					//備品発注フラグが「0:備品以外（通常仕入品）」の場合
					if ("0".equals(csvStruct.getNON_NO_ITEM_FLG())){
						String ErrInfo = CoreTools.getRBString("Expj.SEG_CONTENTS3", resource);
						csvExport(csvStruct						// 対象データ情報
								, "1"							// エラー区分
								, i + 1							// エラー発生行
								, "Expj.SEG_CONTENTS3"				// エラー項目名
								, new ExpjMessage("AE25027",ErrInfo).getMessage(_locale)		// エラーメッセージ
								, null
								, null
								, null);
						_intErrorCount++;
						continue;
					}
					//文字51桁以上の場合
			        if (strLengthChk(csvStruct.getSEG_CONTENTS3()) >= 51) {
						csvExport(csvStruct						    // 対象データ情報
	   							, "1"							    // エラー区分
								, i + 1							// エラー発生行
								, "Expj.SEG_CONTENTS3"	// エラー項目名
								, new ExpjMessage("AA01501").getMessage(_locale)		// エラーメッセージ
								, null
								, null
								, null); 
						_intErrorCount++;
						continue;
					}
					//禁則文字が入力されていた場合
					if (chkHankaku(csvStruct.getSEG_CONTENTS3())) {
						csvExport(csvStruct						// 対象データ情報
								, "1"							// エラー区分
								, i + 1							// エラー発生行
								, "Expj.SEG_CONTENTS3"		// エラー項目名
								, new ExpjMessage("AA01524").getMessage(_locale)		// エラーメッセージ
								, null
								, null
								, null); 
						_intErrorCount++;
						continue;
					}
				}
				
				//以下セグメント4のチェック
				//[CSV情報]．”セグメント4”が入力されている場合
				if (!isNull(csvStruct.getSEG_CONTENTS4())){
					//備品発注フラグが「0:備品以外（通常仕入品）」の場合
					if ("0".equals(csvStruct.getNON_NO_ITEM_FLG())){
						String ErrInfo = CoreTools.getRBString("Expj.SEG_CONTENTS4", resource);
						csvExport(csvStruct						// 対象データ情報
								, "1"							// エラー区分
								, i + 1							// エラー発生行
								, "Expj.SEG_CONTENTS4"				// エラー項目名
								, new ExpjMessage("AE25027",ErrInfo).getMessage(_locale)		// エラーメッセージ
								, null
								, null
								, null);
						_intErrorCount++;
						continue;
					}
					//文字51桁以上の場合
			        if (strLengthChk(csvStruct.getSEG_CONTENTS4()) >= 51) {
						csvExport(csvStruct						    // 対象データ情報
	   							, "1"							    // エラー区分
								, i + 1							// エラー発生行
								, "Expj.SEG_CONTENTS4"	// エラー項目名
								, new ExpjMessage("AA01501").getMessage(_locale)		// エラーメッセージ
								, null
								, null
								, null); 
						_intErrorCount++;
						 continue;
					}
					//禁則文字が入力されていた場合
					if (chkHankaku(csvStruct.getSEG_CONTENTS4())) {
						csvExport(csvStruct						// 対象データ情報
								, "1"							// エラー区分
								, i + 1							// エラー発生行
								, "Expj.SEG_CONTENTS4"		// エラー項目名
								, new ExpjMessage("AA01524").getMessage(_locale)		// エラーメッセージ
								, null
								, null
								, null); 
						_intErrorCount++;
						continue;
					}
				}
//20150806 ADD END BY SYSCOM

		        // マスタ整合性チェック
		        // [CSV情報]．”品目番号”で[品目] を検索し、存在しなかった場合
		        if(!isNull(csvStruct.getITEM_CD())){
		        	List itemList = entity.mselectM_ITEM.read(conn, csvStruct);
			        if (itemList.isEmpty()) {
						csvExport(csvStruct                         // 対象データ情報
								, "1"								// エラー区分
								, i + 1								// エラー行番号
								, "Expj.ITEM_CD"					// エラー項目名
								, new ExpjMessage("AE50509").getMessage(_locale)        // エラーメッセージ
								, null
								, null
								, null);		
						_intErrorCount++;
						continue;
					}else{
						_Itemflg = false;
						// [品目]."品目手配区分"が8の場合
						itemStruct = (AE0180010Struct) itemList.get(0);
						if (("8".equals(itemStruct.getMRP_ODR_TYP()))) {
							csvExport(csvStruct                         // 対象データ情報
									, "1"								// エラー区分
									, i + 1								// エラー行番号
									, "Expj.ITEM_CD"					// エラー項目名
									, new ExpjMessage("AE32601").getMessage(_locale)        // エラーメッセージ
									, null
									, null
									, null);		
							_intErrorCount++;
							continue;
		    			}
					}
		        }

		        // [CSV情報]．”発注納期”に休日が入力された場合
		        if (!isWorkDay(strDlvYmd)) {
		        	csvExport(csvStruct                         // 対象データ情報
							, "1"								// エラー区分
							, i + 1								// エラー行番号
							, "Expj.PRD_DUE_DATE_1"				// エラー項目名
							, new ExpjMessage("AE00028").getMessage(_locale)        // エラーメッセージ
							, null
							, null
							, null);		
					_intErrorCount++;
					continue;
		        }
		        // [業務日付]情報を部品より取得
				DateCtrlStruct dcs = DateCtrlControl.getData(conn, this.sysPLANT_CD);
				
				// ASPROVA連携オプション未導入の場合(導入済の場合、過去日付の登録可)
                if(!"1".equals(_SysInstallOptions_ASP)){
                	// [CSV情報]．”発注納期”<[日付制御]."業務運用日"の場合
    				if(DateTool.compareYMD(strDlvYmd, dcs.getBUSINESS_OPR_DATE())<0){
    					csvExport(csvStruct                         // 対象データ情報
    							, "1"								// エラー区分
    							, i + 1								// エラー行番号
    							, "Expj.PRD_DUE_DATE_1"				// エラー項目名
    							, new ExpjMessage("AE00030").getMessage(_locale)        // エラーメッセージ
    							, null
    							, null
    							, null);		
    					_intErrorCount++;
    					continue;
    				}
                }
		        // [CSV情報]．”発注予定日”に休日が入力された場合
		        if ((!isNull(csvStruct.getPUCH_ODR_START_DATE()))) {
		        	if((!isWorkDay(strStartYmd))){
			        	csvExport(csvStruct                         // 対象データ情報
								, "1"								// エラー区分
								, i + 1								// エラー行番号
								, "Expj.PUCH_ODR_DLV_DATE_1"		// エラー項目名
								, new ExpjMessage("AE00029").getMessage(_locale)        // エラーメッセージ
								, null
								, null
								, null);		
						_intErrorCount++;
						continue;
		        	}
		        	
		        	// ASPROVA連携オプション未導入の場合(導入済の場合、過去日付の登録可)
	                if(!"1".equals(_SysInstallOptions_ASP)){
	                	 // [CSV情報]．”発注予定日”＜ [日付制御]."業務運用日"の場合
						if(DateTool.compareYMD(strStartYmd, dcs.getBUSINESS_OPR_DATE())<0){
							csvExport(csvStruct                         // 対象データ情報
									, "1"								// エラー区分
									, i + 1								// エラー行番号
									, "Expj.PUCH_ODR_DLV_DATE_1"				// エラー項目名
									, new ExpjMessage("AE00031").getMessage(_locale)        // エラーメッセージ
									, null
									, null
									, null);		
							_intErrorCount++;
							continue;
						}
	                }
		        }
		        
		        // [CSV情報]．”発注予定日”　≠ Null かつ、[CSV情報]．”発注納期” ＜ [CSV情報]．”発注予定日”の場合
	        	if(!isNull(csvStruct.getPUCH_ODR_START_DATE()) && 
	        			(DateTool.compareYMD(strDlvYmd, strStartYmd)< 0)){
	        		csvExport(csvStruct                         // 対象データ情報
							, "1"								// エラー区分
							, i + 1								// エラー行番号
							, "Expj.PUCH_ODR_DLV_DATE"			// エラー項目名
							, new ExpjMessage("AE32608").getMessage(_locale)        // エラーメッセージ
							, "Expj.PUCH_ODR_DLV_DATE_1"
							, null
							, null);		
					_intErrorCount++;
					continue;
	        	}
		        // レート判定日の設定
		        csvStruct.setRATE_JUDGE_DATE(strDlvYmd);
		        // 発注予定日の設定
				String PUCH_ODR_DLV_TIME = null;
				// 入力時刻のチェック(時刻管理する場合のみ)
				if (csvStruct.getPUCH_ODR_DLV_DATE().length()>10) {
					String strOdrDlvDate = csvStruct.getPUCH_ODR_DLV_DATE();
					int dlvIdx = strOdrDlvDate.indexOf(_space);
					PUCH_ODR_DLV_TIME = strOdrDlvDate.substring(dlvIdx+1);
				} else {
					if ("true".equals(struct.getTIME_CTRL())) {
						PUCH_ODR_DLV_TIME = "2359";
					} else {
						// 時刻管理しない場合は0000に設定
						PUCH_ODR_DLV_TIME = "0000";
					}
				}
				
				// [CSV情報]．”発注予定日”がnullの場合
				if(isNull(csvStruct.getPUCH_ODR_START_DATE())){
                    //備品発注でない場合
		        	if ("0".equals(csvStruct.getNON_NO_ITEM_FLG())){
		        		// [CSV情報]．”発注納期”を元に発注予定日を算出しその結果を発注予定日とする。
		        		String resultDate = null;
		        		// ASPROVA連携オプション未導入の場合：日単位のリードタイム計算を行う。
						if (!"1".equals(_SysInstallOptions_ASP)) {
							String fixedLt = itemStruct.getFIXED_LT();
							String propLt = itemStruct.getPROP_LT();
							String safetyLt = itemStruct.getSAFETY_LT();
							String propLotSize = itemStruct.getPROP_LOT_SIZE();

							String itemLt = Calculate.divide(csvStruct.getPUCH_ODR_QTY(), propLotSize, 0, Calculate._CEIL);
							itemLt = Calculate.multiply(itemLt, propLt);
							itemLt = Calculate.add(itemLt, fixedLt);
							itemLt = Calculate.add(itemLt, safetyLt);
							itemLt = Calculate.multiply(itemLt, "-1");

							resultDate = calcWorkDay(strDlvYmd,PUCH_ODR_DLV_TIME, itemLt, true);
							if ("".equals(resultDate)) {
								csvExport(csvStruct                         // 対象データ情報
										, "1"								// エラー区分
										, i + 1								// エラー行番号
										, "Expj.PUCH_ODR_DLV_DATE_1"		// エラー項目名
										, new ExpjMessage("AE00198").getMessage(_locale)        // エラーメッセージ
										, null
										, null
										, null);		
								_intErrorCount++;
								continue;
							}
							// 算出した発注予定日 <[日付制御]."業務運用日"の場合は[日付制御]."業務運用日"を｢発注予定日｣とする。
							if (DateTool.compareYMD(resultDate.substring(0, 10), dcs.getBUSINESS_OPR_DATE()) < 0) {
								csvStruct.setPUCH_ODR_START_DATE(dcs.getBUSINESS_OPR_DATE());
							} else {
								// 自動計算した結果を発注予定日とする
								csvStruct.setPUCH_ODR_START_DATE(resultDate.substring(0, 10));
							}
							// ASPROVA連携オプション導入済の場合：時間単位のリードタイム計算を行う。
		        	    }else{
		        	    	String propLotSize = itemStruct.getPROP_LOT_SIZE();
		        	    	String sWkDate, sShiftMin, sWkTime;
		        	    	ATAspBom ab = new ATAspBom(conn, this.sysPLANT_CD,this.sysUSER_CD, this.getProgramId());
		        	    	ATWorkCalendar atWC = new ATWorkCalendar(conn, this.sysUSER_CD, "AE0180010",
									this.sysPLANT_CD);
		        	    	Date puchOdrStartDate = null; // 発注予定日
							Date puchOdrDlvDate = null; // 発注納期
							
							// 発注納期が決定の状態
							puchOdrDlvDate = StrngToDt(strDlvYmd
									+ " " + (PUCH_ODR_DLV_TIME).substring(0, 2)
									+ ":" + (PUCH_ODR_DLV_TIME).substring(2, 4));
							// 発注予定日LTシフト(－)
							sShiftMin = ab.getProdLtMin(csvStruct.getITEM_CD(), csvStruct.getPUCH_ODR_QTY(), propLotSize, "U");
							sShiftMin = Calculate.multiply(sShiftMin, "-1"); // 過去へ
							puchOdrStartDate = atWC.calcShiftMinute(puchOdrDlvDate, sShiftMin, ATWorkCalendar.SHIFT_START); // Conv
							sWkDate = DtGetDate(puchOdrStartDate);
							csvStruct.setPUCH_ODR_START_DATE(sWkDate);
		        	    }
					// 備品購入の場合
		        	}else{
		        		// [業務日付]."業務運用日"を発注予定日とする。
		        		csvStruct.setPUCH_ODR_START_DATE(dcs.getBUSINESS_OPR_DATE());
						if(!isWorkDay(csvStruct.getPUCH_ODR_START_DATE())){
							csvExport(csvStruct                         // 対象データ情報
									, "1"								// エラー区分
									, i + 1								// エラー行番号
									, "Expj.PUCH_ODR_DLV_DATE_1"		// エラー項目名
									, new ExpjMessage("AE00198").getMessage(_locale)        // エラーメッセージ
									, null
									, null
									, null);		
							_intErrorCount++;
							continue;
						}
		        	}
		        	strStartYmd = csvStruct.getPUCH_ODR_START_DATE();
		        	if (strStartYmd.length()<=10) {
		        		csvStruct.setPUCH_ODR_START_DATE(strStartYmd+_space+PUCH_ODR_DLV_TIME);
		        	}
				}
	        	
	        	// [CSV情報]．”発注数”が0以下の場合
	        	if(Calculate.compare(csvStruct.getPUCH_ODR_QTY(),"0") == 0){
	        		csvExport(csvStruct                         // 対象データ情報
							, "1"								// エラー区分
							, i + 1								// エラー行番号
							, "Expj.PUCH_ODR_QTY"				// エラー項目名
							, new ExpjMessage("AE00038").getMessage(_locale)        // エラーメッセージ
							, null
							, null
							, null);		
					_intErrorCount++;
					continue;
	        	}
	        	// ｢取引先コード｣が、[取引先]に存在しない場合
                List vendCtrlList = entity.mselectM_VEND_CTRL.read(conn, csvStruct);
                AE0180010Struct vendCtrlStruct = null;
                if (vendCtrlList.isEmpty()) {
                 csvExport(csvStruct                         // 対象データ情報
							, "1"							 // エラー区分
							, i + 1							 // エラー行番号
							, "Expj.VEND_CD"				 // エラー項目名
							, new ExpjMessage("AE20030").getMessage(_locale)        // エラーメッセージ
							, null
							, null
							, null);		
					_intErrorCount++;
					continue;
                }else {
                    // ｢取引先｣."取引状態フラグ" = 1:取引停止の場合
                    vendCtrlStruct = (AE0180010Struct) vendCtrlList.get(0);
                    if ("1".equals(vendCtrlStruct.getDEAL_STS_FLG())) {
                    	csvExport(csvStruct                         // 対象データ情報
    							, "1"								// エラー区分
    							, i + 1								// エラー行番号
    							, "Expj.VEND_CD"					// エラー項目名
    							, new ExpjMessage("AE00002").getMessage(_locale)        // エラーメッセージ
    							, null
    							, null
    							, null);		
    					_intErrorCount++;
    					continue;
                    }
                }
                // [CSV情報]．”品目番号”で[品目] を検索し、[品目].“品目手配区分” が1：製番 また2：在庫引当型製番
                if (("1".equals(itemStruct.getMRP_ODR_TYP())) || ("2".equals(itemStruct.getMRP_ODR_TYP()))){
                	// 製番がNULLの場合
                	if(isNull(csvStruct.getJOB_ODR_CD())){
                		csvExport(csvStruct                         // 対象データ情報
    							, "1"								// エラー区分
    							, i + 1								// エラー行番号
    							, "Expj.JOB_ODR_CD"					// エラー項目名
    							, new ExpjMessage("AB00017").getMessage(_locale)        // エラーメッセージ
    							, null
    							, null
    							, null);		
    					_intErrorCount++;
    					continue;
                	}
                	// ログインユーザの所属の工場コード
                    csvStruct.setPLANT_CD(sysPLANT_CD);
                	// 製番品の場合、ログインユーザの所属の工場コード、 [CSV情報]．”製番” 、「製番枝番」と「製番取消発生番号」 が [製番計画] に存在しない場合
                    // （「製番枝番」　＝ 0、「製番取消発生番号」　＝ 0）
                    List jobordcdList = entity.mselectT_JOB_ODR.read(conn, csvStruct);
                    if (jobordcdList.isEmpty()) {
    					csvExport(csvStruct                         // 対象データ情報
    							, "1"								// エラー区分
    							, i + 1								// エラー行番号
    							, "Expj.JOB_ODR_CD"					// エラー項目名
    							, new ExpjMessage("AB00043").getMessage(_locale)        // エラーメッセージ
    							, null
    							, null
    							, null);		
    					_intErrorCount++;
    					continue;
                    }
                    // [製番計画]. “製番状態区分”が 1：所要量計算未対象 or 2：所要量計算対象 or 9：完了 の場合
                    AE0180010Struct jobordcdStruct = new AE0180010Struct();
                    jobordcdStruct = (AE0180010Struct)jobordcdList.get(0);
                    if(("1".equals(jobordcdStruct.getJOB_ODR_STS_TYP())) 
                    		|| ("2".equals(jobordcdStruct.getJOB_ODR_STS_TYP())) 
                    		|| ("9".equals(jobordcdStruct.getJOB_ODR_STS_TYP()))){
                    	csvExport(csvStruct                         // 対象データ情報
    							, "1"								// エラー区分
    							, i + 1								// エラー行番号
    							, "Expj.JOB_ODR_CD"					// エラー項目名
    							, new ExpjMessage("AE01001").getMessage(_locale)        // エラーメッセージ
    							, null
    							, null
    							, null);		
    					_intErrorCount++;
    					continue;
                    }
                    // [所要量]情報が存在していない場合
                    List jobOdrList = entity.mselectT_OD_JOB_ODR.read(conn, csvStruct);
                    if(jobOdrList.isEmpty()){
                    	csvExport(csvStruct                         // 対象データ情報
    							, "1"								// エラー区分
    							, i + 1								// エラー行番号
    							, "Expj.JOB_ODR_CD"					// エラー項目名
    							, new ExpjMessage("AH00039").getMessage(_locale)        // エラーメッセージ
    							, "Expj.ITEM_CD"
    							, null
    							, null);		
    					_intErrorCount++;
    					continue;
                    }
                    // [所要量].“製番”で [製番計画] を検索し、[製番計画].“納期” ＜ [CSV情報]．”発注納期”かつ[製番計画].“納期”が業務運用日以降の場合
    				jobOdrStruct = (AE0180010Struct) jobOdrList.get(0);
    				// オーダデマンド番号
    				csvStruct.setOD_NO(jobOdrStruct.getOD_NO());
    				if(DateTool.compareYMD(csvStruct.getPUCH_ODR_DLV_DATE(),jobOdrStruct.getJOB_ODR_DLV_DATE())> 0){
    					if(DateTool.compareYMD(jobOdrStruct.getJOB_ODR_DLV_DATE(),dcs.getBUSINESS_OPR_DATE()) >= 0){
    						csvExport(csvStruct                         // 対象データ情報
        							, "1"								// エラー区分
        							, i + 1								// エラー行番号
        							, "Expj.JOB_ODR_CD"					// エラー項目名
        							, new ExpjMessage("AE32604").getMessage(_locale)        // エラーメッセージ
        							, null
        							, null
        							, null);		
        					_intErrorCount++;
        					continue;
    					}
    				}
                } else {
                	csvStruct.setJOB_ODR_CD("");
                }
                // [CSV情報]．”受入場所”で［保管区］を検索し、存在しなかった場合
                List wh_cdList = entity.mselectM_WH.read(conn, csvStruct);
                if(wh_cdList.isEmpty()){
            		csvExport(csvStruct                         // 対象データ情報
							, "1"								// エラー区分
							, i + 1								// エラー行番号
							, "Expj.WH_CD_2"					// エラー項目名
							, new ExpjMessage("AE00018").getMessage(_locale)        // エラーメッセージ
							, null
							, null
							, null);		
					_intErrorCount++;
					continue;
            	}else{
            		AE0180010Struct wh_cdStruct = (AE0180010Struct) wh_cdList.get(0);
            		// ログインユーザの所属の工場コード ≠ [保管区].“工場コード” の場合
            		if (!this.sysPLANT_CD.equals(wh_cdStruct.getPLANT_CD())) {
                        csvExport(csvStruct                         // 対象データ情報
    							, "1"								// エラー区分
    							, i + 1								// エラー行番号
    							, "Expj.WH_CD_2"					// エラー項目名
    							, new ExpjMessage("AE00032").getMessage(_locale)        // エラーメッセージ
    							, null
    							, null
    							, null);		
    					_intErrorCount++;
    					continue;
            		}    
            	}
                
                // 備品発注でかつ、｢品目番号｣がNullの場合は以下の処理を行わない
                if(!(("1".equals(csvStruct.getNON_NO_ITEM_FLG())) && (struct.getITEM_CD() == null || struct.getITEM_CD().length() <= 0))){
               	 // [品目] . “在庫数単位区分” が 1：整数管理 かつ、[CSV情報]．”発注数”に小数を含む場合
               	 if (("1".equals(itemStruct.getUNIT_QTY_TYP()))) {
                   	 String ceilPuchOdrQty = Calculate.ceil(csvStruct.getPUCH_ODR_QTY(), 0);
                   	 if (Calculate.compare(ceilPuchOdrQty, csvStruct.getPUCH_ODR_QTY()) != 0) {
                   		 csvStruct.setPUCH_ODR_QTY(ceilPuchOdrQty);
                   		itemCheckFlg = true;
                   	 }
                    }
                }
                
                TaxStruct ts = new TaxStruct();
                CurStruct cs = new CurStruct();
                try {
                	// 消費税コードを取得
                	ts =
                    TaxControl.getData(
                    conn,
                    _company_cd,
                    csvStruct.getVEND_CD(),
                    csvStruct.getITEM_CD(),
                    strDlvYmd);
                 } catch (DataNotFoundException e) {
                	 csvExport(csvStruct                         // 対象データ情報
 							, "1"								 // エラー区分
 							, i + 1							     // エラー行番号
 							, null								 // エラー項目名
 							, new ExpjMessage("AE00017").getMessage(_locale)        // エラーメッセージ
 							, null
 							, null
							, null);		
 					_intErrorCount++;
 					continue;       	 
                }
                 csvStruct.setTAX_CD(ts.getTAX_CD());
                 csvStruct.setTAX_RATE_1(ts.getTAX_RATE_1());
                 csvStruct.setTAX_RATE_2(ts.getTAX_RATE_2());
                 csvStruct.setTAX_RATE_3(ts.getTAX_RATE_3());
                 csvStruct.setTAX_ROUND_TYP(ts.getTAX_ROUND_TYP());            
                // [通貨]情報を取得
                try {
                 cs =
                  CurControl.getData(conn, _company_cd, csvStruct.getVEND_CD());
                } catch (DataNotFoundException e) {
                	csvExport(csvStruct                         // 対象データ情報
 							, "1"								// エラー区分
 							, i + 1								// エラー行番号
 							, null								// エラー項目名
 							, new ExpjMessage("AE05075").getMessage(_locale)        // エラーメッセージ
 							, null
 							, null
							, null);		
 					_intErrorCount++;
 					continue;  
                }
                csvStruct.setVEND_DECIMAL_FIG(cs.getDECIMAL_FIG());
                
                PuchUnitCostStruct pucs = new PuchUnitCostStruct();
                
                //  [CSV情報]．”単価”がNULL場合
                if(isNull(csvStruct.getUNIT_COST())){
                	// [購入単価]情報を取得
                	pucs =
                    PuchUnitCostControl.getData(
                    conn,
                    _company_cd,
                    csvStruct.getVEND_CD(),
                    this.sysPLANT_CD,
                    csvStruct.getITEM_CD(),
                    strStartYmd,
                    strDlvYmd,
                    csvStruct.getPUCH_ODR_QTY());
                	// [購入単価].” 購入単価区分”とする。
                	csvStruct.setUNIT_COST_TYP(pucs.getUNIT_COST_TYP());
                	// [購入単価].” 購入単価”とする。
                	csvStruct.setUNIT_COST(pucs.getUNIT_COST());
                	// [購入単価].” 購入加工費”とする。
                	csvStruct.setPROCESSING_COST(pucs.getPROCESSING_COST());
                	// [購入単価].” 購入材料費”とする。
                	csvStruct.setMATERIAL_COST(pucs.getMATERIAL_COST());
                	// [購入単価].” 購入その他経費”とする。
                	csvStruct.setOTHER_OVERHEADS(pucs.getOTHER_OVERHEADS());
                }
                //発注金額をまるめ処理
				String tempOdrAmount =
				AmountCalculator.calcPuchOdrAmount(
					csvStruct.getPUCH_ODR_QTY(),
					csvStruct.getUNIT_COST(),
					cs.getROUND_TYP(),
					cs.getDECIMAL_FIG());
                 if(!isNotInNumRange(tempOdrAmount, 14, 4)){
                	// 多言語項目取得セット
	                String ErrInfo = CoreTools.getRBString("Expj.PUCH_ODR_AMOUNT_2", resource);
                	csvExport(csvStruct                         // 対象データ情報
 							, "1"								// エラー区分
 							, i + 1								// エラー行番号
 							, null								// エラー項目名
 							, new ExpjMessage("AA00215",ErrInfo).getMessage(_locale)// エラーメッセージ
 							, null
 							, null
							, null);		
 					_intErrorCount++;
 					continue;
                 }
                 // 発注金額
                 csvStruct.setPUCH_ODR_AMOUNT(tempOdrAmount);
                 // 本体金額
                 if(isNull(csvStruct.getNET_AMOUNT()) || "0".equals(csvStruct.getNET_AMOUNT())){
                	 csvStruct.setNET_AMOUNT(tempOdrAmount);
                 }
                 // [CSV情報]．”為替レート”がNULL以外の場合
                 if(!isNull(csvStruct.getEXCH_RATE())){
                	 // 為替レートが0以下の場合
                     if(Calculate.compare(csvStruct.getEXCH_RATE(),"0") == 0){
                    	 csvExport(csvStruct                         // 対象データ情報
       							, "1"								 // エラー区分
       							, i + 1								 // エラー行番号
       							, "Expj.EXCH_RATE"					 // エラー項目名
       							, new ExpjMessage("AE00059").getMessage(_locale)        // エラーメッセージ
       							, null
       							, null
    							, null);		
       					_intErrorCount++;
       					continue;
                     }
                 }
                 // [CSV情報]．”為替レート”がNULLの場合
                 if(isNull(csvStruct.getEXCH_RATE())){
                	 // 為替レートを取得
                	 try {
                		 ExchRateStruct ers =
                                 ExchRateControl.getData(
                                 conn,
                                 _company_cd,
                                 cs.getCUR_CD(),
                                 cs.getEXCH_TYP(),
                                 null,
                                 strDlvYmd);
                                 // ｢為替レート｣を設定
                         csvStruct.setEXCH_RATE(ers.getEXCH_RATE());
                     }catch (DataNotFoundException e) {
                    	 csvExport(csvStruct                         // 対象データ情報
      							, "1"								 // エラー区分
      							, i + 1								 // エラー行番号
      							, null					 // エラー項目名
      							, new ExpjMessage("AE05076").getMessage(_locale)        // エラーメッセージ
      							, null
      							, null
    							, null);		
      					_intErrorCount++;
      					continue;
                     }
                     // 為替レートが0以下の場合
                     if(Calculate.compare(csvStruct.getEXCH_RATE(),"0") == 0){
                    	 csvExport(csvStruct                         // 対象データ情報
       							, "1"								 // エラー区分
       							, i + 1								 // エラー行番号
       							, null					 // エラー項目名
       							, new ExpjMessage("AE00059").getMessage(_locale)        // エラーメッセージ
       							, null
       							, null
    							, null);		
       					_intErrorCount++;
       					continue;
                     }
                 }
                 
                 //内税の場合に税額を計算する
                 String lowerTaxCd =
                		 ts.getTAX_CD().substring(ts.getTAX_CD().length() - 1);                
              	 if (!lowerTaxCd.equals("1")) {
              		//バッチパラメータ呼出
          			List batList = entity.mselectSYS_BAT_PARM.read(conn, csvStruct);
          			if(!batList.isEmpty()){
          				//税計算部品をコール
          				AE0180010Struct batStruct = (AE0180010Struct)batList.get(0);
          				csvStruct.setPVC2LOGMODE(batStruct.getPVC2LOGMODE());
          				csvStruct.setPVC2OUTPUTMODE(batStruct.getPVC2OUTPUTMODE());
          				csvStruct.setPVC2OUTPUTPATH(batStruct.getPVC2OUTPUTPATH());
          				csvStruct.setPVC2OUTPUTNAME(batStruct.getPVC2OUTPUTNAME());
          				csvStruct.setPVC2USERID(this.sysUSER_CD);
          				csvStruct.setPVC2BUSINESSNAME(batStruct.getPVC2BUSINESSNAME());
          				csvStruct.setPVC2PLANTCD(this.sysPLANT_CD);
          				csvStruct.setPVC2TAXID("5");
          				batList = entity.mcallSQLCALCTAXCALCAMT.call(conn, csvStruct);
          				batStruct = (AE0180010Struct)batList.get(0);
          				if(!"1".equals(batStruct.getPNUMSTATUS())){
          					csvExport(csvStruct                         // 対象データ情報
            							, "1"							// エラー区分
            							, i + 1							// エラー行番号
            							, null							// エラー項目名
            							, new ExpjMessage(batStruct.getPVC2ERRCD()).getMessage(_locale)// エラーメッセージ
            							, null
            							, null
            							, null);		
            					_intErrorCount++;
            					continue;
          				}
          				csvStruct.setTAX_AMOUNT_1(batStruct.getTAX_AMOUNT_1());
          				csvStruct.setTAX_AMOUNT_2(batStruct.getTAX_AMOUNT_2());
          				csvStruct.setTAX_AMOUNT_3(batStruct.getTAX_AMOUNT_3());
          				csvStruct.setAMOUNT_INCLUDE_TAX(batStruct.getAMOUNT_INCLUDE_TAX());  				
             		}else{
             			csvExport(csvStruct                         // 対象データ情報
       							, "1"								// エラー区分
       							, i + 1								// エラー行番号
       							, null								// エラー項目名
       							, new ExpjMessage("ZZ09007").getMessage(_locale)// エラーメッセージ
       							, null
       							, null
    							, null);		
       					_intErrorCount++;
       					continue;
         			}	
                 }else{
                	// ｢税額1｣の計算
  	                String taxAmount1 =
  	                 AmountCalculator.calcTaxAmount(
  	                  csvStruct.getNET_AMOUNT(),
  	                  ts.getTAX_RATE_1(),
  	                  ts.getTAX_ROUND_TYP(),
  	                  cs.getDECIMAL_FIG());
  	                 csvStruct.setTAX_AMOUNT_1(taxAmount1);
  	                 // ｢税額2｣の計算
  	                 String taxAmount2 =
  	                  AmountCalculator.calcTaxAmount(
  	                   csvStruct.getNET_AMOUNT(),
  	                   ts.getTAX_RATE_2(),
  	                   ts.getTAX_ROUND_TYP(),
  	                   cs.getDECIMAL_FIG());
  	                 csvStruct.setTAX_AMOUNT_2(taxAmount2);
  	                 // ｢税額3｣の計算
  	                 String taxAmount3 =
  	                  AmountCalculator.calcTaxAmount(
  	                   csvStruct.getNET_AMOUNT(),
  	                   ts.getTAX_RATE_3(),
  	                   ts.getTAX_ROUND_TYP(),
  	                   cs.getDECIMAL_FIG());
  	                 csvStruct.setTAX_AMOUNT_3(taxAmount3);
  	                 // ｢税込金額｣の計算
  	                 String amountIncludeTax =
  	                  AmountCalculator.calcAmountIncludeTax(
  	                   csvStruct.getNET_AMOUNT(),
  	                   csvStruct.getTAX_AMOUNT_1(),
  	                   csvStruct.getTAX_AMOUNT_2(),
  	                   csvStruct.getTAX_AMOUNT_3());
  	                 csvStruct.setAMOUNT_INCLUDE_TAX(amountIncludeTax);
  	                 if(!isNotInNumRange(amountIncludeTax, 14, 4)){
  	                    // 多言語項目取得セット
  		                String ErrInfo = CoreTools.getRBString("Expj.AMOUNT_INCLUDE_TAX", resource);
  	                	csvExport(csvStruct                         // 対象データ情報
        							, "1"							// エラー区分
        							, i + 1							// エラー行番号
        							, null							// エラー項目名
        							, new ExpjMessage("AA00215",ErrInfo).getMessage(_locale)// エラーメッセージ
        							, null
        							, null
        							, null);		
        					_intErrorCount++;
        					continue;
  	                 }
                 }
                 // ｢邦貨金額｣の計算
                 String homeCurAmount =
                  AmountCalculator.calcHomeCurAmount(
                   csvStruct.getAMOUNT_INCLUDE_TAX(),
                   csvStruct.getEXCH_RATE(),
                   cs.getROUND_TYP(),
                   _homeCurStruct.getDECIMAL_FIG());
                 csvStruct.setHOME_CUR_AMOUNT(homeCurAmount);
                 if(!isNotInNumRange(homeCurAmount, 14, 4)){
                	// 多言語項目取得セット
		            String ErrInfo = CoreTools.getRBString("Expj.HOME_CUR_AMOUNT", resource);
                 	csvExport(csvStruct                         // 対象データ情報
    							, "1"							// エラー区分
    							, i + 1							// エラー行番号
    							, null							// エラー項目名
    							, new ExpjMessage("AA00215",ErrInfo).getMessage(_locale)// エラーメッセージ
    							, null
    							, null
    							, null);		
    					_intErrorCount++;
    					continue;
                 }
                 // 備品発注でかつ、｢品目番号｣がNullの場合は以下の処理を行わない
                 if(itemCheckFlg){
                    csvExport(csvStruct                         // 対象データ情報
     								, "2"								 // エラー区分
     								, i + 1								 // エラー行番号
     								, "Expj.PUCH_ODR_QTY"				 // エラー項目名
     								, new ExpjMessage("AE00034").getMessage(_locale)// エラーメッセージ
     								, null
     								, null
     								, null);		
                    if(!warningFlg){
     					_intWarningCount++;
     					warningFlg = true;
                    }
                 }
                 // [CSV情報]．”品目番号”で[品目] を検索し、[品目].“品目手配区分” が1：製番 また2：在庫引当型製番
                 if (("1".equals(itemStruct.getMRP_ODR_TYP())) || ("2".equals(itemStruct.getMRP_ODR_TYP()))){
                	 // [製番計画].“納期” ＜ [CSV情報]．”発注納期”かつ[製番計画].“納期”が業務運用日より過去の場合
                	 if(DateTool.compareYMD(csvStruct.getPUCH_ODR_DLV_DATE(),jobOdrStruct.getJOB_ODR_DLV_DATE())> 0){
                		 if(DateTool.compareYMD(jobOdrStruct.getJOB_ODR_DLV_DATE(),dcs.getBUSINESS_OPR_DATE()) < 0){
                			 csvExport(csvStruct                         // 対象データ情報
            							, "2"							 // エラー区分
            							, i + 1							 // エラー行番号
            							, "Expj.JOB_ODR_CD"				 // エラー項目名
            							, new ExpjMessage("AE32605").getMessage(_locale)// エラーメッセージ
            							, null
            							, null
            							, null);		
        					 if(!warningFlg){
        						 _intWarningCount++;
        						 warningFlg = true;
        				     }	
       					 }
      				 }
                 }
                 if(isNull(csvStruct.getUNIT_COST())){
                	 csvStruct.setUNIT_COST("0");
                 }
                 if(isNull(csvStruct.getPROCESSING_COST())){
                	 csvStruct.setPROCESSING_COST("0");
                 }
                 if(isNull(csvStruct.getMATERIAL_COST())){
                	 csvStruct.setMATERIAL_COST("0");
                 }
                 if(isNull(csvStruct.getOTHER_OVERHEADS())){
                	 csvStruct.setOTHER_OVERHEADS("0");
                 }
                 // 「単価」 ＜ （「加工費」 ＋ 「材料費」 ＋ 「その他経費」）の場合
                 if(Calculate.compare(csvStruct.getUNIT_COST(),
                		 Calculate.add(csvStruct.getPROCESSING_COST(), 
                				 Calculate.add(csvStruct.getMATERIAL_COST(),csvStruct.getOTHER_OVERHEADS()))) == -1){
                	 csvExport(csvStruct                         // 対象データ情報
 							, "2"								 // エラー区分
 							, i + 1								 // エラー行番号
 							, "Expj.ACTUAL_UNIT_PRICE"			 // エラー項目名
 							, new ExpjMessage("AE05074").getMessage(_locale)// エラーメッセージ
 							, "Expj.PROCESSING_COST"
 							, "Expj.MATERIAL_COST"
							, "Expj.OTHER_OVERHEADS");		
					 if(!warningFlg){
						 _intWarningCount++;
						 warningFlg = true;
				     }	
                 }
                 
                 // [CSV情報]．”発注予定日”がnullの場合
 				if(isNull(csvStruct.getL_PUCH_ODR_START_DATE())){
 					csvExport(csvStruct                         // 対象データ情報
 							, "2"								 // エラー区分
 							, i + 1								 // エラー行番号
 							, "Expj.PUCH_ODR_DLV_DATE_1"		 // エラー項目名
 							, new ExpjMessage("AD34041").getMessage(_locale)// エラーメッセージ
 							, null
 							, null
							, null);
					 if(!warningFlg){
						 _intWarningCount++;
						 warningFlg = true;
				     }	
 				}
//20150806 ADD START BY SYSCOM
				//科目コードが入力されている場合
				//[CSV情報]．”備品発注フラグ”が1:備品発注の場合かつ、[CSV情報]．”科目コード”が入力されている場合
				if("1".equals(csvStruct.getNON_NO_ITEM_FLG()) && !isNull(csvStruct.getACCT_CD())){
					//科目コードを検索
					List acct_cdList = entity.mselectV_ACCT_CD.read(conn, csvStruct);
					// 存在しない場合
         			if (acct_cdList.isEmpty()) {
                       	 csvExport(csvStruct                         // 対象データ情報
        						, "1"								 // エラー区分
        						, i + 1								 // エラー行番号
        						, "Expj.EXPENSE_CLASS_CD"					 // エラー項目名
        						, new ExpjMessage("AE25026").getMessage(_locale)        // エラーメッセージ
        						, null
        						, null
     							, null);		
        					_intErrorCount++;
        					continue;
         			}
				}
				//負担部門コードがされている場合
				//[CSV情報]．”備品発注フラグ”が1:備品発注の場合かつ、[CSV情報]．”負担部門コード”が入力されている場合、
				if("1".equals(csvStruct.getNON_NO_ITEM_FLG()) && !isNull(csvStruct.getDEPT_CD())){
					//負担部門コードを検索
         			List dept_cdList = entity.mselectV_DEPT_CD.read(conn, csvStruct);
					// 存在しない場合
         			if (dept_cdList.isEmpty()) {
                       	 csvExport(csvStruct                         // 対象データ情報
        						, "1"								 // エラー区分
        						, i + 1								 // エラー行番号
        						, "Expj.DEPT_CD"					 // エラー項目名
        						, new ExpjMessage("AA23603").getMessage(_locale)        // エラーメッセージ
        						, null
        						, null
     							, null);		
        					_intErrorCount++;
        					continue;
         			}
				}
				
				//プロジェクトコードが入力されている場合
				//[CSV情報]．”備品発注フラグ”が1:備品発注の場合かつ、[CSV情報]．”プロジェクトコード”が入力されている場合
				if("1".equals(csvStruct.getNON_NO_ITEM_FLG()) && !isNull(csvStruct.getPJ_CD())){
					//プロジェクトコードを検索
         			List pj_cdList = entity.mselectV_PJ_CD.read(conn, csvStruct);
					// 存在しない場合
         			if (pj_cdList.isEmpty()) {
                       	 csvExport(csvStruct                         // 対象データ情報
        						, "1"								 // エラー区分
        						, i + 1								 // エラー行番号
        						, "Expj.PJ_CD"					 // エラー項目名
        						, new ExpjMessage("AA23608").getMessage(_locale)        // エラーメッセージ
        						, null
        						, null
     							, null);		
        					_intErrorCount++;
        					continue;
         			}
				}
				
				//セグメント1が入力されている場合
				//[CSV情報]．”備品発注フラグ”が1:備品発注の場合かつ、[CSV情報]．”セグメント1”が入力されている場合
				if("1".equals(csvStruct.getNON_NO_ITEM_FLG()) && !isNull(csvStruct.getSEG_CONTENTS1())){
					//セグメント1を検索
					List seg_1List = entity.mselectV_SEG_CONTENTS_1.read(conn, csvStruct);
					// 存在しない場合
         			if (seg_1List.isEmpty()) {
                       	 csvExport(csvStruct                         // 対象データ情報
        						, "1"								 // エラー区分
        						, i + 1								 // エラー行番号
        						, "Expj.SEG_CONTENTS1"					 // エラー項目名
        						, new ExpjMessage("AA23604").getMessage(_locale)        // エラーメッセージ
        						, null
        						, null
     							, null);		
        					_intErrorCount++;
        					continue;
         			}
				}
				
				//セグメント2が入力されている場合
				//[CSV情報]．”備品発注フラグ”が1:備品発注の場合かつ、[CSV情報]．”セグメント2”が入力されている場合
				if("1".equals(csvStruct.getNON_NO_ITEM_FLG()) && !isNull(csvStruct.getSEG_CONTENTS2())){
					//セグメント2を検索
					List seg_2List = entity.mselectV_SEG_CONTENTS_2.read(conn, csvStruct);
					// 存在しない場合
         			if (seg_2List.isEmpty()) {
                       	 csvExport(csvStruct                         // 対象データ情報
        						, "1"								 // エラー区分
        						, i + 1								 // エラー行番号
        						, "Expj.SEG_CONTENTS2"					 // エラー項目名
        						, new ExpjMessage("AA23605").getMessage(_locale)        // エラーメッセージ
        						, null
        						, null
     							, null);		
        					_intErrorCount++;
        					continue;
         			}
				}
				
				//セグメント3が入力されている場合
				//[CSV情報]．”備品発注フラグ”が1:備品発注の場合かつ、[CSV情報]．”セグメント3”が入力されている場合
				if("1".equals(csvStruct.getNON_NO_ITEM_FLG()) && !isNull(csvStruct.getSEG_CONTENTS3())){
					//セグメント3を検索
					List seg_3List = entity.mselectV_SEG_CONTENTS_3.read(conn, csvStruct);
					// 存在しない場合
         			if (seg_3List.isEmpty()) {
                       	 csvExport(csvStruct                         // 対象データ情報
        						, "1"								 // エラー区分
        						, i + 1								 // エラー行番号
        						, "Expj.SEG_CONTENTS3"					 // エラー項目名
        						, new ExpjMessage("AA23606").getMessage(_locale)        // エラーメッセージ
        						, null
        						, null
     							, null);		
        					_intErrorCount++;
        					continue;
         			}
				}
				
				//セグメント4が入力されている場合
				//[CSV情報]．”備品発注フラグ”が1:備品発注の場合かつ、[CSV情報]．”セグメント4”が入力されている場合
				if("1".equals(csvStruct.getNON_NO_ITEM_FLG()) && !isNull(csvStruct.getSEG_CONTENTS4())){
					//セグメント4を検索
					List seg_4List = entity.mselectV_SEG_CONTENTS_4.read(conn, csvStruct);
					
					// 存在しない場合
         			if (seg_4List.isEmpty()) {
                       	 csvExport(csvStruct                         // 対象データ情報
        						, "1"								 // エラー区分
        						, i + 1								 // エラー行番号
        						, "Expj.SEG_CONTENTS4"					 // エラー項目名
        						, new ExpjMessage("AA23607").getMessage(_locale)        // エラーメッセージ
        						, null
        						, null
     							, null);		
        					_intErrorCount++;
        					continue;
         			}
				}
//20150806 ADD END BY SYSCOM

                 csvStruct.setTAX_CD(ts.getTAX_CD());                   // 消費税コード
                 csvStruct.setTAX_RATE_1(ts.getTAX_RATE_1());           // 税率1
                 csvStruct.setTAX_RATE_2(ts.getTAX_RATE_2());           // 税率2
                 csvStruct.setTAX_RATE_3(ts.getTAX_RATE_3());           // 税率3
                 csvStruct.setTAX_ROUND_TYP(ts.getTAX_ROUND_TYP());     // 税端数区分
                 // 発注時受入検査区分
                 // 備品以外、または備品で品目ありの場合
                 if("0".equals(csvStruct.getNON_NO_ITEM_FLG()) ||("1".equals(csvStruct.getNON_NO_ITEM_FLG()) && !isNull(csvStruct.getITEM_CD()))){
                	 // ［品目］．”受入検査区分”を設定
                	 csvStruct.setACPT_INSPC_TYP(itemStruct.getACPT_INSPC_TYP());
                 }else{
                	 // １：受入のみを設定
                	 csvStruct.setACPT_INSPC_TYP("1");
                 }
                 // 会社コード
                 csvStruct.setCOMPANY_CD(_company_cd);
                 // 工場コード
                 csvStruct.setPLANT_CD(this.sysPLANT_CD);
                 // 発注担当者
                 csvStruct.setPUCH_ODR_PERSON(this.sysUSER_CD);
                 // 値引金額
                 String discAmount =
                  AmountCalculator.calcDiscAmount(
                		  csvStruct.getPUCH_ODR_AMOUNT(),
                          csvStruct.getNET_AMOUNT());
                 csvStruct.setDISC_AMOUNT(discAmount);
                 
			}
			_intSuccessCount = _intTotalCount - _intErrorCount - _intWarningCount;
			if (_intErrorCount > 0) {
				return false;
			} else {
				return true;
			}
		} catch (Exception e) {
			 ExpjMessage emsg = new ExpjMessage("ZZ01106");
			 sysLog.severe(emsg, getsysUSER_CD());
			 ExpjException ee = new ExpjException(e, emsg);
			 throw ee;
		}
	}
	
	/**
	 * CSVデータ取込
	 * @param 
	 * @return　csvList
	 * @throws Exception
	 */
	private List readCsvData() throws ExpjException{

		String[] strsCsvData = null;
		List listCsv = new ArrayList();
		try {
			// CSVデータのアップロード
			strsCsvData = (String []) csvReader.lineRead();
			if (strsCsvData != null) {
				setSyslogConfig("strsCsvData.length:" + strsCsvData.length);
				// データ件数としてstrsCsvData.lengthは使えない。実際の行数＋５行くらいらしい
				AE0180010Struct structCsv = null;
				Vector v = null;
				for (int i = 0; i < strsCsvData.length; i++) {
					if (strsCsvData[i].length() == 0) {
						// 処理を抜ける。
						break;
					}
					// タイトル行読み飛ばし
					if(i == 0) {
						continue;
					}

					// レコードを項目毎にばらす
					v = csvReader.importCSVLine(strsCsvData[i]);
					if (v != null ) {
						structCsv = new AE0180010Struct();
						if (CSV_NECESSARY_COLUMN == v.size()) {
							// 品目番号　
							structCsv.setITEM_CD((String)v.get(CSV_ITEM_CD)); 
							// 発注納期
							structCsv.setPUCH_ODR_DLV_DATE((String)v.get(CSV_PRD_DUE_DATE));
							// 発注予定日
							structCsv.setPUCH_ODR_START_DATE((String)v.get(CSV_PUCH_ODR_DLV_DATE)); 
							structCsv.setL_PUCH_ODR_START_DATE((String)v.get(CSV_PUCH_ODR_DLV_DATE)); 
							// 発注数
							structCsv.setPUCH_ODR_QTY((String)v.get(CSV_PUCH_ODR_QTY));
							structCsv.setL_PUCH_ODR_QTY((String)v.get(CSV_PUCH_ODR_QTY));
							// 取引先コード
							structCsv.setVEND_CD((String)v.get(CSV_VEND_CD)); 
							// 製番
							structCsv.setJOB_ODR_CD((String)v.get(CSV_JOB_ODR_CD)); 	
							structCsv.setL_JOB_ODR_CD((String)v.get(CSV_JOB_ODR_CD)); 
							// 取引先回答納期
							structCsv.setCONFIRM_DLV_DATE((String)v.get(CSV_CONFIRM_DLV_DATE)); 
							// 受入場所
							structCsv.setWH_CD((String)v.get(CSV_WH_CD)); 
							// 備考
							structCsv.setPUCH_ODR_COMMENT((String)v.get(CSV_WORK_IN_PROC_COMMENT));
							// 備品発注フラグ
							structCsv.setNON_NO_ITEM_FLG((String)v.get(CSV_NON_NO_ITEM_FLG)); 
							// 備品発注品目名
							structCsv.setNON_NO_ITEM_NAME((String)v.get(CSV_NON_NO_ITEM_NAME)); 
							// 備品発注製品区分
							structCsv.setNON_NO_ITEM_TYP((String)v.get(CSV_NON_NO_ITEM_TYP)); 
							// 備品発注単位
							structCsv.setNON_NO_ITEM_PUCH_ODR_UNIT((String)v.get(CSV_NON_NO_ITEM_PUCH_ODR_UNIT)); 
							// 単価区分
							structCsv.setUNIT_COST_TYP((String)v.get(CSV_UNIT_COST_TYP)); 
							structCsv.setL_UNIT_COST_TYP((String)v.get(CSV_UNIT_COST_TYP)); 
							// 単価
							structCsv.setUNIT_COST((String)v.get(CSV_ACTUAL_UNIT_PRICE)); 
							structCsv.setL_UNIT_COST((String)v.get(CSV_ACTUAL_UNIT_PRICE)); 
							// 加工費
							structCsv.setPROCESSING_COST((String)v.get(CSV_PROCESSING_COST)); 
							structCsv.setL_PROCESSING_COST((String)v.get(CSV_PROCESSING_COST)); 
							// 材料費
							structCsv.setMATERIAL_COST((String)v.get(CSV_MATERIAL_COST)); 
							structCsv.setL_MATERIAL_COST((String)v.get(CSV_MATERIAL_COST)); 
							// その他経費
							structCsv.setOTHER_OVERHEADS((String)v.get(CSV_OTHER_OVERHEADS)); 
							structCsv.setL_OTHER_OVERHEADS((String)v.get(CSV_OTHER_OVERHEADS)); 
							// 本体金額
							structCsv.setNET_AMOUNT((String)v.get(CSV_NET_AMOUNT)); 
							structCsv.setL_NET_AMOUNT((String)v.get(CSV_NET_AMOUNT)); 
							// 為替レート
							structCsv.setEXCH_RATE((String)v.get(CSV_EXCH_RATE)); 
							structCsv.setL_EXCH_RATE((String)v.get(CSV_EXCH_RATE)); 
//20150806 ADD START BY SYSCOM
							//科目コード
							structCsv.setACCT_CD((String)v.get(CSV_ACCT_CD)); 
							//負担部門コード
							structCsv.setDEPT_CD((String)v.get(CSV_DEPT_CD)); 
							//プロジェクトコード
							structCsv.setPJ_CD((String)v.get(CSV_PJ_CD)); 
							//セグメント1
							structCsv.setSEG_CONTENTS1((String)v.get(CSV_SEG_CONTENTS1)); 
							//セグメント2
							structCsv.setSEG_CONTENTS2((String)v.get(CSV_SEG_CONTENTS2)); 
							//セグメント3
							structCsv.setSEG_CONTENTS3((String)v.get(CSV_SEG_CONTENTS3)); 
							//セグメント4
							structCsv.setSEG_CONTENTS4((String)v.get(CSV_SEG_CONTENTS4)); 
//20150806 ADD END BY SYSCOM
						} else {
							structCsv.setw_COLUMN_FLG(String.valueOf(v.size()));
						}
						listCsv.add(structCsv);
					} else {
						//ベクター生成失敗エラー
						setSyslogConfig("csvReader.Vector was Failed... line:" + strsCsvData[i]);
						listCsv = null;
						break;
					}
				}
				//  ＣＳＶデータ件数（タイトル行は省く）
				if((listCsv == null) || (listCsv.size() <= 0)) {
					// 取込失敗またはデータなし
					ExpjMessage emsg = new ExpjMessage( "AH00042", "0", "0");
					msgStruct.addError( emsg );
					sysLog.warning(emsg, getsysUSER_CD());
					listCsv = null;
				} else {
					// ＣＳＶ読込み件数ログ表示
					ExpjMessage emsg = new ExpjMessage( "AH00043", String.valueOf(listCsv.size()));
					sysLog.config(emsg, getsysUSER_CD());
				}
			}
			
		}catch (Exception e) {
			setErrorMessage("AH00042", "0", "0");
			setReadStatus(ERROR);
			throw new ExpjException(e);
		}
		return listCsv;
	
	}
	
	/**
	 * CSVフェイル内容は、登録処理
	 * @param csvList
	 * @return
	 * @throws FoundationException 
	 */
	private boolean insertCsvDate(List csvList) throws FoundationException, ExpjException {
		try {
			boolean rtnFlg = true;
			conn.beginTransWeb();
			for (int i = 0; i < csvList.size(); i++) {
				warningFlg = false;
				AE0180010Struct cvsStruct = (AE0180010Struct)csvList.get(i);
				// 製番がない場合
				if(isNull(cvsStruct.getJOB_ODR_CD())){
					// CSVフェイル内容は、発注残登録処理
					rtnFlg = insertRlsdPuchOdr (cvsStruct,i);
					if(!rtnFlg) {
						conn.rollback();
						return false;
					}
				// 製番場合
				}else{
					// CSVフェイル内容は、発注残登録処理
					rtnFlg = insertRlsdPuchOdrJob (cvsStruct,i);
					if(!rtnFlg) {
						conn.rollback();
						return false;
					}
				}
			}
			conn.commit();
			return true;
		} catch (Exception e) {
			conn.rollback();;
			throw new ExpjException(e);
		}
		
	}
	
	/**
	 * 製番がない場合、CSVフェイル内容は、発注残登録処理
	 * @param csvList
	 * @return
	 * @throws FoundationException 
	 */
	private boolean insertRlsdPuchOdr (AE0180010Struct adstruct ,int j) throws ExpjException {
		try {
			String PUCH_ODR_DLV_TIME = null;
			String PUCH_ODR_START_TIME = null;
			String CONFIRM_DLV_TIME = null;
			adstruct.setsUser_ID(sysUSER_CD);
			// 入力時刻のチェック(時刻管理する場合のみ)
			if ("true".equals(struct.getTIME_CTRL())) {
				PUCH_ODR_DLV_TIME = "2359";
				PUCH_ODR_START_TIME = "2359";
				CONFIRM_DLV_TIME = "2359";
			} else {
				// 時刻管理しない場合は0000に設定
				PUCH_ODR_DLV_TIME = "0000";
				PUCH_ODR_START_TIME = "0000";
				CONFIRM_DLV_TIME = "0000";
			}
			/** 発注予定日（時刻含む）*/
			if (adstruct.getPUCH_ODR_START_DATE().length()<=10) {
				adstruct.setPUCH_ODR_START_DATE(adstruct.getPUCH_ODR_START_DATE() + " " + PUCH_ODR_START_TIME);
			}
			 /** 発注納期（時刻含む）*/
			if (adstruct.getPUCH_ODR_DLV_DATE().length()<=10) {
				adstruct.setPUCH_ODR_DLV_DATE(adstruct.getPUCH_ODR_DLV_DATE() + " " + PUCH_ODR_DLV_TIME);
			}
			 /** 取引先回答納期（時刻含む）*/
            if(adstruct.getCONFIRM_DLV_DATE() != null && !("".equals(adstruct.getCONFIRM_DLV_DATE()))){
            	if (adstruct.getCONFIRM_DLV_DATE().length()<=10) {
            		adstruct.setCONFIRM_DLV_DATE(adstruct.getCONFIRM_DLV_DATE() + " " + CONFIRM_DLV_TIME);
            	}
            }
			// オーダーデマンド番号を自動採番
            // [所要量]の更新
            if ("0".equals(adstruct.getNON_NO_ITEM_FLG())) {
           	    String odNoString = null;
                // ASPROVA連携オプション未導入の場合：日単位のリードタイム計算を行う。
          	    if(!"1".equals(_SysInstallOptions_ASP)){
          	    	CommonOd od = new CommonOd(conn, getsysPLANT_CD(), sysUSER_CD, sp.getProcId());
          	  		odNoString =
          	  			od.addOdInfo(
          	  				adstruct.getITEM_CD(),
          	  					Converter.strToDate(
          	  						adstruct.getPUCH_ODR_DLV_DATE(), Converter.SLASH_DATE_HOUR_MINUTE),
          	  							Converter.strToDate(
          	  								adstruct.getPUCH_ODR_START_DATE(), Converter.SLASH_DATE_HOUR_MINUTE),
          	  									Double.parseDouble(adstruct.getPUCH_ODR_QTY()),
          	  									2);
          	  	// ASPROVA連携オプション導入済の場合：時間単位でのリードタイム計算を行う。
          	  	}else{
	          	  	ATCommonOd od = new ATCommonOd(conn, getsysPLANT_CD(), sysUSER_CD, sp.getProcId());
	       	  		odNoString =
	       	  			od.addOdInfo(
	       	  				adstruct.getITEM_CD(),
	       	  					Converter.strToDate(
	       	  						adstruct.getPUCH_ODR_DLV_DATE(), Converter.SLASH_DATE_HOUR_MINUTE),
	       	  							Converter.strToDate(
	       	  								adstruct.getPUCH_ODR_START_DATE(), Converter.SLASH_DATE_HOUR_MINUTE),
				
	       	  									Double.parseDouble(adstruct.getPUCH_ODR_QTY()),
	       	  									2,
	       	  									new Integer("2").intValue());
          	  	}
          	  	// オーダーデマンド番号設定
          	    adstruct.setOD_NO(odNoString);
          	    // 備品発注品目名
          	    adstruct.setNON_NO_ITEM_NAME(null);
          	    // 備品発注製品区分
          	    adstruct.setNON_NO_ITEM_TYP("0");
          	    // 備品発注単位
          	    adstruct.setNON_NO_ITEM_PUCH_ODR_UNIT(null);
          	    // 在庫管理フラグ
          	    adstruct.setINV_CTRL_FLG("1");
          	} else {
           	    // オーダーデマンド番号設定
            	adstruct.setOD_NO(null);
          	    // 在庫管理フラグ
          	    adstruct.setINV_CTRL_FLG("0");
          	    // 加工費
          	    adstruct.setPROCESSING_COST("0");
          	    // 材料費
          	    adstruct.setMATERIAL_COST("0");
          	    // その他経費
          	    adstruct.setOTHER_OVERHEADS("0");
          	}
            // 発注番号を自動採番
            Numbering puchCdNumbering =
             new Numbering(
              conn,
              Numbering.PUCH_CD,
              sysUSER_CD,
              sp.getProcId(),
              getsysPLANT_CD());
            adstruct.setPUCH_ODR_CD(puchCdNumbering.getNo());
            if (isNull(adstruct.getPUCH_ODR_CD())) {
				//採番結果がない
				csvExport(adstruct					// 対象データ情報
						, "1"						// エラー区分
						, j + 1						// エラー発生行
						,null                       // エラー項目名
						,new ExpjMessage("ZZ01106").getMessage(_locale)// エラーメッセージ
						,null
						, null
						, null);	
				_intErrorCount++;
				setReadStatus(ERROR);
				return false;
			}
            // [発注残]を登録
            entity.minsertT_RLSD_PUCH_ODR.create(conn, adstruct);
            return true;
		}catch(Exception e) {
			throw new ExpjException(e);
		}
	}
	
	/**
	 * 製番場合、CSVフェイル内容は、発注残登録処理
	 * @param csvList
	 * @return
	 * @throws FoundationException 
	 */
	private boolean insertRlsdPuchOdrJob (AE0180010Struct adstruct ,int j) throws ExpjException {
		try {
			String PUCH_ODR_DLV_TIME = null;
			String PUCH_ODR_START_TIME = null;
			String CONFIRM_DLV_TIME = null;
			adstruct.setsUser_ID(sysUSER_CD);
			
			// 入力時刻のチェック(時刻管理する場合のみ)
			if ("true".equals(struct.getTIME_CTRL())) {
				PUCH_ODR_DLV_TIME = "2359";
				PUCH_ODR_START_TIME = "2359";
				CONFIRM_DLV_TIME = "2359";
			} else {
				// 時刻管理しない場合は0000に設定
				PUCH_ODR_DLV_TIME = "0000";
				PUCH_ODR_START_TIME = "0000";
				CONFIRM_DLV_TIME = "0000";
			}
			/** 発注予定日（時刻含む）*/
			if (adstruct.getPUCH_ODR_START_DATE().length()<=10) {
				adstruct.setPUCH_ODR_START_DATE(adstruct.getPUCH_ODR_START_DATE() + " " + PUCH_ODR_START_TIME);
			}
			 /** 発注納期（時刻含む）*/
			if (adstruct.getPUCH_ODR_DLV_DATE().length()<=10) {
				adstruct.setPUCH_ODR_DLV_DATE(adstruct.getPUCH_ODR_DLV_DATE() + " " + PUCH_ODR_DLV_TIME);
			}
			 /** 取引先回答納期（時刻含む）*/
            if(adstruct.getCONFIRM_DLV_DATE() != null && !("".equals(adstruct.getCONFIRM_DLV_DATE()))){
            	if (adstruct.getCONFIRM_DLV_DATE().length()<=10) {
            		adstruct.setCONFIRM_DLV_DATE(adstruct.getCONFIRM_DLV_DATE() + " " + CONFIRM_DLV_TIME);
            	}
            }
            // 備品発注品目名
      	    adstruct.setNON_NO_ITEM_NAME(null);
      	    // 備品発注製品区分
      	    adstruct.setNON_NO_ITEM_TYP("0");
      	    // 備品発注単位
      	    adstruct.setNON_NO_ITEM_PUCH_ODR_UNIT(null);
      	    // 在庫管理フラグ
      	    adstruct.setINV_CTRL_FLG("1");
      	    // 備品発注フラグ
      	    adstruct.setNON_NO_ITEM_FLG("0");
			// ｢発注番号｣を自動採番
			Numbering puchCdNumbering =
					new Numbering(
							conn,
							Numbering.PUCH_CD,
							sysUSER_CD,
							sp.getProcId(),
							getsysPLANT_CD());
			adstruct.setPUCH_ODR_CD(puchCdNumbering.getNo());
			if (isNull(adstruct.getPUCH_ODR_CD())) {
				//採番結果がない
				csvExport(adstruct					// 対象データ情報
						, "1"						// エラー区分
						, j + 1						// エラー発生行
						,null                       // エラー項目名
						,new ExpjMessage("ZZ01106").getMessage(_locale)// エラーメッセージ
						,null
						, null
						, null);	
				_intErrorCount++;
				setReadStatus(ERROR);
				return false;
			}
			// [発注残]を登録
			int nRet = entity.minsertT_RLSD_PUCH_ODR.create(conn, adstruct);

			// [所要量]のオーダ情報の更新
			CommonOd od = new CommonOd(conn, getsysPLANT_CD(), sysUSER_CD, sp.getProcId());
			od.changeOdInfo(adstruct.getOD_NO(), -1);
			return true;
		}catch(Exception e) {
			throw new ExpjException(e);
		}
	}
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * 参照ボタン押下時に実行される処理です。
	 *
	 */
	public void controlBrowse() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0180");
		logger.entering("AE0180010Control"+":USER="+struct.getsUser_ID(),"controlBrowse");
			//{{user_implement_dev:<controlBrowse>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlBrowse>
		logger.exiting("AE0180010Control"+":USER="+struct.getsUser_ID(),"controlBrowse");

		return;
	}

	/**
	 * CSV出力ボタン押下時に実行される処理です。
	 *
	 */
	public void controlCSVOut() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0180");
		logger.entering("AE0180010Control"+":USER="+struct.getsUser_ID(),"controlCSVOut");
			//{{user_implement_dev:<controlCSVOut>
		// CSV出力部品を設定
		csvWriter = new CsvWriter(CsvWriter.getFileName(getsysUSER_CD()));
		AE0180010Struct errorStruct = null;
		List csv = new ArrayList();	// CSV情報
		// CSVヘッダ行をCSV情報に追加
		String[] title = {
				 "Expj.Cmt3094"							// エラー箇所
				,"Expj.Cmt3095"							// エラー区分
				,"Expj.Cmt3098"							// エラー内容
				,"Expj.Cmt6220"							// エラー項目
				,"Expj.ITEM_CD"							// 品目番号
				,"Expj.PRD_DUE_DATE_1"					// 発注納期
				,"Expj.PUCH_ODR_DLV_DATE_1"				// 発注予定日
				,"Expj.PUCH_ODR_QTY"					// 発注数
				,"Expj.VEND_CD"						    // 取引先コード
				,"Expj.JOB_ODR_CD"						// 製番
				,"Expj.CONFIRM_DLV_DATE_1"				// 取引先回答納期
				,"Expj.WH_CD_2"					        // 受入場所
				,"Expj.WORK_IN_PROC_COMMENT_3"			// 備考
				,"Expj.NON_NO_ITEM_FLG"					// 備品発注フラグ
				,"Expj.NON_NO_ITEM_NAME"				// 備品発注品目名
				,"Expj.NON_NO_ITEM_TYP"					// 備品発注製品区分
				,"Expj.NON_NO_ITEM_PUCH_ODR_UNIT"		// 備品発注単位
				,"Expj.UNIT_COST_TYP"					// 単価区分
				,"Expj.ACTUAL_UNIT_PRICE"				// 単価
				,"Expj.PROCESSING_COST"					// 加工費
				,"Expj.MATERIAL_COST"					// 材料費
				,"Expj.OTHER_OVERHEADS"					// その他経費
				,"Expj.NET_AMOUNT"					    // 本体金額
				,"Expj.EXCH_RATE"					    // 為替レート
//20150806 ADD START BY SYSCOM
				,"Expj.EXPENSE_CLASS_CD"				//科目コード
				,"Expj.DEPT_CD"							//負担部門コード
				,"Expj.PJ_CD"							//プロジェクトコード
				,"Expj.SEG_CONTENTS1"					//セグメント1
				,"Expj.SEG_CONTENTS2"					//セグメント2
				,"Expj.SEG_CONTENTS3"					//セグメント3
				,"Expj.SEG_CONTENTS4"					//セグメント4
//20150806 ADD END BY SYSCOM
		};
		csv.add(title);
		// [画面].一覧部のエラー情報をCSV情報に追加
		for (int i = 0; i < list.size(); i++) {
			errorStruct = (AE0180010Struct)list.get(i);
			String[] date = {
					 errorStruct.getl_ERROR_IN()
					,errorStruct.getl_ERR_TYP()
					,errorStruct.getl_ERR_INFO()
					,errorStruct.getl_ERR_CTR_NM()
					,replaceSlashSub(errorStruct.getl_ERR_ITEM_CD())
					,replaceSlashSub(errorStruct.getl_ERR_PRD_DUE_DATE())
					,replaceSlashSub(errorStruct.getl_ERR_PUCH_ODR_DLV_DATE())
					,replaceSlashSub(errorStruct.getl_ERR_PUCH_ODR_QTY())
					,replaceSlashSub(errorStruct.getl_ERR_VEND_CD())
					,replaceSlashSub(errorStruct.getl_ERR_JOB_ODR_CD())
					,replaceSlashSub(errorStruct.getl_ERR_CONFIRM_DLV_DATE())
					,replaceSlashSub(errorStruct.getl_ERR_WH_CD())
					,replaceSlashSub(errorStruct.getl_ERR_WORK_IN_PROC_COMMENT())
					,replaceSlashSub(errorStruct.getl_ERR_NON_NO_ITEM_FLG())
					,replaceSlashSub(errorStruct.getl_ERR_NON_NO_ITEM_NAME())
					,replaceSlashSub(errorStruct.getl_ERR_NON_NO_ITEM_TYP())
					,replaceSlashSub(errorStruct.getl_ERR_NON_NO_ITEM_PUCH_ODR_UNIT())
					,replaceSlashSub(errorStruct.getl_ERR_UNIT_COST_TYP())
					,replaceSlashSub(errorStruct.getl_ERR_ACTUAL_UNIT_PRICE())
					,replaceSlashSub(errorStruct.getl_ERR_PROCESSING_COST())
					,replaceSlashSub(errorStruct.getl_ERR_MATERIAL_COST())
					,replaceSlashSub(errorStruct.getl_ERR_OTHER_OVERHEADS())
					,replaceSlashSub(errorStruct.getl_ERR_NET_AMOUNT())
					,replaceSlashSub(errorStruct.getl_ERR_EXCH_RATE())
//20150806 ADD START BY SYSCOM
					,replaceSlashSub(errorStruct.getl_ERR_EXPENSE_CLASS_CD())
					,replaceSlashSub(errorStruct.getl_ERR_DEPT_CD())
					,replaceSlashSub(errorStruct.getl_ERR_PJ_CD())
					,replaceSlashSub(errorStruct.getl_ERR_SEG_CONTENTS1())
					,replaceSlashSub(errorStruct.getl_ERR_SEG_CONTENTS2())
					,replaceSlashSub(errorStruct.getl_ERR_SEG_CONTENTS3())
					,replaceSlashSub(errorStruct.getl_ERR_SEG_CONTENTS4())
//20150806 ADD END BY SYSCOM
			};
			csv.add(date);
		}
		
		// CSVファイルを作成
		csvWriter.write(csv, CoreTools.getLocale(struct.getsUser_ID()), true);
		// CSVファイルをクライアントに出力
		struct.setDOWNLOAD_FILE(getCsvWriter().getFilePath());
                //}}user_implement_dev:<controlCSVOut>
		logger.exiting("AE0180010Control"+":USER="+struct.getsUser_ID(),"controlCSVOut");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0180");
		logger.entering("AE0180010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
		setList(null);
		// 検索状態を「初期状態」に設定
		setReadStatus(INITIAL);
                //}}user_implement_dev:<controlClear>
		logger.exiting("AE0180010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * 閉じるボタン押下時に実行される処理です。
	 *
	 */
	public void controlClose() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0180");
		logger.entering("AE0180010Control"+":USER="+struct.getsUser_ID(),"controlClose");
			//{{user_implement_dev:<controlClose>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlClose>
		logger.exiting("AE0180010Control"+":USER="+struct.getsUser_ID(),"controlClose");

		return;
	}

	/**
	 * 取込ボタン押下時に実行される処理です。
	 *
	 */
	public void controlCsvIn() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0180");
		logger.entering("AE0180010Control"+":USER="+struct.getsUser_ID(),"controlCsvIn");
			//{{user_implement_dev:<controlCsvIn>
		try {
			// 全部レコード数
				_intTotalCount = 0; 
				// エラーレコード件数
				_intErrorCount = 0;  
				// 正常レコード件数
				_intSuccessCount = 0;
				// ワーニング件数
				_intWarningCount = 0;
				// ワーニング件数
				_intWarningCount1 = 0;
				// 画面表示用リストクリア
				if (list == null) {
					list = new ArrayList();
				} else {
					list.clear();
				}
				// ＣＳＶデータ取得
				List listCsv = null;
				listCsv = readCsvData();
				listCsvTemp = listCsv;

				// ＣＳＶデータ取得成功
				if (listCsv != null) {
				// ＣＳＶ項目のチェック＆＆ ＣＳＶ項目の登録
					if (checkCsvData(listCsv)) {
						
						// 登録処理
						if(insertCsvDate(listCsv)) {
							_intSuccessCount = _intSuccessCount - _intWarningCount1;
							// エラーがない場合
							if (_intWarningCount1 + _intWarningCount== 0) {
								setInfoMessage("AA01514", String.valueOf(_intSuccessCount));
							} else {
								setWarningMessage("AA01515", String.valueOf(_intSuccessCount), String.valueOf(_intWarningCount+_intWarningCount1));
							}
						} else {
							setErrorMessage("AD34033");
						}
					} else {
						// エラーがある場合
						setErrorMessage("AA01516", String.valueOf(_intSuccessCount), String.valueOf(_intWarningCount), String.valueOf(_intErrorCount));
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
				setErrorMessage("ZZ01106");
				setReadStatus(ERROR);
			}
                //}}user_implement_dev:<controlCsvIn>
		logger.exiting("AE0180010Control"+":USER="+struct.getsUser_ID(),"controlCsvIn");

		return;
	}

	/**
	 * 実行ボタン押下時に実行される処理です。
	 *
	 */
	public void controlExecute() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0180");
		logger.entering("AE0180010Control"+":USER="+struct.getsUser_ID(),"controlExecute");
			//{{user_implement_dev:<controlExecute>
			// TODO: ユーザ定義のコードを記述してください
		try{
	    	setReadStatus(INITIAL); 
	        // バッチ処理クラスのmain引数
	        String strBatchClassName = null;		// 呼び出し先クラス名
	        String strBatchProcessingTyp = null;	// バッチ処理区分
	        String strProgramId = null;			    // 業務名（AE0180B001）
	        String strUserId = null;				// ユーザID
	        String strPlantCd = null;				// 工場コード
	        String strCsvTakeTyp =null;             // CSV取込方式
	        // 引数セット
	        strBatchClassName = "com.nec.jp.orteus.metamorBase.AE0180.AE0180B001.mainAE0180B001";
	        strBatchProcessingTyp = "2";					  // 2: 自動運転しない（夜間バッチなし）
	        strProgramId = "AE0180B001";					  // 業務名（AE0180B001）
	        strUserId = getsysUSER_CD();					  // ユーザID
	        strPlantCd = getsysPLANT_CD();					  // 工場コード
	        strCsvTakeTyp ="1";                               // CSV取込方式 = 1:固定ファイル取込
	        // バッチ処理を実行する -------------------------------------------
	        ResourceBundle bundle = SystemConfig.getBundle();
	        String javaPath = SystemConfig.getProperty("JAVA_PATH", bundle);
	        if(javaPath == null){
	            //システム既定値ファイルからの情報取得に失敗しました(ＪＶＭパス)
	            setErrorMessage("ZZ09010");
	            return;
	           }
	        String ClassPath = SystemConfig.getProperty("CLASS_PATH", bundle);
	        if(ClassPath == null){
	        	//システム既定値ファイルからの情報取得に失敗しました(クラスパス)
	        	setErrorMessage("ZZ09012");
	            return;
	        }
	        String batchPath = SystemConfig.getProperty("BATCH_PATH", bundle);
	        if(batchPath == null){        	
	            //システム既定値ファイルからの情報取得に失敗しました(バッチ起動設定)        	
	        	setErrorMessage("ZZ09011");
	            return;
	        }
	    
	        String heapSize = SystemConfig.getProperty("HIGH_HEAP_SIZE",bundle); 
	        if (heapSize == null) {
	            //システム既定値ファイルからの情報取得に失敗しました(バッチヒープサイズ設定)
	        	setErrorMessage("ZZ09017");
	            return;
	           }
	        List buffer = new ArrayList();
			buffer.add(javaPath);            // ＪＶＭ
			buffer.add("-cp");
			buffer.add(ClassPath);           // Java ClassPath
			buffer.add("-Dcom.nec.jp.orteus.util.logging.config.file="+batchPath); // 起動設定
			buffer.add(strBatchClassName);                       // 呼び出し先クラス
			buffer.add(strBatchProcessingTyp);                   // バッチ処理区分
			buffer.add(strUserId);                               // ユーザID
			buffer.add(strProgramId);                            // 業務ID
			buffer.add(strPlantCd);                              // 工場コード
			buffer.add(strCsvTakeTyp);                           // CSV取込方式		
			try {
				// バッチ処理実行
				Runtime runtime = Runtime.getRuntime();
				runtime.exec((String[])buffer.toArray(new String[buffer.size()]));
			} catch (IOException e) {	        	
		        // バッチ呼び出し失敗の場合、画面メッセージを表示する。
				setErrorMessage("ZZ09014");
				return;
	        }	    
	        // バッチ呼び出し成功の場合、画面メッセージを表示する。
			setInfoMessage2("ZZ09013");
	    }catch(Exception e){			
			e.printStackTrace();
			setErrorMessage("ZZ01106");
		
		}
                //}}user_implement_dev:<controlExecute>
		logger.exiting("AE0180010Control"+":USER="+struct.getsUser_ID(),"controlExecute");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0180");
		logger.entering("AE0180010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AE0180010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0180");
		logger.entering("AE0180010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
		try{
            // [邦貨]情報を部品より取得			
            _homeCurStruct = HomeCurControl.getData(conn);
			// 業務運用日取得
			try {
				DateCtrlStruct dateCtrl = DateCtrlControl.getData(conn, getsysPLANT_CD());
				_btmBusinessOprDate = dateCtrl.getBUSINESS_OPR_DATE();
			} catch(DataNotFoundException e) {
				ExpjMessage emsg = new ExpjMessage("AC34080" );
				sysLog.severe(emsg, getsysUSER_CD());//致命的エラー エラー内容
				ExpjException ee = new ExpjException(e, emsg); // エクセプションを生成
				setReadStatus(ERROR);
				throw ee;
			}
         
			 // システムパラメータ（TIME_CTRL）取得
			 AE0180010Struct TIME_CTRLStruct = new AE0180010Struct();
			 List TIME_CTRLList = entity.mselectTIME_CTRL.read(conn, TIME_CTRLStruct);
			 if(null != TIME_CTRLList && TIME_CTRLList.size()>0){
		 		TIME_CTRLStruct = (AE0180010Struct)TIME_CTRLList.get(0);
				struct.setTIME_CTRL(TIME_CTRLStruct.getTIME_CTRL());
			 }else{
				struct.setTIME_CTRL("false");
			 }

			// コンボボックスデータ用意
	 		ComboBox combBox = new ComboBox(conn, sysUSER_CD);
			// コンボボックスのデータを取得
			_COM_ERR_TYP = combBox.getData("ERR_TYP");
			// 備品発注フラグ
			_NON_NO_ITEM_FLG = combBox.getData("NON_NO_ITEM_FLG");
			
			// 備品発注製品区分
			_PRODUCT_TYP = combBox.getData("PRODUCT_TYP");
			
			// 単価区分
			_UNIT_COST_TYP = combBox.getData("UNIT_COST_TYP");

			// 会社コード取得
			_company_cd = SystemInformation.getSysMyCompanyCd();
			
			// ASPROVA連携オプションインストールフラグの取得
			 List InstallOptionList_ASP = entity.mselectSYS_INSTALL_OPTIONS_ASP.read(conn, struct);
			 if (InstallOptionList_ASP.isEmpty()) {
			  	 struct.setASP_INSTALL_FLG(null);			
			 }else{
				 struct.setASP_INSTALL_FLG(((AE0180010Struct)InstallOptionList_ASP.get(0)).getASP_INSTALL_FLG());
			 }
			 
			 _SysInstallOptions_ASP = struct.getASP_INSTALL_FLG();
			
		}catch(ExpjException e) {
			throw e;
		}
		catch(Exception e) {
			e.printStackTrace();
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());//致命的エラー エラー内容
			ExpjException ee = new ExpjException(e, emsg); // エクセプションを生成
			throw ee;
		} 
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AE0180010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * イベントハンドラの前処理です。
	 *
	 * @param buttun ボタン名
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0180");
		logger.entering("AE0180010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");
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
		logger.exiting("AE0180010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			if( button.equals("Browse") ) {
				controlBrowse();
			} else if( button.equals("CSVOut") ) {
				controlCSVOut();
			} else if( button.equals("Clear") ) {
				controlClear();
			} else if( button.equals("Close") ) {
				controlClose();
			} else if( button.equals("CsvIn") ) {
				controlCsvIn();
			} else if( button.equals("Execute") ) {
				controlExecute();
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
//			throw new FoundationException("AE0180010Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AE0180010-E999","CSVの出力処理"));
			throw new FoundationException("AE0180010Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AE0180010-E999","システム日付の取得処理"));
				throw new FoundationException("AE0180010Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AE0180010-E999","コントロールのイベント処理"));
			throw new FoundationException("AE0180010Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected AE0180010Entity entity;
	protected AE0180010Struct struct;
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

		entity = new AE0180010Entity();
		struct = new AE0180010Struct();

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
	 * AE0180010クラスの標準コンストラクタ
	 */
	public AE0180010Control() throws BusinessProcessException, FoundationException
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
				AE0180010Struct key = (AE0180010Struct)keyList.get(j);
				// メッセージキーを作成する
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("FileName") && key.getFileName() != null) {
					msgKey.setKeyValue("FileName", key.getFileName());
				}
				if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE") && key.getDOWNLOAD_FILE() != null) {
					msgKey.setKeyValue("DOWNLOAD_FILE", key.getDOWNLOAD_FILE());
				}
				if(msgKeyType.containsKeyColumn("l_ERROR_IN") && key.getl_ERROR_IN() != null) {
					msgKey.setKeyValue("l_ERROR_IN", key.getl_ERROR_IN());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_TYP") && key.getl_ERR_TYP() != null) {
					msgKey.setKeyValue("l_ERR_TYP", key.getl_ERR_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_INFO") && key.getl_ERR_INFO() != null) {
					msgKey.setKeyValue("l_ERR_INFO", key.getl_ERR_INFO());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_CTR_NM") && key.getl_ERR_CTR_NM() != null) {
					msgKey.setKeyValue("l_ERR_CTR_NM", key.getl_ERR_CTR_NM());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_ITEM_CD") && key.getl_ERR_ITEM_CD() != null) {
					msgKey.setKeyValue("l_ERR_ITEM_CD", key.getl_ERR_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_PRD_DUE_DATE") && key.getl_ERR_PRD_DUE_DATE() != null) {
					msgKey.setKeyValue("l_ERR_PRD_DUE_DATE", key.getl_ERR_PRD_DUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_PUCH_ODR_DLV_DATE") && key.getl_ERR_PUCH_ODR_DLV_DATE() != null) {
					msgKey.setKeyValue("l_ERR_PUCH_ODR_DLV_DATE", key.getl_ERR_PUCH_ODR_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_PUCH_ODR_QTY") && key.getl_ERR_PUCH_ODR_QTY() != null) {
					msgKey.setKeyValue("l_ERR_PUCH_ODR_QTY", key.getl_ERR_PUCH_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_VEND_CD") && key.getl_ERR_VEND_CD() != null) {
					msgKey.setKeyValue("l_ERR_VEND_CD", key.getl_ERR_VEND_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_JOB_ODR_CD") && key.getl_ERR_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("l_ERR_JOB_ODR_CD", key.getl_ERR_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_CONFIRM_DLV_DATE") && key.getl_ERR_CONFIRM_DLV_DATE() != null) {
					msgKey.setKeyValue("l_ERR_CONFIRM_DLV_DATE", key.getl_ERR_CONFIRM_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_WH_CD") && key.getl_ERR_WH_CD() != null) {
					msgKey.setKeyValue("l_ERR_WH_CD", key.getl_ERR_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_WORK_IN_PROC_COMMENT") && key.getl_ERR_WORK_IN_PROC_COMMENT() != null) {
					msgKey.setKeyValue("l_ERR_WORK_IN_PROC_COMMENT", key.getl_ERR_WORK_IN_PROC_COMMENT());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_NON_NO_ITEM_FLG") && key.getl_ERR_NON_NO_ITEM_FLG() != null) {
					msgKey.setKeyValue("l_ERR_NON_NO_ITEM_FLG", key.getl_ERR_NON_NO_ITEM_FLG());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_NON_NO_ITEM_NAME") && key.getl_ERR_NON_NO_ITEM_NAME() != null) {
					msgKey.setKeyValue("l_ERR_NON_NO_ITEM_NAME", key.getl_ERR_NON_NO_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_NON_NO_ITEM_TYP") && key.getl_ERR_NON_NO_ITEM_TYP() != null) {
					msgKey.setKeyValue("l_ERR_NON_NO_ITEM_TYP", key.getl_ERR_NON_NO_ITEM_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_NON_NO_ITEM_PUCH_ODR_UNIT") && key.getl_ERR_NON_NO_ITEM_PUCH_ODR_UNIT() != null) {
					msgKey.setKeyValue("l_ERR_NON_NO_ITEM_PUCH_ODR_UNIT", key.getl_ERR_NON_NO_ITEM_PUCH_ODR_UNIT());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_UNIT_COST_TYP") && key.getl_ERR_UNIT_COST_TYP() != null) {
					msgKey.setKeyValue("l_ERR_UNIT_COST_TYP", key.getl_ERR_UNIT_COST_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_ACTUAL_UNIT_PRICE") && key.getl_ERR_ACTUAL_UNIT_PRICE() != null) {
					msgKey.setKeyValue("l_ERR_ACTUAL_UNIT_PRICE", key.getl_ERR_ACTUAL_UNIT_PRICE());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_PROCESSING_COST") && key.getl_ERR_PROCESSING_COST() != null) {
					msgKey.setKeyValue("l_ERR_PROCESSING_COST", key.getl_ERR_PROCESSING_COST());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_MATERIAL_COST") && key.getl_ERR_MATERIAL_COST() != null) {
					msgKey.setKeyValue("l_ERR_MATERIAL_COST", key.getl_ERR_MATERIAL_COST());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_OTHER_OVERHEADS") && key.getl_ERR_OTHER_OVERHEADS() != null) {
					msgKey.setKeyValue("l_ERR_OTHER_OVERHEADS", key.getl_ERR_OTHER_OVERHEADS());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_NET_AMOUNT") && key.getl_ERR_NET_AMOUNT() != null) {
					msgKey.setKeyValue("l_ERR_NET_AMOUNT", key.getl_ERR_NET_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_EXCH_RATE") && key.getl_ERR_EXCH_RATE() != null) {
					msgKey.setKeyValue("l_ERR_EXCH_RATE", key.getl_ERR_EXCH_RATE());
				}
				if(msgKeyType.containsKeyColumn("h_INSTALL_FLG") && key.geth_INSTALL_FLG() != null) {
					msgKey.setKeyValue("h_INSTALL_FLG", key.geth_INSTALL_FLG());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_EXPENSE_CLASS_CD") && key.getl_ERR_EXPENSE_CLASS_CD() != null) {
					msgKey.setKeyValue("l_ERR_EXPENSE_CLASS_CD", key.getl_ERR_EXPENSE_CLASS_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_DEPT_CD") && key.getl_ERR_DEPT_CD() != null) {
					msgKey.setKeyValue("l_ERR_DEPT_CD", key.getl_ERR_DEPT_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_PJ_CD") && key.getl_ERR_PJ_CD() != null) {
					msgKey.setKeyValue("l_ERR_PJ_CD", key.getl_ERR_PJ_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_SEG_CONTENTS1") && key.getl_ERR_SEG_CONTENTS1() != null) {
					msgKey.setKeyValue("l_ERR_SEG_CONTENTS1", key.getl_ERR_SEG_CONTENTS1());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_SEG_CONTENTS2") && key.getl_ERR_SEG_CONTENTS2() != null) {
					msgKey.setKeyValue("l_ERR_SEG_CONTENTS2", key.getl_ERR_SEG_CONTENTS2());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_SEG_CONTENTS3") && key.getl_ERR_SEG_CONTENTS3() != null) {
					msgKey.setKeyValue("l_ERR_SEG_CONTENTS3", key.getl_ERR_SEG_CONTENTS3());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_SEG_CONTENTS4") && key.getl_ERR_SEG_CONTENTS4() != null) {
					msgKey.setKeyValue("l_ERR_SEG_CONTENTS4", key.getl_ERR_SEG_CONTENTS4());
				}
				if(msgKeyType.containsKeyColumn("w_COLUMN_FLG") && key.getw_COLUMN_FLG() != null) {
					msgKey.setKeyValue("w_COLUMN_FLG", key.getw_COLUMN_FLG());
				}
				if(msgKeyType.containsKeyColumn("L_PUCH_ODR_START_DATE") && key.getL_PUCH_ODR_START_DATE() != null) {
					msgKey.setKeyValue("L_PUCH_ODR_START_DATE", key.getL_PUCH_ODR_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("L_JOB_ODR_CD") && key.getL_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("L_JOB_ODR_CD", key.getL_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("L_UNIT_COST_TYP") && key.getL_UNIT_COST_TYP() != null) {
					msgKey.setKeyValue("L_UNIT_COST_TYP", key.getL_UNIT_COST_TYP());
				}
				if(msgKeyType.containsKeyColumn("L_UNIT_COST") && key.getL_UNIT_COST() != null) {
					msgKey.setKeyValue("L_UNIT_COST", key.getL_UNIT_COST());
				}
				if(msgKeyType.containsKeyColumn("L_PROCESSING_COST") && key.getL_PROCESSING_COST() != null) {
					msgKey.setKeyValue("L_PROCESSING_COST", key.getL_PROCESSING_COST());
				}
				if(msgKeyType.containsKeyColumn("L_MATERIAL_COST") && key.getL_MATERIAL_COST() != null) {
					msgKey.setKeyValue("L_MATERIAL_COST", key.getL_MATERIAL_COST());
				}
				if(msgKeyType.containsKeyColumn("L_OTHER_OVERHEADS") && key.getL_OTHER_OVERHEADS() != null) {
					msgKey.setKeyValue("L_OTHER_OVERHEADS", key.getL_OTHER_OVERHEADS());
				}
				if(msgKeyType.containsKeyColumn("L_NET_AMOUNT") && key.getL_NET_AMOUNT() != null) {
					msgKey.setKeyValue("L_NET_AMOUNT", key.getL_NET_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("L_EXCH_RATE") && key.getL_EXCH_RATE() != null) {
					msgKey.setKeyValue("L_EXCH_RATE", key.getL_EXCH_RATE());
				}
				if(msgKeyType.containsKeyColumn("L_PUCH_ODR_QTY") && key.getL_PUCH_ODR_QTY() != null) {
					msgKey.setKeyValue("L_PUCH_ODR_QTY", key.getL_PUCH_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP") && key.getMRP_ODR_TYP() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP", key.getMRP_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("ACPT_INSPC_TYP") && key.getACPT_INSPC_TYP() != null) {
					msgKey.setKeyValue("ACPT_INSPC_TYP", key.getACPT_INSPC_TYP());
				}
				if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP") && key.getUNIT_QTY_TYP() != null) {
					msgKey.setKeyValue("UNIT_QTY_TYP", key.getUNIT_QTY_TYP());
				}
				if(msgKeyType.containsKeyColumn("FIXED_LT") && key.getFIXED_LT() != null) {
					msgKey.setKeyValue("FIXED_LT", key.getFIXED_LT());
				}
				if(msgKeyType.containsKeyColumn("PROP_LT") && key.getPROP_LT() != null) {
					msgKey.setKeyValue("PROP_LT", key.getPROP_LT());
				}
				if(msgKeyType.containsKeyColumn("SAFETY_LT") && key.getSAFETY_LT() != null) {
					msgKey.setKeyValue("SAFETY_LT", key.getSAFETY_LT());
				}
				if(msgKeyType.containsKeyColumn("PROP_LOT_SIZE") && key.getPROP_LOT_SIZE() != null) {
					msgKey.setKeyValue("PROP_LOT_SIZE", key.getPROP_LOT_SIZE());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("VEND_CD") && key.getVEND_CD() != null) {
					msgKey.setKeyValue("VEND_CD", key.getVEND_CD());
				}
				if(msgKeyType.containsKeyColumn("DEAL_STS_FLG") && key.getDEAL_STS_FLG() != null) {
					msgKey.setKeyValue("DEAL_STS_FLG", key.getDEAL_STS_FLG());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("WH_CD") && key.getWH_CD() != null) {
					msgKey.setKeyValue("WH_CD", key.getWH_CD());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_STS_TYP") && key.getJOB_ODR_STS_TYP() != null) {
					msgKey.setKeyValue("JOB_ODR_STS_TYP", key.getJOB_ODR_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_CD") && key.getJOB_ODR_CD() != null) {
					msgKey.setKeyValue("JOB_ODR_CD", key.getJOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("OD_NO") && key.getOD_NO() != null) {
					msgKey.setKeyValue("OD_NO", key.getOD_NO());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_DLV_DATE") && key.getJOB_ODR_DLV_DATE() != null) {
					msgKey.setKeyValue("JOB_ODR_DLV_DATE", key.getJOB_ODR_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("VALUE") && key.getVALUE() != null) {
					msgKey.setKeyValue("VALUE", key.getVALUE());
				}
				if(msgKeyType.containsKeyColumn("NAME") && key.getNAME() != null) {
					msgKey.setKeyValue("NAME", key.getNAME());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_CD") && key.getPUCH_ODR_CD() != null) {
					msgKey.setKeyValue("PUCH_ODR_CD", key.getPUCH_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("NON_NO_ITEM_NAME") && key.getNON_NO_ITEM_NAME() != null) {
					msgKey.setKeyValue("NON_NO_ITEM_NAME", key.getNON_NO_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("NON_NO_ITEM_TYP") && key.getNON_NO_ITEM_TYP() != null) {
					msgKey.setKeyValue("NON_NO_ITEM_TYP", key.getNON_NO_ITEM_TYP());
				}
				if(msgKeyType.containsKeyColumn("COMPANY_CD") && key.getCOMPANY_CD() != null) {
					msgKey.setKeyValue("COMPANY_CD", key.getCOMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_PERSON") && key.getPUCH_ODR_PERSON() != null) {
					msgKey.setKeyValue("PUCH_ODR_PERSON", key.getPUCH_ODR_PERSON());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_START_DATE") && key.getPUCH_ODR_START_DATE() != null) {
					msgKey.setKeyValue("PUCH_ODR_START_DATE", key.getPUCH_ODR_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_DLV_DATE") && key.getPUCH_ODR_DLV_DATE() != null) {
					msgKey.setKeyValue("PUCH_ODR_DLV_DATE", key.getPUCH_ODR_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_QTY") && key.getPUCH_ODR_QTY() != null) {
					msgKey.setKeyValue("PUCH_ODR_QTY", key.getPUCH_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("NON_NO_ITEM_PUCH_ODR_UNIT") && key.getNON_NO_ITEM_PUCH_ODR_UNIT() != null) {
					msgKey.setKeyValue("NON_NO_ITEM_PUCH_ODR_UNIT", key.getNON_NO_ITEM_PUCH_ODR_UNIT());
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
				if(msgKeyType.containsKeyColumn("DISC_AMOUNT") && key.getDISC_AMOUNT() != null) {
					msgKey.setKeyValue("DISC_AMOUNT", key.getDISC_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_AMOUNT") && key.getPUCH_ODR_AMOUNT() != null) {
					msgKey.setKeyValue("PUCH_ODR_AMOUNT", key.getPUCH_ODR_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("CONFIRM_DLV_DATE") && key.getCONFIRM_DLV_DATE() != null) {
					msgKey.setKeyValue("CONFIRM_DLV_DATE", key.getCONFIRM_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("INV_CTRL_FLG") && key.getINV_CTRL_FLG() != null) {
					msgKey.setKeyValue("INV_CTRL_FLG", key.getINV_CTRL_FLG());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_COMMENT") && key.getPUCH_ODR_COMMENT() != null) {
					msgKey.setKeyValue("PUCH_ODR_COMMENT", key.getPUCH_ODR_COMMENT());
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
				if(msgKeyType.containsKeyColumn("AMOUNT_INCLUDE_TAX") && key.getAMOUNT_INCLUDE_TAX() != null) {
					msgKey.setKeyValue("AMOUNT_INCLUDE_TAX", key.getAMOUNT_INCLUDE_TAX());
				}
				if(msgKeyType.containsKeyColumn("HOME_CUR_AMOUNT") && key.getHOME_CUR_AMOUNT() != null) {
					msgKey.setKeyValue("HOME_CUR_AMOUNT", key.getHOME_CUR_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("TAX_CD") && key.getTAX_CD() != null) {
					msgKey.setKeyValue("TAX_CD", key.getTAX_CD());
				}
				if(msgKeyType.containsKeyColumn("TAX_ROUND_TYP") && key.getTAX_ROUND_TYP() != null) {
					msgKey.setKeyValue("TAX_ROUND_TYP", key.getTAX_ROUND_TYP());
				}
				if(msgKeyType.containsKeyColumn("NON_NO_ITEM_FLG") && key.getNON_NO_ITEM_FLG() != null) {
					msgKey.setKeyValue("NON_NO_ITEM_FLG", key.getNON_NO_ITEM_FLG());
				}
				if(msgKeyType.containsKeyColumn("ACCT_CD") && key.getACCT_CD() != null) {
					msgKey.setKeyValue("ACCT_CD", key.getACCT_CD());
				}
				if(msgKeyType.containsKeyColumn("DEPT_CD") && key.getDEPT_CD() != null) {
					msgKey.setKeyValue("DEPT_CD", key.getDEPT_CD());
				}
				if(msgKeyType.containsKeyColumn("PJ_CD") && key.getPJ_CD() != null) {
					msgKey.setKeyValue("PJ_CD", key.getPJ_CD());
				}
				if(msgKeyType.containsKeyColumn("SEG_CONTENTS1") && key.getSEG_CONTENTS1() != null) {
					msgKey.setKeyValue("SEG_CONTENTS1", key.getSEG_CONTENTS1());
				}
				if(msgKeyType.containsKeyColumn("SEG_CONTENTS2") && key.getSEG_CONTENTS2() != null) {
					msgKey.setKeyValue("SEG_CONTENTS2", key.getSEG_CONTENTS2());
				}
				if(msgKeyType.containsKeyColumn("SEG_CONTENTS3") && key.getSEG_CONTENTS3() != null) {
					msgKey.setKeyValue("SEG_CONTENTS3", key.getSEG_CONTENTS3());
				}
				if(msgKeyType.containsKeyColumn("SEG_CONTENTS4") && key.getSEG_CONTENTS4() != null) {
					msgKey.setKeyValue("SEG_CONTENTS4", key.getSEG_CONTENTS4());
				}
				if(msgKeyType.containsKeyColumn("ASP_INSTALL_FLG") && key.getASP_INSTALL_FLG() != null) {
					msgKey.setKeyValue("ASP_INSTALL_FLG", key.getASP_INSTALL_FLG());
				}
				if(msgKeyType.containsKeyColumn("TIME_CTRL") && key.getTIME_CTRL() != null) {
					msgKey.setKeyValue("TIME_CTRL", key.getTIME_CTRL());
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
				if(msgKeyType.containsKeyColumn("VEND_DECIMAL_FIG") && key.getVEND_DECIMAL_FIG() != null) {
					msgKey.setKeyValue("VEND_DECIMAL_FIG", key.getVEND_DECIMAL_FIG());
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
				if(msgKeyType.containsKeyColumn("DEPT_NAME") && key.getDEPT_NAME() != null) {
					msgKey.setKeyValue("DEPT_NAME", key.getDEPT_NAME());
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
					AE0180010Struct key = new AE0180010Struct();
					if(msgKeyType.containsKeyColumn("FileName")) {
						key.setFileName(msgKey.getKeyValue("FileName"));
					}
					if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE")) {
						key.setDOWNLOAD_FILE(msgKey.getKeyValue("DOWNLOAD_FILE"));
					}
					if(msgKeyType.containsKeyColumn("l_ERROR_IN")) {
						key.setl_ERROR_IN(msgKey.getKeyValue("l_ERROR_IN"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_TYP")) {
						key.setl_ERR_TYP(msgKey.getKeyValue("l_ERR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_INFO")) {
						key.setl_ERR_INFO(msgKey.getKeyValue("l_ERR_INFO"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_CTR_NM")) {
						key.setl_ERR_CTR_NM(msgKey.getKeyValue("l_ERR_CTR_NM"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_ITEM_CD")) {
						key.setl_ERR_ITEM_CD(msgKey.getKeyValue("l_ERR_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_PRD_DUE_DATE")) {
						key.setl_ERR_PRD_DUE_DATE(msgKey.getKeyValue("l_ERR_PRD_DUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_PUCH_ODR_DLV_DATE")) {
						key.setl_ERR_PUCH_ODR_DLV_DATE(msgKey.getKeyValue("l_ERR_PUCH_ODR_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_PUCH_ODR_QTY")) {
						key.setl_ERR_PUCH_ODR_QTY(msgKey.getKeyValue("l_ERR_PUCH_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_VEND_CD")) {
						key.setl_ERR_VEND_CD(msgKey.getKeyValue("l_ERR_VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_JOB_ODR_CD")) {
						key.setl_ERR_JOB_ODR_CD(msgKey.getKeyValue("l_ERR_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_CONFIRM_DLV_DATE")) {
						key.setl_ERR_CONFIRM_DLV_DATE(msgKey.getKeyValue("l_ERR_CONFIRM_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_WH_CD")) {
						key.setl_ERR_WH_CD(msgKey.getKeyValue("l_ERR_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_WORK_IN_PROC_COMMENT")) {
						key.setl_ERR_WORK_IN_PROC_COMMENT(msgKey.getKeyValue("l_ERR_WORK_IN_PROC_COMMENT"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_NON_NO_ITEM_FLG")) {
						key.setl_ERR_NON_NO_ITEM_FLG(msgKey.getKeyValue("l_ERR_NON_NO_ITEM_FLG"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_NON_NO_ITEM_NAME")) {
						key.setl_ERR_NON_NO_ITEM_NAME(msgKey.getKeyValue("l_ERR_NON_NO_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_NON_NO_ITEM_TYP")) {
						key.setl_ERR_NON_NO_ITEM_TYP(msgKey.getKeyValue("l_ERR_NON_NO_ITEM_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_NON_NO_ITEM_PUCH_ODR_UNIT")) {
						key.setl_ERR_NON_NO_ITEM_PUCH_ODR_UNIT(msgKey.getKeyValue("l_ERR_NON_NO_ITEM_PUCH_ODR_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_UNIT_COST_TYP")) {
						key.setl_ERR_UNIT_COST_TYP(msgKey.getKeyValue("l_ERR_UNIT_COST_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_ACTUAL_UNIT_PRICE")) {
						key.setl_ERR_ACTUAL_UNIT_PRICE(msgKey.getKeyValue("l_ERR_ACTUAL_UNIT_PRICE"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_PROCESSING_COST")) {
						key.setl_ERR_PROCESSING_COST(msgKey.getKeyValue("l_ERR_PROCESSING_COST"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_MATERIAL_COST")) {
						key.setl_ERR_MATERIAL_COST(msgKey.getKeyValue("l_ERR_MATERIAL_COST"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_OTHER_OVERHEADS")) {
						key.setl_ERR_OTHER_OVERHEADS(msgKey.getKeyValue("l_ERR_OTHER_OVERHEADS"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_NET_AMOUNT")) {
						key.setl_ERR_NET_AMOUNT(msgKey.getKeyValue("l_ERR_NET_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_EXCH_RATE")) {
						key.setl_ERR_EXCH_RATE(msgKey.getKeyValue("l_ERR_EXCH_RATE"));
					}
					if(msgKeyType.containsKeyColumn("h_INSTALL_FLG")) {
						key.seth_INSTALL_FLG(msgKey.getKeyValue("h_INSTALL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_EXPENSE_CLASS_CD")) {
						key.setl_ERR_EXPENSE_CLASS_CD(msgKey.getKeyValue("l_ERR_EXPENSE_CLASS_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_DEPT_CD")) {
						key.setl_ERR_DEPT_CD(msgKey.getKeyValue("l_ERR_DEPT_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_PJ_CD")) {
						key.setl_ERR_PJ_CD(msgKey.getKeyValue("l_ERR_PJ_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_SEG_CONTENTS1")) {
						key.setl_ERR_SEG_CONTENTS1(msgKey.getKeyValue("l_ERR_SEG_CONTENTS1"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_SEG_CONTENTS2")) {
						key.setl_ERR_SEG_CONTENTS2(msgKey.getKeyValue("l_ERR_SEG_CONTENTS2"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_SEG_CONTENTS3")) {
						key.setl_ERR_SEG_CONTENTS3(msgKey.getKeyValue("l_ERR_SEG_CONTENTS3"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_SEG_CONTENTS4")) {
						key.setl_ERR_SEG_CONTENTS4(msgKey.getKeyValue("l_ERR_SEG_CONTENTS4"));
					}
					if(msgKeyType.containsKeyColumn("w_COLUMN_FLG")) {
						key.setw_COLUMN_FLG(msgKey.getKeyValue("w_COLUMN_FLG"));
					}
					if(msgKeyType.containsKeyColumn("L_PUCH_ODR_START_DATE")) {
						key.setL_PUCH_ODR_START_DATE(msgKey.getKeyValue("L_PUCH_ODR_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("L_JOB_ODR_CD")) {
						key.setL_JOB_ODR_CD(msgKey.getKeyValue("L_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("L_UNIT_COST_TYP")) {
						key.setL_UNIT_COST_TYP(msgKey.getKeyValue("L_UNIT_COST_TYP"));
					}
					if(msgKeyType.containsKeyColumn("L_UNIT_COST")) {
						key.setL_UNIT_COST(msgKey.getKeyValue("L_UNIT_COST"));
					}
					if(msgKeyType.containsKeyColumn("L_PROCESSING_COST")) {
						key.setL_PROCESSING_COST(msgKey.getKeyValue("L_PROCESSING_COST"));
					}
					if(msgKeyType.containsKeyColumn("L_MATERIAL_COST")) {
						key.setL_MATERIAL_COST(msgKey.getKeyValue("L_MATERIAL_COST"));
					}
					if(msgKeyType.containsKeyColumn("L_OTHER_OVERHEADS")) {
						key.setL_OTHER_OVERHEADS(msgKey.getKeyValue("L_OTHER_OVERHEADS"));
					}
					if(msgKeyType.containsKeyColumn("L_NET_AMOUNT")) {
						key.setL_NET_AMOUNT(msgKey.getKeyValue("L_NET_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("L_EXCH_RATE")) {
						key.setL_EXCH_RATE(msgKey.getKeyValue("L_EXCH_RATE"));
					}
					if(msgKeyType.containsKeyColumn("L_PUCH_ODR_QTY")) {
						key.setL_PUCH_ODR_QTY(msgKey.getKeyValue("L_PUCH_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP")) {
						key.setMRP_ODR_TYP(msgKey.getKeyValue("MRP_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("ACPT_INSPC_TYP")) {
						key.setACPT_INSPC_TYP(msgKey.getKeyValue("ACPT_INSPC_TYP"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP")) {
						key.setUNIT_QTY_TYP(msgKey.getKeyValue("UNIT_QTY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("FIXED_LT")) {
						key.setFIXED_LT(msgKey.getKeyValue("FIXED_LT"));
					}
					if(msgKeyType.containsKeyColumn("PROP_LT")) {
						key.setPROP_LT(msgKey.getKeyValue("PROP_LT"));
					}
					if(msgKeyType.containsKeyColumn("SAFETY_LT")) {
						key.setSAFETY_LT(msgKey.getKeyValue("SAFETY_LT"));
					}
					if(msgKeyType.containsKeyColumn("PROP_LOT_SIZE")) {
						key.setPROP_LOT_SIZE(msgKey.getKeyValue("PROP_LOT_SIZE"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("VEND_CD")) {
						key.setVEND_CD(msgKey.getKeyValue("VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("DEAL_STS_FLG")) {
						key.setDEAL_STS_FLG(msgKey.getKeyValue("DEAL_STS_FLG"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("WH_CD")) {
						key.setWH_CD(msgKey.getKeyValue("WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_STS_TYP")) {
						key.setJOB_ODR_STS_TYP(msgKey.getKeyValue("JOB_ODR_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_CD")) {
						key.setJOB_ODR_CD(msgKey.getKeyValue("JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("OD_NO")) {
						key.setOD_NO(msgKey.getKeyValue("OD_NO"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_DLV_DATE")) {
						key.setJOB_ODR_DLV_DATE(msgKey.getKeyValue("JOB_ODR_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("VALUE")) {
						key.setVALUE(msgKey.getKeyValue("VALUE"));
					}
					if(msgKeyType.containsKeyColumn("NAME")) {
						key.setNAME(msgKey.getKeyValue("NAME"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_CD")) {
						key.setPUCH_ODR_CD(msgKey.getKeyValue("PUCH_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("NON_NO_ITEM_NAME")) {
						key.setNON_NO_ITEM_NAME(msgKey.getKeyValue("NON_NO_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("NON_NO_ITEM_TYP")) {
						key.setNON_NO_ITEM_TYP(msgKey.getKeyValue("NON_NO_ITEM_TYP"));
					}
					if(msgKeyType.containsKeyColumn("COMPANY_CD")) {
						key.setCOMPANY_CD(msgKey.getKeyValue("COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_PERSON")) {
						key.setPUCH_ODR_PERSON(msgKey.getKeyValue("PUCH_ODR_PERSON"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_START_DATE")) {
						key.setPUCH_ODR_START_DATE(msgKey.getKeyValue("PUCH_ODR_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_DLV_DATE")) {
						key.setPUCH_ODR_DLV_DATE(msgKey.getKeyValue("PUCH_ODR_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_QTY")) {
						key.setPUCH_ODR_QTY(msgKey.getKeyValue("PUCH_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("NON_NO_ITEM_PUCH_ODR_UNIT")) {
						key.setNON_NO_ITEM_PUCH_ODR_UNIT(msgKey.getKeyValue("NON_NO_ITEM_PUCH_ODR_UNIT"));
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
					if(msgKeyType.containsKeyColumn("DISC_AMOUNT")) {
						key.setDISC_AMOUNT(msgKey.getKeyValue("DISC_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_AMOUNT")) {
						key.setPUCH_ODR_AMOUNT(msgKey.getKeyValue("PUCH_ODR_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("CONFIRM_DLV_DATE")) {
						key.setCONFIRM_DLV_DATE(msgKey.getKeyValue("CONFIRM_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("INV_CTRL_FLG")) {
						key.setINV_CTRL_FLG(msgKey.getKeyValue("INV_CTRL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_COMMENT")) {
						key.setPUCH_ODR_COMMENT(msgKey.getKeyValue("PUCH_ODR_COMMENT"));
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
					if(msgKeyType.containsKeyColumn("AMOUNT_INCLUDE_TAX")) {
						key.setAMOUNT_INCLUDE_TAX(msgKey.getKeyValue("AMOUNT_INCLUDE_TAX"));
					}
					if(msgKeyType.containsKeyColumn("HOME_CUR_AMOUNT")) {
						key.setHOME_CUR_AMOUNT(msgKey.getKeyValue("HOME_CUR_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("TAX_CD")) {
						key.setTAX_CD(msgKey.getKeyValue("TAX_CD"));
					}
					if(msgKeyType.containsKeyColumn("TAX_ROUND_TYP")) {
						key.setTAX_ROUND_TYP(msgKey.getKeyValue("TAX_ROUND_TYP"));
					}
					if(msgKeyType.containsKeyColumn("NON_NO_ITEM_FLG")) {
						key.setNON_NO_ITEM_FLG(msgKey.getKeyValue("NON_NO_ITEM_FLG"));
					}
					if(msgKeyType.containsKeyColumn("ACCT_CD")) {
						key.setACCT_CD(msgKey.getKeyValue("ACCT_CD"));
					}
					if(msgKeyType.containsKeyColumn("DEPT_CD")) {
						key.setDEPT_CD(msgKey.getKeyValue("DEPT_CD"));
					}
					if(msgKeyType.containsKeyColumn("PJ_CD")) {
						key.setPJ_CD(msgKey.getKeyValue("PJ_CD"));
					}
					if(msgKeyType.containsKeyColumn("SEG_CONTENTS1")) {
						key.setSEG_CONTENTS1(msgKey.getKeyValue("SEG_CONTENTS1"));
					}
					if(msgKeyType.containsKeyColumn("SEG_CONTENTS2")) {
						key.setSEG_CONTENTS2(msgKey.getKeyValue("SEG_CONTENTS2"));
					}
					if(msgKeyType.containsKeyColumn("SEG_CONTENTS3")) {
						key.setSEG_CONTENTS3(msgKey.getKeyValue("SEG_CONTENTS3"));
					}
					if(msgKeyType.containsKeyColumn("SEG_CONTENTS4")) {
						key.setSEG_CONTENTS4(msgKey.getKeyValue("SEG_CONTENTS4"));
					}
					if(msgKeyType.containsKeyColumn("ASP_INSTALL_FLG")) {
						key.setASP_INSTALL_FLG(msgKey.getKeyValue("ASP_INSTALL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("TIME_CTRL")) {
						key.setTIME_CTRL(msgKey.getKeyValue("TIME_CTRL"));
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
					if(msgKeyType.containsKeyColumn("VEND_DECIMAL_FIG")) {
						key.setVEND_DECIMAL_FIG(msgKey.getKeyValue("VEND_DECIMAL_FIG"));
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
					if(msgKeyType.containsKeyColumn("DEPT_NAME")) {
						key.setDEPT_NAME(msgKey.getKeyValue("DEPT_NAME"));
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
