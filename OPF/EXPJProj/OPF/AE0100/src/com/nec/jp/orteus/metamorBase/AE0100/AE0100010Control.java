/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AE0100/src/com/nec/jp/orteus/metamorBase/AE0100/AE0100010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AE0100;

import com.nec.jp.orteus.metamorBase.AE0100.*;
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
import com.nec.jp.orteus.expj.pr.rcvissue.process.ValidateWh;
import com.nec.jp.orteus.expj.pr.rcvissue.util.StringUtil;
import com.nec.jp.orteus.expj.lot.*;

import com.nec.jp.orteus.expj.pr.rcvissue.mst.ConsUnitCost;
import java.math.BigDecimal;
//}}user_implement_code_import

//{{user_implement_code_header
/**
 * CLASS     : AE0100010Control クラス
 * ファイル・クラス説明
 * @author $Author: zhou-kehong $
 * @version $Revision: 1.13 $ $Date: 2014/12/03 07:52:58 $
 *
 */
//}}user_implement_code_header

public class AE0100010Control
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
	public AE0100010Struct getListvalue(int x) { return (AE0100010Struct)(this.list.get(x)); }	// リストの値を返します。
	public AE0100010Struct getStruct() { return this.struct; }	// Structの値を返します。
	public AE0100010Struct createStruct() { return new AE0100010Struct(); }	// 新しいStructを作って返します。
	public void setStruct(Object structname) { this.struct.setStruct((AE0100010Struct)structname); }	// Structをセットします。
	public void initializeStruct() { this.struct.initialize(); }	// Structの値を初期化します。

	// CSV出力用リスト
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }
	// TODO: ユーザ定義のコードを記述してください
	
	/** [自社]情報 */
	private MyCompanyStruct _myCompanyStruct = new MyCompanyStruct();
	
	/** [コンボボックスデータ]情報（単価区分） */
	private ComboStruct _unitCostTypStruct = new ComboStruct();
	
	private String _rcvIssueCtrlCd = null;
	
    public AE0100010Struct struct_MODIFY_COUNT = new AE0100010Struct();
    public String str_LOT_CTRL_FLG="";
	/** システム導入フラグ*/
	private boolean _lotCtrlFlg;
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
	 * 業務ロジックのワーニングメッセージ設定処理を切り出して関数化
	 * @param code メッセージコード
	 */
	private void setWarningMessage(String code, String msg1, String msg2) {
		ExpjMessage emsg = new ExpjMessage(code, msg1, msg2);
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
	private void setStructSystemData(AE0100010Struct s) {
		s.setsOraganization_CD(struct.getsOrganization_CD());
		s.setsSysdate(struct.getsSysdate());
		s.setsUser_ID(struct.getsUser_ID());
	}
	
	/**
	 * 画面の全項目を初期化します。
	 */
	private void initializeAll() 
			throws SQLException, DataNotFoundException, FoundationException {
		
		struct.setONEROUS_CONS_NO(null);
		struct.seth_ONEROUS_CONS_NO(null);
		
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
		struct.setISSUE_QTY("0");
		struct.setSTOCK_UNIT(null);
		DateCtrlStruct dcs = DateCtrlControl.getData(conn, sysPLANT_CD);
		struct.setISSUE_DATE(dcs.getBUSINESS_OPR_DATE());
		struct.setRETURNED_WH_CD(null);
		struct.setWH_NAME(null);
		struct.setRETURNED_CAUSE_CD(null);
		struct.setVEND_LOT_NO(null);
		
		struct.setUNIT_COST_TYP("1");
		struct.setUNIT_COST("0");
		struct.setPUCH_ODR_AMOUNT("0");
		struct.setROUND_TYP(Kind.FLOOR);
		struct.setMODIFY_COUNT(null);
		struct.setVEND_DECIMAL_FIG("4");
		
		struct.setr1_FILTER("true");
		struct.setPUCH_ODR_CD(null);
		struct.setISSUE_INST_CD(null);
		
    struct.setONEROUS_CONS_COMMENT(null);
    struct.setVEND_CUR_UNIT(null);
        		
		struct.setSelectUnitCostFlag("false");
		
		// 買掛管理がインストールされている場合、当年月度を取得
		AE0100010Struct readStruct = new AE0100010Struct();
		List installOptionsList = entity.mSYS_INSTALL_OPTIONS.read(conn, readStruct);
		if (installOptionsList.size() > 0) {
			AE0100010Struct installOptionsStruct = (AE0100010Struct)installOptionsList.get(0);
			struct.setINSTALL_FLG(installOptionsStruct.getINSTALL_FLG());
		} else {
			struct.setINSTALL_FLG("0");
		}
		
		// 買掛管理がインストールされている場合、当年月度を取得
		if ("1".equals(struct.getINSTALL_FLG())) {
			List debtCtrlList = entity.mSYS_DEBT_CTRL.read(conn, readStruct);
			if (debtCtrlList.size() > 0) {
				AE0100010Struct debtCtrlStruct = (AE0100010Struct)debtCtrlList.get(0);
				struct.setTHIS_MONTH(debtCtrlStruct.getTHIS_MONTH());
			} else {
				setErrorMessage("AE00145");
			}
		}
		
		// 有償支給在庫管理区分が存在しない場合
		struct.setc_ONEROUS_CONS_INV_TYP(null);
		AE0100010Struct parameterStruct = new AE0100010Struct();
		parameterStruct.setNAME(sysPLANT_CD + "_ONEROUS_CONS_INV_TYP");
		List parameterList = entity.mSYS_PARAMETER.read(conn, parameterStruct);
		if (parameterList.isEmpty() == false) {
			parameterStruct = (AE0100010Struct)(parameterList.get(0));
			if ("TRUE".equals((parameterStruct.getVALUE()).toUpperCase())) {
				struct.setc_ONEROUS_CONS_INV_TYP("true");
			} else {
				struct.setc_ONEROUS_CONS_INV_TYP(null);
			}
		}
        struct.setLOT_NO(null);
        struct.seth_LOT_CTRL_FLG(null);
        struct.setLOT_MODIFY_COUNT(null);
        struct.seth_LOT_NO_2(null);
        struct.seth_LOT_NUMBERING_TYP(null);
        struct.setLOT_STOCK_ON_HAND_QTY(null);
        
		list = null;
		_rcvIssueCtrlCd = null;
		
		readStatus = INITIAL;
	}

	// 在庫更新処理
	private void updateStock(
			IDbConnection conn, 
			AE0100010Struct formStruct, 
			AE0100010Struct pastOnerousConsStruct, 
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
								"AE0100010Control",
								"controlInsert()",
								emsg.getMessage(CoreTools.getLocale(getsysUSER_CD())));
			}
		} catch(FoundationException ex) {
			// 登録処理失敗：入出庫管理番号（出庫）の採番に失敗しました
			setErrorMessage("AE00152");
			ExpjMessage emsg = new ExpjMessage("ZZ01106");
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(ex, emsg);
			throw ee;
		}
		
		if (mode == 1) {
			_rcvIssueCtrlCd = ctrlCd;
		}
		if (formStruct.getJOB_ODR_CD() == null || "".equals(formStruct.getJOB_ODR_CD())) {
			// 品目在庫更新
			updateItemStock(conn, formStruct, pastOnerousConsStruct, ctrlCd, mode);
		} else {
			// 製番在庫更新
			updateJobOdrCdStock(conn, formStruct, pastOnerousConsStruct, ctrlCd, mode);
		}
	}
	
	// 取引先保管区在庫更新処理
	private void updateVendWhStock(
			IDbConnection conn, 
			AE0100010Struct formStruct, 
			AE0100010Struct pastOnerousConsStruct, 
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
								"AE0100010Control",
								"controlInsert()",
								emsg.getMessage(CoreTools.getLocale(getsysUSER_CD())));
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
			updateItemStock(conn, formStruct, pastOnerousConsStruct, ctrlCd, mode);
		} else {
			// 製番在庫更新
			updateJobOdrCdStock(conn, formStruct, pastOnerousConsStruct, ctrlCd, mode);
		}
	}
	
	// 品目在庫更新処理
	private void updateItemStock(
			IDbConnection conn, 
			AE0100010Struct formStruct, 
			AE0100010Struct pastOnerousConsStruct, 
			String ctrlCd, 
			int mode) 
			throws ParseException, DataNotFoundException, SQLException, FoundationException, 
					ExpjException {
		
		String rcvIssueBeforeQty = "0";
		String rcvIssueQty = "0";
		String rcvIssueAterQty = "0";
		String stockOnHandQty = "0";
		
		AE0100010Struct stockStruct = null;
		
		// [保管区別品目在庫]の検索
		List stockList = null;
		
		AE0100010Struct searchStruct = new AE0100010Struct();
		if (mode == 1) {
			// 登録モード
			searchStruct.setITEM_CD(formStruct.getITEM_CD());
			searchStruct.setWH_CD(formStruct.getRETURNED_WH_CD());
			stockList = entity.mT_ITEM_STOCK.read(conn, searchStruct);
		} else if (mode == 11 || mode == 21 || mode == 31) {
			// 登録モード 取引先保管区在庫の更新
			searchStruct.setITEM_CD(formStruct.getITEM_CD());
			searchStruct.setVEND_CD(formStruct.getVEND_CD());
			searchStruct.setPLANT_CD(sysPLANT_CD);
			stockList = entity.mselectVEND_WH_ITEM_STOCK.read(conn, searchStruct);
		} else if (mode == 2) {
			// 返品先保管区のマイナス更新
			searchStruct.setITEM_CD(pastOnerousConsStruct.getITEM_CD());
			searchStruct.setWH_CD(pastOnerousConsStruct.getRETURNED_WH_CD());
			stockList = entity.mT_ITEM_STOCK.read(conn, searchStruct);
		} else {
			// 削除モード
			searchStruct.setITEM_CD(pastOnerousConsStruct.getITEM_CD());
			searchStruct.setWH_CD(pastOnerousConsStruct.getRETURNED_WH_CD());
			stockList = entity.mT_ITEM_STOCK.read(conn, searchStruct);
		}
		
		if (stockList.isEmpty()) {
			
			// 品目在庫追加
			rcvIssueBeforeQty = "0";
			if (mode == 1) {
				rcvIssueQty = formStruct.getISSUE_QTY();
			} else if (mode == 11) {
				// 取引先在庫更新 
				rcvIssueQty = Calculate.multiply(formStruct.getISSUE_QTY(), "-1");
			} else if (mode == 21) {
				// 取引先在庫更新 
				rcvIssueQty = Calculate.multiply(pastOnerousConsStruct.getISSUE_QTY(), "-1");
				stockOnHandQty = Calculate.subtract(
						Calculate.multiply(pastOnerousConsStruct.getISSUE_QTY(), "-1"), 
								formStruct.getISSUE_QTY());
			} else if (mode == 31) {
				// 取引先在庫更新 
				rcvIssueQty = Calculate.multiply(pastOnerousConsStruct.getISSUE_QTY(), "-1");
			} else if (mode == 2) {
				// 返品先保管区のマイナス更新 
				rcvIssueQty = Calculate.multiply(
						Calculate.multiply(pastOnerousConsStruct.getISSUE_QTY(), "-1"), "-1");
			} else {
				rcvIssueQty = Calculate.multiply(pastOnerousConsStruct.getISSUE_QTY(), "-1");
			}
			rcvIssueAterQty = rcvIssueQty;
			
			AE0100010Struct insertStruct = new AE0100010Struct();
			setStructSystemData(insertStruct);
			
			if (mode == 1) {
				insertStruct.setITEM_CD(formStruct.getITEM_CD());  // 品目番号
				insertStruct.setWH_CD(formStruct.getRETURNED_WH_CD());  // 返品先保管区コード
				insertStruct.setPLANT_CD(sysPLANT_CD);  // 工場コード
			} else if (mode == 11 || mode == 21 || mode == 31) {
				insertStruct.setITEM_CD(formStruct.getITEM_CD());  // 品目番号
				AE0100010Struct whStruct = new AE0100010Struct();
				whStruct.setVEND_CD(formStruct.getVEND_CD());
				whStruct.setPLANT_CD(sysPLANT_CD);
				List whList = entity.mM_WH.read(conn ,whStruct);
				if (whList.isEmpty()) {
					// エラー
				} else {
					whStruct = (AE0100010Struct)(whList.get(0));
					insertStruct.setWH_CD(whStruct.getWH_CD());  // 保管区コード
				}
				insertStruct.setPLANT_CD(sysPLANT_CD);  // 工場コード
			} else if (mode == 2) {
				insertStruct.setITEM_CD(pastOnerousConsStruct.getITEM_CD());  // 品目番号
				insertStruct.setWH_CD(pastOnerousConsStruct.getRETURNED_WH_CD());  // 返品先保管区コード
				insertStruct.setPLANT_CD(pastOnerousConsStruct.getPLANT_CD());  // 工場コード
			} else {
				insertStruct.setITEM_CD(pastOnerousConsStruct.getITEM_CD());  // 品目番号
				insertStruct.setWH_CD(pastOnerousConsStruct.getRETURNED_WH_CD());  // 返品先保管区コード
				insertStruct.setPLANT_CD(sysPLANT_CD);  // 工場コード
			}
			if (mode == 21) {
				insertStruct.setSTOCK_ON_HAND_QTY(stockOnHandQty);  // 品目別手持在庫数
			} else {
				insertStruct.setSTOCK_ON_HAND_QTY(rcvIssueAterQty);  // 品目別手持在庫数
			}
			
			insertStruct.setRCV_ISSUE_CTRL_CD(ctrlCd);
			
			entity.mT_ITEM_STOCK.create(conn, insertStruct);
			
		} else {
			
			// 品目在庫更新
			stockStruct = (AE0100010Struct)(stockList.get(0));
			rcvIssueBeforeQty = stockStruct.getSTOCK_ON_HAND_QTY();
			
			if (mode == 1) {
				rcvIssueQty = formStruct.getISSUE_QTY();
				rcvIssueAterQty = Calculate.add(
						stockStruct.getSTOCK_ON_HAND_QTY(), formStruct.getISSUE_QTY());
			} else if (mode == 11) {
				// 取引先保管区の在庫更新
				rcvIssueQty = Calculate.multiply(formStruct.getISSUE_QTY(), "-1");
				rcvIssueAterQty = Calculate.subtract(
						stockStruct.getSTOCK_ON_HAND_QTY(), formStruct.getISSUE_QTY());
			} else if (mode == 21) {
				// 取引先保管区の在庫更新
				rcvIssueQty = Calculate.multiply(pastOnerousConsStruct.getISSUE_QTY(), "-1");
				rcvIssueAterQty = Calculate.add(
						stockStruct.getSTOCK_ON_HAND_QTY(), 
								Calculate.multiply(pastOnerousConsStruct.getISSUE_QTY(), "-1"));
				stockOnHandQty = Calculate.subtract(
						rcvIssueAterQty, formStruct.getISSUE_QTY());
			} else if (mode == 31) {
				// 取引先保管区の在庫更新
				rcvIssueQty = Calculate.multiply(pastOnerousConsStruct.getISSUE_QTY(), "-1");
				rcvIssueAterQty = Calculate.add(
						stockStruct.getSTOCK_ON_HAND_QTY(), 
						Calculate.multiply(pastOnerousConsStruct.getISSUE_QTY(), "-1"));
			} else if (mode == 2) {
				rcvIssueQty = Calculate.multiply(
						Calculate.multiply(pastOnerousConsStruct.getISSUE_QTY(), "-1"), "-1");
				rcvIssueAterQty = Calculate.subtract(
						stockStruct.getSTOCK_ON_HAND_QTY(), 
						Calculate.multiply(pastOnerousConsStruct.getISSUE_QTY(), "-1"));
			} else {
				rcvIssueQty = Calculate.multiply(pastOnerousConsStruct.getISSUE_QTY(), "-1");
				rcvIssueAterQty = Calculate.add(
						stockStruct.getSTOCK_ON_HAND_QTY(), 
						Calculate.multiply(pastOnerousConsStruct.getISSUE_QTY(), "-1"));
			}
			
			AE0100010Struct updateStruct = new AE0100010Struct();
			setStructSystemData(updateStruct);
			if (mode == 1) {
				updateStruct.setITEM_CD(formStruct.getITEM_CD());
				updateStruct.setWH_CD(formStruct.getRETURNED_WH_CD());
			} else if (mode == 11 || mode == 21 || mode == 31) {
				updateStruct.setITEM_CD(formStruct.getITEM_CD());
				AE0100010Struct whStruct = new AE0100010Struct();
				whStruct.setVEND_CD(formStruct.getVEND_CD());
				whStruct.setPLANT_CD(sysPLANT_CD);
				List whList = entity.mM_WH.read(conn ,whStruct);
				if (whList.isEmpty()) {
					// エラー
				} else {
					whStruct = (AE0100010Struct)(whList.get(0));
					updateStruct.setWH_CD(whStruct.getWH_CD());  // 保管区コード
				}
			} else {
				updateStruct.setITEM_CD(pastOnerousConsStruct.getITEM_CD());
				updateStruct.setWH_CD(pastOnerousConsStruct.getRETURNED_WH_CD());
			}
			
			if (mode == 21) {
				updateStruct.setSTOCK_ON_HAND_QTY(stockOnHandQty);  // 品目別手持在庫数
			} else {
				updateStruct.setSTOCK_ON_HAND_QTY(rcvIssueAterQty);  // 品目別手持在庫数
			}
			
			entity.mT_ITEM_STOCK.update(conn, updateStruct);
			
		}
		
		// 計算後の品目手持在庫数がマイナスの場合、ワーニング
		if (Calculate.compare(rcvIssueAterQty, "0") == -1) {
			// マイナス更新の場合、または、プラス更新で「返品元保管区コード」と
			// [購入返品実績]."返品元保管区コード"が異なる場合
			if (mode != 2 || (mode == 2 
					&& (pastOnerousConsStruct.getRETURNED_WH_CD().equals(
							formStruct.getRETURNED_WH_CD()) == false))) {
				
				if (mode == 11 || mode == 21 || mode == 31) {
					setWarningMessage("AE00155");
				} else {
					setWarningMessage("AE00157");
				}
			}
		}
			
		// [保管区別入出庫]の追加
		addRcvIssue(conn, formStruct, pastOnerousConsStruct, 
				rcvIssueBeforeQty, rcvIssueQty, rcvIssueAterQty, ctrlCd, mode);
		
		if (mode == 21) {
			
			// 入出庫管理番号採番
			_rcvIssueCtrlCd = null;
			Numbering numbering = new Numbering(
									conn,
									Numbering.ISSUE_CD, 
									getsysUSER_CD(), 
									this.sp.getProcId(), 
									sysPLANT_CD);
			try {
				_rcvIssueCtrlCd = numbering.getNo();
				if (_rcvIssueCtrlCd == null) {
					ExpjMessage emsg = new ExpjMessage("AE00152");
					throw new FoundationException(
									"AE0100010Control",
									"controlInsert()",
									emsg.getMessage(CoreTools.getLocale(getsysUSER_CD())));
				}
			} catch(FoundationException ex) {
				// 登録処理失敗：入出庫管理番号（出庫）の採番に失敗しました
				setErrorMessage("AE00152");
				ExpjMessage emsg = new ExpjMessage("ZZ01106");
				sysLog.severe(emsg, getsysUSER_CD());
				ExpjException ee = new ExpjException(ex, emsg);
				throw ee;
			}
			
			if (stockStruct == null) {
				rcvIssueBeforeQty = Calculate.multiply(pastOnerousConsStruct.getISSUE_QTY(), "-1");
			} else {
				rcvIssueBeforeQty = Calculate.add(
						stockStruct.getSTOCK_ON_HAND_QTY(), 
						Calculate.multiply(pastOnerousConsStruct.getISSUE_QTY(), "-1"));
			}
			rcvIssueQty = Calculate.multiply(formStruct.getISSUE_QTY(), "-1");
			rcvIssueAterQty = Calculate.subtract(
					rcvIssueBeforeQty, formStruct.getISSUE_QTY());
			
			addRcvIssue(conn, formStruct, pastOnerousConsStruct, 
					rcvIssueBeforeQty, rcvIssueQty, rcvIssueAterQty, _rcvIssueCtrlCd, 22);
		}
	}
	
	// 製番在庫更新処理
	private void updateJobOdrCdStock(
			IDbConnection conn, 
			AE0100010Struct formStruct, 
			AE0100010Struct pastOnerousConsStruct, 
			String ctrlCd, 
			int mode) 
			throws ParseException, DataNotFoundException, SQLException, FoundationException, 
			ExpjException {
		
		String rcvIssueBeforeQty = "0";
		String rcvIssueQty = "0";
		String rcvIssueAterQty = "0";
		String stockOnHandQty = "0";
		
		AE0100010Struct stockStruct = null;
		
		// [保管区別製番在庫]の検索
		
		AE0100010Struct searchStruct = new AE0100010Struct();
		List stockList = null;
		if (mode == 1) {
			searchStruct.setJOB_ODR_CD(formStruct.getJOB_ODR_CD());
			searchStruct.setITEM_CD(formStruct.getITEM_CD());
			searchStruct.setWH_CD(formStruct.getRETURNED_WH_CD());
			stockList = entity.mT_JOB_ODR_CD_STOCK.read(conn, searchStruct);
		} else if (mode == 11 || mode == 21 || mode == 31) {
			searchStruct.setJOB_ODR_CD(formStruct.getJOB_ODR_CD());
			searchStruct.setITEM_CD(formStruct.getITEM_CD());
			searchStruct.setVEND_CD(formStruct.getVEND_CD());
			searchStruct.setPLANT_CD(sysPLANT_CD);
			stockList = entity.mselectVEND_WH_JOB_ODR_CD_STOCK.read(conn, searchStruct);
		} else if (mode == 2) {
			searchStruct.setJOB_ODR_CD(pastOnerousConsStruct.getJOB_ODR_CD());
			searchStruct.setJOB_ODR_DETAIL_NO(pastOnerousConsStruct.getJOB_ODR_DETAIL_NO());
			searchStruct.setITEM_CD(pastOnerousConsStruct.getITEM_CD());
			searchStruct.setWH_CD(pastOnerousConsStruct.getRETURNED_WH_CD());
			stockList = entity.mT_JOB_ODR_CD_STOCK.read(conn, searchStruct);
		} else {
			searchStruct.setJOB_ODR_CD(pastOnerousConsStruct.getJOB_ODR_CD());
			searchStruct.setITEM_CD(pastOnerousConsStruct.getITEM_CD());
			searchStruct.setWH_CD(pastOnerousConsStruct.getWH_CD());
			stockList = entity.mT_JOB_ODR_CD_STOCK.read(conn, searchStruct);
		}
		
		if (stockList.isEmpty()) {
			
			// 製番在庫追加
			rcvIssueBeforeQty = "0";
			if (mode == 1) {
				rcvIssueQty = formStruct.getISSUE_QTY();
			} else if (mode == 11) {
				rcvIssueQty = Calculate.multiply(formStruct.getISSUE_QTY(), "-1");
			} else if (mode == 21) {
				// 取引先在庫更新 
				rcvIssueQty = Calculate.multiply(pastOnerousConsStruct.getISSUE_QTY(), "-1");
				stockOnHandQty = Calculate.subtract(
						Calculate.multiply(pastOnerousConsStruct.getISSUE_QTY(), "-1"), 
						formStruct.getISSUE_QTY());
			} else if (mode == 31) {
				// 取引先在庫更新 
				rcvIssueQty = Calculate.multiply(pastOnerousConsStruct.getISSUE_QTY(), "-1");
			} else if (mode == 2) {
				// 返品先保管区のマイナス更新 
				rcvIssueQty = Calculate.multiply(Calculate.multiply(
						pastOnerousConsStruct.getISSUE_QTY(), "-1"), "-1");
			} else {
				rcvIssueQty = Calculate.multiply(pastOnerousConsStruct.getISSUE_QTY(), "-1");
			}
			rcvIssueAterQty = rcvIssueQty;
			
			AE0100010Struct insertStruct = new AE0100010Struct();
			setStructSystemData(insertStruct);
			
			if (mode == 1) {
				insertStruct.setJOB_ODR_CD(formStruct.getJOB_ODR_CD());  // 製番
				insertStruct.setITEM_CD(formStruct.getITEM_CD());  // 品目番号
				insertStruct.setWH_CD(formStruct.getRETURNED_WH_CD());  // 返品元保管区コード
				insertStruct.setPLANT_CD(sysPLANT_CD);  // 工場コード
			} else if (mode == 2) {
				insertStruct.setJOB_ODR_CD(pastOnerousConsStruct.getJOB_ODR_CD());  // 製番
				insertStruct.setITEM_CD(pastOnerousConsStruct.getITEM_CD());  // 品目番号
				insertStruct.setWH_CD(pastOnerousConsStruct.getRETURNED_WH_CD());  // 返品元保管区コード
				insertStruct.setPLANT_CD(pastOnerousConsStruct.getPLANT_CD());  // 工場コード
			} else if (mode == 11 || mode == 21 || mode == 31) {
				insertStruct.setJOB_ODR_CD(formStruct.getJOB_ODR_CD());  // 製番
				insertStruct.setITEM_CD(formStruct.getITEM_CD());  // 品目番号
				
				AE0100010Struct whStruct = new AE0100010Struct();
				whStruct.setVEND_CD(formStruct.getVEND_CD());
				whStruct.setPLANT_CD(sysPLANT_CD);
				List whList = entity.mM_WH.read(conn ,whStruct);
				if (whList.isEmpty()) {
					// エラー
				} else {
					whStruct = (AE0100010Struct)(whList.get(0));
					insertStruct.setWH_CD(whStruct.getWH_CD());  // 保管区コード
				}
				insertStruct.setPLANT_CD(sysPLANT_CD);  // 工場コード
			} else {
				insertStruct.setJOB_ODR_CD(pastOnerousConsStruct.getJOB_ODR_CD());  // 製番
				insertStruct.setITEM_CD(pastOnerousConsStruct.getITEM_CD());  // 品目番号
				insertStruct.setWH_CD(pastOnerousConsStruct.getRETURNED_WH_CD());  // 返品元保管区コード
				insertStruct.setPLANT_CD(sysPLANT_CD);  // 工場コード
			}
			if (mode == 21) {
				insertStruct.setSTOCK_ON_HAND_QTY(stockOnHandQty);  // 製番別手持在庫数
			} else {
				insertStruct.setSTOCK_ON_HAND_QTY(rcvIssueAterQty);  // 製番別手持在庫数
			}
			
			entity.mT_JOB_ODR_CD_STOCK.create(conn, insertStruct);
			
		} else {
			
			// 製番在庫更新
			stockStruct = (AE0100010Struct)(stockList.get(0));
			rcvIssueBeforeQty = stockStruct.getSTOCK_ON_HAND_QTY();
			if (mode == 1) {
				rcvIssueQty = formStruct.getISSUE_QTY();
				rcvIssueAterQty = Calculate.add(
						stockStruct.getSTOCK_ON_HAND_QTY(), formStruct.getISSUE_QTY());
			} else if (mode == 11) {
				rcvIssueQty = Calculate.multiply(formStruct.getISSUE_QTY(), "-1");
				rcvIssueAterQty = Calculate.subtract(
						stockStruct.getSTOCK_ON_HAND_QTY(), formStruct.getISSUE_QTY());
			} else if (mode == 21) {
				rcvIssueQty = Calculate.multiply(pastOnerousConsStruct.getISSUE_QTY(), "-1");
				rcvIssueAterQty = Calculate.add(
						stockStruct.getSTOCK_ON_HAND_QTY(), 
						Calculate.multiply(pastOnerousConsStruct.getISSUE_QTY(), "-1"));
				stockOnHandQty = Calculate.subtract(
						rcvIssueAterQty, formStruct.getISSUE_QTY());
			} else if (mode == 31) {
				rcvIssueQty = Calculate.multiply(pastOnerousConsStruct.getISSUE_QTY(), "-1");
				rcvIssueAterQty = Calculate.add(
						stockStruct.getSTOCK_ON_HAND_QTY(), 
						Calculate.multiply(pastOnerousConsStruct.getISSUE_QTY(), "-1"));
			} else if (mode == 2) {
				rcvIssueQty = Calculate.multiply(
						Calculate.multiply(pastOnerousConsStruct.getISSUE_QTY(), "-1"), "-1");
				rcvIssueAterQty = Calculate.subtract(
						stockStruct.getSTOCK_ON_HAND_QTY(), 
						Calculate.multiply(pastOnerousConsStruct.getISSUE_QTY(), "-1"));
			} else {
				rcvIssueQty = Calculate.multiply(pastOnerousConsStruct.getISSUE_QTY(), "-1");
				rcvIssueAterQty = Calculate.add(
						stockStruct.getSTOCK_ON_HAND_QTY(), 
						Calculate.multiply(pastOnerousConsStruct.getISSUE_QTY(), "-1"));
			}
			
			AE0100010Struct updateStruct = new AE0100010Struct();
			setStructSystemData(updateStruct);
			
			if (mode == 1) {
				updateStruct.setJOB_ODR_CD(formStruct.getJOB_ODR_CD());  // 製番
				updateStruct.setITEM_CD(formStruct.getITEM_CD());  // 品目番号
				updateStruct.setWH_CD(formStruct.getRETURNED_WH_CD());  // 返品元保管区コード
			} else if (mode == 11 || mode == 21 || mode == 31) {
				updateStruct.setJOB_ODR_CD(formStruct.getJOB_ODR_CD());  // 製番
				updateStruct.setITEM_CD(formStruct.getITEM_CD());  // 品目番号
				AE0100010Struct whStruct = new AE0100010Struct();
				whStruct.setVEND_CD(formStruct.getVEND_CD());
				whStruct.setPLANT_CD(sysPLANT_CD);
				List whList = entity.mM_WH.read(conn ,whStruct);
				if (whList.isEmpty()) {
					// エラー
				} else {
					whStruct = (AE0100010Struct)(whList.get(0));
					updateStruct.setWH_CD(whStruct.getWH_CD());  // 返品元保管区コード
				}
			} else if (mode == 2) {
				updateStruct.setJOB_ODR_CD(pastOnerousConsStruct.getJOB_ODR_CD());  // 製番
				updateStruct.setJOB_ODR_DETAIL_NO(
						pastOnerousConsStruct.getJOB_ODR_DETAIL_NO());  // 製番枝番
				updateStruct.setITEM_CD(pastOnerousConsStruct.getITEM_CD());  // 品目番号
				updateStruct.setWH_CD(pastOnerousConsStruct.getRETURNED_WH_CD());  // 返品元保管区コード
			} else {
				updateStruct.setJOB_ODR_CD(pastOnerousConsStruct.getJOB_ODR_CD());  // 製番
				updateStruct.setJOB_ODR_DETAIL_NO(
						pastOnerousConsStruct.getJOB_ODR_DETAIL_NO());  // 製番枝番
				updateStruct.setITEM_CD(pastOnerousConsStruct.getITEM_CD());  // 品目番号
				updateStruct.setWH_CD(pastOnerousConsStruct.getRETURNED_WH_CD());  // 返品元保管区コード
			}
			
			if (mode == 21) {
				updateStruct.setSTOCK_ON_HAND_QTY(stockOnHandQty);  // 製番別手持在庫数
			} else {
				updateStruct.setSTOCK_ON_HAND_QTY(rcvIssueAterQty);  // 製番別手持在庫数
			}
			
			entity.mT_JOB_ODR_CD_STOCK.update(conn, updateStruct);
		}
		
		// 計算後の品目手持在庫数がマイナスの場合、ワーニング
		if (Calculate.compare(rcvIssueAterQty, "0") == -1) {
			// マイナス更新の場合、または、プラス更新で「返品元保管区コード」と
			// [購入返品実績]."返品元保管区コード"が異なる場合
			if (mode != 2 || (mode == 2 && (pastOnerousConsStruct.getRETURNED_WH_CD().equals(
					formStruct.getRETURNED_WH_CD()) == false))) {
				
				if (mode == 11 || mode == 21 || mode == 31) {
					setWarningMessage("AE00155");
				} else {
					setWarningMessage("AE00157");
				}
			}
		}
		
		// [保管区別入出庫]の追加
		addRcvIssue(conn, formStruct, pastOnerousConsStruct, 
				rcvIssueBeforeQty, rcvIssueQty, rcvIssueAterQty, ctrlCd, mode);
				
		if (mode == 21) {
			
			// 入出庫管理番号採番
			_rcvIssueCtrlCd = null;
			Numbering numbering = new Numbering(
									conn,
									Numbering.ISSUE_CD, 
									getsysUSER_CD(), 
									this.sp.getProcId(), 
									sysPLANT_CD);
			try {
				_rcvIssueCtrlCd = numbering.getNo();
				if (_rcvIssueCtrlCd == null) {
					ExpjMessage emsg = new ExpjMessage("AE00152");
					throw new FoundationException(
									"AE0100010Control",
									"controlInsert()",
									emsg.getMessage(CoreTools.getLocale(getsysUSER_CD())));
				}
			} catch(FoundationException ex) {
				// 登録処理失敗：入出庫管理番号（出庫）の採番に失敗しました
				setErrorMessage("AE00152");
				ExpjMessage emsg = new ExpjMessage("ZZ01106");
				sysLog.severe(emsg, getsysUSER_CD());
				ExpjException ee = new ExpjException(ex, emsg);
				throw ee;
			}
			
			if (stockStruct == null) {
				rcvIssueBeforeQty = Calculate.multiply(pastOnerousConsStruct.getISSUE_QTY(), "-1");
			} else {
				rcvIssueBeforeQty = Calculate.add(
						stockStruct.getSTOCK_ON_HAND_QTY(), 
						Calculate.multiply(pastOnerousConsStruct.getISSUE_QTY(), "-1"));
			}
			rcvIssueQty = Calculate.multiply(formStruct.getISSUE_QTY(), "-1");
			rcvIssueAterQty = Calculate.subtract(
					rcvIssueBeforeQty, formStruct.getISSUE_QTY());
			
			addRcvIssue(conn, formStruct, pastOnerousConsStruct, 
					rcvIssueBeforeQty, rcvIssueQty, rcvIssueAterQty, _rcvIssueCtrlCd, 22);
		}
	}
	
	// 保管区別入出庫追加
	private void addRcvIssue(
			IDbConnection conn, 
			AE0100010Struct formStruct, 
			AE0100010Struct pastOnerousConsStruct, 
			String rcvIssueBeforeQty, 
			String rcvIssueQty, 
			String rcvIssueAterQty, 
			String ctrlCd, 
			int mode) 
			throws ParseException, DataNotFoundException, SQLException, FoundationException {
		
		// [保管区別入出庫]の追加
		AE0100010Struct insertStruct = new AE0100010Struct();
		setStructSystemData(insertStruct);
		
		// 追加内容設定
		insertStruct.setRCV_ISSUE_CTRL_CD(ctrlCd);  // 入出庫管理番号
		if (mode == 1) {
			insertStruct.setRCV_ISSUE_TYP("2");  // 入出庫区分
			insertStruct.setITEM_CD(formStruct.getITEM_CD());  // 品目番号
			insertStruct.setPLANT_CD(sysPLANT_CD);  // 工場コード
			insertStruct.setWH_CD(formStruct.getRETURNED_WH_CD());  // 保管区コード
			insertStruct.setJOB_ODR_CD(formStruct.getJOB_ODR_CD());  // 製番
			insertStruct.setJOB_ODR_DETAIL_NO("0");  // 製番枝番
			insertStruct.setVEND_LOT_NO(formStruct.getVEND_LOT_NO());  // メーカロット番号
			insertStruct.setRCV_ISSUE_DATE(formStruct.getISSUE_DATE());  // 入出庫年月日
			if (Calculate.compare(formStruct.getISSUE_QTY(), "0") < 0) {
				insertStruct.setRCV_ISSUE_GNR_TYP("21");  // 入出庫発生区分
			} else {
				insertStruct.setRCV_ISSUE_GNR_TYP("29");  // 入出庫発生区分
			}
			insertStruct.setCOMPANY_CD(_myCompanyStruct.getCOMPANY_CD());  // 会社コード
			insertStruct.setVEND_CD(formStruct.getVEND_CD());  // 取引先コード
            insertStruct.setLOT_NO(formStruct.getLOT_NO());   //在庫ロット番号
		} else if (mode == 11) {
			insertStruct.setRCV_ISSUE_TYP("1");  // 入出庫区分
			insertStruct.setITEM_CD(formStruct.getITEM_CD());  // 品目番号
			insertStruct.setPLANT_CD(sysPLANT_CD);  // 工場コード
			AE0100010Struct whStruct = new AE0100010Struct();
			whStruct.setVEND_CD(formStruct.getVEND_CD());
			whStruct.setPLANT_CD(sysPLANT_CD);
			List whList = entity.mM_WH.read(conn, whStruct);
			if (whList.isEmpty()) {
				// エラー
			} else {
				whStruct = (AE0100010Struct)(whList.get(0));
				insertStruct.setWH_CD(whStruct.getWH_CD());  // 保管区コード
			}
			
			insertStruct.setJOB_ODR_CD(formStruct.getJOB_ODR_CD());  // 製番
			insertStruct.setJOB_ODR_DETAIL_NO("0");  // 製番枝番
			if (Calculate.compare(formStruct.getISSUE_QTY(), "0") < 0) {
				insertStruct.setRCV_ISSUE_GNR_TYP("81");  // 入出庫発生区分
			} else {
				insertStruct.setRCV_ISSUE_GNR_TYP("89");  // 入出庫発生区分
			}
			insertStruct.setRCV_ISSUE_DATE(formStruct.getISSUE_DATE());  // 入出庫年月日
			insertStruct.setVEND_LOT_NO(formStruct.getVEND_LOT_NO());  // メーカロット番号
			insertStruct.setCOMPANY_CD(_myCompanyStruct.getCOMPANY_CD());  // 会社コード
			insertStruct.setVEND_CD(formStruct.getVEND_CD());  // 取引先コード
            insertStruct.setLOT_NO(formStruct.getLOT_NO());   //在庫ロット番号
		} else if (mode == 21) {
			insertStruct.setRCV_ISSUE_TYP("1");  // 入出庫区分
			insertStruct.setITEM_CD(formStruct.getITEM_CD());  // 品目番号
			insertStruct.setPLANT_CD(sysPLANT_CD);  // 工場コード
			AE0100010Struct whStruct = new AE0100010Struct();
			whStruct.setVEND_CD(formStruct.getVEND_CD());
			whStruct.setPLANT_CD(sysPLANT_CD);
			List whList = entity.mM_WH.read(conn, whStruct);
			if (whList.isEmpty()) {
				// エラー
			} else {
				whStruct = (AE0100010Struct)(whList.get(0));
				insertStruct.setWH_CD(whStruct.getWH_CD());  // 保管区コード
			}
			insertStruct.setJOB_ODR_CD(formStruct.getJOB_ODR_CD());  // 製番
			insertStruct.setJOB_ODR_DETAIL_NO("0");  // 製番枝番
			if (Calculate.compare(pastOnerousConsStruct.getISSUE_QTY(), "0") < 0) {
				insertStruct.setRCV_ISSUE_GNR_TYP("81");  // 入出庫発生区分
			} else {
				insertStruct.setRCV_ISSUE_GNR_TYP("89");  // 入出庫発生区分
			}
			insertStruct.setRCV_ISSUE_DATE(formStruct.getISSUE_DATE());  // 入出庫年月日
			insertStruct.setVEND_LOT_NO(formStruct.getVEND_LOT_NO());  // メーカロット番号
			insertStruct.setCOMPANY_CD(_myCompanyStruct.getCOMPANY_CD());  // 会社コード
			insertStruct.setVEND_CD(formStruct.getVEND_CD());  // 取引先コード
            insertStruct.setLOT_NO(pastOnerousConsStruct.getLOT_NO());   //在庫ロット番号
		} else if (mode == 22) {
			insertStruct.setRCV_ISSUE_TYP("1");  // 入出庫区分
			insertStruct.setITEM_CD(formStruct.getITEM_CD());  // 品目番号
			insertStruct.setPLANT_CD(sysPLANT_CD);  // 工場コード
			AE0100010Struct whStruct = new AE0100010Struct();
			whStruct.setVEND_CD(formStruct.getVEND_CD());
			whStruct.setPLANT_CD(sysPLANT_CD);
			List whList = entity.mM_WH.read(conn, whStruct);
			if (whList.isEmpty()) {
				// エラー
			} else {
				whStruct = (AE0100010Struct)(whList.get(0));
				insertStruct.setWH_CD(whStruct.getWH_CD());  // 保管区コード
			}
			insertStruct.setJOB_ODR_CD(formStruct.getJOB_ODR_CD());  // 製番
			insertStruct.setJOB_ODR_DETAIL_NO("0");  // 製番枝番
			if (Calculate.compare(formStruct.getISSUE_QTY(), "0") < 0) {
				insertStruct.setRCV_ISSUE_GNR_TYP("81");  // 入出庫発生区分
			} else {
				insertStruct.setRCV_ISSUE_GNR_TYP("89");  // 入出庫発生区分
			}
			insertStruct.setRCV_ISSUE_DATE(formStruct.getISSUE_DATE());  // 入出庫年月日
			insertStruct.setVEND_LOT_NO(formStruct.getVEND_LOT_NO());  // メーカロット番号
			insertStruct.setCOMPANY_CD(_myCompanyStruct.getCOMPANY_CD());  // 会社コード
			insertStruct.setVEND_CD(formStruct.getVEND_CD());  // 取引先コード
            insertStruct.setLOT_NO(formStruct.getLOT_NO());   //在庫ロット番号
		} else if (mode == 31) {
			insertStruct.setRCV_ISSUE_TYP("1");  // 入出庫区分
			insertStruct.setITEM_CD(formStruct.getITEM_CD());  // 品目番号
			insertStruct.setPLANT_CD(sysPLANT_CD);  // 工場コード
			AE0100010Struct whStruct = new AE0100010Struct();
			whStruct.setVEND_CD(formStruct.getVEND_CD());
			whStruct.setPLANT_CD(sysPLANT_CD);
			List whList = entity.mM_WH.read(conn, whStruct);
			if (whList.isEmpty()) {
				// エラー
			} else {
				whStruct = (AE0100010Struct)(whList.get(0));
				insertStruct.setWH_CD(whStruct.getWH_CD());  // 保管区コード
			}
			insertStruct.setJOB_ODR_CD(formStruct.getJOB_ODR_CD());  // 製番
			insertStruct.setJOB_ODR_DETAIL_NO("0");  // 製番枝番
			if (Calculate.compare(pastOnerousConsStruct.getISSUE_QTY(), "0") < 0) {
				insertStruct.setRCV_ISSUE_GNR_TYP("81");  // 入出庫発生区分
			} else {
				insertStruct.setRCV_ISSUE_GNR_TYP("89");  // 入出庫発生区分
			}
			DateCtrlStruct dcs = DateCtrlControl.getData(conn, sysPLANT_CD);
			insertStruct.setRCV_ISSUE_DATE(dcs.getBUSINESS_OPR_DATE());  // 入出庫年月日
			insertStruct.setVEND_LOT_NO(formStruct.getVEND_LOT_NO());  // メーカロット番号
			insertStruct.setCOMPANY_CD(_myCompanyStruct.getCOMPANY_CD());  // 会社コード
			insertStruct.setVEND_CD(formStruct.getVEND_CD());  // 取引先コード
            insertStruct.setLOT_NO(pastOnerousConsStruct.getLOT_NO());   //在庫ロット番号
		} else if (mode == 2) {
			insertStruct.setRCV_ISSUE_TYP("2");  // 入出庫区分
			insertStruct.setITEM_CD(pastOnerousConsStruct.getITEM_CD());  // 品目番号
			insertStruct.setPLANT_CD(pastOnerousConsStruct.getPLANT_CD());  // 工場コード
			insertStruct.setWH_CD(pastOnerousConsStruct.getRETURNED_WH_CD());  // 保管区コード
			insertStruct.setJOB_ODR_CD(pastOnerousConsStruct.getJOB_ODR_CD());  // 製番
			insertStruct.setJOB_ODR_DETAIL_NO(
					pastOnerousConsStruct.getJOB_ODR_DETAIL_NO());  // 製番枝番
			insertStruct.setVEND_LOT_NO(pastOnerousConsStruct.getVEND_LOT_NO());  // メーカロット番号
			insertStruct.setRCV_ISSUE_DATE(formStruct.getISSUE_DATE());  // 入出庫年月日
			if (Calculate.compare(pastOnerousConsStruct.getISSUE_QTY(), "0") < 0) {
				insertStruct.setRCV_ISSUE_GNR_TYP("21");  // 入出庫発生区分
			} else {
				insertStruct.setRCV_ISSUE_GNR_TYP("29");  // 入出庫発生区分
			}
			insertStruct.setCOMPANY_CD(pastOnerousConsStruct.getCOMPANY_CD());  // 会社コード
			insertStruct.setVEND_CD(pastOnerousConsStruct.getVEND_CD());  // 取引先コード
            insertStruct.setLOT_NO(pastOnerousConsStruct.getLOT_NO());   //在庫ロット番号
		} else {
			insertStruct.setRCV_ISSUE_TYP("2");  // 入出庫区分
			insertStruct.setITEM_CD(pastOnerousConsStruct.getITEM_CD());  // 品目番号
			insertStruct.setPLANT_CD(pastOnerousConsStruct.getPLANT_CD());  // 工場コード
			insertStruct.setWH_CD(pastOnerousConsStruct.getRETURNED_WH_CD());  // 保管区コード
			insertStruct.setJOB_ODR_CD(pastOnerousConsStruct.getJOB_ODR_CD());  // 製番
			insertStruct.setJOB_ODR_DETAIL_NO(
					pastOnerousConsStruct.getJOB_ODR_DETAIL_NO());  // 製番枝番
			insertStruct.setVEND_LOT_NO(pastOnerousConsStruct.getVEND_LOT_NO());  // メーカロット番号
			insertStruct.setRCV_ISSUE_DATE(formStruct.getISSUE_DATE());  // 入出庫年月日
			insertStruct.setRCV_ISSUE_GNR_TYP("11");  // 入出庫発生区分
			insertStruct.setCOMPANY_CD(pastOnerousConsStruct.getCOMPANY_CD());  // 会社コード
			insertStruct.setVEND_CD(pastOnerousConsStruct.getVEND_CD());  // 取引先コード
            insertStruct.setLOT_NO(pastOnerousConsStruct.getLOT_NO());   //在庫ロット番号
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
		insertStruct.setCONS_TYP("1");  // 支給区分  2006/06/02 支給区分を1:有償支給に変更
        //会社コード
		if("".equals(insertStruct.getCOMPANY_CD()) || insertStruct.getCOMPANY_CD() == null){
			insertStruct.setCOMPANY_CD(SystemInformation.getSysMyCompanyCd());
		}
		entity.mT_RCV_ISSUE.create(conn, insertStruct);
        call_excUpdateLotStockFd(conn, formStruct, pastOnerousConsStruct,ctrlCd, mode);
	}

	/**
	 * システムパラメータ取得
	 */
	private boolean getSysParameter() throws BusinessProcessException, FoundationException {
		boolean b = true;
		try {
			List sysParameterList = entity.mSELECT_SYS_PARAMETER.read(conn, struct);
			if(sysParameterList == null || sysParameterList.isEmpty()) return b;
			AE0100010Struct sysParameterStruct = (AE0100010Struct) sysParameterList.get(0);
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
			AE0100010Struct procExecDateStruct = (AE0100010Struct) procExecDateList.get(0);
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
    private String add_callgetsetLotNumberingFd(AE0100010Struct itemStruct) throws FoundationException
    {
        String result1=null;
        
        // ③ 在庫ロット番号採番処理
        // [品目]．”ロット管理フラグ”＝ 1(ロットトレース管理を行う。) 、
        // [品目]．”ロット番号採番区分”＝ 1:自動採番する。(連番） 
        // [品目]．”ロット番号採番区分”＝ 2:日単位採番 
        // [画面]．｢在庫ロット番号｣ ＝空白　場合下記採番処理を行う。
        if("1".equals(itemStruct.geth_LOT_CTRL_FLG())== true
                && ("0".equals(itemStruct.geth_LOT_NUMBERING_TYP())== false)
                        && (struct.getLOT_NO()== null || "".equals(struct.getLOT_NO()))
                        && !"true".equals(struct.getc_ONEROUS_CONS_INV_TYP()))
        {
            // 在庫ロット番号の自動採番を行う。
            String str_ITEM_CD = struct.getITEM_CD();                       //品目番号
            String str_ISSUE_DATE = struct.getISSUE_DATE();                 //返品日
            
            BizCommon bc = new BizCommon(conn, getsysUSER_CD(), "AE2100010", getsysPLANT_CD());
            List resultList = bc.getsetLotNumberingFd(str_ITEM_CD, str_ISSUE_DATE);
            if(bc.getResultStatus().intValue() == 1){
                if(resultList != null && resultList.size() > 0){
                    result1 = (String)resultList.get(0);
                    struct.setLOT_NO(result1);
                    }
                }else{
                    if(resultList != null && resultList.size() > 1){
                        String result2 = (String)resultList.get(1);
                        setErrorMessage(result2);
                   }
                }
        }
        return result1;
    }

    //ロット品目在庫登録・更新処理
    private void call_excUpdateLotStockFd(
            IDbConnection conn, 
            AE0100010Struct formStruct, 
            AE0100010Struct pastOnerousConsStruct, 
            String ctrlCd,                                  //入出庫管理番号
            int mode)
            throws ParseException, DataNotFoundException, SQLException, FoundationException{
       
        // ロット品目在庫登録・更新処理を行う
        if(mode == 2 || mode == 21 || mode==31 || mode==22)
        {
            if((str_LOT_CTRL_FLG!=null && str_LOT_CTRL_FLG.equals("1"))
                    && (pastOnerousConsStruct.getLOT_NO()!=null 
                            && !"".equals(pastOnerousConsStruct.getLOT_NO())))
            {
                //ロット別品目在庫登録・更新処理を行う。
                BizCommon bc = new BizCommon(conn, getsysUSER_CD(), sp.getProcId(), getsysPLANT_CD());
                List updateLotStockList = bc.excUpdateLotStockFd(ctrlCd, "");
                if(bc.getResultStatus().intValue() == 3){
                    if(updateLotStockList != null && updateLotStockList.size() > 0){
                            setErrorMessage((String)updateLotStockList.get(0));
                            return;
                    }else{   
                    }
                }
            }
        }
        else
        {
            if(str_LOT_CTRL_FLG!=null && str_LOT_CTRL_FLG.equals("1"))
            {
                //ロット別品目在庫登録・更新処理を行う。
                BizCommon bc = new BizCommon(conn, getsysUSER_CD(), sp.getProcId(), getsysPLANT_CD());
                List updateLotStockList = bc.excUpdateLotStockFd(ctrlCd, "");
                if(bc.getResultStatus().intValue() == 3){
                    if(updateLotStockList != null && updateLotStockList.size() > 0){
                            setErrorMessage((String)updateLotStockList.get(0));
                            return;
                    }else{
                    }
                }
            }
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
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0100");
		logger.entering("AE0100010Control"+":USER="+struct.getsUser_ID(),"controlSelect");
			//{{user_implement_dev:<controlSelect>
			// TODO: ユーザ定義のコードを記述してください
		try {
			
			// キーを退避
			String onerousConsNo = struct.getONEROUS_CONS_NO();
			
			// キー以外の項目を初期化
			initializeDetail();
			
			struct.setCOMPANY_CD(_myCompanyStruct.getCOMPANY_CD());
			
			// [有償支給履歴]に対象データが存在しない場合エラー
			List pastOnerousConsList = entity.mT_PAST_ONEROUS_CONS.read(conn, struct);
			if (pastOnerousConsList.isEmpty()) {
				setErrorMessage("ZZ06001");
				setErrorParameter("T_PAST_ONEROUS_CONS", "ONEROUS_CONS_NO", struct.getONEROUS_CONS_NO());
				return;
			}
			
			AE0100010Struct pastOnerousConsStruct = (AE0100010Struct)(pastOnerousConsList.get(0));
			
			// [有償支給履歴]."工場コード" ≠ ログインユーザの工場コード の場合エラー
			if (sysPLANT_CD.equals(pastOnerousConsStruct.getPLANT_CD()) == false) {
				setErrorMessage("AE00138");
				setErrorParameter("T_PAST_ONEROUS_CONS", "ONEROUS_CONS_NO", struct.getONEROUS_CONS_NO());
				setErrorParameter("T_PAST_ONEROUS_CONS", "PLANT_CD", pastOnerousConsStruct.getPLANT_CD());
				return;
			}
			
			struct.setStruct(pastOnerousConsStruct);
			struct.setPUCH_ODR_CD(onerousConsNo);
			
			// 買掛管理がインストールされている場合、当年月度を取得
			AE0100010Struct readStruct = new AE0100010Struct();
			List installOptionsList = entity.mSYS_INSTALL_OPTIONS.read(conn, readStruct);
			if (installOptionsList.size() > 0) {
				AE0100010Struct installOptionsStruct = (AE0100010Struct)installOptionsList.get(0);
				struct.setINSTALL_FLG(installOptionsStruct.getINSTALL_FLG());
			} else {
				struct.setINSTALL_FLG("0");
			}
			
			// 買掛管理がインストールされている場合、当年月度を取得
			if ("1".equals(struct.getINSTALL_FLG())) {
				List debtCtrlList = entity.mSYS_DEBT_CTRL.read(conn, readStruct);
				if (debtCtrlList.size() > 0) {
					AE0100010Struct debtCtrlStruct = (AE0100010Struct)debtCtrlList.get(0);
					struct.setTHIS_MONTH(debtCtrlStruct.getTHIS_MONTH());
				} else {
					setErrorMessage("AE00145");
					return;
				}
			}
			
			// 有償支給在庫管理区分が存在しない場合
			AE0100010Struct parameterStruct = new AE0100010Struct();
			parameterStruct.setNAME(sysPLANT_CD + "_ONEROUS_CONS_INV_TYP");
			List parameterList = entity.mSYS_PARAMETER.read(conn, parameterStruct);
			if (parameterList.isEmpty()) {
				setErrorMessage("AE00141");
				setErrorParameter("SYS_PARAMETER", "NAME", parameterStruct.getNAME());
				return;
			}
			parameterStruct = (AE0100010Struct)(parameterList.get(0));
			if ("TRUE".equals((parameterStruct.getVALUE()).toUpperCase())) {
				struct.setc_ONEROUS_CONS_INV_TYP("true");
			} else {
				struct.setc_ONEROUS_CONS_INV_TYP(null);
			}
			
			// [有償支給履歴].” 返品発生処理区分”＝2:有償支給返品実績から登録でない場合 2006/06/29 up
			if (!"2".equals(pastOnerousConsStruct.getRETURNED_GNR_TYP())){
				setErrorMessage("AE00158");
				setErrorParameter("T_PAST_ONEROUS_CONS", "ONEROUS_CONS_NO", struct.getONEROUS_CONS_NO());
				setErrorParameter("T_PAST_ONEROUS_CONS", "RETURNED_GNR_TYP", struct.getRETURNED_GNR_TYP());
				return;
			}//2006/06/29 end
			
			// 「出庫指示番号」、「発注番号」とラジオボタンをクリア
			struct.setr1_FILTER("true");
			struct.setISSUE_INST_CD(null);
			struct.setPUCH_ODR_CD(null);
			
			// 「返品数」×-1
			struct.setISSUE_QTY(Calculate.multiply(struct.getISSUE_QTY(), "-1"));
			
			// 返品金額を計算する
			// ｢発注金額｣の計算
			String puchOdrAmount =
					AmountCalculator.calcPuchOdrAmount(
							struct.getISSUE_QTY(),
							struct.getUNIT_COST(),
							struct.getROUND_TYP(),
							struct.getVEND_DECIMAL_FIG());
			struct.setPUCH_ODR_AMOUNT(puchOdrAmount);
			
			struct.setSelectUnitCostFlag("true");
			
			if ("0".equals(struct.getAP_PROC_TYP()) == false) {
				setErrorMessage("AE00092");
				setErrorParameter("T_PAST_ONEROUS_CONS", "ONEROUS_CONS_NO", struct.getONEROUS_CONS_NO());
				setErrorParameter("T_PAST_ONEROUS_CONS", "AP_PROC_TYP", struct.getAP_PROC_TYP());
				return;
			}
			
			// 返品日
			struct.seth_ISSUE_DATE(struct.getISSUE_DATE());

			if (!_lotCtrlFlg ) {
				struct.setLOT_NO(null);
			}
            struct.seth_LOT_NO_2(struct.getLOT_NO());
            if((struct.getLOT_NO()!=null && !"".equals(struct.getLOT_NO()))
                    &&(struct.getITEM_CD()!=null && !"".equals(struct.getITEM_CD())))
            {
                List lot_MODIFY_COUNT_List=entity.mselectT_LOT_CTRL.read(conn,struct);
                if(!lot_MODIFY_COUNT_List.isEmpty())
                {
                    struct_MODIFY_COUNT = (AE0100010Struct)lot_MODIFY_COUNT_List.get(0);
                }
            }
			readStatus = NORMAL;
			
		} catch (FoundationException e) {
			throw new ExpjException(e);
		} catch (DataNotFoundException e) {
			throw new ExpjException(e);
		} catch (SQLException e) {
			throw new ExpjException(e);
		}
                //}}user_implement_dev:<controlSelect>
		logger.exiting("AE0100010Control"+":USER="+struct.getsUser_ID(),"controlSelect");

		return;
	}

	/**
	 * 単価読込ボタン押下時に実行される処理です。
	 *
	 */
	public void controlSelectUnitCost() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0100");
		logger.entering("AE0100010Control"+":USER="+struct.getsUser_ID(),"controlSelectUnitCost");
			//{{user_implement_dev:<controlSelectUnitCost>
			// TODO: ユーザ定義のコードを記述してください
		try {
			_rcvIssueCtrlCd = null;
			
			// 「支給単価読込」が選択されている場合
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
					AE0100010Struct vendStruct = (AE0100010Struct)(vendList.get(0));
				}
				
				// 品目存在チェック
				List itemList = entity.mM_ITEM.read(conn, struct);
				if (itemList.isEmpty()) {
					// エラー
					setErrorMessage("AE00118");
					setErrorParameter("M_ITEM", "ITEM_CD", struct.getITEM_CD());
				} else {
					AE0100010Struct itemStruct = (AE0100010Struct)(itemList.get(0));
					struct.setSTOCK_UNIT(itemStruct.getSTOCK_UNIT());
					// 品目.在庫数単位区分
					if ("1".equals(itemStruct.getUNIT_QTY_TYP()) == true
							&& Calculate.isInteger(struct.getISSUE_QTY()) == false) {
						// エラー
						setErrorMessage("AE00146");
						setErrorParameter("M_ITEM", "ITEM_CD", struct.getITEM_CD());
						setErrorParameter("M_ITEM", "UNIT_QTY_TYP", itemStruct.getUNIT_QTY_TYP());
					}
				}
				
				// エラーがあれば終了
				if (msgStruct.hasError()) {
					return;
				}
				
				PuchUnitCostStruct pucs;
				
				ConsUnitCost cuc = null;
				
				// 取引先、購入単価、通貨、消費税を取得
					cuc = new ConsUnitCost(conn);
					cuc.read(
							_myCompanyStruct.getCOMPANY_CD(),
							struct.getVEND_CD(),
							sysPLANT_CD,
							struct.getITEM_CD(),
							struct.getISSUE_DATE());
					
					// 単価
					BigDecimal unitCost = cuc.getUnitCost();
					struct.setUNIT_COST(unitCost.toString());
					
					// 単価区分
					int unitCostTyp = cuc.getUnitCostTyp();
					struct.setUNIT_COST_TYP(String.valueOf(unitCostTyp));
					
					try {
						// [通貨]情報を取得
						CurStruct cs =
						CurControl.getData(conn, struct.getCOMPANY_CD(), struct.getVEND_CD());
						struct.setVEND_CUR_UNIT(cs.getCUR_UNIT());
						struct.setROUND_TYP(cs.getROUND_TYP());
						struct.setVEND_DECIMAL_FIG(cs.getDECIMAL_FIG());
					} catch(DataNotFoundException dnfe) {
						throw new ExpjException(dnfe);
					}
				
				// 返品金額を計算する
				// ｢発注金額｣の計算
				String puchOdrAmount =
						AmountCalculator.calcPuchOdrAmount(
								struct.getISSUE_QTY(),
								struct.getUNIT_COST(),
								struct.getROUND_TYP(),
								struct.getVEND_DECIMAL_FIG());
				struct.setPUCH_ODR_AMOUNT(puchOdrAmount);
				
			} else if ("true".equals(struct.getr2_FILTER()) || "true".equals(struct.getr3_FILTER())) {
				
				// 「出庫指示番号を指定する」、または、「発注番号を指定する」が選択されている場合
				
				// 入力チェック
				
				PuchUnitCostStruct pucs;
				
				// 取引先、購入単価、通貨、消費税を取得
				try {
					
					AE0100010Struct selectStruct = new AE0100010Struct();
					// 検索条件設定
					if ("true".equals(struct.getr2_FILTER())) {
						selectStruct.setISSUE_INST_CD(struct.getISSUE_INST_CD());
						selectStruct.setPUCH_ODR_CD(null);
						selectStruct.setITEM_CD(null);
					} else if ("true".equals(struct.getr3_FILTER())) {
						selectStruct.setISSUE_INST_CD(null);
						selectStruct.setPUCH_ODR_CD(struct.getPUCH_ODR_CD());
						selectStruct.setITEM_CD(struct.getITEM_CD());
					}
					
					List unitCostList = entity.mselectT_PAST_ONEROUS_CONS.read(conn, selectStruct);
					if (unitCostList.isEmpty()) {
						// エラー
						if ("true".equals(struct.getr2_FILTER())) {
							setErrorMessage("AE00102");
							setErrorParameter("T_PAST_ONEROUS_CONS", "ISSUE_INST_CD", 
									struct.getISSUE_INST_CD());
						} else if ("true".equals(struct.getr3_FILTER())) {
							setErrorMessage("AE00103");
							setErrorParameter("T_PAST_ONEROUS_CONS", "PUCH_ODR_CD", struct.getPUCH_ODR_CD());
							setErrorParameter("T_PAST_ONEROUS_CONS", "ITEM_CD", struct.getITEM_CD());
						}
						return;
					} else {
						AE0100010Struct unitCostStruct = (AE0100010Struct)(unitCostList.get(0));
						
						if (sysPLANT_CD.equals(unitCostStruct.getPLANT_CD()) == false) {
							if ("true".equals(struct.getr2_FILTER())) {
								setErrorMessage("AE00096");
								setErrorParameter("T_PAST_ONEROUS_CONS", 
										"ISSUE_INST_CD", struct.getISSUE_INST_CD());
								setErrorParameter("T_PAST_ONEROUS_CONS", "PLANT_CD", 
										unitCostStruct.getPLANT_CD());
							} else if ("true".equals(struct.getr3_FILTER())) {
								setErrorMessage("AE00100");
								setErrorParameter("T_PAST_ONEROUS_CONS", "PUCH_ODR_CD", 
										struct.getPUCH_ODR_CD());
								setErrorParameter("T_PAST_ONEROUS_CONS", "PLANT_CD", 
										unitCostStruct.getPLANT_CD());
							}
							return;
						}
						
						// 「取引先コード」が[有償支給履歴]."取引先コード"と異なる場合
						if (struct.getVEND_CD() != null && "".equals(struct.getVEND_CD()) == false) {
							if (struct.getVEND_CD().equals(unitCostStruct.getVEND_CD()) == false) {
								if ("true".equals(struct.getr2_FILTER())) {
									setErrorMessage("AE00097");
									setErrorParameter("T_PAST_ONEROUS_CONS", "ISSUE_INST_CD", 
											struct.getISSUE_INST_CD());
									setErrorParameter("T_PAST_ONEROUS_CONS", "VEND_CD", 
											unitCostStruct.getVEND_CD());
								} else if ("true".equals(struct.getr3_FILTER())) {
									setErrorMessage("AE00113");
									setErrorParameter("T_PAST_ONEROUS_CONS", "PUCH_ODR_CD", 
											struct.getPUCH_ODR_CD());
									setErrorParameter("T_PAST_ONEROUS_CONS", "VEND_CD", 
											unitCostStruct.getVEND_CD());
								}
							}
						}
						
						// 「品目番号」が[有償支給履歴]."品目番号"と異なる場合
						if (struct.getITEM_CD() != null && "".equals(struct.getITEM_CD()) == false) {
							if (struct.getITEM_CD().equals(unitCostStruct.getITEM_CD()) == false) {
								if ("true".equals(struct.getr2_FILTER())) {
									setErrorMessage("AE00098");
									setErrorParameter("T_PAST_ONEROUS_CONS", "ISSUE_INST_CD", 
											struct.getISSUE_INST_CD());
									setErrorParameter("T_PAST_ONEROUS_CONS", "ITEM_CD", 
											unitCostStruct.getITEM_CD());
									return;
								}
							}
						}
						
						// 「製番」が[有償支給履歴]."製番"と異なる場合
						if (struct.getJOB_ODR_CD() != null && "".equals(struct.getJOB_ODR_CD()) == false) {
							if (struct.getJOB_ODR_CD().equals(unitCostStruct.getJOB_ODR_CD()) == false) {
								if ("true".equals(struct.getr2_FILTER())) {
									setErrorMessage("AE00106");
									setErrorParameter("T_PAST_ONEROUS_CONS", "ISSUE_INST_CD", 
											struct.getISSUE_INST_CD());
									setErrorParameter("T_PAST_ONEROUS_CONS", "JOB_ODR_CD", 
											unitCostStruct.getJOB_ODR_CD());
								} else if ("true".equals(struct.getr3_FILTER())) {
									setErrorMessage("AE00109");
									setErrorParameter("T_PAST_ONEROUS_CONS", "PUCH_ODR_CD", 
											struct.getPUCH_ODR_CD());
									setErrorParameter("T_PAST_ONEROUS_CONS", "JOB_ODR_CD", 
											unitCostStruct.getJOB_ODR_CD());
								}
							}
						}
						
						// 「品目番号」が[有償支給履歴]."品目番号"と異なる場合
						if (struct.getITEM_CD() != null && "".equals(struct.getITEM_CD()) == false) {
							if ("1".equals(unitCostStruct.getUNIT_QTY_TYP()) == true
									&& Calculate.isInteger(struct.getISSUE_QTY()) == false) {
								setErrorMessage("AE00146");
								setErrorParameter("M_ITEM", "ITEM_CD", struct.getITEM_CD());
								setErrorParameter("M_ITEM", "UNIT_QTY_TYP", unitCostStruct.getUNIT_QTY_TYP());
							}
						}
						
						// エラーがあれば終了
						if (msgStruct.hasError()) {
							return;
						}
						struct.setUNIT_COST_TYP(unitCostStruct.getUNIT_COST_TYP());  // 単価区分
						struct.setUNIT_COST(unitCostStruct.getUNIT_COST());  // 単価
						struct.setCOMPANY_CD(unitCostStruct.getCOMPANY_CD());  // 取引先コード
						struct.setVEND_CD(unitCostStruct.getVEND_CD());  // 取引先コード
						struct.setITEM_CD(unitCostStruct.getITEM_CD());  // 品目番号
						struct.setJOB_ODR_CD(unitCostStruct.getJOB_ODR_CD());  // 製番
						struct.setSTOCK_UNIT(unitCostStruct.getSTOCK_UNIT());  // 計量単位
						
					}
					
				} catch (SQLException e) {
					throw new ExpjException(e);
				}
					
				// 為替レートが存在しない場合はワーニング扱いとするため別に取得
				try {
					// 画面外の必要なデータを設定
					try {
						
						// [通貨]情報を取得
						CurStruct cs =
								CurControl.getData(conn, struct.getCOMPANY_CD(), struct.getVEND_CD());
						struct.setVEND_CUR_UNIT(cs.getCUR_UNIT());
						struct.setROUND_TYP(cs.getROUND_TYP());
						struct.setVEND_DECIMAL_FIG(cs.getDECIMAL_FIG());
					} catch(DataNotFoundException dnfe) {
						throw new ExpjException(dnfe);
					}
					
					// ｢発注金額｣の計算
					String puchOdrAmount =
							AmountCalculator.calcPuchOdrAmount(
									struct.getISSUE_QTY(),
									struct.getUNIT_COST(),
									struct.getROUND_TYP(),
									struct.getVEND_DECIMAL_FIG());
					struct.setPUCH_ODR_AMOUNT(puchOdrAmount);
					
				} catch (SQLException e) {
					throw new ExpjException(e);
				}
			}
			// 返品元保管区コード
			String defaultWhCd = ValidateWh.getDefaultRcv(conn, sysPLANT_CD, struct.getITEM_CD());
			struct.setRETURNED_WH_CD(defaultWhCd);
			
		} catch (SQLException e) {
			throw new ExpjException(e);
		}
		struct.setSelectUnitCostFlag("true");
                //}}user_implement_dev:<controlSelectUnitCost>
		logger.exiting("AE0100010Control"+":USER="+struct.getsUser_ID(),"controlSelectUnitCost");

		return;
	}

	/**
	 * 登録ボタン押下時に実行される処理です。
	 *
	 */
	public void controlInsert() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0100");
		logger.entering("AE0100010Control"+":USER="+struct.getsUser_ID(),"controlInsert");
			//{{user_implement_dev:<controlInsert>
			// TODO: ユーザ定義のコードを記述してください
		try {
			_rcvIssueCtrlCd = null;
			
			// 生産側の過去の実績入力の制限チェック
			if(getSysParameter() == false){
				if(chkProcExecDate("1","",struct.getISSUE_DATE()) == false){
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
				AE0100010Struct vendStruct = (AE0100010Struct)(vendList.get(0));
				struct.setVEND_ANAME(vendStruct.getVEND_ANAME());
			}
			
			// エラーがあれば終了
			if (msgStruct.hasError()) {
				return;
			}
			
			// 品目存在チェック
			AE0100010Struct itemStruct = null;
			List itemList = entity.mM_ITEM.read(conn, struct);
			if (itemList.isEmpty()) {
				// エラー
				setErrorMessage("AE00118");
				setErrorParameter("M_ITEM", "ITEM_CD", struct.getITEM_CD());
			} else {
				itemStruct = (AE0100010Struct)(itemList.get(0));
				struct.setITEM_NAME(itemStruct.getITEM_NAME());
				struct.setSTOCK_UNIT(itemStruct.getSTOCK_UNIT());
                // 品目マスタから品目手配区分を取得、8擬似品目の場合エラー
				if ("8".equals(itemStruct.getMRP_ODR_TYP())) {
                    // エラー
					setErrorMessage("AE00203");
					setErrorParameter("M_ITEM", "ITEM_CD", struct.getITEM_CD());
					setErrorParameter("M_ITEM", "MRP_ODR_TYP", itemStruct.getMRP_ODR_TYP());
				}
			}
			
			// エラーがあれば終了
			if (msgStruct.hasError()) {
				return;
			}
			
			// 支給単価存在チェック
			struct.setPLANT_CD(sysPLANT_CD);
			List consUnitCostList = entity.mM_CONS_UNIT_COST.read(conn, struct);
			if (consUnitCostList.isEmpty()) {
				// エラー
				setErrorMessage("AE00119");
				setErrorParameter("M_CONS_UNIT_COST", "COMPANY_CD", struct.getCOMPANY_CD());
				setErrorParameter("M_CONS_UNIT_COST", "VEND_CD", struct.getVEND_CD());
				setErrorParameter("M_CONS_UNIT_COST", "PLANT_CD", sysPLANT_CD);
				setErrorParameter("M_CONS_UNIT_COST", "ITEM_CD", struct.getITEM_CD());
			}
			
			DateCtrlStruct dcs = DateCtrlControl.getData(conn, sysPLANT_CD);
			if (DateTool.compareYMD(struct.getISSUE_DATE(), dcs.getBUSINESS_OPR_DATE()) > 0) {
				setErrorMessage("AE00117");
				setErrorParameter("SYS_DATE_CTRL", "PLANT_CD", sysPLANT_CD);
				setErrorParameter(
					"SYS_DATE_CTRL",
					"BUSINESS_OPR_DATE",
					dcs.getBUSINESS_OPR_DATE());
				setErrorParameter(
					"T_PAST_ONEROUS_CONS",
					"ISSUE_DATE",
					struct.getISSUE_DATE());
			}
			
			// 製番計画存在チェック
			AE0100010Struct jobOdrStruct = null;
			if (struct.getJOB_ODR_CD() != null && "".equals(struct.getJOB_ODR_CD()) == false) {
				List jobOdrList = entity.mT_JOB_ODR.read(conn, struct);
				if (jobOdrList.isEmpty()) {
					// エラー
					setErrorMessage("AE00110");
					setErrorParameter("T_JOB_ODR", "JOB_ODR_CD", struct.getJOB_ODR_CD());
				} else {
					jobOdrStruct = (AE0100010Struct)(jobOdrList.get(0));
					
					// 製番計画.工場コードがログインユーザの工場コードと異なる場合エラー
					if (sysPLANT_CD.equals(jobOdrStruct.getPLANT_CD()) == false) {
						// エラー
						setErrorMessage("AE00115");
						setErrorParameter("T_JOB_ODR", "JOB_ODR_CD", struct.getJOB_ODR_CD());
						setErrorParameter("T_JOB_ODR", "PLANT_CD", jobOdrStruct.getPLANT_CD());
					}
				}
			}
			
			// 「返品保管区コード」存在チェック
			AE0100010Struct whStruct = new AE0100010Struct();
			whStruct.setWH_CD(struct.getRETURNED_WH_CD());
			whStruct.setVEND_CD(null);
			whStruct.setPLANT_CD(null);
			List whList = entity.mM_WH.read(conn, whStruct);
			if (whList.isEmpty()) {
				// エラー
				setErrorMessage("AE00111");
				setErrorParameter("M_WH", "WH_CD", struct.getWH_CD());
			} else {
				// 保管区.工場コードがログインユーザの工場コードと異なる場合エラー
				whStruct = (AE0100010Struct)(whList.get(0));
				if (sysPLANT_CD.equals(whStruct.getPLANT_CD()) == false) {
					// エラー
					setErrorMessage("AE00116");
					setErrorParameter("T_JOB_ODR", "JOB_ODR_CD", struct.getJOB_ODR_CD());
					setErrorParameter("T_JOB_ODR", "PLANT_CD", whStruct.getPLANT_CD());
				}
			}
			
			// エラーがあれば終了
			if (msgStruct.hasError()) {
				return;
			}
			
			// 保管区.所要量計算対象フラグ=0：非の場合エラー
			if ("0".equals(whStruct.getMRP_FLG())) {
				// エラー
				setErrorMessage("AE00112");
				setErrorParameter("M_WH", "WH_CD", struct.getWH_CD());
				setErrorParameter("M_WH", "MRP_FLG", whStruct.getMRP_FLG());
			}
            // [品目]．”ロット管理フラグ”＝０（ロットトレース管理しない）且つ画面．「在庫ロット番号」≠ＮＵＬＬ場合
            if ("0".equals(itemStruct.geth_LOT_CTRL_FLG())== true
                    && struct.getLOT_NO()!= null
                    && !"".equals(struct.getLOT_NO())) {
                // エラー
                setErrorMessage("AE20601");
            }
            
            // [品目]．”ロット管理フラグ”＝１（ロットトレース管理する）ＡＮＤ[品目]．”ロット番号採番区分”＝ 0：手入力、且つ画面．[在庫ロット番号]＝ＮＵＬＬ場合
            if("1".equals(itemStruct.geth_LOT_CTRL_FLG())== true
                    && "0".equals(itemStruct.geth_LOT_NUMBERING_TYP())==true
                    && (struct.getLOT_NO() == null
                    || "".equals(struct.getLOT_NO()))) {
                // エラー
                setErrorMessage("AE20600"); 
                setErrorParameter("M_ITEM", "ITEM_CD", struct.getITEM_CD());
            }
           
            // 「品目番号」と一致する[品目].”在庫数単位区分”＝1:整数管理で「返品数」が整数でない場合
			if ("1".equals(itemStruct.getUNIT_QTY_TYP()) == true
					&& Calculate.isInteger(struct.getISSUE_QTY()) == false) {
				// エラー
				setErrorMessage("AE00146");
				setErrorParameter("M_ITEM", "ITEM_CD", struct.getITEM_CD());
				setErrorParameter("M_ITEM", "UNIT_QTY_TYP", itemStruct.getUNIT_QTY_TYP());
			}
			
			// 有償支給在庫管理区分が存在しない場合
			AE0100010Struct parameterStruct = new AE0100010Struct();
			parameterStruct.setNAME(sysPLANT_CD + "_ONEROUS_CONS_INV_TYP");
			List parameterList = entity.mSYS_PARAMETER.read(conn, parameterStruct);
			if (parameterList.isEmpty()) {
				setErrorMessage("AE00141");
				setErrorParameter("SYS_PARAMETER", "NAME", parameterStruct.getNAME());
			}
			
            
			// エラーがあれば終了
			if (msgStruct.hasError()) {
				return;
			}
			
			// 「取引先在庫を更新する」がONの場合
			if ("true".equals(struct.getc_ONEROUS_CONS_INV_TYP())) {
				parameterStruct = (AE0100010Struct)(parameterList.get(0));
				if ("TRUE".equals((parameterStruct.getVALUE()).toUpperCase()) == false) {
					setErrorMessage("AE00140");
					setErrorParameter("SYS_PARAMETER", "NAME", parameterStruct.getNAME());
					setErrorParameter("SYS_PARAMETER", "VALUE", parameterStruct.getVALUE());
				}
			}
			
			if ("true".equals(struct.getc_ONEROUS_CONS_INV_TYP())) {
				// 取引先保管区の存在チェック
				whStruct = new AE0100010Struct();
				whStruct.setWH_CD(null);
				whStruct.setVEND_CD(struct.getVEND_CD());
				whStruct.setPLANT_CD(sysPLANT_CD);
				whList = entity.mM_WH.read(conn, whStruct);
				if (whList.isEmpty()) {
					// エラー
					setErrorMessage("AE00139");
					setErrorParameter("M_WH", "WH_CD", struct.getWH_CD());
				}
			}
			
			// エラーがあれば終了
			if (msgStruct.hasError()) {
				return;
			}
			
            //取引先在庫を更新するがOn、ロット番号がNullの場合
            if("1".equals(itemStruct.geth_LOT_CTRL_FLG())== true
                    && !"0".equals(itemStruct.geth_LOT_NUMBERING_TYP())==true
                    && (struct.getLOT_NO() == null
                    || "".equals(struct.getLOT_NO()))
                    && "true".equals(struct.getc_ONEROUS_CONS_INV_TYP())) {
                // エラー
                setErrorMessage("AE20600"); 
                setErrorParameter("M_ITEM", "ITEM_CD", struct.getITEM_CD());
            }
            
            List t_LOT_CTRL_List=entity.mselectT_LOT_CTRL.read(conn,struct);
            // [品目]．”ロット管理フラグ”＝１（ロットトレース管理する）且つ画面．「在庫ロット番号]≠ＮＵＬＬ時、画面で入力された「品目番号」、「在庫ロット番号」が[ロット管理]テーブルに存在しない場合
            if("1".equals(itemStruct.geth_LOT_CTRL_FLG())== true
                    && struct.getLOT_NO() != null
                    && !"".equals(struct.getLOT_NO())) {
            	if(t_LOT_CTRL_List.isEmpty()){
            		if ("true".equals(struct.getc_ONEROUS_CONS_INV_TYP())) {
            			//入力された在庫ロット番号はこの品目に該当しません。ロット管理情報を登録してくだい。
                        setErrorMessage("AE21002");
                        setErrorParameter("M_ITEM", "ITEM_CD", struct.getITEM_CD());
                        setErrorParameter("T_LOT_CTRL", "LOT_NO", struct.getLOT_NO());
            		} else {
            			String logMessage = "";
            			BizCommon bc = new BizCommon(conn, getsysUSER_CD(), sp.getProcId(), getsysPLANT_CD());
						//賞味期限自動計算 
						if(StringUtil.Validate(struct.getITEM_CD()) 
								&& StringUtil.Validate(struct.getISSUE_DATE())) {
							List resList = new ArrayList();
							Integer retSts;
							String errCode = null;
							
							resList = bc.calcBestBeforeFd(struct.getITEM_CD(), struct.getISSUE_DATE());
							if(!resList.isEmpty()) {
								String bestBeforeDate = (String) resList.get(0);
								errCode = (String) resList.get(1);
								retSts = bc.getResultStatus();
								if(retSts != null && retSts.intValue() == 1) {
									if(bestBeforeDate.equals("0")) {
										bestBeforeDate = "";
										setWarningMessage("AE22010", struct.getITEM_CD(), struct.getLOT_NO());
									}
									struct.setBEST_BEFORE_DATE(bestBeforeDate);
								}
								if(retSts != null && retSts.intValue() == 3) {
									logMessage = "CalcBestBeforeFd was Failed..." ;
									setErrorMessage(errCode,logMessage);
									return ;
								}
							}
						}
						// [ロット管理]に追加
						struct.setPRD_CMPLT_DATE(struct.getISSUE_DATE());
						entity.mselectT_LOT_CTRL.create(conn, struct);
					}
                } else {
                    //[ロット管理]．“賞味期限”＜業務運用日　場合
                    String str_BEST_BEFORE_DATE=((AE0100010Struct)t_LOT_CTRL_List.get(0)).getBEST_BEFORE_DATE();
                    if(str_BEST_BEFORE_DATE != null && !"".equals(str_BEST_BEFORE_DATE))
                    {
                        if (DateTool.compareYMD(dcs.getBUSINESS_OPR_DATE(),str_BEST_BEFORE_DATE) > 0) {
                        	//入力された在庫ロット番号が期限切れとなっています。
                            setErrorMessage("AE21003");
                            setErrorParameter("T_LOT_CTRL","ITEM_CD",struct.getITEM_CD());
                            setErrorParameter("T_LOT_CTRL","LOT_NO",struct.getLOT_NO());
                        }
                    }
                }
            }
			// エラーがあれば終了
			if (msgStruct.hasError()) {
				return;
			}
			
            if(!itemList.isEmpty())
            {
                AE0100010Struct struct_LotNumber=(AE0100010Struct)itemList.get(0);
                str_LOT_CTRL_FLG = struct_LotNumber.geth_LOT_CTRL_FLG();
                add_callgetsetLotNumberingFd(struct_LotNumber);
            }
			// 返品先保管区の在庫更新
			updateStock(conn, struct, null, 1);
			
			// 取引先保管区の在庫更新
			// 「取引先在庫を更新する」がONの場合
			if ("true".equals(struct.getc_ONEROUS_CONS_INV_TYP())) {
				updateStock(conn, struct, null, 11);
			}
			
			// エラーがあれば終了
			if (msgStruct.hasError()) {
				return;
			}
			
			// 有償支給履歴追加
			// 有償支給番号採番
			String ctrlCd = null;
			Numbering numbering = new Numbering(
									conn,
									Numbering.ONERCONS_CD, 
									getsysUSER_CD(), 
									this.sp.getProcId(), 
									sysPLANT_CD);
			try {
				ctrlCd = numbering.getNo();
				if (ctrlCd == null) {
					ExpjMessage emsg = new ExpjMessage("AE00152");
					throw new FoundationException(
									"AE0100010Control",
									"controlInsert()",
									emsg.getMessage());
				}
			} catch(FoundationException ex) {
				// 登録処理失敗：入出庫管理番号（出庫）の採番に失敗しました
				setErrorMessage("AE00152");
				ExpjMessage emsg = new ExpjMessage("ZZ01106");
				sysLog.severe(emsg, getsysUSER_CD());
				ExpjException ee = new ExpjException(ex, emsg);
				throw ee;
			}
			AE0100010Struct insertStruct = new AE0100010Struct();
			setStructSystemData(insertStruct);
			insertStruct.setStruct(struct);
			insertStruct.setONEROUS_CONS_NO(ctrlCd);  // 有償支給番号
			insertStruct.setCOMPANY_CD(_myCompanyStruct.getCOMPANY_CD());  // 会社コード
			insertStruct.setPLANT_CD(sysPLANT_CD);  // 工場コード
			insertStruct.setJOB_ODR_DETAIL_NO("0");  // 製番枝番
			
			insertStruct.setWORK_ODR_CD("");  // 作業計画番号
			insertStruct.setWORK_IN_PROC_CD("");  // 仕掛作業コード
			insertStruct.setPUCH_ODR_CD("");  // 発注番号
			insertStruct.setRETURNED_GNR_TYP("2");  // 返品発生処理区分
			insertStruct.setAP_PROC_TYP("0");  // 買掛処理区分
			
			insertStruct.setISSUE_QTY(Calculate.multiply(insertStruct.getISSUE_QTY(), "-1"));
			insertStruct.setRCV_ISSUE_CTRL_CD(_rcvIssueCtrlCd);  // 入出庫管理番号
			insertStruct.setISSUE_INST_CD(null);    //出庫指示番号

			entity.mT_PAST_ONEROUS_CONS.create(conn, insertStruct);
            //「品目番号」、[在庫ロット番号]コントロールの値が、[ロット管理]に存在しない場合はエラー
            if(!itemList.isEmpty())
            {
                AE0100010Struct struct_LOT_CTRL_FLG=(AE0100010Struct)itemList.get(0);
                if((struct.getLOT_NO() != null && !"".equals(struct.getLOT_NO()))
                        && (struct_LOT_CTRL_FLG.geth_LOT_CTRL_FLG() != null 
                            && "1".equals(struct_LOT_CTRL_FLG.geth_LOT_CTRL_FLG())))
                    {
                        struct.setDEL_FLG("0");
                        entity.mselectT_LOT_CTRL.update(conn,struct);
                    }
            }
			
			// 登録後データ再表示
			struct.setONEROUS_CONS_NO(ctrlCd);
			controlSelect();
			
/*            if(struct.geth_LOT_CTRL_FLG()!=null && struct.geth_LOT_CTRL_FLG().equals("1"))
            {
                rcvIssueAter(struct,null);
            }*/
            
			conn.commit();
			
		} catch(ParseException e) {
			throw new ExpjException(e);
		} catch(DataNotFoundException e) {
			throw new ExpjException(e);
		} catch(SQLException e) {
			throw new ExpjException(e);
		} finally {
			if (conn != null) {
				conn.rollback();
			}
		}
                //}}user_implement_dev:<controlInsert>
		logger.exiting("AE0100010Control"+":USER="+struct.getsUser_ID(),"controlInsert");

		return;
	}

	/**
	 * 更新ボタン押下時に実行される処理です。
	 *
	 */
	public void controlUpdate() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0100");
		logger.entering("AE0100010Control"+":USER="+struct.getsUser_ID(),"controlUpdate");
			//{{user_implement_dev:<controlUpdate>
			// TODO: ユーザ定義のコードを記述してください
		try {
			_rcvIssueCtrlCd = null;
			
			
			// 生産側の過去の実績入力の制限チェック
			if(getSysParameter() == false){
				if(chkProcExecDate("2",struct.geth_ISSUE_DATE(),struct.getISSUE_DATE()) == false){
					setErrorMessage(ProcExecDateError);
					setErrorParameter("SYS_ACTUAL_COST_CTRL_AC", "PLANT_CD", struct.getPLANT_CD());
					setErrorParameter("SYS_ACTUAL_COST_CTRL_AC", "PROC_EXEC_DATE", struct.getPROC_EXEC_DATE().toString());
					return;
				}
			}
			
			DateCtrlStruct dcs = DateCtrlControl.getData(conn, sysPLANT_CD);
			if (DateTool.compareYMD(struct.getISSUE_DATE(), dcs.getBUSINESS_OPR_DATE()) > 0) {
				setErrorMessage("AE00117");
				setErrorParameter("SYS_DATE_CTRL", "PLANT_CD", sysPLANT_CD);
				setErrorParameter(
					"SYS_DATE_CTRL",
					"BUSINESS_OPR_DATE",
					dcs.getBUSINESS_OPR_DATE());
				setErrorParameter(
					"T_PUCH_ODR_RTN_DATE",
					"ISSUE_DATE",
					struct.getISSUE_DATE());
			}
			
			// 「返品先保管区コード」存在チェック
			AE0100010Struct whStruct = new AE0100010Struct();
			whStruct.setWH_CD(struct.getRETURNED_WH_CD());
			whStruct.setVEND_CD(null);
			whStruct.setPLANT_CD(null);
			List whList = entity.mM_WH.read(conn, whStruct);
			if (whList.isEmpty()) {
				// エラー
				setErrorMessage("AE00111");
				setErrorParameter("M_WH", "WH_CD", struct.getWH_CD());
			} else {
				// [保管区]."工場コード"がログインユーザの工場コードと異なる場合エラー
				whStruct = (AE0100010Struct)(whList.get(0));
				if (sysPLANT_CD.equals(whStruct.getPLANT_CD()) == false) {
					// エラー
					setErrorMessage("AE00116");
					setErrorParameter("T_JOB_ODR", "JOB_ODR_CD", struct.getJOB_ODR_CD());
					setErrorParameter("T_JOB_ODR", "PLANT_CD", whStruct.getPLANT_CD());
				}
			}
			
			// エラーがあれば終了
			if (msgStruct.hasError()) {
				return;
			}
			
			// [保管区]."所要量計算対象フラグ"=0：非の場合エラー
			if ("0".equals(whStruct.getMRP_FLG())) {
				// エラー
				setErrorMessage("AE00112");
				setErrorParameter("M_WH", "WH_CD", struct.getWH_CD());
				setErrorParameter("M_WH", "MRP_FLG", whStruct.getMRP_FLG());
			}
			
			// 品目存在チェック
			AE0100010Struct itemStruct = null;
			List itemList = entity.mM_ITEM.read(conn, struct);
			if (itemList.isEmpty()) {
				// エラー
				setErrorMessage("AE00118");
				setErrorParameter("M_ITEM", "ITEM_CD", struct.getITEM_CD());
			} else {
				itemStruct = (AE0100010Struct)(itemList.get(0));
				struct.setITEM_NAME(itemStruct.getITEM_NAME());
				if ("1".equals(itemStruct.getUNIT_QTY_TYP()) == true
						&& Calculate.isInteger(struct.getISSUE_QTY()) == false) {
					// エラー
					setErrorMessage("AE00146");
					setErrorParameter("M_ITEM", "ITEM_CD", struct.getITEM_CD());
					setErrorParameter("M_ITEM", "UNIT_QTY_TYP", itemStruct.getUNIT_QTY_TYP());
				}
			}
            // [品目]．”ロット管理フラグ”＝０（ロットトレース管理しない）且つ画面．「在庫ロット番号」≠ＮＵＬＬ場合
            if ("0".equals(struct.geth_LOT_CTRL_FLG())== true
                    && struct.getLOT_NO() != null && !"".equals(struct.getLOT_NO())) {
                // エラー
                setErrorMessage("AE20601");
            }
            
            // [品目]．”ロット管理フラグ”＝１（ロットトレース管理する）ＡＮＤ[品目]．”ロット番号採番区分”＝ 0：、且つ画面．[在庫ロット番号]＝ＮＵＬＬ場合
            if("1".equals(struct.geth_LOT_CTRL_FLG())== true
                    && "0".equals(struct.geth_LOT_NUMBERING_TYP())==true
                    && (struct.getLOT_NO()==null || "".equals(struct.getLOT_NO()))) {
                // エラー
                setErrorMessage("AE20600"); 
                setErrorParameter("M_ITEM", "ITEM_CD", struct.getITEM_CD());
            }
            
            
            List t_LOT_CTRL_List=entity.mselectT_LOT_CTRL.read(conn,struct);
            // [品目]．”ロット管理フラグ”＝１（ロットトレース管理する）且つ画面．「在庫ロット番号]≠ＮＵＬＬ時、画面で入力された「品目番号」、「在庫ロット番号」が[ロット管理]テーブルに存在しない場合
            if("1".equals(itemStruct.geth_LOT_CTRL_FLG())== true
                    && struct.getLOT_NO() != null && !"".equals(struct.getLOT_NO())) {
                
                if(t_LOT_CTRL_List.isEmpty()){
                	if ("true".equals(struct.getc_ONEROUS_CONS_INV_TYP())) {
                        // エラー
                        setErrorMessage("AE21002");
                        setErrorParameter("M_ITEM", "ITEM_CD", struct.getITEM_CD());
                        setErrorParameter("T_LOT_CTRL", "LOT_NO", struct.getLOT_NO());
                	} else {
            			String logMessage = "";
            			BizCommon bc = new BizCommon(conn, getsysUSER_CD(), sp.getProcId(), getsysPLANT_CD());
						//賞味期限自動計算 
						if(StringUtil.Validate(struct.getITEM_CD()) 
								&& StringUtil.Validate(struct.getISSUE_DATE())) {
							List resList = new ArrayList();
							Integer retSts;
							String errCode = null;
							
							resList = bc.calcBestBeforeFd(struct.getITEM_CD(), struct.getISSUE_DATE());
							if(!resList.isEmpty()) {
								String bestBeforeDate = (String) resList.get(0);
								errCode = (String) resList.get(1);
								retSts = bc.getResultStatus();
								if(retSts != null && retSts.intValue() == 1) {
									if(bestBeforeDate.equals("0")) {
										bestBeforeDate = "";
										setWarningMessage("AE22010", struct.getITEM_CD(), struct.getLOT_NO());
									}
									struct.setBEST_BEFORE_DATE(bestBeforeDate);
								}
								if(retSts != null && retSts.intValue() == 3) {
									logMessage = "CalcBestBeforeFd was Failed..." ;
									setErrorMessage(errCode,logMessage);
									return ;
								}
							}
						}
						// [ロット管理]に追加
						struct.setPRD_CMPLT_DATE(struct.getISSUE_DATE());
						entity.mselectT_LOT_CTRL.create(conn, struct);
                	}
                }
            }
			// 有償支給在庫管理区分が存在しない場合
			AE0100010Struct parameterStruct = new AE0100010Struct();
			parameterStruct.setNAME(sysPLANT_CD + "_ONEROUS_CONS_INV_TYP");
			List parameterList = entity.mSYS_PARAMETER.read(conn, parameterStruct);
			if (parameterList.isEmpty()) {
				setErrorMessage("AE00141");
				setErrorParameter("SYS_PARAMETER", "NAME", parameterStruct.getNAME());
			}
			
			// エラーがあれば終了
			if (msgStruct.hasError()) {
				return;
			}
			
			// 「取引先在庫を更新する」がONの場合
			if ("true".equals(struct.getc_ONEROUS_CONS_INV_TYP())) {
				parameterStruct = (AE0100010Struct)(parameterList.get(0));
				if ("TRUE".equals((parameterStruct.getVALUE()).toUpperCase()) == false) {
					setErrorMessage("AE00140");
					setErrorParameter("SYS_PARAMETER", "NAME", parameterStruct.getNAME());
					setErrorParameter("SYS_PARAMETER", "VALUE", parameterStruct.getVALUE());
				}
			}
			
			//
			if ("true".equals(struct.getc_ONEROUS_CONS_INV_TYP())) {
				// 取引先保管区の存在チェック
				whStruct = new AE0100010Struct();
				whStruct.setWH_CD(null);
				whStruct.setVEND_CD(struct.getVEND_CD());
				whStruct.setPLANT_CD(sysPLANT_CD);
				whList = entity.mM_WH.read(conn, whStruct);
				if (whList.isEmpty()) {
					// エラー
					setErrorMessage("AE00139");
					setErrorParameter("M_WH", "WH_CD", struct.getWH_CD());
				}
			}
			
			// エラーがあれば終了
			if (msgStruct.hasError()) {
				return;
			}
            // ③ 在庫ロット番号採番処理            
            if(!itemList.isEmpty())
            {
                AE0100010Struct struct_LotNumber=(AE0100010Struct)itemList.get(0);
                str_LOT_CTRL_FLG=struct_LotNumber.geth_LOT_CTRL_FLG();
                add_callgetsetLotNumberingFd(struct_LotNumber);
            }
            
			// 在庫更新処理
			// 画面入力値を退避
			AE0100010Struct formStruct = new AE0100010Struct();
			formStruct.setStruct(struct);
			
			List puchOdrRtnRsltList = entity.mT_PAST_ONEROUS_CONS_LOCK.read(conn, struct);
			if (puchOdrRtnRsltList.isEmpty()) {
				setErrorMessage("ZZ06001");
				setErrorParameter("T_PAST_ONEROUS_CONS", "ONEROUS_CONS_NO", struct.getONEROUS_CONS_NO());
				return;
			}
			AE0100010Struct pastOnerousConsStruct = (AE0100010Struct)(puchOdrRtnRsltList.get(0));
			
			if ((pastOnerousConsStruct.getMODIFY_COUNT()).equals(
					formStruct.getMODIFY_COUNT()) == false) {
				setErrorMessage("ZZ01105");
				return;
			}
			
			if (Calculate.compare(formStruct.getISSUE_QTY(), 
					Calculate.multiply(pastOnerousConsStruct.getISSUE_QTY(), "-1")) != 0 
					|| formStruct.getRETURNED_WH_CD().equals(
							pastOnerousConsStruct.getRETURNED_WH_CD()) == false 
					|| formStruct.getISSUE_DATE().equals(pastOnerousConsStruct.getISSUE_DATE()) == false
					|| formStruct.getLOT_NO().equals(pastOnerousConsStruct.getLOT_NO()) == false) {
				
				// 在庫マイナス更新
				updateStock(conn, formStruct, pastOnerousConsStruct, 2);
				
				// 在庫プラス更新
				updateStock(conn, formStruct, null, 1);
			}
			
			if ((Calculate.compare(formStruct.getISSUE_QTY(), 
					Calculate.multiply(pastOnerousConsStruct.getISSUE_QTY(), "-1")) != 0 
					|| formStruct.getRETURNED_WH_CD().equals(
							pastOnerousConsStruct.getRETURNED_WH_CD()) == false 
					|| formStruct.getISSUE_DATE().equals(pastOnerousConsStruct.getISSUE_DATE()) == false
					|| formStruct.getLOT_NO().equals(pastOnerousConsStruct.getLOT_NO()) == false) 
					&& "true".equals(formStruct.getc_ONEROUS_CONS_INV_TYP())) {
				// 取引先保管区の在庫更新
				updateStock(conn, formStruct, pastOnerousConsStruct, 21);
			}

			// 有償支給履歴更新
			AE0100010Struct updateStruct = new AE0100010Struct();
			setStructSystemData(updateStruct);
			updateStruct.setStruct(struct);
			updateStruct.setISSUE_QTY(Calculate.multiply(updateStruct.getISSUE_QTY(), "-1"));
			if (Calculate.compare(formStruct.getISSUE_QTY(), 
					Calculate.multiply(pastOnerousConsStruct.getISSUE_QTY(), "-1")) != 0 
					|| formStruct.getRETURNED_WH_CD().equals(
							pastOnerousConsStruct.getRETURNED_WH_CD()) == false 
					|| formStruct.getISSUE_DATE().equals(pastOnerousConsStruct.getISSUE_DATE()) == false) {
				updateStruct.setRCV_ISSUE_CTRL_CD(_rcvIssueCtrlCd);
				entity.mT_PAST_ONEROUS_CONS.update(conn, updateStruct);
			} else {
				updateStruct.setRCV_ISSUE_CTRL_CD(null);
				entity.mupdateT_PAST_ONEROUS_CONS.update(conn, updateStruct);
			}
            //「品目番号」、[在庫ロット番号]コントロールの値が、[ロット管理]に存在しない場合はエラー
            if(!itemList.isEmpty())
            {
                AE0100010Struct struct_LOT_CTRL_FLG=(AE0100010Struct)itemList.get(0);
                
                List list_MODIFY_COUNT=entity.mselectT_LOT_CTRL.read(conn, struct);
                if((struct.getLOT_NO()!=null && !"".equals(struct.getLOT_NO()))
                        && (struct_LOT_CTRL_FLG.geth_LOT_CTRL_FLG()!=null 
                                && struct_LOT_CTRL_FLG.geth_LOT_CTRL_FLG().equals("1"))) {
                    if(list_MODIFY_COUNT.isEmpty()) {
                        setErrorMessage("ZZ06001");
                        setErrorParameter("T_LOT_CTRL", "ITEM_CD", struct.getITEM_CD());
                        setErrorParameter("T_LOT_CTRL", "LOT_NO", struct.getLOT_NO());
                        return;
                    } else {
                        AE0100010Struct modStruct = (AE0100010Struct)list_MODIFY_COUNT.get(0);
                        if(struct.geth_LOT_NO_2()==null || "".equals(struct.geth_LOT_NO_2())) {
                            struct.setDEL_FLG("0");
                            entity.mselectT_LOT_CTRL.update(conn,struct);
                        } else {
                            if(!modStruct.getLOT_MODIFY_COUNT().equals(struct_MODIFY_COUNT.getLOT_MODIFY_COUNT())) {
/*                                setErrorMessage("ZZ01105");
                                return;*/
                            } else {
                                struct.setDEL_FLG("0");
                                entity.mselectT_LOT_CTRL.update(conn,struct);
                            } 
                        }
                    }
                }
            }
			// エラーがあれば終了
			if (msgStruct.hasError()) {
				return;
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
		} finally {
			if (conn != null) {
				conn.rollback();
			}
		}
                //}}user_implement_dev:<controlUpdate>
		logger.exiting("AE0100010Control"+":USER="+struct.getsUser_ID(),"controlUpdate");

		return;
	}

	/**
	 * 削除ボタン押下時に実行される処理です。
	 *
	 */
	public void controlDelete() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0100");
		logger.entering("AE0100010Control"+":USER="+struct.getsUser_ID(),"controlDelete");
			//{{user_implement_dev:<controlDelete>
			// TODO: ユーザ定義のコードを記述してください
		try {
			_rcvIssueCtrlCd = null;
			
			// 生産側の過去の実績入力の制限チェック
			if(getSysParameter() == false){
				if(chkProcExecDate("3",struct.geth_ISSUE_DATE(),struct.getISSUE_DATE()) == false){
					setErrorMessage(ProcExecDateError);
					setErrorParameter("SYS_ACTUAL_COST_CTRL_AC", "PLANT_CD", struct.getPLANT_CD());
					setErrorParameter("SYS_ACTUAL_COST_CTRL_AC", "PROC_EXEC_DATE", struct.getPROC_EXEC_DATE().toString());
					return;
				}
			}
			
			AE0100010Struct formStruct = new AE0100010Struct();
			formStruct.setStruct(struct);
			
			// 有償支給履歴番号をキーに再読込とロック
			List puchOdrRtnRsltList = entity.mT_PAST_ONEROUS_CONS_LOCK.read(conn, struct);
			if (puchOdrRtnRsltList.isEmpty()) {
				setErrorMessage("ZZ06001");
				setErrorParameter("T_PAST_ONEROUS_CONS", "ONEROUS_CONS_NO", struct.getONEROUS_CONS_NO());
				return;
			}
			AE0100010Struct pastOnerousConsStruct = (AE0100010Struct)(puchOdrRtnRsltList.get(0));
			
			// [有償支給履歴]の更新数が異なる場合エラー
			if ((pastOnerousConsStruct.getMODIFY_COUNT()).equals(
					formStruct.getMODIFY_COUNT()) == false) {
				setErrorMessage("ZZ01105");
				return;
			}
			
			// 有償支給在庫管理区分が存在しない場合
			AE0100010Struct parameterStruct = new AE0100010Struct();
			parameterStruct.setNAME(sysPLANT_CD + "_ONEROUS_CONS_INV_TYP");
			List parameterList = entity.mSYS_PARAMETER.read(conn, parameterStruct);
			if (parameterList.isEmpty()) {
				setErrorMessage("AE00141");
				setErrorParameter("SYS_PARAMETER", "NAME", parameterStruct.getNAME());
			}
			
			// エラーがあれば終了
			if (msgStruct.hasError()) {
				return;
			}
			// 「取引先在庫を更新する」がONの場合
			if ("true".equals(struct.getc_ONEROUS_CONS_INV_TYP())) {
				parameterStruct = (AE0100010Struct)(parameterList.get(0));
				if ("TRUE".equals((parameterStruct.getVALUE()).toUpperCase()) == false) {
					setErrorMessage("AE00140");
					setErrorParameter("SYS_PARAMETER", "NAME", parameterStruct.getNAME());
					setErrorParameter("SYS_PARAMETER", "VALUE", parameterStruct.getVALUE());
				}
			}
			
			//
			if ("true".equals(struct.getc_ONEROUS_CONS_INV_TYP())) {
				// 取引先保管区の存在チェック
				AE0100010Struct whStruct = new AE0100010Struct();
				whStruct.setWH_CD(null);
				whStruct.setVEND_CD(struct.getVEND_CD());
				whStruct.setPLANT_CD(sysPLANT_CD);
				List whList = entity.mM_WH.read(conn, whStruct);
				if (whList.isEmpty()) {
					// エラー
					setErrorMessage("AE00139");
					setErrorParameter("M_WH", "WH_CD", struct.getWH_CD());
				}
			}
			// エラーがあれば終了
			if (msgStruct.hasError()) {
				return;
			}
			
			// 在庫更新
			updateStock(conn, formStruct, pastOnerousConsStruct, 2);
			
			if ("true".equals(formStruct.getc_ONEROUS_CONS_INV_TYP())) {
				// 取引先保管区在庫更新
				updateStock(conn, formStruct, pastOnerousConsStruct, 31);
			}
			
			// 有償支給履歴削除
			entity.mT_PAST_ONEROUS_CONS.delete(conn, struct);

			conn.commit();
			
			initializeAll();
			
		} catch(ParseException e) {
			throw new ExpjException(e);
		} catch(DataNotFoundException e) {
			throw new ExpjException(e);
		} catch(SQLException e) {
			throw new ExpjException(e);
		} finally {
			if (conn != null) {
				conn.rollback();
			}
		}
                //}}user_implement_dev:<controlDelete>
		logger.exiting("AE0100010Control"+":USER="+struct.getsUser_ID(),"controlDelete");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0100");
		logger.entering("AE0100010Control"+":USER="+struct.getsUser_ID(),"controlClear");
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
		logger.exiting("AE0100010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * ロット管理ボタン押下時に実行される処理です。
	 *
	 */
	public void controlLotCtrl() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0100");
		logger.entering("AE0100010Control"+":USER="+struct.getsUser_ID(),"controlLotCtrl");
			//{{user_implement_dev:<controlLotCtrl>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlLotCtrl>
		logger.exiting("AE0100010Control"+":USER="+struct.getsUser_ID(),"controlLotCtrl");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0100");
		logger.entering("AE0100010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AE0100010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0100");
		logger.entering("AE0100010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
			// TODO: ユーザ定義のコードを記述してください
		try {
			
			// [自社]情報を部品より取得			
			_myCompanyStruct = MyCompanyControl.getData(conn);
			
			// コンボボックスデータを部品より取得
			ComboBox cdac = new ComboBox(conn, sysUSER_CD);
			_unitCostTypStruct = cdac.getData("UNIT_COST_TYP");
			cdac.setConnection(null);
			
			// 画面を初期化
			initializeAll();
			//システム導入フラグ取得
			_lotCtrlFlg = LotCtrl.checkLotCtrl(conn);
			// 画面遷移の呼び出しだったら、Structに画面遷移キーを設定してcontrolselect()を呼び出す
			if (isScreenMove() == true) {
				// キーとなる項目をstructに格納して、検索のコントロールメソッドを呼び出します。
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
		logger.exiting("AE0100010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * イベントハンドラの前処理です。
	 *
	 * @param buttun ボタン名
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0100");
		logger.entering("AE0100010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			ComboBox cdac = new ComboBox(conn, sysUSER_CD);
			_unitCostTypStruct = cdac.getData("UNIT_COST_TYP");
			cdac.setConnection(null);
		} catch (SQLException e) {
			throw new ExpjException(e);
		} catch (ComboException e) {
			throw new ExpjException(e);
		}
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("AE0100010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("LotCtrl") ) {
				controlLotCtrl();
			} else if( button.equals("initial") ) {
				controlINITIAL();
			} else if( button.equals("reload") ) {
				controlRELOAD();
			}
		//{{user_implement_dev:<control_eventHandller>
			// TODO: ユーザ定義のコードを記述してください
			if (_lotCtrlFlg == true) {
				struct.seth_LOTCTRL("true");
			} else {
				struct.seth_LOTCTRL("false");
			}
//		ソース内にまだAlarmMessageExceptionが残っている場合は、以下の行のコメントを外してAlarmMessageExceptionを始末する。
//		} catch(AlarmMessageException ame){
//			ExpjException ee = new ExpjException(ame, (ExpjMessageList)((Object)ame.getMessages()));
//			throw ee;
			struct.setCOMPANY_CD(_myCompanyStruct.getCOMPANY_CD());
			struct.setList_UNIT_COST_TYP_val(_unitCostTypStruct.getValList());
			struct.setList_UNIT_COST_TYP_name(_unitCostTypStruct.getExplanList());
                //}}user_implement_dev:<control_eventHandller>
		} catch( BusinessLockException ble ) {
			// 枠メッセージ出力依頼作成
			setNewDataFlg(false);
		} catch( ResourceBusyException rbe ) {
			ExpjException ee = new ExpjException(rbe, "ZZ01105");
			throw ee;
		} catch( FoundationException e ) {
//			e.printStackTrace();
//			throw new FoundationException("AE0100010Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AE0100010-E999","CSVの出力処理"));
			throw new FoundationException("AE0100010Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AE0100010-E999","システム日付の取得処理"));
				throw new FoundationException("AE0100010Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AE0100010-E999","コントロールのイベント処理"));
			throw new FoundationException("AE0100010Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected AE0100010Entity entity;
	protected AE0100010Struct struct;
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

		entity = new AE0100010Entity();
		struct = new AE0100010Struct();

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
	 * AE0100010クラスの標準コンストラクタ
	 */
	public AE0100010Control() throws BusinessProcessException, FoundationException
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
				AE0100010Struct key = (AE0100010Struct)keyList.get(j);
				// メッセージキーを作成する
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("UNIT_COST_TYP_name") && key.getUNIT_COST_TYP_name() != null) {
					msgKey.setKeyValue("UNIT_COST_TYP_name", key.getUNIT_COST_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("UNIT_COST_TYP_val") && key.getUNIT_COST_TYP_val() != null) {
					msgKey.setKeyValue("UNIT_COST_TYP_val", key.getUNIT_COST_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("SelectUnitCostFlag") && key.getSelectUnitCostFlag() != null) {
					msgKey.setKeyValue("SelectUnitCostFlag", key.getSelectUnitCostFlag());
				}
				if(msgKeyType.containsKeyColumn("r1_FILTER") && key.getr1_FILTER() != null) {
					msgKey.setKeyValue("r1_FILTER", key.getr1_FILTER());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_AMOUNT") && key.getPUCH_ODR_AMOUNT() != null) {
					msgKey.setKeyValue("PUCH_ODR_AMOUNT", key.getPUCH_ODR_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("r2_FILTER") && key.getr2_FILTER() != null) {
					msgKey.setKeyValue("r2_FILTER", key.getr2_FILTER());
				}
				if(msgKeyType.containsKeyColumn("r3_FILTER") && key.getr3_FILTER() != null) {
					msgKey.setKeyValue("r3_FILTER", key.getr3_FILTER());
				}
				if(msgKeyType.containsKeyColumn("c_ONEROUS_CONS_INV_TYP") && key.getc_ONEROUS_CONS_INV_TYP() != null) {
					msgKey.setKeyValue("c_ONEROUS_CONS_INV_TYP", key.getc_ONEROUS_CONS_INV_TYP());
				}
				if(msgKeyType.containsKeyColumn("h_ONEROUS_CONS_NO") && key.geth_ONEROUS_CONS_NO() != null) {
					msgKey.setKeyValue("h_ONEROUS_CONS_NO", key.geth_ONEROUS_CONS_NO());
				}
				if(msgKeyType.containsKeyColumn("h_ISSUE_DATE") && key.geth_ISSUE_DATE() != null) {
					msgKey.setKeyValue("h_ISSUE_DATE", key.geth_ISSUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("h_LOT_NO_2") && key.geth_LOT_NO_2() != null) {
					msgKey.setKeyValue("h_LOT_NO_2", key.geth_LOT_NO_2());
				}
				if(msgKeyType.containsKeyColumn("h_LOTCTRL") && key.geth_LOTCTRL() != null) {
					msgKey.setKeyValue("h_LOTCTRL", key.geth_LOTCTRL());
				}
				if(msgKeyType.containsKeyColumn("ONEROUS_CONS_NO") && key.getONEROUS_CONS_NO() != null) {
					msgKey.setKeyValue("ONEROUS_CONS_NO", key.getONEROUS_CONS_NO());
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
				if(msgKeyType.containsKeyColumn("ROUND_TYP") && key.getROUND_TYP() != null) {
					msgKey.setKeyValue("ROUND_TYP", key.getROUND_TYP());
				}
				if(msgKeyType.containsKeyColumn("VEND_CUR_UNIT") && key.getVEND_CUR_UNIT() != null) {
					msgKey.setKeyValue("VEND_CUR_UNIT", key.getVEND_CUR_UNIT());
				}
				if(msgKeyType.containsKeyColumn("VEND_DECIMAL_FIG") && key.getVEND_DECIMAL_FIG() != null) {
					msgKey.setKeyValue("VEND_DECIMAL_FIG", key.getVEND_DECIMAL_FIG());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_CD") && key.getJOB_ODR_CD() != null) {
					msgKey.setKeyValue("JOB_ODR_CD", key.getJOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_DETAIL_NO") && key.getJOB_ODR_DETAIL_NO() != null) {
					msgKey.setKeyValue("JOB_ODR_DETAIL_NO", key.getJOB_ODR_DETAIL_NO());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_NAME") && key.getITEM_NAME() != null) {
					msgKey.setKeyValue("ITEM_NAME", key.getITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_DATE") && key.getISSUE_DATE() != null) {
					msgKey.setKeyValue("ISSUE_DATE", key.getISSUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_QTY") && key.getISSUE_QTY() != null) {
					msgKey.setKeyValue("ISSUE_QTY", key.getISSUE_QTY());
				}
				if(msgKeyType.containsKeyColumn("UNIT_COST") && key.getUNIT_COST() != null) {
					msgKey.setKeyValue("UNIT_COST", key.getUNIT_COST());
				}
				if(msgKeyType.containsKeyColumn("UNIT_COST_TYP") && key.getUNIT_COST_TYP() != null) {
					msgKey.setKeyValue("UNIT_COST_TYP", key.getUNIT_COST_TYP());
				}
				if(msgKeyType.containsKeyColumn("ONEROUS_CONS_COMMENT") && key.getONEROUS_CONS_COMMENT() != null) {
					msgKey.setKeyValue("ONEROUS_CONS_COMMENT", key.getONEROUS_CONS_COMMENT());
				}
				if(msgKeyType.containsKeyColumn("LOT_NO") && key.getLOT_NO() != null) {
					msgKey.setKeyValue("LOT_NO", key.getLOT_NO());
				}
				if(msgKeyType.containsKeyColumn("VEND_LOT_NO") && key.getVEND_LOT_NO() != null) {
					msgKey.setKeyValue("VEND_LOT_NO", key.getVEND_LOT_NO());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_CTRL_CD") && key.getRCV_ISSUE_CTRL_CD() != null) {
					msgKey.setKeyValue("RCV_ISSUE_CTRL_CD", key.getRCV_ISSUE_CTRL_CD());
				}
				if(msgKeyType.containsKeyColumn("WORK_ODR_CD") && key.getWORK_ODR_CD() != null) {
					msgKey.setKeyValue("WORK_ODR_CD", key.getWORK_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("WORK_IN_PROC_CD") && key.getWORK_IN_PROC_CD() != null) {
					msgKey.setKeyValue("WORK_IN_PROC_CD", key.getWORK_IN_PROC_CD());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_CD") && key.getPUCH_ODR_CD() != null) {
					msgKey.setKeyValue("PUCH_ODR_CD", key.getPUCH_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_INST_CD") && key.getISSUE_INST_CD() != null) {
					msgKey.setKeyValue("ISSUE_INST_CD", key.getISSUE_INST_CD());
				}
				if(msgKeyType.containsKeyColumn("RETURNED_WH_CD") && key.getRETURNED_WH_CD() != null) {
					msgKey.setKeyValue("RETURNED_WH_CD", key.getRETURNED_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("WH_NAME") && key.getWH_NAME() != null) {
					msgKey.setKeyValue("WH_NAME", key.getWH_NAME());
				}
				if(msgKeyType.containsKeyColumn("RETURNED_CAUSE_CD") && key.getRETURNED_CAUSE_CD() != null) {
					msgKey.setKeyValue("RETURNED_CAUSE_CD", key.getRETURNED_CAUSE_CD());
				}
				if(msgKeyType.containsKeyColumn("RETURNED_GNR_TYP") && key.getRETURNED_GNR_TYP() != null) {
					msgKey.setKeyValue("RETURNED_GNR_TYP", key.getRETURNED_GNR_TYP());
				}
				if(msgKeyType.containsKeyColumn("AP_PROC_TYP") && key.getAP_PROC_TYP() != null) {
					msgKey.setKeyValue("AP_PROC_TYP", key.getAP_PROC_TYP());
				}
				if(msgKeyType.containsKeyColumn("MODIFY_COUNT") && key.getMODIFY_COUNT() != null) {
					msgKey.setKeyValue("MODIFY_COUNT", key.getMODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT") && key.getSTOCK_UNIT() != null) {
					msgKey.setKeyValue("STOCK_UNIT", key.getSTOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("h_LOT_CTRL_FLG") && key.geth_LOT_CTRL_FLG() != null) {
					msgKey.setKeyValue("h_LOT_CTRL_FLG", key.geth_LOT_CTRL_FLG());
				}
				if(msgKeyType.containsKeyColumn("h_LOT_NUMBERING_TYP") && key.geth_LOT_NUMBERING_TYP() != null) {
					msgKey.setKeyValue("h_LOT_NUMBERING_TYP", key.geth_LOT_NUMBERING_TYP());
				}
				if(msgKeyType.containsKeyColumn("THIS_MONTH") && key.getTHIS_MONTH() != null) {
					msgKey.setKeyValue("THIS_MONTH", key.getTHIS_MONTH());
				}
				if(msgKeyType.containsKeyColumn("INSTALL_FLG") && key.getINSTALL_FLG() != null) {
					msgKey.setKeyValue("INSTALL_FLG", key.getINSTALL_FLG());
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
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP") && key.getMRP_ODR_TYP() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP", key.getMRP_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("WH_CD") && key.getWH_CD() != null) {
					msgKey.setKeyValue("WH_CD", key.getWH_CD());
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
				if(msgKeyType.containsKeyColumn("MRP_FLG") && key.getMRP_FLG() != null) {
					msgKey.setKeyValue("MRP_FLG", key.getMRP_FLG());
				}
				if(msgKeyType.containsKeyColumn("VALUE") && key.getVALUE() != null) {
					msgKey.setKeyValue("VALUE", key.getVALUE());
				}
				if(msgKeyType.containsKeyColumn("NAME") && key.getNAME() != null) {
					msgKey.setKeyValue("NAME", key.getNAME());
				}
				if(msgKeyType.containsKeyColumn("EFF_PHASE_IN_DATE") && key.getEFF_PHASE_IN_DATE() != null) {
					msgKey.setKeyValue("EFF_PHASE_IN_DATE", key.getEFF_PHASE_IN_DATE());
				}
				if(msgKeyType.containsKeyColumn("ONEROUS_FLG") && key.getONEROUS_FLG() != null) {
					msgKey.setKeyValue("ONEROUS_FLG", key.getONEROUS_FLG());
				}
				if(msgKeyType.containsKeyColumn("STOCK_ON_HAND_QTY") && key.getSTOCK_ON_HAND_QTY() != null) {
					msgKey.setKeyValue("STOCK_ON_HAND_QTY", key.getSTOCK_ON_HAND_QTY());
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
				if(msgKeyType.containsKeyColumn("PAST_RESULT_ENTRY_TYP") && key.getPAST_RESULT_ENTRY_TYP() != null) {
					msgKey.setKeyValue("PAST_RESULT_ENTRY_TYP", key.getPAST_RESULT_ENTRY_TYP());
				}
				if(msgKeyType.containsKeyColumn("BEST_BEFORE_DATE") && key.getBEST_BEFORE_DATE() != null) {
					msgKey.setKeyValue("BEST_BEFORE_DATE", key.getBEST_BEFORE_DATE());
				}
				if(msgKeyType.containsKeyColumn("LOT_MODIFY_COUNT") && key.getLOT_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("LOT_MODIFY_COUNT", key.getLOT_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("DEL_FLG") && key.getDEL_FLG() != null) {
					msgKey.setKeyValue("DEL_FLG", key.getDEL_FLG());
				}
				if(msgKeyType.containsKeyColumn("PRD_CMPLT_DATE") && key.getPRD_CMPLT_DATE() != null) {
					msgKey.setKeyValue("PRD_CMPLT_DATE", key.getPRD_CMPLT_DATE());
				}
				if(msgKeyType.containsKeyColumn("LOT_STOCK_ON_HAND_QTY") && key.getLOT_STOCK_ON_HAND_QTY() != null) {
					msgKey.setKeyValue("LOT_STOCK_ON_HAND_QTY", key.getLOT_STOCK_ON_HAND_QTY());
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
					AE0100010Struct key = new AE0100010Struct();
					if(msgKeyType.containsKeyColumn("UNIT_COST_TYP_name")) {
						key.setUNIT_COST_TYP_name(msgKey.getKeyValue("UNIT_COST_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_COST_TYP_val")) {
						key.setUNIT_COST_TYP_val(msgKey.getKeyValue("UNIT_COST_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("SelectUnitCostFlag")) {
						key.setSelectUnitCostFlag(msgKey.getKeyValue("SelectUnitCostFlag"));
					}
					if(msgKeyType.containsKeyColumn("r1_FILTER")) {
						key.setr1_FILTER(msgKey.getKeyValue("r1_FILTER"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_AMOUNT")) {
						key.setPUCH_ODR_AMOUNT(msgKey.getKeyValue("PUCH_ODR_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("r2_FILTER")) {
						key.setr2_FILTER(msgKey.getKeyValue("r2_FILTER"));
					}
					if(msgKeyType.containsKeyColumn("r3_FILTER")) {
						key.setr3_FILTER(msgKey.getKeyValue("r3_FILTER"));
					}
					if(msgKeyType.containsKeyColumn("c_ONEROUS_CONS_INV_TYP")) {
						key.setc_ONEROUS_CONS_INV_TYP(msgKey.getKeyValue("c_ONEROUS_CONS_INV_TYP"));
					}
					if(msgKeyType.containsKeyColumn("h_ONEROUS_CONS_NO")) {
						key.seth_ONEROUS_CONS_NO(msgKey.getKeyValue("h_ONEROUS_CONS_NO"));
					}
					if(msgKeyType.containsKeyColumn("h_ISSUE_DATE")) {
						key.seth_ISSUE_DATE(msgKey.getKeyValue("h_ISSUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("h_LOT_NO_2")) {
						key.seth_LOT_NO_2(msgKey.getKeyValue("h_LOT_NO_2"));
					}
					if(msgKeyType.containsKeyColumn("h_LOTCTRL")) {
						key.seth_LOTCTRL(msgKey.getKeyValue("h_LOTCTRL"));
					}
					if(msgKeyType.containsKeyColumn("ONEROUS_CONS_NO")) {
						key.setONEROUS_CONS_NO(msgKey.getKeyValue("ONEROUS_CONS_NO"));
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
					if(msgKeyType.containsKeyColumn("ROUND_TYP")) {
						key.setROUND_TYP(msgKey.getKeyValue("ROUND_TYP"));
					}
					if(msgKeyType.containsKeyColumn("VEND_CUR_UNIT")) {
						key.setVEND_CUR_UNIT(msgKey.getKeyValue("VEND_CUR_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("VEND_DECIMAL_FIG")) {
						key.setVEND_DECIMAL_FIG(msgKey.getKeyValue("VEND_DECIMAL_FIG"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_CD")) {
						key.setJOB_ODR_CD(msgKey.getKeyValue("JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_DETAIL_NO")) {
						key.setJOB_ODR_DETAIL_NO(msgKey.getKeyValue("JOB_ODR_DETAIL_NO"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_NAME")) {
						key.setITEM_NAME(msgKey.getKeyValue("ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_DATE")) {
						key.setISSUE_DATE(msgKey.getKeyValue("ISSUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_QTY")) {
						key.setISSUE_QTY(msgKey.getKeyValue("ISSUE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_COST")) {
						key.setUNIT_COST(msgKey.getKeyValue("UNIT_COST"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_COST_TYP")) {
						key.setUNIT_COST_TYP(msgKey.getKeyValue("UNIT_COST_TYP"));
					}
					if(msgKeyType.containsKeyColumn("ONEROUS_CONS_COMMENT")) {
						key.setONEROUS_CONS_COMMENT(msgKey.getKeyValue("ONEROUS_CONS_COMMENT"));
					}
					if(msgKeyType.containsKeyColumn("LOT_NO")) {
						key.setLOT_NO(msgKey.getKeyValue("LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("VEND_LOT_NO")) {
						key.setVEND_LOT_NO(msgKey.getKeyValue("VEND_LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_CTRL_CD")) {
						key.setRCV_ISSUE_CTRL_CD(msgKey.getKeyValue("RCV_ISSUE_CTRL_CD"));
					}
					if(msgKeyType.containsKeyColumn("WORK_ODR_CD")) {
						key.setWORK_ODR_CD(msgKey.getKeyValue("WORK_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("WORK_IN_PROC_CD")) {
						key.setWORK_IN_PROC_CD(msgKey.getKeyValue("WORK_IN_PROC_CD"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_CD")) {
						key.setPUCH_ODR_CD(msgKey.getKeyValue("PUCH_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_INST_CD")) {
						key.setISSUE_INST_CD(msgKey.getKeyValue("ISSUE_INST_CD"));
					}
					if(msgKeyType.containsKeyColumn("RETURNED_WH_CD")) {
						key.setRETURNED_WH_CD(msgKey.getKeyValue("RETURNED_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("WH_NAME")) {
						key.setWH_NAME(msgKey.getKeyValue("WH_NAME"));
					}
					if(msgKeyType.containsKeyColumn("RETURNED_CAUSE_CD")) {
						key.setRETURNED_CAUSE_CD(msgKey.getKeyValue("RETURNED_CAUSE_CD"));
					}
					if(msgKeyType.containsKeyColumn("RETURNED_GNR_TYP")) {
						key.setRETURNED_GNR_TYP(msgKey.getKeyValue("RETURNED_GNR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("AP_PROC_TYP")) {
						key.setAP_PROC_TYP(msgKey.getKeyValue("AP_PROC_TYP"));
					}
					if(msgKeyType.containsKeyColumn("MODIFY_COUNT")) {
						key.setMODIFY_COUNT(msgKey.getKeyValue("MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT")) {
						key.setSTOCK_UNIT(msgKey.getKeyValue("STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("h_LOT_CTRL_FLG")) {
						key.seth_LOT_CTRL_FLG(msgKey.getKeyValue("h_LOT_CTRL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("h_LOT_NUMBERING_TYP")) {
						key.seth_LOT_NUMBERING_TYP(msgKey.getKeyValue("h_LOT_NUMBERING_TYP"));
					}
					if(msgKeyType.containsKeyColumn("THIS_MONTH")) {
						key.setTHIS_MONTH(msgKey.getKeyValue("THIS_MONTH"));
					}
					if(msgKeyType.containsKeyColumn("INSTALL_FLG")) {
						key.setINSTALL_FLG(msgKey.getKeyValue("INSTALL_FLG"));
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
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP")) {
						key.setMRP_ODR_TYP(msgKey.getKeyValue("MRP_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("WH_CD")) {
						key.setWH_CD(msgKey.getKeyValue("WH_CD"));
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
					if(msgKeyType.containsKeyColumn("MRP_FLG")) {
						key.setMRP_FLG(msgKey.getKeyValue("MRP_FLG"));
					}
					if(msgKeyType.containsKeyColumn("VALUE")) {
						key.setVALUE(msgKey.getKeyValue("VALUE"));
					}
					if(msgKeyType.containsKeyColumn("NAME")) {
						key.setNAME(msgKey.getKeyValue("NAME"));
					}
					if(msgKeyType.containsKeyColumn("EFF_PHASE_IN_DATE")) {
						key.setEFF_PHASE_IN_DATE(msgKey.getKeyValue("EFF_PHASE_IN_DATE"));
					}
					if(msgKeyType.containsKeyColumn("ONEROUS_FLG")) {
						key.setONEROUS_FLG(msgKey.getKeyValue("ONEROUS_FLG"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_ON_HAND_QTY")) {
						key.setSTOCK_ON_HAND_QTY(msgKey.getKeyValue("STOCK_ON_HAND_QTY"));
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
					if(msgKeyType.containsKeyColumn("PAST_RESULT_ENTRY_TYP")) {
						key.setPAST_RESULT_ENTRY_TYP(msgKey.getKeyValue("PAST_RESULT_ENTRY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("BEST_BEFORE_DATE")) {
						key.setBEST_BEFORE_DATE(msgKey.getKeyValue("BEST_BEFORE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("LOT_MODIFY_COUNT")) {
						key.setLOT_MODIFY_COUNT(msgKey.getKeyValue("LOT_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("DEL_FLG")) {
						key.setDEL_FLG(msgKey.getKeyValue("DEL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("PRD_CMPLT_DATE")) {
						key.setPRD_CMPLT_DATE(msgKey.getKeyValue("PRD_CMPLT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("LOT_STOCK_ON_HAND_QTY")) {
						key.setLOT_STOCK_ON_HAND_QTY(msgKey.getKeyValue("LOT_STOCK_ON_HAND_QTY"));
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
