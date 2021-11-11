/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AA0090/src/com/nec/jp/orteus/metamorBase/AA0090/AA0090030Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AA0090;

import com.nec.jp.orteus.metamorBase.AA0090.*;
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
import com.nec.jp.orteus.expj.mstappr.MstAppr;
import com.nec.jp.orteus.expj.mstappr.MstApprDetailListStruct;
import com.nec.jp.orteus.expj.mstappr.MstApprDetailStruct;
import com.nec.jp.orteus.expj.mstappr.MstApprKeyStruct;
import com.nec.jp.orteus.expj.mstappr.MstApprStruct;
import com.nec.jp.orteus.expj.mstappr.MstColumns;
import com.nec.jp.orteus.metamorBase.util.AlarmMessage.AlarmMessageException;
import com.nec.jp.orteus.xaf.common.XafTools;

//}}user_implement_code_import

//{{user_implement_code_header

//}}user_implement_code_header

public class AA0090030Control
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

	public AA0090030Struct getStruct() { return this.struct; }	// Structの値（メディエータ）を返します。

	/** 利用者マスタテーブルの更新数 */
	private String _USER_MST_count = null;

//------------------------------------------------------------------------------

	/** 画面共通定義取得クラス */
	ScreenParam _scParam = sp;
//------------------------------------------------------------------------------
		
/**多言語 */
	private ComboStruct _LOCALE = new ComboStruct();

	/** 多言語設定 */
	/** @param コンボボックスデータ*/
		
	public void setLOCALE(ComboStruct combo){ _LOCALE = combo; }

	/** 多言語取得
	 * @return 多言語のコンボボックスデータ
	*/
	public ComboStruct getLOCALE(){ return _LOCALE; }		
		
	private ComboStruct _APPR_POWER_TYP = new ComboStruct();
	
	public ComboStruct get_APPR_POWER_TYP() {
		return _APPR_POWER_TYP;
	}
	public void set_APPR_POWER_TYP(ComboStruct _appr_power_typ) {
		_APPR_POWER_TYP = _appr_power_typ;
	}
//---------- メッセージ関連の処理-- --------------------------------------------

	
	/**
	 * メッセージ取得 
	 * @@return メッセージ
	 */
	public MessageStruct getMessage()
	{
		return msgStruct;
	}

	/**
	 * メッセージ設定
	 * @@param メッセージ
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
     * 画面エラーメッセージ設定
     * @param メッセージ番号
     */
    private void setErrorMessage(String code){
     ExpjMessage emsg = new ExpjMessage(code);
     msgStruct.addError( emsg );	// エラーメッセージとして登録
     sysLog.warning(emsg, getsysUSER_CD()); //エラー内容
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

//------------------------------------------------------------------

	/** 最終読込キー（利用者コード）格納用変数 */
	private String _lastUSER_CD = "";

	/** 
	 * 最終読込キー（利用者コード）取得処理
	 *
	 * @return String
	 */
	public String getLastUSER_CD()
	{
		return _lastUSER_CD;
	}

	public void setLastUSER_CD(String user_cd){
		_lastUSER_CD = user_cd;
	}
	/** 会社コード格納用変数 */
	private String _COMPANY_CD = null;

	/** 
	 * 会社コード読込処理
	 *
	 * @return boolean
	 */
	private boolean readCOMPANY_CD() throws BusinessProcessException, FoundationException
	{
		String keyMessage = "";

		try {

			List workList = new ArrayList(0);
			_COMPANY_CD = null;

			// 会社コード読込
			workList = entity.mselectSYS_MY_COMPANY.read(conn, struct);
			if(workList.size() <= 0){
				return false;
			}

			AA0090030Struct workStruct = (AA0090030Struct)workList.get(0);
			_COMPANY_CD = workStruct.getCOMPANY_CD();

		} catch(SQLException e) {
			// エラーメッセージ作成
			keyMessage = "";
			setSqlExceptionMsg(e, keyMessage);

			return false;

		}

		return true;
	}

	/** 
	 * 業務運用日読込処理
	 *
	 * @return boolean
	 */
	private String readBUSINESS_OPR_DATE(String plantCd) throws BusinessProcessException, FoundationException
	{
		String businessDate = null;
		try {
			// 業務運用日読込
			List businessList = entity.mselectBUSINESS_OPR_DATE.read(conn, struct);
			if(businessList.size() > 0){
				businessDate = ((AA0090030Struct)businessList.get(0)).getBUSINESS_OPR_DATE();
			}
		} catch(SQLException e) {
			// エラーメッセージ作成
			setSqlExceptionMsg(e, "");
		}
		return businessDate;
	}
	
	/** 
	 * 対象データ存在判定処理
	 * （注意）for update nowaitが発動するので、この関数を呼ぶ前にトランザクション開始処理を行っておく必要あり
	 *
	 * @param target_struct 対象データ
	 * @return boolean true:存在する false:存在しない
	 */
	private boolean isTargetData(AA0090030Struct target_struct) throws FoundationException, SQLException
	{
		// 処理対象データの存在チェック
		List temp_list = new ArrayList(0);
		temp_list = entity.mselectRetry.read(conn, target_struct);
		if(temp_list.size() <= 0)
		{
			return false;
		}
		return true;
	}

	/** 
	 * 対象データが既に更新されているかどうかの判定処理
	 * （注意）for update nowaitが発動するので、この関数を呼ぶ前にトランザクション開始処理を行っておく必要あり
	 *
	 * @param target_struct 対象データ情報
	 * @param modify_count 対象データMODIFY_COUNT
	 * @return boolean true:エラーあり false:エラーなし
	 */
	private boolean checkTargetData(AA0090030Struct target_struct, String modify_count) throws FoundationException, SQLException
	{
		String keyMessage = "";

		// 処理対象データの存在チェック
		List temp_list = new ArrayList(0);
		temp_list = entity.mselectRetry.read(conn, target_struct);
		if(temp_list.size() <= 0)
		{
			// エラーメッセージ作成
			keyMessage = "USER_MST.USER_CD:" + struct.getUSER_CD();
			setErrorMessage("ZZ06001", keyMessage);
			return true;
		}
		else
		{
			// レコードが更新されていないかチェック
			AA0090030Struct temp_struct = (AA0090030Struct)temp_list.get(0);

			if(temp_struct.getMODIFY_COUNT().equals(modify_count) != true)
			{
				// エラーメッセージ作成
				keyMessage = "USER_MST.USER_CD:" + struct.getUSER_CD();
				setErrorMessage("ZZ01105", keyMessage);
				return true;
			}
		}

		return false;
	}

	/** 
	 * 業務グループデータ登録処理
	 *
	 * @return 更新数
	 */
	private void insertBusinessGroup() throws FoundationException, SQLException {
		List _flgs = struct.getList_BUSINESS_GROUP_VALID_FLG();
		List _ids = struct.getList_BUSINESS_GROUP_CD();

		for (int idx = 0; idx < _ids.size(); idx++) {
			String _flg = (String) _flgs.get(idx);
			String _id = (String) _ids.get(idx);

			// 所属していない部門は登録しない
			if (("true").equals(_flg) == false) {
				continue;
			}

			// 登録する業務グループを設定し、登録する
			AA0090030Struct _createStruct = new AA0090030Struct();
			_createStruct.basicCopy(struct);
			_createStruct.setStruct(struct);

			_createStruct.setBUSINESS_GROUP_CD(_id);

			entity.minsertBELONG_MST_BY_USER.create(conn, _createStruct);

		}
		return;
	}

// ------------------------------------------------------------------

	/** 非表示業務グループ情報アクセスキー */
	private final static String _DISABLE_BUSINESS_GROUP_ACCESS_KEY = "DISABLE_BUSINESS_G";

	/** 業務グループデータ格納用 */
	private List _listBusinessGroup = null;

	/** 
	 * 業務グループリストサイズ取得
	 *
	 * @return size 業務グループリストサイズ
	 */
	public int getBusinessGroupListSize()
	{
		int num = 0;
		if(_listBusinessGroup != null)
		{
			num = _listBusinessGroup.size();
		}
		return num;
	}

	/** 
	 * 指定された業務グループリストデータ取得
	 *
	 * @param index
	 * @return Object 業務グループリストデータ
	 */
	public Object getBusinessGroupListValue(int index)
	{
		return _listBusinessGroup.get(index);
	}




	/** 業務グループデータ格納用（指定ユーザ用） */
	private List _listBusinessGroupByUser = null;

	/** 
	 * 業務グループリストサイズ取得（指定ユーザ用）
	 *
	 * @return size 業務グループリストサイズ
	 */
	public int getBusinessGroupListSizeByUser()
	{
		int num = 0;
		if(_listBusinessGroupByUser != null)
		{
			num = _listBusinessGroupByUser.size();
		}
		return num;
	}

	/** 
	 * 指定された業務グループリストデータ取得（指定ユーザ用）
	 *
	 * @param index
	 * @return Object 業務グループリストデータ
	 */
	public Object getBusinessGroupListValueByUser(int index)
	{
		return _listBusinessGroupByUser.get(index);
	}

	/**
	 * 遷移類型　
	 * 0:　マスタ情報
	 * 1:　承認情報
	 */
	private String screen_move_typ = null;
	
	/**
	 * @return Returns the screen_move_typ.
	 */
	public String getScreen_move_typ() {
		return screen_move_typ;
	}
	/**
	 * @param screen_move_typ The screen_move_typ to set.
	 */
	public void setScreen_move_typ(String screen_move_typ) {
		this.screen_move_typ = screen_move_typ;
	}
	
	/**
	 * マスタキーの集う
	 */
	private HashMap keyvalueMap = new HashMap();
	
	/**
	 * @return Returns the keyvalueMap.
	 */
	public HashMap getKeyvalueMap() {
		return keyvalueMap;
	}
	/**
	 * @param keyvalueMap The keyvalueMap to set.
	 */
	public void setKeyvalueMap(HashMap keyvalueMap) {
		this.keyvalueMap = keyvalueMap;
	}
	/** 利用者承認 */
	private String _APR_USER_MST = null;
		
	/**
	 * 登録/更新時 依存マスタのチェック
	 * メッセージ登録/関連項目のクリアも行う
	 * @return true:OK / false:NG
	 */
	private boolean existDependsMaster() throws SQLException, FoundationException
	{
		boolean result = true;
		String keyMessage = "";

		// 工場コード存在チェック
		List temp_list = entity.mselectM_PLANT.read(conn, struct);
		if(temp_list.size() <= 0)
		{
			// エラーメッセージ作成
			keyMessage = "M_PLANT.PLANT_CD:" + struct.getPLANT_CD();
			setErrorMessage("AA01012", keyMessage);
			struct.setPLANT_NAME("");
			result = false;
		}
		
		// 部門コードが設定されている場合はの存在チェックを行う
		if (struct.getSECTION_CD() != null && !"".equals(struct.getSECTION_CD())) {
		 	struct.setCOMPANY_CD(_COMPANY_CD);
			temp_list = entity.mselectM_ORG.read(conn, struct);
			if(temp_list.size() <= 0)
			{
				// エラーメッセージ作成
				keyMessage = "M_ORG.ORG_CD:" + struct.getSECTION_CD();
				setErrorMessage("AA20054", keyMessage);
				struct.setPLANT_NAME("");
				result = false;
			}
		}
		return result;
	}

	/**
	 * 削除時 得意先マスタの依存のチェック
	 * @return true:OK / false:NG
	 */
	private boolean existDependsMasterForDel() throws SQLException, FoundationException
	{
		boolean result = true;
		String keyMessage = "";

		// 得意先マスタ.自社担当者コード存在チェック
		List temp_list = entity.mselectM_CUST.read(conn, struct);
		if(temp_list.size() > 0)
		{
			// エラーメッセージ作成
			keyMessage = "M_CUST.OWN_PERSON_CD:" + ((AA0090030Struct)temp_list.get(0)).getOWN_PERSON_CD();
			setErrorMessage("AA01017", keyMessage);
			result = false;
		}

		// 得意先支店.自社担当者コード存在チェック
		temp_list = entity.mselectM_CUST_BRANCH.read(conn, struct);
		if(temp_list.size() > 0)
		{
			// エラーメッセージ作成
			keyMessage = "USER_MST.USER_CD:" + ((AA0090030Struct)temp_list.get(0)).getOWN_PERSON_CD();
			setErrorMessage("AA02015", keyMessage);
			result = false;
		}
		return result;
	}


	/**
	 * チェックボックスの情報を元にリストを
	 * 再作成する
	 */
	private void reMakeList()
	{
		list.clear();
		for(int i = 0; i < struct.getList_BUSINESS_GROUP_VALID_FLG().size(); i++) {
		
			AA0090030Struct tmpStruct = new AA0090030Struct();
			
			// 選択行の情報を取得
        	tmpStruct.importData(struct, i);
			
			list.add(tmpStruct);
		
		}
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
		sysLog.info(emsg, getsysUSER_CD());
	}
	
	/**
	 * 画面遷移時、キーの取得
	 *
	 */
	private void getKey(){
		struct.setUSER_CD(keyvalueMap.get("USER_CD").toString());
	}
	/**
	 * 承認情報を登録
	 * @param button
	 * @throws SQLException
	 */
	private void insertAppr(String button) throws SQLException{
		// マスタ承認部品
		MstAppr mstappr = new MstAppr(conn,this.getsysPLANT_CD(),this.getsysUSER_CD(),"AA0090030","AA0090030Servlet");
		String appr_ID = null;                             // 承認IDを保存用の臨時変数 
		MstApprStruct mstApprStruct = new MstApprStruct(); // 
		String columnID = null;                            //
		MstApprKeyStruct keyStruct = new MstApprKeyStruct();
		// 	承認依頼存在チェック
		ArrayList keyvalueList = new ArrayList();
		MstColumns keyvalue = new MstColumns();
		keyvalue.setColumnname("USER_CD");
		keyvalue.setColumnvalue(struct.getUSER_CD());
		keyvalueList.add(keyvalue);
		if(mstappr.checkMST_APPR("USER_MST",keyvalueList)){
			setErrorMessage("KA00125");
			return;
		}
		
		// 	承認依頼表にデータを追加	
		mstApprStruct.setSCREEN_URL("AA0090030Servlet");          // 画面URL
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
		keyStruct.setTABLE_NAME("USER_MST");
		keyStruct.setKEY_NAME("USER_CD");
		keyStruct.setKEY_VALUE(struct.getUSER_CD());
		mstappr.insertMST_APPR_KEY(keyStruct);
		
		// 承認明細表にマスタ情報を追加
		String nowdate = mstappr.readSystemDateTime();
		// 利用者マスタを整理	
		// ユーザコード
		columnID = mstappr.getColumnID("USER_MST","USER_CD");
		mstappr.setDetailByColumnID(struct.getUSER_CD(),columnID);
		// ユーザ名
		columnID = mstappr.getColumnID("USER_MST","USER_NAME");
		mstappr.setDetailByColumnID(struct.getUSER_NAME(),columnID);
		// 工場コード
		columnID = mstappr.getColumnID("USER_MST","PLANT_CD");
		mstappr.setDetailByColumnID(struct.getPLANT_CD(),columnID);
		// パスワード
		columnID = mstappr.getColumnID("USER_MST","PASSWORD");
		mstappr.setDetailByColumnID(struct.getPASSWORD(),columnID);
		// 会社コード
		columnID = mstappr.getColumnID("USER_MST","COMPANY_CD");
		mstappr.setDetailByColumnID(struct.getCOMPANY_CD(),columnID);
		// メールアドレス
		columnID = mstappr.getColumnID("USER_MST","ADDRESS");
		mstappr.setDetailByColumnID(struct.getADDRESS(),columnID);
		// 多言語
		columnID = mstappr.getColumnID("USER_MST","LOCALE");
		mstappr.setDetailByColumnID(struct.getLOCALE(),columnID);
		// 承認権限
		columnID = mstappr.getColumnID("USER_MST","APPR_POWER_TYP");
		mstappr.setDetailByColumnID(struct.getAPPR_POWER_TYP(),columnID);
		// パスワード変更日
		columnID = mstappr.getColumnID("USER_MST","PASSWORD_CHG_DATE");
		mstappr.setDetailByColumnID(struct.getPASSWORD_CHG_DATE(),columnID);
		// 部コード
		columnID = mstappr.getColumnID("USER_MST","SECTION_CD");
		mstappr.setDetailByColumnID(struct.getSECTION_CD(),columnID);
		// 作成日
		columnID = mstappr.getColumnID("USER_MST","CREATED_DATE");
		mstappr.setDetailByColumnID(nowdate,columnID);
		// 作成者
		columnID = mstappr.getColumnID("USER_MST","CREATED_BY");
		mstappr.setDetailByColumnID(this.getsysUSER_CD(),columnID);
		// 作成プログラム名
		columnID = mstappr.getColumnID("USER_MST","CREATED_PRG_NM");
		mstappr.setDetailByColumnID("AA0090030",columnID);
		// 更新日
		columnID = mstappr.getColumnID("USER_MST","UPDATED_DATE");
		mstappr.setDetailByColumnID(nowdate,columnID);
		// 更新者
		columnID = mstappr.getColumnID("USER_MST","UPDATED_BY");
		mstappr.setDetailByColumnID(this.getsysUSER_CD(),columnID);
		// 更新プログラム名
		columnID = mstappr.getColumnID("USER_MST","UPDATED_PRG_NM");
		mstappr.setDetailByColumnID("AA0090030",columnID);
		// 更新数
		columnID = mstappr.getColumnID("USER_MST","MODIFY_COUNT");
		mstappr.setDetailByColumnID("0",columnID);
		
		// 承認明細にデータを追加する。
		mstappr.insertMST_APPR_DETAIL("USER_MST",appr_ID);
		
		// 所属業務グループデータを整理
		List _flgs = struct.getList_BUSINESS_GROUP_VALID_FLG();
		List _ids = struct.getList_BUSINESS_GROUP_CD();	
		for(int idx = 0; idx < _ids.size(); idx++)
		{
			String _flg = (String)_flgs.get(idx);
			String _id = (String)_ids.get(idx);
			// 所属していない部門は登録しない
			if(("true").equals(_flg) == false ){
				continue;
			}
			// 登録する業務グループを設定し、登録する
			AA0090030Struct _createStruct = new AA0090030Struct();
			_createStruct.basicCopy(struct);
			_createStruct.setStruct(struct);
			_createStruct.setBUSINESS_GROUP_CD(_id);
	        //　業務グループコード
			columnID = mstappr.getColumnID("BELONG_MST","BUSINESS_GROUP_CD");
			mstappr.setListByColumnID(_createStruct.getBUSINESS_GROUP_CD(),columnID);
			// ユーザコード
			columnID = mstappr.getColumnID("BELONG_MST","USER_CD");
			mstappr.setListByColumnID(_createStruct.getUSER_CD(),columnID);
			// 作成日
			columnID = mstappr.getColumnID("BELONG_MST","CREATED_DATE");
			mstappr.setListByColumnID(nowdate,columnID);
			// 作成者
			columnID = mstappr.getColumnID("BELONG_MST","CREATED_BY");
			mstappr.setListByColumnID(this.getsysUSER_CD(),columnID);
			// 作成プログラム名
			columnID = mstappr.getColumnID("BELONG_MST","CREATED_PRG_NM");
			mstappr.setListByColumnID("AA0090030",columnID);
			// 更新日
			columnID = mstappr.getColumnID("BELONG_MST","UPDATED_DATE");
			mstappr.setListByColumnID(nowdate,columnID);
			// 更新者
			columnID = mstappr.getColumnID("BELONG_MST","UPDATED_BY");
			mstappr.setListByColumnID(this.getsysUSER_CD(),columnID);
			// 更新プログラム名
			columnID = mstappr.getColumnID("BELONG_MST","UPDATED_PRG_NM");
			mstappr.setListByColumnID("AA0090030",columnID);
			// 更新数
			columnID = mstappr.getColumnID("BELONG_MST","MODIFY_COUNT");
			mstappr.setListByColumnID("0",columnID);

			// 承認小明細にデータを追加する。
			mstappr.insertMST_APPR_DETAIL_LIST("BELONG_MST",appr_ID,Integer.toString(idx));		
		}
		setInfoMessage("AZ00042");
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
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0090");
		logger.entering("AA0090030Control"+":USER="+struct.getsUser_ID(),"controlselect");
			//{{user_implement_dev:<controlselect>
		MstAppr mstappr = new MstAppr(this.conn,this.getsysPLANT_CD(),this.getsysUSER_CD(),"AA0090030","AA0090030Servlet");
		String keyMessage = "";
		try {
			// 検索
			List temp_list = null;
			struct.setCOMPANY_CD(_COMPANY_CD);
			// ERRORフラグクリア
			struct.seth_INSERT_ERROR_FLG(null);
			// 遷移する時
			if(screenMoveFlg){
				// 承認画面の「承認後」ボタンから遷移する時
				if("1".equals(struct.geth_SCREENMOVE_TYP())){
					temp_list = mstappr.selectMST_APPR_DETAIL(struct.geth_APPR_ID());
				}else{ //  承認画面の「承認前」ボタンから遷移する時
					temp_list = entity.mselect.read(conn, struct);
				}
			}else{ 
				// 正常の読込
				temp_list = entity.mselect.read(conn, struct);
			}
			
			// 検索結果0件の場合
			if(temp_list.size() <= 0){
				// エラーメッセージ作成
				keyMessage = "USER_MST.USER_CD:" + struct.getUSER_CD();
				setErrorMessage("ZZ01101", keyMessage);

				// データが存在しない場合のクリア処理
				String w_userCd = struct.getUSER_CD();	// キー情報の退避
				String h_APR_USER_MST = struct.geth_APR_USER_MST();
				controlclear();
				struct.setUSER_CD(w_userCd);			// キー情報の設定
				struct.seth_APR_USER_MST(h_APR_USER_MST);

				// ユーザ用業務グループデータリストの初期化
				if(_listBusinessGroupByUser != null)
				{
					_listBusinessGroupByUser.clear();
				}
				else
				{
					_listBusinessGroupByUser = new ArrayList(0);
				}

				// 更新数初期化
				_USER_MST_count = null;
			}
			else
			{
				_listBusinessGroupByUser = new ArrayList();
				// 指定ユーザの業務グループ情報取得
				if("1".equals(struct.geth_APR_USER_MST()) && "1".equals(struct.geth_SCREENMOVE_TYP())){
					List tempList = mstappr.selectMST_APPR_DETAIL_LIST(struct.geth_APPR_ID());
					MstApprDetailListStruct apprStruct = new MstApprDetailListStruct();
					// 承認小明細表の項目IDを決定する。
					String columnID = null;
					columnID = mstappr.getColumnID("BELONG_MST","BUSINESS_GROUP_CD");
					for(int i=0;i<tempList.size();i++){
						apprStruct = (MstApprDetailListStruct) tempList.get(i);
						AA0090030Struct opfStruct = new AA0090030Struct();
						opfStruct.setBUSINESS_GROUP_CD(mstappr.getListByColumnID(apprStruct,columnID));
						_listBusinessGroupByUser.add(opfStruct);
						
					}
				}else{
					_listBusinessGroupByUser = entity.mselectBELONG_MST_BY_USER.read(conn, struct);
				}
			}

			// エラーがない場合、読込情報設定処理
			if(msgStruct.sizeError() <= 0)
			{
				// リストクリア
				if(list != null){
					list.clear();
				}
				else {
					list = new ArrayList(0);
				}

				// 読み込んだデータを取得
				AA0090030Struct workStruct = new AA0090030Struct();
				if("1".equals(struct.geth_APR_USER_MST()) && "1".equals(struct.geth_SCREENMOVE_TYP())){
					MstApprDetailStruct tempStruct = (MstApprDetailStruct) temp_list.get(0);
					String columnID = null;
					// ユーザ番号
					columnID = mstappr.getColumnID( "USER_MST", "USER_CD");
					workStruct.setUSER_CD(mstappr.getDetailByColumnID(tempStruct,columnID));
					
					// ユーザ名称
					columnID = mstappr.getColumnID( "USER_MST", "USER_NAME");
					workStruct.setUSER_NAME(mstappr.getDetailByColumnID(tempStruct,columnID));

					// 工場コード
					columnID = mstappr.getColumnID( "USER_MST", "PLANT_CD");
					workStruct.setPLANT_CD(mstappr.getDetailByColumnID(tempStruct,columnID));
					// 工場名
					List templist = entity.mselectM_PLANT.read(conn, workStruct);
					if(!templist.isEmpty()){
						workStruct.setPLANT_NAME(((AA0090030Struct)templist.get(0)).getPLANT_NAME());
					}
					
					// パスワード
					columnID = mstappr.getColumnID( "USER_MST", "PASSWORD");
					workStruct.setPASSWORD(mstappr.getDetailByColumnID(tempStruct,columnID));
					// チェック使用のパスワード
					workStruct.seth_PASSWORD(workStruct.getPASSWORD());

					// メールアドレス
					columnID = mstappr.getColumnID( "USER_MST", "ADDRESS");
					workStruct.setADDRESS(mstappr.getDetailByColumnID(tempStruct,columnID));

					// 承認権限
					columnID = mstappr.getColumnID( "USER_MST", "APPR_POWER_TYP");
					workStruct.setAPPR_POWER_TYP(mstappr.getDetailByColumnID(tempStruct,columnID));

					// 多言語
					columnID = mstappr.getColumnID( "USER_MST", "LOCALE");
					workStruct.setLOCALE(mstappr.getDetailByColumnID(tempStruct,columnID));
					
					// 部コード
					columnID = mstappr.getColumnID( "USER_MST", "SECTION_CD");
					workStruct.setSECTION_CD(mstappr.getDetailByColumnID(tempStruct,columnID));
					
					// 部名称
					columnID = mstappr.getColumnID( "USER_MST", "ORG_NAME");
					workStruct.setCOMPANY_CD(_COMPANY_CD);
					List nameList = entity.mselectM_ORG.read(conn, workStruct);
					if(!nameList.isEmpty()){
						workStruct.setORG_NAME(((AA0090030Struct)nameList.get(0)).getORG_NAME());
					}
					
					// パスワード変更日
					columnID = mstappr.getColumnID( "USER_MST", "PASSWORD_CHG_DATE");
					workStruct.setPASSWORD_CHG_DATE(mstappr.getDetailByColumnID(tempStruct,columnID));
					
				} else {
					workStruct = (AA0090030Struct) temp_list.get(0);

					// 画面遷移フラグ
					workStruct.seth_SCREENMOVE_TYP("0");
					// チェック使用のパスワード
					workStruct.seth_PASSWORD(workStruct.getPASSWORD());
				}
				// MODIFY_COUNTを退避
				_USER_MST_count = workStruct.getMODIFY_COUNT();

				// 読込データをstructへコピー
				struct.copy(workStruct);
				//コンボボックス用データ取得
				StringTokenizer std;
				int size = 0;
				int losize = 0;
				String loca = null;
				String[]  lolist = null;
				if (struct.getLOCALE() != null){
					while(losize < _LOCALE.size()){
						lolist = _LOCALE.getData(losize);
						while( size<lolist.length){
							if(!lolist[size].equals("")){
								std = new StringTokenizer(lolist[size],":");
								loca = std.nextToken();
								if(struct.getLOCALE().equals(loca)){
									struct.setLOCALE(lolist[size]);
								}
							}
							size++;
						}
						size = 0;
						losize++;
					}
				}
				
				// 所属する業務グループの一覧を生成
				List belongGroupList = new ArrayList();
				for(int n = 0; n < _listBusinessGroupByUser.size(); n++)
				{
					AA0090030Struct belongGroupStruct = (AA0090030Struct)_listBusinessGroupByUser.get(n);
					belongGroupList.add(belongGroupStruct.getBUSINESS_GROUP_CD());
				}
				// 表示用listに取得した業務一覧を設定し、所属する部門にチェックを付ける
				for(int i = 0; i < _listBusinessGroup.size(); i++)
				{
					AA0090030Struct temp_struct = new AA0090030Struct();
					temp_struct.setStructM((AA0090030Struct)_listBusinessGroup.get(i));

					if(belongGroupList.contains(temp_struct.getBUSINESS_GROUP_CD())){

						temp_struct.setBUSINESS_GROUP_VALID_FLG("true");
					}else{

						temp_struct.setBUSINESS_GROUP_VALID_FLG("NULL");
					}
					list.add(temp_struct);
				}

				// 最終読込キー（利用者コード）として退避する
				_lastUSER_CD = struct.getUSER_CD();

				// パスワード（新規）があるときは、空にする。
				struct.setNEW_PASSWORD("");
				
				// 検索状態を「読込成功」に設定
				setReadStatus(NORMAL);
			}
			else
			{
				// 検索状態を初期状態に
				setReadStatus(INITIAL);
			}
		} catch(SQLException e) {

			// 検索状態を「読込失敗」に設定
			setReadStatus(ERROR);

			// エラーメッセージ作成
			keyMessage = "USER_MST.USER_CD:" + struct.getUSER_CD();
			setSqlExceptionMsg(e, keyMessage);

		} catch(Exception e){
			// ロールバック
			conn.rollback();

			// エラーメッセージ作成
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);

			throw ee;
		}
		//------------------------------------------------------------------

                //}}user_implement_dev:<controlselect>
		logger.exiting("AA0090030Control"+":USER="+struct.getsUser_ID(),"controlselect");

		return;
	}

	/**
	 * 登録ボタン押下時に実行される処理です。
	 *
	 */
	public void controlinsert() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0090");
		logger.entering("AA0090030Control"+":USER="+struct.getsUser_ID(),"controlinsert");
			//{{user_implement_dev:<controlinsert>
		String keyMessage = "";
		try {
			// リスト再作成
			reMakeList();
			// ERRORフラグクリア
			struct.seth_INSERT_ERROR_FLG(null);
			// トランザクション開始
			conn.beginTransWeb();
			// 登録するレコードがテーブルに有/無?
			if(isTargetData(struct) == true)
			{
				// エラーメッセージ作成
				keyMessage = "USER_MST.USER_CD:" + struct.getUSER_CD();
				setErrorMessage("ZZ01102", keyMessage);
			}
			// 依存するマスタのチェック
			existDependsMaster();
			
			// 指定されたパスワードとユーザコードのチェック
			if(struct.getUSER_CD().equals(struct.getPASSWORD())) {
				// ユーザコードとパスワードは異なる文字列で設定してください。
				keyMessage = "USER_MST.PASSWORD:" + struct.getPASSWORD();
				setErrorMessage("AA00206", keyMessage);
			}
			
			// 新パスワードの桁数チェック
			Map chkMap = UserPassWordInputRule.compareMinLength(conn, struct.getPASSWORD());
			if("false".equals(String.valueOf(chkMap.get("2")))) {
				ExpjMessage expjMessage = new ExpjMessage("AA00207",String.valueOf(chkMap.get("1")));
				msgStruct.addError(expjMessage);
			}


			// パスワードの英字数字チェック
			if(!UserPassWordInputRule.checkWordRule(conn, struct.getPASSWORD())) {
				// パスワードには英字、及び、数字を含んで設定してください。
				keyMessage = "USER_MST.PASSWORD:" + struct.getPASSWORD();
				setErrorMessage("AA00208", keyMessage);
			}
			
			// 新パスワードを取得する時
			if(struct.getNEW_PASSWORD() != null && !"".equals(struct.getNEW_PASSWORD())) {
				
				// 指定されたパスワードとユーザコードのチェック
				if(struct.getUSER_CD().equals(struct.getNEW_PASSWORD())) {
					// ユーザコードとパスワードは異なる文字列で設定してください。
					keyMessage = "USER_MST.PASSWORD:" + struct.getNEW_PASSWORD();
					setErrorMessage("AA00206", keyMessage);
				}
				// 新パスワードの桁数チェック
				chkMap = UserPassWordInputRule.compareMinLength(conn, struct.getNEW_PASSWORD());
				if("false".equals(String.valueOf(chkMap.get("2")))) {
					ExpjMessage expjMessage = new ExpjMessage("AA00207",String.valueOf(chkMap.get("1")));
					msgStruct.addError(expjMessage);
				}
				// パスワードの英字数字チェック
				if(!UserPassWordInputRule.checkWordRule(conn, struct.getNEW_PASSWORD())) {
					// パスワードには英字、及び、数字を含んで設定してください。
					keyMessage = "USER_MST.PASSWORD:" + struct.getNEW_PASSWORD();
					setErrorMessage("AA00208", keyMessage);
				}
			}
			
			// エラーがない場合、登録処理
			if(msgStruct.sizeError() <= 0){
				// 会社コード読込
				readCOMPANY_CD();
				struct.setCOMPANY_CD(_COMPANY_CD);
				//コンボボックス
				if (!struct.getLOCALE().equals("")){
					StringTokenizer std = new StringTokenizer(struct.getLOCALE(),":");
					struct.setLOCALE(std.nextToken());
				}else {
					struct.setLOCALE(null);
				}
				
				String temoPASSWORD = struct.getPASSWORD();
			   
			/*	// データ暗号化
				if (getReadStatus() == NORMAL && !struct.getNEW_PASSWORD().equals("")) {
					struct.setPASSWORD(XafTools.getCryptString(struct.getNEW_PASSWORD()));
				} else if (getReadStatus() == INITIAL || getReadStatus() == ERROR) {
					// 読み込んでいない
					struct.setPASSWORD(XafTools.getCryptString(struct.getPASSWORD()));
				}*/
				
				struct.setPASSWORD(XafTools.getCryptString(struct.getPASSWORD()));
				// チェック使用のパスワード
				struct.seth_PASSWORD(struct.getPASSWORD());
				// 業務運用日を読み
				String businessDate = readBUSINESS_OPR_DATE(struct.getPLANT_CD());
				struct.setPASSWORD_CHG_DATE(businessDate);
				
				// データ挿入
				if("0".equals(struct.geth_APR_USER_MST())) {		// パラメータ「利用者承認」が0の時、
					entity.minsertUSER_MST.create(conn, struct);
					
					// 既に登録済みの業務グループデータを削除
					entity.mdeleteBELONG_MST_BY_USER.delete(conn, struct);
					
					// 業務グループデータ登録
					insertBusinessGroup();
					// コミット
					conn.commit();
					// 検索
					controlselect();
				} else {												
					// パラメータ「利用者承認」が1の時、
					// 承認情報の登録
					insertAppr("insert");
					if(!msgStruct.hasError()){
						// コミット
						conn.commit();
						struct.setPASSWORD(temoPASSWORD);
						setReadStatus(INITIAL);
					}else{
						// ロールバック
						conn.rollback();
						struct.setPASSWORD(temoPASSWORD);
						setReadStatus(ERROR);
					}
					// チェック使用のパスワード
					struct.seth_PASSWORD(struct.getPASSWORD());
					//コンボボックス用データ取得
					StringTokenizer std;
					int size = 0;
					int losize = 0;
					String loca = null;
					String[]  lolist = null;
					if (struct.getLOCALE() != null){
						while(losize < _LOCALE.size()){
							lolist = _LOCALE.getData(losize);
							while( size<lolist.length){
								if(!lolist[size].equals("")){
									std = new StringTokenizer(lolist[size],":");
									loca = std.nextToken();
									if(struct.getLOCALE().equals(loca)){
										struct.setLOCALE(lolist[size]);
									}
								}
								size++;
							}
							size = 0;
							losize++;
						}
					}
					// 承認の場合、「登録」ボタン利用可、「更新」、「削除」ボタン利用不可
					struct.seth_INSERT_ERROR_FLG("1");
				}
			}
			else
			{
				// ロールバック
				conn.rollback();
				// エラー場合、「登録」ボタン利用可、「更新」、「削除」ボタン利用不可
				struct.seth_INSERT_ERROR_FLG("1");
				setReadStatus(ERROR);
			}
		}catch(SQLException e) {
			// ロールバック
			conn.rollback();
			// エラーメッセージ作成
			keyMessage = "M_PLANT.PLANT_CD:" + struct.getPLANT_CD();
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

		//------------------------------------------------------------------

                //}}user_implement_dev:<controlinsert>
		logger.exiting("AA0090030Control"+":USER="+struct.getsUser_ID(),"controlinsert");

		return;
	}

	/**
	 * 更新ボタン押下時に実行される処理です。
	 *
	 */
	public void controlupdate() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0090");
		logger.entering("AA0090030Control"+":USER="+struct.getsUser_ID(),"controlupdate");
			//{{user_implement_dev:<controlupdate>
		String keyMessage = "";

		try {
			
			// リスト再作成
			reMakeList();
			// ERRORフラグクリア
			struct.seth_INSERT_ERROR_FLG(null);
			// トランザクション開始
			conn.beginTransWeb();

			// 処理対象データが更新されていないかチェック
			checkTargetData(struct, _USER_MST_count);

			// 依存するマスタのチェック
			existDependsMaster();
			
			// 変更前変更後で指定されたパスワードが同じのチェック
			if(XafTools.getCryptString(struct.getNEW_PASSWORD()).equals(struct.geth_PASSWORD())) {
				// パスワードは変更の前後で変えて設定してください。
				keyMessage = "USER_MST.PASSWORD:" + struct.getNEW_PASSWORD();
				setErrorMessage("AA00209", keyMessage);
			}
			
			// 指定されたパスワードとユーザコードのチェック
			if(struct.getUSER_CD().equals(struct.getNEW_PASSWORD())) {
				// ユーザコードとパスワードは異なる文字列で設定してください。
				keyMessage = "USER_MST.PASSWORD:" + struct.getNEW_PASSWORD();
				setErrorMessage("AA00206", keyMessage);
			}
			
			// 新パスワードの桁数チェック
			if(struct.getNEW_PASSWORD() != null && !"".equals(struct.getNEW_PASSWORD())) {
				Map chkMap = UserPassWordInputRule.compareMinLength(conn, struct.getNEW_PASSWORD());
				if("false".equals(String.valueOf(chkMap.get("2")))) {
					ExpjMessage expjMessage = new ExpjMessage("AA00207",String.valueOf(chkMap.get("1")));
					msgStruct.addError(expjMessage);
				}
			}
			
			// パスワードの英字数字チェック
			if(struct.getNEW_PASSWORD() != null && !"".equals(struct.getNEW_PASSWORD()) &&
					!UserPassWordInputRule.checkWordRule(conn, struct.getNEW_PASSWORD())) {
				// パスワードには英字、及び、数字を含んで設定してください。
				keyMessage = "USER_MST.PASSWORD:" + struct.getNEW_PASSWORD();
				setErrorMessage("AA00208", keyMessage);
			}

			// エラーがない場合、更新処理
			if(msgStruct.sizeError() <= 0){

				// 会社コード読込
				readCOMPANY_CD();
				struct.setCOMPANY_CD(_COMPANY_CD);
				
				//コンボボックス
				
				if (!struct.getLOCALE().equals("")){
					StringTokenizer std = new StringTokenizer(struct.getLOCALE(),":");
					struct.setLOCALE(std.nextToken());
				}else {
					struct.setLOCALE(null);
				}
				
				//データ暗号化
				if (struct.getNEW_PASSWORD() != null && !"".equals(struct.getNEW_PASSWORD())) {
					struct.setPASSWORD(XafTools.getCryptString(struct.getNEW_PASSWORD()));
					// チェック使用のパスワード
					struct.seth_PASSWORD(struct.getPASSWORD());
					// 業務運用日を読み
					String businessDate = readBUSINESS_OPR_DATE(struct.getPLANT_CD());
					// パスワード変更日
					struct.setPASSWORD_CHG_DATE(businessDate);
				}
			
				if("0".equals(struct.geth_APR_USER_MST())){		// パラメータ「利用者承認」が0の時、
					//データ更新
					entity.mupdateUSER_MST.update(conn, struct);

					// 既に登録済みの業務グループデータを削除
					entity.mdeleteBELONG_MST_BY_USER.delete(conn, struct);

					// 業務グループデータ登録
					insertBusinessGroup();
					// コミット
					conn.commit();
					// 検索
					controlselect();
				}else{												// パラメータ「利用者承認」が1の時、
					// 承認情報の登録
					insertAppr("update");
					if(!msgStruct.hasError()){
						// コミット
						conn.commit();
					}else{
						// ロールバック
						conn.rollback();
					}

					//コンボボックス用データ取得
					StringTokenizer std;
					int size = 0;
					int losize = 0;
					String loca = null;
					String[]  lolist = null;
					if (struct.getLOCALE() != null){
						while(losize < _LOCALE.size()){
							lolist = _LOCALE.getData(losize);
							while( size<lolist.length){
								if(!lolist[size].equals("")){
									std = new StringTokenizer(lolist[size],":");
									loca = std.nextToken();
									if(struct.getLOCALE().equals(loca)){
										struct.setLOCALE(lolist[size]);
									}
								}
								size++;
							}
							size = 0;
							losize++;
						}
					}
				}
			} else {
				// ロールバック
				conn.rollback();
			}
		} catch(SQLException e) {
			// ロールバック
			conn.rollback();
			// エラーメッセージ作成
			keyMessage = "M_PLANT.PLANT_CD:" + struct.getPLANT_CD();
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
		//------------------------------------------------------------------
                //}}user_implement_dev:<controlupdate>
		logger.exiting("AA0090030Control"+":USER="+struct.getsUser_ID(),"controlupdate");

		return;
	}

	/**
	 * 削除ボタン押下時に実行される処理です。
	 *
	 */
	public void controldelete() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0090");
		logger.entering("AA0090030Control"+":USER="+struct.getsUser_ID(),"controldelete");
			//{{user_implement_dev:<controldelete>
		String keyMessage = "";
		try {
			// トランザクション開始
			conn.beginTransWeb();
			// ERRORフラグクリア
			struct.seth_INSERT_ERROR_FLG(null);
			// 処理対象データが更新されていないかチェック
			checkTargetData(struct, _USER_MST_count);
			// 依存するマスタのチェック（得意先マスタ）
			existDependsMasterForDel();
			String h_APR_USER_MST = struct.geth_APR_USER_MST();
			// エラーがない場合、削除処理
			if(msgStruct.sizeError() <= 0){
				
				//コンボボックス
				
				if (!struct.getLOCALE().equals("")){
					StringTokenizer std = new StringTokenizer(struct.getLOCALE(),":");
					struct.setLOCALE(std.nextToken());
				}else {
					struct.setLOCALE(null);
				}

				if("0".equals(struct.geth_APR_USER_MST())){		// パラメータ「利用者承認」が0の時、
					// 削除
					entity.mdeleteUSER_MST.delete(conn, struct);

					// 既に登録済みの業務グループデータを削除
					entity.mdeleteBELONG_MST_BY_USER.delete(conn, struct);
					// コミット
					conn.commit();
					
				}else{												// パラメータ「利用者承認」が1の時、
					insertAppr("delete");
					if(!msgStruct.hasError()){
						// コミット
						conn.commit();
						//コンボボックス用データ取得
						StringTokenizer std;
						int size = 0;
						int losize = 0;
						String loca = null;
						String[]  lolist = null;
						if (struct.getLOCALE() != null){
							while(losize < _LOCALE.size()){
								lolist = _LOCALE.getData(losize);
								while( size<lolist.length){
									if(!lolist[size].equals("")){
										std = new StringTokenizer(lolist[size],":");
										loca = std.nextToken();
										if(struct.getLOCALE().equals(loca)){
											struct.setLOCALE(lolist[size]);
										}
									}
									size++;
								}
								size = 0;
								losize++;
							}
						}
					}else{
						
						// ロールバック
						conn.rollback();
						//コンボボックス用データ取得
						StringTokenizer std;
						int size = 0;
						int losize = 0;
						String loca = null;
						String[]  lolist = null;
						if (struct.getLOCALE() != null){
							while(losize < _LOCALE.size()){
								lolist = _LOCALE.getData(losize);
								while( size<lolist.length){
									if(!lolist[size].equals("")){
										std = new StringTokenizer(lolist[size],":");
										loca = std.nextToken();
										if(struct.getLOCALE().equals(loca)){
											struct.setLOCALE(lolist[size]);
										}
									}
									size++;
								}
								size = 0;
								losize++;
							}
						}
						return;
					}


				}

	            // 画面をクリア
				controlclear();
			}
			else
			{
				// ロールバック
				conn.rollback();
			}
			struct.seth_APR_USER_MST(h_APR_USER_MST);

		} catch(SQLException e) {
			// ロールバック
			conn.rollback();

			// エラーメッセージ作成
			keyMessage = "USER_MST.USER_CD:" + struct.getUSER_CD();
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

		//------------------------------------------------------------------
                //}}user_implement_dev:<controldelete>
		logger.exiting("AA0090030Control"+":USER="+struct.getsUser_ID(),"controldelete");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlclear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0090");
		logger.entering("AA0090030Control"+":USER="+struct.getsUser_ID(),"controlclear");
			//{{user_implement_dev:<controlclear>
		// structクリア
		this.struct.initialize();
		// ERRORフラグクリア
		struct.seth_INSERT_ERROR_FLG(null);
		// リストクリア
		if(list != null){
			list.clear();
		}
		else {
			list = new ArrayList(0);
		}

		// 表示用listに業務グループを設定
		for(int i = 0; i < _listBusinessGroup.size(); i++)
		{
			list.add((AA0090030Struct)_listBusinessGroup.get(i));
		}

		// 更新数初期化
		_USER_MST_count = null;
		

		// パラメータ「利用者承認」を取得
		struct.seth_APR_USER_MST(_APR_USER_MST);

		// 検索状態を「初期状態」に設定
		setReadStatus(INITIAL);
		
		//------------------------------------------------------------------
                //}}user_implement_dev:<controlclear>
		logger.exiting("AA0090030Control"+":USER="+struct.getsUser_ID(),"controlclear");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0090");
		logger.entering("AA0090030Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AA0090030Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0090");
		logger.entering("AA0090030Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
		String keyMessage = "";

		try{
			// テーブル用業務グループデータリストの初期化
			if(_listBusinessGroup != null)
			{
				_listBusinessGroup.clear();
			}
			else
			{
				_listBusinessGroup = new ArrayList(0);
			}
			
			// 自社コードの取得
			if (!readCOMPANY_CD() ){
				return;
			}
			
			// 所属部門情報取得
			List _tempBusinessGroup = entity.mselectBUSINESS_GROUP_MST.read(conn, struct);

			// 非表示業務グループ情報取得
			PrivateConfig privateConfig = new PrivateConfig(conn);
			ArrayList listNotBusinessGroupCD = new ArrayList(0);
			listNotBusinessGroupCD = privateConfig.getStrings(_DISABLE_BUSINESS_GROUP_ACCESS_KEY);

			// 非表示とする業務グループコードのフラグを設定
			for(int i = 0; i < _tempBusinessGroup.size(); i++)
			{
				AA0090030Struct temp_struct = (AA0090030Struct)_tempBusinessGroup.get(i);
				boolean bFound = false;
				for(int j = 0; j < listNotBusinessGroupCD.size(); j++)
				{
					String strBusinessGroupCD = (String)listNotBusinessGroupCD.get(j);
					if(strBusinessGroupCD.equals(temp_struct.getBUSINESS_GROUP_CD()) == true)
					{
						bFound = true;
						break;
					}
				}
				if(bFound == false)
				{
					_listBusinessGroup.add(_tempBusinessGroup.get(i));
				}
			}

			// リストクリア
			if(list != null){
				list.clear();
			}
			else {
				list = new ArrayList(0);
			}
			
			/*業務グループ一覧の多言語表示*/
            AA0090030Struct setStruct = new AA0090030Struct();
			String locale = CoreTools.getLocale(sysUSER_CD);
		    String property = "OrteusMenuDic";
            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
            String key = "Orteus.BUSINESS_GROUP_MST.BUSINESS_GROUP_NAME.";

			// 表示用listに業務グループを設定
			for(int i = 0; i < _listBusinessGroup.size(); i++){
			 	setStruct = (AA0090030Struct)_listBusinessGroup.get(i);
            	setStruct.setBUSINESS_GROUP_NAME(CoreTools.getRBString(key + setStruct.getBUSINESS_GROUP_CD(), resource));
				list.add(setStruct);
			}
			
			// コンボボックスデータ用意
			ComboBox controller = new ComboBox(conn, sysUSER_CD);
			_LOCALE = controller.getData("LOCALE");
			_APPR_POWER_TYP = controller.getData("APPR_POWER_TYP");
			

			// パラメータ「利用者承認」を取得
			List tempList = entity.mselectSYS_PARAM.read(conn,struct);
			
			if(tempList.isEmpty()){
 				ResourceBundle messages = CoreTools.getResourceBundle("ExpjMessage", locale);
 				ExpjMessage emsg = new ExpjMessage("AZ00041", messages.getString("AZ00043"));
 				msgStruct.addError(emsg);
 			    sysLog.warning(emsg, sysUSER_CD);
				struct.seth_APR_USER_MST("0");
			}else{
				if("1".equals(((AA0090030Struct)tempList.get(0)).geth_APR_USER_MST())){
					struct.seth_APR_USER_MST("1");
				}else{
					struct.seth_APR_USER_MST("0");
				}
			}
			_APR_USER_MST = struct.geth_APR_USER_MST();
			
			// キーを取得
			if("1".equals(struct.geth_APR_USER_MST()) && this.isScreenMove() && null != struct.geth_SCREENMOVE_TYP()){
				getKey();
			}
	        
		} catch(SQLException e) {
			// エラーメッセージ作成
			keyMessage = "";
			setSqlExceptionMsg(e, keyMessage);

		}catch(ComboException e){
			// エラーメッセージ作成
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);

			throw ee;

		}
		//------------------------------------------------------------------
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AA0090030Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * イベントハンドラの前処理です。
	 *
	 * @param buttun ボタン名
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0090");
		logger.entering("AA0090030Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
		logger.exiting("AA0090030Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			// コンボボックスデータ設定
			struct.setList_LOCALE_val(_LOCALE.getExplanList());
			struct.setList_LOCALE_name(_LOCALE.getExplanList());
			//struct.setList_LOCALE_val(_LOCALE.getValList());
			
			
			struct.setList_APPR_POWER_TYP_name(_APPR_POWER_TYP.getExplanList());
			struct.setList_APPR_POWER_TYP_val(_APPR_POWER_TYP.getValList());
			
			struct.copy(struct);
			
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
//			throw new FoundationException("AA0090030Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AA0090030-E999","CSVの出力処理"));
			throw new FoundationException("AA0090030Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AA0090030-E999","システム日付の取得処理"));
				throw new FoundationException("AA0090030Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AA0090030-E999","コントロールのイベント処理"));
			throw new FoundationException("AA0090030Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected AA0090030Entity entity;
	protected AA0090030Struct struct;
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

		entity = new AA0090030Entity();
		struct = new AA0090030Struct();

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
	 * AA0090030クラスの標準コンストラクタ
	 */
	public AA0090030Control() throws BusinessProcessException, FoundationException
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
				AA0090030Struct key = (AA0090030Struct)keyList.get(j);
				// メッセージキーを作成する
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("BUSINESS_GROUP_VALID_FLG") && key.getBUSINESS_GROUP_VALID_FLG() != null) {
					msgKey.setKeyValue("BUSINESS_GROUP_VALID_FLG", key.getBUSINESS_GROUP_VALID_FLG());
				}
				if(msgKeyType.containsKeyColumn("LOCALE_name") && key.getLOCALE_name() != null) {
					msgKey.setKeyValue("LOCALE_name", key.getLOCALE_name());
				}
				if(msgKeyType.containsKeyColumn("LOCALE_val") && key.getLOCALE_val() != null) {
					msgKey.setKeyValue("LOCALE_val", key.getLOCALE_val());
				}
				if(msgKeyType.containsKeyColumn("NEW_PASSWORD") && key.getNEW_PASSWORD() != null) {
					msgKey.setKeyValue("NEW_PASSWORD", key.getNEW_PASSWORD());
				}
				if(msgKeyType.containsKeyColumn("APPR_POWER_TYP_name") && key.getAPPR_POWER_TYP_name() != null) {
					msgKey.setKeyValue("APPR_POWER_TYP_name", key.getAPPR_POWER_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("APPR_POWER_TYP_val") && key.getAPPR_POWER_TYP_val() != null) {
					msgKey.setKeyValue("APPR_POWER_TYP_val", key.getAPPR_POWER_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("APPR_REMARKS") && key.getAPPR_REMARKS() != null) {
					msgKey.setKeyValue("APPR_REMARKS", key.getAPPR_REMARKS());
				}
				if(msgKeyType.containsKeyColumn("h_APPR_ID") && key.geth_APPR_ID() != null) {
					msgKey.setKeyValue("h_APPR_ID", key.geth_APPR_ID());
				}
				if(msgKeyType.containsKeyColumn("h_SCREENMOVE_TYP") && key.geth_SCREENMOVE_TYP() != null) {
					msgKey.setKeyValue("h_SCREENMOVE_TYP", key.geth_SCREENMOVE_TYP());
				}
				if(msgKeyType.containsKeyColumn("h_INSERT_ERROR_FLG") && key.geth_INSERT_ERROR_FLG() != null) {
					msgKey.setKeyValue("h_INSERT_ERROR_FLG", key.geth_INSERT_ERROR_FLG());
				}
				if(msgKeyType.containsKeyColumn("h_PASSWORD") && key.geth_PASSWORD() != null) {
					msgKey.setKeyValue("h_PASSWORD", key.geth_PASSWORD());
				}
				if(msgKeyType.containsKeyColumn("BUSINESS_GROUP_DISP_FLG") && key.getBUSINESS_GROUP_DISP_FLG() != null) {
					msgKey.setKeyValue("BUSINESS_GROUP_DISP_FLG", key.getBUSINESS_GROUP_DISP_FLG());
				}
				if(msgKeyType.containsKeyColumn("OWN_PERSON_CD") && key.getOWN_PERSON_CD() != null) {
					msgKey.setKeyValue("OWN_PERSON_CD", key.getOWN_PERSON_CD());
				}
				if(msgKeyType.containsKeyColumn("USER_CD") && key.getUSER_CD() != null) {
					msgKey.setKeyValue("USER_CD", key.getUSER_CD());
				}
				if(msgKeyType.containsKeyColumn("USER_NAME") && key.getUSER_NAME() != null) {
					msgKey.setKeyValue("USER_NAME", key.getUSER_NAME());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("PASSWORD") && key.getPASSWORD() != null) {
					msgKey.setKeyValue("PASSWORD", key.getPASSWORD());
				}
				if(msgKeyType.containsKeyColumn("ADDRESS") && key.getADDRESS() != null) {
					msgKey.setKeyValue("ADDRESS", key.getADDRESS());
				}
				if(msgKeyType.containsKeyColumn("LOCALE") && key.getLOCALE() != null) {
					msgKey.setKeyValue("LOCALE", key.getLOCALE());
				}
				if(msgKeyType.containsKeyColumn("APPR_POWER_TYP") && key.getAPPR_POWER_TYP() != null) {
					msgKey.setKeyValue("APPR_POWER_TYP", key.getAPPR_POWER_TYP());
				}
				if(msgKeyType.containsKeyColumn("MODIFY_COUNT") && key.getMODIFY_COUNT() != null) {
					msgKey.setKeyValue("MODIFY_COUNT", key.getMODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("PLANT_NAME") && key.getPLANT_NAME() != null) {
					msgKey.setKeyValue("PLANT_NAME", key.getPLANT_NAME());
				}
				if(msgKeyType.containsKeyColumn("SECTION_CD") && key.getSECTION_CD() != null) {
					msgKey.setKeyValue("SECTION_CD", key.getSECTION_CD());
				}
				if(msgKeyType.containsKeyColumn("ORG_NAME") && key.getORG_NAME() != null) {
					msgKey.setKeyValue("ORG_NAME", key.getORG_NAME());
				}
				if(msgKeyType.containsKeyColumn("PASSWORD_CHG_DATE") && key.getPASSWORD_CHG_DATE() != null) {
					msgKey.setKeyValue("PASSWORD_CHG_DATE", key.getPASSWORD_CHG_DATE());
				}
				if(msgKeyType.containsKeyColumn("COMPANY_CD") && key.getCOMPANY_CD() != null) {
					msgKey.setKeyValue("COMPANY_CD", key.getCOMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("BUSINESS_GROUP_CD") && key.getBUSINESS_GROUP_CD() != null) {
					msgKey.setKeyValue("BUSINESS_GROUP_CD", key.getBUSINESS_GROUP_CD());
				}
				if(msgKeyType.containsKeyColumn("BUSINESS_GROUP_NAME") && key.getBUSINESS_GROUP_NAME() != null) {
					msgKey.setKeyValue("BUSINESS_GROUP_NAME", key.getBUSINESS_GROUP_NAME());
				}
				if(msgKeyType.containsKeyColumn("DISPLAY_NAME") && key.getDISPLAY_NAME() != null) {
					msgKey.setKeyValue("DISPLAY_NAME", key.getDISPLAY_NAME());
				}
				if(msgKeyType.containsKeyColumn("h_APR_USER_MST") && key.geth_APR_USER_MST() != null) {
					msgKey.setKeyValue("h_APR_USER_MST", key.geth_APR_USER_MST());
				}
				if(msgKeyType.containsKeyColumn("BUSINESS_OPR_DATE") && key.getBUSINESS_OPR_DATE() != null) {
					msgKey.setKeyValue("BUSINESS_OPR_DATE", key.getBUSINESS_OPR_DATE());
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
					AA0090030Struct key = new AA0090030Struct();
					if(msgKeyType.containsKeyColumn("BUSINESS_GROUP_VALID_FLG")) {
						key.setBUSINESS_GROUP_VALID_FLG(msgKey.getKeyValue("BUSINESS_GROUP_VALID_FLG"));
					}
					if(msgKeyType.containsKeyColumn("LOCALE_name")) {
						key.setLOCALE_name(msgKey.getKeyValue("LOCALE_name"));
					}
					if(msgKeyType.containsKeyColumn("LOCALE_val")) {
						key.setLOCALE_val(msgKey.getKeyValue("LOCALE_val"));
					}
					if(msgKeyType.containsKeyColumn("NEW_PASSWORD")) {
						key.setNEW_PASSWORD(msgKey.getKeyValue("NEW_PASSWORD"));
					}
					if(msgKeyType.containsKeyColumn("APPR_POWER_TYP_name")) {
						key.setAPPR_POWER_TYP_name(msgKey.getKeyValue("APPR_POWER_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("APPR_POWER_TYP_val")) {
						key.setAPPR_POWER_TYP_val(msgKey.getKeyValue("APPR_POWER_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("APPR_REMARKS")) {
						key.setAPPR_REMARKS(msgKey.getKeyValue("APPR_REMARKS"));
					}
					if(msgKeyType.containsKeyColumn("h_APPR_ID")) {
						key.seth_APPR_ID(msgKey.getKeyValue("h_APPR_ID"));
					}
					if(msgKeyType.containsKeyColumn("h_SCREENMOVE_TYP")) {
						key.seth_SCREENMOVE_TYP(msgKey.getKeyValue("h_SCREENMOVE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("h_INSERT_ERROR_FLG")) {
						key.seth_INSERT_ERROR_FLG(msgKey.getKeyValue("h_INSERT_ERROR_FLG"));
					}
					if(msgKeyType.containsKeyColumn("h_PASSWORD")) {
						key.seth_PASSWORD(msgKey.getKeyValue("h_PASSWORD"));
					}
					if(msgKeyType.containsKeyColumn("BUSINESS_GROUP_DISP_FLG")) {
						key.setBUSINESS_GROUP_DISP_FLG(msgKey.getKeyValue("BUSINESS_GROUP_DISP_FLG"));
					}
					if(msgKeyType.containsKeyColumn("OWN_PERSON_CD")) {
						key.setOWN_PERSON_CD(msgKey.getKeyValue("OWN_PERSON_CD"));
					}
					if(msgKeyType.containsKeyColumn("USER_CD")) {
						key.setUSER_CD(msgKey.getKeyValue("USER_CD"));
					}
					if(msgKeyType.containsKeyColumn("USER_NAME")) {
						key.setUSER_NAME(msgKey.getKeyValue("USER_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("PASSWORD")) {
						key.setPASSWORD(msgKey.getKeyValue("PASSWORD"));
					}
					if(msgKeyType.containsKeyColumn("ADDRESS")) {
						key.setADDRESS(msgKey.getKeyValue("ADDRESS"));
					}
					if(msgKeyType.containsKeyColumn("LOCALE")) {
						key.setLOCALE(msgKey.getKeyValue("LOCALE"));
					}
					if(msgKeyType.containsKeyColumn("APPR_POWER_TYP")) {
						key.setAPPR_POWER_TYP(msgKey.getKeyValue("APPR_POWER_TYP"));
					}
					if(msgKeyType.containsKeyColumn("MODIFY_COUNT")) {
						key.setMODIFY_COUNT(msgKey.getKeyValue("MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_NAME")) {
						key.setPLANT_NAME(msgKey.getKeyValue("PLANT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("SECTION_CD")) {
						key.setSECTION_CD(msgKey.getKeyValue("SECTION_CD"));
					}
					if(msgKeyType.containsKeyColumn("ORG_NAME")) {
						key.setORG_NAME(msgKey.getKeyValue("ORG_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PASSWORD_CHG_DATE")) {
						key.setPASSWORD_CHG_DATE(msgKey.getKeyValue("PASSWORD_CHG_DATE"));
					}
					if(msgKeyType.containsKeyColumn("COMPANY_CD")) {
						key.setCOMPANY_CD(msgKey.getKeyValue("COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("BUSINESS_GROUP_CD")) {
						key.setBUSINESS_GROUP_CD(msgKey.getKeyValue("BUSINESS_GROUP_CD"));
					}
					if(msgKeyType.containsKeyColumn("BUSINESS_GROUP_NAME")) {
						key.setBUSINESS_GROUP_NAME(msgKey.getKeyValue("BUSINESS_GROUP_NAME"));
					}
					if(msgKeyType.containsKeyColumn("DISPLAY_NAME")) {
						key.setDISPLAY_NAME(msgKey.getKeyValue("DISPLAY_NAME"));
					}
					if(msgKeyType.containsKeyColumn("h_APR_USER_MST")) {
						key.seth_APR_USER_MST(msgKey.getKeyValue("h_APR_USER_MST"));
					}
					if(msgKeyType.containsKeyColumn("BUSINESS_OPR_DATE")) {
						key.setBUSINESS_OPR_DATE(msgKey.getKeyValue("BUSINESS_OPR_DATE"));
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
