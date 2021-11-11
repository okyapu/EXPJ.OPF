/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AA0050/src/com/nec/jp/orteus/metamorBase/AA0050/AA0050010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AA0050;

import com.nec.jp.orteus.metamorBase.AA0050.*;
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
import com.nec.jp.orteus.metamorBase.AA0050.AA0050Const;
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AA0050010Control
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

	public AA0050010Struct getStruct() { return this.struct; }	// Structの値（メディエータ）を返します。

	/* 内作代表フラグのチェックフラグ true ⇒ ON */
	boolean _WH_INSIDE_FLG = false;

	/* 外作代表フラグのチェックフラグ true ⇒ ON */
	boolean _WH_OUTSIDE_FLG = false;

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
	 * @param キー項目
	 */
	private void setSqlExceptionMsg(SQLException e, String key) throws ExpjException
	{
		// エラーメッセージ作成
		ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
		sysLog.severe(emsg, getsysUSER_CD());//致命的エラー エラー内容
		ExpjException ee = new ExpjException(e, emsg); // エクセプションを生成
		// emsg = new ExpjMessage( "ZZ01006", key );
		// sysLog.severe(emsg ,getsysUSER_CD()); //エラー詳細
		// ee.add(emsg);

		// emsg = new ExpjMessage( "ZZ01006", e.toString());
		// sysLog.severe(emsg ,getsysUSER_CD()); //エクセプションの詳細情報
		throw ee;
	}

	/**
	 * エラーメッセージ設定
	 * @param メッセージ番号
	 * @param 出力メッセージ
	 */
	private void setErrorMessage(String code, String key)
	{
		ExpjMessage emsg = new ExpjMessage(code);
		msgStruct.addError( emsg );	// エラーメッセージとして登録
		sysLog.warning(emsg, getsysUSER_CD()); //エラー内容
		emsg = new ExpjMessage( "ZZ01006", key );
		msgStruct.addError( emsg );	// エラーメッセージとして登録
		sysLog.warning(emsg, getsysUSER_CD()); //エラー詳細
	}

	/**
	 * エラーメッセージ設定(複数)
	 * @param メッセージ番号
	 * @param 出力メッセージ(List)
	 */
	private void setErrorMessage(String code, List key)
	{
		ExpjMessage emsg = new ExpjMessage(code);
		msgStruct.addError( emsg );	// エラーメッセージとして登録
		sysLog.warning(emsg, getsysUSER_CD()); //エラー内容
		for(int i=0; i<key.size(); i++)
		{
			emsg = new ExpjMessage( "ZZ01006", (String)key.get(i) );
			msgStruct.addError( emsg );	// エラーメッセージとして登録
			sysLog.warning(emsg, getsysUSER_CD()); //エラー詳細
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
		sysLog.info(emsg, getsysUSER_CD());
		emsg = new ExpjMessage( "ZZ01006", message );
		msgStruct.addWarn( emsg );
		sysLog.info(emsg, getsysUSER_CD());
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

//-----------------------------------------------------------------------------
	/** 画面共通定義取得クラス */
	ScreenParam _scParam = sp;

//------------ コンボボックスデータ--------------------------------------

	/** 倉庫区分 */
	private ComboStruct _WH_TYP = new ComboStruct();

	/** 倉庫区分設定
	 * @param コンボボックスデータ
	*/
	public void setWH_TYP(ComboStruct combo){ _WH_TYP = combo; }

	/** 倉庫区分取得
	 * @return 倉庫区分のコンボボックスデータ
	*/
	public ComboStruct getWH_TYP(){ return _WH_TYP; }


	/** 所要量計算対象フラグ */
	private ComboStruct _MRP_FLG = new ComboStruct();

	/** 所要量計算対象フラグ設定
	 * @param コンボボックスデータ
	*/
	public void setMRP_FLG(ComboStruct combo){ _MRP_FLG = combo; }

	/** 所要量計算対象フラグ取得
	 * @return 所要量計算対象フラグのコンボボックスデータ
	*/
	public ComboStruct getMRP_FLG(){ return _MRP_FLG; }

//------------------------------------------------------------------------------

	/** 読込フラグ設定用変数 */
	private String _read_flag = null;

	/**
	 * 読込フラグ設定
	 * @param String
	 */
	public String getReadFlag()
	{
		return _read_flag;
	}

	/** 
	 * 対象データが既に更新されているかどうかの判定処理
	 * （注意）for update nowaitが発動するので、この関数を呼ぶ前にトランザクション開始処理を行っておく必要あり
	 *
	 * @param target_struct 対象データ情報
	 * @param modify_count 対象データMODIFY_COUNT
	 * @return boolean true:エラーあり false:エラーなし
	 */
	private boolean checkTargetData(AA0050010Struct target_struct, String modify_count) throws FoundationException, SQLException
	{
		String keyMessage = "";

		// 処理対象データの存在チェック
		List temp_list = new ArrayList(0);

		temp_list = entity.mselectRetry.read(conn, target_struct);

		if(temp_list.size() <= 0)
		{

			// エラーメッセージ作成
			keyMessage = "M_WH.WH_CD:" + struct.getWH_CD();
			setErrorMessage("ZZ06001", keyMessage);
			return true;
		}
		else
		{

			// レコードが更新されていないかチェック
			AA0050010Struct temp_struct = (AA0050010Struct)temp_list.get(0);
			if(temp_struct.getMODIFY_COUNT().equals(modify_count) != true)
			{

				// エラーメッセージ作成
				keyMessage = "M_WH.WH_CD:" + struct.getWH_CD();
				setErrorMessage("ZZ01105", keyMessage);
				return true;
			}

          
		}

		return false;
	}

	/** 
	 * 取引先コードチェック処理
	 *
	 * @param target_struct 対象データ情報
	 * @return boolean true:エラーあり false:エラーなし
	 */
	private boolean checkVEND_CD(AA0050010Struct target_struct) throws FoundationException, SQLException
	{
		String keyMessage = "";

		// チェックフラグ初期化
		boolean bResult = false;

		//取引先が指定された場合
		if( (!"".equals(target_struct.getVEND_CD())) && (null != target_struct.getVEND_CD()) ) {
			//エラーチェック
			AA0050010Struct temp_struct = new AA0050010Struct();
			temp_struct.setWH_CD(target_struct.getWH_CD());
			temp_struct.setVEND_CD(target_struct.getVEND_CD());
			temp_struct.setWH_PLANT_CD(getsysPLANT_CD());
			List temp_list = new ArrayList();
			int count = 0;

			//取引先が存在しない
			temp_list = entity.mcheck_vend.read(conn, temp_struct);
			count = ((AA0050010Struct)temp_list.get(0)).getCOUNT().intValue();
			if(count == 0) {
				// エラーメッセージ作成
				keyMessage = "M_WH.VEND_CD:" + struct.getVEND_CD();
				setErrorMessage("AA01004", keyMessage);

				bResult = true;
			}

			//取引先の重複チェック
			temp_list = entity.mcheck_vend_in_wh.read(conn, temp_struct);
			count = ((AA0050010Struct)temp_list.get(0)).getCOUNT().intValue();
			if(count > 0) {
				// エラーメッセージ作成
				keyMessage = "M_WH.VEND_CD:" + struct.getVEND_CD();
				setErrorMessage("AA01008", keyMessage);

				bResult = true;
			}
		}
		return bResult;
	}

	/** 
	 * 更新時のワーニングチェック処理
	 */
	private void checkUpdateWarn() throws FoundationException, SQLException
	{
		boolean result = false;			// チェック結果格納用
		String keyMessage = "";
		List wkList = null;

		// ｢所要量計算対象フラグ｣＝０の場合
		if( struct.getMRP_FLG().intValue() == AA0050Const._MRP_NON ){
			result = entity.mcheck_wh_cd_in_wh_priority.check(conn, struct);
			// [品目別保管先優先順位]に登録済みの場合
			if(result == true) {
				keyMessage = "M_WH.WH_CD:" + struct.getWH_CD();
				setWarnMessage("AA60010", keyMessage);
			}

			wkList = entity.mM_ITEM_RCV_WH.read(conn, struct);
			// [品目別入庫先保管区]に登録済みの場合
			if( wkList.size() > 0 ){
				keyMessage = "M_WH.WH_CD:" + struct.getWH_CD();
				setWarnMessage("AA60011", keyMessage);
			}
		}

		wkList = entity.mM_WS.read(conn, struct);
		// 倉庫区分≠１で[作業区]に登録済みの場合
		if( struct.getWH_TYP().intValue() != AA0050Const._WH_KEEP_PLACE &&
			wkList.size() > 0 ){
			keyMessage = "M_WH.WH_CD:" + struct.getWH_CD();
			setWarnMessage("AA60012", keyMessage);
		}
	}

	/** 
	 * 登録・更新共通処理（エラーチェック）
	 */
  private void commonInstUpErr(String checkMode) throws FoundationException, SQLException
	{

		String keyMessage = "";
		List wkList = null;

		struct.setw_PLANT_CD(getsysPLANT_CD());

		// 内作代表フラグ＝１のカウント
		wkList = entity.mcheck_INCOUNT_M_WH.read(conn, struct);
		AA0050010Struct wkInStruct = (AA0050010Struct)wkList.get(0);

		// 外作代表フラグ＝１のカウント
		wkList = entity.mcheck_OUTCOUNT_M_WH.read(conn, struct);
		AA0050010Struct wkOutStruct = (AA0050010Struct)wkList.get(0);

		// ｢内作の代表保管区とする｣がONで、同一工場内に
		// ｢内作代表フラグ｣がONの他保管区が存在する場合
		if( struct.getWH_INSIDE_FLG().equals("true") &&
			wkInStruct.getw_INSIDE_COUNT().intValue() > 0 ){
			keyMessage = "M_WH.PLANT_CD:" + struct.getw_PLANT_CD();
			setErrorMessage("AA00153", keyMessage);
		}
		
		// ｢外作の代表保管区とする｣がONで、同一工場内に
		// ｢外作代表フラグ｣がONの他保管区が存在する場合
		if( struct.getWH_OUTSIDE_FLG().equals("true") &&
			wkOutStruct.getw_OUTSIDE_COUNT().intValue() > 0 ){
			keyMessage = "M_WH.PLANT_CD:" + struct.getw_PLANT_CD();
			setErrorMessage("AA00154", keyMessage);
		}
		// 検査待保管区が複数存在するかチェック
		if( !struct.getWH_TYP().toString().equals(struct.geth_WH_TYP()) ||
				checkMode.equals("INSERT") ){
            if( struct.getWH_TYP().intValue() == 40 ){
        	    boolean result = false;
        	    result = entity.mcheckINPCT_WH.check(conn, struct);
        	    if(result){
                    //エラーメッセージ作成
		            keyMessage = "WH_CD:" + struct.getWH_CD();
		            setErrorMessage("AA00221", keyMessage);
        	    }
            }
		}

      //出庫指示に設定されている保管区コードを変更した場合
      if (checkMode.equals("UPDATE")) {
          
        wkList = entity.mselect.read(conn, struct);
        wkInStruct = (AA0050010Struct)wkList.get(0);
      
        String oldVendCd = wkInStruct.getVEND_CD();
        String newVendCd = struct.getVEND_CD();
        if (oldVendCd == null){
        	oldVendCd = "";
        }
        if (newVendCd == null){
        	newVendCd = "";
        }
        
        if( ("".equals(oldVendCd) && !"".equals(newVendCd)) 
        		|| (!oldVendCd.equals(newVendCd)) ){
          AA0050010Struct issue_struct = new AA0050010Struct();            
          boolean result = false;

          issue_struct.setw_PLANT_CD(sysPLANT_CD);
          issue_struct.setWH_CD(struct.getWH_CD());

          result = entity.mcheckT_ISSUE_INST.check(conn, issue_struct);

          if ( result == true ) {
          
            // エラーメッセージ作成
            keyMessage = "T_ISSUE_INST:" + struct.getWH_CD();
            setErrorMessage("AA00160", keyMessage);
          }
        
        }

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
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0050");
		logger.entering("AA0050010Control"+":USER="+struct.getsUser_ID(),"controlselect");
			//{{user_implement_dev:<controlselect>
		String keyMessage = "";
		List key = new ArrayList();

		try {
			// クリア処理
			AA0050010Struct structCopy = new AA0050010Struct();
			structCopy.copy(struct);				// 表示項目退避
			struct.clear();							// 表示項目全クリア
			struct.initialize();					// 初期値設定
			struct.setWH_CD(structCopy.getWH_CD());	// キー値のみ再設定
			struct.setw_PLANT_CD(structCopy.getw_PLANT_CD());// 必要な項目を設定
			_WH_INSIDE_FLG = false;		// 内作代表フラグのチェックフラグ
			_WH_OUTSIDE_FLG = false;	// 外作代表フラグのチェックフラグ

			// データ読込
			AA0050010Struct temp_struct = new AA0050010Struct();
			list = entity.mselect.read(conn, struct);
			if(list.size() <= 0)
			{

				// 検索状態を「初期状態」に設定
				setReadStatus(INITIAL);

				// エラーメッセージ作成
				keyMessage = "M_WH.WH_CD:" + struct.getWH_CD();
				setErrorMessage("ZZ06001", keyMessage);

			}
			else
			{

				// 読込データ取得
				temp_struct.copy((AA0050010Struct)this.getListvalue(0));

				// 利用者の工場コード設定
				temp_struct.setw_PLANT_CD(struct.getw_PLANT_CD());

			}

			// その他チェック処理
			if(msgStruct.sizeError() <= 0)
			{
				// 保管区.工場コード ≠ 利用者工場コード チェック
				if(temp_struct.getw_PLANT_CD().equals(temp_struct.getWH_PLANT_CD()) != true)
				{
					// エラーメッセージ作成
					key.add("M_WH.WH_PLANT_CD:" + temp_struct.getWH_PLANT_CD());
					key.add("M_WH.PLANT_CD:" + temp_struct.getw_PLANT_CD());
					setErrorMessage("AA01007", key);
				}
			}

			// エラーなし
			if(msgStruct.sizeError() <= 0)
			{
				list = null;

				// 内作代表フラグのセット
				if( temp_struct.getw_WH_INSIDE_FLG().equals(AA0050Const._WH_INSIDE_NON) ){
					temp_struct.setWH_INSIDE_FLG("false");
				} else {
					temp_struct.setWH_INSIDE_FLG("true");
					_WH_INSIDE_FLG = true;
				}

				// 外作代表フラグのセット
				if( temp_struct.getw_WH_OUTSIDE_FLG().equals(AA0050Const._WH_OUTSIDE_NON) ){
					temp_struct.setWH_OUTSIDE_FLG("false");
				} else {
					temp_struct.setWH_OUTSIDE_FLG("true");
					_WH_OUTSIDE_FLG = true;
				}

				// 表示用structへデータコピー
				struct.copy(temp_struct);

				// 最後の読み込み成功キー設定
				struct.seth_LastWH_CD(struct.getWH_CD());
				
				// 倉庫区分Hidden項目
				struct.seth_WH_TYP(struct.getWH_TYP().toString());

				// 読込フラグ設定
				_read_flag = "readok";

				// 検索状態を「読込成功」に設定
				setReadStatus(NORMAL);
			}
			else
			{
				// 検索状態を「初期状態」に設定
				setReadStatus(INITIAL);
			}

		} catch(SQLException e) {

			// 検索状態を「読込失敗」に設定
			setReadStatus(ERROR);

			// エラーメッセージ作成
			keyMessage = "M_WH.WH_CD:" + struct.getWH_CD();
			setSqlExceptionMsg(e, keyMessage);

		}
                //}}user_implement_dev:<controlselect>
		logger.exiting("AA0050010Control"+":USER="+struct.getsUser_ID(),"controlselect");

		return;
	}

	/**
	 * 登録ボタン押下時に実行される処理です。
	 *
	 */
	public void controlinsert() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0050");
		logger.entering("AA0050010Control"+":USER="+struct.getsUser_ID(),"controlinsert");
			//{{user_implement_dev:<controlinsert>
		String keyMessage = "";

		try {
			//保管区存在チェック
			list = entity.mselect.read(conn, struct);
			if(list.size() > 0) {
				keyMessage = "M_WH.WH_CD:" + struct.getWH_CD();
				setErrorMessage("ZZ01102", keyMessage);
			}

			// 取引先コードチェック
			checkVEND_CD(struct);

			// 登録・更新共通処理（エラーチェック）
			commonInstUpErr("INSERT");

			// エラーがない場合、登録処理
			if(msgStruct.sizeError() == 0){

				// 登録用内作代表フラグのセット
				if( struct.getWH_INSIDE_FLG().equals("true") ){
					struct.setw_WH_INSIDE_FLG(AA0050Const._WH_INSIDE_TYPICAL);
				} else {
					struct.setw_WH_INSIDE_FLG(AA0050Const._WH_INSIDE_NON);
				}

				// 登録用外作代表フラグのセット
				if( struct.getWH_OUTSIDE_FLG().equals("true") ){
					struct.setw_WH_OUTSIDE_FLG(AA0050Const._WH_OUTSIDE_TYPICAL);
				} else {
					struct.setw_WH_OUTSIDE_FLG(AA0050Const._WH_OUTSIDE_NON);
				}

				//データ挿入
				int ret = entity.minsertM_WH.create(conn, struct);

				// 読み込み処理
				controlselect();
			}
		}
		catch(SQLException e) {
			keyMessage = "M_WH.WH_CD:" + struct.getWH_CD();
			setSqlExceptionMsg(e, keyMessage);
		}
                //}}user_implement_dev:<controlinsert>
		logger.exiting("AA0050010Control"+":USER="+struct.getsUser_ID(),"controlinsert");

		return;
	}

	/**
	 * 更新ボタン押下時に実行される処理です。
	 *
	 */
	public void controlupdate() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0050");
		logger.entering("AA0050010Control"+":USER="+struct.getsUser_ID(),"controlupdate");
			//{{user_implement_dev:<controlupdate>
		String keyMessage = "";
		List wkList = null;

		try {
			// トランザクション開始
			conn.beginTransWeb();  // ConnectionのAutoCommitフラグを制御します

			boolean result = false;			// チェック結果格納用

			// 処理対象データが更新されていないかチェック
			checkTargetData(struct, struct.getMODIFY_COUNT());

			// 取引先コードチェック
			checkVEND_CD(struct);

			// 登録・更新共通処理（エラーチェック）
			commonInstUpErr("UPDATE");

			// エラーがない場合、更新処理
			if(msgStruct.sizeError() == 0){

				// 登録用内作代表フラグのセット
				if( struct.getWH_INSIDE_FLG().equals("true") ){
					struct.setw_WH_INSIDE_FLG(AA0050Const._WH_INSIDE_TYPICAL);
				} else {
					struct.setw_WH_INSIDE_FLG(AA0050Const._WH_INSIDE_NON);
				}

				// 登録用外作代表フラグのセット
				if( struct.getWH_OUTSIDE_FLG().equals("true") ){
					struct.setw_WH_OUTSIDE_FLG(AA0050Const._WH_OUTSIDE_TYPICAL);
				} else {
					struct.setw_WH_OUTSIDE_FLG(AA0050Const._WH_OUTSIDE_NON);
				}

				//データ更新
				entity.mupdateM_WH.update(conn, struct);

				// コミット
				conn.commit();

				// 内作代表フラグがONからOFFに変更された場合
				if( _WH_INSIDE_FLG && struct.getw_WH_INSIDE_FLG().equals(AA0050Const._WH_INSIDE_NON) ){
					setWarnMessage("AA60013");
				}

				// 外作代表フラグがONからOFFに変更された場合
				if( _WH_OUTSIDE_FLG && struct.getw_WH_OUTSIDE_FLG().equals(AA0050Const._WH_OUTSIDE_NON) ){
					setWarnMessage("AA60014");
				}

				// 読み込み処理
				controlselect();

				//取引先が指定された場合
				if( (!"".equals(struct.getVEND_CD())) && (null != struct.getVEND_CD()) ) {
					//保管区の存在チェック（保管区別優先順位マスタ）
					result = entity.mcheck_wh_cd_in_wh_priority.check(conn, struct);
					if(result == true) {
						keyMessage = "M_WH.WH_CD:" + struct.getWH_CD();
						setWarnMessage("AA60008", keyMessage);
					}
				}







              
				// 更新時のワーニングチェック処理
				checkUpdateWarn();
			} else {

				// ロールバック
				conn.rollback();

			}

		} catch(SQLException e) {
			// ロールバック
			conn.rollback();

			// エラーメッセージ作成
			keyMessage = "M_WH.WH_CD:" + struct.getWH_CD();
			setSqlExceptionMsg(e, keyMessage);

		}catch(Exception e){
			// ロールバック
			conn.rollback();

			// エラーメッセージ作成
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);

			throw ee;

		}
                //}}user_implement_dev:<controlupdate>
		logger.exiting("AA0050010Control"+":USER="+struct.getsUser_ID(),"controlupdate");

		return;
	}

	/**
	 * 削除ボタン押下時に実行される処理です。
	 *
	 */
	public void controldelete() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0050");
		logger.entering("AA0050010Control"+":USER="+struct.getsUser_ID(),"controldelete");
			//{{user_implement_dev:<controldelete>
		String keyMessage = "";
		List key = new ArrayList();

		try {
			// トランザクション開始
			conn.beginTransWeb();

			// 処理対象データが更新されていないかチェック
			checkTargetData(struct, struct.getMODIFY_COUNT());

			// その他チェック処理
			if(msgStruct.sizeError() <= 0)
			{
				int count;
				List temp_list;	

				// 保管区.工場コード ≠ 利用者工場コード チェック
				if(struct.getw_PLANT_CD().equals(struct.getWH_PLANT_CD()) != true)
				{
					// エラーメッセージ作成
					key.add("M_WH.WH_PLANT_CD:" + struct.getWH_PLANT_CD());
					key.add("M_WH.PLANT_CD:" + struct.getw_PLANT_CD());
					setErrorMessage("AA01007", key);
				}

				//作業実績の存在チェック
				temp_list = entity.mcheck_opr_rslt.read(conn, struct);
				count = ((AA0050010Struct)temp_list.get(0)).getCOUNT().intValue();
				if(count > 0) {
					// エラーメッセージ作成
					keyMessage = "M_WH.WH_CD:" + struct.getWH_CD();
					setErrorMessage("AA00072", keyMessage);
				}

				//受入実績の存在チェック
				temp_list = entity.mcheck_acpt_rslt.read(conn, struct);
				count = ((AA0050010Struct)temp_list.get(0)).getCOUNT().intValue();
				if(count > 0) {
					// エラーメッセージ作成
					keyMessage = "M_WH.WH_CD:" + struct.getWH_CD();
					setErrorMessage("AA00073", keyMessage);
				}

				//検査実績の存在チェック
				temp_list = entity.mcheck_inspc_rslt.read(conn, struct);
				count = ((AA0050010Struct)temp_list.get(0)).getCOUNT().intValue();
				if(count > 0) {
					// エラーメッセージ作成
					keyMessage = "M_WH.WH_CD:" + struct.getWH_CD();
					setErrorMessage("AA00074", keyMessage);
				}

				//保管区別品目在庫の存在チェック
				temp_list = entity.mcheck_item_stock.read(conn, struct);
				count = ((AA0050010Struct)temp_list.get(0)).getCOUNT().intValue();
				if(count > 0) {
					// エラーメッセージ作成
					keyMessage = "M_WH.WH_CD:" + struct.getWH_CD();
					setErrorMessage("AA00075", keyMessage);
				}

				//保管区別製番在庫の存在チェック
				temp_list = entity.mcheck_job_odr_cd_stock.read(conn, struct);
				count = ((AA0050010Struct)temp_list.get(0)).getCOUNT().intValue();
				if(count > 0) {
					// エラーメッセージ作成
					keyMessage = "M_WH.WH_CD:" + struct.getWH_CD();
					setErrorMessage("AA00076", keyMessage);
				}

				//保管区別入出庫の存在チェック
				temp_list = entity.mcheck_rcv_issue.read(conn, struct);
				count = ((AA0050010Struct)temp_list.get(0)).getCOUNT().intValue();
				if(count > 0) {
					// エラーメッセージ作成
					keyMessage = "M_WH.WH_CD:" + struct.getWH_CD();
					setErrorMessage("AA00077", keyMessage);
				}

				//作業区の存在チェック
				temp_list = entity.mcheck_wh_cd_in_ws.read(conn, struct);
				count = ((AA0050010Struct)temp_list.get(0)).getCOUNT().intValue();
				if(count > 0) {
					// エラーメッセージ作成
					keyMessage = "M_WH.WH_CD:" + struct.getWH_CD();
					setErrorMessage("AA00124", keyMessage);
				}

				//出来高実績の存在チェック
				temp_list = entity.mcheck_output_rslt.read(conn, struct);
				count = ((AA0050010Struct)temp_list.get(0)).getCOUNT().intValue();
				if(count > 0) {
					// エラーメッセージ作成
					keyMessage = "M_WH.WH_CD:" + struct.getWH_CD();
					setErrorMessage("AA00078", keyMessage);
				}

				//工場マスタの存在チェック
				temp_list = entity.mcheck_plant.read(conn, struct);
				count = ((AA0050010Struct)temp_list.get(0)).getCOUNT().intValue();
				if(count > 0) {
					// エラーメッセージ作成
					keyMessage = "M_WH.WH_CD:" + struct.getWH_CD();
					setErrorMessage("AA00125", keyMessage);
				}

                //品目別入庫先保管区との参照整合性チェック
                temp_list = entity.mM_ITEM_RCV_WH.read(conn, struct);
                // [品目別入庫先保管区]に登録済みの場合
                if( !temp_list.isEmpty() && temp_list.size() > 0 ){

                  keyMessage = "M_WH.WH_CD:" + struct.getWH_CD();
                  setErrorMessage("AA00161", keyMessage);
                }

				// 発注残の存在チェック
				boolean bT_RLSD_PUCH_ODR = false;
				bT_RLSD_PUCH_ODR = entity.mcheckT_RLSD_PUCH_ODR.check(conn,struct);
				if(bT_RLSD_PUCH_ODR){
						// エラーメッセージ作成
						keyMessage = "M_WH.WH_CD:" + struct.getWH_CD();
						setErrorMessage("AA00172", keyMessage);
				}
				
				//出庫指示の存在チェック
		        boolean result = false;
		        struct.setw_PLANT_CD(sysPLANT_CD);
		        result = entity.mcheckT_ISSUE_INST.check(conn, struct);
		        if ( result == true ) {		          
			          // エラーメッセージ作成
			          keyMessage = "T_ISSUE_INST:" + struct.getWH_CD();
			          setErrorMessage("AA00163", keyMessage);
		        }
			}
			

			// エラーがない場合、削除処理
			if(msgStruct.sizeError() <= 0){

				// 削除
				entity.mdeleteM_WH.delete(conn, struct);

				// コミット
				conn.commit();

				// 内作代表フラグがONのデータが削除された場合
				if( _WH_INSIDE_FLG  ){
					setWarnMessage("AA60013");
				}

				// 外作代表フラグがONのデータが削除された場合
				if( _WH_OUTSIDE_FLG  ){
					setWarnMessage("AA60014");
				}

				// クリア処理
				controlclear();
			}
			else
			{

				// ロールバック
				conn.rollback();
			}

		} catch(SQLException e) {
			// ロールバック
			conn.rollback();

			// エラーメッセージ作成
			keyMessage = "M_WH.WH_CD:" + struct.getWH_CD();
			setSqlExceptionMsg(e, keyMessage);

		}catch(Exception e){
			// ロールバック
			conn.rollback();

			// エラーメッセージ作成
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);

			throw ee;

		}
                //}}user_implement_dev:<controldelete>
		logger.exiting("AA0050010Control"+":USER="+struct.getsUser_ID(),"controldelete");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlclear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0050");
		logger.entering("AA0050010Control"+":USER="+struct.getsUser_ID(),"controlclear");
			//{{user_implement_dev:<controlclear>
		if(list != null){
			list.clear();
		}
		else{
			list = new ArrayList(0);
		}
		this.struct.initialize();

		// 検索状態を「初期状態」に設定
		setReadStatus(INITIAL);

                //}}user_implement_dev:<controlclear>
		logger.exiting("AA0050010Control"+":USER="+struct.getsUser_ID(),"controlclear");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0050");
		logger.entering("AA0050010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
		// 検索状態を「初期状態」に設定
		setReadStatus(INITIAL);
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AA0050010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0050");
		logger.entering("AA0050010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
		String keyMessage = "";

		try {
			// コンボボックスデータ用意
			ComboBox controller = new ComboBox(conn, sysUSER_CD);
			_WH_TYP = controller.getData("WH_TYP");
			_MRP_FLG = controller.getData("MRP_FLG");

		}catch(SQLException e){
			// エラーメッセージ作成
			keyMessage = "";
			setSqlExceptionMsg(e, keyMessage);

		}catch(ComboException e){
			// エラーメッセージ作成
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);

			throw ee;

		}catch(Exception e){
			// エラーメッセージ作成
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);

			throw ee;
		}
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AA0050010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * イベントハンドラの前処理です。
	 *
	 * @param buttun ボタン名
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0050");
		logger.entering("AA0050010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
		logger.exiting("AA0050010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			struct.setList_WH_TYP_val(_WH_TYP.getValList());
			struct.setList_WH_TYP_name(_WH_TYP.getExplanList());
			struct.setList_MRP_FLG_val(_MRP_FLG.getValList());
			struct.setList_MRP_FLG_name(_MRP_FLG.getExplanList());
                //}}user_implement_dev:<control_eventHandller>
		} catch( BusinessLockException ble ) {
			// 枠メッセージ出力依頼作成
			setNewDataFlg(false);
		} catch( ResourceBusyException rbe ) {
			ExpjException ee = new ExpjException(rbe, "ZZ01105");
			throw ee;
		} catch( FoundationException e ) {
//			e.printStackTrace();
//			throw new FoundationException("AA0050010Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AA0050010-E999","CSVの出力処理"));
			throw new FoundationException("AA0050010Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AA0050010-E999","システム日付の取得処理"));
				throw new FoundationException("AA0050010Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AA0050010-E999","コントロールのイベント処理"));
			throw new FoundationException("AA0050010Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected AA0050010Entity entity;
	protected AA0050010Struct struct;
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

		entity = new AA0050010Entity();
		struct = new AA0050010Struct();

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
	 * AA0050010クラスの標準コンストラクタ
	 */
	public AA0050010Control() throws BusinessProcessException, FoundationException
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
				AA0050010Struct key = (AA0050010Struct)keyList.get(j);
				// メッセージキーを作成する
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("WH_TYP_name") && key.getWH_TYP_name() != null) {
					msgKey.setKeyValue("WH_TYP_name", key.getWH_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("WH_TYP_val") && key.getWH_TYP_val() != null) {
					msgKey.setKeyValue("WH_TYP_val", key.getWH_TYP_val().toString());
				}
				if(msgKeyType.containsKeyColumn("MRP_FLG_name") && key.getMRP_FLG_name() != null) {
					msgKey.setKeyValue("MRP_FLG_name", key.getMRP_FLG_name());
				}
				if(msgKeyType.containsKeyColumn("MRP_FLG_val") && key.getMRP_FLG_val() != null) {
					msgKey.setKeyValue("MRP_FLG_val", key.getMRP_FLG_val().toString());
				}
				if(msgKeyType.containsKeyColumn("h_LastWH_CD") && key.geth_LastWH_CD() != null) {
					msgKey.setKeyValue("h_LastWH_CD", key.geth_LastWH_CD());
				}
				if(msgKeyType.containsKeyColumn("WH_INSIDE_FLG") && key.getWH_INSIDE_FLG() != null) {
					msgKey.setKeyValue("WH_INSIDE_FLG", key.getWH_INSIDE_FLG());
				}
				if(msgKeyType.containsKeyColumn("WH_OUTSIDE_FLG") && key.getWH_OUTSIDE_FLG() != null) {
					msgKey.setKeyValue("WH_OUTSIDE_FLG", key.getWH_OUTSIDE_FLG());
				}
				if(msgKeyType.containsKeyColumn("h_WH_TYP") && key.geth_WH_TYP() != null) {
					msgKey.setKeyValue("h_WH_TYP", key.geth_WH_TYP());
				}
				if(msgKeyType.containsKeyColumn("COUNT") && key.getCOUNT() != null) {
					msgKey.setKeyValue("COUNT", key.getCOUNT().toString());
				}
				if(msgKeyType.containsKeyColumn("COMPANY_CD") && key.getCOMPANY_CD() != null) {
					msgKey.setKeyValue("COMPANY_CD", key.getCOMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("w_PLANT_CD") && key.getw_PLANT_CD() != null) {
					msgKey.setKeyValue("w_PLANT_CD", key.getw_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("w_INSIDE_COUNT") && key.getw_INSIDE_COUNT() != null) {
					msgKey.setKeyValue("w_INSIDE_COUNT", key.getw_INSIDE_COUNT().toString());
				}
				if(msgKeyType.containsKeyColumn("w_OUTSIDE_COUNT") && key.getw_OUTSIDE_COUNT() != null) {
					msgKey.setKeyValue("w_OUTSIDE_COUNT", key.getw_OUTSIDE_COUNT().toString());
				}
				if(msgKeyType.containsKeyColumn("w_WH_INSIDE_FLG") && key.getw_WH_INSIDE_FLG() != null) {
					msgKey.setKeyValue("w_WH_INSIDE_FLG", key.getw_WH_INSIDE_FLG());
				}
				if(msgKeyType.containsKeyColumn("w_WH_OUTSIDE_FLG") && key.getw_WH_OUTSIDE_FLG() != null) {
					msgKey.setKeyValue("w_WH_OUTSIDE_FLG", key.getw_WH_OUTSIDE_FLG());
				}
				if(msgKeyType.containsKeyColumn("WH_CD") && key.getWH_CD() != null) {
					msgKey.setKeyValue("WH_CD", key.getWH_CD());
				}
				if(msgKeyType.containsKeyColumn("WH_NAME") && key.getWH_NAME() != null) {
					msgKey.setKeyValue("WH_NAME", key.getWH_NAME());
				}
				if(msgKeyType.containsKeyColumn("WH_TYP") && key.getWH_TYP() != null) {
					msgKey.setKeyValue("WH_TYP", key.getWH_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("VEND_CD") && key.getVEND_CD() != null) {
					msgKey.setKeyValue("VEND_CD", key.getVEND_CD());
				}
				if(msgKeyType.containsKeyColumn("VEND_ANAME") && key.getVEND_ANAME() != null) {
					msgKey.setKeyValue("VEND_ANAME", key.getVEND_ANAME());
				}
				if(msgKeyType.containsKeyColumn("MRP_FLG") && key.getMRP_FLG() != null) {
					msgKey.setKeyValue("MRP_FLG", key.getMRP_FLG().toString());
				}
				if(msgKeyType.containsKeyColumn("WH_ADDR1") && key.getWH_ADDR1() != null) {
					msgKey.setKeyValue("WH_ADDR1", key.getWH_ADDR1());
				}
				if(msgKeyType.containsKeyColumn("WH_ADDR2") && key.getWH_ADDR2() != null) {
					msgKey.setKeyValue("WH_ADDR2", key.getWH_ADDR2());
				}
				if(msgKeyType.containsKeyColumn("WH_TEL") && key.getWH_TEL() != null) {
					msgKey.setKeyValue("WH_TEL", key.getWH_TEL());
				}
				if(msgKeyType.containsKeyColumn("WH_PERSON") && key.getWH_PERSON() != null) {
					msgKey.setKeyValue("WH_PERSON", key.getWH_PERSON());
				}
				if(msgKeyType.containsKeyColumn("MODIFY_COUNT") && key.getMODIFY_COUNT() != null) {
					msgKey.setKeyValue("MODIFY_COUNT", key.getMODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("WH_PLANT_CD") && key.getWH_PLANT_CD() != null) {
					msgKey.setKeyValue("WH_PLANT_CD", key.getWH_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("w_ISSUE_INST_CD") && key.getw_ISSUE_INST_CD() != null) {
					msgKey.setKeyValue("w_ISSUE_INST_CD", key.getw_ISSUE_INST_CD());
				}
				if(msgKeyType.containsKeyColumn("w_INSPC_WH_CD") && key.getw_INSPC_WH_CD() != null) {
					msgKey.setKeyValue("w_INSPC_WH_CD", key.getw_INSPC_WH_CD());
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
					AA0050010Struct key = new AA0050010Struct();
					if(msgKeyType.containsKeyColumn("WH_TYP_name")) {
						key.setWH_TYP_name(msgKey.getKeyValue("WH_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("WH_TYP_val")) {
						key.setWH_TYP_val(new Integer(msgKey.getKeyValue("WH_TYP_val")));
					}
					if(msgKeyType.containsKeyColumn("MRP_FLG_name")) {
						key.setMRP_FLG_name(msgKey.getKeyValue("MRP_FLG_name"));
					}
					if(msgKeyType.containsKeyColumn("MRP_FLG_val")) {
						key.setMRP_FLG_val(new Integer(msgKey.getKeyValue("MRP_FLG_val")));
					}
					if(msgKeyType.containsKeyColumn("h_LastWH_CD")) {
						key.seth_LastWH_CD(msgKey.getKeyValue("h_LastWH_CD"));
					}
					if(msgKeyType.containsKeyColumn("WH_INSIDE_FLG")) {
						key.setWH_INSIDE_FLG(msgKey.getKeyValue("WH_INSIDE_FLG"));
					}
					if(msgKeyType.containsKeyColumn("WH_OUTSIDE_FLG")) {
						key.setWH_OUTSIDE_FLG(msgKey.getKeyValue("WH_OUTSIDE_FLG"));
					}
					if(msgKeyType.containsKeyColumn("h_WH_TYP")) {
						key.seth_WH_TYP(msgKey.getKeyValue("h_WH_TYP"));
					}
					if(msgKeyType.containsKeyColumn("COUNT")) {
						key.setCOUNT(new Long(msgKey.getKeyValue("COUNT")));
					}
					if(msgKeyType.containsKeyColumn("COMPANY_CD")) {
						key.setCOMPANY_CD(msgKey.getKeyValue("COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_PLANT_CD")) {
						key.setw_PLANT_CD(msgKey.getKeyValue("w_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_INSIDE_COUNT")) {
						key.setw_INSIDE_COUNT(new Integer(msgKey.getKeyValue("w_INSIDE_COUNT")));
					}
					if(msgKeyType.containsKeyColumn("w_OUTSIDE_COUNT")) {
						key.setw_OUTSIDE_COUNT(new Integer(msgKey.getKeyValue("w_OUTSIDE_COUNT")));
					}
					if(msgKeyType.containsKeyColumn("w_WH_INSIDE_FLG")) {
						key.setw_WH_INSIDE_FLG(msgKey.getKeyValue("w_WH_INSIDE_FLG"));
					}
					if(msgKeyType.containsKeyColumn("w_WH_OUTSIDE_FLG")) {
						key.setw_WH_OUTSIDE_FLG(msgKey.getKeyValue("w_WH_OUTSIDE_FLG"));
					}
					if(msgKeyType.containsKeyColumn("WH_CD")) {
						key.setWH_CD(msgKey.getKeyValue("WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("WH_NAME")) {
						key.setWH_NAME(msgKey.getKeyValue("WH_NAME"));
					}
					if(msgKeyType.containsKeyColumn("WH_TYP")) {
						key.setWH_TYP(new Integer(msgKey.getKeyValue("WH_TYP")));
					}
					if(msgKeyType.containsKeyColumn("VEND_CD")) {
						key.setVEND_CD(msgKey.getKeyValue("VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("VEND_ANAME")) {
						key.setVEND_ANAME(msgKey.getKeyValue("VEND_ANAME"));
					}
					if(msgKeyType.containsKeyColumn("MRP_FLG")) {
						key.setMRP_FLG(new Integer(msgKey.getKeyValue("MRP_FLG")));
					}
					if(msgKeyType.containsKeyColumn("WH_ADDR1")) {
						key.setWH_ADDR1(msgKey.getKeyValue("WH_ADDR1"));
					}
					if(msgKeyType.containsKeyColumn("WH_ADDR2")) {
						key.setWH_ADDR2(msgKey.getKeyValue("WH_ADDR2"));
					}
					if(msgKeyType.containsKeyColumn("WH_TEL")) {
						key.setWH_TEL(msgKey.getKeyValue("WH_TEL"));
					}
					if(msgKeyType.containsKeyColumn("WH_PERSON")) {
						key.setWH_PERSON(msgKey.getKeyValue("WH_PERSON"));
					}
					if(msgKeyType.containsKeyColumn("MODIFY_COUNT")) {
						key.setMODIFY_COUNT(msgKey.getKeyValue("MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("WH_PLANT_CD")) {
						key.setWH_PLANT_CD(msgKey.getKeyValue("WH_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_ISSUE_INST_CD")) {
						key.setw_ISSUE_INST_CD(msgKey.getKeyValue("w_ISSUE_INST_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_INSPC_WH_CD")) {
						key.setw_INSPC_WH_CD(msgKey.getKeyValue("w_INSPC_WH_CD"));
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
