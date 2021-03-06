/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KA0030/src/com/nec/jp/orteus/metamorBase/KA0030/KA0030010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.KA0030;

import com.nec.jp.orteus.metamorBase.KA0030.*;
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

public class KA0030010Control
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
	public KA0030010Struct getListvalue(int x) { return (KA0030010Struct)(this.list.get(x)); }	// リストの値を返します。
	public KA0030010Struct getStruct() { return this.struct; }	// Structを返します。
	public KA0030010Struct createStruct() { return new KA0030010Struct(); }	// 新しいStructを作って返します。
	public void setStruct(Object structname) { this.struct.setStruct((KA0030010Struct)structname); }	// Structをセットします。
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
         * 画面遷移キー(顧客コード)
         */
	private String _custCd;

        /**
         * 画面遷移キー(顧客コード)設定
         * @param cd 顧客コード
         */
	protected void setCustCd(String cd){ _custCd = cd; };

        /**
         * 画面遷移キー(顧客コード)取得
         * @return 顧客コード
         */
	protected String getCustCd(){ return _custCd; };

        /**
         * 画面遷移キー(顧客品目番号)
         */
	private String _custItemCd;

        /**
         * 画面遷移キー(顧客品目番号)設定
         * @param cd 顧客品目番号
         */
	protected void setCustItemCd(String cd){ _custItemCd = cd; };

        /**
         * 画面遷移キー(顧客品目番号)取得
         * @return 顧客品目番号
         */
	protected String getCustItemCd(){ return _custItemCd; };
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
	//sww追加20040728開始
	/**
	 * コンボボックスの値を元に表示文字列を取得します。
	 * @param cs コンボボックスストラクトオブジェクト
	 * @param val コンボボックスの値
	 * @return コンボボックスの表示用データ文字列
	 */
	private String getComboData(ComboStruct cs, String val) {
		List valList = cs.getValList();
		List explanList = cs.getExplanList();
		for (int i = 0; i < valList.size(); i++) {
			String listVal = (String) valList.get(i);
			if (val.equals(listVal)) {
				return (String) explanList.get(i);
			}
		}

		return null;
	}
	/**
	 * コンボボックスの中身を取得します。
	 *
	 * @param data データの箱
	 */
	 private void setComboData(KA0030010Struct data)throws BusinessProcessException, FoundationException
	 {

	 	try {
			//sww修正20040728開始
			// コンボボックスデータを部品より取得
			ComboBox cb = new ComboBox(conn, sysUSER_CD);			
			ComboStruct _depoTypStruct = cb.getData("DEPO_TYP");			
			// データ設定
			data.setList_DEPO_TYP_val(_depoTypStruct.getValList());
			data.setList_DEPO_TYP_name(_depoTypStruct.getExplanList());

			cb.setConnection(null);
			//sww修正20040728終了		
            } catch (SQLException e) {
            	throw new ExpjException(e);
            } catch (ComboException e) {
                throw new ExpjException(e);
		}
	 }
		
	//sww追加20040728終了

		
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
//	private MessageConfig _msgConfig = null;

	/** システムログ */
	SystemLog _sysLog = sysLog;

	/** メッセージ */
	//MessageStruct _msgStruct = msgStruct;

//-----------------------------------------------------------------------------
	/** 画面共通定義取得クラス */
	ScreenParam _scParam = sp;

	//------------------------------------------------------------------------
	/** 自社情報の取得 */
	private void companyData() throws SQLException, FoundationException
	{
		List listCompanyInfo;
		listCompanyInfo = entity.mgetCompanyInfo.read(conn, struct);

		if(listCompanyInfo == null || listCompanyInfo.size() != 1){
			//自社情報が無い/複数件
			setErrorMessage("KA00060");

		}else{
			struct.setstrCOMPANY_CD(((KA0030010Struct)listCompanyInfo.get(0)).getstrCOMPANY_CD());
		}
		listCompanyInfo = null;
		return;
	}
	//------------------------------------------------------------------------
	/**
	 * 更新／削除可能かチェックする<BR>
	 * １．検索結果が存在すること（検索時と同じ条件で読み込み）
	 * ２．更新カウンタが検索時と同一であること
	 *
	 * @param KA0030010Struct Struct
	 * @return boolean true:更新削除可能 false:更新削除不可
	 */
	private boolean isUpdatable(KA0030010Struct chk) throws FoundationException,SQLException
	{


		List listCheck = null;

		//読み込み

		listCheck = entity.mselect.read(conn,chk);

		if(listCheck == null || listCheck.size() != 1){
			//読み込み失敗（処理中にステータスが変化したか、削除された場合）
			//エラー処理
                        setErrorMessage("ZZ06001");
                        setErrorMessage("ZZ01006","M_ITEM_SPEC.CUST_CD:" + chk.getCUST_CD());
                        setErrorMessage("ZZ01006","M_ITEM_SPEC.CUST_ITEM_CD:" + chk.getCUST_ITEM_CD());

			return false;
		}
		KA0030010Struct rst = (KA0030010Struct)listCheck.get(0);
		//更新カウンタチェック
		// 退避させていたカウンタと、ここで読み込んだ現在値を比較する。


		double bef_mod = Double.parseDouble((String)struct.geth_MODIFY_COUNT());
		double aft_mod = Double.parseDouble(rst.geth_MODIFY_COUNT());
		if(bef_mod != aft_mod){
			//更新カウンタが変化した



			//エラー処理
			setErrorMessage("AC50802");
                        setErrorMessage("ZZ01006","M_ITEM_SPEC.CUST_CD:" + chk.getCUST_CD());
                        setErrorMessage("ZZ01006","M_ITEM_SPEC.CUST_ITEM_CD:" + chk.getCUST_ITEM_CD());
			return false;
		}

		return true;
	}

	/**
	 * DB登録/更新時共通 設定内容チェック
	 *
	 * @return  true:OK / false:NG
	 */
	private boolean isValidContents()throws FoundationException, SQLException
	{
		boolean result = true;


		//品番存在チェック
		List listM_ITEM = entity.mcheckM_ITEM.read(conn, struct);
		if ( listM_ITEM == null || listM_ITEM.size() == 0 ) {
			result =false;
			setErrorMessage("AL50004");
                        setErrorMessage("ZZ01006","M_ITEM_SPEC.CUST_CD:" + struct.getCUST_CD());
                        setErrorMessage("ZZ01006","M_ITEM_SPEC.CUST_ITEM_CD:" + struct.getCUST_ITEM_CD());
		}else{
			struct.setMRP_ODR_TYP(((KA0030010Struct)listM_ITEM.get(0)).getMRP_ODR_TYP());
			/* 疑似品目の場合 */
			if( 8 == Integer.parseInt(struct.getMRP_ODR_TYP()) ){
				result = false;
				setErrorMessage("KA00117");
        	                setErrorMessage("ZZ01006","M_ITEM_SPEC.CUST_CD:" + struct.getCUST_CD());
                	        setErrorMessage("ZZ01006","M_ITEM_SPEC.CUST_ITEM_CD:" + struct.getCUST_ITEM_CD());
			}
		}
		
		//顧客コード存在チェック
		if(struct.getCUST_CD() != null && !"".equals(struct.getCUST_CD())){
			boolean blnChkM_CUST = entity.mcheckM_CUST.check(conn, struct);
			if (blnChkM_CUST == false) {
				result =false;
				setErrorMessage("KA00032");
        	                setErrorMessage("ZZ01006","M_ITEM_SPEC.CUST_CD:" + struct.getCUST_CD());
                	        setErrorMessage("ZZ01006","M_ITEM_SPEC.CUST_ITEM_CD:" + struct.getCUST_ITEM_CD());
			}
		}

		//売上計上部門存在チェック
		if(struct.getSALES_DEPT_CD() != null && !"".equals(struct.getSALES_DEPT_CD())){
			boolean blnChkM_ORG = entity.mcheckM_ORG.check(conn, struct);
			if (blnChkM_ORG == false) {
			    result =false;
			    setErrorMessage("KA00058");
        	            setErrorMessage("ZZ01006","M_ITEM_SPEC.CUST_CD:" + struct.getCUST_CD());
                	    setErrorMessage("ZZ01006","M_ITEM_SPEC.CUST_ITEM_CD:" + struct.getCUST_ITEM_CD());
			}
		}

		// 消費税コード存在確認
		if(struct.getTAX_CD() != null && struct.getTAX_CD().equals("") == false){
			List list1 = entity.mselectM_TAX.read(conn, struct);
			if (list1 == null || list1.size() == 0) {

				setErrorMessage("AA01001");
        	                setErrorMessage("ZZ01006","M_ITEM_SPEC.CUST_CD:" + struct.getCUST_CD());
                	        setErrorMessage("ZZ01006","M_ITEM_SPEC.CUST_ITEM_CD:" + struct.getCUST_ITEM_CD());
				result = false;
			}
		}


		return result;
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
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KA0030");
		logger.entering("KA0030010Control"+":USER="+struct.getsUser_ID(),"controlselect");
			//{{user_implement_dev:<controlselect>
			// TODO: ユーザ定義のコードを記述してください
		try {
			boolean ok_flg = true;
			boolean result = false;		// チェック結果格納

			// 画面モード取得
			String strKMode="";
			strKMode = (String)struct.getk_MODE();

			// 会社コード取得
			companyData();

			if("INSERT".equals(strKMode)){
				//登録の時チェック
				//製品仕様情報重複チェック
				result = entity.mselect.check(conn, struct);
				if (result == true) {

					ok_flg =false;
					setErrorMessage("ZZ01102");
        		                setErrorMessage("ZZ01006","M_ITEM_SPEC.CUST_CD:" + struct.getCUST_CD());
                		        setErrorMessage("ZZ01006","M_ITEM_SPEC.CUST_ITEM_CD:" + struct.getCUST_ITEM_CD());
				}else if(!isValidContents()){
					// 入力内容チェック
					ok_flg = false;
				}

			}else if("UPDATE".equals(strKMode)){
				//更新の時チェック

				// 更新確認
				KA0030010Struct st = (KA0030010Struct)list.get(0);
				if(isUpdatable(st) == false){
					//更新できない状態
					//エラー処理

					ok_flg =false;
				}else if(!isValidContents()){
					// 入力内容チェック
					ok_flg = false;
				}
			}else if("DELETE".equals(strKMode)){
				//削除の時チェック

				// 製品仕様情報の存在確認
				List w = entity.mselect.read(conn, struct);
				if (w.size() == 0) {
					ok_flg =false;
					setErrorMessage("ZZ06001");
        		                setErrorMessage("ZZ01006","M_ITEM_SPEC.CUST_CD:" + struct.getCUST_CD());
                		        setErrorMessage("ZZ01006","M_ITEM_SPEC.CUST_ITEM_CD:" + struct.getCUST_ITEM_CD());
				}

				//指定製品の受注処理状況チェック
				boolean blnChkODR = entity.mcheckODR.check(conn, struct);
				if (blnChkODR == true) {
					ok_flg =false;
					setErrorMessage("KA00059");
        		                setErrorMessage("ZZ01006","M_ITEM_SPEC.CUST_CD:" + struct.getCUST_CD());
                		        setErrorMessage("ZZ01006","M_ITEM_SPEC.CUST_ITEM_CD:" + struct.getCUST_ITEM_CD());
				}

			}else{

				list = entity.mselect.read(conn, struct);

				if (list.size() != 0) {
					struct.copy((KA0030010Struct)list.get(0));
					_mode = _SELECT;
//System.out.println("会社" + struct.getstrCOMPANY_CD());
//System.out.println("得意先コード" + struct.getCUST_CD());
//System.out.println("得意品目番号" + struct.getCUST_ITEM_CD());
//System.out.println("品目番号" + struct.getITEM_CD());
//System.out.println("得意先品目名称" + struct.getCUST_ITEM_NAME());
//System.out.println("売上計上部門" + struct.getSALES_DEPT_CD());
//System.out.println("特記事項１" + struct.getNOTE1());
//System.out.println("特記事項２" + struct.getNOTE2());
//System.out.println("税コード" + struct.getTAX_CD());
//System.out.println("更新数" + struct.geth_MODIFY_COUNT());					
//System.out.println("預託区分" + struct.getDEPO_TYP());					
				} else {
					ok_flg =false;
					setErrorMessage("ZZ06001");
        		                setErrorMessage("ZZ01006","M_ITEM_SPEC.CUST_CD:" + struct.getCUST_CD());
                		        setErrorMessage("ZZ01006","M_ITEM_SPEC.CUST_ITEM_CD:" + struct.getCUST_ITEM_CD());

				}
			}
			setComboData(struct);
			
			// 読込ステータス設定
			setReadStatus(NORMAL);

			if(!"RESELECT".equals(strKMode)){
				//警告以外のエラーが何もない場合OKにする
				if(ok_flg == true){

//					struct.seth_RESULT("OK");
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
		logger.exiting("KA0030010Control"+":USER="+struct.getsUser_ID(),"controlselect");

		return;
	}

	/**
	 * 登録ボタン押下時に実行される処理です。
	 *
	 */
	public void controlinsert() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KA0030");
		logger.entering("KA0030010Control"+":USER="+struct.getsUser_ID(),"controlinsert");
			//{{user_implement_dev:<controlinsert>
			// TODO: ユーザ定義のコードを記述してください
		try {

			boolean result = false;		// チェック結果格納

			// 会社コード取得
			companyData();

			// 製品仕様情報 重複チェック
			result = entity.mselect.check(conn, struct);
			if (result == true) {

				setErrorMessage("ZZ01102");
        	                setErrorMessage("ZZ01006","M_ITEM_SPEC.CUST_CD:" + struct.getCUST_CD());
                	        setErrorMessage("ZZ01006","M_ITEM_SPEC.CUST_ITEM_CD:" + struct.getCUST_ITEM_CD());
			} else{
				// 入力内容チェック
				isValidContents();

			}

			// エラーが発生していない場合、登録処理実施
			if(msgStruct.sizeError() <= 0){




				//登録処理
				entity.minsertM_ITEM_SPEC.create(conn, struct);
				
				//コミット
				conn.commit();
				


				// 検索
				struct.setk_MODE("RESELECT");
				controlselect();


			}
			setComboData(struct);			

		} catch(SQLException e) {
			// エラーメッセージ作成
			throw new ExpjException(e);
		} finally {
			if (conn != null) {
				conn.rollback();
			}
		}
                //}}user_implement_dev:<controlinsert>
		logger.exiting("KA0030010Control"+":USER="+struct.getsUser_ID(),"controlinsert");

		return;
	}

	/**
	 * 更新ボタン押下時に実行される処理です。
	 *
	 */
	public void controlupdate() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KA0030");
		logger.entering("KA0030010Control"+":USER="+struct.getsUser_ID(),"controlupdate");
			//{{user_implement_dev:<controlupdate>
			// TODO: ユーザ定義のコードを記述してください
		try {
			conn.beginTransWeb();		// トランザクション開始

			// 会社コード取得
			companyData();

			//更新の時チェック

			// 更新確認
			KA0030010Struct st = (KA0030010Struct)list.get(0);
			if(isUpdatable(st) == false){
				//更新できない状態
				//エラー処理

			} else{

				// 入力内容チェック
				isValidContents();
			}
			// エラーが発生していない場合、更新処理実施
			if(msgStruct.sizeError() <= 0)
			{

				entity.mupdateM_ITEM_SPEC.update(conn, struct);
				conn.commit();

				// 検索
				struct.setk_MODE("RESELECT");
				controlselect();
			}
			setComboData(struct);
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
		logger.exiting("KA0030010Control"+":USER="+struct.getsUser_ID(),"controlupdate");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlclear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KA0030");
		logger.entering("KA0030010Control"+":USER="+struct.getsUser_ID(),"controlclear");
			//{{user_implement_dev:<controlclear>
			// TODO: ユーザ定義のコードを記述してください
		try{
//			sysLog.finest_d("Control：controlclear", struct.getsUser_ID());

			struct.initialize();
			setComboData(struct);
			// モード設定
			_mode = _NORMAL;

			// 読込ステータス設定
			setReadStatus(INITIAL);

		}catch(Exception e){
			throw new ExpjException(e);
		}
                //}}user_implement_dev:<controlclear>
		logger.exiting("KA0030010Control"+":USER="+struct.getsUser_ID(),"controlclear");

		return;
	}

	/**
	 * 削除ボタン押下時に実行される処理です。
	 *
	 */
	public void controldelete() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KA0030");
		logger.entering("KA0030010Control"+":USER="+struct.getsUser_ID(),"controldelete");
			//{{user_implement_dev:<controldelete>
			// TODO: ユーザ定義のコードを記述してください
		try {
			conn.beginTransWeb();

			if(isUpdatable(struct) == false){
				//削除できない状態
				//エラー処理

			}

			// 製品仕様情報の存在確認
			List w = entity.mselect.read(conn, struct);
			if (w.size() == 0) {
				setErrorMessage("ZZ06001");
        	                setErrorMessage("ZZ01006","M_ITEM_SPEC.CUST_CD:" + struct.getCUST_CD());
                	        setErrorMessage("ZZ01006","M_ITEM_SPEC.CUST_ITEM_CD:" + struct.getCUST_ITEM_CD());
			}

			//指定製品の受注処理状況チェック
			boolean blnChkODR = entity.mcheckODR.check(conn, struct);
			if (blnChkODR == true) {
				setErrorMessage("KA00059");
        	                setErrorMessage("ZZ01006","M_ITEM_SPEC.CUST_CD:" + struct.getCUST_CD());
                	        setErrorMessage("ZZ01006","M_ITEM_SPEC.CUST_ITEM_CD:" + struct.getCUST_ITEM_CD());
			}
			
			// 販売所要計画の存在チェック
			boolean b = entity.mcheckT_SALES_PLAN.check(conn,struct);
			if (b == true) {
          setErrorMessage("KA00123");
          setErrorMessage("ZZ01006","M_ITEM_SPEC.CUST_CD:" + struct.getCUST_CD());
          setErrorMessage("ZZ01006","M_ITEM_SPEC.CUST_ITEM_CD:" + struct.getCUST_ITEM_CD());
			}
			
			// エラーが発生していない場合、削除処理実施
			if(msgStruct.sizeError() <= 0){

				entity.mremoveM_ITEM_SPEC.delete(conn, struct);

				controlclear();
				//コミット
				conn.commit();

				_mode = _NORMAL;
			}

		} catch(SQLException e) {
			e.printStackTrace();
			// エラー処理を記述してください。
		}
                //}}user_implement_dev:<controldelete>
		logger.exiting("KA0030010Control"+":USER="+struct.getsUser_ID(),"controldelete");

		return;
	}

	/**
	 * 閉じるボタン押下時に実行される処理です。
	 *
	 */
	public void controlclose() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KA0030");
		logger.entering("KA0030010Control"+":USER="+struct.getsUser_ID(),"controlclose");
			//{{user_implement_dev:<controlclose>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlclose>
		logger.exiting("KA0030010Control"+":USER="+struct.getsUser_ID(),"controlclose");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KA0030");
		logger.entering("KA0030010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("KA0030010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KA0030");
		logger.entering("KA0030010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
			// TODO: ユーザ定義のコードを記述してください

			
			
			// クリア処理
			controlclear();

			// モード設定
			_mode = _NORMAL;

// add 標準G ↓
			// 画面遷移の呼び出しだったら、Structに画面遷移キーを設定してcontrolselect()を呼び出す



			if ( isScreenMove()== true ) {


				struct.setCUST_CD( _custCd );
				struct.setCUST_ITEM_CD( _custItemCd );
				controlselect();
			}
// add 標準G ↑

                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("KA0030010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * イベントハンドラの前処理です。
	 *
	 * @param buttun ボタン名
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KA0030");
		logger.entering("KA0030010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
		logger.exiting("KA0030010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
		//使用用途コードのリスト用データ取得
		try{
			List PURPOSEList = new ArrayList();
			List PURPOSENameList = new ArrayList();
			List PURPOSEValueList = new ArrayList();

			PURPOSEList = entity.mselectSYS_CLASS_CODE.read(conn, struct);

			for(int i = 0; i < PURPOSEList.size(); i++) {
				PURPOSENameList.add(((KA0030010Struct)PURPOSEList.get(i)).getPURPOSE_name());
				PURPOSEValueList.add(((KA0030010Struct)PURPOSEList.get(i)).getPURPOSE_val());
			}
			struct.setList_PURPOSE_name(PURPOSENameList);
			struct.setList_PURPOSE_val(PURPOSEValueList);
			
			//sww追加20040728開始
			setComboData(struct);			
			//struct.setList_DEPO_TYP_val(_depoTypStruct.getValList());
			//struct.setList_DEPO_TYP_name(_depoTypStruct.getExplanList());
			//sww追加20040728終了			
		}catch(SQLException e){
			throw new ExpjException(e);
		}
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
//			throw new FoundationException("KA0030010Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KA0030010-E999","CSVの出力処理"));
			throw new FoundationException("KA0030010Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KA0030010-E999","システム日付の取得処理"));
				throw new FoundationException("KA0030010Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KA0030010-E999","コントロールのイベント処理"));
			throw new FoundationException("KA0030010Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected KA0030010Entity entity;
	protected KA0030010Struct struct;
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

		entity = new KA0030010Entity();
		struct = new KA0030010Struct();

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
	 * KA0030010クラスの標準コンストラクタ
	 */
	public KA0030010Control() throws BusinessProcessException, FoundationException
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
				KA0030010Struct key = (KA0030010Struct)keyList.get(j);
				// メッセージキーを作成する
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("h_RESULT") && key.geth_RESULT() != null) {
					msgKey.setKeyValue("h_RESULT", key.geth_RESULT());
				}
				if(msgKeyType.containsKeyColumn("k_MODE") && key.getk_MODE() != null) {
					msgKey.setKeyValue("k_MODE", key.getk_MODE());
				}
				if(msgKeyType.containsKeyColumn("DEPO_TYP_name") && key.getDEPO_TYP_name() != null) {
					msgKey.setKeyValue("DEPO_TYP_name", key.getDEPO_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("DEPO_TYP_val") && key.getDEPO_TYP_val() != null) {
					msgKey.setKeyValue("DEPO_TYP_val", key.getDEPO_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("h_DEPO_TYP") && key.geth_DEPO_TYP() != null) {
					msgKey.setKeyValue("h_DEPO_TYP", key.geth_DEPO_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("strCOMPANY_CD") && key.getstrCOMPANY_CD() != null) {
					msgKey.setKeyValue("strCOMPANY_CD", key.getstrCOMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("CUST_CD") && key.getCUST_CD() != null) {
					msgKey.setKeyValue("CUST_CD", key.getCUST_CD());
				}
				if(msgKeyType.containsKeyColumn("CUST_ITEM_CD") && key.getCUST_ITEM_CD() != null) {
					msgKey.setKeyValue("CUST_ITEM_CD", key.getCUST_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("CUST_ITEM_NAME") && key.getCUST_ITEM_NAME() != null) {
					msgKey.setKeyValue("CUST_ITEM_NAME", key.getCUST_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("SALES_DEPT_CD") && key.getSALES_DEPT_CD() != null) {
					msgKey.setKeyValue("SALES_DEPT_CD", key.getSALES_DEPT_CD());
				}
				if(msgKeyType.containsKeyColumn("NOTE1") && key.getNOTE1() != null) {
					msgKey.setKeyValue("NOTE1", key.getNOTE1());
				}
				if(msgKeyType.containsKeyColumn("NOTE2") && key.getNOTE2() != null) {
					msgKey.setKeyValue("NOTE2", key.getNOTE2());
				}
				if(msgKeyType.containsKeyColumn("DEPO_TYP") && key.getDEPO_TYP() != null) {
					msgKey.setKeyValue("DEPO_TYP", key.getDEPO_TYP());
				}
				if(msgKeyType.containsKeyColumn("TAX_CD") && key.getTAX_CD() != null) {
					msgKey.setKeyValue("TAX_CD", key.getTAX_CD());
				}
				if(msgKeyType.containsKeyColumn("h_MODIFY_COUNT") && key.geth_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("h_MODIFY_COUNT", key.geth_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("CUST_NAME") && key.getCUST_NAME() != null) {
					msgKey.setKeyValue("CUST_NAME", key.getCUST_NAME());
				}
				if(msgKeyType.containsKeyColumn("ITEM_NAME") && key.getITEM_NAME() != null) {
					msgKey.setKeyValue("ITEM_NAME", key.getITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("ORG_NAME") && key.getORG_NAME() != null) {
					msgKey.setKeyValue("ORG_NAME", key.getORG_NAME());
				}
				if(msgKeyType.containsKeyColumn("TAX_NAME") && key.getTAX_NAME() != null) {
					msgKey.setKeyValue("TAX_NAME", key.getTAX_NAME());
				}
				if(msgKeyType.containsKeyColumn("ch_ITEM_CD") && key.getch_ITEM_CD() != null) {
					msgKey.setKeyValue("ch_ITEM_CD", key.getch_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP") && key.getMRP_ODR_TYP() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP", key.getMRP_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("chM_ORG_CD") && key.getchM_ORG_CD() != null) {
					msgKey.setKeyValue("chM_ORG_CD", key.getchM_ORG_CD());
				}
				if(msgKeyType.containsKeyColumn("chITEM_CD") && key.getchITEM_CD() != null) {
					msgKey.setKeyValue("chITEM_CD", key.getchITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("chCUST_CD") && key.getchCUST_CD() != null) {
					msgKey.setKeyValue("chCUST_CD", key.getchCUST_CD());
				}
				if(msgKeyType.containsKeyColumn("PURPOSE_val") && key.getPURPOSE_val() != null) {
					msgKey.setKeyValue("PURPOSE_val", key.getPURPOSE_val());
				}
				if(msgKeyType.containsKeyColumn("PURPOSE_name") && key.getPURPOSE_name() != null) {
					msgKey.setKeyValue("PURPOSE_name", key.getPURPOSE_name());
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
					KA0030010Struct key = new KA0030010Struct();
					if(msgKeyType.containsKeyColumn("h_RESULT")) {
						key.seth_RESULT(msgKey.getKeyValue("h_RESULT"));
					}
					if(msgKeyType.containsKeyColumn("k_MODE")) {
						key.setk_MODE(msgKey.getKeyValue("k_MODE"));
					}
					if(msgKeyType.containsKeyColumn("DEPO_TYP_name")) {
						key.setDEPO_TYP_name(msgKey.getKeyValue("DEPO_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("DEPO_TYP_val")) {
						key.setDEPO_TYP_val(msgKey.getKeyValue("DEPO_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("h_DEPO_TYP")) {
						key.seth_DEPO_TYP(new Double(msgKey.getKeyValue("h_DEPO_TYP")));
					}
					if(msgKeyType.containsKeyColumn("strCOMPANY_CD")) {
						key.setstrCOMPANY_CD(msgKey.getKeyValue("strCOMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("CUST_CD")) {
						key.setCUST_CD(msgKey.getKeyValue("CUST_CD"));
					}
					if(msgKeyType.containsKeyColumn("CUST_ITEM_CD")) {
						key.setCUST_ITEM_CD(msgKey.getKeyValue("CUST_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("CUST_ITEM_NAME")) {
						key.setCUST_ITEM_NAME(msgKey.getKeyValue("CUST_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("SALES_DEPT_CD")) {
						key.setSALES_DEPT_CD(msgKey.getKeyValue("SALES_DEPT_CD"));
					}
					if(msgKeyType.containsKeyColumn("NOTE1")) {
						key.setNOTE1(msgKey.getKeyValue("NOTE1"));
					}
					if(msgKeyType.containsKeyColumn("NOTE2")) {
						key.setNOTE2(msgKey.getKeyValue("NOTE2"));
					}
					if(msgKeyType.containsKeyColumn("DEPO_TYP")) {
						key.setDEPO_TYP(msgKey.getKeyValue("DEPO_TYP"));
					}
					if(msgKeyType.containsKeyColumn("TAX_CD")) {
						key.setTAX_CD(msgKey.getKeyValue("TAX_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_MODIFY_COUNT")) {
						key.seth_MODIFY_COUNT(msgKey.getKeyValue("h_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("CUST_NAME")) {
						key.setCUST_NAME(msgKey.getKeyValue("CUST_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_NAME")) {
						key.setITEM_NAME(msgKey.getKeyValue("ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ORG_NAME")) {
						key.setORG_NAME(msgKey.getKeyValue("ORG_NAME"));
					}
					if(msgKeyType.containsKeyColumn("TAX_NAME")) {
						key.setTAX_NAME(msgKey.getKeyValue("TAX_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ch_ITEM_CD")) {
						key.setch_ITEM_CD(msgKey.getKeyValue("ch_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP")) {
						key.setMRP_ODR_TYP(msgKey.getKeyValue("MRP_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("chM_ORG_CD")) {
						key.setchM_ORG_CD(msgKey.getKeyValue("chM_ORG_CD"));
					}
					if(msgKeyType.containsKeyColumn("chITEM_CD")) {
						key.setchITEM_CD(msgKey.getKeyValue("chITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("chCUST_CD")) {
						key.setchCUST_CD(msgKey.getKeyValue("chCUST_CD"));
					}
					if(msgKeyType.containsKeyColumn("PURPOSE_val")) {
						key.setPURPOSE_val(msgKey.getKeyValue("PURPOSE_val"));
					}
					if(msgKeyType.containsKeyColumn("PURPOSE_name")) {
						key.setPURPOSE_name(msgKey.getKeyValue("PURPOSE_name"));
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
