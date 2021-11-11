/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AD0130/src/com/nec/jp/orteus/metamorBase/AD0130/AD0130010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AD0130;

import com.nec.jp.orteus.metamorBase.AD0130.*;
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
import com.nec.jp.orteus.metamorBase.common04.sysdata.DateCtrlControl;
//}}user_implement_code_import

//{{user_implement_code_header
/**
 * CLASS     : AD0130010Control クラス
 * ファイル・クラス説明
 * @author $Author: geng-jia $
 * @version $Revision: 1.8 $ $Date: 2016/01/15 07:18:29 $
 * 修正履歴
 *
 */
//}}user_implement_code_header

public class AD0130010Control
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
	public AD0130010Struct getListvalue(int x) { return (AD0130010Struct)(this.list.get(x)); }	// リストの値を返します。
	public AD0130010Struct getStruct() { return this.struct; }	// Structの値を返します。
	public AD0130010Struct createStruct() { return new AD0130010Struct(); }	// 新しいStructを作って返します。
	public void setStruct(Object structname) { this.struct.setStruct((AD0130010Struct)structname); }	// Structをセットします。
	public void initializeStruct() { this.struct.initialize(); }	// Structの値を初期化します。

	// CSV出力用リスト
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }
	// TODO: ユーザ定義のコードを記述してください

    /**
     * 画面遷移パラメータ
     */
    private String _P_DAILY_WORK_REPORT_TYP = null;
    protected void setP_DAILY_WORK_REPORT_TYP(String val) { _P_DAILY_WORK_REPORT_TYP = val; }
    protected String getP_DAILY_WORK_REPORT_TYP() { return _P_DAILY_WORK_REPORT_TYP; }
    private String _P_PLANT_CD = null;
    protected void setP_PLANT_CD(String val) { _P_PLANT_CD = val; }
    protected String getP_PLANT_CD() { return _P_PLANT_CD; }
    private String _P_OPR_DATE_FROM = null;
    protected void setP_OPR_DATE_FROM(String val) { _P_OPR_DATE_FROM = val; }
    protected String getP_OPR_DATE_FROM() { return _P_OPR_DATE_FROM; }
    private String _P_OPR_DATE_TO = null;
    protected void setP_OPR_DATE_TO(String val) { _P_OPR_DATE_TO = val; }
    protected String getP_OPR_DATE_TO() { return _P_OPR_DATE_TO; }
    private String _P_USER_CD = null;
    protected void setP_USER_CD(String val) { _P_USER_CD = val; }
    protected String getP_USER_CD() { return _P_USER_CD; }
    private String _P_WS_CD = null;
    protected void setP_WS_CD(String val) { _P_WS_CD = val; }
    protected String getP_WS_CD() { return _P_WS_CD; }
	
	/**
	  * 会社コードをゲット
	  * @return
	*/
	public String getPlantCd() {
		return sysPLANT_CD;
	}
	
    /** 業務運用日 */
	private String _BUSINESS_OPR_DATE = null;
	/**
	  * 業務運用日をゲット
	  * @return
	*/
	public String getBusinessOprDate() {
		return _BUSINESS_OPR_DATE;
	}
	/**
	 * 業務運用日をセット
	 * @param cd
	 */
	public void setBusinessOprDate(String cd){
		_BUSINESS_OPR_DATE = cd;
	}
	
    /** 作業時間の上限値 */
	private String _MAX_OPR_TIME = null;
	/**
	  * 作業時間の上限値をゲット
	  * @return
	*/
	public String getMaxOprTime() {
		return _MAX_OPR_TIME;
	}
	/**
	 * 作業時間の上限値をセット
	 * @param cd
	 */
	public void setMaxOprTime(String cd){
		_MAX_OPR_TIME = cd;
	}
	
	/** 空行表示件数 */
	private String _ADD_LINE_CNT = null;
	/**
	  * 空行表示件数をゲット
	  * @return
	*/
	public String getAddLineCnt() {
		return _ADD_LINE_CNT;
	}
	/**
	 * 空行表示件数をセット
	 * @param cd
	 */
	public void setAddLineCnt(String cd){
		_ADD_LINE_CNT = cd;
	}
	
	/** 生産数表示フォーマット */
	private String _PRD_QTY_FORMAT = null;
	/**
	  * 生産数表示フォーマットをゲット
	  * @return
	*/
	public String getPrdQtyFormat() {
		return _PRD_QTY_FORMAT;
	}
	/**
	 * 生産数表示フォーマットをセット
	 * @param cd
	 */
	public void setPrdQtyFormat(String cd){
		_PRD_QTY_FORMAT = cd;
	}
	
	/** 人数表示フォーマット */
	private String _WORKER_QTY_FORMAT = null;
	/**
	  * 人数表示フォーマットをゲット
	  * @return
	*/
	public String getWorkerQtyFormat() {
		return _WORKER_QTY_FORMAT;
	}
	/**
	 * 人数表示フォーマットをセット
	 * @param cd
	 */
	public void setWorkerQtyFormat(String cd){
		_WORKER_QTY_FORMAT = cd;
	}
	
	/** 不作業時間（分）表示フォーマット */
	private String _UN_OPR_TIME_FORMAT = null;
	/**
	  * 不作業時間（分）表示フォーマットをゲット
	  * @return
	*/
	public String getUnOprTimeFormat() {
		return _UN_OPR_TIME_FORMAT;
	}
	/**
	 * 不作業時間（分）表示フォーマットをセット
	 * @param cd
	 */
	public void setUnOprTimeFormat(String cd){
		_UN_OPR_TIME_FORMAT = cd;
	}
	
	// 作業日報・人日報メンテナンス用
	AD0130010Struct mainStruct = new AD0130010Struct();
	
	// 日報区分のコンボボックスデータ
	private ComboStruct COM_DAILY_WORK_REPORT_TYP = null;
	/**
	  * 日報区分をゲット
	  * @return
	*/
	public ComboStruct getComDailyWorkReportTyp() {
		return COM_DAILY_WORK_REPORT_TYP;
	}
	/**
	 * 日報区分をセット
	 * @param cs
	 */
	public void setComDailyWorkReportTyp(ComboStruct cs){
		COM_DAILY_WORK_REPORT_TYP = cs;
	}
	
	// 作業区分のコンボボックスデータ
	private ComboStruct COM_OPR_TYP = null;
	/**
	  * 作業区分をゲット
	  * @return
	*/
	public ComboStruct getComOprTyp() {
		return COM_OPR_TYP;
	}
	/**
	 * 作業区分をセット
	 * @param cs
	 */
	public void setComOprTyp(ComboStruct cs){
		COM_OPR_TYP = cs;
	}
	
	// 不作業理由区分のコンボボックスデータ
	private ComboStruct COM_UN_OPR_CAUSE_TYP = null;
	/**
	  * 不作業理由区分をゲット
	  * @return
	*/
	public ComboStruct getComUnOprCauseTyp() {
		return COM_UN_OPR_CAUSE_TYP;
	}
	/**
	 * 不作業理由区分をセット
	 * @param cs
	 */
	public void setComUnOprCauseTyp(ComboStruct cs){
		COM_UN_OPR_CAUSE_TYP = cs;
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
     * ログメッセージ設定
     * @param 出力メッセージ
     */
    private void setSyslogConfig(String message)
    {
       ExpjMessage emsg = new ExpjMessage( "ZZ01006", message );
       sysLog.config(emsg, getsysUSER_CD());
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
	 */
	private void setErrorMessage(String code) {
		ExpjMessage emsg = new ExpjMessage(code);
		msgStruct.addError(emsg);
		sysLog.warning(emsg, sysUSER_CD);
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
	 * 業務ロジックのインフォメーション設定処理を切り出して関数化
	 * @param code
	 * @param msg1
	 */
	private void setInfoMessage(String code,String msg1) {
		ExpjMessage emsg = new ExpjMessage(code,msg1);
		msgStruct.addInfo(emsg);
		sysLog.info(emsg, sysUSER_CD);
	}
	
	/**
	 * Structのcopy
	 * @param beforeStruct
	 * @param afterStruct
	 */
	private void copyStruct(AD0130010Struct beforeStruct, AD0130010Struct afterStruct) {
		// 日報区分
		afterStruct.setDAILY_WORK_REPORT_TYP(beforeStruct.getDAILY_WORK_REPORT_TYP());
		// 工場コード
		afterStruct.setPLANT_CD(beforeStruct.getPLANT_CD());
		// 工場コード
		afterStruct.setUSER_PLANT_CD(beforeStruct.getUSER_PLANT_CD());
		// 工場名
		afterStruct.setPLANT_NAME(beforeStruct.getPLANT_NAME());
		// 作業日
		afterStruct.setOPR_DATE_FROM(beforeStruct.getOPR_DATE_FROM());
		afterStruct.setOPR_DATE_TO(beforeStruct.getOPR_DATE_TO());
		// ユーザコード
		afterStruct.setUSER_CD(beforeStruct.getUSER_CD());
		// ユーザ名
		afterStruct.setUSER_NAME(beforeStruct.getUSER_NAME());
		// ラインコード
		afterStruct.setWS_CD(beforeStruct.getWS_CD());
		// ライン名
		afterStruct.setWS_NAME(beforeStruct.getWS_NAME());
	}
	
	/**
	 * structのclear
	 */
	private void clearMainStruct() {
		// 日報区分
		struct.setDAILY_WORK_REPORT_TYP(null);
		// 工場コード
		struct.setPLANT_CD(null);
		// 工場名
		struct.setPLANT_NAME(null);
		// 作業日
		struct.setOPR_DATE_FROM(null);
		struct.setOPR_DATE_TO(null);
		// ユーザコード
		struct.setUSER_CD(null);
		// ユーザ名
		struct.setUSER_NAME(null);
		// ラインコード
		struct.setWS_CD(null);
		// ライン名
		struct.setWS_NAME(null);
	}
	
	/**
	 * チェック時刻
	 * @param time 時刻
	 * @return boolean 
	 * @throws FoundationException,SQLException
	 */
	private boolean checkTimeFormat(String time) throws FoundationException,SQLException
	{
		/* 時刻が3桁の場合は先頭に0を付加する */
		if(time.length() == 3) {
			time = "0" + time;
		}

		/* 時刻の時間が"00"～"23"の間以外の場合はエラーとする */
		if(Integer.parseInt(time.substring(0,2)) < 0 || Integer.parseInt(time.substring(0,2)) > 23) {
			return false;
		}

		/* 時刻の分が"00"～"59"の間以外の場合はエラーとする */
		if(Integer.parseInt(time.substring(2,4)) < 0 || Integer.parseInt(time.substring(2,4)) > 59) {
			return false;
		}

		/* 正常終了 */
		return true;
	}
	
	/**
	 * 時刻表示
	 * @param time 時刻
	 * @param colonFlag :フラグ
	 * @return String 
	 * @throws FoundationException,SQLException
	 */
	private String changeTimeFormat(String time, boolean colonFlag)
	{
		/* 時刻が3桁の場合は先頭に0を付加する */
		if (time == null || "".equals(time) || (time.length() != 3 && time.length() != 4)) {
			return time;
		}
		if(time.length() == 3) {
			time = "0" + time;
		}
		if (colonFlag && time.length() == 4) {
			time = time.substring(0,2) + ":" + time.substring(2,4);
		}
		
		/* 正常終了 */
		return time;
	}
	
	
	/**
	 * 更新処理（人日報）
	 * @param updateFlag 登録　更新フラグ
	 */
	private void updateWorker(boolean updateFlag) throws BusinessProcessException, FoundationException {
		try {
			String property = "OrteusUserDic";
			String locale = CoreTools.getLocale(sysUSER_CD); //  多言語項目取得対応
			ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
			String lineNo= CoreTools.getRBString("Expj.Cmt6789", resource);
			
			// 休日フラグ
			String holidayFlg = "";
			// ラインコードnullカウント
			int lineNullCount  = 0;
			list.clear();
			// 明細行チェック
			AD0130010Struct checkStruct = new AD0130010Struct();	
			for (int i = 0; i < struct.getList_l_SEQ_NO().size(); i++) {
				checkStruct = new AD0130010Struct();
				// 行番号
				checkStruct.setl_SEQ_NO((String)struct.getList_l_SEQ_NO().get(i));
				// ラインコード
				checkStruct.setl_WS_CD((String)struct.getList_l_WS_CD().get(i));
				if (checkStruct.getl_WS_CD() == null || "".equals(checkStruct.getl_WS_CD())) {
					// ライン名
					checkStruct.setl_WS_NAME(null);
					// nullカウント
					lineNullCount++;
				} else {
					// ライン名
					checkStruct.setl_WS_NAME((String)struct.getList_l_WS_NAME().get(i));
				}
				// 開始時刻
				checkStruct.setl_START_TIME((String)struct.getList_l_START_TIME().get(i));
				// 終了時刻
				checkStruct.setl_END_TIME((String)struct.getList_l_END_TIME().get(i));
				// 時間（分）
				checkStruct.setl_OPR_TIME("0");
				// 作業区分
				checkStruct.setl_OPR_TYP((String)struct.getList_l_OPR_TYP().get(i));
				// 不作業理由
				checkStruct.setl_UN_OPR_CAUSE_TYP((String)struct.getList_l_UN_OPR_CAUSE_TYP().get(i));
				// 不作業時間（分）
				checkStruct.setl_UN_OPR_TIME((String)struct.getList_l_UN_OPR_TIME().get(i));
				// 備考
				checkStruct.setl_REMARKS((String)struct.getList_l_REMARKS().get(i));
				// 更新数
				checkStruct.seth_l_MODIFY_COUNT((String)struct.getList_h_l_MODIFY_COUNT().get(i));
				list.add(checkStruct);
			}
			String strline = String.valueOf(lineNullCount);
			// ラインコードが全て入力されていない場合
			if(strline.equals(checkStruct.getl_SEQ_NO())){
				setErrorMessage("AD61011");
				return;
			}
			// ユーザ名
			struct.setUSER_NAME(null);
			// 勤務シフト名
			struct.setWORK_SHIFT_NAME(null);
			
			List resultList = new ArrayList();

			// ユーザコード
			resultList = entity.mselectUSER_MST_PLANT.read(conn, struct);
			if (resultList.isEmpty()) {
				// ユーザ名
				struct.setUSER_NAME(null);
				// ログインユーザーの“工場コード”
				struct.setUSER_PLANT_CD(sysPLANT_CD);
			} else {
				// ユーザ名
				struct.setUSER_NAME(((AD0130010Struct)resultList.get(0)).getUSER_NAME());
				// [ユーザマスタ].“工場コード”
				struct.setUSER_PLANT_CD(((AD0130010Struct)resultList.get(0)).getUSER_PLANT_CD());
			}
			// 作業日
			struct.setw_USER_CD(struct.getUSER_CD());
			resultList = entity.mselectM_CAL_2.read(conn, struct);
			if (resultList.isEmpty()) {
				setErrorMessage("ZZ06002");
				return;
			} else {
				holidayFlg = ((AD0130010Struct)resultList.get(0)).getHOLIDAY_FLG();
			}

			// 勤務シフト
			resultList = entity.mselectUM_WORK_SHIFT_H.read(conn, struct);
			if (resultList.isEmpty()) {
				setErrorMessage("AD61003");
				return;
			} else {
				// 勤務シフト名
				struct.setWORK_SHIFT_NAME(((AD0130010Struct)resultList.get(0)).getWORK_SHIFT_NAME());
			}
			
			AD0130010Struct tempStruct = new AD0130010Struct();
			// 集計時間（分）
			String totalOprTime = "0";
			for (int i = 0; i < list.size(); i++) {
				checkStruct = (AD0130010Struct) list.get(i);
				// ラインコード
				if (checkStruct.getl_WS_CD() == null || "".equals(checkStruct.getl_WS_CD())) {
					if ( (checkStruct.getl_START_TIME() != null && !"".equals(checkStruct.getl_START_TIME()))
							|| (checkStruct.getl_END_TIME() != null && !"".equals(checkStruct.getl_END_TIME()))
							|| (checkStruct.getl_OPR_TYP() != null && !"".equals(checkStruct.getl_OPR_TYP()) && !"0".equals(checkStruct.getl_OPR_TYP()))
							) {
						setErrorMessage("AD20057");
						setErrorMessage("ZZ01006", lineNo + checkStruct.getl_SEQ_NO());
						return;
					}
				} else {
					// ログインユーザの所属工場コード
					tempStruct.setPLANT_CD(sysPLANT_CD);
					// ラインコード
					tempStruct.setWS_CD(checkStruct.getl_WS_CD());
					resultList = entity.mselectM_WS_PLANT.read(conn, tempStruct);
					if (resultList.isEmpty()) {
						// ライン名
						checkStruct.setl_WS_NAME(null);
						setErrorMessage("AA01003");
						setErrorMessage("ZZ01006", lineNo + checkStruct.getl_SEQ_NO());
						return;
					} else {
						// ライン名
						checkStruct.setl_WS_NAME(((AD0130010Struct)resultList.get(0)).getWS_NAME());
					}
					
					// 開始時刻・終了時刻
					if (checkStruct.getl_START_TIME() == null || "".equals(checkStruct.getl_START_TIME()) 
							|| checkStruct.getl_END_TIME() == null || "".equals(checkStruct.getl_END_TIME())) {
						setErrorMessage("AD61004");
						setErrorMessage("ZZ01006", lineNo + checkStruct.getl_SEQ_NO());
						return;
					} else {
						if (checkStruct.getl_START_TIME().length() < 3 || checkStruct.getl_END_TIME().length() < 3) {
							setErrorMessage("AD61005");
							setErrorMessage("ZZ01006", lineNo + checkStruct.getl_SEQ_NO());
							return;
						} else {
							if (!checkTimeFormat(checkStruct.getl_START_TIME()) || !checkTimeFormat(checkStruct.getl_END_TIME()) ) {
								setErrorMessage("AD61006");
								setErrorMessage("ZZ01006", lineNo + checkStruct.getl_SEQ_NO());
								return;
							}
							// 時間帯重複チェック
							AD0130010Struct timeStruct = new AD0130010Struct();
							for (int j = 0; j < i; j++) {
								timeStruct = (AD0130010Struct) list.get(j);
								if (timeStruct.getl_START_TIME() != null && !"".equals(timeStruct.getl_START_TIME())) {
									if (!checkTime(timeStruct.getl_START_TIME(), timeStruct.getl_END_TIME(), checkStruct.getl_START_TIME(), checkStruct.getl_END_TIME())) {
										setErrorMessage("AD61007");
										setErrorMessage("ZZ01006", lineNo + checkStruct.getl_SEQ_NO());
										return;
									}
								}
							}
						}
					}
				}
				// 不作業理由
				if ("0".equals(checkStruct.getl_UN_OPR_CAUSE_TYP())) {
					if (!"0".equals(checkStruct.getl_UN_OPR_TIME())) {
						setErrorMessage("AD61008");
						setErrorMessage("ZZ01006", lineNo + checkStruct.getl_SEQ_NO());
						return;
					}
				} else {
					// 不作業時間
					if ("0".equals(checkStruct.getl_UN_OPR_TIME())) {
						setErrorMessage("AD61009");
						setErrorMessage("ZZ01006", lineNo + checkStruct.getl_SEQ_NO());
						return;
					}
				}
				if ( checkStruct.getl_START_TIME() != null && !"".equals(checkStruct.getl_START_TIME())
						&& checkStruct.getl_END_TIME() != null && !"".equals(checkStruct.getl_END_TIME())) {
					// 時間（分）
					checkStruct.setl_OPR_TIME(getTimeCalculate(struct.getWORK_SHIFT_CODE(), checkStruct.getl_START_TIME(), checkStruct.getl_END_TIME()));
					if ("".equals(checkStruct.getl_OPR_TIME())) {
						setErrorMessage("AD61010", lineNo + checkStruct.getl_SEQ_NO());
						return;
					}
				}
				// 不作業時間（分）
				String unOprTime = checkStruct.getl_UN_OPR_TIME();
				String oprTime = checkStruct.getl_OPR_TIME();
				if (oprTime == null || "".equals(oprTime)) {
					oprTime = "0";
				} 
				if (unOprTime == null || "".equals(unOprTime)) {
					unOprTime = "0";
				}

				if (checkStruct.getl_WS_CD() == null || "".equals(checkStruct.getl_WS_CD())) {
					if (!"0".equals(checkStruct.getl_UN_OPR_CAUSE_TYP())) {
						setErrorMessage("AD20057");
						setErrorMessage("ZZ01006", lineNo + checkStruct.getl_SEQ_NO());
						return;
					}
				}
				if (updateFlag && checkStruct.geth_l_MODIFY_COUNT() != null && !"".equals(checkStruct.geth_l_MODIFY_COUNT())) {
					// 更新数
					checkStruct.seth_DAILY_WORK_REPORT_CTL_NO(struct.geth_DAILY_WORK_REPORT_CTL_NO());
					resultList = entity.mselectUT_DAILY_WORK_REPORT_MODIFY.read(conn, checkStruct);
					if (resultList.isEmpty()) {
						setErrorMessage("ZZ01105");
						return;
					} else {
						tempStruct = (AD0130010Struct) resultList.get(0);
						String modifyCount = tempStruct.getMODIFY_COUNT();
						if (!modifyCount.equals(checkStruct.geth_l_MODIFY_COUNT())) {
							setErrorMessage("ZZ01105");
							return;
						}
					}
				}
				// 集計時間（分）
				totalOprTime = Calculate.add(totalOprTime, oprTime);
			}
			// 時間帯重複チェック
			AD0130010Struct timeStruct = new AD0130010Struct();
			AD0130010Struct timeStruct2 = new AD0130010Struct();
			for (int j = 0; j < list.size(); j++) {
				timeStruct = (AD0130010Struct) list.get(j);
				if (timeStruct.getl_WS_CD() != null && !"".equals(timeStruct.getl_WS_CD())) {
					for(int m = 0; m < list.size(); m++){
						if (m == j){
							continue;
						}
						timeStruct2 = (AD0130010Struct) list.get(m);
						if (timeStruct2.getl_WS_CD() != null && !"".equals(timeStruct2.getl_WS_CD())) {
							if (!checkTime(timeStruct2.getl_START_TIME(), timeStruct2.getl_END_TIME(), timeStruct.getl_START_TIME(), timeStruct.getl_END_TIME())) {
								setErrorMessage("AD61014");
								setErrorMessage("ZZ01006", lineNo + timeStruct.getl_SEQ_NO());
								return;
							}
						}
						
					}
				}
			}
			
			// 作業時間が上限を超えた場合
			if (Calculate.compare(totalOprTime, _MAX_OPR_TIME) > 0) {
				setErrorMessage("AD61012");
				return;
			}
			// “休日フラグ” = 1 (休日) の場合
			if ("1".equals(holidayFlg)) {
				setWarningMessage("AD61013");
			} 
			conn.beginTransWeb();
			if (updateFlag) {
				AD0130010Struct deleteStruct = new AD0130010Struct();
				deleteStruct.seth_DAILY_WORK_REPORT_CTL_NO(struct.geth_DAILY_WORK_REPORT_CTL_NO());
				// 削除
				entity.mdeleteUT_DAILY_WORK_REPORT.delete(conn, deleteStruct);
			}
			
			// 作業時間帯重複チェック
			timeStruct = new AD0130010Struct();
			AD0130010Struct timeResultStruct = new AD0130010Struct();
			timeStruct.setOPR_DATE(struct.getOPR_DATE());
			timeStruct.setUSER_CD(struct.getUSER_CD());
			// 人日報
			timeStruct.setDAILY_WORK_REPORT_TYP("1");
			resultList = entity.mselectUT_DAILY_WORK_REPORT_TIME.read(conn, timeStruct);
			for (int j = 0; j < list.size(); j++) {
				checkStruct = (AD0130010Struct) list.get(j);
				if (checkStruct.getl_WS_CD() != null && !"".equals(checkStruct.getl_WS_CD())) {
					for (int i = 0; i < resultList.size(); i++) {
						timeResultStruct = (AD0130010Struct) resultList.get(i);
						if (!checkTime(timeResultStruct.getSTART_TIME(), timeResultStruct.getEND_TIME(), checkStruct.getl_START_TIME(), checkStruct.getl_END_TIME())) {
							setErrorMessage("AD61014");
							conn.rollback();
							return;
						}
					}
				}
			}
			// 作業時間の集計値（分）
			resultList = entity.mselectSUM_OPR_TIME.read(conn, timeStruct);
			String totalOprTimeDb = ((AD0130010Struct)resultList.get(0)).getTOTAL_OPR_TIME();
			if (totalOprTimeDb == null || "".equals(totalOprTimeDb)) {
				totalOprTimeDb = "0";
			}
			if (Calculate.compare(Calculate.add(totalOprTime, totalOprTimeDb), _MAX_OPR_TIME) > 0) {
				setErrorMessage("AD61012");
				conn.rollback();
				return;
			}
			AD0130010Struct insertStruct = new AD0130010Struct();
			if (updateFlag) {
				// 作業日報管理番号
				insertStruct.setDAILY_WORK_REPORT_CTL_NO(struct.geth_DAILY_WORK_REPORT_CTL_NO());
			} else {
			// 作業日報管理番号
				List nextvalList = entity.mselectUSEQ_DAILY_WORK_REPORT_CTL_NO.read(conn, struct);
				insertStruct.setDAILY_WORK_REPORT_CTL_NO(((AD0130010Struct)nextvalList.get(0)).getDAILY_WORK_REPORT_CTL_NO());
			}
			
			// 工場コード
			insertStruct.setPLANT_CD(struct.getUSER_PLANT_CD());
			// 日報区分
			insertStruct.setDAILY_WORK_REPORT_TYP("1");
			// ユーザコード
			insertStruct.setUSER_CD(struct.getUSER_CD());
			// 作業日
			insertStruct.setOPR_DATE(struct.getOPR_DATE());
			// 勤務シフト
			insertStruct.setWORK_SHIFT_CODE(struct.getWORK_SHIFT_CODE());
			
			AD0130010Struct valueStruct = new AD0130010Struct();
			int lineSeqNo = 0;
			for (int i = 0; i < list.size(); i++) {
				valueStruct = (AD0130010Struct) list.get(i);
				// 行番号
				if ((valueStruct.getl_WS_CD() == null || "".equals(valueStruct.getl_WS_CD()))
						&& (valueStruct.getl_START_TIME() == null || "".equals(valueStruct.getl_START_TIME()))
						&& (valueStruct.getl_END_TIME() == null || "".equals(valueStruct.getl_END_TIME()))
						&& (valueStruct.getl_REMARKS() == null || "".equals(valueStruct.getl_REMARKS()))
						&& ("0".equals(valueStruct.getl_UN_OPR_TIME()))
						) {
					continue;
				} else {
					lineSeqNo++;
					insertStruct.setSEQ_NO(lineSeqNo + "");
				}
				// ラインコード
				insertStruct.setWS_CD(valueStruct.getl_WS_CD());
				// 開始時刻
				insertStruct.setSTART_TIME(changeTimeFormat(valueStruct.getl_START_TIME(), false));
				// 終了時刻
				insertStruct.setEND_TIME(changeTimeFormat(valueStruct.getl_END_TIME(), false));
				// 作業時間
				insertStruct.setOPR_TIME(valueStruct.getl_OPR_TIME());
				// 作業区分
				insertStruct.setOPR_TYP(valueStruct.getl_OPR_TYP());
				// 不作業理由区分
				insertStruct.setUN_OPR_CAUSE_TYP(valueStruct.getl_UN_OPR_CAUSE_TYP());
				// 不作業時間
				insertStruct.setUN_OPR_TIME(valueStruct.getl_UN_OPR_TIME());
				// 備考
				insertStruct.setREMARKS(valueStruct.getl_REMARKS());
				// システムユーザコード
				insertStruct.setsUser_ID(sysUSER_CD);
				entity.minsertUT_DAILY_WORK_REPORT.create(conn, insertStruct);
			}
			conn.commit();
		} catch(Exception e) {
			conn.rollback();
			e.printStackTrace();
			setErrorMessage("ZZ01106");
			setReadStatus(ERROR);
		}
	}
	
	/**
	 * 作業時間計算
	 * @param workShiftCode 勤務シフト
	 * @param startTime 開始時刻
	 * @param endTime 終了時刻
	 * @return
	 * @throws SQLException 
	 * @throws FoundationException 
	 */
	private String getTimeCalculate(String workShiftCode, String startTime, String endTime) throws FoundationException, SQLException {
		String time = "";
		AD0130010Struct tempStruct = new AD0130010Struct();
		List resultList = new ArrayList();
		

		if("0000".equals(struct.getSTART_TIME()) && "0000".equals(struct.getEND_TIME())){
			time = "0";
		} else {
			ResourceBundle rb = SystemConfig.getBundle();
			// LOGモード
			tempStruct.setPVC2LOGMODE(SystemConfig.getProperty("LOG_MODE", rb));
			// ログ出力モード
			tempStruct.setPVC2OUTPUTMODE(SystemConfig.getProperty("OUTPUT_MODE", rb));
			// ログ出力ファイルパス
			tempStruct.setPVC2OUTPUTPATH(SystemConfig.getProperty("OUTPUT_PATH", rb));
			// ログ出力ファイル名
			tempStruct.setPVC2OUTPUTNAME(SystemConfig.getProperty("OUTPUT_NAME", rb));
			// ユーザコード
			tempStruct.setPVC2USERID(this.sysUSER_CD);
			// 業務ID
			tempStruct.setPVC2BUSINESSNAME("AD0130010");
			// 工場コード
			tempStruct.setPVC2PLANTCD(this.sysPLANT_CD);
			// 勤務シフト
			tempStruct.setWORK_SHIFT_CODE(workShiftCode);
			// 開始時刻
			tempStruct.setSTART_TIME(startTime);
			// 終了時刻
			tempStruct.setEND_TIME(endTime);
			resultList = entity.mcallUSQLOPRTIMECALC.call(conn, tempStruct);
			tempStruct = (AD0130010Struct) resultList.get(0);
			if ("9".equals(tempStruct.getRETURN_STATUS())) {
				String locale = CoreTools.getLocale(sysUSER_CD); //  多言語項目取得対応
				setErrorMessage("AD61010", new ExpjMessage(tempStruct.getRETURN_MESSAGE()).getMessage(locale));
			} else {
				time = tempStruct.getOPR_TIME();
			}
		}

		return time;
		
	}
	
	/**
	 * 作業時間帯の重複チェック
	 * @param startTime1　開始時刻
	 * @param endTime1　終了時刻
	 * @param startTime2　開始時刻
	 * @param endTime2　終了時刻
	 * @return
	 */
	private boolean checkTime(String startTime1, String endTime1, String startTime2, String endTime2) {
		if (Calculate.compare(startTime2, endTime2) > 0) {
			if (Calculate.compare(startTime1, startTime2) >= 0 
					|| Calculate.compare(endTime1, startTime2) > 0
					|| Calculate.compare(startTime1, endTime2) < 0
					|| Calculate.compare(endTime1, endTime2) <= 0
					|| (Calculate.compare(startTime1, endTime1) > 0
							&& Calculate.compare(startTime1, startTime2) < 0 
							&& Calculate.compare(endTime1, endTime2) > 0)
					)
			{
				return false;
			}
		} else {
			if (Calculate.compare(startTime1, endTime1) > 0) {
				if (Calculate.compare(startTime1, startTime2) <= 0 
						|| Calculate.compare(startTime1, endTime2) < 0
						|| Calculate.compare(endTime1, startTime2) > 0
						|| Calculate.compare(endTime1, endTime2) >= 0) {
					return false;	
				}
			} else {
				if ((Calculate.compare(startTime1, startTime2) >= 0 
						&& Calculate.compare(startTime1, endTime2) < 0 ) 
						||(Calculate.compare(endTime1, startTime2) > 0
								&& Calculate.compare(endTime1, endTime2) <= 0)
						||(Calculate.compare(startTime1, startTime2) <= 0 
						        && Calculate.compare(endTime1, endTime2) >= 0)) {
					return false;
				}
				
			}
		}
		return true;
	}
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * 読込ボタン押下時に実行される処理です。
	 *
	 */
	public void controlSelect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0130");
		logger.entering("AD0130010Control"+":USER="+struct.getsUser_ID(),"controlSelect");
			//{{user_implement_dev:<controlSelect>
			// TODO: ユーザ定義のコードを記述してください
		try {
			List resultList = new ArrayList();
			// リストをクリア
			setList(null);
			// 工場コード
			struct.setPLANT_NAME(null);
			// ユーザコード
			struct.setUSER_NAME(null);
			// ラインコード
			struct.setWS_NAME(null);
			// 工場コード
			if (struct.getPLANT_CD()!= null && !"".equals(struct.getPLANT_CD())) {
				resultList = entity.mselectM_PLANT.read(conn, struct);
				if (resultList.isEmpty()) {
					setErrorMessage("ZZ09028");
					setReadStatus(ERROR);
					return;
				} else {
					// 工場名
					struct.setPLANT_NAME(((AD0130010Struct)resultList.get(0)).getPLANT_NAME());
				}
			}

			// ユーザコード
			if (struct.getUSER_CD() != null && !"".equals(struct.getUSER_CD())) {

				resultList = entity.mselectUSER_MST_PLANT.read(conn, struct);
				if (resultList.isEmpty()) {
					struct.setUSER_NAME(null);
				} else {
					// ユーザ名
					struct.setUSER_NAME(((AD0130010Struct)resultList.get(0)).getUSER_NAME());
				}
			}
			
			// ラインコード
			if (struct.getWS_CD() != null && !"".equals(struct.getWS_CD())) {
				resultList = entity.mselectM_WS_PLANT.read(conn, struct);
				if (resultList.isEmpty()) {
					setErrorMessage("AA01003");
					setReadStatus(ERROR);
					return;
				} else {
					// ライン名
					struct.setWS_NAME(((AD0130010Struct)resultList.get(0)).getWS_NAME());
				}
			}
			
			// 表示対象のデータが最大表示件数
			int maxLine = sp.getMaxLine(conn,10);
			if (maxLine != 0) {
				struct.setMAX_LINE(maxLine + "");
			} else {
				struct.setMAX_LINE(null);
			}
			list = entity.mSelect.read(conn, struct);
			
			if(list == null || list.size()<= 0 ){
				setReadStatus(NORMAL);
				return;
			} else {
				// 表示対象のデータが最大表示件数を超えた場合。
				if(maxLine != 0 && list.size() == maxLine + 1){
					setErrorMessage("ZZ01119", String.valueOf(maxLine));
					// 検索状態を「最大行数オーバー」に設定
					setReadStatus(TOO_MANY);
					setList(null);
					return;
				} else {
					// 検索状態を「読込成功」に設定
					setReadStatus(NORMAL);
				}
			}
			AD0130010Struct tempStruct = new AD0130010Struct();
			for (int i = 0; i < list.size(); i++) {
				tempStruct = (AD0130010Struct) list.get(i);
				// 日報区分
				tempStruct.setl_DAILY_WORK_REPORT_TYP_SHOW(this.getDisplayName(getComDailyWorkReportTyp(), tempStruct.geth_l_DAILY_WORK_REPORT_TYP()));
				// 不作業理由
				tempStruct.setl_UN_OPR_CAUSE_TYP_SHOW(this.getDisplayName(getComUnOprCauseTyp(), tempStruct.geth_l_UN_OPR_CAUSE_TYP()));
				// 開始時刻
				tempStruct.setl_START_TIME(changeTimeFormat(tempStruct.getl_START_TIME(), true));
				// 終了時刻
				tempStruct.setl_END_TIME(changeTimeFormat(tempStruct.getl_END_TIME(), true));
				// 作業区分
				tempStruct.setl_OPR_TYP_SHOW(this.getDisplayName(getComOprTyp(), tempStruct.geth_l_OPR_TYP()));
				// 不作業理由
				tempStruct.setl_UN_OPR_CAUSE_TYP_SHOW(this.getDisplayName(getComUnOprCauseTyp(), tempStruct.geth_l_UN_OPR_CAUSE_TYP()));
			}
			
			// 不作業時間（分）表示フォーマット
			setUnOprTimeFormat("OBT_INTEGER_Z;4;;");
			
		} catch(Exception e) {
			e.printStackTrace();
			setErrorMessage("ZZ01106");
			setReadStatus(ERROR);
		}
                //}}user_implement_dev:<controlSelect>
		logger.exiting("AD0130010Control"+":USER="+struct.getsUser_ID(),"controlSelect");

		return;
	}

	/**
	 * 行追加ボタン押下時に実行される処理です。
	 *
	 */
	public void controlLineInsert() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0130");
		logger.entering("AD0130010Control"+":USER="+struct.getsUser_ID(),"controlLineInsert");
			//{{user_implement_dev:<controlLineInsert>
			// TODO: ユーザ定義のコードを記述してください
		try {
			copyStruct(struct, mainStruct);
			// パラメータを取得
			PrivateConfig privateConfig = new PrivateConfig(conn);
			// 設定値（作業時間の上限値）を取得する
			_MAX_OPR_TIME = privateConfig.getString("WORK_REPORT_MAX_OPR_TIME");
			if (_MAX_OPR_TIME == null || "".equals(_MAX_OPR_TIME)) {
				setErrorMessage("AD61001");
				return;
			}
			if ("1".equals(struct.getDAILY_WORK_REPORT_TYP())) {
				// 日報の場合
				
				// 設定値（空行表示件数）を取得する
				_ADD_LINE_CNT = privateConfig.getString("WORK_REPORT_LINE_CNT");
				if (_ADD_LINE_CNT == null || "".equals(_ADD_LINE_CNT) || "0".equals(_ADD_LINE_CNT)) {
					setErrorMessage("AD61002");
					return;
				}
				if (list != null) {
					list.clear();
				}
				clearMainStruct();
				// 日報区分
				struct.setDAILY_WORK_REPORT_TYP("1");
				// ユーザコード
				struct.setUSER_CD(sysUSER_CD);
				// 作業日
				struct.setOPR_DATE(getBusinessOprDate());
				AD0130010Struct tempStruct = new AD0130010Struct();
				for (int i = 1; i <= Integer.parseInt(_ADD_LINE_CNT); i++) {
					tempStruct = new AD0130010Struct();
					// 行番号
					tempStruct.setl_SEQ_NO(i+"");
					// 作業区分
					tempStruct.setl_OPR_TYP("0");
					// 不作業理由
					tempStruct.setl_UN_OPR_CAUSE_TYP("0");
					list.add(tempStruct);
				}
			}
			struct.seth_UpdateFlag("false");
			
		} catch(Exception e) {
			e.printStackTrace();
			setErrorMessage("ZZ01106");
			setReadStatus(ERROR);
		}
                //}}user_implement_dev:<controlLineInsert>
		logger.exiting("AD0130010Control"+":USER="+struct.getsUser_ID(),"controlLineInsert");

		return;
	}

	/**
	 * 行修正ボタン押下時に実行される処理です。
	 *
	 */
	public void controlLineUpdate() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0130");
		logger.entering("AD0130010Control"+":USER="+struct.getsUser_ID(),"controlLineUpdate");
			//{{user_implement_dev:<controlLineUpdate>
			// TODO: ユーザ定義のコードを記述してください
		try {
			copyStruct(struct, mainStruct);
			// パラメータを取得
			PrivateConfig privateConfig = new PrivateConfig(conn);
			// 設定値（作業時間の上限値）を取得する
			_MAX_OPR_TIME = privateConfig.getString("WORK_REPORT_MAX_OPR_TIME");
			if (_MAX_OPR_TIME == null || "".equals(_MAX_OPR_TIME)) {
				setErrorMessage("AD61001");
				return;
			}
			// 日報の場合
				
			// 設定値（空行表示件数）を取得する
			_ADD_LINE_CNT = privateConfig.getString("WORK_REPORT_LINE_CNT");
			if (_ADD_LINE_CNT == null || "".equals(_ADD_LINE_CNT)) {
				setErrorMessage("AD61002");
				return;
			}
			List resultList = new ArrayList();
			// ユーザコード
			struct.setUSER_CD(struct.getl_USER_CD());
			// ユーザ名
			resultList = entity.mselectUSER_MST.read(conn, struct);
			if (resultList.isEmpty()) {
				struct.setUSER_NAME(null);
			} else {
				// ユーザ名
				struct.setUSER_NAME(((AD0130010Struct)resultList.get(0)).getUSER_NAME());
			}
			// 作業日
			struct.setOPR_DATE(struct.getl_OPR_DATE());
			// 勤務シフト
			struct.setWORK_SHIFT_CODE(struct.getl_WORK_SHIFT_CODE());
			// 勤務シフト名
			resultList = entity.mselectUM_WORK_SHIFT_H.read(conn, struct);
			if (resultList.isEmpty()) {
				struct.setWORK_SHIFT_NAME(null);
			} else {
				struct.setWORK_SHIFT_NAME(((AD0130010Struct)resultList.get(0)).getWORK_SHIFT_NAME());
			}
				
			resultList = entity.mselectUT_DAILY_WORK_REPORT_WORKER.read(conn, struct);
			if (resultList.isEmpty()) {
				setErrorMessage("ZZ06001");
				return;
			}
			if (list != null) {
				list.clear();
			}
			list.addAll(resultList);
			AD0130010Struct tempStruct = new AD0130010Struct();
			int maxSeqNo = Integer.parseInt(((AD0130010Struct)list.get(list.size()-1)).getl_SEQ_NO());
			// 作業日報管理番号（非表示）
			struct.seth_DAILY_WORK_REPORT_CTL_NO(((AD0130010Struct)list.get(list.size()-1)).geth_DAILY_WORK_REPORT_CTL_NO());
			for (int i = 0; i < list.size(); i++) {
				tempStruct = (AD0130010Struct) list.get(i);
				// 開始時刻
				tempStruct.setl_START_TIME(changeTimeFormat(tempStruct.getl_START_TIME(), false));
				// 終了時刻
				tempStruct.setl_END_TIME(changeTimeFormat(tempStruct.getl_END_TIME(), false));
			}
				
			for (int i = 1; i <= Integer.parseInt(_ADD_LINE_CNT); i++) {
				tempStruct = new AD0130010Struct();
				// 行番号
				tempStruct.setl_SEQ_NO(maxSeqNo + i + "");
				// 作業区分
				tempStruct.setl_OPR_TYP("0");
				// 不作業理由
				tempStruct.setl_UN_OPR_CAUSE_TYP("0");
				list.add(tempStruct);
			}
			struct.seth_UpdateFlag("true");
			
		} catch(Exception e) {
			e.printStackTrace();
			setErrorMessage("ZZ01106");
			setReadStatus(ERROR);
		}
                //}}user_implement_dev:<controlLineUpdate>
		logger.exiting("AD0130010Control"+":USER="+struct.getsUser_ID(),"controlLineUpdate");

		return;
	}

	/**
	 * 行削除ボタン押下時に実行される処理です。
	 *
	 */
	public void controlLineDelete() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0130");
		logger.entering("AD0130010Control"+":USER="+struct.getsUser_ID(),"controlLineDelete");
			//{{user_implement_dev:<controlLineDelete>
			// TODO: ユーザ定義のコードを記述してください
		try {
			conn.beginTransWeb();
			List modifyList = new ArrayList();
			for (int i = 0; i < struct.getList_l_DAILY_WORK_REPORT_CTL_NO().size(); i++) {
				
				struct.seth_DAILY_WORK_REPORT_CTL_NO((String)struct.getList_l_DAILY_WORK_REPORT_CTL_NO().get(i));
				// 日報の場合
				struct.setl_SEQ_NO((String)struct.getList_h_l_SEQ_NO().get(i));

				modifyList = entity.mselectUT_DAILY_WORK_REPORT_MODIFY.read(conn, struct);
				if (modifyList.isEmpty()) {
					setErrorMessage("ZZ01105");
					conn.rollback();
					return;
				} else {
					AD0130010Struct modifyStruct = (AD0130010Struct) modifyList.get(0);
					String modifyCount = modifyStruct.getMODIFY_COUNT();
					String checkModify = (String)struct.getList_h_l_MODIFY_COUNT().get(i);
					if (!modifyCount.equals(checkModify)) {
						setErrorMessage("ZZ01105");
						conn.rollback();
						return;
					}
				}
				entity.mdeleteUT_DAILY_WORK_REPORT.delete(conn, struct);
			}
			conn.commit();
			controlSelect();
			
		} catch(Exception e) {
			conn.rollback();
			e.printStackTrace();
			setErrorMessage("ZZ01106");
			setReadStatus(ERROR);
		}
                //}}user_implement_dev:<controlLineDelete>
		logger.exiting("AD0130010Control"+":USER="+struct.getsUser_ID(),"controlLineDelete");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0130");
		logger.entering("AD0130010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
			// TODO: ユーザ定義のコードを記述してください
		if (list == null) {
			list = new ArrayList();
		} else {
			list.clear();
		}
		setReadStatus(INITIAL);

		try {
			//業務運用日の取得
			try {
				setBusinessOprDate(DateCtrlControl.getData(conn, getsysPLANT_CD()).getBUSINESS_OPR_DATE());
			} catch (Exception e) {
				ExpjMessage emsg = new ExpjMessage("AC34080");
				sysLog.severe(emsg, getsysUSER_CD());          //致命的エラー エラー内容
				ExpjException ee = new ExpjException(emsg);    // エクセプションを生成
				ee.setLocale(CoreTools.getLocale(getsysUSER_CD()));
				throw ee;
			}
			if (_BUSINESS_OPR_DATE == null || "".equals(_BUSINESS_OPR_DATE)) {
				ExpjMessage emsg = new ExpjMessage("AC34080");
				sysLog.severe(emsg, getsysUSER_CD());          //致命的エラー エラー内容
				ExpjException ee = new ExpjException(emsg);    // エクセプションを生成
				ee.setLocale(CoreTools.getLocale(getsysUSER_CD()));
				throw ee;
			}
            // ログインユーザ の工場コード
            struct.setPLANT_CD(getsysPLANT_CD());
            struct.setUSER_PLANT_CD(getsysPLANT_CD());
            // 日報区分  1:日報
            struct.setDAILY_WORK_REPORT_TYP("1");
            // 作業日(FROM)
            struct.setOPR_DATE_FROM(getBusinessOprDate());
            // 作業日(TO)
            struct.setOPR_DATE_TO(getBusinessOprDate());
            // ユーザコード
            struct.setUSER_CD(getsysUSER_CD());
		} catch (ExpjException ee){
        	throw ee;
        } catch (Exception e) {
			e.printStackTrace();
			setErrorMessage("ZZ01106");
			setReadStatus(ERROR);
		}
                //}}user_implement_dev:<controlClear>
		logger.exiting("AD0130010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * 閉じるボタン押下時に実行される処理です。
	 *
	 */
	public void controlClose() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0130");
		logger.entering("AD0130010Control"+":USER="+struct.getsUser_ID(),"controlClose");
			//{{user_implement_dev:<controlClose>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlClose>
		logger.exiting("AD0130010Control"+":USER="+struct.getsUser_ID(),"controlClose");

		return;
	}

	/**
	 * 戻るボタン押下時に実行される処理です。
	 *
	 */
	public void controlsub1_Return() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0130");
		logger.entering("AD0130010Control"+":USER="+struct.getsUser_ID(),"controlsub1_Return");
			//{{user_implement_dev:<controlsub1_Return>
			// TODO: ユーザ定義のコードを記述してください
		struct.setUSER_PLANT_CD(null);
		copyStruct(mainStruct, struct);
		controlSelect();
		
                //}}user_implement_dev:<controlsub1_Return>
		logger.exiting("AD0130010Control"+":USER="+struct.getsUser_ID(),"controlsub1_Return");

		return;
	}

	/**
	 * 登録ボタン押下時に実行される処理です。
	 *
	 */
	public void controlsub1_Insert() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0130");
		logger.entering("AD0130010Control"+":USER="+struct.getsUser_ID(),"controlsub1_Insert");
			//{{user_implement_dev:<controlsub1_Insert>
			// TODO: ユーザ定義のコードを記述してください
		try {
			updateWorker(false);			
		} catch(Exception e) {
			e.printStackTrace();
			setErrorMessage("ZZ01106");
			setReadStatus(ERROR);
		}
                //}}user_implement_dev:<controlsub1_Insert>
		logger.exiting("AD0130010Control"+":USER="+struct.getsUser_ID(),"controlsub1_Insert");

		return;
	}

	/**
	 * 更新ボタン押下時に実行される処理です。
	 *
	 */
	public void controlsub1_Update() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0130");
		logger.entering("AD0130010Control"+":USER="+struct.getsUser_ID(),"controlsub1_Update");
			//{{user_implement_dev:<controlsub1_Update>
			// TODO: ユーザ定義のコードを記述してください
		try {
			updateWorker(true);
		} catch(Exception e) {
			e.printStackTrace();
			setErrorMessage("ZZ01106");
			setReadStatus(ERROR);
		}
                //}}user_implement_dev:<controlsub1_Update>
		logger.exiting("AD0130010Control"+":USER="+struct.getsUser_ID(),"controlsub1_Update");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0130");
		logger.entering("AD0130010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
			// TODO: ユーザ定義のコードを記述してください
        controlClear();
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AD0130010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0130");
		logger.entering("AD0130010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
			// TODO: ユーザ定義のコードを記述してください
        controlClear();

		try {
            // 画面遷移の呼び出しだったら、Structに画面遷移キーを設定してcontrolSelect()を呼び出す
            if ( isScreenMove() == true ) {
                struct.setDAILY_WORK_REPORT_TYP(this.getP_DAILY_WORK_REPORT_TYP());
                struct.setPLANT_CD(this.getP_PLANT_CD());
                struct.setUSER_PLANT_CD(this.getP_PLANT_CD());
                struct.setOPR_DATE_FROM(this.getP_OPR_DATE_FROM());
                struct.setOPR_DATE_TO(this.getP_OPR_DATE_TO());
                struct.setUSER_CD(this.getP_USER_CD());
                struct.setWS_CD(this.getP_WS_CD());

                // 検索のコントロールメソッドを呼び出します。
                controlSelect();
            }
		} catch(Exception e) {
			e.printStackTrace();
			setReadStatus(ERROR);
		}

                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AD0130010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * イベントハンドラの前処理です。
	 *
	 * @param buttun ボタン名
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0130");
		logger.entering("AD0130010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			// 日報区分をセット
			try {
				// コンボボックスデータを取得
				ComboBox cb = new ComboBox(conn, sysUSER_CD);
				
				// 日報区分
				setComDailyWorkReportTyp(cb.getData("DAILY_WORK_REPORT_TYP_01"));
				struct.setList_DAILY_WORK_REPORT_TYP_name(getComDailyWorkReportTyp().getExplanList());
				struct.setList_DAILY_WORK_REPORT_TYP_val(getComDailyWorkReportTyp().getValList());
				
				//不作業理由区分をセット
				setComUnOprCauseTyp(cb.getData("UN_OPR_CAUSE_CD_01"));
				struct.setList_l_UN_OPR_CAUSE_TYP_name(getComUnOprCauseTyp().getExplanList());
				struct.setList_l_UN_OPR_CAUSE_TYP_val(getComUnOprCauseTyp().getValList());
				
				//作業区分をセット
				setComOprTyp(cb.getData("OPR_TYP_CD_01"));
				struct.setList_l_OPR_TYP_name(getComOprTyp().getExplanList());
				struct.setList_l_OPR_TYP_val(getComOprTyp().getValList());
				
			} catch (Exception e) {
				e.printStackTrace();
				setErrorMessage("ZZ01106");
				setReadStatus(ERROR);
			}
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("AD0130010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("LineDelete") ) {
				controlLineDelete();
			} else if( button.equals("Clear") ) {
				controlClear();
			} else if( button.equals("Close") ) {
				controlClose();
			} else if( button.equals("sub1_Return") ) {
				controlsub1_Return();
			} else if( button.equals("sub1_Insert") ) {
				controlsub1_Insert();
			} else if( button.equals("sub1_Update") ) {
				controlsub1_Update();
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
//			throw new FoundationException("AD0130010Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AD0130010-E999","CSVの出力処理"));
			throw new FoundationException("AD0130010Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AD0130010-E999","システム日付の取得処理"));
				throw new FoundationException("AD0130010Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AD0130010-E999","コントロールのイベント処理"));
			throw new FoundationException("AD0130010Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected AD0130010Entity entity;
	protected AD0130010Struct struct;
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

		entity = new AD0130010Entity();
		struct = new AD0130010Struct();

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
	 * AD0130010クラスの標準コンストラクタ
	 */
	public AD0130010Control() throws BusinessProcessException, FoundationException
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
				AD0130010Struct key = (AD0130010Struct)keyList.get(j);
				// メッセージキーを作成する
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("DAILY_WORK_REPORT_TYP_name") && key.getDAILY_WORK_REPORT_TYP_name() != null) {
					msgKey.setKeyValue("DAILY_WORK_REPORT_TYP_name", key.getDAILY_WORK_REPORT_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("DAILY_WORK_REPORT_TYP_val") && key.getDAILY_WORK_REPORT_TYP_val() != null) {
					msgKey.setKeyValue("DAILY_WORK_REPORT_TYP_val", key.getDAILY_WORK_REPORT_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("l_DAILY_WORK_REPORT_TYP_SHOW") && key.getl_DAILY_WORK_REPORT_TYP_SHOW() != null) {
					msgKey.setKeyValue("l_DAILY_WORK_REPORT_TYP_SHOW", key.getl_DAILY_WORK_REPORT_TYP_SHOW());
				}
				if(msgKeyType.containsKeyColumn("l_OPR_TYP_SHOW") && key.getl_OPR_TYP_SHOW() != null) {
					msgKey.setKeyValue("l_OPR_TYP_SHOW", key.getl_OPR_TYP_SHOW());
				}
				if(msgKeyType.containsKeyColumn("l_UN_OPR_CAUSE_TYP_SHOW") && key.getl_UN_OPR_CAUSE_TYP_SHOW() != null) {
					msgKey.setKeyValue("l_UN_OPR_CAUSE_TYP_SHOW", key.getl_UN_OPR_CAUSE_TYP_SHOW());
				}
				if(msgKeyType.containsKeyColumn("l_OPR_TYP_name") && key.getl_OPR_TYP_name() != null) {
					msgKey.setKeyValue("l_OPR_TYP_name", key.getl_OPR_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("l_OPR_TYP_val") && key.getl_OPR_TYP_val() != null) {
					msgKey.setKeyValue("l_OPR_TYP_val", key.getl_OPR_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("l_UN_OPR_CAUSE_TYP_name") && key.getl_UN_OPR_CAUSE_TYP_name() != null) {
					msgKey.setKeyValue("l_UN_OPR_CAUSE_TYP_name", key.getl_UN_OPR_CAUSE_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("l_UN_OPR_CAUSE_TYP_val") && key.getl_UN_OPR_CAUSE_TYP_val() != null) {
					msgKey.setKeyValue("l_UN_OPR_CAUSE_TYP_val", key.getl_UN_OPR_CAUSE_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("h_UpdateFlag") && key.geth_UpdateFlag() != null) {
					msgKey.setKeyValue("h_UpdateFlag", key.geth_UpdateFlag());
				}
				if(msgKeyType.containsKeyColumn("l_PLANT_CD") && key.getl_PLANT_CD() != null) {
					msgKey.setKeyValue("l_PLANT_CD", key.getl_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("h_l_DAILY_WORK_REPORT_TYP") && key.geth_l_DAILY_WORK_REPORT_TYP() != null) {
					msgKey.setKeyValue("h_l_DAILY_WORK_REPORT_TYP", key.geth_l_DAILY_WORK_REPORT_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_USER_CD") && key.getl_USER_CD() != null) {
					msgKey.setKeyValue("l_USER_CD", key.getl_USER_CD());
				}
				if(msgKeyType.containsKeyColumn("l_OPR_DATE") && key.getl_OPR_DATE() != null) {
					msgKey.setKeyValue("l_OPR_DATE", key.getl_OPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_WORK_SHIFT_CODE") && key.getl_WORK_SHIFT_CODE() != null) {
					msgKey.setKeyValue("l_WORK_SHIFT_CODE", key.getl_WORK_SHIFT_CODE());
				}
				if(msgKeyType.containsKeyColumn("l_START_TIME") && key.getl_START_TIME() != null) {
					msgKey.setKeyValue("l_START_TIME", key.getl_START_TIME());
				}
				if(msgKeyType.containsKeyColumn("l_END_TIME") && key.getl_END_TIME() != null) {
					msgKey.setKeyValue("l_END_TIME", key.getl_END_TIME());
				}
				if(msgKeyType.containsKeyColumn("l_OPR_TIME") && key.getl_OPR_TIME() != null) {
					msgKey.setKeyValue("l_OPR_TIME", key.getl_OPR_TIME());
				}
				if(msgKeyType.containsKeyColumn("l_WS_CD") && key.getl_WS_CD() != null) {
					msgKey.setKeyValue("l_WS_CD", key.getl_WS_CD());
				}
				if(msgKeyType.containsKeyColumn("h_l_OPR_TYP") && key.geth_l_OPR_TYP() != null) {
					msgKey.setKeyValue("h_l_OPR_TYP", key.geth_l_OPR_TYP());
				}
				if(msgKeyType.containsKeyColumn("h_l_UN_OPR_CAUSE_TYP") && key.geth_l_UN_OPR_CAUSE_TYP() != null) {
					msgKey.setKeyValue("h_l_UN_OPR_CAUSE_TYP", key.geth_l_UN_OPR_CAUSE_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_UN_OPR_TIME") && key.getl_UN_OPR_TIME() != null) {
					msgKey.setKeyValue("l_UN_OPR_TIME", key.getl_UN_OPR_TIME());
				}
				if(msgKeyType.containsKeyColumn("l_DAILY_WORK_REPORT_CTL_NO") && key.getl_DAILY_WORK_REPORT_CTL_NO() != null) {
					msgKey.setKeyValue("l_DAILY_WORK_REPORT_CTL_NO", key.getl_DAILY_WORK_REPORT_CTL_NO());
				}
				if(msgKeyType.containsKeyColumn("h_l_SEQ_NO") && key.geth_l_SEQ_NO() != null) {
					msgKey.setKeyValue("h_l_SEQ_NO", key.geth_l_SEQ_NO());
				}
				if(msgKeyType.containsKeyColumn("h_l_MODIFY_COUNT") && key.geth_l_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("h_l_MODIFY_COUNT", key.geth_l_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("USER_PLANT_CD") && key.getUSER_PLANT_CD() != null) {
					msgKey.setKeyValue("USER_PLANT_CD", key.getUSER_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("DAILY_WORK_REPORT_TYP") && key.getDAILY_WORK_REPORT_TYP() != null) {
					msgKey.setKeyValue("DAILY_WORK_REPORT_TYP", key.getDAILY_WORK_REPORT_TYP());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("OPR_DATE_FROM") && key.getOPR_DATE_FROM() != null) {
					msgKey.setKeyValue("OPR_DATE_FROM", key.getOPR_DATE_FROM());
				}
				if(msgKeyType.containsKeyColumn("OPR_DATE_TO") && key.getOPR_DATE_TO() != null) {
					msgKey.setKeyValue("OPR_DATE_TO", key.getOPR_DATE_TO());
				}
				if(msgKeyType.containsKeyColumn("USER_CD") && key.getUSER_CD() != null) {
					msgKey.setKeyValue("USER_CD", key.getUSER_CD());
				}
				if(msgKeyType.containsKeyColumn("WS_CD") && key.getWS_CD() != null) {
					msgKey.setKeyValue("WS_CD", key.getWS_CD());
				}
				if(msgKeyType.containsKeyColumn("MAX_LINE") && key.getMAX_LINE() != null) {
					msgKey.setKeyValue("MAX_LINE", key.getMAX_LINE());
				}
				if(msgKeyType.containsKeyColumn("PLANT_NAME") && key.getPLANT_NAME() != null) {
					msgKey.setKeyValue("PLANT_NAME", key.getPLANT_NAME());
				}
				if(msgKeyType.containsKeyColumn("USER_NAME") && key.getUSER_NAME() != null) {
					msgKey.setKeyValue("USER_NAME", key.getUSER_NAME());
				}
				if(msgKeyType.containsKeyColumn("h_DAILY_WORK_REPORT_CTL_NO") && key.geth_DAILY_WORK_REPORT_CTL_NO() != null) {
					msgKey.setKeyValue("h_DAILY_WORK_REPORT_CTL_NO", key.geth_DAILY_WORK_REPORT_CTL_NO());
				}
				if(msgKeyType.containsKeyColumn("l_SEQ_NO") && key.getl_SEQ_NO() != null) {
					msgKey.setKeyValue("l_SEQ_NO", key.getl_SEQ_NO());
				}
				if(msgKeyType.containsKeyColumn("l_WS_NAME") && key.getl_WS_NAME() != null) {
					msgKey.setKeyValue("l_WS_NAME", key.getl_WS_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_OPR_TYP") && key.getl_OPR_TYP() != null) {
					msgKey.setKeyValue("l_OPR_TYP", key.getl_OPR_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_UN_OPR_CAUSE_TYP") && key.getl_UN_OPR_CAUSE_TYP() != null) {
					msgKey.setKeyValue("l_UN_OPR_CAUSE_TYP", key.getl_UN_OPR_CAUSE_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_REMARKS") && key.getl_REMARKS() != null) {
					msgKey.setKeyValue("l_REMARKS", key.getl_REMARKS());
				}
				if(msgKeyType.containsKeyColumn("WORK_SHIFT_NAME") && key.getWORK_SHIFT_NAME() != null) {
					msgKey.setKeyValue("WORK_SHIFT_NAME", key.getWORK_SHIFT_NAME());
				}
				if(msgKeyType.containsKeyColumn("WORK_SHIFT_CODE") && key.getWORK_SHIFT_CODE() != null) {
					msgKey.setKeyValue("WORK_SHIFT_CODE", key.getWORK_SHIFT_CODE());
				}
				if(msgKeyType.containsKeyColumn("MODIFY_COUNT") && key.getMODIFY_COUNT() != null) {
					msgKey.setKeyValue("MODIFY_COUNT", key.getMODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("DAILY_WORK_REPORT_CTL_NO") && key.getDAILY_WORK_REPORT_CTL_NO() != null) {
					msgKey.setKeyValue("DAILY_WORK_REPORT_CTL_NO", key.getDAILY_WORK_REPORT_CTL_NO());
				}
				if(msgKeyType.containsKeyColumn("SEQ_NO") && key.getSEQ_NO() != null) {
					msgKey.setKeyValue("SEQ_NO", key.getSEQ_NO());
				}
				if(msgKeyType.containsKeyColumn("OPR_DATE") && key.getOPR_DATE() != null) {
					msgKey.setKeyValue("OPR_DATE", key.getOPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("START_TIME") && key.getSTART_TIME() != null) {
					msgKey.setKeyValue("START_TIME", key.getSTART_TIME());
				}
				if(msgKeyType.containsKeyColumn("END_TIME") && key.getEND_TIME() != null) {
					msgKey.setKeyValue("END_TIME", key.getEND_TIME());
				}
				if(msgKeyType.containsKeyColumn("OPR_TIME") && key.getOPR_TIME() != null) {
					msgKey.setKeyValue("OPR_TIME", key.getOPR_TIME());
				}
				if(msgKeyType.containsKeyColumn("OPR_TYP") && key.getOPR_TYP() != null) {
					msgKey.setKeyValue("OPR_TYP", key.getOPR_TYP());
				}
				if(msgKeyType.containsKeyColumn("UN_OPR_CAUSE_TYP") && key.getUN_OPR_CAUSE_TYP() != null) {
					msgKey.setKeyValue("UN_OPR_CAUSE_TYP", key.getUN_OPR_CAUSE_TYP());
				}
				if(msgKeyType.containsKeyColumn("UN_OPR_TIME") && key.getUN_OPR_TIME() != null) {
					msgKey.setKeyValue("UN_OPR_TIME", key.getUN_OPR_TIME());
				}
				if(msgKeyType.containsKeyColumn("REMARKS") && key.getREMARKS() != null) {
					msgKey.setKeyValue("REMARKS", key.getREMARKS());
				}
				if(msgKeyType.containsKeyColumn("TOTAL_OPR_TIME") && key.getTOTAL_OPR_TIME() != null) {
					msgKey.setKeyValue("TOTAL_OPR_TIME", key.getTOTAL_OPR_TIME());
				}
				if(msgKeyType.containsKeyColumn("PVC2LOGMODE") && key.getPVC2LOGMODE() != null) {
					msgKey.setKeyValue("PVC2LOGMODE", key.getPVC2LOGMODE());
				}
				if(msgKeyType.containsKeyColumn("PVC2OUTPUTMODE") && key.getPVC2OUTPUTMODE() != null) {
					msgKey.setKeyValue("PVC2OUTPUTMODE", key.getPVC2OUTPUTMODE());
				}
				if(msgKeyType.containsKeyColumn("PVC2OUTPUTPATH") && key.getPVC2OUTPUTPATH() != null) {
					msgKey.setKeyValue("PVC2OUTPUTPATH", key.getPVC2OUTPUTPATH());
				}
				if(msgKeyType.containsKeyColumn("PVC2OUTPUTNAME") && key.getPVC2OUTPUTNAME() != null) {
					msgKey.setKeyValue("PVC2OUTPUTNAME", key.getPVC2OUTPUTNAME());
				}
				if(msgKeyType.containsKeyColumn("PVC2USERID") && key.getPVC2USERID() != null) {
					msgKey.setKeyValue("PVC2USERID", key.getPVC2USERID());
				}
				if(msgKeyType.containsKeyColumn("PVC2BUSINESSNAME") && key.getPVC2BUSINESSNAME() != null) {
					msgKey.setKeyValue("PVC2BUSINESSNAME", key.getPVC2BUSINESSNAME());
				}
				if(msgKeyType.containsKeyColumn("PVC2PLANTCD") && key.getPVC2PLANTCD() != null) {
					msgKey.setKeyValue("PVC2PLANTCD", key.getPVC2PLANTCD());
				}
				if(msgKeyType.containsKeyColumn("RETURN_MESSAGE") && key.getRETURN_MESSAGE() != null) {
					msgKey.setKeyValue("RETURN_MESSAGE", key.getRETURN_MESSAGE());
				}
				if(msgKeyType.containsKeyColumn("RETURN_STATUS") && key.getRETURN_STATUS() != null) {
					msgKey.setKeyValue("RETURN_STATUS", key.getRETURN_STATUS());
				}
				if(msgKeyType.containsKeyColumn("WS_NAME") && key.getWS_NAME() != null) {
					msgKey.setKeyValue("WS_NAME", key.getWS_NAME());
				}
				if(msgKeyType.containsKeyColumn("HOLIDAY_FLG") && key.getHOLIDAY_FLG() != null) {
					msgKey.setKeyValue("HOLIDAY_FLG", key.getHOLIDAY_FLG());
				}
				if(msgKeyType.containsKeyColumn("w_USER_CD") && key.getw_USER_CD() != null) {
					msgKey.setKeyValue("w_USER_CD", key.getw_USER_CD());
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
					AD0130010Struct key = new AD0130010Struct();
					if(msgKeyType.containsKeyColumn("DAILY_WORK_REPORT_TYP_name")) {
						key.setDAILY_WORK_REPORT_TYP_name(msgKey.getKeyValue("DAILY_WORK_REPORT_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("DAILY_WORK_REPORT_TYP_val")) {
						key.setDAILY_WORK_REPORT_TYP_val(msgKey.getKeyValue("DAILY_WORK_REPORT_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("l_DAILY_WORK_REPORT_TYP_SHOW")) {
						key.setl_DAILY_WORK_REPORT_TYP_SHOW(msgKey.getKeyValue("l_DAILY_WORK_REPORT_TYP_SHOW"));
					}
					if(msgKeyType.containsKeyColumn("l_OPR_TYP_SHOW")) {
						key.setl_OPR_TYP_SHOW(msgKey.getKeyValue("l_OPR_TYP_SHOW"));
					}
					if(msgKeyType.containsKeyColumn("l_UN_OPR_CAUSE_TYP_SHOW")) {
						key.setl_UN_OPR_CAUSE_TYP_SHOW(msgKey.getKeyValue("l_UN_OPR_CAUSE_TYP_SHOW"));
					}
					if(msgKeyType.containsKeyColumn("l_OPR_TYP_name")) {
						key.setl_OPR_TYP_name(msgKey.getKeyValue("l_OPR_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("l_OPR_TYP_val")) {
						key.setl_OPR_TYP_val(msgKey.getKeyValue("l_OPR_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("l_UN_OPR_CAUSE_TYP_name")) {
						key.setl_UN_OPR_CAUSE_TYP_name(msgKey.getKeyValue("l_UN_OPR_CAUSE_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("l_UN_OPR_CAUSE_TYP_val")) {
						key.setl_UN_OPR_CAUSE_TYP_val(msgKey.getKeyValue("l_UN_OPR_CAUSE_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("h_UpdateFlag")) {
						key.seth_UpdateFlag(msgKey.getKeyValue("h_UpdateFlag"));
					}
					if(msgKeyType.containsKeyColumn("l_PLANT_CD")) {
						key.setl_PLANT_CD(msgKey.getKeyValue("l_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_l_DAILY_WORK_REPORT_TYP")) {
						key.seth_l_DAILY_WORK_REPORT_TYP(msgKey.getKeyValue("h_l_DAILY_WORK_REPORT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_USER_CD")) {
						key.setl_USER_CD(msgKey.getKeyValue("l_USER_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_OPR_DATE")) {
						key.setl_OPR_DATE(msgKey.getKeyValue("l_OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_WORK_SHIFT_CODE")) {
						key.setl_WORK_SHIFT_CODE(msgKey.getKeyValue("l_WORK_SHIFT_CODE"));
					}
					if(msgKeyType.containsKeyColumn("l_START_TIME")) {
						key.setl_START_TIME(msgKey.getKeyValue("l_START_TIME"));
					}
					if(msgKeyType.containsKeyColumn("l_END_TIME")) {
						key.setl_END_TIME(msgKey.getKeyValue("l_END_TIME"));
					}
					if(msgKeyType.containsKeyColumn("l_OPR_TIME")) {
						key.setl_OPR_TIME(msgKey.getKeyValue("l_OPR_TIME"));
					}
					if(msgKeyType.containsKeyColumn("l_WS_CD")) {
						key.setl_WS_CD(msgKey.getKeyValue("l_WS_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_l_OPR_TYP")) {
						key.seth_l_OPR_TYP(msgKey.getKeyValue("h_l_OPR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("h_l_UN_OPR_CAUSE_TYP")) {
						key.seth_l_UN_OPR_CAUSE_TYP(msgKey.getKeyValue("h_l_UN_OPR_CAUSE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_UN_OPR_TIME")) {
						key.setl_UN_OPR_TIME(msgKey.getKeyValue("l_UN_OPR_TIME"));
					}
					if(msgKeyType.containsKeyColumn("l_DAILY_WORK_REPORT_CTL_NO")) {
						key.setl_DAILY_WORK_REPORT_CTL_NO(msgKey.getKeyValue("l_DAILY_WORK_REPORT_CTL_NO"));
					}
					if(msgKeyType.containsKeyColumn("h_l_SEQ_NO")) {
						key.seth_l_SEQ_NO(msgKey.getKeyValue("h_l_SEQ_NO"));
					}
					if(msgKeyType.containsKeyColumn("h_l_MODIFY_COUNT")) {
						key.seth_l_MODIFY_COUNT(msgKey.getKeyValue("h_l_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("USER_PLANT_CD")) {
						key.setUSER_PLANT_CD(msgKey.getKeyValue("USER_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("DAILY_WORK_REPORT_TYP")) {
						key.setDAILY_WORK_REPORT_TYP(msgKey.getKeyValue("DAILY_WORK_REPORT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("OPR_DATE_FROM")) {
						key.setOPR_DATE_FROM(msgKey.getKeyValue("OPR_DATE_FROM"));
					}
					if(msgKeyType.containsKeyColumn("OPR_DATE_TO")) {
						key.setOPR_DATE_TO(msgKey.getKeyValue("OPR_DATE_TO"));
					}
					if(msgKeyType.containsKeyColumn("USER_CD")) {
						key.setUSER_CD(msgKey.getKeyValue("USER_CD"));
					}
					if(msgKeyType.containsKeyColumn("WS_CD")) {
						key.setWS_CD(msgKey.getKeyValue("WS_CD"));
					}
					if(msgKeyType.containsKeyColumn("MAX_LINE")) {
						key.setMAX_LINE(msgKey.getKeyValue("MAX_LINE"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_NAME")) {
						key.setPLANT_NAME(msgKey.getKeyValue("PLANT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("USER_NAME")) {
						key.setUSER_NAME(msgKey.getKeyValue("USER_NAME"));
					}
					if(msgKeyType.containsKeyColumn("h_DAILY_WORK_REPORT_CTL_NO")) {
						key.seth_DAILY_WORK_REPORT_CTL_NO(msgKey.getKeyValue("h_DAILY_WORK_REPORT_CTL_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_SEQ_NO")) {
						key.setl_SEQ_NO(msgKey.getKeyValue("l_SEQ_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_WS_NAME")) {
						key.setl_WS_NAME(msgKey.getKeyValue("l_WS_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_OPR_TYP")) {
						key.setl_OPR_TYP(msgKey.getKeyValue("l_OPR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_UN_OPR_CAUSE_TYP")) {
						key.setl_UN_OPR_CAUSE_TYP(msgKey.getKeyValue("l_UN_OPR_CAUSE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_REMARKS")) {
						key.setl_REMARKS(msgKey.getKeyValue("l_REMARKS"));
					}
					if(msgKeyType.containsKeyColumn("WORK_SHIFT_NAME")) {
						key.setWORK_SHIFT_NAME(msgKey.getKeyValue("WORK_SHIFT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("WORK_SHIFT_CODE")) {
						key.setWORK_SHIFT_CODE(msgKey.getKeyValue("WORK_SHIFT_CODE"));
					}
					if(msgKeyType.containsKeyColumn("MODIFY_COUNT")) {
						key.setMODIFY_COUNT(msgKey.getKeyValue("MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("DAILY_WORK_REPORT_CTL_NO")) {
						key.setDAILY_WORK_REPORT_CTL_NO(msgKey.getKeyValue("DAILY_WORK_REPORT_CTL_NO"));
					}
					if(msgKeyType.containsKeyColumn("SEQ_NO")) {
						key.setSEQ_NO(msgKey.getKeyValue("SEQ_NO"));
					}
					if(msgKeyType.containsKeyColumn("OPR_DATE")) {
						key.setOPR_DATE(msgKey.getKeyValue("OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("START_TIME")) {
						key.setSTART_TIME(msgKey.getKeyValue("START_TIME"));
					}
					if(msgKeyType.containsKeyColumn("END_TIME")) {
						key.setEND_TIME(msgKey.getKeyValue("END_TIME"));
					}
					if(msgKeyType.containsKeyColumn("OPR_TIME")) {
						key.setOPR_TIME(msgKey.getKeyValue("OPR_TIME"));
					}
					if(msgKeyType.containsKeyColumn("OPR_TYP")) {
						key.setOPR_TYP(msgKey.getKeyValue("OPR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("UN_OPR_CAUSE_TYP")) {
						key.setUN_OPR_CAUSE_TYP(msgKey.getKeyValue("UN_OPR_CAUSE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("UN_OPR_TIME")) {
						key.setUN_OPR_TIME(msgKey.getKeyValue("UN_OPR_TIME"));
					}
					if(msgKeyType.containsKeyColumn("REMARKS")) {
						key.setREMARKS(msgKey.getKeyValue("REMARKS"));
					}
					if(msgKeyType.containsKeyColumn("TOTAL_OPR_TIME")) {
						key.setTOTAL_OPR_TIME(msgKey.getKeyValue("TOTAL_OPR_TIME"));
					}
					if(msgKeyType.containsKeyColumn("PVC2LOGMODE")) {
						key.setPVC2LOGMODE(msgKey.getKeyValue("PVC2LOGMODE"));
					}
					if(msgKeyType.containsKeyColumn("PVC2OUTPUTMODE")) {
						key.setPVC2OUTPUTMODE(msgKey.getKeyValue("PVC2OUTPUTMODE"));
					}
					if(msgKeyType.containsKeyColumn("PVC2OUTPUTPATH")) {
						key.setPVC2OUTPUTPATH(msgKey.getKeyValue("PVC2OUTPUTPATH"));
					}
					if(msgKeyType.containsKeyColumn("PVC2OUTPUTNAME")) {
						key.setPVC2OUTPUTNAME(msgKey.getKeyValue("PVC2OUTPUTNAME"));
					}
					if(msgKeyType.containsKeyColumn("PVC2USERID")) {
						key.setPVC2USERID(msgKey.getKeyValue("PVC2USERID"));
					}
					if(msgKeyType.containsKeyColumn("PVC2BUSINESSNAME")) {
						key.setPVC2BUSINESSNAME(msgKey.getKeyValue("PVC2BUSINESSNAME"));
					}
					if(msgKeyType.containsKeyColumn("PVC2PLANTCD")) {
						key.setPVC2PLANTCD(msgKey.getKeyValue("PVC2PLANTCD"));
					}
					if(msgKeyType.containsKeyColumn("RETURN_MESSAGE")) {
						key.setRETURN_MESSAGE(msgKey.getKeyValue("RETURN_MESSAGE"));
					}
					if(msgKeyType.containsKeyColumn("RETURN_STATUS")) {
						key.setRETURN_STATUS(msgKey.getKeyValue("RETURN_STATUS"));
					}
					if(msgKeyType.containsKeyColumn("WS_NAME")) {
						key.setWS_NAME(msgKey.getKeyValue("WS_NAME"));
					}
					if(msgKeyType.containsKeyColumn("HOLIDAY_FLG")) {
						key.setHOLIDAY_FLG(msgKey.getKeyValue("HOLIDAY_FLG"));
					}
					if(msgKeyType.containsKeyColumn("w_USER_CD")) {
						key.setw_USER_CD(msgKey.getKeyValue("w_USER_CD"));
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
