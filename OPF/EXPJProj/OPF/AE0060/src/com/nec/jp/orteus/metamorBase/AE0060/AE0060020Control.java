/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AE0060/src/com/nec/jp/orteus/metamorBase/AE0060/AE0060020Control.java,v $
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
import com.nec.jp.orteus.metamorBase.common08.LotCtrl.LotCtrl;

import java.math.BigDecimal;
import java.math.BigInteger;
import com.nec.jp.orteus.metamorBase.common.CollectNumber.CollectNumber;
import com.nec.jp.orteus.expj.pr.rcvissue.process.IssueRemain;
import com.nec.jp.orteus.expj.pr.rcvissue.util.StringUtil;
import com.nec.jp.orteus.expj.lot.BizCommon;
import com.nec.jp.orteus.metamorBase.common01.Accessor.ProductStructureRepository;
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AE0060020Control
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
	public AE0060020Struct getListvalue(int x) {
		return (AE0060020Struct) (this.list.get(x));
	} // リストの値を返します。
	public AE0060020Struct getStruct() {
		return this.struct;
	} // Structを返します。
	public AE0060020Struct createStruct() {
		return new AE0060020Struct();
	} // 新しいStructを作って返します。
	public void setStruct(Object structname) {
		this.struct.setStruct((AE0060020Struct) structname);
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
	/** 次に遷移する画面のURL */
	private String _nextUrl = null;
	//発注番号
	//private String msg_puch_Odr_Cd = null;
	
	/** [自社]情報 */
	private MyCompanyStruct _myCompanyStruct = new MyCompanyStruct();
	/** [税名]情報 */
	private TaxNameStruct _taxNameStruct = new TaxNameStruct();
	/** [邦貨]情報 */
	private HomeCurStruct _homeCurStruct = new HomeCurStruct();
	/** [コンボボックスデータ]情報（単価区分） */
	private ComboStruct _unitCostTypStruct = new ComboStruct();
	/** [コンボボックスデータ]情報（品目手配区分） */
	private ComboStruct _mrpodrTypStruct = new ComboStruct();
	/** システム導入フラグ*/
	private boolean _lotCtrlFlg;
	/** 子画面で行う操作 */
	private String operationMode = null;
	/** 子画面の操作が登録であることを表す定数 */
	static final private String INSERT = "INSERT";
	/** 子画面の操作が更新であることを表す定数 */
	static final private String UPDATE = "UPDATE";
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
		param.append(".");
		param.append(columnName);
		param.append(":");
		if (value != null) {
			param.append(value);
		}

		ExpjMessage emsg = new ExpjMessage("ZZ01006", param.toString());
		msgStruct.addError(emsg);
		sysLog.warning(emsg, sysUSER_CD);
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
	 * 次に遷移する画面のURLを取得します。
	 */
	public String getNextUrl() {
		return _nextUrl;
	}
	/**
	 * 次に遷移する画面のURLを設定します。
	 */
	public void setNextUrl(String url) {
		_nextUrl = url;
	}

	/**
	 * 子画面で行う作業モードを返します。
	 * @return 作業モード（INSERT/UPDATE）
	 */
	public String getOperationMode() {
		return operationMode;
	}

	private List issueList = new ArrayList();
	// private AE0060020Struct issueStruct = new AE0060020Struct();
	private AE0060020Struct wkStruct = new AE0060020Struct();

	/** 
	 * 出庫一覧の取得
	 * @return 出庫一覧
	 */
	public List getIssueList() {
		return this.issueList;
	}

	/**
	 * 出庫一覧のサイズの取得
	 * @return 出庫一覧のサイズ
	 */
	public int getIssueListsize() {
		int nret = 0;
		if( this.issueList != null ) {
			nret = this.issueList.size();
		}
		return nret;
	}
	/**
	 * 出庫一覧の値の取得
	 * @param x x番目の値
	 * @return リストの値
	 */
	public AE0060020Struct getIssueListvalue(int x) { 
		return (AE0060020Struct)(this.list.get(x)); 
	}

	/**
	 * Structの値をセットします。
	 * @param s 検索したデータ
	 */
	private void setStruct(AE0060020Struct s) {
		struct.setPUCH_ODR_CD(s.getPUCH_ODR_CD());		// 発注番号
		struct.setPUCH_ODR_MODIFY_COUNT(s.getPUCH_ODR_MODIFY_COUNT());		// 更新数

		struct.setSTOCK_UNIT(s.getSTOCK_UNIT());		// 計量単価

		struct.setITEM_CD(s.getITEM_CD());				// 品目番号
		struct.setITEM_CD_LOT(s.getITEM_CD());
		struct.setITEM_NAME(s.getITEM_NAME());			// 品目名
		struct.setJOB_ODR_CD(s.getJOB_ODR_CD());		// 製番
		struct.setDRAW_CD(s.getDRAW_CD());				// 図面番号
		struct.setSPEC(s.getSPEC());					// 規格
		struct.setUNIT_QTY_TYP_DN(s.getUNIT_QTY_TYP_DN());		// 在庫数単位区分(コンボ)
		struct.setUNIT_QTY_TYP(s.getUNIT_QTY_TYP());			// 在庫数単位区分
		struct.setVEND_CD(s.getVEND_CD());				// 取引先コード
		struct.setVEND_NAME(s.getVEND_NAME());			// 取引先名
		struct.setPUCH_ODR_QTY(s.getPUCH_ODR_QTY());	// 発注数
		struct.setSUM_ACPT_QTY(s.getSUM_ACPT_QTY());	// 合計受入数
		struct.setACPT_INSPC_TYP_DN(s.getACPT_INSPC_TYP_DN());			// 発注時受入検査区分(コンボ)
		struct.setACPT_INSPC_TYP(s.getACPT_INSPC_TYP());				// 発注時受入検査区分
		struct.setPUCH_ODR_SLIP_ISS_DATE(s.getPUCH_ODR_SLIP_ISS_DATE());		// 発注伝票発効日
		struct.setPUCH_ODR_DLV_DATE(s.getPUCH_ODR_DLV_DATE());			// 発注納期
		struct.setCONFIRM_DLV_DATE(s.getCONFIRM_DLV_DATE());			// 回答納期
		struct.setWORK_IN_PROC_CD(s.getWORK_IN_PROC_CD());				// 仕掛作業コード
		struct.setPROC_NAME(s.getPROC_NAME());			// 仕掛作業名
		struct.setPUCH_ODR_PERSON(s.getPUCH_ODR_PERSON());		// 発注担当者
		struct.setUSER_NAME(s.getUSER_NAME());			// ユーザ名
		struct.setPUCH_ODR_STS_TYP_DN(s.getPUCH_ODR_STS_TYP_DN());		// 発注状態区分(コンボ)
		struct.setPUCH_ODR_STS_TYP(s.getPUCH_ODR_STS_TYP());			// 発注状態区分
		struct.setINSPC_CMPLT_FLG_DN(s.getINSPC_CMPLT_FLG_DN());		// 検査完了フラグ(コンボ)
		struct.setINSPC_CMPLT_FLG(s.getINSPC_CMPLT_FLG());				// 検査完了フラグ
		struct.setSPL_ITEM_TYP_DN(s.getSPL_ITEM_TYP_DN());		// 受給品区分(コンボ)
		struct.setSPL_ITEM_TYP(s.getSPL_ITEM_TYP());			// 受給品区分
		struct.setPRODUCT_TYP_DN(s.getPRODUCT_TYP_DN());		// 製品区分(コンボ)
		struct.setPRODUCT_TYP(s.getPRODUCT_TYP());				// 製品区分
		struct.setNON_NO_ITEM_FLG_DN(s.getNON_NO_ITEM_FLG_DN());		// 備品発注フラグ(コンボ)
		struct.setNON_NO_ITEM_FLG(s.getNON_NO_ITEM_FLG());				// 備品発注フラグ

		struct.setPLANT_CD(s.getPLANT_CD());		// 工場コード
		struct.setTAX_CD(s.getTAX_CD());			// 消費税コード
		struct.setPUCH_ODR_START_DATE(s.getPUCH_ODR_START_DATE());		// 発注着手日
		
		struct.setPUCH_ODR_COMMENT(s.getPUCH_ODR_COMMENT());			// 発注備考
		
	}

	/**
	 * Structの値をセットします。
	 * @param s 検索したデータ
	 */
	private void setStructSub1(AE0060020Struct s) throws SQLException, FoundationException{
		struct.setPUCH_ODR_CD(s.getPUCH_ODR_CD());		// 発注番号
		struct.setACPT_NO(s.getACPT_NO());				// 受入回数
		struct.setPUCH_ODR_MODIFY_COUNT(s.getPUCH_ODR_MODIFY_COUNT());		// 更新数
		struct.setACPT_MODIFY_COUNT(s.getACPT_MODIFY_COUNT());			// 更新数
		struct.setACPT_QTY(s.getACPT_QTY());			// 受入数

		struct.seth_ACPT_QTY(s.getACPT_QTY());		// 受入数
		struct.seth_ACPT_DATE(s.getACPT_DATE());	// 受入日

		struct.setITEM_CD(s.getITEM_CD());			// 品目番号
		struct.setITEM_CD_LOT(s.getITEM_CD());                      //品目番号
		struct.seth_FINAL_PROC_FLG(s.geth_FINAL_PROC_FLG());        //最終系列フラグ
		struct.seth_LOT_CONTROL_FLG(s.geth_LOT_CONTROL_FLG());      //ロット管理フラグ
		struct.seth_LOT_NUMBERING_TYP(s.geth_LOT_NUMBERING_TYP());  //ロット番号採番区分
		struct.setITEM_NAME(s.getITEM_NAME());		// 品目名
		struct.setSTOCK_UNIT(s.getSTOCK_UNIT());	// 計量単価
		struct.setACPT_DATE(s.getACPT_DATE());		// 受入日
		struct.setVEND_LOT_NO(s.getVEND_LOT_NO());	// メーカロット番号
		if (_lotCtrlFlg) {
			struct.setLOT_NO(s.getLOT_NO());        //在庫ロット番号
		} else {
			struct.setLOT_NO(null);
		}
		struct.setWH_CD(s.getWH_CD());				// 保管区
		struct.setWH_NAME(s.getWH_NAME());			// 保管区名
		if (s.getINSPC_WH_CD() == null) {
			struct.setINSPC_WH_CD(null);				// 検査待ち保管区
			struct.setINSPC_WH_NAME(null);				// 検査待ち保管区名
		} else {
			struct.setINSPC_WH_CD(s.getINSPC_WH_CD());				// 検査待ち保管区
			struct.setINSPC_WH_NAME(s.getINSPC_WH_NAME());			// 検査待ち保管区名
		}
		struct.setCUR_CD(s.getCUR_CD());			// 通貨コード
		struct.setCUR_NAME(s.getCUR_NAME());		// 通貨名
		struct.setVEND_CUR_UNIT(s.getVEND_CUR_UNIT());		// 取引先通貨単位
		struct.setVEND_DECIMAL_FIG(s.getVEND_DECIMAL_FIG());		// 取引先小数桁数
		struct.setUNIT_COST_TYP(s.getUNIT_COST_TYP());		// 単価区分
		struct.setUNIT_COST(s.getUNIT_COST());		// 単価
		struct.setPROCESSING_COST(s.getPROCESSING_COST());		// 加工費
		struct.setMATERIAL_COST(s.getMATERIAL_COST());			// 材料費
		struct.setOTHER_OVERHEADS(s.getOTHER_OVERHEADS());		// その他経費
		struct.setPUCH_ODR_AMOUNT(s.getPUCH_ODR_AMOUNT());		// 受入金額
		struct.setDISC_AMOUNT(s.getDISC_AMOUNT());			// 値引金額
		struct.setNET_AMOUNT(s.getNET_AMOUNT());			// 本体金額
		struct.setTAX_AMOUNT_1(s.getTAX_AMOUNT_1());		// 税額1
		struct.setTAX_AMOUNT_2(s.getTAX_AMOUNT_2());		// 税額2
		struct.setTAX_AMOUNT_3(s.getTAX_AMOUNT_3());		// 税額3
		struct.setTAX_RATE_1(s.getTAX_RATE_1());		// 税率1
		struct.setTAX_RATE_2(s.getTAX_RATE_2());		// 税率2
		struct.setTAX_RATE_3(s.getTAX_RATE_3());		// 税率3
		struct.setAMOUNT_INCLUDE_TAX(s.getAMOUNT_INCLUDE_TAX());		// 税込金額
		struct.setHOME_CUR_AMOUNT(s.getHOME_CUR_AMOUNT());				// 邦貨金額
		struct.setEXCH_RATE(s.getEXCH_RATE());			// 為替レート
		struct.setDLV_CD(s.getDLV_CD());			// 納品書番号
		struct.setACPT_RSLT_COMMENT(s.getACPT_RSLT_COMMENT());		// 発注備考

		struct.setITEM_CD_DW(s.getITEM_CD());			// 品目番号(詳細ウインドウ)
		struct.setITEM_NAME_DW(s.getITEM_NAME());		// 品目名(詳細ウインドウ)
		struct.setJOB_ODR_CD(s.getJOB_ODR_CD());		// 製番
		struct.setDRAW_CD(s.getDRAW_CD());			// 図面番号
		struct.setSPEC(s.getSPEC());				// 規格
		struct.setUNIT_QTY_TYP_DN(s.getUNIT_QTY_TYP_DN());		// 在庫数単位区分(コンボ)
		struct.setUNIT_QTY_TYP(s.getUNIT_QTY_TYP());			// 在庫数単位区分
		struct.setVEND_CD(s.getVEND_CD());			// 取引先コード
		struct.setVEND_NAME(s.getVEND_NAME());		// 取引先名
		struct.setPUCH_ODR_QTY(s.getPUCH_ODR_QTY());		// 発注数
		struct.setSUM_ACPT_QTY(s.getSUM_ACPT_QTY());		// 受入累計数
		struct.setACPT_INSPC_TYP_DN(s.getACPT_INSPC_TYP_DN());		// 受入検査区分(コンボ)
		struct.setACPT_INSPC_TYP(s.getACPT_INSPC_TYP());			// 受入検査区分
		struct.setPUCH_ODR_SLIP_ISS_DATE(s.getPUCH_ODR_SLIP_ISS_DATE());		// 発注日
		struct.setPUCH_ODR_DLV_DATE(s.getPUCH_ODR_DLV_DATE());			// 発注納期
		struct.setCONFIRM_DLV_DATE(s.getCONFIRM_DLV_DATE());			// 取引先回答納期
		struct.setWORK_IN_PROC_CD(s.getWORK_IN_PROC_CD());			// 作業コード
		struct.setPROC_NAME(s.getPROC_NAME());			// 作業名
		struct.setPUCH_ODR_PERSON(s.getPUCH_ODR_PERSON());			// 発注担当者コード
		struct.setUSER_NAME(s.getUSER_NAME());			// ユーザ名
		struct.setPUCH_ODR_STS_TYP_DN(s.getPUCH_ODR_STS_TYP_DN());		// 発注状態区分(コンボ)
		struct.setPUCH_ODR_STS_TYP(s.getPUCH_ODR_STS_TYP());			// 発注区分
		struct.setINSPC_CMPLT_FLG_DN(s.getINSPC_CMPLT_FLG_DN());		// 検査完了フラグ(コンボ)
		struct.setINSPC_CMPLT_FLG(s.getINSPC_CMPLT_FLG());			// 検査完了フラグ
		struct.setSPL_ITEM_TYP_DN(s.getSPL_ITEM_TYP_DN());			// 受給品区分(コンボ)
		struct.setSPL_ITEM_TYP(s.getSPL_ITEM_TYP());			// 受給品区分
		struct.setPRODUCT_TYP_DN(s.getPRODUCT_TYP_DN());		// 製品区分(コンボ)
		struct.setPRODUCT_TYP(s.getPRODUCT_TYP());			// 製品区分
		struct.setNON_NO_ITEM_FLG_DN(s.getNON_NO_ITEM_FLG_DN());		// 備品発注フラグ(コンボ)
		struct.setNON_NO_ITEM_FLG(s.getNON_NO_ITEM_FLG());			// 備品発注フラグ

		struct.setPLANT_CD(s.getPLANT_CD());			// 工場コード
		struct.setCOMPANY_CD(s.getCOMPANY_CD());		// 会社コード
		struct.setTAX_CD(s.getTAX_CD());			// 消費税コード
		struct.setROUND_TYP(s.getROUND_TYP());		// 端数処理区分
		struct.setTAX_ROUND_TYP(s.getTAX_ROUND_TYP());		// 税端数処理区分
		struct.setPUCH_ODR_START_DATE(s.getPUCH_ODR_START_DATE());		// 発注着手日
		struct.setBUSINESS_OPR_DATE(s.getBUSINESS_OPR_DATE());			// 業務運用日

		if ("1".equals(struct.getACPT_INSPC_TYP())) {
			struct.setACPT_STS_TYP("2");		// 受入状態区分
		} else {
			struct.setACPT_STS_TYP("1");		// 受入状態区分
		}

		if ("9".equals(s.getPUCH_ODR_STS_TYP())) {
			struct.setc_COMPLETE("true");		// 全受入完了(チェックボックス)
		} else {
			struct.setc_COMPLETE(null);		// 全受入完了(チェックボックス)
		}

		// ｢発注金額｣の計算
		String puchOdrAmount =
			AmountCalculator.calcPuchOdrAmount(
				struct.getACPT_QTY(),
				struct.getUNIT_COST(),
				struct.getROUND_TYP(),
				struct.getVEND_DECIMAL_FIG());
		struct.setPUCH_ODR_AMOUNT(puchOdrAmount);
		// ｢本体金額｣の計算
		String netAmount =
			AmountCalculator.calcNetAmount(struct.getPUCH_ODR_AMOUNT(), struct.getDISC_AMOUNT());
		struct.setNET_AMOUNT(netAmount);
		
 		String lowerTaxCd =
 			struct.getTAX_CD().substring(struct.getTAX_CD().length() - 1);                
 		if (!lowerTaxCd.equals("1")) {
			//バッチパラメータ呼出
			List batList = entity.mSYS_BAT_PARM.read(conn, struct);
			if(!batList.isEmpty()){
				//税計算部品をコール
				AE0060020Struct batStruct = (AE0060020Struct)batList.get(0);
				struct.setPVC2LOGMODE(batStruct.getPVC2LOGMODE());
				struct.setPVC2OUTPUTMODE(batStruct.getPVC2OUTPUTMODE());
				struct.setPVC2OUTPUTPATH(batStruct.getPVC2OUTPUTPATH());
				struct.setPVC2OUTPUTNAME(batStruct.getPVC2OUTPUTNAME());
				struct.setPVC2USERID(this.sysUSER_CD);
				struct.setPVC2BUSINESSNAME(batStruct.getPVC2BUSINESSNAME());
				struct.setPVC2PLANTCD(this.sysPLANT_CD);
				struct.setPVC2TAXID("5");
				batList = entity.mcallSQLCALCTAXCALCAMT.call(conn, struct);
				batStruct = (AE0060020Struct)batList.get(0);
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
		
		struct.setODR_CANCEL_CAUSE_CD(s.getODR_CANCEL_CAUSE_CD());
		struct.setODR_CANCEL_SLIP_ISS_FLG(s.getODR_CANCEL_SLIP_ISS_FLG());

		struct.setTHIS_MONTH(s.getTHIS_MONTH());
		struct.setINSTALL_FLG(s.getINSTALL_FLG());
		struct.seth_ACPT_RSLT_COUNT(s.geth_ACPT_RSLT_COUNT());
		struct.seth_ODR_CANCEL_SLIP_ISS_FLG(s.getODR_CANCEL_SLIP_ISS_FLG());

	}

	/**
	 * Structの値をセットします。
	 * @param s 検索したデータ
	 */
	private void setStructSystemData(AE0060020Struct s) {
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
		struct.setPUCH_ODR_MODIFY_COUNT(null);
		struct.setACPT_NO("1");

		struct.setITEM_CD(null);
		struct.setITEM_CD_LOT(null);
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
		struct.setTAX_CD(null);
		struct.setPUCH_ODR_START_DATE(null);
	
		this.issueList.clear();
		list = null;

		readStatus = INITIAL;
	}

	/**
	 * 画面の詳細項目を初期化します。
	 */
	private void initializeDetailSub1() {
		struct.setPUCH_ODR_MODIFY_COUNT(null);
		struct.setACPT_QTY("1");
		struct.setITEM_CD(null);
		struct.setITEM_NAME(null);
		struct.setSTOCK_UNIT(null);
		struct.setACPT_DATE(null);
		struct.setVEND_LOT_NO(null);
		struct.setWH_CD(null);
		struct.setWH_NAME(null);
		struct.setINSPC_WH_CD(null);
		struct.setINSPC_WH_NAME(null);
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
		
		struct.setITEM_CD_LOT(null);
		struct.seth_LOT_NUMBERING_TYP(null);
		struct.seth_LOT_CONTROL_FLG(null);
		struct.seth_FINAL_PROC_FLG(null);
		struct.setITEM_CD_DW(null);
		struct.setITEM_NAME_DW(null);
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

		struct.setSelectUnitCostFlag("false");

		list = null;

		readStatus = INITIAL;
	}

	/**
	 * 支給品リストを設定します。
	 * @throws FoundationException
	 * @throws SQLException
	 */
	private void setIssueList() throws FoundationException, SQLException 
	{
		AE0060020Struct tempStruct = null;
		// 受入回数セット
		List acptnoList = new ArrayList();
		acptnoList = struct.getList_l_ACPT_NO();
		struct.setl_ACPT_NO((String) acptnoList.get(0));
		struct.setPUCH_ODR_CD(struct.geth_PUCH_ODR_CD());

        // 最大表示行数
        int maxLine = sp.getMaxLine(conn, 11);
		if(maxLine != 0) {
			struct.setROW_COUNT(String.valueOf(maxLine));
		} else {
			struct.setROW_COUNT(null);
		}
		this.issueList = entity.mSelectSuppliedCnt.read(conn, struct);
		long rowCount = Long.parseLong(((AE0060020Struct)issueList.get(0)).getl_COUNT());
		// 存在チェック
		if (rowCount==0)
		{
			// AE05050:選択された支給品使用実績データは存在しません。
			setWarningMessage("AE05050");
			setWarningParameter("T_PART_SUPPLIED_ISSUE", "PUCH_ODR_CD", struct.getPUCH_ODR_CD());
			setWarningParameter("T_PART_SUPPLIED_ISSUE", "ACPT_NO", struct.getl_ACPT_NO());
			// 処理を抜ける。
			if(list != null && list.size() > 0){
			this.issueList.clear();
			}
			return;
		}
		if (maxLine != 0 && rowCount == maxLine + 1) {
			if(list != null && list.size() > 0){
				this.issueList.clear();
				}
			setErrorMessage("ZZ01119",""+maxLine);
			setReadStatus(TOO_MANY);
			return;
		} 
		else {
             // 支給品情報を取得
			this.issueList = entity.mselectSupplied.read(conn, struct);
			// 存在時支給品情報を表示
			for (int i = 0; i < this.issueList.size(); i++ ) {
				tempStruct = (AE0060020Struct)this.issueList.get(i);
				AE0060020Struct tempIssueStruct = (AE0060020Struct)this.issueList.get(i);
				try{
					tempIssueStruct.setl_SUPPLIED_GNR_TYP(multcombo("SUPPLIED_ISSUE_GNR_TYP",tempIssueStruct.getl_SUPPLIED_GNR_TYP()));
					tempIssueStruct.setl_MRP_ODR_TYP(multcombo("MRP_ODR_TYP",tempIssueStruct.getl_MRP_ODR_TYP()));
				}catch(Exception e){
					e.printStackTrace();
				}

				// 保管区コード取得
				struct.setsetVEND_CD(tempIssueStruct.gettmp_VEND_CD());
				struct.setsetPLANT_CD(tempIssueStruct.gettmp_PLANT_CD());
				List mWhList = entity.mreadM_WH.read(conn, struct);
				AE0060020Struct tempWhStruct = (AE0060020Struct) mWhList.get(0);
                String lotControlFlg = tempIssueStruct.getl_LOT_CONTROL_FLG();
                if(_lotCtrlFlg && "1".equals(lotControlFlg)){
                	//ロット管理場合、[ロット別品目在庫]．”ロット別手持在庫数”を表示する
                	struct.setsetITEM_CD(tempIssueStruct.getl_ITEM_CD());
					struct.setsetWH_CD(tempWhStruct.getreadWH_CD());
					struct.setsetLOT_NO(tempIssueStruct.getl_LOT_NO());
                	List sohQtyList = entity.mSelectSTOCK_ON_HAND_QTY.read(conn, struct);
                	if(sohQtyList.isEmpty()){
                		tempStruct.setl_HAND_QTY("");
                	}else{
                		AE0060020Struct tempHandQtyStruct = (AE0060020Struct) sohQtyList.get(0);
						tempStruct.setl_HAND_QTY(tempHandQtyStruct.getreadSTOCK_ON_HAND_QTY());
                	}
                }else{
                	tempStruct.setl_LOT_NO(null);
    				// 品目手配区分による表示情報の変更
    				if (("4".equals(tempIssueStruct.gettmp_MRP_ODR_TYP())) || ("5".equals(tempIssueStruct.gettmp_MRP_ODR_TYP())) ||
    					   ("6".equals(tempIssueStruct.gettmp_MRP_ODR_TYP())) || ("7".equals(tempIssueStruct.gettmp_MRP_ODR_TYP())))
    				{
    					// MRP管理品(保管区別品目在庫対象) 保管区別品目在庫数取得
    					struct.setsetITEM_CD(tempIssueStruct.getl_ITEM_CD());
    					struct.setsetWH_CD(tempWhStruct.getreadWH_CD());
    					List itemStList = entity.mreadT_ITEM_STOCK.read(conn, struct);
    					if (itemStList.isEmpty()) {
    						tempStruct.setl_HAND_QTY("");
    					} else {
    						AE0060020Struct tempItemStStruct = (AE0060020Struct) itemStList.get(0);
    						tempStruct.setl_HAND_QTY(tempItemStStruct.getreadSTOCK_ON_HAND_QTY());
    					}
    				} else if (("1".equals(tempIssueStruct.gettmp_MRP_ODR_TYP())) || ("2".equals(tempIssueStruct.gettmp_MRP_ODR_TYP()))) {
    					// 製番管理品(保管区別製番在庫対象) 保管区別製番在庫数取得
    					struct.setsetJOB_ODR_CD(tempIssueStruct.getl_JOB_ODR_CD());
    					struct.setsetJOB_ODR_DETAIL_NO(tempIssueStruct.gettmp_JOB_ODR_DETAIL_NO());
    					struct.setsetITEM_CD(tempIssueStruct.getl_ITEM_CD());
    					struct.setsetWH_CD(tempWhStruct.getreadWH_CD());
    					List itemJobList = entity.mreadT_JOB_ODR_CD_STOCK.read(conn, struct);
    					if (itemJobList.isEmpty()) {
    						tempStruct.setl_HAND_QTY("");
    					} else {
    						AE0060020Struct tempJobStruct = (AE0060020Struct) itemJobList.get(0);
    						tempStruct.setl_HAND_QTY(tempJobStruct.getreadSTOCK_ON_HAND_QTY());
    					}
    				}
                }

				// 使用予定残数量計算
				double suppliedReqty = Double.parseDouble(tempIssueStruct.getl_SUPPLIED_QTY()) - Double.parseDouble(tempIssueStruct.getl_TOTAL_ISSUE_QTY());
				if (suppliedReqty < 0){
					tempStruct.setl_SUPPLIED_RE_QTY("0");								// 使用予定残数量(マイナス)
				} else {
					tempStruct.setl_SUPPLIED_RE_QTY(String.valueOf(suppliedReqty));		// 使用予定残数量
				}
			} // END FOR
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
			AE0060020Struct sysParameterStruct = (AE0060020Struct) sysParameterList.get(0);
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
			AE0060020Struct procExecDateStruct = (AE0060020Struct) procExecDateList.get(0);
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
			    return ((AE0060020Struct)l.get(0)).getNEXTVAL();
		    }
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * 保管区コード
	 */
    private String getWh_cd(AE0060020Struct s){
    	try{
    	    List l = entity.mSelectWH_CD.read(conn, s);
    	    if(l != null && l.size() > 0){
    		    return ((AE0060020Struct)l.get(0)).getreadWH_CD();
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
    private boolean insertT_LOT_USE_RSLT(AE0060020Struct s){

    	try{
    	    String vendCd = s.getVEND_CD();
    	    String plantCd = s.getPLANT_CD();
    	    String issueInstCd = s.getsetISSUE_INST_CD();
    	    String puchOdrCd = s.getsetPUCH_ODR_CD();
    	    String acptNo = s.getsetACPT_NO();
    	    String itemCd = s.getsetITEM_CD();
    	    String suppliedDate = s.getsetSUPPLIED_DATE();
    	
    	    List qtyList = entity.mSelectQty.read(conn, s);
    	
    	    if(qtyList != null && qtyList.size() > 0){
    		    String supplied_issue_qty = ((AE0060020Struct)qtyList.get(0)).getreadSUPPLIED_ISSUE_QTY();
                AE0060020Struct whcdStruct = new AE0060020Struct();
                whcdStruct.setVEND_CD(vendCd);
                whcdStruct.setPLANT_CD(plantCd);
                String wh_cdStr = getWh_cd(whcdStruct);
            
                int listSize = qtyList.size();
                for(int i=0; i<listSize; i++){
            	    AE0060020Struct rStruct = (AE0060020Struct)qtyList.get(i);
                    String lot_no = rStruct.getreadLOT_NO();
                    String qty = rStruct.getreadQTY();
                    if(lotNoList == null){
                    	lotNoList = new ArrayList();
                    }

                    AE0060020Struct insertStruct = new AE0060020Struct();
                    insertStruct.setsetSEQ_NO(getNextval());
                    insertStruct.setsetISSUE_INST_CD(issueInstCd);
                    insertStruct.setsetLOT_NO(lot_no);
                    insertStruct.setsetPUCH_ODR_CD(puchOdrCd);
                    insertStruct.setsetACPT_NO(acptNo);
                    insertStruct.setsetITEM_CD(itemCd);
                    insertStruct.setsetWH_CD(wh_cdStr);
                    insertStruct.setsetSUPPLIED_DATE(suppliedDate);
                    insertStruct.setsetPART_SUPPLIED_COMMENT(null);
                    insertStruct.setsUser_ID(getsysUSER_CD());
                
                    if(i == (listSize-1)){
                    	if(Calculate.compare(supplied_issue_qty, qty) == 1){
                    		setWarningMessage("AE20610");
                    		setWarningParameter("T_PART_SUPPLIED_ISSUE", "ITEM_CD", itemCd);
                    		setWarningParameter("T_LOT_ISSUE_INST", "LOT_NO", lot_no);
                    	}
                    	lotNoList.add(lot_no);
                        lotNoList.add(supplied_issue_qty);
                	    insertStruct.setsetTOTAL_ISSUE_QTY(supplied_issue_qty);
                        insertStruct.setsetSUPPLIED_ISSUE_QTY(supplied_issue_qty);
                        entity.minsertT_LOT_USE_RSLT.create(conn, insertStruct);         //[ロット別使用実績]の追加
                    
                        AE0060020Struct updateStruct = new AE0060020Struct();
                        updateStruct.setsetSPENT_QTY(supplied_issue_qty);
                        updateStruct.setISSUE_INST_CD(issueInstCd);
                        updateStruct.setLOT_NO(lot_no);
                        updateStruct.setITEM_CD(itemCd);
                        updateStruct.setPUCH_ODR_CD(puchOdrCd);
                        updateStruct.setsUser_ID(getsysUSER_CD());
                        entity.mupdateT_LOT_ISSUE_INST.update(conn, updateStruct);       // [出庫実績明細]の更新
                        break;
                    }
                
                    if("0".equals(qty)){
                    	continue;
                    }
                    
                    if(Calculate.compare(supplied_issue_qty, qty) == 1){

                        supplied_issue_qty = Calculate.subtract(supplied_issue_qty, qty);
                        lotNoList.add(lot_no);
                        lotNoList.add(qty);
                        insertStruct.setsetTOTAL_ISSUE_QTY(qty);
                        insertStruct.setsetSUPPLIED_ISSUE_QTY(qty);
                        entity.minsertT_LOT_USE_RSLT.create(conn, insertStruct);     //[ロット別使用実績]の追加
                    
                        AE0060020Struct updateStruct = new AE0060020Struct();
                        updateStruct.setsetSPENT_QTY(qty);
                        updateStruct.setISSUE_INST_CD(issueInstCd);
                        updateStruct.setLOT_NO(lot_no);
                        updateStruct.setITEM_CD(itemCd);
                        updateStruct.setPUCH_ODR_CD(puchOdrCd);
                        updateStruct.setsUser_ID(getsysUSER_CD());
                        entity.mupdateT_LOT_ISSUE_INST.update(conn, updateStruct);   // [出庫実績明細]の更新
                    }else{
                	    lotNoList.add(lot_no);
                        lotNoList.add(supplied_issue_qty);
                        insertStruct.setsetTOTAL_ISSUE_QTY(supplied_issue_qty);
                        insertStruct.setsetSUPPLIED_ISSUE_QTY(supplied_issue_qty);
                        entity.minsertT_LOT_USE_RSLT.create(conn, insertStruct);     // [ロット別使用実績]の追加
                    
                        AE0060020Struct updateStruct = new AE0060020Struct();
                        updateStruct.setsetSPENT_QTY(supplied_issue_qty);
                        updateStruct.setISSUE_INST_CD(issueInstCd);
                        updateStruct.setLOT_NO(lot_no);
                        updateStruct.setITEM_CD(itemCd);
                        updateStruct.setPUCH_ODR_CD(puchOdrCd);
                        updateStruct.setsUser_ID(getsysUSER_CD());
                        entity.mupdateT_LOT_ISSUE_INST.update(conn, updateStruct);   //[出庫実績明細]の更新
                        break;
                    }
                }
    	    }else{
                setErrorMessage("AE20609");
                return false;
            }
        }catch(Exception e){
        	e.printStackTrace();
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
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * 読込ボタン押下時に実行される処理です。
	 *
	 */
	public void controlSelect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0060");
		logger.entering("AE0060020Control"+":USER="+struct.getsUser_ID(),"controlSelect");
			//{{user_implement_dev:<controlSelect>
		// TODO: ユーザ定義のコードを記述してください
		try {
			// キー以外の項目を初期化
			initializeDetail();
			
			// ｢発注番号｣をキーに[発注残]を検索し、対象データが存在しないとき
			List rlsdPuchOdrList = entity.mT_RLSD_PUCH_ODR.read(conn, struct);
			if (rlsdPuchOdrList.isEmpty()) {
				setErrorMessage("ZZ06001");
				setErrorParameter("T_RLSD_PUCH_ODR", "PUCH_ODR_CD", struct.getPUCH_ODR_CD());
				return;
			}
			
			// データを取得
			AE0060020Struct rlsdPuchOdrStruct = (AE0060020Struct) rlsdPuchOdrList.get(0);

			struct.seth_ODR_CANCEL_SLIP_ISS_FLG(rlsdPuchOdrStruct.getODR_CANCEL_SLIP_ISS_FLG());

			// ログインユーザの｢工場コード｣ != [発注残]."工場コード"の場合
			if (!sysPLANT_CD.equals(rlsdPuchOdrStruct.getPLANT_CD())) {
				setErrorMessage("AE05002");
				setErrorParameter("T_RLSD_PUCH_ODR", "PUCH_ODR_CD", struct.getPUCH_ODR_CD());
				setErrorParameter("T_RLSD_PUCH_ODR", "PLANT_CD", rlsdPuchOdrStruct.getPLANT_CD());
				return;
			}
			// [発注残]."発注状態区分" = 1:未指示の場合
			if ("1".equals(rlsdPuchOdrStruct.getPUCH_ODR_STS_TYP())) {
				setErrorMessage("AE30803");
				setErrorParameter("T_RLSD_PUCH_ODR", "PUCH_ODR_CD", struct.getPUCH_ODR_CD());
				return;
			}

			// ｢発注番号｣ + ｢受入回数:1｣で[受入実績]を検索し、対象データが存在しない場合
			
			List acptRsltList = entity.mT_ACPT_RSLT.read(conn, struct);
			if (acptRsltList.isEmpty()) {
				setErrorMessage("AE05008");
				setErrorParameter("T_ACPT_RSLT", "PUCH_ODR_CD", struct.getPUCH_ODR_CD());
				return;
			}

			// 画面表示用データ読込
			List formList = entity.mForm.read(conn, struct);
			// 画面表示用データが0件の場合
			if (formList.isEmpty()) {
				setErrorMessage("ZZ06001");
				setErrorParameter("T_ACPT_RSLT", "PUCH_ODR_CD", struct.getPUCH_ODR_CD());
				return;
			}

			//msg_puch_Odr_Cd = struct.getPUCH_ODR_CD();
			// データを取得
			AE0060020Struct formStruct = (AE0060020Struct) formList.get(0);
			
			formStruct.setACPT_INSPC_TYP_DN(multcombo("ACPT_INSPC_TYP",formStruct.getACPT_INSPC_TYP()));
			formStruct.setPUCH_ODR_STS_TYP_DN(multcombo("PUCH_ODR_STS_TYP",formStruct.getPUCH_ODR_STS_TYP()));
			formStruct.setINSPC_CMPLT_FLG_DN(multcombo("INSPC_CMPLT_FLG",formStruct.getINSPC_CMPLT_FLG()));
			formStruct.setSPL_ITEM_TYP_DN(multcombo("SPL_ITEM_TYP",formStruct.getSPL_ITEM_TYP()));
			formStruct.setPRODUCT_TYP_DN(multcombo("PRODUCT_TYP",formStruct.getPRODUCT_TYP()));
			formStruct.setNON_NO_ITEM_FLG_DN(multcombo("NON_NO_ITEM_FLG",formStruct.getNON_NO_ITEM_FLG()));
			formStruct.setUNIT_QTY_TYP_DN(multcombo("UNIT_QTY_TYP",formStruct.getUNIT_QTY_TYP()));

			
			struct.seth_PUCH_ODR_CD(formStruct.getPUCH_ODR_CD());

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
			}

			// エラーがあったら処理を中断
			if (msgStruct.hasError()) {
				return;
			}

			setStruct(formStruct);
            //最大表示行数
            int maxLine = sp.getMaxLine(conn, 10);
			if(maxLine != 0) {
				struct.setROW_COUNT(String.valueOf(maxLine));
			} else {
				struct.setROW_COUNT(null);
			}
			List viewList = entity.mViewCnt.read(conn, struct);
			long rowCount = Long.parseLong(((AE0060020Struct)viewList.get(0)).getl_COUNT());
			// 一覧データが0件の場合
			if (rowCount==0) {
				readStatus = NOT_FOUND;
				if(list != null && list.size() > 0){
					list.clear();
				}
				return;
			}
		    // 最大表示行数チェック
			if ((maxLine != 0) && (rowCount == maxLine + 1)) {
				setErrorMessage("ZZ01115", "" + maxLine);
				setErrorParameter("T_ACPT_RSLT", "PUCH_ODR_CD", struct.getPUCH_ODR_CD());
				readStatus = TOO_MANY;
				if(list != null && list.size() > 0){
					list.clear();
				}
				return;
			}

			if (!"true".equals(struct.getc_COMPLETE()) || !"true".equals(struct.getc_CANCEL())) {
				// [発注残]."発注状態区分" = 9:受入完了の場合
				if ("9".equals(formStruct.getPUCH_ODR_STS_TYP())) {
					if ("0".equals(rlsdPuchOdrStruct.getODR_CANCEL_SLIP_ISS_FLG())) {
						setWarningMessage("AE05005");
					} else if ("1".equals(rlsdPuchOdrStruct.getODR_CANCEL_SLIP_ISS_FLG())) {
						setWarningMessage("AE00086");
					} else if ("2".equals(rlsdPuchOdrStruct.getODR_CANCEL_SLIP_ISS_FLG())) {
						setWarningMessage("AE00087");
					}
					setWarningParameter("T_RLSD_PUCH_ODR", "PUCH_ODR_CD", struct.getPUCH_ODR_CD());
				}
			}
			// 一覧情報を取得
			 viewList = entity.mView.read(conn, struct);
			// 画面に表示
			setList(viewList);
			AE0060020Struct TempStruct;
             for (int i = 0; i < list.size(); i++) {
		     TempStruct = (AE0060020Struct)list.get(i);
			 TempStruct.setl_ACPT_STS_TYP_DN(this.multcombo("ACPT_STS_TYP",TempStruct.getl_ACPT_STS_TYP()));

		    }
			readStatus = NORMAL;
		} catch (SQLException e) {
			throw new ExpjException(e);
		}
                //}}user_implement_dev:<controlSelect>
		logger.exiting("AE0060020Control"+":USER="+struct.getsUser_ID(),"controlSelect");

		return;
	}

	/**
	 * 行追加ボタン押下時に実行される処理です。
	 *
	 */
	public void controlLineInsert() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0060");
		logger.entering("AE0060020Control"+":USER="+struct.getsUser_ID(),"controlLineInsert");
			//{{user_implement_dev:<controlLineInsert>
		try {
			initializeDetailSub1();

			// データを取得
			List formList = entity.mFormSub1Insert.read(conn, struct);
			if (formList.isEmpty()) {
				setErrorMessage("ZZ01105");

				readStatus = ERROR;
				return;
			}
			AE0060020Struct formStruct = (AE0060020Struct) formList.get(0);
			
			formStruct.setACPT_INSPC_TYP_DN(multcombo("ACPT_INSPC_TYP",formStruct.getACPT_INSPC_TYP()));
			formStruct.setPUCH_ODR_STS_TYP_DN(multcombo("PUCH_ODR_STS_TYP",formStruct.getPUCH_ODR_STS_TYP()));
			formStruct.setINSPC_CMPLT_FLG_DN(multcombo("INSPC_CMPLT_FLG",formStruct.getINSPC_CMPLT_FLG()));
			formStruct.setSPL_ITEM_TYP_DN(multcombo("SPL_ITEM_TYP",formStruct.getSPL_ITEM_TYP()));
			formStruct.setPRODUCT_TYP_DN(multcombo("PRODUCT_TYP",formStruct.getPRODUCT_TYP()));
			formStruct.setNON_NO_ITEM_FLG_DN(multcombo("NON_NO_ITEM_FLG",formStruct.getNON_NO_ITEM_FLG()));
			formStruct.setUNIT_QTY_TYP_DN(multcombo("UNIT_QTY_TYP",formStruct.getUNIT_QTY_TYP()));


			// 買掛管理がインストールされている場合、当年月度を取得
			AE0060020Struct readStruct = new AE0060020Struct();
			List installOptionsList = entity.mSYS_INSTALL_OPTIONS.read(conn, readStruct);
			if (installOptionsList.size() > 0) {
				AE0060020Struct installOptionsStruct = (AE0060020Struct)installOptionsList.get(0);
				formStruct.setINSTALL_FLG(installOptionsStruct.getINSTALL_FLG());
			} else {
				formStruct.setINSTALL_FLG("0");
			}
			
			// 買掛管理がインストールされている場合、当年月度を取得
			if ("1".equals(formStruct.getINSTALL_FLG())) {
				List debtCtrlList = entity.mSYS_DEBT_CTRL.read(conn, readStruct);
				if (debtCtrlList.size() > 0) {
					AE0060020Struct debtCtrlStruct = (AE0060020Struct)debtCtrlList.get(0);
					formStruct.setTHIS_MONTH(debtCtrlStruct.getTHIS_MONTH());
				} else {
					// 行修正処理失敗：業務運用日が存在しません
					setErrorMessage("AE00145");
					readStatus = ERROR;
					return;
				}
			}

			setStructSub1(formStruct);
			struct.setc_COMPLETE("true");
			struct.setSelectUnitCostFlag("false");
			
			struct.seth_LINEUPDATE_FLG(null);
			
			readStatus = NORMAL;

			operationMode = INSERT;
		} catch (SQLException e) {
			throw new ExpjException(e);
		}

                //}}user_implement_dev:<controlLineInsert>
		logger.exiting("AE0060020Control"+":USER="+struct.getsUser_ID(),"controlLineInsert");

		return;
	}

	/**
	 * 行修正ボタン押下時に実行される処理です。
	 *
	 */
	public void controlLineUpdate() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0060");
		logger.entering("AE0060020Control"+":USER="+struct.getsUser_ID(),"controlLineUpdate");
			//{{user_implement_dev:<controlLineUpdate>
		try {
			initializeDetailSub1();

			struct.setSelectUnitCostFlag("true");

			// 子画面情報を再検索
			List formList = entity.mFormSub1Update.read(conn, struct);
			if (formList.isEmpty()) {
				setErrorMessage("ZZ01105");

				readStatus = ERROR;
				return;
			}
			AE0060020Struct formStruct = (AE0060020Struct) formList.get(0);
			
			formStruct.setACPT_INSPC_TYP_DN(multcombo("ACPT_INSPC_TYP",formStruct.getACPT_INSPC_TYP()));
			formStruct.setPUCH_ODR_STS_TYP_DN(multcombo("PUCH_ODR_STS_TYP",formStruct.getPUCH_ODR_STS_TYP()));
			formStruct.setINSPC_CMPLT_FLG_DN(multcombo("INSPC_CMPLT_FLG",formStruct.getINSPC_CMPLT_FLG()));
			formStruct.setSPL_ITEM_TYP_DN(multcombo("SPL_ITEM_TYP",formStruct.getSPL_ITEM_TYP()));
			formStruct.setPRODUCT_TYP_DN(multcombo("PRODUCT_TYP",formStruct.getPRODUCT_TYP()));
			formStruct.setNON_NO_ITEM_FLG_DN(multcombo("NON_NO_ITEM_FLG",formStruct.getNON_NO_ITEM_FLG()));
			formStruct.setUNIT_QTY_TYP_DN(multcombo("UNIT_QTY_TYP",formStruct.getUNIT_QTY_TYP()));


			// 受入実績のレコード数を取得

			List aList = entity.mT_ACPT_RSLT_COUNT.read(conn, struct);
			AE0060020Struct aStruct = (AE0060020Struct)aList.get(0);
			formStruct.seth_ACPT_RSLT_COUNT(aStruct.getACPT_RSLT_COUNT());

			
			// 発注残から注文取消伝票発行フラグを取得
			struct.seth_ODR_CANCEL_SLIP_ISS_FLG(formStruct.getODR_CANCEL_SLIP_ISS_FLG());
			

			// 買掛管理がインストールされている場合、当年月度を取得
			AE0060020Struct readStruct = new AE0060020Struct();
			List installOptionsList = entity.mSYS_INSTALL_OPTIONS.read(conn, readStruct);
			if (installOptionsList.size() > 0) {
				AE0060020Struct installOptionsStruct = (AE0060020Struct)installOptionsList.get(0);
				formStruct.setINSTALL_FLG(installOptionsStruct.getINSTALL_FLG());
			} else {
				formStruct.setINSTALL_FLG("0");
			}
			
			// 買掛管理がインストールされている場合、当年月度を取得
			if ("1".equals(formStruct.getINSTALL_FLG())) {
				List debtCtrlList = entity.mSYS_DEBT_CTRL.read(conn, readStruct);
				if (debtCtrlList.size() > 0) {
					AE0060020Struct debtCtrlStruct = (AE0060020Struct)debtCtrlList.get(0);
					formStruct.setTHIS_MONTH(debtCtrlStruct.getTHIS_MONTH());
				} else {
					// 行修正処理失敗：業務運用日が存在しません
					setErrorMessage("AE00145");
					return;
				}
			}

			// 画面情報を設定
			setStructSub1(formStruct);
			struct.setSelectUnitCostFlag("true");
			
			struct.seth_LINEUPDATE_FLG("update");

			AE0060020Struct tStruct = new AE0060020Struct();
			tStruct.setPUCH_ODR_CD(struct.getPUCH_ODR_CD());
			if(_lotCtrlFlg && entity.mcheckT_LOT_USE_RSLT.check(conn, tStruct)){
				struct.setJudgeFlg("1");
			}else{
				struct.setJudgeFlg("0");
			}
			
			readStatus = NORMAL;

			operationMode = UPDATE;
		} catch (SQLException e) {
			throw new ExpjException(e);
		}
                //}}user_implement_dev:<controlLineUpdate>
		logger.exiting("AE0060020Control"+":USER="+struct.getsUser_ID(),"controlLineUpdate");

		return;
	}

	/**
	 * 完了解除ボタン押下時に実行される処理です。
	 *
	 */
	public void controlCancelComplete() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0060");
		logger.entering("AE0060020Control"+":USER="+struct.getsUser_ID(),"controlCancelComplete");
			//{{user_implement_dev:<controlCancelComplete>
		try {
			// [発注残]に存在しない場合
			List lockedList = entity.mT_RLSD_PUCH_ODR_Lock.read(conn, struct);
			if (lockedList.isEmpty()) {
				setErrorMessage("ZZ01105");
				setErrorParameter("T_RLSD_PUCH_ODR", "PUCH_ODR_CD", struct.getPUCH_ODR_CD());
				return;
			}
			AE0060020Struct lockedStruct = (AE0060020Struct) lockedList.get(0);
			// [発注残]."更新数" != ｢更新数｣(hidden使用)の場合
			if (!lockedStruct
				.getPUCH_ODR_MODIFY_COUNT()
				.equals(struct.getPUCH_ODR_MODIFY_COUNT())) {
				setErrorMessage("ZZ01105");
				setErrorParameter("T_RLSD_PUCH_ODR", "PUCH_ODR_CD", struct.getPUCH_ODR_CD());
				return;
			}

			entity.mT_RLSD_PUCH_ODRForCancel.update(conn, struct);

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
		logger.exiting("AE0060020Control"+":USER="+struct.getsUser_ID(),"controlCancelComplete");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0060");
		logger.entering("AE0060020Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
		// 画面を初期化
		initializeAll();

		// Struct解放
		if (this.wkStruct != null) {
			this.wkStruct.clear();
		}

                //}}user_implement_dev:<controlClear>
		logger.exiting("AE0060020Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * 単価読込ボタン押下時に実行される処理です。
	 *
	 */
	public void controlSelectUnitCost() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0060");
		logger.entering("AE0060020Control"+":USER="+struct.getsUser_ID(),"controlSelectUnitCost");
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
						//struct.getACPT_QTY());
						struct.getACPT_QTY(),
						struct.getPUCH_ODR_CD());// 発注番号

				struct.setTAX_CD(ucs.getTAX_CD());
				struct.setUNIT_COST_TYP(ucs.getUNIT_COST_TYP());
				struct.setUNIT_COST(ucs.getUNIT_COST());

				// 行追加時の場合のみ｢加工費｣｢材料費｣｢その他経費｣を設定する。
				if (INSERT.equals(operationMode)) {
					struct.setPROCESSING_COST(ucs.getPROCESSING_COST());
					struct.setMATERIAL_COST(ucs.getMATERIAL_COST());
					struct.setOTHER_OVERHEADS(ucs.getOTHER_OVERHEADS());
				}

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
	       				AE0060020Struct batStruct = (AE0060020Struct)batList.get(0);
	       				struct.setPVC2LOGMODE(batStruct.getPVC2LOGMODE());
	       				struct.setPVC2OUTPUTMODE(batStruct.getPVC2OUTPUTMODE());
	       				struct.setPVC2OUTPUTPATH(batStruct.getPVC2OUTPUTPATH());
	       				struct.setPVC2OUTPUTNAME(batStruct.getPVC2OUTPUTNAME());
	       				struct.setPVC2USERID(this.sysUSER_CD);
	       				struct.setPVC2BUSINESSNAME(batStruct.getPVC2BUSINESSNAME());
	       				struct.setPVC2PLANTCD(this.sysPLANT_CD);
	       				struct.setPVC2TAXID("5");
	       				batList = entity.mcallSQLCALCTAXCALCAMT.call(conn, struct);
	       				batStruct = (AE0060020Struct)batList.get(0);
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
		logger.exiting("AE0060020Control"+":USER="+struct.getsUser_ID(),"controlSelectUnitCost");

		return;
	}

	/**
	 * 登録ボタン押下時に実行される処理です。
	 *
	 */
	public void controlInsert() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0060");
		logger.entering("AE0060020Control"+":USER="+struct.getsUser_ID(),"controlInsert");
			//{{user_implement_dev:<controlInsert>
		String itemQty = struct.getACPT_QTY();
		double acptQty = Double.parseDouble(itemQty);
		try {
			// 生産側の過去の実績入力の制限チェック
			if(getSysParameter() == false){
				if(chkProcExecDate("1","",struct.getACPT_DATE()) == false){
					setErrorMessage(ProcExecDateError);
					setErrorParameter("SYS_ACTUAL_COST_CTRL_AC", "PLANT_CD", struct.getPLANT_CD());
					setErrorParameter("SYS_ACTUAL_COST_CTRL_AC", "PROC_EXEC_DATE", struct.getPROC_EXEC_DATE().toString());
				  setNextUrl("/AE0060021.jsp");
					return;
				}
			}
			// [発注残]に存在しない場合
			List lockedList = entity.mT_RLSD_PUCH_ODR_Lock.read(conn, struct);
			if (lockedList.isEmpty()) {
				setErrorMessage("ZZ01105");
				setErrorParameter("T_RLSD_PUCH_ODR", "PUCH_ODR_CD", struct.getPUCH_ODR_CD());
				setNextUrl("/AE0060021.jsp");
				return;
			}

			// ｢発注番号｣ + ｢受入回数｣が[受入実績]に存在する場合
			if (entity.mT_ACPT_RSLT.check(conn, struct)) {
				setErrorMessage("ZZ01102");
				setErrorParameter("T_ACPT_RSLT", "PUCH_ODR_CD", struct.getPUCH_ODR_CD());
				setErrorParameter("T_ACPT_RSLT", "ACPT_NO", struct.getACPT_NO());
				setNextUrl("/AE0060021.jsp");
				return;
			}

			AE0060020Struct lockedStruct = (AE0060020Struct) lockedList.get(0);
			// [発注残]."更新数" != ｢更新数｣(hidden使用)の場合
			if (!lockedStruct
				.getPUCH_ODR_MODIFY_COUNT()
				.equals(struct.getPUCH_ODR_MODIFY_COUNT())) {
				setErrorMessage("ZZ01105");
				setErrorParameter("T_RLSD_PUCH_ODR", "PUCH_ODR_CD", struct.getPUCH_ODR_CD());
				setNextUrl("/AE0060021.jsp");
				return;
			}

			/*
			// [発注残]."発注時受入検査区分" = 2:受入と検査の場合、
			//｢発注番号｣と｢受入回数｣で、[検査実績]を検索し、存在した場合、
			// かつ｢受入数｣＜[検査実績]."検査済数"の場合
			if ("2".equals(struct.getACPT_INSPC_TYP())) {
				List inspcList = entity.mT_INSPC_RSLT.read(conn, struct);
				if (!inspcList.isEmpty()) {
					AE0060020Struct inspcStruct = (AE0060020Struct) inspcList.get(0);
					if (Calculate.compare(struct.getACPT_QTY(), inspcStruct.getINSPECTED_QTY())
						< 0) {
						setErrorMessage("AE33142");
						setErrorParameter("T_ACPT_RSLT", "PUCH_ODR_CD", struct.getPUCH_ODR_CD());
						setErrorParameter("T_ACPT_RSLT", "ACPT_NO", struct.getACPT_NO());
					}
				}
			}
			*/

			// ｢受入場所｣が、[保管区]に存在しない場合
			List whList = entity.mM_WH.read(conn, struct);
			if (whList.isEmpty()) {
				setErrorMessage("AE00018");
				setErrorParameter("M_WH", "WH_CD", struct.getWH_CD());
			} else {
				// [保管区]."工場コード" != ｢工場コード｣の場合
				AE0060020Struct whStruct = (AE0060020Struct) whList.get(0);
				if (!sysPLANT_CD.equals(whStruct.getPLANT_CD())) {
					setErrorMessage("AE00032");
					setErrorParameter("M_WH", "WH_CD", struct.getWH_CD());
					setErrorParameter("M_WH", "PLANT_CD", whStruct.getPLANT_CD());
				}
			}

			// ｢登録｣ボタン(サブ1フォーム)が押下された時
			// [出庫指示]データを取得する。
			List issueList = entity.mT_ISSUE_INST.read(conn, struct);

			// [出庫指示]に未存在の場合。
			if (issueList.isEmpty()) 
			{
			} else {
				// ループチェック
				for (int i = 0; i < issueList.size(); i++ ) 
				{
					AE0060020Struct issueStruct = (AE0060020Struct) issueList.get(i);
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
						setNextUrl("/AE0060021.jsp");
						// 処理を抜ける。
						return;
					}
				} // FOR END
			}
			
			if(_lotCtrlFlg && !"true".equals(struct.getc_CANCEL())){
                if(!entity.mcheckNON_NO_ITEM_FLG.check(conn, struct)){
                	if(entity.mcheckLOT_CTRL_FLG.check(conn, struct)){
                		//[品目].”ロット管理フラグ = 1(ロット管理を行う。)の時
                		if (acptQty != 0){
	                        if(entity.mcheckWORK_ODR_CD.check(conn, struct)){
	                            //「発注残」.”作業計画番号 = Null の場合
	                            if("0".equals(struct.geth_LOT_NUMBERING_TYP())){
	                                if(struct.getLOT_NO() == null || "".equals(struct.getLOT_NO().trim())){
	                                    //[画面].”在庫ロット番号” が Null場合
	                                    setErrorMessage("AE20600");
	                                }else{
	                                    if(!entity.mcheckLOT_NO.check(conn, struct)){
	                                        //[ロット管理]に存在しない場合
	                                        setErrorMessage("AE20603");
	            		                    setErrorParameter("T_LOT", "LOT_NO", struct.getLOT_NO());
	                                    }
	                                }
	                            }else{
	                            	// 「在庫ロット番号」　＝　Null
	                            	if(struct.getLOT_NO() == null || "".equals(struct.getLOT_NO().trim())){
		                                // 在庫ロット番号の自動採番を行う。
		                                String itemCdStr = struct.getITEM_CD_LOT();
						                String acptDateStr = struct.getACPT_DATE();
						                BizCommon bc = new BizCommon(conn, getsysUSER_CD(), sp.getProcId(), getsysPLANT_CD());
						                List resultList = bc.getsetLotNumberingFd(itemCdStr, acptDateStr);
							            if(bc.getResultStatus().intValue() == 1){
							                if(resultList != null && resultList.size() > 0){
							        	        String result1 = (String)resultList.get(0);
							        	        struct.setLOT_NO(result1);
							                }
							            }else{
							                if(resultList != null && resultList.size() > 1){
							        	        String result2 = (String)resultList.get(1);
							        	        setErrorMessage(result2);
							                }
							            }
		                            } else {
		                                if(!entity.mcheckLOT_NO.check(conn, struct)){
	                                        //[ロット管理]に存在しない場合
	                                        setErrorMessage("AE20603");
	            		                    setErrorParameter("T_LOT", "LOT_NO", struct.getLOT_NO());
	                                    }
		                            }
	                            }
	                        }else{
	                            if(entity.mcheckFINAL_PROC_FLG.check(conn, struct)){
	                                /*仕掛作業コード”で「作業系列別仕掛」を検索し、
							        「作業系列別仕掛」.”最終系列フラグ” = 1(最終系列)の時*/
							        if("0".equals(struct.geth_LOT_NUMBERING_TYP())){
							            if(struct.getLOT_NO() == null || "".equals(struct.getLOT_NO().trim())){
	                                        //[画面].”在庫ロット番号” が Null場合
	                                        setErrorMessage("AE20600");
	                                    }else{
	                                        if(!entity.mcheckLOT_NO.check(conn, struct)){
	                                            //[ロット管理]に存在しない場合
	                                            setErrorMessage("AE20603");
	            		                        setErrorParameter("T_LOT", "LOT_NO", struct.getLOT_NO());
	                                        }
	                                    }
							        }else{
							        	if(struct.getLOT_NO() == null || "".equals(struct.getLOT_NO().trim())){
								            // 在庫ロット番号の自動採番を行う。
		                                    String itemCdStr = struct.getITEM_CD_LOT();
						                    String acptDateStr = struct.getACPT_DATE();
						                    BizCommon bc = new BizCommon(conn, getsysUSER_CD(), sp.getProcId(), getsysPLANT_CD());
						                    List resultList = bc.getsetLotNumberingFd(itemCdStr, acptDateStr);
							                if(bc.getResultStatus().intValue() == 1){
							                    if(resultList != null && resultList.size() > 0){
							        	            String result1 = (String)resultList.get(0);
							        	            struct.setLOT_NO(result1);
							                    }
							                }else{
							                    if(resultList != null && resultList.size() > 1){
							        	            String result2 = (String)resultList.get(1);
							        	            setErrorMessage(result2);
							                    }
							                }
								        }
							        }
	                            }else{
	                                if(struct.getLOT_NO() != null && !"".equals(struct.getLOT_NO().trim())){
	                                	//最終工程以外は、在庫ロット番号を採番ができません。
	                                    setErrorMessage("AE20602");
	                                }
	                            }
	                        }
                		}
                	}
                }
            }
			
            String lotControlFlgBak = struct.geth_LOT_CONTROL_FLG();
			String vendlotno_bak = struct.getLOT_NO();
			String puch_odr_cd_bak = struct.getPUCH_ODR_CD();
			
			// エラーがあったら処理を中断
			if (msgStruct.hasError()) {
				setNextUrl("/AE0060021.jsp");
				if(!"0".equals(struct.geth_LOT_NUMBERING_TYP())){
				    struct.setLOT_NO(null);
				}
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
               setNextUrl("/AE0060021.jsp");
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
					AE0060020Struct batStruct = (AE0060020Struct)batList.get(0);
					struct.setPVC2LOGMODE(batStruct.getPVC2LOGMODE());
					struct.setPVC2OUTPUTMODE(batStruct.getPVC2OUTPUTMODE());
					struct.setPVC2OUTPUTPATH(batStruct.getPVC2OUTPUTPATH());
					struct.setPVC2OUTPUTNAME(batStruct.getPVC2OUTPUTNAME());
					struct.setPVC2USERID(this.sysUSER_CD);
					struct.setPVC2BUSINESSNAME(batStruct.getPVC2BUSINESSNAME());
					struct.setPVC2PLANTCD(this.sysPLANT_CD);
					struct.setPVC2TAXID("5");
					batList = entity.mcallSQLCALCTAXCALCAMT.call(conn, struct);
					batStruct = (AE0060020Struct)batList.get(0);
					if(!"1".equals(batStruct.getPNUMSTATUS())){
						setErrorMessage(batStruct.getPVC2ERRCD());
						setNextUrl("/AE0060021.jsp");
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
               	   setNextUrl("/AE0060021.jsp");
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
          	   setNextUrl("/AE0060021.jsp");
          	   return;
           }

			// 登録処理
			// [発注残]."備品発注フラグ"が 0:備品以外（通常仕入品目） の場合
			if (struct.getNON_NO_ITEM_FLG().equals("0")) {
				struct.setITEM_NAME(null);		// 備品発注品目名にNull
			}
			// [発注残]."発注時受入検査区分"が 1:受入のみ の場合
			if (struct.getACPT_INSPC_TYP().equals("1")) {
				struct.setINSPC_WH_CD(null);	// 検査待ち保管区にNull
			}
			
			//　[発注残]."受入検査区分"が2:受入後に検査を行うかつ受入数量=0かつ"検査完了フラグ"=1　2009/07/14
			if("2".equals(struct.getACPT_INSPC_TYP()) &&
			   Calculate.compare(struct.getACPT_QTY(), "0") ==0 &&
			   "1".equals(_inspcvalue)){
				struct.setACPT_STS_TYP("2");
			}
			
			// [受入実績]の登録
			entity.mT_ACPT_RSLT.create(conn, struct);
			// 1:受入のみ
			if ("1".equals(struct.getACPT_INSPC_TYP())) {
				// [検査実績]の登録
				entity.mT_INSPC_RSLT.create(conn, struct);
			}
			// 受入完了の場合、[発注残]を更新
			if ("true".equals(struct.getc_COMPLETE())) {
				List aList = entity.mT_RLSD_PUCH_ODRForComplete.read(conn, struct);
				AE0060020Struct aStruct = (AE0060020Struct) aList.get(0);
				setStructSystemData(aStruct);
				
				aStruct.setODR_CANCEL_SLIP_ISS_FLG("0");
				aStruct.setODR_CANCEL_CAUSE_CD(null);
				
				//　[発注残]."受入検査区分"が2:受入後に検査を行うかつ受入数量=0かつ"検査完了フラグ"=1　2009/07/14
				if("2".equals(struct.getACPT_INSPC_TYP()) &&
						   Calculate.compare(struct.getACPT_QTY(), "0") ==0 &&
						   "1".equals(_inspcvalue)){
					aStruct.setINSPC_CMPLT_DATE(struct.getACPT_DATE());
					aStruct.setINSPC_CMPLT_FLG("1");
				}
			
				entity.mT_RLSD_PUCH_ODRForComplete.update(conn, aStruct);
			}
			// 受入実績関連のテーブルを更新
			InspcAcpt ia = new InspcAcpt(conn, sysUSER_CD, sp.getProcId(), sysPLANT_CD);
			boolean result = ia.addAcpt(struct.getPUCH_ODR_CD(), struct.getACPT_NO(), struct.getEXCH_RATE(), _myCompanyStruct.getCOMPANY_CD());
			if (!result) {
				if (ia.getErrorList() != null && !ia.getErrorList().isEmpty() ) {
					if ("BZ00180".equals(ia.getErrorList().get(0).toString())) {
						setErrorMessage("BZ00180");
						setNextUrl("/AE0060021.jsp");
						if(!"0".equals(struct.geth_LOT_NUMBERING_TYP())){
							struct.setLOT_NO(null);
						}
						conn.rollback();
						return;
					}
				}
				setErrorMessage("AE05017");
				setErrorParameter("T_ACPT_RSLT", "PUCH_ODR_CD", struct.getPUCH_ODR_CD());
				setErrorParameter("T_ACPT_RSLT", "ACPT_NO", struct.getACPT_NO());
				setNextUrl("/AE0060021.jsp");
				if(!"0".equals(struct.geth_LOT_NUMBERING_TYP())){
				    struct.setLOT_NO(null);
				}
			    conn.rollback();
				return;
			}

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

			String[] message;
			// 業務アラームがあれば出力する。
			for(int i=0; i<ia.getWarnList().size(); i++){
				message = (String[])ia.getWarnList().get(i);
				setWarningMessage(message[0], message[1]);
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

			//支給品みなし出庫処理
			BigDecimal planSum     = new BigDecimal(0);			// 受入数(画面項目)
			BigDecimal denominator = new BigDecimal(0);			// 出庫指示単位数分子
			BigDecimal numerator   = new BigDecimal(0);			// 出庫指示単位数分母
			boolean mHantei = false ;							// 在庫数マイナス確認フラグ
			boolean lHantei = false ;							// 在庫数マイナス確認フラグ

			// [出庫指示]データを取得する。
			List issueInstList = entity.mT_ISSUE_INST.read(conn, struct);
			if (issueInstList.isEmpty()) 
			{
			} else {
				for (int i = 0; i < issueInstList.size(); i++ ) 
				{
					AE0060020Struct tempIssueStruct = (AE0060020Struct) issueInstList.get(i);
					// 使用予定数量の計算
					planSum = new BigDecimal(struct.getACPT_QTY());										// 画面:受入数
					denominator = new BigDecimal(tempIssueStruct.getreadISSUE_INST_UNIT_DENOMINATOR());	// 出庫指示単位数分母
					numerator = new BigDecimal(tempIssueStruct.getreadISSUE_INST_UNIT_NUMERATOR());		// 出庫指示単位数分子
					double beforeQty = 0;		// 更新前手持在庫数(初期化)
					double afterQty = 0;		// 更新後手持在庫数(初期化)
					double rcvissueQty = 0;		// 保管区別入出庫入出庫数(初期化)

					// 在庫数単位区分の判定
					if ("1".equals(tempIssueStruct.getreadUNIT_QTY_TYP()))
					{
						if ("0".equals(tempIssueStruct.getreadISSUE_INST_UNIT_DENOMINATOR()) || 
							"0".equals(tempIssueStruct.getreadISSUE_INST_UNIT_NUMERATOR()))
						{
							// 単位分母、分子が0の場合。
							planSum = planSum.setScale(0,BigDecimal.ROUND_UP);
						} else {
							// 1:整数管理
							planSum = planSum.multiply(numerator).divide(denominator,0,BigDecimal.ROUND_UP).setScale(1);
						}
					} else {
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
					
					struct.setPUCH_ODR_CD(struct.getPUCH_ODR_CD());
					struct.setACPT_NO(struct.getACPT_NO());
					struct.setITEM_CD(tempIssueStruct.getreadITEM_CD());
					//System.out.println("発注番号" + struct.getPUCH_ODR_CD());
					//System.out.println("受入回数" + struct.getACPT_NO());
					//System.out.println("品目番号" + tempIssueStruct.getreadITEM_CD());
					List PartSuppliedIssueList2 = entity.mreadT_PART_SUPPLIED_ISSUE2.read(conn, struct);
					String flgForT_PART_SUPPLIED_ISSUE = "insert";
					if(PartSuppliedIssueList2.isEmpty()){//支給品使用テーブルに同一主キーが存在しない場合
						// 1支給品使用テーブル(T_PART_SUPPLIED_ISSUE)の登録処理
						List itemCdList = entity.mgetParentITEM_CD.read(conn, struct);
				        if(itemCdList != null && itemCdList.size() > 0){
					        String parentITEM_CD = ((AE0060020Struct)itemCdList.get(0)).getreadITEM_CD();
					        if(parentITEM_CD != null && !"".equals(parentITEM_CD.trim())){
						        String subITEM_CD = tempIssueStruct.getreadITEM_CD();
						        // 製品構成リポジトリ作成
                                ProductStructureRepository repository = new ProductStructureRepository(conn);
				                if(checkReverseRooping(repository, subITEM_CD, parentITEM_CD)){
                                    setErrorMessage("AE20607");
                                    if(!"0".equals(struct.geth_LOT_NUMBERING_TYP())){
				                        struct.setLOT_NO(null);
				                    }
				                    setNextUrl("/AE2060021.jsp");
                                    return;
                                }
					        }
				        }else{
					        System.out.println("!!!!!!!!!! T_RLSD_PUCH_ODR.PUCH_ODR_CD = " + struct.getPUCH_ODR_CD() + " record not exist.");
					        setNextUrl("/AE0060021.jsp");
					        return;
				        }
				        
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
						///支給品使用テーブルに同一主キーが存在する場合
						AE0060020Struct tempSuppliedStruct2 = (AE0060020Struct) PartSuppliedIssueList2.get(0);
						BigDecimal Denominator = new BigDecimal(tempSuppliedStruct2.getreadSUPPLIED_UNIT_DENOMINATOR());	// 検索した支給品使用単位数分母
						BigDecimal Numerator   = new BigDecimal(tempSuppliedStruct2.getreadSUPPLIED_UNIT_NUMERATOR());		// 検索した支給品使用単位数分子
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
						
						BigDecimal SuppliedIssueQty = new BigDecimal(tempSuppliedStruct2.getreadSUPPLIED_ISSUE_QTY());	// 検索した使用予定数量
						struct.setsetSUPPLIED_ISSUE_QTY(String.valueOf((SuppliedIssueQty).add(planSum)));				// 使用予定数量
						struct.setsetTOTAL_ISSUE_QTY(String.valueOf((SuppliedIssueQty).add(planSum)));					// 使用済数量
						//struct.setsetSUPPLIED_UNIT_DENOMINATOR(String.valueOf(newDenominator));							// 支給品使用単位数分母
						//struct.setsetSUPPLIED_UNIT_NUMERATOR(String.valueOf(newNumerator));								// 支給品使用単位数分子
						//登録する桁数チェック 2006/05/22 up
						if(newDenominator.compareTo(Decival) > 0 ||
							newNumerator.compareTo(Decival) > 0 ||
							SuppliedIssueQty.compareTo(Decival) > 0){//登録する数値が桁あふれが起こる場合
							setErrorMessage("ZZ05109");
							setErrorParameter("T_PART_SUPPLIED_ISSUE", "ITEM_CD", tempIssueStruct.getreadITEM_CD());
							if(!"0".equals(struct.geth_LOT_NUMBERING_TYP())){
				                struct.setLOT_NO(null);
				            }
							setNextUrl("/AE0060021.jsp");
						    conn.rollback();
							return ;
						}//登録する桁数チェック 2006/05/22 end
						entity.mupdateT_PART_SUPPLIED_ISSUE2.update(conn, struct);
					}
					
					if(lotNoList != null){
                        lotNoList.clear();
                    }
                    if(_lotCtrlFlg && "1".equals(tempIssueStruct.getreadLOT_CONTROL_FLG())
                    	&& Calculate.compare(struct.getACPT_QTY(), "0") != 0
						&& !"true".equals(struct.getc_CANCEL())){
					    AE0060020Struct chkStruct = new AE0060020Struct();
                        chkStruct.setPUCH_ODR_CD(struct.getPUCH_ODR_CD());
                        chkStruct.setITEM_CD(tempIssueStruct.getreadITEM_CD());
                        chkStruct.setACPT_NO(struct.getACPT_NO());
                        if(entity.mcheckT_LOT_ISSUE_INST.check(conn, chkStruct)){
                    	    AE0060020Struct tmpStruct = new AE0060020Struct();
                    	    tmpStruct.setACPT_NO(struct.getACPT_NO());
                    	    tmpStruct.setPUCH_ODR_CD(struct.getPUCH_ODR_CD());
                    	    tmpStruct.setITEM_CD(tempIssueStruct.getreadITEM_CD());
                    	    tmpStruct.setsetPUCH_ODR_CD(struct.getPUCH_ODR_CD());
                    	    tmpStruct.setsetACPT_NO(struct.getACPT_NO());
                    	    tmpStruct.setsetITEM_CD(tempIssueStruct.getreadITEM_CD());
                    	    if("insert".equals(flgForT_PART_SUPPLIED_ISSUE)){
                    		    tmpStruct.setVEND_CD(tempIssueStruct.getreadVEND_CD());
                    		    tmpStruct.setPLANT_CD(tempIssueStruct.getreadPLANT_CD());
                    		    tmpStruct.setISSUE_INST_CD(tempIssueStruct.getreadISSUE_INST_CD());
                    		    tmpStruct.setsetISSUE_INST_CD(tempIssueStruct.getreadISSUE_INST_CD());
                    		    tmpStruct.setsetSUPPLIED_DATE(struct.getACPT_DATE());
                    		    if(!insertT_LOT_USE_RSLT(tmpStruct)){
                    		    	setNextUrl("/AE0060021.jsp");
                    			    return;
                    		    }
                            }
                        }else{
                    	    setErrorMessage("AE20609");
                    	    if(!"0".equals(struct.geth_LOT_NUMBERING_TYP())){
				                struct.setLOT_NO(null);
				            }
				            setNextUrl("/AE0060021.jsp");
						    conn.rollback();
				            return;
                        }
                    }
					
					// ②保管区別品目在庫(T_ITEM_STOCK)、保管区別製番在庫(T_JOB_ODR_CD_STOCK)の登録・更新処理
					// 品目手配区分による更新対象の変更
					// MRP管理品  4:ﾏﾆｭｱﾙ手配品目、5:ﾛｯﾄ手配品目、6:定量手配品目、7:発注点手配品目
					// 製番管理品 1:製番、2 :在庫引当型製番
					// 保管区コード取得
					struct.setsetVEND_CD(tempIssueStruct.getreadVEND_CD());
					struct.setsetPLANT_CD(tempIssueStruct.getreadPLANT_CD());
					List mWhList = entity.mreadM_WH.read(conn, struct);
					AE0060020Struct tempWhStruct = (AE0060020Struct) mWhList.get(0);

					if (("4".equals(tempIssueStruct.getreadMRP_ODR_TYP())) || ("5".equals(tempIssueStruct.getreadMRP_ODR_TYP())) ||
					   ("6".equals(tempIssueStruct.getreadMRP_ODR_TYP())) || ("7".equals(tempIssueStruct.getreadMRP_ODR_TYP())))
					{
						// MRP管理品(保管区別品目在庫対象)
						// 保管区別品目在庫チェック
						struct.setsetITEM_CD(tempIssueStruct.getreadITEM_CD());
						struct.setsetWH_CD(tempWhStruct.getreadWH_CD());
						try{
							List lockStList = entity.mlockT_ITEM_STOCK.read(conn, struct);
						}catch (ResourceBusyException rbe) {
							setErrorMessage("ZZ01105");
							setNextUrl("/AE0060021.jsp");
							conn.rollback();
							return;
						}
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
							AE0060020Struct tempItemStStruct = (AE0060020Struct) itemStList.get(0);
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
							AE0060020Struct tempJobStruct = (AE0060020Struct) itemJobList.get(0);
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
						if(!"0".equals(struct.geth_LOT_NUMBERING_TYP())){
				            struct.setLOT_NO(null);
				        }
						setNextUrl("/AE0060021.jsp");
					    conn.rollback();
						return;
					}
					// 品目手配区分による更新値変更

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
					struct.setsetRCV_ISSUE_COMMENT(null);													// 29.入出庫備考(null)
					struct.setsetCOMPANY_CD(tempIssueStruct.getreadCOMPANY_CD());							// 30.会社コード
					struct.setsetVEND_CD(tempIssueStruct.getreadVEND_CD());									// 31.取引先コード
					struct.setsetCONS_TYP(tempIssueStruct.getreadCONS_TYP());								// 32.支給区分
					struct.setsetCONS_EXEC_DATE(null);														// 33.有償支給実績抽出日
					
					if(_lotCtrlFlg && lotNoList != null && lotNoList.size() > 0){
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
					                if(!"0".equals(struct.geth_LOT_NUMBERING_TYP())){
				                        struct.setLOT_NO(null);
				                    }
					                setNextUrl("/AE0060021.jsp");
								    conn.rollback();
					                return;
					            }
					            beforeQty = afterQty;
					        }
					        struct.setsetRCV_ISSUE_CTRL_CD(no);
						    struct.setsetLOT_NO((String)lotNoList.get(l));
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
					        	    if(!"0".equals(struct.geth_LOT_NUMBERING_TYP())){
				                        struct.setLOT_NO(null);
				                    }
					        	    setNextUrl("/AE0060021.jsp");
								    conn.rollback();
				                    return;
					            }else{
					        	    setErrorMessage("ZZ22001");
					        	    setNextUrl("/AE0060021.jsp");
								    conn.rollback();
				                    return;
					            }
					        }

					        if("1".equals(lotControlFlgBak)){
					        	if(acptQty != 0 && vendlotno_bak != null){
						            List lotTraceList = bc.excMakeLotTraceFd(tempIssueStruct.getreadITEM_CD(), 
						            		                                 (String)lotNoList.get(l),
						            		                                  struct.getITEM_CD_LOT(), 
  		                                                                      vendlotno_bak,
						            		                                  "1");
						            if(bc.getResultStatus().intValue() == 1){
						            	struct.setFROM_ITEM_CD(tempIssueStruct.getreadITEM_CD());
						            	struct.setFROM_LOT_NO((String)lotNoList.get(l));
						            	struct.setTO_ITEM_CD(struct.getITEM_CD_LOT());
						            	struct.setTO_LOT_NO(vendlotno_bak);
						            	struct.setTO_PUCH_ODR_CD(struct.getPUCH_ODR_CD());
						            	//[受入実績]で発注番号を取得
						            	List formList = entity.mgetFROM_PUCH_ODR_CD.read(conn, struct);
						            	if((formList != null && formList.size() > 0)){
						            		//発注番号をソート順（降順）にし、１件目のレコードを取得する。
						            		AE0060020Struct orderStruct = (AE0060020Struct) formList.get(0);
						            		//[ロットトレース].“元発注番号” = [受入実績]."発注番号"
						            		struct.setFROM_PUCH_ODR_CD(orderStruct.getFROM_PUCH_ODR_CD());
						            	}else{
						            		struct.setFROM_PUCH_ODR_CD("");
						            	}
						            	entity.mupdateT_LOT_TRACE.update(conn, struct);
						            }else{
						                if(lotTraceList != null && lotTraceList.size() > 0){
						             	    setErrorMessage((String)lotTraceList.get(0));
						             	    if(!"0".equals(struct.geth_LOT_NUMBERING_TYP())){
					                            struct.setLOT_NO(null);
					                        }
						             	    setNextUrl("/AE0060021.jsp");
										    conn.rollback();
						             	    return;
						                }else{
							        	    setErrorMessage("ZZ22016");
							        	    setNextUrl("/AE0060021.jsp");
										    conn.rollback();
						                    return;
						                }
						            }
					        	}
					        }else{
					        }
					        l = l + 1;
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

			// 全受入完了CHECKの場合
			if ("true".equals(struct.getc_COMPLETE()))
			{
				// AE00079:受入が完了しました。登録・更新を行いたい場合は完了解除を行って下さい。
				setWarningMessage("AE00079");
				struct.setc_COMPLETE("true");
			} else {
				struct.setc_COMPLETE(null);
			}
            //ロット管理update
            if(_lotCtrlFlg && vendlotno_bak != null
            	&& !"".equals(vendlotno_bak) && puch_odr_cd_bak != null 
            	&& !"".equals(puch_odr_cd_bak)){
                AE0060020Struct setStructForTlot = new AE0060020Struct();
                setStructForTlot.setLOT_NO(vendlotno_bak);
                setStructForTlot.setPUCH_ODR_CD(puch_odr_cd_bak);
                setStructForTlot.setsUser_ID(getsysUSER_CD());
                entity.mupdateT_LOT_CTRL.update(conn, setStructForTlot);
            }
			// 画面再表示
			controlSelect();
			conn.commit();
		} catch (SQLException e) {
			throw new ExpjException(e);
		} catch (Exception e) {
			throw new ExpjException(e);
		} finally {
			if (conn != null) {
				conn.rollback();
			}
		}
                //}}user_implement_dev:<controlInsert>
		logger.exiting("AE0060020Control"+":USER="+struct.getsUser_ID(),"controlInsert");

		return;
	}

	/**
	 * 更新ボタン押下時に実行される処理です。
	 *
	 */
	public void controlUpdate() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0060");
		logger.entering("AE0060020Control"+":USER="+struct.getsUser_ID(),"controlUpdate");
			//{{user_implement_dev:<controlUpdate>
		try {
			String itemQty = struct.getACPT_QTY();
			double acptQty = Double.parseDouble(itemQty);
			String acptDate = struct.geth_ACPT_DATE();
			// 生産側の過去の実績入力の制限チェック
			if(getSysParameter() == false){
				if(chkProcExecDate("2",struct.geth_ACPT_DATE(),struct.getACPT_DATE()) == false){
					setErrorMessage(ProcExecDateError);
					setErrorParameter("SYS_ACTUAL_COST_CTRL_AC", "PLANT_CD", struct.getPLANT_CD());
					setErrorParameter("SYS_ACTUAL_COST_CTRL_AC", "PROC_EXEC_DATE", struct.getPROC_EXEC_DATE().toString());
				  setNextUrl("/AE0060021.jsp");
					return;
				}
			}
			
			// [受入実績]に存在しないとき
			List lockedList2 = entity.mT_ACPT_RSLT_Lock.read(conn, struct);
			if (lockedList2.isEmpty()) {
				setErrorMessage("ZZ01105");
				setErrorParameter("T_ACPT_RSLT", "PUCH_ODR_CD", struct.getPUCH_ODR_CD());
				setErrorParameter("T_ACPT_RSLT", "ACPT_NO", struct.getACPT_NO());
				setNextUrl("/AE0060021.jsp");
				return;
			}
			// [発注残]に存在しないとき
			List lockedList = entity.mT_RLSD_PUCH_ODR_Lock.read(conn, struct);
			if (lockedList.isEmpty()) {
				setErrorMessage("ZZ01105");
				setErrorParameter("T_RLSD_PUCH_ODR", "PUCH_ODR_CD", struct.getPUCH_ODR_CD());
				setNextUrl("/AE0060021.jsp");
				return;
			}
			AE0060020Struct lockedStruct2 = (AE0060020Struct) lockedList2.get(0);
			// [受入実績]."更新数" != ｢更新数｣(hidden使用)の場合
			if (!lockedStruct2.getACPT_MODIFY_COUNT().equals(struct.getACPT_MODIFY_COUNT())) {
				setErrorMessage("ZZ01105");
				setErrorParameter("T_ACPT_RSLT", "PUCH_ODR_CD", struct.getPUCH_ODR_CD());
				setErrorParameter("T_ACPT_RSLT", "ACPT_NO", struct.getACPT_NO());
				setNextUrl("/AE0060021.jsp");
				return;
			}
			AE0060020Struct lockedStruct = (AE0060020Struct) lockedList.get(0);
			// [発注残]."更新数" != ｢更新数｣(hidden使用)の場合
			if (!lockedStruct
				.getPUCH_ODR_MODIFY_COUNT()
				.equals(struct.getPUCH_ODR_MODIFY_COUNT())) {
				setErrorMessage("ZZ01105");
				setErrorParameter("T_RLSD_PUCH_ODR", "PUCH_ODR_CD", struct.getPUCH_ODR_CD());
				setNextUrl("/AE0060021.jsp");
				return;
			}

			// [発注残]."発注時受入検査区分" = 2:受入と検査の場合、
			//｢発注番号｣ + ｢受入回数｣で、[検査実績]を検索し、存在した場合、
			// かつ｢受入数｣ < [検査実績]."検査済数"の場合
			if ("2".equals(struct.getACPT_INSPC_TYP())) {
				List inspcList = entity.mT_INSPC_RSLT.read(conn, struct);
				if (!inspcList.isEmpty()) {
					AE0060020Struct inspcStruct = (AE0060020Struct) inspcList.get(0);
					if (Calculate.compare(struct.getACPT_QTY(), inspcStruct.getINSPECTED_QTY())
						< 0) {
						if ("true".equals(struct.getc_CANCEL())) {
							setErrorMessage("AE00121");
						} else {
							setErrorMessage("AE33142");
						}
						setErrorParameter("T_ACPT_RSLT", "PUCH_ODR_CD", struct.getPUCH_ODR_CD());
						setErrorParameter("T_ACPT_RSLT", "ACPT_NO", struct.getACPT_NO());
					}
				}
			}

			// ｢受入場所｣が、[保管区]に存在しない場合
			List whList = entity.mM_WH.read(conn, struct);
			if (whList.isEmpty()) {
				setErrorMessage("AE00018");
				setErrorParameter("M_WH", "WH_CD", struct.getWH_CD());
			} else {
				// [保管区]."工場コード"!=｢工場コード｣の場合
				AE0060020Struct whStruct = (AE0060020Struct) whList.get(0);
				if (!sysPLANT_CD.equals(whStruct.getPLANT_CD())) {
					setErrorMessage("AE00032");
					setErrorParameter("M_WH", "WH_CD", struct.getWH_CD());
					setErrorParameter("M_WH", "PLANT_CD", whStruct.getPLANT_CD());
				}
			}

			// 受入実績情報の更新処理
			// 「更新」ボタン(サブフォーム1)が押下された時処理
			// 支給品と一致する取引先保管区チェック
			// 画面.受入数(修正前)<>画面.受入数(修正後)または
			// 画面.受入日(修正前)<>画面.受入日(修正後)の場合更新処理を行う。
			if (!(struct.getACPT_QTY()).equals(struct.geth_ACPT_QTY()) || 
				!(struct.getACPT_DATE()).equals(struct.geth_ACPT_DATE()))
			{
				List partSuppliedList = entity.mreadT_PART_SUPPLIED_ISSUE.read(conn, struct);
				// [支給品使用]に未存在の場合。
				if (partSuppliedList.isEmpty()) 
				{
				} else {
					// [支給品使用]に存在の場合。
					// ループチェック
					for (int i = 0; i < partSuppliedList.size(); i++ ) 
					{
						AE0060020Struct partSuppliedStruct = (AE0060020Struct) partSuppliedList.get(i);
						// [出庫指示]."取引先"=[保管区マスタ]."保管区コード"の存在チェック
						struct.setsetVEND_CD(partSuppliedStruct.getreadVEND_CD());
						struct.setsetPLANT_CD(partSuppliedStruct.getreadPLANT_CD());
						List m_whList = entity.mreadM_WH.read(conn, struct);
						// 支給先と一致する取引先保管が存在しない場合
						if (m_whList.isEmpty()) 
						{
							// AE00068:支給先と一致する取引先保管区が存在しません。保管区コードの登録が必要です。
							setErrorMessage("AE00068");
							setErrorParameter("T_PART_SUPPLIED_ISSUE", "VEND_CD", partSuppliedStruct.getreadVEND_CD());
							setErrorParameter("T_PART_SUPPLIED_ISSUE", "PLANT_CD", partSuppliedStruct.getreadPLANT_CD());
							setNextUrl("/AE0060021.jsp");
							// 処理を抜ける。
							return;
						}
					} // END FOR
				}
			}
            String lotControlFlgBak = struct.geth_LOT_CONTROL_FLG();
			String vendlotno_bak = struct.getLOT_NO();
			String puch_odr_cd_bak = struct.getPUCH_ODR_CD();
						//ロット番号を取得
			if(_lotCtrlFlg && !"true".equals(struct.getc_CANCEL())){
                if(!entity.mcheckNON_NO_ITEM_FLG.check(conn, struct)){
                	if(entity.mcheckLOT_CTRL_FLG.check(conn, struct)){
                		//[品目].”ロット管理フラグ = 1(ロット管理を行う。)の時
                		if (acptQty != 0){
	                        if(entity.mcheckWORK_ODR_CD.check(conn, struct)){
	                            //「発注残」.”作業計画番号 = Null の場合
	                            if("0".equals(struct.geth_LOT_NUMBERING_TYP())){
	                                if(struct.getLOT_NO() == null || "".equals(struct.getLOT_NO().trim())){
	                                    //[画面].”在庫ロット番号” が Null場合
	                                    setErrorMessage("AE20600");
	                                }else{
	                                    if(!entity.mcheckLOT_NO.check(conn, struct)){
	                                        //[ロット管理]に存在しない場合
	                                        setErrorMessage("AE20603");
	            		                    setErrorParameter("T_LOT", "LOT_NO", struct.getLOT_NO());
	                                    }
	                                }
	                            }else{
	                            	// 「在庫ロット番号」　＝　Null
	                            	if(struct.getLOT_NO() == null || "".equals(struct.getLOT_NO().trim())){
		                                // 在庫ロット番号の自動採番を行う。
		                                String itemCdStr = struct.getITEM_CD_LOT();
						                String acptDateStr = struct.getACPT_DATE();
						                BizCommon bc = new BizCommon(conn, getsysUSER_CD(), sp.getProcId(), getsysPLANT_CD());
						                List resultList = bc.getsetLotNumberingFd(itemCdStr, acptDateStr);
							            if(bc.getResultStatus().intValue() == 1){
							                if(resultList != null && resultList.size() > 0){
							        	        String result1 = (String)resultList.get(0);
							        	        struct.setLOT_NO(result1);
							                }
							            }else{
							                if(resultList != null && resultList.size() > 1){
							        	        String result2 = (String)resultList.get(1);
							        	        setErrorMessage(result2);
							                }
							            }
		                            } else {
		                                if(!entity.mcheckLOT_NO.check(conn, struct)){
	                                        //[ロット管理]に存在しない場合
	                                        setErrorMessage("AE20603");
	            		                    setErrorParameter("T_LOT", "LOT_NO", struct.getLOT_NO());
	                                    }
		                            }
	                            }
	                        }else{
	                            if(entity.mcheckFINAL_PROC_FLG.check(conn, struct)){
	                                /*仕掛作業コード”で「作業系列別仕掛」を検索し、
							        「作業系列別仕掛」.”最終系列フラグ” = 1(最終系列)の時*/
							        if("0".equals(struct.geth_LOT_NUMBERING_TYP())){
							            if(struct.getLOT_NO() == null || "".equals(struct.getLOT_NO().trim())){
	                                        //[画面].”在庫ロット番号” が Null場合
	                                        setErrorMessage("AE20600");
	                                    }else{
	                                        if(!entity.mcheckLOT_NO.check(conn, struct)){
	                                            //[ロット管理]に存在しない場合
	                                            setErrorMessage("AE20603");
	            		                        setErrorParameter("T_LOT", "LOT_NO", struct.getLOT_NO());
	                                        }
	                                    }
							        }else{
							        	if(struct.getLOT_NO() == null || "".equals(struct.getLOT_NO().trim())){
								            // 在庫ロット番号の自動採番を行う。
		                                    String itemCdStr = struct.getITEM_CD_LOT();
						                    String acptDateStr = struct.getACPT_DATE();
						                    BizCommon bc = new BizCommon(conn, getsysUSER_CD(), sp.getProcId(), getsysPLANT_CD());
						                    List resultList = bc.getsetLotNumberingFd(itemCdStr, acptDateStr);
							                if(bc.getResultStatus().intValue() == 1){
							                    if(resultList != null && resultList.size() > 0){
							        	            String result1 = (String)resultList.get(0);
							        	            struct.setLOT_NO(result1);
							                    }
							                }else{
							                    if(resultList != null && resultList.size() > 1){
							        	            String result2 = (String)resultList.get(1);
							        	            setErrorMessage(result2);
							                    }
							                }
								        }
							        }
	                            }else{
	                                if(struct.getLOT_NO() != null && !"".equals(struct.getLOT_NO().trim())){
	                                	//最終工程以外は、在庫ロット番号を採番ができません。
	                                    setErrorMessage("AE20602");
	                                }
	                            }
	                        }
                		}
                	}
                }
            }
			// エラーがあったら処理を中断
			if (msgStruct.hasError()) {
				setNextUrl("/AE0060021.jsp");
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
               setNextUrl("/AE0060021.jsp");
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
					AE0060020Struct batStruct = (AE0060020Struct)batList.get(0);
					struct.setPVC2LOGMODE(batStruct.getPVC2LOGMODE());
					struct.setPVC2OUTPUTMODE(batStruct.getPVC2OUTPUTMODE());
					struct.setPVC2OUTPUTPATH(batStruct.getPVC2OUTPUTPATH());
					struct.setPVC2OUTPUTNAME(batStruct.getPVC2OUTPUTNAME());
					struct.setPVC2USERID(this.sysUSER_CD);
					struct.setPVC2BUSINESSNAME(batStruct.getPVC2BUSINESSNAME());
					struct.setPVC2PLANTCD(this.sysPLANT_CD);
					struct.setPVC2TAXID("5");
					batList = entity.mcallSQLCALCTAXCALCAMT.call(conn, struct);
					batStruct = (AE0060020Struct)batList.get(0);
					if(!"1".equals(batStruct.getPNUMSTATUS())){
						setErrorMessage(batStruct.getPVC2ERRCD());
						setNextUrl("/AE0060021.jsp");
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
               	   setNextUrl("/AE0060021.jsp");
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
          	   setNextUrl("/AE0060021.jsp");
          	   return;
            }
			// 更新処理
			
			//　[発注残]."受入検査区分"が2:受入後に検査を行うかつ受入数量=0かつ"検査完了フラグ"=1　2009/07/14
			if("2".equals(struct.getACPT_INSPC_TYP()) &&
			   Calculate.compare(struct.getACPT_QTY(), "0") ==0 &&
			   "1".equals(_inspcvalue)){
				struct.setACPT_STS_TYP("2");
			}
			
			//注文取消がONの場合かつ、[発注残]."受入検査区分"が 2:受入後に検査を行う の場合、受入状態区分を2:検査完了にセット 2006/05/22 up
			if(("2".equals(struct.getACPT_INSPC_TYP())) && "true".equals(struct.getc_CANCEL())){
				struct.setACPT_STS_TYP("2");
			}
			// [発注残]."備品発注フラグ"が 0:備品以外 だった場合
			if (struct.getNON_NO_ITEM_FLG().equals("0")) {
				struct.setITEM_NAME(null);
			}
			// [発注残]."発注時受入検査区分"が 1:受入のみ の場合
			if (struct.getACPT_INSPC_TYP().equals("1")) {
				struct.setINSPC_WH_CD(null);
			}
			// [受入実績]の更新
			entity.mT_ACPT_RSLT.update(conn, struct);

			// 1:受入のみの場合
			if ("1".equals(struct.getACPT_INSPC_TYP())) {
				// [検査実績]を更新
				entity.mT_INSPC_RSLT.update(conn, struct);
			}
			
			//"受入検査区分"が2:受入後に検査を行うの場合かつ注文取消がチェックされている場合 2006/04/14 up
			if(("2".equals(struct.getACPT_INSPC_TYP())) && "true".equals(struct.getc_CANCEL())){
				List tmpList = entity.mreadT_INSPC_RSLT.read(conn, struct);
				if (tmpList == null || tmpList.size() <= 0){
					// [検査実績]を登録
					entity.mT_INSPC_RSLT.create(conn, struct);
				}
			}//"受入検査区分"が2:受入後に検査を行うの場合かつ注文取消がチェックされている場合2006/04/14 end
			
			// 全受入完了の場合
			if ("true".equals(struct.getc_COMPLETE())) {
				List aList = entity.mT_RLSD_PUCH_ODRForComplete.read(conn, struct);
				AE0060020Struct aStruct = (AE0060020Struct) aList.get(0);
				setStructSystemData(aStruct);
				
				// 注文取消がチェックされている場合
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
				aStruct.setODR_CANCEL_CAUSE_CD(struct.getODR_CANCEL_CAUSE_CD());
				
				//　[発注残]."受入検査区分"が2:受入後に検査を行うかつ受入数量=0かつ"検査完了フラグ"=1　2009/07/14
				if("2".equals(struct.getACPT_INSPC_TYP()) &&
						   Calculate.compare(struct.getACPT_QTY(), "0") ==0 &&
						   "1".equals(_inspcvalue)){
					aStruct.setINSPC_CMPLT_DATE(struct.getACPT_DATE());
					aStruct.setINSPC_CMPLT_FLG("1");
				}
				
				// [発注残]を更新
				entity.mT_RLSD_PUCH_ODRForComplete.update(conn, aStruct);
			}

			// 受入実績関連のテーブルを更新
			InspcAcpt ia = new InspcAcpt(conn, sysUSER_CD, sp.getProcId(), sysPLANT_CD);
			boolean result = ia.changeAcpt(struct.getPUCH_ODR_CD(), struct.getACPT_NO(), acptDate, struct.getEXCH_RATE(), _myCompanyStruct.getCOMPANY_CD());
			if (!result) {
				if (ia.getErrorList() != null && !ia.getErrorList().isEmpty() ) {
					if ("BZ00180".equals(ia.getErrorList().get(0).toString())) {
						setErrorMessage("BZ00180");
						setNextUrl("/AE0060021.jsp");
						return;
					}
				}
				setErrorMessage("AE05017");
				setErrorParameter("T_ACPT_RSLT", "PUCH_ODR_CD", struct.getPUCH_ODR_CD());
				setErrorParameter("T_ACPT_RSLT", "ACPT_NO", struct.getACPT_NO());
				setNextUrl("/AE0060021.jsp");
				return;
			}
			
			//注文取消がONの場合かつ、[発注残]."受入検査区分"が2:受入後に検査を行うの場合、
			//[発注残]."検査完了フラグ"=0:未,[発注残]."検査完了日"にNULLをセットする 2006/04/14up
			/*if ("true".equals(struct.getc_CANCEL()) && "2".equals(struct.getACPT_INSPC_TYP())) {
				entity.mupdateT_RLSD_PUCH_ODR_INSPC_CMPLT.update(conn, struct);
			}*/

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

			String[] message;
			// 業務アラームがあれば出力する。
			for(int i=0; i<ia.getWarnList().size(); i++){
				message = (String[])ia.getWarnList().get(i);
				setWarningMessage(message[0], message[1]);
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
			// 支給品みなし出庫処理
			BigDecimal planSum     = new BigDecimal(0);			// 受入数(画面項目)
			BigDecimal denominator = new BigDecimal(0);			// 出庫指示単位数分子
			BigDecimal numerator   = new BigDecimal(0);			// 出庫指示単位数分母
			boolean mHantei = false ;							// 在庫数マイナス確認フラグ
			boolean lHantei = false ;							// 在庫数マイナス確認フラグ
			boolean uHantei = false ;							// みなし対象外確認フラグ
			boolean lHantei2 = false ;							// みなし対象外確認フラグ
			String strAcpt = "";								// 受入訂正回数退避
			String beforeAcpt = "";
			String strInspc = "";								// 検査訂正回数退避
			String beforeInspc = "";
			String issueInstCdIsNull = "true";
			String isLotManager = "false";

			// 画面.受入数(修正前)<>画面.受入数(修正後)または
			// 画面.受入日(修正前)<>画面.受入日(修正後)の場合出庫処理を実施。
			if (!(struct.getACPT_QTY()).equals(struct.geth_ACPT_QTY()) || 
				!(struct.getACPT_DATE()).equals(struct.geth_ACPT_DATE()))
			{
				// [支給品使用]をチェックする
				List temppartList = entity.mreadT_PART_SUPPLIED_ISSUE.read(conn, struct);
				// [支給品使用]に存在の場合。
				if (!temppartList.isEmpty()) {
					for (int i = 0; i < temppartList.size(); i++ ) 
					{
					    AE0060020Struct temppartStruct = (AE0060020Struct) temppartList.get(i);
					    if(_lotCtrlFlg && "1".equals(temppartStruct.getreadLOT_CONTROL_FLG())){
					    	isLotManager = "true";
					    	if(temppartStruct.getreadISSUE_INST_CD() != null && 
					           !"".equals(temppartStruct.getreadISSUE_INST_CD().trim())){
					           	issueInstCdIsNull = "false";
								break;
					    	}
					    }
					} // END FOR

					if("false".equals(issueInstCdIsNull)){
				        String acptQty_bak = null;
				        String hacptQty_bak = null;
				        String acptDate_bak = null;
				        String hacptDate_bak = null;
				        String puchOdrCd_bak = null;
				        String acptNo_bak = null;
					    acptQty_bak = struct.getACPT_QTY();
				        hacptQty_bak = struct.geth_ACPT_QTY();
				        acptDate_bak = struct.getACPT_DATE();
				        hacptDate_bak = struct.geth_ACPT_DATE();
				        puchOdrCd_bak = struct.getPUCH_ODR_CD();
				        acptNo_bak = struct.getACPT_NO();
				        struct.setsetPUCH_ODR_CD(struct.getPUCH_ODR_CD());
				        List listBak = entity.mbakT_LOT_USE_RSLT.read(conn, struct);
				        entity.mdeleteT_LOT_USE_RSLT.delete(conn, struct);
				        
					    List loopList = entity.mgetACPT_NO.read(conn, struct);
					    if(!loopList.isEmpty()){
					    	for(int out=0; out<loopList.size(); out++){
					    		AE0060020Struct dataStruct = (AE0060020Struct)loopList.get(out);
					    		if(acptNo_bak.equals(dataStruct.getreadACPT_NO())){
					    			struct.setACPT_QTY(acptQty_bak);
				                    struct.seth_ACPT_QTY(hacptQty_bak);
				                    struct.setACPT_DATE(acptDate_bak);
				                    struct.seth_ACPT_DATE(hacptDate_bak);
				                    struct.setPUCH_ODR_CD(puchOdrCd_bak);
				                    struct.setACPT_NO(acptNo_bak);
					    		}else{
					    			struct.setACPT_QTY(dataStruct.getreadACPT_QTY());
				                    struct.seth_ACPT_QTY(dataStruct.getreadACPT_QTY());
				                    struct.setACPT_DATE(dataStruct.getreadACPT_DATE());
				                    struct.seth_ACPT_DATE(dataStruct.getreadACPT_DATE());
				                    struct.setPUCH_ODR_CD(puchOdrCd_bak);
				                    struct.setACPT_NO(dataStruct.getreadACPT_NO());
					    		}
					    		// [支給品使用]をチェックする
				                List temppartListsub = entity.mreadT_PART_SUPPLIED_ISSUE.read(conn, struct);

				                if (!temppartListsub.isEmpty()) {
				                	// [支給品使用]に存在の場合。ループチェック
					                for (int in = 0; in < temppartListsub.size(); in++ ) 
					                {
					                	AE0060020Struct temppartStruct = (AE0060020Struct) temppartListsub.get(in);
					                	if(out == 0){
					                		struct.setsetISSUE_INST_CD(temppartStruct.getreadISSUE_INST_CD());
					                        struct.setsetITEM_CD(temppartStruct.getreadITEM_CD());
					                        struct.setsetPUCH_ODR_CD(temppartStruct.getreadPUCH_ODR_CD());
					                        entity.mupdateT_LOT_ISSUE_INST_SPENT_QTY.update(conn, struct);
					                	}
						                // 使用予定数量の計算
						                planSum = new BigDecimal(struct.getACPT_QTY());										// 画面:受入数
						                denominator = new BigDecimal(temppartStruct.getreadSUPPLIED_UNIT_DENOMINATOR());	// 支給品使用単位数分母
						                numerator = new BigDecimal(temppartStruct.getreadSUPPLIED_UNIT_NUMERATOR());		// 支給品使用単位数分子
						                double beforeQty = 0;		// 更新前手持在庫数(初期化)
						                double afterQty = 0;		// 更新後手持在庫数(初期化)
						                double rcvissueQty = 0;		// 保管区別入出庫入出庫数(初期化)
						                double totalissueQty= 0;
						                // [支給品使用].処理区分 = 1:みなし出庫、または2:マニュアル修正のみ更新処理。
						                if (("1".equals(temppartStruct.getreadSUPPLIED_ISSUE_GNR_TYP())) || 
						                    ("2".equals(temppartStruct.getreadSUPPLIED_ISSUE_GNR_TYP())))
						                {
						                	// 在庫数単位区分の判定
							                if ("1".equals(temppartStruct.getreadUNIT_QTY_TYP()))
							                {
								                if ("0".equals(temppartStruct.getreadSUPPLIED_UNIT_DENOMINATOR()) || 
									                "0".equals(temppartStruct.getreadSUPPLIED_UNIT_NUMERATOR()))
								                {
									                // 単位分母、分子が0の場合。
									                planSum = planSum.setScale(0,BigDecimal.ROUND_UP);
								                } else {
									                // 1:整数管理
									                planSum = planSum.multiply(numerator).divide(denominator,0,BigDecimal.ROUND_UP).setScale(1);
								                }
							                } else {
								                // 小数管理
								                if ("0".equals(temppartStruct.getreadSUPPLIED_UNIT_DENOMINATOR()) || 
									                "0".equals(temppartStruct.getreadSUPPLIED_UNIT_NUMERATOR()))
								                {
									                planSum = planSum.setScale(4,BigDecimal.ROUND_HALF_UP);
								                } else {
									                planSum = planSum.multiply(numerator).divide(denominator,4,BigDecimal.ROUND_HALF_UP);
									                //小数の表示スケール処理
									                BigDecimal intVal = new BigDecimal("" + planSum.intValue());
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
									                planSum = planSum.setScale(roundCount,BigDecimal.ROUND_UP);
								                }
							                }

						                	// [支給品使用]の更新処理
							                //if ("1".equals(temppartStruct.getreadSUPPLIED_ISSUE_GNR_TYP()))
							                if(temppartStruct.getreadISSUE_INST_CD() != null && 
					                           !"".equals(temppartStruct.getreadISSUE_INST_CD().trim())){
								                // [支給品使用].処理区分 = 1:みなし出庫処理更新
								                struct.setsetACPT_QTY(struct.getACPT_QTY());						// 画面:受入数
								                struct.setsetSUPPLIED_ISSUE_QTY(String.valueOf(planSum));			// 使用予定数量
								                struct.setsetTOTAL_ISSUE_QTY(String.valueOf(planSum));				// 使用済数量
								                struct.setsetSUPPLIED_DATE(struct.getACPT_DATE());					// 画面.使用日
								                struct.setsetPUCH_ODR_CD(struct.getPUCH_ODR_CD());					// 条件.画面:発注番号
								                struct.setsetACPT_NO(struct.getACPT_NO());							// 条件.画面:受入回数
								                struct.setsetITEM_CD(temppartStruct.getreadITEM_CD());				// 条件.支給品品目番号
								                entity.mupdateT_PART_SUPPLIED_ISSUE.update(conn, struct);
							                } else {
								                // [支給品使用].処理区分 = 2:マニュアル修正更新
								                struct.setsetACPT_QTY(struct.getACPT_QTY());						// 画面:受入数
								                struct.setsetSUPPLIED_ISSUE_QTY(String.valueOf(planSum));			// 使用予定数量
								                struct.setsetPUCH_ODR_CD(struct.getPUCH_ODR_CD());					// 条件.画面:発注番号
								                struct.setsetACPT_NO(struct.getACPT_NO());							// 条件.画面:受入回数
								                struct.setsetITEM_CD(temppartStruct.getreadITEM_CD());				// 条件.支給品品目番号
								                entity.mupdateT_PART_SUPPLIED_ISSUE_GNR.update(conn, struct);
							                }
							                if(lotNoList != null){
                                                lotNoList.clear();
                                            }
							                if("1".equals(temppartStruct.getreadLOT_CONTROL_FLG()) && !"true".equals(struct.getc_CANCEL()) && 
							                   temppartStruct.getreadISSUE_INST_CD() != null && !"".equals(temppartStruct.getreadISSUE_INST_CD().trim())){
							                	AE0060020Struct chkStruct = new AE0060020Struct();
                                                chkStruct.setPUCH_ODR_CD(struct.getPUCH_ODR_CD());
                                                chkStruct.setITEM_CD(temppartStruct.getreadITEM_CD());
                                                chkStruct.setACPT_NO(struct.getACPT_NO());
                                                //出庫実績明細
                                                if(entity.mcheckT_LOT_ISSUE_INST.check(conn, chkStruct)){
                                                	AE0060020Struct tmpStruct = new AE0060020Struct();
                    	                            tmpStruct.setACPT_NO(struct.getACPT_NO());
                    	                            tmpStruct.setPUCH_ODR_CD(struct.getPUCH_ODR_CD());
                    	                            tmpStruct.setITEM_CD(temppartStruct.getreadITEM_CD());
                    	                            tmpStruct.setsetPUCH_ODR_CD(struct.getPUCH_ODR_CD());
                    	                            tmpStruct.setsetACPT_NO(struct.getACPT_NO());
                    	                            tmpStruct.setsetITEM_CD(temppartStruct.getreadITEM_CD());
                    		                        tmpStruct.setVEND_CD(temppartStruct.getreadVEND_CD());
                    		                        tmpStruct.setPLANT_CD(temppartStruct.getreadPLANT_CD());
                    		                        tmpStruct.setISSUE_INST_CD(temppartStruct.getreadISSUE_INST_CD());
                    		                        tmpStruct.setsetISSUE_INST_CD(temppartStruct.getreadISSUE_INST_CD());
                    		                        tmpStruct.setsetSUPPLIED_DATE(struct.getACPT_DATE());
                    		                        //[ロット別使用実績]の追加,[出庫実績明細]の更新
                    		                        if(!insertT_LOT_USE_RSLT(tmpStruct)){
                    		                        	setNextUrl("/AE2060021.jsp");
                    			                        return;
                    		                        }
                                                }else{
                    	                            setErrorMessage("AE20609");
                    	                            setNextUrl("/AE2060021.jsp");
            									    conn.rollback();
                    	                            return;
                                                }
							                }
						                	
						                	// 画面.受入数(修正前)<>画面.受入数(修正後)の場合
							                // 保管区別品目在庫、製番在庫の追加、更新
							                // 保管区別入出庫の登録は画面受入数が変更されたら実施する。
								            // ■②保管区別品目在庫(T_ITEM_STOCK)、保管区別製番在庫(T_JOB_ODR_CD_STOCK)の登録・更新処理
								            // 保管区コード取得
								            struct.setsetVEND_CD(temppartStruct.getreadVEND_CD());
								            struct.setsetPLANT_CD(temppartStruct.getreadPLANT_CD());
								            List mWhList = entity.mreadM_WH.read(conn, struct);
								            AE0060020Struct tempWhStruct = (AE0060020Struct) mWhList.get(0);
								            // 品目手配区分による更新対象の変更
								            if (("4".equals(temppartStruct.getreadMRP_ODR_TYP())) || ("5".equals(temppartStruct.getreadMRP_ODR_TYP())) ||
								                ("6".equals(temppartStruct.getreadMRP_ODR_TYP())) || ("7".equals(temppartStruct.getreadMRP_ODR_TYP())))
								            {
									            // MRP管理品(保管区別品目在庫対象)
									            // 保管区別品目在庫チェック
									            struct.setsetITEM_CD(temppartStruct.getreadITEM_CD());
									            struct.setsetWH_CD(tempWhStruct.getreadWH_CD());
									            try{
													List lockStList = entity.mlockT_ITEM_STOCK.read(conn, struct);
												}catch (ResourceBusyException rbe) {
													setErrorMessage("ZZ01105");
													setNextUrl("/AE0060021.jsp");
													conn.rollback();
													return;
												}
									            List itemStList = entity.mreadT_ITEM_STOCK.read(conn, struct);

									            // 更新チェック
									            if (itemStList.isEmpty()) 
									            {
										            // 保管区別品目在庫登録
										            struct.setsetITEM_CD(temppartStruct.getreadITEM_CD());							// 01.品目番号
										            struct.setsetWH_CD(tempWhStruct.getreadWH_CD());								// 02.保管区コード
										            struct.setsetPLANT_CD(temppartStruct.getreadPLANT_CD());						// 03.工場コード
										            struct.setsetSTOCK_ON_HAND_QTY(String.valueOf(String.valueOf(
																	           	Double.parseDouble(temppartStruct.getreadTOTAL_ISSUE_QTY()) 
																	        	- planSum.doubleValue())));		// 04.品目別手持在庫数
										            entity.minsertT_ITEM_STOCK.create(conn, struct);
										            // マイナス値チェック
										            beforeQty = 0;																	// 更新前
										            afterQty = Double.parseDouble(temppartStruct.getreadTOTAL_ISSUE_QTY()) 
																	        	- planSum.doubleValue(); 						// 更新後
									            	totalissueQty = Double.parseDouble(temppartStruct.getreadTOTAL_ISSUE_QTY());	// 使用済数量待避
										            // 判定フラグに"true"(マイナスデータ)セット
										            if (afterQty < 0) {
											            mHantei = true;
										            }
									            } else {
									            	AE0060020Struct tempitemStruct = (AE0060020Struct) itemStList.get(0);
											        // 保管区別品目在庫更新
											        struct.setsetSTOCK_ON_HAND_QTY(String.valueOf(Double.parseDouble(tempitemStruct.getreadSTOCK_ON_HAND_QTY()) 
												    							+ Double.parseDouble(temppartStruct.getreadTOTAL_ISSUE_QTY())
													    						- planSum.doubleValue()));						// 01.品目別手持在庫数
											        struct.setsetITEM_CD(temppartStruct.getreadITEM_CD());							// 条件.品目番号
											        struct.setsetWH_CD(tempWhStruct.getreadWH_CD());								// 条件.保管区コード
											        entity.mupdateT_ITEM_STOCK.update(conn, struct);

											        // 更新前手持在庫数セット
											        beforeQty = Double.parseDouble(tempitemStruct.getreadSTOCK_ON_HAND_QTY());		// 更新前
											        afterQty = Double.parseDouble(tempitemStruct.getreadSTOCK_ON_HAND_QTY()) 
													    						+ Double.parseDouble(temppartStruct.getreadTOTAL_ISSUE_QTY())
														    					- planSum.doubleValue();						// 更新後
											        totalissueQty = Double.parseDouble(temppartStruct.getreadTOTAL_ISSUE_QTY());	// 使用済数量待避
											        // マイナス値チェック
											        if (afterQty < 0)
											        {
												        // 判定フラグに"true"(マイナスデータ)セット
												        mHantei = true;
											        }
									            }
								            } else if (("1".equals(temppartStruct.getreadMRP_ODR_TYP())) || ("2".equals(temppartStruct.getreadMRP_ODR_TYP()))) {
									            // 製番管理品(保管区別製番在庫対象)
									            // 保管区別製番在庫チェック
									            struct.setsetJOB_ODR_CD(temppartStruct.getreadJOB_ODR_CD());						// 製番
									            struct.setsetJOB_ODR_DETAIL_NO(temppartStruct.getreadJOB_ODR_DETAIL_NO());			// 製番枝番
									            struct.setsetITEM_CD(temppartStruct.getreadITEM_CD());								// 品目番号
									            struct.setsetWH_CD(tempWhStruct.getreadWH_CD());									// 保管区コード
									            List itemJobList = entity.mreadT_JOB_ODR_CD_STOCK.read(conn, struct);

								            	// 更新チェック
									            if (itemJobList.isEmpty()) 
									            {
										            // 保管区別製番在庫登録
										            struct.setsetJOB_ODR_CD(temppartStruct.getreadJOB_ODR_CD());					// 01.製番
										            struct.setsetJOB_ODR_DETAIL_NO(temppartStruct.getreadJOB_ODR_DETAIL_NO());		// 02.製番枝番
										            struct.setsetITEM_CD(temppartStruct.getreadITEM_CD());							// 03.品目番号
										            struct.setsetWH_CD(tempWhStruct.getreadWH_CD());								// 04.保管区コード
										            struct.setsetPLANT_CD(temppartStruct.getreadPLANT_CD());						// 05.工場コード
										            struct.setsetSTOCK_ON_HAND_QTY(String.valueOf(Double.parseDouble(temppartStruct.getreadTOTAL_ISSUE_QTY()) 
													    									- planSum.doubleValue()));		// 06.製番別手持在庫数
										            entity.minsertT_JOB_ODR_CD_STOCK.create(conn, struct);
										            // マイナス値チェック
										            beforeQty = 0;																	// 更新前
										            afterQty = Double.parseDouble(temppartStruct.getreadTOTAL_ISSUE_QTY()) 
													    									- planSum.doubleValue();		// 更新後
										            totalissueQty = Double.parseDouble(temppartStruct.getreadTOTAL_ISSUE_QTY());	// 使用済数量待避
										            // マイナス値チェック
										            if (afterQty < 0)
										            {
											            // 判定フラグに"true"(マイナスデータ)セット
											            mHantei = true;
										            }
									            } else {
									            	AE0060020Struct tempJobStruct = (AE0060020Struct) itemJobList.get(0);
										            // 保管区別製番在庫更新
										            struct.setsetSTOCK_ON_HAND_QTY(String.valueOf(Double.parseDouble(tempJobStruct.getreadSTOCK_ON_HAND_QTY()) 
												        						+ Double.parseDouble(temppartStruct.getreadTOTAL_ISSUE_QTY())
													        					- planSum.doubleValue()));						// 01.製番別手持在庫数
										            struct.setsetJOB_ODR_CD(temppartStruct.getreadJOB_ODR_CD());					// 条件.製番
										            struct.setsetJOB_ODR_DETAIL_NO(temppartStruct.getreadJOB_ODR_DETAIL_NO());		// 条件.製番枝番
										            struct.setsetITEM_CD(temppartStruct.getreadITEM_CD());							// 条件.品目番号
										            struct.setsetWH_CD(tempWhStruct.getreadWH_CD());								// 条件.保管区コード
										            entity.mupdateT_JOB_ODR_CD_STOCK.update(conn, struct);
										            // マイナス値チェック
										            beforeQty = Double.parseDouble(tempJobStruct.getreadSTOCK_ON_HAND_QTY());		// 更新前
										            afterQty = Double.parseDouble(tempJobStruct.getreadSTOCK_ON_HAND_QTY()) 
												        						+ Double.parseDouble(temppartStruct.getreadTOTAL_ISSUE_QTY())
													        					- planSum.doubleValue();						// 更新後
										            totalissueQty = Double.parseDouble(temppartStruct.getreadTOTAL_ISSUE_QTY());	// 使用済数量待避
										            // 在庫数のマイナスチェック
										            if (afterQty < 0)
										            {
											            // 判定フラグに"true"(マイナスデータ)セット
											            mHantei = true;
										            }
									            }
								            }
								            // マイナス判定のインフォメーション表示
								            if (mHantei == true && lHantei == false)
								            {
									            // AE00069:支給品みなし出庫で取引先保管区の品目または
									            // 製番手持在庫数が一部マイナスとなりました。
									            setWarningMessage("AE00069");
									            // 判定フラグに"true"をセット
									            lHantei = true;
								            }
								            // [受入実績]の受入訂正回数取得
								            List acptCrList = entity.mreadT_ACPT_RSLT.read(conn, struct);
								            if (acptCrList.isEmpty()) {
									            strAcpt = "0";
									            beforeAcpt = "0";
								            } else {
								            	AE0060020Struct tempAcptStruct = (AE0060020Struct) acptCrList.get(0);
									            strAcpt = tempAcptStruct.getreadACPT_CRCT_NO();
									            beforeAcpt = (String.valueOf(Integer.parseInt(strAcpt) - 1));
								            }

								            // [検査実績]の検査訂正回数取得
								            List inspcRsList = entity.mreadT_INSPC_RSLT.read(conn, struct);
								            if (inspcRsList.isEmpty())
								            {
									            strInspc = "0";
									            beforeInspc = "0";
								            } else {
								            	AE0060020Struct tempInspcStruct = (AE0060020Struct) inspcRsList.get(0);
									            strInspc = tempInspcStruct.getreadINSPC_CRCT_NO();
									            beforeInspc = (String.valueOf(Integer.parseInt(strInspc) - 1));
								            }

								            // 保管区別入出庫(T_RCV_ISSUE)の登録処理(赤)
								            // 入出庫番号採番
								            CollectNumber collectNum = new CollectNumber(CollectNumber.ISSUE_CD,this.sysUSER_CD,
											    				this.sp.getProcId(),this.sysPLANT_CD);
								            String no = collectNum.getNo();
								            if (no == null || no.length() == 0) {
									            //採番結果がない
									            setErrorMessage("ZZ01106");
									            setNextUrl("/AE0060021.jsp");
											    conn.rollback();
									            return;
								            }
								            struct.setsetRCV_ISSUE_CTRL_CD(no);														// 01.入出庫管理番号
								            struct.setsetRCV_ISSUE_TYP("2");														// 02.入出庫区分(2:固定)
								            struct.setsetITEM_CD(temppartStruct.getreadITEM_CD());									// 03.品目番号
								            struct.setsetPLANT_CD(temppartStruct.getreadPLANT_CD());								// 04.工場コード
								            struct.setsetWH_CD(tempWhStruct.getreadWH_CD());										// 05.保管区コード
								            // 品目手配区分による更新値変更
								            if (("1".equals(temppartStruct.getreadMRP_ODR_TYP())) ||
								                ("2".equals(temppartStruct.getreadMRP_ODR_TYP()))) 
								            {
									            struct.setsetJOB_ODR_CD(temppartStruct.getreadJOB_ODR_CD());						// 06.製番
									            struct.setsetJOB_ODR_DETAIL_NO(temppartStruct.getreadJOB_ODR_DETAIL_NO());			// 07.製番枝番
								            } else {
									            struct.setsetJOB_ODR_CD("");														// 06.製番
									            struct.setsetJOB_ODR_DETAIL_NO("0");												// 07.製番枝番
								            }
								            struct.setsetPUCH_ODR_CD(struct.getPUCH_ODR_CD());										// 08.画面:発注番号
								            struct.setsetACPT_NO(struct.getACPT_NO());												// 09.画面:受入回数
								            struct.setsetACPT_RSLT_CRCT_NO(beforeAcpt);												// 10.受入実績訂正回数(0:固定)
								            struct.setsetINSPEC_RSLT_CRCT_NO(beforeInspc);											// 11.検査実績訂正回数(0:固定)
								            struct.setsetWORK_ODR_CD(null);															// 12.作業計画番号(null)
								            struct.setWORK_IN_PROC_CD(null);														// 13.仕掛作業コード(null)
								            struct.setsetPARTIAL_PRD_NO("0");														// 14.分作回数(0:固定)
								            struct.setsetOPR_RSLT_CRCT_NO("0");														// 15.作業実績訂正回数(0:固定)
								            struct.setsetISSUE_INST_CD(temppartStruct.getreadISSUE_INST_CD());						// 16.出庫指示番号
								            struct.setsetRCV_ISSUE_BEFORE_QTY(String.valueOf(beforeQty));							// 17.入出庫前在庫数
								            struct.setsetRCV_ISSUE_QTY(String.valueOf(totalissueQty));								// 18.入出庫数
								            struct.setsetRCV_ISSUE_AFTER_QTY(String.valueOf(beforeQty + totalissueQty));			// 19.入出庫後在庫数
								            struct.setsetRCV_ISSUE_AMOUNT("0");														// 20.入出庫金額(0:固定)
								            struct.setsetRCV_ISSUE_DATE(struct.getACPT_DATE());										// 21.入出庫年月日
								            struct.setsetRCV_ISSUE_GNR_TYP("79");													// 22.入出庫発生区分(79)
								            struct.setsetRCV_ISSUE_ODD_QTY("0");													// 23.入出庫端数(0:固定)
								            struct.setsetDEFECT_CAUSE_CD(null);														// 24.入出庫不良理由コード
								            struct.setsetSTOCK_UPD_TYP("2");														// 25.在庫更新区分(2:固定)
								            struct.setsetRCV_ISSUE_CMPLT_FLG("0");													// 26.入出庫完了フラグ
								            struct.setsetOD_NO(temppartStruct.getreadOD_NO());										// 27.オーダデマンド番号
								            struct.setsetVEND_LOT_NO(struct.getVEND_LOT_NO());										// 29.画面:メーカロット番号
								            struct.setsetRCV_ISSUE_COMMENT(null);													// 30.入出庫備考(null)
								            struct.setsetCOMPANY_CD(temppartStruct.getreadCOMPANY_CD());							// 31.会社コード
								            struct.setsetVEND_CD(temppartStruct.getreadVEND_CD());									// 32.取引先コード
								            if(temppartStruct.getreadCONS_TYP() == null || ("").equals(temppartStruct.getreadCONS_TYP()) == true)
								            {
									            struct.setsetCONS_TYP("2");
								            } else {
									            struct.setsetCONS_TYP(temppartStruct.getreadCONS_TYP());							// 33.支給区分
								            }
								            struct.setsetCONS_EXEC_DATE(null);														// 34.有償支給実績抽出日
								            List tmpL = new ArrayList(0);
					                        if(listBak != null && listBak.size() > 0){
					                        	for(int loopNum=0; loopNum<listBak.size(); loopNum++){
					                        		AE0060020Struct tmpStrt = (AE0060020Struct)listBak.get(loopNum);
					                        		if(struct.getACPT_NO().equals(tmpStrt.getreadACPT_NO()) && 
					                        		    temppartStruct.getreadISSUE_INST_CD().equals(tmpStrt.getreadISSUE_INST_CD()) && 
					                        		    temppartStruct.getreadITEM_CD().equals(tmpStrt.getreadITEM_CD())){
					                        		    tmpL.add(tmpStrt.getreadLOT_NO());
					                        		    tmpL.add(tmpStrt.getreadTOTAL_ISSUE_QTY());
					                        		}
					                        	}
					                        }
					                        double afterQty1 = 0.0;
					                        if(tmpL != null && tmpL.size() > 0){
					            	            double beforeQty1 = beforeQty;
						                        for(int l=0; l<tmpL.size(); l++){
							                        if(l > 0){
								                        no = null;
							                            CollectNumber collectNum1 = new CollectNumber(CollectNumber.ISSUE_CD,this.sysUSER_CD,
										                		                    this.sp.getProcId(),this.sysPLANT_CD);
					                                    no = collectNum1.getNo();
					                                    if (no == null || no.length() == 0) 
					                                    {
						                                    //採番結果がない
						                                    setErrorMessage("ZZ01106");
						                                    setNextUrl("/AE0060021.jsp");
														    conn.rollback();
						                                    return;
					                                    }
					                                    beforeQty1 = afterQty1;
					                                }
					                                struct.setsetRCV_ISSUE_CTRL_CD(no);
							                        struct.setsetLOT_NO((String)tmpL.get(l));                                               // 28:[ロット別使用実績]．”在庫ロット番号”
							                        rcvissueQty = getDoubleValue((String)tmpL.get(l+1));
					                                afterQty1 = beforeQty1 + rcvissueQty;
					                                struct.setsetRCV_ISSUE_BEFORE_QTY(String.valueOf(beforeQty1));							// 17.入出庫前在庫数
								                    struct.setsetRCV_ISSUE_QTY(String.valueOf(rcvissueQty));								// 18.入出庫数
								                    struct.setsetRCV_ISSUE_AFTER_QTY(String.valueOf(afterQty1));			                // 19.入出庫後在庫数
						                            entity.minsertT_RCV_ISSUE.create(conn, struct);
						                            //[ロット別品目在庫登録・更新処理（excUpdateLotStockFd）]
						                            BizCommon bc = new BizCommon(conn, getsysUSER_CD(), sp.getProcId(), getsysPLANT_CD());                                                              
						                            List updateLotStockList = bc.excUpdateLotStockFd(no, "");
						                            if(bc.getResultStatus().intValue() == 1){
						                            }else{
						                                if(updateLotStockList != null && updateLotStockList.size() > 0){
						        		                    setErrorMessage((String)updateLotStockList.get(0));
						        		                    setNextUrl("/AE0060021.jsp");
														    conn.rollback();						        		                    
						        		                    return;
						                                }else{
						        		                    setErrorMessage("ZZ22001");
						        		                    setNextUrl("/AE0060021.jsp");
														    conn.rollback();						        		                    
						        		                    return;						                                	
						                                }
						                            }
						                            if("1".equals(lotControlFlgBak)){
											        	if(acptQty != 0 && vendlotno_bak != null){
							                	            // [ロットトレース登録・更新処理（excMakeLotTraceFd）]
							                                List lotTraceList = bc.excMakeLotTraceFd(temppartStruct.getreadITEM_CD(), 
							                                		                                 (String)tmpL.get(l), 
							                                		                                 struct.getITEM_CD_LOT(),
							                                		                                 vendlotno_bak, 
							                                		                                 "1");
							                                if(bc.getResultStatus().intValue() == 1){
							                                	struct.setFROM_ITEM_CD(temppartStruct.getreadITEM_CD());
							                                	struct.setFROM_LOT_NO((String)tmpL.get(l));
							                                	struct.setTO_ITEM_CD(struct.getITEM_CD_LOT());
							                                	struct.setTO_LOT_NO(vendlotno_bak);
												            	struct.setTO_PUCH_ODR_CD(struct.getPUCH_ODR_CD());
												            	//[受入実績]で発注番号を取得
												            	List formList = entity.mgetFROM_PUCH_ODR_CD.read(conn, struct);
												            	if((formList != null && formList.size() > 0)){
												            		//発注番号をソート順（降順）にし、１件目のレコードを取得する。
												            		AE0060020Struct orderStruct = (AE0060020Struct) formList.get(0);
												            		//[ロットトレース].“元発注番号” = [受入実績]."発注番号"
												            		struct.setFROM_PUCH_ODR_CD(orderStruct.getFROM_PUCH_ODR_CD());
												            	}else{
												            		struct.setFROM_PUCH_ODR_CD("");
												            	}
							                                	entity.mupdateT_LOT_TRACE.update(conn, struct);
							                                }else{
							                                    if(lotTraceList != null && lotTraceList.size() > 0){
							             	 	                    setErrorMessage((String)lotTraceList.get(0));
							             	 	                    setNextUrl("/AE0060021.jsp");
																    conn.rollback();						        		                    
	                                                                return;
							                                    }else{
							             	 	                    setErrorMessage("ZZ22016");
							             	 	                    setNextUrl("/AE0060021.jsp");
																    conn.rollback();						        		                    
	                                                                return;
							                                    }
							                                }
											        	}
						                            }else{
						                            }
						                            l = l + 1;
						                        }
					                        }else{
					                        	struct.setsetLOT_NO(null);
						                        entity.minsertT_RCV_ISSUE.create(conn, struct);
					                        }
		
								            // 保管区別入出庫(T_RCV_ISSUE)の登録処理(黒)
								            // 入出庫番号採番
								            CollectNumber collectNum2 = new CollectNumber(CollectNumber.ISSUE_CD,this.sysUSER_CD,
											            				this.sp.getProcId(),this.sysPLANT_CD);
								            no = collectNum2.getNo();
								            if (no == null || no.length() == 0) 
								            {
									            //採番結果がない
									            setErrorMessage("ZZ01106");
									            setNextUrl("/AE0060021.jsp");
											    conn.rollback();						        		                    
									            return;
								            }
								            struct.setsetRCV_ISSUE_CTRL_CD(no);														// 01.入出庫管理番号
								            struct.setsetRCV_ISSUE_TYP("2");														// 02.入出庫区分(2:固定)
								            struct.setsetITEM_CD(temppartStruct.getreadITEM_CD());									// 03.品目番号
								            struct.setsetPLANT_CD(temppartStruct.getreadPLANT_CD());								// 04.工場コード
								            struct.setsetWH_CD(tempWhStruct.getreadWH_CD());										// 05.保管区コード
								            // 品目手配区分による更新値変更
								            if (("1".equals(temppartStruct.getreadMRP_ODR_TYP())) ||
								                ("2".equals(temppartStruct.getreadMRP_ODR_TYP()))) 
								            {
									            struct.setsetJOB_ODR_CD(temppartStruct.getreadJOB_ODR_CD());						// 06.製番
									            struct.setsetJOB_ODR_DETAIL_NO(temppartStruct.getreadJOB_ODR_DETAIL_NO());			// 07.製番枝番
								            } else {
									            struct.setsetJOB_ODR_CD("");														// 06.製番
									            struct.setsetJOB_ODR_DETAIL_NO("0");												// 07.製番枝番
								            }
								            struct.setsetPUCH_ODR_CD(struct.getPUCH_ODR_CD());										// 08.画面:発注番号
								            struct.setsetACPT_NO(struct.getACPT_NO());												// 09.画面:受入回数
								            struct.setsetACPT_RSLT_CRCT_NO(strAcpt);												// 10.受入実績訂正回数
								            struct.setsetINSPEC_RSLT_CRCT_NO(strInspc);												// 11.検査実績訂正回数
								            struct.setsetWORK_ODR_CD(null);															// 12.作業計画番号(null)
								            struct.setWORK_IN_PROC_CD(null);														// 13.仕掛作業コード(null)
								            struct.setsetPARTIAL_PRD_NO("0");														// 14.分作回数(0:固定)
								            struct.setsetOPR_RSLT_CRCT_NO("0");														// 15.作業実績訂正回数(0:固定)
								            struct.setsetISSUE_INST_CD(temppartStruct.getreadISSUE_INST_CD());						// 16.出庫指示番号
								            struct.setsetRCV_ISSUE_BEFORE_QTY(String.valueOf(beforeQty + totalissueQty));			// 17.入出庫前在庫数
								            struct.setsetRCV_ISSUE_QTY(String.valueOf(planSum.intValue() * -1));					// 18.入出庫数
								            struct.setsetRCV_ISSUE_AFTER_QTY(String.valueOf(afterQty));			// 19.入出庫後在庫数
								            struct.setsetRCV_ISSUE_AMOUNT("0");														// 20.入出庫金額(0:固定)
								            struct.setsetRCV_ISSUE_DATE(struct.getACPT_DATE());										// 21.入出庫年月日
								            struct.setsetRCV_ISSUE_GNR_TYP("71");													// 22.入出庫発生区分(71)
								            struct.setsetRCV_ISSUE_ODD_QTY("0");													// 23.入出庫端数(0:固定)
								            struct.setsetDEFECT_CAUSE_CD(null);														// 24.入出庫不良理由コード
								            struct.setsetSTOCK_UPD_TYP("2");														// 25.在庫更新区分(2:固定)
								            struct.setsetRCV_ISSUE_CMPLT_FLG("0");													// 26.入出庫完了フラグ
								            struct.setsetOD_NO(temppartStruct.getreadOD_NO());										// 27.オーダデマンド番号
								            struct.setsetVEND_LOT_NO(struct.getVEND_LOT_NO());										// 29.画面:メーカロット番号
								            struct.setsetRCV_ISSUE_COMMENT(null);													// 30.入出庫備考(null)
								            struct.setsetCOMPANY_CD(temppartStruct.getreadCOMPANY_CD());							// 31.会社コード
								            struct.setsetVEND_CD(temppartStruct.getreadVEND_CD());									// 32.取引先コード
								            if(temppartStruct.getreadCONS_TYP() == null || ("").equals(temppartStruct.getreadCONS_TYP()) == true)
								            {
									            struct.setsetCONS_TYP("2");
								            } else {
									            struct.setsetCONS_TYP(temppartStruct.getreadCONS_TYP());							// 33.支給区分
								            }
								            struct.setsetCONS_EXEC_DATE(null);														// 34.有償支給実績抽出日
								            if("true".equals(struct.getc_CANCEL())){
						                		if(tmpL != null && tmpL.size() > 0){
						                			if(lotNoList == null){
						                				lotNoList = new ArrayList();
						                			}
						                			for(int lp=0; lp<tmpL.size(); lp++){
						                				lotNoList.add((String)tmpL.get(lp));
						                			    lotNoList.add("0");
						                			    lp = lp + 1;
						                			}
						                		}
						                	}
					                        if(lotNoList != null && lotNoList.size() > 0){
					                        	double afterQty2 = 0.0;
					            	            double beforeQty2 = afterQty1;
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
						                                    setNextUrl("/AE0060021.jsp");
														    conn.rollback();						        		                    
						                                    return;
					                                    }
					                                    beforeQty2 = afterQty2;
					                                }
					                                struct.setsetRCV_ISSUE_CTRL_CD(no);
							                        struct.setsetLOT_NO((String)lotNoList.get(l));                          // 28.在庫ロット番号
							                        rcvissueQty = getDoubleValue((String)lotNoList.get(l+1)) * -1;
							                        afterQty2 = beforeQty2 + rcvissueQty;
							                        struct.setsetRCV_ISSUE_BEFORE_QTY(String.valueOf(beforeQty2));			// 17.入出庫前在庫数
								                    struct.setsetRCV_ISSUE_QTY(String.valueOf(rcvissueQty));				// 18.入出庫数
								                    struct.setsetRCV_ISSUE_AFTER_QTY(String.valueOf(afterQty2));			// 19.入出庫後在庫数
						                            entity.minsertT_RCV_ISSUE.create(conn, struct);
						                            // [ロット別品目在庫登録・更新処理（excUpdateLotStockFd）]
						                            BizCommon bc = new BizCommon(conn, getsysUSER_CD(), sp.getProcId(), getsysPLANT_CD());
						                            List updateLotStockList = bc.excUpdateLotStockFd(no,"");
						                            if(bc.getResultStatus().intValue() == 1){
						                            }else{
						                                if(updateLotStockList != null && updateLotStockList.size() > 0){
						        		                    setErrorMessage((String)updateLotStockList.get(0));
						        		                    setNextUrl("/AE0060021.jsp");
														    conn.rollback();						        		                    
						        		                    return;
						                                }else{
						        		                    setErrorMessage("ZZ22001");
						        		                    setNextUrl("/AE0060021.jsp");
														    conn.rollback();						        		                    
						        		                    return;
						                                }
						                            }
						                            if("1".equals(lotControlFlgBak)){
						                	            // [ロットトレース登録・更新処理（excMakeLotTraceFd）]
											        	if(acptQty != 0 && vendlotno_bak != null){
							                            	List lotTraceList = bc.excMakeLotTraceFd(temppartStruct.getreadITEM_CD(), 
							                            											 (String)lotNoList.get(l),
							                            											 struct.getITEM_CD_LOT(), 
							                            											 vendlotno_bak, 
							                            											 "1");
	
							                                if(bc.getResultStatus().intValue() == 1){
							                                	struct.setFROM_ITEM_CD(temppartStruct.getreadITEM_CD());
							                                	struct.setFROM_LOT_NO((String)lotNoList.get(l));
							                                	struct.setTO_ITEM_CD(struct.getITEM_CD_LOT());
							                                	struct.setTO_LOT_NO(vendlotno_bak);
												            	struct.setTO_PUCH_ODR_CD(struct.getPUCH_ODR_CD());
												            	//[受入実績]で発注番号を取得
												            	List formList = entity.mgetFROM_PUCH_ODR_CD.read(conn, struct);
												            	if((formList != null && formList.size() > 0)){
												            		//発注番号をソート順（降順）にし、１件目のレコードを取得する。
												            		AE0060020Struct orderStruct = (AE0060020Struct) formList.get(0);
												            		//[ロットトレース].“元発注番号” = [受入実績]."発注番号"
												            		struct.setFROM_PUCH_ODR_CD(orderStruct.getFROM_PUCH_ODR_CD());
												            	}else{
												            		struct.setFROM_PUCH_ODR_CD("");
												            	}
							                                	entity.mupdateT_LOT_TRACE.update(conn, struct);
							                                }else{
							                                    if(lotTraceList != null && lotTraceList.size() > 0){
							             	 	                    setErrorMessage((String)lotTraceList.get(0));
							             	 	                    setNextUrl("/AE0060021.jsp");
																    conn.rollback();						        		                    
							             	 	                    return;
							                                    }else{
							             	 	                    setErrorMessage("ZZ22016");
							             	 	                    setNextUrl("/AE0060021.jsp");
																    conn.rollback();						        		                    
							             	 	                    return;
							                                    }
							                                }
											        	}   
						                            }else{
						                            }
						                            l = l + 1;
						                        }
					                        }else{
					                        	struct.setsetLOT_NO(null);
						                        entity.minsertT_RCV_ISSUE.create(conn, struct);
					                        }
								            // 受入数が変更時実施
						                } else {
							                // みなし出庫判定
							                uHantei = true;
							                if (uHantei == true && lHantei2 == false)
							                {
								                // AE00070:支給品みなし出庫処理にてマニュアル処理が1件以上あり
								                setWarningMessage("AE00070");
								                // 判定フラグに"true"をセット
								                lHantei2 = true;
							                }
						                }
					                } // END FOR INNER
				                }
					    	} // END FOR OUTER
					    }
					}else{
						// [支給品使用]に存在の場合。ループチェック
						for (int i = 0; i < temppartList.size(); i++ ) 
						{
							AE0060020Struct temppartStruct = (AE0060020Struct) temppartList.get(i);
							// 使用予定数量の計算
							planSum = new BigDecimal(struct.getACPT_QTY());										// 画面:受入数
							denominator = new BigDecimal(temppartStruct.getreadSUPPLIED_UNIT_DENOMINATOR());	// 支給品使用単位数分母
							numerator = new BigDecimal(temppartStruct.getreadSUPPLIED_UNIT_NUMERATOR());		// 支給品使用単位数分子
							double beforeQty = 0;		// 更新前手持在庫数(初期化)
							double afterQty = 0;		// 更新後手持在庫数(初期化)
							double rcvissueQty = 0;		// 保管区別入出庫入出庫数(初期化)
							double totalissueQty= 0;
							List bakList = null;
							
							// [支給品使用].処理区分 = 1:みなし出庫、または2:マニュアル修正のみ更新処理。
							if (("1".equals(temppartStruct.getreadSUPPLIED_ISSUE_GNR_TYP())) || 
							   ("2".equals(temppartStruct.getreadSUPPLIED_ISSUE_GNR_TYP())))
							{
								// 在庫数単位区分の判定
								if ("1".equals(temppartStruct.getreadUNIT_QTY_TYP()))
								{
									if ("0".equals(temppartStruct.getreadSUPPLIED_UNIT_DENOMINATOR()) || 
										"0".equals(temppartStruct.getreadSUPPLIED_UNIT_NUMERATOR()))
									{
										// 単位分母、分子が0の場合。
										planSum = planSum.setScale(0,BigDecimal.ROUND_UP);
									} else {
										// 1:整数管理
										planSum = planSum.multiply(numerator).divide(denominator,0,BigDecimal.ROUND_UP).setScale(1);
									}
								} else {
									// 小数管理
									if ("0".equals(temppartStruct.getreadSUPPLIED_UNIT_DENOMINATOR()) || 
										"0".equals(temppartStruct.getreadSUPPLIED_UNIT_NUMERATOR()))
									{
										planSum = planSum.setScale(4,BigDecimal.ROUND_HALF_UP);
									} else {
										planSum = planSum.multiply(numerator).divide(denominator,4,BigDecimal.ROUND_HALF_UP);
										//小数の表示スケール処理
										BigDecimal intVal = new BigDecimal("" + planSum.intValue());
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
										planSum = planSum.setScale(roundCount,BigDecimal.ROUND_UP);
									}
								}

								// [支給品使用]の更新処理
								if ("1".equals(temppartStruct.getreadSUPPLIED_ISSUE_GNR_TYP()))
								{
									// [支給品使用].処理区分 = 1:みなし出庫処理更新
									struct.setsetACPT_QTY(struct.getACPT_QTY());						// 画面:受入数
									struct.setsetSUPPLIED_ISSUE_QTY(String.valueOf(planSum));			// 使用予定数量
									struct.setsetTOTAL_ISSUE_QTY(String.valueOf(planSum));				// 使用済数量
									struct.setsetSUPPLIED_DATE(struct.getACPT_DATE());					// 画面.使用日
									struct.setsetPUCH_ODR_CD(struct.getPUCH_ODR_CD());					// 条件.画面:発注番号
									struct.setsetACPT_NO(struct.getACPT_NO());							// 条件.画面:受入回数
									struct.setsetITEM_CD(temppartStruct.getreadITEM_CD());				// 条件.支給品品目番号
									entity.mupdateT_PART_SUPPLIED_ISSUE.update(conn, struct);
								} else {
									// [支給品使用].処理区分 = 2:マニュアル修正更新
									struct.setsetACPT_QTY(struct.getACPT_QTY());						// 画面:受入数
									struct.setsetSUPPLIED_ISSUE_QTY(String.valueOf(planSum));			// 使用予定数量
									struct.setsetPUCH_ODR_CD(struct.getPUCH_ODR_CD());					// 条件.画面:発注番号
									struct.setsetACPT_NO(struct.getACPT_NO());							// 条件.画面:受入回数
									struct.setsetITEM_CD(temppartStruct.getreadITEM_CD());				// 条件.支給品品目番号
									entity.mupdateT_PART_SUPPLIED_ISSUE_GNR.update(conn, struct);
								}

							    if(lotNoList != null){
	                                lotNoList.clear();
	                            }
	                            if(bakList != null){
	                            	bakList.clear();
	                            }else{
	                            	bakList = new ArrayList(0);
	                            }
							    if(_lotCtrlFlg && "1".equals(temppartStruct.getreadLOT_CONTROL_FLG())){
									struct.setsetPUCH_ODR_CD(struct.getPUCH_ODR_CD());					// 条件.画面:発注番号
								    struct.setsetACPT_NO(struct.getACPT_NO());							// 条件.画面:受入回数
								    struct.setsetITEM_CD(temppartStruct.getreadITEM_CD());              // 条件.支給品品目番号
									List lotList = entity.mSelectT_LOT_USE_RSLT_LOT_NO2.read(conn, struct);
								    if(lotList != null && lotList.size() > 0){
								    	for(int l=0; l<lotList.size(); l++){
								    	    AE0060020Struct lotStruct = (AE0060020Struct)lotList.get(l);
								    	    bakList.add(lotStruct.getreadLOT_NO());
								    	    bakList.add(lotStruct.getreadTOTAL_ISSUE_QTY());
								    	    lotNoList.add(lotStruct.getreadLOT_NO());
								    	    if("1".equals(temppartStruct.getreadSUPPLIED_ISSUE_GNR_TYP())){
								    	        lotNoList.add(String.valueOf(planSum));
								    	    }else{
								    	    	lotNoList.add(temppartStruct.getreadTOTAL_ISSUE_QTY());
								    	    }
								    	}
								    	if(temppartStruct.getreadISSUE_INST_CD() != null && 
					                       !"".equals(temppartStruct.getreadISSUE_INST_CD().trim())){
											struct.setsetSUPPLIED_ISSUE_QTY(String.valueOf(planSum));			// 使用予定数量
								            struct.setsetTOTAL_ISSUE_QTY(String.valueOf(planSum));				// 使用済数量
											struct.setsetSUPPLIED_DATE(struct.getACPT_DATE());					// 画面.使用日
											struct.setsetPART_SUPPLIED_COMMENT(temppartStruct.getreadPART_SUPPLIED_COMMENT());
								            struct.setsetPUCH_ODR_CD(struct.getPUCH_ODR_CD());					// 条件.画面:発注番号
								            struct.setsetACPT_NO(struct.getACPT_NO());							// 条件.画面:受入回数
								            struct.setsetITEM_CD(temppartStruct.getreadITEM_CD());              // 条件.支給品品目番号
											entity.mupdateT_LOT_USE_RSLT3.update(conn, struct);       // [ロット別使用実績]の更新
										}else{
											struct.setsetSUPPLIED_ISSUE_QTY(String.valueOf(planSum));			   // 使用予定数量
											struct.setsetTOTAL_ISSUE_QTY(temppartStruct.getreadTOTAL_ISSUE_QTY()); // 使用済数量
											struct.setsetSUPPLIED_DATE(temppartStruct.getreadSUPPLIED_DATE());	   // 使用日
											struct.setsetPART_SUPPLIED_COMMENT(temppartStruct.getreadPART_SUPPLIED_COMMENT());
								            struct.setsetPUCH_ODR_CD(struct.getPUCH_ODR_CD());					   // 条件.画面:発注番号
								            struct.setsetACPT_NO(struct.getACPT_NO());							   // 条件.画面:受入回数
								            struct.setsetITEM_CD(temppartStruct.getreadITEM_CD());                 // 条件.支給品品目番号
											entity.mupdateT_LOT_USE_RSLT3.update(conn, struct);          // [ロット別使用実績]の更新
										}
								    }
							    }
							    
								// 画面.受入数(修正前)<>画面.受入数(修正後)の場合
								// 保管区別品目在庫、製番在庫の追加、更新
								// 保管区別入出庫の登録は画面受入数が変更されたら実施する。
								if (!(struct.getACPT_QTY()).equals(struct.geth_ACPT_QTY())) 
								{
									// ■②保管区別品目在庫(T_ITEM_STOCK)、保管区別製番在庫(T_JOB_ODR_CD_STOCK)の登録・更新処理
									// 保管区コード取得
									struct.setsetVEND_CD(temppartStruct.getreadVEND_CD());
									struct.setsetPLANT_CD(temppartStruct.getreadPLANT_CD());
									List mWhList = entity.mreadM_WH.read(conn, struct);
									AE0060020Struct tempWhStruct = (AE0060020Struct) mWhList.get(0);

									// 品目手配区分による更新対象の変更
									if (("4".equals(temppartStruct.getreadMRP_ODR_TYP())) || ("5".equals(temppartStruct.getreadMRP_ODR_TYP())) ||
									   ("6".equals(temppartStruct.getreadMRP_ODR_TYP())) || ("7".equals(temppartStruct.getreadMRP_ODR_TYP())))
									{
										// MRP管理品(保管区別品目在庫対象)
										// 保管区別品目在庫チェック
										struct.setsetITEM_CD(temppartStruct.getreadITEM_CD());
										struct.setsetWH_CD(tempWhStruct.getreadWH_CD());
										try{
											List lockStList = entity.mlockT_ITEM_STOCK.read(conn, struct);
										}catch (ResourceBusyException rbe) {
											setErrorMessage("ZZ01105");
											setNextUrl("/AE0060021.jsp");
											conn.rollback();
											return;
										}
										List itemStList = entity.mreadT_ITEM_STOCK.read(conn, struct);

										// 更新チェック
										if (itemStList.isEmpty()) 
										{
											// 保管区別品目在庫登録
											struct.setsetITEM_CD(temppartStruct.getreadITEM_CD());							// 01.品目番号
											struct.setsetWH_CD(tempWhStruct.getreadWH_CD());								// 02.保管区コード
											struct.setsetPLANT_CD(temppartStruct.getreadPLANT_CD());						// 03.工場コード
											struct.setsetSTOCK_ON_HAND_QTY(String.valueOf(String.valueOf(
																			Double.parseDouble(temppartStruct.getreadTOTAL_ISSUE_QTY()) 
																			- planSum.doubleValue())));		// 04.品目別手持在庫数
											entity.minsertT_ITEM_STOCK.create(conn, struct);

											// マイナス値チェック
											beforeQty = 0;																	// 更新前
											afterQty = Double.parseDouble(temppartStruct.getreadTOTAL_ISSUE_QTY()) 
																			- planSum.doubleValue(); 						// 更新後
											totalissueQty = Double.parseDouble(temppartStruct.getreadTOTAL_ISSUE_QTY());	// 使用済数量待避
											// 判定フラグに"true"(マイナスデータ)セット
											if (afterQty < 0)
											{
												mHantei = true;
											}
										} else {
												AE0060020Struct tempitemStruct = (AE0060020Struct) itemStList.get(0);
												// 保管区別品目在庫更新
												struct.setsetSTOCK_ON_HAND_QTY(String.valueOf(Double.parseDouble(tempitemStruct.getreadSTOCK_ON_HAND_QTY()) 
																				+ Double.parseDouble(temppartStruct.getreadTOTAL_ISSUE_QTY())
																				- planSum.doubleValue()));						// 01.品目別手持在庫数
												struct.setsetITEM_CD(temppartStruct.getreadITEM_CD());							// 条件.品目番号
												struct.setsetWH_CD(tempWhStruct.getreadWH_CD());								// 条件.保管区コード
												entity.mupdateT_ITEM_STOCK.update(conn, struct);

												// 更新前手持在庫数セット
												beforeQty = Double.parseDouble(tempitemStruct.getreadSTOCK_ON_HAND_QTY());		// 更新前
												afterQty = Double.parseDouble(tempitemStruct.getreadSTOCK_ON_HAND_QTY()) 
																				+ Double.parseDouble(temppartStruct.getreadTOTAL_ISSUE_QTY())
																				- planSum.doubleValue();						// 更新後
												totalissueQty = Double.parseDouble(temppartStruct.getreadTOTAL_ISSUE_QTY());	// 使用済数量待避
												// マイナス値チェック
												if (afterQty < 0)
												{
													// 判定フラグに"true"(マイナスデータ)セット
													mHantei = true;
												}
										}
									} else if (("1".equals(temppartStruct.getreadMRP_ODR_TYP())) || ("2".equals(temppartStruct.getreadMRP_ODR_TYP()))) {
										// 製番管理品(保管区別製番在庫対象)
										// 保管区別製番在庫チェック
										struct.setsetJOB_ODR_CD(temppartStruct.getreadJOB_ODR_CD());						// 製番
										struct.setsetJOB_ODR_DETAIL_NO(temppartStruct.getreadJOB_ODR_DETAIL_NO());			// 製番枝番
										struct.setsetITEM_CD(temppartStruct.getreadITEM_CD());								// 品目番号
										struct.setsetWH_CD(tempWhStruct.getreadWH_CD());									// 保管区コード
										List itemJobList = entity.mreadT_JOB_ODR_CD_STOCK.read(conn, struct);

										// 更新チェック
										if (itemJobList.isEmpty()) 
										{
											// 保管区別製番在庫登録
											struct.setsetJOB_ODR_CD(temppartStruct.getreadJOB_ODR_CD());					// 01.製番
											struct.setsetJOB_ODR_DETAIL_NO(temppartStruct.getreadJOB_ODR_DETAIL_NO());		// 02.製番枝番
											struct.setsetITEM_CD(temppartStruct.getreadITEM_CD());							// 03.品目番号
											struct.setsetWH_CD(tempWhStruct.getreadWH_CD());								// 04.保管区コード
											struct.setsetPLANT_CD(temppartStruct.getreadPLANT_CD());						// 05.工場コード
											struct.setsetSTOCK_ON_HAND_QTY(String.valueOf(Double.parseDouble(temppartStruct.getreadTOTAL_ISSUE_QTY()) 
																							- planSum.doubleValue()));		// 06.製番別手持在庫数
											entity.minsertT_JOB_ODR_CD_STOCK.create(conn, struct);

											// マイナス値チェック
											beforeQty = 0;																	// 更新前
											afterQty = Double.parseDouble(temppartStruct.getreadTOTAL_ISSUE_QTY()) 
																							- planSum.doubleValue();		// 更新後
											totalissueQty = Double.parseDouble(temppartStruct.getreadTOTAL_ISSUE_QTY());	// 使用済数量待避
											// マイナス値チェック
											if (afterQty < 0)
											{
												// 判定フラグに"true"(マイナスデータ)セット
												mHantei = true;
											}
										} else {
											AE0060020Struct tempJobStruct = (AE0060020Struct) itemJobList.get(0);
											// 保管区別製番在庫更新
											struct.setsetSTOCK_ON_HAND_QTY(String.valueOf(Double.parseDouble(tempJobStruct.getreadSTOCK_ON_HAND_QTY()) 
																			+ Double.parseDouble(temppartStruct.getreadTOTAL_ISSUE_QTY())
																			- planSum.doubleValue()));						// 01.製番別手持在庫数
											struct.setsetJOB_ODR_CD(temppartStruct.getreadJOB_ODR_CD());					// 条件.製番
											struct.setsetJOB_ODR_DETAIL_NO(temppartStruct.getreadJOB_ODR_DETAIL_NO());		// 条件.製番枝番
											struct.setsetITEM_CD(temppartStruct.getreadITEM_CD());							// 条件.品目番号
											struct.setsetWH_CD(tempWhStruct.getreadWH_CD());								// 条件.保管区コード
											entity.mupdateT_JOB_ODR_CD_STOCK.update(conn, struct);

											// マイナス値チェック
											beforeQty = Double.parseDouble(tempJobStruct.getreadSTOCK_ON_HAND_QTY());		// 更新前
											afterQty = Double.parseDouble(tempJobStruct.getreadSTOCK_ON_HAND_QTY()) 
																			+ Double.parseDouble(temppartStruct.getreadTOTAL_ISSUE_QTY())
																			- planSum.doubleValue();						// 更新後
											totalissueQty = Double.parseDouble(temppartStruct.getreadTOTAL_ISSUE_QTY());	// 使用済数量待避
											// 在庫数のマイナスチェック
											if (afterQty < 0)
											{
												// 判定フラグに"true"(マイナスデータ)セット
												mHantei = true;
											}
										}
									}

									// マイナス判定のインフォメーション表示
									if (mHantei == true && lHantei == false)
									{
										// AE00069:支給品みなし出庫で取引先保管区の品目または
										// 製番手持在庫数が一部マイナスとなりました。
										// setErrorMessage("AE00069");
										setWarningMessage("AE00069");
										// 判定フラグに"true"をセット
										lHantei = true;
									}

									// [受入実績]の受入訂正回数取得
									List acptCrList = entity.mreadT_ACPT_RSLT.read(conn, struct);
									if (acptCrList.isEmpty())
									{
										strAcpt = "0";
										beforeAcpt = "0";
									} else {
										AE0060020Struct tempAcptStruct = (AE0060020Struct) acptCrList.get(0);
										strAcpt = tempAcptStruct.getreadACPT_CRCT_NO();
										beforeAcpt = (String.valueOf(Integer.parseInt(strAcpt) - 1));
									}

									// [検査実績]の検査訂正回数取得
									List inspcRsList = entity.mreadT_INSPC_RSLT.read(conn, struct);
									if (inspcRsList.isEmpty())
									{
										strInspc = "0";
										beforeInspc = "0";
									} else {
										AE0060020Struct tempInspcStruct = (AE0060020Struct) inspcRsList.get(0);
										strInspc = tempInspcStruct.getreadINSPC_CRCT_NO();
										beforeInspc = (String.valueOf(Integer.parseInt(strInspc) - 1));
									}

									// 保管区別入出庫(T_RCV_ISSUE)の登録処理(赤)
									// 入出庫番号採番
									CollectNumber collectNum = new CollectNumber(CollectNumber.ISSUE_CD,this.sysUSER_CD,
																this.sp.getProcId(),this.sysPLANT_CD);
									String no = collectNum.getNo();
									if (no == null || no.length() == 0) 
									{
										//採番結果がない
										setErrorMessage("ZZ01106");
										setNextUrl("/AE0060021.jsp");
										return;
									}

									struct.setsetRCV_ISSUE_CTRL_CD(no);														// 01.入出庫管理番号
									struct.setsetRCV_ISSUE_TYP("2");														// 02.入出庫区分(2:固定)
									struct.setsetITEM_CD(temppartStruct.getreadITEM_CD());									// 03.品目番号
									struct.setsetPLANT_CD(temppartStruct.getreadPLANT_CD());								// 04.工場コード
									struct.setsetWH_CD(tempWhStruct.getreadWH_CD());										// 05.保管区コード

									// 品目手配区分による更新値変更
									if (("1".equals(temppartStruct.getreadMRP_ODR_TYP())) ||
									    ("2".equals(temppartStruct.getreadMRP_ODR_TYP()))) 
									{
										struct.setsetJOB_ODR_CD(temppartStruct.getreadJOB_ODR_CD());						// 06.製番
										struct.setsetJOB_ODR_DETAIL_NO(temppartStruct.getreadJOB_ODR_DETAIL_NO());			// 07.製番枝番
									} else {
										struct.setsetJOB_ODR_CD("");														// 06.製番
										struct.setsetJOB_ODR_DETAIL_NO("0");												// 07.製番枝番
									}
									struct.setsetPUCH_ODR_CD(struct.getPUCH_ODR_CD());										// 08.画面:発注番号
									struct.setsetACPT_NO(struct.getACPT_NO());												// 09.画面:受入回数
									struct.setsetACPT_RSLT_CRCT_NO(beforeAcpt);												// 10.受入実績訂正回数(0:固定)
									struct.setsetINSPEC_RSLT_CRCT_NO(beforeInspc);											// 11.検査実績訂正回数(0:固定)
									struct.setsetWORK_ODR_CD(null);															// 12.作業計画番号(null)
									struct.setWORK_IN_PROC_CD(null);														// 13.仕掛作業コード(null)
									struct.setsetPARTIAL_PRD_NO("0");														// 14.分作回数(0:固定)
									struct.setsetOPR_RSLT_CRCT_NO("0");														// 15.作業実績訂正回数(0:固定)
									struct.setsetISSUE_INST_CD(temppartStruct.getreadISSUE_INST_CD());						// 16.出庫指示番号
									struct.setsetRCV_ISSUE_BEFORE_QTY(String.valueOf(beforeQty));							// 17.入出庫前在庫数
									struct.setsetRCV_ISSUE_QTY(String.valueOf(totalissueQty));								// 18.入出庫数
									struct.setsetRCV_ISSUE_AFTER_QTY(String.valueOf(beforeQty + totalissueQty));			// 19.入出庫後在庫数
									struct.setsetRCV_ISSUE_AMOUNT("0");														// 20.入出庫金額(0:固定)
									struct.setsetRCV_ISSUE_DATE(struct.getACPT_DATE());										// 21.入出庫年月日
									struct.setsetRCV_ISSUE_GNR_TYP("79");													// 22.入出庫発生区分(79)
									struct.setsetRCV_ISSUE_ODD_QTY("0");													// 23.入出庫端数(0:固定)
									struct.setsetDEFECT_CAUSE_CD(null);														// 24.入出庫不良理由コード
									struct.setsetSTOCK_UPD_TYP("2");														// 25.在庫更新区分(2:固定)
									struct.setsetRCV_ISSUE_CMPLT_FLG("0");													// 26.入出庫完了フラグ
									struct.setsetOD_NO(temppartStruct.getreadOD_NO());										// 27.オーダデマンド番号
									struct.setsetVEND_LOT_NO(struct.getVEND_LOT_NO());										// 28.画面:メーカロット番号
									struct.setsetRCV_ISSUE_COMMENT(null);													// 29.入出庫備考(null)
									struct.setsetCOMPANY_CD(temppartStruct.getreadCOMPANY_CD());							// 30.会社コード
									struct.setsetVEND_CD(temppartStruct.getreadVEND_CD());									// 31.取引先コード
									if(temppartStruct.getreadCONS_TYP() == null || ("").equals(temppartStruct.getreadCONS_TYP()) == true)
									{
										struct.setsetCONS_TYP("2");
									} else {
										struct.setsetCONS_TYP(temppartStruct.getreadCONS_TYP());							// 32.支給区分
									}
									struct.setsetCONS_EXEC_DATE(null);														// 33.有償支給実績抽出日
									
									double afterQty1 = 0.0;
						            if(_lotCtrlFlg && bakList != null && bakList.size() > 0){
						            	double beforeQty1 = beforeQty;
							            for(int l=0; l<bakList.size(); l++){
								            if(l > 0){
									            no = null;
								                CollectNumber collectNum1 = new CollectNumber(CollectNumber.ISSUE_CD,this.sysUSER_CD,
											                		              this.sp.getProcId(),this.sysPLANT_CD);
						                        no = collectNum1.getNo();
						                        if (no == null || no.length() == 0) 
						                        {
							                        //採番結果がない
							                        setErrorMessage("ZZ01106");
							                        setNextUrl("/AE0060021.jsp");
							                        conn.rollback();
							                        return;
						                        }
						                        beforeQty1 = afterQty1;
						                    }
						                    struct.setsetRCV_ISSUE_CTRL_CD(no);
								            struct.setsetLOT_NO((String)bakList.get(l));                                            // 28.在庫ロット番号
								            rcvissueQty = getDoubleValue((String)bakList.get(l+1));
						                    afterQty1 = beforeQty1 + rcvissueQty;
						                    struct.setsetRCV_ISSUE_BEFORE_QTY(String.valueOf(beforeQty1));							// 17.入出庫前在庫数
									        struct.setsetRCV_ISSUE_QTY(String.valueOf(rcvissueQty));								// 18.入出庫数
									        struct.setsetRCV_ISSUE_AFTER_QTY(String.valueOf(afterQty1));			                // 19.入出庫後在庫数
							                entity.minsertT_RCV_ISSUE.create(conn, struct);
							                //[ロット別品目在庫登録・更新処理（excUpdateLotStockFd）]
							                BizCommon bc = new BizCommon(conn, getsysUSER_CD(), sp.getProcId(), getsysPLANT_CD());
							                List updateLotStockList = bc.excUpdateLotStockFd(no, "");
							                if(bc.getResultStatus().intValue() == 1){
							                }else{
							                    if(updateLotStockList != null && updateLotStockList.size() > 0){
							        		        setErrorMessage((String)updateLotStockList.get(0));
							        		        setNextUrl("/AE0060021.jsp");
							        		        conn.rollback();
							        		        return;
							                    }else{
							        		        setErrorMessage("ZZ22001");
							        		        setNextUrl("/AE0060021.jsp");
							        		        conn.rollback();
							        		        return;
							                    }
							                }
							                if("1".equals(lotControlFlgBak)){
									        	if(acptQty != 0 && vendlotno_bak != null){
								                	// [ロットトレース登録・更新処理（excMakeLotTraceFd）]
								                    List lotTraceList = bc.excMakeLotTraceFd(temppartStruct.getreadITEM_CD(), 
								                    										 (String)bakList.get(l), 
								                    										 struct.getITEM_CD_LOT(), 
                   										                                     vendlotno_bak, 
								                    										 "1");
		
								                    if(bc.getResultStatus().intValue() == 1){
								                    	struct.setFROM_ITEM_CD(temppartStruct.getreadITEM_CD());
								                    	struct.setFROM_LOT_NO((String)bakList.get(l));
								                    	struct.setTO_ITEM_CD(struct.getITEM_CD_LOT());
								                    	struct.setTO_LOT_NO(vendlotno_bak);
										            	struct.setTO_PUCH_ODR_CD(struct.getPUCH_ODR_CD());
										            	//[受入実績]で発注番号を取得
										            	List formList = entity.mgetFROM_PUCH_ODR_CD.read(conn, struct);
										            	if((formList != null && formList.size() > 0)){
										            		//発注番号をソート順（降順）にし、１件目のレコードを取得する。
										            		AE0060020Struct orderStruct = (AE0060020Struct) formList.get(0);
										            		//[ロットトレース].“元発注番号” = [受入実績]."発注番号"
										            		struct.setFROM_PUCH_ODR_CD(orderStruct.getFROM_PUCH_ODR_CD());
										            	}else{
										            		struct.setFROM_PUCH_ODR_CD("");
										            	}
								                    	entity.mupdateT_LOT_TRACE.update(conn, struct);
								                    }else{
								                        if(lotTraceList != null && lotTraceList.size() > 0){
								             	 	        setErrorMessage((String)lotTraceList.get(0));
								             	 	        setNextUrl("/AE0060021.jsp");
								             	 	        conn.rollback();
									        		        return;
								                        }else{
								             	 	        setErrorMessage("ZZ22016");
								             	 	        setNextUrl("/AE0060021.jsp");
								             	 	        conn.rollback();
									        		        return;
								                        }
								                    }
									        	}    
								        	}else{
							                }
							                l = l + 1;
							            }
						            }else{
						            	struct.setsetLOT_NO(null);
							            entity.minsertT_RCV_ISSUE.create(conn, struct);
						            }
						            
									// 保管区別入出庫(T_RCV_ISSUE)の登録処理(黒)
									// 入出庫番号採番
									CollectNumber collectNum2 = new CollectNumber(CollectNumber.ISSUE_CD,this.sysUSER_CD,
																this.sp.getProcId(),this.sysPLANT_CD);
									no = collectNum2.getNo();
									if (no == null || no.length() == 0) 
									{
										//採番結果がない
										setErrorMessage("ZZ01106");
										setNextUrl("/AE0060021.jsp");
										return;
									}

									struct.setsetRCV_ISSUE_CTRL_CD(no);														// 01.入出庫管理番号
									struct.setsetRCV_ISSUE_TYP("2");														// 02.入出庫区分(2:固定)
									struct.setsetITEM_CD(temppartStruct.getreadITEM_CD());									// 03.品目番号
									struct.setsetPLANT_CD(temppartStruct.getreadPLANT_CD());								// 04.工場コード
									struct.setsetWH_CD(tempWhStruct.getreadWH_CD());										// 05.保管区コード

									// 品目手配区分による更新値変更
									if (("1".equals(temppartStruct.getreadMRP_ODR_TYP())) ||
									    ("2".equals(temppartStruct.getreadMRP_ODR_TYP()))) 
									{
										struct.setsetJOB_ODR_CD(temppartStruct.getreadJOB_ODR_CD());						// 06.製番
										struct.setsetJOB_ODR_DETAIL_NO(temppartStruct.getreadJOB_ODR_DETAIL_NO());			// 07.製番枝番
									} else {
										struct.setsetJOB_ODR_CD("");														// 06.製番
										struct.setsetJOB_ODR_DETAIL_NO("0");												// 07.製番枝番
									}
									struct.setsetPUCH_ODR_CD(struct.getPUCH_ODR_CD());										// 08.画面:発注番号
									struct.setsetACPT_NO(struct.getACPT_NO());												// 09.画面:受入回数
									struct.setsetACPT_RSLT_CRCT_NO(strAcpt);												// 10.受入実績訂正回数
									struct.setsetINSPEC_RSLT_CRCT_NO(strInspc);												// 11.検査実績訂正回数
									struct.setsetWORK_ODR_CD(null);															// 12.作業計画番号(null)
									struct.setWORK_IN_PROC_CD(null);														// 13.仕掛作業コード(null)
									struct.setsetPARTIAL_PRD_NO("0");														// 14.分作回数(0:固定)
									struct.setsetOPR_RSLT_CRCT_NO("0");														// 15.作業実績訂正回数(0:固定)
									struct.setsetISSUE_INST_CD(temppartStruct.getreadISSUE_INST_CD());						// 16.出庫指示番号
									struct.setsetRCV_ISSUE_BEFORE_QTY(String.valueOf(beforeQty + totalissueQty));							// 17.入出庫前在庫数
									struct.setsetRCV_ISSUE_QTY(String.valueOf(planSum.intValue() * -1));								// 18.入出庫数
									struct.setsetRCV_ISSUE_AFTER_QTY(String.valueOf(afterQty));			// 19.入出庫後在庫数
									struct.setsetRCV_ISSUE_AMOUNT("0");														// 20.入出庫金額(0:固定)
									struct.setsetRCV_ISSUE_DATE(struct.getACPT_DATE());										// 21.入出庫年月日
									struct.setsetRCV_ISSUE_GNR_TYP("71");													// 22.入出庫発生区分(71)
									struct.setsetRCV_ISSUE_ODD_QTY("0");													// 23.入出庫端数(0:固定)
									struct.setsetDEFECT_CAUSE_CD(null);														// 24.入出庫不良理由コード
									struct.setsetSTOCK_UPD_TYP("2");														// 25.在庫更新区分(2:固定)
									struct.setsetRCV_ISSUE_CMPLT_FLG("0");													// 26.入出庫完了フラグ
									struct.setsetOD_NO(temppartStruct.getreadOD_NO());										// 27.オーダデマンド番号
									struct.setsetVEND_LOT_NO(struct.getVEND_LOT_NO());										// 28.画面:メーカロット番号
									struct.setsetRCV_ISSUE_COMMENT(null);													// 29.入出庫備考(null)
									struct.setsetCOMPANY_CD(temppartStruct.getreadCOMPANY_CD());							// 30.会社コード
									struct.setsetVEND_CD(temppartStruct.getreadVEND_CD());									// 31.取引先コード
									if(temppartStruct.getreadCONS_TYP() == null || ("").equals(temppartStruct.getreadCONS_TYP()) == true)
									{
										struct.setsetCONS_TYP("2");
									} else {
										struct.setsetCONS_TYP(temppartStruct.getreadCONS_TYP());							// 32.支給区分
									}
									struct.setsetCONS_EXEC_DATE(null);														// 33.有償支給実績抽出日
						            if(_lotCtrlFlg && lotNoList != null && lotNoList.size() > 0){
						            	double afterQty2 = 0.0;
						            	double beforeQty2 = afterQty1;
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
							                        setNextUrl("/AE0060021.jsp");
						             	 	        conn.rollback();
							                        return;
						                        }
						                        beforeQty2 = afterQty2;
						                    }
						                    struct.setsetRCV_ISSUE_CTRL_CD(no);
								            struct.setsetLOT_NO((String)lotNoList.get(l));                                          // 28.在庫ロット番号
								            rcvissueQty = getDoubleValue((String)lotNoList.get(l+1)) * -1;
								            afterQty2 = beforeQty2 + rcvissueQty;
								            struct.setsetRCV_ISSUE_BEFORE_QTY(String.valueOf(beforeQty2));							// 17.入出庫前在庫数
									        struct.setsetRCV_ISSUE_QTY(String.valueOf(rcvissueQty));								// 18.入出庫数
									        struct.setsetRCV_ISSUE_AFTER_QTY(String.valueOf(afterQty2));			                // 19.入出庫後在庫数
							                entity.minsertT_RCV_ISSUE.create(conn, struct);
							                // [ロット別品目在庫登録・更新処理（excUpdateLotStockFd）]
							                BizCommon bc = new BizCommon(conn, 
							                		                     getsysUSER_CD(), 
							                		                     sp.getProcId(), 
							                		                     getsysPLANT_CD());
							                List updateLotStockList = bc.excUpdateLotStockFd(no,"");
							                if(bc.getResultStatus().intValue() == 1){
							                }else{
							                    if(updateLotStockList != null && updateLotStockList.size() > 0){
							        		        setErrorMessage((String)updateLotStockList.get(0));
							        		        setNextUrl("/AE0060021.jsp");
						             	 	        conn.rollback();
							        		        return;
							                    }else{
							        		        setErrorMessage("ZZ22001");
							        		        setNextUrl("/AE0060021.jsp");
						             	 	        conn.rollback();
							        		        return;
							                    }
							                }
							                if("1".equals(lotControlFlgBak)){
							                	// [ロットトレース登録・更新処理（excMakeLotTraceFd）]
							                    List lotTraceList = bc.excMakeLotTraceFd(temppartStruct.getreadITEM_CD(),
							                    		                                 (String)lotNoList.get(l),
							                    		                                 struct.getITEM_CD_LOT(), 
               		                                 									 vendlotno_bak, 
							                    		                                 "1");
							                    if(bc.getResultStatus().intValue() == 1){
							                    	struct.setFROM_ITEM_CD(temppartStruct.getreadITEM_CD());
							                    	struct.setFROM_LOT_NO((String)lotNoList.get(l));
							                    	struct.setTO_ITEM_CD(struct.getITEM_CD_LOT());
							                    	struct.setTO_LOT_NO(vendlotno_bak);
									            	struct.setTO_PUCH_ODR_CD(struct.getPUCH_ODR_CD());
									            	//[受入実績]で発注番号を取得
									            	List formList = entity.mgetFROM_PUCH_ODR_CD.read(conn, struct);
									            	if((formList != null && formList.size() > 0)){
									            		//発注番号をソート順（降順）にし、１件目のレコードを取得する。
									            		AE0060020Struct orderStruct = (AE0060020Struct) formList.get(0);
									            		//[ロットトレース].“元発注番号” = [受入実績]."発注番号"
									            		struct.setFROM_PUCH_ODR_CD(orderStruct.getFROM_PUCH_ODR_CD());
									            	}else{
									            		struct.setFROM_PUCH_ODR_CD("");
									            	}
							                    	entity.mupdateT_LOT_TRACE.update(conn, struct);
							                    }else{
							                        if(lotTraceList != null && lotTraceList.size() > 0){
							             	 	        setErrorMessage((String)lotTraceList.get(0));
							             	 	        setNextUrl("/AE0060021.jsp");
							             	 	        conn.rollback();
							             	 	        return;
							                        }else{
							             	 	        setErrorMessage("ZZ22016");
							             	 	        setNextUrl("/AE0060021.jsp");
							             	 	        conn.rollback();
							             	 	        return;
							                        }
							                    }
							                }else{
							                }
							                l = l + 1;
							            }
						            }else{
						            	struct.setsetLOT_NO(null);
							            entity.minsertT_RCV_ISSUE.create(conn, struct);
						            }
								 // 受入数が変更時実施
							} else {
								// みなし出庫判定
								uHantei = true;
								if (uHantei == true && lHantei2 == false)
								{
									// AE00070:支給品みなし出庫処理にてマニュアル処理が1件以上あり
									setWarningMessage("AE00070");
									// 判定フラグに"true"をセット
									lHantei2 = true;
								}
							}
						}  // END FOR
					} // 支給品使用IF END
					}
				}
			}

			// 注文取消がON（受入回数が1かつ、2回以上の受入がない場合のみチェック可）の場合
			// [支給品使用]を発注番号、受入回数で検索し、使用済数量の合計を取得する
			if ("true".equals(struct.getc_CANCEL())) {
				List partSuppliedIssueList = entity.mT_PART_SUPPLIED_ISSUE_COUNT.read(conn, struct);
				if (partSuppliedIssueList.isEmpty() == false) {
					AE0060020Struct partSuppliedIssueStruct = (AE0060020Struct)partSuppliedIssueList.get(0);
					if (partSuppliedIssueStruct.getSUM_OF_TOTAL_ISSUE_QTY() != null) {
						// [支給品使用]."使用済数量"の合計が0より大きい場合エラー
						if (Calculate.compare("0", partSuppliedIssueStruct.getSUM_OF_TOTAL_ISSUE_QTY()) == -1) {
							setErrorMessage("AE00122");
							setErrorParameter("T_PART_SUPPLIED_ISSUE", "PUCH_ODR_CD", struct.getPUCH_ODR_CD());
							setErrorParameter("T_PART_SUPPLIED_ISSUE", "ACPT_NO", struct.getACPT_NO());
							setNextUrl("/AE0060021.jsp");
							// ワーニングはクリアする
							msgStruct.clearWarn();
							return;
						}
					}
				}
			}

			// 全受入完了CHECKの場合
			if ("true".equals(struct.getc_COMPLETE()))
			{
				if ("true".equals(struct.getc_CANCEL())) {
					// AE00089:注文を取り消しました。登録・更新を行いたい場合は取消解除を行ってください。
					setWarningMessage("AE00089");
					struct.setc_COMPLETE("true");
				} else {
					// AE00079:受入が完了しました。登録・更新を行いたい場合は完了解除を行って下さい。
					setWarningMessage("AE00079");
					struct.setc_COMPLETE("true");
				}
			} else {
				struct.setc_COMPLETE(null);
			}
            //ロット管理update
            if(_lotCtrlFlg && vendlotno_bak != null 
            	&& !"".equals(vendlotno_bak) 
            	&& puch_odr_cd_bak != null 
            	&& !"".equals(puch_odr_cd_bak)){
                AE0060020Struct setStructForTlot = new AE0060020Struct();
                setStructForTlot.setLOT_NO(vendlotno_bak);
                setStructForTlot.setPUCH_ODR_CD(puch_odr_cd_bak);
                setStructForTlot.setsUser_ID(getsysUSER_CD());
                entity.mupdateT_LOT_CTRL.update(conn, setStructForTlot);
            }
            struct.seth_LINEUPDATE_FLG(vendlotno_bak);
			// 画面再表示
			controlSelect();
			conn.commit();
		} catch (SQLException e) {
			throw new ExpjException(e);
		} catch (Exception e) {
			throw new ExpjException(e);
		} finally {
			if (conn != null) {
				conn.rollback();
			}
		}

                //}}user_implement_dev:<controlUpdate>
		logger.exiting("AE0060020Control"+":USER="+struct.getsUser_ID(),"controlUpdate");

		return;
	}

	/**
	 * 戻るボタン押下時に実行される処理です。
	 *
	 */
	public void controlReturn() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0060");
		logger.entering("AE0060020Control"+":USER="+struct.getsUser_ID(),"controlReturn");
			//{{user_implement_dev:<controlReturn>
		controlSelect();
                //}}user_implement_dev:<controlReturn>
		logger.exiting("AE0060020Control"+":USER="+struct.getsUser_ID(),"controlReturn");

		return;
	}

	/**
	 * 登録ボタン押下時に実行される処理です。
	 *
	 */
	public void controlInsert2() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0060");
		logger.entering("AE0060020Control"+":USER="+struct.getsUser_ID(),"controlInsert2");
			//{{user_implement_dev:<controlInsert2>
		// TODO: ユーザ定義のコードを記述してください
		// サブフォーム2｢登録｣ボタン押下時処理
		// 使用予定数量の計算
		BigDecimal planSum     = new BigDecimal(0);			// 受入数(画面項目)
		String mrpOdrtyp = "";
		String unitQtytyp= "";
		boolean mHantei = false ;			// 在庫数マイナス確認フラグ
		boolean lHantei = false ;			// 在庫数マイナス確認フラグ
		double beforeQty = 0;				// 更新前手持在庫数(初期化)
		double afterQty = 0;				// 更新後手持在庫数(初期化)
		double rcvissueQty = 0;				// 保管区別入出庫入出庫数(初期化)
		String strAcpt = "";				// 受入訂正回数退避
		String strInspc = "";				// 検査訂正回数退避
		String stockQty = "";
		boolean isLotMag = true;
	    boolean lotManFlg1 = true;
	    
		struct.setUNIT_QTY_TYP(struct.getUNIT_QTY_TYP());

		try {
			
			// 生産側の過去の実績入力の制限チェック
			if(getSysParameter() == false){
				if(chkProcExecDate("1","",struct.getSUPPLIED_DATE()) == false){
					setErrorMessage(ProcExecDateError);
					setErrorParameter("SYS_ACTUAL_COST_CTRL_AC", "PLANT_CD", struct.getPLANT_CD());
					setErrorParameter("SYS_ACTUAL_COST_CTRL_AC", "PROC_EXEC_DATE", struct.getPROC_EXEC_DATE().toString());
					return;
				}
			}
			
			// 発注残の検索(条件：画面発注番号)
			List tempVendList = entity.mSelectHeaderVend.read(conn, struct);
			if (tempVendList.isEmpty()) 
			{
			} else {
				AE0060020Struct headvendStruct = (AE0060020Struct)tempVendList.get(0);
				// 取引先保管区チェック
				struct.setsetVEND_CD(struct.getVEND_CD());
				struct.setsetPLANT_CD(headvendStruct.getreadPLANT_CD());
				List m_whList = entity.mreadM_WH.read(conn, struct);
				// 支給先と一致する取引先保管が存在しない場合
				if (m_whList.isEmpty()) 
				{
					// AE00068:支給先と一致する取引先保管区が存在しません。保管区コードの登録が必要です。
					setErrorMessage("AE00068");
					setErrorParameter("T_RLSD_PUCH_ODR", "VEND_CD", struct.getVEND_CD());
					setErrorParameter("T_RLSD_PUCH_ODR", "PLANT_CD", headvendStruct.getreadPLANT_CD());
					setNextUrl("/AE0060022.jsp");
					// 処理を抜ける。
					return;
				}
				if (_lotCtrlFlg){
					//親品目番号在庫ロット番号				
					struct.setw_ACPT_NO(struct.getACPT_NO());
					struct.setPUCH_ODR_CD(struct.getPUCH_ODR_CD());
					List lotNOList = entity.mSelectLOT_NO.read(conn, struct);
					AE0060020Struct lotNoParentStruct = (AE0060020Struct) lotNOList.get(0);
				    if(lotNoParentStruct.getLOT_NO_PARENT() != null){
						struct.setLOT_NO_PARENT(lotNoParentStruct.getLOT_NO_PARENT());
					}
				}
				// 支給品目番号チェック
				struct.setsetITEM_CD(struct.getITEM_CD());
				List itemList = entity.mcheckM_ITEM.read(conn, struct);
				// 入力された品目番号が品目マスタに未存在場合
				if (itemList.isEmpty()) 
				{
					// AE00072:支給品目番号が品目マスタに存在しません。
					setErrorMessage("AE00072");
					setErrorParameter("M_ITEM", "ITEM_CD", struct.getITEM_CD());
					setNextUrl("/AE0060022.jsp");
					// 処理を抜ける。
					return;
				} else {
					AE0060020Struct itemStruct = (AE0060020Struct) itemList.get(0);

					// 入力の品目番号と発注品目番号が同じ場合エラー
					struct.setsetPUCH_ODR_CD(struct.getPUCH_ODR_CD());
					struct.setsetITEM_CD(struct.getITEM_CD());
					List puchOdrList = entity.mcheckT_RLSD_PUCH_ODR.read(conn, struct);
					if (!puchOdrList.isEmpty()) 
					{
						// AE00081:支給品目番号に発注品目番号は入力できません。
						setErrorMessage("AE00081");
						setErrorParameter("M_ITEM", "ITEM_CD", struct.getITEM_CD());
						setNextUrl("/AE0060022.jsp");
						// 処理を抜ける。
						return;
					}

					// 品目手配区分チェック
					if ((!"1".equals(headvendStruct.getreadMRP_ODR_TYP())) && (!"2".equals(headvendStruct.getreadMRP_ODR_TYP()))) 
					{
						if (("1".equals(itemStruct.getreadMRP_ODR_TYP())) || ("2".equals(itemStruct.getreadMRP_ODR_TYP())))
						{
							// AE00073:親品目がMRP管理品目のため、製番管理品目は支給できません。
							setErrorMessage("AE00073");
							setErrorParameter("M_ITEM", "ITEM_CD", struct.getITEM_CD());
							setErrorParameter("M_ITEM", "MRP_ODR_TYP", itemStruct.getreadMRP_ODR_TYP());
							setNextUrl("/AE0060022.jsp");
							// 処理を抜ける。
							return;
						}
					}

					// 品目手配区分が8:擬似品目の場合
					if ("8".equals(itemStruct.getreadMRP_ODR_TYP()))
					{
						// AE00074:支給品目番号に擬似品目は入力できません。
						setErrorMessage("AE00074");
						setErrorParameter("M_ITEM", "ITEM_CD", struct.getITEM_CD());
						setNextUrl("/AE0060022.jsp");
						// 処理を抜ける。
						return;
					}

					// 品目手配区分退避
					mrpOdrtyp = itemStruct.getreadMRP_ODR_TYP();
					// 在庫数単位区分
					unitQtytyp = itemStruct.getreadUNIT_QTY_TYP();
				}

				// 在庫数単位区分の判定:整数管理品の場合切り上げ
				if ("1".equals(unitQtytyp))
				{
					stockQty = Calculate.ceil(struct.getTOTAL_ISSUE_QTY(), 0);
					if (Calculate.compare(stockQty, struct.getTOTAL_ISSUE_QTY()) != 0) {
						// AE00077:整数管理品のため、使用済数量の小数点以下は切り上げました。
						setWarningMessage("AE00077");
					}
					planSum = new BigDecimal(stockQty);
				} else {
					stockQty = struct.getTOTAL_ISSUE_QTY();
					planSum = new BigDecimal(stockQty);
					//小数の表示スケール処理
					BigDecimal intVal = new BigDecimal("" + planSum.intValue());
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
					planSum = planSum.setScale(roundCount,BigDecimal.ROUND_UP);
				}

				// 支給品使用チェック
				struct.setsetPUCH_ODR_CD(struct.getPUCH_ODR_CD());
				struct.setsetACPT_NO(struct.getACPT_NO());
				struct.setsetITEM_CD(struct.getITEM_CD());
				List cPartList = entity.mcheckT_PART_SUPPLIED_ISSUE.read(conn, struct);
				if (!cPartList.isEmpty()) 
				{
					// AE00075:支給品目番号は既に、支給品として使用されています。
					setErrorMessage("AE00075");
					setErrorParameter("PART_SUPPLIED_ISSUE", "PUCH_ODR_CD", struct.getPUCH_ODR_CD());
					setErrorParameter("PART_SUPPLIED_ISSUE", "ACPT_NO", struct.getACPT_NO());
					setErrorParameter("PART_SUPPLIED_ISSUE", "ITEM_CD", struct.getITEM_CD());
					setNextUrl("/AE0060022.jsp");
					// 処理を抜ける。
					return;
				}
				if (_lotCtrlFlg) {
					List itemCdList = entity.mgetParentITEM_CD.read(conn, struct);
					if(itemCdList != null && itemCdList.size() > 0){
						String parentITEM_CD = ((AE0060020Struct)itemCdList.get(0)).getreadITEM_CD();
						if(parentITEM_CD != null && !"".equals(parentITEM_CD.trim())){
							String subITEM_CD = struct.getITEM_CD();
							// 製品構成リポジトリ作成
	                        ProductStructureRepository repository = new ProductStructureRepository(conn);
					        if(checkReverseRooping(repository, subITEM_CD, parentITEM_CD)){
	                            setErrorMessage("AE20607");
	                            setNextUrl("/AE0060022.jsp");
	                            return;
	                        }
						}
					}else{
						System.out.println("!!!!!!!!!! T_RLSD_PUCH_ODR.PUCH_ODR_CD = " + struct.getPUCH_ODR_CD() + " record not exist.");
						return;
					}

					struct.setsetITEM_CD(struct.getITEM_CD());
					struct.setsetPUCH_ODR_CD(struct.getPUCH_ODR_CD());
					struct.setsetTOTAL_ISSUE_QTY(struct.getTOTAL_ISSUE_QTY());
					struct.setsetACPT_NO(struct.getACPT_NO());
					
					// システムパラメータの品質期限チェックフラグの値を設定
					List sysParaList = entity.mSYS_PARAMETER.read(conn,struct);
					if(sysParaList.size() > 0){
						AE0060020Struct sysParaStruct = (AE0060020Struct)sysParaList.get(0);
						struct.setBEST_BEFORE_DATE_CHECK_FLG(sysParaStruct.getBEST_BEFORE_DATE_CHECK_FLG());
					}else{
						struct.setBEST_BEFORE_DATE_CHECK_FLG("1");
					}
					
					 // 品質期限チェックのための検索
	   				List bbdList = entity.mc_BESTBEFORE_DATE.read(conn, struct);
					if(entity.mcheckLOT_CTRL_FLG1.check(conn, struct)){
						// [品目].”ロット管理フラグ” = 1(ロットトレース管理を行う。)の時
						if(struct.getLOT_NO() == null || "".equals(struct.getLOT_NO().trim())){
							setErrorMessage("AE20600");
						}else{
					        //[ロット管理]に存在しない場合
					        if(!entity.mcheckLOT_NO1.check(conn, struct)){
						        setErrorMessage("AE20615");
	            		        setErrorParameter("T_LOT", "LOT_NO", struct.getLOT_NO());
					        }else{
					        	/*[画面].”在庫ロット番号” と[発注残].”取引先コード” ＝ [保管区]. “取引先コード”、
					              [発注残].”工場コード” ＝ [保管区]. “工場コード”となる[保管区]. ”保管区コード”と 
					             「画面」.”支給品目番号”を基に[ロット品目在庫]を検索し、[ロット品目在庫]に存在しない場合*/
					            if(!entity.mcheckWH_CD.check(conn, struct)){
					    	        setErrorMessage("AE20611");
					            }
					        	// 品質期限チェックフラグが1:エラーの場合かつ品質期限が切れている場合
					        	if(bbdList.size() > 0){
					        		AE0060020Struct bbdStruct = (AE0060020Struct)bbdList.get(0);
	   								if(bbdStruct.getBBD_c_FLG().equals("1") && struct.getBEST_BEFORE_DATE_CHECK_FLG().equals("1")){
	   									//品質期限が切れています。
	   									setErrorMessage("AD00114");
	   									setErrorParameter("T_LOT_CTRL","LOT_NO", struct.getLOT_NO());
	   								}
	   							}
					        }
					        if (msgStruct.hasError()) {
				            }else{
				            	// 品質期限チェックフラグが2:警告の場合かつ品質期限が切れている場合
				            	if(bbdList.size() > 0){
				            		AE0060020Struct bbdStruct = (AE0060020Struct)bbdList.get(0);
	   								if(bbdStruct.getBBD_c_FLG().equals("1") && struct.getBEST_BEFORE_DATE_CHECK_FLG().equals("2")){
	   									//品質期限切れのロットを使用しました。
	   									setWarningMessage("AD00115");
	   									setWarningParameter("T_LOT_CTRL","LOT_NO", struct.getLOT_NO());
	   								}
	   							}
					            isLotMag = true;
				            }
						}
					}else{
						//[品目].”ロット管理フラグ” ≠ 1の場合
						if(struct.getLOT_NO() != null && !"".equals(struct.getLOT_NO().trim())){
							setErrorMessage("AE20601");
						}else{
							isLotMag = false;
						}
					}
				    // エラーがあったら処理を中断
				    if (msgStruct.hasError()) {
				    	setNextUrl("/AE0060022.jsp");
					    return;
				    }
				    if(!entity.mcheckLOT_CTRL_FLG.check(conn, struct)){
					    //[品目].”ロット管理フラグ” ≠ 1の場合
					    lotManFlg1 = false;
					}
				}
				// ①支給品使用登録処理
				struct.setsetPUCH_ODR_CD(struct.getPUCH_ODR_CD());							// 発注番号(画面値)
				struct.setsetACPT_NO(struct.getACPT_NO());									// 受入回数
				struct.setsetITEM_CD(struct.getITEM_CD());									// 支給品品目番号
				struct.setsetACPT_QTY(struct.getACPT_QTY());								// 受入数(画面値)
				struct.setsetCOMPANY_CD(headvendStruct.getreadCOMPANY_CD());				// 会社コード
				struct.setsetVEND_CD(headvendStruct.getreadVEND_CD());						// 取引先コード
				struct.setsetJOB_ODR_CD(headvendStruct.getreadJOB_ODR_CD());				// 製番
				struct.setsetJOB_ODR_DETAIL_NO(headvendStruct.getreadJOB_ODR_DETAIL_NO());	// 製番枝番
				struct.setsetPLANT_CD(headvendStruct.getreadPLANT_CD());					// 工場コード
				struct.setsetISSUE_INST_CD(null);											// 出庫指示番号
				struct.setsetMRP_ODR_TYP(mrpOdrtyp);										// 品目手配区分
				struct.setsetSUPPLIED_ISSUE_GNR_TYP("3");									// 処理区分(3:固定)
				struct.setsetSUPPLIED_ISSUE_QTY("0.00");									// 使用予定数量
				struct.setsetTOTAL_ISSUE_QTY(String.valueOf(planSum));						// 使用済数量
				struct.setsetSUPPLIED_UNIT_DENOMINATOR("0.00");								// 支給品使用単位数分母
				struct.setsetSUPPLIED_UNIT_NUMERATOR("0.00");								// 支給品使用単位数分子
				struct.setsetSUPPLIED_DATE(struct.getSUPPLIED_DATE());						// 使用日(画面値)
				struct.setsetPART_SUPPLIED_COMMENT(struct.getPART_SUPPLIED_COMMENT());		// 支給品使用備考
				entity.mT_PART_SUPPLIED_ISSUE.create(conn, struct);

				// ②保管区別品目在庫(T_ITEM_STOCK)、保管区別製番在庫(T_JOB_ODR_CD_STOCK)の登録・更新処理
				struct.setsetVEND_CD(struct.getVEND_CD());
				struct.setsetPLANT_CD(headvendStruct.getreadPLANT_CD());
				List mWhList = entity.mreadM_WH.read(conn, struct);
				AE0060020Struct tempWhStruct = (AE0060020Struct) mWhList.get(0);

				if (("4".equals(mrpOdrtyp)) || ("5".equals(mrpOdrtyp)) ||
				   ("6".equals(mrpOdrtyp)) || ("7".equals(mrpOdrtyp)))
				{
					// MRP管理品(保管区別品目在庫対象)
					// 保管区別品目在庫チェック
					struct.setsetITEM_CD(struct.getITEM_CD());
					struct.setsetWH_CD(tempWhStruct.getreadWH_CD());
					try{
						List lockStList = entity.mlockT_ITEM_STOCK.read(conn, struct);
					}catch (ResourceBusyException rbe) {
						setErrorMessage("ZZ01105");
						setNextUrl("/AE0060022.jsp");
						conn.rollback();
						return;
					}
					List itemStList = entity.mreadT_ITEM_STOCK.read(conn, struct);

					// 更新チェック
					if (itemStList.isEmpty()) 
					{
						// 保管区別品目在庫登録
						struct.setsetITEM_CD(struct.getITEM_CD());										// 01.品目番号
						struct.setsetWH_CD(tempWhStruct.getreadWH_CD());								// 02.保管区コード
						struct.setsetPLANT_CD(headvendStruct.getreadPLANT_CD());						// 03.工場コード
						struct.setsetSTOCK_ON_HAND_QTY(String.valueOf(planSum.doubleValue() * -1));		// 04.品目別手持在庫数
						entity.minsertT_ITEM_STOCK.create(conn, struct);

						// 更新前手持在庫数セット
						beforeQty = 0;								// 更新前
						afterQty = planSum.doubleValue() * -1;		// 更新後
						rcvissueQty = planSum.doubleValue() * -1;	// 入出庫数

						// 判定フラグに"true"(マイナスデータ)セット
						if (afterQty < 0)
						{
							mHantei = true;
						}
					} else {
						AE0060020Struct tempItemStStruct = (AE0060020Struct) itemStList.get(0);
						// 保管区別品目在庫更新
						struct.setsetSTOCK_ON_HAND_QTY(String.valueOf(Double.parseDouble(tempItemStStruct.getreadSTOCK_ON_HAND_QTY()) 
										- planSum.doubleValue()));										// 01.品目別手持在庫数
						struct.setsetITEM_CD(struct.getITEM_CD());										// 条件.品目番号
						struct.setsetWH_CD(tempWhStruct.getreadWH_CD());								// 条件.保管区コード
						entity.mupdateT_ITEM_STOCK.update(conn, struct);

						// 更新前手持在庫数セット
						beforeQty = Double.parseDouble(tempItemStStruct.getreadSTOCK_ON_HAND_QTY());	// 更新前
						afterQty = Double.parseDouble(tempItemStStruct.getreadSTOCK_ON_HAND_QTY()) 
														- planSum.doubleValue();						// 更新後
						rcvissueQty = planSum.doubleValue() * -1;										// 入出庫数
						// 判定フラグに"true"(マイナスデータ)セット
						if (afterQty < 0)
						{
							mHantei = true;
						}
					}
				} else if (("1".equals(mrpOdrtyp)) || ("2".equals(mrpOdrtyp))) {
					// 製番管理品(保管区別製番在庫対象)
					// 保管区別製番在庫チェック
					struct.setsetJOB_ODR_CD(headvendStruct.getreadJOB_ODR_CD());						// 製番
					struct.setsetJOB_ODR_DETAIL_NO(headvendStruct.getreadJOB_ODR_DETAIL_NO());			// 製番枝番
					struct.setsetITEM_CD(struct.getITEM_CD());											// 品目番号
					struct.setsetWH_CD(tempWhStruct.getreadWH_CD());									// 保管区コード
					List itemJobList = entity.mreadT_JOB_ODR_CD_STOCK.read(conn, struct);

					// 更新チェック
					if (itemJobList.isEmpty()) 
					{
						// 保管区別製番在庫登録
						struct.setsetJOB_ODR_CD(headvendStruct.getreadJOB_ODR_CD());					// 01.製番
						struct.setsetJOB_ODR_DETAIL_NO(headvendStruct.getreadJOB_ODR_DETAIL_NO());		// 02.製番枝番
						struct.setsetITEM_CD(struct.getITEM_CD());										// 03.品目番号
						struct.setsetWH_CD(tempWhStruct.getreadWH_CD());								// 04.保管区コード
						struct.setsetPLANT_CD(headvendStruct.getreadPLANT_CD());						// 05.工場コード
						struct.setsetSTOCK_ON_HAND_QTY(String.valueOf(planSum.doubleValue() * -1));		// 06.製番別手持在庫数
						entity.minsertT_JOB_ODR_CD_STOCK.create(conn, struct);

						// 更新前手持在庫数セット
						beforeQty = 0;								// 更新前
						afterQty = planSum.doubleValue() * -1;		// 更新後
						rcvissueQty = planSum.doubleValue() * -1;	// 入出庫数
						// 判定フラグに"true"(マイナスデータ)セット
						if (afterQty < 0)
						{
							mHantei = true;
						}
					} else {
						AE0060020Struct tempJobStruct = (AE0060020Struct) itemJobList.get(0);
						// 保管区別製番在庫更新
						struct.setsetSTOCK_ON_HAND_QTY(String.valueOf(Double.parseDouble(tempJobStruct.getreadSTOCK_ON_HAND_QTY()) 
														- planSum.doubleValue()));						// 01.製番別手持在庫数
						struct.setsetJOB_ODR_CD(headvendStruct.getreadJOB_ODR_CD());					// 条件.製番
						struct.setsetJOB_ODR_DETAIL_NO(headvendStruct.getreadJOB_ODR_DETAIL_NO());		// 条件.製番枝番
						struct.setsetITEM_CD(struct.getITEM_CD());										// 条件.品目番号
						struct.setsetWH_CD(tempWhStruct.getreadWH_CD());								// 条件.保管区コード
						entity.mupdateT_JOB_ODR_CD_STOCK.update(conn, struct);

						// 更新前手持在庫数セット
						beforeQty = Double.parseDouble(tempJobStruct.getreadSTOCK_ON_HAND_QTY());		// 更新前
						afterQty = Double.parseDouble(tempJobStruct.getreadSTOCK_ON_HAND_QTY()) 
														- planSum.doubleValue();						// 更新後
						rcvissueQty = planSum.doubleValue() * -1;										// 入出庫数
						// 判定フラグに"true"(マイナスデータ)セット
						if (afterQty < 0)
						{
							mHantei = true;
						}
					}
				} // END IF保管区別品目在庫、保管区別製番在庫の登録・更新処理

				// [受入実績]の受入訂正回数取得
				List acptCrList = entity.mreadT_ACPT_RSLT.read(conn, struct);
				if (acptCrList.isEmpty())
				{
					strAcpt = "0";
				} else {
					AE0060020Struct tempAcptStruct = (AE0060020Struct) acptCrList.get(0);
					strAcpt = tempAcptStruct.getreadACPT_CRCT_NO();
				}

				// [検査実績]の検査訂正回数取得
				List inspcRsList = entity.mreadT_INSPC_RSLT.read(conn, struct);
				if (inspcRsList.isEmpty())
				{
					strInspc = "0";
				} else {
					AE0060020Struct tempInspcStruct = (AE0060020Struct) inspcRsList.get(0);
					strInspc = tempInspcStruct.getreadINSPC_CRCT_NO();
				}

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
				struct.setsetITEM_CD(struct.getITEM_CD());												// 03.品目番号
				struct.setsetPLANT_CD(headvendStruct.getreadPLANT_CD());								// 04.工場コード
				struct.setsetWH_CD(tempWhStruct.getreadWH_CD());										// 05.保管区コード
				// 品目手配区分による更新値変更
				if (("1".equals(mrpOdrtyp)) ||
				    ("2".equals(mrpOdrtyp))) 
				{
					struct.setsetJOB_ODR_CD(headvendStruct.getreadJOB_ODR_CD());						// 06.製番
					struct.setsetJOB_ODR_DETAIL_NO(headvendStruct.getreadJOB_ODR_DETAIL_NO());			// 07.製番枝番
				} else {
					struct.setsetJOB_ODR_CD("");														// 06.製番
					struct.setsetJOB_ODR_DETAIL_NO("0");												// 07.製番枝番
				}
				struct.setsetPUCH_ODR_CD(struct.getPUCH_ODR_CD());										// 08.画面:発注番号
				struct.setsetACPT_NO(struct.getACPT_NO());												// 09.画面:受入回数
				struct.setsetACPT_RSLT_CRCT_NO(strAcpt);												// 10.受入実績訂正回数
				struct.setsetINSPEC_RSLT_CRCT_NO(strInspc);												// 11.検査実績訂正回数
				struct.setsetWORK_ODR_CD(null);															// 12.作業計画番号(null)
				struct.setWORK_IN_PROC_CD(null);														// 13.仕掛作業コード(null)
				struct.setsetPARTIAL_PRD_NO("0");														// 14.分作回数(0:固定)
				struct.setsetOPR_RSLT_CRCT_NO("0");														// 15.作業実績訂正回数(0:固定)
				struct.setsetISSUE_INST_CD(null);														// 16.出庫指示番号
				struct.setsetRCV_ISSUE_BEFORE_QTY(String.valueOf(beforeQty));							// 17.入出庫前在庫数
				struct.setsetRCV_ISSUE_QTY(String.valueOf(rcvissueQty));								// 18.入出庫数
				struct.setsetRCV_ISSUE_AFTER_QTY(String.valueOf(afterQty));								// 19.入出庫後在庫数
				struct.setsetRCV_ISSUE_AMOUNT("0");														// 20.入出庫金額(0:固定)
				struct.setsetRCV_ISSUE_DATE(struct.getSUPPLIED_DATE());									// 21.入出庫年月日
				struct.setsetRCV_ISSUE_GNR_TYP("71");													// 22.入出庫発生区分(79)
				struct.setsetRCV_ISSUE_ODD_QTY("0");													// 23.入出庫端数(0:固定)
				struct.setsetDEFECT_CAUSE_CD(null);														// 24.入出庫不良理由コード
				struct.setsetSTOCK_UPD_TYP("2");														// 25.在庫更新区分(2:固定)
				struct.setsetRCV_ISSUE_CMPLT_FLG("0");													// 26.入出庫完了フラグ
				struct.setsetOD_NO(null);																// 27.オーダデマンド番号
				if (_lotCtrlFlg) {
					struct.setsetLOT_NO(struct.getLOT_NO());                                            // 28:画面:在庫ロット番号
				}
				struct.setsetVEND_LOT_NO(null);															// 29.画面:メーカロット番号
				struct.setsetRCV_ISSUE_COMMENT(null);													// 30.入出庫備考(null)
				struct.setsetCOMPANY_CD(headvendStruct.getreadCOMPANY_CD());							// 31.会社コード
				struct.setsetVEND_CD(headvendStruct.getreadVEND_CD());									// 32.取引先コード
				// 支給単価の検索結果で支給区分を設定
				AE0060020Struct readStruct = new AE0060020Struct();
				readStruct.setCOMPANY_CD(headvendStruct.getreadCOMPANY_CD());
				readStruct.setVEND_CD(headvendStruct.getreadVEND_CD());
				readStruct.setITEM_CD(struct.getITEM_CD());
                readStruct.setSUPPLIED_DATE(struct.getSUPPLIED_DATE());
              
				List consList = entity.mM_CONS_UNIT_COST.read(conn, readStruct);
				if (consList.isEmpty()) {
					struct.setsetCONS_TYP("2");															 // 33.支給区分
				} else {
					AE0060020Struct consStruct = (AE0060020Struct)consList.get(0);
					if ("0".equals(consStruct.getONEROUS_FLG())) {
						struct.setsetCONS_TYP("2");														 // 33.支給区分
					} else if ("1".equals(consStruct.getONEROUS_FLG())) {
						struct.setsetCONS_TYP("1");														 // 33.支給区分
					}
				}
				//struct.setsetCONS_TYP("2");																// 33.支給区分
				struct.setsetCONS_EXEC_DATE(null);														// 34.有償支給実績抽出日
				entity.minsertT_RCV_ISSUE.create(conn, struct);

				if(_lotCtrlFlg && isLotMag){
					// [ロット別品目在庫登録・更新処理（excUpdateLotStockFd）]
				    BizCommon bc = new BizCommon(conn, getsysUSER_CD(), sp.getProcId(), getsysPLANT_CD());
					List updateLotStockList = bc.excUpdateLotStockFd(no, "");
				    if(bc.getResultStatus().intValue() == 1){
				    }else{
				        if(updateLotStockList != null && updateLotStockList.size() > 0){
					        setErrorMessage((String)updateLotStockList.get(0));
					        return;
				        }
				    }
                    // [ロットトレース登録・更新処理（excMakeLotTraceFd）]
                    if(lotManFlg1){
                    	if(struct.getLOT_NO_PARENT() != null && !struct.getLOT_NO_PARENT().equals("")){
                    		List dataList = entity.mSelectLOT_NO_From_ACPT.read(conn, struct);
                            if(dataList != null && dataList.size() > 0){
                                AE0060020Struct lotNoStruct = (AE0060020Struct)dataList.get(0);
    					        List lotTraceList = bc.excMakeLotTraceFd(struct.getITEM_CD(), 
		                                 								 struct.getLOT_NO(), 
    					        										 lotNoStruct.getreadITEM_CD(), 
		                                 							     lotNoStruct.getreadLOT_NO(), 
    					        		                                 "1");
    					        if(bc.getResultStatus().intValue() == 1){
    					        	struct.setFROM_ITEM_CD(struct.getITEM_CD());
    					        	struct.setFROM_LOT_NO(struct.getLOT_NO());
    					        	struct.setTO_ITEM_CD(lotNoStruct.getreadITEM_CD());
    					        	struct.setTO_LOT_NO(lotNoStruct.getreadLOT_NO());
					            	struct.setTO_PUCH_ODR_CD(struct.getPUCH_ODR_CD());
					            	//[受入実績]で発注番号を取得
					            	List formList = entity.mgetFROM_PUCH_ODR_CD.read(conn, struct);
					            	if((formList != null && formList.size() > 0)){
					            		//発注番号をソート順（降順）にし、１件目のレコードを取得する。
					            		AE0060020Struct orderStruct = (AE0060020Struct) formList.get(0);
					            		//[ロットトレース].“元発注番号” = [受入実績]."発注番号"
					            		struct.setFROM_PUCH_ODR_CD(orderStruct.getFROM_PUCH_ODR_CD());
					            	}else{
					            		struct.setFROM_PUCH_ODR_CD("");
					            	}
    					        	entity.mupdateT_LOT_TRACE.update(conn, struct);
    					        }else{
    					            if(lotTraceList != null && lotTraceList.size() > 0){
    						            setErrorMessage((String)lotTraceList.get(0));
    						            return;
    					            }
    					        }
    					    }
    					
                    	}
                    }
				}
				
				// マイナス判定のインフォメーション表示
				if (mHantei == true && lHantei == false)
				{
					// AE00069:支給品みなし出庫で取引先保管区の品目または
					// 製番手持在庫数が一部マイナスとなりました。
					// setErrorMessage("AE00078");
					setWarningMessage("AE00078");
					// 判定フラグに"true"をセット
					lHantei = true;
				}
				//	ロット管理品目の場合、[ロット別使用実績]の追加を行う。
				if(_lotCtrlFlg && isLotMag){
					AE0060020Struct whcdStruct = new AE0060020Struct();
                    whcdStruct.setVEND_CD(headvendStruct.getreadVEND_CD());
                    whcdStruct.setPLANT_CD(headvendStruct.getreadPLANT_CD());
                    String wh_cdStr = getWh_cd(whcdStruct);
                    
                    AE0060020Struct useRlstStruct = new AE0060020Struct();
				    useRlstStruct.setsetSEQ_NO(getNextval());
				    useRlstStruct.setsetISSUE_INST_CD(null);
				    useRlstStruct.setsetLOT_NO(struct.getLOT_NO());
				    useRlstStruct.setsetPUCH_ODR_CD(struct.getPUCH_ODR_CD());
				    useRlstStruct.setsetACPT_NO(struct.getACPT_NO());
				    useRlstStruct.setsetITEM_CD(struct.getITEM_CD());
				    useRlstStruct.setsetWH_CD(wh_cdStr);
				    useRlstStruct.setsetTOTAL_ISSUE_QTY(struct.getTOTAL_ISSUE_QTY());
				    useRlstStruct.setsetSUPPLIED_ISSUE_QTY(struct.getSUPPLIED_ISSUE_QTY());
				    useRlstStruct.setsetPART_SUPPLIED_COMMENT(struct.getPART_SUPPLIED_COMMENT());
				    useRlstStruct.setsetSUPPLIED_DATE(struct.getSUPPLIED_DATE());
				    useRlstStruct.setsUser_ID(getsysUSER_CD());
				    entity.minsertT_LOT_USE_RSLT.create(conn, useRlstStruct);
				}
			}
			// 画面再表示
			 controlSelect();
			 conn.commit();
		} catch (SQLException e) {
			throw new ExpjException(e);
		} catch (ResourceBusyException rbe) {
			rbe.printStackTrace();
			setErrorMessage("ZZ01105");
			setReadStatus(ERROR);
		} catch (Exception e) {
			throw new ExpjException(e);
		} finally {
			if (conn != null) {
				conn.rollback();
			}
		}
                //}}user_implement_dev:<controlInsert2>
		logger.exiting("AE0060020Control"+":USER="+struct.getsUser_ID(),"controlInsert2");

		return;
	}

	/**
	 * 更新ボタン押下時に実行される処理です。
	 *
	 */
	public void controlUpdate2() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0060");
		logger.entering("AE0060020Control"+":USER="+struct.getsUser_ID(),"controlUpdate2");
			//{{user_implement_dev:<controlUpdate2>
			// TODO: ユーザ定義のコードを記述してください
			String param1 = "";
			BigDecimal planSum     = new BigDecimal(0);		// 在庫数計算
			double beforeQty = 0;				// 更新前手持在庫数(初期化)
			double afterQty = 0;				// 更新後手持在庫数(初期化)
			double rcvissueQty = 0;				// 保管区別入出庫入出庫数(初期化)
			double totalissueQty= 0;			// 使用済み数量待避
			String strAcpt = "";				// 受入訂正回数退避
			String beforeAcpt = "";				// 受入訂正回数退避
			String strInspc = "";				// 検査訂正回数退避
			String beforeInspc = "";			// 検査訂正回数退避
			String stockQty = "";				// 整数、小数管理

		try {
			
			// 生産側の過去の実績入力の制限チェック
			if(getSysParameter() == false){
				if(chkProcExecDate("2",struct.geth_SUPPLIED_DATE(),struct.getSUPPLIED_DATE()) == false){
					setErrorMessage(ProcExecDateError);
					setErrorParameter("SYS_ACTUAL_COST_CTRL_AC", "PLANT_CD", struct.getPLANT_CD());
					setErrorParameter("SYS_ACTUAL_COST_CTRL_AC", "PROC_EXEC_DATE", struct.getPROC_EXEC_DATE().toString());
					return;
				}
			}
			
			// 支給品の検索SelectHeader2
			struct.setsetPUCH_ODR_CD(struct.getPUCH_ODR_CD());
			struct.setsetACPT_NO(struct.getACPT_NO());
			struct.setsetITEM_CD(struct.getITEM_CD());
			List tempSelList = entity.mSelectHeader2.read(conn, struct);
			if (tempSelList.isEmpty()) 
			{
			} else {
				AE0060020Struct headStruct2 = (AE0060020Struct)tempSelList.get(0);
				// 取引先保管区チェック
				String oldValue = "0";
			    String newValue = "0";
				struct.setsetVEND_CD(struct.getVEND_CD());
				struct.setsetPLANT_CD(headStruct2.getreadPLANT_CD());
				List m_whList = entity.mreadM_WH.read(conn, struct);
				// 支給先と一致する取引先保管が存在しない場合
				if (m_whList.isEmpty()) 
				{
					// AE00068:支給先と一致する取引先保管区が存在しません。保管区コードの登録が必要です。
					setErrorMessage("AE00068");
					setErrorParameter("T_RLSD_PUCH_ODR", "VEND_CD", struct.getVEND_CD());
					setErrorParameter("T_RLSD_PUCH_ODR", "PLANT_CD", headStruct2.getreadPLANT_CD());
					// 処理を抜ける。
					return;
				}else{
					struct.setsetWH_CD(((AE0060020Struct)m_whList.get(0)).getreadWH_CD());
				}
				// 在庫数単位区分の判定
				if ("1".equals(headStruct2.getreadUNIT_QTY_TYP()))
				{
					// 1:整数管理
					stockQty = Calculate.ceil(struct.getTOTAL_ISSUE_QTY(), 0);
					if (Calculate.compare(stockQty, struct.getTOTAL_ISSUE_QTY()) != 0) {
						// AE00077:整数管理品のため、使用済数量の小数点以下は切り上げました。
						setWarningMessage("AE00077");
					}
					planSum = new BigDecimal(stockQty);
				} else {
					// 2:小数管理
					stockQty = struct.getTOTAL_ISSUE_QTY();
					planSum = new BigDecimal(stockQty);
					//小数の表示スケール処理
					BigDecimal intVal = new BigDecimal("" + planSum.intValue());
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
					planSum = planSum.setScale(roundCount,BigDecimal.ROUND_UP);
				}
                struct.setsetTOTAL_ISSUE_QTY(struct.getTOTAL_ISSUE_QTY());

				double dValue = 0.0;
				
				// ※使用日のみの値変更
				if((struct.geth_TOTAL_ISSUE_QTY().equals(struct.getTOTAL_ISSUE_QTY())) &&
				(struct.geth_PART_SUPPLIED_COMMENT().equals(struct.getPART_SUPPLIED_COMMENT())) &&
				(!struct.geth_SUPPLIED_DATE().equals(struct.getSUPPLIED_DATE())))
				{
					// 処理区分：≠1みなし出庫品
					if (!"1".equals(headStruct2.getreadSUPPLIED_ISSUE_GNR_TYP()))
					{
						// 処理区分変更なし
						// 使用日の更新
						struct.setsetSUPPLIED_ISSUE_GNR_TYP(headStruct2.getreadSUPPLIED_ISSUE_GNR_TYP());		// 処理区分
					} else {
						// 1みなし出庫品
						// 処理区分：2マニュアル修正
						// 使用日の更新
						struct.setsetSUPPLIED_ISSUE_GNR_TYP("2");												// 処理区分
					}
						List mcList2 = entity.mupdateT_PART_SUPPLIED_ISSUE_SUP.read(conn, struct);
						if(mcList2.isEmpty())
						{
							conn.rollback();
							setErrorMessage("ZZ01106");
							return;
						}
						AE0060020Struct mcStruct2 = (AE0060020Struct)mcList2.get(0);
						if(!struct.geth_MODIFY_COUNT().equals(mcStruct2.geth_MODIFY_COUNT()))
						{
							conn.rollback();
							setErrorMessage("ZZ01105");
							return;
						}
						struct.setsetSUPPLIED_DATE(struct.getSUPPLIED_DATE());									// 使用日
						struct.setsetPUCH_ODR_CD(struct.getPUCH_ODR_CD());
						struct.setsetACPT_NO(struct.getACPT_NO());
						struct.setsetITEM_CD(struct.getITEM_CD());
						entity.mupdateT_PART_SUPPLIED_ISSUE_SUP.update(conn, struct);
						if(_lotCtrlFlg && "1".equals(headStruct2.getreadLOT_CONTROL_FLG())){
							if (struct.geth_TOTAL_ISSUE_QTY().equals(struct.getTOTAL_ISSUE_QTY())){
								struct.setsetSUPPLIED_DATE(struct.getSUPPLIED_DATE());
								struct.setsetPART_SUPPLIED_COMMENT(struct.getPART_SUPPLIED_COMMENT());
							    struct.setsetPUCH_ODR_CD(struct.getPUCH_ODR_CD());
							    struct.setsetACPT_NO(struct.getACPT_NO());
							    struct.setsetITEM_CD(struct.getITEM_CD());
							    struct.setsetLOT_NO(struct.getLOT_NO());
								entity.mupdateT_LOT_USE_RSLT.update(conn, struct);        // [ロット別使用実績]の更新
							}
						}
				} else if((struct.geth_TOTAL_ISSUE_QTY().equals(struct.getTOTAL_ISSUE_QTY())) &&
						(struct.geth_SUPPLIED_DATE().equals(struct.getSUPPLIED_DATE())) &&
						(!struct.geth_PART_SUPPLIED_COMMENT().equals(struct.getPART_SUPPLIED_COMMENT()))) {
					// ※支給品備考のみの値変更
					// 支給品備考のみ更新
					struct.setsetSUPPLIED_ISSUE_GNR_TYP(headStruct2.getreadSUPPLIED_ISSUE_GNR_TYP());		// 処理区分
					struct.setsetPART_SUPPLIED_COMMENT(struct.getPART_SUPPLIED_COMMENT());					// 支給品備考
					struct.setsetPUCH_ODR_CD(struct.getPUCH_ODR_CD());
					struct.setsetACPT_NO(struct.getACPT_NO());
					struct.setsetITEM_CD(struct.getITEM_CD());
					entity.mupdateT_PART_SUPPLIED_ISSUE_COM.update(conn, struct);
					if(_lotCtrlFlg && "1".equals(headStruct2.getreadLOT_CONTROL_FLG())){
					    if (struct.geth_TOTAL_ISSUE_QTY().equals(struct.getTOTAL_ISSUE_QTY())){
							struct.setsetSUPPLIED_DATE(struct.getSUPPLIED_DATE());
							struct.setsetPART_SUPPLIED_COMMENT(struct.getPART_SUPPLIED_COMMENT());
					        struct.setsetPUCH_ODR_CD(struct.getPUCH_ODR_CD());
					        struct.setsetACPT_NO(struct.getACPT_NO());
					        struct.setsetITEM_CD(struct.getITEM_CD());
					        struct.setsetLOT_NO(struct.getLOT_NO());
							entity.mupdateT_LOT_USE_RSLT.update(conn, struct);        // [ロット別使用実績]の更新
					    }
					}
				} else {
						// 上記以外の場合
						if((struct.geth_TOTAL_ISSUE_QTY().equals(struct.getTOTAL_ISSUE_QTY())) &&
						(struct.geth_PART_SUPPLIED_COMMENT().equals(struct.getPART_SUPPLIED_COMMENT())) &&
						(struct.geth_SUPPLIED_DATE().equals(struct.getSUPPLIED_DATE())))
						{
							// 支給品使用の更新は行わない。
						} else {
							// 全て更新
							// 処理区分：≠1みなし出庫品
							if (!"1".equals(headStruct2.getreadSUPPLIED_ISSUE_GNR_TYP()))
							{
								struct.setsetSUPPLIED_ISSUE_GNR_TYP(headStruct2.getreadSUPPLIED_ISSUE_GNR_TYP());	// 処理区分
							} else {
								struct.setsetSUPPLIED_ISSUE_GNR_TYP("2");											// 処理区分
							}
							struct.setsetTOTAL_ISSUE_QTY(String.valueOf(planSum));									// 使用済数量
							/* [品目].”ロット管理フラグ” = 1(ロットトレース管理を行う。) の場合は、
							  「発注番号」「受入回数」「支給品目番号」が同一で異なる”在庫ロット番号”の
							   [ロット別使用実績]. “使用済数量”を「使用済数量」に加算する*/
							if(_lotCtrlFlg && "1".equals(headStruct2.getreadLOT_CONTROL_FLG())){
								if(struct.geth_TOTAL_ISSUE_QTY().equals(struct.getTOTAL_ISSUE_QTY())){
								    struct.setsetSUPPLIED_DATE(struct.getSUPPLIED_DATE());
								    struct.setsetPART_SUPPLIED_COMMENT(struct.getPART_SUPPLIED_COMMENT());
						            struct.setsetPUCH_ODR_CD(struct.getPUCH_ODR_CD());
						            struct.setsetACPT_NO(struct.getACPT_NO());
						            struct.setsetITEM_CD(struct.getITEM_CD());
						            struct.setsetLOT_NO(struct.getLOT_NO());
								    entity.mupdateT_LOT_USE_RSLT.update(conn, struct);        // [ロット別使用実績]の更新
							    }else{
							    	struct.setsetPUCH_ODR_CD(struct.getPUCH_ODR_CD());					// 条件.画面:発注番号
								    struct.setsetACPT_NO(struct.getACPT_NO());							// 条件.画面:受入回数
								    struct.setsetITEM_CD(struct.getITEM_CD());                          // 条件.支給品品目番号
								    struct.setsetLOT_NO(struct.getLOT_NO());
									List lotList = entity.mSelectT_LOT_USE_RSLT_LOT_NO.read(conn, struct);
								    if(lotList != null && lotList.size() > 0){
								    	AE0060020Struct lotStruct = (AE0060020Struct)lotList.get(0);
								    	oldValue = lotStruct.getreadTOTAL_ISSUE_QTY();
								    	newValue = String.valueOf(planSum);
								    	struct.setsetSUPPLIED_ISSUE_QTY(struct.getSUPPLIED_ISSUE_QTY());	// 使用予定数量
								        struct.setsetTOTAL_ISSUE_QTY(String.valueOf(planSum));				// 使用済数量
										struct.setsetSUPPLIED_DATE(struct.getSUPPLIED_DATE());				// 画面.使用日
										struct.setsetPART_SUPPLIED_COMMENT(struct.getPART_SUPPLIED_COMMENT());
								        struct.setsetPUCH_ODR_CD(struct.getPUCH_ODR_CD());					// 条件.画面:発注番号
								        struct.setsetACPT_NO(struct.getACPT_NO());							// 条件.画面:受入回数
								        struct.setsetITEM_CD(struct.getITEM_CD());                          // 条件.支給品品目番号
								        struct.setsetLOT_NO(struct.getLOT_NO());
										entity.mupdateT_LOT_USE_RSLT2.update(conn, struct);       // [ロット別使用実績]の更新
										double vlu = planSum.doubleValue() - Double.parseDouble(oldValue);
										dValue = vlu;
										AE0060020Struct uStruct = new AE0060020Struct();
										uStruct.setsetSPENT_QTY(String.valueOf(vlu));
										uStruct.setISSUE_INST_CD(headStruct2.getreadISSUE_INST_CD());
										uStruct.setLOT_NO(struct.getLOT_NO());
										uStruct.setITEM_CD(struct.getITEM_CD());
										uStruct.setPUCH_ODR_CD(struct.getPUCH_ODR_CD());
										uStruct.setsUser_ID(getsysUSER_CD());
										entity.mupdateT_LOT_ISSUE_INST.update(conn, uStruct);            //[出庫実績明細]の更新
										vlu = Double.parseDouble(headStruct2.getreadTOTAL_ISSUE_QTY()) + vlu;
										struct.setsetTOTAL_ISSUE_QTY(String.valueOf(vlu));
								    }
							    }
				            }
							
							struct.setsetSUPPLIED_DATE(struct.getSUPPLIED_DATE());									// 使用日
							struct.setsetPART_SUPPLIED_COMMENT(struct.getPART_SUPPLIED_COMMENT());					// 画面.支給品使用備考
							struct.setsetPUCH_ODR_CD(struct.getPUCH_ODR_CD());
							struct.setsetACPT_NO(struct.getACPT_NO());
							struct.setsetITEM_CD(struct.getITEM_CD());
							entity.mupdateT_PART_SUPPLIED_ISSUE_NOMAL.update(conn, struct);
						}
				}
				// ②保管区別品目在庫(T_ITEM_STOCK)、保管区別製番在庫(T_JOB_ODR_CD_STOCK)の登録・更新処理
				// 画面.使用済数量(修正前)<>画面.使用済数量(修正後)の場合更新処理を行う。
				if (!(struct.geth_TOTAL_ISSUE_QTY()).equals(struct.getTOTAL_ISSUE_QTY())) 
				{
					// 保管区コード取得
					struct.setsetVEND_CD(headStruct2.getreadVEND_CD());
					struct.setsetPLANT_CD(headStruct2.getreadPLANT_CD());
					List mWhList = entity.mreadM_WH.read(conn, struct);
					AE0060020Struct tempWhStruct = (AE0060020Struct) mWhList.get(0);

					// 品目手配区分による更新対象の変更
					if (("4".equals(headStruct2.getreadMRP_ODR_TYP())) || ("5".equals(headStruct2.getreadMRP_ODR_TYP())) ||
					   ("6".equals(headStruct2.getreadMRP_ODR_TYP())) || ("7".equals(headStruct2.getreadMRP_ODR_TYP())))
					{
						// MRP管理品(保管区別品目在庫対象)
						// 保管区別品目在庫チェック
						struct.setsetITEM_CD(struct.getITEM_CD());
						struct.setsetWH_CD(tempWhStruct.getreadWH_CD());
						try{
							List lockStList = entity.mlockT_ITEM_STOCK.read(conn, struct);
						}catch (ResourceBusyException rbe) {
							setErrorMessage("ZZ01105");
							setNextUrl("/AE0060022.jsp");
							conn.rollback();
							return;
						}
						List itemStList = entity.mreadT_ITEM_STOCK.read(conn, struct);
						// 更新チェック
						if (itemStList.isEmpty()) 
						{
							// 保管区別品目在庫登録
							struct.setsetITEM_CD(struct.getITEM_CD());									// 01.品目番号
							struct.setsetWH_CD(tempWhStruct.getreadWH_CD());							// 02.保管区コード
							struct.setsetPLANT_CD(headStruct2.getreadPLANT_CD());						// 03.工場コード
							if("1".equals(headStruct2.getreadLOT_CONTROL_FLG())){
							    struct.setsetSTOCK_ON_HAND_QTY(String.valueOf(dValue * -1));					// 04.品目別手持在庫数
							}else{
								struct.setsetSTOCK_ON_HAND_QTY(String.valueOf(Double.parseDouble(headStruct2.getreadTOTAL_ISSUE_QTY()) 
										- planSum.doubleValue()));					// 04.品目別手持在庫数
							}
							entity.minsertT_ITEM_STOCK.create(conn, struct);
							beforeQty = 0;																// 更新前
							afterQty = Double.parseDouble(headStruct2.getreadTOTAL_ISSUE_QTY()) 
															- planSum.doubleValue(); 					// 更新後
							totalissueQty = Double.parseDouble(headStruct2.getreadTOTAL_ISSUE_QTY());	// 使用済数量待避
						} else {
							AE0060020Struct tempitemStruct = (AE0060020Struct) itemStList.get(0);
							// 保管区別品目在庫更新
							if("1".equals(headStruct2.getreadLOT_CONTROL_FLG())){
							    struct.setsetSTOCK_ON_HAND_QTY(String.valueOf(Double.parseDouble(tempitemStruct.getreadSTOCK_ON_HAND_QTY()) 
															- dValue));								// 01.品目別手持在庫数
							}else{
								struct.setsetSTOCK_ON_HAND_QTY(String.valueOf(Double.parseDouble(tempitemStruct.getreadSTOCK_ON_HAND_QTY()) 
																+ Double.parseDouble(headStruct2.getreadTOTAL_ISSUE_QTY())
																- planSum.doubleValue()));								// 01.品目別手持在庫数
							}
							struct.setsetITEM_CD(struct.getITEM_CD());												// 条件.品目番号
							struct.setsetWH_CD(tempWhStruct.getreadWH_CD());										// 条件.保管区コード
							entity.mupdateT_ITEM_STOCK.update(conn, struct);
							// 更新前手持在庫数セット
							beforeQty = Double.parseDouble(tempitemStruct.getreadSTOCK_ON_HAND_QTY());				// 更新前
							afterQty = Double.parseDouble(tempitemStruct.getreadSTOCK_ON_HAND_QTY()) 
															+ Double.parseDouble(headStruct2.getreadTOTAL_ISSUE_QTY())
															- planSum.doubleValue();								// 更新後
							totalissueQty = Double.parseDouble(headStruct2.getreadTOTAL_ISSUE_QTY());				// 使用済数量待避
						}
					} else if (("1".equals(headStruct2.getreadMRP_ODR_TYP())) || ("2".equals(headStruct2.getreadMRP_ODR_TYP()))) {
						// 製番管理品(保管区別製番在庫対象)
						// 保管区別製番在庫チェック
						struct.setsetJOB_ODR_CD(headStruct2.getreadJOB_ODR_CD());									// 製番
						struct.setsetJOB_ODR_DETAIL_NO(headStruct2.getreadJOB_ODR_DETAIL_NO());						// 製番枝番
						struct.setsetITEM_CD(struct.getITEM_CD());													// 品目番号
						struct.setsetWH_CD(tempWhStruct.getreadWH_CD());											// 保管区コード
						List itemJobList = entity.mreadT_JOB_ODR_CD_STOCK.read(conn, struct);

						// 更新チェック
						if (itemJobList.isEmpty()) 
						{
							// 保管区別製番在庫登録
							struct.setsetJOB_ODR_CD(headStruct2.getreadJOB_ODR_CD());								// 01.製番
							struct.setsetJOB_ODR_DETAIL_NO(headStruct2.getreadJOB_ODR_DETAIL_NO());					// 02.製番枝番
							struct.setsetITEM_CD(struct.getITEM_CD());												// 03.品目番号
							struct.setsetWH_CD(tempWhStruct.getreadWH_CD());										// 04.保管区コード
							struct.setsetPLANT_CD(headStruct2.getreadPLANT_CD());									// 05.工場コード
							if("1".equals(headStruct2.getreadLOT_CONTROL_FLG())){
								struct.setsetSTOCK_ON_HAND_QTY(String.valueOf(dValue * -1));					    // 06.製番別手持在庫数
							}else{
								struct.setsetSTOCK_ON_HAND_QTY(String.valueOf(Double.parseDouble(headStruct2.getreadTOTAL_ISSUE_QTY()) 
																				- planSum.doubleValue()));				// 06.製番別手持在庫数
							}
							entity.minsertT_JOB_ODR_CD_STOCK.create(conn, struct);
							beforeQty = 0;																			// 更新前
							afterQty = Double.parseDouble(headStruct2.getreadTOTAL_ISSUE_QTY()) 
																			- planSum.doubleValue();				// 更新後
							totalissueQty = Double.parseDouble(headStruct2.getreadTOTAL_ISSUE_QTY());				// 使用済数量待避
						} else {
							AE0060020Struct tempJobStruct = (AE0060020Struct) itemJobList.get(0);
							// 保管区別製番在庫更新
							if("1".equals(headStruct2.getreadLOT_CONTROL_FLG())){
								struct.setsetSTOCK_ON_HAND_QTY(String.valueOf(Double.parseDouble(tempJobStruct.getreadSTOCK_ON_HAND_QTY()) 
															- dValue));								// 01.品目別手持在庫数
							}else{
								struct.setsetSTOCK_ON_HAND_QTY(String.valueOf(Double.parseDouble(tempJobStruct.getreadSTOCK_ON_HAND_QTY()) 
																+ Double.parseDouble(headStruct2.getreadTOTAL_ISSUE_QTY())
																- planSum.doubleValue()));								// 01.製番別手持在庫数
							}
							struct.setsetJOB_ODR_CD(headStruct2.getreadJOB_ODR_CD());								// 条件.製番
							struct.setsetJOB_ODR_DETAIL_NO(headStruct2.getreadJOB_ODR_DETAIL_NO());					// 条件.製番枝番
							struct.setsetITEM_CD(struct.getITEM_CD());												// 条件.品目番号
							struct.setsetWH_CD(tempWhStruct.getreadWH_CD());										// 条件.保管区コード
							entity.mupdateT_JOB_ODR_CD_STOCK.update(conn, struct);
							beforeQty = Double.parseDouble(tempJobStruct.getreadSTOCK_ON_HAND_QTY());				// 更新前
							afterQty = Double.parseDouble(tempJobStruct.getreadSTOCK_ON_HAND_QTY()) 
															+ Double.parseDouble(headStruct2.getreadTOTAL_ISSUE_QTY())
															- planSum.doubleValue();								// 更新後
							totalissueQty = Double.parseDouble(headStruct2.getreadTOTAL_ISSUE_QTY());				// 使用済数量待避
						}
					}

					// マイナス判定のインフォメーション表示
					if (afterQty < 0)
					{
						// AE00078:支給品みなし出庫で取引先保管区の品目または
						// 製番手持在庫数が一部マイナスとなりました。
						// setErrorMessage("AE00069");
						setWarningMessage("AE00078");
					}

					// [受入実績]の受入訂正回数取得
					List acptCrList = entity.mreadT_ACPT_RSLT.read(conn, struct);
					if (acptCrList.isEmpty())
					{
						strAcpt = "0";
						beforeAcpt = "0";
					} else {
						AE0060020Struct tempAcptStruct = (AE0060020Struct) acptCrList.get(0);
						strAcpt = tempAcptStruct.getreadACPT_CRCT_NO();
						beforeAcpt = (String.valueOf(Integer.parseInt(strAcpt) - 1));
					}
					// [検査実績]の検査訂正回数取得
					List inspcRsList = entity.mreadT_INSPC_RSLT.read(conn, struct);
					if (inspcRsList.isEmpty())
					{
						strInspc = "0";
						beforeInspc = "0";
					} else {
						AE0060020Struct tempInspcStruct = (AE0060020Struct) inspcRsList.get(0);
						strInspc = tempInspcStruct.getreadINSPC_CRCT_NO();
						beforeInspc = (String.valueOf(Integer.parseInt(strInspc) - 1));
					}
					// ③保管区別入出庫(T_RCV_ISSUE)の登録処理(赤)
					// 入出庫番号採番
					if(_lotCtrlFlg && "1".equals(headStruct2.getreadLOT_CONTROL_FLG())){
					    totalissueQty = Double.parseDouble(oldValue);
					}
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
					struct.setsetITEM_CD(struct.getITEM_CD());												// 03.品目番号
					struct.setsetPLANT_CD(headStruct2.getreadPLANT_CD());									// 04.工場コード
					struct.setsetWH_CD(tempWhStruct.getreadWH_CD());										// 05.保管区コード
					// 品目手配区分による更新値変更
					if (("1".equals(headStruct2.getreadMRP_ODR_TYP())) ||
					    ("2".equals(headStruct2.getreadMRP_ODR_TYP()))) 
					{
						struct.setsetJOB_ODR_CD(headStruct2.getreadJOB_ODR_CD());							// 06.製番
						struct.setsetJOB_ODR_DETAIL_NO(headStruct2.getreadJOB_ODR_DETAIL_NO());				// 07.製番枝番
					} else {
						struct.setsetJOB_ODR_CD("");														// 06.製番
						struct.setsetJOB_ODR_DETAIL_NO("0");												// 07.製番枝番
					}
					struct.setsetPUCH_ODR_CD(struct.getPUCH_ODR_CD());										// 08.画面:発注番号
					struct.setsetACPT_NO(struct.getACPT_NO());												// 09.画面:受入回数
					struct.setsetACPT_RSLT_CRCT_NO(beforeAcpt);												// 10.受入実績訂正回数(0:固定)
					struct.setsetINSPEC_RSLT_CRCT_NO(beforeInspc);											// 11.検査実績訂正回数(0:固定)
					struct.setsetWORK_ODR_CD(null);															// 12.作業計画番号(null)
					struct.setWORK_IN_PROC_CD(null);														// 13.仕掛作業コード(null)
					struct.setsetPARTIAL_PRD_NO("0");														// 14.分作回数(0:固定)
					struct.setsetOPR_RSLT_CRCT_NO("0");														// 15.作業実績訂正回数(0:固定)
					struct.setsetISSUE_INST_CD(headStruct2.getreadISSUE_INST_CD());							// 16.出庫指示番号
					struct.setsetRCV_ISSUE_BEFORE_QTY(String.valueOf(beforeQty));							// 17.入出庫前在庫数
					struct.setsetRCV_ISSUE_QTY(String.valueOf(totalissueQty));								// 18.入出庫数
					struct.setsetRCV_ISSUE_AFTER_QTY(String.valueOf(beforeQty + totalissueQty));			// 19.入出庫後在庫数
					struct.setsetRCV_ISSUE_AMOUNT("0");														// 20.入出庫金額(0:固定)
					struct.setsetRCV_ISSUE_DATE(struct.getSUPPLIED_DATE());									// 21.入出庫年月日
					struct.setsetRCV_ISSUE_GNR_TYP("79");													// 22.入出庫発生区分(79)
					struct.setsetRCV_ISSUE_ODD_QTY("0");													// 23.入出庫端数(0:固定)
					struct.setsetDEFECT_CAUSE_CD(null);														// 24.入出庫不良理由コード
					struct.setsetSTOCK_UPD_TYP("2");														// 25.在庫更新区分(2:固定)
					struct.setsetRCV_ISSUE_CMPLT_FLG("0");													// 26.入出庫完了フラグ
					struct.setsetOD_NO(headStruct2.getreadOD_NO());											// 27.オーダデマンド番号
					if (_lotCtrlFlg) {
						struct.setsetLOT_NO(struct.getLOT_NO());                                            // 28.画面:在庫ロット番号
					}
					struct.setsetVEND_LOT_NO(null);															// 28.画面:メーカロット番号
					struct.setsetRCV_ISSUE_COMMENT(null);													// 29.入出庫備考(null)
					struct.setsetCOMPANY_CD(headStruct2.getreadCOMPANY_CD());								// 30.会社コード
					struct.setsetVEND_CD(headStruct2.getreadVEND_CD());										// 31.取引先コード
					if(headStruct2.getreadCONS_TYP() == null || ("").equals(headStruct2.getreadCONS_TYP()) == true)
					{
						struct.setsetCONS_TYP("2");
					} else {
						struct.setsetCONS_TYP(headStruct2.getreadCONS_TYP());
					}
					struct.setsetCONS_EXEC_DATE(null);														// 33.有償支給実績抽出日
					entity.minsertT_RCV_ISSUE.create(conn, struct);

					if(_lotCtrlFlg && "1".equals(headStruct2.getreadLOT_CONTROL_FLG())){
						//ロット別品目在庫登録・更新処理を行う
					    BizCommon bc = new BizCommon(conn, getsysUSER_CD(), sp.getProcId(), getsysPLANT_CD());
					    List updateLotStockList = bc.excUpdateLotStockFd(no, "");
					    if(bc.getResultStatus().intValue() == 1){
					    }else{
					        if(updateLotStockList != null && updateLotStockList.size() > 0){
						        setErrorMessage((String)updateLotStockList.get(0));
						        return;
					        }
					    }
					}

					// ④保管区別入出庫(T_RCV_ISSUE)の登録処理(黒)
					// 入出庫番号採番
					CollectNumber collectNum2 = new CollectNumber(CollectNumber.ISSUE_CD,this.sysUSER_CD,
												this.sp.getProcId(),this.sysPLANT_CD);
					no = collectNum2.getNo();
					if (no == null || no.length() == 0) 
					{
						//採番結果がない
						setErrorMessage("ZZ01106");
						return;
					}

					struct.setsetRCV_ISSUE_CTRL_CD(no);														// 01.入出庫管理番号
					struct.setsetRCV_ISSUE_TYP("2");														// 02.入出庫区分(2:固定)
					struct.setsetITEM_CD(struct.getITEM_CD());												// 03.品目番号
					struct.setsetPLANT_CD(headStruct2.getreadPLANT_CD());									// 04.工場コード
					struct.setsetWH_CD(tempWhStruct.getreadWH_CD());										// 05.保管区コード

					// 品目手配区分による更新値変更
					if (("1".equals(headStruct2.getreadMRP_ODR_TYP())) ||
					    ("2".equals(headStruct2.getreadMRP_ODR_TYP()))) 
					{
						struct.setsetJOB_ODR_CD(headStruct2.getreadJOB_ODR_CD());							// 06.製番
						struct.setsetJOB_ODR_DETAIL_NO(headStruct2.getreadJOB_ODR_DETAIL_NO());				// 07.製番枝番
					} else {
						struct.setsetJOB_ODR_CD("");														// 06.製番
						struct.setsetJOB_ODR_DETAIL_NO("0");												// 07.製番枝番
					}
					struct.setsetPUCH_ODR_CD(struct.getPUCH_ODR_CD());										// 08.画面:発注番号
					struct.setsetACPT_NO(struct.getACPT_NO());												// 09.画面:受入回数
					struct.setsetACPT_RSLT_CRCT_NO(strAcpt);												// 10.受入実績訂正回数(0:固定)
					struct.setsetINSPEC_RSLT_CRCT_NO(strInspc);												// 11.検査実績訂正回数(0:固定)
					struct.setsetWORK_ODR_CD(null);															// 12.作業計画番号(null)
					struct.setWORK_IN_PROC_CD(null);														// 13.仕掛作業コード(null)
					struct.setsetPARTIAL_PRD_NO("0");														// 14.分作回数(0:固定)
					struct.setsetOPR_RSLT_CRCT_NO("0");														// 15.作業実績訂正回数(0:固定)
					struct.setsetISSUE_INST_CD(headStruct2.getreadISSUE_INST_CD());							// 16.出庫指示番号
					if(_lotCtrlFlg && "1".equals(headStruct2.getreadLOT_CONTROL_FLG())){
						afterQty = beforeQty + totalissueQty + Double.parseDouble(newValue) * -1;
					    struct.setsetRCV_ISSUE_BEFORE_QTY(String.valueOf(beforeQty + totalissueQty));			// 17.入出庫前在庫数
					    struct.setsetRCV_ISSUE_QTY(String.valueOf(Double.parseDouble(newValue) * -1));	        // 18.入出庫数
					    struct.setsetRCV_ISSUE_AFTER_QTY(String.valueOf(afterQty));								// 19.入出庫後在庫数
					}else{
						struct.setsetRCV_ISSUE_BEFORE_QTY(String.valueOf(beforeQty + totalissueQty));			// 17.入出庫前在庫数
					    struct.setsetRCV_ISSUE_QTY(String.valueOf(String.valueOf(planSum.intValue() * -1)));	// 18.入出庫数
					    struct.setsetRCV_ISSUE_AFTER_QTY(String.valueOf(afterQty));								// 19.入出庫後在庫数
					}
					struct.setsetRCV_ISSUE_AMOUNT("0");														// 20.入出庫金額(0:固定)
					struct.setsetRCV_ISSUE_DATE(struct.getSUPPLIED_DATE());									// 21.入出庫年月日
					struct.setsetRCV_ISSUE_GNR_TYP("71");													// 22.入出庫発生区分(79)
					struct.setsetRCV_ISSUE_ODD_QTY("0");													// 23.入出庫端数(0:固定)
					struct.setsetDEFECT_CAUSE_CD(null);														// 24.入出庫不良理由コード
					struct.setsetSTOCK_UPD_TYP("2");														// 25.在庫更新区分(2:固定)
					struct.setsetRCV_ISSUE_CMPLT_FLG("0");													// 26.入出庫完了フラグ
					struct.setsetOD_NO(headStruct2.getreadOD_NO());											// 27.オーダデマンド番号
					if (_lotCtrlFlg) {
						struct.setsetLOT_NO(struct.getLOT_NO());                                            // 28.画面:在庫ロット番号
					}
					struct.setsetVEND_LOT_NO(null);															// 28.画面:メーカロット番号
					struct.setsetRCV_ISSUE_COMMENT(null);													// 29.入出庫備考(null)
					struct.setsetCOMPANY_CD(headStruct2.getreadCOMPANY_CD());								// 30.会社コード
					struct.setsetVEND_CD(headStruct2.getreadVEND_CD());										// 31.取引先コード
					if(headStruct2.getreadCONS_TYP() == null || ("").equals(headStruct2.getreadCONS_TYP()) == true)
					{
						struct.setsetCONS_TYP("2");
					} else {
						struct.setsetCONS_TYP(headStruct2.getreadCONS_TYP());
					}
					struct.setsetCONS_EXEC_DATE(null);														// 33.有償支給実績抽出日
					entity.minsertT_RCV_ISSUE.create(conn, struct);
					
					if(_lotCtrlFlg && "1".equals(headStruct2.getreadLOT_CONTROL_FLG())){
						// ロット別品目在庫登録・更新処理を行う
						BizCommon bc = new BizCommon(conn, getsysUSER_CD(), sp.getProcId(), getsysPLANT_CD());
						List updateLotStockList = bc.excUpdateLotStockFd(no, "");
						if(bc.getResultStatus().intValue() == 1){
						}else{
						    if(updateLotStockList != null && updateLotStockList.size() > 0){
						        setErrorMessage((String)updateLotStockList.get(0));
						        return;
						    }
						}
					}
				}
			}
			// 画面再表示
			controlSelect();
			conn.commit();
		} catch (SQLException e) {
			throw new ExpjException(e);
		} catch (Exception e) {
			throw new ExpjException(e);
		} finally {
			if (conn != null) {
				conn.rollback();
			}
		}
                //}}user_implement_dev:<controlUpdate2>
		logger.exiting("AE0060020Control"+":USER="+struct.getsUser_ID(),"controlUpdate2");

		return;
	}

	/**
	 * 戻るボタン押下時に実行される処理です。
	 *
	 */
	public void controlReturn2() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0060");
		logger.entering("AE0060020Control"+":USER="+struct.getsUser_ID(),"controlReturn2");
			//{{user_implement_dev:<controlReturn2>
			// TODO: ユーザ定義のコードを記述してください
		// 親画面のキー情報をセット
		struct.setPUCH_ODR_CD(this.wkStruct.getPUCH_ODR_CD());
		controlSelect();
                //}}user_implement_dev:<controlReturn2>
		logger.exiting("AE0060020Control"+":USER="+struct.getsUser_ID(),"controlReturn2");

		return;
	}

	/**
	 * 使用数修正ボタン押下時に実行される処理です。
	 *
	 */
	public void controlNoUserParts() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0060");
		logger.entering("AE0060020Control"+":USER="+struct.getsUser_ID(),"controlNoUserParts");
			//{{user_implement_dev:<controlNoUserParts>
		// TODO: ユーザ定義のコードを記述してください
		try {

			// グリッド3の支給品品目番号
			List imteCdList = new ArrayList();
			imteCdList = struct.getList_l_ITEM_CD();
			struct.setl_ITEM_CD((String) imteCdList.get(0));
			List tempList = entity.mSelectHeader.read(conn, struct);
			if (tempList.isEmpty()) {
				setErrorMessage("ZZ01101");
				setErrorParameter("T_PART_SUPPLIED_ISSUE", "PUCH_ODR_CD", struct.getPUCH_ODR_CD());
				setErrorParameter("T_PART_SUPPLIED_ISSUE", "ACPT_NO", struct.getl_ACPT_NO());
				return;
			}
			AE0060020Struct headStruct = (AE0060020Struct)tempList.get(0);
			// 上段
			this.wkStruct.setPUCH_ODR_CD(struct.getPUCH_ODR_CD());										// キー情報待避用
			struct.setPUCH_ODR_CD(struct.getPUCH_ODR_CD());												// 発注番号セット(メイン画面より引継ぎ)
			struct.setACPT_NO(struct.getl_ACPT_NO());													// 受入回数セット(メイン画面中断グリッドより引継ぎ)
			// 中段
			struct.setITEM_CD(headStruct.getreadITEM_CD());												// 支給品目番号番号セット
			struct.setITEM_NAME(headStruct.getreadITEM_NAME());											// 支給品目名セット
			struct.setSUPPLIED_ISSUE_QTY(headStruct.getreadSUPPLIED_ISSUE_QTY());						// 使用予定数量セット
			struct.setSTOCK_UNIT2(headStruct.getreadSTOCK_UNIT());										// 使用予定数量単位セット
			struct.setTOTAL_ISSUE_QTY(headStruct.getreadTOTAL_ISSUE_QTY());								// 使用済数量セット
			struct.seth_TOTAL_ISSUE_QTY(headStruct.getreadTOTAL_ISSUE_QTY());
			struct.setSTOCK_UNIT3(headStruct.getreadSTOCK_UNIT());										// 使用予定数量単位セット
			struct.setSUPPLIED_DATE(headStruct.getreadSUPPLIED_DATE());									// 使用日セット
			struct.seth_SUPPLIED_DATE(headStruct.getreadSUPPLIED_DATE());								// 使用日セット
			struct.setUNIT_QTY_TYP2(struct.getl_UNIT_QTY_TYP());								// 在庫数単位区分セット
			struct.setLOT_NO_PARENT(struct.getLOT_NO());
			// 保管区コード取得
			struct.setsetVEND_CD(headStruct.getreadVEND_CD());
			struct.setsetPLANT_CD(headStruct.getreadPLANT_CD());
			List mWhList = entity.mreadM_WH.read(conn, struct);
			AE0060020Struct tempWhStruct = (AE0060020Struct) mWhList.get(0);

            String lotControlFlg = headStruct.getreadLOT_CONTROL_FLG();
            if(_lotCtrlFlg && "1".equals(lotControlFlg)){
               	struct.setsetITEM_CD(headStruct.getreadITEM_CD());
				struct.setsetWH_CD(tempWhStruct.getreadWH_CD());
				struct.setsetLOT_NO(headStruct.getreadLOT_NO());
               	List sohQtyList = entity.mSelectSTOCK_ON_HAND_QTY.read(conn, struct);
               	if(sohQtyList.isEmpty()){
               	}else{
               		AE0060020Struct tempHandQtyStruct = (AE0060020Struct) sohQtyList.get(0);
					struct.setSTOCK_ON_HAND_QTY(tempHandQtyStruct.getreadSTOCK_ON_HAND_QTY());
               	}
            }else{
            	// 品目手配区分による更新対象の変更
    			if (("4".equals(headStruct.getreadMRP_ODR_TYP())) || ("5".equals(headStruct.getreadMRP_ODR_TYP())) ||
    				   ("6".equals(headStruct.getreadMRP_ODR_TYP())) || ("7".equals(headStruct.getreadMRP_ODR_TYP())))
    			{
    				// MRP管理品(保管区別品目在庫対象) 保管区別品目在庫チェック
    				struct.setsetITEM_CD(headStruct.getreadITEM_CD());
    				struct.setsetWH_CD(tempWhStruct.getreadWH_CD());
    				List itemStList = entity.mreadT_ITEM_STOCK.read(conn, struct);
    				if (itemStList.isEmpty()) 
    				{
    				} else {
    					AE0060020Struct tempItemStStruct = (AE0060020Struct) itemStList.get(0);
    					struct.setSTOCK_ON_HAND_QTY(tempItemStStruct.getreadSTOCK_ON_HAND_QTY());			// 取引先手持在庫セット(品目在庫)
    				}
    			} else if (("1".equals(headStruct.getreadMRP_ODR_TYP())) || ("2".equals(headStruct.getreadMRP_ODR_TYP()))) {
    				// 製番管理品(保管区別製番在庫対象) 保管区別製番在庫チェック
    				struct.setsetJOB_ODR_CD(headStruct.getreadJOB_ODR_CD());
    				struct.setsetJOB_ODR_DETAIL_NO(headStruct.getreadJOB_ODR_DETAIL());
    				struct.setsetITEM_CD(headStruct.getreadITEM_CD());
    				struct.setsetWH_CD(tempWhStruct.getreadWH_CD());
    				List itemJobList = entity.mreadT_JOB_ODR_CD_STOCK.read(conn, struct);
    				if (itemJobList.isEmpty()) 
    				{
    				} else {
    					AE0060020Struct tempJobStruct = (AE0060020Struct) itemJobList.get(0);
    					struct.setSTOCK_ON_HAND_QTY(tempJobStruct.getreadSTOCK_ON_HAND_QTY());				// 取引先手持在庫セット(製番在庫)
    				}
    			}
            }
			struct.setSTOCK_UNIT4(headStruct.getreadSTOCK_UNIT());										// 取引先手持在庫数単位セット
			struct.setPART_SUPPLIED_COMMENT(headStruct.getreadPART_SUPPLIED_COMMENT());					// 支給品備考セット
			struct.seth_PART_SUPPLIED_COMMENT(headStruct.getreadPART_SUPPLIED_COMMENT());
			struct.setISSUE_INST_CD(headStruct.getreadISSUE_INST_CD());									// 出庫指示番号セット
			struct.setMRP_ODR_TYP(headStruct.getreadDISPLAY_NAME());										// 品目手配区分セット
			struct.setSUPPLIED_UNIT_DENOMINATOR(headStruct.getreadSUPPLIED_UNIT_DENOMINATOR());			// 支給品使用単位数分母セット
			struct.setSUPPLIED_UNIT_NUMERATOR(headStruct.getreadSUPPLIED_UNIT_NUMERATOR());				// 支給品使用単位数分子セット
			struct.setSTOCK_UNIT5(headStruct.getreadSTOCK_UNIT());										// 支給品使用単位数単位セット
			struct.setLOT_NO(struct.getl_LOT_NO());                                                     // 在庫ロット番号
			// 下段
			struct.setACPT_QTY(struct.getl_ACPT_QTY());													// 受入数セット(メイン画面中断グリッドより引継ぎ)
			struct.setSTOCK_UNIT1(struct.getl_STOCK_UNIT());											// 受入数単位セット(メイン画面上段より引継ぎ)
			struct.setJOB_ODR_CD(struct.getl_JOB_ODR_CD());												// 製番セット(メイン画面中断グリッドより引継ぎ)

			// 取引先表示：メイン画面[発注番号]と一致する[発注残]より取引先コード取得
			List tempVendList = entity.mSelectHeaderVend.read(conn, struct);
			if (tempVendList.isEmpty()) 
			{
			} else {
				AE0060020Struct headvendStruct = (AE0060020Struct)tempVendList.get(0);
				struct.setVEND_CD(headvendStruct.getreadVEND_CD());										// 取引先コードセット
				struct.setVEND_NAME(headvendStruct.getreadVEND_NAME());									// 取引先名セット
			}

			// 業務運用日取得
			this.struct.setsetPLANT_CD(this.sysPLANT_CD);
			List oprDateList = entity.mSelectDateCtrl.read(conn, this.struct);
			if (oprDateList.isEmpty()) {
				setErrorMessage("ZZ06001");
				setErrorParameter("SYS_DATE_CTRL", "PLANT_CD", getsysPLANT_CD());
				return;
			}
			AE0060020Struct oprDateStruct = (AE0060020Struct)oprDateList.get(0);
			struct.seth_BUSINESS_OPR_DATE(oprDateStruct.getreadBUSINESS_OPR_DATE());

			List mcList = entity.mupdateT_PART_SUPPLIED_ISSUE_SUP.read(conn, struct);
			AE0060020Struct mcStruct = (AE0060020Struct)mcList.get(0);
			struct.seth_MODIFY_COUNT(mcStruct.geth_MODIFY_COUNT());
		} catch (SQLException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			throw new ExpjException(e, emsg);
		} catch (Exception e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			throw new ExpjException(e, emsg);
		}
                //}}user_implement_dev:<controlNoUserParts>
		logger.exiting("AE0060020Control"+":USER="+struct.getsUser_ID(),"controlNoUserParts");

		return;
	}

	/**
	 * 支給品追加登録ボタン押下時に実行される処理です。
	 *
	 */
	public void controlUseParts() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0060");
		logger.entering("AE0060020Control"+":USER="+struct.getsUser_ID(),"controlUseParts");
			//{{user_implement_dev:<controlUseParts>
			// TODO: ユーザ定義のコードを記述してください
		try {
			// 上段
			this.wkStruct.setPUCH_ODR_CD(struct.getPUCH_ODR_CD());							// キー情報待避用
			struct.setPUCH_ODR_CD(struct.getPUCH_ODR_CD());									// 発注番号セット(メイン画面より引継ぎ)
			struct.setACPT_NO(struct.getl_ACPT_NO());										// 受入回数セット(メイン画面中断グリッドより引継ぎ)
			// 中段
			struct.setITEM_CD(null);														// 支給品目番号番号セット(null)
			struct.setITEM_NAME(null);														// 支給品目名セット(null)
			struct.setSUPPLIED_ISSUE_QTY("0.00");											// 使用予定数量セット
			struct.setSTOCK_UNIT2(null);													// 使用予定数量単位セット(null)
			struct.setTOTAL_ISSUE_QTY("0.00");												// 使用済数量セット
			struct.setSTOCK_UNIT3(null);													// 使用予定数量単位セット(null)
			// 業務運用日取得
			this.struct.setsetPLANT_CD(this.sysPLANT_CD);
			List oprDateList = entity.mSelectDateCtrl.read(conn, this.struct);
			if (oprDateList.isEmpty()) {
				setErrorMessage("ZZ06001");
				setErrorParameter("SYS_DATE_CTRL", "PLANT_CD", getsysPLANT_CD());
				return;
			}
			AE0060020Struct oprDateStruct = (AE0060020Struct)oprDateList.get(0);
			struct.setSUPPLIED_DATE(oprDateStruct.getreadBUSINESS_OPR_DATE());				// 使用日セット
			struct.seth_BUSINESS_OPR_DATE(oprDateStruct.getreadBUSINESS_OPR_DATE());		// 使用日セット
			struct.setSTOCK_ON_HAND_QTY("0.00");											// 取引先手持在庫セット
			struct.setSTOCK_UNIT4(null);													// 取引先手持在庫数単位セット(null)
			struct.setPART_SUPPLIED_COMMENT(null);											// 支給品備考セット(null)
			struct.setISSUE_INST_CD(null);													// 出庫指示番号セット(null)
			struct.setMRP_ODR_TYP(null);													// 品目手配区分セット(null)
			struct.setSUPPLIED_UNIT_DENOMINATOR("0.00");									// 支給品使用単位数分母セット
			struct.setSUPPLIED_UNIT_NUMERATOR("0.00");										// 支給品使用単位数分子セット
			struct.setSTOCK_UNIT5(null);													// 支給品使用単位数単位セット(null)
			struct.setUNIT_QTY_TYP2("2");													// 在庫数単位区分セット
			struct.setLOT_NO(null);                                                         // 在庫ロット番号
			// 下段
			struct.setACPT_QTY(struct.getl_ACPT_QTY());										// 受入数セット(メイン画面中断グリッドより引継ぎ)
			struct.setJOB_ODR_CD(struct.getl_JOB_ODR_CD());									// 製番セット(メイン画面中断グリッドより引継ぎ)
			struct.setSTOCK_UNIT1(struct.getl_STOCK_UNIT());								// 受入数単位セット
			
			// 取引先表示：メイン画面[発注番号]と一致する[発注残]より取引先コード取得
			List tempVendList = entity.mSelectHeaderVend.read(conn, struct);
			if (tempVendList.isEmpty()) 
			{
			} else {
				AE0060020Struct headvendStruct = (AE0060020Struct)tempVendList.get(0);
				struct.setVEND_CD(headvendStruct.getreadVEND_CD());							// 取引先コードセット
				struct.setVEND_NAME(headvendStruct.getreadVEND_NAME());						// 取引先名セット
			}
			setReadStatus(NORMAL);
		} catch (SQLException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			throw new ExpjException(e, emsg);
		} catch (Exception e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			throw new ExpjException(e, emsg);
		}
                //}}user_implement_dev:<controlUseParts>
		logger.exiting("AE0060020Control"+":USER="+struct.getsUser_ID(),"controlUseParts");

		return;
	}

	/**
	 * ボタン押下時に実行される処理です。
	 *
	 */
	public void controlClickShow() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0060");
		logger.entering("AE0060020Control"+":USER="+struct.getsUser_ID(),"controlClickShow");
			//{{user_implement_dev:<controlClickShow>
			// TODO: ユーザ定義のコードを記述してください
		try {
			//支給品リスト取得
			this.setIssueList();

			// 明細最大出力チェック
			int maxLine = sp.getMaxLine(conn,11);
			if (maxLine != 0 && this.issueList.size() > maxLine) {
				this.issueList.clear();
				setErrorMessage("ZZ01119",""+maxLine);
				setReadStatus(TOO_MANY);
				return;
			}

			setReadStatus(NORMAL);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
                //}}user_implement_dev:<controlClickShow>
		logger.exiting("AE0060020Control"+":USER="+struct.getsUser_ID(),"controlClickShow");

		return;
	}

	/**
	 * 取消解除ボタン押下時に実行される処理です。
	 *
	 */
	public void controlCancelOdrCancel() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0060");
		logger.entering("AE0060020Control"+":USER="+struct.getsUser_ID(),"controlCancelOdrCancel");
			//{{user_implement_dev:<controlCancelOdrCancel>
			// TODO: ユーザ定義のコードを記述してください
/*
		try {
			int nRet = 0;
			nRet = entity.mT_ACPT_RSLT.update(conn, struct);
			nRet = entity.mT_INSPC_RSLT.update(conn, struct);
			nRet = entity.mT_RLSD_PUCH_ODRForComplete.update(conn, struct);
			nRet = entity.mT_RLSD_PUCH_ODRForCancel.update(conn, struct);
			nRet = entity.mupdateT_ITEM_STOCK.update(conn, struct);
			nRet = entity.mupdateT_JOB_ODR_CD_STOCK.update(conn, struct);
			nRet = entity.mupdateT_PART_SUPPLIED_ISSUE.update(conn, struct);
			nRet = entity.mupdateT_PART_SUPPLIED_ISSUE_SUP.update(conn, struct);
			nRet = entity.mupdateT_PART_SUPPLIED_ISSUE_COM.update(conn, struct);
			nRet = entity.mupdateT_PART_SUPPLIED_ISSUE_NOMAL.update(conn, struct);
			nRet = entity.mupdateT_PART_SUPPLIED_ISSUE_GNR.update(conn, struct);
		} catch(SQLException e) {
//			e.printStackTrace();
			// エラー処理を記述してください。
		}
*/
		try {
			// [発注残]に存在しない場合
			List lockedList = entity.mT_RLSD_PUCH_ODR_Lock.read(conn, struct);
			if (lockedList.isEmpty()) {
				setErrorMessage("ZZ01105");
				setErrorParameter("T_RLSD_PUCH_ODR", "PUCH_ODR_CD", struct.getPUCH_ODR_CD());
				return;
			}
			AE0060020Struct lockedStruct = (AE0060020Struct) lockedList.get(0);
			// [発注残]."更新数" != ｢更新数｣(hidden使用)の場合
			if (!lockedStruct
				.getPUCH_ODR_MODIFY_COUNT()
				.equals(struct.getPUCH_ODR_MODIFY_COUNT())) {
				setErrorMessage("ZZ01105");
				setErrorParameter("T_RLSD_PUCH_ODR", "PUCH_ODR_CD", struct.getPUCH_ODR_CD());
				return;
			}

			// [発注残]を更新
			entity.mT_RLSD_PUCH_ODR_FOR_CANCEL_ODR_CANCEL.update(conn, struct);

			InspcAcpt ia = new InspcAcpt(conn, sysUSER_CD, sp.getProcId(), sysPLANT_CD);
			ia.cancelAcpt(struct.getPUCH_ODR_CD());

			// [受入実績]を削除
			AE0060020Struct aStruct = new AE0060020Struct();
			setStructSystemData(aStruct);
			aStruct.setPUCH_ODR_CD(struct.getPUCH_ODR_CD());
			aStruct.setACPT_NO("1");
			entity.mT_ACPT_RSLT_FOR_CANCEL_ODR_CANCEL.delete(conn, aStruct);
			
			struct.setc_CANCEL("true");
			setWarningMessage("AE00123");
			
			// 画面再表示
			//controlSelect();
			//一覧表をクリア
			setReadStatus(0);
			this.issueList.clear();
			this.list.clear();
			initializeDetail();

			
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
		logger.exiting("AE0060020Control"+":USER="+struct.getsUser_ID(),"controlCancelOdrCancel");

		return;
	}

	/**
	 * 詳細ボタン押下時に実行される処理です。
	 *
	 */
	public void controlDetail() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0060");
		logger.entering("AE0060020Control"+":USER="+struct.getsUser_ID(),"controlDetail");
			//{{user_implement_dev:<controlDetail>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlDetail>
		logger.exiting("AE0060020Control"+":USER="+struct.getsUser_ID(),"controlDetail");

		return;
	}

	/**
	 * ロット管理ボタン押下時に実行される処理です。
	 *
	 */
	public void controlLotInsert() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0060");
		logger.entering("AE0060020Control"+":USER="+struct.getsUser_ID(),"controlLotInsert");
			//{{user_implement_dev:<controlLotInsert>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlLotInsert>
		logger.exiting("AE0060020Control"+":USER="+struct.getsUser_ID(),"controlLotInsert");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0060");
		logger.entering("AE0060020Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
		// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AE0060020Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0060");
		logger.entering("AE0060020Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
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

			ComboBox cdac2 = new ComboBox(conn, sysUSER_CD);
			_mrpodrTypStruct = cdac2.getData("MRP_ODR_TYP");
			cdac2.setConnection(null);
			//システム導入フラグ取得
			_lotCtrlFlg = LotCtrl.checkLotCtrl(conn);
			
			// パラメータ[検査完了フラグ]を取得
			PrivateConfig pc = new PrivateConfig(conn);
		    _inspcvalue = pc.getString("INSPC_CMPLT_FLG");
		    
			// 画面を初期化
			initializeAll();

		} catch (SQLException e) {
			throw new ExpjException(e);
		} catch (DataNotFoundException e) {
			throw new ExpjException(e);
		} catch (ComboException e) {
			throw new ExpjException(e);
		}

                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AE0060020Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

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
		logger.entering("AE0060020Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
		logger.exiting("AE0060020Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("LineInsert") ) {
				controlLineInsert();
			} else if( button.equals("LineUpdate") ) {
				controlLineUpdate();
			} else if( button.equals("CancelComplete") ) {
				controlCancelComplete();
			} else if( button.equals("Clear") ) {
				controlClear();
			} else if( button.equals("SelectUnitCost") ) {
				controlSelectUnitCost();
			} else if( button.equals("Insert") ) {
				controlInsert();
			} else if( button.equals("Update") ) {
				controlUpdate();
			} else if( button.equals("Return") ) {
				controlReturn();
			} else if( button.equals("Insert2") ) {
				controlInsert2();
			} else if( button.equals("Update2") ) {
				controlUpdate2();
			} else if( button.equals("Return2") ) {
				controlReturn2();
			} else if( button.equals("NoUserParts") ) {
				controlNoUserParts();
			} else if( button.equals("UseParts") ) {
				controlUseParts();
			} else if( button.equals("ClickShow") ) {
				controlClickShow();
			} else if( button.equals("CancelOdrCancel") ) {
				controlCancelOdrCancel();
			} else if( button.equals("Detail") ) {
				controlDetail();
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
			struct.setHOME_CUR_UNIT(_homeCurStruct.getCUR_UNIT());

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
//			throw new FoundationException("AE0060020Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AE0060020-E999","CSVの出力処理"));
			throw new FoundationException("AE0060020Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AE0060020-E999","システム日付の取得処理"));
				throw new FoundationException("AE0060020Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AE0060020-E999","コントロールのイベント処理"));
			throw new FoundationException("AE0060020Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected AE0060020Entity entity;
	protected AE0060020Struct struct;
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

		entity = new AE0060020Entity();
		struct = new AE0060020Struct();

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
	 * AE0060020クラスの標準コンストラクタ
	 */
	public AE0060020Control() throws BusinessProcessException, FoundationException
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
				AE0060020Struct key = (AE0060020Struct)keyList.get(j);
				// メッセージキーを作成する
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("l_ACPT_STS_TYP_DN") && key.getl_ACPT_STS_TYP_DN() != null) {
					msgKey.setKeyValue("l_ACPT_STS_TYP_DN", key.getl_ACPT_STS_TYP_DN());
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
				if(msgKeyType.containsKeyColumn("INSPC_CMPLT_FLG_DN") && key.getINSPC_CMPLT_FLG_DN() != null) {
					msgKey.setKeyValue("INSPC_CMPLT_FLG_DN", key.getINSPC_CMPLT_FLG_DN());
				}
				if(msgKeyType.containsKeyColumn("SelectUnitCostFlag") && key.getSelectUnitCostFlag() != null) {
					msgKey.setKeyValue("SelectUnitCostFlag", key.getSelectUnitCostFlag());
				}
				if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP_DN") && key.getUNIT_QTY_TYP_DN() != null) {
					msgKey.setKeyValue("UNIT_QTY_TYP_DN", key.getUNIT_QTY_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("SUPPLIED_ISSUE_QTY") && key.getSUPPLIED_ISSUE_QTY() != null) {
					msgKey.setKeyValue("SUPPLIED_ISSUE_QTY", key.getSUPPLIED_ISSUE_QTY());
				}
				if(msgKeyType.containsKeyColumn("TOTAL_ISSUE_QTY") && key.getTOTAL_ISSUE_QTY() != null) {
					msgKey.setKeyValue("TOTAL_ISSUE_QTY", key.getTOTAL_ISSUE_QTY());
				}
				if(msgKeyType.containsKeyColumn("STOCK_ON_HAND_QTY") && key.getSTOCK_ON_HAND_QTY() != null) {
					msgKey.setKeyValue("STOCK_ON_HAND_QTY", key.getSTOCK_ON_HAND_QTY());
				}
				if(msgKeyType.containsKeyColumn("PART_SUPPLIED_COMMENT") && key.getPART_SUPPLIED_COMMENT() != null) {
					msgKey.setKeyValue("PART_SUPPLIED_COMMENT", key.getPART_SUPPLIED_COMMENT());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP") && key.getMRP_ODR_TYP() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP", key.getMRP_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("SUPPLIED_UNIT_NUMERATOR") && key.getSUPPLIED_UNIT_NUMERATOR() != null) {
					msgKey.setKeyValue("SUPPLIED_UNIT_NUMERATOR", key.getSUPPLIED_UNIT_NUMERATOR());
				}
				if(msgKeyType.containsKeyColumn("SUPPLIED_UNIT_DENOMINATOR") && key.getSUPPLIED_UNIT_DENOMINATOR() != null) {
					msgKey.setKeyValue("SUPPLIED_UNIT_DENOMINATOR", key.getSUPPLIED_UNIT_DENOMINATOR());
				}
				if(msgKeyType.containsKeyColumn("l_HAND_QTY") && key.getl_HAND_QTY() != null) {
					msgKey.setKeyValue("l_HAND_QTY", key.getl_HAND_QTY());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT1") && key.getSTOCK_UNIT1() != null) {
					msgKey.setKeyValue("STOCK_UNIT1", key.getSTOCK_UNIT1());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT2") && key.getSTOCK_UNIT2() != null) {
					msgKey.setKeyValue("STOCK_UNIT2", key.getSTOCK_UNIT2());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT3") && key.getSTOCK_UNIT3() != null) {
					msgKey.setKeyValue("STOCK_UNIT3", key.getSTOCK_UNIT3());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT4") && key.getSTOCK_UNIT4() != null) {
					msgKey.setKeyValue("STOCK_UNIT4", key.getSTOCK_UNIT4());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT5") && key.getSTOCK_UNIT5() != null) {
					msgKey.setKeyValue("STOCK_UNIT5", key.getSTOCK_UNIT5());
				}
				if(msgKeyType.containsKeyColumn("l_SUPPLIED_RE_QTY") && key.getl_SUPPLIED_RE_QTY() != null) {
					msgKey.setKeyValue("l_SUPPLIED_RE_QTY", key.getl_SUPPLIED_RE_QTY());
				}
				if(msgKeyType.containsKeyColumn("h_ACPT_QTY") && key.geth_ACPT_QTY() != null) {
					msgKey.setKeyValue("h_ACPT_QTY", key.geth_ACPT_QTY());
				}
				if(msgKeyType.containsKeyColumn("h_ACPT_DATE") && key.geth_ACPT_DATE() != null) {
					msgKey.setKeyValue("h_ACPT_DATE", key.geth_ACPT_DATE());
				}
				if(msgKeyType.containsKeyColumn("h_TOTAL_ISSUE_QTY") && key.geth_TOTAL_ISSUE_QTY() != null) {
					msgKey.setKeyValue("h_TOTAL_ISSUE_QTY", key.geth_TOTAL_ISSUE_QTY());
				}
				if(msgKeyType.containsKeyColumn("h_SUPPLIED_DATE") && key.geth_SUPPLIED_DATE() != null) {
					msgKey.setKeyValue("h_SUPPLIED_DATE", key.geth_SUPPLIED_DATE());
				}
				if(msgKeyType.containsKeyColumn("h_PART_SUPPLIED_COMMENT") && key.geth_PART_SUPPLIED_COMMENT() != null) {
					msgKey.setKeyValue("h_PART_SUPPLIED_COMMENT", key.geth_PART_SUPPLIED_COMMENT());
				}
				if(msgKeyType.containsKeyColumn("h_PUCH_ODR_CD") && key.geth_PUCH_ODR_CD() != null) {
					msgKey.setKeyValue("h_PUCH_ODR_CD", key.geth_PUCH_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP2") && key.getUNIT_QTY_TYP2() != null) {
					msgKey.setKeyValue("UNIT_QTY_TYP2", key.getUNIT_QTY_TYP2());
				}
				if(msgKeyType.containsKeyColumn("h_ODR_CANCEL_SLIP_ISS_FLG") && key.geth_ODR_CANCEL_SLIP_ISS_FLG() != null) {
					msgKey.setKeyValue("h_ODR_CANCEL_SLIP_ISS_FLG", key.geth_ODR_CANCEL_SLIP_ISS_FLG());
				}
				if(msgKeyType.containsKeyColumn("c_CANCEL") && key.getc_CANCEL() != null) {
					msgKey.setKeyValue("c_CANCEL", key.getc_CANCEL());
				}
				if(msgKeyType.containsKeyColumn("h_ACPT_RSLT_COUNT") && key.geth_ACPT_RSLT_COUNT() != null) {
					msgKey.setKeyValue("h_ACPT_RSLT_COUNT", key.geth_ACPT_RSLT_COUNT());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD_DW") && key.getITEM_CD_DW() != null) {
					msgKey.setKeyValue("ITEM_CD_DW", key.getITEM_CD_DW());
				}
				if(msgKeyType.containsKeyColumn("ITEM_NAME_DW") && key.getITEM_NAME_DW() != null) {
					msgKey.setKeyValue("ITEM_NAME_DW", key.getITEM_NAME_DW());
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
				if(msgKeyType.containsKeyColumn("h_LINEUPDATE_FLG_1") && key.geth_LINEUPDATE_FLG_1() != null) {
					msgKey.setKeyValue("h_LINEUPDATE_FLG_1", key.geth_LINEUPDATE_FLG_1());
				}
				if(msgKeyType.containsKeyColumn("h_LINEUPDATE_FLG") && key.geth_LINEUPDATE_FLG() != null) {
					msgKey.setKeyValue("h_LINEUPDATE_FLG", key.geth_LINEUPDATE_FLG());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD_LOT") && key.getITEM_CD_LOT() != null) {
					msgKey.setKeyValue("ITEM_CD_LOT", key.getITEM_CD_LOT());
				}
				if(msgKeyType.containsKeyColumn("JudgeFlg") && key.getJudgeFlg() != null) {
					msgKey.setKeyValue("JudgeFlg", key.getJudgeFlg());
				}
				if(msgKeyType.containsKeyColumn("h_LOTCTRL") && key.geth_LOTCTRL() != null) {
					msgKey.setKeyValue("h_LOTCTRL", key.geth_LOTCTRL());
				}
				if(msgKeyType.containsKeyColumn("h_LOT_NO") && key.geth_LOT_NO() != null) {
					msgKey.setKeyValue("h_LOT_NO", key.geth_LOT_NO());
				}
				if(msgKeyType.containsKeyColumn("h_BUSINESS_OPR_DATE") && key.geth_BUSINESS_OPR_DATE() != null) {
					msgKey.setKeyValue("h_BUSINESS_OPR_DATE", key.geth_BUSINESS_OPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("HOME_DECIMAL_FIG") && key.getHOME_DECIMAL_FIG() != null) {
					msgKey.setKeyValue("HOME_DECIMAL_FIG", key.getHOME_DECIMAL_FIG());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_CD") && key.getPUCH_ODR_CD() != null) {
					msgKey.setKeyValue("PUCH_ODR_CD", key.getPUCH_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ACPT_NO") && key.getl_ACPT_NO() != null) {
					msgKey.setKeyValue("l_ACPT_NO", key.getl_ACPT_NO());
				}
				if(msgKeyType.containsKeyColumn("l_ACPT_QTY") && key.getl_ACPT_QTY() != null) {
					msgKey.setKeyValue("l_ACPT_QTY", key.getl_ACPT_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_STOCK_UNIT") && key.getl_STOCK_UNIT() != null) {
					msgKey.setKeyValue("l_STOCK_UNIT", key.getl_STOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("l_WH_CD") && key.getl_WH_CD() != null) {
					msgKey.setKeyValue("l_WH_CD", key.getl_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("l_WH_NAME") && key.getl_WH_NAME() != null) {
					msgKey.setKeyValue("l_WH_NAME", key.getl_WH_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_DLV_CD") && key.getl_DLV_CD() != null) {
					msgKey.setKeyValue("l_DLV_CD", key.getl_DLV_CD());
				}
				if(msgKeyType.containsKeyColumn("l_UNIT_COST") && key.getl_UNIT_COST() != null) {
					msgKey.setKeyValue("l_UNIT_COST", key.getl_UNIT_COST());
				}
				if(msgKeyType.containsKeyColumn("l_CUR_UNIT") && key.getl_CUR_UNIT() != null) {
					msgKey.setKeyValue("l_CUR_UNIT", key.getl_CUR_UNIT());
				}
				if(msgKeyType.containsKeyColumn("l_ACPT_STS_TYP") && key.getl_ACPT_STS_TYP() != null) {
					msgKey.setKeyValue("l_ACPT_STS_TYP", key.getl_ACPT_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_MODIFY_COUNT") && key.getPUCH_ODR_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("PUCH_ODR_MODIFY_COUNT", key.getPUCH_ODR_MODIFY_COUNT());
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
				if(msgKeyType.containsKeyColumn("STOCK_UNIT") && key.getSTOCK_UNIT() != null) {
					msgKey.setKeyValue("STOCK_UNIT", key.getSTOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("TAX_CD") && key.getTAX_CD() != null) {
					msgKey.setKeyValue("TAX_CD", key.getTAX_CD());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_START_DATE") && key.getPUCH_ODR_START_DATE() != null) {
					msgKey.setKeyValue("PUCH_ODR_START_DATE", key.getPUCH_ODR_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_COMMENT") && key.getPUCH_ODR_COMMENT() != null) {
					msgKey.setKeyValue("PUCH_ODR_COMMENT", key.getPUCH_ODR_COMMENT());
				}
				if(msgKeyType.containsKeyColumn("ACPT_NO") && key.getACPT_NO() != null) {
					msgKey.setKeyValue("ACPT_NO", key.getACPT_NO());
				}
				if(msgKeyType.containsKeyColumn("ACPT_MODIFY_COUNT") && key.getACPT_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("ACPT_MODIFY_COUNT", key.getACPT_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("ACPT_QTY") && key.getACPT_QTY() != null) {
					msgKey.setKeyValue("ACPT_QTY", key.getACPT_QTY());
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
				if(msgKeyType.containsKeyColumn("INSPC_WH_CD") && key.getINSPC_WH_CD() != null) {
					msgKey.setKeyValue("INSPC_WH_CD", key.getINSPC_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("INSPC_WH_NAME") && key.getINSPC_WH_NAME() != null) {
					msgKey.setKeyValue("INSPC_WH_NAME", key.getINSPC_WH_NAME());
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
				if(msgKeyType.containsKeyColumn("COMPANY_CD") && key.getCOMPANY_CD() != null) {
					msgKey.setKeyValue("COMPANY_CD", key.getCOMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("ROUND_TYP") && key.getROUND_TYP() != null) {
					msgKey.setKeyValue("ROUND_TYP", key.getROUND_TYP());
				}
				if(msgKeyType.containsKeyColumn("TAX_ROUND_TYP") && key.getTAX_ROUND_TYP() != null) {
					msgKey.setKeyValue("TAX_ROUND_TYP", key.getTAX_ROUND_TYP());
				}
				if(msgKeyType.containsKeyColumn("BUSINESS_OPR_DATE") && key.getBUSINESS_OPR_DATE() != null) {
					msgKey.setKeyValue("BUSINESS_OPR_DATE", key.getBUSINESS_OPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("ODR_CANCEL_CAUSE_CD") && key.getODR_CANCEL_CAUSE_CD() != null) {
					msgKey.setKeyValue("ODR_CANCEL_CAUSE_CD", key.getODR_CANCEL_CAUSE_CD());
				}
				if(msgKeyType.containsKeyColumn("ODR_CANCEL_SLIP_ISS_FLG") && key.getODR_CANCEL_SLIP_ISS_FLG() != null) {
					msgKey.setKeyValue("ODR_CANCEL_SLIP_ISS_FLG", key.getODR_CANCEL_SLIP_ISS_FLG());
				}
				if(msgKeyType.containsKeyColumn("h_WORK_ODR_CD") && key.geth_WORK_ODR_CD() != null) {
					msgKey.setKeyValue("h_WORK_ODR_CD", key.geth_WORK_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("h_LOT_NUMBERING_TYP") && key.geth_LOT_NUMBERING_TYP() != null) {
					msgKey.setKeyValue("h_LOT_NUMBERING_TYP", key.geth_LOT_NUMBERING_TYP());
				}
				if(msgKeyType.containsKeyColumn("h_LOT_CONTROL_FLG") && key.geth_LOT_CONTROL_FLG() != null) {
					msgKey.setKeyValue("h_LOT_CONTROL_FLG", key.geth_LOT_CONTROL_FLG());
				}
				if(msgKeyType.containsKeyColumn("h_FINAL_PROC_FLG") && key.geth_FINAL_PROC_FLG() != null) {
					msgKey.setKeyValue("h_FINAL_PROC_FLG", key.geth_FINAL_PROC_FLG());
				}
				if(msgKeyType.containsKeyColumn("h_DATE_FLG") && key.geth_DATE_FLG() != null) {
					msgKey.setKeyValue("h_DATE_FLG", key.geth_DATE_FLG());
				}
				if(msgKeyType.containsKeyColumn("LOT_NO") && key.getLOT_NO() != null) {
					msgKey.setKeyValue("LOT_NO", key.getLOT_NO());
				}
				if(msgKeyType.containsKeyColumn("ACPT_STS_TYP") && key.getACPT_STS_TYP() != null) {
					msgKey.setKeyValue("ACPT_STS_TYP", key.getACPT_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("INSPECTED_QTY") && key.getINSPECTED_QTY() != null) {
					msgKey.setKeyValue("INSPECTED_QTY", key.getINSPECTED_QTY());
				}
				if(msgKeyType.containsKeyColumn("MODIFY_COUNT") && key.getMODIFY_COUNT() != null) {
					msgKey.setKeyValue("MODIFY_COUNT", key.getMODIFY_COUNT());
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
				if(msgKeyType.containsKeyColumn("readWH_CD") && key.getreadWH_CD() != null) {
					msgKey.setKeyValue("readWH_CD", key.getreadWH_CD());
				}
				if(msgKeyType.containsKeyColumn("readSUPPLIED_ISSUE_GNR_TYP") && key.getreadSUPPLIED_ISSUE_GNR_TYP() != null) {
					msgKey.setKeyValue("readSUPPLIED_ISSUE_GNR_TYP", key.getreadSUPPLIED_ISSUE_GNR_TYP());
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
				if(msgKeyType.containsKeyColumn("readSUPPLIED_DATE") && key.getreadSUPPLIED_DATE() != null) {
					msgKey.setKeyValue("readSUPPLIED_DATE", key.getreadSUPPLIED_DATE());
				}
				if(msgKeyType.containsKeyColumn("readPART_SUPPLIED_COMMENT") && key.getreadPART_SUPPLIED_COMMENT() != null) {
					msgKey.setKeyValue("readPART_SUPPLIED_COMMENT", key.getreadPART_SUPPLIED_COMMENT());
				}
				if(msgKeyType.containsKeyColumn("readACPT_CRCT_NO") && key.getreadACPT_CRCT_NO() != null) {
					msgKey.setKeyValue("readACPT_CRCT_NO", key.getreadACPT_CRCT_NO());
				}
				if(msgKeyType.containsKeyColumn("readINSPC_CRCT_NO") && key.getreadINSPC_CRCT_NO() != null) {
					msgKey.setKeyValue("readINSPC_CRCT_NO", key.getreadINSPC_CRCT_NO());
				}
				if(msgKeyType.containsKeyColumn("l_ITEM_CD") && key.getl_ITEM_CD() != null) {
					msgKey.setKeyValue("l_ITEM_CD", key.getl_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ITEM_NAME") && key.getl_ITEM_NAME() != null) {
					msgKey.setKeyValue("l_ITEM_NAME", key.getl_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_JOB_ODR_CD") && key.getl_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("l_JOB_ODR_CD", key.getl_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("tmp_JOB_ODR_DETAIL_NO") && key.gettmp_JOB_ODR_DETAIL_NO() != null) {
					msgKey.setKeyValue("tmp_JOB_ODR_DETAIL_NO", key.gettmp_JOB_ODR_DETAIL_NO());
				}
				if(msgKeyType.containsKeyColumn("l_SUPPLIED_GNR_TYP") && key.getl_SUPPLIED_GNR_TYP() != null) {
					msgKey.setKeyValue("l_SUPPLIED_GNR_TYP", key.getl_SUPPLIED_GNR_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_SUPPLIED_QTY") && key.getl_SUPPLIED_QTY() != null) {
					msgKey.setKeyValue("l_SUPPLIED_QTY", key.getl_SUPPLIED_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_TOTAL_ISSUE_QTY") && key.getl_TOTAL_ISSUE_QTY() != null) {
					msgKey.setKeyValue("l_TOTAL_ISSUE_QTY", key.getl_TOTAL_ISSUE_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_STOCK_UNIT2") && key.getl_STOCK_UNIT2() != null) {
					msgKey.setKeyValue("l_STOCK_UNIT2", key.getl_STOCK_UNIT2());
				}
				if(msgKeyType.containsKeyColumn("l_SUPPLIED_DATE") && key.getl_SUPPLIED_DATE() != null) {
					msgKey.setKeyValue("l_SUPPLIED_DATE", key.getl_SUPPLIED_DATE());
				}
				if(msgKeyType.containsKeyColumn("tmp_MRP_ODR_TYP") && key.gettmp_MRP_ODR_TYP() != null) {
					msgKey.setKeyValue("tmp_MRP_ODR_TYP", key.gettmp_MRP_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_PART_SUPPLIED_COMMENT") && key.getl_PART_SUPPLIED_COMMENT() != null) {
					msgKey.setKeyValue("l_PART_SUPPLIED_COMMENT", key.getl_PART_SUPPLIED_COMMENT());
				}
				if(msgKeyType.containsKeyColumn("l_ISSUE_INST_CD") && key.getl_ISSUE_INST_CD() != null) {
					msgKey.setKeyValue("l_ISSUE_INST_CD", key.getl_ISSUE_INST_CD());
				}
				if(msgKeyType.containsKeyColumn("l_MRP_ODR_TYP") && key.getl_MRP_ODR_TYP() != null) {
					msgKey.setKeyValue("l_MRP_ODR_TYP", key.getl_MRP_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_SUPPLIED_UNIT_DENOMINATOR") && key.getl_SUPPLIED_UNIT_DENOMINATOR() != null) {
					msgKey.setKeyValue("l_SUPPLIED_UNIT_DENOMINATOR", key.getl_SUPPLIED_UNIT_DENOMINATOR());
				}
				if(msgKeyType.containsKeyColumn("l_SUPPLIED_UNIT_NUMERATOR") && key.getl_SUPPLIED_UNIT_NUMERATOR() != null) {
					msgKey.setKeyValue("l_SUPPLIED_UNIT_NUMERATOR", key.getl_SUPPLIED_UNIT_NUMERATOR());
				}
				if(msgKeyType.containsKeyColumn("tmp_VEND_CD") && key.gettmp_VEND_CD() != null) {
					msgKey.setKeyValue("tmp_VEND_CD", key.gettmp_VEND_CD());
				}
				if(msgKeyType.containsKeyColumn("tmp_PLANT_CD") && key.gettmp_PLANT_CD() != null) {
					msgKey.setKeyValue("tmp_PLANT_CD", key.gettmp_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("l_UNIT_QTY_TYP") && key.getl_UNIT_QTY_TYP() != null) {
					msgKey.setKeyValue("l_UNIT_QTY_TYP", key.getl_UNIT_QTY_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_LOT_NO") && key.getl_LOT_NO() != null) {
					msgKey.setKeyValue("l_LOT_NO", key.getl_LOT_NO());
				}
				if(msgKeyType.containsKeyColumn("l_LOT_CONTROL_FLG") && key.getl_LOT_CONTROL_FLG() != null) {
					msgKey.setKeyValue("l_LOT_CONTROL_FLG", key.getl_LOT_CONTROL_FLG());
				}
				if(msgKeyType.containsKeyColumn("readBUSINESS_OPR_DATE") && key.getreadBUSINESS_OPR_DATE() != null) {
					msgKey.setKeyValue("readBUSINESS_OPR_DATE", key.getreadBUSINESS_OPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("readITEM_NAME") && key.getreadITEM_NAME() != null) {
					msgKey.setKeyValue("readITEM_NAME", key.getreadITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("readSUPPLIED_ISSUE_QTY") && key.getreadSUPPLIED_ISSUE_QTY() != null) {
					msgKey.setKeyValue("readSUPPLIED_ISSUE_QTY", key.getreadSUPPLIED_ISSUE_QTY());
				}
				if(msgKeyType.containsKeyColumn("readSTOCK_UNIT") && key.getreadSTOCK_UNIT() != null) {
					msgKey.setKeyValue("readSTOCK_UNIT", key.getreadSTOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("readDISPLAY_NAME") && key.getreadDISPLAY_NAME() != null) {
					msgKey.setKeyValue("readDISPLAY_NAME", key.getreadDISPLAY_NAME());
				}
				if(msgKeyType.containsKeyColumn("readJOB_ODR_DETAIL") && key.getreadJOB_ODR_DETAIL() != null) {
					msgKey.setKeyValue("readJOB_ODR_DETAIL", key.getreadJOB_ODR_DETAIL());
				}
				if(msgKeyType.containsKeyColumn("readLOT_NO") && key.getreadLOT_NO() != null) {
					msgKey.setKeyValue("readLOT_NO", key.getreadLOT_NO());
				}
				if(msgKeyType.containsKeyColumn("readVEND_NAME") && key.getreadVEND_NAME() != null) {
					msgKey.setKeyValue("readVEND_NAME", key.getreadVEND_NAME());
				}
				if(msgKeyType.containsKeyColumn("h_MODIFY_COUNT") && key.geth_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("h_MODIFY_COUNT", key.geth_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("readPUCH_ITEM_CD") && key.getreadPUCH_ITEM_CD() != null) {
					msgKey.setKeyValue("readPUCH_ITEM_CD", key.getreadPUCH_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("ACPT_RSLT_COUNT") && key.getACPT_RSLT_COUNT() != null) {
					msgKey.setKeyValue("ACPT_RSLT_COUNT", key.getACPT_RSLT_COUNT());
				}
				if(msgKeyType.containsKeyColumn("SUM_OF_TOTAL_ISSUE_QTY") && key.getSUM_OF_TOTAL_ISSUE_QTY() != null) {
					msgKey.setKeyValue("SUM_OF_TOTAL_ISSUE_QTY", key.getSUM_OF_TOTAL_ISSUE_QTY());
				}
				if(msgKeyType.containsKeyColumn("THIS_MONTH") && key.getTHIS_MONTH() != null) {
					msgKey.setKeyValue("THIS_MONTH", key.getTHIS_MONTH());
				}
				if(msgKeyType.containsKeyColumn("INSTALL_FLG") && key.getINSTALL_FLG() != null) {
					msgKey.setKeyValue("INSTALL_FLG", key.getINSTALL_FLG());
				}
				if(msgKeyType.containsKeyColumn("ONEROUS_FLG") && key.getONEROUS_FLG() != null) {
					msgKey.setKeyValue("ONEROUS_FLG", key.getONEROUS_FLG());
				}
				if(msgKeyType.containsKeyColumn("SUPPLIED_DATE") && key.getSUPPLIED_DATE() != null) {
					msgKey.setKeyValue("SUPPLIED_DATE", key.getSUPPLIED_DATE());
				}
				if(msgKeyType.containsKeyColumn("PAST_RESULT_ENTRY_TYP") && key.getPAST_RESULT_ENTRY_TYP() != null) {
					msgKey.setKeyValue("PAST_RESULT_ENTRY_TYP", key.getPAST_RESULT_ENTRY_TYP());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_INST_CD") && key.getISSUE_INST_CD() != null) {
					msgKey.setKeyValue("ISSUE_INST_CD", key.getISSUE_INST_CD());
				}
				if(msgKeyType.containsKeyColumn("readQTY") && key.getreadQTY() != null) {
					msgKey.setKeyValue("readQTY", key.getreadQTY());
				}
				if(msgKeyType.containsKeyColumn("BEST_BEFORE_DATE") && key.getBEST_BEFORE_DATE() != null) {
					msgKey.setKeyValue("BEST_BEFORE_DATE", key.getBEST_BEFORE_DATE());
				}
				if(msgKeyType.containsKeyColumn("NEXTVAL") && key.getNEXTVAL() != null) {
					msgKey.setKeyValue("NEXTVAL", key.getNEXTVAL());
				}
				if(msgKeyType.containsKeyColumn("setSEQ_NO") && key.getsetSEQ_NO() != null) {
					msgKey.setKeyValue("setSEQ_NO", key.getsetSEQ_NO());
				}
				if(msgKeyType.containsKeyColumn("setSPENT_QTY") && key.getsetSPENT_QTY() != null) {
					msgKey.setKeyValue("setSPENT_QTY", key.getsetSPENT_QTY());
				}
				if(msgKeyType.containsKeyColumn("SEQ_NO") && key.getSEQ_NO() != null) {
					msgKey.setKeyValue("SEQ_NO", key.getSEQ_NO());
				}
				if(msgKeyType.containsKeyColumn("readSUM_QTY") && key.getreadSUM_QTY() != null) {
					msgKey.setKeyValue("readSUM_QTY", key.getreadSUM_QTY());
				}
				if(msgKeyType.containsKeyColumn("readACPT_NO") && key.getreadACPT_NO() != null) {
					msgKey.setKeyValue("readACPT_NO", key.getreadACPT_NO());
				}
				if(msgKeyType.containsKeyColumn("readACPT_DATE") && key.getreadACPT_DATE() != null) {
					msgKey.setKeyValue("readACPT_DATE", key.getreadACPT_DATE());
				}
				if(msgKeyType.containsKeyColumn("readACPT_QTY") && key.getreadACPT_QTY() != null) {
					msgKey.setKeyValue("readACPT_QTY", key.getreadACPT_QTY());
				}
				if(msgKeyType.containsKeyColumn("RSLT_CTL_SEQ_NO") && key.getRSLT_CTL_SEQ_NO() != null) {
					msgKey.setKeyValue("RSLT_CTL_SEQ_NO", key.getRSLT_CTL_SEQ_NO());
				}
				if(msgKeyType.containsKeyColumn("BEST_BEFORE_DATE_CHECK_FLG") && key.getBEST_BEFORE_DATE_CHECK_FLG() != null) {
					msgKey.setKeyValue("BEST_BEFORE_DATE_CHECK_FLG", key.getBEST_BEFORE_DATE_CHECK_FLG());
				}
				if(msgKeyType.containsKeyColumn("BBD_c_FLG") && key.getBBD_c_FLG() != null) {
					msgKey.setKeyValue("BBD_c_FLG", key.getBBD_c_FLG());
				}
				if(msgKeyType.containsKeyColumn("LOT_NO_PARENT") && key.getLOT_NO_PARENT() != null) {
					msgKey.setKeyValue("LOT_NO_PARENT", key.getLOT_NO_PARENT());
				}
				if(msgKeyType.containsKeyColumn("w_ACPT_NO") && key.getw_ACPT_NO() != null) {
					msgKey.setKeyValue("w_ACPT_NO", key.getw_ACPT_NO());
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
				if(msgKeyType.containsKeyColumn("l_COUNT") && key.getl_COUNT() != null) {
					msgKey.setKeyValue("l_COUNT", key.getl_COUNT());
				}
				if(msgKeyType.containsKeyColumn("ROW_COUNT") && key.getROW_COUNT() != null) {
					msgKey.setKeyValue("ROW_COUNT", key.getROW_COUNT());
				}
				if(msgKeyType.containsKeyColumn("SEL_STOCK_ON_HAND_QTY") && key.getSEL_STOCK_ON_HAND_QTY() != null) {
					msgKey.setKeyValue("SEL_STOCK_ON_HAND_QTY", key.getSEL_STOCK_ON_HAND_QTY());
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
					AE0060020Struct key = new AE0060020Struct();
					if(msgKeyType.containsKeyColumn("l_ACPT_STS_TYP_DN")) {
						key.setl_ACPT_STS_TYP_DN(msgKey.getKeyValue("l_ACPT_STS_TYP_DN"));
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
					if(msgKeyType.containsKeyColumn("INSPC_CMPLT_FLG_DN")) {
						key.setINSPC_CMPLT_FLG_DN(msgKey.getKeyValue("INSPC_CMPLT_FLG_DN"));
					}
					if(msgKeyType.containsKeyColumn("SelectUnitCostFlag")) {
						key.setSelectUnitCostFlag(msgKey.getKeyValue("SelectUnitCostFlag"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP_DN")) {
						key.setUNIT_QTY_TYP_DN(msgKey.getKeyValue("UNIT_QTY_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("SUPPLIED_ISSUE_QTY")) {
						key.setSUPPLIED_ISSUE_QTY(msgKey.getKeyValue("SUPPLIED_ISSUE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("TOTAL_ISSUE_QTY")) {
						key.setTOTAL_ISSUE_QTY(msgKey.getKeyValue("TOTAL_ISSUE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_ON_HAND_QTY")) {
						key.setSTOCK_ON_HAND_QTY(msgKey.getKeyValue("STOCK_ON_HAND_QTY"));
					}
					if(msgKeyType.containsKeyColumn("PART_SUPPLIED_COMMENT")) {
						key.setPART_SUPPLIED_COMMENT(msgKey.getKeyValue("PART_SUPPLIED_COMMENT"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP")) {
						key.setMRP_ODR_TYP(msgKey.getKeyValue("MRP_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("SUPPLIED_UNIT_NUMERATOR")) {
						key.setSUPPLIED_UNIT_NUMERATOR(msgKey.getKeyValue("SUPPLIED_UNIT_NUMERATOR"));
					}
					if(msgKeyType.containsKeyColumn("SUPPLIED_UNIT_DENOMINATOR")) {
						key.setSUPPLIED_UNIT_DENOMINATOR(msgKey.getKeyValue("SUPPLIED_UNIT_DENOMINATOR"));
					}
					if(msgKeyType.containsKeyColumn("l_HAND_QTY")) {
						key.setl_HAND_QTY(msgKey.getKeyValue("l_HAND_QTY"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT1")) {
						key.setSTOCK_UNIT1(msgKey.getKeyValue("STOCK_UNIT1"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT2")) {
						key.setSTOCK_UNIT2(msgKey.getKeyValue("STOCK_UNIT2"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT3")) {
						key.setSTOCK_UNIT3(msgKey.getKeyValue("STOCK_UNIT3"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT4")) {
						key.setSTOCK_UNIT4(msgKey.getKeyValue("STOCK_UNIT4"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT5")) {
						key.setSTOCK_UNIT5(msgKey.getKeyValue("STOCK_UNIT5"));
					}
					if(msgKeyType.containsKeyColumn("l_SUPPLIED_RE_QTY")) {
						key.setl_SUPPLIED_RE_QTY(msgKey.getKeyValue("l_SUPPLIED_RE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("h_ACPT_QTY")) {
						key.seth_ACPT_QTY(msgKey.getKeyValue("h_ACPT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("h_ACPT_DATE")) {
						key.seth_ACPT_DATE(msgKey.getKeyValue("h_ACPT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("h_TOTAL_ISSUE_QTY")) {
						key.seth_TOTAL_ISSUE_QTY(msgKey.getKeyValue("h_TOTAL_ISSUE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("h_SUPPLIED_DATE")) {
						key.seth_SUPPLIED_DATE(msgKey.getKeyValue("h_SUPPLIED_DATE"));
					}
					if(msgKeyType.containsKeyColumn("h_PART_SUPPLIED_COMMENT")) {
						key.seth_PART_SUPPLIED_COMMENT(msgKey.getKeyValue("h_PART_SUPPLIED_COMMENT"));
					}
					if(msgKeyType.containsKeyColumn("h_PUCH_ODR_CD")) {
						key.seth_PUCH_ODR_CD(msgKey.getKeyValue("h_PUCH_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP2")) {
						key.setUNIT_QTY_TYP2(msgKey.getKeyValue("UNIT_QTY_TYP2"));
					}
					if(msgKeyType.containsKeyColumn("h_ODR_CANCEL_SLIP_ISS_FLG")) {
						key.seth_ODR_CANCEL_SLIP_ISS_FLG(msgKey.getKeyValue("h_ODR_CANCEL_SLIP_ISS_FLG"));
					}
					if(msgKeyType.containsKeyColumn("c_CANCEL")) {
						key.setc_CANCEL(msgKey.getKeyValue("c_CANCEL"));
					}
					if(msgKeyType.containsKeyColumn("h_ACPT_RSLT_COUNT")) {
						key.seth_ACPT_RSLT_COUNT(msgKey.getKeyValue("h_ACPT_RSLT_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD_DW")) {
						key.setITEM_CD_DW(msgKey.getKeyValue("ITEM_CD_DW"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_NAME_DW")) {
						key.setITEM_NAME_DW(msgKey.getKeyValue("ITEM_NAME_DW"));
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
					if(msgKeyType.containsKeyColumn("h_LINEUPDATE_FLG_1")) {
						key.seth_LINEUPDATE_FLG_1(msgKey.getKeyValue("h_LINEUPDATE_FLG_1"));
					}
					if(msgKeyType.containsKeyColumn("h_LINEUPDATE_FLG")) {
						key.seth_LINEUPDATE_FLG(msgKey.getKeyValue("h_LINEUPDATE_FLG"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD_LOT")) {
						key.setITEM_CD_LOT(msgKey.getKeyValue("ITEM_CD_LOT"));
					}
					if(msgKeyType.containsKeyColumn("JudgeFlg")) {
						key.setJudgeFlg(msgKey.getKeyValue("JudgeFlg"));
					}
					if(msgKeyType.containsKeyColumn("h_LOTCTRL")) {
						key.seth_LOTCTRL(msgKey.getKeyValue("h_LOTCTRL"));
					}
					if(msgKeyType.containsKeyColumn("h_LOT_NO")) {
						key.seth_LOT_NO(msgKey.getKeyValue("h_LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("h_BUSINESS_OPR_DATE")) {
						key.seth_BUSINESS_OPR_DATE(msgKey.getKeyValue("h_BUSINESS_OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("HOME_DECIMAL_FIG")) {
						key.setHOME_DECIMAL_FIG(msgKey.getKeyValue("HOME_DECIMAL_FIG"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_CD")) {
						key.setPUCH_ODR_CD(msgKey.getKeyValue("PUCH_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ACPT_NO")) {
						key.setl_ACPT_NO(msgKey.getKeyValue("l_ACPT_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_ACPT_QTY")) {
						key.setl_ACPT_QTY(msgKey.getKeyValue("l_ACPT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_STOCK_UNIT")) {
						key.setl_STOCK_UNIT(msgKey.getKeyValue("l_STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("l_WH_CD")) {
						key.setl_WH_CD(msgKey.getKeyValue("l_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_WH_NAME")) {
						key.setl_WH_NAME(msgKey.getKeyValue("l_WH_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_DLV_CD")) {
						key.setl_DLV_CD(msgKey.getKeyValue("l_DLV_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_UNIT_COST")) {
						key.setl_UNIT_COST(msgKey.getKeyValue("l_UNIT_COST"));
					}
					if(msgKeyType.containsKeyColumn("l_CUR_UNIT")) {
						key.setl_CUR_UNIT(msgKey.getKeyValue("l_CUR_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("l_ACPT_STS_TYP")) {
						key.setl_ACPT_STS_TYP(msgKey.getKeyValue("l_ACPT_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_MODIFY_COUNT")) {
						key.setPUCH_ODR_MODIFY_COUNT(msgKey.getKeyValue("PUCH_ODR_MODIFY_COUNT"));
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
					if(msgKeyType.containsKeyColumn("STOCK_UNIT")) {
						key.setSTOCK_UNIT(msgKey.getKeyValue("STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("TAX_CD")) {
						key.setTAX_CD(msgKey.getKeyValue("TAX_CD"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_START_DATE")) {
						key.setPUCH_ODR_START_DATE(msgKey.getKeyValue("PUCH_ODR_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_COMMENT")) {
						key.setPUCH_ODR_COMMENT(msgKey.getKeyValue("PUCH_ODR_COMMENT"));
					}
					if(msgKeyType.containsKeyColumn("ACPT_NO")) {
						key.setACPT_NO(msgKey.getKeyValue("ACPT_NO"));
					}
					if(msgKeyType.containsKeyColumn("ACPT_MODIFY_COUNT")) {
						key.setACPT_MODIFY_COUNT(msgKey.getKeyValue("ACPT_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("ACPT_QTY")) {
						key.setACPT_QTY(msgKey.getKeyValue("ACPT_QTY"));
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
					if(msgKeyType.containsKeyColumn("INSPC_WH_CD")) {
						key.setINSPC_WH_CD(msgKey.getKeyValue("INSPC_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("INSPC_WH_NAME")) {
						key.setINSPC_WH_NAME(msgKey.getKeyValue("INSPC_WH_NAME"));
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
					if(msgKeyType.containsKeyColumn("COMPANY_CD")) {
						key.setCOMPANY_CD(msgKey.getKeyValue("COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("ROUND_TYP")) {
						key.setROUND_TYP(msgKey.getKeyValue("ROUND_TYP"));
					}
					if(msgKeyType.containsKeyColumn("TAX_ROUND_TYP")) {
						key.setTAX_ROUND_TYP(msgKey.getKeyValue("TAX_ROUND_TYP"));
					}
					if(msgKeyType.containsKeyColumn("BUSINESS_OPR_DATE")) {
						key.setBUSINESS_OPR_DATE(msgKey.getKeyValue("BUSINESS_OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("ODR_CANCEL_CAUSE_CD")) {
						key.setODR_CANCEL_CAUSE_CD(msgKey.getKeyValue("ODR_CANCEL_CAUSE_CD"));
					}
					if(msgKeyType.containsKeyColumn("ODR_CANCEL_SLIP_ISS_FLG")) {
						key.setODR_CANCEL_SLIP_ISS_FLG(msgKey.getKeyValue("ODR_CANCEL_SLIP_ISS_FLG"));
					}
					if(msgKeyType.containsKeyColumn("h_WORK_ODR_CD")) {
						key.seth_WORK_ODR_CD(msgKey.getKeyValue("h_WORK_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_LOT_NUMBERING_TYP")) {
						key.seth_LOT_NUMBERING_TYP(msgKey.getKeyValue("h_LOT_NUMBERING_TYP"));
					}
					if(msgKeyType.containsKeyColumn("h_LOT_CONTROL_FLG")) {
						key.seth_LOT_CONTROL_FLG(msgKey.getKeyValue("h_LOT_CONTROL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("h_FINAL_PROC_FLG")) {
						key.seth_FINAL_PROC_FLG(msgKey.getKeyValue("h_FINAL_PROC_FLG"));
					}
					if(msgKeyType.containsKeyColumn("h_DATE_FLG")) {
						key.seth_DATE_FLG(msgKey.getKeyValue("h_DATE_FLG"));
					}
					if(msgKeyType.containsKeyColumn("LOT_NO")) {
						key.setLOT_NO(msgKey.getKeyValue("LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("ACPT_STS_TYP")) {
						key.setACPT_STS_TYP(msgKey.getKeyValue("ACPT_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("INSPECTED_QTY")) {
						key.setINSPECTED_QTY(msgKey.getKeyValue("INSPECTED_QTY"));
					}
					if(msgKeyType.containsKeyColumn("MODIFY_COUNT")) {
						key.setMODIFY_COUNT(msgKey.getKeyValue("MODIFY_COUNT"));
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
					if(msgKeyType.containsKeyColumn("readWH_CD")) {
						key.setreadWH_CD(msgKey.getKeyValue("readWH_CD"));
					}
					if(msgKeyType.containsKeyColumn("readSUPPLIED_ISSUE_GNR_TYP")) {
						key.setreadSUPPLIED_ISSUE_GNR_TYP(msgKey.getKeyValue("readSUPPLIED_ISSUE_GNR_TYP"));
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
					if(msgKeyType.containsKeyColumn("readSUPPLIED_DATE")) {
						key.setreadSUPPLIED_DATE(msgKey.getKeyValue("readSUPPLIED_DATE"));
					}
					if(msgKeyType.containsKeyColumn("readPART_SUPPLIED_COMMENT")) {
						key.setreadPART_SUPPLIED_COMMENT(msgKey.getKeyValue("readPART_SUPPLIED_COMMENT"));
					}
					if(msgKeyType.containsKeyColumn("readACPT_CRCT_NO")) {
						key.setreadACPT_CRCT_NO(msgKey.getKeyValue("readACPT_CRCT_NO"));
					}
					if(msgKeyType.containsKeyColumn("readINSPC_CRCT_NO")) {
						key.setreadINSPC_CRCT_NO(msgKey.getKeyValue("readINSPC_CRCT_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_ITEM_CD")) {
						key.setl_ITEM_CD(msgKey.getKeyValue("l_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ITEM_NAME")) {
						key.setl_ITEM_NAME(msgKey.getKeyValue("l_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_JOB_ODR_CD")) {
						key.setl_JOB_ODR_CD(msgKey.getKeyValue("l_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("tmp_JOB_ODR_DETAIL_NO")) {
						key.settmp_JOB_ODR_DETAIL_NO(msgKey.getKeyValue("tmp_JOB_ODR_DETAIL_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_SUPPLIED_GNR_TYP")) {
						key.setl_SUPPLIED_GNR_TYP(msgKey.getKeyValue("l_SUPPLIED_GNR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_SUPPLIED_QTY")) {
						key.setl_SUPPLIED_QTY(msgKey.getKeyValue("l_SUPPLIED_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_TOTAL_ISSUE_QTY")) {
						key.setl_TOTAL_ISSUE_QTY(msgKey.getKeyValue("l_TOTAL_ISSUE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_STOCK_UNIT2")) {
						key.setl_STOCK_UNIT2(msgKey.getKeyValue("l_STOCK_UNIT2"));
					}
					if(msgKeyType.containsKeyColumn("l_SUPPLIED_DATE")) {
						key.setl_SUPPLIED_DATE(msgKey.getKeyValue("l_SUPPLIED_DATE"));
					}
					if(msgKeyType.containsKeyColumn("tmp_MRP_ODR_TYP")) {
						key.settmp_MRP_ODR_TYP(msgKey.getKeyValue("tmp_MRP_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_PART_SUPPLIED_COMMENT")) {
						key.setl_PART_SUPPLIED_COMMENT(msgKey.getKeyValue("l_PART_SUPPLIED_COMMENT"));
					}
					if(msgKeyType.containsKeyColumn("l_ISSUE_INST_CD")) {
						key.setl_ISSUE_INST_CD(msgKey.getKeyValue("l_ISSUE_INST_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_MRP_ODR_TYP")) {
						key.setl_MRP_ODR_TYP(msgKey.getKeyValue("l_MRP_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_SUPPLIED_UNIT_DENOMINATOR")) {
						key.setl_SUPPLIED_UNIT_DENOMINATOR(msgKey.getKeyValue("l_SUPPLIED_UNIT_DENOMINATOR"));
					}
					if(msgKeyType.containsKeyColumn("l_SUPPLIED_UNIT_NUMERATOR")) {
						key.setl_SUPPLIED_UNIT_NUMERATOR(msgKey.getKeyValue("l_SUPPLIED_UNIT_NUMERATOR"));
					}
					if(msgKeyType.containsKeyColumn("tmp_VEND_CD")) {
						key.settmp_VEND_CD(msgKey.getKeyValue("tmp_VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("tmp_PLANT_CD")) {
						key.settmp_PLANT_CD(msgKey.getKeyValue("tmp_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_UNIT_QTY_TYP")) {
						key.setl_UNIT_QTY_TYP(msgKey.getKeyValue("l_UNIT_QTY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_LOT_NO")) {
						key.setl_LOT_NO(msgKey.getKeyValue("l_LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_LOT_CONTROL_FLG")) {
						key.setl_LOT_CONTROL_FLG(msgKey.getKeyValue("l_LOT_CONTROL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("readBUSINESS_OPR_DATE")) {
						key.setreadBUSINESS_OPR_DATE(msgKey.getKeyValue("readBUSINESS_OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("readITEM_NAME")) {
						key.setreadITEM_NAME(msgKey.getKeyValue("readITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("readSUPPLIED_ISSUE_QTY")) {
						key.setreadSUPPLIED_ISSUE_QTY(msgKey.getKeyValue("readSUPPLIED_ISSUE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("readSTOCK_UNIT")) {
						key.setreadSTOCK_UNIT(msgKey.getKeyValue("readSTOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("readDISPLAY_NAME")) {
						key.setreadDISPLAY_NAME(msgKey.getKeyValue("readDISPLAY_NAME"));
					}
					if(msgKeyType.containsKeyColumn("readJOB_ODR_DETAIL")) {
						key.setreadJOB_ODR_DETAIL(msgKey.getKeyValue("readJOB_ODR_DETAIL"));
					}
					if(msgKeyType.containsKeyColumn("readLOT_NO")) {
						key.setreadLOT_NO(msgKey.getKeyValue("readLOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("readVEND_NAME")) {
						key.setreadVEND_NAME(msgKey.getKeyValue("readVEND_NAME"));
					}
					if(msgKeyType.containsKeyColumn("h_MODIFY_COUNT")) {
						key.seth_MODIFY_COUNT(msgKey.getKeyValue("h_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("readPUCH_ITEM_CD")) {
						key.setreadPUCH_ITEM_CD(msgKey.getKeyValue("readPUCH_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("ACPT_RSLT_COUNT")) {
						key.setACPT_RSLT_COUNT(msgKey.getKeyValue("ACPT_RSLT_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("SUM_OF_TOTAL_ISSUE_QTY")) {
						key.setSUM_OF_TOTAL_ISSUE_QTY(msgKey.getKeyValue("SUM_OF_TOTAL_ISSUE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("THIS_MONTH")) {
						key.setTHIS_MONTH(msgKey.getKeyValue("THIS_MONTH"));
					}
					if(msgKeyType.containsKeyColumn("INSTALL_FLG")) {
						key.setINSTALL_FLG(msgKey.getKeyValue("INSTALL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("ONEROUS_FLG")) {
						key.setONEROUS_FLG(msgKey.getKeyValue("ONEROUS_FLG"));
					}
					if(msgKeyType.containsKeyColumn("SUPPLIED_DATE")) {
						key.setSUPPLIED_DATE(msgKey.getKeyValue("SUPPLIED_DATE"));
					}
					if(msgKeyType.containsKeyColumn("PAST_RESULT_ENTRY_TYP")) {
						key.setPAST_RESULT_ENTRY_TYP(msgKey.getKeyValue("PAST_RESULT_ENTRY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_INST_CD")) {
						key.setISSUE_INST_CD(msgKey.getKeyValue("ISSUE_INST_CD"));
					}
					if(msgKeyType.containsKeyColumn("readQTY")) {
						key.setreadQTY(msgKey.getKeyValue("readQTY"));
					}
					if(msgKeyType.containsKeyColumn("BEST_BEFORE_DATE")) {
						key.setBEST_BEFORE_DATE(msgKey.getKeyValue("BEST_BEFORE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("NEXTVAL")) {
						key.setNEXTVAL(msgKey.getKeyValue("NEXTVAL"));
					}
					if(msgKeyType.containsKeyColumn("setSEQ_NO")) {
						key.setsetSEQ_NO(msgKey.getKeyValue("setSEQ_NO"));
					}
					if(msgKeyType.containsKeyColumn("setSPENT_QTY")) {
						key.setsetSPENT_QTY(msgKey.getKeyValue("setSPENT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("SEQ_NO")) {
						key.setSEQ_NO(msgKey.getKeyValue("SEQ_NO"));
					}
					if(msgKeyType.containsKeyColumn("readSUM_QTY")) {
						key.setreadSUM_QTY(msgKey.getKeyValue("readSUM_QTY"));
					}
					if(msgKeyType.containsKeyColumn("readACPT_NO")) {
						key.setreadACPT_NO(msgKey.getKeyValue("readACPT_NO"));
					}
					if(msgKeyType.containsKeyColumn("readACPT_DATE")) {
						key.setreadACPT_DATE(msgKey.getKeyValue("readACPT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("readACPT_QTY")) {
						key.setreadACPT_QTY(msgKey.getKeyValue("readACPT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("RSLT_CTL_SEQ_NO")) {
						key.setRSLT_CTL_SEQ_NO(msgKey.getKeyValue("RSLT_CTL_SEQ_NO"));
					}
					if(msgKeyType.containsKeyColumn("BEST_BEFORE_DATE_CHECK_FLG")) {
						key.setBEST_BEFORE_DATE_CHECK_FLG(msgKey.getKeyValue("BEST_BEFORE_DATE_CHECK_FLG"));
					}
					if(msgKeyType.containsKeyColumn("BBD_c_FLG")) {
						key.setBBD_c_FLG(msgKey.getKeyValue("BBD_c_FLG"));
					}
					if(msgKeyType.containsKeyColumn("LOT_NO_PARENT")) {
						key.setLOT_NO_PARENT(msgKey.getKeyValue("LOT_NO_PARENT"));
					}
					if(msgKeyType.containsKeyColumn("w_ACPT_NO")) {
						key.setw_ACPT_NO(msgKey.getKeyValue("w_ACPT_NO"));
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
					if(msgKeyType.containsKeyColumn("l_COUNT")) {
						key.setl_COUNT(msgKey.getKeyValue("l_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("ROW_COUNT")) {
						key.setROW_COUNT(msgKey.getKeyValue("ROW_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("SEL_STOCK_ON_HAND_QTY")) {
						key.setSEL_STOCK_ON_HAND_QTY(msgKey.getKeyValue("SEL_STOCK_ON_HAND_QTY"));
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
