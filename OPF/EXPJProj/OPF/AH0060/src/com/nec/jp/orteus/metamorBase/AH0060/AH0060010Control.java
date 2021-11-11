/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AH0060/src/com/nec/jp/orteus/metamorBase/AH0060/AH0060010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AH0060;

import com.nec.jp.orteus.metamorBase.AH0060.*;
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
import java.io.*;
import jp.co.fit.vfreport.*;
//{{user_implement_code_import
	// TODO: ここにimportパッケージを記述してください
import com.nec.jp.orteus.metamorBase.common01.Inventry.InvAccessor;
import com.nec.jp.orteus.metamorBase.common08.LotCtrl.LotCtrl;
import com.nec.jp.orteus.metamorBase.util.AlarmMessage.AlarmMessageException;
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AH0060010Control
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
	protected List list;											// 結果リストのインスタンス
	public List getList() { return this.list; }						// リストを返します。
	public void setList(List listname) { this.list = listname; }	// リストをセットします。
	public int getListsize() {										// リスト型のサイズを返します。
		int nret = 0;
		if( this.list != null ) {nret = this.list.size();}
		return nret;
	}
	public Object getListvalue(int x) { return this.list.get(x); }	// リストの値（メディエータ）を返します。

	public AH0060010Struct getStruct() { return this.struct; }	// Structの値（メディエータ）を返します。

	// CSV出力用リスト
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }

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

	/**
	 * SQLExceptionメッセージ設定
	 * @param SQLException
	 */
	private void setSqlExceptionMsg(SQLException e) throws ExpjException
	{
		// エラーメッセージ作成
		ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
		sysLog.severe(emsg, getsysUSER_CD());//致命的エラー エラー内容
		ExpjException ee = new ExpjException(e, emsg); // エクセプションを生成
		throw ee;
	}

	/**
	 * 情報メッセージ設定
	 * @param メッセージ番号
	 * @param 出力メッセージ
	 */
	private void setInfoMessage(String key)
	{
		ExpjMessage emsg = new ExpjMessage( "ZZ01006", key );
		msgStruct.addInfo( emsg );	// 情報メッセージとして登録
		sysLog.config(emsg, getsysUSER_CD()); //情報詳細
	}

	/**
	 * 情報メッセージ設定
	 * @param 出力メッセージ
	 */
	private void setSyslogConfig(String key)
	{
		ExpjMessage emsg = new ExpjMessage( "ZZ01006", key );
		sysLog.config(emsg, getsysUSER_CD()); //情報詳細
	}

	/**
	 * エラーメッセージ設定
	 * @param	code	メッセージ番号
	 */
	private void setErrorMessage(String code)
	{
		ExpjMessage emsg = new ExpjMessage(code);
		msgStruct.addError(emsg);
		sysLog.warning(emsg, getsysUSER_CD());
	}

	/**
	 * エラー発生時パラメータ設定
	 * @param	key		パラメータ
	 */
	private void setErrorParameter(String key)
	{
		ExpjMessage emsg = new ExpjMessage("ZZ01006", key);
		msgStruct.addError(emsg);
		sysLog.warning(emsg, getsysUSER_CD());
	}

	/**
	 * Exceptionエラーメッセージ設定
	 * @param	code	メッセージ番号
	 * @return	ExpjMessage
	 */
	private ExpjMessage setExceptionMessage(String code)
	{
		ExpjMessage emsg = new ExpjMessage(code);
		sysLog.severe(emsg, getsysUSER_CD());
		return emsg;
	}

	/**
	 * Exceptionエラー発生時パラメータ設定
	 * @param	key		パラメータ
	 */
	private void setExceptionParameter(String key)
	{
		ExpjMessage emsg = new ExpjMessage("ZZ01006", key);
		sysLog.severe(emsg, getsysUSER_CD());
	}

	//------------------------------------------------------------------

	/**
	 * 表示最大行数制限処理
	 *
	 * @param key アクセスキー
	 * @param size 対象行数
	 * @return 異常なし true エラー false
	 */
	private boolean checkMaxDispLine(int key, int size) throws FoundationException, SQLException
	{
		ScreenParam sp = new ScreenParam(this.getClass());
		int maxLine = sp.getMaxLine(conn,key);
		if(maxLine != 0 && size > maxLine)
		{
			ExpjMessage emsg = new ExpjMessage( "ZZ01115", ""+maxLine );
			msgStruct.addError( emsg );
			sysLog.warning(emsg, getsysUSER_CD());
			return false;
		}
		return true;
	}

	//---------- ＣＳＶ出力関連の処理 ---------------------------------------------------

	private List _csvList = new ArrayList(0);
	public List getCsvList(){ return _csvList; }
	public void setCsvList(List list){ _csvList = list; }

	//---------- 帳票出力関連の処理 ---------------------------------------------------

	/** フォーム識別ID（品目在庫－品目順） */
	private final String FORMID_ITEMSTOCK_ITEM		= "1";
	/** フォーム識別ID（製番在庫－品目順） */
	private final String FORMID_JOBODRCDSTOCK_ITEM	= "2";
	/** フォーム識別ID（品目在庫－保管区順） */
	private final String FORMID_ITEMSTOCK_WH		= "3";
	/** フォーム識別ID（製番在庫－保管区順） */
	private final String FORMID_JOBODRCDSTOCK_WH	= "4";
	/** フォーム識別ID（ロット在庫－品目区順） */
	private final String FORMID_LOTSTOCK_ITEM		= "5";
	/** フォーム識別ID（ロット在庫－保管区順） */
	private final String FORMID_LOTSTOCK_WH     	= "6";

	//------------------------------------------------------------------

	/** 実棚一覧専用クラスオブジェクト */
	AH0060Common _common = null;

	/** 棚卸情報取得用クラスオブジェクト */
	InvAccessor _invAccessor = null;

	/** 親画面パラメータ（最大表示行数）取得アクセスキー */
	private final int _DISPLAY_CD_PARENT = 10;

	/** 親画面struct情報一時退避用 */
	private AH0060010Struct _save_struct = new AH0060010Struct();

	/** 製番在庫指定フラグ */
	String _strJOB_ODR_CD_STOCK_flg = null;

	/** 表示順フラグ */
	String _strSortFlg = null;

	/** 一覧情報格納用リスト */
	List _listData = new ArrayList(0);

	/** 画面用「棚卸区分」コンボボックスデータ格納用 */
	private ComboStruct _comboAbcTyp = new ComboStruct();
	
	/** ロット管理導入済チェック用 */
	String lotCtrl;

	/**
	 * 画面用「棚卸区分」コンボボックスリストデータ設定
	 *
	 * @param	comboAbcTyp 棚卸区分コンボリストデータ
	 * @return	なし
	 */
	private void makeAbcTypComboData(ComboStruct comboAbcTyp)
	{
		_comboAbcTyp = new ComboStruct();
		_comboAbcTyp.addData("", "");// １件目に空白データ設定
		for(int i = 0; i < comboAbcTyp.size(); i++)
		{
			String[] str = comboAbcTyp.getData(i);
			if("9".equals(str[0]) == true)
			{
				// 棚卸区分が9のデータは追加しない
				continue;
			}
			_comboAbcTyp.addData(str[0], str[1]);
		}
	}

	/**
	 * 製番在庫指定フラグ取得
	 * @return 製番在庫指定フラグ
	 */
	private String getJOB_ODR_CD_STOCK_flg()
	{
		return _strJOB_ODR_CD_STOCK_flg;
	}

	/**
	 * 製番在庫指定フラグ設定
	 * @param 製番在庫指定フラグ
	 */
	private void setJOB_ODR_CD_STOCK_flg(String flg)
	{
		_strJOB_ODR_CD_STOCK_flg = flg;
	}

	/**
	 * 表示順フラグ取得
	 * @return 表示順フラグ
	 */
	private String getSortFlg()
	{
		return _strSortFlg;
	}

	/**
	 * 表示順フラグ設定
	 * @param 表示順フラグ
	 */
	private void setSortFlg(String flg)
	{
		_strSortFlg = flg;
	}

	/**
	 * 区分名取得（共通）
	 *
	 * @param	comboStruct	区分情報リスト
	 * @param	strTyp		区分コード
	 * @return	区分名称(該当するデータがなかった場合は区分コードを返す)
	 */
	private String getTypName(ComboStruct comboStruct, String strTyp)
	{
		String strTypName = strTyp;
		if((comboStruct != null) && (strTyp != null))
		{
			for(int i = 0; i < comboStruct.getValList().size(); i++)
			{
				if(strTyp.equals((String)(comboStruct.getValList().get(i))) == true)
				{
					strTypName = (String)(comboStruct.getExplanList().get(i));
					break;
				}
			}
		}
		return strTypName;
	}

	/**
	 * 棚卸制御データ読込処理
	 *
	 * @param target_struct 対象データ情報
	 * @return 異常なし 最新の読込情報 エラー null
	 */
	private AH0060010Struct readT_INV_CTRL(AH0060010Struct target_struct) throws FoundationException, SQLException
	{
		// 読込実行
		List read_list = new ArrayList(0);
		read_list = entity.mT_INV_CTRL.read(conn, target_struct);

		// レコード件数チェック
		if(read_list.size() <= 0)
		{
			// レコード件数が０(ゼロ)件の場合
			setErrorMessage("AH00021");
			setErrorParameter("T_INV_CTRL.INV_DATE:" + target_struct.getINV_DATE());
			setErrorParameter("T_INV_CTRL.PLANT_CD:" + target_struct.getPLANT_CD());
			return null;
		}

		// 読込情報取得
		AH0060010Struct read_struct = new AH0060010Struct();
		read_struct = (AH0060010Struct)read_list.get(0);

		// 棚卸状況文字列取得設定処理
		String strInvStatus = _invAccessor.getInvStatus(
			conn,
			read_struct.getREGULAR_INV_FLG(),
			read_struct.getCYCLE_INV_FLG(),
			read_struct.getTEMP_INV_FLG(),
			read_struct.getINV_STS_TYP(),
			CoreTools.getLocale(struct.getsUser_ID()));
		read_struct.setw_INV_status(strInvStatus);
		return read_struct;
	}

	/**
	 * 棚卸状態区分が0（棚卸実施前）でないかのチェック
	 *
	 * @param	target_struct 対象データ情報
	 * @return 異常なし true エラー false
	 */
	private boolean checkINV_STS_TYP_notequal0(AH0060010Struct target_struct)
	{
		// 結果フラグ初期化
		boolean bResult = true;
		if("0".equals(target_struct.getINV_STS_TYP()) == true)
		{
			// エラー
			bResult = false;

			// 棚卸状態区分が0（棚卸実施前）
			setErrorMessage("AH00023");
			setErrorParameter("T_INV_CTRL.INV_DATE:" + target_struct.getINV_DATE());
			setErrorParameter("T_INV_CTRL.PLANT_CD:" + getsysPLANT_CD());
			setErrorParameter("T_INV_CTRL.INV_STS_TYP:" + target_struct.getINV_STS_TYP());
		}
		return bResult;
	}

	/** 
	 * ＣＳＶ出力データ設定準備
	 *
	 * @param target_struct 対象データ情報
	 * @param listTarget	対象データリスト
	 * @param strKindStock	在庫種類（製番：1 品目：1以外）
	 * @return 異常なし true エラー false
	 */
	private boolean csvExport(AH0060010Struct target_struct, List listTarget, String strKindStock)
	{
		// 処理成功フラグ初期化
		boolean bSuccess = false;

		// 取得データがある場合のみ出力用リストへ取得リストを設定する
		if(listTarget != null && listTarget.size() > 0)
		{
			// 在庫種類によるＣＳＶ出力データ設定準備
			if("1".equals(strKindStock) == true)
			{
				// 実棚一覧表－製番
				csvExport4JobOdr(target_struct, listTarget);
			}
			else
			{
				if( struct.getr2_whlot1()!=null 
                        && (("1".equals(struct.getr2_whlot1()) == true)
                                || (struct.getr2_whlot1().equals("true")))){
					// 実棚一覧表－品目
					csvExport4Item(target_struct, listTarget);
				}
				else if (struct.getr2_whlot2()!=null 
                        && (("1".equals(struct.getr2_whlot2()) == true)
                                || (struct.getr2_whlot2().equals("true")))){
					// 実棚一覧表－ロット
					csvExport4Lot(target_struct, listTarget);
				}
			}

			// 処理成功
			bSuccess = true;
		}
		return bSuccess;
	}

	/**
	 * csv出力処理（品目）
	 *
	 * @param	target_struct 対象データ情報
	 * @param	listTarget 対象データリスト
	 * @return	なし
	 */
	private void csvExport4Item(AH0060010Struct target_struct, List listTarget)
	{
		// CSV情報の作成
		String title[] = {
			"Expj.INV_DATE" ,
			"Expj.PLANT_CD" ,
			"Expj.PLANT_NAME" ,
			"Expj.WH_CD" ,
			"Expj.WH_NAME" ,
			"Expj.ITEM_CD" ,
			"Expj.ITEM_NAME" ,
			"Expj.Cmt1118" ,
			"Expj.ACTUAL_STOCK_QTY" ,
			"Expj.STOCK_UNIT" ,
			"Expj.Cmt1040" ,
			"Expj.SAFETY_STOCK" ,
			"Expj.MRP_ODR_TYP" ,
			"Expj.ABC_TYP" ,
			"Expj.MRP_FLG" ,
			"Expj.WH_TYP" ,
			"Expj.VEND_CD" ,
			"Expj.Cmt1064" ,
			"Expj.Cmt1043" 
		};

		_csvList.add(title);
		for(int i=0; i < listTarget.size(); i++)
		{
			AH0060010Struct temp_struct = (AH0060010Struct)listTarget.get(i);

			String csvStr [] = new String[title.length];
			int cnt = 0;
			csvStr[cnt++] = temp_struct.getINV_DATE();
			csvStr[cnt++] = temp_struct.getPLANT_CD();
			csvStr[cnt++] = temp_struct.getPLANT_NAME();
			csvStr[cnt++] = temp_struct.getWH_CD();
			csvStr[cnt++] = temp_struct.getWH_NAME();
			csvStr[cnt++] = temp_struct.getITEM_CD();
			csvStr[cnt++] = temp_struct.getITEM_NAME();
			csvStr[cnt++] = temp_struct.getFINAL_BOOK_STOCK_QTY();
			csvStr[cnt++] = temp_struct.getACTUAL_STOCK_QTY();
			csvStr[cnt++] = temp_struct.getSTOCK_UNIT();
			csvStr[cnt++] = temp_struct.getdifference_rate();
			csvStr[cnt++] = temp_struct.getSAFETY_STOCK();
			csvStr[cnt++] = temp_struct.getw_MRP_ODR_TYP();
			csvStr[cnt++] = temp_struct.getw_ABC_TYP();
			csvStr[cnt++] = temp_struct.getw_MRP_FLG();
			csvStr[cnt++] = temp_struct.getw_WH_TYP();
			csvStr[cnt++] = temp_struct.getVEND_CD();
			csvStr[cnt++] = temp_struct.getVEND_ANAME();
			csvStr[cnt++] = target_struct.getSTOCK_SAVE_DATE();
			_csvList.add(csvStr);
		}
		return;
	}

	/**
	 * csv出力処理（製番）
	 *
	 * @param	target_struct 対象データ情報
	 * @param	listTarget 対象データリスト
	 * @return	なし
	 */
	private void csvExport4JobOdr(AH0060010Struct target_struct, List listTarget)
	{
		// CSV情報の作成
		String title[] = {
			"Expj.INV_DATE" ,
			"Expj.PLANT_CD" ,
			"Expj.PLANT_NAME" ,
			"Expj.WH_CD" ,
			"Expj.WH_NAME" ,
			"Expj.ITEM_CD" ,
			"Expj.ITEM_NAME" ,
			"Expj.JOB_ODR_CD" ,
			"Expj.Cmt1118" ,
			"Expj.ACTUAL_STOCK_QTY" ,
			"Expj.STOCK_UNIT" ,
			"Expj.Cmt1040" ,
			"Expj.SAFETY_STOCK" ,
			"Expj.MRP_ODR_TYP" ,
			"Expj.ABC_TYP" ,
			"Expj.MRP_FLG" ,
			"Expj.WH_TYP" ,
			"Expj.VEND_CD" ,
			"Expj.Cmt1064" ,
			"Expj.Cmt1043" 
		};

		_csvList.add(title);
		for(int i=0; i < listTarget.size(); i++)
		{
			AH0060010Struct temp_struct = (AH0060010Struct)listTarget.get(i);

			String csvStr [] = new String[title.length];
			int cnt = 0;
			csvStr[cnt++] = temp_struct.getINV_DATE();
			csvStr[cnt++] = temp_struct.getPLANT_CD();
			csvStr[cnt++] = temp_struct.getPLANT_NAME();
			csvStr[cnt++] = temp_struct.getWH_CD();
			csvStr[cnt++] = temp_struct.getWH_NAME();
			csvStr[cnt++] = temp_struct.getITEM_CD();
			csvStr[cnt++] = temp_struct.getITEM_NAME();
			csvStr[cnt++] = temp_struct.getJOB_ODR_CD();
			csvStr[cnt++] = temp_struct.getFINAL_BOOK_STOCK_QTY();
			csvStr[cnt++] = temp_struct.getACTUAL_STOCK_QTY();
			csvStr[cnt++] = temp_struct.getSTOCK_UNIT();
			csvStr[cnt++] = temp_struct.getdifference_rate();
			csvStr[cnt++] = temp_struct.getSAFETY_STOCK();
			csvStr[cnt++] = temp_struct.getw_MRP_ODR_TYP();
			csvStr[cnt++] = temp_struct.getw_ABC_TYP();
			csvStr[cnt++] = temp_struct.getw_MRP_FLG();
			csvStr[cnt++] = temp_struct.getw_WH_TYP();
			csvStr[cnt++] = temp_struct.getVEND_CD();
			csvStr[cnt++] = temp_struct.getVEND_ANAME();
			csvStr[cnt++] = target_struct.getSTOCK_SAVE_DATE();
			_csvList.add(csvStr);
		}
		return;
	}
	
	/**
	 * csv出力処理（ロット）
	 *
	 * @param	target_struct 対象データ情報
	 * @param	listTarget 対象データリスト
	 * @return	なし
	 */
	private void csvExport4Lot(AH0060010Struct target_struct, List listTarget)
	{
		// CSV情報の作成
		String title[] = {
			"Expj.INV_DATE" ,
			"Expj.PLANT_CD" ,
			"Expj.PLANT_NAME" ,
			"Expj.WH_CD" ,
			"Expj.WH_NAME" ,
			"Expj.ITEM_CD" ,
			"Expj.ITEM_NAME" ,
			"Expj.STOCK_LOT_CD" ,
			"Expj.Cmt1118" ,
			"Expj.ACTUAL_STOCK_QTY" ,
			"Expj.STOCK_UNIT" ,
			"Expj.Cmt1040" ,
			"Expj.SAFETY_STOCK" ,
			"Expj.MRP_ODR_TYP" ,
			"Expj.ABC_TYP" ,
			"Expj.MRP_FLG" ,
			"Expj.WH_TYP" ,
			"Expj.VEND_CD" ,
			"Expj.Cmt1064" ,
			"Expj.Cmt1043" 
		};

		_csvList.add(title);
		for(int i=0; i < listTarget.size(); i++)
		{
			AH0060010Struct temp_struct = (AH0060010Struct)listTarget.get(i);

			String csvStr [] = new String[title.length];
			int cnt = 0;
			csvStr[cnt++] = temp_struct.getINV_DATE();
			csvStr[cnt++] = temp_struct.getPLANT_CD();
			csvStr[cnt++] = temp_struct.getPLANT_NAME();
			csvStr[cnt++] = temp_struct.getWH_CD();
			csvStr[cnt++] = temp_struct.getWH_NAME();
			csvStr[cnt++] = temp_struct.getITEM_CD();
			csvStr[cnt++] = temp_struct.getITEM_NAME();
			csvStr[cnt++] = temp_struct.getl_STOCK_LOT_CD();
			csvStr[cnt++] = temp_struct.getFINAL_BOOK_STOCK_QTY();
			csvStr[cnt++] = temp_struct.getACTUAL_STOCK_QTY();
			csvStr[cnt++] = temp_struct.getSTOCK_UNIT();
			csvStr[cnt++] = temp_struct.getdifference_rate();
			csvStr[cnt++] = temp_struct.getSAFETY_STOCK();
			csvStr[cnt++] = temp_struct.getw_MRP_ODR_TYP();
			csvStr[cnt++] = temp_struct.getw_ABC_TYP();
			csvStr[cnt++] = temp_struct.getw_MRP_FLG();
			csvStr[cnt++] = temp_struct.getw_WH_TYP();
			csvStr[cnt++] = temp_struct.getVEND_CD();
			csvStr[cnt++] = temp_struct.getVEND_ANAME();
			csvStr[cnt++] = target_struct.getSTOCK_SAVE_DATE();
			_csvList.add(csvStr);
		}
		return;
	}
	
	/**
	 * pdf出力処理
	 *
	 * @param	svf				帳票ライブラリ設定情報
	 * @param	structTarget	対象データ情報
	 * @param	listTarget		対象データリスト
	 * @param	strKindStock	在庫種類（製番：1 品目：1以外）
	 * @return	true:成功 / false:失敗
	 */
	private boolean pdfExport(
		SvfWrapper svf,
		AH0060010Struct structTarget, 
		List listTarget,
		String strKindStock)
	{
		boolean bSuccess = true;	// 処理成功フラグ
		int ret;					// ライブラリ処理結果用

		// ヘッダ内容設定（共通）
		AH0060010Struct structTemp = (AH0060010Struct)listTarget.get(0);
		return bSuccess;
	}

	/**
	 * フォームファイル名取得
	 *
	 * @param	structTarget	対象データ情報
	 * @return	フォームファイル名:成功 / null:失敗
	 */
	private String getFormFileName(AH0060010Struct structTarget)
	{
		// フォーム識別ID設定
		String strFormId = null;
		if("1".equals(getSortFlg()) == true)
		{
			// 品目順
			if("1".equals(getJOB_ODR_CD_STOCK_flg()) == true)
			{
				strFormId = FORMID_JOBODRCDSTOCK_ITEM;	// 製番在庫－品目順
			}
			else {
				if(struct.getr2_whlot1()!=null 
                && (("1".equals(struct.getr2_whlot1()) == true)
                        || (struct.getr2_whlot1().equals("true")))){
					strFormId = FORMID_ITEMSTOCK_ITEM;	// 品目在庫－品目順
				}
				else if (struct.getr2_whlot2()!=null 
		                && (("1".equals(struct.getr2_whlot2()) == true)
		                        || (struct.getr2_whlot2().equals("true")))){
					strFormId = FORMID_LOTSTOCK_ITEM;	// ロット在庫－品目順
				}
			}
		}
		else
		{
			// 保管区順			
			if("1".equals(getJOB_ODR_CD_STOCK_flg()) == true)
			{
				strFormId = FORMID_JOBODRCDSTOCK_WH;	// 製番在庫－保管区順
			}
			else {
				if(struct.getr2_whlot1()!=null 
                && (("1".equals(struct.getr2_whlot1()) == true)
                        || (struct.getr2_whlot1().equals("true")))){
					strFormId = FORMID_ITEMSTOCK_WH;	// 品目在庫－保管区順
				}
				else if (struct.getr2_whlot2()!=null 
		                && (("1".equals(struct.getr2_whlot2()) == true)
		                        || (struct.getr2_whlot2().equals("true")))){
					strFormId = FORMID_LOTSTOCK_WH;	// ロット在庫－保管区順
				}
			}
		}

		// フォームファイル名作成
		String strFormFileName = null;
		if(strFormId != null)
		{
			// 帳票フォームファイル設定
			strFormFileName = sp.getProcId() + strFormId;// 例 AH0030010 + ID
		}
		return strFormFileName;
	}
	//------------------------------------------------------------------
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * 読込ボタン押下時に実行される処理です。
	 *
	 */
	public void controlselect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0060");
		logger.entering("AH0060010Control"+":USER="+struct.getsUser_ID(),"controlselect");
			//{{user_implement_dev:<controlselect>
		//---------------------------------------------------------------------
		// 読込処理成功フラグ初期化
		boolean bSuccess = false;
		
		// 最新棚卸制御情報読込用
		AH0060010Struct read_struct_inv_ctrl = new AH0060010Struct();

		// 検索状態を初期化
		setReadStatus(INITIAL);
		try {
			// エラーフラグ初期化
			boolean bError = false;
			boolean bMaxDispError = false;

			// リストクリア
			list.clear();
			_listData.clear();

			// 処理に関連するパラメータを設定
			struct.setPLANT_CD(getsysPLANT_CD());
			struct.setWH_CD(struct.getw_WH_CD());
			struct.setITEM_CD(struct.getw_ITEM_CD());
			struct.setJOB_ODR_CD(struct.getw_JOB_ODR_CD());

			// 棚卸制御データの存在チェック
			read_struct_inv_ctrl = readT_INV_CTRL(struct);
			if(read_struct_inv_ctrl == null)
			{
				// 棚卸制御データが存在しない
				bError = true;

				// 検索状態を「０件読込」に設定
				setReadStatus(NOT_FOUND);
			}
			else
			{
				// 棚卸状態区分が0（棚卸実施前）でないかのチェック
				if(checkINV_STS_TYP_notequal0(read_struct_inv_ctrl) != true)
				{
					// 棚卸状態区分が0（棚卸実施前）
					bError = true;

					// 検索状態を「０件読込」に設定
					setReadStatus(NOT_FOUND);
				}
			}

			// エラーがない
			if(bError != true)
			{
				// 実棚一覧情報読込用パラメータ準備
				int intKindStock = 0;	// 品目在庫（初期値）
				int intKindSort = 0;	// 保管区順（初期値）
				if("1".equals(struct.geth_JOB_ODR_CD_STOCK_flg()) == true)
				{
					// 製番在庫
					intKindStock = 1;
				}
				else
				{
					// 品目在庫
                    if( struct.getr2_whlot1()!=null 
                            && (("1".equals(struct.getr2_whlot1()) == true)
                                    || (struct.getr2_whlot1().equals("true")))){
                        intKindStock = 0;
                    }
                    // Lot在庫
                    if( struct.getr2_whlot2()!=null
                            && (("1".equals(struct.getr2_whlot2()) == true)
                                    || (struct.getr2_whlot2().equals("true")))){
                        intKindStock = 2;                      
                    }
				}
				if("1".equals(struct.geth_sort_flg()) == true)
				{
					// 品目順
					intKindSort = 1;
				}
				// 実棚一覧情報読込処理
				_listData = _common.getData(
								conn,
								struct.getINV_DATE(), 
								intKindStock, 
								intKindSort,
								struct.getw_ITEM_CD(), 
								struct.getw_WH_CD(), 
								struct.getw_JOB_ODR_CD(),
								struct.getw_difference_rate(),
								struct.gets_ABC_TYP(),
								struct.getw_STOCK_LOT_CD()							
				);

				// 実棚一覧情報件数チェック
				if(_listData.size() <= 0)
				{
					// 件数が０(ゼロ)件
					bError = true;

					// 検索状態を「０件読込」に設定
					setReadStatus(NOT_FOUND);

					if("1".equals(struct.geth_JOB_ODR_CD_STOCK_flg()) == true)
					{
						// 製番
						setErrorMessage("ZZ06001");
						setErrorParameter("T_JOB_ODR_CD_INV.INV_DATE:" + struct.getINV_DATE());
						setErrorParameter("T_JOB_ODR_CD_INV.PLANT_CD:" + struct.getPLANT_CD());
						setErrorParameter("T_JOB_ODR_CD_INV.ITEM_CD:" + struct.getw_ITEM_CD());
						setErrorParameter("T_JOB_ODR_CD_INV.WH_CD:" + struct.getw_WH_CD());
						setErrorParameter("T_JOB_ODR_CD_INV.JOB_ODR_CD:" + struct.getw_JOB_ODR_CD());
						setErrorParameter("M_ITEM.ABC_TYP:" + struct.gets_ABC_TYP());
						setErrorParameter("DIFFERENCE_RATE:" + struct.getw_difference_rate());
					}
				   else
                    {
                        if(("1".equals(struct.getr2_whlot1()))
                                ||(struct.getr2_whlot1().equals("true")))
                    
                        {
                            // 品目
                            setErrorMessage("ZZ06001");
                            setErrorParameter("T_ITEM_INV.INV_DATE:" + struct.getINV_DATE());
                            setErrorParameter("T_ITEM_INV.PLANT_CD:" + struct.getPLANT_CD());
                            setErrorParameter("T_ITEM_INV.ITEM_CD:" + struct.getw_ITEM_CD());
                            setErrorParameter("T_ITEM_INV.WH_CD:" + struct.getw_WH_CD());
                            setErrorParameter("M_ITEM.ABC_TYP:" + struct.gets_ABC_TYP());
                            setErrorParameter("DIFFERENCE_RATE:" + struct.getw_difference_rate());
                        }
                        else 
                            if(("1".equals(struct.getr2_whlot2()))
                                    ||(struct.getr2_whlot2().equals("true"))){
                                // Lot在庫
                                setErrorMessage("ZZ06001");
                                setErrorParameter("T_LOT_INV.INV_DATE:" + struct.getINV_DATE());
                                setErrorParameter("T_LOT_INV.PLANT_CD:" + struct.getPLANT_CD());
                                setErrorParameter("T_LOT_INV.ITEM_CD:" + struct.getw_ITEM_CD());
                                setErrorParameter("T_LOT_INV.WH_CD:" + struct.getw_WH_CD());
                                setErrorParameter("T_LOT_INV.ABC_TYP:" + struct.gets_ABC_TYP());
                                setErrorParameter("DIFFERENCE_RATE:" + struct.getw_difference_rate());
                                setErrorParameter("T_LOT_INV.LOT_NO:" + struct.getw_STOCK_LOT_CD());
                            }
                    }
				}

				// 表示最大行数制限処理
				if(checkMaxDispLine(_DISPLAY_CD_PARENT, _listData.size()) != true)
				{
					// 実棚一覧情報件数が最大表示行数以上
					bMaxDispError = true;

					// 検索状態を「最大行数オーバー」に設定
					setReadStatus(TOO_MANY);
				}
			}

			// エラーがない
			if(bError != true)
			{
				// 最大表示行数エラーでない
				if(bMaxDispError != true)
				{
					// 表示用リストを更新
					setList(_listData);

					// 検索状態を「読込成功」に設定
					setReadStatus(NORMAL);
				}
				// 読込処理成功フラグ設定
				bSuccess = true;

				// _listDataの内容を判別するための表示順、在庫種類情報を退避
				setJOB_ODR_CD_STOCK_flg(struct.geth_JOB_ODR_CD_STOCK_flg());
				setSortFlg(struct.geth_sort_flg());
			}

		} catch(SQLException e) {
			setSqlExceptionMsg(e);

		} finally {
			// 画面モード設定
			if(bSuccess == true)
			{
				// 読込成功時のキー情報を退避
				struct.seth_save_sort_flg(struct.geth_sort_flg());
			}

			// 最新情報設定
			// 画面表示情報クリア
			struct.setw_INV_status("");

			// 最新表示情報設定
			if(read_struct_inv_ctrl != null)
			{
				struct.setw_INV_status(read_struct_inv_ctrl.getw_INV_status());
				struct.setSTOCK_SAVE_DATE(read_struct_inv_ctrl.getSTOCK_SAVE_DATE());// CSV出力で必要
			}
		}
		//---------------------------------------------------------------------
                //}}user_implement_dev:<controlselect>
		logger.exiting("AH0060010Control"+":USER="+struct.getsUser_ID(),"controlselect");

		return;
	}

	/**
	 * CSV出力ボタン押下時に実行される処理です。
	 *
	 */
	public void controlcsv_export() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0060");
		logger.entering("AH0060010Control"+":USER="+struct.getsUser_ID(),"controlcsv_export");
			//{{user_implement_dev:<controlcsv_export>
		//---------------------------------------------------------------------
		// CsvWriterを生成
		csvWriter = new CsvWriter(CsvWriter.getFileName(getsysUSER_CD()));
		setSyslogConfig("csv-file name [" + CsvWriter.getFileName(getsysUSER_CD()) + "]");

		// 処理成功フラグ初期化
		boolean bSuccess = false;

		// ＣＳＶデータ格納用リストを初期化
		_csvList.clear();

		// ＣＳＶ出力データ設定準備
		if(csvExport(struct, _listData, getJOB_ODR_CD_STOCK_flg()))
		{
			String strFilePath = null;
			try {
				// CSV作成
				setSyslogConfig("_csvList.size [" + _csvList.size() + "]");
				csvWriter.write(_csvList, CoreTools.getLocale(struct.getsUser_ID()),true);
				strFilePath = csvWriter.getFilePath();
				setSyslogConfig("Completion of CSV-data output.");

				// 出力ファイルパス設定
				struct.setDOWNLOAD_FILE(strFilePath);
			}
			catch(Exception e)
			{
				// CSV出力失敗
				ExpjMessage emsg = setExceptionMessage("ZZ01107");
				ExpjException ee = new ExpjException(e, emsg);
				if("1".equals(getJOB_ODR_CD_STOCK_flg()) == true)
				{
					// 製番
					setExceptionParameter("T_JOB_ODR_CD_INV.INV_DATE:" + struct.getINV_DATE());
					setExceptionParameter("T_JOB_ODR_CD_INV.PLANT_CD:" + struct.getPLANT_CD());
					setExceptionParameter("T_JOB_ODR_CD_INV.ITEM_CD:" + struct.getw_ITEM_CD());
					setExceptionParameter("T_JOB_ODR_CD_INV.WH_CD:" + struct.getw_WH_CD());
					setExceptionParameter("T_JOB_ODR_CD_INV.JOB_ODR_CD:" + struct.getw_JOB_ODR_CD());
					setExceptionParameter("M_ITEM.ABC_TYP:" + struct.gets_ABC_TYP());
					setExceptionParameter("DIFFERENCE_RATE:" + struct.getw_difference_rate());
				}
				else
				{
					if(struct.getr2_whlot1()!=null 
                            && (("1".equals(struct.getr2_whlot1()) == true)
                                    || (struct.getr2_whlot1().equals("true")))){
						// 品目
						setExceptionParameter("T_ITEM_INV.INV_DATE:" + struct.getINV_DATE());
						setExceptionParameter("T_ITEM_INV.PLANT_CD:" + struct.getPLANT_CD());
						setExceptionParameter("T_ITEM_INV.ITEM_CD:" + struct.getw_ITEM_CD());
						setExceptionParameter("T_ITEM_INV.WH_CD:" + struct.getw_WH_CD());
						setExceptionParameter("M_ITEM.ABC_TYP:" + struct.gets_ABC_TYP());
						setExceptionParameter("DIFFERENCE_RATE:" + struct.getw_difference_rate());
					}
					else if (struct.getr2_whlot2()!=null 
                            && (("1".equals(struct.getr2_whlot2()) == true)
                                    || (struct.getr2_whlot2().equals("true")))){
						// ロット
						setExceptionParameter("T_LOT_INV.INV_DATE:" + struct.getINV_DATE());
						setExceptionParameter("T_LOT_INV.PLANT_CD:" + struct.getPLANT_CD());
						setExceptionParameter("T_LOT_INV.ITEM_CD:" + struct.getw_ITEM_CD());
						setExceptionParameter("T_LOT_INV.WH_CD:" + struct.getw_WH_CD());
						setExceptionParameter("T_LOT_INV.LOT_NO:" + struct.getw_STOCK_LOT_CD());
						setExceptionParameter("T_LOT_INV.ABC_TYP:" + struct.gets_ABC_TYP());
						setExceptionParameter("DIFFERENCE_RATE:" + struct.getw_difference_rate());
					}

				}
				throw ee;
			}
		}
		//---------------------------------------------------------------------
                //}}user_implement_dev:<controlcsv_export>
		logger.exiting("AH0060010Control"+":USER="+struct.getsUser_ID(),"controlcsv_export");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlclear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0060");
		logger.entering("AH0060010Control"+":USER="+struct.getsUser_ID(),"controlclear");
			//{{user_implement_dev:<controlclear>
		//------------------------------------------------------------------
		// struct初期化
		struct.initializeParent();

		// リストクリア
		list.clear();
		_listData.clear();

		// 検索状態を「初期状態」に設定
		setReadStatus(INITIAL);

		//------------------------------------------------------------------
                //}}user_implement_dev:<controlclear>
		logger.exiting("AH0060010Control"+":USER="+struct.getsUser_ID(),"controlclear");

		return;
	}

	/**
	 * 帳票出力ボタン押下時に実行される処理です。
	 *
	 */
	public void controlPrint() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0060");
		logger.entering("AH0060010Control"+":USER="+struct.getsUser_ID(),"controlPrint");
			AH0060010Struct strPdf = null;

		int ret = 0;
		String printType      = getPdfOutputType();
		String printPattern   = getPdfOutputListPattern();
		String printer        = getPdfOutputPrinter();
		SvfWrapper svf        = new SvfWrapper(printType, getsysUSER_CD(), printer);

			//{{user_implement_dev:<controlPrint>
		//---------------------------------------------------------------------
		try {
			struct.setDOWNLOAD_FILE(null);	// ダウンロードファイル名クリア
			///////////////////////////////////////////////////////////////////////////////
			String printId1 = getFormFileName(struct);	// 帳票IDを指定してください
			///////////////////////////////////////////////////////////////////////////////
			ret = svf.VrInit(printId1);	// PDF作成開始
			ret = svf.VrSetDocName2("製品構成台帳");	// スプーラ表示の文書名の指定
			pdfFilePath = svf.getPdfFilePath();	// pdfフルパスファイル名
			pdfFileName = svf.getPdfFileName();	// pdfファイル名（Web用）
			String excuteOutput = svf.getExcuteOutput();	// サーバ出力処理

			frmFileName = new String(printId1 + ".frm");	// frmファイル名
		
			///////////////////////////////////////////////////////////////////////////////
			setSyslogConfig("printType [" + printType + "]");
			setSyslogConfig("printPattern [" + printPattern + "]");
			setSyslogConfig("pdfFilePath [" + pdfFilePath + "]");
			setSyslogConfig("pdfFileName [" + pdfFileName + "]");
			setSyslogConfig("frmFileName [" + frmFileName + "]");
			setSyslogConfig("excuteOutput [" + excuteOutput + "]");
			///////////////////////////////////////////////////////////////////////////////
			// 出力対象データがない場合は何もしない
			if(_listData == null || _listData.size() <= 0)
			{
				return;
			}
			///////////////////////////////////////////////////////////////////////////////
			if(ret != 0)
			{
				setSyslogConfig("Form-file not found.("+ ret +") [" + frmFileName + "]");
			}
			// PDF出力データ設定
			
			 /*クエリーファイルの指定*/
			if (dbKIND != null && !dbKIND.equals("")) {
				ret = svf.VrSetQuery("KIND=" + dbKIND + ";UID=" + dbUID
						+ ";PWD=" + dbPWD + ";DBQ=" + dbDBQ);
			} else {
				ret = svf.VrSetQuery("UID=" + dbUID + ";PWD=" + dbPWD + ";DBQ="
						+ dbDBQ);
			}
			
			 // システム工場名称
		    if (getsysPLANT_NAME() == null|| "".equals(getsysPLANT_NAME())) {
		    	ret = svf.VrCondition("[X|sysPLANT_NAME_flg]=" + "0" ,4);
		    	ret = svf.VrCondition("[X|sysPLANT_NAME]=" + "%", 4);
			} else {
				ret = svf.VrCondition("[X|sysPLANT_NAME_flg]=" + "1" ,4);
				ret = svf.VrCondition("[X|sysPLANT_NAME]=" + getsysPLANT_NAME(), 4);
			}
		    // システム工場コード
		    ret = svf.VrCondition("[X|sysPLANT_CD]=" + getsysPLANT_CD(), 4);
		    // 棚卸日
		    ret = svf.VrCondition("[X|INV_DATE]=" + struct.getINV_DATE(), 4);
		    // 品目番号
		    if (struct.getw_ITEM_CD() == null|| "".equals(struct.getw_ITEM_CD())) {
		    	ret = svf.VrCondition("[X|w_ITEM_CD_flg]=" + "0" ,4);
		    	ret = svf.VrCondition("[X|w_ITEM_CD]=" + "%", 4);
			} else {
				ret = svf.VrCondition("[X|w_ITEM_CD_flg]=" + "1" ,4);
				ret = svf.VrCondition("[X|w_ITEM_CD]=" + struct.getw_ITEM_CD(), 4);
			}
		    // 保管区番号
		    if (struct.getw_WH_CD() == null|| "".equals(struct.getw_WH_CD())) {
		    	ret = svf.VrCondition("[X|w_WH_CD_flg]=" + "0" ,4);
		    	ret = svf.VrCondition("[X|w_WH_CD]=" + "%", 4);
			} else {
				ret = svf.VrCondition("[X|w_WH_CD_flg]=" + "1" ,4);
				ret = svf.VrCondition("[X|w_WH_CD]=" + struct.getw_WH_CD(), 4);
			}
		    // 棚卸区分 
		    if (struct.gets_ABC_TYP() == null|| "".equals(struct.gets_ABC_TYP())) {
		    	ret = svf.VrCondition("[X|s_ABC_TYP_flg]=" + "0" ,4);
		    	ret = svf.VrCondition("[X|s_ABC_TYP]=" + "%", 4);
			} else {
				ret = svf.VrCondition("[X|s_ABC_TYP_flg]=" + "1" ,4);
				ret = svf.VrCondition("[X|s_ABC_TYP]=" + struct.gets_ABC_TYP(), 4);
			}
		    // 差異率
		    ret = svf.VrCondition("[X|w_DIFFERENCE_RATE]=" + struct.getw_difference_rate(), 4);
			// 保存時間
			if (struct.getSTOCK_SAVE_DATE() == null|| "".equals(struct.getSTOCK_SAVE_DATE())) {
				ret = svf.VrCondition("[X|STOCK_SAVE_DATE]=" + "9999/99/99", 4);
			} else {
				ret = svf.VrCondition("[X|STOCK_SAVE_DATE]=" + struct.getSTOCK_SAVE_DATE(), 4);
			}
			if("1".equals(getJOB_ODR_CD_STOCK_flg()) == true)
			{
				// 製番専用
			    if (struct.getw_JOB_ODR_CD() == null|| "".equals(struct.getw_JOB_ODR_CD())) {
			    	ret = svf.VrCondition("[X|w_JOB_ODR_CD_flg]=" + "0" ,4);
			    	ret = svf.VrCondition("[X|w_JOB_ODR_CD]=" + "%", 4);
				} else {
					ret = svf.VrCondition("[X|w_JOB_ODR_CD_flg]=" + "1" ,4);
					ret = svf.VrCondition("[X|w_JOB_ODR_CD]=" + struct.getw_JOB_ODR_CD(), 4);
				}
			}
            // Lot在庫
            if( struct.getr2_whlot2()!=null
                    && (("1".equals(struct.getr2_whlot2()) == true)
                            || (struct.getr2_whlot2().equals("true")))){
            	if(struct.getw_STOCK_LOT_CD() == null || "".equals(struct.getw_STOCK_LOT_CD())){
            		ret = svf.VrCondition("[X|w_STOCK_LOT_CD]=" + "%", 4);	
            	} else {
            		ret = svf.VrCondition("[X|w_STOCK_LOT_CD]=" + struct.getw_STOCK_LOT_CD(), 4);
            	}           	                 
            }
			 /*クエリー実行*/
			ret = svf.VrReport();
			if (ret == -554) {
				ExpjMessage emsg = new ExpjMessage("ZZ06001");
				msgStruct.addError(emsg);
				sysLog.warning(emsg, sysUSER_CD);
				return;
			}
			
			ret = svf.VrQuit();								// PDF作成終了
			///////////////////////////////////////////////////////////////////////////////
			if(ret < 0)
			{
				setSyslogConfig("Error : VrQuit (" + ret + ")");
			}
			///////////////////////////////////////////////////////////////////////////////

			if ( "0".equals(printType) ) {	// クライアント印刷の場合
				struct.setDOWNLOAD_FILE(getPdfFileName());
			}
			else if ( "1".equals(printType) ) {
				try {
					String acrobatPath = svf.getAcrobatPath();
					String acrobatOption1 = svf.getAcrobatOption1();
					String acrobatOption2 = svf.getAcrobatOption2();
					String pdfPrinter = svf.getPrinter();
					Runtime.getRuntime().exec(new String[]{acrobatPath, acrobatOption1, acrobatOption2, pdfFilePath, pdfPrinter});
					//Runtime.getRuntime().exec(excuteOutput);
				}catch(IOException e){
					// サーバ印刷失敗時のエラー処理を記述してください。
				}
			}

//			objMessage.m_writer.write(Level.INFO, "file=" + svf.VrGetSpoolFileName() + "に出力");
			///////////////////////////////////////////////////////////////////////////////
			setSyslogConfig("Completion of PDF-data output.");
			///////////////////////////////////////////////////////////////////////////////
			
		} catch (Exception e) {
			e.printStackTrace();
			setErrorMessage("ZZ01106");
		} 
			
                //}}user_implement_dev:<controlPrint>
		logger.exiting("AH0060010Control"+":USER="+struct.getsUser_ID(),"controlPrint");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0060");
		logger.entering("AH0060010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AH0060010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0060");
		logger.entering("AH0060010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
        //------------------------------------------------------------------
		try {
			// 実棚一覧専用クラスオブジェクト準備
			_common = new AH0060Common();
			if(_common.init(conn, getsysPLANT_CD()) != true)
			{
				// エラー処理
				ExpjMessage emsg = setExceptionMessage("ZZ01106");
				ExpjException ee = new ExpjException(emsg);
				setExceptionParameter("Initialize Error");
				throw ee;
			}

			// コンボデータの取得
			ComboBox controller = new ComboBox(conn, sysUSER_CD);
			ComboStruct cmboAbcTyp	 = controller.getData("ABC_TYP");		// 棚卸区分
			
			// ロット管理導入済チェック
			if(LotCtrl.checkLotCtrl(conn)){
			    struct.seth_lotCtrl("true");
			    lotCtrl = "true";
			}else{
				struct.seth_lotCtrl("false");
				lotCtrl = "false";
			}
			
			// 画面用「棚卸区分」コンボボックスリストデータ作成
			makeAbcTypComboData(cmboAbcTyp);

			// 棚卸アクセッサクラスオブジェクト準備
			_invAccessor = new InvAccessor(getsysPLANT_CD());

			// クリア処理
			controlclear();

		}catch(SQLException e){
			setSqlExceptionMsg(e);

		}catch(ComboException e){
			// エラー処理を記述してください。
			ExpjMessage emsg = new ExpjMessage("ZZ01106");
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;

		}
		//------------------------------------------------------------------
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AH0060010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * イベントハンドラの前処理です。
	 *
	 * @param buttun ボタン名
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0060");
		logger.entering("AH0060010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");
		struct.setDOWNLOAD_FILE((String)null);	// ダウンロードファイル名クリア
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
		logger.exiting("AH0060010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("csv_export") ) {
				controlcsv_export();
			} else if( button.equals("clear") ) {
				controlclear();
			} else if( button.equals("Print") ) {
				controlPrint();
			} else if( button.equals("initial") ) {
				controlINITIAL();
			} else if( button.equals("reload") ) {
				controlRELOAD();
			}
		//{{user_implement_dev:<control_eventHandller>
		//---------------------------------------------------------------------
			struct.setList_s_ABC_TYP_val(_comboAbcTyp.getValList());
			struct.setList_s_ABC_TYP_name(_comboAbcTyp.getExplanList());
			struct.seth_lotCtrl(lotCtrl);
  		} catch(AlarmMessageException ame){
			//ExpjException ee = new ExpjException(ame, (ExpjMessageList)((Object)ame.getMessages()));
			//throw ee;
		//---------------------------------------------------------------------
                //}}user_implement_dev:<control_eventHandller>
		} catch( BusinessLockException ble ) {
			// 枠メッセージ出力依頼作成
			setNewDataFlg(false);
		} catch( ResourceBusyException rbe ) {
			ExpjException ee = new ExpjException(rbe, "ZZ01105");
			throw ee;
		} catch( FoundationException e ) {
//			e.printStackTrace();
//			throw new FoundationException("AH0060010Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AH0060010-E999","CSVの出力処理"));
			throw new FoundationException("AH0060010Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AH0060010-E999","システム日付の取得処理"));
				throw new FoundationException("AH0060010Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AH0060010-E999","コントロールのイベント処理"));
			throw new FoundationException("AH0060010Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected AH0060010Entity entity;
	protected AH0060010Struct struct;
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

		entity = new AH0060010Entity();
		struct = new AH0060010Struct();

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
	 * AH0060010クラスの標準コンストラクタ
	 */
	public AH0060010Control() throws BusinessProcessException, FoundationException
	{
		initialize();

		//conn = connect();
		//{{user_implement_code_constractor
		//---------------------------------------------------------------------
		list = new ArrayList(0);
		try {
			ResourceBundle bundle = SystemConfig.getBundle();
			dbUID = SystemConfig.getProperty("CONNECT_DBUSER", bundle);
			dbPWD = SystemConfig.getProperty("CONNECT_DBPASS", bundle);
			dbDBQ = SystemConfig.getProperty("CONNECT_DBHOST", bundle);
			dbKIND = SystemConfig.getProperty("CONNECT_KIND", bundle);
		} catch(MissingResourceException e) {
			e.printStackTrace();
		}
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
				AH0060010Struct key = (AH0060010Struct)keyList.get(j);
				// メッセージキーを作成する
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("w_INV_status") && key.getw_INV_status() != null) {
					msgKey.setKeyValue("w_INV_status", key.getw_INV_status());
				}
				if(msgKeyType.containsKeyColumn("w_WH_CD") && key.getw_WH_CD() != null) {
					msgKey.setKeyValue("w_WH_CD", key.getw_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("w_ITEM_CD") && key.getw_ITEM_CD() != null) {
					msgKey.setKeyValue("w_ITEM_CD", key.getw_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("WH_CD") && key.getWH_CD() != null) {
					msgKey.setKeyValue("WH_CD", key.getWH_CD());
				}
				if(msgKeyType.containsKeyColumn("WH_NAME") && key.getWH_NAME() != null) {
					msgKey.setKeyValue("WH_NAME", key.getWH_NAME());
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
				if(msgKeyType.containsKeyColumn("FINAL_BOOK_STOCK_QTY") && key.getFINAL_BOOK_STOCK_QTY() != null) {
					msgKey.setKeyValue("FINAL_BOOK_STOCK_QTY", key.getFINAL_BOOK_STOCK_QTY());
				}
				if(msgKeyType.containsKeyColumn("ACTUAL_STOCK_QTY") && key.getACTUAL_STOCK_QTY() != null) {
					msgKey.setKeyValue("ACTUAL_STOCK_QTY", key.getACTUAL_STOCK_QTY());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT") && key.getSTOCK_UNIT() != null) {
					msgKey.setKeyValue("STOCK_UNIT", key.getSTOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("SAFETY_STOCK") && key.getSAFETY_STOCK() != null) {
					msgKey.setKeyValue("SAFETY_STOCK", key.getSAFETY_STOCK());
				}
				if(msgKeyType.containsKeyColumn("VEND_CD") && key.getVEND_CD() != null) {
					msgKey.setKeyValue("VEND_CD", key.getVEND_CD());
				}
				if(msgKeyType.containsKeyColumn("VEND_ANAME") && key.getVEND_ANAME() != null) {
					msgKey.setKeyValue("VEND_ANAME", key.getVEND_ANAME());
				}
				if(msgKeyType.containsKeyColumn("difference_rate") && key.getdifference_rate() != null) {
					msgKey.setKeyValue("difference_rate", key.getdifference_rate());
				}
				if(msgKeyType.containsKeyColumn("w_MRP_ODR_TYP") && key.getw_MRP_ODR_TYP() != null) {
					msgKey.setKeyValue("w_MRP_ODR_TYP", key.getw_MRP_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("w_ABC_TYP") && key.getw_ABC_TYP() != null) {
					msgKey.setKeyValue("w_ABC_TYP", key.getw_ABC_TYP());
				}
				if(msgKeyType.containsKeyColumn("w_MRP_FLG") && key.getw_MRP_FLG() != null) {
					msgKey.setKeyValue("w_MRP_FLG", key.getw_MRP_FLG());
				}
				if(msgKeyType.containsKeyColumn("w_WH_TYP") && key.getw_WH_TYP() != null) {
					msgKey.setKeyValue("w_WH_TYP", key.getw_WH_TYP());
				}
				if(msgKeyType.containsKeyColumn("s_ABC_TYP") && key.gets_ABC_TYP() != null) {
					msgKey.setKeyValue("s_ABC_TYP", key.gets_ABC_TYP());
				}
				if(msgKeyType.containsKeyColumn("s_ABC_TYP_name") && key.gets_ABC_TYP_name() != null) {
					msgKey.setKeyValue("s_ABC_TYP_name", key.gets_ABC_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("s_ABC_TYP_val") && key.gets_ABC_TYP_val() != null) {
					msgKey.setKeyValue("s_ABC_TYP_val", key.gets_ABC_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("c_JOB_ODR_CD_STOCK_flg") && key.getc_JOB_ODR_CD_STOCK_flg() != null) {
					msgKey.setKeyValue("c_JOB_ODR_CD_STOCK_flg", key.getc_JOB_ODR_CD_STOCK_flg());
				}
				if(msgKeyType.containsKeyColumn("h_JOB_ODR_CD_STOCK_flg") && key.geth_JOB_ODR_CD_STOCK_flg() != null) {
					msgKey.setKeyValue("h_JOB_ODR_CD_STOCK_flg", key.geth_JOB_ODR_CD_STOCK_flg());
				}
				if(msgKeyType.containsKeyColumn("h_sort_flg") && key.geth_sort_flg() != null) {
					msgKey.setKeyValue("h_sort_flg", key.geth_sort_flg());
				}
				if(msgKeyType.containsKeyColumn("w_JOB_ODR_CD") && key.getw_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("w_JOB_ODR_CD", key.getw_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("w_difference_rate") && key.getw_difference_rate() != null) {
					msgKey.setKeyValue("w_difference_rate", key.getw_difference_rate());
				}
				if(msgKeyType.containsKeyColumn("r1_sort1") && key.getr1_sort1() != null) {
					msgKey.setKeyValue("r1_sort1", key.getr1_sort1());
				}
				if(msgKeyType.containsKeyColumn("r1_sort2") && key.getr1_sort2() != null) {
					msgKey.setKeyValue("r1_sort2", key.getr1_sort2());
				}
				if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE") && key.getDOWNLOAD_FILE() != null) {
					msgKey.setKeyValue("DOWNLOAD_FILE", key.getDOWNLOAD_FILE());
				}
				if(msgKeyType.containsKeyColumn("h_save_sort_flg") && key.geth_save_sort_flg() != null) {
					msgKey.setKeyValue("h_save_sort_flg", key.geth_save_sort_flg());
				}
				if(msgKeyType.containsKeyColumn("w_STOCK_LOT_CD") && key.getw_STOCK_LOT_CD() != null) {
					msgKey.setKeyValue("w_STOCK_LOT_CD", key.getw_STOCK_LOT_CD());
				}
				if(msgKeyType.containsKeyColumn("l_STOCK_LOT_CD") && key.getl_STOCK_LOT_CD() != null) {
					msgKey.setKeyValue("l_STOCK_LOT_CD", key.getl_STOCK_LOT_CD());
				}
				if(msgKeyType.containsKeyColumn("h_lotCtrl") && key.geth_lotCtrl() != null) {
					msgKey.setKeyValue("h_lotCtrl", key.geth_lotCtrl());
				}
				if(msgKeyType.containsKeyColumn("r2_whlot1") && key.getr2_whlot1() != null) {
					msgKey.setKeyValue("r2_whlot1", key.getr2_whlot1());
				}
				if(msgKeyType.containsKeyColumn("r2_whlot2") && key.getr2_whlot2() != null) {
					msgKey.setKeyValue("r2_whlot2", key.getr2_whlot2());
				}
				if(msgKeyType.containsKeyColumn("PLANT_NAME") && key.getPLANT_NAME() != null) {
					msgKey.setKeyValue("PLANT_NAME", key.getPLANT_NAME());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP") && key.getMRP_ODR_TYP() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP", key.getMRP_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("MRP_FLG") && key.getMRP_FLG() != null) {
					msgKey.setKeyValue("MRP_FLG", key.getMRP_FLG());
				}
				if(msgKeyType.containsKeyColumn("WH_TYP") && key.getWH_TYP() != null) {
					msgKey.setKeyValue("WH_TYP", key.getWH_TYP());
				}
				if(msgKeyType.containsKeyColumn("ABC_TYP") && key.getABC_TYP() != null) {
					msgKey.setKeyValue("ABC_TYP", key.getABC_TYP());
				}
				if(msgKeyType.containsKeyColumn("INV_DATE") && key.getINV_DATE() != null) {
					msgKey.setKeyValue("INV_DATE", key.getINV_DATE());
				}
				if(msgKeyType.containsKeyColumn("REGULAR_INV_FLG") && key.getREGULAR_INV_FLG() != null) {
					msgKey.setKeyValue("REGULAR_INV_FLG", key.getREGULAR_INV_FLG());
				}
				if(msgKeyType.containsKeyColumn("CYCLE_INV_FLG") && key.getCYCLE_INV_FLG() != null) {
					msgKey.setKeyValue("CYCLE_INV_FLG", key.getCYCLE_INV_FLG());
				}
				if(msgKeyType.containsKeyColumn("TEMP_INV_FLG") && key.getTEMP_INV_FLG() != null) {
					msgKey.setKeyValue("TEMP_INV_FLG", key.getTEMP_INV_FLG());
				}
				if(msgKeyType.containsKeyColumn("INV_STS_TYP") && key.getINV_STS_TYP() != null) {
					msgKey.setKeyValue("INV_STS_TYP", key.getINV_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("INV_START_DATE") && key.getINV_START_DATE() != null) {
					msgKey.setKeyValue("INV_START_DATE", key.getINV_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("STOCK_SAVE_DATE") && key.getSTOCK_SAVE_DATE() != null) {
					msgKey.setKeyValue("STOCK_SAVE_DATE", key.getSTOCK_SAVE_DATE());
				}
				if(msgKeyType.containsKeyColumn("INV_UPDATED_DATE") && key.getINV_UPDATED_DATE() != null) {
					msgKey.setKeyValue("INV_UPDATED_DATE", key.getINV_UPDATED_DATE());
				}
				if(msgKeyType.containsKeyColumn("INV_COMMENT") && key.getINV_COMMENT() != null) {
					msgKey.setKeyValue("INV_COMMENT", key.getINV_COMMENT());
				}
				if(msgKeyType.containsKeyColumn("MODIFY_COUNT") && key.getMODIFY_COUNT() != null) {
					msgKey.setKeyValue("MODIFY_COUNT", key.getMODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
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
					AH0060010Struct key = new AH0060010Struct();
					if(msgKeyType.containsKeyColumn("w_INV_status")) {
						key.setw_INV_status(msgKey.getKeyValue("w_INV_status"));
					}
					if(msgKeyType.containsKeyColumn("w_WH_CD")) {
						key.setw_WH_CD(msgKey.getKeyValue("w_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_ITEM_CD")) {
						key.setw_ITEM_CD(msgKey.getKeyValue("w_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("WH_CD")) {
						key.setWH_CD(msgKey.getKeyValue("WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("WH_NAME")) {
						key.setWH_NAME(msgKey.getKeyValue("WH_NAME"));
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
					if(msgKeyType.containsKeyColumn("FINAL_BOOK_STOCK_QTY")) {
						key.setFINAL_BOOK_STOCK_QTY(msgKey.getKeyValue("FINAL_BOOK_STOCK_QTY"));
					}
					if(msgKeyType.containsKeyColumn("ACTUAL_STOCK_QTY")) {
						key.setACTUAL_STOCK_QTY(msgKey.getKeyValue("ACTUAL_STOCK_QTY"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT")) {
						key.setSTOCK_UNIT(msgKey.getKeyValue("STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("SAFETY_STOCK")) {
						key.setSAFETY_STOCK(msgKey.getKeyValue("SAFETY_STOCK"));
					}
					if(msgKeyType.containsKeyColumn("VEND_CD")) {
						key.setVEND_CD(msgKey.getKeyValue("VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("VEND_ANAME")) {
						key.setVEND_ANAME(msgKey.getKeyValue("VEND_ANAME"));
					}
					if(msgKeyType.containsKeyColumn("difference_rate")) {
						key.setdifference_rate(msgKey.getKeyValue("difference_rate"));
					}
					if(msgKeyType.containsKeyColumn("w_MRP_ODR_TYP")) {
						key.setw_MRP_ODR_TYP(msgKey.getKeyValue("w_MRP_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("w_ABC_TYP")) {
						key.setw_ABC_TYP(msgKey.getKeyValue("w_ABC_TYP"));
					}
					if(msgKeyType.containsKeyColumn("w_MRP_FLG")) {
						key.setw_MRP_FLG(msgKey.getKeyValue("w_MRP_FLG"));
					}
					if(msgKeyType.containsKeyColumn("w_WH_TYP")) {
						key.setw_WH_TYP(msgKey.getKeyValue("w_WH_TYP"));
					}
					if(msgKeyType.containsKeyColumn("s_ABC_TYP")) {
						key.sets_ABC_TYP(msgKey.getKeyValue("s_ABC_TYP"));
					}
					if(msgKeyType.containsKeyColumn("s_ABC_TYP_name")) {
						key.sets_ABC_TYP_name(msgKey.getKeyValue("s_ABC_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("s_ABC_TYP_val")) {
						key.sets_ABC_TYP_val(msgKey.getKeyValue("s_ABC_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("c_JOB_ODR_CD_STOCK_flg")) {
						key.setc_JOB_ODR_CD_STOCK_flg(msgKey.getKeyValue("c_JOB_ODR_CD_STOCK_flg"));
					}
					if(msgKeyType.containsKeyColumn("h_JOB_ODR_CD_STOCK_flg")) {
						key.seth_JOB_ODR_CD_STOCK_flg(msgKey.getKeyValue("h_JOB_ODR_CD_STOCK_flg"));
					}
					if(msgKeyType.containsKeyColumn("h_sort_flg")) {
						key.seth_sort_flg(msgKey.getKeyValue("h_sort_flg"));
					}
					if(msgKeyType.containsKeyColumn("w_JOB_ODR_CD")) {
						key.setw_JOB_ODR_CD(msgKey.getKeyValue("w_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_difference_rate")) {
						key.setw_difference_rate(msgKey.getKeyValue("w_difference_rate"));
					}
					if(msgKeyType.containsKeyColumn("r1_sort1")) {
						key.setr1_sort1(msgKey.getKeyValue("r1_sort1"));
					}
					if(msgKeyType.containsKeyColumn("r1_sort2")) {
						key.setr1_sort2(msgKey.getKeyValue("r1_sort2"));
					}
					if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE")) {
						key.setDOWNLOAD_FILE(msgKey.getKeyValue("DOWNLOAD_FILE"));
					}
					if(msgKeyType.containsKeyColumn("h_save_sort_flg")) {
						key.seth_save_sort_flg(msgKey.getKeyValue("h_save_sort_flg"));
					}
					if(msgKeyType.containsKeyColumn("w_STOCK_LOT_CD")) {
						key.setw_STOCK_LOT_CD(msgKey.getKeyValue("w_STOCK_LOT_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_STOCK_LOT_CD")) {
						key.setl_STOCK_LOT_CD(msgKey.getKeyValue("l_STOCK_LOT_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_lotCtrl")) {
						key.seth_lotCtrl(msgKey.getKeyValue("h_lotCtrl"));
					}
					if(msgKeyType.containsKeyColumn("r2_whlot1")) {
						key.setr2_whlot1(msgKey.getKeyValue("r2_whlot1"));
					}
					if(msgKeyType.containsKeyColumn("r2_whlot2")) {
						key.setr2_whlot2(msgKey.getKeyValue("r2_whlot2"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_NAME")) {
						key.setPLANT_NAME(msgKey.getKeyValue("PLANT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP")) {
						key.setMRP_ODR_TYP(msgKey.getKeyValue("MRP_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("MRP_FLG")) {
						key.setMRP_FLG(msgKey.getKeyValue("MRP_FLG"));
					}
					if(msgKeyType.containsKeyColumn("WH_TYP")) {
						key.setWH_TYP(msgKey.getKeyValue("WH_TYP"));
					}
					if(msgKeyType.containsKeyColumn("ABC_TYP")) {
						key.setABC_TYP(msgKey.getKeyValue("ABC_TYP"));
					}
					if(msgKeyType.containsKeyColumn("INV_DATE")) {
						key.setINV_DATE(msgKey.getKeyValue("INV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("REGULAR_INV_FLG")) {
						key.setREGULAR_INV_FLG(msgKey.getKeyValue("REGULAR_INV_FLG"));
					}
					if(msgKeyType.containsKeyColumn("CYCLE_INV_FLG")) {
						key.setCYCLE_INV_FLG(msgKey.getKeyValue("CYCLE_INV_FLG"));
					}
					if(msgKeyType.containsKeyColumn("TEMP_INV_FLG")) {
						key.setTEMP_INV_FLG(msgKey.getKeyValue("TEMP_INV_FLG"));
					}
					if(msgKeyType.containsKeyColumn("INV_STS_TYP")) {
						key.setINV_STS_TYP(msgKey.getKeyValue("INV_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("INV_START_DATE")) {
						key.setINV_START_DATE(msgKey.getKeyValue("INV_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_SAVE_DATE")) {
						key.setSTOCK_SAVE_DATE(msgKey.getKeyValue("STOCK_SAVE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("INV_UPDATED_DATE")) {
						key.setINV_UPDATED_DATE(msgKey.getKeyValue("INV_UPDATED_DATE"));
					}
					if(msgKeyType.containsKeyColumn("INV_COMMENT")) {
						key.setINV_COMMENT(msgKey.getKeyValue("INV_COMMENT"));
					}
					if(msgKeyType.containsKeyColumn("MODIFY_COUNT")) {
						key.setMODIFY_COUNT(msgKey.getKeyValue("MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
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
