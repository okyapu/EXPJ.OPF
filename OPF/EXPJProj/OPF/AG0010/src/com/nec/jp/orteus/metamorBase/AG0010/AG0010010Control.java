/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AG0010/src/com/nec/jp/orteus/metamorBase/AG0010/AG0010010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AG0010;

import com.nec.jp.orteus.metamorBase.AG0010.*;
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
import com.nec.jp.orteus.metamorBase.common01.util.Calculate;
import com.nec.jp.orteus.metamorBase.common08.LotCtrl.LotCtrl;

import java.text.SimpleDateFormat;
import java.text.ParseException;
//------------------------------------------------------------------------------
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AG0010010Control
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
	private String lotctrl;
	protected List list;											// 結果リストのインスタンス
	public List getList() { return this.list; }						// リストを返します。
	public void setList(List listname) { this.list = listname; }	// リストをセットします。
	public int getListsize() {										// リスト型のサイズを返します。
		int nret = 0;
		if( this.list != null ) {nret = this.list.size();}
		return nret;
	}
//	public Object getListvalue(int x) { return this.list.get(x); }	// リストの値を返します。
	public AG0010010Struct getListvalue(int x) { return (AG0010010Struct)(this.list.get(x)); }	// リストの値を返します。
	public AG0010010Struct getStruct() { return this.struct; }	// Structを返します。
	public AG0010010Struct createStruct() { return new AG0010010Struct(); }	// 新しいStructを作って返します。
	public void setStruct(Object structname) { this.struct.setStruct((AG0010010Struct)structname); }	// Structをセットします。
//	public void initializeStruct() { this.struct.initialize(); }	// Structの値を初期化します。

	// CSV出力用リスト
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }


//-------------------------------------------------------------------------
	/** 画面共通定義取得クラス */
	ScreenParam _scParam = sp;


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
	private AG0010010Struct _keyStruct = new AG0010010Struct();

	/** キー情報Structの取得 */
	public AG0010010Struct getKeyStruct(){ return _keyStruct; }
	
	/** キー情報Structの設定 */
	public void setKeyStruct(AG0010010Struct struct){ _keyStruct.copy(struct); }


//---------- コンボボックスデータ取得関連の処理 -------------------------------

	/** 品目手配区分 */
	ComboStruct _MRP_ODR_TYP = new ComboStruct();

	/** 画面遷移パラメータ（工場コード） */
	private String plantCd = null;
	
	/** 画面遷移パラメータ（品目番号） */
	private String itemCd = null;
	
	/** 画面遷移パラメータ（保管区コード） */
	private String w_WH_CD = null;
	
	/** 次に遷移する画面のURL */
	private String _nextUrl = null;
	
	/** 次に遷移する画面のURLFlg */
	private String _nextUrlFlg = null;
	
	/** 画面遷移パラメータ*/
	private String templot = null;
	
	/** 画面遷移パラメータ*/
	private String WH_NAME = null;
	
	
	/** 画面遷移パラメータ（工場コード）を取得します。 */
	public String getPlantCd() {
		return plantCd;
	}
	
	/** 画面遷移パラメータ（工場コード）を設定します。 */
	public void setPlantCd(String s) {
		plantCd = s;
	}
	
	/** 画面遷移パラメータ（品目番号）を取得します。 */
	public String getItemCd() {
		return itemCd;
	}
	
	/** 画面遷移パラメータ（品目番号）を設定します。 */
	public void setItemCd(String s) {
		itemCd = s;
	}
	
	/** 画面遷移パラメータ（保管区コード）を取得します。 */
	public String getWh_Cd() {
		return w_WH_CD;
	}
	
	/**
	 * 画面遷移キー(保管区コード)設定
	 * @param cd 保管区コード
	 */
	public void setWh_Cd(String cd) {
		w_WH_CD = cd;
	}
	
	/** 画面遷移パラメータを取得します。 */
	public String getWH_NAME() {
		return WH_NAME;
	}
	
	/**
	 * 画面遷移パラメータ設定
	 */
	public void setWH_NAME(String cd) {
		WH_NAME = cd;
	}
	
	/** 画面遷移パラメータを取得します。 */
	public String gettemplot() {
		return templot;
	}
	
	/**
	 * 画面遷移パラメータ設定
	 */
	public void settemplot(String cd) {
		templot = cd;
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
	
	/** 品目手配区分設定
	 * @param コンボボックスデータ
	*/
	public void setMRP_ODR_TYP_comb(ComboStruct combo){ _MRP_ODR_TYP = combo; }

	/** 品目手配区分取得
	 * @return 品目手配区分のコンボボックスデータ
	*/
	public ComboStruct getMRP_ODR_TYP_comb(){ return _MRP_ODR_TYP; }


	/** 所要量計算対象フラグ */
	ComboStruct _MRP_FLG = new ComboStruct();

	/** 所要量計算対象フラグ設定
	 * @param コンボボックスデータ
	*/
	public void setMRP_FLG_comb(ComboStruct combo){ _MRP_FLG = combo; }

	/** 所要量計算対象フラグ取得
	 * @return 所要量計算対象フラグのコンボボックスデータ
	*/
	public ComboStruct getMRP_FLG_comb(){ return _MRP_FLG; }
	
	/**
	 * 次に遷移する画面のURLFlgを設定します。
	 */
	public String getnextUrlFlg() {
		return _nextUrlFlg;
	}
	/**
	 * 次に遷移する画面のURLFlgを設定します。
	 */
	public void setnextUrlFlg(String urlFlg) {
		_nextUrlFlg = urlFlg;
	}

//-------------------------------------------------------------------------
	/**
	 * 区分名取得
	 * @param comboStruct 区分情報リスト
	 * @param intType 区分コード
	 * @return 区分名称。該当するデータがなかった場合は区分コードを返す
	 */
	private String getTypeName(ComboStruct comboStruct, Integer intType)
	{
		String strTyp = TypeConverter.sanitizer(intType);
		return getTypeName(comboStruct,strTyp);
	}
	/**
	 * 区分名取得
	 * @param comboStruct 区分情報リスト
	 * @param strTyp 区分コード
	 * @return 区分名称。該当するデータがなかった場合は区分コードを返す
	 */
	private String getTypeName(ComboStruct comboStruct, String strTyp)
	{
		String strTypName = strTyp;
		for(int i = 0; i < comboStruct.getValList().size(); i++){
			if(strTyp.equals((String)(comboStruct.getValList().get(i)))){
				strTypName = (String)(comboStruct.getExplanList().get(i));
				break;
			}
		}
		return strTypName;
	}
	/**
	 * 品目情報のフラグの表示を設定
	 * @param s フラグの値が設定されている情報
	 */
	private void setTypeValueAboutItem(AG0010010Struct s)
	{
		s.setMRP_ODR_NAME(getTypeName(_MRP_ODR_TYP,s.getMRP_ODR_TYP()));
	}
	/**
	 * 在庫情報のフラグの表示を設定
	 * @param s フラグの値が設定されている情報
	 */
	private void setTypeValueAboutStock(AG0010010Struct s)
	{
		s.setMRP_NAME(getTypeName(_MRP_FLG,s.getMRP_FLG()));
	}

//------------------------------------------------------------------------

	/** ユーザ定義の初期化済フラグ */
	private boolean _usersIntialized = false;

	/**
	 * ユーザ定義 初期化処理
	 */
	private void usersInitialize() throws ExpjException
	{
		if(_usersIntialized) return;

		// コンボデータの取得
		setComboData(struct);
		// 次に遷移する画面のURLFlg
		setnextUrlFlg("1");
		_usersIntialized = true;
		return ;
	}


//------------------------------------------------------------------------
	/**
	 * コンボボックスの中身を取得します。
	 *
	 * @param data データの箱
	 */
	 private void setComboData(AG0010010Struct data) throws ExpjException
	 {
		ComboBox comboController = new ComboBox(conn, sysUSER_CD);
		try{
			//コンボデータの取得
			ComboStruct MRP_ODR_TYP_comb = comboController.getData("MRP_ODR_TYP");
			ComboStruct MRP_FLG_comb = comboController.getData("MRP_FLG");

			comboController.setConnection(null);

			//属性に取得データ設定
			setMRP_ODR_TYP_comb(MRP_ODR_TYP_comb);
			setMRP_FLG_comb(MRP_FLG_comb);

		}catch(SQLException e) {
			setSqlExceptionMsg(e);

		}catch(ComboException e){
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;
		}
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


//------------------------------------------------------------------------
	/**
	 * 子画面の一覧表の表示最大行数制限チェック（servletから呼ばれる）
	 *
	 * @return なし
	 */
	public void maxLineCheck(int max) throws BusinessProcessException, FoundationException
	{
		// 表示最大行数制限処理
		ScreenParam sp = new ScreenParam(this.getClass());
		int maxLine = sp.getMaxLine(conn,max);
		if(maxLine != 0 && this.list.size() > maxLine){
			this.list.clear();
			setErrorMessage("ZZ01115", "", ""+maxLine);
		}
	}

//------------------------------------------------------------------------------
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * 読込ボタン押下時に実行される処理です。
	 *
	 */
	public void controlselect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AG0010");
		logger.entering("AG0010010Control"+":USER="+struct.getsUser_ID(),"controlselect");
			//{{user_implement_dev:<controlselect>
		//------------------------------------------------------------------
		// ログ出力情報格納用
		String logMessage = "";
		List listMessage = new ArrayList();

		try {

			// キー項目ログ表示
			logMessage = "ITEM_CD:" + struct.getw_ITEM_CD()
					+ ", PLANT_CD:" + struct.getw_PLANT_CD();
			setSyslogConfig(logMessage);

			// リストクリア
			if(list != null){
				list.clear();
			}
			
			// 在庫データ存在チェック用
			Integer checkitem = new Integer(0);
			Integer checkjob = new Integer(0);

			// エラーチェック
			// 工場コードが指定された場合
			if(struct.getw_PLANT_CD() != null && ("").equals(struct.getw_PLANT_CD()) == false){
				// 工場コードの存在チェック
				List tmpList = entity.mcheckM_PLANT.read(conn, struct);
				if(tmpList.size() <= 0) {
					// 読込処理失敗：工場コードが存在しません
					logMessage = "M_PLANT.PLANT_CD:" + struct.getw_PLANT_CD();
					setErrorMessage("AG00001", logMessage);
				}
				else{
					AG0010010Struct tmpStruct = (AG0010010Struct)tmpList.get(0);
					struct.setw_PLANT_NAME(tmpStruct.getw_PLANT_NAME());
				}
			}
			// 品目番号の存在チェック
			List workList = entity.mselect.read(conn, struct);
			if(workList.size() <= 0) {
				// 読込処理失敗：品目番号が存在しません
				logMessage = "M_ITEM.ITEM_CD:" + struct.getw_ITEM_CD();
				setErrorMessage("AG00003", logMessage);
			}

			// データ読込
			if(msgStruct.sizeError() <= 0){
				// 品目マスタ情報
				if(workList.size() > 0) {
					AG0010010Struct workStruct = (AG0010010Struct)workList.get(0);
					struct.setw_ITEM_NAME(workStruct.getw_ITEM_NAME());
					struct.setDRAW_CD(workStruct.getDRAW_CD());
					struct.setSPEC(workStruct.getSPEC());
					struct.setMRP_ODR_TYP(workStruct.getMRP_ODR_TYP());
					setTypeValueAboutItem(struct);
					struct.setSTOCK_UNIT(workStruct.getSTOCK_UNIT());
				}
				// Σ保管区別品目在庫
				workList = entity.mselectT_ITEM_STOCK.read(conn, struct);
				if(workList.size() > 0) {
					checkitem = new Integer(workList.size());
					AG0010010Struct workStruct = (AG0010010Struct)workList.get(0);
					struct.setw_ITEM_STOCK_QTY(workStruct.getw_ITEM_STOCK_QTY());
					struct.setw_ITEM_DEFECT_QTY(workStruct.getw_ITEM_DEFECT_QTY());
					struct.setw_ITEM_STOCK_QTY_LAST_DAY(workStruct.getw_ITEM_STOCK_QTY_LAST_DAY());
					struct.setw_ITEM_STOCK_QTY_LAST_MONTH(workStruct.getw_ITEM_STOCK_QTY_LAST_MONTH());
				}
				else{
					ExpjMessage emsg = new ExpjMessage( "AF00044" );
					sysLog.config(emsg, getsysUSER_CD());
					logMessage = "T_ITEM_STOCK.ITEM_CD:" + struct.getw_ITEM_CD()
							+ ", T_ITEM_STOCK.PLANT_CD:" + struct.getw_PLANT_CD();
					setSyslogConfig(logMessage);
				}
				// Σ保管区別製番在庫
				workList = entity.mselectT_JOB_STOCK.read(conn, struct);
				if(workList.size() > 0) {
					checkjob = new Integer(workList.size());
					AG0010010Struct workStruct = (AG0010010Struct)workList.get(0);
					struct.setw_JOB_ODR_STOCK_QTY(workStruct.getw_JOB_ODR_STOCK_QTY());
					struct.setw_JOB_ODR_STOCK_QTY_LAST_DAY(workStruct.getw_JOB_ODR_STOCK_QTY_LAST_DAY());
					struct.setw_JOB_ODR_STOCK_QTY_LAST_MONTH(workStruct.getw_JOB_ODR_STOCK_QTY_LAST_MONTH());
				}
				else{
					ExpjMessage emsg = new ExpjMessage( "AF00045" );
					sysLog.config(emsg, getsysUSER_CD());
					logMessage = "T_JOB_ODR_CD_STOCK.ITEM_CD:" + struct.getw_ITEM_CD()
							+ ", T_JOB_ODR_CD_STOCK.PLANT_CD:" + struct.getw_PLANT_CD();
					setSyslogConfig(logMessage);
				}
				// 在庫合計
				Calculate calculate = new Calculate();
				String s_QTY1 = new String(struct.getw_ITEM_STOCK_QTY());
				String s_QTY2 = new String(struct.getw_JOB_ODR_STOCK_QTY());
				struct.setw_TOTAL_STOCK_QTY(calculate.add(s_QTY1, s_QTY2));

				// 前日末在庫合計
				s_QTY1 = new String(struct.getw_ITEM_STOCK_QTY_LAST_DAY());
				s_QTY2 = new String(struct.getw_JOB_ODR_STOCK_QTY_LAST_DAY());
				struct.setw_TOTAL_STOCK_QTY_LAST_DAY(calculate.add(s_QTY1, s_QTY2));

				// 全月末在庫合計
				s_QTY1 = new String(struct.getw_ITEM_STOCK_QTY_LAST_MONTH());
				s_QTY2 = new String(struct.getw_JOB_ODR_STOCK_QTY_LAST_MONTH());
				struct.setw_TOTAL_STOCK_QTY_LAST_MONTH(calculate.add(s_QTY1, s_QTY2));

				// Σ保管区別品目在庫(MRP対象、対象外)
				workList = entity.mselectITEM_MRP_STOK.read(conn, struct);
				if(workList.size() > 0) {
					for(int i = 0; i < workList.size(); i++){
						AG0010010Struct workStruct = (AG0010010Struct)workList.get(i);
						if(workStruct.getMRP_FLG().intValue() == 1){
							struct.setw_ITEM_STOCK_QTY_FOR_MRP(workStruct.getw_ITEM_STOCK_QTY_FOR_MRP());
						}
						else{
							struct.setw_ITEM_STOCK_QTY_OUTSIDE_MRP(workStruct.getw_ITEM_STOCK_QTY_FOR_MRP());
						}
					}
				}
				// Σ保管区別製番在庫(MRP対象、対象外)
				workList = entity.mselectJOB_MRP_STOK.read(conn, struct);
				if(workList.size() > 0) {
					for(int i = 0; i < workList.size(); i++){
						AG0010010Struct workStruct = (AG0010010Struct)workList.get(i);
						if(workStruct.getMRP_FLG().intValue() == 1){
							struct.setw_JOB_ODR_STOCK_QTY_FOR_MRP(workStruct.getw_JOB_ODR_STOCK_QTY_FOR_MRP());
						}
						else{
							struct.setw_JOB_ODR_STOCK_QTY_OUTSIDE_MRP(workStruct.getw_JOB_ODR_STOCK_QTY_FOR_MRP());
						}
					}
				}

				// 在庫データ 0件の場合
				if(checkitem.intValue() == 0 &&
				   checkjob.intValue() == 0){
					// 読込処理：在庫データが存在しません
					listMessage.add("T_ITEM_STOCK.ITEM_CD:" + struct.getw_ITEM_CD());
					listMessage.add("T_JOB_ODR_CD_STOCK.ITEM_CD:" + struct.getw_ITEM_CD());
					setErrorMessage("ZZ06001", listMessage);
					listMessage.clear();
				}
			}


		}catch(SQLException e){
			setSqlExceptionMsg(e);
		}
		//------------------------------------------------------------------
                //}}user_implement_dev:<controlselect>
		logger.exiting("AG0010010Control"+":USER="+struct.getsUser_ID(),"controlselect");

		return;
	}

	/**
	 * 在庫詳細ボタン押下時に実行される処理です。
	 *
	 */
	public void controlinventoryDetail() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AG0010");
		logger.entering("AG0010010Control"+":USER="+struct.getsUser_ID(),"controlinventoryDetail");
			//{{user_implement_dev:<controlinventoryDetail>
		//------------------------------------------------------------------
		// ログ出力情報格納用
		String logMessage = "";
		List listMessage = new ArrayList();
		setnextUrlFlg("1");

		try {

			// キー項目ログ表示
			logMessage = "ITEM_CD:" + struct.getw_ITEM_CD()
					+ ", PLANT_CD:" + struct.getw_PLANT_CD();
			setSyslogConfig(logMessage);

			// リストクリア
			if(list != null){
				list.clear();
			}

			// 在庫データ存在チェック用
			Integer checkitem = new Integer(0);
			Integer checkjob = new Integer(0);

			// エラーチェック
			// 工場コードが指定された場合
			if(struct.getw_PLANT_CD() != null && ("").equals(struct.getw_PLANT_CD()) == false){
				// 工場コードの存在チェック
				List tmpList = entity.mcheckM_PLANT.read(conn, struct);
				if(tmpList.size() <= 0) {
					// 読込処理失敗：工場コードが存在しません
					logMessage = "M_PLANT.PLANT_CD:" + struct.getw_PLANT_CD();
					setErrorMessage("AG00001", logMessage);
				}
			}
			// 品目番号の存在チェック
			AG0010010Struct itemStruct = null;
			int maxLine = sp.getMaxLine(conn, 10);
			if(maxLine != 0) {
				struct.setROW_COUNT(String.valueOf(maxLine));
			} else {
				struct.setROW_COUNT(null);
			}
			
			List workList = entity.mselect.read(conn, struct);
			if(workList.size() <= 0) {
				// 読込処理失敗：品目番号が存在しません
				logMessage = "M_ITEM.ITEM_CD:" + struct.getw_ITEM_CD();
				setErrorMessage("AG00003", logMessage);
			}else{
				itemStruct = (AG0010010Struct)(workList.get(0));
				struct.seth_lotFlg(itemStruct.getLOT_CTRL_FLG());
			}
			// データ読込
			if(msgStruct.sizeError() <= 0){
				// 品目マスタ情報
				if(workList.size() > 0) {
					AG0010010Struct workStruct = (AG0010010Struct)workList.get(0);
					struct.setw_ITEM_NAME(workStruct.getw_ITEM_NAME());
					struct.setDRAW_CD(workStruct.getDRAW_CD());
					struct.setSPEC(workStruct.getSPEC());
					struct.setMRP_ODR_TYP(workStruct.getMRP_ODR_TYP());
					setTypeValueAboutItem(struct);
					struct.setSTOCK_UNIT(workStruct.getSTOCK_UNIT());
				}
				
				// 保管区別品目在庫（明細）
				workList = entity.mselectSub1Cnt.read(conn, struct);
				long rowCount = Long.parseLong(((AG0010010Struct)workList.get(0)).getl_COUNT());
				if (rowCount == 0) {
					ExpjMessage emsg = new ExpjMessage( "AF00044" );
					sysLog.config(emsg, getsysUSER_CD());
					logMessage = "T_ITEM_STOCK.ITEM_CD:" + struct.getw_ITEM_CD()
							+ ", T_ITEM_STOCK.PLANT_CD:" + struct.getw_PLANT_CD();
					setSyslogConfig(logMessage);
					checkitem = new Integer(0);
				} else {
					if (maxLine != 0 && rowCount == maxLine + 1) {
						setErrorMessage("ZZ01115", "", ""+maxLine);
						setReadStatus(TOO_MANY);
						if(workList != null && workList.size() > 0){
							workList.clear(); 
							list.clear();
						}
						return;
					} else {
						workList = entity.mselectSub1.read(conn, struct);
						checkitem = new Integer(workList.size());
						for(int i = 0; i < workList.size(); i++){
							list.add((AG0010010Struct)workList.get(i));
						}
					}
					
				}
				// 保管区別製番在庫（明細）
				workList = entity.mselectSub1_JOBCnt.read(conn, struct);
				long rowCount_Job = Long.parseLong(((AG0010010Struct)workList.get(0)).getl_COUNT());
				if(rowCount_Job == 0) {
					ExpjMessage emsg = new ExpjMessage( "AF00045" );
					sysLog.config(emsg, getsysUSER_CD());
					logMessage = "T_JOB_ODR_CD_STOCK.ITEM_CD:" + struct.getw_ITEM_CD()
							+ ", T_JOB_ODR_CD_STOCK.PLANT_CD:" + struct.getw_PLANT_CD();
					setSyslogConfig(logMessage);
					checkjob = new Integer(0);
				} else {
					if (maxLine != 0 && rowCount_Job + rowCount== maxLine + 1) {
						setErrorMessage("ZZ01115", "", ""+maxLine);
						setReadStatus(TOO_MANY);
						if(workList != null && workList.size() > 0){
							workList.clear();
							list.clear();
						}
						return;
					} else {
						workList = entity.mselectSub1_JOB.read(conn, struct);
						checkjob = new Integer(workList.size());
						for(int i = 0; i < workList.size(); i++){
							list.add((AG0010010Struct)workList.get(i));
						}
					}
					
				}
				// フラグの表示文字列設定
				for(int n = 0; n < list.size(); n++){
					setTypeValueAboutStock((AG0010010Struct)(list.get(n)));
				}

				// 在庫データ 0件の場合
				if(checkitem.intValue() == 0 &&
				   checkjob.intValue() == 0){
					// 在庫詳細処理：在庫データなし
					setnextUrlFlg("0");
					listMessage.add("T_ITEM_STOCK.ITEM_CD:" + struct.getw_ITEM_CD());
					listMessage.add("T_JOB_ODR_CD_STOCK.ITEM_CD:" + struct.getw_ITEM_CD());
					setErrorMessage("ZZ06001", listMessage);
					listMessage.clear();
					
				}
			}

		}catch(SQLException e){
			setSqlExceptionMsg(e);
		}
		//------------------------------------------------------------------
                //}}user_implement_dev:<controlinventoryDetail>
		logger.exiting("AG0010010Control"+":USER="+struct.getsUser_ID(),"controlinventoryDetail");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlclear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AG0010");
		logger.entering("AG0010010Control"+":USER="+struct.getsUser_ID(),"controlclear");
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
		_keyStruct = new AG0010010Struct();

		// 工場コードと工場名をデフォルト表示
		struct.setw_PLANT_CD(getsysPLANT_CD());

		//------------------------------------------------------------------
                //}}user_implement_dev:<controlclear>
		logger.exiting("AG0010010Control"+":USER="+struct.getsUser_ID(),"controlclear");

		return;
	}

	/**
	 * 戻るボタン押下時に実行される処理です。
	 *
	 */
	public void controlCloseSub1() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AG0010");
		logger.entering("AG0010010Control"+":USER="+struct.getsUser_ID(),"controlCloseSub1");
			//{{user_implement_dev:<controlCloseSub1>
		//------------------------------------------------------------------
		// 親画面データ再読込
		controlselect();
		//------------------------------------------------------------------
                //}}user_implement_dev:<controlCloseSub1>
		logger.exiting("AG0010010Control"+":USER="+struct.getsUser_ID(),"controlCloseSub1");

		return;
	}

	/**
	 * ロット別詳細ボタン押下時に実行される処理です。
	 *
	 */
	public void controlinventoryDetailsub1() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AG0010");
		logger.entering("AG0010010Control"+":USER="+struct.getsUser_ID(),"controlinventoryDetailsub1");
			//{{user_implement_dev:<controlinventoryDetailsub1>
			// TODO: ユーザ定義のコードを記述してください
		//-----------------------------------------------------------------------------------------
	    //ログ出力情報格納用
	    String logMessage = "";
	    List listMessage = new ArrayList();
	    try{
	    	
	        //キー項目ログ表示
			logMessage = "ITEM_CD:" + struct.getw_ITEM_CD()
					+ ", PLANT_CD:" + struct.getw_PLANT_CD();
			setSyslogConfig(logMessage);

			// リストクリア
			if(list != null){
				list.clear();
			}
			
            //在庫データ存在チェック用
			Integer checkitem = new Integer(0);
		    //保管区別品目在庫（明細）						
			List workList = entity.mselectDetailsub1.read(conn,struct);
			
			if(workList.size() > 0) {
				checkitem = new Integer(workList.size());
				for(int i = 0; i < workList.size(); i++){
					list.add((AG0010010Struct)workList.get(i));
				}
			}
			else{
				ExpjMessage emsg = new ExpjMessage( "AF00044" );
				sysLog.config(emsg, getsysUSER_CD());
				logMessage = "T_LOT_STOCK.ITEM_CD:" + struct.getw_ITEM_CD() 
				             + "T_LOT_STOCK.WH_CD:" + struct.getw_WH_CD();
				setSyslogConfig(logMessage);
			}
			
			//在庫データ 0件の場合
			if(checkitem.intValue() == 0){
				controlinventoryDetail();
		        // 在庫詳細処理：在庫データなし
		        listMessage.add("T_LOT_STOCK.ITEM_CD:" + struct.getw_ITEM_CD());
			    listMessage.add("T_LOT_STOCK.WH_CD:" + struct.getw_WH_CD());
			    setErrorMessage("ZZ06001", listMessage);
			    listMessage.clear();		    
			}
	    	
	    }catch(SQLException e){
	       setSqlExceptionMsg(e);		    	
	    }		    
	//-----------------------------------------------------------------------------------------
                //}}user_implement_dev:<controlinventoryDetailsub1>
		logger.exiting("AG0010010Control"+":USER="+struct.getsUser_ID(),"controlinventoryDetailsub1");

		return;
	}

	/**
	 * 戻るボタン押下時に実行される処理です。
	 *
	 */
	public void controlCloseSub2() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AG0010");
		logger.entering("AG0010010Control"+":USER="+struct.getsUser_ID(),"controlCloseSub2");
			//{{user_implement_dev:<controlCloseSub2>
			// TODO: ユーザ定義のコードを記述してください
	    //在庫参照サブ1データ再読込
	    controlinventoryDetail();
                //}}user_implement_dev:<controlCloseSub2>
		logger.exiting("AG0010010Control"+":USER="+struct.getsUser_ID(),"controlCloseSub2");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AG0010");
		logger.entering("AG0010010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
		//------------------------------------------------------------------
		// ユーザ定義初期化
		usersInitialize();
		//------------------------------------------------------------------
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AG0010010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AG0010");
		logger.entering("AG0010010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
		//------------------------------------------------------------------
		// ユーザ定義初期化
		usersInitialize();
		try {
			if(LotCtrl.checkLotCtrl(conn)){
			    struct.seth_lotCtrl("true");
			    lotctrl = "true";
			}else{
				struct.seth_lotCtrl("false");
				lotctrl = "false";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if (isScreenMove() == true) {
			// 初期化
			struct.clear();
			struct.initialize();
			_keyStruct = new AG0010010Struct();
			struct.setw_PLANT_CD(plantCd);
			struct.setw_ITEM_CD(itemCd);

			if(templot.equals("0")){
			   controlselect();
			}else if(templot.equals("1")){
				struct.setw_WH_CD(w_WH_CD);
				struct.setWH_NAME(WH_NAME);
				controlselect();
				controlinventoryDetailsub1();
				struct.seth_screenflg("1");				
			}

		} else {
			// 工場コードと工場名をデフォルト表示
			struct.setw_PLANT_CD(getsysPLANT_CD());
		}
		//------------------------------------------------------------------
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AG0010010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * イベントハンドラの前処理です。
	 *
	 * @param buttun ボタン名
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AG0010");
		logger.entering("AG0010010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
		logger.exiting("AG0010010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("inventoryDetail") ) {
				controlinventoryDetail();
			} else if( button.equals("clear") ) {
				controlclear();
			} else if( button.equals("CloseSub1") ) {
				controlCloseSub1();
			} else if( button.equals("inventoryDetailsub1") ) {
				controlinventoryDetailsub1();
			} else if( button.equals("CloseSub2") ) {
				controlCloseSub2();
			} else if( button.equals("initial") ) {
				controlINITIAL();
			} else if( button.equals("reload") ) {
				controlRELOAD();
			}
		//{{user_implement_dev:<control_eventHandller>
		//------------------------------------------------------------------
		struct.setList_MRP_ODR_TYP_val(_MRP_ODR_TYP.getValList());
		struct.setList_MRP_ODR_TYP_name(_MRP_ODR_TYP.getExplanList());
		struct.setList_MRP_FLG_val(_MRP_FLG.getValList());
		struct.setList_MRP_FLG_name(_MRP_FLG.getExplanList());
		struct.seth_lotCtrl(lotctrl);

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
//			throw new FoundationException("AG0010010Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AG0010010-E999","CSVの出力処理"));
			throw new FoundationException("AG0010010Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AG0010010-E999","システム日付の取得処理"));
				throw new FoundationException("AG0010010Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AG0010010-E999","コントロールのイベント処理"));
			throw new FoundationException("AG0010010Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected AG0010010Entity entity;
	protected AG0010010Struct struct;
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

		entity = new AG0010010Entity();
		struct = new AG0010010Struct();

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
	 * AG0010010クラスの標準コンストラクタ
	 */
	public AG0010010Control() throws BusinessProcessException, FoundationException
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
				AG0010010Struct key = (AG0010010Struct)keyList.get(j);
				// メッセージキーを作成する
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("w_ITEM_STOCK_QTY_OUTSIDE_MRP") && key.getw_ITEM_STOCK_QTY_OUTSIDE_MRP() != null) {
					msgKey.setKeyValue("w_ITEM_STOCK_QTY_OUTSIDE_MRP", key.getw_ITEM_STOCK_QTY_OUTSIDE_MRP());
				}
				if(msgKeyType.containsKeyColumn("w_JOB_ODR_STOCK_QTY_OUTSIDE_MRP") && key.getw_JOB_ODR_STOCK_QTY_OUTSIDE_MRP() != null) {
					msgKey.setKeyValue("w_JOB_ODR_STOCK_QTY_OUTSIDE_MRP", key.getw_JOB_ODR_STOCK_QTY_OUTSIDE_MRP());
				}
				if(msgKeyType.containsKeyColumn("w_TOTAL_STOCK_QTY") && key.getw_TOTAL_STOCK_QTY() != null) {
					msgKey.setKeyValue("w_TOTAL_STOCK_QTY", key.getw_TOTAL_STOCK_QTY());
				}
				if(msgKeyType.containsKeyColumn("w_TOTAL_STOCK_QTY_LAST_DAY") && key.getw_TOTAL_STOCK_QTY_LAST_DAY() != null) {
					msgKey.setKeyValue("w_TOTAL_STOCK_QTY_LAST_DAY", key.getw_TOTAL_STOCK_QTY_LAST_DAY());
				}
				if(msgKeyType.containsKeyColumn("w_TOTAL_STOCK_QTY_LAST_MONTH") && key.getw_TOTAL_STOCK_QTY_LAST_MONTH() != null) {
					msgKey.setKeyValue("w_TOTAL_STOCK_QTY_LAST_MONTH", key.getw_TOTAL_STOCK_QTY_LAST_MONTH());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_NAME") && key.getMRP_ODR_NAME() != null) {
					msgKey.setKeyValue("MRP_ODR_NAME", key.getMRP_ODR_NAME());
				}
				if(msgKeyType.containsKeyColumn("MRP_NAME") && key.getMRP_NAME() != null) {
					msgKey.setKeyValue("MRP_NAME", key.getMRP_NAME());
				}
				if(msgKeyType.containsKeyColumn("h_lotCtrl") && key.geth_lotCtrl() != null) {
					msgKey.setKeyValue("h_lotCtrl", key.geth_lotCtrl());
				}
				if(msgKeyType.containsKeyColumn("h_lotFlg") && key.geth_lotFlg() != null) {
					msgKey.setKeyValue("h_lotFlg", key.geth_lotFlg());
				}
				if(msgKeyType.containsKeyColumn("h_screenflg") && key.geth_screenflg() != null) {
					msgKey.setKeyValue("h_screenflg", key.geth_screenflg());
				}
				if(msgKeyType.containsKeyColumn("w_PLANT_NAME") && key.getw_PLANT_NAME() != null) {
					msgKey.setKeyValue("w_PLANT_NAME", key.getw_PLANT_NAME());
				}
				if(msgKeyType.containsKeyColumn("s_PLANT_CD") && key.gets_PLANT_CD() != null) {
					msgKey.setKeyValue("s_PLANT_CD", key.gets_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP_val") && key.getMRP_ODR_TYP_val() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP_val", key.getMRP_ODR_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP_name") && key.getMRP_ODR_TYP_name() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP_name", key.getMRP_ODR_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("MRP_FLG_val") && key.getMRP_FLG_val() != null) {
					msgKey.setKeyValue("MRP_FLG_val", key.getMRP_FLG_val());
				}
				if(msgKeyType.containsKeyColumn("MRP_FLG_name") && key.getMRP_FLG_name() != null) {
					msgKey.setKeyValue("MRP_FLG_name", key.getMRP_FLG_name());
				}
				if(msgKeyType.containsKeyColumn("w_ITEM_NAME") && key.getw_ITEM_NAME() != null) {
					msgKey.setKeyValue("w_ITEM_NAME", key.getw_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("DRAW_CD") && key.getDRAW_CD() != null) {
					msgKey.setKeyValue("DRAW_CD", key.getDRAW_CD());
				}
				if(msgKeyType.containsKeyColumn("SPEC") && key.getSPEC() != null) {
					msgKey.setKeyValue("SPEC", key.getSPEC());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP") && key.getMRP_ODR_TYP() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP", key.getMRP_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT") && key.getSTOCK_UNIT() != null) {
					msgKey.setKeyValue("STOCK_UNIT", key.getSTOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("LOT_CTRL_FLG") && key.getLOT_CTRL_FLG() != null) {
					msgKey.setKeyValue("LOT_CTRL_FLG", key.getLOT_CTRL_FLG());
				}
				if(msgKeyType.containsKeyColumn("w_ITEM_CD") && key.getw_ITEM_CD() != null) {
					msgKey.setKeyValue("w_ITEM_CD", key.getw_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("w_PLANT_CD") && key.getw_PLANT_CD() != null) {
					msgKey.setKeyValue("w_PLANT_CD", key.getw_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("w_ITEM_STOCK_QTY") && key.getw_ITEM_STOCK_QTY() != null) {
					msgKey.setKeyValue("w_ITEM_STOCK_QTY", key.getw_ITEM_STOCK_QTY());
				}
				if(msgKeyType.containsKeyColumn("w_ITEM_DEFECT_QTY") && key.getw_ITEM_DEFECT_QTY() != null) {
					msgKey.setKeyValue("w_ITEM_DEFECT_QTY", key.getw_ITEM_DEFECT_QTY());
				}
				if(msgKeyType.containsKeyColumn("w_ITEM_STOCK_QTY_LAST_DAY") && key.getw_ITEM_STOCK_QTY_LAST_DAY() != null) {
					msgKey.setKeyValue("w_ITEM_STOCK_QTY_LAST_DAY", key.getw_ITEM_STOCK_QTY_LAST_DAY());
				}
				if(msgKeyType.containsKeyColumn("w_ITEM_STOCK_QTY_LAST_MONTH") && key.getw_ITEM_STOCK_QTY_LAST_MONTH() != null) {
					msgKey.setKeyValue("w_ITEM_STOCK_QTY_LAST_MONTH", key.getw_ITEM_STOCK_QTY_LAST_MONTH());
				}
				if(msgKeyType.containsKeyColumn("w_JOB_ODR_STOCK_QTY") && key.getw_JOB_ODR_STOCK_QTY() != null) {
					msgKey.setKeyValue("w_JOB_ODR_STOCK_QTY", key.getw_JOB_ODR_STOCK_QTY());
				}
				if(msgKeyType.containsKeyColumn("w_JOB_ODR_STOCK_QTY_LAST_DAY") && key.getw_JOB_ODR_STOCK_QTY_LAST_DAY() != null) {
					msgKey.setKeyValue("w_JOB_ODR_STOCK_QTY_LAST_DAY", key.getw_JOB_ODR_STOCK_QTY_LAST_DAY());
				}
				if(msgKeyType.containsKeyColumn("w_JOB_ODR_STOCK_QTY_LAST_MONTH") && key.getw_JOB_ODR_STOCK_QTY_LAST_MONTH() != null) {
					msgKey.setKeyValue("w_JOB_ODR_STOCK_QTY_LAST_MONTH", key.getw_JOB_ODR_STOCK_QTY_LAST_MONTH());
				}
				if(msgKeyType.containsKeyColumn("MRP_FLG") && key.getMRP_FLG() != null) {
					msgKey.setKeyValue("MRP_FLG", key.getMRP_FLG().toString());
				}
				if(msgKeyType.containsKeyColumn("w_ITEM_STOCK_QTY_FOR_MRP") && key.getw_ITEM_STOCK_QTY_FOR_MRP() != null) {
					msgKey.setKeyValue("w_ITEM_STOCK_QTY_FOR_MRP", key.getw_ITEM_STOCK_QTY_FOR_MRP());
				}
				if(msgKeyType.containsKeyColumn("w_JOB_ODR_STOCK_QTY_FOR_MRP") && key.getw_JOB_ODR_STOCK_QTY_FOR_MRP() != null) {
					msgKey.setKeyValue("w_JOB_ODR_STOCK_QTY_FOR_MRP", key.getw_JOB_ODR_STOCK_QTY_FOR_MRP());
				}
				if(msgKeyType.containsKeyColumn("w_WH_CD") && key.getw_WH_CD() != null) {
					msgKey.setKeyValue("w_WH_CD", key.getw_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("w_STOCK_ON_HAND_QTY") && key.getw_STOCK_ON_HAND_QTY() != null) {
					msgKey.setKeyValue("w_STOCK_ON_HAND_QTY", key.getw_STOCK_ON_HAND_QTY());
				}
				if(msgKeyType.containsKeyColumn("w_DEFECT_QTY") && key.getw_DEFECT_QTY() != null) {
					msgKey.setKeyValue("w_DEFECT_QTY", key.getw_DEFECT_QTY());
				}
				if(msgKeyType.containsKeyColumn("w_PRVS_DAYEND_STOCK_QTY") && key.getw_PRVS_DAYEND_STOCK_QTY() != null) {
					msgKey.setKeyValue("w_PRVS_DAYEND_STOCK_QTY", key.getw_PRVS_DAYEND_STOCK_QTY());
				}
				if(msgKeyType.containsKeyColumn("w_PRVS_MONTHEND_STOCK_QTY") && key.getw_PRVS_MONTHEND_STOCK_QTY() != null) {
					msgKey.setKeyValue("w_PRVS_MONTHEND_STOCK_QTY", key.getw_PRVS_MONTHEND_STOCK_QTY());
				}
				if(msgKeyType.containsKeyColumn("PLANT_NAME") && key.getPLANT_NAME() != null) {
					msgKey.setKeyValue("PLANT_NAME", key.getPLANT_NAME());
				}
				if(msgKeyType.containsKeyColumn("WH_NAME") && key.getWH_NAME() != null) {
					msgKey.setKeyValue("WH_NAME", key.getWH_NAME());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_CD") && key.getJOB_ODR_CD() != null) {
					msgKey.setKeyValue("JOB_ODR_CD", key.getJOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("s2_PLANT_CD") && key.gets2_PLANT_CD() != null) {
					msgKey.setKeyValue("s2_PLANT_CD", key.gets2_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("l_PLANT_NAME") && key.getl_PLANT_NAME() != null) {
					msgKey.setKeyValue("l_PLANT_NAME", key.getl_PLANT_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_LOT_NO") && key.getl_LOT_NO() != null) {
					msgKey.setKeyValue("l_LOT_NO", key.getl_LOT_NO());
				}
				if(msgKeyType.containsKeyColumn("l_STOCK_ON_HAND_QTY") && key.getl_STOCK_ON_HAND_QTY() != null) {
					msgKey.setKeyValue("l_STOCK_ON_HAND_QTY", key.getl_STOCK_ON_HAND_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_ALCD_QTY") && key.getl_ALCD_QTY() != null) {
					msgKey.setKeyValue("l_ALCD_QTY", key.getl_ALCD_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_EXPIRATION_DATE") && key.getl_EXPIRATION_DATE() != null) {
					msgKey.setKeyValue("l_EXPIRATION_DATE", key.getl_EXPIRATION_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_PRD_CMPLT_DATE") && key.getl_PRD_CMPLT_DATE() != null) {
					msgKey.setKeyValue("l_PRD_CMPLT_DATE", key.getl_PRD_CMPLT_DATE());
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
					AG0010010Struct key = new AG0010010Struct();
					if(msgKeyType.containsKeyColumn("w_ITEM_STOCK_QTY_OUTSIDE_MRP")) {
						key.setw_ITEM_STOCK_QTY_OUTSIDE_MRP(msgKey.getKeyValue("w_ITEM_STOCK_QTY_OUTSIDE_MRP"));
					}
					if(msgKeyType.containsKeyColumn("w_JOB_ODR_STOCK_QTY_OUTSIDE_MRP")) {
						key.setw_JOB_ODR_STOCK_QTY_OUTSIDE_MRP(msgKey.getKeyValue("w_JOB_ODR_STOCK_QTY_OUTSIDE_MRP"));
					}
					if(msgKeyType.containsKeyColumn("w_TOTAL_STOCK_QTY")) {
						key.setw_TOTAL_STOCK_QTY(msgKey.getKeyValue("w_TOTAL_STOCK_QTY"));
					}
					if(msgKeyType.containsKeyColumn("w_TOTAL_STOCK_QTY_LAST_DAY")) {
						key.setw_TOTAL_STOCK_QTY_LAST_DAY(msgKey.getKeyValue("w_TOTAL_STOCK_QTY_LAST_DAY"));
					}
					if(msgKeyType.containsKeyColumn("w_TOTAL_STOCK_QTY_LAST_MONTH")) {
						key.setw_TOTAL_STOCK_QTY_LAST_MONTH(msgKey.getKeyValue("w_TOTAL_STOCK_QTY_LAST_MONTH"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_NAME")) {
						key.setMRP_ODR_NAME(msgKey.getKeyValue("MRP_ODR_NAME"));
					}
					if(msgKeyType.containsKeyColumn("MRP_NAME")) {
						key.setMRP_NAME(msgKey.getKeyValue("MRP_NAME"));
					}
					if(msgKeyType.containsKeyColumn("h_lotCtrl")) {
						key.seth_lotCtrl(msgKey.getKeyValue("h_lotCtrl"));
					}
					if(msgKeyType.containsKeyColumn("h_lotFlg")) {
						key.seth_lotFlg(msgKey.getKeyValue("h_lotFlg"));
					}
					if(msgKeyType.containsKeyColumn("h_screenflg")) {
						key.seth_screenflg(msgKey.getKeyValue("h_screenflg"));
					}
					if(msgKeyType.containsKeyColumn("w_PLANT_NAME")) {
						key.setw_PLANT_NAME(msgKey.getKeyValue("w_PLANT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("s_PLANT_CD")) {
						key.sets_PLANT_CD(msgKey.getKeyValue("s_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP_val")) {
						key.setMRP_ODR_TYP_val(msgKey.getKeyValue("MRP_ODR_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP_name")) {
						key.setMRP_ODR_TYP_name(msgKey.getKeyValue("MRP_ODR_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("MRP_FLG_val")) {
						key.setMRP_FLG_val(msgKey.getKeyValue("MRP_FLG_val"));
					}
					if(msgKeyType.containsKeyColumn("MRP_FLG_name")) {
						key.setMRP_FLG_name(msgKey.getKeyValue("MRP_FLG_name"));
					}
					if(msgKeyType.containsKeyColumn("w_ITEM_NAME")) {
						key.setw_ITEM_NAME(msgKey.getKeyValue("w_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("DRAW_CD")) {
						key.setDRAW_CD(msgKey.getKeyValue("DRAW_CD"));
					}
					if(msgKeyType.containsKeyColumn("SPEC")) {
						key.setSPEC(msgKey.getKeyValue("SPEC"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP")) {
						key.setMRP_ODR_TYP(msgKey.getKeyValue("MRP_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT")) {
						key.setSTOCK_UNIT(msgKey.getKeyValue("STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("LOT_CTRL_FLG")) {
						key.setLOT_CTRL_FLG(msgKey.getKeyValue("LOT_CTRL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("w_ITEM_CD")) {
						key.setw_ITEM_CD(msgKey.getKeyValue("w_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_PLANT_CD")) {
						key.setw_PLANT_CD(msgKey.getKeyValue("w_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_ITEM_STOCK_QTY")) {
						key.setw_ITEM_STOCK_QTY(msgKey.getKeyValue("w_ITEM_STOCK_QTY"));
					}
					if(msgKeyType.containsKeyColumn("w_ITEM_DEFECT_QTY")) {
						key.setw_ITEM_DEFECT_QTY(msgKey.getKeyValue("w_ITEM_DEFECT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("w_ITEM_STOCK_QTY_LAST_DAY")) {
						key.setw_ITEM_STOCK_QTY_LAST_DAY(msgKey.getKeyValue("w_ITEM_STOCK_QTY_LAST_DAY"));
					}
					if(msgKeyType.containsKeyColumn("w_ITEM_STOCK_QTY_LAST_MONTH")) {
						key.setw_ITEM_STOCK_QTY_LAST_MONTH(msgKey.getKeyValue("w_ITEM_STOCK_QTY_LAST_MONTH"));
					}
					if(msgKeyType.containsKeyColumn("w_JOB_ODR_STOCK_QTY")) {
						key.setw_JOB_ODR_STOCK_QTY(msgKey.getKeyValue("w_JOB_ODR_STOCK_QTY"));
					}
					if(msgKeyType.containsKeyColumn("w_JOB_ODR_STOCK_QTY_LAST_DAY")) {
						key.setw_JOB_ODR_STOCK_QTY_LAST_DAY(msgKey.getKeyValue("w_JOB_ODR_STOCK_QTY_LAST_DAY"));
					}
					if(msgKeyType.containsKeyColumn("w_JOB_ODR_STOCK_QTY_LAST_MONTH")) {
						key.setw_JOB_ODR_STOCK_QTY_LAST_MONTH(msgKey.getKeyValue("w_JOB_ODR_STOCK_QTY_LAST_MONTH"));
					}
					if(msgKeyType.containsKeyColumn("MRP_FLG")) {
						key.setMRP_FLG(new Integer(msgKey.getKeyValue("MRP_FLG")));
					}
					if(msgKeyType.containsKeyColumn("w_ITEM_STOCK_QTY_FOR_MRP")) {
						key.setw_ITEM_STOCK_QTY_FOR_MRP(msgKey.getKeyValue("w_ITEM_STOCK_QTY_FOR_MRP"));
					}
					if(msgKeyType.containsKeyColumn("w_JOB_ODR_STOCK_QTY_FOR_MRP")) {
						key.setw_JOB_ODR_STOCK_QTY_FOR_MRP(msgKey.getKeyValue("w_JOB_ODR_STOCK_QTY_FOR_MRP"));
					}
					if(msgKeyType.containsKeyColumn("w_WH_CD")) {
						key.setw_WH_CD(msgKey.getKeyValue("w_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_STOCK_ON_HAND_QTY")) {
						key.setw_STOCK_ON_HAND_QTY(msgKey.getKeyValue("w_STOCK_ON_HAND_QTY"));
					}
					if(msgKeyType.containsKeyColumn("w_DEFECT_QTY")) {
						key.setw_DEFECT_QTY(msgKey.getKeyValue("w_DEFECT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("w_PRVS_DAYEND_STOCK_QTY")) {
						key.setw_PRVS_DAYEND_STOCK_QTY(msgKey.getKeyValue("w_PRVS_DAYEND_STOCK_QTY"));
					}
					if(msgKeyType.containsKeyColumn("w_PRVS_MONTHEND_STOCK_QTY")) {
						key.setw_PRVS_MONTHEND_STOCK_QTY(msgKey.getKeyValue("w_PRVS_MONTHEND_STOCK_QTY"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_NAME")) {
						key.setPLANT_NAME(msgKey.getKeyValue("PLANT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("WH_NAME")) {
						key.setWH_NAME(msgKey.getKeyValue("WH_NAME"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_CD")) {
						key.setJOB_ODR_CD(msgKey.getKeyValue("JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("s2_PLANT_CD")) {
						key.sets2_PLANT_CD(msgKey.getKeyValue("s2_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_PLANT_NAME")) {
						key.setl_PLANT_NAME(msgKey.getKeyValue("l_PLANT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_LOT_NO")) {
						key.setl_LOT_NO(msgKey.getKeyValue("l_LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_STOCK_ON_HAND_QTY")) {
						key.setl_STOCK_ON_HAND_QTY(msgKey.getKeyValue("l_STOCK_ON_HAND_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_ALCD_QTY")) {
						key.setl_ALCD_QTY(msgKey.getKeyValue("l_ALCD_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_EXPIRATION_DATE")) {
						key.setl_EXPIRATION_DATE(msgKey.getKeyValue("l_EXPIRATION_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_PRD_CMPLT_DATE")) {
						key.setl_PRD_CMPLT_DATE(msgKey.getKeyValue("l_PRD_CMPLT_DATE"));
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
