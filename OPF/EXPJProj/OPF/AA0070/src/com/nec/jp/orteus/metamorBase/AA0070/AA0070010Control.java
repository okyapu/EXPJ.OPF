/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AA0070/src/com/nec/jp/orteus/metamorBase/AA0070/AA0070010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AA0070;

import com.nec.jp.orteus.metamorBase.AA0070.*;
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
import com.nec.jp.orteus.metamorBase.util.AlarmMessage.AlarmMessageException;
import com.nec.jp.orteus.expj.mstappr.MstAppr;
import com.nec.jp.orteus.expj.mstappr.MstApprDetailStruct;
import com.nec.jp.orteus.expj.mstappr.MstApprKeyStruct;
import com.nec.jp.orteus.expj.mstappr.MstApprStruct;
import com.nec.jp.orteus.expj.mstappr.MstColumns;

//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AA0070010Control
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
	public Object getListvalue(int x) { return this.list.get(x); }	// リストの値（メディエータ）を返します。

	public AA0070010Struct getStruct() { return this.struct; }	// Structの値（メディエータ）を返します。

	//------------------------------------------------------------------------------

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

	/** 画面共通定義取得クラス */
	ScreenParam _scParam = sp;

	//------------------------------------------------------------------------------
	/** 発注金額まるめ区分 */
	private ComboStruct _ROUND_TYP = new ComboStruct();

	/** 発注金額まるめ区分設定
	 * @param コンボボックスデータ
	*/
	public void setROUND_TYP(ComboStruct combo){ _ROUND_TYP = combo; }

	/** 発注金額まるめ区分取得
	 * @return 単価区分のコンボボックスデータ
	*/
	public ComboStruct getROUND_TYP(){ return _ROUND_TYP; }

	/** 消費税適用区分区分 */
	private ComboStruct _TAX_APPLY_TYP = new ComboStruct();

	/** 消費税適用区分設定
	 * @param コンボボックスデータ
	*/
	public void setTAX_APPLY_TYP(ComboStruct combo){ _TAX_APPLY_TYP = combo; }

	/** 消費税適用区分取得
	 * @return 品目手配区分のコンボボックスデータ
	*/
	public ComboStruct getTAX_APPLY_TYP(){ return _TAX_APPLY_TYP; }
		
	/** 消費税計算区分 */
	private ComboStruct _TAX_CALC_TYP = new ComboStruct();

	/** 消費税計算区分設定
	 * @param コンボボックスデータ
	*/
	public void setTAX_CALC_TYP(ComboStruct combo){ _TAX_CALC_TYP = combo; }

	/** 消費税計算区分取得
	 * @return 内外作成区分のコンボボックスデータ
	*/
	public ComboStruct getTAX_CALC_TYP(){ return _TAX_CALC_TYP; }
		
	/** 為替種別 */
	private ComboStruct _EXCH_TYP = new ComboStruct();

	/** 為替種別設定
	 * @param コンボボックスデータ
	*/
	public void setEXCH_TYP(ComboStruct combo){ _EXCH_TYP = combo; }

	/** 為替種別取得
	 * @return 内外作成区分のコンボボックスデータ
	*/
	public ComboStruct getEXCH_TYP(){ return _EXCH_TYP; }
		
	/** 輸入取引区分 */
	private ComboStruct _IMPORT_TRN_TYP = new ComboStruct();

	/** 輸入取引区分設定
	 * @param コンボボックスデータ
	*/
	public void setIMPORT_TRN_TYP(ComboStruct combo){ _IMPORT_TRN_TYP = combo; }

	/** 輸入取引区分取得
	 * @return 内外作成区分のコンボボックスデータ
	*/
	public ComboStruct getIMPORT_TRN_TYP(){ return _IMPORT_TRN_TYP; }

	/** 検収計上区分 */
	private ComboStruct _INSPC_ACPT_APP_TYP = new ComboStruct();

	/** 検収計上区分設定
	 * @param コンボボックスデータ
	*/
	public void setINSPC_ACPT_APP_TYP(ComboStruct combo){ _INSPC_ACPT_APP_TYP = combo; }

	/** 検収計上区分取得
	 * @return 内外作成区分のコンボボックスデータ
	*/
	public ComboStruct getINSPC_ACPT_APP_TYP(){ return _INSPC_ACPT_APP_TYP; }

		
	//------------------------------------------------------------------------------
		
	/**
	 * チェックボックス値変換取得処理
	 * 指定された文字列が"1"の場合に"true"を返し、それ以外は""を返す
	 *
	 * @return チェックあり: "true" / チェックなし: "false"
	 */
	public String convCheckBoxValue(String strValue)
	{
		String strCheckBoxValue = "false";
		if( (strValue != null) && ("1".equals(strValue) == true) )
		{
			strCheckBoxValue = "true";
		}
		return strCheckBoxValue;
	}
		
	//------------------------------------------------------------------------
	/** ユーザ定義の初期化済フラグ */
	private boolean _usersIntialized = false;
	/**
	 * ユーザ定義 初期化処理
	 */
	private void usersInitialize()
	{
		if(_usersIntialized) return;

		_usersIntialized = true;
		return ;
	}

	//------------------------------------------------------------------------

	/*
	 * デフォルト値設定処理
	*/
	private void setDefaultData() throws SQLException, FoundationException
	{
		try{
			// ログインユーザ（担当者コード）の初期値設定
			struct.setOWN_PERSON_CD(getsysUSER_CD());

			// 邦貨コード、消費税適用区分初期値設定
			struct.setCUR_CD("");
			struct.setCUR_NAME("");
			struct.setCTRL_CD("SYSTEM");
			struct.setTAX_APPLY_TYP("2");
			AA0070010Struct aStruct = null;
			AA0070010Struct bStruct = null;

			List tmpList = entity.mSYS_HOME_CUR.read(conn, struct);
			if (tmpList.size() >= 0 ) {
				aStruct = (AA0070010Struct)tmpList.get(0);
				struct.setCUR_CD(aStruct.getCUR_CD());
			}
		}
		catch (SQLException e)
		{
			throw e;
		}
	}

	//------------------------------------------------------------------------
	/**
	 * DB登録/更新時共通 設定内容チェック
	 * 
	 * @return  true:OK / false:NG
	 */
	//------------------------------------------------------------------------
	private boolean isValidContents()throws FoundationException, SQLException
	{
		boolean result = true;
		String strTest = null;
		String Message = "";

		// 値校正処理
		struct.revise();
		// 消費税コード存在確認
		if(struct.getTAX_CD() != null && struct.getTAX_CD().equals("") == false){
			List list1 = entity.mselectM_TAX.read(conn, struct);
			if (list1.size() == 0) {
				Message = "M_TAX.TAX_CD:" + struct.getTAX_CD();
				setErrorMessage("AA01001", Message);
				
				result = false;
			}
		}
		
		// 通貨コード存在確認
		if(struct.getCUR_CD() != null && struct.getCUR_CD().equals("") == false){
			List list2 = entity.mM_CUR.read(conn, struct);
			if(list2.size() == 0) {
				// 通貨名称のクリア
				struct.setCUR_NAME("");
				
				Message = "M_CUR.CUR_CD:" + struct.getCUR_CD();
				setErrorMessage("AA10011", Message);
				
				return false;
			}
		}
		
		// 担当者コード存在確認
		if (struct.getOWN_PERSON_CD() != null && struct.getOWN_PERSON_CD().equals("") == false) {
			List list3 = entity.mselectOWN_PERSON_CD.read(conn, struct);
			if (list3.size() == 0) {
				// 担当者名のクリア
				struct.setOWN_PERSON_NAME("");
				// <エラー:AA00158>担当者コードが利用者マスタに登録されていません。
				Message = "USER_MST.USER_CD:" + struct.getOWN_PERSON_CD();
				setErrorMessage("AA00158", Message);
				
				return false;
			} else {
				struct.setOWN_PERSON_NAME(((AA0070010Struct)list3.get(0)).getOWN_PERSON_NAME());
			}				
		}

		return result;
	}

	//------------------------------------------------------------------------
		
	/**
	 * SQLExceptionエラーメッセージ設定
	 * @param SQLException
	 * @param 出力エラーメッセージ
	 */
	private void setSqlExceptionMsg(SQLException e) throws ExpjException
	{
		setReadStatus(ERROR);
	
		ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
		sysLog.severe(emsg, getsysUSER_CD());
		ExpjException ee = new ExpjException(e, emsg);

		throw ee;
	}

	/**
     * エラーメッセージ設定処理を切り出して関数化
     * @param code メッセージコード
     */
    private void setErrorMessage(String code) {
     ExpjMessage emsg = new ExpjMessage(code);
     msgStruct.addError(emsg);
     sysLog.warning(emsg, sysUSER_CD);
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
	 * 警告メッセージ設定
	 * @param メッセージ番号
	 * @param 出力メッセージ
	 */
	private void setWarnMessage(String messageno, String message)
	{
		ExpjMessage emsg = new ExpjMessage( messageno );
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
	}
    /**
     * 情報メッセージ設定
     * @param メッセージ番号
     * @param 出力メッセージ
     */
    private void setInfoMessage(String messageno)
    {
     ExpjMessage emsg = new ExpjMessage( messageno );
     msgStruct.addInfo( emsg );
     sysLog.config(emsg, getsysUSER_CD());
    }

	//------------------------------------------------------------------------------
	private PrivateConfig privateConfig;
	//------------------------------------------------------------------------------
	 /**
	 * マスタキーの集う
	 */
	private HashMap keyvalueMap = new HashMap();
	
	/**マスタキーの集うの取得
	 * @return マスタキーの集う
	 */
	public HashMap getKeyvalueMap() {
		return keyvalueMap;
	}
	/**マスタキーの集うの設定
	 * @param マスタキーの情報
	 */
	public void setKeyvalueMap(HashMap keyvalueMap) {
		this.keyvalueMap = keyvalueMap;
	}
	/** 取引先承認 */
	private String _APR_VEND_CTRL = null;
	//-------------------------------------------------------------------------
    /**
	 * 画面遷移時、キーの取得
	 *
	 */
	private void getKey(){
		struct.setCOMPANY_CD(keyvalueMap.get("COMPANY_CD").toString());
		struct.setVEND_CD(keyvalueMap.get("VEND_CD").toString());
	}
//	---------------------------------------------------------------------------------
    /**
	 * 承認
	 * @param button
	 * @throws SQLException
	 */
	private void insertAppr(String button) throws SQLException{
		// マスタ承認部品
		MstAppr mstappr = new MstAppr(conn,this.getsysPLANT_CD(),this.getsysUSER_CD(),"AA0070010","AA0070010Servlet");
		List listMessage = new ArrayList();                     
		String appr_ID = null;                             // 承認IDを保存用の臨時変数 
		MstApprStruct mstApprStruct = new MstApprStruct();
		String columnID = null;                            
		MstApprKeyStruct keyStruct = new MstApprKeyStruct();
		// 	承認依頼存在チェック
		ArrayList keyvalueList = new ArrayList();
		// 会社コード
		MstColumns keyvalue1 = new MstColumns();
		keyvalue1.setColumnname("COMPANY_CD");
		keyvalue1.setColumnvalue(struct.getCOMPANY_CD());
		keyvalueList.add(keyvalue1);
		// 取引先コード
		MstColumns keyvalue2 = new MstColumns();
		keyvalue2.setColumnname("VEND_CD");
		keyvalue2.setColumnvalue(struct.getVEND_CD());
		keyvalueList.add(keyvalue2);
		
		if(mstappr.checkMST_APPR("M_VEND_CTRL",keyvalueList)){
			setErrorMessage("KA00125");
			return;
		}
		
		// 	承認依頼表にデータを追加	
		mstApprStruct.setSCREEN_URL("AA0070010Servlet");          // 画面URL
		mstApprStruct.setPLANT_CD(this.getsysPLANT_CD());         // 工場の識別コード。
		if("insert".equals(button)){
			mstApprStruct.setPROC_TYP("1");                       // 登録
		}
		if("update".equals(button)){
			mstApprStruct.setPROC_TYP("2");                       // 更新
		}
		if("delete".equals(button)){
			mstApprStruct.setPROC_TYP("3");                       // 削除
		}
		mstApprStruct.setAPPR_REMARKS(struct.getAPPR_REMARKS());   // 承認備考
		mstApprStruct.setSTATUS("1");                              // 状態区分
		mstApprStruct.setREQUEST_BY(struct.getsUser_ID());         // 依頼者
		appr_ID = mstappr.insertMST_APPR(mstApprStruct);
		
		// 承認キー対応表登録

		keyStruct.setAPPR_ID(appr_ID);
		// 会社コード
		keyStruct.setTABLE_NAME("M_VEND_CTRL");
		keyStruct.setKEY_NAME("COMPANY_CD");
		keyStruct.setKEY_VALUE(struct.getCOMPANY_CD());
		mstappr.insertMST_APPR_KEY(keyStruct);
		// 取引先コード
		keyStruct.setTABLE_NAME("M_VEND_CTRL");
		keyStruct.setKEY_NAME("VEND_CD");
		keyStruct.setKEY_VALUE(struct.getVEND_CD());
		mstappr.insertMST_APPR_KEY(keyStruct);
		
		// 承認明細表にマスタ情報を追加
		String nowdate = mstappr.readSystemDateTime();
		// 製品単価を整理	
		// 会社コード
		columnID = mstappr.getColumnID("M_VEND_CTRL","COMPANY_CD");
		mstappr.setDetailByColumnID(struct.getCOMPANY_CD(),columnID);
		// 取引先コード
		columnID = mstappr.getColumnID("M_VEND_CTRL","VEND_CD");
		mstappr.setDetailByColumnID(struct.getVEND_CD(),columnID);
		// 取引先名称
		columnID = mstappr.getColumnID("M_VEND_CTRL","VEND_NAME");
		mstappr.setDetailByColumnID(struct.getVEND_NAME(),columnID);
		// 取引先略称
		columnID = mstappr.getColumnID("M_VEND_CTRL","VEND_ANAME");
		mstappr.setDetailByColumnID(struct.getVEND_ANAME(),columnID);
		// 取引先カナ名称
		columnID = mstappr.getColumnID("M_VEND_CTRL","VEND_KNAME");
		mstappr.setDetailByColumnID(struct.getVEND_KNAME(),columnID);
		// 郵便番号
		columnID = mstappr.getColumnID("M_VEND_CTRL","ZIP_CD");
		mstappr.setDetailByColumnID(struct.getZIP_CD(),columnID);
		// 住所1
		columnID = mstappr.getColumnID("M_VEND_CTRL","ADDRESS_1");
		mstappr.setDetailByColumnID(struct.getADDRESS_1().toString(),columnID);
		// 住所2
		columnID = mstappr.getColumnID("M_VEND_CTRL","ADDRESS_2");
		mstappr.setDetailByColumnID(struct.getADDRESS_2().toString(),columnID);	
		// 住所(カナ)1
		columnID = mstappr.getColumnID("M_VEND_CTRL","ADDRESS_K_1");
		mstappr.setDetailByColumnID(struct.getADDRESS_K_1(),columnID);
		// 住所(カナ)2
		columnID = mstappr.getColumnID("M_VEND_CTRL","ADDRESS_K_2");
		mstappr.setDetailByColumnID(struct.getADDRESS_K_2(),columnID);
		// 電話番号
		columnID = mstappr.getColumnID("M_VEND_CTRL","TEL");
		mstappr.setDetailByColumnID(struct.getTEL(),columnID);
		// FAX番号
		columnID = mstappr.getColumnID("M_VEND_CTRL","FAX");
		mstappr.setDetailByColumnID(struct.getFAX(),columnID);
		// メールアドレス
		columnID = mstappr.getColumnID("M_VEND_CTRL","EMAIL");
		mstappr.setDetailByColumnID(struct.getEMAIL(),columnID);
		// 相手先担当部門
		columnID = mstappr.getColumnID("M_VEND_CTRL","VEND_ORG");
		mstappr.setDetailByColumnID(struct.getVEND_ORG(),columnID);
		// 相手先担当者
		columnID = mstappr.getColumnID("M_VEND_CTRL","VEND_PERSON");
		mstappr.setDetailByColumnID(struct.getVEND_PERSON(),columnID);
		// 自社担当部門コード
		columnID = mstappr.getColumnID("M_VEND_CTRL","OWN_ORG_CD");
		mstappr.setDetailByColumnID(struct.getOWN_ORG_CD(),columnID);
		// 自社担当部門名
		columnID = mstappr.getColumnID("M_VEND_CTRL","OWN_ORG_NAME");
		mstappr.setDetailByColumnID(struct.getOWN_ORG_NAME(),columnID);
		// 自社担当者コード
		columnID = mstappr.getColumnID("M_VEND_CTRL","OWN_PERSON_CD");
		mstappr.setDetailByColumnID(struct.getOWN_PERSON_CD(),columnID);
		// 自社担当者名
		columnID = mstappr.getColumnID("M_VEND_CTRL","OWN_PERSON_NAME");
		mstappr.setDetailByColumnID(struct.getOWN_PERSON_NAME(),columnID);
		// 取引通貨コード
		columnID = mstappr.getColumnID("M_VEND_CTRL","CUR_CD");
		mstappr.setDetailByColumnID(struct.getCUR_CD(),columnID);
		// 為替種別
		columnID = mstappr.getColumnID("M_VEND_CTRL","EXCH_TYP");
		mstappr.setDetailByColumnID(struct.getEXCH_TYP(),columnID);
		// 発注金額まるめ区分
		columnID = mstappr.getColumnID("M_VEND_CTRL","ROUND_TYP");
		mstappr.setDetailByColumnID(struct.getROUND_TYP().toString(),columnID);
		// 検収計上区分
		columnID = mstappr.getColumnID("M_VEND_CTRL","INSPC_ACPT_APP_TYP");
		mstappr.setDetailByColumnID(struct.getINSPC_ACPT_APP_TYP(),columnID);
		// 備考
		columnID = mstappr.getColumnID("M_VEND_CTRL","VEND_REM");
		mstappr.setDetailByColumnID(struct.getVEND_REM(),columnID);
		// 支払先設定フラグ
		columnID = mstappr.getColumnID("M_VEND_CTRL","PAYEE_FIX_FLG");
		mstappr.setDetailByColumnID("0",columnID);
		// 締日
		columnID = mstappr.getColumnID("M_VEND_CTRL","DEADLINE");
		mstappr.setDetailByColumnID("1",columnID);
		// 支払月
		columnID = mstappr.getColumnID("M_VEND_CTRL","SCH_MONTH");
		mstappr.setDetailByColumnID("0",columnID);
		// 支払予定日
		columnID = mstappr.getColumnID("M_VEND_CTRL","SCH_DAY");
		mstappr.setDetailByColumnID("1",columnID);
		
		// 残高管理フラグ
		columnID = mstappr.getColumnID("M_VEND_CTRL","BALANCE_CTRL_FLG");
		mstappr.setDetailByColumnID("1",columnID);
		// 取引状態フラグ
		columnID = mstappr.getColumnID("M_VEND_CTRL","DEAL_STS_FLG");
		mstappr.setDetailByColumnID("0",columnID);
	
		// 取引フラグ1(仕入)
		columnID = mstappr.getColumnID("M_VEND_CTRL","VEND_FLG_1");
		mstappr.setDetailByColumnID("0",columnID);
		// 取引フラグ2(無償)
		columnID = mstappr.getColumnID("M_VEND_CTRL","VEND_FLG_2");
		mstappr.setDetailByColumnID("0",columnID);		
		// 取引フラグ3(有償)
		columnID = mstappr.getColumnID("M_VEND_CTRL","VEND_FLG_3");
		mstappr.setDetailByColumnID("0",columnID);
		// 注文書発注フラグ
		columnID = mstappr.getColumnID("M_VEND_CTRL","ODR_FORM_FLG");
		mstappr.setDetailByColumnID(struct.getODR_FORM_FLG(),columnID);
		// FAX発注フラグ
		columnID = mstappr.getColumnID("M_VEND_CTRL","ODR_FAX_FLG");
		mstappr.setDetailByColumnID(struct.getODR_FAX_FLG(),columnID);
		// EDI発注フラグ
		columnID = mstappr.getColumnID("M_VEND_CTRL","ODR_EDI_FLG");
		mstappr.setDetailByColumnID(struct.getODR_EDI_FLG(),columnID);
		// メール発注フラグ
		columnID = mstappr.getColumnID("M_VEND_CTRL","ODR_MAIL_FLG");
		mstappr.setDetailByColumnID(struct.getODR_MAIL_FLG(),columnID);
		// 限度額
		columnID = mstappr.getColumnID("M_VEND_CTRL","LIMIT_AMOUNT");
		mstappr.setDetailByColumnID("0",columnID);
		// 支払通知書送付フラグ
		columnID = mstappr.getColumnID("M_VEND_CTRL","PAY_NOTICE_FLG");
		mstappr.setDetailByColumnID("0",columnID);
		// スポット取引先フラグ
		columnID = mstappr.getColumnID("M_VEND_CTRL","SPOT_VEND_FLG");
		mstappr.setDetailByColumnID("0",columnID);
		// 請求書扱いフラグ
		columnID = mstappr.getColumnID("M_VEND_CTRL","BILL_FLG");
		mstappr.setDetailByColumnID("0",columnID);
		// リベートフラグ
		columnID = mstappr.getColumnID("M_VEND_CTRL","REBATE_FLG");
		mstappr.setDetailByColumnID("0",columnID);
		// リベート条件区分
		columnID = mstappr.getColumnID("M_VEND_CTRL","REBATE_COND_TYP");
		mstappr.setDetailByColumnID("1",columnID);
		// リベート条件金額
		columnID = mstappr.getColumnID("M_VEND_CTRL","REBATE_COND_AMOUNT");
		mstappr.setDetailByColumnID("0",columnID);
		// リベート条件数量
		columnID = mstappr.getColumnID("M_VEND_CTRL","REBATE_COND_QTY");
		mstappr.setDetailByColumnID("0",columnID);
		// リベート対象区分
		columnID = mstappr.getColumnID("M_VEND_CTRL","REBATE_TARGET_TYP");
		mstappr.setDetailByColumnID("1",columnID);
		// リベート率
		columnID = mstappr.getColumnID("M_VEND_CTRL","REBATE_RATE");
		mstappr.setDetailByColumnID("0",columnID);
		// リベート額
		columnID = mstappr.getColumnID("M_VEND_CTRL","REBATE_AMOUNT");
		mstappr.setDetailByColumnID("0",columnID);
		// 消費税適用区分
		columnID = mstappr.getColumnID("M_VEND_CTRL","TAX_APPLY_TYP");
		mstappr.setDetailByColumnID(struct.getTAX_APPLY_TYP().toString(),columnID);
		// 消費税コード
		columnID = mstappr.getColumnID("M_VEND_CTRL","TAX_CD");
		mstappr.setDetailByColumnID(struct.getTAX_CD(),columnID);
		// 消費税計算区分
		columnID = mstappr.getColumnID("M_VEND_CTRL","TAX_CALC_TYP");
		mstappr.setDetailByColumnID(struct.getTAX_CALC_TYP().toString(),columnID);
		// 輸入取引区分
		columnID = mstappr.getColumnID("M_VEND_CTRL","IMPORT_TRN_TYP");
		mstappr.setDetailByColumnID(struct.getIMPORT_TRN_TYP(),columnID);
		// 取引先分類０１
		columnID = mstappr.getColumnID("M_VEND_CTRL","VEND_CLASS_01_TYP");
		mstappr.setDetailByColumnID("2001",columnID);
		// 取引先分類０２
		columnID = mstappr.getColumnID("M_VEND_CTRL","VEND_CLASS_02_TYP");
		mstappr.setDetailByColumnID("2002",columnID);
		// 取引先分類０３
		columnID = mstappr.getColumnID("M_VEND_CTRL","VEND_CLASS_03_TYP");
		mstappr.setDetailByColumnID("2003",columnID);
		// 取引先分類０４
		columnID = mstappr.getColumnID("M_VEND_CTRL","VEND_CLASS_04_TYP");
		mstappr.setDetailByColumnID("2004",columnID);
		// 取引先分類０５
		columnID = mstappr.getColumnID("M_VEND_CTRL","VEND_CLASS_05_TYP");
		mstappr.setDetailByColumnID("2005",columnID);
		// 取引先分類０６
		columnID = mstappr.getColumnID("M_VEND_CTRL","VEND_CLASS_06_TYP");
		mstappr.setDetailByColumnID("2006",columnID);
		// 取引先分類０７
		columnID = mstappr.getColumnID("M_VEND_CTRL","VEND_CLASS_07_TYP");
		mstappr.setDetailByColumnID("2007",columnID);
		// 取引先分類０８
		columnID = mstappr.getColumnID("M_VEND_CTRL","VEND_CLASS_08_TYP");
		mstappr.setDetailByColumnID("2008",columnID);
		// 取引先分類０９
		columnID = mstappr.getColumnID("M_VEND_CTRL","VEND_CLASS_09_TYP");
		mstappr.setDetailByColumnID("2009",columnID);
		// 取引先分類１０
		columnID = mstappr.getColumnID("M_VEND_CTRL","VEND_CLASS_10_TYP");
		mstappr.setDetailByColumnID("2010",columnID);
		// 作成日
		columnID = mstappr.getColumnID("M_VEND_CTRL","CREATED_DATE");
		mstappr.setDetailByColumnID(nowdate,columnID);
		// 作成者
		columnID = mstappr.getColumnID("M_VEND_CTRL","CREATED_BY");
		mstappr.setDetailByColumnID(this.getsysUSER_CD(),columnID);
		// 作成プログラム名
		columnID = mstappr.getColumnID("M_VEND_CTRL","CREATED_PRG_NM");
		mstappr.setDetailByColumnID("AA0070010",columnID);
		// 更新日
		columnID = mstappr.getColumnID("M_VEND_CTRL","UPDATED_DATE");
		mstappr.setDetailByColumnID(nowdate,columnID);
		// 更新者
		columnID = mstappr.getColumnID("M_VEND_CTRL","UPDATED_BY");
		mstappr.setDetailByColumnID(this.getsysUSER_CD(),columnID);
		// 更新プログラム名
		columnID = mstappr.getColumnID("M_VEND_CTRL","UPDATED_PRG_NM");
		mstappr.setDetailByColumnID("AA0070010",columnID);
		// 更新数
		columnID = mstappr.getColumnID("M_VEND_CTRL","MODIFY_COUNT");
		mstappr.setDetailByColumnID("0",columnID);
		
		// 承認明細にデータを追加する。
		mstappr.insertMST_APPR_DETAIL("M_VEND_CTRL",appr_ID);
		
		setInfoMessage("AZ00042");
	}

//---------------------------------------------------------------------------------

        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * 読込ボタン押下時に実行される処理です。
	 *
	 */
	public void controlselect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0070");
		logger.entering("AA0070010Control"+":USER="+struct.getsUser_ID(),"controlselect");
			//{{user_implement_dev:<controlselect>
		//---------------------------------------------------------------------
			
		String Message = "";
		setReadStatus(INITIAL);
			
		try {
			if("1".equals(struct.geth_APR_VEND_CTRL()) && this.isScreenMove() && !"".equals(struct.geth_SCREENMOVE_TYP())){
				
				// 承認画面の「変更後」ボタンから遷移する時
				if("1".equals(struct.geth_SCREENMOVE_TYP())){
					MstAppr mstappr = new MstAppr(this.conn,this.getsysPLANT_CD(),this.getsysUSER_CD(),"AA0070010","AA0070010Servlet");
					list = mstappr.selectMST_APPR_DETAIL(struct.geth_APPR_ID());
					MstApprDetailStruct tempStruct = (MstApprDetailStruct) list.get(0);
					String columnID = null;
					// 会社コード
					columnID = mstappr.getColumnID( "M_VEND_CTRL", "COMPANY_CD");
					struct.setCOMPANY_CD(mstappr.getDetailByColumnID(tempStruct,columnID));
					
					// 取引先コード
					columnID = mstappr.getColumnID( "M_VEND_CTRL", "VEND_CD");
					struct.setVEND_CD(mstappr.getDetailByColumnID(tempStruct,columnID));
					
					// 取引先名称
					columnID = mstappr.getColumnID( "M_VEND_CTRL", "VEND_NAME");
					struct.setVEND_NAME(mstappr.getDetailByColumnID(tempStruct,columnID));
					
					// 取引先略称
					columnID = mstappr.getColumnID( "M_VEND_CTRL", "VEND_ANAME");
					struct.setVEND_ANAME(mstappr.getDetailByColumnID(tempStruct,columnID));

					// 取引先カナ名称
					columnID = mstappr.getColumnID( "M_VEND_CTRL", "VEND_KNAME");
					struct.setVEND_KNAME(mstappr.getDetailByColumnID(tempStruct,columnID));

					// 郵便番号
					columnID = mstappr.getColumnID( "M_VEND_CTRL", "ZIP_CD");
					struct.setZIP_CD(mstappr.getDetailByColumnID(tempStruct,columnID));

					// 住所1
					columnID = mstappr.getColumnID( "M_VEND_CTRL", "ADDRESS_1");
					struct.setADDRESS_1(mstappr.getDetailByColumnID(tempStruct,columnID));

					// 住所2
					columnID = mstappr.getColumnID( "M_VEND_CTRL", "ADDRESS_2");
					struct.setADDRESS_2(mstappr.getDetailByColumnID(tempStruct,columnID));

					// 住所(カナ)1
					columnID = mstappr.getColumnID( "M_VEND_CTRL", "ADDRESS_K_1");
					struct.setADDRESS_K_1(mstappr.getDetailByColumnID(tempStruct,columnID));
					// 住所(カナ)2
					columnID = mstappr.getColumnID( "M_VEND_CTRL", "ADDRESS_K_2");
					struct.setADDRESS_K_2(mstappr.getDetailByColumnID(tempStruct,columnID));
					// 電話番号
					columnID = mstappr.getColumnID( "M_VEND_CTRL", "TEL");
					struct.setTEL(mstappr.getDetailByColumnID(tempStruct,columnID));

					// FAX番号
					columnID = mstappr.getColumnID( "M_VEND_CTRL", "FAX");
					struct.setFAX(mstappr.getDetailByColumnID(tempStruct,columnID));

					// メールアドレス
					columnID = mstappr.getColumnID( "M_VEND_CTRL", "EMAIL");
					struct.setEMAIL(mstappr.getDetailByColumnID(tempStruct,columnID));

					// 相手先担当部門
					columnID = mstappr.getColumnID( "M_VEND_CTRL", "VEND_ORG");
					struct.setVEND_ORG(mstappr.getDetailByColumnID(tempStruct,columnID));

					// 相手先担当者
					columnID = mstappr.getColumnID( "M_VEND_CTRL", "VEND_PERSON");
					struct.setVEND_PERSON(mstappr.getDetailByColumnID(tempStruct,columnID));

					// 担当部門コード
					columnID = mstappr.getColumnID( "M_VEND_CTRL", "OWN_ORG_CD");
					struct.setOWN_ORG_CD(mstappr.getDetailByColumnID(tempStruct,columnID));

					// 担当部門
					columnID = mstappr.getColumnID( "M_VEND_CTRL", "OWN_ORG_NAME");
					struct.setOWN_ORG_NAME(mstappr.getDetailByColumnID(tempStruct,columnID));

					// 担当者コード
					columnID = mstappr.getColumnID( "M_VEND_CTRL", "OWN_PERSON_CD");
					struct.setOWN_PERSON_CD(mstappr.getDetailByColumnID(tempStruct,columnID));

					// 担当者名
					list = entity.mselectOWN_PERSON_CD.read(conn,struct);
					if(list.size()>0){
						struct.setOWN_PERSON_NAME(((AA0070010Struct)list.get(0)).getOWN_PERSON_NAME());
					}
					
					// 発注金額まるめ
					columnID = mstappr.getColumnID( "M_VEND_CTRL", "ROUND_TYP");
					struct.setROUND_TYP(mstappr.getDetailByColumnID(tempStruct,columnID));

					// 消費税コード
					columnID = mstappr.getColumnID( "M_VEND_CTRL", "TAX_CD");
					struct.setTAX_CD(mstappr.getDetailByColumnID(tempStruct,columnID));

					// 消費税適用区分
					columnID = mstappr.getColumnID( "M_VEND_CTRL", "TAX_APPLY_TYP");
					struct.setTAX_APPLY_TYP(mstappr.getDetailByColumnID(tempStruct,columnID));

					// 消費税計算区分
					columnID = mstappr.getColumnID( "M_VEND_CTRL", "TAX_CALC_TYP");
					struct.setTAX_CALC_TYP(mstappr.getDetailByColumnID(tempStruct,columnID));

					// 検収計上区分
					columnID = mstappr.getColumnID( "M_VEND_CTRL", "INSPC_ACPT_APP_TYP");
					struct.setINSPC_ACPT_APP_TYP(mstappr.getDetailByColumnID(tempStruct,columnID));

					// 注文書発注フラグ
					columnID = mstappr.getColumnID( "M_VEND_CTRL", "ODR_FORM_FLG");
					struct.setODR_FORM_FLG(mstappr.getDetailByColumnID(tempStruct,columnID));

					// FAX発注フラグ
					columnID = mstappr.getColumnID( "M_VEND_CTRL", "ODR_FAX_FLG");
					struct.setODR_FAX_FLG(mstappr.getDetailByColumnID(tempStruct,columnID));

					// EDI発注フラグ
					columnID = mstappr.getColumnID( "M_VEND_CTRL", "ODR_EDI_FLG");
					struct.setODR_EDI_FLG(mstappr.getDetailByColumnID(tempStruct,columnID));
					
					struct.setODR_FORM_FLG(convCheckBoxValue(struct.getODR_FORM_FLG()));
					struct.setODR_EDI_FLG(convCheckBoxValue(struct.getODR_EDI_FLG()));

					// メール発注フラグ
					columnID = mstappr.getColumnID( "M_VEND_CTRL", "ODR_MAIL_FLG");
					struct.setODR_MAIL_FLG(mstappr.getDetailByColumnID(tempStruct,columnID));

					// 備考
					columnID = mstappr.getColumnID( "M_VEND_CTRL", "VEND_REM");
					struct.setVEND_REM(mstappr.getDetailByColumnID(tempStruct,columnID));

					// 通貨コード
					columnID = mstappr.getColumnID( "M_VEND_CTRL", "CUR_CD");
					struct.setCUR_CD(mstappr.getDetailByColumnID(tempStruct,columnID));
					
					List tempList = entity.mselectCUR_NAME.read(conn,struct);
					if(tempList.size() >0){
						// 通貨名
						struct.setCUR_NAME(((AA0070010Struct)tempList.get(0)).getCUR_NAME());
					}

					// 為替種別
					columnID = mstappr.getColumnID( "M_VEND_CTRL", "EXCH_TYP");
					struct.setEXCH_TYP(mstappr.getDetailByColumnID(tempStruct,columnID));

					// 輸入取引区分
					columnID = mstappr.getColumnID( "M_VEND_CTRL", "IMPORT_TRN_TYP");
					struct.setIMPORT_TRN_TYP(mstappr.getDetailByColumnID(tempStruct,columnID));

				}else{ 
					//承認画面の「変更前」ボタンから遷移する時
					list = entity.mselect.read(conn, struct);
					if (list.size() != 0) {
						String apr_Vend_Ctrl = struct.geth_APR_VEND_CTRL();
						String appr_id = struct.geth_APPR_ID();
						String screen_Move_Typ = struct.geth_SCREENMOVE_TYP();
						struct.copy((AA0070010Struct)list.get(0));
						struct.seth_APR_VEND_CTRL(apr_Vend_Ctrl);
						struct.seth_SCREENMOVE_TYP(screen_Move_Typ);
						struct.seth_APPR_ID(appr_id);

						struct.setOWN_PERSON_NAME("");

						struct.setODR_FORM_FLG(convCheckBoxValue(struct.getODR_FORM_FLG()));
						struct.setODR_EDI_FLG(convCheckBoxValue(struct.getODR_EDI_FLG()));

						if (struct.getOWN_PERSON_CD() != null && struct.getOWN_PERSON_CD().equals("") == false) {
							List list3 = entity.mselectOWN_PERSON_CD.read(conn, struct);
							if (list3.size() != 0) {
								AA0070010Struct checkStruct = (AA0070010Struct)list3.get(0);
								struct.setOWN_PERSON_NAME(checkStruct.getOWN_PERSON_NAME());
							}
						}

						setReadStatus(NORMAL);
					} else {
						// エラーメッセージ設定
						Message = "M_VEND_CTRL.VEND_CD:" + struct.getVEND_CD();
						setErrorMessage("ZZ06001", Message);

						// データが存在しない場合のクリア処理
						String w_vendCd = struct.getVEND_CD();	// キー情報の退避
						struct.init();							// 表示項目をデフォルトに戻す
						struct.setVEND_CD(w_vendCd);			// キー情報の設定
					}
				}
			}else{ 
				// 正常の読込
				list = entity.mselect.read(conn, struct);
				if (list.size() != 0) {
					String apr_Vend_Ctrl = struct.geth_APR_VEND_CTRL();
					String appr_id = struct.geth_APPR_ID();
					String screen_Move_Typ = struct.geth_SCREENMOVE_TYP();
					struct.copy((AA0070010Struct)list.get(0));
					struct.seth_APR_VEND_CTRL(apr_Vend_Ctrl);
					struct.seth_SCREENMOVE_TYP(screen_Move_Typ);
					struct.seth_APPR_ID(appr_id);

					struct.setOWN_PERSON_NAME("");

					struct.setODR_FORM_FLG(convCheckBoxValue(struct.getODR_FORM_FLG()));
					struct.setODR_EDI_FLG(convCheckBoxValue(struct.getODR_EDI_FLG()));

					if (struct.getOWN_PERSON_CD() != null && struct.getOWN_PERSON_CD().equals("") == false) {
						List list3 = entity.mselectOWN_PERSON_CD.read(conn, struct);
						if (list3.size() != 0) {
							AA0070010Struct checkStruct = (AA0070010Struct)list3.get(0);
							struct.setOWN_PERSON_NAME(checkStruct.getOWN_PERSON_NAME());
						}
					}

					setReadStatus(NORMAL);
				} else {
					// エラーメッセージ設定
					Message = "M_VEND_CTRL.VEND_CD:" + struct.getVEND_CD();
					setErrorMessage("ZZ06001", Message);

					// データが存在しない場合のクリア処理
					String w_vendCd = struct.getVEND_CD();	// キー情報の退避
					struct.init();							// 表示項目をデフォルトに戻す
					struct.setVEND_CD(w_vendCd);			// キー情報の設定
				}
			}
		} catch(SQLException e) {
			// 読込失敗
			setSqlExceptionMsg(e);
		}
		//---------------------------------------------------------------------
                //}}user_implement_dev:<controlselect>
		logger.exiting("AA0070010Control"+":USER="+struct.getsUser_ID(),"controlselect");

		return;
	}

	/**
	 * 登録ボタン押下時に実行される処理です。
	 *
	 */
	public void controlinsert() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0070");
		logger.entering("AA0070010Control"+":USER="+struct.getsUser_ID(),"controlinsert");
			//{{user_implement_dev:<controlinsert>
		//---------------------------------------------------------------------
			
		String Message = "";
		boolean transFlg = false;
		try {

			// トランザクション開始
			conn.beginTransWeb();
			transFlg = true;
			
			// 取引先情報の存在確認
			List w = entity.mselect.read(conn, struct);
			if (w.size() > 0) {
				// エラーメッセージ設定
				Message = "M_VEND_CTRL.VEND_CD:" + struct.getVEND_CD();
				setErrorMessage("ZZ01102", Message);
			}
			// 入力内容チェック
			isValidContents();

			// エラーが発生していない場合、登録処理実施
			if(msgStruct.sizeError() <= 0){
				if("0".equals(struct.geth_APR_VEND_CTRL())){
					entity.minsertM_VEND_CTRL.create(conn, struct);
					conn.commit();
					transFlg = false;
					// 最新の情報を読込
					controlselect();
				}else{
					// 会社コード取得
					List list = entity.mselectCOMPANY_CD_1.read(conn, struct);
					if (list.size() != 0) {
						String company = ((AA0070010Struct)list.get(0)).getCOMPANY_CD();
						struct.setCOMPANY_CD(company);
					}
					insertAppr("insert");
					if(!msgStruct.hasError()){
						// コミット
						conn.commit();
						transFlg = false;
					}
					struct.setODR_FORM_FLG(convCheckBoxValue(struct.getODR_FORM_FLG()));
					struct.setODR_EDI_FLG(convCheckBoxValue(struct.getODR_EDI_FLG()));
				}
			} else {
				struct.setODR_FORM_FLG(convCheckBoxValue(struct.getODR_FORM_FLG()));
				struct.setODR_EDI_FLG(convCheckBoxValue(struct.getODR_EDI_FLG()));
			}
		} catch(SQLException e) {
			conn.rollback();
			setSqlExceptionMsg(e);
		}finally{
			try {
				if(transFlg == true){
					// ロールバック
					conn.rollback();
				}

			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		//---------------------------------------------------------------------
                //}}user_implement_dev:<controlinsert>
		logger.exiting("AA0070010Control"+":USER="+struct.getsUser_ID(),"controlinsert");

		return;
	}

	/**
	 * 更新ボタン押下時に実行される処理です。
	 *
	 */
	public void controlupdate() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0070");
		logger.entering("AA0070010Control"+":USER="+struct.getsUser_ID(),"controlupdate");
			//{{user_implement_dev:<controlupdate>
		//---------------------------------------------------------------------
			
		String Message = "";
		boolean transFlg = false;
		try {
			conn.beginTransWeb();		// トランザクション開始
			transFlg = true;

			// 更新確認
			List w = entity.mselectMODIFY_COUNT.read(conn, struct);
			if(w.size() == 0){
				// エラーメッセージ設定
				Message = "M_VEND_CTRL.VEND_CD:" + struct.getVEND_CD();
				setErrorMessage("ZZ06001", Message);
				struct.setODR_FORM_FLG(convCheckBoxValue(struct.getODR_FORM_FLG()));
				struct.setODR_EDI_FLG(convCheckBoxValue(struct.getODR_EDI_FLG()));
			}
			else{
				// 更新カウントOK?
				if(struct.getMODIFY_COUNT().equals(((AA0070010Struct)w.get(0)).getMODIFY_COUNT()) == false){
					// エラーメッセージ設定
					Message = "M_VEND_CTRL.VEND_CD:" + struct.getVEND_CD();
					setErrorMessage("ZZ01105", Message);
					struct.setODR_FORM_FLG(convCheckBoxValue(struct.getODR_FORM_FLG()));
					struct.setODR_EDI_FLG(convCheckBoxValue(struct.getODR_EDI_FLG()));
				}
				else{
					isValidContents();
					// エラーが発生していない場合、更新処理実施
					if(msgStruct.sizeError() <= 0){
						// 会社コード取得
						List list = entity.mselectCOMPANY_CD_1.read(conn, struct);
						if (list.size() != 0) {
							String company = ((AA0070010Struct)list.get(0)).getCOMPANY_CD();
							struct.setCOMPANY_CD(company);
						}
						if("0".equals(struct.geth_APR_VEND_CTRL())){
							entity.mupdateM_VEND_CTRL.update(conn, struct);
							conn.commit();
							// 最新の情報を読込
							controlselect();
						}else{
							
							insertAppr("update");
							if(!msgStruct.hasError()){
								// コミット
								conn.commit();
								transFlg = false;
							}
							struct.setODR_FORM_FLG(convCheckBoxValue(struct.getODR_FORM_FLG()));
							struct.setODR_EDI_FLG(convCheckBoxValue(struct.getODR_EDI_FLG()));
						}
					} else {
						struct.setODR_FORM_FLG(convCheckBoxValue(struct.getODR_FORM_FLG()));
						struct.setODR_EDI_FLG(convCheckBoxValue(struct.getODR_EDI_FLG()));
					}
				}
			}
			
		} catch(SQLException e) {
			setSqlExceptionMsg(e);
		} finally {
			try {
				if(transFlg){
					conn.rollback();
				}
			} catch(Exception e) {
				ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
				sysLog.severe(emsg, getsysUSER_CD());
				ExpjException ee = new ExpjException(e, emsg);
				throw ee;
			}
		}
		//---------------------------------------------------------------------
                //}}user_implement_dev:<controlupdate>
		logger.exiting("AA0070010Control"+":USER="+struct.getsUser_ID(),"controlupdate");

		return;
	}

	/**
	 * 削除ボタン押下時に実行される処理です。
	 *
	 */
	public void controldelete() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0070");
		logger.entering("AA0070010Control"+":USER="+struct.getsUser_ID(),"controldelete");
			//{{user_implement_dev:<controldelete>
		//---------------------------------------------------------------------
		String OPTION_ID="C*";
		String Message = "";
		boolean transFlg = false;
		try {
			// トランザクション開始
			conn.beginTransWeb();
			transFlg = true;
			// 取引先情報の存在確認
			List w = entity.mselect.read(conn, struct);
			if (w.size() == 0) {
				// エラーメッセージ設定
				Message = "M_VEND_CTRL.VEND_CD:" + struct.getVEND_CD();
				setErrorMessage("ZZ06001", Message);
			}
			else{
				// 更新カウントOK?
				if(struct.getMODIFY_COUNT().equals(((AA0070010Struct)w.get(0)).getMODIFY_COUNT()) == false){
					// エラーメッセージ設定
					Message = "M_VEND_CTRL.VEND_CD:" + struct.getVEND_CD();
					setErrorMessage("ZZ01105", Message);
				}
			}

			// 会社コード取得
			List list = entity.mselectCOMPANY_CD.read(conn, struct);
			if (list.size() != 0) {
				String company = ((AA0070010Struct)list.get(0)).getCOMPANY_CD();
				struct.setCOMPANY_CD(company);
				// 参照整合性検証：作業系列
				List list1 = entity.mselectM_PROC_GRP.read(conn, struct);
				if (list1.size() != 0) {
					// エラーメッセージ設定
					Message = "M_VEND_CTRL.VEND_CD:" + struct.getVEND_CD();
					setErrorMessage("AA00094", Message);
				}

				// 参照整合性検証：保管区
				List list2 = entity.mselectM_WH.read(conn, struct);
				if (list2.size() != 0) {
					// エラーメッセージ設定
					Message = "M_VEND_CTRL.VEND_CD:" + struct.getVEND_CD();
					setErrorMessage("AA00095", Message);
				}

				// 参照整合性検証：購入単価ヘッダ
				List list3 = entity.mselectM_PUCH_UNIT_COST_H.read(conn, struct);
				if (list3.size() != 0) {
				// エラーメッセージ設定
					Message = "M_VEND_CTRL.VEND_CD:" + struct.getVEND_CD();
					setErrorMessage("AA00096", Message);
				}

				// 参照整合性検証：外注単価ヘッダ
				List list4 = entity.mselectM_SBCNT_UNIT_COST_H.read(conn, struct);
				if (list4.size() != 0) {
					// エラーメッセージ設定
					Message = "M_VEND_CTRL.VEND_CD:" + struct.getVEND_CD();
					setErrorMessage("AA00097", Message);
				}

				// 参照整合性検証：作業系列別仕掛
				List list5 = entity.mselectT_WORK_IN_PROC_BY_PROC.read(conn, struct);
				if (list5.size() != 0) {
					// エラーメッセージ設定
					Message = "M_VEND_CTRL.VEND_CD:" + struct.getVEND_CD();
					setErrorMessage("AA00098", Message);
				}

				// 参照整合性検証：発注残
				List list6 = entity.mselectT_RLSD_PUSH_ODR.read(conn, struct);
				if (list6.size() != 0) {
					// エラーメッセージ設定
					Message = "M_VEND_CTRL.VEND_CD:" + struct.getVEND_CD();
					setErrorMessage("AA00099", Message);
				}

                // 参照整合性検証：有償支給履歴
                List list7 = entity.mselectT_PAST_ONEROUS_CONS.read(conn, struct);
                if (list7.size() != 0 ) {
					// エラーメッセージ設定
					Message = "M_VEND_CTRL.VEND_CD:" + struct.getVEND_CD();
					setErrorMessage("AA00999", Message);
				}

                // 参照整合性検証：購入返品実績
                List list8 = entity.mselectT_PUCH_ODR_RTN_RSLT.read(conn, struct);
                if (list8.size() != 0 ) {
					// エラーメッセージ設定
					Message = "M_VEND_CTRL.VEND_CD:" + struct.getVEND_CD();
					setErrorMessage("AA01000", Message);
				}
                
                // 参照整合性検証：支給単価
                List list9 = entity.mselectM_CONS_UNIT_COST.read(conn, struct);
                if(list9.size() != 0){
					// エラーメッセージ設定
					Message = "M_VEND_CTRL.VEND_CD:" + struct.getVEND_CD();
                	setErrorMessage("AA02011", Message);
                }
                // 参照整合性検証：積送在庫T_TRANSPORT_STOCK
                List list10 = entity.mselect_T_TRANSPORT_STOCK.read(conn, struct);
                if(list10.size()!=0){
                	// エラーメッセージ設定
                	Message = "M_VEND_CTRL.VEND_CD:" + struct.getVEND_CD();
                	setErrorMessage("CA00133", Message);
                }
                //参照整合性検証：出庫指示　T_ISSUE_INST
                List list11 = entity.mselect_T_ISSUE_INST.read(conn, struct);
                if(list11.size()!=0){
                	// エラーメッセージ設定
                	Message = "M_VEND_CTRL.VEND_CD:" + struct.getVEND_CD();
                	setErrorMessage("CA00134", Message);
                }
				struct.setOPTION_ID(OPTION_ID);
				List tempList  = entity.mgetSYS_INSTALL_OPTIONS.read(conn, struct);
				AA0070010Struct tempStruct = new AA0070010Struct();
				if(tempList!=null&&tempList.size()>0){
					tempStruct = (AA0070010Struct)tempList.get(0);
					struct.setINSTALL_FLG(tempStruct.getINSTALL_FLG());
				}
				if("1".equals(struct.getINSTALL_FLG())){
				//参照整合性検証：買掛金残高 T_DEBT_BALANCE
	                List list12 = entity.mselect_T_DEBT_BALANCE.read(conn, struct);
	                if(list12.size()!=0){
	                	// エラーメッセージ設定
	                	Message = "M_VEND_CTRL.VEND_CD:" + struct.getVEND_CD();
	                	setErrorMessage("CA00135", Message);
	                }
	              //参照整合性検証：買掛金残高明細　　　　　　　　　T_DEBT_BALANCE_D
	                List list13 = entity.mselect_T_DEBT_BALANCE_D.read(conn, struct);
	                if(list13.size()!=0){
	                	// エラーメッセージ設定
	                	Message = "M_VEND_CTRL.VEND_CD:" + struct.getVEND_CD();
	                	setErrorMessage("CA00136", Message);
	                }
	              //参照整合性検証：買掛金元帳ヘッダ　　　　　　　　T_DEBT_LEDGER_H
	                List list14 = entity.mselect_T_DEBT_LEDGER_H.read(conn, struct);
	                if(list14.size()!=0){
	                	// エラーメッセージ設定
	                	Message = "M_VEND_CTRL.VEND_CD:" + struct.getVEND_CD();
	                	setErrorMessage("CA00137", Message);
	                }
	              //参照整合性検証：買掛金トランヘッダ　　　　　　　　T_DEBT_LEDGER_H_TRN
	                List list15 = entity.mselect_T_DEBT_LEDGER_H_TRN.read(conn, struct);
	                if(list15.size()!=0){
	                	// エラーメッセージ設定
	                	Message = "M_VEND_CTRL.VEND_CD:" + struct.getVEND_CD();
	                	setErrorMessage("CA00138", Message);
	                }
	              //参照整合性検証：支払　　　　　　　　　　　　　　　　　T_PAYMENT
	                List list16 = entity.mselect_T_PAYMENT.read(conn, struct);
	                if(list16.size()!=0){
	                	// エラーメッセージ設定
	                	Message = "M_VEND_CTRL.VEND_CD:" + struct.getVEND_CD();
	                	setErrorMessage("CA00139", Message);
	                }
	              //参照整合性検証：支払集計　　　　　　　　　　　　　　T_PAYMENT_CALC
	                List list17 = entity.mselect_T_PAYMENT_CALC.read(conn, struct);
	                if(list17.size()!=0){ 
	                	// エラーメッセージ設定
	                	Message = "M_VEND_CTRL.VEND_CD:" + struct.getVEND_CD();
	                	setErrorMessage("CA00140", Message);
	                }
				}
				// エラーが発生していない場合、削除処理実施
				if(msgStruct.sizeError() <= 0){
					if("0".equals(struct.geth_APR_VEND_CTRL())){
						entity.mdeleteM_VEND_CTRL.delete(conn, struct);
						// コミット
						conn.commit();
						// データクリア
						struct.clear();
						controlclear();	
					}else{
						insertAppr("delete");
						if(!msgStruct.hasError()){
							// コミット
							conn.commit();
							transFlg = false;
							// データクリア
							struct.clear();
							controlclear();
						}
						
					}
					
				}
			}
		} catch(SQLException e) {
			setSqlExceptionMsg(e);
		}finally{
			try {
				if(transFlg == true){
					// ロールバック
					conn.rollback();
				}
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		//---------------------------------------------------------------------
                //}}user_implement_dev:<controldelete>
		logger.exiting("AA0070010Control"+":USER="+struct.getsUser_ID(),"controldelete");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlclear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0070");
		logger.entering("AA0070010Control"+":USER="+struct.getsUser_ID(),"controlclear");
			//{{user_implement_dev:<controlclear>
		try
		{
			// デフォルト値設定
			setDefaultData();	

			struct.seth_APR_VEND_CTRL(_APR_VEND_CTRL);
			// モード設定
			setReadStatus(INITIAL);
			
		}
		catch(SQLException e)
		{
			setSqlExceptionMsg(e);
		}
				
                //}}user_implement_dev:<controlclear>
		logger.exiting("AA0070010Control"+":USER="+struct.getsUser_ID(),"controlclear");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0070");
		logger.entering("AA0070010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
		//----------------------------------------------------------------------
		// ユーザ定義初期化
		usersInitialize();
		//----------------------------------------------------------------------
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AA0070010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0070");
		logger.entering("AA0070010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
	try{
	 		// コンボボックスデータ用意
	 		ComboBox controller = new ComboBox(conn, sysUSER_CD);
	 		
			// コンボボックスのデータを取得
			_ROUND_TYP = controller.getData("ROUND_TYP");
			_TAX_APPLY_TYP = controller.getData("TAX_APPLY_TYP");
			_TAX_CALC_TYP = controller.getData("TAX_CALC_TYP");
			_EXCH_TYP = controller.getData("EXCH_TYP");
			_IMPORT_TRN_TYP = controller.getData("IMPORT_TRN_TYP");
			_INSPC_ACPT_APP_TYP = controller.getData("INSPC_ACPT_APP_TYP");
			
			struct.setList_ROUND_TYP_val(_ROUND_TYP.getValList());
			struct.setList_ROUND_TYP_name(_ROUND_TYP.getExplanList());
			struct.setList_TAX_APPLY_TYP_val(_TAX_APPLY_TYP.getValList());
			struct.setList_TAX_APPLY_TYP_name(_TAX_APPLY_TYP.getExplanList());
			struct.setList_TAX_CALC_TYP_val(_TAX_CALC_TYP.getValList());
			struct.setList_TAX_CALC_TYP_name(_TAX_CALC_TYP.getExplanList());
			struct.setList_EXCH_TYP_val(_EXCH_TYP.getValList());
			struct.setList_EXCH_TYP_name(_EXCH_TYP.getExplanList());
			struct.setList_IMPORT_TRN_TYP_val(_IMPORT_TRN_TYP.getValList());
			struct.setList_IMPORT_TRN_TYP_name(_IMPORT_TRN_TYP.getExplanList());
			struct.setList_INSPC_ACPT_APP_TYP_val(_INSPC_ACPT_APP_TYP.getValList());
			struct.setList_INSPC_ACPT_APP_TYP_name(_INSPC_ACPT_APP_TYP.getExplanList());			

		 	// クリア処理
			controlclear();
			/** パラメータ「取引先承認」を取得*/
	        privateConfig = new PrivateConfig(conn);	        
	        // 取引先承認
	        String apr_Vend_Ctrl = privateConfig.getString("APR_VEND_CTRL");
	        // パラメータ「取引先承認」が取得できなかった場合
			if(apr_Vend_Ctrl ==null || "".equals(apr_Vend_Ctrl)) {
	
				// パラメータ「取引先承認」を取得できなかった場合
				String locale = CoreTools.getLocale(struct.getsUser_ID());
				ResourceBundle messages = CoreTools.getResourceBundle("ExpjMessage", locale);
				ExpjMessage emsg =new ExpjMessage("AZ00041" , messages.getString("AZ00051"));
				msgStruct.addError(emsg);
 			    sysLog.warning(emsg, sysUSER_CD);
				struct.seth_APR_VEND_CTRL("0");
			} else if(!"1".equals(apr_Vend_Ctrl)) {
				// １以外の場合
				struct.seth_APR_VEND_CTRL("0");
			} else {
				struct.seth_APR_VEND_CTRL("1");
			}
			_APR_VEND_CTRL = struct.geth_APR_VEND_CTRL();
			// キーを取得
	        if("1".equals(struct.geth_APR_VEND_CTRL()) && this.isScreenMove() && null != struct.geth_SCREENMOVE_TYP()){
				getKey();
			}
		}catch(SQLException e) {
			setSqlExceptionMsg(e);
		}catch(ComboException e){
			// エラーメッセージ作成
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			
			throw ee;
		}
	 		
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AA0070010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * イベントハンドラの前処理です。
	 *
	 * @param buttun ボタン名
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0070");
		logger.entering("AA0070010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("AA0070010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("update") ) {
				controlupdate();
			} else if( button.equals("delete") ) {
				controldelete();
			} else if( button.equals("clear") ) {
				controlclear();
			} else if( button.equals("initial") ) {
				controlINITIAL();
			} else if( button.equals("reload") ) {
				controlRELOAD();
			}
		//{{user_implement_dev:<control_eventHandller>

				struct.setList_ROUND_TYP_val(_ROUND_TYP.getValList());
				struct.setList_ROUND_TYP_name(_ROUND_TYP.getExplanList());
				struct.setList_TAX_APPLY_TYP_val(_TAX_APPLY_TYP.getValList());
				struct.setList_TAX_APPLY_TYP_name(_TAX_APPLY_TYP.getExplanList());
				struct.setList_TAX_CALC_TYP_val(_TAX_CALC_TYP.getValList());
				struct.setList_TAX_CALC_TYP_name(_TAX_CALC_TYP.getExplanList());
				struct.setList_EXCH_TYP_val(_EXCH_TYP.getValList());
				struct.setList_EXCH_TYP_name(_EXCH_TYP.getExplanList());
				struct.setList_IMPORT_TRN_TYP_val(_IMPORT_TRN_TYP.getValList());
				struct.setList_IMPORT_TRN_TYP_name(_IMPORT_TRN_TYP.getExplanList());
				struct.setList_INSPC_ACPT_APP_TYP_val(_INSPC_ACPT_APP_TYP.getValList());
				struct.setList_INSPC_ACPT_APP_TYP_name(_INSPC_ACPT_APP_TYP.getExplanList());			


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
//			throw new FoundationException("AA0070010Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AA0070010-E999","CSVの出力処理"));
			throw new FoundationException("AA0070010Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AA0070010-E999","システム日付の取得処理"));
				throw new FoundationException("AA0070010Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AA0070010-E999","コントロールのイベント処理"));
			throw new FoundationException("AA0070010Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected AA0070010Entity entity;
	protected AA0070010Struct struct;
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

		entity = new AA0070010Entity();
		struct = new AA0070010Struct();

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
	 * AA0070010クラスの標準コンストラクタ
	 */
	public AA0070010Control() throws BusinessProcessException, FoundationException
	{
		initialize();

		//conn = connect();
		//{{user_implement_code_constractor
		//---------------------------------------------------------------------
		setReadStatus(INITIAL);
		//---------------------------------------------------------------------
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
				AA0070010Struct key = (AA0070010Struct)keyList.get(j);
				// メッセージキーを作成する
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("ROUND_TYP_name") && key.getROUND_TYP_name() != null) {
					msgKey.setKeyValue("ROUND_TYP_name", key.getROUND_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("ROUND_TYP_val") && key.getROUND_TYP_val() != null) {
					msgKey.setKeyValue("ROUND_TYP_val", key.getROUND_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("TAX_APPLY_TYP_name") && key.getTAX_APPLY_TYP_name() != null) {
					msgKey.setKeyValue("TAX_APPLY_TYP_name", key.getTAX_APPLY_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("TAX_APPLY_TYP_val") && key.getTAX_APPLY_TYP_val() != null) {
					msgKey.setKeyValue("TAX_APPLY_TYP_val", key.getTAX_APPLY_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("TAX_CALC_TYP_name") && key.getTAX_CALC_TYP_name() != null) {
					msgKey.setKeyValue("TAX_CALC_TYP_name", key.getTAX_CALC_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("TAX_CALC_TYP_val") && key.getTAX_CALC_TYP_val() != null) {
					msgKey.setKeyValue("TAX_CALC_TYP_val", key.getTAX_CALC_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("EXCH_TYP_name") && key.getEXCH_TYP_name() != null) {
					msgKey.setKeyValue("EXCH_TYP_name", key.getEXCH_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("EXCH_TYP_val") && key.getEXCH_TYP_val() != null) {
					msgKey.setKeyValue("EXCH_TYP_val", key.getEXCH_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("IMPORT_TRN_TYP_name") && key.getIMPORT_TRN_TYP_name() != null) {
					msgKey.setKeyValue("IMPORT_TRN_TYP_name", key.getIMPORT_TRN_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("IMPORT_TRN_TYP_val") && key.getIMPORT_TRN_TYP_val() != null) {
					msgKey.setKeyValue("IMPORT_TRN_TYP_val", key.getIMPORT_TRN_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("INSPC_ACPT_APP_TYP_name") && key.getINSPC_ACPT_APP_TYP_name() != null) {
					msgKey.setKeyValue("INSPC_ACPT_APP_TYP_name", key.getINSPC_ACPT_APP_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("INSPC_ACPT_APP_TYP_val") && key.getINSPC_ACPT_APP_TYP_val() != null) {
					msgKey.setKeyValue("INSPC_ACPT_APP_TYP_val", key.getINSPC_ACPT_APP_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("h_SCREENMOVE_TYP") && key.geth_SCREENMOVE_TYP() != null) {
					msgKey.setKeyValue("h_SCREENMOVE_TYP", key.geth_SCREENMOVE_TYP());
				}
				if(msgKeyType.containsKeyColumn("h_APPR_ID") && key.geth_APPR_ID() != null) {
					msgKey.setKeyValue("h_APPR_ID", key.geth_APPR_ID());
				}
				if(msgKeyType.containsKeyColumn("APPR_REMARKS") && key.getAPPR_REMARKS() != null) {
					msgKey.setKeyValue("APPR_REMARKS", key.getAPPR_REMARKS());
				}
				if(msgKeyType.containsKeyColumn("h_APR_VEND_CTRL") && key.geth_APR_VEND_CTRL() != null) {
					msgKey.setKeyValue("h_APR_VEND_CTRL", key.geth_APR_VEND_CTRL());
				}
				if(msgKeyType.containsKeyColumn("COUNT") && key.getCOUNT() != null) {
					msgKey.setKeyValue("COUNT", key.getCOUNT().toString());
				}
				if(msgKeyType.containsKeyColumn("COMPANY_CD") && key.getCOMPANY_CD() != null) {
					msgKey.setKeyValue("COMPANY_CD", key.getCOMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("VEND_CLASS_01_TYP") && key.getVEND_CLASS_01_TYP() != null) {
					msgKey.setKeyValue("VEND_CLASS_01_TYP", key.getVEND_CLASS_01_TYP());
				}
				if(msgKeyType.containsKeyColumn("VEND_CLASS_02_TYP") && key.getVEND_CLASS_02_TYP() != null) {
					msgKey.setKeyValue("VEND_CLASS_02_TYP", key.getVEND_CLASS_02_TYP());
				}
				if(msgKeyType.containsKeyColumn("VEND_CLASS_03_TYP") && key.getVEND_CLASS_03_TYP() != null) {
					msgKey.setKeyValue("VEND_CLASS_03_TYP", key.getVEND_CLASS_03_TYP());
				}
				if(msgKeyType.containsKeyColumn("VEND_CLASS_04_TYP") && key.getVEND_CLASS_04_TYP() != null) {
					msgKey.setKeyValue("VEND_CLASS_04_TYP", key.getVEND_CLASS_04_TYP());
				}
				if(msgKeyType.containsKeyColumn("VEND_CLASS_05_TYP") && key.getVEND_CLASS_05_TYP() != null) {
					msgKey.setKeyValue("VEND_CLASS_05_TYP", key.getVEND_CLASS_05_TYP());
				}
				if(msgKeyType.containsKeyColumn("VEND_CLASS_06_TYP") && key.getVEND_CLASS_06_TYP() != null) {
					msgKey.setKeyValue("VEND_CLASS_06_TYP", key.getVEND_CLASS_06_TYP());
				}
				if(msgKeyType.containsKeyColumn("VEND_CLASS_07_TYP") && key.getVEND_CLASS_07_TYP() != null) {
					msgKey.setKeyValue("VEND_CLASS_07_TYP", key.getVEND_CLASS_07_TYP());
				}
				if(msgKeyType.containsKeyColumn("VEND_CLASS_08_TYP") && key.getVEND_CLASS_08_TYP() != null) {
					msgKey.setKeyValue("VEND_CLASS_08_TYP", key.getVEND_CLASS_08_TYP());
				}
				if(msgKeyType.containsKeyColumn("VEND_CLASS_09_TYP") && key.getVEND_CLASS_09_TYP() != null) {
					msgKey.setKeyValue("VEND_CLASS_09_TYP", key.getVEND_CLASS_09_TYP());
				}
				if(msgKeyType.containsKeyColumn("VEND_CLASS_10_TYP") && key.getVEND_CLASS_10_TYP() != null) {
					msgKey.setKeyValue("VEND_CLASS_10_TYP", key.getVEND_CLASS_10_TYP());
				}
				if(msgKeyType.containsKeyColumn("VEND_CD") && key.getVEND_CD() != null) {
					msgKey.setKeyValue("VEND_CD", key.getVEND_CD());
				}
				if(msgKeyType.containsKeyColumn("h_VEND_CD") && key.geth_VEND_CD() != null) {
					msgKey.setKeyValue("h_VEND_CD", key.geth_VEND_CD());
				}
				if(msgKeyType.containsKeyColumn("VEND_NAME") && key.getVEND_NAME() != null) {
					msgKey.setKeyValue("VEND_NAME", key.getVEND_NAME());
				}
				if(msgKeyType.containsKeyColumn("VEND_ANAME") && key.getVEND_ANAME() != null) {
					msgKey.setKeyValue("VEND_ANAME", key.getVEND_ANAME());
				}
				if(msgKeyType.containsKeyColumn("VEND_KNAME") && key.getVEND_KNAME() != null) {
					msgKey.setKeyValue("VEND_KNAME", key.getVEND_KNAME());
				}
				if(msgKeyType.containsKeyColumn("ZIP_CD") && key.getZIP_CD() != null) {
					msgKey.setKeyValue("ZIP_CD", key.getZIP_CD());
				}
				if(msgKeyType.containsKeyColumn("ADDRESS_1") && key.getADDRESS_1() != null) {
					msgKey.setKeyValue("ADDRESS_1", key.getADDRESS_1());
				}
				if(msgKeyType.containsKeyColumn("ADDRESS_2") && key.getADDRESS_2() != null) {
					msgKey.setKeyValue("ADDRESS_2", key.getADDRESS_2());
				}
				if(msgKeyType.containsKeyColumn("ADDRESS_K_1") && key.getADDRESS_K_1() != null) {
					msgKey.setKeyValue("ADDRESS_K_1", key.getADDRESS_K_1());
				}
				if(msgKeyType.containsKeyColumn("ADDRESS_K_2") && key.getADDRESS_K_2() != null) {
					msgKey.setKeyValue("ADDRESS_K_2", key.getADDRESS_K_2());
				}
				if(msgKeyType.containsKeyColumn("TEL") && key.getTEL() != null) {
					msgKey.setKeyValue("TEL", key.getTEL());
				}
				if(msgKeyType.containsKeyColumn("FAX") && key.getFAX() != null) {
					msgKey.setKeyValue("FAX", key.getFAX());
				}
				if(msgKeyType.containsKeyColumn("EMAIL") && key.getEMAIL() != null) {
					msgKey.setKeyValue("EMAIL", key.getEMAIL());
				}
				if(msgKeyType.containsKeyColumn("VEND_ORG") && key.getVEND_ORG() != null) {
					msgKey.setKeyValue("VEND_ORG", key.getVEND_ORG());
				}
				if(msgKeyType.containsKeyColumn("VEND_PERSON") && key.getVEND_PERSON() != null) {
					msgKey.setKeyValue("VEND_PERSON", key.getVEND_PERSON());
				}
				if(msgKeyType.containsKeyColumn("OWN_ORG_CD") && key.getOWN_ORG_CD() != null) {
					msgKey.setKeyValue("OWN_ORG_CD", key.getOWN_ORG_CD());
				}
				if(msgKeyType.containsKeyColumn("OWN_ORG_NAME") && key.getOWN_ORG_NAME() != null) {
					msgKey.setKeyValue("OWN_ORG_NAME", key.getOWN_ORG_NAME());
				}
				if(msgKeyType.containsKeyColumn("OWN_PERSON_CD") && key.getOWN_PERSON_CD() != null) {
					msgKey.setKeyValue("OWN_PERSON_CD", key.getOWN_PERSON_CD());
				}
				if(msgKeyType.containsKeyColumn("OWN_PERSON_NAME") && key.getOWN_PERSON_NAME() != null) {
					msgKey.setKeyValue("OWN_PERSON_NAME", key.getOWN_PERSON_NAME());
				}
				if(msgKeyType.containsKeyColumn("ROUND_TYP") && key.getROUND_TYP() != null) {
					msgKey.setKeyValue("ROUND_TYP", key.getROUND_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("INSPC_ACPT_APP_TYP") && key.getINSPC_ACPT_APP_TYP() != null) {
					msgKey.setKeyValue("INSPC_ACPT_APP_TYP", key.getINSPC_ACPT_APP_TYP());
				}
				if(msgKeyType.containsKeyColumn("TAX_CD") && key.getTAX_CD() != null) {
					msgKey.setKeyValue("TAX_CD", key.getTAX_CD());
				}
				if(msgKeyType.containsKeyColumn("TAX_APPLY_TYP") && key.getTAX_APPLY_TYP() != null) {
					msgKey.setKeyValue("TAX_APPLY_TYP", key.getTAX_APPLY_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("TAX_CALC_TYP") && key.getTAX_CALC_TYP() != null) {
					msgKey.setKeyValue("TAX_CALC_TYP", key.getTAX_CALC_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("ODR_FORM_FLG") && key.getODR_FORM_FLG() != null) {
					msgKey.setKeyValue("ODR_FORM_FLG", key.getODR_FORM_FLG());
				}
				if(msgKeyType.containsKeyColumn("ODR_EDI_FLG") && key.getODR_EDI_FLG() != null) {
					msgKey.setKeyValue("ODR_EDI_FLG", key.getODR_EDI_FLG());
				}
				if(msgKeyType.containsKeyColumn("ODR_FAX_FLG") && key.getODR_FAX_FLG() != null) {
					msgKey.setKeyValue("ODR_FAX_FLG", key.getODR_FAX_FLG());
				}
				if(msgKeyType.containsKeyColumn("ODR_MAIL_FLG") && key.getODR_MAIL_FLG() != null) {
					msgKey.setKeyValue("ODR_MAIL_FLG", key.getODR_MAIL_FLG());
				}
				if(msgKeyType.containsKeyColumn("VEND_REM") && key.getVEND_REM() != null) {
					msgKey.setKeyValue("VEND_REM", key.getVEND_REM());
				}
				if(msgKeyType.containsKeyColumn("MODIFY_COUNT") && key.getMODIFY_COUNT() != null) {
					msgKey.setKeyValue("MODIFY_COUNT", key.getMODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("EXCH_TYP") && key.getEXCH_TYP() != null) {
					msgKey.setKeyValue("EXCH_TYP", key.getEXCH_TYP());
				}
				if(msgKeyType.containsKeyColumn("IMPORT_TRN_TYP") && key.getIMPORT_TRN_TYP() != null) {
					msgKey.setKeyValue("IMPORT_TRN_TYP", key.getIMPORT_TRN_TYP());
				}
				if(msgKeyType.containsKeyColumn("CUR_CD") && key.getCUR_CD() != null) {
					msgKey.setKeyValue("CUR_CD", key.getCUR_CD());
				}
				if(msgKeyType.containsKeyColumn("CUR_NAME") && key.getCUR_NAME() != null) {
					msgKey.setKeyValue("CUR_NAME", key.getCUR_NAME());
				}
				if(msgKeyType.containsKeyColumn("CTRL_CD") && key.getCTRL_CD() != null) {
					msgKey.setKeyValue("CTRL_CD", key.getCTRL_CD());
				}
				if(msgKeyType.containsKeyColumn("ONEROUS_CONS_NO") && key.getONEROUS_CONS_NO() != null) {
					msgKey.setKeyValue("ONEROUS_CONS_NO", key.getONEROUS_CONS_NO());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_CD") && key.getPUCH_ODR_CD() != null) {
					msgKey.setKeyValue("PUCH_ODR_CD", key.getPUCH_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("w_VEND_CD") && key.getw_VEND_CD() != null) {
					msgKey.setKeyValue("w_VEND_CD", key.getw_VEND_CD());
				}
				if(msgKeyType.containsKeyColumn("INSTALL_FLG") && key.getINSTALL_FLG() != null) {
					msgKey.setKeyValue("INSTALL_FLG", key.getINSTALL_FLG());
				}
				if(msgKeyType.containsKeyColumn("OPTION_ID") && key.getOPTION_ID() != null) {
					msgKey.setKeyValue("OPTION_ID", key.getOPTION_ID());
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
					AA0070010Struct key = new AA0070010Struct();
					if(msgKeyType.containsKeyColumn("ROUND_TYP_name")) {
						key.setROUND_TYP_name(msgKey.getKeyValue("ROUND_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("ROUND_TYP_val")) {
						key.setROUND_TYP_val(msgKey.getKeyValue("ROUND_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("TAX_APPLY_TYP_name")) {
						key.setTAX_APPLY_TYP_name(msgKey.getKeyValue("TAX_APPLY_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("TAX_APPLY_TYP_val")) {
						key.setTAX_APPLY_TYP_val(msgKey.getKeyValue("TAX_APPLY_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("TAX_CALC_TYP_name")) {
						key.setTAX_CALC_TYP_name(msgKey.getKeyValue("TAX_CALC_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("TAX_CALC_TYP_val")) {
						key.setTAX_CALC_TYP_val(msgKey.getKeyValue("TAX_CALC_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("EXCH_TYP_name")) {
						key.setEXCH_TYP_name(msgKey.getKeyValue("EXCH_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("EXCH_TYP_val")) {
						key.setEXCH_TYP_val(msgKey.getKeyValue("EXCH_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("IMPORT_TRN_TYP_name")) {
						key.setIMPORT_TRN_TYP_name(msgKey.getKeyValue("IMPORT_TRN_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("IMPORT_TRN_TYP_val")) {
						key.setIMPORT_TRN_TYP_val(msgKey.getKeyValue("IMPORT_TRN_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("INSPC_ACPT_APP_TYP_name")) {
						key.setINSPC_ACPT_APP_TYP_name(msgKey.getKeyValue("INSPC_ACPT_APP_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("INSPC_ACPT_APP_TYP_val")) {
						key.setINSPC_ACPT_APP_TYP_val(msgKey.getKeyValue("INSPC_ACPT_APP_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("h_SCREENMOVE_TYP")) {
						key.seth_SCREENMOVE_TYP(msgKey.getKeyValue("h_SCREENMOVE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("h_APPR_ID")) {
						key.seth_APPR_ID(msgKey.getKeyValue("h_APPR_ID"));
					}
					if(msgKeyType.containsKeyColumn("APPR_REMARKS")) {
						key.setAPPR_REMARKS(msgKey.getKeyValue("APPR_REMARKS"));
					}
					if(msgKeyType.containsKeyColumn("h_APR_VEND_CTRL")) {
						key.seth_APR_VEND_CTRL(msgKey.getKeyValue("h_APR_VEND_CTRL"));
					}
					if(msgKeyType.containsKeyColumn("COUNT")) {
						key.setCOUNT(new Integer(msgKey.getKeyValue("COUNT")));
					}
					if(msgKeyType.containsKeyColumn("COMPANY_CD")) {
						key.setCOMPANY_CD(msgKey.getKeyValue("COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("VEND_CLASS_01_TYP")) {
						key.setVEND_CLASS_01_TYP(msgKey.getKeyValue("VEND_CLASS_01_TYP"));
					}
					if(msgKeyType.containsKeyColumn("VEND_CLASS_02_TYP")) {
						key.setVEND_CLASS_02_TYP(msgKey.getKeyValue("VEND_CLASS_02_TYP"));
					}
					if(msgKeyType.containsKeyColumn("VEND_CLASS_03_TYP")) {
						key.setVEND_CLASS_03_TYP(msgKey.getKeyValue("VEND_CLASS_03_TYP"));
					}
					if(msgKeyType.containsKeyColumn("VEND_CLASS_04_TYP")) {
						key.setVEND_CLASS_04_TYP(msgKey.getKeyValue("VEND_CLASS_04_TYP"));
					}
					if(msgKeyType.containsKeyColumn("VEND_CLASS_05_TYP")) {
						key.setVEND_CLASS_05_TYP(msgKey.getKeyValue("VEND_CLASS_05_TYP"));
					}
					if(msgKeyType.containsKeyColumn("VEND_CLASS_06_TYP")) {
						key.setVEND_CLASS_06_TYP(msgKey.getKeyValue("VEND_CLASS_06_TYP"));
					}
					if(msgKeyType.containsKeyColumn("VEND_CLASS_07_TYP")) {
						key.setVEND_CLASS_07_TYP(msgKey.getKeyValue("VEND_CLASS_07_TYP"));
					}
					if(msgKeyType.containsKeyColumn("VEND_CLASS_08_TYP")) {
						key.setVEND_CLASS_08_TYP(msgKey.getKeyValue("VEND_CLASS_08_TYP"));
					}
					if(msgKeyType.containsKeyColumn("VEND_CLASS_09_TYP")) {
						key.setVEND_CLASS_09_TYP(msgKey.getKeyValue("VEND_CLASS_09_TYP"));
					}
					if(msgKeyType.containsKeyColumn("VEND_CLASS_10_TYP")) {
						key.setVEND_CLASS_10_TYP(msgKey.getKeyValue("VEND_CLASS_10_TYP"));
					}
					if(msgKeyType.containsKeyColumn("VEND_CD")) {
						key.setVEND_CD(msgKey.getKeyValue("VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_VEND_CD")) {
						key.seth_VEND_CD(msgKey.getKeyValue("h_VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("VEND_NAME")) {
						key.setVEND_NAME(msgKey.getKeyValue("VEND_NAME"));
					}
					if(msgKeyType.containsKeyColumn("VEND_ANAME")) {
						key.setVEND_ANAME(msgKey.getKeyValue("VEND_ANAME"));
					}
					if(msgKeyType.containsKeyColumn("VEND_KNAME")) {
						key.setVEND_KNAME(msgKey.getKeyValue("VEND_KNAME"));
					}
					if(msgKeyType.containsKeyColumn("ZIP_CD")) {
						key.setZIP_CD(msgKey.getKeyValue("ZIP_CD"));
					}
					if(msgKeyType.containsKeyColumn("ADDRESS_1")) {
						key.setADDRESS_1(msgKey.getKeyValue("ADDRESS_1"));
					}
					if(msgKeyType.containsKeyColumn("ADDRESS_2")) {
						key.setADDRESS_2(msgKey.getKeyValue("ADDRESS_2"));
					}
					if(msgKeyType.containsKeyColumn("ADDRESS_K_1")) {
						key.setADDRESS_K_1(msgKey.getKeyValue("ADDRESS_K_1"));
					}
					if(msgKeyType.containsKeyColumn("ADDRESS_K_2")) {
						key.setADDRESS_K_2(msgKey.getKeyValue("ADDRESS_K_2"));
					}
					if(msgKeyType.containsKeyColumn("TEL")) {
						key.setTEL(msgKey.getKeyValue("TEL"));
					}
					if(msgKeyType.containsKeyColumn("FAX")) {
						key.setFAX(msgKey.getKeyValue("FAX"));
					}
					if(msgKeyType.containsKeyColumn("EMAIL")) {
						key.setEMAIL(msgKey.getKeyValue("EMAIL"));
					}
					if(msgKeyType.containsKeyColumn("VEND_ORG")) {
						key.setVEND_ORG(msgKey.getKeyValue("VEND_ORG"));
					}
					if(msgKeyType.containsKeyColumn("VEND_PERSON")) {
						key.setVEND_PERSON(msgKey.getKeyValue("VEND_PERSON"));
					}
					if(msgKeyType.containsKeyColumn("OWN_ORG_CD")) {
						key.setOWN_ORG_CD(msgKey.getKeyValue("OWN_ORG_CD"));
					}
					if(msgKeyType.containsKeyColumn("OWN_ORG_NAME")) {
						key.setOWN_ORG_NAME(msgKey.getKeyValue("OWN_ORG_NAME"));
					}
					if(msgKeyType.containsKeyColumn("OWN_PERSON_CD")) {
						key.setOWN_PERSON_CD(msgKey.getKeyValue("OWN_PERSON_CD"));
					}
					if(msgKeyType.containsKeyColumn("OWN_PERSON_NAME")) {
						key.setOWN_PERSON_NAME(msgKey.getKeyValue("OWN_PERSON_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ROUND_TYP")) {
						key.setROUND_TYP(new Integer(msgKey.getKeyValue("ROUND_TYP")));
					}
					if(msgKeyType.containsKeyColumn("INSPC_ACPT_APP_TYP")) {
						key.setINSPC_ACPT_APP_TYP(msgKey.getKeyValue("INSPC_ACPT_APP_TYP"));
					}
					if(msgKeyType.containsKeyColumn("TAX_CD")) {
						key.setTAX_CD(msgKey.getKeyValue("TAX_CD"));
					}
					if(msgKeyType.containsKeyColumn("TAX_APPLY_TYP")) {
						key.setTAX_APPLY_TYP(new Integer(msgKey.getKeyValue("TAX_APPLY_TYP")));
					}
					if(msgKeyType.containsKeyColumn("TAX_CALC_TYP")) {
						key.setTAX_CALC_TYP(new Integer(msgKey.getKeyValue("TAX_CALC_TYP")));
					}
					if(msgKeyType.containsKeyColumn("ODR_FORM_FLG")) {
						key.setODR_FORM_FLG(msgKey.getKeyValue("ODR_FORM_FLG"));
					}
					if(msgKeyType.containsKeyColumn("ODR_EDI_FLG")) {
						key.setODR_EDI_FLG(msgKey.getKeyValue("ODR_EDI_FLG"));
					}
					if(msgKeyType.containsKeyColumn("ODR_FAX_FLG")) {
						key.setODR_FAX_FLG(msgKey.getKeyValue("ODR_FAX_FLG"));
					}
					if(msgKeyType.containsKeyColumn("ODR_MAIL_FLG")) {
						key.setODR_MAIL_FLG(msgKey.getKeyValue("ODR_MAIL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("VEND_REM")) {
						key.setVEND_REM(msgKey.getKeyValue("VEND_REM"));
					}
					if(msgKeyType.containsKeyColumn("MODIFY_COUNT")) {
						key.setMODIFY_COUNT(msgKey.getKeyValue("MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("EXCH_TYP")) {
						key.setEXCH_TYP(msgKey.getKeyValue("EXCH_TYP"));
					}
					if(msgKeyType.containsKeyColumn("IMPORT_TRN_TYP")) {
						key.setIMPORT_TRN_TYP(msgKey.getKeyValue("IMPORT_TRN_TYP"));
					}
					if(msgKeyType.containsKeyColumn("CUR_CD")) {
						key.setCUR_CD(msgKey.getKeyValue("CUR_CD"));
					}
					if(msgKeyType.containsKeyColumn("CUR_NAME")) {
						key.setCUR_NAME(msgKey.getKeyValue("CUR_NAME"));
					}
					if(msgKeyType.containsKeyColumn("CTRL_CD")) {
						key.setCTRL_CD(msgKey.getKeyValue("CTRL_CD"));
					}
					if(msgKeyType.containsKeyColumn("ONEROUS_CONS_NO")) {
						key.setONEROUS_CONS_NO(msgKey.getKeyValue("ONEROUS_CONS_NO"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_CD")) {
						key.setPUCH_ODR_CD(msgKey.getKeyValue("PUCH_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_VEND_CD")) {
						key.setw_VEND_CD(msgKey.getKeyValue("w_VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("INSTALL_FLG")) {
						key.setINSTALL_FLG(msgKey.getKeyValue("INSTALL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("OPTION_ID")) {
						key.setOPTION_ID(msgKey.getKeyValue("OPTION_ID"));
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
