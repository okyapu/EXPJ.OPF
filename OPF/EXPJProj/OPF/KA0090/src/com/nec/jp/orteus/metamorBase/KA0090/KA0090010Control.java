/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KA0090/src/com/nec/jp/orteus/metamorBase/KA0090/KA0090010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.KA0090;

import com.nec.jp.orteus.metamorBase.KA0090.*;
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
	// TODO: ここにimportパッケージを記述してください
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class KA0090010Control
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
	protected List list;											// 一覧部分の結果リストを画面に表示するためのリストインスタンス

	// デフォルトアクセサメソッド
	public List getList() { return this.list; }						// リストを返します。
	public void setList(List listname) { this.list = listname; }	// リストをセットします。
	public int getListsize() {										// リスト型のサイズを返します。
		int nret = 0;
		if( this.list != null ) {nret = this.list.size();}
		return nret;
	}
//	public Object getListvalue(int x) { return this.list.get(x); }	// リストの値を返します。
	public KA0090010Struct getListvalue(int x) { return (KA0090010Struct)(this.list.get(x)); }	// リストの値を返します。
	public KA0090010Struct getStruct() { return this.struct; }	// Structを返します。
	public KA0090010Struct createStruct() { return new KA0090010Struct(); }	// 新しいStructを作って返します。
	public void setStruct(Object structname) { this.struct.setStruct((KA0090010Struct)structname); }	// Structをセットします。
	public void initializeStruct() { this.struct.initialize(); }	// Structの値を初期化します。

	// CSV出力用リスト
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }

	// TODO: ユーザ定義のコードを記述してください

//------------------------------------------------------------------------------
// add 標準G ↓

        /**
         * 画面遷移キー(部門コード)
         */
	private String _orgCd;

        /**
         * 画面遷移キー(部門コード)設定
         * @param cd 部門コード
         */
	protected void setOrgCd(String cd){ _orgCd = cd; };

        /**
         * 画面遷移キー(部門コード)取得
         * @return 部門コード
         */
	protected String getOrgCd(){ return _orgCd; };

// add 標準G ↑
//------------------------------------------------------------------------------

	/**
	 * 業務ロジックのインフォメーションメッセージ設定処理を切り出して関数化
	 * @param code メッセージコード
	 */
	private void setInformationMessage(String code) {
		ExpjMessage emsg = new ExpjMessage(code);
		msgStruct.addInfo(emsg);
	}
	/**
	 * 業務ロジックのワーニングメッセージ設定処理を切り出して関数化
	 * @param code メッセージコード
	 */
	private void setWarningMessage(String code) {
		ExpjMessage emsg = new ExpjMessage(code);
		msgStruct.addWarn(emsg);
		sysLog.info(emsg, sysUSER_CD);
	}
	/**
	 * 業務ロジックのワーニングメッセージ設定処理を切り出して関数化
	 * @param code メッセージコード
	 * @param value1 置換文字列１
	 */
	private void setWarningMessage(String code, String value1) {
		ExpjMessage emsg = new ExpjMessage(code, value1);
		msgStruct.addWarn(emsg);
		sysLog.info(emsg, sysUSER_CD);
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
	 * 業務ロジックのエラーメッセージ設定処理を切り出して関数化
	 * @param code メッセージコード
	 * @param value1 置換文字列１
	 */
	private void setErrorMessage(String code, String value1) {
		ExpjMessage emsg = new ExpjMessage(code, value1);
		msgStruct.addError(emsg);
		sysLog.warning(emsg, sysUSER_CD);
	}

//------------------------------------------------------------------------------

	/** モード */
	private String _mode = null;

	/** モードの取得
	 * @return モード
	*/
	public String getMode(){ return _mode; }

	/** モードの設定
	 * @param mode モード
	*/
	public void setMode(String mode){ _mode = mode; }

	/** 画面モード 検索処理 */
	private final static String _SELECT = "select";

	/** 画面モード 検索/閉じる以外の処理 */
	private final static String _NORMAL = "normal";

	/** 画面モード 閉じる処理 */
	private final static String _CLOSE = "close";

//------------------------------------------------------------------------------

	/** メッセージ定義ファイル */
//	MessageConfig _msgConfig = null;

	/** メッセージ */
	//MessageStruct _msgStruct = msgStruct;

	/** システムログ */
	SystemLog _sysLog = sysLog;

//-----------------------------------------------------------------------------
	/** 画面共通定義取得クラス */
	ScreenParam _scParam = sp;

	//------------------------------------------------------------------------
	/**
	 * DB登録/更新時共通 設定内容チェック
	 *
	 * @return  true:OK / false:NG
	 */
	//------------------------------------------------------------------------
	// 2003/08/23 K.Shiraki
	//            登録/更新処理から切り出し
	//------------------------------------------------------------------------
	private boolean isValidContents()throws FoundationException, SQLException
	{
		boolean result = true;

		// 値校正処理
//		struct.revise();

		return result;
	}
	//------------------------------------------------------------------------
	/**
	 * 更新／削除可能かチェックする<BR>
	 * １．検索結果が存在すること（検索時と同じ条件で読み込み）
	 * ２．更新カウンタが検索時と同一であること
	 *
	 * @param KA0090010Struct Struct
	 * @return boolean true:更新削除可能 false:更新削除不可
	 */
	private boolean isUpdatable(KA0090010Struct chk) throws FoundationException,SQLException
	{


		List listCheck = null;

		//会社コードを読込
		listCheck = entity.mread_COMPANY_CD.read(conn, struct);
		chk.setSYS_COMPANY_CD(((KA0090010Struct)listCheck.get(0)).getSYS_COMPANY_CD());

		//読み込み
		listCheck = entity.mselect.read(conn,chk);

		if(listCheck == null || listCheck.size() != 1){
			//読み込み失敗（処理中にステータスが変化したか、削除された場合）

			//エラー処理
			setErrorMessage("ZZ06001");
//			setErrorMessage("ZZ01006","M_ORG.COMPANY_CD:"+chk.getSYS_COMPANY_CD());
			setErrorMessage("ZZ01006","M_ORG.ORG_CD:"+chk.getORG_CD());
			return false;
		}
		KA0090010Struct rst = (KA0090010Struct)listCheck.get(0);
		//更新カウンタチェック
		// 退避させていたカウンタと、ここで読み込んだ現在値を比較する。


		double bef_mod = Double.parseDouble((String)struct.geth_MODIFY_COUNT());
		double aft_mod = Double.parseDouble(rst.geth_MODIFY_COUNT());
		if(bef_mod != aft_mod){
			//更新カウンタが変化した



			//エラー処理
			setErrorMessage("AC50802");
//			setErrorMessage("ZZ01006","M_ORG.COMPANY_CD:"+chk.getSYS_COMPANY_CD());
			setErrorMessage("ZZ01006","M_ORG.ORG_CD:"+chk.getORG_CD());
			return false;
		}
		return true;
	}

//--------------------------------------------------------------------------------------------

        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * 読込ボタン押下時に実行される処理です。
	 *
	 */
	public void controlselect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KA0090");
		logger.entering("KA0090010Control"+":USER="+struct.getsUser_ID(),"controlselect");
			//{{user_implement_dev:<controlselect>
			// TODO: ユーザ定義のコードを記述してください
		try {
			boolean ok_flg = true;
			boolean result = false;		// チェック結果格納

			//画面モード取得
			String strKMode="";
			strKMode = (String)struct.getk_MODE();

			if("INSERT".equals(strKMode)){
				//登録の時チェック
				//会社コードを読込
				List listCheck = entity.mread_COMPANY_CD.read(conn, struct);
				struct.setSYS_COMPANY_CD(((KA0090010Struct)listCheck.get(0)).getSYS_COMPANY_CD());

				// 部門情報 重複チェック
				result = entity.mselect.check(conn, struct);
				if (result == true) {
					ok_flg =false;
					setErrorMessage("ZZ01102");
//					setErrorMessage("ZZ01006","M_ORG.COMPANY_CD:"+struct.getSYS_COMPANY_CD());
					setErrorMessage("ZZ01006","M_ORG.ORG_CD:"+struct.getORG_CD());
				}
			}else if("UPDATE".equals(strKMode)){
				//更新の時チェック

				// 更新確認
				KA0090010Struct st = (KA0090010Struct)list.get(0);
				if(isUpdatable(st) == false){
					//更新できない状態
					//エラー処理

					ok_flg =false;
				}
			}else if("DELETE".equals(strKMode)){
				//削除の時チェック
				//会社コードを読込
				List listCheck = entity.mread_COMPANY_CD.read(conn, struct);
				struct.setSYS_COMPANY_CD(((KA0090010Struct)listCheck.get(0)).getSYS_COMPANY_CD());

				// 部門情報の存在確認
				List w = entity.mselect.read(conn, struct);
				if (w.size() == 0) {
					ok_flg =false;
					setErrorMessage("ZZ01105");
//					setErrorMessage("ZZ01006","M_ORG.COMPANY_CD:"+struct.getSYS_COMPANY_CD());
					setErrorMessage("ZZ01006","M_ORG.ORG_CD:"+struct.getORG_CD());
				}
			}else{
				//会社コードを読込
				List listCheck = entity.mread_COMPANY_CD.read(conn, struct);
				struct.setSYS_COMPANY_CD(((KA0090010Struct)listCheck.get(0)).getSYS_COMPANY_CD());

				list = entity.mselect.read(conn, struct);

				if (list.size() != 0) {
					struct.copy((KA0090010Struct)list.get(0));
					_mode = _SELECT;
				} else {
					ok_flg = false;
					setErrorMessage("ZZ06001");
//					setErrorMessage("ZZ01006","M_ORG.COMPANY_CD:"+struct.getSYS_COMPANY_CD());
					setErrorMessage("ZZ01006","M_ORG.ORG_CD:"+struct.getORG_CD());
				}
			}

			// 読込ステータス設定
			setReadStatus(NORMAL);
			struct.seth_ORG_CD(struct.getORG_CD());

			if(!"RESELECT".equals(strKMode)){
				//警告以外のエラーが何もない場合OKにする
				if(ok_flg == true){
					setReadStatus(NORMAL);
				}else{

					setReadStatus(NOT_FOUND);
				}
			}

		} catch(SQLException e) {
			// 読込ステータス設定
			setReadStatus(ERROR);
			throw new ExpjException(e);
		}
                //}}user_implement_dev:<controlselect>
		logger.exiting("KA0090010Control"+":USER="+struct.getsUser_ID(),"controlselect");

		return;
	}

	/**
	 * 登録ボタン押下時に実行される処理です。
	 *
	 */
	public void controlinsert() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KA0090");
		logger.entering("KA0090010Control"+":USER="+struct.getsUser_ID(),"controlinsert");
			//{{user_implement_dev:<controlinsert>
			// TODO: ユーザ定義のコードを記述してください
		try {
			boolean result = false;		// チェック結果格納

			//会社コードを読込
			List listCheck = entity.mread_COMPANY_CD.read(conn, struct);
			struct.setSYS_COMPANY_CD(((KA0090010Struct)listCheck.get(0)).getSYS_COMPANY_CD());

			// 部門情報 重複チェック
			result = entity.mselect.check(conn, struct);
			if (result == true) {
				setErrorMessage("ZZ01102");
//				setErrorMessage("ZZ01006","M_ORG.COMPANY_CD:"+struct.getSYS_COMPANY_CD());
				setErrorMessage("ZZ01006","M_ORG.ORG_CD:"+struct.getORG_CD());
			}

			// エラーが発生していない場合、登録処理実施
			if(msgStruct.sizeError() <= 0){

				//会社コードを読込
				list = entity.mread_COMPANY_CD.read(conn, struct);
				struct.setSYS_COMPANY_CD(((KA0090010Struct)list.get(0)).getSYS_COMPANY_CD());
				//登録処理
				entity.minsertM_ORG.create(conn, struct);

				conn.commit();


				// 検索
				struct.setk_MODE("RESELECT");

				controlselect();

			}

		} catch(SQLException e) {
			// エラーメッセージ作成
			throw new ExpjException(e);
		} finally {
			if (conn != null) {
				conn.rollback();
			}
		}
                //}}user_implement_dev:<controlinsert>
		logger.exiting("KA0090010Control"+":USER="+struct.getsUser_ID(),"controlinsert");

		return;
	}

	/**
	 * 更新ボタン押下時に実行される処理です。
	 *
	 */
	public void controlupdate() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KA0090");
		logger.entering("KA0090010Control"+":USER="+struct.getsUser_ID(),"controlupdate");
			//{{user_implement_dev:<controlupdate>
			// TODO: ユーザ定義のコードを記述してください
		try {
			conn.beginTransWeb();		// トランザクション開始

			//更新の時チェック

			// 更新確認
			KA0090010Struct st = (KA0090010Struct)list.get(0);
			if(isUpdatable(st) == false){
				//更新できない状態
				//エラー処理

			}

			// エラーが発生していない場合、更新処理実施
			if(msgStruct.sizeError() <= 0)
			{
				//会社コードを読込
				List listCheck = entity.mread_COMPANY_CD.read(conn, struct);
				struct.setSYS_COMPANY_CD(((KA0090010Struct)listCheck.get(0)).getSYS_COMPANY_CD());

				entity.mupdateM_ORG.update(conn, struct);
				conn.commit();
				// 最新の情報を読込

				struct.setk_MODE("RESELECT");

				// 検索
				controlselect();
			}


		} catch(SQLException e) {
			throw new ExpjException(e);
		} finally {
			try {
				conn.rollback();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
                //}}user_implement_dev:<controlupdate>
		logger.exiting("KA0090010Control"+":USER="+struct.getsUser_ID(),"controlupdate");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlclear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KA0090");
		logger.entering("KA0090010Control"+":USER="+struct.getsUser_ID(),"controlclear");
			//{{user_implement_dev:<controlclear>
			// TODO: ユーザ定義のコードを記述してください
		try{
			struct.initialize();
			// モード設定
			_mode = _NORMAL;

			// 読込ステータス設定
			setReadStatus(INITIAL);

		}catch(Exception e){
			throw new ExpjException(e);
		}
                //}}user_implement_dev:<controlclear>
		logger.exiting("KA0090010Control"+":USER="+struct.getsUser_ID(),"controlclear");

		return;
	}

	/**
	 * 削除ボタン押下時に実行される処理です。
	 *
	 */
	public void controldelete() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KA0090");
		logger.entering("KA0090010Control"+":USER="+struct.getsUser_ID(),"controldelete");
			//{{user_implement_dev:<controldelete>
			// TODO: ユーザ定義のコードを記述してください
		try {
			//MODIFYCOUNTのチェック
			if(isUpdatable(struct) == false){
				//削除できない状態
				//エラー処理

			}

			//会社コードを読込
			List listCheck = entity.mread_COMPANY_CD.read(conn, struct);
			struct.setSYS_COMPANY_CD(((KA0090010Struct)listCheck.get(0)).getSYS_COMPANY_CD());

			// 部門情報の存在確認
			List w = entity.mselect.read(conn, struct);
			if (w.size() == 0) {
				setErrorMessage("ZZ01105");
				setErrorMessage("ZZ01006","M_ORG.COMPANY_CD:"+struct.getSYS_COMPANY_CD());
				setErrorMessage("ZZ01006","M_ORG.ORG_CD:"+struct.getORG_CD());
			}
			
			// 部門情報整合性チェックフラグ
			boolean b = false;
			// 整合性チェック -----------№1
			// 得意先マスタに部門情報の存在確認
			b = entity.mcheckM_CUST.check(conn, struct);
			if (b) {
				setErrorMessage("KA00118");
				setErrorMessage("ZZ01006","M_CUST.COMPANY_CD:"+struct.getSYS_COMPANY_CD());
				setErrorMessage("ZZ01006","M_CUST.OWN_ORG_CD:"+struct.getORG_CD());
			}
			// 整合性チェック -----------№2
			// 得意先支店マスタに部門情報の存在確認
			b = entity.mcheckM_CUST_BRANCH.check(conn, struct);
			if (b) {
				setErrorMessage("KA00119");
				setErrorMessage("ZZ01006","M_CUST_BRANCH.COMPANY_CD:"+struct.getSYS_COMPANY_CD());
				setErrorMessage("ZZ01006","M_CUST_BRANCH.OWN_ORG_CD:"+struct.getORG_CD());
			}
			// 整合性チェック -----------№3
			// 請求条件に部門情報の存在確認
			b = entity.mcheckM_CUST_STL_CTRL.check(conn, struct);
			if (b) {
				setErrorMessage("KA00120");
				setErrorMessage("ZZ01006","M_CUST_STL_CTRL.COMPANY_CD:"+struct.getSYS_COMPANY_CD());
				setErrorMessage("ZZ01006","M_CUST_STL_CTRL.CLAIM_ORG_CD:"+struct.getORG_CD());
			}
			// 整合性チェック -----------№4
			// 売掛金トランヘッダに部門情報の存在確認
			b = entity.mcheckT_AR_LEDGER_H_TRN.check(conn, struct);
			if (b) {
				setErrorMessage("KA00121");
				setErrorMessage("ZZ01006","T_AR_LEDGER_H_TRN.COMPANY_CD:"+struct.getSYS_COMPANY_CD());
				setErrorMessage("ZZ01006","T_AR_LEDGER_H_TRN.SALES_ORG_CD:"+struct.getORG_CD());
			}
			// 整合性チェック -----------№5
			// 売掛金元帳ヘッダに部門情報の存在確認
			b = entity.mcheckT_AR_LEDGER_H.check(conn, struct);
			if (b) {
				setErrorMessage("KA00122");
				setErrorMessage("ZZ01006","T_AR_LEDGER_H.COMPANY_CD:"+struct.getSYS_COMPANY_CD());
				setErrorMessage("ZZ01006","T_AR_LEDGER_H.SALES_ORG_CD:"+struct.getORG_CD());
			}
            // 整合性チェック -----------№6
			// ユーザマスタに部門情報の存在確認
			b = entity.mcheckM_ORG.check(conn, struct);
			if (b) {
				setErrorMessage("BZ00198");
				setErrorMessage("ZZ01006","M_ORG.COMPANY_CD:"+struct.getSYS_COMPANY_CD());
				setErrorMessage("ZZ01006","M_ORG.ORG_CD:"+struct.getORG_CD());
			}
			
			// エラーが発生していない場合、削除処理実施
			if(msgStruct.sizeError() <= 0){
				//会社コードを読込
				listCheck = entity.mread_COMPANY_CD.read(conn, struct);
				struct.setSYS_COMPANY_CD(((KA0090010Struct)listCheck.get(0)).getSYS_COMPANY_CD());

				entity.mdeleteM_ORG.delete(conn, struct);
				conn.commit();
				controlclear();
				_mode = _NORMAL;
				struct.initialize();
			}

		} catch(SQLException e) {
			e.printStackTrace();
			// エラー処理を記述してください。
		}
                //}}user_implement_dev:<controldelete>
		logger.exiting("KA0090010Control"+":USER="+struct.getsUser_ID(),"controldelete");

		return;
	}

	/**
	 * 閉じるボタン押下時に実行される処理です。
	 *
	 */
	public void controlclose() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KA0090");
		logger.entering("KA0090010Control"+":USER="+struct.getsUser_ID(),"controlclose");
			//{{user_implement_dev:<controlclose>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlclose>
		logger.exiting("KA0090010Control"+":USER="+struct.getsUser_ID(),"controlclose");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KA0090");
		logger.entering("KA0090010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("KA0090010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KA0090");
		logger.entering("KA0090010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
			// TODO: ユーザ定義のコードを記述してください
			// クリア処理
			controlclear();

			// モード設定
			_mode = _NORMAL;

// add 標準G ↓
			// 画面遷移の呼び出しだったら、Structに画面遷移キーを設定してcontrolselect()を呼び出す



			if ( isScreenMove()== true ) {


				struct.setORG_CD( _orgCd );



				controlselect();
			}
// add 標準G ↑

                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("KA0090010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * イベントハンドラの前処理です。
	 *
	 * @param buttun ボタン名
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KA0090");
		logger.entering("KA0090010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			// TODO: ユーザ定義のコードを記述してください
			// コンボボックス部品のデータのセットはここに記述してください。
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("KA0090010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("clear") ) {
				controlclear();
			} else if( button.equals("delete") ) {
				controldelete();
			} else if( button.equals("close") ) {
				controlclose();
			} else if( button.equals("initial") ) {
				controlINITIAL();
			} else if( button.equals("reload") ) {
				controlRELOAD();
			}
		//{{user_implement_dev:<control_eventHandller>
			// TODO: ユーザ定義のコードを記述してください
//		ソース内にまだAlarmMessageExceptionが残っている場合は、以下の行のコメントを外してAlarmMessageExceptionを始末する。
//		} catch(AlarmMessageException ame){
//			ExpjException ee = new ExpjException(ame, (ExpjMessageList)((Object)ame.getMessages()));
//			throw ee;
                //}}user_implement_dev:<control_eventHandller>
		} catch( BusinessLockException ble ) {
			// 枠メッセージ出力依頼作成
			setNewDataFlg(false);
		} catch( ResourceBusyException rbe ) {
			ExpjException ee = new ExpjException(rbe, "ZZ01105");
			throw ee;
		} catch( FoundationException e ) {
//			e.printStackTrace();
//			throw new FoundationException("KA0090010Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<createDefaultCSV>
		} catch( FoundationException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KA0090010-E999","CSVの出力処理"));
			throw new FoundationException("KA0090010Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KA0090010-E999","システム日付の取得処理"));
				throw new FoundationException("KA0090010Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KA0090010-E999","コントロールのイベント処理"));
			throw new FoundationException("KA0090010Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected KA0090010Entity entity;
	protected KA0090010Struct struct;
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

		entity = new KA0090010Entity();
		struct = new KA0090010Struct();

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
	 * KA0090010クラスの標準コンストラクタ
	 */
	public KA0090010Control() throws BusinessProcessException, FoundationException
	{
		initialize();

		//conn = connect();
		//{{user_implement_code_constractor
			// TODO: ここに初期処理を記述してください
			_mode = _NORMAL;
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
			// TODO: インスタンス消滅時に実行する処理を記述してください
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
				KA0090010Struct key = (KA0090010Struct)keyList.get(j);
				// メッセージキーを作成する
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("h_RESULT") && key.geth_RESULT() != null) {
					msgKey.setKeyValue("h_RESULT", key.geth_RESULT());
				}
				if(msgKeyType.containsKeyColumn("k_MODE") && key.getk_MODE() != null) {
					msgKey.setKeyValue("k_MODE", key.getk_MODE());
				}
				if(msgKeyType.containsKeyColumn("h_ORG_CD") && key.geth_ORG_CD() != null) {
					msgKey.setKeyValue("h_ORG_CD", key.geth_ORG_CD());
				}
				if(msgKeyType.containsKeyColumn("SYS_COMPANY_CD") && key.getSYS_COMPANY_CD() != null) {
					msgKey.setKeyValue("SYS_COMPANY_CD", key.getSYS_COMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("ORG_CD") && key.getORG_CD() != null) {
					msgKey.setKeyValue("ORG_CD", key.getORG_CD());
				}
				if(msgKeyType.containsKeyColumn("ORG_NAME") && key.getORG_NAME() != null) {
					msgKey.setKeyValue("ORG_NAME", key.getORG_NAME());
				}
				if(msgKeyType.containsKeyColumn("ORG_ANAME") && key.getORG_ANAME() != null) {
					msgKey.setKeyValue("ORG_ANAME", key.getORG_ANAME());
				}
				if(msgKeyType.containsKeyColumn("ORG_KNAME") && key.getORG_KNAME() != null) {
					msgKey.setKeyValue("ORG_KNAME", key.getORG_KNAME());
				}
				if(msgKeyType.containsKeyColumn("ORG_ENAME") && key.getORG_ENAME() != null) {
					msgKey.setKeyValue("ORG_ENAME", key.getORG_ENAME());
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
				if(msgKeyType.containsKeyColumn("h_MODIFY_COUNT") && key.geth_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("h_MODIFY_COUNT", key.geth_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("CUST_CD") && key.getCUST_CD() != null) {
					msgKey.setKeyValue("CUST_CD", key.getCUST_CD());
				}
				if(msgKeyType.containsKeyColumn("BILL_ADDRESSEE_CD") && key.getBILL_ADDRESSEE_CD() != null) {
					msgKey.setKeyValue("BILL_ADDRESSEE_CD", key.getBILL_ADDRESSEE_CD());
				}
				if(msgKeyType.containsKeyColumn("SLIP_TYP") && key.getSLIP_TYP() != null) {
					msgKey.setKeyValue("SLIP_TYP", key.getSLIP_TYP());
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
					KA0090010Struct key = new KA0090010Struct();
					if(msgKeyType.containsKeyColumn("h_RESULT")) {
						key.seth_RESULT(msgKey.getKeyValue("h_RESULT"));
					}
					if(msgKeyType.containsKeyColumn("k_MODE")) {
						key.setk_MODE(msgKey.getKeyValue("k_MODE"));
					}
					if(msgKeyType.containsKeyColumn("h_ORG_CD")) {
						key.seth_ORG_CD(msgKey.getKeyValue("h_ORG_CD"));
					}
					if(msgKeyType.containsKeyColumn("SYS_COMPANY_CD")) {
						key.setSYS_COMPANY_CD(msgKey.getKeyValue("SYS_COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("ORG_CD")) {
						key.setORG_CD(msgKey.getKeyValue("ORG_CD"));
					}
					if(msgKeyType.containsKeyColumn("ORG_NAME")) {
						key.setORG_NAME(msgKey.getKeyValue("ORG_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ORG_ANAME")) {
						key.setORG_ANAME(msgKey.getKeyValue("ORG_ANAME"));
					}
					if(msgKeyType.containsKeyColumn("ORG_KNAME")) {
						key.setORG_KNAME(msgKey.getKeyValue("ORG_KNAME"));
					}
					if(msgKeyType.containsKeyColumn("ORG_ENAME")) {
						key.setORG_ENAME(msgKey.getKeyValue("ORG_ENAME"));
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
					if(msgKeyType.containsKeyColumn("h_MODIFY_COUNT")) {
						key.seth_MODIFY_COUNT(msgKey.getKeyValue("h_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("CUST_CD")) {
						key.setCUST_CD(msgKey.getKeyValue("CUST_CD"));
					}
					if(msgKeyType.containsKeyColumn("BILL_ADDRESSEE_CD")) {
						key.setBILL_ADDRESSEE_CD(msgKey.getKeyValue("BILL_ADDRESSEE_CD"));
					}
					if(msgKeyType.containsKeyColumn("SLIP_TYP")) {
						key.setSLIP_TYP(msgKey.getKeyValue("SLIP_TYP"));
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
