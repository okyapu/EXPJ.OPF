/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AF0100/src/com/nec/jp/orteus/metamorBase/AF0100/AF0100010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AF0100;

import com.nec.jp.orteus.metamorBase.AF0100.*;
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
//-----------------------------------------------------------------------------
import com.nec.jp.orteus.metamorBase.util.AlarmMessage.AlarmMessageException;
import com.nec.jp.orteus.metamorBase.common.CollectNumber.CollectNumber;

//import com.nec.jp.orteus.metamorBase.common01.RcvIssue.RcvProcess;
import com.nec.jp.orteus.expj.lot.BizCommon;
import com.nec.jp.orteus.expj.pr.rcvissue.process.RcvProcess;
import com.nec.jp.orteus.expj.pr.rcvissue.util.StringUtil;
import com.nec.jp.orteus.metamorBase.common01.util.Calculate;
import com.nec.jp.orteus.metamorBase.common08.LotCtrl.LotCtrl;

import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.math.BigDecimal;
//-----------------------------------------------------------------------------
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AF0100010Control
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
	public AF0100010Struct getListvalue(int x) { return (AF0100010Struct)(this.list.get(x)); }	// リストの値を返します。
	public AF0100010Struct getStruct() { return this.struct; }	// Structを返します。
	public AF0100010Struct createStruct() { return new AF0100010Struct(); }	// 新しいStructを作って返します。
	public void setStruct(Object structname) { this.struct.setStruct((AF0100010Struct)structname); }	// Structをセットします。
//	public void initializeStruct() { this.struct.initialize(); }	// Structの値を初期化します。

	// CSV出力用リスト
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }


//------------- 状態 ----------------------------------------------------------

	/** モード */
	private String _mode = _NORMAL;

	/** モードの取得 
	 * @return モード
	*/
	public String getMode(){ return _mode; }

	/** モードの設定 
	 * @param mode モード
	*/
	public void setMode(String mode){ _mode = mode; }

	/** 画面モード 検索処理 */	
	private final static String _SELECT = "select";

	/** 画面モード 検索/閉じる以外の処理 */
	private final static String _NORMAL = "normal";

	/** 画面モード 閉じる処理 */
	private final static String _CLOSE = "close";

	/** 画面モード 登録処理 */
	private final static String _INSERT = "insert";


//---------- メッセージ関連の処理-- --------------------------------------------

	/**
	 * メッセージ取得 
	 * @return メッセージ
	 */
	public MessageStruct getMessage()
	{
		return msgStruct;
	}

	/**
	 * メッセージ設定
	 * @param メッセージ
	 */
	public void setMessage(MessageStruct msg)
	{
		msgStruct = msg;
	}


//------------------------------------------------------------------------

	/** ユーザ定義の初期化済フラグ */
	private boolean _usersIntialized = false;

	/**
	 * ユーザ定義 初期化処理
	 */
	private void usersInitialize() throws ExpjException
	{
		// モード設定
		_mode = _NORMAL;

		if(_usersIntialized) return;

		_usersIntialized = true;
		return ;
	}

//-----------------------------------------------------------------------------

	/** 日付フォーマット */
	//private SimpleDateFormat _dateFormat = new SimpleDateFormat("yyyy/MM/dd");

	/**
	 * Date型 ⇒ String型。
	 * @return String YYYY/MM/DD形式
	 */
	public String dateToString(Date date)
	{
		//return _dateFormat.format(date);
		return Converter.dateToStr(date, "yyyy/MM/dd");
	}

	/**
	 * String型 ⇒ Date型。
	 * @return Date 
	 */
	public Date stringToDate(String date) throws ParseException
	{
		//return _dateFormat.parse(date);
		return Converter.strToDate(date, "yyyy/MM/dd");
	}

//-----------------------------------------------------------------------------

    /** 画面共通定義取得クラス */
    ScreenParam _scParam = sp;

	/** システムログメッセージ作成用 */
	private StringBuffer _sysLogMessage;
//------------------------------------------------------------------------
	/**
	 * SQLExceptionエラーメッセージ設定
	 * @param SQLException
	 * @param 出力エラーメッセージ
	 */
	private void setSqlExceptionMsg(SQLException e) throws ExpjException
	{
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);

			throw ee;
	}

		
	/**
	 * エラーメッセージ設定
	 * @param メッセージ番号
	 * @param 出力メッセージ
	 */
	private void setErrorMessage(String messageno, String message)
	{
		ExpjMessage emsg = new ExpjMessage( messageno );
		msgStruct.addError( emsg );
		sysLog.warning(emsg, getsysUSER_CD());
		emsg = new ExpjMessage( "ZZ01006", message );
		msgStruct.addError( emsg );
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
	 * エラーメッセージ設定
	 * @param メッセージ番号
	 * @param 出力メッセージ
	 * @param 置換文字列１
	 */
	private void setErrorMessage(String messageno, String message, String value1)
	{
		ExpjMessage emsg = new ExpjMessage( messageno , value1 );
		msgStruct.addError( emsg );
		sysLog.warning(emsg, getsysUSER_CD());
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
	 * 業務ロジックのワーニングメッセージ設定処理を切り出して関数化
	 * @param code メッセージコード
	 */
	private void setWarningMessage(String code) {
		ExpjMessage emsg = new ExpjMessage(code);
		msgStruct.addWarn(emsg);
		sysLog.info(emsg, getsysUSER_CD());
	}
	
	/**
	 * 警告メッセージ設定
	 * @param メッセージ番号
	 * @param 出力メッセージ
	 */
	private void setWarnMessage(String messageno, String message)
	{
		ExpjMessage emsg = new ExpjMessage( messageno );
		msgStruct.addWarn( emsg );
		sysLog.info(emsg, getsysUSER_CD());
		emsg = new ExpjMessage( "ZZ01006", message );
		msgStruct.addWarn( emsg );
		sysLog.info(emsg, getsysUSER_CD());
	}
		
	/**
	 * 情報メッセージ設定
	 * @param メッセージ番号
	 * @param 出力メッセージ
	 */
	private void setInfoMessage(String messageno, String message)
	{
		ExpjMessage emsg = new ExpjMessage( messageno );
		msgStruct.addInfo( emsg );
		sysLog.config(emsg, getsysUSER_CD());
		emsg = new ExpjMessage( "ZZ01006", message );
		msgStruct.addInfo( emsg );
		sysLog.config(emsg, getsysUSER_CD());
	}
		
	/**
	 * ログメッセージ設定
	 * @param メッセージ番号
	 * @param 出力メッセージ
	 */
	private void setSyslogConfig(String message)
	{
		ExpjMessage emsg = new ExpjMessage( "ZZ01006", message );
		sysLog.config(emsg, getsysUSER_CD());
	}

	/**
	 * システムパラメータ取得
	 */
	private boolean getSysParameter() throws BusinessProcessException, FoundationException {
		boolean b = true;
		try {
			List sysParameterList = entity.mSELECT_SYS_PARAMETER.read(conn, struct);
			if(sysParameterList == null || sysParameterList.isEmpty()) return b;
			AF0100010Struct sysParameterStruct = (AF0100010Struct) sysParameterList.get(0);
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
			AF0100010Struct procExecDateStruct = (AF0100010Struct) procExecDateList.get(0);
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
	 * 業務ロジックのエラーメッセージ設定処理を切り出して関数化
	 * @param code メッセージコード
	 */
	private void setErrorMessage(String code) {
		ExpjMessage emsg = new ExpjMessage(code);
		msgStruct.addError(emsg);
		sysLog.warning(emsg, sysUSER_CD);
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
	 * 業務ロジックのワーニングメッセージ設定処理を切り出して関数化
	 * @param code メッセージコード
	 */
	private void setWarningMessage(String code, String msg1, String msg2) {
		ExpjMessage emsg = new ExpjMessage(code, msg1, msg2);
		msgStruct.addWarn(emsg);
		sysLog.info(emsg, sysUSER_CD);
	}
//-----------------------------------------------------------------------------
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * 読込ボタン押下時に実行される処理です。
	 *
	 */
	public void controlselect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0100");
		logger.entering("AF0100010Control"+":USER="+struct.getsUser_ID(),"controlselect");
			//{{user_implement_dev:<controlselect>
		//---------------------------------------------------------------------
		// ログ出力情報格納用
		String logMessage = "";
		List listMessage = new ArrayList();

		try {
			boolean result = true;			// チェック結果格納

			// クリア
			struct.setITEM_NAME((String)null);
			struct.setDRAW_CD((String)null);
			struct.setSPEC((String)null);
			struct.setSTOCK_UNIT((String)null);
			struct.setWH_NAME((String)null);

			if(_mode != _INSERT)
			{
				// 入力項目のクリア（登録後の再読込のときはクリアしない）
				struct.setRCV_ISSUE_QTY(new String("0.0"));
				struct.setRCV_ISSUE_DATE((String)null);
				struct.setNON_PLANNED_CAUSE_CD((String)null);
				struct.setVEND_LOT_NO((String)null);
			}

			// 品目情報取得
			List itemList = entity.mselectM_ITEM.read(conn, struct);
			if(itemList.size() <= 0){
				// 読込処理失敗：品目番号が存在しません
				logMessage = "M_ITEM.ITEM_CD:" + struct.getITEM_CD();
				setErrorMessage("AF00020", logMessage);
				return ;
			}
			
// 2008/09/02 ADD TSUCHIDA START
			if(((AF0100010Struct)itemList.get(0)).getw_MANHOUR_TYP().equals("1")) {
				// 読込処理失敗：品目番号に、工数管理品目は指定できません。
				logMessage = "M_ITEM.ITEM_CD:" + struct.getITEM_CD();
				setErrorMessage("AA00188", logMessage);
				return ;
			}
// 2008/09/02 ADD TSUCHIDA END
			if(((AF0100010Struct)itemList.get(0)).getMRP_ODR_TYP().equals("8")) {
				// 読込処理失敗：擬似品目は指定できません。
				logMessage = "M_ITEM.ITEM_CD:" + struct.getITEM_CD();
				setErrorMessage("AH00028", logMessage);
				return ;
			}
			
			// 品目情報設定
			AF0100010Struct itemStruct = (AF0100010Struct)itemList.get(0);
			struct.setITEM_NAME(itemStruct.getITEM_NAME());
			struct.setDRAW_CD(itemStruct.getDRAW_CD());
			struct.setSPEC(itemStruct.getSPEC());
			struct.setSTOCK_UNIT(itemStruct.getSTOCK_UNIT());
			struct.setLOT_CTRL_FLG(itemStruct.getLOT_CTRL_FLG());
			struct.setLOT_NUMBERING_TYP(itemStruct.getLOT_NUMBERING_TYP());

			// キー項目ログ表示
			logMessage = "JOB_ODR_CD:" + struct.getJOB_ODR_CD()
							+ ",ITEM_CD:" + struct.getITEM_CD()
							+ ", WH_CD:" + struct.getWH_CD()
							+ ", LOT_NO:" + struct.getLOT_NO()
							+ ", PLANT_CD:" + struct.getPLANT_CD();
			setSyslogConfig(logMessage);
			
			// 保管区情報取得
			List whList = entity.mselectM_WH.read(conn, struct);
			if(whList.size() <= 0){
				// 読込処理失敗：保管区コードが存在しません
				logMessage = "M_WH.WH_CD:" + struct.getWH_CD();
				setErrorMessage("AF00022", logMessage);
				return ;
			}
			// 保管区情報設定
			AF0100010Struct whStruct = (AF0100010Struct) whList.get(0);
			struct.setWH_NAME(whStruct.getWH_NAME());

			// 保管区の工場コードチェック
			result = entity.mcheckM_WH_plant_cd.check(conn, struct);
			if (result == false) {
				// 読込処理失敗：保管区コードは他の工場のデータなので指定できません
				listMessage.add("M_WH.WH_CD:" + struct.getWH_CD());
				setErrorMessage("AF00023", listMessage);
				listMessage.clear();
				return ;
			}
			

			// 在庫ロットチェック
			if("true".equals(struct.geth_SYS_LOT_CTRL_FLG())) {
				if ("1".equals(struct.getLOT_CTRL_FLG())) {
					// 1：ロット管理を行う
					if (struct.getLOT_NO() == null
							|| "".equals(struct.getLOT_NO())) {
						if("0".equals(struct.getLOT_NUMBERING_TYP())){
							// 読込処理失敗：指定した品目は在庫ロット番号を省略できません。。
							listMessage.add("M_ITEM.ITEM_CD:" + struct.getITEM_CD());
							listMessage.add("M_ITEM.LOT_CTRL_FLG:" + struct.getLOT_CTRL_FLG());
							listMessage.add("M_ITEM.LOT_NUMBERING_TYP:" + struct.getLOT_NUMBERING_TYP());
							setErrorMessage("AF20005", listMessage);
							listMessage.clear();
							return ;
						}
					} else {
						if(!"0".equals(struct.getLOT_NUMBERING_TYP())){
							// ロット管理のチェック
							result = entity.mT_LOT_CTRL.check(conn, struct);
							if(result == false){
								// 読込処理失敗：ロット管理データは存在しません。
								listMessage.add("T_LOT_CTRL.LOT_NO:" + struct.getLOT_NO());
								listMessage.add("T_LOT_CTRL.ITEM_CD:" + struct.getITEM_CD());
								setErrorMessage("AF20002", listMessage);
								listMessage.clear();
								return ;
							}
						}
					}
				} else {
					// 0：ロット管理を行わない
					if (struct.getLOT_NO() != null
							&& !"".equals(struct.getLOT_NO())) {
						// 読込処理失敗：在庫ロット番号は入力できません。
						listMessage.add("M_ITEM.ITEM_CD:" + struct.getITEM_CD());
						listMessage.add("M_ITEM.h_LOT_CTRL_FLG:" + struct.getLOT_CTRL_FLG());
						setErrorMessage("AF20006", listMessage);
						listMessage.clear();
						return ;
					}
				}
			}
			// チェックでエラーが発生していない場合
			if(msgStruct.sizeError() <= 0)
			{
				List buffList = null;
				AF0100010Struct buffStruct = null;
				String s_num = new String("0.0");
				// 品目在庫から入庫する場合
				if(struct.getw_JOB_ODR().intValue() == 0){
					// 保管区在庫数取得
					buffList = entity.mselectT_ITEM_STOCK_stock_on_hand_qty.read(conn, struct);
					if(buffList.size() <= 0)
						struct.setw_WH_STOCK_ON_HAND_QTY(s_num);
					else{
						buffStruct = (AF0100010Struct)buffList.get(0);
						struct.setw_WH_STOCK_ON_HAND_QTY(buffStruct.getw_WH_STOCK_ON_HAND_QTY());
					}

					// 保管区不良在庫数取得
					buffList = entity.mselectT_ITEM_STOCK_defect_qty.read(conn, struct);
					if(buffList.size() <= 0)
						struct.setDEFECT_QTY(s_num);
					else{
						buffStruct = (AF0100010Struct)buffList.get(0);
						struct.setDEFECT_QTY(buffStruct.getDEFECT_QTY());
					}

					// 在庫累計数取得
					buffList = entity.mselectT_ITEM_STOCK_sum_total_stock_on_hand_qty.read(conn, struct);
					if(buffList.size() <= 0)
						struct.setw_TOTAL_STOCK_ON_HAND_QTY(s_num);
					else{
						buffStruct = (AF0100010Struct)buffList.get(0);

						if(buffStruct.getw_TOTAL_STOCK_ON_HAND_QTY() == null ||
							"".equals(buffStruct.getw_TOTAL_STOCK_ON_HAND_QTY()) == true)
							struct.setw_TOTAL_STOCK_ON_HAND_QTY(s_num);
						else
							struct.setw_TOTAL_STOCK_ON_HAND_QTY(buffStruct.getw_TOTAL_STOCK_ON_HAND_QTY());
					}

					// 不良品在庫累計数取得
					buffList = entity.mselectT_ITEM_STOCK_sum_total_defect_qty.read(conn, struct);
					if(buffList.size() <= 0)
						struct.setw_TOTAL_DEFECT_QTY(s_num);
					else{
						buffStruct = (AF0100010Struct)buffList.get(0);

						if(buffStruct.getw_TOTAL_DEFECT_QTY() == null ||
							"".equals(buffStruct.getw_TOTAL_DEFECT_QTY()) == true)
							struct.setw_TOTAL_DEFECT_QTY(s_num);
						else
							struct.setw_TOTAL_DEFECT_QTY(buffStruct.getw_TOTAL_DEFECT_QTY());
					}
				}
				// 製番在庫から入庫する場合
				else{
					// 保管区在庫数取得
					buffList = entity.mselectT_JOB_ODR_CD_STOCK_stock_on_hand_qty.read(conn, struct);
					if(buffList.size() <= 0)
						struct.setw_WH_STOCK_ON_HAND_QTY(s_num);
					else{
						buffStruct = (AF0100010Struct)buffList.get(0);
						struct.setw_WH_STOCK_ON_HAND_QTY(buffStruct.getw_WH_STOCK_ON_HAND_QTY());
					}

					// 在庫累計数取得
					buffList = entity.mselectT_JOB_ODR_CD_STOCK_sum_total_stock_on_hand_qty.read(conn, struct);
					if(buffList.size() <= 0)
						struct.setw_TOTAL_STOCK_ON_HAND_QTY(s_num);
					else{
						buffStruct = (AF0100010Struct)buffList.get(0);

						if(buffStruct.getw_TOTAL_STOCK_ON_HAND_QTY() == null ||
							"".equals(buffStruct.getw_TOTAL_STOCK_ON_HAND_QTY()) == true)
							struct.setw_TOTAL_STOCK_ON_HAND_QTY(s_num);
						else
							struct.setw_TOTAL_STOCK_ON_HAND_QTY(buffStruct.getw_TOTAL_STOCK_ON_HAND_QTY());
					}

					// 不良品在庫のクリア
					struct.setDEFECT_QTY((String)null);
					struct.setw_TOTAL_DEFECT_QTY((String)null);
				}

				// ロット在庫の取得
				if ("true".equals(struct.geth_SYS_LOT_CTRL_FLG()) && "1".equals(struct.getLOT_CTRL_FLG())) {
					// 1：ロット管理を行う
					buffList = null;
					buffStruct = new AF0100010Struct();
					buffList = entity.mT_LOT_STOCK.read(conn, struct);
					if (buffList.size() > 0) {
						buffStruct = (AF0100010Struct)buffList.get(0);
						struct.setLOT_STOCK_ON_HAND_QTY(buffStruct.getLOT_STOCK_ON_HAND_QTY());
						struct.setLOT_DEFECT_QTY(buffStruct.getLOT_DEFECT_QTY());
						struct.setALLOCABLE_QTY(buffStruct.getALLOCABLE_QTY());
					} else {
						struct.setLOT_STOCK_ON_HAND_QTY(new String("0.0"));
						struct.setLOT_DEFECT_QTY(new String("0.0"));
						struct.setALLOCABLE_QTY(new String("0.0"));
					}
				}
				else{
					struct.setLOT_STOCK_ON_HAND_QTY(null);
					struct.setLOT_DEFECT_QTY(null);
					struct.setALLOCABLE_QTY(null);
				}
			}

			if(_mode != _INSERT)
			{
				// 業務運用日取得
				struct.setPLANT_CD(getsysPLANT_CD());
				String s_date = null;
				List dateList = entity.mselectSYS_DATE_CTRL.read(conn, struct);
				if(dateList.size() <= 0){
					// 登録処理失敗：業務運用日が存在しません
					logMessage = "SYS_DATE_CTRL.PLANT_CD:" + struct.getPLANT_CD();
					setErrorMessage("AF00056", logMessage);
				}
				else{
					AF0100010Struct dateStruct = (AF0100010Struct)dateList.get(0);
					s_date = dateStruct.getBUSINESS_OPR_DATE();
				}
				// 業務運用日設定
				struct.setRCV_ISSUE_DATE(s_date);
				struct.setBUSINESS_OPR_DATE(s_date);
			}

			// チェックでエラーが発生している場合
			if(msgStruct.sizeError() > 0)
			{
				// 数値項目のクリア
				struct.setw_WH_STOCK_ON_HAND_QTY((String)null);
				struct.setDEFECT_QTY((String)null);
				struct.setw_TOTAL_STOCK_ON_HAND_QTY((String)null);
				struct.setw_TOTAL_DEFECT_QTY((String)null);
				
				if ("true".equals(struct.geth_SYS_LOT_CTRL_FLG())) {
					struct.setLOT_STOCK_ON_HAND_QTY(null);
					struct.setLOT_DEFECT_QTY(null);
					struct.setALLOCABLE_QTY(null);
				}
			}

		}catch(SQLException e){
			setSqlExceptionMsg(e);

		}finally{
				_mode = _SELECT;
		}
		//---------------------------------------------------------------------
                //}}user_implement_dev:<controlselect>
		logger.exiting("AF0100010Control"+":USER="+struct.getsUser_ID(),"controlselect");

		return;
	}

	/**
	 * 登録ボタン押下時に実行される処理です。
	 *
	 */
	public void controlinsert() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0100");
		logger.entering("AF0100010Control"+":USER="+struct.getsUser_ID(),"controlinsert");
			//{{user_implement_dev:<controlinsert>
		//---------------------------------------------------------------------
		// ログ出力情報格納用
		String logMessage = "";
		List listMessage = new ArrayList();

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
			
			// トランザクション開始
			conn.beginTransWeb();

			boolean result = true;			// チェック結果格納
			
			BizCommon bc = new BizCommon(conn, getsysUSER_CD(), sp.getProcId(), getsysPLANT_CD());

			// クリア
			struct.setITEM_NAME((String)null);
			struct.setDRAW_CD((String)null);
			struct.setSPEC((String)null);
			struct.setSTOCK_UNIT((String)null);
			struct.setWH_NAME((String)null);

			// 品目情報取得
			List itemList = entity.mselectM_ITEM.read(conn, struct);
			AF0100010Struct itemStruct = null;
			if(itemList.size() <= 0){
				// 登録処理失敗：品目番号が存在しません
				logMessage = "M_ITEM.ITEM_CD:" + struct.getITEM_CD();
				setErrorMessage("AF00020", logMessage);
				return ;
			}
			else{
// 2008/09/02 ADD TSUCHIDA START
				if(((AF0100010Struct)itemList.get(0)).getw_MANHOUR_TYP().equals("1")) {
					// 読込処理失敗：品目番号に、工数管理品目は指定できません。
					logMessage = "M_ITEM.ITEM_CD:" + struct.getITEM_CD();
					setErrorMessage("AA00188", logMessage);
					return ;
				}
// 2008/09/02 ADD TSUCHIDA END
				if(((AF0100010Struct)itemList.get(0)).getMRP_ODR_TYP().equals("8")) {
					// 読込処理失敗：擬似品目は指定できません。
					logMessage = "M_ITEM.ITEM_CD:" + struct.getITEM_CD();
					setErrorMessage("AH00028", logMessage);
					return ;
				}
				
				// 品目情報設定
				itemStruct = (AF0100010Struct)itemList.get(0);
				struct.setITEM_NAME(itemStruct.getITEM_NAME());
				struct.setDRAW_CD(itemStruct.getDRAW_CD());
				struct.setSPEC(itemStruct.getSPEC());
				struct.setSTOCK_UNIT(itemStruct.getSTOCK_UNIT());
				struct.setLOT_CTRL_FLG(itemStruct.getLOT_CTRL_FLG());
				struct.setLOT_NUMBERING_TYP(itemStruct.getLOT_NUMBERING_TYP());
			}

			// 保管区情報取得
			List whList = entity.mselectM_WH.read(conn, struct);
			AF0100010Struct whStruct = null;
			if(whList.size() <= 0){
				// 登録処理失敗：保管区コードが存在しません
				logMessage = "M_WH.WH_CD:" + struct.getWH_CD();
				setErrorMessage("AF00022", logMessage);
				return ;
			}
			else{
				// 保管区情報設定
				whStruct = (AF0100010Struct)whList.get(0);
				struct.setWH_NAME(whStruct.getWH_NAME());

				// 保管区の工場コードチェック
				result = entity.mcheckM_WH_plant_cd.check(conn, struct);
				if(result == false){
					// 登録処理失敗：保管区コードは他の工場のデータなので指定できません
					listMessage.add("M_WH.WH_CD:" + struct.getWH_CD());
					setErrorMessage("AF00023", listMessage);
					listMessage.clear();
					return ;
				}
			}


			// 在庫ロットチェック
			if("true".equals(struct.geth_SYS_LOT_CTRL_FLG())) {
				if ("1".equals(struct.getLOT_CTRL_FLG())) {
					// 1：ロット管理を行う
					if (struct.getLOT_NO() == null
							|| "".equals(struct.getLOT_NO())){
						// 1:自動採番しない
						if("0".equals(struct.getLOT_NUMBERING_TYP())){
							// 読込処理失敗：在庫ロット番号は省略できません。
							listMessage.add("M_ITEM.ITEM_CD:" + struct.getITEM_CD());
							listMessage.add("M_ITEM.h_LOT_CTRL_FLG:" + struct.getLOT_CTRL_FLG());
							listMessage.add("M_ITEM.LOT_NUMBERING_TYP:" + struct.getLOT_NUMBERING_TYP());
							setErrorMessage("AF20005", listMessage);
							listMessage.clear();
							return ;
						}else{// 2or3:自動採番を行う
							// 在庫ロット番号の自動採番を行う。
							String itemCdStr = struct.getITEM_CD();//品目番号
							String acptDateStr = struct.getRCV_ISSUE_DATE();//受入日付/製造日付
							List resultList = bc.getsetLotNumberingFd(itemCdStr, acptDateStr);
							if(bc.getResultStatus().intValue() == 1){
						        String result1 = (String)resultList.get(0);
						        struct.setLOT_NO(result1);//振替先ロット番号に採番したロット番号を設定
								
								// [ロット管理]."製造完了日"を更新する
								struct.setPRD_CMPLT_DATE(struct.getRCV_ISSUE_DATE());
								entity.mT_LOT_CTRL.update(conn, struct);
							}else{
						    	if(resultList != null && resultList.size() > 1){
							        // 登録処理失敗：在庫ロット採番処理でエラー
							    	String result2 = (String)resultList.get(1);
									logMessage = "LotNumberingFd was Failed..." ;
									setErrorMessage(result2, logMessage);

									// ロールバック
									conn.rollback();
									ExpjMessage emsg = new ExpjMessage(result2);
									throw new FoundationException("AF0100010Control","controlinsert()",emsg.getMessage(CoreTools.getLocale(this.getsysUSER_CD())) );
							    }
						    }
						}
					} else {
						// ロット管理のチェック
						result = entity.mT_LOT_CTRL.check(conn, struct);
						if(result == false && !"0".equals(struct.getLOT_NUMBERING_TYP())){
							// 読込処理失敗：指定した品目の新規在庫ロット番号は自動採番してください。
							listMessage.add("T_LOT_CTRL.ITEM_CD:" + struct.getITEM_CD());
							listMessage.add("M_ITEM.h_LOT_CTRL_FLG:" + struct.getLOT_CTRL_FLG());
							setErrorMessage("AF20007", listMessage);
							listMessage.clear();
							return ;
						}else if(result == false && "0".equals(struct.getLOT_NUMBERING_TYP())){
							// 採番区分が自動採番しない場合は[ロット管理]に追加
							//賞味期限自動計算 
							if(StringUtil.Validate(struct.getITEM_CD()) 
									&& StringUtil.Validate(struct.getRCV_ISSUE_DATE())) {
								List resList = new ArrayList();
								Integer retSts;
								String errCode = null;
								
								resList = bc.calcBestBeforeFd(struct.getITEM_CD(), struct.getRCV_ISSUE_DATE());
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
							struct.setPRD_CMPLT_DATE(struct.getRCV_ISSUE_DATE());
							entity.mT_LOT_CTRL.create(conn, struct);
						}else if(result == true){

							// システムパラメータの品質期限チェックフラグを取得
							List sysParaList = entity.mselectSYS_PARAM.read(conn,struct);
							if(sysParaList.size() > 0){
								AF0100010Struct sysParaStruct = (AF0100010Struct)sysParaList.get(0);
								struct.setBEST_BEFORE_DATE_CHECK_FLG(sysParaStruct.getBEST_BEFORE_DATE_CHECK_FLG());
							}else{
								struct.setBEST_BEFORE_DATE_CHECK_FLG("1");
							}
							
							//  [ロット管理].”賞味期限”＜ 「出庫日」の場合
							List bbdList = entity.mc_BEST_BEFORE_DATE.read(conn, struct);
							if(bbdList.size() > 0){
								AF0100010Struct bbdStruct = (AF0100010Struct)bbdList.get(0);
								// 品質期限チェックフラグが1:エラーの場合
								if(bbdStruct.getBBD_c_FLG().equals("1") && struct.getBEST_BEFORE_DATE_CHECK_FLG().equals("1")){
									//品質期限が切れています。
									setErrorMessage("AD00114");
									setWarningSysLogMessage("T_LOTL_CTRL.LOT_NO", struct.getLOT_NO());
								}// 品質期限チェックフラグが2:警告の場合
								else if(bbdStruct.getBBD_c_FLG().equals("1") && struct.getBEST_BEFORE_DATE_CHECK_FLG().equals("2")){
									//品質期限切れのロットを使用しました。
									setWarningMessage("AD00115");
									setWarningSysLogMessage("T_LOTL.LOT_NO", this.struct.getLOT_NO());
								}
							}
						
							
						}
					}
				} else {
					// 0：ロット管理を行わない
					if (struct.getLOT_NO() != null
							&& !"".equals(struct.getLOT_NO())) {
						// 読込処理失敗：在庫ロット番号は入力できません。
						listMessage.add("M_ITEM.ITEM_CD:" + struct.getITEM_CD());
						listMessage.add("M_ITEM.h_LOT_CTRL_FLG:" + struct.getLOT_CTRL_FLG());
						setErrorMessage("AF20006", listMessage);
						listMessage.clear();
						return ;
					}
				}
			}
			
			// 業務運用日取得
			List dateList = entity.mselectSYS_DATE_CTRL.read(conn, struct);
			AF0100010Struct dateStruct = null;
			if(dateList.size() <= 0){
				// 登録処理失敗：業務運用日が存在しません
				logMessage = "SYS_DATE_CTRL.PLANT_CD:" + struct.getPLANT_CD();
				setErrorMessage("AF00056", logMessage);
				return ;
			}
			else{
				dateStruct = (AF0100010Struct)dateList.get(0);

				// 入庫日チェック
				Date issue_Date = stringToDate(struct.getRCV_ISSUE_DATE());
				Date business_Date = stringToDate(dateStruct.getBUSINESS_OPR_DATE());
				if(issue_Date.getTime() > business_Date.getTime()){
					// 登録処理失敗：入庫日に未来の日付は指定できません
					logMessage = "SYS_DATE_CTRL.BUSINESS_OPR_DATE:" + dateStruct.getBUSINESS_OPR_DATE();
					setErrorMessage("ZZ05103", logMessage);
					return ;
				}
			}


			// チェックでエラーが発生していない場合
			if(msgStruct.sizeError() <= 0)
			{
				// 入出庫管理番号採番
				String ctrlCd = null;
				CollectNumber collect = new CollectNumber(
												CollectNumber.ISSUE_CD,
												getsysUSER_CD(), 
												this.sp.getProcId(), 
												struct.getPLANT_CD());
				try{
					ctrlCd = collect.getNo();
					if(ctrlCd == null){
						ExpjMessage emsg = new ExpjMessage("AF00057");
						throw new FoundationException(
											"AF0100010Control",
											"controlinsert()",
											emsg.getMessage(CoreTools.getLocale(this.getsysUSER_CD())) );
					}
				}
				catch(FoundationException ex){
						// 登録処理失敗：入出庫管理番号の採番に失敗しました
						logMessage = "UserID:" + getsysUSER_CD()
									+ ", ProcID:" + this.sp.getProcId()
									+ ", PLANT_CD:" + struct.getPLANT_CD();
						setErrorMessage("AF00057", logMessage);
						
						ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
						sysLog.severe(emsg, getsysUSER_CD());
						ExpjException ee = new ExpjException(ex, emsg);
						throw ee;
				}

				// チェックでエラーが発生していない場合
				if(msgStruct.sizeError() <= 0)
				{
					// ログ出力
					logMessage = "T_RCV_ISSUE.RCV_ISSUE_CTRL_CD:" + ctrlCd;
					setSyslogConfig(logMessage);

					// 入出庫管理番号設定
					struct.setISSUE_CTRL_CD(ctrlCd);

					// 会社コード取得
					List companyList = entity.mselectSYS_MY_COMPANY.read(conn, struct);
					if(companyList.size() > 0){
						AF0100010Struct companyStruct = (AF0100010Struct)companyList.get(0);
						struct.setCOMPANY_CD(companyStruct.getCOMPANY_CD());
					}

					// 入出庫区分設定
					if(struct.getw_INFERIOR().intValue() == 0)
						struct.setISSUE_TYP(new Integer(1));		// 入庫
					else
						struct.setISSUE_TYP(new Integer(3));		// 不良品入庫


					// 取引先コード取得
					if(whStruct.getVEND_CD() != null && "".equals(whStruct.getVEND_CD()) == false){
						// 取引先コード設定
						struct.setVEND_CD(whStruct.getVEND_CD());

						// 支給区分設定
						List issueList = entity.mselectM_CONS_UNIT_COST.read(conn, struct);

						if(issueList.size() > 0){
							AF0100010Struct issueStruct = (AF0100010Struct)issueList.get(0);

							// 有償フラグが"1:有償"の場合
							if(issueStruct.getONEROUS_FLG().intValue() == 1){
								// 支給区分は"1:有償"
								struct.setCONS_TYP(new Integer(1));
							}else{
								// 支給区分は"2:無償"
								struct.setCONS_TYP(new Integer(2));
							}
						}else{
							// 支給区分は"2:無償"
							struct.setCONS_TYP(new Integer(2));
						}
					}
					else{
						// 取引先コード設定
						struct.setVEND_CD((String)null);
						
						// 支給区分設定
						struct.setCONS_TYP(new Integer(0));
					}

					// 入庫数チェック
					boolean resultCeil = false;
					Calculate calc = new Calculate();

					if(itemStruct.getUNIT_QTY_TYP().intValue() == 1 && calc.isNumeric(struct.getRCV_ISSUE_QTY()) == true ){
						struct.setRCV_ISSUE_QTY(calc.ceil(struct.getRCV_ISSUE_QTY(), 0));
						resultCeil = true;
					}

					// 品目情報をStructに設定
					struct.setPRODUCT_TYP(itemStruct.getPRODUCT_TYP());		// 製品区分
					struct.setMRP_ODR_TYP(itemStruct.getMRP_ODR_TYP());		// 品目手配区分
					struct.setOUTSIDE_TYP(itemStruct.getOUTSIDE_TYP());		// 品目内外作区分
					struct.setRCV_ISSUE_GNR_TYP(new Integer(12));			// 入出庫発生区分
					struct.setSBCNT_PUCH_TYP(new Integer(5));				// 外注購入品区分
					struct.setSTOCK_UPD_TYP(new Integer(1));				// 在庫更新区分

					// 保管区別入出庫登録
					entity.minsertT_RCV_ISSUE.create(conn, struct);

					// 計画外理由コードがNULLでない場合、品目別入出庫登録
					if(struct.getNON_PLANNED_CAUSE_CD() != null &&
						"".equals(struct.getNON_PLANNED_CAUSE_CD()) == false){
						entity.minsertT_RCV_ISSUE_ITEM.create(conn, struct);
					}

					// 入庫処理
					RcvProcess rcvPrc = new RcvProcess(conn, ctrlCd);
					if(rcvPrc.execProcess() == true){
						logMessage = "Receive Process was Complated!";
						setSyslogConfig(logMessage);

						// コミット
						conn.commit();

						if(resultCeil == true){
							// 登録処理失敗：整数管理品目のため小数点以下は切り上げして更新しました
							logMessage = "T_RCV_ISSUE.RCV_ISSUE_CTRL_CD:" + struct.getISSUE_CTRL_CD();
							setInfoMessage("AF60004", logMessage);
						}

						// モード設定
						_mode = _INSERT;

						// 検索
						controlselect();
					}
					else {
						logMessage = "Receive Process was Failed...";
						setSyslogConfig(logMessage);

						// ロールバック
						conn.rollback();
					}

					// 入庫処理内で発生したメッセージ取得
					logMessage = "T_RCV_ISSUE.RCV_ISSUE_CTRL_CD:" + struct.getISSUE_CTRL_CD();
					for(int idx = 0; idx < rcvPrc.getErrorList().size(); idx++){
						setErrorMessage((String)rcvPrc.getErrorList().get(idx) , logMessage);
					}
					for(int idx = 0; idx < rcvPrc.getInfoList().size(); idx++){
						setInfoMessage((String)rcvPrc.getInfoList().get(idx) , logMessage);
					}
					for(int idx = 0; idx < rcvPrc.getWarnList().size(); idx++){
						setWarnMessage((String)rcvPrc.getWarnList().get(idx) , logMessage);
					}
					
					// ロット管理の更新
					if(msgStruct.sizeError() <= 0 &&
						"true".equals(struct.geth_SYS_LOT_CTRL_FLG()) &&
						struct.getLOT_NO() != null && !"".equals(struct.getLOT_NO())) {
						entity.mupdateT_LOT_CTRL.update(conn, struct);
					}
				}
			}
			else {
				// 数値項目のクリア
				struct.setw_WH_STOCK_ON_HAND_QTY((String)null);
				struct.setDEFECT_QTY((String)null);
				struct.setw_TOTAL_STOCK_ON_HAND_QTY((String)null);
				struct.setw_TOTAL_DEFECT_QTY((String)null);
				
				struct.setLOT_STOCK_ON_HAND_QTY((String)null);
				struct.setLOT_DEFECT_QTY((String)null);
				struct.setALLOCABLE_QTY((String)null);
			}

		}catch(ParseException e){
			// ロールバック
				conn.rollback();

			// 変換失敗
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			
			emsg = new ExpjMessage( "ZZ01006", e.toString());
			sysLog.severe (emsg ,getsysUSER_CD());
			throw ee;

		}catch(SQLException e){
			// ロールバック
			conn.rollback();

			// エラーメッセージ作成
			setSqlExceptionMsg(e);

		}catch(Exception e){
			// ロールバック
			conn.rollback();

			ExpjException ee = new ExpjException(e, "ZZ01106");
			ExpjMessage emsg = new ExpjMessage( "ZZ01006" , "ProcessId:" + this.sp.getProcId() );
			ee.add(emsg);
			throw ee;
		}
		//---------------------------------------------------------------------
                //}}user_implement_dev:<controlinsert>
		logger.exiting("AF0100010Control"+":USER="+struct.getsUser_ID(),"controlinsert");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlclear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0100");
		logger.entering("AF0100010Control"+":USER="+struct.getsUser_ID(),"controlclear");
			//{{user_implement_dev:<controlclear>
		//---------------------------------------------------------------------
		// ログ出力情報格納用
		String logMessage = "";
		List listMessage = new ArrayList();

		try{
			String s_date = null;

			struct.setPLANT_CD(getsysPLANT_CD());

			// 業務運用日取得
			List dateList = entity.mselectSYS_DATE_CTRL.read(conn, struct);
			if(dateList.size() <= 0){
				// 登録処理失敗：業務運用日が存在しません
				logMessage = "SYS_DATE_CTRL.PLANT_CD:" + struct.getPLANT_CD();
				setErrorMessage("AF00056", logMessage);
				return ;
			}
			else{
				AF0100010Struct dateStruct = (AF0100010Struct)dateList.get(0);
				s_date = dateStruct.getBUSINESS_OPR_DATE();
			}
			
			//ロット管理システム導入フラグを取得
			String sys_lot_ctrl = struct.geth_SYS_LOT_CTRL_FLG();

			// モード設定
			_mode = _NORMAL;

			// 初期化
			struct.clear();
			struct.setw_JOB_ODR(new Integer(0));
			struct.setw_INFERIOR(new Integer(0));
			
			struct.setw_WH_STOCK_ON_HAND_QTY(new String("0.0"));
			struct.setDEFECT_QTY(new String("0.0"));
			struct.setw_TOTAL_STOCK_ON_HAND_QTY(new String("0.0"));
			struct.setw_TOTAL_DEFECT_QTY(new String("0.0"));
			struct.setRCV_ISSUE_QTY(new String("0.0"));
			
			struct.setLOT_STOCK_ON_HAND_QTY(new String("0.0"));
			struct.setLOT_DEFECT_QTY(new String("0.0"));
			struct.setALLOCABLE_QTY(new String("0.0"));

			// 業務運用日設定
			struct.setRCV_ISSUE_DATE(s_date);
			struct.setBUSINESS_OPR_DATE(s_date);
			
			// ロット管理システム導入フラグ設定
			struct.seth_SYS_LOT_CTRL_FLG(sys_lot_ctrl);

		}catch(SQLException e){
			setSqlExceptionMsg(e);
		}
		//---------------------------------------------------------------------
                //}}user_implement_dev:<controlclear>
		logger.exiting("AF0100010Control"+":USER="+struct.getsUser_ID(),"controlclear");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0100");
		logger.entering("AF0100010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AF0100010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0100");
		logger.entering("AF0100010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
		//---------------------------------------------------------------------
		// クリア処理
		controlclear();

		// ユーザ定義初期化
		usersInitialize();
		//---------------------------------------------------------------------
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AF0100010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * イベントハンドラの前処理です。
	 *
	 * @param buttun ボタン名
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0100");
		logger.entering("AF0100010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			
			// システム導入フラグ取得
			try {
				boolean sys_lot_ctrl = LotCtrl.checkLotCtrl(conn);
				if(sys_lot_ctrl == true){
					struct.seth_SYS_LOT_CTRL_FLG("true");
				}else{
					struct.seth_SYS_LOT_CTRL_FLG("false");
				}
			} catch (SQLException e) {
				setSqlExceptionMsg(e);
			}
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("AF0100010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("insert") ) {
				controlinsert();
			} else if( button.equals("clear") ) {
				controlclear();
			} else if( button.equals("initial") ) {
				controlINITIAL();
			} else if( button.equals("reload") ) {
				controlRELOAD();
			}
		//{{user_implement_dev:<control_eventHandller>

//		ソース内にまだAlarmMessageExceptionが残っている場合は、以下の行のコメントを外してAlarmMessageExceptionを始末する。
		} catch(AlarmMessageException ame){
			ExpjException ee = new ExpjException(ame, (ExpjMessageList)((Object)ame.getMessages()));
			throw ee;
                //}}user_implement_dev:<control_eventHandller>
		} catch( BusinessLockException ble ) {
			// 枠メッセージ出力依頼作成
			setNewDataFlg(false);
		} catch( ResourceBusyException rbe ) {
			ExpjException ee = new ExpjException(rbe, "ZZ01105");
			throw ee;
		} catch( FoundationException e ) {
//			e.printStackTrace();
//			throw new FoundationException("AF0100010Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
                //}}user_implement_dev:<createDefaultCSV>
		} catch( FoundationException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AF0100010-E999","CSVの出力処理"));
			throw new FoundationException("AF0100010Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AF0100010-E999","システム日付の取得処理"));
				throw new FoundationException("AF0100010Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AF0100010-E999","コントロールのイベント処理"));
			throw new FoundationException("AF0100010Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected AF0100010Entity entity;
	protected AF0100010Struct struct;
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

		entity = new AF0100010Entity();
		struct = new AF0100010Struct();

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
	 * AF0100010クラスの標準コンストラクタ
	 */
	public AF0100010Control() throws BusinessProcessException, FoundationException
	{
		initialize();

		//conn = connect();
		//{{user_implement_code_constractor
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
				AF0100010Struct key = (AF0100010Struct)keyList.get(j);
				// メッセージキーを作成する
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("w_JOB_ODR") && key.getw_JOB_ODR() != null) {
					msgKey.setKeyValue("w_JOB_ODR", key.getw_JOB_ODR().toString());
				}
				if(msgKeyType.containsKeyColumn("w_INFERIOR") && key.getw_INFERIOR() != null) {
					msgKey.setKeyValue("w_INFERIOR", key.getw_INFERIOR().toString());
				}
				if(msgKeyType.containsKeyColumn("c_JOB_ODR_CD") && key.getc_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("c_JOB_ODR_CD", key.getc_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("c_RCV_ISSUE_QTY") && key.getc_RCV_ISSUE_QTY() != null) {
					msgKey.setKeyValue("c_RCV_ISSUE_QTY", key.getc_RCV_ISSUE_QTY());
				}
				if(msgKeyType.containsKeyColumn("h_SYS_LOT_CTRL_FLG") && key.geth_SYS_LOT_CTRL_FLG() != null) {
					msgKey.setKeyValue("h_SYS_LOT_CTRL_FLG", key.geth_SYS_LOT_CTRL_FLG());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
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
				if(msgKeyType.containsKeyColumn("STOCK_UNIT") && key.getSTOCK_UNIT() != null) {
					msgKey.setKeyValue("STOCK_UNIT", key.getSTOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP") && key.getMRP_ODR_TYP() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP", key.getMRP_ODR_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("OUTSIDE_TYP") && key.getOUTSIDE_TYP() != null) {
					msgKey.setKeyValue("OUTSIDE_TYP", key.getOUTSIDE_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP") && key.getUNIT_QTY_TYP() != null) {
					msgKey.setKeyValue("UNIT_QTY_TYP", key.getUNIT_QTY_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("PRODUCT_TYP") && key.getPRODUCT_TYP() != null) {
					msgKey.setKeyValue("PRODUCT_TYP", key.getPRODUCT_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("SPL_ITEM_TYP") && key.getSPL_ITEM_TYP() != null) {
					msgKey.setKeyValue("SPL_ITEM_TYP", key.getSPL_ITEM_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("LOT_CTRL_FLG") && key.getLOT_CTRL_FLG() != null) {
					msgKey.setKeyValue("LOT_CTRL_FLG", key.getLOT_CTRL_FLG());
				}
				if(msgKeyType.containsKeyColumn("LOT_NUMBERING_TYP") && key.getLOT_NUMBERING_TYP() != null) {
					msgKey.setKeyValue("LOT_NUMBERING_TYP", key.getLOT_NUMBERING_TYP());
				}
				if(msgKeyType.containsKeyColumn("w_MANHOUR_TYP") && key.getw_MANHOUR_TYP() != null) {
					msgKey.setKeyValue("w_MANHOUR_TYP", key.getw_MANHOUR_TYP());
				}
				if(msgKeyType.containsKeyColumn("w_TOTAL_STOCK_ON_HAND_QTY") && key.getw_TOTAL_STOCK_ON_HAND_QTY() != null) {
					msgKey.setKeyValue("w_TOTAL_STOCK_ON_HAND_QTY", key.getw_TOTAL_STOCK_ON_HAND_QTY());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_CD") && key.getJOB_ODR_CD() != null) {
					msgKey.setKeyValue("JOB_ODR_CD", key.getJOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("w_WH_STOCK_ON_HAND_QTY") && key.getw_WH_STOCK_ON_HAND_QTY() != null) {
					msgKey.setKeyValue("w_WH_STOCK_ON_HAND_QTY", key.getw_WH_STOCK_ON_HAND_QTY());
				}
				if(msgKeyType.containsKeyColumn("WH_CD") && key.getWH_CD() != null) {
					msgKey.setKeyValue("WH_CD", key.getWH_CD());
				}
				if(msgKeyType.containsKeyColumn("DEFECT_QTY") && key.getDEFECT_QTY() != null) {
					msgKey.setKeyValue("DEFECT_QTY", key.getDEFECT_QTY());
				}
				if(msgKeyType.containsKeyColumn("w_TOTAL_DEFECT_QTY") && key.getw_TOTAL_DEFECT_QTY() != null) {
					msgKey.setKeyValue("w_TOTAL_DEFECT_QTY", key.getw_TOTAL_DEFECT_QTY());
				}
				if(msgKeyType.containsKeyColumn("BUSINESS_OPR_DATE") && key.getBUSINESS_OPR_DATE() != null) {
					msgKey.setKeyValue("BUSINESS_OPR_DATE", key.getBUSINESS_OPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("WH_NAME") && key.getWH_NAME() != null) {
					msgKey.setKeyValue("WH_NAME", key.getWH_NAME());
				}
				if(msgKeyType.containsKeyColumn("VEND_CD") && key.getVEND_CD() != null) {
					msgKey.setKeyValue("VEND_CD", key.getVEND_CD());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_CTRL_CD") && key.getISSUE_CTRL_CD() != null) {
					msgKey.setKeyValue("ISSUE_CTRL_CD", key.getISSUE_CTRL_CD());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_TYP") && key.getISSUE_TYP() != null) {
					msgKey.setKeyValue("ISSUE_TYP", key.getISSUE_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_QTY") && key.getRCV_ISSUE_QTY() != null) {
					msgKey.setKeyValue("RCV_ISSUE_QTY", key.getRCV_ISSUE_QTY());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_DATE") && key.getRCV_ISSUE_DATE() != null) {
					msgKey.setKeyValue("RCV_ISSUE_DATE", key.getRCV_ISSUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_GNR_TYP") && key.getRCV_ISSUE_GNR_TYP() != null) {
					msgKey.setKeyValue("RCV_ISSUE_GNR_TYP", key.getRCV_ISSUE_GNR_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UPD_TYP") && key.getSTOCK_UPD_TYP() != null) {
					msgKey.setKeyValue("STOCK_UPD_TYP", key.getSTOCK_UPD_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("VEND_LOT_NO") && key.getVEND_LOT_NO() != null) {
					msgKey.setKeyValue("VEND_LOT_NO", key.getVEND_LOT_NO());
				}
				if(msgKeyType.containsKeyColumn("COMPANY_CD") && key.getCOMPANY_CD() != null) {
					msgKey.setKeyValue("COMPANY_CD", key.getCOMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("CONS_TYP") && key.getCONS_TYP() != null) {
					msgKey.setKeyValue("CONS_TYP", key.getCONS_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("LOT_NO") && key.getLOT_NO() != null) {
					msgKey.setKeyValue("LOT_NO", key.getLOT_NO());
				}
				if(msgKeyType.containsKeyColumn("ONEROUS_FLG") && key.getONEROUS_FLG() != null) {
					msgKey.setKeyValue("ONEROUS_FLG", key.getONEROUS_FLG().toString());
				}
				if(msgKeyType.containsKeyColumn("SBCNT_PUCH_TYP") && key.getSBCNT_PUCH_TYP() != null) {
					msgKey.setKeyValue("SBCNT_PUCH_TYP", key.getSBCNT_PUCH_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("NON_PLANNED_CAUSE_CD") && key.getNON_PLANNED_CAUSE_CD() != null) {
					msgKey.setKeyValue("NON_PLANNED_CAUSE_CD", key.getNON_PLANNED_CAUSE_CD());
				}
				if(msgKeyType.containsKeyColumn("PAST_RESULT_ENTRY_TYP") && key.getPAST_RESULT_ENTRY_TYP() != null) {
					msgKey.setKeyValue("PAST_RESULT_ENTRY_TYP", key.getPAST_RESULT_ENTRY_TYP());
				}
				if(msgKeyType.containsKeyColumn("LOT_STOCK_ON_HAND_QTY") && key.getLOT_STOCK_ON_HAND_QTY() != null) {
					msgKey.setKeyValue("LOT_STOCK_ON_HAND_QTY", key.getLOT_STOCK_ON_HAND_QTY());
				}
				if(msgKeyType.containsKeyColumn("LOT_DEFECT_QTY") && key.getLOT_DEFECT_QTY() != null) {
					msgKey.setKeyValue("LOT_DEFECT_QTY", key.getLOT_DEFECT_QTY());
				}
				if(msgKeyType.containsKeyColumn("ALLOCABLE_QTY") && key.getALLOCABLE_QTY() != null) {
					msgKey.setKeyValue("ALLOCABLE_QTY", key.getALLOCABLE_QTY());
				}
				if(msgKeyType.containsKeyColumn("PRD_CMPLT_DATE") && key.getPRD_CMPLT_DATE() != null) {
					msgKey.setKeyValue("PRD_CMPLT_DATE", key.getPRD_CMPLT_DATE());
				}
				if(msgKeyType.containsKeyColumn("BEST_BEFORE_DATE") && key.getBEST_BEFORE_DATE() != null) {
					msgKey.setKeyValue("BEST_BEFORE_DATE", key.getBEST_BEFORE_DATE());
				}
				if(msgKeyType.containsKeyColumn("BEST_BEFORE_DATE_CHECK_FLG") && key.getBEST_BEFORE_DATE_CHECK_FLG() != null) {
					msgKey.setKeyValue("BEST_BEFORE_DATE_CHECK_FLG", key.getBEST_BEFORE_DATE_CHECK_FLG());
				}
				if(msgKeyType.containsKeyColumn("BBD_c_FLG") && key.getBBD_c_FLG() != null) {
					msgKey.setKeyValue("BBD_c_FLG", key.getBBD_c_FLG());
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
					AF0100010Struct key = new AF0100010Struct();
					if(msgKeyType.containsKeyColumn("w_JOB_ODR")) {
						key.setw_JOB_ODR(new Integer(msgKey.getKeyValue("w_JOB_ODR")));
					}
					if(msgKeyType.containsKeyColumn("w_INFERIOR")) {
						key.setw_INFERIOR(new Integer(msgKey.getKeyValue("w_INFERIOR")));
					}
					if(msgKeyType.containsKeyColumn("c_JOB_ODR_CD")) {
						key.setc_JOB_ODR_CD(msgKey.getKeyValue("c_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("c_RCV_ISSUE_QTY")) {
						key.setc_RCV_ISSUE_QTY(msgKey.getKeyValue("c_RCV_ISSUE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("h_SYS_LOT_CTRL_FLG")) {
						key.seth_SYS_LOT_CTRL_FLG(msgKey.getKeyValue("h_SYS_LOT_CTRL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
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
					if(msgKeyType.containsKeyColumn("STOCK_UNIT")) {
						key.setSTOCK_UNIT(msgKey.getKeyValue("STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP")) {
						key.setMRP_ODR_TYP(new Integer(msgKey.getKeyValue("MRP_ODR_TYP")));
					}
					if(msgKeyType.containsKeyColumn("OUTSIDE_TYP")) {
						key.setOUTSIDE_TYP(new Integer(msgKey.getKeyValue("OUTSIDE_TYP")));
					}
					if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP")) {
						key.setUNIT_QTY_TYP(new Integer(msgKey.getKeyValue("UNIT_QTY_TYP")));
					}
					if(msgKeyType.containsKeyColumn("PRODUCT_TYP")) {
						key.setPRODUCT_TYP(new Integer(msgKey.getKeyValue("PRODUCT_TYP")));
					}
					if(msgKeyType.containsKeyColumn("SPL_ITEM_TYP")) {
						key.setSPL_ITEM_TYP(new Integer(msgKey.getKeyValue("SPL_ITEM_TYP")));
					}
					if(msgKeyType.containsKeyColumn("LOT_CTRL_FLG")) {
						key.setLOT_CTRL_FLG(msgKey.getKeyValue("LOT_CTRL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("LOT_NUMBERING_TYP")) {
						key.setLOT_NUMBERING_TYP(msgKey.getKeyValue("LOT_NUMBERING_TYP"));
					}
					if(msgKeyType.containsKeyColumn("w_MANHOUR_TYP")) {
						key.setw_MANHOUR_TYP(msgKey.getKeyValue("w_MANHOUR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("w_TOTAL_STOCK_ON_HAND_QTY")) {
						key.setw_TOTAL_STOCK_ON_HAND_QTY(msgKey.getKeyValue("w_TOTAL_STOCK_ON_HAND_QTY"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_CD")) {
						key.setJOB_ODR_CD(msgKey.getKeyValue("JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_WH_STOCK_ON_HAND_QTY")) {
						key.setw_WH_STOCK_ON_HAND_QTY(msgKey.getKeyValue("w_WH_STOCK_ON_HAND_QTY"));
					}
					if(msgKeyType.containsKeyColumn("WH_CD")) {
						key.setWH_CD(msgKey.getKeyValue("WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("DEFECT_QTY")) {
						key.setDEFECT_QTY(msgKey.getKeyValue("DEFECT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("w_TOTAL_DEFECT_QTY")) {
						key.setw_TOTAL_DEFECT_QTY(msgKey.getKeyValue("w_TOTAL_DEFECT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("BUSINESS_OPR_DATE")) {
						key.setBUSINESS_OPR_DATE(msgKey.getKeyValue("BUSINESS_OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("WH_NAME")) {
						key.setWH_NAME(msgKey.getKeyValue("WH_NAME"));
					}
					if(msgKeyType.containsKeyColumn("VEND_CD")) {
						key.setVEND_CD(msgKey.getKeyValue("VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_CTRL_CD")) {
						key.setISSUE_CTRL_CD(msgKey.getKeyValue("ISSUE_CTRL_CD"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_TYP")) {
						key.setISSUE_TYP(new Integer(msgKey.getKeyValue("ISSUE_TYP")));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_QTY")) {
						key.setRCV_ISSUE_QTY(msgKey.getKeyValue("RCV_ISSUE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_DATE")) {
						key.setRCV_ISSUE_DATE(msgKey.getKeyValue("RCV_ISSUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_GNR_TYP")) {
						key.setRCV_ISSUE_GNR_TYP(new Integer(msgKey.getKeyValue("RCV_ISSUE_GNR_TYP")));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UPD_TYP")) {
						key.setSTOCK_UPD_TYP(new Integer(msgKey.getKeyValue("STOCK_UPD_TYP")));
					}
					if(msgKeyType.containsKeyColumn("VEND_LOT_NO")) {
						key.setVEND_LOT_NO(msgKey.getKeyValue("VEND_LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("COMPANY_CD")) {
						key.setCOMPANY_CD(msgKey.getKeyValue("COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("CONS_TYP")) {
						key.setCONS_TYP(new Integer(msgKey.getKeyValue("CONS_TYP")));
					}
					if(msgKeyType.containsKeyColumn("LOT_NO")) {
						key.setLOT_NO(msgKey.getKeyValue("LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("ONEROUS_FLG")) {
						key.setONEROUS_FLG(new Integer(msgKey.getKeyValue("ONEROUS_FLG")));
					}
					if(msgKeyType.containsKeyColumn("SBCNT_PUCH_TYP")) {
						key.setSBCNT_PUCH_TYP(new Integer(msgKey.getKeyValue("SBCNT_PUCH_TYP")));
					}
					if(msgKeyType.containsKeyColumn("NON_PLANNED_CAUSE_CD")) {
						key.setNON_PLANNED_CAUSE_CD(msgKey.getKeyValue("NON_PLANNED_CAUSE_CD"));
					}
					if(msgKeyType.containsKeyColumn("PAST_RESULT_ENTRY_TYP")) {
						key.setPAST_RESULT_ENTRY_TYP(msgKey.getKeyValue("PAST_RESULT_ENTRY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("LOT_STOCK_ON_HAND_QTY")) {
						key.setLOT_STOCK_ON_HAND_QTY(msgKey.getKeyValue("LOT_STOCK_ON_HAND_QTY"));
					}
					if(msgKeyType.containsKeyColumn("LOT_DEFECT_QTY")) {
						key.setLOT_DEFECT_QTY(msgKey.getKeyValue("LOT_DEFECT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("ALLOCABLE_QTY")) {
						key.setALLOCABLE_QTY(msgKey.getKeyValue("ALLOCABLE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("PRD_CMPLT_DATE")) {
						key.setPRD_CMPLT_DATE(msgKey.getKeyValue("PRD_CMPLT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("BEST_BEFORE_DATE")) {
						key.setBEST_BEFORE_DATE(msgKey.getKeyValue("BEST_BEFORE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("BEST_BEFORE_DATE_CHECK_FLG")) {
						key.setBEST_BEFORE_DATE_CHECK_FLG(msgKey.getKeyValue("BEST_BEFORE_DATE_CHECK_FLG"));
					}
					if(msgKeyType.containsKeyColumn("BBD_c_FLG")) {
						key.setBBD_c_FLG(msgKey.getKeyValue("BBD_c_FLG"));
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
