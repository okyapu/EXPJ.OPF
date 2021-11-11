/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AF0070/src/com/nec/jp/orteus/metamorBase/AF0070/AF0070010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AF0070;

import com.nec.jp.orteus.metamorBase.AF0070.*;
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

import com.nec.jp.orteus.expj.pr.rcvissue.process.IssueProcess;
import com.nec.jp.orteus.expj.pr.rcvissue.process.RcvProcess;
import com.nec.jp.orteus.expj.util.Calculate;
import com.nec.jp.orteus.expj.pr.rcvissue.process.IssueRemain;

import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.math.BigDecimal;
//-----------------------------------------------------------------------------
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AF0070010Control
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
	public AF0070010Struct getListvalue(int x) { return (AF0070010Struct)(this.list.get(x)); }	// リストの値を返します。
	public AF0070010Struct getStruct() { return this.struct; }	// Structを返します。
	public AF0070010Struct createStruct() { return new AF0070010Struct(); }	// 新しいStructを作って返します。
	public void setStruct(Object structname) { this.struct.setStruct((AF0070010Struct)structname); }	// Structをセットします。
//	public void initializeStruct() { this.struct.initialize(); }	// Structの値を初期化します。

	// CSV出力用リスト
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }


//------------------------------------------------------------------------

	/** ユーザ定義の初期化済フラグ */
	private boolean _usersIntialized = false;

	/**
	 * ユーザ定義 初期化処理
	 */
	private void usersInitialize() throws ExpjException
	{
		// 検索状態を「初期状態」に設定
		setReadStatus(INITIAL);

		_usersIntialized = true;
		return ;
	}


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

	/** 計算用クラス*/
	Calculate calc = new Calculate();

//-----------------------------------------------------------------------------

    /** 画面共通定義取得クラス */
    ScreenParam _scParam = sp;


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
	private void setErrorMessage(String messageno)
	{
		ExpjMessage emsg = new ExpjMessage( messageno );
		msgStruct.addError( emsg );
		sysLog.warning(emsg, getsysUSER_CD());
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
	 * 品目別振替可能数、保管区振替可能数のセット
	 * @param wkStruct AF0070010Struct
	 */
	private void setCalcPosStockQty(AF0070010Struct wkStruct) throws SQLException
	{
		IssueRemain issueRemain = new IssueRemain(conn);
		
		// 製番・品目単位の振替可能数を求める
		wkStruct.setALC_POS_STOCK_QTY(issueRemain.getFreeStockQtyOfJobOdr(getsysPLANT_CD(),
				wkStruct.getITEM_CD(), wkStruct.getJOB_ODR_CD(), 
				Integer.parseInt(wkStruct.getJOB_ODR_DETAIL_NO())).toString());
		
		if(wkStruct.getMRP_FLG().equals(AF0070Const._MRP_TARGET)){
			// 保管区在庫数と品目別振替可能数の小さい方を
			// 保管区振替可能数とする
			if(Calculate.compare(wkStruct.getw_WH_STOCK_QTY(),
					wkStruct.getALC_POS_STOCK_QTY()) <= 0){
				wkStruct.setRCV_ISSUE_POS_QTY(wkStruct.getw_WH_STOCK_QTY());
			}else{
				wkStruct.setRCV_ISSUE_POS_QTY(wkStruct.getALC_POS_STOCK_QTY());
			}
		}else{
			// 保管区が所要量計算対象外の場合は｢保管区在庫数｣
			wkStruct.setRCV_ISSUE_POS_QTY(wkStruct.getw_WH_STOCK_QTY());
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
			AF0070010Struct sysParameterStruct = (AF0070010Struct) sysParameterList.get(0);
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
			AF0070010Struct procExecDateStruct = (AF0070010Struct) procExecDateList.get(0);
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

//-----------------------------------------------------------------------------
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * 読込ボタン押下時に実行される処理です。
	 *
	 */
	public void controlselect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0070");
		logger.entering("AF0070010Control"+":USER="+struct.getsUser_ID(),"controlselect");
			//{{user_implement_dev:<controlselect>
		//-----------------------------------------------------------------------------
		// ログ出力情報格納用
		String logMessage = "";
		List listMessage = new ArrayList();

		try {
			boolean result = true;			// チェック結果格納
			// キー項目ログ表示
			logMessage = "JOB_ODR_CD:" + struct.getw_JOB_ODR_CD()
						+ ", ITEM_CD:" + struct.getw_ITEM_CD()
						+ ", WH_CD:" + struct.getw_WH_CD()
						+ ", PLANT_CD:" + struct.getw_PLANT_CD();
			setSyslogConfig(logMessage);
           // 最大表示行数
            int maxLine = sp.getMaxLine(conn, 10);
			if(maxLine != 0) {
				struct.setROW_COUNT(String.valueOf(maxLine));
			} else {
				struct.setROW_COUNT(null);
			}
			list = entity.mselectCnt.read(conn, struct);
			long rowCount = Long.parseLong(((AF0070010Struct)list.get(0)).getl_COUNT());  

			// 検索結果0件の場合
			if(rowCount==0){
				// 検索状態を「読込０件」に設定
				setReadStatus(NOT_FOUND);
				// 読込処理失敗：保管区別製番在庫データが存在しません
				listMessage.add("T_JOB_ODR_CD_STOCK.JOB_ODR_CD:" + struct.getw_JOB_ODR_CD());
				listMessage.add("T_JOB_ODR_CD_STOCK.ITEM_CD:" + struct.getw_ITEM_CD());
				listMessage.add("T_JOB_ODR_CD_STOCK.WH_CD:" + struct.getw_WH_CD());
				listMessage.add("T_JOB_ODR_CD_STOCK.PLANT_CD:" + struct.getw_PLANT_CD());
				setErrorMessage("AF00045", listMessage);
				listMessage.clear();
				if(list != null && list.size() > 0){
					list.clear();
				}
				return;
			} else {
				// 表示最大行数制限処理
				if(maxLine != 0 && rowCount == maxLine + 1){
					// 検索状態を「最大行数オーバ」に設定
					setReadStatus(TOO_MANY);
					setErrorMessage("ZZ01115", "", ""+maxLine);
					if(list != null && list.size() > 0){
						list.clear();
					}
					return;
				}
				list = entity.mselect.read(conn, struct);				
				// デマンドが完了の製番在庫に絞込み
				AF0070010Struct wkStruct;
				IssueRemain issueRemain = new IssueRemain(conn);
				for(int i=0; i<list.size(); i++){
					wkStruct = (AF0070010Struct)list.get(i);
					
					// [所要量]の読込
					wkStruct.setw_PLANT_CD(getsysPLANT_CD());
					if(entity.mT_OD.check(conn, wkStruct)){
						// データが1件でも存在すればVIEWに表示しない。
						list.remove(i);
						i--;
						continue;
					}
					
					// 品目別、保管区振替可能数のセット
					setCalcPosStockQty(wkStruct);
					
					if(Calculate.compare(wkStruct.getRCV_ISSUE_POS_QTY(), "0") <= 0){
						// 振替可能数が0以下のときVIEWに表示しない
						list.remove(i);
						i--;
						continue;
					}
					
					if(wkStruct.getMRP_FLG().equals(AF0070Const._MRP_TARGET) &&
							Calculate.compare(wkStruct.getALC_POS_STOCK_QTY(), "0") <= 0){
						// 保管区が所要量計算対象外で品目別振替可能数が0以下の時
						// VIEWに表示しない
						list.remove(i);
						i--;
						continue;
					}
				}

				if(list.size() <= 0){
					// 対象となる[保管区製番在庫]が存在しない場合
					setErrorMessage("AF00118");
				}

				// 検索状態を「読込成功」に設定
				setReadStatus(NORMAL);

			}

		} catch(SQLException e) {
			// 検索状態を「読込失敗」に設定
			setReadStatus(ERROR);

			setSqlExceptionMsg(e);
		}
		//-----------------------------------------------------------------------------
                //}}user_implement_dev:<controlselect>
		logger.exiting("AF0070010Control"+":USER="+struct.getsUser_ID(),"controlselect");

		return;
	}

	/**
	 * 行修正ボタン押下時に実行される処理です。
	 *
	 */
	public void controlmodify() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0070");
		logger.entering("AF0070010Control"+":USER="+struct.getsUser_ID(),"controlmodify");
			//{{user_implement_dev:<controlmodify>
		//-----------------------------------------------------------------------------
		// ログ出力情報格納用
		String logMessage = "";
		List listMessage = new ArrayList();

		try {
			boolean check = true;		// チェック結果格納

			// キー項目を保持
			AF0070010Struct keyStruct = new AF0070010Struct(struct);

			// キー項目をセット
			struct.setw_ITEM_CD(keyStruct.getw_ITEM_CD());
			struct.setw_JOB_ODR_CD(keyStruct.getw_JOB_ODR_CD());
			struct.setw_WH_CD(keyStruct.getw_WH_CD());
			struct.setw_PLANT_CD(keyStruct.getw_PLANT_CD());

			// キー項目ログ表示
			logMessage = "T_JOB_ODR_CD_STOCK.JOB_ODR_CD:" + struct.getJOB_ODR_CD()
						+ " T_JOB_ODR_CD_STOCK.ITEM_CD:" + struct.getITEM_CD()
						+ " T_JOB_ODR_CD_STOCK.WH_CD:" + struct.getWH_CD()
						+ " T_JOB_ODR_CD_STOCK.PLANT_CD:" + struct.getw_PLANT_CD();
			setSyslogConfig(logMessage);


			// 在庫累計数を取得する
			List qtyList = entity.mselectJOB_ODR_STOCK_QTY.read(conn, struct);
			if(qtyList.size() <= 0) {
				struct.setw_JOB_ODR_STOCK_QTY(new String("0.0"));
			}
			else{
				AF0070010Struct qtyStruct = (AF0070010Struct)qtyList.get(0);
				struct.setw_JOB_ODR_STOCK_QTY(qtyStruct.getw_JOB_ODR_STOCK_QTY());
			}

			// 子画面の初期値をセット
			struct.setRCV_ISSUE_QTY(new String("0.0"));

			// 業務運用日を取得する
			List dateList = entity.mselectBUSINESS_OPR_DATE.read(conn, struct);
			if(dateList.size() <= 0) {
				// 行修正処理失敗：業務運用日が存在しません
				logMessage = "SYS_DATE_CTRL.PLANT_CD:" + struct.getw_PLANT_CD();
				setErrorMessage("AF00056", logMessage);
				check = false;
			}
			else{
				AF0070010Struct dateStruct = (AF0070010Struct)dateList.get(0);
				struct.seth_BUSINESS_OPR_DATE(dateStruct.geth_BUSINESS_OPR_DATE());
				struct.setRCV_ISSUE_DATE(dateStruct.geth_BUSINESS_OPR_DATE());
			}
			
		} catch(SQLException e) {
			// 検索状態を「読込失敗」に設定
			setReadStatus(ERROR);

			setSqlExceptionMsg(e);
		}
		//-----------------------------------------------------------------------------
                //}}user_implement_dev:<controlmodify>
		logger.exiting("AF0070010Control"+":USER="+struct.getsUser_ID(),"controlmodify");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlclear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0070");
		logger.entering("AF0070010Control"+":USER="+struct.getsUser_ID(),"controlclear");
			//{{user_implement_dev:<controlclear>
		//------------------------------------------------------------------
		// リストクリア
		if(list != null){
			list.clear();
		}
		else{
			list = new ArrayList(0);
		}

		// 初期化
		struct.initialize();

		// 検索状態を「初期状態」に設定
		setReadStatus(INITIAL);

		//---------------------------------------------------------------------
                //}}user_implement_dev:<controlclear>
		logger.exiting("AF0070010Control"+":USER="+struct.getsUser_ID(),"controlclear");

		return;
	}

	/**
	 * 更新ボタン押下時に実行される処理です。
	 *
	 */
	public void controlinsertSub1() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0070");
		logger.entering("AF0070010Control"+":USER="+struct.getsUser_ID(),"controlinsertSub1");
			//{{user_implement_dev:<controlinsertSub1>
		//-----------------------------------------------------------------------------
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
			
			// 品目別、保管区振替可能数のセット
			setCalcPosStockQty(struct);
			
			// 出庫日チェック
			Date issue_Date = stringToDate(struct.getRCV_ISSUE_DATE());
			Date business_Date = stringToDate(struct.geth_BUSINESS_OPR_DATE());
			if(issue_Date.after(business_Date)){
					// 登録処理失敗：出庫日に未来の日付は指定できません
					logMessage = "SYS_DATE_CTRL.BUSINESS_OPR_DATE:" + struct.geth_BUSINESS_OPR_DATE();
					setErrorMessage("ZZ05103", logMessage);
			}
			
			// 振替数チェック
			if(Calculate.compare(struct.getRCV_ISSUE_QTY(),
					struct.getRCV_ISSUE_POS_QTY()) == 1){
				setErrorMessage("AF00117");
				
			}

			// 取引先コード取得
			List vendList = entity.mselectVEND_CD.read(conn, struct);
			if(vendList.size() > 0){
				AF0070010Struct vendStruct = (AF0070010Struct)vendList.get(0);
				struct.setw_VEND_CD(vendStruct.getw_VEND_CD());
			}

			// 会社コードを取得する
			List companyList = entity.mselectSYS_MY_COMPANY.read(conn, struct);
			if(companyList.size() > 0){
				AF0070010Struct companyStruct = (AF0070010Struct)companyList.get(0);
				struct.setw_COMPANY_CD(companyStruct.getw_COMPANY_CD());
			}

			// 入庫処理
			// トランザクション開始
			conn.beginTransWeb();

			// チェックでエラーが発生していない場合
			if(msgStruct.sizeError() <= 0)
			{
				// 振替数 切り上げ処理
				boolean resultCeil = false;

				// 出庫処理結果フラグ
				boolean ret = true;

				if(struct.getw_UNIT_QTY_TYP().intValue() == 1
					&& calc.isNumeric(struct.getRCV_ISSUE_QTY()) == true ){
					struct.setRCV_ISSUE_QTY(calc.ceil(struct.getRCV_ISSUE_QTY(), 0));
					resultCeil = true;
				}

				// 情報をStructに設定
				struct.setw_STOCK_UPD_TYP(new Integer(1));				// 在庫更新区分
				struct.setw_CONS_TYP(new Integer(0));					// 支給区分

				// コピーストラクトの生成
				AF0070010Struct issueStruct = new AF0070010Struct(struct);
				AF0070010Struct rcvStruct = new AF0070010Struct(struct);

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////出庫処理///////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

				// 入出庫管理番号採番
				String issueCtrlCd = null;
				CollectNumber issueCollect = new CollectNumber(
												CollectNumber.ISSUE_CD, 
												getsysUSER_CD(), 
												this.sp.getProcId(), 
												issueStruct.getw_PLANT_CD());
				issueCtrlCd = issueCollect.getNo();
				if(issueCtrlCd == null){
					// 登録処理失敗：入出庫管理番号の採番に失敗しました
					logMessage = "UserID:" + getsysUSER_CD()
								+ ", ProcID:" + this.sp.getProcId()
								+ ", PLANT_CD:" + struct.getw_PLANT_CD();
					setErrorMessage("AF00057", logMessage);

					// ロールバック
					conn.rollback();

					ExpjMessage emsg = new ExpjMessage("AF00057");
					throw new FoundationException(
										"AF0070010Control",
										"controlinsert()",
										emsg.getMessage(CoreTools.getLocale(this.getsysUSER_CD())) );
				}

					// ログ出力
					logMessage = "T_RCV_ISSUE.RCV_ISSUE_CTRL_CD:" + issueCtrlCd;
					setSyslogConfig(logMessage);

				// 入出庫管理番号設定
				issueStruct.setw_RCV_ISSUE_CTRL_CD(issueCtrlCd);

				// 入出庫区分設定
				issueStruct.setw_RCV_ISSUE_TYP(new Integer(2));				// 出庫

				// 入出庫数の調整(出庫の場合、負数を設定)
				issueStruct.setRCV_ISSUE_QTY(calc.multiply(struct.getRCV_ISSUE_QTY(), "-1"));

				// 入出庫発生区分
				issueStruct.setw_RCV_ISSUE_GNR_TYP(new Integer(24));		// 振替出庫
                //会社コード
				issueStruct.setw_COMPANY_CD(struct.getw_COMPANY_CD());
				// 保管区別入出庫登録
				entity.minsertT_RCV_ISSUE.create(conn, issueStruct);

				// 出庫処理
				IssueProcess issuePrc = new IssueProcess(conn, issueCtrlCd);
				if(issuePrc.execProcess() == true){
					logMessage = "Issue Process was Complated!";
					setSyslogConfig(logMessage);

					if(resultCeil == true){
							// 登録処理失敗：整数管理品目のため小数点以下は切り上げして更新しました
							logMessage = "T_RCV_ISSUE.RCV_ISSUE_CTRL_CD:" + issueStruct.getw_RCV_ISSUE_CTRL_CD();
							setInfoMessage("AF60004", logMessage);

						// 切り上げフラグを初期化
						resultCeil = false;
					}

				} else {
					// 出庫処理NG
					ret = false;

					logMessage = "Issue Process was Failed...";
					setSyslogConfig(logMessage);

					// ロールバック
					conn.rollback();
				}

				logMessage = "T_RCV_ISSUE.RCV_ISSUE_CTRL_CD:" + issueStruct.getw_RCV_ISSUE_CTRL_CD();
				for(int idx = 0; idx < issuePrc.getErrorList().size(); idx++){
					setErrorMessage((String)issuePrc.getErrorList().get(idx) , logMessage);
				}
				for(int idx = 0; idx < issuePrc.getInfoList().size(); idx++){
					setInfoMessage((String)issuePrc.getInfoList().get(idx) , logMessage);
				}
				for(int idx = 0; idx < issuePrc.getWarnList().size(); idx++){
					setWarnMessage((String)issuePrc.getWarnList().get(idx) , logMessage);
				}

				// 出庫処理結果判定
				if(ret == false){
					// NGの場合は入庫処理は実行しない
					return;
				}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////入庫処理///////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

				// 入出庫管理番号採番
				String rcvCtrlCd = null;
				CollectNumber rcvCollect = new CollectNumber(
												CollectNumber.ISSUE_CD, 
												getsysUSER_CD(), 
												this.sp.getProcId(), 
												rcvStruct.getw_PLANT_CD());
				rcvCtrlCd = rcvCollect.getNo();
				if(rcvCtrlCd == null){
					// 登録処理失敗：入出庫管理番号の採番に失敗しました
					logMessage = "UserID:" + getsysUSER_CD()
								+ ", ProcID:" + this.sp.getProcId()
								+ ", PLANT_CD:" + struct.getw_PLANT_CD();
					setErrorMessage("AF00057", logMessage);

					// ロールバック
					conn.rollback();

					ExpjMessage emsg = new ExpjMessage("AF00057");
					throw new FoundationException(
										"AF0070010Control",
										"controlinsert()",
										emsg.getMessage(CoreTools.getLocale(this.getsysUSER_CD())) );
				}

				// ログ出力
				logMessage = "T_RCV_ISSUE.RCV_ISSUE_CTRL_CD:" + rcvCtrlCd;
				setSyslogConfig(logMessage);

				// 入出庫管理番号設定
				rcvStruct.setw_RCV_ISSUE_CTRL_CD(rcvCtrlCd);

				// 入出庫区分設定
				rcvStruct.setw_RCV_ISSUE_TYP(new Integer(1));				// 入庫

				// 品目在庫に入庫するため、製番をNullに変更
				rcvStruct.setJOB_ODR_CD((String)null);

				// 入出庫数の調整(入庫の場合、正数を設定)
				rcvStruct.setRCV_ISSUE_QTY(struct.getRCV_ISSUE_QTY());

				// 入出庫発生区分
				rcvStruct.setw_RCV_ISSUE_GNR_TYP(new Integer(14));			// 振替入庫
                //会社コード
				rcvStruct.setw_COMPANY_CD(struct.getw_COMPANY_CD());
				// 保管区別入出庫登録
				entity.minsertT_RCV_ISSUE.create(conn, rcvStruct);

				// 入庫処理
				RcvProcess rcvPrc = new RcvProcess(conn, rcvCtrlCd);
				if(rcvPrc.execProcess() == true){
					logMessage = "Receive Process was Complated!";
					setSyslogConfig(logMessage);

					if(resultCeil == true){
						// 登録処理失敗：整数管理品目のため小数点以下は切り上げして更新しました
						logMessage = "T_RCV_ISSUE.RCV_ISSUE_CTRL_CD:" + rcvStruct.getw_RCV_ISSUE_CTRL_CD();
						setInfoMessage("AF60004", logMessage);
					}

				} else {
					logMessage = "Receive Process was Failed...";
					setSyslogConfig(logMessage);

					// ロールバック
					conn.rollback();
				}

				logMessage = "T_RCV_ISSUE.RCV_ISSUE_CTRL_CD:" + issueStruct.getw_RCV_ISSUE_CTRL_CD();
				for(int idx = 0; idx < rcvPrc.getErrorList().size(); idx++){
					setErrorMessage((String)rcvPrc.getErrorList().get(idx) , logMessage);
				}
				for(int idx = 0; idx < rcvPrc.getInfoList().size(); idx++){
					setInfoMessage((String)rcvPrc.getInfoList().get(idx) , logMessage);
				}
				for(int idx = 0; idx < rcvPrc.getWarnList().size(); idx++){
					setWarnMessage((String)rcvPrc.getWarnList().get(idx) , logMessage);
				}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

			}

			// コミット
			conn.commit();

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

			// 検索状態を「読込失敗」に設定
			setReadStatus(ERROR);

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
		//-----------------------------------------------------------------------------
                //}}user_implement_dev:<controlinsertSub1>
		logger.exiting("AF0070010Control"+":USER="+struct.getsUser_ID(),"controlinsertSub1");

		return;
	}

	/**
	 * 戻るボタン押下時に実行される処理です。
	 *
	 */
	public void controlcloseSub1() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0070");
		logger.entering("AF0070010Control"+":USER="+struct.getsUser_ID(),"controlcloseSub1");
			//{{user_implement_dev:<controlcloseSub1>
		//-----------------------------------------------------------------------------
		// 親画面データ再読込
		controlselect();
		//-----------------------------------------------------------------------------
                //}}user_implement_dev:<controlcloseSub1>
		logger.exiting("AF0070010Control"+":USER="+struct.getsUser_ID(),"controlcloseSub1");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0070");
		logger.entering("AF0070010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
		//-----------------------------------------------------------------------------
		// ユーザ定義初期化
		usersInitialize();
		//-----------------------------------------------------------------------------
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AF0070010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0070");
		logger.entering("AF0070010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
		//-----------------------------------------------------------------------------
		// クリア処理
		controlclear();

		// ユーザ定義初期化
		usersInitialize();
		//-----------------------------------------------------------------------------
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AF0070010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * イベントハンドラの前処理です。
	 *
	 * @param buttun ボタン名
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0070");
		logger.entering("AF0070010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("AF0070010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("modify") ) {
				controlmodify();
			} else if( button.equals("clear") ) {
				controlclear();
			} else if( button.equals("insertSub1") ) {
				controlinsertSub1();
			} else if( button.equals("closeSub1") ) {
				controlcloseSub1();
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
//			throw new FoundationException("AF0070010Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AF0070010-E999","CSVの出力処理"));
			throw new FoundationException("AF0070010Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AF0070010-E999","システム日付の取得処理"));
				throw new FoundationException("AF0070010Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AF0070010-E999","コントロールのイベント処理"));
			throw new FoundationException("AF0070010Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected AF0070010Entity entity;
	protected AF0070010Struct struct;
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

		entity = new AF0070010Entity();
		struct = new AF0070010Struct();

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
	 * AF0070010クラスの標準コンストラクタ
	 */
	public AF0070010Control() throws BusinessProcessException, FoundationException
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
				AF0070010Struct key = (AF0070010Struct)keyList.get(j);
				// メッセージキーを作成する
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("ALC_POS_STOCK_QTY") && key.getALC_POS_STOCK_QTY() != null) {
					msgKey.setKeyValue("ALC_POS_STOCK_QTY", key.getALC_POS_STOCK_QTY());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_POS_QTY") && key.getRCV_ISSUE_POS_QTY() != null) {
					msgKey.setKeyValue("RCV_ISSUE_POS_QTY", key.getRCV_ISSUE_POS_QTY());
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
				if(msgKeyType.containsKeyColumn("JOB_ODR_DETAIL_NO") && key.getJOB_ODR_DETAIL_NO() != null) {
					msgKey.setKeyValue("JOB_ODR_DETAIL_NO", key.getJOB_ODR_DETAIL_NO());
				}
				if(msgKeyType.containsKeyColumn("WH_CD") && key.getWH_CD() != null) {
					msgKey.setKeyValue("WH_CD", key.getWH_CD());
				}
				if(msgKeyType.containsKeyColumn("WH_NAME") && key.getWH_NAME() != null) {
					msgKey.setKeyValue("WH_NAME", key.getWH_NAME());
				}
				if(msgKeyType.containsKeyColumn("MRP_FLG") && key.getMRP_FLG() != null) {
					msgKey.setKeyValue("MRP_FLG", key.getMRP_FLG());
				}
				if(msgKeyType.containsKeyColumn("w_WH_STOCK_QTY") && key.getw_WH_STOCK_QTY() != null) {
					msgKey.setKeyValue("w_WH_STOCK_QTY", key.getw_WH_STOCK_QTY());
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
				if(msgKeyType.containsKeyColumn("w_UNIT_QTY_TYP") && key.getw_UNIT_QTY_TYP() != null) {
					msgKey.setKeyValue("w_UNIT_QTY_TYP", key.getw_UNIT_QTY_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("w_ITEM_CD") && key.getw_ITEM_CD() != null) {
					msgKey.setKeyValue("w_ITEM_CD", key.getw_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("w_JOB_ODR_CD") && key.getw_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("w_JOB_ODR_CD", key.getw_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("w_WH_CD") && key.getw_WH_CD() != null) {
					msgKey.setKeyValue("w_WH_CD", key.getw_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("w_PLANT_CD") && key.getw_PLANT_CD() != null) {
					msgKey.setKeyValue("w_PLANT_CD", key.getw_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("h_BUSINESS_OPR_DATE") && key.geth_BUSINESS_OPR_DATE() != null) {
					msgKey.setKeyValue("h_BUSINESS_OPR_DATE", key.geth_BUSINESS_OPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("w_COMPANY_CD") && key.getw_COMPANY_CD() != null) {
					msgKey.setKeyValue("w_COMPANY_CD", key.getw_COMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("w_JOB_ODR_STOCK_QTY") && key.getw_JOB_ODR_STOCK_QTY() != null) {
					msgKey.setKeyValue("w_JOB_ODR_STOCK_QTY", key.getw_JOB_ODR_STOCK_QTY());
				}
				if(msgKeyType.containsKeyColumn("w_RCV_ISSUE_CTRL_CD") && key.getw_RCV_ISSUE_CTRL_CD() != null) {
					msgKey.setKeyValue("w_RCV_ISSUE_CTRL_CD", key.getw_RCV_ISSUE_CTRL_CD());
				}
				if(msgKeyType.containsKeyColumn("w_RCV_ISSUE_TYP") && key.getw_RCV_ISSUE_TYP() != null) {
					msgKey.setKeyValue("w_RCV_ISSUE_TYP", key.getw_RCV_ISSUE_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_QTY") && key.getRCV_ISSUE_QTY() != null) {
					msgKey.setKeyValue("RCV_ISSUE_QTY", key.getRCV_ISSUE_QTY());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_DATE") && key.getRCV_ISSUE_DATE() != null) {
					msgKey.setKeyValue("RCV_ISSUE_DATE", key.getRCV_ISSUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("w_RCV_ISSUE_GNR_TYP") && key.getw_RCV_ISSUE_GNR_TYP() != null) {
					msgKey.setKeyValue("w_RCV_ISSUE_GNR_TYP", key.getw_RCV_ISSUE_GNR_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("VEND_LOT_NO") && key.getVEND_LOT_NO() != null) {
					msgKey.setKeyValue("VEND_LOT_NO", key.getVEND_LOT_NO());
				}
				if(msgKeyType.containsKeyColumn("w_VEND_CD") && key.getw_VEND_CD() != null) {
					msgKey.setKeyValue("w_VEND_CD", key.getw_VEND_CD());
				}
				if(msgKeyType.containsKeyColumn("w_CONS_TYP") && key.getw_CONS_TYP() != null) {
					msgKey.setKeyValue("w_CONS_TYP", key.getw_CONS_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("w_STOCK_UPD_TYP") && key.getw_STOCK_UPD_TYP() != null) {
					msgKey.setKeyValue("w_STOCK_UPD_TYP", key.getw_STOCK_UPD_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("PAST_RESULT_ENTRY_TYP") && key.getPAST_RESULT_ENTRY_TYP() != null) {
					msgKey.setKeyValue("PAST_RESULT_ENTRY_TYP", key.getPAST_RESULT_ENTRY_TYP());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("l_COUNT") && key.getl_COUNT() != null) {
					msgKey.setKeyValue("l_COUNT", key.getl_COUNT());
				}
				if(msgKeyType.containsKeyColumn("ROW_COUNT") && key.getROW_COUNT() != null) {
					msgKey.setKeyValue("ROW_COUNT", key.getROW_COUNT());
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
					AF0070010Struct key = new AF0070010Struct();
					if(msgKeyType.containsKeyColumn("ALC_POS_STOCK_QTY")) {
						key.setALC_POS_STOCK_QTY(msgKey.getKeyValue("ALC_POS_STOCK_QTY"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_POS_QTY")) {
						key.setRCV_ISSUE_POS_QTY(msgKey.getKeyValue("RCV_ISSUE_POS_QTY"));
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
					if(msgKeyType.containsKeyColumn("JOB_ODR_DETAIL_NO")) {
						key.setJOB_ODR_DETAIL_NO(msgKey.getKeyValue("JOB_ODR_DETAIL_NO"));
					}
					if(msgKeyType.containsKeyColumn("WH_CD")) {
						key.setWH_CD(msgKey.getKeyValue("WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("WH_NAME")) {
						key.setWH_NAME(msgKey.getKeyValue("WH_NAME"));
					}
					if(msgKeyType.containsKeyColumn("MRP_FLG")) {
						key.setMRP_FLG(msgKey.getKeyValue("MRP_FLG"));
					}
					if(msgKeyType.containsKeyColumn("w_WH_STOCK_QTY")) {
						key.setw_WH_STOCK_QTY(msgKey.getKeyValue("w_WH_STOCK_QTY"));
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
					if(msgKeyType.containsKeyColumn("w_UNIT_QTY_TYP")) {
						key.setw_UNIT_QTY_TYP(new Integer(msgKey.getKeyValue("w_UNIT_QTY_TYP")));
					}
					if(msgKeyType.containsKeyColumn("w_ITEM_CD")) {
						key.setw_ITEM_CD(msgKey.getKeyValue("w_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_JOB_ODR_CD")) {
						key.setw_JOB_ODR_CD(msgKey.getKeyValue("w_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_WH_CD")) {
						key.setw_WH_CD(msgKey.getKeyValue("w_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_PLANT_CD")) {
						key.setw_PLANT_CD(msgKey.getKeyValue("w_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_BUSINESS_OPR_DATE")) {
						key.seth_BUSINESS_OPR_DATE(msgKey.getKeyValue("h_BUSINESS_OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("w_COMPANY_CD")) {
						key.setw_COMPANY_CD(msgKey.getKeyValue("w_COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_JOB_ODR_STOCK_QTY")) {
						key.setw_JOB_ODR_STOCK_QTY(msgKey.getKeyValue("w_JOB_ODR_STOCK_QTY"));
					}
					if(msgKeyType.containsKeyColumn("w_RCV_ISSUE_CTRL_CD")) {
						key.setw_RCV_ISSUE_CTRL_CD(msgKey.getKeyValue("w_RCV_ISSUE_CTRL_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_RCV_ISSUE_TYP")) {
						key.setw_RCV_ISSUE_TYP(new Integer(msgKey.getKeyValue("w_RCV_ISSUE_TYP")));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_QTY")) {
						key.setRCV_ISSUE_QTY(msgKey.getKeyValue("RCV_ISSUE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_DATE")) {
						key.setRCV_ISSUE_DATE(msgKey.getKeyValue("RCV_ISSUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("w_RCV_ISSUE_GNR_TYP")) {
						key.setw_RCV_ISSUE_GNR_TYP(new Integer(msgKey.getKeyValue("w_RCV_ISSUE_GNR_TYP")));
					}
					if(msgKeyType.containsKeyColumn("VEND_LOT_NO")) {
						key.setVEND_LOT_NO(msgKey.getKeyValue("VEND_LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("w_VEND_CD")) {
						key.setw_VEND_CD(msgKey.getKeyValue("w_VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_CONS_TYP")) {
						key.setw_CONS_TYP(new Integer(msgKey.getKeyValue("w_CONS_TYP")));
					}
					if(msgKeyType.containsKeyColumn("w_STOCK_UPD_TYP")) {
						key.setw_STOCK_UPD_TYP(new Integer(msgKey.getKeyValue("w_STOCK_UPD_TYP")));
					}
					if(msgKeyType.containsKeyColumn("PAST_RESULT_ENTRY_TYP")) {
						key.setPAST_RESULT_ENTRY_TYP(msgKey.getKeyValue("PAST_RESULT_ENTRY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_COUNT")) {
						key.setl_COUNT(msgKey.getKeyValue("l_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("ROW_COUNT")) {
						key.setROW_COUNT(msgKey.getKeyValue("ROW_COUNT"));
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
