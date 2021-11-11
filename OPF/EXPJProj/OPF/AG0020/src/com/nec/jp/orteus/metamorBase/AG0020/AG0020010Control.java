/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AG0020/src/com/nec/jp/orteus/metamorBase/AG0020/AG0020010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AG0020;

import com.nec.jp.orteus.metamorBase.AG0020.*;
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

import java.io.*;
import jp.co.fit.vfreport.*;
//{{user_implement_code_import
//------------------------------------------------------------------------------
import com.nec.jp.orteus.metamorBase.util.AlarmMessage.AlarmMessageException;
import com.nec.jp.orteus.metamorBase.common.util.ScreenParam;
import com.nec.jp.orteus.metamorBase.common08.LotCtrl.LotCtrl;

import java.text.SimpleDateFormat;
import java.text.ParseException;
//------------------------------------------------------------------------------
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AG0020010Control
{

	//////////////////////////////
	// アクセサメソッド等を定義します
	// Businessオブジェクトアクセサメソッド
	private Business business;
	public Business getBusiness() { return this.business; }
	public void setBusiness( Business obj ) { this.business = obj; }

	// PDF用アクセサメソッド
	private String queryFileName = null;
	public String getQueryfileName() { return this.queryFileName; }
	public void setQueryFileName(String queryFileName) { this.queryFileName = queryFileName; }
	private String frmFileName = null;
	public String getFrmfileName() { return this.frmFileName; }
	public void setFrmFileName(String frmFileName) { this.frmFileName = frmFileName; }
	private String pdfFileName = null;
	public String getPdfFileName() { return this.pdfFileName; }
	public void setPdfFileName(String pdfFileName) { this.pdfFileName = pdfFileName; }
	private String dbUID = null;
	private String dbPWD = null;
	private String dbDBQ = null;
	private String dbKIND = null;
	private String pdfFilePath = null;
	public String getPdfFilePath() { return this.pdfFilePath; }
	public void setPdfFilePath(String pdfFilePath) { this.pdfFilePath = pdfFilePath; }

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
	public AG0020010Struct getListvalue(int x) { return (AG0020010Struct)(this.list.get(x)); }	// リストの値を返します。
	public AG0020010Struct getStruct() { return this.struct; }	// Structを返します。
	public AG0020010Struct createStruct() { return new AG0020010Struct(); }	// 新しいStructを作って返します。
	public void setStruct(Object structname) { this.struct.setStruct((AG0020010Struct)structname); }	// Structをセットします。
//	public void initializeStruct() { this.struct.initialize(); }	// Structの値を初期化します。

	// CSV出力用リスト
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }

//------------------------------------------------------------------------------

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


//---------- ＣＳＶ出力関連の処理 ---------------------------------------------------

	private List csvList = null;
	public List getCsvList(){ return this.csvList; }

	/** 一覧情報格納用リスト */
	List _listData = new ArrayList(0);


//---------- コンボボックスデータ取得関連の処理 -------------------------------

	/** 品目手配区分 */
	ComboStruct _MRP_ODR_TYP = new ComboStruct();

	/** 品目手配区分設定
	 * @param コンボボックスデータ
	*/
	public void setMRP_ODR_TYP_comb(ComboStruct combo){ _MRP_ODR_TYP = combo; }

	/** 品目手配区分取得
	 * @return 品目手配区分のコンボボックスデータ
	*/
	public ComboStruct getMRP_ODR_TYP_comb(){ return _MRP_ODR_TYP; }


	/** 入出庫区分 */
	ComboStruct _RCV_ISSUE_TYP = new ComboStruct();

	/** 入出庫区分設定
	 * @param コンボボックスデータ
	*/
	public void setRCV_ISSUE_TYP_comb(ComboStruct combo){ _RCV_ISSUE_TYP = combo; }

	/** 入出庫区分取得
	 * @return 入出庫区分のコンボボックスデータ
	*/
	public ComboStruct getRCV_ISSUE_TYP_comb(){ return _RCV_ISSUE_TYP; }


	/** 入出庫発生区分 */
	ComboStruct _RCV_ISSUE_GNR_TYP = new ComboStruct();

	/** 入出庫発生区分設定
	 * @param コンボボックスデータ
	*/
	public void setRCV_ISSUE_GNR_TYP_comb(ComboStruct combo){ _RCV_ISSUE_GNR_TYP = combo; }

	/** 入出庫発生区分取得
	 * @return 入出庫発生区分のコンボボックスデータ
	*/
	public ComboStruct getRCV_ISSUE_GNR_TYP_comb(){ return _RCV_ISSUE_GNR_TYP; }


	/** 在庫更新区分 */
	ComboStruct _STOCK_UPD_TYP = new ComboStruct();

	/** 在庫更新区分設定
	 * @param コンボボックスデータ
	*/
	public void setSTOCK_UPD_TYP_comb(ComboStruct combo){ _STOCK_UPD_TYP = combo; }

	/** 在庫更新区分取得
	 * @return 在庫更新区分のコンボボックスデータ
	*/
	public ComboStruct getSTOCK_UPD_TYP_comb(){ return _STOCK_UPD_TYP; }


	/** 入出庫完了フラグ */
	ComboStruct _RCV_ISSUE_CMPLT_FLG = new ComboStruct();

	/** 入出庫完了フラグ設定
	 * @param コンボボックスデータ
	*/
	public void setRCV_ISSUE_CMPLT_FLG_comb(ComboStruct combo){ _RCV_ISSUE_CMPLT_FLG = combo; }

	/** 入出庫完了フラグ取得
	 * @return 入出庫完了フラグのコンボボックスデータ
	*/
	public ComboStruct getRCV_ISSUE_CMPLT_FLG_comb(){ return _RCV_ISSUE_CMPLT_FLG; }


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

		_usersIntialized = true;
		return ;
	}


//------------------------------------------------------------------------
	/**
	 * コンボボックスの中身を取得します。
	 *
	 * @param data データの箱
	 */
	 private void setComboData(AG0020010Struct data) throws ExpjException
	 {
			ComboBox controller = new ComboBox(conn, sysUSER_CD);
		try{
			//コンボデータの取得
			ComboStruct MRP_ODR_TYP_comb = controller.getData("MRP_ODR_TYP");
			ComboStruct RCV_ISSUE_TYP_comb = controller.getData("RCV_ISSUE_TYP");
			ComboStruct RCV_ISSUE_GNR_TYP_comb = controller.getData("RCV_ISSUE_GNR_TYP");
			ComboStruct STOCK_UPD_TYP_comb = controller.getData("STOCK_UPD_TYP");
			ComboStruct RCV_ISSUE_CMPLT_FLG_comb = controller.getData("RCV_ISSUE_CMPLT_FLG");

			controller.setConnection(null);

			//属性に取得データ設定
			setMRP_ODR_TYP_comb(MRP_ODR_TYP_comb);
			setRCV_ISSUE_TYP_comb(RCV_ISSUE_TYP_comb);
			setRCV_ISSUE_GNR_TYP_comb(RCV_ISSUE_GNR_TYP_comb);
			setSTOCK_UPD_TYP_comb(STOCK_UPD_TYP_comb);
			setRCV_ISSUE_CMPLT_FLG_comb(RCV_ISSUE_CMPLT_FLG_comb);

		}catch(SQLException e) {
			setSqlExceptionMsg(e);

		}catch(ComboException e){
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;
		}
	}

	//-------------------------------------------------------------------------
	/**
	 * 外部オーダ参照のフラグの表示を設定
	 * @param s フラグの値が設定されている情報
	 */
	private void setTypeValueAboutProcGroup(AG0020010Struct s)
	{
		s.setMRP_ODR_NAME(getTypeName(_MRP_ODR_TYP,s.getMRP_ODR_TYP()));
		s.setRCV_ISSUE_NAME(getTypeName(_RCV_ISSUE_TYP,s.getRCV_ISSUE_TYP()));
		s.setRCV_ISSUE_GNR_NAME(getTypeName(_RCV_ISSUE_GNR_TYP,s.getRCV_ISSUE_GNR_TYP()));
		s.setSTOCK_UPD_NAME(getTypeName(_STOCK_UPD_TYP,s.getSTOCK_UPD_TYP()));
		s.setRCV_ISSUE_CMPLT_NAME(getTypeName(_RCV_ISSUE_CMPLT_FLG,s.getRCV_ISSUE_CMPLT_FLG()));
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
		
	//-------------------------------------------------------------------------

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


//------------------------------------------------------------------------------
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * 読込ボタン押下時に実行される処理です。
	 *
	 */
	public void controlselect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AG0020");
		logger.entering("AG0020010Control"+":USER="+struct.getsUser_ID(),"controlselect");
			//{{user_implement_dev:<controlselect>
		//------------------------------------------------------------------
		// ログ出力情報格納用
		String logMessage = "";
		List listMessage = new ArrayList();

		setReadStatus(INITIAL);

		try {

			// キー項目ログ表示
			logMessage = "T_RCV_ISSUE.PLANT_CD:" + struct.getw_PLANT_CD()
						+ ", T_RCV_ISSUE.RCV_ISSUE_DATE:" + struct.getw_FROM_DATE() + " - " + struct.getw_TO_DATE()
						+ ", T_RCV_ISSUE.ITEM_CD:" + struct.getw_ITEM_CD()
						+ ", T_RCV_ISSUE.JOB_ODR_CD:" + struct.getw_JOB_ODR_CD()
						+ ", T_RCV_ISSUE.WH_CD:" + struct.getw_WH_CD()
						+ ", T_RCV_ISSUE.RCV_ISSUE_TYP:" + struct.getw_CHOICE();
			setSyslogConfig(logMessage);

			// リストクリア
			if(list != null){
				list.clear();
				_listData.clear();
			}

			// 画面項目クリア
          struct.setw_WH_NAME("");
          
          boolean existsPlantCd = false;
          struct.setw_PLANT_NAME("");
          struct.setw_VEND_NAME("");
          
		
			// エラーチェック
			// 工場が指定された場合
			if ((struct.getw_PLANT_CD() == null || ("").equals(struct.getw_PLANT_CD()) == true) == false) {
				// 工場の存在チェック
				List plantList = entity.mreadM_PLANT.read(conn, struct);
				if (plantList.size() <= 0) {
					// 読込処理失敗：工場コードが存在しません
					logMessage = "M_PLANT.PLANT_CD:" + struct.getw_PLANT_CD();
					setErrorMessage("AG00001", logMessage);
				} else {
					existsPlantCd = true;
					AG0020010Struct plantStruct = (AG0020010Struct)plantList.get(0);
					// 工場名を設定
					struct.setw_PLANT_NAME(plantStruct.getw_PLANT_NAME());
				}
			}
			
			// エラーチェック
			// 保管区が指定された場合
			if((struct.getw_WH_CD() == null || ("").equals(struct.getw_WH_CD()) == true) == false){
				//保管区の存在チェック
				List workList = entity.mcheckM_WH.read(conn, struct);
				if(workList.size() <= 0) {
					// 読込処理失敗：保管区コードが存在しません
					logMessage = "M_WH.WH_CD:" + struct.getw_WH_CD();
					setErrorMessage("AG00006", logMessage);
				}
				else{
					AG0020010Struct checkStruct = (AG0020010Struct)workList.get(0);

					// 保管区名を設定
					struct.setw_WH_NAME(checkStruct.getw_WH_NAME());

					// 工場コードが指定された場合
					// 保管区.工場コード ≠ 指定された工場コード
					if (struct.getw_PLANT_CD() != null && struct.getw_PLANT_CD().equals("") == false && existsPlantCd == true) {
						if((checkStruct.getw_WH_PLANT_CD().equals(struct.getw_PLANT_CD())) == false){
							// 読込処理失敗：保管区コードは他の工場のデータなので指定できません
							listMessage.add("M_WH.WH_CD:" + struct.getw_WH_CD());
							listMessage.add("M_WH.PLANT_CD:" + checkStruct.getw_WH_PLANT_CD());
							setErrorMessage("AG00007", listMessage);
							listMessage.clear();
						}
					}
				}
			}

          //エラーチェック
          //取引先が指定された場合
          if ((struct.getw_VEND_CD() != null)  &&  (struct.getw_VEND_CD().equals("") != true)){
            List vendList = entity.mreadM_VEND_CTRL.read(conn, struct);
            if (vendList.size() <= 0 ) {
              //読込処理失敗：取引先コードが存在しません
              logMessage = "M_VEND_CTRL.VEND_CD:" + struct.getw_VEND_CD();
              setErrorMessage("AG00009", logMessage);
              
            } else {
              AG0020010Struct vendStruct = (AG0020010Struct)vendList.get(0);
              struct.setw_VEND_NAME(vendStruct.getw_VEND_NAME());
            }
          }

		 //エラーチェック
		 //品目番号が指定された場合
		 if ((struct.getw_ITEM_CD() != null)  &&  ("".equals(struct.getw_ITEM_CD())!= true)){
				List itemList = entity.mreadM_ITEM.read(conn, struct);
				if (itemList.size() <= 0 ) {
				//読込処理失敗：品目番号が存在しません
				logMessage = "M_ITEM.ITEM_CD:" + struct.getw_ITEM_CD();
				setErrorMessage("AG00003", logMessage);

				} else {
				AG0020010Struct itemStruct = (AG0020010Struct)itemList.get(0);
				struct.setw_ITEM_NAME(itemStruct.getw_ITEM_NAME());
				}
			}

          	//入出庫数ゼロを含むチェックボックスの追加 2006/06/14 up
			if(struct.getl_check().equals("true")){
				struct.setw_check("0");
			}else {
				struct.setw_check("");
			}//入出庫数ゼロを含むチェックボックスの追加 2006/06/14 end
			
			//データ読込
			if(msgStruct.sizeError() <= 0){
				  // 表示最大行数制限処理
				ScreenParam sp = new ScreenParam(this.getClass());
				int maxLine = sp.getMaxLine(conn, 10);
				if (maxLine != 0)
					struct.setROW_COUNT(String.valueOf(maxLine));
				else
					struct.setROW_COUNT(null);
				    _listData = entity.mselectCnt.read(conn, struct);
				long rowCount = Long.parseLong(((AG0020010Struct) _listData.get(0)).getl_COUNT());

				// 検索結果0件の場合
				if(rowCount == 0){
					// 読込処理失敗：検索結果が0件です
					listMessage.add("T_RCV_ISSUE.PLANT_CD:" + struct.getw_PLANT_CD());
					listMessage.add("T_RCV_ISSUE.RCV_ISSUE_DATE:" + struct.getw_FROM_DATE() + " - " + struct.getw_TO_DATE());
					listMessage.add("T_RCV_ISSUE.ITEM_CD:" + struct.getw_ITEM_CD());
					listMessage.add("T_RCV_ISSUE.JOB_ODR_CD:" + struct.getw_JOB_ODR_CD());
					listMessage.add("T_RCV_ISSUE.WH_CD:" + struct.getw_WH_CD());
					listMessage.add("T_RCV_ISSUE.RCV_ISSUE_TYP:" + struct.getw_CHOICE());
                	listMessage.add("T_RCV_ISSUE.VEND_CD:" + struct.getw_VEND_CD()); 

					setErrorMessage("ZZ06001", listMessage);
					listMessage.clear();
					if(list != null && list.size() > 0){
						list.clear();
					}
					return;
				}else{
					if(maxLine != 0 && rowCount == maxLine + 1){
					setErrorMessage("ZZ01115", "", ""+maxLine);
					setReadStatus(TOO_MANY);
					if(list != null && list.size() > 0){
						list.clear();
					}
					return;
					}

			}
				_listData = entity.mselect.read(conn, struct);
				for(int i=0; i<_listData.size(); i++){
					// コンボボックスのデータ設定
					setTypeValueAboutProcGroup((AG0020010Struct)(_listData.get(i)));
				    }
					// 表示用リストにセット
					setList(_listData);
					setReadStatus(NORMAL);
				}


		}catch(SQLException e){
			setSqlExceptionMsg(e);
		}
		//------------------------------------------------------------------
                //}}user_implement_dev:<controlselect>
		logger.exiting("AG0020010Control"+":USER="+struct.getsUser_ID(),"controlselect");

		return;
	}

	/**
	 * CSV出力ボタン押下時に実行される処理です。
	 *
	 */
	public void controlcsv() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AG0020");
		logger.entering("AG0020010Control"+":USER="+struct.getsUser_ID(),"controlcsv");
			//{{user_implement_dev:<controlcsv>
		//------------------------------------------------------------------
		// ログ出力情報格納用
		String logMessage = "";
		List listMessage = new ArrayList();

		// CsvWriterを生成
		csvWriter = new CsvWriter(CsvWriter.getFileName(getsysUSER_CD()));
       	String strFilePath = null;
			
		try {
				
			csvList = new ArrayList();

			// 一覧情報格納用リストから読込データ設定
			setList(_listData);

			// 0件の場合終了
			if(list.size() <= 0) return;

			// CSV情報の作成
			String title[] = {
				"Expj.PLANT_CD" ,
				"Expj.RCV_ISSUE_DATE" ,
				"Expj.ITEM_CD" ,
				"Expj.ITEM_NAME" ,
				"Expj.JOB_ODR_CD" ,
				"Expj.VEND_CD" ,
				"Expj.VEND_NAME" ,
				"Expj.WH_CD" ,
				"Expj.WH_NAME" ,
				"Expj.RCV_ISSUE_BEFORE_QTY" ,
				"Expj.RCV_ISSUE_QTY" ,
				"Expj.RCV_ISSUE_AFTER_QTY" ,
				"Expj.RCV_ISSUE_TYP" ,
				"Expj.Cmt1100" ,
				"Expj.RCV_ISSUE_GNR_TYP" ,
				"Expj.Cmt1101" ,
				"Expj.WORK_ODR_CD" ,
				"Expj.WORK_IN_PROC_CD" ,
				"Expj.PARTIAL_PRD_NO" ,
				"Expj.OPR_CRCT_NO_1" ,
				"Expj.PUCH_ODR_CD" ,
				"Expj.ACPT_NO" ,
				"Expj.ACPT_RSLT_CRCT_NO" ,
				"Expj.INSPEC_RSLT_CRCT_NO" ,
				"Expj.ISSUE_INST_CD" ,
				"Expj.RCV_ISSUE_CMPLT_FLG" ,
				"Expj.Cmt1099" ,
				"Expj.MRP_ODR_TYP" ,
				"Expj.Cmt1108" ,
				"Expj.RCV_ISSUE_CTRL_CD" ,
				"Expj.STOCK_UPD_TYP" ,
				"Expj.Cmt1042" ,
				"Expj.STOCK_LOT_CD" ,
				"Expj.VEND_LOT_NO" ,
				"Expj.Cmt6856" ,
				"Expj.CREATED_DATE_1" ,
				"Expj.CREATED_BY" 
			};
			csvList.add(title);
			for(int i=0;i<this.list.size();i++){
              AG0020010Struct tempStruct = (AG0020010Struct)this.list.get(i);
              if("false".equals(struct.geth_lotCtrl())){
            	  tempStruct.setLOT_NO("");
              }
              String csvStr [] = new String[title.length];
              csvStr[0] = tempStruct.getPLANT_CD();
              csvStr[1] = tempStruct.getRCV_ISSUE_DATE();
              csvStr[2] = tempStruct.getITEM_CD();
              csvStr[3] = tempStruct.getITEM_NAME();
              csvStr[4] = tempStruct.getJOB_ODR_CD();
              csvStr[5] = tempStruct.getVEND_CD();
              csvStr[6] = tempStruct.getVEND_NAME();
              csvStr[7] = tempStruct.getWH_CD();
              csvStr[8] = tempStruct.getWH_NAME();
              csvStr[9] = TypeConverter.convert(tempStruct.getRCV_ISSUE_BEFORE_QTY());
              csvStr[10] = TypeConverter.convert(tempStruct.getRCV_ISSUE_QTY());
              csvStr[11] = TypeConverter.convert(tempStruct.getRCV_ISSUE_AFTER_QTY());
              csvStr[12] = TypeConverter.convert(tempStruct.getRCV_ISSUE_TYP());
              csvStr[13] = tempStruct.getRCV_ISSUE_NAME();
              csvStr[14] = TypeConverter.convert(tempStruct.getRCV_ISSUE_GNR_TYP());
              csvStr[15] = tempStruct.getRCV_ISSUE_GNR_NAME();

              csvStr[16] = tempStruct.getWORK_ODR_CD();
              csvStr[17] = tempStruct.getWORK_IN_PROC_CD();
              csvStr[18] = TypeConverter.convert(tempStruct.getPARTIAL_PRD_NO());
              csvStr[19] = TypeConverter.convert(tempStruct.getOPR_RSLT_CRCT_NO());
              csvStr[20] = TypeConverter.convert(tempStruct.getPUCH_ODR_CD());
              csvStr[21] = TypeConverter.convert(tempStruct.getACPT_NO());
              csvStr[22] = TypeConverter.convert(tempStruct.getACPT_RSLT_CRCT_NO());
              csvStr[23] = TypeConverter.convert(tempStruct.getINSPEC_RSLT_CRCT_NO());
              csvStr[24] = tempStruct.getISSUE_INST_CD();
              csvStr[25] = TypeConverter.convert(tempStruct.getRCV_ISSUE_CMPLT_FLG());
              csvStr[26] = tempStruct.getRCV_ISSUE_CMPLT_NAME();
              
              csvStr[27] = TypeConverter.convert(tempStruct.getMRP_ODR_TYP());
              csvStr[28] = tempStruct.getMRP_ODR_NAME();
              
              csvStr[29] = TypeConverter.convert(tempStruct.getRCV_ISSUE_CTRL_CD());
              csvStr[30] = TypeConverter.convert(tempStruct.getSTOCK_UPD_TYP());
              csvStr[31] = tempStruct.getSTOCK_UPD_NAME();
              
              csvStr[32] = tempStruct.getLOT_NO();
              csvStr[33] = tempStruct.getVEND_LOT_NO();
              csvStr[34] = tempStruct.getRCV_ISSUE_COMMENT();
              csvStr[35] = tempStruct.getCREATED_DATE();
              csvStr[36] = tempStruct.getCREATED_BY();
              csvList.add(csvStr);
			}
			
			// CSV作成
			csvWriter.write(csvList, CoreTools.getLocale(struct.getsUser_ID()),true);
			strFilePath = csvWriter.getFilePath();
			
			logMessage = "Generated CSV-data.";
			setSyslogConfig(logMessage);
			
			// 出力ファイルパス設定
			struct.setDOWNLOAD_FILE(strFilePath);
			
			// 表示行数オーバでのＣＳＶ出力の場合は表示用リストをクリアする
			if(getReadStatus() == TOO_MANY){
				this.list.clear();
			}

        }catch(Exception e){
			ExpjMessage msg = new ExpjMessage( "ZZ01006", "CSV output failure" );
			sysLog.warning(msg, getsysUSER_CD());

			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);

			throw ee;
        }
		//------------------------------------------------------------------
                //}}user_implement_dev:<controlcsv>
		logger.exiting("AG0020010Control"+":USER="+struct.getsUser_ID(),"controlcsv");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlclear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AG0020");
		logger.entering("AG0020010Control"+":USER="+struct.getsUser_ID(),"controlclear");
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

		// ログインユーザの工場コードを設定
		struct.setw_PLANT_CD(sysPLANT_CD);
		
		// モード設定
		setReadStatus(INITIAL);

		//------------------------------------------------------------------
                //}}user_implement_dev:<controlclear>
		logger.exiting("AG0020010Control"+":USER="+struct.getsUser_ID(),"controlclear");

		return;
	}

	/**
	 * ロットトレース参照ボタン押下時に実行される処理です。
	 *
	 */
	public void controlSelectLotTraceRef() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AG0020");
		logger.entering("AG0020010Control"+":USER="+struct.getsUser_ID(),"controlSelectLotTraceRef");
			//{{user_implement_dev:<controlSelectLotTraceRef>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlSelectLotTraceRef>
		logger.exiting("AG0020010Control"+":USER="+struct.getsUser_ID(),"controlSelectLotTraceRef");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AG0020");
		logger.entering("AG0020010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
		//------------------------------------------------------------------
		// ユーザ定義初期化
		usersInitialize();
		//------------------------------------------------------------------
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AG0020010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AG0020");
		logger.entering("AG0020010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
		//------------------------------------------------------------------
		// ユーザ定義初期化
		usersInitialize();
		
		// ログインユーザの工場コードを設定
		struct.setw_PLANT_CD(sysPLANT_CD);
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
		
		//------------------------------------------------------------------
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AG0020010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * イベントハンドラの前処理です。
	 *
	 * @param buttun ボタン名
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AG0020");
		logger.entering("AG0020010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");
		struct.setDOWNLOAD_FILE((String)null);	// ダウンロードファイル名クリア

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
			struct.setDOWNLOAD_FILE((String)null);
			// コンボボックス部品のデータのセットはここに記述してください。
			// コンボボックスデータ用意
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("AG0020010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("csv") ) {
				controlcsv();
			} else if( button.equals("clear") ) {
				controlclear();
			} else if( button.equals("SelectLotTraceRef") ) {
				controlSelectLotTraceRef();
			} else if( button.equals("initial") ) {
				controlINITIAL();
			} else if( button.equals("reload") ) {
				controlRELOAD();
			}
		//{{user_implement_dev:<control_eventHandller>
		//------------------------------------------------------------------
		//コンボボックスに取得データ設定
		struct.setList_MRP_ODR_TYP_val(_MRP_ODR_TYP.getValList());
		struct.setList_MRP_ODR_TYP_name(_MRP_ODR_TYP.getExplanList());
		struct.setList_RCV_ISSUE_TYP_val(_RCV_ISSUE_TYP.getValList());
		struct.setList_RCV_ISSUE_TYP_name(_RCV_ISSUE_TYP.getExplanList());
		struct.setList_RCV_ISSUE_GNR_TYP_val(_RCV_ISSUE_GNR_TYP.getValList());
		struct.setList_RCV_ISSUE_GNR_TYP_name(_RCV_ISSUE_GNR_TYP.getExplanList());
		struct.setList_STOCK_UPD_TYP_val(_STOCK_UPD_TYP.getValList());
		struct.setList_STOCK_UPD_TYP_name(_STOCK_UPD_TYP.getExplanList());
		struct.setList_RCV_ISSUE_CMPLT_FLG_val(_RCV_ISSUE_CMPLT_FLG.getValList());
		struct.setList_RCV_ISSUE_CMPLT_FLG_name(_RCV_ISSUE_CMPLT_FLG.getExplanList());
		struct.seth_lotCtrl(lotctrl);
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
//			throw new FoundationException("AG0020010Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AG0020010-E999","CSVの出力処理"));
			throw new FoundationException("AG0020010Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AG0020010-E999","システム日付の取得処理"));
				throw new FoundationException("AG0020010Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AG0020010-E999","コントロールのイベント処理"));
			throw new FoundationException("AG0020010Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected AG0020010Entity entity;
	protected AG0020010Struct struct;
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

		entity = new AG0020010Entity();
		struct = new AG0020010Struct();

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
	 * AG0020010クラスの標準コンストラクタ
	 */
	public AG0020010Control() throws BusinessProcessException, FoundationException
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
				AG0020010Struct key = (AG0020010Struct)keyList.get(j);
				// メッセージキーを作成する
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("r_SELECT_CHOICE1") && key.getr_SELECT_CHOICE1() != null) {
					msgKey.setKeyValue("r_SELECT_CHOICE1", key.getr_SELECT_CHOICE1());
				}
				if(msgKeyType.containsKeyColumn("r_SELECT_CHOICE2") && key.getr_SELECT_CHOICE2() != null) {
					msgKey.setKeyValue("r_SELECT_CHOICE2", key.getr_SELECT_CHOICE2());
				}
				if(msgKeyType.containsKeyColumn("r_SELECT_CHOICE3") && key.getr_SELECT_CHOICE3() != null) {
					msgKey.setKeyValue("r_SELECT_CHOICE3", key.getr_SELECT_CHOICE3());
				}
				if(msgKeyType.containsKeyColumn("r_SELECT_CHOICE") && key.getr_SELECT_CHOICE() != null) {
					msgKey.setKeyValue("r_SELECT_CHOICE", key.getr_SELECT_CHOICE());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_CMPLT_NAME") && key.getRCV_ISSUE_CMPLT_NAME() != null) {
					msgKey.setKeyValue("RCV_ISSUE_CMPLT_NAME", key.getRCV_ISSUE_CMPLT_NAME());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_GNR_NAME") && key.getRCV_ISSUE_GNR_NAME() != null) {
					msgKey.setKeyValue("RCV_ISSUE_GNR_NAME", key.getRCV_ISSUE_GNR_NAME());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UPD_NAME") && key.getSTOCK_UPD_NAME() != null) {
					msgKey.setKeyValue("STOCK_UPD_NAME", key.getSTOCK_UPD_NAME());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_NAME") && key.getMRP_ODR_NAME() != null) {
					msgKey.setKeyValue("MRP_ODR_NAME", key.getMRP_ODR_NAME());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_NAME") && key.getRCV_ISSUE_NAME() != null) {
					msgKey.setKeyValue("RCV_ISSUE_NAME", key.getRCV_ISSUE_NAME());
				}
				if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE") && key.getDOWNLOAD_FILE() != null) {
					msgKey.setKeyValue("DOWNLOAD_FILE", key.getDOWNLOAD_FILE());
				}
				if(msgKeyType.containsKeyColumn("l_check") && key.getl_check() != null) {
					msgKey.setKeyValue("l_check", key.getl_check());
				}
				if(msgKeyType.containsKeyColumn("h_lotCtrl") && key.geth_lotCtrl() != null) {
					msgKey.setKeyValue("h_lotCtrl", key.geth_lotCtrl());
				}
				if(msgKeyType.containsKeyColumn("w_CHOICE") && key.getw_CHOICE() != null) {
					msgKey.setKeyValue("w_CHOICE", key.getw_CHOICE());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP_val") && key.getMRP_ODR_TYP_val() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP_val", key.getMRP_ODR_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP_name") && key.getMRP_ODR_TYP_name() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP_name", key.getMRP_ODR_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_TYP_val") && key.getRCV_ISSUE_TYP_val() != null) {
					msgKey.setKeyValue("RCV_ISSUE_TYP_val", key.getRCV_ISSUE_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_TYP_name") && key.getRCV_ISSUE_TYP_name() != null) {
					msgKey.setKeyValue("RCV_ISSUE_TYP_name", key.getRCV_ISSUE_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_GNR_TYP_val") && key.getRCV_ISSUE_GNR_TYP_val() != null) {
					msgKey.setKeyValue("RCV_ISSUE_GNR_TYP_val", key.getRCV_ISSUE_GNR_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_GNR_TYP_name") && key.getRCV_ISSUE_GNR_TYP_name() != null) {
					msgKey.setKeyValue("RCV_ISSUE_GNR_TYP_name", key.getRCV_ISSUE_GNR_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UPD_TYP_val") && key.getSTOCK_UPD_TYP_val() != null) {
					msgKey.setKeyValue("STOCK_UPD_TYP_val", key.getSTOCK_UPD_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UPD_TYP_name") && key.getSTOCK_UPD_TYP_name() != null) {
					msgKey.setKeyValue("STOCK_UPD_TYP_name", key.getSTOCK_UPD_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_CMPLT_FLG_val") && key.getRCV_ISSUE_CMPLT_FLG_val() != null) {
					msgKey.setKeyValue("RCV_ISSUE_CMPLT_FLG_val", key.getRCV_ISSUE_CMPLT_FLG_val());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_CMPLT_FLG_name") && key.getRCV_ISSUE_CMPLT_FLG_name() != null) {
					msgKey.setKeyValue("RCV_ISSUE_CMPLT_FLG_name", key.getRCV_ISSUE_CMPLT_FLG_name());
				}
				if(msgKeyType.containsKeyColumn("h_PLANT_CD") && key.geth_PLANT_CD() != null) {
					msgKey.setKeyValue("h_PLANT_CD", key.geth_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_CTRL_CD") && key.getRCV_ISSUE_CTRL_CD() != null) {
					msgKey.setKeyValue("RCV_ISSUE_CTRL_CD", key.getRCV_ISSUE_CTRL_CD());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_TYP") && key.getRCV_ISSUE_TYP() != null) {
					msgKey.setKeyValue("RCV_ISSUE_TYP", key.getRCV_ISSUE_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_CD") && key.getJOB_ODR_CD() != null) {
					msgKey.setKeyValue("JOB_ODR_CD", key.getJOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("WH_CD") && key.getWH_CD() != null) {
					msgKey.setKeyValue("WH_CD", key.getWH_CD());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_CD") && key.getPUCH_ODR_CD() != null) {
					msgKey.setKeyValue("PUCH_ODR_CD", key.getPUCH_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("ACPT_NO") && key.getACPT_NO() != null) {
					msgKey.setKeyValue("ACPT_NO", key.getACPT_NO().toString());
				}
				if(msgKeyType.containsKeyColumn("ACPT_RSLT_CRCT_NO") && key.getACPT_RSLT_CRCT_NO() != null) {
					msgKey.setKeyValue("ACPT_RSLT_CRCT_NO", key.getACPT_RSLT_CRCT_NO().toString());
				}
				if(msgKeyType.containsKeyColumn("INSPEC_RSLT_CRCT_NO") && key.getINSPEC_RSLT_CRCT_NO() != null) {
					msgKey.setKeyValue("INSPEC_RSLT_CRCT_NO", key.getINSPEC_RSLT_CRCT_NO().toString());
				}
				if(msgKeyType.containsKeyColumn("WORK_ODR_CD") && key.getWORK_ODR_CD() != null) {
					msgKey.setKeyValue("WORK_ODR_CD", key.getWORK_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("WORK_IN_PROC_CD") && key.getWORK_IN_PROC_CD() != null) {
					msgKey.setKeyValue("WORK_IN_PROC_CD", key.getWORK_IN_PROC_CD());
				}
				if(msgKeyType.containsKeyColumn("PARTIAL_PRD_NO") && key.getPARTIAL_PRD_NO() != null) {
					msgKey.setKeyValue("PARTIAL_PRD_NO", key.getPARTIAL_PRD_NO().toString());
				}
				if(msgKeyType.containsKeyColumn("OPR_RSLT_CRCT_NO") && key.getOPR_RSLT_CRCT_NO() != null) {
					msgKey.setKeyValue("OPR_RSLT_CRCT_NO", key.getOPR_RSLT_CRCT_NO().toString());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_INST_CD") && key.getISSUE_INST_CD() != null) {
					msgKey.setKeyValue("ISSUE_INST_CD", key.getISSUE_INST_CD());
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
				if(msgKeyType.containsKeyColumn("DEFECT_CAUSE_CD") && key.getDEFECT_CAUSE_CD() != null) {
					msgKey.setKeyValue("DEFECT_CAUSE_CD", key.getDEFECT_CAUSE_CD());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UPD_TYP") && key.getSTOCK_UPD_TYP() != null) {
					msgKey.setKeyValue("STOCK_UPD_TYP", key.getSTOCK_UPD_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_CMPLT_FLG") && key.getRCV_ISSUE_CMPLT_FLG() != null) {
					msgKey.setKeyValue("RCV_ISSUE_CMPLT_FLG", key.getRCV_ISSUE_CMPLT_FLG().toString());
				}
				if(msgKeyType.containsKeyColumn("CREATED_DATE") && key.getCREATED_DATE() != null) {
					msgKey.setKeyValue("CREATED_DATE", key.getCREATED_DATE());
				}
				if(msgKeyType.containsKeyColumn("CREATED_BY") && key.getCREATED_BY() != null) {
					msgKey.setKeyValue("CREATED_BY", key.getCREATED_BY());
				}
				if(msgKeyType.containsKeyColumn("ITEM_NAME") && key.getITEM_NAME() != null) {
					msgKey.setKeyValue("ITEM_NAME", key.getITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP") && key.getMRP_ODR_TYP() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP", key.getMRP_ODR_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("WH_NAME") && key.getWH_NAME() != null) {
					msgKey.setKeyValue("WH_NAME", key.getWH_NAME());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_BEFORE_QTY") && key.getRCV_ISSUE_BEFORE_QTY() != null) {
					msgKey.setKeyValue("RCV_ISSUE_BEFORE_QTY", key.getRCV_ISSUE_BEFORE_QTY());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_AFTER_QTY") && key.getRCV_ISSUE_AFTER_QTY() != null) {
					msgKey.setKeyValue("RCV_ISSUE_AFTER_QTY", key.getRCV_ISSUE_AFTER_QTY());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("NON_PLANNED_CAUSE_CD") && key.getNON_PLANNED_CAUSE_CD() != null) {
					msgKey.setKeyValue("NON_PLANNED_CAUSE_CD", key.getNON_PLANNED_CAUSE_CD());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT") && key.getSTOCK_UNIT() != null) {
					msgKey.setKeyValue("STOCK_UNIT", key.getSTOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("VEND_CD") && key.getVEND_CD() != null) {
					msgKey.setKeyValue("VEND_CD", key.getVEND_CD());
				}
				if(msgKeyType.containsKeyColumn("VEND_NAME") && key.getVEND_NAME() != null) {
					msgKey.setKeyValue("VEND_NAME", key.getVEND_NAME());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_COMMENT") && key.getRCV_ISSUE_COMMENT() != null) {
					msgKey.setKeyValue("RCV_ISSUE_COMMENT", key.getRCV_ISSUE_COMMENT());
				}
				if(msgKeyType.containsKeyColumn("LOT_NO") && key.getLOT_NO() != null) {
					msgKey.setKeyValue("LOT_NO", key.getLOT_NO());
				}
				if(msgKeyType.containsKeyColumn("VEND_LOT_NO") && key.getVEND_LOT_NO() != null) {
					msgKey.setKeyValue("VEND_LOT_NO", key.getVEND_LOT_NO());
				}
				if(msgKeyType.containsKeyColumn("l_SHIP_ITEM_CD") && key.getl_SHIP_ITEM_CD() != null) {
					msgKey.setKeyValue("l_SHIP_ITEM_CD", key.getl_SHIP_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("l_INV_LOT_NO") && key.getl_INV_LOT_NO() != null) {
					msgKey.setKeyValue("l_INV_LOT_NO", key.getl_INV_LOT_NO());
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
				if(msgKeyType.containsKeyColumn("w_FROM_DATE") && key.getw_FROM_DATE() != null) {
					msgKey.setKeyValue("w_FROM_DATE", key.getw_FROM_DATE());
				}
				if(msgKeyType.containsKeyColumn("w_TO_DATE") && key.getw_TO_DATE() != null) {
					msgKey.setKeyValue("w_TO_DATE", key.getw_TO_DATE());
				}
				if(msgKeyType.containsKeyColumn("w_PLANT_CD") && key.getw_PLANT_CD() != null) {
					msgKey.setKeyValue("w_PLANT_CD", key.getw_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("w_VEND_CD") && key.getw_VEND_CD() != null) {
					msgKey.setKeyValue("w_VEND_CD", key.getw_VEND_CD());
				}
				if(msgKeyType.containsKeyColumn("w_LOT_NO") && key.getw_LOT_NO() != null) {
					msgKey.setKeyValue("w_LOT_NO", key.getw_LOT_NO());
				}
				if(msgKeyType.containsKeyColumn("w_check") && key.getw_check() != null) {
					msgKey.setKeyValue("w_check", key.getw_check());
				}
				if(msgKeyType.containsKeyColumn("w_WH_PLANT_CD") && key.getw_WH_PLANT_CD() != null) {
					msgKey.setKeyValue("w_WH_PLANT_CD", key.getw_WH_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("w_WH_NAME") && key.getw_WH_NAME() != null) {
					msgKey.setKeyValue("w_WH_NAME", key.getw_WH_NAME());
				}
				if(msgKeyType.containsKeyColumn("w_PLANT_NAME") && key.getw_PLANT_NAME() != null) {
					msgKey.setKeyValue("w_PLANT_NAME", key.getw_PLANT_NAME());
				}
				if(msgKeyType.containsKeyColumn("w_VEND_NAME") && key.getw_VEND_NAME() != null) {
					msgKey.setKeyValue("w_VEND_NAME", key.getw_VEND_NAME());
				}
				if(msgKeyType.containsKeyColumn("w_ITEM_NAME") && key.getw_ITEM_NAME() != null) {
					msgKey.setKeyValue("w_ITEM_NAME", key.getw_ITEM_NAME());
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
					AG0020010Struct key = new AG0020010Struct();
					if(msgKeyType.containsKeyColumn("r_SELECT_CHOICE1")) {
						key.setr_SELECT_CHOICE1(msgKey.getKeyValue("r_SELECT_CHOICE1"));
					}
					if(msgKeyType.containsKeyColumn("r_SELECT_CHOICE2")) {
						key.setr_SELECT_CHOICE2(msgKey.getKeyValue("r_SELECT_CHOICE2"));
					}
					if(msgKeyType.containsKeyColumn("r_SELECT_CHOICE3")) {
						key.setr_SELECT_CHOICE3(msgKey.getKeyValue("r_SELECT_CHOICE3"));
					}
					if(msgKeyType.containsKeyColumn("r_SELECT_CHOICE")) {
						key.setr_SELECT_CHOICE(msgKey.getKeyValue("r_SELECT_CHOICE"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_CMPLT_NAME")) {
						key.setRCV_ISSUE_CMPLT_NAME(msgKey.getKeyValue("RCV_ISSUE_CMPLT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_GNR_NAME")) {
						key.setRCV_ISSUE_GNR_NAME(msgKey.getKeyValue("RCV_ISSUE_GNR_NAME"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UPD_NAME")) {
						key.setSTOCK_UPD_NAME(msgKey.getKeyValue("STOCK_UPD_NAME"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_NAME")) {
						key.setMRP_ODR_NAME(msgKey.getKeyValue("MRP_ODR_NAME"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_NAME")) {
						key.setRCV_ISSUE_NAME(msgKey.getKeyValue("RCV_ISSUE_NAME"));
					}
					if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE")) {
						key.setDOWNLOAD_FILE(msgKey.getKeyValue("DOWNLOAD_FILE"));
					}
					if(msgKeyType.containsKeyColumn("l_check")) {
						key.setl_check(msgKey.getKeyValue("l_check"));
					}
					if(msgKeyType.containsKeyColumn("h_lotCtrl")) {
						key.seth_lotCtrl(msgKey.getKeyValue("h_lotCtrl"));
					}
					if(msgKeyType.containsKeyColumn("w_CHOICE")) {
						key.setw_CHOICE(msgKey.getKeyValue("w_CHOICE"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP_val")) {
						key.setMRP_ODR_TYP_val(msgKey.getKeyValue("MRP_ODR_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP_name")) {
						key.setMRP_ODR_TYP_name(msgKey.getKeyValue("MRP_ODR_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_TYP_val")) {
						key.setRCV_ISSUE_TYP_val(msgKey.getKeyValue("RCV_ISSUE_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_TYP_name")) {
						key.setRCV_ISSUE_TYP_name(msgKey.getKeyValue("RCV_ISSUE_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_GNR_TYP_val")) {
						key.setRCV_ISSUE_GNR_TYP_val(msgKey.getKeyValue("RCV_ISSUE_GNR_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_GNR_TYP_name")) {
						key.setRCV_ISSUE_GNR_TYP_name(msgKey.getKeyValue("RCV_ISSUE_GNR_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UPD_TYP_val")) {
						key.setSTOCK_UPD_TYP_val(msgKey.getKeyValue("STOCK_UPD_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UPD_TYP_name")) {
						key.setSTOCK_UPD_TYP_name(msgKey.getKeyValue("STOCK_UPD_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_CMPLT_FLG_val")) {
						key.setRCV_ISSUE_CMPLT_FLG_val(msgKey.getKeyValue("RCV_ISSUE_CMPLT_FLG_val"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_CMPLT_FLG_name")) {
						key.setRCV_ISSUE_CMPLT_FLG_name(msgKey.getKeyValue("RCV_ISSUE_CMPLT_FLG_name"));
					}
					if(msgKeyType.containsKeyColumn("h_PLANT_CD")) {
						key.seth_PLANT_CD(msgKey.getKeyValue("h_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_CTRL_CD")) {
						key.setRCV_ISSUE_CTRL_CD(msgKey.getKeyValue("RCV_ISSUE_CTRL_CD"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_TYP")) {
						key.setRCV_ISSUE_TYP(new Integer(msgKey.getKeyValue("RCV_ISSUE_TYP")));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_CD")) {
						key.setJOB_ODR_CD(msgKey.getKeyValue("JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("WH_CD")) {
						key.setWH_CD(msgKey.getKeyValue("WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_CD")) {
						key.setPUCH_ODR_CD(msgKey.getKeyValue("PUCH_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("ACPT_NO")) {
						key.setACPT_NO(new Integer(msgKey.getKeyValue("ACPT_NO")));
					}
					if(msgKeyType.containsKeyColumn("ACPT_RSLT_CRCT_NO")) {
						key.setACPT_RSLT_CRCT_NO(new Integer(msgKey.getKeyValue("ACPT_RSLT_CRCT_NO")));
					}
					if(msgKeyType.containsKeyColumn("INSPEC_RSLT_CRCT_NO")) {
						key.setINSPEC_RSLT_CRCT_NO(new Integer(msgKey.getKeyValue("INSPEC_RSLT_CRCT_NO")));
					}
					if(msgKeyType.containsKeyColumn("WORK_ODR_CD")) {
						key.setWORK_ODR_CD(msgKey.getKeyValue("WORK_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("WORK_IN_PROC_CD")) {
						key.setWORK_IN_PROC_CD(msgKey.getKeyValue("WORK_IN_PROC_CD"));
					}
					if(msgKeyType.containsKeyColumn("PARTIAL_PRD_NO")) {
						key.setPARTIAL_PRD_NO(new Integer(msgKey.getKeyValue("PARTIAL_PRD_NO")));
					}
					if(msgKeyType.containsKeyColumn("OPR_RSLT_CRCT_NO")) {
						key.setOPR_RSLT_CRCT_NO(new Integer(msgKey.getKeyValue("OPR_RSLT_CRCT_NO")));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_INST_CD")) {
						key.setISSUE_INST_CD(msgKey.getKeyValue("ISSUE_INST_CD"));
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
					if(msgKeyType.containsKeyColumn("DEFECT_CAUSE_CD")) {
						key.setDEFECT_CAUSE_CD(msgKey.getKeyValue("DEFECT_CAUSE_CD"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UPD_TYP")) {
						key.setSTOCK_UPD_TYP(new Integer(msgKey.getKeyValue("STOCK_UPD_TYP")));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_CMPLT_FLG")) {
						key.setRCV_ISSUE_CMPLT_FLG(new Integer(msgKey.getKeyValue("RCV_ISSUE_CMPLT_FLG")));
					}
					if(msgKeyType.containsKeyColumn("CREATED_DATE")) {
						key.setCREATED_DATE(msgKey.getKeyValue("CREATED_DATE"));
					}
					if(msgKeyType.containsKeyColumn("CREATED_BY")) {
						key.setCREATED_BY(msgKey.getKeyValue("CREATED_BY"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_NAME")) {
						key.setITEM_NAME(msgKey.getKeyValue("ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP")) {
						key.setMRP_ODR_TYP(new Integer(msgKey.getKeyValue("MRP_ODR_TYP")));
					}
					if(msgKeyType.containsKeyColumn("WH_NAME")) {
						key.setWH_NAME(msgKey.getKeyValue("WH_NAME"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_BEFORE_QTY")) {
						key.setRCV_ISSUE_BEFORE_QTY(msgKey.getKeyValue("RCV_ISSUE_BEFORE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_AFTER_QTY")) {
						key.setRCV_ISSUE_AFTER_QTY(msgKey.getKeyValue("RCV_ISSUE_AFTER_QTY"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("NON_PLANNED_CAUSE_CD")) {
						key.setNON_PLANNED_CAUSE_CD(msgKey.getKeyValue("NON_PLANNED_CAUSE_CD"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT")) {
						key.setSTOCK_UNIT(msgKey.getKeyValue("STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("VEND_CD")) {
						key.setVEND_CD(msgKey.getKeyValue("VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("VEND_NAME")) {
						key.setVEND_NAME(msgKey.getKeyValue("VEND_NAME"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_COMMENT")) {
						key.setRCV_ISSUE_COMMENT(msgKey.getKeyValue("RCV_ISSUE_COMMENT"));
					}
					if(msgKeyType.containsKeyColumn("LOT_NO")) {
						key.setLOT_NO(msgKey.getKeyValue("LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("VEND_LOT_NO")) {
						key.setVEND_LOT_NO(msgKey.getKeyValue("VEND_LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_SHIP_ITEM_CD")) {
						key.setl_SHIP_ITEM_CD(msgKey.getKeyValue("l_SHIP_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_INV_LOT_NO")) {
						key.setl_INV_LOT_NO(msgKey.getKeyValue("l_INV_LOT_NO"));
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
					if(msgKeyType.containsKeyColumn("w_FROM_DATE")) {
						key.setw_FROM_DATE(msgKey.getKeyValue("w_FROM_DATE"));
					}
					if(msgKeyType.containsKeyColumn("w_TO_DATE")) {
						key.setw_TO_DATE(msgKey.getKeyValue("w_TO_DATE"));
					}
					if(msgKeyType.containsKeyColumn("w_PLANT_CD")) {
						key.setw_PLANT_CD(msgKey.getKeyValue("w_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_VEND_CD")) {
						key.setw_VEND_CD(msgKey.getKeyValue("w_VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_LOT_NO")) {
						key.setw_LOT_NO(msgKey.getKeyValue("w_LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("w_check")) {
						key.setw_check(msgKey.getKeyValue("w_check"));
					}
					if(msgKeyType.containsKeyColumn("w_WH_PLANT_CD")) {
						key.setw_WH_PLANT_CD(msgKey.getKeyValue("w_WH_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_WH_NAME")) {
						key.setw_WH_NAME(msgKey.getKeyValue("w_WH_NAME"));
					}
					if(msgKeyType.containsKeyColumn("w_PLANT_NAME")) {
						key.setw_PLANT_NAME(msgKey.getKeyValue("w_PLANT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("w_VEND_NAME")) {
						key.setw_VEND_NAME(msgKey.getKeyValue("w_VEND_NAME"));
					}
					if(msgKeyType.containsKeyColumn("w_ITEM_NAME")) {
						key.setw_ITEM_NAME(msgKey.getKeyValue("w_ITEM_NAME"));
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
