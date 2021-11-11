/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AA0050/src/com/nec/jp/orteus/metamorBase/AA0050/AA0050020Control.java,v $
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
import com.nec.jp.orteus.metamorBase.common01.util.Calculate;
import java.util.ArrayList;
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AA0050020Control
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

	public AA0050020Struct getStruct() { return this.struct; }	// Structの値（メディエータ）を返します。


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
	private void setSqlExceptionMsg(Exception e) throws ExpjException
	{
		// エラーメッセージ作成
		ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
		sysLog.severe(emsg, getsysUSER_CD());//致命的エラー エラー内容
		ExpjException ee = new ExpjException(e, emsg); // エクセプションを生成
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
	 * エラーメッセージ設定
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
	 * ワーニングメッセージ設定
	 * @param コード
	 * @param キー項目
	 */
	private void setWarnMessage(String code, String key)
	{
		ExpjMessage emsg = new ExpjMessage(code);
		msgStruct.addWarn( emsg );	// エラーメッセージとして登録
		sysLog.info(emsg, getsysUSER_CD()); //エラー内容
		emsg = new ExpjMessage( "ZZ01006", key );
		msgStruct.addWarn( emsg );	// エラーメッセージとして登録
		sysLog.info(emsg, getsysUSER_CD()); //エラー詳細
	}

//-----------------------------------------------------------------------------
	/** 画面共通定義取得クラス */
	ScreenParam _scParam = sp;

//---------- キー項目取得関連の処理 --------------------------------------------

	/** キー情報保持の為のStruct */
	private AA0050020Struct _keyStruct = new AA0050020Struct();

	/** キー情報Structの取得 */
	public AA0050020Struct getKeyStruct(){ return _keyStruct; }
	
	/** キー情報Structの設定 */
	public void setKeyStruct(AA0050020Struct struct){ _keyStruct.copy(struct); }

//---------- コンボボックスデータ取得関連の処理 -------------------------------

	/** 品目手配区分 */
	ComboStruct _MRP_ODR_TYP = null;

	/** 品目手配区分設定
	 * @param コンボボックスデータ
	*/
	public void setMRP_ODR_TYP_comb(ComboStruct combo){ _MRP_ODR_TYP = combo; }

	/** 品目手配区分取得
	 * @return 品目手配区分のコンボボックスデータ
	*/
	public ComboStruct getMRP_ODR_TYP_comb(){ return _MRP_ODR_TYP; }

	/** 品目内外作区分 */
	ComboStruct _OUTSIDE_TYP = null;

	/** 品目内外作区分設定
	 * @param コンボボックスデータ
	*/
	public void setOUTSIDE_TYP_comb(ComboStruct combo){ _OUTSIDE_TYP = combo; }

	/** 品目内外作区分取得
	 * @return 品目内外作区分のコンボボックスデータ
	*/
	public ComboStruct getOUTSIDE_TYP_comb(){ return _OUTSIDE_TYP; }

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
	private void setTypeValueAboutItem(AA0050020Struct s)
	{
		/** 品目手配区分 */
		s.setMRP_ODR_NAME(getTypeName(_MRP_ODR_TYP,s.getMRP_ODR_TYP()));
		/** 品目内外作区分 */
		s.setOUTSIDE_NAME(getTypeName(_OUTSIDE_TYP,s.getOUTSIDE_TYP()));
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

		_usersIntialized = true;
		return ;
	}


//------------------------------------------------------------------------
	/**
	 * コンボボックスの中身を取得します。
	 *
	 * @param data データの箱
	 */
	 private void setComboData(AA0050020Struct data) throws ExpjException
	 {
		ComboBox controller = new ComboBox(conn, sysUSER_CD);

		try{
			//コンボデータの取得
			ComboStruct MRP_ODR_TYP_comb = controller.getData("MRP_ODR_TYP");
			ComboStruct OUTSIDE_TYP_comb = controller.getData("OUTSIDE_TYP");

			controller.setConnection(null);

			//属性に取得データ設定
			setMRP_ODR_TYP_comb(MRP_ODR_TYP_comb);
			setOUTSIDE_TYP_comb(OUTSIDE_TYP_comb);

		}catch(SQLException e) {
			setSqlExceptionMsg(e);

		}catch(ComboException e){
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;
		}
	}

	//------------------------------------------------------------------------------

	/** 処理対象Struct退避用 */
	private AA0050020Struct _save_struct = new AA0050020Struct();

//------------------------------------------------------------------------------

	/** DB更新前チェック（行修正－更新、行削除、全削除、番号再振）
	 * @param なし
	 * @return true:成功 false:失敗
	*/
	public boolean checkListData() throws FoundationException, ExpjException
	{
		List key = new ArrayList();

		// 戻り値変数初期化
		boolean bResult = true;

		try {
			// トランザクション開始
			conn.beginTransWeb();  // ConnectionのAutoCommitフラグを制御します

			// 現在の読込キーでデータを読込(select for update no waitが入っている読込処理)
			List temp_list = new ArrayList();
			temp_list = entity.mselectRetry.read(conn, struct);

			// 読み込んだデータ件数が現在読み込んでいる件数と同じかどうかのチェック
			if(temp_list.size() != this.getListsize())
			{
				// エラーメッセージ作成
				key.add("M_WH_PRIORITY.PLANT_CD:" + struct.getw_PLANT_CD());
				key.add("M_WH_PRIORITY.ITEM_CD:" + struct.getITEM_CD());
				setErrorMessage("ZZ01105", key);
			}
			else
			{
				// 読み込んだ各データ内容が現在読み込んでいるデータ内容と同じかどうかのチェック
				AA0050020Struct now_struct = new AA0050020Struct();
				AA0050020Struct temp_struct = new AA0050020Struct();
				for(int i = 0; i < this.getListsize(); i++)
				{
					// 各リストからデータを取得
					now_struct = (AA0050020Struct)this.getListvalue(i);
					temp_struct = (AA0050020Struct)temp_list.get(i);

					// 保管区コード、優先順位番号が同じかどうかのチェック
					if((now_struct.getWH_CD().equals(temp_struct.getWH_CD()) != true)
					|| (Calculate.compare(now_struct.getWH_PRIORITY_REF_NO(), temp_struct.getWH_PRIORITY_REF_NO()) != 0) )
					{
						// エラーメッセージ作成
						key.add("M_WH_PRIORITY.PLANT_CD:" + struct.getw_PLANT_CD());
						key.add("M_WH_PRIORITY.ITEM_CD:" + struct.getITEM_CD());
						setErrorMessage("ZZ01105", key);
						break;
					}
				}
			}

			// エラーがない
			if(msgStruct.sizeError() == 0)
			{
				// コミット
				conn.commit();

				// 成功フラグ設定
				bResult = true;
			}
			else
			{
				// ロールバック
				conn.rollback();

				// 失敗フラグ設定
				bResult = false;
			}

		} catch(SQLException e) {
			// ロールバック
			conn.rollback();

			// 失敗フラグ設定
			bResult = false;

			setSqlExceptionMsg(e);

		}catch(Exception e){
			// ロールバック
			conn.rollback();

			// 失敗フラグ設定
			bResult = false;

			// エラーメッセージ作成
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);

			throw ee;
		}
		return bResult;
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
		logger.entering("AA0050020Control"+":USER="+struct.getsUser_ID(),"controlselect");
			//{{user_implement_dev:<controlselect>
		List key = new ArrayList();
		String keyMessage = "";

		try {
			// 利用者工場コード設定
			struct.setw_PLANT_CD(getsysPLANT_CD());

			// キー項目読み込み処理
			List temp_list = new ArrayList(0);
			temp_list = entity.mselectM_ITEM.read(conn, struct);
			if(temp_list.size() > 0){
				_keyStruct.copy((AA0050020Struct)temp_list.get(0));

				// 読み込み処理
				list = entity.mselect.read(conn, struct);
				if(list.size() == 0){
					// 読み込みキー設定
					_keyStruct.seth_ITEM_CD(struct.getITEM_CD());

					// 検索状態を「０件読込」に設定
					setReadStatus(NOT_FOUND);

				} else if(list.size() > 0) {
					// 最後の読み込み成功キー設定
					_keyStruct.seth_ITEM_CD(struct.getITEM_CD());

					// 検索状態を「読込成功」に設定
					setReadStatus(NORMAL);
				}

				// [入庫先保管区]の読込処理
				List wklist = entity.mM_ITEM_RCV_WH.read(conn, struct);
				if( wklist.size() > 0 ){
					AA0050020Struct wkStruct = (AA0050020Struct)wklist.get(0);
					_keyStruct.setRCV_WH_CD(wkStruct.getRCV_WH_CD());
					_keyStruct.setRCV_WH_NAME(wkStruct.getRCV_WH_NAME());
				}

				// コンボボックス値に対応する名称をセット
				setTypeValueAboutItem(_keyStruct);
				struct.setStruct(_keyStruct);

			}else{
				// 最終入力値として設定
				_keyStruct.copy(struct);
				// 検索結果0件の場合
				keyMessage = "M_ITEM.ITEM_CD:" + struct.getITEM_CD();
				setErrorMessage("AA01002", keyMessage);

				// 検索状態を「初期状態」に設定
				setReadStatus(INITIAL);

				// データが存在しない場合のクリア処理
				// hiddenのクリア
				struct.seth_ITEM_CD("");

				// 品目情報のクリア
				struct.setITEM_NAME("");

				// 一覧のクリア
				if(list != null){
					list.clear();
				}
				else{
					list = new ArrayList(0);
				}
				String w_itemCd = this._keyStruct.getITEM_CD();	// キー情報の退避
				this._keyStruct.initialize();					// 表示項目をデフォルトに戻す
				this._keyStruct.setITEM_CD(w_itemCd);			// キー情報の設定
			}

		} catch(SQLException e) {
			// 検索状態を「読込失敗」に設定
			setReadStatus(ERROR);

			setSqlExceptionMsg(e);

		}catch(Exception e){
			// 検索状態を「読込失敗」に設定
			setReadStatus(ERROR);

			// エラーメッセージ作成
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);

			throw ee;

		}
		//------------------------------------------------------------------
                //}}user_implement_dev:<controlselect>
		logger.exiting("AA0050020Control"+":USER="+struct.getsUser_ID(),"controlselect");

		return;
	}

	/**
	 * 行追加ボタン押下時に実行される処理です。
	 *
	 */
	public void controlappend() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0050");
		logger.entering("AA0050020Control"+":USER="+struct.getsUser_ID(),"controlappend");
			//{{user_implement_dev:<controlappend>
		List key = new ArrayList();

		try{
			// 初期値設定
			struct.initialize();

			// 利用者工場コード設定
			struct.setw_PLANT_CD(getsysPLANT_CD());

			// 品目番号設定
			struct.setITEM_CD(_keyStruct.getITEM_CD());

			// 品目名設定
			struct.setITEM_NAME(_keyStruct.getITEM_NAME());

		}catch(Exception e){
			// エラーメッセージ作成
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);

			throw ee;
		}
		//------------------------------------------------------------------
                //}}user_implement_dev:<controlappend>
		logger.exiting("AA0050020Control"+":USER="+struct.getsUser_ID(),"controlappend");

		return;
	}

	/**
	 * 行修正ボタン押下時に実行される処理です。
	 *
	 */
	public void controlmodify() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0050");
		logger.entering("AA0050020Control"+":USER="+struct.getsUser_ID(),"controlmodify");
			//{{user_implement_dev:<controlmodify>
		List key = new ArrayList();

		try {
			// 対象のデータをコピー
			AA0050020Struct target_struct = new AA0050020Struct();
			target_struct.copy(struct);

			// 利用者工場コード設定
			struct.setw_PLANT_CD(getsysPLANT_CD());// エラーメッセージ用
			target_struct.setw_PLANT_CD(getsysPLANT_CD());

			// 品目番号設定
			target_struct.setITEM_CD(_keyStruct.getITEM_CD());

			// 品目名設定
			target_struct.setITEM_NAME(_keyStruct.getITEM_NAME());

			// 処理対象データ存在チェック
			List temp_list = new ArrayList(0);
			AA0050020Struct temp_struct = new AA0050020Struct();
			temp_list = entity.mselectTargetData.read(conn, target_struct);
			if(temp_list.size() <= 0)
			{
				// エラーメッセージ作成
				key.add("M_WH_PRIORITY.PLANT_CD:" + struct.getw_PLANT_CD());
				key.add("M_WH_PRIORITY.ITEM_CD:" + struct.getITEM_CD());
				key.add("M_WH_PRIORITY.WH_CD:" + struct.getWH_CD());
				key.add("M_WH_PRIORITY.WH_PRIORITY_REF_NO:" + struct.getWH_PRIORITY_REF_NO());
				setErrorMessage("ZZ01105", key);
			}
			else
			{
				// レコードが更新されていないかチェック
				temp_struct = (AA0050020Struct)temp_list.get(0);
				if(target_struct.getw_MODIFY_COUNT().equals(temp_struct.getw_MODIFY_COUNT()) != true)
				{
					// エラーメッセージ作成
					key.add("M_WH_PRIORITY.PLANT_CD:" + struct.getw_PLANT_CD());
					key.add("M_WH_PRIORITY.ITEM_CD:" + struct.getITEM_CD());
					key.add("M_WH_PRIORITY.WH_CD:" + struct.getWH_CD());
					key.add("M_WH_PRIORITY.WH_PRIORITY_REF_NO:" + struct.getWH_PRIORITY_REF_NO());
					setErrorMessage("ZZ01105", key);
				}
			}

			// エラーがない場合、処理実行
			if(msgStruct.sizeError() <= 0)
			{
				// 画面表示Structへデータをコピー
				struct.copy(target_struct);

				// 更新前対象データ情報を退避
				_save_struct.copy(target_struct);

			}

		} catch(SQLException e) {
			// ロールバック
			conn.rollback();

			setSqlExceptionMsg(e);
		}
		//------------------------------------------------------------------
                //}}user_implement_dev:<controlmodify>
		logger.exiting("AA0050020Control"+":USER="+struct.getsUser_ID(),"controlmodify");

		return;
	}

	/**
	 * 行複写ボタン押下時に実行される処理です。
	 *
	 */
	public void controlcopy() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0050");
		logger.entering("AA0050020Control"+":USER="+struct.getsUser_ID(),"controlcopy");
			//{{user_implement_dev:<controlcopy>
		List key = new ArrayList();

		try{
			// 利用者工場コード設定
			struct.setw_PLANT_CD(getsysPLANT_CD());

			// 品目番号設定
			struct.setITEM_CD(_keyStruct.getITEM_CD());

			// 品目名設定
			struct.setITEM_NAME(_keyStruct.getITEM_NAME());

		}catch(Exception e){
			// エラーメッセージ作成
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);

			throw ee;
		}
		//------------------------------------------------------------------
                //}}user_implement_dev:<controlcopy>
		logger.exiting("AA0050020Control"+":USER="+struct.getsUser_ID(),"controlcopy");

		return;
	}

	/**
	 * 行削除ボタン押下時に実行される処理です。
	 *
	 */
	public void controlerase() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0050");
		logger.entering("AA0050020Control"+":USER="+struct.getsUser_ID(),"controlerase");
			//{{user_implement_dev:<controlerase>
		List key = new ArrayList();

		try {
			// トランザクション開始
			conn.beginTransWeb();  // ConnectionのAutoCommitフラグを制御します

			// 対象のデータをコピー
			AA0050020Struct target_struct = new AA0050020Struct();
			target_struct.copy(struct);

			// 利用者工場コード設定
			struct.setw_PLANT_CD(getsysPLANT_CD());// エラーメッセージ用
			target_struct.setw_PLANT_CD(getsysPLANT_CD());

			// 品目番号設定
			target_struct.setITEM_CD(_keyStruct.getITEM_CD());

			// 処理対象データ存在チェック
			List temp_list = new ArrayList(0);
			AA0050020Struct temp_struct = new AA0050020Struct();
			temp_list = entity.mselectTargetDataForUpdate.read(conn, target_struct);
			if(temp_list.size() <= 0)
			{
				// エラーメッセージ作成
				key.add("M_WH_PRIORITY.PLANT_CD:" + struct.getw_PLANT_CD());
				key.add("M_WH_PRIORITY.ITEM_CD:" + struct.getITEM_CD());
				key.add("M_WH_PRIORITY.WH_CD:" + struct.getWH_CD());
				key.add("M_WH_PRIORITY.WH_PRIORITY_REF_NO:" + struct.getWH_PRIORITY_REF_NO());
				setErrorMessage("ZZ01105", key);
			}
			else
			{
				// レコードが更新されていないかチェック
				temp_struct = (AA0050020Struct)temp_list.get(0);
				if(target_struct.getw_MODIFY_COUNT().equals(temp_struct.getw_MODIFY_COUNT()) != true)
				{
					// エラーメッセージ作成
					key.add("M_WH_PRIORITY.PLANT_CD:" + struct.getw_PLANT_CD());
					key.add("M_WH_PRIORITY.ITEM_CD:" + struct.getITEM_CD());
					key.add("M_WH_PRIORITY.WH_CD:" + struct.getWH_CD());
					key.add("M_WH_PRIORITY.WH_PRIORITY_REF_NO:" + struct.getWH_PRIORITY_REF_NO());
					setErrorMessage("ZZ01105", key);
				}
			}

			// エラーがない場合、処理実行
			if(msgStruct.sizeError() <= 0)
			{
				// 削除
				entity.mdeleteM_WH_PRIORITY.delete(conn, target_struct);

				// コミット
				conn.commit();

				// 読込み処理
				controlselect();
			}
			else
			{
				// ロールバック
				conn.rollback();
			}

		} catch(SQLException e) {
			// ロールバック
			conn.rollback();

			setSqlExceptionMsg(e);

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
                //}}user_implement_dev:<controlerase>
		logger.exiting("AA0050020Control"+":USER="+struct.getsUser_ID(),"controlerase");

		return;
	}

	/**
	 * 全削除ボタン押下時に実行される処理です。
	 *
	 */
	public void controleraseAll() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0050");
		logger.entering("AA0050020Control"+":USER="+struct.getsUser_ID(),"controleraseAll");
			//{{user_implement_dev:<controleraseAll>
		List key = new ArrayList();

		try {
			// 利用者工場コード設定
			struct.setw_PLANT_CD(getsysPLANT_CD());

			// 処理前のリストデータチェック処理
			if(checkListData() == false)
			{
				return;
			}

		}catch(Exception e){
			// エラーメッセージ作成
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);

			throw ee;
		}

		try {

			// トランザクション開始
			conn.beginTransWeb();  // ConnectionのAutoCommitフラグを制御します

			// 削除処理
			for(int i = 0 ;i < this.getListsize() ;i++){

				// 指定インデックスのリストデータをstructへ取得設定
				struct.copy((AA0050020Struct)this.getListvalue(i));

				// 品目番号設定
				struct.setITEM_CD(_keyStruct.getITEM_CD());

				// 削除
				entity.mdeleteM_WH_PRIORITY.delete(conn, struct);

			}

			// コミット
			conn.commit();

			// 品目番号設定
			struct.setITEM_CD(_keyStruct.getITEM_CD());

			controlselect();

		}
		catch(SQLException e) {
			// ロールバック
			conn.rollback();

			setSqlExceptionMsg(e);

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
                //}}user_implement_dev:<controleraseAll>
		logger.exiting("AA0050020Control"+":USER="+struct.getsUser_ID(),"controleraseAll");

		return;
	}

	/**
	 * 番号再振ボタン押下時に実行される処理です。
	 *
	 */
	public void controlchange() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0050");
		logger.entering("AA0050020Control"+":USER="+struct.getsUser_ID(),"controlchange");
			//{{user_implement_dev:<controlchange>
		List key = new ArrayList();

		try {
			// 利用者工場コード設定
			struct.setw_PLANT_CD(getsysPLANT_CD());

			// 処理前のリストデータチェック処理
			if(checkListData() == false)
			{
				return;
			}

		}catch(Exception e){
			// エラーメッセージ作成
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);

			throw ee;
		}

		try {
			// トランザクション開始
			conn.beginTransWeb();  // ConnectionのAutoCommitフラグを制御します

			// 品目番号を退避
			String sITEM_CD = struct.getITEM_CD();

			// 削除処理
			String strWH_PRIORITY_REF_NO = new String("0");
			for(int i = 0 ;i < this.getListsize() ;i++ ){

				// 指定インデックスのリストデータをstructへ取得設定
				struct.copy((AA0050020Struct)this.getListvalue(i));
				// 品目番号設定
				struct.setITEM_CD(sITEM_CD);
				boolean result = false;			// チェック結果格納用

				// レコードが更新されていないかチェック
				result = entity.mcheckMODIFY_COUNT.check(conn, struct);
				if(result == false){
					// エラーメッセージ作成
					key.add("M_WH_PRIORITY.ITEM_CD:" + struct.getITEM_CD());
					key.add("M_WH_PRIORITY.WH_CD:" + struct.getWH_CD());
					key.add("M_WH_PRIORITY.MODIFY_COUNT:" + struct.getw_MODIFY_COUNT());
					setErrorMessage("ZZ01105", key);
					break;
				}

				// エラーがない場合、更新処理
				if(msgStruct.sizeError() <= 0){

					// 優先順位番号を10番から10刻みで設定
					strWH_PRIORITY_REF_NO = Calculate.add(strWH_PRIORITY_REF_NO, "10");
					struct.setWH_PRIORITY_REF_NO(strWH_PRIORITY_REF_NO);

					// 更新処理
					entity.mupdateM_WH_PRIORITY.update(conn, struct);

				}
			}

			// エラーがない場合、更新処理
			if(msgStruct.sizeError() <= 0){
				// コミット
				conn.commit();

				// 読込処理
				controlselect();

			} else {

				// ロールバック
				conn.rollback();

			}

		} catch(SQLException e) {
			// ロールバック
			conn.rollback();

			setSqlExceptionMsg(e);

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
                //}}user_implement_dev:<controlchange>
		logger.exiting("AA0050020Control"+":USER="+struct.getsUser_ID(),"controlchange");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlclear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0050");
		logger.entering("AA0050020Control"+":USER="+struct.getsUser_ID(),"controlclear");
			//{{user_implement_dev:<controlclear>
		List key = new ArrayList();

		try{
			if(list != null){
				list.clear();
			}
			else{
				list = new ArrayList(0);
			}
			this.struct.initialize();
			this._keyStruct.initialize();
			this._save_struct.initialize();

			// 検索状態を「初期状態」に設定
			setReadStatus(INITIAL);

		}catch(Exception e){
			// エラーメッセージ作成
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);

			throw ee;
		}
		//------------------------------------------------------------------
                //}}user_implement_dev:<controlclear>
		logger.exiting("AA0050020Control"+":USER="+struct.getsUser_ID(),"controlclear");

		return;
	}

	/**
	 * 戻るボタン押下時に実行される処理です。
	 *
	 */
	public void controlcancelSub1() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0050");
		logger.entering("AA0050020Control"+":USER="+struct.getsUser_ID(),"controlcancelSub1");
			//{{user_implement_dev:<controlcancelSub1>
		// モード設定
		struct.setStruct(_keyStruct);
		controlselect();
		//------------------------------------------------------------------
                //}}user_implement_dev:<controlcancelSub1>
		logger.exiting("AA0050020Control"+":USER="+struct.getsUser_ID(),"controlcancelSub1");

		return;
	}

	/**
	 * 更新ボタン押下時に実行される処理です。
	 *
	 */
	public void controlupdateSub1() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0050");
		logger.entering("AA0050020Control"+":USER="+struct.getsUser_ID(),"controlupdateSub1");
			//{{user_implement_dev:<controlupdateSub1>
		List key = new ArrayList();
		String keyMessage = "";

		try{
			// トランザクション開始
			conn.beginTransWeb();  // ConnectionのAutoCommitフラグを制御します

			boolean result = false;			// チェック結果格納用

			List temp_list = new ArrayList(0);
			AA0050020Struct temp_struct = new AA0050020Struct();

			// 所要量対象フラグチェック
			struct.setw_PLANT_CD(getsysPLANT_CD());
			result = entity.mCHECK_MRP_WH.check(conn, struct);
			if( result ){
				key.add("M_WH.WH_CD:" + struct.getWH_CD());
				key.add("M_WH.PLANT_CD:" + struct.getw_PLANT_CD());
				key.add("M_WH.MRP_FLG:<>1");
				setErrorMessage("AA00149", key);
			}

			// 処理対象データ存在チェック
			temp_list = entity.mselectTargetDataForUpdate.read(conn, _save_struct);
			if(temp_list.size() <= 0)
			{
				// エラーメッセージ作成
				key.add("M_WH_PRIORITY.PLANT_CD:" + _save_struct.getw_PLANT_CD());
				key.add("M_WH_PRIORITY.ITEM_CD:" + _save_struct.getITEM_CD());
				key.add("M_WH_PRIORITY.WH_CD:" + _save_struct.getWH_CD());
				key.add("M_WH_PRIORITY.WH_PRIORITY_REF_NO:" + _save_struct.getWH_PRIORITY_REF_NO());
				setErrorMessage("ZZ01105", key);
			}
			else
			{
				// レコードが更新されていないかチェック
				temp_struct = (AA0050020Struct)temp_list.get(0);
				if(struct.getw_MODIFY_COUNT().equals(temp_struct.getw_MODIFY_COUNT()) != true)
				{
					// エラーメッセージ作成
					key.add("M_WH_PRIORITY.PLANT_CD:" + _save_struct.getw_PLANT_CD());
					key.add("M_WH_PRIORITY.ITEM_CD:" + _save_struct.getITEM_CD());
					key.add("M_WH_PRIORITY.WH_CD:" + _save_struct.getWH_CD());
					key.add("M_WH_PRIORITY.WH_PRIORITY_REF_NO:" + _save_struct.getWH_PRIORITY_REF_NO());
					setErrorMessage("ZZ01105", key);
				}
			}

			// 優先順位番号の重複チェック
			// 最新状態取得のための読込
			temp_list = entity.mselect.read(conn, struct);
			for(int i = 0; i < temp_list.size(); i++)
			{
				// 最新データ取得
				temp_struct = (AA0050020Struct)temp_list.get(i);

				// 自分自身のデータの優先順位はチェック対象としない
				if(struct.getWH_CD().equals(temp_struct.getWH_CD()) == true)
				{
					continue;
				}

				// 優先順位番号が同じかどうかのチェック
				if(Calculate.compare(struct.getWH_PRIORITY_REF_NO(), temp_struct.getWH_PRIORITY_REF_NO()) == 0)
				{
					// エラーメッセージ作成
					key.add("M_WH_PRIORITY.PLANT_CD:" + struct.getw_PLANT_CD());
					key.add("M_WH_PRIORITY.ITEM_CD:" + struct.getITEM_CD());
					key.add("M_WH_PRIORITY.WH_CD:" + struct.getWH_CD());
					key.add("M_WH_PRIORITY.WH_PRIORITY_REF_NO:" + struct.getWH_PRIORITY_REF_NO());
					setErrorMessage("AA00080", key);
					break;
				}
			}

			// 保管区存在チェック
			result = entity.mcheckM_WH.check(conn, struct);
			if(result == false){
				// エラーメッセージ作成
				keyMessage = "M_WH_PRIORITY.WH_CD:" + _save_struct.getWH_CD();
				setErrorMessage("AA01009", keyMessage);
			}

			// エラーがない場合、更新処理
			if(msgStruct.sizeError() <= 0){

				// 更新
				entity.mupdateM_WH_PRIORITY.update(conn, struct);

				// コミット
				conn.commit();

				// 保管区マスタの取引先コード存在チェック
				temp_list = entity.mselectVEND_CD_IN_WH.read(conn, struct);
				if(temp_list.size() > 0)
				{
					temp_struct = (AA0050020Struct)temp_list.get(0);
					if( temp_struct.getw_VEND_CD() != null ){
						// ワーニングメッセージ作成
						keyMessage = "M_WH_PRIORITY.WH_CD:" + _save_struct.getWH_CD();
						setWarnMessage("AA60004", keyMessage);
					}
				}

				// 読込み処理
				controlselect();

			} else {

				// ロールバック
				conn.rollback();

			}

		} catch(SQLException e) {
			// ロールバック
			conn.rollback();

			setSqlExceptionMsg(e);

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
                //}}user_implement_dev:<controlupdateSub1>
		logger.exiting("AA0050020Control"+":USER="+struct.getsUser_ID(),"controlupdateSub1");

		return;
	}

	/**
	 * 登録ボタン押下時に実行される処理です。
	 *
	 */
	public void controlinsertSub1() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0050");
		logger.entering("AA0050020Control"+":USER="+struct.getsUser_ID(),"controlinsertSub1");
			//{{user_implement_dev:<controlinsertSub1>
		List key = new ArrayList();
		String keyMessage = "";

		try{
			//行追加,行複写
			boolean result = false;			// チェック結果格納用

			// 保管区存在チェック
			result = entity.mcheckM_WH.check(conn, struct);
			if(result == false){
				// エラーメッセージ作成
				keyMessage = "M_WH_PRIORITY.WH_CD:" + struct.getWH_CD();
				setErrorMessage("AA01009", keyMessage);

			}

			// 所要量対象フラグチェック
			struct.setw_PLANT_CD(getsysPLANT_CD());
			result = entity.mCHECK_MRP_WH.check(conn, struct);
			if( result ){
				key.add("M_WH.WH_CD:" + struct.getWH_CD());
				key.add("M_WH.PLANT_CD:" + struct.getw_PLANT_CD());
				key.add("M_WH.MRP_FLG:<>1");
				setErrorMessage("AA00149", key);
			}

			// 保管先優先順位存在チェック
			result = entity.mcheckM_WH_PRIORITY.check(conn, struct);
			if(result == true){
				// エラーメッセージ作成
				key.add("M_WH_PRIORITY.PLANT_CD:" + struct.getw_PLANT_CD());
				key.add("M_WH_PRIORITY.ITEM_CD:" + struct.getITEM_CD());
				key.add("M_WH_PRIORITY.WH_CD:" + struct.getWH_CD());
				setErrorMessage("ZZ01102", key);

			}

 			// 保管区.工場コード ≠ 利用者工場コード チェック
			List temp_list = new ArrayList();
			AA0050020Struct temp_struct = new AA0050020Struct();
			temp_list = entity.mselectPLANT_CD_IN_WH.read(conn, struct);
			if(temp_list.size() > 0)
			{
				temp_struct = (AA0050020Struct)temp_list.get(0);
				if(temp_struct.getw_PLANT_CD().equals(struct.getw_PLANT_CD()) != true)
				{
					// エラーメッセージ作成
					keyMessage = "M_WH.WH_CD:" + struct.getWH_CD();
					setErrorMessage("AA01007", keyMessage);
				}
			}

			// 優先順位番号の重複チェック
			// 最新状態取得のための読込
			temp_list = entity.mselect.read(conn, struct);
			for(int i = 0; i < temp_list.size(); i++)
			{
				// 最新データ取得
				temp_struct = (AA0050020Struct)temp_list.get(i);

				// 優先順位番号が同じかどうかのチェック
				if(Calculate.compare(struct.getWH_PRIORITY_REF_NO(), temp_struct.getWH_PRIORITY_REF_NO()) == 0)
				{
					// エラーメッセージ作成
					key.add("M_WH_PRIORITY.PLANT_CD:" + struct.getw_PLANT_CD());
					key.add("M_WH_PRIORITY.ITEM_CD:" + struct.getITEM_CD());
					key.add("M_WH_PRIORITY.WH_CD:" + struct.getWH_CD());
					key.add("M_WH_PRIORITY.WH_PRIORITY_REF_NO:" + struct.getWH_PRIORITY_REF_NO());
					setErrorMessage("AA00080", key);
					break;
				}
			}

			// エラーがない場合、追加処理
			if(msgStruct.sizeError() <= 0){

				// 登録
				entity.minsertM_WH_PRIORITY.create(conn, struct);

				// 保管区マスタの取引先コード存在チェック
				temp_list = entity.mselectVEND_CD_IN_WH.read(conn, struct);
				if(temp_list.size() > 0)
				{
					temp_struct = (AA0050020Struct)temp_list.get(0);
					if( temp_struct.getw_VEND_CD() != null ){
						// ワーニングメッセージ作成
						keyMessage = "M_WH.WH_CD:" + struct.getWH_CD();
						setWarnMessage("AA60004", keyMessage);
					}
				}

				// 読込み処理
				controlselect();
			}

		} catch(SQLException e) {
			setSqlExceptionMsg(e);
		}
		//------------------------------------------------------------------
                //}}user_implement_dev:<controlinsertSub1>
		logger.exiting("AA0050020Control"+":USER="+struct.getsUser_ID(),"controlinsertSub1");

		return;
	}

	/**
	 * 更新ボタン押下時に実行される処理です。
	 *
	 */
	public void controlUpdate() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0050");
		logger.entering("AA0050020Control"+":USER="+struct.getsUser_ID(),"controlUpdate");
			//{{user_implement_dev:<controlUpdate>

		List wkList = null;
		List listMessage = new ArrayList();
		String strMessage = "";
		AA0050020Struct wkStruct = null;
		boolean transFlg = false;

		try{

			// トランザクション開始
			conn.beginTransWeb();
			transFlg = true;

			struct.setw_PLANT_CD(getsysPLANT_CD());

			if( struct.getRCV_WH_CD() == null || 
				"".equals(struct.getRCV_WH_CD()) ){		// 入庫先保管区コードが未入力の場合

				// [品目別入庫先保管区]に存在すれば削除する
				wkList = entity.mM_ITEM_RCV_WH_LOCK.read(conn, struct);
				if( wkList.size() > 0 ){
					entity.mM_ITEM_RCV_WH.delete(conn, struct);
				}

			} else {	// 入庫先保管区コードが入力された場合

				// [保管区]の存在チェック
				wkList = entity.mCHECK_MRP_FLG_M_WH.read(conn, struct);
				if( wkList.size() <= 0 ){
					strMessage = "M_WH.WH_CD:" + struct.getRCV_WH_CD();
					setErrorMessage("AA01009", strMessage);
					return;
				}
				wkStruct = (AA0050020Struct)wkList.get(0);

				// 工場コードのチェック
				if( !struct.getw_PLANT_CD().equals(wkStruct.getw_PLANT_CD()) ){
					strMessage = "M_WH.WH_CD:" + struct.getRCV_WH_CD();
					setErrorMessage("AA01007", strMessage);
				}

				// 所要量対象フラグチェック
				if( wkStruct.getw_MRP_FLG().intValue() != AA0050Const._MRP_TARGET ){
					strMessage = "M_WH.WH_CD:" + struct.getRCV_WH_CD();
					setErrorMessage("AA00149", strMessage);
				}

				if( msgStruct.sizeError() <= 0 ){
					// [品目別入庫先保管区]に存在しなければ追加
					// 存在すれば更新
					wkList = entity.mM_ITEM_RCV_WH_LOCK.read(conn, struct);
					if( wkList.size() <= 0 ){
						entity.mM_ITEM_RCV_WH.create(conn, struct);
					} else {
						entity.mM_ITEM_RCV_WH.update(conn, struct);
					}
				} else {
					return;
				}

			}

            // コミット
            conn.commit();
            transFlg = false;

            controlselect();

		} catch(SQLException e) {
			setSqlExceptionMsg(e);
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

                //}}user_implement_dev:<controlUpdate>
		logger.exiting("AA0050020Control"+":USER="+struct.getsUser_ID(),"controlUpdate");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0050");
		logger.entering("AA0050020Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
		// 検索状態を「初期状態」に設定
		setReadStatus(INITIAL);
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AA0050020Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0050");
		logger.entering("AA0050020Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
		List key = new ArrayList();

		try {
			//コンボデータの設定
			ComboBox controller = new ComboBox(conn, sysUSER_CD);
			ComboStruct _MRP_ODR_TYP = controller.getData("MRP_ODR_TYP");
			ComboStruct _OUTSIDE_TYP = controller.getData("OUTSIDE_TYP");
			controller.setConnection(null);
			
			//Structにデータ設定
			setMRP_ODR_TYP_comb(_MRP_ODR_TYP);
			setOUTSIDE_TYP_comb(_OUTSIDE_TYP);

			// 検索状態を「初期状態」に設定
			setReadStatus(INITIAL);

		} catch(SQLException e) {
			setSqlExceptionMsg(e);

		} catch(ComboException e) {
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
		logger.exiting("AA0050020Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

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
		logger.entering("AA0050020Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
		try {
			//コンボデータの設定
			ComboBox controller = new ComboBox(conn, sysUSER_CD);
			ComboStruct _MRP_ODR_TYP = controller.getData("MRP_ODR_TYP");
			ComboStruct _OUTSIDE_TYP = controller.getData("OUTSIDE_TYP");
			controller.setConnection(null);
		}catch(Exception e){
			e.printStackTrace();
		}
			// コンボボックスデータ用意
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("AA0050020Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("eraseAll") ) {
				controleraseAll();
			} else if( button.equals("change") ) {
				controlchange();
			} else if( button.equals("clear") ) {
				controlclear();
			} else if( button.equals("cancelSub1") ) {
				controlcancelSub1();
			} else if( button.equals("updateSub1") ) {
				controlupdateSub1();
			} else if( button.equals("insertSub1") ) {
				controlinsertSub1();
			} else if( button.equals("Update") ) {
				controlUpdate();
			} else if( button.equals("initial") ) {
				controlINITIAL();
			} else if( button.equals("reload") ) {
				controlRELOAD();
			}
		//{{user_implement_dev:<control_eventHandller>
		// コンボボックスデータ設定
		struct.setList_MRP_ODR_TYP_val(_MRP_ODR_TYP.getValList());
		struct.setList_MRP_ODR_TYP_name(_MRP_ODR_TYP.getExplanList());
		struct.setList_OUTSIDE_TYP_val(_OUTSIDE_TYP.getValList());
		struct.setList_OUTSIDE_TYP_name(_OUTSIDE_TYP.getExplanList());
                //}}user_implement_dev:<control_eventHandller>
		} catch( BusinessLockException ble ) {
			// 枠メッセージ出力依頼作成
			setNewDataFlg(false);
		} catch( ResourceBusyException rbe ) {
			ExpjException ee = new ExpjException(rbe, "ZZ01105");
			throw ee;
		} catch( FoundationException e ) {
//			e.printStackTrace();
//			throw new FoundationException("AA0050020Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AA0050020-E999","CSVの出力処理"));
			throw new FoundationException("AA0050020Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AA0050020-E999","システム日付の取得処理"));
				throw new FoundationException("AA0050020Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AA0050020-E999","コントロールのイベント処理"));
			throw new FoundationException("AA0050020Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected AA0050020Entity entity;
	protected AA0050020Struct struct;
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

		entity = new AA0050020Entity();
		struct = new AA0050020Struct();

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
	 * AA0050020クラスの標準コンストラクタ
	 */
	public AA0050020Control() throws BusinessProcessException, FoundationException
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
				AA0050020Struct key = (AA0050020Struct)keyList.get(j);
				// メッセージキーを作成する
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("WH_CD") && key.getWH_CD() != null) {
					msgKey.setKeyValue("WH_CD", key.getWH_CD());
				}
				if(msgKeyType.containsKeyColumn("WH_PRIORITY_REF_NO") && key.getWH_PRIORITY_REF_NO() != null) {
					msgKey.setKeyValue("WH_PRIORITY_REF_NO", key.getWH_PRIORITY_REF_NO());
				}
				if(msgKeyType.containsKeyColumn("WH_NAME") && key.getWH_NAME() != null) {
					msgKey.setKeyValue("WH_NAME", key.getWH_NAME());
				}
				if(msgKeyType.containsKeyColumn("w_VEND_CD") && key.getw_VEND_CD() != null) {
					msgKey.setKeyValue("w_VEND_CD", key.getw_VEND_CD());
				}
				if(msgKeyType.containsKeyColumn("w_MODIFY_COUNT") && key.getw_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("w_MODIFY_COUNT", key.getw_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("w_PLANT_CD") && key.getw_PLANT_CD() != null) {
					msgKey.setKeyValue("w_PLANT_CD", key.getw_PLANT_CD());
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
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP") && key.getMRP_ODR_TYP() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP", key.getMRP_ODR_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("OUTSIDE_TYP") && key.getOUTSIDE_TYP() != null) {
					msgKey.setKeyValue("OUTSIDE_TYP", key.getOUTSIDE_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("RCV_WH_CD") && key.getRCV_WH_CD() != null) {
					msgKey.setKeyValue("RCV_WH_CD", key.getRCV_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("RCV_WH_NAME") && key.getRCV_WH_NAME() != null) {
					msgKey.setKeyValue("RCV_WH_NAME", key.getRCV_WH_NAME());
				}
				if(msgKeyType.containsKeyColumn("w_MRP_FLG") && key.getw_MRP_FLG() != null) {
					msgKey.setKeyValue("w_MRP_FLG", key.getw_MRP_FLG().toString());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_NAME") && key.getMRP_ODR_NAME() != null) {
					msgKey.setKeyValue("MRP_ODR_NAME", key.getMRP_ODR_NAME());
				}
				if(msgKeyType.containsKeyColumn("OUTSIDE_NAME") && key.getOUTSIDE_NAME() != null) {
					msgKey.setKeyValue("OUTSIDE_NAME", key.getOUTSIDE_NAME());
				}
				if(msgKeyType.containsKeyColumn("h_ITEM_CD") && key.geth_ITEM_CD() != null) {
					msgKey.setKeyValue("h_ITEM_CD", key.geth_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP_name") && key.getMRP_ODR_TYP_name() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP_name", key.getMRP_ODR_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP_val") && key.getMRP_ODR_TYP_val() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP_val", key.getMRP_ODR_TYP_val().toString());
				}
				if(msgKeyType.containsKeyColumn("OUTSIDE_TYP_name") && key.getOUTSIDE_TYP_name() != null) {
					msgKey.setKeyValue("OUTSIDE_TYP_name", key.getOUTSIDE_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("OUTSIDE_TYP_val") && key.getOUTSIDE_TYP_val() != null) {
					msgKey.setKeyValue("OUTSIDE_TYP_val", key.getOUTSIDE_TYP_val().toString());
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
					AA0050020Struct key = new AA0050020Struct();
					if(msgKeyType.containsKeyColumn("WH_CD")) {
						key.setWH_CD(msgKey.getKeyValue("WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("WH_PRIORITY_REF_NO")) {
						key.setWH_PRIORITY_REF_NO(msgKey.getKeyValue("WH_PRIORITY_REF_NO"));
					}
					if(msgKeyType.containsKeyColumn("WH_NAME")) {
						key.setWH_NAME(msgKey.getKeyValue("WH_NAME"));
					}
					if(msgKeyType.containsKeyColumn("w_VEND_CD")) {
						key.setw_VEND_CD(msgKey.getKeyValue("w_VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_MODIFY_COUNT")) {
						key.setw_MODIFY_COUNT(msgKey.getKeyValue("w_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("w_PLANT_CD")) {
						key.setw_PLANT_CD(msgKey.getKeyValue("w_PLANT_CD"));
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
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP")) {
						key.setMRP_ODR_TYP(new Integer(msgKey.getKeyValue("MRP_ODR_TYP")));
					}
					if(msgKeyType.containsKeyColumn("OUTSIDE_TYP")) {
						key.setOUTSIDE_TYP(new Integer(msgKey.getKeyValue("OUTSIDE_TYP")));
					}
					if(msgKeyType.containsKeyColumn("RCV_WH_CD")) {
						key.setRCV_WH_CD(msgKey.getKeyValue("RCV_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("RCV_WH_NAME")) {
						key.setRCV_WH_NAME(msgKey.getKeyValue("RCV_WH_NAME"));
					}
					if(msgKeyType.containsKeyColumn("w_MRP_FLG")) {
						key.setw_MRP_FLG(new Integer(msgKey.getKeyValue("w_MRP_FLG")));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_NAME")) {
						key.setMRP_ODR_NAME(msgKey.getKeyValue("MRP_ODR_NAME"));
					}
					if(msgKeyType.containsKeyColumn("OUTSIDE_NAME")) {
						key.setOUTSIDE_NAME(msgKey.getKeyValue("OUTSIDE_NAME"));
					}
					if(msgKeyType.containsKeyColumn("h_ITEM_CD")) {
						key.seth_ITEM_CD(msgKey.getKeyValue("h_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP_name")) {
						key.setMRP_ODR_TYP_name(msgKey.getKeyValue("MRP_ODR_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP_val")) {
						key.setMRP_ODR_TYP_val(new Integer(msgKey.getKeyValue("MRP_ODR_TYP_val")));
					}
					if(msgKeyType.containsKeyColumn("OUTSIDE_TYP_name")) {
						key.setOUTSIDE_TYP_name(msgKey.getKeyValue("OUTSIDE_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("OUTSIDE_TYP_val")) {
						key.setOUTSIDE_TYP_val(new Integer(msgKey.getKeyValue("OUTSIDE_TYP_val")));
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
