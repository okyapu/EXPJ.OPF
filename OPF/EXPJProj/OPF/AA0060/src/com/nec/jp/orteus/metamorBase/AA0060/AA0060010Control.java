/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AA0060/src/com/nec/jp/orteus/metamorBase/AA0060/AA0060010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AA0060;

import com.nec.jp.orteus.metamorBase.AA0060.*;
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
import java.util.ArrayList;
import com.nec.jp.orteus.metamorBase.util.AlarmMessage.AlarmMessageException;
//------------------------------------------------------------------------------
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AA0060010Control
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

	/** 倉庫区分 1:工程保管場所 */
	private final static String WH_PROCESS = "1";

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

	public AA0060010Struct getStruct() { return this.struct; }	// Structの値（メディエータ）を返します。

	//------------------------------------------------------------------------
	// メッセージ関連の処理

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

	// Add Anken Start 20140312 wang-tt
	/**
	 * ワーニングメッセージ設定
	 * @param code メッセージ番号
	 * @param key 出力メッセージ
	 */
	private void setWarnMessage(String code)
	{
		ExpjMessage emsg = new ExpjMessage(code);
		msgStruct.addWarn( emsg );	// ワーニングメッセージとして登録
		sysLog.warning(emsg, getsysUSER_CD());
	}
	// Add Anken End   20140312 wang-tt
	//------------------------------------------------------------------------
	
	/**
	 * DB登録/更新時共通 設定内容チェック
	 *
	 * @return  true:OK / false:NG
	 */
	private boolean isValidContents()throws FoundationException, SQLException
	{
		String keyMessage = "";
		List key = new ArrayList();

		boolean result = true;

		// 保管区チェック
		if(struct.getWH_CD().equals("") == false){
			List w = entity.mcheckWH_CD.read(conn, struct);

			// 存在しない
			if(w.size() <= 0){
				result = false;
				
				// 保管区名クリア
				struct.setWH_NAME("");
				
				sysLog.finest_d("update error:WH_CD[" +  struct.getWH_CD()
					+ "] not exist in M_WH", struct.getsUser_ID());
				keyMessage = "M_WH.WH_CD:" + struct.getWH_CD();
				setErrorMessage("AA01009", keyMessage);
			}
			else{
				// 保管区名の設定
				struct.setWH_NAME(((AA0060010Struct)w.get(0)).getWH_NAME());

				// 工場不一致 ?
				if(getsysPLANT_CD().equals(((AA0060010Struct)w.get(0)).getw_PLANT_CD()) == false){
					result = false;
					sysLog.finest_d("insert error:strage area is in another plant.", struct.getsUser_ID());
					sysLog.finest_d("M_WH.WH_CD[" + ((AA0060010Struct)w.get(0)).getWH_CD() + "]"
						+ "M_WH.PLANT_CD[" + ((AA0060010Struct)w.get(0)).getw_PLANT_CD() + "]  "
						+ "USER PLANT_CD[" + getsysPLANT_CD() + "]",struct.getsUser_ID());

					key.add("M_WH.WH_CD:" + ((AA0060010Struct)w.get(0)).getWH_CD());
					key.add("M_WH.PLANT_CD:" + ((AA0060010Struct)w.get(0)).getw_PLANT_CD());
					setErrorMessage("AA01007", key);
				} else {
					// [保管区]."倉庫区分"が１(1:工程保管場所)でない場合業務エラー。
					if( !WH_PROCESS.equals(((AA0060010Struct)w.get(0)).getWH_TYP()) ){
						result = false;
						keyMessage = "M_WH.WH_CD:" + ((AA0060010Struct)w.get(0)).getWH_CD();
						setErrorMessage("AA00156", keyMessage);
					}
				}
			}
		}

		// 代替作業区チェック
		if(struct.getSUB_WS_CD().equals("") == false){
			List w = entity.mcheckSUB_WS_EXIST.read(conn, struct);

			// 存在しない
			if(w.size() <= 0){
				result = false;
				
				// 代替作業区名クリア
				struct.setSUB_WS_NAME("");
				
				sysLog.finest_d("insert errror:SUB_WS_CD[" + struct.getSUB_WS_CD()
					+ "] not exist in M_WS", struct.getsUser_ID());

				keyMessage = "M_WS.SUB_WS_CD:" + struct.getSUB_WS_CD();
				setErrorMessage("AA01010", keyMessage);
			}
			else{
				// 代替作業区名の設定
				struct.setSUB_WS_NAME(((AA0060010Struct)w.get(0)).getSUB_WS_NAME());
				
				// 工場不一致 ?
				if(getsysPLANT_CD().equals(((AA0060010Struct)w.get(0)).getw_PLANT_CD()) == false){
					result = false;
					sysLog.finest_d("insert error:sub-WS is in another plant.", struct.getsUser_ID());
					sysLog.finest_d("M_WS.WS_CD[" + ((AA0060010Struct)w.get(0)).getWS_CD() + "]"
						+ "M_WS.PLANT_CD[" + ((AA0060010Struct)w.get(0)).getw_PLANT_CD() + "]  "
						+ "USER PLANT_CD[" + getsysPLANT_CD() + "]",struct.getsUser_ID());

					key.add("M_WS.WS_CD:" + ((AA0060010Struct)w.get(0)).getWS_CD());
					key.add("M_WS.PLANT_CD:" + ((AA0060010Struct)w.get(0)).getw_PLANT_CD());
					setErrorMessage("AA01011", key);
				}
			}
		}

		// 代替作業区と作業区の重複チェック
		if(struct.getWS_CD().equals(struct.getSUB_WS_CD())){
			sysLog.finest_d("insert error:SUB_WS_CD is a duplication of WS_CD", struct.getsUser_ID());

			key.add("M_WS.SUB_WS_CD:" + struct.getSUB_WS_CD());
			key.add("M_WS.WS_CD:" + struct.getWS_CD());
			setErrorMessage("AA00081", key);
			result = false;
		}
		
		// Add Anken Start 20140307 wang-tt
		// 作業区分類01コードがnullではない
		if (struct.getWS_CLASS_01_CD() != null && !"".equals(struct.getWS_CLASS_01_CD())) {
			List classList = entity.mselectWS_CLASS_01_NAME.read(conn, struct);
			// 作業区01コードが［分類マスタ］に存在しません。
			if (classList.isEmpty()) {
				keyMessage = "M_WS_CLASS.WS_CLASS_01_CD:" + struct.getWS_CLASS_01_CD();
				setErrorMessage("AA01609", keyMessage);
			} else {
				// 作業区01名
				AA0060010Struct WSCLASS01NAMEstruct = (AA0060010Struct) classList.get(0);
				struct.setWS_CLASS_01_NAME(WSCLASS01NAMEstruct.getWS_CLASS_01_NAME());
			}
		}
		// Add Anken End   20140307 wang-tt
		return result;
	}

	//------------------------------------------------------------------------
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * 読込ボタン押下時に実行される処理です。
	 *
	 */
	public void controlselect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0060");
		logger.entering("AA0060010Control"+":USER="+struct.getsUser_ID(),"controlselect");
			//{{user_implement_dev:<controlselect>
		//------------------------------------------------------------------
		String keyMessage = "";

		try {
				
			// 読み込み処理
			list = entity.mselect.read(conn, struct);
			
			// Add Anken Start 20140307 wang-tt
			List wsclassList = entity.mselectM_WS_CLASS.read(conn, struct);
			List classnameList = entity.mselectCLASS_NAME.read(conn, struct);
			// Add Anken End   20140307 wang-tt
			
			// 検索結果0件の場合
			if(list.size() <= 0){
				sysLog.finest_d("read error:WS_CD not exist in M_WS", struct.getsUser_ID());
				keyMessage = "M_WS.WS_CD:" + struct.getWS_CD();
				setErrorMessage("ZZ06001", keyMessage);

				// データが存在しない場合のクリア処理
				String w_wsCd = struct.getWS_CD();	// キー情報の退避
				this.struct.initialize();			// 表示項目をデフォルトに戻す
				struct.setWS_CD(w_wsCd);			// キー情報の設定

				if(list != null){
					list.clear();
				}
				else{
					list = new ArrayList(0);
				}

				// 検索状態を「初期状態」に設定
				setReadStatus(INITIAL);
			}
			//Del Anken Start 20140415 hui-x
//			// Add Anken Start 20140307 wang-tt
//			// 作業区コード が [作業区分類] に存在しない場合
//			else if (!(struct.getCLASS_NAME() == null || "".equals(struct.getCLASS_NAME())) && wsclassList.isEmpty()) {
//				keyMessage = "M_WS_CLASS.WS_CD:" + struct.getWS_CD();
//				setErrorMessage("AA01611", keyMessage);
//			}
//			// Add Anken End   20140307 wang-tt
			//Del Anken End 20140415 hui-x	
			else {
				AA0060010Struct w = (AA0060010Struct)this.getListvalue(0);

				// 工場コードがユーザの工場コードと一致 ?
				if(getsysPLANT_CD().equals(((AA0060010Struct)list.get(0)).getw_PLANT_CD()) == false){
					sysLog.finest_d("read error:mismatch PLANT_CD and USER PLANT_CD", struct.getsUser_ID());
					sysLog.finest_d("M_WS.WS_CD[" + ((AA0060010Struct)this.getListvalue(0)).getWS_CD() + "] "
					+ "M_WS.PLANT_CD[" + ((AA0060010Struct)getListvalue(0)).getw_PLANT_CD() + "]"
					+ "USER PLANT_CD[" + getsysPLANT_CD() + "]",struct.getsUser_ID());

					keyMessage = "M_WS.PLANT_CD:" + ((AA0060010Struct)getListvalue(0)).getw_PLANT_CD();
					setErrorMessage("AA01005", keyMessage);

					// 検索状態を「初期状態」に設定
					setReadStatus(INITIAL);
				}
				// OK
				else{
					struct.copy((AA0060010Struct)this.getListvalue(0));

					// Add Anken Start 20140307 wang-tt
					// 作業区分類01の取得
					if (!classnameList.isEmpty()) {
						AA0060010Struct classnameStruct = (AA0060010Struct) classnameList.get(0);
						struct.setCLASS_NAME(classnameStruct.getCLASS_NAME());
					} else {
						struct.setCLASS_NAME_FLAG("0");
					}
					
					// 作業区分類01コード
					if (!wsclassList.isEmpty()) {
						AA0060010Struct wsclassStruct = (AA0060010Struct) wsclassList.get(0);
						struct.setWS_CLASS_01_CD(wsclassStruct.getWS_CLASS_01_CD());
						struct.seth_WS_CLASS_01_CD(wsclassStruct.getWS_CLASS_01_CD());
						struct.seth_MODIFY_COUNT(wsclassStruct.geth_MODIFY_COUNT());
					}
					// 作業区分類01名称
					List wsclassnameList = entity.mselectWS_CLASS_01_NAME.read(conn, struct);
					if (!wsclassnameList.isEmpty()) {
						AA0060010Struct wsclassnameStruct = (AA0060010Struct) wsclassnameList.get(0);
						struct.setWS_CLASS_01_NAME(wsclassnameStruct.getWS_CLASS_01_NAME());
					}
					// Add Anken End   20140307 wang-tt
					// 検索状態を「読込成功」に設定
					setReadStatus(NORMAL);
				}
			}
		} catch(SQLException e) {
			// エラーメッセージ作成
			setSqlExceptionMsg(e, "");

			// 検索状態を「読込失敗」に設定
			setReadStatus(ERROR);
		}
		//------------------------------------------------------------------
                //}}user_implement_dev:<controlselect>
		logger.exiting("AA0060010Control"+":USER="+struct.getsUser_ID(),"controlselect");

		return;
	}

	/**
	 * 登録ボタン押下時に実行される処理です。
	 *
	 */
	public void controlinsert() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0060");
		logger.entering("AA0060010Control"+":USER="+struct.getsUser_ID(),"controlinsert");
			//{{user_implement_dev:<controlinsert>
		//---------------------------------------------------------------------
		String keyMessage = "";

		try {
			boolean result = false;			// チェック結果格納用

			result = entity.mcheckM_WS.check(conn, struct);
			if(result == true){
				sysLog.finest_d("insert error:WS_CD already exist.", struct.getsUser_ID());

				keyMessage = "M_WS.WS_CD:" + struct.getWS_CD();
				setErrorMessage("ZZ01102", keyMessage);
			}
			
			// 工場コードをログインユーザの工場に設定
			struct.setw_PLANT_CD(getsysPLANT_CD());

			isValidContents();

			// エラーがない場合、登録処理
			if(msgStruct.sizeError() == 0){

				// Add Anken Start 20140307 wang-tt
				// 作業区分類０１がnullではない場合
				if (struct.getCLASS_NAME() != null && !"".equals(struct.getCLASS_NAME())) {
					// 作業区コードがすでに[作業区分類]に存在した場合
					List wscdList = entity.mselectM_WS_CLASS.read(conn, struct);
					if (!wscdList.isEmpty()) {

						keyMessage = "M_WS.WS_CD:" + struct.getWS_CD();
						setErrorMessage("AA01610", keyMessage);
						return;
					} else {
						
						if(struct.getWS_CLASS_01_CD() == null || "".equals(struct.getWS_CLASS_01_CD())){
							struct.setWS_CLASS_01_NAME(null);
						}
						// [作業区分類]の登録
						int nMWSCLASS = entity.minsertM_WS_CLASS.create(conn, struct);
					}

				}
				// Add Anken End   20140307 wang-tt

				// 登録処理
				int nRet = entity.minsertM_WS.create(conn, struct);
				
				// 読み込み処理
				controlselect();

			}
		} catch(SQLException e) {
			// エラーメッセージ作成
			setSqlExceptionMsg(e, "");
		}
		//------------------------------------------------------------------
                //}}user_implement_dev:<controlinsert>
		logger.exiting("AA0060010Control"+":USER="+struct.getsUser_ID(),"controlinsert");

		return;
	}

	/**
	 * 更新ボタン押下時に実行される処理です。
	 *
	 */
	public void controlupdate() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0060");
		logger.entering("AA0060010Control"+":USER="+struct.getsUser_ID(),"controlupdate");
			//{{user_implement_dev:<controlupdate>
		//----------------------------------------------------------------------
		String keyMessage = "";

		try {
			conn.beginTransWeb();  // ConnectionのAutoCommitフラグを制御します

			boolean result = false;			// チェック結果格納用

			// select for updateで読込
			List w = entity.mreadM_WS4Update.read(conn, struct);

			// レコードは存在する ?
			if(w.size() <= 0){
				sysLog.finest_d("update error:M_WS.WS_CD[" + struct.getWS_CD() + "] already deleted.", struct.getsUser_ID());

				keyMessage = "M_WS.WS_CD:" + struct.getWS_CD();
				setErrorMessage("ZZ06001", keyMessage);
			}
			else {
				// 更新カウントOK?
				if(struct.getMODIFY_COUNT().equals(((AA0060010Struct)w.get(0)).getMODIFY_COUNT()) == false){
					sysLog.finest_d("update error:M_WS.WS_CD[" + struct.getWS_CD() + "] already updated.",struct.getsUser_ID());

					keyMessage = "M_WS.WS_CD:" + struct.getWS_CD();
					setErrorMessage("ZZ01105", keyMessage);
				}
				else{
					// 設定値の確認
					isValidContents();

					if(msgStruct.sizeError() == 0){
						// 更新処理
						int nRet = entity.mupdateM_WS.update(conn, struct);
						
						// Add Anken Start 20140307 wang-tt
						// 作業区分類０１がnullではない場合
						if (struct.getCLASS_NAME() != null && !"".equals(struct.getCLASS_NAME())) {
							
							List tempList = entity.mselectM_WS_CLASS.read(conn, struct);
							if (!tempList.isEmpty()) {
								
								AA0060010Struct tempStruct = (AA0060010Struct)tempList.get(0);
								if (!struct.geth_MODIFY_COUNT().equals(tempStruct.geth_MODIFY_COUNT())) {
									keyMessage = "M_WS.WS_CD:" + struct.getWS_CD();
									setErrorMessage("ZZ01105", keyMessage);
									return;
								}
								String hWSCLASS01CD = struct.geth_WS_CLASS_01_CD();
								String WSCLASS01CD =struct.getWS_CLASS_01_CD();
								// 「作業区分類01コード」が変更された場合
								if (!((hWSCLASS01CD == null || "".equals(hWSCLASS01CD)) && (WSCLASS01CD == null || "".equals(WSCLASS01CD)))) {
									if (!WSCLASS01CD.equals(hWSCLASS01CD)) {
									
										if (struct.getWS_CLASS_01_CD() == null || "".equals(struct.getWS_CLASS_01_CD())) {
											struct.setWS_CLASS_01_NAME(null);
										}
										// [作業区分類]の更新
										int nMWSCLASS = entity.mupdateM_WS_CLASS.update(conn, struct);
									} 
								}
							}
							//Add Anken Start 20140415 hui-x
							//[作業区分類]が存在しない場合
							else {
								
								if(struct.getWS_CLASS_01_CD() == null || "".equals(struct.getWS_CLASS_01_CD())){
									struct.setWS_CLASS_01_NAME(null);
								}
								// [作業区分類]の登録
								int nMWSCLASS = entity.minsertM_WS_CLASS.create(conn, struct);
							}
							//Add Anken End 20140415 hui-x
						}
						// Add Anken End   20140307 wang-tt
						
						// 読み込み処理
						controlselect();
						
					}
				}
			}
		} catch(SQLException e) {
			conn.rollback();

			// エラーメッセージ作成
			setSqlExceptionMsg(e, "");
		}
		finally{
			if(msgStruct.sizeError() == 0) conn.commit();
			else conn.rollback();
		}
		//------------------------------------------------------------------
                //}}user_implement_dev:<controlupdate>
		logger.exiting("AA0060010Control"+":USER="+struct.getsUser_ID(),"controlupdate");

		return;
	}

	/**
	 * 削除ボタン押下時に実行される処理です。
	 *
	 */
	public void controldelete() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0060");
		logger.entering("AA0060010Control"+":USER="+struct.getsUser_ID(),"controldelete");
			//{{user_implement_dev:<controldelete>
		//---------------------------------------------------------------------
		String keyMessage = "";
		List key = new ArrayList();

		try {
			conn.beginTransWeb();
			
			// Add Anken Start 20140312 wang-tt
			if (struct.getCLASS_NAME() != null && !"".equals(struct.getCLASS_NAME())) {
				// 「作業区コード」 が[作業区分類]に存在しない場合
				List wscdList = entity.mselectM_WS_CLASS.read(conn, struct);
				if (wscdList.isEmpty()) {
					
					keyMessage = "M_WS_CLASS.WS_CD:" + struct.getWS_CD();
					setWarnMessage("AA01612");
				}
			}
			// Add Anken End   20140312 wang-tt
			
			// select for updateで読込
			List w = entity.mreadM_WS4Update.read(conn, struct);

			// レコードは存在する ?
			if(w.size() <= 0){
				sysLog.finest_d("delete error:M_WS.WS_CD[" + struct.getWS_CD() + "] already deleted.", struct.getsUser_ID());

				keyMessage = "M_WS.WS_CD:" + struct.getWS_CD();
				setErrorMessage("ZZ06001", keyMessage);
			}
			else {
				// 更新カウントOK?
				if(struct.getMODIFY_COUNT().equals(((AA0060010Struct)w.get(0)).getMODIFY_COUNT()) == false){
					sysLog.finest_d("delete error:M_WS.WS_CD[" + struct.getWS_CD() + "] already updated.",struct.getsUser_ID());

					keyMessage = "M_WS.WS_CD:" + struct.getWS_CD();
					setErrorMessage("ZZ01105", keyMessage);
				}
				else{
					// 工場コードがユーザの工場コードと一致 ?
					if(getsysPLANT_CD().equals(((AA0060010Struct)w.get(0)).getw_PLANT_CD()) == false){
						sysLog.finest_d("delete error:mismatch M_WS.PLANT_CD and USER PALNT_CD", struct.getsUser_ID());
						sysLog.finest_d("M_WS.WS_CD[" + ((AA0060010Struct)w.get(0)).getWS_CD() + "] "
							+ "M_WS.PLANT_CD[" + ((AA0060010Struct)w.get(0)).getw_PLANT_CD() + "]"
							+ "USER PLANT_CD[" + getsysPLANT_CD() + "]",struct.getsUser_ID());

						key.add("M_WS.WS_CD:" + ((AA0060010Struct)w.get(0)).getWS_CD());
						key.add("M_WS.PLANT_CD:" + ((AA0060010Struct)w.get(0)).getw_PLANT_CD());
						setErrorMessage("AA01005", key);
					}
					else{
						boolean result = false;			// チェック結果格納用

						// [作業区]マスタ存在チェック
						result = entity.mcheckSUB_WS_CD.check(conn, struct);
						if(result == true){
							sysLog.finest_d("delete error:SUB_WS_CD is used in M_WS.", struct.getsUser_ID());
							keyMessage = "M_WS.SUB_WS_CD:" + struct.getSUB_WS_CD();
							setErrorMessage("AA00082", keyMessage);
						}

						// [作業系列]マスタ存在チェック
						result = entity.mcheckM_PROC_GRP.check(conn, struct);
						if(result == true){
							sysLog.finest_d("delete error:WS_CD is used in M_PROC_GRP.", struct.getsUser_ID());
							keyMessage = "M_PROC_GRP.WS_CD:" + struct.getWS_CD();
							setErrorMessage("AA00083", keyMessage);
						}

						// [品目別仕掛]存在チェック
						result = entity.mcheck_T_WORK_IN_PROC_BY_ITEM.check(conn, struct);
						if(result == true){
							sysLog.finest_d("delete error:WS_CD is used in T_WORK_IN_PROC_BY_ITEM.", struct.getsUser_ID());
							keyMessage = "T_WORK_IN_PROC_BY_ITEM.WS_CD:" + struct.getWS_CD();
							setErrorMessage("AA00084", keyMessage);
						}

						// [作業系列別仕掛]存在チェック
						result = entity.mcheck_T_WORK_IN_PROC_BY_PROC.check(conn, struct);
						if(result == true){
							sysLog.finest_d("delete error:WS_CD is used in T_WORK_IN_PROC_BY_PROC.", struct.getsUser_ID());
							keyMessage = "T_WORK_IN_PROC_BY_PROC.WS_CD:" + struct.getWS_CD();
							setErrorMessage("AA00085", keyMessage);
						}

						// [作業実績]存在チェック
						result = entity.mcheck_T_OPR_RSLT.check(conn, struct);
						if(result == true){
							sysLog.finest_d("delete error:WS_CD is used in T_OPR_RSLT.WS_CD.", struct.getsUser_ID());
							keyMessage = "T_OPR_RSLT.WS_CD:" + struct.getWS_CD();
							setErrorMessage("AA00086", keyMessage);
						}

						// [出来高実績]存在チェック
						result = entity.mcheck_T_OUTPUT_RSLT.check(conn, struct);
						if(result == true){
							sysLog.finest_d("delete error:WS_CD is used in T_OUTPUT_RSLT.", struct.getsUser_ID());
							keyMessage = "T_OUTPUT_RSLT.WS_CD:" + struct.getWS_CD();
							setErrorMessage("AA00088", keyMessage);
						}

						// エラーがない場合、削除処理
						if(msgStruct.sizeError() == 0){

							// Add Anken Start 20140312 wang-tt
							if (msgStruct.sizeWarn() != 0) {
							// Add Anken Start 20140312 wang-tt

								// 削除処理
								int nRet = entity.mdeleteM_WS.delete(conn, struct);
								
							// Add Anken Start 20140312 wang-tt
							} else {

								// [作業区]の削除
								int nRet = entity.mdeleteM_WS.delete(conn, struct);
								// [作業区分類]の削除
								int nMWSCLASS = entity.mdeleteM_WS_CLASS.delete(conn, struct);
							}
							// Add Anken End   20140312 wang-tt
							
							// クリア処理
							controlclear();
						}
					}
				}
			}
		} catch(SQLException e) {
			conn.rollback();

			// エラーメッセージ作成
			setSqlExceptionMsg(e, "");
		}
		finally{
			if(msgStruct.sizeError() == 0){
				conn.commit();
			}else{
				conn.rollback();
			}
		}
		//------------------------------------------------------------------
                //}}user_implement_dev:<controldelete>
		logger.exiting("AA0060010Control"+":USER="+struct.getsUser_ID(),"controldelete");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlclear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0060");
		logger.entering("AA0060010Control"+":USER="+struct.getsUser_ID(),"controlclear");
			//{{user_implement_dev:<controlclear>
		//------------------------------------------------------------------
		if(list != null){
			list.clear();
		}
		else{
			list = new ArrayList(0);
		}
		this.struct.initialize();
		
		// Add Anken Start 20140314 wang-tt
		controlRELOAD();
		// Add Anken End   20140314 wang-tt

		// 検索状態を「初期状態」に設定
		setReadStatus(INITIAL);
		//------------------------------------------------------------------
                //}}user_implement_dev:<controlclear>
		logger.exiting("AA0060010Control"+":USER="+struct.getsUser_ID(),"controlclear");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0060");
		logger.entering("AA0060010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
	    //------------------------------------------------------------------
		// 検索状態を「初期状態」に設定
		setReadStatus(INITIAL);
		//------------------------------------------------------------------
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AA0060010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0060");
		logger.entering("AA0060010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
	    //------------------------------------------------------------------
		// Add Anken Start 20140313 wang-tt
		try{
			List tempList = entity.mselectCLASS_NAME.read(conn, struct);
			if(!tempList.isEmpty()){
				AA0060010Struct tempStruct = (AA0060010Struct) tempList.get(0);
				struct.setCLASS_NAME(tempStruct.getCLASS_NAME());
			} else {
				struct.setCLASS_NAME_FLAG("0");
			}
		}
		catch (SQLException e) {
			setSqlExceptionMsg(e, "");
		}
		// Add Anken End   20140313 wang-tt		
        setReadStatus(INITIAL);
		//------------------------------------------------------------------
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AA0060010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * イベントハンドラの前処理です。
	 *
	 * @param buttun ボタン名
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0060");
		logger.entering("AA0060010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
		logger.exiting("AA0060010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
		} catch(AlarmMessageException ame) {
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
//			throw new FoundationException("AA0060010Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AA0060010-E999","CSVの出力処理"));
			throw new FoundationException("AA0060010Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AA0060010-E999","システム日付の取得処理"));
				throw new FoundationException("AA0060010Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AA0060010-E999","コントロールのイベント処理"));
			throw new FoundationException("AA0060010Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected AA0060010Entity entity;
	protected AA0060010Struct struct;
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

		entity = new AA0060010Entity();
		struct = new AA0060010Struct();

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
	 * AA0060010クラスの標準コンストラクタ
	 */
	public AA0060010Control() throws BusinessProcessException, FoundationException
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
				AA0060010Struct key = (AA0060010Struct)keyList.get(j);
				// メッセージキーを作成する
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("CLASS_NAME_FLAG") && key.getCLASS_NAME_FLAG() != null) {
					msgKey.setKeyValue("CLASS_NAME_FLAG", key.getCLASS_NAME_FLAG());
				}
				if(msgKeyType.containsKeyColumn("h_WS_CLASS_01_CD") && key.geth_WS_CLASS_01_CD() != null) {
					msgKey.setKeyValue("h_WS_CLASS_01_CD", key.geth_WS_CLASS_01_CD());
				}
				if(msgKeyType.containsKeyColumn("w_PLANT_CD") && key.getw_PLANT_CD() != null) {
					msgKey.setKeyValue("w_PLANT_CD", key.getw_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("WS_CD") && key.getWS_CD() != null) {
					msgKey.setKeyValue("WS_CD", key.getWS_CD());
				}
				if(msgKeyType.containsKeyColumn("h_WS_CD") && key.geth_WS_CD() != null) {
					msgKey.setKeyValue("h_WS_CD", key.geth_WS_CD());
				}
				if(msgKeyType.containsKeyColumn("WS_NAME") && key.getWS_NAME() != null) {
					msgKey.setKeyValue("WS_NAME", key.getWS_NAME());
				}
				if(msgKeyType.containsKeyColumn("WS_TEL") && key.getWS_TEL() != null) {
					msgKey.setKeyValue("WS_TEL", key.getWS_TEL());
				}
				if(msgKeyType.containsKeyColumn("WS_PERSON") && key.getWS_PERSON() != null) {
					msgKey.setKeyValue("WS_PERSON", key.getWS_PERSON());
				}
				if(msgKeyType.containsKeyColumn("WH_CD") && key.getWH_CD() != null) {
					msgKey.setKeyValue("WH_CD", key.getWH_CD());
				}
				if(msgKeyType.containsKeyColumn("SUB_WS_CD") && key.getSUB_WS_CD() != null) {
					msgKey.setKeyValue("SUB_WS_CD", key.getSUB_WS_CD());
				}
				if(msgKeyType.containsKeyColumn("MODIFY_COUNT") && key.getMODIFY_COUNT() != null) {
					msgKey.setKeyValue("MODIFY_COUNT", key.getMODIFY_COUNT().toString());
				}
				if(msgKeyType.containsKeyColumn("SUB_WS_NAME") && key.getSUB_WS_NAME() != null) {
					msgKey.setKeyValue("SUB_WS_NAME", key.getSUB_WS_NAME());
				}
				if(msgKeyType.containsKeyColumn("WH_NAME") && key.getWH_NAME() != null) {
					msgKey.setKeyValue("WH_NAME", key.getWH_NAME());
				}
				if(msgKeyType.containsKeyColumn("WH_TYP") && key.getWH_TYP() != null) {
					msgKey.setKeyValue("WH_TYP", key.getWH_TYP());
				}
				if(msgKeyType.containsKeyColumn("CLASS_NAME") && key.getCLASS_NAME() != null) {
					msgKey.setKeyValue("CLASS_NAME", key.getCLASS_NAME());
				}
				if(msgKeyType.containsKeyColumn("WS_CLASS_01_CD") && key.getWS_CLASS_01_CD() != null) {
					msgKey.setKeyValue("WS_CLASS_01_CD", key.getWS_CLASS_01_CD());
				}
				if(msgKeyType.containsKeyColumn("h_MODIFY_COUNT") && key.geth_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("h_MODIFY_COUNT", key.geth_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("WS_CLASS_01_NAME") && key.getWS_CLASS_01_NAME() != null) {
					msgKey.setKeyValue("WS_CLASS_01_NAME", key.getWS_CLASS_01_NAME());
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
					AA0060010Struct key = new AA0060010Struct();
					if(msgKeyType.containsKeyColumn("CLASS_NAME_FLAG")) {
						key.setCLASS_NAME_FLAG(msgKey.getKeyValue("CLASS_NAME_FLAG"));
					}
					if(msgKeyType.containsKeyColumn("h_WS_CLASS_01_CD")) {
						key.seth_WS_CLASS_01_CD(msgKey.getKeyValue("h_WS_CLASS_01_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_PLANT_CD")) {
						key.setw_PLANT_CD(msgKey.getKeyValue("w_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("WS_CD")) {
						key.setWS_CD(msgKey.getKeyValue("WS_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_WS_CD")) {
						key.seth_WS_CD(msgKey.getKeyValue("h_WS_CD"));
					}
					if(msgKeyType.containsKeyColumn("WS_NAME")) {
						key.setWS_NAME(msgKey.getKeyValue("WS_NAME"));
					}
					if(msgKeyType.containsKeyColumn("WS_TEL")) {
						key.setWS_TEL(msgKey.getKeyValue("WS_TEL"));
					}
					if(msgKeyType.containsKeyColumn("WS_PERSON")) {
						key.setWS_PERSON(msgKey.getKeyValue("WS_PERSON"));
					}
					if(msgKeyType.containsKeyColumn("WH_CD")) {
						key.setWH_CD(msgKey.getKeyValue("WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("SUB_WS_CD")) {
						key.setSUB_WS_CD(msgKey.getKeyValue("SUB_WS_CD"));
					}
					if(msgKeyType.containsKeyColumn("MODIFY_COUNT")) {
						key.setMODIFY_COUNT(new Integer(msgKey.getKeyValue("MODIFY_COUNT")));
					}
					if(msgKeyType.containsKeyColumn("SUB_WS_NAME")) {
						key.setSUB_WS_NAME(msgKey.getKeyValue("SUB_WS_NAME"));
					}
					if(msgKeyType.containsKeyColumn("WH_NAME")) {
						key.setWH_NAME(msgKey.getKeyValue("WH_NAME"));
					}
					if(msgKeyType.containsKeyColumn("WH_TYP")) {
						key.setWH_TYP(msgKey.getKeyValue("WH_TYP"));
					}
					if(msgKeyType.containsKeyColumn("CLASS_NAME")) {
						key.setCLASS_NAME(msgKey.getKeyValue("CLASS_NAME"));
					}
					if(msgKeyType.containsKeyColumn("WS_CLASS_01_CD")) {
						key.setWS_CLASS_01_CD(msgKey.getKeyValue("WS_CLASS_01_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_MODIFY_COUNT")) {
						key.seth_MODIFY_COUNT(msgKey.getKeyValue("h_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("WS_CLASS_01_NAME")) {
						key.setWS_CLASS_01_NAME(msgKey.getKeyValue("WS_CLASS_01_NAME"));
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
