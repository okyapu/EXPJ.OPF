/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AF0020/src/com/nec/jp/orteus/metamorBase/AF0020/AF0020010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AF0020;

import com.nec.jp.orteus.metamorBase.AF0020.*;
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
//------------------------------------------------------------------------------
import com.nec.jp.orteus.metamorBase.util.AlarmMessage.AlarmMessageException;

import com.nec.jp.orteus.metamorBase.common.CollectNumber.CollectNumber;
import com.nec.jp.orteus.metamorBase.common08.LotCtrl.LotCtrl;

import com.nec.jp.orteus.expj.pr.rcvissue.process.IssueProcess;
import com.nec.jp.orteus.expj.pr.rcvissue.process.RcvProcess;
import com.nec.jp.orteus.expj.util.Calculate;

import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.math.BigDecimal;

import com.nec.jp.orteus.expj.pr.rcvissue.common.UpdateInfo;
import com.nec.jp.orteus.expj.pr.rcvissue.process.IssueComplete;
import com.nec.jp.orteus.expj.pr.rcvissue.process.IssueRemain;
import com.nec.jp.orteus.expj.pr.rcvissue.process.IssueInstStruct;
import com.nec.jp.orteus.expj.pr.rcvissue.process.ValidateWh;
import com.nec.jp.orteus.expj.pr.rcvissue.util.StringUtil;
import com.nec.jp.orteus.expj.pr.rcvissue.process.LumpIssue;
import com.nec.jp.orteus.expj.pr.rcvissue.process.WhAutoIssueProc;
import com.nec.jp.orteus.expj.util.SystemInformation;
import com.nec.jp.orteus.expj.pr.rcvissue.common.RcvIssueConst;
import com.nec.jp.orteus.expj.pr.rcvissue.process.JobOdrAlc;
//------------------------------------------------------------------------------
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AF0020010Control
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
	public AF0020010Struct getListvalue(int x) { return (AF0020010Struct)(this.list.get(x)); }	// リストの値を返します。
	public AF0020010Struct getStruct() { return this.struct; }	// Structを返します。
	public AF0020010Struct createStruct() { return new AF0020010Struct(); }	// 新しいStructを作って返します。
	public void setStruct(Object structname) { this.struct.setStruct((AF0020010Struct)structname); }	// Structをセットします。
//	public void initializeStruct() { this.struct.initialize(); }	// Structの値を初期化します。

	// CSV出力用リスト
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }

	private boolean info_errmessage = false;
//-------------------------------------------------------------------------
	/** 画面共通定義取得クラス */
	ScreenParam _scParam = sp;

	/*会社コード*/
	public String _company_cd = null;
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


//---------- キー情報の退避処理 ---------------------------------------------------

	/** キー情報保持の為のStruct */
	private AF0020010Struct _keyStruct = new AF0020010Struct();

	/** キー情報Structの取得 */
	public AF0020010Struct getKeyStruct(){ return _keyStruct; }
	
	/** キー情報Structの設定 */
	public void setKeyStruct(AF0020010Struct struct){ _keyStruct.copy(struct); }


//---------- 親子画面関連の処理 -------------------------------------------

	// 行修正が選択された明細行の行NOの値
	private Integer _ModifyCnt = null;
	
	/** ラジオボタンの値の取得
	 * @return ラジオボタンの値
	*/
	public Integer getr_MODIFY_CHOICE(){ return _ModifyCnt; }
	
	/** ラジオボタンの値の設定
	 * @param ラジオボタンの値
	*/
	public void setr_MODIFY_CHOICE(Integer no){ _ModifyCnt = no; }


//---------- 親画面の更新処理 -------------------------------------------

	// 明細行全件のチェックボックスの値
	private List _EntryList = null;
	public List getEntryList() { return _EntryList; }
	public void setEntryList(List listname) { _EntryList = listname; }

//	---------- サブ２画面用LIST -------------------------------------------

	/** 出庫実績明細一覧 */
	private List issueList = new ArrayList();
	
	/** 
	 * 出庫実績明細一覧の取得
	 * @return 出庫実績明細一覧
	 */
	public List getIssueList() {
		return this.issueList;
	}
	
	/**
	 * 出庫実績明細一覧のサイズの取得
	 * @return 出庫実績明細一覧のサイズ
	 */
	public int getIssueListsize() {
		int nret = 0;
		if( this.issueList != null ) {
			nret = this.issueList.size();
		}
		return nret;
	}

//---------- コンボボックスデータ取得関連の処理 -------------------------------

	/** 出庫完了フラグ **/
	ComboStruct _w_ISSUE_CMPLT_FLG = null;

	/** 出庫完了フラグ設定
	 * @param コンボボックスデータ
	*/
	public void setw_ISSUE_CMPLT_FLG_comb(ComboStruct combo){ _w_ISSUE_CMPLT_FLG = combo; }

	/** 出庫完了フラグ取得
	 * @return 出庫完了フラグのコンボボックスデータ
	*/
	public ComboStruct getw_ISSUE_CMPLT_FLG_comb(){ return _w_ISSUE_CMPLT_FLG; }

	/** ロット管理フラグ **/
	ComboStruct _LOT_CTRL_FLG = null;

	/** ロット管理フラグ設定
	 * @param コンボボックスデータ
	*/
	public void setw_LOT_CTRL_FLG_comb(ComboStruct combo){ _LOT_CTRL_FLG = combo; }

	/** ロット管理フラグ取得
	 * @return ロット管理フラグのコンボボックスデータ
	*/
	public ComboStruct getw_LOT_CTRL_FLG_comb(){ return _LOT_CTRL_FLG; }

	
	/** 支給区分 **/
	ComboStruct _CONS_TYP = null;

	/** 支給区分設定
	 * @param コンボボックスデータ
	*/
	public void setCONS_TYP_comb(ComboStruct combo){ _CONS_TYP = combo; }

	/** 支給区分取得
	 * @return 支給区分のコンボボックスデータ
	*/
	public ComboStruct getCONS_TYP_comb(){ return _CONS_TYP; }


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

//------------------------------------------------------------------------

	/** ユーザ定義の初期化済フラグ */
	private boolean _usersIntialized = false;

	/**
	 * ユーザ定義 初期化処理
	 * @throws FoundationException 
	 * @throws BusinessProcessException 
	 */
	private void usersInitialize() throws BusinessProcessException, FoundationException
	{
		// モード設定
		setReadStatus(INITIAL);

		if(_usersIntialized) return;
		setComboData();
		
		// システム導入フラグ取得
		boolean sys_lot_ctrl;
		try {
			sys_lot_ctrl = LotCtrl.checkLotCtrl(conn);
			if(sys_lot_ctrl == true){
				struct.seth_SYS_LOT_CTRL_FLG("true");
				// システムパラメータLOT_CTRL_FLAG取得
				String LOT_CTRL_FLAG = getSysParameter("LOT_CTRL_FLAG");
				if(LOT_CTRL_FLAG != null && LOT_CTRL_FLAG.equals("1")  ){
					struct.setw_LOT_CTRL_FLG("1");
				}else{
					struct.setw_LOT_CTRL_FLG("0");
				}
			}else{
				struct.seth_SYS_LOT_CTRL_FLG("false");
				struct.setw_LOT_CTRL_FLG("0");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		_usersIntialized = true;
		return ;
	}

	/**
	 * コンボボックスの中身を取得します。
	 *
	 */
	 private void setComboData() throws ExpjException
	 {
		struct.setList_w_ISSUE_CMPLT_FLG_val(_w_ISSUE_CMPLT_FLG.getValList());
		struct.setList_w_ISSUE_CMPLT_FLG_name(_w_ISSUE_CMPLT_FLG.getExplanList());
		
		struct.setList_CONS_TYP_val(_CONS_TYP.getValList());
		struct.setList_CONS_TYP_name(_CONS_TYP.getExplanList());
		
		struct.setList_w_LOT_CTRL_FLG_val(_LOT_CTRL_FLG.getValList());
		struct.setList_w_LOT_CTRL_FLG_name(_LOT_CTRL_FLG.getExplanList());
	}

//------------------------------------------------------------------------
	


//------------------------------------------------------------------------
	/**
	 * 支給区分フラグの表示を設定
	 * @param s フラグの値が設定されている情報
	 */
	private void setConsTypeValue(AF0020010Struct s)
	{
		s.setCONS_NAME(getTypeName(_CONS_TYP,s.getCONS_TYP()));
	}

	/**
	 * 区分名取得
	 * @param comboStruct 区分情報リスト
	 * @param prmType 区分コード
	 * @return 区分名称。該当するデータがなかった場合は区分コードを返す
	 */
	private String getTypeName(ComboStruct comboStruct, String prmType)
	{
		if(comboStruct == null || prmType == null)  return null;
		String strTyp = prmType;
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
	 * 業務ロジックのエラーメッセージ設定処理を切り出して関数化
	 * @param code メッセージコード
	 */
	private void setErrorMessage(String code) {
		ExpjMessage emsg = new ExpjMessage(code);
		msgStruct.addError(emsg);
		sysLog.warning(emsg, sysUSER_CD);
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
	 * 警告メッセージ設定
	 * @param code メッセージ番号
	 */
	private void setWarningMessage(String code) {
		ExpjMessage emsg = new ExpjMessage(code);
		msgStruct.addWarn(emsg);
		sysLog.info(emsg, getsysUSER_CD());
	}
	
	/**
	 * 警告メッセージ設定
	 * @param code メッセージ番号
	 * @param value1 置換文字列１
	 */
	private void setWarningMessage(String code, String value1) {
		ExpjMessage emsg = new ExpjMessage(code, value1);
		msgStruct.addWarn(emsg);
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
	 * ログメッセージ設定
	 * @param メッセージ番号
	 * @param 出力メッセージ
	 */
	private void setSyslogConfig(String message)
	{
		ExpjMessage emsg = new ExpjMessage( "ZZ01006", message );
		sysLog.config(emsg, getsysUSER_CD());
	}


//---------- 出庫処理ＤＢ登録処理（親画面、子画面で共通使用の為）） --------------------
	/**
	 * 親画面の登録ボタンと子画面の登録ボタンから共通に呼び出される処理です。
	 *
	 * @return (true:正常終了  false:異常終了）
	 */
	private boolean insert_issue_process() throws BusinessProcessException, FoundationException, SQLException
	{
		// ログ出力情報格納用
		String logMessage = "";
		List listMessage = new ArrayList();

		logMessage = "Control : insert_issue_process"
					+ ", T_ISSUE_INST.ISSUE_INST_CD:" + struct.getISSUE_INST_CD();
		setSyslogConfig(logMessage);

			//----------------------------------------------------------
			// 保管区別入出庫（出庫）登録
			//----------------------------------------------------------
			// 入出庫管理番号採番（出庫）
			String ctrlCd = null;
			CollectNumber collect = new CollectNumber(
									CollectNumber.ISSUE_CD, 
									getsysUSER_CD(), 
									this.sp.getProcId(), 
									struct.getw_PLANT_CD());
			try{
				ctrlCd = collect.getNo();
				if(ctrlCd == null){
					ExpjMessage emsg = new ExpjMessage("AF00057");
					throw new FoundationException(
									"AF0020010Control",
									"insert_issue_process()",
									emsg.getMessage(CoreTools.getLocale(this.getsysUSER_CD())) );
				}
			}
			catch(FoundationException ex){
				// 登録処理失敗：入出庫管理番号（出庫）の採番に失敗しました
				logMessage = "T_ISSUE_INST.ISSUE_INST_CD:" + struct.getISSUE_INST_CD();
				setErrorMessage("AF00057", logMessage);
				
				ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
				sysLog.severe(emsg, getsysUSER_CD());
				ExpjException ee = new ExpjException(ex, emsg);
				throw ee;
			}

			// 入出庫管理番号
			struct.setRCV_ISSUE_CTRL_CD(ctrlCd);
			// 出庫保管区
			struct.settmp_WH_CD(struct.getw_WH_CD());
			// 出庫数
			struct.settmp_RCV_ISSUE_QTY(Calculate.multiply(struct.getRCV_ISSUE_QTY(), "-1"));
			// 入出庫完了フラグ
			struct.setRCV_ISSUE_CMPLT_FLG(struct.geth_SHIP_COMPLETE());
			// 入出庫区分（2:出庫）
			struct.setRCV_ISSUE_TYP(new Integer(2));
			// 入出庫発生区分（21:通常出庫）
			struct.setRCV_ISSUE_GNR_TYP(new Integer(21));
			// 在庫更新区分（1:未）
			struct.setSTOCK_UPD_TYP(new Integer(1));
            //会社コード
			if("".equals(struct.getCOMPANY_CD()) || struct.getCOMPANY_CD() == null){
				struct.setCOMPANY_CD(_company_cd);
			}
			logMessage = "T_RCV_ISSUE.RCV_ISSUE_CTRL_CD:" + struct.getRCV_ISSUE_CTRL_CD()
						+ ", T_RCV_ISSUE.JOB_ODR_CD:" + struct.getw_JOB_ODR_CD()
						+ ", T_RCV_ISSUE.ITEM_CD:" + struct.getITEM_CD()
						+ ", T_RCV_ISSUE.WH_CD:" + struct.getw_WH_CD()
						+ ", T_RCV_ISSUE.RCV_ISSUE_DATE:" + struct.getRCV_ISSUE_DATE()
						+ ", T_RCV_ISSUE.RCV_ISSUE_QTY:" + struct.gettmp_RCV_ISSUE_QTY();
			setSyslogConfig(logMessage);
			// 保管区別入出庫（出庫）登録
			entity.minsertSub1T_RCV_ISSUE.create(conn, struct);

			// [出庫処理]呼出し
			IssueProcess issuePrc = new IssueProcess(conn, ctrlCd);
			try{
				if(issuePrc.execProcess() == true){
					// 更新ＯＫ
					logMessage = "Issue Process was Complated!";
					setSyslogConfig(logMessage);
				}
				else {
					// 更新エラー
					logMessage = "Issue Process was Failed...";
					setSyslogConfig(logMessage);
					return false;
				}
			} finally {
				// 更新結果メッセージ表示
				logMessage = "T_ISSUE_INST.ISSUE_INST_CD:" + struct.getISSUE_INST_CD();
				for(int idx = 0; idx < issuePrc.getErrorList().size(); idx++){
					setErrorMessage((String)issuePrc.getErrorList().get(idx) , logMessage);
				}
				for(int idx = 0; idx < issuePrc.getInfoList().size(); idx++){
					setInfoMessage((String)issuePrc.getInfoList().get(idx) , logMessage);
					if(((String)issuePrc.getInfoList().get(idx)).equals("AF60001")){
						info_errmessage = true;
					}
				}
				for(int idx = 0; idx < issuePrc.getWarnList().size(); idx++){
					setWarnMessage((String)issuePrc.getWarnList().get(idx) , logMessage);
				}
			}

			return true;
	}


//---------- 入庫処理ＤＢ登録処理（親画面、子画面で共通使用の為）） --------------------
	/**
	 * 親画面の登録ボタンと子画面の登録ボタンから共通に呼び出される処理です。
	 *
	 * @return (true:正常終了  false:異常終了）
	 */
	private boolean insert_rcv_process() throws BusinessProcessException, FoundationException, SQLException
	{
		// ログ出力情報格納用
		String logMessage = "";
		List listMessage = new ArrayList();

		logMessage = "Control : insert_rcv_process"
					+ ", T_ISSUE_INST.ISSUE_INST_CD:" + struct.getISSUE_INST_CD();
		setSyslogConfig(logMessage);

			//----------------------------------------------------------
			// 有償支給品の場合、有償支給履歴登録
			//----------------------------------------------------------
			// 出庫指示の支給区分が1(有償支給)の時
			if ("1".equals(struct.getCONS_TYP())) {

				logMessage = "M_CONS_UNIT_COST.ITEM_CD:" +  struct.getITEM_CD()
							+ ", M_CONS_UNIT_COST.VEND_CD:" +  struct.getVEND_CD()
							+ ", M_CONS_UNIT_COST.COMPANY_CD:" +  struct.getCOMPANY_CD()
							+ ", T_ISSUE_INST.EFF_PHASE_IN_DATE:" + struct.getRCV_ISSUE_DATE();
				setSyslogConfig(logMessage);
				//支給単価の取得
				List tmpList = entity.mselectM_COST.read(conn, struct);
				if(tmpList.size() <= 0) {
					struct.setUNIT_COST(new String("0"));
					struct.setUNIT_COST_TYP(new Integer(1));
				}
				else{
					AF0020010Struct workStruct = (AF0020010Struct)tmpList.get(0);
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
						struct.setUNIT_COST_TYP(new Integer(1));
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
										"AF0020010Control",
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
				struct.settmp_RCV_ISSUE_QTY(struct.getRCV_ISSUE_QTY());

				// 出庫指示番号
				struct.setISSUE_INST_CD(struct.getISSUE_INST_CD());
				// 返品先保管区コード
				struct.setRETURNED_WH_CD("");

				logMessage = "T_PAST_ONEROUS_CONS.ONEROUS_CONS_NO:" + struct.getONEROUS_CONS_NO()
							+ ",T_PAST_ONEROUS_CONS.JOB_ODR_CD:" + struct.getw_JOB_ODR_CD()
							+ ", T_PAST_ONEROUS_CONS.ITEM_CD:" + struct.getITEM_CD()
							+ ", T_PAST_ONEROUS_CONS.VEND_CD:" + struct.getVEND_CD()
							+ ", T_PAST_ONEROUS_CONS.ISSUE_DATE:" + struct.getRCV_ISSUE_DATE()
							+ ", T_PAST_ONEROUS_CONS.ISSUE_QTY:" + struct.gettmp_RCV_ISSUE_QTY();
				setSyslogConfig(logMessage);
				// 有償支給履歴登録
				entity.minsertSub1T_PAST_ONEROUS_CONS.create(conn, struct);
			}
			if (struct.getWH_CD() != null && struct.getWH_CD().equals("") == false) {
			//----------------------------------------------------------
			// 保管区別入出庫（入庫）登録
			//----------------------------------------------------------
				// 入出庫管理番号採番（入庫）
				String ctrlCd = null;
				CollectNumber collect = new CollectNumber(
										CollectNumber.ISSUE_CD, 
										getsysUSER_CD(), 
										this.sp.getProcId(), 
										struct.getw_PLANT_CD());
				try{
					ctrlCd = collect.getNo();
					if(ctrlCd == null){
						ExpjMessage emsg = new ExpjMessage("AF00057");
						throw new FoundationException(
										"AF0020010Control",
										"insert_rcv_process()",
										emsg.getMessage(CoreTools.getLocale(this.getsysUSER_CD())) );
					}
				}
				catch(FoundationException ex){
					// 登録処理失敗：入出庫管理番号（入庫）の採番に失敗しました
					logMessage = "T_ISSUE_INST.ISSUE_INST_CD:" + struct.getISSUE_INST_CD();
					setErrorMessage("AF00057", logMessage);
					
					ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
					sysLog.severe(emsg, getsysUSER_CD());
					ExpjException ee = new ExpjException(ex, emsg);
					throw ee;
				}

				// 入出庫管理番号
				struct.setRCV_ISSUE_CTRL_CD(ctrlCd);
				// 入庫保管区
				struct.settmp_WH_CD(struct.getWH_CD());
				// 入庫数
				struct.settmp_RCV_ISSUE_QTY(struct.getRCV_ISSUE_QTY());
				// 入出庫完了フラグ
				struct.setRCV_ISSUE_CMPLT_FLG(struct.geth_SHIP_COMPLETE());
				// 入出庫区分（1:入庫）
				struct.setRCV_ISSUE_TYP(new Integer(1));
				if ("0".equals(struct.getCONS_TYP())) {
					// 入出庫発生区分（61:工程在庫入庫）
					struct.setRCV_ISSUE_GNR_TYP(new Integer(61));
				} else {
					// 入出庫発生区分（81:取引先在庫入庫）
					struct.setRCV_ISSUE_GNR_TYP(new Integer(81));
				}
				// 在庫更新区分（1:未）
				struct.setSTOCK_UPD_TYP(new Integer(1));
	            //会社コード
				if("".equals(struct.getCOMPANY_CD()) || struct.getCOMPANY_CD() == null){
					struct.setCOMPANY_CD(_company_cd);
				}
				logMessage = "T_RCV_ISSUE.RCV_ISSUE_CTRL_CD:" + struct.getRCV_ISSUE_CTRL_CD()
							+ ", T_RCV_ISSUE.JOB_ODR_CD:" + struct.getw_JOB_ODR_CD()
							+ ", T_RCV_ISSUE.ITEM_CD:" + struct.getITEM_CD()
							+ ", T_RCV_ISSUE.WH_CD:" + struct.getWH_CD()
							+ ", T_RCV_ISSUE.RCV_ISSUE_DATE:" + struct.getRCV_ISSUE_DATE()
							+ ", T_RCV_ISSUE.RCV_ISSUE_QTY:" + struct.gettmp_RCV_ISSUE_QTY();
				setSyslogConfig(logMessage);

				// [出庫指示]."製番"を登録するための退避
				String saveJobOdrCd = struct.getw_JOB_ODR_CD();
				struct.setw_JOB_ODR_CD(struct.getJOB_ODR_CD());

				// 保管区別入出庫（入庫）登録
				entity.minsertSub1T_RCV_ISSUE.create(conn, struct);

				// 退避した製番を戻す
				struct.setw_JOB_ODR_CD(saveJobOdrCd);

				// [入庫処理]呼出し
				RcvProcess rcvPrc = new RcvProcess(conn, ctrlCd);
				try{
					if(rcvPrc.execProcess() == true){
						// 更新ＯＫ
						logMessage = "Rcv Process was Complated!";
						setSyslogConfig(logMessage);
					}
					else {
						// 更新エラー
						logMessage = "Rcv Process was Failed...";
						setSyslogConfig(logMessage);
						return false;
					}
				} finally {
					// 更新結果メッセージ表示
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
				}
			}

			return true;
	}


//------------------------------------------------------------------------------
	
	/**
	 * <pre>
	 * 以下の項目の計算処理を行う
	 * ｢品目在庫未引当数｣、｢品目在庫未引当キット数｣、｢個別手配分出庫可能数｣、
	 * ｢個別手配分出庫可能キット数｣、｢引当済未出庫数｣、｢引当済未出庫キット数｣、
	 * ｢今回出庫可能数｣、｢今回出庫可能キット数｣
	 * </pre>
	 */
	private void calcDisplayItem() throws BusinessProcessException, FoundationException, SQLException
	{
		IssueRemain issueRemain = new IssueRemain(conn);
		
		// 品目在庫未引当数のセット
		if(!struct.getc_JOB_ODR().equals("true")){
			if(struct.getMRP_ODR_TYP().equals(AF0020Const._MRP_ODR_JOB_ODR_CD) ||
					struct.getMRP_ODR_TYP().equals(AF0020Const._MRP_ODR_STOCK_ALC_JOB_ODR_CD)){
				struct.setITEM_STOCK_NON_ALC_QTY(
						issueRemain.getFreeStockQtyOfItem(getsysPLANT_CD(),
														  struct.getITEM_CD()).toString());
			}else{
				struct.setITEM_STOCK_NON_ALC_QTY(struct.getw_TOTAL_STOCK_ON_HAND_QTY());
			}
		}
		
		// 個別手配分出庫可能数のセット
		if((struct.getMRP_ODR_TYP().equals(AF0020Const._MRP_ODR_JOB_ODR_CD) ||
				struct.getMRP_ODR_TYP().equals(AF0020Const._MRP_ODR_STOCK_ALC_JOB_ODR_CD)) &&
				struct.getc_JOB_ODR().equals("true") &&
				struct.getJOB_ODR_CD().equals(struct.getw_JOB_ODR_CD())){
			IssueRemain.ResultByOd  re = issueRemain.getRemainQtyByOd(struct.getOD_NO());
			struct.setODR_ISSUE_POSS_QTY(re.remainQty.toString());
		}
		
		// 引当済未出庫数のセット
		if(struct.getMRP_ODR_TYP().equals(AF0020Const._MRP_ODR_JOB_ODR_CD) ||
				struct.getMRP_ODR_TYP().equals(AF0020Const._MRP_ODR_STOCK_ALC_JOB_ODR_CD)){
			if(!struct.getc_JOB_ODR().equals("true")){
				struct.setALC_NOISSUE_QTY(
						issueRemain.getRemainQtyByItem(struct.getOD_NO()).toString());
			}else{
				struct.setALC_NOISSUE_QTY(
						issueRemain.getRemainQtyByJobOdr(struct.getOD_NO(),
														 struct.getw_JOB_ODR_CD(),
														 AF0020Const._JOB_ODR_DETAIL_NO).toString());
			}
		}
		
		// 今回出庫可能数のセット
		if(struct.getMRP_ODR_TYP().equals(AF0020Const._MRP_ODR_JOB_ODR_CD) ||
				struct.getMRP_ODR_TYP().equals(AF0020Const._MRP_ODR_STOCK_ALC_JOB_ODR_CD)){
			if(!struct.getc_JOB_ODR().equals("true")){
				struct.setTHIS_TIME_ISSUE_POSS_QTY(
						Calculate.add(struct.getALC_NOISSUE_QTY(), struct.getITEM_STOCK_NON_ALC_QTY()));
			}else{
				struct.setTHIS_TIME_ISSUE_POSS_QTY(
						Calculate.add(struct.getODR_ISSUE_POSS_QTY(), struct.getALC_NOISSUE_QTY()));
			}
		}else{
			struct.setTHIS_TIME_ISSUE_POSS_QTY(struct.getw_STOCK_ON_HAND_QTY());
		}
	}
	

	/**
	 * システムパラメータ取得
	 */
	private String getSysParameter(String name) throws BusinessProcessException, FoundationException {
		String parameteValue  = null;
		try {
			struct.setSYS_PARAMETER_NAME(name);
			List sysParameterList = entity.mSELECT_SYS_PARAMETER.read(conn, struct);
			if(sysParameterList == null || sysParameterList.isEmpty()) return parameteValue;
			AF0020010Struct sysParameterStruct = (AF0020010Struct) sysParameterList.get(0);
			if(null != sysParameterStruct.getSYS_PARAMETER_VALUE() && !"".equals(sysParameterStruct.getSYS_PARAMETER_VALUE())){
				parameteValue = sysParameterStruct.getSYS_PARAMETER_VALUE();
			}
		}catch(Exception e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			throw new ExpjException(e, emsg);
		}
		return parameteValue;
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
			AF0020010Struct procExecDateStruct = (AF0020010Struct) procExecDateList.get(0);
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
	public void controlselect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0020");
		logger.entering("AF0020010Control"+":USER="+struct.getsUser_ID(),"controlselect");
			//{{user_implement_dev:<controlselect>
		//------------------------------------------------------------------
		// ログ出力情報格納用
		String logMessage = "";
		List listMessage = new ArrayList();

		// 読込成功チェック
		boolean checkSelect = false;		// チェック結果格納
	
		try {

			// キー項目ログ表示
			logMessage = "T_ISSUE_INST.ISSUE_INST_CD:" + struct.getw_ISSUE_INST_CD()
					    + ", T_ISSUE_INST.PUCH_ODR_CD:" + struct.getw_PUCH_ODR_CD()
			            + ", T_ISSUE_INST.WS_CD:" + struct.getw_WS_CD()
						+ ", T_ISSUE_INST.VEND_CD:" + struct.getw_VEND_CD()
						+ ", T_ISSUE_INST.OPR_INST_CD:" + struct.getw_OPR_INST_CD()
						+ ", T_ISSUE_INST.ISSUE_CMPLT_FLG:" + struct.getw_ISSUE_CMPLT_FLG()
						+ ", M_ITEM.LOT_CTRL_FLG:" + struct.getw_LOT_CTRL_FLG()
						+ ", T_ISSUE_INST.PLANT_CD:" + struct.getw_PLANT_CD();
			setSyslogConfig(logMessage);
			//リストクリア
			if(list != null){
				list.clear();
			}

			// 画面クリア
			struct.setw_WS_NAME((String)null);
			struct.setw_VEND_NAME((String)null);

			// エラーチェック
			boolean check = true;		// チェック結果格納

			//作業区コードが指定された場合
			if(("1").equals(struct.getw_CHOICE())) {
				//作業区コードの存在チェック
				List tmpList = entity.mcheckM_WS.read(conn, struct);
				if(tmpList.size() <= 0) {
					// 読込処理失敗：作業区コードが存在しません
					logMessage = "M_WS.WS_CD:" + struct.getw_WS_CD();
					setErrorMessage("AF00002", logMessage);
					check = false;
				}
				else{
					AF0020010Struct checkStruct = (AF0020010Struct)tmpList.get(0);
					struct.setw_WS_NAME(checkStruct.getw_WS_NAME());
					//作業区.工場コード ≠ ログイン利用者工場コード チェック
					if((checkStruct.getWS_PLANT_CD().equals(struct.getw_PLANT_CD())) == false){
						// 読込処理失敗：作業区コードは他の工場のデータなので指定できません
						listMessage.add("M_WS.WS_CD:" + struct.getw_WS_CD());
						listMessage.add("M_WS.PLANT_CD:" + checkStruct.getWS_PLANT_CD());
						setErrorMessage("AF00003", listMessage);
						listMessage.clear();
						check = false;
					}
				}
			}

			//取引先コードが指定された場合
			if(("2").equals(struct.getw_CHOICE())) {
				//取引先コードの存在チェック
				List tmpList = entity.mcheckM_VEND.read(conn, struct);
				if(tmpList.size() <= 0) {
					// 読込処理失敗：取引先コードが存在しません
					logMessage = "M_VEND.VEND_CD:" + struct.getw_VEND_CD();
					setErrorMessage("AF00005", logMessage);
					check = false;
				}
				else{
					AF0020010Struct checkStruct = (AF0020010Struct)tmpList.get(0);
					struct.setw_VEND_NAME(checkStruct.getw_VEND_NAME());
				}
			}

			if(("3").equals(struct.getw_CHOICE())) {

				// 作業伝票の存在チェック
				List tmpList = entity.mselectT_OPR_INST_SLIP.read(conn, struct);
				if(tmpList.size() <= 0) {
					// 読込処理失敗：作業指示番号が作業伝票に存在しません
					logMessage = "T_OPR_INST_SLIP.OPR_INST_CD:" + struct.getOPR_INST_CD();
					setErrorMessage("ZZ06001", logMessage);
					check = false;
				}
				else{
					AF0020010Struct tmpStruct = (AF0020010Struct)tmpList.get(0);
					//作業伝票.工場コード ≠ ログイン利用者工場コード チェック
					if((tmpStruct.getPLANT_CD().equals(struct.getw_PLANT_CD())) == false){
						// 読込処理失敗：作業指示番号は他の工場のデータなので指定できません
						listMessage.add("T_OPR_INST_SLIP.OPR_INST_CD:" + struct.getOPR_INST_CD());
						listMessage.add("T_OPR_INST_SLIP.PLANT_CD:" + tmpStruct.getPLANT_CD());
						setErrorMessage("ZZ06001", listMessage);
						listMessage.clear();
						check = false;
					}
					else{
						if(("1").equals(tmpStruct.getOPR_INST_CD_GNR_TYP()) == true){
							// 品目別仕掛 読込
							List workList = entity.mselectT_WORK_IN_PROC_BY_ITEM.read(conn, struct);
							if(workList.size() <= 0) {
								// 読込処理失敗：作業指示番号が品目別仕掛に存在しません.
								logMessage = "T_WORK_IN_PROC_BY_ITEM.OPR_INST_CD:" + struct.getOPR_INST_CD();
								setErrorMessage("ZZ06001", logMessage);
								check = false;
							}
							else{
								AF0020010Struct workStruct = (AF0020010Struct)workList.get(0);
								struct.sett_WORK_IN_PROC_CD("");
								struct.sett_WORK_ODR_CD(workStruct.gett_WORK_ODR_CD());
							}
						}
						else{
							// 作業系列別仕掛 読込
							List workList = entity.mselectT_WORK_IN_PROC_BY_PROC.read(conn, struct);
							if(workList.size() <= 0) {
								// 読込処理失敗：作業指示番号が作業系列別仕掛に存在しません
								logMessage = "T_WORK_IN_PROC_BY_PROC.OPR_INST_CD:" + struct.getOPR_INST_CD();
								setErrorMessage("ZZ06001", logMessage);
								check = false;
							}
							else{
								AF0020010Struct workStruct = (AF0020010Struct)workList.get(0);
								struct.sett_WORK_ODR_CD(workStruct.gett_WORK_ODR_CD());
								struct.sett_WORK_IN_PROC_CD(workStruct.gett_WORK_IN_PROC_CD());
							}
						} 
					}
				}
			} else {
				struct.sett_WORK_IN_PROC_CD("");
				struct.sett_WORK_ODR_CD("");
			}

			// 買掛管理がインストールされている場合、当年月度を取得
			AF0020010Struct readStruct = new AF0020010Struct();
			List installOptionsList = entity.mSYS_INSTALL_OPTIONS.read(conn, readStruct);
			if (installOptionsList.size() > 0) {
				AF0020010Struct installOptionsStruct = (AF0020010Struct)installOptionsList.get(0);
				struct.setINSTALL_FLG(installOptionsStruct.getINSTALL_FLG());
			} else {
				struct.setINSTALL_FLG("0");
			}
			
			// 買掛管理がインストールされている場合、当年月度を取得
			if ("1".equals(struct.getINSTALL_FLG())) {
				List debtCtrlList = entity.mSYS_DEBT_CTRL.read(conn, readStruct);
				if (debtCtrlList.size() > 0) {
					AF0020010Struct debtCtrlStruct = (AF0020010Struct)debtCtrlList.get(0);
					struct.setTHIS_MONTH(debtCtrlStruct.getTHIS_MONTH());
				} else {
					setErrorMessage("AF00142");
					check = false;
				}
				
				// 業務運用日の取得
				readStruct = new AF0020010Struct();
				readStruct.setw_PLANT_CD(sysPLANT_CD);
				List dateCtrlList = entity.mselectSYS_DATE_CTRL.read(conn, readStruct);
				if(dateCtrlList.size() <= 0) {
					// 行修正処理失敗：業務運用日が存在しません
					logMessage = "SYS_DATE_CTRL.PLANT_CD:" + readStruct.getw_PLANT_CD();
					setErrorMessage("AF00056", logMessage);
					check = false;
				}
				else{
					AF0020010Struct workStruct = (AF0020010Struct)dateCtrlList.get(0);
					struct.setBUSINESS_OPR_DATE(workStruct.getBUSINESS_OPR_DATE());
				}
			}
			if(check == true){
				// 読込キー項目ログ表示
				logMessage = "T_ISSUE_INST.ISSUE_INST_CD:" + struct.getw_ISSUE_INST_CD()
				            + ", T_ISSUE_INST.PUCH_ODR_CD:" + struct.getw_PUCH_ODR_CD()
							+ ", T_ISSUE_INST.WS_CD:" + struct.getw_WS_CD()
							+ ", T_ISSUE_INST.VEND_CD:" + struct.getw_VEND_CD()
							+ ", T_ISSUE_INST.OPR_INST_CD:" + struct.getw_OPR_INST_CD()
							+ ", T_ISSUE_INST.ISSUE_CMPLT_FLG:" + struct.getw_ISSUE_CMPLT_FLG()
							+ ", M_ITEM.LOT_CTRL_FLG:" + struct.getw_LOT_CTRL_FLG()
							+ ", T_ISSUE_INST.PLANT_CD:" +  struct.getw_PLANT_CD();
				
				if("false".equals(struct.geth_SYS_LOT_CTRL_FLG())){
					struct.setw_LOT_CTRL_FLG(null);
				}
				// 最大表示行数
				ScreenParam sp = new ScreenParam(this.getClass());
				int maxLine = sp.getMaxLine(conn, 10);
				if (maxLine != 0)
					struct.setROW_COUNT(String.valueOf(maxLine));
				else
					struct.setROW_COUNT(null);
				
				
				// データ読込
				list = entity.mselectCnt.read(conn, struct);
				long rowCount = Long.parseLong(((AF0020010Struct) list
						.get(0)).getl_COUNT());
				
				// 検索結果0件の場合
				if(rowCount== 0){
					// 読込処理失敗：検索結果が0件です
					setReadStatus(NOT_FOUND);
					listMessage.add("T_ISSUE_INST.ISSUE_INST_CD:" + struct.getw_ISSUE_INST_CD());
                    listMessage.add("T_ISSUE_INST.PUCH_ODR_CD:" + struct.getw_PUCH_ODR_CD());
					listMessage.add("T_ISSUE_INST.WS_CD:" + struct.getw_WS_CD());
					listMessage.add("T_ISSUE_INST.VEND_CD:" + struct.getw_VEND_CD());
					listMessage.add("T_ISSUE_INST.OPR_INST_CD:" + struct.getw_OPR_INST_CD());
					listMessage.add("T_ISSUE_INST.ISSUE_CMPLT_FLG:" + struct.getw_ISSUE_CMPLT_FLG());
					listMessage.add("M_ITEM.LOT_CTRL_FLG:" + struct.getw_LOT_CTRL_FLG());
					listMessage.add("T_ISSUE_INST.PLANT_CD:" +  struct.getw_PLANT_CD());
					setErrorMessage("ZZ06001", listMessage);
					listMessage.clear();
					if(list!=null &&list.size()>0){
						list.clear();
					}
					return;
				} else {
					// 表示最大行数制限処理
					if (maxLine != 0 && rowCount == maxLine + 1) {
						setReadStatus(TOO_MANY);
						if(list!=null &&list.size()>0){
							list.clear();
						}
						logMessage = "";
						setErrorMessage("ZZ01115", "", "" + maxLine);
						return;
					} else {
						// データ読込
						list = entity.mselect.read(conn, struct);
						for( int i=0; i<list.size(); i++ ){
							AF0020010Struct issueStruct = (AF0020010Struct)list.get(i);
							// 支給区分に表示する表示名の設定
							setConsTypeValue(issueStruct);

							// 検索結果リストに追加
							list.set(i, issueStruct);

							// 出庫残数が0より小さければ0をセット
							if( Calculate.compare(issueStruct.getw_SHIP_REMAIN_QTY(),"0") < 0 ){
								issueStruct.setw_SHIP_REMAIN_QTY("0");
							}

							// 作業指示番号のセット
							if( issueStruct.getWORK_IN_PROC_CD() == null ||
								"".equals(issueStruct.getWORK_IN_PROC_CD()) ){
								issueStruct.setOPR_INST_CD(issueStruct.getOPR_INST_CD_item());
							} else {
								issueStruct.setOPR_INST_CD(issueStruct.getOPR_INST_CD_proc());
							}
						}

						checkSelect = true;
					}
				}
			}
		}catch(SQLException e){
			setSqlExceptionMsg(e);

		}finally{
			// モード設定
			if(checkSelect == true){
				setReadStatus(NORMAL);
			}
		}
		//------------------------------------------------------------------
                //}}user_implement_dev:<controlselect>
		logger.exiting("AF0020010Control"+":USER="+struct.getsUser_ID(),"controlselect");

		return;
	}

	/**
	 * 行修正ボタン押下時に実行される処理です。
	 *
	 */
	public void controlmodify() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0020");
		logger.entering("AF0020010Control"+":USER="+struct.getsUser_ID(),"controlmodify");
			//{{user_implement_dev:<controlmodify>
		//------------------------------------------------------------------
		// ログ出力情報格納用
		String logMessage = "";
		List listMessage = new ArrayList();

		boolean check = true;		// チェック結果格納

		try {
			if("false".equals(struct.geth_SYS_LOT_CTRL_FLG()) || ("true".equals(struct.geth_SYS_LOT_CTRL_FLG()) && struct.getw_LOT_CTRL_FLG().equals("0"))){
//				 キー項目ログ表示
				logMessage = "T_ISSUE_INST.ISSUE_INST_CD:" + struct.getISSUE_INST_CD();
				setSyslogConfig(logMessage);
				// 選択された明細の最新データを出庫指示番号指定で読込（最新の実績累計数を表示するため）
				// （動的SQLのため、出庫指示番号以外はクリアして読込む）
				struct.setw_ISSUE_INST_CD(struct.getISSUE_INST_CD());
				struct.setw_WS_CD((String)null);
				struct.setw_VEND_CD((String)null);
				struct.setw_ISSUE_CMPLT_FLG((String)null);
				struct.setw_LOT_CTRL_FLG((String)null);
				struct.setw_PLANT_CD((String)null);
				struct.setw_PUCH_ODR_CD((String)null);
				struct.setw_OPR_INST_CD((String)null);
				
				List tmpList = entity.mselect.read(conn, struct);
				if(tmpList.size() <= 0) {
					// 行修正処理失敗：選択された出庫指示データが存在しません
					logMessage = "T_ISSUE_INST.ISSUE_INST_CD:" + struct.getISSUE_INST_CD();
					setErrorMessage("ZZ01101", logMessage);
					check = false;
				}
				else{
					struct.copy((AF0020010Struct)tmpList.get(0));
					// キー項目をセット
					struct.setw_ISSUE_INST_CD(_keyStruct.getw_ISSUE_INST_CD());
					struct.setw_WS_CD(_keyStruct.getw_WS_CD());
					struct.setw_VEND_CD(_keyStruct.getw_VEND_CD());
					struct.setw_ISSUE_CMPLT_FLG(_keyStruct.getw_ISSUE_CMPLT_FLG());
					struct.setw_LOT_CTRL_FLG(_keyStruct.getw_LOT_CTRL_FLG());
					struct.seth_SYS_LOT_CTRL_FLG(_keyStruct.geth_SYS_LOT_CTRL_FLG());
					struct.setw_PLANT_CD(_keyStruct.getw_PLANT_CD());
					struct.setw_PUCH_ODR_CD(_keyStruct.getw_PUCH_ODR_CD());
					struct.setw_OPR_INST_CD(_keyStruct.getw_OPR_INST_CD());				
					struct.setw_CHOICE(_keyStruct.getw_CHOICE());
					// 画面チェック用に出庫先保管区コードを非表示項目に保持
					struct.seth_WH_CD(struct.getWH_CD());
					
					// ＭＲＰ品目の時、所要量にセットされている製番は親の製番なので使わない（nullと扱う）
					if(Calculate.compare(struct.getMRP_ODR_TYP(), "3") > 0){
						struct.setJOB_ODR_CD((String)null);
						struct.setw_JOB_ODR_CD((String)null);
					}
					else{
						struct.setw_JOB_ODR_CD(struct.getJOB_ODR_CD());
					}
					// 子画面の初期値をセット
					struct.setRCV_ISSUE_QTY(new String("0.0"));
					struct.setw_STOCK_ON_HAND_QTY(new String("0.0"));
					struct.setw_TOTAL_STOCK_ON_HAND_QTY(new String("0.0"));
					if(("0").equals(struct.getISSUE_CMPLT_FLG()) == true){
						
						// 完了フラグ＝0:未の場合
						if( Calculate.compare(struct.getw_SHIP_REMAIN_QTY(), "0") > 0 ){
							struct.setRCV_ISSUE_QTY(struct.getw_SHIP_REMAIN_QTY());	// 出庫残数
						}
						struct.seth_SHIP_COMPLETE(new String("1"));				// 完了フラグ
						// 業務運用日の取得
						tmpList = entity.mselectSYS_DATE_CTRL.read(conn, struct);
						if(tmpList.size() <= 0) {
							// 行修正処理失敗：業務運用日が存在しません
							logMessage = "SYS_DATE_CTRL.PLANT_CD:" + struct.getw_PLANT_CD();
							setErrorMessage("AF00056", logMessage);
							check = false;
						}
						else{
							AF0020010Struct workStruct = (AF0020010Struct)tmpList.get(0);
							struct.setBUSINESS_OPR_DATE(workStruct.getBUSINESS_OPR_DATE());
							struct.setRCV_ISSUE_DATE(workStruct.getBUSINESS_OPR_DATE());	// 業務運用日
						}
						
						// 買掛管理がインストールされている場合、当年月度を取得
						AF0020010Struct readStruct = new AF0020010Struct();
						List installOptionsList = entity.mSYS_INSTALL_OPTIONS.read(conn, readStruct);
						if (installOptionsList.size() > 0) {
							AF0020010Struct installOptionsStruct = (AF0020010Struct)installOptionsList.get(0);
							struct.setINSTALL_FLG(installOptionsStruct.getINSTALL_FLG());
						} else {
							struct.setINSTALL_FLG("0");
						}
						
						// 買掛管理がインストールされている場合、当年月度を取得
						if ("1".equals(struct.getINSTALL_FLG())) {
							List debtCtrlList = entity.mSYS_DEBT_CTRL.read(conn, readStruct);
							if (debtCtrlList.size() > 0) {
								AF0020010Struct debtCtrlStruct = (AF0020010Struct)debtCtrlList.get(0);
								struct.setTHIS_MONTH(debtCtrlStruct.getTHIS_MONTH());
							} else {
								setErrorMessage("AF00142");
								check = false;
							}
						}
						// [出庫指示]."工程保管場所コード"がnullでない場合は名称表示
						if (struct.getWH_CD() == null || "".equals(struct.getWH_CD())) {
							AF0020010Struct whStruct = new AF0020010Struct();
							whStruct.settmp_WH_CD(struct.getWH_CD());
							tmpList = entity.mcheckM_WH.read(conn, whStruct);
							if (tmpList.size() > 0) {
								AF0020010Struct workStruct = (AF0020010Struct)tmpList.get(0);
								struct.setWH_NAME(workStruct.getWH_NAME());
							}
						}
					}
					else{
						// 完了フラグ＝1:完了の場合
						struct.setRCV_ISSUE_QTY(struct.getTOTAL_ISSUE_QTY());	// 出庫累計数
						struct.setRCV_ISSUE_DATE(struct.getISSUE_CMPLT_DATE());	// 出庫完了日
						struct.seth_SHIP_COMPLETE(struct.getISSUE_CMPLT_FLG());	// 完了フラグ
						
						// 完了通知メッセージ出力(業務ワーニング)
						setWarningMessage("AF00132");
					}

					// 在庫累計数のセット（倉庫在庫だけ集計）
					if(struct.getw_JOB_ODR_CD() == null || ("").equals(struct.getw_JOB_ODR_CD()) == true){
						// 製番がnullの時、品目在庫 読込
						tmpList = entity.mselectSub1_ITEM_STOCK.read(conn, struct);
					}
					else{
						// 製番がnullでない時、製番在庫 読込
						tmpList = entity.mselectSub1_ODR_STOCK.read(conn, struct);
					}
					if(tmpList.size() > 0){
						AF0020010Struct tmpStruct = (AF0020010Struct)tmpList.get(0);
						struct.setw_TOTAL_STOCK_ON_HAND_QTY(tmpStruct.getw_TOTAL_STOCK_ON_HAND_QTY());
					}

					// 支給区分に表示する表示名の設定
					setConsTypeValue(struct);
				}
			}else{
//				 キー項目ログ表示
				logMessage = "T_ISSUE_INST.ISSUE_INST_CD:" + struct.getISSUE_INST_CD();
				setSyslogConfig(logMessage);

				// 選択された明細の最新データを出庫指示番号指定で読込（最新の実績累計数を表示するため）
				// （動的SQLのため、出庫指示番号以外はクリアして読込む）
				struct.setw_ISSUE_INST_CD(struct.getISSUE_INST_CD());
				struct.setw_WS_CD((String)null);
				struct.setw_VEND_CD((String)null);
				struct.setw_ISSUE_CMPLT_FLG((String)null);
				struct.setw_LOT_CTRL_FLG((String)null);
				struct.setw_PLANT_CD((String)null);
				List tmpList = entity.mselect.read(conn, struct);
				if(tmpList.size() <= 0) {
					// 行修正処理失敗：選択された出庫指示データが存在しません
					logMessage = "T_ISSUE_INST.ISSUE_INST_CD:" + struct.getISSUE_INST_CD();
					setErrorMessage("ZZ01101", logMessage);
					check = false;
				}
				else{
					struct.copy((AF0020010Struct)tmpList.get(0));
					// キー項目をセット
					struct.setw_ISSUE_INST_CD(_keyStruct.getw_ISSUE_INST_CD());
					struct.setw_WS_CD(_keyStruct.getw_WS_CD());
					struct.setw_VEND_CD(_keyStruct.getw_VEND_CD());
					struct.setw_ISSUE_CMPLT_FLG(_keyStruct.getw_ISSUE_CMPLT_FLG());
					struct.seth_SYS_LOT_CTRL_FLG(_keyStruct.geth_SYS_LOT_CTRL_FLG());
					struct.setw_LOT_CTRL_FLG(_keyStruct.getw_LOT_CTRL_FLG());
					struct.setw_PLANT_CD(_keyStruct.getw_PLANT_CD());
					struct.setw_CHOICE(_keyStruct.getw_CHOICE());
					// 画面チェック用に出庫先保管区コードを非表示項目に保持
					struct.seth_WH_CD(struct.getWH_CD());
					
					// ＭＲＰ品目の時、所要量にセットされている製番は親の製番なので使わない（nullと扱う）
					if(Calculate.compare(struct.getMRP_ODR_TYP(), "3") > 0){
						struct.setJOB_ODR_CD((String)null);
						struct.setw_JOB_ODR_CD((String)null);
					}
					else{
						struct.setw_JOB_ODR_CD(struct.getJOB_ODR_CD());
					}
					

					//リストクリア
					if (list != null) {
						list.clear();
					}
					// 子画面の初期値をセット
					if (issueList != null) {
						issueList.clear();
					}
					
					// 出庫実績明細一覧の取得
		            issueList = entity.mT_LOT_ISSUE_INST.read(conn, struct);
		            if (!issueList.isEmpty()) {
		    			// 表示最大行数制限処理
		    			ScreenParam sp = new ScreenParam(this.getClass());
		    			int maxLine = sp.getMaxLine(conn,21);
		    			if(maxLine != 0 && this.issueList.size() > maxLine){
		    				setReadStatus(TOO_MANY);
		    				this.issueList.clear();
		    				logMessage = "";
		    				setErrorMessage("ZZ01115", "", ""+maxLine);
		    			}
		            }
					
					struct.setRCV_ISSUE_QTY(new String("0.0"));
					struct.setw_STOCK_LOT_CD((String)null);
					struct.setw_STOCK_ON_HAND_QTY(new String("0.0"));
					struct.setw_TOTAL_STOCK_ON_HAND_QTY(new String("0.0"));
					
					
					if(("0").equals(struct.getISSUE_CMPLT_FLG()) == true){
						
						// 完了フラグ＝0:未の場合
						if( Calculate.compare(struct.getw_SHIP_REMAIN_QTY(), "0") > 0 ){
							struct.setRCV_ISSUE_QTY(struct.getw_SHIP_REMAIN_QTY());	// 出庫残数
						}
						struct.seth_SHIP_COMPLETE(new String("1"));				// 完了フラグ
						// 業務運用日の取得
						tmpList = entity.mselectSYS_DATE_CTRL.read(conn, struct);
						if(tmpList.size() <= 0) {
							// 行修正処理失敗：業務運用日が存在しません
							logMessage = "SYS_DATE_CTRL.PLANT_CD:" + struct.getw_PLANT_CD();
							setErrorMessage("AF00056", logMessage);
							check = false;
						}
						else{
							AF0020010Struct workStruct = (AF0020010Struct)tmpList.get(0);
							struct.setBUSINESS_OPR_DATE(workStruct.getBUSINESS_OPR_DATE());
							struct.setRCV_ISSUE_DATE(workStruct.getBUSINESS_OPR_DATE());	// 業務運用日
						}
						
						// 買掛管理がインストールされている場合、当年月度を取得
						AF0020010Struct readStruct = new AF0020010Struct();
						List installOptionsList = entity.mSYS_INSTALL_OPTIONS.read(conn, readStruct);
						if (installOptionsList.size() > 0) {
							AF0020010Struct installOptionsStruct = (AF0020010Struct)installOptionsList.get(0);
							struct.setINSTALL_FLG(installOptionsStruct.getINSTALL_FLG());
						} else {
							struct.setINSTALL_FLG("0");
						}
						
						// 買掛管理がインストールされている場合、当年月度を取得
						if ("1".equals(struct.getINSTALL_FLG())) {
							List debtCtrlList = entity.mSYS_DEBT_CTRL.read(conn, readStruct);
							if (debtCtrlList.size() > 0) {
								AF0020010Struct debtCtrlStruct = (AF0020010Struct)debtCtrlList.get(0);
								struct.setTHIS_MONTH(debtCtrlStruct.getTHIS_MONTH());
							} else {
								setErrorMessage("AF00142");
								check = false;
							}
						}
						// [出庫指示]."工程保管場所コード"がnullでない場合は名称表示
						if (struct.getWH_CD() == null || "".equals(struct.getWH_CD())) {
							AF0020010Struct whStruct = new AF0020010Struct();
							whStruct.settmp_WH_CD(struct.getWH_CD());
							tmpList = entity.mcheckM_WH.read(conn, whStruct);
							if (tmpList.size() > 0) {
								AF0020010Struct workStruct = (AF0020010Struct)tmpList.get(0);
								struct.setWH_NAME(workStruct.getWH_NAME());
							}
						}
					}
					else{
						// 完了フラグ＝1:完了の場合
						struct.setRCV_ISSUE_QTY(struct.getTOTAL_ISSUE_QTY());	// 出庫数
						struct.setRCV_ISSUE_DATE(struct.getISSUE_CMPLT_DATE());	// 出庫完了日
						struct.seth_SHIP_COMPLETE(struct.getISSUE_CMPLT_FLG());	// 完了フラグ

						
						// 完了通知メッセージ出力(業務ワーニング)
						setWarningMessage("AF00132");
					}

					// 在庫累計数のセット（倉庫在庫だけ集計）
					// 品目在庫 読込
					tmpList = entity.mselectSub1_ITEM_STOCK.read(conn, struct);
						
					if(tmpList.size() > 0){
						AF0020010Struct tmpStruct = (AF0020010Struct)tmpList.get(0);
						struct.setw_TOTAL_STOCK_ON_HAND_QTY(tmpStruct.getw_TOTAL_STOCK_ON_HAND_QTY());
					}

					// 支給区分に表示する表示名の設定
					setConsTypeValue(struct);
				}
			}
			
		} catch(SQLException e) {
			setSqlExceptionMsg(e);

		} finally {
			// エラーの時、親画面データ再設定
			if(check != true){
				struct.copy(_keyStruct);
			}
		}
		//------------------------------------------------------------------
                //}}user_implement_dev:<controlmodify>
		logger.exiting("AF0020010Control"+":USER="+struct.getsUser_ID(),"controlmodify");

		return;
	}

	/**
	 * 選択登録ボタン押下時に実行される処理です。
	 *
	 */
	public void controlinsert() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0020");
		logger.entering("AF0020010Control"+":USER="+struct.getsUser_ID(),"controlinsert");
			//{{user_implement_dev:<controlinsert>
		//------------------------------------------------------------------
		// ログ出力情報格納用
		String logMessage = "";
		List listMessage = new ArrayList();
		boolean transFlg = false;

		try {
			// 業務運用日の取得
			String strBusinessOprDate = SystemInformation.getBusinessOprDate(getsysPLANT_CD());
			if(strBusinessOprDate == null) {
				// 登録処理失敗：業務運用日が存在しません
				logMessage = "SYS_DATE_CTRL.PLANT_CD:" + getsysPLANT_CD();
				setErrorMessage("AF00056", logMessage);
                return;
			}
			// 生産側の過去の実績入力の制限チェック
			// 出庫予定日のチェック処理、一個レコードがあれば、エラー
			PrivateConfig config = new PrivateConfig(conn);
			if("false".equals(config.getString("PAST_RESULT_ENTRY_TYP"))){
				
				if(chkProcExecDate("2",strBusinessOprDate,strBusinessOprDate) == false){
					setErrorMessage(ProcExecDateError);
					setErrorParameter("SYS_ACTUAL_COST_CTRL_AC", "PLANT_CD", struct.getPLANT_CD());
					setErrorParameter("SYS_ACTUAL_COST_CTRL_AC", "PROC_EXEC_DATE", struct.getPROC_EXEC_DATE().toString());
					return;
				}
				
				for(int i = 0; i < struct.getList_ISSUE_INST_CD().size(); i++) {
					AF0020010Struct dateStruct = new AF0020010Struct();
					dateStruct.importData(struct, i);
				}
			}
			
			boolean check = true;		// チェック結果格納
				
			// トランザクション開始
			conn.beginTransWeb();
			transFlg = true;
			
			List dataList = new ArrayList(0);
			
			// 画面で選択したデータを下に再読込し、リストに代入
			List wkList;
			List issueInstList = new ArrayList();
			for(int i = 0; i < struct.getList_ISSUE_INST_CD().size(); i++) {
				AF0020010Struct tmpStruct = new AF0020010Struct();
				IssueInstStruct issueInstStruct = new IssueInstStruct();
				tmpStruct.importData(struct, i);

				tmpStruct.setw_PLANT_CD(getsysPLANT_CD());
				tmpStruct.setw_ISSUE_INST_CD(tmpStruct.getISSUE_INST_CD());
				tmpStruct.setw_WS_CD(tmpStruct.getWS_CD());
				tmpStruct.setw_VEND_CD(tmpStruct.getVEND_CD());
				tmpStruct.setw_ISSUE_CMPLT_FLG(tmpStruct.getISSUE_CMPLT_FLG());
				
				wkList = entity.mselect.read(conn, tmpStruct);
				if(wkList.size() <= 0){
					listMessage.add("T_ISSUE_INST.ISSUE_INST_CD:" + tmpStruct.getw_ISSUE_INST_CD());
					listMessage.add("T_ISSUE_INST.WS_CD:" + tmpStruct.getw_WS_CD());
					listMessage.add("T_ISSUE_INST.VEND_CD:" + tmpStruct.getw_VEND_CD());
					listMessage.add("T_ISSUE_INST.ISSUE_CMPLT_FLG:" + tmpStruct.getw_ISSUE_CMPLT_FLG());
					listMessage.add("T_ISSUE_INST.PLANT_CD:" +  tmpStruct.getw_PLANT_CD());
					setErrorMessage("ZZ06001", listMessage);
					listMessage.clear();
					check = false;
					continue;
				}
				tmpStruct = (AF0020010Struct)wkList.get(0);
				
				// 出庫残数が0より小さければ0をセット
				if( Calculate.compare(tmpStruct.getw_SHIP_REMAIN_QTY(),"0") < 0 ){
					tmpStruct.setw_SHIP_REMAIN_QTY("0");
				}
				
				// 保管区コードがnullでない場合
				if(tmpStruct.getWH_CD() != null && ("").equals(tmpStruct.getWH_CD()) == false){
					// 保管区コードの存在チェック
					struct.settmp_WH_CD(tmpStruct.getWH_CD());
					List tmpList = entity.mcheckM_WH.read(conn, struct);
					if(tmpList.size() <= 0) {
						// 読込処理失敗：保管区コードが存在しません
						logMessage = "M_WH.WH_CD:" + struct.gettmp_WH_CD();
						setErrorMessage("AF00031", logMessage);
						check = false;
					}else{
						AF0020010Struct checkStruct = (AF0020010Struct)tmpList.get(0);
						if ("0".equals(checkStruct.getMRP_FLG()) == false) {
							// 登録処理失敗：出庫先保管区コードに所要量計算対象の保管区は指定できません。
							listMessage.add("M_WH.WH_CD:" + tmpStruct.getWH_CD());
							listMessage.add("M_WH.MRP_FLG:" +  checkStruct.getMRP_FLG());
							setErrorMessage("AF00139", listMessage);
							listMessage.clear();
							check = false;
						}else{
							if ("0".equals(tmpStruct.getCONS_TYP())) {
								// 取引先保管区が設定されている場合エラー
								if (checkStruct.getWH_VEND_CD() != null 
										&& "".equals(checkStruct.getWH_VEND_CD()) == false) {
									listMessage.add("M_WH.WH_CD:" + tmpStruct.getWH_CD());
									listMessage.add("M_WH.VEND_CD:" +  checkStruct.getWH_VEND_CD());
									setErrorMessage("AF00140", listMessage);
									listMessage.clear();
									check = false;
								}
						}	
						
						
						tmpStruct.setw_PLANT_CD(struct.getw_PLANT_CD());
						boolean whcheck = false;

						//MRP品(一覧の製番がNULLまたは品目手配区分が1,2ではない)の場合
						if(("".equals(tmpStruct.getJOB_ODR_CD()) || tmpStruct.getJOB_ODR_CD() ==null) || 
								(!tmpStruct.getMRP_ODR_TYP().equals(AF0020Const._MRP_ODR_JOB_ODR_CD) && 
									!tmpStruct.getMRP_ODR_TYP().equals(AF0020Const._MRP_ODR_STOCK_ALC_JOB_ODR_CD)) ){
							
							// 品目ごとの出庫元保管区リストを取得
							List l_WH = ValidateWh.getAutoIssue(conn, tmpStruct.getw_PLANT_CD(), tmpStruct.getITEM_CD());	
							if(l_WH.size() > 0){
								for(int j = 0; j < l_WH.size(); j++) {
									tmpStruct.setw_WH_CD((String)l_WH.get(j));								
									//保管区別品目在庫の読込
									tmpList = entity.mselectSub1_ITEM.read(conn, tmpStruct);
									if(tmpList.size() > 0) {
										whcheck = true;
										break;
									}
								
								}	
								//在庫データの存在チェックで存在しなかった場合、エラー
								if(whcheck == false){
									// 読込処理失敗：保管区別品目在庫が存在しません
									setErrorMessage("AF00044", listMessage);
									listMessage.clear();
									check = false;
								}
							
					    	}else{
							// 読込処理失敗：出庫元保管区が未登録です。
							listMessage.add("T_ITEM_STOCK.ITEM_CD:" + tmpStruct.getITEM_CD());
							listMessage.add("T_ITEM_STOCK.PLANT_CD:" + tmpStruct.getw_PLANT_CD());
							setErrorMessage("AD10003", listMessage);
							listMessage.clear();
							check = false;					    	
					    	}
						}

					  }	
					}	
				}
				
				
				// 出庫指示情報クラスにセット
				issueInstStruct.m_ISSUE_INST_CD = tmpStruct.getISSUE_INST_CD();
				issueInstStruct.m_PLANT_CD = getsysPLANT_CD();
				issueInstStruct.m_OD_NO = tmpStruct.getOD_NO();
				issueInstStruct.m_JOB_ODR_CD = tmpStruct.getJOB_ODR_CD();
				issueInstStruct.m_JOB_ODR_DETAIL_NO = tmpStruct.getJOB_ODR_DETAIL_NO().intValue();
				issueInstStruct.m_ITEM_CD = tmpStruct.getITEM_CD();
				issueInstStruct.m_PUCH_ODR_CD = tmpStruct.getPUCH_ODR_CD();
				issueInstStruct.m_COMPANY_CD = tmpStruct.getCOMPANY_CD();
				issueInstStruct.m_VEND_CD = tmpStruct.getVEND_CD();
				issueInstStruct.m_WORK_ODR_CD = tmpStruct.getWORK_ODR_CD();
				issueInstStruct.m_WORK_IN_PROC_CD = tmpStruct.getWORK_IN_PROC_CD();
				issueInstStruct.m_WS_CD = tmpStruct.getWS_CD();
				issueInstStruct.m_WH_CD = tmpStruct.getWH_CD();
				issueInstStruct.m_CONS_TYP = Integer.parseInt(tmpStruct.getCONS_TYP());
				issueInstStruct.m_MRP_ODR_TYP = Integer.parseInt(tmpStruct.getMRP_ODR_TYP());
				issueInstStruct.m_UNIT_QTY_TYP = Integer.parseInt(tmpStruct.getUNIT_QTY_TYP());
				issueInstStruct.m_AUTO_ISSUE_QTY = new BigDecimal(tmpStruct.getw_SHIP_REMAIN_QTY());
				
				dataList.add(issueInstStruct);
				
			}
			
			// エラーが発生した場合は処理終了
			if(!check) return;
			
			boolean result = true;		// ＤＢ更新結果格納

			/********************
			 * 一括出庫処理開始 *
			 ********************/
			LumpIssue lumpIssue = new LumpIssue(conn,getsysPLANT_CD(),
					getsysUSER_CD(),sp.getProcId());
			
			// 一括出庫処理実行
			result = lumpIssue.LumpIssueOpr(WhAutoIssueProc.RCV_ISSUE_TYP_MANUAL,
					strBusinessOprDate,RcvIssueConst.ISSUE_CMPLT_DONE, null,dataList);

			String[] message;
			if(result){
				
				// アラーム情報があれば出力する
				for(int i=0; i<lumpIssue.getInfoList().size(); i++){
					message = (String[])lumpIssue.getInfoList().get(i);
					setInfoMessage(message[0], message[1]);
				}
				
				// 業務アラームがあれば出力する。
				for(int i=0; i<lumpIssue.getWarnList().size(); i++){
					message = (String[])lumpIssue.getWarnList().get(i);
					setWarningMessage(message[0], message[1]);
				}
			}else{
				// 業務エラーの出力
				for(int i=0; i<lumpIssue.getErrorList().size(); i++){
					message = (String[])lumpIssue.getErrorList().get(i);
					setErrorMessage(message[0], message[1]);
				}
				return;
			}
			
			// コミット
			conn.commit();
			transFlg = false;

			// キーコピー
			struct.copy(_keyStruct);
			// 親画面データ再読込
			controlselect();

		}catch(SQLException e){
			// ロールバック
			getMessage().clearWarn();
			getMessage().clearInfo();
			logMessage = "rollback!! controlinsert(SQLException) ";
			setSyslogConfig(logMessage);
			conn.rollback();

			setSqlExceptionMsg(e);

		}catch(Exception e){
			// ロールバック
			getMessage().clearWarn();
			getMessage().clearInfo();
			logMessage = "rollback!! controlinsert(Exception) ";
			setSyslogConfig(logMessage);
			conn.rollback();

			ExpjException ee = new ExpjException(e, "ZZ01106");
			ExpjMessage emsg = new ExpjMessage( "ZZ01006" , "ProcessId:" + this.sp.getProcId() );
			ee.add(emsg);
			throw ee;
		} finally {
			try {
				if( transFlg ){
					conn.rollback();
					transFlg = false;
				}
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		//------------------------------------------------------------------
                //}}user_implement_dev:<controlinsert>
		logger.exiting("AF0020010Control"+":USER="+struct.getsUser_ID(),"controlinsert");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlclear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0020");
		logger.entering("AF0020010Control"+":USER="+struct.getsUser_ID(),"controlclear");
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
		struct.initialize();
		_keyStruct = new AF0020010Struct();

		// モード設定
		setReadStatus(INITIAL);
		
		_usersIntialized = false;
		usersInitialize();
		//------------------------------------------------------------------
                //}}user_implement_dev:<controlclear>
		logger.exiting("AF0020010Control"+":USER="+struct.getsUser_ID(),"controlclear");

		return;
	}

	/**
	 * 在庫確認ボタン押下時に実行される処理です。
	 *
	 */
	public void controlselectSub1() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0020");
		logger.entering("AF0020010Control"+":USER="+struct.getsUser_ID(),"controlselectSub1");
			//{{user_implement_dev:<controlselectSub1>
		//------------------------------------------------------------------
		// ログ出力情報格納用
		String logMessage = "";
		List listMessage = new ArrayList();

		try {
			// クリア
			struct.setw_WH_NAME((String)null);
			struct.setw_STOCK_ON_HAND_QTY(new String("0.0"));
			struct.setw_TOTAL_STOCK_ON_HAND_QTY(new String("0.0"));
			struct.setITEM_STOCK_NON_ALC_QTY("0.0");
			struct.setODR_ISSUE_POSS_QTY("0.0");
			struct.setALC_NOISSUE_QTY("0.0");
			struct.setTHIS_TIME_ISSUE_POSS_QTY("0.0");

			// エラーチェック
			boolean check = true;		// チェック結果格納

			List tmpList = null;

			// 保管区コードがnullでない場合
			if(struct.getw_WH_CD() != null && ("").equals(struct.getw_WH_CD()) == false){

				// 保管区コードの存在チェック
				struct.settmp_WH_CD(struct.getw_WH_CD());
				tmpList = entity.mcheckM_WH.read(conn, struct);
				if(tmpList.size() <= 0) {
					// 読込処理失敗：保管区コードが存在しません
					logMessage = "M_WH.WH_CD:" + struct.gettmp_WH_CD();
					setErrorMessage("AF00028", logMessage);
					check = false;
				}
				else{
					AF0020010Struct checkStruct = (AF0020010Struct)tmpList.get(0);
					struct.setw_WH_NAME(checkStruct.getWH_NAME());
					// 保管区.工場コード ≠ ログイン利用者工場コード チェック
					if((checkStruct.getWH_PLANT_CD().equals(struct.getw_PLANT_CD())) == false){
						// 読込処理失敗：保管区コードは他の工場のデータなので指定できません
						listMessage.add("M_WH.WH_CD:" + struct.gettmp_WH_CD());
						listMessage.add("M_WH.PLANT_CD:" +  checkStruct.getWH_PLANT_CD());
						setErrorMessage("AF00029", listMessage);
						listMessage.clear();
						check = false;
					}
					else{
						// 保管区コードが倉庫かチェック
						if(("1").equals(checkStruct.getMRP_FLG()) == false){
							// 登録処理失敗：出庫元保管区が所要量計算対象ではありません
							listMessage.add("M_WH.WH_CD:" + struct.gettmp_WH_CD());
							listMessage.add("M_WH.MRP_FLG:" +  checkStruct.getMRP_FLG());
							setErrorMessage("AF00096", listMessage);
							listMessage.clear();
							check = false;
						}
					}
				}
			}

			// 保管区コードがnullでない場合
			if(struct.getw_WH_CD() != null && ("").equals(struct.getw_WH_CD()) == false){

				// 保管区別在庫数のセット
				//「製番から出庫する」がoffの場合
				if(struct.geth_JOB_ODR().intValue() == 0){
					//保管区別品目在庫の読込
					tmpList = entity.mselectSub1_ITEM.read(conn, struct);
					if(tmpList.size() <= 0) {
						// 読込処理失敗：保管区別品目在庫が存在しません
						listMessage.add("T_ITEM_STOCK.ITEM_CD:" + struct.getITEM_CD());
						listMessage.add("T_ITEM_STOCK.WH_CD:" + struct.getw_WH_CD());
						listMessage.add("T_ITEM_STOCK.PLANT_CD:" + struct.getw_PLANT_CD());
						setErrorMessage("AF00044", listMessage);
						listMessage.clear();
						check = false;
					}
				}
				else{
					//保管区別製番在庫の読込
					tmpList = entity.mselectSub1_ODR.read(conn, struct);
					if(tmpList.size() <= 0) {
						// 読込処理失敗：保管区別製番在庫が存在しません
						listMessage.add("T_JOB_ODR_CD_STOCK.JOB_ODR_CD:" + struct.getw_JOB_ODR_CD());
						listMessage.add("T_JOB_ODR_CD_STOCK.ITEM_CD:" + struct.getITEM_CD());
						listMessage.add("T_JOB_ODR_CD_STOCK.WH_CD:" + struct.getw_WH_CD());
						listMessage.add("T_JOB_ODR_CD_STOCK.PLANT_CD:" + struct.getw_PLANT_CD());
						setErrorMessage("AF00045", listMessage);
						listMessage.clear();
						check = false;
					}
				}
				if(tmpList.size() > 0) {
					AF0020010Struct workStruct = (AF0020010Struct)tmpList.get(0);
					struct.setw_STOCK_ON_HAND_QTY(workStruct.getw_STOCK_ON_HAND_QTY());
				}
			}


			// 在庫累計数のセット（倉庫在庫だけ集計）
			//「製番から出庫する」がoffの場合
			if(struct.geth_JOB_ODR().intValue() == 0){
				//保管区別品目在庫の読込
				tmpList = entity.mselectSub1_ITEM_STOCK.read(conn, struct);
			}
			else{
				//保管区別製番在庫の読込
				tmpList = entity.mselectSub1_ODR_STOCK.read(conn, struct);
			}
			if(tmpList.size() > 0) {
				AF0020010Struct workStruct = (AF0020010Struct)tmpList.get(0);
				struct.setw_TOTAL_STOCK_ON_HAND_QTY(workStruct.getw_TOTAL_STOCK_ON_HAND_QTY());
			}
			
			if(msgStruct.sizeError() <= 0){
				// 表示項目計算処理
				calcDisplayItem();
			}

		}catch(SQLException e){
			setSqlExceptionMsg(e);
		}
		//------------------------------------------------------------------
                //}}user_implement_dev:<controlselectSub1>
		logger.exiting("AF0020010Control"+":USER="+struct.getsUser_ID(),"controlselectSub1");

		return;
	}

	/**
	 * 更新ボタン押下時に実行される処理です。
	 *
	 */
	public void controlinsertSub1() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0020");
		logger.entering("AF0020010Control"+":USER="+struct.getsUser_ID(),"controlinsertSub1");
			//{{user_implement_dev:<controlinsertSub1>
		//------------------------------------------------------------------
		// ログ出力情報格納用
		String logMessage = "";
		List listMessage = new ArrayList();

		try {
			// クリア
			struct.setw_WH_NAME((String)null);
			struct.setWH_NAME((String)null);
			struct.setw_STOCK_ON_HAND_QTY(new String("0.0"));
			struct.setw_TOTAL_STOCK_ON_HAND_QTY(new String("0.0"));
			struct.setITEM_STOCK_NON_ALC_QTY("0.0");
			struct.setODR_ISSUE_POSS_QTY("0.0");
			struct.setALC_NOISSUE_QTY("0.0");
			struct.setTHIS_TIME_ISSUE_POSS_QTY("0.0");

			// 生産側の過去の実績入力の制限チェック
			PrivateConfig config = new PrivateConfig(conn);
			if("false".equals(config.getString("PAST_RESULT_ENTRY_TYP"))){
				if(chkProcExecDate("1","",struct.getRCV_ISSUE_DATE()) == false){
					setErrorMessage(ProcExecDateError);
					setErrorParameter("SYS_ACTUAL_COST_CTRL_AC", "PLANT_CD", struct.getPLANT_CD());
					setErrorParameter("SYS_ACTUAL_COST_CTRL_AC", "PROC_EXEC_DATE", struct.getPROC_EXEC_DATE().toString());
					return;
				}
			}
			
			// エラーチェック
			boolean check = true;		// チェック結果格納

			List tmpList = null;

			// 保管区コードの存在チェック
			//   出庫数＝0の場合はチェックしない（null許可）
			if(((struct.getw_WH_CD() == null || ("").equals(struct.getw_WH_CD()) == true) &&
			    (Calculate.compare(struct.getRCV_ISSUE_QTY(), "0") == 0)) == false){
				struct.settmp_WH_CD(struct.getw_WH_CD());
				tmpList = entity.mcheckM_WH.read(conn, struct);
				if(tmpList.size() <= 0) {
					// 登録処理失敗：保管区コードが存在しません
					logMessage = "M_WH.WH_CD:" + struct.gettmp_WH_CD();
					setErrorMessage("AF00028", logMessage);
					check = false;
				}
				else{
					AF0020010Struct checkStruct = (AF0020010Struct)tmpList.get(0);
					struct.setw_WH_NAME(checkStruct.getWH_NAME());
					// 保管区.工場コード ≠ ログイン利用者工場コード チェック
					if((checkStruct.getWH_PLANT_CD().equals(struct.getw_PLANT_CD())) == false){
						// 登録処理失敗：保管区コードは他の工場のデータなので指定できません
						listMessage.add("M_WH.WH_CD:" + struct.gettmp_WH_CD());
						listMessage.add("M_WH.PLANT_CD:" +  checkStruct.getWH_PLANT_CD());
						setErrorMessage("AF00029", listMessage);
						listMessage.clear();
						check = false;
					}
					else{
						// 保管区コードが倉庫かチェック
						if(("1").equals(checkStruct.getMRP_FLG()) == false){
							// 登録処理失敗：出庫元保管区が所要量計算対象ではありません
							listMessage.add("M_WH.WH_CD:" + struct.gettmp_WH_CD());
							listMessage.add("M_WH.MRP_FLG:" +  checkStruct.getMRP_FLG());
							setErrorMessage("AF00096", listMessage);
							listMessage.clear();
							check = false;
						}
					}
				}
			}

			// 出庫指示数が0以上で保管区コードがnullでない場合
			if(struct.getw_WH_CD() != null && ("").equals(struct.getw_WH_CD()) == false && (Calculate.compare(struct.getRCV_ISSUE_QTY(), "0") != 0)){

				// 保管区別在庫数のセット
				//「製番から出庫する」がoffの場合
				if(struct.geth_JOB_ODR().intValue() == 0){
					//保管区別品目在庫の読込
					tmpList = entity.mselectSub1_ITEM.read(conn, struct);
					if(tmpList.size() <= 0) {
						// 登録処理失敗：保管区別品目在庫が存在しません
						listMessage.add("T_ITEM_STOCK.ITEM_CD:" + struct.getITEM_CD());
						listMessage.add("T_ITEM_STOCK.WH_CD:" + struct.getw_WH_CD());
						listMessage.add("T_ITEM_STOCK.PLANT_CD:" + struct.getw_PLANT_CD());
						setErrorMessage("AF00044", listMessage);
						listMessage.clear();
						check = false;
					}
				}
				else{
					//保管区別製番在庫の読込
					tmpList = entity.mselectSub1_ODR.read(conn, struct);
					if(tmpList.size() <= 0) {
						// 登録処理失敗：保管区別製番在庫が存在しません
						listMessage.add("T_JOB_ODR_CD_STOCK.JOB_ODR_CD:" + struct.getw_JOB_ODR_CD());
						listMessage.add("T_JOB_ODR_CD_STOCK.ITEM_CD:" + struct.getITEM_CD());
						listMessage.add("T_JOB_ODR_CD_STOCK.WH_CD:" + struct.getw_WH_CD());
						listMessage.add("T_JOB_ODR_CD_STOCK.PLANT_CD:" + struct.getw_PLANT_CD());
						setErrorMessage("AF00045", listMessage);
						listMessage.clear();
						check = false;
					}
				}
				if(tmpList.size() > 0) {
					AF0020010Struct workStruct = (AF0020010Struct)tmpList.get(0);
					struct.setw_STOCK_ON_HAND_QTY(workStruct.getw_STOCK_ON_HAND_QTY());
				}
			}


			// 在庫累計数のセット（倉庫在庫だけ集計）
			//「製番から出庫する」がoffの場合
			if(struct.geth_JOB_ODR().intValue() == 0){
				//保管区別品目在庫の読込
				tmpList = entity.mselectSub1_ITEM_STOCK.read(conn, struct);
			}
			else{
				//保管区別製番在庫の読込
				tmpList = entity.mselectSub1_ODR_STOCK.read(conn, struct);
			}
			if(tmpList.size() > 0) {
				AF0020010Struct workStruct = (AF0020010Struct)tmpList.get(0);
				struct.setw_TOTAL_STOCK_ON_HAND_QTY(workStruct.getw_TOTAL_STOCK_ON_HAND_QTY());
			}


			// 整数管理品目で出庫数が小数の場合、整数に切り上げ処理
			boolean resultCeil = false;

			if(("1").equals(TypeConverter.sanitizer(struct.getUNIT_QTY_TYP())) == true &&
					Calculate.isNumeric(struct.getRCV_ISSUE_QTY()) == true ){
				struct.setRCV_ISSUE_QTY(Calculate.ceil(struct.getRCV_ISSUE_QTY(), 0));
				resultCeil = true;
			}

			// 業務運用日の取得
			tmpList = entity.mselectSYS_DATE_CTRL.read(conn, struct);
			if(tmpList.size() <= 0) {
				// 登録処理失敗：業務運用日が存在しません
				logMessage = "SYS_DATE_CTRL.PLANT_CD:" + struct.getw_PLANT_CD();
				setErrorMessage("AF00056", logMessage);
				check = false;
			}
			else{
				AF0020010Struct workStruct = (AF0020010Struct)tmpList.get(0);
				// 出庫日チェック
				Date issue_Date = stringToDate(struct.getRCV_ISSUE_DATE());
				Date business_Date = stringToDate(workStruct.getBUSINESS_OPR_DATE());
				if(issue_Date.getTime() > business_Date.getTime()){
					// 登録処理失敗：出庫日に未来の日付は指定できません
					logMessage = "SYS_DATE_CTRL.BUSINESS_OPR_DATE:" + workStruct.getBUSINESS_OPR_DATE();
					setErrorMessage("ZZ05103", logMessage);
					check = false;
				}
			}
			
			// 出庫指示番号を指定して出庫指示を読込
			AF0020010Struct checkStruct = null;
			AF0020010Struct readStruct = new AF0020010Struct();
			readStruct.setw_ISSUE_INST_CD(struct.getISSUE_INST_CD());
			readStruct.setw_WS_CD((String)null);
			readStruct.setw_VEND_CD((String)null);
			readStruct.setw_ISSUE_CMPLT_FLG((String)null);
			readStruct.setw_LOT_CTRL_FLG((String)null);
			readStruct.setw_PLANT_CD((String)null);
			tmpList = entity.mselect.read(conn, readStruct);
			if (tmpList.size() <= 0) {
				// 行修正処理失敗：選択された出庫指示データが存在しません
				logMessage = "T_ISSUE_INST.ISSUE_INST_CD:" + struct.getISSUE_INST_CD();
				setErrorMessage("ZZ01101", logMessage);
				check = false;
			} else {
				
				AF0020010Struct issueInstStruct = (AF0020010Struct)tmpList.get(0);
				
					// [出庫指示]の工程保管場所コードNull
					if (issueInstStruct.getWH_CD() == null 
							|| "".equals(issueInstStruct.getWH_CD())) {
						if (struct.getWH_CD() != null && "".equals(struct.getWH_CD()) == false) {
							// 登録処理失敗：出庫先保管区コードは入力できません。
							setErrorMessage("AF00138");
							check = false;
						}
					} else {
						if (struct.getWH_CD() == null || "".equals(struct.getWH_CD())) {
							// 登録処理失敗：出庫先保管区コードが未入力です。
							setErrorMessage("AF00030");
							check = false;
						} else {
							AF0020010Struct whStruct = new AF0020010Struct();
							whStruct.settmp_WH_CD(struct.getWH_CD());
							tmpList = entity.mcheckM_WH.read(conn, whStruct);
							if (tmpList.size() <= 0) {
								// 登録処理失敗：出庫先保管区コードが存在しません
								logMessage = "M_WH.WH_CD:" + whStruct.gettmp_WH_CD();
								setErrorMessage("AF00031", logMessage);
								check = false;
							} else {
								checkStruct = (AF0020010Struct)tmpList.get(0);
								// 工程保管場所.工場コード ≠ ログイン利用者工場コード チェック
								if((checkStruct.getWH_PLANT_CD().equals(getsysPLANT_CD())) == false){
									// 登録処理失敗：出庫先保管区コードは他の工場のデータなので指定できません
									listMessage.add("M_WH.WH_CD:" + whStruct.gettmp_WH_CD());
									listMessage.add("M_WH.PLANT_CD:" +  checkStruct.getWH_PLANT_CD());
									setErrorMessage("AF00032", listMessage);
									listMessage.clear();
									check = false;
								} else {
									if ("0".equals(checkStruct.getMRP_FLG()) == false) {
										// 登録処理失敗：出庫先保管区コードに所要量計算対象の保管区は指定できません。
										listMessage.add("M_WH.WH_CD:" + whStruct.gettmp_WH_CD());
										listMessage.add("M_WH.MRP_FLG:" +  checkStruct.getMRP_FLG());
										setErrorMessage("AF00139", listMessage);
										listMessage.clear();
										check = false;
									} else {
										if ("0".equals(struct.getCONS_TYP())) {
											// 取引先保管区が設定されている場合エラー
											if (checkStruct.getWH_VEND_CD() != null 
													&& "".equals(checkStruct.getWH_VEND_CD()) == false) {
												listMessage.add("M_WH.WH_CD:" + whStruct.gettmp_WH_CD());
												listMessage.add("M_WH.VEND_CD:" +  checkStruct.getWH_VEND_CD());
												setErrorMessage("AF00140", listMessage);
												listMessage.clear();
												check = false;
											}
										} else {
											if (issueInstStruct.getVEND_CD() == null 
													|| "".equals(issueInstStruct.getVEND_CD())) {
												if (checkStruct.getWH_VEND_CD() != null 
														&& "".equals(checkStruct.getWH_VEND_CD()) == false) {
													listMessage.add("M_WH.WH_CD:" + whStruct.gettmp_WH_CD());
													listMessage.add("M_WH.VEND_CD:" +  checkStruct.getWH_VEND_CD());
													setErrorMessage("AF00141", listMessage);
													listMessage.clear();
													check = false;
												}
											} else {
												if ((issueInstStruct.getVEND_CD()).equals(
														checkStruct.getWH_VEND_CD()) == false) {
													listMessage.add("M_WH.WH_CD:" + whStruct.gettmp_WH_CD());
													listMessage.add("M_WH.VEND_CD:" +  checkStruct.getWH_VEND_CD());
													setErrorMessage("AF00141", listMessage);
													listMessage.clear();
													check = false;
												}
											}
										}
									}
								}
							}
						}
					}
			}
			
			if(msgStruct.sizeError() <= 0){
				// 表示項目計算処理
				calcDisplayItem();
			}
			
			// 製番または在庫引当型製番で品目在庫からの出庫で｢出庫数｣＞｢出庫可能数｣の場合
			if((struct.getMRP_ODR_TYP().equals(AF0020Const._MRP_ODR_JOB_ODR_CD) ||
					struct.getMRP_ODR_TYP().equals(AF0020Const._MRP_ODR_STOCK_ALC_JOB_ODR_CD)) &&
					!struct.getc_JOB_ODR().equals("true")){
				
				if(Calculate.compare(struct.getRCV_ISSUE_QTY(), struct.getTHIS_TIME_ISSUE_POSS_QTY()) == 1){
					listMessage.add("T_ITEM_STOCK.ITEM_CD:" + struct.getITEM_CD());
					listMessage.add("T_ITEM_STOCK.WH_CD:" +  struct.getw_WH_CD());
					setErrorMessage("AF00115", listMessage);
					listMessage.clear();
					check = false;
				}
			}

			// 製番または在庫引当型製番で他製番在庫からの出庫で｢出庫数｣＞｢出庫可能数｣の場合
			if((struct.getMRP_ODR_TYP().equals(AF0020Const._MRP_ODR_JOB_ODR_CD) ||
					struct.getMRP_ODR_TYP().equals(AF0020Const._MRP_ODR_STOCK_ALC_JOB_ODR_CD)) &&
					struct.getc_JOB_ODR().equals("true") &&
					!struct.getw_JOB_ODR_CD().equals(struct.getJOB_ODR_CD())){
				
				if(Calculate.compare(struct.getRCV_ISSUE_QTY(), struct.getTHIS_TIME_ISSUE_POSS_QTY()) == 1){
					listMessage.add("T_JOB_ODR_CD_STOCK.JOB_ODR_CD:" + struct.getw_JOB_ODR_CD());
					listMessage.add("T_JOB_ODR_CD_STOCK.JOB_ODR_DETAIL_NO:0");
					listMessage.add("T_JOB_ODR_CD_STOCK.ITEM_CD:" + struct.getITEM_CD());
					listMessage.add("T_JOB_ODR_CD_STOCK.WH_CD:" + struct.getw_WH_CD());
					setErrorMessage("AF00116", listMessage);
					listMessage.clear();
					check = false;
				}
			}

			// エラーがない場合
			if(check == true){
				// トランザクション開始
				conn.beginTransWeb();
				
				// 製番品の品目在庫未引当分から出庫する場合
				boolean jobOdrAlcFlg = false;
				if(!struct.getc_JOB_ODR().equals("true") &&
						Calculate.compare(struct.getRCV_ISSUE_QTY(), struct.getALC_NOISSUE_QTY()) == 1 &&
						(struct.getMRP_ODR_TYP().equals(AF0020Const._MRP_ODR_JOB_ODR_CD) ||
								struct.getMRP_ODR_TYP().equals(AF0020Const._MRP_ODR_STOCK_ALC_JOB_ODR_CD))){
					// 出庫指示情報クラスに情報をセット
					IssueInstStruct issueInstStruct = new IssueInstStruct();
					issueInstStruct.m_OD_NO = struct.getOD_NO();
					issueInstStruct.m_PLANT_CD = getsysPLANT_CD();
					issueInstStruct.m_ITEM_CD = struct.getITEM_CD();
					
					// 更新情報クラスに情報をセット
					UpdateInfo updateInfo = new UpdateInfo(getsysUSER_CD(), this.sp.getProcId(), 0);
					
					// [製番引当]の追加・更新
					(new JobOdrAlc(conn)).updateAlcQty(issueInstStruct,
							new BigDecimal(struct.getRCV_ISSUE_QTY()), updateInfo);
					
					jobOdrAlcFlg = true;
				}


				// 在庫ロット番号のクリア
				struct.setw_STOCK_LOT_CD(null);
				
				// 出庫処理ＤＢ登録処理
				boolean result = insert_issue_process();
				if (result == false) {
					// ロールバック
					getMessage().clearWarn();
					getMessage().clearInfo();
					logMessage = "rollback!! ";
					setSyslogConfig(logMessage);
					conn.rollback();
				}
				else{
					// 入庫処理ＤＢ登録処理
					result = insert_rcv_process();
					if (result == false) {
						// ロールバック
						getMessage().clearWarn();
						getMessage().clearInfo();
						logMessage = "rollback!! ";
						setSyslogConfig(logMessage);
						conn.rollback();
					}
					else{
						// コミット
						conn.commit();
						
						// [製番引当]を更新した場合
						if(jobOdrAlcFlg){
							setWarningMessage("AD60002", struct.getITEM_CD());
							WhAutoIssueProc.outBusinessMessage(conn, sp.getProcId(),
									getsysUSER_CD(), getsysPLANT_CD(), "AD60003",
									"品目番号:[" + struct.getITEM_CD() + "]");
						}

						if(resultCeil == true){
							// 登録処理結果：整数管理品目のため小数点以下は切り上げして更新しました
							logMessage = "T_ISSUE_INST.ISSUE_INST_CD:" + struct.getISSUE_INST_CD();
							setInfoMessage("AF60004", logMessage);
						}

						// キーコピー
						struct.copy(_keyStruct);
					}
				}
			}


		}catch(ParseException e){
			// 変換失敗
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			
			emsg = new ExpjMessage( "ZZ01006", e.toString());
			sysLog.severe (emsg ,getsysUSER_CD());
			throw ee;

		}catch(SQLException e){
			// ロールバック
			getMessage().clearWarn();
			getMessage().clearInfo();
			logMessage = " rollback!! controlinsertSub1(SQLException) ";
			setSyslogConfig(logMessage);
			conn.rollback();

			setSqlExceptionMsg(e);

		}catch(Exception e){
			// ロールバック
			getMessage().clearWarn();
			getMessage().clearInfo();
			logMessage = "rollback!! controlinsertSub1(Exception) ";
			setSyslogConfig(logMessage);
			conn.rollback();

			ExpjException ee = new ExpjException(e, "ZZ01106");
			ExpjMessage emsg = new ExpjMessage( "ZZ01006" , "ProcessId:" + this.sp.getProcId() );
			ee.add(emsg);
			throw ee;
		}
		//------------------------------------------------------------------
                //}}user_implement_dev:<controlinsertSub1>
		logger.exiting("AF0020010Control"+":USER="+struct.getsUser_ID(),"controlinsertSub1");

		return;
	}

	/**
	 * 戻るボタン押下時に実行される処理です。
	 *
	 */
	public void controlcloseSub1() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0020");
		logger.entering("AF0020010Control"+":USER="+struct.getsUser_ID(),"controlcloseSub1");
			//{{user_implement_dev:<controlcloseSub1>
		//------------------------------------------------------------------
		// キーコピー
		struct.copy(_keyStruct);

		// 親画面データ再読込
		controlselect();
		//------------------------------------------------------------------
                //}}user_implement_dev:<controlcloseSub1>
		logger.exiting("AF0020010Control"+":USER="+struct.getsUser_ID(),"controlcloseSub1");

		return;
	}

	/**
	 * 選択完了解除ボタン押下時に実行される処理です。
	 *
	 */
	public void controlCmpltCancel() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0020");
		logger.entering("AF0020010Control"+":USER="+struct.getsUser_ID(),"controlCmpltCancel");
			//{{user_implement_dev:<controlCmpltCancel>

		boolean transFlg = false;
		String Message = "";

		try{

			List dataList = new ArrayList(0);
			AF0020010Struct tmpStruct = new AF0020010Struct();
			AF0020010Struct updateStruct = new AF0020010Struct();

			// 画面で選択したデータをリストに代入
			int iSelectSize = struct.getList_ISSUE_INST_CD().size();
			for(int i = 0; i < iSelectSize; i++) {

				conn.beginTransWeb();
				transFlg = true;

				tmpStruct.importData(struct, i);
				dataList.add(tmpStruct);

				// 選択行の情報を取得
				updateStruct.copy((AF0020010Struct)dataList.get(i));

				// 対象レコードの更新情報を保持
				UpdateInfo updateinfo = new UpdateInfo(getsysUSER_CD(),
														getProgramId().substring(0,9),
														updateStruct.getMODIFY_COUNT().intValue());

				// 出庫完了の解除処理を行う
				int iSts = IssueComplete.Cancel(conn,
												updateStruct.getISSUE_INST_CD(),
												updateStruct.getOD_NO(),
												updateinfo);

				if( iSts == -1 ){
					// 対象データが存在しない場合
					Message = "T_ISSUE_INST.ISSUE_INST_CD:" + updateStruct.getISSUE_INST_CD();
					setErrorMessage("ZZ06001", Message);
				} else if( iSts == -2 ) {
					// 対象データが存在しない場合
					Message = "T_ISSUE_INST.ISSUE_INST_CD:" + updateStruct.getISSUE_INST_CD();
					setErrorMessage("ZZ01105", Message);
				} else if( iSts == -9 ) {
					ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
					sysLog.severe(emsg, getsysUSER_CD());
					ExpjException e = new ExpjException(emsg);
					throw e;
				}

				if( iSts == 0 ){
					conn.commit();
				} else {
					conn.rollback();
				}

				transFlg = false;

			}

			controlselect();

		}catch(SQLException e){
			setSqlExceptionMsg(e);
		} finally {
			try{
				if( transFlg ){
					conn.rollback();
					transFlg = false;
				}
			} catch(Exception e) {
				e.printStackTrace();
			}
		}

                //}}user_implement_dev:<controlCmpltCancel>
		logger.exiting("AF0020010Control"+":USER="+struct.getsUser_ID(),"controlCmpltCancel");

		return;
	}

	/**
	 * 更新ボタン押下時に実行される処理です。
	 *
	 */
	public void controlinsertSub2() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0020");
		logger.entering("AF0020010Control"+":USER="+struct.getsUser_ID(),"controlinsertSub2");
			//{{user_implement_dev:<controlinsertSub2>
			// TODO: ユーザ定義のコードを記述してください
//		 ログ出力情報格納用
		String logMessage = "";
		List listMessage = new ArrayList();
		_keyStruct.setc_SHIP_COMPLETE(struct.getc_SHIP_COMPLETE());

		try {
			// クリア
			struct.setw_WH_NAME((String)null); // 出庫元保管区名
			struct.setWH_NAME((String)null);   // 出庫先保管区名
			struct.setw_STOCK_ON_HAND_QTY(new String("0.0"));
			struct.setw_TOTAL_STOCK_ON_HAND_QTY(new String("0.0"));
			struct.setITEM_STOCK_NON_ALC_QTY("0.0");
			struct.setODR_ISSUE_POSS_QTY("0.0");
			struct.setALC_NOISSUE_QTY("0.0");
			struct.setTHIS_TIME_ISSUE_POSS_QTY("0.0");
			
			// 生産側の過去の実績入力の制限チェック
			PrivateConfig config = new PrivateConfig(conn);
			if("false".equals(config.getString("PAST_RESULT_ENTRY_TYP"))){
				if(chkProcExecDate("1","",struct.getRCV_ISSUE_DATE()) == false){
					setErrorMessage(ProcExecDateError);
					setErrorParameter("SYS_ACTUAL_COST_CTRL_AC", "PLANT_CD", struct.getPLANT_CD());
					setErrorParameter("SYS_ACTUAL_COST_CTRL_AC", "PROC_EXEC_DATE", struct.getPROC_EXEC_DATE().toString());
					return;
				}
			}

			// エラーチェック
			boolean check = true;		// チェック結果格納

			List tmpList = null;
			
			// システムパラメータの品質期限チェックフラグを取得
			if(null == getSysParameter("BEST_BEFORE_DATE_CHECK_FLG")){
				struct.setSYS_PARAMETER_VALUE("1");
			}else{
				struct.setSYS_PARAMETER_VALUE(getSysParameter("BEST_BEFORE_DATE_CHECK_FLG"));
			}
			

			// 整数管理品目で出庫数が小数の場合、整数に切り上げ処理
			boolean resultCeil = false;

			if(("1").equals(TypeConverter.sanitizer(struct.getUNIT_QTY_TYP())) == true &&
					Calculate.isNumeric(struct.getRCV_ISSUE_QTY()) == true ){
				struct.setRCV_ISSUE_QTY(Calculate.ceil(struct.getRCV_ISSUE_QTY(), 0));
				resultCeil = true;
			}

			// 出庫元保管区コードの存在チェック
			//   出庫数＝0の場合はチェックしない（null許可）
			if(((struct.getw_WH_CD() == null || ("").equals(struct.getw_WH_CD()) == true) &&
			    (Calculate.compare(struct.getRCV_ISSUE_QTY(), "0") == 0)) == false){
				struct.settmp_WH_CD(struct.getw_WH_CD());
				tmpList = entity.mcheckM_WH.read(conn, struct);
				if(tmpList.size() <= 0) {
					// 登録処理失敗：保管区コードが存在しません
					logMessage = "M_WH.WH_CD:" + struct.gettmp_WH_CD();
					setErrorMessage("AF00028", logMessage);
					check = false;
				}
				else{
					AF0020010Struct checkStruct = (AF0020010Struct)tmpList.get(0);
					struct.setw_WH_NAME(checkStruct.getWH_NAME());
					struct.setWH_TYP(checkStruct.getWH_TYP()); //倉庫区分
					// 保管区.工場コード ≠ ログイン利用者工場コード チェック
					if((checkStruct.getWH_PLANT_CD().equals(struct.getw_PLANT_CD())) == false){
						// 登録処理失敗：保管区コードは他の工場のデータなので指定できません
						listMessage.add("M_WH.WH_CD:" + struct.gettmp_WH_CD());
						listMessage.add("M_WH.PLANT_CD:" +  checkStruct.getWH_PLANT_CD());
						setErrorMessage("AF00029", listMessage);
						listMessage.clear();
						check = false;
					}
					else{
						if(("1").equals(checkStruct.getMRP_FLG()) == false){
							// 登録処理失敗：出庫元保管区が所要量計算対象ではありません
							listMessage.add("M_WH.WH_CD:" + struct.gettmp_WH_CD());
							listMessage.add("M_WH.MRP_FLG:" +  checkStruct.getMRP_FLG());
							setErrorMessage("AF00096", listMessage);
							listMessage.clear();
							check = false;
						}
					}
				}
			}

			// 在庫ロット番号の存在チェック
			//   出庫数＝0の場合はチェックしない（null許可）
			if (((struct.getw_STOCK_LOT_CD() == null 
					|| ("").equals(struct.getw_STOCK_LOT_CD()) == true) 
					&& (Calculate.compare(struct.getRCV_ISSUE_QTY(), "0") == 0)) == false) {
				tmpList = null;
				tmpList = entity.mT_LOT_CTRL.read(conn, struct);
				if (tmpList.size() <= 0) {
					logMessage = "T_LOT_CTRL.LOT_NO:" + struct.getw_STOCK_LOT_CD();
					setErrorMessage("AF20002", logMessage);
					check = false;
				}
			}

			// 在庫ロット番号がnull以外かつ出庫数が0以外の場合かつ
			// [ロット管理].”品質期限”＜ 「出庫日」－[出庫指示]．“品目番号”の[品目].”品質期限リードタイム”でかつ
			//[パラメータ].” 名前”＝’ BEST_BEFORE_DATE_CHECK_FLG’が1:エラーの場合、エラーメッセージを表示する
			
			boolean resultBbdcFlg = false;//在庫ロット番号がNULLでなく出庫数が0以外かつ品質期限が切れている場合にture
			
			if (((struct.getw_STOCK_LOT_CD() == null 
					|| ("").equals(struct.getw_STOCK_LOT_CD()) == true) 
					|| (Calculate.compare(struct.getRCV_ISSUE_QTY(), "0") == 0)) == false) {

				List bbdList = entity.mc_BEST_BEFORE_DATE.read(conn, struct);
				if(bbdList.size() > 0){
					AF0020010Struct bbdStruct = (AF0020010Struct)bbdList.get(0);
					if(bbdStruct.getBBD_c_FLG().equals("1")){//2:警告の場合のためにフラグを"true"にする
						resultBbdcFlg = true;
					}
					if(bbdStruct.getBBD_c_FLG().equals("1") && struct.getSYS_PARAMETER_VALUE().equals("1")){
						//品質期限が切れているため出庫できません。
						logMessage = "T_LOT_CTRL.LOT_NO:" + struct.getw_STOCK_LOT_CD();
						setErrorMessage("AE05060", logMessage);
						check = false;
					}
				}
			}

			// 業務運用日の取得
			tmpList = entity.mselectSYS_DATE_CTRL.read(conn, struct);
			if(tmpList.size() <= 0) {
				// 登録処理失敗：業務運用日が存在しません
				logMessage = "SYS_DATE_CTRL.PLANT_CD:" + struct.getw_PLANT_CD();
				setErrorMessage("AF00056", logMessage);
				check = false;
			}
			else{
				AF0020010Struct workStruct = (AF0020010Struct)tmpList.get(0);
				// 出庫日チェック
				Date issue_Date = stringToDate(struct.getRCV_ISSUE_DATE());
				Date business_Date = stringToDate(workStruct.getBUSINESS_OPR_DATE());
				if(issue_Date.getTime() > business_Date.getTime()){
					// 登録処理失敗：出庫日に未来の日付は指定できません
					logMessage = "SYS_DATE_CTRL.BUSINESS_OPR_DATE:" + workStruct.getBUSINESS_OPR_DATE();
					setErrorMessage("ZZ05103", logMessage);
					check = false;
				}
			}
			
			// 出庫指示番号を指定して出庫指示を読込
			AF0020010Struct checkStruct = null;
			AF0020010Struct readStruct = new AF0020010Struct();
			readStruct.setw_ISSUE_INST_CD(struct.getISSUE_INST_CD());
			readStruct.setw_WS_CD((String)null);
			readStruct.setw_VEND_CD((String)null);
			readStruct.setw_ISSUE_CMPLT_FLG((String)null);
			readStruct.setw_LOT_CTRL_FLG((String)null);
			readStruct.setw_PLANT_CD((String)null);
			tmpList = entity.mselect.read(conn, readStruct);
			if (tmpList.size() <= 0) {
				// 行修正処理失敗：選択された出庫指示データが存在しません
				logMessage = "T_ISSUE_INST.ISSUE_INST_CD:" + struct.getISSUE_INST_CD();
				setErrorMessage("ZZ01101", logMessage);
				check = false;
			} else {
				
				AF0020010Struct issueInstStruct = (AF0020010Struct)tmpList.get(0);
				
				// [出庫指示]の工程保管場所コードNull
				if (issueInstStruct.getWH_CD() == null 
						|| "".equals(issueInstStruct.getWH_CD())) {
					if (struct.getWH_CD() != null && "".equals(struct.getWH_CD()) == false) {
						// 登録処理失敗：出庫先保管区コードは入力できません。
						setErrorMessage("AF00138");
						check = false;
					}
				} else {
					if (struct.getWH_CD() == null || "".equals(struct.getWH_CD())) {
						// 登録処理失敗：出庫先保管区コードが未入力です。
						setErrorMessage("AF00030");
						check = false;
					} else {
						AF0020010Struct whStruct = new AF0020010Struct();
						whStruct.settmp_WH_CD(struct.getWH_CD());
						tmpList = entity.mcheckM_WH.read(conn, whStruct);
						if (tmpList.size() <= 0) {
							// 登録処理失敗：出庫先保管区コードが存在しません
							logMessage = "M_WH.WH_CD:" + whStruct.gettmp_WH_CD();
							setErrorMessage("AF00031", logMessage);
							check = false;
						} else {
							checkStruct = (AF0020010Struct)tmpList.get(0);
							// 工程保管場所.工場コード ≠ ログイン利用者工場コード チェック
							if((checkStruct.getWH_PLANT_CD().equals(getsysPLANT_CD())) == false){
								// 登録処理失敗：出庫先保管区コードは他の工場のデータなので指定できません
								listMessage.add("M_WH.WH_CD:" + whStruct.gettmp_WH_CD());
								listMessage.add("M_WH.PLANT_CD:" +  checkStruct.getWH_PLANT_CD());
								setErrorMessage("AF00032", listMessage);
								listMessage.clear();
								check = false;
							} else {
								if ("0".equals(checkStruct.getMRP_FLG()) == false) {
									// 登録処理失敗：出庫先保管区コードに所要量計算対象の保管区は指定できません。
									listMessage.add("M_WH.WH_CD:" + whStruct.gettmp_WH_CD());
									listMessage.add("M_WH.MRP_FLG:" +  checkStruct.getMRP_FLG());
									setErrorMessage("AF00139", listMessage);
									listMessage.clear();
									check = false;
								} else {
									if ("0".equals(struct.getCONS_TYP())) {
										// 取引先保管区が設定されている場合エラー
										if (checkStruct.getWH_VEND_CD() != null 
												&& "".equals(checkStruct.getWH_VEND_CD()) == false) {
											listMessage.add("M_WH.WH_CD:" + whStruct.gettmp_WH_CD());
											listMessage.add("M_WH.VEND_CD:" +  checkStruct.getWH_VEND_CD());
											setErrorMessage("AF00140", listMessage);
											listMessage.clear();
											check = false;
										}
									} else {
										if (issueInstStruct.getVEND_CD() == null 
												|| "".equals(issueInstStruct.getVEND_CD())) {
											if (checkStruct.getWH_VEND_CD() != null 
													&& "".equals(checkStruct.getWH_VEND_CD()) == false) {
												listMessage.add("M_WH.WH_CD:" + whStruct.gettmp_WH_CD());
												listMessage.add("M_WH.VEND_CD:" +  checkStruct.getWH_VEND_CD());
												setErrorMessage("AF00141", listMessage);
												listMessage.clear();
												check = false;
											}
										} else {
											if ((issueInstStruct.getVEND_CD()).equals(
													checkStruct.getWH_VEND_CD()) == false) {
												listMessage.add("M_WH.WH_CD:" + whStruct.gettmp_WH_CD());
												listMessage.add("M_WH.VEND_CD:" +  checkStruct.getWH_VEND_CD());
												setErrorMessage("AF00141", listMessage);
												listMessage.clear();
												check = false;
											}
										}
									}
								}
							}
						}
					}
				}
			}
			
			// 出庫指示数が0以上で保管区コードがnullでない場合
			if(struct.getw_WH_CD() != null && ("").equals(struct.getw_WH_CD()) == false && (Calculate.compare(struct.getRCV_ISSUE_QTY(), "0") != 0)){

				// 保管区別品目在庫の読込
				tmpList = entity.mselectSub1_ITEM.read(conn, struct);
				if(tmpList.size() <= 0) {
					// 登録処理失敗：保管区別品目在庫が存在しません
					listMessage.add("T_ITEM_STOCK.ITEM_CD:" + struct.getITEM_CD());
					listMessage.add("T_ITEM_STOCK.WH_CD:" + struct.getw_WH_CD());
					listMessage.add("T_ITEM_STOCK.PLANT_CD:" + struct.getw_PLANT_CD());
					setErrorMessage("AF00044", listMessage);
					listMessage.clear();
					check = false;
				}

			}

			// エラーがない場合
			if (check == true) {
				// トランザクション開始
				conn.beginTransWeb();
				
				// 製番、メーカロット番号のクリア
				struct.setw_JOB_ODR_CD(null);
				struct.setVEND_LOT_NO(null);
				
				// 出庫処理ＤＢ登録処理
				boolean result = insert_issue_process();
				if (result == false) {
					// ロールバック
					getMessage().clearWarn();
					getMessage().clearInfo();
					logMessage = "rollback!! ";
					setSyslogConfig(logMessage);
					conn.rollback();
				}
				else{
					// 入庫処理ＤＢ登録処理
					result = insert_rcv_process();
					if (result == false) {
						// ロールバック
						getMessage().clearWarn();
						getMessage().clearInfo();
						logMessage = "rollback!! ";
						setSyslogConfig(logMessage);
						conn.rollback();
					}
					else{
						// 出庫実績明細への登録
						// 出庫数が０の場合は、登録・更新を行わない
						if (struct.getRCV_ISSUE_QTY() != null 
								&& !"".equals(struct.getRCV_ISSUE_QTY())
								&& Calculate.compare(struct.getRCV_ISSUE_QTY(), "0") != 0) {
							//  データが存在しない場合登録、存在する場合更新
							List lockList = entity.mT_LOT_ISSUE_INST_Lock.read(conn, struct);
							if (lockList.size() <= 0) {
								entity.mT_LOT_ISSUE_INST.create(conn, struct);

							} else {
								AF0020010Struct lockStruct = new AF0020010Struct();
								lockStruct = (AF0020010Struct)lockList.get(0);
								// 出庫実績数量の計算
								//  [出庫実績明細]."出庫実績数" + 画面「出庫数」 
								String rcvIssueQty = "0";
								rcvIssueQty = Calculate.add(
										lockStruct.getISSUE_QTY(),
										struct.getRCV_ISSUE_QTY());
								struct.setISSUE_QTY(rcvIssueQty);	
								
								entity.mT_LOT_ISSUE_INST.update(conn, struct);
							}
						}
							
						
						// コミット
						conn.commit();
						
						if(resultCeil == true){
							// 登録処理結果：整数管理品目のため小数点以下は切り上げして更新しました
							logMessage = "T_ISSUE_INST.ISSUE_INST_CD:" + struct.getISSUE_INST_CD();
							setInfoMessage("AF60004", logMessage);
						}

						// 在庫ロット番号がnull以外かつ出庫数が0以外の場合かつ
						// [ロット管理].”品質期限”＜ 「出庫日」－[出庫指示]．“品目番号”の[品目].”品質期限リードタイム”でかつ
						//[パラメータ].” 名前”＝’ BEST_BEFORE_DATE_CHECK_FLG’が2:警告の場合、警告メッセージを表示する
						if(struct.getSYS_PARAMETER_VALUE().equals("2") && (resultBbdcFlg == true)){
							// 品質期限切れの出庫を行いました。
							logMessage = "T_LOT_CTRL.LOT_NO:" + struct.getw_STOCK_LOT_CD();
							setWarningMessage("AE05061", logMessage);
						}
						
						if ("true".equals(_keyStruct.getc_SHIP_COMPLETE())) {
							// キーコピー
							struct.copy(_keyStruct);
							// 完了通知メッセージ出力(業務ワーニング)
							//setWarningMessage("AF00132");
							//struct.setw_ISSUE_CMPLT_FLG("1");
						} else {
							// サブ2読込処理
							controlSelectSub2();
						}
						
					}
				}
			}
		}catch(SQLException e){
			// ロールバック
			getMessage().clearWarn();
			getMessage().clearInfo();
			logMessage = " rollback!! controlinsertSub1(SQLException) ";
			setSyslogConfig(logMessage);
			conn.rollback();

			setSqlExceptionMsg(e);

		}catch(Exception e){
			// ロールバック
			getMessage().clearWarn();
			getMessage().clearInfo();
			logMessage = "rollback!! controlinsertSub1(Exception) ";
			setSyslogConfig(logMessage);
			conn.rollback();

			ExpjException ee = new ExpjException(e, "ZZ01106");
			ExpjMessage emsg = new ExpjMessage( "ZZ01006" , "ProcessId:" + this.sp.getProcId() );
			ee.add(emsg);
			throw ee;
		}
                //}}user_implement_dev:<controlinsertSub2>
		logger.exiting("AF0020010Control"+":USER="+struct.getsUser_ID(),"controlinsertSub2");

		return;
	}

	/**
	 * 読込ボタン押下時に実行される処理です。
	 *
	 */
	public void controlSelectSub2() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0020");
		logger.entering("AF0020010Control"+":USER="+struct.getsUser_ID(),"controlSelectSub2");
			//{{user_implement_dev:<controlSelectSub2>
			// TODO: ユーザ定義のコードを記述してください
//		------------------------------------------------------------------
		// ログ出力情報格納用
		String logMessage = "";
		List listMessage = new ArrayList();

		boolean check = true;		// チェック結果格納

		try {

			// キー項目ログ表示
			logMessage = "T_ISSUE_INST.ISSUE_INST_CD:" + struct.getw_ISSUE_INST_CD();
			setSyslogConfig(logMessage);

			List tmpList = null;
			
			// 出庫元保管区名のクリア
			struct.setw_WH_NAME(null);

			// 出庫元保管区コードの存在チェック
			if(struct.getw_WH_CD() != null && !("").equals(struct.getw_WH_CD())){
				struct.settmp_WH_CD(struct.getw_WH_CD());
				tmpList = entity.mcheckM_WH.read(conn, struct);
				if(tmpList.size() <= 0) {
					// 登録処理失敗：保管区コードが存在しません
					logMessage = "M_WH.WH_CD:" + struct.gettmp_WH_CD();
					setErrorMessage("AF00028", logMessage);
					check = false;
				}
				else{
					AF0020010Struct checkStruct = (AF0020010Struct)tmpList.get(0);
					struct.setw_WH_NAME(checkStruct.getWH_NAME());
					// 保管区.工場コード ≠ ログイン利用者工場コード チェック
					if((checkStruct.getWH_PLANT_CD().equals(struct.getw_PLANT_CD())) == false){
						// 登録処理失敗：保管区コードは他の工場のデータなので指定できません
						listMessage.add("M_WH.WH_CD:" + struct.gettmp_WH_CD());
						listMessage.add("M_WH.PLANT_CD:" +  checkStruct.getWH_PLANT_CD());
						setErrorMessage("AF00029", listMessage);
						listMessage.clear();
						check = false;
					}
					else{
						// 保管区コードが倉庫かチェック
						if(("1").equals(checkStruct.getMRP_FLG()) == false){
							// 登録処理失敗：出庫元保管区が所要量計算対象ではありません
							listMessage.add("M_WH.WH_CD:" + struct.gettmp_WH_CD());
							listMessage.add("M_WH.MRP_FLG:" +  checkStruct.getMRP_FLG());
							setErrorMessage("AF00096", listMessage);
							listMessage.clear();
							check = false;
						}
					}
				}
			}
			
			// 在庫ロット番号の存在チェック
			if (struct.getw_STOCK_LOT_CD() != null 
					&& !("").equals(struct.getw_STOCK_LOT_CD())) {
				tmpList = null;
				tmpList = entity.mT_LOT_CTRL.read(conn, struct);
				if (tmpList.size() <= 0) {
					logMessage = "T_LOT_CTRL.LOT_NO:" + struct.getw_STOCK_LOT_CD();
					setErrorMessage("AF20002", logMessage);
					check = false;
				}
			}
			
			//リストクリア
			if (list != null) {
				list.clear();
			}
			if (issueList != null) {
				issueList.clear();
			}
			
			// エラーがあれば終了
            if (msgStruct.hasError()) {
             return;
            }
						
			// ロット別在庫一覧の取得
            list = entity.mT_LOT_STOCK.read(conn, struct);
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

            // 出庫実績明細一覧の取得
            issueList = entity.mT_LOT_ISSUE_INST.read(conn, struct);
            if (!issueList.isEmpty()) {
    			// 表示最大行数制限処理
    			ScreenParam sp = new ScreenParam(this.getClass());
    			int maxLine = sp.getMaxLine(conn,21);
    			if(maxLine != 0 && this.issueList.size() > maxLine){
    				setReadStatus(TOO_MANY);
    				this.issueList.clear();
    				logMessage = "";
    				setErrorMessage("ZZ01115", "", ""+maxLine);
    			}
            }

			
			// 読込時に、最新の詳細ウィンドウデータを取得する
            AF0020010Struct detailStruct = new AF0020010Struct();
            detailStruct.setw_ISSUE_INST_CD(struct.getISSUE_INST_CD());
            List detailList = new ArrayList();
            detailList = entity.mselect.read(conn, detailStruct);
			if(detailList.size() > 0) {
				detailStruct = new AF0020010Struct();
				detailStruct = (AF0020010Struct)detailList.get(0);
				
				struct.setITEM_CD(detailStruct.getITEM_CD());
				struct.setITEM_NAME(detailStruct.getITEM_NAME());
				struct.setDRAW_CD(detailStruct.getDRAW_CD());
				struct.setSPEC(detailStruct.getSPEC());
				struct.setISSUE_INST_QTY(detailStruct.getISSUE_INST_QTY());
				struct.setTOTAL_ISSUE_QTY(detailStruct.getTOTAL_ISSUE_QTY());
				struct.setw_SHIP_REMAIN_QTY(detailStruct.getw_SHIP_REMAIN_QTY());
				// 支給区分に表示する表示名の設定
				setConsTypeValue(detailStruct);
				struct.setCONS_NAME(detailStruct.getCONS_NAME());
				//完了フラグのセット
				struct.setISSUE_CMPLT_FLG(detailStruct.getISSUE_CMPLT_FLG());
			}


		} catch (SQLException e) {
			setSqlExceptionMsg(e);

		} finally {
			// モード設定
			if (check == true) {
				setReadStatus(NORMAL);
			}
		}
		//------------------------------------------------------------------
                //}}user_implement_dev:<controlSelectSub2>
		logger.exiting("AF0020010Control"+":USER="+struct.getsUser_ID(),"controlSelectSub2");

		return;
	}

	/**
	 * 戻るボタン押下時に実行される処理です。
	 *
	 */
	public void controlcloseSub2() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0020");
		logger.entering("AF0020010Control"+":USER="+struct.getsUser_ID(),"controlcloseSub2");
			//{{user_implement_dev:<controlcloseSub2>
		//------------------------------------------------------------------
		// キーコピー
		struct.copy(_keyStruct);

		// 親画面データ再読込
		controlselect();
		//------------------------------------------------------------------
                //}}user_implement_dev:<controlcloseSub2>
		logger.exiting("AF0020010Control"+":USER="+struct.getsUser_ID(),"controlcloseSub2");

		return;
	}

	/**
	 * 全選択ボタン押下時に実行される処理です。
	 *
	 */
	public void controlchoiceAll() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0020");
		logger.entering("AF0020010Control"+":USER="+struct.getsUser_ID(),"controlchoiceAll");
			//{{user_implement_dev:<controlchoiceAll>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlchoiceAll>
		logger.exiting("AF0020010Control"+":USER="+struct.getsUser_ID(),"controlchoiceAll");

		return;
	}

	/**
	 * 全解除ボタン押下時に実行される処理です。
	 *
	 */
	public void controlcancelAll() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0020");
		logger.entering("AF0020010Control"+":USER="+struct.getsUser_ID(),"controlcancelAll");
			//{{user_implement_dev:<controlcancelAll>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlcancelAll>
		logger.exiting("AF0020010Control"+":USER="+struct.getsUser_ID(),"controlcancelAll");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0020");
		logger.entering("AF0020010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
		//------------------------------------------------------------------
		// ユーザ定義初期化
		usersInitialize();
		
		//------------------------------------------------------------------
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AF0020010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0020");
		logger.entering("AF0020010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
		//------------------------------------------------------------------
		// ユーザ定義初期化
		usersInitialize();
		// 会社コード取得
		_company_cd = SystemInformation.getSysMyCompanyCd();
		//------------------------------------------------------------------
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AF0020010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * イベントハンドラの前処理です。
	 *
	 * @param buttun ボタン名
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0020");
		logger.entering("AF0020010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
				// コンボボックスデータ用意
				// 出庫完了フラグ
				_w_ISSUE_CMPLT_FLG = comboController.getData("ISSUE_CMPLT_FLG");
				// ロット管理フラグ
				_LOT_CTRL_FLG = comboController.getData("LOT_CTRL_FLG");
				// 支給区分
				_CONS_TYP = comboController.getData("CONS_TYP");
			}catch(SQLException e){
				setSqlExceptionMsg(e);
			}catch(ComboException e){
				ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
				sysLog.severe(emsg, getsysUSER_CD());
				ExpjException ee = new ExpjException(e, emsg);
				throw ee;
			}
			
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("AF0020010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("insert") ) {
				controlinsert();
			} else if( button.equals("clear") ) {
				controlclear();
			} else if( button.equals("selectSub1") ) {
				controlselectSub1();
			} else if( button.equals("insertSub1") ) {
				controlinsertSub1();
			} else if( button.equals("closeSub1") ) {
				controlcloseSub1();
			} else if( button.equals("CmpltCancel") ) {
				controlCmpltCancel();
			} else if( button.equals("insertSub2") ) {
				controlinsertSub2();
			} else if( button.equals("SelectSub2") ) {
				controlSelectSub2();
			} else if( button.equals("closeSub2") ) {
				controlcloseSub2();
			} else if( button.equals("choiceAll") ) {
				controlchoiceAll();
			} else if( button.equals("cancelAll") ) {
				controlcancelAll();
			} else if( button.equals("initial") ) {
				controlINITIAL();
			} else if( button.equals("reload") ) {
				controlRELOAD();
			}
		//{{user_implement_dev:<control_eventHandller>
		//------------------------------------------------------------------
		//コンボボックスに取得データ設定
			struct.setList_w_ISSUE_CMPLT_FLG_val(_w_ISSUE_CMPLT_FLG.getValList());
			struct.setList_w_ISSUE_CMPLT_FLG_name(_w_ISSUE_CMPLT_FLG.getExplanList());
			
			struct.setList_CONS_TYP_val(_CONS_TYP.getValList());
			struct.setList_CONS_TYP_name(_CONS_TYP.getExplanList());
			
			struct.setList_w_LOT_CTRL_FLG_val(_LOT_CTRL_FLG.getValList());
			struct.setList_w_LOT_CTRL_FLG_name(_LOT_CTRL_FLG.getExplanList());
			
//		ソース内にまだAlarmMessageExceptionが残っている場合は、以下の行のコメントを外してAlarmMessageExceptionを始末する。
		} catch(AlarmMessageException ame){
			ExpjException ee = new ExpjException(ame, (ExpjMessageList)((Object)ame.getMessages()));
			throw ee;
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
//			throw new FoundationException("AF0020010Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AF0020010-E999","CSVの出力処理"));
			throw new FoundationException("AF0020010Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AF0020010-E999","システム日付の取得処理"));
				throw new FoundationException("AF0020010Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AF0020010-E999","コントロールのイベント処理"));
			throw new FoundationException("AF0020010Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected AF0020010Entity entity;
	protected AF0020010Struct struct;
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

		entity = new AF0020010Entity();
		struct = new AF0020010Struct();

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
	 * AF0020010クラスの標準コンストラクタ
	 */
	public AF0020010Control() throws BusinessProcessException, FoundationException
	{
		initialize();

		//conn = connect();
		//{{user_implement_code_constractor
		//------------------------------------------------------------------
		list = new ArrayList(0);
        //------------------------------------------------------------------
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
				AF0020010Struct key = (AF0020010Struct)keyList.get(j);
				// メッセージキーを作成する
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("w_ISSUE_CMPLT_FLG_name") && key.getw_ISSUE_CMPLT_FLG_name() != null) {
					msgKey.setKeyValue("w_ISSUE_CMPLT_FLG_name", key.getw_ISSUE_CMPLT_FLG_name());
				}
				if(msgKeyType.containsKeyColumn("w_ISSUE_CMPLT_FLG_val") && key.getw_ISSUE_CMPLT_FLG_val() != null) {
					msgKey.setKeyValue("w_ISSUE_CMPLT_FLG_val", key.getw_ISSUE_CMPLT_FLG_val());
				}
				if(msgKeyType.containsKeyColumn("h_JOB_ODR") && key.geth_JOB_ODR() != null) {
					msgKey.setKeyValue("h_JOB_ODR", key.geth_JOB_ODR().toString());
				}
				if(msgKeyType.containsKeyColumn("w_WH_NAME") && key.getw_WH_NAME() != null) {
					msgKey.setKeyValue("w_WH_NAME", key.getw_WH_NAME());
				}
				if(msgKeyType.containsKeyColumn("h_SHIP_COMPLETE") && key.geth_SHIP_COMPLETE() != null) {
					msgKey.setKeyValue("h_SHIP_COMPLETE", key.geth_SHIP_COMPLETE().toString());
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
				if(msgKeyType.containsKeyColumn("c_SHIP_COMPLETE") && key.getc_SHIP_COMPLETE() != null) {
					msgKey.setKeyValue("c_SHIP_COMPLETE", key.getc_SHIP_COMPLETE());
				}
				if(msgKeyType.containsKeyColumn("c_JOB_ODR") && key.getc_JOB_ODR() != null) {
					msgKey.setKeyValue("c_JOB_ODR", key.getc_JOB_ODR());
				}
				if(msgKeyType.containsKeyColumn("CONS_NAME") && key.getCONS_NAME() != null) {
					msgKey.setKeyValue("CONS_NAME", key.getCONS_NAME());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_CD") && key.getOPR_INST_CD() != null) {
					msgKey.setKeyValue("OPR_INST_CD", key.getOPR_INST_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_STOCK_NON_ALC_QTY") && key.getITEM_STOCK_NON_ALC_QTY() != null) {
					msgKey.setKeyValue("ITEM_STOCK_NON_ALC_QTY", key.getITEM_STOCK_NON_ALC_QTY());
				}
				if(msgKeyType.containsKeyColumn("ODR_ISSUE_POSS_QTY") && key.getODR_ISSUE_POSS_QTY() != null) {
					msgKey.setKeyValue("ODR_ISSUE_POSS_QTY", key.getODR_ISSUE_POSS_QTY());
				}
				if(msgKeyType.containsKeyColumn("ALC_NOISSUE_QTY") && key.getALC_NOISSUE_QTY() != null) {
					msgKey.setKeyValue("ALC_NOISSUE_QTY", key.getALC_NOISSUE_QTY());
				}
				if(msgKeyType.containsKeyColumn("THIS_TIME_ISSUE_POSS_QTY") && key.getTHIS_TIME_ISSUE_POSS_QTY() != null) {
					msgKey.setKeyValue("THIS_TIME_ISSUE_POSS_QTY", key.getTHIS_TIME_ISSUE_POSS_QTY());
				}
				if(msgKeyType.containsKeyColumn("WH_FLG") && key.getWH_FLG() != null) {
					msgKey.setKeyValue("WH_FLG", key.getWH_FLG());
				}
				if(msgKeyType.containsKeyColumn("h_WH_CD") && key.geth_WH_CD() != null) {
					msgKey.setKeyValue("h_WH_CD", key.geth_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("w_CHOICE_4") && key.getw_CHOICE_4() != null) {
					msgKey.setKeyValue("w_CHOICE_4", key.getw_CHOICE_4());
				}
				if(msgKeyType.containsKeyColumn("w_CHOICE_5") && key.getw_CHOICE_5() != null) {
					msgKey.setKeyValue("w_CHOICE_5", key.getw_CHOICE_5());
				}
				if(msgKeyType.containsKeyColumn("w_LOT_CTRL_FLG_name") && key.getw_LOT_CTRL_FLG_name() != null) {
					msgKey.setKeyValue("w_LOT_CTRL_FLG_name", key.getw_LOT_CTRL_FLG_name());
				}
				if(msgKeyType.containsKeyColumn("w_LOT_CTRL_FLG_val") && key.getw_LOT_CTRL_FLG_val() != null) {
					msgKey.setKeyValue("w_LOT_CTRL_FLG_val", key.getw_LOT_CTRL_FLG_val());
				}
				if(msgKeyType.containsKeyColumn("h_SYS_LOT_CTRL_FLG") && key.geth_SYS_LOT_CTRL_FLG() != null) {
					msgKey.setKeyValue("h_SYS_LOT_CTRL_FLG", key.geth_SYS_LOT_CTRL_FLG());
				}
				if(msgKeyType.containsKeyColumn("w_CHOICE") && key.getw_CHOICE() != null) {
					msgKey.setKeyValue("w_CHOICE", key.getw_CHOICE());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT_1") && key.getSTOCK_UNIT_1() != null) {
					msgKey.setKeyValue("STOCK_UNIT_1", key.getSTOCK_UNIT_1());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT_2") && key.getSTOCK_UNIT_2() != null) {
					msgKey.setKeyValue("STOCK_UNIT_2", key.getSTOCK_UNIT_2());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT_3") && key.getSTOCK_UNIT_3() != null) {
					msgKey.setKeyValue("STOCK_UNIT_3", key.getSTOCK_UNIT_3());
				}
				if(msgKeyType.containsKeyColumn("w_PLANT_CD") && key.getw_PLANT_CD() != null) {
					msgKey.setKeyValue("w_PLANT_CD", key.getw_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("CONS_TYP_val") && key.getCONS_TYP_val() != null) {
					msgKey.setKeyValue("CONS_TYP_val", key.getCONS_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("CONS_TYP_name") && key.getCONS_TYP_name() != null) {
					msgKey.setKeyValue("CONS_TYP_name", key.getCONS_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("WS_PLANT_CD") && key.getWS_PLANT_CD() != null) {
					msgKey.setKeyValue("WS_PLANT_CD", key.getWS_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("WH_PLANT_CD") && key.getWH_PLANT_CD() != null) {
					msgKey.setKeyValue("WH_PLANT_CD", key.getWH_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("tmp_WH_CD") && key.gettmp_WH_CD() != null) {
					msgKey.setKeyValue("tmp_WH_CD", key.gettmp_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("tmp_RCV_ISSUE_QTY") && key.gettmp_RCV_ISSUE_QTY() != null) {
					msgKey.setKeyValue("tmp_RCV_ISSUE_QTY", key.gettmp_RCV_ISSUE_QTY());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_INST_CD") && key.getISSUE_INST_CD() != null) {
					msgKey.setKeyValue("ISSUE_INST_CD", key.getISSUE_INST_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_INST_QTY") && key.getISSUE_INST_QTY() != null) {
					msgKey.setKeyValue("ISSUE_INST_QTY", key.getISSUE_INST_QTY());
				}
				if(msgKeyType.containsKeyColumn("TOTAL_ISSUE_QTY") && key.getTOTAL_ISSUE_QTY() != null) {
					msgKey.setKeyValue("TOTAL_ISSUE_QTY", key.getTOTAL_ISSUE_QTY());
				}
				if(msgKeyType.containsKeyColumn("w_SHIP_REMAIN_QTY") && key.getw_SHIP_REMAIN_QTY() != null) {
					msgKey.setKeyValue("w_SHIP_REMAIN_QTY", key.getw_SHIP_REMAIN_QTY());
				}
				if(msgKeyType.containsKeyColumn("SCDL_ISSUE_DATE") && key.getSCDL_ISSUE_DATE() != null) {
					msgKey.setKeyValue("SCDL_ISSUE_DATE", key.getSCDL_ISSUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_CMPLT_DATE") && key.getISSUE_CMPLT_DATE() != null) {
					msgKey.setKeyValue("ISSUE_CMPLT_DATE", key.getISSUE_CMPLT_DATE());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_CMPLT_FLG") && key.getISSUE_CMPLT_FLG() != null) {
					msgKey.setKeyValue("ISSUE_CMPLT_FLG", key.getISSUE_CMPLT_FLG());
				}
				if(msgKeyType.containsKeyColumn("WH_CD") && key.getWH_CD() != null) {
					msgKey.setKeyValue("WH_CD", key.getWH_CD());
				}
				if(msgKeyType.containsKeyColumn("WS_CD") && key.getWS_CD() != null) {
					msgKey.setKeyValue("WS_CD", key.getWS_CD());
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
				if(msgKeyType.containsKeyColumn("COMPANY_CD") && key.getCOMPANY_CD() != null) {
					msgKey.setKeyValue("COMPANY_CD", key.getCOMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("CONS_TYP") && key.getCONS_TYP() != null) {
					msgKey.setKeyValue("CONS_TYP", key.getCONS_TYP());
				}
				if(msgKeyType.containsKeyColumn("OD_NO") && key.getOD_NO() != null) {
					msgKey.setKeyValue("OD_NO", key.getOD_NO());
				}
				if(msgKeyType.containsKeyColumn("MODIFY_COUNT") && key.getMODIFY_COUNT() != null) {
					msgKey.setKeyValue("MODIFY_COUNT", key.getMODIFY_COUNT().toString());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_CD") && key.getJOB_ODR_CD() != null) {
					msgKey.setKeyValue("JOB_ODR_CD", key.getJOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_DETAIL_NO") && key.getJOB_ODR_DETAIL_NO() != null) {
					msgKey.setKeyValue("JOB_ODR_DETAIL_NO", key.getJOB_ODR_DETAIL_NO().toString());
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
				if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP") && key.getUNIT_QTY_TYP() != null) {
					msgKey.setKeyValue("UNIT_QTY_TYP", key.getUNIT_QTY_TYP());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP") && key.getMRP_ODR_TYP() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP", key.getMRP_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("WH_NAME") && key.getWH_NAME() != null) {
					msgKey.setKeyValue("WH_NAME", key.getWH_NAME());
				}
				if(msgKeyType.containsKeyColumn("WS_NAME") && key.getWS_NAME() != null) {
					msgKey.setKeyValue("WS_NAME", key.getWS_NAME());
				}
				if(msgKeyType.containsKeyColumn("VEND_NAME") && key.getVEND_NAME() != null) {
					msgKey.setKeyValue("VEND_NAME", key.getVEND_NAME());
				}
				if(msgKeyType.containsKeyColumn("PROC_NAME") && key.getPROC_NAME() != null) {
					msgKey.setKeyValue("PROC_NAME", key.getPROC_NAME());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_CD_proc") && key.getOPR_INST_CD_proc() != null) {
					msgKey.setKeyValue("OPR_INST_CD_proc", key.getOPR_INST_CD_proc());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_CD_item") && key.getOPR_INST_CD_item() != null) {
					msgKey.setKeyValue("OPR_INST_CD_item", key.getOPR_INST_CD_item());
				}
				if(msgKeyType.containsKeyColumn("w_ISSUE_INST_CD") && key.getw_ISSUE_INST_CD() != null) {
					msgKey.setKeyValue("w_ISSUE_INST_CD", key.getw_ISSUE_INST_CD());
				}
				if(msgKeyType.containsKeyColumn("w_WS_CD") && key.getw_WS_CD() != null) {
					msgKey.setKeyValue("w_WS_CD", key.getw_WS_CD());
				}
				if(msgKeyType.containsKeyColumn("w_VEND_CD") && key.getw_VEND_CD() != null) {
					msgKey.setKeyValue("w_VEND_CD", key.getw_VEND_CD());
				}
				if(msgKeyType.containsKeyColumn("w_ISSUE_CMPLT_FLG") && key.getw_ISSUE_CMPLT_FLG() != null) {
					msgKey.setKeyValue("w_ISSUE_CMPLT_FLG", key.getw_ISSUE_CMPLT_FLG());
				}
				if(msgKeyType.containsKeyColumn("t_WORK_ODR_CD") && key.gett_WORK_ODR_CD() != null) {
					msgKey.setKeyValue("t_WORK_ODR_CD", key.gett_WORK_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("t_WORK_IN_PROC_CD") && key.gett_WORK_IN_PROC_CD() != null) {
					msgKey.setKeyValue("t_WORK_IN_PROC_CD", key.gett_WORK_IN_PROC_CD());
				}
				if(msgKeyType.containsKeyColumn("w_PUCH_ODR_CD") && key.getw_PUCH_ODR_CD() != null) {
					msgKey.setKeyValue("w_PUCH_ODR_CD", key.getw_PUCH_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("w_LOT_CTRL_FLG") && key.getw_LOT_CTRL_FLG() != null) {
					msgKey.setKeyValue("w_LOT_CTRL_FLG", key.getw_LOT_CTRL_FLG());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_CTRL_CD") && key.getRCV_ISSUE_CTRL_CD() != null) {
					msgKey.setKeyValue("RCV_ISSUE_CTRL_CD", key.getRCV_ISSUE_CTRL_CD());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_TYP") && key.getRCV_ISSUE_TYP() != null) {
					msgKey.setKeyValue("RCV_ISSUE_TYP", key.getRCV_ISSUE_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("w_JOB_ODR_CD") && key.getw_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("w_JOB_ODR_CD", key.getw_JOB_ODR_CD());
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
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_CMPLT_FLG") && key.getRCV_ISSUE_CMPLT_FLG() != null) {
					msgKey.setKeyValue("RCV_ISSUE_CMPLT_FLG", key.getRCV_ISSUE_CMPLT_FLG().toString());
				}
				if(msgKeyType.containsKeyColumn("VEND_LOT_NO") && key.getVEND_LOT_NO() != null) {
					msgKey.setKeyValue("VEND_LOT_NO", key.getVEND_LOT_NO());
				}
				if(msgKeyType.containsKeyColumn("w_STOCK_LOT_CD") && key.getw_STOCK_LOT_CD() != null) {
					msgKey.setKeyValue("w_STOCK_LOT_CD", key.getw_STOCK_LOT_CD());
				}
				if(msgKeyType.containsKeyColumn("w_WS_NAME") && key.getw_WS_NAME() != null) {
					msgKey.setKeyValue("w_WS_NAME", key.getw_WS_NAME());
				}
				if(msgKeyType.containsKeyColumn("w_VEND_NAME") && key.getw_VEND_NAME() != null) {
					msgKey.setKeyValue("w_VEND_NAME", key.getw_VEND_NAME());
				}
				if(msgKeyType.containsKeyColumn("WH_VEND_CD") && key.getWH_VEND_CD() != null) {
					msgKey.setKeyValue("WH_VEND_CD", key.getWH_VEND_CD());
				}
				if(msgKeyType.containsKeyColumn("WH_TYP") && key.getWH_TYP() != null) {
					msgKey.setKeyValue("WH_TYP", key.getWH_TYP());
				}
				if(msgKeyType.containsKeyColumn("MRP_FLG") && key.getMRP_FLG() != null) {
					msgKey.setKeyValue("MRP_FLG", key.getMRP_FLG());
				}
				if(msgKeyType.containsKeyColumn("w_STOCK_ON_HAND_QTY") && key.getw_STOCK_ON_HAND_QTY() != null) {
					msgKey.setKeyValue("w_STOCK_ON_HAND_QTY", key.getw_STOCK_ON_HAND_QTY());
				}
				if(msgKeyType.containsKeyColumn("w_WH_CD") && key.getw_WH_CD() != null) {
					msgKey.setKeyValue("w_WH_CD", key.getw_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("w_TOTAL_STOCK_ON_HAND_QTY") && key.getw_TOTAL_STOCK_ON_HAND_QTY() != null) {
					msgKey.setKeyValue("w_TOTAL_STOCK_ON_HAND_QTY", key.getw_TOTAL_STOCK_ON_HAND_QTY());
				}
				if(msgKeyType.containsKeyColumn("BUSINESS_OPR_DATE") && key.getBUSINESS_OPR_DATE() != null) {
					msgKey.setKeyValue("BUSINESS_OPR_DATE", key.getBUSINESS_OPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("ONEROUS_CONS_NO") && key.getONEROUS_CONS_NO() != null) {
					msgKey.setKeyValue("ONEROUS_CONS_NO", key.getONEROUS_CONS_NO());
				}
				if(msgKeyType.containsKeyColumn("UNIT_COST") && key.getUNIT_COST() != null) {
					msgKey.setKeyValue("UNIT_COST", key.getUNIT_COST());
				}
				if(msgKeyType.containsKeyColumn("UNIT_COST_TYP") && key.getUNIT_COST_TYP() != null) {
					msgKey.setKeyValue("UNIT_COST_TYP", key.getUNIT_COST_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("RETURNED_WH_CD") && key.getRETURNED_WH_CD() != null) {
					msgKey.setKeyValue("RETURNED_WH_CD", key.getRETURNED_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("ONEROUS_FLG") && key.getONEROUS_FLG() != null) {
					msgKey.setKeyValue("ONEROUS_FLG", key.getONEROUS_FLG());
				}
				if(msgKeyType.containsKeyColumn("THIS_MONTH") && key.getTHIS_MONTH() != null) {
					msgKey.setKeyValue("THIS_MONTH", key.getTHIS_MONTH());
				}
				if(msgKeyType.containsKeyColumn("INSTALL_FLG") && key.getINSTALL_FLG() != null) {
					msgKey.setKeyValue("INSTALL_FLG", key.getINSTALL_FLG());
				}
				if(msgKeyType.containsKeyColumn("w_OPR_INST_CD") && key.getw_OPR_INST_CD() != null) {
					msgKey.setKeyValue("w_OPR_INST_CD", key.getw_OPR_INST_CD());
				}
				if(msgKeyType.containsKeyColumn("SYS_PARAMETER_VALUE") && key.getSYS_PARAMETER_VALUE() != null) {
					msgKey.setKeyValue("SYS_PARAMETER_VALUE", key.getSYS_PARAMETER_VALUE());
				}
				if(msgKeyType.containsKeyColumn("SYS_PARAMETER_NAME") && key.getSYS_PARAMETER_NAME() != null) {
					msgKey.setKeyValue("SYS_PARAMETER_NAME", key.getSYS_PARAMETER_NAME());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_QTY") && key.getISSUE_QTY() != null) {
					msgKey.setKeyValue("ISSUE_QTY", key.getISSUE_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_LOT_NO") && key.getl_LOT_NO() != null) {
					msgKey.setKeyValue("l_LOT_NO", key.getl_LOT_NO());
				}
				if(msgKeyType.containsKeyColumn("l_PUCH_ODR_CD") && key.getl_PUCH_ODR_CD() != null) {
					msgKey.setKeyValue("l_PUCH_ODR_CD", key.getl_PUCH_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("l_WORK_ODR_CD") && key.getl_WORK_ODR_CD() != null) {
					msgKey.setKeyValue("l_WORK_ODR_CD", key.getl_WORK_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ISSUE_QTY") && key.getl_ISSUE_QTY() != null) {
					msgKey.setKeyValue("l_ISSUE_QTY", key.getl_ISSUE_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_ISSUE_DATE") && key.getl_ISSUE_DATE() != null) {
					msgKey.setKeyValue("l_ISSUE_DATE", key.getl_ISSUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_SPENT_QTY") && key.getl_SPENT_QTY() != null) {
					msgKey.setKeyValue("l_SPENT_QTY", key.getl_SPENT_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_STOCK_UNIT") && key.getl_STOCK_UNIT() != null) {
					msgKey.setKeyValue("l_STOCK_UNIT", key.getl_STOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_QTY") && key.getRCV_ISSUE_QTY() != null) {
					msgKey.setKeyValue("RCV_ISSUE_QTY", key.getRCV_ISSUE_QTY());
				}
				if(msgKeyType.containsKeyColumn("BBD_c_FLG") && key.getBBD_c_FLG() != null) {
					msgKey.setKeyValue("BBD_c_FLG", key.getBBD_c_FLG());
				}
				if(msgKeyType.containsKeyColumn("l_WH_CD") && key.getl_WH_CD() != null) {
					msgKey.setKeyValue("l_WH_CD", key.getl_WH_CD());
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
				if(msgKeyType.containsKeyColumn("l_WH_NAME") && key.getl_WH_NAME() != null) {
					msgKey.setKeyValue("l_WH_NAME", key.getl_WH_NAME());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_CD_GNR_TYP") && key.getOPR_INST_CD_GNR_TYP() != null) {
					msgKey.setKeyValue("OPR_INST_CD_GNR_TYP", key.getOPR_INST_CD_GNR_TYP());
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
					AF0020010Struct key = new AF0020010Struct();
					if(msgKeyType.containsKeyColumn("w_ISSUE_CMPLT_FLG_name")) {
						key.setw_ISSUE_CMPLT_FLG_name(msgKey.getKeyValue("w_ISSUE_CMPLT_FLG_name"));
					}
					if(msgKeyType.containsKeyColumn("w_ISSUE_CMPLT_FLG_val")) {
						key.setw_ISSUE_CMPLT_FLG_val(msgKey.getKeyValue("w_ISSUE_CMPLT_FLG_val"));
					}
					if(msgKeyType.containsKeyColumn("h_JOB_ODR")) {
						key.seth_JOB_ODR(new Integer(msgKey.getKeyValue("h_JOB_ODR")));
					}
					if(msgKeyType.containsKeyColumn("w_WH_NAME")) {
						key.setw_WH_NAME(msgKey.getKeyValue("w_WH_NAME"));
					}
					if(msgKeyType.containsKeyColumn("h_SHIP_COMPLETE")) {
						key.seth_SHIP_COMPLETE(new Integer(msgKey.getKeyValue("h_SHIP_COMPLETE")));
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
					if(msgKeyType.containsKeyColumn("c_SHIP_COMPLETE")) {
						key.setc_SHIP_COMPLETE(msgKey.getKeyValue("c_SHIP_COMPLETE"));
					}
					if(msgKeyType.containsKeyColumn("c_JOB_ODR")) {
						key.setc_JOB_ODR(msgKey.getKeyValue("c_JOB_ODR"));
					}
					if(msgKeyType.containsKeyColumn("CONS_NAME")) {
						key.setCONS_NAME(msgKey.getKeyValue("CONS_NAME"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_CD")) {
						key.setOPR_INST_CD(msgKey.getKeyValue("OPR_INST_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_STOCK_NON_ALC_QTY")) {
						key.setITEM_STOCK_NON_ALC_QTY(msgKey.getKeyValue("ITEM_STOCK_NON_ALC_QTY"));
					}
					if(msgKeyType.containsKeyColumn("ODR_ISSUE_POSS_QTY")) {
						key.setODR_ISSUE_POSS_QTY(msgKey.getKeyValue("ODR_ISSUE_POSS_QTY"));
					}
					if(msgKeyType.containsKeyColumn("ALC_NOISSUE_QTY")) {
						key.setALC_NOISSUE_QTY(msgKey.getKeyValue("ALC_NOISSUE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("THIS_TIME_ISSUE_POSS_QTY")) {
						key.setTHIS_TIME_ISSUE_POSS_QTY(msgKey.getKeyValue("THIS_TIME_ISSUE_POSS_QTY"));
					}
					if(msgKeyType.containsKeyColumn("WH_FLG")) {
						key.setWH_FLG(msgKey.getKeyValue("WH_FLG"));
					}
					if(msgKeyType.containsKeyColumn("h_WH_CD")) {
						key.seth_WH_CD(msgKey.getKeyValue("h_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_CHOICE_4")) {
						key.setw_CHOICE_4(msgKey.getKeyValue("w_CHOICE_4"));
					}
					if(msgKeyType.containsKeyColumn("w_CHOICE_5")) {
						key.setw_CHOICE_5(msgKey.getKeyValue("w_CHOICE_5"));
					}
					if(msgKeyType.containsKeyColumn("w_LOT_CTRL_FLG_name")) {
						key.setw_LOT_CTRL_FLG_name(msgKey.getKeyValue("w_LOT_CTRL_FLG_name"));
					}
					if(msgKeyType.containsKeyColumn("w_LOT_CTRL_FLG_val")) {
						key.setw_LOT_CTRL_FLG_val(msgKey.getKeyValue("w_LOT_CTRL_FLG_val"));
					}
					if(msgKeyType.containsKeyColumn("h_SYS_LOT_CTRL_FLG")) {
						key.seth_SYS_LOT_CTRL_FLG(msgKey.getKeyValue("h_SYS_LOT_CTRL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("w_CHOICE")) {
						key.setw_CHOICE(msgKey.getKeyValue("w_CHOICE"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT_1")) {
						key.setSTOCK_UNIT_1(msgKey.getKeyValue("STOCK_UNIT_1"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT_2")) {
						key.setSTOCK_UNIT_2(msgKey.getKeyValue("STOCK_UNIT_2"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT_3")) {
						key.setSTOCK_UNIT_3(msgKey.getKeyValue("STOCK_UNIT_3"));
					}
					if(msgKeyType.containsKeyColumn("w_PLANT_CD")) {
						key.setw_PLANT_CD(msgKey.getKeyValue("w_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("CONS_TYP_val")) {
						key.setCONS_TYP_val(msgKey.getKeyValue("CONS_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("CONS_TYP_name")) {
						key.setCONS_TYP_name(msgKey.getKeyValue("CONS_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("WS_PLANT_CD")) {
						key.setWS_PLANT_CD(msgKey.getKeyValue("WS_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("WH_PLANT_CD")) {
						key.setWH_PLANT_CD(msgKey.getKeyValue("WH_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("tmp_WH_CD")) {
						key.settmp_WH_CD(msgKey.getKeyValue("tmp_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("tmp_RCV_ISSUE_QTY")) {
						key.settmp_RCV_ISSUE_QTY(msgKey.getKeyValue("tmp_RCV_ISSUE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_INST_CD")) {
						key.setISSUE_INST_CD(msgKey.getKeyValue("ISSUE_INST_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_INST_QTY")) {
						key.setISSUE_INST_QTY(msgKey.getKeyValue("ISSUE_INST_QTY"));
					}
					if(msgKeyType.containsKeyColumn("TOTAL_ISSUE_QTY")) {
						key.setTOTAL_ISSUE_QTY(msgKey.getKeyValue("TOTAL_ISSUE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("w_SHIP_REMAIN_QTY")) {
						key.setw_SHIP_REMAIN_QTY(msgKey.getKeyValue("w_SHIP_REMAIN_QTY"));
					}
					if(msgKeyType.containsKeyColumn("SCDL_ISSUE_DATE")) {
						key.setSCDL_ISSUE_DATE(msgKey.getKeyValue("SCDL_ISSUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_CMPLT_DATE")) {
						key.setISSUE_CMPLT_DATE(msgKey.getKeyValue("ISSUE_CMPLT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_CMPLT_FLG")) {
						key.setISSUE_CMPLT_FLG(msgKey.getKeyValue("ISSUE_CMPLT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("WH_CD")) {
						key.setWH_CD(msgKey.getKeyValue("WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("WS_CD")) {
						key.setWS_CD(msgKey.getKeyValue("WS_CD"));
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
					if(msgKeyType.containsKeyColumn("COMPANY_CD")) {
						key.setCOMPANY_CD(msgKey.getKeyValue("COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("CONS_TYP")) {
						key.setCONS_TYP(msgKey.getKeyValue("CONS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("OD_NO")) {
						key.setOD_NO(msgKey.getKeyValue("OD_NO"));
					}
					if(msgKeyType.containsKeyColumn("MODIFY_COUNT")) {
						key.setMODIFY_COUNT(new Integer(msgKey.getKeyValue("MODIFY_COUNT")));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_CD")) {
						key.setJOB_ODR_CD(msgKey.getKeyValue("JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_DETAIL_NO")) {
						key.setJOB_ODR_DETAIL_NO(new Integer(msgKey.getKeyValue("JOB_ODR_DETAIL_NO")));
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
					if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP")) {
						key.setUNIT_QTY_TYP(msgKey.getKeyValue("UNIT_QTY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP")) {
						key.setMRP_ODR_TYP(msgKey.getKeyValue("MRP_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("WH_NAME")) {
						key.setWH_NAME(msgKey.getKeyValue("WH_NAME"));
					}
					if(msgKeyType.containsKeyColumn("WS_NAME")) {
						key.setWS_NAME(msgKey.getKeyValue("WS_NAME"));
					}
					if(msgKeyType.containsKeyColumn("VEND_NAME")) {
						key.setVEND_NAME(msgKey.getKeyValue("VEND_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PROC_NAME")) {
						key.setPROC_NAME(msgKey.getKeyValue("PROC_NAME"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_CD_proc")) {
						key.setOPR_INST_CD_proc(msgKey.getKeyValue("OPR_INST_CD_proc"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_CD_item")) {
						key.setOPR_INST_CD_item(msgKey.getKeyValue("OPR_INST_CD_item"));
					}
					if(msgKeyType.containsKeyColumn("w_ISSUE_INST_CD")) {
						key.setw_ISSUE_INST_CD(msgKey.getKeyValue("w_ISSUE_INST_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_WS_CD")) {
						key.setw_WS_CD(msgKey.getKeyValue("w_WS_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_VEND_CD")) {
						key.setw_VEND_CD(msgKey.getKeyValue("w_VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_ISSUE_CMPLT_FLG")) {
						key.setw_ISSUE_CMPLT_FLG(msgKey.getKeyValue("w_ISSUE_CMPLT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("t_WORK_ODR_CD")) {
						key.sett_WORK_ODR_CD(msgKey.getKeyValue("t_WORK_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("t_WORK_IN_PROC_CD")) {
						key.sett_WORK_IN_PROC_CD(msgKey.getKeyValue("t_WORK_IN_PROC_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_PUCH_ODR_CD")) {
						key.setw_PUCH_ODR_CD(msgKey.getKeyValue("w_PUCH_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_LOT_CTRL_FLG")) {
						key.setw_LOT_CTRL_FLG(msgKey.getKeyValue("w_LOT_CTRL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_CTRL_CD")) {
						key.setRCV_ISSUE_CTRL_CD(msgKey.getKeyValue("RCV_ISSUE_CTRL_CD"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_TYP")) {
						key.setRCV_ISSUE_TYP(new Integer(msgKey.getKeyValue("RCV_ISSUE_TYP")));
					}
					if(msgKeyType.containsKeyColumn("w_JOB_ODR_CD")) {
						key.setw_JOB_ODR_CD(msgKey.getKeyValue("w_JOB_ODR_CD"));
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
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_CMPLT_FLG")) {
						key.setRCV_ISSUE_CMPLT_FLG(new Integer(msgKey.getKeyValue("RCV_ISSUE_CMPLT_FLG")));
					}
					if(msgKeyType.containsKeyColumn("VEND_LOT_NO")) {
						key.setVEND_LOT_NO(msgKey.getKeyValue("VEND_LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("w_STOCK_LOT_CD")) {
						key.setw_STOCK_LOT_CD(msgKey.getKeyValue("w_STOCK_LOT_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_WS_NAME")) {
						key.setw_WS_NAME(msgKey.getKeyValue("w_WS_NAME"));
					}
					if(msgKeyType.containsKeyColumn("w_VEND_NAME")) {
						key.setw_VEND_NAME(msgKey.getKeyValue("w_VEND_NAME"));
					}
					if(msgKeyType.containsKeyColumn("WH_VEND_CD")) {
						key.setWH_VEND_CD(msgKey.getKeyValue("WH_VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("WH_TYP")) {
						key.setWH_TYP(msgKey.getKeyValue("WH_TYP"));
					}
					if(msgKeyType.containsKeyColumn("MRP_FLG")) {
						key.setMRP_FLG(msgKey.getKeyValue("MRP_FLG"));
					}
					if(msgKeyType.containsKeyColumn("w_STOCK_ON_HAND_QTY")) {
						key.setw_STOCK_ON_HAND_QTY(msgKey.getKeyValue("w_STOCK_ON_HAND_QTY"));
					}
					if(msgKeyType.containsKeyColumn("w_WH_CD")) {
						key.setw_WH_CD(msgKey.getKeyValue("w_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_TOTAL_STOCK_ON_HAND_QTY")) {
						key.setw_TOTAL_STOCK_ON_HAND_QTY(msgKey.getKeyValue("w_TOTAL_STOCK_ON_HAND_QTY"));
					}
					if(msgKeyType.containsKeyColumn("BUSINESS_OPR_DATE")) {
						key.setBUSINESS_OPR_DATE(msgKey.getKeyValue("BUSINESS_OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("ONEROUS_CONS_NO")) {
						key.setONEROUS_CONS_NO(msgKey.getKeyValue("ONEROUS_CONS_NO"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_COST")) {
						key.setUNIT_COST(msgKey.getKeyValue("UNIT_COST"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_COST_TYP")) {
						key.setUNIT_COST_TYP(new Integer(msgKey.getKeyValue("UNIT_COST_TYP")));
					}
					if(msgKeyType.containsKeyColumn("RETURNED_WH_CD")) {
						key.setRETURNED_WH_CD(msgKey.getKeyValue("RETURNED_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("ONEROUS_FLG")) {
						key.setONEROUS_FLG(msgKey.getKeyValue("ONEROUS_FLG"));
					}
					if(msgKeyType.containsKeyColumn("THIS_MONTH")) {
						key.setTHIS_MONTH(msgKey.getKeyValue("THIS_MONTH"));
					}
					if(msgKeyType.containsKeyColumn("INSTALL_FLG")) {
						key.setINSTALL_FLG(msgKey.getKeyValue("INSTALL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("w_OPR_INST_CD")) {
						key.setw_OPR_INST_CD(msgKey.getKeyValue("w_OPR_INST_CD"));
					}
					if(msgKeyType.containsKeyColumn("SYS_PARAMETER_VALUE")) {
						key.setSYS_PARAMETER_VALUE(msgKey.getKeyValue("SYS_PARAMETER_VALUE"));
					}
					if(msgKeyType.containsKeyColumn("SYS_PARAMETER_NAME")) {
						key.setSYS_PARAMETER_NAME(msgKey.getKeyValue("SYS_PARAMETER_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_QTY")) {
						key.setISSUE_QTY(msgKey.getKeyValue("ISSUE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_LOT_NO")) {
						key.setl_LOT_NO(msgKey.getKeyValue("l_LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_PUCH_ODR_CD")) {
						key.setl_PUCH_ODR_CD(msgKey.getKeyValue("l_PUCH_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_WORK_ODR_CD")) {
						key.setl_WORK_ODR_CD(msgKey.getKeyValue("l_WORK_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ISSUE_QTY")) {
						key.setl_ISSUE_QTY(msgKey.getKeyValue("l_ISSUE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_ISSUE_DATE")) {
						key.setl_ISSUE_DATE(msgKey.getKeyValue("l_ISSUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_SPENT_QTY")) {
						key.setl_SPENT_QTY(msgKey.getKeyValue("l_SPENT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_STOCK_UNIT")) {
						key.setl_STOCK_UNIT(msgKey.getKeyValue("l_STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_QTY")) {
						key.setRCV_ISSUE_QTY(msgKey.getKeyValue("RCV_ISSUE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("BBD_c_FLG")) {
						key.setBBD_c_FLG(msgKey.getKeyValue("BBD_c_FLG"));
					}
					if(msgKeyType.containsKeyColumn("l_WH_CD")) {
						key.setl_WH_CD(msgKey.getKeyValue("l_WH_CD"));
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
					if(msgKeyType.containsKeyColumn("l_WH_NAME")) {
						key.setl_WH_NAME(msgKey.getKeyValue("l_WH_NAME"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_CD_GNR_TYP")) {
						key.setOPR_INST_CD_GNR_TYP(msgKey.getKeyValue("OPR_INST_CD_GNR_TYP"));
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
