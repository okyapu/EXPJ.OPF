/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AD0050/src/com/nec/jp/orteus/metamorBase/AD0050/AD0050010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AD0050;

import com.nec.jp.orteus.metamorBase.AD0050.*;
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

import java.math.BigDecimal;
import java.text.ParseException;

import com.nec.jp.orteus.expj.flash.Kind;

import com.nec.jp.orteus.metamorBase.common.CollectNumber.CollectNumber;
import com.nec.jp.orteus.metamorBase.common08.LotCtrl.LotCtrl;
import com.nec.jp.orteus.expj.lot.BizCommon;
import com.nec.jp.orteus.expj.pr.rcvissue.process.RcvCancel;
import com.nec.jp.orteus.expj.pr.rcvissue.process.WhAutoIssueProc;
import com.nec.jp.orteus.expj.pr.rcvissue.process.AutoIssue;
import com.nec.jp.orteus.expj.pr.rcvissue.process.WhAutoIssueProc.AutoIssueParam;

//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AD0050010Control
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
	public AD0050010Struct getListvalue(int x) { return (AD0050010Struct)(this.list.get(x)); }	// リストの値を返します。
	public AD0050010Struct getStruct() { return this.struct; }	// Structを返します。
	public AD0050010Struct createStruct() { return new AD0050010Struct(); }	// 新しいStructを作って返します。
	public void setStruct(Object structname) { this.struct.setStruct((AD0050010Struct)structname); }	// Structをセットします。
	public void initializeStruct() { this.struct.initialize(); }	// Structの値を初期化します。

	// CSV出力用リスト
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }

//------------------------------------------------------------------------------
	
	/** [コンボボックスデータ]情報（作業時間単位区分） */
	private ComboStruct _oprTimeUnitTypStruct = new ComboStruct();
	/** システムログメッセージ作成用 */
	private StringBuffer _sysLogMessage;
	/** 一覧表の最大表示件数オーバー時のＥＲＲ表示フラグ */
	private int _screenMoveFlg = 0;

	//保管区別入出庫更新処理タイプ 0:登録 1:更新
	public int _issueExeType = 0;
	/*会社コード*/
	public String _company_cd = null;
	//作業実績更新対象Struct
	private AD0050010Struct rsltStruct = new AD0050010Struct();
	//作業実績保管Struct
	private AD0050010Struct keepRsltStruct = new AD0050010Struct();
	//保管区別入出庫更新対象Struct
	private AD0050010Struct issueStruct = new AD0050010Struct();
	//保管区別入出庫保管Struct
	private AD0050010Struct issueKeepStruct = new AD0050010Struct();
	//品目別仕掛更新対象Struct
	private AD0050010Struct procByItemStruct = new AD0050010Struct();

	/**
	 * 一覧表の最大表示件数オーバー時のＥＲＲ表示フラグの取得
	 * @return 0:ERRなし  1:ERRあり
	 */
	public int getScreenMoveFlg() {
		return _screenMoveFlg;
	}

	/**
	 * 一覧表の最大表示件数オーバー時のＥＲＲ表示フラグの設定
	 * @param cd 一覧表の最大表示件数オーバー時のＥＲＲ表示フラグ
	 */
	public void setScreenMoveFlg(int cd) {
		_screenMoveFlg = cd;
	}

	/**
	 * Orteus標準Structの値を対象Structにコピーします。
	 * @param target コピー対象となるStruct
	 */
	public void setStandardItem(AD0050010Struct target){

		target.setsUser_ID(struct.getsUser_ID());
		target.setsSysdate(struct.getsSysdate());
		target.setsOraganization_CD(struct.getsOrganization_CD());
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
		sysLog.info(emsg, getsysUSER_CD());
	}
	/**
	 * 業務ロジックのワーニングメッセージ設定処理を切り出して関数化
	 * @param code メッセージコード
	 * @param value1 置換文字列１
	 */
	private void setWarningMessage(String code, String value1) {
		ExpjMessage emsg = new ExpjMessage(code, value1);
		msgStruct.addWarn(emsg);
		sysLog.info(emsg, getsysUSER_CD());
	}
	/**
	 * 業務ロジックのワーニングメッセージ設定処理を切り出して関数化
	 * @param code メッセージコード
	 * @param value1 置換文字列１
	 * @param value2 置換文字列２
	 */
	private void setWarningMessage(String code, String value1, String value2) {
		ExpjMessage emsg = new ExpjMessage(code, value1, value2);
		msgStruct.addWarn(emsg);
		sysLog.info(emsg, getsysUSER_CD());
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
	 * @param list メッセージリスト
	 */
	private void setErrorMessage(List list) {
		ExpjMessage emsg;
		if (list != null && !list.isEmpty() && list.size() > 0){
			for(int l = 0; l < list.size(); l++){
				emsg = new ExpjMessage((String)list.get(l));
				msgStruct.addError(emsg);
				sysLog.warning(emsg, getsysUSER_CD());
			}
		}
	}
	/**
	 * 業務ロジックのエラーメッセージ設定処理を切り出して関数化
	 * @param code メッセージコード
	 * @param value1 置換文字列１
	 */
	private void setErrorMessage(String code, String value1) {
		ExpjMessage emsg = new ExpjMessage(code, value1);
		msgStruct.addError(emsg);
		sysLog.warning(emsg, getsysUSER_CD());
	}

    /**
     * エラーメッセージ設定
     * @param メッセージ番号
     * @param 出力メッセージ(List)
     */
    private void setErrorMessage(String messageno, List message)
    {
     ExpjMessage emsg = new ExpjMessage( messageno );
     msgStruct.addError( emsg );
     sysLog.warning(emsg, getsysUSER_CD());
     
     for(int i=0; i<message.size(); i++)
     {
      emsg = new ExpjMessage( "ZZ01006", (String)message.get(i) );
      msgStruct.addError( emsg );
      sysLog.warning(emsg, getsysUSER_CD());
     }
    }
	/**
	 * 業務ロジックのエラーメッセージ設定処理を切り出して関数化
	 * @param db1 データベース項目１
	 * @param value1 置換文字列１
	 */
	private void setSupportMessage(String db1, String value1) {
		_sysLogMessage = new StringBuffer();
		_sysLogMessage.append(db1);
		_sysLogMessage.append(":");
		_sysLogMessage.append(value1);
		ExpjMessage emsg = new ExpjMessage("ZZ01006", _sysLogMessage.toString());
		msgStruct.addError(emsg);
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
	 * 業務ロジックのシステムログ（ワーニング）設定処理を切り出して関数化
	 * @param db1 データベース項目１
	 * @param value1 置換文字列１
	 */
	private void setInfoSysLogMessage(String db1, String value1) {
		_sysLogMessage = new StringBuffer();
		_sysLogMessage.append(db1);
		_sysLogMessage.append(":");
		_sysLogMessage.append(value1);
		ExpjMessage emsg 
				= new ExpjMessage("ZZ01006",_sysLogMessage.toString());
		sysLog.info(emsg, getsysUSER_CD());
	}

	/** リストをクリアします。 */
	private void listClear() {
		if(this.list != null && this.list.size() > 0){
			this.list.clear();
		}
	}
    /** コンボボックスデータ取得用定数　出庫区分 */
    private final static String ISSUE_TYP_PARAMETER_NAME= "ISSUE_TYP"; 

    /** コンボボックスデータ取得用　出庫区分*/
    private ComboStruct ISSUE_TYP = null;
    
    /** コンボボックスデータ取得用定数　手配区分 */
    private final static String MRP_ODR_TYP_PARAMETER_NAME= "MRP_ODR_TYP"; 

    /** コンボボックスデータ取得用　手配区分*/
    private ComboStruct MRP_ODR_TYP = null;
    

    /** コンボボックスデータ取得用　不良理由*/
    private ComboStruct DEFECT_CAUSE_CD = new ComboStruct();
    
    
    /** ロット管理導入済チェック **/
	private boolean lotCtrlFlg = false;
    
    private void othercomboTyp(AD0050010Struct aStruct) {

	 aStruct.setISSUE_TYP_DN(getDisplayName(ISSUE_TYP, aStruct.getISSUE_TYP()));
	 aStruct.setMRP_ODR_TYP_DN(getDisplayName(MRP_ODR_TYP, aStruct.getMRP_ODR_TYP()));
  
	}
	/**
	 * コンボボックスデータから表示説明を取得する
	 * @param combo コンボボックスデータ
	 * @param value コンボボックスデータの値
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
	
	/**
	 * 作業実績保管Structの取得
	 * @return 作業実績保管Struct
	 */
	public AD0050010Struct getKeepRsltStruct() {
		return this.keepRsltStruct;
	}

	/**
	 * 画面数値項目の初期設定をします。
	 */
	private void initializeNumber() {

		this.struct.setACPT_QTY("0.0");
		this.struct.setDEFECT_QTY("0.0");
		this.struct.setPRE_ARRANGEMENT_TIME("0.0");
		this.struct.setOPR_TIME("0.0");
		this.struct.setPOST_ARRANGEMENT_TIME("0.0");
		this.struct.setCESSATION_TIME("0.0");
		this.struct.seth_UNIT_QTY_TYP(Kind.NUMBER);//計量単位
		this.struct.setl_UNIT_QTY_TYP(Kind.NUMBER);//計量単位
	}

	/**
	 * メイン画面項目をクリアします。(key項目以外) 
	 */
	private void initializMain() {

		struct.setOUTPUT_RSLT_CD(null);
		struct.setPLANT_CD(null);
		struct.setITEM_CD(null);
		struct.setWS_CD(null);
		struct.setOPR_DATE(null);
		struct.setWH_CD(null);
		struct.setOUTPUT_RSLT_COMMENT(null);
		struct.setLOT_NO(null);
		struct.setVEND_LOT_NO(null);
		struct.setDEFECT_CAUSE_CD(null);
		struct.setOUTPUT_RSLT_PERSON(null);
		struct.setOPR_TIME_UNIT_TYP(null);
		struct.setCESSATION_CAUSE(null);
		struct.seth_RSLT_MODIFY_COUNT(null);
		struct.setITEM_NAME(null);
		struct.setDRAW_CD(null);
		struct.setSPEC(null);
		struct.seth_UNIT_QTY_TYP(Kind.NUMBER);
		struct.setl_UNIT_QTY_TYP(Kind.NUMBER);
		struct.setSTOCK_UNIT(null);
		struct.setWS_NAME(null);
		struct.setWH_NAME(null);
		struct.setOPR_INST_CD(null);
		struct.seth_WORK_ODR_CD(null);
		struct.setWORK_ODR_DLV_DATE(null);
		struct.setOD_NO(null);
	}

	/**
	 * 数値タイプ項目がnullの場合、0をセットします。
	 * @throws Exception
	 */
	private void zeroSet()
			throws Exception {
		//良品数がnullの場合、0をセット
		if (this.struct.getACPT_QTY() == null 
				|| this.struct.getACPT_QTY().length() == 0) {
			this.struct.setACPT_QTY("0.0");
		}
		//不良品数がnullの場合、0をセット
		if (this.struct.getDEFECT_QTY() == null 
				|| this.struct.getDEFECT_QTY().length() == 0) {
			this.struct.setDEFECT_QTY("0.0");
		}
		//前段取り時間がnullの場合、0をセット
		if (this.struct.getPRE_ARRANGEMENT_TIME() == null 
				|| this.struct.getPRE_ARRANGEMENT_TIME().length() == 0) {
			this.struct.setPRE_ARRANGEMENT_TIME("0.0");
		}
		//作業時間がnullの場合、0をセット
		if (this.struct.getOPR_TIME() == null 
				|| this.struct.getOPR_TIME().length() == 0) {
			this.struct.setOPR_TIME("0.0");
		}
		//後段取り時間がnullの場合、0をセット
		if (this.struct.getPOST_ARRANGEMENT_TIME() == null 
				|| this.struct.getPOST_ARRANGEMENT_TIME().length() == 0) {
			this.struct.setPOST_ARRANGEMENT_TIME("0.0");
		}
		//停止時間がnullの場合、0をセット
		if (this.struct.getCESSATION_TIME() == null 
				|| this.struct.getCESSATION_TIME().length() == 0) {
			this.struct.setCESSATION_TIME("0.0");
		}
	}


	/**
	 * 出庫指示リストを設定します。
	 * @throws FoundationException
	 * @throws SQLException
	 */
	private void setIssueList(List mainIssueList) 
			throws FoundationException, SQLException {

		BigDecimal acptQty = new BigDecimal(struct.getACPT_QTY());
		BigDecimal defectQty = new BigDecimal(struct.getDEFECT_QTY());

		//作業日(日付制御.業務運用日)のセット
		this.struct.setPLANT_CD(getsysPLANT_CD());
		List oprDateList = entity.mSelectDateCtrl.read(conn, struct);
		if (oprDateList.isEmpty()) {
			setErrorMessage("ZZ06001");
			setWarningSysLogMessage("SYS_DATE_CTRL.PLANT_CD", getsysPLANT_CD());
			setReadStatus(ERROR);
			return;
		}
		AD0050010Struct oprDateStruct = new AD0050010Struct();
		oprDateStruct = (AD0050010Struct)oprDateList.get(0);
		setStandardItem(oprDateStruct);
		this.struct.seth_BUSINESS_OPR_DATE(oprDateStruct.geth_BUSINESS_OPR_DATE());


		for (int i = 0; i < mainIssueList.size(); i++ ) {
				
			BigDecimal planSum = acptQty.add(defectQty);
			AD0050010Struct tempIssueStruct = (AD0050010Struct)mainIssueList.get(i);
			setStandardItem(tempIssueStruct);
			//計画使用数量の取得
			int round = Integer.parseInt(tempIssueStruct.getl_UNIT_QTY_TYP());
			BigDecimal denominator = 
					new BigDecimal(tempIssueStruct.getISSUE_INST_UNIT_DENOMINATOR());
			
			BigDecimal numerator = 
					new BigDecimal(tempIssueStruct.getISSUE_INST_UNIT_NUMERATOR());
			


			//ロット管理対象外の場合、あるいは新規登録の場合
			if (tempIssueStruct.getLOT_NO() == null || tempIssueStruct.getLOT_NO().equals("")) {
				if (round == 1) {
					planSum = planSum.multiply(numerator).divide(denominator,0, BigDecimal.ROUND_UP).setScale(1);
				} else {
					planSum = planSum.multiply(numerator).divide(denominator,4, BigDecimal.ROUND_UP);
				}
				// ロット割り当て済みの場合
			} else {
				// [ロット別使用実績]の使用予定数量を計画使用数量に設定
				planSum = new BigDecimal(tempIssueStruct.getSUPPLIED_ISSUE_QTY());
			}
			tempIssueStruct.setTEMP_PLAN_QTY(planSum.toString());
			
			//使用済数量、計画外使用済数量、更新使用数量の取得
			tempIssueStruct.setTEMP_USEOVER_QTY("0.0");
			tempIssueStruct.setTEMP_PLANOUT_QTY("0.0");
			tempIssueStruct.setTEMP_USE_QTY("0.0");
			
			//作業計画番号に出来高実績番号をセット
			List tempList = new ArrayList();
			AD0050010Struct tempStruct = null;
			tempStruct = new AD0050010Struct();
			setStandardItem(tempStruct);
			tempStruct.seth_WORK_ODR_CD(this.struct.getIN_OUTPUT_RSLT_CD());  
			tempStruct.setITEM_CD(tempIssueStruct.getITEM_CD());
			tempStruct.seth_ISSUE_INST_CD(tempIssueStruct.geth_ISSUE_INST_CD());

			// ロット管理対象外の場合、あるいは新規登録の場合
			if (tempIssueStruct.getLOT_NO() == null || tempIssueStruct.getLOT_NO().equals("")) {
				// 保管区別入出庫の検索
				tempList = new ArrayList();
				tempList = entity.mSelectRecvIssue.read(conn, tempStruct);
				if (tempList != null && tempList.size() != 0) {
					tempStruct = (AD0050010Struct) tempList.get(0);
					setStandardItem(tempStruct);
					BigDecimal bdIssue = new BigDecimal(tempStruct.getRCV_ISSUE_QTY());
					tempIssueStruct.setTEMP_USEOVER_QTY(bdIssue.negate().toString());
					if ("0".equals(tempStruct.getcount_RCV_ISSUE())) {
						tempIssueStruct.setTEMP_PLANOUT_QTY("0.0");
						tempIssueStruct.setTEMP_USE_QTY(planSum.toString());
					} else {
						BigDecimal useoverQty = new BigDecimal(tempIssueStruct.getTEMP_USEOVER_QTY());
						BigDecimal planoutQty = (planSum.subtract(useoverQty)).multiply(new BigDecimal(-1));
						tempIssueStruct.setTEMP_PLANOUT_QTY(planoutQty.toString());
						tempIssueStruct.setTEMP_USE_QTY("0.0");
					}
				}
				// ロット割り当て済みの場合
			} else {
				// [ロット別使用実績]の使用済数量を使用済数量に設定
				tempIssueStruct.setTEMP_USEOVER_QTY(tempIssueStruct.getTOTAL_ISSUE_QTY());

				// 計画外使用済数量に計画使用数量-使用済数量、更新使用数量に0を設定
				BigDecimal useoverQty = new BigDecimal(tempIssueStruct.getTEMP_USEOVER_QTY());
				BigDecimal planoutQty = (planSum.subtract(useoverQty)).multiply(new BigDecimal(-1));
				tempIssueStruct.setTEMP_PLANOUT_QTY(planoutQty.toString());
				tempIssueStruct.setTEMP_USE_QTY("0.0");
			}

			//明細用の変数にロット番号設定
			tempIssueStruct.setl_LOT_NO(tempIssueStruct.getLOT_NO());
			
			tempIssueStruct.setRCV_ISSUE_DATE(oprDateStruct.geth_BUSINESS_OPR_DATE());

		}
	}


	/**
	 * 読込み後の項目内容と更新時の項目内容に変更があるかないか比較します。
	 * @param rslt 更新時の項目内容
	 * @param keep 読込み後の項目内容
	 * @return true(変更あり)/false(変更なし)
	 * @throws ParseException
	 */
	private boolean CompareRsltStruct(AD0050010Struct rslt, AD0050010Struct keep) 
			throws ParseException {

		BigDecimal rsltACPT_QTY = new BigDecimal(rslt.getACPT_QTY());
		BigDecimal keepACPT_QTY = new BigDecimal(keep.getACPT_QTY());

		BigDecimal rsltDEFECT_QTY = new BigDecimal(rslt.getDEFECT_QTY());
		BigDecimal keepDEFECT_QTY = new BigDecimal(keep.getDEFECT_QTY());

		Date rsltOPR_DATE = Converter.strToDate(rslt.getOPR_DATE(),Converter.SLASH_DATE);
		Date keepOPR_DATE = Converter.strToDate(keep.getOPR_DATE(),Converter.SLASH_DATE);
		if ((rsltACPT_QTY.compareTo(keepACPT_QTY) != 0) 
				|| (rsltDEFECT_QTY.compareTo(keepDEFECT_QTY) != 0) 
				|| (rsltOPR_DATE.compareTo(keepOPR_DATE) != 0) 
				|| ((rslt.getWH_CD() != null && !rslt.getWH_CD().equals(keep.getWH_CD())) 
				|| (rslt.getWH_CD() == null && keep.getWH_CD() != null) 
				|| (rslt.getWH_CD() != null && keep.getWH_CD() == null)) 
				|| ((rslt.getWS_CD() != null && !rslt.getWS_CD().equals(keep.getWS_CD())) 
				|| (rslt.getWS_CD() == null && keep.getWS_CD() != null) 
				|| (rslt.getWS_CD() != null && keep.getWS_CD() == null))
				|| ((rslt.getLOT_NO() != null && !rslt.getLOT_NO().equals(keep.getLOT_NO())) 
				|| (rslt.getLOT_NO() == null && keep.getLOT_NO() != null) 
				|| (rslt.getLOT_NO() != null && keep.getLOT_NO() == null))) {
			return false;
		}
		return true;
	}

	/**
	 * 自動出庫を呼び出します。
	 * @param sFLG 作業完了フラグ(0:作業未完了 1:作業完了)
	 * @throws SQLException
	 * @throws Exception
	 */
	private void callCommonIssue( String sFLG ) 
			throws SQLException, Exception {

		//自動出庫呼び出し
		BigDecimal bdQty = new BigDecimal("0");
		if (this.rsltStruct.getACPT_QTY()!=null) {
			bdQty = new BigDecimal(this.rsltStruct.getACPT_QTY());
		}
		if (this.rsltStruct.getDEFECT_QTY()!=null) {
			bdQty = bdQty.add(new BigDecimal(this.rsltStruct.getDEFECT_QTY()));
		}
		if (this.rsltStruct.getOPR_CRCT_NO() == null 
				|| this.rsltStruct.getOPR_CRCT_NO().length() == 0) {
			this.rsltStruct.setOPR_CRCT_NO("0");
		}
		
		/********************
		 * 自動出庫処理開始 *
		 *******************/
		WhAutoIssueProc whAutoIssueProc = new WhAutoIssueProc(conn,
				this.sysPLANT_CD,
				this.sysUSER_CD,
				this.sp.getProcId());
		WhAutoIssueProc.AutoIssueParam autoIssueParam = whAutoIssueProc.new AutoIssueParam();
		
		// パラメータのセット
		autoIssueParam.m_WORK_ODR_CD = procByItemStruct.geth_WORK_ODR_CD();
		autoIssueParam.m_WORK_IN_PROC_CD = "";
		autoIssueParam.m_PARTIAL_PRD_NO = Integer.parseInt(this.rsltStruct.getPARTIAL_PRD_NO());
		autoIssueParam.m_OPR_RSLT_CRCT_NO = Integer.parseInt(this.rsltStruct.getOPR_CRCT_NO());
		autoIssueParam.m_PUCH_ODR_CD = "";
		autoIssueParam.m_ACPT_NO = 0;
		autoIssueParam.m_ACPT_RSLT_CRCT_NO = 0;
		autoIssueParam.m_RCV_ISSUE_TYP = 2;
		autoIssueParam.m_RCV_ISSUE_DATE = this.rsltStruct.getOPR_DATE();
		autoIssueParam.m_RCV_ISSUE_RSLT_NO = bdQty.toString();
		autoIssueParam.m_RCV_ISSUE_CMPLT_FLG = Integer.parseInt(sFLG);
		autoIssueParam.m_PLANT_CD = this.sysPLANT_CD;
		
		AutoIssue autoIssue = new AutoIssue(conn,
				this.sysPLANT_CD,this.sysUSER_CD,this.sp.getProcId());
		
		// 自動出庫実行
		boolean result = autoIssue.AutoIssueOpr(autoIssueParam);

		String[] message;
		if(result){
			// 業務アラームがあれば出力する。
			for(int i=0; i<autoIssue.getWarnList().size(); i++){
				message = (String[])autoIssue.getWarnList().get(i);
				setWarningMessage(message[0], message[1]);
			}
		}else{
			// 業務エラーの出力
			for(int i=0; i<autoIssue.getErrorList().size(); i++){
				message = (String[])autoIssue.getErrorList().get(i);
				setErrorMessage(message[0], message[1]);
			}
			return;
		}
	}

	/**
	 * 入庫処理を呼び出します。
	 * @param sFLG 作業完了フラグ(0:作業未完了 1:作業完了)
	 * @throws Exception
	 */
	private void callRcvCancel( String sFLG ) 
			throws Exception {

		//入出庫管理番号採番
		CollectNumber collectNum = 
				new CollectNumber(
					CollectNumber.ISSUE_CD,
					this.sysUSER_CD,
					this.sp.getProcId(),
					this.sysPLANT_CD);
		String no = collectNum.getNo();
		if (no == null || no.length() == 0) {
			//採番結果がない
			setErrorMessage("ZZ01106");
			setReadStatus(ERROR);
			return;
		}
		AD0050010Struct rcvIssueStruct = new AD0050010Struct();
		setStandardItem(rcvIssueStruct);

		rcvIssueStruct.setRCV_ISSUE_CTRL_CD(no);				//入出庫管理番号
		rcvIssueStruct.setRCV_ISSUE_TYP("1");					//入出庫区分
		rcvIssueStruct.setITEM_CD(this.rsltStruct.getITEM_CD());//品目番号
		rcvIssueStruct.setPLANT_CD(this.sysPLANT_CD);			//工場コード
		rcvIssueStruct.setWH_CD(this.rsltStruct.getWH_CD());	//保管区コード
		rcvIssueStruct.setJOB_ODR_CD(null);					//製番
		rcvIssueStruct.setJOB_ODR_DETAIL_NO("0");				//製番枝番
		rcvIssueStruct.setPUCH_ODR_CD(null);					//発注番号
		rcvIssueStruct.setACPT_NO("0");							//受入回数
		rcvIssueStruct.setACPT_RSLT_CRCT_NO("0");				//受入実績訂正回数
		rcvIssueStruct.setINSPEC_RSLT_CRCT_NO("0");				//検査実績訂正回数

		rcvIssueStruct.seth_WORK_ODR_CD(procByItemStruct.geth_WORK_ODR_CD()); //作業計画番号
		rcvIssueStruct.setWORK_IN_PROC_CD(null);							  //仕掛作業コード
		rcvIssueStruct.setPARTIAL_PRD_NO(this.rsltStruct.getPARTIAL_PRD_NO());//分作回数
		rcvIssueStruct.setOPR_RSLT_CRCT_NO(this.rsltStruct.getOPR_CRCT_NO());//作業実績訂正回数
		rcvIssueStruct.seth_ISSUE_INST_CD(null);							  //出庫指示番号
		rcvIssueStruct.setRCV_ISSUE_QTY(this.rsltStruct.getACPT_QTY());	  //入出庫数
		rcvIssueStruct.setRCV_ISSUE_AMOUNT("0");							  //入出庫金額
		rcvIssueStruct.setRCV_ISSUE_DATE(this.rsltStruct.getOPR_DATE());	  //入出庫年月日
		rcvIssueStruct.setRCV_ISSUE_GNR_TYP("11");							  //入出庫発生区分
		rcvIssueStruct.setRCV_ISSUE_ODD_QTY("0");				//入出庫端数
		rcvIssueStruct.setDEFECT_CAUSE_CD(null);				//入出庫不良理由コード
		rcvIssueStruct.setSTOCK_UPD_TYP("1");					//在庫更新区分
		rcvIssueStruct.setRCV_ISSUE_CMPLT_FLG(sFLG);			//入出庫完了フラグ

		rcvIssueStruct.setOD_NO(procByItemStruct.getOD_NO());	//オーダデマンド番号
		rcvIssueStruct.setLOT_NO(this.rsltStruct.getLOT_NO());	//在庫ロット番号
		rcvIssueStruct.setVEND_LOT_NO(null);					//メーカロット番号
		rcvIssueStruct.setRCV_ISSUE_COMMENT(null);				//入出庫備考
		rcvIssueStruct.setCONS_TYP("0");						//支給区分

		// 退避用手持ち在庫数を初期化
		rcvIssueStruct.setSAVE_STOCK_ON_HAND_QTY("0");


		//入庫処理
		RcvCancel RCan = 
				new RcvCancel(conn,rcvIssueStruct.getRCV_ISSUE_CTRL_CD(),this.sysUSER_CD);
		//会社コード
		rcvIssueStruct.setCOMPANY_CD(_company_cd);
		
        //保管区別入出庫登録
		entity.mInsertRecvIssue.create(conn, rcvIssueStruct);
		boolean bRSLT = RCan.execProcess();
        
		if (!bRSLT) {
			//入庫処理失敗
			//throw new Exception();
			setErrorMessage(RCan.getErrorList());
			conn.rollback();
		}
	}	

	/**
	 * システムパラメータ取得
	 */
	private boolean getSysParameter() throws BusinessProcessException, FoundationException {
		boolean b = true;
		try {
			List sysParameterList = entity.mSELECT_SYS_PARAMETER.read(conn, struct);
			if(sysParameterList == null || sysParameterList.isEmpty()) return b;
			AD0050010Struct sysParameterStruct = (AD0050010Struct) sysParameterList.get(0);
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
			AD0050010Struct procExecDateStruct = (AD0050010Struct) procExecDateList.get(0);
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

        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * 読込ボタン押下時に実行される処理です。
	 *
	 */
	public void controlSelect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0050");
		logger.entering("AD0050010Control"+":USER="+struct.getsUser_ID(),"controlSelect");
			//{{user_implement_dev:<controlSelect>


		try {
			//画面初期設定
			initializMain();
			initializeNumber();
			listClear();

			
			//出来高実績検索
			List selectList = entity.mSelect.read(conn, struct);
			if (selectList.isEmpty()) {
				setErrorMessage("ZZ06001");
				setWarningSysLogMessage("T_OUTPUT_RSLT.OUTPUT_RSLT_CD", struct.getIN_OUTPUT_RSLT_CD());//出来高実績.出来高実績番号
				setReadStatus(NOT_FOUND);
				setScreenMoveFlg(1);
				return;
			}

			AD0050010Struct selectStruct = new AD0050010Struct();
			selectStruct = (AD0050010Struct)selectList.get(0);
			setStandardItem(selectStruct);
			selectStruct.setIN_OUTPUT_RSLT_CD(this.struct.getIN_OUTPUT_RSLT_CD());
									
			if (!this.sysPLANT_CD.equals(selectStruct.getPLANT_CD())) {
				setErrorMessage("AD00022");
				setWarningSysLogMessage("T_OUTPUT_RSLT.OUTPUT_RSLT_CD", struct.getIN_OUTPUT_RSLT_CD());//出来高実績.出来高実績番号
				setReadStatus(ERROR);
				setScreenMoveFlg(1);
				return;
			}


			this.struct.setStructM(selectStruct);
			this.keepRsltStruct.setStructM(this.struct);
			int maxLine = sp.getMaxLine(conn,10);//子品目表示件数
			if(maxLine != 0) {
				selectStruct.setROW_COUNT(String.valueOf(maxLine));
			} else {
				selectStruct.setROW_COUNT(null);
			}
			this.list = entity.mSelectIssueCnt.read(conn, selectStruct);
			long rowCount = Long.parseLong(((AD0050010Struct)list.get(0)).getl_COUNT());
			if (maxLine != 0 && rowCount ==maxLine+1) {
				if(list != null && list.size() > 0){
					this.listClear();
				}
				setErrorMessage("AD00065",""+maxLine);
				setWarningSysLogMessage("T_OUTPUT_RSLT.OUTPUT_RSLT_CD", struct.getIN_OUTPUT_RSLT_CD());//出来高実績.出来高実績番号
				setReadStatus(TOO_MANY);
				setScreenMoveFlg(1);
			} else {
			
				//出庫指示リスト取得
				this.list = entity.mSelectIssue.read(conn, selectStruct);
				AD0050010Struct TempStruct;
            	for (int i = 0; i < list.size(); i++) {
		    		TempStruct = (AD0050010Struct)list.get(i);

				    //コンボボックスの取得
				    othercomboTyp(TempStruct);
		    	}
				setIssueList(this.list);
				setReadStatus(NORMAL);
			}
			// 作業日
			struct.seth_OPR_DATE(struct.getOPR_DATE());
			
		} catch (SQLException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;			
		} catch (Exception e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;			
		}


                //}}user_implement_dev:<controlSelect>
		logger.exiting("AD0050010Control"+":USER="+struct.getsUser_ID(),"controlSelect");

		return;
	}

	/**
	 * 登録ボタン押下時に実行される処理です。
	 *
	 */
	public void controlInsert10() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0050");
		logger.entering("AD0050010Control"+":USER="+struct.getsUser_ID(),"controlInsert10");
			//{{user_implement_dev:<controlInsert10>


		try {
			// 生産側の過去の実績入力の制限チェック
			if(getSysParameter() == false){
				if(chkProcExecDate("1","",struct.getOPR_DATE()) == false){
					setErrorMessage(ProcExecDateError);
					setErrorParameter("SYS_ACTUAL_COST_CTRL_AC", "PLANT_CD", struct.getPLANT_CD());
					setErrorParameter("SYS_ACTUAL_COST_CTRL_AC", "PROC_EXEC_DATE", struct.getPROC_EXEC_DATE().toString());
					return;
				}
			}
			
			//数値タイプ項目がNULLの場合ZEROをセットする
			zeroSet();

			AD0050010Struct insertStruct = new AD0050010Struct();
			insertStruct.setStructM(this.struct);
			setStandardItem(insertStruct);

			AD0050010Struct tempStruct = new AD0050010Struct();
			String unitQtyTyp = null;
			
			//品目番号存在チェック※存在しなければエラー
			List tempList = new ArrayList();			
			tempList = entity.mSelectItem.read(conn, this.struct);
			if (tempList.isEmpty()) {
				setErrorMessage("AD00019");
				setWarningSysLogMessage("M_ITEM.ITEM_CD", this.struct.getITEM_CD());//品目.品目番号
			} else {
				tempStruct = (AD0050010Struct)tempList.get(0);
				setStandardItem(tempStruct);
			
				// 品目名、図面番号、規格、単位セット、ロット番号採番区分、ロット管理フラグ
				insertStruct.setITEM_NAME(tempStruct.getITEM_NAME());
				insertStruct.setDRAW_CD(tempStruct.getDRAW_CD());
				insertStruct.setSPEC(tempStruct.getSPEC());
				insertStruct.setSTOCK_UNIT(tempStruct.getSTOCK_UNIT());
				insertStruct.setLOT_NUMBERING_TYP(tempStruct.getLOT_NUMBERING_TYP());
				insertStruct.setLOT_CTRL_FLG(tempStruct.getLOT_CTRL_FLG());

				unitQtyTyp = tempStruct.geth_UNIT_QTY_TYP() ;  //在庫数単位区分セットする
				
			}
			
							
			//作業区コード存在チェック※存在しなければエラー
			tempList = new ArrayList();
			tempList = entity.mSelectChkWsCd.read(conn,this.struct);
			if (tempList.isEmpty()) {
				setErrorMessage("AD20029");
				setWarningSysLogMessage("M_WS.WS_CD", this.struct.getWS_CD());//作業区.作業区コード
			} else {
				tempStruct = new AD0050010Struct();
				tempStruct = (AD0050010Struct)tempList.get(0);
				setStandardItem(tempStruct);
			
				//作業区コードの工場コードとログインユーザの工場コードチェック※不一致はエラー
				if (!this.sysPLANT_CD.equals(tempStruct.getPLANT_CD())) {
					setErrorMessage("AD00004");
					setWarningSysLogMessage("M_WS.WS_CD", this.struct.getWS_CD());//作業区.作業区コード
				}
				//作業区名セット
				insertStruct.setWS_NAME(tempStruct.getWS_NAME());
			}
			
			
				
			//保管区コード存在チェック※存在しなければエラー
			tempList = new ArrayList();
			tempList = entity.mSelectChkWhCd.read(conn, this.struct);
			if (tempList.isEmpty()) {
				setErrorMessage("AD00020");
				setWarningSysLogMessage("M_WH.WH_CD", this.struct.getWH_CD());//保管区.保管区コード
			} else {
				tempStruct = new AD0050010Struct();
				tempStruct = (AD0050010Struct)tempList.get(0);
				setStandardItem(tempStruct);

				//保管区コードの工場コードとログインユーザの工場コードチェック※不一致はエラー
				if (!this.sysPLANT_CD.equals(tempStruct.getPLANT_CD())) {
					setErrorMessage("AD00021");
					setWarningSysLogMessage("M_WH.WH_CD", this.struct.getWH_CD());//保管区.保管区コード
				}
			
				//保管区名セット
				insertStruct.setWH_NAME(tempStruct.getWH_NAME());
			}
			
			
			//品目別仕掛存在チェック※以下の条件のデータが存在しない場合はエラー
			//品目番号＝画面の品目番号、作業実績区分＝１、作業状態区分≧２、
			//工場コード＝ユーザの所属する工場コード
			this.struct.setPLANT_CD(this.sysPLANT_CD);
			tempList = new ArrayList();
			tempList = entity.mSelectChkProcByItem.read(conn, this.struct);
			
			if (tempList.isEmpty()) {
				setErrorMessage("ZZ06001");
				setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.ITEM_CD", this.struct.getITEM_CD());//品目別仕掛.品目番号
				setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.PLANT_CD", this.struct.getPLANT_CD());//品目別仕掛.工場コード
			}

			// ロット管理フラグ = 1(ロットトレース管理を行う。)の場合
			if("1".equals(insertStruct.getLOT_CTRL_FLG())){
				BigDecimal acptQty = new BigDecimal(insertStruct.getACPT_QTY());

				//良品数 > 0の場合
				if (acptQty.doubleValue() > 0){
					//ロット番号採番区分 = 0(自動採番しない)の場合
					if(insertStruct.getLOT_NUMBERING_TYP().equals("0")){
						//在庫ロット番号が未入力の場合
						if (insertStruct.getLOT_NO() == null || insertStruct.getLOT_NO().equals("")){
							setErrorMessage("AE20600");
							setWarningSysLogMessage("M_ITEM.ITEM_CD", insertStruct.getITEM_CD());//品目.品目番号
						} else {
							//ロット管理検索
							tempList = entity.mT_LOT_CTRL.read(conn,insertStruct);

							//[ロット管理]に存在しない場合
							if(tempList == null || tempList.size() == 0){
								setErrorMessage("AE20603");
								setWarningSysLogMessage("T_LOT_CTRL.LOT_NO", insertStruct.getLOT_NO());
							}
						}
					//ロット番号採番区分 = 0(自動採番しない)でない場合
					}else{
						//ロット番号がnullの場合
						if (this.struct.getLOT_NO() == null || "".equals(this.struct.getLOT_NO())) {
							// 在庫ロット番号の自動採番を行う。
							BizCommon bc = new BizCommon(conn, getsysUSER_CD(), sp.getProcId(), getsysPLANT_CD());
							List retList = bc.getsetLotNumberingFd(insertStruct.getITEM_CD(), insertStruct.getOPR_DATE());

							//正常終了の場合
							if(bc.getResultStatus().intValue() == 1){
								//在庫ロット番号の取得
								if(retList != null && retList.size() > 0){
									String result1 = (String)retList.get(0);
									insertStruct.setLOT_NO(result1);
								}
								//警告 or 異常終了の場合
							}else{
								//エラーメッセージの取得
								if(retList != null && retList.size() > 1){
									String result2 = (String)retList.get(1);
									setErrorMessage(result2);
								}
							}
							//更新前のロット番号がnullでない場合
						} else {
							//ロット管理検索
							tempList = entity.mT_LOT_CTRL.read(conn,this.struct);
							//[ロット管理]に存在しない場合
							if(tempList == null || tempList.size() == 0){
								setErrorMessage("AE20603");
								setWarningSysLogMessage("T_LOT_CTRL.LOT_NO", this.struct.getLOT_NO());
							}
						}
					}
				}
			// ロット管理フラグ = 1(ロットトレース管理を行う。)でない場合
			} else {
				//在庫ロット番号が入力されている場合
				if (insertStruct.getLOT_NO() != null && !insertStruct.getLOT_NO().equals("")){
					setErrorMessage("AE20601");
					setWarningSysLogMessage("M_ITEM.ITEM_CD", insertStruct.getITEM_CD());//品目.品目番号
				}
			}

			// エラーがあれば終了
			if (msgStruct.hasError()) {
				return;
			}


			BigDecimal inAcptQty	= new BigDecimal(this.struct.getACPT_QTY());
			BigDecimal inAcptQty2   = new BigDecimal("0");
			BigDecimal inDefectQty  = new BigDecimal(this.struct.getDEFECT_QTY());
			BigDecimal inDefectQty2 = new BigDecimal("0");
			
			if (unitQtyTyp != null && "1".equals(unitQtyTyp)) {
				inAcptQty2 = inAcptQty.setScale(0,BigDecimal.ROUND_DOWN);
				inDefectQty2 = inDefectQty.setScale(0,BigDecimal.ROUND_DOWN);
				//切り下げ処理前と後で値が異なっていたら小数が入力されていたと判断しワーニングとする
				if ( (inAcptQty.doubleValue() != inAcptQty2.doubleValue())
						|| (inDefectQty.doubleValue() != inDefectQty2.doubleValue() )) {
					//品目が整数管理品の場合で小数が入力された場合ワーニング
					setWarningMessage("AD00087");
					setInfoSysLogMessage("ITEM_CD", this.struct.getITEM_CD());//品目番号		
					setInfoSysLogMessage("ACPT_QTY", inAcptQty.toString());//良品数			
					setInfoSysLogMessage("DEFECT_QTY", inDefectQty.toString());//不良数			

					insertStruct.setACPT_QTY(inAcptQty2.toString());
					insertStruct.setDEFECT_QTY(inDefectQty2.toString());
				}
			}
			
			//出来高実績番号の自動採番
			CollectNumber collectNum = 
					new CollectNumber(CollectNumber.OUT_RSLT_CD,
						this.sysUSER_CD,
						this.sp.getProcId(),
						this.sysPLANT_CD);
			String no = collectNum.getNo();
			if (no == null || no.length() == 0) {
				//採番結果がない
				setErrorMessage("ZZ01106");
				setReadStatus(ERROR);
				return;
			}
			insertStruct.setOUTPUT_RSLT_CD(no);
			
			//出来高実績の登録
			entity.mInsertOutputRslt.create(conn, insertStruct);
			this.struct.setStructM(insertStruct);


			//実績計上処理
			tempList = new ArrayList();
			tempList = entity.mSelectTargetProcByItem.read(conn, this.struct);
			//対象データが存在しない場合
			if (tempList.isEmpty()) {
			
				//最遅納期の完了済み品目別仕掛に全数を計上する。
				List temp2List = entity.mSelectCompleteProcByItem.read(conn,this.struct);
				if (temp2List.isEmpty()) {
					setErrorMessage("ZZ01101");
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.ITEM_CD", this.struct.getITEM_CD());//品目別仕掛.品目番号
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.PLANT_CD", this.struct.getPLANT_CD());//品目別仕掛.工場コード
					setReadStatus(ERROR);
					struct.setLOT_NO(null);
					return;
				}
				//品目別仕掛をセットする
				procByItemStruct = new AD0050010Struct();
				procByItemStruct = (AD0050010Struct)temp2List.get(0);
				setStandardItem(procByItemStruct);
				
				this.rsltStruct = new AD0050010Struct();
				setStandardItem(this.rsltStruct);
				this.rsltStruct.setOPR_INST_CD(procByItemStruct.getOPR_INST_CD()); //作業指示番号

				//最大分作回数＋１のセット
				List temp3List = entity.mSelectMaxPrdNo.read(conn, this.rsltStruct);

				//検索結果は必ずある
				AD0050010Struct temp3Struct = (AD0050010Struct)temp3List.get(0);
				setStandardItem(temp3Struct);
				this.rsltStruct.setPARTIAL_PRD_NO(temp3Struct.getPARTIAL_PRD_NO());//分作回数
				this.rsltStruct.setITEM_CD(this.struct.getITEM_CD());	//品目番号
				this.rsltStruct.setWS_CD(this.struct.getWS_CD());		//作業区コード
				this.rsltStruct.setACPT_QTY(this.struct.getACPT_QTY());//良品数
				this.rsltStruct.setDEFECT_QTY(this.struct.getDEFECT_QTY());//不良数
				this.rsltStruct.setOPR_DATE(this.struct.getOPR_DATE());//作業日
				this.rsltStruct.setWH_CD(this.struct.getWH_CD());		//保管区コード
				this.rsltStruct.setOPR_RSLT_PERSON(null);				//作業者
				this.rsltStruct.setOPR_RSLT_COMMENT(null);			//作業備考
				this.rsltStruct.setOPR_TIME_UNIT_TYP("1");				//作業時間単位区分
				this.rsltStruct.setPRE_ARRANGEMENT_TIME("0");			//前段取時間
				this.rsltStruct.setPOST_ARRANGEMENT_TIME("0");			//後段取時間
				this.rsltStruct.setOPR_TIME("0");						//作業時間
				this.rsltStruct.setCESSATION_TIME("0");				//停止時間
				this.rsltStruct.setCESSATION_CAUSE(null);				//停止理由
				this.rsltStruct.setOUTPUT_RSLT_CD(this.struct.getOUTPUT_RSLT_CD());//出来高実績番号
				this.rsltStruct.setPLANT_CD(this.struct.getPLANT_CD());//工場コード
				this.rsltStruct.setLOT_NO(insertStruct.getLOT_NO());//在庫ロット番号
				this.rsltStruct.setVEND_LOT_NO(this.struct.getVEND_LOT_NO());//メーカロット番号
				this.rsltStruct.setOPR_CRCT_NO("0");					//作業訂正回数
			
				//作業実績の登録
				entity.mInsertOprRslt.create(conn, this.rsltStruct);
			
				AD0050010Struct completeStruct = new AD0050010Struct();
				setStandardItem(completeStruct);
				completeStruct.setWORK_STS_TYP("9");
				completeStruct.seth_WORK_ODR_CD(procByItemStruct.geth_WORK_ODR_CD());
				completeStruct.setOPR_INST_CD(this.rsltStruct.getOPR_INST_CD());

				//同作業指示番号中の最遅作業日の取得（[作業実績]."作業実績作業日"）
				List oprRsltList = entity.mT_OPR_RSLT.read(conn, completeStruct);
				if (oprRsltList.isEmpty()) {
					setErrorMessage("ZZ01101");
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.OPR_INST_CD",this.rsltStruct.getOPR_INST_CD());//作業系列仕掛.作業指示番号
					struct.setLOT_NO(null);
					return;
				}
				tempStruct = (AD0050010Struct)oprRsltList.get(0);
				completeStruct.setWORK_CMPLT_DATE(tempStruct.getOPR_DATE());

				entity.mUpdateProcByItem.update(conn, completeStruct);

				//下位部品の自動出庫処理
				String sFLG = "1";	//作業完了
				this.callCommonIssue(sFLG);
				//入庫処理（保管区別入出庫追加＆入庫処理）
				this.callRcvCancel(sFLG);
			
			} else {
				//画面の良品数
				BigDecimal AcptQty = new BigDecimal(this.struct.getACPT_QTY());
				//実績計上が必要な良品の残数
				BigDecimal TempAcptQty = new BigDecimal(this.struct.getACPT_QTY());
				//画面の不良数
				BigDecimal DefectQty = new BigDecimal(this.struct.getDEFECT_QTY());
				//実績計上が必要な不良の残数
				BigDecimal TempDefectQty = new BigDecimal(this.struct.getDEFECT_QTY());
				//画面の良品数＋不良数
				BigDecimal TotalQty = new BigDecimal("0");
				TotalQty = AcptQty.add(DefectQty) ;
				//実績計上対象の品目別仕掛の作業指示数
				BigDecimal TargetOprInstQty  = new BigDecimal("0");
				//実績計上対象の品目別仕掛の作業指示番号を持つ作業実績のSUM(良品数+不良数)
				BigDecimal SumOprRsltQty	 = new BigDecimal("0");	
				//実績計上対象の品目別仕掛に実績計上できる残数
				BigDecimal TempOprInstQty	= new BigDecimal("0");
				//実績計上が必要な良品残数＋不良残数
				BigDecimal TempSumOprRsltQty = new BigDecimal("0");
			
				int i=0 ;
				int ExitFlg=0 ;		 //while抜け出しフラグOFF
				int CompleteFlg=0 ;	 //品目別仕掛完了フラグOFF
			
			
				while ( i < tempList.size() && ExitFlg == 0 ) {
			
					//対象品目別仕掛をセット
					procByItemStruct = (AD0050010Struct)tempList.get(i);
					setStandardItem(procByItemStruct);
			
					//対象レコードの作業指示数をセット
					TargetOprInstQty = new BigDecimal(procByItemStruct.getOPR_INST_QTY());
			
					//対象品目別仕掛の作業指示番号と同一の作業実績のSUM(良品数＋不良数)取得
					List temp3List = entity.mSelectSumOprRsltQty.read(conn, procByItemStruct);
					if (temp3List.isEmpty()) {
						//作業実績が無いため、SUM(良品数+不良数)はZEROとする
						SumOprRsltQty = new BigDecimal("0");
					} else {
						//品目別仕掛をセットする
						tempStruct = (AD0050010Struct)temp3List.get(0);
						setStandardItem(tempStruct);
						SumOprRsltQty = new BigDecimal(tempStruct.getSUM_OPR_RSLT_QTY());
					}
			
					// 20070611 NES KOIZUMI ADD START
					// 作業指示数が実績数より大きい場合のみ残指示数計算を行う。
					if (TargetOprInstQty.doubleValue() > SumOprRsltQty.doubleValue()){
					//作業指示数-SUM(良品数+不良数)
					TempOprInstQty = TargetOprInstQty.subtract(SumOprRsltQty );
					};
					// 20070611 NES KOIZUMI ADD END
					
                    //　実績計上が必要な数を算出
					TempSumOprRsltQty = TempAcptQty.add(TempDefectQty);
			
					if ( TempSumOprRsltQty.doubleValue() > 0 ) {
						if ( TempOprInstQty.doubleValue() <= TempSumOprRsltQty.doubleValue() ) {
							//作業指示残数＜＝実績計上が必要な数の場合：品目別仕掛完了
			
							if ( i + 1 == tempList.size() ) {
								//品目別仕掛最後の1件であれば残数を全て計上する
								this.rsltStruct.setACPT_QTY(TempAcptQty.toString());	//良品数
								this.rsltStruct.setDEFECT_QTY(TempDefectQty.toString());//不良数
								TempAcptQty	= new BigDecimal("0");		//良品残数ZERO
								TempDefectQty  = new BigDecimal("0");	//不良残数ZERO
								TempOprInstQty = new BigDecimal("0");	//実績残数ZERO
								CompleteFlg = 1 ;						//品目別仕掛完了フラグON
							} else {
								//それ以外は品目別仕掛に計上できる分だけ計上する
								if ( TempOprInstQty.doubleValue() <= TempAcptQty.doubleValue() ) {
			
									this.rsltStruct.setACPT_QTY(
											TempOprInstQty.toString());		//良品数
									this.rsltStruct.setDEFECT_QTY("0.0");	//不良数
									TempAcptQty = 
											TempAcptQty.subtract(TempOprInstQty);//良品残数
									CompleteFlg = 1 ;	//品目別仕掛完了フラグON
								} else {
									//不良も使う
									if ( TempAcptQty.doubleValue() > 0 ) {
										//良品＋不良数で消し込む
										this.rsltStruct.setACPT_QTY(TempAcptQty.toString());
										TempOprInstQty = TempOprInstQty.subtract(TempAcptQty);
										this.rsltStruct.setDEFECT_QTY(TempOprInstQty.toString());
										TempDefectQty =  TempDefectQty.subtract(TempOprInstQty);
										TempAcptQty = new BigDecimal("0");	//良品残数ZERO
										CompleteFlg = 1 ;	//品目別仕掛完了フラグON
									} else {
									//不良数だけで消し込む
										this.rsltStruct.setACPT_QTY("0.0");
										this.rsltStruct.setDEFECT_QTY(TempOprInstQty.toString());
										TempDefectQty =  TempDefectQty.subtract(TempOprInstQty);
										TempAcptQty = new BigDecimal("0");	//良品残数ZERO
										// 20150403 NES CHOEN ADD STR
										CompleteFlg = 1 ;	//品目別仕掛完了フラグON
										// 20150403 NES CHOEN ADD STR
									}
								}
							}
						} else {
							//品目別仕掛が未完了の場合
			
							this.rsltStruct.setACPT_QTY(TempAcptQty.toString());
							this.rsltStruct.setDEFECT_QTY(TempDefectQty.toString());
							TempAcptQty   = new BigDecimal("0");	//良品残数ZERO
							TempDefectQty = new BigDecimal("0");	//不良残数ZERO
							ExitFlg=1;  //while抜け出しフラグON
						}
			
						//作業実績の登録処理
						setStandardItem(rsltStruct);
						this.rsltStruct.setOPR_INST_CD(procByItemStruct.getOPR_INST_CD());//作業指示番号

						//最大分作回数＋１のセット
						temp3List = entity.mSelectMaxPrdNo.read(conn, this.rsltStruct);

						//検索結果は必ずある
						AD0050010Struct temp3Struct = (AD0050010Struct)temp3List.get(0);
						setStandardItem(temp3Struct);

						this.rsltStruct.setPARTIAL_PRD_NO(temp3Struct.getPARTIAL_PRD_NO());//分作回数
						this.rsltStruct.setITEM_CD(this.struct.getITEM_CD());//品目番号
						this.rsltStruct.setWS_CD(this.struct.getWS_CD());	//作業区コード
						this.rsltStruct.setOPR_DATE(this.struct.getOPR_DATE());//作業日
						this.rsltStruct.setWH_CD(this.struct.getWH_CD());	//保管区コード
						this.rsltStruct.setOPR_RSLT_PERSON(null);			//作業者
						this.rsltStruct.setOPR_RSLT_COMMENT(null);		//作業備考
						this.rsltStruct.setOPR_TIME_UNIT_TYP("1");			//作業時間単位区分
						this.rsltStruct.setPRE_ARRANGEMENT_TIME("0");		//前段取時間
						this.rsltStruct.setPOST_ARRANGEMENT_TIME("0");		//後段取時間
						this.rsltStruct.setOPR_TIME("0");					//作業時間
						this.rsltStruct.setCESSATION_TIME("0");			//停止時間
						this.rsltStruct.setCESSATION_CAUSE(null);			//停止理由
						this.rsltStruct.setOUTPUT_RSLT_CD(this.struct.getOUTPUT_RSLT_CD());//出来高実績番号
						this.rsltStruct.setPLANT_CD(this.struct.getPLANT_CD());//工場コード
						this.rsltStruct.setLOT_NO(this.struct.getLOT_NO());//在庫ロット番号
						this.rsltStruct.setVEND_LOT_NO(this.struct.getVEND_LOT_NO());//メーカロット番号
						this.rsltStruct.setOPR_CRCT_NO("0");				//作業訂正回数
			
						//作業実績の登録
						entity.mInsertOprRslt.create(conn, this.rsltStruct);
						String sFLG = "0";	//初期値セット（作業未完了）
						//作業指示数分の実績が計上されていれば品目別仕掛を更新する
						if ( CompleteFlg == 1 ) {
							AD0050010Struct completeStruct = new AD0050010Struct();
							setStandardItem(completeStruct);
							completeStruct.setWORK_STS_TYP("9");
							completeStruct.seth_WORK_ODR_CD(procByItemStruct.geth_WORK_ODR_CD());
							completeStruct.setOPR_INST_CD(this.rsltStruct.getOPR_INST_CD());

							//同作業指示番号中の最遅作業日の取得（[作業実績]."作業実績作業日"）
							List oprRsltList = entity.mT_OPR_RSLT.read(conn, completeStruct);
							if (oprRsltList.isEmpty()) {
								setErrorMessage("ZZ01101");
								setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.OPR_INST_CD",this.rsltStruct.getOPR_INST_CD());//作業系列仕掛.作業指示番号
								struct.setLOT_NO(null);
								return;
							}
							tempStruct = (AD0050010Struct)oprRsltList.get(0);
							completeStruct.setWORK_CMPLT_DATE(tempStruct.getOPR_DATE());

							entity.mUpdateProcByItem.update(conn, completeStruct);
							sFLG = "1";	//作業完了
						}	
			
						//下位部品の自動出庫処理
						this.callCommonIssue(sFLG);
						//入庫処理（保管区別入出庫追加＆入庫処理）
						this.callRcvCancel(sFLG);
						CompleteFlg=0 ;	 //品目別仕掛完了フラグ再度OFF
						i = i + 1 ;
					} else {
					//実績計上が必要な数が０以下なので実績計上は行わない
			
						ExitFlg=1;  //while抜け出しフラグON
					}
				}
			}

			if (msgStruct.hasError()) {
				struct.setLOT_NO(null);
				return;
			}
			//ロット管理フラグ = 1(ロットトレース管理を行う。)の場合
			if(insertStruct.getLOT_CTRL_FLG().equals("1")){
				//在庫ロット番号がNullでない場合
				if(insertStruct.getLOT_NO() != null && !insertStruct.getLOT_NO().equals("")){
					//ロット管理テーブル更新
					entity.mT_LOT_CTRL.update(conn,insertStruct);
				}
			}
			conn.commit();

			this.struct.setIN_OUTPUT_RSLT_CD(no);
				
			//再検索
			controlSelect();

		} catch (SQLException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;			
		} catch (ParseException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;			
		} catch (Exception e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;			
		} finally {
			try {
				if (conn != null) {
					conn.rollback();
				}
			} catch(Exception e) {
				setReadStatus(ERROR);
				ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
				sysLog.severe(emsg, getsysUSER_CD());
				ExpjException ee = new ExpjException(e, emsg);
				throw ee;
			}
		}


                //}}user_implement_dev:<controlInsert10>
		logger.exiting("AD0050010Control"+":USER="+struct.getsUser_ID(),"controlInsert10");

		return;
	}

	/**
	 * 更新ボタン押下時に実行される処理です。
	 *
	 */
	public void controlUpdate10() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0050");
		logger.entering("AD0050010Control"+":USER="+struct.getsUser_ID(),"controlUpdate10");
			//{{user_implement_dev:<controlUpdate10>


		try {
			
			// 生産側の過去の実績入力の制限チェック
			if(getSysParameter() == false){
				if(chkProcExecDate("2",struct.geth_OPR_DATE(),struct.getOPR_DATE()) == false){
					setErrorMessage(ProcExecDateError);
					setErrorParameter("SYS_ACTUAL_COST_CTRL_AC", "PLANT_CD", struct.getPLANT_CD());
					setErrorParameter("SYS_ACTUAL_COST_CTRL_AC", "PROC_EXEC_DATE", struct.getPROC_EXEC_DATE().toString());
					return;
				}
			}
			//数値タイプ項目がNULLの場合ZEROをセットする
			zeroSet();
			
			if (this.struct.getOUTPUT_RSLT_CD() != null 
					&& !this.struct.getOUTPUT_RSLT_CD().equals(
						this.struct.getIN_OUTPUT_RSLT_CD())) {
				setErrorMessage("ZZ01101");
				setWarningSysLogMessage("T_OUTPUT_RSLT.OUTPUT_RSLT_CD", this.struct.getOUTPUT_RSLT_CD());//出来高実績.検索時出来高実績番号
				setWarningSysLogMessage("IN_OUTPUT_RSLT_CD", this.struct.getIN_OUTPUT_RSLT_CD());//更新時出来高実績番号
				return;
			}
			
			AD0050010Struct tempStruct = new AD0050010Struct();
			//作業区コード存在チェック※存在しなければエラー
			List tempList = entity.mSelectChkWsCd.read(conn, this.struct);
			if (tempList.isEmpty()) {
				setErrorMessage("AD20029");
				setWarningSysLogMessage("M_WS.WS_CD", this.struct.getWS_CD());//作業区.作業区コード
			} else {
				tempStruct = (AD0050010Struct)tempList.get(0);
				setStandardItem(tempStruct);
			
				//作業区コードの工場コードとログインユーザの工場コードチェック※不一致はエラー
				if (!this.sysPLANT_CD.equals(tempStruct.getPLANT_CD())) {
					setErrorMessage("AD00004");
					setWarningSysLogMessage("M_WS.WS_CD", this.struct.getWS_CD());//作業区.作業区コード
				}
				//作業区名セット
				this.struct.setWS_NAME(tempStruct.getWS_NAME());
			}
			
				
			//保管区コード存在チェック※存在しなければエラー
			tempList = new ArrayList();
			tempList = entity.mSelectChkWhCd.read(conn, this.struct);
			if (tempList.isEmpty()) {
				setErrorMessage("AD00020");
				setWarningSysLogMessage("M_WH.WH_CD", this.struct.getWH_CD());//保管区.保管区コード
			} else {
				tempStruct = new AD0050010Struct();
				tempStruct = (AD0050010Struct)tempList.get(0);
				setStandardItem(tempStruct);
			
				//保管区コードの工場コードとログインユーザの工場コードチェック※不一致はエラー
				if (!this.sysPLANT_CD.equals(tempStruct.getPLANT_CD())) {
					setErrorMessage("AD00021");
					setWarningSysLogMessage("M_WH.WH_CD", this.struct.getWH_CD());//保管区.保管区コード
				}
				//保管区名セット
				this.struct.setWH_NAME(tempStruct.getWH_NAME());
			}

			// ロット管理フラグ = 1(ロットトレース管理を行う。)の場合
			if(this.struct.getLOT_CTRL_FLG().equals("1")){
				BigDecimal acptQty = new BigDecimal(this.struct.getACPT_QTY());

				//良品数 > 0の場合
				if (acptQty.doubleValue() > 0){
					//ロット番号採番区分 = 0(自動採番しない)の場合
					if(this.struct.getLOT_NUMBERING_TYP().equals("0")){
						//在庫ロット番号が未入力の場合
						if (this.struct.getLOT_NO() == null || this.struct.getLOT_NO().equals("")){
							setErrorMessage("AE20600");
							setWarningSysLogMessage("M_ITEM.ITEM_CD", this.struct.getITEM_CD());//品目.品目番号
						} else {
							//ロット管理検索
							tempList = entity.mT_LOT_CTRL.read(conn,this.struct);

							//[ロット管理]に存在しない場合
							if(tempList == null || tempList.size() == 0){
								setErrorMessage("AE20603");
								setWarningSysLogMessage("T_LOT_CTRL.LOT_NO", this.struct.getLOT_NO());
							}
						}
					//ロット番号採番区分 = 0(自動採番しない)でない場合
					}else{
						//更新前のロット番号がnullの場合
						if (this.keepRsltStruct.getLOT_NO() == null || this.keepRsltStruct.getLOT_NO().equals("")) {
							// 在庫ロット番号の自動採番を行う。
							BizCommon bc = new BizCommon(conn, getsysUSER_CD(), sp.getProcId(), getsysPLANT_CD());
							List retList = bc.getsetLotNumberingFd(this.struct.getITEM_CD(), this.struct.getOPR_DATE());

							//正常終了の場合
							if(bc.getResultStatus().intValue() == 1){
								//在庫ロット番号の取得
								if(retList != null && retList.size() > 0){
									String result1 = (String)retList.get(0);
									this.struct.setLOT_NO(result1);
								}
							//警告 or 異常終了の場合
							}else{
								//エラーメッセージの取得
								if(retList != null && retList.size() > 1){
									String result2 = (String)retList.get(1);
									setErrorMessage(result2);
								}
							}
						//更新前のロット番号がnullでない場合
						} else {
							//更新前のロット番号を引き継ぐ
							this.struct.setLOT_NO(this.keepRsltStruct.getLOT_NO());
						}
					}
				}
			// ロット管理フラグ = 1(ロットトレース管理を行う。)でない場合
			} else {
				//在庫ロット番号が入力されている場合
				if (this.struct.getLOT_NO() != null && !this.struct.getLOT_NO().equals("")){
					setErrorMessage("AE20601");
					setWarningSysLogMessage("M_ITEM.ITEM_CD", this.struct.getITEM_CD());//品目.品目番号
				}
			}


			// エラーがあれば終了
			if (msgStruct.hasError()) {
				struct.setLOT_NO(null);
				return;
			}


			//排他制御＋ModifyCountチェック
			tempList = new ArrayList();
			tempList = entity.mSelectChkOutputRslt.read(conn, this.struct);
			if (tempList.isEmpty()) {
				setErrorMessage("ZZ01101");
				setWarningSysLogMessage("T_OUTPUT_RSLT.OUTPUT_RSLT_CD", this.struct.getOUTPUT_RSLT_CD());//出来高実績.出来高実績番号
				setReadStatus(ERROR);
				struct.setLOT_NO(null);
				return;
			}
			tempStruct = (AD0050010Struct)tempList.get(0);
			setStandardItem(tempStruct);
			if (this.struct.geth_RSLT_MODIFY_COUNT() != null 
					&& !this.struct.geth_RSLT_MODIFY_COUNT().equals(
					tempStruct.geth_RSLT_MODIFY_COUNT())) {
				setErrorMessage("ZZ01105");
				setWarningSysLogMessage("T_OUTPUT_RSLT.OUTPUT_RSLT_CD", this.struct.getOUTPUT_RSLT_CD());//出来高実績.出来高実績番号
				setReadStatus(ERROR);
				struct.setLOT_NO(null);
				return;
			}
			
			//出来高実績更新処理
			entity.mUpdateOutputRslt.update(conn, this.struct);
			
			if (!this.CompareRsltStruct(this.struct, this.keepRsltStruct)) {
				//特定の項目が変更されていた場合のみ、以下の処理を行う
				//前回出力された作業実績のキー値を取得（最後にまとめてZERO更新を行う）

				List zeroList = entity.mSelectModifyZeroOprRslt.read(conn, this.struct);
				if (zeroList.isEmpty()) {
					//前回実績データ無し：エラー
					setErrorMessage("ZZ01101");
					setWarningSysLogMessage("T_OUTPUT_RSLT.OUTPUT_RSLT_CD", this.struct.getOUTPUT_RSLT_CD());//出来高実績.出来高実績番号
					setReadStatus(ERROR);
					struct.setLOT_NO(null);
					return;
				}
			
				//出来高実績番号で実績があがっている品目別仕掛
				//and同品目で完了されていないレコードを検索
				tempList = new ArrayList();
				tempList = entity.mSelectModifyTargetProcByItem.read(conn, this.struct);
				if (tempList.isEmpty()) {
					//計上先無し：エラー
					setErrorMessage("ZZ01101");
					setWarningSysLogMessage("T_OUTPUT_RSLT.OUTPUT_RSLT_CD", this.struct.getOUTPUT_RSLT_CD());//出来高実績.出来高実績番号
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.ITEM_CD", this.struct.getITEM_CD());//品目別仕掛.品目番号
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.PLANT_CD", this.struct.getPLANT_CD());//品目別仕掛.工場コード
					setReadStatus(ERROR);
					struct.setLOT_NO(null);
					return;
				}
			
				//画面の良品数
				BigDecimal AcptQty = new BigDecimal(this.struct.getACPT_QTY());
				//実績計上が必要な良品の残数
				BigDecimal TempAcptQty = new BigDecimal(this.struct.getACPT_QTY());
				//画面の不良数
				BigDecimal DefectQty = new BigDecimal(this.struct.getDEFECT_QTY());
				//実績計上が必要な不良の残数
				BigDecimal TempDefectQty = new BigDecimal(this.struct.getDEFECT_QTY());
				//画面の良品数＋不良数
				BigDecimal TotalQty = new BigDecimal("0");
				TotalQty = AcptQty.add(DefectQty) ;
			
				//実績計上対象の品目別仕掛の作業指示数
				BigDecimal TargetOprInstQty = new BigDecimal("0");
				//実績計上対象の〃品目別仕掛の作業指示番号を持つ作業実績のSUM(良品数+不良数)
				BigDecimal SumOprRsltQty = new BigDecimal("0");
				//実績計上対象の品目別仕掛に実績計上できる残数
				BigDecimal TempOprInstQty = new BigDecimal("0");
				//実績計上が必要な良品残数＋不良残数
				BigDecimal TempSumOprRsltQty = new BigDecimal("0");
			
				int i=0 ;
				int ExitFlg=0 ;		 //while抜け出しフラグOFF
				int CompleteFlg=0 ;	 //品目別仕掛完了フラグOFF
			
				while ( i < tempList.size() && ExitFlg == 0 ) {
					//対象品目別仕掛をセット
					procByItemStruct = (AD0050010Struct)tempList.get(i);
					setStandardItem(procByItemStruct);
			
					//対象レコードの作業指示数をセット
					TargetOprInstQty = new BigDecimal(procByItemStruct.getOPR_INST_QTY());
			
					//対象品目別仕掛の作業指示番号と同一の作業実績の
					//SUM(良品数＋不良数※取り消し分除く)取得
					procByItemStruct.setOUTPUT_RSLT_CD(this.struct.getOUTPUT_RSLT_CD());	//出来高実績番号
					List temp3List = 
							entity.mSelectSumOprRsltQtyExceptCancel.read(conn, procByItemStruct);
					if (temp3List.isEmpty()) {
						//作業実績が無いため、SUM(良品数+不良数)はZEROとする
						SumOprRsltQty = new BigDecimal("0");
					} else {
						//品目別仕掛をセットする
						tempStruct = (AD0050010Struct)temp3List.get(0);
						setStandardItem(tempStruct);
						SumOprRsltQty = new BigDecimal(tempStruct.getSUM_OPR_RSLT_QTY());
					}

					// 20070611 NES KOIZUMI ADD START
					// 作業指示数が実績数より大きい場合のみ残指示数計算を行う。
					if (TargetOprInstQty.doubleValue() > SumOprRsltQty.doubleValue()){
					//作業指示数-SUM(良品数+不良数※取り消し分除く)
					TempOprInstQty = TargetOprInstQty.subtract(SumOprRsltQty);
					}
                    // 20070611 NES KOIZUMI ADD END
			
                    //実績計上が必要な数を算出
					TempSumOprRsltQty = TempAcptQty.add(TempDefectQty);
					
					if ( TempSumOprRsltQty.doubleValue() > 0 ) {
						this.rsltStruct = new AD0050010Struct();
						setStandardItem(rsltStruct);

						if ( TempOprInstQty.doubleValue() <= TempSumOprRsltQty.doubleValue() ) {
							//作業指示残数＜＝実績計上が必要な数の場合：品目別仕掛完了
							
							if ( i + 1 == tempList.size() ) {
								//品目別仕掛最後の1件であれば残数を全て計上する
								this.rsltStruct.setACPT_QTY(TempAcptQty.toString());	//良品数
								this.rsltStruct.setDEFECT_QTY(TempDefectQty.toString());//不良数
								TempAcptQty	= new BigDecimal("0");   //良品残数ZERO
								TempDefectQty  = new BigDecimal("0");//不良残数ZERO
								TempOprInstQty = new BigDecimal("0");//実績残数ZERO
								CompleteFlg = 1;                     //品目別仕掛完了フラグON
							} else {
								//それ以外は品目別仕掛に計上できる分だけ計上する
								if ( TempOprInstQty.doubleValue() <= TempAcptQty.doubleValue() ) {
									this.rsltStruct.setACPT_QTY(TempOprInstQty.toString());
									this.rsltStruct.setDEFECT_QTY("0.0");
									TempAcptQty = TempAcptQty.subtract(TempOprInstQty);
									CompleteFlg = 1 ;	//品目別仕掛完了フラグON
								} else {
									//不良も使う
									if ( TempAcptQty.doubleValue() > 0 ) {
										//良品＋不良数で消し込む
										this.rsltStruct.setACPT_QTY(TempAcptQty.toString());
										TempOprInstQty = TempOprInstQty.subtract(TempAcptQty);
										this.rsltStruct.setDEFECT_QTY(TempOprInstQty.toString());
										TempDefectQty =  TempDefectQty.subtract(TempOprInstQty);
										TempAcptQty = new BigDecimal("0");	//良品残数ZERO
										CompleteFlg = 1 ;	//品目別仕掛完了フラグON
									} else {
										//不良数だけで消し込む
										this.rsltStruct.setACPT_QTY("0.0");
										this.rsltStruct.setDEFECT_QTY(TempOprInstQty.toString());
										TempDefectQty =  TempDefectQty.subtract(TempOprInstQty);
										TempAcptQty = new BigDecimal("0");	//良品残数ZERO
										// 20150403 NES CHOEN ADD STR
										CompleteFlg = 1 ;	//品目別仕掛完了フラグON
										// 20150403 NES CHOEN ADD STR
									}
								}
							}
						} else {
							//品目別仕掛が未完了の場合
							this.rsltStruct.setACPT_QTY(TempAcptQty.toString());
							this.rsltStruct.setDEFECT_QTY(TempDefectQty.toString());
							TempAcptQty   = new BigDecimal("0");	//良品残数ZERO
							TempDefectQty = new BigDecimal("0");	//不良残数ZERO
							ExitFlg=1;  //while抜け出しフラグON
						}
						//作業実績の登録処理
						this.rsltStruct.setOPR_INST_CD(procByItemStruct.getOPR_INST_CD());
						
						//最大分作回数＋１のセット
						temp3List = new ArrayList();
						temp3List = entity.mSelectMaxPrdNo.read(conn, this.rsltStruct);

						//検索結果は必ずある
						AD0050010Struct temp3Struct = (AD0050010Struct)temp3List.get(0);
						setStandardItem(temp3Struct);
						this.rsltStruct.setPARTIAL_PRD_NO(temp3Struct.getPARTIAL_PRD_NO());//分作回数
						this.rsltStruct.setITEM_CD(this.struct.getITEM_CD());//品目番号
						this.rsltStruct.setWS_CD(this.struct.getWS_CD());	//作業区コード
						this.rsltStruct.setOPR_DATE(this.struct.getOPR_DATE());//作業日
						this.rsltStruct.setWH_CD(this.struct.getWH_CD());	//保管区コード
						this.rsltStruct.setOPR_RSLT_PERSON(null);			//作業者
						this.rsltStruct.setOPR_RSLT_COMMENT(null);		//作業備考
						this.rsltStruct.setOPR_TIME_UNIT_TYP("1");			//作業時間単位区分
						this.rsltStruct.setPRE_ARRANGEMENT_TIME("0");		//前段取時間
						this.rsltStruct.setPOST_ARRANGEMENT_TIME("0");		//後段取時間
						this.rsltStruct.setOPR_TIME("0");					//作業時間
						this.rsltStruct.setCESSATION_TIME("0");			//停止時間
						this.rsltStruct.setCESSATION_CAUSE(null);			//停止理由
						this.rsltStruct.setOUTPUT_RSLT_CD(this.struct.getOUTPUT_RSLT_CD());//出来高実績番号
						this.rsltStruct.setPLANT_CD(this.struct.getPLANT_CD());//工場コード
						this.rsltStruct.setLOT_NO(this.struct.getLOT_NO());//在庫ロット番号
						this.rsltStruct.setVEND_LOT_NO(this.struct.getVEND_LOT_NO());//メーカロット番号
						this.rsltStruct.setOPR_CRCT_NO("0");				//作業訂正回数

						//作業実績の登録
						entity.mInsertOprRslt.create(conn, this.rsltStruct);
						String sFLG = "0";	//初期値セット（作業未完了）

						//作業指示数分の実績が計上されていれば品目別仕掛を更新する
						if ( CompleteFlg == 1 ) {
							if (!"9".equals(procByItemStruct.getWORK_STS_TYP())) {
								AD0050010Struct completeStruct = new AD0050010Struct();
								setStandardItem(completeStruct);
								completeStruct.setWORK_STS_TYP("9");
								completeStruct.seth_WORK_ODR_CD(procByItemStruct.geth_WORK_ODR_CD());
								completeStruct.setOPR_INST_CD(this.rsltStruct.getOPR_INST_CD());

								//同作業指示番号中の最遅作業日の取得（[作業実績]."作業実績作業日"）
								List oprRsltList = entity.mT_OPR_RSLT.read(conn, completeStruct);
								if (oprRsltList.isEmpty()) {
									setErrorMessage("ZZ01101");
									setWarningSysLogMessage("T_OUTPUT_RSLT.OUTPUT_RSLT_CD", this.struct.getOUTPUT_RSLT_CD());//出来高実績.出来高実績番号
									setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.OPR_INST_CD",this.rsltStruct.getOPR_INST_CD());//作業系列仕掛.作業指示番号
									return;
								}
								tempStruct = (AD0050010Struct)oprRsltList.get(0);
								completeStruct.setWORK_CMPLT_DATE(tempStruct.getOPR_DATE());

								entity.mUpdateProcByItem.update(conn, completeStruct);

								sFLG = "1";	//作業完了
							}
						}
						//下位部品の自動出庫処理
						this.callCommonIssue(sFLG);
						//入庫処理（保管区別入出庫追加＆入庫処理）
						this.callRcvCancel(sFLG);
			
						CompleteFlg=0 ;	 //品目別仕掛完了フラグ再度OFF
						i = i + 1 ;
					} else {
					//実績計上が必要な数が０以下なので実績計上は行わない
						ExitFlg=1;  //while抜け出しフラグON
					}
				}
			
				//前回分の作業実績の良品数と不良数をZEROに更新する（キャンセルする）
				for (i = 0; i < zeroList.size(); i++ ) {
			
					//対象作業実績をセットする
					AD0050010Struct zerorsltStruct = (AD0050010Struct)zeroList.get(i);
					setStandardItem(zerorsltStruct);
			
					setStandardItem(rsltStruct);
					this.rsltStruct.setOPR_INST_CD(zerorsltStruct.getOPR_INST_CD());
					this.rsltStruct.setPARTIAL_PRD_NO(
							zerorsltStruct.getPARTIAL_PRD_NO());	//ZERO更新対象分作回数
					this.rsltStruct.setOUTPUT_RSLT_CD(this.struct.getOUTPUT_RSLT_CD());
					this.rsltStruct.setACPT_QTY("0.0");			//良品数
					this.rsltStruct.setDEFECT_QTY("0.0");			//不良数
					this.rsltStruct.setOPR_CRCT_NO("1");			//作業訂正回数
					
					entity.mUpdateOprRslt.update(conn, this.rsltStruct);
						
					//対応する品目別仕掛の指示数を取得
					tempList = new ArrayList();
					tempList = entity.mSelectModifyZeroProcByItem.read(conn, this.rsltStruct);
					if (tempList.isEmpty()) {
						setErrorMessage("ZZ01101");
						setWarningSysLogMessage("T_OUTPUT_RSLT.OUTPUT_RSLT_CD", this.struct.getOUTPUT_RSLT_CD());//出来高実績.出来高実績番号
						setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.OPR_INST_CD", this.rsltStruct.getOPR_INST_CD());//品目別仕掛.作業指示番号
						setReadStatus(ERROR);
						struct.setLOT_NO(null);
						return;
					}
					procByItemStruct = new AD0050010Struct();
					procByItemStruct = (AD0050010Struct)tempList.get(0);
					setStandardItem(procByItemStruct);
					
					//対象レコードの指示数をセット
					TargetOprInstQty = new BigDecimal(procByItemStruct.getOPR_INST_QTY());
					//更に対応する計上済み実績数を取得
					//対象品目別仕掛の作業指示番号と同一の作業実績のSUM(良品数＋不良数)取得
					procByItemStruct.setOPR_INST_CD(zerorsltStruct.getOPR_INST_CD());

					List temp3List = entity.mSelectSumOprRsltQty.read(conn, procByItemStruct);
					if (temp3List.isEmpty()) {
						//作業実績が無いため、SUM(良品数+不良数)はZEROとする
						SumOprRsltQty = new BigDecimal("0");
					} else {
						//計上済み実績数をセットする
						tempStruct = (AD0050010Struct)temp3List.get(0);
						setStandardItem(tempStruct);
						SumOprRsltQty = new BigDecimal(tempStruct.getSUM_OPR_RSLT_QTY());
					}
			
					String sFLG = "0";   //初期値セット（作業未完了）
					//指示数＞計上済み実績数の場合、ステータスを戻し、完了日をクリアする
					if ( TargetOprInstQty.doubleValue() > SumOprRsltQty.doubleValue() ) {
						if (!"2".equals(procByItemStruct.getWORK_STS_TYP())) {
							setStandardItem(procByItemStruct);
							procByItemStruct.setWORK_STS_TYP("2");//作業状態区分：２（指示済み）
							procByItemStruct.setWORK_CMPLT_DATE(null);	//完了日：ＮＵＬＬ

							entity.mUpdateProcByItem.update(conn, procByItemStruct);
						}
					} else {
						sFLG = "1";	//作業完了
					}	
					//下位部品の自動出庫処理
					this.callCommonIssue(sFLG);
					//入庫処理（保管区別入出庫追加＆入庫処理）
					this.callRcvCancel(sFLG);
				}

				if (msgStruct.hasError()) {
					struct.setLOT_NO(null);
					return;
				}
			//ロット管理フラグ = 1(ロットトレース管理を行う。)の場合
			if(this.struct.getLOT_CTRL_FLG().equals("1")){
				//在庫ロット番号がNullでない場合
				if(this.rsltStruct.getLOT_NO() != null && !this.rsltStruct.getLOT_NO().equals("")){
					//ロット番号が変更された場合
					if (!this.rsltStruct.getLOT_NO().equals(this.keepRsltStruct.getLOT_NO())) {
						//ロット別使用実績取得
						AD0050010Struct tempSelectStruct = new AD0050010Struct();
						tempSelectStruct.setIN_OUTPUT_RSLT_CD(this.struct.getIN_OUTPUT_RSLT_CD());
						tempList = entity.mT_LOT_USE_RSLT.read(conn,tempSelectStruct);
						if (tempList != null && !tempList.isEmpty()) {
							for (i = 0; i < tempList.size(); i++ ) {
								tempStruct = (AD0050010Struct)tempList.get(i);

								//ロットトレース登録・更新処理
								BizCommon bc = new BizCommon(conn, getsysUSER_CD(), sp.getProcId(),
									getsysPLANT_CD());
								List lotTraceList = bc.excMakeLotTraceFd(tempStruct.getITEM_CD(),
									tempStruct.getLOT_NO(), this.struct.getITEM_CD(),
									this.struct.getLOT_NO(), "3");
								//正常終了の場合
								if(bc.getResultStatus().intValue() == 1){
									tempStruct.setFROM_ITEM_CD(tempStruct.getITEM_CD());
									tempStruct.setFROM_LOT_NO(tempStruct.getLOT_NO());
									tempStruct.setTO_ITEM_CD(this.struct.getITEM_CD());
									tempStruct.setTO_LOT_NO(this.struct.getLOT_NO());
									tempStruct.setTO_PUCH_ODR_CD(null);
									tempStruct.setsUser_ID(getsysUSER_CD());
									
									// 元発注番号を取得する
									List fromPuchOrdList = entity.mgetFROM_PUCH_ODR_CD.read(conn,tempStruct);
									if (fromPuchOrdList != null && fromPuchOrdList.size() > 0) {
										AD0050010Struct orderStruct = (AD0050010Struct) fromPuchOrdList.get(0);
										tempStruct.setFROM_PUCH_ODR_CD(orderStruct.getFROM_PUCH_ODR_CD());
									} else {
										tempStruct.setFROM_PUCH_ODR_CD(null);
									}
									//ロットトレースの発注番号を更新する
									entity.mupdateT_LOT_TRACE.update(conn, tempStruct);
								}
								//異常終了の場合
								if(bc.getResultStatus().intValue() == 3){
									//エラーメッセージ取得
									if(lotTraceList != null && lotTraceList.size() > 0){
										setErrorMessage((String)lotTraceList.get(0));
									}
									struct.setLOT_NO(null);
									return;
								}
							}
						}
					}

					//ロット管理テーブル更新
					setStandardItem(this.rsltStruct);
					entity.mT_LOT_CTRL.update(conn,this.struct);
					
					//ロット別使用実績を更新
					String temp;
					int round;
					BigDecimal denominator;
					BigDecimal numerator;
					BigDecimal planSum;
					//ロット使用別実績の更新処理
					tempList = entity.mUpdateT_LOT_USE_RSLT.read(conn, this.struct);
					if (tempList.size() > 0) {
						for (int m = 0; m < tempList.size(); m++) {
							tempStruct = (AD0050010Struct)tempList.get(m);
							round = Integer.parseInt(tempStruct.getUNIT_QTY_TYP());
							denominator = new BigDecimal(tempStruct.getISSUE_INST_UNIT_DENOMINATOR());
							numerator = new BigDecimal(tempStruct.getISSUE_INST_UNIT_NUMERATOR());
							///////////////////////////////////////////////
							//良品数
							temp = this.struct.getACPT_QTY();
							planSum = new BigDecimal(temp);
							//子品目の使用数の計算
							if (round == 1) {
								planSum = planSum.multiply(numerator).divide(denominator, 0, BigDecimal.ROUND_UP).setScale(1);
							} else {
								planSum = planSum.multiply(numerator).divide(denominator, 4, BigDecimal.ROUND_UP);
							
							}
							//使用予定数量の計算：「良品数」-SUM（[ロット別使用実績].”使用予定数量”）+MAX（ロット番号）の使用予定数量
							if (Calculate.compare(planSum.toString(),tempStruct.getSUPPLIED_ISSUE_QTY_SUM()) != 0) {
								temp = Calculate.add(tempStruct.getSUPPLIED_ISSUE_QTY(),
										Calculate.subtract(planSum.toString(),tempStruct.getSUPPLIED_ISSUE_QTY_SUM()));
								tempStruct.setSUPPLIED_ISSUE_QTY(temp);
								setStandardItem(tempStruct);
								entity.mUpdateT_LOT_USE_RSLT.update(conn, tempStruct);
							}
						}
					}
				}
			}
		}
			
			conn.commit();

			//再検索	
			controlSelect();

		} catch (SQLException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;			
		} catch (ParseException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;			
		} catch (Exception e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;			
		} finally {
			try {
				if (conn != null) {
					conn.rollback();
				}
			} catch(Exception e) {
				setReadStatus(ERROR);
				ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
				sysLog.severe(emsg, getsysUSER_CD());
				ExpjException ee = new ExpjException(e, emsg);
				throw ee;
			}
		}


                //}}user_implement_dev:<controlUpdate10>
		logger.exiting("AD0050010Control"+":USER="+struct.getsUser_ID(),"controlUpdate10");

		return;
	}

	/**
	 * 子部品追加登録ボタン押下時に実行される処理です。
	 *
	 */
	public void controlUseParts() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0050");
		logger.entering("AD0050010Control"+":USER="+struct.getsUser_ID(),"controlUseParts");
			//{{user_implement_dev:<controlUseParts>

			
		try {				
			this.issueStruct = new AD0050010Struct();
			setStandardItem(issueStruct);
			
			this.issueStruct.setIN_OUTPUT_RSLT_CD(struct.getIN_OUTPUT_RSLT_CD());
			this.issueStruct.seth_ISSUE_INST_CD(struct.geth_ISSUE_INST_CD());
			this.issueStruct.seth_WORK_ODR_CD(struct.geth_WORK_ODR_CD());
			
			this.issueStruct.setTEMP_PLAN_QTY("0.0");
			this.issueStruct.setTEMP_USEOVER_QTY("0.0");
			this.issueStruct.setTEMP_PLANOUT_QTY("0.0");
			this.issueStruct.setTEMP_USE_QTY("0.0");
			this.issueStruct.setl_UNIT_QTY_TYP(Kind.NUMBER);

			//作業日(日付制御.業務運用日)のセット
			this.struct.setPLANT_CD(getsysPLANT_CD());
			List oprDateList = entity.mSelectDateCtrl.read(conn, struct);
			if (oprDateList.isEmpty()) {
				setErrorMessage("ZZ06001");
				setWarningSysLogMessage("SYS_DATE_CTRL.PLANT_CD", getsysPLANT_CD());
				return;
			}
			AD0050010Struct oprDateStruct = new AD0050010Struct();
			oprDateStruct = (AD0050010Struct)oprDateList.get(0);
			setStandardItem(oprDateStruct);
			this.issueStruct.setRCV_ISSUE_DATE(oprDateStruct.geth_BUSINESS_OPR_DATE());
			this.issueStruct.seth_BUSINESS_OPR_DATE(oprDateStruct.geth_BUSINESS_OPR_DATE());
			
			this.struct.setStructM(this.issueStruct);
			this.issueKeepStruct.setStructM(this.issueStruct);

			_issueExeType = 0;
			
			setReadStatus(NORMAL);

		} catch (SQLException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;			
		} catch (NumberFormatException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;			
		}


                //}}user_implement_dev:<controlUseParts>
		logger.exiting("AD0050010Control"+":USER="+struct.getsUser_ID(),"controlUseParts");

		return;
	}

	/**
	 * 調整数登録ボタン押下時に実行される処理です。
	 *
	 */
	public void controlNoUserParts() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0050");
		logger.entering("AD0050010Control"+":USER="+struct.getsUser_ID(),"controlNoUserParts");
			//{{user_implement_dev:<controlNoUserParts>


		try {		
			//出庫指示リスト再取得	
			List formList = entity.mSelectIssueForUpdate.read(conn, struct);
			if (formList.isEmpty()) {
				setErrorMessage("ZZ06001");
				setWarningSysLogMessage("T_ISSUE_INST.WORK_ODR_CD", struct.geth_WORK_ODR_CD());
				setWarningSysLogMessage("T_ISSUE_INST.ISSUE_INST_CD", struct.geth_ISSUE_INST_CD());
				return;
			}
			AD0050010Struct TempStruct;
             for (int i = 0; i < formList.size(); i++) {
		     TempStruct = (AD0050010Struct)formList.get(i);

		     //コンボボックスの取得
		     othercomboTyp(TempStruct);
		    }
			setIssueList(formList);

			this.issueStruct = new AD0050010Struct();
			issueStruct = (AD0050010Struct) formList.get(0);
			setStandardItem(issueStruct);
			this.issueStruct.setIN_OUTPUT_RSLT_CD(struct.getIN_OUTPUT_RSLT_CD());
			this.issueStruct.seth_ISSUE_INST_CD(struct.geth_ISSUE_INST_CD());
			this.issueStruct.seth_WORK_ODR_CD(struct.geth_WORK_ODR_CD());

			//業務運用日のセット
			this.struct.setPLANT_CD(getsysPLANT_CD());
			List oprDateList = entity.mSelectDateCtrl.read(conn, struct);
			if (oprDateList.isEmpty()) {
				setErrorMessage("ZZ06001");
				setWarningSysLogMessage("SYS_DATE_CTRL.PLANT_CD", getsysPLANT_CD());
				return;
			}
			AD0050010Struct oprDateStruct = new AD0050010Struct();
			oprDateStruct = (AD0050010Struct)oprDateList.get(0);
			setStandardItem(oprDateStruct);
			this.issueStruct.seth_BUSINESS_OPR_DATE(oprDateStruct.geth_BUSINESS_OPR_DATE());

			this.issueStruct.seth_LOT_NO(issueStruct.getLOT_NO());
			
			this.struct.setStructM(this.issueStruct);
			this.issueKeepStruct.setStructM(this.issueStruct);

			_issueExeType = 1;
			
			setReadStatus(NORMAL);

		} catch (FoundationException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;			
		} catch (SQLException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;			
		}


                //}}user_implement_dev:<controlNoUserParts>
		logger.exiting("AD0050010Control"+":USER="+struct.getsUser_ID(),"controlNoUserParts");

		return;
	}

	/**
	 * 一括更新ボタン押下時に実行される処理です。
	 *
	 */
	public void controlUpdateAll() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0050");
		logger.entering("AD0050010Control"+":USER="+struct.getsUser_ID(),"controlUpdateAll");
			//{{user_implement_dev:<controlUpdateAll>


		try {
			//出庫指示リスト再取得
			List UpdateAllList = new ArrayList();
			UpdateAllList = entity.mSelectIssue.read(conn, this.struct);
			if (UpdateAllList.isEmpty()) {
				setErrorMessage("ZZ06001");
				setWarningSysLogMessage("T_ISSUE_INST.WORK_ODR_CD", struct.geth_WORK_ODR_CD());
				return;				
			}
			AD0050010Struct TempStruct;
             for (int i = 0; i < UpdateAllList.size(); i++) {
		     TempStruct = (AD0050010Struct)UpdateAllList.get(i);

		     //コンボボックスの取得
		     othercomboTyp(TempStruct);
		    }
			setIssueList(UpdateAllList);
			
			for (int i = 0; i < UpdateAllList.size(); i++ ) {
			
				this.issueStruct = new AD0050010Struct();
				this.issueStruct = (AD0050010Struct)UpdateAllList.get(i);
				setStandardItem(issueStruct);
				
				this.issueStruct.setPARTIAL_PRD_NO("0");   //ZEROをセットする
				this.issueStruct.setJOB_ODR_CD(null);	  //製番品目は処理対象外とする
			
				if (this.issueStruct.getTEMP_USE_QTY() == null 
						|| Double.parseDouble(this.issueStruct.getTEMP_USE_QTY()) == 0) {
					continue;	//更新使用数量がZEROの為以下の処理は行わず、次の行に移る
				}

				CollectNumber collectNum = 
						new CollectNumber(
							CollectNumber.ISSUE_CD,
							this.sysUSER_CD,
							this.sp.getProcId(),
							this.sysPLANT_CD);
			
				String no = collectNum.getNo();
				if (no == null || no.length() == 0) {
					//採番結果がない
					setErrorMessage("ZZ01106");
					return;
				}

				BigDecimal keepUseQty = new BigDecimal(this.issueStruct.getTEMP_USE_QTY());
				BigDecimal planQty = new BigDecimal(this.issueStruct.getTEMP_PLAN_QTY());
				BigDecimal useQty = new BigDecimal(this.issueStruct.getTEMP_USE_QTY());
				if (this.issueStruct.getl_UNIT_QTY_TYP() != null 
						&& "1".equals(this.issueStruct.getl_UNIT_QTY_TYP())) {
					//品目が整数管理品の場合、切上げを行う
					useQty = useQty.setScale(0,BigDecimal.ROUND_UP);
				}
				//修正内容を保持
				this.issueStruct.setRCV_ISSUE_CTRL_CD(no);
				this.issueStruct.setPLANT_CD(this.sysPLANT_CD);
				this.issueStruct.seth_WORK_ODR_CD(this.struct.getOUTPUT_RSLT_CD());//出来高実績番号
				this.issueStruct.setWORK_IN_PROC_CD(null);

				this.issueStruct.setRCV_ISSUE_QTY(useQty.negate().toString());
				if (useQty.doubleValue() > 0) {
					//工程在庫出庫
					this.issueStruct.setRCV_ISSUE_GNR_TYP("51");
				} else {
					//工程在庫出庫取消
					this.issueStruct.setRCV_ISSUE_GNR_TYP("59");
				}

				this.issueStruct.setRCV_ISSUE_ODD_QTY(useQty.subtract(keepUseQty).toString());
				this.issueStruct.setOD_NO(null);
				this.issueStruct.setRCV_ISSUE_CMPLT_FLG("0");
				this.issueStruct.setSTOCK_UPD_TYP("2");
				this.issueStruct.setRCV_ISSUE_TYP("2");



				//保管区コードのNULLチェック
				if (this.issueStruct.getWH_CD() == null 
						|| "".equals(this.issueStruct.getWH_CD())) {
					setErrorMessage("AD20060");
					setSupportMessage("T_ISSUE_INST.ITEM_CD", this.issueStruct.getITEM_CD());
					setWarningSysLogMessage("T_ISSUE_INST.ITEM_CD", this.issueStruct.getITEM_CD());//出庫指示.品目番号
					setWarningSysLogMessage("T_ISSUE_INST.ISSUE_INST_CD", this.issueStruct.geth_ISSUE_INST_CD());//出庫指示.出庫指示番号
					continue;
				}

				//保管区コードチェック
				List tempList = entity.mSelectChkWhCd.read(conn, this.issueStruct);
				if (tempList.isEmpty()) {
					setErrorMessage("AD00020");
					setSupportMessage("T_ISSUE_INST.ITEM_CD", this.issueStruct.getITEM_CD());
					setWarningSysLogMessage("M_WH.WH_CD",this.issueStruct.getWH_CD());//保管区.保管区コード
					setWarningSysLogMessage("T_ISSUE_INST.ITEM_CD", this.issueStruct.getITEM_CD());//出庫指示.品目番号
					setWarningSysLogMessage("T_ISSUE_INST.ISSUE_INST_CD", this.issueStruct.geth_ISSUE_INST_CD());//出庫指示.出庫指示番号
					continue;
				}
				AD0050010Struct tempStruct = (AD0050010Struct)tempList.get(0);
				setStandardItem(tempStruct);
				this.issueStruct.setWH_NAME(tempStruct.getWH_NAME());
			
				//出庫指示．保管区コードの工場コードとのユーザの所属する
				//工場コードの同一チェック
				if (tempStruct.getPLANT_CD() == null 
						|| !tempStruct.getPLANT_CD().equals(this.struct.getPLANT_CD())) {
					setErrorMessage("AD00021");
					setSupportMessage("T_ISSUE_INST.ITEM_CD", this.issueStruct.getITEM_CD());
					setWarningSysLogMessage("M_WH.WH_CD", this.issueStruct.getWH_CD());//保管区.保管区コード
					setWarningSysLogMessage("T_ISSUE_INST.ITEM_CD", this.issueStruct.getITEM_CD());//出庫指示.品目番号
					setWarningSysLogMessage("T_ISSUE_INST.ISSUE_INST_CD", this.issueStruct.geth_ISSUE_INST_CD());//出庫指示.出庫指示番号
					continue;
				}
			

				useQty = new BigDecimal(this.issueStruct.getTEMP_USE_QTY());
				BigDecimal stockQty = null;
				//工程仕掛在庫出庫処理
			
				//保管区別品目在庫更新
				tempList = new ArrayList();
				tempList = entity.mSelectItemStock.read(conn, this.issueStruct);
				AD0050010Struct stockStruct = new AD0050010Struct();
				stockStruct.setStructM(this.issueStruct);
				setStandardItem(stockStruct);
				
				// 退避用手持ち在庫数を初期化
				issueStruct.setSAVE_STOCK_ON_HAND_QTY("0");
			
				if (tempList.isEmpty()) {
					//登録
					useQty = useQty.negate();
					stockStruct.setSTOCK_ON_HAND_QTY(useQty.toString());
					
					entity.mInsertItemStock.create(conn, stockStruct);
				} else {
					//更新
					tempStruct = new AD0050010Struct();
					tempStruct = (AD0050010Struct)tempList.get(0);
					setStandardItem(tempStruct);
					issueStruct.setSAVE_STOCK_ON_HAND_QTY(tempStruct.getSTOCK_ON_HAND_QTY());
					stockQty = new BigDecimal(tempStruct.getSTOCK_ON_HAND_QTY());
					if (useQty.doubleValue() > 0) { //出庫
						useQty = stockQty.subtract(useQty) ;
					} else { //入庫
						useQty = stockQty.add(useQty.negate()) ;
					}
					stockStruct.setSTOCK_ON_HAND_QTY(useQty.toString());
					
					entity.mUpdateItemStock.update(conn, stockStruct);
				}
			
				this.issueStruct.setJOB_ODR_CD(null);			//製番
				this.issueStruct.setJOB_ODR_DETAIL_NO("0");	//製番枝番
				this.issueStruct.setACPT_NO("0");				//受入回数
				this.issueStruct.setACPT_RSLT_CRCT_NO("0");	//受入実績訂正回数
				this.issueStruct.setINSPEC_RSLT_CRCT_NO("0");	//検査実績訂正回数
				this.issueStruct.setOPR_RSLT_CRCT_NO("0");		//作業実績訂正回数
				this.issueStruct.setRCV_ISSUE_AMOUNT("0");		//入出庫金額
				this.issueStruct.setCONS_TYP("0");				//支給区分
				//会社コード
				this.issueStruct.setCOMPANY_CD(_company_cd);
				
				// ロット管理フラグ = 1(ロットトレース管理を行う。)の場合
				if(issueStruct.getLOT_CTRL_FLG().equals("1")){
					this.issueStruct.setIN_OUTPUT_RSLT_CD(this.struct.getIN_OUTPUT_RSLT_CD());//出来高実績番号

					//出庫実績明細取得
					List lotIssueList = entity.mT_LOT_ISSUE_INST.read(conn,this.issueStruct);

					//データがない場合
					if (lotIssueList == null || lotIssueList.size() == 0) {
						setErrorMessage("AD20135");
						setSupportMessage("T_ISSUE_INST.ITEM_CD", this.issueStruct.getITEM_CD());
						setWarningSysLogMessage("T_LOT_ISSUE_INST.ISSUE_INST_CD",this.issueStruct.geth_ISSUE_INST_CD());
																										//出庫指示番号
						setWarningSysLogMessage("T_LOT_ISSUE_INST.ITEM_CD", this.issueStruct.getITEM_CD());//品目番号
						setWarningSysLogMessage("T_LOT_ISSUE_INST.WORK_ODR_CD", this.issueStruct.getWORK_ODR_CD());
																										//作業計画番号
						return;
					}

					//使用残数設定
					BigDecimal remainQty = new BigDecimal(this.issueStruct.getTEMP_USE_QTY());

					AD0050010Struct lotUseStruct = new AD0050010Struct();
					lotUseStruct.setStructM(this.issueStruct);
					setStandardItem(lotUseStruct);

					for (int j = 0; j < lotIssueList.size(); j++ ) {
						AD0050010Struct lotIssueStruct = (AD0050010Struct)lotIssueList.get(j);

						//引き当て可能数設定
						BigDecimal issueQty = new BigDecimal(lotIssueStruct.getISSUE_QTY());//出庫実績数量
						BigDecimal spentQty = new BigDecimal(lotIssueStruct.getSPENT_QTY());//使用済
						BigDecimal availQty = issueQty.subtract(spentQty);

						//ロット別使用実績管理番号採番
						List seqList = entity.mSEQ_JF_RSLT.read(conn, struct);
						if(seqList != null && seqList.size() > 0){
							lotUseStruct.setRSLT_CTL_SEQ_NO(((AD0050010Struct)seqList.get(0)).getNEXTVAL());
						}

						//出庫指示番号、ロット番号設定
						lotUseStruct.seth_ISSUE_INST_CD(lotIssueStruct.geth_ISSUE_INST_CD());
						lotUseStruct.setLOT_NO(lotIssueStruct.getLOT_NO());

						BigDecimal useLotQty = null;

						//引き当て可能数 >= 使用残数の場合
						if(availQty.doubleValue() >= remainQty.doubleValue()){
							//使用残数を引き当て数に設定
							useLotQty = remainQty;
						//引き当て可能数 < 使用残数の場合
						} else {
							//最終データの場合
							if (j == lotIssueList.size() - 1) {
								//使用残数を使用数に設定
								useLotQty = remainQty;
							//最終データでない場合
							} else {
								//引当可能数が0より大きい場合
								if(availQty.doubleValue() > 0){
									//使用残数を使用数に設定
									useLotQty = remainQty;

									//次レコード以降を取得
									for (int k = j + 1; k < lotIssueList.size(); k++ ) {
										AD0050010Struct nextLotIssueStruct = (AD0050010Struct)lotIssueList.get(k);

										//引き当て可能数設定
										BigDecimal nextIssueQty = new BigDecimal(nextLotIssueStruct.getISSUE_QTY());
										BigDecimal nextSpentQty = new BigDecimal(nextLotIssueStruct.getSPENT_QTY());
										BigDecimal nextAvailQty = nextIssueQty.subtract(nextSpentQty);

										//次レコード以降に引当可能なデータがある場合
										if (nextAvailQty.doubleValue() > 0) {
											//引き当て可能数を使用数に設定
											useLotQty = availQty;
											break;
										}
									}
								//引当可能数が0以下の場合
								} else {
									//次のデータを取得
									continue;
								}
							}
						}

						//使用数が引当可能数より大きい場合
						if(useLotQty.doubleValue() > availQty.doubleValue()){
							//警告メッセージ出力
							setWarningMessage("AD20136");
							setSupportMessage("T_ISSUE_INST.ITEM_CD", this.issueStruct.getITEM_CD());
							setWarningSysLogMessage("T_LOT_ISSUE_INST.ISSUE_INST_CD",
									this.issueStruct.geth_ISSUE_INST_CD());//出庫指示番号
							setWarningSysLogMessage("T_LOT_ISSUE_INST.ITEM_CD", this.issueStruct.getITEM_CD());
																											//品目番号
							setWarningSysLogMessage("T_LOT_ISSUE_INST.WORK_ODR_CD", this.issueStruct.getWORK_ODR_CD());
																										//作業計画番号
						}

						//使用済数量、使用予定数量に上記で設定した使用数を設定
						lotUseStruct.setTOTAL_ISSUE_QTY(useLotQty.toString());
						lotUseStruct.setSUPPLIED_ISSUE_QTY(useLotQty.toString());

						//実績日を使用日に設定
						lotUseStruct.setSUPPLIED_DATE(lotUseStruct.getOPR_DATE());

						//[ロット別使用実績]の追加
						entity.mT_LOT_USE_RSLT.create(conn, lotUseStruct);

						//[出庫実績明細]の更新
						lotUseStruct.setSPENT_QTY(spentQty.add(useLotQty).toString());
						entity.mT_LOT_ISSUE_INST.update(conn, lotUseStruct);

						this.issueStruct.setLOT_NO(lotIssueStruct.getLOT_NO());
						this.issueStruct.setRCV_ISSUE_QTY(useLotQty.negate().toString());

						//ロット別品目在庫検索
						tempList = entity.mT_LOT_STOCK.read(conn,this.issueStruct);

						//更新前の在庫数設定
						if (tempList.isEmpty()) {
							issueStruct.setSAVE_STOCK_ON_HAND_QTY("0");
						} else {
							tempStruct = (AD0050010Struct)tempList.get(0);
							issueStruct.setSAVE_STOCK_ON_HAND_QTY(tempStruct.getSTOCK_ON_HAND_QTY());
						}

						//2件目以降のデータの場合
						if (j > 0) {
							//入出庫管理番号採番
							collectNum = 
									new CollectNumber(
										CollectNumber.ISSUE_CD,
										this.sysUSER_CD,
										this.sp.getProcId(),
										this.sysPLANT_CD);
							no = collectNum.getNo();
							if (no == null || no.length() == 0) {
								//採番結果がない
								setErrorMessage("ZZ01106");
								return;
							}
							this.issueStruct.setRCV_ISSUE_CTRL_CD(no);
						}

						//保管区別入出庫登録
						entity.mInsertRecvIssue.create(conn, this.issueStruct);

						//ロット別品目在庫更新
						BizCommon bc = new BizCommon(conn, getsysUSER_CD(), sp.getProcId(), getsysPLANT_CD());
						List updateLotStockList = bc.excUpdateLotStockFd(no, "");

						//異常終了の場合
						if(bc.getResultStatus().intValue() == 3){
							//エラーメッセージ取得
							if(updateLotStockList != null && updateLotStockList.size() > 0){
								setErrorMessage((String)updateLotStockList.get(0));
							}
							return;
						}

						//ロット管理フラグ = 1(ロットトレース管理を行う。)の場合
						if(this.struct.getLOT_CTRL_FLG().equals("1")){
							//親品目の在庫ロット番号が指定されている場合
							if(this.struct.getLOT_NO() != null && !this.struct.getLOT_NO().equals("")){
								//ロットトレース登録・更新処理
								List lotTraceList = bc.excMakeLotTraceFd(this.issueStruct.getITEM_CD(),
									this.issueStruct.getLOT_NO(), this.struct.getITEM_CD(), this.struct.getLOT_NO(),
									"3");
								//正常終了の場合
								if(bc.getResultStatus().intValue() == 1){
									AD0050010Struct updateStruct = new AD0050010Struct();
									updateStruct.setFROM_ITEM_CD(this.issueStruct.getITEM_CD());
									updateStruct.setFROM_LOT_NO(this.issueStruct.getLOT_NO());
									updateStruct.setTO_ITEM_CD(this.struct.getITEM_CD());
									updateStruct.setTO_LOT_NO(this.struct.getLOT_NO());
									updateStruct.setTO_PUCH_ODR_CD(null);
									updateStruct.setsUser_ID(getsysUSER_CD());
									
									// 元発注番号を取得する
									List fromPuchOrdList = entity.mgetFROM_PUCH_ODR_CD.read(conn,updateStruct);
									if (fromPuchOrdList != null && fromPuchOrdList.size() > 0) {
										AD0050010Struct orderStruct = (AD0050010Struct) fromPuchOrdList.get(0);
										updateStruct.setFROM_PUCH_ODR_CD(orderStruct.getFROM_PUCH_ODR_CD());
									} else {
										updateStruct.setFROM_PUCH_ODR_CD(null);
									}
									//ロットトレースの発注番号を更新する
									entity.mupdateT_LOT_TRACE.update(conn, updateStruct);
								}
								//異常終了の場合
								if(bc.getResultStatus().intValue() == 3){
									//エラーメッセージ取得
									if(lotTraceList != null && lotTraceList.size() > 0){
										setErrorMessage((String)lotTraceList.get(0));
									}
									return;
								}
							}
						}

						//使用残数減算
						remainQty = remainQty.subtract(new BigDecimal(lotUseStruct.getTOTAL_ISSUE_QTY()));

						//使用残数が0以下の場合ループ終了
						if (remainQty.doubleValue() <= 0) {
							break;
						}
					}
				//ロット管理フラグ = 1(ロットトレース管理を行う。)でない場合
				} else {
					//保管区別入出庫登録
					entity.mInsertRecvIssue.create(conn, this.issueStruct);
				}
			}


			conn.commit();

			
			//再検索
			controlSelect();

		} catch (NumberFormatException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;			
		} catch (SQLException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;			
		} finally {
			try {
				if (conn != null) {
					conn.rollback();
				}
			} catch(Exception e) {
				setReadStatus(ERROR);
				ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
				sysLog.severe(emsg, getsysUSER_CD());
				ExpjException ee = new ExpjException(e, emsg);
				throw ee;
			}
		}


                //}}user_implement_dev:<controlUpdateAll>
		logger.exiting("AD0050010Control"+":USER="+struct.getsUser_ID(),"controlUpdateAll");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0050");
		logger.entering("AD0050010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
	
	
		try {
			//画面初期設定
			listClear();
			if (this.struct != null) {
				this.struct.clear();
			}			
			initializeNumber();
			
			//作業日(日付制御.業務運用日)のセット
			this.struct.setPLANT_CD(getsysPLANT_CD());
			List oprDateList = entity.mSelectDateCtrl.read(conn, struct);
			if (oprDateList.isEmpty()) {
				setErrorMessage("ZZ06001");
				setWarningSysLogMessage("SYS_DATE_CTRL.PLANT_CD", getsysPLANT_CD());
				return;
			}
			AD0050010Struct oprDateStruct = new AD0050010Struct();
			oprDateStruct = (AD0050010Struct)oprDateList.get(0);
			setStandardItem(oprDateStruct);
			this.struct.setOPR_DATE(oprDateStruct.geth_BUSINESS_OPR_DATE()); //作業日
			this.struct.seth_BUSINESS_OPR_DATE(oprDateStruct.geth_BUSINESS_OPR_DATE());
	
			setReadStatus(INITIAL);
	
		} catch (SQLException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;			
		}
	
	
                //}}user_implement_dev:<controlClear>
		logger.exiting("AD0050010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * 登録ボタン押下時に実行される処理です。
	 *
	 */
	public void controlInsert11() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0050");
		logger.entering("AD0050010Control"+":USER="+struct.getsUser_ID(),"controlInsert11");
			//{{user_implement_dev:<controlInsert11>


		try {
			
			// 生産側の過去の実績入力の制限チェック
			if(getSysParameter() == false){
				if(chkProcExecDate("1","",struct.getRCV_ISSUE_DATE()) == false){
					setErrorMessage(ProcExecDateError);
					setErrorParameter("SYS_ACTUAL_COST_CTRL_AC", "PLANT_CD", struct.getPLANT_CD());
					setErrorParameter("SYS_ACTUAL_COST_CTRL_AC", "PROC_EXEC_DATE", struct.getPROC_EXEC_DATE().toString());
					return;
				}
			}
			
			issueStruct = new AD0050010Struct();
			setStandardItem(issueStruct);
			
			CollectNumber collectNum = 
					new CollectNumber(
						CollectNumber.ISSUE_CD,
						this.sysUSER_CD,
						this.sp.getProcId(),
						this.sysPLANT_CD);
			
			String no = collectNum.getNo();
			if (no == null || no.length() == 0) {
				//採番結果がない
				setErrorMessage("ZZ01106");
				return;
			}
			
			BigDecimal keepUseQty = new BigDecimal(this.issueKeepStruct.getTEMP_USE_QTY());			
			BigDecimal planQty = new BigDecimal(this.struct.getTEMP_PLAN_QTY());
			BigDecimal useQty = new BigDecimal(this.struct.getTEMP_USE_QTY());

			//修正内容を保持
			this.issueStruct.setITEM_CD(this.struct.getITEM_CD());
			this.issueStruct.setITEM_NAME(this.struct.getITEM_NAME());
			this.issueStruct.setWH_CD(this.struct.getWH_CD());
			this.issueStruct.setWH_NAME(this.struct.getWH_NAME());
			this.issueStruct.setTEMP_PLAN_QTY(this.struct.getTEMP_PLAN_QTY());
			this.issueStruct.setSTOCK_UNIT(this.struct.getSTOCK_UNIT());
			this.issueStruct.setTEMP_USEOVER_QTY(this.struct.getTEMP_USEOVER_QTY());
			this.issueStruct.setTEMP_PLANOUT_QTY(this.struct.getTEMP_PLANOUT_QTY());
			this.issueStruct.setTEMP_USE_QTY(this.struct.getTEMP_USE_QTY());
			this.issueStruct.setRCV_ISSUE_DATE(this.struct.getRCV_ISSUE_DATE());
			this.issueStruct.setLOT_NO(this.struct.getLOT_NO());
			this.issueStruct.setVEND_LOT_NO(this.struct.getVEND_LOT_NO());
			this.issueStruct.setRCV_ISSUE_COMMENT(this.struct.getRCV_ISSUE_COMMENT());
			this.issueStruct.setMRP_ODR_TYP_DN(this.struct.getMRP_ODR_TYP_DN());
			this.issueStruct.setISSUE_TYP_DN(this.struct.getISSUE_TYP_DN());
			this.issueStruct.seth_BUSINESS_OPR_DATE(this.struct.geth_BUSINESS_OPR_DATE());
			this.issueStruct.setIN_OUTPUT_RSLT_CD(this.struct.getIN_OUTPUT_RSLT_CD());
			this.issueStruct.seth_ISSUE_INST_CD(this.struct.geth_ISSUE_INST_CD());

			this.issueStruct.setRCV_ISSUE_CTRL_CD(no);
			this.issueStruct.setPLANT_CD(this.sysPLANT_CD);
			this.issueStruct.setJOB_ODR_CD(null);
			this.issueStruct.seth_WORK_ODR_CD(this.struct.getIN_OUTPUT_RSLT_CD());
			this.issueStruct.setWORK_IN_PROC_CD(null);
			this.issueStruct.setOD_NO(null);
			this.issueStruct.setRCV_ISSUE_CMPLT_FLG("0");
			this.issueStruct.setSTOCK_UPD_TYP("2");
			this.issueStruct.setRCV_ISSUE_TYP("2");

			AD0050010Struct selectStruct = new AD0050010Struct();
			
			AD0050010Struct tempStruct = new AD0050010Struct();
			//保管区コードチェック
			List tempList = entity.mSelectChkWhCd.read(conn, this.issueStruct);
			if (tempList.isEmpty()) {
				setErrorMessage("AD00020");
				setWarningSysLogMessage("M_WH.WH_CD", this.issueStruct.getWH_CD());//保管区.保管区コード
			} else {
				tempStruct = (AD0050010Struct)tempList.get(0);
				setStandardItem(tempStruct);
				this.issueStruct.setWH_NAME(tempStruct.getWH_NAME());
				//保管区コードの工場コードとログインユーザが所属する工場コードの同一チェック
				if (tempStruct.getPLANT_CD() == null 
						|| !tempStruct.getPLANT_CD().equals(this.getsysPLANT_CD())) {
					setErrorMessage("AD00021");
					setWarningSysLogMessage("M_WH.WH_CD", this.issueStruct.getWH_CD());//保管区.保管区コード
				}
			}
			
			//品目が存在しない、品目.品目手配区分が0【製番】、1【製番計画】以外で
			//製番を入力された場合エラー
			tempList = new ArrayList();
			tempList = entity.mSelectItem.read(conn,this.issueStruct);
			if (tempList.isEmpty()) {
				setErrorMessage("AD00019");
				setWarningSysLogMessage("M_ITEM.ITEM_CD", tempStruct.getITEM_CD());//品目.品目番号
			} else {
				tempStruct = new AD0050010Struct();
				tempStruct = (AD0050010Struct)tempList.get(0);
				setStandardItem(tempStruct);
				//品目.品目手配区分が1(製番)、2(在庫引当型製番)、 3(欠番)の場合エラー
				if (tempStruct.getMRP_ODR_TYP() != null 
						&& ("1".equals(tempStruct.getMRP_ODR_TYP()) 
						|| "2".equals(tempStruct.getMRP_ODR_TYP()) 
						|| "3".equals(tempStruct.getMRP_ODR_TYP()))) {
					setErrorMessage("AD00082");
					setWarningSysLogMessage("M_ITEM.ITEM_CD", tempStruct.getITEM_CD());//品目.品目番号
				}
				
				this.issueStruct.setLOT_NUMBERING_TYP(tempStruct.getLOT_NUMBERING_TYP());
				this.issueStruct.setLOT_CTRL_FLG(tempStruct.getLOT_CTRL_FLG());
				
				if (_issueExeType == 0 && "1".equals(tempStruct.geth_UNIT_QTY_TYP())) {
					if (tempStruct.geth_UNIT_QTY_TYP() != null 
							&& "1".equals(tempStruct.geth_UNIT_QTY_TYP())) {
						BigDecimal useQty2   = new BigDecimal("0");
						useQty2 = useQty.setScale(0,BigDecimal.ROUND_UP);
						//切り上げ処理前と後で値が異なっていたら小数が入力されていたと判断し
						//ワーニングとする
						if ( useQty.doubleValue() != useQty2.doubleValue()) { 
							//品目が整数管理品の場合で小数が入力された場合ワーニング
							setWarningMessage("AD00043");
							setInfoSysLogMessage("ITEM_CD", this.struct.getITEM_CD());//品目番号
							setInfoSysLogMessage("TEMP_USE_QTY", useQty.toString());//更新使用数量
						}
						//品目が整数管理品の場合、切上げを行う
						useQty = useQty.setScale(0,BigDecimal.ROUND_UP);
					}
				}

			//出来高実績検索
			List selectList = entity.mSelect.read(conn, struct);
			if (selectList.isEmpty()) {
				setErrorMessage("ZZ06001");
				setWarningSysLogMessage("T_OUTPUT_RSLT.OUTPUT_RSLT_CD", struct.getIN_OUTPUT_RSLT_CD());//出来高実績.出来高実績番号
				setReadStatus(NOT_FOUND);
				setScreenMoveFlg(1);
				return;
			}
			selectStruct = (AD0050010Struct)selectList.get(0);

			//入力した子品目番号と作業実績品目が同じ場合
			if(this.issueStruct.getITEM_CD().equals(selectStruct.getITEM_CD())){
				setErrorMessage("AD20138");
				setWarningSysLogMessage("ITEM_CD", this.issueStruct.getITEM_CD());
				return;
			}
			
			//入力した子品目番号を親品目、作業実績品目を子品目として製品構成検索
			this.issueStruct.setPARENT_ITEM_CD(this.issueStruct.getITEM_CD());
			this.issueStruct.setCOMP_ITEM_CD(selectStruct.getITEM_CD());

			tempList = entity.mM_PS.read(conn, this.issueStruct);
			//データが存在する場合
			if(tempList != null && tempList.size() > 0){
				//エラーメッセージ出力
				setErrorMessage("AD20137");
				setWarningSysLogMessage("M_PS.PARENT_ITEM_CD", this.issueStruct.getITEM_CD());
				setWarningSysLogMessage("M_PS.COMP_ITEM_CD", selectStruct.getITEM_CD());
				return;
			}

			//入力された子品目のロット管理フラグ = 1(ロットトレース管理を行う。)の時
			if (this.issueStruct.getLOT_CTRL_FLG().equals("1")) {
				// ロット番号未入力の場合
				if (this.issueStruct.getLOT_NO() == null || this.issueStruct.getLOT_NO().trim().equals("")) {
					// エラーメッセージ出力
					setErrorMessage("AE20600");
					// ロット番号が入力された場合
				} else {
					// ロット管理検索
					tempList = entity.mT_LOT_CTRL.read(conn, this.issueStruct);

					// [ロット管理]に存在しない場合
					if (tempList == null || tempList.size() == 0) {
						// エラーメッセージ出力
						setErrorMessage("AE20615");
						setWarningSysLogMessage("T_LOTL_CTRL.LOT_NO",this.issueStruct.getLOT_NO());
						// [ロット管理]に存在する場合
					} else {
						// 賞味期限 < 使用日 - [SYSTEMパラメータ].”BEST_BEFORE_DATA_PARA”の場合
						
						if (useQty.doubleValue() > 0) {
							// 出庫指示番号がNullの場合
							if (issueStruct.geth_ISSUE_INST_CD() == null || issueStruct.geth_ISSUE_INST_CD().equals("")) {
								// システムパラメータの賞味期限チェックフラグを取得
								List sysParaList = entity.mSYS_PARAMETER.read(conn, this.issueStruct);
								if (sysParaList.size() > 0) {
									AD0050010Struct sysParaStruct = (AD0050010Struct) sysParaList.get(0);
									this.issueStruct.setBEST_BEFORE_DATE_CHECK_FLG(sysParaStruct.getBEST_BEFORE_DATE_CHECK_FLG());
								} else {
									this.issueStruct.setBEST_BEFORE_DATE_CHECK_FLG("1");
								}
									// [ロット管理].”賞味期限”＜  「出庫日」の場合
								List bbdList = entity.mc_BEST_BEFORE_DATE.read(conn, this.issueStruct);
								if (bbdList.size() > 0) {
									AD0050010Struct bbdStruct = (AD0050010Struct) bbdList.get(0);
									// 賞味期限チェックフラグが1:エラーの場合
									if (bbdStruct.getBBD_c_FLG().equals("1")&& this.issueStruct.getBEST_BEFORE_DATE_CHECK_FLG().equals("1")) {
										// 賞味期限が切れています。
										setErrorMessage("AD00114");
										setWarningSysLogMessage("T_LOTL_CTRL.LOT_NO",this.issueStruct.getLOT_NO());
									}// 賞味期限チェックフラグが2:警告の場合
									else if (bbdStruct.getBBD_c_FLG().equals("1")&& this.issueStruct.getBEST_BEFORE_DATE_CHECK_FLG().equals("2")) {
										// 賞味期限切れのロットを使用しました。
										setWarningMessage("AD00115");
										setWarningSysLogMessage("T_LOTL.LOT_NO",this.issueStruct.getLOT_NO());
									}
								}
							}
						}
					}
				}
				//ロット管理フラグ = 1(ロットトレース管理を行う。)でない場合
			}else {
				//ロット番号が入力された場合
				if (this.issueStruct.getLOT_NO() != null&& !this.issueStruct.getLOT_NO().trim().equals("")) {
					//エラーメッセージ出力
					setErrorMessage("AE20601");
				}
			}
		}

			// エラーがあれば終了
			if (msgStruct.hasError()) {
				return;
			}

			//使用数設定
			//BigDecimal useLotQty = useQty;

			this.issueStruct.setRCV_ISSUE_QTY(useQty.negate().toString());
			if (useQty.doubleValue() > 0) {
				//工程在庫出庫
				this.issueStruct.setRCV_ISSUE_GNR_TYP("51");
			} else {
				//工程在庫出庫取消
				this.issueStruct.setRCV_ISSUE_GNR_TYP("59");
			}
			if (_issueExeType == 0) {
				//登録処理
				this.issueStruct.setRCV_ISSUE_ODD_QTY(useQty.toString());
			} else {
				this.issueStruct.setRCV_ISSUE_ODD_QTY(useQty.subtract(keepUseQty).toString());
			}
			
			// 退避用手持ち在庫数の初期化
			issueStruct.setSAVE_STOCK_ON_HAND_QTY("0");
			
			BigDecimal stockQty = null;
			//工程仕掛在庫出庫処理
			//保管区別品目在庫更新
			tempList = new ArrayList();
			tempList = entity.mSelectItemStock.read(conn, this.issueStruct);
			AD0050010Struct stockStruct = new AD0050010Struct();
			stockStruct.setStructM(this.issueStruct);
			setStandardItem(stockStruct);
			
			if (tempList.isEmpty()) {
				//登録
				useQty = useQty.negate();
				stockStruct.setSTOCK_ON_HAND_QTY(useQty.toString());
				
				entity.mInsertItemStock.create(conn, stockStruct);
			} else {
				//更新
				tempStruct = (AD0050010Struct)tempList.get(0);
				setStandardItem(tempStruct);
				issueStruct.setSAVE_STOCK_ON_HAND_QTY(tempStruct.getSTOCK_ON_HAND_QTY());
				stockQty = new BigDecimal(tempStruct.getSTOCK_ON_HAND_QTY());
				if (useQty.doubleValue() > 0) { 
					//出庫
					useQty = stockQty.subtract(useQty) ;
				} else { 
					//入庫
					useQty = stockQty.add(useQty.negate()) ;
				}
				stockStruct.setSTOCK_ON_HAND_QTY(useQty.toString());
			
				entity.mUpdateItemStock.update(conn, stockStruct);
			}
			this.issueStruct.setJOB_ODR_CD(null);			//製番
			this.issueStruct.setJOB_ODR_DETAIL_NO("0");	//製番枝番
			this.issueStruct.setACPT_NO("0");				//受入回数
			this.issueStruct.setACPT_RSLT_CRCT_NO("0");	//受入実績訂正回数
			this.issueStruct.setINSPEC_RSLT_CRCT_NO("0");	//検査実績訂正回数
			this.issueStruct.setPARTIAL_PRD_NO("0");		//分作回数
			this.issueStruct.setOPR_RSLT_CRCT_NO("0");		//作業実績訂正回数
			this.issueStruct.setRCV_ISSUE_AMOUNT("0");		//入出庫金額
			this.issueStruct.setCONS_TYP("0");				//支給区分
			
			//会社コード
			this.issueStruct.setCOMPANY_CD(_company_cd);
			
			//ロット管理フラグ = 1(ロットトレース管理を行う。)の場合
			if(issueStruct.getLOT_CTRL_FLG().equals("1")){
				//出庫指示番号がnullでない場合
				if(issueStruct.geth_ISSUE_INST_CD() != null && !issueStruct.geth_ISSUE_INST_CD().equals("")){
					//出庫実績明細取得
					List lotIssueList = entity.mT_LOT_ISSUE_INST.read(conn,this.issueStruct);

					//データがない場合
					if (lotIssueList == null || lotIssueList.size() == 0) {
						setErrorMessage("AD20135");
						setSupportMessage("T_ISSUE_INST.ITEM_CD", this.issueStruct.getITEM_CD());
						setWarningSysLogMessage("T_LOT_ISSUE_INST.ISSUE_INST_CD",this.issueStruct.geth_ISSUE_INST_CD());
																										//出庫指示番号
						setWarningSysLogMessage("T_LOT_ISSUE_INST.ITEM_CD", this.issueStruct.getITEM_CD());//品目番号
						setWarningSysLogMessage("T_LOT_ISSUE_INST.WORK_ODR_CD", this.issueStruct.getWORK_ODR_CD());
																										//作業計画番号
						return;
					}
					
					//使用残数設定
					BigDecimal remainQty = new BigDecimal(this.issueStruct.getTEMP_USE_QTY());

					AD0050010Struct lotUseStruct = new AD0050010Struct();
					lotUseStruct.setStructM(this.issueStruct);
					setStandardItem(lotUseStruct);

					//数量増加の場合
					if (remainQty.doubleValue() > 0){
						for (int j = 0; j < lotIssueList.size(); j++ ) {
							AD0050010Struct lotIssueStruct = (AD0050010Struct)lotIssueList.get(j);

							//引き当て可能数設定
							BigDecimal issueQty = new BigDecimal(lotIssueStruct.getISSUE_QTY());
							BigDecimal spentQty = new BigDecimal(lotIssueStruct.getSPENT_QTY());
							BigDecimal availQty = issueQty.subtract(spentQty);

							//出庫指示番号、ロット番号設定
							lotUseStruct.seth_ISSUE_INST_CD(lotIssueStruct.geth_ISSUE_INST_CD());
							lotUseStruct.setLOT_NO(lotIssueStruct.getLOT_NO());

							BigDecimal useLotQty = null;

							//引き当て可能数 >= 使用残数の場合
							if(availQty.doubleValue() >= remainQty.doubleValue()){
								//使用残数を引き当て数に設定
								useLotQty = remainQty;
							//引き当て可能数 < 使用残数の場合
							} else {
								//最終データの場合
								if (j == lotIssueList.size() - 1) {
									//使用残数を使用数に設定
									useLotQty = remainQty;
								//最終データでない場合
								} else {
									//引当可能数が0より大きい場合
									if(availQty.doubleValue() > 0){
										//使用残数を使用数に設定
										useLotQty = remainQty;

										//次レコード以降を取得
										for (int k = j + 1; k < lotIssueList.size(); k++ ) {
											AD0050010Struct nextLotIssueStruct = (AD0050010Struct)lotIssueList.get(k);

											//引き当て可能数設定
											BigDecimal nextIssueQty = new BigDecimal(nextLotIssueStruct.getISSUE_QTY());
											BigDecimal nextSpentQty = new BigDecimal(nextLotIssueStruct.getSPENT_QTY());
											BigDecimal nextAvailQty = nextIssueQty.subtract(nextSpentQty);

											//次レコード以降に引当可能なデータがある場合
											if (nextAvailQty.doubleValue() > 0) {
												//引き当て可能数を使用数に設定
												useLotQty = availQty;
												break;
											}
										}
									//引当可能数が0以下の場合
									} else {
										//次のデータを取得
										continue;
									}
								}
							}

							//使用数が引当可能数より大きい場合
							if(useLotQty.doubleValue() > availQty.doubleValue()){
								//警告メッセージ出力
								setWarningMessage("AD20136");
								setWarningSysLogMessage("T_LOT_ISSUE_INST.ISSUE_INST_CD",
										this.issueStruct.geth_ISSUE_INST_CD());//出庫指示番号
								setWarningSysLogMessage("T_LOT_ISSUE_INST.ITEM_CD", this.issueStruct.getITEM_CD());
																											//品目番号
								setWarningSysLogMessage("T_LOT_ISSUE_INST.WORK_ODR_CD", this.issueStruct.getWORK_ODR_CD());
																										//作業計画番号
							}

							//引当済数設定
							spentQty = spentQty.add(useLotQty);

							//実績日を使用日に設定
							lotUseStruct.setSUPPLIED_DATE(lotUseStruct.getOPR_DATE());

							//ロット未割り当ての場合
							if (this.issueKeepStruct.getLOT_NO() == null || this.issueKeepStruct.getLOT_NO().equals("")){
								//使用済数に引当済数を設定
								lotUseStruct.setTOTAL_ISSUE_QTY(useLotQty.toString());
								//使用予定数量に画面の使用予定数量を設定
								lotUseStruct.setSUPPLIED_ISSUE_QTY(useLotQty.toString());

								//ロット別使用実績管理番号採番
								List seqList = entity.mSEQ_JF_RSLT.read(conn, struct);
								if(seqList != null && seqList.size() > 0){
									lotUseStruct.setRSLT_CTL_SEQ_NO(((AD0050010Struct)seqList.get(0)).getNEXTVAL());
								}
								//[ロット別使用実績]の追加
								entity.mT_LOT_USE_RSLT.create(conn, lotUseStruct);
							//ロット割り当て済みの場合
							} else {
								//ロット別使用実績取得
								lotIssueStruct.setIN_OUTPUT_RSLT_CD(this.issueStruct.getIN_OUTPUT_RSLT_CD());
								tempList = entity.mT_LOT_USE_RSLT.read(conn,lotIssueStruct);

								//データが存在しない場合
								if (tempList == null || tempList.isEmpty()) {
									//使用済数に引当済数を設定
									lotUseStruct.setTOTAL_ISSUE_QTY(useLotQty.toString());
									//使用予定数量に0を設定
									lotUseStruct.setSUPPLIED_ISSUE_QTY("0");

									//ロット別使用実績管理番号採番
									List seqList = entity.mSEQ_JF_RSLT.read(conn, struct);
									if(seqList != null && seqList.size() > 0){
										lotUseStruct.setRSLT_CTL_SEQ_NO(((AD0050010Struct)seqList.get(0)).getNEXTVAL());
									}
									//[ロット別使用実績]の追加
									entity.mT_LOT_USE_RSLT.create(conn, lotUseStruct);
								} else {
									tempStruct = (AD0050010Struct)tempList.get(0);
		
									//使用済数取得
									BigDecimal totalIssueQty = new BigDecimal(tempStruct.getTOTAL_ISSUE_QTY());

									//使用済数に引当済数を設定
									lotUseStruct.setTOTAL_ISSUE_QTY(totalIssueQty.add(useLotQty).toString());

									//[ロット別使用実績]の更新
									entity.mT_LOT_USE_RSLT.update(conn, lotUseStruct);
								}
							}

							//[出庫実績明細]の更新
							lotUseStruct.setSPENT_QTY(spentQty.toString());
							entity.mT_LOT_ISSUE_INST.update(conn, lotUseStruct);

							this.issueStruct.setLOT_NO(lotIssueStruct.getLOT_NO());
							this.issueStruct.setRCV_ISSUE_QTY(useLotQty.negate().toString());

							//ロット別品目在庫検索
							tempList = entity.mT_LOT_STOCK.read(conn,this.issueStruct);

							//更新前の在庫数設定
							if (tempList.isEmpty()) {
								issueStruct.setSAVE_STOCK_ON_HAND_QTY("0");
							} else {
								tempStruct = (AD0050010Struct)tempList.get(0);
								issueStruct.setSAVE_STOCK_ON_HAND_QTY(tempStruct.getSTOCK_ON_HAND_QTY());
							}

							//2件目以降のデータの場合
							if (j > 0) {
								//入出庫管理番号採番
								collectNum = 
										new CollectNumber(
										CollectNumber.ISSUE_CD,
										this.sysUSER_CD,
										this.sp.getProcId(),
										this.sysPLANT_CD);
								no = collectNum.getNo();
								if (no == null || no.length() == 0) {
									//採番結果がない
									setErrorMessage("ZZ01106");
									return;
								}
								this.issueStruct.setRCV_ISSUE_CTRL_CD(no);
							}

							//保管区別入出庫登録
							entity.mInsertRecvIssue.create(conn, this.issueStruct);

							//ロット別品目在庫更新
							BizCommon bc = new BizCommon(conn, getsysUSER_CD(), sp.getProcId(), getsysPLANT_CD());
							List updateLotStockList = bc.excUpdateLotStockFd(no, "");

							//異常終了の場合
							if(bc.getResultStatus().intValue() == 3){
								//エラーメッセージ取得
								if(updateLotStockList != null && updateLotStockList.size() > 0){
									setErrorMessage((String)updateLotStockList.get(0));
								}
								return;
							}

							//ロット管理フラグ = 1(ロットトレース管理を行う。)の場合
							if(selectStruct.getLOT_CTRL_FLG().equals("1")){
								//ロットトレース登録・更新処理
								List lotTraceList = bc.excMakeLotTraceFd(this.issueStruct.getITEM_CD(),
									this.issueStruct.getLOT_NO(), selectStruct.getITEM_CD(), selectStruct.getLOT_NO(),
									"3");
								//正常終了の場合
								if(bc.getResultStatus().intValue() == 1){
									AD0050010Struct updateStruct = new AD0050010Struct();
									updateStruct.setFROM_ITEM_CD(this.issueStruct.getITEM_CD());
									updateStruct.setFROM_LOT_NO(this.issueStruct.getLOT_NO());
									updateStruct.setTO_ITEM_CD(selectStruct.getITEM_CD());
									updateStruct.setTO_LOT_NO(selectStruct.getLOT_NO());
									updateStruct.setTO_PUCH_ODR_CD(null);
									updateStruct.setsUser_ID(getsysUSER_CD());
									
									// 元発注番号を取得する
									List fromPuchOrdList = entity.mgetFROM_PUCH_ODR_CD.read(conn,updateStruct);
									if (fromPuchOrdList != null && fromPuchOrdList.size() > 0) {
										AD0050010Struct orderStruct = (AD0050010Struct) fromPuchOrdList.get(0);
										updateStruct.setFROM_PUCH_ODR_CD(orderStruct.getFROM_PUCH_ODR_CD());
									} else {
										updateStruct.setFROM_PUCH_ODR_CD(null);
									}
									//ロットトレースの発注番号を更新する
									entity.mupdateT_LOT_TRACE.update(conn, updateStruct);
								}
								//異常終了の場合
								if(bc.getResultStatus().intValue() == 3){
									//エラーメッセージ取得
									if(lotTraceList != null && lotTraceList.size() > 0){
										setErrorMessage((String)lotTraceList.get(0));
									}
									return;
								}
							}
							//使用残数減算
							remainQty = remainQty.subtract(useLotQty);

							//使用残数が0以下の場合ループ終了
							if (remainQty.doubleValue() <= 0) {
								break;
							}
						}
					//数量減少の場合
					} else {
						for (int j = lotIssueList.size() - 1; j >= 0; j-- ) {
							AD0050010Struct lotIssueStruct = (AD0050010Struct)lotIssueList.get(j);

							//ロット別使用実績取得
							lotIssueStruct.setIN_OUTPUT_RSLT_CD(this.issueStruct.getIN_OUTPUT_RSLT_CD());
							tempList = entity.mT_LOT_USE_RSLT.read(conn,lotIssueStruct);

							//データが存在しない場合
							if (tempList == null || tempList.isEmpty()) {
								//次のデータを取得
								continue;
							}

							tempStruct = (AD0050010Struct)tempList.get(0);

							//引き当て可能数設定
							BigDecimal availQty = new BigDecimal(tempStruct.getTOTAL_ISSUE_QTY());

							//出庫指示番号、ロット番号設定
							lotUseStruct.seth_ISSUE_INST_CD(lotIssueStruct.geth_ISSUE_INST_CD());
							lotUseStruct.setLOT_NO(lotIssueStruct.getLOT_NO());

							BigDecimal useLotQty = null;

							//引き当て可能数 >= 使用残数の場合
							if(availQty.doubleValue() >= remainQty.negate().doubleValue()){
								//使用残数を引き当て数に設定
								useLotQty = remainQty;
							//引き当て可能数 < 使用残数の場合
							} else {
								//最終データの場合
								if (j == 0) {
									//使用残数を使用数に設定
									useLotQty = remainQty;
								//最終データでない場合
								} else {
									//引当可能数が0より大きい場合
									if(availQty.doubleValue() > 0){
										useLotQty = availQty.negate();
									//引当可能数が0以下の場合
									} else {
										//次のデータを取得
										continue;
									}
								}
							}

							//使用済数を設定
							lotUseStruct.setTOTAL_ISSUE_QTY(availQty.add(useLotQty).toString());

							//実績日を使用日に設定
							lotUseStruct.setSUPPLIED_DATE(lotUseStruct.getOPR_DATE());

							//[ロット別使用実績]の更新
							entity.mT_LOT_USE_RSLT.update(conn, lotUseStruct);

							//引当済数設定
							BigDecimal spentQty = new BigDecimal(lotIssueStruct.getSPENT_QTY());
							spentQty = spentQty.add(useLotQty);

							//[出庫実績明細]の更新
							lotUseStruct.setSPENT_QTY(spentQty.toString());
							entity.mT_LOT_ISSUE_INST.update(conn, lotUseStruct);

							this.issueStruct.setLOT_NO(lotIssueStruct.getLOT_NO());
							this.issueStruct.setRCV_ISSUE_QTY(useLotQty.negate().toString());

							//ロット別品目在庫検索
							tempList = entity.mT_LOT_STOCK.read(conn,this.issueStruct);

							//更新前の在庫数設定
							if (tempList.isEmpty()) {
								issueStruct.setSAVE_STOCK_ON_HAND_QTY("0");
							} else {
								tempStruct = (AD0050010Struct)tempList.get(0);
								issueStruct.setSAVE_STOCK_ON_HAND_QTY(tempStruct.getSTOCK_ON_HAND_QTY());
							}

							//2件目以降のデータの場合
							if (j < lotIssueList.size() - 1) {
								//入出庫管理番号採番
								collectNum = 
										new CollectNumber(
										CollectNumber.ISSUE_CD,
										this.sysUSER_CD,
										this.sp.getProcId(),
										this.sysPLANT_CD);
								no = collectNum.getNo();
								if (no == null || no.length() == 0) {
									//採番結果がない
									setErrorMessage("ZZ01106");
									return;
								}
								this.issueStruct.setRCV_ISSUE_CTRL_CD(no);
							}
							//保管区別入出庫登録
							entity.mInsertRecvIssue.create(conn, this.issueStruct);

							//ロット別品目在庫更新
							BizCommon bc = new BizCommon(conn, getsysUSER_CD(), sp.getProcId(), getsysPLANT_CD());
							List updateLotStockList = bc.excUpdateLotStockFd(no, "");

							//異常終了の場合
							if(bc.getResultStatus().intValue() == 3){
								//エラーメッセージ取得
								if(updateLotStockList != null && updateLotStockList.size() > 0){
									setErrorMessage((String)updateLotStockList.get(0));
								}
								return;
							}

							//ロット管理フラグ = 1(ロットトレース管理を行う。)の場合
							if(selectStruct.getLOT_CTRL_FLG().equals("1")){
								//親品目の在庫ロット番号が指定されている場合
								if (selectStruct.getLOT_NO() != null && !selectStruct.getLOT_NO().equals("")){
									//ロットトレース登録・更新処理
									List lotTraceList = bc.excMakeLotTraceFd(this.issueStruct.getITEM_CD(),
										this.issueStruct.getLOT_NO(), selectStruct.getITEM_CD(),
										selectStruct.getLOT_NO(), "3");
									//正常終了の場合
									if(bc.getResultStatus().intValue() == 1){
										AD0050010Struct updateStruct = new AD0050010Struct();
										updateStruct.setFROM_ITEM_CD(this.issueStruct.getITEM_CD());
										updateStruct.setFROM_LOT_NO(this.issueStruct.getLOT_NO());
										updateStruct.setTO_ITEM_CD(selectStruct.getITEM_CD());
										updateStruct.setTO_LOT_NO(selectStruct.getLOT_NO());
										updateStruct.setTO_PUCH_ODR_CD(null);
										updateStruct.setsUser_ID(getsysUSER_CD());
										
										// 元発注番号を取得する
										List fromPuchOrdList = entity.mgetFROM_PUCH_ODR_CD.read(conn,updateStruct);
										if (fromPuchOrdList != null && fromPuchOrdList.size() > 0) {
											AD0050010Struct orderStruct = (AD0050010Struct) fromPuchOrdList.get(0);
											updateStruct.setFROM_PUCH_ODR_CD(orderStruct.getFROM_PUCH_ODR_CD());
										} else {
											updateStruct.setFROM_PUCH_ODR_CD(null);
										}
										//ロットトレースの発注番号を更新する
										entity.mupdateT_LOT_TRACE.update(conn, updateStruct);
									}
									//異常終了の場合
									if(bc.getResultStatus().intValue() == 3){
										//エラーメッセージ取得
										if(lotTraceList != null && lotTraceList.size() > 0){
											setErrorMessage((String)lotTraceList.get(0));
										}
										return;
									}
								}
							}
							//使用残数減算
							remainQty = remainQty.subtract(useLotQty);

							//使用残数が0以下の場合ループ終了
							if (remainQty.doubleValue() >= 0) {
								break;
							}
						}
					}
				//出庫指示番号がnullの場合
			} else {
				AD0050010Struct lotUseStruct = new AD0050010Struct();
				lotUseStruct.setStructM(this.issueStruct);
				setStandardItem(lotUseStruct);

				//使用済数に画面の使用予定数量を設定
				lotUseStruct.setTOTAL_ISSUE_QTY(this.issueStruct.getTEMP_USE_QTY());
				//使用予定数量に0を設定
				lotUseStruct.setSUPPLIED_ISSUE_QTY("0.0");

				//実績日を使用日に設定
				lotUseStruct.setSUPPLIED_DATE(lotUseStruct.getOPR_DATE());

				//ロット別使用実績管理番号採番
				List seqList = entity.mSEQ_JF_RSLT.read(conn, struct);
				if(seqList != null && seqList.size() > 0){
					lotUseStruct.setRSLT_CTL_SEQ_NO(((AD0050010Struct)seqList.get(0)).getNEXTVAL());
				}
				//[ロット別使用実績]の追加
				entity.mT_LOT_USE_RSLT.create(conn, lotUseStruct);

			//ロット別品目在庫検索
			tempList = entity.mT_LOT_STOCK.read(conn,this.issueStruct);

			//更新前の在庫数設定
			if (tempList.isEmpty()) {
				issueStruct.setSAVE_STOCK_ON_HAND_QTY("0");
			} else {
				tempStruct = (AD0050010Struct)tempList.get(0);
				issueStruct.setSAVE_STOCK_ON_HAND_QTY(tempStruct.getSTOCK_ON_HAND_QTY());
			}

			//保管区別入出庫登録
			entity.mInsertRecvIssue.create(conn, this.issueStruct);

			//ロット別品目在庫更新
			BizCommon bc = new BizCommon(conn, getsysUSER_CD(), sp.getProcId(), getsysPLANT_CD());
			List updateLotStockList = bc.excUpdateLotStockFd(no, "");

			//異常終了の場合
			if(bc.getResultStatus().intValue() == 3){
				//エラーメッセージ取得
				if(updateLotStockList != null && updateLotStockList.size() > 0){
					setErrorMessage((String)updateLotStockList.get(0));
				}
				return;
			}

			//ロット管理フラグ = 1(ロットトレース管理を行う。)の場合
			if(selectStruct.getLOT_CTRL_FLG().equals("1")){
				//親品目の在庫ロット番号が指定されている場合
				if (selectStruct.getLOT_NO() != null && !selectStruct.getLOT_NO().equals("")){
					//ロットトレース登録・更新処理
					List lotTraceList = bc.excMakeLotTraceFd(this.issueStruct.getITEM_CD(),
						this.issueStruct.getLOT_NO(), selectStruct.getITEM_CD(),
						selectStruct.getLOT_NO(), "3");
					//正常終了の場合
					if(bc.getResultStatus().intValue() == 1){
						AD0050010Struct updateStruct = new AD0050010Struct();
						updateStruct.setFROM_ITEM_CD(this.issueStruct.getITEM_CD());
						updateStruct.setFROM_LOT_NO(this.issueStruct.getLOT_NO());
						updateStruct.setTO_ITEM_CD(selectStruct.getITEM_CD());
						updateStruct.setTO_LOT_NO(selectStruct.getLOT_NO());
						updateStruct.setTO_PUCH_ODR_CD(null);
						updateStruct.setsUser_ID(getsysUSER_CD());
						
						// 元発注番号を取得する
						List fromPuchOrdList = entity.mgetFROM_PUCH_ODR_CD.read(conn,updateStruct);
						if (fromPuchOrdList != null && fromPuchOrdList.size() > 0) {
							AD0050010Struct orderStruct = (AD0050010Struct) fromPuchOrdList.get(0);
							updateStruct.setFROM_PUCH_ODR_CD(orderStruct.getFROM_PUCH_ODR_CD());
						} else {
							updateStruct.setFROM_PUCH_ODR_CD(null);
						}
						//ロットトレースの発注番号を更新する
						entity.mupdateT_LOT_TRACE.update(conn, updateStruct);
					}
					//異常終了の場合
					if(bc.getResultStatus().intValue() == 3){
						//エラーメッセージ取得
						if(lotTraceList != null && lotTraceList.size() > 0){
							setErrorMessage((String)lotTraceList.get(0));
						}
						return;
					}
				}
			}
			}
			//ロット管理フラグ = 1(ロットトレース管理を行う。)でない場合
			} else {
				//保管区別入出庫登録
				entity.mInsertRecvIssue.create(conn, this.issueStruct);
			}

			
			conn.commit();
			
			this.struct.setStructM(this.issueStruct);
			
			//再検索
			controlSelect();

		} catch (SQLException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;			
		} finally {
			try {
				if (conn != null) {
					conn.rollback();
				}
			} catch(Exception e) {
				setReadStatus(ERROR);
				ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
				sysLog.severe(emsg, getsysUSER_CD());
				ExpjException ee = new ExpjException(e, emsg);
				throw ee;
			}
		}



                //}}user_implement_dev:<controlInsert11>
		logger.exiting("AD0050010Control"+":USER="+struct.getsUser_ID(),"controlInsert11");

		return;
	}

	/**
	 * 更新ボタン押下時に実行される処理です。
	 *
	 */
	public void controlUpdate11() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0050");
		logger.entering("AD0050010Control"+":USER="+struct.getsUser_ID(),"controlUpdate11");
			//{{user_implement_dev:<controlUpdate11>


		controlInsert11();


                //}}user_implement_dev:<controlUpdate11>
		logger.exiting("AD0050010Control"+":USER="+struct.getsUser_ID(),"controlUpdate11");

		return;
	}

	/**
	 * 戻るボタン押下時に実行される処理です。
	 *
	 */
	public void controlReturn() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0050");
		logger.entering("AD0050010Control"+":USER="+struct.getsUser_ID(),"controlReturn");
			//{{user_implement_dev:<controlReturn>

			
		//親画面再検索
		controlSelect();


                //}}user_implement_dev:<controlReturn>
		logger.exiting("AD0050010Control"+":USER="+struct.getsUser_ID(),"controlReturn");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0050");
		logger.entering("AD0050010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AD0050010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0050");
		logger.entering("AD0050010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>


		try {
			setReadStatus(INITIAL);

			//画面初期設定
			listClear();
			if (this.struct != null) {
				this.struct.clear();
			}			
			initializeNumber();

			// コンボボックスデータを部品より取得
			ComboBox cdac = new ComboBox(conn, sysUSER_CD);
			_oprTimeUnitTypStruct = cdac.getData("OPR_TIME_UNIT_TYP");
			DEFECT_CAUSE_CD = cdac.getData("DEFECT_CAUSE_CD_INNER");
			cdac.setConnection(null);

			//作業日(日付制御.業務運用日)のセット
			this.struct.setPLANT_CD(getsysPLANT_CD());
			List oprDateList = entity.mSelectDateCtrl.read(conn, struct);
			if (oprDateList.isEmpty()) {
				setErrorMessage("ZZ06001");
				setWarningSysLogMessage("SYS_DATE_CTRL.PLANT_CD", getsysPLANT_CD());
				setReadStatus(ERROR);
				return;
			}
			AD0050010Struct oprDateStruct = new AD0050010Struct();
			oprDateStruct = (AD0050010Struct)oprDateList.get(0);
			setStandardItem(oprDateStruct);
			this.struct.setOPR_DATE(oprDateStruct.geth_BUSINESS_OPR_DATE()); //作業日
			this.struct.seth_BUSINESS_OPR_DATE(oprDateStruct.geth_BUSINESS_OPR_DATE());
			
			lotCtrlFlg = LotCtrl.checkLotCtrl(conn);
			
			// 会社コード取得
			_company_cd = SystemInformation.getSysMyCompanyCd();
		} catch (ComboException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;			
		} catch (NumberFormatException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;			
		} catch (SQLException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;			
		}


                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AD0050010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * イベントハンドラの前処理です。
	 *
	 * @param buttun ボタン名
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0050");
		logger.entering("AD0050010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			// ダウンロードファイル名クリア
			// PDF・CSVのダウンロードを行うときは、画面上にOrHiddenで「DOWNLOAD_FILE」を定義し、次の行のコメントを外してください。
//			struct.setDOWNLOAD_FILE((String)null);
			// コンボボックス部品のデータのセットはここに記述してください。
			// コンボボックスデータ用意
			try {
                 ComboBox comboController = new ComboBox(conn, sysUSER_CD);	
                 ISSUE_TYP = comboController.getData(ISSUE_TYP_PARAMETER_NAME);
                 MRP_ODR_TYP = comboController.getData(MRP_ODR_TYP_PARAMETER_NAME);

                } catch (SQLException e) {
                 throw new ExpjException(e);
                } catch (ComboException e) {
                 throw new ExpjException(e);
                }
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("AD0050010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("Insert10") ) {
				controlInsert10();
			} else if( button.equals("Update10") ) {
				controlUpdate10();
			} else if( button.equals("UseParts") ) {
				controlUseParts();
			} else if( button.equals("NoUserParts") ) {
				controlNoUserParts();
			} else if( button.equals("UpdateAll") ) {
				controlUpdateAll();
			} else if( button.equals("Clear") ) {
				controlClear();
			} else if( button.equals("Insert11") ) {
				controlInsert11();
			} else if( button.equals("Update11") ) {
				controlUpdate11();
			} else if( button.equals("Return") ) {
				controlReturn();
			} else if( button.equals("initial") ) {
				controlINITIAL();
			} else if( button.equals("reload") ) {
				controlRELOAD();
			}
		//{{user_implement_dev:<control_eventHandller>


			// コンボボックスのセット
			struct.setList_OPR_TIME_UNIT_TYP_val(_oprTimeUnitTypStruct.getValList());
			struct.setList_OPR_TIME_UNIT_TYP_name(_oprTimeUnitTypStruct.getExplanList());
			
			struct.setList_DEFECT_CAUSE_CD_val(DEFECT_CAUSE_CD.getValList());
			struct.setList_DEFECT_CAUSE_CD_name(DEFECT_CAUSE_CD.getExplanList());
			
			if(lotCtrlFlg){
				struct.seth_SYS_LOT_CTRL_FLG("true");
			}else{
				struct.seth_SYS_LOT_CTRL_FLG("false");
			}


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
//			throw new FoundationException("AD0050010Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AD0050010-E999","CSVの出力処理"));
			throw new FoundationException("AD0050010Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AD0050010-E999","システム日付の取得処理"));
				throw new FoundationException("AD0050010Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AD0050010-E999","コントロールのイベント処理"));
			throw new FoundationException("AD0050010Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected AD0050010Entity entity;
	protected AD0050010Struct struct;
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

		entity = new AD0050010Entity();
		struct = new AD0050010Struct();

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
	 * AD0050010クラスの標準コンストラクタ
	 */
	public AD0050010Control() throws BusinessProcessException, FoundationException
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
				AD0050010Struct key = (AD0050010Struct)keyList.get(j);
				// メッセージキーを作成する
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("TEMP_PLAN_QTY") && key.getTEMP_PLAN_QTY() != null) {
					msgKey.setKeyValue("TEMP_PLAN_QTY", key.getTEMP_PLAN_QTY());
				}
				if(msgKeyType.containsKeyColumn("TEMP_USEOVER_QTY") && key.getTEMP_USEOVER_QTY() != null) {
					msgKey.setKeyValue("TEMP_USEOVER_QTY", key.getTEMP_USEOVER_QTY());
				}
				if(msgKeyType.containsKeyColumn("TEMP_PLANOUT_QTY") && key.getTEMP_PLANOUT_QTY() != null) {
					msgKey.setKeyValue("TEMP_PLANOUT_QTY", key.getTEMP_PLANOUT_QTY());
				}
				if(msgKeyType.containsKeyColumn("TEMP_USE_QTY") && key.getTEMP_USE_QTY() != null) {
					msgKey.setKeyValue("TEMP_USE_QTY", key.getTEMP_USE_QTY());
				}
				if(msgKeyType.containsKeyColumn("OPR_TIME_UNIT_TYP_name") && key.getOPR_TIME_UNIT_TYP_name() != null) {
					msgKey.setKeyValue("OPR_TIME_UNIT_TYP_name", key.getOPR_TIME_UNIT_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("OPR_TIME_UNIT_TYP_val") && key.getOPR_TIME_UNIT_TYP_val() != null) {
					msgKey.setKeyValue("OPR_TIME_UNIT_TYP_val", key.getOPR_TIME_UNIT_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_TYP_DN") && key.getISSUE_TYP_DN() != null) {
					msgKey.setKeyValue("ISSUE_TYP_DN", key.getISSUE_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP_DN") && key.getMRP_ODR_TYP_DN() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP_DN", key.getMRP_ODR_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("h_OPR_DATE") && key.geth_OPR_DATE() != null) {
					msgKey.setKeyValue("h_OPR_DATE", key.geth_OPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("h_SYS_LOT_CTRL_FLG") && key.geth_SYS_LOT_CTRL_FLG() != null) {
					msgKey.setKeyValue("h_SYS_LOT_CTRL_FLG", key.geth_SYS_LOT_CTRL_FLG());
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
				if(msgKeyType.containsKeyColumn("DEFECT_CAUSE_CD_name") && key.getDEFECT_CAUSE_CD_name() != null) {
					msgKey.setKeyValue("DEFECT_CAUSE_CD_name", key.getDEFECT_CAUSE_CD_name());
				}
				if(msgKeyType.containsKeyColumn("DEFECT_CAUSE_CD_val") && key.getDEFECT_CAUSE_CD_val() != null) {
					msgKey.setKeyValue("DEFECT_CAUSE_CD_val", key.getDEFECT_CAUSE_CD_val());
				}
				if(msgKeyType.containsKeyColumn("SAVE_STOCK_ON_HAND_QTY") && key.getSAVE_STOCK_ON_HAND_QTY() != null) {
					msgKey.setKeyValue("SAVE_STOCK_ON_HAND_QTY", key.getSAVE_STOCK_ON_HAND_QTY());
				}
				if(msgKeyType.containsKeyColumn("OUTPUT_RSLT_CD") && key.getOUTPUT_RSLT_CD() != null) {
					msgKey.setKeyValue("OUTPUT_RSLT_CD", key.getOUTPUT_RSLT_CD());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("WS_CD") && key.getWS_CD() != null) {
					msgKey.setKeyValue("WS_CD", key.getWS_CD());
				}
				if(msgKeyType.containsKeyColumn("ACPT_QTY") && key.getACPT_QTY() != null) {
					msgKey.setKeyValue("ACPT_QTY", key.getACPT_QTY());
				}
				if(msgKeyType.containsKeyColumn("OPR_DATE") && key.getOPR_DATE() != null) {
					msgKey.setKeyValue("OPR_DATE", key.getOPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("WH_CD") && key.getWH_CD() != null) {
					msgKey.setKeyValue("WH_CD", key.getWH_CD());
				}
				if(msgKeyType.containsKeyColumn("OUTPUT_RSLT_COMMENT") && key.getOUTPUT_RSLT_COMMENT() != null) {
					msgKey.setKeyValue("OUTPUT_RSLT_COMMENT", key.getOUTPUT_RSLT_COMMENT());
				}
				if(msgKeyType.containsKeyColumn("LOT_NO") && key.getLOT_NO() != null) {
					msgKey.setKeyValue("LOT_NO", key.getLOT_NO());
				}
				if(msgKeyType.containsKeyColumn("VEND_LOT_NO") && key.getVEND_LOT_NO() != null) {
					msgKey.setKeyValue("VEND_LOT_NO", key.getVEND_LOT_NO());
				}
				if(msgKeyType.containsKeyColumn("DEFECT_QTY") && key.getDEFECT_QTY() != null) {
					msgKey.setKeyValue("DEFECT_QTY", key.getDEFECT_QTY());
				}
				if(msgKeyType.containsKeyColumn("DEFECT_CAUSE_CD") && key.getDEFECT_CAUSE_CD() != null) {
					msgKey.setKeyValue("DEFECT_CAUSE_CD", key.getDEFECT_CAUSE_CD());
				}
				if(msgKeyType.containsKeyColumn("DEFECT_COMMENT") && key.getDEFECT_COMMENT() != null) {
					msgKey.setKeyValue("DEFECT_COMMENT", key.getDEFECT_COMMENT());
				}
				if(msgKeyType.containsKeyColumn("OUTPUT_RSLT_PERSON") && key.getOUTPUT_RSLT_PERSON() != null) {
					msgKey.setKeyValue("OUTPUT_RSLT_PERSON", key.getOUTPUT_RSLT_PERSON());
				}
				if(msgKeyType.containsKeyColumn("OPR_TIME_UNIT_TYP") && key.getOPR_TIME_UNIT_TYP() != null) {
					msgKey.setKeyValue("OPR_TIME_UNIT_TYP", key.getOPR_TIME_UNIT_TYP());
				}
				if(msgKeyType.containsKeyColumn("PRE_ARRANGEMENT_TIME") && key.getPRE_ARRANGEMENT_TIME() != null) {
					msgKey.setKeyValue("PRE_ARRANGEMENT_TIME", key.getPRE_ARRANGEMENT_TIME());
				}
				if(msgKeyType.containsKeyColumn("OPR_TIME") && key.getOPR_TIME() != null) {
					msgKey.setKeyValue("OPR_TIME", key.getOPR_TIME());
				}
				if(msgKeyType.containsKeyColumn("POST_ARRANGEMENT_TIME") && key.getPOST_ARRANGEMENT_TIME() != null) {
					msgKey.setKeyValue("POST_ARRANGEMENT_TIME", key.getPOST_ARRANGEMENT_TIME());
				}
				if(msgKeyType.containsKeyColumn("CESSATION_TIME") && key.getCESSATION_TIME() != null) {
					msgKey.setKeyValue("CESSATION_TIME", key.getCESSATION_TIME());
				}
				if(msgKeyType.containsKeyColumn("CESSATION_CAUSE") && key.getCESSATION_CAUSE() != null) {
					msgKey.setKeyValue("CESSATION_CAUSE", key.getCESSATION_CAUSE());
				}
				if(msgKeyType.containsKeyColumn("h_RSLT_MODIFY_COUNT") && key.geth_RSLT_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("h_RSLT_MODIFY_COUNT", key.geth_RSLT_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("ITEM_NAME") && key.getITEM_NAME() != null) {
					msgKey.setKeyValue("ITEM_NAME", key.getITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("DRAW_CD") && key.getDRAW_CD() != null) {
					msgKey.setKeyValue("DRAW_CD", key.getDRAW_CD());
				}
				if(msgKeyType.containsKeyColumn("SPEC") && key.getSPEC() != null) {
					msgKey.setKeyValue("SPEC", key.getSPEC());
				}
				if(msgKeyType.containsKeyColumn("h_UNIT_QTY_TYP") && key.geth_UNIT_QTY_TYP() != null) {
					msgKey.setKeyValue("h_UNIT_QTY_TYP", key.geth_UNIT_QTY_TYP());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT") && key.getSTOCK_UNIT() != null) {
					msgKey.setKeyValue("STOCK_UNIT", key.getSTOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("LOT_NUMBERING_TYP") && key.getLOT_NUMBERING_TYP() != null) {
					msgKey.setKeyValue("LOT_NUMBERING_TYP", key.getLOT_NUMBERING_TYP());
				}
				if(msgKeyType.containsKeyColumn("LOT_CTRL_FLG") && key.getLOT_CTRL_FLG() != null) {
					msgKey.setKeyValue("LOT_CTRL_FLG", key.getLOT_CTRL_FLG());
				}
				if(msgKeyType.containsKeyColumn("WS_NAME") && key.getWS_NAME() != null) {
					msgKey.setKeyValue("WS_NAME", key.getWS_NAME());
				}
				if(msgKeyType.containsKeyColumn("WH_NAME") && key.getWH_NAME() != null) {
					msgKey.setKeyValue("WH_NAME", key.getWH_NAME());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_CD") && key.getOPR_INST_CD() != null) {
					msgKey.setKeyValue("OPR_INST_CD", key.getOPR_INST_CD());
				}
				if(msgKeyType.containsKeyColumn("h_WORK_ODR_CD") && key.geth_WORK_ODR_CD() != null) {
					msgKey.setKeyValue("h_WORK_ODR_CD", key.geth_WORK_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("WORK_ODR_DLV_DATE") && key.getWORK_ODR_DLV_DATE() != null) {
					msgKey.setKeyValue("WORK_ODR_DLV_DATE", key.getWORK_ODR_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("OD_NO") && key.getOD_NO() != null) {
					msgKey.setKeyValue("OD_NO", key.getOD_NO());
				}
				if(msgKeyType.containsKeyColumn("IN_OUTPUT_RSLT_CD") && key.getIN_OUTPUT_RSLT_CD() != null) {
					msgKey.setKeyValue("IN_OUTPUT_RSLT_CD", key.getIN_OUTPUT_RSLT_CD());
				}
				if(msgKeyType.containsKeyColumn("h_ISSUE_INST_CD") && key.geth_ISSUE_INST_CD() != null) {
					msgKey.setKeyValue("h_ISSUE_INST_CD", key.geth_ISSUE_INST_CD());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_TYP") && key.getISSUE_TYP() != null) {
					msgKey.setKeyValue("ISSUE_TYP", key.getISSUE_TYP());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_INST_UNIT_DENOMINATOR") && key.getISSUE_INST_UNIT_DENOMINATOR() != null) {
					msgKey.setKeyValue("ISSUE_INST_UNIT_DENOMINATOR", key.getISSUE_INST_UNIT_DENOMINATOR());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_INST_UNIT_NUMERATOR") && key.getISSUE_INST_UNIT_NUMERATOR() != null) {
					msgKey.setKeyValue("ISSUE_INST_UNIT_NUMERATOR", key.getISSUE_INST_UNIT_NUMERATOR());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP") && key.getMRP_ODR_TYP() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP", key.getMRP_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_UNIT_QTY_TYP") && key.getl_UNIT_QTY_TYP() != null) {
					msgKey.setKeyValue("l_UNIT_QTY_TYP", key.getl_UNIT_QTY_TYP());
				}
				if(msgKeyType.containsKeyColumn("TOTAL_ISSUE_QTY") && key.getTOTAL_ISSUE_QTY() != null) {
					msgKey.setKeyValue("TOTAL_ISSUE_QTY", key.getTOTAL_ISSUE_QTY());
				}
				if(msgKeyType.containsKeyColumn("SUPPLIED_ISSUE_QTY") && key.getSUPPLIED_ISSUE_QTY() != null) {
					msgKey.setKeyValue("SUPPLIED_ISSUE_QTY", key.getSUPPLIED_ISSUE_QTY());
				}
				if(msgKeyType.containsKeyColumn("h_BUSINESS_OPR_DATE") && key.geth_BUSINESS_OPR_DATE() != null) {
					msgKey.setKeyValue("h_BUSINESS_OPR_DATE", key.geth_BUSINESS_OPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("count_RCV_ISSUE") && key.getcount_RCV_ISSUE() != null) {
					msgKey.setKeyValue("count_RCV_ISSUE", key.getcount_RCV_ISSUE());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_QTY") && key.getRCV_ISSUE_QTY() != null) {
					msgKey.setKeyValue("RCV_ISSUE_QTY", key.getRCV_ISSUE_QTY());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_ODD_QTY") && key.getRCV_ISSUE_ODD_QTY() != null) {
					msgKey.setKeyValue("RCV_ISSUE_ODD_QTY", key.getRCV_ISSUE_ODD_QTY());
				}
				if(msgKeyType.containsKeyColumn("STOCK_ON_HAND_QTY") && key.getSTOCK_ON_HAND_QTY() != null) {
					msgKey.setKeyValue("STOCK_ON_HAND_QTY", key.getSTOCK_ON_HAND_QTY());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_QTY") && key.getOPR_INST_QTY() != null) {
					msgKey.setKeyValue("OPR_INST_QTY", key.getOPR_INST_QTY());
				}
				if(msgKeyType.containsKeyColumn("WORK_STS_TYP") && key.getWORK_STS_TYP() != null) {
					msgKey.setKeyValue("WORK_STS_TYP", key.getWORK_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("MODIFY_COUNT_BY_ITEM") && key.getMODIFY_COUNT_BY_ITEM() != null) {
					msgKey.setKeyValue("MODIFY_COUNT_BY_ITEM", key.getMODIFY_COUNT_BY_ITEM());
				}
				if(msgKeyType.containsKeyColumn("SUM_OPR_RSLT_QTY") && key.getSUM_OPR_RSLT_QTY() != null) {
					msgKey.setKeyValue("SUM_OPR_RSLT_QTY", key.getSUM_OPR_RSLT_QTY());
				}
				if(msgKeyType.containsKeyColumn("PARTIAL_PRD_NO") && key.getPARTIAL_PRD_NO() != null) {
					msgKey.setKeyValue("PARTIAL_PRD_NO", key.getPARTIAL_PRD_NO());
				}
				if(msgKeyType.containsKeyColumn("OPR_RSLT_PERSON") && key.getOPR_RSLT_PERSON() != null) {
					msgKey.setKeyValue("OPR_RSLT_PERSON", key.getOPR_RSLT_PERSON());
				}
				if(msgKeyType.containsKeyColumn("OPR_RSLT_COMMENT") && key.getOPR_RSLT_COMMENT() != null) {
					msgKey.setKeyValue("OPR_RSLT_COMMENT", key.getOPR_RSLT_COMMENT());
				}
				if(msgKeyType.containsKeyColumn("OPR_CRCT_NO") && key.getOPR_CRCT_NO() != null) {
					msgKey.setKeyValue("OPR_CRCT_NO", key.getOPR_CRCT_NO());
				}
				if(msgKeyType.containsKeyColumn("WORK_CMPLT_DATE") && key.getWORK_CMPLT_DATE() != null) {
					msgKey.setKeyValue("WORK_CMPLT_DATE", key.getWORK_CMPLT_DATE());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_CTRL_CD") && key.getRCV_ISSUE_CTRL_CD() != null) {
					msgKey.setKeyValue("RCV_ISSUE_CTRL_CD", key.getRCV_ISSUE_CTRL_CD());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_TYP") && key.getRCV_ISSUE_TYP() != null) {
					msgKey.setKeyValue("RCV_ISSUE_TYP", key.getRCV_ISSUE_TYP());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_CD") && key.getJOB_ODR_CD() != null) {
					msgKey.setKeyValue("JOB_ODR_CD", key.getJOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_DETAIL_NO") && key.getJOB_ODR_DETAIL_NO() != null) {
					msgKey.setKeyValue("JOB_ODR_DETAIL_NO", key.getJOB_ODR_DETAIL_NO());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_CD") && key.getPUCH_ODR_CD() != null) {
					msgKey.setKeyValue("PUCH_ODR_CD", key.getPUCH_ODR_CD());
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
				if(msgKeyType.containsKeyColumn("WORK_IN_PROC_CD") && key.getWORK_IN_PROC_CD() != null) {
					msgKey.setKeyValue("WORK_IN_PROC_CD", key.getWORK_IN_PROC_CD());
				}
				if(msgKeyType.containsKeyColumn("OPR_RSLT_CRCT_NO") && key.getOPR_RSLT_CRCT_NO() != null) {
					msgKey.setKeyValue("OPR_RSLT_CRCT_NO", key.getOPR_RSLT_CRCT_NO());
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
				if(msgKeyType.containsKeyColumn("STOCK_UPD_TYP") && key.getSTOCK_UPD_TYP() != null) {
					msgKey.setKeyValue("STOCK_UPD_TYP", key.getSTOCK_UPD_TYP());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_CMPLT_FLG") && key.getRCV_ISSUE_CMPLT_FLG() != null) {
					msgKey.setKeyValue("RCV_ISSUE_CMPLT_FLG", key.getRCV_ISSUE_CMPLT_FLG());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_COMMENT") && key.getRCV_ISSUE_COMMENT() != null) {
					msgKey.setKeyValue("RCV_ISSUE_COMMENT", key.getRCV_ISSUE_COMMENT());
				}
				if(msgKeyType.containsKeyColumn("CONS_TYP") && key.getCONS_TYP() != null) {
					msgKey.setKeyValue("CONS_TYP", key.getCONS_TYP());
				}
				if(msgKeyType.containsKeyColumn("COMPANY_CD") && key.getCOMPANY_CD() != null) {
					msgKey.setKeyValue("COMPANY_CD", key.getCOMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("MODIFY_COUNT_OPR_RSLT") && key.getMODIFY_COUNT_OPR_RSLT() != null) {
					msgKey.setKeyValue("MODIFY_COUNT_OPR_RSLT", key.getMODIFY_COUNT_OPR_RSLT());
				}
				if(msgKeyType.containsKeyColumn("l_LOT_NO") && key.getl_LOT_NO() != null) {
					msgKey.setKeyValue("l_LOT_NO", key.getl_LOT_NO());
				}
				if(msgKeyType.containsKeyColumn("PAST_RESULT_ENTRY_TYP") && key.getPAST_RESULT_ENTRY_TYP() != null) {
					msgKey.setKeyValue("PAST_RESULT_ENTRY_TYP", key.getPAST_RESULT_ENTRY_TYP());
				}
				if(msgKeyType.containsKeyColumn("BEST_BEFORE_DATE") && key.getBEST_BEFORE_DATE() != null) {
					msgKey.setKeyValue("BEST_BEFORE_DATE", key.getBEST_BEFORE_DATE());
				}
				if(msgKeyType.containsKeyColumn("RSLT_CTL_SEQ_NO") && key.getRSLT_CTL_SEQ_NO() != null) {
					msgKey.setKeyValue("RSLT_CTL_SEQ_NO", key.getRSLT_CTL_SEQ_NO());
				}
				if(msgKeyType.containsKeyColumn("PART_SUPPLIED_COMMENT") && key.getPART_SUPPLIED_COMMENT() != null) {
					msgKey.setKeyValue("PART_SUPPLIED_COMMENT", key.getPART_SUPPLIED_COMMENT());
				}
				if(msgKeyType.containsKeyColumn("SUPPLIED_DATE") && key.getSUPPLIED_DATE() != null) {
					msgKey.setKeyValue("SUPPLIED_DATE", key.getSUPPLIED_DATE());
				}
				if(msgKeyType.containsKeyColumn("WORK_ODR_CD") && key.getWORK_ODR_CD() != null) {
					msgKey.setKeyValue("WORK_ODR_CD", key.getWORK_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_QTY") && key.getISSUE_QTY() != null) {
					msgKey.setKeyValue("ISSUE_QTY", key.getISSUE_QTY());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_DATE") && key.getISSUE_DATE() != null) {
					msgKey.setKeyValue("ISSUE_DATE", key.getISSUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("SPENT_QTY") && key.getSPENT_QTY() != null) {
					msgKey.setKeyValue("SPENT_QTY", key.getSPENT_QTY());
				}
				if(msgKeyType.containsKeyColumn("NEXTVAL") && key.getNEXTVAL() != null) {
					msgKey.setKeyValue("NEXTVAL", key.getNEXTVAL());
				}
				if(msgKeyType.containsKeyColumn("ALCD_QTY") && key.getALCD_QTY() != null) {
					msgKey.setKeyValue("ALCD_QTY", key.getALCD_QTY());
				}
				if(msgKeyType.containsKeyColumn("PARENT_ITEM_CD") && key.getPARENT_ITEM_CD() != null) {
					msgKey.setKeyValue("PARENT_ITEM_CD", key.getPARENT_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("COMP_ITEM_CD") && key.getCOMP_ITEM_CD() != null) {
					msgKey.setKeyValue("COMP_ITEM_CD", key.getCOMP_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("BEST_BEFORE_DATE_CHECK_FLG") && key.getBEST_BEFORE_DATE_CHECK_FLG() != null) {
					msgKey.setKeyValue("BEST_BEFORE_DATE_CHECK_FLG", key.getBEST_BEFORE_DATE_CHECK_FLG());
				}
				if(msgKeyType.containsKeyColumn("BBD_c_FLG") && key.getBBD_c_FLG() != null) {
					msgKey.setKeyValue("BBD_c_FLG", key.getBBD_c_FLG());
				}
				if(msgKeyType.containsKeyColumn("RSLT_CTRL_SEQ_NO") && key.getRSLT_CTRL_SEQ_NO() != null) {
					msgKey.setKeyValue("RSLT_CTRL_SEQ_NO", key.getRSLT_CTRL_SEQ_NO());
				}
				if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP") && key.getUNIT_QTY_TYP() != null) {
					msgKey.setKeyValue("UNIT_QTY_TYP", key.getUNIT_QTY_TYP());
				}
				if(msgKeyType.containsKeyColumn("SUPPLIED_ISSUE_QTY_SUM") && key.getSUPPLIED_ISSUE_QTY_SUM() != null) {
					msgKey.setKeyValue("SUPPLIED_ISSUE_QTY_SUM", key.getSUPPLIED_ISSUE_QTY_SUM());
				}
				if(msgKeyType.containsKeyColumn("l_COUNT") && key.getl_COUNT() != null) {
					msgKey.setKeyValue("l_COUNT", key.getl_COUNT());
				}
				if(msgKeyType.containsKeyColumn("ROW_COUNT") && key.getROW_COUNT() != null) {
					msgKey.setKeyValue("ROW_COUNT", key.getROW_COUNT());
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
					AD0050010Struct key = new AD0050010Struct();
					if(msgKeyType.containsKeyColumn("TEMP_PLAN_QTY")) {
						key.setTEMP_PLAN_QTY(msgKey.getKeyValue("TEMP_PLAN_QTY"));
					}
					if(msgKeyType.containsKeyColumn("TEMP_USEOVER_QTY")) {
						key.setTEMP_USEOVER_QTY(msgKey.getKeyValue("TEMP_USEOVER_QTY"));
					}
					if(msgKeyType.containsKeyColumn("TEMP_PLANOUT_QTY")) {
						key.setTEMP_PLANOUT_QTY(msgKey.getKeyValue("TEMP_PLANOUT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("TEMP_USE_QTY")) {
						key.setTEMP_USE_QTY(msgKey.getKeyValue("TEMP_USE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("OPR_TIME_UNIT_TYP_name")) {
						key.setOPR_TIME_UNIT_TYP_name(msgKey.getKeyValue("OPR_TIME_UNIT_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("OPR_TIME_UNIT_TYP_val")) {
						key.setOPR_TIME_UNIT_TYP_val(msgKey.getKeyValue("OPR_TIME_UNIT_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_TYP_DN")) {
						key.setISSUE_TYP_DN(msgKey.getKeyValue("ISSUE_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP_DN")) {
						key.setMRP_ODR_TYP_DN(msgKey.getKeyValue("MRP_ODR_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("h_OPR_DATE")) {
						key.seth_OPR_DATE(msgKey.getKeyValue("h_OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("h_SYS_LOT_CTRL_FLG")) {
						key.seth_SYS_LOT_CTRL_FLG(msgKey.getKeyValue("h_SYS_LOT_CTRL_FLG"));
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
					if(msgKeyType.containsKeyColumn("DEFECT_CAUSE_CD_name")) {
						key.setDEFECT_CAUSE_CD_name(msgKey.getKeyValue("DEFECT_CAUSE_CD_name"));
					}
					if(msgKeyType.containsKeyColumn("DEFECT_CAUSE_CD_val")) {
						key.setDEFECT_CAUSE_CD_val(msgKey.getKeyValue("DEFECT_CAUSE_CD_val"));
					}
					if(msgKeyType.containsKeyColumn("SAVE_STOCK_ON_HAND_QTY")) {
						key.setSAVE_STOCK_ON_HAND_QTY(msgKey.getKeyValue("SAVE_STOCK_ON_HAND_QTY"));
					}
					if(msgKeyType.containsKeyColumn("OUTPUT_RSLT_CD")) {
						key.setOUTPUT_RSLT_CD(msgKey.getKeyValue("OUTPUT_RSLT_CD"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("WS_CD")) {
						key.setWS_CD(msgKey.getKeyValue("WS_CD"));
					}
					if(msgKeyType.containsKeyColumn("ACPT_QTY")) {
						key.setACPT_QTY(msgKey.getKeyValue("ACPT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("OPR_DATE")) {
						key.setOPR_DATE(msgKey.getKeyValue("OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("WH_CD")) {
						key.setWH_CD(msgKey.getKeyValue("WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("OUTPUT_RSLT_COMMENT")) {
						key.setOUTPUT_RSLT_COMMENT(msgKey.getKeyValue("OUTPUT_RSLT_COMMENT"));
					}
					if(msgKeyType.containsKeyColumn("LOT_NO")) {
						key.setLOT_NO(msgKey.getKeyValue("LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("VEND_LOT_NO")) {
						key.setVEND_LOT_NO(msgKey.getKeyValue("VEND_LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("DEFECT_QTY")) {
						key.setDEFECT_QTY(msgKey.getKeyValue("DEFECT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("DEFECT_CAUSE_CD")) {
						key.setDEFECT_CAUSE_CD(msgKey.getKeyValue("DEFECT_CAUSE_CD"));
					}
					if(msgKeyType.containsKeyColumn("DEFECT_COMMENT")) {
						key.setDEFECT_COMMENT(msgKey.getKeyValue("DEFECT_COMMENT"));
					}
					if(msgKeyType.containsKeyColumn("OUTPUT_RSLT_PERSON")) {
						key.setOUTPUT_RSLT_PERSON(msgKey.getKeyValue("OUTPUT_RSLT_PERSON"));
					}
					if(msgKeyType.containsKeyColumn("OPR_TIME_UNIT_TYP")) {
						key.setOPR_TIME_UNIT_TYP(msgKey.getKeyValue("OPR_TIME_UNIT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PRE_ARRANGEMENT_TIME")) {
						key.setPRE_ARRANGEMENT_TIME(msgKey.getKeyValue("PRE_ARRANGEMENT_TIME"));
					}
					if(msgKeyType.containsKeyColumn("OPR_TIME")) {
						key.setOPR_TIME(msgKey.getKeyValue("OPR_TIME"));
					}
					if(msgKeyType.containsKeyColumn("POST_ARRANGEMENT_TIME")) {
						key.setPOST_ARRANGEMENT_TIME(msgKey.getKeyValue("POST_ARRANGEMENT_TIME"));
					}
					if(msgKeyType.containsKeyColumn("CESSATION_TIME")) {
						key.setCESSATION_TIME(msgKey.getKeyValue("CESSATION_TIME"));
					}
					if(msgKeyType.containsKeyColumn("CESSATION_CAUSE")) {
						key.setCESSATION_CAUSE(msgKey.getKeyValue("CESSATION_CAUSE"));
					}
					if(msgKeyType.containsKeyColumn("h_RSLT_MODIFY_COUNT")) {
						key.seth_RSLT_MODIFY_COUNT(msgKey.getKeyValue("h_RSLT_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_NAME")) {
						key.setITEM_NAME(msgKey.getKeyValue("ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("DRAW_CD")) {
						key.setDRAW_CD(msgKey.getKeyValue("DRAW_CD"));
					}
					if(msgKeyType.containsKeyColumn("SPEC")) {
						key.setSPEC(msgKey.getKeyValue("SPEC"));
					}
					if(msgKeyType.containsKeyColumn("h_UNIT_QTY_TYP")) {
						key.seth_UNIT_QTY_TYP(msgKey.getKeyValue("h_UNIT_QTY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT")) {
						key.setSTOCK_UNIT(msgKey.getKeyValue("STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("LOT_NUMBERING_TYP")) {
						key.setLOT_NUMBERING_TYP(msgKey.getKeyValue("LOT_NUMBERING_TYP"));
					}
					if(msgKeyType.containsKeyColumn("LOT_CTRL_FLG")) {
						key.setLOT_CTRL_FLG(msgKey.getKeyValue("LOT_CTRL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("WS_NAME")) {
						key.setWS_NAME(msgKey.getKeyValue("WS_NAME"));
					}
					if(msgKeyType.containsKeyColumn("WH_NAME")) {
						key.setWH_NAME(msgKey.getKeyValue("WH_NAME"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_CD")) {
						key.setOPR_INST_CD(msgKey.getKeyValue("OPR_INST_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_WORK_ODR_CD")) {
						key.seth_WORK_ODR_CD(msgKey.getKeyValue("h_WORK_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("WORK_ODR_DLV_DATE")) {
						key.setWORK_ODR_DLV_DATE(msgKey.getKeyValue("WORK_ODR_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("OD_NO")) {
						key.setOD_NO(msgKey.getKeyValue("OD_NO"));
					}
					if(msgKeyType.containsKeyColumn("IN_OUTPUT_RSLT_CD")) {
						key.setIN_OUTPUT_RSLT_CD(msgKey.getKeyValue("IN_OUTPUT_RSLT_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_ISSUE_INST_CD")) {
						key.seth_ISSUE_INST_CD(msgKey.getKeyValue("h_ISSUE_INST_CD"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_TYP")) {
						key.setISSUE_TYP(msgKey.getKeyValue("ISSUE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_INST_UNIT_DENOMINATOR")) {
						key.setISSUE_INST_UNIT_DENOMINATOR(msgKey.getKeyValue("ISSUE_INST_UNIT_DENOMINATOR"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_INST_UNIT_NUMERATOR")) {
						key.setISSUE_INST_UNIT_NUMERATOR(msgKey.getKeyValue("ISSUE_INST_UNIT_NUMERATOR"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP")) {
						key.setMRP_ODR_TYP(msgKey.getKeyValue("MRP_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_UNIT_QTY_TYP")) {
						key.setl_UNIT_QTY_TYP(msgKey.getKeyValue("l_UNIT_QTY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("TOTAL_ISSUE_QTY")) {
						key.setTOTAL_ISSUE_QTY(msgKey.getKeyValue("TOTAL_ISSUE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("SUPPLIED_ISSUE_QTY")) {
						key.setSUPPLIED_ISSUE_QTY(msgKey.getKeyValue("SUPPLIED_ISSUE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("h_BUSINESS_OPR_DATE")) {
						key.seth_BUSINESS_OPR_DATE(msgKey.getKeyValue("h_BUSINESS_OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("count_RCV_ISSUE")) {
						key.setcount_RCV_ISSUE(msgKey.getKeyValue("count_RCV_ISSUE"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_QTY")) {
						key.setRCV_ISSUE_QTY(msgKey.getKeyValue("RCV_ISSUE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_ODD_QTY")) {
						key.setRCV_ISSUE_ODD_QTY(msgKey.getKeyValue("RCV_ISSUE_ODD_QTY"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_ON_HAND_QTY")) {
						key.setSTOCK_ON_HAND_QTY(msgKey.getKeyValue("STOCK_ON_HAND_QTY"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_QTY")) {
						key.setOPR_INST_QTY(msgKey.getKeyValue("OPR_INST_QTY"));
					}
					if(msgKeyType.containsKeyColumn("WORK_STS_TYP")) {
						key.setWORK_STS_TYP(msgKey.getKeyValue("WORK_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("MODIFY_COUNT_BY_ITEM")) {
						key.setMODIFY_COUNT_BY_ITEM(msgKey.getKeyValue("MODIFY_COUNT_BY_ITEM"));
					}
					if(msgKeyType.containsKeyColumn("SUM_OPR_RSLT_QTY")) {
						key.setSUM_OPR_RSLT_QTY(msgKey.getKeyValue("SUM_OPR_RSLT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("PARTIAL_PRD_NO")) {
						key.setPARTIAL_PRD_NO(msgKey.getKeyValue("PARTIAL_PRD_NO"));
					}
					if(msgKeyType.containsKeyColumn("OPR_RSLT_PERSON")) {
						key.setOPR_RSLT_PERSON(msgKey.getKeyValue("OPR_RSLT_PERSON"));
					}
					if(msgKeyType.containsKeyColumn("OPR_RSLT_COMMENT")) {
						key.setOPR_RSLT_COMMENT(msgKey.getKeyValue("OPR_RSLT_COMMENT"));
					}
					if(msgKeyType.containsKeyColumn("OPR_CRCT_NO")) {
						key.setOPR_CRCT_NO(msgKey.getKeyValue("OPR_CRCT_NO"));
					}
					if(msgKeyType.containsKeyColumn("WORK_CMPLT_DATE")) {
						key.setWORK_CMPLT_DATE(msgKey.getKeyValue("WORK_CMPLT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_CTRL_CD")) {
						key.setRCV_ISSUE_CTRL_CD(msgKey.getKeyValue("RCV_ISSUE_CTRL_CD"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_TYP")) {
						key.setRCV_ISSUE_TYP(msgKey.getKeyValue("RCV_ISSUE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_CD")) {
						key.setJOB_ODR_CD(msgKey.getKeyValue("JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_DETAIL_NO")) {
						key.setJOB_ODR_DETAIL_NO(msgKey.getKeyValue("JOB_ODR_DETAIL_NO"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_CD")) {
						key.setPUCH_ODR_CD(msgKey.getKeyValue("PUCH_ODR_CD"));
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
					if(msgKeyType.containsKeyColumn("WORK_IN_PROC_CD")) {
						key.setWORK_IN_PROC_CD(msgKey.getKeyValue("WORK_IN_PROC_CD"));
					}
					if(msgKeyType.containsKeyColumn("OPR_RSLT_CRCT_NO")) {
						key.setOPR_RSLT_CRCT_NO(msgKey.getKeyValue("OPR_RSLT_CRCT_NO"));
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
					if(msgKeyType.containsKeyColumn("STOCK_UPD_TYP")) {
						key.setSTOCK_UPD_TYP(msgKey.getKeyValue("STOCK_UPD_TYP"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_CMPLT_FLG")) {
						key.setRCV_ISSUE_CMPLT_FLG(msgKey.getKeyValue("RCV_ISSUE_CMPLT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_COMMENT")) {
						key.setRCV_ISSUE_COMMENT(msgKey.getKeyValue("RCV_ISSUE_COMMENT"));
					}
					if(msgKeyType.containsKeyColumn("CONS_TYP")) {
						key.setCONS_TYP(msgKey.getKeyValue("CONS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("COMPANY_CD")) {
						key.setCOMPANY_CD(msgKey.getKeyValue("COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("MODIFY_COUNT_OPR_RSLT")) {
						key.setMODIFY_COUNT_OPR_RSLT(msgKey.getKeyValue("MODIFY_COUNT_OPR_RSLT"));
					}
					if(msgKeyType.containsKeyColumn("l_LOT_NO")) {
						key.setl_LOT_NO(msgKey.getKeyValue("l_LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("PAST_RESULT_ENTRY_TYP")) {
						key.setPAST_RESULT_ENTRY_TYP(msgKey.getKeyValue("PAST_RESULT_ENTRY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("BEST_BEFORE_DATE")) {
						key.setBEST_BEFORE_DATE(msgKey.getKeyValue("BEST_BEFORE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("RSLT_CTL_SEQ_NO")) {
						key.setRSLT_CTL_SEQ_NO(msgKey.getKeyValue("RSLT_CTL_SEQ_NO"));
					}
					if(msgKeyType.containsKeyColumn("PART_SUPPLIED_COMMENT")) {
						key.setPART_SUPPLIED_COMMENT(msgKey.getKeyValue("PART_SUPPLIED_COMMENT"));
					}
					if(msgKeyType.containsKeyColumn("SUPPLIED_DATE")) {
						key.setSUPPLIED_DATE(msgKey.getKeyValue("SUPPLIED_DATE"));
					}
					if(msgKeyType.containsKeyColumn("WORK_ODR_CD")) {
						key.setWORK_ODR_CD(msgKey.getKeyValue("WORK_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_QTY")) {
						key.setISSUE_QTY(msgKey.getKeyValue("ISSUE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_DATE")) {
						key.setISSUE_DATE(msgKey.getKeyValue("ISSUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("SPENT_QTY")) {
						key.setSPENT_QTY(msgKey.getKeyValue("SPENT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("NEXTVAL")) {
						key.setNEXTVAL(msgKey.getKeyValue("NEXTVAL"));
					}
					if(msgKeyType.containsKeyColumn("ALCD_QTY")) {
						key.setALCD_QTY(msgKey.getKeyValue("ALCD_QTY"));
					}
					if(msgKeyType.containsKeyColumn("PARENT_ITEM_CD")) {
						key.setPARENT_ITEM_CD(msgKey.getKeyValue("PARENT_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("COMP_ITEM_CD")) {
						key.setCOMP_ITEM_CD(msgKey.getKeyValue("COMP_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("BEST_BEFORE_DATE_CHECK_FLG")) {
						key.setBEST_BEFORE_DATE_CHECK_FLG(msgKey.getKeyValue("BEST_BEFORE_DATE_CHECK_FLG"));
					}
					if(msgKeyType.containsKeyColumn("BBD_c_FLG")) {
						key.setBBD_c_FLG(msgKey.getKeyValue("BBD_c_FLG"));
					}
					if(msgKeyType.containsKeyColumn("RSLT_CTRL_SEQ_NO")) {
						key.setRSLT_CTRL_SEQ_NO(msgKey.getKeyValue("RSLT_CTRL_SEQ_NO"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP")) {
						key.setUNIT_QTY_TYP(msgKey.getKeyValue("UNIT_QTY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("SUPPLIED_ISSUE_QTY_SUM")) {
						key.setSUPPLIED_ISSUE_QTY_SUM(msgKey.getKeyValue("SUPPLIED_ISSUE_QTY_SUM"));
					}
					if(msgKeyType.containsKeyColumn("l_COUNT")) {
						key.setl_COUNT(msgKey.getKeyValue("l_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("ROW_COUNT")) {
						key.setROW_COUNT(msgKey.getKeyValue("ROW_COUNT"));
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
