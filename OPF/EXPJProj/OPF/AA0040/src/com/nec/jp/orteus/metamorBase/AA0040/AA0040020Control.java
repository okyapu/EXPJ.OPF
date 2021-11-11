/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AA0040/src/com/nec/jp/orteus/metamorBase/AA0040/AA0040020Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AA0040;

import com.nec.jp.orteus.metamorBase.AA0040.*;
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
import com.nec.jp.orteus.expj.mstappr.MstAppr;
import com.nec.jp.orteus.expj.mstappr.MstApprDetailStruct;
import com.nec.jp.orteus.expj.mstappr.MstApprKeyStruct;
import com.nec.jp.orteus.expj.mstappr.MstApprStruct;
import com.nec.jp.orteus.expj.mstappr.MstColumns;
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AA0040020Control
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
	protected List list;										    // 結果リストのインスタンス
	public List getList() { return this.list; }				     // リストを返します。
	public void setList(List listname) { this.list = listname; }    // リストをセットします。
	public int getListsize() {									      // リスト型のサイズを返します。
		int nret = 0;
		if( this.list != null ) {nret = this.list.size();}
		return nret;
	}
	public Object getListvalue(int x) { return this.list.get(x); }  // リストの値（メディエータ）を返します。

	public AA0040020Struct getStruct() { return this.struct; }      // Structの値（メディエータ）を返します。


//--------- コンボボックス関連 ------------------------------------------------------

	/** 単価区分 */
	private ComboStruct _CONS_UNIT_COST = new ComboStruct();

	/** 単価区分設定
	 * @param コンボボックスデータ
	*/
	public void setCONS_UNIT_COST(ComboStruct combo){ _CONS_UNIT_COST = combo; }

	/** 単価区分取得
	 * @return 単価区分のコンボボックスデータ
	*/
	public ComboStruct getCONS_UNIT_COST(){ return _CONS_UNIT_COST; }

	/** 品目手配区分 */
	private ComboStruct _MRP_ODR_TYP = new ComboStruct();

	/** 品目手配区分設定
	 * @param コンボボックスデータ
	*/
	public void setMRP_ODR_TYP(ComboStruct combo){ _MRP_ODR_TYP = combo; }

	/** 品目手配区分取得
	 * @return 品目手配区分のコンボボックスデータ
	*/
	public ComboStruct getMRP_ODR_TYP(){ return _MRP_ODR_TYP; }

	/** 内外作成区分 */
	private ComboStruct _OUTSIDE_TYP = new ComboStruct();

	/** 内外作成区分設定
	 * @param コンボボックスデータ
	*/
	public void setOUTSIDE_TYP(ComboStruct combo){ _OUTSIDE_TYP = combo; }

	/** 内外作成区分取得
	 * @return 内外作成区分のコンボボックスデータ
	*/
	public ComboStruct getOUTSIDE_TYP(){ return _OUTSIDE_TYP; }

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
	private void setTypeValueAboutItem(AA0040020Struct s)
	{
		s.setw_MRP_ODR_NAME(getTypeName(_MRP_ODR_TYP,s.getw_MRP_ODR_TYP()));
		s.setw_OUTSIDE_NAME(getTypeName(_OUTSIDE_TYP,s.getw_OUTSIDE_TYP()));
	}
	/**
	 * 外注単価情報のフラグの表示を設定
	 * @param s フラグの値が設定されている情報
	 */
	private void setTypeValueAboutUnitCost(AA0040020Struct s)
	{
		s.setp_UNIT_COST_NAME(getTypeName(_CONS_UNIT_COST,s.getp_UNIT_COST_TYP()));
	}

//------------------------------------------------------------------------------
	/** 子⇒親に画面遷移した場合のキー情報保持の為のStruct */
	private AA0040020Struct _keyStruct = new AA0040020Struct();

	/** キー情報Structの取得 */
	public AA0040020Struct getKeyStruct(){ return _keyStruct; }

	/** キー情報Structの設定 */
	public void setKeyStruct(AA0040020Struct struct){ _keyStruct.keycopy(struct); }
//------------------------------------------------------------------------------

	/** 単価情報リスト */
	private ArrayList _deployList = new ArrayList(0);

	/** 単価情報リスト取得  
	 * @return 製品構成リスト
	*/
	public ArrayList getDeployList(){ return _deployList; }

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
	// 会社コード保存用
	private String _COMPANY_CD = null;

//-----------------------------------------------------------------------------
	/** 画面共通定義取得クラス */
	ScreenParam _scParam = sp;
//	------------------------------------------------------------------------------
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
//-----------------------------------------------------------------------------
	/**
	 * 遷移類型　
	 * 0:　マスタ情報
	 * 1:　承認情報
	 */
	private String screen_move_typ = null;
	
	/**遷移類型の取得
	 * @return 遷移類型
	 */
	public String getScreen_move_typ() {
		return screen_move_typ;
	}
	/**遷移類型の設定
	 * @param 遷移類型
	 */
	public void setScreen_move_typ(String screen_move_typ) {
		this.screen_move_typ = screen_move_typ;
	}
//-----------------------------------------------------------------------------
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
		
	/**
	 * エラーメッセージ設定
	 * @param メッセージ番号
	 * @param 出力メッセージ
	 */
	private void setErrorMessage(String messageno, String message)
	{
		ExpjMessage emsg = new ExpjMessage( messageno );
		msgStruct.addError( emsg );
		sysLog.severe(emsg, getsysUSER_CD());
		emsg = new ExpjMessage( "ZZ01006", message );
		msgStruct.addError( emsg );
		sysLog.severe(emsg, getsysUSER_CD());
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
		sysLog.severe(emsg, getsysUSER_CD());
		
		for(int i=0; i<message.size(); i++)
		{
			emsg = new ExpjMessage( "ZZ01006", (String)message.get(i) );
			msgStruct.addError( emsg );
			sysLog.severe(emsg, getsysUSER_CD());
		}
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
		sysLog.warning(emsg, getsysUSER_CD());
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
		sysLog.info(emsg, getsysUSER_CD());
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
    /** 画面遷移キー(工場コード) */
    private String _w_PLANT_CD;
    
    /**
     * 画面遷移キー(工場コード)取得
     * @return 工場コード
     */
    public String getw_PLANT_CD() {
     return _w_PLANT_CD;
    }
    /**
     * 画面遷移キー(工場コード)設定
     * @param cd 工場コード
     */
    public void setw_PLANT_CD(String cd) {
     _w_PLANT_CD = cd;
    }
    
    /**テーブル名 */
    private String _table_name = null;
    
  /**
	 * @return Returns the _table_name.
	 */
	public String get_table_name() {
		return _table_name;
	}
	/**
	 * @param _table_name The _table_name to set.
	 */
	public void set_table_name(String _table_name) {
		this._table_name = _table_name;
	}
	/**外注単価承認 */
	private String _APR_SBCNT_UNIT_COST = null;
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
  /**    
   * check 日付形式：yyyy/MM/dd
   * @param sourceDate    
   * @return    
   */     
   public static boolean checkDate(String sourceDate){     
   if(sourceDate==null){     
   return false;     
   }     
   try {     
   SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");     
   dateFormat.setLenient(false);     
   dateFormat.parse(sourceDate);     
   return true;     
   } catch (Exception e) {     
   }     
   return false;     
   }
  //---------- 有効開始日付を設定 -------------------------------------
  /**
   * サブ１有効開始日付を初期化します。
   */
  private void initialDate() throws BusinessProcessException, FoundationException
  {
     try{
  	   //[パラメータ]．"名前"を設定します
  	   struct.setp_NAME("UC_EFF_PHASE_IN_DATE");
  	   Date t;
  	   String para;
  	   //[パラメータ]．"設定値"を取得
  	   List dateInList = entity.mselectSYS_PARAMETER.read(conn, struct);
  	   if (dateInList.isEmpty()){
  		   return;
  	   }
  	   AA0040020Struct dateInStruct = (AA0040020Struct) dateInList.get(0);
  	   if ( dateInStruct.getp_VALUE() != null && !dateInStruct.getp_VALUE().equals("")
  			   && !(dateInStruct.getp_VALUE().toLowerCase()).equals("null")){
  		   if(dateInStruct.getp_VALUE().equals("*"))
  		   {
  			  //システムユーザを取得
  			  struct.setp_USER_CD(struct.getsUser_ID());
  			  List userList = entity.mselectUSER_MST.read(conn,struct);
  			  if (userList.isEmpty()){
  				  ExpjMessage emsg = new ExpjMessage("ZZ09026");
                    msgStruct.addError(emsg);
                    sysLog.warning(emsg, sysUSER_CD);
                    return;
  			  }
  			  AA0040020Struct userStruct = (AA0040020Struct) userList.get(0);
  			  
  			  //業務運用日を取得
  			  List sysDateCtrlList = entity.mselectSYS_DATE_CTRL.read(conn, userStruct);
                if (sysDateCtrlList.isEmpty()){
                    ExpjMessage emsg = new ExpjMessage("KR00017");
                    msgStruct.addError(emsg);
                    sysLog.warning(emsg, sysUSER_CD);
                    return;
                }
                AA0040020Struct sysDateStruct = (AA0040020Struct) sysDateCtrlList.get(0);
                struct.setp_EFF_PHASE_IN_DATE(sysDateStruct.getp_BUSINESS_DATE());
  		   }else{
  			   if (checkDate(dateInStruct.getp_VALUE()) == true){
  	      		   try{
  	      			   //日付形式を判別
  	      			   t = stringToDate(dateInStruct.getp_VALUE());
  	      			   para = dateToString(t);
  	      			   //[パラメータ]．"設定値"!=nullの場合、有効開始日付　= [パラメータ]．"設定値"
  	      			   struct.setp_EFF_PHASE_IN_DATE(para);  
      	      		}catch(ParseException   e){
           			   //"有効開始日のパラメータが不正です。"
           			   ExpjMessage emsg = new ExpjMessage("ZZ13001");
                        msgStruct.addError(emsg);
                        sysLog.warning(emsg, getsysUSER_CD());
                        return;
           		   }
  			   }else{
  				   //"有効開始日のパラメータが不正です。"
      			   ExpjMessage emsg = new ExpjMessage("ZZ13001");
                   msgStruct.addError(emsg);
                   sysLog.warning(emsg, getsysUSER_CD());
  			   }
  		   }
  	   }else{
  		   struct.setp_EFF_PHASE_IN_DATE("");
  	   }
     }catch(FoundationException e){
  	   e.printStackTrace();
     }
     catch(SQLException ee){
        ee.printStackTrace();            	   
     }            	   
  }
//------------------------------------------------------------------------------
  /**
   * パラメータ「外注単価承認」を取得する
 * @throws FoundationException 
 * @throws ExpjException 
   */
  private void initalparameter() throws FoundationException, ExpjException{
  	struct.setp_NAME("APR_SBCNT_UNIT_COST");
  	try {
			List tempList = entity.mselectSYS_PARAMETER.read(conn,struct);
			if(tempList.isEmpty()){
				// パラメータ「外注単価承認」を取得できなかった場合
				String locale = CoreTools.getLocale(struct.getsUser_ID());
 				ResourceBundle messages = CoreTools.getResourceBundle("ExpjMessage", locale);
 				ExpjMessage emsg = new ExpjMessage("AZ00041", messages.getString("AZ00049"));
 				msgStruct.addError(emsg);
 			    sysLog.warning(emsg, sysUSER_CD);
				struct.seth_APR_SBCNT_UNIT_COST("0");
				_APR_SBCNT_UNIT_COST = struct.geth_APR_SBCNT_UNIT_COST();
				return ;
			}
			AA0040020Struct tempStruct = (AA0040020Struct) tempList.get(0);
			if(!"1".equals(tempStruct.getp_VALUE())){
				tempStruct.setp_VALUE("0");
			}
			struct.seth_APR_SBCNT_UNIT_COST(tempStruct.getp_VALUE());
			_APR_SBCNT_UNIT_COST = struct.geth_APR_SBCNT_UNIT_COST();
		} catch (SQLException e) {
			setSqlExceptionMsg(e);
		}
  }

//------------------------------------------------------------------------------
  /**
	 * 画面遷移時、キーの取得
	 *
	 */
	private void getKey(){
		if(keyvalueMap.containsKey("COMPANY_CD")){
			struct.setCOMPANY_CD(keyvalueMap.get("COMPANY_CD").toString());
		}
		if(keyvalueMap.containsKey("VEND_CD")){
			struct.setVEND_CD(keyvalueMap.get("VEND_CD").toString());
		}
		if(keyvalueMap.containsKey("COMPANY_CD")){
			struct.setCOMPANY_CD(keyvalueMap.get("COMPANY_CD").toString());
		}
		if(keyvalueMap.containsKey("ITEM_CD")){
			struct.setITEM_CD(keyvalueMap.get("ITEM_CD").toString());
		}
		if(keyvalueMap.containsKey("PROC_CD")){
			struct.setPROC_CD(keyvalueMap.get("PROC_CD").toString());
		}
		if(keyvalueMap.containsKey("EFF_PHASE_IN_DATE")){
			struct.setEFF_PHASE_IN_DATE(keyvalueMap.get("EFF_PHASE_IN_DATE").toString());
		}
		if(keyvalueMap.containsKey("PLANT_CD")){
			struct.setw_PLANT_CD(keyvalueMap.get("PLANT_CD").toString());
		}
	}
//------------------------------------------------------------------------------
	
	
	/**
  	 * ヘッダ削除承認情報存在チェック
  	 * @param 
	 * @throws ExpjException 
  	 */
	private boolean checkApprDel() throws ExpjException {
		boolean ret = false;
		//マスタ承認部品
  		MstAppr mstappr = new MstAppr(conn,this.getsysPLANT_CD(),this.getsysUSER_CD(),"AA0040020","AA0040020Servlet");
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
  		// 工場コード
  		MstColumns keyvalue3 = new MstColumns();
  		keyvalue3.setColumnname("PLANT_CD");
  		keyvalue3.setColumnvalue(struct.getw_PLANT_CD());
  		keyvalueList.add(keyvalue3);
  		// 品目番号
  		MstColumns keyvalue4 = new MstColumns();
  		keyvalue4.setColumnname("ITEM_CD");
  		keyvalue4.setColumnvalue(struct.getITEM_CD());
  		keyvalueList.add(keyvalue4);
  		// 品目別作業コード
  		MstColumns keyvalue5 = new MstColumns();
  		keyvalue5.setColumnname("PROC_CD");
  		keyvalue5.setColumnvalue(struct.getPROC_CD());
  		keyvalueList.add(keyvalue5);
  		
  		try {
			if(mstappr.checkMST_APPRDel("M_SBCNT_UNIT_COST_H",keyvalueList)){
				setErrorMessage("KA00129");
				ret =  true;
			}
		} catch(SQLException e) {
			setSqlExceptionMsg(e);
		}		
		return ret;
				
	}
		
	
	/**
  	 * ヘッダ承認情報を登録
  	 * @param button
  	 * @throws SQLException
  	 */
  	private void insertAppr_Head(String button) throws SQLException{
  		// マスタ承認部品
  		MstAppr mstappr = new MstAppr(conn,this.getsysPLANT_CD(),this.getsysUSER_CD(),"AA0040020","AA0040020Servlet");
  		String appr_ID = null;                             // 承認IDを保存用の臨時変数 
  		MstApprStruct mstApprStruct = new MstApprStruct(); // 
  		String columnID = null;                            //
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
  		// 工場コード
  		MstColumns keyvalue3 = new MstColumns();
  		keyvalue3.setColumnname("PLANT_CD");
  		keyvalue3.setColumnvalue(struct.getw_PLANT_CD());
  		keyvalueList.add(keyvalue3);
  		// 品目番号
  		MstColumns keyvalue4 = new MstColumns();
  		keyvalue4.setColumnname("ITEM_CD");
  		keyvalue4.setColumnvalue(struct.getITEM_CD());
  		keyvalueList.add(keyvalue4);
  		// 品目別作業コード
  		MstColumns keyvalue5 = new MstColumns();
  		keyvalue5.setColumnname("PROC_CD");
  		keyvalue5.setColumnvalue(struct.getPROC_CD());
  		keyvalueList.add(keyvalue5);
  		
  		if(mstappr.checkMST_APPR("M_SBCNT_UNIT_COST_H",keyvalueList)){
  			setErrorMessage("KA00125");
  			return;
  		}
  		
  		// 	承認依頼表にデータを追加	
  		mstApprStruct.setSCREEN_URL("AA0040020Servlet");          // 画面URL
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
  		keyStruct.setTABLE_NAME("M_SBCNT_UNIT_COST_H");
  		keyStruct.setKEY_NAME("COMPANY_CD");
  		keyStruct.setKEY_VALUE(struct.getCOMPANY_CD());
  		mstappr.insertMST_APPR_KEY(keyStruct);
  		// 取引先コード
  		keyStruct.setTABLE_NAME("M_SBCNT_UNIT_COST_H");
  		keyStruct.setKEY_NAME("VEND_CD");
  		keyStruct.setKEY_VALUE(struct.getVEND_CD());
  		mstappr.insertMST_APPR_KEY(keyStruct);
  		// 工場コード
  		keyStruct.setTABLE_NAME("M_SBCNT_UNIT_COST_H");
  		keyStruct.setKEY_NAME("PLANT_CD");
  		keyStruct.setKEY_VALUE(struct.getw_PLANT_CD());
  		mstappr.insertMST_APPR_KEY(keyStruct);
  		// 品目番号
  		keyStruct.setTABLE_NAME("M_SBCNT_UNIT_COST_H");
  		keyStruct.setKEY_NAME("ITEM_CD");
  		keyStruct.setKEY_VALUE(struct.getITEM_CD());
  		mstappr.insertMST_APPR_KEY(keyStruct);
  		// 品目別作業コード
  		keyStruct.setTABLE_NAME("M_SBCNT_UNIT_COST_H");
  		keyStruct.setKEY_NAME("PROC_CD");
  		keyStruct.setKEY_VALUE(struct.getPROC_CD());
  		mstappr.insertMST_APPR_KEY(keyStruct);
  		
  		// 承認明細表にマスタ情報を追加
  		String nowdate = mstappr.readSystemDateTime();
  		// 外注単価を整理	
  		// 会社コード
  		columnID = mstappr.getColumnID("M_SBCNT_UNIT_COST_H","COMPANY_CD");
  		mstappr.setDetailByColumnID(struct.getCOMPANY_CD(),columnID);
  		// 取引先コード
  		columnID = mstappr.getColumnID("M_SBCNT_UNIT_COST_H","VEND_CD");
  		mstappr.setDetailByColumnID(struct.getVEND_CD(),columnID);
  		// 工場コード
  		columnID = mstappr.getColumnID("M_SBCNT_UNIT_COST_H","PLANT_CD");
  		mstappr.setDetailByColumnID(struct.getw_PLANT_CD(),columnID);
  		// 品目番号
  		columnID = mstappr.getColumnID("M_SBCNT_UNIT_COST_H","ITEM_CD");
  		mstappr.setDetailByColumnID(struct.getITEM_CD(),columnID);
  		// 品目別作業コード
  		columnID = mstappr.getColumnID("M_SBCNT_UNIT_COST_H","PROC_CD");
  		mstappr.setDetailByColumnID(struct.getPROC_CD(),columnID);
  		// 取引先品目番号
  		columnID = mstappr.getColumnID("M_SBCNT_UNIT_COST_H","VEND_ITEM_CD");
  		mstappr.setDetailByColumnID(struct.getVEND_ITEM_CD(),columnID);
  		// 作成日
  		columnID = mstappr.getColumnID("M_SBCNT_UNIT_COST_H","CREATED_DATE");
  		mstappr.setDetailByColumnID(nowdate,columnID);
  		// 作成者
  		columnID = mstappr.getColumnID("M_SBCNT_UNIT_COST_H","CREATED_BY");
  		mstappr.setDetailByColumnID(this.getsysUSER_CD(),columnID);
  		// 作成プログラム名
  		columnID = mstappr.getColumnID("M_SBCNT_UNIT_COST_H","CREATED_PRG_NM");
  		mstappr.setDetailByColumnID("AA0040020",columnID);
  		// 更新日
  		columnID = mstappr.getColumnID("M_SBCNT_UNIT_COST_H","UPDATED_DATE");
  		mstappr.setDetailByColumnID(nowdate,columnID);
  		// 更新者
  		columnID = mstappr.getColumnID("M_SBCNT_UNIT_COST_H","UPDATED_BY");
  		mstappr.setDetailByColumnID(this.getsysUSER_CD(),columnID);
  		// 更新プログラム名
  		columnID = mstappr.getColumnID("M_SBCNT_UNIT_COST_H","UPDATED_PRG_NM");
  		mstappr.setDetailByColumnID("AA0040020",columnID);
  		// 更新数
  		columnID = mstappr.getColumnID("M_SBCNT_UNIT_COST_H","MODIFY_COUNT");
  		mstappr.setDetailByColumnID("0",columnID);
  		
  		// 承認明細にデータを追加する。
  		mstappr.insertMST_APPR_DETAIL("M_SBCNT_UNIT_COST_H",appr_ID);
  		
  	}
  	
  	/**
  	 * 明細部登録承認情報存在チェック
  	 * @param 
	 * @throws ExpjException 
  	 */
	private boolean checkApprAdd() throws ExpjException {
		boolean ret = false;
		//マスタ承認部品
  		MstAppr mstappr = new MstAppr(conn,this.getsysPLANT_CD(),this.getsysUSER_CD(),"AA0040020","AA0040020Servlet");
  		// 	承認依頼存在チェック
  		ArrayList keyvalueList = new ArrayList();
  		//会社コード
  		MstColumns keyvalue1 = new MstColumns();
  		keyvalue1.setColumnname("COMPANY_CD");
  		keyvalue1.setColumnvalue(struct.getCOMPANY_CD());
  		keyvalueList.add(keyvalue1);
  		// 取引先コード
  		MstColumns keyvalue2 = new MstColumns();
  		keyvalue2.setColumnname("VEND_CD");
  		keyvalue2.setColumnvalue(struct.getVEND_CD());
  		keyvalueList.add(keyvalue2);
  		// 工場コード
  		MstColumns keyvalue3 = new MstColumns();
  		keyvalue3.setColumnname("PLANT_CD");
  		keyvalue3.setColumnvalue(struct.getw_PLANT_CD());
  		keyvalueList.add(keyvalue3);
  		// 品目番号
  		MstColumns keyvalue4 = new MstColumns();
  		keyvalue4.setColumnname("ITEM_CD");
  		keyvalue4.setColumnvalue(struct.getITEM_CD());
  		keyvalueList.add(keyvalue4);
  		// 品目別作業コード
  		MstColumns keyvalue5 = new MstColumns();
  		keyvalue5.setColumnname("PROC_CD");
  		keyvalue5.setColumnvalue(struct.getPROC_CD());
  		keyvalueList.add(keyvalue5);
  		
  		try {
			if(mstappr.checkMST_APPRAdd("M_SBCNT_UNIT_COST",keyvalueList)){
				setErrorMessage("KA00130");
				ret =  true;
			}
		} catch(SQLException e) {
			setSqlExceptionMsg(e);
		}		
		return ret;
				
	}
	
	/**
  	 * 明細部承認情報存在チェック
  	 * @param 
	 * @throws ExpjException 
  	 */
	private boolean checkAppr() throws ExpjException {
		boolean ret = false;
		//マスタ承認部品
  		MstAppr mstappr = new MstAppr(conn,this.getsysPLANT_CD(),this.getsysUSER_CD(),"AA0040020","AA0040020Servlet");
  		// 	承認依頼存在チェック
  		ArrayList keyvalueList = new ArrayList();
  		//会社コード
  		MstColumns keyvalue1 = new MstColumns();
  		keyvalue1.setColumnname("COMPANY_CD");
  		keyvalue1.setColumnvalue(struct.getCOMPANY_CD());
  		keyvalueList.add(keyvalue1);
  		// 取引先コード
  		MstColumns keyvalue2 = new MstColumns();
  		keyvalue2.setColumnname("VEND_CD");
  		keyvalue2.setColumnvalue(struct.getVEND_CD());
  		keyvalueList.add(keyvalue2);
  		// 工場コード
  		MstColumns keyvalue3 = new MstColumns();
  		keyvalue3.setColumnname("PLANT_CD");
  		keyvalue3.setColumnvalue(struct.getw_PLANT_CD());
  		keyvalueList.add(keyvalue3);
  		// 品目番号
  		MstColumns keyvalue4 = new MstColumns();
  		keyvalue4.setColumnname("ITEM_CD");
  		keyvalue4.setColumnvalue(struct.getITEM_CD());
  		keyvalueList.add(keyvalue4);
  		// 品目別作業コード
  		MstColumns keyvalue5 = new MstColumns();
  		keyvalue5.setColumnname("PROC_CD");
  		keyvalue5.setColumnvalue(struct.getPROC_CD());
  		keyvalueList.add(keyvalue5);
  		// 外注単価有効開始日
  		MstColumns keyvalue6 = new MstColumns();
  		keyvalue6.setColumnname("EFF_PHASE_IN_DATE");
  		keyvalue6.setColumnvalue(struct.getp_EFF_PHASE_IN_DATE());
  		keyvalueList.add(keyvalue6);
  		// サイズ
  		MstColumns keyvalue7 = new MstColumns();
  		keyvalue7.setColumnname("SBCNT_SIZE");
  		keyvalue7.setColumnvalue("0");
  		keyvalueList.add(keyvalue7);
  		
  		try {
  	  		if(mstappr.checkMST_APPR("M_SBCNT_UNIT_COST",keyvalueList)){
  	  			setErrorMessage("KA00125");	  		
				ret =  true;
			}
		} catch(SQLException e) {
			setSqlExceptionMsg(e);
		}		
		return ret;
				
	}
  	
	/**
  	 * マスタ承認情報を登録
  	 * @param button
  	 * @throws SQLException
	 * @throws ExpjException 
  	 */
  	private void insertAppr(String button) throws SQLException, ExpjException{
  		// マスタ承認部品
  		MstAppr mstappr = new MstAppr(conn,this.getsysPLANT_CD(),this.getsysUSER_CD(),"AA0040020","AA0040020Servlet");
  		String appr_ID = null;                             // 承認IDを保存用の臨時変数 
  		MstApprStruct mstApprStruct = new MstApprStruct(); // 
  		String columnID = null;                            //
  		MstApprKeyStruct keyStruct = new MstApprKeyStruct();
  		
  		if (checkAppr()) {
  			return;
  		}
  		
  		// 	承認依頼表にデータを追加	
  		mstApprStruct.setSCREEN_URL("AA0040020Servlet");          // 画面URL
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
  		mstApprStruct.setAPPR_REMARKS(struct.getp_APPR_REMARKS());   // 承認備考
  		mstApprStruct.setSTATUS("1");                              // 状態区分
  		mstApprStruct.setREQUEST_BY(struct.getsUser_ID());         // 依頼者
  		appr_ID = mstappr.insertMST_APPR(mstApprStruct);
  		
  		// 承認キー対応表登録
  		keyStruct.setAPPR_ID(appr_ID);
  		// 会社コード
  		keyStruct.setTABLE_NAME("M_SBCNT_UNIT_COST");
  		keyStruct.setKEY_NAME("COMPANY_CD");
  		keyStruct.setKEY_VALUE(struct.getCOMPANY_CD());
  		mstappr.insertMST_APPR_KEY(keyStruct);
  		// 取引先コード
  		keyStruct.setTABLE_NAME("M_SBCNT_UNIT_COST");
  		keyStruct.setKEY_NAME("VEND_CD");
  		keyStruct.setKEY_VALUE(struct.getVEND_CD());
  		mstappr.insertMST_APPR_KEY(keyStruct);
  		// 工場コード
  		keyStruct.setTABLE_NAME("M_SBCNT_UNIT_COST");
  		keyStruct.setKEY_NAME("PLANT_CD");
  		keyStruct.setKEY_VALUE(struct.getw_PLANT_CD());
  		mstappr.insertMST_APPR_KEY(keyStruct);
  		// 品目番号
  		keyStruct.setTABLE_NAME("M_SBCNT_UNIT_COST");
  		keyStruct.setKEY_NAME("ITEM_CD");
  		keyStruct.setKEY_VALUE(struct.getITEM_CD());
  		mstappr.insertMST_APPR_KEY(keyStruct);
  		// 品目別作業コード
  		keyStruct.setTABLE_NAME("M_SBCNT_UNIT_COST");
  		keyStruct.setKEY_NAME("PROC_CD");
  		keyStruct.setKEY_VALUE(struct.getPROC_CD());
  		mstappr.insertMST_APPR_KEY(keyStruct);
  		// 外注単価有効開始日
  		keyStruct.setTABLE_NAME("M_SBCNT_UNIT_COST");
  		keyStruct.setKEY_NAME("EFF_PHASE_IN_DATE");
  		keyStruct.setKEY_VALUE(struct.getp_EFF_PHASE_IN_DATE());
  		mstappr.insertMST_APPR_KEY(keyStruct);
  		// サイズ
  		keyStruct.setTABLE_NAME("M_SBCNT_UNIT_COST");
  		keyStruct.setKEY_NAME("SBCNT_SIZE");
  		keyStruct.setKEY_VALUE("0");
  		mstappr.insertMST_APPR_KEY(keyStruct);
  		
  		// 承認明細表にマスタ情報を追加
  		String nowdate = mstappr.readSystemDateTime();
  		// 外注単価を整理	
  		// 会社コード
  		columnID = mstappr.getColumnID("M_SBCNT_UNIT_COST","COMPANY_CD");
  		mstappr.setDetailByColumnID(struct.getCOMPANY_CD(),columnID);
  		// 取引先コード
  		columnID = mstappr.getColumnID("M_SBCNT_UNIT_COST","VEND_CD");
  		mstappr.setDetailByColumnID(struct.getVEND_CD(),columnID);
  		// 工場コード
  		columnID = mstappr.getColumnID("M_SBCNT_UNIT_COST","PLANT_CD");
  		mstappr.setDetailByColumnID(struct.getw_PLANT_CD(),columnID);
  		// 品目番号
  		columnID = mstappr.getColumnID("M_SBCNT_UNIT_COST","ITEM_CD");
  		mstappr.setDetailByColumnID(struct.getITEM_CD(),columnID);
  		// 品目別作業コード
  		columnID = mstappr.getColumnID("M_SBCNT_UNIT_COST","PROC_CD");
  		mstappr.setDetailByColumnID(struct.getPROC_CD(),columnID);
  		// 外注単価有効開始日
  		columnID = mstappr.getColumnID("M_SBCNT_UNIT_COST","EFF_PHASE_IN_DATE");
  		mstappr.setDetailByColumnID(struct.getp_EFF_PHASE_IN_DATE(),columnID);
  		// サイズ
  		columnID = mstappr.getColumnID("M_SBCNT_UNIT_COST","SBCNT_SIZE");
  		mstappr.setDetailByColumnID("0",columnID);
  		// 単価
  		columnID = mstappr.getColumnID("M_SBCNT_UNIT_COST","UNIT_COST");
  		mstappr.setDetailByColumnID(struct.getp_UNIT_COST(),columnID);
  		// 単価区分
  		columnID = mstappr.getColumnID("M_SBCNT_UNIT_COST","UNIT_COST_TYP");
  		mstappr.setDetailByColumnID(struct.getp_UNIT_COST_TYP().toString(),columnID);
  		// 外注加工費
  		columnID = mstappr.getColumnID("M_SBCNT_UNIT_COST","PROCESSING_COST");
  		mstappr.setDetailByColumnID(struct.getp_PROCESSING_COST().toString(),columnID);
  		// 外注材料費
  		columnID = mstappr.getColumnID("M_SBCNT_UNIT_COST","MATERIAL_COST");
  		mstappr.setDetailByColumnID(struct.getp_MATERIAL_COST().toString(),columnID);
  		// 外注その他経費
  		columnID = mstappr.getColumnID("M_SBCNT_UNIT_COST","OTHER_OVERHEADS");
  		mstappr.setDetailByColumnID(struct.getp_OTHER_OVERHEADS().toString(),columnID);
  		// 作成日
  		columnID = mstappr.getColumnID("M_SBCNT_UNIT_COST","CREATED_DATE");
  		mstappr.setDetailByColumnID(nowdate,columnID);
  		// 作成者
  		columnID = mstappr.getColumnID("M_SBCNT_UNIT_COST","CREATED_BY");
  		mstappr.setDetailByColumnID("AA0040020",columnID);
  		// 作成プログラム名
  		columnID = mstappr.getColumnID("M_SBCNT_UNIT_COST","CREATED_PRG_NM");
  		mstappr.setDetailByColumnID(this.getScreenId(),columnID);
  		// 更新日
  		columnID = mstappr.getColumnID("M_SBCNT_UNIT_COST","UPDATED_DATE");
  		mstappr.setDetailByColumnID(nowdate,columnID);
  		// 更新者
  		columnID = mstappr.getColumnID("M_SBCNT_UNIT_COST","UPDATED_BY");
  		mstappr.setDetailByColumnID(this.getsysUSER_CD(),columnID);
  		// 更新プログラム名
  		columnID = mstappr.getColumnID("M_SBCNT_UNIT_COST","UPDATED_PRG_NM");
  		mstappr.setDetailByColumnID("AA0040020",columnID);
  		// 更新数
  		columnID = mstappr.getColumnID("M_SBCNT_UNIT_COST","MODIFY_COUNT");
  		mstappr.setDetailByColumnID("0",columnID);
  		
  		// 承認明細にデータを追加する。
  		mstappr.insertMST_APPR_DETAIL("M_SBCNT_UNIT_COST",appr_ID);
  		
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
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0040");
		logger.entering("AA0040020Control"+":USER="+struct.getsUser_ID(),"controlselect");
			//{{user_implement_dev:<controlselect>
		//------------------------------------------------------------------
		String Message = "";
		MstAppr mstappr = new MstAppr(this.conn,this.getsysPLANT_CD(),this.getsysUSER_CD(),"AA0040020","AA0040020Servlet");
		try {
			
			//キー項目を保持
			_keyStruct.keycopy(struct);
			//画面値を初期化
			struct.initialize();
			//一覧リストクリア
			_deployList.clear();
			//保持していた値を再セット(キー値以外を初期化する)
			struct.keycopy(_keyStruct);
			

			// 外注単価ヘッダ存在チェック
			List listSbH = null;
			//	明細
			List listSb = null;
			// 遷移する時
			if("1".equals(struct.geth_APR_SBCNT_UNIT_COST()) && this.isScreenMove() && !"".equals(struct.geth_SCREENMOVE_TYP())){
				
				boolean result;

				// 品目番号存在チェック
				result = entity.mcheckM_ITEM.check(conn, struct);
				if(result == true){
					List listItem = entity.mselectM_ITEM.read(conn, struct);
					struct.copy((AA0040020Struct)listItem.get(0));
					
					// 品目のフラグ表示文字列設定
					setTypeValueAboutItem(struct);
				}

				//作業系列存在チェック
				result = entity.mcheckM_PROC_GRP.check(conn, struct);
				if(result == true){
					//作業名取得
					List listProc = entity.mselectM_PROC_GRP.read(conn, struct);
					struct.setPROC_NAME(((AA0040020Struct)listProc.get(0)).getPROC_NAME());
				}
				// 取引先番号存在チェック
				result = entity.mcheckM_VEND_CTRL.check(conn, struct);
				if(result == true){
					List listVend = entity.mselectM_VEND_CTRL.read(conn, struct);
					AA0040020Struct vendInfo = (AA0040020Struct)listVend.get(0);
					struct.setVEND_ANAME(vendInfo.getVEND_ANAME());
					struct.setCUR_CD(vendInfo.getCUR_CD());
					struct.setCUR_NAME(vendInfo.getCUR_NAME());
					struct.setROUND_TYP(vendInfo.getROUND_TYP());
					struct.setDECIMAL_FIG(vendInfo.getDECIMAL_FIG());
				}
				// 外注単価ヘッダ情報を選択の場合
				if("M_SBCNT_UNIT_COST_H".equals(this.get_table_name())){
					// 承認画面の「変更後」ボタンから遷移する時
					if("1".equals(struct.geth_SCREENMOVE_TYP())){
						listSbH = mstappr.selectMST_APPR_DETAIL(struct.geth_APPR_ID());
						MstApprDetailStruct tempStruct = (MstApprDetailStruct) listSbH.get(0);
						String columnID = null;

						// 取引先品目番号
						columnID = mstappr.getColumnID( "M_SBCNT_UNIT_COST_H", "VEND_ITEM_CD");
						struct.setVEND_ITEM_CD(mstappr.getDetailByColumnID(tempStruct,columnID));
					}else{ 
						// 承認画面の「変更前」ボタンから遷移する時、
						listSbH = entity.mselectM_SBCNT_UNIT_COST_H.read(conn, struct);
						struct.setVEND_ITEM_CD(((AA0040020Struct)listSbH.get(0)).getVEND_ITEM_CD());
					}
					if(listSbH.size() > 0){

						// 一覧リスト取得
						listSb = entity.mselectM_SBCNT_UNIT_COST.read(conn, struct);
						if(listSb.size() > 0){
							//一覧リスト取得
							_deployList =(ArrayList)listSb;
							// フラグの表示文字列設定
							for(int n = 0; n < _deployList.size(); n++){
								setTypeValueAboutUnitCost((AA0040020Struct)(_deployList.get(n)));
							}

							setReadStatus(NORMAL);
						} else {
							setReadStatus(NOT_FOUND);
						}
					} else {
						setReadStatus(NOT_FOUND);
					}
				//外注単価明細を選択の場合
				}else{
					//	 承認画面の「変更後」ボタンから遷移する時
					if("1".equals(struct.geth_SCREENMOVE_TYP())){
						listSb = mstappr.selectMST_APPR_DETAIL(struct.geth_APPR_ID());
						MstApprDetailStruct tempStruct = (MstApprDetailStruct) listSb.get(0);
						String columnID = null;
						 //外注単価有効開始日付
					    columnID = mstappr.getColumnID( "M_SBCNT_UNIT_COST", "EFF_PHASE_IN_DATE");
						struct.setp_EFF_PHASE_IN_DATE(mstappr.getDetailByColumnID(tempStruct,columnID));
						
						// 外注単価
						columnID = mstappr.getColumnID( "M_SBCNT_UNIT_COST", "UNIT_COST");
						struct.setp_UNIT_COST(mstappr.getDetailByColumnID(tempStruct,columnID));

						// 単価区分
						columnID = mstappr.getColumnID( "M_SBCNT_UNIT_COST", "UNIT_COST_TYP");
						struct.setp_UNIT_COST_TYP(mstappr.getDetailByColumnID(tempStruct,columnID));

						// 外注加工費
						columnID = mstappr.getColumnID( "M_SBCNT_UNIT_COST", "PROCESSING_COST");
						struct.setp_PROCESSING_COST(mstappr.getDetailByColumnID(tempStruct,columnID));

						// 外注材料費
						columnID = mstappr.getColumnID( "M_SBCNT_UNIT_COST", "MATERIAL_COST");
						struct.setp_MATERIAL_COST(mstappr.getDetailByColumnID(tempStruct,columnID));

						// 外注その他経費
						columnID = mstappr.getColumnID( "M_SBCNT_UNIT_COST", "OTHER_OVERHEADS");
						struct.setp_OTHER_OVERHEADS(mstappr.getDetailByColumnID(tempStruct,columnID));

					}else{ 
						// 承認画面の「変更前」ボタンから遷移する時、	
						listSb = entity.mselectM_SBCNT_UNIT_COST_detail.read(conn, struct);
						AA0040020Struct tempStruct = (AA0040020Struct)listSb.get(0);
						struct.setp_EFF_PHASE_IN_DATE(tempStruct.getp_EFF_PHASE_IN_DATE());
						struct.setp_UNIT_COST(tempStruct.getp_UNIT_COST());
						struct.setp_UNIT_COST_TYP(tempStruct.getp_UNIT_COST_TYP());
						struct.setp_PROCESSING_COST(tempStruct.getp_PROCESSING_COST());
						struct.setp_MATERIAL_COST(tempStruct.getp_MATERIAL_COST());
						struct.setp_OTHER_OVERHEADS(tempStruct.getp_OTHER_OVERHEADS());
					}
				}
			// 正常の読込時、
			}else{ 
				// 会社コード取得
				List listCompany = entity.mselectSYS_MY_COMPANY.read(conn, struct);
				
				if( listCompany.size() > 0 ){
					_COMPANY_CD = new String(((AA0040020Struct)listCompany.get(0)).getCOMPANY_CD());
					struct.setCOMPANY_CD(_COMPANY_CD);
				}else{
					// 読込処理失敗：検索条件に一致するデータは存在しませんでした。[会社コード]
					setReadStatus(INITIAL);

					Message = "SYS_MY_COMPANY.COMPANY_CD:" + struct.getCOMPANY_CD();
					
					setErrorMessage("ZZ06001", Message);
				}

				boolean result;

				// 品目番号存在チェック
				result = entity.mcheckM_ITEM.check(conn, struct);
				if(result == true){
					List listItem = entity.mselectM_ITEM.read(conn, struct);
					struct.copy((AA0040020Struct)listItem.get(0));
					
					// 品目のフラグ表示文字列設定
					setTypeValueAboutItem(struct);
				}else{
					// 読込処理失敗：品目番号が品目に存在しません
					setReadStatus(INITIAL);

					Message = "M_ITEM.ITEM_CD:" + struct.getITEM_CD();
					
					setErrorMessage("AA01002", Message);
				}

				//作業系列存在チェック
				result = entity.mcheckM_PROC_GRP.check(conn, struct);
				if(result == true){
					//作業名取得
					List listProc = entity.mselectM_PROC_GRP.read(conn, struct);
					struct.setPROC_NAME(((AA0040020Struct)listProc.get(0)).getPROC_NAME());
				}else{
					// 読込処理失敗：作業コードが取引先に存在しません。
					setReadStatus(INITIAL);

					Message = "M_PROC_GRP.PROC_CD:" + struct.getPROC_CD();
					
					setErrorMessage("AA01006", Message);
				}

				// 取引先番号存在チェック
				result = entity.mcheckM_VEND_CTRL.check(conn, struct);
				if(result == true){
					List listVend = entity.mselectM_VEND_CTRL.read(conn, struct);
					AA0040020Struct vendInfo = (AA0040020Struct)listVend.get(0);
					struct.setVEND_ANAME(vendInfo.getVEND_ANAME());
					struct.setCUR_CD(vendInfo.getCUR_CD());
					struct.setCUR_NAME(vendInfo.getCUR_NAME());
					struct.setROUND_TYP(vendInfo.getROUND_TYP());
					struct.setDECIMAL_FIG(vendInfo.getDECIMAL_FIG());
				}
				else{
					// 読込処理失敗：取引先コードが取引先に存在しません。
					setReadStatus(INITIAL);

					Message = "M_VEND_CTRL.VEND_CD:" + struct.getVEND_CD();
					setErrorMessage("AA01004", Message);
				}

				//エラーがなければ
				if(msgStruct.sizeError() <= 0) {
					// 外注単価ヘッダ存在チェック
					listSbH = entity.mselectM_SBCNT_UNIT_COST_H.read(conn, struct);
					if(listSbH.size() > 0){
	
						// 一覧リスト取得
						//取引先品目番号
						struct.setVEND_ITEM_CD(((AA0040020Struct)listSbH.get(0)).getVEND_ITEM_CD());
						struct.seth_VEND_ITEM_CD_1(((AA0040020Struct)listSbH.get(0)).getVEND_ITEM_CD());
	
						//更新カウント取得
						struct.setw_MODIFY_COUNT_H(((AA0040020Struct)listSbH.get(0)).getw_MODIFY_COUNT_H());
						
						listSb = entity.mselectM_SBCNT_UNIT_COST.read(conn, struct);
						if(listSb.size() > 0){
							//一覧リスト取得
							_deployList =(ArrayList)listSb;
							// フラグの表示文字列設定
							for(int n = 0; n < _deployList.size(); n++){
								setTypeValueAboutUnitCost((AA0040020Struct)(_deployList.get(n)));
							}
	
							setReadStatus(NORMAL);
						} else {
							setReadStatus(NOT_FOUND);
						}
					} else {
						setReadStatus(NOT_FOUND);
					}
				}
			}

			//検索結果を保持（一覧以外）
			_keyStruct.copy(struct);

			// 表示用に設定
			list = _deployList;

		}catch(SQLException e){
			setReadStatus(ERROR);
			setSqlExceptionMsg(e);
		}

		//------------------------------------------------------------------
                //}}user_implement_dev:<controlselect>
		logger.exiting("AA0040020Control"+":USER="+struct.getsUser_ID(),"controlselect");

		return;
	}

	/**
	 * 行追加ボタン押下時に実行される処理です。
	 *
	 */
	public void controlappend() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0040");
		logger.entering("AA0040020Control"+":USER="+struct.getsUser_ID(),"controlappend");
			//{{user_implement_dev:<controlappend>
		//------------------------------------------------------------------
		// ヘッダー部の削除依頼処理チェック
		if(checkApprDel()) {
			return;
		}
		struct.copy(_keyStruct);
		//struct.setp_EFF_PHASE_IN_DATE("");
		//サブ１有効開始日付を初期化します。
		initialDate();
		struct.setp_UNIT_COST("0");
		struct.setp_PROCESSING_COST("0");
		struct.setp_MATERIAL_COST("0");
		struct.setp_OTHER_OVERHEADS("0");
		struct.setp_UNIT_COST_TYP("");
		//------------------------------------------------------------------
                //}}user_implement_dev:<controlappend>
		logger.exiting("AA0040020Control"+":USER="+struct.getsUser_ID(),"controlappend");

		return;
	}

	/**
	 * 行修正ボタン押下時に実行される処理です。
	 *
	 */
	public void controlmodify() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0040");
		logger.entering("AA0040020Control"+":USER="+struct.getsUser_ID(),"controlmodify");
			//{{user_implement_dev:<controlmodify>
		//------------------------------------------------------------------
		//------------------------------------------------------------------
//		try {
//			if("1".equals(struct.getM_SBCNT_UNIT_COST_APPR())){
//				List tempList = entity.mselectM_SBCNT_UNIT_COST_APPR.read(conn,struct);
//				AA0040020Struct tempStruct = new AA0040020Struct();
//				if(tempList != null && tempList.size()>0){
//					tempStruct = (AA0040020Struct) tempList.get(0);
//					struct.setl_APPR_REMARKS(tempStruct.getl_APPR_REMARKS());
//					struct.setl_STATUS_NAME(getTypeName(_STATUS,tempStruct.getl_STATUS()));
//					struct.setl_APPR_BY(tempStruct.getl_APPR_BY());
//					struct.setl_APPR_BY_NAME(tempStruct.getl_APPR_BY_NAME());
//				}
//			}
//		} catch (FoundationException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}		
		//　依頼存在チェック
		if(checkAppr()){
			return;
		}
		_keyStruct.keycopy(struct);
                //}}user_implement_dev:<controlmodify>
		logger.exiting("AA0040020Control"+":USER="+struct.getsUser_ID(),"controlmodify");

		return;
	}

	/**
	 * 行複写ボタン押下時に実行される処理です。
	 *
	 */
	public void controlcopy() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0040");
		logger.entering("AA0040020Control"+":USER="+struct.getsUser_ID(),"controlcopy");
			//{{user_implement_dev:<controlcopy>
		//------------------------------------------------------------------
		//struct.setp_EFF_PHASE_IN_DATE("");
		//サブ１有効開始日付を初期化します。
		//　ヘッダー部の削除依頼処理チェック
		if (checkApprDel()) {
			return;
		}
		initialDate();
		//------------------------------------------------------------------
                //}}user_implement_dev:<controlcopy>
		logger.exiting("AA0040020Control"+":USER="+struct.getsUser_ID(),"controlcopy");

		return;
	}

	/**
	 * 行削除ボタン押下時に実行される処理です。
	 *
	 */
	public void controlerase() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0040");
		logger.entering("AA0040020Control"+":USER="+struct.getsUser_ID(),"controlerase");
			//{{user_implement_dev:<controlerase>
		//------------------------------------------------------------------
			List listMessage = new ArrayList();
			boolean transFlg = false;

			try {
				// トランザクション開始
				conn.beginTransWeb();
				transFlg = true;

				 // 一覧リストの更新カウントを取得
	            String modifydeployList = new String(struct.getw_MODIFY_COUNT());
				// レコードロック
	            List modifyList = null;
         
				// レコードロック
				modifyList = entity.mselectM_SBCNT_UNIT_COST_modify.read(conn,struct);
				if (modifyList.size() > 0) {
					// 現在の更新カウント取得
					String modifySelect = new String(((AA0040020Struct) modifyList.get(0)).getw_MODIFY_COUNT());
					// 更新カウントのチェック
					if (modifydeployList.equals(modifySelect) == false) {
						// 行削除処理失敗：既にレコードが更新されています
						listMessage.add("M_SBCNT_UNIT_COST.ITEM_CD:" + struct.getITEM_CD());
						listMessage.add("M_SBCNT_UNIT_COST.VEND_CD:" + struct.getVEND_CD());
						listMessage.add("M_SBCNT_UNIT_COST.PROC_CD:" + struct.getPROC_CD());
						setErrorMessage("ZZ01105", listMessage);
						return;
					}
				} else {
					// 行更新処理失敗：検索条件に一致するデータは存在しませんでした。
					listMessage.add("M_SBCNT_UNIT_COST.ITEM_CD:" + struct.getITEM_CD());
					listMessage.add("M_SBCNT_UNIT_COST.VEND_CD:" + struct.getVEND_CD());
					listMessage.add("M_SBCNT_UNIT_COST.PROC_CD:" + struct.getPROC_CD());
					listMessage.add("M_SBCNT_UNIT_COST.getp_EFF_PHASE_IN_DATE:" + struct.getp_EFF_PHASE_IN_DATE());

					setErrorMessage("ZZ06001", listMessage);
					return;
				}

				// エラーが無ければ実行
	            // パラメータ「外注単価承認」が0のとき
				if ("0".equals(struct.geth_APR_SBCNT_UNIT_COST())) {
					entity.mdeleteM_SBCNT_UNIT_COST.delete(conn, struct);
					// 再検索
					controlselect();

					// 一覧データが０件ならヘッダ情報を削除する処理をおこなう
					if(getDeployList().size() <= 0)
					{
						entity.mdeleteM_SBCNT_UNIT_COST_H.delete(conn,struct);
					}
			         // コミット
			         conn.commit();
			         transFlg = false;
			         // 再検索
			         controlselect();
				}
	            // パラメータ「外注単価承認」が1のとき
				if ("1".equals(struct.geth_APR_SBCNT_UNIT_COST())) {
					// 承認情報の登録
					insertAppr("delete");
					if(!msgStruct.hasError()){
						struct.keycopy(_keyStruct);
						// コミット
						conn.commit();
						transFlg = false;
						setInfoMessage("AZ00042");
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

		//------------------------------------------------------------------
                //}}user_implement_dev:<controlerase>
		logger.exiting("AA0040020Control"+":USER="+struct.getsUser_ID(),"controlerase");

		return;
	}

	/**
	 * 更新ボタン押下時に実行される処理です。
	 *
	 */
	public void controlupdate() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0040");
		logger.entering("AA0040020Control"+":USER="+struct.getsUser_ID(),"controlupdate");
			//{{user_implement_dev:<controlupdate>
		//------------------------------------------------------------------
			List listMessage = new ArrayList();
			boolean transFlg = false;

			try {
				// トランザクション開始
				conn.beginTransWeb();
				transFlg = true;

				boolean result = false;	 // チェック結果格納用

				//外注単価ヘッダ更新カウント／ロック
				List modifyList = entity.mselectM_SBCNT_UNIT_COST_H_modify.read(conn,struct);

				if(modifyList.size() > 0 ){
					//更新

					//現在の更新カウント取得
					String modifySelect = new String (((AA0040020Struct)modifyList.get(0)).getw_MODIFY_COUNT_H());

					String modifydeployList = new String(struct.getw_MODIFY_COUNT_H());

					//更新カウントのチェック
					if(modifydeployList.equals(modifySelect) == true){
			            // パラメータ「外注単価承認」が0のとき
						if ("0".equals(struct.geth_APR_SBCNT_UNIT_COST())) {
							entity.mupdateM_SBCNT_UNIT_COST_H.update(conn, struct);
						}else{
							if(!struct.getVEND_ITEM_CD().equals(struct.geth_VEND_ITEM_CD_1())){
								insertAppr_Head("update");
								if(!msgStruct.hasError()){
									setInfoMessage("AZ00042");
								}
							}
						}
					}else{
						// 行更新処理失敗：既にレコードが更新されています
						listMessage.add("M_SBCNT_UNIT_COST_H.ITEM_CD:" + _COMPANY_CD);
						listMessage.add("M_SBCNT_UNIT_COST_H.VEND_CD:" + struct.getVEND_CD());
						listMessage.add("M_SBCNT_UNIT_COST_H.PLANT_CD:" + struct.getw_PLANT_CD());
						listMessage.add("M_SBCNT_UNIT_COST_H.ITEM_CD:" + struct.getITEM_CD());
						listMessage.add("M_SBCNT_UNIT_COST_H.PROC_CD:" + struct.getPROC_CD());

						setErrorMessage("ZZ01105", listMessage);
					}
				}else{
					//作成
		            // パラメータ「外注単価承認」が0の時
					if ("0".equals(struct.geth_APR_SBCNT_UNIT_COST())) {
						entity.minsertM_SBCNT_UNIT_COST_H.create(conn,struct);
			        // パラメータ「外注単価承認」が1の時
					}else{
						insertAppr_Head("insert");
						if(!msgStruct.hasError()){
							setInfoMessage("AZ00042");
						}
					}
				}
				if(!msgStruct.hasError()){
					// コミット
					conn.commit();
					transFlg = false;
					if("0".equals(struct.geth_APR_SBCNT_UNIT_COST())){
						//再検索
						controlselect();
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
		//------------------------------------------------------------------
                //}}user_implement_dev:<controlupdate>
		logger.exiting("AA0040020Control"+":USER="+struct.getsUser_ID(),"controlupdate");

		return;
	}

	/**
	 * 全削除ボタン押下時に実行される処理です。
	 *
	 */
	public void controldelete() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0040");
		logger.entering("AA0040020Control"+":USER="+struct.getsUser_ID(),"controldelete");
			//{{user_implement_dev:<controldelete>
		//------------------------------------------------------------------
			List listMessage = new ArrayList();
			String Message = "";
			boolean transFlg = false;

			try {

				// トランザクション開始
				conn.beginTransWeb();
				transFlg = true;
				//　明細部の登録依頼存在チェック
				if (checkApprAdd()){
					return;
				}
				boolean result = false;	 // チェック結果格納用
				// パラメータ「外注単価承認」が０
				if ("0".equals(struct.geth_APR_SBCNT_UNIT_COST())) {
				//検索後に全削除か判断する
				if( !("NORMAL".equals(getReadStatusString())) ){

					// 会社コード取得
					List listCompany = entity.mselectSYS_MY_COMPANY.read(conn, struct);
					
					if( listCompany.size() > 0 ){
						_COMPANY_CD = new String(((AA0040020Struct)listCompany.get(0)).getCOMPANY_CD());
						struct.setCOMPANY_CD(_COMPANY_CD);
					}else{
						// 読込処理失敗(検索無)：検索条件に一致するデータは存在しませんでした
						Message = "SYS_MY_COMPANY.COMPANY_CD:" + struct.getCOMPANY_CD();
						
						setErrorMessage("ZZ06001", Message);
					}

					// 品目番号存在チェック
					result = entity.mcheckM_ITEM.check(conn, struct);
					if(result == false){
						Message = "M_ITEM.ITEM_CD:" + struct.getITEM_CD();
						
						setErrorMessage("AA01002", Message);
					}

					//作業系列存在チェック
					result = entity.mcheckM_PROC_GRP.check(conn, struct);
					if(result == false){
						// 読込処理失敗：作業コードが取引先に存在しません
						Message = "M_PROC_GRP.PROC_CD:" + struct.getPROC_CD();
						
						setErrorMessage("AA01006", Message);
					}

					// 取引先番号存在チェック
					result = entity.mcheckM_VEND_CTRL.check(conn, struct);
					if(result == false){
						// 読込処理失敗：取引先コードが取引先に存在しません
						Message = "M_VEND_CTRL.VEND_CD:" + struct.getVEND_CD();
						
						setErrorMessage("AA01004", Message);
					}

					//エラーが無ければ
					if(msgStruct.sizeError() <= 0) {

						//外注単価ヘッダロック
						List modifyheadList = entity.mselectM_SBCNT_UNIT_COST_H_modify.read(conn,struct);

						if(modifyheadList.size() <= 0 ){
							// 全削除失敗(検索無)：検索条件に一致するデータは存在しませんでした。[単価ヘッダ]
							listMessage.add("M_SBCNT_UNIT_COST_H.COMPANY_CD:" + _COMPANY_CD);
							listMessage.add("M_SBCNT_UNIT_COST_H.VEND_CD:" + struct.getVEND_CD());
							listMessage.add("M_SBCNT_UNIT_COST_H.PLANT_CD:" + struct.getw_PLANT_CD());
							listMessage.add("M_SBCNT_UNIT_COST_H.ITEM_CD:" + struct.getITEM_CD());
							listMessage.add("M_SBCNT_UNIT_COST_H.PROC_CD:" + struct.getPROC_CD());

							setErrorMessage("AA01006", listMessage);
						}
					}

					//エラーが無ければ
					if(msgStruct.sizeError() <= 0) {

						//外注単価明細ロック
						List modifyList = entity.mselectM_SBCNT_UNIT_COST_lock.read(conn,struct);

						if(modifyList.size() <= 0 ){
							// 全削除失敗(検索無)：検索条件に一致するデータは存在しませんでした。[単価明細]
							listMessage.add("M_SBCNT_UNIT_COST.COMPANY_CD:" + _COMPANY_CD);
							listMessage.add("M_SBCNT_UNIT_COST.VEND_CD:" + struct.getVEND_CD());
							listMessage.add("M_SBCNT_UNIT_COST.PLANT_CD:" + struct.getw_PLANT_CD());
							listMessage.add("M_SBCNT_UNIT_COST.ITEM_CD:" + struct.getITEM_CD());
							listMessage.add("M_SBCNT_UNIT_COST.PROC_CD:" + struct.getPROC_CD());

							setErrorMessage("AA01006", listMessage);
						}
					}

				}else{
					//外注単価ヘッダ更新カウント／ロック
					List modifyheadList = entity.mselectM_SBCNT_UNIT_COST_H_modify.read(conn,struct);

					if(modifyheadList.size() > 0 ){
						// 外注単価ヘッダ:現在の更新カウント取得
						String modifySelect = ((AA0040020Struct)modifyheadList.get(0)).getw_MODIFY_COUNT_H();

						// 外注単価ヘッダ:検索時の更新カウント取得
						String modifydeployList = struct.getw_MODIFY_COUNT_H();

						if(!(modifySelect.equals(modifydeployList))){
							// 全削除失敗：既にレコードが更新されています。[単価ヘッダ]
							listMessage.add("M_SBCNT_UNIT_COST_H.COMPANY_CD:" + _COMPANY_CD);
							listMessage.add("M_SBCNT_UNIT_COST_H.VEND_CD:" + struct.getVEND_CD());
							listMessage.add("M_SBCNT_UNIT_COST_H.PLANT_CD:" + struct.getw_PLANT_CD());
							listMessage.add("M_SBCNT_UNIT_COST_H.ITEM_CD:" + struct.getITEM_CD());
							listMessage.add("M_SBCNT_UNIT_COST_H.PROC_CD:" + struct.getPROC_CD());

							setErrorMessage("ZZ01105", listMessage);
						}
					}else{
						// 全削除失敗：検索条件に一致するデータは存在しませんでした
						listMessage.add("M_SBCNT_UNIT_COST_H.COMPANY_CD:" + _COMPANY_CD);
						listMessage.add("M_SBCNT_UNIT_COST_H.VEND_CD:" + struct.getVEND_CD());
						listMessage.add("M_SBCNT_UNIT_COST_H.PLANT_CD:" + struct.getw_PLANT_CD());
						listMessage.add("M_SBCNT_UNIT_COST_H.ITEM_CD:" + struct.getITEM_CD());
						listMessage.add("M_SBCNT_UNIT_COST_H.PROC_CD:" + struct.getPROC_CD());

						setErrorMessage("ZZ06001", listMessage);
					}
				
					if(msgStruct.sizeError() <= 0) {

						boolean bRet = true;

						//登録済み件数取得
						List recCountList = entity.mselectM_SBCNT_UNIT_COST_record_count.read(conn, struct);
						Integer iRecCount = new Integer((((AA0040020Struct)recCountList.get(0)).getw_MODIFY_COUNT()));

						ArrayList aCheckArraylist = new ArrayList(_deployList);

						//登録済み件数と表示中件数が等しいか？
						if(iRecCount.intValue() == aCheckArraylist.size()){
							for(int cnt = 0; cnt < aCheckArraylist.size(); cnt++){

								// 外注単価:検索時の更新カウント取得
								String sCheckModify = new String(((AA0040020Struct)aCheckArraylist.get(cnt)).getw_MODIFY_COUNT());

								// リストの日付キーセット
								struct.setp_EFF_PHASE_IN_DATE(((AA0040020Struct)aCheckArraylist.get(cnt)).getp_EFF_PHASE_IN_DATE());

								//レコードロック
								List modifyList = entity.mselectM_SBCNT_UNIT_COST_modify.read(conn, struct);

								// 外注単価:現在の更新カウント取得
								String selectModify = new String(((AA0040020Struct)modifyList.get(0)).getw_MODIFY_COUNT());

								if( ! (selectModify.equals(sCheckModify) ) ){
									bRet = false;
									break;
								}
							}
						}else{
							bRet = false;
						}

						if(bRet == false){
							// 全削除失敗：既にレコードが更新されています。[単価明細]
							listMessage.add("M_SBCNT_UNIT_COST.VEND_CD:" + struct.getVEND_CD());
							listMessage.add("M_SBCNT_UNIT_COST.PLANT_CD:" + struct.getw_PLANT_CD());
							listMessage.add("M_SBCNT_UNIT_COST.ITEM_CD:" + struct.getITEM_CD());
							listMessage.add("M_SBCNT_UNIT_COST.PROC_CD:" + struct.getPROC_CD());
							listMessage.add("M_SBCNT_UNIT_COST.EFF_PHASE_IN_DATE:" + struct.getp_EFF_PHASE_IN_DATE());

							setErrorMessage("ZZ01105", listMessage);
						}
					}
				}

				//エラーが無ければ削除
				if(msgStruct.sizeError() <= 0) {
					entity.mdeleteM_SBCNT_UNIT_COST_H.delete(conn, struct);
					entity.mdeleteM_SBCNT_UNIT_COST_deleteAll.delete(conn, struct);

					//再検索
					struct.keycopy(_keyStruct);
					controlselect();
				}
				}

	            // パラメータ「外注単価承認」が1のとき
				if ("1".equals(struct.geth_APR_SBCNT_UNIT_COST())) {
					List tempList = entity.mselectM_SBCNT_UNIT_COST.read(conn,struct);
					AA0040020Struct tempStruct = new AA0040020Struct();
					for(int i =0 ;i<tempList.size();i++){
						tempStruct = (AA0040020Struct)tempList.get(i);
						struct.copy(tempStruct);
						insertAppr("delete");
						if(msgStruct.hasError()){
							return ;
						}
					}
					struct.keycopy(_keyStruct);
					insertAppr_Head("delete");
				}
				if(!msgStruct.hasError()){
					// コミット
					conn.commit();
					if("1".equals(struct.geth_APR_SBCNT_UNIT_COST())){
						setInfoMessage("AZ00042");
					}
					transFlg = false;
				}
			}catch(SQLException e){
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

		//------------------------------------------------------------------
                //}}user_implement_dev:<controldelete>
		logger.exiting("AA0040020Control"+":USER="+struct.getsUser_ID(),"controldelete");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlclear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0040");
		logger.entering("AA0040020Control"+":USER="+struct.getsUser_ID(),"controlclear");
			//{{user_implement_dev:<controlclear>
		//------------------------------------------------------------------
		// 初期化
		_deployList.clear();
		_keyStruct.clear();
		struct.clear();

		// パラメータ「外注単価承認」を取得する
        struct.seth_APR_SBCNT_UNIT_COST(_APR_SBCNT_UNIT_COST);

		// モード設定
		setReadStatus(INITIAL);
		//------------------------------------------------------------------
                //}}user_implement_dev:<controlclear>
		logger.exiting("AA0040020Control"+":USER="+struct.getsUser_ID(),"controlclear");

		return;
	}

	/**
	 * 戻るボタン押下時に実行される処理です。
	 *
	 */
	public void controlcancelSub1() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0040");
		logger.entering("AA0040020Control"+":USER="+struct.getsUser_ID(),"controlcancelSub1");
			//{{user_implement_dev:<controlcancelSub1>
		//------------------------------------------------------------------
		struct.copy(_keyStruct);

		//再検索
		controlselect();
		//------------------------------------------------------------------
                //}}user_implement_dev:<controlcancelSub1>
		logger.exiting("AA0040020Control"+":USER="+struct.getsUser_ID(),"controlcancelSub1");

		return;
	}

	/**
	 * 登録ボタン押下時に実行される処理です。
	 *
	 */
	public void controlsub1Insert() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0040");
		logger.entering("AA0040020Control"+":USER="+struct.getsUser_ID(),"controlsub1Insert");
			//{{user_implement_dev:<controlsub1Insert>
		//------------------------------------------------------------------
			List listMessage = new ArrayList();
			boolean transFlg = false;

			try{
				// トランザクション開始
				conn.beginTransWeb();
				transFlg = true;
				// ヘッダー部の削除依頼処理チェック
				if(checkApprDel()) {
					return;
				}
				boolean result = false;	 // チェック結果格納用					
				
				// 外注単価マスタの存在チェック
				result = entity.mcheckM_SBCNT_UNIT_COST.check(conn, struct);
				if(result == true){
					//外注単価が既に登録済み
					listMessage.add("M_SBCNT_UNIT_COST.COMPANY_CD:" + _COMPANY_CD);
					listMessage.add("M_SBCNT_UNIT_COST.VEND_CD:" + struct.getVEND_CD());
					listMessage.add("M_SBCNT_UNIT_COST.PLANT_CD:" + struct.getw_PLANT_CD());
					listMessage.add("M_SBCNT_UNIT_COST.ITEM_CD:" + struct.getITEM_CD());
					listMessage.add("M_SBCNT_UNIT_COST.PROC_CD:" + struct.getPROC_CD());
					listMessage.add("M_SBCNT_UNIT_COST.EFF_PHASE_IN_DATE:" + struct.getp_EFF_PHASE_IN_DATE());
					
					setErrorMessage("ZZ01102", listMessage);
					return ;

				}
				
				// 外注単価ヘッダの存在チェック
				result = entity.mcheckM_SBCNT_UNIT_COST_H.check(conn,struct);
				if(result == false){
					//パラメータ「外注単価承認」が0の時
					if("0".equals(struct.geth_APR_SBCNT_UNIT_COST())){
						entity.minsertM_SBCNT_UNIT_COST_H.create(conn,struct);
					}else{
						insertAppr_Head("insert");
						if(msgStruct.hasError()){
							msgStruct.clearError();
						}
					}
				}
				
				//パラメータ「外注単価承認」が0の時
				if("0".equals(struct.geth_APR_SBCNT_UNIT_COST())){
					entity.minsertM_SBCNT_UNIT_COST.create(conn, struct);
					struct.keycopy(_keyStruct);
					
				}
				// パラメータ「外注単価承認」が１の時
				if("1".equals(struct.geth_APR_SBCNT_UNIT_COST())){
					// 承認情報の登録
					insertAppr("insert");
				}
				if(!msgStruct.hasError()){
					conn.commit();
					if("1".equals(struct.geth_APR_SBCNT_UNIT_COST())){
						setInfoMessage("AZ00042");
					}
					// 再検索
					controlselect();
					transFlg = false;
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

		//------------------------------------------------------------------
                //}}user_implement_dev:<controlsub1Insert>
		logger.exiting("AA0040020Control"+":USER="+struct.getsUser_ID(),"controlsub1Insert");

		return;
	}

	/**
	 * 更新ボタン押下時に実行される処理です。
	 *
	 */
	public void controlsub1Update() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0040");
		logger.entering("AA0040020Control"+":USER="+struct.getsUser_ID(),"controlsub1Update");
			//{{user_implement_dev:<controlsub1Update>
		//------------------------------------------------------------------
			List listMessage = new ArrayList();
			boolean transFlg = false;

			try{

				// トランザクション開始
				conn.beginTransWeb();
				transFlg = true;

				//加工費文字数取得
				String prosessingCost = new String();
				prosessingCost = struct.getp_PROCESSING_COST();

				if(prosessingCost.length() == 0){
					struct.setp_PROCESSING_COST("0");
				}

				//材料費
				String materialCost = new String();
				materialCost = struct.getp_MATERIAL_COST();

				if(materialCost.length() == 0){
					struct.setp_MATERIAL_COST("0");
				}

				//その他経費
				String otherOverheads = new String();
				otherOverheads = struct.getp_OTHER_OVERHEADS();

				if(otherOverheads.length() == 0){
					struct.setp_OTHER_OVERHEADS("0");
				}
				
				boolean result = false;
				// リストのModifyCountを取得
				String modifyCount = new String(struct.getw_MODIFY_COUNT());
				List modifyList = null;
				
				//現在のレコード更新カウントチェック
				modifyList = entity.mselectM_SBCNT_UNIT_COST_modify.read(conn, struct);
				if (modifyList.size() > 0) {
					// 現在の更新カウント取得
					String modifySelect = new String(((AA0040020Struct) modifyList.get(0)).getw_MODIFY_COUNT());
					// 更新カウントのチェック
					if (modifyCount.equals(modifySelect) == false) {
						// 行更新処理失敗：既にレコードが更新されています
						listMessage.add("M_SBCNT_UNIT_COST.VEND_CD:" + struct.getVEND_CD());
						listMessage.add("M_SBCNT_UNIT_COST.PLANT_CD:" + struct.getw_PLANT_CD());
						listMessage.add("M_SBCNT_UNIT_COST.ITEM_CD:" + struct.getITEM_CD());
						listMessage.add("M_SBCNT_UNIT_COST.PROC_CD:" + struct.getPROC_CD());
						listMessage.add("M_SBCNT_UNIT_COST.EFF_PHASE_IN_DATE:" + struct.getp_EFF_PHASE_IN_DATE());
						
						setErrorMessage("ZZ01105", listMessage);
						return ;
					}
				} else {
					// 行更新処理失敗：検索条件に一致するデータは存在しませんでした
					listMessage.add("M_SBCNT_UNIT_COST.VEND_CD:" + struct.getVEND_CD());
					listMessage.add("M_SBCNT_UNIT_COST.PLANT_CD:" + struct.getw_PLANT_CD());
					listMessage.add("M_SBCNT_UNIT_COST.ITEM_CD:" + struct.getITEM_CD());
					listMessage.add("M_SBCNT_UNIT_COST.PROC_CD:" + struct.getPROC_CD());
					listMessage.add("M_SBCNT_UNIT_COST.EFF_PHASE_IN_DATE:" + struct.getp_EFF_PHASE_IN_DATE());

					setErrorMessage("ZZ06001", listMessage);
					return ;
				}
				// エラーが無ければ実行
				// パラメータ「外注単価承認」が０
				if ("0".equals(struct.geth_APR_SBCNT_UNIT_COST())) {
		            // パラメータ「外注単価承認」が0のとき
					entity.mupdateM_SBCNT_UNIT_COST.update(conn, struct);
					struct.keycopy(_keyStruct);
				}
	            // パラメータ「外注単価承認」が1のとき
				if ("1".equals(struct.geth_APR_SBCNT_UNIT_COST())) {
					insertAppr("update");
					struct.keycopy(_keyStruct);
				}
				if(!msgStruct.hasError()){
					conn.commit();
					if("1".equals(struct.geth_APR_SBCNT_UNIT_COST())){
						setInfoMessage("AZ00042");
					}
					// 再検索
					controlselect();
					transFlg = false;
				}
			}catch(SQLException e){
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

		//------------------------------------------------------------------
                //}}user_implement_dev:<controlsub1Update>
		logger.exiting("AA0040020Control"+":USER="+struct.getsUser_ID(),"controlsub1Update");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0040");
		logger.entering("AA0040020Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>

		// パラメータ「外注単価承認」を取得する
        initalparameter();
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AA0040020Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0040");
		logger.entering("AA0040020Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
		//------------------------------------------------------------------

			try{

				// コンボボックスデータ用意
				ComboBox comboController = new ComboBox(conn, sysUSER_CD);

				//単価区分
				_CONS_UNIT_COST = comboController.getData("UNIT_COST_TYP");
				//品目手配区分
				_MRP_ODR_TYP  = comboController.getData("MRP_ODR_TYP");
				//内外作成区分
				_OUTSIDE_TYP = comboController.getData("OUTSIDE_TYP");

				// パラメータ「外注単価承認」を取得する
		        initalparameter();

				// キーを取得
		        if("1".equals(struct.geth_APR_SBCNT_UNIT_COST()) && this.isScreenMove() && null != struct.geth_SCREENMOVE_TYP()){
					getKey();
				}
		        //外注単価メンテからの遷移の場合
		        if(this.isScreenMove() && "AA0140020".equals(this.getScreenId())){
		        	struct.setw_PLANT_CD(_w_PLANT_CD);
		        }

			}catch(SQLException e){
				setSqlExceptionMsg(e);
			}catch(ComboException e){
				ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
				sysLog.severe(emsg, getsysUSER_CD());
				ExpjException ee = new ExpjException(e, emsg);
				
				throw ee;

			}

                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AA0040020Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * イベントハンドラの前処理です。
	 *
	 * @param buttun ボタン名
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0040");
		logger.entering("AA0040020Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
//		      struct.setDOWNLOAD_FILE((String)null);
			// コンボボックス部品のデータのセットはここに記述してください。
			// コンボボックスデータ用意

                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("AA0040020Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("append") ) {
				controlappend();
			} else if( button.equals("modify") ) {
				controlmodify();
			} else if( button.equals("copy") ) {
				controlcopy();
			} else if( button.equals("erase") ) {
				controlerase();
			} else if( button.equals("update") ) {
				controlupdate();
			} else if( button.equals("delete") ) {
				controldelete();
			} else if( button.equals("clear") ) {
				controlclear();
			} else if( button.equals("cancelSub1") ) {
				controlcancelSub1();
			} else if( button.equals("sub1Insert") ) {
				controlsub1Insert();
			} else if( button.equals("sub1Update") ) {
				controlsub1Update();
			} else if( button.equals("initial") ) {
				controlINITIAL();
			} else if( button.equals("reload") ) {
				controlRELOAD();
			}
		//{{user_implement_dev:<control_eventHandller>
			//------------------------------------------------------------------
			// 2003/09/03 Y.Mitsui
			//------------------------------------------------------------------
			struct.setList_p_UNIT_COST_TYP_val(_CONS_UNIT_COST.getValList());
			struct.setList_p_UNIT_COST_TYP_name(_CONS_UNIT_COST.getExplanList());

                //}}user_implement_dev:<control_eventHandller>
		} catch( BusinessLockException ble ) {
			// 枠メッセージ出力依頼作成
			setNewDataFlg(false);
		} catch( ResourceBusyException rbe ) {
			ExpjException ee = new ExpjException(rbe, "ZZ01105");
			throw ee;
		} catch( FoundationException e ) {
//			e.printStackTrace();
//			throw new FoundationException("AA0040020Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AA0040020-E999","CSVの出力処理"));
			throw new FoundationException("AA0040020Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AA0040020-E999","システム日付の取得処理"));
				throw new FoundationException("AA0040020Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AA0040020-E999","コントロールのイベント処理"));
			throw new FoundationException("AA0040020Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected AA0040020Entity entity;
	protected AA0040020Struct struct;
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

		entity = new AA0040020Entity();
		struct = new AA0040020Struct();

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
	 * AA0040020クラスの標準コンストラクタ
	 */
	public AA0040020Control() throws BusinessProcessException, FoundationException
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
				AA0040020Struct key = (AA0040020Struct)keyList.get(j);
				// メッセージキーを作成する
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("p_UNIT_COST_TYP_name") && key.getp_UNIT_COST_TYP_name() != null) {
					msgKey.setKeyValue("p_UNIT_COST_TYP_name", key.getp_UNIT_COST_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("p_UNIT_COST_TYP_val") && key.getp_UNIT_COST_TYP_val() != null) {
					msgKey.setKeyValue("p_UNIT_COST_TYP_val", key.getp_UNIT_COST_TYP_val().toString());
				}
				if(msgKeyType.containsKeyColumn("p_UNIT_COST_NAME") && key.getp_UNIT_COST_NAME() != null) {
					msgKey.setKeyValue("p_UNIT_COST_NAME", key.getp_UNIT_COST_NAME());
				}
				if(msgKeyType.containsKeyColumn("w_MRP_ODR_NAME") && key.getw_MRP_ODR_NAME() != null) {
					msgKey.setKeyValue("w_MRP_ODR_NAME", key.getw_MRP_ODR_NAME());
				}
				if(msgKeyType.containsKeyColumn("w_OUTSIDE_NAME") && key.getw_OUTSIDE_NAME() != null) {
					msgKey.setKeyValue("w_OUTSIDE_NAME", key.getw_OUTSIDE_NAME());
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
				if(msgKeyType.containsKeyColumn("p_APPR_REMARKS") && key.getp_APPR_REMARKS() != null) {
					msgKey.setKeyValue("p_APPR_REMARKS", key.getp_APPR_REMARKS());
				}
				if(msgKeyType.containsKeyColumn("h_APR_SBCNT_UNIT_COST") && key.geth_APR_SBCNT_UNIT_COST() != null) {
					msgKey.setKeyValue("h_APR_SBCNT_UNIT_COST", key.geth_APR_SBCNT_UNIT_COST());
				}
				if(msgKeyType.containsKeyColumn("h_VEND_ITEM_CD_1") && key.geth_VEND_ITEM_CD_1() != null) {
					msgKey.setKeyValue("h_VEND_ITEM_CD_1", key.geth_VEND_ITEM_CD_1());
				}
				if(msgKeyType.containsKeyColumn("w_PLANT_CD") && key.getw_PLANT_CD() != null) {
					msgKey.setKeyValue("w_PLANT_CD", key.getw_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("w_RECORD_COUNT") && key.getw_RECORD_COUNT() != null) {
					msgKey.setKeyValue("w_RECORD_COUNT", key.getw_RECORD_COUNT().toString());
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
				if(msgKeyType.containsKeyColumn("w_MRP_ODR_TYP") && key.getw_MRP_ODR_TYP() != null) {
					msgKey.setKeyValue("w_MRP_ODR_TYP", key.getw_MRP_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("w_OUTSIDE_TYP") && key.getw_OUTSIDE_TYP() != null) {
					msgKey.setKeyValue("w_OUTSIDE_TYP", key.getw_OUTSIDE_TYP());
				}
				if(msgKeyType.containsKeyColumn("COMPANY_CD") && key.getCOMPANY_CD() != null) {
					msgKey.setKeyValue("COMPANY_CD", key.getCOMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("PROC_CD") && key.getPROC_CD() != null) {
					msgKey.setKeyValue("PROC_CD", key.getPROC_CD());
				}
				if(msgKeyType.containsKeyColumn("PROC_NAME") && key.getPROC_NAME() != null) {
					msgKey.setKeyValue("PROC_NAME", key.getPROC_NAME());
				}
				if(msgKeyType.containsKeyColumn("VEND_CD") && key.getVEND_CD() != null) {
					msgKey.setKeyValue("VEND_CD", key.getVEND_CD());
				}
				if(msgKeyType.containsKeyColumn("VEND_ANAME") && key.getVEND_ANAME() != null) {
					msgKey.setKeyValue("VEND_ANAME", key.getVEND_ANAME());
				}
				if(msgKeyType.containsKeyColumn("CUR_CD") && key.getCUR_CD() != null) {
					msgKey.setKeyValue("CUR_CD", key.getCUR_CD());
				}
				if(msgKeyType.containsKeyColumn("ROUND_TYP") && key.getROUND_TYP() != null) {
					msgKey.setKeyValue("ROUND_TYP", key.getROUND_TYP());
				}
				if(msgKeyType.containsKeyColumn("CUR_NAME") && key.getCUR_NAME() != null) {
					msgKey.setKeyValue("CUR_NAME", key.getCUR_NAME());
				}
				if(msgKeyType.containsKeyColumn("DECIMAL_FIG") && key.getDECIMAL_FIG() != null) {
					msgKey.setKeyValue("DECIMAL_FIG", key.getDECIMAL_FIG());
				}
				if(msgKeyType.containsKeyColumn("VEND_ITEM_CD") && key.getVEND_ITEM_CD() != null) {
					msgKey.setKeyValue("VEND_ITEM_CD", key.getVEND_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("w_MODIFY_COUNT_H") && key.getw_MODIFY_COUNT_H() != null) {
					msgKey.setKeyValue("w_MODIFY_COUNT_H", key.getw_MODIFY_COUNT_H());
				}
				if(msgKeyType.containsKeyColumn("p_EFF_PHASE_IN_DATE") && key.getp_EFF_PHASE_IN_DATE() != null) {
					msgKey.setKeyValue("p_EFF_PHASE_IN_DATE", key.getp_EFF_PHASE_IN_DATE());
				}
				if(msgKeyType.containsKeyColumn("p_UNIT_COST") && key.getp_UNIT_COST() != null) {
					msgKey.setKeyValue("p_UNIT_COST", key.getp_UNIT_COST());
				}
				if(msgKeyType.containsKeyColumn("p_UNIT_COST_TYP") && key.getp_UNIT_COST_TYP() != null) {
					msgKey.setKeyValue("p_UNIT_COST_TYP", key.getp_UNIT_COST_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("p_PROCESSING_COST") && key.getp_PROCESSING_COST() != null) {
					msgKey.setKeyValue("p_PROCESSING_COST", key.getp_PROCESSING_COST());
				}
				if(msgKeyType.containsKeyColumn("p_MATERIAL_COST") && key.getp_MATERIAL_COST() != null) {
					msgKey.setKeyValue("p_MATERIAL_COST", key.getp_MATERIAL_COST());
				}
				if(msgKeyType.containsKeyColumn("p_OTHER_OVERHEADS") && key.getp_OTHER_OVERHEADS() != null) {
					msgKey.setKeyValue("p_OTHER_OVERHEADS", key.getp_OTHER_OVERHEADS());
				}
				if(msgKeyType.containsKeyColumn("w_MODIFY_COUNT") && key.getw_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("w_MODIFY_COUNT", key.getw_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("p_PLANT_CD") && key.getp_PLANT_CD() != null) {
					msgKey.setKeyValue("p_PLANT_CD", key.getp_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("p_USER_CD") && key.getp_USER_CD() != null) {
					msgKey.setKeyValue("p_USER_CD", key.getp_USER_CD());
				}
				if(msgKeyType.containsKeyColumn("p_BUSINESS_DATE") && key.getp_BUSINESS_DATE() != null) {
					msgKey.setKeyValue("p_BUSINESS_DATE", key.getp_BUSINESS_DATE());
				}
				if(msgKeyType.containsKeyColumn("p_VALUE") && key.getp_VALUE() != null) {
					msgKey.setKeyValue("p_VALUE", key.getp_VALUE());
				}
				if(msgKeyType.containsKeyColumn("p_NAME") && key.getp_NAME() != null) {
					msgKey.setKeyValue("p_NAME", key.getp_NAME());
				}
				if(msgKeyType.containsKeyColumn("EFF_PHASE_IN_DATE") && key.getEFF_PHASE_IN_DATE() != null) {
					msgKey.setKeyValue("EFF_PHASE_IN_DATE", key.getEFF_PHASE_IN_DATE());
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
					AA0040020Struct key = new AA0040020Struct();
					if(msgKeyType.containsKeyColumn("p_UNIT_COST_TYP_name")) {
						key.setp_UNIT_COST_TYP_name(msgKey.getKeyValue("p_UNIT_COST_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("p_UNIT_COST_TYP_val")) {
						key.setp_UNIT_COST_TYP_val(new Integer(msgKey.getKeyValue("p_UNIT_COST_TYP_val")));
					}
					if(msgKeyType.containsKeyColumn("p_UNIT_COST_NAME")) {
						key.setp_UNIT_COST_NAME(msgKey.getKeyValue("p_UNIT_COST_NAME"));
					}
					if(msgKeyType.containsKeyColumn("w_MRP_ODR_NAME")) {
						key.setw_MRP_ODR_NAME(msgKey.getKeyValue("w_MRP_ODR_NAME"));
					}
					if(msgKeyType.containsKeyColumn("w_OUTSIDE_NAME")) {
						key.setw_OUTSIDE_NAME(msgKey.getKeyValue("w_OUTSIDE_NAME"));
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
					if(msgKeyType.containsKeyColumn("p_APPR_REMARKS")) {
						key.setp_APPR_REMARKS(msgKey.getKeyValue("p_APPR_REMARKS"));
					}
					if(msgKeyType.containsKeyColumn("h_APR_SBCNT_UNIT_COST")) {
						key.seth_APR_SBCNT_UNIT_COST(msgKey.getKeyValue("h_APR_SBCNT_UNIT_COST"));
					}
					if(msgKeyType.containsKeyColumn("h_VEND_ITEM_CD_1")) {
						key.seth_VEND_ITEM_CD_1(msgKey.getKeyValue("h_VEND_ITEM_CD_1"));
					}
					if(msgKeyType.containsKeyColumn("w_PLANT_CD")) {
						key.setw_PLANT_CD(msgKey.getKeyValue("w_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_RECORD_COUNT")) {
						key.setw_RECORD_COUNT(new Integer(msgKey.getKeyValue("w_RECORD_COUNT")));
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
					if(msgKeyType.containsKeyColumn("w_MRP_ODR_TYP")) {
						key.setw_MRP_ODR_TYP(msgKey.getKeyValue("w_MRP_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("w_OUTSIDE_TYP")) {
						key.setw_OUTSIDE_TYP(msgKey.getKeyValue("w_OUTSIDE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("COMPANY_CD")) {
						key.setCOMPANY_CD(msgKey.getKeyValue("COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("PROC_CD")) {
						key.setPROC_CD(msgKey.getKeyValue("PROC_CD"));
					}
					if(msgKeyType.containsKeyColumn("PROC_NAME")) {
						key.setPROC_NAME(msgKey.getKeyValue("PROC_NAME"));
					}
					if(msgKeyType.containsKeyColumn("VEND_CD")) {
						key.setVEND_CD(msgKey.getKeyValue("VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("VEND_ANAME")) {
						key.setVEND_ANAME(msgKey.getKeyValue("VEND_ANAME"));
					}
					if(msgKeyType.containsKeyColumn("CUR_CD")) {
						key.setCUR_CD(msgKey.getKeyValue("CUR_CD"));
					}
					if(msgKeyType.containsKeyColumn("ROUND_TYP")) {
						key.setROUND_TYP(msgKey.getKeyValue("ROUND_TYP"));
					}
					if(msgKeyType.containsKeyColumn("CUR_NAME")) {
						key.setCUR_NAME(msgKey.getKeyValue("CUR_NAME"));
					}
					if(msgKeyType.containsKeyColumn("DECIMAL_FIG")) {
						key.setDECIMAL_FIG(msgKey.getKeyValue("DECIMAL_FIG"));
					}
					if(msgKeyType.containsKeyColumn("VEND_ITEM_CD")) {
						key.setVEND_ITEM_CD(msgKey.getKeyValue("VEND_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_MODIFY_COUNT_H")) {
						key.setw_MODIFY_COUNT_H(msgKey.getKeyValue("w_MODIFY_COUNT_H"));
					}
					if(msgKeyType.containsKeyColumn("p_EFF_PHASE_IN_DATE")) {
						key.setp_EFF_PHASE_IN_DATE(msgKey.getKeyValue("p_EFF_PHASE_IN_DATE"));
					}
					if(msgKeyType.containsKeyColumn("p_UNIT_COST")) {
						key.setp_UNIT_COST(msgKey.getKeyValue("p_UNIT_COST"));
					}
					if(msgKeyType.containsKeyColumn("p_UNIT_COST_TYP")) {
						key.setp_UNIT_COST_TYP(new Integer(msgKey.getKeyValue("p_UNIT_COST_TYP")));
					}
					if(msgKeyType.containsKeyColumn("p_PROCESSING_COST")) {
						key.setp_PROCESSING_COST(msgKey.getKeyValue("p_PROCESSING_COST"));
					}
					if(msgKeyType.containsKeyColumn("p_MATERIAL_COST")) {
						key.setp_MATERIAL_COST(msgKey.getKeyValue("p_MATERIAL_COST"));
					}
					if(msgKeyType.containsKeyColumn("p_OTHER_OVERHEADS")) {
						key.setp_OTHER_OVERHEADS(msgKey.getKeyValue("p_OTHER_OVERHEADS"));
					}
					if(msgKeyType.containsKeyColumn("w_MODIFY_COUNT")) {
						key.setw_MODIFY_COUNT(msgKey.getKeyValue("w_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("p_PLANT_CD")) {
						key.setp_PLANT_CD(msgKey.getKeyValue("p_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("p_USER_CD")) {
						key.setp_USER_CD(msgKey.getKeyValue("p_USER_CD"));
					}
					if(msgKeyType.containsKeyColumn("p_BUSINESS_DATE")) {
						key.setp_BUSINESS_DATE(msgKey.getKeyValue("p_BUSINESS_DATE"));
					}
					if(msgKeyType.containsKeyColumn("p_VALUE")) {
						key.setp_VALUE(msgKey.getKeyValue("p_VALUE"));
					}
					if(msgKeyType.containsKeyColumn("p_NAME")) {
						key.setp_NAME(msgKey.getKeyValue("p_NAME"));
					}
					if(msgKeyType.containsKeyColumn("EFF_PHASE_IN_DATE")) {
						key.setEFF_PHASE_IN_DATE(msgKey.getKeyValue("EFF_PHASE_IN_DATE"));
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
