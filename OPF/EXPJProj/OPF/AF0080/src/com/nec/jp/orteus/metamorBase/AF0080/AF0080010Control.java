/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AF0080/src/com/nec/jp/orteus/metamorBase/AF0080/AF0080010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AF0080;

import com.nec.jp.orteus.metamorBase.AF0080.*;
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
import com.nec.jp.orteus.metamorBase.common08.LotCtrl.LotCtrl;

import com.nec.jp.orteus.expj.pr.rcvissue.process.IssueInstStruct;
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

public class AF0080010Control
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
	public AF0080010Struct getListvalue(int x) { return (AF0080010Struct)(this.list.get(x)); }	// リストの値を返します。
	public AF0080010Struct getStruct() { return this.struct; }	// Structを返します。
	public AF0080010Struct createStruct() { return new AF0080010Struct(); }	// 新しいStructを作って返します。
	public void setStruct(Object structname) { this.struct.setStruct((AF0080010Struct)structname); }	// Structをセットします。
//	public void initializeStruct() { this.struct.initialize(); }	// Structの値を初期化します。

	// CSV出力用リスト
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }


//------------------------------------------------------------------------

	/** ユーザ定義の初期化済フラグ */
	private boolean _usersIntialized = false;
	
	/** ロット管理導入済チェック */
	String lotCtrl = null;

	/**
	 * ユーザ定義 初期化処理
	 */
	private void usersInitialize() throws ExpjException
	{
		// 検索状態を「初期状態」に設定
		setReadStatus(INITIAL);

		if(_usersIntialized) return;

		// コンボデータの取得
		setComboData(struct);

		_usersIntialized = true;
		return ;
	}


//---------- コンボボックスデータ取得関連の処理 -------------------------------

	/** 出庫完了フラグ **/
	ComboStruct _ISSUE_CMPLT_FLG = null;

	/** 出庫完了フラグ設定
	 * @param コンボボックスデータ
	*/
	public void setISSUE_CMPLT_FLG(ComboStruct combo){ _ISSUE_CMPLT_FLG = combo; }

	/** 出庫完了フラグ取得
	 * @return 出庫完了フラグのコンボボックスデータ
	*/
	public ComboStruct getISSUE_CMPLT_FLG(){ return _ISSUE_CMPLT_FLG; }


	/** 支給区分フラグ **/
	ComboStruct _CONS_TYP = null;
	
	/**会社コード**/
	public String _company_cd = null;

	/** 支給区分フラグ設定
	 * @param コンボボックスデータ
	*/
	public void setCONS_TYP(ComboStruct combo){ _CONS_TYP = combo; }

	/** 支給区分フラグ取得
	 * @return 支給区分フラグのコンボボックスデータ
	*/
	public ComboStruct getCONS_TYP(){ return _CONS_TYP; }

	/** ロット管理フラグ **/
	ComboStruct _LOT_CTRL_FLG = new ComboStruct();

	/** ロット管理フラグ設定
	 * @param コンボボックスデータ
	*/
	public void setLOT_CTRL_FLG_comb(ComboStruct combo){ _LOT_CTRL_FLG = combo; }

	/** ロット管理フラグ取得
	 * @return ロット管理フラグのコンボボックスデータ
	*/
	public ComboStruct getLOT_CTRL_FLG_comb(){ return _LOT_CTRL_FLG; }
	
    // ----- キー情報の退避処理 ---------------------------------------------------

	/** キー情報保持の為のStruct */
	private AF0080010Struct keyStruct;

	/** キー情報Structの取得 */
	public AF0080010Struct getKeyStruct(){ return keyStruct; }
	
	/** キー情報Structの設定 */
	public void setKeyStruct(AF0080010Struct struct){ keyStruct = struct; }

    // ------------------------------------------------------------------------
	/**
	 * コンボボックスの中身を取得します。
	 *
	 * @param data データの箱
	 */
	 private void setComboData(AF0080010Struct data) throws ExpjException
	 {
		ComboBox controller = new ComboBox(conn, sysUSER_CD);
		try{
			//コンボデータの取得
			ComboStruct w_ISSUE_CMPLT_FLG_COMBO = controller.getData("ISSUE_CMPLT_FLG");
			ComboStruct w_CONS_TYP_COMBO = controller.getData("CONS_TYP");
			ComboStruct LOT_CTRL_FLG_comb = controller.getData("LOT_CTRL_FLG");

			controller.setConnection(null);

			//属性に取得データ設定
			setISSUE_CMPLT_FLG(w_ISSUE_CMPLT_FLG_COMBO);
			setCONS_TYP(w_CONS_TYP_COMBO);
			setLOT_CTRL_FLG_comb(LOT_CTRL_FLG_comb);


		}catch(SQLException e){
			setSqlExceptionMsg(e);

		}catch(ComboException e){
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;
		}
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

	/**
	 * 出庫完了フラグの表示を設定
	 * @param s フラグの値が設定されている情報
	 */
	private void setIssueCmpltTypeValue(AF0080010Struct s)
	{
		s.setISSUE_CMPLT_NAME(getTypeName(_ISSUE_CMPLT_FLG,s.getISSUE_CMPLT_FLG()));
	}

	/**
	 * 支給区分フラグの表示を設定
	 * @param s フラグの値が設定されている情報
	 */
	private void setConsTypeValue(AF0080010Struct s)
	{
		s.setCONS_NAME(getTypeName(_CONS_TYP,s.getCONS_TYP()));
	}

	/**
	 * 区分名取得
	 * @param comboStruct 区分情報リスト
	 * @param intType 区分コード
	 * @return 区分名称。該当するデータがなかった場合は区分コードを返す
	 */
	private String getTypeName(ComboStruct comboStruct, Integer intType)
	{
		if(comboStruct == null || intType == null)  return null;
		String strTyp = TypeConverter.sanitizer(intType);
		String strTypName = strTyp;
		for(int i = 0; i < comboStruct.getValList().size(); i++){
			if(strTyp.equals((String)(comboStruct.getValList().get(i))) == true){
				strTypName = (String)(comboStruct.getExplanList().get(i));
				break;
			}
		}
		if(strTypName == null) strTypName = strTyp;
		return strTypName;
	}

	/**
	 * 作業指示番号の表示を設定
	 * @param s 表示元を判定する情報
	 */
	private void setOprInstCd(AF0080010Struct s)
	{
		if( (s.getWORK_IN_PROC_CD() == null) || (("").equals(s.getWORK_IN_PROC_CD())) ){
			s.sets_OPR_INST_CD(s.getw_OPR_INST_CD_item());
		} else {
			s.sets_OPR_INST_CD(s.getw_OPR_INST_CD_job());
		}
	}


//-----------------------------------------------------------------------------

	/** 日付フォーマット */
//	private SimpleDateFormat _dateFormat = new SimpleDateFormat("yyyy/MM/dd");

	/**
	 * Date型 ⇒ String型。
	 * @return String YYYY/MM/DD形式
	 */
	public String dateToString(Date date)
	{
//		return _dateFormat.format(date);
		return Converter.dateToStr(date, "yyyy/MM/dd");
	}

	/**
	 * String型 ⇒ Date型。
	 * @return Date 
	 */
	public Date stringToDate(String date) throws ParseException
	{
//		return _dateFormat.parse(date);
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
	 * 自製番、他製番、品目在庫出庫済数の計算処理
	 */
	private void calcIssuedQty(AF0080010Struct wkStruct) throws SQLException
	{
		// 品目手配区分が 1 or 2 でなおかつ製番を取得できた場合、各数量を求める
		if((wkStruct.getMRP_ODR_TYP().equals(AF0080Const._MRP_ODR_JOB_ODR_CD) ||
				wkStruct.getMRP_ODR_TYP().equals(AF0080Const._MRP_ODR_STOCK_ALC_JOB_ODR_CD)) &&
			!(wkStruct.getJOB_ODR_CD() == null || wkStruct.getJOB_ODR_CD().equals("")))
		{
			IssueRemain issueRemain = new IssueRemain(conn);
			// 他製番出庫済数(①製番引当出庫済数(全製番分)－②製番引当出庫済数(自製番分))
			// ①製番引当出庫済数(全製番分)
			String calc1 = issueRemain.getIssuedQtyByAllJobOdr(
					wkStruct.getw_OD_NO()).toString();
			
			// ②製番引当出庫済数(自製番分)
			String calc2 = issueRemain.getIssuedQtyByJobOdr(wkStruct.getw_OD_NO(),
					wkStruct.getJOB_ODR_CD(),
					AF0080Const._JOB_ODR_DETAIL_NO).toString();
			
			// ③個別手配分出庫済数
			String calc3 = issueRemain.getIssuedQtyByOd(wkStruct.getw_OD_NO()).toString();
			
			// ②＋③(自製番出庫残数)
			wkStruct.setOWN_ISSUED_QTY(Calculate.add(calc2, calc3));
			
			// ①－②
			wkStruct.setOTHER_ISSUED_QTY(Calculate.subtract(calc1, calc2));
			
			// 品目在庫出庫済数
			wkStruct.setITEM_ISSUED_QTY(issueRemain.getIssuedQtyByItem(
					wkStruct.getw_OD_NO()).toString());
		}else{
			// 品目在庫出庫累計数
			wkStruct.setITEM_ISSUED_QTY(wkStruct.getTOTAL_ISSUE_QTY());
		}
	}

	/**
	 * システムパラメータ取得
	 */
	private boolean getSysParameter() throws BusinessProcessException, FoundationException {
		boolean b = true;
		try {
			// 参数区分
			struct.seth_Param_Div("PAST_RESULT_ENTRY_TYP");
			List sysParameterList = entity.mSELECT_SYS_PARAMETER.read(conn, struct);
			if(sysParameterList == null || sysParameterList.isEmpty()) return b;
			AF0080010Struct sysParameterStruct = (AF0080010Struct) sysParameterList.get(0);
			if(null != sysParameterStruct.getPARAM_RESULT() && !"".equals(sysParameterStruct.getPARAM_RESULT())){
				if("false".equals(sysParameterStruct.getPARAM_RESULT())){
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
			AF0080010Struct procExecDateStruct = (AF0080010Struct) procExecDateList.get(0);
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
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0080");
		logger.entering("AF0080010Control"+":USER="+struct.getsUser_ID(),"controlselect");
			//{{user_implement_dev:<controlselect>
			//-----------------------------------------------------------------------------
			// ログ出力情報格納用
			String logMessage = "";
			List listMessage = new ArrayList();

			try {
				boolean oprInst_flg = true;			// 作業指示番号指定の検索

				// キー項目ログ表示
				logMessage = "OPR_INST_CD:" + struct.getw_OPR_INST_CD()
							+ ", PUCH_ODR_CD:" + struct.getw_PUCH_ODR_CD()
							+ ", ISSUE_INST_CD:" + struct.getw_ISSUE_INST_CD()
							+ ", PLANT_CD:" + struct.getw_PLANT_CD();
				setSyslogConfig(logMessage);

				// 出庫指示情報の読込み
				//最大表示行数
	            int maxLine = sp.getMaxLine(conn, 10);
				if(maxLine != 0) {
					struct.setROW_COUNT(String.valueOf(maxLine));
				} else {
					struct.setROW_COUNT(null);
				}
				if(("0").equals(struct.getw_CHOICE())){
					listMessage.add("T_WORK_IN_PROC_BY_ITEM.OPR_INST_CD:" + struct.getw_OPR_INST_CD());
					listMessage.add("T_WORK_IN_PROC_BY_PROC .OPR_INST_CD:" + struct.getw_OPR_INST_CD());
					listMessage.add("T_ISSUE_INST.PLANT_CD:" +  struct.getw_PLANT_CD());
					list = entity.mselectOPR_INST_CDCnt.read(conn, struct);
		          }else{
					oprInst_flg = false;
					listMessage.add("T_ISSUE_INST.PUCH_ODR_CD:" + struct.getw_PUCH_ODR_CD());
					listMessage.add("T_ISSUE_INST.ISSUE_INST_CD:" + struct.getw_ISSUE_INST_CD());
					listMessage.add("T_ISSUE_INST.PLANT_CD:" +  struct.getw_PLANT_CD());
					list = entity.mselectCnt.read(conn, struct);
				 }
				long rowCount = Long.parseLong(((AF0080010Struct)list.get(0)).getl_COUNT());
				if(rowCount==0){
					// 検索状態を「読込０件」に設定
					setReadStatus(NOT_FOUND);
					// 読込処理失敗：該当する出庫指示情報が存在しません
					setErrorMessage("ZZ06001", listMessage);
					if(list != null && list.size() > 0){
						list.clear();
					}
					return;
				} else {
					// 表示最大行数制限処理
					if(maxLine != 0 && rowCount == maxLine + 1){
						// 検索状態を「最大行数オーバ」に設定
						setReadStatus(TOO_MANY);
						if(list != null && list.size() > 0){
							list.clear();
						}
						setErrorMessage("ZZ01115", "", ""+maxLine);
						return;
					}
				}
				if(("0").equals(struct.getw_CHOICE())){
					list = entity.mselectOPR_INST_CD.read(conn, struct);
				}else{
					list = entity.mselect.read(conn, struct);
				}
				for(int i = 0; i < list.size(); i++){
					// 出庫完了、支給区分に表示する表示名の設定
					setIssueCmpltTypeValue((AF0080010Struct)(list.get(i)));
					setConsTypeValue((AF0080010Struct)(list.get(i)));

					if(oprInst_flg){
						// 作業指示番号に表示するデータの設定
						setOprInstCd((AF0080010Struct)(list.get(i)));
					}
						
					// 品目手配区分が 1 or 2 の場合、各数量を求める
					AF0080010Struct wkStruct = (AF0080010Struct)list.get(i);
					calcIssuedQty(wkStruct);
						
				}

				// 検索状態を「読込成功」に設定
				setReadStatus(NORMAL);
			} catch(SQLException e) {
				// 検索状態を「読込失敗」に設定
				setReadStatus(ERROR);

				setSqlExceptionMsg(e);

			}
			//-----------------------------------------------------------------------------
                //}}user_implement_dev:<controlselect>
		logger.exiting("AF0080010Control"+":USER="+struct.getsUser_ID(),"controlselect");

		return;
	}

	/**
	 * 行修正ボタン押下時に実行される処理です。
	 *
	 */
	public void controlmodify() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0080");
		logger.entering("AF0080010Control"+":USER="+struct.getsUser_ID(),"controlmodify");
			//{{user_implement_dev:<controlmodify>
		//-----------------------------------------------------------------------------
		// ログ出力情報格納用
		String logMessage = "";
		
		// チェック結果格納
		boolean check = true;	

		try {			
			// キー項目を保持
			keyStruct = new AF0080010Struct(struct);

			// キー項目をセット
			struct.setw_ISSUE_INST_CD(keyStruct.getw_ISSUE_INST_CD());
			struct.setw_PUCH_ODR_CD(keyStruct.getw_PUCH_ODR_CD());
			struct.setw_OPR_INST_CD(keyStruct.getw_OPR_INST_CD());
			struct.setw_PLANT_CD(keyStruct.getw_PLANT_CD());
			struct.setw_CHOICE(keyStruct.getw_CHOICE());

			// ＭＲＰ品目の時、所要量にセットされている製番は親の製番なので使わない（nullと扱う）
			if(calc.compare(struct.getMRP_ODR_TYP(), "3") > 0){
				struct.setJOB_ODR_CD((String)null);
			}

			// 保管区名をFROMにセット
			struct.setw_WH_FROM_NAME(struct.getWH_NAME());

			// 戻入数を初期化
			struct.setRCV_ISSUE_QTY(new String("0.0"));

			// キー項目表示
			logMessage = "T_ISSUE_INST.ISSUE_INST_CD:" + struct.getISSUE_INST_CD();
			setSyslogConfig(logMessage);

			struct.setw_WH_FROM_CD(struct.getWH_CD());
			
			// 業務運用日の取得
			List dateList = entity.mselectBUSINESS_OPR_DATE.read(conn, struct);
			if(dateList.size() <= 0) {
				// 行修正処理失敗：業務運用日が存在しません
				logMessage = "SYS_DATE_CTRL.PLANT_CD:" + struct.getw_PLANT_CD();
				setErrorMessage("AF00056", logMessage);
				check = false;
			} else {
				AF0080010Struct dateStruct = (AF0080010Struct)dateList.get(0);
				if(struct.getISSUE_CMPLT_FLG().intValue() == 0){
					// 完了フラグ＝0:未の場合
					struct.setw_BUSINESS_OPR_DATE(dateStruct.getw_BUSINESS_OPR_DATE());
					struct.setRCV_ISSUE_DATE(dateStruct.getw_BUSINESS_OPR_DATE());
					// 戻入日
					struct.seth_RCV_ISSUE_DATE("");
					// 支給区分に表示する表示名の設定
					setConsTypeValue(dateStruct);
				} else {
					// 完了フラグ＝1:完了の場合
					struct.setw_BUSINESS_OPR_DATE(dateStruct.getw_BUSINESS_OPR_DATE());
					struct.setRCV_ISSUE_DATE(struct.getISSUE_CMPLT_DATE());
					// 戻入日
					struct.seth_RCV_ISSUE_DATE(struct.getRCV_ISSUE_DATE());
					// 支給区分に表示する表示名の設定
					setConsTypeValue(struct);
				}
			}
			
			// 買掛管理がインストールされている場合、当年月度を取得
			AF0080010Struct readStruct = new AF0080010Struct();
			List installOptionsList = entity.mSYS_INSTALL_OPTIONS.read(conn, readStruct);
			if (installOptionsList.size() > 0) {
				AF0080010Struct installOptionsStruct = (AF0080010Struct)installOptionsList.get(0);
				struct.setINSTALL_FLG(installOptionsStruct.getINSTALL_FLG());
			} else {
				struct.setINSTALL_FLG("0");
			}
			
			// 買掛管理がインストールされている場合、当年月度を取得
			if ("1".equals(struct.getINSTALL_FLG())) {
				List debtCtrlList = entity.mSYS_DEBT_CTRL.read(conn, readStruct);
				if (debtCtrlList.size() > 0) {
					AF0080010Struct debtCtrlStruct = (AF0080010Struct)debtCtrlList.get(0);
					struct.setTHIS_MONTH(debtCtrlStruct.getTHIS_MONTH());
				} else {
					setErrorMessage("AF00142");
					check = false;
				}
			}
			// 製番の退避
			struct.setSAVE_JOB_ODR_CD(struct.getJOB_ODR_CD());

			// 戻入元保管区コードを非表示項目に退避
			struct.seth_WH_FROM_CD(struct.getw_WH_FROM_CD());
			
			// チェックでエラーが発生していない、ロット管理フラグが1の場合
			if ("1".equals(struct.getLOT_CTRL_FLG()) && (msgStruct.sizeError() <= 0)) {			
				if(list != null){
					list.clear();
				}
				// ロット別在庫一覧の取得
	            list = entity.mT_LOT_ISSUE_INST.read(conn, struct);
	            if (!list.isEmpty()) {
	    			// 表示最大行数制限処理
	    			ScreenParam sp = new ScreenParam(this.getClass());
	    			int maxLine = sp.getMaxLine(conn,20);
	    			if(maxLine != 0 && this.list.size() > maxLine){
	    				setReadStatus(TOO_MANY);
	    				this.list.clear();
	    				logMessage = "";
	    				setErrorMessage("ZZ01115", "", ""+maxLine);
	    			}
	            }
			}          
		} catch(SQLException e) {
			// 検索状態を「読込失敗」に設定
			setReadStatus(ERROR);

			setSqlExceptionMsg(e);
		} finally {
			// エラーの時、親画面データ再設定
			if(!check){
				struct.copy(keyStruct);
			}
		}
		//-----------------------------------------------------------------------------
                //}}user_implement_dev:<controlmodify>
		logger.exiting("AF0080010Control"+":USER="+struct.getsUser_ID(),"controlmodify");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlclear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0080");
		logger.entering("AF0080010Control"+":USER="+struct.getsUser_ID(),"controlclear");
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
		struct.clear();
		
		keyStruct = new AF0080010Struct();
		
		// 検索状態を「初期状態」に設定
		setReadStatus(INITIAL);

		//------------------------------------------------------------------
                //}}user_implement_dev:<controlclear>
		logger.exiting("AF0080010Control"+":USER="+struct.getsUser_ID(),"controlclear");

		return;
	}

	/**
	 * 更新ボタン押下時に実行される処理です。
	 *
	 */
	public void controlinsertSub1() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0080");
		logger.entering("AF0080010Control"+":USER="+struct.getsUser_ID(),"controlinsertSub1");
			//{{user_implement_dev:<controlinsertSub1>
		//-----------------------------------------------------------------------------
		// ログ出力情報格納用
		String logMessage = "";
		List listMessage = new ArrayList();

		try {					
			if(null == struct.geth_RCV_ISSUE_DATE() || "".equals(struct.geth_RCV_ISSUE_DATE())){
					// 生産側の過去の実績入力の制限チェック
					if(getSysParameter() == false){
						if(chkProcExecDate("1","",struct.getRCV_ISSUE_DATE()) == false){
							setErrorMessage(ProcExecDateError);
							setErrorParameter("SYS_ACTUAL_COST_CTRL_AC", "PLANT_CD", struct.getPLANT_CD());
							setErrorParameter("SYS_ACTUAL_COST_CTRL_AC", "PROC_EXEC_DATE", struct.getPROC_EXEC_DATE().toString());
							return;
						}
					}
			}else{
					// 生産側の過去の実績入力の制限チェック
					if(getSysParameter() == false){
						if(chkProcExecDate("2",struct.geth_RCV_ISSUE_DATE(),struct.getRCV_ISSUE_DATE()) == false){
							setErrorMessage(ProcExecDateError);
							setErrorParameter("SYS_ACTUAL_COST_CTRL_AC", "PLANT_CD", struct.getPLANT_CD());
							setErrorParameter("SYS_ACTUAL_COST_CTRL_AC", "PROC_EXEC_DATE", struct.getPROC_EXEC_DATE().toString());
							return;
						}
					}
			}
			
			// 保管区名クリア
			struct.setw_WH_FROM_NAME((String)null);	// 戻入元
			struct.setw_WH_TO_NAME((String)null);	// 戻入先

			AF0080010Struct whTmpStruct = new AF0080010Struct(struct);

			if (struct.getw_WH_FROM_CD() != null && "".equals(struct.getw_WH_FROM_CD()) == false) {
			// 戻入元保管区情報取得
			whTmpStruct.setw_WH_CD(struct.getw_WH_FROM_CD());

			List outWhList = entity.mselectM_WH.read(conn, whTmpStruct);
			AF0080010Struct outWhStruct = null;
			if(outWhList.size() <= 0){
				// 登録処理失敗：戻入元保管区コードが存在しません
				logMessage = "M_WH.WH_CD:" + struct.getw_WH_FROM_CD();
				setErrorMessage("AF00037", logMessage);
			}
			else{
				outWhStruct = (AF0080010Struct)outWhList.get(0);

				// 戻入元保管区名を設定
				struct.setw_WH_FROM_NAME(outWhStruct.getw_WH_NAME());
				
				// 戻入元保管区の工場コードチェック
				if(struct.getw_PLANT_CD().equals(outWhStruct.getw_PLANT_CD_check()) == false){
					// 登録処理失敗：保管区コードは他の工場のデータなので指定できません
					listMessage.add("M_WH.WH_CD:" + struct.getw_WH_FROM_CD());
					listMessage.add("M_WH.PLANT_CD:" +  outWhStruct.getw_PLANT_CD_check());
					setErrorMessage("AF00038", listMessage);
					listMessage.clear();
				}
				
				if(outWhStruct.getw_MRP_FLG().intValue() == 1){
					// 登録処理失敗：戻入元保管区コードが所要量計算対象の保管区です。
					listMessage.add("M_WH.WH_CD:" + struct.getw_WH_FROM_CD());
					listMessage.add("M_WH.MRP_FLG:" +  outWhStruct.getw_MRP_FLG());
					setErrorMessage("AF00134", listMessage);
					listMessage.clear();
				}
				
				if ((struct.getw_WH_FROM_CD() != null && "".equals(struct.getw_WH_FROM_CD()) == false)
						&& (struct.geth_WH_FROM_CD() != null && "".equals(struct.geth_WH_FROM_CD()) == false)
						&& (outWhStruct.getVEND_CD() != null && "".equals(outWhStruct.getVEND_CD()) == false)
						&& (struct.getCONS_TYP()).intValue() == 0) {
					listMessage.add("M_WH.WH_CD:" + struct.getw_WH_FROM_CD());
					setErrorMessage("AF00135", listMessage);
					listMessage.clear();
				}
				
				if ((struct.getw_WH_FROM_CD() != null && "".equals(struct.getw_WH_FROM_CD()) == false)
						&& (struct.geth_WH_FROM_CD() != null && "".equals(struct.geth_WH_FROM_CD()) == false)
						&& (struct.getCONS_TYP()).intValue() != 0) {
					
					if (struct.getVEND_CD() == null || "".equals(struct.getVEND_CD())) {
						if (outWhStruct.getVEND_CD() != null && "".equals(outWhStruct.getVEND_CD()) == false) {
							listMessage.add("M_WH.WH_CD:" + struct.getw_WH_FROM_CD());
							setErrorMessage("AF00136", listMessage);
							listMessage.clear();
						}
					} else {
						if ((struct.getVEND_CD()).equals(outWhStruct.getVEND_CD()) == false) {
							listMessage.add("M_WH.WH_CD:" + struct.getw_WH_FROM_CD());
							setErrorMessage("AF00136", listMessage);
							listMessage.clear();
						}
					}
					
				}
			}

			}

			// 戻入先保管区情報取得
			whTmpStruct.setw_WH_CD(struct.getw_WH_TO_CD());

			List inWhList = entity.mselectM_WH.read(conn, whTmpStruct);
			AF0080010Struct inWhStruct = null;
			if(inWhList.size() <= 0){
				// 登録処理失敗：戻入先保管区コードが存在しません
				logMessage = "M_WH.WH_CD:" + struct.getw_WH_TO_CD();
				setErrorMessage("AF00041", logMessage);
			}
			else{
				inWhStruct = (AF0080010Struct)inWhList.get(0);

				// 戻入先保管区名を設定
				struct.setw_WH_TO_NAME(inWhStruct.getw_WH_NAME());

				// 戻入先保管区の倉庫区分チェック
				if(inWhStruct.getw_MRP_FLG().intValue() != 1){
					// 登録処理失敗：戻入先保管区コードが所要量計算対象ではありません
					listMessage.add("M_WH.WH_CD:" + struct.getw_WH_TO_CD());
					listMessage.add("M_WH.MRP_FLG:" +  inWhStruct.getw_MRP_FLG());
					setErrorMessage("AF00097", listMessage);
					listMessage.clear();
				}

				// 戻入先保管区の工場コードチェック
				if(struct.getw_PLANT_CD().equals(inWhStruct.getw_PLANT_CD_check()) == false){
					// 登録処理失敗：戻入先保管区コードは他の工場のデータなので指定できません
					listMessage.add("M_WH.WH_CD:" + struct.getw_WH_TO_CD());
					listMessage.add("M_WH.PLANT_CD:" +  inWhStruct.getw_PLANT_CD_check());
					setErrorMessage("AF00042", listMessage);
					listMessage.clear();
				}

			}

			// 業務運用日取得
			List dateList = entity.mselectBUSINESS_OPR_DATE.read(conn, struct);
			AF0080010Struct dateStruct = null;
			if(dateList.size() <= 0){
				// 登録処理失敗：業務運用日が存在しません
				logMessage = "SYS_DATE_CTRL.PLANT_CD:" + struct.getw_PLANT_CD();
				setErrorMessage("AF00056", logMessage);
			}
			else{
				dateStruct = (AF0080010Struct)dateList.get(0);

				// 戻入日チェック
				Date issue_Date = stringToDate(struct.getRCV_ISSUE_DATE());
				Date business_Date = stringToDate(dateStruct.getw_BUSINESS_OPR_DATE());
				if(issue_Date.after(business_Date)){
					// 登録処理失敗：戻入日に未来の日付は指定できません
					logMessage = "SYS_DATE_CTRL.BUSINESS_OPR_DATE:" + dateStruct.getw_BUSINESS_OPR_DATE();
					setErrorMessage("ZZ05103", logMessage);
				}
			}

			// チェックでエラーが発生していない場合
			if(msgStruct.sizeError() <= 0)
			{
				// 自製番、他製番、品目在庫出庫済数の再計算
				calcIssuedQty(struct);
				
				if (struct.getw_WH_FROM_CD() != null && "".equals(struct.getw_WH_FROM_CD()) == false) {
				// 在庫数量を再取得する
				List qtyList = null;
				AF0080010Struct qtyStruct = null;

				// 品目在庫から出庫する場合
				if(!(struct.getMRP_ODR_TYP().equals(AF0080Const._MRP_ODR_JOB_ODR_CD) ||
						struct.getMRP_ODR_TYP().equals(AF0080Const._MRP_ODR_STOCK_ALC_JOB_ODR_CD)))
				{
					// 保管区在庫数取得
					qtyList = entity.mselectT_ITEM_STOCK.read(conn, struct);
					if(qtyList.size() > 0)
					{
						qtyStruct = (AF0080010Struct)qtyList.get(0);
						if ((calc.compare(struct.getRCV_ISSUE_QTY(), qtyStruct.getw_STOCK_ON_HAND_QTY()) > 0)
								&& ("3".equals(struct.geth_ISSUE_TYP()) == false))
						{
							// 登録処理失敗：保管区別在庫数より多く戻入できません
							listMessage.add("T_ITEM_STOCK.ITEM_CD:" + struct.getITEM_CD());
							listMessage.add("T_ITEM_STOCK.WH_CD:" + struct.getw_WH_FROM_CD());
							listMessage.add("T_ITEM_STOCK.PLANT_CD:" + struct.getw_PLANT_CD());
							listMessage.add("T_ITEM_STOCK.STOCK_ON_HAND_QTY:" + qtyStruct.getw_STOCK_ON_HAND_QTY());
							setErrorMessage("AF00088", listMessage);
							listMessage.clear();
						}

					}else{
						if(!"3".equals(struct.geth_ISSUE_TYP())){//自動出庫の場合はチェックを行わない 2006/07/06
							// 登録処理失敗：保管区別品目在庫データが存在しません
							listMessage.add("T_ITEM_STOCK.ITEM_CD:" + struct.getITEM_CD());
							listMessage.add("T_ITEM_STOCK.WH_CD:" + struct.getw_WH_FROM_CD());
							listMessage.add("T_ITEM_STOCK.PLANT_CD:" + struct.getw_PLANT_CD());
							setErrorMessage("AF00044", listMessage);
							listMessage.clear();
						}
					}
				}
				// 製番在庫から出庫する場合
				else{
					// 保管区在庫数取得
					qtyList = entity.mselectT_JOB_ODR_CD_STOCK.read(conn, struct);
					if(qtyList.size() > 0)
					{
						qtyStruct = (AF0080010Struct)qtyList.get(0);
						if ((calc.compare(struct.getRCV_ISSUE_QTY(), qtyStruct.getw_STOCK_ON_HAND_QTY()) > 0)
								&& ("3".equals(struct.geth_ISSUE_TYP()) == false))
						{
							// 登録処理失敗：保管区別在庫数より多く戻入できません
							listMessage.add("T_JOB_ODR_CD_STOCK.JOB_ODR_CD:" + struct.getJOB_ODR_CD());
							listMessage.add("T_JOB_ODR_CD_STOCK.ITEM_CD:" + struct.getITEM_CD());
							listMessage.add("T_JOB_ODR_CD_STOCK.WH_CD:" + struct.getw_WH_FROM_CD());
							listMessage.add("T_JOB_ODR_CD_STOCK.PLANT_CD:" + struct.getw_PLANT_CD());
							listMessage.add("T_JOB_ODR_CD_STOCK.STOCK_ON_HAND_QTY:" + qtyStruct.getw_STOCK_ON_HAND_QTY());
							setErrorMessage("AF00088", listMessage);
							listMessage.clear();
						}

					}else{
						if(!"3".equals(struct.geth_ISSUE_TYP())){//自動出庫の場合はチェックを行わない 2006/07/06
							// 登録処理失敗：保管区別製番在庫データが存在しません
							listMessage.add("T_JOB_ODR_CD_STOCK.JOB_ODR_CD:" + struct.getJOB_ODR_CD());
							listMessage.add("T_JOB_ODR_CD_STOCK.ITEM_CD:" + struct.getITEM_CD());
							listMessage.add("T_JOB_ODR_CD_STOCK.WH_CD:" + struct.getw_WH_FROM_CD());
							listMessage.add("T_JOB_ODR_CD_STOCK.PLANT_CD:" + struct.getw_PLANT_CD());
							setErrorMessage("AF00045", listMessage);
							listMessage.clear();
						}
					}
					}
					
					// 出庫数と出庫済数のチェック
					if("true".equals(struct.getc_JOB_ODR_CD())){
						if(struct.getJOB_ODR_CD().equals(struct.getSAVE_JOB_ODR_CD())){
							// 自製番在庫へ戻入する場合
							if(Calculate.compare(struct.getRCV_ISSUE_QTY(),
									struct.getOWN_ISSUED_QTY()) > 0){
								setErrorMessage("AF00120");
							}
						}else{
							// 他製番在庫へ戻入する場合
							IssueRemain issueRemain = new IssueRemain(conn);
							// 特定製番出庫済数の取得
							String calc = issueRemain.getIssuedQtyByJobOdr(struct.getw_OD_NO(),
									struct.getJOB_ODR_CD(), AF0080Const._JOB_ODR_DETAIL_NO).toString();
							
							if(Calculate.compare(struct.getRCV_ISSUE_QTY(), calc) > 0){
								setErrorMessage("AF00121");
							}
						}
					}else{
						// 品目在庫へ戻入する場合
						if(Calculate.compare(struct.getRCV_ISSUE_QTY(),
								struct.getITEM_ISSUED_QTY()) > 0){
							setErrorMessage("AF00122");
						}
					}
				}

				// チェックでエラーが発生していない場合
				if(msgStruct.sizeError() <= 0)
				{
					// トランザクション開始
					conn.beginTransWeb();

					// 戻入数 切り上げ処理
					boolean resultCeil = false;

					// 入庫処理結果フラグ
					boolean ret = true;

					if(struct.getw_UNIT_QTY_TYP().intValue() == 1
						&& calc.isNumeric(struct.getRCV_ISSUE_QTY()) == true ){
						struct.setRCV_ISSUE_QTY(calc.ceil(struct.getRCV_ISSUE_QTY(), 0));
						resultCeil = true;
					}

					// 品目情報をStructに設定
					struct.setw_STOCK_UPD_TYP(new Integer(1));				// 在庫更新区分

					// コピーストラクトの生成
					AF0080010Struct issueStruct = new AF0080010Struct(struct);
					AF0080010Struct rcvStruct = new AF0080010Struct(struct);

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////入庫処理///////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

					// [出庫指示]."出庫先保管区コード" ＝ Null でない、かつ、
					// [出庫指示]."出庫指示出庫区分" ＝ 3：自動出庫 でない場合
					if ((struct.getw_WH_FROM_CD() != null && "".equals(struct.getw_WH_FROM_CD()) == false)
							&& ("3".equals(struct.geth_ISSUE_TYP()) == false)) {
						
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
							logMessage = "T_ISSUE_INST.ISSUE_INST_CD:" + struct.getISSUE_INST_CD();
							setSyslogConfig(logMessage);
	
							// ロールバック
							conn.rollback();
	
							ExpjMessage emsg = new ExpjMessage("AF00057");
							throw new FoundationException(
												"AF0080010Control",
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
	
						// 入出庫数の調整(入庫の場合、負数を設定)
						rcvStruct.setRCV_ISSUE_QTY(calc.multiply(struct.getRCV_ISSUE_QTY(), "-1"));
	
						// 登録する保管区コードを出庫先に
						rcvStruct.setw_WH_CD(struct.getw_WH_FROM_CD());
	
						// 入出庫発生区分
						if ((struct.getCONS_TYP()).intValue() == 0) {
							rcvStruct.setw_RCV_ISSUE_GNR_TYP(new Integer(69));			// 工程在庫入庫取消
						} else {
							rcvStruct.setw_RCV_ISSUE_GNR_TYP(new Integer(89));			// 取引先在庫入庫取消
						}
						
						// 製番
						if(struct.getMRP_ODR_TYP().equals(AF0080Const._MRP_ODR_JOB_ODR_CD) ||
								struct.getMRP_ODR_TYP().equals(AF0080Const._MRP_ODR_STOCK_ALC_JOB_ODR_CD)){
							rcvStruct.setJOB_ODR_CD(struct.getSAVE_JOB_ODR_CD());
						}else{
							rcvStruct.setJOB_ODR_CD(null);
						}
			            //会社コード
						if("".equals(rcvStruct.getw_COMPANY_CD()) || rcvStruct.getw_COMPANY_CD() == null){
							rcvStruct.setw_COMPANY_CD(_company_cd);
						}
						// 保管区別入出庫登録
						entity.minsertT_RCV_ISSUE.create(conn, rcvStruct);
	
						// 入庫処理
						RcvProcess rcvPrc = new RcvProcess(conn, rcvCtrlCd);
						if(rcvPrc.execProcess() == true){
							logMessage = "Receive Process was Complated!";
							setSyslogConfig(logMessage);
	
							if(resultCeil == true){
								// 登録処理失敗：整数管理品目のため小数点以下は切り上げして更新しました
								logMessage = "T_ISSUE_INST.ISSUE_INST_CD:" + struct.getISSUE_INST_CD();
								setInfoMessage("AF60004", logMessage);
	
								// 切り上げフラグを初期化
								resultCeil = false;
							}
						} else {
							// 入庫処理NG
							ret = false;
	
							logMessage = "Receive Process was Failed...";
							setSyslogConfig(logMessage);
	
							// ロールバック
							conn.rollback();
						}
	
						logMessage = "T_ISSUE_INST.ISSUE_INST_CD:" + struct.getISSUE_INST_CD();
						for(int idx = 0; idx < rcvPrc.getErrorList().size(); idx++){
							setErrorMessage((String)rcvPrc.getErrorList().get(idx) , logMessage);
						}
						for(int idx = 0; idx < rcvPrc.getInfoList().size(); idx++){
							setInfoMessage((String)rcvPrc.getInfoList().get(idx) , logMessage);
						}
						for(int idx = 0; idx < rcvPrc.getWarnList().size(); idx++){
							setWarnMessage((String)rcvPrc.getWarnList().get(idx) , logMessage);
						}
	
						// 入庫処理結果判定
						if(ret == false){
							// NGの場合は出庫処理は実行しない
							return;
						}
					}
					
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
						logMessage = "T_ISSUE_INST.ISSUE_INST_CD:" + struct.getISSUE_INST_CD();
						setErrorMessage("AF00057", logMessage);

						// ロールバック
						conn.rollback();

						ExpjMessage emsg = new ExpjMessage("AF00057");
						throw new FoundationException(
											"AF0080010Control",
											"controlinsert()",
											emsg.getMessage(CoreTools.getLocale(this.getsysUSER_CD())) );
					}

					// ログ出力
					logMessage = "T_RCV_ISSUE_CTRL.RCV_ISSUE_CTRL_CD:" + issueCtrlCd;
					setSyslogConfig(logMessage);

					// 入出庫管理番号設定
					issueStruct.setw_RCV_ISSUE_CTRL_CD(issueCtrlCd);

					// 入出庫区分設定
					issueStruct.setw_RCV_ISSUE_TYP(new Integer(2));				// 出庫

					// 入出庫数の調整(出庫の場合、正数を設定)
					issueStruct.setRCV_ISSUE_QTY(struct.getRCV_ISSUE_QTY());

					// 登録する保管区コードを出庫元に
					issueStruct.setw_WH_CD(struct.getw_WH_TO_CD());

					// 入出庫発生区分
					issueStruct.setw_RCV_ISSUE_GNR_TYP(new Integer(29));		// 出庫取消
		            //会社コード
					if("".equals(issueStruct.getw_COMPANY_CD()) || issueStruct.getw_COMPANY_CD() == null){
						issueStruct.setw_COMPANY_CD(_company_cd);
					}
					// 保管区別入出庫登録
					entity.minsertT_RCV_ISSUE.create(conn, issueStruct);

					// 出庫処理
					IssueProcess issuePrc = new IssueProcess(conn, issueCtrlCd);
					if(issuePrc.execProcess() == true){
						logMessage = "Issue Process was Complated!";
						setSyslogConfig(logMessage);

						if(resultCeil == true){
							// 登録処理失敗：整数管理品目のため小数点以下は切り上げして更新しました
							logMessage = "T_ISSUE_INST.ISSUE_INST_CD:" + struct.getISSUE_INST_CD();
							setInfoMessage("AF60004", logMessage);
						}
					} else {
						logMessage = "Issue Process was Failed...";
						setSyslogConfig(logMessage);

						// ロールバック
						conn.rollback();
					}

					logMessage = "T_ISSUE_INST.ISSUE_INST_CD:" + struct.getISSUE_INST_CD();
					for(int idx = 0; idx < issuePrc.getErrorList().size(); idx++){
						setErrorMessage((String)issuePrc.getErrorList().get(idx) , logMessage);
					}
					for(int idx = 0; idx < issuePrc.getInfoList().size(); idx++){
						setInfoMessage((String)issuePrc.getInfoList().get(idx) , logMessage);
					}
					for(int idx = 0; idx < issuePrc.getWarnList().size(); idx++){
						setWarnMessage((String)issuePrc.getWarnList().get(idx) , logMessage);
					}

					// 有償支給履歴へ追加
					// エラーがあれば終了
					if (issuePrc.getErrorList().size() > 0 ) {
						return;
					}
					
					// [出庫指示]."支給区分" ＝ 1：有償支給 の場合
					if ((struct.getCONS_TYP()).intValue() == 1) {
						logMessage = "M_CONS_UNIT_COST.ITEM_CD:" +  struct.getITEM_CD()
									+ ", M_CONS_UNIT_COST.VEND_CD:" +  struct.getVEND_CD()
									+ ", M_CONS_UNIT_COST.COMPANY_CD:" +  struct.getw_COMPANY_CD()
									+ ", T_ISSUE_INST.EFF_PHASE_IN_DATE:" + struct.getRCV_ISSUE_DATE();
						setSyslogConfig(logMessage);
						//支給単価の取得
						List tmpList = entity.mM_CONS_UNIT_COST.read(conn, struct);
						if(tmpList.size() <= 0) {
							struct.setUNIT_COST(new String("0"));
							struct.setUNIT_COST_TYP("1");
						}
						else{
							AF0080010Struct workStruct = (AF0080010Struct)tmpList.get(0);
							logMessage = "M_CONS_UNIT_COST.ONEROUS_FLG:" +  workStruct.getONEROUS_FLG()
										+ ", M_CONS_UNIT_COST.UNIT_COST:" +  workStruct.getUNIT_COST()
										+ ", M_CONS_UNIT_COST.UNIT_COST_TYP:" +  workStruct.getUNIT_COST_TYP();
							setSyslogConfig(logMessage);
							// 支給単価の有償フラグ＝1(有償)の時、有償単価セット
							if(("1").equals(workStruct.getONEROUS_FLG()) == true){
								struct.setUNIT_COST(workStruct.getUNIT_COST());
								struct.setUNIT_COST_TYP(workStruct.getUNIT_COST_TYP());
							}
							else{
								struct.setUNIT_COST(new String("0"));
								struct.setUNIT_COST_TYP("1");
							}
						}

						// 有償支給番号採番
						String ctrlCd = null;
						CollectNumber collect = new CollectNumber(
												CollectNumber.ONERCONS_CD, 
												getsysUSER_CD(), 
												this.sp.getProcId(), 
												struct.getw_PLANT_CD());
						try{
							ctrlCd = collect.getNo();
							if(ctrlCd == null){
								ExpjMessage emsg = new ExpjMessage("AF00078");
								throw new FoundationException(
												"AF0080010Control",
												"insert_rcv_process()",
												emsg.getMessage(CoreTools.getLocale(this.getsysUSER_CD())) );
							}
						}
						catch(FoundationException ex){
							// 登録処理失敗：有償支給番号の採番に失敗しました
							logMessage = "T_ISSUE_INST.ISSUE_INST_CD:" + struct.getISSUE_INST_CD();
							setErrorMessage("AF00078", logMessage);
							
							ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
							sysLog.severe(emsg, getsysUSER_CD());
							ExpjException ee = new ExpjException(ex, emsg);
							throw ee;
						}

						// 有償支給番号
						struct.setONEROUS_CONS_NO(ctrlCd);
						// 出庫数
						struct.setRCV_ISSUE_QTY(struct.getRCV_ISSUE_QTY());

						// 出庫指示番号
						struct.setISSUE_INST_CD(struct.getISSUE_INST_CD());
						// 返品先保管区コード

						logMessage = "T_PAST_ONEROUS_CONS.ONEROUS_CONS_NO:" + struct.getONEROUS_CONS_NO()
									+ ",T_PAST_ONEROUS_CONS.JOB_ODR_CD:" + struct.getJOB_ODR_CD()
									+ ", T_PAST_ONEROUS_CONS.ITEM_CD:" + struct.getITEM_CD()
									+ ", T_PAST_ONEROUS_CONS.VEND_CD:" + struct.getVEND_CD()
									+ ", T_PAST_ONEROUS_CONS.ISSUE_DATE:" + struct.getRCV_ISSUE_DATE()
									+ ", T_PAST_ONEROUS_CONS.ISSUE_QTY:" + struct.getRCV_ISSUE_QTY();
						setSyslogConfig(logMessage);

					// コピーストラクトの生成
					AF0080010Struct pastOnerousConsStruct = new AF0080010Struct(struct);
					
						pastOnerousConsStruct.setONEROUS_CONS_NO(struct.getONEROUS_CONS_NO());
						pastOnerousConsStruct.setUNIT_COST(struct.getUNIT_COST());
						pastOnerousConsStruct.setUNIT_COST_TYP(struct.getUNIT_COST_TYP());
						
						// 入出庫管理番号
						pastOnerousConsStruct.setRCV_ISSUE_CTRL_CD(issueCtrlCd);
						
						// 会社コード
						pastOnerousConsStruct.setCOMPANY_CD(struct.getw_COMPANY_CD());
						
						// 工場コード
						pastOnerousConsStruct.setPLANT_CD(struct.getw_PLANT_CD());
						
						// 出庫数
						pastOnerousConsStruct.setRCV_ISSUE_QTY(Calculate.multiply(struct.getRCV_ISSUE_QTY(), "-1"));
						
						// 返品理由コード
						pastOnerousConsStruct.setRETURNED_CAUSE_CD(struct.getRCV_ISSUE_COMMENT());
						
						// 有償支給履歴登録
						entity.mT_PAST_ONEROUS_CONS.create(conn, pastOnerousConsStruct);
					}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
					// コミット
					conn.commit();
					
					// キーコピー
					struct.copy(keyStruct);	
					
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
			// 検索状態を「読込失敗」に設定
			setReadStatus(ERROR);

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
                //}}user_implement_dev:<controlinsertSub1>
		logger.exiting("AF0080010Control"+":USER="+struct.getsUser_ID(),"controlinsertSub1");

		return;
	}

	/**
	 * 戻るボタン押下時に実行される処理です。
	 *
	 */
	public void controlcloseSub1() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0080");
		logger.entering("AF0080010Control"+":USER="+struct.getsUser_ID(),"controlcloseSub1");
			//{{user_implement_dev:<controlcloseSub1>
		//-----------------------------------------------------------------------------		
		// キーコピー
		struct.copy(keyStruct);	
		
		// 親画面データ再読込
		controlselect();
		//-----------------------------------------------------------------------------
                //}}user_implement_dev:<controlcloseSub1>
		logger.exiting("AF0080010Control"+":USER="+struct.getsUser_ID(),"controlcloseSub1");

		return;
	}

	/**
	 * 更新ボタン押下時に実行される処理です。
	 *
	 */
	public void controlinsertSub2() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0080");
		logger.entering("AF0080010Control"+":USER="+struct.getsUser_ID(),"controlinsertSub2");
			//{{user_implement_dev:<controlinsertSub2>
			// TODO: ユーザ定義のコードを記述してください
		// ログ出力情報格納用
		String logMessage = "";
		List listMessage = new ArrayList();

		try {
			// 保管区名クリア
			struct.setw_WH_FROM_NAME((String)null);	// 戻入元
			struct.setw_WH_TO_NAME((String)null);	// 戻入先
			
			// 生産側の過去の実績入力の制限チェック
			if(getSysParameter() == false){	
				if(chkProcExecDate("1","",struct.getRCV_ISSUE_DATE()) == false){
					setErrorMessage(ProcExecDateError);
					setErrorParameter("SYS_ACTUAL_COST_CTRL_AC", "PLANT_CD", struct.getPLANT_CD());
					setErrorParameter("SYS_ACTUAL_COST_CTRL_AC", "PROC_EXEC_DATE", struct.getPROC_EXEC_DATE().toString());
					return;
				}
			}
			
			// システムパラメータの賞味期限チェックフラグを取得
			struct.seth_Param_Div("BEST_BEFORE_DATE_CHECK_FLG");
			List sysParaList = entity.mSELECT_SYS_PARAMETER.read(conn, struct);
			if(sysParaList.size() > 0){
				AF0080010Struct sysParaStruct = (AF0080010Struct)sysParaList.get(0);
				struct.setPARAM_RESULT(sysParaStruct.getPARAM_RESULT());
			}else{
				struct.setPARAM_RESULT("1");
			}

			AF0080010Struct whTmpStruct = new AF0080010Struct(struct);

			if (struct.getw_WH_FROM_CD() != null && !"".equals(struct.getw_WH_FROM_CD())) {
				// 戻入元保管区情報取得
				whTmpStruct.setw_WH_CD(struct.getw_WH_FROM_CD());
	
				List outWhList = entity.mselectM_WH.read(conn, whTmpStruct);
				AF0080010Struct outWhStruct = null;
				if(outWhList.size() <= 0){
					// 登録処理失敗：戻入元保管区コードが存在しません
					logMessage = "M_WH.WH_CD:" + struct.getw_WH_FROM_CD();
					setErrorMessage("AF00037", logMessage);
				}
				else{
					outWhStruct = (AF0080010Struct)outWhList.get(0);
	
					// 戻入元保管区名を設定
					struct.setw_WH_FROM_NAME(outWhStruct.getw_WH_NAME());
					// 倉庫区分を設定
					struct.setw_WH_TYP(outWhStruct.getw_WH_TYP());
					
					// 戻入元保管区の工場コードチェック
					if(!struct.getw_PLANT_CD().equals(outWhStruct.getw_PLANT_CD_check())){
						// 登録処理失敗：保管区コードは他の工場のデータなので指定できません
						listMessage.add("M_WH.WH_CD:" + struct.getw_WH_FROM_CD());
						listMessage.add("M_WH.PLANT_CD:" +  outWhStruct.getw_PLANT_CD_check());
						setErrorMessage("AF00038", listMessage);
						listMessage.clear();
					}
					
					if(outWhStruct.getw_MRP_FLG().intValue() == 1){
						// 登録処理失敗：戻入元保管区コードが所要量計算対象の保管区です。
						listMessage.add("M_WH.WH_CD:" + struct.getw_WH_FROM_CD());
						listMessage.add("M_WH.MRP_FLG:" +  outWhStruct.getw_MRP_FLG());
						setErrorMessage("AF00134", listMessage);
						listMessage.clear();
					}
					
					// 戻入元保管区コードに取引先保管区は指定できません時
					if ((struct.getw_WH_FROM_CD() != null && !"".equals(struct.getw_WH_FROM_CD()))
							&& (struct.geth_WH_FROM_CD() != null && !"".equals(struct.geth_WH_FROM_CD()))
							&& (outWhStruct.getVEND_CD() != null && !"".equals(outWhStruct.getVEND_CD()))
							&& (struct.getCONS_TYP()).intValue() == 0) {
						listMessage.add("M_WH.WH_CD:" + struct.getw_WH_FROM_CD());
						setErrorMessage("AF00135", listMessage);
						listMessage.clear();
					}
					// 戻入元保管区コードは支給先と一致する取引先保管区を指定できません時
					if ((struct.getw_WH_FROM_CD() != null && !"".equals(struct.getw_WH_FROM_CD()))
							&& (struct.geth_WH_FROM_CD() != null && !"".equals(struct.geth_WH_FROM_CD()))
							&& (struct.getCONS_TYP()).intValue() != 0) {
						
						if (struct.getVEND_CD() == null || "".equals(struct.getVEND_CD())) {
							if (outWhStruct.getVEND_CD() != null && !"".equals(outWhStruct.getVEND_CD())) {
								listMessage.add("M_WH.WH_CD:" + struct.getw_WH_FROM_CD());
								setErrorMessage("AF00136", listMessage);
								listMessage.clear();
							}
						} else {
							if (!struct.getVEND_CD().equals(outWhStruct.getVEND_CD())) {
								listMessage.add("M_WH.WH_CD:" + struct.getw_WH_FROM_CD());
								setErrorMessage("AF00136", listMessage);
								listMessage.clear();
							}
						}
					}
				}
			}

			// 在庫ロット番号の存在チェック
			List tmpList = null;
			tmpList = entity.mT_LOT_CTRL.read(conn, struct);
			if (tmpList.size() <= 0) {
				logMessage = "T_LOT_CTRL.LOT_NO:" + struct.getw_LOT_NO();
				setErrorMessage("AF20002", logMessage);
			}
			
			// [ロット管理].”賞味期限”＜ 「出庫日」でかつ
			//[パラメータ].” 名前”＝’ BEST_BEFORE_DATE_CHECK_FLG’が1:エラーの場合、エラーメッセージを表示する
			
			boolean resultBbdcFlg = false;//在庫ロット番号がNULLでなく出庫数が0以外かつ賞味期限が切れている場合にture
			
			List bbdList = entity.mc_BEST_BEFORE_DATE.read(conn, struct);
			if(bbdList.size() > 0){
				AF0080010Struct bbdStruct = (AF0080010Struct)bbdList.get(0);
				if(bbdStruct.getBBD_c_FLG().equals("1")){//2:警告の場合のためにフラグを"true"にする
					resultBbdcFlg = true;
				}
				if(resultBbdcFlg && struct.getPARAM_RESULT().equals("1")){
					//賞味期限が切れているため出庫できません。
					logMessage = "T_LOT_CTRL.LOT_NO:" + struct.getw_LOT_NO();
					setErrorMessage("AF20009", logMessage);
				}
			}
					
			// 戻入先保管区情報取得
			whTmpStruct.setw_WH_CD(struct.getw_WH_TO_CD());

			List inWhList = entity.mselectM_WH.read(conn, whTmpStruct);
			AF0080010Struct inWhStruct = null;
			if(inWhList.size() <= 0){
				// 登録処理失敗：戻入先保管区コードが存在しません
				logMessage = "M_WH.WH_CD:" + struct.getw_WH_TO_CD();
				setErrorMessage("AF00041", logMessage);
			}
			else{
				inWhStruct = (AF0080010Struct)inWhList.get(0);

				// 戻入先保管区名を設定
				struct.setw_WH_TO_NAME(inWhStruct.getw_WH_NAME());

				// 戻入先保管区の倉庫区分チェック
				if(inWhStruct.getw_MRP_FLG().intValue() != 1){
					// 登録処理失敗：戻入先保管区コードが所要量計算対象ではありません
					listMessage.add("M_WH.WH_CD:" + struct.getw_WH_TO_CD());
					listMessage.add("M_WH.MRP_FLG:" +  inWhStruct.getw_MRP_FLG());
					setErrorMessage("AF00097", listMessage);
					listMessage.clear();
				}

				// 戻入先保管区の工場コードチェック
				if(!struct.getw_PLANT_CD().equals(inWhStruct.getw_PLANT_CD_check())){
					// 登録処理失敗：戻入先保管区コードは他の工場のデータなので指定できません
					listMessage.add("M_WH.WH_CD:" + struct.getw_WH_TO_CD());
					listMessage.add("M_WH.PLANT_CD:" +  inWhStruct.getw_PLANT_CD_check());
					setErrorMessage("AF00042", listMessage);
					listMessage.clear();
				}

			}

			// チェックでエラーが発生していない場合
			if(msgStruct.sizeError() <= 0) {
				// 出庫実績数量
				String issueQty = "0.0";
				// [出庫実績明細]から出庫実績数量を取得
				List issueList = entity.mselectISSUE_QTY.read(conn, struct);
				if(!issueList.isEmpty()) {
					issueQty = ((AF0080010Struct)issueList.get(0)).getl_TOTAL_ISSUE_QTY();
				}
				// 戻入数 > 出庫実績数量場合、エラーが出力
				if(Calculate.compare(struct.getRCV_ISSUE_QTY(), issueQty) > 0) {
					listMessage.add("T_LOT_ISSUE_INST.ISSUE_INST_CD:" + struct.getISSUE_INST_CD());
					listMessage.add("T_LOT_ISSUE_INST.LOT_NO:" +  struct.getw_LOT_NO());
					setErrorMessage("AF00178", listMessage);
					listMessage.clear();
				}
			}
			
			// チェックでエラーが発生していない場合
			if(msgStruct.sizeError() <= 0)
			{
				// [ロット管理].”賞味期限”＜ 「出庫日」でかつ
				//[パラメータ].” 名前”＝’ BEST_BEFORE_DATE_CHECK_FLG’が2:警告の場合、警告メッセージを表示する
				if(struct.getPARAM_RESULT().equals("2") && (resultBbdcFlg == true)){
					// 賞味期限切れの出庫を行いました。
					logMessage = "T_LOT_CTRL.LOT_NO:" + struct.getw_LOT_NO();
					setWarnMessage("AF20010", logMessage);
				}
				
				// 品目在庫出庫累計数
				struct.setITEM_ISSUED_QTY(struct.getTOTAL_ISSUE_QTY());

				
				if (struct.getw_WH_FROM_CD() != null && !"".equals(struct.getw_WH_FROM_CD())) {
					// 在庫数量を再取得する
					List qtyList = null;
					AF0080010Struct qtyStruct = null;
	
					// 品目在庫から出庫する場合
					if(!(struct.getMRP_ODR_TYP().equals(AF0080Const._MRP_ODR_JOB_ODR_CD) ||
							struct.getMRP_ODR_TYP().equals(AF0080Const._MRP_ODR_STOCK_ALC_JOB_ODR_CD)))
					{
						// 保管区在庫数取得
						qtyList = entity.mselectT_ITEM_STOCK.read(conn, struct);
						if(qtyList.size() > 0)
						{
							qtyStruct = (AF0080010Struct)qtyList.get(0);
							if ((calc.compare(struct.getRCV_ISSUE_QTY(), qtyStruct.getw_STOCK_ON_HAND_QTY()) > 0)
									&& (!"3".equals(struct.geth_ISSUE_TYP())))
							{
								// 登録処理失敗：保管区別在庫数より多く戻入できません
								listMessage.add("T_ITEM_STOCK.ITEM_CD:" + struct.getITEM_CD());
								listMessage.add("T_ITEM_STOCK.WH_CD:" + struct.getw_WH_FROM_CD());
								listMessage.add("T_ITEM_STOCK.PLANT_CD:" + struct.getw_PLANT_CD());
								listMessage.add("T_ITEM_STOCK.STOCK_ON_HAND_QTY:" + qtyStruct.getw_STOCK_ON_HAND_QTY());
								setErrorMessage("AF00088", listMessage);
								listMessage.clear();
							}
	
						}else{
							if(!"3".equals(struct.geth_ISSUE_TYP())){//自動出庫の場合はチェックを行わない 2006/07/06
								// 登録処理失敗：保管区別品目在庫データが存在しません
								listMessage.add("T_ITEM_STOCK.ITEM_CD:" + struct.getITEM_CD());
								listMessage.add("T_ITEM_STOCK.WH_CD:" + struct.getw_WH_FROM_CD());
								listMessage.add("T_ITEM_STOCK.PLANT_CD:" + struct.getw_PLANT_CD());
								setErrorMessage("AF00044", listMessage);
								listMessage.clear();
							}
						}
					}
				}

				// チェックでエラーが発生していない場合
				if(msgStruct.sizeError() <= 0)
				{
					// トランザクション開始
					conn.beginTransWeb();

					// 戻入数 切り上げ処理
					boolean resultCeil = false;

					// 入庫処理結果フラグ
					boolean ret = true;

					if(struct.getw_UNIT_QTY_TYP().intValue() == 1
						&& calc.isNumeric(struct.getRCV_ISSUE_QTY())){
						struct.setRCV_ISSUE_QTY(calc.ceil(struct.getRCV_ISSUE_QTY(), 0));
						resultCeil = true;
					}

					// 品目情報をStructに設定
					struct.setw_STOCK_UPD_TYP(new Integer(1));				// 在庫更新区分

					// コピーストラクトの生成
					AF0080010Struct issueStruct = new AF0080010Struct(struct);
					AF0080010Struct rcvStruct = new AF0080010Struct(struct);

///////////////////入庫処理///////////////////////////////////////////////////////////////////////////////////////////////////

					// [出庫指示]."出庫先保管区コード" ＝ Null でない、かつ、
					// [出庫指示]."出庫指示出庫区分" ＝ 3：自動出庫 でない場合
					if ((struct.getw_WH_FROM_CD() != null && !"".equals(struct.getw_WH_FROM_CD()))
							&& (!"3".equals(struct.geth_ISSUE_TYP()))) {
						
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
							logMessage = "T_ISSUE_INST.ISSUE_INST_CD:" + struct.getISSUE_INST_CD();
							setSyslogConfig(logMessage);
	
							// ロールバック
							conn.rollback();
	
							ExpjMessage emsg = new ExpjMessage("AF00057");
							throw new FoundationException(
												"AF0080010Control",
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
	
						// 入出庫数の調整(入庫の場合、負数を設定)
						rcvStruct.setRCV_ISSUE_QTY(calc.multiply(struct.getRCV_ISSUE_QTY(), "-1"));
	
						// 登録する保管区コードを出庫先に
						rcvStruct.setw_WH_CD(struct.getw_WH_FROM_CD());
	
						// 入出庫発生区分
						if ((struct.getCONS_TYP()).intValue() == 0) {
							rcvStruct.setw_RCV_ISSUE_GNR_TYP(new Integer(69));			// 工程在庫入庫取消
						} else {
							rcvStruct.setw_RCV_ISSUE_GNR_TYP(new Integer(89));			// 取引先在庫入庫取消
						}
						
						// 製番
						rcvStruct.setJOB_ODR_CD(null);

						// メーカロット番号
						rcvStruct.setVEND_LOT_NO(null);
			            //会社コード
						if("".equals(rcvStruct.getw_COMPANY_CD()) || rcvStruct.getw_COMPANY_CD() == null){
							rcvStruct.setw_COMPANY_CD(_company_cd);
						}
						// 保管区別入出庫登録
						entity.minsertT_RCV_ISSUE.create(conn, rcvStruct);
	
						// 入庫処理
						RcvProcess rcvPrc = new RcvProcess(conn, rcvCtrlCd);
						if(rcvPrc.execProcess() == true){
							logMessage = "Receive Process was Complated!";
							setSyslogConfig(logMessage);
	
							if(resultCeil == true){
								// 登録処理失敗：整数管理品目のため小数点以下は切り上げして更新しました
								logMessage = "T_ISSUE_INST.ISSUE_INST_CD:" + struct.getISSUE_INST_CD();
								setInfoMessage("AF60004", logMessage);
	
								// 切り上げフラグを初期化
								resultCeil = false;
							}
						} else {
							// 入庫処理NG
							ret = false;
	
							logMessage = "Receive Process was Failed...";
							setSyslogConfig(logMessage);
	
							// ロールバック
							conn.rollback();
						}
	
						logMessage = "T_ISSUE_INST.ISSUE_INST_CD:" + struct.getISSUE_INST_CD();
						for(int idx = 0; idx < rcvPrc.getErrorList().size(); idx++){
							setErrorMessage((String)rcvPrc.getErrorList().get(idx) , logMessage);
						}
						for(int idx = 0; idx < rcvPrc.getInfoList().size(); idx++){
							setInfoMessage((String)rcvPrc.getInfoList().get(idx) , logMessage);
						}
						for(int idx = 0; idx < rcvPrc.getWarnList().size(); idx++){
							setWarnMessage((String)rcvPrc.getWarnList().get(idx) , logMessage);
						}
	
						// 入庫処理結果判定
						if(ret == false){
							// NGの場合は出庫処理は実行しない
							return;
						}
					}
					
///////////////////出庫処理///////////////////////////////////////////////////////////////////////////////////////////////////

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
						logMessage = "T_ISSUE_INST.ISSUE_INST_CD:" + struct.getISSUE_INST_CD();
						setErrorMessage("AF00057", logMessage);

						// ロールバック
						conn.rollback();

						ExpjMessage emsg = new ExpjMessage("AF00057");
						throw new FoundationException(
											"AF0080010Control",
											"controlinsert()",
											emsg.getMessage(CoreTools.getLocale(this.getsysUSER_CD())) );
					}

					// ログ出力
					logMessage = "T_RCV_ISSUE_CTRL.RCV_ISSUE_CTRL_CD:" + issueCtrlCd;
					setSyslogConfig(logMessage);

					// 入出庫管理番号設定
					issueStruct.setw_RCV_ISSUE_CTRL_CD(issueCtrlCd);

					// 入出庫区分設定
					issueStruct.setw_RCV_ISSUE_TYP(new Integer(2));				// 出庫

					// 入出庫数の調整(出庫の場合、正数を設定)
					issueStruct.setRCV_ISSUE_QTY(struct.getRCV_ISSUE_QTY());

					// 登録する保管区コードを出庫元に
					issueStruct.setw_WH_CD(struct.getw_WH_TO_CD());

					// 入出庫発生区分
					issueStruct.setw_RCV_ISSUE_GNR_TYP(new Integer(29));		// 出庫取消

					// 製番
					issueStruct.setJOB_ODR_CD(null);

					// メーカロット番号
					issueStruct.setVEND_LOT_NO(null);
		            //会社コード
					if("".equals(issueStruct.getw_COMPANY_CD()) || issueStruct.getw_COMPANY_CD() == null){
						issueStruct.setw_COMPANY_CD(_company_cd);
					}
					// 保管区別入出庫登録
					entity.minsertT_RCV_ISSUE.create(conn, issueStruct);

					// 出庫処理
					IssueProcess issuePrc = new IssueProcess(conn, issueCtrlCd);
					if(issuePrc.execProcess() == true){
						logMessage = "Issue Process was Complated!";
						setSyslogConfig(logMessage);

						if(resultCeil == true){
							// 登録処理失敗：整数管理品目のため小数点以下は切り上げして更新しました
							logMessage = "T_ISSUE_INST.ISSUE_INST_CD:" + struct.getISSUE_INST_CD();
							setInfoMessage("AF60004", logMessage);
						}
					} else {
						logMessage = "Issue Process was Failed...";
						setSyslogConfig(logMessage);

						// ロールバック
						conn.rollback();
					}

					logMessage = "T_ISSUE_INST.ISSUE_INST_CD:" + struct.getISSUE_INST_CD();
					for(int idx = 0; idx < issuePrc.getErrorList().size(); idx++){
						setErrorMessage((String)issuePrc.getErrorList().get(idx) , logMessage);
					}
					for(int idx = 0; idx < issuePrc.getInfoList().size(); idx++){
						setInfoMessage((String)issuePrc.getInfoList().get(idx) , logMessage);
					}
					for(int idx = 0; idx < issuePrc.getWarnList().size(); idx++){
						setWarnMessage((String)issuePrc.getWarnList().get(idx) , logMessage);
					}

					// 有償支給履歴へ追加
					// エラーがあれば終了
					if (issuePrc.getErrorList().size() > 0 ) {
						return;
					}
					
					// [出庫指示]."支給区分" ＝ 1：有償支給 の場合
					if ((struct.getCONS_TYP()).intValue() == 1) {
						logMessage = "M_CONS_UNIT_COST.ITEM_CD:" +  struct.getITEM_CD()
									+ ", M_CONS_UNIT_COST.VEND_CD:" +  struct.getVEND_CD()
									+ ", M_CONS_UNIT_COST.COMPANY_CD:" +  struct.getw_COMPANY_CD()
									+ ", T_ISSUE_INST.EFF_PHASE_IN_DATE:" + struct.getRCV_ISSUE_DATE();
						setSyslogConfig(logMessage);
						//支給単価の取得
						tmpList = null;
						tmpList = entity.mM_CONS_UNIT_COST.read(conn, struct);
						if(tmpList.size() <= 0) {
							struct.setUNIT_COST(new String("0"));
							struct.setUNIT_COST_TYP("1");
						}
						else{
							AF0080010Struct workStruct = (AF0080010Struct)tmpList.get(0);
							logMessage = "M_CONS_UNIT_COST.ONEROUS_FLG:" +  workStruct.getONEROUS_FLG()
										+ ", M_CONS_UNIT_COST.UNIT_COST:" +  workStruct.getUNIT_COST()
										+ ", M_CONS_UNIT_COST.UNIT_COST_TYP:" +  workStruct.getUNIT_COST_TYP();
							setSyslogConfig(logMessage);
							// 支給単価の有償フラグ＝1(有償)の時、有償単価セット
							if("1".equals(workStruct.getONEROUS_FLG())){
								struct.setUNIT_COST(workStruct.getUNIT_COST());
								struct.setUNIT_COST_TYP(workStruct.getUNIT_COST_TYP());
							}
							else{
								struct.setUNIT_COST(new String("0"));
								struct.setUNIT_COST_TYP("1");
							}
						}

						// 有償支給番号採番
						String ctrlCd = null;
						CollectNumber collect = new CollectNumber(
												CollectNumber.ONERCONS_CD, 
												getsysUSER_CD(), 
												this.sp.getProcId(), 
												struct.getw_PLANT_CD());
						try{
							ctrlCd = collect.getNo();
							if(ctrlCd == null){
								ExpjMessage emsg = new ExpjMessage("AF00078");
								throw new FoundationException(
												"AF0080010Control",
												"insert_rcv_process()",
												emsg.getMessage(CoreTools.getLocale(this.getsysUSER_CD())) );
							}
						}
						catch(FoundationException ex){
							// 登録処理失敗：有償支給番号の採番に失敗しました
							logMessage = "T_ISSUE_INST.ISSUE_INST_CD:" + struct.getISSUE_INST_CD();
							setErrorMessage("AF00078", logMessage);
							
							ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
							sysLog.severe(emsg, getsysUSER_CD());
							ExpjException ee = new ExpjException(ex, emsg);
							throw ee;
						}

						// 有償支給番号
						struct.setONEROUS_CONS_NO(ctrlCd);
						// 出庫数
						struct.setRCV_ISSUE_QTY(struct.getRCV_ISSUE_QTY());
						// 出庫指示番号
						struct.setISSUE_INST_CD(struct.getISSUE_INST_CD());
						// 返品先保管区コード

						logMessage = "T_PAST_ONEROUS_CONS.ONEROUS_CONS_NO:" + struct.getONEROUS_CONS_NO()
									+ ",T_PAST_ONEROUS_CONS.JOB_ODR_CD:" + struct.getJOB_ODR_CD()
									+ ", T_PAST_ONEROUS_CONS.ITEM_CD:" + struct.getITEM_CD()
									+ ", T_PAST_ONEROUS_CONS.VEND_CD:" + struct.getVEND_CD()
									+ ", T_PAST_ONEROUS_CONS.ISSUE_DATE:" + struct.getRCV_ISSUE_DATE()
									+ ", T_PAST_ONEROUS_CONS.ISSUE_QTY:" + struct.getRCV_ISSUE_QTY();
						setSyslogConfig(logMessage);

						// コピーストラクトの生成
						AF0080010Struct pastOnerousConsStruct = new AF0080010Struct(struct);
						// 有償支給番号
						pastOnerousConsStruct.setONEROUS_CONS_NO(struct.getONEROUS_CONS_NO());
						// 単価
						pastOnerousConsStruct.setUNIT_COST(struct.getUNIT_COST());
						// 単価区分
						pastOnerousConsStruct.setUNIT_COST_TYP(struct.getUNIT_COST_TYP());						
						// 入出庫管理番号
						pastOnerousConsStruct.setRCV_ISSUE_CTRL_CD(issueCtrlCd);						
						// 会社コード
						pastOnerousConsStruct.setCOMPANY_CD(struct.getw_COMPANY_CD());						
						// 工場コード
						pastOnerousConsStruct.setPLANT_CD(struct.getw_PLANT_CD());						
						// 出庫数
						pastOnerousConsStruct.setRCV_ISSUE_QTY(Calculate.multiply(struct.getRCV_ISSUE_QTY(), "-1"));						
						// 返品理由コード
						pastOnerousConsStruct.setRETURNED_CAUSE_CD(struct.getRCV_ISSUE_COMMENT());						
						// 製番
						pastOnerousConsStruct.setJOB_ODR_CD(null);
						// メーカロット番号
						pastOnerousConsStruct.setVEND_LOT_NO(null);						
						// 有償支給履歴登録
						entity.mT_PAST_ONEROUS_CONS.create(conn, pastOnerousConsStruct);
					}				
					List modifyCountList = entity.mSelectT_LOT_ISSUE_INST_LOCK.read(conn,struct);
                    //出庫在庫明細を更新
					if(calc.compare(struct.getRCV_ISSUE_QTY(),"0") > 0){
						entity.mT_LOT_ISSUE_INST.update(conn, struct);
					}
					// コミット
					conn.commit();
					
					// キーコピー
					struct.copy(keyStruct);					
				}
			}		
		}catch(ResourceBusyException e) {
			e.printStackTrace();
			setErrorMessage("ZZ01105");
			setReadStatus(ERROR);
		}catch(SQLException e){
			// 検索状態を「読込失敗」に設定
			setReadStatus(ERROR);

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
                //}}user_implement_dev:<controlinsertSub2>
		logger.exiting("AF0080010Control"+":USER="+struct.getsUser_ID(),"controlinsertSub2");

		return;
	}

	/**
	 * 読込ボタン押下時に実行される処理です。
	 *
	 */
	public void controlSelectSub2() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0080");
		logger.entering("AF0080010Control"+":USER="+struct.getsUser_ID(),"controlSelectSub2");
			//{{user_implement_dev:<controlSelectSub2>
			// TODO: ユーザ定義のコードを記述してください
		// ログ出力情報格納用
		String logMessage = "";
		List listMessage = new ArrayList();
		
		// チェック結果格納
		boolean check = true;		

		try {

			// 保管区名クリア
			struct.setw_WH_FROM_NAME((String)null);	// 戻入元

			AF0080010Struct whTmpStruct = new AF0080010Struct(struct);

			if (struct.getw_WH_FROM_CD() != null && !"".equals(struct.getw_WH_FROM_CD())) {
				// 戻入元保管区情報取得
				whTmpStruct.setw_WH_CD(struct.getw_WH_FROM_CD());
	
				List outWhList = entity.mselectM_WH.read(conn, whTmpStruct);
				AF0080010Struct outWhStruct = null;
				if(outWhList.size() <= 0){
					// 登録処理失敗：戻入元保管区コードが存在しません
					logMessage = "M_WH.WH_CD:" + struct.getw_WH_FROM_CD();
					setErrorMessage("AF00037", logMessage);
				}
				else{
					outWhStruct = (AF0080010Struct)outWhList.get(0);
	
					// 戻入元保管区名を設定
					struct.setw_WH_FROM_NAME(outWhStruct.getw_WH_NAME());
					// 倉庫区分を設定
					struct.setw_WH_TYP(outWhStruct.getw_WH_TYP());
					
					// 戻入元保管区の工場コードチェック
					if(!struct.getw_PLANT_CD().equals(outWhStruct.getw_PLANT_CD_check())){
						// 登録処理失敗：保管区コードは他の工場のデータなので指定できません
						listMessage.add("M_WH.WH_CD:" + struct.getw_WH_FROM_CD());
						listMessage.add("M_WH.PLANT_CD:" +  outWhStruct.getw_PLANT_CD_check());
						setErrorMessage("AF00038", listMessage);
						listMessage.clear();
					}
					
					if(outWhStruct.getw_MRP_FLG().intValue() == 1){
						// 登録処理失敗：戻入元保管区コードが所要量計算対象の保管区です。
						listMessage.add("M_WH.WH_CD:" + struct.getw_WH_FROM_CD());
						listMessage.add("M_WH.MRP_FLG:" +  outWhStruct.getw_MRP_FLG());
						setErrorMessage("AF00134", listMessage);
						listMessage.clear();
					}
				}
			}

			// 在庫ロット番号の存在チェック
			List tmpList = null;
			if (struct.getw_LOT_NO() != null
					&& !"".equals(struct.getw_LOT_NO())) {
				tmpList = entity.mT_LOT_CTRL.read(conn, struct);
				if (tmpList.size() <= 0) {
					logMessage = "T_LOT_CTRL.LOT_NO:" + struct.getw_LOT_NO();
					setErrorMessage("AF20002", logMessage);
				}
			}

			//リストクリア
			if (list != null) {
				list.clear();
			}
			
            // エラーがあれば終了
            if (msgStruct.hasError()) {
             return;
            }
            int maxLine = sp.getMaxLine(conn, 20);
			if(maxLine != 0) {
				struct.setROW_COUNT(String.valueOf(maxLine));
			} else {
				struct.setROW_COUNT(null);
			}
			list = entity.mT_LOT_ISSUE_INSTCnt.read(conn, struct);
			long rowCount = Long.parseLong(((AF0080010Struct)this.list.get(0)).getl_COUNT());
			if (!(rowCount==0)){
    			// 表示最大行数制限処理
    			if(maxLine != 0 && rowCount== maxLine + 1){
    				setReadStatus(TOO_MANY);
    				if(list != null && list.size() > 0){
						list.clear();
					}
    				logMessage = "";
    				setErrorMessage("ZZ01115", "", ""+maxLine);
    				return;
    			}
            }else{
            	setErrorMessage("ZZ06001");
            	readStatus = NOT_FOUND;
            	if(list != null && list.size() > 0){
					list.clear();
				}
				return;
            }
			// ロット別在庫一覧の取得
            list = entity.mT_LOT_ISSUE_INST.read(conn, struct);
            

		} catch (SQLException e) {
			setSqlExceptionMsg(e);

		} finally {
			// モード設定
			if (check == true) {
				setReadStatus(NORMAL);
			}
		}
                //}}user_implement_dev:<controlSelectSub2>
		logger.exiting("AF0080010Control"+":USER="+struct.getsUser_ID(),"controlSelectSub2");

		return;
	}

	/**
	 * 戻るボタン押下時に実行される処理です。
	 *
	 */
	public void controlcloseSub2() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0080");
		logger.entering("AF0080010Control"+":USER="+struct.getsUser_ID(),"controlcloseSub2");
			//{{user_implement_dev:<controlcloseSub2>
			// TODO: ユーザ定義のコードを記述してください		
		// キーコピー
		struct.copy(keyStruct);
		
		// 親画面データ再読込
		controlselect();
                //}}user_implement_dev:<controlcloseSub2>
		logger.exiting("AF0080010Control"+":USER="+struct.getsUser_ID(),"controlcloseSub2");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0080");
		logger.entering("AF0080010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
		//-----------------------------------------------------------------------------
		// ユーザ定義初期化
		usersInitialize();
		//-----------------------------------------------------------------------------
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AF0080010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0080");
		logger.entering("AF0080010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
		//-----------------------------------------------------------------------------

		// ユーザ定義初期化
		usersInitialize();
		
		try {
			// ロット管理導入済チェック
			if (LotCtrl.checkLotCtrl(conn)) {
				lotCtrl = "true";
				// ロット管理フラグを設定する
				// 参数区分
				struct.seth_Param_Div("LOT_CTRL_FLAG");
				List sysParaLotFlgList = entity.mSELECT_SYS_PARAMETER.read(conn, struct);
				if(sysParaLotFlgList.size() > 0){
					AF0080010Struct sysParaStruct = (AF0080010Struct)sysParaLotFlgList.get(0);
					struct.setLOT_CTRL_FLG(sysParaStruct.getPARAM_RESULT());
				}else{
					// 初期値
					struct.setLOT_CTRL_FLG("0");
					
				}
			} else {
			    lotCtrl = "false";
			    struct.setLOT_CTRL_FLG("0");
			}
			// 会社コード取得
			_company_cd = SystemInformation.getSysMyCompanyCd();
		} catch (SQLException e) {	
			ExpjMessage emsg = new ExpjMessage( "ZZ01006" ,"(SBM0991)ロット管理フラグの取得に失敗しました。");
			msgStruct.addWarn( emsg );
			sysLog.info(emsg, getsysUSER_CD());
		}
		//-----------------------------------------------------------------------------
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AF0080010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * イベントハンドラの前処理です。
	 *
	 * @param buttun ボタン名
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0080");
		logger.entering("AF0080010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
		logger.exiting("AF0080010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("insertSub2") ) {
				controlinsertSub2();
			} else if( button.equals("SelectSub2") ) {
				controlSelectSub2();
			} else if( button.equals("closeSub2") ) {
				controlcloseSub2();
			} else if( button.equals("initial") ) {
				controlINITIAL();
			} else if( button.equals("reload") ) {
				controlRELOAD();
			}
		//{{user_implement_dev:<control_eventHandller>
		//------------------------------------------------------------------
		//コンボボックスに取得データ設定
		struct.setList_ISSUE_CMPLT_FLG_val(_ISSUE_CMPLT_FLG.getValList());
		struct.setList_ISSUE_CMPLT_FLG_name(_ISSUE_CMPLT_FLG.getExplanList());
		struct.setList_CONS_TYP_val(_CONS_TYP.getValList());
		struct.setList_CONS_TYP_name(_CONS_TYP.getExplanList());
		struct.setList_LOT_CTRL_FLG_val(_LOT_CTRL_FLG.getValList());
		struct.setList_LOT_CTRL_FLG_name(_LOT_CTRL_FLG.getExplanList());
		struct.seth_lotCtrl(lotCtrl);

//		ソース内にまだAlarmMessageExceptionが残っている場合は、以下の行のコメントを外してAlarmMessageExceptionを始末する。
//		} catch(AlarmMessageException ame){
//			ExpjException ee = new ExpjException(ame, (ExpjMessageList)((Object)ame.getMessages()));
//			throw ee;
		//------------------------------------------------------------------
                //}}user_implement_dev:<control_eventHandller>
		} catch( BusinessLockException ble ) {
			// 枠メッセージ出力依頼作成
			setNewDataFlg(false);
		} catch( ResourceBusyException rbe ) {
			ExpjException ee = new ExpjException(rbe, "ZZ01105");
			throw ee;
		} catch( FoundationException e ) {
//			e.printStackTrace();
//			throw new FoundationException("AF0080010Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AF0080010-E999","CSVの出力処理"));
			throw new FoundationException("AF0080010Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AF0080010-E999","システム日付の取得処理"));
				throw new FoundationException("AF0080010Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AF0080010-E999","コントロールのイベント処理"));
			throw new FoundationException("AF0080010Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected AF0080010Entity entity;
	protected AF0080010Struct struct;
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

		entity = new AF0080010Entity();
		struct = new AF0080010Struct();

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
	 * AF0080010クラスの標準コンストラクタ
	 */
	public AF0080010Control() throws BusinessProcessException, FoundationException
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
				AF0080010Struct key = (AF0080010Struct)keyList.get(j);
				// メッセージキーを作成する
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("w_WH_TO_CD") && key.getw_WH_TO_CD() != null) {
					msgKey.setKeyValue("w_WH_TO_CD", key.getw_WH_TO_CD());
				}
				if(msgKeyType.containsKeyColumn("w_WH_FROM_NAME") && key.getw_WH_FROM_NAME() != null) {
					msgKey.setKeyValue("w_WH_FROM_NAME", key.getw_WH_FROM_NAME());
				}
				if(msgKeyType.containsKeyColumn("w_WH_TO_NAME") && key.getw_WH_TO_NAME() != null) {
					msgKey.setKeyValue("w_WH_TO_NAME", key.getw_WH_TO_NAME());
				}
				if(msgKeyType.containsKeyColumn("w_CHOICE_1") && key.getw_CHOICE_1() != null) {
					msgKey.setKeyValue("w_CHOICE_1", key.getw_CHOICE_1());
				}
				if(msgKeyType.containsKeyColumn("w_CHOICE_2") && key.getw_CHOICE_2() != null) {
					msgKey.setKeyValue("w_CHOICE_2", key.getw_CHOICE_2());
				}
				if(msgKeyType.containsKeyColumn("w_CHOICE_3") && key.getw_CHOICE_3() != null) {
					msgKey.setKeyValue("w_CHOICE_3", key.getw_CHOICE_3());
				}
				if(msgKeyType.containsKeyColumn("w_CHOICE") && key.getw_CHOICE() != null) {
					msgKey.setKeyValue("w_CHOICE", key.getw_CHOICE());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_CMPLT_NAME") && key.getISSUE_CMPLT_NAME() != null) {
					msgKey.setKeyValue("ISSUE_CMPLT_NAME", key.getISSUE_CMPLT_NAME());
				}
				if(msgKeyType.containsKeyColumn("CONS_NAME") && key.getCONS_NAME() != null) {
					msgKey.setKeyValue("CONS_NAME", key.getCONS_NAME());
				}
				if(msgKeyType.containsKeyColumn("s_OPR_INST_CD") && key.gets_OPR_INST_CD() != null) {
					msgKey.setKeyValue("s_OPR_INST_CD", key.gets_OPR_INST_CD());
				}
				if(msgKeyType.containsKeyColumn("c_JOB_ODR_CD") && key.getc_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("c_JOB_ODR_CD", key.getc_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("OWN_ISSUED_QTY") && key.getOWN_ISSUED_QTY() != null) {
					msgKey.setKeyValue("OWN_ISSUED_QTY", key.getOWN_ISSUED_QTY());
				}
				if(msgKeyType.containsKeyColumn("OTHER_ISSUED_QTY") && key.getOTHER_ISSUED_QTY() != null) {
					msgKey.setKeyValue("OTHER_ISSUED_QTY", key.getOTHER_ISSUED_QTY());
				}
				if(msgKeyType.containsKeyColumn("ITEM_ISSUED_QTY") && key.getITEM_ISSUED_QTY() != null) {
					msgKey.setKeyValue("ITEM_ISSUED_QTY", key.getITEM_ISSUED_QTY());
				}
				if(msgKeyType.containsKeyColumn("h_JOB_ODR_CD") && key.geth_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("h_JOB_ODR_CD", key.geth_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("h_WH_FROM_CD") && key.geth_WH_FROM_CD() != null) {
					msgKey.setKeyValue("h_WH_FROM_CD", key.geth_WH_FROM_CD());
				}
				if(msgKeyType.containsKeyColumn("h_RCV_ISSUE_DATE") && key.geth_RCV_ISSUE_DATE() != null) {
					msgKey.setKeyValue("h_RCV_ISSUE_DATE", key.geth_RCV_ISSUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("h_lotCtrl") && key.geth_lotCtrl() != null) {
					msgKey.setKeyValue("h_lotCtrl", key.geth_lotCtrl());
				}
				if(msgKeyType.containsKeyColumn("LOT_CTRL_FLG_name") && key.getLOT_CTRL_FLG_name() != null) {
					msgKey.setKeyValue("LOT_CTRL_FLG_name", key.getLOT_CTRL_FLG_name());
				}
				if(msgKeyType.containsKeyColumn("LOT_CTRL_FLG_val") && key.getLOT_CTRL_FLG_val() != null) {
					msgKey.setKeyValue("LOT_CTRL_FLG_val", key.getLOT_CTRL_FLG_val());
				}
				if(msgKeyType.containsKeyColumn("w_LOT_CTRL_FLG") && key.getw_LOT_CTRL_FLG() != null) {
					msgKey.setKeyValue("w_LOT_CTRL_FLG", key.getw_LOT_CTRL_FLG());
				}
				if(msgKeyType.containsKeyColumn("w_OPR_INST_CD") && key.getw_OPR_INST_CD() != null) {
					msgKey.setKeyValue("w_OPR_INST_CD", key.getw_OPR_INST_CD());
				}
				if(msgKeyType.containsKeyColumn("w_PUCH_ODR_CD") && key.getw_PUCH_ODR_CD() != null) {
					msgKey.setKeyValue("w_PUCH_ODR_CD", key.getw_PUCH_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("w_ISSUE_INST_CD") && key.getw_ISSUE_INST_CD() != null) {
					msgKey.setKeyValue("w_ISSUE_INST_CD", key.getw_ISSUE_INST_CD());
				}
				if(msgKeyType.containsKeyColumn("w_COMPANY_CD") && key.getw_COMPANY_CD() != null) {
					msgKey.setKeyValue("w_COMPANY_CD", key.getw_COMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("w_PROC_NAME") && key.getw_PROC_NAME() != null) {
					msgKey.setKeyValue("w_PROC_NAME", key.getw_PROC_NAME());
				}
				if(msgKeyType.containsKeyColumn("w_OD_NO") && key.getw_OD_NO() != null) {
					msgKey.setKeyValue("w_OD_NO", key.getw_OD_NO());
				}
				if(msgKeyType.containsKeyColumn("w_WH_FROM_CD") && key.getw_WH_FROM_CD() != null) {
					msgKey.setKeyValue("w_WH_FROM_CD", key.getw_WH_FROM_CD());
				}
				if(msgKeyType.containsKeyColumn("w_PLANT_CD") && key.getw_PLANT_CD() != null) {
					msgKey.setKeyValue("w_PLANT_CD", key.getw_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("w_BUSINESS_OPR_DATE") && key.getw_BUSINESS_OPR_DATE() != null) {
					msgKey.setKeyValue("w_BUSINESS_OPR_DATE", key.getw_BUSINESS_OPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_CMPLT_FLG_val") && key.getISSUE_CMPLT_FLG_val() != null) {
					msgKey.setKeyValue("ISSUE_CMPLT_FLG_val", key.getISSUE_CMPLT_FLG_val().toString());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_CMPLT_FLG_name") && key.getISSUE_CMPLT_FLG_name() != null) {
					msgKey.setKeyValue("ISSUE_CMPLT_FLG_name", key.getISSUE_CMPLT_FLG_name());
				}
				if(msgKeyType.containsKeyColumn("CONS_TYP_val") && key.getCONS_TYP_val() != null) {
					msgKey.setKeyValue("CONS_TYP_val", key.getCONS_TYP_val().toString());
				}
				if(msgKeyType.containsKeyColumn("CONS_TYP_name") && key.getCONS_TYP_name() != null) {
					msgKey.setKeyValue("CONS_TYP_name", key.getCONS_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_INST_CD") && key.getISSUE_INST_CD() != null) {
					msgKey.setKeyValue("ISSUE_INST_CD", key.getISSUE_INST_CD());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_CD") && key.getJOB_ODR_CD() != null) {
					msgKey.setKeyValue("JOB_ODR_CD", key.getJOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_DETAIL_NO") && key.getJOB_ODR_DETAIL_NO() != null) {
					msgKey.setKeyValue("JOB_ODR_DETAIL_NO", key.getJOB_ODR_DETAIL_NO().toString());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_NAME") && key.getITEM_NAME() != null) {
					msgKey.setKeyValue("ITEM_NAME", key.getITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_INST_QTY") && key.getISSUE_INST_QTY() != null) {
					msgKey.setKeyValue("ISSUE_INST_QTY", key.getISSUE_INST_QTY());
				}
				if(msgKeyType.containsKeyColumn("TOTAL_ISSUE_QTY") && key.getTOTAL_ISSUE_QTY() != null) {
					msgKey.setKeyValue("TOTAL_ISSUE_QTY", key.getTOTAL_ISSUE_QTY());
				}
				if(msgKeyType.containsKeyColumn("SCDL_ISSUE_DATE") && key.getSCDL_ISSUE_DATE() != null) {
					msgKey.setKeyValue("SCDL_ISSUE_DATE", key.getSCDL_ISSUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_CMPLT_DATE") && key.getISSUE_CMPLT_DATE() != null) {
					msgKey.setKeyValue("ISSUE_CMPLT_DATE", key.getISSUE_CMPLT_DATE());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_CMPLT_FLG") && key.getISSUE_CMPLT_FLG() != null) {
					msgKey.setKeyValue("ISSUE_CMPLT_FLG", key.getISSUE_CMPLT_FLG().toString());
				}
				if(msgKeyType.containsKeyColumn("WH_CD") && key.getWH_CD() != null) {
					msgKey.setKeyValue("WH_CD", key.getWH_CD());
				}
				if(msgKeyType.containsKeyColumn("WH_NAME") && key.getWH_NAME() != null) {
					msgKey.setKeyValue("WH_NAME", key.getWH_NAME());
				}
				if(msgKeyType.containsKeyColumn("w_OPR_INST_CD_item") && key.getw_OPR_INST_CD_item() != null) {
					msgKey.setKeyValue("w_OPR_INST_CD_item", key.getw_OPR_INST_CD_item());
				}
				if(msgKeyType.containsKeyColumn("w_OPR_INST_CD_job") && key.getw_OPR_INST_CD_job() != null) {
					msgKey.setKeyValue("w_OPR_INST_CD_job", key.getw_OPR_INST_CD_job());
				}
				if(msgKeyType.containsKeyColumn("WS_CD") && key.getWS_CD() != null) {
					msgKey.setKeyValue("WS_CD", key.getWS_CD());
				}
				if(msgKeyType.containsKeyColumn("WS_NAME") && key.getWS_NAME() != null) {
					msgKey.setKeyValue("WS_NAME", key.getWS_NAME());
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
				if(msgKeyType.containsKeyColumn("VEND_CD") && key.getVEND_CD() != null) {
					msgKey.setKeyValue("VEND_CD", key.getVEND_CD());
				}
				if(msgKeyType.containsKeyColumn("VEND_ANAME") && key.getVEND_ANAME() != null) {
					msgKey.setKeyValue("VEND_ANAME", key.getVEND_ANAME());
				}
				if(msgKeyType.containsKeyColumn("CONS_TYP") && key.getCONS_TYP() != null) {
					msgKey.setKeyValue("CONS_TYP", key.getCONS_TYP().toString());
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
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP") && key.getMRP_ODR_TYP() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP", key.getMRP_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("h_ISSUE_TYP") && key.geth_ISSUE_TYP() != null) {
					msgKey.setKeyValue("h_ISSUE_TYP", key.geth_ISSUE_TYP());
				}
				if(msgKeyType.containsKeyColumn("LOT_CTRL_FLG") && key.getLOT_CTRL_FLG() != null) {
					msgKey.setKeyValue("LOT_CTRL_FLG", key.getLOT_CTRL_FLG());
				}
				if(msgKeyType.containsKeyColumn("w_RCV_ISSUE_CTRL_CD") && key.getw_RCV_ISSUE_CTRL_CD() != null) {
					msgKey.setKeyValue("w_RCV_ISSUE_CTRL_CD", key.getw_RCV_ISSUE_CTRL_CD());
				}
				if(msgKeyType.containsKeyColumn("w_RCV_ISSUE_TYP") && key.getw_RCV_ISSUE_TYP() != null) {
					msgKey.setKeyValue("w_RCV_ISSUE_TYP", key.getw_RCV_ISSUE_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("w_WH_CD") && key.getw_WH_CD() != null) {
					msgKey.setKeyValue("w_WH_CD", key.getw_WH_CD());
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
				if(msgKeyType.containsKeyColumn("w_STOCK_UPD_TYP") && key.getw_STOCK_UPD_TYP() != null) {
					msgKey.setKeyValue("w_STOCK_UPD_TYP", key.getw_STOCK_UPD_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("VEND_LOT_NO") && key.getVEND_LOT_NO() != null) {
					msgKey.setKeyValue("VEND_LOT_NO", key.getVEND_LOT_NO());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_COMMENT") && key.getRCV_ISSUE_COMMENT() != null) {
					msgKey.setKeyValue("RCV_ISSUE_COMMENT", key.getRCV_ISSUE_COMMENT());
				}
				if(msgKeyType.containsKeyColumn("w_LOT_NO") && key.getw_LOT_NO() != null) {
					msgKey.setKeyValue("w_LOT_NO", key.getw_LOT_NO());
				}
				if(msgKeyType.containsKeyColumn("w_WH_NAME") && key.getw_WH_NAME() != null) {
					msgKey.setKeyValue("w_WH_NAME", key.getw_WH_NAME());
				}
				if(msgKeyType.containsKeyColumn("w_PLANT_CD_check") && key.getw_PLANT_CD_check() != null) {
					msgKey.setKeyValue("w_PLANT_CD_check", key.getw_PLANT_CD_check());
				}
				if(msgKeyType.containsKeyColumn("w_WH_TYP") && key.getw_WH_TYP() != null) {
					msgKey.setKeyValue("w_WH_TYP", key.getw_WH_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("w_MRP_FLG") && key.getw_MRP_FLG() != null) {
					msgKey.setKeyValue("w_MRP_FLG", key.getw_MRP_FLG().toString());
				}
				if(msgKeyType.containsKeyColumn("w_STOCK_ON_HAND_QTY") && key.getw_STOCK_ON_HAND_QTY() != null) {
					msgKey.setKeyValue("w_STOCK_ON_HAND_QTY", key.getw_STOCK_ON_HAND_QTY());
				}
				if(msgKeyType.containsKeyColumn("SAVE_JOB_ODR_CD") && key.getSAVE_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("SAVE_JOB_ODR_CD", key.getSAVE_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("THIS_MONTH") && key.getTHIS_MONTH() != null) {
					msgKey.setKeyValue("THIS_MONTH", key.getTHIS_MONTH());
				}
				if(msgKeyType.containsKeyColumn("INSTALL_FLG") && key.getINSTALL_FLG() != null) {
					msgKey.setKeyValue("INSTALL_FLG", key.getINSTALL_FLG());
				}
				if(msgKeyType.containsKeyColumn("ONEROUS_CONS_NO") && key.getONEROUS_CONS_NO() != null) {
					msgKey.setKeyValue("ONEROUS_CONS_NO", key.getONEROUS_CONS_NO());
				}
				if(msgKeyType.containsKeyColumn("COMPANY_CD") && key.getCOMPANY_CD() != null) {
					msgKey.setKeyValue("COMPANY_CD", key.getCOMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("UNIT_COST") && key.getUNIT_COST() != null) {
					msgKey.setKeyValue("UNIT_COST", key.getUNIT_COST());
				}
				if(msgKeyType.containsKeyColumn("UNIT_COST_TYP") && key.getUNIT_COST_TYP() != null) {
					msgKey.setKeyValue("UNIT_COST_TYP", key.getUNIT_COST_TYP());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_CTRL_CD") && key.getRCV_ISSUE_CTRL_CD() != null) {
					msgKey.setKeyValue("RCV_ISSUE_CTRL_CD", key.getRCV_ISSUE_CTRL_CD());
				}
				if(msgKeyType.containsKeyColumn("RETURNED_CAUSE_CD") && key.getRETURNED_CAUSE_CD() != null) {
					msgKey.setKeyValue("RETURNED_CAUSE_CD", key.getRETURNED_CAUSE_CD());
				}
				if(msgKeyType.containsKeyColumn("ONEROUS_FLG") && key.getONEROUS_FLG() != null) {
					msgKey.setKeyValue("ONEROUS_FLG", key.getONEROUS_FLG());
				}
				if(msgKeyType.containsKeyColumn("PARAM_RESULT") && key.getPARAM_RESULT() != null) {
					msgKey.setKeyValue("PARAM_RESULT", key.getPARAM_RESULT());
				}
				if(msgKeyType.containsKeyColumn("h_Param_Div") && key.geth_Param_Div() != null) {
					msgKey.setKeyValue("h_Param_Div", key.geth_Param_Div());
				}
				if(msgKeyType.containsKeyColumn("l_LOT_NO") && key.getl_LOT_NO() != null) {
					msgKey.setKeyValue("l_LOT_NO", key.getl_LOT_NO());
				}
				if(msgKeyType.containsKeyColumn("l_TOTAL_ISSUE_QTY") && key.getl_TOTAL_ISSUE_QTY() != null) {
					msgKey.setKeyValue("l_TOTAL_ISSUE_QTY", key.getl_TOTAL_ISSUE_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_ISSUE_DATE") && key.getl_ISSUE_DATE() != null) {
					msgKey.setKeyValue("l_ISSUE_DATE", key.getl_ISSUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_STOCK_ON_HAND_QTY") && key.getl_STOCK_ON_HAND_QTY() != null) {
					msgKey.setKeyValue("l_STOCK_ON_HAND_QTY", key.getl_STOCK_ON_HAND_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_DEFECT_QTY") && key.getl_DEFECT_QTY() != null) {
					msgKey.setKeyValue("l_DEFECT_QTY", key.getl_DEFECT_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_ALLOCABLE_QTY") && key.getl_ALLOCABLE_QTY() != null) {
					msgKey.setKeyValue("l_ALLOCABLE_QTY", key.getl_ALLOCABLE_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_EXTERNAL_LOT_NO") && key.getl_EXTERNAL_LOT_NO() != null) {
					msgKey.setKeyValue("l_EXTERNAL_LOT_NO", key.getl_EXTERNAL_LOT_NO());
				}
				if(msgKeyType.containsKeyColumn("l_BEST_BEFORE_DATE") && key.getl_BEST_BEFORE_DATE() != null) {
					msgKey.setKeyValue("l_BEST_BEFORE_DATE", key.getl_BEST_BEFORE_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_PRD_CMPLT_DATE") && key.getl_PRD_CMPLT_DATE() != null) {
					msgKey.setKeyValue("l_PRD_CMPLT_DATE", key.getl_PRD_CMPLT_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_STOCK_UNIT") && key.getl_STOCK_UNIT() != null) {
					msgKey.setKeyValue("l_STOCK_UNIT", key.getl_STOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("BBD_c_FLG") && key.getBBD_c_FLG() != null) {
					msgKey.setKeyValue("BBD_c_FLG", key.getBBD_c_FLG());
				}
				if(msgKeyType.containsKeyColumn("l_COUNT") && key.getl_COUNT() != null) {
					msgKey.setKeyValue("l_COUNT", key.getl_COUNT());
				}
				if(msgKeyType.containsKeyColumn("ROW_COUNT") && key.getROW_COUNT() != null) {
					msgKey.setKeyValue("ROW_COUNT", key.getROW_COUNT());
				}
				if(msgKeyType.containsKeyColumn("l_MODIFY_COUNT") && key.getl_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("l_MODIFY_COUNT", key.getl_MODIFY_COUNT());
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
					AF0080010Struct key = new AF0080010Struct();
					if(msgKeyType.containsKeyColumn("w_WH_TO_CD")) {
						key.setw_WH_TO_CD(msgKey.getKeyValue("w_WH_TO_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_WH_FROM_NAME")) {
						key.setw_WH_FROM_NAME(msgKey.getKeyValue("w_WH_FROM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("w_WH_TO_NAME")) {
						key.setw_WH_TO_NAME(msgKey.getKeyValue("w_WH_TO_NAME"));
					}
					if(msgKeyType.containsKeyColumn("w_CHOICE_1")) {
						key.setw_CHOICE_1(msgKey.getKeyValue("w_CHOICE_1"));
					}
					if(msgKeyType.containsKeyColumn("w_CHOICE_2")) {
						key.setw_CHOICE_2(msgKey.getKeyValue("w_CHOICE_2"));
					}
					if(msgKeyType.containsKeyColumn("w_CHOICE_3")) {
						key.setw_CHOICE_3(msgKey.getKeyValue("w_CHOICE_3"));
					}
					if(msgKeyType.containsKeyColumn("w_CHOICE")) {
						key.setw_CHOICE(msgKey.getKeyValue("w_CHOICE"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_CMPLT_NAME")) {
						key.setISSUE_CMPLT_NAME(msgKey.getKeyValue("ISSUE_CMPLT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("CONS_NAME")) {
						key.setCONS_NAME(msgKey.getKeyValue("CONS_NAME"));
					}
					if(msgKeyType.containsKeyColumn("s_OPR_INST_CD")) {
						key.sets_OPR_INST_CD(msgKey.getKeyValue("s_OPR_INST_CD"));
					}
					if(msgKeyType.containsKeyColumn("c_JOB_ODR_CD")) {
						key.setc_JOB_ODR_CD(msgKey.getKeyValue("c_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("OWN_ISSUED_QTY")) {
						key.setOWN_ISSUED_QTY(msgKey.getKeyValue("OWN_ISSUED_QTY"));
					}
					if(msgKeyType.containsKeyColumn("OTHER_ISSUED_QTY")) {
						key.setOTHER_ISSUED_QTY(msgKey.getKeyValue("OTHER_ISSUED_QTY"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_ISSUED_QTY")) {
						key.setITEM_ISSUED_QTY(msgKey.getKeyValue("ITEM_ISSUED_QTY"));
					}
					if(msgKeyType.containsKeyColumn("h_JOB_ODR_CD")) {
						key.seth_JOB_ODR_CD(msgKey.getKeyValue("h_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_WH_FROM_CD")) {
						key.seth_WH_FROM_CD(msgKey.getKeyValue("h_WH_FROM_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_RCV_ISSUE_DATE")) {
						key.seth_RCV_ISSUE_DATE(msgKey.getKeyValue("h_RCV_ISSUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("h_lotCtrl")) {
						key.seth_lotCtrl(msgKey.getKeyValue("h_lotCtrl"));
					}
					if(msgKeyType.containsKeyColumn("LOT_CTRL_FLG_name")) {
						key.setLOT_CTRL_FLG_name(msgKey.getKeyValue("LOT_CTRL_FLG_name"));
					}
					if(msgKeyType.containsKeyColumn("LOT_CTRL_FLG_val")) {
						key.setLOT_CTRL_FLG_val(msgKey.getKeyValue("LOT_CTRL_FLG_val"));
					}
					if(msgKeyType.containsKeyColumn("w_LOT_CTRL_FLG")) {
						key.setw_LOT_CTRL_FLG(msgKey.getKeyValue("w_LOT_CTRL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("w_OPR_INST_CD")) {
						key.setw_OPR_INST_CD(msgKey.getKeyValue("w_OPR_INST_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_PUCH_ODR_CD")) {
						key.setw_PUCH_ODR_CD(msgKey.getKeyValue("w_PUCH_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_ISSUE_INST_CD")) {
						key.setw_ISSUE_INST_CD(msgKey.getKeyValue("w_ISSUE_INST_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_COMPANY_CD")) {
						key.setw_COMPANY_CD(msgKey.getKeyValue("w_COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_PROC_NAME")) {
						key.setw_PROC_NAME(msgKey.getKeyValue("w_PROC_NAME"));
					}
					if(msgKeyType.containsKeyColumn("w_OD_NO")) {
						key.setw_OD_NO(msgKey.getKeyValue("w_OD_NO"));
					}
					if(msgKeyType.containsKeyColumn("w_WH_FROM_CD")) {
						key.setw_WH_FROM_CD(msgKey.getKeyValue("w_WH_FROM_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_PLANT_CD")) {
						key.setw_PLANT_CD(msgKey.getKeyValue("w_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_BUSINESS_OPR_DATE")) {
						key.setw_BUSINESS_OPR_DATE(msgKey.getKeyValue("w_BUSINESS_OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_CMPLT_FLG_val")) {
						key.setISSUE_CMPLT_FLG_val(new Integer(msgKey.getKeyValue("ISSUE_CMPLT_FLG_val")));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_CMPLT_FLG_name")) {
						key.setISSUE_CMPLT_FLG_name(msgKey.getKeyValue("ISSUE_CMPLT_FLG_name"));
					}
					if(msgKeyType.containsKeyColumn("CONS_TYP_val")) {
						key.setCONS_TYP_val(new Integer(msgKey.getKeyValue("CONS_TYP_val")));
					}
					if(msgKeyType.containsKeyColumn("CONS_TYP_name")) {
						key.setCONS_TYP_name(msgKey.getKeyValue("CONS_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_INST_CD")) {
						key.setISSUE_INST_CD(msgKey.getKeyValue("ISSUE_INST_CD"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_CD")) {
						key.setJOB_ODR_CD(msgKey.getKeyValue("JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_DETAIL_NO")) {
						key.setJOB_ODR_DETAIL_NO(new Integer(msgKey.getKeyValue("JOB_ODR_DETAIL_NO")));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_NAME")) {
						key.setITEM_NAME(msgKey.getKeyValue("ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_INST_QTY")) {
						key.setISSUE_INST_QTY(msgKey.getKeyValue("ISSUE_INST_QTY"));
					}
					if(msgKeyType.containsKeyColumn("TOTAL_ISSUE_QTY")) {
						key.setTOTAL_ISSUE_QTY(msgKey.getKeyValue("TOTAL_ISSUE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("SCDL_ISSUE_DATE")) {
						key.setSCDL_ISSUE_DATE(msgKey.getKeyValue("SCDL_ISSUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_CMPLT_DATE")) {
						key.setISSUE_CMPLT_DATE(msgKey.getKeyValue("ISSUE_CMPLT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_CMPLT_FLG")) {
						key.setISSUE_CMPLT_FLG(new Integer(msgKey.getKeyValue("ISSUE_CMPLT_FLG")));
					}
					if(msgKeyType.containsKeyColumn("WH_CD")) {
						key.setWH_CD(msgKey.getKeyValue("WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("WH_NAME")) {
						key.setWH_NAME(msgKey.getKeyValue("WH_NAME"));
					}
					if(msgKeyType.containsKeyColumn("w_OPR_INST_CD_item")) {
						key.setw_OPR_INST_CD_item(msgKey.getKeyValue("w_OPR_INST_CD_item"));
					}
					if(msgKeyType.containsKeyColumn("w_OPR_INST_CD_job")) {
						key.setw_OPR_INST_CD_job(msgKey.getKeyValue("w_OPR_INST_CD_job"));
					}
					if(msgKeyType.containsKeyColumn("WS_CD")) {
						key.setWS_CD(msgKey.getKeyValue("WS_CD"));
					}
					if(msgKeyType.containsKeyColumn("WS_NAME")) {
						key.setWS_NAME(msgKey.getKeyValue("WS_NAME"));
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
					if(msgKeyType.containsKeyColumn("VEND_CD")) {
						key.setVEND_CD(msgKey.getKeyValue("VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("VEND_ANAME")) {
						key.setVEND_ANAME(msgKey.getKeyValue("VEND_ANAME"));
					}
					if(msgKeyType.containsKeyColumn("CONS_TYP")) {
						key.setCONS_TYP(new Integer(msgKey.getKeyValue("CONS_TYP")));
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
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP")) {
						key.setMRP_ODR_TYP(msgKey.getKeyValue("MRP_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("h_ISSUE_TYP")) {
						key.seth_ISSUE_TYP(msgKey.getKeyValue("h_ISSUE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("LOT_CTRL_FLG")) {
						key.setLOT_CTRL_FLG(msgKey.getKeyValue("LOT_CTRL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("w_RCV_ISSUE_CTRL_CD")) {
						key.setw_RCV_ISSUE_CTRL_CD(msgKey.getKeyValue("w_RCV_ISSUE_CTRL_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_RCV_ISSUE_TYP")) {
						key.setw_RCV_ISSUE_TYP(new Integer(msgKey.getKeyValue("w_RCV_ISSUE_TYP")));
					}
					if(msgKeyType.containsKeyColumn("w_WH_CD")) {
						key.setw_WH_CD(msgKey.getKeyValue("w_WH_CD"));
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
					if(msgKeyType.containsKeyColumn("w_STOCK_UPD_TYP")) {
						key.setw_STOCK_UPD_TYP(new Integer(msgKey.getKeyValue("w_STOCK_UPD_TYP")));
					}
					if(msgKeyType.containsKeyColumn("VEND_LOT_NO")) {
						key.setVEND_LOT_NO(msgKey.getKeyValue("VEND_LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_COMMENT")) {
						key.setRCV_ISSUE_COMMENT(msgKey.getKeyValue("RCV_ISSUE_COMMENT"));
					}
					if(msgKeyType.containsKeyColumn("w_LOT_NO")) {
						key.setw_LOT_NO(msgKey.getKeyValue("w_LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("w_WH_NAME")) {
						key.setw_WH_NAME(msgKey.getKeyValue("w_WH_NAME"));
					}
					if(msgKeyType.containsKeyColumn("w_PLANT_CD_check")) {
						key.setw_PLANT_CD_check(msgKey.getKeyValue("w_PLANT_CD_check"));
					}
					if(msgKeyType.containsKeyColumn("w_WH_TYP")) {
						key.setw_WH_TYP(new Integer(msgKey.getKeyValue("w_WH_TYP")));
					}
					if(msgKeyType.containsKeyColumn("w_MRP_FLG")) {
						key.setw_MRP_FLG(new Integer(msgKey.getKeyValue("w_MRP_FLG")));
					}
					if(msgKeyType.containsKeyColumn("w_STOCK_ON_HAND_QTY")) {
						key.setw_STOCK_ON_HAND_QTY(msgKey.getKeyValue("w_STOCK_ON_HAND_QTY"));
					}
					if(msgKeyType.containsKeyColumn("SAVE_JOB_ODR_CD")) {
						key.setSAVE_JOB_ODR_CD(msgKey.getKeyValue("SAVE_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("THIS_MONTH")) {
						key.setTHIS_MONTH(msgKey.getKeyValue("THIS_MONTH"));
					}
					if(msgKeyType.containsKeyColumn("INSTALL_FLG")) {
						key.setINSTALL_FLG(msgKey.getKeyValue("INSTALL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("ONEROUS_CONS_NO")) {
						key.setONEROUS_CONS_NO(msgKey.getKeyValue("ONEROUS_CONS_NO"));
					}
					if(msgKeyType.containsKeyColumn("COMPANY_CD")) {
						key.setCOMPANY_CD(msgKey.getKeyValue("COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_COST")) {
						key.setUNIT_COST(msgKey.getKeyValue("UNIT_COST"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_COST_TYP")) {
						key.setUNIT_COST_TYP(msgKey.getKeyValue("UNIT_COST_TYP"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_CTRL_CD")) {
						key.setRCV_ISSUE_CTRL_CD(msgKey.getKeyValue("RCV_ISSUE_CTRL_CD"));
					}
					if(msgKeyType.containsKeyColumn("RETURNED_CAUSE_CD")) {
						key.setRETURNED_CAUSE_CD(msgKey.getKeyValue("RETURNED_CAUSE_CD"));
					}
					if(msgKeyType.containsKeyColumn("ONEROUS_FLG")) {
						key.setONEROUS_FLG(msgKey.getKeyValue("ONEROUS_FLG"));
					}
					if(msgKeyType.containsKeyColumn("PARAM_RESULT")) {
						key.setPARAM_RESULT(msgKey.getKeyValue("PARAM_RESULT"));
					}
					if(msgKeyType.containsKeyColumn("h_Param_Div")) {
						key.seth_Param_Div(msgKey.getKeyValue("h_Param_Div"));
					}
					if(msgKeyType.containsKeyColumn("l_LOT_NO")) {
						key.setl_LOT_NO(msgKey.getKeyValue("l_LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_TOTAL_ISSUE_QTY")) {
						key.setl_TOTAL_ISSUE_QTY(msgKey.getKeyValue("l_TOTAL_ISSUE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_ISSUE_DATE")) {
						key.setl_ISSUE_DATE(msgKey.getKeyValue("l_ISSUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_STOCK_ON_HAND_QTY")) {
						key.setl_STOCK_ON_HAND_QTY(msgKey.getKeyValue("l_STOCK_ON_HAND_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_DEFECT_QTY")) {
						key.setl_DEFECT_QTY(msgKey.getKeyValue("l_DEFECT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_ALLOCABLE_QTY")) {
						key.setl_ALLOCABLE_QTY(msgKey.getKeyValue("l_ALLOCABLE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_EXTERNAL_LOT_NO")) {
						key.setl_EXTERNAL_LOT_NO(msgKey.getKeyValue("l_EXTERNAL_LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_BEST_BEFORE_DATE")) {
						key.setl_BEST_BEFORE_DATE(msgKey.getKeyValue("l_BEST_BEFORE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_PRD_CMPLT_DATE")) {
						key.setl_PRD_CMPLT_DATE(msgKey.getKeyValue("l_PRD_CMPLT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_STOCK_UNIT")) {
						key.setl_STOCK_UNIT(msgKey.getKeyValue("l_STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("BBD_c_FLG")) {
						key.setBBD_c_FLG(msgKey.getKeyValue("BBD_c_FLG"));
					}
					if(msgKeyType.containsKeyColumn("l_COUNT")) {
						key.setl_COUNT(msgKey.getKeyValue("l_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("ROW_COUNT")) {
						key.setROW_COUNT(msgKey.getKeyValue("ROW_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("l_MODIFY_COUNT")) {
						key.setl_MODIFY_COUNT(msgKey.getKeyValue("l_MODIFY_COUNT"));
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
