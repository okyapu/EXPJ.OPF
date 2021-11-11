/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AF0090/src/com/nec/jp/orteus/metamorBase/AF0090/AF0090010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AF0090;

import com.nec.jp.orteus.metamorBase.AF0090.*;
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
import com.nec.jp.orteus.metamorBase.common08.LotCtrl.*;
import com.nec.jp.orteus.expj.pr.rcvissue.process.IssueProcess;
import com.nec.jp.orteus.expj.pr.rcvissue.process.IssueRemain;
import com.nec.jp.orteus.metamorBase.common01.util.Calculate;
import com.nec.jp.orteus.metamorBase.common08.LotCtrl.*;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.math.BigDecimal;

import com.nec.jp.orteus.metamorBase.common01.Accessor.ProductStructureRepository;
//-----------------------------------------------------------------------------
//}}user_implement_code_import

//{{user_implement_code_header
/**
 * CLASS     : AF0090010Control クラス
 * 修正履歴
 * (2015/08/07), EJaSCM／EJa機能強化対応
 */
//}}user_implement_code_header

public class AF0090010Control
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
	public AF0090010Struct getListvalue(int x) { return (AF0090010Struct)(this.list.get(x)); }	// リストの値を返します。
	public AF0090010Struct getStruct() { return this.struct; }	// Structを返します。
	public AF0090010Struct createStruct() { return new AF0090010Struct(); }	// 新しいStructを作って返します。
	public void setStruct(Object structname) { this.struct.setStruct((AF0090010Struct)structname); }	// Structをセットします。
//	public void initializeStruct() { this.struct.initialize(); }	// Structの値を初期化します。

	// CSV出力用リスト
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }

//20150807 ADD START BY SYSCOM
	//htmlに会社コード渡すためのメソッド
	public String getsysCOMPANY_CD(){ return struct.getCOMPANY_CD(); }
		
	// [コンボボックスデータ]情報(科目コード)ACCT_CD
	private ComboStruct _unitAcctCdStruct = new ComboStruct();
	// [コンボボックスデータ]情報(プロジェクトコード)PJ_CD
    private ComboStruct _unitPjCdStruct = new ComboStruct();
	// [コンボボックスデータ]情報(セグメント1)SEG_CONTENTS1
	private ComboStruct _unitSegContent1Struct = new ComboStruct();
	// [コンボボックスデータ]情報(セグメント2)SEG_CONTENTS2
	private ComboStruct _unitSegContent2Struct = new ComboStruct();
	// [コンボボックスデータ]情報(セグメント3)SEG_CONTENTS3
	private ComboStruct _unitSegContent3Struct = new ComboStruct();
	// [コンボボックスデータ]情報(セグメント4)SEG_CONTENTS4
    private ComboStruct _unitSegContent4Struct = new ComboStruct();
//20150807 ADD END BY SYSCOM
		
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
	 */
	private void setWarnMessage(String messageno)
	{
		ExpjMessage emsg = new ExpjMessage( messageno );
		msgStruct.addWarn( emsg );
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
	 * 品目別、保管区出庫可能数のセット
	 * @param mrpOdrTyp 品目手配区分
	 */
	private void calcPosQty(Integer mrpOdrTyp) throws SQLException, FoundationException
	{
		List buffList = null;
		AF0090010Struct buffStruct = null;
		String s_num = new String("0.0");
		// 品目在庫から出庫する場合
		if(struct.getw_JOB_ODR().intValue() == 0){
			// 保管区在庫数取得
			buffList = entity.mselectT_ITEM_STOCK_stock_on_hand_qty.read(conn, struct);
			if(buffList.size() <= 0)
				struct.setw_WH_STOCK_ON_HAND_QTY(s_num);
			else{
				buffStruct = (AF0090010Struct)buffList.get(0);
				struct.setw_WH_STOCK_ON_HAND_QTY(buffStruct.getw_WH_STOCK_ON_HAND_QTY());
			}

			// 保管区不良在庫数取得
			buffList = entity.mselectT_ITEM_STOCK_defect_qty.read(conn, struct);
			if(buffList.size() <= 0)
				struct.setDEFECT_QTY(s_num);
			else{
				buffStruct = (AF0090010Struct)buffList.get(0);
				struct.setDEFECT_QTY(buffStruct.getDEFECT_QTY());
			}

			// 在庫累計数取得
			buffList = entity.mselectT_ITEM_STOCK_sum_total_stock_on_hand_qty.read(conn, struct);
			if(buffList.size() <= 0)
				struct.setw_TOTAL_STOCK_ON_HAND_QTY(s_num);
			else{
				buffStruct = (AF0090010Struct)buffList.get(0);
				struct.setw_TOTAL_STOCK_ON_HAND_QTY(buffStruct.getw_TOTAL_STOCK_ON_HAND_QTY());
			}

			// 不良品在庫累計数取得
			buffList = entity.mselectT_ITEM_STOCK_sum_total_defect_qty.read(conn, struct);
			if(buffList.size() <= 0)
				struct.setw_TOTAL_DEFECT_QTY(s_num);
			else{
				buffStruct = (AF0090010Struct)buffList.get(0);
				struct.setw_TOTAL_DEFECT_QTY(buffStruct.getw_TOTAL_DEFECT_QTY());
			}
		}
		// 製番在庫から出庫する場合
		else{
			// 保管区在庫数取得
			buffList = entity.mselectT_JOB_ODR_CD_STOCK_stock_on_hand_qty.read(conn, struct);
			if(buffList.size() <= 0)
				struct.setw_WH_STOCK_ON_HAND_QTY(s_num);
			else{
				buffStruct = (AF0090010Struct)buffList.get(0);
				struct.setw_WH_STOCK_ON_HAND_QTY(buffStruct.getw_WH_STOCK_ON_HAND_QTY());
			}

			// 在庫累計数取得
			buffList = entity.mselectT_JOB_ODR_CD_STOCK_sum_total_stock_on_hand_qty.read(conn, struct);
			if(buffList.size() <= 0)
				struct.setw_TOTAL_STOCK_ON_HAND_QTY(s_num);
			else{
				buffStruct = (AF0090010Struct)buffList.get(0);
				struct.setw_TOTAL_STOCK_ON_HAND_QTY(buffStruct.getw_TOTAL_STOCK_ON_HAND_QTY());
			}

			// 不良品在庫のクリア
			struct.setDEFECT_QTY((String)null);
			struct.setw_TOTAL_DEFECT_QTY((String)null);
		}
		
		// 品目別出庫可能数、保管区出庫可能数のセット
		if(mrpOdrTyp.equals(AF0090Const._MRP_ODR_JOB_ODR_CD) ||
				mrpOdrTyp.equals(AF0090Const._MRP_ODR_STOCK_ALC_JOB_ODR_CD)){
			IssueRemain issueRemain = new IssueRemain(conn);
			// 品目別出庫可能数のセット
			if("true".equals(struct.getc_JOB_ODR_CD())){
				struct.setALC_POS_QTY(issueRemain.getFreeStockQtyOfJobOdr(
						struct.getPLANT_CD(), struct.getITEM_CD(),
						struct.getJOB_ODR_CD(), AF0090Const._JOB_ODR_DETAIL_NO).toString());
			}else{
				struct.setALC_POS_QTY(issueRemain.getFreeStockQtyOfItem(
						struct.getPLANT_CD(), struct.getITEM_CD()).toString());
			}
			
			// 保管区出庫可能数
			if(struct.getMRP_FLG().equals(AF0090Const._MRP_TARGET)){
				if(Calculate.compare(struct.getw_WH_STOCK_ON_HAND_QTY(),
						struct.getALC_POS_QTY()) == -1){
					struct.setTHIS_TIME_POS_QTY(struct.getw_WH_STOCK_ON_HAND_QTY());
				}else{
					struct.setTHIS_TIME_POS_QTY(struct.getALC_POS_QTY());
				}
			}else{
				struct.setTHIS_TIME_POS_QTY(struct.getw_WH_STOCK_ON_HAND_QTY());
			}
		}else{
			struct.setALC_POS_QTY(struct.getw_TOTAL_STOCK_ON_HAND_QTY());
			struct.setTHIS_TIME_POS_QTY(struct.getw_WH_STOCK_ON_HAND_QTY());
		}
		// 品目別、保管区出庫可能数がマイナス値の場合は0に補正
		if(Calculate.compare(struct.getTHIS_TIME_POS_QTY(), "0") <= 0){
			struct.setTHIS_TIME_POS_QTY("0");
		}
		if(Calculate.compare(struct.getALC_POS_QTY() == null ? "0" :struct.getALC_POS_QTY() , "0") <= 0){
			struct.setALC_POS_QTY("0");
		}
		// ロット在庫の取得
		if("true".equals(struct.geth_LotCtrl())){
		if ("1".equals(struct.getLOT_CTRL_FLG())) {
			// 1：ロット管理を行う
			buffList = null;
			buffStruct = new AF0090010Struct();
			buffList = entity.mT_LOT_STOCK.read(conn, struct);
			if (buffList.size() > 0) {
				buffStruct = (AF0090010Struct)buffList.get(0);
				struct.setLOT_STOCK_ON_HAND_QTY(buffStruct.getLOT_STOCK_ON_HAND_QTY());
				struct.setLOT_DEFECT_QTY(buffStruct.getLOT_DEFECT_QTY());
				struct.setALLOCABLE_QTY(buffStruct.getALLOCABLE_QTY());
			} else {
				struct.setLOT_STOCK_ON_HAND_QTY(new String("0.0"));
				struct.setLOT_DEFECT_QTY(new String("0.0"));
				struct.setALLOCABLE_QTY(new String("0.0"));
			}
			
		}else{
		    struct.setLOT_STOCK_ON_HAND_QTY((String)null);
		    struct.setLOT_DEFECT_QTY((String)null);
		    struct.setALLOCABLE_QTY((String)null);
		}
		}
	}

//-----------------------------------------------------------------------------

	//---------- ルーピングチェック処理 -------------------------------------------
	/**
	 * ルーピングチェック。逆展開を行い同品目番号が存在 有無
	 * @param repository 製品構成リポジトリ
	 * @param checkItem 対象品目番号
	 * @param item 比較する品目番号
	 * @return true:有  false:無
	 */
	private boolean checkReverseRooping(ProductStructureRepository repository, String targetItem, String item) throws SQLException {
		// 親品目番号一覧取得
		ArrayList itemList = repository.reverseDeployment(item);
		checkItemList(itemList);
		for(int i = 0; i < itemList.size(); i++) {
			if(targetItem.equals((String)itemList.get(i)) == false) {
				// 親品目番号一覧から更に上の親品目取得
				boolean result = checkReverseRooping(repository, targetItem, (String)itemList.get(i));
				if(result == true) return true;
			} else {
				return true;
			}
		}
			return false;
	}

	/**
	 * ルーピングチェック。正展開を行い同品目番号が存在 有無
	 * @param repository 製品構成リポジトリ
	 * @param checkItem 対象品目番号
	 * @param item 比較する品目番号
	 * @return true:有  false:無
	 */
	private boolean checkRooping(ProductStructureRepository repository, String targetItem, String item) throws SQLException {
		// 子品目番号一覧取得
		ArrayList itemList = repository.orderDeployment(item);
		checkItemList(itemList);
		for(int i = 0; i < itemList.size(); i++){
			if(targetItem.equals((String)itemList.get(i)) == false){
				// 子品目番号一覧から更に下の子品目取得
				boolean result = checkRooping(repository, targetItem, (String)itemList.get(i));
				if(result == true) return true;
			} else{
				return true;
			}
		}
		return false;
	}
	//---------- 製品構成レポジトリ関連の処理 -------------------------------------------

	/** 重複チェック
	 * @param itemList 重複チェックする品目リスト
	 */
	private void checkItemList(ArrayList itemList) {
		List workList = new ArrayList(0);
		for(int i = 0; i < itemList.size(); i++) {
			boolean result =true;
			String item_cd = (String)itemList.get(i);
			for(int t = 0; t < workList.size(); t++) {
				if(item_cd.equals((String)workList.get(t)) == true) result = false;
			}
			if(result == true) workList.add(item_cd);
		}
		itemList.clear();
		for(int i = 0; i < workList.size(); i++) itemList.add(workList.get(i));
	}

	/**
	 * 計画外出庫情報登録処理
	 * @param s 登録内容
	 */
	private void insertUnplndIssAn(AF0090010Struct s) throws FoundationException,SQLException{

		AF0090010Struct unplndStruct = new AF0090010Struct();

		// [計画外出庫情報]登録内容設定
		unplndStruct.setISSUE_CTRL_CD(s.getISSUE_CTRL_CD());		// 入出庫管理番号
		unplndStruct.setITEM_CD(s.getITEM_CD());					// 品目番号
		unplndStruct.setJOB_ODR_CD(s.getJOB_ODR_CD());				// 製番
		unplndStruct.setWH_CD(s.getWH_CD());						// 保管区コード
		unplndStruct.setRCV_ISSUE_QTY(s.getRCV_ISSUE_QTY());		// 出庫数
		unplndStruct.setRCV_ISSUE_DATE(s.getRCV_ISSUE_DATE());		// 出庫日
		unplndStruct.setISSUE_ITEM_CD(s.getISSUE_ITEM_CD());		// 親品目番号
		unplndStruct.setISSUE_JOB_ODR_CD(s.getISSUE_JOB_ODR_CD());	// 親製番
		unplndStruct.setISSUE_PROC_CD(s.getISSUE_PROC_CD());		// 払出作業工程コード
		unplndStruct.setsUser_ID(s.getsUser_ID());					// ユーザコード
		unplndStruct.setsSysdate(s.getsSysdate());					// システム日付

		entity.minsertT_UNPLND_ISS.create(conn,unplndStruct);

	}

//20150807 ADD START BY SYSCOM
	/**
	 * 入出庫別会計連携情報登録処理
	 * @param s 登録内容
	 */
	private void insertRcvIssAiIfDate(AF0090010Struct s) throws FoundationException,SQLException{

		AF0090010Struct rcvissStruct = new AF0090010Struct();

		// [入出庫別会計連携情報]登録内容設定
		rcvissStruct.setISSUE_CTRL_CD(s.getISSUE_CTRL_CD());
		rcvissStruct.setACCT_CD(s.getACCT_CD());				//科目コード
		rcvissStruct.setDEPT_CD(s.getDEPT_CD());				//負担部門コード
		rcvissStruct.setPJ_CD(s.getPJ_CD());					//プロジェクトコード
		rcvissStruct.setSEG_CONTENTS1(s.getSEG_CONTENTS1());	//セグメント1
		rcvissStruct.setSEG_CONTENTS2(s.getSEG_CONTENTS2());	//セグメント2
		rcvissStruct.setSEG_CONTENTS3(s.getSEG_CONTENTS3());	//セグメント3
		rcvissStruct.setSEG_CONTENTS4(s.getSEG_CONTENTS4());	//セグメント4
		rcvissStruct.setsUser_ID(s.getsUser_ID());				// ユーザコード
		rcvissStruct.setsSysdate(s.getsSysdate());				// システム日付

		entity.minsertT_RCV_ISSUE_AI_IF_DATA.create(conn,rcvissStruct);
	}
//20150807 ADD END BY SYSCOM

	/**
	 * システムパラメータ取得
	 */
	private boolean getSysParameter() throws BusinessProcessException, FoundationException {
		boolean b = true;
		try {
			List sysParameterList = entity.mSELECT_SYS_PARAMETER.read(conn, struct);
			if(sysParameterList == null || sysParameterList.isEmpty()) return b;
			AF0090010Struct sysParameterStruct = (AF0090010Struct) sysParameterList.get(0);
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
			AF0090010Struct procExecDateStruct = (AF0090010Struct) procExecDateList.get(0);
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
	/**
	 * 情報メッセージ設定
	 * @param メッセージ番号
	 * @param 出力メッセージ(List)
	 */
	private void setInfoMessage(String messageno, List message)
	{
		ExpjMessage emsg = new ExpjMessage( messageno );
		msgStruct.addInfo( emsg );
		sysLog.config(emsg, getsysUSER_CD());
		
		for(int i=0; i<message.size(); i++)
		{
			emsg = new ExpjMessage( "ZZ01006", (String)message.get(i) );
			msgStruct.addInfo( emsg );
			sysLog.config(emsg, getsysUSER_CD());
		}
	}
		
//20150807 ADD START BY SYSCOM
	/**
	* Viewの値をコンボボックスに表示
	*
	*/
	public ComboStruct createComboData(String createType) throws SQLException, ComboException,Exception {
		ComboStruct rCombo = new ComboStruct();	// コンボボックスデータ
		PreparedStatement stmt = null;			// ステートメント
		try{
			List rsetList = null;
			
			AF0090010Struct struct = new AF0090010Struct();
			
			// SQL実行
			switch(Integer.parseInt(createType)){
			case 1:
				rsetList = entity.mSELECT_V_ACCT_CD.read(conn,struct);
				break;
			case 2:
				rsetList = entity.mSELECT_V_PJ_CD.read(conn,struct);
				break;
			case 3:
				rsetList = entity.mSELECT_V_SEG_CONTENTS_1.read(conn,struct);
				break;
			case 4:
				rsetList = entity.mSELECT_V_SEG_CONTENTS_2.read(conn,struct);
				break;
			case 5:
				rsetList = entity.mSELECT_V_SEG_CONTENTS_3.read(conn,struct);
				break;
			case 6:
				rsetList = entity.mSELECT_V_SEG_CONTENTS_4.read(conn,struct);
				break;
			}
			
			AF0090010Struct tempStruct;
			for(int i=0; i<rsetList.size(); i++) {
				tempStruct = (AF0090010Struct)rsetList.get(i);
				String val = tempStruct.getVALUE();
				String explan = tempStruct.getDISPLAY_NAME();
				rCombo.addData(val, explan);
			}
			
			// 取得データが0以下の場合、例外発生
			if (rCombo.size() <= 0){
				throw new ComboException();
			}
		}catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e);
		}
		return rCombo;
	}
//20150807 ADD END BY SYSCOM

        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * 読込ボタン押下時に実行される処理です。
	 *
	 */
	public void controlselect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0090");
		logger.entering("AF0090010Control"+":USER="+struct.getsUser_ID(),"controlselect");
			//{{user_implement_dev:<controlselect>
		//---------------------------------------------------------------------
		// ログ出力情報格納用
		String logMessage = "";
		List listMessage = new ArrayList();
		Integer mrpOdrTyp = null;

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
				struct.setISSUE_ITEM_CD((String)null);
				struct.setISSUE_JOB_ODR_CD((String)null);
				struct.setISSUE_PROC_CD((String)null);
			    struct.setLOT_STOCK_ON_HAND_QTY((String)null);
			    struct.setLOT_DEFECT_QTY((String)null);
			    struct.setALLOCABLE_QTY((String)null);
//20150807 ADD START BY SYSCOM
				struct.setACCT_CD((String)null);
				struct.setDEPT_CD((String)null);
				struct.setDEPT_NAME((String)null);
				struct.setPJ_CD((String)null);
				struct.setSEG_CONTENTS1((String)null);
				struct.setSEG_CONTENTS2((String)null);
				struct.setSEG_CONTENTS3((String)null);
				struct.setSEG_CONTENTS4((String)null);
//20150807 ADD END BY SYSCOM
			}

			// 品目情報取得
			List itemList = entity.mselectM_ITEM.read(conn, struct);
			if(itemList.size() <= 0){
				// 読込処理失敗：品目番号が存在しません
				logMessage = "M_ITEM.ITEM_CD:" + struct.getITEM_CD();
				setErrorMessage("AF00020", logMessage);
			}
			else{
// 2008/09/02 ADD TSUCHIDA START
				if(((AF0090010Struct)itemList.get(0)).getw_MANHOUR_TYP().equals("1")) {
					// 読込処理失敗：品目番号に、工数管理品目は指定できません。
					logMessage = "M_ITEM.ITEM_CD:" + struct.getITEM_CD();
					setErrorMessage("AA00188", logMessage);
				}
// 2008/09/02 ADD TSUCHIDA END
				// 品目情報設定
				AF0090010Struct itemStruct = (AF0090010Struct)itemList.get(0);
				struct.setITEM_NAME(itemStruct.getITEM_NAME());
				struct.setDRAW_CD(itemStruct.getDRAW_CD());
				struct.setSPEC(itemStruct.getSPEC());
				struct.setSTOCK_UNIT(itemStruct.getSTOCK_UNIT());
				struct.setLOT_CTRL_FLG(itemStruct.getLOT_CTRL_FLG());
				mrpOdrTyp = itemStruct.getMRP_ODR_TYP();
				struct.seth_lotFlg(itemStruct.getLOT_CTRL_FLG());

				// キー項目ログ表示
				logMessage = "JOB_ODR_CD:" + struct.getJOB_ODR_CD()
							+ ",ITEM_CD:" + struct.getITEM_CD()
							+ ", WH_CD:" + struct.getWH_CD()
							+ ", PLANT_CD:" + struct.getPLANT_CD();
				setSyslogConfig(logMessage);
			}

			// 保管区情報取得
			List whList = entity.mselectM_WH.read(conn, struct);
			if(whList.size() <= 0){
				// 読込処理失敗：保管区コードが存在しません
				logMessage = "M_WH.WH_CD:" + struct.getWH_CD();
				setErrorMessage("AF00022", logMessage);
			}
			else{
				// 保管区情報設定
				AF0090010Struct whStruct = (AF0090010Struct)whList.get(0);
				struct.setWH_NAME(whStruct.getWH_NAME());
				struct.setMRP_FLG(whStruct.getMRP_FLG());

				// 保管区の工場コードチェック
				result = entity.mcheckM_WH_plant_cd.check(conn, struct);
				if(result == false){
					// 読込処理失敗：保管区コードは他の工場のデータなので指定できません
					listMessage.add("M_WH.WH_CD:" + struct.getWH_CD());
					setErrorMessage("AF00023", listMessage);
					listMessage.clear();
				}
			}
//20150807 ADD START BY SYSCOM
			// 負担部門名情報取得
			List dept_nameList = entity.mgetDEPT_NAME.read(conn, struct);
			if(dept_nameList.size() <= 0){
				struct.setDEPT_NAME("");
			}
			else{
				// 負担部門名情報設定
				AF0090010Struct dept_nameStruct = (AF0090010Struct)dept_nameList.get(0);
				struct.setDEPT_NAME(dept_nameStruct.getDEPT_NAME());
			}
//20150807 ADD END BY SYSCOM
			// 在庫ロットチェック
			if("true".equals(struct.geth_LotCtrl())){
			if(itemList.size() > 0) {
				if ("1".equals(struct.getLOT_CTRL_FLG())) {
					// 1：ロット管理を行う
					if (struct.getLOT_NO() == null
							|| "".equals(struct.getLOT_NO())) {
						// 読込処理失敗：在庫ロット番号は省略できません。
						listMessage.add("M_ITEM.ITEM_CD:" + struct.getITEM_CD());
						listMessage.add("M_ITEM.LOT_CTRL_FLG:" + struct.getLOT_CTRL_FLG());
						setErrorMessage("AF20005", listMessage);
						listMessage.clear();
					}
				} else {
					// 0：ロット管理を行わない
					if (struct.getLOT_NO() != null
							&& !"".equals(struct.getLOT_NO())) {
						// 読込処理失敗：在庫ロット番号は入力できません。
						listMessage.add("M_ITEM.ITEM_CD:" + struct.getITEM_CD());
						listMessage.add("M_ITEM.LOT_CTRL_FLG:" + struct.getLOT_CTRL_FLG());
						setErrorMessage("AF20006", listMessage);
						listMessage.clear();
					}
				}
			}
		}
			// チェックでエラーが発生していない場合
			if(msgStruct.sizeError() <= 0)
			{
				// ロット管理のチェック
				if("true".equals(struct.geth_LotCtrl())){
				if (struct.getLOT_NO() != null
						&& !"".equals(struct.getLOT_NO())) {
					result = entity.mT_LOT_CTRL.check(conn, struct);
					if(result == false){
						// 読込処理失敗：ロット管理データは存在しません。
						listMessage.add("T_LOT_CTRL.LOT_NO:" + struct.getLOT_NO());
						listMessage.add("T_LOT_CTRL.ITEM_CD:" + struct.getITEM_CD());
						setErrorMessage("AF20002", listMessage);
						listMessage.clear();
					}
				}
				}
				if(struct.getw_JOB_ODR().intValue() == 0){
					// 品目在庫から出庫する場合
					result = entity.mcheckT_ITEM_STOCK.check(conn, struct);
					if(result == false){
						// 読込処理失敗：保管区別品目在庫データが存在しません
						listMessage.add("T_ITEM_STOCK.ITEM_CD:" + struct.getITEM_CD());
						listMessage.add("T_ITEM_STOCK.WH_CD:" + struct.getWH_CD());
						listMessage.add("T_ITEM_STOCK.PLANT_CD:" + struct.getPLANT_CD());
						setErrorMessage("AF00044", listMessage);
						listMessage.clear();
					}
				}
				else{
					// 製番在庫から出庫する場合
					result = entity.mcheckT_JOB_ODR_CD_STOCK.check(conn, struct);
					if(result == false){
						// 読込処理失敗：保管区別製番在庫データが存在しません
						listMessage.add("T_JOB_ODR_CD_STOCK.JOB_ODR_CD:" + struct.getJOB_ODR_CD());
						listMessage.add("T_JOB_ODR_CD_STOCK.ITEM_CD:" + struct.getITEM_CD());
						listMessage.add("T_JOB_ODR_CD_STOCK.WH_CD:" + struct.getWH_CD());
						listMessage.add("T_JOB_ODR_CD_STOCK.PLANT_CD:" + struct.getPLANT_CD());
						setErrorMessage("AF00045", listMessage);
						listMessage.clear();
					}
				}
				
				// [所要量]のオーダデマンド完了チェック
				if("true".equals(struct.getc_JOB_ODR_CD()) &&
						entity.mT_OD.check(conn, struct)){
					listMessage.add("T_OD.PLANT_CD:" + struct.getPLANT_CD());
					listMessage.add("T_OD.ITEM_CD:" + struct.getITEM_CD());
					listMessage.add("T_OD.JOB_ODR_CD:" + struct.getJOB_ODR_CD());
					listMessage.add("T_OD.JOB_ODR_DETAIL_NO:0");
					listMessage.add("T_OD.PARENT_OD_NO:IS NOT NULL");
					listMessage.add("T_OD.DM_STS_TYP:<>9");
					setErrorMessage("AF00119", listMessage);
					listMessage.clear();
				}
			}

			// チェックでエラーが発生していない場合
			if(msgStruct.sizeError() <= 0)
			{
				// 品目別出庫可能数、保管区出庫可能数のセット
				calcPosQty(mrpOdrTyp);
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
					AF0090010Struct dateStruct = (AF0090010Struct)dateList.get(0);
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
				struct.setw_WH_STOCK_ON_HAND_QTY(new String("0.0"));
				struct.setDEFECT_QTY(new String("0.0"));
				struct.setw_TOTAL_STOCK_ON_HAND_QTY(new String("0.0"));
				struct.setw_TOTAL_DEFECT_QTY(new String("0.0"));
				
				struct.setALC_POS_QTY(new String("0.0"));
				struct.setTHIS_TIME_POS_QTY(new String("0.0"));
				
				struct.setLOT_STOCK_ON_HAND_QTY(new String("0.0"));
				struct.setLOT_DEFECT_QTY(new String("0.0"));
				struct.setALLOCABLE_QTY(new String("0.0"));
			}

		}catch(SQLException e){
			setSqlExceptionMsg(e);

		}finally{
			_mode = _SELECT;
		}
		//---------------------------------------------------------------------
                //}}user_implement_dev:<controlselect>
		logger.exiting("AF0090010Control"+":USER="+struct.getsUser_ID(),"controlselect");

		return;
	}

	/**
	 * 登録ボタン押下時に実行される処理です。
	 *
	 */
	public void controlinsert() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0090");
		logger.entering("AF0090010Control"+":USER="+struct.getsUser_ID(),"controlinsert");
			//{{user_implement_dev:<controlinsert>
		//---------------------------------------------------------------------
		// ログ出力情報格納用
		String logMessage = "";
		List listMessage = new ArrayList();
		Integer mrpOdrTyp = null;
		Integer issueOutsideTyp = new Integer(0);
		String sumRcvIssueQty = "0";
		boolean blnRet;

		List tempList;
		AF0090010Struct tempStruct = new AF0090010Struct();

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

			// クリア
			struct.setITEM_NAME((String)null);
			struct.setDRAW_CD((String)null);
			struct.setSPEC((String)null);
			struct.setSTOCK_UNIT((String)null);
			struct.setWH_NAME((String)null);

			// 品目情報取得
			List itemList = entity.mselectM_ITEM.read(conn, struct);
			AF0090010Struct itemStruct = null;
			if(itemList.size() <= 0){
				// 登録処理失敗：品目番号が存在しません
				logMessage = "M_ITEM.ITEM_CD:" + struct.getITEM_CD();
				setErrorMessage("AF00020", logMessage);
			}
			else{
// 2008/09/02 ADD TSUCHIDA START
				if(((AF0090010Struct)itemList.get(0)).getw_MANHOUR_TYP().equals("1")) {
					// 読込処理失敗：品目番号に、工数管理品目は指定できません。
					logMessage = "M_ITEM.ITEM_CD:" + struct.getITEM_CD();
					setErrorMessage("AA00188", logMessage);
				}
// 2008/09/02 ADD TSUCHIDA END

				// 品目情報設定
				itemStruct = (AF0090010Struct)itemList.get(0);
				struct.setITEM_NAME(itemStruct.getITEM_NAME());
				struct.setDRAW_CD(itemStruct.getDRAW_CD());
				struct.setSPEC(itemStruct.getSPEC());
				struct.setSTOCK_UNIT(itemStruct.getSTOCK_UNIT());
				struct.setLOT_CTRL_FLG(itemStruct.getLOT_CTRL_FLG());
				mrpOdrTyp = itemStruct.getMRP_ODR_TYP();
			}

			// 保管区情報取得
			List whList = entity.mselectM_WH.read(conn, struct);
			AF0090010Struct whStruct = null;
			if(whList.size() <= 0){
				// 登録処理失敗：保管区コードが存在しません
				logMessage = "M_WH.WH_CD:" + struct.getWH_CD();
				setErrorMessage("AF00022", logMessage);
			}
			else{
				// 保管区情報設定
				whStruct = (AF0090010Struct)whList.get(0);
				struct.setWH_NAME(whStruct.getWH_NAME());
				struct.setMRP_FLG(whStruct.getMRP_FLG());
				struct.setw_WH_TYP(whStruct.getw_WH_TYP());
				
				// 保管区の工場コードチェック
				result = entity.mcheckM_WH_plant_cd.check(conn, struct);
				if(result == false){
					// 登録処理失敗：保管区コードは他の工場のデータなので指定できません
					listMessage.add("M_WH.WH_CD:" + struct.getWH_CD());
					setErrorMessage("AF00023", listMessage);
					listMessage.clear();
				}
			}
			
			// 在庫ロットチェック
			if("true".equals(struct.geth_LotCtrl())){
			if(itemList.size() > 0) {
				if ("1".equals(struct.getLOT_CTRL_FLG())) {
					// 1：ロット管理を行う
					if (struct.getLOT_NO() == null
							|| "".equals(struct.getLOT_NO())) {
						// 読込処理失敗：在庫ロット番号は省略できません。
						listMessage.add("M_ITEM.ITEM_CD:" + struct.getITEM_CD());
						listMessage.add("M_ITEM.LOT_CTRL_FLG:" + struct.getLOT_CTRL_FLG());
						setErrorMessage("AF20005", listMessage);
						listMessage.clear();
					} else {
						// ロット管理のチェック
						result = entity.mT_LOT_CTRL.check(conn, struct);
						if(result == false){
							// 読込処理失敗：ロット管理データは存在しません。
							listMessage.add("T_LOT_CTRL.LOT_NO:" + struct.getLOT_NO());
							listMessage.add("T_LOT_CTRL.ITEM_CD:" + struct.getITEM_CD());
							setErrorMessage("AF20002", listMessage);
							listMessage.clear();
						}
					}
				} else {
					// 0：ロット管理を行わない
					if (struct.getLOT_NO() != null
							&& !"".equals(struct.getLOT_NO())) {
						// 読込処理失敗：在庫ロット番号は入力できません。
						listMessage.add("M_ITEM.ITEM_CD:" + struct.getITEM_CD());
						setErrorMessage("AF20006", listMessage);
						listMessage.clear();
					}
				}
			}
			}
			// 品目別、保管区出庫可能数
			if(msgStruct.sizeError() <= 0){
				calcPosQty(mrpOdrTyp);
			}

			// 業務運用日取得
			List dateList = entity.mselectSYS_DATE_CTRL.read(conn, struct);
			AF0090010Struct dateStruct = null;
			if(dateList.size() <= 0){
				// 登録処理失敗：業務運用日が存在しません
				logMessage = "SYS_DATE_CTRL.PLANT_CD:" + struct.getPLANT_CD();
				setErrorMessage("AF00056", logMessage);
			}
			else{
				dateStruct = (AF0090010Struct)dateList.get(0);

				// 出庫日チェック
				Date issue_Date = stringToDate(struct.getRCV_ISSUE_DATE());
				Date business_Date = stringToDate(dateStruct.getBUSINESS_OPR_DATE());
				if(issue_Date.getTime() > business_Date.getTime()){
					// 登録処理失敗：出庫日に未来の日付は指定できません
					logMessage = "SYS_DATE_CTRL.BUSINESS_OPR_DATE:" + dateStruct.getBUSINESS_OPR_DATE();
					setErrorMessage("ZZ05103", logMessage);
				}
			}

			// 出庫先指定時
			if("true".equals(struct.getc_ISSUE_FLG())) {

				//「品目番号」＝「出庫先品目番号」の場合エラー
				if(struct.getITEM_CD().equals(struct.getISSUE_ITEM_CD())){
					setErrorMessage("AF00176");				
				}
				
				// 「出庫先品目番号」存在チェック
				tempStruct.setITEM_CD(struct.getISSUE_ITEM_CD());
				tempList = entity.mselectM_ITEM.read(conn,tempStruct);
				if(tempList.isEmpty()) {
					listMessage.add("M_ITEM.ITEM_CD:" + tempStruct.getITEM_CD());
					setErrorMessage("AF00020",listMessage);
					listMessage.clear();
				} else {
					tempStruct = (AF0090010Struct)tempList.get(0);
					issueOutsideTyp = tempStruct.getOUTSIDE_TYP();
				}

				// エラーが発生してない場合
				if(msgStruct.sizeError() <= 0) {
					// 「出庫先品目番号」ルーピングチェック
					// 製品構成リポジトリ作成
					ProductStructureRepository repository = new ProductStructureRepository(conn);
					// ルーピングチェック true:有  false:無
					if(checkReverseRooping(repository, struct.getITEM_CD(), struct.getISSUE_ITEM_CD())) {
						setErrorMessage("AF00147");
					}
				}

				// 「出庫先製番」が入力されている場合、製番計画存在チェック
				if(!"".equals(struct.getISSUE_JOB_ODR_CD()) && struct.getISSUE_JOB_ODR_CD() != null) {
					tempStruct.setPLANT_CD(getsysPLANT_CD());
					tempStruct.setISSUE_JOB_ODR_CD(struct.getISSUE_JOB_ODR_CD());
					tempList = entity.mselectT_JOB_ODR_issue_job_odr.read(conn,tempStruct);
					if(tempList.isEmpty()) {
						listMessage.add("T_JOB_ODR.JOB_ODR_CD:" + tempStruct.getISSUE_JOB_ODR_CD());
						listMessage.add("T_JOB_ODR.PLANT_CD:" + tempStruct.getPLANT_CD());
						setErrorMessage("AF00148",listMessage);
						listMessage.clear();
					}
				}

				// エラーが発生していない場合[所要量]検索
				if(msgStruct.sizeError() <= 0) {
					tempStruct.setPLANT_CD(getsysPLANT_CD());
					tempStruct.setISSUE_ITEM_CD(struct.getISSUE_ITEM_CD());
					tempStruct.setISSUE_JOB_ODR_CD(struct.getISSUE_JOB_ODR_CD());
					tempList = entity.mselectT_OD_odr_sts_typ.read(conn,tempStruct);
					if(!tempList.isEmpty()) {
						tempStruct = (AF0090010Struct)tempList.get(0);
						if(!"2".equals(tempStruct.getw_ODR_STS_TYP()) && !"9".equals(tempStruct.getw_ODR_STS_TYP())) {
							setErrorMessage("AF00149");
						}
					}
				}

				// 「出庫先作業工程コード」が入力されている場合
				if(msgStruct.sizeError() <= 0) {
					if(!"".equals(struct.getISSUE_PROC_CD()) && struct.getISSUE_PROC_CD() != null) {
						tempStruct.setPLANT_CD(getsysPLANT_CD());
						tempStruct.setISSUE_ITEM_CD(struct.getISSUE_ITEM_CD());
						tempStruct.setISSUE_PROC_CD(struct.getISSUE_PROC_CD());
						tempList = entity.mselectM_PROC_GRP_issue.read(conn,tempStruct);
						if(tempList.isEmpty()) {
							listMessage.add("M_PROC_GRP.PLANT_CD:" + tempStruct.getPLANT_CD());
							listMessage.add("M_PROC_GRP.ITEM_CD:" + tempStruct.getISSUE_ITEM_CD());
							listMessage.add("M_PROC_GRP.PROC_CD:" + tempStruct.getISSUE_PROC_CD());
							setErrorMessage("AF00150",listMessage);
							listMessage.clear();
						}
					}
				}
				
				// [計画外出庫情報]出庫数チェック
				if(msgStruct.sizeError() <= 0) {
					if(Calculate.compare(struct.getRCV_ISSUE_QTY(),"0") < 0) {
						tempStruct.setRCV_ISSUE_DATE(struct.getRCV_ISSUE_DATE());
						tempStruct.setITEM_CD(struct.getITEM_CD());
						tempStruct.setJOB_ODR_CD(struct.getJOB_ODR_CD());
						tempStruct.setISSUE_ITEM_CD(struct.getISSUE_ITEM_CD());
						tempStruct.setISSUE_JOB_ODR_CD(struct.getISSUE_JOB_ODR_CD());
						tempStruct.setISSUE_PROC_CD(struct.getISSUE_PROC_CD());
						tempList = entity.mselectT_UNPLND_ISS.read(conn,tempStruct);

						if(tempList.isEmpty()) {
							sumRcvIssueQty = struct.getRCV_ISSUE_QTY();
						} else {
							tempStruct = (AF0090010Struct)tempList.get(0);
							sumRcvIssueQty = Calculate.add(tempStruct.getw_SUM_RCV_ISSUE_QTY(),struct.getRCV_ISSUE_QTY());
						}

						// [計画外出庫情報]出庫数+[画面]出庫数 < 0の場合
						if(Calculate.compare(sumRcvIssueQty,"0") < 0) {
							setErrorMessage("AF00152");
						}
					}
				}

			}

//20150807 ADD START BY SYSCOM
				//「負担部門コード」が≠Nullの場合
				if(!"".equals(struct.getDEPT_CD()) && struct.getDEPT_CD() != null){
					//[負担部門View]をログインユーザの所属会社コード＋「負担部門コード」で検索
					tempStruct.setCOMPANY_CD(struct.getCOMPANY_CD());
					tempStruct.setDEPT_CD(struct.getDEPT_CD());
					tempList = entity.mSELECT_V_DEPT_CD.read(conn, tempStruct);
					//存在しない場合
					if(tempList.isEmpty()) {
						// エラーメッセージ
						setErrorMessage("AA23603");
						setErrorParameter("T_RCV_ISSUE_AI_IF_DATA", "DEPT_CD", struct.getDEPT_CD());
					}
				}
//20150807 ADD END BY SYSCOM
			
			// チェックでエラーが発生していない場合
			if(msgStruct.sizeError() <= 0)
			{
				if(struct.getw_JOB_ODR().intValue() == 0){
					// 品目在庫から出庫する場合
					result = entity.mcheckT_ITEM_STOCK.check(conn, struct);
					if(result == false){
						// 登録処理失敗：保管区別品目在庫データが存在しません
						listMessage.add("T_ITEM_STOCK.ITEM_CD:" + struct.getITEM_CD());
						listMessage.add("T_ITEM_STOCK.WH_CD:" + struct.getWH_CD());
						listMessage.add("T_ITEM_STOCK.PLANT_CD:" + struct.getPLANT_CD());
						setErrorMessage("AF00044", listMessage);
						listMessage.clear();
					}
				}
				else{
					// 製番在庫から出庫する場合
					result = entity.mcheckT_JOB_ODR_CD_STOCK.check(conn, struct);
					if(result == false){
						// 登録処理失敗：保管区別製番在庫データが存在しません
						listMessage.add("T_JOB_ODR_CD_STOCK.JOB_ODR_CD:" + struct.getJOB_ODR_CD());
						listMessage.add("T_JOB_ODR_CD_STOCK.ITEM_CD:" + struct.getITEM_CD());
						listMessage.add("T_JOB_ODR_CD_STOCK.WH_CD:" + struct.getWH_CD());
						listMessage.add("T_JOB_ODR_CD_STOCK.PLANT_CD:" + struct.getPLANT_CD());
						setErrorMessage("AF00045", listMessage);
						listMessage.clear();
					}
				}
				// 在庫ロットと出荷元保管区のチェック 

				String tempAllocableQty = new String("0.0");
				if("true".equals(struct.geth_LotCtrl())){
				if (struct.getLOT_NO() != null
						&& !"".equals(struct.getLOT_NO())) {
					List tmpList = null;
					tmpList = entity.mT_LOT_STOCK.read(conn, struct);
					if (tmpList.size() > 0) {
						AF0090010Struct tempStruct1 = (AF0090010Struct)tmpList.get(0);
						tempAllocableQty = tempStruct1.getALLOCABLE_QTY();
						if("true".equals(struct.getc_RCV_ISSUE_QTY())
								&& Calculate.compare(
										struct.getRCV_ISSUE_QTY(),tempStruct1.getLOT_DEFECT_QTY()) > 0){
							      listMessage.add("T_LOT_STOCK.ITEM_CD:" + struct.getITEM_CD());
							      listMessage.add("T_LOT_STOCK.WH_CD:" + struct.getWH_CD());						
							      listMessage.add("T_LOT_STOCK.LOT_NO:" + struct.getLOT_NO());						
							      setErrorMessage("AF00069", listMessage);
							      listMessage.clear();
					}
				  }
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
												"AF0090010Control",
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

//20150807 DEL START BY SYSCOM
//						// 会社コード取得
//						List companyList = entity.mselectSYS_MY_COMPANY.read(conn, struct);
//						if(companyList.size() > 0){
//							AF0090010Struct companyStruct = (AF0090010Struct)companyList.get(0);
//							struct.setCOMPANY_CD(companyStruct.getCOMPANY_CD());
//						}
//20150807 DEL END BY SYSCOM
						
						// 入出庫区分設定
						if(struct.getw_INFERIOR().intValue() == 0)
							struct.setISSUE_TYP(new Integer(2));		// 出庫
						else
							struct.setISSUE_TYP(new Integer(4));		// 不良品出庫

						// 取引先コード取得
						if(whStruct.getVEND_CD() != null && "".equals(whStruct.getVEND_CD()) == false){
							// 取引先コード設定
							struct.setVEND_CD(whStruct.getVEND_CD());

							// 支給区分設定
							List issueList = entity.mselectM_CONS_UNIT_COST.read(conn, struct);

							if(issueList.size() > 0){
								AF0090010Struct issueStruct = (AF0090010Struct)issueList.get(0);

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

						// 出庫数チェック
						boolean resultCeil = false;
						Calculate calc = new Calculate();

						if(itemStruct.getUNIT_QTY_TYP().intValue() == 1
							&& calc.isNumeric(struct.getRCV_ISSUE_QTY()) == true ){
							struct.setRCV_ISSUE_QTY(calc.ceil(struct.getRCV_ISSUE_QTY(), 0));
							resultCeil = true;
						}

						// 品目情報をStructに設定
						struct.setPRODUCT_TYP(itemStruct.getPRODUCT_TYP());		// 製品区分
						struct.setMRP_ODR_TYP(itemStruct.getMRP_ODR_TYP());		// 品目手配区分
						struct.setOUTSIDE_TYP(itemStruct.getOUTSIDE_TYP());		// 品目内外作区分
						struct.setRCV_ISSUE_GNR_TYP(new Integer(22));			// 入出庫発生区分
						struct.setSBCNT_PUCH_TYP(new Integer(5));				// 外注購入品区分
						struct.setSTOCK_UPD_TYP(new Integer(1));				// 在庫更新区分

						// 保管区別入出庫登録
						entity.minsertT_RCV_ISSUE.create(conn, struct);

						// 計画外理由コードがNULLでない場合、品目別入出庫登録
						if(struct.getNON_PLANNED_CAUSE_CD() != null &&
							"".equals(struct.getNON_PLANNED_CAUSE_CD()) == false){
							entity.minsertT_RCV_ISSUE_ITEM.create(conn, struct);
						}

						// 出庫処理
						IssueProcess issuePrc = new IssueProcess(conn, ctrlCd);
						if(issuePrc.execProcess() == true){
							logMessage = "Issue Process was Complated!";
							setSyslogConfig(logMessage);

							// 保管区出庫可能数と出庫数のチェック
							if("true".equals(struct.getc_JOB_ODR_CD()) &&
									Calculate.compare(struct.getRCV_ISSUE_QTY(),
											struct.getTHIS_TIME_POS_QTY()) == 1){
								setErrorMessage("AF00124");
								conn.rollback();
							}else{
								// 「出庫先を指定する」チェックボックスがonの場合、[計画外出庫情報]登録を行う
								if("true".equals(struct.getc_ISSUE_FLG())) {
									insertUnplndIssAn(struct);

									// 「出庫先作業計画コード」が未入力の場合
									if("".equals(struct.getISSUE_PROC_CD()) || struct.getISSUE_PROC_CD() == null) {
										// [品目]内外作区分が1(内作)の場合
										if(issueOutsideTyp.intValue() == 1) {
											setWarnMessage("AF00151");
										}
									}
								}
//20150722 ADD START BY SYSCOM
								//入出庫別会計連携情報に登録
								insertRcvIssAiIfDate(struct);
//20150722 ADD END BY SYSCOM
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
						}else{

							// 保管区出庫可能数と出庫数のチェック
							if("true".equals(struct.getc_JOB_ODR_CD()) &&
									Calculate.compare(struct.getRCV_ISSUE_QTY(),
											struct.getTHIS_TIME_POS_QTY()) == 1){
								setErrorMessage("AF00124");
							}
							
							logMessage = "Issue Process was Failed...";
							setSyslogConfig(logMessage);

							// ロールバック
							conn.rollback();
						}

						// 出庫処理内で発生したメッセージ取得
						logMessage = "T_RCV_ISSUE.RCV_ISSUE_CTRL_CD:" + struct.getISSUE_CTRL_CD();
						for(int idx = 0; idx < issuePrc.getErrorList().size(); idx++){
							setErrorMessage((String)issuePrc.getErrorList().get(idx) , logMessage);
						}
						for(int idx = 0; idx < issuePrc.getInfoList().size(); idx++){
							setInfoMessage((String)issuePrc.getInfoList().get(idx) , logMessage);
						}
						for(int idx = 0; idx < issuePrc.getWarnList().size(); idx++){
							setWarnMessage((String)issuePrc.getWarnList().get(idx) , logMessage);
						}
					}
				}
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
		logger.exiting("AF0090010Control"+":USER="+struct.getsUser_ID(),"controlinsert");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlclear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0090");
		logger.entering("AF0090010Control"+":USER="+struct.getsUser_ID(),"controlclear");
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
			}
			else{
				AF0090010Struct dateStruct = (AF0090010Struct)dateList.get(0);
				s_date = dateStruct.getBUSINESS_OPR_DATE();
			}

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
			
			struct.setALC_POS_QTY(new String("0.0"));
			struct.setTHIS_TIME_POS_QTY(new String("0.0"));
			
			struct.setLOT_STOCK_ON_HAND_QTY(new String("0.0"));
			struct.setLOT_DEFECT_QTY(new String("0.0"));
			struct.setALLOCABLE_QTY(new String("0.0"));
			if(LotCtrl.checkLotCtrl(conn)){
			    struct.seth_LotCtrl("true");
			}else{
				struct.seth_LotCtrl("false");
			}
			// 業務運用日設定
			struct.setRCV_ISSUE_DATE(s_date);
			struct.setBUSINESS_OPR_DATE(s_date);

		}catch(SQLException e){
			setSqlExceptionMsg(e);
		}
		//---------------------------------------------------------------------
                //}}user_implement_dev:<controlclear>
		logger.exiting("AF0090010Control"+":USER="+struct.getsUser_ID(),"controlclear");

		return;
	}

	/**
	 * 閉じるボタン押下時に実行される処理です。
	 *
	 */
	public void controlclose() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0090");
		logger.entering("AF0090010Control"+":USER="+struct.getsUser_ID(),"controlclose");
			//{{user_implement_dev:<controlclose>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlclose>
		logger.exiting("AF0090010Control"+":USER="+struct.getsUser_ID(),"controlclose");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0090");
		logger.entering("AF0090010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AF0090010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0090");
		logger.entering("AF0090010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
		//---------------------------------------------------------------------

		// クリア処理
		controlclear();
		// ユーザ定義初期化
		usersInitialize();
//20150807 ADD START BY SYSCOM
		// コンボボックスデータを部品より取得
		try{
			_unitAcctCdStruct = createComboData("1");
			_unitPjCdStruct = createComboData("2");
			_unitSegContent1Struct = createComboData("3");
			_unitSegContent2Struct = createComboData("4");
			_unitSegContent3Struct = createComboData("5");
			_unitSegContent4Struct = createComboData("6");
			
			// 会社コード取得
			List companyList = entity.mselectSYS_MY_COMPANY.read(conn, struct);
			if(companyList.size() > 0){
				AF0090010Struct companyStruct = (AF0090010Struct)companyList.get(0);
				struct.setCOMPANY_CD(companyStruct.getCOMPANY_CD());
			}
		} catch (Exception e){
			e.printStackTrace();
			throw new ExpjException(e);
		}
//20150807 ADD END BY SYSCOM
		//---------------------------------------------------------------------
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AF0090010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * イベントハンドラの前処理です。
	 *
	 * @param buttun ボタン名
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0090");
		logger.entering("AF0090010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
		logger.exiting("AF0090010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("close") ) {
				controlclose();
			} else if( button.equals("initial") ) {
				controlINITIAL();
			} else if( button.equals("reload") ) {
				controlRELOAD();
			}
		//{{user_implement_dev:<control_eventHandller>
			
//20150807 ADD START BY SYSCOM
			struct.setList_ACCT_CD_val(_unitAcctCdStruct.getValList());
			struct.setList_ACCT_CD_name(_unitAcctCdStruct.getExplanList());
			struct.setList_PJ_CD_val(_unitPjCdStruct.getValList());
			struct.setList_PJ_CD_name(_unitPjCdStruct.getExplanList());
			struct.setList_SEG_CONTENTS1_val(_unitSegContent1Struct.getValList());
			struct.setList_SEG_CONTENTS1_name(_unitSegContent1Struct.getExplanList());
			struct.setList_SEG_CONTENTS2_val(_unitSegContent2Struct.getValList());
			struct.setList_SEG_CONTENTS2_name(_unitSegContent2Struct.getExplanList());
			struct.setList_SEG_CONTENTS3_val(_unitSegContent3Struct.getValList());
			struct.setList_SEG_CONTENTS3_name(_unitSegContent3Struct.getExplanList());
			struct.setList_SEG_CONTENTS4_val(_unitSegContent4Struct.getValList());
			struct.setList_SEG_CONTENTS4_name(_unitSegContent4Struct.getExplanList());
//20150807 ADD END BY SYSCOM
			
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
//			throw new FoundationException("AF0090010Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AF0090010-E999","CSVの出力処理"));
			throw new FoundationException("AF0090010Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AF0090010-E999","システム日付の取得処理"));
				throw new FoundationException("AF0090010Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AF0090010-E999","コントロールのイベント処理"));
			throw new FoundationException("AF0090010Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected AF0090010Entity entity;
	protected AF0090010Struct struct;
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

		entity = new AF0090010Entity();
		struct = new AF0090010Struct();

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
	 * AF0090010クラスの標準コンストラクタ
	 */
	public AF0090010Control() throws BusinessProcessException, FoundationException
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
				AF0090010Struct key = (AF0090010Struct)keyList.get(j);
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
				if(msgKeyType.containsKeyColumn("ALC_POS_QTY") && key.getALC_POS_QTY() != null) {
					msgKey.setKeyValue("ALC_POS_QTY", key.getALC_POS_QTY());
				}
				if(msgKeyType.containsKeyColumn("THIS_TIME_POS_QTY") && key.getTHIS_TIME_POS_QTY() != null) {
					msgKey.setKeyValue("THIS_TIME_POS_QTY", key.getTHIS_TIME_POS_QTY());
				}
				if(msgKeyType.containsKeyColumn("c_ISSUE_FLG") && key.getc_ISSUE_FLG() != null) {
					msgKey.setKeyValue("c_ISSUE_FLG", key.getc_ISSUE_FLG());
				}
				if(msgKeyType.containsKeyColumn("h_LotCtrl") && key.geth_LotCtrl() != null) {
					msgKey.setKeyValue("h_LotCtrl", key.geth_LotCtrl());
				}
				if(msgKeyType.containsKeyColumn("h_lotFlg") && key.geth_lotFlg() != null) {
					msgKey.setKeyValue("h_lotFlg", key.geth_lotFlg());
				}
				if(msgKeyType.containsKeyColumn("ACCT_CD_name") && key.getACCT_CD_name() != null) {
					msgKey.setKeyValue("ACCT_CD_name", key.getACCT_CD_name());
				}
				if(msgKeyType.containsKeyColumn("ACCT_CD_val") && key.getACCT_CD_val() != null) {
					msgKey.setKeyValue("ACCT_CD_val", key.getACCT_CD_val());
				}
				if(msgKeyType.containsKeyColumn("PJ_CD_name") && key.getPJ_CD_name() != null) {
					msgKey.setKeyValue("PJ_CD_name", key.getPJ_CD_name());
				}
				if(msgKeyType.containsKeyColumn("PJ_CD_val") && key.getPJ_CD_val() != null) {
					msgKey.setKeyValue("PJ_CD_val", key.getPJ_CD_val());
				}
				if(msgKeyType.containsKeyColumn("SEG_CONTENTS1_name") && key.getSEG_CONTENTS1_name() != null) {
					msgKey.setKeyValue("SEG_CONTENTS1_name", key.getSEG_CONTENTS1_name());
				}
				if(msgKeyType.containsKeyColumn("SEG_CONTENTS1_val") && key.getSEG_CONTENTS1_val() != null) {
					msgKey.setKeyValue("SEG_CONTENTS1_val", key.getSEG_CONTENTS1_val());
				}
				if(msgKeyType.containsKeyColumn("SEG_CONTENTS2_name") && key.getSEG_CONTENTS2_name() != null) {
					msgKey.setKeyValue("SEG_CONTENTS2_name", key.getSEG_CONTENTS2_name());
				}
				if(msgKeyType.containsKeyColumn("SEG_CONTENTS2_val") && key.getSEG_CONTENTS2_val() != null) {
					msgKey.setKeyValue("SEG_CONTENTS2_val", key.getSEG_CONTENTS2_val());
				}
				if(msgKeyType.containsKeyColumn("SEG_CONTENTS3_name") && key.getSEG_CONTENTS3_name() != null) {
					msgKey.setKeyValue("SEG_CONTENTS3_name", key.getSEG_CONTENTS3_name());
				}
				if(msgKeyType.containsKeyColumn("SEG_CONTENTS3_val") && key.getSEG_CONTENTS3_val() != null) {
					msgKey.setKeyValue("SEG_CONTENTS3_val", key.getSEG_CONTENTS3_val());
				}
				if(msgKeyType.containsKeyColumn("SEG_CONTENTS4_name") && key.getSEG_CONTENTS4_name() != null) {
					msgKey.setKeyValue("SEG_CONTENTS4_name", key.getSEG_CONTENTS4_name());
				}
				if(msgKeyType.containsKeyColumn("SEG_CONTENTS4_val") && key.getSEG_CONTENTS4_val() != null) {
					msgKey.setKeyValue("SEG_CONTENTS4_val", key.getSEG_CONTENTS4_val());
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
				if(msgKeyType.containsKeyColumn("MRP_FLG") && key.getMRP_FLG() != null) {
					msgKey.setKeyValue("MRP_FLG", key.getMRP_FLG());
				}
				if(msgKeyType.containsKeyColumn("w_WH_TYP") && key.getw_WH_TYP() != null) {
					msgKey.setKeyValue("w_WH_TYP", key.getw_WH_TYP());
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
				if(msgKeyType.containsKeyColumn("w_MODIFY_COUNT") && key.getw_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("w_MODIFY_COUNT", key.getw_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_JOB_ODR_CD") && key.getISSUE_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("ISSUE_JOB_ODR_CD", key.getISSUE_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("w_ODR_STS_TYP") && key.getw_ODR_STS_TYP() != null) {
					msgKey.setKeyValue("w_ODR_STS_TYP", key.getw_ODR_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_ITEM_CD") && key.getISSUE_ITEM_CD() != null) {
					msgKey.setKeyValue("ISSUE_ITEM_CD", key.getISSUE_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_PROC_CD") && key.getISSUE_PROC_CD() != null) {
					msgKey.setKeyValue("ISSUE_PROC_CD", key.getISSUE_PROC_CD());
				}
				if(msgKeyType.containsKeyColumn("w_SUM_RCV_ISSUE_QTY") && key.getw_SUM_RCV_ISSUE_QTY() != null) {
					msgKey.setKeyValue("w_SUM_RCV_ISSUE_QTY", key.getw_SUM_RCV_ISSUE_QTY());
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
				if(msgKeyType.containsKeyColumn("DEPT_NAME") && key.getDEPT_NAME() != null) {
					msgKey.setKeyValue("DEPT_NAME", key.getDEPT_NAME());
				}
				if(msgKeyType.containsKeyColumn("VALUE") && key.getVALUE() != null) {
					msgKey.setKeyValue("VALUE", key.getVALUE());
				}
				if(msgKeyType.containsKeyColumn("DISPLAY_NAME") && key.getDISPLAY_NAME() != null) {
					msgKey.setKeyValue("DISPLAY_NAME", key.getDISPLAY_NAME());
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
					AF0090010Struct key = new AF0090010Struct();
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
					if(msgKeyType.containsKeyColumn("ALC_POS_QTY")) {
						key.setALC_POS_QTY(msgKey.getKeyValue("ALC_POS_QTY"));
					}
					if(msgKeyType.containsKeyColumn("THIS_TIME_POS_QTY")) {
						key.setTHIS_TIME_POS_QTY(msgKey.getKeyValue("THIS_TIME_POS_QTY"));
					}
					if(msgKeyType.containsKeyColumn("c_ISSUE_FLG")) {
						key.setc_ISSUE_FLG(msgKey.getKeyValue("c_ISSUE_FLG"));
					}
					if(msgKeyType.containsKeyColumn("h_LotCtrl")) {
						key.seth_LotCtrl(msgKey.getKeyValue("h_LotCtrl"));
					}
					if(msgKeyType.containsKeyColumn("h_lotFlg")) {
						key.seth_lotFlg(msgKey.getKeyValue("h_lotFlg"));
					}
					if(msgKeyType.containsKeyColumn("ACCT_CD_name")) {
						key.setACCT_CD_name(msgKey.getKeyValue("ACCT_CD_name"));
					}
					if(msgKeyType.containsKeyColumn("ACCT_CD_val")) {
						key.setACCT_CD_val(msgKey.getKeyValue("ACCT_CD_val"));
					}
					if(msgKeyType.containsKeyColumn("PJ_CD_name")) {
						key.setPJ_CD_name(msgKey.getKeyValue("PJ_CD_name"));
					}
					if(msgKeyType.containsKeyColumn("PJ_CD_val")) {
						key.setPJ_CD_val(msgKey.getKeyValue("PJ_CD_val"));
					}
					if(msgKeyType.containsKeyColumn("SEG_CONTENTS1_name")) {
						key.setSEG_CONTENTS1_name(msgKey.getKeyValue("SEG_CONTENTS1_name"));
					}
					if(msgKeyType.containsKeyColumn("SEG_CONTENTS1_val")) {
						key.setSEG_CONTENTS1_val(msgKey.getKeyValue("SEG_CONTENTS1_val"));
					}
					if(msgKeyType.containsKeyColumn("SEG_CONTENTS2_name")) {
						key.setSEG_CONTENTS2_name(msgKey.getKeyValue("SEG_CONTENTS2_name"));
					}
					if(msgKeyType.containsKeyColumn("SEG_CONTENTS2_val")) {
						key.setSEG_CONTENTS2_val(msgKey.getKeyValue("SEG_CONTENTS2_val"));
					}
					if(msgKeyType.containsKeyColumn("SEG_CONTENTS3_name")) {
						key.setSEG_CONTENTS3_name(msgKey.getKeyValue("SEG_CONTENTS3_name"));
					}
					if(msgKeyType.containsKeyColumn("SEG_CONTENTS3_val")) {
						key.setSEG_CONTENTS3_val(msgKey.getKeyValue("SEG_CONTENTS3_val"));
					}
					if(msgKeyType.containsKeyColumn("SEG_CONTENTS4_name")) {
						key.setSEG_CONTENTS4_name(msgKey.getKeyValue("SEG_CONTENTS4_name"));
					}
					if(msgKeyType.containsKeyColumn("SEG_CONTENTS4_val")) {
						key.setSEG_CONTENTS4_val(msgKey.getKeyValue("SEG_CONTENTS4_val"));
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
					if(msgKeyType.containsKeyColumn("MRP_FLG")) {
						key.setMRP_FLG(msgKey.getKeyValue("MRP_FLG"));
					}
					if(msgKeyType.containsKeyColumn("w_WH_TYP")) {
						key.setw_WH_TYP(msgKey.getKeyValue("w_WH_TYP"));
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
					if(msgKeyType.containsKeyColumn("w_MODIFY_COUNT")) {
						key.setw_MODIFY_COUNT(msgKey.getKeyValue("w_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_JOB_ODR_CD")) {
						key.setISSUE_JOB_ODR_CD(msgKey.getKeyValue("ISSUE_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_ODR_STS_TYP")) {
						key.setw_ODR_STS_TYP(msgKey.getKeyValue("w_ODR_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_ITEM_CD")) {
						key.setISSUE_ITEM_CD(msgKey.getKeyValue("ISSUE_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_PROC_CD")) {
						key.setISSUE_PROC_CD(msgKey.getKeyValue("ISSUE_PROC_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_SUM_RCV_ISSUE_QTY")) {
						key.setw_SUM_RCV_ISSUE_QTY(msgKey.getKeyValue("w_SUM_RCV_ISSUE_QTY"));
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
					if(msgKeyType.containsKeyColumn("DEPT_NAME")) {
						key.setDEPT_NAME(msgKey.getKeyValue("DEPT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("VALUE")) {
						key.setVALUE(msgKey.getKeyValue("VALUE"));
					}
					if(msgKeyType.containsKeyColumn("DISPLAY_NAME")) {
						key.setDISPLAY_NAME(msgKey.getKeyValue("DISPLAY_NAME"));
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
